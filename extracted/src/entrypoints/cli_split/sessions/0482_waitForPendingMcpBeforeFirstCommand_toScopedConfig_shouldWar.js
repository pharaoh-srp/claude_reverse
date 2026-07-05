  __export(T8c, {
    waitForPendingMcpBeforeFirstCommand: () => waitForPendingMcpBeforeFirstCommand,
    toScopedConfig: () => toScopedConfig,
    shouldWarnRestrictedStartupModel: () => shouldWarnRestrictedStartupModel,
    shouldIgnoreStaleEndSession: () => shouldIgnoreStaleEndSession,
    runHeadless: () => runHeadless,
    restoreMemoryToggledOff: () => restoreMemoryToggledOff,
    restoreDeclaredDialogKinds: () => restoreDeclaredDialogKinds,
    resolveDefaultPickRepoint: () => resolveDefaultPickRepoint,
    reportTurnFailed: () => reportTurnFailed,
    reconcileMcpServers: () => reconcileMcpServers,
    modelOverrideToAdoptAfterTurn: () => modelOverrideToAdoptAfterTurn,
    mergeMcpClientLists: () => mergeMcpClientLists,
    loadInitialMessages: () => loadInitialMessages,
    kickOffBackgroundPluginInstall: () => kickOffBackgroundPluginInstall,
    joinPromptValues: () => joinPromptValues,
    isRestartedWorkerEpoch: () => isRestartedWorkerEpoch,
    handleOrphanedPermissionResponse: () => handleOrphanedPermissionResponse,
    handleMcpSetServers: () => handleMcpSetServers,
    getCanUseToolFn: () => getCanUseToolFn,
    findRewindAnchors: () => findRewindAnchors,
    deriveParkedPermission: () => deriveParkedPermission,
    createPrintRequestDialog: () => createPrintRequestDialog,
    createKeepAlivePulse: () => createKeepAlivePulse,
    createCanUseToolWithPermissionPrompt: () => createCanUseToolWithPermissionPrompt,
    canBatchWith: () => canBatchWith,
    buildToolPermissionsFromPolicy: () => buildToolPermissionsFromPolicy,
    _runHeadlessStreamingForTesting: () => _runHeadlessStreamingForTesting,
    PARKED_PERMISSION_ANSWER_WAIT_MS: () => PARKED_PERMISSION_ANSWER_WAIT_MS,
    MAX_DECLARED_DIALOG_KINDS: () => 32
  });
  function z6c(e) {
    if (Isn.vZc(e)) {
      return false;
    }
    if (Isn.add(e), gbr.push(e), gbr.length > 1e4) {
      let t = gbr.splice(0, gbr.length - 1e4);
      for (let n of t) {
        Isn.delete(n);
      }
    }
    return true;
  }
  function X6c(e) {
    let t = e?.[$4f];
    if (t == null || typeof t !== "object") {
      return;
    }
    let n = t;
    let r = o => typeof n[o] === "string" ? n[o] : undefined;
    return {
      title: r("title"),
      displayName: r("displayName"),
      description: r("description")
    };
  }
  function createPrintRequestDialog(e) {
    setSdkDialogHostActive(true);
    return async function (n, r, o) {
      if (n.kind === rft.kind) {
        let s = r;
        return await e.handleElicitation(s.serverName, s.params.message, undefined, o?.signal, s.params.mode, s.params.url, "elicitationId" in s.params ? s.params.elicitationId : undefined, X6c(s.params._meta));
      }
      if (n.kind === WX.kind || n.kind === CTe.kind) {
        if (LV(a => GI(a) && a.mode === "prompt") !== undefined) {
          logEvent("tengu_request_user_dialog_implicit_cancel", {
            dialog_kind: i3i.createHash("sha256").update(n.kind).digest("hex").slice(0, 12),
            reason: "queued_at_park"
          });
          return n.default;
        }
        let s = await e.requestUserDialog(n.kind, r, {
          signal: o?.signal
        });
        if (s.behavior === "cancelled") {
          return n.default;
        }
        let i = n.result().safeParse(s.result);
        return i.success ? i.data : n.default;
      }
      return n.default;
    };
  }
  function H4f(e) {
    return typeof e === "string" ? [{
      type: "text",
      text: e
    }] : e;
  }
  function kickOffBackgroundPluginInstall(e) {
    let t = {
      needsRefresh: false
    };
    e().then(n => {
      t.needsRefresh = n;
    }).catch(Oe);
    return t;
  }
  function joinPromptValues(e) {
    if (e.length === 1) {
      return e[0];
    }
    if (e.every(t => typeof t === "string")) {
      return e.join(`
`);
    }
    return e.flatMap(H4f);
  }
  function canBatchWith(e, t) {
    return t !== undefined && t.mode === "prompt" && t.workload === e.workload && t.isMeta === e.isMeta && t.shouldQuery === e.shouldQuery && j4f(e.origin, t.origin) && !!t.verifiedSlackHumanTurn === !!e.verifiedSlackHumanTurn && t.priority === e.priority && !Xfr(e.value) && !Xfr(t.value);
  }
  function shouldIgnoreStaleEndSession(e, t) {
    return parseInt(t ?? "1", 10) > 1 && e === "archived";
  }
  function isRestartedWorkerEpoch(e) {
    return (e ?? 1) > 1;
  }
  function restoreDeclaredDialogKinds(e) {
    let t = e?.internal?.declared_dialog_kinds;
    if (!Array.isArray(t) || getSdkSupportedDialogKinds() !== undefined) {
      return;
    }
    let n = TCe(t);
    setSdkSupportedDialogKinds(n, "restored");
    logEvent("tengu_supported_dialog_kinds_restored", {
      n_kinds: String(n.length)
    });
    logForDebugging(`[print.ts] restored ${n.length} declared dialog kind(s) from prior worker epoch`);
  }
  function restoreMemoryToggledOff(e) {
    if (e?.internal?.memory_toggled_off !== true) {
      return;
    }
    setMemoryToggledOff(true);
    logEvent("tengu_memory_toggle_restored", {});
    logForDebugging("[print.ts] restored /pause-memory toggle from prior worker epoch");
  }
  function j4f(e, t) {
    if (e === t) {
      return true;
    }
    if (!e || !t) {
      return false;
    }
    if (e.kind !== t.kind) {
      return false;
    }
    if (e.kind === "peer" && t.kind === "peer") {
      return e.from === t.from && e.inbound_origin === t.inbound_origin;
    }
    if (e.kind === "channel" && t.kind === "channel") {
      return e.server === t.server;
    }
    return true;
  }
  function createKeepAlivePulse(e, t) {
    let r = Date.now();
    return () => {
      if (!t) {
        return;
      }
      let o = Date.now();
      if (o - r >= 30000) {
        e.enqueue({
          type: "keep_alive"
        });
        r = o;
      }
    };
  }
  async function runHeadless(e, t, n, r, o, s, i, a, l) {
    if (surfaceManagedSettingsErrorsHeadless(), gLe()) {
      vGc();
    }
    if (hsn()) {
      QGc();
    }
    function c(ee) {
      if (i6n(ee, n), lc()) {
        n(ae => {
          let de = oWr(ae.settings);
          return ae.fastMode === de ? ae : {
            ...ae,
            fastMode: de
          };
        });
      }
      let re = t().advisorModel;
      n(ae => {
        let de = Jmo(ae.settings);
        return ae.advisorModel === de ? ae : {
          ...ae,
          advisorModel: de
        };
      });
      let se = t().advisorModel;
      if (re !== se) {
        logEvent("tengu_advisor_settings_sync", {
          applied: se !== undefined
        });
      }
    }
    let u = t().advisorModel;
    if (u) {
      setFlagSettingsInline({
        ...(getFlagSettingsInline() ?? {}),
        advisorModel: u
      });
      fM.notifyChange("flagSettings");
    }
    if (fM.subscribe(c), a6n(() => c("policySettings")), setInterval(Bun.gc, 1000).unref(), Gmo(), vx("runHeadless_entry"), logEvent("tengu_timer", {
      event: "startup",
      durationMs: Math.round(process.uptime() * 1000),
      mcpNonBlocking: getMcpConnectNonBlocking(),
      mcpClientCount: l.configuredMcpServerCount,
      resumed: !!(l.resume || l.continue)
    }), await Cgt()) {
      await z8a();
    }
    if (vx("after_grove_check"), initializeGrowthBook().catch(ee => Oe(sr(ee))), l.resumeSessionAt && !l.resume) {
      process.stderr.write(`Error: --resume-session-at requires --resume
`);
      gracefulShutdownSync(1);
      return;
    }
    if (l.rewindFiles && !l.resume) {
      process.stderr.write(`Error: --rewind-files requires --resume
`);
      gracefulShutdownSync(1);
      return;
    }
    if (l.rewindFiles && e) {
      process.stderr.write(`Error: --rewind-files is a standalone operation and cannot be used with a prompt
`);
      gracefulShutdownSync(1);
      return;
    }
    setHasStreamingInput(typeof e !== "string");
    let p = Date.now();
    let m;
    let f = Boolean(l.sdkUrl) && process.env.CLAUDE_CODE_ENVIRONMENT_KIND !== "bridge";
    function h(ee, re) {
      if (!f) {
        return;
      }
      m = ee;
      process.stderr.write(`SDKStartup: phase=${ee} t=${Math.round((Date.now() - p) / 100) / 10}s${re ? ` ${re}` : ""}
`);
    }
    h("connecting_transport");
    let g = K4f(e, l);
    if (l.sdkUrl || l.outputFormat === "stream-json") {
      iDo(g);
    }
    if (l.sdkUrl && Me.CLAUDE_CODE_REMOTE_SESSION_ID && Me.CLAUDE_CODE_ENVIRONMENT_KIND === undefined && !Me.CLAUDE_CODE_DISABLE_WORKING_SYNC) {
      Promise.resolve().then(() => (ikt(), skt)).then(ee => ee.startSyncedFileSyncer(ee.SYNCED_FILE_ROOT)).catch(() => wn("warn", "working_sync_import_failed", {}));
    }
    if (st(process.env.CLAUDE_CODE_SDK_HAS_OAUTH_REFRESH) && SDK_OAUTH_REFRESH_ENTRYPOINTS.vZc(process.env.CLAUDE_CODE_ENTRYPOINT ?? "")) {
      setSdkOAuthTokenRefreshCallback(() => g.requestOAuthTokenRefresh());
    }
    if (st(process.env.CLAUDE_CODE_SDK_HAS_HOST_AUTH_REFRESH) && L6()) {
      let ee = Number(process.env.CLAUDE_CODE_HOST_AUTH_REFRESH_TIMEOUT_MS) || undefined;
      setHostAuthTokenRefreshCallback(() => g.requestHostAuthTokenRefresh(ee));
    }
    if (l.outputFormat === "stream-json") {
      L5c();
    }
    let y = {
      current: []
    };
    let _ = {
      current: s
    };
    let b = SandboxManager.getSandboxUnavailableReason();
    if (b) {
      if (SandboxManager.isSandboxRequired()) {
        if (l.outputFormat === "stream-json") {
          reportTurnFailed(g.sessionState, `Sandbox required but unavailable: ${b}`);
          await g.write({
            type: "result",
            subtype: "error_during_execution",
            duration_ms: 0,
            duration_api_ms: 0,
            is_error: true,
            num_turns: 0,
            stop_reason: null,
            session_id: getSessionId(),
            total_cost_usd: 0,
            usage: Hb,
            modelUsage: {},
            permission_denials: [],
            uuid: Kx.randomUUID(),
            errors: [`Sandbox required but unavailable: ${b}. Set sandbox.failIfUnavailable=false to allow unsandboxed execution.`]
          });
          await Promise.race([g.flushSessionState(), sleep(5000, undefined, {
            unref: true
          })]);
        }
        process.stderr.write(`
Error: sandbox required but unavailable: ${b}
` + `  sandbox.failIfUnavailable is set \u2014 refusing to start without a working sandbox.

`);
        gracefulShutdownSync(1);
        return;
      }
      process.stderr.write(`
\u26A0 Sandbox disabled: ${b}
  Commands will run WITHOUT sandboxing. Network and filesystem restrictions will NOT be enforced.

`);
    } else if (SandboxManager.isSandboxingEnabled()) {
      profileCheckpoint("before_sandbox_init");
      try {
        await SandboxManager.initialize(X5c(g.createSandboxAskCallback(ee => n(re => ({
          ...re,
          toolPermissionContext: ee(re.toolPermissionContext)
        }))), () => t().toolPermissionContext, () => y.current, () => _.current));
      } catch (ee) {
        process.stderr.write(`
\u274C Sandbox Error: ${he(ee)}
`);
        gracefulShutdownSync(1, "other");
        return;
      }
      profileCheckpoint("after_sandbox_init");
    }
    if (l.setupTrigger) {
      await uRe({
        kind: "setup",
        trigger: l.setupTrigger
      });
    }
    vx("before_loadInitialMessages");
    profileCheckpoint("before_loadInitialMessages", {
      once: true
    });
    let S = t();
    let {
      messages: E,
      turnInterruptionState: C,
      supersededToolUseIds: x,
      deferredToolUse: A,
      agentSetting: k
    } = await loadInitialMessages(n, {
      continue: l.continue,
      teleport: l.teleport,
      resume: l.resume,
      resumeSessionAt: l.resumeSessionAt,
      forkSession: l.forkSession,
      outputFormat: l.outputFormat,
      sessionStartHooksPromise: l.sessionStartHooksPromise,
      restoredWorkerState: g.restoredWorkerState,
      hydratePrefetch: g.hydratePrefetch,
      sdkUrl: l.sdkUrl
    });
    y.current = E;
    let I = iya();
    if (I) {
      g.prependUserMessage(I);
    }
    if (!l.agent && !getMainThreadAgentType() && k) {
      let {
        agentDefinition: ee
      } = ZCe(k, undefined, {
        activeAgents: a,
        allAgents: a
      });
      if (ee) {
        if (n(re => ({
          ...re,
          agent: ee.agentType
        })), !l.systemPrompt && !isBuiltInAgent(ee)) {
          let re = ee.getSystemPrompt();
          if (re) {
            l.systemPrompt = re;
          }
        }
        saveAgentSetting(ee.agentType);
      }
    }
    if (l.forkSession) {
      uon(E);
    }
    let O = bXe(E, S.mainLoopModel, ee => E.push(wc(ee, "warning")));
    let M = O ? SXe(E, O, Boolean(l.forkSession)) : undefined;
    if (M) {
      n(ee => ee.mainLoopModel === M ? ee : {
        ...ee,
        mainLoopModel: M
      });
    }
    if (E.length === 0 && process.exitCode !== undefined) {
      return;
    }
    let L;
    if (l.restrictedStartupModel && shouldWarnRestrictedStartupModel(l.userSpecifiedModel, l.restrictedStartupModel)) {
      let ee = wse(l.restrictedStartupModel, getMainLoopModel());
      if (!E.some(se => se.type === "system" && se.subtype === "informational" && se.content.includes(ee))) {
        E.push(wc(ee, "warning"));
      }
      L = wc(ee, "warning");
    }
    if (l.rewindFiles) {
      let ee = E.find(ae => ae.uuid === l.rewindFiles);
      if (!ee || ee.type !== "user") {
        process.stderr.write(`Error: --rewind-files requires a user message UUID, but ${l.rewindFiles} is not a user message in this session
`);
        gracefulShutdownSync(1);
        return;
      }
      let re = t();
      let se = await h8c(l.rewindFiles, re, false);
      if (!se.canRewind) {
        process.stderr.write(`Error: ${se.error || "Unexpected error"}
`);
        gracefulShutdownSync(1);
        return;
      }
      process.stdout.write(`Files rewound to state at message ${l.rewindFiles}
`);
      gracefulShutdownSync(0);
      return;
    }
    let P = typeof l.resume === "string" && l.resume.trim().length > 0;
    let F = Boolean(l.sdkUrl);
    if (!e && !F && !A && !I) {
      process.stderr.write(P || l.continue ? `Error: No deferred tool marker found in the resumed session. Either the session was not deferred, the marker is stale (tool already ran), or it exceeds the tail-scan window. Provide a prompt to continue the conversation.
` : `Error: Input must be provided either through stdin or as a prompt argument when using --print
`);
      gracefulShutdownSync(1);
      return;
    }
    if (l.outputFormat === "stream-json" && !l.verbose) {
      process.stderr.write(`Error: When using --print, --output-format=stream-json requires --verbose
`);
      gracefulShutdownSync(1);
      return;
    }
    let H = jse(S.mcp.tools, S.toolPermissionContext);
    let U = [...s, ...H];
    _.current = U;
    let N = l.sdkUrl ? "stdio" : l.permissionPromptToolName;
    let W = ee => {
      g.sessionState.notifyStateChanged("requires_action", ee);
      q6c?.runClassifierSummaryForBlocked(ee, g.sessionState);
    };
    g.onUserDialogParked = ee => {
      q6c?.runClassifierSummaryForBlocked(ee, g.sessionState);
    };
    let j = getCanUseToolFn(N, g, () => t().mcp.tools, W);
    if (l.permissionPromptToolName) {
      U = U.filter(ee => !bl(ee, l.permissionPromptToolName));
    }
    if (st(process.env.CLAUDE_CODE_RESUME_INTERRUPTED_TURN)) {
      let ee = await g.restoredWorkerState;
      let re = ee?.internal?.running_background_tasks;
      let se = ee?.internal?.orphaned_background_tasks_pending_notification;
      let ae = Array.isArray(re) ? re : [];
      let de = Array.isArray(se) ? se : [];
      let be = new Map();
      for (let me of [...de, ...ae]) {
        if (typeof me?.task_id !== "string" || !me.task_id) {
          continue;
        }
        let Te = be.get(me.task_id);
        if (!Te || !Te.description && me.description) {
          be.set(me.task_id, me);
        }
      }
      let fe = Array.from(be.values());
      if (fe.length > 0) {
        logForDebugging(`[print.ts] ${fe.length} orphaned background task(s) after restart`);
        E.push(In({
          content: DWc(fe),
          isMeta: true
        }));
        for (let Te of fe) {
          zu(Te.task_id, "stopped", {
            summary: `Stopped by a worker restart: ${Te.description || Te.task_id}`
          });
        }
        let me = false;
        try {
          for (let Te of VX()) {
            await g.write(Te);
          }
          me = await Promise.race([g.flushClientEvents(), sleep(20000, undefined, {
            unref: true
          }).then(() => false)]);
        } catch (Te) {
          logForDebugging(`[print.ts] orphaned-task notification flush failed; keeping orphans pending for re-emit: ${sr(Te).message}`);
        }
        if (!me) {
          logForDebugging("[print.ts] orphaned-task notification delivery unconfirmed; keeping orphans pending for re-emit");
        }
        g.sessionState.notifyInternalMetadataChanged({
          running_background_tasks: [],
          orphaned_background_tasks_pending_notification: me ? null : fe
        });
      }
    } else if (E.length > 0) {
      let ee = DO(t, n);
      await kxt(E, ee);
      OKt({
        abortController: new AbortController(),
        taskRegistry: ee
      });
      Fon({
        taskRegistry: ee,
        getMcpClients: () => t().mcp.clients
      });
    }
    let z = await g.restoredWorkerState;
    restoreDeclaredDialogKinds(z);
    restoreMemoryToggledOff(z);
    let V = deriveParkedPermission(z, C, x);
    if (V) {
      logForDebugging(`[print.ts] deferring stale parked prompt cancel for ${V.request_id} \u2014 a persisted control_response may arrive via SSE catch-up`);
    } else {
      try {
        U5c(g, z);
      } catch (ee) {
        logForDebugging(`[print.ts] stale parked prompt cancel failed: ${ee}`, {
          level: "error"
        });
      }
    }
    vx("after_loadInitialMessages");
    profileCheckpoint("after_loadInitialMessages", {
      once: true
    });
    h("transcript_hydrated", `messages=${E.length}`);
    await iwn();
    vx("after_modelStrings");
    let K = l.outputFormat === "json" && l.verbose;
    let J = [];
    let Q;
    let Z = 0;
    let ne = false;
    vx("before_runHeadlessStreaming");
    h("starting_query_loop");
    for await (let ee of _runHeadlessStreamingForTesting(g, S.mcp.clients, o, U, E, j, i, t, n, r, a, l, C, x, A, V)) {
      if (Z++, Z === 1) {
        h("first_message_drained", `type=${ee.type}`);
      }
      if (!ne && ee.type === "system" && ee.subtype === "init") {
        ne = true;
        h("system_init_emitted");
      }
      if (l.outputFormat === "stream-json" && l.verbose) {
        if (await g.write(ee), ne && L) {
          let re = L;
          L = undefined;
          await g.write({
            ...re,
            session_id: getSessionId()
          });
        }
      }
      if (ee.type !== "control_response" && ee.type !== "control_request" && ee.type !== "control_cancel_request" && !(ee.type === "system" && (ee.subtype === "session_state_changed" || ee.subtype === "task_notification" || ee.subtype === "task_started" || ee.subtype === "task_updated" || ee.subtype === "task_progress" || ee.subtype === "control_request_progress" || ee.subtype === "notification" || ee.subtype === "post_turn_summary" || ee.subtype === "task_summary" || ee.subtype === "hook_started" || ee.subtype === "hook_progress" || ee.subtype === "hook_response" || ee.subtype === "commands_changed" || ee.subtype === "elicitation_complete" || ee.subtype === "files_persisted" || ee.subtype === "mirror_error")) && ee.type !== "stream_event" && ee.type !== "keep_alive" && ee.type !== "prompt_suggestion" && ee.type !== "conversation_reset" && ee.type !== "transcript_mirror" && ee.type !== "active_goal") {
        if (K) {
          J.push(ee);
        }
        Q = ee;
      }
    }
    switch (l.outputFormat) {
      case "json":
        if (!Q || Q.type !== "result") {
          process.stderr.write(`Error: No messages returned from query
`);
          logForDebugging("runHeadless: no result message returned from query", {
            level: "error"
          });
          gracefulShutdownSync(1);
          return;
        }
        if (l.verbose) {
          writeToStdout(De(J) + `
`);
          break;
        }
        writeToStdout(De(Q) + `
`);
        break;
      case "stream-json":
        break;
      default:
        if (!Q || Q.type !== "result") {
          process.stderr.write(`Error: No messages returned from query
`);
          logForDebugging("runHeadless: no result message returned from query", {
            level: "error"
          });
          gracefulShutdownSync(1);
          return;
        }
        switch (Q.subtype) {
          case "success":
            writeToStdout(Q.result.endsWith(`
`) ? Q.result : Q.result + `
`);
            break;
          case "error_during_execution":
            writeToStdout("Execution error");
            break;
          case "error_max_turns":
            writeToStdout(`Error: Reached max turns (${l.maxTurns})`);
            break;
          case "error_max_budget_usd":
            writeToStdout(`Error: Exceeded USD budget (${l.maxBudgetUsd})`);
            break;
          case "error_max_structured_output_retries":
            writeToStdout("Error: Failed to provide valid structured output after maximum retries");
        }
    }
    if (Vmo(), dDn()) {
      await B4f.drainPendingExtraction();
    }
    await flushPendingAsyncRewakeHooks();
    await Promise.race([Promise.resolve().then(() => (ikt(), skt)).then(ee => ee.drainSyncedFiles()).catch(() => {}), sleep(5000, undefined, {
      unref: true
    })]);
    let oe = g instanceof tkt && g.permanentCloseCode !== undefined;
    if (f && Q?.type !== "result") {
      let ee;
      if (oe) {
        ee = "transport closed permanently";
      } else if (Z === 0) {
        ee = "zero messages drained \u2014 input stream ended before any output";
      } else if (!ne) {
        ee = "input stream ended before system/init was emitted";
      } else {
        ee = "input stream ended without a result message";
      }
      process.stderr.write(`SDKStartup: exiting without result: ${ee} (last_phase=${m}, drained=${Z}, exit=${oe ? 1 : 0})
`);
    }
    iDo(undefined);
    gracefulShutdownSync(Q?.type === "result" && Q?.is_error || oe ? 1 : 0);
  }
  function deriveParkedPermission(e, t, n) {
    if (!Me.CLAUDE_CODE_RESUME_INTERRUPTED_TURN) {
      return;
    }
    if (!t || t.kind === "none") {
      return;
    }
    let r = e?.external?.pending_action;
    if (!r?.request_id || !r.tool_use_id) {
      return;
    }
    if (r.tool_name?.startsWith("dialog:")) {
      return;
    }
    if (!n?.vZc(r.tool_use_id)) {
      return;
    }
    return {
      request_id: r.request_id,
      tool_use_id: r.tool_use_id
    };
  }
  function shouldWarnRestrictedStartupModel(e, t) {
    return e === undefined || parseUserSpecifiedModel(e) !== parseUserSpecifiedModel(t);
  }
  function resolveDefaultPickRepoint(e, t, n) {
    if ("model" in e && (e.model == null || String(e.model).trim().toLowerCase() === "default") && t !== undefined && t !== n) {
      return n;
    }
    return;
  }
  function modelOverrideToAdoptAfterTurn({
    activeUserSpecifiedModel: e,
    overrideAtTurnStart: t,
    overrideAtTurnEnd: n
  }) {
    if (e === undefined) {
      if (n !== t) {
        if (typeof n === "string") {
          let o = n.trim().toLowerCase() === "default" ? getDefaultMainLoopModel() : n;
          if (!isModelAllowed(o) && !isExemptDefaultResolvingPick(o)) {
            return {
              kind: "keep",
              blockedByAllowlist: n
            };
          }
        }
        return {
          kind: "keep",
          allowedOverrideApplied: true
        };
      }
      return {
        kind: "keep"
      };
    }
    if (n === t) {
      return {
        kind: "keep"
      };
    }
    if (n === null) {
      return {
        kind: "clearToSessionDefault"
      };
    }
    if (typeof n !== "string") {
      return {
        kind: "keep"
      };
    }
    let r = n.trim().toLowerCase() === "default" ? getDefaultMainLoopModel() : n;
    if (parseUserSpecifiedModel(r) === parseUserSpecifiedModel(e)) {
      return {
        kind: "keep"
      };
    }
    if (!isExemptDefaultResolvingPick(r) && !isModelAllowed(r)) {
      return {
        kind: "keep",
        blockedByAllowlist: n
      };
    }
    return {
      kind: "adopt",
      model: r
    };
  }
  function findRewindAnchors(e, t) {
    let n = null;
    let r = null;
    for (let o = t - 1; o >= 0; o--) {
      let s = e[o];
      if (!s) {
        continue;
      }
      if (s.type === "assistant") {
        r = s.uuid;
        n ??= s.uuid;
        break;
      }
      if (s.type === "user" && n === null) {
        n = s.uuid;
      }
    }
    return {
      persistAnchor: n,
      precedingAssistantUuid: r
    };
  }
  function _runHeadlessStreamingForTesting(e, t, n, r, o, s, i, a, l, c, u, d, p, m, f, h) {
    let g = false;
    let y;
    let _;
    let b = Date.now();
    let S;
    let E = false;
    let C;
    let x = f;
    let A;
    let k = false;
    let I = false;
    let O = [];
    let M = new Map();
    let L;
    let P = 0;
    let F = createAbortController(500);
    let H = e.outbound;
    if (b5e(() => {
      for (let sn of VX()) {
        H.enqueue(sn);
      }
    }), d.outputFormat === "stream-json" && d.sessionMirror) {
      addSessionMirror((sn, Ln) => {
        e.write({
          type: "transcript_mirror",
          filePath: sn,
          entries: Ln
        });
      });
    }
    let U = () => {
      if (wn("info", "shutdown_signal", {
        signal: "SIGINT"
      }), L && !L.signal.aborted) {
        L.abort(userAbortReason("user-cancel"));
      }
      F.abort();
      gracefulShutdown(0);
    };
    if (process.on("SIGINT", U), Ti(async () => {
      if (_) {
        clearTimeout(_);
        _ = undefined;
      }
      if (h && y) {
        e.write({
          type: "control_cancel_request",
          request_id: h.request_id
        }).catch(() => {});
      }
      if (y = undefined, S && !L?.signal.aborted && !E) {
        logEvent("tengu_sdk_result", {
          subtype: "terminated",
          is_error: true,
          duration_ms: Date.now() - S,
          run_phase: A ?? "init",
          exit_code: typeof process.exitCode === "number" ? process.exitCode : undefined
        });
        E = true;
        S = undefined;
      }
      let sn = {};
      for (let Ln of Uht(a())) {
        if (kv(Ln)) {
          sn[Ln.type] = (sn[Ln.type] ?? 0) + 1;
        }
      }
      wn("info", "run_state_at_shutdown", {
        run_active: g,
        run_phase: A,
        worker_status: e.sessionState.getState(),
        internal_events_pending: e.internalEventsPending,
        bg_tasks: sn
      });
    }), e.sessionState.onPermissionModeChanged = sn => {
      if (sn === "default" || sn === "acceptEdits" || sn === "bypassPermissions" || sn === "plan" || sn === "auto" || sn === "dontAsk") {
        H.enqueue({
          type: "system",
          subtype: "status",
          status: null,
          permissionMode: sn,
          uuid: Kx.randomUUID(),
          session_id: getSessionId()
        });
      }
    }, Me.CLAUDE_CODE_REMOTE) {
      let sn = Ln => {
        H.enqueue({
          type: "active_goal",
          value: Ln ? {
            condition: Ln.condition,
            iterations: Ln.iterations,
            set_at: Ln.setAt,
            tokens_at_start: Ln.tokensAtStart,
            ...(Ln.lastReason !== undefined && {
              last_reason: Ln.lastReason
            })
          } : null,
          uuid: Kx.randomUUID(),
          session_id: getSessionId()
        });
      };
      e.sessionState.onActiveGoalChanged = sn;
      sn(a().activeGoal);
    }
    let N = new Set();
    let W = {
      abortController: null,
      inflightPromise: null,
      lastEmitted: null,
      pendingSuggestion: null,
      pendingLastEmittedEntry: null
    };
    let j;
    if (d.enableAuthStatus) {
      j = KD.getInstance().subscribe(Ln => {
        H.enqueue({
          type: "auth_status",
          isAuthenticating: Ln.isAuthenticating,
          output: Ln.output,
          error: Ln.error,
          uuid: Kx.randomUUID(),
          session_id: getSessionId()
        });
      });
    }
    let z = sn => {
      let Ln = YZl(sn, {
        includeOverageInUse: !i2()
      });
      if (Ln) {
        H.enqueue({
          type: "rate_limit_event",
          rate_limit_info: Ln,
          uuid: Kx.randomUUID(),
          session_id: getSessionId()
        });
      }
    };
    wDe.add(z);
    let V = o;
    function K(sn, Ln) {
      let ct = 0;
      let Br = 0;
      let Pr = 0;
      let Vr = new Set(Ln.filter(Xo => Xo.mcpInfo && !Xo.name.startsWith("mcp__")).map(Xo => Xo.name));
      for (let Xo = sn; Xo < V.length; Xo++) {
        let qo = V[Xo];
        if (qo?.type !== "assistant") {
          continue;
        }
        for (let ss of qo.message.content) {
          if (ss.type !== "tool_use") {
            continue;
          }
          if (ct++, ss.name.startsWith("mcp__") || Vr.vZc(ss.name)) {
            Br++;
          } else if (ss.name === "ToolSearch") {
            Pr++;
          }
        }
      }
      return {
        tool_use_count: ct,
        mcp_tool_calls: Br,
        toolsearch_calls: Pr,
        builtin_tool_calls: ct - Br - Pr
      };
    }
    let J = zXn(o, jhe.cwd(), 5000);
    if (isPublishToolEnabled()) {
      let {
        frameUrls: sn,
        artifactReadVersions: Ln
      } = C_r(o);
      l(ct => ({
        ...ct,
        frameUrls: sn,
        artifactReadVersions: Ln
      }));
    }
    oXr("messages", () => ({
      entries: V.length
    }));
    oXr("file_state_cache", () => ({
      entries: J.size,
      bytes: J.calculatedSize
    }));
    let Q = new Map();
    let Z = aFe(getCurrentSessionIsolationLatch() ?? TJt(o, r), saveIsolationLatch);
    let ne = u$(5000);
    let oe = [];
    let ee = process.env.CLAUDE_CODE_RESUME_INTERRUPTED_TURN;
    if (p && p.kind !== "none" && ee) {
      let sn = {
        mode: "prompt",
        agentId: mainAgentId(),
        value: p.message.message.content,
        uuid: p.message.isMeta ? Kx.randomUUID() : p.message.uuid ?? Kx.randomUUID(),
        isMeta: p.message.isMeta,
        origin: p.message.origin
      };
      if (h) {
        logForDebugging(`[print.ts] Deferring interrupted-turn rescue for parked permission toolUseID=${h.tool_use_id}`);
        y = sn;
      } else {
        logForDebugging(`[print.ts] Auto-resuming interrupted turn (kind: ${p.kind})`);
        removeInterruptedMessage(V, p.message);
        __(sn);
      }
    }
    let re = F9e();
    let se = re.filter(sn => !sn.disabled);
    let ae = bTe(Ddo(re));
    let de = se.map(sn => {
      let Ln = sn.value === null ? "default" : sn.value;
      let ct = Ln === "default" ? getDefaultMainLoopModel() : parseUserSpecifiedModel(Ln);
      let Br = sx(ct);
      let Pr = Kit(ct);
      let Vr = yh(sn.value);
      let Xo = dbe(ct);
      return {
        value: Ln,
        resolvedModel: ct,
        displayName: sn.label,
        description: sn.description,
        ...(sn.promoListPrice !== undefined && {
          promoListPrice: sn.promoListPrice
        }),
        ...(Br && {
          supportsEffort: true,
          supportedEffortLevels: UC.filter(qo => {
            if (qo === "max" && !BIe(ct)) {
              return false;
            }
            if (qo === "xhigh" && !Yne(ct)) {
              return false;
            }
            return true;
          })
        }),
        ...(Pr && {
          supportsAdaptiveThinking: true
        }),
        ...(Vr && {
          supportsFastMode: true
        }),
        ...(Xo && {
          supportsAutoMode: true
        })
      };
    });
    let be = d.userSpecifiedModel;
    KVa(() => {
      be = undefined;
    });
    let fe = d.thinkingConfig && d.thinkingConfig.type !== "disabled" ? d.thinkingConfig.display : undefined;
    let me = d.thinkingConfig;
    function Te(sn, Ln) {
      let ct = cyc(sn, modelDisplayString(Ln));
      if (V.push(...ct), Me.CLAUDE_CODE_REMOTE) {
        let Br = modelDisplayString(Ln);
        V.push(In({
          content: `<system-reminder>The model for this session has been changed to ${Br}. You are now running as ${Br}.</system-reminder>`,
          isMeta: true
        }));
      }
      for (let Br of ct) {
        if (typeof Br.message.content === "string" && Br.message.content.includes(`<${"local-command-stdout"}>`)) {
          H.enqueue({
            type: "user",
            message: Br.message,
            session_id: getSessionId(),
            parent_tool_use_id: null,
            uuid: Br.uuid,
            timestamp: Br.timestamp,
            isReplay: true
          });
        }
      }
    }
    let ue;
    function ce(sn, Ln) {
      if (sn === ue) {
        return;
      }
      ue = sn;
      let ct = wc(wse(sn, Ln ?? getMainLoopModel()), "warning");
      V.push(ct);
      H.enqueue({
        ...ct,
        session_id: getSessionId()
      });
    }
    function le() {
      ue = undefined;
    }
    let pe = [];
    let ve = [];
    let _e = [];
    let xe = new WeakSet();
    function ke(sn) {
      for (let Ln of sn) {
        if (Ln.type !== "connected" || xe.vZc(Ln.client)) {
          continue;
        }
        if (Ln.config.type === "sdk") {
          continue;
        }
        let ct = Ln.name;
        try {
          Ln.client.setRequestHandler(lye, async (Br, Pr) => {
            if (Ln.transportErrorState) {
              Ln.transportErrorState.pendingElicitations++;
            }
            try {
              dn(ct, `Elicitation request received in print mode: ${De(Br)}`);
              let Vr = Br.params.mode === "url" ? "url" : "form";
              logEvent("tengu_mcp_elicitation_shown", {
                mode: Vr
              });
              let Xo = await T5t(ct, Br.params, Pr.signal);
              if (Xo) {
                dn(ct, `Elicitation resolved by hook: ${De(Xo)}`);
                logEvent("tengu_mcp_elicitation_response", {
                  mode: Vr,
                  action: Xo.action
                });
                return Xo;
              }
              let qo = "url" in Br.params ? Br.params.url : undefined;
              let ss = "requestedSchema" in Br.params ? Br.params.requestedSchema : undefined;
              let Ri = "elicitationId" in Br.params ? Br.params.elicitationId : undefined;
              let ya = X6c(Br.params._meta);
              let fs = await e.handleElicitation(ct, Br.params.message, ss, Pr.signal, Vr, qo, Ri, ya);
              let tc = await E5t(ct, fs, Pr.signal, Vr, Ri);
              logEvent("tengu_mcp_elicitation_response", {
                mode: Vr,
                action: tc.action
              });
              return tc;
            } finally {
              if (Ln.transportErrorState) {
                Ln.transportErrorState.pendingElicitations--;
                Ln.transportErrorState.lastElicitationClosedAt = Date.now();
              }
            }
          });
          Ln.client.setNotificationHandler(uOt, Br => {
            let {
              elicitationId: Pr
            } = Br.params;
            dn(ct, `Elicitation completion notification: ${Pr}`);
            executeNotificationHooks({
              message: `MCP server "${ct}" confirmed elicitation ${Pr} complete`,
              notificationType: "elicitation_complete"
            });
            vw({
              type: "system",
              subtype: "elicitation_complete",
              mcp_server_name: ct,
              elicitation_id: Pr
            });
          });
          xe.add(Ln.client);
        } catch {}
      }
    }
    let Ie = new WeakSet();
    function Ue(sn) {
      for (let Ln of sn) {
        if (Ln.type !== "connected" || Ie.vZc(Ln.client)) {
          continue;
        }
        if (Ie.add(Ln.client), !Ln.capabilities?.tools?.listChanged) {
          continue;
        }
        let ct = Ln.name;
        Ln.client.setNotificationHandler(uHe, async () => {
          dn(ct, "Received tools/list_changed notification, refreshing tools");
          let Br = AM.cache.get(ct);
          AM.cache.delete(ct);
          let Pr = await AM(Ln);
          if (Ln.toolsListError) {
            dn(ct, "tools/list failed after list_changed \u2014 keeping previous tool set");
            return;
          }
          let Vr = Pr.length;
          let Xo = ss => logEvent("tengu_mcp_list_changed", {
            type: "tools",
            previousCount: ss,
            newCount: Vr
          });
          if (Br) {
            Br.then(ss => Xo(ss.length), () => Xo());
          } else {
            Xo();
          }
          let qo = uW(ct);
          l(ss => ({
            ...ss,
            mcp: {
              ...ss.mcp,
              tools: [...Y1p(ss.mcp.tools, Ri => Ri.name?.startsWith(qo)), ...Pr]
            }
          }));
        });
      }
    }
    let Ge = a().mcp.clients;
    ke(Ge);
    Ue(Ge);
    c(() => {
      let sn = a().mcp.clients;
      if (sn === Ge) {
        return;
      }
      Ge = sn;
      ke(sn);
      Ue(sn);
    });
    async function Be() {
      let sn = new Set(Object.keys(i));
      let Ln = new Set(pe.map(qo => qo.name));
      let ct = Array.from(sn).some(qo => !Ln.vZc(qo));
      let Br = Array.from(Ln).some(qo => !sn.vZc(qo));
      let Pr = pe.some(qo => qo.type === "pending");
      let Vr = pe.some(qo => qo.type === "failed");
      if (ct || Br || Pr || Vr) {
        for (let Ri of pe) {
          if (!sn.vZc(Ri.name)) {
            if (Ri.type === "connected") {
              await Ri.cleanup();
            }
          }
        }
        let qo = await q3a(i, (Ri, ya) => e.sendMcpMessage(Ri, ya));
        pe = qo.clients;
        ve = qo.tools;
        _e = qo.commands;
        let ss = Ro([...Ln, ...sn]);
        l(Ri => ({
          ...Ri,
          mcp: {
            ...Ri.mcp,
            tools: [...Ri.mcp.tools.filter(ya => !ss.some(fs => ya.name.startsWith(uW(fs)))), ...ve],
            commands: [...Ri.mcp.commands.filter(ya => !ss.some(fs => u3(ya, fs))), ...qo.commands]
          }
        }));
        Lka(pe, {
          onFeedbackSurveyEvent: e6c,
          refusalFallbackSettingToggleVisible: T$n() ? true : false,
          refusalFallbackLaneEnabled: NX(),
          fable5LaunchShow: false,
          startupAnnouncement: jJl()
        });
        t6c(pe);
      }
    }
    Be();
    let We = {
      clients: [],
      tools: [],
      configs: {}
    };
    let Ze = st(process.env.CLAUDE_CODE_REMOTE) ? Object.fromEntries(a().mcp.clients.filter(sn => sn.config.scope === "dynamic" && !("pluginSource" in sn.config) && PSo(sn.config) && !isBuiltinInProcessMcpServer(sn.name)).map(sn => [sn.name, sn.config])) : {};
    setMcpClientsAccessor(() => [...a().mcp.clients, ...pe, ...We.clients]);
    let Tt = Array.isArray(n) ? n : [];
    let kt = false;
    let Ye = Array.isArray(n) ? null : (async () => {
      let sn = performance.now();
      let Ln = await n.catch(ct => (Oe(ct), []));
      if (!kt) {
        Tt = Ln;
      }
      au("commands_deferred_join_ms", performance.now() - sn, sn);
    })();
    let ht = u;
    let It;
    let Rt;
    let wt = sn => {
      let Ln = EZ(sn.toolPermissionContext, sn.mcp.tools, {
        skillTools: sn.skillTools
      });
      let ct = jse(We.tools, sn.toolPermissionContext);
      let Br = gyp(mergeAndFilterTools([...r, ...ve, ...ct], Ln, sn.toolPermissionContext.mode), "name");
      let Pr = getMainThreadAgentType();
      if (Rt = undefined, Pr) {
        let Xo = ht.find(qo => qo.agentType === Pr);
        if (Xo) {
          let qo = uKe(Xo, Br, false, true);
          Br = qo.resolvedTools;
          Rt = qo.allowedAgentTypes;
        }
      }
      if (d.permissionPromptToolName) {
        Br = Br.filter(Xo => !bl(Xo, d.permissionPromptToolName));
      }
      let Vr = getInitJsonSchema();
      if (Vr && !d.jsonSchema) {
        let Xo = jdt(Vr);
        if ("tool" in Xo) {
          Br = [...Br, Xo.tool];
        }
      }
      return Br;
    };
    let vt = st(process.env.CLAUDE_CODE_REMOTE) ? process.env.CLAUDE_CODE_SYSTEM_PROMPT_GB_FEATURE : undefined;
    let yt = () => {
      if (!vt) {
        return d.systemPrompt;
      }
      let sn = getFeatureValue_CACHED_MAY_BE_STALE(vt, "");
      return typeof sn === "string" && sn.length > 0 ? sn : d.systemPrompt;
    };
    let gt = null;
    let Ft = false;
    let on = Promise.resolve();
    let rn = 0;
    function Sn() {
      if (!gt) {
        return;
      }
      let sn = Math.min(rn, V.length);
      let Ln = V.slice(sn).filter(ct => ct.type === "user" || ct.type === "assistant");
      if (rn = V.length, Ln.length > 0) {
        gt.writeMessages(Ln);
      }
    }
    let jn = Promise.resolve({
      response: {
        added: [],
        removed: [],
        errors: {}
      },
      sdkServersChanged: false
    });
    function Xr(sn, {
      authoritative: Ln,
      caller: ct,
      deferConnect: Br = false
    }) {
      let Pr = async () => {
        let Vr = new Set(pe.map(Ri => Ri.name));
        let Xo = {
          ...We,
          configs: {
            ...Ze,
            ...We.configs
          }
        };
        let qo = sn;
        if (!Ln && Object.keys(Ze).length > 0) {
          let Ri = {};
          for (let [ya, fs] of Object.entries(Ze)) {
            if (ya in sn) {
              continue;
            }
            let {
              scope: tc,
              ...On
            } = fs;
            if (PSo(On)) {
              Ri[ya] = On;
            }
          }
          qo = {
            ...Ri,
            ...sn
          };
        }
        let ss = await handleMcpSetServers(qo, {
          configs: i,
          clients: pe,
          tools: ve,
          commands: _e
        }, Xo, l, a, ct, Br, Ln);
        if (Ln) {
          let Ri = new Set(Object.keys(ss.newDynamicState.configs));
          Ze = Object.fromEntries(Object.entries(sn).filter(([ya]) => Ri.vZc(ya)).map(([ya, fs]) => [ya, {
            ...fs,
            scope: "dynamic"
          }]));
        }
        for (let Ri of Object.keys(i)) {
          delete i[Ri];
        }
        if (Object.assign(i, ss.newSdkState.configs), pe = ss.newSdkState.clients, ve = ss.newSdkState.tools, _e = ss.newSdkState.commands, We = ss.newDynamicState, ss.deferredSettle) {
          ss.deferredSettle.then(({
            clients: Ri,
            tools: ya
          }) => {
            let fs = new Map(Ri.map(On => [On.name, On]));
            let tc = On => {
              let lr = new Set();
              let Mn = We.clients.map(Un => {
                let Er = fs.get(Un.name);
                if (Er && Un.type === "pending" && V6e(Un.config, Er.config)) {
                  lr.add(Un.name);
                  return Er;
                }
                return Un;
              });
              We = {
                ...We,
                clients: Mn,
                tools: gyp([...We.tools, ...ya.filter(Un => [...lr].some(Er => Un.name.startsWith(`mcp__${Er}__`)))], "name")
              };
              return On;
            };
            jn = jn.then(tc, tc);
          });
        }
        if (ss.sdkServersChanged) {
          let Ri = new Set(pe.map(fs => fs.name));
          let ya = Ro([...Vr, ...Ri]);
          l(fs => ({
            ...fs,
            mcp: {
              ...fs.mcp,
              tools: [...fs.mcp.tools.filter(tc => !ya.some(On => tc.name.startsWith(uW(On)))), ...ve],
              commands: [...fs.mcp.commands.filter(tc => !ya.some(On => u3(tc, On))), ..._e]
            }
          }));
        }
        return {
          response: ss.response,
          sdkServersChanged: ss.sdkServersChanged
        };
      };
      jn = jn.then(Pr, Pr);
      return jn;
    }
    function co() {
      let sn = a();
      let Ln = sn.mcp.clients;
      let ct = gyp([...sn.mcp.tools, ...We.tools], "name");
      let Br = new Set([...Ln.map(Pr => Pr.name), ...pe.map(Pr => Pr.name)]);
      return [...Ln, ...pe, ...We.clients.filter(Pr => !Br.vZc(Pr.name))].map(Pr => {
        let Vr;
        if (Pr.config.type === "sse" || Pr.config.type === "http") {
          Vr = {
            type: Pr.config.type,
            url: Pr.config.url,
            headers: Pr.config.headers,
            oauth: Pr.config.oauth
          };
        } else if (Pr.config.type === "claudeai-proxy") {
          Vr = {
            type: "claudeai-proxy",
            url: Pr.config.url,
            id: Pr.config.id
          };
        } else if (Pr.config.type === "stdio" || Pr.config.type === undefined) {
          Vr = {
            type: "stdio",
            command: Pr.config.command,
            args: Pr.config.args
          };
        }
        let Xo = Pr.type === "connected" ? hpe(ct, Pr.name).map(ss => ({
          name: ss.mcpInfo?.toolName ?? ss.name,
          annotations: {
            readOnly: ss.isReadOnly({}) || undefined,
            destructive: ss.isDestructive?.({}) || undefined,
            openWorld: ss.isOpenWorld?.({}) || undefined
          }
        })) : undefined;
        let qo;
        if (Pr.type === "connected" && Pr.capabilities.experimental) {
          let ss = {
            ...Pr.capabilities.experimental
          };
          if (ss["claude/channel"] && (!isChannelsEnabled() || !isChannelAllowlisted(Pr.config.pluginSource))) {
            delete ss["claude/channel"];
          }
          if (Object.keys(ss).length > 0) {
            qo = {
              experimental: ss
            };
          }
        }
        return {
          name: Pr.name,
          status: Pr.type,
          serverInfo: Pr.type === "connected" ? Pr.serverInfo : undefined,
          error: Pr.type === "failed" ? Pr.error : undefined,
          config: Vr,
          scope: Pr.config.scope,
          tools: Xo,
          capabilities: qo
        };
      });
    }
    async function Yt(sn) {
      try {
        await Promise.all([Promise.resolve(), bnt("headless_managed_settings_wait", () => G8e())]);
      } catch (ct) {
        Oe(ct);
      }
      let Ln = false;
      try {
        let ct = new Set(Object.keys((await getAllMcpConfigs()).servers));
        if (Ln = await Pns(sn), Me.CLAUDE_CODE_SYNC_PLUGIN_INSTALL) {
          Xe = {
            start: performance.now()
          };
        }
        if (Ln) {
          await Lr(ct, "plugin_install_diff");
        }
      } catch (ct) {
        logForDebugging(`Headless plugin install / MCP reconcile failed: ${he(ct)}`, {
          level: "error"
        });
      }
      if (Xe) {
        Xe.end = performance.now();
        au("plugin_mcp_reconcile_ms", Xe.end - Xe.start, Xe.start);
      }
      return Ln;
    }
    let Ee = null;
    let Re = null;
    let Ce;
    let Fe = parseInt(process.env.CLAUDE_CODE_SYNC_PLUGIN_INSTALL_TIMEOUT_MS || "", 10);
    let Xe;
    let He = performance.now();
    let Gt = gLe() ? wGc() : null;
    let mt = performance.now();
    let Dt = hsn() ? ZGc() : null;
    let jt = null;
    let bn = false;
    let Ct;
    if (!kd()) {
      if (Me.CLAUDE_CODE_SYNC_PLUGIN_INSTALL) {
        Ct = d.outputFormat === "stream-json" ? Br => void e.write({
          type: "system",
          subtype: "plugin_install",
          status: Br.status,
          name: "name" in Br ? Br.name : undefined,
          error: "error" in Br ? Br.error : undefined,
          uuid: Kx.randomUUID(),
          session_id: getSessionId()
        }) : undefined;
        Ct?.({
          status: "started"
        });
        Ee = Yt(Br => Ct?.(Br));
        let sn = Ee;
        let Ln = Dt;
        let ct = new Promise(Br => {
          Ce = Br;
        });
        Re = (async () => {
          try {
            if (await Promise.race([sn.catch(() => {}), ct]), Ln) {
              let Vr = gsn() - (performance.now() - mt);
              await Promise.race([Ln.catch(() => {}), sleep(Math.max(0, Vr))]);
            }
            let Br = hsn() ? new Set(Object.keys((await getAllMcpConfigs()).servers)) : null;
            let Pr = performance.now();
            if (await Pn(), au("registry_refresh_ms", performance.now() - Pr, Pr), Br) {
              await ao(Br);
            }
          } catch (Br) {
            Oe(Br);
          }
          try {
            let {
              setupPluginHookHotReload: Br
            } = await Promise.resolve().then(() => (Y9e(), Mpo));
            Br();
          } catch (Br) {
            Oe(Br);
          }
        })();
      } else {
        jt = kickOffBackgroundPluginInstall(Yt);
      }
    }
    let hn = a().mcp.clients.length;
    let vn = waitForPendingMcpBeforeFirstCommand(a);
    let zn = Y5c(() => !g);
    async function Pn() {
      let {
        agentDefinitions: sn
      } = await hCe(l);
      Tt = filterCommandsForHeadless(await getCommands(jhe.cwd()));
      kt = true;
      let Ln = ht.filter(ct => ct.source === "flagSettings");
      ht = [...sn.allAgents, ...Ln];
      loadAllPluginsCacheOnly().then(ct => addStartupContext({
        plugin_count: ct.enabled.length
      }), () => {});
    }
    async function Lr(sn, Ln) {
      let {
        servers: ct
      } = await getAllMcpConfigs();
      addStartupContext({
        mcp_server_count: Object.keys(ct).length
      });
      let Br = rsn();
      let Pr = {};
      for (let [qo, ss] of Object.entries(ct)) {
        if (Br && (ss.scope === "project" || ss.scope === "local")) {
          continue;
        }
        if (sn?.vZc(qo) && !(qo in We.configs)) {
          continue;
        }
        let Ri = ss.type;
        if (Ri === undefined || Ri === "stdio" || Ri === "sse" || Ri === "http" || Ri === "sdk") {
          Pr[qo] = ss;
        }
      }
      for (let [qo, ss] of Object.entries(i)) {
        if (ss.type === "sdk" && (!(qo in Pr) || ct[qo]?.scope === "dynamic")) {
          Pr[qo] = ss;
        }
      }
      let {
        response: Vr,
        sdkServersChanged: Xo
      } = await Xr(Pr, {
        authoritative: false,
        caller: Ln,
        deferConnect: getMcpConnectNonBlocking()
      });
      if (Xo) {
        Be();
      }
      logForDebugging(`Headless MCP refresh: added=${Vr.added.length}, removed=${Vr.removed.length}`);
    }
    async function ao(sn) {
      let Ln = performance.now();
      let ct = JGc();
      let Br = Lr(sn, "plugins_sync");
      if (ct === 0) {
        Br.catch(Vr => Oe(Vr));
        au("plugins_sync_mcp_ms", 0);
        logEvent("tengu_plugins_sync_mcp_skipped", {});
        return;
      }
      let Pr = sleep(ct).then(() => "timeout");
      try {
        if ((await Promise.race([Br, Pr])) === "timeout") {
          logEvent("tengu_plugins_sync_mcp_timeout", {
            timeout_ms: ct
          });
          Br.catch(Vr => Oe(Vr));
        }
      } catch (Vr) {
        Oe(Vr);
      }
      au("plugins_sync_mcp_ms", performance.now() - Ln);
    }
    let Nn = true;
    let Tr = () => {
      if (!Nn || d.outputFormat !== "stream-json") {
        return;
      }
      vw({
        type: "system",
        subtype: "commands_changed",
        commands: gyp([...Tt, ...a().mcp.commands], "name").filter(sn => sn.userInvocable !== false).map(sn => ({
          name: getCommandName(sn),
          description: formatDescriptionWithSource(sn),
          argumentHint: sn.argumentHint || "",
          aliases: sn.aliases?.length ? sn.aliases : undefined
        }))
      });
    };
    let To = gxt.subscribe(() => {
      clearCommandsCache();
      getCommands(jhe.cwd()).then(sn => {
        Tt = filterCommandsForHeadless(sn);
        kt = true;
        Tr();
      }).catch(Oe);
      getAgentDefinitionsWithOverrides(jhe.cwd()).then(sn => {
        let Ln = ht.filter(ct => ct.source === "flagSettings");
        ht = [...sn.allAgents, ...Ln];
      });
    });
    LTe(() => {
      if (L && bba("now").length > 0) {
        L.abort(userAbortReason("interrupt"));
      }
    });
    let wr = false;
    let Ut = 0;
    let Wn = () => {
      let sn = getTotalCostUSD();
      if (sn !== Ut) {
        e.sessionState.notifyInternalMetadataChanged({
          cumulative_cost_usd: sn
        });
        Ut = sn;
      }
    };
    let Fr = async () => {
      if (g || isShuttingDown()) {
        return;
      }
      if (g = true, A = undefined, e.sessionState.notifyStateChanged("running"), nza(), e.resetStallWatchdog(), zn.stop(), Ye) {
        await Ye;
      }
      if (vx("run_entry"), !wr) {
        wr = true;
        au("first_message_read_ms", performance.now(), 0);
        dhl();
      }
      try {
        let Pr = performance.now();
        if (await Be(), au("sdk_mcp_update_ms", performance.now() - Pr, Pr), vx("after_updateSdkMcp"), Gt) {
          let Vr = performance.now();
          let Xo = SGc() - (Vr - He);
          let qo = sleep(Math.max(0, Xo)).then(() => "timeout");
          if ((await Promise.race([Gt, qo])) === "timeout") {
            logEvent("tengu_skills_sync_wait_timeout", {});
          }
          au("skills_sync_wait_ms", performance.now() - Vr, Vr);
          clearCommandsCache();
          Tt = filterCommandsForHeadless(await getCommands(jhe.cwd()));
          kt = true;
          Tr();
          Gt = null;
        }
        if (Dt) {
          let Vr = performance.now();
          let Xo = gsn() - (Vr - mt);
          let qo = sleep(Math.max(0, Xo)).then(() => "timeout");
          let ss = (await Promise.race([Dt, qo])) === "timeout";
          if (wn("info", "plugins_sync_wait", {
            timed_out: ss
          }), ss) {
            logEvent("tengu_plugins_sync_wait_timeout", {});
            Dt.then(() => {
              bn = true;
            }).catch(Oe);
          }
          if (au("plugins_sync_install_ms", performance.now() - Vr), Dt = null, !Ee) {
            let Ri = performance.now();
            try {
              let ya = new Set(Object.keys((await getAllMcpConfigs()).servers));
              await Pn();
              await ao(ya);
              au("plugin_state_refresh_inline_ms", performance.now() - Ri, Ri);
            } catch (ya) {
              Oe(ya);
            }
          }
        }
        if (Ee) {
          let Vr = performance.now();
          if (Fe > 0) {
            let Xo = sleep(Fe).then(() => "timeout");
            if ((await Promise.race([Ee, Xo])) === "timeout") {
              logForDebugging(`CLAUDE_CODE_SYNC_PLUGIN_INSTALL: plugin installation timed out after ${Fe}ms`, {
                level: "error"
              });
              logEvent("tengu_sync_plugin_install_timeout", {
                timeout_ms: Fe
              });
            }
          } else {
            await Ee;
          }
          if (au("plugin_install_ms", performance.now() - Vr, Vr), Xe) {
            au("plugin_mcp_reconcile_ms", (Xe.end ?? performance.now()) - Xe.start, Xe.start);
          }
          Ee = null;
          Ce?.();
          au("plugin_install_total_ms", performance.now() - Vr, Vr);
        }
      } finally {
        Ct?.({
          status: "completed"
        });
        Ct = undefined;
        Ce?.();
      }
      let sn = st(process.env.CLAUDE_CODE_ENABLE_BACKGROUND_PLUGIN_REFRESH);
      let Ln = async () => {
        if (sn && jt?.needsRefresh || bn) {
          if (jt) {
            jt.needsRefresh = false;
          }
          bn = false;
          try {
            await Pn();
          } catch (Pr) {
            Oe(Pr);
          }
        }
      };
      let ct = createKeepAlivePulse(H, st(process.env.CLAUDE_CODE_REMOTE));
      let Br = createKeepAlivePulse(H, true);
      try {
        let Pr;
        let Vr = false;
        let Xo = null;
        let qo = false;
        let ss = null;
        let Ri = false;
        let ya = true;
        let fs = 0;
        let tc = Mn => GI(Mn) && Mn.mode === "orphaned-permission";
        let On = () => {
          let Mn = i5e(tc);
          if (Mn) {
            logForDebugging(`drainCommandQueue: prioritizing orphaned-permission for toolUseID=${Mn.orphanedPermission?.permissionResult?.toolUseID ?? "<unknown>"}`);
            return Mn;
          }
          return ywc(GI);
        };
        let lr = async () => {
          while (Pr = On()) {
            if (fs++, P++, e.sessionState.notifyTurnStarting(), Pr.mode !== "prompt" && Pr.mode !== "orphaned-permission" && Pr.mode !== "task-notification") {
              throw Error("only prompt commands are supported in streaming mode");
            }
            let Mn = [Pr];
            if (Pr.mode === "prompt") {
              while (canBatchWith(Pr, LV(GI))) {
                Mn.push(i5e(GI));
              }
              if (Mn.length > 1) {
                Pr = {
                  ...Pr,
                  value: joinPromptValues(Mn.map(nn => nn.value)),
                  uuid: Mn.findLast(nn => nn.uuid)?.uuid ?? Pr.uuid,
                  fileAttachments: Mn.flatMap(nn => nn.fileAttachments ?? []),
                  clientPlatform: Mn.find(nn => nn.clientPlatform)?.clientPlatform ?? Pr.clientPlatform
                };
              }
            }
            let Un = Mn.map(nn => nn.uuid).filter(nn => nn !== undefined);
            if (d.replayUserMessages && Mn.length > 1) {
              for (let nn of Mn) {
                if (nn.uuid && nn.uuid !== Pr.uuid) {
                  H.enqueue({
                    type: "user",
                    message: {
                      role: "user",
                      content: nn.value
                    },
                    session_id: getSessionId(),
                    parent_tool_use_id: null,
                    uuid: nn.uuid,
                    isReplay: true,
                    ...(nn.fileAttachments?.length && {
                      file_attachments: nn.fileAttachments
                    }),
                    ...(nn.origin && {
                      origin: nn.origin
                    })
                  });
                }
              }
            }
            if (ya) {
              if (ya = false, Re) {
                let qn = performance.now();
                await Re;
                Re = null;
                au("registry_refresh_join_ms", performance.now() - qn, qn);
              }
              vx("before_mcp_prewait");
              let nn = performance.now();
              if (a().mcp.clients.length > hn) {
                await waitForPendingMcpBeforeFirstCommand(a, undefined, hn > 0);
              } else {
                await vn;
              }
              au("mcp_prewait_ms", performance.now() - nn, nn);
              vx("after_mcp_prewait");
            }
            let Er = a();
            let Or = mergeMcpClientLists(Er.mcp.clients, pe, We.clients);
            ke(Or);
            for (let nn of Or) {
              Jns(nn);
            }
            let Y = wt(Er);
            for (let nn of Un) {
              e.onCommandLifecycle?.(nn, "started");
            }
            let Se = Pr.value;
            if (e instanceof tkt && Pr.mode === "prompt") {
              logEvent("tengu_bridge_message_received", {
                is_repl: false
              });
            }
            if (Pr.shouldQuery !== false) {
              if (W.abortController?.abort(), W.abortController = null, W.pendingSuggestion = null, W.pendingLastEmittedEntry = null, W.lastEmitted && Pr.mode === "prompt") {
                let nn = typeof Se === "string" ? Se : Se.find(qn => qn.type === "text")?.text;
                if (typeof nn === "string") {
                  uza(W.lastEmitted.text, nn, W.lastEmitted.emittedAt, W.lastEmitted.promptId, W.lastEmitted.generationRequestId);
                }
                W.lastEmitted = null;
              }
            }
            L = createAbortController();
            let qe = undefined;
            Promise.resolve().then(() => (ikt(), skt)).then(nn => nn.flushSyncedFiles()).catch(() => {});
            vx("before_ask");
            ZJt();
            let Qe = Pr;
            if (Qe.uuid !== undefined && mba(Qe.uuid)) {
              e.onCommandLifecycle?.(Qe.uuid, "completed");
              continue;
            }
            let Ht = typeof Se === "string" ? Se : Tl(Se, `
`);
            await ZCn(Qe.workload ?? d.workload, () => iqn(Ht, async () => {
              let nn = false;
              let qn = false;
              let zr = 0;
              let wo = getTotalAPIDuration();
              let Nr = V.length;
              let pi = getMainLoopModelOverride();
              S = Date.now();
              XQ.startCLIActivity("print-ask");
              try {
                for await (let Dr of j5c({
                  commands: gyp([...Tt, ...Er.mcp.commands], "name"),
                  prompt: Se,
                  promptUuid: Qe.uuid,
                  isMeta: Qe.isMeta,
                  shouldQuery: Qe.shouldQuery,
                  stopHookActive: Qe.stopHookActive,
                  fileAttachments: Qe.fileAttachments,
                  skipSlashCommands: Qe.skipSlashCommands,
                  bridgeOrigin: Qe.bridgeOrigin,
                  modelScheduledOrigin: Qe.modelScheduledOrigin,
                  origin: Qe.origin ?? (Qe.mode === "task-notification" ? {
                    kind: "task-notification"
                  } : undefined),
                  clientPlatform: Qe.clientPlatform,
                  verifiedSlackHumanTurn: Qe.verifiedSlackHumanTurn,
                  cwd: jhe.cwd(),
                  tools: Y,
                  refreshTools: () => wt(a()),
                  refreshMcpClients: () => mergeMcpClientLists(a().mcp.clients, pe, We.clients),
                  verbose: d.verbose,
                  mcpClients: Or,
                  thinkingConfig: me,
                  maxTurns: d.maxTurns,
                  maxBudgetUsd: d.maxBudgetUsd,
                  taskBudget: d.taskBudget,
                  canUseTool: s,
                  userSpecifiedModel: be,
                  fallbackModel: d.fallbackModel,
                  jsonSchema: getInitJsonSchema() ?? d.jsonSchema,
                  mutableMessages: V,
                  sessionEnvVars: Q,
                  isolationLatch: Z,
                  pendingNestedMemoryTriggers: oe,
                  getReadFileCache: () => ne.size === 0 ? J : K2n(J, ne),
                  setReadFileCache: Us => {
                    J = Us;
                    for (let [oa, Du] of ne.entries()) {
                      let nc = J.get(oa);
                      if (!nc || Du.timestamp > nc.timestamp) {
                        J.set(oa, Du);
                      }
                    }
                    ne.clear();
                  },
                  customSystemPrompt: yt(),
                  appendSystemPrompt: d.appendSystemPrompt,
                  planModeInstructions: d.planModeInstructions,
                  appendSubagentSystemPrompt: d.appendSubagentSystemPrompt,
                  toolAliases: d.toolAliases,
                  excludeDynamicSections: d.excludeDynamicSections,
                  getAppState: a,
                  setAppState: l,
                  abortController: L,
                  replayUserMessages: d.replayUserMessages,
                  includePartialMessages: d.includePartialMessages,
                  forwardSubagentText: d.forwardSubagentText,
                  onCommandLifecycle: e.onCommandLifecycle,
                  sessionState: e.sessionState,
                  requestDialog: getHasStreamingInput() ? createPrintRequestDialog(e) : undefined,
                  agents: ht,
                  allowedAgentTypes: Rt,
                  orphanedPermission: Qe.orphanedPermission,
                  deferredToolUse: x,
                  setSDKStatus: (Us, oa) => {
                    H.enqueue({
                      type: "system",
                      subtype: "status",
                      status: Us,
                      ...(oa?.compactResult !== undefined && {
                        compact_result: oa.compactResult
                      }),
                      ...(oa?.compactError !== undefined && {
                        compact_error: oa.compactError
                      }),
                      session_id: getSessionId(),
                      uuid: Kx.randomUUID()
                    });
                  }
                })) {
                  if (x = undefined, Sn(), Dr.type === "system") {
                    if (Dr.subtype === "api_retry") {
                      nn = true;
                      zr = Math.max(zr, Dr.error_status ?? 0);
                    }
                    if (Dr.subtype === "compact_boundary") {
                      qn = true;
                      Nr = V.length;
                    }
                  }
                  if (Dr.type === "assistant" && Dr.parent_tool_use_id === null && Dr.message.model !== "<synthetic>" && Dr.message.model !== C) {
                    C = Dr.message.model;
                    e.sessionState.notifyMetadataChanged({
                      last_served_model: Dr.message.model
                    });
                  }
                  if (Dr.type === "result") {
                    if (S !== undefined) {
                      logEvent("tengu_sdk_result", {
                        subtype: Dr.subtype,
                        is_error: Dr.is_error,
                        num_turns: Dr.num_turns,
                        duration_ms: Dr.duration_ms,
                        duration_api_ms: getTotalAPIDuration() - wo,
                        saw_retry: nn,
                        saw_compact: qn,
                        retry_status: nn ? zr : undefined,
                        api_error_status: Dr.subtype === "success" ? Dr.api_error_status ?? undefined : undefined,
                        ...K(Nr, Y)
                      });
                      S = undefined;
                    }
                    if (Dr.is_error) {
                      reportTurnFailed(e.sessionState, Dr.subtype === "success" ? Dr.result : Dr.errors[0]);
                    }
                    for (let oa of VX()) {
                      H.enqueue(oa);
                    }
                    let Us = a();
                    if (Qe.shouldQuery === false) {
                      if (d.sessionMirror) {
                        await flushSessionStorage();
                      }
                      H.enqueue(Dr);
                    } else if (c6c({
                      inputClosed: k,
                      runningTasks: Uht(Us)
                    }) || k && Ons({
                      tasks: Object.values(Us.tasks ?? {}),
                      waits: M,
                      now: Date.now()
                    })) {
                      Mns({
                        message: Dr,
                        held: O,
                        holdBackActive: true,
                        emit: oa => H.enqueue(oa)
                      });
                    } else {
                      if (d.sessionMirror) {
                        await flushSessionStorage();
                      }
                      Mns({
                        message: Dr,
                        held: O,
                        holdBackActive: false,
                        emit: oa => H.enqueue(oa)
                      });
                    }
                  } else {
                    for (let Us of VX()) {
                      H.enqueue(Us);
                    }
                    H.enqueue(Dr);
                  }
                }
              } finally {
                let Dr = modelOverrideToAdoptAfterTurn({
                  activeUserSpecifiedModel: be,
                  overrideAtTurnStart: pi,
                  overrideAtTurnEnd: getMainLoopModelOverride()
                });
                if (Dr.kind !== "keep" && be !== undefined) {
                  logEvent("tengu_print_model_override_adopted", {
                    from_model_scope: TTe(be),
                    ...(Dr.kind === "adopt" ? {
                      to_model_scope: TTe(Dr.model)
                    } : {
                      cleared_to_session_default: true
                    })
                  });
                  be = Dr.kind === "adopt" ? Dr.model : undefined;
                  le();
                }
                if (Dr.kind === "keep" && Dr.allowedOverrideApplied) {
                  ue = undefined;
                }
                if (Dr.kind === "keep" && Dr.blockedByAllowlist !== undefined && (be === undefined || isExemptDefaultResolvingPick(be) || isModelAllowed(be))) {
                  ce(Dr.blockedByAllowlist, be);
                }
                Vde();
                XQ.endCLIActivity("print-ask");
              }
            }));
            for (let nn of Un) {
              e.onCommandLifecycle?.(nn, "completed");
            }
            if (wn("info", "cli_ask_turn_complete", {
              should_query: Qe.shouldQuery,
              batch_size: Mn.length,
              mode: Qe.mode
            }), Sn(), gt?.sendResult(), Promise.resolve().then(() => (ikt(), skt)).then(nn => nn.flushSyncedFiles()).catch(() => {}), Rns().snapshot(xns(), {}).catch(Oe), d.promptSuggestions && Qe.shouldQuery !== false && !isShuttingDown() && !Pl(process.env.CLAUDE_CODE_ENABLE_PROMPT_SUGGESTION)) {
              W.abortController?.abort();
              let qn = new AbortController();
              W.abortController = qn;
              let zr = getLastCacheSafeParams();
              if (!zr) {
                W$("sdk_no_params", undefined, undefined, "sdk");
              } else {
                let wo = {
                  promise: null
                };
                wo.promise = (async () => {
                  try {
                    let Nr = await yCo(qn, V, a, zr, "sdk");
                    if (!Nr || qn.signal.aborted) {
                      return;
                    }
                    let pi = {
                      type: "prompt_suggestion",
                      suggestion: Nr.suggestion,
                      uuid: Kx.randomUUID(),
                      session_id: getSessionId()
                    };
                    let Dr = {
                      text: Nr.suggestion,
                      emittedAt: Date.now(),
                      promptId: Nr.promptId,
                      generationRequestId: Nr.generationRequestId
                    };
                    if (O.length > 0) {
                      W.pendingSuggestion = pi;
                      W.pendingLastEmittedEntry = {
                        text: Dr.text,
                        promptId: Dr.promptId,
                        generationRequestId: Dr.generationRequestId
                      };
                    } else {
                      W.lastEmitted = Dr;
                      H.enqueue(pi);
                    }
                  } catch (Nr) {
                    if (Nr instanceof Error && (Nr.name === "AbortError" || Nr.name === "APIUserAbortError")) {
                      W$("aborted", undefined, undefined, "sdk");
                      return;
                    }
                    Oe(sr(Nr));
                  } finally {
                    if (W.inflightPromise === wo.promise) {
                      W.inflightPromise = null;
                    }
                  }
                })();
                W.inflightPromise = wo.promise;
              }
            }
            Vmo();
            Xnr();
            Gmo();
          }
        };
        do {
          for (let Un of VX()) {
            H.enqueue(Un);
          }
          if (await Ln(), e.sessionState.getState() === "idle" && LV(GI) !== undefined) {
            e.sessionState.notifyStateChanged("running");
          }
          A = "draining_commands";
          let Mn = fs;
          await lr();
          Wn();
          Vr = false;
          {
            let Un = a();
            let Er = Uht(Un).filter(zr => kv(zr) && zr.type !== "in_process_teammate");
            let Or = LV(GI) !== undefined;
            let Y = Date.now();
            let Se = Ons({
              tasks: Object.values(Un.tasks ?? {}),
              waits: M,
              now: Y
            });
            let qe = fs > Mn;
            if (k && !Or && !qe) {
              ss ??= Y;
            } else {
              ss = null;
              Ri = false;
            }
            let Qe = p6c();
            let Ht = Qe > 0 && ss !== null && Y - ss >= Qe;
            let nn = m6c({
              runningBackgroundTasks: Er,
              inputClosed: k,
              hasMainThreadQueued: Or,
              hasActiveTeammates: k && (hasActiveInProcessTeammates(Un) || hasNonLeadTeammate(Un.teamContext)),
              hasPendingNotification: Se,
              ceilingExceeded: Ht,
              deadline: Xo,
              swept: qo,
              now: Y
            });
            if (Xo = nn.deadline, qo = nn.swept, nn.shouldSweep && !L?.signal.aborted) {
              if (Ht && !Ri) {
                Ri = true;
                process.stderr.write(`Background tasks still running after ${Math.round(Qe / 1000)}s; terminating. Set CLAUDE_CODE_PRINT_BG_WAIT_CEILING_MS=0 to wait indefinitely.
`);
              }
              f6c(Er, DO(a, l));
              Vr = true;
            }
            if ((!nn.swept && Er.length > 0 || Or || Se) && !L?.signal.aborted) {
              if (Vr = true, !Or) {
                if (A = "waiting_for_agents", u6c({
                  inputClosed: k,
                  currentState: e.sessionState.getState(),
                  hasRunningBgTasks: Er.some(RQ)
                })) {
                  e.sessionState.notifyStateChanged("idle");
                }
                ct();
                await sleep(100);
              }
            }
          }
        } while (Vr);
        if (wn("info", "cli_drain_queue_complete", {
          commands_processed: fs,
          queue_depth_at_exit: Umo()
        }), O.length > 0) {
          if (d.sessionMirror) {
            await flushSessionStorage();
          }
          if (Nns(O, Mn => H.enqueue(Mn)), W.pendingSuggestion) {
            if (H.enqueue(W.pendingSuggestion), W.pendingLastEmittedEntry) {
              W.lastEmitted = {
                ...W.pendingLastEmittedEntry,
                emittedAt: Date.now()
              };
              W.pendingLastEmittedEntry = null;
            }
            W.pendingSuggestion = null;
          }
        }
      } catch (Pr) {
        if (logEvent("tengu_sdk_session_crash", J4f(Pr)), !E) {
          logEvent("tengu_sdk_result", {
            subtype: "error_during_execution",
            is_error: true,
            num_turns: 0,
            duration_ms: 0,
            duration_api_ms: 0,
            saw_retry: false,
            saw_compact: false
          });
          E = true;
        }
        try {
          if (d.sessionMirror) {
            await flushSessionStorage();
          }
          reportTurnFailed(e.sessionState, he(Pr));
          await e.write({
            type: "result",
            subtype: "error_during_execution",
            duration_ms: 0,
            duration_api_ms: 0,
            is_error: true,
            num_turns: 0,
            stop_reason: null,
            session_id: getSessionId(),
            total_cost_usd: 0,
            usage: Hb,
            modelUsage: {},
            permission_denials: [],
            uuid: Kx.randomUUID(),
            errors: [he(Pr), ...OHe().map(Vr => Vr.error)]
          });
        } catch {}
        await Promise.race([e.flushSessionState(), sleep(5000, undefined, {
          unref: true
        })]);
        W.abortController?.abort();
        gracefulShutdownSync(1);
        return;
      } finally {
        if (A = "finally_flush", await e.flushInternalEvents(), A = "finally_post_flush", !isShuttingDown()) {
          await Promise.race([e.flushDeliveryAcks(), sleep(5000, undefined, {
            unref: true
          })]);
        }
        if (!isShuttingDown()) {
          e.sessionState.notifyStateChanged("idle");
          Wn();
          for (let Pr of VX()) {
            H.enqueue(Pr);
          }
          tza(e.sessionState);
        }
        g = false;
        zn.start();
      }
      if (LV(GI) !== undefined) {
        Fr();
        return;
      }
      {
        let Vr = a().teamContext;
        if (Vr && isTeamLead(Vr)) {
          while (true) {
            let ss = a();
            if (!(hasActiveInProcessTeammates(ss) || hasNonLeadTeammate(ss.teamContext))) {
              logForDebugging("[print.ts] No more active teammates, stopping poll");
              break;
            }
            let ya = await readUnreadMessages("team-lead", ss.teamContext?.teamName);
            if (ya.length > 0) {
              logForDebugging(`[print.ts] Team-lead found ${ya.length} unread messages`);
              await markMessagesAsRead("team-lead", ss.teamContext?.teamName, ya);
              let fs = ss.teamContext?.teamName;
              for (let lr of ya) {
                let Mn = isShutdownApproved(lr.text);
                if (Mn && fs) {
                  let Un = Mn.from;
                  logForDebugging(`[print.ts] Processing shutdown_approved from ${Un}`);
                  let Er = ss.teamContext?.teammates ? Object.entries(ss.teamContext.teammates).find(([, Or]) => Or.name === Un)?.[0] : undefined;
                  if (Er) {
                    removeTeammateFromTeamFile(fs, {
                      agentId: Er,
                      name: Un
                    });
                    logForDebugging(`[print.ts] Removed ${Un} from team file`);
                    await cgt(fs, Er, Un, "shutdown");
                    l(Or => {
                      if (!Or.teamContext?.teammates) {
                        return Or;
                      }
                      if (!(Er in Or.teamContext.teammates)) {
                        return Or;
                      }
                      let {
                        [Er]: Y,
                        ...Se
                      } = Or.teamContext.teammates;
                      return {
                        ...Or,
                        teamContext: {
                          ...Or.teamContext,
                          teammates: Se
                        }
                      };
                    });
                  }
                }
              }
              let tc = ya.filter(lr => isHeadlessLeadDisplayableMessage(lr.text));
              if (tc.length === 0) {
                Br();
                continue;
              }
              let On = formatTeammateMessages(tc, {
                recipientIsLead: true
              });
              __({
                mode: "prompt",
                agentId: mainAgentId(),
                value: On,
                uuid: Kx.randomUUID()
              });
              Fr();
              return;
            }
            if (k && !I) {
              I = true;
              logForDebugging("[print.ts] Input closed with active teammates, injecting shutdown prompt");
              __({
                mode: "prompt",
                agentId: mainAgentId(),
                value: G6c,
                uuid: Kx.randomUUID()
              });
              Fr();
              return;
            }
            ct();
            await sleep(500);
          }
        }
      }
      if (k) {
        if (await (async () => {
          let Vr = a();
          if (hasWorkingInProcessTeammates(Vr)) {
            await waitForTeammatesToBecomeIdle(l, Vr);
          }
          let Xo = a();
          return hasNonLeadTeammate(Xo.teamContext) || hasActiveInProcessTeammates(Xo);
        })()) {
          __({
            mode: "prompt",
            agentId: mainAgentId(),
            value: G6c,
            uuid: Kx.randomUUID()
          });
          Fr();
        } else {
          if (W.inflightPromise) {
            let Vr = setTimeout(Xo => Xo?.abort(), 30000, W.abortController);
            try {
              await W.inflightPromise;
            } finally {
              clearTimeout(Vr);
            }
          }
          if (W.abortController?.abort(), W.abortController = null, N.size > 0) {
            await Promise.allSettled(N);
          }
          await K2o();
          Nn = false;
          To();
          j?.();
          wDe.delete(z);
          await ZTo([...a().mcp.clients, ...pe, ...We.clients]);
          b5e(null);
          for (let Vr of VX()) {
            H.enqueue(Vr);
          }
          H.done();
        }
      }
    };
    if (LTe(() => {
      if (!g && !k && LV(GI) !== undefined) {
        Fr();
      }
    }), !g && !k && LV(GI) !== undefined) {
      Fr();
    }
    if (f) {
      logForDebugging(`[print.ts] Auto-resuming deferred tool: ${f.toolName} (${f.toolUseID})`);
      __({
        mode: "prompt",
        agentId: mainAgentId(),
        value: getResumePrompt(),
        uuid: Kx.randomUUID(),
        isMeta: true
      });
      Fr();
    }
    function Is(sn) {
      let Ln = e.cancelPendingUserDialogs(WX.kind, sn);
      if (Ln > 0) {
        wn("info", "cli_user_dialog_implicit_cancel", {
          cancelled_count: Ln,
          reason: sn
        });
      }
    }
    let _r = null;
    if (W6c.isKairosCronEnabled()) {
      _r = L4f.createCronScheduler({
        onFire: sn => {
          if (k) {
            return;
          }
          let Ln = U4f.resolveLoopDefaultFire(sn);
          __({
            mode: "prompt",
            agentId: mainAgentId(),
            value: Ln,
            uuid: Kx.randomUUID(),
            priority: "later",
            isMeta: true,
            skipSlashCommands: true,
            modelScheduledOrigin: true,
            workload: "cron"
          });
          Is("cron_fire");
          Fr();
        },
        isLoading: () => g || k,
        getJitterConfig: F4f.getCronJitterConfig,
        isKilled: () => !W6c.isKairosCronEnabled()
      });
      _r.start();
    }
    let kn = function (sn, Ln) {
      H.enqueue({
        type: "control_response",
        response: {
          subtype: "success",
          request_id: sn.request_id,
          response: Ln
        }
      });
    };
    let Qn = function (sn, Ln) {
      H.enqueue({
        type: "control_response",
        response: {
          subtype: "error",
          request_id: sn.request_id,
          error: Ln
        }
      });
    };
    let gi = new Map();
    let Ks = function (sn, Ln) {
      logEvent("tengu_sdk_control_request_progress", {
        status: Ln.status
      });
      H.enqueue({
        type: "system",
        subtype: "control_request_progress",
        request_id: sn.request_id,
        ...Ln,
        uuid: Kx.randomUUID(),
        session_id: getSessionId()
      });
    };
    async function Fa(sn, Ln) {
      try {
        let ct = await WXe.realpath(Nt());
        let Br = await WXe.realpath(Ln.directory);
        if (Br === ct || !pathInWorkingPath(Br, ct, {
          caseFold: false
        })) {
          throw Error(`register_repo_root: ${Ln.directory} is not a subdirectory of cwd`);
        }
        l(Vr => ({
          ...Vr,
          toolPermissionContext: $y(Vr.toolPermissionContext, {
            type: "addDirectories",
            directories: [Br],
            destination: "session"
          })
        }));
        let Pr = getAdditionalDirectoriesForClaudeMd();
        if (!Pr.includes(Br)) {
          setAdditionalDirectoriesForClaudeMd([...Pr, Br]);
        }
        if (SandboxManager.refreshConfig(), Ln.reload_claude_md) {
          clearMemoryFileCaches();
          let Vr = qXe.join(Br, "CLAUDE.md");
          if (!oe.includes(Vr)) {
            oe.push(Vr);
          }
        }
        if (Ln.reload_skills) {
          clearCommandsCache();
          clearAgentDefinitionsCache();
          resetSentSkillNames();
          g$.emit();
        }
        if (Ln.reload_plugins) {
          await Promise.race([Promise.allSettled([Pns()]), sleep(gsn())]);
          await hCe(l);
          let Vr = new Set(Object.keys(We.configs));
          let Xo = new Set(a().mcp.clients.filter(qo => !Vr.vZc(qo.name)).map(qo => qo.name));
          await Promise.allSettled([Lr(Xo, "reload_plugins")]);
        }
        kn(sn, {
          directory: Br
        });
      } catch (ct) {
        Qn(sn, he(ct));
      }
    }
    async function Hs(sn, Ln) {
      try {
        let {
          stageFile: ct,
          destFromMountPath: Br
        } = await Promise.resolve().then(() => (Yns(), Kns));
        let Pr;
        try {
          Pr = Br(Ln.mount_path);
        } catch (ss) {
          Qn(sn, he(ss));
          return;
        }
        if (!st(Me.CLAUDE_CODE_ADDITIONAL_DIRECTORIES_CLAUDE_MD)) {
          Qn(sn, "add_directory requires CLAUDE_CODE_ADDITIONAL_DIRECTORIES_CLAUDE_MD to be set in the container environment");
          return;
        }
        let Vr = await ct({
          mount_path: Ln.mount_path,
          force: true
        });
        if (!Vr.ok) {
          Qn(sn, Vr.error);
          return;
        }
        let Xo = qXe.dirname(Pr);
        let qo = getAdditionalDirectoriesForClaudeMd();
        if (!qo.includes(Xo)) {
          setAdditionalDirectoriesForClaudeMd([...qo, Xo]);
        }
        clearMemoryFileCaches();
        iE.cache.clear?.();
        kn(sn, {
          staged_path: Pr,
          directory: Xo
        });
      } catch (ct) {
        Qn(sn, he(ct));
      }
    }
    let Ms = new Set();
    if (m && p && p.kind !== "none" && Me.CLAUDE_CODE_RESUME_INTERRUPTED_TURN) {
      for (let sn of m) {
        if (sn === h?.tool_use_id) {
          continue;
        }
        Ms.add(sn);
      }
    }
    let Ia = sn => {
      if (_) {
        clearTimeout(_);
        _ = undefined;
      }
      let Ln = y;
      if (!Ln || !h) {
        return;
      }
      if (y = undefined, Ms.add(h.tool_use_id), e.write({
        type: "control_cancel_request",
        request_id: h.request_id
      }), logEvent("tengu_resume_stale_prompt_cancel", {
        kind: "permission"
      }), sn === "interrupt" || g || Ude()) {
        logForDebugging(`[print.ts] Parked permission toolUseID=${h.tool_use_id} superseded by new input during wait (${sn}) \u2014 dropping deferred rescue`);
        logEvent("tengu_resume_parked_permission", {
          outcome: "superseded",
          reason: sn,
          wait_ms: Date.now() - b
        });
        return;
      }
      if (logForDebugging(`[print.ts] No consumable persisted control_response for parked permission toolUseID=${h.tool_use_id} (${sn}) \u2014 falling back to cancel + re-ask`), p && p.kind !== "none") {
        removeInterruptedMessage(V, p.message);
      }
      __(Ln);
      logEvent("tengu_resume_parked_permission", {
        outcome: "fallback_reask",
        reason: sn,
        wait_ms: Date.now() - b
      });
      Fr();
    };
    e.setUnexpectedResponseCallback(async sn => {
      let Ln = sn.response.subtype === "success" && typeof sn.response.response?.toolUseID === "string" ? sn.response.response.toolUseID : undefined;
      let ct = h !== undefined && Ln === h.tool_use_id && sn.response.request_id === h.request_id;
      if (ct && _) {
        clearTimeout(_);
        _ = undefined;
      }
      let Br;
      try {
        Br = await handleOrphanedPermissionResponse({
          message: sn,
          setAppState: l,
          handledToolUseIds: Ms,
          onEnqueued: () => {
            Fr();
          }
        });
      } catch (Pr) {
        if (ct) {
          logForDebugging(`[print.ts] orphan handler threw for parked permission toolUseID=${h?.tool_use_id}: ${Pr}`, {
            level: "error"
          });
          Ia("orphan_dropped");
        }
        throw Pr;
      }
      if (ct) {
        if (Br && y) {
          if (y = undefined, p && p.kind !== "none") {
            let Pr = V.findIndex(Xo => Xo.uuid === p.message.uuid);
            let Vr = Pr !== -1 ? V[Pr + 1] : undefined;
            if (Vr?.type === "assistant" && Array.isArray(Vr.message.content) && Vr.message.content.length === 1 && Vr.message.content[0]?.type === "text" && Vr.message.content[0].text === "No response requested.") {
              V.splice(Pr + 1, 1);
            }
          }
          e.write({
            type: "control_cancel_request",
            request_id: h.request_id
          });
          logForDebugging(`[print.ts] Parked permission toolUseID=${Ln} resolved by persisted control_response \u2014 dropping deferred rescue`);
          logEvent("tengu_resume_parked_permission", {
            outcome: "consumed_persisted",
            wait_ms: Date.now() - b
          });
        } else if (!Br) {
          Ia("orphan_dropped");
        }
      }
    });
    let ec = () => {
      if (h && y) {
        _ = setTimeout(Ia, PARKED_PERMISSION_ANSWER_WAIT_MS, "timeout");
        _.unref?.();
      }
    };
    let Os = new Map();
    let Kn = null;
    (async () => {
      if (Ye) {
        await Ye;
      }
      ec();
      let sn = false;
      let Ln = o.some(ct => ct.type !== "system") || g7l();
      au("input_ready_ms", performance.now(), 0);
      phl();
      wn("info", "cli_message_loop_started");
      vx("stdin_listen_started");
      for await (let ct of e.structuredInput) {
        let Br = "uuid" in ct ? ct.uuid : undefined;
        if (Br && ct.type !== "user" && ct.type !== "bash_command" && ct.type !== "control_response" && !(ct.type === "control_request" && (ct.request.subtype === "stage_file" || ct.request.subtype === "register_repo_root" || ct.request.subtype === "add_directory" || ct.request.subtype === "get_workspace_diff"))) {
          e.onCommandLifecycle?.(Br, "completed");
        }
        if (ct.type === "control_request") {
          if (ct.request.subtype === "interrupt") {
            if (L) {
              L.abort(userAbortReason("remote-cancel"));
            }
            aJt({
              taskRegistry: DO(a, l),
              setAppState: l
            });
            W.abortController?.abort();
            W.abortController = null;
            W.lastEmitted = null;
            W.pendingSuggestion = null;
            Ia("interrupt");
            kn(ct);
          } else if (ct.request.subtype === "end_session") {
            if (shouldIgnoreStaleEndSession(ct.request.reason, process.env.CLAUDE_CODE_WORKER_EPOCH)) {
              logForDebugging("[print.ts] stale 'archived' end_session ignored on epoch>1 \u2014 from prior lifecycle");
              kn(ct);
              continue;
            }
            if (logForDebugging(`[print.ts] end_session received, reason=${ct.request.reason ?? "unspecified"}`), L) {
              L.abort();
            }
            F.abort();
            W.abortController?.abort();
            W.abortController = null;
            W.lastEmitted = null;
            W.pendingSuggestion = null;
            kn(ct);
            break;
          } else if (ct.request.subtype === "initialize") {
            let On = typeof ct.request.title === "string" ? ct.request.title.trim() : undefined;
            if (On) {
              Ln = true;
              cacheSessionTitle(On);
            }
            if (ct.request.sdkMcpServers && ct.request.sdkMcpServers.length > 0) {
              for (let Mn of ct.request.sdkMcpServers) {
                i[Mn] = {
                  type: "sdk",
                  name: Mn
                };
              }
            }
            if (ct.request.webSearchIsolationExemptMcpServers) {
              GIl(Z, ct.request.webSearchIsolationExemptMcpServers);
            }
            let lr = await G4f(ct.request, ct.request_id, sn, H, [...Tt, ...a().mcp.commands], de, ae, e, !!d.enableAuthStatus, d, u, a, l);
            if (lr.restrictedAgentModel) {
              ce(lr.restrictedAgentModel);
            }
            if (d.promptSuggestions && d6n()) {
              l(Mn => {
                if (Mn.promptSuggestionEnabled) {
                  return Mn;
                }
                return {
                  ...Mn,
                  promptSuggestionEnabled: true
                };
              });
            }
            if (ct.request.agentProgressSummaries && getFeatureValue_CACHED_MAY_BE_STALE("tengu_slate_prism", true)) {
              setSdkAgentProgressSummariesEnabled(true);
            }
            if (sn = true, Ude()) {
              Fr();
            }
          } else if (ct.request.subtype === "set_permission_mode") {
            let On = ct.request;
            l(lr => ({
              ...lr,
              toolPermissionContext: V4f(On, ct.request_id, lr.toolPermissionContext, H),
              isUltraplanMode: On.ultraplan ?? lr.isUltraplanMode
            }));
          } else if (ct.request.subtype === "set_model") {
            let On = ct.request.model ?? "default";
            let lr = On.trim().toLowerCase() === "default";
            let Mn = lr ? getDefaultMainLoopModel() : On;
            if (!lr && !isExemptDefaultResolvingPick(Mn) && !(isModelAllowedUnderActiveEnforcement(Mn) ?? isModelAllowed(Mn))) {
              let Un = be !== undefined && (isExemptDefaultResolvingPick(be) || isModelAllowed(be)) ? parseUserSpecifiedModel(be) : undefined;
              ce(On, Un);
              Qn(ct, wse(On, Un ?? getMainLoopModel()));
            } else {
              let Un = getMainLoopModel();
              let Er = be;
              if (be = Mn, setMainLoopModelOverride(Mn), l(Y => ({
                ...Y,
                mainLoopModelForSession: Mn
              })), e.sessionState.notifyMetadataChanged({
                model: Mn
              }), getMainLoopModel() !== Un || parseUserSpecifiedModel(Mn) !== parseUserSpecifiedModel(Er ?? Un)) {
                Te(On, Mn);
              }
              le();
              kn(ct);
            }
          } else if (ct.request.subtype === "set_max_thinking_tokens") {
            if (ct.request.thinking_display !== undefined) {
              fe = ct.request.thinking_display ?? undefined;
              setThinkingDisplayExplicit(ct.request.thinking_display !== null);
            }
            me = J6c(ct.request.max_thinking_tokens, fe);
            kn(ct);
          } else if (ct.request.subtype === "mcp_status") {
            kn(ct, {
              mcpServers: co()
            });
          } else if (ct.request.subtype === "get_binary_version") {
            kn(ct, {
              version: `${{
                ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
                PACKAGE_URL: "@anthropic-ai/claude-code",
                README_URL: "https://code.claude.com/docs/en/overview",
                VERSION: "2.1.198",
                FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
                BUILD_TIME: "2026-07-01T06:09:31Z",
                GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
              }.VERSION}${ej()}`,
              buildTime: {
                ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
                PACKAGE_URL: "@anthropic-ai/claude-code",
                README_URL: "https://code.claude.com/docs/en/overview",
                VERSION: "2.1.198",
                FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
                BUILD_TIME: "2026-07-01T06:09:31Z",
                GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
              }.BUILD_TIME
            });
          } else if (ct.request.subtype === "get_context_usage") {
            try {
              let On = a();
              let lr = await collectContextData({
                messages: V,
                getAppState: a,
                getMcp: () => a().mcp,
                options: {
                  mainLoopModel: getMainLoopModel(),
                  tools: wt(On),
                  agentDefinitions: {
                    activeAgents: getActiveAgentsFromList(ht),
                    allAgents: ht
                  },
                  customSystemPrompt: yt(),
                  appendSystemPrompt: d.appendSystemPrompt,
                  excludeDynamicSections: d.excludeDynamicSections
                }
              });
              kn(ct, {
                ...lr
              });
            } catch (On) {
              Qn(ct, he(On));
            }
          } else if (ct.request.subtype === "list_models") {
            try {
              kn(ct, {
                models: bTe(F9e())
              });
            } catch (On) {
              Qn(ct, he(On));
            }
          } else if (ct.request.subtype === "get_session_cost") {
            kn(ct, {
              text: Li(RMe())
            });
          } else if (ct.request.subtype === "get_usage") {
            try {
              let On = await collectUsageData();
              kn(ct, {
                ...On
              });
            } catch (On) {
              Qn(ct, he(On));
            }
          } else if (ct.request.subtype === "mcp_message") {
            let On = ct.request;
            let lr = pe.find(Mn => Mn.name === On.server_name);
            if (lr && lr.type === "connected" && lr.client?.transport?.onmessage) {
              lr.client.transport.onmessage(On.message);
            }
            kn(ct);
          } else if (ct.request.subtype === "rewind_files") {
            let On = a();
            let lr = await h8c(ct.request.user_message_id, On, ct.request.dry_run ?? false);
            if (lr.canRewind || ct.request.dry_run) {
              kn(ct, lr);
            } else {
              Qn(ct, lr.error ?? "Unexpected error");
            }
          } else if (ct.request.subtype === "cancel_async_message") {
            let On = ct.request.message_uuid;
            let lr = HDe(Mn => Mn.uuid === On);
            if (lr.length === 0) {
              pba(On);
            }
            kn(ct, {
              cancelled: lr.length > 0
            });
          } else if (ct.request.subtype === "rewind_conversation") {
            let On = ct.request.target_message_uuid;
            let lr = e.sessionState.getState() !== "idle";
            if (lr && ct.request.interrupt_if_running && !Ude()) {
              aJt({
                taskRegistry: DO(a, l),
                setAppState: l
              });
              W.abortController?.abort();
              W.abortController = null;
              W.lastEmitted = null;
              W.pendingSuggestion = null;
              let Mn = P;
              let Un = Date.now() + 1e4;
              while (e.sessionState.getState() !== "idle" && P === Mn && Date.now() < Un) {
                L?.abort(userAbortReason("remote-cancel"));
                await sleep(20);
              }
              lr = P > Mn || e.sessionState.getState() !== "idle";
            }
            if (lr || Ude()) {
              kn(ct, {
                rewound: false,
                prefillText: null,
                precedingAssistantUuid: null,
                error: Ude() ? "commands queued" : "turn running"
              });
            } else {
              let Mn = On.slice(0, 24);
              let Un = V.findIndex(Or => Or.type === "user" && Or.uuid.slice(0, 24) === Mn);
              let Er = V.some((Or, Y) => Y > Un && selectableUserMessagesFilter(Or));
              if (Un < 0) {
                kn(ct, {
                  rewound: false,
                  prefillText: null,
                  precedingAssistantUuid: null,
                  error: "target not found"
                });
              } else if (Er) {
                kn(ct, {
                  rewound: false,
                  prefillText: null,
                  precedingAssistantUuid: null,
                  error: "stale target"
                });
              } else {
                let Or = V[Un];
                let Y = null;
                if (Or?.type === "user") {
                  let nn = Or.message.content;
                  Y = typeof nn === "string" ? nn : nn.filter(qn => qn.type === "text").map(qn => qn.text).join(`
`);
                }
                let {
                  persistAnchor: Se,
                  precedingAssistantUuid: qe
                } = findRewindAnchors(V, Un);
                let Qe = getFeatureValue_CACHED_MAY_BE_STALE("tengu_rewind_first_message", false);
                let Ht = Qe ? Se : qe;
                if (qe === null && !Qe) {
                  kn(ct, {
                    rewound: false,
                    prefillText: null,
                    precedingAssistantUuid: null,
                    error: "no preceding assistant"
                  });
                } else {
                  let nn = true;
                  let qn = Qe ? {
                    rewound: true
                  } : undefined;
                  try {
                    await mirrorLeafCheckpointToRemote(Ht, qn);
                    await e.flushInternalEvents();
                    await persistLeafCheckpoint(Ht, qn);
                  } catch (zr) {
                    nn = false;
                    Oe(zr);
                  }
                  if (!nn) {
                    kn(ct, {
                      rewound: false,
                      prefillText: null,
                      precedingAssistantUuid: null,
                      error: "failed to persist rewind anchor"
                    });
                  } else if (V[Un]?.uuid !== Or?.uuid) {
                    kn(ct, {
                      rewound: false,
                      prefillText: null,
                      precedingAssistantUuid: null,
                      error: "state changed"
                    });
                  } else {
                    V.splice(Un);
                    rn = V.length;
                    kn(ct, {
                      rewound: true,
                      targetMessageUuid: Or?.uuid ?? On,
                      prefillText: Y,
                      precedingAssistantUuid: qe
                    });
                  }
                }
              }
            }
          } else if (ct.request.subtype === "read_file") {
            try {
              let {
                readFileForRemote: On
              } = await Promise.resolve().then(() => (arn(), rvc));
              let lr = await On(ct.request.path, ct.request.max_bytes, a().toolPermissionContext, ct.request.encoding);
              kn(ct, lr);
            } catch (On) {
              Qn(ct, he(On));
            }
          } else if (ct.request.subtype === "get_workspace_diff") {
            let On = ct;
            (async () => {
              try {
                let {
                  buildWorkspaceDiffResponse: lr
                } = await Promise.resolve().then(() => (B6c(), U6c));
                kn(On, await lr(a().toolPermissionContext));
              } catch (lr) {
                Qn(On, he(lr));
              } finally {
                if (Br) {
                  e.onCommandLifecycle?.(Br, "completed");
                }
              }
            })();
          } else if (ct.request.subtype === "get_plan") {
            try {
              let {
                peekPlanSlug: On,
                getPlan: lr,
                getPlanFilePath: Mn
              } = await Promise.resolve().then(() => (xx(), Dmc));
              let Er = On() !== undefined ? lr() : null;
              kn(ct, Er !== null ? {
                exists: true,
                content: Er,
                path: Mn()
              } : {
                exists: false
              });
            } catch (On) {
              Qn(ct, he(On));
            }
          } else if (ct.request.subtype === "stage_file") {
            let On = ct.request;
            (async () => {
              try {
                let {
                  stageFile: lr
                } = await Promise.resolve().then(() => (Yns(), Kns));
                let Mn = setInterval(Er => {
                  try {
                    Er.enqueue({
                      type: "keep_alive"
                    });
                  } catch {}
                }, 30000, H);
                let Un;
                try {
                  Un = await lr(On);
                } finally {
                  clearInterval(Mn);
                }
                if (Un.ok) {
                  kn(ct, Un);
                } else {
                  Qn(ct, Un.error);
                }
              } catch (lr) {
                Qn(ct, he(lr));
              }
              if (Br) {
                e.onCommandLifecycle?.(Br, "completed");
              }
            })();
          } else if (ct.request.subtype === "register_repo_root") {
            Fa(ct, ct.request).finally(() => {
              if (Br) {
                e.onCommandLifecycle?.(Br, "completed");
              }
            });
          } else if (ct.request.subtype === "add_directory") {
            let On = ct.request;
            (async () => {
              let lr = setInterval(Mn => {
                try {
                  Mn.enqueue({
                    type: "keep_alive"
                  });
                } catch {}
              }, 30000, H);
              try {
                await Hs(ct, On);
              } finally {
                if (clearInterval(lr), Br) {
                  e.onCommandLifecycle?.(Br, "completed");
                }
              }
            })();
          } else if (ct.request.subtype === "file_suggestions") {
            try {
              let {
                generateFileSuggestions: On,
                globalFileIndexCache: lr
              } = await Promise.resolve().then(() => (yvt(), hHl));
              let Mn = await On(lr, ct.request.query, true);
              kn(ct, {
                suggestions: Mn.map(Un => ({
                  path: Un.displayText
                }))
              });
            } catch (On) {
              Qn(ct, he(On));
            }
          } else if (ct.request.subtype === "seed_read_state") {
            try {
              let On = us(ct.request.path);
              let lr = Math.floor((await WXe.stat(On)).mtimeMs);
              if (lr <= ct.request.mtime) {
                let Mn = await WXe.readFile(On, "utf-8");
                let Un = (Mn.charCodeAt(0) === 65279 ? Mn.slice(1) : Mn).replaceAll(`\r
`, `
`);
                ne.set(On, {
                  content: Un,
                  timestamp: lr,
                  offset: undefined,
                  limit: undefined
                });
              }
            } catch {}
            kn(ct);
          } else if (ct.request.subtype === "mcp_set_servers") {
            let {
              response: On,
              sdkServersChanged: lr
            } = await Xr(ct.request.servers, {
              authoritative: true,
              caller: "mcp_set_servers"
            });
            if (kn(ct, On), lr) {
              Be();
            }
          } else if (ct.request.subtype === "reload_plugins") {
            try {
              if (hsn()) {
                await Promise.race([Promise.allSettled([e9c()]), sleep(gsn())]);
              }
              let On = await hCe(l);
              let lr = ht.filter(qe => qe.source === "flagSettings");
              ht = [...On.agentDefinitions.allAgents, ...lr];
              let Mn = new Set(Object.keys(We.configs));
              let Un = new Set(a().mcp.clients.filter(qe => !Mn.vZc(qe.name)).map(qe => qe.name));
              let Er = [];
              let [Or, Y, Se] = await Promise.allSettled([getCommands(jhe.cwd()), Lr(Un, "reload_plugins"), loadAllPluginsCacheOnly()]);
              if (Or.status === "fulfilled") {
                Tt = filterCommandsForHeadless(Or.value);
              } else {
                Oe(Or.reason);
              }
              if (Y.status === "rejected") {
                logForDebugging(`reload_plugins: applyPluginMcpDiff failed: ${he(Y.reason)}`, {
                  level: "error"
                });
              }
              if (Se.status === "fulfilled") {
                Er = Se.value.enabled.map(qe => ({
                  name: qe.name,
                  path: qe.path,
                  source: qe.source
                }));
              } else {
                Oe($o(sr(Se.reason), "reload_plugins: loadAllPlugins failed"));
              }
              kn(ct, {
                commands: Tt.filter(qe => qe.userInvocable !== false).map(qe => ({
                  name: getCommandName(qe),
                  description: formatDescriptionWithSource(qe),
                  argumentHint: qe.argumentHint || "",
                  aliases: qe.aliases?.length ? qe.aliases : undefined
                })),
                agents: ht.map(qe => ({
                  name: qe.agentType,
                  description: qe.whenToUse,
                  model: qe.model === "inherit" ? undefined : qe.model
                })),
                plugins: Er,
                mcpServers: co(),
                error_count: On.error_count
              });
            } catch (On) {
              Qn(ct, he(On));
            }
          } else if (ct.request.subtype === "reload_skills") {
            try {
              if (gLe()) {
                await Promise.race([Promise.allSettled([CGc()]), sleep(TGc())]);
              }
              clearCommandsCache();
              resetSentSkillNames();
              Tt = filterCommandsForHeadless(await getCommands(jhe.cwd()));
              let On = (await getSkillToolCommands(jhe.cwd())).map(lr => ({
                name: getCommandName(lr),
                description: formatDescriptionWithSource(lr),
                argumentHint: lr.argumentHint || "",
                aliases: lr.aliases?.length ? lr.aliases : undefined
              }));
              kn(ct, {
                skills: On
              });
            } catch (On) {
              Qn(ct, he(On));
            }
          } else if (ct.request.subtype === "mcp_reconnect") {
            let On = a();
            let {
              serverName: lr
            } = ct.request;
            let Mn = getMcpConfigByName(lr) ?? t.find(Un => Un.name === lr)?.config ?? pe.find(Un => Un.name === lr)?.config ?? We.clients.find(Un => Un.name === lr)?.config ?? On.mcp.clients.find(Un => Un.name === lr)?.config ?? null;
            if (!Mn) {
              Qn(ct, `Server not found: ${lr}`);
            } else if (isMcpServerBlockedAtConnectTime(lr, Mn)) {
              Qn(ct, `MCP server ${lr} is blocked by enterprise managed policy`);
            } else {
              let Un = await pQ(lr, Mn);
              let Er = uW(lr);
              if (l(Or => ({
                ...Or,
                mcp: {
                  ...Or.mcp,
                  clients: Or.mcp.clients.map(Y => Y.name === lr ? Un.client : Y),
                  tools: [...Y1p(Or.mcp.tools, Y => Y.name?.startsWith(Er)), ...Un.tools],
                  commands: [...Y1p(Or.mcp.commands, Y => u3(Y, lr)), ...Un.commands],
                  resources: Un.resources && Un.resources.length > 0 ? {
                    ...Or.mcp.resources,
                    [lr]: Un.resources
                  } : Nwm(Or.mcp.resources, lr)
                }
              })), We = {
                ...We,
                clients: [...We.clients.filter(Or => Or.name !== lr), Un.client],
                tools: [...We.tools.filter(Or => !Or.name?.startsWith(Er)), ...Un.tools]
              }, Un.client.type === "connected") {
                ke([Un.client]);
                Jns(Un.client);
                kn(ct);
              } else {
                let Or = Un.client.type === "failed" ? Un.client.error ?? "Connection failed" : `Server status: ${Un.client.type}`;
                Qn(ct, Or);
              }
            }
          } else if (ct.request.subtype === "mcp_call") {
            let {
              tool: On,
              arguments: lr
            } = ct.request;
            let Mn = TI(On);
            if (!Mn || !Mn.toolName) {
              Qn(ct, `Not a fully-qualified MCP tool name: ${On}`);
            } else {
              let Un = [...a().mcp.clients, ...pe, ...We.clients].find(Er => Er.type === "connected" && Bl(Er.name) === Mn.serverName);
              if (!Un || Un.type !== "connected") {
                Qn(ct, `MCP server not connected: ${Mn.serverName}`);
              } else if (Un.config.type === "sdk") {
                Qn(ct, "mcp_call does not support SDK MCP servers. " + `SDK servers are caller-provided \u2014 invoke ${Mn.serverName} directly.`);
              } else {
                let Er = [...a().mcp.tools, ...We.tools].find(Or => bl(Or, On))?.mcpInfo?.toolName ?? Mn.toolName;
                (async () => {
                  if (F.signal.aborted) {
                    return;
                  }
                  let Or = createAbortController();
                  let Y = () => Or.abort(F.signal.reason);
                  F.signal.addEventListener("abort", Y, {
                    once: true
                  });
                  try {
                    let Se = await XTo({
                      client: Un,
                      clientConnection: Un,
                      tool: Er,
                      args: lr ?? {},
                      imageLimits: iV,
                      signal: Or.signal,
                      setAppState: l,
                      requestDialog: undefined
                    });
                    if (F.signal.aborted) {
                      return;
                    }
                    if (Se.urlElicitationDeclined) {
                      Qn(ct, `URL elicitation required (open URL, then retry mcp_call): ${Se.urlElicitationDeclined.url}` + (typeof Se.content === "string" ? ` \u2014 ${Se.content}` : ""));
                    } else {
                      kn(ct, {
                        content: Se.content,
                        structuredContent: Se.structuredContent,
                        _meta: Se._meta
                      });
                    }
                  } catch (Se) {
                    if (F.signal.aborted) {
                      return;
                    }
                    if (Se instanceof G6e) {
                      xGn(Se.serverName, l);
                    }
                    let qe = Se instanceof Error ? Se.message : String(Se);
                    if (Se instanceof hht) {
                      qe = `MCP session expired for ${Mn.serverName} \u2014 send mcp_reconnect and retry mcp_call: ${qe}`;
                    } else if (Se instanceof yi && Se.code === Ei.UrlElicitationRequired) {
                      let Qe = JTo(Se).map(Ht => Ht.url);
                      qe = Qe.length > 0 ? `URL elicitation required (open URL, then retry mcp_call): ${Qe.join(", ")} \u2014 ${qe}` : `URL elicitation required (no URL in error data): ${qe}`;
                    }
                    Qn(ct, qe);
                  } finally {
                    F.signal.removeEventListener("abort", Y);
                  }
                })();
              }
            }
          } else if (ct.request.subtype === "mcp_toggle") {
            let On = a();
            let {
              serverName: lr,
              enabled: Mn
            } = ct.request;
            let Un = getMcpConfigByName(lr) ?? t.find(Er => Er.name === lr)?.config ?? pe.find(Er => Er.name === lr)?.config ?? We.clients.find(Er => Er.name === lr)?.config ?? On.mcp.clients.find(Er => Er.name === lr)?.config ?? null;
            if (!Un) {
              Qn(ct, `Server not found: ${lr}`);
            } else if (!Mn) {
              setMcpServerEnabled(lr, false);
              let Er = [...t, ...pe, ...We.clients, ...On.mcp.clients].find(Y => Y.name === lr);
              if (Er && Er.type === "connected") {
                await Ow(lr, Un);
              }
              let Or = uW(lr);
              l(Y => ({
                ...Y,
                mcp: {
                  ...Y.mcp,
                  clients: Y.mcp.clients.map(Se => Se.name === lr ? {
                    name: lr,
                    type: "disabled",
                    config: Un
                  } : Se),
                  tools: Y1p(Y.mcp.tools, Se => Se.name?.startsWith(Or)),
                  commands: Y1p(Y.mcp.commands, Se => u3(Se, lr)),
                  resources: Nwm(Y.mcp.resources, lr)
                }
              }));
              kn(ct);
            } else if (isMcpServerBlockedAtConnectTime(lr, Un)) {
              Qn(ct, `MCP server ${lr} is blocked by enterprise managed policy`);
            } else {
              setMcpServerEnabled(lr, true);
              let Er = await pQ(lr, Un);
              let Or = uW(lr);
              if (l(Y => ({
                ...Y,
                mcp: {
                  ...Y.mcp,
                  clients: Y.mcp.clients.map(Se => Se.name === lr ? Er.client : Se),
                  tools: [...Y1p(Y.mcp.tools, Se => Se.name?.startsWith(Or)), ...Er.tools],
                  commands: [...Y1p(Y.mcp.commands, Se => u3(Se, lr)), ...Er.commands],
                  resources: Er.resources && Er.resources.length > 0 ? {
                    ...Y.mcp.resources,
                    [lr]: Er.resources
                  } : Nwm(Y.mcp.resources, lr)
                }
              })), Er.client.type === "connected") {
                ke([Er.client]);
                Jns(Er.client);
                kn(ct);
              } else {
                let Y = Er.client.type === "failed" ? Er.client.error ?? "Connection failed" : `Server status: ${Er.client.type}`;
                Qn(ct, Y);
              }
            }
          } else if (ct.request.subtype === "set_mcp_permission_mode_override") {
            let {
              serverName: On,
              mode: lr
            } = ct.request;
            let Mn = Jqa(lr);
            if (!Mn.ok) {
              logForDebugging(`set_mcp_permission_mode_override: rejected mode='${Mn.rejected}' for ${On} (tighten-only)`, {
                level: "warn"
              });
              Qn(ct, `Permission mode override over the control channel is tighten-only ('default', 'auto', or null); rejected '${Mn.rejected}'`);
            } else if (Mn.override === "auto" && !isAutoModeGateEnabled()) {
              let Un = getAutoModeUnavailableReason();
              Qn(ct, Un ? `Cannot pin MCP server '${On}' to auto: ${getAutoModeUnavailableNotification(Un)}` : `Cannot pin MCP server '${On}' to auto`);
            } else {
              let Un = Mn.override;
              l(Or => {
                let Y = Or.toolPermissionContext.mcpPermissionModeOverrides;
                let Se = Un === undefined ? Nwm(Y, On) : {
                  ...Y,
                  [On]: Un
                };
                return {
                  ...Or,
                  toolPermissionContext: {
                    ...Or.toolPermissionContext,
                    mcpPermissionModeOverrides: Se
                  }
                };
              });
              let Er = t.some(Or => Or.name === On) || pe.some(Or => Or.name === On) || Object.prototype.hasOwnProperty.call(i, On) || We.clients.some(Or => Or.name === On) || a().mcp.clients.some(Or => Or.name === On) || getMcpConfigByName(On) !== null;
              kn(ct, Er ? undefined : {
                warning: Un === undefined ? `MCP server '${On}' is not known; no override was present to clear.` : `MCP server '${On}' is not yet known; override stored but will not apply until a server with that exact name connects.`
              });
            }
          } else if (ct.request.subtype === "channel_enable") {
            let On = a();
            z4f(ct.request_id, ct.request.serverName, [...On.mcp.clients, ...pe, ...We.clients], H);
          } else if (ct.request.subtype === "mcp_authenticate") {
            let {
              serverName: On,
              redirectUri: lr
            } = ct.request;
            let Mn = a();
            let Un = getMcpConfigByName(On) ?? t.find(Or => Or.name === On)?.config ?? Mn.mcp.clients.find(Or => Or.name === On)?.config ?? null;
            let Er = Un ? ZV(On, Un) : null;
            if (!Un || !Er) {
              Qn(ct, `Server not found: ${On}`);
            } else if (Er.kind === "claudeai-proxy") {
              let Or = aNe(Er.config);
              if (!Or) {
                Qn(ct, "Unable to build claude.ai connector auth URL (missing org or server id)");
              } else {
                logEvent("tengu_claudeai_mcp_auth_started", {});
                kn(ct, {
                  authUrl: Or,
                  requiresUserAction: true,
                  callbackExpected: false
                });
              }
            } else if (Er.kind === "unsupported-transport") {
              Qn(ct, `Server type "${Er.transport}" does not support OAuth authentication`);
            } else if (Er.kind === "anthropic-hosted") {
              Qn(ct, Er.message);
            } else {
              try {
                let Or = Nr => {
                  let pi;
                  let Dr = new Promise(nc => {
                    pi = nc;
                  });
                  let Us;
                  let oa;
                  let Du = dQ(On, Er.config, nc => pi(nc), undefined, {
                    skipBrowserOpen: true,
                    redirectUri: Nr,
                    onWaitingForCallback: (nc, ju, tm) => {
                      Us = ju;
                      oa = tm;
                    }
                  });
                  return {
                    oauthPromise: Du,
                    raced: Promise.race([Dr, Du.then(() => null)]).then(nc => ({
                      authUrl: nc,
                      callbackPort: Us,
                      state: oa
                    }))
                  };
                };
                let Y = Er.config.oauth?.clientId ? undefined : lr;
                let Se = "localhost";
                let qe = Or(Y);
                let Qe;
                if (Y) {
                  try {
                    Qe = await qe.raced;
                    Se = "custom";
                  } catch (Nr) {
                    logForDebugging(`[mcp_authenticate] AS rejected custom redirectUri for ${On}; falling back to localhost: ${he(Nr)}`);
                    qe = Or();
                    Qe = await qe.raced;
                  }
                } else {
                  Qe = await qe.raced;
                }
                let Ht = qe.oauthPromise;
                let {
                  authUrl: nn,
                  callbackPort: qn,
                  state: zr
                } = Qe;
                if (nn) {
                  kn(ct, {
                    authUrl: nn,
                    requiresUserAction: true,
                    callbackExpected: true,
                    redirectScheme: Se,
                    state: zr,
                    ...(Se === "localhost" && {
                      callbackPort: qn
                    })
                  });
                } else {
                  kn(ct, {
                    requiresUserAction: false,
                    callbackExpected: false
                  });
                }
                Os.set(On, Ht);
                Xft(On, Ht);
                let wo = Ht.then(async () => {
                  if (isMcpServerDisabled(On)) {
                    return;
                  }
                  if (isMcpServerBlockedAtConnectTime(On, Un)) {
                    logForDebugging(`MCP server ${On} blocked by managed policy after OAuth \u2014 skipping reconnect`, {
                      level: "warn"
                    });
                    return;
                  }
                  if ((0).vZc(On)) {
                    return;
                  }
                  let Nr = await pQ(On, Un);
                  let pi = uW(On);
                  l(Dr => ({
                    ...Dr,
                    mcp: {
                      ...Dr.mcp,
                      clients: Dr.mcp.clients.map(Us => Us.name === On ? Nr.client : Us),
                      tools: [...Y1p(Dr.mcp.tools, Us => Us.name?.startsWith(pi)), ...Nr.tools],
                      commands: [...Y1p(Dr.mcp.commands, Us => u3(Us, On)), ...Nr.commands],
                      resources: Nr.resources && Nr.resources.length > 0 ? {
                        ...Dr.mcp.resources,
                        [On]: Nr.resources
                      } : Nwm(Dr.mcp.resources, On)
                    }
                  }));
                  We = {
                    ...We,
                    clients: [...We.clients.filter(Dr => Dr.name !== On), Nr.client],
                    tools: [...We.tools.filter(Dr => !Dr.name?.startsWith(pi)), ...Nr.tools]
                  };
                }).catch(Nr => {
                  logForDebugging(`MCP OAuth failed for ${On}: ${Nr}`, {
                    level: "error"
                  });
                }).finally(() => {
                  if (Os.get(On) === Ht) {
                    (0).delete(On);
                    Os.delete(On);
                  }
                });
              } catch (Or) {
                Qn(ct, he(Or));
              }
            }
          } else if (ct.request.subtype === "mcp_oauth_callback_url") {
            let {
              serverName: On,
              callbackUrl: lr
            } = ct.request;
            let Mn = Jft(On);
            if (Mn) {
              let Un = false;
              try {
                let Er = new URL(lr);
                Un = Er.searchParams.vZc("code") || Er.searchParams.vZc("error");
              } catch {}
              if (!Un) {
                Qn(ct, "Invalid callback URL: missing authorization code. Please paste the full redirect URL including the code parameter.");
              } else {
                (0).add(On);
                Mn(lr);
                let Er = Os.get(On) ?? Qft(On);
                if (Er) {
                  try {
                    await Er;
                    kn(ct);
                  } catch (Or) {
                    Qn(ct, Or instanceof Error ? Or.message : "OAuth authentication failed");
                  }
                } else {
                  kn(ct);
                }
              }
            } else {
              Qn(ct, `No active OAuth flow for server: ${On}`);
            }
          } else if (ct.request.subtype === "claude_authenticate") {
            let {
              loginWithClaudeAi: On
            } = ct.request;
            Kn?.service.cleanup();
            logEvent("tengu_oauth_flow_start", {
              loginWithClaudeAi: On ?? true
            });
            let lr = new Rz();
            let Mn;
            let Un = new Promise(Or => {
              Mn = Or;
            });
            let Er = lr.startOAuthFlow(async (Or, Y) => {
              Mn({
                manualUrl: Or,
                automaticUrl: Y
              });
            }, {
              loginWithClaudeAi: On ?? true,
              skipBrowserOpen: true
            }).then(async Or => {
              await installOAuthTokens(Or);
              logEvent("tengu_oauth_success", {
                loginWithClaudeAi: On ?? true
              });
            }).finally(() => {
              if (lr.cleanup(), Kn?.service === lr) {
                Kn = null;
              }
            });
            Kn = {
              service: lr,
              flow: Er
            };
            Er.catch(Or => logForDebugging(`claude_authenticate flow ended: ${Or}`, {
              level: "info"
            }));
            try {
              let {
                manualUrl: Or,
                automaticUrl: Y
              } = await Promise.race([Un, Er.then(() => {
                throw Error("OAuth flow completed without producing auth URLs");
              })]);
              kn(ct, {
                manualUrl: Or,
                automaticUrl: Y
              });
            } catch (Or) {
              Qn(ct, he(Or));
            }
          } else if (ct.request.subtype === "claude_oauth_callback" || ct.request.subtype === "claude_oauth_wait_for_completion") {
            if (!Kn) {
              Qn(ct, "No active claude_authenticate flow");
            } else {
              if (ct.request.subtype === "claude_oauth_callback") {
                Kn.service.handleManualAuthCodeInput({
                  authorizationCode: ct.request.authorizationCode,
                  state: ct.request.state
                });
              }
              let {
                flow: On
              } = Kn;
              On.then(() => {
                let lr = getAccountInformation();
                kn(ct, {
                  account: {
                    email: lr?.email,
                    organization: lr?.organization,
                    subscriptionType: lr?.subscription,
                    tokenSource: lr?.tokenSource,
                    apiKeySource: lr?.apiKeySource,
                    apiProvider: getAPIProvider()
                  }
                });
              }, lr => Qn(ct, he(lr)));
            }
          } else if (ct.request.subtype === "mcp_clear_auth") {
            let {
              serverName: On
            } = ct.request;
            let lr = a();
            let Mn = getMcpConfigByName(On) ?? t.find(Un => Un.name === On)?.config ?? lr.mcp.clients.find(Un => Un.name === On)?.config ?? null;
            if (!Mn) {
              Qn(ct, `Server not found: ${On}`);
            } else if (Mn.type !== "sse" && Mn.type !== "http") {
              Qn(ct, `Cannot clear auth for server type "${Mn.type}"`);
            } else if (isMcpServerBlockedAtConnectTime(On, Mn)) {
              Qn(ct, `MCP server ${On} is blocked by enterprise managed policy`);
            } else {
              await yEe(On, Mn);
              let Un = await pQ(On, Mn);
              let Er = uW(On);
              l(Or => ({
                ...Or,
                mcp: {
                  ...Or.mcp,
                  clients: Or.mcp.clients.map(Y => Y.name === On ? Un.client : Y),
                  tools: [...Y1p(Or.mcp.tools, Y => Y.name?.startsWith(Er)), ...Un.tools],
                  commands: [...Y1p(Or.mcp.commands, Y => u3(Y, On)), ...Un.commands],
                  resources: Un.resources && Un.resources.length > 0 ? {
                    ...Or.mcp.resources,
                    [On]: Un.resources
                  } : Nwm(Or.mcp.resources, On)
                }
              }));
              kn(ct, {});
            }
          } else if (ct.request.subtype === "apply_flag_settings") {
            let On = getMainLoopModel();
            let lr = getFlagSettingsInline() ?? {};
            let Mn = ct.request.settings;
            if ("agent" in Mn) {
              let Ht = r6c({
                requestedAgent: Mn.agent,
                agents: ht,
                systemPrompt: d.systemPrompt,
                preAgentSystemPrompt: It
              });
              if (!Ht.ok) {
                Qn(ct, Ht.error);
                continue;
              }
              d.systemPrompt = Ht.systemPrompt;
              It = Ht.preAgentSystemPrompt;
              let nn = Ht.agentDefinition?.agentType;
              l(qn => qn.agent === nn ? qn : {
                ...qn,
                agent: nn
              });
            }
            let Un = {
              ...lr,
              ...Mn
            };
            for (let Ht of Object.keys(Un)) {
              if (Un[Ht] === null) {
                delete Un[Ht];
              }
            }
            if (setFlagSettingsInline(Un), fM.notifyChange("flagSettings"), "viewMode" in Mn) {
              R$t();
            }
            let Er = "model" in Mn && Mn.model != null && String(Mn.model).trim().toLowerCase() !== "default" && !isExemptDefaultResolvingPick(String(Mn.model)) && !(isModelAllowedUnderActiveEnforcement(String(Mn.model)) ?? isModelAllowed(String(Mn.model)));
            let Or = "model" in Mn && Mn.model != null ? String(Mn.model).trim().toLowerCase() === "default" ? getDefaultMainLoopModel() : String(Mn.model) : null;
            if ("model" in Mn && !Er) {
              setMainLoopModelOverride(Or);
            }
            let Y = "model" in Mn && !Er && Mn.model != null && Or != null ? Or : undefined;
            let Se = getMainLoopModel();
            let qe = Y !== undefined && Se === On && parseUserSpecifiedModel(Y) !== parseUserSpecifiedModel(On);
            let Qe = resolveDefaultPickRepoint(Mn, be, Se);
            if (Qe !== undefined) {
              be = Qe;
            }
            if (Se !== On || qe) {
              let Ht = qe ? parseUserSpecifiedModel(Y) : Se;
              be = qe ? Y : Se;
              l(qn => ({
                ...qn,
                mainLoopModelForSession: Ht
              }));
              let nn = Mn.model && !Er ? String(Mn.model) : "model" in Mn && !Er ? "default" : Se;
              e.sessionState.notifyMetadataChanged({
                model: Se
              });
              Te(nn, Se);
            }
            if ("model" in Mn) {
              if (Mn.model == null) {
                le();
              } else if (Er) {
                ce(String(Mn.model), be !== undefined && (isExemptDefaultResolvingPick(be) || isModelAllowed(be)) ? parseUserSpecifiedModel(be) : undefined);
              } else {
                le();
              }
            }
            if ("effortLevel" in Mn) {
              let Ht = Mn.effortLevel == null ? undefined : L2(Mn.effortLevel);
              if (Mn.effortLevel == null || Ht !== undefined) {
                l(nn => nn.effortValue === Ht ? nn : {
                  ...nn,
                  effortValue: Ht
                });
                eq();
              }
              e.sessionState.notifyMetadataChanged({
                effort_level: Mn.effortLevel == null ? null : String(Mn.effortLevel)
              });
            }
            if ("ultracode" in Mn) {
              let Ht = Mn.ultracode === true;
              if (l(nn => {
                if (nn.ultracode === Ht && (!Ht || nn.effortValue === "xhigh")) {
                  return nn;
                }
                return {
                  ...nn,
                  ultracode: Ht,
                  effortValue: Ht ? "xhigh" : nn.effortValue
                };
              }), Ht) {
                eq();
              }
            }
            kn(ct);
          } else if (ct.request.subtype === "get_settings") {
            let On = a();
            let lr = getMainLoopModel();
            let Mn = sx(lr) ? RJ(lr, On.effortValue) : undefined;
            let Un = getSettingsWithSources();
            let Er = getSettingsWithErrors().errors.filter(Or => Or.severity !== "warning").map(Or => ({
              file: Or.file,
              path: Or.path,
              message: Or.message
            }));
            kn(ct, {
              ...Un,
              applied: {
                model: lr,
                effort: typeof Mn === "string" ? Mn : null,
                advisor: XHn(On.advisorModel, lr) ?? null,
                ultracode: Jne(lr, On.effortValue, On.ultracode)
              },
              errors: Er.length > 0 ? Er : undefined
            });
          } else if (ct.request.subtype === "stop_task") {
            let {
              task_id: On
            } = ct.request;
            try {
              await iEt(On, {
                taskRegistry: DO(a, l),
                setAppState: l,
                getAppState: a,
                source: "user"
              });
              kn(ct, {});
            } catch (lr) {
              if (lr instanceof rFe && (lr.code === "not_found" || lr.code === "not_running")) {
                kn(ct, {});
              } else {
                Qn(ct, he(lr));
              }
            }
          } else if (ct.request.subtype === "background_tasks") {
            try {
              let On = DO(a, l);
              let lr = ct.request.tool_use_id;
              if (lr) {
                let Mn = Djn(lr, On);
                kn(ct, {
                  backgrounded: Mn
                });
              } else {
                QDe(On);
                kn(ct, {});
              }
            } catch (On) {
              Qn(ct, he(On));
            }
          } else if (ct.request.subtype === "generate_session_title") {
            let {
              description: On,
              persist: lr
            } = ct.request;
            if (lr) {
              Ln = true;
            }
            let Mn = (L && !L.signal.aborted ? L : createAbortController()).signal;
            (async () => {
              try {
                let Un = await Sie(On, Mn);
                if (Un && lr) {
                  try {
                    saveAiGeneratedTitle(getSessionId(), Un);
                  } catch (Er) {
                    if (Io(Er)) {
                      logForDebugging(`saveAiGeneratedTitle failed: ${Er}`);
                    } else {
                      Oe(Er);
                    }
                  }
                  IWo(Un);
                }
                kn(ct, {
                  title: Un
                });
              } catch (Un) {
                Qn(ct, he(Un));
              }
            })();
          } else if (ct.request.subtype === "rename_session") {
            try {
              let On = ct.request.title.trim();
              if (!On) {
                Qn(ct, "title must be non-empty");
              } else {
                if (getMaterializedSessionFile()) {
                  await saveCustomTitle(getSessionId(), On, undefined, "remote");
                } else {
                  cacheSessionTitle(On);
                }
                Ln = true;
                kn(ct);
              }
            } catch (On) {
              Qn(ct, he(On));
            }
          } else if (ct.request.subtype === "submit_feedback") {
            let {
              description: On,
              surface: lr
            } = ct.request;
            (async () => {
              try {
                let Mn = ssr();
                if (Mn) {
                  kn(ct, {
                    feedback_id: null,
                    unavailable_reason: Mn
                  });
                  return;
                }
                let Un = await fvt({
                  messages: V,
                  description: On,
                  surface: lr ?? "sdk"
                });
                if (Un.success) {
                  let Er;
                  kn(ct, {
                    feedback_id: Un.feedbackId,
                    ccshare_url: Er
                  });
                } else {
                  kn(ct, {
                    feedback_id: null,
                    is_zdr_org: Un.isZdrOrg,
                    failure_reason: Un.failureReason,
                    status_code: Un.statusCode
                  });
                }
              } catch (Mn) {
                Qn(ct, he(Mn));
              }
            })();
          } else if (ct.request.subtype === "side_question") {
            if (isShuttingDown()) {
              Qn(ct, "Session is shutting down");
              continue;
            }
            let {
              question: On
            } = ct.request;
            let lr = createAbortController();
            gi.set(ct.request_id, lr);
            (async () => {
              try {
                let Mn = getLastCacheSafeParams();
                let Un = Mn ? {
                  ...Mn,
                  toolUseContext: {
                    ...Mn.toolUseContext,
                    abortController: createAbortController()
                  }
                } : await buildSideQuestionFallbackParams({
                  tools: wt(a()),
                  commands: [...Tt, ...a().mcp.commands],
                  mcpClients: [...a().mcp.clients, ...pe, ...We.clients],
                  messages: V,
                  readFileState: J,
                  getAppState: a,
                  setAppState: l,
                  customSystemPrompt: yt(),
                  appendSystemPrompt: d.appendSystemPrompt,
                  excludeDynamicSections: d.excludeDynamicSections,
                  thinkingConfig: me,
                  agents: ht
                });
                Ks(ct, {
                  status: "started"
                });
                let Er = await runSideQuestion({
                  question: On,
                  cacheSafeParams: Un,
                  parentController: lr,
                  onRetry: Or => Ks(ct, {
                    status: "api_retry",
                    attempt: Or.retryAttempt,
                    max_retries: Or.maxRetries,
                    retry_delay_ms: Or.retryInMs,
                    error_status: Or.status ?? null
                  }),
                  threadHistory: false
                });
                if (Er.aborted || lr.signal.aborted) {
                  logEvent("tengu_sdk_side_question_cancelled", {});
                  Qn(ct, "Side question cancelled");
                } else {
                  kn(ct, {
                    response: Er.response,
                    synthetic: Er.synthetic
                  });
                }
              } catch (Mn) {
                Qn(ct, he(Mn));
              } finally {
                if (gi.get(ct.request_id) === lr) {
                  gi.delete(ct.request_id);
                }
              }
            })();
          } else if (ct.request.subtype === "ultrareview_launch") {
            let {
              args: On = "",
              confirm: lr = false
            } = ct.request;
            (async () => {
              try {
                let Mn = await runUltrareviewHeadless(On, {
                  confirm: lr,
                  context: {
                    abortController: createAbortController(),
                    taskRegistry: DO(a, l)
                  }
                });
                if (Mn.status === "launched") {
                  let Un = [In({
                    content: `<command-name>/ultrareview${On ? " " + On : ""}</command-name>`,
                    isMeta: true
                  }), In({
                    content: `<${"local-command-stdout"}>${Mn.message}</${"local-command-stdout"}>`,
                    isMeta: true
                  })];
                  V.push(...Un);
                  for (let Er of Un) {
                    H.enqueue({
                      type: "user",
                      message: Er.message,
                      session_id: getSessionId(),
                      parent_tool_use_id: null,
                      uuid: Er.uuid,
                      timestamp: Er.timestamp,
                      isReplay: true
                    });
                  }
                }
                kn(ct, Mn);
              } catch (Mn) {
                Qn(ct, he(Mn));
              }
            })();
          } else if (ct.request.subtype === "message_rated") {
            if (isPolicyAllowed("allow_product_feedback")) {
              let {
                messageUuid: On,
                sentiment: lr,
                surface: Mn = "tool_use",
                cleared: Un = false
              } = ct.request;
              logEvent("tengu_message_rated", {
                message_uuid: br(On),
                sentiment: lr,
                surface: Mn,
                cleared: Un
              });
            }
            kn(ct, {});
          } else if (ct.request.subtype === "remote_control") {
            if (ct.request.enabled) {
              if (gt && Ft) {
                e.setOnControlRequestSent(undefined);
                e.setOnControlRequestResolved(undefined);
                await gt.teardown();
                gt = null;
                Ft = false;
              }
              if (gt) {
                kn(ct, {
                  session_url: wS(gt.bridgeSessionId, gt.sessionIngressUrl),
                  connect_url: eKt(gt.environmentId, gt.sessionIngressUrl),
                  environment_id: gt.environmentId
                });
              } else {
                let On;
                try {
                  let {
                    initReplBridge: lr
                  } = await Promise.resolve().then(() => (qJo(), jJo));
                  let Mn = await lr({
                    tags: ["remote-control-sdk"],
                    getTools: () => wt(a()),
                    getToolPermissionContext: () => a().toolPermissionContext,
                    async onInboundMessage(Un) {
                      let Er = on;
                      let Or;
                      on = new Promise(Y => {
                        Or = Y;
                      });
                      try {
                        let Y = Yfr(Un);
                        if (!Y) {
                          return;
                        }
                        let {
                          uuid: Se
                        } = Y;
                        let qe = undefined;
                        let Qe = mrn(qe, Y.clientPlatform);
                        await Er;
                        let Ht = extractInboundAttachments(Un);
                        let nn = await resolveAndPrepend(Un, Y.content);
                        __({
                          value: nn,
                          mode: "prompt",
                          agentId: mainAgentId(),
                          uuid: Se,
                          skipSlashCommands: true,
                          ...(Ht.length > 0 && {
                            fileAttachments: Ht
                          }),
                          ...(qe?.kind === "peer" ? {
                            origin: qe,
                            isMeta: true,
                            ...(grn() && {
                              priority: "later"
                            })
                          } : {
                            bridgeOrigin: true,
                            clientPlatform: Y.clientPlatform,
                            ...(Qe && {
                              origin: Qe
                            }),
                            ...(Qe?.kind === "task-notification" && drn(undefined, Y.clientPlatform) === "later" && {
                              priority: "later"
                            }),
                            ...(prn(Y.clientPlatform, Y.inboundOrigin) && {
                              priority: frn(undefined, Y.content, hrn()),
                              verifiedSlackHumanTurn: true
                            })
                          })
                        });
                        Fr();
                      } catch (Y) {
                        logForDebugging(`[bridge:sdk] onInboundMessage failed: ${Y}`, {
                          level: "error"
                        });
                      } finally {
                        Er.then(Or, Or);
                      }
                    },
                    onPermissionResponse(Un) {
                      e.injectControlResponse(Un);
                      return true;
                    },
                    onInterrupt() {
                      L?.abort();
                    },
                    onSetModel(Un) {
                      let Er = Un == null || Un.trim().toLowerCase() === "default";
                      let Or = Er ? getDefaultMainLoopModel() : Un;
                      if (!Er && !isExemptDefaultResolvingPick(Or) && !(isModelAllowedUnderActiveEnforcement(Or) ?? isModelAllowed(Or))) {
                        let Y = be !== undefined && (isExemptDefaultResolvingPick(be) || isModelAllowed(be)) ? parseUserSpecifiedModel(be) : undefined;
                        ce(Or, Y);
                        return {
                          ok: false,
                          error: wse(Or, Y ?? getMainLoopModel())
                        };
                      }
                      be = Or;
                      setMainLoopModelOverride(Or);
                      l(Y => ({
                        ...Y,
                        mainLoopModelForSession: Or ?? null
                      }));
                      le();
                    },
                    onSetMaxThinkingTokens(Un, Er) {
                      if (Er !== undefined) {
                        fe = Er ?? undefined;
                        setThinkingDisplayExplicit(Er !== null);
                      }
                      me = J6c(Un, fe);
                    },
                    onStateChange(Un, Er) {
                      if (Un === "failed") {
                        if (On = Er, gt) {
                          Ft = true;
                          setReplBridgeActive(false);
                        }
                      } else if (Un === "connected" || Un === "ready") {
                        if (Ft = false, gt) {
                          setReplBridgeActive(true);
                        }
                      }
                      logForDebugging(`[bridge:sdk] State change: ${Un}${Er ? ` \u2014 ${Er}` : ""}`);
                      H.enqueue({
                        type: "system",
                        subtype: "bridge_state",
                        state: Un,
                        detail: Er,
                        uuid: Kx.randomUUID(),
                        session_id: getSessionId()
                      });
                    },
                    initialMessages: V.length > 0 ? V : undefined,
                    initialName: ct.request.name
                  });
                  if (!Mn) {
                    Qn(ct, On ?? "Remote Control initialization failed");
                  } else {
                    gt = Mn;
                    Ft = false;
                    setReplBridgeActive(true);
                    rn = V.length;
                    e.setOnControlRequestSent(Un => {
                      Mn.sendControlRequest(Un);
                    });
                    e.setOnControlRequestResolved(Un => {
                      Mn.sendControlCancelRequest(Un);
                    });
                    kn(ct, {
                      session_url: wS(Mn.bridgeSessionId, Mn.sessionIngressUrl),
                      connect_url: eKt(Mn.environmentId, Mn.sessionIngressUrl),
                      environment_id: Mn.environmentId
                    });
                  }
                } catch (lr) {
                  Qn(ct, he(lr));
                }
              }
            } else {
              if (gt) {
                e.setOnControlRequestSent(undefined);
                e.setOnControlRequestResolved(undefined);
                await gt.teardown({
                  reason: "remote_control_disabled"
                });
                gt = null;
                Ft = false;
                setReplBridgeActive(false);
              }
              kn(ct);
            }
          } else {
            Qn(ct, `Unsupported control request subtype: ${ct.request.subtype}`);
          }
          continue;
        } else if (ct.type === "control_response") {
          if (d.replayUserMessages) {
            H.enqueue(ct);
          }
          continue;
        } else if (ct.type === "control_cancel_request") {
          let On = gi.get(ct.request_id);
          logEvent("tengu_sdk_control_cancel_request", {
            in_flight: Boolean(On)
          });
          On?.abort(userAbortReason("remote-cancel"));
          continue;
        } else if (ct.type === "keep_alive") {
          continue;
        } else if (ct.type === "update_environment_variables") {
          continue;
        } else if (ct.type === "assistant" || ct.type === "system") {
          let On = Fcr([ct]);
          if (V.push(...On), ct.type === "assistant" && d.replayUserMessages) {
            H.enqueue(ct);
          }
          continue;
        }
        if (ct.type === "bash_command") {
          let On = getSessionId();
          if (ct.uuid) {
            if (Isn.vZc(ct.uuid)) {
              logForDebugging(`Skipping duplicate bash_command message: ${ct.uuid}`);
              continue;
            }
            z6c(ct.uuid);
          }
          if (typeof ct.command !== "string") {
            if (H.enqueue({
              type: "user",
              message: {
                role: "user",
                content: `<${"bash-stderr"}>Command failed: missing command</${"bash-stderr"}>`
              },
              session_id: On,
              parent_tool_use_id: null,
              uuid: Kx.randomUUID(),
              timestamp: new Date().toISOString(),
              isReplay: true
            }), ct.uuid) {
              e.onCommandLifecycle?.(ct.uuid, "completed");
            }
            continue;
          }
          H.enqueue({
            type: "user",
            message: {
              role: "user",
              content: `<${"bash-input"}>${$a(ct.command)}</${"bash-input"}>`
            },
            session_id: On,
            parent_tool_use_id: null,
            uuid: Kx.randomUUID(),
            timestamp: new Date().toISOString(),
            isReplay: true
          });
          let lr = (async () => {
            try {
              let {
                runHeadlessBashCommand: Mn
              } = await Promise.resolve().then(() => (j6c(), H6c));
              let Un = await Mn({
                command: ct.command,
                cwd: ct.cwd,
                abortSignal: F.signal
              });
              H.enqueue({
                type: "user",
                message: {
                  role: "user",
                  content: Un.outputText
                },
                session_id: On,
                parent_tool_use_id: null,
                uuid: Un.outputUuid,
                timestamp: new Date().toISOString(),
                isReplay: true
              });
            } catch (Mn) {
              Oe(Mn);
              H.enqueue({
                type: "user",
                message: {
                  role: "user",
                  content: `<${"bash-stderr"}>Command failed: ${$a(he(Mn))}</${"bash-stderr"}>`
                },
                session_id: On,
                parent_tool_use_id: null,
                uuid: Kx.randomUUID(),
                timestamp: new Date().toISOString(),
                isReplay: true
              });
            }
            if (ct.uuid) {
              e.onCommandLifecycle?.(ct.uuid, "completed");
            }
          })();
          N.add(lr);
          lr.finally(() => N.delete(lr));
          continue;
        }
        if (ct.type !== "user") {
          continue;
        }
        if (sn = true, ct.uuid) {
          let On = getSessionId();
          let lr = await doesMessageExistInSession(On, ct.uuid);
          let Mn = Isn.vZc(ct.uuid);
          if (lr || Mn) {
            if (wn("info", "cli_user_message_dedup_skipped", {
              exists_in_session: lr,
              runtime_dup: Mn
            }), logForDebugging(`Skipping duplicate user message: ${ct.uuid}`), d.replayUserMessages) {
              logForDebugging(`Sending acknowledgment for duplicate user message: ${ct.uuid}`);
              let Un = extractInboundAttachments(ct);
              H.enqueue({
                type: "user",
                message: ct.message,
                session_id: On,
                parent_tool_use_id: null,
                uuid: ct.uuid,
                timestamp: ct.timestamp,
                isReplay: true,
                ...(Un.length > 0 && {
                  file_attachments: Un
                })
              });
            }
            if (lr) {
              e.onCommandLifecycle?.(ct.uuid, "completed");
            }
            if (Ude()) {
              Fr();
            } else if (!g) {
              e.sessionState.notifyStateChanged("idle");
            }
            continue;
          }
          z6c(ct.uuid);
        }
        Is("new_user_message");
        let Vr = !(e instanceof tkt) ? ct.message.content : typeof ct.message.content === "string" ? Kfr(ct.message.content) : Array.isArray(ct.message.content) ? AJo(ct.message.content) : ct.message.content;
        let Xo = ct.client_platform;
        let qo = undefined;
        let ss = qo ? qo.kind === "peer" ? qo.from : undefined : hwc(Vr);
        let Ri = mrn(qo, Xo);
        let ya = qo ? mwc(ct.inbound_origin) : prn(Xo, ct.inbound_origin);
        if (!Ln && ct.shouldQuery !== false && !ss && !ct.isSynthetic && BG(Ri)) {
          let On = cZ(Vr);
          if (On && !IZ(On)) {
            Ln = true;
            let lr = getSessionId();
            if (!getCurrentSessionTitle(lr)) {
              let Mn = (L && !L.signal.aborted ? L : createAbortController()).signal;
              Sie(On, Mn).then(Un => {
                if (!Un) {
                  Ln = false;
                  return;
                }
                if (getCurrentSessionTitle(lr)) {
                  return;
                }
                saveAiGeneratedTitle(lr, Un);
                IWo(Un);
              }).catch(Un => {
                Ln = false;
                Oe(Un);
              });
            }
          }
        }
        let fs = extractInboundAttachments(ct);
        let tc = ss ? fwc(ct.priority, grn()) : Ri?.kind === "task-notification" ? drn(ct.priority, Xo, ct.inbound_origin) : ya ? frn(ct.priority, Vr, hrn()) : ct.priority;
        __({
          mode: "prompt",
          agentId: mainAgentId(),
          value: await resolveAndPrepend(ct, Vr),
          uuid: ct.uuid,
          priority: tc,
          shouldQuery: ct.shouldQuery,
          ...(ct.isSynthetic && {
            isMeta: true
          }),
          ...(fs.length > 0 && {
            fileAttachments: fs
          }),
          ...(ss ? {
            origin: qo?.kind === "peer" ? qo : {
              kind: "peer",
              from: ss
            },
            isMeta: true,
            skipSlashCommands: true
          } : {
            clientPlatform: Xo,
            ...(Ri && {
              origin: Ri
            }),
            ...(ya && {
              verifiedSlackHumanTurn: true
            })
          })
        });
        wn("info", "cli_user_message_enqueued", {
          has_uuid: ct.uuid !== undefined,
          should_query: ct.shouldQuery,
          has_priority: ct.priority !== undefined,
          queue_depth: Umo()
        });
        Fr();
      }
      if (wn("info", "cli_message_loop_ended"), k = true, F.abort(), _r?.stop(), !g) {
        if (W.inflightPromise) {
          let ct = setTimeout(Br => Br?.abort(), 30000, W.abortController);
          try {
            await W.inflightPromise;
          } finally {
            clearTimeout(ct);
          }
        }
        if (W.abortController?.abort(), W.abortController = null, N.size > 0) {
          await Promise.allSettled(N);
        }
        await K2o();
        To();
        j?.();
        wDe.delete(z);
        await ZTo([...a().mcp.clients, ...pe, ...We.clients]);
        b5e(null);
        for (let ct of VX()) {
          H.enqueue(ct);
        }
        H.done();
      }
    })();
    return H;
  }
  async function waitForPendingMcpBeforeFirstCommand(e, t = 2000, n = false) {
    let r = process.env.CLAUDE_CODE_ENTRYPOINT === "remote_baku";
    let o = P1() && CX(getMainLoopModel());
    let s = p => p.type === "pending" && (!r || B5t(p.config)) && (!o || p.config.alwaysLoad === true);
    let i = e().mcp;
    let a = Bn(i.clients, p => p.type === "pending");
    let l = Bn(i.clients, s);
    let c = i.tools.length;
    let u = 0;
    if (l > 0) {
      let p = Date.now();
      let m = p + t;
      while (Date.now() < m) {
        if (!e().mcp.clients.some(s)) {
          break;
        }
        await sleep(50);
      }
      u = Date.now() - p;
    }
    if (n) {
      return;
    }
    let d = e().mcp;
    logEvent("tengu_headless_mcp_prewait", {
      localOnly: r,
      willDeferMcp: o,
      pendingBefore: a,
      pendingWaitedBefore: l,
      toolsBefore: c,
      waitedMs: u,
      pendingAfter: Bn(d.clients, p => p.type === "pending"),
      pendingWaitedAfter: Bn(d.clients, s),
      toolsAfter: d.tools.length,
      mcpNonBlocking: getMcpConnectNonBlocking()
    });
  }
  function createCanUseToolWithPermissionPrompt(e) {
    let t = async (n, r, o, s, i, a) => {
      let l = a ?? (await hasPermissionsToUseTool(n, r, o, s, i));
      if (l.behavior === "allow" || l.behavior === "deny") {
        return l;
      }
      let c = l.updatedInput ?? r;
      let {
        signal: u,
        cleanup: d
      } = jO(o.abortController.signal);
      if (u.aborted) {
        d();
        return {
          behavior: "deny",
          message: "Permission prompt was aborted.",
          decisionReason: {
            type: "permissionPromptTool",
            permissionPromptToolName: n.name,
            toolResult: undefined
          }
        };
      }
      let p = new Promise(y => {
        u.addEventListener("abort", () => y("aborted"), {
          once: true
        });
      });
      let m = e.call({
        tool_name: n.name,
        input: c,
        tool_use_id: i
      }, o, t, s);
      let f = await Promise.race([m, p]);
      if (d(), f === "aborted" || u.aborted) {
        return {
          behavior: "deny",
          message: "Permission prompt was aborted.",
          decisionReason: {
            type: "permissionPromptTool",
            permissionPromptToolName: n.name,
            toolResult: undefined
          }
        };
      }
      let h = f;
      let g = e.mapToolResultToToolResultBlockParam(h.data, "1");
      if (!g.content || !Array.isArray(g.content) || !g.content[0] || g.content[0].type !== "text" || typeof g.content[0].text !== "string") {
        throw Error('Permission prompt tool returned an invalid result. Expected a single text block param with type="text" and a string text value.');
      }
      return Zxt(Esn().parse(Ba(g.content[0].text)), e, c, o);
    };
    return t;
  }
  function getCanUseToolFn(e, t, n, r) {
    if (e === "stdio") {
      return t.createCanUseTool(r);
    }
    if (!e) {
      return async (s, i, a, l, c, u) => u ?? (await hasPermissionsToUseTool(s, i, a, l, c));
    }
    let o = null;
    return async (s, i, a, l, c, u) => {
      if (!o) {
        let d = n();
        let p = d.find(m => bl(m, e));
        if (!p) {
          let m = `Error: MCP tool ${e} (passed via --permission-prompt-tool) not found. Available MCP tools: ${d.map(f => f.name).join(", ") || "none"}`;
          throw process.stderr.write(`${m}
`), gracefulShutdownSync(1), Error(m);
        }
        if (!p.inputJSONSchema) {
          let m = `Error: tool ${e} (passed via --permission-prompt-tool) must be an MCP tool`;
          throw process.stderr.write(`${m}
`), gracefulShutdownSync(1), Error(m);
        }
        o = createCanUseToolWithPermissionPrompt(p);
      }
      return o(s, i, a, l, c, u);
    };
  }
  function W4f(e) {
    return Array.isArray(e) && e.length === 1 && e[0] === "";
  }
  async function G4f(e, t, n, r, o, s, i, a, l, c, u, d, p) {
    let m;
    if (n) {
      let h = a.getPendingPermissionRequests();
      let g = a.getPendingUserDialogRequests();
      logEvent("tengu_reinit_pending_redelivery", {
        n_pending_permissions: String(h.length),
        n_pending_dialogs: String(g.length)
      });
      r.enqueue({
        type: "control_response",
        response: {
          subtype: "success",
          request_id: t,
          response: await K6c(o, u, s, i, d, c.userSpecifiedModel),
          pending_permission_requests: h,
          pending_user_dialog_requests: g
        }
      });
      return {};
    }
    if (e.systemPrompt !== undefined) {
      c.systemPrompt = W4f(e.systemPrompt) ? "" : e.systemPrompt;
    }
    if (e.supportedDialogKinds !== undefined) {
      let h = TCe(e.supportedDialogKinds);
      setSdkSupportedDialogKinds(h, isRestartedWorkerEpoch(Me.CLAUDE_CODE_WORKER_EPOCH) ? "attach_time" : "create_time");
      a.sessionState.notifyInternalMetadataChanged({
        declared_dialog_kinds: h
      });
    }
    if (e.appendSystemPrompt !== undefined) {
      c.appendSystemPrompt = e.appendSystemPrompt;
    }
    if (e.planModeInstructions !== undefined) {
      c.planModeInstructions = e.planModeInstructions;
    }
    if (e.appendSubagentSystemPrompt !== undefined) {
      c.appendSubagentSystemPrompt = e.appendSubagentSystemPrompt;
    }
    if (e.toolAliases !== undefined) {
      c.toolAliases = e.toolAliases;
      p(h => ({
        ...h,
        toolPermissionContext: {
          ...h.toolPermissionContext,
          toolAliases: e.toolAliases
        }
      }));
    }
    if (e.excludeDynamicSections !== undefined) {
      c.excludeDynamicSections = e.excludeDynamicSections;
    }
    if (e.promptSuggestions !== undefined) {
      c.promptSuggestions = e.promptSuggestions;
    }
    if (e.forwardSubagentText !== undefined) {
      c.forwardSubagentText = e.forwardSubagentText;
    }
    if (e.skills !== undefined) {
      setSessionSkillAllowlist(e.skills);
    }
    if (e.agents) {
      let h = parseAgentsFromJson(e.agents, "flagSettings");
      u.push(...h);
    }
    if (c.agent) {
      let h = getMainThreadAgentType() === c.agent;
      let g = u.find(y => y.agentType === c.agent);
      if (g && !h) {
        if (setMainThreadAgentType(g.agentType), zBe(g), !c.systemPrompt && !isBuiltInAgent(g)) {
          let y = g.getSystemPrompt();
          if (y) {
            c.systemPrompt = y;
          }
        }
        if (!c.userSpecifiedModel && g.model && g.model !== "inherit") {
          let y = parseUserSpecifiedModel(g.model);
          if (isExemptDefaultResolvingPick(y) || isModelAllowed(y)) {
            setMainLoopModelOverride(y);
          } else {
            m = g.model;
          }
        }
        if (g.initialPrompt) {
          a.prependUserMessage(g.initialPrompt);
        }
      } else if (g?.initialPrompt) {
        a.prependUserMessage(g.initialPrompt);
      }
    }
    if (e.hooks) {
      let h = {};
      for (let [g, y] of Object.entries(e.hooks)) {
        h[g] = y.map(_ => {
          let b = _.hookCallbackIds.map(S => a.createHookCallback(S, _.timeout));
          return {
            matcher: _.matcher,
            hooks: b
          };
        });
      }
      registerHookCallbacks(h);
    }
    if (e.jsonSchema) {
      setInitJsonSchema(e.jsonSchema);
    }
    r.enqueue({
      type: "control_response",
      response: {
        subtype: "success",
        request_id: t,
        response: await K6c(o, u, s, i, d, c.userSpecifiedModel)
      }
    });
    let f = d().mcp;
    if (logEvent("tengu_sdk_init_handshake", {
      uptime_ms: Math.round(process.uptime() * 1000),
      mcp_client_count: f.clients.length,
      mcp_pending_count: Bn(f.clients, h => h.type === "pending"),
      mcpNonBlocking: getMcpConnectNonBlocking(),
      session_mirror: !!c.sessionMirror
    }), l) {
      let g = KD.getInstance().getStatus();
      if (g) {
        r.enqueue({
          type: "auth_status",
          isAuthenticating: g.isAuthenticating,
          output: g.output,
          error: g.error,
          uuid: Kx.randomUUID(),
          session_id: getSessionId()
        });
      }
    }
    return {
      restrictedAgentModel: m
    };
  }
  async function K6c(e, t, n, r, o, s) {
    let a = getInitialSettings()?.outputStyle || "default";
    let l = await Avt(Nt());
    let c = getAccountInformation();
    let u = {
      commands: e.filter(d => d.userInvocable !== false).map(d => ({
        name: getCommandName(d),
        description: formatDescriptionWithSource(d),
        argumentHint: d.argumentHint || "",
        aliases: d.aliases?.length ? d.aliases : undefined
      })),
      agents: t.map(d => ({
        name: d.agentType,
        description: d.whenToUse,
        model: d.model === "inherit" ? undefined : d.model
      })),
      output_style: a,
      available_output_styles: Object.keys(l),
      models: n,
      ...(r.length > 0 && {
        unavailable_models: r
      }),
      account: {
        email: c?.email,
        organization: c?.organization,
        subscriptionType: c?.subscription,
        tokenSource: c?.tokenSource,
        apiKeySource: c?.apiKeySource,
        apiProvider: getAPIProvider()
      },
      pid: process.pid,
      feedback_survey_config: Z5c()
    };
    if (lc() && zA()) {
      let d = o();
      u.fast_mode_state = u2(s ?? null, d.fastMode);
    }
    return u;
  }
  async function h8c(e, t, n) {
    if (!fileHistoryEnabled()) {
      return {
        canRewind: false,
        error: "File rewinding is not enabled."
      };
    }
    if (!fileHistoryCanRestore(t.fileHistory, e)) {
      return {
        canRewind: false,
        error: "No file checkpoint found for this message."
      };
    }
    if (n) {
      let r = await fileHistoryGetDiffStats(t.fileHistory, e);
      return {
        canRewind: true,
        filesChanged: r?.filesChanged,
        insertions: r?.insertions,
        deletions: r?.deletions
      };
    }
    try {
      await fileHistoryRewind(() => t.fileHistory, e);
    } catch (r) {
      return {
        canRewind: false,
        error: `Failed to rewind: ${he(r)}`
      };
    }
    return {
      canRewind: true
    };
  }
  function V4f(e, t, n, r) {
    if (e.mode === "bypassPermissions") {
      if (isBypassPermissionsModeDisabled()) {
        r.enqueue({
          type: "control_response",
          response: {
            subtype: "error",
            request_id: t,
            error: "Cannot set permission mode to bypassPermissions because it is disabled by settings or configuration"
          }
        });
        return n;
      }
      if (!n.isBypassPermissionsModeAvailable) {
        r.enqueue({
          type: "control_response",
          response: {
            subtype: "error",
            request_id: t,
            error: "Cannot set permission mode to bypassPermissions because the session was not launched with --dangerously-skip-permissions"
          }
        });
        return n;
      }
    }
    if (e.mode === "auto" && !isAutoModeGateEnabled()) {
      let o = getAutoModeUnavailableReason();
      r.enqueue({
        type: "control_response",
        response: {
          subtype: "error",
          request_id: t,
          error: o ? `Cannot set permission mode to auto: ${getAutoModeUnavailableNotification(o)}` : "Cannot set permission mode to auto"
        }
      });
      return n;
    }
    r.enqueue({
      type: "control_response",
      response: {
        subtype: "success",
        request_id: t,
        response: {
          mode: e.mode
        }
      }
    });
    return {
      ...transitionPermissionMode(n.mode, e.mode, n),
      mode: e.mode
    };
  }
  function z4f(e, t, n, r) {
    let o = m => r.enqueue({
      type: "control_response",
      response: {
        subtype: "error",
        request_id: e,
        error: m
      }
    });
    let s = n.find(m => m.name === t && m.type === "connected");
    if (!s || s.type !== "connected") {
      return o(`server ${t} is not connected`);
    }
    let i = s.config.pluginSource;
    let a = i ? Yo(i) : undefined;
    if (!a?.marketplace) {
      return o(`server ${t} is not plugin-sourced; channel_enable requires a marketplace plugin`);
    }
    let l = {
      kind: "plugin",
      name: a.name,
      marketplace: a.marketplace
    };
    let c = getAllowedChannels();
    let u = c.some(m => m.kind === "plugin" && m.name === l.name && m.marketplace === l.marketplace);
    if (!u) {
      setAllowedChannels([...c, l]);
    }
    let d = gateChannelServer(t, s.capabilities, i);
    if (d.action === "skip") {
      if (!u) {
        setAllowedChannels(c);
      }
      return o(d.reason);
    }
    let p = `${l.name}@${l.marketplace}`;
    dn(t, "Channel notifications registered");
    logEvent("tengu_mcp_channel_enable", {
      plugin: p
    });
    s.client.setNotificationHandler(ChannelMessageNotificationSchema(), async m => {
      let {
        content: f,
        meta: h
      } = m.params;
      dn(t, `notifications/claude/channel: ${f.slice(0, 80)}`);
      logEvent("tengu_mcp_channel_message", {
        content_length: f.length,
        meta_key_count: Object.keys(h ?? {}).length,
        entry_kind: "plugin",
        is_dev: false,
        plugin: p
      });
      __({
        mode: "prompt",
        agentId: mainAgentId(),
        value: wrapChannelMessage(t, f, h),
        priority: "next",
        isMeta: true,
        origin: {
          kind: "channel",
          server: t
        },
        skipSlashCommands: true
      });
    });
    r.enqueue({
      type: "control_response",
      response: {
        subtype: "success",
        request_id: e,
        response: undefined
      }
    });
  }
  function Jns(e) {
    if (e.type !== "connected") {
      return;
    }
    if (gateChannelServer(e.name, e.capabilities, e.config.pluginSource).action !== "register") {
      return;
    }
    let n = findChannelEntry(e.name, getAllowedChannels());
    let r = n?.kind === "plugin" ? `${n.name}@${n.marketplace}` : undefined;
    dn(e.name, "Channel notifications re-registered after reconnect");
    e.client.setNotificationHandler(ChannelMessageNotificationSchema(), async o => {
      let {
        content: s,
        meta: i
      } = o.params;
      dn(e.name, `notifications/claude/channel: ${s.slice(0, 80)}`);
      logEvent("tengu_mcp_channel_message", {
        content_length: s.length,
        meta_key_count: Object.keys(i ?? {}).length,
        entry_kind: n?.kind == null ? undefined : n?.kind,
        is_dev: n?.dev ?? false,
        plugin: r
      });
      __({
        mode: "prompt",
        agentId: mainAgentId(),
        value: wrapChannelMessage(e.name, s, i),
        priority: "next",
        isMeta: true,
        origin: {
          kind: "channel",
          server: e.name
        },
        skipSlashCommands: true
      });
    });
  }
  function reportTurnFailed(e, t) {
    let n = {
      status_category: "failed",
      status_detail: t || "Run failed",
      needs_action: ""
    };
    e.notifyMetadataChanged({
      post_turn_summary: n
    });
  }
  function Asn(e, t) {
    if (process.stderr.write(e + `
`), logForDebugging(e, {
      level: "error"
    }), t === "stream-json") {
      let n = {
        type: "result",
        subtype: "error_during_execution",
        duration_ms: 0,
        duration_api_ms: 0,
        is_error: true,
        num_turns: 0,
        stop_reason: null,
        session_id: getSessionId(),
        total_cost_usd: 0,
        usage: Hb,
        modelUsage: {},
        permission_denials: [],
        uuid: Kx.randomUUID(),
        errors: [e]
      };
      process.stdout.write(De(n) + `
`);
    }
  }
  function Y6c(e, t) {
    return false;
  }
  async function loadInitialMessages(e, t) {
    let n = !isSessionPersistenceDisabled();
    if (t.continue) {
      try {
        logEvent("tengu_continue_print", {});
        let {
          clearSessionCaches: r
        } = await Promise.resolve().then(() => (z7e(), _vt));
        r();
        let o = await loadConversationForResume(undefined, undefined, {
          forkSession: !!t.forkSession
        });
        if (Y6c(o, t.outputFormat)) {
          return {
            messages: []
          };
        }
        if (o) {
          if (u2e) {
            let s = u2e.matchSessionMode(o.mode);
            if (s) {
              process.stderr.write(s + `
`);
              kS();
              let {
                getAgentDefinitionsWithOverrides: i,
                getActiveAgentsFromList: a
              } = __toCommonJS(cvt);
              i.cache.clear?.();
              let l = await i(Nt());
              e(c => ({
                ...c,
                agentDefinitions: {
                  ...l,
                  allAgents: l.allAgents,
                  activeAgents: a(l.allAgents)
                }
              }));
            }
          }
          if (!t.forkSession) {
            if (o.sessionId) {
              if (switchSession(o.sessionId, "resume", o.fullPath ? qXe.dirname(o.fullPath) : null), n) {
                await resetSessionFilePointer();
              }
            }
          }
          if (lon(o, e), restoreSessionMetadata(t.forkSession ? {
            ...o,
            worktreeSession: undefined,
            relocatedCwd: undefined,
            bridgeSessionId: undefined,
            bridgeLastSeq: undefined,
            bridgeDialogKinds: undefined
          } : o), !t.forkSession && n && o.sessionId) {
            adoptResumedSessionFile();
          }
          if (u2e) {
            saveMode(u2e.isCoordinatorMode() ? "coordinator" : "normal");
          }
          return {
            messages: o.messages,
            turnInterruptionState: o.turnInterruptionState,
            supersededToolUseIds: o.supersededToolUseIds,
            deferredToolUse: o.deferredToolUse,
            agentSetting: o.agentSetting
          };
        }
        logEvent("tengu_continue", {
          success: false,
          entrypoint: "print"
        });
      } catch (r) {
        Oe(r);
        gracefulShutdownSync(1);
        return {
          messages: []
        };
      }
    }
    if (t.teleport) {
      try {
        await waitForPolicyLimitsToLoad();
        let r = Qnn();
        if (r) {
          throw Error(r);
        }
        if (logEvent("tengu_teleport_print", {}), typeof t.teleport !== "string") {
          throw Error("No session ID provided for teleport");
        }
        let {
          clearSessionCaches: o
        } = await Promise.resolve().then(() => (z7e(), _vt));
        o();
        let {
          checkOutTeleportedSessionBranch: s,
          processMessagesForTeleportResume: i,
          teleportResumeCodeSession: a,
          validateGitState: l
        } = await Promise.resolve().then(() => (FM(), IKt));
        await l();
        let c = await a(t.teleport);
        let {
          branchError: u
        } = await s(c.branch);
        return {
          messages: i(c.log, u)
        };
      } catch (r) {
        logForDebugging(`Teleport in print mode failed: ${he(r)}`, {
          level: "error"
        });
        gracefulShutdownSync(1);
        return {
          messages: []
        };
      }
    }
    if (t.resume) {
      let r = "load_error";
      let o = performance.now();
      try {
        logEvent("tengu_resume_print", {});
        let s = typeof t.resume === "string" ? t.resume.trim() : "";
        let i = vEr(s);
        if (!i && s) {
          let u = await searchSessionsByCustomTitle(s, {
            exact: true
          });
          if (u.length === 1) {
            let d = getSessionIdFromLog(u[0]);
            if (d) {
              i = vEr(d);
            }
          } else if (u.length > 1) {
            let d = u.map(p => `  ${getSessionIdFromLog(p) ?? "(unknown)"}  (modified ${p.modified.toISOString()})`).join(`
`);
            logEvent("tengu_session_resumed", {
              entrypoint: "print",
              success: false,
              failure_reason: "not_found_explicit_id"
            });
            Asn(`Error: --resume "${s}" matches ${u.length} sessions. Pass one of these session IDs to disambiguate:
${d}`, t.outputFormat);
            gracefulShutdownSync(1);
            return {
              messages: []
            };
          }
        }
        if (!i) {
          let u = "Error: --resume requires a valid session ID or session title when used with --print. Usage: claude -p --resume <session-id|title>";
          if (s) {
            u += `. Provided value "${s}" is not a UUID and does not match any session title.`;
          }
          logEvent("tengu_session_resumed", {
            entrypoint: "print",
            success: false,
            failure_reason: "not_found_explicit_id"
          });
          Asn(u, t.outputFormat);
          gracefulShutdownSync(1);
          return {
            messages: []
          };
        }
        let {
          clearSessionCaches: a
        } = await Promise.resolve().then(() => (z7e(), _vt));
        if (a(), t.sdkUrl) {
          let u = performance.now();
          let [, d] = await Promise.all([(t.hydratePrefetch ?? Promise.resolve(null)).then(p => (chl(p, u), hydrateFromCCRv2InternalEvents(i.sessionId, p, ubr()))), t.restoredWorkerState, Rns().restore(xns())]);
          if (au("resume_hydrate_ms", performance.now() - u, u), d?.external || d?.internal) {
            if (e(p => hSc(d.external ?? {})(gSc(d.internal ?? {})(p))), typeof d.external?.model === "string") {
              let p = d.external.model.trim().toLowerCase() === "default" ? getDefaultMainLoopModel() : d.external.model;
              if (isExemptDefaultResolvingPick(p) || isModelAllowed(p)) {
                setMainLoopModelOverride(p);
                e(m => ({
                  ...m,
                  mainLoopModel: p
                }));
              }
            }
          }
        } else if (i.isUrl && i.ingressUrl && st("true")) {
          await hydrateRemoteSession(i.sessionId, i.ingressUrl);
        }
        if (!t.forkSession) {
          let u = performance.now();
          let d = await findLiveNonInteractiveSession(i.sessionId);
          if (au("resume_live_check_ms", performance.now() - u, u), d) {
            process.stderr.write(`Error: Session ${i.sessionId} is currently running as a background agent (${d.kind}). Use \`claude agents\` to find and attach to it, or add --fork-session to branch off a copy.
`);
            gracefulShutdownSync(1);
            return {
              messages: []
            };
          }
        }
        let l = performance.now();
        let c = await loadConversationForResume(i.sessionId, i.jsonlFile || undefined, {
          forkSession: !!t.forkSession
        });
        if (au("resume_deserialize_ms", performance.now() - l - (shl("hooks_init_ms") ?? 0), l), r = "processing_error", Y6c(c, t.outputFormat)) {
          return {
            messages: []
          };
        }
        if (!c || c.messages.length === 0 && (i.isUrl || t.sdkUrl || !c.sessionId)) {
          if (i.isUrl || t.sdkUrl) {
            let u = [];
            if (isPersistentRemoteSessionEnabled()) {
              let m = process.env.CLAUDE_CODE_RESUME_FROM_SESSION;
              if (m) {
                try {
                  logForDebugging(`[resume-from] Hydrating from source session ${m}`);
                  let {
                    prepareApiRequest: f
                  } = await Promise.resolve().then(() => (NC(), jce));
                  let {
                    teleportFromSessionsAPI: h
                  } = await Promise.resolve().then(() => (FM(), IKt));
                  let {
                    deserializeMessages: g
                  } = await Promise.resolve().then(() => (Pme(), whl));
                  let {
                    accessToken: y,
                    orgUUID: _
                  } = await f();
                  let {
                    log: b
                  } = await h(m, _, y);
                  u = g(b);
                  logForDebugging(`[resume-from] Loaded ${u.length} messages from ${m}`);
                } catch (f) {
                  logForDebugging(`[resume-from] Failed to hydrate from ${m}: ${he(f)}`);
                }
              }
            }
            let d = performance.now();
            let p = await (t.sessionStartHooksPromise ?? uRe({
              kind: "session-start",
              source: "startup"
            }));
            if (au("hooks_init_ms", performance.now() - d, d), c?.sessionId && !t.forkSession) {
              switchSession(c.sessionId, "resume", c.fullPath ? qXe.dirname(c.fullPath) : null);
              restoreSessionMetadata(c);
            }
            return {
              messages: [...u, ...dedupeSessionStartHookMessages(u, p)]
            };
          } else {
            logEvent("tengu_session_resumed", {
              entrypoint: "print",
              success: false,
              failure_reason: "not_found_explicit_id"
            });
            Asn(`No conversation found with session ID: ${i.sessionId}`, t.outputFormat);
            gracefulShutdownSync(1);
            return {
              messages: []
            };
          }
        }
        if (t.resumeSessionAt) {
          let u = c.messages.findIndex(d => d.uuid === t.resumeSessionAt);
          if (u < 0) {
            logEvent("tengu_session_resumed", {
              entrypoint: "print",
              success: false,
              failure_reason: "processing_error"
            });
            Asn(`No message found with message.uuid of: ${t.resumeSessionAt}`, t.outputFormat);
            gracefulShutdownSync(1);
            return {
              messages: []
            };
          }
          c.messages = u >= 0 ? c.messages.slice(0, u + 1) : [];
        }
        if (u2e) {
          let u = u2e.matchSessionMode(c.mode);
          if (u) {
            process.stderr.write(u + `
`);
            kS();
            let {
              getAgentDefinitionsWithOverrides: d,
              getActiveAgentsFromList: p
            } = __toCommonJS(cvt);
            d.cache.clear?.();
            let m = await d(Nt());
            e(f => ({
              ...f,
              agentDefinitions: {
                ...m,
                allAgents: m.allAgents,
                activeAgents: p(m.allAgents)
              }
            }));
          }
        }
        if (!t.forkSession && c.sessionId) {
          if (switchSession(c.sessionId, "resume", c.fullPath ? qXe.dirname(c.fullPath) : null), n) {
            await resetSessionFilePointer();
          }
        }
        if (lon(c, e), restoreSessionMetadata(t.forkSession ? {
          ...c,
          worktreeSession: undefined,
          relocatedCwd: undefined,
          bridgeSessionId: undefined,
          bridgeLastSeq: undefined,
          bridgeDialogKinds: undefined
        } : c), !t.forkSession && n && c.sessionId) {
          adoptResumedSessionFile();
        }
        if (u2e) {
          saveMode(u2e.isCoordinatorMode() ? "coordinator" : "normal");
        }
        logEvent("tengu_session_resumed", {
          entrypoint: "print",
          success: true,
          interruption_kind: c.turnInterruptionState?.kind ?? "none",
          resume_duration_ms: Math.round(performance.now() - o)
        });
        return {
          messages: c.messages,
          turnInterruptionState: c.turnInterruptionState,
          supersededToolUseIds: c.supersededToolUseIds,
          deferredToolUse: c.deferredToolUse,
          agentSetting: c.agentSetting
        };
      } catch (s) {
        let i = r;
        logEvent("tengu_session_resumed", {
          entrypoint: "print",
          success: false,
          failure_reason: i,
          error_name: sr(s).name
        });
        Oe(s);
        let a = s instanceof Error ? `Failed to resume session: ${s.message}` : "Failed to resume session with --print mode";
        Asn(a, t.outputFormat);
        gracefulShutdownSync(1);
        return {
          messages: []
        };
      }
    }
    return {
      messages: await (t.sessionStartHooksPromise ?? uRe({
        kind: "session-start",
        source: "startup"
      }))
    };
  }
  function K4f(e, t) {
    let n;
    if (typeof e === "string") {
      if (e.trim() !== "") {
        n = aDo([De({
          type: "user",
          session_id: "",
          message: {
            role: "user",
            content: e
          },
          parent_tool_use_id: null
        })]);
      } else {
        n = aDo([]);
      }
    } else {
      n = e;
    }
    return t.sdkUrl ? new tkt(t.sdkUrl, n, t.replayUserMessages, t.sessionState) : new vsn(n, t.replayUserMessages, t.sessionState);
  }
  async function handleOrphanedPermissionResponse({
    message: e,
    setAppState: t,
    onEnqueued: n,
    handledToolUseIds: r
  }) {
    if (e.response.subtype === "success" && e.response.response?.toolUseID && typeof e.response.response.toolUseID === "string") {
      let o = e.response.response;
      let {
        toolUseID: s
      } = o;
      if (!s) {
        return false;
      }
      if (logForDebugging(`handleOrphanedPermissionResponse: received orphaned control_response for toolUseID=${s} request_id=${e.response.request_id}`), r.vZc(s)) {
        logForDebugging(`handleOrphanedPermissionResponse: skipping duplicate orphaned permission for toolUseID=${s} (already handled)`);
        return false;
      }
      let i = await findUnresolvedToolUse(s);
      if (!i) {
        logForDebugging(`handleOrphanedPermissionResponse: dropping orphaned control_response for toolUseID=${s} \u2014 no unresolved tool_use found`, {
          level: "warn"
        });
        return false;
      }
      r.add(s);
      logForDebugging(`handleOrphanedPermissionResponse: enqueuing orphaned permission for toolUseID=${s} messageID=${i.message.id}`);
      __({
        mode: "orphaned-permission",
        agentId: mainAgentId(),
        value: [],
        orphanedPermission: {
          permissionResult: o,
          assistantMessage: i
        }
      });
      n?.();
      return true;
    }
    return false;
  }
  function buildToolPermissionsFromPolicy(e) {
    if (!e?.length) {
      return;
    }
    let t = {};
    for (let n of e) {
      if (n.org_max_permission && n.org_max_permission !== "allow") {
        t[n.name] = n.org_max_permission;
      }
    }
    return Object.keys(t).length > 0 ? t : undefined;
  }
  function toScopedConfig(e) {
    if (e.type === "http" || e.type === "sse") {
      let {
        tools: t,
        request_timeout_ms: n,
        ...r
      } = e;
      let o = buildToolPermissionsFromPolicy(t);
      let s = r.timeout ?? (n !== undefined ? Math.min(n, 300000) : undefined);
      return {
        ...r,
        ...(s !== undefined && {
          timeout: s
        }),
        ...(o && {
          toolPermissions: o
        }),
        scope: "dynamic"
      };
    }
    return {
      ...e,
      scope: "dynamic"
    };
  }
  async function handleMcpSetServers(e, t, n, r, o, s, i = false, a = false) {
    let l = new Set((o?.()?.mcp.clients ?? []).filter(O => isBuiltinInProcessMcpServer(O.name) && !(O.name in n.configs)).map(O => O.name));
    let c = {};
    let u = vbu(e, (O, M) => {
      if (!l.vZc(M)) {
        return false;
      }
      c[M] = "Builtin server is CLI-owned; ignored";
      return true;
    });