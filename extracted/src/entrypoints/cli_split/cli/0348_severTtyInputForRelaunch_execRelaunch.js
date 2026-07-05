  __export(_ze, {
    severTtyInputForRelaunch: () => severTtyInputForRelaunch,
    execRelaunch: () => execRelaunch
  });
  function severTtyInputForRelaunch() {
    for (let e = 0; e < 32; e++) {
      if (e === 1 || e === 2) {
        continue;
      }
      try {
        if (Ffl.isatty(e)) {
          Nfl.closeSync(e);
        }
      } catch {}
    }
  }
  async function execRelaunch() {
    await new Promise(s => setImmediate(s));
    let {
      cmd: e,
      prefixArgs: t
    } = eH();
    let n = process.argv.slice(2);
    let r = Mfl.spawn(e, [...t, ...n], {
      stdio: "inherit",
      env: process.env
    });
    severTtyInputForRelaunch();
    let o = ["SIGINT", "SIGTERM", "SIGHUP"];
    for (let s of o) {
      process.on(s, () => {
        try {
          r.kill(s);
        } catch {}
      });
    }
    return new Promise(() => {
      r.on("close", (s, i) => {
        let a = i ? 128 + (Lfl.constants.signals[i] ?? 0) : 0;
        process.exit(s ?? a);
      });
      r.on("error", s => {
        process.stderr.write(`Failed to relaunch Claude Code: ${s.message}
`);
        setBgExitCause("relaunch_child_error");
        process.exit(1);
      });
    });
  }
  var Mfl;
  var Nfl;
  var Lfl;
  var Ffl;
  var bze = __lazy(() => {
    M7();
    Sve();
    Mfl = require("child_process");
    Nfl = require("fs");
    Lfl = require("os");
    Ffl = require("tty");
  });
  var $fl = {};
  __export($fl, {
    ConsoleOAuthFlow: () => ConsoleOAuthFlow
  });
  function ConsoleOAuthFlow({
    onDone: e,
    onAuthSuccess: t,
    startingMessage: n,
    mode: r = "login",
    forceLoginMethod: o,
    urlOutdent: s = 0
  }) {
    let a = (nE() ? 2 : 0) + s;
    let l = getInitialSettings() || {};
    let c = getSettingsForSource("policySettings");
    let u = isAdminPolicyOrigin(getPolicySettingsOrigin());
    let d = u && c?.forceLoginMethod === "gateway";
    let p = u ? c?.forceLoginGatewayUrl : undefined;
    let m = l.forceLoginMethod === "gateway" && !d ? undefined : l.forceLoginMethod;
    let f = o ?? m;
    let h = f === "gateway" || p !== undefined;
    let g = f === "claudeai" ? "Login method pre-selected: Subscription Plan (Claude Pro/Max)" : f === "console" ? "Login method pre-selected: API usage billing (Anthropic Console)" : null;
    let y = null;
    let _ = lG();
    let b = useClock();
    let [S, E] = rL.useState(() => {
      if (r === "setup-token") {
        return {
          state: "ready_to_start"
        };
      }
      if (f === "claudeai" || f === "console") {
        return {
          state: "ready_to_start"
        };
      }
      if (h) {
        return {
          state: "gateway_setup"
        };
      }
      return {
        state: "idle"
      };
    });
    let [C, x] = rL.useState("");
    let [A, k] = rL.useState(0);
    let [I] = rL.useState(() => new Rz());
    let [O, M] = rL.useState(() => r === "setup-token" || f === "claudeai");
    let L = l.forceLoginMethod !== undefined && O !== (l.forceLoginMethod === "claudeai");
    let P = typeof l.forceLoginOrgUUID === "string" && !L ? l.forceLoginOrgUUID : undefined;
    let [F, H] = rL.useState(false);
    let [U, N] = rL.useState(false);
    let W = Sr().columns - ("Paste code here if prompted > ").length - 1;
    rL.useEffect(() => {
      if (f === "claudeai") {
        logEvent("tengu_oauth_claudeai_forced", {});
      } else if (f === "console") {
        logEvent("tengu_oauth_console_forced", {});
      } else if (h && true && r !== "setup-token") {
        logEvent("tengu_oauth_gateway_forced", {});
      }
    }, [f, h, r]);
    useTimeout(() => {
      if (S.state === "about_to_retry") {
        E(S.nextState);
      }
    }, S.state === "about_to_retry" ? 1000 : null, [S]);
    uo("confirm:yes", () => {
      logEvent(S.state === "gateway_done" ? "tengu_oauth_gateway_done" : "tengu_oauth_success", {
        loginWithClaudeAi: O
      });
      e();
    }, {
      context: "Confirmation",
      isActive: S.state === "success" && r !== "setup-token" || S.state === "gateway_done"
    });
    let j = MXd();
    uo("confirm:yes", () => {
      saveGlobalConfig(J => ({
        ...J,
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
      j.exit();
      Promise.resolve().then(() => (bze(), _ze)).then(J => J.execRelaunch());
    }, {
      context: "Confirmation",
      isActive: S.state === "bedrock_done" || S.state === "vertex_done"
    });
    uo("confirm:yes", () => E({
      state: "platform_setup"
    }), {
      context: "Confirmation",
      isActive: S.state === "aws_refresh_done"
    });
    uo("confirm:yes", () => {
      if (S.state === "error" && S.toRetry) {
        x("");
        E({
          state: "about_to_retry",
          nextState: S.toRetry
        });
      }
    }, {
      context: "Confirmation",
      isActive: S.state === "error" && !!S.toRetry
    });
    rL.useEffect(() => {
      if (C === "c" && S.state === "waiting_for_login" && F && !U) {
        Uk(S.url).then(J => {
          if (J) {
            process.stdout.write(J);
          }
          N(true);
          b.setTimeout(() => N(false), 2000);
        });
        x("");
      }
    }, [C, S, F, U, b]);
    async function z(J, Q) {
      try {
        let [Z, ne] = J.split("#");
        if (!Z || !ne) {
          E({
            state: "error",
            message: "Invalid code. Please make sure the full code was copied",
            toRetry: {
              state: "waiting_for_login",
              url: Q
            }
          });
          return;
        }
        logEvent("tengu_oauth_manual_entry", {});
        I.handleManualAuthCodeInput({
          authorizationCode: Z,
          state: ne
        });
      } catch (Z) {
        Oe(Z);
        E({
          state: "error",
          message: he(Z),
          toRetry: {
            state: "waiting_for_login",
            url: Q
          }
        });
      }
    }
    let V = rL.useCallback(async () => {
      try {
        logEvent("tengu_oauth_flow_start", {
          loginWithClaudeAi: O
        });
        let J = await I.startOAuthFlow(async Q => {
          E({
            state: "waiting_for_login",
            url: Q
          });
          b.setTimeout(() => H(true), 3000);
        }, {
          loginWithClaudeAi: O,
          inferenceOnly: r === "setup-token",
          expiresIn: r === "setup-token" ? 31536000 : undefined,
          orgUUID: P
        }).catch(Q => {
          let Z = Q.message.includes("Token exchange failed");
          let ne = RDe(Q);
          throw E({
            state: "error",
            message: ne ?? (Z ? "Failed to exchange authorization code for access token. Please try again." : Q.message),
            toRetry: r === "setup-token" ? {
              state: "ready_to_start"
            } : {
              state: "idle"
            }
          }), logEvent("tengu_oauth_token_exchange_error", {
            ...o1(Q),
            ssl_error: ne !== null
          }), Q;
        });
        if (r === "setup-token") {
          E({
            state: "success",
            token: J.accessToken
          });
          t?.();
        } else {
          await installOAuthTokens(J);
          let Q = await validateForceLoginOrg();
          if (!Q.valid) {
            throw Error(Q.message);
          }
          E({
            state: "success"
          });
          t?.();
          KQ({
            message: "Claude Code login successful",
            notificationType: "auth_success"
          }, _);
        }
      } catch (J) {
        let Q = he(J);
        let Z = RDe(J);
        E({
          state: "error",
          message: Z ?? Q,
          toRetry: {
            state: r === "setup-token" ? "ready_to_start" : "idle"
          }
        });
        logEvent("tengu_oauth_error", {
          ...o1(J),
          ssl_error: Z !== null
        });
      }
    }, [I, O, r, P, _, b, t]);
    let K = rL.useRef(false);
    rL.useEffect(() => {
      if (S.state === "ready_to_start" && !K.current) {
        K.current = true;
        process.nextTick((J, Q) => {
          J().finally(() => {
            Q.current = false;
          });
        }, V, K);
      }
    }, [S.state, V]);
    useTimeout(() => {
      logEvent("tengu_oauth_success", {
        loginWithClaudeAi: O
      });
      e();
    }, r === "setup-token" && S.state === "success" ? 500 : null, [r, S, O, e]);
    rL.useEffect(() => () => {
      I.cleanup();
    }, [I]);
    return Ci.jsxs(gXd, {
      flexDirection: "column",
      gap: 1,
      children: [S.state === "waiting_for_login" && F && Ci.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        paddingBottom: 1,
        children: [Ci.jsxs(gXd, {
          children: [Ci.jsxs(Text, {
            dimColor: true,
            children: ["Browser didn't open? Use the url below to sign in", " "]
          }), U ? Ci.jsx(Text, {
            color: "success",
            children: "(Copied!)"
          }) : Ci.jsx(Text, {
            dimColor: true,
            children: Ci.jsx(xt, {
              chord: "c",
              action: "copy",
              parens: true
            })
          })]
        }), Ci.jsx(gXd, {
          marginX: a ? -a : undefined,
          children: Ci.jsx(Link, {
            url: S.url,
            children: Ci.jsx(Text, {
              dimColor: true,
              children: S.url
            })
          })
        })]
      }, "urlToCopy"), r === "setup-token" && S.state === "success" && S.token && Ci.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        paddingTop: 1,
        children: [Ci.jsx(Text, {
          color: "success",
          children: "\u2713 Long-lived authentication token created successfully!"
        }), Ci.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          children: [Ci.jsx(Text, {
            children: "Your OAuth token (valid for 1 year):"
          }), Ci.jsx(Text, {
            color: "warning",
            children: S.token
          }), Ci.jsx(Text, {
            dimColor: true,
            children: "Store this token securely. You won't be able to see it again."
          }), Ci.jsx(Text, {
            dimColor: true,
            children: "Use this token by setting: export CLAUDE_CODE_OAUTH_TOKEN=<token>"
          })]
        })]
      }, "tokenOutput"), Ci.jsx(gXd, {
        flexDirection: "column",
        gap: 1,
        children: Ci.jsx(rym, {
          oauthStatus: S,
          mode: r,
          startingMessage: n,
          forcedMethodMessage: g,
          gatewayUnsupportedWarning: null,
          forceLoginGatewayUrl: p,
          gatewayScreenLocked: f === "gateway",
          showPastePrompt: F,
          pastedCode: C,
          setPastedCode: x,
          cursorOffset: A,
          setCursorOffset: k,
          textInputColumns: W,
          handleSubmitCode: z,
          setOAuthStatus: E,
          setLoginWithClaudeAi: M,
          onAuthSuccess: t
        })
      })]
    });
  }
  function nym(e) {
    let t = IPo.c(4);
    let {
      onComplete: n
    } = e;
    let r;
    if (t[0] !== n) {
      r = () => {
        let i = getConfiguredAwsAuthRefresh();
        if (!i) {
          n(false);
          return;
        }
        if (isAwsAuthRefreshFromProjectSettings() && !checkHasTrustDialogAccepted()) {
          n(false);
          return;
        }
        let a = new AbortController();
        refreshAwsAuth(i, a.signal).then(l => {
          if (a.signal.aborted) {
            return;
          }
          if (l) {
            clearAwsCredentialsCache();
            resetAwsAuthRefreshCooldown();
          }
          n(l);
        });
        return () => a.abort();
      };
      t[0] = n;
      t[1] = r;
    } else {
      r = t[1];
    }
    let o;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      o = [];
      t[2] = o;
    } else {
      o = t[2];
    }
    rL.useEffect(r, o);
    let s;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      s = Ci.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [Ci.jsxs(gXd, {
          children: [Ci.jsx(Ed, {}), Ci.jsx(Text, {
            children: "Running awsAuthRefresh\u2026"
          })]
        }), Ci.jsx(aJn, {})]
      });
      t[3] = s;
    } else {
      s = t[3];
    }
    return s;
  }
  function rym(e) {
    let t = IPo.c(85);
    let {
      oauthStatus: n,
      mode: r,
      startingMessage: o,
      forcedMethodMessage: s,
      gatewayUnsupportedWarning: i,
      forceLoginGatewayUrl: a,
      gatewayScreenLocked: l,
      showPastePrompt: c,
      pastedCode: u,
      setPastedCode: d,
      cursorOffset: p,
      setCursorOffset: m,
      textInputColumns: f,
      handleSubmitCode: h,
      setOAuthStatus: g,
      setLoginWithClaudeAi: y,
      onAuthSuccess: _
    } = e;
    switch (n.state) {
      case "idle":
        {
          let b = o ? o : "Claude Code can be used with your Claude subscription or billed based on API usage through your Console account.";
          let S;
          if (t[0] !== b) {
            S = Ci.jsx(Text, {
              bold: true,
              children: b
            });
            t[0] = b;
            t[1] = S;
          } else {
            S = t[1];
          }
          let E;
          if (t[2] !== i) {
            E = i && Ci.jsx(Text, {
              color: "warning",
              children: i
            });
            t[2] = i;
            t[3] = E;
          } else {
            E = t[3];
          }
          let C;
          if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
            C = Ci.jsx(Text, {
              children: "Select login method:"
            });
            t[4] = C;
          } else {
            C = t[4];
          }
          let x;
          if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
            x = {
              label: Ci.jsxs(Text, {
                children: ["Claude account with subscription \xB7", " ", Ci.jsx(Text, {
                  dimColor: true,
                  children: "Pro, Max, Team, or Enterprise"
                }), false]
              }),
              value: "claudeai"
            };
            t[5] = x;
          } else {
            x = t[5];
          }
          let A;
          if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
            A = {
              label: Ci.jsxs(Text, {
                children: ["Anthropic Console account \xB7", " ", Ci.jsx(Text, {
                  dimColor: true,
                  children: "API usage billing"
                })]
              }),
              value: "console"
            };
            t[6] = A;
          } else {
            A = t[6];
          }
          let k;
          if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
            k = [x, A, {
              label: Ci.jsxs(Text, {
                children: ["3rd-party platform \xB7", " ", Ci.jsx(Text, {
                  dimColor: true,
                  children: "Amazon Bedrock, Microsoft Foundry, or Vertex AI"
                })]
              }),
              value: "platform"
            }];
            t[7] = k;
          } else {
            k = t[7];
          }
          let I;
          if (t[8] !== y || t[9] !== g) {
            I = Ci.jsx(gXd, {
              children: Ci.jsx(xr, {
                options: k,
                onChange: M => {
                  if (M === "platform") {
                    logEvent("tengu_oauth_platform_selected", {});
                    g({
                      state: "platform_setup"
                    });
                  } else if (g({
                    state: "ready_to_start"
                  }), M === "claudeai") {
                    logEvent("tengu_oauth_claudeai_selected", {});
                    y(true);
                  } else {
                    logEvent("tengu_oauth_console_selected", {});
                    y(false);
                  }
                }
              })
            });
            t[8] = y;
            t[9] = g;
            t[10] = I;
          } else {
            I = t[10];
          }
          let O;
          if (t[11] !== S || t[12] !== E || t[13] !== I) {
            O = Ci.jsxs(gXd, {
              flexDirection: "column",
              gap: 1,
              children: [S, E, C, I]
            });
            t[11] = S;
            t[12] = E;
            t[13] = I;
            t[14] = O;
          } else {
            O = t[14];
          }
          return O;
        }
      case "gateway_setup":
        {
          {
            let b;
            if (t[15] !== _ || t[16] !== g) {
              b = () => {
                _?.();
                g({
                  state: "gateway_done"
                });
              };
              t[15] = _;
              t[16] = g;
              t[17] = b;
            } else {
              b = t[17];
            }
            let S;
            if (t[18] !== g) {
              S = () => g({
                state: "idle"
              });
              t[18] = g;
              t[19] = S;
            } else {
              S = t[19];
            }
            let E;
            if (t[20] !== a || t[21] !== l || t[22] !== b || t[23] !== S) {
              E = Ci.jsx(rfl, {
                initialUrl: a,
                screenLocked: l,
                onDone: b,
                onCancel: S
              });
              t[20] = a;
              t[21] = l;
              t[22] = b;
              t[23] = S;
              t[24] = E;
            } else {
              E = t[24];
            }
            return E;
          }
          return null;
        }
      case "gateway_done":
        {
          let b;
          if (t[25] === Symbol.for("react.memo_cache_sentinel")) {
            b = Ci.jsx(Text, {
              color: "success",
              children: "Connected to Cloud gateway."
            });
            t[25] = b;
          } else {
            b = t[25];
          }
          let S;
          if (t[26] === Symbol.for("react.memo_cache_sentinel")) {
            S = Ci.jsxs(gXd, {
              flexDirection: "column",
              gap: 1,
              marginTop: 1,
              children: [b, Ci.jsxs(Text, {
                dimColor: true,
                children: ["Press ", Ci.jsx(Text, {
                  bold: true,
                  children: "Enter"
                }), " to continue."]
              })]
            });
            t[26] = S;
          } else {
            S = t[26];
          }
          return S;
        }
      case "platform_setup":
        {
          let b;
          if (t[27] === Symbol.for("react.memo_cache_sentinel")) {
            b = getConfiguredAwsAuthRefresh();
            t[27] = b;
          } else {
            b = t[27];
          }
          let S = b;
          let E;
          if (t[28] === Symbol.for("react.memo_cache_sentinel")) {
            E = Ci.jsx(Text, {
              bold: true,
              children: "Using 3rd-party platforms"
            });
            t[28] = E;
          } else {
            E = t[28];
          }
          let C;
          let x;
          if (t[29] === Symbol.for("react.memo_cache_sentinel")) {
            C = {
              label: Ci.jsxs(Text, {
                children: ["Amazon Bedrock \xB7 ", Ci.jsx(Text, {
                  dimColor: true,
                  children: "interactive setup"
                })]
              }),
              value: "bedrock"
            };
            x = S ? [{
              label: Ci.jsxs(Text, {
                children: ["Claude Platform on AWS \xB7", " ", Ci.jsx(Text, {
                  dimColor: true,
                  children: "refresh credentials"
                })]
              }),
              value: "aws_refresh"
            }] : [];
            t[29] = C;
            t[30] = x;
          } else {
            C = t[29];
            x = t[30];
          }
          let A;
          if (t[31] === Symbol.for("react.memo_cache_sentinel")) {
            A = {
              label: Ci.jsxs(Text, {
                children: ["Microsoft Foundry \xB7 ", Ci.jsx(Text, {
                  dimColor: true,
                  children: "opens docs"
                })]
              }),
              value: "foundry"
            };
            t[31] = A;
          } else {
            A = t[31];
          }
          let k;
          if (t[32] === Symbol.for("react.memo_cache_sentinel")) {
            k = [C, ...x, A, {
              label: Ci.jsxs(Text, {
                children: ["Google Vertex AI \xB7 ", Ci.jsx(Text, {
                  dimColor: true,
                  children: "interactive setup"
                })]
              }),
              value: "vertex"
            }, {
              label: "Go back",
              value: "back"
            }];
            t[32] = k;
          } else {
            k = t[32];
          }
          let I;
          if (t[33] !== g) {
            I = Ci.jsx(xr, {
              options: k,
              onChange: L => {
                e: switch (L) {
                  case "bedrock":
                    {
                      logEvent("tengu_oauth_bedrock_wizard_launched", {});
                      g({
                        state: "bedrock_wizard"
                      });
                      break e;
                    }
                  case "aws_refresh":
                    {
                      logEvent("tengu_oauth_aws_refresh_launched", {});
                      g({
                        state: "aws_refresh_running"
                      });
                      break e;
                    }
                  case "foundry":
                    {
                      logEvent("tengu_oauth_platform_docs_opened", {
                        platform: "foundry"
                      });
                      Ac("https://code.claude.com/docs/en/microsoft-foundry");
                      g({
                        state: "idle"
                      });
                      break e;
                    }
                  case "vertex":
                    {
                      logEvent("tengu_oauth_vertex_wizard_launched", {});
                      g({
                        state: "vertex_wizard"
                      });
                      break e;
                    }
                  default:
                    g({
                      state: "idle"
                    });
                }
              },
              onCancel: () => g({
                state: "idle"
              })
            });
            t[33] = g;
            t[34] = I;
          } else {
            I = t[34];
          }
          let O;
          if (t[35] === Symbol.for("react.memo_cache_sentinel")) {
            O = Ci.jsxs(Text, {
              dimColor: true,
              children: ["Foundry: ", Ci.jsx(Link, {
                url: "https://code.claude.com/docs/en/microsoft-foundry",
                children: "https://code.claude.com/docs/en/microsoft-foundry"
              })]
            });
            t[35] = O;
          } else {
            O = t[35];
          }
          let M;
          if (t[36] !== I) {
            M = Ci.jsxs(gXd, {
              flexDirection: "column",
              gap: 1,
              children: [E, I, O]
            });
            t[36] = I;
            t[37] = M;
          } else {
            M = t[37];
          }
          return M;
        }
      case "aws_refresh_running":
        {
          let b;
          if (t[38] !== g) {
            b = Ci.jsx(nym, {
              onComplete: S => g({
                state: "aws_refresh_done",
                ok: S
              })
            });
            t[38] = g;
            t[39] = b;
          } else {
            b = t[39];
          }
          return b;
        }
      case "aws_refresh_done":
        {
          let b;
          if (t[40] !== n.ok) {
            b = n.ok ? Ci.jsx(Text, {
              color: "success",
              children: "AWS credentials refreshed."
            }) : Ci.jsx(Text, {
              color: "error",
              children: "awsAuthRefresh failed. Check the command in your settings and try running it in a separate terminal."
            });
            t[40] = n.ok;
            t[41] = b;
          } else {
            b = t[41];
          }
          let S;
          if (t[42] === Symbol.for("react.memo_cache_sentinel")) {
            S = Ci.jsxs(Text, {
              dimColor: true,
              children: ["Press ", Ci.jsx(Text, {
                bold: true,
                children: "Enter"
              }), " to continue."]
            });
            t[42] = S;
          } else {
            S = t[42];
          }
          let E;
          if (t[43] !== b) {
            E = Ci.jsxs(gXd, {
              flexDirection: "column",
              gap: 1,
              children: [b, S]
            });
            t[43] = b;
            t[44] = E;
          } else {
            E = t[44];
          }
          return E;
        }
      case "bedrock_wizard":
        {
          let b;
          if (t[45] !== g) {
            b = Ci.jsx(NJn, {
              onComplete: S => g({
                state: "bedrock_done",
                message: S
              }),
              onCancel: () => g({
                state: "platform_setup"
              })
            });
            t[45] = g;
            t[46] = b;
          } else {
            b = t[46];
          }
          return b;
        }
      case "bedrock_done":
      case "vertex_done":
        {
          let b;
          if (t[47] !== n.message) {
            b = Ci.jsx(Text, {
              color: "success",
              children: n.message
            });
            t[47] = n.message;
            t[48] = b;
          } else {
            b = t[48];
          }
          let S;
          if (t[49] === Symbol.for("react.memo_cache_sentinel")) {
            S = Ci.jsxs(Text, {
              dimColor: true,
              children: ["Press ", Ci.jsx(Text, {
                bold: true,
                children: "Enter"
              }), " to restart Claude Code."]
            });
            t[49] = S;
          } else {
            S = t[49];
          }
          let E;
          if (t[50] !== b) {
            E = Ci.jsxs(gXd, {
              flexDirection: "column",
              gap: 1,
              children: [b, S]
            });
            t[50] = b;
            t[51] = E;
          } else {
            E = t[51];
          }
          return E;
        }
      case "vertex_wizard":
        {
          let b;
          if (t[52] !== g) {
            b = Ci.jsx(jJn, {
              onComplete: S => g({
                state: "vertex_done",
                message: S
              }),
              onCancel: () => g({
                state: "platform_setup"
              })
            });
            t[52] = g;
            t[53] = b;
          } else {
            b = t[53];
          }
          return b;
        }
      case "waiting_for_login":
        {
          let b;
          if (t[54] !== s) {
            b = s && Ci.jsx(gXd, {
              children: Ci.jsx(Text, {
                dimColor: true,
                children: s
              })
            });
            t[54] = s;
            t[55] = b;
          } else {
            b = t[55];
          }
          let S;
          if (t[56] !== c) {
            S = !c && Ci.jsxs(gXd, {
              children: [Ci.jsx(Ed, {}), Ci.jsx(Text, {
                children: "Opening browser to sign in\u2026"
              })]
            });
            t[56] = c;
            t[57] = S;
          } else {
            S = t[57];
          }
          let E;
          if (t[58] !== p || t[59] !== h || t[60] !== n.url || t[61] !== u || t[62] !== m || t[63] !== d || t[64] !== c || t[65] !== f) {
            E = c && Ci.jsxs(gXd, {
              children: [Ci.jsx(Text, {
                children: "Paste code here if prompted > "
              }), Ci.jsx(Dl, {
                value: u,
                onChange: d,
                onSubmit: x => h(x, n.url),
                cursorOffset: p,
                onChangeCursorOffset: m,
                columns: f,
                mask: "*"
              })]
            });
            t[58] = p;
            t[59] = h;
            t[60] = n.url;
            t[61] = u;
            t[62] = m;
            t[63] = d;
            t[64] = c;
            t[65] = f;
            t[66] = E;
          } else {
            E = t[66];
          }
          let C;
          if (t[67] !== b || t[68] !== S || t[69] !== E) {
            C = Ci.jsxs(gXd, {
              flexDirection: "column",
              gap: 1,
              children: [b, S, E]
            });
            t[67] = b;
            t[68] = S;
            t[69] = E;
            t[70] = C;
          } else {
            C = t[70];
          }
          return C;
        }
      case "creating_api_key":
        {
          let b;
          if (t[71] === Symbol.for("react.memo_cache_sentinel")) {
            b = Ci.jsx(gXd, {
              flexDirection: "column",
              gap: 1,
              children: Ci.jsxs(gXd, {
                children: [Ci.jsx(Ed, {}), Ci.jsx(Text, {
                  children: "Creating API key for Claude Code\u2026"
                })]
              })
            });
            t[71] = b;
          } else {
            b = t[71];
          }
          return b;
        }
      case "about_to_retry":
        {
          let b;
          if (t[72] === Symbol.for("react.memo_cache_sentinel")) {
            b = Ci.jsx(gXd, {
              flexDirection: "column",
              gap: 1,
              children: Ci.jsx(Text, {
                color: "permission",
                children: "Retrying\u2026"
              })
            });
            t[72] = b;
          } else {
            b = t[72];
          }
          return b;
        }
      case "success":
        {
          let b;
          if (t[73] !== r || t[74] !== n.token) {
            b = r === "setup-token" && n.token ? null : Ci.jsxs(Ci.Fragment, {
              children: [getOauthAccountInfo()?.emailAddress ? Ci.jsxs(Text, {
                dimColor: true,
                children: ["Logged in as", " ", Ci.jsx(Text, {
                  children: getOauthAccountInfo()?.emailAddress
                })]
              }) : null, Ci.jsxs(Text, {
                color: "success",
                children: ["Login successful. Press ", Ci.jsx(Text, {
                  bold: true,
                  children: "Enter"
                }), " to continue\u2026"]
              })]
            });
            t[73] = r;
            t[74] = n.token;
            t[75] = b;
          } else {
            b = t[75];
          }
          let S;
          if (t[76] !== b) {
            S = Ci.jsx(gXd, {
              flexDirection: "column",
              children: b
            });
            t[76] = b;
            t[77] = S;
          } else {
            S = t[77];
          }
          return S;
        }
      case "error":
        {
          let b;
          if (t[78] !== n.message) {
            b = Ci.jsxs(Text, {
              color: "error",
              children: ["OAuth error: ", n.message]
            });
            t[78] = n.message;
            t[79] = b;
          } else {
            b = t[79];
          }
          let S;
          if (t[80] !== n.toRetry) {
            S = n.toRetry && Ci.jsx(gXd, {
              marginTop: 1,
              children: Ci.jsxs(Text, {
                color: "permission",
                children: ["Press ", Ci.jsx(Text, {
                  bold: true,
                  children: "Enter"
                }), " to retry."]
              })
            });
            t[80] = n.toRetry;
            t[81] = S;
          } else {
            S = t[81];
          }
          let E;
          if (t[82] !== b || t[83] !== S) {
            E = Ci.jsxs(gXd, {
              flexDirection: "column",
              gap: 1,
              children: [b, S]
            });
            t[82] = b;
            t[83] = S;
            t[84] = E;
          } else {
            E = t[84];
          }
          return E;
        }
      default:
        return null;
    }
  }
  var IPo;
  var rL;
  var Ci;
  var bKt = __lazy(() => {
    Ot();
    V_t();
    Uc();
    rE();
    ki();
    Tg();
    uq();
    et();
    Bs();
    vTe();
    mbt();
    GVe();
    no();
    ky();
    dt();
    dw();
    Rn();
    UIo();
    SPo();
    $c();
    bs();
    oE();
    ofl();
    cA();
    q_();
    kPo();
    IPo = __toESM(pt(), 1);
    rL = __toESM(ot(), 1);
    Ci = __toESM(ie(), 1);
  });
  function Hfl({
    onStashAndContinue: e,
    onCancel: t
  }) {
    let [n, r] = Tze.useState(null);
    let o = n !== null ? [...n.tracked, ...n.untracked] : [];
    let [s, i] = Tze.useState(true);
    let [a, l] = Tze.useState(false);
    let [c, u] = Tze.useState(null);
    Tze.useEffect(() => {
      (async () => {
        try {
          let f = await getFileStatus();
          r(f);
        } catch (f) {
          let h = f instanceof Error ? f.message : String(f);
          logForDebugging(`Error getting changed files: ${h}`, {
            level: "error"
          });
          u("Failed to get changed files");
        } finally {
          i(false);
        }
      })();
    }, []);
    let d = async () => {
      l(true);
      try {
        if (logForDebugging("Stashing changes before teleport..."), await stashToCleanState("Teleport auto-stash")) {
          logForDebugging("Successfully stashed changes");
          e();
        } else {
          u("Failed to stash changes");
        }
      } catch (m) {
        let f = m instanceof Error ? m.message : String(m);
        logForDebugging(`Error stashing changes: ${f}`, {
          level: "error"
        });
        u("Failed to stash changes");
      } finally {
        l(false);
      }
    };
    if (s) {
      return A0.jsx(gXd, {
        flexDirection: "column",
        padding: 1,
        children: A0.jsxs(gXd, {
          marginBottom: 1,
          children: [A0.jsx(Ed, {}), A0.jsxs(Text, {
            children: [" Checking git status", vGd.ellipsis]
          })]
        })
      });
    }
    if (c) {
      return A0.jsxs(gXd, {
        flexDirection: "column",
        padding: 1,
        children: [A0.jsxs(Text, {
          bold: true,
          color: "error",
          children: ["Error: ", c]
        }), A0.jsx(gXd, {
          marginTop: 1,
          children: A0.jsx(Text, {
            dimColor: true,
            children: A0.jsx(xt, {
              chord: "escape",
              action: "cancel",
              bold: true
            })
          })
        })]
      });
    }
    let p = o.length > 8;
    return A0.jsxs(or, {
      title: "Working directory has changes",
      onCancel: t,
      children: [A0.jsx(Text, {
        children: "Teleport will switch git branches. The following changes were found:"
      }), A0.jsx(gXd, {
        flexDirection: "column",
        paddingLeft: 2,
        children: o.length > 0 ? p ? A0.jsxs(Text, {
          children: [o.length, " files changed"]
        }) : o.map((m, f) => A0.jsx(Text, {
          children: m
        }, f)) : A0.jsx(sc, {
          children: "No changes detected"
        })
      }), A0.jsx(Text, {
        children: "Would you like to stash these changes and continue with teleport?"
      }), a ? A0.jsxs(gXd, {
        children: [A0.jsx(Ed, {}), A0.jsx(Text, {
          children: " Stashing changes..."
        })]
      }) : A0.jsx(mc, {
        confirmLabel: "Stash changes and continue",
        cancelLabel: "Exit",
        onConfirm: () => void d(),
        onCancel: t
      })]
    });
  }
  var Tze;
  var A0;
  var jfl = __lazy(() => {
    et();
    je();
    na();
    b_();
    Ii();
    xb();
    bs();
    cA();
    Tze = __toESM(ot(), 1);
    A0 = __toESM(ie(), 1);
  });
  function zJn(e) {
    let t = qfl.c(20);
    let {
      onComplete: n,
      errorsToIgnore: r
    } = e;
    let o = r === undefined ? oym : r;
    let [s, i] = SKt.useState(null);
    let [a, l] = SKt.useState(false);
    let c = nE();
    let u;
    if (t[0] !== o || t[1] !== n) {
      u = async () => {
        let E = await PPo();
        let C = new Set(Array.from(E).filter(x => !o.vZc(x)));
        if (C.size === 0) {
          n();
          return;
        }
        if (C.vZc("needsLogin")) {
          i("needsLogin");
        } else if (C.vZc("needsGitStash")) {
          i("needsGitStash");
        }
      };
      t[0] = o;
      t[1] = n;
      t[2] = u;
    } else {
      u = t[2];
    }
    let d = u;
    let p;
    let m;
    if (t[3] !== d) {
      p = () => {
        d();
      };
      m = [d];
      t[3] = d;
      t[4] = p;
      t[5] = m;
    } else {
      p = t[4];
      m = t[5];
    }
    SKt.useEffect(p, m);
    let f = sym;
    let h;
    if (t[6] !== d) {
      h = () => {
        l(false);
        d();
      };
      t[6] = d;
      t[7] = h;
    } else {
      h = t[7];
    }
    let g = h;
    let y;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      y = () => {
        l(true);
      };
      t[8] = y;
    } else {
      y = t[8];
    }
    let _ = y;
    let b;
    if (t[9] !== d) {
      b = () => {
        d();
      };
      t[9] = d;
      t[10] = b;
    } else {
      b = t[10];
    }
    let S = b;
    if (!s) {
      return null;
    }
    switch (s) {
      case "needsGitStash":
        {
          let E;
          if (t[11] !== S) {
            E = eZ.jsx(Hfl, {
              onStashAndContinue: S,
              onCancel: f
            });
            t[11] = S;
            t[12] = E;
          } else {
            E = t[12];
          }
          return E;
        }
      case "needsLogin":
        {
          let E = a ? g : f;
          let C;
          if (t[13] !== g || t[14] !== c || t[15] !== a) {
            C = a ? eZ.jsx(ConsoleOAuthFlow, {
              onDone: g,
              mode: "login",
              forceLoginMethod: "claudeai",
              urlOutdent: c ? 1 : 2
            }) : eZ.jsxs(eZ.Fragment, {
              children: [eZ.jsxs(gXd, {
                flexDirection: "column",
                children: [eZ.jsx(Text, {
                  dimColor: true,
                  children: "Teleport requires a Claude.ai account."
                }), eZ.jsx(Text, {
                  dimColor: true,
                  children: "Your Claude Pro/Max subscription will be used by Claude Code."
                })]
              }), eZ.jsx(mc, {
                confirmLabel: "Login with Claude account",
                cancelLabel: "Exit",
                onConfirm: _,
                onCancel: f
              })]
            });
            t[13] = g;
            t[14] = c;
            t[15] = a;
            t[16] = C;
          } else {
            C = t[16];
          }
          let x;
          if (t[17] !== E || t[18] !== C) {
            x = eZ.jsx(or, {
              title: "Log in to Claude",
              onCancel: E,
              children: C
            });
            t[17] = E;
            t[18] = C;
            t[19] = x;
          } else {
            x = t[19];
          }
          return x;
        }
    }
  }
  function sym() {
    gracefulShutdownSync(0);
  }
  async function PPo() {
    let e = new Set();
    let [t, n] = await Promise.all([E5n(), w8a()]);
    if (t) {
      e.add("needsLogin");
    }
    if (!n) {
      e.add("needsGitStash");
    }
    return e;
  }
  var qfl;
  var SKt;
  var eZ;
  var oym;
  var OPo = __lazy(() => {
    UNe();
    lm();
    rE();
    et();
    bKt();
    b_();
    Ii();
    oE();
    jfl();
    qfl = __toESM(pt(), 1);
    SKt = __toESM(ot(), 1);
    eZ = __toESM(ie(), 1);
    oym = new Set();
  });
  function aym(e) {
    let t = DPo.get(e);
    if (!t) {
      t = tnt(async (n, r, o) => await lym(e, n, r, o));
      DPo.set(e, t);
    }
    return t;
  }
  async function lym(e, t, n, r) {
    for (let o = 1; o <= 10; o++) {
      try {
        let i = Eze.get(e);
        let a = {
          ...r
        };
        if (i) {
          a["Last-Uuid"] = i;
        }
        let l = await NP.put(n, t, {
          headers: a,
          timeout: 30000,
          validateStatus: c => c < 500
        });
        if (l.status === 200 || l.status === 201) {
          Eze.set(e, t.uuid);
          logForDebugging(`Successfully persisted session log entry for session ${e}`);
          return true;
        }
        if (l.status === 409) {
          let c = l.headers["x-last-uuid"];
          if (c === t.uuid) {
            Eze.set(e, t.uuid);
            logForDebugging(`Session entry ${t.uuid} already present on server, recovering from stale state`);
            wn("info", "session_persist_recovered_from_409");
            return true;
          }
          if (c) {
            Eze.set(e, c);
            logForDebugging(`Session 409: adopting server lastUuid=${c} from header, retrying entry ${t.uuid}`);
          } else {
            let u = await MPo(e, n, r);
            let d = cym(u);
            if (d) {
              Eze.set(e, d);
              logForDebugging(`Session 409: re-fetched ${u.length} entries, adopting lastUuid=${d}, retrying entry ${t.uuid}`);
            } else {
              let m = l.data.error?.message || "Concurrent modification detected";
              logForDebugging(`Session persistence conflict: UUID mismatch for session ${e}, entry ${t.uuid}. ${m}`, {
                level: "error"
              });
              wn("error", "session_persist_fail_concurrent_modification");
              return false;
            }
          }
          wn("info", "session_persist_409_adopt_server_uuid");
          continue;
        }
        if (l.status === 401) {
          logForDebugging("Session token expired or invalid");
          wn("error", "session_persist_fail_bad_token");
          return false;
        }
        logForDebugging(`Failed to persist session log: ${l.status} ${l.statusText}`);
        wn("error", "session_persist_fail_status", {
          status: l.status,
          attempt: o
        });
      } catch (i) {
        logForDebugging(`Error persisting session log: ${he(i)}`, {
          level: "error"
        });
        wn("error", "session_persist_fail_status", {
          status: NP.isAxiosError(i) ? i.status : undefined,
          attempt: o
        });
      }
      if (o === 10) {
        logForDebugging(`Remote persistence failed after ${10} attempts`);
        wn("error", "session_persist_error_retries_exhausted", {
          attempt: o
        });
        return false;
      }
      let s = Math.min(500 * Math.pow(2, o - 1), 8000);
      logForDebugging(`Remote persistence attempt ${o}/${10} failed, retrying in ${s}ms\u2026`);
      await sleep(s);
    }
    return false;
  }
  async function Wfl(e, t, n) {
    let r = cT();
    if (!r) {
      logForDebugging("No session token available for session persistence");
      wn("error", "session_persist_fail_jwt_no_token");
      return false;
    }
    let o = {
      Authorization: `Bearer ${r}`,
      "Content-Type": "application/json"
    };
    return aym(e)(t, n, o);
  }
  async function Gfl(e, t) {
    let n = cT();
    if (!n) {
      logForDebugging("No session token available for fetching session logs");
      wn("error", "session_get_fail_no_token");
      return null;
    }
    let r = {
      Authorization: `Bearer ${n}`
    };
    let o = await MPo(e, t, r);
    if (o && o.length > 0) {
      let s = o.at(-1);
      if (s && "uuid" in s && s.uuid) {
        Eze.set(e, s.uuid);
      }
    }
    return o;
  }
  async function Vfl(e, t, n) {
    let r = `${getOauthConfig().BASE_API_URL}/v1/session_ingress/session/${e}`;
    logForDebugging(`[session-ingress] Fetching session logs from: ${r}`);
    let o = {
      ...getOAuthHeaders(t),
      "x-organization-uuid": n
    };
    return await MPo(e, r, o);
  }
  async function zfl(e, t, n, r) {
    let o = `${getOauthConfig().BASE_API_URL}/v1/code/sessions/${e}/teleport-events`;
    let s = {
      ...getOAuthHeaders(t),
      "x-organization-uuid": n
    };
    if (r) {
      s["X-Trusted-Device-Token"] = r;
    }
    logForDebugging(`[teleport] Fetching events from: ${o}`);
    let i = [];
    let a;
    let l = 0;
    let c = 100;
    while (l < c) {
      let u = {
        limit: 1000
      };
      if (a !== undefined) {
        u.cursor = a;
      }
      let d;
      try {
        d = await NP.get(o, {
          headers: s,
          params: u,
          timeout: 20000,
          validateStatus: f => f < 500
        });
      } catch (f) {
        Oe($o(Error(`Teleport events fetch failed: ${he(f)}`), "Teleport events fetch failed"));
        wn("error", "teleport_events_fetch_fail");
        Ae("api_teleport_events_fetch", "network_error");
        return null;
      }
      if (d.status === 404) {
        logForDebugging(`[teleport] Session ${e} not found (page ${l})`);
        wn("warn", "teleport_events_not_found");
        Et("api_teleport_events_fetch", "not_found");
        return l === 0 ? null : i;
      }
      if (d.status === 401) {
        wn("error", "teleport_events_bad_token");
        Et("api_teleport_events_fetch", "auth_expired");
        let f = "Your session has expired. Please run /login to sign in again.";
        throw new eS(f, f);
      }
      if (d.status === 403) {
        wn("error", "teleport_events_forbidden");
        Et("api_teleport_events_fetch", "forbidden");
        let f = d.data;
        if (f?.error?.resource === "untrusted_device") {
          throw new eS("This session requires a trusted device. Run /login to enroll this device, then retry.", "This session requires a trusted device. Run /login to enroll this device, then retry.");
        }
        let h = f?.error?.message ?? "Access denied fetching session events";
        throw new eS(h, h);
      }
      if (d.status !== 200) {
        Oe(Error(`Teleport events returned ${d.status}`));
        wn("error", "teleport_events_bad_status");
        Ae("api_teleport_events_fetch", "bad_status");
        return null;
      }
      let {
        data: p,
        next_cursor: m
      } = d.data ?? {};
      if (!Array.isArray(p)) {
        Oe(Error(`Teleport events invalid response shape (data is ${p === null ? "null" : typeof p})`));
        wn("error", "teleport_events_invalid_shape");
        Ae("api_teleport_events_fetch", "bad_status");
        return null;
      }
      for (let f of p) {
        if (f.payload !== null) {
          i.push(f.payload);
        }
      }
      if (l++, m == null) {
        break;
      }
      a = m;
    }
    if (l >= c) {
      Oe($o(Error(`Teleport events hit page cap (${c}) for ${e}`), `teleport_events_page_cap ${c}`));
      wn("warn", "teleport_events_page_cap");
      Et("api_teleport_events_fetch", "page_cap");
    } else {
      Pe("api_teleport_events_fetch");
    }
    logForDebugging(`[teleport] Fetched ${i.length} events over ${l} page(s) for ${e}`);
    return i;
  }
  async function MPo(e, t, n) {
    try {
      let r = await NP.get(t, {
        headers: n,
        timeout: 20000,
        validateStatus: o => o < 500,
        params: st(process.env.CLAUDE_AFTER_LAST_COMPACT) ? {
          after_last_compact: true
        } : undefined
      });
      if (r.status === 200) {
        let o = r.data;
        if (!o || typeof o !== "object" || !Array.isArray(o.loglines)) {
          Oe(Error("Invalid session logs response format"));
          wn("error", "session_get_fail_invalid_response");
          Ae("api_session_logs_fetch", "invalid_response");
          return null;
        }
        let s = o.loglines;
        logForDebugging(`Fetched ${s.length} session logs for session ${e}`);
        Pe("api_session_logs_fetch");
        return s;
      }
      if (r.status === 404) {
        logForDebugging(`No existing logs for session ${e}`);
        wn("warn", "session_get_no_logs_for_session");
        Pe("api_session_logs_fetch");
        return [];
      }
      if (r.status === 401) {
        throw logForDebugging("Auth token expired or invalid"), wn("error", "session_get_fail_bad_token"), Et("api_session_logs_fetch", "auth_expired"), Error("Your session has expired. Please run /login to sign in again.");
      }
      logForDebugging(`Failed to fetch session logs: ${r.status} ${r.statusText}`);
      wn("error", "session_get_fail_status", {
        status: r.status
      });
      Ae("api_session_logs_fetch", "bad_status");
      return null;
    } catch (r) {
      if (!NP.isAxiosError(r)) {
        throw r;
      }
      logForDebugging(`Error fetching session logs: ${r.message}`, {
        level: "error"
      });
      wn("error", "session_get_fail_status", {
        status: r.status
      });
      Ae("api_session_logs_fetch", "network_error");
      return null;
    }
  }
  function cym(e) {
    if (!e) {
      return;
    }
    let t = e.findLast(n => "uuid" in n && n.uuid);
    return t && "uuid" in t ? t.uuid : undefined;
  }
  function Kfl() {
    Eze.clear();
    DPo.clear();
  }
  var Eze;
  var DPo;
  var YJn = __lazy(() => {
    Dp();
    Uc();
    je();
    Zm();
    gn();
    dt();
    Rn();
    e1();
    NC();
    ln();
    Eze = new Map();
    DPo = new Map();
  });
  function Tve(e, t) {
    return e;
  }
  function nLe(e) {
    return;
  }
  var Eve = __lazy(() => {
    pr();
  });
  async function vve(e) {
    let t = Date.now();
    let {
      stdout: n,
      code: r
    } = await execFileNoThrowWithCwd(gitExe(), ["worktree", "list", "--porcelain"], {
      cwd: e,
      preserveOutputOnError: false
    });
    let o = Date.now() - t;
    if (r !== 0) {
      logEvent("tengu_worktree_detection", {
        duration_ms: o,
        worktree_count: 0,
        success: false
      });
      return [];
    }
    let s = n.split(`
`).filter(l => l.startsWith("worktree ")).map(l => l.slice(9));
    logEvent("tengu_worktree_detection", {
      duration_ms: o,
      worktree_count: s.length,
      success: true
    });
    let i = s.find(l => e === l || e.startsWith(l + Yfl.sep));
    let a = s.filter(l => l !== i).sort((l, c) => l.localeCompare(c));
    return i ? [i, ...a] : a;
  }
  var Yfl;
  var TKt = __lazy(() => {
    Ot();
    mm();
    ji();
    na();
    Yfl = require("path");
  });
  function au(e, t, n) {
    if (LPo) {
      return;
    }
    if (e === "skills_load_ms" && EKt[e] !== undefined) {
      return;
    }
    if (EKt[e] = Math.round(t), n !== undefined) {
      Xfl[e] = Math.round(n);
    }
  }
  function shl(e) {
    return EKt[e];
  }
  function ihl() {
    let e = Number.parseInt(process.env.CCR_SPAWN_TIMESTAMP_MS ?? "", 10);
    if (!Number.isFinite(e)) {
      return;
    }
    au("spawn_to_exec_ms", Date.now() - process.uptime() * 1000 - e, e - performance.timeOrigin);
  }
  function ahl() {
    FPo = true;
  }
  function lhl() {
    NPo = performance.now();
  }
  function chl(e, t) {
    Qfl = e === null ? "miss" : NPo !== undefined && NPo < t ? "hit" : "pending";
  }
  function uhl(e, t, n, r, o, s) {
    Zfl = e;
    ehl = t;
    thl = n;
    nhl = r;
    rhl = o;
    ohl = s;
  }
  function dhl() {
    let e = Number.parseInt(process.env.CCR_SPAWN_TIMESTAMP_MS ?? "", 10);
    if (!Number.isFinite(e)) {
      return;
    }
    au("first_message_read_from_spawn_ms", Date.now() - e, e - performance.timeOrigin);
  }
  function phl() {
    let e = Number.parseInt(process.env.CCR_SPAWN_TIMESTAMP_MS ?? "", 10);
    if (!Number.isFinite(e)) {
      return;
    }
    au("input_ready_from_spawn_ms", Date.now() - e, e - performance.timeOrigin);
  }
  function mhl() {
    if (!st(process.env.CLAUDE_CODE_REMOTE)) {
      return;
    }
    if (LPo || Object.keys(EKt).length === 0) {
      return;
    }
    LPo = true;
    return {
      entrypoint: process.env.CLAUDE_CODE_ENTRYPOINT ?? "unknown",
      warm_spare_claimed: FPo,
      resume_hydrate_prefetch: Qfl,
      resume_hydrate_on_disk_bytes: Zfl,
      resume_hydrate_ccr_bytes: ehl,
      resume_hydrate_ccr_events: thl,
      resume_hydrate_delta_events: nhl,
      resume_hydrate_delta_fetch_attempted: rhl,
      resume_hydrate_anchor_walkback: ohl,
      phases: {
        ...EKt
      },
      time_origin_ms: performance.timeOrigin,
      phase_start_ms: {
        ...Xfl
      }
    };
  }
  function fhl() {
    if (JJn !== undefined) {
      return;
    }
    let e = Number.parseInt(process.env.CCR_SPAWN_TIMESTAMP_MS ?? "", 10);
    if (!Number.isFinite(e)) {
      return;
    }
    JJn = Date.now() - e;
  }
  function hhl() {
    if (Jfl || JJn === undefined) {
      return;
    }
    Jfl = true;
    return {
      ms: JJn,
      warmSpareClaimed: FPo,
      timeOriginMs: performance.timeOrigin
    };
  }
  var EKt;
  var Xfl;
  var FPo = false;
  var NPo;
  var Qfl;
  var Zfl;
  var ehl;
  var thl;
  var nhl;
  var rhl;
  var ohl;
  var LPo = false;
  var JJn;
  var Jfl = false;
  var R3 = __lazy(() => {
    gn();
    EKt = {};
    Xfl = {};
  });
  function mym() {
    return Zee.randomUUID();
  }
  function vKt() {
    return {
      msgV: 1,
      msg_id: mym()
    };
  }
  var XJn = __lazy(() => {
    CAt();
  });
  function QJn(e) {
    if (e.startsWith("uds:")) {
      return {
        scheme: "uds",
        target: e.slice(4)
      };
    }
    if (e.startsWith("bridge:")) {
      return {
        scheme: "bridge",
        target: e.slice(7)
      };
    }
    if (e.startsWith("/")) {
      return {
        scheme: "uds",
        target: e
      };
    }
    if (e.startsWith("\\\\.\\pipe\\")) {
      return {
        scheme: "uds",
        target: e
      };
    }
    return {
      scheme: "other",
      target: e
    };
  }
  function Sse(e) {
    if (!/^[\\/]{2}/.test(e)) {
      return true;
    }
    let t = /^[\\/]{2}[.?][\\/]pipe[\\/]([^\\/]+)$/i.exec(e);
    return t !== null && t[1] !== "." && t[1] !== "..";
  }
  var ZJn = {};