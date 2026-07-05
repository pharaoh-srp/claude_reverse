  __export(k8c, {
    buildRemoteAttachConfig: () => buildRemoteAttachConfig,
    attachRemote: () => attachRemote
  });
  async function attachRemote(e, t, n) {
    let [{
      prepareApiRequest: r,
      fetchSession: o
    }, {
      getClaudeAIOAuthTokens: s,
      handleOAuth401Error: i
    }, {
      launchRepl: a
    }, {
      getCommands: l,
      filterCommandsForRemoteMode: c
    }, {
      getDefaultAppState: u
    }, {
      isDebugMode: d
    }, {
      consumePrefetchedHistory: p,
      reportPrefetchOutcome: m
    }] = await Promise.all([Promise.resolve().then(() => (NC(), jce)), Promise.resolve().then(() => (no(), v2)), Promise.resolve().then(() => (pts(), bqc)), Promise.resolve().then(() => (Bm(), _9o)), Promise.resolve().then(() => (j8e(), dza)), Promise.resolve().then(() => (je(), Zps)), Promise.resolve().then(() => (rrs(), nrs))]);
    let f = p(t, n?.viewerOnly ?? false);
    let h = await r().catch(b => {
      throw Error(`auth setup failed: ${he(b)}`);
    });
    let g = () => s()?.accessToken ?? h.accessToken;
    let y = {
      sessionId: getSessionId(),
      cwd: getCwdState(),
      isRemoteMode: getIsRemoteMode()
    };
    let _ = false;
    try {
      setIsRemoteMode(true);
      switchSession(t, "remote_attach");
      let b = o(t, h).then(O => {
        if (O.session_status === "archived") {
          throw logEvent("tengu_remote_attach_session_rejected", {
            reason: "archived"
          }), Error(`Cloud session ${t} is archived and cannot accept new messages.
View it at ${wS(t, undefined, {
            from: "cli",
            m: "0"
          })}`);
        }
        if (O.session_context.cwd && !_) {
          if (Rc(O.session_context.cwd)) {
            logForDebugging("[attachRemote] session reported a UNC cwd \u2014 not adopting", {
              level: "warn"
            });
          } else {
            setCwdState(O.session_context.cwd);
          }
        }
      }, O => {
        logForDebugging(`[attachRemote] preflight fetchSession failed (continuing via WS): ${he(O)}`);
      });
      b.catch(() => {});
      let S = wS(t, undefined, {
        from: "cli",
        m: "0"
      });
      let E = wc(`Attached to cloud session \xB7 code here or at ${S}`, "info");
      let C = {
        ...u(),
        ...n?.initialStateOverride,
        remoteSessionUrl: S,
        replBridgeEnabled: false,
        replBridgeOutboundOnly: false,
        replBridgeExplicit: false
      };
      let [x, A] = await Promise.all([l(y.cwd).then(c), f]);
      m(A);
      let k = A?.complete && A.maxSequenceNum > 0 ? A : null;
      C.hasRemoteReplyChannel = false;
      let I = {
        sessionId: t,
        getAccessToken: g,
        orgUuid: h.orgUUID,
        viewerOnly: n?.viewerOnly ?? false,
        isAttachToExisting: true,
        preflightCheck: b,
        onAuth401: i,
        initialSequenceNum: k?.maxSequenceNum,
        seedNestedUuidAliases: k?.nestedUuidAliases,
        seedReplyChannelToolUseIds: k?.replyChannelToolUseIds,
        seedActiveGoal: k ? k.lastActiveGoal ?? null : undefined
      };
      await a(e, {
        getFpsMetrics: () => {
          return;
        },
        initialState: C
      }, {
        debug: d(),
        commands: x,
        initialTools: [],
        initialMessages: k ? [E, ...k.messages] : [E],
        mcpClients: [],
        remoteSessionConfig: I,
        autoConnectIdeFlag: n?.autoConnectIdeFlag,
        disableSlashCommands: n?.disableSlashCommands,
        onDetachToCaller: () => e.unmount(),
        thinkingConfig: {
          type: "adaptive"
        }
      }, async (O, M) => {
        O.render(M);
        await O.waitUntilExit();
      });
    } finally {
      _ = true;
      setIsRemoteMode(y.isRemoteMode);
      setCwdState(y.cwd);
      switchSession(y.sessionId, "remote_attach");
    }
  }
  async function buildRemoteAttachConfig(e, t) {
    let [{
      prepareApiRequest: n,
      fetchSession: r
    }, {
      getClaudeAIOAuthTokens: o,
      handleOAuth401Error: s
    }, {
      consumePrefetchedHistory: i,
      reportPrefetchOutcome: a
    }] = await Promise.all([Promise.resolve().then(() => (NC(), jce)), Promise.resolve().then(() => (no(), v2)), Promise.resolve().then(() => (rrs(), nrs))]);
    let l = i(e, false);
    let c = await n();
    let u = r(e, c).then(m => {
      if (m.session_status === "archived") {
        throw logEvent("tengu_remote_attach_session_rejected", {
          reason: "archived"
        }), Error("This cloud session is archived and cannot accept new messages.");
      }
      if (m.session_context.cwd && !t()) {
        if (Rc(m.session_context.cwd)) {
          logForDebugging("[attachRemote] session reported a UNC cwd \u2014 not adopting", {
            level: "warn"
          });
        } else {
          setCwdState(m.session_context.cwd);
        }
      }
    }, m => {
      logForDebugging(`[attachRemote] preflight fetchSession failed (continuing via WS): ${he(m)}`);
    });
    u.catch(() => {});
    let d = await l;
    a(d);
    let p = d?.complete && d.maxSequenceNum > 0 ? d : null;
    return {
      seed: p,
      remoteSessionConfig: {
        sessionId: e,
        getAccessToken: () => o()?.accessToken ?? c.accessToken,
        orgUuid: c.orgUUID,
        isAttachToExisting: true,
        preflightCheck: u,
        onAuth401: s,
        initialSequenceNum: p?.maxSequenceNum,
        seedNestedUuidAliases: p?.nestedUuidAliases,
        seedReplyChannelToolUseIds: p?.replyChannelToolUseIds,
        seedActiveGoal: p ? p.lastActiveGoal ?? null : undefined
      }
    };
  }
  var A8c = __lazy(() => {
    at();
    Ot();
    D_();
    mm();
    je();
    dt();
    ro();
  });
  var M8c = {};