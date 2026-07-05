  __export(e4c, {
    DevChannelsDialog: () => DevChannelsDialog
  });
  function DevChannelsDialog(e) {
    let t = Z3c.c(13);
    let {
      channels: n,
      onAccept: r
    } = e;
    let o;
    if (t[0] !== r) {
      o = function (f) {
        e: switch (f) {
          case "accept":
            {
              r();
              break e;
            }
          case "exit":
            gracefulShutdownSync(1);
        }
      };
      t[0] = r;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s = o;
    let i = X$f;
    let a;
    let l;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      a = l2e.jsx(Text, {
        children: "--dangerously-load-development-channels is for local channel development only. Do not use this option to run channels you have downloaded off the internet."
      });
      l = l2e.jsx(Text, {
        children: "Please use --channels to run a list of approved channels."
      });
      t[2] = a;
      t[3] = l;
    } else {
      a = t[2];
      l = t[3];
    }
    let c;
    if (t[4] !== n) {
      c = n.map(J$f).join(", ");
      t[4] = n;
      t[5] = c;
    } else {
      c = t[5];
    }
    let u;
    if (t[6] !== c) {
      u = l2e.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [a, l, l2e.jsxs(Text, {
          dimColor: true,
          children: ["Channels:", " ", c]
        })]
      });
      t[6] = c;
      t[7] = u;
    } else {
      u = t[7];
    }
    let d;
    if (t[8] !== s) {
      d = l2e.jsx(mc, {
        confirmLabel: "I am using this for local development",
        cancelLabel: "Exit",
        onConfirm: () => s("accept"),
        onCancel: () => s("exit")
      });
      t[8] = s;
      t[9] = d;
    } else {
      d = t[9];
    }
    let p;
    if (t[10] !== u || t[11] !== d) {
      p = l2e.jsxs(or, {
        title: "WARNING: Loading development channels",
        color: "error",
        onCancel: i,
        children: [u, d]
      });
      t[10] = u;
      t[11] = d;
      t[12] = p;
    } else {
      p = t[12];
    }
    return p;
  }
  function J$f(e) {
    return e.kind === "plugin" ? `plugin:${e.name}@${e.marketplace}` : `server:${e.name}`;
  }
  function X$f() {
    gracefulShutdownSync(0);
  }
  var Z3c;
  var l2e;
  var t4c = __lazy(() => {
    et();
    lm();
    b_();
    Ii();
    Z3c = __toESM(pt(), 1);
    l2e = __toESM(ie(), 1);
  });
  var r4c = {};
  __export(r4c, {
    ClaudeInChromeOnboarding: () => ClaudeInChromeOnboarding
  });
  function ClaudeInChromeOnboarding(e) {
    let t = n4c.c(21);
    let {
      onDone: n
    } = e;
    let [r, o] = W_r.useState(false);
    let s;
    let i;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      s = () => {
        logEvent("tengu_claude_in_chrome_onboarding_shown", {});
        isChromeExtensionInstalled().then(o).catch(Oe);
        saveGlobalConfig(tHf);
      };
      i = [];
      t[0] = s;
      t[1] = i;
    } else {
      s = t[0];
      i = t[1];
    }
    W_r.useEffect(s, i);
    let a;
    if (t[2] !== n) {
      a = g => {
        if (g.key === "return" && !g.ctrl && !g.meta) {
          g.preventDefault();
          n();
        }
      };
      t[2] = n;
      t[3] = a;
    } else {
      a = t[3];
    }
    let l;
    if (t[4] !== r) {
      l = !r && kL.jsxs(kL.Fragment, {
        children: [kL.jsx(Newline, {}), kL.jsx(Newline, {}), "Requires the Chrome extension. Get started at", " ", kL.jsx(Link, {
          url: "https://claude.ai/chrome"
        })]
      });
      t[4] = r;
      t[5] = l;
    } else {
      l = t[5];
    }
    let c;
    if (t[6] !== l) {
      c = kL.jsxs(Text, {
        children: ["Claude in Chrome works with the Chrome extension to let you control your browser directly from Claude Code. You can navigate websites, fill forms, capture screenshots, record GIFs, and debug with console logs and network requests.", l]
      });
      t[6] = l;
      t[7] = c;
    } else {
      c = t[7];
    }
    let u;
    if (t[8] !== r) {
      u = r && kL.jsxs(kL.Fragment, {
        children: [" ", "(", kL.jsx(Link, {
          url: "https://clau.de/chrome/permissions"
        }), ")"]
      });
      t[8] = r;
      t[9] = u;
    } else {
      u = t[9];
    }
    let d;
    if (t[10] !== u) {
      d = kL.jsxs(Text, {
        dimColor: true,
        children: ["Site-level permissions are inherited from the Chrome extension. Manage permissions in the Chrome extension settings to control which sites Claude can browse, click, and type on", u, "."]
      });
      t[10] = u;
      t[11] = d;
    } else {
      d = t[11];
    }
    let p;
    if (t[12] === Symbol.for("react.memo_cache_sentinel")) {
      p = kL.jsx(Text, {
        bold: true,
        color: "chromeYellow",
        children: "/chrome"
      });
      t[12] = p;
    } else {
      p = t[12];
    }
    let m;
    if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
      m = kL.jsxs(Text, {
        dimColor: true,
        children: ["For more info, use", " ", p, " ", "or visit ", kL.jsx(Link, {
          url: "https://code.claude.com/docs/en/chrome"
        })]
      });
      t[13] = m;
    } else {
      m = t[13];
    }
    let f;
    if (t[14] !== a || t[15] !== c || t[16] !== d) {
      f = kL.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: a,
        children: [c, d, m]
      });
      t[14] = a;
      t[15] = c;
      t[16] = d;
      t[17] = f;
    } else {
      f = t[17];
    }
    let h;
    if (t[18] !== n || t[19] !== f) {
      h = kL.jsx(or, {
        title: "Claude in Chrome",
        onCancel: n,
        color: "chromeYellow",
        children: f
      });
      t[18] = n;
      t[19] = f;
      t[20] = h;
    } else {
      h = t[20];
    }
    return h;
  }
  function tHf(e) {
    return {
      ...e,
      hasCompletedClaudeInChromeOnboarding: true
    };
  }
  var n4c;
  var W_r;
  var kL;
  var o4c = __lazy(() => {
    Ot();
    et();
    Gwe();
    Rn();
    Ii();
    n4c = __toESM(pt(), 1);
    W_r = __toESM(ot(), 1);
    kL = __toESM(ie(), 1);
  });
  var i4c = {};
  __export(i4c, {
    ChromeAutoEnableDialog: () => ChromeAutoEnableDialog
  });
  function ChromeAutoEnableDialog(e) {
    let t = s4c.c(16);
    let {
      onDone: n,
      isDontAskMode: r,
      isAutoMode: o
    } = e;
    let s = r === undefined ? false : r;
    let i = o === undefined ? false : o;
    let a;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      a = [];
      t[0] = a;
    } else {
      a = t[0];
    }
    G_r.useEffect(rHf, a);
    let l = G_r.useRef(false);
    let c;
    if (t[1] !== n) {
      c = function (S) {
        if (l.current) {
          return;
        }
        if (l.current = true, saveGlobalConfig(E => ({
          ...E,
          claudeInChromeDefaultEnabled: S,
          ...(S && {
            hasCompletedClaudeInChromeOnboarding: true
          })
        })), S) {
          Pe("chrome_auto_enable_prompt");
        } else {
          Et("chrome_auto_enable_prompt", "declined");
        }
        n(S);
      };
      t[1] = n;
      t[2] = c;
    } else {
      c = t[2];
    }
    let u = c;
    let d;
    if (t[3] !== u) {
      d = () => u(false);
      t[3] = u;
      t[4] = d;
    } else {
      d = t[4];
    }
    let p;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      p = Yie.jsxs(Hn, {
        children: [Yie.jsx(xt, {
          chord: "enter",
          action: "confirm"
        }), Yie.jsx(Wr, {
          action: "confirm:no",
          context: "Confirmation",
          fallback: "Esc",
          description: "keep browser tools off"
        })]
      });
      t[5] = p;
    } else {
      p = t[5];
    }
    let m;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      m = Yie.jsx(Text, {
        children: "Claude will use your Chrome browser by default \u2014 navigating sites, filling forms, and capturing screenshots in your existing session."
      });
      t[6] = m;
    } else {
      m = t[6];
    }
    let f = isInProductPermissionsEnabled() ? s ? "This session is in Don't Ask mode, so browser actions that need approval are skipped rather than prompted." : i ? "This session is in Auto mode, so an AI classifier approves routine browser actions \u2014 you are only prompted when it is unsure." : "Browser actions still go through Claude's regular permission prompts before they run." : "Site-level permissions come from the Chrome extension.";
    let h;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      h = Yie.jsx(Text, {
        bold: true,
        color: "permission",
        children: "/chrome"
      });
      t[7] = h;
    } else {
      h = t[7];
    }
    let g;
    if (t[8] !== f) {
      g = Yie.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [m, Yie.jsxs(Text, {
          dimColor: true,
          children: [f, " ", "Turn browser tools off for future sessions with", " ", h, "."]
        })]
      });
      t[8] = f;
      t[9] = g;
    } else {
      g = t[9];
    }
    let y;
    if (t[10] !== u) {
      y = Yie.jsx(mc, {
        confirmLabel: "Yes, use my browser",
        cancelLabel: "No, keep browser tools off",
        onConfirm: () => u(true),
        onCancel: () => u(false)
      });
      t[10] = u;
      t[11] = y;
    } else {
      y = t[11];
    }
    let _;
    if (t[12] !== g || t[13] !== y || t[14] !== d) {
      _ = Yie.jsxs(or, {
        title: "Claude in Chrome extension detected",
        color: "permission",
        onCancel: d,
        inputGuide: p,
        children: [g, y]
      });
      t[12] = g;
      t[13] = y;
      t[14] = d;
      t[15] = _;
    } else {
      _ = t[15];
    }
    return _;
  }
  function rHf() {
    logEvent("tengu_chrome_auto_enable_prompt_shown", {});
  }
  var s4c;
  var G_r;
  var Yie;
  var a4c = __lazy(() => {
    Ot();
    et();
    ln();
    b1();
    Sd();
    Ai();
    b_();
    Ii();
    bs();
    s4c = __toESM(pt(), 1);
    G_r = __toESM(ot(), 1);
    Yie = __toESM(ie(), 1);
  });
  var Mts = {};
  __export(Mts, {
    ThirdPartyModelUpgradeDialog: () => ThirdPartyModelUpgradeDialog
  });
  function ThirdPartyModelUpgradeDialog(e) {
    let t = l4c.c(27);
    let {
      tierLabel: n,
      fromName: r,
      toName: o,
      toProviderId: s,
      onDone: i
    } = e;
    let a = `Newer ${n} model available`;
    let l;
    if (t[0] !== i) {
      l = () => i(false);
      t[0] = i;
      t[1] = l;
    } else {
      l = t[1];
    }
    let c;
    if (t[2] !== r) {
      c = JK.jsxs(Text, {
        children: ["Currently pinned: ", JK.jsx(Text, {
          bold: true,
          children: r
        })]
      });
      t[2] = r;
      t[3] = c;
    } else {
      c = t[3];
    }
    let u;
    if (t[4] !== o) {
      u = JK.jsx(Text, {
        bold: true,
        children: o
      });
      t[4] = o;
      t[5] = u;
    } else {
      u = t[5];
    }
    let d;
    if (t[6] !== s) {
      d = JK.jsxs(Text, {
        dimColor: true,
        children: ["(", s, ")"]
      });
      t[6] = s;
      t[7] = d;
    } else {
      d = t[7];
    }
    let p;
    if (t[8] !== u || t[9] !== d) {
      p = JK.jsxs(Text, {
        children: ["Latest available: ", u, " ", d]
      });
      t[8] = u;
      t[9] = d;
      t[10] = p;
    } else {
      p = t[10];
    }
    let m;
    if (t[11] !== c || t[12] !== p) {
      m = JK.jsxs(gXd, {
        flexDirection: "column",
        children: [c, p]
      });
      t[11] = c;
      t[12] = p;
      t[13] = m;
    } else {
      m = t[13];
    }
    let f;
    if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
      f = JK.jsx(Text, {
        dimColor: true,
        children: "Claude Code will restart to apply."
      });
      t[14] = f;
    } else {
      f = t[14];
    }
    let h;
    if (t[15] !== o) {
      h = JK.jsxs(Text, {
        children: ["Update settings to use ", o, "?", " ", f]
      });
      t[15] = o;
      t[16] = h;
    } else {
      h = t[16];
    }
    let g;
    if (t[17] !== i) {
      g = JK.jsx(mc, {
        onConfirm: () => i(true),
        onCancel: () => i(false)
      });
      t[17] = i;
      t[18] = g;
    } else {
      g = t[18];
    }
    let y;
    if (t[19] !== g || t[20] !== m || t[21] !== h) {
      y = JK.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [m, h, g]
      });
      t[19] = g;
      t[20] = m;
      t[21] = h;
      t[22] = y;
    } else {
      y = t[22];
    }
    let _;
    if (t[23] !== a || t[24] !== y || t[25] !== l) {
      _ = JK.jsx(or, {
        title: a,
        color: "permission",
        onCancel: l,
        children: y
      });
      t[23] = a;
      t[24] = y;
      t[25] = l;
      t[26] = _;
    } else {
      _ = t[26];
    }
    return _;
  }
  var l4c;
  var JK;
  var Nts = __lazy(() => {
    et();
    b_();
    Ii();
    l4c = __toESM(pt(), 1);
    JK = __toESM(ie(), 1);
  });
  function sHf() {
    saveGlobalConfig(e => ({
      ...e,
      hasCompletedOnboarding: true,
      lastOnboardingVersion: {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION
    }));
  }
  function z_r(e, t) {
    return new Promise(n => {
      let r = o => void n(o);
      e.render(t(r));
    });
  }
  async function u4c(e) {
    let t = await uYo();
    let n = TYn();
    if (t.pendingServers.length === 0) {
      return null;
    }
    if (n.length === 0) {
      let o;
      try {
        o = await Dbc(e, t);
      } catch (i) {
        throw Ae("mcp_project_approval_dialog", "mcp_project_approval_dialog_threw"), i;
      }
      if (o.persistFailed) {
        Ae("mcp_project_approval_dialog", "mcp_approval_persist_failed");
        return {
          key: "mcp-approval-persist-failed",
          text: "one or more of your MCP server choices could not be saved (check permissions on .claude/settings.local.json) \xB7 you will be asked again next startup"
        };
      }
      let s = getWorkspacePersistedTrustKey();
      if (getSessionApprovedMcpServers().some(i => i.workspaceKey === s) && !isWorkspacePersistedTrusted() && isLocalSettingsGitTracked()) {
        Et("mcp_project_approval_dialog", "mcp_approval_persist_gated");
        return {
          key: "mcp-approval-persist-gated",
          text: "your MCP server choices apply to this session only (workspace not explicitly trusted; .claude/settings.local.json is gated) \xB7 to persist, add them to enabledMcpjsonServers in ~/.claude/settings.json"
        };
      }
      Pe("mcp_project_approval_dialog");
      return null;
    }
    let r = Ro(n.map(o => o.file).filter(Boolean)).join(", ");
    Et("mcp_project_approval_dialog", "mcp_project_approval_skipped_settings_errors");
    return {
      key: "mcp-approval-skipped",
      text: `skipping .mcp.json server approval (settings errors${r ? ` in ${r}` : ""}) \xB7 run /doctor and fix them, then restart`
    };
  }
  async function IL(e, t, n) {
    return iHf(e, t, {
      color: "error",
      beforeExit: n
    });
  }
  async function iHf(e, t, n) {
    let {
      Text: r
    } = await Promise.resolve().then(() => (et(), fG));
    let o = n?.color;
    let s = n?.exitCode ?? 1;
    if (e.render(o ? RR.jsx(r, {
      color: o,
      children: t
    }) : RR.jsx(r, {
      children: t
    })), e.unmount(), await n?.beforeExit?.(), s !== 0) {
      let {
        setBgExitCause: a
      } = await Promise.resolve().then(() => (M7(), Mps));
      a("exit_with_message");
    }
    let {
      flushAnalyticsSinks: i
    } = await Promise.resolve().then(() => (lm(), NGt));
    await i();
    process.exit(s);
  }
  function AL(e, t, n) {
    let r = process.env.CLAUDE_JOB_DIR ? Promise.resolve().then(() => (w7e(), hrr)).then(s => s.markStartupDialogBlocked()).catch(() => {
      return;
    }) : undefined;
    let o = z_r(e, s => RR.jsx(AppStateProvider, {
      onChangeAppState: n?.onChangeAppState,
      children: RR.jsx(KeybindingSetup, {
        children: t(s)
      })
    }));
    if (!r) {
      return o;
    }
    return o.finally(() => r.then(s => s ? Promise.resolve().then(() => (w7e(), hrr)).then(i => i.clearStartupDialogBlocked(s)) : undefined).catch(() => {}));
  }
  async function NXe(e, t) {
    e.render(t);
    startDeferredPrefetches();
    await e.waitUntilExit();
    await gracefulShutdown(0);
  }
  async function p4c(e, t, n, r, o, s, i) {
    let a = null;
    if (li() || Me.CLAUDE_BRIDGE_REATTACH_SESSION) {
      setSessionTrustAccepted(true);
      resetGrowthBook();
      initializeGrowthBook().catch(p => Oe(sr(p)));
      Tv();
      a = await u4c(e);
      applyConfigEnvironmentVariables();
      bQn();
      setImmediate(() => initializeTelemetryAfterTrust());
      return {
        onboardingShown: false,
        mcpApprovalSkipWarning: a,
        claudeInChromeAccepted: false
      };
    }
    if (st(false) || process.env.IS_DEMO) {
      bQn();
      return {
        onboardingShown: false,
        mcpApprovalSkipWarning: a,
        claudeInChromeAccepted: false
      };
    }
    let l = getGlobalConfig();
    let c = false;
    if (!l.hasCompletedOnboarding || Me.CLAUDE_CODE_POWERUP_ONBOARDING === "banner" || Me.CLAUDE_CODE_POWERUP_ONBOARDING === "step") {
      c = true;
      let {
        Onboarding: p
      } = await Promise.resolve().then(() => (f3c(), m3c));
      await AL(e, m => RR.jsx(p, {
        onDone: () => {
          sHf();
          m();
        }
      }), {
        onChangeAppState: HCe
      });
    }
    let u = false;
    if (!Me.CLAUBBIT) {
      if (!checkHasTrustDialogAccepted()) {
        u = true;
        let {
          TrustDialog: p
        } = await Promise.resolve().then(() => (q3c(), j3c));
        await AL(e, m => RR.jsx(p, {
          commands: r,
          onDone: m
        }));
      }
      if (setSessionTrustAccepted(true), u) {
        clearPluginCache("post-trust: re-discover project @skills-dir plugins");
      }
      if (resetGrowthBook(), !l.hasCompletedOnboarding) {
        _Ie();
        let p = Date.now();
        try {
          await withTimeout(initializeGrowthBook(), 2000, "GB post-onboarding init");
          logForDebugging(`[STARTUP] post-onboarding GB await ${Date.now() - p}ms`);
        } catch (m) {
          if (logForDebugging(`[STARTUP] post-onboarding GB await ${Date.now() - p}ms: ${m}`, {
            level: "warn"
          }), !(m instanceof Error && m.message === "GB post-onboarding init")) {
            Oe(sr(m));
          }
        }
      } else {
        initializeGrowthBook().catch(p => Oe(sr(p)));
      }
      if (Tv(), a = await u4c(e), await shouldShowClaudeMdExternalIncludesWarning()) {
        let p = getExternalClaudeMdIncludes(await getMemoryFiles(true));
        let {
          ClaudeMdExternalIncludesDialog: m
        } = await Promise.resolve().then(() => (vjo(), eql));
        await AL(e, f => RR.jsx(m, {
          onDone: f,
          isStandaloneDialog: true,
          externalIncludes: p
        }));
      }
    }
    if ($qc(), Fqc(), applyConfigEnvironmentVariables(), bQn(), u) {
      if (!getIsRemoteMode() && !kd()) {
        Promise.resolve().then(() => (V3n(), G3n)).then(p => p.startMemoryWatcher());
      }
    }
    if (setImmediate(() => initializeTelemetryAfterTrust()), await Cgt()) {
      let {
        GroveDialog: p
      } = await Promise.resolve().then(() => (n5o(), Cnc));
      if ((await AL(e, f => RR.jsx(p, {
        showIfAlreadyViewed: false,
        location: c ? "onboarding" : "policy_update_modal",
        onDone: f
      }))) === "escape") {
        logEvent("tengu_grove_policy_exited", {});
        gracefulShutdownSync(0);
        return {
          onboardingShown: false,
          mcpApprovalSkipWarning: a,
          claudeInChromeAccepted: false
        };
      }
    }
    {
      let {
        getProTrialState: p
      } = await Promise.resolve().then(() => (Fwt(), vYl));
      if (p().status === "not_started") {
        let {
          ProTrialStartScreen: m
        } = await Promise.resolve().then(() => (z3c(), V3c));
        logEvent("tengu_pro_trial_start_screen_shown", {});
        await AL(e, f => RR.jsx(m, {
          onDone: f
        }));
      }
    }
    if (c) {
      let {
        resolvePowerupDiscoveryArm: p
      } = await Promise.resolve().then(() => (Ylr(), QYl));
      if (p() === "step") {
        let {
          PowerupDiscoveryStep: m
        } = await Promise.resolve().then(() => (X3c(), J3c));
        await AL(e, f => RR.jsx(m, {
          onDone: f
        }));
      }
    }
    if (process.env.ANTHROPIC_API_KEY && !cC() && getAPIProvider() === "firstParty") {
      let p = a2(process.env.ANTHROPIC_API_KEY);
      if (getCustomApiKeyStatus(p) === "new") {
        let {
          ApproveApiKey: f
        } = await Promise.resolve().then(() => (kts(), t3c));
        await AL(e, h => RR.jsx(f, {
          customApiKeyTruncated: p,
          onDone: h
        }), {
          onChangeAppState: HCe
        });
      }
    }
    try {
      await lHf(e);
    } catch (p) {
      Oe(p);
    }
    try {
      await uHf(e);
    } catch (p) {
      Oe(p);
    }
    try {
      await cHf(e);
    } catch (p) {
      Oe(p);
    }
    if ((t === "bypassPermissions" || n) && !hasSkipDangerousModePermissionPrompt()) {
      let {
        BypassPermissionsModeDialog: p
      } = await Promise.resolve().then(() => (Dts(), Ots));
      await AL(e, m => RR.jsx(p, {
        onAccept: m
      }));
    }
    if (t === "auto" && !hasAutoModeOptIn()) {
      let {
        AutoModeOptInDialog: p
      } = await Promise.resolve().then(() => (jhr(), kXo));
      await AL(e, m => RR.jsx(p, {
        onAccept: m,
        onDecline: () => gracefulShutdownSync(1),
        declineExits: true
      }));
    }
    if (getAllowedChannels().length > 0 || (s?.length ?? 0) > 0) {
      await checkGate_CACHED_OR_BLOCKING("tengu_harbor");
    }
    if (s && s.length > 0) {
      let [{
        isChannelsEnabled: p
      }, {
        isChannelsPolicyBlocked: m
      }, {
        getSettingsForSource: f
      }] = await Promise.all([Promise.resolve().then(() => (MTt(), Qxl)), Promise.resolve().then(() => (qKe(), ekl)), Promise.resolve().then(() => (mr(), yY))]);
      if (!p() || getAPIProvider() !== "firstParty" || m(f("policySettings"))) {
        setAllowedChannels([...getAllowedChannels(), ...s.map(h => ({
          ...h,
          dev: true
        }))]);
        setHasDevChannels(true);
      } else {
        let {
          DevChannelsDialog: h
        } = await Promise.resolve().then(() => (t4c(), e4c));
        await AL(e, g => RR.jsx(h, {
          channels: s,
          onAccept: () => {
            setAllowedChannels([...getAllowedChannels(), ...s.map(y => ({
              ...y,
              dev: true
            }))]);
            setHasDevChannels(true);
            g();
          }
        }));
      }
    }
    if (o && !getGlobalConfig().hasCompletedClaudeInChromeOnboarding) {
      let {
        ClaudeInChromeOnboarding: p
      } = await Promise.resolve().then(() => (o4c(), r4c));
      await AL(e, m => RR.jsx(p, {
        onDone: m
      }));
    }
    let d = false;
    if (i) {
      let {
        isChromeExtensionInstalled: p
      } = await Promise.resolve().then(() => (Gwe(), v3o));
      let m = await withTimeout(p(), 1500, "chrome extension scan timed out before offer").catch(() => true);
      let f = Boolean(getGlobalConfig().chromeExtension?.pairedDeviceId);
      if (m || f) {
        await withTimeout(initializeGrowthBook().catch(() => {}), 1500, "GrowthBook init timed out before chrome offer").catch(() => {});
        let h = getFeatureValue_CACHED_MAY_BE_STALE("tengu_chrome_auto_enable", false);
        let g = getGlobalConfig().claudeInChromeDefaultEnabled !== undefined;
        let {
          doesEnterpriseMcpConfigExist: y,
          isMcpServerDenied: _
        } = await Promise.resolve().then(() => (Iw(), wHa));
        let {
          CLAUDE_IN_CHROME_MCP_SERVER_NAME: b
        } = await Promise.resolve().then(() => (b1(), jea));
        let {
          getClaudeInChromeMcpServerConfig: S
        } = await Promise.resolve().then(() => (Gwe(), v3o));
        if (y() || _(b, S())) {
          logForDebugging("[Claude in Chrome] Skipping offer: blocked by enterprise MCP config or managed deniedMcpServers policy");
        } else if (g) {
          logForDebugging("[Claude in Chrome] Skipping offer: decision already recorded (another instance answered)");
          d = getGlobalConfig().claudeInChromeDefaultEnabled === true;
        } else if (h) {
          let {
            ChromeAutoEnableDialog: C
          } = await Promise.resolve().then(() => (a4c(), i4c));
          d = await AL(e, x => RR.jsx(C, {
            onDone: x,
            isDontAskMode: t === "dontAsk",
            isAutoMode: t === "auto"
          }));
        } else {
          logForDebugging("[Claude in Chrome] Skipping offer: tengu_chrome_auto_enable no longer set (stale GB cache)");
        }
      } else {
        logForDebugging("[Claude in Chrome] Skipping offer: extension not present locally (stale cache)");
      }
    }
    return {
      onboardingShown: c,
      mcpApprovalSkipWarning: a,
      claudeInChromeAccepted: d
    };
  }
  async function lHf(e) {
    let {
      findBedrockUpgradeCandidates: t,
      upgradeKey: n
    } = await Promise.resolve().then(() => (Sts(), bts));
    let r = await withProbeDeadline("bedrock-upgrade", t());
    if (r.length === 0) {
      return;
    }
    let o = getGlobalConfig().bedrockDeclinedUpgrades ?? {};
    let s = r.filter(c => o[c.tier] !== n(c));
    if (s.length === 0) {
      return;
    }
    let {
      updateSettingsForSource: i
    } = await Promise.resolve().then(() => (mr(), yY));
    let {
      ThirdPartyModelUpgradeDialog: a
    } = await Promise.resolve().then(() => (Nts(), Mts));
    let l = false;
    for (let c of s) {
      if (await AL(e, d => RR.jsx(a, {
        tierLabel: TIER_LABELS[c.tier],
        fromName: c.fromMarketingName,
        toName: c.toMarketingName,
        toProviderId: c.toBedrockId,
        onDone: d
      }))) {
        let d = c.tier === "haiku" ? {
          ANTHROPIC_DEFAULT_HAIKU_MODEL: c.toBedrockId,
          ...(c.envVar === "ANTHROPIC_SMALL_FAST_MODEL" && {
            ANTHROPIC_SMALL_FAST_MODEL: c.toBedrockId
          })
        } : {
          [c.envVar]: c.toBedrockId
        };
        let {
          error: p
        } = i("userSettings", {
          env: d
        });
        if (p) {
          logEvent("tengu_bedrock_upgrade_save_failed", {
            tier: c.tier
          });
          let {
            Text: m
          } = await Promise.resolve().then(() => (et(), fG));
          await z_r(e, f => (setTimeout(f, 2000), RR.jsxs(m, {
            color: "error",
            children: ["Failed to save ", TIER_LABELS[c.tier], " upgrade to settings."]
          })));
        } else {
          for (let m of Object.keys(d)) {
            process.env[m] = c.toBedrockId;
          }
          l = true;
          logEvent("tengu_bedrock_upgrade_accepted", {
            tier: c.tier,
            from_key: c.fromKey,
            to_key: c.toKey
          });
        }
      } else {
        saveGlobalConfig(d => ({
          ...d,
          bedrockDeclinedUpgrades: {
            ...d.bedrockDeclinedUpgrades,
            [c.tier]: n(c)
          }
        }));
        logEvent("tengu_bedrock_upgrade_declined", {
          tier: c.tier,
          from_key: c.fromKey,
          to_key: c.toKey
        });
      }
    }
    if (l) {
      logEvent("tengu_bedrock_upgrade_relaunch", {});
      await m4c(e);
    }
  }
  async function m4c(e) {
    let {
      Text: t
    } = await Promise.resolve().then(() => (et(), fG));
    e.render(RR.jsx(t, {
      dimColor: true,
      children: "Restarting Claude Code to apply the new model\u2026"
    }));
    let {
      sleep: n
    } = await Promise.resolve().then(() => tDt);
    await n(250);
    e.unmount();
    let {
      execRelaunch: r
    } = await Promise.resolve().then(() => (bze(), _ze));
    await r();
  }
  async function cHf(e) {
    let {
      lines: t,
      hasHardFailure: n
    } = await apply3PDefaultFallbacks();
    if (t.length === 0) {
      return;
    }
    let {
      gXd: r,
      Text: o
    } = await Promise.resolve().then(() => (et(), fG));
    let s = n ? 4000 : 1500;
    await z_r(e, i => (setTimeout(i, s), RR.jsx(r, {
      flexDirection: "column",
      children: t.map(a => RR.jsx(o, {
        color: "warning",
        children: a
      }, a))
    })));
  }
  async function uHf(e) {
    let {
      findVertexUpgradeCandidates: t,
      vertexUpgradeKey: n
    } = await Promise.resolve().then(() => (vts(), Ets));
    let r = await withProbeDeadline("vertex-upgrade", t());
    if (r.length === 0) {
      return;
    }
    let o = getGlobalConfig().vertexDeclinedUpgrades ?? {};
    let s = r.filter(c => o[c.tier] !== n(c));
    if (s.length === 0) {
      return;
    }
    let {
      updateSettingsForSource: i
    } = await Promise.resolve().then(() => (mr(), yY));
    let {
      ThirdPartyModelUpgradeDialog: a
    } = await Promise.resolve().then(() => (Nts(), Mts));
    let l = false;
    for (let c of s) {
      if (await AL(e, d => RR.jsx(a, {
        tierLabel: TIER_LABELS[c.tier],
        fromName: c.fromMarketingName,
        toName: c.toMarketingName,
        toProviderId: c.toVertexId,
        onDone: d
      }))) {
        let d = c.tier === "haiku" ? {
          ANTHROPIC_DEFAULT_HAIKU_MODEL: c.toVertexId,
          ...(c.envVar === "ANTHROPIC_SMALL_FAST_MODEL" && {
            ANTHROPIC_SMALL_FAST_MODEL: c.toVertexId
          })
        } : {
          [c.envVar]: c.toVertexId
        };
        let {
          error: p
        } = i("userSettings", {
          env: d
        });
        if (p) {
          logEvent("tengu_vertex_upgrade_save_failed", {
            tier: c.tier
          });
          let {
            Text: m
          } = await Promise.resolve().then(() => (et(), fG));
          await z_r(e, f => (setTimeout(f, 2000), RR.jsxs(m, {
            color: "error",
            children: ["Failed to save ", TIER_LABELS[c.tier], " upgrade to settings."]
          })));
        } else {
          for (let m of Object.keys(d)) {
            process.env[m] = c.toVertexId;
          }
          l = true;
          logEvent("tengu_vertex_upgrade_accepted", {
            tier: c.tier,
            from_key: c.fromKey,
            to_key: c.toKey
          });
        }
      } else {
        saveGlobalConfig(d => ({
          ...d,
          vertexDeclinedUpgrades: {
            ...d.vertexDeclinedUpgrades,
            [c.tier]: n(c)
          }
        }));
        logEvent("tengu_vertex_upgrade_declined", {
          tier: c.tier,
          from_key: c.fromKey,
          to_key: c.toKey
        });
      }
    }
    if (l) {
      logEvent("tengu_vertex_upgrade_relaunch", {});
      await m4c(e);
    }
  }
  function f4c(e) {
    let t = 0;
    let n = getBaseRenderOptions(e);
    if (n.stdin) {
      logEvent("tengu_stdin_interactive", {});
    }
    let r = new yts();
    let o = yJo();
    setStatsStore(o);
    let s = Me.CLAUDE_CODE_FRAME_TIMING_LOG;
    let i = -1;
    let a = 0;
    let l = Math.max(1, Me.CLAUDE_CODE_FRAME_TIMING_SAMPLE_EVERY || 1);
    if (s) {
      try {
        i = V_r.openSync(s, "a");
      } catch {}
    }
    return {
      getFpsMetrics: () => r.getMetrics(),
      stats: o,
      renderOptions: {
        ...n,
        onFrame: c => {
          if (r.record(c.durationMs), o.observe("frame_duration_ms", c.durationMs), i >= 0 && c.phases) {
            let u = a++ % l === 0;
            let d = JSON.stringify({
              total: c.durationMs,
              ...c.phases,
              ...(u && {
                rss: process.memoryUsage.rss(),
                cpu: process.cpuUsage()
              })
            }) + `
`;
            V_r.writeSync(i, d);
          }
          if (q2()) {
            return;
          }
          for (let u of c.flickers) {
            if (u.reason === "resize") {
              continue;
            }
            let d = Date.now();
            if (d - t < 1000) {
              logEvent("tengu_flicker", {
                desiredHeight: u.desiredHeight,
                actualHeight: u.availableHeight,
                reason: u.reason
              });
            }
            t = d;
          }
        }
      }
    };
  }
  var V_r;
  var RR;
  var Lts = __lazy(() => {
    Ot();
    lm();
    at();
    _Jo();
    LG();
    Afr();
    mT();
    C9();
    usn();
    ln();
    $n();
    Rgt();
    pYo();
    _3();
    xRt();
    TQn();
    Lot();
    bx();
    yd();
    je();
    Uqc();
    pr();
    gn();
    dt();
    osn();
    Rn();
    qEe();
    Rts();
    Ds();
    xg();
    Qoe();
    W_t();
    Bne();
    V_r = require("fs");
    RR = __toESM(ie(), 1);
  });
  var g4c = {};
  __export(g4c, {
    InvalidSettingsDialog: () => InvalidSettingsDialog
  });
  function InvalidSettingsDialog(e) {
    let t = h4c.c(21);
    let {
      settingsErrors: n,
      onContinue: r,
      onFix: o,
      onExit: s
    } = e;
    let i;
    if (t[0] !== r || t[1] !== s || t[2] !== o) {
      i = function (S) {
        if (S === "exit") {
          s();
        } else if (S === "fix") {
          o();
        } else {
          r();
        }
      };
      t[0] = r;
      t[1] = s;
      t[2] = o;
      t[3] = i;
    } else {
      i = t[3];
    }
    let a = i;
    let l;
    if (t[4] !== n) {
      l = n.some(pHf);
      t[4] = n;
      t[5] = l;
    } else {
      l = t[5];
    }
    let c = l;
    let u;
    if (t[6] !== c) {
      u = c ? [{
        label: "Fix with Claude",
        value: "fix"
      }, {
        label: "Exit and fix manually",
        value: "exit"
      }, {
        label: "Continue without these settings",
        value: "continue"
      }] : [{
        label: "Continue",
        value: "continue"
      }, {
        label: "Fix with Claude",
        value: "fix"
      }, {
        label: "Exit and fix manually",
        value: "exit"
      }];
      t[6] = c;
      t[7] = u;
    } else {
      u = t[7];
    }
    let d = u;
    let p = c ? "Settings Error" : "Settings Warning";
    let m = c ? s : r;
    let f;
    if (t[8] !== n) {
      f = Vxt.jsx(zir, {
        errors: n
      });
      t[8] = n;
      t[9] = f;
    } else {
      f = t[9];
    }
    let h = c ? "Files with errors are skipped entirely, not just the invalid settings." : "The values listed above were skipped; the rest of the file is in effect.";
    let g;
    if (t[10] !== h) {
      g = Vxt.jsx(Text, {
        dimColor: true,
        children: h
      });
      t[10] = h;
      t[11] = g;
    } else {
      g = t[11];
    }
    let y;
    if (t[12] !== a || t[13] !== d) {
      y = Vxt.jsx(xr, {
        options: d,
        onChange: a
      });
      t[12] = a;
      t[13] = d;
      t[14] = y;
    } else {
      y = t[14];
    }
    let _;
    if (t[15] !== p || t[16] !== m || t[17] !== f || t[18] !== g || t[19] !== y) {
      _ = Vxt.jsxs(or, {
        title: p,
        onCancel: m,
        color: "warning",
        children: [f, g, y]
      });
      t[15] = p;
      t[16] = m;
      t[17] = f;
      t[18] = g;
      t[19] = y;
      t[20] = _;
    } else {
      _ = t[20];
    }
    return _;
  }
  function pHf(e) {
    return e.severity !== "warning";
  }
  var h4c;
  var Vxt;
  var y4c = __lazy(() => {
    et();
    OS();
    Ii();
    Qqo();
    h4c = __toESM(pt(), 1);
    Vxt = __toESM(ie(), 1);
  });
  var b4c = {};
  __export(b4c, {
    TeleportRepoMismatchDialog: () => TeleportRepoMismatchDialog
  });
  function TeleportRepoMismatchDialog(e) {
    let t = _4c.c(18);
    let {
      targetRepo: n,
      initialPaths: r,
      onSelectPath: o,
      onCancel: s
    } = e;
    let [i, a] = Y_r.useState(r);
    let [l, c] = Y_r.useState(null);
    let [u, d] = Y_r.useState(false);
    let p;
    if (t[0] !== i || t[1] !== s || t[2] !== o || t[3] !== n) {
      p = async _ => {
        if (_ === "cancel") {
          s();
          return;
        }
        if (d(true), c(null), await Hqc(_, n)) {
          o(_);
          return;
        }
        jqc(n, _);
        let S = i.filter(E => E !== _);
        a(S);
        d(false);
        c(`${Pd(_)} no longer contains the correct repository. Select another path.`);
      };
      t[0] = i;
      t[1] = s;
      t[2] = o;
      t[3] = n;
      t[4] = p;
    } else {
      p = t[4];
    }
    let m = p;
    let f;
    if (t[5] !== i) {
      let _;
      if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
        _ = {
          label: "Cancel",
          value: "cancel"
        };
        t[7] = _;
      } else {
        _ = t[7];
      }
      f = [...i.map(fHf), _];
      t[5] = i;
      t[6] = f;
    } else {
      f = t[6];
    }
    let h = f;
    let g;
    if (t[8] !== i.length || t[9] !== l || t[10] !== m || t[11] !== h || t[12] !== n || t[13] !== u) {
      g = i.length > 0 ? dN.jsxs(dN.Fragment, {
        children: [dN.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          children: [dN.jsx(Hc, {
            error: l
          }), dN.jsxs(Text, {
            children: ["Open Claude Code in ", dN.jsx(Text, {
              bold: true,
              children: n
            }), ":"]
          })]
        }), u ? dN.jsxs(gXd, {
          children: [dN.jsx(Ed, {}), dN.jsx(Text, {
            children: " Validating repository\u2026"
          })]
        }) : dN.jsx(xr, {
          options: h,
          onChange: _ => void m(_)
        })]
      }) : dN.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [dN.jsx(Hc, {
          error: l
        }), dN.jsxs(Text, {
          dimColor: true,
          children: ["Run claude --teleport from a checkout of ", n]
        })]
      });
      t[8] = i.length;
      t[9] = l;
      t[10] = m;
      t[11] = h;
      t[12] = n;
      t[13] = u;
      t[14] = g;
    } else {
      g = t[14];
    }
    let y;
    if (t[15] !== s || t[16] !== g) {
      y = dN.jsx(or, {
        title: "Teleport to Repo",
        onCancel: s,
        color: "background",
        children: g
      });
      t[15] = s;
      t[16] = g;
      t[17] = y;
    } else {
      y = t[17];
    }
    return y;
  }
  function fHf(e) {
    return {
      label: dN.jsxs(Text, {
        children: ["Use ", dN.jsx(Text, {
          bold: true,
          children: Pd(e)
        })]
      }),
      value: e
    };
  }
  var _4c;
  var Y_r;
  var dN;
  var S4c = __lazy(() => {
    et();
    Zl();
    osn();
    OS();
    Ii();
    bv();
    cA();
    _4c = __toESM(pt(), 1);
    Y_r = __toESM(ot(), 1);
    dN = __toESM(ie(), 1);
  });
  function zxt(e, t, n) {
    if (!t) {
      return e;
    }
    if (Ql()) {
      return e;
    }
    if (n?.strictMcpConfig && t.source !== "flagSettings" || doesEnterpriseMcpConfigExist()) {
      return e;
    }
    let o = agentMcpSpecsToScopedConfigs(t);
    if (Object.keys(o).length === 0) {
      return e;
    }
    let {
      allowed: s,
      blocked: i
    } = filterMcpServersByPolicy(o);
    if (i.length > 0) {
      n?.onBlocked?.(i);
    }
    return {
      ...s,
      ...e
    };
  }
  var Fts = __lazy(() => {
    Iw();
    kS();
    gn();
  });
  var w4c = {};
  __export(w4c, {
    parsePrIdentifier: () => parsePrIdentifier,
    ResumeConversation: () => ResumeConversation,
    LiveBgMessage: () => LiveBgMessage
  });
  function parsePrIdentifier(e) {
    let t = parseInt(e, 10);
    if (!isNaN(t) && t > 0) {
      return t;
    }
    let n = e.match(/(?:https?:\/\/)?[^/\s]+\/[^\s]+?\/(?:pull|pull-requests|-\/merge_requests)\/(\d+)/);
    if (n?.[1]) {
      return parseInt(n[1], 10);
    }
    return null;
  }
  function ResumeConversation({
    commands: e,
    worktreePaths: t,
    initialTools: n,
    mcpClients: r,
    dynamicMcpConfig: o,
    debug: s,
    mainThreadAgentDefinition: i,
    autoConnectIdeFlag: a,
    strictMcpConfig: l = false,
    systemPrompt: c,
    appendSystemPrompt: u,
    initialSearchQuery: d,
    disableSlashCommands: p = false,
    forkSession: m,
    filterByPr: f,
    thinkingConfig: h,
    fallbackModel: g,
    onTurnComplete: y,
    onCaptureSnapshot: _
  }) {
    let {
      rows: b
    } = Sr();
    let S = bt(me => me.agentDefinitions);
    let E = bt(me => me.standaloneAgentContext);
    let C = bt(me => me.mainLoopModel);
    let x = Lo();
    let [A, k] = CA.useState([]);
    let [I, O] = CA.useState(true);
    let [M, L] = CA.useState(false);
    let [P, F] = CA.useState(false);
    let [H, U] = CA.useState(null);
    let [N, W] = CA.useState(null);
    let [j, z] = CA.useState(null);
    let V = CA.useRef(null);
    let [K, J] = CA.useState(0);
    let Q = CA.useRef(0);
    let Z = CA.useRef(0);
    let ne = CA.useMemo(() => {
      let me = A.filter(Te => !Te.isSidechain);
      if (f !== undefined) {
        if (f === true) {
          me = me.filter(Te => Te.prNumber !== undefined);
        } else if (typeof f === "number") {
          me = me.filter(Te => Te.prNumber === f);
        } else if (typeof f === "string") {
          let Te = parsePrIdentifier(f);
          if (Te !== null) {
            me = me.filter(ue => ue.prNumber === Te);
          }
        }
      }
      return me;
    }, [A, f]);
    let oe = isCustomTitleEnabled();
    let ee = CA.useMemo(() => Me.CLAUDE_CODE_DISABLE_TERMINAL_TITLE, []);
    useTerminalTitle(H || ee ? null : "claude \xB7 resume");
    CA.useEffect(() => {
      loadSameRepoMessageLogsProgressive(t).then(me => {
        V.current = me;
        Q.current = me.logs.length;
        k(me.logs);
        O(false);
        Pe("screen_resume_conversation");
      }).catch(me => {
        Ae("screen_resume_conversation", "resume_conversation_load_failed");
        Oe(me);
        O(false);
      });
    }, [t]);
    let re = CA.useRef(false);
    let se = CA.useCallback(me => {
      if (re.current) {
        return;
      }
      let Te = V.current;
      if (!Te || Te.nextIndex >= Te.allStatLogs.length) {
        return;
      }
      re.current = true;
      let ue = false;
      enrichLogs(Te.allStatLogs, Te.nextIndex, me).then(ce => {
        if (V.current !== Te) {
          return;
        }
        if (Te.nextIndex = ce.nextIndex, ce.logs.length > 0) {
          let le = Q.current;
          ce.logs.forEach((pe, ve) => {
            pe.value = le + ve;
          });
          k(pe => pe.concat(ce.logs));
          Q.current += ce.logs.length;
        } else if (Te.nextIndex < Te.allStatLogs.length) {
          ue = true;
        }
      }).finally(() => {
        if (re.current = false, ue) {
          se(me);
        }
      });
    }, []);
    let ae = CA.useCallback(me => {
      O(true);
      let Te = ++Z.current;
      let ue = V.current;
      V.current = null;
      J(le => le + 1);
      (me ? loadAllProjectsMessageLogsProgressive() : loadSameRepoMessageLogsProgressive(t)).then(le => {
        if (Z.current !== Te) {
          return;
        }
        V.current = le;
        Q.current = le.logs.length;
        k(le.logs);
      }).catch(le => {
        if (Z.current !== Te) {
          return;
        }
        if (ue !== null) {
          V.current = ue;
        }
        k(pe => pe.slice());
        Oe(le);
      }).finally(() => {
        if (Z.current !== Te) {
          return;
        }
        O(false);
      });
    }, [t]);
    let de = CA.useCallback(() => {
      let me = !P;
      F(me);
      ae(me);
    }, [P, ae]);
    function be() {
      process.exit(1);
    }
    async function fe(me) {
      L(true);
      let Te = performance.now();
      let ue = Scr(me, P, t);
      if (ue.isCrossProject) {
        if (!ue.isSameRepoWorktree) {
          let pe = await Uk(ue.command);
          if (pe) {
            process.stdout.write(pe);
          }
          z(ue.command);
          return;
        }
      }
      if (!m) {
        let pe = getSessionIdFromLog(me);
        if (pe && (await findLiveNonInteractiveSession(pe))) {
          W({
            sessionId: pe,
            projectPath: me.projectPath
          });
          return;
        }
      }
      let ce = false;
      let le = "load_error";
      try {
        let pe = await loadConversationForResume(me, undefined, {
          forkSession: m ?? false
        });
        if (!pe) {
          throw logEvent("tengu_session_resumed", {
            entrypoint: "picker",
            success: false,
            failure_reason: "not_found_picker"
          }), ce = true, Error("Failed to load conversation");
        }
        le = "processing_error";
        {
          let Ge = (N1(), __toCommonJS(DG)).matchSessionMode(pe.mode);
          if (Ge) {
            kS();
            let {
              getAgentDefinitionsWithOverrides: Be,
              getActiveAgentsFromList: We
            } = __toCommonJS(cvt);
            Be.cache.clear?.();
            let Ze = await Be(getOriginalCwd());
            x(Tt => ({
              ...Tt,
              agentDefinitions: {
                ...Ze,
                allAgents: Ze.allAgents,
                activeAgents: We(Ze.allAgents)
              }
            }));
            pe.messages.push(wc(Ge, "warning"));
          }
        }
        if (pe.sessionId && !m) {
          switchSession(pe.sessionId, "resume", me.fullPath ? T4c.dirname(me.fullPath) : null);
          await renameRecordingForSession();
          await resetSessionFilePointer();
          Jqn(pe.sessionId);
        } else if (m && pe.contentReplacements?.length) {
          await recordContentReplacement(pe.contentReplacements);
        }
        let {
          agentDefinition: ve
        } = ZCe(pe.agentSetting, i, S);
        if (ve?.mcpServers?.length) {
          await xgt();
        }
        if (x(Ue => ({
          ...Ue,
          agent: ve?.agentType
        })), m) {
          uon(pe.messages);
        }
        let _e = bXe(pe.messages, C, Ue => pe.messages.push(wc(Ue, "warning")));
        let xe = _e ? SXe(pe.messages, _e, Boolean(m)) : undefined;
        if (xe) {
          x(Ue => Ue.mainLoopModel === xe ? Ue : {
            ...Ue,
            mainLoopModel: xe
          });
        }
        {
          fa();
          let {
            saveMode: Ue
          } = __toCommonJS(y5e);
          N1();
          let {
            isCoordinatorMode: Ge
          } = __toCommonJS(DG);
          Ue(Ge() ? "coordinator" : "normal");
        }
        let ke = con(pe.agentName, pe.agentColor);
        let Ie = E ? {
          ...ke,
          ...E
        } : ke;
        if (Ie) {
          x(Ue => ({
            ...Ue,
            standaloneAgentContext: Ie
          }));
        }
        if (GY(Ie?.name), restoreSessionMetadata(m ? {
          ...pe,
          worktreeSession: undefined,
          relocatedCwd: undefined,
          bridgeSessionId: undefined,
          bridgeLastSeq: undefined,
          bridgeDialogKinds: undefined
        } : pe), applyEndedByModelOnResume(nLe(pe), x), !m && pe.bridgeSessionId) {
          x(Ue => Ue.replBridgeEnabled && !Ue.replBridgeOutboundOnly ? Ue : {
            ...Ue,
            replBridgeEnabled: true,
            replBridgeOutboundOnly: false
          });
        }
        if (!m) {
          if (don(pe.worktreeSession), pe.sessionId) {
            adoptResumedSessionFile();
          }
        }
        logEvent("tengu_session_resumed", {
          entrypoint: "picker",
          success: true,
          resume_duration_ms: Math.round(performance.now() - Te)
        });
        k([]);
        U({
          messages: pe.messages,
          fileHistorySnapshots: pe.fileHistorySnapshots,
          contentReplacements: pe.contentReplacements,
          agentName: pe.agentName,
          agentColor: pe.agentColor === "default" ? undefined : pe.agentColor,
          mainThreadAgentDefinition: ve
        });
      } catch (pe) {
        if (!ce) {
          let ve = le;
          logEvent("tengu_session_resumed", {
            entrypoint: "picker",
            success: false,
            failure_reason: ve,
            error_name: sr(pe).name
          });
        }
        throw Oe($o(sr(pe), "resume picker: onSelect failed")), pe;
      }
    }
    if (N) {
      return xR.jsx(LiveBgMessage, {
        ...N
      });
    }
    if (j) {
      return xR.jsx(gHf, {
        command: j
      });
    }
    if (H) {
      return xR.jsx(REPL, {
        debug: s,
        commands: e,
        initialTools: n,
        initialMessages: H.messages,
        initialFileHistorySnapshots: H.fileHistorySnapshots,
        initialContentReplacements: H.contentReplacements,
        initialAgentName: H.agentName,
        initialAgentColor: H.agentColor,
        mcpClients: r,
        dynamicMcpConfig: zxt(o ?? {}, H.mainThreadAgentDefinition, {
          strictMcpConfig: l
        }),
        strictMcpConfig: l,
        systemPrompt: c,
        appendSystemPrompt: u,
        mainThreadAgentDefinition: H.mainThreadAgentDefinition,
        autoConnectIdeFlag: a,
        disableSlashCommands: p,
        thinkingConfig: h,
        fallbackModel: g,
        onTurnComplete: y,
        onCaptureSnapshot: _
      });
    }
    if (I && (A.length === 0 || ne.length === 0)) {
      return xR.jsx(Bts, {
        children: xR.jsx(Xc, {
          message: "Loading conversations\u2026"
        })
      });
    }
    if (M) {
      return xR.jsx(Bts, {
        children: xR.jsx(Xc, {
          message: "Resuming conversation\u2026"
        })
      });
    }
    return xR.jsx(Bts, {
      children: xR.jsx(fcr, {
        logs: ne,
        maxHeight: b,
        onCancel: be,
        onSelect: fe,
        onLogsChanged: oe ? () => ae(P) : undefined,
        onLoadMore: se,
        initialSearchQuery: d,
        isLoading: I,
        reloadGeneration: K,
        showAllProjects: P,
        onToggleAllProjects: de,
        onAgenticSearch: bcr
      })
    });
  }
  function Bts(e) {
    let t = J_r.c(3);
    let {
      children: n
    } = e;
    if (!qs()) {
      return n;
    }
    let r;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      r = Alt();
      t[0] = r;
    } else {
      r = t[0];
    }
    let o;
    if (t[1] !== n) {
      o = xR.jsx(vxt, {
        mouseTracking: r,
        children: n
      });
      t[1] = n;
      t[2] = o;
    } else {
      o = t[2];
    }
    return o;
  }
  function gHf(e) {
    let t = J_r.c(8);
    let {
      command: n
    } = e;
    let r;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      r = [];
      t[0] = r;
    } else {
      r = t[0];
    }
    useTimeout(yHf, 100, r);
    let o;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      o = xR.jsx(Text, {
        children: "This conversation is from a different directory."
      });
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      s = xR.jsx(Text, {
        children: "To resume, run:"
      });
      t[2] = s;
    } else {
      s = t[2];
    }
    let i;
    if (t[3] !== n) {
      i = xR.jsxs(gXd, {
        flexDirection: "column",
        children: [s, xR.jsxs(Text, {
          children: [" ", n]
        })]
      });
      t[3] = n;
      t[4] = i;
    } else {
      i = t[4];
    }
    let a;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      a = xR.jsx(Text, {
        dimColor: true,
        children: "(Command copied to clipboard)"
      });
      t[5] = a;
    } else {
      a = t[5];
    }
    let l;
    if (t[6] !== i) {
      l = xR.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [o, i, a]
      });
      t[6] = i;
      t[7] = l;
    } else {
      l = t[7];
    }
    return l;
  }
  function yHf() {
    process.exit(0);
  }
  function LiveBgMessage(e) {
    let t = J_r.c(11);
    let {
      sessionId: n,
      projectPath: r
    } = e;
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = [];
      t[0] = o;
    } else {
      o = t[0];
    }
    useTimeout(_Hf, 100, o);
    let s;
    if (t[1] !== r) {
      s = r && r !== getOriginalCwd() ? `cd ${Ja([r])} ${HGo()} ` : "";
      t[1] = r;
      t[2] = s;
    } else {
      s = t[2];
    }
    let i = s;
    let a;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      a = xR.jsx(Text, {
        children: "That session is still running as a background agent."
      });
      t[3] = a;
    } else {
      a = t[3];
    }
    let l;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      l = xR.jsxs(Text, {
        children: ["Open ", xR.jsx(Text, {
          bold: true,
          children: "claude agents"
        }), " to attach to it, or run:"]
      });
      t[4] = l;
    } else {
      l = t[4];
    }
    let c;
    if (t[5] !== i || t[6] !== n) {
      c = xR.jsxs(gXd, {
        flexDirection: "column",
        children: [l, xR.jsxs(Text, {
          children: [" ", i, "claude --resume ", n, " --fork-session"]
        })]
      });
      t[5] = i;
      t[6] = n;
      t[7] = c;
    } else {
      c = t[7];
    }
    let u;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      u = xR.jsx(Text, {
        dimColor: true,
        children: "to branch off a copy."
      });
      t[8] = u;
    } else {
      u = t[8];
    }
    let d;
    if (t[9] !== c) {
      d = xR.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [a, c, u]
      });
      t[9] = c;
      t[10] = d;
    } else {
      d = t[10];
    }
    return d;
  }
  function _Hf() {
    process.exit(0);
  }
  var J_r;
  var T4c;
  var CA;
  var xR;
  var C4c = __lazy(() => {
    ki();
    at();
    Pv();
    MBe();
    UGo();
    C$();
    hyr();
    v1n();
    Tg();
    et();
    ln();
    Ot();
    ho();
    D_();
    $Go();
    Fts();
    aon();
    yd();
    Pme();
    jGo();
    Eve();
    pr();
    dt();
    zp();
    Rn();
    ro();
    TXe();
    fa();
    dts();
    J_r = __toESM(pt(), 1);
    T4c = require("path");
    CA = __toESM(ot(), 1);
    xR = __toESM(ie(), 1);
  });
  async function R4c(e, t) {
    let {
      InvalidSettingsDialog: n
    } = await Promise.resolve().then(() => (y4c(), g4c));
    return AL(e, r => pRe.jsx(n, {
      settingsErrors: t.settingsErrors,
      onContinue: () => r(undefined),
      onFix: () => r("fix"),
      onExit: t.onExit
    }));
  }
  async function x4c(e) {
    let {
      TeleportResumeWrapper: t
    } = await Promise.resolve().then(() => (A9o(), Nec));
    return AL(e, n => pRe.jsx(t, {
      onComplete: n,
      onCancel: () => n(null),
      source: "cliArg"
    }));
  }
  async function k4c(e, t) {
    let {
      TeleportRepoMismatchDialog: n
    } = await Promise.resolve().then(() => (S4c(), b4c));
    return AL(e, r => pRe.jsx(n, {
      targetRepo: t.targetRepo,
      initialPaths: t.initialPaths,
      onSelectPath: r,
      onCancel: () => r(null)
    }));
  }
  async function A4c(e, t, n, r) {
    let [o, {
      ResumeConversation: s
    }, {
      App: i
    }] = await Promise.all([n, Promise.resolve().then(() => (C4c(), w4c)), Promise.resolve().then(() => (SJo(), bJo))]);
    await NXe(e, pRe.jsx(i, {
      getFpsMetrics: t.getFpsMetrics,
      stats: t.stats,
      initialState: t.initialState,
      children: pRe.jsx(KeybindingSetup, {
        children: pRe.jsx(s, {
          ...r,
          worktreePaths: o
        })
      })
    }));
  }
  var pRe;
  var I4c = __lazy(() => {
    Lts();
    C9();
    pRe = __toESM(ie(), 1);
  });
  function P4c(e) {
    let {
      effectiveModel: t,
      initialMainLoopModel: n,
      resolvedInitialModel: r,
      rawModelRequest: o,
      restrictedModel: s
    } = m3i({
      cli: {
        model: e.userSpecifiedModel,
        isNonInteractiveSession: getIsNonInteractiveSession()
      },
      env: process.env,
      settings: getInitialSettings() || {},
      agentFrontmatter: e.agentModel !== undefined ? {
        model: e.agentModel
      } : undefined
    });
    setMainLoopModelOverride(t);
    setInitialMainLoopModel(n);
    setResolvedOrgDefault(getResolvedOrgDefaultModel());
    aOe("--model", ["-m"], n);
    Pe("startup_resolve_model");
    return {
      effectiveModel: t,
      initialMainLoopModel: n,
      resolvedInitialModel: r,
      rawModelRequest: o,
      restrictedModel: s
    };
  }
  var O4c = __lazy(() => {
    at();
    E$t();
    zf();
    ln();
    Eo();
  });
  var D4c = __lazy(() => {
    v9e();
    $n();
    Ot();
    Gu();
    ci();
    Tm();
    Kp();
    Bve();
    Sl();
    vo();
    je();
    Fp();
    $A();
    pr();
    dt();
    CO();
    Rn();
    ro();
    BC();
    mmr();
    pgt();
    SDo();
    jz();
  });
  var M4c = __lazy(() => {
    $n();
    Ot();
    cJ();
    D4c();
    pgt();
    _Do();
    eQn();
    S_();
    oy();
    jz();
  });
  function N4c({
    deferToCleanup: e
  }) {
    let t = performance.now();
    let n = jBl();
    if (profileCheckpoint("action_after_plugins_init"), n.then(async () => {
      logEvent("tengu_timer", {
        event: "plugins_init",
        durationMs: Math.round(performance.now() - t),
        headless: e
      });
      await EBl();
      ngt();
    }), e) {
      return Ti(() => n);
    }
    return;
  }
  var L4c = __lazy(() => {
    Ot();
    hd();
    H4();
    p5();
    Qk();
    T6t();
  });
  var H4c = {};
  __export(H4c, {
    loadSettingsFromFlag: () => loadSettingsFromFlag,
    loadSettingSourcesFromFlag: () => loadSettingSourcesFromFlag,
    loadManagedSettingsFromFlag: () => loadManagedSettingsFromFlag,
    eagerLoadSettings: () => eagerLoadSettings
  });
  function loadSettingsFromFlag(e) {
    try {
      let t = e.trim();
      let n = t.startsWith("{") && t.endsWith("}");
      let r;
      if (n) {
        let o = Ba(t);
        if (!o) {
          return Es("Error: Invalid JSON provided to --settings");
        }
        let s = JSON.stringify(o).replace(/[\u007f-\u009f]/g, i => "\\u" + i.charCodeAt(0).toString(16).toUpperCase().padStart(4, "0"));
        r = olt("claude-settings", ".json", {
          contentHash: s
        });
        setFlagSettingsExpectedContent(s);
      } else {
        let {
          resolvedPath: o
        } = qd(zt(), e);
        try {
          F4c.readFileSync(o, "utf8");
        } catch (s) {
          if (fn(s)) {
            return Es(`Error: Settings file not found: ${o}`);
          }
          throw s;
        }
        r = o;
      }
      setFlagSettingsPath(r);
      o_();
    } catch (t) {
      if (t instanceof Error) {
        logForDebugging(`Error processing --settings: ${he(t)}`, {
          level: "error"
        });
      }
      return Es(`Error processing settings: ${he(t)}`);
    }
  }
  function loadManagedSettingsFromFlag(e) {
    let t = Ba(e.trim(), false);
    if (!t || typeof t !== "object" || Array.isArray(t)) {
      logForDebugging("--managed-settings ignored: invalid JSON object", {
        level: "warn"
      });
      return;
    }
    setParentManagedSettings(t);
    o_();
  }
  function loadSettingSourcesFromFlag(e) {
    try {
      let t = lPs(e);
      setAllowedSettingSources(t);
      o_();
    } catch (t) {
      if (t instanceof Error) {
        logForDebugging(`Invalid --setting-sources flag: ${he(t)}`, {
          level: "error"
        });
      }
      return Es(`Error processing --setting-sources: ${he(t)}`);
    }
  }
  function eagerLoadSettings() {
    let e = performance.now();
    profileCheckpoint("eagerLoadSettings_start");
    let t = bIn("--settings");
    if (t) {
      loadSettingsFromFlag(t);
    }
    let n = bIn("--managed-settings");
    if (n) {
      loadManagedSettingsFromFlag(n);
    }
    let r = bIn("--setting-sources");
    if (r !== undefined) {
      loadSettingSourcesFromFlag(r);
    }
    profileCheckpoint("eagerLoadSettings_end");
    au("settings_load_ms", performance.now() - e, e);
  }
  var F4c;
  var Hts = __lazy(() => {
    at();
    SL();
    nYr();
    je();
    dt();
    Gd();
    H4();
    R3();
    BC();
    nf();
    DA();
    F4c = require("fs");
  });
  function j4c() {
    return !li();
  }
  function q4c(e) {
    for (let t of e) {
      logForDebugging(`Invalid setting skipped without dialog (automated session): ${t.file ?? "settings"}: ${t.path}: ${t.message}`, {
        level: "error"
      });
    }
  }
  var W4c = __lazy(() => {
    yd();
    je();
  });
  function V4c(e, t) {
    if (rq()) {
      return;
    }
    if (Pc("hooks")) {
      return;
    }
    let n = bh();
    let r = $_();
    let o = new Set();
    for (let i of bC) {
      if (r && i !== "policySettings") {
        continue;
      }
      let a = getSettingsFilePathForSource(i);
      if (a) {
        let c = G4c.resolve(a);
        if (o.vZc(c)) {
          continue;
        }
        o.add(c);
      }
      let l = getSettingsForSource(i)?.hooks;
      if (!l) {
        continue;
      }
      for (let [c, u] of Object.entries(l)) {
        for (let d of u) {
          for (let p of d.hooks) {
            su("hook_registered", {
              hook_event: c,
              hook_type: p.type,
              hook_source: i,
              safe_mode: String(Ql()),
              ...(n && d.matcher && {
                hook_matcher: d.matcher
              })
            });
          }
        }
      }
    }
    let s = r && !Ql() ? AJ() : null;
    for (let i of e) {
      if (!i.hooksConfig) {
        continue;
      }
      if (r && !s?.vZc(i.source)) {
        continue;
      }
      let {
        marketplace: a
      } = Yo(i.repository);
      let l = hOe(kGe(i.name, a, t)) || n;
      for (let [c, u] of Object.entries(i.hooksConfig)) {
        for (let d of u) {
          for (let p of d.hooks) {
            su("hook_registered", {
              hook_event: c,
              hook_type: p.type,
              hook_source: "pluginHook",
              safe_mode: String(Ql()),
              "plugin.name": l ? i.name : "third-party",
              plugin_id_hash: PSe(i.name, a),
              ...(n && d.matcher && {
                hook_matcher: d.matcher
              })
            });
          }
        }
      }
    }
  }
  var G4c;
  var z4c = __lazy(() => {
    Gu();
    wb();
    gn();
    i1();
    ASe();
    H8();
    Kf();
    nf();
    yS();
    Wk();
    G4c = require("path");
  });
  function SHf() {
    return bHf ??= Object.keys(aQr().shape);
  }
  function THf(e) {
    let t = e && new Set(e.map(K4c));
    return Object.fromEntries(SHf().map(n => {
      let r = K4c(n);
      return [`has_${r}`, t?.vZc(r) ?? false];
    }));
  }
  async function Y4c(e, t, n) {
    let r = await getCommands(e);
    let o = s5a();
    let s = new Set(o);
    let i = [...r, ...o];
    let a = _9e(t, n);
    for (let l of i) {
      if (l.type !== "prompt") {
        continue;
      }
      if (l.source === "builtin") {
        continue;
      }
      logEvent("tengu_skill_loaded", {
        _PROTO_skill_name: l.name,
        ...false,
        ...OSe(l.source, l.loadedFrom, l.kind, l.createdBy),
        skill_budget: a,
        skill_content_chars: l.contentLength,
        model_invocable: isSkillToolCommand(l),
        is_conditional: s.vZc(l),
        ...THf(l.declaredFields),
        ...(l.pluginInfo && DSe(l.pluginInfo))
      });
    }
  }
  var bHf;
  var K4c = e => e.replaceAll("-", "_").replace(/([a-z])([A-Z])/g, "$1_$2").toLowerCase();
  var J4c = __lazy(() => {
    Bm();
    Ot();
    T9();
    S9e();
    Wk();
  });
  var X4c = __lazy(() => {
    mm();
    je();
  });
  function Z4c(e) {
    let {
      regularMcpConfigs: t,
      claudeaiConfigPromise: n,
      state: r
    } = e;
    let o = !Pl(process.env.MCP_CONNECTION_NONBLOCKING);
    setMcpConnectNonBlocking(o);
    let s = o;
    let i = d_u(t, u => u.alwaysLoad === true);
    let a = d_u(t, u => u.alwaysLoad !== true);
    let l = Object.keys(i).length > 0;
    async function c() {
      profileCheckpoint("before_mcp_connect_user");
      profileCheckpoint("before_mcp_connect_connector");
      let u = Promise.all([...(l ? [jts(false, () => qts(i, "regular-required", r), "--mcp-config alwaysLoad servers")] : []), jts(o, () => qts(a, "regular", r, s), "--mcp-config servers")]).then(() => profileCheckpoint("after_mcp_connect_user"));
      let d = jts(o, () => n.then(p => vHf({
        claudeaiConfigs: p,
        regularMcpConfigs: t,
        state: r,
        deferConnect: s
      })), "claude.ai connectors").then(() => profileCheckpoint("after_mcp_connect_connector"));
      await Promise.all([u, d]);
    }
    return {
      connect: c
    };
  }
  function qts(e, t, n, r = false) {
    let o = Object.keys(e);
    if (o.length === 0) {
      return [];
    }
    n.applyMcpUpdate(l => ({
      ...l,
      clients: [...l.clients, ...Object.entries(e).map(([c, u]) => ({
        name: c,
        type: "pending",
        config: u
      }))]
    }));
    let s = new Map();
    let i = o.map(l => new Promise(c => s.set(l, c)));
    let a = () => void z6e(l => {
      X_r(n, l);
      Pqa();
      s.get(l.client.name)?.();
    }, e).catch(l => logForDebugging(`[MCP] ${t} connect error: ${l}`)).finally(() => {
      for (let l of s.values()) {
        l();
      }
      Wts(e, n).catch(l => logForDebugging(`[MCP] ${t} retry error: ${l}`));
    });
    if (r) {
      setImmediate(a);
    } else {
      a();
    }
    return i;
  }
  function X_r(e, t) {
    let {
      client: n,
      tools: r,
      commands: o
    } = t;
    let s;
    e.applyMcpUpdate(i => {
      let a = i.clients.find(l => l.name === n.name);
      if (!a || !V6e(a.config, n.config)) {
        if (n.type === "connected") {
          dn(n.name, a ? "applyConnectionResult: disposing orphaned connect (slot config changed mid-flight)" : "applyConnectionResult: disposing orphaned connect (slot removed mid-flight)");
          s = () => {
            n.cleanup().catch(() => {});
            Ow(n.name, n.config).catch(() => {});
          };
        }
        return i;
      }
      return {
        ...i,
        clients: i.clients.map(l => l.name === n.name ? n : l),
        tools: gyp([...i.tools, ...r], "name"),
        commands: gyp([...i.commands, ...o], "name")
      };
    });
    s?.();
  }
  async function Wts(e, t) {
    let n = Object.entries(e);
    let r = () => n.filter(([s]) => {
      let i = t.getClients().find(a => a.name === s);
      return i !== undefined && AWn(i);
    });
    if (r().length === 0) {
      return;
    }
    for (let s of EHf) {
      await sleep(s);
      let i = r();
      if (i.length === 0) {
        logForDebugging("[MCP] Retry: all remote servers recovered, stopping");
        return;
      }
      logForDebugging(`[MCP] Retry: ${i.length} transiently-failed remote server(s) after ${s}ms backoff`);
      for (let [a, l] of i) {
        kM.cache.delete(W6e(a, l));
      }
      await z6e(a => X_r(t, a), Object.fromEntries(i));
    }
    let o = r();
    if (o.length > 0) {
      logForDebugging(`[MCP] Retry: ${o.length} remote server(s) still failed after all retries: ${o.map(([s]) => s).join(", ")}`);
    }
  }
  async function jts(e, t, n) {
    if (e) {
      Promise.resolve(t()).catch(() => {});
      logForDebugging(`[MCP] ${n} running fully async (nonblocking)`);
      return;
    }
    let r = t();
    let o = Date.now();
    let s;
    if (Array.isArray(r)) {
      s = r;
    } else {
      let c;
      let u = await Promise.race([r, new Promise(d => {
        c = setTimeout(p => p("deadline"), 1000, d);
      })]);
      if (clearTimeout(c), u === "deadline") {
        r.catch(() => {});
        logForDebugging(`[MCP] ${n} config fetch not ready after ${1000}ms \u2014 proceeding; background connection continues`);
        return;
      }
      s = u;
    }
    let i = XHa();
    let a = Math.max(0, i - (Date.now() - o));
    let l = await j3a(s, a);
    if (l > 0) {
      logForDebugging(`[MCP] ${n}: ${l}/${s.length} not ready after ${i}ms \u2014 proceeding; background connection continues`);
    }
  }
  async function vHf(e) {
    let {
      claudeaiConfigs: t,
      regularMcpConfigs: n,
      state: r,
      deferConnect: o
    } = e;
    if (Object.keys(t).length > 0) {
      let l = new Set();
      for (let u of Object.values(t)) {
        let d = getMcpServerSignature(u);
        if (d) {
          l.add(d);
        }
      }
      let c = new Set();
      for (let [u, d] of Object.entries(n)) {
        if (!u.startsWith("plugin:")) {
          continue;
        }
        let p = getMcpServerSignature(d);
        if (p && l.vZc(p)) {
          c.add(u);
        }
      }
      if (c.size > 0) {
        logForDebugging(`[MCP] Lazy dedup: suppressing ${c.size} plugin server(s) that duplicate claude.ai connectors: ${[...c].join(", ")}`);
        for (let u of r.getClients()) {
          if (!c.vZc(u.name) || u.type !== "connected") {
            continue;
          }
          u.client.onclose = undefined;
          Ow(u.name, u.config).catch(() => {});
        }
        r.applyMcpUpdate(u => {
          let {
            clients: d,
            tools: p,
            commands: m,
            resources: f
          } = u;
          d = d.filter(h => !c.vZc(h.name));
          p = p.filter(h => !h.mcpInfo || !c.vZc(h.mcpInfo.serverName));
          for (let h of c) {
            m = zft(m, h);
            f = Kft(f, h);
          }
          return {
            ...u,
            clients: d,
            tools: p,
            commands: m,
            resources: f
          };
        });
      }
    }
    let s = d_u(n, (l, c) => !c.startsWith("plugin:"));
    let {
      servers: i,
      suppressed: a
    } = await dedupClaudeAiMcpServers(t, s);
    r.applyMcpUpdate(l => suppressedConnectorsEqual(l.suppressedClaudeAiConnectors ?? [], a) ? l : {
      ...l,
      suppressedClaudeAiConnectors: a
    });
    return qts(i, "claudeai", r, o);
  }
  var EHf;
  var Gts = __lazy(() => {
    at();
    eA();
    Iw();
    Zft();
    G1();
    je();
    gn();
    Rn();
    H4();
    EHf = [500, 1500, 4000];
  });
  function eWc(e = wHf) {
    if (getAPIProvider() !== "firstParty") {
      return;
    }
    let t = getSettingsForSource("userSettings")?.model;
    if (!t) {
      return;
    }
    let n = ca(t);
    if (!Object.hasOwn(e, n)) {
      return;
    }
    let r = e[n];
    if (r === undefined) {
      return;
    }
    let o = n !== t;
    updateSettingsForSource("userSettings", {
      model: o ? `${r}[1m]` : r
    });
    logEvent("tengu_alias_migration", {
      from_model: sm(n),
      to_model: sm(r),
      has_1m: o
    });
  }
  var wHf;
  var tWc = __lazy(() => {
    Ot();
    cJ();
    Tk();
    Ds();
    wHf = {};
  });
  function nWc() {
    let e = getGlobalConfig();
    if (e.autoUpdates !== false || e.autoUpdatesProtectedForNative === true) {
      return;
    }
    try {
      let t = getSettingsForSource("userSettings") || {};
      updateSettingsForSource("userSettings", {
        ...t,
        env: {
          ...t.env,
          DISABLE_AUTOUPDATER: "1"
        }
      });
      logEvent("tengu_migrate_autoupdates_to_settings", {
        was_user_preference: true,
        already_had_env_var: !!t.env?.DISABLE_AUTOUPDATER
      });
      Me.set("DISABLE_AUTOUPDATER", true);
      saveGlobalConfig(n => {
        let {
          autoUpdates: r,
          autoUpdatesProtectedForNative: o,
          ...s
        } = n;
        return s;
      });
      Pe("migration_auto_updates_to_settings");
    } catch (t) {
      logForDebugging(`Failed to migrate auto-updates: ${t}`, {
        level: "error"
      });
      logEvent("tengu_migrate_autoupdates_error", {
        has_error: true
      });
      Ae("migration_auto_updates_to_settings", "migration_auto_updates_write_failed");
    }
  }
  var rWc = __lazy(() => {
    Ot();
    ln();
    je();
    d_();
  });
  function oWc() {
    if (!getGlobalConfig().bypassPermissionsModeAccepted) {
      return;
    }
    try {
      if (!hasSkipDangerousModePermissionPrompt()) {
        updateSettingsForSource("userSettings", {
          skipDangerousModePermissionPrompt: true
        });
      }
      logEvent("tengu_migrate_bypass_permissions_accepted", {});
      saveGlobalConfig(t => {
        if (!("bypassPermissionsModeAccepted" in t)) {
          return t;
        }
        let {
          bypassPermissionsModeAccepted: n,
          ...r
        } = t;
        return r;
      });
      Pe("migration_bypass_permissions_to_settings");
    } catch (t) {
      logForDebugging(`Failed to migrate bypass permissions accepted: ${t}`, {
        level: "error"
      });
      Ae("migration_bypass_permissions_to_settings", "migration_bypass_permissions_write_failed");
    }
  }
  var sWc = __lazy(() => {
    Ot();
    ln();
    je();
  });
  function iWc() {
    let e = getRawCurrentProjectConfigEntry();
    if (!e) {
      return;
    }
    let t = s => s !== undefined && (!Array.isArray(s) || s.length > 0);
    let n = e.enableAllProjectMcpServers !== undefined;
    let r = t(e.enabledMcpjsonServers);
    let o = t(e.disabledMcpjsonServers);
    if (!n && !r && !o) {
      return;
    }
    try {
      let s = getSettingsForSource("localSettings");
      if (getLocalSettingsValidationErrors().length > 0) {
        logForDebugging("migrateEnableAllProjectMcpServersToSettings: deferring \u2014 settings.local.json carries validation errors a write could compound; will retry next startup", {
          level: "error"
        });
        return;
      }
      let i = s ?? {};
      let a = {};
      let l = [];
      if (n) {
        if (e.enableAllProjectMcpServers === true && i.enableAllProjectMcpServers === undefined) {
          a.enableAllProjectMcpServers = true;
        }
        l.push("enableAllProjectMcpServers");
      }
      if (r) {
        if (Array.isArray(e.enabledMcpjsonServers)) {
          let c = i.enabledMcpjsonServers || [];
          let u = new Set(c);
          if (e.enabledMcpjsonServers.some(d => !u.vZc(d))) {
            a.enabledMcpjsonServers = Ro([...c, ...e.enabledMcpjsonServers]);
          }
        }
        l.push("enabledMcpjsonServers");
      }
      if (o) {
        if (Array.isArray(e.disabledMcpjsonServers)) {
          let c = i.disabledMcpjsonServers || [];
          let u = new Set(c);
          if (e.disabledMcpjsonServers.some(d => !u.vZc(d))) {
            a.disabledMcpjsonServers = Ro([...c, ...e.disabledMcpjsonServers]);
          }
        }
        l.push("disabledMcpjsonServers");
      }
      if (Object.keys(a).length > 0) {
        let {
          error: c
        } = updateSettingsForSource("localSettings", a);
        if (c) {
          logForDebugging(`migrateEnableAllProjectMcpServersToSettings: settings write failed (${c.message}); will retry next startup`, {
            level: "error"
          });
          return;
        }
      }
      if (l.length > 0) {
        if (!deleteCurrentProjectConfigFields(l)) {
          logForDebugging("migrateEnableAllProjectMcpServersToSettings: settings copy landed but legacy projectConfig fields could not be removed (unwritable config?); will retry next startup", {
            level: "error"
          });
          return;
        }
      }
      logEvent("tengu_migrate_mcp_approval_fields_success", {
        migratedCount: l.length
      });
      Pe("migration_mcp_servers_to_settings");
    } catch (s) {
      Oe(s);
      logEvent("tengu_migrate_mcp_approval_fields_error", {});
      Ae("migration_mcp_servers_to_settings", "migration_mcp_servers_unexpected_error");
    }
  }
  var aWc = __lazy(() => {
    Ot();
    ln();
    je();
    Rn();
  });
  function lWc() {
    if (getAPIProvider() !== "firstParty") {
      return;
    }
    if (!isLegacyModelRemapEnabled()) {
      return;
    }
    let e = getSettingsForSource("userSettings")?.model;
    if (e !== "claude-opus-4-20250514" && e !== "claude-opus-4-1-20250805" && e !== "claude-opus-4-0" && e !== "claude-opus-4-1") {
      return;
    }
    updateSettingsForSource("userSettings", {
      model: "opus"
    });
    saveGlobalConfig(t => ({
      ...t,
      legacyOpusMigrationTimestamp: Date.now()
    }));
    logEvent("tengu_legacy_opus_migration", {
      from_model: e
    });
    Pe("migration_legacy_opus_to_current");
  }
  var cWc = __lazy(() => {
    ln();
    Ot();
    Eo();
    Ds();
  });
  function uWc() {
    let e = getGlobalConfig();
    if (e.seenNotifications !== undefined) {
      return;
    }
    let t = {};
    for (let [n, r] of Object.entries(CHf)) {
      let o = e[r];
      if (typeof o === "number" && o > 0) {
        t[n] = o;
      } else if (o === true) {
        t[n] = 1;
      }
    }
    saveGlobalConfig(n => n.seenNotifications !== undefined ? n : {
      ...n,
      seenNotifications: t
    });
    Pe("migration_notification_dismissals");
  }
  var CHf;
  var dWc = __lazy(() => {
    ln();
    CHf = {
      "subscription-switch": "subscriptionNoticeCount"
    };
  });
  function pWc() {
    if (!isOpus1mMergeEnabled()) {
      return;
    }
    if (getSettingsForSource("userSettings")?.model !== "opus") {
      return;
    }
    let t = "opus[1m]";
    let n = parseUserSpecifiedModel(t) === parseUserSpecifiedModel(getDefaultMainLoopModelSetting()) ? undefined : t;
    updateSettingsForSource("userSettings", {
      model: n
    });
    logEvent("tengu_opus_to_opus1m_migration", {});
    Pe("migration_opus_to_opus1m");
  }
  var mWc = __lazy(() => {
    ln();
    Ot();
    Eo();
  });
  function fWc() {
    let e = false;
    if (saveGlobalConfig(t => {
      let n = t.replBridgeEnabled;
      if (n === undefined) {
        return t;
      }
      if (t.remoteControlAtStartup !== undefined) {
        return t;
      }
      let r = {
        ...t,
        remoteControlAtStartup: Boolean(n)
      };
      delete r.replBridgeEnabled;
      e = true;
      return r;
    }), e) {
      Pe("migration_repl_bridge_to_remote_control");
    }
  }
  var hWc = __lazy(() => {
    ln();
  });
  var gWc = __lazy(() => {
    Ot();
    cJ();
  });
  function yWc() {
    if (getGlobalConfig().sonnet1m45MigrationComplete) {
      return;
    }
    let t = false;
    if (getSettingsForSource("userSettings")?.model === "sonnet[1m]") {
      updateSettingsForSource("userSettings", {
        model: "sonnet-4-5-20250929[1m]"
      });
      t = true;
    }
    if (getMainLoopModelOverride() === "sonnet[1m]") {
      setMainLoopModelOverride("sonnet-4-5-20250929[1m]");
      t = true;
    }
    if (saveGlobalConfig(o => ({
      ...o,
      sonnet1m45MigrationComplete: true
    })), t) {
      Pe("migration_sonnet1m_to_sonnet45");
    }
  }
  var _Wc = __lazy(() => {
    at();
    ln();
  });
  function bWc() {
    if (getAPIProvider() !== "firstParty") {
      return;
    }
    if (!isProSubscriber() && !isMaxSubscriber() && !isTeamPremiumSubscriber()) {
      return;
    }
    let e = getSettingsForSource("userSettings")?.model;
    if (e !== "claude-sonnet-4-5-20250929" && e !== "claude-sonnet-4-5-20250929[1m]" && e !== "sonnet-4-5-20250929" && e !== "sonnet-4-5-20250929[1m]") {
      return;
    }
    let t = e.endsWith("[1m]");
    if (updateSettingsForSource("userSettings", {
      model: t ? "sonnet[1m]" : "sonnet"
    }), getGlobalConfig().numStartups > 1) {
      saveGlobalConfig(r => ({
        ...r,
        sonnet45To46MigrationTimestamp: Date.now()
      }));
    }
    logEvent("tengu_sonnet45_to_46_migration", {
      from_model: e,
      has_1m: t
    });
    Pe("migration_sonnet45_to_sonnet46");
  }
  var SWc = __lazy(() => {
    ln();
    Ot();
    no();
    Ds();
  });
  function TWc() {
    let e = getGlobalConfig();
    let t = getSettingsForSource("userSettings");
    let n = {};
    for (let r of Vat) {
      let o = e[r];
      if (o === undefined) {
        continue;
      }
      if (o === DEFAULT_GLOBAL_CONFIG[r]) {
        continue;
      }
      if (t?.[r] !== undefined) {
        continue;
      }
      n[r] = o;
    }
    if (Object.keys(n).length === 0) {
      return;
    }
    try {
      updateSettingsForSource("userSettings", n);
      logEvent("tengu_migrate_user_intent_to_settings", {
        migrated_count: Object.keys(n).length
      });
      Pe("migration_user_intent_to_settings");
    } catch (r) {
      Oe(Error(`Failed to migrate user-intent settings: ${r}`));
      Ae("migration_user_intent_to_settings", "migration_user_intent_write_failed");
    }
  }
  var EWc = __lazy(() => {
    ln();
    Ot();
    Rn();
    zg();
  });
  function vWc() {
    if (getGlobalConfig().hasResetAutoModeOptInForDefaultOffer) {
      return;
    }
    if (getAutoModeEnabledState() !== "enabled") {
      return;
    }
    try {
      let t = getSettingsForSource("userSettings");
      if (t?.skipAutoPermissionPrompt && t?.permissions?.defaultMode !== "auto") {
        updateSettingsForSource("userSettings", {
          skipAutoPermissionPrompt: undefined
        });
        logEvent("tengu_migrate_reset_auto_opt_in_for_default_offer", {});
        Pe("migration_reset_auto_mode_opt_in");
      }
      saveGlobalConfig(n => {
        if (n.hasResetAutoModeOptInForDefaultOffer) {
          return n;
        }
        return {
          ...n,
          hasResetAutoModeOptInForDefaultOffer: true
        };
      });
    } catch (t) {
      Oe(Error(`Failed to reset auto mode opt-in: ${t}`));
      Ae("migration_reset_auto_mode_opt_in", "migration_reset_auto_mode_write_failed");
    }
  }
  var wWc = __lazy(() => {
    Ot();
    ln();
    Rn();
    S_();
  });
  function CWc() {
    if (getGlobalConfig().opusProMigrationComplete) {
      return;
    }
    if (getAPIProvider() !== "firstParty" || !isProSubscriber()) {
      saveGlobalConfig(r => ({
        ...r,
        opusProMigrationComplete: true
      }));
      logEvent("tengu_reset_pro_to_opus_default", {
        skipped: true
      });
      return;
    }
    if (getInitialSettings()?.model === undefined) {
      let r = Date.now();
      saveGlobalConfig(o => ({
        ...o,
        opusProMigrationComplete: true,
        opusProMigrationTimestamp: r
      }));
      logEvent("tengu_reset_pro_to_opus_default", {
        skipped: false,
        had_custom_model: false
      });
    } else {
      saveGlobalConfig(r => ({
        ...r,
        opusProMigrationComplete: true
      }));
      logEvent("tengu_reset_pro_to_opus_default", {
        skipped: false,
        had_custom_model: true
      });
    }
    Pe("migration_reset_pro_to_opus_default");
  }
  var RWc = __lazy(() => {
    Ot();
    ln();
    no();
    Ds();
  });
  function kWc({
    remote: e,
    isNonInteractiveSession: t,
    isContinue: n,
    pendingAssistantChat: r,
    pendingConnectUrl: o,
    pendingSSHHost: s
  }) {
    if (t) {
      return false;
    }
    if (n) {
      return false;
    }
    return e !== null || Boolean(r?.sessionId) || Boolean(r?.discover) || Boolean(o) || Boolean(s);
  }
  function AWc(e, t) {
    return e ? null : t;
  }
  function Vts(e) {
    if (xWc.test(e)) {
      return e;
    }
    if (e.includes("/") && !/\s/.test(e)) {
      for (let t of e.split(/[/?#]/)) {
        if (xWc.test(t)) {
          return t;
        }
      }
    }
    return null;
  }
  var xWc;
  var IWc = __lazy(() => {
    xWc = /^(?:session|cse)_[A-Za-z0-9_]+$/;
  });
  var RHf;
  var PWc = __lazy(() => {
    RHf = we(() => v.object({
      session_id: v.string(),
      ws_url: v.string(),
      work_dir: v.string().optional()
    }));
  });
  var OWc = __lazy(() => {
    pk();
    dt();
    PWc();
  });
  class dsn {
    onStateChanged;
    onWaitingOnUserChanged;
    onTurnStarting;
    onMetadataChanged;
    onInternalMetadataChanged;
    onPermissionModeChanged;
    onActiveGoalChanged;
    currentState = "idle";
    hasPendingAction = false;
    hasTaskSummary = false;
    hasTerminalGoalSnapshot = false;
    mainLoopRefcount = 0;
    lastWaitingOnUser = false;
    getState() {
      return this.currentState;
    }
    get waitingOnUser() {
      return this.currentState === "requires_action" && this.mainLoopRefcount === 0;
    }
    setMainLoopRefcount(e) {
      this.mainLoopRefcount = e;
      this.emitIfWaitingChanged();
    }
    emitIfWaitingChanged() {
      let e = this.waitingOnUser;
      if (e !== this.lastWaitingOnUser) {
        this.lastWaitingOnUser = e;
        this.onWaitingOnUserChanged?.(e);
      }
    }
    reteeWaitingOnUser() {
      this.onWaitingOnUserChanged?.(this.waitingOnUser);
    }
    notifyTurnStarting() {
      this.onTurnStarting?.();
    }
    notifyStateChanged(e, t) {
      if (this.currentState = e, this.lastWaitingOnUser = this.waitingOnUser, this.onStateChanged?.(e, t), e === "requires_action" && t) {
        this.hasPendingAction = true;
        this.onMetadataChanged?.({
          pending_action: t
        });
      } else if (this.hasPendingAction) {
        this.hasPendingAction = false;
        this.onMetadataChanged?.({
          pending_action: null
        });
      }
      if (e === "running") {
        if (this.onMetadataChanged?.({
          post_turn_summary: null,
          recap: null
        }), this.hasTerminalGoalSnapshot) {
          this.hasTerminalGoalSnapshot = false;
          this.onMetadataChanged?.({
            goal: null
          });
        }
      }
      if (e === "idle" && this.hasTaskSummary) {
        this.hasTaskSummary = false;
        this.notifyMetadataChanged({
          task_summary: null
        });
      }
      if (st(process.env.CLAUDE_CODE_EMIT_SESSION_STATE_EVENTS)) {
        vw({
          type: "system",
          subtype: "session_state_changed",
          state: e
        });
      }
    }
    republishPendingAction(e) {
      this.hasPendingAction = true;
      this.onMetadataChanged?.({
        pending_action: e
      });
    }
    notifyMetadataChanged(e) {
      if (this.onMetadataChanged?.(e), "goal" in e) {
        this.hasTerminalGoalSnapshot = e.goal?.met === true;
      }
      if ("task_summary" in e) {
        if (e.task_summary != null) {
          this.hasTaskSummary = true;
        }
        vw({
          type: "system",
          subtype: "task_summary",
          detail: e.task_summary ?? null
        });
      }
    }
    notifyPermissionModeChanged(e) {
      this.onPermissionModeChanged?.(e);
    }
    notifyInternalMetadataChanged(e) {
      this.onInternalMetadataChanged?.(e);
    }
    notifyActiveGoalChanged(e) {
      this.onActiveGoalChanged?.(e);
    }
  }
  function DWc(e) {
    return `<system-reminder>
The container was restarted. The following background tasks were running and are now stopped:
${e.map(n => `- ${n.description || "(no description)"} (task ${n.task_id})`).join(`
`)}
Re-create them if still needed.
</system-reminder>`;
  }
  var Q_r = __lazy(() => {
    gn();
  });
  var MWc = __lazy(() => {
    ln();
    bg();
    dt();
    nXn();
  });
  var FWc = {};