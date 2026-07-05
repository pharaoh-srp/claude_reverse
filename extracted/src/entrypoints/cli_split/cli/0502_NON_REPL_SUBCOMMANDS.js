  __export(SQc, {
    NON_REPL_SUBCOMMANDS: () => NON_REPL_SUBCOMMANDS
  });
  var NON_REPL_SUBCOMMANDS;
  var TQc = __lazy(() => {
    NON_REPL_SUBCOMMANDS = new Set(["update", "upgrade"]);
  });
  process.env.NoDefaultCurrentDirectoryInExePath = "1";
  process.env.COREPACK_ENABLE_AUTO_PIN = "0";
  van();
  if (process.env.CLAUDE_CODE_REMOTE === "true") {
    let e = process.env.NODE_OPTIONS || "";
    process.env.NODE_OPTIONS = e ? `${e} --max-old-space-size=8192` : "--max-old-space-size=8192";
  }
  function EQc(e) {
    for (let t = 0; t < e.length; t++) {
      let n = e[t];
      if (n === "--debug" || n === "-d" || n === "--debug-to-stderr" || n === "-d2e" || n.startsWith("--debug=") || n.startsWith("--debug-file=")) {
        continue;
      }
      if (n === "--debug-file" && t + 1 < e.length) {
        t++;
        continue;
      }
      return false;
    }
    return true;
  }
  function WVf(e) {
    let t;
    let n;
    let r;
    let o;
    let s;
    let i = [];
    for (let a = 0; a < e.length; a++) {
      let l = e[a];
      let c = l.indexOf("=");
      let [u, d] = c > 0 ? [l.slice(0, c), l.slice(c + 1)] : [l, undefined];
      let p = d !== undefined || a + 1 < e.length;
      if (u === "--dangerously-skip-permissions") {
        t = "bypassPermissions";
      } else if (u === "--allow-dangerously-skip-permissions") {
        s = true;
      } else if (u === "--permission-mode" && p) {
        t = d ?? e[++a];
      } else if (u === "--model" && p) {
        n = d ?? e[++a];
      } else if (u === "--effort" && p) {
        r = d ?? e[++a];
      } else if (u === "--agent" && p) {
        o = d ?? e[++a];
      } else {
        i.push(l);
      }
    }
    return {
      dispatchDefaults: t || n || r || o || s ? {
        permissionMode: t,
        model: n,
        effort: r,
        agent: o,
        allowBypass: s
      } : undefined,
      rest: i
    };
  }
  async function GVf() {
    let e = Ean(process.argv);
    if (e) {
      console.error(e);
      process.exit(1);
    }
    let t = process.argv.slice(2);
    if ((t.length === 1 || t.length === 2 && t[1] === "--verbose") && (t[0] === "--version" || t[0] === "-v" || t[0] === "-V")) {
      if (console.log(`${{
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION} (Claude Code)${ej()}`), t.length === 2 && {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.GIT_SHA) {
        console.log(`Commit: ${{
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.GIT_SHA}`);
      }
      return;
    }
    let {
      profileCheckpoint: n
    } = await Promise.resolve().then(() => (H4(), Sms));
    if (n("cli_entry"), process.argv[2] === "--claude-in-chrome-mcp") {
      n("cli_claude_in_chrome_mcp_path");
      let {
        runClaudeInChromeMcpServer: m
      } = await Promise.resolve().then(() => (tEo(), eEo));
      await m();
      return;
    } else if (process.argv[2] === "--chrome-native-host") {
      n("cli_chrome_native_host_path");
      let {
        runChromeNativeHost: m
      } = await Promise.resolve().then(() => (m_c(), p_c));
      await m();
      return;
    } else if (process.argv[2] === "--computer-use-mcp") {
      n("cli_computer_use_mcp_path");
      let {
        runComputerUseMcpServer: m
      } = await Promise.resolve().then(() => (HTo(), $To));
      await m();
      return;
    }
    if (t[0] === "--daemon-worker") {
      let {
        loadFastPathPolicy: m
      } = await Promise.resolve().then(() => (bhe(), UCe));
      let f = await m();
      if (f) {
        process.stderr.write(`${f}
`);
      }
      let {
        runDaemonWorker: h
      } = await Promise.resolve().then(() => (Itn(), Wuc));
      await h(t[1]);
      return;
    }
    if (t[0] === "--bg-pty-host") {
      let {
        ensureFastPathSettingsLoaded: m
      } = await Promise.resolve().then(() => (bhe(), UCe));
      try {
        await m();
      } catch (h) {
        process.stderr.write(`ptyHost: settings bootstrap threw (continuing; supervisor already gated): ${h?.stack ?? String(h)}
`);
      }
      let {
        runPtyHost: f
      } = await Promise.resolve().then(() => (C_c(), w_c));
      await f(t.slice(1));
      return;
    }
    if (t[0] === "--bg-spare") {
      let {
        ensureFastPathSettingsLoaded: m
      } = await Promise.resolve().then(() => (bhe(), UCe));
      await m();
      let {
        runBgSpare: f
      } = await Promise.resolve().then(() => (his(), FXc));
      await f(t.slice(1));
      return;
    }
    if (t[0] === "--preload") {
      let {
        ensureFastPathSettingsLoaded: m
      } = await Promise.resolve().then(() => (bhe(), UCe));
      await m();
      let {
        runPreload: f
      } = await Promise.resolve().then(() => (jXc(), HXc));
      await f(t.slice(1));
      return;
    }
    if (t[0] === "remote-control" || t[0] === "rc" || t[0] === "remote" || t[0] === "sync" || t[0] === "bridge") {
      n("cli_bridge_path");
      let {
        loadFastPathPolicy: m
      } = await Promise.resolve().then(() => (bhe(), UCe));
      {
        let N = await m();
        if (N) {
          let {
            exitWithError: W
          } = await Promise.resolve().then(() => (OD(), F$e));
          W(N);
        }
      }
      let {
        getBridgeDisabledReason: f,
        checkBridgeMinVersion: h,
        getBridgeAuthDebugInfo: g
      } = await Promise.resolve().then(() => (Ox(), Lmr));
      let {
        BRIDGE_LOGIN_ERROR: y
      } = await Promise.resolve().then(() => fbl);
      let {
        bridgeMain: _
      } = await Promise.resolve().then(() => (Ldr(), Ndr));
      let {
        exitWithError: b
      } = await Promise.resolve().then(() => (OD(), F$e));
      let {
        getSettingsWithErrors: S
      } = await Promise.resolve().then(() => (mr(), yY));
      if (S().settings.disableRemoteControl === true) {
        b("Error: Remote Control is disabled by your organization's policy (managed setting `disableRemoteControl`).");
      }
      let {
        hasStoredOAuthToken: E
      } = await Promise.resolve().then(() => (no(), v2));
      if (!E()) {
        b(y + g());
      }
      let C = await f();
      if (C) {
        b(`Error: ${C}` + g());
      }
      let x = h();
      if (x) {
        b(x);
      }
      let {
        waitForPolicyLimitsToLoad: A
      } = await Promise.resolve().then(() => (q$(), G6t));
      let {
        isPolicyAllowed: k
      } = await Promise.resolve().then(() => (Kc(), f$t));
      if (await A(), !k("allow_remote_control")) {
        b("Error: Remote Control is disabled by your organization's policy.");
      }
      let [{
        initSinks: I
      }, {
        initialize1PEventLogging: O,
        shutdown1PEventLogging: M
      }, {
        shutdownDatadog: L
      }, {
        sleep: P
      }] = await Promise.all([Promise.resolve().then(() => (TJe(), KCt)), Promise.resolve().then(() => (BF(), z4e)), Promise.resolve().then(() => (xJ(), OGt)), Promise.resolve().then(() => tDt)]);
      I();
      O();
      let {
        getTrustedDeviceUnenrolledReason: F,
        enrollTrustedDeviceIfNeeded: H
      } = await Promise.resolve().then(() => (CQ(), k5n));
      await H();
      let U = await F();
      if (U) {
        await Promise.race([Promise.all([M(), L()]), P(500, undefined, {
          unref: true
        })]).catch(() => {});
        b(`Error: ${U}`);
      }
      await _(t.slice(1));
      return;
    }
    if (t[0] === "daemon") {
      n("cli_daemon_path");
      let {
        ensureFastPathSettingsLoaded: m
      } = await Promise.resolve().then(() => (bhe(), UCe));
      await m();
      let {
        initSinks: f
      } = await Promise.resolve().then(() => (TJe(), KCt));
      f();
      let {
        daemonMain: h
      } = await Promise.resolve().then(() => (bQc(), _Qc));
      await h(t.slice(1));
      return;
    }
    if (t[0] === "logs" || t[0] === "attach" || t[0] === "stop" || t[0] === "kill" || t[0] === "respawn" || t[0] === "rm" || t.includes("--bg") || t.includes("--background")) {
      n("cli_bg_path");
      let {
        loadFastPathPolicy: m
      } = await Promise.resolve().then(() => (bhe(), UCe));
      {
        let g = await m();
        let y = ["logs", "stop", "kill", "rm"].includes(t[0] ?? "");
        if (g) {
          if (y) {
            process.stderr.write(`${g}
`);
          } else {
            let {
              exitWithError: _
            } = await Promise.resolve().then(() => (OD(), F$e));
            _(g);
          }
        }
      }
      let f = await Promise.resolve().then(() => (uT(), hDn));
      if (await f.ensureFleetGateHydrated(), !f.isAgentsFleetEnabled()) {
        let g = t[0];
        let y = g !== undefined && ["logs", "attach", "stop", "kill", "respawn", "rm"].includes(g) ? g : t.find(_ => _ === "--bg" || _ === "--background" || _ === "--routine" || _.startsWith("--routine=")) ?? "--bg";
        return f.fleetGateRejected(y);
      }
      let h = await Promise.resolve().then(() => (Qen(), dic));
      switch (t[0]) {
        case "logs":
        case "attach":
        case "stop":
        case "kill":
        case "respawn":
        case "rm":
          {
            let [{
              initializeAnalyticsSink: g
            }, {
              initialize1PEventLogging: y,
              shutdown1PEventLogging: _
            }, {
              shutdownDatadog: b
            }, {
              sleep: S
            }] = await Promise.all([Promise.resolve().then(() => (TEe(), dht)), Promise.resolve().then(() => (BF(), z4e)), Promise.resolve().then(() => (xJ(), OGt)), Promise.resolve().then(() => tDt)]);
            if (g(), y(), t[0] === "logs") {
              await h.logsHandler(t[1]);
            } else if (t[0] === "attach") {
              await h.attachHandler(t[1]);
            } else if (t[0] === "respawn") {
              await h.respawnHandler(t[1]);
            } else if (t[0] === "rm") {
              await h.rmHandler(t[1]);
            } else {
              await h.stopHandler(t[1]);
            }
            await Promise.race([Promise.all([_(), b()]), S(500, undefined, {
              unref: true
            })]).catch(() => {});
            return process.exit(process.exitCode ?? 0);
          }
        default:
          {
            let [{
              initializeAnalyticsSink: g
            }, {
              initialize1PEventLogging: y,
              shutdown1PEventLogging: _
            }, {
              shutdownDatadog: b
            }, {
              logEvent: S
            }, {
              sleep: E
            }] = await Promise.all([Promise.resolve().then(() => (TEe(), dht)), Promise.resolve().then(() => (BF(), z4e)), Promise.resolve().then(() => (xJ(), OGt)), Promise.resolve().then(() => (Ot(), S0t)), Promise.resolve().then(() => tDt)]);
            g();
            y();
            S("tengu_background", {
              via_flag: true,
              via: "flag"
            });
            await h.handleBgFlag(t);
            await Promise.race([Promise.all([_(), b()]), E(500, undefined, {
              unref: true
            })]).catch(() => {});
            process.exit(process.exitCode ?? 0);
          }
      }
      return;
    }
    let r = Tan(t);
    let {
      dispatchDefaults: o,
      rest: s
    } = WVf(r.rest);
    let i = r.hasAgentsPositional && EQc(s);
    if ((i || EQc(t) && process.stdin.isTTY) && process.stdout.isTTY) {
      let {
        startCapturingEarlyInput: m,
        consumeEarlyInput: f
      } = await Promise.resolve().then(() => (cPe(), _eo));
      m();
      let {
        enableConfigs: h,
        getGlobalConfig: g
      } = await Promise.resolve().then(() => (Jn(), bz));
      let y = false;
      let _ = false;
      try {
        h();
        _ = g().defaultToAgentsView === true;
        y = i || _;
      } catch {}
      if (y) {
        if (r.config.settings) {
          let {
            loadSettingsFromFlag: k
          } = await Promise.resolve().then(() => (Hts(), H4c));
          k(r.config.settings);
        }
        if (r.config.pluginDir.length > 0 || r.config.pluginDirNoMcp.length > 0) {
          let [{
            setInlinePlugins: k,
            setInlinePluginsNoMcp: I
          }, {
            clearPluginCache: O
          }] = await Promise.all([Promise.resolve().then(() => (at(), dxe)), Promise.resolve().then(() => (xg(), A2l))]);
          k(r.config.pluginDir);
          I(r.config.pluginDirNoMcp);
          O("claude agents --plugin-dir");
        }
        let {
          loadFastPathPolicy: b
        } = await Promise.resolve().then(() => (bhe(), UCe));
        let S = await b();
        if (S) {
          let {
            exitWithError: k
          } = await Promise.resolve().then(() => (OD(), F$e));
          k(S);
        }
        {
          let {
            areSideloadFlagsDisabledByPolicy: k,
            sideloadFlagsBlockedMessage: I
          } = await Promise.resolve().then(() => (Xk(), zAa));
          if (k()) {
            let O = [];
            if (r.config.pluginDir.length > 0) {
              O.push("--plugin-dir");
            }
            if (r.config.pluginDirNoMcp.length > 0) {
              O.push("--plugin-dir-no-mcp");
            }
            if (O.length > 0) {
              let {
                exitWithError: M
              } = await Promise.resolve().then(() => (OD(), F$e));
              M(I(O));
            }
          }
        }
        let {
          isAgentsFleetEnabled: E,
          ensureFleetGateHydrated: C,
          fleetGateRejected: x,
          consumeAgentViewRelaunchMarker: A
        } = await Promise.resolve().then(() => (uT(), hDn));
        if (await C({
          kickGrowthBook: false
        }), E()) {
          let [{
            applyFleetViewHostWindowsEnv: k
          }, {
            createRoot: I
          }, {
            getBaseRenderOptions: O
          }, {
            resolve: M
          }, {
            setIsInteractive: L,
            setSessionStartType: P
          }] = await Promise.all([Promise.resolve().then(() => (wxt(), xon)), Promise.resolve().then(() => (et(), fG)), Promise.resolve().then(() => (Qoe(), p6n)), import("path"), Promise.resolve().then(() => (at(), dxe))]);
          let F = A();
          L(true);
          P("agents_view");
          let H = () => {};
          process.on("unhandledRejection", H);
          let U = Promise.resolve();
          setImmediate(() => {
            U = Promise.all([Promise.resolve().then(() => (lm(), NGt)), Promise.resolve().then(() => (gtn(), ydr)), Promise.resolve().then(() => (TEe(), dht)), Promise.resolve().then(() => (BF(), z4e)), Promise.resolve().then(() => (Ot(), S0t)), Promise.resolve().then(() => (mE(), sza)), Promise.resolve().then(() => ($n(), aDn)), Promise.resolve().then(() => (Afr(), NEc)), Promise.resolve().then(() => (Jn(), bz)), Promise.resolve().then(() => (qEe(), vCo))]).then(([{
              setupGracefulShutdown: K
            }, {
              initializeErrorLogSink: J
            }, {
              initializeAnalyticsSink: Q
            }, {
              initialize1PEventLogging: Z
            }, {
              logEvent: ne
            }, {
              captureTeammateModeSnapshotIfEnabled: oe
            }, {
              initializeGrowthBook: ee
            }, {
              initializeTelemetryAfterTrust: re
            }, {
              checkHasTrustDialogAccepted: se
            }, {
              applyConfigEnvironmentVariables: ae
            }]) => {
              if (K(), ee().catch(() => {}), J(), Q(), Z(), se()) {
                ae();
                re();
              }
              ne("tengu_fleetview", {
                defaultToAgentsView: _,
                relaunch: F
              });
              return oe();
            }).finally(() => process.off("unhandledRejection", H));
            Promise.resolve().then(() => (ron(), xgr)).then(K => K.startBackgroundHousekeeping());
          });
          f();
          k();
          let N = o?.permissionMode === "bypassPermissions" || o?.allowBypass ? await Promise.resolve().then(() => (iis(), sis)) : undefined;
          N?.refuseBypassUnderRoot(o);
          let W = N?.applyBypassPolicyGate(o) ?? o;
          let j = await I(O(false));
          if (N) {
            await N.ensureAgentsBypassConsent(j, W);
          }
          let z = {
            cwdFilter: r.cwdFilter,
            dispatchExtraArgs: FQe(LQe(r.config, M)),
            dispatchDefaults: W
          };
          {
            let {
              mountFleetViewWithComposerBack: K
            } = await Promise.resolve().then(() => (Non(), Mon));
            await K(j, z);
          }
          await U.catch(() => {});
          let {
            gracefulShutdown: V
          } = await Promise.resolve().then(() => (lm(), NGt));
          await V(0, "other", {
            suppressResumeHint: true
          });
          return;
        }
        if (i) {
          return x("claude agents");
        }
      }
    }
    if ((t.includes("--tmux") || t.includes("--tmux=classic")) && (t.includes("-w") || t.includes("--worktree") || t.some(m => m.startsWith("--worktree=")))) {
      n("cli_tmux_worktree_fast_path");
      let {
        enableConfigs: m
      } = await Promise.resolve().then(() => (Jn(), bz));
      m();
      let {
        isWorktreeModeEnabled: f
      } = await Promise.resolve().then(() => yDl);
      if (f()) {
        let {
          execIntoTmuxWorktree: h
        } = await Promise.resolve().then(() => (iP(), ohc));
        let g = await h(t);
        if (g.handled) {
          return;
        }
        if (g.error) {
          let {
            exitWithError: y
          } = await Promise.resolve().then(() => (OD(), F$e));
          y(g.error);
        }
      }
    }
    if (t.length === 1 && (t[0] === "--update" || t[0] === "--upgrade")) {
      process.argv = [process.argv[0], process.argv[1], "update"];
    }
    let l = t.indexOf("--");
    if ((l === -1 ? t : t.slice(0, l)).includes("--bare")) {
      process.env.CLAUDE_CODE_SIMPLE = "1";
    }
    let {
      NON_REPL_SUBCOMMANDS: c
    } = await Promise.resolve().then(() => (TQc(), SQc));
    if (!c.vZc(process.argv[2] ?? "")) {
      let {
        startCapturingEarlyInput: m
      } = await Promise.resolve().then(() => (cPe(), _eo));
      m();
    }
    let [{
      startMdmRawRead: u
    }, {
      startKeychainPrefetch: d
    }] = await Promise.all([Promise.resolve().then(() => ($yn(), YOs)), Promise.resolve().then(() => (_st(), ymi))]);
    u();
    d();
    n("cli_before_main_import");
    let {
      main: p
    } = await Promise.resolve().then(() => (usn(), XSr));
    n("cli_after_main_import");
    await p();
    n("cli_after_main_complete");
  }
  GVf();