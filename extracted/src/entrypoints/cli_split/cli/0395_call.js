  __export(W8l, {
    scaleCharsToTokens: () => scaleCharsToTokens,
    getPluginInventory: () => getPluginInventory,
    computePluginTokenCost: () => computePluginTokenCost
  });
  async function getPluginInventory(e, t) {
    if (t === "builtin") {
      let m = Kea(e.name);
      if (!m) {
        throw Error(`Built-in plugin ${e.name} not found`);
      }
      return {
        commands: [],
        agents: [],
        skills: m.skills?.map(f => ({
          name: f.name
        })) ?? [],
        hooks: m.hooks ? Object.keys(m.hooks) : [],
        mcpServers: m.mcpServers ? Object.keys(m.mcpServers) : [],
        lspServers: []
      };
    }
    let n = UI(t);
    let r = Yo(e.source).name || e.name;
    let o = n ? undefined : (await uL(t)).plugins.find(m => m.name === r);
    if (!o && !n) {
      throw Error(`Plugin ${r} not found in marketplace ${t}`);
    }
    let [s, i, a] = await Promise.all([H8l([e.commandsPath, ...(e.commandsPaths ?? [])]), H8l([e.agentsPath, ...(e.agentsPaths ?? [])]), V6m([e.skillsPath, ...(e.skillsPaths ?? [])])]);
    let l = e.hooksConfig ? Object.keys(e.hooksConfig) : Jar(o?.hooks);
    let c = e.mcpServers ? Object.keys(e.mcpServers) : await W6m(e.path);
    let u = c.length > 0 ? c : Jar(o?.mcpServers);
    let d = e.lspServers ? Object.keys(e.lspServers) : (await G6m(e.path)).concat(Jar(e.manifest.lspServers));
    let p = d.length > 0 ? Ro(d) : Jar(o?.lspServers);
    return {
      commands: s,
      agents: i,
      skills: a,
      hooks: l,
      mcpServers: u,
      lspServers: p
    };
  }
  async function computePluginTokenCost(e, t, n) {
    let [r, o, s] = await Promise.all([Promise.all(e.skills.map(u => c4o(u.path ? A5.join(u.path, "SKILL.md") : undefined, B8l(u, n)))), Promise.all(e.agents.map(u => c4o(u.path, u.name))), Promise.all(e.commands.map(u => c4o(u.path, B8l(u, n))))]);
    let i = [...r, ...o, ...s];
    let a = i.map(u => u.alwaysOn).filter(Boolean).join(`
`);
    let l = i.map(u => u.onInvoke).filter(Boolean).join(`

`);
    let c = {};
    for (let u of t) {
      let [d, p] = await Promise.all([$8l(a, u), $8l(l, u)]);
      if (d !== null && p !== null) {
        c[u] = {
          always_on: d,
          on_invoke: p
        };
      }
    }
    return {
      tokens: c,
      inventory: {
        ...e,
        skills: u4o(e.skills, r),
        agents: u4o(e.agents, o),
        commands: u4o(e.commands, s)
      }
    };
  }
  function scaleCharsToTokens(e, t, n, r = 4) {
    if (n !== undefined && t > 0) {
      return Math.round(e / t * n);
    }
    return xm(" ".repeat(e), r);
  }
  function B8l(e, t) {
    if (!t) {
      return e.name;
    }
    return `${t}:${e.name.replace(/[^a-zA-Z0-9_-]/g, "-")}`;
  }
  async function c4o(e, t) {
    if (!e) {
      return {
        alwaysOn: "",
        onInvoke: ""
      };
    }
    let n;
    try {
      n = await q8l(e, 1048576);
    } catch (l) {
      p4o(e, l);
      return {
        alwaysOn: "",
        onInvoke: ""
      };
    }
    let {
      frontmatter: r,
      content: o
    } = sf(n, e, {
      normalizeKeys: true
    });
    let s = M2(r.description, t) ?? Rpe(o, "Skill");
    let i = r.when_to_use != null ? String(r.when_to_use) : undefined;
    return {
      alwaysOn: Cvo({
        name: t,
        description: s,
        whenToUse: i
      }),
      onInvoke: o.trim()
    };
  }
  async function q8l(e, t) {
    let n = await _ie.open(e, "r");
    try {
      let {
        size: r
      } = await n.stat();
      let o = Math.min(r, t);
      let s = Buffer.alloc(o);
      let {
        bytesRead: i
      } = await n.read(s, 0, o, 0);
      return s.toString("utf8", 0, i);
    } finally {
      await n.close();
    }
  }
  function u4o(e, t) {
    return e.map((n, r) => {
      let o = t[r];
      if (!o) {
        return n;
      }
      return {
        ...n,
        chars: {
          always_on: o.alwaysOn.length,
          on_invoke: o.onInvoke.length
        }
      };
    });
  }
  async function $8l(e, t) {
    if (!e) {
      return 0;
    }
    return i6e([{
      role: "user",
      content: e
    }], [], t);
  }
  function Jar(e) {
    return [e].flat().filter(t => t != null && typeof t === "object").flatMap(Object.keys);
  }
  async function W6m(e) {
    try {
      let t = await _ie.readFile(A5.join(e, ".mcp.json"), "utf-8");
      let n = qt(t);
      if (n == null || typeof n !== "object") {
        return [];
      }
      let r = "mcpServers" in n && typeof n.mcpServers === "object" ? n.mcpServers : n;
      return r == null ? [] : Object.keys(r);
    } catch {
      return [];
    }
  }
  async function G6m(e) {
    try {
      let t = await _ie.readFile(A5.join(e, ".lsp.json"), "utf-8");
      let n = qt(t);
      if (n == null || typeof n !== "object") {
        return [];
      }
      return Object.keys(n);
    } catch {
      return [];
    }
  }
  async function H8l(e) {
    let t = [];
    let n = new Set();
    for (let r of e) {
      if (!r) {
        continue;
      }
      let o;
      try {
        o = await _ie.readdir(r, {
          withFileTypes: true
        });
      } catch (s) {
        p4o(r, s);
        continue;
      }
      for (let s of o) {
        if (s.isFile() && s.name.endsWith(".md")) {
          let i = A5.join(r, s.name);
          let a = A5.resolve(i);
          if (n.vZc(a)) {
            continue;
          }
          n.add(a);
          t.push({
            name: A5.basename(s.name, ".md"),
            path: i
          });
        }
      }
    }
    return t;
  }
  async function V6m(e) {
    let t = [];
    let n = new Set();
    let r = (o, s) => {
      let i = A5.resolve(s);
      if (n.vZc(i)) {
        return;
      }
      n.add(i);
      t.push({
        name: o,
        path: s
      });
    };
    for (let o of e) {
      if (!o) {
        continue;
      }
      try {
        let i = A5.join(o, "SKILL.md");
        if ((await _ie.stat(i)).isFile()) {
          let l = "";
          try {
            let c = await q8l(i, 1048576);
            let {
              frontmatter: u
            } = sf(c, i);
            l = typeof u.name === "string" ? u.name.trim() : "";
          } catch {}
          r(l || A5.basename(o), o);
          continue;
        }
      } catch {}
      let s;
      try {
        s = await _ie.readdir(o, {
          withFileTypes: true
        });
      } catch (i) {
        p4o(o, i);
        continue;
      }
      for (let i of s) {
        if (!i.isDirectory() && !i.isSymbolicLink()) {
          continue;
        }
        let a = A5.join(o, i.name);
        try {
          if ((await _ie.stat(A5.join(a, "SKILL.md"))).isFile()) {
            r(i.name, a);
          }
        } catch {}
      }
    }
    return t;
  }
  function p4o(e, t) {
    logForDebugging(`Failed to read plugin components from ${e}: ${he(t)}`, {
      level: "error"
    });
    Oe(sr(t));
  }
  var _ie;
  var A5;
  var m4o = __lazy(() => {
    vut();
    aU();
    IV();
    T9();
    je();
    dt();
    fv();
    Rn();
    v9();
    yT();
    Kf();
    _ie = __toESM(require("fs/promises"));
    A5 = __toESM(require("path"));
  });
  async function kYe() {
    try {
      if (!loadAllPluginsCacheOnly.cache?.vZc(undefined)) {
        return [];
      }
      if (getStrictKnownMarketplaces() !== null) {
        return [];
      }
      let {
        enabled: e
      } = await loadAllPluginsCacheOnly();
      if (e.length === 0) {
        return [];
      }
      let t = II();
      let n = fde();
      let r = getGlobalConfig().numStartups;
      let o = Date.now();
      let s = [];
      for (let i of e) {
        let {
          marketplace: a
        } = Yo(i.repository);
        if (!a || UI(a)) {
          continue;
        }
        if (yso(i, t, n) !== "user-install") {
          continue;
        }
        if (Y6m(i)) {
          continue;
        }
        let l = Qjt(i.repository);
        if (!l) {
          continue;
        }
        if (dso(i.repository)) {
          continue;
        }
        let {
          sessionsSinceLastUse: c,
          daysSinceLastUse: u
        } = Zjt(l, r, o);
        if (u >= 14 && c >= 10) {
          s.push({
            pluginId: i.repository,
            name: i.name,
            daysSinceLastUse: u
          });
        }
      }
      s.sort((i, a) => a.daysSinceLastUse - i.daysSinceLastUse);
      return s;
    } catch (e) {
      logForDebugging(`plugin-disuse tip: failed to compute disused plugins: ${e}`, {
        level: "error"
      });
      return [];
    }
  }
  function G8l(e) {
    if (getStrictKnownMarketplaces() !== null) {
      return null;
    }
    let t = Qjt(e);
    if (!t) {
      return null;
    }
    if (dso(e)) {
      return 0;
    }
    return Zjt(t, getGlobalConfig().numStartups, Date.now()).daysSinceLastUse;
  }
  function Y6m(e) {
    return Boolean(e.lspServers && Object.keys(e.lspServers).length > 0 || e.themesPath || e.themesPaths?.length || e.outputStylesPath || e.outputStylesPaths?.length || e.monitors?.length || e.workflowsPath || e.workflowsPaths?.length);
  }
  var Xar = __lazy(() => {
    je();
    H8();
    k1();
    Kf();
    xg();
    Xk();
    Wk();
    dV();
  });
  function AUe(e) {
    switch (e.type) {
      case "path-not-found":
        return `${e.component} path not found: ${e.path}`;
      case "path-traversal":
        return `${e.component} path escapes plugin directory: ${e.path}`;
      case "git-auth-failed":
        return `Git ${e.authType.toUpperCase()} authentication failed for ${e.gitUrl}`;
      case "git-timeout":
        return `Git ${e.operation} timed out for ${e.gitUrl}`;
      case "network-error":
        return `Network error accessing ${e.url}${e.details ? `: ${e.details}` : ""}`;
      case "manifest-parse-error":
        return `Failed to parse manifest at ${e.manifestPath}: ${e.parseError}`;
      case "manifest-validation-error":
        return `Invalid manifest at ${e.manifestPath}: ${e.validationErrors.join(", ")}`;
      case "plugin-not-found":
        return `Plugin "${e.pluginId}" not found in marketplace "${e.marketplace}"`;
      case "marketplace-not-found":
        return `Marketplace "${e.marketplace}" not found`;
      case "marketplace-load-failed":
        return `Failed to load marketplace "${e.marketplace}": ${e.reason}`;
      case "mcp-config-invalid":
        return `Invalid MCP server config for "${e.serverName}": ${e.validationError}`;
      case "hook-load-failed":
        return `Failed to load hooks from ${e.hookPath}: ${e.reason}`;
      case "component-load-failed":
        return `Failed to load ${e.component} from ${e.path}: ${e.reason}`;
      case "mcpb-download-failed":
        return `Failed to download MCPB from ${e.url}: ${e.reason}`;
      case "mcpb-extract-failed":
        return `Failed to extract MCPB ${e.mcpbPath}: ${e.reason}`;
      case "mcpb-invalid-manifest":
        return `MCPB manifest invalid at ${e.mcpbPath}: ${e.validationError}`;
      case "marketplace-blocked-by-policy":
        return e.blockedByBlocklist ? `Marketplace "${e.marketplace}" is blocked by enterprise policy` : `Marketplace "${e.marketplace}" is not in the allowed marketplace list`;
      case "dependency-unsatisfied":
        return e.reason === "not-enabled" ? `Dependency "${e.dependency}" is disabled` : `Dependency "${e.dependency}" is not installed`;
      case "dependency-version-unsatisfied":
        return `Requires "${e.dependency}" ${e.required}, installed ${e.installed ?? "version unknown"}`;
      case "lsp-config-invalid":
        return `Invalid LSP server config for "${e.serverName}": ${e.validationError}`;
      case "lsp-server-start-failed":
        return `LSP server "${e.serverName}" failed to start: ${e.reason}`;
      case "lsp-server-crashed":
        return e.signal ? `LSP server "${e.serverName}" crashed with signal ${e.signal}` : `LSP server "${e.serverName}" crashed with exit code ${e.exitCode ?? "unknown"}`;
      case "lsp-request-timeout":
        return `LSP server "${e.serverName}" timed out on ${e.method} after ${e.timeoutMs}ms`;
      case "lsp-request-failed":
        return `LSP server "${e.serverName}" ${e.method} failed: ${e.error}`;
      case "plugin-cache-miss":
        return `Plugin "${e.plugin}" not cached at ${e.installPath}`;
      case "plugin-not-installed":
        return `Plugin "${e.plugin}" is enabled in project settings but isn't installed here`;
      case "autoupdate-blocked-by-pinner":
        {
          let n = e.heldAt ? ` at ${e.heldAt}` : "";
          let r = e.disabledPinners.length > 0 ? ` (${e.disabledPinners.join(", ")} ${e.disabledPinners.length === 1 ? "is" : "are"} disabled)` : "";
          return `Autoupdate held${n} \u2014 version constraint from ${e.blockedBy.join(", ")}${r}`;
        }
      case "generic-error":
        return e.error;
    }
    return hS(e);
  }
  function AYe(e) {
    switch (e.type) {
      case "path-not-found":
        return "Check that the path in your manifest or marketplace config is correct";
      case "path-traversal":
        return 'Paths in plugin.json must not use ".." to reference files outside the plugin directory';
      case "git-auth-failed":
        return e.authType === "ssh" ? "Configure SSH keys or use HTTPS URL instead" : "Configure credentials or use SSH URL instead";
      case "git-timeout":
      case "network-error":
        return "Check your internet connection and try again";
      case "manifest-parse-error":
        return "Check manifest file syntax in the plugin directory";
      case "manifest-validation-error":
        return "Check manifest file follows the required schema";
      case "plugin-not-found":
        return `Plugin may not exist in marketplace "${e.marketplace}"`;
      case "marketplace-not-found":
        return e.availableMarketplaces.length > 0 ? `Available marketplaces: ${e.availableMarketplaces.join(", ")}` : "Add the marketplace first using /plugin marketplace add";
      case "mcp-config-invalid":
        return "Check MCP server configuration in .mcp.json or manifest";
      case "hook-load-failed":
        return "Check hooks.json file syntax and structure";
      case "component-load-failed":
        return `Check ${e.component} directory structure and file permissions`;
      case "mcpb-download-failed":
        return "Check your internet connection and URL accessibility";
      case "mcpb-extract-failed":
        return "Verify the MCPB file is valid and not corrupted";
      case "mcpb-invalid-manifest":
        return "Contact the plugin author about the invalid manifest";
      case "marketplace-blocked-by-policy":
        if (e.blockedByBlocklist) {
          return "This marketplace source is explicitly blocked by your administrator";
        }
        return e.allowedSources.length > 0 ? `Allowed sources: ${e.allowedSources.join(", ")}` : "Contact your administrator to configure allowed marketplace sources";
      case "dependency-unsatisfied":
        return e.reason === "not-enabled" ? `Enable "${e.dependency}" or uninstall "${e.plugin}"` : `Install "${e.dependency}" or uninstall "${e.plugin}"`;
      case "dependency-version-unsatisfied":
        return `Update "${e.dependency}" to satisfy ${e.required}, or uninstall "${e.plugin}"`;
      case "lsp-config-invalid":
        return "Check LSP server configuration in the plugin manifest";
      case "lsp-server-start-failed":
      case "lsp-server-crashed":
      case "lsp-request-timeout":
      case "lsp-request-failed":
        return "Check LSP server logs with --debug for details";
      case "plugin-cache-miss":
        return "Run /plugins to refresh the plugin cache";
      case "plugin-not-installed":
        {
          let n = Py("plugin install", e.source, "--scope project");
          return n ? `Run \`${n}\` to install it for this project` : "Install it at project scope to fix this";
        }
      case "autoupdate-blocked-by-pinner":
        {
          let n = e.disabledPinners.length > 0 ? e.disabledPinners[0] : e.blockedBy[0];
          return n ? `Update or uninstall "${n}" to unblock${e.disabledPinners.length > 0 ? " (it is currently disabled)" : ""}` : null;
        }
      case "marketplace-load-failed":
        return e.reason === "cache-miss" ? "Run /reload-plugins to refresh the marketplace cache" : null;
      case "generic-error":
        return null;
    }
    let t = e;
    return null;
  }
  var f4o = __lazy(() => {
    cV();
  });
  function g4o(e, t) {
    let n = getGlobalConfig().skillUsage ?? {};
    let r = [];
    for (let o of t) {
      if (o.type !== "prompt" || o.pluginInfo?.pluginManifest.name !== e) {
        continue;
      }
      let s = n[o.name] ?? (o.unqualifiedName != null ? n[o.unqualifiedName] : undefined);
      r.push({
        name: o.name,
        count: s?.usageCount ?? 0,
        lastUsedAt: s?.lastUsedAt ?? null
      });
    }
    r.sort((o, s) => s.count - o.count);
    return {
      skills: r,
      totalCount: r.reduce((o, s) => o + s.count, 0),
      skillCount: r.length
    };
  }
  function J6m(e) {
    let t = Math.max(0, Math.floor((Date.now() - e) / 86400000));
    if (t === 0) {
      return "today";
    }
    if (t === 1) {
      return "yesterday";
    }
    return `${t}d ago`;
  }
  function V8l(e) {
    let t = h4o.c(20);
    let {
      plugin: n
    } = e;
    let r = bt(e8m);
    let o = bt(Z6m);
    let s = bt(Q6m);
    let i;
    if (t[0] !== o || t[1] !== s || t[2] !== n.manifest.name || t[3] !== r) {
      let f = cir([...r, ...o], bytesPerTokenForModel(s ?? undefined));
      let h;
      if (t[5] !== n.manifest.name) {
        h = g => g.pluginName === n.manifest.name;
        t[5] = n.manifest.name;
        t[6] = h;
      } else {
        h = t[6];
      }
      i = f.byPlugin.find(h);
      t[0] = o;
      t[1] = s;
      t[2] = n.manifest.name;
      t[3] = r;
      t[4] = i;
    } else {
      i = t[4];
    }
    let a = i;
    let l;
    if (t[7] !== n.manifest.name) {
      l = qb.jsxs(Text, {
        bold: true,
        children: [n.manifest.name, " \xB7 Usage"]
      });
      t[7] = n.manifest.name;
      t[8] = l;
    } else {
      l = t[8];
    }
    let c;
    let u;
    if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
      c = qb.jsx(Text, {
        bold: true,
        children: "Skill-listing footprint"
      });
      u = qb.jsx(Text, {
        dimColor: true,
        wrap: "wrap",
        children: "What this plugin's skill descriptions add to the system prompt (cached input after the first turn). Agents and MCP tools not yet counted."
      });
      t[9] = c;
      t[10] = u;
    } else {
      c = t[9];
      u = t[10];
    }
    let d;
    if (t[11] !== a) {
      d = qb.jsxs(gXd, {
        flexDirection: "column",
        children: [c, u, a && a.skills.length > 0 ? qb.jsxs(gXd, {
          flexDirection: "column",
          marginTop: 1,
          children: [a.skills.map(X6m), qb.jsxs(gXd, {
            flexDirection: "row",
            marginTop: 1,
            children: [qb.jsx(gXd, {
              width: 32,
              children: qb.jsx(Text, {
                children: "Total"
              })
            }), qb.jsxs(Text, {
              children: [a.skillCount, " ", un(a.skillCount, "skill"), " \xB7 ~", a.approxTokens, " tok/turn"]
            })]
          })]
        }) : qb.jsx(Text, {
          dimColor: true,
          children: "No model-invocable skills loaded for this plugin"
        })]
      });
      t[11] = a;
      t[12] = d;
    } else {
      d = t[12];
    }
    let p;
    if (t[13] !== n || t[14] !== r) {
      p = qb.jsx(t8m, {
        plugin: n,
        commands: r
      });
      t[13] = n;
      t[14] = r;
      t[15] = p;
    } else {
      p = t[15];
    }
    let m;
    if (t[16] !== l || t[17] !== d || t[18] !== p) {
      m = qb.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [l, d, p]
      });
      t[16] = l;
      t[17] = d;
      t[18] = p;
      t[19] = m;
    } else {
      m = t[19];
    }
    return m;
  }
  function X6m(e) {
    return qb.jsxs(gXd, {
      flexDirection: "row",
      children: [qb.jsx(gXd, {
        width: 32,
        children: qb.jsxs(Text, {
          dimColor: true,
          children: ["/", e.name]
        })
      }), qb.jsxs(Text, {
        dimColor: true,
        children: ["~", e.approxTokens, " tok/turn"]
      })]
    }, e.name);
  }
  function Q6m(e) {
    return e.mainLoopModel;
  }
  function Z6m(e) {
    return e.mcp.commands;
  }
  function e8m(e) {
    return e.plugins.commands;
  }
  function t8m(e) {
    let t = h4o.c(9);
    let {
      plugin: n,
      commands: r
    } = e;
    let o;
    if (t[0] !== r || t[1] !== n.manifest.name) {
      o = g4o(n.manifest.name, r);
      t[0] = r;
      t[1] = n.manifest.name;
      t[2] = o;
    } else {
      o = t[2];
    }
    let s = o;
    let i;
    let a;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      i = qb.jsx(Text, {
        bold: true,
        children: "Activity"
      });
      a = qb.jsx(Text, {
        dimColor: true,
        wrap: "wrap",
        children: "Skill invocations on this machine. See /usage for cost attribution."
      });
      t[3] = i;
      t[4] = a;
    } else {
      i = t[3];
      a = t[4];
    }
    let l;
    if (t[5] !== s.skillCount || t[6] !== s.skills || t[7] !== s.totalCount) {
      l = qb.jsxs(gXd, {
        flexDirection: "column",
        children: [i, a, s.totalCount === 0 ? qb.jsx(Text, {
          dimColor: true,
          children: "No activity yet"
        }) : qb.jsxs(gXd, {
          flexDirection: "column",
          marginTop: 1,
          children: [s.skills.filter(r8m).map(n8m), qb.jsxs(gXd, {
            flexDirection: "row",
            marginTop: 1,
            children: [qb.jsx(gXd, {
              width: 32,
              children: qb.jsx(Text, {
                children: "Total"
              })
            }), qb.jsxs(Text, {
              children: [s.totalCount, " ", un(s.totalCount, "use"), " across", " ", s.skillCount, " ", un(s.skillCount, "skill")]
            })]
          })]
        })]
      });
      t[5] = s.skillCount;
      t[6] = s.skills;
      t[7] = s.totalCount;
      t[8] = l;
    } else {
      l = t[8];
    }
    return l;
  }
  function n8m(e) {
    return qb.jsxs(gXd, {
      flexDirection: "row",
      children: [qb.jsx(gXd, {
        width: 32,
        children: qb.jsxs(Text, {
          dimColor: true,
          children: ["/", e.name]
        })
      }), qb.jsxs(Text, {
        dimColor: true,
        children: [e.count, " ", un(e.count, "use"), e.lastUsedAt !== null ? ` \xB7 last ${J6m(e.lastUsedAt)}` : ""]
      })]
    }, e.name);
  }
  function r8m(e) {
    return e.count > 0;
  }
  var h4o;
  var qb;
  var z8l = __lazy(() => {
    et();
    ho();
    Eo();
    Zn();
    zjo();
    h4o = __toESM(pt(), 1);
    qb = __toESM(ie(), 1);
  });
  function Y8l(e) {
    let t = K8l.c(184);
    let {
      item: n,
      isSelected: r,
      health: o
    } = e;
    let [s] = useTheme();
    if (n.type === "plugin") {
      let b;
      let S;
      if (n.pendingToggle) {
        let z;
        if (t[0] !== s) {
          z = color("suggestion", s)(vGd.arrowRight);
          t[0] = s;
          t[1] = z;
        } else {
          z = t[1];
        }
        b = z;
        S = n.pendingToggle === "will-enable" ? "will enable" : "will disable";
      } else if (n.errorCount > 0) {
        let z;
        if (t[2] !== s) {
          z = color("error", s)(vGd.cross);
          t[2] = s;
          t[3] = z;
        } else {
          z = t[3];
        }
        b = z;
        let V = n.errorCount;
        let K;
        if (t[4] !== n.errorCount) {
          K = un(n.errorCount, "error");
          t[4] = n.errorCount;
          t[5] = K;
        } else {
          K = t[5];
        }
        S = `${V} ${K}`;
      } else if (!n.isEnabled) {
        let z;
        if (t[6] !== s) {
          z = color("inactive", s)(vGd.radioOff);
          t[6] = s;
          t[7] = z;
        } else {
          z = t[7];
        }
        b = z;
        S = "disabled";
      } else {
        let z;
        if (t[8] !== s) {
          z = color("success", s)(vGd.tick);
          t[8] = s;
          t[9] = z;
        } else {
          z = t[9];
        }
        b = z;
        S = "enabled";
      }
      let E = r ? "suggestion" : undefined;
      let C;
      if (t[10] !== n) {
        C = ES(n);
        t[10] = n;
        t[11] = C;
      } else {
        C = t[11];
      }
      let x;
      if (t[12] !== E || t[13] !== C) {
        x = $u.jsx(Text, {
          color: E,
          children: C
        });
        t[12] = E;
        t[13] = C;
        t[14] = x;
      } else {
        x = t[14];
      }
      let A;
      if (t[15] !== o || t[16] !== s) {
        A = o && $u.jsxs(Text, {
          children: [" ", color(o8m[o], s)(vGd.bullet)]
        });
        t[15] = o;
        t[16] = s;
        t[17] = A;
      } else {
        A = t[17];
      }
      let k = !r;
      let I;
      if (t[18] === Symbol.for("react.memo_cache_sentinel")) {
        I = $u.jsx(Mx, {
          color: "userMessageBackground",
          textColor: "text",
          children: "Plugin"
        });
        t[18] = I;
      } else {
        I = t[18];
      }
      let O;
      if (t[19] !== k) {
        O = $u.jsxs(Text, {
          dimColor: k,
          children: [" ", I]
        });
        t[19] = k;
        t[20] = O;
      } else {
        O = t[20];
      }
      let M;
      if (t[21] !== n.marketplace) {
        M = $u.jsxs(Text, {
          dimColor: true,
          children: [" \xB7 ", n.marketplace]
        });
        t[21] = n.marketplace;
        t[22] = M;
      } else {
        M = t[22];
      }
      let L = !r;
      let P;
      if (t[23] !== b || t[24] !== L) {
        P = $u.jsxs(Text, {
          dimColor: L,
          children: [" \xB7 ", b, " "]
        });
        t[23] = b;
        t[24] = L;
        t[25] = P;
      } else {
        P = t[25];
      }
      let F = !r;
      let H;
      if (t[26] !== S || t[27] !== F) {
        H = $u.jsx(Text, {
          dimColor: F,
          children: S
        });
        t[26] = S;
        t[27] = F;
        t[28] = H;
      } else {
        H = t[28];
      }
      let U;
      if (t[29] !== n.activity) {
        U = n.activity && n.activity.skillCount > 0 ? $u.jsxs(Text, {
          dimColor: true,
          children: [" ", "\xB7 ", n.activity.skillCount, " ", un(n.activity.skillCount, "skill"), " \xB7", " ", n.activity.totalCount, " ", un(n.activity.totalCount, "use")]
        }) : null;
        t[29] = n.activity;
        t[30] = U;
      } else {
        U = t[30];
      }
      let N;
      if (t[31] !== n.unusedDays) {
        N = n.unusedDays !== undefined && $u.jsxs(Text, {
          dimColor: true,
          children: [" ", "\xB7 not used in ", n.unusedDays, " ", un(n.unusedDays, "day")]
        });
        t[31] = n.unusedDays;
        t[32] = N;
      } else {
        N = t[32];
      }
      let W;
      if (t[33] !== P || t[34] !== H || t[35] !== U || t[36] !== N || t[37] !== x || t[38] !== A || t[39] !== O || t[40] !== M) {
        W = $u.jsxs(Text, {
          children: [x, A, O, M, P, H, U, N]
        });
        t[33] = P;
        t[34] = H;
        t[35] = U;
        t[36] = N;
        t[37] = x;
        t[38] = A;
        t[39] = O;
        t[40] = M;
        t[41] = W;
      } else {
        W = t[41];
      }
      let j;
      if (t[42] !== r || t[43] !== W) {
        j = $u.jsx(_v, {
          isFocused: r,
          styled: false,
          children: W
        });
        t[42] = r;
        t[43] = W;
        t[44] = j;
      } else {
        j = t[44];
      }
      return j;
    }
    if (n.type === "flagged-plugin") {
      let b;
      if (t[45] !== s) {
        b = color("warning", s)(vGd.warning);
        t[45] = s;
        t[46] = b;
      } else {
        b = t[46];
      }
      let S = b;
      let E = r ? "suggestion" : undefined;
      let C;
      if (t[47] !== n.name || t[48] !== E) {
        C = $u.jsx(Text, {
          color: E,
          children: n.name
        });
        t[47] = n.name;
        t[48] = E;
        t[49] = C;
      } else {
        C = t[49];
      }
      let x = !r;
      let A;
      if (t[50] === Symbol.for("react.memo_cache_sentinel")) {
        A = $u.jsx(Mx, {
          color: "userMessageBackground",
          textColor: "text",
          children: "Plugin"
        });
        t[50] = A;
      } else {
        A = t[50];
      }
      let k;
      if (t[51] !== x) {
        k = $u.jsxs(Text, {
          dimColor: x,
          children: [" ", A]
        });
        t[51] = x;
        t[52] = k;
      } else {
        k = t[52];
      }
      let I;
      if (t[53] !== n.marketplace) {
        I = $u.jsxs(Text, {
          dimColor: true,
          children: [" \xB7 ", n.marketplace]
        });
        t[53] = n.marketplace;
        t[54] = I;
      } else {
        I = t[54];
      }
      let O = !r;
      let M;
      if (t[55] !== S || t[56] !== O) {
        M = $u.jsxs(Text, {
          dimColor: O,
          children: [" \xB7 ", S, " "]
        });
        t[55] = S;
        t[56] = O;
        t[57] = M;
      } else {
        M = t[57];
      }
      let L = !r;
      let P;
      if (t[58] !== L) {
        P = $u.jsx(Text, {
          dimColor: L,
          children: "removed"
        });
        t[58] = L;
        t[59] = P;
      } else {
        P = t[59];
      }
      let F;
      if (t[60] !== P || t[61] !== C || t[62] !== k || t[63] !== I || t[64] !== M) {
        F = $u.jsxs(Text, {
          children: [C, k, I, M, P]
        });
        t[60] = P;
        t[61] = C;
        t[62] = k;
        t[63] = I;
        t[64] = M;
        t[65] = F;
      } else {
        F = t[65];
      }
      let H;
      if (t[66] !== r || t[67] !== F) {
        H = $u.jsx(_v, {
          isFocused: r,
          styled: false,
          children: F
        });
        t[66] = r;
        t[67] = F;
        t[68] = H;
      } else {
        H = t[68];
      }
      return H;
    }
    if (n.type === "failed-plugin") {
      let b;
      if (t[69] !== s) {
        b = color("error", s)(vGd.cross);
        t[69] = s;
        t[70] = b;
      } else {
        b = t[70];
      }
      let S = b;
      let E = n.errorCount;
      let C;
      if (t[71] !== n.errorCount) {
        C = un(n.errorCount, "error");
        t[71] = n.errorCount;
        t[72] = C;
      } else {
        C = t[72];
      }
      let x = `failed to load \xB7 ${E} ${C}`;
      let A = r ? "suggestion" : undefined;
      let k;
      if (t[73] !== n.name || t[74] !== A) {
        k = $u.jsx(Text, {
          color: A,
          children: n.name
        });
        t[73] = n.name;
        t[74] = A;
        t[75] = k;
      } else {
        k = t[75];
      }
      let I = !r;
      let O;
      if (t[76] === Symbol.for("react.memo_cache_sentinel")) {
        O = $u.jsx(Mx, {
          color: "userMessageBackground",
          textColor: "text",
          children: "Plugin"
        });
        t[76] = O;
      } else {
        O = t[76];
      }
      let M;
      if (t[77] !== I) {
        M = $u.jsxs(Text, {
          dimColor: I,
          children: [" ", O]
        });
        t[77] = I;
        t[78] = M;
      } else {
        M = t[78];
      }
      let L;
      if (t[79] !== n.marketplace) {
        L = $u.jsxs(Text, {
          dimColor: true,
          children: [" \xB7 ", n.marketplace]
        });
        t[79] = n.marketplace;
        t[80] = L;
      } else {
        L = t[80];
      }
      let P = !r;
      let F;
      if (t[81] !== S || t[82] !== P) {
        F = $u.jsxs(Text, {
          dimColor: P,
          children: [" \xB7 ", S, " "]
        });
        t[81] = S;
        t[82] = P;
        t[83] = F;
      } else {
        F = t[83];
      }
      let H = !r;
      let U;
      if (t[84] !== x || t[85] !== H) {
        U = $u.jsx(Text, {
          dimColor: H,
          children: x
        });
        t[84] = x;
        t[85] = H;
        t[86] = U;
      } else {
        U = t[86];
      }
      let N;
      if (t[87] !== F || t[88] !== U || t[89] !== k || t[90] !== M || t[91] !== L) {
        N = $u.jsxs(Text, {
          children: [k, M, L, F, U]
        });
        t[87] = F;
        t[88] = U;
        t[89] = k;
        t[90] = M;
        t[91] = L;
        t[92] = N;
      } else {
        N = t[92];
      }
      let W;
      if (t[93] !== r || t[94] !== N) {
        W = $u.jsx(_v, {
          isFocused: r,
          styled: false,
          children: N
        });
        t[93] = r;
        t[94] = N;
        t[95] = W;
      } else {
        W = t[95];
      }
      return W;
    }
    if (n.type === "skill") {
      let b = s8m[n.override];
      let S;
      if (t[96] !== b.color || t[97] !== b.glyph || t[98] !== s) {
        S = b.color ? color(b.color, s)(b.glyph) : b.glyph;
        t[96] = b.color;
        t[97] = b.glyph;
        t[98] = s;
        t[99] = S;
      } else {
        S = t[99];
      }
      let E = S;
      let C = r ? "suggestion" : undefined;
      let x;
      if (t[100] !== n.name || t[101] !== C) {
        x = $u.jsx(Text, {
          color: C,
          children: n.name
        });
        t[100] = n.name;
        t[101] = C;
        t[102] = x;
      } else {
        x = t[102];
      }
      let A = !r;
      let k;
      if (t[103] === Symbol.for("react.memo_cache_sentinel")) {
        k = $u.jsx(Mx, {
          color: "userMessageBackground",
          textColor: "text",
          children: "Skill"
        });
        t[103] = k;
      } else {
        k = t[103];
      }
      let I;
      if (t[104] !== A) {
        I = $u.jsxs(Text, {
          dimColor: A,
          children: [" ", k]
        });
        t[104] = A;
        t[105] = I;
      } else {
        I = t[105];
      }
      let O;
      if (t[106] !== n.source) {
        O = $u.jsxs(Text, {
          dimColor: true,
          children: [" \xB7 ", n.source]
        });
        t[106] = n.source;
        t[107] = O;
      } else {
        O = t[107];
      }
      let M = !r;
      let L = n.lockSource ? "\uD83D\uDD12 " : "";
      let P;
      if (t[108] !== E || t[109] !== M || t[110] !== L) {
        P = $u.jsxs(Text, {
          dimColor: M,
          children: [" ", "\xB7 ", L, E, " "]
        });
        t[108] = E;
        t[109] = M;
        t[110] = L;
        t[111] = P;
      } else {
        P = t[111];
      }
      let F = !r;
      let H;
      if (t[112] !== b.label || t[113] !== F) {
        H = $u.jsx(Text, {
          dimColor: F,
          children: b.label
        });
        t[112] = b.label;
        t[113] = F;
        t[114] = H;
      } else {
        H = t[114];
      }
      let U;
      if (t[115] !== n.tokenEstimate) {
        U = $u.jsxs(Text, {
          dimColor: true,
          children: [" \xB7 ~", n.tokenEstimate, " tok"]
        });
        t[115] = n.tokenEstimate;
        t[116] = U;
      } else {
        U = t[116];
      }
      let N;
      if (t[117] !== n.usage) {
        N = n.usage ? $u.jsxs(Text, {
          dimColor: true,
          children: [" ", "\xB7 ", n.usage.count, "\xD7", " ", n.usage.daysSinceUse === 0 ? "today" : `${n.usage.daysSinceUse}d`]
        }) : $u.jsx(Text, {
          color: "warning",
          children: " \xB7 never used"
        });
        t[117] = n.usage;
        t[118] = N;
      } else {
        N = t[118];
      }
      let W;
      if (t[119] !== P || t[120] !== H || t[121] !== U || t[122] !== N || t[123] !== x || t[124] !== I || t[125] !== O) {
        W = $u.jsxs(Text, {
          children: [x, I, O, P, H, U, N]
        });
        t[119] = P;
        t[120] = H;
        t[121] = U;
        t[122] = N;
        t[123] = x;
        t[124] = I;
        t[125] = O;
        t[126] = W;
      } else {
        W = t[126];
      }
      let j;
      if (t[127] !== r || t[128] !== W) {
        j = $u.jsx(_v, {
          isFocused: r,
          styled: false,
          children: W
        });
        t[127] = r;
        t[128] = W;
        t[129] = j;
      } else {
        j = t[129];
      }
      return j;
    }
    let i;
    let a;
    if (n.status === "connected") {
      let b;
      if (t[130] !== s) {
        b = color("success", s)(vGd.tick);
        t[130] = s;
        t[131] = b;
      } else {
        b = t[131];
      }
      i = b;
      a = "connected";
    } else if (n.status === "disabled") {
      let b;
      if (t[132] !== s) {
        b = color("inactive", s)(vGd.radioOff);
        t[132] = s;
        t[133] = b;
      } else {
        b = t[133];
      }
      i = b;
      a = "disabled";
    } else if (n.status === "pending") {
      let b;
      if (t[134] !== s) {
        b = color("inactive", s)(vGd.radioOff);
        t[134] = s;
        t[135] = b;
      } else {
        b = t[135];
      }
      i = b;
      a = "connecting\u2026";
    } else if (n.status === "needs-auth") {
      let b;
      if (t[136] !== s) {
        b = color("warning", s)(vGd.triangleUpOutline);
        t[136] = s;
        t[137] = b;
      } else {
        b = t[137];
      }
      i = b;
      let S;
      if (t[138] === Symbol.for("react.memo_cache_sentinel")) {
        S = $u.jsx(Wr, {
          action: "select:accept",
          context: "Select",
          fallback: "Enter",
          description: "auth"
        });
        t[138] = S;
      } else {
        S = t[138];
      }
      a = S;
    } else {
      let b;
      if (t[139] !== s) {
        b = color("error", s)(vGd.cross);
        t[139] = s;
        t[140] = b;
      } else {
        b = t[140];
      }
      i = b;
      a = "failed";
    }
    if (n.indented) {
      let b = !r;
      let S;
      if (t[141] !== b) {
        S = $u.jsx(Text, {
          dimColor: b,
          children: "\u2514 "
        });
        t[141] = b;
        t[142] = S;
      } else {
        S = t[142];
      }
      let E = r ? "suggestion" : undefined;
      let C;
      if (t[143] !== n.name || t[144] !== E) {
        C = $u.jsx(Text, {
          color: E,
          children: n.name
        });
        t[143] = n.name;
        t[144] = E;
        t[145] = C;
      } else {
        C = t[145];
      }
      let x = !r;
      let A;
      if (t[146] === Symbol.for("react.memo_cache_sentinel")) {
        A = $u.jsx(Mx, {
          color: "userMessageBackground",
          textColor: "text",
          children: "MCP"
        });
        t[146] = A;
      } else {
        A = t[146];
      }
      let k;
      if (t[147] !== x) {
        k = $u.jsxs(Text, {
          dimColor: x,
          children: [" ", A]
        });
        t[147] = x;
        t[148] = k;
      } else {
        k = t[148];
      }
      let I = !r;
      let O;
      if (t[149] !== i || t[150] !== I) {
        O = $u.jsxs(Text, {
          dimColor: I,
          children: [" \xB7 ", i, " "]
        });
        t[149] = i;
        t[150] = I;
        t[151] = O;
      } else {
        O = t[151];
      }
      let M = !r;
      let L;
      if (t[152] !== a || t[153] !== M) {
        L = $u.jsx(Text, {
          dimColor: M,
          children: a
        });
        t[152] = a;
        t[153] = M;
        t[154] = L;
      } else {
        L = t[154];
      }
      let P;
      if (t[155] !== L || t[156] !== S || t[157] !== C || t[158] !== k || t[159] !== O) {
        P = $u.jsxs(Text, {
          children: [S, C, k, O, L]
        });
        t[155] = L;
        t[156] = S;
        t[157] = C;
        t[158] = k;
        t[159] = O;
        t[160] = P;
      } else {
        P = t[160];
      }
      let F;
      if (t[161] !== r || t[162] !== P) {
        F = $u.jsx(_v, {
          isFocused: r,
          styled: false,
          children: P
        });
        t[161] = r;
        t[162] = P;
        t[163] = F;
      } else {
        F = t[163];
      }
      return F;
    }
    let l = r ? "suggestion" : undefined;
    let c;
    if (t[164] !== n.name || t[165] !== l) {
      c = $u.jsx(Text, {
        color: l,
        children: n.name
      });
      t[164] = n.name;
      t[165] = l;
      t[166] = c;
    } else {
      c = t[166];
    }
    let u = !r;
    let d;
    if (t[167] === Symbol.for("react.memo_cache_sentinel")) {
      d = $u.jsx(Mx, {
        color: "userMessageBackground",
        textColor: "text",
        children: "MCP"
      });
      t[167] = d;
    } else {
      d = t[167];
    }
    let p;
    if (t[168] !== u) {
      p = $u.jsxs(Text, {
        dimColor: u,
        children: [" ", d]
      });
      t[168] = u;
      t[169] = p;
    } else {
      p = t[169];
    }
    let m = !r;
    let f;
    if (t[170] !== i || t[171] !== m) {
      f = $u.jsxs(Text, {
        dimColor: m,
        children: [" \xB7 ", i, " "]
      });
      t[170] = i;
      t[171] = m;
      t[172] = f;
    } else {
      f = t[172];
    }
    let h = !r;
    let g;
    if (t[173] !== a || t[174] !== h) {
      g = $u.jsx(Text, {
        dimColor: h,
        children: a
      });
      t[173] = a;
      t[174] = h;
      t[175] = g;
    } else {
      g = t[175];
    }
    let y;
    if (t[176] !== c || t[177] !== p || t[178] !== f || t[179] !== g) {
      y = $u.jsxs(Text, {
        children: [c, p, f, g]
      });
      t[176] = c;
      t[177] = p;
      t[178] = f;
      t[179] = g;
      t[180] = y;
    } else {
      y = t[180];
    }
    let _;
    if (t[181] !== r || t[182] !== y) {
      _ = $u.jsx(_v, {
        isFocused: r,
        styled: false,
        children: y
      });
      t[181] = r;
      t[182] = y;
      t[183] = _;
    } else {
      _ = t[183];
    }
    return _;
  }
  var K8l;
  var $u;
  var o8m;
  var s8m;
  var J8l = __lazy(() => {
    Sd();
    qve();
    Mue();
    et();
    Zn();
    K8l = __toESM(pt(), 1);
    $u = __toESM(ie(), 1);
    o8m = {
      good: "success",
      warn: "warning",
      poor: "error"
    };
    s8m = {
      on: {
        glyph: vGd.tick,
        label: "on",
        color: "success"
      },
      "name-only": {
        glyph: vGd.bullet,
        label: "name-only"
      },
      "user-invocable-only": {
        glyph: vGd.circle,
        label: "user-only",
        color: "warning"
      },
      off: {
        glyph: vGd.cross,
        label: "off",
        color: "error"
      }
    };
  });
  function Swt(e) {
    return e?.kind === "item" || e?.kind === "disabled-header";
  }
  function i8m(e) {
    switch (e.type) {
      case "plugin":
        return e.isEnabled && e.errorCount > 0;
      case "failed-plugin":
      case "flagged-plugin":
        return true;
      case "mcp":
        return (e.status === "needs-auth" || e.status === "failed") && !_4o(e);
      case "skill":
        return false;
    }
  }
  function Q8l(e, t) {
    if (t === "policy" || t === "flag") {
      return e;
    }
    if (t === "author") {
      return e === "off" ? "user-invocable-only" : "off";
    }
    let n = y4o.indexOf(e);
    return y4o[(n + 1) % y4o.length];
  }
  function X8l(e) {
    return e.type === "plugin" && !e.isEnabled || e.type === "mcp" && e.status === "disabled" || e.type === "skill" && e.override === "off";
  }
  function _4o(e) {
    return e.type === "mcp" && (e.status === "needs-auth" || e.status === "failed") && e.everConnected === false;
  }
  function Z8l(e, {
    searchQuery: t,
    favoriteIds: n,
    showDisabled: r,
    disusedDays: o,
    keepInPlaceIds: s
  }) {
    if (t) {
      let p = t.toLowerCase();
      return e.filter(m => m.name.toLowerCase().includes(p) || "displayName" in m && m.displayName?.toLowerCase().includes(p) || "description" in m && m.description?.toLowerCase().includes(p)).map(m => ({
        kind: "item",
        section: "main",
        item: m
      }));
    }
    let i = [];
    let a = null;
    let l = (p, m) => {
      let f = a?.section !== p;
      if (f) {
        if (i.length > 0 && i.at(-1)?.kind !== "disabled-header") {
          i.push({
            kind: "spacer"
          });
        }
        if (p === "attention" || p === "favorites" || p === "disused") {
          i.push({
            kind: "section-header",
            section: p
          });
        }
      }
      if ((p === "main" || p === "disabled") && (f || a?.item.scope !== m.scope)) {
        if (!f) {
          i.push({
            kind: "spacer"
          });
        }
        i.push({
          kind: "scope-header",
          scope: m.scope
        });
      }
      let h = !f && m.type === "mcp" && m.parentId !== undefined && (a?.item.type === "plugin" && a.item.id === m.parentId || a?.item.type === "mcp" && a.item.indented && a.item.parentId === m.parentId);
      let g = m.type === "mcp" && m.indented && !h ? {
        ...m,
        indented: false
      } : m;
      i.push({
        kind: "item",
        section: p,
        item: g
      });
      a = {
        section: p,
        item: g
      };
    };
    let c = new Set();
    for (let p of e) {
      if (i8m(p)) {
        l("attention", p);
        c.add(p.id);
      }
    }
    for (let p of e) {
      if (n.vZc(p.id) && !c.vZc(p.id)) {
        l("favorites", p);
        c.add(p.id);
      }
    }
    if (o && o.size > 0) {
      for (let p of e) {
        if (p.type === "plugin" && p.isEnabled && o.vZc(p.id) && !c.vZc(p.id)) {
          l("disused", {
            ...p,
            unusedDays: o.get(p.id)
          });
          c.add(p.id);
        }
      }
    }
    let u = p => (X8l(p) || _4o(p)) && !s?.vZc(p.id);
    for (let p of e) {
      if (!u(p) && !c.vZc(p.id)) {
        l("main", p);
      }
    }
    let d = e.filter(u);
    if (d.length > 0) {
      if (i.length > 0) {
        i.push({
          kind: "spacer"
        });
      }
      if (i.push({
        kind: "disabled-header",
        disabledCount: Bn(d, X8l),
        unusedConnectorCount: Bn(d, _4o)
      }), r) {
        for (let p of d) {
          l("disabled", p);
        }
      }
    }
    return i;
  }
  var y4o;
  var eVl = __lazy(() => {
    y4o = ["on", "name-only", "user-invocable-only", "off"];
  });
  function tVl(e, t) {
    let n = getSettingsForSource("localSettings")?.skillOverrides;
    let r = getSettingsForSource("projectSettings")?.skillOverrides;
    let o = getSettingsForSource("userSettings")?.skillOverrides;
    let s = l => r?.[l] ?? o?.[l];
    let i = s(e.cmdName) ?? (e.unqualifiedName != null ? n?.[e.unqualifiedName] ?? s(e.unqualifiedName) : undefined);
    let a = e.lockSource === "author" ? i === "off" ? "off" : "user-invocable-only" : i ?? "on";
    return t === a ? undefined : t;
  }
  function c8m(e) {
    switch (e) {
      case "flagged":
        return "Flagged";
      case "project":
        return "Project";
      case "local":
        return "Local";
      case "user":
        return "User";
      case "enterprise":
        return "Enterprise";
      case "managed":
        return "Managed";
      case "builtin":
      case "dynamic":
        return "Built-in";
      case "skills":
        return "Skills";
      default:
        return e;
    }
  }
  function u8m(e) {
    let t = S4o.c(11);
    let {
      plugin: n,
      marketplace: r
    } = e;
    let [o, s] = bu.useState(null);
    let [i, a] = bu.useState(null);
    let l;
    let c;
    if (t[0] !== r || t[1] !== n) {
      l = () => {
        let p = false;
        getPluginInventory(n, r).then(m => {
          if (!p) {
            s(m);
          }
        }).catch(m => {
          if (!p) {
            a(m instanceof Error ? m.message : "Failed to load components");
          }
        });
        return () => {
          p = true;
        };
      };
      c = [n, r];
      t[0] = r;
      t[1] = n;
      t[2] = l;
      t[3] = c;
    } else {
      l = t[2];
      c = t[3];
    }
    if (bu.useEffect(l, c), i) {
      let p;
      if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
        p = vr.jsx(Text, {
          bold: true,
          children: "Components:"
        });
        t[4] = p;
      } else {
        p = t[4];
      }
      let m;
      if (t[5] !== i) {
        m = vr.jsxs(gXd, {
          flexDirection: "column",
          marginBottom: 1,
          children: [p, vr.jsxs(Text, {
            dimColor: true,
            children: ["Error: ", i]
          })]
        });
        t[5] = i;
        t[6] = m;
      } else {
        m = t[6];
      }
      return m;
    }
    if (!o) {
      return null;
    }
    let u;
    let d;
    if (t[7] !== o) {
      d = Symbol.for("react.early_return_sentinel");
      e: {
        let p = Lar(o);
        if (p.length === 0) {
          d = null;
          break e;
        }
        let m;
        if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
          m = vr.jsx(Text, {
            bold: true,
            children: "Installed components:"
          });
          t[10] = m;
        } else {
          m = t[10];
        }
        u = vr.jsxs(gXd, {
          flexDirection: "column",
          marginBottom: 1,
          children: [m, p.map(d8m)]
        });
      }
      t[7] = o;
      t[8] = u;
      t[9] = d;
    } else {
      u = t[8];
      d = t[9];
    }
    if (d !== Symbol.for("react.early_return_sentinel")) {
      return d;
    }
    return u;
  }
  function d8m(e) {
    let [t, n] = e;
    return vr.jsx(Pw, {
      children: vr.jsxs(Text, {
        dimColor: true,
        children: [t, ": ", n.join(", ")]
      })
    }, t);
  }
  async function p8m(e, t) {
    let r = (await uL(t))?.plugins.find(o => o.name === e);
    if (r && typeof r.source === "string") {
      return `Local plugins cannot be updated remotely. To update, modify the source at: ${r.source}`;
    }
    return null;
  }
  function m8m(e) {
    return e.filter(t => !isPluginBlockedByPolicy(t.source));
  }
  function nVl(e) {
    let t = S4o.c(15);
    let {
      entries: n,
      color: r,
      noun: o
    } = e;
    if (n.length === 0) {
      return null;
    }
    let s = n.length;
    let i;
    if (t[0] !== n.length || t[1] !== o) {
      i = un(n.length, o);
      t[0] = n.length;
      t[1] = o;
      t[2] = i;
    } else {
      i = t[2];
    }
    let a;
    if (t[3] !== r || t[4] !== n.length || t[5] !== i) {
      a = vr.jsxs(Text, {
        bold: true,
        color: r,
        children: [s, " ", i, ":"]
      });
      t[3] = r;
      t[4] = n.length;
      t[5] = i;
      t[6] = a;
    } else {
      a = t[6];
    }
    let l;
    if (t[7] !== r || t[8] !== n) {
      let u;
      if (t[10] !== r) {
        u = (d, p) => vr.jsxs(gXd, {
          flexDirection: "column",
          marginLeft: 2,
          children: [vr.jsx(Text, {
            color: r,
            children: d.message
          }), d.guidance && vr.jsxs(Text, {
            dimColor: true,
            italic: true,
            children: [vGd.arrowRight, " ", d.guidance]
          })]
        }, p);
        t[10] = r;
        t[11] = u;
      } else {
        u = t[11];
      }
      l = n.map(u);
      t[7] = r;
      t[8] = n;
      t[9] = l;
    } else {
      l = t[9];
    }
    let c;
    if (t[12] !== a || t[13] !== l) {
      c = vr.jsxs(gXd, {
        flexDirection: "column",
        children: [a, l]
      });
      t[12] = a;
      t[13] = l;
      t[14] = c;
    } else {
      c = t[14];
    }
    return c;
  }
  function oVl({
    setViewState: e,
    setResult: t,
    onManageComplete: n,
    onSearchModeChange: r,
    targetPlugin: o,
    targetMarketplace: s,
    action: i,
    commands: a
  }) {
    let l = bt(Ct => Ct.mcp.clients);
    let c = bt(Ct => Ct.mcp.tools);
    let u = bt(Ct => Ct.plugins.errors);
    let d = bt(Ct => Ct.plugins.warnings);
    let p = bwt();
    let m = I8l();
    let [f, h] = bu.useState(false);
    let g = () => h(false);
    let y = useTerminalFocus();
    let _ = nE();
    let b = Sr();
    let {
      columns: S
    } = b;
    let {
      rows: E
    } = h_(b);
    let [C, x] = bu.useState("plugin-list");
    let {
      query: A,
      setQuery: k,
      cursorOffset: I,
      setCursorOffset: O,
      handleKeyDown: M,
      handlePaste: L
    } = U0({
      isActive: C === "plugin-list" && f,
      onExit: g,
      onExitUp: g
    });
    let P = f && A !== "";
    bu.useEffect(() => {
      r(P);
    }, [P, r]);
    bu.useEffect(() => () => r(false), [r]);
    let [F, H] = bu.useState(null);
    let U = bu.useMemo(() => F ? pwt(F.plugin.source) : null, [F]);
    let [N, W] = bu.useState([]);
    let [j, z] = bu.useState([]);
    let [V, K] = bu.useState(true);
    let [J, Q] = bu.useState(0);
    let [Z, ne] = bu.useState(() => new Set());
    let [oe, ee] = bu.useState(new Map());
    let [re, se] = bu.useState(false);
    let [ae, de] = bu.useState(null);
    let [be, fe] = bu.useState(null);
    let [me, Te] = bu.useState(0);
    let ue = bu.useCallback(Ct => {
      fe(Ct);
      se(false);
      H(null);
      x("plugin-list");
      Te(hn => hn + 1);
      n();
    }, [n]);
    let ce = bu.useRef(false);
    let le = bu.useRef(undefined);
    let pe = TUe();
    let ve = bu.useCallback(() => {
      if (C === "plugin-details") {
        x("plugin-list");
        H(null);
        de(null);
      } else if (typeof C === "object" && C.type === "failed-plugin-details") {
        x("plugin-list");
        de(null);
      } else if (C === "configuring") {
        x("plugin-details");
        Sn(null);
      } else if (C === "plugin-usage") {
        x("plugin-details");
      } else if (typeof C === "object" && C.type === "plugin-options") {
        ue("Plugin enabled. Configuration skipped \u2014 run /reload-plugins to apply.");
      } else if (typeof C === "object" && C.type === "configuring-options") {
        t("Configuration cancelled.");
      } else if (typeof C === "object" && C.type === "flagged-detail") {
        x("plugin-list");
        de(null);
      } else if (typeof C === "object" && C.type === "mcp-detail") {
        x("plugin-list");
        de(null);
      } else if (typeof C === "object" && C.type === "skill-detail") {
        x("plugin-list");
        de(null);
      } else if (typeof C === "object" && C.type === "mcp-tools") {
        x({
          type: "mcp-detail",
          client: C.client
        });
      } else if (typeof C === "object" && C.type === "mcp-tool-detail") {
        x({
          type: "mcp-tools",
          client: C.client
        });
      } else {
        if (oe.size > 0) {
          t("Run /reload-plugins to apply plugin changes.");
          return;
        }
        e({
          type: "menu"
        });
      }
    }, [C, e, oe, t, ue]);
    uo("confirm:no", ve, {
      context: "Settings",
      isActive: (C !== "plugin-list" || !f) && C !== "confirm-project-uninstall" && !(typeof C === "object" && C.type === "confirm-data-cleanup")
    });
    let _e = Ct => {
      if (Ct.type === "connected") {
        return "connected";
      }
      if (Ct.type === "disabled") {
        return "disabled";
      }
      if (Ct.type === "pending") {
        return "pending";
      }
      if (Ct.type === "needs-auth") {
        return "needs-auth";
      }
      return "failed";
    };
    let xe = bu.useMemo(() => {
      let Ct = getInitialSettings();
      let hn = new Map();
      for (let _r of l) {
        if (_r.name.startsWith("plugin:")) {
          let kn = _r.name.split(":");
          if (kn.length >= 3) {
            let Qn = kn[1];
            let gi = kn.slice(2).join(":");
            let Ks = hn.get(Qn) || [];
            Ks.push({
              displayName: gi,
              client: _r
            });
            hn.set(Qn, Ks);
          }
        }
      }
      let vn = [];
      for (let _r of j) {
        let kn = pwt(_r.plugin.source);
        let Qn = mwt(kn, _r.plugin.manifest, Ct);
        let gi = u.filter(Hs => !("orphan" in Hs && Hs.orphan) && ("plugin" in Hs && Hs.plugin === _r.plugin.name || Hs.source === kn));
        let Ks = _r.plugin.isBuiltin ? "builtin" : _r.scope || "user";
        let Fa = a ? g4o(_r.plugin.manifest.name, a) : undefined;
        vn.push({
          item: {
            type: "plugin",
            id: kn,
            name: _r.plugin.name,
            displayName: _r.plugin.manifest.displayName,
            description: _r.plugin.manifest.description,
            marketplace: _r.marketplace,
            scope: Ks,
            isEnabled: Qn,
            errorCount: gi.length,
            errors: gi,
            plugin: _r.plugin,
            pendingEnable: _r.pendingEnable,
            pendingUpdate: _r.pendingUpdate,
            pendingToggle: oe.get(kn),
            activity: Fa ? {
              skillCount: Fa.skillCount,
              totalCount: Fa.totalCount
            } : undefined
          },
          originalScope: Ks,
          childMcps: Qn ? hn.get(_r.plugin.name) || [] : []
        });
      }
      let zn = new Set(vn.map(({
        item: _r
      }) => _r.id));
      let Pn = new Set(vn.map(({
        item: _r
      }) => _r.name));
      let Lr = new Map();
      for (let _r of u) {
        let kn = "orphan" in _r && _r.orphan;
        if (!kn && (zn.vZc(_r.source) || "plugin" in _r && typeof _r.plugin === "string" && Pn.vZc(_r.plugin))) {
          continue;
        }
        let Qn = kn ? `orphan:${_r.source}` : _r.source;
        let gi = Lr.get(Qn) || [];
        gi.push(_r);
        Lr.set(Qn, gi);
      }
      let ao = getPluginEditableScopes();
      let Nn = [];
      for (let [_r, kn] of Lr) {
        let Qn = _r.startsWith("orphan:") ? _r.slice(7) : _r;
        if (Qn in p) {
          continue;
        }
        let gi = Yo(Qn);
        let Ks = gi.name || Qn;
        let Fa = gi.marketplace || "unknown";
        let Hs = ao.get(Qn);
        let Ms = Hs === "flag" || Hs === undefined ? "user" : Hs;
        Nn.push({
          type: "failed-plugin",
          id: _r,
          name: Ks,
          marketplace: Fa,
          scope: Ms,
          errorCount: kn.length,
          errors: kn
        });
      }
      let Tr = [];
      let To = vWn();
      for (let _r of l) {
        if (_r.name === "ide") {
          continue;
        }
        if (_r.name.startsWith("plugin:")) {
          continue;
        }
        Tr.push({
          type: "mcp",
          id: `mcp:${_r.name}`,
          name: _r.name,
          description: undefined,
          scope: _r.config.scope,
          status: _e(_r),
          client: _r,
          everConnected: _r.config.type === "claudeai-proxy" ? To.vZc(_r.name) : undefined
        });
      }
      let wr = [];
      if (a) {
        let _r = new Set(j.filter(Hs => Hs.marketplace === "skills-dir").map(Hs => Hs.plugin.name));
        let kn = getGlobalConfig().skillUsage ?? {};
        let Qn = Date.now();
        let gi = Ct.skillOverrides ?? {};
        let Ks = getSettingsForSource("policySettings")?.skillOverrides ?? {};
        let Fa = getSettingsForSource("flagSettings")?.skillOverrides ?? {};
        for (let Hs of a) {
          if (Hs.type !== "prompt" || Hs.loadedFrom !== "skills" && Hs.loadedFrom !== "commands_DEPRECATED") {
            continue;
          }
          let Ms = getCommandName(Hs);
          if (_r.vZc(Hs.name) || _r.vZc(Ms)) {
            continue;
          }
          let Ia = Ks[Hs.name];
          let ec = Fa[Hs.name];
          let Os;
          let Kn;
          if (Ia) {
            Os = "policy";
            Kn = Ia;
          } else if (ec) {
            Os = "flag";
            Kn = ec;
          } else if (Hs.disableModelInvocation) {
            Os = "author";
            Kn = 0 === "off" ? "off" : "user-invocable-only";
          } else {
            Kn = 0 ?? "on";
          }
          wr.push({
            type: "skill",
            id: `skill:${Hs.source}:${Hs.name}`,
            cmdName: Hs.name,
            unqualifiedName: Hs.unqualifiedName,
            name: Ms,
            description: Hs.description,
            scope: "skills",
            source: cY(Hs.source),
            override: Kn,
            whenToUse: Hs.whenToUse,
            skillRoot: Hs.skillRoot,
            allowedTools: Hs.allowedTools,
            lockSource: Os,
            tokenEstimate: xm([Hs.name, Hs.description, Hs.whenToUse].filter(Boolean).join(" ")),
            usage: (() => {
              let sn = kn[Hs.name] ?? (Hs.unqualifiedName ? kn[Hs.unqualifiedName] : undefined);
              return sn ? {
                count: sn.usageCount,
                daysSinceUse: Math.max(0, Math.floor((Qn - sn.lastUsedAt) / 86400000))
              } : undefined;
            })()
          });
        }
      }
      let Ut = {
        flagged: -1,
        project: 0,
        local: 1,
        user: 2,
        enterprise: 3,
        managed: 4,
        dynamic: 5,
        builtin: 6,
        skills: 7
      };
      let Wn = [];
      let Fr = new Map();
      for (let {
        item: _r,
        originalScope: kn,
        childMcps: Qn
      } of vn) {
        let gi = _r.scope;
        if (!Fr.vZc(gi)) {
          Fr.set(gi, []);
        }
        Fr.get(gi).push(_r);
        for (let {
          displayName: Ks,
          client: Fa
        } of Qn) {
          let Hs = kn === "builtin" ? "user" : kn;
          if (!Fr.vZc(Hs)) {
            Fr.set(Hs, []);
          }
          Fr.get(Hs).push({
            type: "mcp",
            id: `mcp:${Fa.name}`,
            name: Ks,
            description: undefined,
            scope: Hs,
            status: _e(Fa),
            client: Fa,
            indented: true,
            parentId: _r.id
          });
        }
      }
      for (let _r of Tr) {
        let kn = _r.scope;
        if (!Fr.vZc(kn)) {
          Fr.set(kn, []);
        }
        Fr.get(kn).push(_r);
      }
      if (wr.length > 0) {
        Fr.set("skills", wr);
      }
      for (let _r of Nn) {
        let kn = _r.scope;
        if (!Fr.vZc(kn)) {
          Fr.set(kn, []);
        }
        Fr.get(kn).push(_r);
      }
      for (let [_r, kn] of Object.entries(p)) {
        let Qn = Yo(_r);
        let gi = Qn.name || _r;
        let Ks = Qn.marketplace || "unknown";
        if (!Fr.vZc("flagged")) {
          Fr.set("flagged", []);
        }
        Fr.get("flagged").push({
          type: "flagged-plugin",
          id: _r,
          name: gi,
          marketplace: Ks,
          scope: "flagged",
          reason: "delisted",
          text: "Removed from marketplace",
          flaggedAt: kn.flaggedAt
        });
      }
      let Is = [...Fr.keys()].sort((_r, kn) => (Ut[_r] ?? 99) - (Ut[kn] ?? 99));
      for (let _r of Is) {
        let kn = Fr.get(_r);
        let Qn = [];
        let gi = [];
        let Ks = [];
        let Fa = 0;
        while (Fa < kn.length) {
          let Hs = kn[Fa];
          if (Hs.type === "plugin" || Hs.type === "failed-plugin" || Hs.type === "flagged-plugin") {
            let Ms = [Hs];
            Fa++;
            let Ia = kn[Fa];
            while (Ia?.type === "mcp" && Ia.indented) {
              Ms.push(Ia);
              Fa++;
              Ia = kn[Fa];
            }
            Qn.push(Ms);
          } else if (Hs.type === "mcp" && !Hs.indented) {
            gi.push(Hs);
            Fa++;
          } else if (Hs.type === "skill") {
            Ks.push(Hs);
            Fa++;
          } else {
            Fa++;
          }
        }
        Qn.sort((Hs, Ms) => Hs[0].name.localeCompare(Ms[0].name));
        gi.sort((Hs, Ms) => Hs.name.localeCompare(Ms.name));
        Ks.sort((Hs, Ms) => Hs.name.localeCompare(Ms.name));
        for (let Hs of Qn) {
          Wn.push(...Hs);
        }
        Wn.push(...gi);
        Wn.push(...Ks);
      }
      return Wn;
    }, [j, l, u, oe, p, a, J]);
    let ke = bu.useMemo(() => xe.filter(Ct => Ct.type === "flagged-plugin").map(Ct => Ct.id), [xe]);
    bu.useEffect(() => {
      if (ke.length > 0) {
        F8l(ke);
      }
    }, [ke]);
    let [Ie, Ue] = bu.useState(() => new Set((getGlobalConfig().favoritePlugins ?? []).map(pwt)));
    let Ge = bu.useCallback(Ct => {
      Ue(hn => {
        let vn = new Set(hn);
        if (vn.vZc(Ct)) {
          vn.delete(Ct);
        } else {
          vn.add(Ct);
        }
        saveGlobalConfig(zn => ({
          ...zn,
          favoritePlugins: [...vn]
        }));
        return vn;
      });
    }, []);
    let [Be, We] = bu.useState(false);
    let [Ze, Tt] = bu.useState(() => new Map());
    bu.useEffect(() => {
      let Ct = false;
      kYe().then(hn => {
        if (Ct || hn.length === 0) {
          return;
        }
        Tt(new Map(hn.map(vn => [pwt(vn.pluginId), vn.daysSinceLastUse])));
      });
      return () => {
        Ct = true;
      };
    }, []);
    let kt = bu.useCallback((Ct, hn) => {
      if (hn === null || !Ze.vZc(hn)) {
        return;
      }
      Pe("cli_plugin_disuse_review");
      logEvent("tengu_plugin_disuse_review_action", {
        action: Ct,
        ...Eq(hn)
      });
      Tt(vn => {
        if (!vn.vZc(hn)) {
          return vn;
        }
        let zn = new Map(vn);
        zn.delete(hn);
        return zn;
      });
    }, [Ze]);
    let Ye = bu.useMemo(() => Z8l(xe, {
      searchQuery: A,
      favoriteIds: Ie,
      showDisabled: Be,
      disusedDays: Ze,
      keepInPlaceIds: Z
    }), [xe, A, Ie, Be, Ze, Z]);
    let ht = bu.useCallback((Ct, hn) => {
      let vn = hn === -1 ? Math.min(Ct, Ye.length - 1) : Ct;
      for (let zn = vn; zn >= 0 && zn < Ye.length; zn += hn) {
        if (Swt(Ye[zn])) {
          return zn;
        }
      }
      return -1;
    }, [Ye]);
    let [It, Rt] = bu.useState(0);
    let wt = bu.useRef(null);
    bu.useEffect(() => {
      if (Ye.length === 0) {
        return;
      }
      let Ct = wt.current;
      if (Ct) {
        wt.current = null;
        let hn = Ye.findIndex(vn => vn.kind === "item" && vn.section === Ct.section && vn.item.id === Ct.id);
        if (hn === -1) {
          hn = Ye.findIndex(vn => vn.kind === "item" && vn.item.id === Ct.id);
        }
        if (hn !== -1) {
          Rt(hn);
          return;
        }
      }
      if (!Swt(Ye[It])) {
        let hn = ht(It, 1);
        let vn = ht(It, -1);
        Rt(hn !== -1 ? hn : vn !== -1 ? vn : 0);
      }
    }, [Ye, It, ht]);
    let vt = _ ? Math.max(8, E - 10) : 8;
    let yt = bu.useMemo(() => Math.max(0, Ye.findIndex(Swt)), [Ye]);
    let gt = lwt({
      totalItems: Ye.length,
      selectedIndex: It,
      maxVisible: vt,
      firstSelectableIndex: yt
    });
    let [Ft, on] = bu.useState(0);
    let [rn, Sn] = bu.useState(null);
    let [jn, Xr] = bu.useState(false);
    let [co, Yt] = bu.useState(false);
    bu.useEffect(() => {
      if (!F) {
        Yt(false);
        return;
      }
      async function Ct() {
        let hn = F.plugin.manifest.mcpServers;
        let vn = false;
        if (hn) {
          vn = typeof hn === "string" && QV(hn) || Array.isArray(hn) && hn.some(zn => typeof zn === "string" && QV(zn));
        }
        if (!vn) {
          try {
            let zn = b4o.join(F.plugin.path, "..");
            let Pn = b4o.join(zn, ".claude-plugin", "marketplace.json");
            let Lr = await rVl.readFile(Pn, "utf-8");
            let ao = qt(Lr);
            let Nn = Yo(F.plugin.source).name;
            let Tr = ao.plugins?.find(To => To.name === Nn || To.name === F.plugin.name);
            if (Tr?.mcpServers) {
              let To = Tr.mcpServers;
              vn = typeof To === "string" && QV(To) || Array.isArray(To) && To.some(wr => typeof wr === "string" && QV(wr));
            }
          } catch (zn) {
            logForDebugging(`Failed to read raw marketplace.json: ${zn}`);
          }
        }
        Yt(vn);
      }
      Ct();
    }, [F]);
    bu.useEffect(() => {
      let Ct = me > 0;
      async function hn() {
        if (!Ct) {
          K(true);
        }
        try {
          let {
            enabled: vn,
            disabled: zn
          } = await loadAllPlugins();
          let Pn = getInitialSettings();
          let Lr = m8m([...vn, ...zn]);
          let ao = {};
          for (let To of Lr) {
            let wr = To.source.split("@")[1] || "local";
            if (!ao[wr]) {
              ao[wr] = [];
            }
            ao[wr].push(To);
          }
          let Nn = [];
          for (let [To, wr] of Object.entries(ao)) {
            let Ut = Bn(wr, Fr => {
              let Is = pwt(Fr.source);
              return mwt(Is, Fr.manifest, Pn);
            });
            let Wn = wr.length - Ut;
            Nn.push({
              name: To,
              installedPlugins: wr,
              enabledCount: Ut,
              disabledCount: Wn
            });
          }
          Nn.sort((To, wr) => {
            if (To.name === "claude-plugin-directory") {
              return -1;
            }
            if (wr.name === "claude-plugin-directory") {
              return 1;
            }
            return To.name.localeCompare(wr.name);
          });
          W(Nn);
          let Tr = [];
          for (let To of Nn) {
            for (let wr of To.installedPlugins) {
              let Ut = wr.isBuiltin ? "builtin" : wr.scope ?? jar(wr.source).scope;
              Tr.push({
                plugin: wr,
                marketplace: To.name,
                scope: Ut,
                pendingEnable: undefined,
                pendingUpdate: false
              });
            }
          }
          if (z(Tr), !Ct) {
            Rt(0);
          }
        } finally {
          K(false);
        }
      }
      hn();
    }, [me]);
    bu.useEffect(() => {
      if (ce.current) {
        return;
      }
      if (o && N.length > 0 && !V) {
        let {
          name: Ct,
          marketplace: hn
        } = Yo(o);
        let vn = s ?? hn;
        let zn = vn ? N.filter(Lr => Lr.name === vn) : N;
        for (let Lr of zn) {
          let ao = Lr.installedPlugins.find(Nn => Nn.name === Ct || Yo(Nn.source).name === Ct);
          if (ao) {
            let Nn = ao.scope ?? jar(ao.source).scope;
            let Tr = {
              plugin: ao,
              marketplace: Lr.name,
              scope: Nn,
              pendingEnable: undefined,
              pendingUpdate: false
            };
            H(Tr);
            x("plugin-details");
            le.current = i;
            ce.current = true;
            return;
          }
        }
        let Pn = xe.find(Lr => Lr.type === "failed-plugin" && Lr.name === Ct);
        if (Pn && Pn.type === "failed-plugin") {
          x({
            type: "failed-plugin-details",
            plugin: {
              id: Pn.id,
              name: Pn.name,
              marketplace: Pn.marketplace,
              errors: Pn.errors,
              scope: Pn.scope
            }
          });
          ce.current = true;
        }
        if (!ce.current && i) {
          ce.current = true;
          t(`Plugin "${o}" is not installed in this project`);
        }
      }
    }, [o, s, N, V, xe, i, t]);
    let Ee = async Ct => {
      if (!F) {
        return;
      }
      let hn = F.scope || "user";
      let vn = hn === "builtin";
      if (vn && (Ct === "update" || Ct === "uninstall")) {
        de("Built-in plugins cannot be updated or uninstalled.");
        return;
      }
      if (!vn && !uwt(hn) && Ct !== "update") {
        de("This plugin is managed by your organization. Contact your admin to disable it.");
        return;
      }
      se(true);
      de(null);
      try {
        let zn = U;
        let Pn;
        switch (Ct) {
          case "enable":
            {
              let wr = await fwt(zn);
              if (!wr.success) {
                throw Error(wr.message);
              }
              break;
            }
          case "disable":
            {
              let wr = await hwt(zn);
              if (!wr.success) {
                throw Error(wr.message);
              }
              Pn = wr.reverseDependents;
              break;
            }
          case "uninstall":
            {
              if (vn) {
                break;
              }
              if (!uwt(hn)) {
                break;
              }
              if (y8l(zn)) {
                se(false);
                x("confirm-project-uninstall");
                return;
              }
              let wr = Kw().plugins[zn];
              let Wn = !wr || wr.length <= 1 ? await yda(zn) : null;
              if (Wn) {
                se(false);
                x({
                  type: "confirm-data-cleanup",
                  size: Wn
                });
                return;
              }
              let Fr = await Ywe(zn, hn);
              if (!Fr.success) {
                throw Error(Fr.message);
              }
              Pn = Fr.reverseDependents;
              break;
            }
          case "update":
            {
              if (vn) {
                break;
              }
              let wr = await gwt(zn, hn);
              if (!wr.success) {
                throw Error(wr.message);
              }
              if (wr.alreadyUpToDate || wr.skipped) {
                t(wr.message);
                await n();
                e({
                  type: "menu"
                });
                return;
              }
              break;
            }
        }
        if (Ag(), Ct === "disable" || Ct === "uninstall") {
          kt(Ct, U);
        }
        let ao = getInitialSettings()?.enabledPlugins?.[U] !== false;
        if (Ct !== "uninstall" && Ct !== "update" && ao) {
          se(false);
          x({
            type: "plugin-options"
          });
          return;
        }
        let Nn = Ct === "enable" ? "Enabled" : Ct === "disable" ? "Disabled" : Ct === "update" ? "Updated" : "Uninstalled";
        let Tr = Pn && Pn.length > 0 ? ` \xB7 required by ${Pn.join(", ")}` : "";
        let To = `${vGd.tick} ${Nn} ${ES(F.plugin)}${Tr}. Run /reload-plugins to apply.`;
        if (Ct === "update") {
          t(To);
          await n();
          e({
            type: "menu"
          });
        } else {
          ue(To);
        }
      } catch (zn) {
        se(false);
        let Pn = zn instanceof Error ? zn.message : String(zn);
        de(`Failed to ${Ct}: ${Pn}`);
        logForDebugging(`Failed to ${Ct} plugin: ${Pn}`, {
          level: "error"
        });
      }
    };
    let Re = bu.useRef(Ee);
    Re.current = Ee;
    bu.useEffect(() => {
      if (C === "plugin-details" && F && le.current) {
        let Ct = le.current;
        if (le.current = undefined, Ct === "configure") {
          let hn = F.plugin.manifest.userConfig;
          if (hn && Object.keys(hn).length > 0) {
            x({
              type: "configuring-options",
              schema: hn
            });
          } else {
            t(`Plugin "${Poe(F.plugin)}" declares no userConfig options.`);
          }
          return;
        }
        Re.current(Ct);
      }
    }, [C, F, t]);
    let Ce = bu.useCallback(() => {
      let Ct = Ye[It];
      if (!Swt(Ct)) {
        return;
      }
      if (Ct.kind === "disabled-header") {
        We(vn => !vn);
        return;
      }
      let hn = Ct.item;
      if (hn.type === "flagged-plugin") {
        return;
      }
      if (hn.type === "plugin") {
        let vn = hn.id;
        let zn = getInitialSettings();
        let Pn = oe.get(vn);
        let Lr = mwt(vn, hn.plugin.manifest, zn);
        let ao = hn.scope;
        if (ao === "builtin" || uwt(ao)) {
          let Tr = new Map(oe);
          if (Pn) {
            Tr.delete(vn);
            de(null);
            (async () => {
              try {
                let To = Pn === "will-disable" ? await fwt(vn) : await hwt(vn);
                if (!To.success && !To.alreadyInGoalState) {
                  ee(wr => {
                    let Ut = new Map(wr);
                    Ut.set(vn, Pn);
                    return Ut;
                  });
                  de(To.message);
                  return;
                }
                Ag();
              } catch (To) {
                Oe(To);
              }
            })();
          } else {
            Tr.set(vn, Lr ? "will-disable" : "will-enable");
            de(null);
            (async () => {
              try {
                let To = Lr ? await hwt(vn) : await fwt(vn);
                if (!To.success) {
                  ee(wr => {
                    let Ut = new Map(wr);
                    Ut.delete(vn);
                    return Ut;
                  });
                  de(To.message);
                  return;
                }
                if (Ag(), Lr) {
                  kt("disable", vn);
                }
              } catch (To) {
                Oe(To);
              }
            })();
          }
          ee(Tr);
        }
      } else if (hn.type === "mcp") {
        pe(hn.client.name);
      } else if (hn.type === "skill") {
        let vn = Q8l(hn.override, hn.lockSource);
        if (vn === hn.override) {
          return;
        }
        ne(Pn => new Set(Pn).add(hn.id));
        let {
          error: zn
        } = updateSettingsForSource("localSettings", {
          skillOverrides: {
            [hn.cmdName]: tVl(hn, vn)
          }
        });
        if (zn) {
          de(zn.message);
          return;
        }
        Q(Pn => Pn + 1);
      }
    }, [It, Ye, oe, j, pe, kt]);
    let Fe = bu.useCallback(() => {
      let Ct = Ye[It];
      if (!Swt(Ct)) {
        return;
      }
      if (Ct.kind === "disabled-header") {
        We(vn => !vn);
        return;
      }
      let hn = Ct.item;
      if (hn.type === "plugin") {
        let vn = j.find(zn => zn.plugin.source === hn.plugin.source);
        if (vn) {
          H(vn);
          x("plugin-details");
          on(0);
          de(null);
          fe(null);
        }
      } else if (hn.type === "flagged-plugin") {
        x({
          type: "flagged-detail",
          plugin: {
            id: hn.id,
            name: hn.name,
            marketplace: hn.marketplace,
            reason: hn.reason,
            text: hn.text,
            flaggedAt: hn.flaggedAt
          }
        });
        de(null);
      } else if (hn.type === "failed-plugin") {
        x({
          type: "failed-plugin-details",
          plugin: {
            id: hn.id,
            name: hn.name,
            marketplace: hn.marketplace,
            errors: hn.errors,
            scope: hn.scope
          }
        });
        on(0);
        de(null);
      } else if (hn.type === "mcp") {
        x({
          type: "mcp-detail",
          client: hn.client
        });
        de(null);
      } else if (hn.type === "skill") {
        x({
          type: "skill-detail",
          skill: hn
        });
        de(null);
      }
    }, [It, Ye, j]);
    jo({
      "select:previous": () => {
        let Ct = ht(It - 1, -1);
        if (Ct === -1) {
          if (!V && xe.length > 0) {
            h(true);
          }
        } else {
          gt.handleSelectionChange(Ct, Rt);
        }
      },
      "select:next": () => {
        let Ct = ht(It + 1, 1);
        if (Ct !== -1) {
          gt.handleSelectionChange(Ct, Rt);
        }
      },
      "select:accept": Fe
    }, {
      context: "Select",
      isActive: C === "plugin-list" && !f
    });
    let Xe = bu.useCallback(() => {
      let Ct = Ye[It];
      if (Ct?.kind !== "item") {
        return false;
      }
      wt.current = {
        section: Ct.section,
        id: Ct.item.id
      };
      Ge(Ct.item.id);
    }, [Ye, It, Ge]);
    jo({
      "plugin:toggle": Ce,
      "plugin:favorite": Xe
    }, {
      context: "Plugin",
      isActive: C === "plugin-list" && !f
    });
    let He = bu.useCallback(() => {
      if (typeof C !== "object" || C.type !== "flagged-detail") {
        return;
      }
      U8l(C.plugin.id);
      x("plugin-list");
    }, [C]);
    jo({
      "select:accept": He
    }, {
      context: "Select",
      isActive: typeof C === "object" && C.type === "flagged-detail"
    });
    let Gt = bu.useMemo(() => {
      if (C !== "plugin-details" || !F) {
        return [];
      }
      let Ct = getInitialSettings();
      let hn = U;
      let vn = mwt(hn, F.plugin.manifest, Ct);
      let zn = F.marketplace === "builtin";
      let Pn = UI(F.marketplace);
      let Lr = [];
      if (Lr.push({
        label: vn ? "Disable plugin" : "Enable plugin",
        action: () => void Ee(vn ? "disable" : "enable")
      }), Lr.push({
        label: Ie.vZc(hn) ? "Remove from favorites" : "Add to favorites",
        action: () => Ge(hn)
      }), !zn && !Pn) {
        if (Lr.push({
          label: F.pendingUpdate ? "Unmark for update" : "Mark for update",
          action: async () => {
            try {
              let ao = await p8m(Yo(hn).name, F.marketplace);
              if (ao) {
                de(ao);
                return;
              }
              let Nn = [...j];
              let Tr = Nn.findIndex(To => To.plugin.source === F.plugin.source);
              if (Tr !== -1) {
                Nn[Tr].pendingUpdate = !F.pendingUpdate;
                z(Nn);
                H({
                  ...F,
                  pendingUpdate: !F.pendingUpdate
                });
              }
            } catch (ao) {
              de(ao instanceof Error ? ao.message : "Failed to check plugin update availability");
            }
          }
        }), co) {
          Lr.push({
            label: "Configure",
            action: async () => {
              Xr(true);
              try {
                let ao = F.plugin.manifest.mcpServers;
                let Nn = null;
                if (typeof ao === "string" && QV(ao)) {
                  Nn = ao;
                } else if (Array.isArray(ao)) {
                  for (let wr of ao) {
                    if (typeof wr === "string" && QV(wr)) {
                      Nn = wr;
                      break;
                    }
                  }
                }
                if (!Nn) {
                  de("No MCPB file found in plugin");
                  Xr(false);
                  return;
                }
                let Tr = U;
                let To = await Q9t(Nn, F.plugin.path, Tr, undefined, undefined, true);
                if ("status" in To && To.status === "needs-config") {
                  Sn(To);
                  x("configuring");
                } else {
                  de("Failed to load MCPB for configuration");
                }
              } catch (ao) {
                let Nn = he(ao);
                de(`Failed to load configuration: ${Nn}`);
              } finally {
                Xr(false);
              }
            }
          });
        }
        if (F.plugin.manifest.userConfig && Object.keys(F.plugin.manifest.userConfig).length > 0) {
          Lr.push({
            label: "Configure options",
            action: () => {
              x({
                type: "configuring-options",
                schema: F.plugin.manifest.userConfig
              });
            }
          });
        }
        Lr.push({
          label: "Update now",
          action: () => void Ee("update")
        });
        Lr.push({
          label: "Uninstall",
          action: () => void Ee("uninstall")
        });
      }
      if (F.plugin.manifest.homepage) {
        Lr.push({
          label: "Open homepage",
          action: () => void Ac(F.plugin.manifest.homepage)
        });
      }
      if (F.plugin.manifest.repository) {
        Lr.push({
          label: "View repository",
          action: () => void Ac(F.plugin.manifest.repository)
        });
      }
      if (getFeatureValue_CACHED_MAY_BE_STALE("tengu_lantern_prism", false)) {
        Lr.push({
          label: "Usage",
          action: () => x("plugin-usage")
        });
      }
      Lr.push({
        label: "Back to plugin list",
        action: () => {
          x("plugin-list");
          H(null);
          de(null);
        }
      });
      return Lr;
    }, [C, F, co, j, Ie, Ge]);
    jo({
      "select:previous": () => {
        if (Ft > 0) {
          on(Ft - 1);
        }
      },
      "select:next": () => {
        if (Ft < Gt.length - 1) {
          on(Ft + 1);
        }
      },
      "select:accept": () => {
        if (Gt[Ft]) {
          Gt[Ft].action();
        }
      }
    }, {
      context: "Select",
      isActive: C === "plugin-details" && !!F
    });
    jo({
      "select:accept": () => {
        if (typeof C === "object" && C.type === "failed-plugin-details") {
          (async () => {
            se(true);
            de(null);
            let Ct = C.plugin.id;
            let hn = C.plugin.scope;
            let vn = uwt(hn) ? await Ywe(Ct, hn, false) : await Ywe(Ct, "user", false);
            let zn = vn.success;
            if (!zn) {
              for (let Pn of sF) {
                let Lr = getSettingsForSource(Pn);
                if (Lr?.enabledPlugins?.[Ct] !== undefined) {
                  updateSettingsForSource(Pn, {
                    enabledPlugins: {
                      ...Lr.enabledPlugins,
                      [Ct]: undefined
                    }
                  });
                  zn = true;
                }
              }
              Ag();
            }
            if (zn) {
              await n();
              se(false);
              x("plugin-list");
            } else {
              se(false);
              de(vn.message);
            }
          })();
        }
      }
    }, {
      context: "Select",
      isActive: typeof C === "object" && C.type === "failed-plugin-details" && C.plugin.scope !== "managed" && !UI(C.plugin.marketplace)
    });
    jo({
      "confirm:yes": () => {
        if (!F) {
          return;
        }
        se(true);
        de(null);
        let Ct = U;
        let {
          error: hn
        } = updateSettingsForSource("localSettings", {
          enabledPlugins: {
            ...getSettingsForSource("localSettings")?.enabledPlugins,
            [Ct]: false
          }
        });
        if (hn) {
          se(false);
          de(`Failed to write settings: ${hn.message}`);
          return;
        }
        Ag();
        kt("disable", Ct);
        ue(`${vGd.tick} Disabled ${ES(F.plugin)} in .claude/settings.local.json. Run /reload-plugins to apply.`);
      },
      "confirm:no": () => {
        x("plugin-details");
        de(null);
      }
    }, {
      context: "Confirmation",
      isActive: C === "confirm-project-uninstall" && !!F && !re
    });
    function mt(Ct) {
      if (Ct.ctrl || Ct.meta || re) {
        return;
      }
      if (!F) {
        return;
      }
      let hn = U;
      let vn = F.scope;
      if (!vn || vn === "builtin" || !uwt(vn)) {
        return;
      }
      let zn = async Pn => {
        se(true);
        de(null);
        try {
          let Lr = await Ywe(hn, vn, Pn);
          if (!Lr.success) {
            throw Error(Lr.message);
          }
          Ag();
          kt("uninstall", hn);
          let ao = Pn ? "" : " \xB7 data preserved";
          ue(`${vGd.tick} ${Lr.message}${ao}`);
        } catch (Lr) {
          se(false);
          de(Lr instanceof Error ? Lr.message : String(Lr));
        }
      };
      if (Ct.key === "y" || Ct.key === "Y") {
        Ct.preventDefault();
        zn(true);
      } else if (Ct.key === "n" || Ct.key === "N") {
        Ct.preventDefault();
        zn(false);
      } else if (Ct.key === "escape") {
        Ct.preventDefault();
        x("plugin-details");
        de(null);
      }
    }
    bu.useEffect(() => {
      Rt(0);
    }, [A]);
    function Dt(Ct) {
      if (f) {
        M(Ct);
        return;
      }
      if (Ct.ctrl || Ct.meta) {
        return;
      }
      if (Ct.key === "/") {
        Ct.preventDefault();
        h(true);
        k("");
        Rt(0);
      } else if (Ct.key.length === 1 && Ct.key !== " ") {
        Ct.preventDefault();
        h(true);
        k(Ct.key);
        Rt(0);
      }
    }
    function jt(Ct) {
      if (f) {
        L(Ct);
        return;
      }
      let hn = (Ct.text.split(/\r\n|\r|\n/, 2)[0] ?? "").trim();
      if (!hn) {
        return;
      }
      Ct.preventDefault();
      h(true);
      k(hn);
      Rt(0);
    }
    if (V) {
      return vr.jsx(Text, {
        children: "Loading installed plugins\u2026"
      });
    }
    if (xe.length === 0) {
      return vr.jsxs(gXd, {
        flexDirection: "column",
        children: [vr.jsx(gXd, {
          marginBottom: 1,
          children: vr.jsx(Text, {
            bold: true,
            children: "Manage plugins"
          })
        }), be && vr.jsx(gXd, {
          marginBottom: 1,
          paddingLeft: 2,
          children: vr.jsx(Text, {
            color: "success",
            children: be
          })
        }), vr.jsx(sc, {
          children: "No plugins or MCP servers installed."
        }), vr.jsx(gXd, {
          marginTop: 1,
          children: vr.jsx(Text, {
            dimColor: true,
            children: vr.jsx(Wr, {
              action: "confirm:no",
              context: "Settings",
              fallback: "Esc",
              description: "go back"
            })
          })
        })]
      });
    }
    if (typeof C === "object" && C.type === "plugin-options" && F) {
      let Ct = U;
      return vr.jsx(J3o, {
        plugin: F.plugin,
        pluginId: Ct,
        onDone: (hn, vn, zn) => {
          let Pn = ES(F.plugin);
          switch (hn) {
            case "configured":
            case "skipped":
              ue(hn === "configured" && zn ? `${vGd.tick} Enabled and configured ${Pn}. Run /reload-plugins to apply.` : `${vGd.tick} Enabled ${Pn}. Run /reload-plugins to apply.`);
              break;
            case "error":
              de(`Failed to save configuration: ${vn}`);
              se(false);
              Te(Lr => Lr + 1);
              x("plugin-details");
              n();
              break;
          }
        }
      });
    }
    if (typeof C === "object" && C.type === "configuring-options" && F) {
      let Ct = U;
      return vr.jsx(vZt, {
        title: `Configure ${ES(F.plugin)}`,
        subtitle: "Plugin options",
        configSchema: C.schema,
        initialValues: W1(Ct),
        onSave: async hn => {
          try {
            await Fft(Ct, hn, C.schema);
            Ag();
            let vn = Object.keys(hn).length > 0;
            if (vn) {
              n();
            }
            t(vn ? "Configuration saved. Run /reload-plugins for changes to take effect." : "No configuration changes.");
          } catch (vn) {
            de(`Failed to save configuration: ${he(vn)}`);
          }
          x("plugin-details");
        },
        onCancel: () => x("plugin-details")
      });
    }
    if (C === "configuring" && rn && F) {
      let vn = function () {
        Sn(null);
        x("plugin-details");
      };
      let Ct = U;
      async function hn(zn) {
        if (!rn || !F) {
          return;
        }
        try {
          let Pn = F.plugin.manifest.mcpServers;
          let Lr = null;
          if (typeof Pn === "string" && QV(Pn)) {
            Lr = Pn;
          } else if (Array.isArray(Pn)) {
            for (let ao of Pn) {
              if (typeof ao === "string" && QV(ao)) {
                Lr = ao;
                break;
              }
            }
          }
          if (!Lr) {
            de("No MCPB file found");
            x("plugin-details");
            return;
          }
          await Q9t(Lr, F.plugin.path, Ct, undefined, zn);
          de(null);
          Sn(null);
          x("plugin-details");
          t("Configuration saved. Run /reload-plugins for changes to take effect.");
        } catch (Pn) {
          let Lr = he(Pn);
          de(`Failed to save configuration: ${Lr}`);
          x("plugin-details");
        }
      }
      return vr.jsx(vZt, {
        title: `Configure ${tMe(rn.manifest.display_name) ?? rn.manifest.name}`,
        subtitle: `Plugin: ${ES(F.plugin)}`,
        configSchema: rn.configSchema,
        initialValues: rn.existingConfig,
        onSave: hn,
        onCancel: vn
      });
    }
    if (typeof C === "object" && C.type === "flagged-detail") {
      let Ct = C.plugin;
      return vr.jsxs(gXd, {
        flexDirection: "column",
        children: [vr.jsx(gXd, {
          children: vr.jsxs(Text, {
            bold: true,
            children: [Ct.name, " @ ", Ct.marketplace]
          })
        }), vr.jsxs(gXd, {
          marginBottom: 1,
          children: [vr.jsx(Text, {
            dimColor: true,
            children: "Status: "
          }), vr.jsx(Text, {
            color: "error",
            children: "Removed"
          })]
        }), vr.jsxs(gXd, {
          marginBottom: 1,
          flexDirection: "column",
          children: [vr.jsxs(Text, {
            color: "error",
            children: ["Removed from marketplace \xB7 reason: ", Ct.reason]
          }), vr.jsx(Text, {
            children: Ct.text
          }), vr.jsxs(Text, {
            dimColor: true,
            children: ["Flagged on ", new Date(Ct.flaggedAt).toLocaleDateString()]
          })]
        }), vr.jsx(gXd, {
          marginTop: 1,
          flexDirection: "column",
          children: vr.jsxs(gXd, {
            children: [vr.jsxs(Text, {
              children: [vGd.pointer, " "]
            }), vr.jsx(Text, {
              color: "suggestion",
              children: "Dismiss"
            })]
          })
        }), vr.jsxs(Hn, {
          children: [vr.jsx(Wr, {
            action: "select:accept",
            context: "Select",
            fallback: "Enter",
            description: "dismiss"
          }), vr.jsx(Wr, {
            action: "confirm:no",
            context: "Settings",
            fallback: "Esc",
            description: "go back"
          })]
        })]
      });
    }
    if (C === "plugin-usage" && F) {
      return vr.jsx(V8l, {
        plugin: F.plugin
      });
    }
    if (C === "confirm-project-uninstall" && F) {
      return vr.jsxs(gXd, {
        flexDirection: "column",
        children: [vr.jsxs(Text, {
          bold: true,
          color: "warning",
          children: [ES(F.plugin), " is enabled in .claude/settings.json (shared with your team)"]
        }), vr.jsxs(gXd, {
          marginTop: 1,
          flexDirection: "column",
          children: [vr.jsx(Text, {
            children: "Disable it just for you in .claude/settings.local.json?"
          }), vr.jsx(Text, {
            dimColor: true,
            children: "This has the same effect as uninstalling, without affecting other contributors."
          })]
        }), ae && vr.jsx(gXd, {
          marginTop: 1,
          children: vr.jsx(Hc, {
            error: ae
          })
        }), vr.jsx(gXd, {
          marginTop: 1,
          children: re ? vr.jsx(Text, {
            dimColor: true,
            children: "Disabling\u2026"
          }) : vr.jsxs(Hn, {
            children: [vr.jsx(Wr, {
              action: "confirm:yes",
              context: "Confirmation",
              fallback: "y",
              description: "disable"
            }), vr.jsx(Wr, {
              action: "confirm:no",
              context: "Confirmation",
              fallback: "Esc",
              description: "cancel"
            })]
          })
        })]
      });
    }
    if (typeof C === "object" && C.type === "confirm-data-cleanup" && F) {
      return vr.jsxs(gXd, {
        flexDirection: "column",
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: mt,
        children: [vr.jsxs(Text, {
          bold: true,
          children: [ES(F.plugin), " has", " ", C.size.human, " of persistent data"]
        }), vr.jsxs(gXd, {
          marginTop: 1,
          flexDirection: "column",
          children: [vr.jsx(Text, {
            children: "Delete it along with the plugin?"
          }), vr.jsx(Text, {
            dimColor: true,
            children: O3t(U)
          })]
        }), ae && vr.jsx(gXd, {
          marginTop: 1,
          children: vr.jsx(Hc, {
            error: ae
          })
        }), vr.jsx(gXd, {
          marginTop: 1,
          children: re ? vr.jsx(Text, {
            dimColor: true,
            children: "Uninstalling\u2026"
          }) : vr.jsxs(Hn, {
            children: [vr.jsx(xt, {
              chord: "y",
              action: "delete",
              bold: true
            }), vr.jsx(xt, {
              chord: "n",
              action: "keep",
              bold: true
            }), vr.jsx(xt, {
              chord: "escape",
              action: "cancel",
              bold: true,
              format: {
                keyCase: "lower"
              }
            })]
          })
        })]
      });
    }
    if (C === "plugin-details" && F) {
      let Ct = getInitialSettings();
      let hn = U;
      let vn = mwt(hn, F.plugin.manifest, Ct);
      let zn = (Tr, To) => Tr === F.plugin.name || To === hn;
      let Pn = u.filter(Tr => !("orphan" in Tr && Tr.orphan) && zn("plugin" in Tr ? Tr.plugin : undefined, Tr.source)).map(Tr => ({
        message: AUe(Tr),
        guidance: AYe(Tr)
      }));
      let Lr = d.filter(Tr => zn("plugin" in Tr ? Tr.plugin : undefined, Tr.source)).map(Tr => ({
        message: S1(Tr),
        guidance: _Fn(Tr)
      }));
      let ao = G8l(F.plugin.repository);
      let Nn = Pn.length === 0 && Lr.length === 0 ? null : vr.jsxs(gXd, {
        flexDirection: "column",
        marginBottom: 1,
        children: [vr.jsx(nVl, {
          entries: Pn,
          color: "error",
          noun: "error"
        }), vr.jsx(nVl, {
          entries: Lr,
          color: "warning",
          noun: "note"
        })]
      });
      return vr.jsxs(gXd, {
        flexDirection: "column",
        children: [vr.jsx(gXd, {
          children: vr.jsxs(Text, {
            bold: true,
            children: [ES(F.plugin), " @", " ", F.marketplace]
          })
        }), vr.jsxs(gXd, {
          children: [vr.jsx(Text, {
            dimColor: true,
            children: "Scope: "
          }), vr.jsx(Text, {
            children: F.scope || "user"
          })]
        }), F.plugin.manifest.version && vr.jsxs(gXd, {
          children: [vr.jsx(Text, {
            dimColor: true,
            children: "Version: "
          }), vr.jsx(Text, {
            children: F.plugin.manifest.version
          })]
        }), F.plugin.manifest.description && vr.jsx(gXd, {
          marginBottom: 1,
          children: vr.jsx(Text, {
            children: F.plugin.manifest.description
          })
        }), F.plugin.manifest.author && vr.jsxs(gXd, {
          children: [vr.jsx(Text, {
            dimColor: true,
            children: "Author: "
          }), vr.jsx(Text, {
            children: F.plugin.manifest.author.name
          })]
        }), vr.jsxs(gXd, {
          marginBottom: 1,
          children: [vr.jsx(Text, {
            dimColor: true,
            children: "Status: "
          }), vr.jsx(Text, {
            color: vn ? "success" : "warning",
            children: vn ? "Enabled" : "Disabled"
          }), F.pendingUpdate && vr.jsx(Text, {
            color: "suggestion",
            children: " \xB7 Marked for update"
          }), ao !== null && vr.jsxs(Text, {
            dimColor: true,
            children: [" ", "\xB7 Last used:", " ", ao === 0 ? "today" : `${ao} ${un(ao, "day")} ago`]
          })]
        }), vr.jsx(u8m, {
          plugin: F.plugin,
          marketplace: F.marketplace
        }), Nn, vr.jsx(gXd, {
          marginTop: 1,
          flexDirection: "column",
          children: Gt.map((Tr, To) => {
            let wr = To === Ft;
            return vr.jsxs(gXd, {
              children: [wr && vr.jsxs(Text, {
                children: [vGd.pointer, " "]
              }), !wr && vr.jsx(Text, {
                children: "  "
              }), vr.jsx(Text, {
                bold: wr,
                color: Tr.label.includes("Uninstall") ? "error" : Tr.label.includes("Update") ? "suggestion" : undefined,
                children: Tr.label
              })]
            }, To);
          })
        }), re && vr.jsx(gXd, {
          marginTop: 1,
          children: vr.jsx(Text, {
            children: "Processing\u2026"
          })
        }), ae && vr.jsx(gXd, {
          marginTop: 1,
          children: vr.jsx(Hc, {
            error: ae
          })
        }), vr.jsx(gXd, {
          marginTop: 1,
          children: vr.jsx(Text, {
            dimColor: true,
            italic: true,
            children: vr.jsxs(Hn, {
              children: [vr.jsx(Wr, {
                action: "select:previous",
                context: "Select",
                fallback: "\u2191",
                description: "navigate"
              }), vr.jsx(Wr, {
                action: "select:accept",
                context: "Select",
                fallback: "Enter",
                description: "select"
              }), vr.jsx(Wr, {
                action: "confirm:no",
                context: "Settings",
                fallback: "Esc",
                description: "go back"
              })]
            })
          })
        })]
      });
    }
    if (typeof C === "object" && C.type === "failed-plugin-details") {
      let Ct = C.plugin;
      let hn = Ct.errors[0];
      let vn = hn ? AUe(hn) : "Failed to load";
      return vr.jsxs(gXd, {
        flexDirection: "column",
        children: [vr.jsxs(Text, {
          children: [vr.jsx(Text, {
            bold: true,
            children: Ct.name
          }), vr.jsxs(Text, {
            dimColor: true,
            children: [" @ ", Ct.marketplace]
          }), vr.jsxs(Text, {
            dimColor: true,
            children: [" (", Ct.scope, ")"]
          })]
        }), vr.jsx(Text, {
          color: "error",
          children: vn
        }), Ct.scope === "managed" ? vr.jsx(gXd, {
          marginTop: 1,
          children: vr.jsx(Text, {
            dimColor: true,
            children: "Managed by your organization \u2014 contact your admin"
          })
        }) : vr.jsxs(gXd, {
          marginTop: 1,
          children: [vr.jsxs(Text, {
            color: "suggestion",
            children: [vGd.pointer, " "]
          }), vr.jsx(Text, {
            bold: true,
            children: "Remove"
          })]
        }), re && vr.jsx(Text, {
          children: "Processing\u2026"
        }), vr.jsx(Hc, {
          error: ae
        }), UI(Ct.marketplace) && vr.jsx(gXd, {
          marginTop: 1,
          children: vr.jsx(Text, {
            dimColor: true,
            children: "This is a directory-loaded plugin \u2014 delete the directory to remove it; edits there take effect after /reload-plugins."
          })
        }), vr.jsx(gXd, {
          marginTop: 1,
          children: vr.jsx(Text, {
            dimColor: true,
            italic: true,
            children: vr.jsxs(Hn, {
              children: [Ct.scope !== "managed" && !UI(Ct.marketplace) && vr.jsx(Wr, {
                action: "select:accept",
                context: "Select",
                fallback: "Enter",
                description: "remove"
              }), vr.jsx(Wr, {
                action: "confirm:no",
                context: "Settings",
                fallback: "Esc",
                description: "go back"
              })]
            })
          })
        })]
      });
    }
    if (typeof C === "object" && C.type === "skill-detail") {
      let Ct = C.skill;
      let hn = [Ct.override, ...l8m.filter(zn => zn !== Ct.override)];
      let vn = zn => {
        if (zn === Ct.override) {
          return;
        }
        let {
          error: Pn
        } = updateSettingsForSource("localSettings", {
          skillOverrides: {
            [Ct.cmdName]: tVl(Ct, zn)
          }
        });
        if (Pn) {
          de(Pn.message);
          return;
        }
        ne(Lr => new Set(Lr).add(Ct.id));
        Q(Lr => Lr + 1);
        x({
          type: "skill-detail",
          skill: {
            ...Ct,
            override: zn
          }
        });
      };
      return vr.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [vr.jsx(Text, {
          bold: true,
          children: Ct.name
        }), Ct.description && vr.jsx(Text, {
          dimColor: true,
          children: Ct.description
        }), Ct.whenToUse && vr.jsxs(Text, {
          dimColor: true,
          children: ["When to use: ", Ct.whenToUse]
        }), vr.jsxs(Text, {
          dimColor: true,
          children: ["Source: ", Ct.source, " \xB7 ~", Ct.tokenEstimate, " tokens"]
        }), vr.jsxs(Text, {
          dimColor: true,
          children: ["Usage:", " ", Ct.usage ? `${Ct.usage.count}\xD7 \xB7 last used ${Ct.usage.daysSinceUse === 0 ? "today" : `${Ct.usage.daysSinceUse}d ago`}` : "never invoked"]
        }), Ct.allowedTools && Ct.allowedTools.length > 0 && vr.jsxs(Text, {
          dimColor: true,
          children: ["Allowed tools: ", Ct.allowedTools.join(", ")]
        }), Ct.skillRoot && vr.jsxs(Text, {
          dimColor: true,
          children: ["Path: ", Ct.skillRoot]
        }), Ct.lockSource === "policy" || Ct.lockSource === "flag" ? vr.jsxs(Text, {
          dimColor: true,
          children: ["State: ", Ct.override, " (locked by ", Ct.lockSource, " settings)"]
        }) : vr.jsxs(gXd, {
          flexDirection: "column",
          children: [vr.jsxs(Text, {
            children: ["State:", Ct.lockSource === "author" && vr.jsxs(Text, {
              dimColor: true,
              children: [" ", "(on/name-only locked by frontmatter disable-model-invocation)"]
            })]
          }), vr.jsx(_wt, {
            visibleCount: 4,
            onSelect: zn => {
              let Pn = hn[zn];
              if (Ct.lockSource === "author" && Pn !== "off") {
                vn("user-invocable-only");
                return;
              }
              vn(Pn);
            },
            children: hn.map(zn => {
              let Pn = Ct.lockSource === "author" && zn !== "user-invocable-only" && zn !== "off";
              return vr.jsx(_wt.Item, {
                children: vr.jsxs(Text, {
                  dimColor: Pn,
                  children: [zn === Ct.override ? vGd.radioOn : vGd.radioOff, " ", zn, Pn ? " (locked)" : ""]
                })
              }, zn);
            })
          }, Ct.override)]
        }), vr.jsxs(Hn, {
          children: [vr.jsx(xt, {
            chord: "Enter",
            action: "set state"
          }), vr.jsx(Text, {
            dimColor: true,
            children: " \xB7 "
          }), vr.jsx(xt, {
            chord: "Esc",
            action: "go back"
          })]
        })]
      });
    }
    if (typeof C === "object" && C.type === "mcp-detail") {
      let Ct = C.client;
      let hn = hpe(c, Ct.name).length;
      let vn = () => {
        x({
          type: "mcp-tools",
          client: Ct
        });
      };
      let zn = () => {
        x("plugin-list");
      };
      let Pn = Nn => {
        if (Nn) {
          t(Nn);
        }
        x("plugin-list");
      };
      let Lr = Ct.config.scope;
      let ao = Ct.config.type ?? "stdio";
      if (ao === "stdio") {
        let Nn = {
          name: Ct.name,
          client: Ct,
          scope: Lr,
          transport: "stdio",
          config: Ct.config
        };
        return vr.jsx(gZt, {
          server: Nn,
          serverToolsCount: hn,
          onViewTools: vn,
          onCancel: zn,
          onComplete: Pn,
          borderless: true
        });
      } else if (ao === "sse") {
        let Nn = {
          name: Ct.name,
          client: Ct,
          scope: Lr,
          transport: "sse",
          isAuthenticated: undefined,
          config: Ct.config
        };
        return vr.jsx(TYe, {
          server: Nn,
          serverToolsCount: hn,
          onViewTools: vn,
          onCancel: zn,
          onComplete: Pn,
          borderless: true
        });
      } else if (ao === "http") {
        let Nn = {
          name: Ct.name,
          client: Ct,
          scope: Lr,
          transport: "http",
          isAuthenticated: undefined,
          config: Ct.config
        };
        return vr.jsx(TYe, {
          server: Nn,
          serverToolsCount: hn,
          onViewTools: vn,
          onCancel: zn,
          onComplete: Pn,
          borderless: true
        });
      } else if (ao === "claudeai-proxy") {
        let Nn = {
          name: Ct.name,
          client: Ct,
          scope: Lr,
          transport: "claudeai-proxy",
          isAuthenticated: undefined,
          config: Ct.config
        };
        return vr.jsx(TYe, {
          server: Nn,
          serverToolsCount: hn,
          onViewTools: vn,
          onCancel: zn,
          onComplete: Pn,
          borderless: true
        });
      }
      return vr.jsxs(gXd, {
        flexDirection: "column",
        paddingX: 1,
        children: [vr.jsxs(Text, {
          color: "warning",
          children: ["No details view for ", Ct.name, " (transport: ", ao, ")."]
        }), vr.jsx(Hn, {
          children: vr.jsx(Wr, {
            action: "confirm:no",
            context: "Settings",
            fallback: "Esc",
            description: "go back"
          })
        })]
      });
    }
    if (typeof C === "object" && C.type === "mcp-tools") {
      let Ct = C.client;
      let hn = Ct.config.scope;
      let vn = Ct.config.type ?? "stdio";
      let zn;
      if (vn === "stdio") {
        zn = {
          name: Ct.name,
          client: Ct,
          scope: hn,
          transport: "stdio",
          config: Ct.config
        };
      } else if (vn === "sse") {
        zn = {
          name: Ct.name,
          client: Ct,
          scope: hn,
          transport: "sse",
          isAuthenticated: undefined,
          config: Ct.config
        };
      } else if (vn === "http") {
        zn = {
          name: Ct.name,
          client: Ct,
          scope: hn,
          transport: "http",
          isAuthenticated: undefined,
          config: Ct.config
        };
      } else {
        zn = {
          name: Ct.name,
          client: Ct,
          scope: hn,
          transport: "claudeai-proxy",
          isAuthenticated: undefined,
          config: Ct.config
        };
      }
      return vr.jsx(_Zt, {
        server: zn,
        onSelectTool: Pn => {
          x({
            type: "mcp-tool-detail",
            client: Ct,
            tool: Pn
          });
        },
        onBack: () => x({
          type: "mcp-detail",
          client: Ct
        })
      });
    }
    if (typeof C === "object" && C.type === "mcp-tool-detail") {
      let {
        client: Ct,
        tool: hn
      } = C;
      let vn = Ct.config.scope;
      let zn = Ct.config.type ?? "stdio";
      let Pn;
      if (zn === "stdio") {
        Pn = {
          name: Ct.name,
          client: Ct,
          scope: vn,
          transport: "stdio",
          config: Ct.config
        };
      } else if (zn === "sse") {
        Pn = {
          name: Ct.name,
          client: Ct,
          scope: vn,
          transport: "sse",
          isAuthenticated: undefined,
          config: Ct.config
        };
      } else if (zn === "http") {
        Pn = {
          name: Ct.name,
          client: Ct,
          scope: vn,
          transport: "http",
          isAuthenticated: undefined,
          config: Ct.config
        };
      } else {
        Pn = {
          name: Ct.name,
          client: Ct,
          scope: vn,
          transport: "claudeai-proxy",
          isAuthenticated: undefined,
          config: Ct.config
        };
      }
      return vr.jsx(yZt, {
        tool: hn,
        server: Pn,
        onBack: () => x({
          type: "mcp-tools",
          client: Ct
        })
      });
    }
    let bn = gt.getVisibleItems(Ye);
    return vr.jsxs(gXd, {
      flexDirection: "column",
      tabIndex: 0,
      autoFocus: true,
      onKeyDown: Dt,
      onPaste: jt,
      children: [vr.jsx(gXd, {
        marginBottom: 1,
        children: vr.jsx(YM, {
          query: A,
          isFocused: f,
          isTerminalFocused: y,
          width: S - 4,
          cursorOffset: I,
          onCursorOffsetChange: O,
          onFocus: () => h(true)
        })
      }), Ql() && vr.jsx(gXd, {
        marginBottom: 1,
        paddingLeft: 2,
        children: vr.jsxs(Text, {
          color: "warning",
          children: ["Safe mode: plugins are disabled this session \u2014 changes here save but won't load until safe mode is off.", " ", DD(UR()), " to re-enable."]
        })
      }), be && vr.jsx(gXd, {
        marginBottom: 1,
        paddingLeft: 2,
        children: vr.jsx(Text, {
          color: "success",
          children: be
        })
      }), Ye.length === 0 && A && vr.jsx(gXd, {
        marginBottom: 1,
        children: vr.jsxs(sc, {
          children: ['No items match "', A, '"']
        })
      }), gt.scrollPosition.canScrollUp && vr.jsx(gXd, {
        children: vr.jsxs(Text, {
          dimColor: true,
          children: [" ", vGd.arrowUp, " more above"]
        })
      }), bn.map((Ct, hn) => {
        let vn = gt.toActualIndex(hn);
        let zn = vn === It && !f;
        switch (Ct.kind) {
          case "spacer":
            return vr.jsx(gXd, {
              height: 1
            }, `spacer:${vn}`);
          case "section-header":
            return vr.jsx(gXd, {
              paddingLeft: 2,
              children: vr.jsx(Text, {
                dimColor: Ct.section !== "attention",
                color: Ct.section === "attention" ? "warning" : undefined,
                bold: true,
                children: Ct.section === "attention" ? "Needs attention" : Ct.section === "disused" ? "Not used recently" : "Favorites"
              })
            }, `section:${Ct.section}`);
          case "scope-header":
            return vr.jsx(gXd, {
              paddingLeft: 4,
              children: vr.jsx(Text, {
                dimColor: true,
                children: c8m(Ct.scope)
              })
            }, `scope:${vn}`);
          case "disabled-header":
            return vr.jsx(gXd, {
              paddingLeft: 2,
              children: vr.jsxs(Text, {
                color: zn ? "suggestion" : undefined,
                children: [zn ? `${vGd.pointer} ` : "  ", Be ? vGd.arrowDown : vGd.arrowRight, " Show", Ct.disabledCount > 0 && vr.jsxs(vr.Fragment, {
                  children: [" ", "disabled ", vr.jsxs(Text, {
                    dimColor: true,
                    children: ["(", Ct.disabledCount, ")"]
                  })]
                }), Ct.disabledCount > 0 && Ct.unusedConnectorCount > 0 && " \xB7", Ct.unusedConnectorCount > 0 && vr.jsxs(vr.Fragment, {
                  children: [" ", "unused claude.ai connectors", " ", vr.jsxs(Text, {
                    dimColor: true,
                    children: ["(", Ct.unusedConnectorCount, ")"]
                  })]
                })]
              })
            }, "section:disabled");
          case "item":
            return vr.jsx(Y8l, {
              item: Ct.item,
              isSelected: zn,
              health: Ct.item.type === "plugin" ? m?.get(Ct.item.name) : undefined
            }, `${Ct.section}:${Ct.item.id}`);
        }
      }), gt.scrollPosition.canScrollDown && vr.jsx(gXd, {
        children: vr.jsxs(Text, {
          dimColor: true,
          children: [" ", vGd.arrowDown, " more below"]
        })
      }), vr.jsx(gXd, {
        marginTop: 1,
        marginLeft: 1,
        children: vr.jsx(Text, {
          dimColor: true,
          italic: true,
          children: vr.jsxs(Hn, {
            children: [vr.jsx(Text, {
              children: "Type to search"
            }), vr.jsx(Wr, {
              action: "plugin:toggle",
              context: "Plugin",
              fallback: "Space",
              description: "toggle"
            }), vr.jsx(Wr, {
              action: "plugin:favorite",
              context: "Plugin",
              fallback: "f",
              description: "favorite"
            }), vr.jsx(Wr, {
              action: "select:accept",
              context: "Select",
              fallback: "Enter",
              description: "view"
            }), vr.jsx(Wr, {
              action: "confirm:no",
              context: "Settings",
              fallback: "Esc",
              description: "go back"
            })]
          })
        })
      }), ae && vr.jsx(gXd, {
        marginTop: 1,
        marginLeft: 1,
        children: vr.jsx(Hc, {
          error: ae
        })
      }), oe.size > 0 && vr.jsx(gXd, {
        marginLeft: 1,
        children: vr.jsx(Text, {
          dimColor: true,
          italic: true,
          children: "Run /reload-plugins to apply changes"
        })
      })]
    });
  }
  var S4o;
  var rVl;
  var b4o;
  var bu;
  var vr;
  var l8m;
  var sVl = __lazy(() => {
    Sd();
    Loe();
    Ai();
    xb();
    bv();
    bs();
    l4o();
    yar();
    bar();
    Tar();
    Ear();
    Cfe();
    rE();
    sie();
    ki();
    et();
    Bs();
    ln();
    $n();
    Ot();
    P8l();
    l9();
    Hfe();
    G1();
    ywt();
    aU();
    ho();
    cV();
    ky();
    je();
    gn();
    dt();
    Rn();
    p5();
    Qk();
    yT();
    Lft();
    k1();
    Yar();
    Kf();
    m4o();
    xg();
    a9();
    Xk();
    CYe();
    nf();
    Zn();
    Xar();
    Wk();
    f4o();
    Y3o();
    Dar();
    z8l();
    J8l();
    eVl();
    $ar();
    S4o = __toESM(pt(), 1);
    rVl = __toESM(require("fs/promises"));
    b4o = __toESM(require("path"));
    bu = __toESM(ot(), 1);
    vr = __toESM(ie(), 1);
    l8m = ["on", "name-only", "user-invocable-only", "off"];
  });
  function iVl(e) {
    if (!e) {
      return {
        type: "menu"
      };
    }
    let t = e.trim().split(/\s+/);
    switch (t[0]?.toLowerCase()) {
      case "help":
      case "--help":
      case "-h":
        return {
          type: "help"
        };
      case "list":
      case "ls":
        {
          let r = t.slice(1).find(o => o === "--enabled" || o === "--disabled");
          if (r) {
            return {
              type: "list",
              filter: r === "--enabled" ? "enabled" : "disabled"
            };
          }
          return {
            type: "list"
          };
        }
      case "install":
      case "i":
        {
          let r = t[1];
          if (!r) {
            return {
              type: "install"
            };
          }
          let o = r.lastIndexOf("@");
          if (o > 0) {
            let i = r.slice(0, o);
            let a = r.slice(o + 1);
            return {
              type: "install",
              plugin: i,
              marketplace: a
            };
          }
          if (!r.startsWith("@") && (r.startsWith("http://") || r.startsWith("https://") || r.startsWith("file://") || r.includes("/") || r.includes("\\"))) {
            return {
              type: "install",
              marketplace: r
            };
          }
          return {
            type: "install",
            plugin: r
          };
        }
      case "manage":
        return {
          type: "manage"
        };
      case "uninstall":
        return {
          type: "uninstall",
          plugin: t[1]
        };
      case "enable":
        return {
          type: "enable",
          plugin: t[1]
        };
      case "disable":
        return {
          type: "disable",
          plugin: t[1]
        };
      case "configure":
      case "config":
        return {
          type: "configure",
          plugin: t[1]
        };
      case "validate":
        return {
          type: "validate",
          path: t.slice(1).join(" ").trim() || undefined
        };
      case "eval":
        return {
          type: "menu"
        };
      case "tag":
        {
          let r = new Set(["--push", "--dry-run", "--force", "-f"]);
          let o = t.slice(1);
          let s = o.filter(l => l.startsWith("-"));
          let i = o.filter(l => !l.startsWith("-"));
          let a = s.find(l => !r.vZc(l)) ?? i[1];
          return {
            type: "tag",
            path: i[0],
            push: s.includes("--push"),
            dryRun: s.includes("--dry-run"),
            force: s.includes("--force") || s.includes("-f"),
            ...(a !== undefined && {
              unknownFlag: a
            })
          };
        }
      case "marketplace":
      case "market":
        {
          let r = t[1]?.toLowerCase();
          let o = t.slice(2).join(" ");
          switch (r) {
            case "add":
              return {
                type: "marketplace",
                action: "add",
                target: o
              };
            case "remove":
            case "rm":
              return {
                type: "marketplace",
                action: "remove",
                target: o
              };
            case "update":
              return {
                type: "marketplace",
                action: "update",
                target: o
              };
            case "list":
              return {
                type: "marketplace",
                action: "list"
              };
            default:
              return {
                type: "marketplace"
              };
          }
        }
      default:
        return {
          type: "menu"
        };
    }
  }
  function uVl(e, t) {
    let n = e.every(o => o.success);
    let r = e.some(o => o.warnings.length > 0);
    return {
      noErrors: n,
      hasWarnings: r,
      allSuccess: t.strict ? n && !r : n
    };
  }
  function aVl(e) {
    try {
      new RegExp(e);
      return true;
    } catch {
      return false;
    }
  }
  function Qar(e) {
    return e === null ? "null" : Array.isArray(e) ? "array" : typeof e;
  }
  function y8m(e) {
    let t = lh.basename(e);
    let n = lh.basename(lh.dirname(e));
    if (t === "plugin.json") {
      return "plugin";
    }
    if (t === "marketplace.json") {
      return "marketplace";
    }
    if (n === ".claude-plugin") {
      return "plugin";
    }
    return "unknown";
  }
  function dVl(e) {
    return e.issues.map(t => ({
      path: t.path.join(".") || "root",
      message: t.message,
      code: t.code
    }));
  }
  function _8m(e, t) {
    if (lVl.vZc(e)) {
      return;
    }
    let n = e.length <= 3 ? 1 : 2;
    let r = e.toLowerCase();
    let o;
    let s = n + 1;
    for (let i of t) {
      if (Math.abs(i.length - e.length) > n) {
        continue;
      }
      if (i.toLowerCase() === r) {
        return i;
      }
      let a = cSt(e, i);
      if (a < s) {
        s = a;
        o = i;
      }
    }
    return o;
  }
  function b8m(e, t, n) {
    if (n?.vZc(e)) {
      return `Field '${e}' belongs in the marketplace entry (marketplace.json), ` + "not plugin.json. It's harmless here but unused \u2014 Claude Code " + "ignores it at load time.";
    }
    let r = _8m(e, t);
    if (r) {
      return `Unknown field '${e}' \u2014 did you mean '${r}'? Claude Code ignores unrecognized fields at load time, so this field has no effect.`;
    }
    let o = h8m.get(e);
    if (o && t.vZc(o)) {
      return `Field '${e}' is the cross-tool spelling of Claude Code's '${o}'. Rename it to '${o}' for Claude Code to read it (the option ` + "shapes differ slightly \u2014 re-run validate after renaming to check). " + "As-is, Claude Code ignores it at load time.";
    }
    let s = lVl.get(e);
    if (s) {
      return `Unknown field '${e}' (commonly seen in ${s}). Claude Code ignores unrecognized fields at load time, so it's safe to keep.`;
    }
    return `Unknown field '${e}'. Claude Code ignores it at load time.`;
  }
  function IUe(e, t, n, r, o) {
    for (let s of Object.keys(e)) {
      if (t.vZc(s)) {
        continue;
      }
      r.push({
        path: n ? `${n}.${s}` : s,
        message: b8m(s, t, o)
      });
    }
  }
  function v4o(e, t, n, r) {
    if (e.includes("..")) {
      n.push({
        path: t,
        message: r ? `Path contains "..": ${e}. ${r}` : `Path contains ".." which could be a path traversal attempt: ${e}`
      });
    }
  }
  function S8m(e) {
    let t = e.replace(/^(\.\.\/)+/, "");
    return `Plugin source paths are resolved relative to the marketplace root (the directory containing .claude-plugin/), not relative to marketplace.json. Use "${t !== e ? `./${t}` : "./plugins/my-plugin"}" instead of "${e}".`;
  }
  async function Twt(e) {
    let t = [];
    let n = [];
    let r = lh.resolve(e);
    let o;
    try {
      o = await gK.readFile(r, {
        encoding: "utf-8"
      });
    } catch (l) {
      let c = en(l);
      let u;
      if (c === "ENOENT") {
        u = `File not found: ${r}`;
      } else if (c === "EISDIR") {
        u = `Path is not a file: ${r}`;
      } else {
        u = `Failed to read file: ${he(l)}`;
      }
      return {
        success: false,
        errors: [{
          path: "file",
          message: u,
          code: c
        }],
        warnings: [],
        filePath: r,
        fileType: "plugin"
      };
    }
    let s;
    try {
      s = qt(o);
    } catch (l) {
      return {
        success: false,
        errors: [{
          path: "json",
          message: `Invalid JSON syntax: ${he(l)}`
        }],
        warnings: [],
        filePath: r,
        fileType: "plugin"
      };
    }
    let i = IGe(s, "plugin-json", {
      pluginName: lh.basename(lh.dirname(lh.dirname(r))),
      manifestPath: r
    });
    if (!i.ok) {
      t.push(...i.errors.map(l => ({
        ...l,
        path: l.path || "root"
      })));
    }
    if (s && typeof s === "object") {
      let l = i.rawCandidate ?? s;
      let c = lh.dirname(r);
      let u = lh.basename(c) === ".claude-plugin" ? lh.dirname(c) : c;
      let d = async (p, m) => {
        if (v4o(p, m, t), p.includes("..") || lh.isAbsolute(p)) {
          return;
        }
        try {
          return await gK.stat(lh.resolve(u, p));
        } catch (f) {
          let h = en(f);
          t.push({
            path: m,
            message: `Path not found: ${p}${h && h !== "ENOENT" ? ` (${h})` : ""}. The runtime loader will report this as a load failure.`
          });
          return;
        }
      };
      if (l.commands) {
        if (typeof l.commands === "string") {
          await d(l.commands, "commands");
        } else if (Array.isArray(l.commands)) {
          for (let [p, m] of l.commands.entries()) {
            if (typeof m === "string") {
              await d(m, `commands[${p}]`);
            }
          }
        } else if (typeof l.commands === "object") {
          for (let [p, m] of Object.entries(l.commands)) {
            if (m && typeof m === "object" && "source" in m && typeof m.source === "string") {
              await d(m.source, `commands.${p}.source`);
            }
          }
        }
      }
      if (l.hooks) {
        let p = Array.isArray(l.hooks) ? l.hooks : [l.hooks];
        for (let [m, f] of p.entries()) {
          if (typeof f === "string") {
            await d(f, `hooks[${m}]`);
          }
        }
      }
      if (l.agents) {
        let p = Array.isArray(l.agents) ? l.agents : [l.agents];
        for (let [m, f] of p.entries()) {
          if (typeof f === "string") {
            await d(f, `agents[${m}]`);
          }
        }
      }
      if (l.skills) {
        let p = Array.isArray(l.skills) ? l.skills : [l.skills];
        for (let [m, f] of p.entries()) {
          if (typeof f !== "string") {
            continue;
          }
          let h = await d(f, `skills[${m}]`);
          if (h && !h.isDirectory()) {
            let g = lh.dirname(f);
            let y = lh.basename(f).toLowerCase() === "skill.md" && g !== "." ? ` \u2014 point to the parent directory '${g}' instead` : "";
            t.push({
              path: `skills[${m}]`,
              message: `Path is a file; skills entries must be directories containing SKILL.md${y}: ${f}`
            });
          }
        }
      }
      if (l.workflows) {
        let p = Array.isArray(l.workflows) ? l.workflows : [l.workflows];
        for (let [m, f] of p.entries()) {
          if (typeof f === "string") {
            await d(f, `workflows[${m}]`);
          }
        }
      }
    }
    if (typeof s === "object" && s !== null && !Array.isArray(s)) {
      let l = s;
      let c = i.rawCandidate ?? l;
      IUe(c, new Set(Object.keys(Cje().shape)), "", n, f8m);
      for (let u of g8m) {
        if (u in l) {
          n.push({
            path: u,
            message: `'${u}' is an experimental component; declare it under 'experimental.${u}' instead of at the top level. Top-level still loads for now but will be removed in a future release.`
          });
        }
      }
      if ("experimental" in l) {
        if (typeof l.experimental === "object" && l.experimental !== null && !Array.isArray(l.experimental)) {
          let u = l.experimental;
          IUe(u, cVl, "experimental", n);
        } else {
          n.push({
            path: "experimental",
            message: `'experimental' must be an object containing component declarations; got ${Qar(l.experimental)}. It will be ignored at load time.`
          });
        }
      }
      if ("binaries" in l) {
        if (typeof l.binaries === "object" && l.binaries !== null && !Array.isArray(l.binaries)) {
          let u = UMt(l.binaries) ?? {};
          for (let p of Object.keys(l.binaries)) {
            if (!Object.hasOwn(u, p)) {
              n.push({
                path: `binaries.${p}`,
                message: `Invalid binaries entry; it will be ignored at install time. The basename must match ${String(V1r)} (lowercase, no leading or trailing dot) and the value must be an object with a 64-character lowercase-hex 'sha256'.`
              });
            }
          }
          let d = Object.keys(u).length;
          if (d > 16) {
            n.push({
              path: "binaries",
              message: `${d} valid binaries entries declared, but only the first ${16} are fetched at install time; the rest are ignored. Reduce the count or split across plugins.`
            });
          }
        } else {
          n.push({
            path: "binaries",
            message: `'binaries' must be an object mapping basenames to { sha256 }; got ${Qar(l.binaries)}. It will be ignored at install time.`
          });
        }
      }
    }
    let a = i.manifest;
    if (a) {
      let l = a;
      if (!/^[a-z0-9]+(-[a-z0-9]+)*$/.test(l.name)) {
        n.push({
          path: "name",
          message: `Plugin name "${l.name}" is not kebab-case. Claude Code accepts it, but the Claude.ai marketplace sync requires kebab-case (lowercase letters, digits, and hyphens only, e.g., "my-plugin").`
        });
      }
      if (!l.version) {
        n.push({
          path: "version",
          message: 'No version specified. Consider adding a version following semver (e.g., "1.0.0")'
        });
      }
      if (!l.description) {
        n.push({
          path: "description",
          message: "No description provided. Adding a description helps users understand what your plugin does"
        });
      }
      if (!l.author) {
        n.push({
          path: "author",
          message: "No author information provided. Consider adding author details for plugin attribution"
        });
      }
    }
    return {
      success: t.length === 0,
      errors: t,
      warnings: n,
      filePath: r,
      fileType: "plugin"
    };
  }
  async function T4o(e) {
    let t = [];
    let n = [];
    let r = lh.resolve(e);
    let o;
    try {
      o = await gK.readFile(r, {
        encoding: "utf-8"
      });
    } catch (f) {
      let h = en(f);
      let g;
      if (h === "ENOENT") {
        g = `File not found: ${r}`;
      } else if (h === "EISDIR") {
        g = `Path is not a file: ${r}`;
      } else {
        g = `Failed to read file: ${he(f)}`;
      }
      return {
        success: false,
        errors: [{
          path: "file",
          message: g,
          code: h
        }],
        warnings: [],
        filePath: r,
        fileType: "marketplace"
      };
    }
    let s;
    try {
      s = qt(o);
    } catch (f) {
      return {
        success: false,
        errors: [{
          path: "json",
          message: `Invalid JSON syntax: ${he(f)}`
        }],
        warnings: [],
        filePath: r,
        fileType: "marketplace"
      };
    }
    let i = [];
    if (s && typeof s === "object") {
      let f = s;
      if (Array.isArray(f.plugins)) {
        i = f.plugins;
        f.plugins.forEach((h, g) => {
          if (h && typeof h === "object" && "source" in h) {
            let y = h.source;
            if (typeof y === "string") {
              v4o(y, `plugins[${g}].source`, t, S8m(y));
            }
            if (y && typeof y === "object" && "path" in y && typeof y.path === "string") {
              v4o(y.path, `plugins[${g}].source.path`, t);
            }
          }
        });
      }
    }
    let a = Tyn().extend({
      topic: v.string().min(1).max(64).optional(),
      signals: Syn().extend({
        cli: v.array(v.string().min(1).max(64)).max(10).optional(),
        hosts: v.array(v.string().min(1).max(128).refine(f => /^[a-z0-9.-]+$/.test(f), "must be a lowercase bare hostname (no scheme, port, or path)")).max(20).optional(),
        filesRead: v.array(v.string().min(1).max(256).refine(f => !f.includes("\\"), 'must use forward slashes (e.g. "**/*.tf"), not backslashes')).max(10).optional(),
        manifestDeps: v.array(v.object({
          file: v.string().min(1).max(256).refine(aVl, "must be a valid regular expression"),
          pattern: v.string().min(1).max(256).refine(aVl, "must be a valid regular expression")
        })).min(1).max(10).optional(),
        cwd: v.array(v.string().min(1).max(256).refine(f => !f.includes("\\"), 'must use forward slashes (e.g. "Engine/Source/**"), not backslashes')).max(10).optional()
      }).refine(f => (f.cli?.length ?? 0) > 0 || (f.hosts?.length ?? 0) > 0 || (f.filesRead?.length ?? 0) > 0 || (f.manifestDeps?.length ?? 0) > 0 || (f.cwd?.length ?? 0) > 0, "must declare at least one signal (cli, hosts, filesRead, manifestDeps, or cwd)")
    }).optional();
    let l = $Mt().extend({
      relevance: v.preprocess(f => typeof f === "object" && f !== null && !Array.isArray(f) ? f : undefined, a)
    }).refine(f => typeof f.source === "string" || f.source.source !== "unsupported", {
      message: "source.source: 'unsupported' is a parse-time placeholder and cannot be authored"
    });
    let u = fY().extend({
      plugins: v.array(l),
      renames: v.record(v.string(), v.string().nullable()).optional()
    }).safeParse(s);
    if (!u.success) {
      t.push(...dVl(u.error));
    }
    if (u.success && u.data.renames) {
      let f = new Set(u.data.plugins.map(h => h.name));
      for (let h of Object.keys(u.data.renames)) {
        let g = ivt(h, u.data.renames, f);
        if (g?.kind === "unresolved") {
          t.push({
            path: `renames.${h}`,
            message: `chain does not resolve (${g.reason}) \u2014 target must be a name in plugins[], a key in renames, or null`
          });
        } else if (g?.kind === "renamed" && !Dye().safeParse(`${g.to}@placeholder`).success) {
          t.push({
            path: `renames.${h}`,
            message: `target "${g.to}" is not a valid plugin name (PluginIdSchema)`
          });
        }
      }
    }
    if (typeof s === "object" && s !== null && !Array.isArray(s)) {
      let f = s;
      IUe(f, new Set(Object.keys(fY().shape)), "", n);
      let h = f.metadata;
      if (typeof h === "object" && h !== null && !Array.isArray(h)) {
        IUe(h, new Set(Object.keys(fY().shape.metadata.unwrap().shape)), "metadata", n);
      }
      if (Array.isArray(f.plugins)) {
        let g = new Set(Object.keys($Mt().shape));
        let y = new Set(Object.keys(Tyn().shape));
        let _ = new Set(Object.keys(Syn().shape));
        f.plugins.forEach((b, S) => {
          if (typeof b !== "object" || b === null || Array.isArray(b)) {
            return;
          }
          let E = b;
          IUe(E, g, `plugins[${S}]`, n);
          let C = E.experimental;
          if (typeof C === "object" && C !== null && !Array.isArray(C)) {
            IUe(C, cVl, `plugins[${S}].experimental`, n);
          } else if (C !== undefined) {
            n.push({
              path: `plugins[${S}].experimental`,
              message: `'experimental' must be an object containing component declarations; got ${Qar(C)}. It will be ignored at load time.`
            });
          }
          let x = E.relevance;
          if (typeof x === "object" && x !== null && !Array.isArray(x)) {
            IUe(x, y, `plugins[${S}].relevance`, n);
            let A = x.signals;
            if (typeof A === "object" && A !== null && !Array.isArray(A)) {
              IUe(A, _, `plugins[${S}].relevance.signals`, n);
            }
          } else if (x !== undefined) {
            n.push({
              path: `plugins[${S}].relevance`,
              message: `'relevance' must be an object containing topic and signals; got ${Qar(x)}. It will be ignored at load time.`
            });
          }
        });
      }
    }
    if (u.success) {
      let f = u.data;
      if (!f.plugins || f.plugins.length === 0) {
        n.push({
          path: "plugins",
          message: "Marketplace has no plugins defined"
        });
      }
      if (f.plugins) {
        f.plugins.forEach((h, g) => {
          if (f.plugins.filter(_ => _.name === h.name).length > 1) {
            t.push({
              path: `plugins[${g}].name`,
              message: `Duplicate plugin name "${h.name}" found in marketplace`
            });
          }
        });
      }
      if (!f.description && !f.metadata?.description) {
        n.push({
          path: "description",
          message: "No marketplace description provided. Adding a description helps users understand what this marketplace offers"
        });
      }
    }
    let d = $Mt();
    let p = lh.dirname(r);
    let m = lh.basename(p) === ".claude-plugin" ? lh.dirname(p) : p;
    for (let [f, h] of i.entries()) {
      let g = d.safeParse(h);
      if (!g.success) {
        continue;
      }
      let y = g.data;
      let _ = y.source;
      if (!Rje(_) || _.includes("..")) {
        continue;
      }
      let b = lh.join(m, _);
      let S = lh.join(b, ".claude-plugin", "plugin.json");
      if (y.version) {
        let x;
        try {
          let A = await gK.readFile(S, {
            encoding: "utf-8"
          });
          try {
            let k = qt(A);
            if (typeof k.version === "string") {
              x = k.version;
            }
          } catch (k) {
            n.push({
              path: `plugins[${f}].source`,
              message: `Could not parse ${lh.relative(m, S)} for version cross-check: ${he(k)}`
            });
          }
        } catch (A) {
          if (!fn(A) && en(A) !== "ENOTDIR") {
            n.push({
              path: `plugins[${f}].source`,
              message: `Could not read ${lh.relative(m, S)} for version cross-check: ${he(A)}`
            });
          }
        }
        if (x && x !== y.version) {
          let A = lh.relative(m, S);
          n.push({
            path: `plugins[${f}].version`,
            message: `Entry declares version "${y.version}" but ${A} says "${x}". ` + "At install time, plugin.json wins (calculatePluginVersion precedence) \u2014 the entry version is silently ignored. " + `Update this entry to "${x}" to match.`
          });
        }
      }
      let E = await Twt(S);
      if (E.errors.length === 1 && E.errors[0]?.code === "ENOENT") {
        continue;
      }
      let C = `plugins[${f}] plugin.json \u2192 `;
      for (let x of E.errors) {
        t.push({
          ...x,
          path: C + x.path
        });
      }
      for (let x of E.warnings) {
        n.push({
          ...x,
          path: C + x.path
        });
      }
    }
    return {
      success: t.length === 0,
      errors: t,
      warnings: n,
      filePath: r,
      fileType: "marketplace"
    };
  }
  function T8m(e, t, n) {
    let r = [];
    let o = [];
    let s = t.match(Kne);
    if (!s) {
      o.push({
        path: "frontmatter",
        message: "No frontmatter block found. Add YAML frontmatter between --- delimiters at the top of the file to set description and other metadata."
      });
      return {
        success: true,
        errors: r,
        warnings: o,
        filePath: e,
        fileType: n
      };
    }
    let i = s[1] || "";
    let a;
    try {
      a = Zj(i);
    } catch (d) {
      r.push({
        path: "frontmatter",
        message: `YAML frontmatter failed to parse: ${he(d)}. At runtime this ${n} loads with empty metadata (all frontmatter fields silently dropped).`
      });
      return {
        success: false,
        errors: r,
        warnings: o,
        filePath: e,
        fileType: n
      };
    }
    if (a === null || typeof a !== "object" || Array.isArray(a)) {
      r.push({
        path: "frontmatter",
        message: `Frontmatter must be a YAML mapping (key: value pairs), got ${Array.isArray(a) ? "an array" : a === null ? "null" : typeof a}.`
      });
      return {
        success: false,
        errors: r,
        warnings: o,
        filePath: e,
        fileType: n
      };
    }
    let l = a;
    if (l.description !== undefined) {
      let d = l.description;
      if (typeof d !== "string" && typeof d !== "number" && typeof d !== "boolean" && d !== null) {
        r.push({
          path: "description",
          message: `description must be a string, got ${Array.isArray(d) ? "array" : typeof d}. At runtime this value is dropped.`
        });
      }
    } else {
      o.push({
        path: "description",
        message: `No description in frontmatter. A description helps users and Claude understand when to use this ${n}.`
      });
    }
    if (l.name !== undefined && l.name !== null && typeof l.name !== "string") {
      r.push({
        path: "name",
        message: `name must be a string, got ${typeof l.name}.`
      });
    }
    let c = l["allowed-tools"];
    if (c !== undefined && c !== null) {
      if (typeof c !== "string" && !Array.isArray(c)) {
        r.push({
          path: "allowed-tools",
          message: `allowed-tools must be a string or array of strings, got ${typeof c}.`
        });
      } else if (Array.isArray(c) && c.some(d => typeof d !== "string")) {
        r.push({
          path: "allowed-tools",
          message: "allowed-tools array must contain only strings."
        });
      }
    }
    let u = l.shell;
    if (u !== undefined && u !== null) {
      if (typeof u !== "string") {
        r.push({
          path: "shell",
          message: `shell must be a string, got ${typeof u}.`
        });
      } else {
        let d = u.trim().toLowerCase();
        if (d !== "bash" && d !== "powershell") {
          r.push({
            path: "shell",
            message: `shell must be 'bash' or 'powershell', got '${u}'.`
          });
        }
      }
    }
    return {
      success: r.length === 0,
      errors: r,
      warnings: o,
      filePath: e,
      fileType: n
    };
  }
  async function E8m(e) {
    let t;
    try {
      t = await gK.readFile(e, {
        encoding: "utf-8"
      });
    } catch (o) {
      if (en(o) === "ENOENT") {
        return {
          success: true,
          errors: [],
          warnings: [],
          filePath: e,
          fileType: "hooks"
        };
      }
      return {
        success: false,
        errors: [{
          path: "file",
          message: `Failed to read file: ${he(o)}`
        }],
        warnings: [],
        filePath: e,
        fileType: "hooks"
      };
    }
    let n;
    try {
      n = qt(t);
    } catch (o) {
      return {
        success: false,
        errors: [{
          path: "json",
          message: `Invalid JSON syntax: ${he(o)}. At runtime this breaks the entire plugin load.`
        }],
        warnings: [],
        filePath: e,
        fileType: "hooks"
      };
    }
    let r = byn().safeParse(n);
    if (!r.success) {
      return {
        success: false,
        errors: dVl(r.error),
        warnings: [],
        filePath: e,
        fileType: "hooks"
      };
    }
    return {
      success: true,
      errors: [],
      warnings: [],
      filePath: e,
      fileType: "hooks"
    };
  }
  async function pVl(e, t) {
    let n;
    try {
      n = await gK.readdir(e, {
        withFileTypes: true
      });
    } catch (o) {
      let s = en(o);
      if (s === "ENOENT" || s === "ENOTDIR") {
        return [];
      }
      throw o;
    }
    if (t) {
      return n.filter(o => o.isDirectory()).map(o => lh.join(e, o.name, "SKILL.md"));
    }
    let r = [];
    for (let o of n) {
      let s = lh.join(e, o.name);
      if (o.isDirectory()) {
        r.push(...(await pVl(s, false)));
      } else if (o.isFile() && o.name.toLowerCase().endsWith(".md")) {
        r.push(s);
      }
    }
    return r;
  }
  async function Zar(e) {
    let t = [];
    let n = new Set(["claude.md", "claude.local.md"]);
    let r = [];
    try {
      r = await gK.readdir(e, {
        withFileTypes: true
      });
    } catch {}
    for (let i of r) {
      if (!i.isFile() || !n.vZc(i.name.toLowerCase())) {
        continue;
      }
      let l = i.name.toLowerCase() === "claude.local.md" ? "Remove it from the plugin root." : "To ship context with your plugin, use a skill (skills/<name>/SKILL.md) instead.";
      t.push({
        success: true,
        errors: [],
        warnings: [{
          path: "root",
          message: `${i.name} at the plugin root is not loaded as project context. ${l}`
        }],
        filePath: lh.join(e, i.name),
        fileType: "plugin"
      });
    }
    let o = [["skill", lh.join(e, "skills")], ["agent", lh.join(e, "agents")], ["command", lh.join(e, "commands")]];
    for (let [i, a] of o) {
      let l = await pVl(a, i === "skill");
      for (let c of l) {
        let u;
        try {
          u = await gK.readFile(c, {
            encoding: "utf-8"
          });
        } catch (p) {
          if (fn(p)) {
            continue;
          }
          t.push({
            success: false,
            errors: [{
              path: "file",
              message: `Failed to read: ${he(p)}`
            }],
            warnings: [],
            filePath: c,
            fileType: i
          });
          continue;
        }
        let d = T8m(c, u, i);
        if (d.errors.length > 0 || d.warnings.length > 0) {
          t.push(d);
        }
      }
    }
    let s = await E8m(lh.join(e, "hooks", "hooks.json"));
    if (s.errors.length > 0 || s.warnings.length > 0) {
      t.push(s);
    }
    return t;
  }
  async function kZt(e) {
    let t = lh.resolve(e);
    let n = null;
    try {
      n = await gK.stat(t);
    } catch (o) {
      if (!fn(o)) {
        throw o;
      }
    }
    if (n?.isDirectory()) {
      let o = lh.join(t, ".claude-plugin", "marketplace.json");
      let s = await T4o(o);
      let i = s.errors[0];
      if (!(i?.path === "file" && (i.code === "ENOENT" || i.code === "ENOTDIR"))) {
        return s;
      }
      let l = lh.join(t, ".claude-plugin", "plugin.json");
      let c = await Twt(l);
      let u = c.errors[0]?.code;
      if (u !== "ENOENT" && u !== "ENOTDIR") {
        return c;
      }
      return {
        success: false,
        errors: [{
          path: "directory",
          message: "No manifest found in directory. Expected .claude-plugin/marketplace.json or .claude-plugin/plugin.json"
        }],
        warnings: [],
        filePath: t,
        fileType: "plugin"
      };
    }
    switch (y8m(e)) {
      case "plugin":
        return Twt(e);
      case "marketplace":
        return T4o(e);
      case "unknown":
        {
          try {
            let o = await gK.readFile(t, {
              encoding: "utf-8"
            });
            let s = qt(o);
            if (Array.isArray(s.plugins)) {
              return T4o(e);
            }
          } catch (o) {
            if (en(o) === "ENOENT") {
              return {
                success: false,
                errors: [{
                  path: "file",
                  message: `File not found: ${t}`
                }],
                warnings: [],
                filePath: t,
                fileType: "plugin"
              };
            }
          }
          return Twt(e);
        }
    }
  }
  var gK;
  var lh;
  var f8m;
  var lVl;
  var h8m;
  var g8m;
  var cVl;
  var elr = __lazy(() => {
    dt();
    fv();
    PFn();
    Bor();
    TC();
    U$o();
    gK = require("fs/promises");
    lh = __toESM(require("path"));
    f8m = new Set(["category", "source", "tags", "strict", "id", "relevance"]);
    lVl = new Map([["publisher", "a VS Code/Cursor extension manifest"], ["engines", "a VS Code/Cursor extension manifest"], ["categories", "a VS Code/Cursor extension manifest"], ["icon", "a VS Code/Cursor extension manifest"], ["contributes", "a VS Code/Cursor extension manifest"], ["activationEvents", "a VS Code/Cursor extension manifest"], ["preview", "a VS Code/Cursor extension manifest"], ["main", "an npm package.json"], ["type", "an npm package.json"], ["files", "an npm package.json"], ["bin", "an npm package.json"], ["scripts", "an npm package.json"], ["private", "an npm package.json"], ["bugs", "an npm package.json"], ["contributors", "an npm package.json"], ["dxt_version", "an MCPB/DXT manifest"], ["mcpb_version", "an MCPB/DXT manifest"], ["user_config", "an MCPB/DXT manifest"], ["compatibility", "an MCPB/DXT manifest"], ["server", "an MCP server manifest"], ["tools", "an MCP server manifest"], ["prompts", "an MCP server manifest"], ["resources", "an MCP server manifest"], ["logo", "manifests across many tools"], ["readme", "manifests across many tools"], ["changelog", "manifests across many tools"], ["support", "manifests across many tools"], ["privacy_policy", "manifests across many tools"], ["privacy_policies", "manifests across many tools"], ["terms_of_service", "manifests across many tools"], ["_comment", "manifests across many tools"], ["$id", "a JSON Schema document"], ["$comment", "a JSON Schema document"]]);
    h8m = new Map([["user_config", "userConfig"]]);
    g8m = ["monitors", "themes"];
    cVl = new Set(["themes", "monitors", "outputStyles", "evals", "syntaxHighlighting"]);
  });
  async function tlr(e, t = {}) {
    let n = [];
    let r = await v8m(e);
    if (!r.ok) {
      return {
        ok: false,
        error: r.error,
        warnings: n
      };
    }
    let {
      pluginRoot: o,
      manifestPath: s,
      manifest: i
    } = r;
    let a = await Twt(s);
    let l = [a];
    if (a.success) {
      l.push(...(await Zar(o)));
    }
    for (let y of l) {
      for (let _ of y.warnings) {
        n.push(`${yA.relative(Nt(), y.filePath)}: ${_.message}`);
      }
    }
    let c = l.find(y => !y.success);
    if (c) {
      let y = c.errors.map(_ => `  ${_.path}: ${_.message}`).join(`
`);
      return {
        ok: false,
        error: `Plugin validation failed for ${c.filePath}:
${y}`,
        warnings: n
      };
    }
    let u = i.name;
    if (typeof u !== "string" || u.length === 0) {
      return {
        ok: false,
        error: `plugin.json at ${s} has no "name" field`,
        warnings: n
      };
    }
    let d = await w8m(o, u);
    let p = typeof i.version === "string" && i.version.length > 0 ? i.version : undefined;
    let m;
    let f;
    if (p !== undefined) {
      m = p;
      f = "plugin.json";
    } else if (d?.entry.version) {
      m = d.entry.version;
      f = "marketplace entry";
    } else {
      return {
        ok: false,
        error: `No version to tag. Set "version" in ${yA.relative(Nt(), s)}` + (d ? ` or in the marketplace entry at ${yA.relative(Nt(), d.path)} plugins[${d.entryIndex}].` : ".") + " Tags are only used for dependency version constraints, which require an explicit semver \u2014 the git-SHA fallback does not need a tag.",
        warnings: n
      };
    }
    if (d?.entry.version && p !== undefined && d.entry.version !== p) {
      return {
        ok: false,
        error: `Version mismatch: plugin.json says "${p}" but ${yA.relative(Nt(), d.path)} plugins[${d.entryIndex}].version says "${d.entry.version}". plugin.json wins at install time, so update the marketplace entry to "${p}" (or remove it) before tagging.`,
        warnings: n
      };
    }
    if (mVl.valid(m) === null) {
      return {
        ok: false,
        error: `Version "${m}" is not valid semver. Dependency resolution (resolveVersionRange) ignores tags whose suffix doesn't parse as semver, so this tag would never be selected.`,
        warnings: n
      };
    }
    let h = XBl(u, m);
    if (!wae(h)) {
      return {
        ok: false,
        error: `Computed tag name "${h}" is not a valid git ref. Check the plugin name for characters git rejects (spaces, ~, ^, :, ?, *, [, \\, or sequences like .., @{, //).`,
        warnings: n
      };
    }
    let g = findGitRoot(o);
    if (g === null) {
      return {
        ok: false,
        error: `${o} is not inside a git repository. Dependency tags are resolved via git ls-remote, so the plugin must live in a git repo.`,
        warnings: n
      };
    }
    if (!t.force) {
      let y = await k8m(g, d ? [o, d.path] : [o]);
      if (y.length > 0) {
        let _ = y.slice(0, 5).join(`
  `);
        let b = y.length > 5 ? `
  \u2026and ${y.length - 5} more` : "";
        return {
          ok: false,
          error: `Uncommitted changes affecting this release \u2014 commit them first so the tag points at the version you intend to release (or use --force):
  ${_}${b}`,
          warnings: n
        };
      }
    }
    if (!t.force) {
      if (await A8m(g, h)) {
        return {
          ok: false,
          error: `Tag "${h}" already exists locally. Bump the version in ${f}, or re-run with --force to move the tag.`,
          warnings: n
        };
      }
    }
    return {
      ok: true,
      warnings: n,
      plan: {
        pluginName: u,
        version: m,
        versionFrom: f,
        tag: h,
        pluginRoot: o,
        gitRoot: g,
        marketplace: d ? {
          path: d.path,
          entryIndex: d.entryIndex,
          entryVersion: d.entry.version
        } : undefined,
        validation: l
      }
    };
  }
  async function nlr(e, t) {
    let n = ["-C", e.gitRoot, "tag"];
    if (t.force) {
      n.push("-f");
    }
    n.push("-a", e.tag, "-m", IZt(e, t.message), "HEAD");
    let r = await execFileNoThrow("git", n);
    if (r.code !== 0) {
      return {
        ok: false,
        error: `git tag failed (exit ${r.code}): ${r.stderr.trim() || r.stdout.trim()}`
      };
    }
    if (!t.push) {
      return {
        ok: true,
        pushed: false
      };
    }
    if (!/^[A-Za-z0-9][A-Za-z0-9._/-]*$/.test(t.remote)) {
      return {
        ok: false,
        error: `Tag created locally but not pushed: "${t.remote}" is not a valid remote name.`
      };
    }
    let o = ["-C", e.gitRoot, "push"];
    if (t.force) {
      o.push("--force");
    }
    o.push(t.remote, `refs/tags/${e.tag}`);
    let s = await execFileNoThrow("git", o);
    if (s.code !== 0) {
      return {
        ok: false,
        error: `Tag created locally but push failed (exit ${s.code}): ${s.stderr.trim() || s.stdout.trim()}`
      };
    }
    return {
      ok: true,
      pushed: true
    };
  }
  function IZt(e, t) {
    return t === undefined ? `${e.pluginName} ${e.version}` : t.replaceAll("%s", e.version);
  }
  async function v8m(e) {
    let t = yA.resolve(e);
    let n;
    try {
      n = await AZt.stat(t);
    } catch (o) {
      return {
        ok: false,
        error: fn(o) ? `Path not found: ${t}` : `Cannot stat ${t}: ${he(o)}`
      };
    }
    let r = n.isFile() ? [[yA.dirname(yA.dirname(t)), t]] : [[t, yA.join(t, ".claude-plugin", "plugin.json")], [yA.dirname(t), yA.join(t, "plugin.json")]];
    for (let [o, s] of r) {
      let i;
      try {
        i = await AZt.readFile(s, {
          encoding: "utf-8"
        });
      } catch (l) {
        if (fn(l)) {
          continue;
        }
        return {
          ok: false,
          error: `Cannot read ${s}: ${he(l)}`
        };
      }
      let a;
      try {
        a = qt(i);
      } catch (l) {
        return {
          ok: false,
          error: `Invalid JSON in ${s}: ${he(l)}`
        };
      }
      return {
        ok: true,
        pluginRoot: o,
        manifestPath: s,
        manifest: typeof a === "object" && a !== null ? a : {}
      };
    }
    return {
      ok: false,
      error: `No plugin manifest found. Expected ${yA.join(t, ".claude-plugin", "plugin.json")}.`
    };
  }
  async function w8m(e, t) {
    let n = findGitRoot(e) ?? undefined;
    let r = e;
    for (;;) {
      let o = yA.join(r, ".claude-plugin", "marketplace.json");
      let s = await C8m(o);
      if (s) {
        for (let [a, l] of s.plugins.entries()) {
          if (R8m(l, r, e, t)) {
            return {
              path: o,
              entryIndex: a,
              entry: l
            };
          }
        }
      }
      if (r === n) {
        return;
      }
      let i = yA.dirname(r);
      if (i === r) {
        return;
      }
      r = i;
    }
  }
  async function C8m(e) {
    let t;
    try {
      t = await AZt.readFile(e, {
        encoding: "utf-8"
      });
    } catch (o) {
      if (fn(o)) {
        return;
      }
      return;
    }
    let n;
    try {
      n = qt(t);
    } catch {
      return;
    }
    let r = fY().safeParse(n);
    return r.success ? r.data : undefined;
  }
  function R8m(e, t, n, r) {
    if (typeof e.source === "string") {
      let o = yA.resolve(t, e.source);
      return x8m(o, n);
    }
    return e.name === r;
  }
  function x8m(e, t) {
    let n = r => {
      let o = yA.resolve(r);
      return o.endsWith(yA.sep) ? o.slice(0, -yA.sep.length) : o;
    };
    return n(e) === n(t);
  }
  async function k8m(e, t) {
    let n = t.map(o => yA.relative(e, o) || ".");
    let r = await execFileNoThrow("git", ["-C", e, "status", "--porcelain", "--", ...n]);
    if (r.code !== 0) {
      return [];
    }
    return r.stdout.split(`
`).map(o => o.slice(3).trim()).filter(o => o.length > 0);
  }
  async function A8m(e, t) {
    let n = await execFileNoThrow("git", ["-C", e, "tag", "-l", "--", t]);
    return n.code === 0 && n.stdout.trim() === t;
  }
  var AZt;
  var yA;
  var mVl;
  var w4o = __lazy(() => {
    E7();
    vo();
    dt();
    ji();
    na();
    GXt();
    TC();
    elr();
    AZt = require("fs/promises");
    yA = require("path");
    mVl = __toESM(lq(), 1);
  });
  function yVl(e) {
    let t = hVl.c(9);
    let {
      onComplete: n,
      path: r,
      push: o,
      dryRun: s,
      force: i,
      unknownFlag: a
    } = e;
    let l;
    let c;
    if (t[0] !== s || t[1] !== i || t[2] !== n || t[3] !== r || t[4] !== o || t[5] !== a) {
      l = () => {
        d();
        async function d() {
          if (a !== undefined) {
            n(a === "--help" || a === "-h" ? fVl : `${vGd.cross} Unexpected argument "${a}".

${fVl}`);
            return;
          }
          let p = await tlr(r ?? ".", {
            force: i
          });
          let m = p.warnings.map(I8m);
          if (!p.ok) {
            m.push(`${vGd.cross} ${p.error}`);
            n(m.join(`
`));
            return;
          }
          let {
            plan: f
          } = p;
          if (m.push(`Plugin:  ${f.pluginName}`, `Version: ${f.version} (from ${f.versionFrom})`), f.marketplace) {
            m.push(`Marketplace entry: plugins[${f.marketplace.entryIndex}] in ${f.marketplace.path}` + (f.marketplace.entryVersion ? ` (version: ${f.marketplace.entryVersion})` : ""));
          }
          m.push(`Tag:     ${f.tag}`, "");
          let h = `git -C ${f.gitRoot} push ${i ? "--force " : ""}origin refs/tags/${f.tag}`;
          if (s) {
            m.push(`${vGd.tick} Dry run \u2014 would create tag ${f.tag} at HEAD in ${f.gitRoot}`, `  git -C ${f.gitRoot} tag ${i ? "-f " : ""}-a ${f.tag} -m "${IZt(f, undefined)}"`, `  ${h}`);
            n(m.join(`
`));
            return;
          }
          let g = await nlr(f, {
            push: o,
            force: i,
            message: undefined,
            remote: "origin"
          });
          if (!g.ok) {
            m.push(`${vGd.cross} ${g.error}`);
            n(m.join(`
`));
            return;
          }
          m.push(`${vGd.tick} Created tag ${f.tag}`);
          m.push(g.pushed ? `${vGd.tick} Pushed to origin` : `  Push with: ${h}`);
          m.push("", "For -m/--message and --remote, use: claude plugin tag --help");
          n(m.join(`
`));
        }
      };
      c = [n, r, o, s, i, a];
      t[0] = s;
      t[1] = i;
      t[2] = n;
      t[3] = r;
      t[4] = o;
      t[5] = a;
      t[6] = l;
      t[7] = c;
    } else {
      l = t[6];
      c = t[7];
    }
    gVl.useEffect(l, c);
    let u;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      u = C4o.jsx(gXd, {
        flexDirection: "column",
        children: C4o.jsx(Text, {
          children: "Preparing tag\u2026"
        })
      });
      t[8] = u;
    } else {
      u = t[8];
    }
    return u;
  }
  function I8m(e) {
    return `${vGd.warning} ${e}`;
  }
  var hVl;
  var gVl;
  var C4o;
  var fVl = `Usage: /plugin tag [path] [--push] [--dry-run] [-f|--force]

Create a {name}--v{version} git tag for the plugin at <path> (default: .).
Validates plugin.json and any enclosing marketplace entry agree on the version.

For -m/--message and --remote, use the CLI: claude plugin tag --help`;
  var _Vl = __lazy(() => {
    et();
    w4o();
    hVl = __toESM(pt(), 1);
    gVl = __toESM(ot(), 1);
    C4o = __toESM(ie(), 1);
  });
  function TVl(e) {
    let t = bVl.c(5);
    let {
      onComplete: n,
      path: r
    } = e;
    let o;
    let s;
    if (t[0] !== n || t[1] !== r) {
      o = () => {
        (async function () {
          if (!r) {
            n(`Usage: /plugin validate <path>

Validate a plugin or marketplace manifest file or directory.

Examples:
  /plugin validate .claude-plugin/plugin.json
  /plugin validate /path/to/plugin-directory
  /plugin validate .

When given a directory, automatically validates .claude-plugin/marketplace.json
or .claude-plugin/plugin.json (prefers marketplace if both exist).

Or from the command line:
  claude plugin validate <path>`);
            return;
          }
          try {
            let c = await kZt(r);
            let u = "";
            if (u = u + `Validating ${c.fileType} manifest: ${c.filePath}

`, c.errors.length > 0) {
              u = u + `${vGd.cross} Found ${c.errors.length} ${un(c.errors.length, "error")}:

`;
              c.errors.forEach(d => {
                u = u + `  ${vGd.pointer} ${d.path}: ${d.message}
`;
              });
              u = u + `
`;
            }
            if (c.warnings.length > 0) {
              u = u + `${vGd.warning} Found ${c.warnings.length} ${un(c.warnings.length, "warning")}:

`;
              c.warnings.forEach(d => {
                u = u + `  ${vGd.pointer} ${d.path}: ${d.message}
`;
              });
              u = u + `
`;
            }
            if (c.success) {
              if (c.warnings.length > 0) {
                u = u + `${vGd.tick} Validation passed with warnings
`;
              } else {
                u = u + `${vGd.tick} Validation passed
`;
              }
              process.exitCode = 0;
            } else {
              u = u + `${vGd.cross} Validation failed
`;
              process.exitCode = 1;
            }
            n(u);
          } catch (c) {
            let u = c;
            process.exitCode = 2;
            logForDebugging(`Plugin validation failed unexpectedly for ${r}: ${he(u)}`, {
              level: "error"
            });
            n(`${vGd.cross} Unexpected error during validation: ${he(u)}`);
          }
        })();
      };
      s = [n, r];
      t[0] = n;
      t[1] = r;
      t[2] = o;
      t[3] = s;
    } else {
      o = t[2];
      s = t[3];
    }
    SVl.useEffect(o, s);
    let i;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      i = R4o.jsx(gXd, {
        flexDirection: "column",
        children: R4o.jsx(Text, {
          children: "Running validation..."
        })
      });
      t[4] = i;
    } else {
      i = t[4];
    }
    return i;
  }
  var bVl;
  var SVl;
  var R4o;
  var EVl = __lazy(() => {
    et();
    je();
    dt();
    elr();
    Zn();
    bVl = __toESM(pt(), 1);
    SVl = __toESM(ot(), 1);
    R4o = __toESM(ie(), 1);
  });
  function P8m(e) {
    let t = PZt.c(4);
    let {
      onComplete: n
    } = e;
    let r;
    let o;
    if (t[0] !== n) {
      r = () => {
        (async function () {
          try {
            let l = await hf();
            let c = Object.keys(l);
            if (c.length === 0) {
              n("No marketplaces configured");
            } else {
              n(`Configured marketplaces:
${c.map(O8m).join(`
`)}`);
            }
          } catch (l) {
            n(`Error loading marketplaces: ${he(l)}`);
          }
        })();
      };
      o = [n];
      t[0] = n;
      t[1] = r;
      t[2] = o;
    } else {
      r = t[1];
      o = t[2];
    }
    Qw.useEffect(r, o);
    let s;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      s = pa.jsx(Text, {
        children: "Loading marketplaces..."
      });
      t[3] = s;
    } else {
      s = t[3];
    }
    return s;
  }
  function O8m(e) {
    return `  \u2022 ${e}`;
  }
  function D8m(e) {
    let t = PZt.c(8);
    let {
      onComplete: n,
      filter: r
    } = e;
    let o = bt(F8m);
    let s = bt(L8m);
    let i = bt(N8m);
    let a;
    let l;
    if (t[0] !== s || t[1] !== r || t[2] !== i || t[3] !== o || t[4] !== n) {
      a = () => {
        let u = Kw();
        let d = Object.keys(u.plugins).sort();
        if (d.length === 0) {
          n("No plugins installed. Use `/plugin install` to install a plugin.");
          return;
        }
        let p = getPluginEditableScopes();
        let m = new Set(s.map(M8m));
        let f = ["Installed plugins:"];
        let h = 0;
        for (let g of d) {
          let y = ii(g, "@");
          let _ = p.vZc(g);
          if (r !== undefined && r === "enabled" !== _) {
            continue;
          }
          let b = o.some(x => x.source === g || "plugin" in x && x.plugin === y);
          let S = b ? `${vGd.cross} failed to load` : _ ? `${vGd.tick} enabled` : `${vGd.cross} disabled`;
          let E = !b && _ !== m.vZc(g) ? " \u2014 run /reload-plugins to apply" : "";
          let C = (s.find(x => x.source === g) ?? i.find(x => x.source === g))?.manifest.version;
          for (let x of u.plugins[g] ?? []) {
            let A = Ior(x.version, C);
            let k = A ? `${A}, ${x.scope}` : x.scope;
            f.push(`  \u2022 ${g} (${k}) ${S}${E}`);
            h++;
          }
        }
        if (h === 0) {
          n(`No ${r} plugins.`);
          return;
        }
        n(f.join(`
`));
      };
      l = [n, o, s, i, r];
      t[0] = s;
      t[1] = r;
      t[2] = i;
      t[3] = o;
      t[4] = n;
      t[5] = a;
      t[6] = l;
    } else {
      a = t[5];
      l = t[6];
    }
    Qw.useEffect(a, l);
    let c;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      c = pa.jsx(Text, {
        children: "Loading plugins..."
      });
      t[7] = c;
    } else {
      c = t[7];
    }
    return c;
  }
  function M8m(e) {
    return e.source;
  }
  function N8m(e) {
    return e.plugins.disabled;
  }
  function L8m(e) {
    return e.plugins.enabled;
  }
  function F8m(e) {
    return e.plugins.errors;
  }
  function U8m() {
    return null;
  }
  function B8m() {
    let e = PZt.c(1);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = pa.jsx(gXd, {
        marginTop: 1,
        children: pa.jsx(gA, {
          status: "info",
          children: "Skills are now managed here under the Skills section."
        })
      });
      e[0] = t;
    } else {
      t = e[0];
    }
    return t;
  }
  function x4o(e) {
    let t = [];
    let n = [{
      source: "userSettings",
      scope: "user"
    }, {
      source: "projectSettings",
      scope: "project"
    }, {
      source: "localSettings",
      scope: "local"
    }];
    for (let {
      source: s,
      scope: i
    } of n) {
      if (getSettingsForSource(s)?.extraKnownMarketplaces?.[e]) {
        t.push({
          source: s,
          scope: i
        });
      }
    }
    let r = getSettingsForSource("policySettings");
    let o = Boolean(r?.extraKnownMarketplaces?.[e]);
    return {
      editableSources: t,
      isInPolicy: o
    };
  }
  function vVl(e) {
    let {
      editableSources: t,
      isInPolicy: n
    } = x4o(e);
    if (t.length > 0) {
      return {
        kind: "remove-extra-marketplace",
        name: e,
        sources: t
      };
    }
    if (n) {
      return {
        kind: "managed-only",
        name: e
      };
    }
    return {
      kind: "navigate",
      tab: "marketplaces",
      viewState: {
        type: "manage-marketplaces",
        targetMarketplace: e,
        action: "remove"
      }
    };
  }
  function $8m(e) {
    return {
      kind: "navigate",
      tab: "installed",
      viewState: {
        type: "manage-plugins",
        targetPlugin: e,
        action: "uninstall"
      }
    };
  }
  function rlr(e) {
    if (H8m.vZc(e.type)) {
      return true;
    }
    if (e.type === "marketplace-load-failed" && e.reason === "cache-miss") {
      return true;
    }
    if (e.type === "marketplace-not-found") {
      return true;
    }
    return false;
  }
  function k4o(e) {
    if ("pluginId" in e && e.pluginId) {
      return e.pluginId;
    }
    if ("plugin" in e && e.plugin) {
      return e.plugin;
    }
    if (e.source.includes("@")) {
      return ii(e.source, "@");
    }
    return;
  }
  function j8m(e, t, n, r, o, s, i, a) {
    let l = [];
    for (let d of s) {
      let p = "pluginId" in d ? d.pluginId : "plugin" in d ? d.plugin : undefined;
      l.push({
        label: p ?? d.source,
        message: AUe(d),
        guidance: AYe(d) ?? "Restart to retry loading plugins",
        action: {
          kind: "none"
        }
      });
    }
    let c = new Set();
    for (let d of e) {
      c.add(d.name);
      let p = vVl(d.name);
      let m = x4o(d.name);
      let f = m.isInPolicy ? "managed" : m.editableSources[0]?.scope;
      l.push({
        label: d.name,
        message: d.error ?? "Installation failed",
        guidance: p.kind === "managed-only" ? "Managed by your organization \u2014 contact your admin" : undefined,
        action: p,
        scope: f
      });
    }
    for (let d of t) {
      let p = "marketplace" in d ? d.marketplace : d.source;
      if (c.vZc(p)) {
        continue;
      }
      c.add(p);
      let m = vVl(p);
      let f = x4o(p);
      let h = f.isInPolicy ? "managed" : f.editableSources[0]?.scope;
      l.push({
        label: p,
        message: AUe(d),
        guidance: m.kind === "managed-only" ? "Managed by your organization \u2014 contact your admin" : AYe(d),
        action: m,
        scope: h
      });
    }
    for (let d of o) {
      if (c.vZc(d.name)) {
        continue;
      }
      c.add(d.name);
      l.push({
        label: d.name,
        message: d.error,
        action: {
          kind: "remove-installed-marketplace",
          name: d.name
        }
      });
    }
    let u = new Set();
    for (let d of n) {
      let p = k4o(d);
      if (p && u.vZc(p)) {
        continue;
      }
      if (p) {
        u.add(p);
      }
      let m = "marketplace" in d ? d.marketplace : undefined;
      let f = p ? a.get(d.source) ?? a.get(p) : undefined;
      l.push({
        label: p ? m ? `${p} @ ${m}` : p : d.source,
        message: AUe(d),
        guidance: AYe(d),
        action: p ? $8m(p) : {
          kind: "none"
        },
        scope: f
      });
    }
    for (let d of r) {
      l.push({
        label: d.source,
        message: AUe(d),
        guidance: AYe(d),
        action: {
          kind: "none"
        }
      });
    }
    for (let d of i) {
      let p = "plugin" in d ? d.plugin : d.source;
      if (u.vZc(p)) {
        continue;
      }
      u.add(p);
      let m = a.get(d.source) ?? ("plugin" in d ? a.get(d.plugin) : undefined);
      l.push({
        label: p,
        message: S1(d),
        guidance: _Fn(d),
        action: {
          kind: "none"
        },
        scope: m,
        isAdvisory: true
      });
    }
    return l;
  }
  function q8m(e, t) {
    for (let {
      source: n
    } of t) {
      let r = getSettingsForSource(n);
      if (!r) {
        continue;
      }
      let o = {};
      if (r.extraKnownMarketplaces?.[e]) {
        o.extraKnownMarketplaces = {
          ...r.extraKnownMarketplaces,
          [e]: undefined
        };
      }
      if (r.enabledPlugins) {
        let s = `@${e}`;
        let i = false;
        let a = {
          ...r.enabledPlugins
        };
        for (let l in a) {
          if (l.endsWith(s)) {
            a[l] = undefined;
            i = true;
          }
        }
        if (i) {
          o.enabledPlugins = a;
        }
      }
      if (Object.keys(o).length > 0) {
        updateSettingsForSource(n, o);
      }
    }
  }
  function W8m(e) {
    let t = PZt.c(26);
    let {
      setViewState: n,
      setActiveTab: r,
      markPluginsChanged: o
    } = e;
    let s = bt(Z8m);
    let i = bt(Q8m);
    let a = bt(X8m);
    let l = Lo();
    let [c, u] = Qw.useState(0);
    let [d, p] = Qw.useState(null);
    let m;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      m = [];
      t[0] = m;
    } else {
      m = t[0];
    }
    let [f, h] = Qw.useState(m);
    let g;
    let y;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      g = () => {
        (async () => {
          try {
            let re = await hf();
            let {
              failures: se
            } = await Xse(re);
            h(se);
          } catch {}
        })();
      };
      y = [];
      t[1] = g;
      t[2] = y;
    } else {
      g = t[1];
      y = t[2];
    }
    Qw.useEffect(g, y);
    let _ = a.marketplaces.filter(J8m);
    let b = new Set(_.map(Y8m));
    let S = s.filter(rlr);
    let E = s.filter(re => !rlr(re) && (re.type === "marketplace-not-found" || re.type === "marketplace-load-failed" || re.type === "marketplace-blocked-by-policy") && !b.vZc(re.marketplace));
    let C = s.filter(K8m);
    let x = s.filter(z8m);
    let A = getPluginEditableScopes();
    let k = j8m(_, E, C, x, f, S, i, A);
    let I;
    if (t[3] !== n) {
      I = () => {
        n({
          type: "menu"
        });
      };
      t[3] = n;
      t[4] = I;
    } else {
      I = t[4];
    }
    let O;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      O = {
        context: "Confirmation"
      };
      t[5] = O;
    } else {
      O = t[5];
    }
    uo("confirm:no", I, O);
    let M = () => {
      let re = k[c];
      if (!re) {
        return;
      }
      let {
        action: se
      } = re;
      e: switch (se.kind) {
        case "navigate":
          {
            r(se.tab);
            n(se.viewState);
            break e;
          }
        case "remove-extra-marketplace":
          {
            let ae = se.sources.map(V8m).join(", ");
            q8m(se.name, se.sources);
            Ag();
            l(de => ({
              ...de,
              plugins: {
                ...de.plugins,
                errors: de.plugins.errors.filter(be => !("marketplace" in be && be.marketplace === se.name)),
                installationStatus: {
                  ...de.plugins.installationStatus,
                  marketplaces: de.plugins.installationStatus.marketplaces.filter(be => be.name !== se.name)
                }
              }
            }));
            p(`${vGd.tick} Removed "${se.name}" from ${ae} settings`);
            o();
            break e;
          }
        case "remove-installed-marketplace":
          {
            (async () => {
              try {
                await nvt(se.name);
                Ag();
                h(ae => ae.filter(de => de.name !== se.name));
                p(`${vGd.tick} Removed marketplace "${se.name}"`);
                o();
              } catch (ae) {
                let de = ae;
                p(`Failed to remove "${se.name}": ${de instanceof Error ? de.message : String(de)}`);
              }
            })();
            break e;
          }
        case "managed-only":
          break e;
        case "none":
      }
    };
    let L;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      L = () => u(G8m);
      t[6] = L;
    } else {
      L = t[6];
    }
    let P = k.length > 0;
    let F;
    if (t[7] !== P) {
      F = {
        context: "Select",
        isActive: P
      };
      t[7] = P;
      t[8] = F;
    } else {
      F = t[8];
    }
    jo({
      "select:previous": L,
      "select:next": () => u(re => Math.min(k.length - 1, re + 1)),
      "select:accept": M
    }, F);
    let H = Math.min(c, Math.max(0, k.length - 1));
    if (H !== c) {
      u(H);
    }
    let U = k[H]?.action;
    let N = U && U.kind !== "none" && U.kind !== "managed-only";
    if (k.length === 0) {
      let re;
      if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
        re = pa.jsx(gXd, {
          marginLeft: 1,
          children: pa.jsx(sc, {
            children: "No plugin errors"
          })
        });
        t[9] = re;
      } else {
        re = t[9];
      }
      let se;
      if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
        se = pa.jsxs(gXd, {
          flexDirection: "column",
          children: [re, pa.jsx(gXd, {
            marginTop: 1,
            children: pa.jsx(Text, {
              dimColor: true,
              italic: true,
              children: pa.jsx(Wr, {
                action: "confirm:no",
                context: "Confirmation",
                fallback: "Esc",
                description: "go back"
              })
            })
          })]
        });
        t[10] = se;
      } else {
        se = t[10];
      }
      return se;
    }
    let W = gXd;
    let j = "column";
    let z = 1;
    let V;
    if (t[11] !== H) {
      V = (re, se) => {
        let ae = se === H;
        let de = re.isAdvisory ? "warning" : "error";
        let be = ae ? vGd.pointer : re.isAdvisory ? vGd.triangleUpOutline : vGd.cross;
        return pa.jsxs(gXd, {
          marginLeft: 1,
          flexDirection: "column",
          children: [pa.jsxs(Text, {
            children: [pa.jsxs(Text, {
              color: ae ? "suggestion" : de,
              children: [be, " "]
            }), pa.jsx(Text, {
              bold: ae,
              children: re.label
            }), re.scope && pa.jsxs(Text, {
              dimColor: true,
              children: [" (", re.scope, ")"]
            })]
          }), pa.jsx(gXd, {
            marginLeft: 3,
            children: pa.jsx(Text, {
              color: de,
              wrap: "wrap-trim",
              children: re.message
            })
          }), re.guidance && pa.jsx(gXd, {
            marginLeft: 3,
            children: pa.jsx(Text, {
              dimColor: true,
              italic: true,
              wrap: "wrap-trim",
              children: re.guidance
            })
          })]
        }, se);
      };
      t[11] = H;
      t[12] = V;
    } else {
      V = t[12];
    }
    let K = k.map(V);
    let J;
    if (t[13] !== d) {
      J = d && pa.jsx(gXd, {
        marginLeft: 1,
        children: pa.jsx(Text, {
          color: "claude",
          children: d
        })
      });
      t[13] = d;
      t[14] = J;
    } else {
      J = t[14];
    }
    let Q;
    if (t[15] === Symbol.for("react.memo_cache_sentinel")) {
      Q = pa.jsx(Wr, {
        action: "select:previous",
        context: "Select",
        fallback: "\u2191",
        description: "navigate"
      });
      t[15] = Q;
    } else {
      Q = t[15];
    }
    let Z;
    if (t[16] !== N) {
      Z = N && pa.jsx(Wr, {
        action: "select:accept",
        context: "Select",
        fallback: "Enter",
        description: "resolve"
      });
      t[16] = N;
      t[17] = Z;
    } else {
      Z = t[17];
    }
    let ne;
    if (t[18] === Symbol.for("react.memo_cache_sentinel")) {
      ne = pa.jsx(Wr, {
        action: "confirm:no",
        context: "Confirmation",
        fallback: "Esc",
        description: "go back"
      });
      t[18] = ne;
    } else {
      ne = t[18];
    }
    let oe;
    if (t[19] !== Z) {
      oe = pa.jsx(gXd, {
        children: pa.jsx(Text, {
          dimColor: true,
          italic: true,
          children: pa.jsxs(Hn, {
            children: [Q, Z, ne]
          })
        })
      });
      t[19] = Z;
      t[20] = oe;
    } else {
      oe = t[20];
    }
    let ee;
    if (t[21] !== W || t[22] !== K || t[23] !== J || t[24] !== oe) {
      ee = pa.jsxs(W, {
        flexDirection: j,
        gap: z,
        children: [K, J, oe]
      });
      t[21] = W;
      t[22] = K;
      t[23] = J;
      t[24] = oe;
      t[25] = ee;
    } else {
      ee = t[25];
    }
    return ee;
  }
  function G8m(e) {
    return Math.max(0, e - 1);
  }
  function V8m(e) {
    return e.scope;
  }
  function z8m(e) {
    if (rlr(e)) {
      return false;
    }
    if (e.type === "marketplace-not-found" || e.type === "marketplace-load-failed" || e.type === "marketplace-blocked-by-policy") {
      return false;
    }
    return k4o(e) === undefined;
  }
  function K8m(e) {
    if (rlr(e)) {
      return false;
    }
    if (e.type === "marketplace-not-found" || e.type === "marketplace-load-failed" || e.type === "marketplace-blocked-by-policy") {
      return false;
    }
    return k4o(e) !== undefined;
  }
  function Y8m(e) {
    return e.name;
  }
  function J8m(e) {
    return e.status === "failed";
  }
  function X8m(e) {
    return e.plugins.installationStatus;
  }
  function Q8m(e) {
    return e.plugins.warnings;
  }
  function Z8m(e) {
    return e.plugins.errors;
  }
  function eVm(e) {
    switch (e.type) {
      case "help":
        return {
          type: "help"
        };
      case "validate":
        return {
          type: "validate",
          path: e.path
        };
      case "eval":
        return {
          type: "eval",
          target: e.target
        };
      case "tag":
        return {
          type: "tag",
          path: e.path,
          push: e.push,
          dryRun: e.dryRun,
          force: e.force,
          unknownFlag: e.unknownFlag
        };
      case "install":
        if (e.marketplace) {
          return {
            type: "browse-marketplace",
            targetMarketplace: e.marketplace,
            targetPlugin: e.plugin
          };
        }
        if (e.plugin) {
          return {
            type: "discover-plugins",
            targetPlugin: e.plugin
          };
        }
        return {
          type: "discover-plugins"
        };
      case "manage":
        return {
          type: "manage-plugins"
        };
      case "uninstall":
        return {
          type: "manage-plugins",
          targetPlugin: e.plugin,
          action: "uninstall"
        };
      case "enable":
        return {
          type: "manage-plugins",
          targetPlugin: e.plugin,
          action: "enable"
        };
      case "disable":
        return {
          type: "manage-plugins",
          targetPlugin: e.plugin,
          action: "disable"
        };
      case "configure":
        return {
          type: "manage-plugins",
          targetPlugin: e.plugin,
          action: "configure"
        };
      case "list":
        return {
          type: "plugin-list",
          filter: e.filter
        };
      case "marketplace":
        if (e.action === "list") {
          return {
            type: "marketplace-list"
          };
        }
        if (e.action === "add") {
          return {
            type: "add-marketplace",
            initialValue: e.target
          };
        }
        if (e.action === "remove") {
          return {
            type: "manage-marketplaces",
            targetMarketplace: e.target,
            action: "remove"
          };
        }
        if (e.action === "update") {
          return {
            type: "manage-marketplaces",
            targetMarketplace: e.target,
            action: "update"
          };
        }
        return {
          type: "marketplace-menu"
        };
      case "menu":
      default:
        return {
          type: "discover-plugins"
        };
    }
  }
  function tVm(e) {
    if (e.type === "manage-plugins") {
      return "installed";
    }
    if (e.type === "manage-marketplaces") {
      return "marketplaces";
    }
    return "discover";
  }
  function wVl({
    onComplete: e,
    args: t,
    showMcpRedirectMessage: n,
    showSkillsRedirectMessage: r,
    getSessionContext: o,
    commands: s
  }) {
    let i = iVl(t);
    let a = eVm(i);
    let [l, c] = Qw.useState(a);
    let u = Qw.useRef(new Set());
    let [d, p] = Qw.useState(tVm(a));
    let [m, f] = Qw.useState(l.type === "add-marketplace" ? l.initialValue || "" : "");
    let [h, g] = Qw.useState(0);
    let [y, _] = Qw.useState(null);
    let [b, S] = Qw.useState(null);
    let [E, C] = Qw.useState(false);
    let x = Lo();
    let A = bt(H => {
      let U = H.plugins.errors.length;
      for (let N of H.plugins.installationStatus.marketplaces) {
        if (N.status === "failed") {
          U++;
        }
      }
      return U;
    });
    let k = A > 0 ? `Errors (${A})` : "Errors";
    let I = Eg();
    let O = i.type === "marketplace" && i.action === "add" && i.target !== undefined;
    let M = Qw.useCallback(() => {
      x(H => H.plugins.needsRefresh ? H : {
        ...H,
        plugins: {
          ...H.plugins,
          needsRefresh: true
        }
      });
    }, [x]);
    let L = Qw.useCallback(H => {
      let U = H;
      switch (p(U), _(null), U) {
        case "discover":
          c({
            type: "discover-plugins"
          });
          break;
        case "installed":
          c({
            type: "manage-plugins"
          });
          break;
        case "marketplaces":
          c({
            type: "manage-marketplaces"
          });
          break;
        case "errors":
          break;
      }
    }, []);
    Qw.useEffect(() => {
      if (l.type === "menu" && !b) {
        e();
      }
    }, [l.type, b, e]);
    let P = Qw.useRef(l.type);
    Qw.useEffect(() => {
      if (l.type === P.current) {
        return;
      }
      P.current = l.type;
      let U = {
        "browse-marketplace": "discover",
        "manage-plugins": "installed",
        "manage-marketplaces": "marketplaces"
      }[l.type];
      if (U) {
        p(U);
      }
    }, [l.type]);
    let F = Qw.useCallback(() => {
      p("marketplaces");
      c({
        type: "manage-marketplaces"
      });
      f("");
      _(null);
    }, []);
    if (uo("confirm:no", F, {
      context: "Settings",
      isActive: l.type === "add-marketplace"
    }), Qw.useEffect(() => {
      if (b) {
        e(b);
      }
    }, [b, e]), Qw.useEffect(() => {
      if (l.type === "help") {
        e();
      }
    }, [l.type, e]), l.type === "help") {
      return pa.jsxs(gXd, {
        flexDirection: "column",
        children: [pa.jsx(Text, {
          bold: true,
          children: "Plugin Command Usage:"
        }), pa.jsx(Text, {
          children: " "
        }), pa.jsx(Text, {
          dimColor: true,
          children: "Installation:"
        }), pa.jsx(Text, {
          children: " /plugin install - Browse and install plugins"
        }), pa.jsxs(Text, {
          children: [" ", "/plugin install <marketplace> - Install from specific marketplace"]
        }), pa.jsx(Text, {
          children: " /plugin install <plugin> - Install specific plugin"
        }), pa.jsxs(Text, {
          children: [" ", "/plugin install <plugin>@<market> - Install plugin from marketplace"]
        }), pa.jsx(Text, {
          children: " "
        }), pa.jsx(Text, {
          dimColor: true,
          children: "Management:"
        }), pa.jsxs(Text, {
          children: [" ", "/plugin list [--enabled|--disabled] - List installed plugins"]
        }), pa.jsx(Text, {
          children: " /plugin manage - Manage installed plugins"
        }), pa.jsx(Text, {
          children: " /plugin enable <plugin> - Enable a plugin"
        }), pa.jsx(Text, {
          children: " /plugin disable <plugin> - Disable a plugin"
        }), pa.jsx(Text, {
          children: " /plugin configure <plugin> - Set userConfig options"
        }), pa.jsx(Text, {
          children: " /plugin uninstall <plugin> - Uninstall a plugin"
        }), pa.jsx(Text, {
          children: " "
        }), pa.jsx(Text, {
          dimColor: true,
          children: "Marketplaces:"
        }), pa.jsx(Text, {
          children: " /plugin marketplace - Marketplace management menu"
        }), pa.jsx(Text, {
          children: " /plugin marketplace add - Add a marketplace"
        }), pa.jsxs(Text, {
          children: [" ", "/plugin marketplace add <path/url> - Add marketplace directly"]
        }), pa.jsx(Text, {
          children: " /plugin marketplace update - Update marketplaces"
        }), pa.jsxs(Text, {
          children: [" ", "/plugin marketplace update <name> - Update specific marketplace"]
        }), pa.jsx(Text, {
          children: " /plugin marketplace remove - Remove a marketplace"
        }), pa.jsxs(Text, {
          children: [" ", "/plugin marketplace remove <name> - Remove specific marketplace"]
        }), pa.jsx(Text, {
          children: " /plugin marketplace list - List all marketplaces"
        }), pa.jsx(Text, {
          children: " "
        }), pa.jsx(Text, {
          dimColor: true,
          children: "Validation:"
        }), pa.jsxs(Text, {
          children: [" ", "/plugin validate <path> - Validate a manifest file or directory"]
        }), pa.jsxs(Text, {
          children: [" ", "/plugin tag [path] [--push] [--dry-run] [-f] - Create a release tag for the plugin"]
        }), pa.jsx(Text, {
          children: " "
        }), pa.jsx(Text, {
          dimColor: true,
          children: "Other:"
        }), pa.jsx(Text, {
          children: " /plugin - Main plugin menu"
        }), pa.jsx(Text, {
          children: " /plugin help - Show this help"
        }), pa.jsx(Text, {
          children: " /plugins - Alias for /plugin"
        })]
      });
    }
    if (l.type === "validate") {
      return pa.jsx(TVl, {
        onComplete: e,
        path: l.path
      });
    }
    if (l.type === "eval") {
      return pa.jsx(f8l, {
        onComplete: e,
        target: l.target
      });
    }
    if (l.type === "tag") {
      return pa.jsx(yVl, {
        onComplete: e,
        path: l.path,
        push: l.push,
        dryRun: l.dryRun,
        force: l.force,
        unknownFlag: l.unknownFlag
      });
    }
    if (l.type === "marketplace-menu") {
      c({
        type: "menu"
      });
      return null;
    }
    if (l.type === "marketplace-list") {
      return pa.jsx(P8m, {
        onComplete: e
      });
    }
    if (l.type === "plugin-list") {
      return pa.jsx(D8m, {
        onComplete: e,
        filter: l.filter
      });
    }
    if (l.type === "add-marketplace") {
      return pa.jsx(H6l, {
        inputValue: m,
        setInputValue: f,
        cursorOffset: h,
        setCursorOffset: g,
        error: y,
        setError: _,
        result: b,
        setResult: S,
        setViewState: c,
        onAddComplete: M,
        cliMode: O
      });
    }
    return pa.jsx(Td, {
      color: "suggestion",
      children: pa.jsxs(VM, {
        title: "Plugins",
        selectedTab: d,
        onTabChange: L,
        color: "suggestion",
        disableNavigation: E,
        banner: n && d === "installed" ? pa.jsx(U8m, {}) : r && d === "installed" ? pa.jsx(B8m, {}) : undefined,
        children: [pa.jsx(kh, {
          id: "discover",
          title: "Discover",
          children: l.type === "browse-marketplace" ? pa.jsx(o8l, {
            error: y,
            setError: _,
            result: b,
            setResult: S,
            setViewState: c,
            onInstallComplete: M,
            onSearchModeChange: C,
            targetMarketplace: l.targetMarketplace,
            targetPlugin: l.targetPlugin
          }) : pa.jsx(a8l, {
            error: y,
            setError: _,
            result: b,
            setResult: S,
            setViewState: c,
            onInstallComplete: M,
            onSearchModeChange: C,
            getSessionContext: o,
            grantedSuggestions: u.current,
            targetPlugin: l.type === "discover-plugins" ? l.targetPlugin : undefined
          })
        }), pa.jsx(kh, {
          id: "installed",
          title: "Installed",
          children: pa.jsx(oVl, {
            setViewState: c,
            setResult: S,
            onManageComplete: M,
            onSearchModeChange: C,
            commands: s,
            targetPlugin: l.type === "manage-plugins" ? l.targetPlugin : undefined,
            targetMarketplace: l.type === "manage-plugins" ? l.targetMarketplace : undefined,
            action: l.type === "manage-plugins" ? l.action : undefined
          })
        }), pa.jsx(kh, {
          id: "marketplaces",
          title: "Marketplaces",
          children: pa.jsx(w8l, {
            setViewState: c,
            error: y,
            setError: _,
            setResult: S,
            exitState: I,
            onManageComplete: M,
            targetMarketplace: l.type === "manage-marketplaces" ? l.targetMarketplace : undefined,
            action: l.type === "manage-marketplaces" ? l.action : undefined
          })
        }), pa.jsx(kh, {
          id: "errors",
          title: k,
          children: pa.jsx(W8m, {
            setViewState: c,
            setActiveTab: p,
            markPluginsChanged: M
          })
        })]
      })
    });
  }
  var PZt;
  var Qw;
  var pa;
  var H8m;
  var olr = __lazy(() => {
    Sd();
    Ai();
    xb();
    nwt();
    oE();
    yH();
    mO();
    et();
    Bs();
    ho();
    cV();
    dt();
    p5();
    Qk();
    Cwe();
    yT();
    CYe();
    Zn();
    j6l();
    s8l();
    l8l();
    h8l();
    C8l();
    sVl();
    f4o();
    _Vl();
    EVl();
    PZt = __toESM(pt(), 1);
    Qw = __toESM(ot(), 1);
    pa = __toESM(ie(), 1);
    H8m = new Set(["git-auth-failed", "git-timeout", "network-error"]);
  });
  var RVl = {};
  __export(RVl, {
    call: () => call_export37
  });
  function nVm(e) {
    let t = CVl.c(7);
    let {
      action: n,
      target: r,
      onComplete: o
    } = e;
    let s = bt(sVm);
    let i = TUe();
    let a = slr.useRef(false);
    let l;
    let c;
    if (t[0] !== n || t[1] !== s || t[2] !== o || t[3] !== r || t[4] !== i) {
      l = () => {
        if (a.current) {
          return;
        }
        a.current = true;
        let u = n === "enable";
        let d = s.filter(oVm);
        let p = r === "all" ? d : d.filter(f => f.name === r);
        let m = p.filter(f => SYe(f) !== "needs-approval" && (u ? f.type === "disabled" : f.type !== "disabled"));
        if (m.length === 0) {
          o(r === "all" ? `All MCP servers are already ${u ? "enabled" : "disabled"}` : p.length === 0 ? `MCP server "${r}" not found` : p.some(rVm) ? `MCP server "${r}" is pending approval \u2014 approve it via /mcp first` : `MCP server "${r}" is already ${u ? "enabled" : "disabled"}`);
          return;
        }
        for (let f of m) {
          i(f.name).catch(Oe);
        }
        o(r === "all" ? `${u ? "Enabled" : "Disabled"} ${m.length} MCP server(s)` : `MCP server "${r}" ${u ? "enabled" : "disabled"}`);
      };
      c = [n, r, s, i, o];
      t[0] = n;
      t[1] = s;
      t[2] = o;
      t[3] = r;
      t[4] = i;
      t[5] = l;
      t[6] = c;
    } else {
      l = t[5];
      c = t[6];
    }
    slr.useEffect(l, c);
    return null;
  }
  function rVm(e) {
    return SYe(e) === "needs-approval";
  }
  function oVm(e) {
    return e.name !== "ide";
  }
  function sVm(e) {
    return e.mcp.clients;
  }
  async function call_export37(e, t, n) {
    if (n) {
      let r = /^(\S+)\s*(.*)$/.exec(n.trim());
      let o = r?.[1] ?? "";
      let s = r?.[2] ?? "";
      if (o === "no-redirect") {
        return OZt.jsx(war, {
          onComplete: e
        });
      }
      if (o === "reconnect" && s) {
        return OZt.jsx(L3o, {
          serverName: s,
          onComplete: e
        });
      }
      if (o === "enable" || o === "disable") {
        return OZt.jsx(nVm, {
          action: o,
          target: s || "all",
          onComplete: e
        });
      }
    }
    return OZt.jsx(war, {
      onComplete: e
    });
  }
  var CVl;
  var slr;
  var OZt;
  var xVl = __lazy(() => {
    I6l();
    F3o();
    Hfe();
    ho();
    Rn();
    twt();
    olr();
    CVl = __toESM(pt(), 1);
    slr = __toESM(ot(), 1);
    OZt = __toESM(ie(), 1);
  });
  var kVl;
  var aVm;