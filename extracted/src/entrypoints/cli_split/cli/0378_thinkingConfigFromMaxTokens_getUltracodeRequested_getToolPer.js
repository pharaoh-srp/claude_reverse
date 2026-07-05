  __export(IFl, {
    thinkingConfigFromMaxTokens: () => thinkingConfigFromMaxTokens,
    getUltracodeRequested: () => getUltracodeRequested,
    getToolPermissionContext: () => getToolPermissionContext,
    getThinkingConfig: () => getThinkingConfig,
    getMainLoopModel: () => getMainLoopModel_export,
    getEffortValue: () => getEffortValue,
    applyContextLayers: () => applyContextLayers
  });
  function getToolPermissionContext(e) {
    let t = e.getAppState().toolPermissionContext;
    let n = e.permissionLayers;
    if (!n) {
      return t;
    }
    let r = n.findLast(o => o.kind === "working_directory");
    for (let o of n) {
      switch (o.kind) {
        case "allowed_tools":
          t = withAllowedCommandTools(t, [...o.allowedTools]);
          break;
        case "disallowed_tools":
          t = withDisallowedCommandTools(t, [...o.disallowedTools]);
          break;
        case "avoid_prompts":
          if (!t.shouldAvoidPermissionPrompts) {
            t = {
              ...t,
              shouldAvoidPermissionPrompts: true
            };
          }
          break;
        case "permission_mode":
          {
            if (o.mode === "bypassPermissions" && (isBypassPermissionsModeDisabled() || !t.isBypassPermissionsModeAvailable)) {
              break;
            }
            t = {
              ...t,
              mode: o.mode
            };
            break;
          }
        case "working_directory":
          if (o === r && !t.additionalWorkingDirectories.vZc(o.directory)) {
            t = {
              ...t,
              additionalWorkingDirectories: new Map([...t.additionalWorkingDirectories, [o.directory, {
                path: o.directory,
                source: "session"
              }]])
            };
          }
          break;
        case "effort":
        case "model":
        case "max_thinking_tokens":
        case "flag_settings":
          break;
      }
    }
    return t;
  }
  function getEffortValue(e) {
    let t = e.getAppState().effortValue;
    let n = e.permissionLayers;
    if (!n) {
      return t;
    }
    for (let r of n) {
      if (r.kind === "effort") {
        t = r.effort;
      }
    }
    return t;
  }
  function getMainLoopModel_export(e) {
    let t = e.options.mainLoopModel;
    for (let n of e.permissionLayers ?? []) {
      if (n.kind === "model") {
        t = n.mainLoopModel;
      }
    }
    return t;
  }
  function getThinkingConfig(e) {
    let t = e.options.thinkingConfig;
    for (let n of e.permissionLayers ?? []) {
      if (n.kind === "max_thinking_tokens") {
        t = thinkingConfigFromMaxTokens(n.maxThinkingTokens);
      }
    }
    return t;
  }
  function thinkingConfigFromMaxTokens(e) {
    return e === 0 ? {
      type: "disabled"
    } : {
      type: "enabled",
      budgetTokens: e
    };
  }
  function getUltracodeRequested(e) {
    return e.getAppState().ultracode === true;
  }
  function applyContextLayers(e, t) {
    if (t.length === 0) {
      return e;
    }
    let n = e.permissionLayers ? [...e.permissionLayers, ...t] : [...t];
    let r;
    for (let i = t.length - 1; i >= 0; i--) {
      let a = t[i];
      if (a.kind === "model") {
        r = a.mainLoopModel;
        break;
      }
    }
    let o;
    for (let i = t.length - 1; i >= 0; i--) {
      let a = t[i];
      if (a.kind === "max_thinking_tokens") {
        o = thinkingConfigFromMaxTokens(a.maxThinkingTokens);
        break;
      }
    }
    return {
      ...e,
      permissionLayers: n,
      ...((r !== undefined || o !== undefined) && {
        options: {
          ...e.options,
          ...(r !== undefined && {
            mainLoopModel: r
          }),
          ...(o !== undefined && {
            thinkingConfig: o
          })
        }
      })
    };
  }
  var Sl = __lazy(() => {
    CO();
    Bbe();
  });
  var PFl;
  var OFl = __lazy(() => {
    PFl = ["User", "Project", "Local", "Managed", "AutoMem"];
  });
  var XU;
  var Prr = __lazy(() => {
    XU = class XU extends Error {
      originalModel;
      fallbackModel;
      reason;
      originalError;
      constructor(e, t, n = "overloaded", r) {
        super(`Model fallback triggered: ${e} -> ${t}`);
        this.originalModel = e;
        this.fallbackModel = t;
        this.reason = n;
        this.originalError = r;
        this.name = "FallbackTriggeredError";
      }
    };
  });
  function JLm(e) {
    if (e.type === "queued_command" && Array.isArray(e.prompt) && e.prompt.some(t => t.type === "image" || t.type === "document")) {
      return {
        ...e,
        prompt: e.prompt.map(t => t.type === "image" ? {
          type: "text",
          text: "[image]"
        } : t.type === "document" ? {
          type: "text",
          text: "[document]"
        } : t)
      };
    }
    if (e.type === "file" && (e.content.type === "image" || e.content.type === "notebook" || e.content.type === "parts")) {
      return {
        ...e,
        content: {
          type: "text",
          file: {
            filePath: e.filename,
            content: `[${e.content.type}]`,
            numLines: 1,
            startLine: 1,
            totalLines: 1
          }
        }
      };
    }
    return e;
  }
  function jpo(e) {
    return e.map(t => {
      if (t.type === "attachment") {
        let s = JLm(t.attachment);
        return s === t.attachment ? t : {
          ...t,
          attachment: s
        };
      }
      if (t.type !== "user") {
        return t;
      }
      let n = t.message.content;
      if (!Array.isArray(n)) {
        return t;
      }
      let r = false;
      let o = n.flatMap(s => {
        if (s.type === "image") {
          r = true;
          return [{
            type: "text",
            text: "[image]"
          }];
        }
        if (s.type === "document") {
          r = true;
          return [{
            type: "text",
            text: "[document]"
          }];
        }
        if (s.type === "tool_result" && Array.isArray(s.content)) {
          let i = false;
          let a = s.content.map(l => {
            if (l.type === "image") {
              i = true;
              return {
                type: "text",
                text: "[image]"
              };
            }
            if (l.type === "document") {
              i = true;
              return {
                type: "text",
                text: "[document]"
              };
            }
            return l;
          });
          if (i) {
            r = true;
            return [{
              ...s,
              content: a
            }];
          }
        }
        return [s];
      });
      if (!r) {
        return t;
      }
      return {
        ...t,
        message: {
          ...t.message,
          content: o
        }
      };
    });
  }
  function XLm(e) {
    return e.filter(t => t.type !== "attachment" || t.attachment.type === "queued_command");
  }
  function LFl(e) {
    if (e.length <= 100) {
      return e;
    }
    let t = 100;
    let n = e.charCodeAt(t - 1);
    if (n >= 55296 && n <= 56319) {
      t--;
    }
    return `${e.slice(0, t)}\u2026[truncated, original ${e.length} chars]`;
  }
  function _2o(e) {
    if (typeof e === "string") {
      return LFl(e);
    }
    if (Array.isArray(e)) {
      let t = e.map(_2o);
      return t.some((n, r) => n !== e[r]) ? t : e;
    }
    if (typeof e === "object" && e !== null) {
      let t = e;
      let n = false;
      let r = {};
      for (let [o, s] of Object.entries(t)) {
        let i = _2o(s);
        if (i !== s) {
          n = true;
        }
        r[o] = i;
      }
      return n ? r : e;
    }
    return e;
  }
  function QLm(e) {
    return e.map(t => {
      if (t.type === "assistant") {
        let n = t.message.content;
        if (!Array.isArray(n)) {
          return t;
        }
        let r = n.some(bXt);
        let o = (r ? n.filter(s => !bXt(s)) : n).map(s => {
          if (s.type !== "tool_use") {
            return s;
          }
          let i = _2o(s.input);
          if (i === s.input) {
            return s;
          }
          r = true;
          return {
            ...s,
            input: i
          };
        });
        if (!r) {
          return t;
        }
        return {
          ...t,
          message: {
            ...t.message,
            content: o
          }
        };
      }
      if (t.type === "user") {
        let n = t.message.content;
        if (!Array.isArray(n)) {
          return t;
        }
        let r = false;
        let o = n.map(s => {
          if (s.type !== "tool_result") {
            return s;
          }
          let i = typeof s.content === "string" ? s.content : Array.isArray(s.content) ? s.content.map(l => l.type === "text" ? l.text : "").join("") : "";
          let a = LFl(i);
          if (s.content === a) {
            return s;
          }
          r = true;
          return {
            ...s,
            content: a
          };
        });
        if (!r) {
          return t;
        }
        return {
          ...t,
          message: {
            ...t.message,
            content: o
          }
        };
      }
      return t;
    });
  }
  function UFl(e, t) {
    let n = e[0]?.type === "user" && e[0].isMeta && e[0].message.content === "[earlier conversation truncated for compaction retry]" ? e.slice(1) : e;
    let r = Apt(n);
    if (r.length < 2) {
      return null;
    }
    let o = dpt(t);
    let s;
    if (o !== undefined) {
      let a = 0;
      s = 0;
      for (let l of r) {
        if (a += nR(l), s++, a >= o) {
          break;
        }
      }
    } else {
      s = Math.max(1, Math.floor(r.length * 0.2));
    }
    if (s = Math.min(s, r.length - 1), s < 1) {
      return null;
    }
    let i = r.slice(s).flat();
    if (i[0]?.type === "assistant") {
      return [In({
        content: "[earlier conversation truncated for compaction retry]",
        isMeta: true
      }), ...i];
    }
    return i;
  }
  function Drr(e, t, n) {
    if (!e.blockedBy) {
      return;
    }
    if (logForDebugging(`Compaction blocked by PreCompact hook: ${e.blockedBy}`, {
      level: "warn"
    }), !n?.suppressNotification) {
      t?.({
        key: "compaction-blocked-by-hook",
        text: "compaction blocked by PreCompact hook",
        priority: "immediate",
        color: "warning"
      });
    }
    throw new d5(`${"Compaction blocked by PreCompact hook"}: ${e.blockedBy}`);
  }
  function ATe(e) {
    return [e.boundaryMarker, ...e.summaryMessages, ...e.messagesToKeep, ...e.attachments, ...e.hookResults];
  }
  function r2o(e) {
    return [e.boundaryMarker, ...e.summaryMessages, ...e.attachments, ...e.hookResults];
  }
  function umo(e, t, n, r = n) {
    let o = n.map(i => i.uuid);
    let s = cleanMessagesForLogging([...n], r).map(i => i.uuid);
    if (o.length === 0) {
      return e;
    }
    return {
      ...e,
      compactMetadata: {
        ...e.compactMetadata,
        ...(s.length > 0 && {
          preservedSegment: {
            headUuid: s[0],
            anchorUuid: t,
            tailUuid: s.at(-1)
          }
        }),
        preservedMessages: {
          anchorUuid: t,
          uuids: s,
          allUuids: o
        }
      }
    };
  }
  function S2o(e, t) {
    if (!t) {
      return e || undefined;
    }
    if (!e) {
      return t;
    }
    return `${e}

${t}`;
  }
  async function ktr(e, t, n, r, o, s = false, i, a = false, l, c, u) {
    let d = s ? "compact_auto" : "compact_manual";
    let p;
    let m;
    let f;
    let h = performance.now();
    let g = lGt("claude_code.compaction", {
      spanType: "compaction",
      attrs: {
        trigger: s ? "auto" : "manual",
        message_count: e.length
      }
    });
    try {
      if (e.length === 0) {
        throw Ae(d, "compact_not_enough_messages"), Error("Not enough messages to compact.");
      }
      m = Ob(e);
      let y = t.getAppState();
      kpt(getToolPermissionContext(t), "summary");
      t.onCompactEvent?.({
        type: "compact_progress",
        event: {
          type: "hooks_start",
          hookType: "pre_compact"
        }
      });
      t.onCompactEvent?.({
        type: "sdk_status",
        status: "compacting"
      });
      let _ = await executePreCompactHooks({
        trigger: s ? "auto" : "manual",
        customInstructions: o ?? null
      }, t.abortController.signal);
      Drr(_, c, {
        suppressNotification: s
      });
      o = S2o(o, _.newCustomInstructions);
      let b = _.userDisplayMessage;
      t.onCompactEvent?.({
        type: "stream_mode",
        mode: "requesting"
      });
      u?.({
        type: "response_length",
        op: "reset"
      });
      t.onCompactEvent?.({
        type: "compact_progress",
        event: {
          type: "compact_start",
          hintText: l
        }
      });
      let S = !a && getFeatureValue_CACHED_MAY_BE_STALE("tengu_compact_cache_prefix", true);
      let E = hHn(o);
      let C = In({
        content: E
      });
      let x = e;
      let A = n;
      let k;
      let I;
      let O = 0;
      for (;;) {
        if (k = await HFl({
          messages: x,
          summaryRequest: C,
          appState: y,
          context: t,
          preCompactTokenCount: m,
          cacheSafeParams: A,
          stripNonEssential: a,
          onResponseLength: u
        }), I = UG(k), !I?.startsWith("Prompt is too long")) {
          break;
        }
        O++;
        let be = O <= 3 ? UFl(x, k) : null;
        if (!be) {
          throw logEvent("tengu_compact_failed", {
            reason: "prompt_too_long",
            preCompactTokenCount: m,
            promptCacheSharingEnabled: S,
            ptlAttempts: O
          }), Ae(d, "compact_prompt_too_long"), Error("Conversation too long. Press esc twice to go up a few messages and try again.");
        }
        logEvent("tengu_compact_ptl_retry", {
          attempt: O,
          droppedMessages: x.length - be.length,
          remainingMessages: be.length
        });
        x = be;
        A = {
          ...A,
          forkContextMessages: be
        };
      }
      if (!I) {
        throw logForDebugging(`Compact failed: no summary text in response. Response: ${De(k)}`, {
          level: "error"
        }), logEvent("tengu_compact_failed", {
          reason: "no_summary",
          preCompactTokenCount: m,
          promptCacheSharingEnabled: S
        }), Ae(d, "compact_no_summary"), new d5("Failed to generate conversation summary - response did not contain valid text content");
      } else if (k.isApiErrorMessage || mU(I)) {
        throw logEvent("tengu_compact_failed", {
          reason: "api_error",
          errorPrefix: Gq(I).slice(0, 60),
          preCompactTokenCount: m,
          promptCacheSharingEnabled: S
        }), Ae(d, "compact_api_error"), $o(Error(I), "compactConversation: api_error (summary text redacted)");
      }
      let M = p4t(t.readFileState);
      if (t.readFileState.clear(), t.loadedNestedMemoryPaths) {
        for (let be of Object.keys(t.loadedNestedMemoryPaths)) {
          delete t.loadedNestedMemoryPaths[be];
        }
      }
      W9e(t.memorySelector);
      let [L, P] = await Promise.all([kHn(M, t, 5), OHn(t)]);
      let F = [...L, ...P];
      let H = AHn(t.agentId);
      if (H) {
        F.push(H);
      }
      let U = await PHn(t);
      if (U) {
        F.push(U);
      }
      let N = IHn(t.agentId);
      if (N) {
        F.push(N);
      }
      for (let be of getDeferredToolsDeltaAttachment(t.options.tools, t.options.mainLoopModel, [], {
        callSite: "compact_full"
      })) {
        F.push(createAttachmentMessage(be));
      }
      for (let be of getAgentListingDeltaAttachment(t, [])) {
        F.push(createAttachmentMessage(be));
      }
      for (let be of getMcpInstructionsDeltaAttachment(t.options.mcpClients, t.options.tools, t.options.mainLoopModel, [])) {
        F.push(createAttachmentMessage(be));
      }
      t.onCompactEvent?.({
        type: "compact_progress",
        event: {
          type: "hooks_start",
          hookType: "session_start"
        }
      });
      let W = await MV("compact", {
        model: t.options.mainLoopModel
      });
      let j = Math.round(performance.now() - h);
      let z = eWt(s ? "auto" : "manual", m ?? 0, e.at(-1)?.uuid);
      let V = extractDiscoveredToolNames(e);
      if (V.size > 0) {
        z.compactMetadata.preCompactDiscoveredTools = [...V].sort();
      }
      let K = wh();
      let J = zk() && z3t(t.getReplContexts(), t.agentId);
      let Q = [In({
        content: Y4t(I, r, K, undefined, J),
        isCompactSummary: true,
        isVisibleInTranscriptOnly: true
      })];
      let Z = L1([k]);
      let ne = nR([z, ...Q, ...F, ...W]);
      z.compactMetadata.postTokens = ne;
      z.compactMetadata.durationMs = j;
      E4t(z, e);
      f = ne;
      let oe = uoe(k);
      let ee = Vg(i?.querySource ?? t.options.querySource) ?? "unknown";
      let re = aO(t.options.mainLoopModel, getEffortValue(t));
      if (logEvent("tengu_compact", {
        preCompactTokenCount: m,
        stripNonEssential: a,
        postCompactTokenCount: Z,
        truePostCompactTokenCount: ne,
        autoCompactThreshold: i?.autoCompactThreshold ?? -1,
        willRetriggerNextTurn: i !== undefined && ne >= i.autoCompactThreshold,
        isAutoCompact: s,
        ...(re && {
          effort_level: re
        }),
        querySource: ee,
        queryChainId: t.queryTracking?.chainId ?? "",
        queryDepth: t.queryTracking?.depth ?? -1,
        isRecompactionInChain: i?.isRecompactionInChain ?? false,
        turnsSincePreviousCompact: i?.turnsSincePreviousCompact ?? -1,
        previousCompactTurnId: i?.previousCompactTurnId ?? "",
        compactionInputTokens: oe?.input_tokens,
        compactionOutputTokens: oe?.output_tokens,
        compactionCacheReadTokens: oe?.cache_read_input_tokens ?? 0,
        compactionCacheCreationTokens: oe?.cache_creation_input_tokens ?? 0,
        compactionTotalTokens: oe ? oe.input_tokens + (oe.cache_creation_input_tokens ?? 0) + (oe.cache_read_input_tokens ?? 0) + oe.output_tokens : 0,
        promptCacheSharingEnabled: S,
        ...(() => {
          try {
            return J$n(Y$n(e));
          } catch (be) {
            Oe(be);
            return {};
          }
        })()
      }), BX()) {
        $4t(i?.querySource ?? "compact", t.agentId);
      }
      if ($4e(i?.querySource)) {
        markPostCompaction();
        await flushAppendEntryQueues();
        reAppendSessionMetadata();
      }
      t.onCompactEvent?.({
        type: "compact_progress",
        event: {
          type: "hooks_start",
          hookType: "post_compact"
        }
      });
      let ae = await executePostCompactHooks({
        trigger: s ? "auto" : "manual",
        compactSummary: I
      }, t.abortController.signal);
      let de = [b, ae.userDisplayMessage].filter(Boolean).join(`
`);
      Pe(d);
      return {
        boundaryMarker: z,
        summaryMessages: Q,
        messagesToKeep: [],
        attachments: F,
        hookResults: W,
        userDisplayMessage: de || undefined,
        preCompactTokenCount: m,
        postCompactTokenCount: Z,
        truePostCompactTokenCount: ne,
        compactionUsage: oe
      };
    } catch (y) {
      if (p = y instanceof Error ? y.message : "compaction failed", !s) {
        $Fl(y, c);
      }
      throw y;
    } finally {
      if (t.onCompactEvent?.({
        type: "stream_mode",
        mode: "requesting"
      }), u?.({
        type: "response_length",
        op: "reset"
      }), t.onCompactEvent?.({
        type: "compact_progress",
        event: {
          type: "compact_end"
        }
      }), fOe({
        trigger: s ? "auto" : "manual",
        success: !p,
        durationMs: performance.now() - h,
        preTokens: m,
        postTokens: f,
        error: p
      }), g) {
        if (iGt(g, {
          ...(m !== undefined && {
            pre_compact_tokens: m
          }),
          ...(f !== undefined && {
            post_compact_tokens: f
          }),
          success: !p
        }), p) {
          k5e(g, p);
        }
        g.end();
      }
      t.onCompactEvent?.({
        type: "sdk_status",
        status: null,
        metadata: {
          compactResult: p ? "failed" : "success",
          ...(p && {
            compactError: p
          })
        }
      });
    }
  }
  async function BFl(e, t, n, r, o, s = "from", i, a) {
    let l;
    let c;
    let u;
    let d = performance.now();
    try {
      let p = s === "up_to" ? e.slice(0, t) : e.slice(t);
      let m = s === "up_to" ? e.slice(t).filter(oe => oe.type !== "progress" && !SS(oe) && !(oe.type === "user" && oe.isCompactSummary)) : e.slice(0, t).filter(oe => oe.type !== "progress");
      if (p.length === 0) {
        throw Error(s === "up_to" ? "Nothing to summarize before the selected message." : "Nothing to summarize after the selected message.");
      }
      let f = Ob(e);
      c = f;
      n.onCompactEvent?.({
        type: "compact_progress",
        event: {
          type: "hooks_start",
          hookType: "pre_compact"
        }
      });
      n.onCompactEvent?.({
        type: "sdk_status",
        status: "compacting"
      });
      let h = await executePreCompactHooks({
        trigger: "manual",
        customInstructions: null
      }, n.abortController.signal);
      Drr(h, i);
      let g;
      if (h.newCustomInstructions && o) {
        g = `${h.newCustomInstructions}

User context: ${o}`;
      } else if (h.newCustomInstructions) {
        g = h.newCustomInstructions;
      } else if (o) {
        g = `User context: ${o}`;
      }
      n.onCompactEvent?.({
        type: "stream_mode",
        mode: "requesting"
      });
      a?.({
        type: "response_length",
        op: "reset"
      });
      n.onCompactEvent?.({
        type: "compact_progress",
        event: {
          type: "compact_start"
        }
      });
      let y = yya(g, s);
      let _ = In({
        content: y
      });
      let b = {
        preCompactTokenCount: f,
        direction: s,
        messagesSummarized: p.length
      };
      let S = s === "up_to" ? p : e;
      let E = s === "up_to" ? {
        ...r,
        forkContextMessages: p
      } : r;
      let C;
      let x;
      let A = 0;
      for (;;) {
        if (C = await HFl({
          messages: S,
          summaryRequest: _,
          appState: n.getAppState(),
          context: n,
          preCompactTokenCount: f,
          cacheSafeParams: E,
          onResponseLength: a
        }), x = UG(C), !x?.startsWith("Prompt is too long")) {
          break;
        }
        A++;
        let oe = A <= 3 ? UFl(S, C) : null;
        if (!oe) {
          throw logEvent("tengu_partial_compact_failed", {
            reason: "prompt_too_long",
            ...b,
            ptlAttempts: A
          }), Ae("compact_partial", "compact_partial_prompt_too_long"), Error("Conversation too long. Press esc twice to go up a few messages and try again.");
        }
        logEvent("tengu_compact_ptl_retry", {
          attempt: A,
          droppedMessages: S.length - oe.length,
          remainingMessages: oe.length,
          path: "partial"
        });
        S = oe;
        E = {
          ...E,
          forkContextMessages: oe
        };
      }
      if (!x) {
        throw logEvent("tengu_partial_compact_failed", {
          reason: "no_summary",
          ...b
        }), Ae("compact_partial", "compact_partial_no_summary"), new d5("Failed to generate conversation summary - response did not contain valid text content");
      } else if (C.isApiErrorMessage || mU(x)) {
        throw logEvent("tengu_partial_compact_failed", {
          reason: "api_error",
          errorPrefix: Gq(x).slice(0, 60),
          ...b
        }), Ae("compact_partial", "compact_partial_api_error"), $o(Error(x), "partialCompactConversation: api_error (summary text redacted)");
      }
      let k = p4t(n.readFileState);
      if (n.readFileState.clear(), n.loadedNestedMemoryPaths) {
        for (let oe of Object.keys(n.loadedNestedMemoryPaths)) {
          delete n.loadedNestedMemoryPaths[oe];
        }
      }
      W9e(n.memorySelector);
      let [I, O] = await Promise.all([kHn(k, n, 5, m), OHn(n)]);
      let M = [...I, ...O];
      let L = AHn(n.agentId);
      if (L) {
        M.push(L);
      }
      let P = await PHn(n);
      if (P) {
        M.push(P);
      }
      let F = IHn(n.agentId);
      if (F) {
        M.push(F);
      }
      for (let oe of getDeferredToolsDeltaAttachment(n.options.tools, n.options.mainLoopModel, m, {
        callSite: "compact_partial"
      })) {
        M.push(createAttachmentMessage(oe));
      }
      for (let oe of getAgentListingDeltaAttachment(n, m)) {
        M.push(createAttachmentMessage(oe));
      }
      for (let oe of getMcpInstructionsDeltaAttachment(n.options.mcpClients, n.options.tools, n.options.mainLoopModel, m)) {
        M.push(createAttachmentMessage(oe));
      }
      n.onCompactEvent?.({
        type: "compact_progress",
        event: {
          type: "hooks_start",
          hookType: "session_start"
        }
      });
      let H = await MV("compact", {
        model: n.options.mainLoopModel
      });
      let U = L1([C]);
      let N = uoe(C);
      let W = aO(n.options.mainLoopModel, getEffortValue(n));
      logEvent("tengu_partial_compact", {
        preCompactTokenCount: f,
        postCompactTokenCount: U,
        messagesKept: m.length,
        messagesSummarized: p.length,
        ...(W && {
          effort_level: W
        }),
        direction: s,
        hasUserFeedback: !!o,
        trigger: "message_selector",
        compactionInputTokens: N?.input_tokens,
        compactionOutputTokens: N?.output_tokens,
        compactionCacheReadTokens: N?.cache_read_input_tokens ?? 0,
        compactionCacheCreationTokens: N?.cache_creation_input_tokens ?? 0
      });
      let j = s === "up_to" ? e.slice(0, t).findLast(oe => oe.type !== "progress")?.uuid : m.at(-1)?.uuid;
      let z = eWt("manual", f ?? 0, j, o, p.length);
      let V = extractDiscoveredToolNames(e);
      if (V.size > 0) {
        z.compactMetadata.preCompactDiscoveredTools = [...V].sort();
      }
      z.compactMetadata.durationMs = Math.round(performance.now() - d);
      let K = wh();
      let J = zk() && z3t(n.getReplContexts(), n.agentId);
      let Q = [In({
        content: Y4t(x, false, K, undefined, J),
        isCompactSummary: true,
        ...(m.length > 0 ? {
          summarizeMetadata: {
            messagesSummarized: p.length,
            userContext: o,
            direction: s
          }
        } : {
          isVisibleInTranscriptOnly: true
        })
      })];
      if (BX()) {
        $4t(n.options.querySource ?? "compact", n.agentId);
      }
      markPostCompaction();
      await flushAppendEntryQueues();
      reAppendSessionMetadata();
      n.onCompactEvent?.({
        type: "compact_progress",
        event: {
          type: "hooks_start",
          hookType: "post_compact"
        }
      });
      let Z = await executePostCompactHooks({
        trigger: "manual",
        compactSummary: x
      }, n.abortController.signal);
      u = nR([z, ...Q, ...m, ...M, ...H]);
      z.compactMetadata.postTokens = u;
      E4t(z, e);
      let ne = s === "up_to" ? Q.at(-1)?.uuid ?? z.uuid : z.uuid;
      Pe("compact_partial");
      return {
        boundaryMarker: umo(z, ne, m, e),
        summaryMessages: Q,
        messagesToKeep: m,
        attachments: M,
        hookResults: H,
        userDisplayMessage: Z.userDisplayMessage,
        preCompactTokenCount: f,
        postCompactTokenCount: U,
        compactionUsage: N
      };
    } catch (p) {
      throw l = p instanceof Error ? p.message : "partial compaction failed", $Fl(p, i), p;
    } finally {
      n.onCompactEvent?.({
        type: "stream_mode",
        mode: "requesting"
      });
      a?.({
        type: "response_length",
        op: "reset"
      });
      n.onCompactEvent?.({
        type: "compact_progress",
        event: {
          type: "compact_end"
        }
      });
      fOe({
        trigger: "manual",
        success: !l,
        durationMs: performance.now() - d,
        preTokens: c,
        postTokens: u,
        error: l
      });
      n.onCompactEvent?.({
        type: "sdk_status",
        status: null,
        metadata: {
          compactResult: l ? "failed" : "success",
          ...(l && {
            compactError: l
          })
        }
      });
    }
  }
  function $Fl(e, t) {
    if (!Mae(e, "API Error: Request was aborted.") && !Mae(e, "Not enough messages to compact.") && !he(e).startsWith("Compaction blocked by PreCompact hook")) {
      t?.({
        key: "error-compacting-conversation",
        text: "Error compacting conversation",
        priority: "immediate",
        color: "error"
      });
      vw({
        type: "system",
        subtype: "notification",
        key: "error-compacting-conversation",
        text: "Error compacting conversation",
        priority: "immediate",
        color: "error"
      });
    }
  }
  function ZLm(e) {
    if (!e) {
      return "none";
    }
    if (e.isApiErrorMessage) {
      return "api_error";
    }
    return e.message.content[0]?.type ?? "empty";
  }
  function yHn(e, t) {
    return (Array.isArray(t) ? t : t !== undefined ? [t] : []).filter(r => !swapShrinksContextWindow(e, r));
  }
  function qpo() {
    return async () => ({
      behavior: "deny",
      message: "Tool use is not allowed during compaction",
      decisionReason: {
        type: "other",
        reason: "compaction agent should only produce text summary"
      }
    });
  }
  async function HFl({
    messages: e,
    summaryRequest: t,
    appState: n,
    context: r,
    preCompactTokenCount: o,
    cacheSafeParams: s,
    stripNonEssential: i = false,
    onResponseLength: a
  }) {
    let l = !i && getFeatureValue_CACHED_MAY_BE_STALE("tengu_compact_cache_prefix", true);
    let c = v1l() ? setInterval(u => {
      E1l();
      u?.({
        type: "sdk_status",
        status: "compacting"
      });
    }, 30000, r.onCompactEvent) : undefined;
    try {
      if (l) {
        try {
          let S = await runForkedAgent({
            promptMessages: [t],
            cacheSafeParams: s,
            canUseTool: qpo(),
            querySource: "compact",
            forkLabel: "compact",
            maxTurns: 1,
            fallbackModel: yHn(r.options.mainLoopModel, r.options.fallbackModel),
            skipCacheWrite: true,
            skipTranscript: true,
            overrides: {
              abortController: r.abortController
            }
          });
          let E = Yk(S.messages);
          let C = fHn(S.messages);
          let x = Bn(S.messages, A => A.type === "assistant" && !A.isApiErrorMessage);
          if (E && C && !E.isApiErrorMessage) {
            if (!C.startsWith("Prompt is too long")) {
              logEvent("tengu_compact_cache_sharing_success", {
                preCompactTokenCount: o,
                outputTokens: S.totalUsage.output_tokens,
                cacheReadInputTokens: S.totalUsage.cache_read_input_tokens,
                cacheCreationInputTokens: S.totalUsage.cache_creation_input_tokens,
                cacheHitRate: S.totalUsage.cache_read_input_tokens > 0 ? S.totalUsage.cache_read_input_tokens / (S.totalUsage.cache_read_input_tokens + S.totalUsage.cache_creation_input_tokens + S.totalUsage.input_tokens) : 0,
                forkAssistantMessageCount: x
              });
            }
            return mHn(S.messages) ?? E;
          }
          if (r.abortController.signal.aborted) {
            throw Error("API Error: Request was aborted.");
          }
          logForDebugging(`Compact cache sharing: no text in response, falling back. Response: ${De(E)}`, {
            level: "warn"
          });
          logEvent("tengu_compact_cache_sharing_fallback", {
            reason: "no_text_response",
            preCompactTokenCount: o,
            lastAssistantKind: ZLm(E),
            assistantTextLength: C?.length ?? 0,
            forkAssistantMessageCount: x,
            stopReason: (E?.isApiErrorMessage && E.message.stop_reason !== "refusal" ? undefined : E?.message.stop_reason ?? undefined) == null ? undefined : E?.isApiErrorMessage && E.message.stop_reason !== "refusal" ? undefined : E?.message.stop_reason ?? undefined,
            assistantErrorKind: (E?.error ?? undefined) == null ? undefined : E?.error ?? undefined
          });
        } catch (S) {
          if (r.abortController.signal.aborted || Mae(S, "API Error: Request was aborted.")) {
            throw Error("API Error: Request was aborted.");
          }
          Oe(S);
          logEvent("tengu_compact_cache_sharing_fallback", {
            reason: "error",
            preCompactTokenCount: o
          });
        }
      }
      let d = !i && (await isToolSearchEnabled(r.options.mainLoopModel, r.options.tools, async () => n.toolPermissionContext, r.options.agentDefinitions.activeAgents, "compact")) ? gyp([iy, ToolSearchTool, ...r.options.tools.filter(S => S.isMcp)], "name") : [iy];
      let p = [...kg(e), t];
      let m = jpo(i ? XLm(p) : p);
      let f = i ? QLm(m) : m;
      let h = r.options.mainLoopModel;
      let g = r.agentId === undefined;
      if (gpt(h, r.requestDialog)) {
        let S = getFableDeclineFallbackModel();
        if (S === null) {
          if (g) {
            Ae("model_fable_consent", "compact_no_allowed_fallback");
          }
          throw Error("Compaction unavailable: your model policy only allows Fable 5, which requires usage credits \xB7 /model to set it up");
        }
        if (g) {
          Et("model_fable_consent", "compact_substituted");
        }
        h = S;
      }
      let y = yHn(h, r.options.fallbackModel);
      let _ = [h, ...y.filter(S => S !== h)];
      let b = 0;
      while (true) {
        let S = _[b];
        let E = false;
        let C = [];
        a?.({
          type: "response_length",
          op: "reset"
        });
        try {
          let A = aEt({
            messages: EO(f, i ? [] : r.options.tools),
            systemPrompt: ["You are a helpful AI assistant tasked with summarizing conversations."],
            thinkingConfig: getThinkingConfig(r),
            tools: i ? [] : d,
            signal: r.abortController.signal,
            options: {
              async getToolPermissionContext() {
                return r.getAppState().toolPermissionContext;
              },
              model: S,
              fallbackModel: _[b + 1],
              toolChoice: undefined,
              isNonInteractiveSession: r.options.isNonInteractiveSession,
              hasAppendSystemPrompt: !!r.options.appendSystemPrompt,
              querySource: "compact",
              agents: r.options.agentDefinitions.activeAgents,
              mcpTools: [],
              agentContext: r.agentContext,
              stickyBetas: wN(getStickyBetas()),
              effortValue: getEffortValue(r),
              enablePromptCaching: false,
              promptTooLongIsHandled: true
            }
          })[Symbol.asyncIterator]();
          let k = await A.next();
          while (!k.done) {
            let O = k.value;
            if (!E && O.type === "stream_event" && O.event.type === "content_block_start" && O.event.content_block.type === "text") {
              E = true;
              r.onCompactEvent?.({
                type: "stream_mode",
                mode: "responding"
              });
            }
            if (O.type === "stream_event" && O.event.type === "content_block_delta" && O.event.delta.type === "text_delta") {
              let M = O.event.delta.text.length;
              a?.({
                type: "response_length",
                op: "add",
                delta: M
              });
            }
            if (O.type === "assistant") {
              C.push(O);
            }
            k = await A.next();
          }
          let I = C.at(-1);
          if (I) {
            return I.isApiErrorMessage ? I : mHn(C) ?? I;
          }
          if (r.abortController.signal.aborted) {
            throw Error("API Error: Request was aborted.");
          }
          throw logForDebugging(`Compact streaming failed. hasStartedStreaming=${E}`, {
            level: "error"
          }), logEvent("tengu_compact_failed", {
            reason: "no_streaming_response",
            preCompactTokenCount: o,
            hasStartedStreaming: E,
            promptCacheSharingEnabled: l
          }), Error("Compaction interrupted \xB7 This may be due to network issues \u2014 please try again.");
        } catch (x) {
          let A = _[b + 1];
          if (A !== undefined && gpt(A, r.requestDialog)) {
            let k = getFableDeclineFallbackModel() ?? undefined;
            if (A = k !== undefined && !swapShrinksContextWindow(_[0], k) ? k : undefined, A !== undefined) {
              _[b + 1] = A;
            }
          }
          if (x instanceof XU && A !== undefined) {
            Pe("model_fallback");
            logEvent("tengu_model_fallback_triggered", {
              original_model: sm(x.originalModel),
              fallback_model: sm(A),
              chain_index: b + 1,
              query_source: "compact",
              reason: x.reason,
              entrypoint: "cli",
              queryChainId: br(r.queryTracking?.chainId) ?? "",
              queryDepth: r.queryTracking?.depth ?? -1
            });
            logForDebugging(`Compact: model fallback triggered (${x.reason}), retrying summarization on the fallback model`, {
              level: "warn"
            });
            r.onCompactEvent?.({
              type: "stream_mode",
              mode: "requesting"
            });
            b++;
            continue;
          }
          if (x instanceof XU && x.reason === "model_blocked") {
            throw new d5(`${renderModelName(x.originalModel)} is currently unavailable.`);
          }
          throw x;
        }
      }
    } finally {
      clearInterval(c);
    }
  }
  async function kHn(e, t, n, r = []) {
    let o = eFm(r);
    let s = Object.entries(e).map(([l, c]) => ({
      filename: l,
      ...c
    })).filter(l => !nFm(l.filename, t.agentId) && !o.vZc(us(l.filename))).sort((l, c) => c.timestamp - l.timestamp).slice(0, n);
    let i = await Promise.all(s.map(async l => {
      let c = await generateFileAttachment(l.filename, {
        ...t,
        fileReadingLimits: {
          maxTokens: 5000
        }
      }, "tengu_post_compact_file_restore_success", "tengu_post_compact_file_restore_error", "compact");
      return c ? createAttachmentMessage(c) : null;
    }));
    let a = 0;
    return i.filter(l => {
      if (l === null) {
        return false;
      }
      let c = xm(De(l));
      if (a + c <= 50000) {
        a += c;
        return true;
      }
      return false;
    });
  }
  function AHn(e) {
    let t = getPlan(e);
    if (!t) {
      return null;
    }
    let n = getPlanFilePath(e);
    return createAttachmentMessage({
      type: "plan_file_reference",
      planFilePath: n,
      planContent: t
    });
  }
  function IHn(e) {
    let t = getInvokedSkillsForAgent(e);
    if (t.size === 0) {
      return null;
    }
    let n = 0;
    let r = Array.from(t.values()).sort((o, s) => s.invokedAt - o.invokedAt).map(o => ({
      name: o.skillName,
      path: o.skillPath,
      content: tFm(o.content, KLm)
    })).filter(o => {
      let s = xm(o.content);
      if (n + s > 25000) {
        return false;
      }
      n += s;
      return true;
    });
    if (r.length === 0) {
      return null;
    }
    return createAttachmentMessage({
      type: "invoked_skills",
      skills: r
    });
  }
  async function PHn(e) {
    if (getToolPermissionContext(e).mode !== "plan") {
      return null;
    }
    let t = getPlanFilePath(e.agentId);
    let n = getPlan(e.agentId) !== null;
    let r = e.options?.planModeInstructions;
    return createAttachmentMessage({
      type: "plan_mode",
      reminderType: "full",
      isSubAgent: !!e.agentId,
      planFilePath: t,
      planExists: n,
      ...(r !== undefined && {
        customInstructions: r
      })
    });
  }
  async function OHn(e) {
    let t = e.getAppState();
    return Object.values(t.tasks).filter(r => r.type === "local_agent").flatMap(r => {
      if (r.retrieved || r.status === "pending" || r.agentId === e.agentId) {
        return [];
      }
      return [createAttachmentMessage({
        type: "task_status",
        taskId: r.agentId,
        taskType: "local_agent",
        description: r.description,
        status: r.status,
        deltaSummary: r.status === "running" ? r.progress?.summary ?? null : r.error ?? null,
        outputFilePath: getTaskOutputPath(r.agentId)
      })];
    });
  }
  function eFm(e) {
    let t = new Set();
    for (let r of e) {
      if (r.type !== "user" || !Array.isArray(r.message.content)) {
        continue;
      }
      for (let o of r.message.content) {
        if (o.type === "tool_result" && typeof o.content === "string" && nMn(o.content)) {
          t.add(o.tool_use_id);
        }
      }
    }
    let n = new Set();
    for (let r of e) {
      if (r.type !== "assistant" || !Array.isArray(r.message.content)) {
        continue;
      }
      for (let o of r.message.content) {
        if (o.type !== "tool_use" || o.name !== "Read" || t.vZc(o.id)) {
          continue;
        }
        let s = o.input;
        if (s && typeof s === "object" && "file_path" in s && typeof s.file_path === "string") {
          n.add(us(s.file_path));
        }
      }
    }
    return n;
  }
  function tFm(e, t) {
    if (xm(e) <= t) {
      return e;
    }
    let n = t * 4 - NFl.length;
    return e.slice(0, n) + NFl;
  }
  function nFm(e, t) {
    let n = us(e);
    try {
      let r = us(getPlanFilePath(t));
      if (n === r) {
        return true;
      }
    } catch {}
    try {
      if (new Set(PFl.map(o => us(getMemoryPath(o)))).vZc(n)) {
        return true;
      }
    } catch {}
    return false;
  }
  var d5;
  var NFl = `

[... skill content truncated for compaction; use Read on the skill path if you need the full text]`;
  var Dde = __lazy(() => {
    at();
    Cde();
    at();
    ypt();
    LEe();
    Tm();
    ZC();
    K$n();
    rR();
    mpo();
    Sl();
    je();
    Fp();
    dt();
    qI();
    CO();
    Sp();
    Rn();
    OFl();
    ro();
    Eo();
    ku();
    xx();
    g7e();
    Fy();
    DDe();
    fa();
    cE();
    yS();
    GG();
    TO();
    foe();
    ln();
    $n();
    Ot();
    cJ();
    B_();
    aE();
    vO();
    Prr();
    ADe();
    X9e();
    dHn();
    aU();
    IV();
    $po();
    d5 = class d5 extends Error {};
  });
  function oFm(e) {
    return e instanceof d5 || mU(he(e)) || Mae(e, "Conversation too long. Press esc twice to go up a few messages and try again.") || Mae(e, "Compaction interrupted \xB7 This may be due to network issues \u2014 please try again.");
  }
  function jFl(e, t, n) {
    let r = (e?.consecutiveFailures ?? 0) + 1;
    if (r >= 3) {
      logForDebugging(`autocompact: circuit breaker tripped after ${r} consecutive failures${t ? " (reactive path)" : ""} \u2014 skipping future attempts this session`, {
        level: "warn"
      });
      logEvent("tengu_auto_compact_circuit_breaker", {
        consecutiveFailures: r,
        ...(t && {
          routedThroughReactive: t
        }),
        ...(n && {
          thresholdSource: n
        })
      });
    }
    return {
      kind: "failed",
      consecutiveFailures: r,
      routedThroughReactive: t,
      thresholdSource: n
    };
  }
  function sFm(e, t, n, r = 0) {
    let o = ept(e);
    if (!o) {
      return null;
    }
    let s = o.input_tokens + o.cache_read_input_tokens + o.cache_creation_input_tokens;
    let i = nR(e, bytesPerTokenForModel(t));
    let a = Math.max(0, s - r - i);
    let l = S4t(t, n);
    if (a <= l) {
      return null;
    }
    let c = 0;
    let u = 0;
    let d = p => {
      for (let m of p) {
        let f = m;
        if (f.type === "document") {
          c++;
        } else if (f.type === "image") {
          u++;
        } else if (f.type === "tool_result" && Array.isArray(f.content)) {
          d(f.content);
        }
      }
    };
    for (let p of e) {
      let m = p.message?.content;
      if (Array.isArray(m)) {
        d(m);
      }
    }
    return {
      prefixTokens: a,
      thresholdTokens: l,
      totalInputTokens: s,
      messagesEstimate: i,
      snipTokensFreed: r,
      documentBlockCount: c,
      imageBlockCount: u
    };
  }
  function iFm() {
    return st(process.env.CLAUDE_CODE_COLD_COMPACT);
  }
  async function aFm(e, t, n, r, o = 0) {
    if (Jdt(r)) {
      return false;
    }
    if (gDe(r)) {
      return false;
    }
    if (!Sx()) {
      return false;
    }
    if (DX() && !yDe(t, n)) {
      return false;
    }
    let s = Ob(e, bytesPerTokenForModel(t)) - o;
    let i = _De(s, t, n);
    logForDebugging(`autocompact: tokens=${s} level=${i.level} effectiveWindow=${coe(t, n)}`);
    return i.level === "compact" || i.level === "blocked";
  }
  async function* ZBo(e, t, n, r, o, s, i) {
    if (Me.DISABLE_COMPACT) {
      return {
        kind: "not_needed"
      };
    }
    if (o?.consecutiveFailures !== undefined && o.consecutiveFailures >= 3) {
      return {
        kind: "failure_breaker_open"
      };
    }
    let a = t.options.mainLoopModel;
    let l = t.options.autoCompactWindow;
    if (!(await aFm(e, a, l, r, s))) {
      return {
        kind: "not_needed"
      };
    }
    let u = sFm(e, a, l, s);
    if (u) {
      logForDebugging(`autocompact: fixed prefix ~${u.prefixTokens} > threshold ${u.thresholdTokens} \u2014 compaction cannot help`, {
        level: "warn"
      });
      Et("compact_auto", "compact_auto_prefix_overflow");
      logEvent("tengu_auto_compact_prefix_overflow", {
        ...u,
        wouldHaveBlocked: true
      });
    }
    let d = o$n(o);
    let {
      consecutiveRapidRefills: p
    } = d;
    if (d.action === "trip") {
      logForDebugging(`autocompact: rapid-refill breaker tripped \u2014 ${p} consecutive refills within <${3} turns each (last was ${o?.turnCounter} turns)`, {
        level: "warn"
      });
      Et("compact_auto", "compact_auto_rapid_refill_breaker");
      return {
        kind: "rapid_refill_breaker_tripped"
      };
    }
    let m = n$n(a, l);
    let f = lFm(a, l);
    if (r !== undefined && m !== "auto" && DX()) {
      logForDebugging(`autocompact: routing through reactive (thresholdSource=${m})`);
      logEvent("tengu_auto_compact_routed_reactive", {
        thresholdSource: m
      });
      let y = performance.now();
      let _ = r;
      let {
        result: b,
        hookBlocked: S
      } = yield* Ydt(async (E, C, x) => {
        let A;
        if (i) {
          let I = createChildAbortController(E.abortController);
          let O = setTimeout(M => M.abort(userAbortReason("recovery-timeout")), 600000, I);
          O.unref?.();
          try {
            A = await i({
              toolUseContext: {
                ...E,
                abortController: I
              },
              messages: e,
              querySource: _,
              trigger: "threshold",
              detectedAt: y
            });
          } finally {
            clearTimeout(O);
          }
        }
        let k = await CHn({
          hasAttempted: false,
          querySource: _,
          aborted: E.abortController.signal.aborted,
          messages: e,
          cacheSafeParams: {
            ...n,
            toolUseContext: E
          },
          precomputed: A?.swap,
          precomputeOutcome: A?.outcome,
          userWaitStartedAt: y,
          thresholdSource: m,
          spinnerHintText: f
        });
        if (k.result === null && A?.emittedEarlyCompactStart) {
          E.onCompactEvent?.({
            type: "compact_progress",
            event: {
              type: "compact_end"
            }
          });
          E.onCompactEvent?.({
            type: "sdk_status",
            status: null
          });
        }
        return k;
      }, t);
      if (b) {
        return {
          kind: "compacted",
          result: b,
          consecutiveRapidRefills: p,
          thresholdSource: m,
          routedThroughReactive: true
        };
      }
      if (S) {
        return {
          kind: "hook_blocked",
          thresholdSource: m,
          routedThroughReactive: true
        };
      }
      return jFl(o, true, m);
    }
    let h = {
      isRecompactionInChain: o?.compacted === true,
      turnsSincePreviousCompact: o?.turnCounter ?? -1,
      previousCompactTurnId: o?.turnId,
      autoCompactThreshold: S4t(a, l),
      querySource: r
    };
    let g = iFm();
    try {
      let y = yield* Ydt((_, b, S) => ktr(e, _, n, true, undefined, true, h, g, f, b, S), t);
      Mde(r, t.setAppState, t.agentId, n.stickyBetas);
      return {
        kind: "compacted",
        result: y,
        consecutiveRapidRefills: p,
        thresholdSource: m,
        routedThroughReactive: false
      };
    } catch (y) {
      if (he(y).startsWith("Compaction blocked by PreCompact hook")) {
        return {
          kind: "hook_blocked",
          routedThroughReactive: false
        };
      }
      if (!Mae(y, "API Error: Request was aborted.")) {
        if (oFm(y)) {
          logForDebugging(`autocompact failed: ${he(y)}`, {
            level: "error"
          });
        } else {
          Oe($o(sr(y), "autocompact: unexpected compactConversation failure"));
        }
      }
      return jFl(o, false, undefined);
    }
  }
  function lFm(e, t) {
    let n = getCanonicalName(e);
    if (sdo(n) === undefined) {
      return null;
    }
    let {
      source: r,
      configured: o
    } = jq(e, t);
    let s = iT(e, getSdkBetas());
    if (r !== "experiment" && r !== "clientdata" || o >= s) {
      return null;
    }
    return `Compacting at auto window (${formatTokens(o)} tokens) \xB7 /autocompact to configure`;
  }
  var T2o = __lazy(() => {
    at();
    Kp();
    VT();
    je();
    pr();
    gn();
    dt();
    cs();
    Cde();
    Rn();
    Eo();
    TO();
    ln();
    Ot();
    vO();
    IV();
    d$();
    Dde();
    Npt();
    t5e();
  });
  var d$ = __lazy(() => {
    ldo();
    T2o();
    Xma();
    efa();
    ldo();
    T2o();
  });
  async function zEt(e, t) {
    try {
      let n = await i6e(e, t);
      if (n !== null) {
        return n;
      }
      logForDebugging(`countTokensWithFallback: API returned null, trying haiku fallback (${t.length} tools)`);
    } catch (n) {
      logForDebugging(`countTokensWithFallback: API failed: ${he(n)}`);
      Oe(n);
    }
    try {
      let n = await C2o(e, t);
      if (n === null) {
        logForDebugging(`countTokensWithFallback: haiku fallback also returned null (${t.length} tools)`);
      }
      return n;
    } catch (n) {
      logForDebugging(`countTokensWithFallback: haiku fallback failed: ${he(n)}`, {
        level: "error"
      });
      return null;
    }
  }
  async function CFe(e, t, n, r) {
    let o = await Promise.all(e.map(i => Brr(i, {
      getToolPermissionContext: t,
      tools: e,
      agents: n?.activeAgents ?? [],
      model: r
    })));
    let s = await zEt([], o);
    if (s === null || s === 0) {
      let i = e.map(a => a.name).join(", ");
      logForDebugging(`countToolDefinitionTokens returned ${s} for ${e.length} tools: ${i.slice(0, 100)}${i.length > 100 ? "..." : ""}`);
    }
    return s ?? 0;
  }
  function cFm(e) {
    let t = e.match(/^#+\s+(.+)$/m);
    if (t) {
      return t[1].trim();
    }
    let n = e.split(`
`).find(r => r.trim().length > 0) ?? "";
    return n.length > 40 ? n.slice(0, 40) + "\u2026" : n;
  }
  async function uFm(e, t) {
    let n = await Tv();
    let r = t ? {} : n;
    let o = [...e.filter(c => c.length > 0 && c !== "__SYSTEM_PROMPT_DYNAMIC_BOUNDARY__").map(c => ({
      name: cFm(c),
      content: c
    })), ...Object.entries(r).filter(([, c]) => c.length > 0).map(([c, u]) => ({
      name: c,
      content: u
    }))];
    let s = 0;
    if (t) {
      let c = await Urr(undefined);
      let u = [...Object.values(n), ...Object.values(c)].filter(d => d.length > 0).join(`
`);
      if (u.length > 0) {
        s = (await zEt([{
          role: "user",
          content: u
        }], [])) || 0;
      }
    }
    if (o.length < 1) {
      return {
        systemPromptTokens: 0,
        systemPromptSections: [],
        redirectedContextTokens: s
      };
    }
    let i = await Promise.all(o.map(({
      content: c
    }) => zEt([{
      role: "user",
      content: c
    }], [])));
    let a = o.map((c, u) => ({
      name: c.name,
      tokens: i[u] || 0
    }));
    return {
      systemPromptTokens: i.reduce((c, u) => c + (u || 0), 0),
      systemPromptSections: a,
      redirectedContextTokens: s
    };
  }
  async function dFm() {
    if (Qce()) {
      return {
        memoryFileDetails: [],
        claudeMdTokens: 0
      };
    }
    let e = filterInjectedMemoryFiles(await getMemoryFiles());
    let t = [];
    let n = 0;
    if (e.length < 1) {
      return {
        memoryFileDetails: [],
        claudeMdTokens: 0
      };
    }
    let r = await Promise.all(e.map(async o => {
      let s = await zEt([{
        role: "user",
        content: o.content
      }], []);
      return {
        file: o,
        tokens: s || 0
      };
    }));
    for (let {
      file: o,
      tokens: s
    } of r) {
      n += s;
      t.push({
        path: o.path,
        type: o.type,
        tokens: s
      });
    }
    return {
      claudeMdTokens: n,
      memoryFileDetails: t
    };
  }
  async function pFm(e, t, n, r, o) {
    let s = e.filter(g => !g.isMcp);
    if (s.length < 1) {
      return {
        builtInToolTokens: 0,
        deferredBuiltinDetails: [],
        deferredBuiltinTokens: 0,
        systemToolDetails: []
      };
    }
    let {
      isToolSearchEnabled: i
    } = await Promise.resolve().then(() => (foe(), w2o));
    let {
      isDeferredTool: a
    } = await Promise.resolve().then(() => (kX(), yuo));
    let l = await i(r ?? "", e, t, n?.activeAgents ?? [], "analyzeBuiltIn");
    let c = s.filter(g => !a(g));
    let u = s.filter(g => a(g));
    let d = c.length > 0 ? await CFe(c, t, n, r) : 0;
    let p = [];
    let m = [];
    let f = 0;
    let h = 0;
    if (u.length > 0 && l) {
      let g = new Set();
      if (o) {
        let _ = new Set(u.map(b => b.name));
        for (let b of o) {
          if (b.type === "assistant") {
            for (let S of b.message.content) {
              if ("type" in S && S.type === "tool_use" && "name" in S && typeof S.name === "string" && _.vZc(S.name)) {
                g.add(S.name);
              }
            }
          }
        }
      }
      let y = await Promise.all(u.map(_ => CFe([_], t, n, r)));
      for (let [_, b] of u.entries()) {
        let S = Math.max(0, (y[_] || 0) - 500);
        let E = g.vZc(b.name);
        if (m.push({
          name: b.name,
          tokens: S,
          isLoaded: E
        }), h += S, E) {
          f += S;
        }
      }
    } else if (u.length > 0) {
      let g = await CFe(u, t, n, r);
      return {
        builtInToolTokens: d + g,
        deferredBuiltinDetails: [],
        deferredBuiltinTokens: 0,
        systemToolDetails: p
      };
    }
    return {
      builtInToolTokens: d + f,
      deferredBuiltinDetails: m,
      deferredBuiltinTokens: h - f,
      systemToolDetails: p
    };
  }
  function WFl(e) {
    return Cl(e, "Skill");
  }
  async function mFm(e, t, n) {
    let r = await getSkillToolInfo(Nt());
    let o = WFl(e);
    if (!o) {
      return {
        slashCommandTokens: 0,
        commandInfo: {
          totalCommands: 0,
          includedCommands: 0
        }
      };
    }
    return {
      slashCommandTokens: await CFe([o], t, n),
      commandInfo: {
        totalCommands: r.totalCommands,
        includedCommands: r.includedCommands
      }
    };
  }
  async function fFm(e, t, n, r, o, s, i) {
    try {
      let a = await getSkillToolCommands(getProjectRoot());
      let l = getMcpSkillCommands(s);
      let c = dropShadowedBundledSkills(l.length > 0 ? dropShadowedFallbackSkills(gyp([...a, ...l], "name")) : a);
      let u = i === undefined ? filterSkillCommandsByAllowlist(c, getSessionSkillAllowlist()) : c;
      let d = WFl(e);
      if (!d) {
        return {
          skillTokens: 0,
          skillInfo: {
            totalSkills: 0,
            includedSkills: 0,
            skillFrontmatter: []
          }
        };
      }
      let p = await CFe([d], t, n);
      let m = bytesPerTokenForModel(o);
      let f = bytesPerTokenForModel(r);
      let h = new Set(u.filter(C => getSkillOverride(C) === "name-only").map(C => C.name));
      let g = w2n(u, iT(o, getSdkBetas()), h, C => Nve(C.name), m);
      let y = new Set(g.budgetTruncatedSkills);
      let _ = cTe();
      let b = C => {
        if (h.vZc(C.name) || g.budgetMode === "priority" && y.vZc(C.name) || g.budgetMode === "names-only" && !Dco(C)) {
          return `- ${C.name}`;
        }
        let A = b9e(C);
        let k = g.budgetMode === "truncate" && y.vZc(C.name) ? Math.min(A.length, _, g.maxDescLen) : Math.min(A.length, _);
        return `- ${C.name}: ${A.slice(0, k)}`;
      };
      let S = u.map(C => {
        let x = C.type === "prompt" ? C.source : "plugin";
        let A = x === "builtin" || x === "bundled" ? "built-in" : x;
        return {
          name: getCommandName(C),
          source: A,
          pluginName: C.type === "prompt" ? C.pluginInfo?.pluginManifest.name : undefined,
          tokens: xm(b(C), f)
        };
      });
      let E = c.length;
      return {
        skillTokens: p,
        skillInfo: {
          totalSkills: E,
          includedSkills: u.length,
          skillFrontmatter: S
        }
      };
    } catch (a) {
      Oe(sr(a));
      return {
        skillTokens: 0,
        skillInfo: {
          totalSkills: 0,
          includedSkills: 0,
          skillFrontmatter: []
        }
      };
    }
  }
  async function hFm(e, t, n, r, o) {
    let s = e.filter(_ => _.isMcp);
    let i = [];
    let a = await CFe(s, t, n, r);
    let l = Math.max(0, (a || 0) - 500);
    let c = await Promise.all(s.map(async _ => xm(De({
      name: _.name,
      description: await _.prompt({
        getToolPermissionContext: t,
        tools: e,
        agents: n?.activeAgents ?? []
      }),
      input_schema: _.inputJSONSchema ?? {}
    }))));
    let u = c.reduce((_, b) => _ + b, 0) || 1;
    let d = c.map(_ => Math.round(_ / u * l));
    let {
      isToolSearchEnabled: p
    } = await Promise.resolve().then(() => (foe(), w2o));
    let {
      isDeferredTool: m
    } = await Promise.resolve().then(() => (kX(), yuo));
    let f = await p(r, e, t, n?.activeAgents ?? [], "analyzeMcp");
    let h = new Set();
    if (f && o) {
      let _ = new Set(s.map(b => b.name));
      for (let b of o) {
        if (b.type === "assistant") {
          for (let S of b.message.content) {
            if ("type" in S && S.type === "tool_use" && "name" in S && typeof S.name === "string" && _.vZc(S.name)) {
              h.add(S.name);
            }
          }
        }
      }
    }
    for (let [_, b] of s.entries()) {
      i.push({
        name: b.name,
        serverName: b.name.split("__")[1] || "unknown",
        tokens: d[_],
        isLoaded: h.vZc(b.name) || !m(b)
      });
    }
    let g = 0;
    let y = 0;
    for (let _ of i) {
      if (_.isLoaded) {
        g += _.tokens;
      } else if (f) {
        y += _.tokens;
      }
    }
    return {
      mcpToolTokens: f ? g : l,
      mcpToolDetails: i,
      deferredToolTokens: y,
      loadedMcpToolNames: h
    };
  }
  async function gFm(e) {
    let t = e.activeAgents.filter(s => s.source !== "built-in");
    let n = [];
    let r = 0;
    let o = await Promise.all(t.map(s => zEt([{
      role: "user",
      content: [s.agentType, s.whenToUse].join(" ")
    }], [])));
    for (let [s, i] of t.entries()) {
      let a = o[s] || 0;
      r += a || 0;
      n.push({
        agentType: i.agentType,
        source: i.source,
        tokens: a || 0
      });
    }
    return {
      agentTokens: r,
      agentDetails: n
    };
  }
  function yFm(e, t) {
    for (let n of e.message.content) {
      let r = De(n);
      let o = xm(r);
      if ("type" in n && n.type === "tool_use") {
        t.toolCallTokens += o;
        let s = ("name" in n ? n.name : undefined) || "unknown";
        t.toolCallsByType.set(s, (t.toolCallsByType.get(s) || 0) + o);
      } else {
        t.assistantMessageTokens += o;
      }
    }
  }
  function _Fm(e, t, n) {
    if (typeof e.message.content === "string") {
      let r = xm(e.message.content);
      t.userMessageTokens += r;
      return;
    }
    for (let r of e.message.content) {
      let o = De(r);
      let s = xm(o);
      if ("type" in r && r.type === "tool_result") {
        t.toolResultTokens += s;
        let i = "tool_use_id" in r ? r.tool_use_id : undefined;
        let a = (i ? n.get(i) : undefined) || "unknown";
        t.toolResultsByType.set(a, (t.toolResultsByType.get(a) || 0) + s);
      } else {
        t.userMessageTokens += s;
      }
    }
  }
  function bFm(e, t) {
    let n = De(e.attachment);
    let r = xm(n);
    t.attachmentTokens += r;
    let o = e.attachment.type || "unknown";
    t.attachmentsByType.set(o, (t.attachmentsByType.get(o) || 0) + r);
  }
  async function SFm(e, t) {
    let n = {
      totalTokens: 0,
      toolCallTokens: 0,
      toolResultTokens: 0,
      attachmentTokens: 0,
      assistantMessageTokens: 0,
      userMessageTokens: 0,
      toolCallsByType: new Map(),
      toolResultsByType: new Map(),
      attachmentsByType: new Map()
    };
    let r = new Map();
    for (let s of e) {
      if (s.type === "assistant") {
        for (let i of s.message.content) {
          if ("type" in i && i.type === "tool_use") {
            let a = "id" in i ? i.id : undefined;
            let l = ("name" in i ? i.name : undefined) || "unknown";
            if (a) {
              r.set(a, l);
            }
          }
        }
      }
    }
    for (let s of e) {
      if (s.type === "assistant") {
        yFm(s, n);
      } else if (s.type === "user") {
        _Fm(s, n, r);
      } else if (s.type === "attachment") {
        bFm(s, n);
      }
    }
    let o = t ? 0 : await zEt(EO(e).map(s => {
      if (s.type === "assistant") {
        return {
          role: "assistant",
          content: s.message.content
        };
      }
      return s.message;
    }), []);
    n.totalTokens = o ?? 0;
    return n;
  }
  async function Lrr(e, t, n, r, o, s, i, a, l, c, u) {
    let d = getRuntimeMainLoopModel({
      permissionMode: (await n()).mode,
      mainLoopModel: t
    });
    let p = Sx() ? c : undefined;
    let {
      window: m,
      source: f
    } = jq(d, p);
    let h = await GO(r, d, undefined, {
      excludeDynamicSections: u
    });
    let g = J9({
      mainThreadAgentDefinition: a,
      toolUseContext: i ?? {
        options: {}
      },
      customSystemPrompt: i?.options.customSystemPrompt,
      defaultSystemPrompt: h,
      appendSystemPrompt: i?.options.appendSystemPrompt
    });
    let y = l ?? e;
    let _ = ept(y);
    let b = _ && _.input_tokens + _.cache_creation_input_tokens + _.cache_read_input_tokens > 0 ? _ : null;
    let S = b ? b.input_tokens + b.cache_creation_input_tokens + b.cache_read_input_tokens : null;
    let [{
      systemPromptTokens: E,
      systemPromptSections: C,
      redirectedContextTokens: x
    }, {
      claudeMdTokens: A,
      memoryFileDetails: k
    }, {
      builtInToolTokens: I,
      deferredBuiltinDetails: O,
      deferredBuiltinTokens: M,
      systemToolDetails: L
    }, {
      mcpToolTokens: P,
      mcpToolDetails: F,
      deferredToolTokens: H
    }, {
      agentTokens: U,
      agentDetails: N
    }, {
      slashCommandTokens: W,
      commandInfo: j
    }, z] = await Promise.all([uFm(g, u && i?.options.customSystemPrompt === undefined), dFm(), pFm(r, n, o, d, e), hFm(r, n, o, d, e), gFm(o), mFm(r, n, o), SFm(e, S !== null)]);
    let K = (await fFm(r, n, o, d, t, i?.getMcp?.().commands ?? [], i?.agentId)).skillInfo;
    let J = K.skillFrontmatter.reduce((ht, It) => ht + It.tokens, 0);
    let Q = z.totalTokens + x;
    let Z = Sx();
    let ne = Z ? coe(t, p) - 13000 : undefined;
    let oe = [];
    if (E > 0) {
      oe.push({
        name: "System prompt",
        tokens: E,
        color: "promptBorder"
      });
    }
    let ee = I - J;
    if (ee > 0) {
      oe.push({
        name: "System tools",
        tokens: ee,
        color: "inactive"
      });
    }
    if (P > 0) {
      oe.push({
        name: "MCP tools",
        tokens: P,
        color: "cyan_FOR_SUBAGENTS_ONLY"
      });
    }
    if (H > 0) {
      oe.push({
        name: "MCP tools (deferred)",
        tokens: H,
        color: "inactive",
        isDeferred: true
      });
    }
    if (M > 0) {
      oe.push({
        name: "System tools (deferred)",
        tokens: M,
        color: "inactive",
        isDeferred: true
      });
    }
    if (U > 0) {
      oe.push({
        name: "Custom agents",
        tokens: U,
        color: "permission"
      });
    }
    if (A > 0) {
      oe.push({
        name: "Memory files",
        tokens: A,
        color: "claude"
      });
    }
    if (J > 0) {
      oe.push({
        name: "Skills",
        tokens: J,
        color: "warning"
      });
    }
    let re = 0;
    let se;
    if (!(Z && f === "auto")) {
      if (Z && ne !== undefined) {
        re = m - ne;
        se = "Autocompact buffer";
      } else if (!Z) {
        re = 3000;
        se = "Compact buffer";
      }
    }
    if (S !== null) {
      let ht = oe.reduce((wt, vt) => wt + (vt.isDeferred ? 0 : vt.tokens), 0);
      let It = m - ht - re;
      let Rt = Sfa(y, bytesPerTokenForModel(d));
      Q = Math.max(0, Math.min(Math.max(0, S - ht) + Rt, It));
    }
    let de = Math.max(0, Q - z.toolCallTokens - z.toolResultTokens - z.attachmentTokens - z.assistantMessageTokens - z.userMessageTokens - x);
    if (Q > 0) {
      oe.push({
        name: "Messages",
        tokens: Q,
        color: "purple_FOR_SUBAGENTS_ONLY"
      });
    }
    let be = oe.reduce((ht, It) => ht + (It.isDeferred ? 0 : It.tokens), 0);
    if (se) {
      oe.push({
        name: se,
        tokens: re,
        color: "inactive"
      });
    }
    let fe = Math.max(0, m - be - re);
    oe.push({
      name: "Free space",
      tokens: fe,
      color: "promptBorder"
    });
    let me = S ?? be;
    let Te = s && s < 80;
    let ue = m >= 1e6 ? Te ? 5 : 20 : Te ? 5 : 10;
    let ce = m >= 1e6 ? 10 : Te ? 5 : 10;
    let le = ue * ce;
    let ve = oe.filter(ht => !ht.isDeferred).map(ht => ({
      ...ht,
      squares: ht.name === "Free space" ? Math.round(ht.tokens / m * le) : Math.max(1, Math.round(ht.tokens / m * le)),
      percentageOfTotal: Math.round(ht.tokens / m * 100)
    }));
    function _e(ht) {
      let It = [];
      let Rt = ht.tokens / m * le;
      let wt = Math.floor(Rt);
      let vt = Rt - wt;
      for (let yt = 0; yt < ht.squares; yt++) {
        let gt = 1;
        if (yt === wt && vt > 0) {
          gt = vt;
        }
        It.push({
          color: ht.color,
          isFilled: true,
          categoryName: ht.name,
          tokens: ht.tokens,
          percentage: ht.percentageOfTotal,
          squareFullness: gt
        });
      }
      return It;
    }
    let xe = [];
    let ke = ve.find(ht => ht.name === "Autocompact buffer" || ht.name === "Compact buffer");
    let Ie = ve.filter(ht => ht.name !== "Autocompact buffer" && ht.name !== "Compact buffer" && ht.name !== "Free space");
    for (let ht of Ie) {
      let It = _e(ht);
      for (let Rt of It) {
        if (xe.length < le) {
          xe.push(Rt);
        }
      }
    }
    let Ue = ke ? ke.squares : 0;
    let Ge = oe.find(ht => ht.name === "Free space");
    let Be = le - Ue;
    while (xe.length < Be) {
      xe.push({
        color: "promptBorder",
        isFilled: true,
        categoryName: "Free space",
        tokens: Ge?.tokens || 0,
        percentage: Ge ? Math.round(Ge.tokens / m * 100) : 0,
        squareFullness: 1
      });
    }
    if (ke) {
      let ht = _e(ke);
      for (let It of ht) {
        if (xe.length < le) {
          xe.push(It);
        }
      }
    }
    let We = [];
    for (let ht = 0; ht < ce; ht++) {
      We.push(xe.slice(ht * ue, (ht + 1) * ue));
    }
    let Ze = new Map();
    for (let [ht, It] of z.toolCallsByType.entries()) {
      let Rt = Ze.get(ht) || {
        callTokens: 0,
        resultTokens: 0
      };
      Ze.set(ht, {
        ...Rt,
        callTokens: It
      });
    }
    for (let [ht, It] of z.toolResultsByType.entries()) {
      let Rt = Ze.get(ht) || {
        callTokens: 0,
        resultTokens: 0
      };
      Ze.set(ht, {
        ...Rt,
        resultTokens: It
      });
    }
    let Tt = Array.from(Ze.entries()).map(([ht, {
      callTokens: It,
      resultTokens: Rt
    }]) => ({
      name: ht,
      callTokens: It,
      resultTokens: Rt
    })).sort((ht, It) => It.callTokens + It.resultTokens - (ht.callTokens + ht.resultTokens));
    let kt = Array.from(z.attachmentsByType.entries()).map(([ht, It]) => ({
      name: ht,
      tokens: It
    })).sort((ht, It) => It.tokens - ht.tokens);
    let Ye = {
      toolCallTokens: z.toolCallTokens,
      toolResultTokens: z.toolResultTokens,
      attachmentTokens: z.attachmentTokens,
      assistantMessageTokens: z.assistantMessageTokens,
      userMessageTokens: z.userMessageTokens,
      redirectedContextTokens: x,
      unattributedTokens: de,
      toolCallsByType: Tt,
      attachmentsByType: kt
    };
    return {
      categories: oe,
      totalTokens: me,
      maxTokens: m,
      rawMaxTokens: m,
      autocompactSource: f,
      percentage: Math.round(me / m * 100),
      gridRows: We,
      model: d,
      memoryFiles: k,
      mcpTools: F,
      deferredBuiltinTools: undefined,
      systemTools: undefined,
      systemPromptSections: undefined,
      agents: N,
      slashCommands: W > 0 ? {
        totalCommands: j.totalCommands,
        includedCommands: j.includedCommands,
        tokens: W
      } : undefined,
      skills: J > 0 ? {
        totalSkills: K.totalSkills,
        includedSkills: K.includedSkills,
        tokens: J,
        skillFrontmatter: K.skillFrontmatter
      } : undefined,
      autoCompactThreshold: ne,
      isAutoCompactEnabled: Z,
      messageBreakdown: Ye,
      apiUsage: b
    };
  }
  var Frr = __lazy(() => {
    dz();
    at();
    Bm();
    LG();
    d$();
    tdo();
    aU();
    IV();
    ci();
    S9e();
    uTe();
    GEt();
    bx();
    VT();
    wb();
    vo();
    je();
    dt();
    Rn();
    ro();
    Eo();
    Lve();
    Nze();
    TO();
  });
  function RFe(e) {
    let t = GFl.get(e);
    if (t) {
      return t;
    }
    let n = toJSONSchema(e);
    GFl.set(e, n);
    return n;
  }
  var GFl;
  var $rr = __lazy(() => {
    $n();
    GFl = new WeakMap();
  });
  var w2o = {};