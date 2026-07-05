  __export(xYo, {
    mcpLogoutHandler: () => mcpLogoutHandler,
    mcpLoginHandler: () => mcpLoginHandler
  });
  async function xSc(e, t) {
    await G5({
      hasDynamicMcpConfig: false
    });
    let {
      servers: n,
      pendingProjectServers: r,
      rejectedProjectServers: o
    } = await getAllMcpConfigs({
      includePendingProjectServers: true,
      includeRejectedProjectServers: true
    });
    let s = n[e];
    if (!s) {
      await ou(t, "not_found");
      let i = Object.keys(n).filter(a => !r.vZc(a) && !o.vZc(a));
      return Ih(afr(e, i, r.size > 0));
    }
    if (o.vZc(e)) {
      await ou(t, "rejected");
      return Ih(`"${e}" is from .mcp.json and was rejected. Run \`claude mcp reset-project-choices\` to review it again.`);
    }
    if (r.vZc(e)) {
      await ou(t, "pending_approval");
      return Ih(`"${e}" is from .mcp.json and awaiting approval. Run \`claude\` in this directory to review it first.`);
    }
    if (s.configError) {
      await ou(t, "config_error");
      return Ih(`"${e}" has a configuration problem: ${s.configError}`);
    }
    return s;
  }
  function kSc(e) {
    if (v4e(e)) {
      return "static_auth_header";
    }
    if (M8(e.url) && isFirstPartyProvider()) {
      if (getClaudeAIOAuthTokens()?.accessToken) {
        return "first_party_auth";
      }
      if (bEe()) {
        return "first_party_design_auth";
      }
    }
    return null;
  }
  function CSc(e, t) {
    return `${e ? "If the browser didn't open, visit:" : "Visit this URL to authorize:"}
  ${TM(t)}

`;
  }
  async function mcpLoginHandler(e, t) {
    await logEventAsync("tengu_mcp_login", {});
    let n = await xSc(e, "cli_mcp_login");
    let r = ZV(e, n);
    switch (r.kind) {
      case "claudeai-proxy":
        {
          let o = aNe(r.config);
          if (!o) {
            await ou("cli_mcp_login", "claudeai_no_auth_url");
            return Ih(`Couldn't build the claude.ai authorization link for "${e}". Make sure you're signed in (\`claude login\`).`);
          }
          if (await logEventAsync("tengu_claudeai_mcp_auth_started", {}), t.browser) {
            process.stdout.write(`Opening browser to authorize "${e}"\u2026
`);
            await Ac(o);
          }
          process.stdout.write(CSc(t.browser, o) + `Once authorized on claude.ai, the connector will be available the next time you start Claude Code.
`);
          await H5t(e);
          await nS("cli_mcp_login");
          return U5();
        }
      case "unsupported-transport":
        await ou("cli_mcp_login", "unsupported_transport");
        return Ih(`"${e}" doesn't support OAuth login \u2014 it's only available for HTTP and SSE servers.`);
      case "anthropic-hosted":
        await ou("cli_mcp_login", "anthropic_hosted_blocked");
        return Ih(r.message);
      case "oauth":
        {
          let o = kSc(r.config);
          if (o === "static_auth_header") {
            await ou("cli_mcp_login", "static_auth_header");
            return Ih(`"${e}" authenticates with the \`Authorization\` header in its configuration, so there's no separate login. Update that header to change its credentials.`);
          }
          if (o === "first_party_auth") {
            await ou("cli_mcp_login", "first_party_auth");
            return Ih(`"${e}" authenticates automatically with your Claude login. Run \`claude login\` if you're not signed in.`);
          }
          if (o === "first_party_design_auth") {
            await ou("cli_mcp_login", "first_party_design_auth");
            return Ih(`"${e}" authenticates automatically with your stored /design-login credential. Run /design-login from an interactive session to re-authorize it.`);
          }
          process.stdout.write(`Starting authentication for "${e}"\u2026
`);
          let s = "Or paste the redirect URL here: ";
          let i = new AbortController();
          let a;
          let l = false;
          let c = setInterval(() => {}, 60000);
          let u = new Promise((d, p) => {
            i.signal.addEventListener("abort", () => p(new p3()), {
              once: true
            });
          });
          u.catch(() => {});
          try {
            await yEe(e, r.config, {
              preserveStepUpState: true
            });
            await Promise.race([u, dQ(e, r.config, d => {
              if (process.stdout.write(CSc(t.browser, d) + `Waiting for authorization\u2026 (^C to cancel)
`), a) {
                a.prompt();
              }
            }, i.signal, {
              skipBrowserOpen: !t.browser,
              onWaitingForCallback: d => {
                if (!process.stdin.isTTY) {
                  l = true;
                  i.abort();
                  return;
                }
                if (!process.stdout.isTTY) {
                  return;
                }
                stopCapturingEarlyInput();
                a = RSc.createInterface({
                  input: process.stdin,
                  output: process.stdout,
                  prompt: s
                });
                a.on("SIGINT", () => i.abort());
                a.on("close", () => i.abort());
                a.on("line", p => {
                  let m = p.trim();
                  if (m && d(m)) {
                    return;
                  }
                  if (m) {
                    process.stdout.write(`That doesn't look like a redirect URL \u2014 paste the full address from your browser's address bar.
`);
                  }
                  a?.prompt();
                });
              }
            })]);
          } catch (d) {
            if (d instanceof p3) {
              if (l) {
                await ou("cli_mcp_login", "no_tty_stdin");
                return Ih(`Couldn't complete authentication for "${e}": stdin isn't a terminal, so authentication can't be completed here. ` + "Re-run in an interactive terminal \u2014 e.g. `ssh -t` \u2014 and paste the redirect URL when prompted.");
              }
              await GB("cli_mcp_login", "cancelled");
              return bR(130);
            }
            await ou("cli_mcp_login", "oauth_flow_threw");
            return Ih(`Couldn't complete authentication for "${e}": ${he(d)}`);
          } finally {
            if (clearInterval(c), a) {
              a.close();
              process.stdout.write(`
`);
            }
          }
          await H5t(e);
          await nS("cli_mcp_login");
          return U5(isMcpServerDisabled(e) ? `Authenticated with "${e}", but it's currently disabled. Enable it in /mcp for its tools to load.` : `Authenticated with "${e}". Its tools are now available in Claude Code.`);
        }
      default:
        {
          let o = r;
        }
    }
  }
  async function mcpLogoutHandler(e) {
    await logEventAsync("tengu_mcp_logout", {});
    let t = await xSc(e, "cli_mcp_logout");
    let n = ZV(e, t);
    switch (n.kind) {
      case "claudeai-proxy":
        await GB("cli_mcp_logout", "claudeai_proxy");
        return U5(`"${e}" is a claude.ai connector \u2014 its credentials live on claude.ai, not this machine. ` + `Disconnect it at ${TM(fEe())}`);
      case "unsupported-transport":
        await ou("cli_mcp_logout", "unsupported_transport");
        return Ih(`"${e}" doesn't use OAuth \u2014 there are no stored credentials to clear.`);
      case "anthropic-hosted":
        await yEe(e, n.config);
        await GB("cli_mcp_logout", "anthropic_hosted");
        return U5(`Cleared local credentials for "${e}". ${n.message}`);
      case "oauth":
        {
          await yEe(e, n.config);
          await nS("cli_mcp_logout");
          let r = kSc(n.config) === null ? Py("mcp login", e) : null;
          let o = r ? ` Run \`${r}\` to authenticate again.` : "";
          return U5(`Signed out of "${e}".${o}`);
        }
      default:
        {
          let r = n;
        }
    }
  }
  var RSc;
  var kYo = __lazy(() => {
    ln();
    Ot();
    Moe();
    Oce();
    D6e();
    l9();
    eA();
    Iw();
    RRt();
    no();
    ky();
    cPe();
    dt();
    EMe();
    Ds();
    SL();
    fYo();
    RSc = require("readline");
  });
  function ASc(e) {
    let t = e.command("mcp").description("Configure and manage MCP servers").configureHelp($Ce()).enablePositionalOptions();
    if (t.command("serve").description("Start the Claude Code MCP server").option("-d, --debug", "Enable debug mode", () => true).option("--verbose", "Override verbose mode setting from config", () => true).action(async ({
      debug: n,
      verbose: r
    }) => {
      let {
        mcpServeHandler: o
      } = await Promise.resolve().then(() => (kBe(), xBe));
      await o({
        debug: n,
        verbose: r
      });
    }), Sbc(t), mJ()) {
      Ebc(t);
    }
    t.command("remove <name>").description("Remove an MCP server").option("-s, --scope <scope>", "Configuration scope (local, user, or project) - if not specified, removes from whichever scope it exists in").action(async (n, r) => {
      let [{
        mcpRemoveHandler: o
      }, {
        createSubcommandRoot: s
      }] = await Promise.all([Promise.resolve().then(() => (kBe(), xBe)), Promise.resolve().then(() => (PE(), IE))]);
      await o(await s(), n, r);
      return U5();
    });
    t.command("list").description("List configured MCP servers. Unapproved .mcp.json servers are shown as \u23F8 Pending approval and not connected to; approved servers are health-checked.").action(async () => {
      let [{
        mcpListHandler: n
      }, {
        createSubcommandRoot: r
      }] = await Promise.all([Promise.resolve().then(() => (kBe(), xBe)), Promise.resolve().then(() => (PE(), IE))]);
      await n(await r());
    });
    t.command("get <name>").description("Get details about an MCP server. Unapproved .mcp.json servers are shown as \u23F8 Pending approval and not connected to; approved servers are health-checked.").action(async n => {
      let [{
        mcpGetHandler: r
      }, {
        createSubcommandRoot: o
      }] = await Promise.all([Promise.resolve().then(() => (kBe(), xBe)), Promise.resolve().then(() => (PE(), IE))]);
      await r(await o(), n);
    });
    t.command("login <name>").description("Authenticate with an MCP server (HTTP, SSE, or claude.ai connector)").option("--no-browser", "Print the authorization URL instead of opening a browser (for SSH/headless sessions \u2014 paste the redirect URL back when prompted)").action(async (n, r) => {
      let {
        mcpLoginHandler: o
      } = await Promise.resolve().then(() => (kYo(), xYo));
      await o(n, r);
    });
    t.command("logout <name>").description("Clear stored OAuth credentials for an MCP server").action(async n => {
      let {
        mcpLogoutHandler: r
      } = await Promise.resolve().then(() => (kYo(), xYo));
      await r(n);
    });
    t.command("add-json <name> <json>").description("Add an MCP server (stdio or SSE) with a JSON string").option("-s, --scope <scope>", "Configuration scope (local, user, or project)", "local").option("--client-secret", "Prompt for OAuth client secret (or set MCP_CLIENT_SECRET env var)").action(async (n, r, o) => {
      let [{
        mcpAddJsonHandler: s
      }, {
        createSubcommandRoot: i
      }] = await Promise.all([Promise.resolve().then(() => (kBe(), xBe)), Promise.resolve().then(() => (PE(), IE))]);
      await s(await i(), n, r, o);
      return U5();
    });
    t.command("add-from-claude-desktop").description("Import MCP servers from Claude Desktop (Mac and WSL only)").option("-s, --scope <scope>", "Configuration scope (local, user, or project)", "local").action(async n => {
      let {
        mcpAddFromDesktopHandler: r
      } = await Promise.resolve().then(() => (kBe(), xBe));
      await r(n);
    });
    t.command("reset-project-choices").description("Reset all approved and rejected project-scoped (.mcp.json) servers within this project").action(async () => {
      let [{
        mcpResetChoicesHandler: n
      }, {
        createSubcommandRoot: r
      }] = await Promise.all([Promise.resolve().then(() => (kBe(), xBe)), Promise.resolve().then(() => (PE(), IE))]);
      await n(await r());
      return U5();
    });
  }
  var ISc = __lazy(() => {
    Tbc();
    vbc();
    E4e();
    SL();
    rfr();
  });
  function IBe(e, t, n) {
    let r = iX(e);
    if (r === "unknown") {
      Oe(e);
    } else {
      logForDebugging(`Plugin command "${t}" failed: ${he(e)}`, {
        level: "error"
      });
    }
    let o = n ? `${t} plugin "${n}"` : t === "disable-all" ? "disable all plugins" : `${t} plugins`;
    console.error(`${vGd.cross} Failed to ${o}: ${he(e)}`);
    let s = n ? Eq(n, II()) : {};
    logEvent("tengu_plugin_command_failed", {
      command: t,
      error_category: r,
      ...s
    });
    process.exit(1);
  }
  function Zbf(e, t) {
    let n = {};
    for (let s of e) {
      let i = s.indexOf("=");
      if (i <= 0) {
        throw Error(`--config expects KEY=VALUE, got "${s}". Use --config key=value (repeatable).`);
      }
      let a = s.slice(0, i);
      let c = (s.slice(i + 1).split(/\r\n|\r|\n/, 1)[0] ?? "").trim();
      let u = Object.hasOwn(t, a) ? t[a] : undefined;
      if (!u) {
        let d = Object.keys(t);
        throw Error(`--config key "${a}" isn't declared in this plugin's userConfig.` + (d.length > 0 ? ` Known keys: ${d.join(", ")}.` : ""));
      }
      if (c === "") {
        throw Error(`--config ${a}: value is empty. Omit the flag to leave "${a}" unset.`);
      }
      if (u.type === "number") {
        let d = Number(c);
        if (Number.isNaN(d)) {
          throw Error(`--config ${a}: "${c}" is not a number`);
        }
        n[a] = d;
      } else if (u.type === "boolean") {
        if (!st(c) && !Pl(c)) {
          throw Error(`--config ${a}: "${c}" is not a boolean (use true/false, 1/0, yes/no, on/off)`);
        }
        n[a] = st(c);
      } else {
        n[a] = c;
      }
    }
    let r = d_u(t, (s, i) => Object.hasOwn(n, i));
    let o = oNe(n, r);
    if (!o.valid) {
      throw Error(`--config validation failed: ${o.errors.join("; ")}`);
    }
    return n;
  }
  async function eSf(e, t) {
    Ag();
    let {
      enabled: n,
      disabled: r
    } = await loadAllPlugins();
    let o = fWn([...n, ...r], e);
    if (!o) {
      if (t && t.length > 0) {
        throw Error(`--config was given but plugin "${e}" failed to load after install \u2014 run \`claude plugin list\` to see why.`);
      }
      return "";
    }
    let s = o.manifest.userConfig;
    if (!s || Object.keys(s).length === 0) {
      if (t && t.length > 0) {
        throw Error(`--config was given but plugin "${e}" declares no userConfig options.`);
      }
      return "";
    }
    if (t && t.length > 0) {
      let l = Zbf(t, s);
      await Fft(Poe(o), l, s);
    }
    let i = Object.keys(Z9t(o));
    if (i.length === 0) {
      return "";
    }
    let a = i.filter(l => s[l]?.required === true);
    return `${i.length} userConfig ${un(i.length, "option")} not yet set` + (a.length > 0 ? ` (${a.length} required)` : "") + ` \u2014 run /plugin configure ${e} in Claude Code, or pass --config KEY=VALUE.`;
  }
  async function OSc(e, t = "user", n) {
    try {
      let r = await b8l(e, t);
      if (!r.success) {
        throw Error(r.message);
      }
      logEvent("tengu_plugin_installed_cli", {
        ...Eq(r.pluginId || e, II()),
        scope: r.scope || t,
        install_source: "cli-explicit"
      });
      let o = "";
      try {
        o = await eSf(r.pluginId || e, n);
      } catch (s) {
        let i = he(s);
        if (logForDebugging(`post-install userConfig step failed: ${i}`, {
          level: "warn"
        }), n && n.length > 0) {
          o = `${vGd.warning} Installed, but --config not applied: ${i}`;
        }
      }
      return o ? `${r.message}
${o}` : r.message;
    } catch (r) {
      IBe(r, "install", e);
    }
  }
  async function DSc(e) {
    let t = dwt(e);
    let {
      enabled: n,
      disabled: r
    } = await loadAllPluginsCacheOnly();
    return wta(KO().plugins, [...n, ...r], e, t);
  }
  async function MSc(e, t = "user", n = false, r = false, o = false) {
    try {
      let s = await Ywe(e, t, !n);
      if (!s.success) {
        throw Error(s.message);
      }
      logEvent("tengu_plugin_uninstalled_cli", {
        ...Eq(s.pluginId || e, II()),
        scope: s.scope || t
      });
      let i = false;
      try {
        let a = await DSc(t);
        if (r) {
          writeToStdout(`${vGd.tick} ${s.message}
`);
          i = true;
          return await LSc(a, t, {
            dryRun: false,
            yes: o,
            deleteDataDir: !n
          });
        }
        return s.message + Cta(a.orphans, t);
      } catch (a) {
        Oe(a);
        let c = `(${r ? "prune" : "orphan scan"} failed: ${he(a)})`;
        if (i) {
          return c;
        }
        return `${r ? `${vGd.tick} ${s.message}` : s.message}
${c}`;
      }
    } catch (s) {
      IBe(s, "uninstall", e);
    }
  }
  async function NSc(e = "user", {
    dryRun: t = false,
    yes: n = false
  } = {}) {
    try {
      let r = await DSc(e);
      return await LSc(r, e, {
        dryRun: t,
        yes: n,
        deleteDataDir: true
      });
    } catch (r) {
      IBe(r, "prune");
    }
  }
  async function LSc(e, t, n) {
    if (e.unloadable.length > 0) {
      return `Skipped \u2014 cannot determine orphans: ${e.unloadable.join(", ")} failed to load. Fix or uninstall, then retry.`;
    }
    if (e.orphans.size === 0) {
      return e.autoCount === 0 ? `Nothing to prune (no auto-installed plugins at ${t} scope).` : `Nothing to prune (${e.autoCount} auto-installed ${un(e.autoCount, "plugin", "plugins")} at ${t} scope, all still needed).`;
    }
    let r = KO().plugins;
    let o = dwt(t);
    let s = [...e.orphans].map(l => {
      let c = r[l]?.find(u => u.scope === t && u.projectPath === o);
      return `  ${l}${c?.version ? ` (${c.version})` : ""}`;
    });
    let i = `${e.orphans.size} auto-installed ${un(e.orphans.size, "plugin", "plugins")} no longer needed at ${t} scope:
${s.join(`
`)}`;
    if (n.dryRun) {
      return `${i}
(dry run \u2014 nothing removed)`;
    }
    if (!n.yes) {
      if (!process.stdin.isTTY || !process.stdout.isTTY) {
        let c = t === "user" ? "" : ` --scope ${t}`;
        return `${i}
Not a TTY \u2014 run \`claude plugin prune${c} -y\` to remove.`;
      }
      if (writeToStdout(`${i}
Remove? [y/N] `), !(await tSf())) {
        return "Aborted.";
      }
    }
    let a = await r2l(e.orphans, t, o, {
      deleteDataDir: n.deleteDataDir
    });
    logEvent("tengu_plugin_prune_cli", {
      scope: t,
      removed_count: a.length
    });
    return `Removed ${a.length} auto-installed ${un(a.length, "plugin", "plugins")}: ${a.map(l => Yo(l).name).join(", ")}`;
  }
  async function tSf() {
    let e = PSc.createInterface({
      input: process.stdin
    });
    try {
      for await (let t of e) {
        return /^y(es)?$/i.test(t.trim());
      }
      return false;
    } finally {
      e.close();
    }
  }
  async function FSc(e, t) {
    try {
      let n = await hwt(e, t);
      if (!n.success) {
        throw Error(n.message);
      }
      logEvent("tengu_plugin_disabled_cli", {
        ...Eq(n.pluginId || e, II()),
        scope: n.scope == null ? undefined : n.scope
      });
      return `${vGd.tick} ${n.message}`;
    } catch (n) {
      IBe(n, "disable", e);
    }
  }
  async function USc() {
    try {
      let e = await S8l();
      if (!e.success) {
        throw Error(e.message);
      }
      logEvent("tengu_plugin_disabled_all_cli", {});
      return `${vGd.tick} ${e.message}`;
    } catch (e) {
      IBe(e, "disable-all");
    }
  }
  async function BSc(e, t) {
    try {
      writeToStdout(`Checking for updates for plugin "${e}" at ${t} scope\u2026
`);
      let n = await gwt(e, t);
      if (!n.success) {
        throw Error(n.message);
      }
      if (writeToStdout(`${vGd.tick} ${n.message}
`), !n.alreadyUpToDate && !n.skipped) {
        logEvent("tengu_plugin_updated_cli", {
          ...Eq(n.pluginId || e, II()),
          old_version: n.oldVersion || "unknown",
          new_version: n.newVersion || "unknown"
        });
      }
      Pe("cli_plugin_update");
      await gracefulShutdown(0);
    } catch (n) {
      IBe(n, "update", e);
    }
  }
  var PSc;
  var AYo = __lazy(() => {
    je();
    gn();
    dt();
    lm();
    Rn();
    p5();
    MSe();
    Qk();
    H8();
    Lft();
    Kf();
    rie();
    xg();
    a9();
    OD();
    Zn();
    Wk();
    ln();
    Ot();
    ywt();
    PSc = require("readline");
  });
  function HSc(e) {
    let t = Cje().shape.name.safeParse(e);
    if (!t.success) {
      return t.error.issues[0]?.message ?? null;
    }
    if (e.includes("/") || e.includes("\\") || e.includes("..") || e === ".") {
      return 'Plugin name cannot contain path separators (/ or \\), ".." sequences, or be "."';
    }
    return null;
  }
  function jSc(e) {
    let {
      name: t,
      description: n,
      author: r
    } = e;
    let o = e.with ?? [];
    let s = [];
    let i = {
      $schema: "https://anthropic.com/claude-code/plugin.schema.json",
      name: t,
      version: "0.1.0",
      description: n ?? "TODO: describe what this plugin provides"
    };
    if (r) {
      i.author = r;
    }
    if (i.skills = ["./"], s.push({
      relPath: wL.join(".claude-plugin", "plugin.json"),
      contents: De(i, null, 2) + `
`
    }), s.push({
      relPath: "SKILL.md",
      contents: $Sc(t)
    }), o.includes("skills")) {
      s.push({
        relPath: wL.join("skills", "example", "SKILL.md"),
        contents: $Sc("example")
      });
    }
    if (o.includes("agents")) {
      s.push({
        relPath: wL.join("agents", "example.md"),
        contents: rSf()
      });
    }
    if (o.includes("hooks")) {
      s.push({
        relPath: wL.join("hooks", "hooks.json"),
        contents: oSf()
      }, {
        relPath: wL.join("hooks-handlers", "on-session-start.ts"),
        contents: sSf(),
        mode: 493
      });
    }
    if (o.includes("mcp") && !o.includes("channel")) {
      s.push({
        relPath: ".mcp.json",
        contents: iSf()
      });
    }
    if (o.includes("lsp")) {
      s.push({
        relPath: ".lsp.json",
        contents: aSf()
      });
    }
    if (o.includes("output-style")) {
      s.push({
        relPath: wL.join("output-styles", `${t}.md`),
        contents: lSf(t)
      });
    }
    if (o.includes("channel")) {
      i.channels = [{
        server: t,
        displayName: t
      }];
      s.push({
        relPath: ".mcp.json",
        contents: cSf(t)
      }, {
        relPath: "server.ts",
        contents: dSf(t)
      }, {
        relPath: "package.json",
        contents: uSf(t)
      });
    }
    s[0].contents = De(i, null, 2) + `
`;
    return s;
  }
  async function qSc(e, t, n) {
    let r = wL.resolve(e);
    if (!n.force) {
      try {
        await Ynn.mkdir(wL.join(r, ".claude-plugin"));
      } catch (s) {
        if (en(s) === "EEXIST") {
          return {
            ok: false,
            error: `${wL.join(r, ".claude-plugin")} already exists. Use --force to overwrite.`
          };
        }
        if (en(s) !== "ENOENT") {
          throw s;
        }
      }
    }
    let o = [];
    for (let s of t) {
      let i = wL.resolve(r, s.relPath);
      let a = wL.relative(r, i);
      if (a.startsWith(".." + wL.sep) || a === "..") {
        return {
          ok: false,
          error: `Refusing to write outside ${r}: ${s.relPath}`
        };
      }
      if (await Ynn.mkdir(wL.dirname(i), {
        recursive: true
      }), n.force) {
        await Fm(i, s.contents, s.mode);
      } else {
        try {
          await Ynn.writeFile(i, s.contents, {
            flag: "wx",
            mode: s.mode
          });
        } catch (l) {
          if (en(l) !== "EEXIST") {
            throw l;
          }
          o.push(s.relPath);
        }
      }
    }
    return {
      ok: true,
      skipped: o
    };
  }
  function $Sc(e) {
    return `---
name: ${e}
description: TODO \u2014 describe WHEN Claude should use this. Include trigger phrases users
  might say ("do X", "set up Y", "review Z"). Be specific; this string is what Claude
  matches the user's request against.
---

# ${e}

TODO: what this skill does, and the steps Claude should take.
`;
  }
  function rSf() {
    return `---
name: example
description: TODO \u2014 when should Claude delegate to this subagent?
tools:
  - Read
  - Grep
---

TODO: system prompt for the subagent.
`;
  }
  function oSf() {
    return De({
      hooks: {
        SessionStart: [{
          hooks: [{
            type: "command",
            command: "bun ${CLAUDE_PLUGIN_ROOT}/hooks-handlers/on-session-start.ts"
          }]
        }]
      }
    }, null, 2) + `
`;
  }
  function sSf() {
    return `#!/usr/bin/env bun
// SessionStart hook handler. Reads the event from stdin, writes a JSON result
// to stdout. Swap "bun" for "node" or "python3" in hooks/hooks.json if your
// users' environment lacks bun.
const input = await new Response(Bun.stdin.stream()).text()
const event = JSON.parse(input)
process.stdout.write(JSON.stringify({}))
`;
  }
  function iSf() {
    return De({
      mcpServers: {
        "example-remote": {
          type: "http",
          url: "https://example.com/mcp"
        },
        "example-local": {
          command: "npx",
          args: ["<your-mcp-server-package>"]
        }
      }
    }, null, 2) + `
`;
  }
  function aSf() {
    return De({
      example: {
        command: "example-language-server",
        args: ["--stdio"],
        extensionToLanguage: {
          ".example": "example"
        }
      }
    }, null, 2) + `
`;
  }
  function lSf(e) {
    return `---
name: ${e}
description: TODO \u2014 one line shown in the Output style picker in /config
force-for-plugin: true
keep-coding-instructions: true
---

TODO: the style prompt. This is appended to Claude's system prompt while the
style is active. With force-for-plugin: true, the style applies automatically
when this plugin is enabled.
`;
  }
  function cSf(e) {
    return De({
      mcpServers: {
        [e]: {
          command: "bun",
          args: ["run", "--cwd", "${CLAUDE_PLUGIN_ROOT}", "--shell=bun", "--silent", "start"]
        }
      }
    }, null, 2) + `
`;
  }
  function uSf(e) {
    return De({
      name: `claude-channel-${e}`,
      version: "0.1.0",
      type: "module",
      scripts: {
        start: "bun install --no-summary && bun server.ts"
      },
      dependencies: {
        "@modelcontextprotocol/sdk": "^1.0.0"
      }
    }, null, 2) + `
`;
  }
  function dSf(e) {
    return `#!/usr/bin/env bun
/**
 * ${e} channel server \u2014 stdio MCP server implementing the channel contract.
 * See https://docs.claude.com/en/docs/claude-code/channels-reference.
 */
import { Server } from '@modelcontextprotocol/sdk/server/index.js'
import { StdioServerTransport } from '@modelcontextprotocol/sdk/server/stdio.js'
import {
  CallToolRequestSchema,
  ListToolsRequestSchema,
} from '@modelcontextprotocol/sdk/types.js'

const mcp = new Server(
  { name: '${e}', version: '0.1.0' },
  {
    capabilities: {
      tools: {},
      // Required: presence of this key registers the channel notification
      // listener on Claude's side.
      experimental: { 'claude/channel': {} },
    },
    instructions:
      "Events from ${e} arrive as <channel source=\\"${e}\\" ...>. Anything " +
      "you want the sender to see must go through the reply tool \u2014 your " +
      "transcript output never reaches the channel.",
  },
)

mcp.setRequestHandler(ListToolsRequestSchema, async () => ({
  tools: [
    {
      name: 'reply',
      description: 'Send a message back to the ${e} channel.',
      inputSchema: {
        type: 'object',
        properties: { text: { type: 'string' } },
        required: ['text'],
      },
    },
  ],
}))

mcp.setRequestHandler(CallToolRequestSchema, async req => {
  const args = (req.params.arguments ?? {}) as Record<string, unknown>
  if (req.params.name === 'reply') {
    // TODO: deliver args.text to the external service.
    return { content: [{ type: 'text', text: 'sent' }] }
  }
  return { content: [{ type: 'text', text: 'unknown tool' }], isError: true }
})

// TODO: when the external service has an inbound event, push it to Claude:
//
//   await mcp.notification({
//     method: 'notifications/claude/channel',
//     params: {
//       content: 'the event body',
//       meta: { chat_id: '...', sender: '...' },
//     },
//   })
//
// Each meta key becomes an attribute on the <channel> tag. Keys must be
// identifiers (letters/digits/underscores) \u2014 others are silently dropped.

await mcp.connect(new StdioServerTransport())
`;
  }
  var Ynn;
  var wL;
  var Jnn;
  var IYo = __lazy(() => {
    BT();
    dt();
    TC();
    Ynn = require("fs/promises");
    wL = require("path");
    Jnn = ["skills", "agents", "hooks", "mcp", "lsp", "output-style", "channel"];
  });
  var MH = {};
  __export(MH, {
    pluginValidateHandler: () => pluginValidateHandler,
    pluginUpdateHandler: () => pluginUpdateHandler,
    pluginUninstallHandler: () => pluginUninstallHandler,
    pluginTagHandler: () => pluginTagHandler,
    pluginPruneHandler: () => pluginPruneHandler,
    pluginListHandler: () => pluginListHandler,
    pluginInstallHandler: () => pluginInstallHandler,
    pluginInitHandler: () => pluginInitHandler,
    pluginEnableHandler: () => pluginEnableHandler,
    pluginDisableHandler: () => pluginDisableHandler,
    pluginDetailsHandler: () => pluginDetailsHandler,
    marketplaceUpdateHandler: () => marketplaceUpdateHandler,
    marketplaceRemoveHandler: () => marketplaceRemoveHandler,
    marketplaceListHandler: () => marketplaceListHandler,
    marketplaceAddHandler: () => marketplaceAddHandler,
    handleMarketplaceError: () => handleMarketplaceError,
    VALID_UPDATE_SCOPES: () => VALID_UPDATE_SCOPES,
    VALID_INSTALLABLE_SCOPES: () => VALID_INSTALLABLE_SCOPES
  });
  function handleMarketplaceError(e, t) {
    logForDebugging(`Failed to ${t}: ${he(e)}`, {
      level: "error"
    });
    Es(`${vGd.cross} Failed to ${t}: ${he(e)}`);
  }
  function PYo(e) {
    let t = [];
    if (e.errors.length > 0) {
      t.push(`${vGd.cross} Found ${e.errors.length} ${un(e.errors.length, "error")}:`, "");
      e.errors.forEach(n => {
        t.push(`  ${vGd.pointer} ${n.path}: ${n.message}`);
      });
      t.push("");
    }
    if (e.warnings.length > 0) {
      t.push(`${vGd.warning} Found ${e.warnings.length} ${un(e.warnings.length, "warning")}:`, "");
      e.warnings.forEach(n => {
        t.push(`  ${vGd.pointer} ${n.path}: ${n.message}`);
      });
      t.push("");
    }
    return t;
  }
  async function pluginValidateHandler(e, t, n) {
    if (n.cowork) {
      setUseCoworkPlugins(true);
    }
    let r;
    let o = [];
    try {
      if (r = await kZt(t), r.fileType === "plugin") {
        let c = DK.dirname(r.filePath);
        if (DK.basename(c) === ".claude-plugin") {
          o = await Zar(DK.dirname(c));
        }
      }
    } catch (c) {
      if (Ae("cli_plugin_validate", "cli_plugin_validate_exception"), Io(c)) {
        logForDebugging(`Plugin validation failed for ${t}: ${he(c)}`, {
          level: "error"
        });
      } else {
        Oe(c);
      }
      console.error(`${vGd.cross} Unexpected error during validation: ${he(c)}`);
      process.exit(2);
      return;
    }
    let {
      allSuccess: s,
      noErrors: i,
      hasWarnings: a
    } = uVl([r, ...o], n);
    let l = [`Validating ${r.fileType} manifest: ${r.filePath}`, "", ...PYo(r)];
    for (let c of o) {
      l.push(`Validating ${c.fileType}: ${c.filePath}`, "");
      l.push(...PYo(c));
    }
    if (s) {
      l.push(a ? `${vGd.tick} Validation passed with warnings` : `${vGd.tick} Validation passed`);
    } else if (i && a) {
      l.push(`${vGd.cross} Validation failed (--strict treats warnings as errors)`);
    } else {
      l.push(`${vGd.cross} Validation failed`);
    }
    if (s) {
      Pe("cli_plugin_validate");
    } else {
      Et("cli_plugin_validate", "cli_plugin_validate_failed");
    }
    e.render(cm.jsx(Q_, {
      children: cm.jsx(Text, {
        children: l.join(`
`)
      })
    }));
    await e.waitUntilExit();
    process.exit(s ? 0 : 1);
  }
  async function pluginTagHandler(e, t, n) {
    let r = await tlr(t ?? ".", {
      force: n.force
    });
    let o = [];
    for (let d of r.warnings) {
      o.push(`${vGd.warning} ${d}`);
    }
    if (!r.ok) {
      Ae("cli_plugin_tag", "cli_plugin_tag_prepare_failed");
      o.push(`${vGd.cross} ${r.error}`);
      Eee(e, o, 1);
      return;
    }
    let {
      plan: s
    } = r;
    if (o.push(`Plugin:  ${s.pluginName}`, `Version: ${s.version} (from ${s.versionFrom})`), s.marketplace) {
      o.push(`Marketplace entry: plugins[${s.marketplace.entryIndex}] in ${s.marketplace.path}` + (s.marketplace.entryVersion ? ` (version: ${s.marketplace.entryVersion})` : ""));
    }
    o.push(`Tag:     ${s.tag}`, "");
    let i = n.remote ?? "origin";
    let a = n.force ?? false;
    let l = IZt(s, n.message);
    let c = `git -C ${s.gitRoot} push ${a ? "--force " : ""}${i} refs/tags/${s.tag}`;
    if (n.dryRun) {
      Pe("cli_plugin_tag");
      o.push(`${vGd.tick} Dry run \u2014 would create tag ${s.tag} at HEAD in ${s.gitRoot}`, `  git -C ${s.gitRoot} tag ${a ? "-f " : ""}-a ${s.tag} -m ${De(l)}`, `  ${c}`);
      Eee(e, o, 0);
      return;
    }
    let u = await nlr(s, {
      push: n.push ?? false,
      force: a,
      message: n.message,
      remote: i
    });
    if (!u.ok) {
      Ae("cli_plugin_tag", "cli_plugin_tag_create_failed");
      o.push(`${vGd.cross} ${u.error}`);
      Eee(e, o, 1);
      return;
    }
    if (Pe("cli_plugin_tag"), o.push(`${vGd.tick} Created tag ${s.tag}`), u.pushed) {
      o.push(`${vGd.tick} Pushed to ${i}`);
    } else {
      o.push(`  Push with: ${c}`);
    }
    Eee(e, o, 0);
  }
  function Eee(e, t, n) {
    e.render(cm.jsx(Q_, {
      children: cm.jsx(Text, {
        children: t.join(`
`)
      })
    }));
    e.waitUntilExit().then(() => process.exit(n));
  }
  async function pluginInitHandler(e, t, n) {
    let r = [];
    let o = HSc(t);
    if (o) {
      Ae("cli_plugin_init", "invalid_name");
      r.push(`${vGd.cross} Invalid plugin name "${t}": ${o}`);
      Eee(e, r, 1);
      return;
    }
    let s = [];
    for (let E of n.with ?? []) {
      if (Jnn.includes(E)) {
        s.push(E);
      } else {
        Ae("cli_plugin_init", "invalid_component");
        r.push(`${vGd.cross} Unknown --with component "${E}". Valid: ${Jnn.join(", ")}`);
        Eee(e, r, 1);
        return;
      }
    }
    if (!areLocalPluginDirsAllowedByPolicy()) {
      Ae("cli_plugin_init", "policy_blocked");
      r.push(`${vGd.cross} ${localPluginDirsBlockedMessage(LN(DK.join(er(), "skills")))}`);
      Eee(e, r, 1);
      return;
    }
    let i = DK.join(er(), "skills");
    let a = DK.join(i, t);
    if (DK.relative(i, DK.resolve(a)).startsWith("..")) {
      Ae("cli_plugin_init", "invalid_name");
      r.push(`${vGd.cross} Plugin name "${t}" would write outside ${LN(i)}`);
      Eee(e, r, 1);
      return;
    }
    let l = n.author ?? (await HOi());
    let c = n.authorEmail ?? (await kce());
    if (!l && n.authorEmail) {
      r.push(`${vGd.warning} --author-email was ignored because no author name was found. Pass --author or set git config user.name.`);
    }
    let u = l ? c ? {
      name: l,
      email: c
    } : {
      name: l
    } : undefined;
    let d = jSc({
      name: t,
      description: n.description,
      author: u,
      with: s
    });
    let p;
    try {
      let E = await qSc(a, d, {
        force: n.force
      });
      if (!E.ok) {
        Ae("cli_plugin_init", "target_exists");
        r.push(`${vGd.cross} ${E.error}`);
        Eee(e, r, 1);
        return;
      }
      p = E.skipped;
    } catch (E) {
      Ae("cli_plugin_init", "write_failed");
      Oe(E);
      r.push(`${vGd.cross} Failed to write scaffold: ${he(E)}`);
      Eee(e, r, 1);
      return;
    }
    for (let E of p) {
      r.push(`  kept existing ${E} (use --force to overwrite)`);
    }
    let m = await kZt(a);
    if (!m.success || m.warnings.length > 0) {
      r.push(...PYo(m));
    }
    if (!m.success) {
      Ae("cli_plugin_init", "self_validate_failed");
      Eee(e, r, 1);
      return;
    }
    Pe("cli_plugin_init");
    let f = `${t}@${"skills-dir"}`;
    r.push(`${vGd.tick} Created plugin "${t}" at ${LN(a)}`);
    let h = getInitialSettings().enabledPlugins ?? {};
    let g = II()?.vZc(t) ?? false;
    let y = await qM();
    let _ = Object.keys(h).find(E => {
      let C = Yo(E);
      return C.name === t && C.marketplace !== undefined && C.marketplace !== "builtin" && !UI(C.marketplace) && y[C.marketplace] !== undefined;
    });
    let b = h[f] === false;
    if (g) {
      r.push(`  ${vGd.warning} A plugin named "${t}" is locked by managed settings, which takes precedence \u2014 ${f} won't load. To load this copy, give it a different "name" in .claude-plugin/plugin.json.`);
    } else if (_) {
      r.push(`  ${vGd.warning} The name "${t}" is already taken by ${_} \u2014 when that plugin loads, ${f} won't. To load this copy, give it a different "name" in .claude-plugin/plugin.json or uninstall the conflicting plugin.`);
    } else if (b) {
      let E = Py("plugin enable", f);
      r.push(`  ${vGd.warning} A disabled setting for ${f} exists, so it won't load until you re-enable it${E ? `: ${E}` : " in /plugin"}`);
    } else {
      r.push(`  It will auto-load next session as ${f}. Run /reload-plugins to load it now.`);
    }
    let S = Py("plugin disable", f);
    r.push(`  ${S ? `Disable: ${S}. ` : "Disable: in /plugin. "}Remove: delete the directory.`);
    Eee(e, r, 0);
  }
  async function pluginListHandler(e, t) {
    if (t.cowork) {
      setUseCoworkPlugins(true);
    }
    logEvent("tengu_plugin_list_command", {});
    let n = Kw();
    let {
      getPluginEditableScopes: r
    } = await Promise.resolve().then(() => (CYe(), F6l));
    let o = r();
    let s = Object.keys(n.plugins);
    let {
      enabled: i,
      disabled: a,
      errors: l,
      warnings: c
    } = await loadAllPlugins();
    let u = [...i, ...a];
    let d = u.filter(E => E.source.endsWith("@inline"));
    let p = l.filter(E => E.source.endsWith("@inline") || E.source.startsWith("inline["));
    let m = c.filter(E => E.source.endsWith("@inline") || E.source.startsWith("inline["));
    let f = u.filter(E => E.source.endsWith(`@${"skills-dir"}`));
    let h = l.filter(E => E.source.endsWith(`@${"skills-dir"}`));
    let g = c.filter(E => E.source.endsWith(`@${"skills-dir"}`));
    let y = (E, C) => !("orphan" in E && E.orphan) && (E.source === C.source || "plugin" in E && E.plugin === C.name);
    if (t.json) {
      let E = new Map(u.map(A => [A.source, A]));
      let C = [];
      for (let A of s.sort()) {
        let k = n.plugins[A];
        if (!k || k.length === 0) {
          continue;
        }
        let I = Yo(A).name;
        let O = l.filter(L => L.source === A || "plugin" in L && L.plugin === I).map(hS);
        let M = c.filter(L => L.source === A || "plugin" in L && L.plugin === I).map(S1);
        for (let L of k) {
          let P = E.get(A);
          let F;
          if (P) {
            let H = P.mcpServers || (await Doe(P));
            if (H && Object.keys(H).length > 0) {
              F = H;
            }
          }
          C.push({
            id: A,
            version: L.version || "unknown",
            scope: L.scope,
            enabled: o.vZc(A),
            installPath: L.installPath,
            installedAt: L.installedAt,
            lastUpdated: L.lastUpdated,
            projectPath: L.projectPath,
            mcpServers: F,
            errors: O.length > 0 ? O : undefined,
            notes: M.length > 0 ? M : undefined
          });
        }
      }
      for (let A of d) {
        let k = A.mcpServers || (await Doe(A));
        let I = p.filter(M => M.source === A.source || "plugin" in M && M.plugin === A.name).map(hS);
        let O = m.filter(M => M.source === A.source || "plugin" in M && M.plugin === A.name).map(S1);
        C.push({
          id: A.source,
          version: A.manifest.version ?? "unknown",
          scope: "session",
          enabled: A.enabled !== false,
          installPath: A.path,
          mcpServers: k && Object.keys(k).length > 0 ? k : undefined,
          errors: I.length > 0 ? I : undefined,
          notes: O.length > 0 ? O : undefined
        });
      }
      for (let A of p.filter(k => k.source.startsWith("inline["))) {
        C.push({
          id: A.source,
          version: "unknown",
          scope: "session",
          enabled: false,
          installPath: "path" in A ? A.path : "",
          errors: [hS(A)]
        });
      }
      for (let A of f) {
        let k = A.mcpServers || (await Doe(A));
        let I = h.filter(M => y(M, A)).map(hS);
        let O = g.filter(M => M.source === A.source || "plugin" in M && M.plugin === A.name).map(S1);
        C.push({
          id: A.source,
          version: A.manifest.version ?? "unknown",
          scope: A.scope ?? "user",
          enabled: A.enabled !== false,
          installPath: A.path,
          mcpServers: k && Object.keys(k).length > 0 ? k : undefined,
          errors: I.length > 0 ? I : undefined,
          notes: O.length > 0 ? O : undefined
        });
      }
      for (let A of h.filter(k => !f.some(I => y(k, I)))) {
        C.push({
          id: A.source,
          version: "unknown",
          scope: "user",
          enabled: false,
          installPath: "",
          errors: [hS(A)]
        });
      }
      for (let A of g.filter(k => !f.some(I => k.source === I.source || "plugin" in k && k.plugin === I.name))) {
        C.push({
          id: A.source,
          version: "unknown",
          scope: "project",
          enabled: false,
          installPath: "",
          notes: [S1(A)]
        });
      }
      let x;
      if (t.available) {
        let A = [];
        try {
          let [k, I] = await Promise.all([hf(), owt()]);
          let {
            marketplaces: O
          } = await Xse(k);
          for (let {
            name: M,
            data: L
          } of O) {
            if (L) {
              for (let P of L.plugins) {
                let F = OZ(P.name, M);
                if (!qG(F)) {
                  A.push({
                    pluginId: F,
                    name: P.name,
                    description: P.description,
                    marketplaceName: M,
                    version: P.version,
                    source: P.source,
                    installCount: I?.get(F)
                  });
                }
              }
            }
          }
        } catch {}
        x = De({
          installed: C,
          available: A
        }, null, 2);
      } else {
        x = De(C, null, 2);
      }
      Pe("cli_plugin_list");
      await F5(x + `
`);
      return;
    }
    let _ = [];
    if (s.length === 0 && d.length === 0 && f.length === 0) {
      if (p.length === 0 && h.length === 0 && g.length === 0) {
        _.push("No plugins installed. Use `claude plugin install` to install a plugin.");
      }
    }
    if (s.length > 0) {
      _.push("Installed plugins:", "");
    }
    for (let E of s.sort()) {
      let C = n.plugins[E];
      if (!C || C.length === 0) {
        continue;
      }
      let x = Yo(E).name;
      let A = l.filter(I => I.source === E || "plugin" in I && I.plugin === x);
      let k = c.filter(I => I.source === E || "plugin" in I && I.plugin === x);
      for (let I of C) {
        let O = o.vZc(E);
        let M = A.length > 0 ? `${vGd.cross} failed to load` : O ? `${vGd.tick} enabled` : `${vGd.cross} disabled`;
        let L = I.version || "unknown";
        let P = I.scope;
        _.push(`  ${vGd.pointer} ${E}`);
        _.push(`    Version: ${L}`);
        _.push(`    Scope: ${P}`);
        _.push(`    Status: ${M}`);
        for (let F of A) {
          _.push(`    Error: ${hS(F)}`);
        }
        for (let F of k) {
          _.push(`    Note: ${S1(F)}`);
        }
        _.push("");
      }
    }
    if (d.length > 0 || p.length > 0) {
      _.push("Session-only plugins (--plugin-dir / --plugin-url):", "");
      for (let E of d) {
        let C = p.filter(k => k.source === E.source || "plugin" in k && k.plugin === E.name);
        let x = m.filter(k => k.source === E.source || "plugin" in k && k.plugin === E.name);
        let A = E.enabled === false ? `${vGd.cross} disabled` : C.length > 0 ? `${vGd.cross} loaded with errors` : `${vGd.tick} loaded`;
        _.push(`  ${vGd.pointer} ${E.source}`);
        _.push(`    Version: ${E.manifest.version ?? "unknown"}`);
        _.push(`    Path: ${E.path}`);
        _.push(`    Status: ${A}`);
        for (let k of C) {
          _.push(`    Error: ${hS(k)}`);
        }
        for (let k of x) {
          _.push(`    Note: ${S1(k)}`);
        }
        _.push("");
      }
      for (let E of p.filter(C => C.source.startsWith("inline["))) {
        _.push(`  ${vGd.pointer} ${E.source}: ${vGd.cross} ${hS(E)}`, "");
      }
    }
    let b = g.filter(E => !f.some(C => E.source === C.source || "plugin" in E && E.plugin === C.name));
    if (f.length > 0 || h.length > 0 || b.length > 0) {
      _.push("Skills-directory plugins (.claude/skills/*):", "");
      for (let E of b) {
        _.push(`  ${vGd.warning} ${S1(E)}`, "");
      }
      for (let E of f) {
        let C = h.filter(k => y(k, E));
        let x = g.filter(k => k.source === E.source || "plugin" in k && k.plugin === E.name);
        let A = E.enabled === false ? `${vGd.cross} disabled` : C.length > 0 ? `${vGd.cross} loaded with errors` : `${vGd.tick} loaded`;
        _.push(`  ${vGd.pointer} ${E.source}`);
        _.push(`    Version: ${E.manifest.version ?? "unknown"}`);
        _.push(`    Scope: ${E.scope ?? "user"}`);
        _.push(`    Path: ${displaySkillsDirPath(E)}`);
        _.push(`    Status: ${A}`);
        for (let k of C) {
          _.push(`    Error: ${hS(k)}`);
        }
        for (let k of x) {
          _.push(`    Note: ${S1(k)}`);
        }
        _.push("");
      }
      for (let E of h.filter(C => !f.some(x => y(C, x)))) {
        _.push(`  ${vGd.pointer} ${E.source}: ${vGd.cross} ${hS(E)}`, "");
      }
    }
    Pe("cli_plugin_list");
    let S = await e();
    S.render(cm.jsx(Q_, {
      children: cm.jsx(Text, {
        children: _.join(`
`)
      })
    }));
    await S.waitUntilExit();
  }
  function gSf(e) {
    let t = Tfr.c(4);
    let {
      promise: n
    } = e;
    let r = OBe.use(n);
    let o;
    if (t[0] !== r) {
      o = r.join(`
`);
      t[0] = r;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] !== o) {
      s = cm.jsx(Q_, {
        children: cm.jsx(Text, {
          children: o
        })
      });
      t[2] = o;
      t[3] = s;
    } else {
      s = t[3];
    }
    return s;
  }
  async function marketplaceAddHandler(e, t, n) {
    if (n.cowork) {
      setUseCoworkPlugins(true);
    }
    let r;
    let o;
    let s;
    try {
      let a = await kar(t);
      if (!a) {
        Ae("cli_marketplace_add", "cli_marketplace_add_invalid_source");
        return Es(`${vGd.cross} Invalid marketplace source format. Try: owner/repo, https://..., or ./path`);
      }
      if ("error" in a) {
        Ae("cli_marketplace_add", "cli_marketplace_add_parse_failed");
        return Es(`${vGd.cross} ${a.error}`);
      }
      if (s = n.scope ?? "user", s !== "user" && s !== "project" && s !== "local") {
        return Es(`${vGd.cross} Invalid scope '${s}'. Use: user, project, or local`);
      }
      if (o = uM(s), r = a, n.sparse && n.sparse.length > 0) {
        if (r.source === "github" || r.source === "git") {
          r = {
            ...r,
            sparsePaths: n.sparse
          };
        } else {
          return Es(`${vGd.cross} --sparse is only supported for github and git marketplace sources (got: ${r.source})`);
        }
      }
    } catch (a) {
      Ae("cli_marketplace_add", "cli_marketplace_add_failed");
      return handleMarketplaceError(a, "add marketplace");
    }
    let i = (async () => {
      try {
        let a = [];
        let {
          name: l,
          alreadyMaterialized: c,
          resolvedSource: u
        } = await FFe(r, m => {
          a.push(m);
        });
        UXt(l, {
          source: u
        }, o);
        Ag();
        logEvent("tengu_marketplace_added", {
          source_type: r.source,
          repo_hash: r.source === "github" ? i3i.createHash("sha256").update(r.repo).digest("hex").slice(0, 12) : undefined
        });
        Pe("cli_marketplace_add");
        let d = [];
        try {
          d = (await zwe((await loadAllPlugins()).errors)).installed;
        } catch (m) {
          logForDebugging(`marketplace add: dep auto-resolve skipped: ${he(m)}`, {
            level: "warn"
          });
        }
        let p = $ue(d);
        a.push(c ? `${vGd.tick} Marketplace '${l}' already on disk \u2014 declared in ${s} settings${p}` : `${vGd.tick} Successfully added marketplace: ${l} (declared in ${s} settings)${p}`);
        return a;
      } catch (a) {
        Ae("cli_marketplace_add", "cli_marketplace_add_failed");
        return handleMarketplaceError(a, "add marketplace");
      }
    })();
    e.render(cm.jsx(OBe.Suspense, {
      fallback: cm.jsx(Text, {
        children: "Adding marketplace\u2026"
      }),
      children: cm.jsx(gSf, {
        promise: i
      })
    }));
    await e.waitUntilExit();
    process.exit(0);
  }
  async function marketplaceListHandler(e, t) {
    if (t.cowork) {
      setUseCoworkPlugins(true);
    }
    let n;
    try {
      n = await hf();
    } catch (i) {
      Ae("cli_marketplace_list", "cli_marketplace_list_load_failed");
      return handleMarketplaceError(i, "list marketplaces");
    }
    let r = Object.keys(n);
    if (t.json) {
      let i = r.sort().map(a => {
        let l = n[a];
        let c = l?.source;
        let u = c?.source === "github" || c?.source === "git" ? c.ref : undefined;
        return {
          name: a,
          source: c?.source,
          ...(c?.source === "github" && {
            repo: c.repo
          }),
          ...(c?.source === "git" && {
            url: c.url
          }),
          ...(c?.source === "url" && {
            url: c.url
          }),
          ...(c?.source === "directory" && {
            path: c.path
          }),
          ...(c?.source === "file" && {
            path: c.path
          }),
          ...(u && {
            ref: u
          }),
          installLocation: l?.installLocation
        };
      });
      Pe("cli_marketplace_list");
      await F5(De(i, null, 2) + `
`);
      return;
    }
    let o;
    if (r.length === 0) {
      o = cm.jsx(Text, {
        children: "No marketplaces configured"
      });
    } else {
      let i = ["Configured marketplaces:", ""];
      r.forEach(a => {
        let l = n[a];
        if (i.push(`  ${vGd.pointer} ${a}`), l?.source) {
          let c = l.source;
          if (c.source === "github") {
            let u = c.ref ? `@${c.ref}` : "";
            i.push(`    Source: GitHub (${c.repo}${u})`);
          } else if (c.source === "git") {
            let u = c.ref ? `@${c.ref}` : "";
            i.push(`    Source: Git (${c.url}${u})`);
          } else if (c.source === "url") {
            i.push(`    Source: URL (${c.url})`);
          } else if (c.source === "directory") {
            i.push(`    Source: Directory (${c.path})`);
          } else if (c.source === "file") {
            i.push(`    Source: File (${c.path})`);
          }
        }
        i.push("");
      });
      o = cm.jsx(Text, {
        children: i.join(`
`)
      });
    }
    Pe("cli_marketplace_list");
    let s = await e();
    s.render(cm.jsx(Q_, {
      children: o
    }));
    await s.waitUntilExit();
  }
  async function marketplaceRemoveHandler(e, t, n) {
    if (n.cowork) {
      setUseCoworkPlugins(true);
    }
    let r;
    if (n.scope !== undefined) {
      let o = n.scope;
      if (o !== "user" && o !== "project" && o !== "local") {
        return Es(`${vGd.cross} Invalid scope '${o}'. Use: user, project, or local`);
      }
      r = uM(o);
    }
    try {
      await nvt(t, r);
      Ag();
      logEvent("tengu_marketplace_removed", {
        marketplace_name: t
      });
    } catch (o) {
      Ae("cli_marketplace_remove", "cli_marketplace_remove_failed");
      handleMarketplaceError(o, "remove marketplace");
    }
    Pe("cli_marketplace_remove");
    e.render(cm.jsx(Q_, {
      children: cm.jsxs(Text, {
        children: [vGd.tick, " Successfully removed marketplace: ", t, n.scope ? ` (from ${n.scope} settings)` : ""]
      })
    }));
    await e.waitUntilExit();
  }
  function SSf(e) {
    let t = Tfr.c(5);
    let {
      promise: n
    } = e;
    let {
      messages: r,
      success: o
    } = OBe.use(n);
    let s;
    if (t[0] !== r || t[1] !== o) {
      s = [...r, o];
      t[0] = r;
      t[1] = o;
      t[2] = s;
    } else {
      s = t[2];
    }
    let a = s.join(`
`);
    let l;
    if (t[3] !== a) {
      l = cm.jsx(Q_, {
        children: cm.jsx(Text, {
          children: a
        })
      });
      t[3] = a;
      t[4] = l;
    } else {
      l = t[4];
    }
    return l;
  }
  async function marketplaceUpdateHandler(e, t, n) {
    if (n.cowork) {
      setUseCoworkPlugins(true);
    }
    let r;
    let o;
    if (t) {
      r = `Updating marketplace: ${t}...`;
      let s = [];
      o = eie(t, i => {
        s.push(i);
      }).then(() => (Ag(), logEvent("tengu_marketplace_updated", {
        marketplace_name: t
      }), Pe("cli_marketplace_update"), {
        messages: s,
        success: `${vGd.tick} Successfully updated marketplace: ${t}`
      })).catch(i => (Ae("cli_marketplace_update", "cli_marketplace_update_failed"), handleMarketplaceError(i, "update marketplace(s)")));
    } else {
      let s;
      try {
        s = await hf();
      } catch (a) {
        Ae("cli_marketplace_update", "cli_marketplace_update_load_failed");
        return handleMarketplaceError(a, "update marketplace(s)");
      }
      let i = Object.keys(s);
      if (i.length === 0) {
        e.render(cm.jsx(Q_, {
          children: cm.jsx(Text, {
            children: "No marketplaces configured"
          })
        }));
        await e.waitUntilExit();
        process.exit(0);
        return;
      }
      r = `Updating ${i.length} marketplace(s)...`;
      o = DBl().then(() => (Ag(), logEvent("tengu_marketplace_updated_all", {
        count: i.length
      }), Pe("cli_marketplace_update"), {
        messages: [],
        success: `${vGd.tick} Successfully updated ${i.length} marketplace(s)`
      })).catch(a => (Ae("cli_marketplace_update", "cli_marketplace_update_failed"), handleMarketplaceError(a, "update marketplace(s)")));
    }
    e.render(cm.jsx(OBe.Suspense, {
      fallback: cm.jsx(Text, {
        children: r
      }),
      children: cm.jsx(SSf, {
        promise: o
      })
    }));
    await e.waitUntilExit();
    process.exit(0);
  }
  function ESf(e) {
    let t = Tfr.c(2);
    let {
      promise: n
    } = e;
    let r = OBe.use(n);
    let o;
    if (t[0] !== r) {
      o = cm.jsx(Q_, {
        children: cm.jsxs(Text, {
          children: [vGd.tick, " ", r]
        })
      });
      t[0] = r;
      t[1] = o;
    } else {
      o = t[1];
    }
    return o;
  }
  async function pluginInstallHandler(e, t, n) {
    if (n.cowork) {
      setUseCoworkPlugins(true);
    }
    let r = n.scope || "user";
    if (n.cowork && r !== "user") {
      Es("--cowork can only be used with user scope");
    }
    if (!VALID_INSTALLABLE_SCOPES.includes(r)) {
      Es(`Invalid scope: ${r}. Must be one of: ${VALID_INSTALLABLE_SCOPES.join(", ")}.`);
    }
    let {
      name: o,
      marketplace: s
    } = Yo(t);
    logEvent("tengu_plugin_install_command", {
      _PROTO_plugin_name: o,
      ...(s && {
        _PROTO_marketplace_name: s
      }),
      scope: r
    });
    let i = OSc(t, r, n.config).then(a => (Pe("cli_plugin_install"), a));
    e.render(cm.jsx(OBe.Suspense, {
      fallback: cm.jsx(Text, {
        children: `Installing plugin "${t}"...`
      }),
      children: cm.jsx(ESf, {
        promise: i
      })
    }));
    await e.waitUntilExit();
    await gracefulShutdown(0);
  }
  async function pluginUninstallHandler(e, t, n) {
    if (n.cowork) {
      setUseCoworkPlugins(true);
    }
    let r = n.scope || "user";
    if (n.cowork && r !== "user") {
      Es("--cowork can only be used with user scope");
    }
    if (!VALID_INSTALLABLE_SCOPES.includes(r)) {
      Es(`Invalid scope: ${r}. Must be one of: ${VALID_INSTALLABLE_SCOPES.join(", ")}.`);
    }
    let {
      name: o,
      marketplace: s
    } = Yo(t);
    logEvent("tengu_plugin_uninstall_command", {
      _PROTO_plugin_name: o,
      ...(s && {
        _PROTO_marketplace_name: s
      }),
      scope: r
    });
    let i = await MSc(t, r, n.keepData, n.prune, n.yes);
    Pe("cli_plugin_uninstall");
    e.render(cm.jsx(Q_, {
      children: cm.jsx(Text, {
        children: n.prune ? i : `${vGd.tick} ${i}`
      })
    }));
    await e.waitUntilExit();
    process.exit(0);
  }
  async function pluginPruneHandler(e, t) {
    if (t.cowork) {
      setUseCoworkPlugins(true);
    }
    let n = t.scope || "user";
    if (t.cowork && n !== "user") {
      Es("--cowork can only be used with user scope");
    }
    if (!VALID_INSTALLABLE_SCOPES.includes(n)) {
      Es(`Invalid scope: ${n}. Must be one of: ${VALID_INSTALLABLE_SCOPES.join(", ")}.`);
    }
    logEvent("tengu_plugin_prune_command", {
      scope: n,
      dry_run: t.dryRun ?? false
    });
    let r = await NSc(n, {
      dryRun: t.dryRun,
      yes: t.yes
    });
    Pe("cli_plugin_prune");
    e.render(cm.jsx(Q_, {
      children: cm.jsx(Text, {
        children: r
      })
    }));
    await e.waitUntilExit();
    process.exit(0);
  }
  async function pluginEnableHandler(e, t, n) {
    if (n.cowork) {
      setUseCoworkPlugins(true);
    }
    let r;
    if (n.scope) {
      if (!VALID_INSTALLABLE_SCOPES.includes(n.scope)) {
        Es(`Invalid scope "${n.scope}". Valid scopes: ${VALID_INSTALLABLE_SCOPES.join(", ")}`);
      }
      r = n.scope;
    }
    if (n.cowork && r !== undefined && r !== "user") {
      Es("--cowork can only be used with user scope");
    }
    if (n.cowork && r === undefined) {
      r = "user";
    }
    let {
      name: o,
      marketplace: s
    } = Yo(t);
    logEvent("tengu_plugin_enable_command", {
      _PROTO_plugin_name: o,
      ...(s && {
        _PROTO_marketplace_name: s
      }),
      scope: r ?? "auto"
    });
    let i;
    try {
      if (i = await fwt(t, r), !i.success) {
        throw Error(i.message);
      }
      logEvent("tengu_plugin_enabled_cli", {
        ...Eq(i.pluginId || t, II()),
        scope: i.scope == null ? undefined : i.scope
      });
    } catch (a) {
      Ae("cli_plugin_enable", "cli_plugin_enable_failed");
      return IBe(a, "enable", t);
    }
    Pe("cli_plugin_enable");
    e.render(cm.jsx(Q_, {
      children: cm.jsxs(Text, {
        children: [vGd.tick, " ", i.message]
      })
    }));
    await e.waitUntilExit();
  }
  async function pluginDisableHandler(e, t, n) {
    if (n.all && t) {
      Es("Cannot use --all with a specific plugin");
    }
    if (!n.all && !t) {
      Es("Please specify a plugin name or use --all to disable all plugins");
    }
    if (n.cowork) {
      setUseCoworkPlugins(true);
    }
    let r;
    if (n.all) {
      if (n.scope) {
        Es("Cannot use --scope with --all");
      }
      logEvent("tengu_plugin_disable_command", {});
      r = await USc();
    } else {
      let o;
      if (n.scope) {
        if (!VALID_INSTALLABLE_SCOPES.includes(n.scope)) {
          Es(`Invalid scope "${n.scope}". Valid scopes: ${VALID_INSTALLABLE_SCOPES.join(", ")}`);
        }
        o = n.scope;
      }
      if (n.cowork && o !== undefined && o !== "user") {
        Es("--cowork can only be used with user scope");
      }
      if (n.cowork && o === undefined) {
        o = "user";
      }
      let {
        name: s,
        marketplace: i
      } = Yo(t);
      logEvent("tengu_plugin_disable_command", {
        _PROTO_plugin_name: s,
        ...(i && {
          _PROTO_marketplace_name: i
        }),
        scope: o ?? "auto"
      });
      r = await FSc(t, o);
    }
    Pe("cli_plugin_disable");
    e.render(cm.jsx(Q_, {
      children: cm.jsx(Text, {
        children: r
      })
    }));
    await e.waitUntilExit();
    process.exit(0);
  }
  async function pluginUpdateHandler(e, t) {
    if (t.cowork) {
      setUseCoworkPlugins(true);
    }
    let {
      name: n,
      marketplace: r
    } = Yo(e);
    logEvent("tengu_plugin_update_command", {
      _PROTO_plugin_name: n,
      ...(r && {
        _PROTO_marketplace_name: r
      })
    });
    let o = "user";
    if (t.scope) {
      if (!VALID_UPDATE_SCOPES.includes(t.scope)) {
        Es(`Invalid scope "${t.scope}". Valid scopes: ${VALID_UPDATE_SCOPES.join(", ")}`);
      }
      o = t.scope;
    }
    if (t.cowork && o !== "user") {
      Es("--cowork can only be used with user scope");
    }
    await BSc(e, o);
  }
  async function pluginDetailsHandler(e, t, n) {
    if (n.cowork) {
      setUseCoworkPlugins(true);
    }
    logEvent("tengu_plugin_details_command", {});
    let {
      getPluginInventory: r,
      computePluginTokenCost: o,
      scaleCharsToTokens: s
    } = await Promise.resolve().then(() => (m4o(), W8l));
    let {
      formatTokenEstimate: i
    } = await Promise.resolve().then(() => (cs(), ams));
    let {
      enabled: a,
      disabled: l
    } = await loadAllPlugins();
    let c = Yo(t);
    let u = [...a, ...l].find(k => c.marketplace ? k.source === nta(c.name, c.marketplace) : k.name === c.name);
    if (!u) {
      Ae("cli_plugin_details", "not_found");
      let k = `Plugin "${t}" not found. Run \`claude plugin list\` to see installed plugins, or pass --plugin-dir <path> to load one from disk.`;
      if (n.json) {
        return Es(k);
      }
      let I = await e();
      I.render(cm.jsx(Q_, {
        children: cm.jsx(Text, {
          children: k
        })
      }));
      await I.waitUntilExit();
      process.exit(1);
    }
    let d = u.source.split("@")[1] ?? "inline";
    let p = n.models?.length ? n.models : [getMainLoopModel()];
    let m;
    try {
      let k = await r(u, d);
      m = await o(k, p, u.name);
    } catch (k) {
      Oe($o(sr(k), "plugin details: inventory/token-cost failed"));
      Ae("cli_plugin_details", "inventory_failed");
      let I = `${vGd.cross} Could not load details for "${u.name}": ${he(k)}`;
      if (n.json) {
        return Es(I);
      }
      let O = await e();
      O.render(cm.jsx(Q_, {
        children: cm.jsx(Text, {
          children: I
        })
      }));
      await O.waitUntilExit();
      process.exit(1);
    }
    let {
      tokens: f,
      inventory: h
    } = m;
    if (n.json) {
      Pe("cli_plugin_details");
      let k = ({
        path: I,
        ...O
      }) => O;
      await F5(De({
        plugin: u.name,
        version: u.manifest.version,
        source: u.source,
        sha: u.sha ?? null,
        tokens: f,
        components: {
          ...h,
          commands: h.commands.map(k),
          agents: h.agents.map(k),
          skills: h.skills.map(k)
        }
      }, null, 2) + `
`);
      return;
    }
    let g = [];
    let y = ES(u);
    let _ = y === u.name ? u.name : `${y} (${u.name})`;
    if (g.push(`${_} ${u.manifest.version ?? ""}`.trimEnd()), u.manifest.description) {
      g.push(`  ${u.manifest.description}`);
    }
    g.push(`  Source: ${u.source}`);
    g.push("");
    g.push("Component inventory");
    let b = [["Skills", [...h.skills, ...h.commands].map(k => k.name).sort(), ""], ["Agents", h.agents.map(k => k.name), ""], ["Hooks", h.hooks, "  (harness-only \u2014 no model context cost)"], ["MCP servers", h.mcpServers, "  (tool schemas resolved at runtime; not counted)"], ["LSP servers", h.lspServers, "  (out-of-process tooling; no model context cost)"]];
    for (let [k, I, O] of b) {
      g.push(`  ${k} (${I.length})${I.length > 0 ? `  ${I.join(", ")}` : ""}${I.length > 0 ? O : ""}`);
    }
    g.push("");
    let S = [...h.skills, ...h.agents, ...h.commands].filter(k => k.chars != null);
    let E = {
      always_on: S.reduce((k, I) => k + I.chars.always_on, 0),
      on_invoke: S.reduce((k, I) => k + I.chars.on_invoke, 0)
    };
    let C = f[p[0]];
    let x = C?.always_on ?? s(E.always_on, E.always_on, undefined);
    if (g.push("Projected token cost"), g.push(`  Always-on:   ~${x.toLocaleString()} tok   added to every session`), S.length > 0) {
      g.push("");
      g.push("Per-component (rounded)");
      let k = Math.max(...S.map(I => I.name.length), 9);
      g.push(`  ${"component".padEnd(k)}  ${"always-on".padStart(9)}  ${"on-invoke".padStart(9)}`);
      for (let I of S) {
        let O = s(I.chars.always_on, E.always_on, C?.always_on);
        let M = s(I.chars.on_invoke, E.on_invoke, C?.on_invoke);
        g.push(`  ${I.name.padEnd(k)}  ${i(O).padStart(9)}  ${i(M).padStart(9)}`);
      }
      g.push("");
      g.push("  On-invoke cost is paid each time a skill or agent fires.");
      g.push("  Token counts are estimates and may differ from actual usage.");
    }
    if (C) {
      Pe("cli_plugin_details");
    } else {
      Et("cli_plugin_details", "count_tokens_unreachable");
    }
    let A = await e();
    A.render(cm.jsx(Q_, {
      children: cm.jsx(Text, {
        children: g.join(`
`)
      })
    }));
    await A.waitUntilExit();
  }
  var Tfr;
  var DK;
  var OBe;
  var cm;
  var NH = __lazy(() => {
    at();
    et();
    vut();
    ln();
    Ot();
    AYo();
    ywt();
    cV();
    je();
    gn();
    dt();
    dw();
    lm();
    Rn();
    Eo();
    ku();
    p5();
    MSe();
    Qk();
    H8();
    Cwe();
    yT();
    sNe();
    EUe();
    q3o();
    EZt();
    Kf();
    xg();
    Xk();
    w4o();
    IYo();
    elr();
    I1e();
    Zn();
    Wk();
    Bne();
    SL();
    Tfr = __toESM(pt(), 1);
    DK = require("path");
    OBe = __toESM(ot(), 1);
    cm = __toESM(ie(), 1);
  });
  function WSc(e, t) {
    let n = t ? ` The user suggested "${t}" as a case slug; use it where it fits.` : "";
    return `# Eval-authoring interview

You are running inside \`claude plugin eval init\` in the plugin at \`${e}\`. Walk the user through building an eval suite under \`evals/\`.${n} Start by reading the plugin yourself and opening with what you found.

**Hard rules**
- Wait for an explicit yes at each gate. Do NOT assume; do NOT proceed on silence.
- One step per turn. Don't dump all the steps at once.
- The plugin under test is READ-ONLY. Never Edit/Write any file under \`skills/\`, \`commands/\`, or \`.claude-plugin/\`. If the author asks you to fix the plugin, say "file that as a follow-up \u2014 I'll test the plugin as it is now." You write only under \`evals/\`.
- These floor invariants are non-negotiable, even if the author pushes back repeatedly: \u22651 should-NOT-fire case stays in the suite, every case has \u22651 outcome grader (not just \`tool_used\`), \`runs: 3\` minimum, \`--ablation with-without\` stays. When pushed, say "I can't drop that \u2014 it's what makes the result mean something." Do NOT say "I lean keep but it's your call."
- Grade outcomes (the answer reflects what the skill should produce), not trajectories (which tools were called). A \`tool_used: Skill\` grader for the plugin under test is *reported* under ablation but excluded from the score in both arms (it never moves \u0394). It's fine as a display-only trigger check alongside outcome graders; leave \`arm\` unset (the runner handles it). Do NOT make it the only grader for a case.
- Do NOT look up the format in source. The complete spec is in this prompt.

## Steps

**Step 0 \u2014 Read the plugin.** Read its README.md, SKILL.md, \`commands/*.md\`, and \`.mcp.json\` (or any MCP server manifest) if present. If README and SKILL.md disagree on what the plugin does, surface the contradiction now. Tell the user which skill(s)/command(s)/MCP-tool(s) you found and ask which ONE this eval should cover (one flow per suite, even on 4-tool MCP plugins). If the plugin is MCP-only (no skills), the eval tests the MCP tool's observable side-effect (a file, an API result, a returned shape), not whether a skill fired.

**Step 1 \u2014 Define quality.** Before sourcing inputs, ask: what does a *good* answer from this skill look like? What's a *bad* one (wrong format, over-triggers, misses the point)? What failure modes have you actually seen? This becomes the spec the graders are written against. Do NOT lift the pass criteria verbatim from SKILL.md \u2014 that's the author's spec, not the user's experience. Anchor on what a user would notice if it broke. If you do use a SKILL.md regex/format string in a grader, label it secondary (\`weight: 0.5\`) and pair it with an outcome grader as primary; never let the spec literal be the only scored check.

**Step 2 \u2014 Inputs (Gate 1).** First ask: do you have real user prompts, transcripts, or bug reports where this skill should have (or shouldn't have) fired? Real traffic is the best source; only synthesize if they have none. Never paste a SKILL.md \`> user:\` example in as a case input. After de-duplicating real-traffic inputs, you must still have \u22654 fire cases (synthesize to fill if dedup left fewer). Then collect 4-6 prompts where the skill should fire, covering at least two distinct input shapes (not five variants of the same prompt), plus 1-2 where it should NOT fire. Propose candidates from the description if they don't have any. Mention now: each input runs twice (with the plugin, then without) so the suite measures *uplift* (\u0394), not just pass rate. Show the final list; wait for explicit yes.

**Step 3 \u2014 Graders.** Propose graders as one table \u2014 a row per input, columns: case slug | prompt (short) | grader 1 (type + 1-line spec) | grader 2 | ... Use this hierarchy: \u2460 verifiable (regex/file_exists/exit code) \u2461 binary criterion \u2462 n-ary \u2463 llm rubric \u2464 preference. Use llm only when \u2460-\u2462 can't capture it; write rubrics as concrete checkable claims. For llm graders: use a sonnet-tier or larger judge (\`--judge-model sonnet\` in the run cmd). Small judges miss nuance; every advisor-graded eval that's trusted uses a big model. The judge must NOT be the agent model (self-preference). Record side-channels (cost, latency, tool-count) and note any hard ceiling. If a run errors or times out, that's a 0, but read the trace: an error often means the eval is testing the wrong thing. End with "Things I'm unsure about:" and list any grader you're not confident in. If the user tries to soften a grader so it always passes, push back once: "that would make this a vanity metric \u2014 what's the version that would catch a real regression?" If they insist, write what they asked and flag it in the unsure list.

**Step 3b \u2014 Calibrate the graders (Gate 2).** Write the case files first, then pilot the whole suite: \`claude plugin eval . --runs 1 --ablation with-without --no-scaffold\`. Read the latest \`evals/results/*/aggregate-result.json\` and check \`plugins\` is non-empty (if it's \`[]\`, the plugin didn't load and the pilot is meaningless \u2014 fix the path/target before continuing). Show the user each input, output, grade, and judge reasoning. Ask: "Would you have scored any of these differently?" If yes for even one, the rubric isn't ready \u2014 revise and re-pilot. Before the yes: confirm the side-channel ceilings (cost/latency/tool-count) are recorded in the table. Wait for explicit yes.

**Step 4 \u2014 Cost (Gate 3).** The pilot's top-level \`cost_usd\` in \`aggregate-result.json\` is what cases \xD7 1 run \xD7 2 arms actually cost. One full suite \u2248 that \xD7 \`runs\`. State the dollar figure and ask if acceptable. If a later run shows an implausible score jump, treat it as judge-gaming until spot-checked by hand.

**Step 5 \u2014 Done.** The case directories were written at Step 3b. Tell them: \`claude plugin eval . --ablation with-without\` runs the full suite; the headline number is \u0394 (with-plugin score minus without-plugin score).

## Output format (complete \u2014 do NOT look this up)

One directory per input under \`evals/\`:

\`\`\`
evals/
\u251C\u2500\u2500 01-say-hello/
\u2502   \u251C\u2500\u2500 prompt.md
\u2502   \u2514\u2500\u2500 graders/
\u2502       \u251C\u2500\u2500 greets-by-name.md
\u2502       \u2514\u2500\u2500 friendly-tone.md
\u251C\u2500\u2500 02-neg-haiku/
\u2502   \u2514\u2500\u2500 ...
\u2514\u2500\u2500 ...
\`\`\`

**prompt.md** \u2014 frontmatter: \`max_turns: int\`, \`timeout_seconds: int\`, \`allowed_tools: [string]\`, \`model: string\`, \`runs: int\` (default 3). Body = the prompt.

\`\`\`md
---
max_turns: 5
timeout_seconds: 120
allowed_tools: [Skill]
runs: 3
---
Say hello to Alex.
\`\`\`

Set \`timeout_seconds\` on every case (skills that do real work need more than the default; an under-set timeout reads as a 0 score, not a timeout). No absolute paths or \`~/\` in prompts or graders \u2014 cases run in a sandbox cwd.

**graders/<name>.md** \u2014 one file per grader. Frontmatter \`type:\` selects:

| type | frontmatter | body |
|---|---|---|
| \`regex\` | \`target: last_message\\|trace\\|files\\|{source: file, path}\`, \`match: contains\\|not_contains\\|count:N\`, \`flags\` | the pattern |
| \`file_exists\` | \`path: <glob>\`, \`exists: bool\` | (none) |
| \`llm\` | \`focus: last_message\\|trace\\|files\\|{source: file, path}\`, \`weight\` | rubric: concrete checkable claims |
| \`tool_used\` | \`tool\`, \`input_match\`, \`min\`, \`max\`, \`arm: with-only\\|both\` | (none) \u2014 see hard rule above |
| \`tool_order\` | \`before\`, \`after\` | (none) |

Defaults: \`target\`/\`focus\` = \`last_message\`, \`weight\` = 1, \`match\` = \`contains\`, \`tool_used.min\` = 1. For a "must NOT call tool X" check, set \`min: 0\`, \`max: 0\`, AND \`arm: both\` (omitting \`min\` leaves it at 1; omitting \`arm\` on \`tool: Skill\` makes it display-only under ablation).`;
  }
  function zSc() {
    return Ke.union([Ke.enum(["trace", "last_message", "files"]), Ke.discriminatedUnion("source", [Ke.object({
      source: Ke.literal("file"),
      path: Ke.string()
    }).strict()])]);
  }
  function kRt() {
    return Ke.enum(["with-only", "both"]).optional();
  }
  function KSc() {
    return Ke.union([Ke.string().transform(e => ({
      tool: e,
      input_match: undefined
    })), Ke.object({
      tool: Ke.string(),
      input_match: Ke.string().optional()
    }).strict()]);
  }
  function JSc(e) {
    if (typeof e !== "object" || e === null) {
      return {
        ok: false,
        error: "case.yaml must be a YAML object"
      };
    }
    let t = e.schema_version;
    if (typeof t !== "string") {
      return {
        ok: false,
        error: 'missing required field schema_version (e.g. "1.0")'
      };
    }
    let n = parseInt(ii(t, "."), 10);
    if (Number.isNaN(n)) {
      return {
        ok: false,
        error: `schema_version "${t}" is not a valid version string`
      };
    }
    if (n > 1) {
      return {
        ok: false,
        error: `schema_version "${t}" requires a newer Claude Code (this binary supports up to ${1}.x)`
      };
    }
    let r = PSf().safeParse(e);
    if (!r.success) {
      return {
        ok: false,
        error: `invalid case.yaml:
${r.error.issues.map(s => `  ${s.path.join(".") || "(root)"}: ${s.message}`).join(`
`)}`
      };
    }
    if (!r.data.execution.prompt && !r.data.context.history_file) {
      return {
        ok: false,
        error: "either execution.prompt or context.history_file is required"
      };
    }
    return {
      ok: true,
      case: r.data
    };
  }
  var ISf;
  var PSf;
  var OYo = __lazy(() => {
    qg();
    Zn();
    ISf = we(() => Ke.discriminatedUnion("type", [Ke.object({
      type: Ke.literal("regex"),
      name: Ke.string(),
      target: zSc().default("last_message"),
      pattern: Ke.string(),
      flags: Ke.string().regex(/^[dgimsuvy]*$/, "must be JS RegExp flags (d g i m s u v y)").default(""),
      match: Ke.union([Ke.enum(["contains", "not_contains"]), Ke.string().regex(/^count:\d+$/, "must be contains | not_contains | count:N")]).default("contains"),
      weight: Ke.number().positive().default(1),
      arm: kRt()
    }).strict(), Ke.object({
      type: Ke.literal("tool_order"),
      name: Ke.string(),
      before: KSc(),
      after: KSc(),
      weight: Ke.number().positive().default(1),
      arm: kRt()
    }).strict(), Ke.object({
      type: Ke.literal("tool_used"),
      name: Ke.string(),
      tool: Ke.string(),
      input_match: Ke.string().optional(),
      min: Ke.number().int().nonnegative().optional(),
      max: Ke.number().int().nonnegative().optional(),
      weight: Ke.number().positive().default(1),
      arm: kRt()
    }).strict(), Ke.object({
      type: Ke.literal("file_exists"),
      name: Ke.string(),
      path: Ke.string(),
      exists: Ke.boolean().default(true),
      weight: Ke.number().positive().default(1),
      arm: kRt()
    }).strict(), Ke.object({
      type: Ke.literal("llm"),
      name: Ke.string(),
      criteria: Ke.string(),
      focus: zSc().default("last_message"),
      weight: Ke.number().positive().default(1),
      arm: kRt()
    }).strict(), Ke.object({
      type: Ke.literal("baseline"),
      name: Ke.string(),
      baseline_file: Ke.string(),
      criteria: Ke.string(),
      weight: Ke.number().positive().default(1),
      arm: kRt()
    }).strict()]));
    PSf = we(() => Ke.object({
      schema_version: Ke.string(),
      name: Ke.string().min(1),
      description: Ke.string().optional(),
      tags: Ke.array(Ke.string()).default([]),
      plugins: Ke.array(Ke.string()).optional(),
      context: Ke.object({
        scaffold_script: Ke.string().optional(),
        history_file: Ke.string().optional(),
        add_dirs: Ke.array(Ke.string()).default([])
      }).default({
        add_dirs: []
      }),
      execution: Ke.object({
        prompt: Ke.string().optional(),
        max_turns: Ke.number().int().positive().max(200).default(10),
        timeout_seconds: Ke.number().int().positive().max(3600).default(300),
        model: Ke.string().optional(),
        allowed_tools: Ke.array(Ke.string()).default([]),
        append_system_prompt: Ke.string().optional(),
        env: Ke.record(Ke.string(), Ke.string()).default({})
      }),
      runs: Ke.number().int().positive().max(50).default(3),
      graders: Ke.array(ISf()).min(1).superRefine((e, t) => {
        let n = new Set();
        for (let r of e) {
          if (n.vZc(r.name)) {
            t.addIssue({
              code: Ke.ZodIssueCode.custom,
              message: `duplicate grader name "${r.name}"`
            });
          }
          n.add(r.name);
        }
      }),
      expected_outcome: Ke.string().optional()
    }));
  });
  async function nTc(e) {
    let t = MK.default.join(e, "prompt.md");
    let n = MK.default.join(e, "graders");
    let [r, o] = await Promise.all([eTc(t), NSf(n)]);
    if (r === null && o.length === 0) {
      return null;
    }
    let s = {
      top: {},
      execution: {},
      graders: []
    };
    if (r !== null) {
      let {
        fm: a,
        body: l
      } = ZSc(r, t);
      let c = l.trim();
      if (c.length > 0) {
        s.prompt = c;
      }
      for (let [u, d] of Object.entries(a)) {
        if (XSc.vZc(u)) {
          s.top[u] = d;
        } else if (QSc.vZc(u)) {
          s.execution[u] = d;
        } else {
          throw new Po(`${MK.default.relative(e, t)}: unknown frontmatter key "${u}" (expected one of: ${[...XSc, ...QSc].join(", ")})`, "prompt.md: unknown frontmatter key");
        }
      }
    }
    let i = await Promise.all(o.map(eTc));
    for (let a = 0; a < o.length; a++) {
      let l = o[a];
      let c = i[a];
      if (c == null) {
        continue;
      }
      let {
        fm: u,
        body: d,
        hadFrontmatter: p
      } = ZSc(c, l);
      if (!p) {
        continue;
      }
      let m = MK.default.basename(l, ".md");
      if (typeof u.type !== "string") {
        throw new Po(`${MK.default.relative(e, l)}: frontmatter must include "type:" (regex | tool_order | tool_used | file_exists | llm | baseline)`, "grader .md: frontmatter missing type");
      }
      s.graders.push(MSf(m, u, d.trim()));
    }
    if (s.prompt === undefined && s.graders.length === 0 && Object.keys(s.top).length === 0 && Object.keys(s.execution).length === 0) {
      return null;
    }
    return s;
  }
  function rTc(e, t, n) {
    let r = e ?? {
      schema_version: "1.1",
      name: MK.default.basename(n)
    };
    let o = {
      ...r,
      ...t.top
    };
    let s = typeof r.execution === "object" && r.execution !== null ? r.execution : {};
    if (o.execution = {
      ...s,
      ...t.execution,
      ...(t.prompt !== undefined && {
        prompt: t.prompt
      })
    }, t.graders.length > 0) {
      o.graders = [...(Array.isArray(r.graders) ? r.graders : []), ...t.graders];
    }
    return o;
  }
  function MSf(e, t, n) {
    let r = {
      name: e,
      ...t
    };
    let o = typeof t.type === "string" ? DSf[t.type] : undefined;
    if (o && r[o] === undefined && n.length > 0) {
      r[o] = n;
    }
    return r;
  }
  function ZSc(e, t) {
    let n = e.match(Kne);
    if (!n) {
      if (/^---\s*\n/.test(e)) {
        throw new Po(`${MK.default.basename(t)}: unterminated frontmatter (opening "---" with no closing "---")`, "prose .md: unterminated frontmatter");
      }
      return {
        fm: {},
        body: e,
        hadFrontmatter: false
      };
    }
    let r;
    try {
      r = Zj(n[1] ?? "");
    } catch (o) {
      throw new Po(`${MK.default.basename(t)}: invalid YAML frontmatter: ${o instanceof Error ? o.message : String(o)}`, "prose .md: invalid YAML frontmatter");
    }
    if (r === null || r === undefined) {
      return {
        fm: {},
        body: e.slice(n[0].length),
        hadFrontmatter: true
      };
    }
    if (typeof r !== "object" || Array.isArray(r)) {
      throw new Po(`${MK.default.basename(t)}: frontmatter must be a YAML object`, "prose .md: frontmatter not a YAML object");
    }
    return {
      fm: r,
      body: e.slice(n[0].length),
      hadFrontmatter: true
    };
  }
  async function DYo(e, t, n) {
    let r;
    try {
      r = await Efr.open(e, "r");
    } catch (o) {
      if (fn(o)) {
        return null;
      }
      throw o;
    }
    try {
      let {
        size: o
      } = await r.stat();
      if (o > t) {
        throw new Po(`${MK.default.basename(e)} is ${o} bytes (cap: ${t})`, `${n}: over size cap`);
      }
      return await r.readFile({
        encoding: "utf8"
      });
    } finally {
      await r.close();
    }
  }
  async function eTc(e) {
    return DYo(e, 1048576, "prose .md");
  }
  async function NSf(e) {
    let t;
    try {
      t = await Efr.readdir(e, {
        withFileTypes: true
      });
    } catch (r) {
      if (fn(r)) {
        return [];
      }
      throw r;
    }
    let n = t.filter(r => r.isFile() && r.name.endsWith(".md")).map(r => MK.default.join(e, r.name)).sort();
    if (n.length > 256) {
      throw new Po(`${MK.default.basename(e)}/ has ${n.length} .md files (cap: ${256})`, "graders/: over file-count cap");
    }
    return n;
  }
  var Efr;
  var MK;
  var XSc;
  var QSc;
  var DSf;
  var oTc = __lazy(() => {
    dt();
    fv();
    OYo();
    Efr = require("fs/promises");
    MK = __toESM(require("path"));
    XSc = new Set(["schema_version", "name", "description", "tags", "plugins", "runs", "expected_outcome"]);
    QSc = new Set(["model", "max_turns", "timeout_seconds", "allowed_tools", "append_system_prompt", "env"]);
    DSf = {
      llm: "criteria",
      baseline: "criteria",
      regex: "pattern"
    };
  });
  async function aTc(e, t = {}) {
    let n;
    try {
      n = await ER.realpath(OE.default.resolve(e));
    } catch (a) {
      if (fn(a) || Io(a)) {
        return {
          cases: [],
          root: OE.default.resolve(e),
          errors: [{
            file: OE.default.resolve(e),
            error: "no such file or directory (or not readable)"
          }]
        };
      }
      throw a;
    }
    let r;
    if (cTc(OE.default.basename(n))) {
      let a = OE.default.dirname(n);
      r = (await lTc(a, null)) ?? a;
    } else {
      r = n;
    }
    let o = await jSf(n);
    let s = [];
    let i = [];
    for (let a of o) {
      let l = OE.default.join(a, "case.yaml");
      try {
        let [c, u] = await Promise.all([HSf(l), nTc(a)]);
        let d = u ? rTc(c, u, a) : c;
        let p = u && c ? "mixed" : u ? "prose" : "case_yaml";
        let m = JSc(d);
        if (!m.ok) {
          i.push({
            file: c !== null ? l : a,
            error: m.error
          });
          continue;
        }
        s.push(await BSf(m.case, l, r, p));
      } catch (c) {
        i.push({
          file: a,
          error: c instanceof Error ? c.message : String(c)
        });
      }
    }
    return {
      cases: s.filter(a => FSf(a, t)),
      errors: i,
      root: r
    };
  }
  function FSf(e, t) {
    if (t.caseGlob && !USf(t.caseGlob, e.name)) {
      return false;
    }
    if (t.tags && t.tags.length > 0) {
      if (!t.tags.some(n => e.tags.includes(n))) {
        return false;
      }
    }
    return true;
  }
  function USf(e, t) {
    return new RegExp(`^${e.replace(/[.+^${}()|[\]\\]/g, "\\$&").replace(/\*/g, ".*").replace(/\?/g, ".")}$`).test(t);
  }
  async function BSf(e, t, n, r) {
    let o = OE.default.dirname(t);
    let s;
    if (e.plugins && e.plugins.length > 0) {
      s = [];
      for (let i of e.plugins) {
        let a = OE.default.isAbsolute(i) ? i : OE.default.resolve(o, i);
        let l = await ER.realpath(a);
        if (!$Sf(l, n)) {
          throw Error(`case "${e.name}": plugins entry "${i}" resolves to ${l}, outside the discovery root ${n}. Only plugins under the path you ran 'claude plugin eval' against can be loaded from case.yaml.`);
        }
        s.push(l);
      }
    } else {
      let i = await lTc(o, n);
      s = i ? [i] : [];
    }
    return {
      ...e,
      caseFile: t,
      caseDir: o,
      caseSource: r,
      pluginDirs: s
    };
  }
  function $Sf(e, t) {
    return e === t || e.startsWith(`${t}${OE.default.sep}`);
  }
  async function lTc(e, t) {
    let n = e;
    for (let r = 0; r < 32; r++) {
      if ((await sTc(OE.default.join(n, "plugin.json"))) || (await sTc(OE.default.join(n, ".claude-plugin", "plugin.json")))) {
        return n;
      }
      if (n === t) {
        return null;
      }
      let o = OE.default.dirname(n);
      if (o === n) {
        return null;
      }
      n = o;
    }
    return null;
  }
  async function sTc(e) {
    try {
      await ER.stat(e);
      return true;
    } catch (t) {
      if (fn(t) || Io(t)) {
        return false;
      }
      return true;
    }
  }
  async function HSf(e) {
    let t = await DYo(e, 1048576, "case.yaml");
    if (t === null) {
      return null;
    }
    let n;
    try {
      n = Zj(t);
    } catch (r) {
      throw new Po(`YAML parse failed: ${String(r)}`, "case.yaml: YAML parse failed");
    }
    if (n === null || n === undefined) {
      return null;
    }
    if (typeof n !== "object" || Array.isArray(n)) {
      throw Error("case.yaml must be a YAML object");
    }
    return n;
  }
  function cTc(e) {
    return e === "case.yaml" || e === "prompt.md";
  }
  async function jSf(e) {
    if (cTc(OE.default.basename(e))) {
      return [OE.default.dirname(e)];
    }
    let t = new Set();
    await uTc(e, t, 0, e.split(OE.default.sep).includes("evals"));
    return [...t].sort();
  }
  async function uTc(e, t, n, r) {
    if (n > 16) {
      return;
    }
    let o;
    try {
      o = await ER.readdir(e, {
        withFileTypes: true
      });
    } catch (s) {
      if (Io(s)) {
        return;
      }
      throw s;
    }
    if (r && o.some(s => s.isFile() && (s.name === "case.yaml" || s.name === "prompt.md"))) {
      t.add(e);
      return;
    }
    for (let s of o) {
      if (s.isDirectory() && !qSf.vZc(s.name)) {
        await uTc(OE.default.join(e, s.name), t, n + 1, r || s.name === "evals");
      }
    }
  }
  async function dTc() {
    let e = await ER.mkdtemp(OE.default.join(iTc.default.tmpdir(), "claude-eval-"));
    let t = OE.default.join(e, "cwd");
    let n = OE.default.join(e, "config");
    let r = OE.default.join(e, "home");
    let o = OE.default.join(e, "out");
    await ER.mkdir(t, {
      recursive: true
    });
    await ER.mkdir(n, {
      recursive: true
    });
    await ER.mkdir(r, {
      recursive: true
    });
    await ER.mkdir(o, {
      recursive: true
    });
    await ER.writeFile(OE.default.join(n, ".claude.json"), De({
      hasCompletedOnboarding: true,
      autoUpdates: false,
      bypassPermissionsModeAccepted: false
    }));
    await ER.writeFile(OE.default.join(r, ".gitconfig"), `[user]
	name = Plugin Eval
	email = eval@example.invalid
`);
    return {
      root: e,
      cwd: t,
      configDir: n,
      home: r,
      outDir: o,
      cleanup: async () => {
        await pTc(e);
        try {
          await ER.rm(e, {
            recursive: true,
            force: true,
            maxRetries: 2
          });
        } catch {}
      }
    };
  }
  async function pTc(e) {
    let t;
    try {
      await ER.chmod(e, 448);
      t = await ER.readdir(e, {
        withFileTypes: true
      });
    } catch {
      return;
    }
    for (let n of t) {
      if (n.isDirectory()) {
        await pTc(OE.default.join(e, n.name));
      }
    }
  }
  async function mTc(e) {
    let t = OE.default.join(e.configDir, ".credentials.json");
    try {
      await ER.copyFile(OE.default.join(er(), ".credentials.json"), t);
      return;
    } catch (r) {
      if (!fn(r) && !Io(r)) {
        throw r;
      }
    }
    let n = await yl().readAsync();
    if (!n) {
      return;
    }
    await ER.writeFile(t, De(n), {
      mode: 384
    });
  }
  var ER;
  var iTc;
  var OE;
  var qSf;
  var fTc = __lazy(() => {
    gn();
    dt();
    DW();
    oTc();
    OYo();
    ER = require("fs/promises");
    iTc = __toESM(require("os"));
    OE = __toESM(require("path"));
    qSf = new Set(["node_modules", ".git", ".claude", "results"]);
  });
  function bTc(e, t) {
    let n = [];
    let r = [];
    for (let s of t) {
      n.push(s);
    }
    let o = new Set(t.map(hTc));
    for (let s of e) {
      let i = hTc(s);
      if (WSf.vZc(i)) {
        n.push(s);
      } else if (!o.vZc(i)) {
        r.push(s);
      }
    }
    return {
      allowed: Ro(n),
      denied: Ro(r)
    };
  }
  function hTc(e) {
    let t = e.indexOf("(");
    return t === -1 ? e : e.slice(0, t);
  }
  async function STc(e) {
    let {
      case_: t,
      sandbox: n,
      allowedTools: r,
      modelOverride: o,
      verbose: s,
      signal: i
    } = e;
    let a = DBe.default.join(n.outDir, "trace.jsonl");
    let l = await GSf(t, r, o);
    let c = zSf(t, n);
    let u = process.execPath;
    let p = [...(rm() || !process.argv[1] ? [] : [process.argv[1]]), ...l];
    return await new Promise(m => {
      let f = [];
      let h = "";
      let g = 0;
      let y = "";
      let _ = false;
      let b = false;
      let S = false;
      let E = t.execution.timeout_seconds * 1000;
      let C = yTc.spawn(u, p, {
        cwd: n.cwd,
        env: c,
        stdio: ["ignore", "pipe", "pipe"],
        windowsHide: true
      });
      let x = setTimeout(() => {
        _ = true;
        C.kill("SIGKILL");
      }, E);
      let A = false;
      let k = () => {
        A = true;
        C.kill("SIGKILL");
      };
      if (i.aborted) {
        k();
      } else {
        i.addEventListener("abort", k, {
          once: true
        });
      }
      C.stdout.setEncoding("utf8");
      C.stdout.on("data", O => {
        if (g += O.length, g > 67108864) {
          if (!b) {
            b = true;
            C.kill("SIGKILL");
          }
          return;
        }
        h += O;
        let M;
        while ((M = h.indexOf(`
`)) !== -1) {
          let L = h.slice(0, M).trim();
          if (h = h.slice(M + 1), !L) {
            continue;
          }
          try {
            let P = qt(L);
            if (f.push(P), s) {
              logForDebugging(`eval trace: ${P.type}`);
            }
          } catch {}
        }
      });
      C.stderr.setEncoding("utf8");
      C.stderr.on("data", O => {
        if (y.length < 65536) {
          y += O;
        }
      });
      function I(O, M) {
        if (S) {
          return;
        }
        S = true;
        clearTimeout(x);
        i.removeEventListener("abort", k);
        let L = KSf(f, O, _, M, a);
        Xnn.writeFile(a, f.map(P => De(P)).join(`
`)).catch(() => {}).then(() => m(L));
      }
      C.on("error", O => I(null, String(O)));
      C.on("close", O => {
        let M = A ? "interrupted" : b ? `subprocess stdout exceeded ${67108864} bytes \u2014 killed` : _ ? `timed out after ${t.execution.timeout_seconds}s` : O !== 0 ? `exit ${O}: ${y.slice(-2000) || "(no stderr)"}` : null;
        I(O, M);
      });
    });
  }
  async function GSf(e, t, n) {
    let r = ["-p"];
    if (e.execution.prompt) {
      r.push(e.execution.prompt);
    }
    r.push("--output-format", "stream-json");
    r.push("--verbose");
    r.push("--max-turns", String(e.execution.max_turns));
    r.push("--permission-mode", "dontAsk");
    let o = n ?? e.execution.model;
    if (o) {
      r.push("--model", o);
    }
    for (let s of e.pluginDirs) {
      r.push("--plugin-dir", s);
    }
    if (t.length > 0) {
      r.push("--allowed-tools", t.join(","));
    }
    if (e.context.history_file) {
      r.push("--resume", await ARt(e, e.context.history_file));
    }
    for (let s of e.context.add_dirs) {
      r.push("--add-dir", await ARt(e, s));
    }
    if (e.execution.append_system_prompt) {
      r.push("--append-system-prompt", e.execution.append_system_prompt);
    }
    return r;
  }
  async function ARt(e, t) {
    return MYo(e.caseDir, t, `case "${e.name}"`, "case directory");
  }
  async function MYo(e, t, n, r) {
    let o = DBe.default.resolve(e, t);
    let s;
    let i;
    try {
      s = await Xnn.realpath(e);
      i = await Xnn.realpath(o);
    } catch (l) {
      if (fn(l)) {
        throw Error(`${n}: path "${t}" does not exist (resolved to ${o})`);
      }
      throw l;
    }
    let a = `${s}${DBe.default.sep}`;
    if (i !== s && !i.startsWith(a)) {
      throw Error(`${n}: path "${t}" escapes the ${r} (resolves to ${i}, must stay under ${s})`);
    }
    return i;
  }
  function zSf(e, t) {
    for (let o of Object.keys(e.execution.env)) {
      if (!VSf.test(o)) {
        throw Error(`case "${e.name}" execution.env key "${o}" is not allowed \u2014 only EVAL_* keys can be set from case.yaml. Anything else must come from the operator's shell.`);
      }
    }
    let n = {
      ...subprocessEnv(),
      ...e.execution.env,
      CLAUDE_CONFIG_DIR: t.configDir,
      HOME: t.home,
      USERPROFILE: t.home,
      XDG_CONFIG_HOME: DBe.default.join(t.home, ".config"),
      CLAUDE_CODE_MANAGED_SETTINGS_PATH: t.configDir,
      CLAUDE_CODE_DISABLE_CLAUDE_MDS: "1",
      CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC: "1",
      DISABLE_AUTOUPDATER: "1"
    };
    let r = _Tc.default.homedir();
    n.AWS_SHARED_CREDENTIALS_FILE ??= DBe.default.join(r, ".aws", "credentials");
    n.AWS_CONFIG_FILE ??= DBe.default.join(r, ".aws", "config");
    n.CLOUDSDK_CONFIG ??= DBe.default.join(r, ".config", "gcloud");
    for (let o of Hnn) {
      delete n[o];
    }
    delete n.CLAUDE_CODE_SKIP_PROMPT_HISTORY;
    return n;
  }
  function KSf(e, t, n, r, o) {
    let s = [];
    let i = "";
    let a = 0;
    let l = 0;
    for (let c of e) {
      if (c.type === "assistant") {
        let u = c.message?.content;
        if (Array.isArray(u)) {
          let d = [];
          for (let p of u) {
            if (p?.type === "tool_use") {
              let m = p.input;
              s.push({
                name: String(p.name ?? ""),
                input: m,
                inputText: YSf(m)
              });
            } else if (p?.type === "text") {
              d.push(String(p.text ?? ""));
            }
          }
          if (d.length > 0) {
            i = d.join(`
`);
          }
        }
      } else if (c.type === "result") {
        let u = c;
        a = u.num_turns ?? a;
        l = u.total_cost_usd ?? l;
      }
    }
    return {
      trace: e,
      toolCalls: s,
      lastAssistantText: i,
      numTurns: a,
      costUsd: l,
      exitCode: t,
      timedOut: n,
      error: r,
      tracePath: o
    };
  }
  function YSf(e) {
    try {
      return De(e) ?? "";
    } catch {
      return "";
    }
  }
  var yTc;
  var Xnn;
  var _Tc;
  var DBe;
  var WSf;
  var VSf;
  var NYo = __lazy(() => {
    Qmr();
    je();
    dt();
    s1();
    yTc = require("child_process");
    Xnn = require("fs/promises");
    _Tc = __toESM(require("os"));
    DBe = __toESM(require("path"));
    WSf = new Set(["Read", "Glob", "Grep", "NotebookRead", "Skill", "AskUserQuestion", "Task", "TaskCreate", "TaskGet", "TaskList", "TaskUpdate", "TaskStop", "TaskOutput", "Agent", "TodoWrite"]);
    VSf = /^EVAL_[A-Z0-9_]*$/;
  });
  function JSf(e) {
    return e.arm === undefined && e.type === "tool_used" && e.tool === "Skill";
  }
  async function vTc(e) {
    let t = [];
    let n = getTotalCostUSD();
    let r = a => a.arm === "with-only" || JSf(a);
    let o = e.case_.graders.every(r);
    let s = e.arm === "without" && !o ? e.case_.graders.filter(a => !r(a)) : e.case_.graders;
    let i = !!e.skipPaidGraders && s.some(a => a.type === "llm" || a.type === "baseline");
    for (let a of s) {
      let l = await XSf(a, e);
      if (e.arm !== undefined && !o && r(a)) {
        l.with_only = true;
      }
      t.push(l);
    }
    return {
      results: t,
      judgeCostUsd: getTotalCostUSD() - n,
      paidGradersSkipped: i
    };
  }
  async function XSf(e, t) {
    try {
      switch (e.type) {
        case "regex":
          return await QSf(e, t);
        case "tool_order":
          return ZSf(e, t);
        case "tool_used":
          return eTf(e, t);
        case "file_exists":
          return tTf(e, t);
        case "llm":
        case "baseline":
          if (t.skipPaidGraders) {
            return {
              name: e.name,
              passed: false,
              weight: e.weight,
              explanation: "skipped: cost ceiling"
            };
          }
          return e.type === "llm" ? await sTf(e, t) : await iTf(e, t);
      }
    } catch (n) {
      return {
        name: e.name,
        passed: false,
        weight: e.weight,
        explanation: `grader threw: ${he(n)}`
      };
    }
  }
  async function QSf(e, t) {
    let n = await CTc(e.target, t);
    let r = RTc(e.target);
    let o = new RegExp(e.pattern, e.flags);
    let s = e.flags.includes("g") ? e.flags : `${e.flags}g`;
    let i = n.match(new RegExp(e.pattern, s)) ?? [];
    let a;
    let l;
    if (e.match === "contains") {
      a = o.test(n);
      l = a ? `matched ${e.pattern}` : `pattern not found in ${r}`;
    } else if (e.match === "not_contains") {
      a = !o.test(n);
      l = a ? "pattern absent as expected" : "pattern found (expected absent)";
    } else if (e.match.startsWith("count:")) {
      let c = parseInt(e.match.slice(6), 10);
      a = i.length === c;
      l = `found ${i.length} matches (expected ${c})`;
    } else {
      a = false;
      l = `unknown match mode "${e.match}" (use contains | not_contains | count:N)`;
    }
    return {
      name: e.name,
      passed: a,
      weight: e.weight,
      explanation: l
    };
  }
  function ZSf(e, {
    run: t
  }) {
    let n = TTc(t.toolCalls, e.before);
    let r = TTc(t.toolCalls, e.after);
    if (n === -1) {
      return vfr(e, `"before" tool ${e.before.tool} never called`);
    }
    if (r === -1) {
      return vfr(e, `"after" tool ${e.after.tool} never called`);
    }
    let o = n < r;
    return {
      name: e.name,
      passed: o,
      weight: e.weight,
      explanation: o ? `${e.before.tool}@${n} precedes ${e.after.tool}@${r}` : `${e.before.tool}@${n} does NOT precede ${e.after.tool}@${r}`
    };
  }
  function eTf(e, {
    run: t
  }) {
    let n = {
      tool: e.tool,
      input_match: e.input_match
    };
    let r = Bn(t.toolCalls, a => wTc(a, n));
    let o = e.min ?? 1;
    let s = e.max ?? Number.POSITIVE_INFINITY;
    let i = r >= o && r <= s;
    return {
      name: e.name,
      passed: i,
      weight: e.weight,
      explanation: `${e.tool} called ${r}x (expected ${o}..${s === Number.POSITIVE_INFINITY ? "\u221E" : s})`
    };
  }
  function tTf(e, {
    cwdDiff: t
  }) {
    let n = rTf(e.path);
    let r = (t ?? "").split(`
`).some(s => n.test(s.trim()));
    let o = r === e.exists;
    return {
      name: e.name,
      passed: o,
      weight: e.weight,
      explanation: o ? `${e.path} ${e.exists ? "exists" : "absent"} as expected` : `${e.path} ${r ? "exists" : "missing"} (expected ${e.exists ? "present" : "absent"})`
    };
  }
  function TTc(e, t) {
    return e.findIndex(n => wTc(n, t));
  }
  function wTc(e, t) {
    if (e.name !== t.tool) {
      return false;
    }
    if (t.input_match) {
      return new RegExp(t.input_match).test(e.inputText);
    }
    return true;
  }
  function rTf(e) {
    let t = "^";
    for (let n = 0; n < e.length; n++) {
      let r = e.charAt(n);
      if (r === "*") {
        if (e.charAt(n + 1) === "*") {
          if (e.charAt(n + 2) === "/") {
            t += "(?:.*/)?";
            n += 2;
          } else {
            t += ".*";
            n++;
          }
        } else {
          t += "[^/]*";
        }
      } else if (r === "?") {
        t += ".";
      } else if (nTf.vZc(r)) {
        t += `\\${r}`;
      } else {
        t += r;
      }
    }
    return new RegExp(`${t}$`);
  }
  function vfr(e, t) {
    return {
      name: e.name,
      passed: false,
      weight: e.weight,
      explanation: t
    };
  }
  async function CTc(e, {
    run: t,
    cwdDiff: n,
    sandboxCwd: r,
    case_: o,
    signal: s
  }) {
    if (typeof e === "object") {
      let i = await MYo(r, e.path, `case "${o.name}" grader focus file "${e.path}"`, "run sandbox");
      let a = await IRt.stat(i);
      if (!a.isFile()) {
        throw new Po(`focus file ${e.path} is not a regular file`, "grader focus file is not a regular file");
      }
      if (a.size > 10485760) {
        throw new Po(`focus file ${e.path} is ${a.size} bytes (cap: ${10485760})`, "grader focus file exceeds the size cap");
      }
      return await IRt.readFile(i, {
        encoding: "utf8",
        signal: s
      });
    }
    if (e === "last_message") {
      return t.lastAssistantText;
    }
    if (e === "files") {
      return n ?? "";
    }
    return t.trace.map(i => De(i)).join(`
`);
  }
  function RTc(e) {
    return typeof e === "object" ? `file ${e.path}` : e;
  }
  async function sTf(e, t) {
    let n = e.focus === "trace" ? UYo(t.run.trace) : await CTc(e.focus, t);
    let r = e.focus === "files" && n === "" ? "(no file changes)" : n;
    let o = r.length > 1e5 ? `${pC(r, 1e5 - 20000)}
[\u2026${r.length - 1e5} chars elided\u2026]
${qge(r, 20000)}` : r;
    let s = ["You are grading the output of a coding agent against a criterion.", `Criterion:
${e.criteria}`, `
Agent output (${RTc(e.focus)}):
${o}`, `
Respond with exactly one word: PASS or FAIL.`].join(`

`);
    let i = await xTc(s, t);
    let a = Bn(i, Boolean) > i.length / 2;
    let l = 2000 / 2;
    let c = o.length > 2000 ? `${pC(o, l)}
[\u2026${o.length - 2000} chars elided\u2026]
${qge(o, l)}` : o;
    return {
      name: e.name,
      passed: a,
      weight: e.weight,
      explanation: `judge votes: ${i.map(u => u ? "PASS" : "FAIL").join(" ")}`,
      judge_votes: i,
      evidence: c
    };
  }
  async function iTf(e, t) {
    let {
      case_: n,
      run: r
    } = t;
    let o;
    try {
      let l = await ARt(n, e.baseline_file);
      let c = await IRt.stat(l);
      if (c.size > 10485760) {
        return vfr(e, `baseline file ${e.baseline_file} is ${c.size} bytes (cap: ${10485760})`);
      }
      o = (await IRt.readFile(l, "utf8")).split(`
`).filter(d => d.trim()).map(d => qt(d));
    } catch (l) {
      return vfr(e, `failed to read baseline: ${l instanceof Error ? l.message : String(l)}`);
    }
    let s = ["You are comparing a NEW coding-agent trajectory against a BASELINE.", `Criterion:
${e.criteria}`, `
BASELINE trajectory:
${UYo(o)}`, `
NEW trajectory:
${UYo(r.trace)}`, `
Does the NEW trajectory satisfy the criterion at least as well as the BASELINE?`, "Respond with exactly one word: PASS or FAIL."].join(`

`);
    let i = await xTc(s, t);
    let a = Bn(i, Boolean) > i.length / 2;
    return {
      name: e.name,
      passed: a,
      weight: e.weight,
      explanation: `judge votes: ${i.map(l => l ? "PASS" : "FAIL").join(" ")}`,
      judge_votes: i
    };
  }
  async function xTc(e, t) {
    let n = [];
    for (let r = 0; r < 3; r++) {
      let o = await aTf(e, t);
      n.push(/\bPASS\b/i.test(o) && !/\bFAIL\b/i.test(o));
    }
    return n;
  }
  async function aTf(e, t) {
    let n = ["You are a strict, terse evaluation judge for coding-agent traces."];
    let r = {
      querySource: "plugin_eval_judge",
      agents: [],
      isNonInteractiveSession: true,
      hasAppendSystemPrompt: false,
      mcpTools: [],
      agentContext: ym()
    };
    let o = t.judgeModel && Sk(t.judgeModel.toLowerCase().trim()) ? parseUserSpecifiedModel(t.judgeModel) : t.judgeModel;
    let s = o ? await sFe({
      systemPrompt: n,
      userPrompt: e,
      signal: t.signal,
      options: {
        ...r,
        model: o
      }
    }) : await RO({
      systemPrompt: n,
      userPrompt: e,
      signal: t.signal,
      options: r
    });
    let i = Tl(s.message.content);
    if (Snn(s)) {
      throw new Po(`judge call failed: ${i}`, "plugin eval judge call failed");
    }
    return i;
  }
  function UYo(e) {
    if (e.length <= 24) {
      return e.map(s => De(s)).join(`
`);
    }
    let r = e.slice(0, 12).map(s => De(s));
    let o = e.slice(-12).map(s => De(s));
    return [...r, `[\u2026${e.length - 12 - 12} messages elided\u2026]`, ...o].join(`
`);
  }
  var IRt;
  var nTf;
  var kTc = __lazy(() => {
    at();
    _h();
    dt();
    ro();
    Tk();
    Eo();
    Zn();
    aE();
    NYo();
    IRt = require("fs/promises");
    nTf = new Set(".+^${}()|[]\\");
  });
  function PTc(e) {
    let t = 0;
    let n = 0;
    for (let r of e) {
      if (r.with_only) {
        continue;
      }
      if (n += r.weight, r.passed) {
        t += r.weight;
      }
    }
    return n > 0 ? t / n : 0;
  }
  function BYo(e) {
    if (e.length === 0) {
      return {
        score: 0,
        passRate: 0
      };
    }
    let t = e.reduce((r, o) => r + o.score, 0) / e.length;
    let n = Bn(e, r => r.score >= 1) / e.length;
    return {
      score: t,
      passRate: n
    };
  }
  function OTc(e) {
    let t = [];
    let n = Math.max(4, ...e.cases.map(s => an(s.name)));
    let r = e.cases.some(s => s.runs_without !== undefined);
    if (r) {
      t.push(K0("CASE", n) + "  " + K0("WITH", 6) + K0("W/OUT", 6) + K0("\u0394", 7) + K0("RUNS", 5) + K0("COST", 8) + "NOTES");
    } else {
      t.push(K0("CASE", n) + "  " + K0("SCORE", 6) + K0("PASS%", 6) + K0("RUNS", 5) + K0("COST", 8) + "NOTES");
    }
    for (let s of e.cases) {
      let i = s.runs.length + (s.runs_without?.length ?? 0);
      let a = s.runs.reduce((c, u) => c + u.cost_usd, 0) + (s.runs_without?.reduce((c, u) => c + u.cost_usd, 0) ?? 0);
      let l = lTf(s);
      if (r) {
        let {
          score_without: c,
          delta: u
        } = s;
        t.push(K0(s.name, n) + "  " + K0(s.score.toFixed(2), 6) + K0(c !== undefined ? c.toFixed(2) : "\u2014", 6) + K0(u !== undefined ? ATc(u) : "\u2014", 7) + K0(String(i), 5) + K0(`$${a.toFixed(2)}`, 8) + (l ?? ""));
      } else {
        t.push(K0(s.name, n) + "  " + K0(s.score.toFixed(2), 6) + K0(`${Math.round(s.pass_rate * 100)}%`, 6) + K0(String(s.runs.length), 5) + K0(`$${a.toFixed(2)}`, 8) + (l ?? ""));
      }
    }
    t.push("");
    let o = e.partial ? ` \xB7 \u26A0 partial (${e.partial_reason === "interrupted" ? "interrupted" : "cost ceiling hit"})` : "";
    if (r) {
      let s = e.cases.filter(i => i.delta !== undefined);
      if (s.length > 0) {
        let i = s.reduce((a, l) => a + (l.delta ?? 0), 0) / s.length;
        t.push(`${e.cases.length} case(s) \xB7 mean \u0394 ${ATc(i)} \xB7 ${e.duration_seconds}s \xB7 $${e.cost_usd.toFixed(2)}${o}`);
        return t.join(`
`);
      }
    }
    t.push(`${e.cases.length} case(s) \xB7 ${e.duration_seconds}s \xB7 $${e.cost_usd.toFixed(2)}${o}`);
    return t.join(`
`);
  }
  function ATc(e) {
    return `${e > 0 ? "+" : ""}${e.toFixed(2)}`;
  }
  function lTf(e) {
    let t = null;
    for (let n of e.runs) {
      for (let r of n.graders) {
        if (!r.passed && (!t || r.weight > t.weight)) {
          t = r;
        }
      }
      if (n.error) {
        return n.error;
      }
    }
    return t ? `${t.name}: ${t.explanation}` : null;
  }
  function K0(e, t) {
    let n = an(e);
    return n > t ? `${e} ` : e + hm(" ", t - n);
  }
  function $Yo(e, t, n, r) {
    let o = new Set();
    let s = [];
    for (let {
      case_: a
    } of e) {
      for (let l of a.pluginDirs) {
        if (o.vZc(l)) {
          continue;
        }
        o.add(l);
        s.push({
          name: ITc.default.basename(l),
          path: l
        });
      }
    }
    let i = e.reduce((a, {
      report: l
    }) => a + l.runs.reduce((c, u) => c + u.cost_usd, 0) + (l.runs_without?.reduce((c, u) => c + u.cost_usd, 0) ?? 0), 0);
    return {
      schema_version: "1.0",
      claude_version: r,
      started_at: t.toISOString(),
      duration_seconds: Math.round((Date.now() - t.getTime()) / 1000),
      cost_usd: i,
      partial: n !== undefined,
      partial_reason: n,
      plugins: s,
      cases: e.map(a => a.report)
    };
  }
  var ITc;
  var HYo = __lazy(() => {
    bc();
    Zn();
    ITc = __toESM(require("path"));
  });
  async function LTc(e) {
    let t = new Date();
    let {
      cases: n,
      errors: r,
      root: o
    } = await aTc(e.rootPath, {
      caseGlob: e.caseGlob,
      tags: e.tags
    });
    for (let d of r) {
      e.onLine(`\u2717 ${d.file}: ${d.error}`);
    }
    if (n.length === 0) {
      return {
        report: $Yo([], t, undefined, {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION),
        exitCode: r.length > 0 ? 1 : 0,
        errors: r,
        root: o
      };
    }
    uTf(n, e.onLine);
    let s = e.ablation === "with-without" ? ["with", "without"] : ["with"];
    if (s.length > 1) {
      let d = n.reduce((p, m) => p + (e.runs ?? m.runs) * s.length, 0);
      e.onLine(`Ablation: ${s.length} arms \xD7 ${n.length} ${un(n.length, "case")} (${d} ${un(d, "run")})`);
    }
    let i = {
      spent: 0,
      partialReason: undefined
    };
    let a = [];
    for (let d of n) {
      if (i.partialReason) {
        break;
      }
      let p = e.runs ?? d.runs;
      let m = bTc(d.execution.allowed_tools, e.allowTools);
      if (m.denied.length > 0) {
        e.onLine(`  ${d.name}: denied tools (pass --allow-tools to grant): ${m.denied.join(", ")}`);
      }
      let f = new Map();
      for (let A of s) {
        if (i.partialReason) {
          break;
        }
        let k = A === "without" ? {
          ...d,
          pluginDirs: []
        } : d;
        f.set(A, await cTf(k, p, m.allowed, e, i, s.length > 1 ? A : undefined));
      }
      let h = f.get("with") ?? [];
      let g = f.get("without");
      if (h.length === 0 && i.partialReason) {
        continue;
      }
      let {
        score: y,
        passRate: _
      } = BYo(h);
      let b = g && g.length > 0 ? BYo(g) : undefined;
      let S = A => !!A?.some(k => k.skipped_paid_graders);
      let E = !S(h) && !S(g);
      a.push({
        case_: d,
        report: {
          name: d.name,
          dir: dTf(o, d),
          source: d.caseSource,
          score: y,
          pass_rate: _,
          runs: h,
          ...(b && g && {
            pass_rate_without: b.passRate,
            runs_without: g,
            ...(E && {
              score_without: b.score,
              delta: y - b.score
            })
          })
        }
      });
      let C = h.length + (g?.length ?? 0);
      let x = h.reduce((A, k) => A + k.cost_usd, 0) + (g?.reduce((A, k) => A + k.cost_usd, 0) ?? 0);
      if (b && E) {
        let A = y - b.score;
        let k = A > 0 ? "+" : "";
        e.onLine(`${y >= e.threshold ? "\u2713" : "\u2717"} ${d.name}  with ${y.toFixed(2)}  without ${b.score.toFixed(2)}  \u0394 ${k}${A.toFixed(2)}  (${C} ${un(C, "run")})  $${x.toFixed(2)}`);
      } else if (b) {
        e.onLine(`${y >= e.threshold ? "\u2713" : "\u2717"} ${d.name}  with ${y.toFixed(2)}  \u0394 \u2014 (cost ceiling: arms graded under different rules)  (${C} ${un(C, "run")})  $${x.toFixed(2)}`);
      } else {
        e.onLine(`${y >= e.threshold ? "\u2713" : "\u2717"} ${d.name}  score ${y.toFixed(2)}  (${h.length} ${un(h.length, "run")})  $${x.toFixed(2)}`);
      }
    }
    if (i.partialReason === undefined && e.signal.aborted) {
      i.partialReason = "interrupted";
    }
    let l = $Yo(a, t, i.partialReason, {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION);
    let c = l.cases.every(d => d.score >= e.threshold);
    let u = i.partialReason ? 2 : c && r.length === 0 ? 0 : 1;
    return {
      report: l,
      exitCode: u,
      errors: r,
      root: o
    };
  }
  async function cTf(e, t, n, r, o, s) {
    let i = [];
    for (let a = 0; a < t; a++) {
      if (r.signal.aborted) {
        o.partialReason = "interrupted";
        break;
      }
      if (r.maxCostUsd !== undefined && o.spent >= r.maxCostUsd) {
        o.partialReason = "cost_ceiling";
        r.onLine(`\u26A0 cost ceiling $${r.maxCostUsd} hit; skipping remaining cases`);
        break;
      }
      let l = r.maxCostUsd !== undefined ? r.maxCostUsd - o.spent : undefined;
      let c = await pTf(e, n, r, l, s);
      o.spent += c.cost_usd;
      i.push(c);
      let u = s ? ` [${s}]` : "";
      let d = c.error ? `  error: ${DTc(c.error)}` : "";
      r.onLine(`  ${e.name} run ${a + 1}/${t}${u}: score ${c.score.toFixed(2)}  $${c.cost_usd.toFixed(2)}${d}`);
      for (let p of c.graders) {
        let m = p.with_only ? " [with-only, not scored]" : ` (weight ${p.weight})`;
        r.onLine(`    ${p.passed ? "\u2713" : "\u2717"} ${p.name}${m}: ${DTc(p.explanation)}`);
      }
    }
    return i;
  }
  function DTc(e) {
    return Wge(e.replace(/\s*\n\s*/g, " "), 200);
  }
  function uTf(e, t) {
    let n = new Map();
    for (let r of e) {
      let o = n.get(r.name) ?? [];
      o.push(r.caseDir);
      n.set(r.name, o);
    }
    for (let [r, o] of n) {
      if (o.length > 1) {
        t(`\u26A0 ${o.length} cases share the name "${r}" (${o.join(", ")}); the report and --case filter cannot distinguish them`);
      }
    }
  }
  function dTf(e, t) {
    let n = Rfr.default.relative(e, t.caseDir);
    return n === "" ? "." : n;
  }
  async function pTf(e, t, n, r, o) {
    let s = await dTc();
    let i = false;
    try {
      if (e.context.scaffold_script && !n.noScaffold) {
        let h = await ARt(e, e.context.scaffold_script);
        n.onLine(`  scaffold: ${h}`);
        let g = await mTf(h, s, n.signal);
        if (g.code !== 0) {
          i = true;
          return {
            score: 0,
            turns: 0,
            cost_usd: 0,
            judge_cost_usd: 0,
            graders: [],
            trace_path: "",
            error: `scaffold failed (exit ${g.code}): ${g.stderr.slice(-500)}`
          };
        }
      }
      await mTc(s);
      let a = await MTc(s.cwd);
      let l = await STc({
        case_: e,
        sandbox: s,
        allowedTools: t,
        modelOverride: n.model,
        verbose: n.verbose,
        signal: n.signal
      });
      let c = await MTc(s.cwd);
      let u = fTf(a, c);
      let d = r !== undefined && l.costUsd >= r;
      let {
        results: p,
        judgeCostUsd: m,
        paidGradersSkipped: f
      } = await vTc({
        case_: e,
        run: l,
        cwdDiff: u,
        sandboxCwd: s.cwd,
        judgeModel: n.judgeModel,
        skipPaidGraders: d,
        arm: o,
        signal: n.signal
      });
      if (l.error !== null) {
        i = true;
      }
      return {
        score: PTc(p),
        turns: l.numTurns,
        cost_usd: l.costUsd + m,
        judge_cost_usd: m,
        graders: p,
        trace_path: l.tracePath,
        error: l.error,
        ...(f && {
          skipped_paid_graders: true
        })
      };
    } catch (a) {
      i = true;
      return {
        score: 0,
        turns: 0,
        cost_usd: 0,
        judge_cost_usd: 0,
        graders: [],
        trace_path: "",
        error: a instanceof Error ? a.message : String(a)
      };
    } finally {
      await Cfr.rm(Rfr.default.join(s.configDir, ".credentials.json"), {
        force: true
      }).catch(() => {});
      let a = i && n.keepFailedRuns && !n.signal.aborted;
      if (n.keepTemp || a) {
        n.onLine(`  kept temp${a && !n.keepTemp ? " (run failed)" : ""}: ${s.root}`);
      } else {
        await s.cleanup();
      }
    }
  }
  async function mTf(e, t, n) {
    return await new Promise(r => {
      let o = "";
      let s = NTc.spawn("bash", [e], {
        cwd: t.cwd,
        windowsHide: true,
        stdio: ["ignore", "ignore", "pipe"],
        env: {
          PATH: process.env.PATH,
          HOME: t.home,
          USERPROFILE: t.home,
          TMPDIR: process.env.TMPDIR,
          TERM: "dumb",
          USER_TYPE: "external",
          NODE_ENV: "production"
        }
      });
      let i = setTimeout(l => l.kill("SIGKILL"), 120000, s);
      let a = () => s.kill("SIGKILL");
      if (n.aborted) {
        a();
      } else {
        n.addEventListener("abort", a, {
          once: true
        });
      }
      s.stderr?.setEncoding("utf8");
      s.stderr?.on("data", l => {
        if (o.length < 16384) {
          o += l;
        }
      });
      s.on("error", l => {
        clearTimeout(i);
        n.removeEventListener("abort", a);
        r({
          code: 127,
          stderr: String(l)
        });
      });
      s.on("close", l => {
        clearTimeout(i);
        n.removeEventListener("abort", a);
        r({
          code: l,
          stderr: o
        });
      });
    });
  }
  async function MTc(e) {
    let t = new Set();
    await FTc(e, "", t, 0);
    return t;
  }
  async function FTc(e, t, n, r) {
    if (r > 16) {
      return;
    }
    let o;
    try {
      o = await Cfr.readdir(Rfr.default.join(e, t), {
        withFileTypes: true
      });
    } catch (s) {
      if (Io(s)) {
        return;
      }
      throw s;
    }
    for (let s of o) {
      let i = t ? `${t}/${s.name}` : s.name;
      if (s.isDirectory()) {
        if (s.name === "node_modules" || s.name === ".git") {
          continue;
        }
        await FTc(e, i, n, r + 1);
      } else if (s.isFile()) {
        n.add(i);
      }
    }
  }
  function fTf(e, t) {
    let n = [];
    for (let r of t) {
      if (!e.vZc(r)) {
        n.push(r);
      }
    }
    return n.sort().join(`
`);
  }
  var NTc;
  var Cfr;
  var Rfr;
  var UTc = __lazy(() => {
    dt();
    Zn();
    fTc();
    kTc();
    NYo();
    HYo();
    NTc = require("child_process");
    Cfr = require("fs/promises");
    Rfr = __toESM(require("path"));
  });
  var qYo = {};