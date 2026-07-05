  __export(Zbc, {
    startMCPServer: () => startMCPServer,
    createMCPServer: () => createMCPServer
  });
  async function startMCPServer(e, t, n) {
    By(e);
    let r = createMCPServer(t, n);
    let o = new SHe();
    await r.connect(o);
  }
  function createMCPServer(e, t) {
    t5a(Avo());
    let n = u$(5000);
    let r = new pye({
      name: "claude/tengu",
      version: {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION
    }, {
      capabilities: {
        tools: {}
      }
    });
    r.setRequestHandler(q7, async () => {
      let o = tq();
      let s = fH(o);
      return {
        tools: await Promise.all(s.map(async i => ({
          ...i,
          description: await i.prompt({
            getToolPermissionContext: async () => o,
            tools: s,
            agents: []
          }),
          inputSchema: RFe(i.inputSchema),
          outputSchema: undefined
        })))
      };
    });
    r.setRequestHandler(A6, async ({
      params: {
        name: o,
        arguments: s
      }
    }) => {
      let i = tq();
      let a = fH(i);
      let l = Cl(a, o);
      if (!l) {
        throw Error(`Tool ${o} not found`);
      }
      let c = {
        abortController: createAbortController(),
        messageQueue: Yh,
        agentContext: ym(),
        options: {
          commands: Tbf,
          tools: a,
          mainLoopModel: getMainLoopModel(),
          thinkingConfig: {
            type: "disabled"
          },
          mcpClients: [],
          mcpResources: {},
          isNonInteractiveSession: true,
          debug: e,
          verbose: t,
          agentDefinitions: {
            activeAgents: [],
            allAgents: []
          }
        },
        getAppState: () => getDefaultAppState(),
        setAppState: () => {},
        getMcp: () => getDefaultAppState().mcp,
        getWebBrowser: () => getDefaultAppState().webBrowser,
        setToolPermissionContext: () => {},
        taskRegistry: oht,
        sessionHooksRegistry: gcr,
        getReplContexts: () => ({}),
        setReplContext: () => {},
        setWebBrowserSlice: () => {},
        setArtifactReadVersion: () => {},
        agentLifecycle: hcr,
        teammateColors: ycr,
        rootToolSurface: {
          tools: a,
          mainLoopModel: getMainLoopModel()
        },
        messages: [],
        turnStartIndex: 0,
        readFileState: n,
        getFileHistoryState: () => {
          return;
        },
        applyFileHistoryOp: () => {},
        applyAttributionOp: () => {}
      };
      try {
        if (!l.isEnabled()) {
          let p = `Tool ${o} is not enabled`;
          logForDebugging(`MCP server: ${p}`, {
            level: "error"
          });
          return {
            isError: true,
            content: [{
              type: "text",
              text: p
            }]
          };
        }
        let u = await l.validateInput?.(s ?? {}, c);
        if (u && !u.result) {
          let p = `Tool ${o} input is invalid: ${u.message}`;
          logForDebugging(`MCP server: ${p}`, {
            level: "error"
          });
          return {
            isError: true,
            content: [{
              type: "text",
              text: p
            }]
          };
        }
        let d = await l.call(s ?? {}, c, hasPermissionsToUseTool, ST({
          content: []
        }));
        return {
          content: [{
            type: "text",
            text: typeof d === "string" ? d : De(d.data)
          }]
        };
      } catch (u) {
        let p = (u instanceof Error ? eUo(u) : [String(u)]).filter(Boolean).join(`
`).trim() || "Error";
        if (u instanceof xc || u instanceof RN || u instanceof $de) {
          logForDebugging(`MCP server tool call '${o}' failed: ${p}`, {
            level: "error"
          });
        } else {
          let m = sr(u);
          Oe("telemetryMessage" in m ? m : $o(m, `mcp server tool '${l.name}' threw`));
        }
        return {
          isError: true,
          content: [{
            type: "text",
            text: p
          }]
        };
      }
    });
    return r;
  }
  var Tbf;
  var eSc = __lazy(() => {
    BOt();
    nfn();
    T9();
    j8e();
    ci();
    VDe();
    jM();
    Kp();
    _h();
    Kwt();
    je();
    dt();
    qI();
    BGo();
    Rn();
    Rf();
    ro();
    Eo();
    oy();
    U1();
    Ywt();
    _5t();
    mJt();
    $rr();
    Tbf = [OQm];
  });
  var rSc = {};
  __export(rSc, {
    readClaudeDesktopMcpServers: () => readClaudeDesktopMcpServers,
    getClaudeDesktopConfigPath: () => getClaudeDesktopConfigPath
  });
  async function getClaudeDesktopConfigPath() {
    let e = Wt();
    if (!NOr.includes(e)) {
      throw Error(`Unsupported platform: ${e} - Claude Desktop integration only works on macOS and WSL.`);
    }
    if (e === "macos") {
      return vYo.join(tSc.homedir(), "Library", "Application Support", "Claude", "claude_desktop_config.json");
    }
    let t = process.env.USERPROFILE ? process.env.USERPROFILE.replace(/\\/g, "/") : null;
    if (t) {
      let r = `/mnt/c${t.replace(/^[A-Z]:/, "")}/AppData/Roaming/Claude/claude_desktop_config.json`;
      try {
        await WJe.stat(r);
        return r;
      } catch {}
    }
    try {
      try {
        let r = await WJe.readdir("/mnt/c/Users", {
          withFileTypes: true
        });
        for (let o of r) {
          if (o.name === "Public" || o.name === "Default" || o.name === "Default User" || o.name === "All Users") {
            continue;
          }
          let s = vYo.join("/mnt/c/Users", o.name, "AppData", "Roaming", "Claude", "claude_desktop_config.json");
          try {
            await WJe.stat(s);
            return s;
          } catch {}
        }
      } catch {}
    } catch (n) {
      logForDebugging(`Failed scanning /mnt/c/Users for Claude Desktop config: ${n}`, {
        level: "error"
      });
    }
    throw Error("Could not find Claude Desktop config file in Windows. Make sure Claude Desktop is installed on Windows.");
  }
  async function readClaudeDesktopMcpServers() {
    if (!NOr.includes(Wt())) {
      throw Error("Unsupported platform - Claude Desktop integration only works on macOS and WSL.");
    }
    try {
      let e = await getClaudeDesktopConfigPath();
      let t;
      try {
        t = await WJe.readFile(e, {
          encoding: "utf8"
        });
      } catch (s) {
        if (en(s) === "ENOENT") {
          return {};
        }
        throw s;
      }
      let n = Ba(t);
      if (!n || typeof n !== "object") {
        return {};
      }
      let r = n.mcpServers;
      if (!r || typeof r !== "object") {
        return {};
      }
      let o = {};
      for (let [s, i] of Object.entries(r)) {
        if (!i || typeof i !== "object") {
          continue;
        }
        let a = MMt().safeParse(i);
        if (a.success) {
          o[s] = a.data;
        }
      }
      return o;
    } catch (e) {
      logForDebugging(`Failed to read Claude Desktop MCP servers: ${e}`, {
        level: "error"
      });
      return {};
    }
  }
  var WJe;
  var tSc;
  var vYo;
  var oSc = __lazy(() => {
    Lke();
    je();
    dt();
    Gd();
    Cs();
    WJe = require("fs/promises");
    tSc = require("os");
    vYo = require("path");
  });
  var xBe = {};
  __export(xBe, {
    mcpServeHandler: () => mcpServeHandler,
    mcpResetChoicesHandler: () => mcpResetChoicesHandler,
    mcpRemoveHandler: () => mcpRemoveHandler,
    mcpListHandler: () => mcpListHandler,
    mcpGetHandler: () => mcpGetHandler,
    mcpAddJsonHandler: () => mcpAddJsonHandler,
    mcpAddFromDesktopHandler: () => mcpAddFromDesktopHandler
  });
  function wbf(e) {
    let t = e?.issues;
    if (Array.isArray(t) && t.length > 0) {
      let n = t[0];
      let r = typeof n.message === "string" ? n.message : he(e);
      let o = Array.isArray(n.path) && n.path.length > 0 ? ` (at ${n.path.join(".")})` : "";
      let s = t.length > 1 ? ` (+${t.length - 1} more)` : "";
      return r + o + s;
    }
    return he(e).replace(/\s+/g, " ").trim();
  }
  async function cSc(e, t) {
    try {
      let n = await kM(e, t);
      if (n.type === "connected") {
        if (n.capabilities.tools) {
          try {
            await n.client.listTools(undefined, {
              timeout: 5000
            });
          } catch (r) {
            if (C5t(r)) {
              return {
                status: "! Needs authentication"
              };
            }
            return {
              status: "! Connected \xB7 tools fetch failed",
              issue: wbf(r)
            };
          }
        }
        return {
          status: `${vGd.tick} Connected`
        };
      } else if (n.type === "needs-auth") {
        return {
          status: "! Needs authentication"
        };
      } else {
        return {
          status: `${vGd.cross} Failed to connect`
        };
      }
    } catch (n) {
      return {
        status: `${vGd.cross} Connection error`
      };
    }
  }
  async function mcpServeHandler({
    debug: e,
    verbose: t
  }) {
    let n = lSc.cwd();
    await logEventAsync("tengu_mcp_start", {});
    try {
      await aSc.stat(n);
    } catch (r) {
      if (Io(r)) {
        await ou("cli_mcp_serve", "cli_mcp_serve_cwd_missing");
        return Ih(`Error: Directory ${n} does not exist`);
      }
      throw r;
    }
    try {
      let {
        setup: r
      } = await Promise.resolve().then(() => (ffr(), mfr));
      await r(n, "default", false, false, undefined, false);
      let {
        SandboxManager: o
      } = await Promise.resolve().then(() => (Th(), Hlo));
      let s = o.getSandboxUnavailableReason();
      if (s) {
        if (o.isSandboxRequired()) {
          await ou("cli_mcp_serve", "cli_mcp_serve_sandbox_required_unavailable");
          return Ih(`Error: sandbox required but unavailable: ${s}
` + "  sandbox.failIfUnavailable is set \u2014 refusing to start without a working sandbox.");
        }
        process.stderr.write(`
\u26A0 Sandbox disabled: ${s}
  Commands will run WITHOUT sandboxing. Network and filesystem restrictions will NOT be enforced.

`);
      }
      let {
        startMCPServer: i
      } = await Promise.resolve().then(() => (eSc(), Zbc));
      await i(n, e ?? false, t ?? false);
      await nS("cli_mcp_serve");
    } catch (r) {
      await ou("cli_mcp_serve", "cli_mcp_serve_start_failed");
      return Ih(`Error: Failed to start MCP server: ${r}`);
    }
  }
  async function mcpRemoveHandler(e, t, n) {
    let r = getMcpConfigByName(t);
    let o = async () => {
      if (r && (r.type === "sse" || r.type === "http")) {
        try {
          await $Wn(t, r);
          await jHa(t, r);
        } catch (a) {
          logForDebugging(`mcp remove: secure-storage cleanup for "${t}" failed: ${he(a)}`, {
            level: "warn"
          });
        }
      }
    };
    let s;
    try {
      if (n.scope) {
        let a = Yft(n.scope);
        await logEventAsync("tengu_mcp_delete", {
          name: t,
          scope: a
        });
        await removeMcpConfig(t, a);
        await o();
        s = a;
      } else {
        let a = getCurrentProjectConfig();
        let l = getGlobalConfig();
        let c = await readRawMcpJsonServersFromCwd().catch(() => ({}));
        let u = Object.hasOwn(c, t);
        let d = [];
        if (a.mcpServers?.[t]) {
          d.push("local");
        }
        if (u) {
          d.push("project");
        }
        if (l.mcpServers?.[t]) {
          d.push("user");
        }
        if (d.length === 0) {
          let p = [...Object.keys(a.mcpServers ?? {}), ...Object.keys(c), ...Object.keys(l.mcpServers ?? {})];
          await ou("cli_mcp_remove", "cli_mcp_remove_not_found");
          return Ih(mYo(t, Ro(p)));
        } else if (d.length === 1) {
          let p = d[0];
          await logEventAsync("tengu_mcp_delete", {
            name: t,
            scope: p
          });
          await removeMcpConfig(t, p);
          await o();
          s = p;
        } else {
          process.stderr.write(`MCP server "${t}" exists in multiple scopes:
`);
          d.forEach(m => {
            process.stderr.write(`  - ${s5t(m)} (${D$(m)})
`);
          });
          let p = d.map(m => Py("mcp remove", t, `-s ${m}`)).filter(m => m !== null);
          if (p.length > 0) {
            process.stderr.write(`
To remove from a specific scope, use:
`);
            p.forEach(m => process.stderr.write(`  ${m}
`));
          } else {
            process.stderr.write(`
Specify a scope with -s to remove from a specific one.
`);
          }
          await ou("cli_mcp_remove", "cli_mcp_remove_ambiguous_scope");
          return Ih();
        }
      }
    } catch (a) {
      await ou("cli_mcp_remove", "cli_mcp_remove_failed");
      return Ih(he(a));
    }
    await nS("cli_mcp_remove");
    let i = n.scope ? t : `"${t}"`;
    e.render(LS.jsx(Q_, {
      children: LS.jsxs(gXd, {
        flexDirection: "column",
        children: [LS.jsxs(Text, {
          children: ["Removed MCP server ", i, " from ", s, " config"]
        }), LS.jsxs(Text, {
          children: ["File modified: ", D$(s)]
        })]
      })
    }));
    await e.waitUntilExit();
  }
  function uSc(e) {
    let t = new Map();
    let n = {};
    for (let [r, o] of Object.entries(e)) {
      if (o.scope === "local" || o.scope === "user" || o.scope === "project" || o.scope === "enterprise") {
        let s = t.get(o.scope);
        if (!s) {
          s = getMcpConfigsByScope(o.scope, {
            expandVars: false
          }).servers;
          t.set(o.scope, s);
        }
        n[r] = s[r] ?? o;
      } else {
        n[r] = Gge(o);
      }
    }
    return n;
  }
  function xbf({
    name: e,
    server: t,
    status: n
  }) {
    if (t.type === "sse") {
      return `${e}: ${t.url} (SSE) - ${n}`;
    }
    if (t.type === "http") {
      return `${e}: ${t.url} (HTTP) - ${n}`;
    }
    if (t.type === "claudeai-proxy") {
      return `${e}: ${t.url} - ${n}`;
    }
    if (!t.type || t.type === "stdio") {
      let r = Array.isArray(t.args) ? t.args : [];
      return `${e}: ${t.command} ${r.join(" ")} - ${n}`;
    }
    return null;
  }
  function kbf(e) {
    let t = iSc.c(10);
    let {
      promise: n
    } = e;
    let r = hfr.use(n);
    let o;
    let s;
    let i;
    if (t[0] !== r) {
      let c = r.map(xbf).filter(Abf);
      s = Q_;
      o = Text;
      i = c.join(`
`);
      t[0] = r;
      t[1] = o;
      t[2] = s;
      t[3] = i;
    } else {
      o = t[1];
      s = t[2];
      i = t[3];
    }
    let a;
    if (t[4] !== o || t[5] !== i) {
      a = LS.jsx(o, {
        children: i
      });
      t[4] = o;
      t[5] = i;
      t[6] = a;
    } else {
      a = t[6];
    }
    let l;
    if (t[7] !== s || t[8] !== a) {
      l = LS.jsx(s, {
        children: a
      });
      t[7] = s;
      t[8] = a;
      t[9] = l;
    } else {
      l = t[9];
    }
    return l;
  }
  function Abf(e) {
    return e !== null;
  }
  async function mcpListHandler(e) {
    await logEventAsync("tengu_mcp_list", {});
    await G5({
      hasDynamicMcpConfig: false
    });
    let {
      servers: t,
      pendingProjectServers: n
    } = await getAllMcpConfigs({
      includePendingProjectServers: true
    });
    await nS("cli_mcp_list");
    let r = LS.jsx(Hvt, {});
    if (Object.keys(t).length === 0) {
      e.render(LS.jsx(Q_, {
        children: LS.jsxs(gXd, {
          flexDirection: "column",
          children: [LS.jsx(Text, {
            children: "No MCP servers configured. Use `claude mcp add` to add a server."
          }), r]
        })
      }));
      await e.waitUntilExit();
      await gracefulShutdown(0);
      return;
    }
    let o = uSc(t);
    let s = uV(Object.entries(t), async ([i, a]) => ({
      name: i,
      server: o[i] ?? a,
      status: n.vZc(i) ? dSc : (await cSc(i, a)).status
    }), {
      concurrency: ght()
    });
    e.render(LS.jsx(hfr.Suspense, {
      fallback: LS.jsxs(Text, {
        children: ["Checking MCP server health\u2026", `

`]
      }),
      children: LS.jsxs(gXd, {
        flexDirection: "column",
        children: [LS.jsx(kbf, {
          promise: s
        }), r]
      })
    }));
    await e.waitUntilExit();
    await gracefulShutdown(0);
  }
  async function mcpGetHandler(e, t) {
    await logEventAsync("tengu_mcp_get", {
      name: t
    });
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
    let s = n[t] ?? null;
    let i = r.vZc(t) ? "pending" : o.vZc(t) ? "rejected" : null;
    if (!s) {
      await ou("cli_mcp_get", "cli_mcp_get_not_found");
      let m = Object.keys(n).filter(f => !r.vZc(f) && !o.vZc(f));
      return Ih(afr(t, m, r.size > 0));
    }
    let a = i === "pending" ? {
      status: "\u23F8 Pending approval (run `claude` to approve)"
    } : i === "rejected" ? {
      status: Ibf
    } : await cSc(t, s);
    let l = uSc({
      [t]: s
    })[t] ?? s;
    let c = [`${t}:`, `  Scope: ${s5t(s.scope)}`, `  Status: ${a.status}`, ...(a.issue ? [`  Issue: ${a.issue}`] : [])];
    if ((s.type === "sse" || s.type === "http") && (l.type === "sse" || l.type === "http")) {
      if (c.push(`  Type: ${s.type}`), c.push(`  URL: ${l.url}`), l.headers) {
        c.push("  Headers:");
        for (let [m, f] of Object.entries(l.headers)) {
          c.push(`    ${m}: ${f}`);
        }
      }
      if (s.oauth?.clientId || s.oauth?.callbackPort) {
        let m = [];
        if (s.oauth.clientId) {
          if (m.push("client_id configured"), (await jWn(t, s))?.clientSecret) {
            m.push("client_secret configured");
          }
        }
        if (s.oauth.callbackPort) {
          m.push(`callback_port ${s.oauth.callbackPort}`);
        }
        c.push(`  OAuth: ${m.join(", ")}`);
      }
    } else if (s.type === "stdio" && l.type === "stdio") {
      c.push("  Type: stdio");
      c.push(`  Command: ${l.command}`);
      let m = Array.isArray(l.args) ? l.args : [];
      if (c.push(`  Args: ${m.join(" ")}`), l.env) {
        c.push("  Environment:");
        for (let [f, h] of Object.entries(l.env)) {
          c.push(`    ${f}=${h}`);
        }
      }
    }
    if (s.timeout !== undefined) {
      c.push(`  Timeout: ${s.timeout}ms${s.timeout < 1000 ? " (ignored: below 1000ms minimum)" : ""}`);
    }
    let d = s.scope === "local" || s.scope === "project" || s.scope === "user" ? Py("mcp remove", t, `-s ${s.scope}`) : null;
    let p = null;
    if (d) {
      p = `To remove this server, run: ${d}`;
    } else if (s.scope === "user" || s.scope === "project" || s.scope === "local" || s.scope === "enterprise") {
      p = `To remove this server, edit ${D$(s.scope)}`;
    }
    if (p) {
      c.push("");
      c.push(p);
    }
    await nS("cli_mcp_get");
    e.render(LS.jsx(Q_, {
      children: LS.jsx(Text, {
        children: c.join(`
`)
      })
    }));
    await e.waitUntilExit();
    await gracefulShutdown(0);
  }
  async function mcpAddJsonHandler(e, t, n, r) {
    let o;
    let s;
    try {
      o = Yft(r.scope);
      let i = Ba(n, false);
      if (i === null) {
        logForDebugging("mcp add-json: user-provided JSON was empty, invalid, or null", {
          level: "error"
        });
      }
      let l = r.clientSecret && i && typeof i === "object" && "type" in i && (i.type === "sse" || i.type === "http" || i.type === "streamable-http") && "url" in i && typeof i.url === "string" && "oauth" in i && i.oauth && typeof i.oauth === "object" && "clientId" in i.oauth ? await a5t() : undefined;
      if (await addMcpConfig(t, i, o), s = i && typeof i === "object" && "type" in i ? String(i.type || "stdio") : "stdio", s === "streamable-http") {
        s = "http";
      }
      if (l && i && typeof i === "object" && "type" in i && (i.type === "sse" || i.type === "http" || i.type === "streamable-http") && "url" in i && typeof i.url === "string") {
        let u = await l5t(t, {
          type: i.type === "sse" ? "sse" : "http",
          url: i.url
        }, l);
        if (!u.success) {
          process.stderr.write(`Server added, but the client secret could not be stored${u.warning ? ` (${u.warning})` : ""}. Re-run with --client-secret once secure storage is available.
`);
        }
      }
      await logEventAsync("tengu_mcp_add", {
        scope: o,
        source: "json",
        type: s
      });
    } catch (i) {
      await ou("cli_mcp_add_json", "cli_mcp_add_json_failed");
      return Ih(he(i));
    }
    await nS("cli_mcp_add_json");
    e.render(LS.jsx(Q_, {
      children: LS.jsxs(Text, {
        children: ["Added ", s, " MCP server ", t, " to ", o, " config"]
      })
    }));
    await e.waitUntilExit();
  }
  async function mcpAddFromDesktopHandler(e) {
    try {
      let t = Yft(e.scope);
      let n = Wt();
      await logEventAsync("tengu_mcp_add", {
        scope: t,
        platform: n,
        source: "desktop"
      });
      let {
        readClaudeDesktopMcpServers: r
      } = await Promise.resolve().then(() => (oSc(), rSc));
      let o = await r();
      if (Object.keys(o).length === 0) {
        await nS("cli_mcp_add_from_desktop");
        return U5("No MCP servers found in Claude Desktop configuration or configuration file does not exist.");
      }
      await nS("cli_mcp_add_from_desktop");
      let {
        unmount: s
      } = await render(LS.jsx(AppStateProvider, {
        children: LS.jsx(KeybindingSetup, {
          children: LS.jsx(Cbc, {
            servers: o,
            scope: t,
            onDone: () => {
              s();
            }
          })
        })
      }), {
        exitOnCtrlC: true,
        patchConsole: false
      });
    } catch (t) {
      await ou("cli_mcp_add_from_desktop", "cli_mcp_add_from_desktop_failed");
      return Ih(he(t));
    }
  }
  async function mcpResetChoicesHandler(e) {
    if (await logEventAsync("tengu_mcp_reset_mcpjson_choices", {}), !deleteCurrentProjectConfigFields(["enabledMcpjsonServers", "disabledMcpjsonServers", "enableAllProjectMcpServers"])) {
      pJe("Error: Failed to reset project choices: legacy approvals in ~/.claude.json could not be cleared (is the file writable?). Nothing was changed.");
      await ou("cli_mcp_reset_choices", "cli_mcp_reset_choices_projectconfig_delete_failed");
      await flushAnalyticsSinks();
      return Es();
    }
    let n = getSettingsForSource("localSettings");
    if (n ? n.enabledMcpjsonServers !== undefined || n.disabledMcpjsonServers !== undefined || n.enableAllProjectMcpServers !== undefined : getLocalSettingsValidationErrors().length > 0) {
      if (n !== null && getLocalSettingsValidationErrors().length > 0) {
        pJe("Error: Failed to reset project choices: settings.local.json carries validation warnings, and rewriting it would delete the warned entries \u2014 run /doctor and fix them, then re-run (legacy approvals in ~/.claude.json were cleared; local settings were not)");
        await ou("cli_mcp_reset_choices", "cli_mcp_reset_choices_settings_warnings_blocked");
        await flushAnalyticsSinks();
        return Es();
      }
      let {
        error: s
      } = updateSettingsForSource("localSettings", {
        enabledMcpjsonServers: undefined,
        disabledMcpjsonServers: undefined,
        enableAllProjectMcpServers: undefined
      });
      if (s) {
        pJe(`Error: Failed to reset project choices: ${s.message} (legacy approvals in ~/.claude.json were cleared; local settings were not)`);
        await ou("cli_mcp_reset_choices", "cli_mcp_reset_choices_settings_write_failed");
        await flushAnalyticsSinks();
        return Es();
      }
    }
    await nS("cli_mcp_reset_choices");
    let o = null;
    try {
      let s = ZT("mcp");
      if (!doesEnterpriseMcpConfigExist()) {
        let {
          serverNames: i,
          pluginServerNames: a,
          rootServers: l
        } = await dYo();
        let c = m => Bke(m, a.vZc(m));
        let u = [];
        let d = [];
        let p = 0;
        for (let m of i) {
          if (s && !a.vZc(m)) {
            continue;
          }
          let f = o5t(m);
          if (f === "approved") {
            if (isMcpServerDisabled(m)) {
              continue;
            }
            let h = l[m];
            if (h && !isMcpServerAllowedByPolicy(m, h)) {
              continue;
            }
            u.push(c(m));
          } else if (f === "rejected") {
            d.push(c(m));
          } else {
            p++;
          }
        }
        o = {
          autoApprovedServers: u,
          stillRejectedServers: d,
          pendingCount: p,
          gatingErrors: TYn().length
        };
      }
    } catch (s) {
      logForDebugging(`mcp reset-project-choices: post-reset disclosure scan failed: ${he(s)}`, {
        level: "warn"
      });
      o = null;
    }
    e.render(LS.jsx(Q_, {
      children: LS.jsxs(gXd, {
        flexDirection: "column",
        children: [LS.jsx(Text, {
          children: "Project-scoped (.mcp.json) server approvals and rejections stored for this project have been reset."
        }), o && o.autoApprovedServers.length > 0 && LS.jsx(Text, {
          children: sSc(o.autoApprovedServers, "is still approved by other settings and will connect automatically without prompting.", "are still approved by other settings and will connect automatically without prompting.")
        }), o && o.stillRejectedServers.length > 0 && LS.jsx(Text, {
          children: sSc(o.stillRejectedServers, "remains rejected by other settings and will not prompt.", "remain rejected by other settings and will not prompt.")
        }), o && o.pendingCount > 0 && (o.gatingErrors > 0 ? LS.jsx(Text, {
          children: "Settings errors are currently blocking the approval prompt \u2014 run /doctor and fix them, then restart Claude Code to be prompted."
        }) : LS.jsx(Text, {
          children: "You will be prompted for approval next time you start Claude Code."
        }))]
      })
    }));
    await e.waitUntilExit();
  }
  function sSc(e, t, n) {
    return e.length === 1 ? `1 server (${e[0]}) ${t}` : `${e.length} servers (${e.join(", ")}) ${n}`;
  }
  var iSc;
  var aSc;
  var lSc;
  var hfr;
  var LS;
  var Ibf;
  var kBe = __lazy(() => {
    Yjt();
    Rbc();
    Oir();
    et();
    C9();
    ln();
    Gqn();
    Ot();
    Moe();
    eA();
    Iw();
    dTo();
    EI();
    RRt();
    G1();
    pYo();
    _3();
    je();
    dt();
    lm();
    Gd();
    Cs();
    Kv();
    W_t();
    IJ();
    I1e();
    SL();
    fYo();
    iSc = __toESM(pt(), 1);
    aSc = require("fs/promises");
    lSc = require("process");
    hfr = __toESM(ot(), 1);
    LS = __toESM(ie(), 1);
    Ibf = `${vGd.cross} Rejected (see disabledMcpjsonServers in settings)`;
  });
  function ABe() {
    let e = wYo.c(36);
    let [t] = useTheme();
    let n = useIsScreenReaderEnabled();
    let {
      rows: r
    } = Sr();
    if (n || r < 30) {
      let E;
      if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
        E = Oo.jsxs(Text, {
          children: [Oo.jsxs(Text, {
            color: "claude",
            children: ["Welcome to Claude Code", " "]
          }), Oo.jsxs(Text, {
            dimColor: true,
            children: ["v", {
              ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
              PACKAGE_URL: "@anthropic-ai/claude-code",
              README_URL: "https://code.claude.com/docs/en/overview",
              VERSION: "2.1.198",
              FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
              BUILD_TIME: "2026-07-01T06:09:31Z",
              GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
            }.VERSION]
          })]
        });
        e[0] = E;
      } else {
        E = e[0];
      }
      return E;
    }
    if (Me.terminal === "Apple_Terminal") {
      let E;
      if (e[1] !== t) {
        E = Oo.jsx(Fbf, {
          theme: t,
          welcomeMessage: "Welcome to Claude Code"
        });
        e[1] = t;
        e[2] = E;
      } else {
        E = e[2];
      }
      return E;
    }
    if (["light", "light-daltonized", "light-ansi"].includes(t)) {
      let E;
      let C;
      let x;
      let A;
      let k;
      let I;
      let O;
      let M;
      let L;
      if (e[3] === Symbol.for("react.memo_cache_sentinel")) {
        E = Oo.jsxs(Text, {
          children: [Oo.jsxs(Text, {
            color: "claude",
            children: ["Welcome to Claude Code", " "]
          }), Oo.jsxs(Text, {
            dimColor: true,
            children: ["v", {
              ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
              PACKAGE_URL: "@anthropic-ai/claude-code",
              README_URL: "https://code.claude.com/docs/en/overview",
              VERSION: "2.1.198",
              FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
              BUILD_TIME: "2026-07-01T06:09:31Z",
              GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
            }.VERSION, " "]
          })]
        });
        C = Oo.jsx(Text, {
          children: ".........................................................."
        });
        x = Oo.jsx(Text, {
          children: "                                                          "
        });
        A = Oo.jsx(Text, {
          children: "                                                          "
        });
        k = Oo.jsx(Text, {
          children: "                                                          "
        });
        I = Oo.jsx(Text, {
          children: "            \u2591\u2591\u2591\u2591\u2591\u2591                                        "
        });
        O = Oo.jsx(Text, {
          children: "    \u2591\u2591\u2591   \u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591                                      "
        });
        M = Oo.jsx(Text, {
          children: "   \u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591                                    "
        });
        L = Oo.jsx(Text, {
          children: "                                                          "
        });
        e[3] = E;
        e[4] = C;
        e[5] = x;
        e[6] = A;
        e[7] = k;
        e[8] = I;
        e[9] = O;
        e[10] = M;
        e[11] = L;
      } else {
        E = e[3];
        C = e[4];
        x = e[5];
        A = e[6];
        k = e[7];
        I = e[8];
        O = e[9];
        M = e[10];
        L = e[11];
      }
      let P;
      if (e[12] === Symbol.for("react.memo_cache_sentinel")) {
        P = Oo.jsxs(Text, {
          children: [Oo.jsx(Text, {
            dimColor: true,
            children: "                           \u2591\u2591\u2591\u2591"
          }), Oo.jsx(Text, {
            children: "                     \u2588\u2588    "
          })]
        });
        e[12] = P;
      } else {
        P = e[12];
      }
      let F;
      let H;
      if (e[13] === Symbol.for("react.memo_cache_sentinel")) {
        F = Oo.jsxs(Text, {
          children: [Oo.jsx(Text, {
            dimColor: true,
            children: "                         \u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591"
          }), Oo.jsx(Text, {
            children: "               \u2588\u2588\u2592\u2592\u2588\u2588  "
          })]
        });
        H = Oo.jsx(Text, {
          children: "                                            \u2592\u2592      \u2588\u2588   \u2592"
        });
        e[13] = F;
        e[14] = H;
      } else {
        F = e[13];
        H = e[14];
      }
      let U;
      if (e[15] === Symbol.for("react.memo_cache_sentinel")) {
        U = Oo.jsxs(Text, {
          children: ["      ", Oo.jsx(Text, {
            color: "clawd_body",
            children: " \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588 "
          }), "                         \u2592\u2592\u2591\u2591\u2592\u2592      \u2592 \u2592\u2592"]
        });
        e[15] = U;
      } else {
        U = e[15];
      }
      let N;
      if (e[16] === Symbol.for("react.memo_cache_sentinel")) {
        N = Oo.jsxs(Text, {
          children: ["      ", Oo.jsx(Text, {
            color: "clawd_body",
            backgroundColor: "clawd_background",
            children: "\u2588\u2588\u2584\u2588\u2588\u2588\u2588\u2588\u2584\u2588\u2588"
          }), "                           \u2592\u2592         \u2592\u2592 "]
        });
        e[16] = N;
      } else {
        N = e[16];
      }
      let W;
      if (e[17] === Symbol.for("react.memo_cache_sentinel")) {
        W = Oo.jsxs(Text, {
          children: ["      ", Oo.jsx(Text, {
            color: "clawd_body",
            children: " \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588 "
          }), "                          \u2591          \u2592   "]
        });
        e[17] = W;
      } else {
        W = e[17];
      }
      let j;
      if (e[18] === Symbol.for("react.memo_cache_sentinel")) {
        j = Oo.jsx(gXd, {
          width: 58,
          children: Oo.jsxs(gXd, {
            flexDirection: "column",
            children: [E, C, x, A, k, I, O, M, L, P, F, H, U, N, W, Oo.jsxs(Text, {
              children: [".......", Oo.jsx(Text, {
                color: "clawd_body",
                children: "\u2588 \u2588   \u2588 \u2588"
              }), "..........................\u2591..........\u2592...."]
            })]
          })
        });
        e[18] = j;
      } else {
        j = e[18];
      }
      return j;
    }
    let o;
    let s;
    let i;
    let a;
    let l;
    let c;
    let u;
    if (e[19] === Symbol.for("react.memo_cache_sentinel")) {
      o = Oo.jsxs(Text, {
        children: [Oo.jsxs(Text, {
          color: "claude",
          children: ["Welcome to Claude Code", " "]
        }), Oo.jsxs(Text, {
          dimColor: true,
          children: ["v", {
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.VERSION, " "]
        })]
      });
      s = Oo.jsx(Text, {
        children: ".........................................................."
      });
      i = Oo.jsx(Text, {
        children: "                                                          "
      });
      a = Oo.jsx(Text, {
        children: "     *                                       \u2588\u2588\u2588\u2588\u2588\u2593\u2593\u2591     "
      });
      l = Oo.jsx(Text, {
        children: "                                 *         \u2588\u2588\u2588\u2593\u2591     \u2591\u2591   "
      });
      c = Oo.jsx(Text, {
        children: "            \u2591\u2591\u2591\u2591\u2591\u2591                        \u2588\u2588\u2588\u2593\u2591           "
      });
      u = Oo.jsx(Text, {
        children: "    \u2591\u2591\u2591   \u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591                      \u2588\u2588\u2588\u2593\u2591           "
      });
      e[19] = o;
      e[20] = s;
      e[21] = i;
      e[22] = a;
      e[23] = l;
      e[24] = c;
      e[25] = u;
    } else {
      o = e[19];
      s = e[20];
      i = e[21];
      a = e[22];
      l = e[23];
      c = e[24];
      u = e[25];
    }
    let d;
    let p;
    let m;
    let f;
    let h;
    if (e[26] === Symbol.for("react.memo_cache_sentinel")) {
      m = Oo.jsxs(Text, {
        children: [Oo.jsx(Text, {
          children: "   \u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591    "
        }), Oo.jsx(Text, {
          bold: true,
          children: "*"
        }), Oo.jsx(Text, {
          children: "                \u2588\u2588\u2593\u2591\u2591      \u2593   "
        })]
      });
      f = Oo.jsx(Text, {
        children: "                                             \u2591\u2593\u2593\u2588\u2588\u2588\u2593\u2593\u2591    "
      });
      h = Oo.jsx(Text, {
        dimColor: true,
        children: " *                                 \u2591\u2591\u2591\u2591                   "
      });
      d = Oo.jsx(Text, {
        dimColor: true,
        children: "                                 \u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591                 "
      });
      p = Oo.jsx(Text, {
        dimColor: true,
        children: "                               \u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591           "
      });
      e[26] = d;
      e[27] = p;
      e[28] = m;
      e[29] = f;
      e[30] = h;
    } else {
      d = e[26];
      p = e[27];
      m = e[28];
      f = e[29];
      h = e[30];
    }
    let g;
    if (e[31] === Symbol.for("react.memo_cache_sentinel")) {
      g = Oo.jsx(Text, {
        color: "clawd_body",
        children: " \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588 "
      });
      e[31] = g;
    } else {
      g = e[31];
    }
    let y;
    if (e[32] === Symbol.for("react.memo_cache_sentinel")) {
      y = Oo.jsxs(Text, {
        children: ["      ", g, "                                       ", Oo.jsx(Text, {
          dimColor: true,
          children: "*"
        }), Oo.jsx(Text, {
          children: " "
        })]
      });
      e[32] = y;
    } else {
      y = e[32];
    }
    let _;
    if (e[33] === Symbol.for("react.memo_cache_sentinel")) {
      _ = Oo.jsxs(Text, {
        children: ["      ", Oo.jsx(Text, {
          color: "clawd_body",
          children: "\u2588\u2588\u2584\u2588\u2588\u2588\u2588\u2588\u2584\u2588\u2588"
        }), Oo.jsx(Text, {
          children: "                        "
        }), Oo.jsx(Text, {
          bold: true,
          children: "*"
        }), Oo.jsx(Text, {
          children: "                "
        })]
      });
      e[33] = _;
    } else {
      _ = e[33];
    }
    let b;
    if (e[34] === Symbol.for("react.memo_cache_sentinel")) {
      b = Oo.jsxs(Text, {
        children: ["      ", Oo.jsx(Text, {
          color: "clawd_body",
          children: " \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588 "
        }), "     *                                   "]
      });
      e[34] = b;
    } else {
      b = e[34];
    }
    let S;
    if (e[35] === Symbol.for("react.memo_cache_sentinel")) {
      S = Oo.jsx(gXd, {
        width: 58,
        children: Oo.jsxs(gXd, {
          flexDirection: "column",
          children: [o, s, i, a, l, c, u, m, f, h, d, p, y, _, b, Oo.jsxs(Text, {
            children: [".......", Oo.jsx(Text, {
              color: "clawd_body",
              children: "\u2588 \u2588   \u2588 \u2588"
            }), ".........................................."]
          })]
        })
      });
      e[35] = S;
    } else {
      S = e[35];
    }
    return S;
  }
  function Fbf(e) {
    let t = wYo.c(44);
    let {
      theme: n,
      welcomeMessage: r
    } = e;
    if (["light", "light-daltonized", "light-ansi"].includes(n)) {
      let A;
      if (t[0] !== r) {
        A = Oo.jsxs(Text, {
          color: "claude",
          children: [r, " "]
        });
        t[0] = r;
        t[1] = A;
      } else {
        A = t[1];
      }
      let k;
      if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
        k = Oo.jsxs(Text, {
          dimColor: true,
          children: ["v", {
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.VERSION, " "]
        });
        t[2] = k;
      } else {
        k = t[2];
      }
      let I;
      if (t[3] !== A) {
        I = Oo.jsxs(Text, {
          children: [A, k]
        });
        t[3] = A;
        t[4] = I;
      } else {
        I = t[4];
      }
      let O;
      let M;
      let L;
      let P;
      let F;
      let H;
      let U;
      let N;
      if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
        L = Oo.jsx(Text, {
          children: ".........................................................."
        });
        P = Oo.jsx(Text, {
          children: "                                                          "
        });
        F = Oo.jsx(Text, {
          children: "                                                          "
        });
        H = Oo.jsx(Text, {
          children: "                                                          "
        });
        U = Oo.jsx(Text, {
          children: "            \u2591\u2591\u2591\u2591\u2591\u2591                                        "
        });
        N = Oo.jsx(Text, {
          children: "    \u2591\u2591\u2591   \u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591                                      "
        });
        O = Oo.jsx(Text, {
          children: "   \u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591                                    "
        });
        M = Oo.jsx(Text, {
          children: "                                                          "
        });
        t[5] = O;
        t[6] = M;
        t[7] = L;
        t[8] = P;
        t[9] = F;
        t[10] = H;
        t[11] = U;
        t[12] = N;
      } else {
        O = t[5];
        M = t[6];
        L = t[7];
        P = t[8];
        F = t[9];
        H = t[10];
        U = t[11];
        N = t[12];
      }
      let W;
      if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
        W = Oo.jsxs(Text, {
          children: [Oo.jsx(Text, {
            dimColor: true,
            children: "                           \u2591\u2591\u2591\u2591"
          }), Oo.jsx(Text, {
            children: "                     \u2588\u2588    "
          })]
        });
        t[13] = W;
      } else {
        W = t[13];
      }
      let j;
      let z;
      let V;
      if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
        j = Oo.jsxs(Text, {
          children: [Oo.jsx(Text, {
            dimColor: true,
            children: "                         \u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591"
          }), Oo.jsx(Text, {
            children: "               \u2588\u2588\u2592\u2592\u2588\u2588  "
          })]
        });
        z = Oo.jsx(Text, {
          children: "                                            \u2592\u2592      \u2588\u2588   \u2592"
        });
        V = Oo.jsx(Text, {
          children: "                                          \u2592\u2592\u2591\u2591\u2592\u2592      \u2592 \u2592\u2592"
        });
        t[14] = j;
        t[15] = z;
        t[16] = V;
      } else {
        j = t[14];
        z = t[15];
        V = t[16];
      }
      let K;
      if (t[17] === Symbol.for("react.memo_cache_sentinel")) {
        K = Oo.jsxs(Text, {
          children: ["      ", Oo.jsx(Text, {
            color: "clawd_body",
            children: "\u2597"
          }), Oo.jsxs(Text, {
            color: "clawd_background",
            backgroundColor: "clawd_body",
            children: [" ", "\u2597", "     ", "\u2596", " "]
          }), Oo.jsx(Text, {
            color: "clawd_body",
            children: "\u2596"
          }), "                           \u2592\u2592         \u2592\u2592 "]
        });
        t[17] = K;
      } else {
        K = t[17];
      }
      let J;
      if (t[18] === Symbol.for("react.memo_cache_sentinel")) {
        J = Oo.jsxs(Text, {
          children: ["       ", Oo.jsx(Text, {
            backgroundColor: "clawd_body",
            children: " ".repeat(9)
          }), "                           \u2591          \u2592   "]
        });
        t[18] = J;
      } else {
        J = t[18];
      }
      let Q;
      if (t[19] === Symbol.for("react.memo_cache_sentinel")) {
        Q = Oo.jsxs(Text, {
          children: [".......", Oo.jsx(Text, {
            backgroundColor: "clawd_body",
            children: " "
          }), Oo.jsx(Text, {
            children: " "
          }), Oo.jsx(Text, {
            backgroundColor: "clawd_body",
            children: " "
          }), Oo.jsx(Text, {
            children: "   "
          }), Oo.jsx(Text, {
            backgroundColor: "clawd_body",
            children: " "
          }), Oo.jsx(Text, {
            children: " "
          }), Oo.jsx(Text, {
            backgroundColor: "clawd_body",
            children: " "
          }), "..........................\u2591..........\u2592...."]
        });
        t[19] = Q;
      } else {
        Q = t[19];
      }
      let Z;
      if (t[20] !== I) {
        Z = Oo.jsx(gXd, {
          width: 58,
          children: Oo.jsxs(gXd, {
            flexDirection: "column",
            children: [I, L, P, F, H, U, N, O, M, W, j, z, V, K, J, Q]
          })
        });
        t[20] = I;
        t[21] = Z;
      } else {
        Z = t[21];
      }
      return Z;
    }
    let s;
    if (t[22] !== r) {
      s = Oo.jsxs(Text, {
        color: "claude",
        children: [r, " "]
      });
      t[22] = r;
      t[23] = s;
    } else {
      s = t[23];
    }
    let i;
    if (t[24] === Symbol.for("react.memo_cache_sentinel")) {
      i = Oo.jsxs(Text, {
        dimColor: true,
        children: ["v", {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION, " "]
      });
      t[24] = i;
    } else {
      i = t[24];
    }
    let a;
    if (t[25] !== s) {
      a = Oo.jsxs(Text, {
        children: [s, i]
      });
      t[25] = s;
      t[26] = a;
    } else {
      a = t[26];
    }
    let l;
    let c;
    let u;
    let d;
    let p;
    let m;
    if (t[27] === Symbol.for("react.memo_cache_sentinel")) {
      l = Oo.jsx(Text, {
        children: ".........................................................."
      });
      c = Oo.jsx(Text, {
        children: "                                                          "
      });
      u = Oo.jsx(Text, {
        children: "     *                                       \u2588\u2588\u2588\u2588\u2588\u2593\u2593\u2591     "
      });
      d = Oo.jsx(Text, {
        children: "                                 *         \u2588\u2588\u2588\u2593\u2591     \u2591\u2591   "
      });
      p = Oo.jsx(Text, {
        children: "            \u2591\u2591\u2591\u2591\u2591\u2591                        \u2588\u2588\u2588\u2593\u2591           "
      });
      m = Oo.jsx(Text, {
        children: "    \u2591\u2591\u2591   \u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591                      \u2588\u2588\u2588\u2593\u2591           "
      });
      t[27] = l;
      t[28] = c;
      t[29] = u;
      t[30] = d;
      t[31] = p;
      t[32] = m;
    } else {
      l = t[27];
      c = t[28];
      u = t[29];
      d = t[30];
      p = t[31];
      m = t[32];
    }
    let f;
    let h;
    let g;
    let y;
    let _;
    if (t[33] === Symbol.for("react.memo_cache_sentinel")) {
      f = Oo.jsxs(Text, {
        children: [Oo.jsx(Text, {
          children: "   \u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591    "
        }), Oo.jsx(Text, {
          bold: true,
          children: "*"
        }), Oo.jsx(Text, {
          children: "                \u2588\u2588\u2593\u2591\u2591      \u2593   "
        })]
      });
      h = Oo.jsx(Text, {
        children: "                                             \u2591\u2593\u2593\u2588\u2588\u2588\u2593\u2593\u2591    "
      });
      g = Oo.jsx(Text, {
        dimColor: true,
        children: " *                                 \u2591\u2591\u2591\u2591                   "
      });
      y = Oo.jsx(Text, {
        dimColor: true,
        children: "                                 \u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591                 "
      });
      _ = Oo.jsx(Text, {
        dimColor: true,
        children: "                               \u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591           "
      });
      t[33] = f;
      t[34] = h;
      t[35] = g;
      t[36] = y;
      t[37] = _;
    } else {
      f = t[33];
      h = t[34];
      g = t[35];
      y = t[36];
      _ = t[37];
    }
    let b;
    if (t[38] === Symbol.for("react.memo_cache_sentinel")) {
      b = Oo.jsxs(Text, {
        children: ["                                                      ", Oo.jsx(Text, {
          dimColor: true,
          children: "*"
        }), Oo.jsx(Text, {
          children: "   "
        })]
      });
      t[38] = b;
    } else {
      b = t[38];
    }
    let S;
    if (t[39] === Symbol.for("react.memo_cache_sentinel")) {
      S = Oo.jsxs(Text, {
        children: ["      ", Oo.jsx(Text, {
          color: "clawd_body",
          children: "\u2597"
        }), Oo.jsxs(Text, {
          color: "clawd_background",
          backgroundColor: "clawd_body",
          children: [" ", "\u2597", "     ", "\u2596", " "]
        }), Oo.jsx(Text, {
          color: "clawd_body",
          children: "\u2596"
        }), Oo.jsx(Text, {
          children: "                       "
        }), Oo.jsx(Text, {
          bold: true,
          children: "*"
        }), Oo.jsx(Text, {
          children: "                 "
        })]
      });
      t[39] = S;
    } else {
      S = t[39];
    }
    let E;
    if (t[40] === Symbol.for("react.memo_cache_sentinel")) {
      E = Oo.jsxs(Text, {
        children: ["       ", Oo.jsx(Text, {
          backgroundColor: "clawd_body",
          children: " ".repeat(9)
        }), "      *                                   "]
      });
      t[40] = E;
    } else {
      E = t[40];
    }
    let C;
    if (t[41] === Symbol.for("react.memo_cache_sentinel")) {
      C = Oo.jsxs(Text, {
        children: [".......", Oo.jsx(Text, {
          backgroundColor: "clawd_body",
          children: " "
        }), Oo.jsx(Text, {
          children: " "
        }), Oo.jsx(Text, {
          backgroundColor: "clawd_body",
          children: " "
        }), Oo.jsx(Text, {
          children: "   "
        }), Oo.jsx(Text, {
          backgroundColor: "clawd_body",
          children: " "
        }), Oo.jsx(Text, {
          children: " "
        }), Oo.jsx(Text, {
          backgroundColor: "clawd_body",
          children: " "
        }), ".........................................."]
      });
      t[41] = C;
    } else {
      C = t[41];
    }
    let x;
    if (t[42] !== a) {
      x = Oo.jsx(gXd, {
        width: 58,
        children: Oo.jsxs(gXd, {
          flexDirection: "column",
          children: [a, l, c, u, d, p, m, f, h, g, y, _, b, S, E, C]
        })
      });
      t[42] = a;
      t[43] = x;
    } else {
      x = t[43];
    }
    return x;
  }
  var wYo;
  var Oo;
  var znn = __lazy(() => {
    et();
    ki();
    pr();
    wYo = __toESM(pt(), 1);
    Oo = __toESM(ie(), 1);
  });
  async function Ubf(e) {
    let t = [];
    for (let n of e) {
      let r = {
        plugin: n.name
      };
      let o = `${n.name}:`;
      if (n.themesPath) {
        t.push(...(await CZr(n.themesPath, r, o)));
      }
      for (let s of n.themesPaths ?? []) {
        t.push(...(await CZr(s, r, o)));
      }
    }
    wZr(t);
    Pe("plugin_load_themes");
    return t.sort((n, r) => n.name.localeCompare(r.name));
  }
  async function pSc(e) {
    if (Pc("themes")) {
      bWe.setState(() => []);
      return [];
    }
    let t = await Ubf(e);
    bWe.setState(() => t);
    return t;
  }
  var mSc = __lazy(() => {
    ln();
    wb();
    Qbe();
  });
  function Bbf(e, t, n) {
    let r = new Set(t.plugins.map(i => i.name));
    let o = `@${n}`;
    let s = [];
    for (let i of Object.keys(e.plugins)) {
      if (!i.endsWith(o)) {
        continue;
      }
      let a = i.slice(0, -o.length);
      let l = t.renames && ivt(a, t.renames, r)?.kind === "renamed";
      if (!r.vZc(a) && !l) {
        s.push(i);
      }
    }
    return s;
  }
  async function yfr() {
    await N8l();
    let e = Kw();
    let t = bwt();
    let n = await qM();
    let r = [];
    for (let o of Object.keys(n)) {
      try {
        let s = await uL(o);
        if (!s.forceRemoveDeletedPlugins) {
          continue;
        }
        let i = Bbf(e, s, o);
        for (let a of i) {
          if (a in t) {
            continue;
          }
          let l = e.plugins[a] ?? [];
          if (!l.some(u => u.scope === "user" || u.scope === "project" || u.scope === "local")) {
            continue;
          }
          for (let u of l) {
            let {
              scope: d
            } = u;
            if (d !== "user" && d !== "project" && d !== "local") {
              continue;
            }
            try {
              let p = await Ywe(a, d);
              logEvent("tengu_plugin_delisted_enforcement", {
                outcome: p.success ? "uninstalled" : "uninstall-failed",
                scope: d,
                ...(!p.success && {
                  error_kind: iX(p.message)
                }),
                ...Eq(a, II())
              });
            } catch (p) {
              logForDebugging(`Failed to auto-uninstall delisted plugin ${a} from ${d}: ${he(p)}`, {
                level: "error"
              });
              logEvent("tengu_plugin_delisted_enforcement", {
                outcome: "uninstall-failed",
                scope: d,
                error_kind: iX(p),
                ...Eq(a, II())
              });
            }
          }
          await L8l(a);
          r.push(a);
        }
      } catch (s) {
        logForDebugging(`Failed to check for delisted plugins in "${o}": ${he(s)}`, {
          level: "warn"
        });
        logEvent("tengu_plugin_delisted_enforcement", {
          outcome: "scan-failed",
          error_kind: iX(s),
          _PROTO_marketplace_name: o,
          is_official_marketplace: BI(o)
        });
      }
    }
    return r;
  }
  var CYo = __lazy(() => {
    Ot();
    ywt();
    je();
    dt();
    Wk();
    Qk();
    H8();
    yT();
    Yar();
    Kf();
    Bor();
  });
  function _fr({
    enabled: e = true
  } = {}) {
    let t = Lo();
    let n = bt(s => s.plugins.needsRefresh);
    let {
      addNotification: r
    } = Fi();
    let o = Knn.useCallback(async () => {
      try {
        let {
          enabled: s,
          disabled: i,
          errors: a,
          warnings: l
        } = await loadAllPluginsCacheOnly();
        let c = [...a];
        if ((await yfr()).length > 0) {
          QGn();
        }
        let d = Object.keys(bwt()).length;
        tD("plugins", d);
        t(C => {
          if (C.setupIssues.flaggedPluginCount === d) {
            return C;
          }
          return {
            ...C,
            setupIssues: {
              ...C.setupIssues,
              flaggedPluginCount: d
            }
          };
        });
        let p = [];
        let m = [];
        try {
          p = await M7e();
        } catch (C) {
          let x = C instanceof Error ? C.message : String(C);
          c.push({
            type: "generic-error",
            source: "plugin-commands",
            error: `Failed to load plugin commands: ${x}`
          });
        }
        try {
          m = await YXt();
        } catch (C) {
          let x = C instanceof Error ? C.message : String(C);
          c.push({
            type: "generic-error",
            source: "plugin-agents",
            error: `Failed to load plugin agents: ${x}`
          });
        }
        try {
          await loadPluginHooks();
        } catch (C) {
          let x = C instanceof Error ? C.message : String(C);
          c.push({
            type: "generic-error",
            source: "plugin-hooks",
            error: `Failed to load plugin hooks: ${x}`
          });
        }
        let h = (await Promise.all(s.map(async C => {
          if (C.mcpServers) {
            return Object.keys(C.mcpServers).length;
          }
          let x = await Doe(C, c);
          if (x) {
            C.mcpServers = x;
          }
          return x ? Object.keys(x).length : 0;
        }))).reduce((C, x) => C + x, 0);
        let y = (await Promise.all(s.map(async C => {
          if (C.lspServers) {
            return Object.keys(C.lspServers).length;
          }
          let x = await Y6e(C, c);
          if (x) {
            C.lspServers = x;
          }
          return x ? Object.keys(x).length : 0;
        }))).reduce((C, x) => C + x, 0);
        let _ = LGn(s);
        let b = [...l, ..._];
        let S = (await pSc(s)).length;
        await uur(s, c);
        t(C => {
          let x = C.plugins.errors.filter(F => F.source === "lsp-manager" || F.source.startsWith("plugin:"));
          let A = new Set(c.map(F => F.type === "generic-error" ? `generic-error:${F.source}:${F.error}` : `${F.type}:${F.source}`));
          let I = [...x.filter(F => {
            let H = F.type === "generic-error" ? `generic-error:${F.source}:${F.error}` : `${F.type}:${F.source}`;
            return !A.vZc(H);
          }), ...c];
          let O = C.plugins.warnings.filter(F => F.source.startsWith("plugin:"));
          let M = new Set(b.map(F => `${F.type}:${F.source}`));
          let P = [...O.filter(F => !M.vZc(`${F.type}:${F.source}`)), ...b];
          return {
            ...C,
            plugins: {
              ...C.plugins,
              enabled: s,
              disabled: i,
              commands: p,
              errors: I,
              warnings: P
            }
          };
        });
        logForDebugging(`Loaded plugins - Enabled: ${s.length}, Disabled: ${i.length}, Commands: ${p.length}, Agents: ${m.length}, Errors: ${c.length}`);
        let E = s.reduce((C, x) => {
          if (!x.hooksConfig) {
            return C;
          }
          return C + Object.values(x.hooksConfig).reduce((A, k) => A + (k?.reduce((I, O) => I + O.hooks.length, 0) ?? 0), 0);
        }, 0);
        return {
          enabled_count: s.length,
          disabled_count: i.length,
          inline_count: Bn(s, C => C.source.endsWith("@inline")),
          marketplace_count: Bn(s, C => !C.source.endsWith("@inline")),
          error_count: c.length,
          skill_count: p.length,
          agent_count: m.length,
          hook_count: E,
          mcp_count: h,
          lsp_count: y,
          theme_count: S,
          ant_enabled_names: undefined
        };
      } catch (s) {
        let i = sr(s);
        Oe($o(i, "plugin initial load failed"));
        logForDebugging(`Error loading plugins: ${s}`);
        t(a => {
          let l = a.plugins.errors.filter(u => u.source === "lsp-manager" || u.source.startsWith("plugin:"));
          let c = {
            type: "generic-error",
            source: "plugin-system",
            error: i.message
          };
          return {
            ...a,
            plugins: {
              ...a.plugins,
              enabled: [],
              disabled: [],
              commands: [],
              errors: [...l, c]
            }
          };
        });
        return {
          enabled_count: 0,
          disabled_count: 0,
          inline_count: 0,
          marketplace_count: 0,
          error_count: 1,
          skill_count: 0,
          agent_count: 0,
          hook_count: 0,
          mcp_count: 0,
          lsp_count: 0,
          theme_count: 0,
          load_failed: true,
          ant_enabled_names: undefined
        };
      }
    }, [t]);
    Knn.useEffect(() => {
      if (!e) {
        return;
      }
      o().then(s => {
        let {
          ant_enabled_names: i,
          ...a
        } = s;
        let l = {
          ...a,
          has_custom_plugin_cache_dir: !!process.env.CLAUDE_CODE_PLUGIN_CACHE_DIR
        };
        logEvent("tengu_plugins_loaded", {
          ...l,
          ...(i !== undefined && {
            enabled_names: i
          })
        });
        wn("info", "tengu_plugins_loaded", l);
      });
    }, [o, e]);
    Knn.useEffect(() => {
      if (!e || !n) {
        return;
      }
      r({
        key: "plugin-reload-pending",
        text: "Plugins changed. Run /reload-plugins to activate.",
        color: "suggestion",
        priority: "low"
      });
    }, [e, n, r]);
  }
  var Knn;
  var RYo = __lazy(() => {
    Nd();
    Ot();
    Tpe();
    ho();
    je();
    Zm();
    dt();
    Rn();
    Eor();
    OXt();
    c5o();
    Y9e();
    mSc();
    q5t();
    sNe();
    CYo();
    Yar();
    xg();
    pK();
    Knn = __toESM(ot(), 1);
  });
  function hSc(e) {
    return t => {
      let n = t.toolPermissionContext;
      if (typeof e.permission_mode === "string") {
        let o = uF(e.permission_mode);
        try {
          if (n = {
            ...transitionPermissionMode(n.mode, o, n),
            mode: o
          }, o === "auto") {
            n = stripDangerousPermissionsForAutoMode(n);
          }
        } catch (s) {
          logForDebugging(`[externalMetadataToAppState] transitionPermissionMode rejected restored mode '${o}': ${sr(s).message}`);
        }
      }
      let r = $bf.safeParse(e.post_turn_summary);
      return {
        ...t,
        toolPermissionContext: n,
        ...(typeof e.is_ultraplan_mode === "boolean" && {
          isUltraplanMode: e.is_ultraplan_mode
        }),
        ...(r.success && {
          postTurnSummary: r.data
        })
      };
    };
  }
  function gSc(e) {
    let t = e.session_allow_rules;
    if (!Array.isArray(t)) {
      return r => r;
    }
    let n = t.filter(r => typeof r === "string" && !r.startsWith("mcp__"));
    if (n.length === 0) {
      return r => r;
    }
    return r => ({
      ...r,
      toolPermissionContext: {
        ...r.toolPermissionContext,
        alwaysAllowRules: {
          ...r.toolPermissionContext.alwaysAllowRules,
          session: n
        }
      }
    });
  }
  function HCe({
    newState: e,
    oldState: t
  }, n) {
    let r = t.toolPermissionContext.mode;
    let o = e.toolPermissionContext.mode;
    if (r !== o) {
      let a = qA(r);
      let l = qA(o);
      if (a !== l) {
        let c = l === "plan" && e.isUltraplanMode && !t.isUltraplanMode ? true : null;
        n?.notifyMetadataChanged({
          permission_mode: l,
          is_ultraplan_mode: c
        });
      }
      n?.notifyPermissionModeChanged(o);
      aOe("--permission-mode", [], o);
    }
    if (n && e.tasks !== t.tasks) {
      let a = fSc(t);
      let l = fSc(e);
      if (a.length !== l.length || l.some((c, u) => c.task_id !== a[u]?.task_id)) {
        n.notifyInternalMetadataChanged({
          running_background_tasks: l
        });
      }
    }
    let s = t.toolPermissionContext.alwaysAllowRules.session;
    let i = e.toolPermissionContext.alwaysAllowRules.session;
    if (s !== i) {
      let a = i?.filter(l => !l.startsWith("mcp__"));
      n?.notifyInternalMetadataChanged({
        session_allow_rules: a?.length ? a : null
      });
    }
    if (e.mainLoopModel !== t.mainLoopModel) {
      let a = e.mainLoopModel;
      setMainLoopModelOverride(a);
      Promise.resolve().then(() => (x_t(), O0o)).then(l => l.fetchBootstrapData());
      n?.notifyMetadataChanged({
        model: a ?? getDefaultMainLoopModel()
      });
      aOe("--model", ["-m"], a);
    }
    if (e.effortValue !== t.effortValue) {
      n?.notifyMetadataChanged({
        effort_level: e.effortValue == null ? null : String(e.effortValue)
      });
      let a = e.effortValue;
      if (a === undefined) {
        aOe("--effort", [], null);
      } else if (zce(String(a))) {
        aOe("--effort", [], String(a));
      }
    }
    if (e.advisorModel !== t.advisorModel) {
      aOe("--advisor", [], e.advisorModel ?? null);
    }
    if (n && e.frameUrls !== t.frameUrls) {
      let a = Object.values(e.frameUrls);
      if (a.length > 0 || Object.keys(t.frameUrls).length > 0) {
        n.notifyMetadataChanged({
          artifacts: a.length === 0 ? null : a.map(l => ({
            url: l.url,
            title: l.title,
            favicon: l.favicon,
            kind: "frame",
            updated_at: new Date(l.updatedAt).toISOString()
          }))
        });
      }
    }
    if (n && e.activeGoal !== t.activeGoal) {
      let a = e.activeGoal;
      n.notifyActiveGoalChanged(a);
      n.notifyMetadataChanged({
        goal: a ? {
          condition: a.condition,
          set_at: a.setAt,
          iterations: a.iterations,
          last_reason: a.lastReason ?? null,
          met: false
        } : null
      });
    }
    if (e.expandedView !== t.expandedView) {
      let a = e.expandedView === "tasks";
      saveGlobalConfig(l => {
        if (l.showExpandedTodos === a) {
          return l;
        }
        return {
          ...l,
          showExpandedTodos: a
        };
      });
    }
    if (e.verbose !== t.verbose) {
      Mk("verbose", e.verbose);
    }
    if (e.settings !== t.settings) {
      try {
        if (clearApiKeyHelperCache(), clearAwsCredentialsCache(), resetAwsAuthRefreshCooldown(), clearGcpCredentialsCache(), e.settings.env !== t.settings.env && checkHasTrustDialogAccepted()) {
          applyConfigEnvironmentVariables();
        }
      } catch (a) {
        logForDebugging(`Failed to apply settings change (clear auth caches / re-apply env): ${sr(a).message}`, {
          level: "error"
        });
      }
    }
  }
  function fSc(e) {
    return Object.values(e.tasks).filter(t => kv(t) && (t.type === "local_bash" || t.type === "monitor_mcp" || t.type === "monitor_ws")).map(t => ({
      task_id: t.id,
      description: t.description
    }));
  }
  var $bf;
  var xRt = __lazy(() => {
    at();
    zf();
    no();
    je();
    Fp();
    dt();
    qEe();
    Eo();
    HT();
    S_();
    zg();
    $bf = v.object({
      status_category: v.string(),
      status_detail: v.string(),
      needs_action: v.string()
    });
  });
  var TSc = {};