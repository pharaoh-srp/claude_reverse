  __export(wHa, {
    unwrapCcrProxyUrl: () => unwrapCcrProxyUrl,
    suppressedConnectorsEqual: () => suppressedConnectorsEqual,
    shouldSkipClaudeAiFetchForEnterpriseLockdown: () => shouldSkipClaudeAiFetchForEnterpriseLockdown,
    shouldAllowManagedMcpServersOnly: () => shouldAllowManagedMcpServersOnly,
    setMcpServerEnabled: () => setMcpServerEnabled,
    removeMcpConfig: () => removeMcpConfig,
    readRawMcpJsonServersFromCwd: () => readRawMcpJsonServersFromCwd,
    parseMcpConfigFromFilePath: () => parseMcpConfigFromFilePath,
    parseMcpConfig: () => parseMcpConfig,
    isMcpServerDisabled: () => isMcpServerDisabled,
    isMcpServerDenied: () => isMcpServerDenied,
    isMcpServerBlockedAtConnectTime: () => isMcpServerBlockedAtConnectTime,
    isMcpServerAllowedByPolicy: () => isMcpServerAllowedByPolicy,
    isBuiltinInProcessMcpServer: () => isBuiltinInProcessMcpServer,
    getMcpServerSignature: () => getMcpServerSignature,
    getMcpScopeConflicts: () => getMcpScopeConflicts,
    getMcpConfigsByScope: () => getMcpConfigsByScope,
    getMcpConfigByName: () => getMcpConfigByName,
    getEnterpriseMcpFilePath: () => getEnterpriseMcpFilePath,
    getConnectablePluginMcpServerNames: () => getConnectablePluginMcpServerNames,
    getClaudeCodeMcpConfigs: () => getClaudeCodeMcpConfigs,
    getAllMcpConfigs: () => getAllMcpConfigs,
    filterMcpServersByPolicy: () => filterMcpServersByPolicy,
    filterDynamicMcpServersByPolicy: () => filterDynamicMcpServersByPolicy,
    doesEnterpriseMcpConfigExist: () => doesEnterpriseMcpConfigExist,
    dedupPluginMcpServers: () => dedupPluginMcpServers,
    dedupClaudeAiMcpServers: () => dedupClaudeAiMcpServers,
    areMcpConfigsAllowedWithEnterpriseMcpConfig: () => areMcpConfigsAllowedWithEnterpriseMcpConfig,
    areMcpConfigsAllSdkType: () => areMcpConfigsAllSdkType,
    addMcpConfig: () => addMcpConfig,
    MCP_SETTINGS_SCOPES: () => MCP_SETTINGS_SCOPES,
    MAX_MCP_CONFIG_BYTES: () => 2097152
  });
  function getEnterpriseMcpFilePath() {
    return fpe.join(SI(), "managed-mcp.json");
  }
  function O$() {
    return Object.create(null);
  }
  function wWn(e, t) {
    let n = O$();
    if (e) {
      for (let [r, o] of Object.entries(e)) {
        n[r] = {
          ...o,
          scope: t
        };
      }
    }
    return n;
  }
  async function SHa(e) {
    let t = fpe.join(Nt(), ".mcp.json");
    await jDt(t, De(e, null, 2), {
      encoding: "utf-8",
      mode: 420,
      stagingDir: fpe.join(Nt(), ".claude", ".cc-writes")
    });
  }
  function RWn(e) {
    if (e.type !== undefined && e.type !== "stdio") {
      return null;
    }
    let t = e;
    return [t.command, ...(t.args ?? [])];
  }
  function THa(e, t) {
    if (e.length !== t.length) {
      return false;
    }
    return e.every((n, r) => n === t[r]);
  }
  function lNe(e) {
    return Eoe(e).expanded;
  }
  function xWn(e) {
    return "url" in e ? e.url : null;
  }
  function unwrapCcrProxyUrl(e) {
    if (!hXr.some(t => e.includes(t))) {
      return e;
    }
    try {
      return new URL(e).searchParams.get("mcp_url") || e;
    } catch {
      return e;
    }
  }
  function getMcpServerSignature(e, t) {
    let n = RWn(e);
    if (n) {
      if (t?.includeEnv === false) {
        return `stdio:${De(n)}`;
      }
      let s = Object.entries(e.env ?? {}).filter(([a]) => !K$p.vZc(a)).sort(([a], [l]) => a < l ? -1 : a > l ? 1 : 0);
      let i = s.length > 0 ? `:${De(Object.fromEntries(s))}` : "";
      return `stdio:${De(n)}${i}`;
    }
    let r = xWn(e);
    if (r) {
      return `url:${unwrapCcrProxyUrl(r)}`;
    }
    return null;
  }
  function dedupPluginMcpServers(e, t) {
    let n = new Map();
    for (let [i, a] of Object.entries(t)) {
      let l = getMcpServerSignature(a, {
        includeEnv: false
      });
      if (l && !n.vZc(l)) {
        n.set(l, i);
      }
    }
    let r = {};
    let o = [];
    let s = new Map();
    for (let [i, a] of Object.entries(e)) {
      let l = getMcpServerSignature(a);
      if (l === null) {
        r[i] = a;
        continue;
      }
      let c = getMcpServerSignature(a, {
        includeEnv: false
      });
      let u = c !== null ? n.get(c) : undefined;
      if (u !== undefined) {
        logForDebugging(`Suppressing plugin MCP server "${i}": duplicates manually-configured "${u}"`);
        o.push({
          name: i,
          duplicateOf: u
        });
        continue;
      }
      let d = s.get(l);
      if (d !== undefined) {
        logForDebugging(`Suppressing plugin MCP server "${i}": duplicates earlier plugin server "${d}"`);
        o.push({
          name: i,
          duplicateOf: d
        });
        continue;
      }
      s.set(l, i);
      r[i] = a;
    }
    return {
      servers: r,
      suppressed: o
    };
  }
  function Y$p(e) {
    let t = xWn(e);
    if (t) {
      return unwrapCcrProxyUrl(t);
    }
    let n = RWn(e);
    if (n) {
      return n.join(" ");
    }
    return e.type ?? "unknown";
  }
  function getMcpScopeConflicts(e) {
    let t = new Map();
    for (let {
      scope: r,
      servers: o
    } of e) {
      for (let [s, i] of Object.entries(o)) {
        let a = getMcpServerSignature(i, {
          includeEnv: false
        });
        if (!a) {
          continue;
        }
        let l = t.get(s);
        if (!l) {
          t.set(s, l = []);
        }
        l.push({
          scope: r,
          sig: a,
          endpoint: Y$p(i)
        });
      }
    }
    let n = [];
    for (let [r, o] of t) {
      if (o.length < 2) {
        continue;
      }
      if (new Set(o.map(i => i.sig)).size < 2) {
        continue;
      }
      let s = o.map(i => Py("mcp remove", r, `-s ${i.scope}`)).filter(i => i !== null);
      n.push({
        path: `mcpServers.${r}`,
        message: `Server "${r}" is defined in multiple scopes with different endpoints: ${o.map(i => `${i.scope} (${i.endpoint})`).join(", ")}. OAuth tokens are stored per endpoint, so authenticating in one context will not carry over.`,
        severity: "warning",
        suggestion: s.length > 0 ? `Keep the correct endpoint and remove the others: ${s.map(i => `\`${i}\``).join(" or ")}` : "Keep the correct endpoint and remove the others from the scopes listed above.",
        mcpErrorMetadata: {
          scope: o[0].scope,
          serverName: r,
          severity: "warning"
        }
      });
    }
    return n;
  }
  function suppressedConnectorsEqual(e, t) {
    return e.length === t.length && e.every((n, r) => n.name === t[r]?.name && n.duplicateOf === t[r]?.duplicateOf && n.duplicateOfScope === t[r]?.duplicateOfScope);
  }
  async function dedupClaudeAiMcpServers(e, t) {
    let n = await HIn();
    let r = new Map();
    for (let [i, a] of Object.entries(t)) {
      if (isMcpServerDisabled(i)) {
        continue;
      }
      if ((a.type === "sse" || a.type === "http") && (WIn(i, a, n) || pDi(i, a, n))) {
        continue;
      }
      let l = getMcpServerSignature(a);
      if (l && !r.vZc(l)) {
        r.set(l, {
          name: i,
          scope: a.scope
        });
      }
    }
    let o = {};
    let s = [];
    for (let [i, a] of Object.entries(e)) {
      let l = getMcpServerSignature(a);
      let c = l !== null ? r.get(l) : undefined;
      if (c !== undefined) {
        logForDebugging(`Suppressing claude.ai connector "${i}": duplicates manually-configured "${c.name}"`);
        s.push({
          name: i,
          duplicateOf: c.name,
          duplicateOfScope: c.scope
        });
        continue;
      }
      o[i] = a;
    }
    return {
      servers: o,
      suppressed: s
    };
  }
  function J$p() {
    if (shouldAllowManagedMcpServersOnly()) {
      return getSettingsForSource("policySettings") ?? {};
    }
    return getInitialSettings();
  }
  function X$p() {
    return getInitialSettings();
  }
  function isMcpServerDenied(e, t) {
    let n = X$p();
    if (!n.deniedMcpServers) {
      return false;
    }
    for (let r of n.deniedMcpServers) {
      if (jnt(r) && r.serverName === e) {
        return true;
      }
    }
    if (t) {
      let r = RWn(t);
      if (r) {
        let s = r.map(lNe);
        for (let i of n.deniedMcpServers) {
          if (Myn(i) && THa(i.serverCommand.map(lNe), s)) {
            return true;
          }
        }
      }
      let o = xWn(t);
      if (o) {
        let s = lNe(o);
        for (let i of n.deniedMcpServers) {
          if (Nyn(i) && e5t(s, lNe(i.serverUrl))) {
            return true;
          }
        }
      }
    }
    return false;
  }
  function isMcpServerAllowedByPolicy(e, t) {
    if (isMcpServerDenied(e, t)) {
      return false;
    }
    let n = J$p();
    if (!n.allowedMcpServers) {
      return true;
    }
    if (n.allowedMcpServers.length === 0) {
      return false;
    }
    let r = n.allowedMcpServers.some(Myn);
    let o = n.allowedMcpServers.some(Nyn);
    if (t) {
      let s = RWn(t);
      let i = xWn(t);
      if (s) {
        if (r) {
          let a = s.map(lNe);
          for (let l of n.allowedMcpServers) {
            if (Myn(l) && THa(l.serverCommand.map(lNe), a)) {
              return true;
            }
          }
          return false;
        } else {
          for (let a of n.allowedMcpServers) {
            if (jnt(a) && a.serverName === e) {
              return true;
            }
          }
          return false;
        }
      } else if (i) {
        if (o) {
          let a = lNe(i);
          for (let l of n.allowedMcpServers) {
            if (Nyn(l) && e5t(a, lNe(l.serverUrl))) {
              return true;
            }
          }
          return false;
        } else {
          for (let a of n.allowedMcpServers) {
            if (jnt(a) && a.serverName === e) {
              return true;
            }
          }
          return false;
        }
      } else {
        for (let a of n.allowedMcpServers) {
          if (jnt(a) && a.serverName === e) {
            return true;
          }
        }
        return false;
      }
    }
    for (let s of n.allowedMcpServers) {
      if (jnt(s) && s.serverName === e) {
        return true;
      }
    }
    return false;
  }
  function isBuiltinInProcessMcpServer(e) {
    return isClaudeInChromeMCPServer(e) || j4e(e);
  }
  function filterMcpServersByPolicy(e) {
    let t = {};
    let n = [];
    for (let [r, o] of Object.entries(e)) {
      let s = o;
      if (s.type === "sdk" || isMcpServerAllowedByPolicy(r, s)) {
        t[r] = o;
      } else {
        n.push(r);
      }
    }
    return {
      allowed: t,
      blocked: n
    };
  }
  function isMcpServerBlockedAtConnectTime(e, t) {
    if (!Q$p.vZc(t.scope)) {
      return false;
    }
    if (t.scope === "claudeai" && hasDisableClaudeAiConnectors()) {
      return true;
    }
    if (t.type === "sdk") {
      return false;
    }
    if (isBuiltinInProcessMcpServer(e) || t.type === "sse-ide" || t.type === "ws-ide") {
      return isMcpServerDenied(e, t);
    }
    return !isMcpServerAllowedByPolicy(e, t);
  }
  function filterDynamicMcpServersByPolicy(e) {
    if (!e) {
      return {
        configs: {},
        blocked: []
      };
    }
    let t = {};
    let n = [];
    for (let [r, o] of Object.entries(e)) {
      if (isMcpServerBlockedAtConnectTime(r, o)) {
        n.push(r);
      } else {
        t[r] = o;
      }
    }
    return {
      configs: t,
      blocked: n
    };
  }
  function Z$p(e) {
    let t = [];
    function n(o) {
      let {
        expanded: s,
        missingVars: i
      } = Eoe(o);
      t.push(...i);
      return s;
    }
    let r;
    switch (e.type) {
      case undefined:
      case "stdio":
        {
          let o = e;
          r = {
            ...o,
            command: n(o.command),
            args: o.args.map(n),
            env: o.env ? Sbu(o.env, n) : undefined
          };
          break;
        }
      case "sse":
      case "http":
      case "ws":
        {
          let o = e;
          r = {
            ...o,
            url: n(o.url),
            headers: o.headers ? Sbu(o.headers, n) : undefined
          };
          break;
        }
      case "sse-ide":
      case "ws-ide":
        r = e;
        break;
      case "sdk":
        r = e;
        break;
      case "claudeai-proxy":
        r = e;
        break;
    }
    return {
      expanded: r,
      missingVars: Ro(t)
    };
  }
  async function addMcpConfig(e, t, n) {
    if (e.match(/[^a-zA-Z0-9_-]/)) {
      throw Error(`Invalid name ${e}. Names can only contain letters, numbers, hyphens, and underscores.`);
    }
    if (wGe(e)) {
      throw Error(`Cannot add MCP server "${e}": this name is reserved.`);
    }
    if (doesEnterpriseMcpConfigExist()) {
      throw Error("Cannot add MCP server: enterprise MCP configuration is active and has exclusive control over MCP servers");
    }
    let r = vle().safeParse(t);
    if (!r.success) {
      let s = r.error.issues.map(i => `${i.path.join(".")}: ${i.message}`).join(", ");
      throw Error(`Invalid configuration: ${s}`);
    }
    let o = r.data;
    if (isMcpServerDenied(e, o)) {
      throw Error(`Cannot add MCP server "${e}": server is explicitly blocked by enterprise policy`);
    }
    if (!isMcpServerAllowedByPolicy(e, o)) {
      throw Error(`Cannot add MCP server "${e}": not allowed by enterprise policy`);
    }
    switch (n) {
      case "project":
        {
          let s = await readRawMcpJsonServersFromCwd();
          if (Object.hasOwn(s, e)) {
            throw $o(Error(`MCP server ${e} already exists in .mcp.json`), "MCP server already exists in .mcp.json");
          }
          break;
        }
      case "user":
        {
          if (getGlobalConfig().mcpServers?.[e]) {
            throw $o(Error(`MCP server ${e} already exists in user config`), "MCP server already exists in user config");
          }
          break;
        }
      case "local":
        {
          if (getCurrentProjectConfig().mcpServers?.[e]) {
            throw $o(Error(`MCP server ${e} already exists in local config`), "MCP server already exists in local config");
          }
          break;
        }
      case "dynamic":
        throw Error("Cannot add MCP server to scope: dynamic");
      case "enterprise":
        throw Error("Cannot add MCP server to scope: enterprise");
      case "claudeai":
        throw Error("Cannot add MCP server to scope: claudeai");
    }
    switch (n) {
      case "project":
        {
          let s = await readRawMcpJsonServersFromCwd();
          s[e] = o;
          try {
            await SHa({
              mcpServers: s
            });
          } catch (i) {
            throw Ae("mcp_config_add", "mcp_config_write_failed"), Error(`Failed to write to .mcp.json: ${i}`);
          }
          break;
        }
      case "user":
        {
          saveGlobalConfig(s => ({
            ...s,
            mcpServers: {
              ...s.mcpServers,
              [e]: o
            }
          }));
          break;
        }
      case "local":
        {
          saveCurrentProjectConfig(s => ({
            ...s,
            mcpServers: {
              ...s.mcpServers,
              [e]: o
            }
          }));
          break;
        }
      default:
        throw Error(`Cannot add MCP server to scope: ${n}`);
    }
    Pe("mcp_config_add");
  }
  async function removeMcpConfig(e, t) {
    switch (t) {
      case "project":
        {
          let n = await readRawMcpJsonServersFromCwd();
          if (!Object.hasOwn(n, e)) {
            throw Error(`No MCP server named "${e}" in .mcp.json`);
          }
          delete n[e];
          try {
            await SHa({
              mcpServers: n
            });
          } catch (r) {
            throw Ae("mcp_config_remove", "mcp_config_write_failed"), Error(`Failed to remove from .mcp.json: ${r}`);
          }
          break;
        }
      case "user":
        {
          if (!getGlobalConfig().mcpServers?.[e]) {
            throw Error(`No MCP server named "${e}" in user scope`);
          }
          saveGlobalConfig(r => {
            let {
              [e]: o,
              ...s
            } = r.mcpServers ?? {};
            return {
              ...r,
              mcpServers: s
            };
          });
          break;
        }
      case "local":
        {
          if (!getCurrentProjectConfig().mcpServers?.[e]) {
            throw Error(`No MCP server named "${e}" in local scope`);
          }
          saveCurrentProjectConfig(r => {
            let {
              [e]: o,
              ...s
            } = r.mcpServers ?? {};
            return {
              ...r,
              mcpServers: s
            };
          });
          break;
        }
      default:
        throw Error(`Cannot remove MCP server from scope: ${t}`);
    }
    Pe("mcp_config_remove");
  }
  async function readRawMcpJsonServersFromCwd() {
    let e = fpe.join(Nt(), ".mcp.json");
    let t;
    try {
      t = await bHa.readFile(e, "utf8");
    } catch (r) {
      if (en(r) === "ENOENT") {
        return {};
      }
      throw r;
    }
    if (!t.trim()) {
      return {};
    }
    let n = v.object({
      mcpServers: v.record(v.string(), v.unknown()).default({})
    }).safeParse(Ba(t, false));
    if (!n.success) {
      throw Error(".mcp.json is malformed (not valid JSON, or mcpServers is not an object)");
    }
    return n.data.mcpServers;
  }
  function getMcpConfigsByScope(e, {
    expandVars: t = true
  } = {}) {
    if (getIsRemoteMode()) {
      return {
        servers: O$(),
        errors: []
      };
    }
    let n = {
      project: "projectSettings",
      user: "userSettings",
      local: "localSettings"
    };
    if (e in n && !qf(n[e])) {
      return {
        servers: O$(),
        errors: []
      };
    }
    switch (e) {
      case "project":
        {
          let r = O$();
          let o = [];
          let s = [];
          let i = getOriginalCwd();
          while (i !== fpe.parse(i).root) {
            s.push(i);
            i = fpe.dirname(i);
          }
          for (let a of s.reverse()) {
            let l = fpe.join(a, ".mcp.json");
            let {
              config: c,
              errors: u
            } = parseMcpConfigFromFilePath({
              filePath: l,
              expandVars: t,
              scope: "project"
            });
            if (!c) {
              let d = u.filter(p => !p.message.startsWith("MCP config file not found"));
              if (d.length > 0) {
                logForDebugging(`MCP config errors for ${l}: ${De(d.map(p => p.message))}`, {
                  level: "error"
                });
                o.push(...d);
              }
              continue;
            }
            if (c.mcpServers) {
              Object.assign(r, wWn(c.mcpServers, e));
            }
            if (u.length > 0) {
              o.push(...u);
            }
          }
          return {
            servers: r,
            errors: o
          };
        }
      case "user":
        {
          let r = getGlobalConfig().mcpServers;
          if (!r) {
            return {
              servers: O$(),
              errors: []
            };
          }
          let {
            config: o,
            errors: s
          } = parseMcpConfig({
            configObject: {
              mcpServers: r
            },
            expandVars: t,
            scope: "user"
          });
          return {
            servers: wWn(o?.mcpServers, e),
            errors: s
          };
        }
      case "local":
        {
          let r = getCurrentProjectConfig().mcpServers;
          if (!r) {
            return {
              servers: O$(),
              errors: []
            };
          }
          let {
            config: o,
            errors: s
          } = parseMcpConfig({
            configObject: {
              mcpServers: r
            },
            expandVars: t,
            scope: "local"
          });
          return {
            servers: wWn(o?.mcpServers, e),
            errors: s
          };
        }
      case "enterprise":
        {
          let r = getEnterpriseMcpFilePath();
          let {
            config: o,
            errors: s
          } = parseMcpConfigFromFilePath({
            filePath: r,
            expandVars: t,
            scope: "enterprise"
          });
          if (!o) {
            let i = s.filter(a => !a.message.startsWith("MCP config file not found"));
            if (i.length > 0) {
              logForDebugging(`Enterprise MCP config errors for ${r}: ${De(i.map(a => a.message))}`, {
                level: "error"
              });
              return {
                servers: O$(),
                errors: i
              };
            }
            return {
              servers: O$(),
              errors: []
            };
          }
          return {
            servers: wWn(o.mcpServers, e),
            errors: s
          };
        }
    }
  }
  function getMcpConfigByName(e) {
    let {
      servers: t
    } = getMcpConfigsByScope("enterprise");
    if (ZT("mcp")) {
      return t[e] ?? null;
    }
    let {
      servers: n
    } = getMcpConfigsByScope("user");
    let {
      servers: r
    } = getMcpConfigsByScope("project");
    let {
      servers: o
    } = getMcpConfigsByScope("local");
    if (t[e]) {
      return t[e];
    }
    if (o[e]) {
      return o[e];
    }
    if (r[e] && P6e(e) === "approved") {
      return r[e];
    }
    if (n[e]) {
      return n[e];
    }
    return null;
  }
  async function getClaudeCodeMcpConfigs(e = {}, t = {}) {
    if (Pc("mcpAutoDiscovered")) {
      return {
        servers: O$(),
        pendingProjectServers: new Set(),
        rejectedProjectServers: new Set(),
        errors: [],
        warnings: []
      };
    }
    let {
      servers: n
    } = getMcpConfigsByScope("enterprise");
    if (doesEnterpriseMcpConfigExist()) {
      let k = O$();
      for (let [I, O] of Object.entries(n)) {
        if (!isMcpServerAllowedByPolicy(I, O)) {
          continue;
        }
        k[I] = O;
      }
      return {
        servers: k,
        pendingProjectServers: new Set(),
        rejectedProjectServers: new Set(),
        errors: [],
        warnings: []
      };
    }
    let r = ZT("mcp");
    let o = {
      servers: O$()
    };
    let {
      servers: s
    } = r ? o : getMcpConfigsByScope("user");
    let {
      servers: i
    } = r ? o : getMcpConfigsByScope("project");
    let {
      servers: a
    } = r ? o : getMcpConfigsByScope("local");
    let l = r ? O$() : GIn();
    let c = O$();
    let u = t.pluginLoadResult ?? (await loadAllPluginsCacheOnly());
    let d = [];
    let p = [];
    if (u.errors.length > 0) {
      for (let k of u.errors) {
        if (k.type === "mcp-config-invalid" || k.type === "mcpb-download-failed" || k.type === "mcpb-extract-failed" || k.type === "mcpb-invalid-manifest") {
          let I = `Plugin MCP loading error - ${k.type}: ${hS(k)}`;
          logForDebugging(I, {
            level: "error"
          });
        } else {
          let I = k.type;
          logForDebugging(`Plugin not available for MCP: ${k.source} - error type: ${I}`);
        }
      }
    }
    let m = new Set();
    let f = new Set();
    let h = t.includePendingProjectServers || t.includeRejectedProjectServers ? o5t : P6e;
    let g = await Promise.all(u.enabled.map(async k => {
      let I = await yWn(k, d);
      if (!I || !xut(k)) {
        return I;
      }
      return d_u(I, (O, M) => {
        let L = h(M);
        if (L === "approved") {
          return true;
        }
        if (L === "pending" && t.includePendingProjectServers) {
          m.add(M);
          return true;
        }
        if (L === "rejected" && t.includeRejectedProjectServers) {
          f.add(M);
          return true;
        }
        return false;
      });
    }));
    for (let k of g) {
      if (k) {
        Object.assign(c, k);
      }
    }
    if (d.length > 0) {
      for (let k of d) {
        let I = `Plugin MCP server error - ${k.type}: ${hS(k)}`;
        logForDebugging(I, {
          level: "error"
        });
      }
    }
    let y = O$();
    for (let [k, I] of Object.entries(i)) {
      let O = h(k);
      if (O === "approved") {
        y[k] = I;
        continue;
      }
      if (k in a || k in s || k in c || l[k]) {
        continue;
      }
      if (O === "pending" && t.includePendingProjectServers) {
        y[k] = I;
        m.add(k);
      } else if (O === "rejected" && t.includeRejectedProjectServers) {
        y[k] = I;
        f.add(k);
      }
    }
    let _ = {};
    for (let [k, I] of Object.entries({
      ...l,
      ...s,
      ...y,
      ...a,
      ...e
    })) {
      if (!isMcpServerDisabled(k) && !m.vZc(k) && !f.vZc(k) && isMcpServerAllowedByPolicy(k, I)) {
        _[k] = I;
      }
    }
    let b = {};
    let S = {};
    for (let [k, I] of Object.entries(c)) {
      if (isMcpServerDisabled(k) || m.vZc(k) || f.vZc(k) || !isMcpServerAllowedByPolicy(k, I)) {
        S[k] = I;
      } else {
        b[k] = I;
      }
    }
    let {
      servers: E,
      suppressed: C
    } = dedupPluginMcpServers(b, _);
    Object.assign(E, S);
    for (let {
      name: k,
      duplicateOf: I
    } of C) {
      let O = k.split(":");
      if (O[0] !== "plugin" || O.length < 3) {
        continue;
      }
      p.push({
        type: "mcp-server-suppressed-duplicate",
        source: k,
        plugin: O[1],
        serverName: O.slice(2).join(":"),
        duplicateOf: I
      });
    }
    let x = Object.assign({}, l, E, s, y, a);
    let A = O$();
    for (let [k, I] of Object.entries(x)) {
      if (!isMcpServerAllowedByPolicy(k, I)) {
        continue;
      }
      A[k] = I;
    }
    for (let k of [m, f]) {
      for (let I of k) {
        let O = A[I]?.scope;
        if (O !== "project" && O !== "dynamic") {
          k.delete(I);
        }
      }
    }
    return {
      servers: A,
      pendingProjectServers: m,
      rejectedProjectServers: f,
      errors: d,
      warnings: p
    };
  }
  async function getAllMcpConfigs(e = {}) {
    if (shouldSkipClaudeAiFetchForEnterpriseLockdown()) {
      return getClaudeCodeMcpConfigs({}, e);
    }
    let t = iNe();
    let {
      servers: n,
      pendingProjectServers: r,
      rejectedProjectServers: o,
      errors: s,
      warnings: i
    } = await getClaudeCodeMcpConfigs({}, e);
    let {
      allowed: a
    } = filterMcpServersByPolicy((await t) ?? {});
    EWn();
    let l = e.includePendingProjectServers || e.includeRejectedProjectServers ? d_u(n, (d, p) => !r.vZc(p) && !o.vZc(p)) : n;
    let {
      servers: c
    } = await dedupClaudeAiMcpServers(a, l);
    let u = Object.assign(O$(), c, n);
    for (let d of [r, o]) {
      for (let p of d) {
        if (Object.hasOwn(c, p)) {
          u[p] = c[p];
          d.delete(p);
        }
      }
    }
    return {
      servers: u,
      pendingProjectServers: r,
      rejectedProjectServers: o,
      errors: s,
      warnings: i
    };
  }
  async function getConnectablePluginMcpServerNames(e = {}) {
    if (getStrictMcpConfig()) {
      return new Set();
    }
    let t = await loadAllPluginsForPreview();
    let {
      servers: n
    } = await getClaudeCodeMcpConfigs(e, {
      pluginLoadResult: t
    });
    let r = new Set();
    for (let [o, s] of Object.entries(n)) {
      if (s.pluginSource !== undefined) {
        r.add(o);
      }
    }
    return r;
  }
  function parseMcpConfig(e) {
    let {
      configObject: t,
      expandVars: n,
      scope: r,
      filePath: o
    } = e;
    let s = v.object({
      mcpServers: v.record(v.string(), v.unknown())
    }).safeParse(t);
    if (!s.success) {
      let c = t !== null && typeof t === "object" && "servers" in t && !("mcpServers" in t);
      return {
        config: null,
        errors: s.error.issues.map(u => ({
          ...(o && {
            file: o
          }),
          path: u.path.join("."),
          message: c ? 'Missing "mcpServers" \u2014 found "servers" instead. Claude Code reads MCP servers from the "mcpServers" key.' : u.message,
          ...(c && {
            suggestion: `Rename the top-level "servers" key to "mcpServers" in ${o ?? "your MCP config"}.`
          }),
          mcpErrorMetadata: {
            scope: r,
            severity: "fatal"
          }
        }))
      };
    }
    let i = [];
    let a = {};
    function l(c, u, d) {
      i.push({
        ...(o && {
          file: o
        }),
        path: `mcpServers.${c}`,
        message: u,
        ...(d && {
          suggestion: d
        }),
        mcpErrorMetadata: {
          scope: r,
          serverName: c,
          severity: "warning"
        }
      });
    }
    for (let [c, u] of Object.entries(s.data.mcpServers)) {
      let d = u && typeof u === "object" && "type" in u && typeof u.type === "string" ? u.type : "stdio";
      let p = Object.hasOwn(yHa, d) ? yHa[d] : undefined;
      if (!p) {
        l(c, `Skipped \u2014 unknown MCP server type "${d}" for server "${c}"`, "Valid types are: stdio, sse, http (or streamable-http), ws, sdk");
        continue;
      }
      let m = p().safeParse(u);
      if (!m.success) {
        let g = m.error.issues.map(y => {
          let _ = y.message.replace(/^Invalid input: /, "");
          return `${y.path.join(".") || "(root)"}: ${_}`;
        }).join("; ");
        l(c, `Skipped \u2014 invalid MCP server config for "${c}": ${g}`);
        continue;
      }
      let f = m.data;
      if (wGe(c) && f.type !== "sdk") {
        l(c, `"${c}" is a reserved MCP server name and was not loaded`, `Rename this server in your MCP config \u2014 "${c}" is reserved for internal use`);
        continue;
      }
      let h = f;
      if (n) {
        let {
          expanded: g,
          missingVars: y
        } = Z$p(f);
        if (y.length > 0) {
          l(c, `Missing environment variables: ${y.join(", ")}`, `Set the following environment variables: ${y.join(", ")}`);
        }
        h = g;
      }
      a[c] = h;
    }
    return {
      config: {
        mcpServers: a
      },
      errors: i
    };
  }
  function parseMcpConfigFromFilePath(e) {
    let {
      filePath: t,
      expandVars: n,
      scope: r
    } = e;
    let o = zt();
    let s;
    try {
      let a = r === "dynamic" ? o.readFileSync(t, {
        encoding: "utf8"
      }) : Jqi(o, t, 2097152);
      if (a === null) {
        logForDebugging(`MCP config skipped for ${t} (scope=${r}): not a regular file or exceeds ${2097152} byte limit`, {
          level: "warn"
        });
        Ae("mcp_config_parse", "mcp_config_shape_gate");
        return {
          config: null,
          errors: [{
            file: t,
            path: "",
            message: `MCP config is not a regular file or exceeds ${2097152} bytes: ${t}`,
            suggestion: "Check that the path is a plain JSON file (not a device, FIFO, or symlink to one)",
            mcpErrorMetadata: {
              scope: r,
              severity: "fatal"
            }
          }]
        };
      }
      s = a;
    } catch (a) {
      if (en(a) === "ENOENT") {
        return {
          config: null,
          errors: [{
            file: t,
            path: "",
            message: `MCP config file not found: ${t}`,
            suggestion: "Check that the file path is correct",
            mcpErrorMetadata: {
              scope: r,
              severity: "fatal"
            }
          }]
        };
      }
      logForDebugging(`MCP config read error for ${t} (scope=${r}): ${a}`, {
        level: "error"
      });
      Ae("mcp_config_parse", "mcp_config_read_failed");
      return {
        config: null,
        errors: [{
          file: t,
          path: "",
          message: `Failed to read file: ${a}`,
          suggestion: "Check file permissions and ensure the file exists",
          mcpErrorMetadata: {
            scope: r,
            severity: "fatal"
          }
        }]
      };
    }
    let i = Ba(s, false);
    if (!i) {
      logForDebugging(`MCP config is not valid JSON: ${t} (scope=${r}, length=${s.length}, first100=${De(s.slice(0, 100))})`, {
        level: "error"
      });
      Ae("mcp_config_parse", "mcp_config_invalid_json");
      return {
        config: null,
        errors: [{
          file: t,
          path: "",
          message: "MCP config is not a valid JSON",
          suggestion: "Fix the JSON syntax errors in the file",
          mcpErrorMetadata: {
            scope: r,
            severity: "fatal"
          }
        }]
      };
    }
    Pe("mcp_config_parse");
    return parseMcpConfig({
      configObject: i,
      expandVars: n,
      scope: r,
      filePath: t
    });
  }
  function shouldSkipClaudeAiFetchForEnterpriseLockdown() {
    if (!doesEnterpriseMcpConfigExist()) {
      return false;
    }
    if (getAllPolicyTierSettings().some(e => e.allowAllClaudeAiMcps === true)) {
      return false;
    }
    return true;
  }
  function shouldAllowManagedMcpServersOnly() {
    return getSettingsForSource("policySettings")?.allowManagedMcpServersOnly === true;
  }
  function areMcpConfigsAllSdkType(e) {
    return Object.values(e).every(t => t.type === "sdk");
  }
  function areMcpConfigsAllowedWithEnterpriseMcpConfig(e) {
    return Object.values(e).every(t => t.type === "sdk" && t.name === "claude-vscode");
  }
  function bSo(e) {
    return e === "computer-use";
  }
  function isMcpServerDisabled(e) {
    let t = getCurrentProjectConfig();
    if (bSo(e)) {
      return !(t.enabledMcpServers || []).includes(e);
    }
    return (t.disabledMcpServers || []).includes(e);
  }
  function _Ha(e, t, n) {
    if (e.includes(t) === n) {
      return e;
    }
    return n ? [...e, t] : e.filter(o => o !== t);
  }
  function setMcpServerEnabled(e, t) {
    let n = bSo(e) && isMcpServerDisabled(e) === t;
    if (saveCurrentProjectConfig(r => {
      if (bSo(e)) {
        let i = r.enabledMcpServers || [];
        let a = _Ha(i, e, t);
        if (a === i) {
          return r;
        }
        return {
          ...r,
          enabledMcpServers: a
        };
      }
      let o = r.disabledMcpServers || [];
      let s = _Ha(o, e, !t);
      if (s === o) {
        return r;
      }
      return {
        ...r,
        disabledMcpServers: s
      };
    }), n) {
      logEvent("tengu_builtin_mcp_toggle", {
        serverName: e,
        enabled: t
      });
    }
    Pe("mcp_server_toggle");
  }
  var bHa;
  var fpe;
  var K$p;
  var Q$p;
  var MCP_SETTINGS_SCOPES;
  var yHa;
  var doesEnterpriseMcpConfigExist;
  var Iw = __lazy(() => {
    at();
    cV();
    b1();
    Cbe();
    wb();
    vo();
    je();
    dt();
    Zl();
    n1();
    Gd();
    sNe();
    Kf();
    xg();
    nf();
    Bte();
    IJ();
    Rj();
    mSo();
    ln();
    Ot();
    Oce();
    l9();
    fat();
    yFn();
    Lke();
    Bat();
    G1();
    bHa = require("fs/promises");
    fpe = require("path");
    K$p = new Set(pSo);
    Q$p = new Set(["dynamic", "agent", "claudeai"]);
    MCP_SETTINGS_SCOPES = ["enterprise", "local", "user", "project"];
    yHa = {
      stdio: MMt,
      sse: L1r,
      http: yyn,
      "streamable-http": yyn,
      ws: F1r,
      sdk: U1r,
      "claudeai-proxy": B1r
    };
    doesEnterpriseMcpConfigExist = TEr(() => {
      let {
        config: e
      } = parseMcpConfigFromFilePath({
        filePath: getEnterpriseMcpFilePath(),
        expandVars: true,
        scope: "enterprise"
      });
      return e !== null;
    });
  });
  function AWn(e) {
    if (e.type !== "failed") {
      return false;
    }
    let t = e.config.type ?? "";
    if (!eHp.vZc(t)) {
      return false;
    }
    if (e.errorCode !== undefined) {
      return kSo.vZc(e.errorCode);
    }
    return t === "sse";
  }
  function hpe(e, t) {
    let n = `mcp__${Bl(t)}__`;
    return e.filter(r => r.name?.startsWith(n));
  }
  function u3(e, t) {
    let n = Bl(t);
    let r = e.name;
    if (!r) {
      return false;
    }
    return r.startsWith(`mcp__${n}__`) || r.startsWith(`${n}:`);
  }
  function IWn(e, t) {
    return e.filter(n => u3(n, t) && !(n.type === "prompt" && n.loadedFrom === "mcp"));
  }
  function PWn(e, t) {
    let n = `mcp__${Bl(t)}__`;
    return e.filter(r => !r.name?.startsWith(n));
  }
  function zft(e, t) {
    return e.filter(n => !u3(n, t));
  }
  function Kft(e, t) {
    let n = {
      ...e
    };
    delete n[t];
    return n;
  }
  function cNe(e) {
    let {
      scope: t,
      pluginSource: n,
      pluginPath: r,
      configError: o,
      ...s
    } = e;
    let i = s;
    if (delete i.tools, i.type === "stdio" || i.type === undefined && "command" in i) {
      i.type = "stdio";
      i.args = i.args ?? [];
    }
    let a = De(i, (l, c) => {
      if (c && typeof c === "object" && !Array.isArray(c)) {
        let u = c;
        let d = {};
        for (let p of Object.keys(u).sort()) {
          d[p] = u[p];
        }
        return d;
      }
      return c;
    });
    return CHa.createHash("sha256").update(a).digest("hex").slice(0, 16);
  }
  function xHa(e, t) {
    let n = e.clients.filter(l => {
      let c = t[l.name];
      if (!c) {
        if (l.config.scope === "dynamic") {
          dn(l.name, "excludeStalePluginClients: marking stale (removed)");
          return true;
        }
        return false;
      }
      if (cNe(l.config) !== cNe(c)) {
        dn(l.name, "excludeStalePluginClients: marking stale (config hash changed)");
        return true;
      }
      return false;
    });
    if (n.length === 0) {
      return {
        ...e,
        stale: []
      };
    }
    let {
      tools: r,
      commands: o,
      resources: s
    } = e;
    let i = {
      ...e.resourceTemplates
    };
    for (let l of n) {
      r = PWn(r, l.name);
      o = zft(o, l.name);
      s = Kft(s, l.name);
      delete i[l.name];
    }
    let a = new Set(n.map(l => l.name));
    return {
      clients: e.clients.filter(l => !a.vZc(l.name)),
      tools: r,
      commands: o,
      resources: s,
      resourceTemplates: i,
      stale: n
    };
  }
  function D$(e) {
    switch (e) {
      case "user":
        return hI();
      case "project":
        return RHa.join(Nt(), ".mcp.json");
      case "local":
        return `${hI()} [project: ${Nt()}]`;
      case "dynamic":
        return "Dynamically configured";
      case "enterprise":
        return getEnterpriseMcpFilePath();
      case "claudeai":
        return "claude.ai";
      case "agent":
        return "agent frontmatter";
      default:
        return e;
    }
  }
  function s5t(e) {
    switch (e) {
      case "local":
        return "Local config (private to you in this project)";
      case "project":
        return "Project config (shared via .mcp.json)";
      case "user":
        return "User config (available in all your projects)";
      case "dynamic":
        return "Dynamic config (from command line)";
      case "enterprise":
        return "Enterprise config (managed by your organization)";
      case "claudeai":
        return "claude.ai config";
      case "agent":
        return "Agent config (from agent frontmatter)";
      default:
        return e;
    }
  }
  function Yft(e) {
    if (!e) {
      return "local";
    }
    if (!N1r().options.includes(e)) {
      throw Error(`Invalid scope: ${e}. Must be one of: ${N1r().options.join(", ")}`);
    }
    return e;
  }
  function kHa(e) {
    if (!e) {
      return "stdio";
    }
    if (e === "streamable-http") {
      return "http";
    }
    if (e !== "stdio" && e !== "sse" && e !== "http") {
      throw Error(`Invalid transport type: ${e}. Must be one of: stdio, sse, http (or streamable-http)`);
    }
    return e;
  }
  function ASo(e) {
    let t = {};
    for (let n of e) {
      let r = n.indexOf(":");
      if (r === -1) {
        throw Error(`Invalid header format: "${n}". Expected format: "Header-Name: value"`);
      }
      let o = n.substring(0, r).trim();
      let s = n.substring(r + 1).trim();
      if (!o) {
        throw Error(`Invalid header: "${n}". Header name cannot be empty.`);
      }
      t[o] = s;
    }
    return t;
  }
  function tHp(e) {
    let t = getWorkspacePersistedTrustKey();
    if (getSessionApprovedMcpServers().some(o => o.workspaceKey === t && qMt(o.name, e))) {
      return true;
    }
    let n = !projectSettingsAliasesUserSettings();
    let r = isLocalSettingsGitTracked();
    for (let o of ew()) {
      if (o === "projectSettings" && n) {
        continue;
      }
      if (o === "localSettings" && r) {
        continue;
      }
      let s = getSettingsForSource(o);
      if (!s) {
        continue;
      }
      if (s.enableAllProjectMcpServers) {
        return true;
      }
      if (s.enabledMcpjsonServers?.some(i => qMt(i, e))) {
        return true;
      }
    }
    return false;
  }
  function o5t(e) {
    let t = getInitialSettings();
    if (t?.disabledMcpjsonServers?.some(n => qMt(n, e))) {
      return "rejected";
    }
    if (!isWorkspacePersistedTrusted()) {
      return tHp(e) ? "approved" : "pending";
    }
    if (t?.enabledMcpjsonServers?.some(n => qMt(n, e)) || t?.enableAllProjectMcpServers) {
      return "approved";
    }
    return "pending";
  }
  function P6e(e) {
    let t = o5t(e);
    if (t !== "pending") {
      return t;
    }
    if (getSessionBypassPermissionsMode() && hasSkipDangerousModePermissionPrompt() && qf("projectSettings")) {
      return "approved";
    }
    if (getIsNonInteractiveSession() && qf("projectSettings")) {
      return "approved";
    }
    return "pending";
  }
  function nHp(e) {
    if (!bM({
      name: e
    })) {
      return null;
    }
    let t = TI(e);
    if (!t) {
      return null;
    }
    let n = getMcpConfigByName(t.serverName);
    if (!n && t.serverName.startsWith("claude_ai_")) {
      return "claudeai";
    }
    return n?.scope ?? null;
  }
  function ISo(e) {
    if (!bM(e)) {
      return null;
    }
    return e.mcpInfo?.scope ?? nHp(e.name);
  }
  function rHp(e) {
    return e.type === "stdio" || e.type === undefined;
  }
  function oHp(e) {
    return e.type === "sse";
  }
  function sHp(e) {
    return e.type === "http";
  }
  function iHp(e) {
    return e.type === "ws";
  }
  function PSo(e) {
    switch (e.type) {
      case undefined:
      case "stdio":
      case "sse":
      case "http":
      case "sdk":
        return true;
      case "ws":
      case "sse-ide":
      case "ws-ide":
      case "claudeai-proxy":
        return false;
      default:
        return false;
    }
  }
  function AHa(e) {
    let t = new Map();
    for (let r of e) {
      if (!r.mcpServers?.length) {
        continue;
      }
      for (let o of r.mcpServers) {
        if (typeof o === "string") {
          continue;
        }
        let s = Object.entries(o);
        if (s.length !== 1) {
          continue;
        }
        let [i, a] = s[0];
        let l = t.get(i);
        if (l) {
          if (!l.sourceAgents.includes(r.agentType)) {
            l.sourceAgents.push(r.agentType);
          }
        } else {
          t.set(i, {
            config: {
              ...a,
              name: i
            },
            sourceAgents: [r.agentType]
          });
        }
      }
    }
    let n = [];
    for (let [r, {
      config: o,
      sourceAgents: s
    }] of t) {
      if (rHp(o)) {
        n.push({
          name: r,
          sourceAgents: s,
          transport: "stdio",
          command: o.command,
          needsAuth: false
        });
      } else if (oHp(o)) {
        n.push({
          name: r,
          sourceAgents: s,
          transport: "sse",
          url: o.url,
          needsAuth: true
        });
      } else if (sHp(o)) {
        n.push({
          name: r,
          sourceAgents: s,
          transport: "http",
          url: o.url,
          needsAuth: true
        });
      } else if (iHp(o)) {
        n.push({
          name: r,
          sourceAgents: s,
          transport: "ws",
          url: o.url,
          needsAuth: false
        });
      }
    }
    return n.sort((r, o) => r.name.localeCompare(o.name));
  }
  function d3(e) {
    return e ? i3i.createHash("sha256").update(e).digest("hex").slice(0, 12) : undefined;
  }
  function u9(e) {
    return d3(RIe(e));
  }
  var CHa;
  var RHa;
  var eHp;
  var xSo;
  var kSo;
  var G1 = __lazy(() => {
    at();
    vo();
    pr();
    dw();
    Rn();
    nf();
    Iw();
    EI();
    Lke();
    Bat();
    CHa = require("crypto");
    RHa = require("path");
    eHp = new Set(["http", "sse", "claudeai-proxy"]);
    xSo = new Set(["ECONNREFUSED", "ETIMEDOUT", "ECONNRESET", "ENOTFOUND", "EAI_AGAIN", "ConnectionRefused", "ConnectionClosed", "FailedToOpenSocket"]);
    kSo = new Set(["500", "502", "503", "504", ...xSo, "23"]);
  });
  function OHa(e) {
    return (t, n) => {
      let r = AbortSignal.timeout(30000);
      let o = e ? AbortSignal.any([r, e]) : r;
      return fetch(t, {
        ...n,
        ...getProxyFetchOptions({
          url: String(t)
        }),
        signal: o
      });
    };
  }
  function OWn(e) {
    try {
      return new URL(e).href.replace(/\/$/, "");
    } catch {
      return e.replace(/\/$/, "");
    }
  }
  function i5t(e) {
    return (typeof e === "string" ? e : De(e)).replace(uHp, (n, r) => `"${r}":"[REDACTED]"`);
  }
  async function mHp(e, t) {
    let n;
    try {
      n = await DIn(e, undefined, t?.fetchFn ?? DWn);
    } catch (r) {
      throw Error(`XAA: PRM discovery failed: ${r instanceof Error ? r.message : String(r)}`);
    }
    if (!n.resource || !n.authorization_servers?.[0]) {
      throw Error("XAA: PRM discovery failed: PRM missing resource or authorization_servers");
    }
    if (OWn(n.resource) !== OWn(e)) {
      throw Error(`XAA: PRM discovery failed: PRM resource mismatch: expected ${e}, got ${n.resource}`);
    }
    return {
      resource: n.resource,
      authorization_servers: n.authorization_servers
    };
  }
  async function fHp(e, t) {
    let n = await S4e(e, {
      fetchFn: t?.fetchFn ?? DWn
    });
    if (!n?.issuer || !n.token_endpoint) {
      throw Error(`XAA: AS metadata discovery failed: no valid metadata at ${e}`);
    }
    if (OWn(n.issuer) !== OWn(e)) {
      throw Error(`XAA: AS metadata discovery failed: issuer mismatch: expected ${e}, got ${n.issuer}`);
    }
    if (new URL(n.token_endpoint).protocol !== "https:") {
      throw Error(`XAA: refusing non-HTTPS token endpoint: ${n.token_endpoint}`);
    }
    return {
      issuer: n.issuer,
      token_endpoint: n.token_endpoint,
      grant_types_supported: n.grant_types_supported,
      token_endpoint_auth_methods_supported: n.token_endpoint_auth_methods_supported
    };
  }
  async function hHp(e) {
    let t = e.fetchFn ?? DWn;
    let n = new URLSearchParams({
      grant_type: "urn:ietf:params:oauth:grant-type:token-exchange",
      requested_token_type: "urn:ietf:params:oauth:token-type:id-jag",
      audience: e.audience,
      resource: e.resource,
      subject_token: e.idToken,
      subject_token_type: "urn:ietf:params:oauth:token-type:id_token",
      client_id: e.clientId
    });
    if (e.clientSecret) {
      n.set("client_secret", e.clientSecret);
    }
    if (e.scope) {
      n.set("scope", e.scope);
    }
    let r = await t(e.tokenEndpoint, {
      method: "POST",
      headers: {
        "Content-Type": "application/x-www-form-urlencoded"
      },
      body: n
    });
    if (!r.ok) {
      let a = i5t(await r.text()).slice(0, 200);
      let l = r.status < 500;
      throw new gEe(`XAA: token exchange failed: HTTP ${r.status}: ${a}`, l);
    }
    let o;
    try {
      o = await r.json();
    } catch {
      throw new gEe(`XAA: token exchange returned non-JSON (captive portal?) at ${e.tokenEndpoint}`, false);
    }
    let s = dHp().safeParse(o);
    if (!s.success) {
      throw new gEe(`XAA: token exchange response did not match expected shape: ${i5t(o)}`, true);
    }
    let i = s.data;
    if (!i.access_token) {
      throw new gEe(`XAA: token exchange response missing access_token: ${i5t(i)}`, true);
    }
    if (i.issued_token_type !== "urn:ietf:params:oauth:token-type:id-jag") {
      throw new gEe(`XAA: token exchange returned unexpected issued_token_type: ${i.issued_token_type}`, true);
    }
    return {
      jwtAuthGrant: i.access_token,
      expiresIn: i.expires_in,
      scope: i.scope
    };
  }
  async function gHp(e) {
    let t = e.fetchFn ?? DWn;
    let n = e.authMethod ?? "client_secret_basic";
    let r = new URLSearchParams({
      grant_type: "urn:ietf:params:oauth:grant-type:jwt-bearer",
      assertion: e.assertion
    });
    if (e.scope) {
      r.set("scope", e.scope);
    }
    let o = {
      "Content-Type": "application/x-www-form-urlencoded"
    };
    if (n === "client_secret_basic") {
      let l = Buffer.from(`${encodeURIComponent(e.clientId)}:${encodeURIComponent(e.clientSecret)}`).toString("base64");
      o.Authorization = `Basic ${l}`;
    } else {
      r.set("client_id", e.clientId);
      r.set("client_secret", e.clientSecret);
    }
    let s = await t(e.tokenEndpoint, {
      method: "POST",
      headers: o,
      body: r
    });
    if (!s.ok) {
      let l = i5t(await s.text()).slice(0, 200);
      throw Error(`XAA: jwt-bearer grant failed: HTTP ${s.status}: ${l}`);
    }
    let i;
    try {
      i = await s.json();
    } catch {
      throw Error(`XAA: jwt-bearer grant returned non-JSON (captive portal?) at ${e.tokenEndpoint}`);
    }
    let a = pHp().safeParse(i);
    if (!a.success) {
      throw Error(`XAA: jwt-bearer response did not match expected shape: ${i5t(i)}`);
    }
    return a.data;
  }
  async function OSo(e, t, n = "xaa", r) {
    let o = OHa(r);
    dn(n, `XAA: discovering PRM for ${e}`);
    let s = await mHp(e, {
      fetchFn: o
    });
    dn(n, `XAA: discovered resource=${s.resource} ASes=[${s.authorization_servers.join(", ")}]`);
    let i;
    let a = [];
    for (let p of s.authorization_servers) {
      let m;
      try {
        m = await fHp(p, {
          fetchFn: o
        });
      } catch (f) {
        if (r?.aborted) {
          throw f;
        }
        a.push(`${p}: ${f instanceof Error ? f.message : String(f)}`);
        continue;
      }
      if (m.grant_types_supported && !m.grant_types_supported.includes("urn:ietf:params:oauth:grant-type:jwt-bearer")) {
        a.push(`${p}: does not advertise jwt-bearer grant (supported: ${m.grant_types_supported.join(", ")})`);
        continue;
      }
      i = m;
      break;
    }
    if (!i) {
      throw new Po(`XAA: no authorization server supports jwt-bearer. Tried: ${a.join("; ")}`, `XAA: no authorization server supports jwt-bearer (tried ${s.authorization_servers.length})`);
    }
    let l = i.token_endpoint_auth_methods_supported;
    let c = l && !l.includes("client_secret_basic") && l.includes("client_secret_post") ? "client_secret_post" : "client_secret_basic";
    dn(n, `XAA: AS issuer=${i.issuer} token_endpoint=${i.token_endpoint} auth_method=${c}`);
    dn(n, "XAA: exchanging id_token for ID-JAG at IdP");
    let u = await hHp({
      tokenEndpoint: t.idpTokenEndpoint,
      audience: i.issuer,
      resource: s.resource,
      idToken: t.idpIdToken,
      clientId: t.idpClientId,
      clientSecret: t.idpClientSecret,
      fetchFn: o
    });
    dn(n, "XAA: ID-JAG obtained");
    dn(n, "XAA: exchanging ID-JAG for access_token at AS");
    let d = await gHp({
      tokenEndpoint: i.token_endpoint,
      assertion: u.jwtAuthGrant,
      clientId: t.clientId,
      clientSecret: t.clientSecret,
      authMethod: c,
      fetchFn: o
    });
    dn(n, "XAA: access_token obtained");
    return {
      ...d,
      authorizationServerUrl: i.issuer
    };
  }
  var DWn;
  var gEe;
  var uHp;
  var dHp;
  var pHp;
  var DHa = __lazy(() => {
    SIe();
    dt();
    Rn();
    Fh();
    DWn = OHa();
    gEe = class gEe extends Error {
      shouldClearIdToken;
      constructor(e, t) {
        super(e);
        this.name = "XaaTokenExchangeError";
        this.shouldClearIdToken = t;
      }
    };
    uHp = /"(access_token|refresh_token|id_token|assertion|subject_token|client_secret)"\s*:\s*"[^"]*"/g;
    dHp = we(() => v.object({
      access_token: v.string().optional(),
      issued_token_type: v.string().optional(),
      expires_in: v.coerce.number().optional(),
      scope: v.string().optional()
    }));
    pHp = we(() => v.object({
      access_token: v.string().min(1),
      token_type: v.string().default("Bearer"),
      expires_in: v.coerce.number().optional(),
      scope: v.string().optional(),
      refresh_token: v.string().optional()
    }));
  });
  function SHp(e) {
    if (mg(e)) {
      return true;
    }
    if (e instanceof Error && e.name === "TimeoutError") {
      return true;
    }
    let t = f$(e);
    return t !== null && bHp.vZc(t.code);
  }
  function THp(e, t) {
    if (e.includes("dynamic client registration") || t instanceof cw && t.errorCode === "invalid_client_metadata") {
      return "dcr_failed";
    }
    if (e.includes("trying to load") && e.includes("metadata") || e.includes("Incompatible auth server")) {
      return "discovery_failed";
    }
    if (t instanceof cw) {
      return "dcr_rejected";
    }
    let n = en(t) ?? en(t instanceof Error ? t.cause : undefined);
    if (n && xSo.vZc(n)) {
      return "network_failed";
    }
    return "sdk_auth_failed";
  }
  function MHa(e) {
    try {
      let t = new URL(e);
      for (let n of EHp) {
        if (t.searchParams.vZc(n)) {
          t.searchParams.set(n, "[REDACTED]");
        }
      }
      return t.toString();
    } catch {
      return e;
    }
  }
  async function NHa(e) {
    if (!e.ok) {
      return e;
    }
    let t = await e.text();
    let n;
    try {
      n = qt(t);
    } catch {
      return new Response(t, e);
    }
    if (TIn.safeParse(n).success) {
      return new Response(t, e);
    }
    let r = EIn.safeParse(n);
    if (!r.success) {
      return new Response(t, e);
    }
    let o = vHp.vZc(r.data.error) ? {
      error: "invalid_grant",
      error_description: r.data.error_description ?? `Server returned non-standard error code: ${r.data.error}`
    } : r.data;
    return new Response(De(o), {
      status: 400,
      statusText: "Bad Request",
      headers: e.headers
    });
  }
  function FWn() {
    return async (e, t) => {
      try {
        return await LHa(e, t);
      } catch (n) {
        if (t?.signal?.aborted || !SHp(n)) {
          throw n;
        }
        await sleep(500, t?.signal ?? undefined);
        return await LHa(e, t);
      }
    };
  }
  async function LHa(e, t) {
    let n = AbortSignal.timeout(30000);
    let r = t?.method?.toUpperCase() === "POST";
    let o = getProxyFetchOptions({
      url: String(e)
    });
    if (!t?.signal) {
      let l = await fetch(e, {
        ...t,
        ...o,
        signal: n
      });
      return r ? NHa(l) : l;
    }
    let s = new AbortController();
    let i = () => s.abort();
    t.signal.addEventListener("abort", i);
    n.addEventListener("abort", i);
    let a = () => {
      t.signal?.removeEventListener("abort", i);
      n.removeEventListener("abort", i);
    };
    if (t.signal.aborted) {
      s.abort();
    }
    try {
      let l = await fetch(e, {
        ...t,
        ...o,
        signal: s.signal
      });
      a();
      return r ? NHa(l) : l;
    } catch (l) {
      throw a(), l;
    }
  }
  async function UWn(e, t, n, r, o) {
    let s = r ?? FWn();
    if (n) {
      if (!n.startsWith("https://")) {
        throw Error(`authServerMetadataUrl must use https:// (got: ${n})`);
      }
      let a = await s(n, {
        headers: {
          Accept: "application/json"
        }
      });
      if (a.ok) {
        let l;
        try {
          l = await a.json();
        } catch {
          throw Error(`Configured auth server metadata at ${n} is not valid JSON`);
        }
        return p2t.parse(l);
      }
      throw Error(`HTTP ${a.status} fetching configured auth server metadata from ${n}`);
    }
    try {
      let {
        authorizationServerMetadata: a
      } = await pYr(t, {
        fetchFn: s,
        ...(o && {
          resourceMetadataUrl: o
        })
      });
      if (a) {
        return a;
      }
    } catch (a) {
      dn(e, `RFC 9728 discovery failed, falling back: ${he(a)}`);
    }
    let i = new URL(t);
    if (i.pathname === "/") {
      return;
    }
    try {
      return await S4e(i, {
        fetchFn: s
      });
    } catch (a) {
      dn(e, `Path-aware auth server discovery failed: ${he(a)}`);
      return;
    }
  }
  function MSo(e) {
    try {
      let t = new URL(e);
      return `${t.protocol}//${t.hostname}`;
    } catch {
      return e;
    }
  }
  function Jft(e) {
    return NWn.get(e);
  }
  function Xft(e, t) {
    LWn.set(e, t);
    t.finally(() => {
      if (LWn.get(e) === t) {
        LWn.delete(e);
      }
    }).catch(() => {});