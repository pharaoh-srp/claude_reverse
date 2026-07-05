  __export(z5l, {
    call: () => call_export35
  });
  async function call_export35() {
    if (logEvent("tengu_install_slack_app_clicked", {}), saveGlobalConfig(t => ({
      ...t,
      slackAppInstallCount: (t.slackAppInstallCount ?? 0) + 1
    })), await Ac("https://slack.com/marketplace/A08SF47R6P4-claude")) {
      return {
        type: "text",
        value: "Opening Slack app installation page in browser\u2026"
      };
    } else {
      return {
        type: "text",
        value: `Couldn't open browser. Visit: ${"https://slack.com/marketplace/A08SF47R6P4-claude"}`
      };
    }
  }
  var K5l = __lazy(() => {
    Ot();
    ky();
  });
  var y5m;
  var X5l;
  var Q5l = __lazy(() => {
    X5l = {
      isEnabled: () => false,
      isHidden: true,
      name: "stub"
    };
  });
  function b5m() {
    return ["fcoeoabgfenejglbffodgkkbkcdhcgfn"];
  }
  async function S5m(e, t) {
    if (e.length === 0) {
      t?.("[Claude in Chrome] No browser paths to check");
      return {
        isInstalled: false,
        browser: null
      };
    }
    let n = b5m();
    for (let {
      browser: r,
      path: o
    } of e) {
      let s = [];
      try {
        s = await g3o.readdir(o, {
          withFileTypes: true
        });
      } catch (a) {
        if (Io(a)) {
          continue;
        }
        throw a;
      }
      let i = s.filter(a => a.isDirectory()).filter(a => a.name === "Default" || a.name.startsWith("Profile ")).map(a => a.name);
      if (i.length > 0) {
        t?.(`[Claude in Chrome] Found ${r} profiles: ${i.join(", ")}`);
      }
      for (let a of i) {
        for (let l of n) {
          let c = Z5l.join(o, a, "Extensions", l);
          try {
            await g3o.readdir(c);
            t?.(`[Claude in Chrome] Extension ${l} found in ${r} ${a}`);
            return {
              isInstalled: true,
              browser: r
            };
          } catch {}
        }
      }
    }
    t?.("[Claude in Chrome] Extension not found in any browser");
    return {
      isInstalled: false,
      browser: null
    };
  }
  async function e6l(e, t) {
    return (await S5m(e, t)).isInstalled;
  }
  var g3o;
  var Z5l;
  var t6l = __lazy(() => {
    dt();
    g3o = require("fs/promises");
    Z5l = require("path");
  });
  var v3o = {};
  __export(v3o, {
    shouldSuppressChromeOffer: () => shouldSuppressChromeOffer,
    shouldEnableClaudeInChrome: () => shouldEnableClaudeInChrome,
    shouldAutoEnableClaudeInChrome: () => shouldAutoEnableClaudeInChrome,
    setupClaudeInChrome: () => setupClaudeInChrome,
    markClaudeInChromeUnwiredIfChrome: () => markClaudeInChromeUnwiredIfChrome,
    markClaudeInChromeUnwired: () => markClaudeInChromeUnwired,
    isClaudeInChromeWiredThisSession: () => isClaudeInChromeWiredThisSession,
    isChromeExtensionInstalled: () => isChromeExtensionInstalled,
    installChromeNativeHostManifest: () => installChromeNativeHostManifest,
    getClaudeInChromeMcpServerConfig: () => getClaudeInChromeMcpServerConfig,
    _resetShouldAutoEnableForTesting: () => _resetShouldAutoEnableForTesting,
    _resetClaudeInChromeWiredForTesting: () => _resetClaudeInChromeWiredForTesting
  });
  function shouldEnableClaudeInChrome(e) {
    if (e === true) {
      return true;
    }
    if (e === false) {
      return false;
    }
    if (Me.CLAUDE_CODE_ENABLE_CFC === true) {
      return true;
    }
    if (Me.CLAUDE_CODE_ENABLE_CFC === false) {
      return false;
    }
    if (getIsNonInteractiveSession()) {
      return false;
    }
    let t = getGlobalConfig();
    if (t.claudeInChromeDefaultEnabled !== undefined) {
      return t.claudeInChromeDefaultEnabled;
    }
    return false;
  }
  function shouldAutoEnableClaudeInChrome() {
    if (lZt !== undefined) {
      return lZt;
    }
    lZt = getChromeFlagOverride() !== false && Me.CLAUDE_CODE_ENABLE_CFC !== false && getGlobalConfig().claudeInChromeDefaultEnabled === undefined && getIsInteractive() && isClaudeAISubscriber() && (R5m() || Boolean(getGlobalConfig().chromeExtension?.pairedDeviceId)) && getFeatureValue_CACHED_MAY_BE_STALE("tengu_chrome_auto_enable", false);
    return lZt;
  }
  function _resetShouldAutoEnableForTesting() {
    lZt = undefined;
  }
  function isClaudeInChromeWiredThisSession() {
    return cZt;
  }
  function _resetClaudeInChromeWiredForTesting() {
    cZt = false;
  }
  function markClaudeInChromeUnwired() {
    cZt = false;
  }
  function markClaudeInChromeUnwiredIfChrome(e) {
    if (e === "claude-in-chrome") {
      markClaudeInChromeUnwired();
    }
  }
  function shouldSuppressChromeOffer({
    isSSHPending: e,
    isRemoteMode: t,
    hasTeleport: n,
    isSafeMode: r,
    permissionMode: o,
    isBypassPermissionsModeAvailable: s,
    teammateAgentId: i
  }) {
    return e || t || n || r || o === "bypassPermissions" || o === "plan" && s || i !== undefined;
  }
  function getClaudeInChromeMcpServerConfig() {
    if (rm()) {
      return {
        type: "stdio",
        command: process.execPath,
        args: ["--claude-in-chrome-mcp"],
        scope: "dynamic"
      };
    }
    let e = _3o.fileURLToPath("file:///home/runner/work/claude-cli-internal/claude-cli-internal/src/utils/claudeInChrome/setup.ts");
    let t = QZ.join(e, "..");
    let n = QZ.join(t, "cli.js");
    return {
      type: "stdio",
      command: process.execPath,
      args: [`${n}`, "--claude-in-chrome-mcp"],
      scope: "dynamic"
    };
  }
  function setupClaudeInChrome() {
    let e = rm();
    let t = [];
    let n = {};
    if (getSessionBypassPermissionsMode()) {
      n.CLAUDE_CHROME_PERMISSION_MODE = "skip_all_permission_checks";
    }
    let r = Object.keys(n).length > 0;
    if (e) {
      let o = `"${process.execPath}" --chrome-native-host`;
      r6l(o).then(s => installChromeNativeHostManifest(s)).catch(s => logForDebugging(`[Claude in Chrome] Failed to install native host: ${s}`, {
        level: "error"
      }));
      cZt = true;
      return {
        mcpConfig: {
          ["claude-in-chrome"]: {
            ...getClaudeInChromeMcpServerConfig(),
            ...(r && {
              env: n
            })
          }
        },
        allowedTools: t,
        systemPrompt: V2o()
      };
    } else {
      let o = _3o.fileURLToPath("file:///home/runner/work/claude-cli-internal/claude-cli-internal/src/utils/claudeInChrome/setup.ts");
      let s = QZ.join(o, "..");
      let i = QZ.join(s, "cli.js");
      r6l(`"${process.execPath}" "${i}" --chrome-native-host`).then(l => installChromeNativeHostManifest(l)).catch(l => logForDebugging(`[Claude in Chrome] Failed to install native host: ${l}`, {
        level: "error"
      }));
      let a = {
        ["claude-in-chrome"]: {
          ...getClaudeInChromeMcpServerConfig(),
          ...(r && {
            env: n
          })
        }
      };
      cZt = true;
      return {
        mcpConfig: a,
        allowedTools: t,
        systemPrompt: V2o()
      };
    }
  }
  function w5m() {
    if (Wt() === "windows") {
      let t = o6l.homedir();
      let n = process.env.APPDATA || QZ.join(t, "AppData", "Local");
      return [QZ.join(n, "Claude Code", "ChromeNativeHost")];
    }
    return getAllNativeMessagingHostsDirs().map(({
      path: t
    }) => t);
  }
  async function installChromeNativeHostManifest(e) {
    return vl("chrome_native_host_install", async () => {
      let t = w5m();
      if (t.length === 0) {
        throw Error("Claude in Chrome Native Host not supported on this platform");
      }
      let n = {
        name: "com.anthropic.claude_code_browser_extension",
        description: "Claude Code Browser Extension Native Host",
        path: e,
        type: "stdio",
        allowed_origins: ["chrome-extension://fcoeoabgfenejglbffodgkkbkcdhcgfn/", ...[]]
      };
      let r = De(n, null, 2);
      let o = false;
      for (let s of t) {
        let i = QZ.join(s, n6l);
        if ((await mie.readFile(i, "utf-8").catch(() => null)) === r) {
          continue;
        }
        try {
          await mie.mkdir(s, {
            recursive: true
          });
          await mie.writeFile(i, r);
          logForDebugging(`[Claude in Chrome] Installed native host manifest at: ${i}`);
          o = true;
        } catch (l) {
          logForDebugging(`[Claude in Chrome] Failed to install manifest at ${i}: ${l}`);
        }
      }
      if (Wt() === "windows") {
        let s = QZ.join(t[0], n6l);
        C5m(s);
      }
      if (o) {
        isChromeExtensionInstalled().then(s => {
          if (s) {
            logForDebugging("[Claude in Chrome] First-time install detected, opening reconnect page in browser");
            openInChrome("https://clau.de/chrome/reconnect").catch(Oe);
          } else {
            logForDebugging("[Claude in Chrome] First-time install detected, but extension not installed, skipping reconnect");
          }
        }).catch(s => logForDebugging(`[Claude in Chrome] Failed to check extension installation during manifest install: ${s}`, {
          level: "error"
        }));
      }
    });
  }
  function C5m(e) {
    let t = getAllWindowsRegistryKeys();
    for (let {
      browser: n,
      key: r
    } of t) {
      let o = `${r}\\${"com.anthropic.claude_code_browser_extension"}`;
      execFileNoThrowWithCwd("reg", ["add", o, "/ve", "/t", "REG_SZ", "/d", e, "/f"]).then(s => {
        if (s.code === 0) {
          logForDebugging(`[Claude in Chrome] Registered native host for ${n} in Windows registry: ${o}`);
        } else {
          logForDebugging(`[Claude in Chrome] Failed to register native host for ${n} in Windows registry: ${s.stderr}`);
        }
      });
    }
  }
  async function r6l(e) {
    let t = Wt();
    let n = QZ.join(er(), "chrome");
    let r = t === "windows" ? QZ.join(n, "chrome-native-host.bat") : QZ.join(n, "chrome-native-host");
    let o = t === "windows" ? `@echo off
REM Chrome native host wrapper script
REM Generated by Claude Code - do not edit manually
${e}
` : `#!/bin/sh
# Chrome native host wrapper script
# Generated by Claude Code - do not edit manually
exec ${e}
`;
    if ((await mie.readFile(r, "utf-8").catch(() => null)) === o) {
      return r;
    }
    if (await mie.mkdir(n, {
      recursive: true
    }), await mie.writeFile(r, o), t !== "windows") {
      await mie.chmod(r, 493);
    }
    logForDebugging(`[Claude in Chrome] Created Chrome native host wrapper script: ${r}`);
    return r;
  }
  function R5m() {
    isChromeExtensionInstalled().then(t => {
      if (!t) {
        return;
      }
      if (getGlobalConfig().cachedChromeExtensionInstalled !== t) {
        saveGlobalConfig(r => ({
          ...r,
          cachedChromeExtensionInstalled: t
        }));
      }
    }).catch(t => logForDebugging(`[Claude in Chrome] Failed to check extension installation during cache refresh: ${t}`, {
      level: "error"
    }));
    return getGlobalConfig().cachedChromeExtensionInstalled ?? false;
  }
  async function isChromeExtensionInstalled() {
    let e = getAllBrowserDataPaths();
    if (e.length === 0) {
      logForDebugging(`[Claude in Chrome] Unsupported platform for extension detection: ${Wt()}`);
      return false;
    }
    return e6l(e, logForDebugging);
  }
  var mie;
  var o6l;
  var QZ;
  var _3o;
  var n6l;
  var lZt = undefined;
  var cZt = false;
  var Gwe = __lazy(() => {
    at();
    ln();
    $n();
    no();
    je();
    pr();
    gn();
    ji();
    Rn();
    Cs();
    b1();
    Qrr();
    t6l();
    mie = require("fs/promises");
    o6l = require("os");
    QZ = require("path");
    _3o = require("url");
    n6l = `${"com.anthropic.claude_code_browser_extension"}.json`;
  });
  var w3o = {};
  __export(w3o, {
    skillIndexCacheKey: () => skillIndexCacheKey,
    getSkillIndex: () => getSkillIndex,
    clearSkillIndexCache: () => clearSkillIndexCache
  });
  function skillIndexCacheKey(e, t) {
    return `${getDynamicSkillStateKey()}:${Qz()}:${e}:${(t ?? []).map(n => n.name).sort().join(",")}`;
  }
  function clearSkillIndexCache() {
    getSkillIndex.cache?.clear?.();
  }
  var getSkillIndex;
  var C3o = __lazy(() => {
    Bm();
    LLe();
    getSkillIndex = TEr(async (e, t) => {
      let n = await getSkillToolCommands(e);
      let r = new Set(n.map(i => i.name));
      let o = (t ?? []).filter(i => !r.vZc(i.name));
      return dropShadowedFallbackSkills([...n, ...o]).map(i => ({
        name: i.name,
        description: i.description,
        whenToUse: i.whenToUse ?? ""
      }));
    }, skillIndexCacheKey);
    if (!(getSkillIndex.cache instanceof Map)) {
      getSkillIndex.cache = new Map();
    }
  });
  function dar(e) {
    let t = "plugin" in e ? e.plugin : "no-plugin";
    return `${e.type}:${e.source}:${t}`;
  }
  function u6l(e, t) {
    if (t.length === 0) {
      return;
    }
    e(n => {
      let r = new Set(n.plugins.errors.map(s => dar(s)));
      let o = t.filter(s => !r.vZc(dar(s)));
      if (o.length === 0) {
        return n;
      }
      return {
        ...n,
        plugins: {
          ...n.plugins,
          errors: [...n.plugins.errors, ...o]
        }
      };
    });
  }
  function d6l(e, t) {
    if (t.length === 0) {
      return;
    }
    e(n => {
      let r = new Set(n.plugins.warnings.map(s => dar(s)));
      let o = t.filter(s => !r.vZc(dar(s)));
      if (o.length === 0) {
        return n;
      }
      return {
        ...n,
        plugins: {
          ...n.plugins,
          warnings: [...n.plugins.warnings, ...o]
        }
      };
    });
  }
  function p6l(e, t = false) {
    let n = getIsRemoteMode();
    let r = Ec();
    let o = bt(M => M.authVersion);
    let s = $x.useRef(undefined);
    let i = bt(M => M.policyVersion);
    let a = bt(M => M.mcp.pluginReconnectKey);
    let l = Lo();
    let c = useClock();
    let u = $x.useRef(new Map());
    let d = $x.useRef(new Map());
    let p = $x.useRef(new Map());
    let m = $x.useRef(null);
    let f = $x.useRef(new Set());
    let h = $x.useRef(new Set());
    let g = $x.useRef(null);
    if (g.current === null && !n) {
      g.current = ikl();
    }
    $x.useEffect(() => {
      let M = g.current;
      if (!M) {
        return;
      }
      if (!nkl()) {
        return;
      }
      l(L => {
        if (L.channelPermissionCallbacks === M) {
          return L;
        }
        return {
          ...L,
          channelPermissionCallbacks: M
        };
      });
      return () => {
        l(L => {
          if (L.channelPermissionCallbacks === undefined) {
            return L;
          }
          return {
            ...L,
            channelPermissionCallbacks: undefined
          };
        });
      };
    }, [l]);
    let {
      addNotification: y
    } = Fi();
    let _ = $x.useRef(new Set());
    $x.useEffect(() => f9t.subscribe(M => {
      if (_.current.vZc(M)) {
        return;
      }
      let L = r.getState().mcp.clients.find(P => P.name === M);
      if (L?.type !== "connected") {
        return;
      }
      if ((L.config.type === "sse" || L.config.type === "http") && (qIn(L.config, !!getClaudeAIOAuthTokens()?.accessToken || bEe()) || mJ() && !!L.config.oauth?.xaa)) {
        return;
      }
      _.current.add(M);
      y({
        key: `mcp-needs-reauth-${M}`,
        kind: "warning",
        priority: "high",
        text: `MCP server "${M}" lost authentication \xB7 open /mcp and select Re-authenticate`,
        color: "warning",
        timeoutMs: 12000
      });
    }), [r, y]);
    let b = 16;
    let S = $x.useRef([]);
    let E = $x.useRef(null);
    let C = $x.useCallback(() => {
      E.current = null;
      let M = S.current;
      if (M.length === 0) {
        return;
      }
      S.current = [];
      l(L => {
        let P = L.mcp;
        for (let F of M) {
          let {
            tools: H,
            commands: U,
            resources: N,
            resourceTemplates: W,
            ...j
          } = F;
          let z = j.type === "disabled" || j.type === "failed" ? H ?? [] : H;
          let V = j.type === "disabled" || j.type === "failed" ? U ?? [] : U;
          let K = j.type === "disabled" || j.type === "failed" ? N ?? [] : N;
          let J = j.type === "disabled" || j.type === "failed" ? W ?? [] : W;
          let Q = uW(j.name);
          let Z = P.clients.findIndex(ae => ae.name === j.name);
          if (j.type === "connected" && isMcpServerBlockedAtConnectTime(j.name, j.config)) {
            if (markClaudeInChromeUnwiredIfChrome(j.name), j.client.onclose = undefined, Ow(j.name, j.config).catch(() => {}), Z === -1) {
              continue;
            }
            P = {
              ...P,
              clients: P.clients.map(ae => ae.name === j.name ? {
                name: j.name,
                type: "failed",
                config: j.config,
                error: "Blocked by enterprise managed policy"
              } : ae),
              tools: Y1p(P.tools, ae => ae.name?.startsWith(Q)),
              commands: Y1p(P.commands, ae => u3(ae, j.name)),
              resources: Nwm(P.resources, j.name),
              resourceTemplates: Nwm(P.resourceTemplates, j.name)
            };
            continue;
          }
          let ne = Z === -1 ? [...P.clients, j] : P.clients.map(ae => ae.name === j.name ? j : ae);
          let oe = z === undefined ? P.tools : [...Y1p(P.tools, ae => ae.name?.startsWith(Q)), ...z];
          let ee = V === undefined ? P.commands : [...Y1p(P.commands, ae => u3(ae, j.name)), ...V];
          let re = K === undefined ? P.resources : K.length > 0 ? {
            ...P.resources,
            [j.name]: K
          } : Nwm(P.resources, j.name);
          let se = J === undefined ? P.resourceTemplates : J.length > 0 ? {
            ...P.resourceTemplates,
            [j.name]: J
          } : Nwm(P.resourceTemplates, j.name);
          P = {
            ...P,
            clients: ne,
            tools: oe,
            commands: ee,
            resources: re,
            resourceTemplates: se
          };
        }
        return {
          ...L,
          mcp: P
        };
      });
    }, [l]);
    let x = $x.useCallback(M => {
      if (S.current.push(M), E.current === null) {
        E.current = c.setTimeout(C, b);
      }
    }, [c, C]);
    let A = $x.useCallback(({
      client: M,
      tools: L,
      commands: P,
      resources: F,
      resourceTemplates: H
    }) => {
      x({
        ...M,
        tools: L,
        commands: P,
        resources: F,
        resourceTemplates: H
      });
      {
        let U = uTo();
        if (U) {
          y({
            key: "mcp-first-party-scope-expanded",
            kind: "event",
            priority: "high",
            text: U,
            color: "remember",
            timeoutMs: 12000
          });
        }
      }
      switch (M.type) {
        case "connected":
          {
            p.current.set(M.name, 3);
            _.current.delete(M.name);
            mqa(M.client, M.name, l, M.transportErrorState);
            M.client.onclose = () => {
              if (isShuttingDown()) {
                return;
              }
              let V = M.config.type ?? "stdio";
              if (Ow(M.name, M.config).catch(() => {
                logForDebugging(`Failed to invalidate the server cache: ${M.name}`);
              }), isMcpServerDisabled(M.name)) {
                dn(M.name, "Server is disabled, skipping automatic reconnection");
                return;
              }
              if (V !== "stdio" && V !== "sdk") {
                let K = k5m(V);
                dn(M.name, `${K} transport closed/disconnected, attempting automatic reconnection`);
                let J = u.current.get(M.name);
                if (J) {
                  J();
                  u.current.delete(M.name);
                }
                (async () => {
                  for (let Z = 1; Z <= 5; Z++) {
                    if (isMcpServerDisabled(M.name)) {
                      dn(M.name, "Server disabled during reconnection, stopping retry");
                      u.current.delete(M.name);
                      return;
                    }
                    if (isMcpServerBlockedAtConnectTime(M.name, M.config)) {
                      markClaudeInChromeUnwiredIfChrome(M.name);
                      dn(M.name, "Server blocked by managed policy during reconnection, stopping retry");
                      u.current.delete(M.name);
                      x({
                        name: M.name,
                        type: "failed",
                        config: M.config,
                        error: "Blocked by enterprise managed policy"
                      });
                      return;
                    }
                    x({
                      ...M,
                      type: "pending",
                      reconnectAttempt: Z,
                      maxReconnectAttempts: 5
                    });
                    let ne = c.now();
                    try {
                      let ee = await pQ(M.name, M.config);
                      let re = Math.round(c.now() - ne);
                      if (ee.client.type === "connected") {
                        dn(M.name, `${K} reconnection successful after ${re}ms (attempt ${Z})`);
                        u.current.delete(M.name);
                        A(ee);
                        return;
                      }
                      if (dn(M.name, `${K} reconnection attempt ${Z} completed with status: ${ee.client.type}`), Z === 5) {
                        dn(M.name, `Max reconnection attempts (${5}) reached, giving up`);
                        u.current.delete(M.name);
                        A(ee);
                        return;
                      }
                    } catch (ee) {
                      let re = Math.round(c.now() - ne);
                      if (uu(M.name, `${K} reconnection attempt ${Z} failed after ${re}ms: ${ee}`), Z === 5) {
                        dn(M.name, `Max reconnection attempts (${5}) reached, giving up`);
                        u.current.delete(M.name);
                        x({
                          ...M,
                          type: "failed"
                        });
                        return;
                      }
                    }
                    let oe = Math.min(1000 * Math.pow(2, Z - 1), 30000);
                    dn(M.name, `Scheduling reconnection attempt ${Z + 1} in ${oe}ms`);
                    await new Promise(ee => {
                      let re = c.setTimeout(ee, oe);
                      u.current.set(M.name, re);
                    });
                  }
                })();
              } else {
                h.current.delete(M.name);
                x({
                  ...M,
                  type: "failed"
                });
              }
            };
            let U = gateChannelServer(M.name, M.capabilities, M.config.pluginSource);
            let N = findChannelEntry(M.name, getAllowedChannels());
            let W = N?.kind === "plugin" ? `${N.name}@${N.marketplace}` : undefined;
            let j = false;
            let z = () => {
              if (h.current.add(M.name), M.client.setNotificationHandler(ChannelMessageNotificationSchema(), async V => {
                let {
                  content: K,
                  meta: J
                } = V.params;
                dn(M.name, `notifications/claude/channel: ${K.slice(0, 80)}`);
                logEvent("tengu_mcp_channel_message", {
                  content_length: K.length,
                  meta_key_count: Object.keys(J ?? {}).length,
                  entry_kind: N?.kind == null ? undefined : N?.kind,
                  is_dev: N?.dev ?? false,
                  plugin: W
                });
                __({
                  mode: "prompt",
                  agentId: mainAgentId(),
                  value: wrapChannelMessage(M.name, K, J),
                  priority: "next",
                  isMeta: true,
                  origin: {
                    kind: "channel",
                    server: M.name
                  },
                  skipSlashCommands: true
                });
              }), M.capabilities?.experimental?.["claude/channel/permission"] !== undefined) {
                M.client.setNotificationHandler(ChannelPermissionNotificationSchema(), async V => {
                  let {
                    request_id: K,
                    behavior: J
                  } = V.params;
                  let Q = g.current?.resolve(K, J, M.name) ?? false;
                  dn(M.name, `notifications/claude/channel/permission: ${K} \u2192 ${J} (${Q ? "matched pending" : "no pending entry \u2014 stale or unknown ID"})`);
                });
              }
            };
            switch (U.action) {
              case "register":
                dn(M.name, "Channel notifications registered");
                z();
                j = true;
                break;
              case "skip":
                {
                  let V = U.kind === "provider" || U.kind === "disabled" || U.kind === "capability";
                  let K = h.current.vZc(M.name);
                  if (V) {
                    h.current.delete(M.name);
                    M.client.removeNotificationHandler("notifications/claude/channel");
                    M.client.removeNotificationHandler("notifications/claude/channel/permission");
                  } else if (K) {
                    dn(M.name, `Channel gate says skip:${U.kind} but was previously registered \u2014 preserving handler`);
                    z();
                    j = true;
                    break;
                  }
                  if (dn(M.name, `Channel notifications skipped: ${U.reason}`), U.kind !== "capability" && U.kind !== "session" && !f.current.vZc(U.kind) && (U.kind === "marketplace" || U.kind === "allowlist" || N !== undefined)) {
                    f.current.add(U.kind);
                    let J = U.kind === "disabled" ? "Channels are not currently available" : U.kind === "provider" ? "Channels are not available on Bedrock, Vertex, or Foundry" : U.kind === "policy" ? "Channels are not enabled for your org \xB7 have an administrator set channelsEnabled: true in managed settings" : U.reason;
                    y({
                      key: `channels-blocked-${U.kind}`,
                      priority: "high",
                      text: J,
                      color: "warning",
                      timeoutMs: 12000
                    });
                  }
                  break;
                }
            }
            if (j || U.action === "skip" && U.kind !== "capability") {
              logEvent("tengu_mcp_channel_gate", {
                registered: j,
                skip_kind: U.action === "skip" ? U.kind : undefined,
                entry_kind: N?.kind == null ? undefined : N?.kind,
                is_dev: N?.dev ?? false,
                plugin: W
              });
            }
            if (M.capabilities?.tools?.listChanged) {
              M.client.setNotificationHandler(uHe, async () => {
                dn(M.name, "Received tools/list_changed notification, refreshing tools");
                try {
                  let V = AM.cache.get(M.name);
                  AM.cache.delete(M.name);
                  let K = await AM(M);
                  let J = K.length;
                  if (V) {
                    V.then(Q => {
                      logEvent("tengu_mcp_list_changed", {
                        type: "tools",
                        previousCount: Q.length,
                        newCount: J
                      });
                    }, () => {
                      logEvent("tengu_mcp_list_changed", {
                        type: "tools",
                        newCount: J
                      });
                    });
                  } else {
                    logEvent("tengu_mcp_list_changed", {
                      type: "tools",
                      newCount: J
                    });
                  }
                  x({
                    ...M,
                    tools: K
                  });
                } catch (V) {
                  uu(M.name, `Failed to refresh tools after list_changed notification: ${he(V)}`);
                }
              });
            }
            if (M.capabilities?.prompts?.listChanged) {
              M.client.setNotificationHandler(iOt, async () => {
                dn(M.name, "Received prompts/list_changed notification, refreshing prompts");
                logEvent("tengu_mcp_list_changed", {
                  type: "prompts"
                });
                try {
                  yQ.cache.delete(M.name);
                  let [V, K] = await Promise.all([yQ(M), nA() ? R3o(M) : Promise.resolve([])]);
                  x({
                    ...M,
                    commands: [...V, ...K]
                  });
                  a6l();
                } catch (V) {
                  uu(M.name, `Failed to refresh prompts after list_changed notification: ${he(V)}`);
                }
              });
            }
            if (M.capabilities?.resources?.listChanged) {
              M.client.setNotificationHandler(oOt, async () => {
                dn(M.name, "Received resources/list_changed notification, refreshing resources");
                logEvent("tengu_mcp_list_changed", {
                  type: "resources"
                });
                try {
                  if (n3.cache.delete(M.name), ype.cache.delete(M.name), nA()) {
                    R3o.cache.delete(M.name);
                    yQ.cache.delete(M.name);
                    let [V, K, J, Q] = await Promise.all([n3(M), ype(M), yQ(M), R3o(M)]);
                    x({
                      ...M,
                      resources: V,
                      resourceTemplates: K,
                      commands: [...J, ...Q]
                    });
                    a6l();
                  } else {
                    let [V, K] = await Promise.all([n3(M), ype(M)]);
                    x({
                      ...M,
                      resources: V,
                      resourceTemplates: K
                    });
                  }
                } catch (V) {
                  uu(M.name, `Failed to refresh resources after list_changed notification: ${he(V)}`);
                }
              });
            }
            break;
          }
        case "failed":
          {
            let U = (p.current.get(M.name) ?? 0) + 1;
            if (AWn(M) && U <= 3) {
              p.current.set(M.name, U);
              let N = Math.min(1000 * Math.pow(2, U - 1), 30000);
              dn(M.name, `Transient ${M.errorCode ?? "<sse-no-code>"} on initial connect \u2014 retry ${U}/${3} in ${N}ms`);
              x({
                name: M.name,
                config: M.config,
                type: "pending",
                reconnectAttempt: U,
                maxReconnectAttempts: 3
              });
              let W = u.current.get(M.name);
              if (W) {
                W();
              }
              let j = c.setTimeout(() => {
                if (u.current.delete(M.name), isMcpServerDisabled(M.name)) {
                  return;
                }
                if (isMcpServerBlockedAtConnectTime(M.name, M.config)) {
                  markClaudeInChromeUnwiredIfChrome(M.name);
                  return;
                }
                pQ(M.name, M.config).then(A, z => {
                  uu(M.name, `Initial-connect retry ${U} threw: ${he(z)}`);
                  x({
                    ...M
                  });
                });
              }, N);
              u.current.set(M.name, j);
            } else if (oZt(M, A6e)) {
              tD("MCP", 1);
            }
            break;
          }
        case "needs-auth":
          if (oZt(M, A6e)) {
            tD("MCP", 1);
          }
          break;
        case "pending":
        case "disabled":
          break;
      }
    }, [c, x, y, l]);
    let k = getSessionId();
    $x.useEffect(() => {
      if (n) {
        return;
      }
      async function M() {
        let {
          servers: L,
          errors: P,
          warnings: F
        } = t ? {
          servers: {},
          errors: [],
          warnings: []
        } : await getClaudeCodeMcpConfigs(e);
        let {
          configs: H,
          blocked: U
        } = filterDynamicMcpServersByPolicy(e);
        let N = {
          ...L,
          ...H
        };
        if (U.length > 0) {
          U.sort();
          logForDebugging(`MCP servers blocked by managed policy at connect time: ${U.join(", ")}`, {
            level: "warn"
          });
          let W = U.join(",");
          if (m.current !== W) {
            m.current = W;
            y({
              key: "mcp-blocked-policy",
              kind: "warning",
              priority: "high",
              text: `MCP ${un(U.length, "server")} blocked by enterprise policy: ${U.join(", ")}`,
              color: "warning",
              timeoutMs: 12000
            });
          }
          for (let j of U) {
            let z = e?.[j];
            if (z) {
              Ow(j, z).catch(() => {});
            }
          }
        } else {
          m.current = null;
        }
        u6l(l, P);
        d6l(l, F);
        l(W => {
          let {
            stale: j,
            ...z
          } = xHa(W.mcp, N);
          for (let J of j) {
            let Q = u.current.get(J.name);
            if (Q) {
              Q();
              u.current.delete(J.name);
            }
            if (h.current.delete(J.name), p.current.delete(J.name), J.type === "connected") {
              J.client.onclose = undefined;
              Ow(J.name, J.config).catch(() => {});
            }
          }
          let V = new Set(z.clients.map(J => J.name));
          let K = Object.entries(N).filter(([J]) => !V.vZc(J)).map(([J, Q]) => ({
            name: J,
            type: isMcpServerDisabled(J) ? "disabled" : "pending",
            config: Q
          }));
          if (K.length === 0 && j.length === 0) {
            if (W.mcp.clientsInitialized) {
              return W;
            }
            return {
              ...W,
              mcp: {
                ...W.mcp,
                clientsInitialized: true
              }
            };
          }
          return {
            ...W,
            mcp: {
              ...W.mcp,
              ...z,
              clientsInitialized: true,
              clients: [...z.clients, ...K]
            }
          };
        });
      }
      M().catch(L => {
        uu("useManageMCPConnections", `Failed to initialize servers as pending: ${he(L)}`);
      });
    }, [t, e, l, k, a, i]);
    $x.useEffect(() => {
      if (n) {
        return;
      }
      let M = false;
      async function L() {
        let P;
        if (t || shouldSkipClaudeAiFetchForEnterpriseLockdown()) {
          P = Promise.resolve({});
        } else {
          if (gHa(), s.current !== undefined && s.current !== o) {
            WWn();
          }
          s.current = o;
          P = iNe();
        }
        let {
          servers: F,
          errors: H,
          warnings: U
        } = t ? {
          servers: {},
          errors: [],
          warnings: []
        } : await getClaudeCodeMcpConfigs(e);
        if (M) {
          return;
        }
        u6l(l, H);
        d6l(l, U);
        let N = {
          ...F,
          ...filterDynamicMcpServersByPolicy(e).configs
        };
        let W = vbu(N, (J, Q) => isMcpServerDisabled(Q));
        z6e(A, W).catch(J => {
          uu("useManageMcpConnections", `Failed to get MCP resources: ${he(J)}`);
        });
        let j = {};
        if (!t) {
          let {
            allowed: J,
            blocked: Q
          } = filterMcpServersByPolicy((await P) ?? {});
          if (j = J, M) {
            return;
          }
          if (hasDisableClaudeAiConnectors()) {
            for (let oe of r.getState().mcp.clients) {
              if (oe.config.scope !== "claudeai") {
                continue;
              }
              if (oe.type === "disabled") {
                continue;
              }
              let ee = u.current.get(oe.name);
              if (ee) {
                ee();
                u.current.delete(oe.name);
              }
              if (h.current.delete(oe.name), p.current.delete(oe.name), oe.type === "connected") {
                oe.client.onclose = undefined;
                Ow(oe.name, oe.config).catch(() => {});
              }
              x({
                name: oe.name,
                type: "failed",
                config: oe.config,
                error: "Disabled by disableClaudeAiConnectors setting"
              });
            }
          }
          if (Q.length > 0) {
            logForDebugging(`claude.ai connectors blocked by managed policy at connect time: ${Q.join(", ")}`, {
              level: "warn"
            });
            for (let oe of Q) {
              let ee = r.getState().mcp.clients.find(se => se.name === oe && se.config.scope === "claudeai");
              if (!ee) {
                continue;
              }
              let re = u.current.get(oe);
              if (re) {
                re();
                u.current.delete(oe);
              }
              if (ee.type === "connected") {
                ee.client.onclose = undefined;
                Ow(oe, ee.config).catch(() => {});
              }
              x({
                name: oe,
                type: "failed",
                config: ee.config,
                error: "Blocked by enterprise managed policy"
              });
            }
          }
          let Z = ySo();
          if (Z) {
            y({
              key: "claudeai-mcp-cross-org-override",
              priority: "immediate",
              text: Z.level === "error" ? Z.message : `\u26A0 ${Z.message}`,
              color: Z.level === "error" ? "error" : "warning",
              timeoutMs: 20000
            });
          }
          let ne = [];
          if (Object.keys(j).length > 0) {
            let {
              servers: oe,
              suppressed: ee
            } = await dedupClaudeAiMcpServers(j, N);
            if (M) {
              return;
            }
            j = oe;
            ne = ee;
          }
          if (l(oe => suppressedConnectorsEqual(oe.mcp.suppressedClaudeAiConnectors ?? [], ne) ? oe : {
            ...oe,
            mcp: {
              ...oe.mcp,
              suppressedClaudeAiConnectors: ne
            }
          }), Object.keys(j).length > 0) {
            l(ee => {
              let re = new Set(ee.mcp.clients.map(ae => ae.name));
              let se = Object.entries(j).filter(([ae]) => !re.vZc(ae)).map(([ae, de]) => ({
                name: ae,
                type: isMcpServerDisabled(ae) ? "disabled" : "pending",
                config: de
              }));
              if (se.length === 0) {
                return ee;
              }
              return {
                ...ee,
                mcp: {
                  ...ee.mcp,
                  clients: [...ee.mcp.clients, ...se]
                }
              };
            });
            let oe = vbu(j, (ee, re) => isMcpServerDisabled(re));
            z6e(A, oe).catch(ee => {
              uu("useManageMcpConnections", `Failed to get claude.ai MCP resources: ${he(ee)}`);
            });
          }
        }
        let z = {
          ...N,
          ...j
        };
        let V = {
          enterprise: 0,
          global: 0,
          project: 0,
          user: 0,
          plugin: 0,
          agent: 0,
          claudeai: 0
        };
        let K = [];
        for (let [J, Q] of Object.entries(z)) {
          if (Q.scope === "enterprise") {
            V.enterprise++;
          } else if (Q.scope === "user") {
            V.global++;
          } else if (Q.scope === "project") {
            V.project++;
          } else if (Q.scope === "local") {
            V.user++;
          } else if (Q.scope === "dynamic") {
            V.plugin++;
          } else if (Q.scope === "agent") {
            V.agent++;
          } else if (Q.scope === "claudeai") {
            V.claudeai++;
          }
        }
        logEvent("tengu_mcp_servers", {
          ...V,
          ...false
        });
      }
      L();
      return () => {
        M = true;
      };
    }, [t, e, A, l, o, k, a, i]);
    $x.useEffect(() => {
      let M = u.current;
      return () => {
        for (let L of M.values()) {
          L();
        }
        if (M.clear(), E.current !== null) {
          E.current();
          E.current = null;
          C();
        }
      };
    }, [C]);
    let I = $x.useCallback(async M => {
      let L = d.current.get(M);
      if (L) {
        return L;
      }
      let P = r.getState().mcp.clients.find(U => U.name === M);
      if (!P) {
        throw $o(Error(`MCP server ${M} not found`), "MCP server not found in store");
      }
      let F = u.current.get(M);
      if (F) {
        F();
        u.current.delete(M);
      }
      let H = (async () => {
        x({
          name: M,
          type: "pending",
          config: P.config
        });
        try {
          let U = e?.[M] ?? (t ? undefined : (await getClaudeCodeMcpConfigs(e)).servers[M]) ?? P.config;
          if (isMcpServerBlockedAtConnectTime(M, U)) {
            throw markClaudeInChromeUnwiredIfChrome(M), $o(Error(`MCP server ${M} is blocked by enterprise managed policy`), "MCP server blocked by enterprise managed policy");
          }
          if (P.type === "connected") {
            P.client.onclose = undefined;
          }
          let N = await pQ(M, U);
          A(N);
          return N;
        } catch (U) {
          throw x(P), U;
        }
      })();
      d.current.set(M, H);
      try {
        return await H;
      } finally {
        d.current.delete(M);
      }
    }, [r, x, A, e, t]);
    let O = $x.useCallback(async M => {
      let L = r.getState().mcp.clients.find(F => F.name === M);
      if (!L) {
        throw $o(Error(`MCP server ${M} not found`), "MCP server not found in store");
      }
      if (L.type !== "disabled") {
        let F = u.current.get(M);
        if (F) {
          F();
          u.current.delete(M);
        }
        if (setMcpServerEnabled(M, false), h.current.delete(M), p.current.delete(M), L.type === "connected") {
          await Ow(M, L.config);
        }
        let H = {
          name: M,
          type: "disabled",
          config: L.config
        };
        x(H);
        return H;
      } else {
        let F = e?.[M] ?? (t ? undefined : (await getClaudeCodeMcpConfigs(e)).servers[M]) ?? L.config;
        if (isMcpServerBlockedAtConnectTime(M, F)) {
          throw markClaudeInChromeUnwiredIfChrome(M), $o(Error(`MCP server ${M} is blocked by enterprise managed policy`), "MCP server blocked by enterprise managed policy");
        }
        setMcpServerEnabled(M, true);
        x({
          name: M,
          type: "pending",
          config: F
        });
        let H = await pQ(M, F);
        A(H);
        return H.client;
      }
    }, [r, x, A, e, t]);
    return {
      reconnectMcpServer: I,
      toggleMcpServer: O
    };
  }
  function k5m(e) {
    switch (e) {
      case "http":
        return "HTTP";
      case "ws":
      case "ws-ide":
        return "WebSocket";
      default:
        return "SSE";
    }
  }
  var $x;
  var R3o;
  var a6l = () => void Promise.resolve().then(() => (C3o(), w3o)).then(e => e.clearSkillIndexCache(), () => {});
  var m6l = __lazy(() => {
    at();
    at();
    no();
    m_o();
    Oce();
    eA();
    Noe();
    E4e();
    Ot();
    Iw();
    je();
    lm();
    at();
    Nd();
    zWe();
    ho();
    Gwe();
    dt();
    Rn();
    Rf();
    pK();
    Zn();
    qKe();
    LLo();
    l9();
    aGn();
    EI();
    G1();
    $x = __toESM(ot(), 1);
    R3o = (wTo(), __toCommonJS(vTo)).fetchMcpSkillsForClient;
  });
  function par() {
    return k3o;
  }
  function h6l() {
    return A3o;
  }
  function Zvt() {
    let e = bYe.useContext(x3o);
    if (!e) {
      throw Error("useMcpReconnect must be used within MCPConnectionManager");
    }
    return e.reconnectMcpServer;
  }
  function TUe() {
    let e = bYe.useContext(x3o);
    if (!e) {
      throw Error("useMcpToggleEnabled must be used within MCPConnectionManager");
    }
    return e.toggleMcpServer;
  }
  function pZt(e) {
    let t = f6l.c(12);
    let {
      children: n,
      dynamicMcpConfig: r,
      isStrictMcpConfig: o
    } = e;
    let {
      reconnectMcpServer: s,
      toggleMcpServer: i
    } = p6l(r, o);
    let a;
    if (t[0] !== i) {
      a = async m => {
        await i(m);
      };
      t[0] = i;
      t[1] = a;
    } else {
      a = t[1];
    }
    let l;
    if (t[2] !== s || t[3] !== a) {
      l = {
        reconnectMcpServer: s,
        toggleMcpServer: a
      };
      t[2] = s;
      t[3] = a;
      t[4] = l;
    } else {
      l = t[4];
    }
    let c = l;
    let u;
    let d;
    if (t[5] !== s || t[6] !== i) {
      u = () => (k3o = s, A3o = i, A5m);
      d = [s, i];
      t[5] = s;
      t[6] = i;
      t[7] = u;
      t[8] = d;
    } else {
      u = t[7];
      d = t[8];
    }
    bYe.useEffect(u, d);
    let p;
    if (t[9] !== n || t[10] !== c) {
      p = g6l.jsx(x3o.Provider, {
        value: c,
        children: n
      });
      t[9] = n;
      t[10] = c;
      t[11] = p;
    } else {
      p = t[11];
    }
    return p;
  }
  function A5m() {
    k3o = null;
    A3o = null;
  }
  var f6l;
  var bYe;
  var g6l;
  var x3o;
  var k3o = null;
  var A3o = null;
  var Hfe = __lazy(() => {
    m6l();
    f6l = __toESM(pt(), 1);
    bYe = __toESM(ot(), 1);
    g6l = __toESM(ie(), 1);
    x3o = bYe.createContext(null);
  });
  function SYe(e) {
    return e.type;
  }
  function I3o(e) {
    let t = SYe(e);
    switch (t) {
      case "disabled":
      case "pending":
      case "needs-approval":
        return t;
      case "connected":
      case "failed":
      case "needs-auth":
        return null;
      default:
        return t;
    }
  }
  function y6l(e, t) {
    if (t === "ide") {
      throw Error("The IDE connection is managed automatically and can't be reconnected manually");
    }
    let n = e.find(o => o.name === t);
    let r = n && I3o(n);
    if (r) {
      throw Error(r === "disabled" ? `"${t}" is disabled \u2014 enable it first` : r === "pending" ? `"${t}" is already reconnecting \u2014 retries can take a few minutes when a server keeps failing` : `"${t}" is pending approval \u2014 approve it in the terminal first`);
    }
  }
  var b6l = {};
  __export(b6l, {
    call: () => call_export36
  });
  async function call_export36(e, t) {
    let n = e.trim();
    let r = t.getMcp().clients.filter(b => b.name !== "ide");
    let o = n.toLowerCase();
    if (!n || ule.includes(o)) {
      if (r.length === 0) {
        return oD(`No MCP servers are configured. Add one with \`claude mcp add\`.
${"Usage: /mcp [reconnect|enable|disable [<server>|all]]. With no server name, applies to all."}`);
      }
      let b = Bn(r, A => A.type === "connected");
      let S = Bn(r, A => A.type === "pending");
      let E = Bn(r, A => A.type === "failed" || A.type === "needs-auth");
      let C = Bn(r, A => A.type === "disabled");
      let x = r.length - b - S - C;
      return oD(`${r.length} MCP server(s): ${b} connected, ` + (S > 0 ? `${S} connecting, ` : "") + `${x} not connected, ${C} disabled.` + (E > 0 ? " Reply `/mcp reconnect all` here to retry." : "") + ` Use \`/mcp\` in the terminal for details.
${"Usage: /mcp [reconnect|enable|disable [<server>|all]]. With no server name, applies to all."}`);
    }
    if (Q4.includes(o)) {
      return oD("Usage: /mcp [reconnect|enable|disable [<server>|all]]. With no server name, applies to all.");
    }
    let s = /^(\S+)\s*(.*)$/.exec(n);
    let i = (s?.[1] ?? "").toLowerCase();
    let a = s?.[2] || "all";
    if (i !== "reconnect" && i !== "enable" && i !== "disable") {
      return oD(`"${i}" isn't a recognized /mcp action. Try reconnect, enable, or disable.`);
    }
    logEvent("tengu_mcp_command_inline", {
      action: i
    });
    let l = a === "all" ? r : r.filter(b => b.name === a);
    if (l.length === 0) {
      return oD(a === "all" ? "No MCP servers are configured. Add one with `claude mcp add`." : `There's no MCP server named "${a}". Run \`/mcp\` in the terminal to see configured servers.`);
    }
    let c = par();
    let u = h6l();
    if (!c || !u) {
      return oD("MCP controls aren't available right now \u2014 the terminal is still starting up or is showing another view.");
    }
    if (i === "reconnect") {
      let b = a !== "all" ? l[0] : undefined;
      let S = b && I3o(b);
      if (S === "disabled") {
        return oD(`"${a}" is disabled. Run \`/mcp enable ${a}\` to bring it back.`);
      }
      if (S === "pending") {
        return oD(`"${a}" is already reconnecting \u2014 retries can take a few minutes when a server keeps failing.`);
      }
      if (S === "needs-approval") {
        return oD(`"${a}" is pending approval. Approve it with \`/mcp\` in the terminal first.`);
      }
      let E = a === "all" ? l.filter(A => A.type === "failed" || A.type === "needs-auth") : l;
      if (E.length === 0) {
        let A = Bn(l, k => k.type === "disabled");
        if (A > 0) {
          return oD(`${A} MCP server(s) are disabled. Run \`/mcp enable all\` to bring them back.`);
        }
        return oD("All enabled MCP servers are already connected or connecting.");
      }
      let C = await Promise.allSettled(E.map(A => c(A.name)));
      let x = Bn(C, A => A.status === "fulfilled" && A.value.client.type === "connected");
      if (a !== "all") {
        let A = C[0];
        let k = A?.status === "fulfilled" ? A.value.client.type : undefined;
        let I = k === "needs-auth" ? "Authenticate with `/mcp` in the terminal." : "Check its config with `/mcp` in the terminal.";
        return oD(k === "connected" ? `Reconnected "${a}".` : `Couldn't reconnect "${a}"${k ? ` (${_6l[k]})` : ""}. ${I}`);
      }
      return oD(`Reconnected ${x} of ${E.length} MCP server(s). Run \`/mcp\` in the terminal to see status.`);
    }
    let d = i === "enable";
    if (a !== "all" && l.some(b => SYe(b) === "needs-approval")) {
      return oD(`"${a}" is pending approval. Approve it with \`/mcp\` in the terminal first.`);
    }
    let p = l.filter(b => d ? b.type === "disabled" : b.type !== "disabled" && SYe(b) !== "needs-approval");
    if (p.length === 0) {
      if (d) {
        let b = Bn(l, S => S.type === "failed" || S.type === "needs-auth");
        if (b > 0) {
          return oD(a === "all" ? `All MCP servers are already enabled, but ${b} ${b === 1 ? "isn't" : "aren't"} connected. Reply \`/mcp reconnect all\` here to retry.` : `"${a}" is already enabled but not connected. Run \`/mcp reconnect ${a}\` to retry.`);
        }
      }
      return oD(a === "all" ? `All MCP servers are already ${d ? "enabled" : "disabled"}.` : `"${a}" is already ${d ? "enabled" : "disabled"}.`);
    }
    let m = await Promise.allSettled(p.map(b => u(b.name)));
    let f = Bn(m, b => b.status === "fulfilled");
    let h = d ? Bn(m, b => b.status === "fulfilled" && b.value.type === "connected") : f;
    let g = d ? "Enabled" : "Disabled";
    let y = d && h < f ? ` (${f - h} enabled but not yet connected)` : "";
    if (a !== "all") {
      if (!d) {
        return oD(f > 0 ? `Disabled "${a}".` : `Couldn't disable "${a}" \u2014 it may have been removed, or its configuration couldn't be read. Run \`/mcp\` in the terminal to check.`);
      }
      let b = m[0];
      if (b?.status !== "fulfilled") {
        return oD(`Couldn't enable "${a}" \u2014 it may have been removed, or its configuration couldn't be read. Run \`/mcp\` in the terminal to check.`);
      }
      let S = b.value.type;
      let E = S === "needs-auth" ? "Authenticate with `/mcp` in the terminal." : "Check its config with `/mcp` in the terminal.";
      return oD(S === "connected" ? `Enabled "${a}".` : `Enabled "${a}", but it isn't connected yet${S !== "failed" ? ` (${_6l[S]})` : ""}. ${E}`);
    }
    let _ = p.length - f;
    return oD(`${g} ${f} MCP server(s)${y}` + (_ > 0 ? ` (${_} couldn't be changed \u2014 may have been removed)` : "") + ". Run `/mcp` in the terminal to see status.");
  }
  function oD(e) {
    return {
      type: "text",
      value: e
    };
  }
  var _6l;
  var S6l = __lazy(() => {
    np();
    Ot();
    Hfe();
    _6l = {
      connected: "connected",
      pending: "connecting",
      disabled: "disabled",
      failed: "not connected",
      "needs-auth": "needs authentication",
      "needs-approval": "pending approval"
    };
  });
  function O3o({
    agentServer: e,
    onCancel: t,
    onComplete: n
  }) {
    let [r] = useTheme();
    let [o, s] = fie.useState(false);
    let [i, a] = fie.useState(null);
    let [l, c] = fie.useState(null);
    let u = fie.useRef(null);
    fie.useEffect(() => () => u.current?.abort(), []);
    let d = fie.useCallback(() => {
      if (o) {
        u.current?.abort();
        u.current = null;
        s(false);
        c(null);
      }
    }, [o]);
    uo("confirm:no", d, {
      context: "Confirmation",
      isActive: o
    });
    let p = fie.useCallback(async () => {
      if (!e.needsAuth || !e.url || e.transport !== "http" && e.transport !== "sse") {
        return;
      }
      let h = ZV(e.name, {
        type: e.transport,
        url: e.url
      });
      if (h.kind === "anthropic-hosted") {
        a(h.message);
        return;
      }
      if (h.kind !== "oauth") {
        return;
      }
      s(true);
      a(null);
      let g = new AbortController();
      u.current = g;
      try {
        await dQ(e.name, h.config, c, g.signal);
        n(`Authentication successful for ${e.name}. The server will connect when the agent runs.`);
      } catch (y) {
        if (y instanceof Error && !(y instanceof p3)) {
          a(y.message);
        }
      } finally {
        s(false);
        u.current = null;
      }
    }, [e, n]);
    let m = DD(String(e.name));
    if (o) {
      return md.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        padding: 1,
        children: [md.jsxs(Text, {
          color: "claude",
          children: ["Authenticating with ", e.name, "\u2026"]
        }), md.jsxs(gXd, {
          children: [md.jsx(Ed, {}), md.jsx(Text, {
            children: " A browser window will open for authentication"
          })]
        }), l && md.jsxs(gXd, {
          flexDirection: "column",
          children: [md.jsx(Text, {
            dimColor: true,
            children: "If your browser doesn't open automatically, copy this URL manually:"
          }), md.jsx(Link, {
            url: l
          })]
        }), md.jsx(gXd, {
          marginLeft: 3,
          children: md.jsxs(Text, {
            dimColor: true,
            children: ["Return here after authenticating in your browser.", " ", md.jsx(Wr, {
              action: "confirm:no",
              context: "Confirmation",
              fallback: "Esc",
              description: "go back"
            })]
          })
        })]
      });
    }
    let f = [];
    if (e.needsAuth) {
      f.push({
        label: e.isAuthenticated ? "Re-authenticate" : "Authenticate",
        value: "auth"
      });
    }
    f.push({
      label: "Back",
      value: "back"
    });
    return md.jsxs(or, {
      title: `${m} MCP Server`,
      subtitle: "agent-only",
      onCancel: t,
      inputGuide: md.jsxs(Hn, {
        children: [md.jsx(xt, {
          chord: ["up", "down"],
          action: "navigate"
        }), md.jsx(xt, {
          chord: "enter",
          action: "confirm"
        }), md.jsx(Wr, {
          action: "confirm:no",
          context: "Confirmation",
          fallback: "Esc",
          description: "go back"
        })]
      }),
      children: [md.jsxs(ih, {
        box: "plain",
        columns: [{
          bold: true,
          width: 8
        }, {}],
        children: [md.jsxs(ih.Row, {
          children: [md.jsx(md.Fragment, {
            children: "Type:"
          }), md.jsx(Text, {
            dimColor: true,
            children: e.transport
          })]
        }), e.url && md.jsxs(ih.Row, {
          children: [md.jsx(md.Fragment, {
            children: "URL:"
          }), md.jsx(Text, {
            dimColor: true,
            children: e.url
          })]
        }), e.command && md.jsxs(ih.Row, {
          children: [md.jsx(md.Fragment, {
            children: "Command:"
          }), md.jsx(Text, {
            dimColor: true,
            children: e.command
          })]
        }), md.jsxs(ih.Row, {
          children: [md.jsx(md.Fragment, {
            children: "Used by:"
          }), md.jsx(Text, {
            dimColor: true,
            children: e.sourceAgents.join(", ")
          })]
        })]
      }), md.jsx(gXd, {
        children: md.jsxs(ih, {
          box: "plain",
          columns: [{
            bold: true,
            width: 8
          }, {}],
          children: [md.jsxs(ih.Row, {
            children: [md.jsx(md.Fragment, {
              children: "Status:"
            }), md.jsxs(Text, {
              children: [color("inactive", r)(vGd.radioOff), " not connected (agent-only)"]
            })]
          }), e.needsAuth && md.jsxs(ih.Row, {
            children: [md.jsx(md.Fragment, {
              children: "Auth:"
            }), e.isAuthenticated ? md.jsxs(Text, {
              children: [color("success", r)(vGd.tick), " authenticated"]
            }) : md.jsxs(Text, {
              children: [color("warning", r)(vGd.triangleUpOutline), " may need authentication"]
            })]
          })]
        })
      }), md.jsx(gXd, {
        children: md.jsx(Text, {
          dimColor: true,
          children: "This server connects only when running the agent."
        })
      }), i && md.jsx(gXd, {
        children: md.jsx(Hc, {
          error: i
        })
      }), md.jsx(gXd, {
        children: md.jsx(xr, {
          options: f,
          onChange: async h => {
            switch (h) {
              case "auth":
                await p();
                break;
              case "back":
                t();
                break;
            }
          },
          onCancel: t
        })
      })]
    });
  }
  var fie;
  var md;
  var D3o = __lazy(() => {
    et();
    Bs();
    Moe();
    D6e();
    Zn();
    Sd();
    OS();
    Ai();
    Ii();
    bv();
    bs();
    oYe();
    cA();
    fie = __toESM(ot(), 1);
    md = __toESM(ie(), 1);
  });
  function E6l(e) {
    switch (e) {
      case "project":
        return {
          label: "Project MCPs",
          path: D$(e)
        };
      case "user":
        return {
          label: "User MCPs",
          path: D$(e)
        };
      case "local":
        return {
          label: "Local MCPs",
          path: D$(e)
        };
      case "enterprise":
        return {
          label: "Enterprise MCPs"
        };
      case "agent":
        {
          let t = getMainThreadAgentType();
          return {
            label: "Active agent MCPs",
            path: t ? `@${t} frontmatter` : "agent frontmatter"
          };
        }
      case "dynamic":
        return {
          label: "Built-in MCPs",
          path: "always available"
        };
      default:
        return {
          label: e
        };
    }
  }
  function M5m(e) {
    let t = mZt.c(12);
    let {
      s: n
    } = e;
    if (n.duplicateOf.startsWith("plugin:")) {
      let r;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        r = fc.jsx(Text, {
          dimColor: true,
          children: "To use this connector instead, disable the plugin server in /plugins"
        });
        t[0] = r;
      } else {
        r = t[0];
      }
      return r;
    }
    switch (n.duplicateOfScope) {
      case "local":
      case "user":
      case "project":
        {
          let r;
          if (t[1] !== n.duplicateOf) {
            r = Py("mcp remove", n.duplicateOf);
            t[1] = n.duplicateOf;
            t[2] = r;
          } else {
            r = t[2];
          }
          let o = r;
          let s;
          if (t[3] !== o || t[4] !== n.duplicateOf || t[5] !== n.duplicateOfScope) {
            s = o ? fc.jsxs(fc.Fragment, {
              children: ["run ", fc.jsx(Text, {
                bold: true,
                children: o
              })]
            }) : `remove the ${n.duplicateOfScope}-scope server "${n.duplicateOf}"`;
            t[3] = o;
            t[4] = n.duplicateOf;
            t[5] = n.duplicateOfScope;
            t[6] = s;
          } else {
            s = t[6];
          }
          let i;
          if (t[7] !== s) {
            i = fc.jsxs(Text, {
              dimColor: true,
              children: ["To use this connector instead,", " ", s]
            });
            t[7] = s;
            t[8] = i;
          } else {
            i = t[8];
          }
          return i;
        }
      case "dynamic":
        {
          let r;
          if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
            r = fc.jsx(Text, {
              dimColor: true,
              children: "To use this connector instead, drop it from your --mcp-config flag"
            });
            t[9] = r;
          } else {
            r = t[9];
          }
          return r;
        }
      case "enterprise":
      case "managed":
        {
          let r;
          if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
            r = fc.jsx(Text, {
              dimColor: true,
              children: "An admin-managed server takes precedence here"
            });
            t[10] = r;
          } else {
            r = t[10];
          }
          return r;
        }
      default:
        {
          let r;
          if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
            r = fc.jsx(Text, {
              dimColor: true,
              children: "To use this connector instead, remove the duplicate server from your configuration"
            });
            t[11] = r;
          } else {
            r = t[11];
          }
          return r;
        }
    }
  }
  function N5m(e) {
    let t = new Map();
    for (let n of e) {
      let r = n.scope;
      if (!t.vZc(r)) {
        t.set(r, []);
      }
      t.get(r).push(n);
    }
    for (let [, n] of t) {
      n.sort((r, o) => r.name.localeCompare(o.name));
    }
    return t;
  }
  function mar(e) {
    let t = mZt.c(8);
    let {
      label: n,
      path: r
    } = e;
    let o;
    if (t[0] !== n) {
      o = fc.jsx(Text, {
        bold: true,
        children: n
      });
      t[0] = n;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s = r ?? false;
    let i;
    if (t[2] !== r || t[3] !== s) {
      i = fc.jsx(lie, {
        when: s,
        children: r
      });
      t[2] = r;
      t[3] = s;
      t[4] = i;
    } else {
      i = t[4];
    }
    let a;
    if (t[5] !== o || t[6] !== i) {
      a = fc.jsxs(gXd, {
        paddingLeft: 2,
        children: [o, i]
      });
      t[5] = o;
      t[6] = i;
      t[7] = a;
    } else {
      a = t[7];
    }
    return a;
  }
  function M3o({
    servers: e,
    suppressedClaudeAiConnectors: t = [],
    toolCountsByServer: n = {},
    agentServers: r,
    onSelectServer: o,
    onSelectAgentServer: s,
    onComplete: i,
    showUnusedConnectors: a,
    onToggleUnusedConnectors: l
  }) {
    let [c, u] = q3.useState(0);
    let {
      rows: d
    } = h_(Sr());
    let p = nE();
    let m = q3.useMemo(() => {
      let N = new Set(e.filter(W => W.scope === "agent").map(W => W.name));
      if (N.size === 0) {
        return r;
      }
      return r.filter(W => !N.vZc(W.name));
    }, [e, r]);
    let f = q3.useMemo(() => {
      let N = e.filter(W => W.client.config.type !== "claudeai-proxy");
      return N5m(N);
    }, [e]);
    let {
      claudeAiServers: h,
      unusedClaudeAiServers: g
    } = q3.useMemo(() => {
      let N = vWn();
      let W = [];
      let j = [];
      for (let z of e) {
        if (z.client.config.type !== "claudeai-proxy") {
          continue;
        }
        if ((z.client.type === "needs-auth" || z.client.type === "failed") && !N.vZc(z.name)) {
          j.push(z);
        } else {
          W.push(z);
        }
      }
      W.sort((z, V) => z.name.localeCompare(V.name));
      j.sort((z, V) => z.name.localeCompare(V.name));
      return {
        claudeAiServers: W,
        unusedClaudeAiServers: j
      };
    }, [e]);
    let y = q3.useMemo(() => (f.get("dynamic") ?? []).sort((N, W) => N.name.localeCompare(W.name)), [f]);
    let _ = q3.useMemo(() => {
      let N = [];
      for (let W of T6l) {
        let j = f.get(W) ?? [];
        for (let z of j) {
          N.push({
            type: "server",
            server: z
          });
        }
      }
      for (let W of h) {
        N.push({
          type: "server",
          server: W
        });
      }
      if (g.length > 0) {
        if (N.push({
          type: "unused-connectors-fold"
        }), a) {
          for (let W of g) {
            N.push({
              type: "server",
              server: W
            });
          }
        }
      }
      for (let W of m) {
        N.push({
          type: "agent-server",
          agentServer: W
        });
      }
      for (let W of y) {
        N.push({
          type: "server",
          server: W
        });
      }
      return N;
    }, [f, h, g, a, m, y]);
    let b = q3.useCallback(() => {
      i("MCP dialog dismissed", {
        display: "system"
      });
    }, [i]);
    let S = q3.useCallback(() => {
      let N = _[c];
      if (!N) {
        return;
      }
      if (N.type === "server") {
        o(N.server);
      } else if (N.type === "agent-server") {
        s(N.agentServer);
      } else if (N.type === "unused-connectors-fold") {
        l();
      }
    }, [_, c, o, s, l]);
    jo({
      "confirm:previous": () => u(N => N === 0 ? _.length - 1 : N - 1),
      "confirm:next": () => u(N => N === _.length - 1 ? 0 : N + 1),
      "confirm:yes": S,
      "confirm:no": b
    }, {
      context: "Confirmation"
    });
    q3.useEffect(() => {
      u(N => Math.min(N, Math.max(0, _.length - 1)));
    }, [_.length]);
    let E = isDebugMode();
    let C = q3.useMemo(() => {
      let N = a ? undefined : new Set(g.map(W => W.name));
      return e.some(W => W.client.type === "failed" && !N?.vZc(W.name));
    }, [e, g, a]);
    let x = q3.useMemo(() => {
      let N = [];
      let W = 0;
      function j(z, V) {
        let K = W++;
        N.push({
          key: V,
          selectableIndex: K,
          node: fc.jsx(L5m, {
            server: z,
            isSelected: c === K,
            toolCount: n[z.name]
          })
        });
      }
      for (let z of T6l) {
        let V = f.get(z);
        if (!V || V.length === 0) {
          continue;
        }
        let K = E6l(z);
        N.push({
          key: `heading-${z}`,
          node: fc.jsx(mar, {
            label: K.label,
            path: K.path
          })
        });
        for (let J of V) {
          j(J, `${z}-${J.name}`);
        }
        N.push({
          key: `spacer-${z}`,
          node: fc.jsx(Text, {
            children: " "
          })
        });
      }
      if (h.length > 0 || g.length > 0 || t.length > 0) {
        N.push({
          key: "heading-claudeai",
          node: fc.jsx(mar, {
            label: "claude.ai"
          })
        });
        for (let z of h) {
          j(z, `claudeai-${z.name}`);
        }
        if (g.length > 0) {
          let z = W++;
          if (N.push({
            key: "claudeai-unused-fold",
            selectableIndex: z,
            node: fc.jsx(gXd, {
              children: fc.jsxs(Text, {
                color: c === z ? "suggestion" : undefined,
                children: [c === z ? `${vGd.pointer} ` : "  ", a ? vGd.arrowDown : vGd.arrowRight, " ", "Show unused connectors", " ", fc.jsxs(Text, {
                  dimColor: true,
                  children: ["(", g.length, ")"]
                })]
              })
            })
          }), a) {
            for (let V of g) {
              j(V, `claudeai-${V.name}`);
            }
          }
        }
        for (let z of t) {
          N.push({
            key: `suppressed-${z.name}`,
            node: fc.jsxs(gXd, {
              children: [fc.jsx(Text, {
                children: "  "
              }), fc.jsx(Text, {
                children: z.name
              }), fc.jsxs(Text, {
                dimColor: true,
                children: [" ", "\xB7 ", vGd.radioOff, " hidden \u2014 same URL as your server '", z.duplicateOf, "'"]
              })]
            })
          });
          N.push({
            key: `suppressed-hint-${z.name}`,
            node: fc.jsx(gXd, {
              paddingLeft: 4,
              children: fc.jsx(M5m, {
                s: z
              })
            })
          });
        }
        N.push({
          key: "spacer-claudeai",
          node: fc.jsx(Text, {
            children: " "
          })
        });
      }
      if (m.length > 0) {
        N.push({
          key: "heading-agent-mcps",
          node: fc.jsx(mar, {
            label: "Agent MCPs"
          })
        });
        let z = W;
        for (let V of Ro(m.flatMap(K => K.sourceAgents))) {
          N.push({
            key: `spacer-agent-${V}`,
            node: fc.jsx(Text, {
              children: " "
            })
          });
          N.push({
            key: `subheading-agent-${V}`,
            node: fc.jsx(gXd, {
              paddingLeft: 2,
              children: fc.jsxs(Text, {
                dimColor: true,
                children: ["@", V]
              })
            })
          });
          for (let K of m.filter(J => J.sourceAgents.includes(V))) {
            let J = z + m.indexOf(K);
            N.push({
              key: `agent-${V}-${K.name}`,
              selectableIndex: J,
              node: fc.jsx(F5m, {
                agentServer: K,
                isSelected: c === J
              })
            });
          }
        }
        W = z + m.length;
        N.push({
          key: "spacer-agent-mcps",
          node: fc.jsx(Text, {
            children: " "
          })
        });
      }
      if (y.length > 0) {
        let z = E6l("dynamic");
        N.push({
          key: "heading-dynamic",
          node: fc.jsx(mar, {
            label: z.label,
            path: z.path
          })
        });
        for (let V of y) {
          j(V, `dynamic-${V.name}`);
        }
        N.push({
          key: "spacer-dynamic",
          node: fc.jsx(Text, {
            children: " "
          })
        });
      }
      if (N.at(-1)?.key.startsWith("spacer-")) {
        N.pop();
      }
      return N;
    }, [f, h, g, a, t, m, y, c, n]);
    if (e.length === 0 && m.length === 0 && t.length === 0) {
      return null;
    }
    let A = e.length + m.length;
    let I = Math.max(3, d - (p ? 5 : 12) - (C ? 1 : 0));
    let O = x.length > I;
    let M = O ? Math.max(1, I - 2) : I;
    let L = Math.max(0, x.findIndex(N => N.selectableIndex === c));
    let P = j_(L - Math.floor(M / 2), 0, Math.max(0, x.length - M));
    let F = x.slice(P, P + M);
    let H = P;
    let U = x.length - (P + F.length);
    return fc.jsxs(gXd, {
      flexDirection: "column",
      children: [fc.jsx(Hvt, {}), fc.jsx(or, {
        title: "Manage MCP servers",
        subtitle: `${A} ${un(A, "server")}`,
        onCancel: b,
        hideInputGuide: true,
        children: fc.jsxs(gXd, {
          flexDirection: "column",
          children: [H > 0 && fc.jsx(gXd, {
            paddingLeft: 2,
            children: fc.jsxs(Text, {
              dimColor: true,
              children: ["\u2191", " ", H, " more above"]
            })
          }), F.map(N => fc.jsx(v6l.Fragment, {
            children: N.node
          }, N.key)), U > 0 && fc.jsx(gXd, {
            paddingLeft: 2,
            children: fc.jsxs(Text, {
              dimColor: true,
              children: ["\u2193", " ", U, " more below"]
            })
          }), fc.jsxs(gXd, {
            flexDirection: "column",
            marginTop: O ? 0 : 1,
            children: [C && fc.jsx(Text, {
              dimColor: true,
              children: E ? "\u203B Error logs shown inline with --debug" : "\u203B Run claude --debug to see error logs"
            }), fc.jsxs(Text, {
              dimColor: true,
              children: [fc.jsx(Link, {
                url: "https://code.claude.com/docs/en/mcp",
                children: "https://code.claude.com/docs/en/mcp"
              }), " ", "for help"]
            })]
          })]
        })
      }), fc.jsx(gXd, {
        paddingX: 1,
        children: fc.jsx(Text, {
          dimColor: true,
          italic: true,
          children: fc.jsxs(Hn, {
            children: [fc.jsx(xt, {
              chord: ["up", "down"],
              action: "navigate"
            }), fc.jsx(xt, {
              chord: "enter",
              action: "confirm"
            }), fc.jsx(Wr, {
              action: "confirm:no",
              context: "Confirmation",
              fallback: "Esc",
              description: "cancel"
            })]
          })
        })
      })]
    });
  }
  function L5m(e) {
    let t = mZt.c(35);
    let {
      server: n,
      isSelected: r,
      toolCount: o
    } = e;
    let [s] = useTheme();
    let i;
    let a;
    if (n.client.type === "disabled") {
      let _;
      if (t[0] !== s) {
        _ = color("inactive", s)(vGd.radioOff);
        t[0] = s;
        t[1] = _;
      } else {
        _ = t[1];
      }
      i = _;
      a = "disabled";
    } else if (n.client.type === "connected") {
      let _ = !!n.client.capabilities?.tools;
      if (n.client.toolsListError) {
        let b;
        if (t[2] !== s) {
          b = color("warning", s)(vGd.triangleUpOutline);
          t[2] = s;
          t[3] = b;
        } else {
          b = t[3];
        }
        i = b;
        a = "connected \xB7 tools fetch failed";
      } else if (_ && o === 0) {
        let b;
        if (t[4] !== s) {
          b = color("warning", s)(vGd.triangleUpOutline);
          t[4] = s;
          t[5] = b;
        } else {
          b = t[5];
        }
        i = b;
        a = "connected \xB7 no tools";
      } else if (_ && o !== undefined) {
        let b;
        if (t[6] !== s) {
          b = color("success", s)(vGd.tick);
          t[6] = s;
          t[7] = b;
        } else {
          b = t[7];
        }
        i = b;
        let S;
        if (t[8] !== o) {
          S = un(o, "tool");
          t[8] = o;
          t[9] = S;
        } else {
          S = t[9];
        }
        a = `connected \xB7 ${o} ${S}`;
      } else {
        let b;
        if (t[10] !== s) {
          b = color("success", s)(vGd.tick);
          t[10] = s;
          t[11] = b;
        } else {
          b = t[11];
        }
        i = b;
        a = "connected";
      }
    } else if (n.client.type === "pending") {
      let _;
      if (t[12] !== s) {
        _ = color("inactive", s)(vGd.radioOff);
        t[12] = s;
        t[13] = _;
      } else {
        _ = t[13];
      }
      i = _;
      let {
        reconnectAttempt: b,
        maxReconnectAttempts: S
      } = n.client;
      if (b && S) {
        a = `reconnecting (${b}/${S})\u2026`;
      } else {
        a = "connecting\u2026";
      }
    } else if (n.client.type === "needs-auth") {
      let _;
      if (t[14] !== s) {
        _ = color("warning", s)(vGd.triangleUpOutline);
        t[14] = s;
        t[15] = _;
      } else {
        _ = t[15];
      }
      i = _;
      a = "needs authentication";
    } else {
      let _;
      if (t[16] !== s) {
        _ = color("error", s)(vGd.cross);
        t[16] = s;
        t[17] = _;
      } else {
        _ = t[17];
      }
      i = _;
      a = n.client.errorCode === "INVALID_CONFIG" ? "config issue" : "failed";
    }
    let l = r ? "suggestion" : undefined;
    let c = r ? `${vGd.pointer} ` : "  ";
    let u;
    if (t[18] !== l || t[19] !== c) {
      u = fc.jsx(Text, {
        color: l,
        children: c
      });
      t[18] = l;
      t[19] = c;
      t[20] = u;
    } else {
      u = t[20];
    }
    let d = r ? "suggestion" : undefined;
    let p;
    if (t[21] !== n.name || t[22] !== d) {
      p = fc.jsx(Text, {
        color: d,
        children: n.name
      });
      t[21] = n.name;
      t[22] = d;
      t[23] = p;
    } else {
      p = t[23];
    }
    let m = !r;
    let f;
    if (t[24] !== i || t[25] !== m) {
      f = fc.jsxs(Text, {
        dimColor: m,
        children: [" \xB7 ", i, " "]
      });
      t[24] = i;
      t[25] = m;
      t[26] = f;
    } else {
      f = t[26];
    }
    let h = !r;
    let g;
    if (t[27] !== a || t[28] !== h) {
      g = fc.jsx(Text, {
        dimColor: h,
        children: a
      });
      t[27] = a;
      t[28] = h;
      t[29] = g;
    } else {
      g = t[29];
    }
    let y;
    if (t[30] !== u || t[31] !== p || t[32] !== f || t[33] !== g) {
      y = fc.jsxs(gXd, {
        children: [u, p, f, g]
      });
      t[30] = u;
      t[31] = p;
      t[32] = f;
      t[33] = g;
      t[34] = y;
    } else {
      y = t[34];
    }
    return y;
  }
  function F5m(e) {
    let t = mZt.c(20);
    let {
      agentServer: n,
      isSelected: r
    } = e;
    let [o] = useTheme();
    let s;
    if (t[0] !== n.needsAuth || t[1] !== o) {
      s = n.needsAuth ? color("warning", o)(vGd.triangleUpOutline) : color("inactive", o)(vGd.radioOff);
      t[0] = n.needsAuth;
      t[1] = o;
      t[2] = s;
    } else {
      s = t[2];
    }
    let i = s;
    let a = n.needsAuth ? "may need auth" : "agent-only";
    let l = r ? "suggestion" : undefined;
    let c = r ? `${vGd.pointer} ` : "  ";
    let u;
    if (t[3] !== l || t[4] !== c) {
      u = fc.jsx(Text, {
        color: l,
        children: c
      });
      t[3] = l;
      t[4] = c;
      t[5] = u;
    } else {
      u = t[5];
    }
    let d = r ? "suggestion" : undefined;
    let p;
    if (t[6] !== n.name || t[7] !== d) {
      p = fc.jsx(Text, {
        color: d,
        children: n.name
      });
      t[6] = n.name;
      t[7] = d;
      t[8] = p;
    } else {
      p = t[8];
    }
    let m = !r;
    let f;
    if (t[9] !== i || t[10] !== m) {
      f = fc.jsxs(Text, {
        dimColor: m,
        children: [" \xB7 ", i, " "]
      });
      t[9] = i;
      t[10] = m;
      t[11] = f;
    } else {
      f = t[11];
    }
    let h = !r;
    let g;
    if (t[12] !== a || t[13] !== h) {
      g = fc.jsx(Text, {
        dimColor: h,
        children: a
      });
      t[12] = a;
      t[13] = h;
      t[14] = g;
    } else {
      g = t[14];
    }
    let y;
    if (t[15] !== g || t[16] !== u || t[17] !== p || t[18] !== f) {
      y = fc.jsxs(gXd, {
        children: [u, p, f, g]
      });
      t[15] = g;
      t[16] = u;
      t[17] = p;
      t[18] = f;
      t[19] = y;
    } else {
      y = t[19];
    }
    return y;
  }
  var mZt;
  var v6l;
  var q3;
  var fc;
  var T6l;
  var N3o = __lazy(() => {
    at();
    wl();
    rE();
    ki();
    Q8();
    et();
    Bs();
    l9();
    G1();
    je();
    Zn();
    Sd();
    Uvt();
    Ai();
    Ii();
    bs();
    Oir();
    mZt = __toESM(pt(), 1);
    v6l = __toESM(ot(), 1);
    q3 = __toESM(ot(), 1);
    fc = __toESM(ie(), 1);
    T6l = ["project", "local", "user", "enterprise", "agent"];
  });
  function L3o(e) {
    let t = w6l.c(25);
    let {
      serverName: n,
      onComplete: r
    } = e;
    let [o] = useTheme();
    let s = Ec();
    let i = Zvt();
    let [a, l] = fZt.useState(true);
    let [c, u] = fZt.useState(null);
    let d;
    let p;
    if (t[0] !== r || t[1] !== i || t[2] !== n || t[3] !== s) {
      d = () => {
        (async function () {
          try {
            if (!s.getState().mcp.clients.find(y => y.name === n)) {
              u(`MCP server "${n}" not found`);
              l(false);
              r(`MCP server "${n}" not found`);
              return;
            }
            let g = await i(n);
            e: switch (g.client.type) {
              case "connected":
                {
                  l(false);
                  r(`Successfully reconnected to ${n}`);
                  break e;
                }
              case "needs-auth":
                {
                  u(`${n} requires authentication`);
                  l(false);
                  r(`${n} requires authentication. Use /mcp to authenticate.`);
                  break e;
                }
              case "pending":
              case "failed":
              case "disabled":
                u(`Failed to reconnect to ${n}`);
                l(false);
                r(`Failed to reconnect to ${n}`);
            }
          } catch (h) {
            let g = h;
            let y = g instanceof Error ? g.message : String(g);
            u(y);
            l(false);
            r(`Error: ${y}`);
          }
        })();
      };
      p = [n, i, s, r];
      t[0] = r;
      t[1] = i;
      t[2] = n;
      t[3] = s;
      t[4] = d;
      t[5] = p;
    } else {
      d = t[4];
      p = t[5];
    }
    if (fZt.useEffect(d, p), a) {
      let m;
      if (t[6] !== n) {
        m = hie.jsxs(Text, {
          color: "text",
          children: ["Reconnecting to ", hie.jsx(Text, {
            bold: true,
            children: n
          })]
        });
        t[6] = n;
        t[7] = m;
      } else {
        m = t[7];
      }
      let f;
      if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
        f = hie.jsx(Xc, {
          message: "Establishing connection to MCP server"
        });
        t[8] = f;
      } else {
        f = t[8];
      }
      let h;
      if (t[9] !== m) {
        h = hie.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          padding: 1,
          children: [m, f]
        });
        t[9] = m;
        t[10] = h;
      } else {
        h = t[10];
      }
      return h;
    }
    if (c) {
      let m;
      if (t[11] !== o) {
        m = color("error", o)(vGd.cross);
        t[11] = o;
        t[12] = m;
      } else {
        m = t[12];
      }
      let f;
      if (t[13] !== m) {
        f = hie.jsxs(Text, {
          children: [m, " "]
        });
        t[13] = m;
        t[14] = f;
      } else {
        f = t[14];
      }
      let h;
      if (t[15] !== n) {
        h = hie.jsxs(Text, {
          color: "error",
          children: ["Failed to reconnect to ", n]
        });
        t[15] = n;
        t[16] = h;
      } else {
        h = t[16];
      }
      let g;
      if (t[17] !== f || t[18] !== h) {
        g = hie.jsxs(gXd, {
          children: [f, h]
        });
        t[17] = f;
        t[18] = h;
        t[19] = g;
      } else {
        g = t[19];
      }
      let y;
      if (t[20] !== c) {
        y = hie.jsxs(Text, {
          dimColor: true,
          children: ["Error: ", c]
        });
        t[20] = c;
        t[21] = y;
      } else {
        y = t[21];
      }
      let _;
      if (t[22] !== g || t[23] !== y) {
        _ = hie.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          padding: 1,
          children: [g, y]
        });
        t[22] = g;
        t[23] = y;
        t[24] = _;
      } else {
        _ = t[24];
      }
      return _;
    }
    return null;
  }
  var w6l;
  var fZt;
  var hie;
  var F3o = __lazy(() => {
    et();
    Hfe();
    ho();
    Pv();
    w6l = __toESM(pt(), 1);
    fZt = __toESM(ot(), 1);
    hie = __toESM(ie(), 1);
  });
  function far(e) {
    let t = C6l.c(9);
    let {
      serverToolsCount: n,
      serverPromptsCount: r,
      serverResourcesCount: o
    } = e;
    let s;
    if (t[0] !== r || t[1] !== o || t[2] !== n) {
      if (s = [], n > 0) {
        s.push("tools");
      }
      if (o > 0) {
        s.push("resources");
      }
      if (r > 0) {
        s.push("prompts");
      }
      t[0] = r;
      t[1] = o;
      t[2] = n;
      t[3] = s;
    } else {
      s = t[3];
    }
    let i;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      i = ewt.jsx(Text, {
        bold: true,
        children: "Capabilities: "
      });
      t[4] = i;
    } else {
      i = t[4];
    }
    let a;
    if (t[5] !== s) {
      a = s.length > 0 ? ewt.jsx(Hn, {
        children: s
      }) : "none";
      t[5] = s;
      t[6] = a;
    } else {
      a = t[6];
    }
    let l;
    if (t[7] !== a) {
      l = ewt.jsxs(gXd, {
        children: [i, ewt.jsx(Text, {
          color: "text",
          children: a
        })]
      });
      t[7] = a;
      t[8] = l;
    } else {
      l = t[8];
    }
    return l;
  }
  var C6l;
  var ewt;
  var U3o = __lazy(() => {
    et();
    Ai();
    C6l = __toESM(pt(), 1);
    ewt = __toESM(ie(), 1);
  });
  function har(e) {
    let t = "url" in e.config ? e.config.url : null;
    let n = e.errorCode;
    if (n === "INVALID_CONFIG" || n === "AUTH_HEADER_REJECTED" || n === "FIRST_PARTY_AUTH_REJECTED" || n === "ENDPOINT_NOT_FOUND") {
      return e.error ?? n;
    }
    if (n) {
      let r = Number(n);
      let o = n === "23" ? "request timed out" : Number.isInteger(r) && r >= 100 && r <= 599 ? `HTTP ${n}` : n;
      return t ? `${o} at ${t}` : o;
    }
    return e.error ?? "";
  }
  function gar(e, t, n) {
    switch (e.client.type) {
      case "connected":
        if (e.client.toolsListError) {
          return {
            message: `Reconnected to ${t}, but fetching tools failed: ${e.client.toolsListError}`,
            success: false
          };
        }
        return {
          message: `Reconnected to ${t}.`,
          success: true
        };
      case "needs-auth":
        return {
          message: n?.hasHeadersHelper ? `${t} requires authentication. Use 'Authenticate' if the upstream server uses OAuth, or check the headersHelper script and use 'Reconnect'.` : `${t} requires authentication. Use the 'Authenticate' option.`,
          success: false
        };
      case "failed":
        {
          let r = har(e.client);
          return {
            message: r ? `Failed to reconnect to ${t}: ${r}` : `Failed to reconnect to ${t}.`,
            success: false
          };
        }
      default:
        return {
          message: `Unknown result when reconnecting to ${t}.`,
          success: false
        };
    }
  }
  function hZt(e, t) {
    let n = e instanceof Error ? e.message : String(e);
    return `Error reconnecting to ${t}: ${n}`;
  }
  function TYe({
    server: e,
    serverToolsCount: t,
    onViewTools: n,
    onCancel: r,
    onComplete: o,
    borderless: s = false
  }) {
    let [i] = useTheme();
    Eg();
    let {
      columns: a
    } = Sr();
    let [l, c] = Xw.useState(false);
    let [u, d] = Xw.useState(null);
    let p = bt(ce => ce.mcp);
    let m = Lo();
    let [f, h] = Xw.useState(null);
    let [g, y] = Xw.useState(false);
    let _ = Xw.useRef(null);
    let [b, S] = Xw.useState(false);
    let [E, C] = Xw.useState(null);
    let [x, A] = Xw.useState(false);
    let [k, I] = Xw.useState(false);
    let [O, M] = Xw.useState(false);
    let L = useClock();
    let P = Xw.useRef(undefined);
    let F = Xw.useRef(false);
    let [H, U] = Xw.useState("");
    let [N, W] = Xw.useState(0);
    let [j, z] = Xw.useState(null);
    Xw.useEffect(() => () => {
      if (F.current = true, _.current?.abort(), P.current !== undefined) {
        P.current();
      }
    }, []);
    let V = e.isAuthenticated || e.client.type === "connected" && t > 0;
    let K = Zvt();
    let J = Xw.useCallback(async () => {
      S(false);
      C(null);
      y(true);
      try {
        let ce = await K(e.name);
        let le = ce.client.type === "connected";
        if (logEvent("tengu_claudeai_mcp_auth_completed", {
          success: le
        }), le) {
          o(`Authentication successful. Connected to ${e.name}.`);
        } else if (ce.client.type === "needs-auth") {
          o(`Tried reconnecting, but ${e.name} is still unauthorized. Make sure the browser sign-in completed, then try again from /mcp.`);
        } else {
          let pe = ce.client.type === "failed" ? har(ce.client) : "";
          o(pe ? `Tried reconnecting to ${e.name}, but the connection failed: ${pe}` : `Tried reconnecting to ${e.name}, but the connection failed. Restart Claude Code to retry.`);
        }
      } catch (ce) {
        logEvent("tengu_claudeai_mcp_auth_completed", {
          success: false
        });
        o(hZt(ce, e.name));
      } finally {
        y(false);
      }
    }, [K, e.name, o]);
    let Q = Xw.useCallback(async () => {
      await Ow(e.name, {
        ...e.config,
        scope: e.scope
      });
      m(ce => {
        let le = ce.mcp.clients.map(xe => xe.name === e.name ? {
          ...xe,
          type: "needs-auth"
        } : xe);
        let pe = PWn(ce.mcp.tools, e.name);
        let ve = zft(ce.mcp.commands, e.name);
        let _e = Kft(ce.mcp.resources, e.name);
        return {
          ...ce,
          mcp: {
            ...ce.mcp,
            clients: le,
            tools: pe,
            commands: ve,
            resources: _e
          }
        };
      });
      logEvent("tengu_claudeai_mcp_clear_auth_completed", {});
      o(`Disconnected from ${e.name}.`);
      A(false);
      I(false);
    }, [e.name, e.config, e.scope, m, o]);
    uo("confirm:no", () => {
      _.current?.abort();
      _.current = null;
      c(false);
      h(null);
    }, {
      context: "Confirmation",
      isActive: l
    });
    uo("confirm:no", () => {
      S(false);
      C(null);
    }, {
      context: "Confirmation",
      isActive: b
    });
    uo("confirm:no", () => {
      A(false);
      I(false);
    }, {
      context: "Confirmation",
      isActive: x
    });
    function Z(ce) {
      if (ce.key === "return" && b) {
        ce.preventDefault();
        J();
      }
      if (ce.key === "return" && x) {
        if (ce.preventDefault(), k) {
          Q();
        } else {
          I(true);
          Ac(fEe());
        }
      }
      if (ce.key === "c" && !ce.ctrl && !ce.meta && !O) {
        let le = f || E || (k ? fEe() : null);
        if (le) {
          ce.preventDefault();
          Uk(le).then(pe => {
            if (F.current) {
              return;
            }
            if (pe) {
              process.stdout.write(pe);
            }
            if (M(true), P.current !== undefined) {
              P.current();
            }
            P.current = L.setTimeout(() => M(false), 2000);
          });
        }
      }
    }
    let ne = DD(String(e.name));
    let oe = IWn(p.commands, e.name).length;
    let ee = TUe();
    let re = Xw.useCallback(async () => {
      let ce = (e.config.type === "claudeai-proxy" ? aNe(e.config) : null) ?? fEe();
      C(ce);
      S(true);
      logEvent("tengu_claudeai_mcp_auth_started", {});
      await Ac(ce);
    }, [e.config]);
    let se = Xw.useCallback(() => {
      A(true);
      logEvent("tengu_claudeai_mcp_clear_auth_started", {});
    }, []);
    let ae = Xw.useCallback(async () => {
      let ce = e.client.type !== "disabled";
      try {
        if (await ee(e.name), e.config.type === "claudeai-proxy") {
          logEvent("tengu_claudeai_mcp_toggle", {
            new_state: ce ? "disabled" : "enabled"
          });
        }
        r();
      } catch (le) {
        o(`Failed to ${ce ? "disable" : "enable"} MCP server '${e.name}': ${he(le)}`);
      }
    }, [e.client.type, e.config.type, e.name, ee, r, o]);
    let de = Xw.useCallback(async () => {
      let ce = ZV(e.name, {
        ...e.config,
        scope: e.scope
      });
      if (ce.kind === "anthropic-hosted") {
        d(ce.message);
        return;
      }
      if (ce.kind !== "oauth") {
        return;
      }
      c(true);
      d(null);
      let le = new AbortController();
      _.current = le;
      try {
        if (e.isAuthenticated) {
          await yEe(e.name, ce.config, {
            preserveStepUpState: true
          });
        }
        await dQ(e.name, ce.config, h, le.signal, {
          onWaitingForCallback: ve => {
            z(() => ve);
          }
        });
        logEvent("tengu_mcp_auth_config_authenticate", {
          wasAuthenticated: e.isAuthenticated
        });
        let pe = await K(e.name);
        if (pe.client.type === "connected") {
          let ve = V ? `Authentication successful. Reconnected to ${e.name}.` : `Authentication successful. Connected to ${e.name}.`;
          o(ve);
        } else if (pe.client.type === "needs-auth") {
          o(`Got new credentials, but ${e.name} rejected them on reconnect. Try re-authenticating, or restart Claude Code if it persists.`);
        } else {
          dn(e.name, "Reconnection failed after authentication");
          let ve = pe.client.type === "failed" ? har(pe.client) : "";
          o(ve ? `Got new credentials, but reconnecting to ${e.name} failed: ${ve}` : `Got new credentials, but reconnecting to ${e.name} failed. Restart Claude Code to retry.`);
        }
      } catch (pe) {
        if (pe instanceof Error && !(pe instanceof p3)) {
          d(pe.message);
        }
      } finally {
        c(false);
        _.current = null;
        z(null);
        U("");
      }
    }, [e.isAuthenticated, e.config, e.name, e.scope, o, K, V]);
    let be = async () => {
      if (e.config.type === "claudeai-proxy") {
        return;
      }
      if (e.config) {
        await yEe(e.name, e.config);
        logEvent("tengu_mcp_auth_config_clear", {});
        await Ow(e.name, {
          ...e.config,
          scope: e.scope
        });
        m(ce => {
          let le = ce.mcp.clients.map(xe => xe.name === e.name ? {
            ...xe,
            type: "failed"
          } : xe);
          let pe = PWn(ce.mcp.tools, e.name);
          let ve = zft(ce.mcp.commands, e.name);
          let _e = Kft(ce.mcp.resources, e.name);
          return {
            ...ce,
            mcp: {
              ...ce.mcp,
              clients: le,
              tools: pe,
              commands: ve,
              resources: _e
            }
          };
        });
        o(`Authentication cleared for ${e.name}.`);
      }
    };
    if (l) {
      let ce = e.config.type !== "claudeai-proxy" && e.config.oauth?.xaa ? " Authenticating via your identity provider" : " A browser window will open for authentication";
      return os.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        padding: 1,
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: Z,
        children: [os.jsxs(Text, {
          color: "claude",
          children: ["Authenticating with ", e.name, "\u2026"]
        }), os.jsxs(gXd, {
          children: [os.jsx(Ed, {}), os.jsx(Text, {
            children: ce
          })]
        }), f && os.jsxs(gXd, {
          flexDirection: "column",
          children: [os.jsxs(gXd, {
            children: [os.jsxs(Text, {
              dimColor: true,
              children: ["If your browser doesn't open automatically, copy this URL manually", " "]
            }), O ? os.jsx(Text, {
              color: "success",
              children: "(Copied!)"
            }) : os.jsx(Text, {
              dimColor: true,
              children: os.jsx(xt, {
                chord: "c",
                action: "copy",
                parens: true
              })
            })]
          }), os.jsx(Link, {
            url: f
          })]
        }), l && f && j && os.jsxs(gXd, {
          flexDirection: "column",
          marginTop: 1,
          children: [os.jsx(Text, {
            dimColor: true,
            children: "If the redirect page shows a connection error, paste the URL from your browser's address bar:"
          }), os.jsxs(gXd, {
            children: [os.jsxs(Text, {
              dimColor: true,
              children: ["URL ", ">", " "]
            }), os.jsx(Dl, {
              value: H,
              onChange: U,
              onSubmit: le => {
                j(le.trim());
                U("");
              },
              cursorOffset: N,
              onChangeCursorOffset: W,
              columns: a - 8
            })]
          })]
        }), os.jsx(gXd, {
          marginLeft: 3,
          children: os.jsxs(Text, {
            dimColor: true,
            children: ["Return here after authenticating in your browser. Press", " ", os.jsx(xt, {
              chord: "escape",
              action: "go back"
            }), "."]
          })
        })]
      });
    }
    if (b) {
      return os.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        padding: 1,
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: Z,
        children: [os.jsxs(Text, {
          color: "claude",
          children: ["Authenticating with ", e.name, "\u2026"]
        }), os.jsxs(gXd, {
          children: [os.jsx(Ed, {}), os.jsx(Text, {
            children: " A browser window will open for authentication"
          })]
        }), E && os.jsxs(gXd, {
          flexDirection: "column",
          children: [os.jsxs(gXd, {
            children: [os.jsxs(Text, {
              dimColor: true,
              children: ["If your browser doesn't open automatically, copy this URL manually", " "]
            }), O ? os.jsx(Text, {
              color: "success",
              children: "(Copied!)"
            }) : os.jsx(Text, {
              dimColor: true,
              children: os.jsx(xt, {
                chord: "c",
                action: "copy",
                parens: true
              })
            })]
          }), os.jsx(Link, {
            url: E
          })]
        }), os.jsxs(gXd, {
          marginLeft: 3,
          flexDirection: "column",
          children: [os.jsxs(Text, {
            color: "permission",
            children: ["Press ", os.jsx(Text, {
              bold: true,
              children: "Enter"
            }), " after authenticating in your browser."]
          }), os.jsx(Text, {
            dimColor: true,
            italic: true,
            children: os.jsx(Wr, {
              action: "confirm:no",
              context: "Confirmation",
              fallback: "Esc",
              description: "back"
            })
          })]
        })]
      });
    }
    if (x) {
      return os.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        padding: 1,
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: Z,
        children: [os.jsxs(Text, {
          color: "claude",
          children: ["Clear authentication for ", e.name]
        }), k ? os.jsxs(os.Fragment, {
          children: [os.jsx(Text, {
            children: 'Find the MCP server in the browser and click "Disconnect".'
          }), os.jsxs(gXd, {
            flexDirection: "column",
            children: [os.jsxs(gXd, {
              children: [os.jsxs(Text, {
                dimColor: true,
                children: ["If your browser didn't open automatically, copy this URL manually", " "]
              }), O ? os.jsx(Text, {
                color: "success",
                children: "(Copied!)"
              }) : os.jsx(Text, {
                dimColor: true,
                children: os.jsx(xt, {
                  chord: "c",
                  action: "copy",
                  parens: true
                })
              })]
            }), os.jsx(Link, {
              url: fEe()
            })]
          }), os.jsxs(gXd, {
            marginLeft: 3,
            flexDirection: "column",
            children: [os.jsxs(Text, {
              color: "permission",
              children: ["Press ", os.jsx(Text, {
                bold: true,
                children: "Enter"
              }), " when done."]
            }), os.jsx(Text, {
              dimColor: true,
              italic: true,
              children: os.jsx(Wr, {
                action: "confirm:no",
                context: "Confirmation",
                fallback: "Esc",
                description: "back"
              })
            })]
          })]
        }) : os.jsxs(os.Fragment, {
          children: [os.jsx(Text, {
            children: 'This will open claude.ai in the browser. Find the MCP server in the list and click "Disconnect".'
          }), os.jsxs(gXd, {
            marginLeft: 3,
            flexDirection: "column",
            children: [os.jsxs(Text, {
              color: "permission",
              children: ["Press", " ", os.jsx(xt, {
                chord: "enter",
                action: "open the browser",
                bold: true
              }), "."]
            }), os.jsx(Text, {
              dimColor: true,
              italic: true,
              children: os.jsx(Wr, {
                action: "confirm:no",
                context: "Confirmation",
                fallback: "Esc",
                description: "back"
              })
            })]
          })]
        })]
      });
    }
    if (g) {
      return os.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        padding: 1,
        children: [os.jsxs(Text, {
          color: "text",
          children: ["Connecting to ", os.jsx(Text, {
            bold: true,
            children: e.name
          }), "\u2026"]
        }), os.jsxs(gXd, {
          children: [os.jsx(Ed, {}), os.jsx(Text, {
            children: " Establishing connection to MCP server"
          })]
        }), os.jsx(Text, {
          dimColor: true,
          children: "This may take a few moments."
        })]
      });
    }
    let fe = [];
    if (e.client.type === "disabled") {
      fe.push({
        label: "Enable",
        value: "toggle-enabled"
      });
    }
    if (e.client.type === "connected" && t > 0) {
      fe.push({
        label: "View tools",
        value: "tools"
      });
    }
    let me = (e.config.type === "sse" || e.config.type === "http") && v4e(e.config);
    let Te = (e.config.type === "sse" || e.config.type === "http") && qIn(e.config, !!getClaudeAIOAuthTokens()?.accessToken || bEe());
    if (e.config.type === "claudeai-proxy") {
      if (e.client.type === "connected") {
        fe.push({
          label: "Clear authentication",
          value: "claudeai-clear-auth"
        });
      } else if (e.client.type !== "disabled") {
        fe.push({
          label: "Authenticate",
          value: "claudeai-auth"
        });
      }
    } else {
      if (V) {
        if (!Te) {
          fe.push({
            label: "Re-authenticate",
            value: "reauth"
          });
        }
        fe.push({
          label: "Clear authentication",
          value: "clear-auth"
        });
      }
      if (!V && !Te) {
        fe.push({
          label: "Authenticate",
          value: "auth"
        });
      }
    }
    let ue = e.config.type !== "claudeai-proxy" && !!e.config.headersHelper;
    if (e.client.type !== "disabled") {
      if (e.client.type !== "needs-auth" || ue || me) {
        fe.push({
          label: "Reconnect",
          value: "reconnectMcpServer"
        });
      }
      fe.push({
        label: "Disable",
        value: "toggle-enabled"
      });
    }
    if (fe.length === 0) {
      fe.push({
        label: "Back",
        value: "back"
      });
    }
    return os.jsx(gXd, {
      flexDirection: "column",
      paddingX: s ? 1 : 0,
      children: os.jsxs(or, {
        title: `${ne} MCP Server`,
        onCancel: r,
        hideBorder: s,
        inputGuide: os.jsxs(Hn, {
          children: [os.jsx(xt, {
            chord: ["up", "down"],
            action: "navigate"
          }), os.jsx(xt, {
            chord: "enter",
            action: "select"
          }), os.jsx(Wr, {
            action: "confirm:no",
            context: "Confirmation",
            fallback: "Esc",
            description: "back"
          })]
        }),
        children: [os.jsxs(gXd, {
          flexDirection: "column",
          gap: 0,
          children: [os.jsxs(ih, {
            box: "plain",
            columns: [{
              bold: true
            }, {}],
            children: [os.jsxs(ih.Row, {
              children: [os.jsx(os.Fragment, {
                children: "Status:"
              }), e.client.type === "disabled" ? os.jsxs(Text, {
                children: [color("inactive", i)(vGd.radioOff), " disabled"]
              }) : e.client.type === "connected" ? e.client.toolsListError ? os.jsxs(Text, {
                children: [os.jsx(Ps, {
                  status: "warning",
                  withSpace: true
                }), "connected \xB7 tools fetch failed"]
              }) : e.client.capabilities?.tools && t === 0 ? os.jsxs(Text, {
                children: [os.jsx(Ps, {
                  status: "warning",
                  withSpace: true
                }), "connected \xB7 no tools"]
              }) : os.jsxs(Text, {
                children: [os.jsx(Ps, {
                  status: "success",
                  withSpace: true
                }), "connected"]
              }) : e.client.type === "pending" ? os.jsxs(Text, {
                children: [os.jsx(Text, {
                  dimColor: true,
                  children: vGd.radioOff
                }), " connecting\u2026"]
              }) : e.client.type === "needs-auth" ? os.jsxs(Text, {
                children: [color("warning", i)(vGd.triangleUpOutline), " needs authentication"]
              }) : os.jsxs(Text, {
                children: [os.jsx(Ps, {
                  status: "error",
                  withSpace: true
                }), e.client.errorCode === "INVALID_CONFIG" ? "config issue" : "failed"]
              })]
            }), (e.client.type === "failed" || e.client.type === "needs-auth") && e.client.error && os.jsxs(ih.Row, {
              children: [os.jsx(os.Fragment, {
                children: "Issue:"
              }), os.jsx(Text, {
                dimColor: true,
                children: e.client.error
              })]
            }), e.transport !== "claudeai-proxy" && os.jsxs(ih.Row, {
              children: [os.jsx(os.Fragment, {
                children: "Auth:"
              }), V ? os.jsxs(Text, {
                children: [os.jsx(Ps, {
                  status: "success",
                  withSpace: true
                }), "authenticated"]
              }) : os.jsxs(Text, {
                children: [os.jsx(Ps, {
                  status: "error",
                  withSpace: true
                }), "not authenticated"]
              })]
            }), os.jsxs(ih.Row, {
              children: [os.jsx(os.Fragment, {
                children: "URL:"
              }), os.jsx(Text, {
                dimColor: true,
                children: e.config.url
              })]
            }), os.jsxs(ih.Row, {
              children: [os.jsx(os.Fragment, {
                children: "Config location:"
              }), os.jsx(Text, {
                dimColor: true,
                children: D$(e.scope)
              })]
            })]
          }), e.client.type === "connected" && os.jsx(far, {
            serverToolsCount: t,
            serverPromptsCount: oe,
            serverResourcesCount: p.resources[e.name]?.length || 0
          }), e.client.type === "connected" && t > 0 && os.jsxs(gXd, {
            children: [os.jsx(Text, {
              bold: true,
              children: "Tools: "
            }), os.jsxs(Text, {
              dimColor: true,
              children: [t, " ", un(t, "tool")]
            })]
          }), e.client.type === "connected" && e.client.toolsListError && os.jsxs(gXd, {
            flexDirection: "column",
            children: [os.jsx(Text, {
              bold: true,
              children: "Issue: "
            }), os.jsx(Text, {
              dimColor: true,
              children: e.client.toolsListError
            })]
          })]
        }), u && os.jsx(gXd, {
          children: os.jsx(Hc, {
            error: u
          })
        }), fe.length > 0 && os.jsx(gXd, {
          children: os.jsx(xr, {
            options: fe,
            onChange: async ce => {
              switch (ce) {
                case "tools":
                  n();
                  break;
                case "auth":
                case "reauth":
                  await de();
                  break;
                case "clear-auth":
                  await be();
                  break;
                case "claudeai-auth":
                  await re();
                  break;
                case "claudeai-clear-auth":
                  se();
                  break;
                case "reconnectMcpServer":
                  y(true);
                  try {
                    let le = await K(e.name);
                    if (e.config.type === "claudeai-proxy") {
                      logEvent("tengu_claudeai_mcp_reconnect", {
                        success: le.client.type === "connected"
                      });
                    }
                    let {
                      message: pe
                    } = gar(le, e.name, {
                      hasHeadersHelper: ue
                    });
                    o(pe);
                  } catch (le) {
                    if (e.config.type === "claudeai-proxy") {
                      logEvent("tengu_claudeai_mcp_reconnect", {
                        success: false
                      });
                    }
                    o(hZt(le, e.name));
                  } finally {
                    y(false);
                  }
                  break;
                case "toggle-enabled":
                  await ae();
                  break;
                case "back":
                  r();
                  break;
              }
            },
            onCancel: r
          })
        })]
      })
    });
  }
  var Xw;
  var os;
  var yar = __lazy(() => {
    Ot();
    mO();
    ki();
    Tg();
    et();
    Bs();
    Moe();
    Oce();
    D6e();
    l9();
    eA();
    Hfe();
    G1();
    ho();
    no();
    ky();
    dt();
    Rn();
    Zn();
    Sd();
    OS();
    Ai();
    Ii();
    bv();
    bs();
    Vf();
    oYe();
    cA();
    q_();
    U3o();
    Xw = __toESM(ot(), 1);
    os = __toESM(ie(), 1);
  });
  function gZt({
    server: e,
    serverToolsCount: t,
    onViewTools: n,
    onCancel: r,
    onComplete: o,
    borderless: s = false
  }) {
    let [i] = useTheme();
    let a = bt(g => g.mcp);
    let l = Zvt();
    let c = TUe();
    let [u, d] = _ar.useState(false);
    let p = _ar.useCallback(async () => {
      let g = e.client.type !== "disabled";
      try {
        await c(e.name);
        r();
      } catch (y) {
        o(`Failed to ${g ? "disable" : "enable"} MCP server '${e.name}': ${he(y)}`);
      }
    }, [e.client.type, e.name, c, r, o]);
    let m = DD(String(e.name));
    let f = IWn(a.commands, e.name).length;
    let h = [];
    if (e.client.type !== "disabled" && t > 0) {
      h.push({
        label: "View tools",
        value: "tools"
      });
    }
    if (e.client.type !== "disabled") {
      h.push({
        label: "Reconnect",
        value: "reconnectMcpServer"
      });
    }
    if (h.push({
      label: e.client.type !== "disabled" ? "Disable" : "Enable",
      value: "toggle-enabled"
    }), h.length === 0) {
      h.push({
        label: "Back",
        value: "back"
      });
    }
    if (u) {
      return Rd.jsxs(or, {
        title: `${m} MCP Server`,
        onCancel: () => {},
        hideBorder: s,
        hideInputGuide: true,
        children: [Rd.jsxs(Text, {
          color: "text",
          children: ["Reconnecting to ", Rd.jsx(Text, {
            bold: true,
            children: e.name
          })]
        }), Rd.jsxs(gXd, {
          children: [Rd.jsx(Ed, {}), Rd.jsx(Text, {
            children: " Restarting MCP server process"
          })]
        }), Rd.jsx(Text, {
          dimColor: true,
          children: "This may take a few moments."
        })]
      });
    }
    return Rd.jsxs(or, {
      title: `${m} MCP Server`,
      onCancel: r,
      hideBorder: s,
      inputGuide: Rd.jsxs(Hn, {
        children: [Rd.jsx(xt, {
          chord: ["up", "down"],
          action: "navigate"
        }), Rd.jsx(xt, {
          chord: "enter",
          action: "select"
        }), Rd.jsx(Wr, {
          action: "confirm:no",
          context: "Confirmation",
          fallback: "Esc",
          description: "back"
        })]
      }),
      children: [Rd.jsxs(gXd, {
        flexDirection: "column",
        gap: 0,
        children: [Rd.jsxs(ih, {
          box: "plain",
          columns: [{
            bold: true
          }, {}],
          children: [Rd.jsxs(ih.Row, {
            children: [Rd.jsx(Rd.Fragment, {
              children: "Status:"
            }), e.client.type === "disabled" ? Rd.jsxs(Text, {
              children: [color("inactive", i)(vGd.radioOff), " disabled"]
            }) : e.client.type === "connected" ? e.client.toolsListError ? Rd.jsxs(Text, {
              children: [Rd.jsx(Ps, {
                status: "warning",
                withSpace: true
              }), "connected \xB7 tools fetch failed"]
            }) : e.client.capabilities?.tools && t === 0 ? Rd.jsxs(Text, {
              children: [Rd.jsx(Ps, {
                status: "warning",
                withSpace: true
              }), "connected \xB7 no tools"]
            }) : Rd.jsxs(Text, {
              children: [Rd.jsx(Ps, {
                status: "success",
                withSpace: true
              }), "connected"]
            }) : e.client.type === "pending" ? Rd.jsxs(Text, {
              children: [Rd.jsx(Ps, {
                status: "pending",
                withSpace: true
              }), "connecting\u2026"]
            }) : Rd.jsxs(Text, {
              children: [Rd.jsx(Ps, {
                status: "error",
                withSpace: true
              }), "failed"]
            })]
          }), Rd.jsxs(ih.Row, {
            children: [Rd.jsx(Rd.Fragment, {
              children: "Command:"
            }), Rd.jsx(Text, {
              dimColor: true,
              children: e.config.command
            })]
          }), e.config.args && e.config.args.length > 0 && Rd.jsxs(ih.Row, {
            children: [Rd.jsx(Rd.Fragment, {
              children: "Args:"
            }), Rd.jsx(Text, {
              dimColor: true,
              children: e.config.args.join(" ")
            })]
          }), Rd.jsxs(ih.Row, {
            children: [Rd.jsx(Rd.Fragment, {
              children: "Config location:"
            }), Rd.jsx(Text, {
              dimColor: true,
              children: D$(getMcpConfigByName(e.name)?.scope ?? "dynamic")
            })]
          })]
        }), e.client.type === "connected" && Rd.jsx(far, {
          serverToolsCount: t,
          serverPromptsCount: f,
          serverResourcesCount: a.resources[e.name]?.length || 0
        }), e.client.type === "connected" && t > 0 && Rd.jsxs(gXd, {
          children: [Rd.jsx(Text, {
            bold: true,
            children: "Tools: "
          }), Rd.jsxs(Text, {
            dimColor: true,
            children: [t, " ", un(t, "tool")]
          })]
        }), e.client.type === "connected" && e.client.toolsListError && Rd.jsxs(gXd, {
          flexDirection: "column",
          children: [Rd.jsx(Text, {
            bold: true,
            children: "Issue: "
          }), Rd.jsx(Text, {
            dimColor: true,
            children: e.client.toolsListError
          })]
        })]
      }), h.length > 0 && Rd.jsx(gXd, {
        children: Rd.jsx(xr, {
          options: h,
          onChange: async g => {
            if (g === "tools") {
              n();
            } else if (g === "reconnectMcpServer") {
              d(true);
              try {
                let y = await l(e.name);
                let {
                  message: _
                } = gar(y, e.name);
                o?.(_);
              } catch (y) {
                o?.(hZt(y, e.name));
              } finally {
                d(false);
              }
            } else if (g === "toggle-enabled") {
              await p();
            } else if (g === "back") {
              r();
            }
          },
          onCancel: r
        })
      })]
    });
  }
  var _ar;
  var Rd;
  var bar = __lazy(() => {
    et();
    Iw();
    Hfe();
    G1();
    ho();
    dt();
    Zn();
    Sd();
    OS();
    Ai();
    Ii();
    bs();
    Vf();
    oYe();
    cA();
    U3o();
    _ar = __toESM(ot(), 1);
    Rd = __toESM(ie(), 1);
  });
  function yZt(e) {
    let t = R6l.c(45);
    let {
      tool: n,
      server: r,
      onBack: o
    } = e;
    let [s, i] = Sar.useState("");
    let a;
    let l;
    if (t[0] !== r.name || t[1] !== n) {
      l = vyn(n.name, r.name);
      let H = n.userFacingName ? n.userFacingName({}) : l;
      a = wyn(H);
      t[0] = r.name;
      t[1] = n;
      t[2] = a;
      t[3] = l;
    } else {
      a = t[2];
      l = t[3];
    }
    let c = a;
    let u;
    if (t[4] !== n) {
      u = n.isReadOnly?.({}) ?? false;
      t[4] = n;
      t[5] = u;
    } else {
      u = t[5];
    }
    let d = u;
    let p;
    if (t[6] !== n) {
      p = n.isDestructive?.({}) ?? false;
      t[6] = n;
      t[7] = p;
    } else {
      p = t[7];
    }
    let m = p;
    let f;
    if (t[8] !== n) {
      f = n.isOpenWorld?.({}) ?? false;
      t[8] = n;
      t[9] = f;
    } else {
      f = t[9];
    }
    let h = f;
    let g;
    let y;
    if (t[10] !== n) {
      g = () => {
        (async function () {
          try {
            let N = await n.description({}, {
              isNonInteractiveSession: false,
              toolPermissionContext: {
                mode: "default",
                additionalWorkingDirectories: new Map(),
                alwaysAllowRules: {},
                alwaysDenyRules: {},
                alwaysAskRules: {},
                isBypassPermissionsModeAvailable: false,
                mcpPermissionModeOverrides: {}
              },
              tools: []
            });
            i(N);
          } catch {
            i("Failed to load description");
          }
        })();
      };
      y = [n];
      t[10] = n;
      t[11] = g;
      t[12] = y;
    } else {
      g = t[11];
      y = t[12];
    }
    Sar.useEffect(g, y);
    let _;
    if (t[13] !== d) {
      _ = d && Mv.jsx(Text, {
        color: "success",
        children: " [read-only]"
      });
      t[13] = d;
      t[14] = _;
    } else {
      _ = t[14];
    }
    let b;
    if (t[15] !== m) {
      b = m && Mv.jsx(Text, {
        color: "error",
        children: " [destructive]"
      });
      t[15] = m;
      t[16] = b;
    } else {
      b = t[16];
    }
    let S;
    if (t[17] !== h) {
      S = h && Mv.jsx(Text, {
        dimColor: true,
        children: " [open-world]"
      });
      t[17] = h;
      t[18] = S;
    } else {
      S = t[18];
    }
    let E;
    if (t[19] !== c || t[20] !== _ || t[21] !== b || t[22] !== S) {
      E = Mv.jsxs(Mv.Fragment, {
        children: [c, _, b, S]
      });
      t[19] = c;
      t[20] = _;
      t[21] = b;
      t[22] = S;
      t[23] = E;
    } else {
      E = t[23];
    }
    let C = E;
    let x;
    if (t[24] === Symbol.for("react.memo_cache_sentinel")) {
      x = Mv.jsx(Wr, {
        action: "confirm:no",
        context: "Confirmation",
        fallback: "Esc",
        description: "go back"
      });
      t[24] = x;
    } else {
      x = t[24];
    }
    let A;
    if (t[25] === Symbol.for("react.memo_cache_sentinel")) {
      A = Mv.jsx(Text, {
        bold: true,
        children: "Tool name: "
      });
      t[25] = A;
    } else {
      A = t[25];
    }
    let k;
    if (t[26] !== l) {
      k = Mv.jsxs(gXd, {
        children: [A, Mv.jsx(Text, {
          dimColor: true,
          children: l
        })]
      });
      t[26] = l;
      t[27] = k;
    } else {
      k = t[27];
    }
    let I;
    if (t[28] === Symbol.for("react.memo_cache_sentinel")) {
      I = Mv.jsx(Text, {
        bold: true,
        children: "Full name: "
      });
      t[28] = I;
    } else {
      I = t[28];
    }
    let O;
    if (t[29] !== n.name) {
      O = Mv.jsxs(gXd, {
        children: [I, Mv.jsx(Text, {
          dimColor: true,
          children: n.name
        })]
      });
      t[29] = n.name;
      t[30] = O;
    } else {
      O = t[30];
    }
    let M;
    if (t[31] !== s) {
      M = s && Mv.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [Mv.jsx(Text, {
          bold: true,
          children: "Description:"
        }), Mv.jsx(Text, {
          wrap: "wrap",
          children: Wge(s, 1000)
        })]
      });
      t[31] = s;
      t[32] = M;
    } else {
      M = t[32];
    }
    let L;
    if (t[33] !== n.inputJSONSchema) {
      L = n.inputJSONSchema && n.inputJSONSchema.properties && Object.keys(n.inputJSONSchema.properties).length > 0 && Mv.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [Mv.jsx(Text, {
          bold: true,
          children: "Parameters:"
        }), Mv.jsx(gXd, {
          marginLeft: 2,
          flexDirection: "column",
          children: Object.entries(n.inputJSONSchema.properties).map(H => {
            let [U, N] = H;
            let j = n.inputJSONSchema?.required?.includes(U);
            return Mv.jsxs(Pw, {
              children: [U, Mv.jsx(lie, {
                when: j ?? false,
                children: "required"
              }), ":", " ", Mv.jsx(Text, {
                dimColor: true,
                children: typeof N === "object" && N && "type" in N ? String(N.type) : "unknown"
              }), typeof N === "object" && N && "description" in N && Mv.jsxs(Text, {
                dimColor: true,
                children: [" - ", Wge(String(N.description), 200)]
              })]
            }, U);
          })
        })]
      });
      t[33] = n.inputJSONSchema;
      t[34] = L;
    } else {
      L = t[34];
    }
    let P;
    if (t[35] !== k || t[36] !== O || t[37] !== M || t[38] !== L) {
      P = Mv.jsxs(gXd, {
        flexDirection: "column",
        children: [k, O, M, L]
      });
      t[35] = k;
      t[36] = O;
      t[37] = M;
      t[38] = L;
      t[39] = P;
    } else {
      P = t[39];
    }
    let F;
    if (t[40] !== o || t[41] !== r.name || t[42] !== P || t[43] !== C) {
      F = Mv.jsx(or, {
        title: C,
        subtitle: r.name,
        onCancel: o,
        inputGuide: x,
        children: P
      });
      t[40] = o;
      t[41] = r.name;
      t[42] = P;
      t[43] = C;
      t[44] = F;
    } else {
      F = t[44];
    }
    return F;
  }
  var R6l;
  var Sar;
  var Mv;
  var Tar = __lazy(() => {
    et();
    EI();
    Zn();
    Sd();
    Uvt();
    Loe();
    Ii();
    R6l = __toESM(pt(), 1);
    Sar = __toESM(ot(), 1);
    Mv = __toESM(ie(), 1);
  });
  function _Zt(e) {
    let t = x6l.c(24);
    let {
      server: n,
      onSelectTool: r,
      onBack: o
    } = e;
    let s = bt(j5m);
    let i;
    e: {
      if (n.client.type !== "connected") {
        let b;
        if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
          b = [];
          t[0] = b;
        } else {
          b = t[0];
        }
        i = b;
        break e;
      }
      let _;
      if (t[1] !== s || t[2] !== n.name) {
        _ = hpe(s, n.name).sort(H5m);
        t[1] = s;
        t[2] = n.name;
        t[3] = _;
      } else {
        _ = t[3];
      }
      i = _;
    }
    let a = i;
    let l = Bn(a, $5m);
    let c;
    if (t[4] !== n.name || t[5] !== a) {
      let _;
      if (t[7] !== n.name) {
        _ = (b, S) => {
          let E = vyn(b.name, n.name);
          let C = b.userFacingName ? b.userFacingName({}) : E;
          let x = wyn(C);
          let A = b.isReadOnly?.({}) ?? false;
          let k = b.isDestructive?.({}) ?? false;
          let I = b.isOpenWorld?.({}) ?? false;
          let O = b.mcpInfo?.effectiveMaxPermission;
          if (O === "blocked") {
            return {
              label: x,
              value: S.toString(),
              disabled: true,
              description: "disabled by your organization",
              descriptionColor: "warning"
            };
          }
          let M = [];
          if (A) {
            M.push("read-only");
          }
          if (k) {
            M.push("destructive");
          }
          if (I) {
            M.push("open-world");
          }
          if (O === "ask") {
            M.push("ask-only");
          }
          return {
            label: x,
            value: S.toString(),
            description: M.length > 0 ? M.join(", ") : undefined
          };
        };
        t[7] = n.name;
        t[8] = _;
      } else {
        _ = t[8];
      }
      c = a.map(_);
      t[4] = n.name;
      t[5] = a;
      t[6] = c;
    } else {
      c = t[6];
    }
    let u = c;
    let d = a.length - l;
    let p;
    if (t[9] !== l || t[10] !== d || t[11] !== a.length) {
      p = l > 0 ? `${d} ${un(d, "tool")} \xB7 ${l} disabled by your organization` : `${a.length} ${un(a.length, "tool")}`;
      t[9] = l;
      t[10] = d;
      t[11] = a.length;
      t[12] = p;
    } else {
      p = t[12];
    }
    let m = p;
    let f = `Tools for ${n.name}`;
    let h;
    if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
      h = Vwe.jsxs(Hn, {
        children: [Vwe.jsx(xt, {
          chord: ["up", "down"],
          action: "navigate"
        }), Vwe.jsx(xt, {
          chord: "enter",
          action: "select"
        }), Vwe.jsx(Wr, {
          action: "confirm:no",
          context: "Confirmation",
          fallback: "Esc",
          description: "back"
        })]
      });
      t[13] = h;
    } else {
      h = t[13];
    }
    let g;
    if (t[14] !== o || t[15] !== r || t[16] !== a || t[17] !== u) {
      g = a.length === 0 ? Vwe.jsx(sc, {
        children: "No tools available"
      }) : Vwe.jsx(xr, {
        options: u,
        onChange: _ => {
          let b = a[parseInt(_)];
          if (b) {
            r(b);
          }
        },
        onCancel: o
      });
      t[14] = o;
      t[15] = r;
      t[16] = a;
      t[17] = u;
      t[18] = g;
    } else {
      g = t[18];
    }
    let y;
    if (t[19] !== o || t[20] !== m || t[21] !== f || t[22] !== g) {
      y = Vwe.jsx(or, {
        title: f,
        subtitle: m,
        onCancel: o,
        inputGuide: h,
        children: g
      });
      t[19] = o;
      t[20] = m;
      t[21] = f;
      t[22] = g;
      t[23] = y;
    } else {
      y = t[23];
    }
    return y;
  }
  function $5m(e) {
    return e.mcpInfo?.effectiveMaxPermission === "blocked";
  }
  function H5m(e, t) {
    let n = e.mcpInfo?.effectiveMaxPermission === "blocked" ? 1 : 0;
    let r = t.mcpInfo?.effectiveMaxPermission === "blocked" ? 1 : 0;
    return n - r;
  }
  function j5m(e) {
    return e.mcp.tools;
  }
  var x6l;
  var Vwe;
  var Ear = __lazy(() => {
    EI();
    G1();
    ho();
    Zn();
    Sd();
    OS();
    Ai();
    Ii();
    xb();
    bs();
    x6l = __toESM(pt(), 1);
    Vwe = __toESM(ie(), 1);
  });
  function war(e) {
    let t = k6l.c(76);
    let {
      onComplete: n
    } = e;
    let r = bt(z5m);
    let o = bt(V5m);
    let s = r.clients;
    let i;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      i = {
        type: "list"
      };
      t[0] = i;
    } else {
      i = t[0];
    }
    let [a, l] = vYe.useState(i);
    let c;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      c = [];
      t[1] = c;
    } else {
      c = t[1];
    }
    let [u, d] = vYe.useState(c);
    let [p, m] = vYe.useState(false);
    let f;
    if (t[2] !== o.allAgents) {
      f = AHa(o.allAgents);
      t[2] = o.allAgents;
      t[3] = f;
    } else {
      f = t[3];
    }
    let h = f;
    let g;
    if (t[4] !== s) {
      g = s.filter(G5m).sort(W5m);
      t[4] = s;
      t[5] = g;
    } else {
      g = t[5];
    }
    let y = g;
    let _;
    if (t[6] !== y || t[7] !== r.tools) {
      _ = {};
      for (let k of y) {
        _[k.name] = hpe(r.tools, k.name).length;
      }
      t[6] = y;
      t[7] = r.tools;
      t[8] = _;
    } else {
      _ = t[8];
    }
    let b = _;
    let S;
    let E;
    if (t[9] !== y || t[10] !== r.tools) {
      S = () => {
        let k = false;
        (async function () {
          let M = await Promise.all(y.map(async L => {
            let P = L.config.scope;
            let F = L.config.type === "sse";
            let H = L.config.type === "http";
            let U = L.config.type === "claudeai-proxy";
            let N = undefined;
            if (F || H) {
              let z = await new O6e(L.name, L.config).tokens();
              let V = cT() !== null && L.type === "connected";
              let K = L.type === "connected" && hpe(r.tools, L.name).length > 0;
              N = Boolean(z) || V || K;
            }
            let W = {
              name: L.name,
              client: L,
              scope: P
            };
            if (U) {
              return {
                ...W,
                transport: "claudeai-proxy",
                isAuthenticated: false,
                config: L.config
              };
            } else if (F) {
              return {
                ...W,
                transport: "sse",
                isAuthenticated: N,
                config: L.config
              };
            } else if (H) {
              return {
                ...W,
                transport: "http",
                isAuthenticated: N,
                config: L.config
              };
            } else {
              return {
                ...W,
                transport: "stdio",
                config: L.config
              };
            }
          }));
          if (k) {
            return;
          }
          d(M);
        })();
        return () => {
          k = true;
        };
      };
      E = [y, r.tools];
      t[9] = y;
      t[10] = r.tools;
      t[11] = S;
      t[12] = E;
    } else {
      S = t[11];
      E = t[12];
    }
    vYe.useEffect(S, E);
    let C;
    if (t[13] !== h.length || t[14] !== y.length || t[15] !== r.suppressedClaudeAiConnectors?.length || t[16] !== n || t[17] !== u.length) {
      C = () => {
        if (u.length === 0 && y.length > 0) {
          return;
        }
        if (u.length === 0 && h.length === 0 && (r.suppressedClaudeAiConnectors?.length ?? 0) === 0) {
          n("No MCP servers configured. Please run /doctor if this is unexpected. Otherwise, run `claude mcp --help` or visit https://code.claude.com/docs/en/mcp to learn more.");
        }
      };
      t[13] = h.length;
      t[14] = y.length;
      t[15] = r.suppressedClaudeAiConnectors?.length;
      t[16] = n;
      t[17] = u.length;
      t[18] = C;
    } else {
      C = t[18];
    }
    let x = r.suppressedClaudeAiConnectors?.length;
    let A;
    if (t[19] !== h.length || t[20] !== y.length || t[21] !== n || t[22] !== u.length || t[23] !== x) {
      A = [u.length, y.length, h.length, x, n];
      t[19] = h.length;
      t[20] = y.length;
      t[21] = n;
      t[22] = u.length;
      t[23] = x;
      t[24] = A;
    } else {
      A = t[24];
    }
    switch (vYe.useEffect(C, A), a.type) {
      case "list":
        {
          let k;
          let I;
          if (t[25] === Symbol.for("react.memo_cache_sentinel")) {
            k = L => l({
              type: "server-menu",
              server: L
            });
            I = L => l({
              type: "agent-server-menu",
              agentServer: L
            });
            t[25] = k;
            t[26] = I;
          } else {
            k = t[25];
            I = t[26];
          }
          let O;
          if (t[27] === Symbol.for("react.memo_cache_sentinel")) {
            O = () => m(q5m);
            t[27] = O;
          } else {
            O = t[27];
          }
          let M;
          if (t[28] !== h || t[29] !== r.suppressedClaudeAiConnectors || t[30] !== n || t[31] !== u || t[32] !== p || t[33] !== b || t[34] !== a.defaultTab) {
            M = EYe.jsx(M3o, {
              servers: u,
              suppressedClaudeAiConnectors: r.suppressedClaudeAiConnectors,
              toolCountsByServer: b,
              agentServers: h,
              onSelectServer: k,
              onSelectAgentServer: I,
              onComplete: n,
              defaultTab: a.defaultTab,
              showUnusedConnectors: p,
              onToggleUnusedConnectors: O
            });
            t[28] = h;
            t[29] = r.suppressedClaudeAiConnectors;
            t[30] = n;
            t[31] = u;
            t[32] = p;
            t[33] = b;
            t[34] = a.defaultTab;
            t[35] = M;
          } else {
            M = t[35];
          }
          return M;
        }
      case "server-menu":
        {
          let k;
          if (t[36] !== r.tools || t[37] !== a.server.name) {
            k = hpe(r.tools, a.server.name);
            t[36] = r.tools;
            t[37] = a.server.name;
            t[38] = k;
          } else {
            k = t[38];
          }
          let I = k;
          let O = a.server.transport === "claudeai-proxy" ? "claude.ai" : "Claude Code";
          if (a.server.transport === "stdio") {
            let M;
            if (t[39] !== a.server) {
              M = () => l({
                type: "server-tools",
                server: a.server
              });
              t[39] = a.server;
              t[40] = M;
            } else {
              M = t[40];
            }
            let L;
            if (t[41] !== O) {
              L = () => l({
                type: "list",
                defaultTab: O
              });
              t[41] = O;
              t[42] = L;
            } else {
              L = t[42];
            }
            let P;
            if (t[43] !== n || t[44] !== I.length || t[45] !== M || t[46] !== L || t[47] !== a.server) {
              P = EYe.jsx(gZt, {
                server: a.server,
                serverToolsCount: I.length,
                onViewTools: M,
                onCancel: L,
                onComplete: n
              });
              t[43] = n;
              t[44] = I.length;
              t[45] = M;
              t[46] = L;
              t[47] = a.server;
              t[48] = P;
            } else {
              P = t[48];
            }
            return P;
          } else {
            let M;
            if (t[49] !== a.server) {
              M = () => l({
                type: "server-tools",
                server: a.server
              });
              t[49] = a.server;
              t[50] = M;
            } else {
              M = t[50];
            }
            let L;
            if (t[51] !== O) {
              L = () => l({
                type: "list",
                defaultTab: O
              });
              t[51] = O;
              t[52] = L;
            } else {
              L = t[52];
            }
            let P;
            if (t[53] !== n || t[54] !== I.length || t[55] !== M || t[56] !== L || t[57] !== a.server) {
              P = EYe.jsx(TYe, {
                server: a.server,
                serverToolsCount: I.length,
                onViewTools: M,
                onCancel: L,
                onComplete: n
              });
              t[53] = n;
              t[54] = I.length;
              t[55] = M;
              t[56] = L;
              t[57] = a.server;
              t[58] = P;
            } else {
              P = t[58];
            }
            return P;
          }
        }
      case "server-tools":
        {
          let k;
          let I;
          if (t[59] !== a.server) {
            k = M => l({
              type: "server-tool-detail",
              server: a.server,
              tool: M
            });
            I = () => l({
              type: "server-menu",
              server: a.server
            });
            t[59] = a.server;
            t[60] = k;
            t[61] = I;
          } else {
            k = t[60];
            I = t[61];
          }
          let O;
          if (t[62] !== k || t[63] !== I || t[64] !== a.server) {
            O = EYe.jsx(_Zt, {
              server: a.server,
              onSelectTool: k,
              onBack: I
            });
            t[62] = k;
            t[63] = I;
            t[64] = a.server;
            t[65] = O;
          } else {
            O = t[65];
          }
          return O;
        }
      case "server-tool-detail":
        {
          let k;
          if (t[66] !== a.server) {
            k = () => l({
              type: "server-tools",
              server: a.server
            });
            t[66] = a.server;
            t[67] = k;
          } else {
            k = t[67];
          }
          let I;
          if (t[68] !== k || t[69] !== a.server || t[70] !== a.tool) {
            I = EYe.jsx(yZt, {
              tool: a.tool,
              server: a.server,
              onBack: k
            });
            t[68] = k;
            t[69] = a.server;
            t[70] = a.tool;
            t[71] = I;
          } else {
            I = t[71];
          }
          return I;
        }
      case "agent-server-menu":
        {
          let k;
          if (t[72] === Symbol.for("react.memo_cache_sentinel")) {
            k = () => l({
              type: "list",
              defaultTab: "Agents"
            });
            t[72] = k;
          } else {
            k = t[72];
          }
          let I;
          if (t[73] !== n || t[74] !== a.agentServer) {
            I = EYe.jsx(O3o, {
              agentServer: a.agentServer,
              onCancel: k,
              onComplete: n
            });
            t[73] = n;
            t[74] = a.agentServer;
            t[75] = I;
          } else {
            I = t[75];
          }
          return I;
        }
    }
  }
  function q5m(e) {
    return !e;
  }
  function W5m(e, t) {
    return e.name.localeCompare(t.name);
  }
  function G5m(e) {
    return e.name !== "ide";
  }
  function V5m(e) {
    return e.agentDefinitions;
  }
  function z5m(e) {
    return e.mcp;
  }
  var k6l;
  var vYe;
  var EYe;
  var A6l = __lazy(() => {
    Moe();
    G1();
    ho();
    e1();
    D3o();
    N3o();
    yar();
    bar();
    Tar();
    Ear();
    k6l = __toESM(pt(), 1);
    vYe = __toESM(ot(), 1);
    EYe = __toESM(ie(), 1);
  });
  var I6l = __lazy(() => {
    D3o();
    N3o();
    F3o();
    yar();
    A6l();
    bar();
    Tar();
    Ear();
  });
  function* O6l(e) {
    for (let t of e) {
      if (t.type === "assistant" && Array.isArray(t.message.content)) {
        for (let n of t.message.content) {
          if (n.type === "tool_use" && Nq.includes(n.name)) {
            let {
              input: r
            } = n;
            if (typeof r === "object" && r !== null && "command" in r && typeof r.command === "string") {
              yield r.command;
            }
          }
        }
      }
    }
  }
  function bZt(e) {
    let t = new Set();
    for (let n of O6l(e)) {
      let r = J5m(n);
      if (r) {
        t.add(r);
      }
    }
    return t;
  }
  function K5m(e) {
    if (!e) {
      return [];
    }
    let t = [];
    let n;
    P6l.lastIndex = 0;
    while ((n = P6l.exec(e)) !== null) {
      let r = n[1].toLowerCase();
      let o = r.lastIndexOf("@");
      if (o !== -1) {
        r = r.slice(o + 1);
      }
      let s = r.indexOf(":");
      if (s !== -1) {
        r = r.slice(0, s);
      }
      if (r) {
        t.push(r);
      }
    }
    return t;
  }
  function SZt(e) {
    let t = new Set();
    for (let n of O6l(e)) {
      for (let r of K5m(n)) {
        t.add(r);
      }
    }
    return t;
  }
  function J5m(e) {
    if (!e) {
      return;
    }
    let t = e.trim().split(/\s+/);
    for (let n of t) {
      if (/^[A-Za-z_]\w*=/.test(n)) {
        continue;
      }
      if (Y5m.vZc(n)) {
        continue;
      }
      return n;
    }
    return;
  }
  var P6l;
  var Y5m;
  var B3o = __lazy(() => {
    Jf();
    P6l = /https?:\/\/([^\s/?#'"`<>\\)\];&|(,]+)/gi;
    Y5m = new Set(["sudo"]);
  });
  function D6l(e, t) {
    return {
      readFileState: t,
      bashTools: bZt(e),
      bashHosts: SZt(e)
    };
  }
  function Rar(e, t) {
    let n = t;
    if (!n?.signals || !n.signals.cli?.length && !n.signals.filesRead?.length && !n.signals.manifestDeps?.length && !n.signals.hosts?.length && !n.signals.cwd?.length) {
      return null;
    }
    let r;
    try {
      if (n.signals.manifestDeps?.length) {
        r = n.signals.manifestDeps.map(s => ({
          file: new RegExp(s.file, "i"),
          pattern: new RegExp(s.pattern)
        }));
      }
    } catch (s) {
      logForDebugging(`Skipping relevance signals for "${e}": invalid RegExp in relevance.signals: ${s}`, {
        level: "warn"
      });
      return null;
    }
    let o = n.signals.hosts?.map(s => s.toLowerCase());
    return {
      cli: n.signals.cli,
      hosts: o,
      filesRead: n.signals.filesRead,
      manifestDep: r,
      cwd: n.signals.cwd
    };
  }
  async function xar(e, t) {
    let {
      bashTools: n,
      bashHosts: r
    } = t ?? {};
    if (e.cli && n?.size) {
      let i = e.cli.find(a => n.vZc(a));
      if (i) {
        return {
          signal: "cli",
          command: i
        };
      }
    }
    if (e.hosts?.length && r?.size) {
      let i = e.hosts.find(a => r.vZc(a));
      if (i) {
        return {
          signal: "hosts",
          host: i
        };
      }
    }
    if (e.cwd?.length) {
      let i = Nt().replaceAll("\\", "/");
      let a = findGitRoot(Nt())?.replaceAll("\\", "/");
      let l = [i];
      if (a && i.startsWith(`${a}/`)) {
        l.push(i.slice(a.length + 1));
      }
      for (let c of e.cwd) {
        let u = c.replace(/\/+$/, "").replace(/\/\*\*$/, "");
        if (!u) {
          continue;
        }
        if (l.some(d => $3o.default.isMatch(d, [u, `${u}/**`], {
          nocase: true,
          dot: true
        }))) {
          return {
            signal: "cwd"
          };
        }
      }
    }
    let o = t?.readFileState;
    let s = o ? aDe(o) : [];
    if (e.filesRead?.length && s.length) {
      let i = s.find(a => $3o.default.isMatch(a.replaceAll("\\", "/"), e.filesRead, {
        nocase: true,
        dot: true
      }));
      if (i) {
        return {
          signal: "filesRead",
          file: i
        };
      }
    }
    if (e.manifestDep && o && s.length > 0) {
      let i = new Map(o.entries());
      let a = (async () => {
        for (let {
          file: c,
          pattern: u
        } of e.manifestDep) {
          for (let d of s) {
            if (!c.test(d)) {
              continue;
            }
            try {
              let p = i.get(d);
              let m = p && p.limit === undefined && (p.offset ?? 1) <= 1 && !p.isPartialView ? p.content : undefined;
              if (!m) {
                if ((await Car.stat(d)).size > 524288) {
                  continue;
                }
                m = await Car.readFile(d, "utf8");
              }
              if (u.test(m)) {
                return d;
              }
            } catch {}
          }
        }
        return null;
      })();
      let l = await withTimeout(a, 50, "manifestDep scan").catch(() => null);
      if (l) {
        return {
          signal: "manifestDep",
          file: l
        };
      }
    }
    return null;
  }
  var Car;
  var $3o;
  var twt = __lazy(() => {
    B3o();
    vo();
    je();
    qI();
    na();
    Car = require("fs/promises");
    $3o = __toESM(Muo(), 1);
  });
  function gA(e) {
    let t = M6l.c(9);
    let {
      status: n,
      children: r
    } = e;
    let {
      color: o
    } = Aoo[n];
    let s;
    if (t[0] !== n) {
      s = wYe.jsx(gXd, {
        width: 2,
        flexShrink: 0,
        children: wYe.jsx(Ps, {
          status: n
        })
      });
      t[0] = n;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i = !o;
    let a;
    if (t[2] !== r || t[3] !== o || t[4] !== i) {
      a = wYe.jsx(gXd, {
        flexGrow: 1,
        flexShrink: 1,
        children: wYe.jsx(Text, {
          color: o,
          dimColor: i,
          children: r
        })
      });
      t[2] = r;
      t[3] = o;
      t[4] = i;
      t[5] = a;
    } else {
      a = t[5];
    }
    let l;
    if (t[6] !== s || t[7] !== a) {
      l = wYe.jsxs(gXd, {
        flexDirection: "row",
        children: [s, a]
      });
      t[6] = s;
      t[7] = a;
      t[8] = l;
    } else {
      l = t[8];
    }
    return l;
  }
  var M6l;
  var wYe;
  var nwt = __lazy(() => {
    et();
    Vf();
    M6l = __toESM(pt(), 1);
    wYe = __toESM(ie(), 1);
  });
  var F6l = {};
  __export(F6l, {
    settingSourceToScope: () => settingSourceToScope,
    isPersistableScope: () => isPersistableScope,
    installSelectedPlugins: () => installSelectedPlugins,
    getPluginEditableScopes: () => getPluginEditableScopes,
    getInstalledPlugins: () => getInstalledPlugins,
    findMissingPlugins: () => findMissingPlugins,
    checkEnabledPlugins: () => checkEnabledPlugins
  });
  async function checkEnabledPlugins() {
    let e = getInitialSettings();
    let t = [];
    let n = AGe();
    for (let [r, o] of Object.entries(n)) {
      if (r.includes("@") && o) {
        t.push(r);
      }
    }
    if (e.enabledPlugins) {
      for (let [r, o] of Object.entries(e.enabledPlugins)) {
        if (!r.includes("@")) {
          continue;
        }
        let s = t.indexOf(r);
        if (o) {
          if (s === -1) {
            t.push(r);
          }
        } else if (s !== -1) {
          t.splice(s, 1);
        }
      }
    }
    return t;
  }
  function getPluginEditableScopes() {
    let e = new Map();
    let t = AGe();
    for (let [r, o] of Object.entries(t)) {
      if (!r.includes("@")) {
        continue;
      }
      if (o === true) {
        e.set(r, "flag");
      } else if (o === false) {
        e.delete(r);
      }
    }
    let n = [{
      scope: "managed",
      source: "policySettings"
    }, {
      scope: "user",
      source: "userSettings"
    }, {
      scope: "project",
      source: "projectSettings"
    }, {
      scope: "local",
      source: "localSettings"
    }, {
      scope: "flag",
      source: "flagSettings"
    }];
    for (let {
      scope: r,
      source: o
    } of n) {
      let s = getSettingsForSource(o);
      if (!s?.enabledPlugins) {
        continue;
      }
      for (let [i, a] of Object.entries(s.enabledPlugins)) {
        if (!i.includes("@")) {
          continue;
        }
        if (i in t && t[i] !== a) {
          logForDebugging(`Plugin ${i} from --add-dir (${t[i]}) overridden by ${o} (${a})`);
        }
        if (a === true) {
          e.set(i, r);
        } else if (a === false) {
          e.delete(i);
        }
      }
    }
    logForDebugging(`Found ${e.size} enabled plugins with scopes: ${Array.from(e.entries()).map(([r, o]) => `${r}(${o})`).join(", ")}`);
    return e;
  }
  function isPersistableScope(e) {
    return e !== "flag";
  }
  function settingSourceToScope(e) {
    return cso[e];
  }
  async function getInstalledPlugins() {
    R$o().catch(n => {
      if (Zd(n) || n instanceof SyntaxError) {
        logForDebugging(`Plugin sync skipped (fs/parse error): ${he(n)}`, {
          level: "error"
        });
      } else {
        Oe($o(sr(n), "migrateFromEnabledPlugins sync failed"));
      }
    });
    let e = jXt();
    let t = Object.keys(e.plugins);
    logForDebugging(`Found ${t.length} installed plugins`);
    return t;
  }
  async function findMissingPlugins(e) {
    try {
      let t = await getInstalledPlugins();
      let n = e.filter(s => !t.includes(s));
      return (await Promise.all(n.map(async s => {
        try {
          let i = await xO(s);
          return {
            pluginId: s,
            found: i !== null && i !== undefined
          };
        } catch (i) {
          logForDebugging(`Failed to check plugin ${s} in marketplace: ${i}`);
          return {
            pluginId: s,
            found: false
          };
        }
      }))).filter(({
        found: s
      }) => s).map(({
        pluginId: s
      }) => s);
    } catch (t) {
      Oe(t);
      return [];
    }
  }
  async function installSelectedPlugins(e, t, n = "user") {
    let r = n !== "user" ? Nt() : undefined;
    let o = uM(n);
    let s = getSettingsForSource(o);
    let i = {
      ...s?.enabledPlugins
    };
    let a = [];
    let l = [];
    for (let c = 0; c < e.length; c++) {
      let u = e[c];
      if (!u) {
        continue;
      }
      if (t) {
        t(u, c + 1, e.length);
      }
      try {
        let d = await xO(u);
        if (!d) {
          l.push({
            name: u,
            error: "Plugin not found in any marketplace"
          });
          continue;
        }
        let {
          entry: p,
          marketplaceInstallLocation: m
        } = d;
        if (!Rje(p.source)) {
          await VXt(u, p, n, r);
        } else {
          n2l({
            pluginId: u,
            installPath: N6l.join(m, p.source),
            version: p.version
          }, n, r);
        }
        i[u] = true;
        a.push(u);
      } catch (d) {
        let p = d instanceof Error ? d.message : String(d);
        l.push({
          name: u,
          error: p
        });
        logForDebugging(`Failed to install plugin ${u}: ${p}`, {
          level: "error"
        });
      }
    }
    updateSettingsForSource(o, {
      ...s,
      enabledPlugins: i
    });
    return {
      installed: a,
      failed: l
    };
  }
  var N6l;
  var CYe = __lazy(() => {
    vo();
    je();
    dt();
    Rn();
    IFn();
    Qk();
    yT();
    Kf();
    rie();
    TC();
    N6l = require("path");
  });
  async function zwe(e) {
    let t = new Map();
    for (let a of e) {
      if (a.type !== "dependency-unsatisfied" || a.reason !== "not-found") {
        continue;
      }
      let l = t.get(a.dependency);
      if (!l) {
        l = new Set();
        t.set(a.dependency, l);
      }
      l.add(a.source);
    }
    if (t.size === 0) {
      return {
        installed: [],
        stillUnresolved: [],
        marketplaceMissing: []
      };
    }
    let n = await qM();
    let r = t6m.map(a => [a, PGe(uM(a))]);
    let o = [];
    let s = [];
    let i = [];
    for (let [a, l] of t) {
      let c = Yo(a).marketplace;
      if (!c || !n[c]) {
        s.push(a);
        i.push(a);
        continue;
      }
      if (!isSourceAllowedByPolicy(n[c].source)) {
        logForDebugging(`resolveMissingDependencies: skipping "${a}" \u2014 marketplace "${c}" is blocked by enterprise policy`);
        s.push(a);
        continue;
      }
      let u = false;
      for (let d of l) {
        let p = Yo(d).marketplace;
        if (p === c) {
          u = true;
          break;
        }
        if (!p) {
          continue;
        }
        if ((await h5(p))?.allowCrossMarketplaceDependenciesOn?.includes(c)) {
          u = true;
          break;
        }
      }
      if (!u) {
        logForDebugging(`resolveMissingDependencies: skipping "${a}" \u2014 cross-marketplace dependency not in any declaring marketplace's allowlist`);
        s.push(a);
        continue;
      }
      try {
        let d = await xO(a);
        if (!d) {
          s.push(a);
          continue;
        }
        let p = n6m(l, r);
        let m = await zXt({
          pluginId: a,
          entry: d.entry,
          scope: p ?? "user",
          marketplaceInstallLocation: d.marketplaceInstallLocation,
          trigger: "dependency-resolution",
          auto: p !== undefined,
          requiredByEnabledDependent: true
        });
        if (m.ok) {
          for (let f of m.closure) {
            if (!o.includes(f)) {
              o.push(f);
            }
          }
        } else {
          logForDebugging(`resolveMissingDependencies: install of "${a}" did not complete (${m.reason})`, {
            level: "warn"
          });
          s.push(a);
        }
      } catch (d) {
        logForDebugging(`resolveMissingDependencies: install of "${a}" threw: ${he(d)}`, {
          level: "warn"
        });
        s.push(a);
      }
    }
    return {
      installed: o,
      stillUnresolved: s,
      marketplaceMissing: i
    };
  }
  async function j3o(e) {
    let {
      errors: t
    } = await loadAllPluginsCacheOnly();
    return t.filter(rso).filter(n => n.source === e);
  }
  async function rwt(e) {
    let t = await j3o(e);
    if (t.length === 0) {
      return null;
    }
    let {
      installed: n,
      marketplaceMissing: r
    } = await zwe(t);
    let o = new Set(n);
    let s = Ro(t.map(i => i.dependency)).filter(i => !o.vZc(i));
    return {
      suffix: `${$ue(n)}${Rta(s, r)}`,
      changed: n.length > 0
    };
  }
  function n6m(e, t) {
    for (let [n, r] of t) {
      for (let o of e) {
        if (r.vZc(o)) {
          return n;
        }
      }
    }
    return;
  }
  var t6m;
  var EUe = __lazy(() => {
    cV();
    je();
    dt();
    MSe();
    yT();
    Kf();
    rie();
    xg();
    Xk();
    t6m = ["user", "project", "local"];
  });
  async function kar(e) {
    let t = e.trim();
    let n = zt();
    let r = t.match(/^([a-zA-Z0-9._-]+@[^:]+:.+?(?:\.git)?)(#(.+))?$/);
    if (r?.[1]) {
      let i = r[1];
      let a = r[3];
      return a ? {
        source: "git",
        url: i,
        ref: a
      } : {
        source: "git",
        url: i
      };
    }
    if (t.startsWith("http://") || t.startsWith("https://")) {
      let i = t.match(/^([^#]+)(#(.+))?$/);
      let a = i?.[1] || t;
      let l = i?.[3];
      if (a.endsWith(".git") || a.includes("/_git/")) {
        return l ? {
          source: "git",
          url: a,
          ref: l
        } : {
          source: "git",
          url: a
        };
      }
      let c;
      try {
        c = new URL(a);
      } catch (u) {
        return {
          source: "url",
          url: a
        };
      }
      if (ef(c.hostname)) {
        if (c.pathname.match(/^\/([^/]+\/[^/]+?)(\/|\.git|$)/)?.[1]) {
          let d = a.endsWith(".git") ? a : `${a}.git`;
          return l ? {
            source: "git",
            url: d,
            ref: l
          } : {
            source: "git",
            url: d
          };
        }
      }
      return {
        source: "url",
        url: a
      };
    }
    let s = false;
    if (t.startsWith("./") || t.startsWith("../") || t.startsWith("/") || t.startsWith("~") || s) {
      let i = B6l.resolve(t.startsWith("~") ? t.replace(/^~/, U6l.homedir()) : t);
      let a;
      try {
        a = await n.stat(i);
      } catch (l) {
        let c = en(l);
        return {
          error: c === "ENOENT" ? `Path does not exist: ${i}` : `Cannot access path: ${i} (${c ?? l})`
        };
      }
      if (a.isFile()) {
        if (i.endsWith(".json")) {
          return {
            source: "file",
            path: i
          };
        } else {
          return {
            error: `File path must point to a .json file (marketplace.json), but got: ${i}`
          };
        }
      } else if (a.isDirectory()) {
        return {
          source: "directory",
          path: i
        };
      } else {
        return {
          error: `Path is neither a file nor a directory: ${i}`
        };
      }
    }
    if (t.includes("/") && !t.startsWith("@")) {
      if (t.includes(":")) {
        return null;
      }
      let i = t.match(/^([^#@]+)(?:[#@](.+))?$/);
      let a = i?.[1] || t;
      let l = i?.[2];
      if (!/^[A-Za-z0-9](?:[A-Za-z0-9-]*[A-Za-z0-9])?\/[A-Za-z0-9._-]+$/.test(a)) {
        return {
          error: `'${t}' is not a valid GitHub owner/repo shorthand. For a git repo, use the full https:// clone URL from your host (typically ending in .git \u2014 some hosts like Azure DevOps omit it). For a hosted marketplace.json, use its https:// URL. For a local path, use ./ or an absolute path.`
        };
      }
      return l ? {
        source: "github",
        repo: a,
        ref: l
      } : {
        source: "github",
        repo: a
      };
    }
    return null;
  }
  var U6l;
  var B6l;
  var q3o = __lazy(() => {
    dt();
    fk();
    U6l = require("os");
    B6l = require("path");
  });