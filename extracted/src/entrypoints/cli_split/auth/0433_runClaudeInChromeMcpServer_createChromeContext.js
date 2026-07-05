  __export(eEo, {
    runClaudeInChromeMcpServer: () => runClaudeInChromeMcpServer,
    createChromeContext: () => createChromeContext
  });
  function r_f(e) {
    return o_c.some(t => t === e);
  }
  function o_f() {
    if (st(process.env.USE_LOCAL_OAUTH) || st(process.env.LOCAL_BRIDGE)) {
      return "ws://localhost:8765";
    }
    if (st(process.env.USE_STAGING_OAUTH)) {
      return "wss://bridge-staging.claudeusercontent.com";
    }
    return "wss://bridge.claudeusercontent.com";
  }
  function s_f() {
    return st(process.env.USE_LOCAL_OAUTH) || st(process.env.LOCAL_BRIDGE);
  }
  function createChromeContext(e) {
    let t = new i_c();
    let n = o_f();
    t.info(`Bridge URL: ${n}`);
    let r;
    let o = false;
    let s = e?.CLAUDE_CHROME_PERMISSION_MODE ?? process.env.CLAUDE_CHROME_PERMISSION_MODE;
    let i;
    if (s) {
      if (r_f(s)) {
        i = s;
      } else {
        t.warn(`Invalid CLAUDE_CHROME_PERMISSION_MODE "${s}". Valid values: ${o_c.join(", ")}`);
      }
    }
    return {
      serverName: "Claude in Chrome",
      logger: t,
      socketPath: getSecureSocketPath(),
      getSocketPaths: getAllSocketPaths,
      clientTypeId: "claude-code",
      onAuthenticationError: () => {
        t.warn("Authentication error occurred. Please ensure you are logged into the Claude browser extension with the same claude.ai account as Claude Code.");
      },
      onToolCallDisconnected: () => {
        if (o) {
          return `Browser extension is not connected: the OAuth token Claude Code is using belongs to a different claude.ai account than the one Claude Code is logged in as. If CLAUDE_CODE_OAUTH_TOKEN is set in your shell or CI profile, unset it (or re-mint it for this account), then run /logout and /login in Claude Code and make sure the browser extension is signed into the same claude.ai account. If you continue to experience issues, please report a bug: ${"https://github.com/anthropics/claude-code/issues/new?labels=bug,claude-in-chrome"}`;
        }
        return `Browser extension is not connected. Please ensure the Claude browser extension is installed and running (${"https://claude.ai/chrome"}), and that you are logged into claude.ai with the same account as Claude Code. If this is your first time connecting to Chrome, you may need to restart Chrome for the installation to take effect. If you continue to experience issues, please report a bug: ${"https://github.com/anthropics/claude-code/issues/new?labels=bug,claude-in-chrome"}`;
      },
      onExtensionPaired: (a, l) => {
        saveGlobalConfig(c => {
          if (c.chromeExtension?.pairedDeviceId === a && c.chromeExtension?.pairedDeviceName === l) {
            return c;
          }
          return {
            ...c,
            chromeExtension: {
              pairedDeviceId: a,
              pairedDeviceName: l
            }
          };
        });
        t.info(`Paired with "${l}" (${a.slice(0, 8)})`);
      },
      getPersistedDeviceId: () => getGlobalConfig().chromeExtension?.pairedDeviceId,
      askUserToolName: "AskUserQuestion",
      bridgeConfig: {
        url: n,
        getUserId: async () => {
          let a = getGlobalConfig().oauthAccount?.accountUuid || process.env.CLAUDE_CODE_ACCOUNT_UUID;
          if (getAPIProvider() !== "firstParty") {
            o = false;
            return a;
          }
          await checkAndRefreshOAuthTokenIfNeeded().catch(() => {});
          let l = getClaudeAIOAuthTokens()?.accessToken;
          if (!l) {
            o = false;
            return a;
          }
          if (r?.token !== l) {
            let d = await uwn(l).catch(() => {
              return;
            });
            if (!d?.account_uuid) {
              o = false;
              return a;
            }
            r = {
              token: l,
              accountUuid: d.account_uuid.toLowerCase()
            };
          }
          let c = r.accountUuid;
          let u = a !== undefined && a.toLowerCase() !== c;
          if (u && !o) {
            logEvent("tengu_chrome_bridge_account_mismatch", {
              has_env_token: Boolean(Me.CLAUDE_CODE_OAUTH_TOKEN),
              persisted_from_config: Boolean(getGlobalConfig().oauthAccount?.accountUuid)
            });
            t.warn("The OAuth token in use resolves to a different claude.ai account than the persisted Claude Code login. Using the token-derived account for the browser bridge. If CLAUDE_CODE_OAUTH_TOKEN is set, unset it or re-mint it for this account, then /logout and /login.");
          }
          o = u;
          return c;
        },
        getOAuthToken: async () => (await checkAndRefreshOAuthTokenIfNeeded().catch(() => {}), getClaudeAIOAuthTokens()?.accessToken ?? ""),
        getWsOptions: () => {
          let a = getWebSocketTLSOptions();
          let l = getWebSocketProxyUrl(n);
          if (!a && !l) {
            return;
          }
          return {
            ...a,
            ...(l && {
              proxy: l
            })
          };
        },
        ...(s_f() && {
          devUserId: "dev_user_local"
        })
      },
      ...(i && {
        initialPermissionMode: i
      }),
      ...false,
      trackEvent: (a, l) => {
        let c = {};
        if (l) {
          for (let [u, d] of Object.entries(l)) {
            let p = u === "status" ? "bridge_status" : u;
            if (typeof d === "boolean" || typeof d === "number") {
              c[p] = d;
            } else if (typeof d === "string" && n_f.vZc(p)) {
              c[p] = d;
            }
          }
        }
        logEvent(a, c);
      }
    };
  }
  async function runClaudeInChromeMcpServer() {
    return vl("chrome_mcp_server_start", async () => {
      enableConfigs();
      initializeAnalyticsSink();
      let e = createChromeContext();
      let t = createClaudeForChromeMcpServer(e);
      let n = new SHe();
      let r = false;
      let o = async () => {
        if (r) {
          return;
        }
        r = true;
        await shutdown1PEventLogging();
        await shutdownDatadog();
        process.exit(0);
      };
      process.stdin.on("end", () => void o());
      process.stdin.on("error", () => void o());
      logForDebugging("[Claude in Chrome] Starting MCP server");
      await t.connect(n);
      logForDebugging("[Claude in Chrome] MCP server started");
    });
  }
  class i_c {
    silly(e, ...t) {
      logForDebugging(vRt.format(e, ...t), {
        level: "debug"
      });
    }
    debug(e, ...t) {
      logForDebugging(vRt.format(e, ...t), {
        level: "debug"
      });
    }
    info(e, ...t) {
      logForDebugging(vRt.format(e, ...t), {
        level: "info"
      });
    }
    warn(e, ...t) {
      logForDebugging(vRt.format(e, ...t), {
        level: "warn"
      });
    }
    error(e, ...t) {
      logForDebugging(vRt.format(e, ...t), {
        level: "error"
      });
    }
  }
  var vRt;
  var n_f;
  var o_c;
  var tEo = __lazy(() => {
    XPr();
    nfn();
    xJ();
    ln();
    BF();
    Ot();
    TEe();
    fqe();
    cU();
    no();
    je();
    pr();
    gn();
    Ds();
    fW();
    Fh();
    xme();
    b1();
    vRt = require("util");
    n_f = new Set(["bridge_status", "error_type", "tool_name"]);
    o_c = ["ask", "skip_all_permission_checks", "follow_a_plan"];
  });
  var p_c = {};