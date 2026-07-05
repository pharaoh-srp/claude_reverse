  __export(qwc, {
    resolveInboundAttachments: () => resolveInboundAttachments,
    resolveAndPrepend: () => resolveAndPrepend,
    prependPathRefs: () => prependPathRefs,
    extractInboundAttachments: () => extractInboundAttachments
  });
  function QJe(e) {
    logForDebugging(`[bridge:inbound-attach] ${e}`);
  }
  function extractInboundAttachments(e) {
    if (typeof e !== "object" || e === null || !("file_attachments" in e)) {
      return [];
    }
    let t = Wvf().safeParse(e.file_attachments);
    return t.success ? t.data : [];
  }
  function Gvf(e) {
    return Crn.basename(e).replace(/[^a-zA-Z0-9._-]/g, "_") || "attachment";
  }
  function Vvf() {
    return Crn.join(er(), "uploads", getSessionId());
  }
  async function zvf(e) {
    let t = getBridgeAccessToken();
    if (!t) {
      QJe("skip: no oauth token");
      return;
    }
    let n;
    try {
      let a = `${getBridgeBaseUrl()}/api/oauth/files/${encodeURIComponent(e.file_uuid)}/content`;
      let l = await NP.get(a, {
        headers: {
          Authorization: `Bearer ${t}`
        },
        responseType: "arraybuffer",
        timeout: 30000,
        validateStatus: () => true
      });
      if (l.status !== 200) {
        QJe(`fetch ${e.file_uuid} failed: status=${l.status}`);
        return;
      }
      n = Buffer.from(l.data);
    } catch (a) {
      QJe(`fetch ${e.file_uuid} threw: ${a}`);
      return;
    }
    let r = Gvf(e.file_name);
    let o = (e.file_uuid.slice(0, 8) || $wc.randomUUID().slice(0, 8)).replace(/[^a-zA-Z0-9_-]/g, "_");
    let s = Vvf();
    let i = Crn.join(s, `${o}-${r}`);
    try {
      await ehr.mkdir(s, {
        recursive: true
      });
      await ehr.writeFile(i, n);
    } catch (a) {
      QJe(`write ${i} failed: ${a}`);
      return;
    }
    QJe(`resolved ${e.file_uuid} \u2192 ${i} (${n.length} bytes)`);
    return i;
  }
  async function resolveInboundAttachments(e) {
    if (e.length === 0) {
      return "";
    }
    if (QJe(`resolving ${e.length} attachment(s)`), !getBridgeAccessToken()) {
      QJe("skip: no oauth token");
      Et("bridge_attachment_resolve", "no_token");
      return "";
    }
    let n = (await Promise.all(e.map(zvf))).filter(r => r !== undefined);
    if (n.length === 0) {
      Ae("bridge_attachment_resolve", "all_failed");
      return "";
    }
    if (n.length < e.length) {
      Et("bridge_attachment_resolve", "partial_failed");
    } else {
      Pe("bridge_attachment_resolve");
    }
    return n.map(r => `@"${r}"`).join(" ") + " ";
  }
  function prependPathRefs(e, t) {
    if (!t) {
      return e;
    }
    if (typeof e === "string") {
      return t + e;
    }
    let n = e.findLastIndex(r => r.type === "text");
    if (n !== -1) {
      let r = e[n];
      if (r.type === "text") {
        return [...e.slice(0, n), {
          ...r,
          text: t + r.text
        }, ...e.slice(n + 1)];
      }
    }
    return [...e, {
      type: "text",
      text: t.trimEnd()
    }];
  }
  async function resolveAndPrepend(e, t) {
    let n = extractInboundAttachments(e);
    if (n.length === 0) {
      return t;
    }
    let r = await resolveInboundAttachments(n);
    return prependPathRefs(t, r);
  }
  var $wc;
  var ehr;
  var Crn;
  var qvf;
  var Wvf;
  var WJo = __lazy(() => {
    Dp();
    at();
    ln();
    je();
    gn();
    wZ();
    $wc = require("crypto");
    ehr = require("fs/promises");
    Crn = require("path");
    qvf = we(() => v.object({
      file_uuid: v.string(),
      file_name: v.string(),
      is_image: v.boolean().nullish()
    }));
    Wvf = we(() => v.array(qvf()));
  });
  function Yvf(e, t) {
    let n = Jve(e);
    if (!n) {
      return null;
    }
    let r = findCommand(n.commandName, t);
    if (!r || !ALe(r, n.args)) {
      return null;
    }
    let o = r.type === "local" && isBridgeSafeCommand(r) ? r : findBridgeFallback(r);
    if (!o || o.type !== "local") {
      return null;
    }
    return {
      target: o,
      args: n.args,
      displayName: getCommandName(r)
    };
  }
  function Gwc(e, t, n, r, o, s, i, a) {
    let l = useClock();
    let c = kT.useRef(null);
    let u = kT.useRef(undefined);
    let d = kT.useRef(0);
    let p = kT.useRef(undefined);
    let m = kT.useRef(0);
    let f = kT.useRef(undefined);
    let h = kT.useRef(undefined);
    let g = kT.useRef(undefined);
    let y = kT.useRef(undefined);
    let _ = kT.useRef(undefined);
    let b = kT.useRef(undefined);
    let S = kT.useRef(undefined);
    let E = Lo();
    let C = kT.useRef(r);
    C.current = r;
    let x = kT.useRef(a);
    x.current = a;
    let A = Q => {
      let Z = x.current;
      if (!Z) {
        return false;
      }
      let ne = Yvf(Q, C.current);
      if (!ne) {
        return false;
      }
      logEvent("tengu_immediate_command_executed", {
        commandName: ne.displayName,
        fromKeybinding: false,
        bridgeOrigin: true
      });
      Z(ne.target, ne.args, ne.displayName);
      return true;
    };
    let k = kT.useRef(o);
    k.current = o;
    let I = kT.useRef(e);
    I.current = e;
    let O = Ec();
    let M = Rv();
    let {
      addNotification: L,
      removeNotification: P
    } = Fi();
    let F = bt(Q => Q.replBridgeEnabled);
    let H = bt(Q => Q.replBridgeConnected);
    let U = bt(Q => Q.replBridgeOutboundOnly);
    let N = bt(Q => Q.replBridgeInitialName);
    let W = bt(Q => Q.toolPermissionContext.mode);
    let j = bt(Q => Q.fastMode);
    let [z, V] = kT.useState(() => process.env.CLAUDE_BG_SOURCE === "spare");
    if (z && e.some(MTe)) {
      V(false);
    }
    kT.useEffect(() => {
      if (va() || z) {
        return;
      }
      logEvent("tengu_bridge_repl_evaluated", {
        would_auto_on: getCcrAutoConnectDefault(),
        repl_bridge_enabled: O.getState().replBridgeEnabled
      });
    }, [O, z]);
    let K = kT.useCallback(() => {
      let Q = c.current;
      if (!Q || !getFeatureValue_CACHED_MAY_BE_STALE("tengu_bridge_system_init", false)) {
        return;
      }
      (async () => {
        try {
          let Z = await getSlashCommandToolSkills(Nt());
          let ne = O.getState();
          let oe = performance.now();
          let ee = NRt({
            ...MRt(),
            tools: [],
            mcpClients: [],
            model: k.current,
            permissionMode: qA(ne.toolPermissionContext.mode),
            commands: C.current.filter(isBridgeDispatchable),
            agents: ne.agentDefinitions.activeAgents,
            skills: Z,
            plugins: [],
            pluginErrors: [],
            pluginWarnings: [],
            fastModeState: u2(k.current, ne.fastMode)
          });
          Dfr(ee, oe);
          Q.writeSdkMessages([ee]);
        } catch (Z) {
          logForDebugging(`[bridge:repl] Failed to send system/init: ${he(Z)}`, {
            level: "error"
          });
        }
      })();
    }, [O]);
    kT.useEffect(() => {
      if (!H || U) {
        return;
      }
      K();
    }, [H, U, o, W, j, K]);
    kT.useEffect(() => {
      if (!F || va() || z) {
        return;
      }
      let Q = U;
      if (!Q) {
        P("bridge-failed");
        E(_e => _e.replBridgeError === undefined ? _e : {
          ..._e,
          replBridgeError: undefined
        });
      }
      let Z = O.getState().replBridgeExplicit;
      function ne(_e, xe = false) {
        if (logForDebugging(`[bridge:repl] notifyBridgeFailed detail="${_e}" outboundOnly=${Q} wasConnected=${xe}`), Q) {
          return;
        }
        L({
          key: "bridge-failed",
          kind: "warning",
          jsx: vhe.jsxs(vhe.Fragment, {
            children: [vhe.jsxs(Text, {
              color: "error",
              children: ["Remote Control ", xe ? "disconnected" : "failed"]
            }), vhe.jsxs(Text, {
              dimColor: true,
              children: [" \xB7 ", _e || "/remote-control"]
            })]
          }),
          priority: "immediate",
          requeueOnPreempt: true,
          invalidates: ["bridge-failed"]
        });
      }
      function oe(_e) {
        ne(_e);
        E(xe => ({
          ...xe,
          replBridgeError: _e
        }));
        ue();
      }
      if (m.current >= 3) {
        logForDebugging(`[bridge:repl] Hook: ${m.current} consecutive init failures, not retrying this session`);
        ne("disabled after repeated failures \xB7 restart to retry");
        E(_e => {
          if (_e.replBridgeError === "disabled after repeated failures \xB7 restart to retry" && !_e.replBridgeEnabled) {
            return _e;
          }
          return {
            ..._e,
            replBridgeError: "disabled after repeated failures \xB7 restart to retry",
            replBridgeEnabled: false
          };
        });
        return;
      }
      if (!Q) {
        _wo(({
          status: _e,
          payloadType: xe
        }) => {
          let ke = xe === "control_response" ? "permission response" : "message";
          L({
            key: "bridge-attestation-drop",
            kind: "warning",
            jsx: vhe.jsxs(vhe.Fragment, {
              children: [vhe.jsxs(Text, {
                color: "error",
                children: ["Remote Control: unsigned ", ke, " rejected"]
              }), vhe.jsxs(Text, {
                dimColor: true,
                children: [" \xB7 attestation: ", _e]
              })]
            }),
            priority: "immediate"
          });
          let Ie = `Remote Control received a ${ke} without a valid device signature (attestation: ${_e}) and will not execute it.`;
          t(Ue => {
            let Ge = Ue.at(-1);
            if (Ge?.type === "system" && Ge.subtype === "informational" && Ge.content === Ie) {
              return Ue;
            }
            return [...Ue, wc(Ie, "warning")];
          });
        });
      }
      let ee = false;
      let re = e.length;
      let se = getSessionId();
      let ae = wh();
      let de = () => se === getSessionId() ? getMaterializedSessionFile() ?? ae : ae;
      if (b.current !== undefined && b.current !== se) {
        f.current = undefined;
        h.current = undefined;
        g.current = undefined;
        y.current = undefined;
        _.current = undefined;
        b.current = undefined;
        S.current?.();
        S.current = undefined;
      }
      let be = _.current !== undefined && e[0]?.uuid !== _.current;
      if (be) {
        clearBridgeSessionCache();
      }
      let fe = !be && y.current !== undefined ? Math.min(y.current, e.length) : undefined;
      let me = false;
      let Te = false;
      function ue() {
        let _e = I.current[0]?.uuid;
        p.current = l.setTimeout(() => {
          if (ee) {
            return;
          }
          p.current = undefined;
          let xe = c.current;
          if (xe) {
            f.current = xe.bridgeSessionId;
            h.current = xe.getLastSequenceNum();
            g.current = le.size > 0 ? new Set(le) : undefined;
            y.current = d.current;
            _.current = _e;
            b.current = se;
            S.current?.();
            S.current = xe.archive ? Ti(() => xe.archive?.()) : undefined;
          }
          E(ke => {
            if (!ke.replBridgeError) {
              return ke;
            }
            me = true;
            return {
              ...ke,
              replBridgeEnabled: false,
              ...(xe && {
                replBridgeSkipNextArchive: true
              })
            };
          });
        }, 1e4);
      }
      let ce = new Map();
      let le = new Set();
      if (!be && f.current !== undefined) {
        for (let _e of g.current ?? []) {
          le.add(_e);
        }
      }
      function pe(_e) {
        let xe = _e.response?.request_id;
        if (!xe) {
          return false;
        }
        let ke = ce.get(xe);
        if (!ke) {
          logForDebugging(`[bridge:repl] No handler for control_response request_id=${xe} (late response after local resolve, stale reattach dialog, or unknown id)`, {
            level: "verbose"
          });
          return false;
        }
        ce.delete(xe);
        let Ie = _e.response;
        if (Ie.subtype === "success" && Ie.response && Nyl(Ie.response)) {
          ke(Ie.response);
        }
        return true;
      }
      function ve(_e, xe) {
        if (logForDebugging(`[bridge:repl] handleStateChange state=${_e} detail="${xe}" cancelled=${ee} outboundOnly=${Q}`), ee) {
          return;
        }
        if (Q) {
          if (logForDebugging(`[bridge:repl] Mirror state=${_e}${xe ? ` detail=${xe}` : ""}`), _e === "failed") {
            E(Ie => {
              if (!Ie.replBridgeConnected) {
                return Ie;
              }
              return {
                ...Ie,
                replBridgeConnected: false
              };
            });
          } else if (_e === "ready" || _e === "connected") {
            E(Ie => {
              if (Ie.replBridgeConnected) {
                return Ie;
              }
              return {
                ...Ie,
                replBridgeConnected: true
              };
            });
          }
          return;
        }
        let ke = c.current;
        switch (_e) {
          case "ready":
            P("bridge-failed");
            E(Ie => {
              let Ue = ke ? wS(ke.bridgeSessionId, ke.sessionIngressUrl) : Ie.replBridgeSessionUrl;
              let Ge = ke?.environmentId;
              let Be = ke?.bridgeSessionId;
              if (Ie.replBridgeConnected && !Ie.replBridgeSessionActive && !Ie.replBridgeReconnecting && Ie.replBridgeSessionUrl === Ue && Ie.replBridgeEnvironmentId === Ge && Ie.replBridgeSessionId === Be) {
                return Ie;
              }
              return {
                ...Ie,
                replBridgeConnected: true,
                replBridgeSessionActive: false,
                replBridgeReconnecting: false,
                replBridgeSessionUrl: Ue,
                replBridgeEnvironmentId: Ge,
                replBridgeSessionId: Be,
                replBridgeError: undefined
              };
            });
            break;
          case "connected":
            {
              P("bridge-failed");
              E(Ie => {
                if (Ie.replBridgeSessionActive) {
                  return Ie;
                }
                return {
                  ...Ie,
                  replBridgeConnected: true,
                  replBridgeSessionActive: true,
                  replBridgeReconnecting: false,
                  replBridgeError: undefined
                };
              });
              K();
              break;
            }
          case "reconnecting":
            E(Ie => {
              if (Ie.replBridgeReconnecting) {
                return Ie;
              }
              return {
                ...Ie,
                replBridgeReconnecting: true,
                replBridgeSessionActive: false
              };
            });
            break;
          case "failed":
            if (p.current?.(), ne(xe, ke !== null), xe === "session ended") {
              me = true;
              Te = true;
              E(Ie => ({
                ...Ie,
                replBridgeEnabled: false,
                replBridgeReconnecting: false,
                replBridgeSessionActive: false,
                replBridgeConnected: false,
                replBridgeError: undefined
              }));
              break;
            }
            E(Ie => ({
              ...Ie,
              replBridgeError: xe,
              replBridgeReconnecting: false,
              replBridgeSessionActive: false,
              replBridgeConnected: false
            }));
            ue();
            break;
        }
      }
      (async () => {
        try {
          if (u.current) {
            logForDebugging("[bridge:repl] Hook: waiting for previous teardown to complete before re-init");
            await u.current;
            u.current = undefined;
            logForDebugging("[bridge:repl] Hook: previous teardown complete, proceeding with re-init");
          }
          if (ee) {
            return;
          }
          let {
            initReplBridge: _e
          } = await Promise.resolve().then(() => (qJo(), jJo));
          let xe = await _e({
            outboundOnly: Q,
            reattachSessionId: be ? undefined : f.current,
            reattachSequenceNum: be ? undefined : h.current,
            tags: Q ? ["ccr-mirror"] : [Z ? "remote-control-repl" : "remote-control-auto"],
            getToolPermissionContext: () => O.getState().toolPermissionContext,
            getTools: () => s().tools,
            onInboundMessage: ke => Xvf(ke, A, undefined),
            onPermissionResponse: pe,
            getInitializeState() {
              return {
                current_model: k.current,
                current_permission_mode: qA(O.getState().toolPermissionContext.mode)
              };
            },
            onDialogKindsDeclared: Q ? undefined : (ke, Ie) => {
              let Ue = le.size;
              for (let Ge of ke) {
                if (le.size >= 32) {
                  break;
                }
                le.add(Ge);
              }
              if (Ie !== "restored" && le.size > Ue) {
                logEvent("tengu_repl_bridge_dialog_kinds_declared", {
                  kind_count: le.size,
                  has_refusal_fallback: le.vZc("refusal_fallback_prompt")
                });
                let Ge = c.current;
                if (Ge) {
                  saveBridgeSession(se, Ge.bridgeSessionId, Ge.getLastSequenceNum(), de(), [...le]);
                }
              }
            },
            onInterrupt() {
              M2n();
              logForDebugging("[bridge:repl] Remote interrupt \u2192 onCancel()");
              n.current();
            },
            onSetModel(ke) {
              let Ie = ke == null || ke.trim().toLowerCase() === "default";
              let Ue = Ie ? getDefaultMainLoopModel() : ke;
              if (!Ie && !isExemptDefaultResolvingPick(Ue) && !(isModelAllowedUnderActiveEnforcement(Ue) ?? isModelAllowed(Ue))) {
                let Ge = O.getState();
                let Be = wse(Ue, parseUserSpecifiedModel(_Qn(Ge.mainLoopModelForSession, Ge.mainLoopModel)));
                L({
                  key: `model-restricted-bridge-${$bt(Ue)}`,
                  kind: "warning",
                  text: Be,
                  priority: "immediate"
                });
                return {
                  ok: false,
                  error: Be
                };
              }
              setMainLoopModelOverride(Ue);
              E(Ge => {
                if (Ge.mainLoopModelForSession === Ue) {
                  return Ge;
                }
                return {
                  ...Ge,
                  mainLoopModelForSession: Ue
                };
              });
            },
            onSetMaxThinkingTokens(ke) {
              let Ie = ke !== null;
              E(Ue => {
                if (Ue.thinkingEnabled === Ie) {
                  return Ue;
                }
                return {
                  ...Ue,
                  thinkingEnabled: Ie
                };
              });
            },
            onSetPermissionMode: ke => Qvf(ke, O, E),
            onMcpStatus() {
              return O.getState().mcp.clients.map(ke => {
                let Ie;
                if (ke.config.type === "sse" || ke.config.type === "http") {
                  Ie = {
                    type: ke.config.type,
                    url: ke.config.url
                  };
                } else if (ke.config.type === "claudeai-proxy") {
                  Ie = {
                    type: "claudeai-proxy",
                    url: ke.config.url,
                    id: ke.config.id
                  };
                } else if (ke.config.type === "stdio" || ke.config.type === undefined) {
                  Ie = {
                    type: "stdio",
                    command: ke.config.command,
                    args: ke.config.args
                  };
                }
                return {
                  name: ke.name,
                  status: ke.type,
                  config: Ie,
                  scope: ke.config.scope,
                  serverInfo: ke.type === "connected" ? ke.serverInfo : undefined,
                  error: ke.type === "failed" ? ke.error : undefined
                };
              });
            },
            async onMcpAuthenticate(ke, Ie) {
              let Ue = O.getState().mcp.clients.find(Tt => Tt.name === ke)?.config;
              if (!Ue) {
                throw Error(`MCP server "${ke}" not found`);
              }
              let Ge = ZV(ke, Ue);
              if (Ge.kind === "claudeai-proxy") {
                let Tt = aNe(Ge.config);
                if (!Tt) {
                  throw Error("Unable to build claude.ai connector auth URL (missing org or server id)");
                }
                logEvent("tengu_claudeai_mcp_auth_started", {});
                return {
                  authUrl: Tt,
                  requiresUserAction: true,
                  callbackExpected: false
                };
              }
              if (Ge.kind === "unsupported-transport") {
                throw Error(`Server type "${Ge.transport}" does not support OAuth authentication`);
              }
              if (Ge.kind === "anthropic-hosted") {
                throw Error(Ge.message);
              }
              let Be = Tt => {
                let kt;
                let Ye = new Promise(wt => {
                  kt = wt;
                });
                let ht;
                let It;
                let Rt = dQ(ke, Ge.config, wt => kt(wt), undefined, {
                  skipBrowserOpen: true,
                  redirectUri: Tt,
                  onWaitingForCallback: (wt, vt, yt) => {
                    ht = vt;
                    It = yt;
                  }
                });
                Xft(ke, Rt);
                return Promise.race([Ye.then(wt => ({
                  authUrl: wt,
                  callbackPort: ht,
                  state: It
                })), Rt.then(() => null)]);
              };
              let We = null;
              let Ze = "localhost";
              if (Ie && !Ge.config.oauth?.clientId) {
                try {
                  We = await Be(Ie);
                  Ze = "custom";
                } catch (Tt) {
                  logForDebugging(`[bridge:mcp] AS rejected custom redirectUri for ${ke}; falling back to localhost: ${he(Tt)}`);
                }
              }
              if (Ze === "localhost") {
                We = await Be();
              }
              if (!We) {
                return {
                  requiresUserAction: false,
                  callbackExpected: false
                };
              }
              return {
                authUrl: We.authUrl,
                requiresUserAction: true,
                callbackExpected: true,
                redirectScheme: Ze,
                state: We.state,
                ...(Ze === "localhost" && {
                  callbackPort: We.callbackPort
                })
              };
            },
            async onMcpOauthCallbackUrl(ke, Ie) {
              let Ue = Jft(ke);
              if (!Ue) {
                throw Error(`No OAuth flow in progress for "${ke}" \u2014 call mcp_authenticate first`);
              }
              if (!Ue(Ie)) {
                throw Error("Invalid callback URL \u2014 no authorization code. The flow is still open; retry with the full redirect URL.");
              }
              let Ge = Qft(ke);
              if (Ge) {
                await Ge;
              }
            },
            async onMcpReconnect(ke) {
              let Ie = par();
              if (!Ie) {
                throw Error("MCP controls aren't available right now \u2014 the terminal is still starting up or is showing another view");
              }
              y6l(O.getState().mcp.clients, ke);
              let Ue = await Ie(ke);
              if (Ue.client.type !== "connected") {
                throw Error(Ue.client.type === "failed" ? Ue.client.error ?? "Connection failed" : `Server status: ${Ue.client.type}`);
              }
            },
            async onGetContextUsage() {
              if (The()) {
                let We = i?.current;
                if (We && We.turnCount() > 0) {
                  return We.getContextUsage();
                }
              }
              let {
                collectContextData: ke
              } = await Promise.resolve().then(() => (zQt(), fqo));
              let Ie = O.getState();
              let {
                tools: Ue,
                customSystemPrompt: Ge,
                appendSystemPrompt: Be
              } = s();
              return ke({
                messages: I.current,
                getAppState: O.getState,
                getMcp: () => O.getState().mcp,
                options: {
                  mainLoopModel: k.current,
                  tools: Ue,
                  agentDefinitions: Ie.agentDefinitions,
                  customSystemPrompt: Ge,
                  appendSystemPrompt: Be
                }
              });
            },
            async onGetUsage() {
              let {
                collectUsageData: ke
              } = await Promise.resolve().then(() => (HQt(), b3l));
              return ke({
                includeBehaviors: false
              });
            },
            onSetColor(ke) {
              let Ie = ke === "default";
              if (!Ie && !eb.includes(ke)) {
                return {
                  ok: false,
                  error: `Unknown color "${ke}". Available: ${eb.join(", ")}, default`
                };
              }
              let Ue = Ie ? undefined : ke;
              let Ge = getSessionId();
              saveAgentColor(Ge, ke, getMaterializedSessionFile() ?? wh()).catch(Ze => {
                logForDebugging(`saveAgentColor: transcript append failed: ${he(Ze)}`);
              });
              let Be = O.getState();
              let We = Be.agent ? Be.agentDefinitions.activeAgents.find(Ze => Ze.agentType === Be.agent) : undefined;
              fFn(fT(), Rbt({
                userOverride: Ue,
                agentDefinitionColor: We?.color
              }));
              E(Ze => {
                if (Ze.standaloneAgentContext?.color === Ue) {
                  return Ze;
                }
                return {
                  ...Ze,
                  standaloneAgentContext: {
                    ...Ze.standaloneAgentContext,
                    name: Ze.standaloneAgentContext?.name ?? "",
                    color: Ue
                  }
                };
              });
              return {
                ok: true
              };
            },
            onStateChange: ve,
            initialMessages: fe !== undefined ? e.slice(0, fe) : e.length > 0 ? e : undefined,
            getMessages: () => I.current,
            initialName: N,
            enableSessionPersistence: Q || isPersistentRemoteSessionEnabled() || isRemoteControlInternalEventsEnabled()
          });
          if (ee) {
            if (logForDebugging("[bridge:repl] Hook: init cancelled during flight, tearing down"), xe) {
              xe.teardown();
            }
            return;
          }
          if (!xe) {
            if (m.current++, logForDebugging(`[bridge:repl] Init returned null (precondition or session creation failed); consecutive failures: ${m.current}`), p.current?.(), O.getState().replBridgeError !== undefined) {
              ue();
            } else if (Z && !Q && isBridgeEnabled()) {
              oe("/login");
            } else {
              E(ke => ke.replBridgeEnabled ? {
                ...ke,
                replBridgeEnabled: false
              } : ke);
            }
            return;
          }
          if (c.current = xe, yyo(xe), detectCurrentRepositoryWithHost(), m.current = 0, !Q) {
            P("bridge-failed");
          }
          if (f.current = undefined, h.current = undefined, g.current = undefined, y.current = undefined, _.current = undefined, b.current = undefined, S.current?.(), S.current = undefined, d.current = fe ?? re, li()) {
            twf(xe.bridgeSessionId, Q);
          } else if (!Q) {
            saveBridgeSession(se, xe.bridgeSessionId, xe.getLastSequenceNum(), de(), [...le]);
          }
          if (Q) {
            E(ke => {
              if (ke.replBridgeConnected && ke.replBridgeSessionId === xe.bridgeSessionId) {
                return ke;
              }
              return {
                ...ke,
                replBridgeConnected: true,
                replBridgeSessionId: xe.bridgeSessionId,
                replBridgeSessionUrl: undefined,
                replBridgeConnectUrl: undefined
              };
            });
            logForDebugging(`[bridge:repl] Mirror initialized, session=${xe.bridgeSessionId}`);
          } else {
            let ke = Zvf(xe, ce);
            let Ie = wS(xe.bridgeSessionId, xe.sessionIngressUrl);
            if (E(Ue => ({
              ...Ue,
              replBridgePermissionCallbacks: ke,
              replBridgeConnected: true,
              replBridgeSessionUrl: Ie,
              replBridgeEnvironmentId: xe.environmentId,
              replBridgeSessionId: xe.bridgeSessionId,
              replBridgeError: undefined
            })), Z) {
              t(Ue => Ue.some(Ge => Ge.type === "system" && Ge.subtype === "bridge_status" && Ge.url === Ie) ? Ue : [...Ue, _yc(Ie)]);
            }
            logForDebugging(`[bridge:repl] Hook initialized, session=${xe.bridgeSessionId}`);
          }
        } catch (_e) {
          if (ee) {
            return;
          }
          m.current++;
          let xe = he(_e);
          if (logForDebugging(`[bridge:repl] Init failed: ${xe}; consecutive failures: ${m.current}`), p.current?.(), Q) {
            E(ke => ke.replBridgeEnabled ? {
              ...ke,
              replBridgeEnabled: false
            } : ke);
          } else {
            oe(xe);
          }
        }
      })();
      return () => {
        ee = true;
        _wo(undefined);
        p.current?.();
        p.current = undefined;
        let _e = O.getState().replBridgeSkipNextArchive;
        if (_e) {
          E(xe => {
            if (!xe.replBridgeSkipNextArchive) {
              return xe;
            }
            return {
              ...xe,
              replBridgeSkipNextArchive: false
            };
          });
        }
        if (c.current) {
          let xe = c.current;
          let ke = !O.getState().replBridgeEnabled && !me;
          let Ie = _e;
          if (!me) {
            f.current = undefined;
            h.current = undefined;
            g.current = undefined;
            y.current = undefined;
            _.current = undefined;
            b.current = undefined;
            S.current?.();
            S.current = undefined;
          }
          if (!Q) {
            if ((ke || Te) && !_e) {
              if (clearBridgeSession(se, de()), li()) {
                ewf();
              }
            } else if (_e && !me) {
              clearBridgeSessionCache();
            } else {
              saveBridgeSession(se, xe.bridgeSessionId, xe.getLastSequenceNum(), de(), [...le]);
            }
          }
          let Ue = Q !== O.getState().replBridgeOutboundOnly && O.getState().replBridgeEnabled;
          let Ge = _e || me || Ue ? undefined : ke ? "remote_control_disabled" : "host_exit";
          logForDebugging(`[bridge:repl] Hook cleanup: starting teardown for session=${xe.bridgeSessionId}${Ie ? " (skipArchive)" : ""}${Ge ? ` reason=${Ge}` : ""}`);
          u.current = xe.teardown({
            skipArchive: Ie,
            reason: Ge
          });
          c.current = null;
          yyo(null);
        }
        if (!me && !Q) {
          P("bridge-failed");
        }
        E(xe => {
          let ke = me || Q ? xe.replBridgeError : undefined;
          if (!xe.replBridgeConnected && !xe.replBridgeSessionActive && !xe.replBridgeReconnecting && !xe.replBridgeConnectUrl && !xe.replBridgeSessionUrl && !xe.replBridgeEnvironmentId && !xe.replBridgeSessionId && !xe.replBridgePermissionCallbacks && xe.replBridgeError === ke) {
            return xe;
          }
          return {
            ...xe,
            replBridgeConnected: false,
            replBridgeSessionActive: false,
            replBridgeReconnecting: false,
            replBridgeConnectUrl: undefined,
            replBridgeSessionUrl: undefined,
            replBridgeEnvironmentId: undefined,
            replBridgeSessionId: undefined,
            replBridgeError: ke,
            replBridgePermissionCallbacks: undefined
          };
        });
        d.current = 0;
      };
    }, [F, U, z, E, t, L, P, K, l]);
    kT.useEffect(() => {
      if (!H) {
        return;
      }
      let Q = c.current;
      if (!Q) {
        return;
      }
      if (d.current > e.length) {
        logForDebugging(`[bridge:repl] Compaction detected: lastWrittenIndex=${d.current} > messages.length=${e.length}, clamping`);
      }
      let Z = Math.min(d.current, e.length);
      let ne = [];
      for (let oe = Z; oe < e.length; oe++) {
        let ee = e[oe];
        if (ee && (ee.type === "user" || ee.type === "assistant" || ee.type === "system" && ee.subtype === "local_command")) {
          ne.push(ee);
        }
      }
      if (d.current = e.length, ne.length > 0) {
        Q.writeMessages(ne);
      }
    }, [e, H]);
    kT.useEffect(() => {
      if (!H) {
        return;
      }
      let Q = () => {
        let Z = c.current;
        if (!Z) {
          return;
        }
        let ne = VX().filter(oe => oe.subtype === "task_started" || oe.subtype === "task_progress" || oe.subtype === "task_updated" || oe.subtype === "task_notification" || oe.subtype === "thinking_tokens");
        if (ne.length > 0) {
          Z.writeSdkMessages(ne);
        }
      };
      b5e(Q);
      Q();
      return () => b5e(null);
    }, [H]);
    kT.useEffect(() => {
      if (!F) {
        VX();
      }
    }, [F]);
    return {
      sendBridgeResult: kT.useCallback(() => {
        c.current?.sendResult();
      }, [])
    };
  }
  async function Xvf(e, t, n) {
    let r = Wwc;
    let o;
    Wwc = new Promise(s => {
      o = s;
    });
    try {
      let s = Yfr(e);
      if (!s) {
        return;
      }
      let {
        uuid: i
      } = s;
      let a = undefined;
      if (a?.kind !== "peer" && typeof s.content === "string" && t(s.content)) {
        logForDebugging(`[bridge:repl] Ran immediate command without enqueue: ${s.content.slice(0, 80)}${i ? ` uuid=${i}` : ""}`);
        return;
      }
      await r;
      let {
        resolveAndPrepend: l
      } = await Promise.resolve().then(() => (WJo(), qwc));
      let c = s.content;
      let u = await l(e, c);
      let d = typeof u === "string" ? u.slice(0, 80) : `[${u.length} content blocks]`;
      logForDebugging(`[bridge:repl] Injecting inbound user message: ${d}${i ? ` uuid=${i}` : ""}`);
      let p = mrn(a, s.clientPlatform);
      __({
        value: u,
        mode: "prompt",
        agentId: mainAgentId(),
        uuid: i,
        skipSlashCommands: true,
        ...(a?.kind === "peer" ? {
          origin: a,
          isMeta: true,
          ...(grn() && {
            priority: "later"
          })
        } : {
          bridgeOrigin: true,
          clientPlatform: s.clientPlatform,
          ...(p && {
            origin: p
          }),
          ...(p?.kind === "task-notification" && drn(undefined, s.clientPlatform) === "later" && {
            priority: "later"
          }),
          ...(prn(s.clientPlatform, s.inboundOrigin) && {
            priority: frn(undefined, u, hrn()),
            verifiedSlackHumanTurn: true
          })
        })
      });
    } catch (s) {
      logForDebugging(`[bridge:repl] handleInboundMessage failed: ${s}`, {
        level: "error"
      });
    } finally {
      r.then(o, o);
    }
  }
  function Qvf(e, t, n) {
    if (e === "bypassPermissions") {
      if (isBypassPermissionsModeDisabled()) {
        return {
          ok: false,
          error: "Cannot set permission mode to bypassPermissions because it is disabled by settings or configuration"
        };
      }
      if (!t.getState().toolPermissionContext.isBypassPermissionsModeAvailable) {
        return {
          ok: false,
          error: "Cannot set permission mode to bypassPermissions because the session was not launched with --dangerously-skip-permissions"
        };
      }
    }
    if (e === "auto" && !isAutoModeGateEnabled()) {
      let r = getAutoModeUnavailableReason();
      return {
        ok: false,
        error: r ? `Cannot set permission mode to auto: ${getAutoModeUnavailableNotification(r)}` : "Cannot set permission mode to auto"
      };
    }
    n(r => {
      let o = r.toolPermissionContext.mode;
      if (o === e) {
        return r;
      }
      let s = transitionPermissionMode(o, e, r.toolPermissionContext);
      return {
        ...r,
        toolPermissionContext: {
          ...s,
          mode: e
        }
      };
    });
    setImmediate(() => {
      qIe.emit();
    });
    return {
      ok: true
    };
  }
  function Zvf(e, t) {
    return {
      sendRequest(n, r, o, s, i, a, l) {
        e.sendControlRequest({
          type: "control_request",
          request_id: n,
          request: {
            subtype: "can_use_tool",
            tool_name: r,
            display_name: Ume(r),
            input: o,
            tool_use_id: s,
            description: i,
            ...(a && {
              permission_suggestions: a
            }),
            ...(l && {
              blocked_path: l
            })
          }
        });
      },
      sendResponse(n, r) {
        let o = {
          ...r
        };
        e.sendControlResponse({
          type: "control_response",
          response: {
            subtype: "success",
            request_id: n,
            response: o
          }
        });
      },
      cancelRequest(n) {
        e.sendControlCancelRequest(n);
        t.delete(n);
      },
      onResponse(n, r) {
        t.set(n, r);
        return () => {
          t.delete(n);
        };
      }
    };
  }
  async function ewf() {
    let e = process.env.CLAUDE_JOB_DIR;
    if (!e) {
      return;
    }
    try {
      let t = await Zi(e);
      if (!t || t.bridgeSessionId === undefined) {
        return;
      }
      fS(e);
      let n = (await Zi(e)) ?? t;
      await ip(e, {
        ...n,
        bridgeSessionId: undefined,
        bridgeOutboundOnly: undefined,
        bridgeSessionSeq: undefined,
        updatedAt: new Date().toISOString()
      });
    } catch (t) {
      lf(t);
    }
  }
  async function twf(e, t) {
    let n = process.env.CLAUDE_JOB_DIR;
    if (!n) {
      return;
    }
    try {
      let r = await Zi(n);
      if (!r || r.bridgeSessionId === e && r.bridgeOutboundOnly === t) {
        return;
      }
      fS(n);
      let o = (await Zi(n)) ?? r;
      await ip(n, {
        ...o,
        bridgeSessionId: e,
        bridgeOutboundOnly: t,
        bridgeSessionSeq: o.bridgeSessionId === e ? o.bridgeSessionSeq : undefined,
        updatedAt: new Date().toISOString()
      });
    } catch (r) {
      lf(r);
    }
  }
  var kT;
  var vhe;
  var Wwc;
  var Vwc = __lazy(() => {
    at();
    at();
    Ox();
    GXn();
    yse();
    Qfr();
    k8e();
    Jfr();
    x$();
    Bm();
    Nd();
    et();
    zf();
    bde();
    ru();
    $n();
    Ot();
    Moe();
    D6e();
    l9();
    Hfe();
    Wfr();
    ho();
    _9();
    lLe();
    $U();
    hd();
    yd();
    vo();
    je();
    bI();
    dt();
    GT();
    S$();
    Rn();
    Rf();
    nrn();
    ro();
    Eo();
    YN();
    HT();
    S_();
    Fy();
    fa();
    K7t();
    v$t();
    iH();
    kT = __toESM(ot(), 1);
    vhe = __toESM(ie(), 1);
    Wwc = Promise.resolve();
  });
  var Kwc = {};
  __export(Kwc, {
    selectableUserMessagesFilter: () => selectableUserMessagesFilter,
    replayableUserMessagesFilter: () => replayableUserMessagesFilter,
    messagesAfterAreOnlySynthetic: () => messagesAfterAreOnlySynthetic,
    MessageSelector: () => MessageSelector
  });
  function VJo(e) {
    return e === "summarize" || e === "summarize_up_to";
  }
  function MessageSelector({
    messages: e,
    onPreRestore: t,
    onRestoreMessage: n,
    onRestoreCode: r,
    onSummarize: o,
    onClose: s,
    preselectedMessage: i,
    onResumePreviousSession: a,
    parentSessionId: l
  }) {
    let c = bt(ce => ce.fileHistory);
    let [u, d] = tC.useState(undefined);
    let p = fileHistoryEnabled();
    let {
      rows: m
    } = Sr();
    let f = qs() ? Math.floor(m / 2) : m;
    let h = p ? 3 : 2;
    let g = 12;
    let y = Math.max(2, Math.floor((f - 12) / h));
    let _ = tC.useMemo(GJo.randomUUID, []);
    let b = tC.useMemo(GJo.randomUUID, []);
    let S = !!a;
    let E = tC.useMemo(() => [...(S ? [{
      ...In({
        content: ""
      }),
      uuid: b
    }] : []), ...e.filter(selectableUserMessagesFilter), {
      ...In({
        content: ""
      }),
      uuid: _
    }], [e, _, b, S]);
    let [C, x] = tC.useState(E.length - 1);
    let A = Math.max(0, Math.min(C - Math.floor(y / 2), E.length - y));
    let k = A + y;
    let I = E.length > 1;
    let [O, M] = tC.useState(i);
    let [L, P] = tC.useState(undefined);
    tC.useEffect(() => {
      if (!i || !p) {
        return;
      }
      let ce = false;
      fileHistoryGetDiffStats(c, i.uuid).then(le => {
        if (!ce) {
          P(le);
        }
      });
      return () => {
        ce = true;
      };
    }, [i, p, c]);
    let [F, H] = tC.useState(false);
    let [U, N] = tC.useState(null);
    let [W, j] = tC.useState("both");
    let [z, V] = tC.useState("");
    let [K, J] = tC.useState("");
    function Q(ce) {
      let le = ce ? [{
        value: "both",
        label: "Restore code and conversation"
      }, {
        value: "conversation",
        label: "Restore conversation"
      }, {
        value: "code",
        label: "Restore code"
      }] : [{
        value: "conversation",
        label: "Restore conversation"
      }];
      let pe = {
        type: "input",
        placeholder: "add context (optional)",
        initialValue: "",
        allowEmptySubmitToCancel: true,
        showLabelWithValue: true,
        labelValueSeparator: ": "
      };
      le.push({
        value: "summarize",
        label: "Summarize from here",
        ...pe,
        onChange: V
      });
      le.push({
        value: "summarize_up_to",
        label: "Summarize up to here",
        ...pe,
        onChange: J
      });
      le.push({
        value: "nevermind",
        label: "Never mind"
      });
      return le;
    }
    tC.useEffect(() => {
      logEvent("tengu_message_selector_opened", {});
    }, []);
    async function Z(ce) {
      t();
      H(true);
      try {
        await n(ce);
        H(false);
        s();
      } catch (le) {
        Oe(le);
        H(false);
        d(`Failed to restore the conversation:
${le}`);
      }
    }
    async function ne(ce) {
      if (ce.uuid === b) {
        t();
        s();
        a?.();
        return;
      }
      let le = e.indexOf(ce);
      let pe = e.length - 1 - le;
      if (logEvent("tengu_message_selector_selected", {
        index_from_end: pe,
        message_type: ce.type,
        is_current_prompt: false
      }), !e.includes(ce)) {
        s();
        return;
      }
      if (!p) {
        await Z(ce);
        return;
      }
      let ve = await fileHistoryGetDiffStats(c, ce.uuid);
      M(ce);
      P(ve);
    }
    async function oe(ce) {
      if (logEvent("tengu_message_selector_restore_option_selected", {
        option: ce
      }), !O) {
        d("Message not found.");
        return;
      }
      if (ce === "nevermind") {
        if (i) {
          s();
        } else {
          M(undefined);
        }
        return;
      }
      if (VJo(ce)) {
        t();
        H(true);
        N(ce);
        d(undefined);
        try {
          let ve = ce === "summarize_up_to" ? "up_to" : "from";
          let _e = (ve === "up_to" ? K : z).trim() || undefined;
          await o(O, _e, ve);
          H(false);
          N(null);
          M(undefined);
          s();
        } catch (ve) {
          if (!(ve instanceof d5)) {
            Oe(ve);
          }
          H(false);
          N(null);
          M(undefined);
          d(`Failed to summarize:
${ve}`);
        }
        return;
      }
      t();
      H(true);
      d(undefined);
      let le = null;
      let pe = null;
      if (ce === "code" || ce === "both") {
        try {
          await r(O);
        } catch (ve) {
          le = ve;
          Oe(le);
        }
      }
      if (ce === "conversation" || ce === "both") {
        try {
          await n(O);
        } catch (ve) {
          pe = ve;
          Oe(pe);
        }
      }
      if (H(false), M(undefined), pe && le) {
        d(`Failed to restore the conversation and code:
${pe}
${le}`);
      } else if (pe) {
        d(`Failed to restore the conversation:
${pe}`);
      } else if (le) {
        d(`Failed to restore the code:
${le}`);
      } else {
        s();
      }
    }
    let ee = tC.useCallback(() => {
      if (O && !i) {
        M(undefined);
        return;
      }
      logEvent("tengu_message_selector_cancelled", {});
      s();
    }, [s, O, i]);
    let re = tC.useCallback(() => x(ce => Math.max(0, ce - 1)), []);
    let se = tC.useCallback(() => x(ce => Math.min(E.length - 1, ce + 1)), [E.length]);
    let ae = tC.useCallback(() => x(0), []);
    let de = tC.useCallback(() => x(E.length - 1), [E.length]);
    let be = tC.useCallback(() => {
      let ce = E[C];
      if (ce) {
        ne(ce);
      }
    }, [E, C, ne]);
    Eg(undefined, undefined, !!O);
    jo({
      "messageSelector:up": re,
      "messageSelector:down": se,
      "messageSelector:top": ae,
      "messageSelector:bottom": de,
      "messageSelector:select": be
    }, {
      context: "MessageSelector",
      isActive: !F && !u && !O && I
    });
    let [fe, me] = tC.useState({});
    tC.useEffect(() => {
      async function ce() {
        if (!p) {
          return;
        }
        Promise.all(E.map(async (le, pe) => {
          if (le.uuid !== _ && le.uuid !== b) {
            let ve = fileHistoryCanRestore(c, le.uuid);
            let _e = E.at(pe + 1);
            let xe = ve ? swf(e, le.uuid, _e?.uuid !== _ ? _e?.uuid : undefined) : undefined;
            if (xe !== undefined) {
              me(ke => ({
                ...ke,
                [pe]: xe
              }));
            } else {
              me(ke => ({
                ...ke,
                [pe]: undefined
              }));
            }
          }
        }));
      }
      ce();
    }, [E, e, _, b, c, p]);
    let Te = p && L?.filesChanged && L.filesChanged.length > 0;
    let ue = !u && !O && !i && I;
    return fl.jsxs(or, {
      title: "Rewind",
      color: "suggestion",
      onCancel: ee,
      isCancelActive: !O,
      hideInputGuide: !!O,
      inputGuide: fl.jsxs(Hn, {
        children: [!u && I && fl.jsx(xt, {
          chord: "enter",
          action: "continue"
        }), fl.jsx(xt, {
          chord: "escape",
          action: "cancel"
        })]
      }),
      children: [fl.jsx(Hc, {
        error: u
      }), !I && fl.jsx(sc, {
        children: "Nothing to rewind to yet."
      }), !u && O && I && fl.jsxs(fl.Fragment, {
        children: [fl.jsxs(Text, {
          children: ["Confirm you want to restore", " ", !L && "the conversation ", "to the point before you sent this message:"]
        }), fl.jsxs(gXd, {
          flexDirection: "column",
          paddingLeft: 1,
          borderStyle: "single",
          borderRight: false,
          borderTop: false,
          borderBottom: false,
          borderLeft: true,
          borderLeftDimColor: true,
          children: [fl.jsx(zwc, {
            userMessage: O,
            color: "text",
            isCurrent: false
          }), fl.jsxs(Text, {
            dimColor: true,
            children: ["(", formatRelativeTimeAgo(new Date(O.timestamp)), ")"]
          })]
        }), fl.jsx(rwf, {
          selectedRestoreOption: W,
          canRestoreCode: !!Te,
          diffStatsForRestore: L
        }), F && VJo(U) ? fl.jsxs(gXd, {
          flexDirection: "row",
          gap: 1,
          children: [fl.jsx(Ed, {}), fl.jsx(Text, {
            children: "Summarizing\u2026"
          })]
        }) : fl.jsx(xr, {
          isDisabled: F,
          options: Q(!!Te),
          defaultFocusValue: Te ? "both" : "conversation",
          onFocus: ce => j(ce),
          onChange: ce => oe(ce),
          onCancel: () => i ? s() : M(undefined)
        }), Te && fl.jsx(gXd, {
          marginBottom: 1,
          children: fl.jsxs(Text, {
            dimColor: true,
            children: [vGd.warning, " Rewinding does not affect files edited manually or via bash."]
          })
        })]
      }), ue && fl.jsxs(fl.Fragment, {
        children: [p ? fl.jsx(Text, {
          children: "Restore the code and/or conversation to the point before\u2026"
        }) : fl.jsx(Text, {
          children: "Restore and fork the conversation to the point before\u2026"
        }), A > 0 && fl.jsx(gXd, {
          paddingLeft: 1,
          children: fl.jsxs(Text, {
            dimColor: true,
            children: [vGd.arrowUp, " ", A, " more above"]
          })
        }), fl.jsx(gXd, {
          width: "100%",
          flexDirection: "column",
          children: E.slice(A, k).map((ce, le) => {
            let pe = A + le;
            let ve = pe === C;
            let _e = ce.uuid === _;
            let xe = ce.uuid === b;
            let ke = pe in fe;
            let Ie = fe[pe];
            let Ue = Ie?.filesChanged && Ie.filesChanged.length;
            return fl.jsxs(gXd, {
              height: p ? 3 : 2,
              overflow: "hidden",
              width: "100%",
              flexDirection: "row",
              children: [fl.jsx(gXd, {
                width: 2,
                minWidth: 2,
                children: ve ? fl.jsxs(Text, {
                  color: "permission",
                  bold: true,
                  children: [vGd.pointer, " "]
                }) : fl.jsx(Text, {
                  children: "  "
                })
              }), fl.jsxs(gXd, {
                flexDirection: "column",
                children: [fl.jsx(gXd, {
                  flexShrink: 1,
                  height: 1,
                  overflow: "hidden",
                  children: xe ? fl.jsx(gXd, {
                    width: "100%",
                    children: fl.jsxs(Text, {
                      color: ve ? "suggestion" : undefined,
                      children: ["/resume ", l, " (previous session)"]
                    })
                  }) : fl.jsx(zwc, {
                    userMessage: ce,
                    color: ve ? "suggestion" : undefined,
                    isCurrent: _e,
                    paddingRight: 10
                  })
                }), p && ke && fl.jsx(gXd, {
                  height: 1,
                  flexDirection: "row",
                  children: Ie ? fl.jsx(fl.Fragment, {
                    children: fl.jsx(Text, {
                      dimColor: !ve,
                      color: "inactive",
                      children: Ue ? fl.jsxs(fl.Fragment, {
                        children: [Ue === 1 && Ie.filesChanged[0] ? `${GRt.basename(Ie.filesChanged[0])} ` : `${Ue} files changed `, fl.jsx(d9, {
                          added: Ie.insertions,
                          removed: Ie.deletions
                        })]
                      }) : fl.jsx(fl.Fragment, {
                        children: "No code changes"
                      })
                    })
                  }) : fl.jsxs(Text, {
                    dimColor: true,
                    color: "warning",
                    children: [vGd.warning, " No code restore"]
                  })
                })]
              })]
            }, ce.uuid);
          })
        }), k < E.length && fl.jsx(gXd, {
          paddingLeft: 1,
          children: fl.jsxs(Text, {
            dimColor: true,
            children: [vGd.arrowDown, " ", E.length - k, " ", "more below"]
          })
        })]
      })]
    });
  }
  function nwf(e) {
    switch (e) {
      case "summarize":
        return "Messages after this point will be summarized.";
      case "summarize_up_to":
        return "Preceding messages will be summarized. This and subsequent messages will remain unchanged \u2014 you will stay at the end of the conversation.";
      case "both":
      case "conversation":
        return "The conversation will be forked.";
      case "code":
      case "nevermind":
        return "The conversation will be unchanged.";
    }
  }
  function rwf(e) {
    let t = nhr.c(11);
    let {
      selectedRestoreOption: n,
      canRestoreCode: r,
      diffStatsForRestore: o
    } = e;
    let s = r && (n === "both" || n === "code");
    let i;
    if (t[0] !== n) {
      i = nwf(n);
      t[0] = n;
      t[1] = i;
    } else {
      i = t[1];
    }
    let a;
    if (t[2] !== i) {
      a = fl.jsx(Text, {
        dimColor: true,
        children: i
      });
      t[2] = i;
      t[3] = a;
    } else {
      a = t[3];
    }
    let l;
    if (t[4] !== o || t[5] !== n || t[6] !== s) {
      l = !VJo(n) && (s ? fl.jsx(owf, {
        diffStatsForRestore: o
      }) : fl.jsx(Text, {
        dimColor: true,
        children: "The code will be unchanged."
      }));
      t[4] = o;
      t[5] = n;
      t[6] = s;
      t[7] = l;
    } else {
      l = t[7];
    }
    let c;
    if (t[8] !== a || t[9] !== l) {
      c = fl.jsxs(gXd, {
        flexDirection: "column",
        children: [a, l]
      });
      t[8] = a;
      t[9] = l;
      t[10] = c;
    } else {
      c = t[10];
    }
    return c;
  }
  function owf(e) {
    let t = nhr.c(15);
    let {
      diffStatsForRestore: n
    } = e;
    if (n === undefined) {
      return;
    }
    if (!n.filesChanged || !n.filesChanged[0]) {
      let a;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        a = fl.jsx(Text, {
          dimColor: true,
          children: "The code has not changed (nothing will be restored)."
        });
        t[0] = a;
      } else {
        a = t[0];
      }
      return a;
    }
    let r = n.filesChanged.length;
    let o;
    if (r === 1) {
      let a;
      if (t[1] !== n.filesChanged[0]) {
        a = GRt.basename(n.filesChanged[0] || "");
        t[1] = n.filesChanged[0];
        t[2] = a;
      } else {
        a = t[2];
      }
      o = a;
    } else if (r === 2) {
      let a;
      if (t[3] !== n.filesChanged[0]) {
        a = GRt.basename(n.filesChanged[0] || "");
        t[3] = n.filesChanged[0];
        t[4] = a;
      } else {
        a = t[4];
      }
      let l = a;
      let c;
      if (t[5] !== n.filesChanged[1]) {
        c = GRt.basename(n.filesChanged[1] || "");
        t[5] = n.filesChanged[1];
        t[6] = c;
      } else {
        c = t[6];
      }
      o = `${l} and ${c}`;
    } else {
      let a;
      if (t[7] !== n.filesChanged[0]) {
        a = GRt.basename(n.filesChanged[0] || "");
        t[7] = n.filesChanged[0];
        t[8] = a;
      } else {
        a = t[8];
      }
      o = `${a} and ${n.filesChanged.length - 1} other files`;
    }
    let s;
    if (t[9] !== n.deletions || t[10] !== n.insertions) {
      s = fl.jsx(d9, {
        added: n.insertions,
        removed: n.deletions
      });
      t[9] = n.deletions;
      t[10] = n.insertions;
      t[11] = s;
    } else {
      s = t[11];
    }
    let i;
    if (t[12] !== o || t[13] !== s) {
      i = fl.jsx(fl.Fragment, {
        children: fl.jsxs(Text, {
          dimColor: true,
          children: ["The code will be restored", " ", s, " ", "in ", o, "."]
        })
      });
      t[12] = o;
      t[13] = s;
      t[14] = i;
    } else {
      i = t[14];
    }
    return i;
  }
  function zwc(e) {
    let t = nhr.c(30);
    let {
      userMessage: n,
      color: r,
      dimColor: o,
      isCurrent: s,
      paddingRight: i
    } = e;
    let {
      columns: a
    } = Sr();
    if (s) {
      let _;
      if (t[0] !== r || t[1] !== o) {
        _ = fl.jsx(gXd, {
          width: "100%",
          children: fl.jsx(Text, {
            italic: true,
            color: r,
            dimColor: o,
            children: "(current)"
          })
        });
        t[0] = r;
        t[1] = o;
        t[2] = _;
      } else {
        _ = t[2];
      }
      return _;
    }
    let l;
    let c;
    let u;
    let d;
    let p;
    let m;
    let f;
    let h;
    if (t[3] !== r || t[4] !== a || t[5] !== o || t[6] !== i || t[7] !== n) {
      h = Symbol.for("react.early_return_sentinel");
      e: {
        let _ = qO(n)?.trim() || "(no prompt)";
        let b = Bfn(_);
        if (MQn(b)) {
          let S;
          if (t[16] !== r || t[17] !== o) {
            S = fl.jsx(gXd, {
              flexDirection: "row",
              width: "100%",
              children: fl.jsx(Text, {
                italic: true,
                color: r,
                dimColor: o,
                children: "((empty message))"
              })
            });
            t[16] = r;
            t[17] = o;
            t[18] = S;
          } else {
            S = t[18];
          }
          h = S;
          break e;
        }
        if (b.includes("<bash-input>")) {
          let S = Nl(b, "bash-input");
          if (S) {
            let E;
            if (t[19] === Symbol.for("react.memo_cache_sentinel")) {
              E = fl.jsx(Text, {
                color: "bashBorder",
                children: "!"
              });
              t[19] = E;
            } else {
              E = t[19];
            }
            h = fl.jsxs(gXd, {
              flexDirection: "row",
              width: "100%",
              children: [E, fl.jsxs(Text, {
                color: r,
                dimColor: o,
                children: [" ", S]
              })]
            });
            break e;
          }
        }
        if (b.includes(`<${"command-message"}>`)) {
          let S = Nl(b, "command-message");
          let E = Nl(b, "command-args");
          let C = Nl(b, "skill-format") === "true";
          if (S) {
            if (C) {
              h = fl.jsx(gXd, {
                flexDirection: "row",
                width: "100%",
                children: fl.jsxs(Text, {
                  color: r,
                  dimColor: o,
                  children: ["Skill(", S, ")"]
                })
              });
              break e;
            } else {
              h = fl.jsx(gXd, {
                flexDirection: "row",
                width: "100%",
                children: fl.jsxs(Text, {
                  color: r,
                  dimColor: o,
                  children: ["/", S, " ", E]
                })
              });
              break e;
            }
          }
        }
        c = gXd;
        m = "row";
        f = "100%";
        l = Text;
        u = r;
        d = o;
        p = i ? truncate(b, a - i, true) : b.slice(0, 500).split(`
`).slice(0, 4).join(`
`);
      }
      t[3] = r;
      t[4] = a;
      t[5] = o;
      t[6] = i;
      t[7] = n;
      t[8] = l;
      t[9] = c;
      t[10] = u;
      t[11] = d;
      t[12] = p;
      t[13] = m;
      t[14] = f;
      t[15] = h;
    } else {
      l = t[8];
      c = t[9];
      u = t[10];
      d = t[11];
      p = t[12];
      m = t[13];
      f = t[14];
      h = t[15];
    }
    if (h !== Symbol.for("react.early_return_sentinel")) {
      return h;
    }
    let g;
    if (t[20] !== l || t[21] !== u || t[22] !== d || t[23] !== p) {
      g = fl.jsx(l, {
        color: u,
        dimColor: d,
        children: p
      });
      t[20] = l;
      t[21] = u;
      t[22] = d;
      t[23] = p;
      t[24] = g;
    } else {
      g = t[24];
    }
    let y;
    if (t[25] !== c || t[26] !== m || t[27] !== f || t[28] !== g) {
      y = fl.jsx(c, {
        flexDirection: m,
        width: f,
        children: g
      });
      t[25] = c;
      t[26] = m;
      t[27] = f;
      t[28] = g;
      t[29] = y;
    } else {
      y = t[29];
    }
    return y;
  }
  function swf(e, t, n) {
    let r = e.findIndex(l => l.uuid === t);
    if (r === -1) {
      return;
    }
    let o = n ? e.findIndex(l => l.uuid === n) : e.length;
    if (o === -1) {
      o = e.length;
    }
    let s = [];
    let i = 0;
    let a = 0;
    for (let l = r + 1; l < o; l++) {
      let c = e[l];
      if (!c || !rLe(c)) {
        continue;
      }
      let u = c.toolUseResult;
      if (!u || !u.filePath || !u.structuredPatch) {
        continue;
      }
      if (!s.includes(u.filePath)) {
        s.push(u.filePath);
      }
      try {
        if ("type" in u && u.type === "create") {
          i += u.content.split(/\r?\n/).length;
        } else {
          for (let d of u.structuredPatch) {
            let p = Bn(d.lines, f => f.startsWith("+"));
            let m = Bn(d.lines, f => f.startsWith("-"));
            i += p;
            a += m;
          }
        }
      } catch {
        continue;
      }
    }
    return {
      filesChanged: s,
      insertions: i,
      deletions: a
    };
  }
  function messagesAfterAreOnlySynthetic(e, t) {
    for (let n = t + 1; n < e.length; n++) {
      let r = e[n];
      if (!r) {
        continue;
      }
      if (Hse(r)) {
        continue;
      }
      if (rLe(r)) {
        continue;
      }
      if (r.type === "progress") {
        continue;
      }
      if (r.type === "system") {
        continue;
      }
      if (r.type === "attachment") {
        continue;
      }
      if (r.type === "user" && r.isMeta) {
        continue;
      }
      if (r.type === "assistant") {
        let o = r.message.content;
        if (Array.isArray(o)) {
          if (o.some(i => i.type === "text" && i.text?.trim() || i.type === "tool_use")) {
            return false;
          }
        }
        continue;
      }
      if (r.type === "user") {
        return false;
      }
    }
    return true;
  }
  var nhr;
  var GJo;
  var GRt;
  var tC;
  var fl;
  var rhr = __lazy(() => {
    ki();
    Ot();
    Dde();
    ho();
    Jq();
    Rn();
    np();
    mO();
    et();
    Bs();
    Ctt();
    cs();
    zp();
    ro();
    $c();
    Ai();
    Ii();
    pNe();
    xb();
    bv();
    bs();
    ro();
    cA();
    nhr = __toESM(pt(), 1);
    GJo = require("crypto");
    GRt = __toESM(require("path"));
    tC = __toESM(ot(), 1);
    fl = __toESM(ie(), 1);
  });
  function Jwc(e) {
    Ywc.useEffect(() => {
      if (!e.length) {
        return;
      }
      let t = p9(e);
      if (t) {
        t.client.setNotificationHandler(iwf(), n => {
          let {
            eventName: r,
            eventData: o
          } = n.params;
          logEvent(`tengu_ide_${r}`, o);
        });
      }
    }, [e]);
  }
  var Ywc;
  var iwf;
  var Xwc = __lazy(() => {
    Ot();
    bT();
    Ywc = __toESM(ot(), 1);
    iwf = we(() => v.object({
      method: v.literal("log_event"),
      params: v.object({
        eventName: v.string(),
        eventData: v.object({}).passthrough()
      })
    }));
  });
  function Qwc() {
    let [e, t] = ohr.useState(null);
    ohr.useEffect(() => (TCo(n => new Promise(r => {
      t({
        settings: n,
        resolve: o => {
          t(null);
          r(o);
        }
      });
    })), () => TCo(null)), []);
    return e;
  }
  var ohr;
  var Zwc = __lazy(() => {
    ECo();
    ohr = __toESM(ot(), 1);
  });
  function awf() {
    return Date.now() - getLastInteractionTime();
  }
  function lwf(e) {
    return awf() < e;
  }
  function cwf(e) {
    return !lwf(e);
  }
  function xrn(e, t) {
    let n = lG();
    let [r, o] = Rrn.useState(false);
    Rrn.useEffect(() => {
      resetInteractionBaseline();
    }, []);
    Rrn.useEffect(() => {
      o(false);
    }, [e, t, n]);
    useInterval(() => {
      if (cwf(6000)) {
        o(true);
        KQ({
          message: e,
          notificationType: t
        }, n);
      }
    }, r ? null : 6000);
  }
  var Rrn;
  var YJo = __lazy(() => {
    at();
    uq();
    et();
    mbt();
    Rrn = __toESM(ot(), 1);
  });
  async function tCc(e, t, n) {
    let r = new Date();
    let o = r.toISOString();
    let s = -r.getTimezoneOffset();
    let i = Math.floor(Math.abs(s) / 60);
    let a = Math.abs(s) % 60;
    let c = `${s >= 0 ? "+" : "-"}${String(i).padStart(2, "0")}:${String(a).padStart(2, "0")}`;
    let u = r.toLocaleDateString("en-US", {
      weekday: "long"
    });
    let d = ["You are a date/time parser that converts natural language into ISO 8601 format.", "You MUST respond with ONLY the ISO 8601 formatted string, with no explanation or additional text.", "If the input is ambiguous, prefer future dates over past dates.", "For times without dates, use today's date.", "For dates without times, do not include a time component.", 'If the input is incomplete or you cannot confidently parse it into a valid date, respond with exactly "INVALID" (nothing else).', 'Examples of INVALID input: partial dates like "2025-01-", lone numbers like "13", gibberish.', 'Examples of valid natural language: "tomorrow", "next Monday", "jan 1st 2025", "in 2 hours", "yesterday".'];
    let p = t === "date" ? "YYYY-MM-DD (date only, no time)" : `YYYY-MM-DDTHH:MM:SS${c} (full date-time with timezone)`;
    let m = `Current context:
- Current date and time: ${o} (UTC)
- Local timezone: ${c}
- Day of week: ${u}

User input: "${e}"

Output format: ${p}

Parse the user's input into ISO 8601 format. Return ONLY the formatted string, or "INVALID" if the input is incomplete or unparseable.`;
    try {
      let f = await RO({
        systemPrompt: d,
        userPrompt: m,
        signal: n,
        options: {
          querySource: "mcp_datetime_parse",
          agents: [],
          isNonInteractiveSession: false,
          hasAppendSystemPrompt: false,
          mcpTools: [],
          enablePromptCaching: false,
          agentContext: ym()
        }
      });
      let h = Tl(f.message.content).trim();
      if (!h || h === "INVALID") {
        Ae("mcp_elicitation_nl_datetime_parse", "parse_failed");
        return {
          success: false,
          error: "Unable to parse date/time from input"
        };
      }
      if (!/^\d{4}/.test(h)) {
        Ae("mcp_elicitation_nl_datetime_parse", "parse_failed");
        return {
          success: false,
          error: "Unable to parse date/time from input"
        };
      }
      Pe("mcp_elicitation_nl_datetime_parse");
      return {
        success: true,
        value: h
      };
    } catch (f) {
      if (!n.aborted) {
        Ae("mcp_elicitation_nl_datetime_parse", "haiku_error");
        Oe(f);
      }
      return {
        success: false,
        error: "Unable to parse date/time. Please enter in ISO 8601 format manually."
      };
    }
  }
  function nCc(e) {
    return /^\d{4}-\d{2}-\d{2}(T|$)/.test(e.trim());
  }
  var rCc = __lazy(() => {
    ln();
    aE();
    _h();
    Rn();
    ro();
  });
  function eXe(e) {
    return e.type === "array" && "items" in e && typeof e.items === "object" && e.items !== null && ("enum" in e.items || "anyOf" in e.items);
  }
  function Arn(e) {
    if ("anyOf" in e.items) {
      return e.items.anyOf.map(t => t.const);
    }
    if ("enum" in e.items) {
      return e.items.enum;
    }
    return [];
  }
  function uwf(e) {
    if ("anyOf" in e.items) {
      return e.items.anyOf.map(t => t.title);
    }
    if ("enum" in e.items) {
      return e.items.enum;
    }
    return [];
  }
  function Irn(e, t) {
    let n = Arn(e).indexOf(t);
    return n >= 0 ? uwf(e)[n] ?? t : t;
  }
  function VRt(e) {
    if ("oneOf" in e) {
      return e.oneOf.map(t => t.const);
    }
    if ("enum" in e) {
      return e.enum;
    }
    return [];
  }
  function dwf(e) {
    if ("oneOf" in e) {
      return e.oneOf.map(t => t.title);
    }
    if ("enum" in e) {
      return ("enumNames" in e ? e.enumNames : undefined) ?? e.enum;
    }
    return [];
  }
  function Prn(e, t) {
    let n = VRt(e).indexOf(t);
    return n >= 0 ? dwf(e)[n] ?? t : t;
  }
  function pwf(e) {
    if (whe(e)) {
      let [t, ...n] = VRt(e);
      if (!t) {
        return v.never();
      }
      return v.enum([t, ...n]);
    }
    if (e.type === "string") {
      let t = v.string();
      if (e.minLength !== undefined) {
        t = t.min(e.minLength, {
          message: `Must be at least ${e.minLength} ${un(e.minLength, "character")}`
        });
      }
      if (e.maxLength !== undefined) {
        t = t.max(e.maxLength, {
          message: `Must be at most ${e.maxLength} ${un(e.maxLength, "character")}`
        });
      }
      switch (e.format) {
        case "email":
          t = t.email({
            message: "Must be a valid email address, e.g. user@example.com"
          });
          break;
        case "uri":
          t = t.url({
            message: "Must be a valid URI, e.g. https://example.com"
          });
          break;
        case "date":
          t = t.date("Must be a valid date, e.g. 2024-03-15, today, next Monday");
          break;
        case "date-time":
          t = t.datetime({
            offset: true,
            message: "Must be a valid date-time, e.g. 2024-03-15T14:30:00Z, tomorrow at 3pm"
          });
          break;
        default:
          break;
      }
      return t;
    }
    if (e.type === "number" || e.type === "integer") {
      let t = e.type === "integer" ? "an integer" : "a number";
      let n = e.type === "integer";
      let r = i => Number.isInteger(i) && !n ? `${i}.0` : String(i);
      let o = e.minimum !== undefined && e.maximum !== undefined ? `Must be ${t} between ${r(e.minimum)} and ${r(e.maximum)}` : e.minimum !== undefined ? `Must be ${t} >= ${r(e.minimum)}` : e.maximum !== undefined ? `Must be ${t} <= ${r(e.maximum)}` : `Must be ${t}`;
      let s = v.coerce.number({
        error: o
      });
      if (e.type === "integer") {
        s = s.int({
          message: o
        });
      }
      if (e.minimum !== undefined) {
        s = s.min(e.minimum, {
          message: o
        });
      }
      if (e.maximum !== undefined) {
        s = s.max(e.maximum, {
          message: o
        });
      }
      return s;
    }
    if (e.type === "boolean") {
      return v.coerce.boolean();
    }
    throw Error(`Unsupported schema: ${De(e)}`);
  }
  function krn(e, t) {
    let r = pwf(t).safeParse(e);
    if (r.success) {
      return {
        value: r.data,
        isValid: true
      };
    }
    return {
      isValid: false,
      error: r.error.issues.map(o => o.message).join("; ")
    };
  }
  function Orn(e) {
    return e.type === "string" && "format" in e && (e.format === "date" || e.format === "date-time");
  }
  async function oCc(e, t, n) {
    let r = krn(e, t);
    if (r.isValid) {
      return r;
    }
    if (Orn(t) && !nCc(e)) {
      let o = await tCc(e, t.format, n);
      if (o.success) {
        let s = krn(o.value, t);
        if (s.isValid) {
          return s;
        }
      }
    }
    return r;
  }
  var whe = e => e.type === "string" && ("enum" in e || "oneOf" in e);
  var sCc = __lazy(() => {
    Zn();
    rCc();
  });
  function mwf(e) {
    e.buffer = "";
    e.timer = undefined;
  }
  function fwf() {
    let e = shr.c(5);
    let [t, n] = useAnimationFrame(80);
    let r = Math.floor(n / 80) % ("\u280B\u2819\u2839\u2838\u283C\u2834\u2826\u2827\u2807\u280F").length;
    let o = ("\u280B\u2819\u2839\u2838\u283C\u2834\u2826\u2827\u2807\u280F")[r];
    let s;
    if (e[0] !== o) {
      s = Fs.jsx(Text, {
        color: "warning",
        children: o
      });
      e[0] = o;
      e[1] = s;
    } else {
      s = e[1];
    }
    let i;
    if (e[2] !== t || e[3] !== s) {
      i = Fs.jsx(gXd, {
        ref: t,
        children: s
      });
      e[2] = t;
      e[3] = s;
      e[4] = i;
    } else {
      i = e[4];
    }
    return i;
  }
  function hwf(e, t) {
    try {
      let n = new Date(e);
      if (Number.isNaN(n.getTime())) {
        return e;
      }
      if (("format" in t ? t.format : undefined) === "date-time") {
        return n.toLocaleDateString("en-US", {
          weekday: "short",
          year: "numeric",
          month: "short",
          day: "numeric",
          hour: "numeric",
          minute: "2-digit",
          timeZoneName: "short"
        });
      }
      let o = e.split("-");
      if (o.length === 3) {
        return new Date(Number(o[0]), Number(o[1]) - 1, Number(o[2])).toLocaleDateString("en-US", {
          weekday: "short",
          year: "numeric",
          month: "short",
          day: "numeric"
        });
      }
      return e;
    } catch {
      return e;
    }
  }
  function ihr(e) {
    let t = shr.c(7);
    let {
      event: n,
      onResponse: r,
      onWaitingDismiss: o
    } = e;
    if (n.params.mode === "url") {
      let i;
      if (t[0] !== n || t[1] !== r || t[2] !== o) {
        i = Fs.jsx(ywf, {
          event: n,
          onResponse: r,
          onWaitingDismiss: o
        });
        t[0] = n;
        t[1] = r;
        t[2] = o;
        t[3] = i;
      } else {
        i = t[3];
      }
      return i;
    }
    let s;
    if (t[4] !== n || t[5] !== r) {
      s = Fs.jsx(gwf, {
        event: n,
        onResponse: r
      });
      t[4] = n;
      t[5] = r;
      t[6] = s;
    } else {
      s = t[6];
    }
    return s;
  }
  function gwf({
    event: e,
    onResponse: t
  }) {
    let {
      serverName: n,
      signal: r
    } = e;
    let o = e.params;
    let {
      message: s,
      requestedSchema: i
    } = o;
    let a = h0r.safeParse(e.params._meta?.[Jae]);
    let l = a.success ? ` (task ${a.data.taskId.slice(0, 8)})` : "";
    let c = Object.keys(i.properties).length > 0;
    let [u, d] = ib.useState(c ? null : "accept");
    let [p, m] = ib.useState(() => {
      let le = {};
      if (i.properties) {
        for (let [pe, ve] of Object.entries(i.properties)) {
          if (typeof ve === "object" && ve !== null) {
            if (ve.default !== undefined) {
              le[pe] = ve.default;
            }
          }
        }
      }
      return le;
    });
    let [f, h] = ib.useState(() => {
      let le = {};
      for (let [pe, ve] of Object.entries(i.properties)) {
        if (Drn(ve) && ve?.default !== undefined) {
          let _e = krn(String(ve.default), ve);
          if (!_e.isValid) {
            le[pe] = _e.error;
          }
        }
      }
      return le;
    });
    ib.useEffect(() => {
      if (!r) {
        return;
      }
      let le = () => {
        t("cancel");
      };
      if (r.aborted) {
        le();
        return;
      }
      r.addEventListener("abort", le);
      return () => {
        r.removeEventListener("abort", le);
      };
    }, [r, t]);
    let {
      setRawMode: g
    } = F5d();
    ib.useLayoutEffect(() => (g(true), () => g(false)), [g]);
    let y = ib.useMemo(() => {
      let le = i.required ?? [];
      return Object.entries(i.properties).map(([pe, ve]) => ({
        name: pe,
        schema: ve,
        isRequired: le.includes(pe)
      }));
    }, [i]);
    let [_, b] = ib.useState(c ? 0 : undefined);
    let [S, E] = ib.useState(() => {
      let le = y[0];
      if (le && Drn(le.schema)) {
        let pe = p[le.name];
        if (pe === undefined) {
          return "";
        }
        return String(pe);
      }
      return "";
    });
    let [C, x] = ib.useState(S.length);
    let [A, k] = ib.useState(() => new Set());
    let [I, O] = ib.useState();
    let [M, L] = ib.useState(0);
    let P = useClock();
    let F = ib.useRef(undefined);
    let H = ib.useRef(new Map());
    let U = ib.useRef({
      buffer: "",
      timer: undefined
    });
    ib.useEffect(() => () => {
      if (F.current !== undefined) {
        F.current();
      }
      let le = U.current;
      if (le.timer !== undefined) {
        le.timer();
      }
      for (let pe of H.current.values()) {
        pe.abort();
      }
      H.current.clear();
    }, []);
    let {
      columns: N,
      rows: W
    } = Sr();
    let j = _ !== undefined ? y[_] : undefined;
    let V = j !== undefined && Drn(j.schema) && !whe(j.schema) && !u;
    Jg("elicitation");
    xrn("Claude Code needs your input", "elicitation_dialog");
    let K = ib.useCallback(le => {
      if (le === undefined) {
        E("");
        x(0);
        return;
      }
      let pe = y[le];
      if (pe && Drn(pe.schema) && !whe(pe.schema)) {
        let ve = p[pe.name];
        let _e = ve !== undefined ? String(ve) : "";
        E(_e);
        x(_e.length);
      }
    }, [y, p]);
    function J(le, pe) {
      if (!eXe(pe)) {
        return;
      }
      let ve = p[le] ?? [];
      let _e = y.find(Ie => Ie.name === le)?.isRequired ?? false;
      let xe = pe.minItems;
      let ke = pe.maxItems;
      if (xe !== undefined && ve.length < xe && (ve.length > 0 || _e)) {
        ne(le, `Select at least ${xe} ${un(xe, "item")}`);
      } else if (ke !== undefined && ve.length > ke) {
        ne(le, `Select at most ${ke} ${un(ke, "item")}`);
      } else {
        ne(le);
      }
    }
    function Q(le) {
      if (j && eXe(j.schema)) {
        J(j.name, j.schema);
        O(undefined);
      } else if (j && whe(j.schema)) {
        O(undefined);
      }
      if (V && j) {
        if (ee(j.name, j.schema, S), F.current !== undefined) {
          F.current();
          F.current = undefined;
        }
        if (Orn(j.schema) && S.trim() !== "" && f[j.name]) {
          re(j.name, j.schema, S);
        }
      }
      let pe = y.length + 2;
      let ve = _ ?? (u === "accept" ? y.length : u === "decline" ? y.length + 1 : undefined);
      let _e = ve !== undefined ? (ve + (le === "up" ? pe - 1 : 1)) % pe : 0;
      if (_e < y.length) {
        b(_e);
        d(null);
        K(_e);
      } else {
        b(undefined);
        d(_e === y.length ? "accept" : "decline");
        E("");
      }
    }
    function Z(le, pe) {
      if (m(ve => {
        let _e = {
          ...ve
        };
        if (pe === undefined) {
          delete _e[le];
        } else {
          _e[le] = pe;
        }
        return _e;
      }), pe !== undefined && f[le] === "This field is required") {
        ne(le);
      }
    }
    function ne(le, pe) {
      h(ve => {
        let _e = {
          ...ve
        };
        if (pe) {
          _e[le] = pe;
        } else {
          delete _e[le];
        }
        return _e;
      });
    }
    function oe(le) {
      if (!le) {
        return;
      }
      Z(le, undefined);
      ne(le);
      E("");
      x(0);
    }
    function ee(le, pe, ve) {
      let _e = ve.trim();
      if (_e === "" && (pe.type !== "string" || "format" in pe && pe.format !== undefined)) {
        oe(le);
        return;
      }
      if (_e === "") {
        if (p[le] !== undefined) {
          Z(le, "");
        }
        return;
      }
      let xe = krn(ve, pe);
      Z(le, xe.isValid ? xe.value : ve);
      ne(le, xe.isValid ? undefined : xe.error);
    }
    function re(le, pe, ve) {
      if (!r) {
        return;
      }
      let _e = H.current.get(le);
      if (_e) {
        _e.abort();
      }
      let xe = new AbortController();
      H.current.set(le, xe);
      k(ke => new Set(ke).add(le));
      oCc(ve, pe, xe.signal).then(ke => {
        if (H.current.delete(le), k(Ie => {
          let Ue = new Set(Ie);
          Ue.delete(le);
          return Ue;
        }), xe.signal.aborted) {
          return;
        }
        if (ke.isValid) {
          Z(le, ke.value);
          ne(le);
          let Ie = String(ke.value);
          E(Ue => {
            if (Ue === ve) {
              x(Ie.length);
              return Ie;
            }
            return Ue;
          });
        } else {
          ne(le, ke.error);
        }
      }, () => {
        H.current.delete(le);
        k(ke => {
          let Ie = new Set(ke);
          Ie.delete(le);
          return Ie;
        });
      });
    }
    function se(le) {
      if (E(le), j) {
        if (ee(j.name, j.schema, le), F.current !== undefined) {
          F.current();
          F.current = undefined;
        }
        if (Orn(j.schema) && le.trim() !== "" && f[j.name]) {
          let {
            name: pe,
            schema: ve
          } = j;
          F.current = P.setTimeout(() => {
            F.current = undefined;
            re(pe, ve, le);
          }, 2000);
        }
      }
    }
    function ae() {
      Q("down");
    }
    function de(le, pe, ve) {
      let _e = U.current;
      if (_e.timer !== undefined) {
        _e.timer();
      }
      _e.buffer += le.toLowerCase();
      _e.timer = P.setTimeout(() => mwf(_e), 2000);
      let xe = pe.findIndex(ke => ke.startsWith(_e.buffer));
      if (xe !== -1) {
        ve(xe);
      }
    }
    uo("confirm:no", () => {
      if (V && j) {
        let le = p[j.name];
        E(le !== undefined ? String(le) : "");
        x(0);
      }
      t("cancel");
    }, {
      context: "Settings",
      isActive: !!j && !u && !I
    });
    function be(le) {
      let pe = le.key.length === 1 && le.key !== " " && !le.ctrl && !le.meta ? le.key : "";
      if (V && le.key !== "up" && le.key !== "down" && le.key !== "return" && le.key !== "backspace") {
        return;
      }
      if (I && j && eXe(j.schema)) {
        let ke = j.schema;
        let Ie = Arn(ke);
        let Ue = p[j.name] ?? [];
        if (le.key === "left" || le.key === "escape") {
          le.preventDefault();
          O(undefined);
          J(j.name, ke);
          return;
        }
        if (le.key === "up") {
          if (le.preventDefault(), M === 0) {
            O(undefined);
            J(j.name, ke);
          } else {
            L(M - 1);
          }
          return;
        }
        if (le.key === "down") {
          if (le.preventDefault(), M >= Ie.length - 1) {
            O(undefined);
            Q("down");
          } else {
            L(M + 1);
          }
          return;
        }
        if (le.key === " ") {
          le.preventDefault();
          let Ge = Ie[M];
          if (Ge !== undefined) {
            let Be = Ue.includes(Ge) ? Ue.filter(kt => kt !== Ge) : [...Ue, Ge];
            let We = Be.length > 0 ? Be : undefined;
            Z(j.name, We);
            let {
              minItems: Ze,
              maxItems: Tt
            } = ke;
            if (Ze !== undefined && Be.length < Ze && (Be.length > 0 || j.isRequired)) {
              ne(j.name, `Select at least ${Ze} ${un(Ze, "item")}`);
            } else if (Tt !== undefined && Be.length > Tt) {
              ne(j.name, `Select at most ${Tt} ${un(Tt, "item")}`);
            } else {
              ne(j.name);
            }
          }
          return;
        }
        if (le.key === "return") {
          le.preventDefault();
          let Ge = Ie[M];
          if (Ge !== undefined && !Ue.includes(Ge)) {
            Z(j.name, [...Ue, Ge]);
          }
          O(undefined);
          Q("down");
          return;
        }
        if (pe) {
          le.preventDefault();
          let Ge = Ie.map(Be => Irn(ke, Be).toLowerCase());
          de(pe, Ge, L);
          return;
        }
        return;
      }
      if (I && j && whe(j.schema)) {
        let ke = j.schema;
        let Ie = VRt(ke);
        if (le.key === "left" || le.key === "escape") {
          le.preventDefault();
          O(undefined);
          return;
        }
        if (le.key === "up") {
          if (le.preventDefault(), M === 0) {
            O(undefined);
          } else {
            L(M - 1);
          }
          return;
        }
        if (le.key === "down") {
          if (le.preventDefault(), M >= Ie.length - 1) {
            O(undefined);
            Q("down");
          } else {
            L(M + 1);
          }
          return;
        }
        if (le.key === " ") {
          le.preventDefault();
          let Ue = Ie[M];
          if (Ue !== undefined) {
            Z(j.name, Ue);
          }
          O(undefined);
          return;
        }
        if (le.key === "return") {
          le.preventDefault();
          let Ue = Ie[M];
          if (Ue !== undefined) {
            Z(j.name, Ue);
          }
          O(undefined);
          Q("down");
          return;
        }
        if (pe) {
          le.preventDefault();
          let Ue = Ie.map(Ge => Prn(ke, Ge).toLowerCase());
          de(pe, Ue, L);
          return;
        }
        return;
      }
      if (le.key === "return" && u === "accept") {
        if (le.preventDefault(), fe() && Object.keys(f).length === 0) {
          t("accept", p);
        } else {
          let ke = i.required || [];
          for (let Ue of ke) {
            if (p[Ue] === undefined) {
              ne(Ue, "This field is required");
            }
          }
          let Ie = y.findIndex(Ue => ke.includes(Ue.name) && p[Ue.name] === undefined || f[Ue.name] !== undefined);
          if (Ie !== -1) {
            b(Ie);
            d(null);
            K(Ie);
          }
        }
        return;
      }
      if (le.key === "return" && u === "decline") {
        le.preventDefault();
        t("decline");
        return;
      }
      if (le.key === "up" || le.key === "down") {
        le.preventDefault();
        let ke = U.current;
        if (ke.buffer = "", ke.timer !== undefined) {
          ke.timer();
          ke.timer = undefined;
        }
        Q(le.key === "up" ? "up" : "down");
        return;
      }
      if (u && (le.key === "left" || le.key === "right")) {
        le.preventDefault();
        d(u === "accept" ? "decline" : "accept");
        return;
      }
      if (!j) {
        return;
      }
      let {
        schema: ve,
        name: _e
      } = j;
      let xe = p[_e];
      if (ve.type === "boolean") {
        if (le.key === " ") {
          le.preventDefault();
          Z(_e, xe === undefined ? true : !xe);
          return;
        }
        if (le.key === "return") {
          le.preventDefault();
          Q("down");
          return;
        }
        if (le.key === "backspace" && xe !== undefined) {
          le.preventDefault();
          oe(_e);
          return;
        }
        if (pe && le.key !== "return") {
          le.preventDefault();
          de(pe, ["yes", "no"], ke => Z(_e, ke === 0));
          return;
        }
        return;
      }
      if (whe(ve) || eXe(ve)) {
        if (le.key === "return") {
          le.preventDefault();
          Q("down");
          return;
        }
        if (le.key === "backspace" && xe !== undefined) {
          le.preventDefault();
          oe(_e);
          return;
        }
        let ke;
        let Ie = 0;
        if (whe(ve)) {
          let Ue = VRt(ve);
          if (ke = Ue.map(Ge => Prn(ve, Ge).toLowerCase()), xe !== undefined) {
            Ie = Math.max(0, Ue.indexOf(xe));
          }
        } else {
          ke = Arn(ve).map(Ge => Irn(ve, Ge).toLowerCase());
        }
        if (le.key === "right") {
          le.preventDefault();
          O(_e);
          L(Ie);
          return;
        }
        if (pe && le.key !== "left") {
          le.preventDefault();
          de(pe, ke, Ue => {
            O(_e);
            L(Ue);
          });
          return;
        }
        return;
      }
      if (le.key === "backspace") {
        if (V && S === "") {
          le.preventDefault();
          oe(_e);
          return;
        }
      }
    }
    function fe() {
      let le = i.required || [];
      for (let pe of le) {
        let ve = p[pe];
        if (ve === undefined || ve === null || ve === "") {
          return false;
        }
        if (Array.isArray(ve) && ve.length === 0) {
          return false;
        }
      }
      return true;
    }
    let me = 3;
    let ue = Math.max(2, Math.floor((W - 14) / me));
    let ce = ib.useMemo(() => {
      let le = y.length;
      if (le <= ue) {
        return {
          start: 0,
          end: le
        };
      }
      let pe = _ ?? le - 1;
      let ve = Math.max(0, pe - Math.floor(ue / 2));
      let _e = Math.min(ve + ue, le);
      ve = Math.max(0, _e - ue);
      return {
        start: ve,
        end: _e
      };
    }, [y.length, ue, _]);
    return Fs.jsx(or, {
      title: `MCP server \u201C${n}\u201D requests your input${l}`,
      subtitle: `
${s}`,
      color: "permission",
      onCancel: () => t("cancel"),
      isCancelActive: (!j || !!u) && !I,
      inputGuide: Fs.jsxs(Hn, {
        children: [Fs.jsx(Wr, {
          action: "confirm:no",
          context: "Confirmation",
          fallback: "Esc",
          description: "cancel"
        }), Fs.jsx(xt, {
          chord: ["up", "down"],
          action: "navigate"
        }), j && Fs.jsx(xt, {
          chord: "backspace",
          action: "unset"
        }), j && j.schema.type === "boolean" && Fs.jsx(xt, {
          chord: "space",
          action: "toggle"
        }), j && whe(j.schema) && (I ? Fs.jsx(xt, {
          chord: "space",
          action: "select"
        }) : Fs.jsx(xt, {
          chord: "right",
          action: "expand"
        })), j && eXe(j.schema) && (I ? Fs.jsx(xt, {
          chord: "space",
          action: "toggle"
        }) : Fs.jsx(xt, {
          chord: "right",
          action: "expand"
        }))]
      }),
      children: Fs.jsxs(gXd, {
        flexDirection: "column",
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: be,
        children: [Fs.jsx(_wf, {
          schemaFields: y,
          scrollWindow: ce,
          currentFieldIndex: _,
          focusedButton: u,
          formValues: p,
          validationErrors: f,
          resolvingFields: A,
          expandedAccordion: I,
          accordionOptionIndex: M,
          textInputValue: S,
          textInputCursorOffset: C,
          setTextInputCursorOffset: x,
          handleTextInputChange: se,
          handleTextInputSubmit: ae,
          columns: N
        }), Fs.jsxs(gXd, {
          children: [Fs.jsx(Text, {
            color: "success",
            children: u === "accept" ? vGd.pointer : " "
          }), Fs.jsx(Text, {
            bold: u === "accept",
            color: u === "accept" ? "success" : undefined,
            dimColor: u !== "accept",
            children: " Accept  "
          }), Fs.jsx(Text, {
            color: "error",
            children: u === "decline" ? vGd.pointer : " "
          }), Fs.jsx(Text, {
            bold: u === "decline",
            color: u === "decline" ? "error" : undefined,
            dimColor: u !== "decline",
            children: " Decline"
          })]
        })]
      })
    });
  }
  function ywf({
    event: e,
    onResponse: t,
    onWaitingDismiss: n
  }) {
    let {
      serverName: r,
      signal: o,
      waitingState: s
    } = e;
    let i = e.params;
    let {
      message: a,
      url: l
    } = i;
    let [c, u] = ib.useState("prompt");
    let d = ib.useRef("prompt");
    let [p, m] = ib.useState("accept");
    let f = s?.showCancel ?? false;
    let {
      setRawMode: h
    } = F5d();
    ib.useLayoutEffect(() => (h(true), () => h(false)), [h]);
    xrn("Claude Code needs your input", "elicitation_url_dialog");
    Jg("elicitation-url");
    d.current = c;
    let g = ib.useRef(n);
    g.current = n;
    ib.useEffect(() => {
      let C = () => {
        if (d.current === "waiting") {
          g.current?.("cancel");
        } else {
          t("cancel");
        }
      };
      if (o.aborted) {
        C();
        return;
      }
      o.addEventListener("abort", C);
      return () => o.removeEventListener("abort", C);
    }, [o, t]);
    let y = "";
    let _ = "";
    let b = "";
    try {
      y = new URL(l).hostname;
      let x = l.indexOf(y);
      _ = l.slice(0, x);
      b = l.slice(x + y.length);
    } catch {
      y = l;
    }
    ib.useEffect(() => {
      if (c === "waiting" && e.completed) {
        n?.(f ? "retry" : "dismiss");
      }
    }, [c, e.completed, n, f]);
    let S = ib.useCallback(() => {
      Ac(l);
      t("accept");
      u("waiting");
      d.current = "waiting";
      m("open");
    }, [t, l]);
    function E(C) {
      if (c === "prompt") {
        if (C.key === "left" || C.key === "right") {
          C.preventDefault();
          m(x => x === "accept" ? "decline" : "accept");
          return;
        }
        if (C.key === "return") {
          if (C.preventDefault(), p === "accept") {
            S();
          } else {
            t("decline");
          }
        }
      } else {
        let x = f ? ["open", "action", "cancel"] : ["open", "action"];
        if (C.key === "left" || C.key === "right") {
          C.preventDefault();
          let A = C.key === "right";
          m(k => {
            let I = x.indexOf(k);
            return x[(I + (A ? 1 : -1) + x.length) % x.length];
          });
          return;
        }
        if (C.key === "return") {
          if (C.preventDefault(), p === "open") {
            Ac(l);
          } else if (p === "cancel") {
            n?.("cancel");
          } else {
            n?.(f ? "retry" : "dismiss");
          }
        }
      }
    }
    if (c === "waiting") {
      let C = s?.actionLabel ?? "Continue without waiting";
      return Fs.jsx(or, {
        title: `MCP server \u201C${r}\u201D \u2014 waiting for completion`,
        subtitle: `
${a}`,
        color: "permission",
        onCancel: () => n?.("cancel"),
        isCancelActive: true,
        inputGuide: Fs.jsxs(Hn, {
          children: [Fs.jsx(Wr, {
            action: "confirm:no",
            context: "Confirmation",
            fallback: "Esc",
            description: "cancel"
          }), Fs.jsx(xt, {
            chord: ["left", "right"],
            action: "switch"
          })]
        }),
        children: Fs.jsxs(gXd, {
          flexDirection: "column",
          tabIndex: 0,
          autoFocus: true,
          onKeyDown: E,
          children: [Fs.jsx(gXd, {
            marginBottom: 1,
            flexDirection: "column",
            children: Fs.jsxs(Text, {
              children: [_, Fs.jsx(Text, {
                bold: true,
                children: y
              }), b]
            })
          }), Fs.jsx(gXd, {
            marginBottom: 1,
            children: Fs.jsx(Text, {
              dimColor: true,
              italic: true,
              children: "Waiting for the server to confirm completion\u2026"
            })
          }), Fs.jsxs(gXd, {
            children: [Fs.jsx(Text, {
              color: "success",
              children: p === "open" ? vGd.pointer : " "
            }), Fs.jsx(Text, {
              bold: p === "open",
              color: p === "open" ? "success" : undefined,
              dimColor: p !== "open",
              children: " Reopen URL  "
            }), Fs.jsx(Text, {
              color: "success",
              children: p === "action" ? vGd.pointer : " "
            }), Fs.jsx(Text, {
              bold: p === "action",
              color: p === "action" ? "success" : undefined,
              dimColor: p !== "action",
              children: ` ${C}`
            }), f && Fs.jsxs(Fs.Fragment, {
              children: [Fs.jsx(Text, {
                children: " "
              }), Fs.jsx(Text, {
                color: "error",
                children: p === "cancel" ? vGd.pointer : " "
              }), Fs.jsx(Text, {
                bold: p === "cancel",
                color: p === "cancel" ? "error" : undefined,
                dimColor: p !== "cancel",
                children: " Cancel"
              })]
            })]
          })]
        })
      });
    }
    return Fs.jsx(or, {
      title: `MCP server \u201C${r}\u201D wants to open a URL`,
      subtitle: `
${a}`,
      color: "permission",
      onCancel: () => t("cancel"),
      isCancelActive: true,
      inputGuide: Fs.jsxs(Hn, {
        children: [Fs.jsx(Wr, {
          action: "confirm:no",
          context: "Confirmation",
          fallback: "Esc",
          description: "cancel"
        }), Fs.jsx(xt, {
          chord: ["left", "right"],
          action: "switch"
        })]
      }),
      children: Fs.jsxs(gXd, {
        flexDirection: "column",
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: E,
        children: [Fs.jsx(gXd, {
          marginBottom: 1,
          flexDirection: "column",
          children: Fs.jsxs(Text, {
            children: [_, Fs.jsx(Text, {
              bold: true,
              children: y
            }), b]
          })
        }), Fs.jsxs(gXd, {
          children: [Fs.jsx(Text, {
            color: "success",
            children: p === "accept" ? vGd.pointer : " "
          }), Fs.jsx(Text, {
            bold: p === "accept",
            color: p === "accept" ? "success" : undefined,
            dimColor: p !== "accept",
            children: " Accept  "
          }), Fs.jsx(Text, {
            color: "error",
            children: p === "decline" ? vGd.pointer : " "
          }), Fs.jsx(Text, {
            bold: p === "decline",
            color: p === "decline" ? "error" : undefined,
            dimColor: p !== "decline",
            children: " Decline"
          })]
        })]
      })
    });
  }
  function _wf(e) {
    let t = shr.c(43);
    let {
      schemaFields: n,
      scrollWindow: r,
      currentFieldIndex: o,
      focusedButton: s,
      formValues: i,
      validationErrors: a,
      resolvingFields: l,
      expandedAccordion: c,
      accordionOptionIndex: u,
      textInputValue: d,
      textInputCursorOffset: p,
      setTextInputCursorOffset: m,
      handleTextInputChange: f,
      handleTextInputSubmit: h,
      columns: g
    } = e;
    if (!n.length) {
      return null;
    }
    let y = r.start > 0;
    let _ = r.end < n.length;
    let b;
    if (t[0] !== y || t[1] !== r.start) {
      b = y && Fs.jsx(gXd, {
        marginLeft: 2,
        children: Fs.jsxs(Text, {
          dimColor: true,
          children: [vGd.arrowUp, " ", r.start, " more above"]
        })
      });
      t[0] = y;
      t[1] = r.start;
      t[2] = b;
    } else {
      b = t[2];
    }
    let S;
    if (t[3] !== u || t[4] !== g || t[5] !== o || t[6] !== c || t[7] !== s || t[8] !== i || t[9] !== f || t[10] !== h || t[11] !== l || t[12] !== n || t[13] !== r.end || t[14] !== r.start || t[15] !== m || t[16] !== p || t[17] !== d || t[18] !== a) {
      let x;
      if (t[20] !== u || t[21] !== g || t[22] !== o || t[23] !== c || t[24] !== s || t[25] !== i || t[26] !== f || t[27] !== h || t[28] !== l || t[29] !== r.start || t[30] !== m || t[31] !== p || t[32] !== d || t[33] !== a) {
        x = (A, k) => {
          let I = r.start + k;
          let {
            name: O,
            schema: M,
            isRequired: L
          } = A;
          let P = I === o && !s;
          let F = i[O];
          let H = F !== undefined && (!Array.isArray(F) || F.length > 0);
          let U = a[O];
          let W = l.vZc(O) ? Fs.jsx(fwf, {}) : U ? Fs.jsx(Text, {
            color: "error",
            children: vGd.warning
          }) : H ? Fs.jsx(Text, {
            color: "success",
            dimColor: !P,
            children: vGd.tick
          }) : L ? Fs.jsx(Text, {
            color: "error",
            children: "*"
          }) : Fs.jsx(Text, {
            children: " "
          });
          let j = U ? "error" : H ? "success" : L ? "error" : "suggestion";
          let z = P ? j : undefined;
          let V = Fs.jsx(Text, {
            color: z,
            bold: P,
            children: M.title || O
          });
          let K;
          let J = null;
          if (eXe(M)) {
            let Q = Arn(M);
            let Z = F ?? [];
            if (c === O && P) {
              K = Fs.jsx(Text, {
                dimColor: true,
                children: vGd.triangleDownSmall
              });
              J = Fs.jsx(gXd, {
                flexDirection: "column",
                marginLeft: 6,
                children: Q.map((oe, ee) => {
                  let re = Irn(M, oe);
                  let se = Z.includes(oe);
                  let ae = ee === u;
                  return Fs.jsxs(gXd, {
                    gap: 1,
                    children: [Fs.jsx(Text, {
                      color: "suggestion",
                      children: ae ? vGd.pointer : " "
                    }), Fs.jsx(Text, {
                      color: se ? "success" : undefined,
                      children: se ? vGd.checkboxOn : vGd.checkboxOff
                    }), Fs.jsx(Text, {
                      color: ae ? "suggestion" : undefined,
                      bold: ae,
                      children: re
                    })]
                  }, oe);
                })
              });
            } else {
              let oe = P ? Fs.jsxs(Text, {
                dimColor: true,
                children: [vGd.triangleRightSmall, " "]
              }) : null;
              if (Z.length > 0) {
                let ee = Z.map(re => Irn(M, re));
                K = Fs.jsxs(Text, {
                  children: [oe, Fs.jsx(Text, {
                    color: z,
                    bold: P,
                    children: ee.join(", ")
                  })]
                });
              } else {
                K = Fs.jsxs(Text, {
                  children: [oe, Fs.jsx(Text, {
                    dimColor: true,
                    italic: true,
                    children: "not set"
                  })]
                });
              }
            }
          } else if (whe(M)) {
            let Q = VRt(M);
            if (c === O && P) {
              K = Fs.jsx(Text, {
                dimColor: true,
                children: vGd.triangleDownSmall
              });
              J = Fs.jsx(gXd, {
                flexDirection: "column",
                marginLeft: 6,
                children: Q.map((ne, oe) => {
                  let ee = Prn(M, ne);
                  let re = F === ne;
                  let se = oe === u;
                  return Fs.jsxs(gXd, {
                    gap: 1,
                    children: [Fs.jsx(Text, {
                      color: "suggestion",
                      children: se ? vGd.pointer : " "
                    }), Fs.jsx(Text, {
                      color: re ? "success" : undefined,
                      children: re ? vGd.radioOn : vGd.radioOff
                    }), Fs.jsx(Text, {
                      color: se ? "suggestion" : undefined,
                      bold: se,
                      children: ee
                    })]
                  }, ne);
                })
              });
            } else {
              let ne = P ? Fs.jsxs(Text, {
                dimColor: true,
                children: [vGd.triangleRightSmall, " "]
              }) : null;
              if (H) {
                K = Fs.jsxs(Text, {
                  children: [ne, Fs.jsx(Text, {
                    color: z,
                    bold: P,
                    children: Prn(M, F)
                  })]
                });
              } else {
                K = Fs.jsxs(Text, {
                  children: [ne, Fs.jsx(Text, {
                    dimColor: true,
                    italic: true,
                    children: "not set"
                  })]
                });
              }
            }
          } else if (M.type === "boolean") {
            if (P) {
              K = H ? Fs.jsx(Text, {
                color: z,
                bold: true,
                children: F ? vGd.checkboxOn : vGd.checkboxOff
              }) : Fs.jsx(Text, {
                dimColor: true,
                children: vGd.checkboxOff
              });
            } else {
              K = H ? Fs.jsx(Text, {
                children: F ? vGd.checkboxOn : vGd.checkboxOff
              }) : Fs.jsx(Text, {
                dimColor: true,
                italic: true,
                children: "not set"
              });
            }
          } else if (Drn(M)) {
            if (P) {
              K = Fs.jsx(Dl, {
                value: d,
                onChange: f,
                onSubmit: h,
                placeholder: "Type something\u2026",
                columns: Math.min(g - 20, 60),
                cursorOffset: p,
                onChangeCursorOffset: m,
                focus: true,
                showCursor: true
              });
            } else {
              let Q = H && Orn(M) ? hwf(String(F), M) : String(F);
              K = H ? Fs.jsx(Text, {
                children: Q
              }) : Fs.jsx(Text, {
                dimColor: true,
                italic: true,
                children: "not set"
              });
            }
          } else {
            K = H ? Fs.jsx(Text, {
              children: String(F)
            }) : Fs.jsx(Text, {
              dimColor: true,
              italic: true,
              children: "not set"
            });
          }
          return Fs.jsxs(gXd, {
            flexDirection: "column",
            children: [Fs.jsxs(gXd, {
              gap: 1,
              children: [Fs.jsx(Text, {
                color: j,
                children: P ? vGd.pointer : " "
              }), W, Fs.jsxs(gXd, {
                children: [V, Fs.jsx(Text, {
                  color: z,
                  children: ": "
                }), K]
              })]
            }), J, M.description && Fs.jsx(gXd, {
              marginLeft: 6,
              children: Fs.jsx(Text, {
                dimColor: true,
                children: M.description
              })
            }), Fs.jsx(gXd, {
              marginLeft: 6,
              height: 1,
              children: U ? Fs.jsx(Text, {
                color: "error",
                italic: true,
                children: U
              }) : Fs.jsx(Text, {
                children: " "
              })
            })]
          }, O);
        };
        t[20] = u;
        t[21] = g;
        t[22] = o;
        t[23] = c;
        t[24] = s;
        t[25] = i;
        t[26] = f;
        t[27] = h;
        t[28] = l;
        t[29] = r.start;
        t[30] = m;
        t[31] = p;
        t[32] = d;
        t[33] = a;
        t[34] = x;
      } else {
        x = t[34];
      }
      S = n.slice(r.start, r.end).map(x);
      t[3] = u;
      t[4] = g;
      t[5] = o;
      t[6] = c;
      t[7] = s;
      t[8] = i;
      t[9] = f;
      t[10] = h;
      t[11] = l;
      t[12] = n;
      t[13] = r.end;
      t[14] = r.start;
      t[15] = m;
      t[16] = p;
      t[17] = d;
      t[18] = a;
      t[19] = S;
    } else {
      S = t[19];
    }
    let E;
    if (t[35] !== _ || t[36] !== n.length || t[37] !== r.end) {
      E = _ && Fs.jsx(gXd, {
        marginLeft: 2,
        children: Fs.jsxs(Text, {
          dimColor: true,
          children: [vGd.arrowDown, " ", n.length - r.end, " more below"]
        })
      });
      t[35] = _;
      t[36] = n.length;
      t[37] = r.end;
      t[38] = E;
    } else {
      E = t[38];
    }
    let C;
    if (t[39] !== b || t[40] !== S || t[41] !== E) {
      C = Fs.jsxs(gXd, {
        flexDirection: "column",
        children: [b, S, E]
      });
      t[39] = b;
      t[40] = S;
      t[41] = E;
      t[42] = C;
    } else {
      C = t[42];
    }
    return C;
  }
  var shr;
  var ib;
  var Fs;
  var Drn = e => ["string", "number", "integer"].includes(e.type);
  var JJo = __lazy(() => {
    px();
    YJo();
    ki();
    et();
    Bs();
    ky();
    sCc();
    Zn();
    Sd();
    Ai();
    Ii();
    bs();
    q_();
    shr = __toESM(pt(), 1);
    ib = __toESM(ot(), 1);
    Fs = __toESM(ie(), 1);
  });
  function Che() {
    return aCc.useSyncExternalStore(LTe, Gpt);
  }
  var aCc;
  var zRt = __lazy(() => {
    Rf();
    aCc = __toESM(ot(), 1);
  });
  function ahr(e, t) {
    let n = Mrn.useRef(undefined);
    let r = Mrn.useRef(t);
    r.current = t;
    Mrn.useEffect(() => {
      let o = p9(e);
      if (n.current !== o) {
        n.current = o;
      }
      if (o) {
        o.client.setNotificationHandler(Swf(), s => {
          if (n.current !== o) {
            return;
          }
          try {
            let i = s.params;
            let a = i.lineStart !== undefined ? i.lineStart + 1 : undefined;
            let l = i.lineEnd !== undefined ? i.lineEnd + 1 : undefined;
            r.current({
              filePath: i.filePath,
              lineStart: a,
              lineEnd: l
            });
            Pe("ide_at_mention");
          } catch (i) {
            Oe(i);
            Ae("ide_at_mention", "ide_at_mention_failed");
          }
        });
      }
    }, [e]);
  }
  function lhr(e, t) {
    let n = lCc.default.relative(Nt(), e.filePath);
    let r;
    if (e.lineStart && e.lineEnd) {
      r = e.lineStart === e.lineEnd ? `@${n}#L${e.lineStart} ` : `@${n}#L${e.lineStart}-${e.lineEnd} `;
    } else {
      r = `@${n} `;
    }
    if (t !== undefined && !/\s/.test(t)) {
      r = ` ${r}`;
    }
    return r;
  }
  var lCc;
  var Mrn;
  var Swf;
  var chr = __lazy(() => {
    Rn();
    ln();
    vo();
    bT();
    lCc = __toESM(require("path"));
    Mrn = __toESM(ot(), 1);
    Swf = we(() => v.object({
      method: v.literal("at_mentioned"),
      params: v.object({
        filePath: v.string(),
        lineStart: v.number().optional(),
        lineEnd: v.number().optional()
      })
    }));
  });
  function Rhe() {
    let e = bt(r => Ntn(r.settings));
    let t = bt(r => r.authVersion);
    let n = uhr.useMemo(() => e && jdr(), [t, e]);
    uhr.useEffect(() => {
      if (cCc) {
        return;
      }
      cCc = true;
      logEvent("tengu_voice_init_gate", {
        user_intent_store: e,
        user_intent_disk: Ntn(getInitialSettings()),
        has_voice_auth: jdr(),
        voice_mode_allowed: qdr(),
        auth_version: t
      });
    }, []);
    return n && Mtn() && qdr();
  }
  var uhr;
  var cCc = false;
  var Nrn = __lazy(() => {
    Ot();
    ho();
    Ltn();
    uhr = __toESM(ot(), 1);
  });
  function dhr() {
    return uCc.useSyncExternalStore(U4t.subscribe, U4t.getState);
  }
  var uCc;
  var XJo = __lazy(() => {
    Tpt();
    uCc = __toESM(ot(), 1);
  });
  function dCc(e) {
    return `${KRt.major(e, {
      loose: true
    })}.${KRt.minor(e, {
      loose: true
    })}.${KRt.patch(e, {
      loose: true
    })}`;
  }
  function phr(e, t = {
    ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
    PACKAGE_URL: "@anthropic-ai/claude-code",
    README_URL: "https://code.claude.com/docs/en/overview",
    VERSION: "2.1.198",
    FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
    BUILD_TIME: "2026-07-01T06:09:31Z",
    GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
  }.VERSION) {
    let [n, r] = pCc.useState(() => dCc(t));
    if (!e) {
      return null;
    }
    let o = dCc(e);
    if (o !== n) {
      r(o);
      return o;
    }
    return null;
  }
  var pCc;
  var KRt;
  var QJo = __lazy(() => {
    pCc = __toESM(ot(), 1);
    KRt = __toESM(lq(), 1);
  });
  function mCc({
    isUpdating: e,
    onChangeIsUpdating: t,
    showSuccessMessage: n,
    verbose: r
  }) {
    let o = bt(g => g.autoUpdaterResult);
    let s = Lo();
    let [i, a] = FK.useState({});
    let [l, c] = FK.useState(false);
    let u = phr(o?.version);
    FK.useEffect(() => {
      VVe().then(c);
    }, []);
    let d = FK.useRef(e);
    let p = FK.useRef(o?.status);
    let m = FK.useRef(o?.consecutiveExeLockFailures ?? 0);
    FK.useEffect(() => {
      d.current = e;
      p.current = o?.status;
      m.current = o?.consecutiveExeLockFailures ?? 0;
    });
    let f = FK.useCallback(async () => {
      if (d.current) {
        return;
      }
      if (p.current === "no_permissions") {
        logForDebugging("AutoUpdater: Skipping update check (no_permissions persists this session)");
        return;
      }
      if (m.current >= 2) {
        logForDebugging("AutoUpdater: Skipping update check (claude.exe locked by another process; damped for this session)");
        return;
      }
      if (isAutoUpdaterDisabled()) {
        return;
      }
      if (L_t()) {
        return;
      }
      let g = {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION;
      let y = UZ();
      let _ = await B_t(y);
      let {
        maxVersion: b,
        forceDowngradeEnabled: S
      } = await JVe();
      let E = null;
      let C = false;
      if (S && b) {
        if (C = F_t(g, b, "auto_updater"), C) {
          E = b;
        }
      }
      if (!E && _) {
        if (b && mv(_, b)) {
          if (logForDebugging(`AutoUpdater: maxVersion ${b} is set, capping update from ${_} to ${b}`), mv(b, g)) {
            E = b;
          } else {
            logForDebugging(`AutoUpdater: current version ${g} is already at or above maxVersion ${b}, skipping update`);
          }
        } else if (mv(_, g)) {
          E = _;
        }
      }
      if (a({
        global: g,
        latest: E ?? _
      }), !E || U_t(E)) {
        return;
      }
      if (C) {
        logEvent("tengu_auto_updater_forced_downgrade", {
          from_version: uS(g),
          to_version: uS(E)
        });
      }
      let x = Date.now();
      t(true);
      let A = getGlobalConfig();
      if (A.installMethod !== "native" && !st(process.env.DISABLE_INSTALLATION_CHECKS)) {
        await Pzt();
      }
      let k = await pve();
      if (logForDebugging(`AutoUpdater: Detected installation type: ${k}`), k === "development") {
        logForDebugging("AutoUpdater: Cannot auto-update development build");
        t(false);
        return;
      }
      let I;
      let O;
      let M;
      if (k === "npm-local") {
        logForDebugging("AutoUpdater: Using local update method");
        O = "local";
        I = await Szt(y, E);
      } else if (k === "npm-global") {
        logForDebugging("AutoUpdater: Using global update method");
        O = "global";
        M = await vzt(E);
        I = M.status;
      } else if (k === "native") {
        logForDebugging("AutoUpdater: Unexpected native installation in non-native updater");
        t(false);
        return;
      } else {
        logForDebugging("AutoUpdater: Unknown installation type, falling back to config");
        let P = A.installMethod === "local";
        if (O = P ? "local" : "global", P) {
          I = await Szt(y, E);
        } else {
          M = await vzt(E);
          I = M.status;
        }
      }
      t(false);
      let L = M?.failureHint;
      if (I !== "in_progress") {
        XVe({
          timestamp: new Date().toISOString(),
          path: O === "local" ? "npm-local" : "npm-global",
          outcome: I === "success" ? "success" : "failed",
          status: I,
          version_from: g,
          version_to: E,
          error_code: I === "install_failed" && $_t() ? "update_apply_restore_failed" : L === "windows_running_exe_lock" ? "update_apply_exe_locked" : null
        });
      }
      if (I === "success") {
        logEvent("tengu_auto_updater_success", {
          fromVersion: uS(g),
          toVersion: uS(E),
          durationMs: Date.now() - x,
          wasMigrated: O === "local",
          installationType: k
        });
      } else if (I !== "in_progress") {
        logEvent("tengu_auto_updater_fail", {
          fromVersion: uS(g),
          attemptedVersion: uS(E),
          status: I,
          durationMs: Date.now() - x,
          wasMigrated: O === "local",
          installationType: k
        });
      }
      s(P => {
        let F = P.autoUpdaterResult;
        let H = F?.consecutiveExeLockFailures ?? 0;
        let U = I === "in_progress" ? H : L === "windows_running_exe_lock" ? H + 1 : 0;
        if (F?.version === E && F?.status === I && F?.failureHint === L && (F?.consecutiveExeLockFailures ?? 0) === U) {
          return P;
        }
        return {
          ...P,
          autoUpdaterResult: {
            version: E,
            status: I,
            failureHint: L,
            consecutiveExeLockFailures: U
          }
        };
      });
    }, [s]);
    if (FK.useEffect(() => {
      f();
    }, [f]), useInterval(f, 1800000), !o?.version && (!i.global || !i.latest)) {
      return null;
    }
    if (!o?.version && !e) {
      return null;
    }
    let h = o?.status === "install_failed" ? $_t() : null;
    return nC.jsxs(gXd, {
      flexDirection: "row",
      gap: 1,
      children: [r && nC.jsxs(Text, {
        dimColor: true,
        wrap: "truncate",
        children: ["globalVersion: ", i.global, " \xB7 latestVersion:", " ", i.latest]
      }), e ? nC.jsx(nC.Fragment, {
        children: nC.jsx(gXd, {
          children: nC.jsx(Text, {
            color: "text",
            dimColor: true,
            wrap: "truncate",
            children: "Auto-updating\u2026"
          })
        })
      }) : o?.status === "success" && n && u && nC.jsxs(Text, {
        color: "success",
        wrap: "truncate",
        children: [nC.jsx(Ps, {
          status: "success",
          withSpace: true
        }), "Update installed \xB7 Restart to apply"]
      }), o?.status === "no_permissions" && nC.jsxs(Text, {
        color: "error",
        wrap: "truncate",
        children: [nC.jsx(Ps, {
          status: "error",
          withSpace: true
        }), "Auto-update failed: no write permission to npm prefix \xB7 Run", " ", nC.jsx(Text, {
          bold: true,
          children: "/doctor"
        })]
      }), o?.status === "install_failed" && (h ? nC.jsxs(gXd, {
        flexDirection: "column",
        children: [nC.jsxs(Text, {
          color: "error",
          wrap: "truncate",
          children: [nC.jsx(Ps, {
            status: "error",
            withSpace: true
          }), "Update failed and ", ZJo.basename(h.originalPath), " could not be restored \u2014 it was preserved at:"]
        }), nC.jsxs(Text, {
          color: "error",
          wrap: "truncate",
          children: [h.preservedPath, " \xB7 rename it back to", " ", ZJo.basename(h.originalPath), " or run", " ", nC.jsxs(Text, {
            bold: true,
            children: ["npm i -g ", {
              ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
              PACKAGE_URL: "@anthropic-ai/claude-code",
              README_URL: "https://code.claude.com/docs/en/overview",
              VERSION: "2.1.198",
              FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
              BUILD_TIME: "2026-07-01T06:09:31Z",
              GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
            }.PACKAGE_URL]
          })]
        })]
      }) : o.failureHint === "windows_running_exe_lock" ? nC.jsxs(Text, {
        color: "error",
        wrap: "truncate",
        children: [nC.jsx(Ps, {
          status: "error",
          withSpace: true
        }), "Auto-update failed: claude.exe in use (close other Claude Code sessions, including VS Code) \xB7 Run ", nC.jsx(Text, {
          bold: true,
          children: "/doctor"
        })]
      }) : nC.jsxs(Text, {
        color: "error",
        wrap: "truncate",
        children: [nC.jsx(Ps, {
          status: "error",
          withSpace: true
        }), "Auto-update failed \xB7 Try ", nC.jsx(Text, {
          bold: true,
          children: "/doctor"
        }), " or", " ", nC.jsx(Text, {
          bold: true,
          children: l ? `cd ~/.claude/local && npm update ${{
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.PACKAGE_URL}` : `npm i -g ${{
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.PACKAGE_URL}`
        })]
      }))]
    });
  }
  var ZJo;
  var FK;
  var nC;
  var fCc = __lazy(() => {
    Ot();
    Gu();
    QJo();
    et();
    ho();
    uve();
    je();
    D1e();
    gn();
    H_t();
    zVe();
    qQ();
    XFe();
    Vf();
    ZJo = require("path");
    FK = __toESM(ot(), 1);
    nC = __toESM(ie(), 1);
  });
  function Ewf(e) {
    if (e.includes("timeout")) {
      return "timeout";
    }
    if (e.includes("Checksum mismatch")) {
      return "checksum_mismatch";
    }
    if (e.includes("ENOENT") || e.includes("not found")) {
      return "not_found";
    }
    if (e.includes("EACCES") || e.includes("permission")) {
      return "permission_denied";
    }
    if (e.includes("ENOSPC")) {
      return "disk_full";
    }
    if (e.includes("npm")) {
      return "npm_error";
    }
    if (e.includes("network") || e.includes("ECONNREFUSED") || e.includes("ENOTFOUND")) {
      return "network_error";
    }
    let t = e.toLowerCase();
    if (e.includes("ENOEXEC") || t.includes("exec format error") || t.includes("bad cpu type") || t.includes("cannot execute binary") || t.includes("code signature") || t.includes("gatekeeper") || t.includes("killed: 9")) {
      return "exec_format";
    }
    if (t.includes("virus") || t.includes("quarantine") || t.includes("defender") || t.includes("operation did not complete successfully because the file contains")) {
      return "av_quarantine";
    }
    if (e.includes("EXDEV") || e.includes("EEXIST") || e.includes("EBUSY") || t.includes("rename") || t.includes("move failed") || t.includes("cross-device")) {
      return "swap_failure";
    }
    return "unknown";
  }
  function hCc({
    isUpdating: e,
    onChangeIsUpdating: t,
    showSuccessMessage: n,
    verbose: r
  }) {
    let o = bt(_ => _.autoUpdaterResult);
    let s = Lo();
    let [i, a] = wee.useState({
      current: {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION
    });
    let [l, c] = wee.useState(null);
    let u = phr(o?.version);
    let d = UZ();
    let p = wee.useRef(e);
    wee.useEffect(() => {
      p.current = e;
    });
    let m = wee.useRef(o);
    wee.useEffect(() => {
      m.current = o;
    });
    let f = wee.useCallback(async () => {
      if (p.current) {
        return;
      }
      if (m.current?.status === "success") {
        return;
      }
      if (isAutoUpdaterDisabled()) {
        return;
      }
      let _ = await iYn();
      if (_ && mv({
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION, _)) {
        let S = await Nll();
        c(S ?? "affects your version");
      }
      if (L_t()) {
        return;
      }
      t(true);
      let b = Date.now();
      logEvent("tengu_native_auto_updater_start", {});
      try {
        let S = await rze(d);
        let E = {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION;
        let C = Date.now() - b;
        if (S.lockFailed) {
          logEvent("tengu_native_auto_updater_lock_contention", {
            latency_ms: C
          });
          return;
        }
        if (a({
          current: E,
          latest: S.latestVersion
        }), S.wasUpdated) {
          XVe({
            timestamp: new Date().toISOString(),
            path: "native",
            outcome: "success",
            status: "success",
            version_from: E,
            version_to: S.latestVersion ?? null,
            error_code: null
          });
          logEvent("tengu_native_auto_updater_success", {
            latency_ms: C
          });
          s(x => {
            let A = x.autoUpdaterResult;
            if (A?.version === S.latestVersion && A?.status === "success") {
              return x;
            }
            return {
              ...x,
              autoUpdaterResult: {
                version: S.latestVersion,
                status: "success"
              }
            };
          });
        } else {
          logEvent("tengu_native_auto_updater_up_to_date", {
            latency_ms: C
          });
        }
      } catch (S) {
        let E = Date.now() - b;
        let C = S instanceof Error ? S.message : String(S);
        logForDebugging(`Native auto-updater failed: ${C}`, {
          level: "error"
        });
        XVe({
          timestamp: new Date().toISOString(),
          path: "native",
          outcome: "failed",
          status: "install_failed",
          version_from: {
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.VERSION,
          version_to: null,
          error_code: null
        });
        let x = Ewf(C);
        let A = gd(S) ?? "none";
        logEvent("tengu_native_auto_updater_fail", {
          latency_ms: E,
          error_code: A,
          error_timeout: x === "timeout",
          error_checksum: x === "checksum_mismatch",
          error_not_found: x === "not_found",
          error_permission: x === "permission_denied",
          error_disk_full: x === "disk_full",
          error_npm: x === "npm_error",
          error_network: x === "network_error",
          error_swap_failure: x === "swap_failure",
          error_exec_format: x === "exec_format",
          error_av_quarantine: x === "av_quarantine"
        });
        s(k => {
          let I = k.autoUpdaterResult;
          if (I?.version === null && I?.status === "install_failed") {
            return k;
          }
          return {
            ...k,
            autoUpdaterResult: {
              version: null,
              status: "install_failed"
            }
          };
        });
      } finally {
        t(false);
      }
    }, [s, d]);
    wee.useEffect(() => {
      f();
    }, [f]);
    useInterval(f, 1800000);
    let h = !!o?.status;
    let g = !!i.current && !!i.latest;
    if (!(!!l || h || e && g)) {
      return null;
    }
    return Uie.jsxs(gXd, {
      flexDirection: "row",
      gap: 1,
      children: [r && Uie.jsxs(Text, {
        dimColor: true,
        wrap: "truncate",
        children: ["current: ", i.current, " \xB7 ", d, ": ", i.latest]
      }), e ? Uie.jsx(gXd, {
        children: Uie.jsx(Text, {
          dimColor: true,
          wrap: "truncate",
          children: "Checking for updates"
        })
      }) : o?.status === "success" && n && u && Uie.jsxs(Text, {
        color: "success",
        wrap: "truncate",
        children: [Uie.jsx(Ps, {
          status: "success",
          withSpace: true
        }), "Update installed \xB7 Restart to update"]
      }), o?.status === "install_failed" && Uie.jsxs(Text, {
        color: "error",
        wrap: "truncate",
        children: [Uie.jsx(Ps, {
          status: "error",
          withSpace: true
        }), "Auto-update failed \xB7 Run ", Uie.jsx(Text, {
          bold: true,
          children: "/doctor"
        })]
      }), l && false]
    });
  }
  var wee;
  var Uie;
  var gCc = __lazy(() => {
    Ot();
    je();
    dt();
    QJo();
    et();
    ho();
    uve();
    H_t();
    qQ();
    XFe();
    Vf();
    wee = __toESM(ot(), 1);
    Uie = __toESM(ie(), 1);
  });
  function vwf(e, t) {
    switch (e) {
      case "homebrew":
        return ["brew", "upgrade", "--cask", t ?? "claude-code"];
      case "winget":
        {
          let n = process.env.LOCALAPPDATA;
          return [n ? TCc.join(n, "Microsoft", "WindowsApps", "winget.exe") : "winget", "upgrade", "--id", "Anthropic.ClaudeCode", "--exact", "--silent", "--disable-interactivity"];
        }
      default:
        return null;
    }
  }
  function wwf(e, t) {
    switch (e) {
      case "homebrew":
        return `brew upgrade ${t ?? "claude-code"}`;
      case "winget":
        return "winget upgrade Anthropic.ClaudeCode";
      case "mise":
        return "mise upgrade claude";
      case "apk":
        return "apk upgrade claude-code";
      default:
        return "your package manager update command";
    }
  }
  function ECc(e) {
    let t = bCc.c(37);
    let {
      isUpdating: n,
      onChangeIsUpdating: r,
      showSuccessMessage: o,
      verbose: s
    } = e;
    let i = bt(Rwf);
    let a = Lo();
    let [l, c] = Cee.useState(mhr);
    let [u, d] = Cee.useState("unknown");
    let [p, m] = Cee.useState(null);
    let f = Cee.useRef(n);
    let h;
    if (t[0] !== n) {
      h = () => {
        f.current = n;
      };
      t[0] = n;
      t[1] = h;
    } else {
      h = t[1];
    }
    Cee.useEffect(h);
    let g = Cee.useRef(i);
    let y;
    if (t[2] !== i) {
      y = () => {
        g.current = i;
      };
      t[2] = i;
      t[3] = y;
    } else {
      y = t[3];
    }
    Cee.useEffect(y);
    let _;
    let b;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      _ = () => {
        QVe().then(F => {
          if (d(F), F === "homebrew") {
            m(wzt());
          }
        });
      };
      b = [];
      t[4] = _;
      t[5] = b;
    } else {
      _ = t[4];
      b = t[5];
    }
    Cee.useEffect(_, b);
    let S;
    if (t[6] !== r || t[7] !== a) {
      S = async () => {
        if (f.current) {
          return;
        }
        if (g.current?.status === "success") {
          return;
        }
        if (isAutoUpdaterDisabled()) {
          return;
        }
        if (L_t()) {
          return;
        }
        if (g.current?.status === "install_failed") {
          if (Date.now() - yCc < 1800000) {
            return;
          }
          g.current = null;
          a(Cwf);
        }
        let [F, H] = await Promise.all([UZ(), QVe()]);
        let U = F;
        let N = null;
        if (H === "homebrew") {
          N = wzt();
          U = N === "claude-code@latest" ? "latest" : "stable";
        }
        let W = H === "homebrew" ? await lYn(N ?? "claude-code", U) : await Ezt(U);
        let j = await iYn();
        let z = false;
        if (j && W && mv(W, j)) {
          if (logForDebugging(`PackageManagerAutoUpdater: maxVersion ${j} is set, capping update from ${W} to ${j}`), iO({
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.VERSION, j)) {
            logForDebugging(`PackageManagerAutoUpdater: current version ${{
              ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
              PACKAGE_URL: "@anthropic-ai/claude-code",
              README_URL: "https://code.claude.com/docs/en/overview",
              VERSION: "2.1.198",
              FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
              BUILD_TIME: "2026-07-01T06:09:31Z",
              GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
            }.VERSION} is already at or above maxVersion ${j}, skipping update`);
            mhr = null;
            c(null);
            return;
          }
          W = j;
          z = true;
        }
        let V = W && !iO({
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION, W) && !U_t(W);
        if (mhr = V ? W : null, c(mhr), !V) {
          return;
        }
        logForDebugging(`PackageManagerAutoUpdater: Update available ${{
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION} -> ${W}`);
        let K = st(process.env.CLAUDE_CODE_PACKAGE_MANAGER_AUTO_UPDATE);
        let J = vwf(H, N);
        if (!K || !J || z) {
          return;
        }
        if (f.current) {
          return;
        }
        r(true);
        let Q = Date.now();
        let Z = {
          pm_homebrew: H === "homebrew",
          pm_winget: H === "winget"
        };
        logEvent("tengu_pkg_manager_auto_updater_start", Z);
        let [ne, ...oe] = J;
        let ee = await execFileNoThrowWithCwd(ne, oe, {
          cwd: SCc.homedir(),
          timeout: 300000,
          env: H === "homebrew" ? {
            ...process.env,
            HOMEBREW_NO_AUTO_UPDATE: ""
          } : undefined
        });
        let re = Date.now() - Q;
        if (r(false), ee.code === 0) {
          logEvent("tengu_pkg_manager_auto_updater_success", {
            ...Z,
            latency_ms: re
          });
          a(se => {
            let ae = se.autoUpdaterResult;
            if (ae?.version === W && ae?.status === "success") {
              return se;
            }
            return {
              ...se,
              autoUpdaterResult: {
                version: W,
                status: "success"
              }
            };
          });
        } else {
          logForDebugging(`PackageManagerAutoUpdater: ${ne} exited ${ee.code}: ${ee.stderr || ee.error || ee.stdout}`);
          logEvent("tengu_pkg_manager_auto_updater_fail", {
            ...Z,
            latency_ms: re,
            exit_code: ee.code
          });
          yCc = Date.now();
          a(se => {
            if (se.autoUpdaterResult?.status === "install_failed") {
              return se;
            }
            return {
              ...se,
              autoUpdaterResult: {
                version: W,
                status: "install_failed"
              }
            };
          });
        }
      };
      t[6] = r;
      t[7] = a;
      t[8] = S;
    } else {
      S = t[8];
    }
    let E = S;
    let C;
    let x;
    if (t[9] !== E) {
      C = () => {
        E();
      };
      x = [E];
      t[9] = E;
      t[10] = C;
      t[11] = x;
    } else {
      C = t[10];
      x = t[11];
    }
    if (Cee.useEffect(C, x), useInterval(E, 1800000), i?.status === "success") {
      if (!o) {
        return null;
      }
      let F;
      if (t[12] !== i || t[13] !== s) {
        F = s && UK.jsxs(Text, {
          dimColor: true,
          wrap: "truncate",
          children: ["current: ", {
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.VERSION, " \xB7 latest:", " ", i.version]
        });
        t[12] = i;
        t[13] = s;
        t[14] = F;
      } else {
        F = t[14];
      }
      let H = u !== "unknown" && ` via ${u}`;
      let U;
      if (t[15] !== H) {
        U = UK.jsxs(Text, {
          color: "success",
          wrap: "truncate",
          children: ["\u2713 Update installed", H, " \xB7 Restart to apply"]
        });
        t[15] = H;
        t[16] = U;
      } else {
        U = t[16];
      }
      let N;
      if (t[17] !== U || t[18] !== F) {
        N = UK.jsxs(gXd, {
          flexDirection: "row",
          gap: 1,
          children: [F, U]
        });
        t[17] = U;
        t[18] = F;
        t[19] = N;
      } else {
        N = t[19];
      }
      return N;
    }
    if (n) {
      let F = u === "unknown" ? "Updating\u2026" : `Updating via ${u}\u2026`;
      let H;
      if (t[20] !== F) {
        H = UK.jsx(Text, {
          dimColor: true,
          wrap: "truncate",
          children: F
        });
        t[20] = F;
        t[21] = H;
      } else {
        H = t[21];
      }
      return H;
    }
    let A = i?.status === "install_failed";
    if (!l && !A || u === "unknown") {
      return null;
    }
    let k;
    if (t[22] !== s) {
      k = s && UK.jsxs(Text, {
        dimColor: true,
        wrap: "truncate",
        children: ["currentVersion: ", {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION]
      });
      t[22] = s;
      t[23] = k;
    } else {
      k = t[23];
    }
    let I;
    if (t[24] !== p || t[25] !== u) {
      I = wwf(u, p);
      t[24] = p;
      t[25] = u;
      t[26] = I;
    } else {
      I = t[26];
    }
    let O;
    if (t[27] !== I) {
      O = UK.jsx(Text, {
        bold: true,
        children: I
      });
      t[27] = I;
      t[28] = O;
    } else {
      O = t[28];
    }
    let M;
    if (t[29] !== A) {
      M = A && UK.jsx(Text, {
        dimColor: true,
        children: " (auto-update failed)"
      });
      t[29] = A;
      t[30] = M;
    } else {
      M = t[30];
    }
    let L;
    if (t[31] !== O || t[32] !== M) {
      L = UK.jsxs(Text, {
        color: "warning",
        wrap: "truncate",
        children: ["Update available! Run:", " ", O, M]
      });
      t[31] = O;
      t[32] = M;
      t[33] = L;
    } else {
      L = t[33];
    }
    let P;
    if (t[34] !== L || t[35] !== k) {
      P = UK.jsxs(UK.Fragment, {
        children: [k, L]
      });
      t[34] = L;
      t[35] = k;
      t[36] = P;
    } else {
      P = t[36];
    }
    return P;
  }
  function Cwf(e) {
    return e.autoUpdaterResult?.status === "install_failed" ? {
      ...e,
      autoUpdaterResult: null
    } : e;
  }
  function Rwf(e) {
    return e.autoUpdaterResult;
  }
  var bCc;
  var SCc;
  var TCc;
  var Cee;
  var UK;
  var yCc = 0;
  var mhr = null;
  var vCc = __lazy(() => {
    Ot();
    et();
    ho();
    uve();
    je();
    gn();
    ji();
    pYn();
    XFe();
    bCc = __toESM(pt(), 1);
    SCc = require("os");
    TCc = require("path");
    Cee = __toESM(ot(), 1);
    UK = __toESM(ie(), 1);
  });
  function fhr(e) {
    let t = wCc.c(13);
    let {
      isUpdating: n,
      onChangeIsUpdating: r,
      showSuccessMessage: o,
      verbose: s
    } = e;
    let [i, a] = Lrn.useState(null);
    let [l, c] = Lrn.useState(null);
    let u;
    let d;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      u = () => {
        (async function () {
          let g = await pve();
          logForDebugging(`AutoUpdaterWrapper: Installation type: ${g}`);
          a(g === "native");
          c(g === "package-manager");
        })();
      };
      d = [];
      t[0] = u;
      t[1] = d;
    } else {
      u = t[0];
      d = t[1];
    }
    if (Lrn.useEffect(u, d), i === null || l === null) {
      return null;
    }
    if (l) {
      let f;
      if (t[2] !== n || t[3] !== r || t[4] !== o || t[5] !== s) {
        f = eXo.jsx(ECc, {
          verbose: s,
          isUpdating: n,
          onChangeIsUpdating: r,
          showSuccessMessage: o
        });
        t[2] = n;
        t[3] = r;
        t[4] = o;
        t[5] = s;
        t[6] = f;
      } else {
        f = t[6];
      }
      return f;
    }
    let p = i ? hCc : mCc;
    let m;
    if (t[7] !== p || t[8] !== n || t[9] !== r || t[10] !== o || t[11] !== s) {
      m = eXo.jsx(p, {
        verbose: s,
        isUpdating: n,
        onChangeIsUpdating: r,
        showSuccessMessage: o
      });
      t[7] = p;
      t[8] = n;
      t[9] = r;
      t[10] = o;
      t[11] = s;
      t[12] = m;
    } else {
      m = t[12];
    }
    return m;
  }
  var wCc;
  var Lrn;
  var eXo;
  var tXo = __lazy(() => {
    je();
    D1e();
    fCc();
    gCc();
    vCc();
    wCc = __toESM(pt(), 1);
    Lrn = __toESM(ot(), 1);
    eXo = __toESM(ie(), 1);
  });
  function hhr() {
    let e = CCc.c(7);
    let t = bt(xwf);
    if (!t) {
      return null;
    }
    if ("jsx" in t) {
      let o;
      if (e[0] !== t.jsx || e[1] !== t.key) {
        o = nXo.jsx(Text, {
          wrap: "truncate",
          children: t.jsx
        }, t.key);
        e[0] = t.jsx;
        e[1] = t.key;
        e[2] = o;
      } else {
        o = e[2];
      }
      return o;
    }
    let n = !t.color;
    let r;
    if (e[3] !== t.color || e[4] !== t.text || e[5] !== n) {
      r = nXo.jsx(Text, {
        color: t.color,
        dimColor: n,
        wrap: "truncate",
        children: t.text
      });
      e[3] = t.color;
      e[4] = t.text;
      e[5] = n;
      e[6] = r;
    } else {
      r = e[6];
    }
    return r;
  }
  function xwf(e) {
    return e.notifications.current;
  }
  var CCc;
  var nXo;
  var rXo = __lazy(() => {
    et();
    ho();
    CCc = __toESM(pt(), 1);
    nXo = __toESM(ie(), 1);
  });
  function xCc() {
    let [e, t] = ghr.useState(null);
    let n = ghr.useRef("normal");
    useInterval(() => {
      let r;
      let o;
      try {
        ({
          heapUsed: r,
          rss: o
        } = process.memoryUsage());
      } catch (i) {
        logForDebugging(`[useMemoryUsage] process.memoryUsage() failed: ${i instanceof Error ? i.message : String(i)}`, {
          level: "error"
        });
        return;
      }
      let s = r >= 2684354560 ? "critical" : r >= 1610612736 ? "high" : "normal";
      if (RCc[s] > RCc[n.current]) {
        logEvent("tengu_memory_threshold_crossed", {
          rss_mb: Math.round(o / 1024 / 1024),
          heap_used_mb: Math.round(r / 1024 / 1024),
          status: s
        });
        n.current = s;
      }
      t(i => {
        if (s === "normal") {
          return i === null ? i : null;
        }
        return {
          heapUsed: r,
          status: s
        };
      });
    }, 1e4);
    return e;
  }
  var ghr;
  var RCc;
  var kCc = __lazy(() => {
    et();
    Ot();
    je();
    ghr = __toESM(ot(), 1);
    RCc = {
      normal: 0,
      high: 1,
      critical: 2
    };
  });
  function ACc() {
    return null;
  }
  var yhr;
  var ICc = __lazy(() => {
    kCc();
    et();
    cs();
    yhr = __toESM(ie(), 1);
  });
  function OCc(e) {
    let t = PCc.c(13);
    let {
      tokenUsage: n,
      model: r
    } = e;
    let o = bt(Owf);
    let s;
    if (t[0] !== o || t[1] !== r || t[2] !== n) {
      s = _De(n, r, o);
      t[0] = o;
      t[1] = r;
      t[2] = n;
      t[3] = s;
    } else {
      s = t[3];
    }
    let i = s;
    let a = dhr();
    if (i.level === "ok" || a) {
      return null;
    }
    let l = i.pctLeft;
    let c = Sx();
    let u;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      u = hKe("warning");
      t[4] = u;
    } else {
      u = t[4];
    }
    let d = u;
    let p = l;
    let m = !yDe(r, o);
    let f = false;
    if (m || f) {
      let _ = coe(r, o);
      let b;
      if (t[5] !== _ || t[6] !== n) {
        b = Math.round((_ - n) / _ * 100);
        t[5] = _;
        t[6] = n;
        t[7] = b;
      } else {
        b = t[7];
      }
      p = Math.max(0, b);
    }
    let h = m ? `${100 - p}% context used` : `${p}% until auto-compact`;
    if (c) {
      let _ = d ? `${h} \xB7 ${d}` : h;
      let b;
      if (t[9] !== _) {
        b = oXo.jsx(Text, {
          dimColor: true,
          wrap: "truncate",
          children: _
        });
        t[9] = _;
        t[10] = b;
      } else {
        b = t[10];
      }
      return b;
    }
    let g = d ? `Context low (${l}% remaining) \xB7 ${d}` : Me.DISABLE_COMPACT ? `Context low (${l}% remaining)` : `Context low (${l}% remaining) \xB7 Run /compact to compact & continue`;
    let y;
    if (t[11] !== g) {
      y = oXo.jsx(Text, {
        color: "error",
        wrap: "truncate",
        children: g
      });
      t[11] = g;
      t[12] = y;
    } else {
      y = t[12];
    }
    return y;
  }
  function Owf(e) {
    return e.autoCompactWindow;
  }
  var PCc;
  var Pwf;
  var oXo;
  var DCc = __lazy(() => {
    et();
    d$();
    XJo();
    ho();
    pr();
    fQn();
    PCc = __toESM(pt(), 1);
    Pwf = __toESM(ot(), 1);
    oXo = __toESM(ie(), 1);
  });
  function NCc({
    withSeparator: e
  }) {
    let t = bt(f => f.activeGoal?.setAt);
    let n = t !== undefined;
    let [r, o] = $Be.useState(0);
    let s = useClock();
    let i = $Be.useRef(null);
    if (t !== undefined && i.current?.setAt !== t) {
      i.current = {
        setAt: t,
        clockStart: s.now() - (Date.now() - t)
      };
    }
    let a = i.current;
    $Be.useEffect(() => {
      if (t === undefined || i.current === null) {
        return;
      }
      let f = s.now() - i.current.clockStart;
      let h = f < 60000 ? 1000 : 60000;
      let g = h - f % h;
      return s.setTimeout(() => o(y => y + 1), g);
    }, [t, r, s]);
    let l = useResolvedTheme();
    let c = $Be.useMemo(() => {
      if (_$u.level < 3) {
        return null;
      }
      let f = Z2(l.permission);
      return f ? Lwf(f, Rb()) : null;
    }, [l.permission, _$u.level]);
    let u = useAnimationTimer(n && c ? MCc : null);
    let d = Math.floor(u / MCc) % 20;
    if (!n || a === null) {
      return null;
    }
    let p = s.now() - a.clockStart;
    let m = p < 1000 ? "" : ` (${formatDuration(p, {
      mostSignificantOnly: true
    })})`;
    return Frn.jsxs(gXd, {
      flexShrink: 0,
      children: [e ? Frn.jsx(Text, {
        dimColor: true,
        children: " \xB7 "
      }) : null, Frn.jsxs(Text, {
        color: c?.[d] ?? "permission",
        children: ["\u25CE", " /goal active", m]
      })]
    });
  }
  function Lwf(e, t) {
    return Array.from({
      length: 20
    }, (n, r) => {
      let o = 0.5 - 0.5 * Math.cos(2 * Math.PI * r / 20);
      let s = 0.18 * (t ? g1(o) : o);
      return _1(y1(e, Nwf, s));
    });
  }
  var $Be;
  var Frn;
  var MCc;
  var Nwf;
  var LCc = __lazy(() => {
    wl();
    mT();
    et();
    ho();
    cs();
    FJ();
    Ore();
    $Be = __toESM(ot(), 1);
    Frn = __toESM(ie(), 1);
    MCc = 4000 / 20;
    Nwf = {
      r: 0,
      g: 0,
      b: 0
    };
  });
  function UCc() {
    let e = FCc.c(7);
    let [t, n] = YRt.useState(0);
    let r = YRt.useRef(null);
    let o = useClock();
    let s = Zu("app:toggleTranscript", "Global", "ctrl+o");
    let i;
    let a;
    if (e[0] !== o) {
      i = () => {
        if (!SandboxManager.isSandboxingEnabled()) {
          return;
        }
        let u = SandboxManager.getSandboxViolationStore();
        let d = u.getTotalCount();
        let p = u.subscribe(() => {
          let m = u.getTotalCount();
          let f = m - d;
          if (f > 0) {
            if (n(f), d = m, r.current) {
              r.current();
            }
            r.current = o.setTimeout(() => n(0), 5000);
          }
        });
        return () => {
          if (p(), r.current) {
            r.current();
          }
        };
      };
      a = [o];
      e[0] = o;
      e[1] = i;
      e[2] = a;
    } else {
      i = e[1];
      a = e[2];
    }
    if (YRt.useEffect(i, a), !SandboxManager.isSandboxingEnabled() || t === 0) {
      return null;
    }
    let l = t === 1 ? "operation" : "operations";
    let c;
    if (e[3] !== s || e[4] !== t || e[5] !== l) {
      c = bhr.jsx(gXd, {
        paddingX: 0,
        paddingY: 0,
        children: bhr.jsxs(Text, {
          color: "inactive",
          wrap: "truncate",
          children: ["\u29C8 Sandbox blocked ", t, " ", l, " \xB7", " ", s, " for details \xB7 /sandbox to disable"]
        })
      });
      e[3] = s;
      e[4] = t;
      e[5] = l;
      e[6] = c;
    } else {
      c = e[6];
    }
    return c;
  }
  var FCc;
  var YRt;
  var bhr;
  var BCc = __lazy(() => {
    et();
    c0();
    Th();
    FCc = __toESM(pt(), 1);
    YRt = __toESM(ot(), 1);
    bhr = __toESM(ie(), 1);
  });
  var $Cc = {};
  __export($Cc, {
    VoiceWarmupHint: () => VoiceWarmupHint,
    VoiceIndicator: () => VoiceIndicator,
    VoiceCursorChar: () => VoiceCursorChar
  });
  function VoiceIndicator(e) {
    let t = JRt.c(2);
    let n;
    if (t[0] !== e) {
      n = BK.jsx(Hwf, {
        ...e
      });
      t[0] = e;
      t[1] = n;
    } else {
      n = t[1];
    }
    return n;
  }
  function Hwf(e) {
    let t = JRt.c(3);
    let {
      voiceState: n
    } = e;
    let r = bt(jwf);
    switch (n) {
      case "recording":
        {
          if (r === "tap") {
            let s;
            if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
              s = BK.jsxs(Text, {
                children: [BK.jsxs(Text, {
                  color: "error",
                  children: [Tc, " REC"]
                }), BK.jsx(Text, {
                  dimColor: true,
                  children: " \xB7 tap to send"
                })]
              });
              t[0] = s;
            } else {
              s = t[0];
            }
            return s;
          }
          let o;
          if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
            o = BK.jsx(Text, {
              dimColor: true,
              children: "listening\u2026"
            });
            t[1] = o;
          } else {
            o = t[1];
          }
          return o;
        }
      case "processing":
        {
          let o;
          if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
            o = BK.jsx(qwf, {});
            t[2] = o;
          } else {
            o = t[2];
          }
          return o;
        }
      case "idle":
        return null;
    }
  }
  function jwf(e) {
    return e.settings.voice?.mode ?? "hold";
  }
  function VoiceCursorChar() {
    let e = JRt.c(2);
    let [, t] = jLn();
    let n;
    if (e[0] !== t) {
      n = t ? BK.jsx(Text, {
        color: t.hex,
        children: t.char
      }) : null;
      e[0] = t;
      e[1] = n;
    } else {
      n = e[1];
    }
    return n;
  }
  function VoiceWarmupHint() {
    let e = JRt.c(1);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = BK.jsx(Text, {
        dimColor: true,
        children: "keep holding\u2026"
      });
      e[0] = t;
    } else {
      t = e[0];
    }
    return t;
  }
  function qwf() {
    let e = JRt.c(8);
    let t = K_();
    let n = WC(t.prefersReducedMotion);
    let [r, o] = useAnimationFrame(n ? null : 50);
    if (n) {
      let d;
      if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
        d = BK.jsx(Text, {
          color: "warning",
          children: "Voice: processing\u2026"
        });
        e[0] = d;
      } else {
        d = e[0];
      }
      return d;
    }
    let s = o / 1000;
    let i = (Math.sin(s * Math.PI * 2 / 2) + 1) / 2;
    let a;
    if (e[1] !== i) {
      let d = Rb() ? g1(i) : i;
      a = _1(y1(Uwf, Bwf, d));
      e[1] = i;
      e[2] = a;
    } else {
      a = e[2];
    }
    let l = a;
    let c;
    if (e[3] !== l) {
      c = BK.jsx(Text, {
        color: l,
        children: "Voice: processing\u2026"
      });
      e[3] = l;
      e[4] = c;
    } else {
      c = e[4];
    }
    let u;
    if (e[5] !== r || e[6] !== c) {
      u = BK.jsx(gXd, {
        ref: r,
        children: c
      });
      e[5] = r;
      e[6] = c;
      e[7] = u;
    } else {
      u = e[7];
    }
    return u;
  }
  var JRt;
  var BK;
  var Uwf;
  var Bwf;
  var Ehr = __lazy(() => {
    wl();
    Qq();
    qLn();
    mT();
    et();
    ho();
    Dre();
    Ore();
    JRt = __toESM(pt(), 1);
    BK = __toESM(ie(), 1);
    Uwf = {
      r: 153,
      g: 153,
      b: 153
    };
    Bwf = {
      r: 185,
      g: 185,
      b: 185
    };
  });
  function HCc() {
    return vhr.join(er(), "cache", "my-closed-issues.json");
  }
  function zwf(e) {
    return new Date(e - 30 * 24 * 60 * 60 * 1000).toISOString().slice(0, 10);
  }
  async function jCc() {
    if (getIsNonInteractiveSession()) {
      return null;
    }
    if (Vi()) {
      return null;
    }
    let e = getGlobalConfig();
    let t = Date.now();
    if (t - (e.closedIssuesLastChecked ?? 0) < 86400000) {
      return null;
    }
    let n = t;
    let {
      stdout: r,
      code: o
    } = await execFileNoThrow("gh", ["issue", "list", "-R", "anthropics/claude-code", "--author", "@me", "--state", "closed", "--search", `closed:>${zwf(t)}`, "--json", "number,title,closedAt,stateReason", "--limit", "30"], {
      timeout: 5000,
      preserveOutputOnError: false
    });
    let s = Date.now() - n;
    let i = null;
    if (o === 0) {
      try {
        i = qt(r).filter(d => d.stateReason === "COMPLETED").map(d => ({
          number: d.number,
          title: d.title,
          closedAt: d.closedAt
        }));
      } catch (u) {
        logForDebugging(`Failed to parse gh issue list output: ${u}`, {
          level: "error"
        });
      }
    }
    if (i !== null) {
      try {
        let u = HCc();
        await XRt.mkdir(vhr.dirname(u), {
          recursive: true
        });
        await XRt.writeFile(u, De(i), {
          encoding: "utf-8"
        });
      } catch (u) {
        logForDebugging(`Failed to write closed-issues cache: ${u}`, {
          level: "error"
        });
      }
    }
    let a = e.closedIssuesAcknowledged ?? [];
    let l = a;
    if (i !== null) {
      let u = new Set(i.map(d => d.number));
      l = a.filter(d => u.vZc(d));
    }
    let c = l.length !== a.length || l.some((u, d) => u !== a[d]);
    saveGlobalConfig(u => ({
      ...u,
      closedIssuesLastChecked: t,
      ...(c && {
        closedIssuesAcknowledged: l
      })
    }));
    return s;
  }
  async function sXo() {
    try {
      let e = await XRt.readFile(HCc(), {
        encoding: "utf-8"
      });
      let t = qt(e);
      return Array.isArray(t) ? t : [];
    } catch (e) {
      if (!fn(e)) {
        Oe(e);
      }
      return [];
    }
  }
  function iXo(e) {
    let t = new Set(getGlobalConfig().closedIssuesAcknowledged ?? []);
    return e.filter(n => !t.vZc(n.number));
  }
  function qCc(e) {
    if (e.length === 0) {
      return;
    }
    let t = getGlobalConfig().closedIssuesAcknowledged ?? [];
    let n = Ro([...t, ...e]);
    if (n.length === t.length) {
      return;
    }
    saveGlobalConfig(r => ({
      ...r,
      closedIssuesAcknowledged: n
    }));
  }
  var XRt;
  var vhr;
  var WCc = __lazy(() => {
    at();
    je();
    gn();
    dt();
    ji();
    Rn();
    Wd();
    XRt = require("fs/promises");
    vhr = require("path");
  });
  var zCc = {};