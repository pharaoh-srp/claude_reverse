  __export(tBl, {
    tryGetPDFReference: () => tryGetPDFReference,
    suppressNextSkillListing: () => suppressNextSkillListing,
    startRelevantMemoryPrefetch: () => startRelevantMemoryPrefetch,
    seedSentSkillNames: () => seedSentSkillNames,
    resetSentSkillNames: () => resetSentSkillNames,
    readMemoriesForSurfacing: () => readMemoriesForSurfacing,
    parseAtMentionedFileLines: () => parseAtMentionedFileLines,
    memoryHeader: () => memoryHeader,
    memoryFilesToAttachments: () => memoryFilesToAttachments,
    logDiagnosticsInjected: () => logDiagnosticsInjected,
    isSafeDynamicSkillName: () => isSafeDynamicSkillName,
    getToolSearchUsageReminderAttachments: () => getToolSearchUsageReminderAttachments,
    getTodoReminderMode: () => getTodoReminderMode,
    getSkillListingAttachments: () => getSkillListingAttachments,
    getQueuedCommandAttachments: () => getQueuedCommandAttachments,
    getPlanModeExitAttachment: () => getPlanModeExitAttachment,
    getPlanModeAttachmentTurnCount: () => getPlanModeAttachmentTurnCount,
    getMemoryUpdateAttachments: () => getMemoryUpdateAttachments,
    getMcpInstructionsDeltaAttachment: () => getMcpInstructionsDeltaAttachment,
    getFoldNudgeAttachment: () => getFoldNudgeAttachment,
    getDirectoriesToProcess: () => getDirectoriesToProcess,
    getDeferredToolsDeltaAttachment: () => getDeferredToolsDeltaAttachment,
    getDateChangeAttachments: () => getDateChangeAttachments,
    getContextEfficiencyAttachment: () => getContextEfficiencyAttachment,
    getChangedFiles: () => getChangedFiles_export,
    getAttachments: () => getAttachments,
    getAttachmentMessages: () => getAttachmentMessages,
    getAgentPendingMessageAttachments: () => getAgentPendingMessageAttachments,
    getAgentListingDeltaAttachment: () => getAgentListingDeltaAttachment,
    generateFileAttachment: () => generateFileAttachment,
    filterDuplicateMemoryAttachments: () => filterDuplicateMemoryAttachments,
    extractMcpResourceMentions: () => extractMcpResourceMentions,
    extractAtMentionedFiles: () => extractAtMentionedFiles,
    extractAkiSearchTerms: () => extractAkiSearchTerms,
    extractAgentMentions: () => extractAgentMentions,
    evictSentSkillNames: () => evictSentSkillNames,
    createAttachmentMessage: () => createAttachmentMessage,
    computeSkillListingDelta: () => computeSkillListingDelta,
    collectSurfacedMemories: () => collectSurfacedMemories,
    clearSentSkillNamesForAgent: () => clearSentSkillNamesForAgent,
    UNSAFE_DYNAMIC_SKILL_CHARS: () => UNSAFE_DYNAMIC_SKILL_CHARS,
    ULTRA_EFFORT_CONFIG: () => ULTRA_EFFORT_CONFIG,
    TODO_REMINDER_CONFIG: () => TODO_REMINDER_CONFIG,
    RELEVANT_MEMORIES_CONFIG: () => RELEVANT_MEMORIES_CONFIG,
    PLAN_MODE_ATTACHMENT_CONFIG: () => PLAN_MODE_ATTACHMENT_CONFIG
  });
  function getTodoReminderMode() {
    let e = Me.CLAUDE_CODE_TODO_REMINDER_MODE;
    if (e !== undefined) {
      return e;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_soft_slate_nudge", "baseline") === "off" ? "off" : "baseline";
  }
  async function getAttachments(e, t, n, r, o, s, i) {
    let a = Yg(t.options.mainLoopModel);
    if (st(process.env.CLAUDE_CODE_DISABLE_ATTACHMENTS) || Me.CLAUDE_CODE_SIMPLE || t.options.bareFork) {
      return [...(await getQueuedCommandAttachments(r, a)), ...getAgentListingDeltaAttachment(t, o)];
    }
    let l = createAbortController();
    let c = setTimeout(b => b.abort(), 1000, l);
    let u = {
      ...t,
      abortController: l
    };
    let d = !t.agentId;
    let p = e ? [ng("at_mentioned_files", () => TUm(e, u)), ng("mcp_resources", () => vUm(e, u)), ng("agent_mentions", () => Promise.resolve(EUm(e, t.options.agentDefinitions.activeAgents)))] : [];
    let m = await Promise.all(p);
    let f = (() => {
      let b;
      return () => b ??= sR() ? LUm(o, t) : MUm(o, t);
    })();
    let h = [ng("queued_commands", () => getQueuedCommandAttachments(r, a)), ng("date_change", () => Promise.resolve(getDateChangeAttachments(o))), ng("ultrathink_effort", () => Promise.resolve(mUm(e))), ng("deferred_tools_delta", () => Promise.resolve(getDeferredToolsDeltaAttachment(t.options.tools, t.options.mainLoopModel, o, {
      callSite: d ? "attachments_main" : "attachments_subagent",
      querySource: s
    }, t.options.mcpClients.filter(b => b.type === "pending").map(b => b.name), getIsNonInteractiveSession() ? t.options.mcpClients.filter(b => b.type === "needs-auth").map(b => b.name) : undefined))), ng("agent_listing_delta", () => Promise.resolve(getAgentListingDeltaAttachment(t, o))), ng("mcp_instructions_delta", () => Promise.resolve(getMcpInstructionsDeltaAttachment(t.options.mcpClients, t.options.tools, t.options.mainLoopModel, o))), ng("changed_files", () => getChangedFiles_export(u)), ng("nested_memory", () => CUm(u)), ng("dynamic_skill", () => IUm(u)), ng("skill_listing", () => getSkillListingAttachments(u)), ng("plan_mode", () => uUm(e, o, t, i)), ng("plan_mode_exit", () => getPlanModeExitAttachment(o, t)), ng("auto_mode", () => dUm(o, t)), ng("auto_mode_exit", () => pUm(o, t)), ng("todo_reminders", f), ...(GXr() !== null ? [ng("tool_search_usage_reminder", () => getToolSearchUsageReminderAttachments(o, t, async () => (await f()).length > 0))] : []), ...(isAgentSwarmsEnabled() ? [ng("teammate_mailbox", async () => $Um(t)), ng("team_context", async () => HUm(o ?? []))] : []), ng("agent_pending_messages", async () => getAgentPendingMessageAttachments(t)), ng("critical_system_reminder", () => Promise.resolve(gUm(t))), ng("total_tokens_reminder", () => Promise.resolve(e === null ? qUm(o ?? [], t.options.mainLoopModel, t.agentId) : []))];
    let g = d ? [...(dT() ? [ng("workflow_keyword_request", () => Promise.resolve(i?.isRegularUserPrompt && !i.suppressWorkflowKeyword && RDn() ? fUm(i.preExpansionInput ?? e) : [])), ng("ultra_effort_enter", () => Promise.resolve(i?.isRegularUserPrompt ? hUm(o, t) : []))] : []), ng("ide_selection", async () => _Um(n, t)), ng("ide_opened_file", async () => SUm(n, t)), ng("output_style", () => yUm()), ng("diagnostics", async () => PUm(t)), ng("lsp_diagnostics", async () => OUm(t)), ng("unified_tasks", async () => UUm(t)), ng("async_hook_responses", async () => BUm()), ng("memory_update", () => Promise.resolve(getMemoryUpdateAttachments(t))), ng("token_usage", async () => Promise.resolve(jUm(o ?? [], t.options.mainLoopModel, t.options.autoCompactWindow))), ng("budget_usd", async () => Promise.resolve(GUm(t.options.maxBudgetUsd))), ng("output_token_usage", async () => Promise.resolve(WUm()))] : [];
    let [y, _] = await Promise.all([Promise.all(h), Promise.all(g)]);
    clearTimeout(c);
    return [...m.flat(), ...y.flat(), ..._.flat()].filter(b => b !== undefined && b !== null);
  }
  async function ng(e, t) {
    let n = Date.now();
    try {
      let r = await t();
      let o = Date.now() - n;
      if (Math.random() < 0.05) {
        let s = r.filter(i => i !== undefined && i !== null).reduce((i, a) => i + De(a).length, 0);
        logEvent("tengu_attachment_compute_duration", {
          label: e,
          duration_ms: o,
          attachment_size_bytes: s,
          attachment_count: r.length
        });
      }
      return r;
    } catch (r) {
      let o = Date.now() - n;
      if (Math.random() < 0.05) {
        logEvent("tengu_attachment_compute_duration", {
          label: e,
          duration_ms: o,
          error: true
        });
      }
      if (r instanceof Y2) {
        logForDebugging(`Attachment image resize failed in ${e}: ${r.message}`, {
          level: "error"
        });
      } else {
        Oe($o(sr(r), "attachment generator failed"));
      }
      logAntError(`Attachment error in ${e}`, r);
      return [];
    }
  }
  async function getQueuedCommandAttachments(e, t) {
    if (!e) {
      return [];
    }
    let n = e.filter(r => iUm.vZc(r.mode));
    return Promise.all(n.map(async r => {
      let o = await lUm(r.pastedContents, t);
      let s = r.value;
      if (o.length > 0) {
        s = [{
          type: "text",
          text: typeof r.value === "string" ? r.value : Tl(r.value, `
`)
        }, ...o];
      }
      return {
        type: "queued_command",
        prompt: s,
        source_uuid: r.uuid,
        imagePasteIds: gUl(r.pastedContents),
        fileAttachments: r.fileAttachments,
        commandMode: r.mode,
        origin: r.origin,
        timestamp: r.timestamp,
        isMeta: r.isMeta,
        ...(r.verifiedSlackHumanTurn && {
          verifiedSlackHumanTurn: true
        })
      };
    })).then(aUm);
  }
  function aUm(e) {
    let t = r => r.verifiedSlackHumanTurn === true && BG(r.origin) && typeof r.prompt === "string";
    let n = 0;
    while (n < e.length) {
      if (!t(e[n])) {
        n++;
        continue;
      }
      let r = n + 1;
      while (r < e.length && t(e[r])) {
        r++;
      }
      if (r - n >= 2) {
        let o = e.slice(n, r);
        o[0].batchedRelayPrompts = o.map(s => s.prompt);
        for (let s = 1; s < o.length; s++) {
          o[s].renderedByBatchHead = true;
        }
      }
      n = r;
    }
    return e;
  }
  function getAgentPendingMessageAttachments(e) {
    let t = e.agentId;
    if (!t) {
      return [];
    }
    return m5n(t, e.taskRegistry).map(r => ({
      type: "queued_command",
      prompt: r.text,
      source_uuid: t$o.randomUUID(),
      origin: r.origin,
      isMeta: r.isMeta
    }));
  }
  async function lUm(e, t) {
    if (!e) {
      return [];
    }
    let n = Object.values(e).filter(D7e);
    if (n.length === 0) {
      return [];
    }
    return await Promise.all(n.map(async o => {
      let {
        block: s
      } = await f1({
        data: o.content,
        mediaType: o.mediaType,
        limits: t
      });
      return s;
    }));
  }
  function getPlanModeAttachmentTurnCount(e) {
    let t = 0;
    let n = false;
    for (let r = e.length - 1; r >= 0; r--) {
      let o = e[r];
      if (o?.type === "user" && !o.isMeta && !zUl(o.message.content)) {
        t++;
      } else if (o?.type === "attachment" && (o.attachment.type === "plan_mode" || o.attachment.type === "plan_mode_reentry")) {
        n = true;
        break;
      } else if (o?.type === "attachment" && o.attachment.type === "plan_mode_exit") {
        break;
      }
    }
    return {
      turnCount: t,
      foundPlanModeAttachment: n
    };
  }
  function cUm(e) {
    let t = 0;
    for (let n = e.length - 1; n >= 0; n--) {
      let r = e[n];
      if (r?.type === "attachment") {
        if (r.attachment.type === "plan_mode_exit") {
          break;
        }
        if (r.attachment.type === "plan_mode") {
          t++;
        }
      }
    }
    return t;
  }
  async function uUm(e, t, n, r) {
    if (getToolPermissionContext(n).mode !== "plan") {
      return [];
    }
    if (t && t.length > 0) {
      let {
        turnCount: u,
        foundPlanModeAttachment: d
      } = getPlanModeAttachmentTurnCount(t);
      if (d && u < PLAN_MODE_ATTACHMENT_CONFIG.TURNS_BETWEEN_ATTACHMENTS) {
        return [];
      }
    }
    getPlanSlug(getSessionId(), r?.planSlugSeed ?? e ?? undefined);
    let s = getPlanFilePath(n.agentId);
    let i = getPlan(n.agentId);
    let a = [];
    if (hasExitedPlanModeInSession() && i !== null) {
      a.push({
        type: "plan_mode_reentry",
        planFilePath: s
      });
      setHasExitedPlanMode(false);
    }
    let c = (cUm(t ?? []) + 1) % PLAN_MODE_ATTACHMENT_CONFIG.FULL_REMINDER_EVERY_N_ATTACHMENTS === 1 ? "full" : "sparse";
    a.push({
      type: "plan_mode",
      reminderType: c,
      isSubAgent: !!n.agentId,
      planFilePath: s,
      planExists: i !== null,
      customInstructions: n.options.planModeInstructions
    });
    return a;
  }
  async function getPlanModeExitAttachment(e, t) {
    if (getToolPermissionContext(t).mode === "plan") {
      setNeedsPlanModeExitAttachment(false);
      return [];
    }
    let {
      foundPlanModeAttachment: n
    } = getPlanModeAttachmentTurnCount(e ?? []);
    if (!needsPlanModeExitAttachment() && !n) {
      return [];
    }
    setNeedsPlanModeExitAttachment(false);
    let r = getPlanFilePath(t.agentId);
    let o = getPlan(t.agentId) !== null;
    return [{
      type: "plan_mode_exit",
      planFilePath: r,
      planExists: o
    }];
  }
  function BUl(e) {
    for (let t = e.length - 1; t >= 0; t--) {
      let n = e[t];
      if (n?.type !== "attachment") {
        continue;
      }
      if (n.attachment.type === "auto_mode") {
        return true;
      }
      if (n.attachment.type === "auto_mode_exit") {
        return false;
      }
    }
    return false;
  }
  async function dUm(e, t) {
    if (getToolPermissionContext(t).mode !== "auto") {
      return [];
    }
    if (_g(t.options.mainLoopModel)) {
      return [];
    }
    if (BUl(e ?? [])) {
      return [];
    }
    return [{
      type: "auto_mode"
    }];
  }
  async function pUm(e, t) {
    if (!needsAutoModeExitAttachment()) {
      return [];
    }
    if (setNeedsAutoModeExitAttachment(false), getToolPermissionContext(t).mode === "auto" || (sUm?.isAutoModeActive() ?? false)) {
      return [];
    }
    if (!BUl(e ?? [])) {
      return [];
    }
    return [{
      type: "auto_mode_exit"
    }];
  }
  function getDateChangeAttachments(e) {
    let t = euo();
    if (getLastEmittedDate() !== t) {
      setLastEmittedDate(t);
    }
    if (fTe() === t) {
      return [];
    }
    for (let r of kg(e ?? [])) {
      if (r.type !== "attachment") {
        continue;
      }
      if (r.attachment.type === "date_change" && r.attachment.newDate === t) {
        return [];
      }
    }
    return [{
      type: "date_change",
      newDate: t
    }];
  }
  function mUm(e) {
    if (!c4e() || !e || !QPi(e)) {
      return [];
    }
    logEvent("tengu_ultrathink", {});
    return [{
      type: "ultrathink_effort"
    }];
  }
  function fUm(e) {
    if (!e || !AUl(e)) {
      return [];
    }
    logEvent("tengu_workflow_keyword", {});
    return [{
      type: "workflow_keyword_request"
    }];
  }
  function hUm(e, t) {
    let n = Jne(t.options.mainLoopModel, getEffortValue(t), getUltracodeRequested(t));
    let r = "none";
    let o = 0;
    if (e) {
      for (let s = e.length - 1; s >= 0; s--) {
        let i = e[s];
        if (i === undefined) {
          continue;
        }
        if (i.type === "attachment") {
          if (i.attachment.type === "ultra_effort_enter") {
            r = "enter";
            break;
          }
          if (i.attachment.type === "ultra_effort_exit") {
            r = "exit";
            break;
          }
        } else if (i.type === "user" && !i.isMeta && !zUl(i.message.content)) {
          o++;
        }
      }
    }
    if (n) {
      if (r !== "enter") {
        logEvent("tengu_ultra_effort", {
          is_enter: true,
          is_full: true
        });
        return [{
          type: "ultra_effort_enter",
          reminderType: "full"
        }];
      }
      if (o >= ULTRA_EFFORT_CONFIG.TURNS_BETWEEN_MAINTENANCE) {
        logEvent("tengu_ultra_effort", {
          is_enter: true,
          is_full: false
        });
        return [{
          type: "ultra_effort_enter",
          reminderType: "sparse"
        }];
      }
      return [];
    }
    if (r === "enter") {
      logEvent("tengu_ultra_effort", {
        is_enter: false
      });
      return [{
        type: "ultra_effort_exit"
      }];
    }
    return [];
  }
  function getDeferredToolsDeltaAttachment(e, t, n, r, o, s) {
    if (!P1()) {
      return [];
    }
    if (!CX(t)) {
      return [];
    }
    if (!isToolSearchToolAvailable(e)) {
      return [];
    }
    let i = getDeferredToolsDelta(e, n ?? [], r, o, s);
    if (!i) {
      return [];
    }
    return [{
      type: "deferred_tools_delta",
      ...i
    }];
  }
  function getAgentListingDeltaAttachment(e, t) {
    if (!e.options.tools.some(p => bl(p, "Agent"))) {
      return [];
    }
    let {
      activeAgents: n,
      allowedAgentTypes: r
    } = e.options.agentDefinitions;
    let o = new Set();
    for (let p of e.options.tools) {
      let m = cmt(p);
      if (m) {
        o.add(m);
      }
    }
    let s = getToolPermissionContext(e);
    let i = filterDeniedAgents(filterAgentsByMcpRequirements(n, [...o]), s, "Agent");
    if (r) {
      i = i.filter(p => r.includes(p.agentType));
    }
    let a = new Set();
    for (let p of t ?? []) {
      if (p.type !== "attachment") {
        continue;
      }
      if (p.attachment.type !== "agent_listing_delta") {
        continue;
      }
      for (let m of p.attachment.addedTypes) {
        a.add(m);
      }
      for (let m of p.attachment.removedTypes) {
        a.delete(m);
      }
    }
    let l = new Set(i.map(p => p.agentType));
    let c = i.filter(p => !a.vZc(p.agentType));
    let u = [];
    for (let p of a) {
      if (!l.vZc(p)) {
        u.push(p);
      }
    }
    if (c.length === 0 && u.length === 0) {
      return [];
    }
    c.sort((p, m) => p.agentType.localeCompare(m.agentType));
    u.sort();
    let d = _g(e.options.mainLoopModel);
    return [{
      type: "agent_listing_delta",
      addedTypes: c.map(p => p.agentType),
      addedLines: c.map(p => V0l(p, d)),
      removedTypes: u,
      isInitial: a.size === 0,
      showConcurrencyNote: getSubscriptionType() !== "pro"
    }];
  }
  function getMcpInstructionsDeltaAttachment(e, t, n, r) {
    let o = [];
    if (P1() && CX(n) && isToolSearchToolAvailable(t)) {
      o.push({
        serverName: "claude-in-chrome",
        block: bUl
      });
    }
    o.push({
      serverName: "computer-use",
      block: SUl
    });
    let s = yUl(e, r ?? [], o);
    if (!s) {
      return [];
    }
    return [{
      type: "mcp_instructions_delta",
      ...s
    }];
  }
  function gUm(e) {
    let t = e.criticalSystemReminder_EXPERIMENTAL;
    if (!t) {
      return [];
    }
    return [{
      type: "critical_system_reminder",
      content: t
    }];
  }
  async function yUm() {
    let t = getInitialSettings()?.outputStyle || "default";
    if (t === "default") {
      return [];
    }
    let n = await por();
    return [{
      type: "output_style",
      style: t,
      turnReminder: n?.turnReminder
    }];
  }
  async function _Um(e, t) {
    if (e?.source === "diff" && e.text) {
      return [{
        type: "selected_lines_in_diff",
        lineCount: e.lineCount,
        content: e.text,
        filePath: e.filePath
      }];
    }
    let n = g5t(t.options.mcpClients);
    if (!n || e?.lineStart === undefined || !e.text || !e.filePath) {
      return [];
    }
    if (YEt(e.filePath, getToolPermissionContext(t))) {
      return [];
    }
    return [{
      type: "selected_lines_in_ide",
      ideName: n,
      lineStart: e.lineStart,
      lineEnd: e.lineStart + e.lineCount - 1,
      filename: e.filePath,
      content: e.text,
      displayPath: zw.relative(Nt(), e.filePath)
    }];
  }
  function getDirectoriesToProcess(e, t) {
    let n = zw.dirname(zw.resolve(e));
    if (!n.startsWith(t)) {
      try {
        let i = zt().realpathSync(n);
        if (i.startsWith(t)) {
          n = i;
        }
      } catch {}
    }
    let r = [];
    let o = n;
    while (o !== t && o !== zw.parse(o).root) {
      if (o.startsWith(t)) {
        r.push(o);
      }
      o = zw.dirname(o);
    }
    r.reverse();
    let s = [];
    o = t;
    while (o !== zw.parse(o).root) {
      s.push(o);
      o = zw.dirname(o);
    }
    s.reverse();
    return {
      nestedDirs: r,
      cwdLevelDirs: s
    };
  }
  function bUm(e) {
    return e === "User" || e === "Project" || e === "Local" || e === "Managed";
  }
  function memoryFilesToAttachments(e, t, n) {
    let r = [];
    let o = hasInstructionsLoadedHook();
    for (let s of e) {
      if (t.loadedNestedMemoryPaths?.[s.path]) {
        continue;
      }
      if (!t.readFileState.vZc(s.path)) {
        if (r.push({
          type: "nested_memory",
          path: s.path,
          content: s,
          displayPath: zw.relative(Nt(), s.path)
        }), t.loadedNestedMemoryPaths) {
          t.loadedNestedMemoryPaths[s.path] = true;
        }
        if (t.readFileState.set(s.path, {
          content: s.contentDiffersFromDisk ? s.rawContent ?? s.content : s.content,
          timestamp: Date.now(),
          offset: undefined,
          limit: undefined,
          isPartialView: s.contentDiffersFromDisk,
          keepContent: true
        }), o && bUm(s.type)) {
          let i = s.globs ? "path_glob_match" : s.parent ? "include" : "nested_traversal";
          executeInstructionsLoadedHooks(s.path, s.type, i, {
            globs: s.globs,
            triggerFilePath: n,
            parentFilePath: s.parent
          });
        }
      }
    }
    return r;
  }
  async function jUl(e, t, n) {
    if (Me.CLAUDE_CODE_DISABLE_CLAUDE_MDS) {
      return [];
    }
    let r = [];
    try {
      if (!pathInAllowedWorkingPath(e, n.toolPermissionContext)) {
        return r;
      }
      let o = new Set();
      let s = getOriginalCwd();
      let i = await getManagedAndUserConditionalRules(e, o);
      r.push(...memoryFilesToAttachments(i, t, e));
      let {
        nestedDirs: a,
        cwdLevelDirs: l
      } = getDirectoriesToProcess(e, s);
      let c = getFeatureValue_CACHED_MAY_BE_STALE("tengu_paper_halyard", false);
      for (let u of a) {
        let d = (await getMemoryFilesForNestedDirectory(u, e, o)).filter(p => !c || p.type !== "Project" && p.type !== "Local");
        r.push(...memoryFilesToAttachments(d, t, e));
      }
      for (let u of l) {
        let d = (await getConditionalRulesForCwdLevelDirectory(u, e, o)).filter(p => !c || p.type !== "Project" && p.type !== "Local");
        r.push(...memoryFilesToAttachments(d, t, e));
      }
    } catch (o) {
      Oe(o);
    }
    return r;
  }
  async function SUm(e, t) {
    if (!e?.filePath || e.text) {
      return [];
    }
    let n = getToolPermissionContext(t);
    if (YEt(e.filePath, n)) {
      return [];
    }
    return [...(await jUl(e.filePath, t, {
      toolPermissionContext: n
    })), {
      type: "opened_file_in_ide",
      filename: e.filePath
    }];
  }
  async function TUm(e, t) {
    let n = extractAtMentionedFiles(e);
    if (n.length === 0) {
      return [];
    }
    let r = getToolPermissionContext(t);
    return (await Promise.all(n.map(async s => {
      try {
        let {
          filename: i,
          lineStart: a,
          lineEnd: l
        } = parseAtMentionedFileLines(s);
        if (isUntrustedUncPath(i, r.trustedNetworkDirectories)) {
          Ae("input_file_at_mention", "denied");
          return null;
        }
        let c = us(i);
        if (YEt(c, r)) {
          Ae("input_file_at_mention", "denied");
          return null;
        }
        try {
          if ((await JEt.stat(c)).isDirectory()) {
            try {
              let p = await JEt.readdir(c, {
                withFileTypes: true
              });
              let m = 1000;
              let f = p.length > 1000;
              let h = p.slice(0, 1000).map(y => y.name);
              if (f) {
                h.push(`\u2026 and ${p.length - 1000} more entries`);
              }
              let g = h.join(`
`);
              logEvent("tengu_at_mention_extracting_directory_success", {});
              Pe("input_dir_at_mention");
              XF({
                mentionType: "directory",
                success: true
              });
              return {
                type: "directory",
                path: c,
                content: g,
                displayPath: zw.relative(Nt(), c)
              };
            } catch {
              logEvent("tengu_at_mention_extracting_directory_error", {});
              Ae("input_dir_at_mention", "readdir_failed");
              return null;
            }
          }
        } catch {}
        let u = await generateFileAttachment(c, t, "tengu_at_mention_extracting_filename_success", "tengu_at_mention_extracting_filename_error", "at-mention", {
          offset: a,
          limit: l && a ? l - a + 1 : undefined
        });
        if (u) {
          Pe("input_file_at_mention");
        }
        return u;
      } catch {
        logEvent("tengu_at_mention_extracting_filename_error", {});
        XF({
          mentionType: "file",
          success: false
        });
      }
    }))).filter(Boolean);
  }
  function EUm(e, t) {
    let n = extractAgentMentions(e);
    if (n.length === 0) {
      return [];
    }
    return n.map(o => {
      let s = o.replace("agent-", "");
      let i = t.find(a => a.agentType === s);
      if (!i) {
        logEvent("tengu_at_mention_agent_not_found", {});
        XF({
          mentionType: "agent",
          success: false
        });
        return null;
      }
      logEvent("tengu_at_mention_agent_success", {});
      XF({
        mentionType: "agent",
        success: true
      });
      return {
        type: "agent_mention",
        agentType: i.agentType
      };
    }).filter(o => o !== null);
  }
  async function vUm(e, t) {
    let n = extractMcpResourceMentions(e);
    if (n.length === 0) {
      return [];
    }
    let r = t.options.mcpClients || [];
    return (await Promise.all(n.map(async s => {
      try {
        let [i, ...a] = s.split(":");
        let l = a.join(":");
        if (!i || !l) {
          logEvent("tengu_at_mention_mcp_resource_error", {});
          XF({
            mentionType: "mcp_resource",
            success: false
          });
          return null;
        }
        let c = r.find(p => p.name === i);
        if (!c || c.type !== "connected") {
          logEvent("tengu_at_mention_mcp_resource_error", {});
          XF({
            mentionType: "mcp_resource",
            success: false
          });
          return null;
        }
        let d = (t.options.mcpResources?.[i] || []).find(p => p.uri === l);
        if (!d) {
          logEvent("tengu_at_mention_mcp_resource_error", {});
          XF({
            mentionType: "mcp_resource",
            success: false
          });
          return null;
        }
        try {
          let p = await c.client.readResource({
            uri: l
          });
          logEvent("tengu_at_mention_mcp_resource_success", {});
          XF({
            mentionType: "mcp_resource",
            success: true
          });
          return {
            type: "mcp_resource",
            server: i,
            uri: l,
            name: d.name || l,
            description: d.description,
            content: p
          };
        } catch (p) {
          logEvent("tengu_at_mention_mcp_resource_error", {});
          XF({
            mentionType: "mcp_resource",
            success: false
          });
          logForDebugging(`MCP resource read failed for ${i} ${l}: ${p instanceof Error ? p.message : String(p)}`, {
            level: "error"
          });
          return null;
        }
      } catch {
        logEvent("tengu_at_mention_mcp_resource_error", {});
        XF({
          mentionType: "mcp_resource",
          success: false
        });
        return null;
      }
    }))).filter(s => s !== null);
  }
  async function getChangedFiles_export(e) {
    let t = aDe(e.readFileState);
    if (t.length === 0) {
      return [];
    }
    let n = getToolPermissionContext(e);
    let o = (await Promise.all(t.map(async i => {
      let a = e.readFileState.get(i);
      if (!a) {
        return null;
      }
      if (a.offset !== undefined || a.limit !== undefined) {
        return null;
      }
      let l = us(i);
      if (YEt(l, n)) {
        return null;
      }
      try {
        if ((await aje(l)) <= a.timestamp) {
          return null;
        }
        let u = {
          file_path: l
        };
        if (!(await iy.validateInput(u, e)).result) {
          return null;
        }
        let p = await iy.call(u, e);
        if (p.data.type === "text") {
          if (p.data.file.truncatedByTokenCap === true) {
            return null;
          }
          if (vde(a, p.data.file.content)) {
            return null;
          }
          let m = $Oa(a.content, p.data.file.content);
          if (m === "") {
            return null;
          }
          return {
            type: "edited_text_file",
            filename: l,
            snippet: m
          };
        }
        if (p.data.type === "image") {
          try {
            let m = await q2o(l, undefined, undefined, Yg(e.options.mainLoopModel));
            return {
              type: "edited_image_file",
              filename: l,
              content: m
            };
          } catch (m) {
            logForDebugging(`Failed to read changed image file ${l}: ${m instanceof Error ? m.message : String(m)}`, {
              level: "error"
            });
            logEvent("tengu_watched_file_compression_failed", {
              ext: Qj(l),
              ...o1(m)
            });
            return null;
          }
        }
        return null;
      } catch (c) {
        if (fn(c)) {
          e.readFileState.delete(i);
        }
        return null;
      }
    }))).filter(i => i != null);
    let s = 0;
    for (let i of o) {
      if (i.type !== "edited_text_file") {
        continue;
      }
      if (s >= 16384) {
        i.snippet = "";
      } else {
        s += i.snippet.length;
      }
    }
    return o;
  }
  async function CUm(e) {
    let {
      nestedMemoryAttachmentTriggers: t,
      pendingNestedMemoryTriggers: n
    } = e;
    if (t && n && !e.agentId) {
      for (let s of n) {
        if (!t.includes(s)) {
          t.push(s);
        }
      }
      n.length = 0;
    }
    if (Me.CLAUDE_CODE_DISABLE_CLAUDE_MDS) {
      if (t) {
        t.length = 0;
      }
      return [];
    }
    if (!t || t.length === 0) {
      return [];
    }
    let r = getToolPermissionContext(e);
    let o = [];
    for (let s of t) {
      let i = await jUl(s, e, {
        toolPermissionContext: r
      });
      o.push(...i);
    }
    t.length = 0;
    return o;
  }
  async function RUm(e, t, n, r, o, s, i) {
    let a = extractAgentMentions(e).flatMap(g => {
      let y = g.replace("agent-", "");
      let _ = t.find(b => b.agentType === y);
      return _?.memory ? [flt(y, _.memory)] : [];
    });
    let l = a.length > 0 ? a : [vf()];
    let c = xUm(i, o);
    let u = Promise.resolve([]);
    await vMa(o);
    let p = (await Promise.all(l.map((g, y) => IUl(e, g, n, o, s, y === 0 ? c : u).catch(() => ({
      memories: [],
      knowledge: []
    }))))).flatMap(g => g.memories).filter(g => !r.vZc(g.path) && !s.vZc(g.path)).slice(0, 5);
    let m = await readMemoriesForSurfacing(p, o);
    let f = [];
    let h = [...m, ...f];
    if (h.length === 0) {
      return [];
    }
    return [{
      type: "relevant_memories",
      memories: h
    }];
  }
  async function extractAkiSearchTerms(e, t) {
    return [];
  }
  async function xUm(e, t) {
    try {
      return [];
    } catch {
      return [];
    }
  }
  function collectSurfacedMemories(e) {
    let t = new Set();
    let n = 0;
    for (let r of e) {
      if (r.type === "attachment" && r.attachment.type === "relevant_memories") {
        for (let o of r.attachment.memories) {
          t.add(o.path);
          n += o.content.length;
        }
      }
    }
    return {
      paths: t,
      totalBytes: n
    };
  }
  async function readMemoriesForSurfacing(e, t) {
    return (await Promise.all(e.map(async ({
      path: r,
      mtimeMs: o
    }) => {
      try {
        let s = await MEt(r, 0, 200, 4096, t, {
          truncateOnByteLimit: true
        });
        let i = s.totalLines > 200 || s.truncatedByBytes;
        let a = i ? s.content + `

> This memory file was truncated (${s.truncatedByBytes ? `${4096} byte limit` : `first ${200} lines`}). Use the ${"Read"} tool to view the complete file at: ${r}` : s.content;
        return {
          path: r,
          content: a,
          mtimeMs: o,
          header: memoryHeader(r, o),
          limit: i ? s.lineCount : undefined
        };
      } catch {
        return null;
      }
    }))).filter(r => r !== null);
  }
  function memoryHeader(e, t) {
    let n = Uco(t);
    return n ? `${n}

Memory: ${e}:` : `Memory: ${e}:`;
  }
  function startRelevantMemoryPrefetch(e, t, n, r) {
    let o = t.memorySelector;
    if (!o || t.agentId || !Vd() || !Gat() || kUm.vZc(n)) {
      return;
    }
    let s = e.findLast(m => m.type === "user" && !m.isMeta);
    if (!s) {
      return;
    }
    let i = qO(s);
    if (!i || !/\s/.test(i.trim())) {
      return;
    }
    let a = collectSurfacedMemories(e);
    if (a.totalBytes >= RELEVANT_MEMORIES_CONFIG.MAX_SESSION_BYTES) {
      return;
    }
    let l = createChildAbortController(t.abortController);
    let c = Date.now();
    let u = r && {
      ...r,
      toolUseContext: {
        ...t,
        abortController: l
      },
      forkContextMessages: [...e]
    };
    let d = RUm(i, t.options.agentDefinitions.activeAgents, o, t.readFileState, l.signal, a.paths, u).catch(m => {
      if (!mg(m)) {
        Oe(m);
      }
      return [];
    });
    let p = {
      promise: d,
      settledAt: null,
      consumedOnIteration: -1,
      [Symbol.dispose]() {
        l.abort();
        let m = o.lastUsage;
        logEvent("tengu_memdir_prefetch_collected", {
          hidden_by_first_iteration: p.settledAt !== null && p.consumedOnIteration === 0,
          consumed_on_iteration: p.consumedOnIteration,
          latency_ms: (p.settledAt ?? Date.now()) - c,
          cache_read_input_tokens: m?.cacheReadInputTokens,
          cache_creation_input_tokens: m?.cacheCreationInputTokens,
          selector_turn_count: m?.turnCount
        });
      }
    };
    d.finally(() => {
      p.settledAt = Date.now();
    });
    return p;
  }
  function AUm(e) {
    return typeof e === "object" && e !== null && e.type === "tool_result" && typeof e.tool_use_id === "string";
  }
  function zUl(e) {
    return Array.isArray(e) && e.some(AUm);
  }
  function filterDuplicateMemoryAttachments(e, t) {
    return e.map(n => {
      if (n.type !== "relevant_memories") {
        return n;
      }
      let r = n.memories.filter(o => !t.vZc(o.path));
      for (let o of r) {
        t.set(o.path, {
          content: o.content,
          timestamp: o.mtimeMs,
          offset: undefined,
          limit: o.limit
        });
      }
      return r.length > 0 ? {
        ...n,
        memories: r
      } : null;
    }).filter(n => n !== null);
  }
  function isSafeDynamicSkillName(e) {
    return e.length > 0 && e.length <= 256 && !UNSAFE_DYNAMIC_SKILL_CHARS.test(e);
  }
  async function IUm(e) {
    let t = e.dynamicSkillDirTriggers;
    if (!t || t.length === 0) {
      return [];
    }
    let n = [...t];
    if (t.length = 0, getDisableSlashCommands()) {
      return [];
    }
    if ((null)?.isSkillsAsToolsEnabled()) {
      return [];
    }
    if (!e.options.tools.some(c => bl(c, "Skill"))) {
      return [];
    }
    await INe(n).catch(() => {});
    let r = getProjectRoot();
    let o = r.endsWith(zw.sep) ? r : r + zw.sep;
    let s = await getSkillToolCommands(getProjectRoot());
    if (e.agentId === undefined) {
      s = filterSkillCommandsByAllowlist(s, getSessionSkillAllowlist());
    }
    let i = new Map();
    for (let c of s) {
      if (c.type === "prompt" && c.skillRoot) {
        i.set(c.skillRoot, c.name);
      }
    }
    let a = [];
    let l = await Promise.all(n.map(async c => {
      try {
        let d = (await JEt.readdir(c, {
          withFileTypes: true
        })).filter(m => m.isDirectory() || m.isSymbolicLink()).map(m => m.name);
        let p = await Promise.all(d.map(async m => {
          try {
            await JEt.stat(zw.resolve(c, m, "SKILL.md"));
          } catch {
            return null;
          }
          let f = i.get(zw.resolve(c, m));
          if (!f || !isSafeDynamicSkillName(f)) {
            return null;
          }
          return f;
        }));
        return {
          skillDir: c,
          skillNames: p.filter(m => m !== null)
        };
      } catch {
        return {
          skillDir: c,
          skillNames: []
        };
      }
    }));
    for (let {
      skillDir: c,
      skillNames: u
    } of l) {
      if (u.length === 0) {
        continue;
      }
      let d = zw.relative(r, c);
      if (UNSAFE_DYNAMIC_SKILL_CHARS.test(d) || !c.startsWith(o)) {
        continue;
      }
      a.push({
        type: "dynamic_skill",
        skillDir: c,
        skillNames: u,
        displayPath: d
      });
    }
    return a;
  }
  function resetSentSkillNames() {
    kXt.clear();
    lor = false;
    vwe = null;
  }
  function evictSentSkillNames(e) {
    for (let t of kXt.values()) {
      for (let n of e) {
        t.delete(n);
      }
    }
    if (vwe !== null) {
      for (let t of e) {
        vwe.delete(t);
      }
    }
  }
  function clearSentSkillNamesForAgent(e) {
    kXt.delete(e);
  }
  function suppressNextSkillListing() {
    lor = true;
  }
  function seedSentSkillNames(e) {
    if (vwe === null) {
      vwe = new Set();
    }
    for (let t of e) {
      vwe.add(t);
    }
  }
  function computeSkillListingDelta(e, t) {
    let n = e ?? "";
    let r = kXt.get(n);
    if (!r) {
      r = new Set();
      kXt.set(n, r);
    }
    if (vwe !== null && e === undefined) {
      for (let i of t) {
        if (vwe.vZc(i.name)) {
          r.add(i.name);
        }
      }
      vwe = null;
    }
    if (lor && e === undefined) {
      lor = false;
      for (let i of t) {
        r.add(i.name);
      }
      return null;
    }
    let o = t.filter(i => !r.vZc(i.name));
    if (o.length === 0) {
      return null;
    }
    let s = r.size === 0;
    for (let i of o) {
      r.add(i.name);
    }
    return {
      newSkills: o,
      isInitial: s
    };
  }
  async function getSkillListingAttachments(e) {
    if (getDisableSlashCommands()) {
      return [];
    }
    if ((null)?.isSkillsAsToolsEnabled()) {
      return [];
    }
    if (!e.options.tools.some(u => bl(u, "Skill"))) {
      return [];
    }
    let t = getProjectRoot();
    let n = await getSkillToolCommands(t);
    let r = getMcpSkillCommands(e.getMcp().commands);
    let o = dropShadowedBundledSkills(r.length > 0 ? dropShadowedFallbackSkills(gyp([...n, ...r], "name")) : n);
    if (e.agentId === undefined) {
      o = filterSkillCommandsByAllowlist(o, getSessionSkillAllowlist());
    }
    let s = computeSkillListingDelta(e.agentId, o);
    if (s === null) {
      return [];
    }
    let {
      newSkills: i,
      isInitial: a
    } = s;
    logForDebugging(`Sending ${i.length} skills via attachment (${a ? "initial" : "dynamic"})`);
    let l = iT(e.options.mainLoopModel, getSdkBetas());
    return [{
      type: "skill_listing",
      content: formatCommandsWithinBudget(i, l, u => Nve(u.name), bytesPerTokenForModel(e.options.mainLoopModel)),
      skillCount: i.length,
      isInitial: a,
      names: i.map(u => u.name)
    }];
  }
  function extractAtMentionedFiles(e) {
    let t = /(^|[\s\u3002\u3001\uFF1F\uFF01])@"([^"]+)"/g;
    let n = /(^|[\s\u3002\u3001\uFF1F\uFF01])@([^\s]+)\b/g;
    let r = [];
    let o = [];
    let s;
    while ((s = t.exec(e)) !== null) {
      if (s[2] && !s[2].endsWith(" (agent)")) {
        r.push(s[2]);
      }
    }
    (e.match(n) || []).forEach(a => {
      let l = a.slice(a.indexOf("@") + 1);
      if (!l.startsWith('"')) {
        o.push(l);
      }
    });
    return Ro([...r, ...o]);
  }
  function extractMcpResourceMentions(e) {
    let t = /(^|[\s\u3002\u3001\uFF1F\uFF01])@([^\s]+:[^\s]+)\b/g;
    let n = e.match(t) || [];
    return Ro(n.map(r => r.slice(r.indexOf("@") + 1)));
  }
  function extractAgentMentions(e) {
    let t = [];
    let n = /(^|[\s\u3002\u3001\uFF1F\uFF01])@"([\w:.@-]+) \(agent\)"/g;
    let r;
    while ((r = n.exec(e)) !== null) {
      if (r[2]) {
        t.push(r[2]);
      }
    }
    let o = /(^|[\s\u3002\u3001\uFF1F\uFF01])@(agent-[\w:.@-]+)/g;
    let s = e.match(o) || [];
    for (let i of s) {
      t.push(i.slice(i.indexOf("@") + 1));
    }
    return Ro(t);
  }
  function parseAtMentionedFileLines(e) {
    let t = e.match(/^([^#]+)(?:#L(\d+)(?:-(\d+))?)?(?:#[^#]*)?$/);
    if (!t) {
      return {
        filename: e
      };
    }
    let [, n, r, o] = t;
    let s = r ? parseInt(r, 10) : undefined;
    let i = o ? parseInt(o, 10) : s;
    return {
      filename: n ?? e,
      lineStart: s,
      lineEnd: i
    };
  }
  function logDiagnosticsInjected(e, t) {
    logEvent("tengu_lsp_diagnostics_injected", {
      diagnostics_chars: g9.formatDiagnosticsBlock(e).length,
      diagnostic_count: e.reduce((n, r) => n + r.diagnostics.length, 0),
      file_count: e.length,
      source: t
    });
  }
  async function PUm(e) {
    if (!e.options.tools.some(n => bl(n, "Bash") || bl(n, "PowerShell"))) {
      return [];
    }
    let t = await vEe.getNewDiagnostics();
    if (t.length === 0) {
      return [];
    }
    logDiagnosticsInjected(t, "ide-mcp");
    return [{
      type: "diagnostics",
      files: t,
      isNew: true
    }];
  }
  async function OUm(e) {
    if (!e.options.tools.some(t => bl(t, "Bash") || bl(t, "PowerShell"))) {
      return [];
    }
    logForDebugging("LSP Diagnostics: getLSPDiagnosticAttachments called");
    try {
      let t = Q3a();
      if (t.length === 0) {
        return [];
      }
      logForDebugging(`LSP Diagnostics: Found ${t.length} pending diagnostic set(s)`);
      let n = t.map(({
        files: r
      }) => (logDiagnosticsInjected(r, "lsp"), {
        type: "diagnostics",
        files: r,
        isNew: true
      }));
      if (t.length > 0) {
        Z3a();
        logForDebugging(`LSP Diagnostics: Cleared ${t.length} delivered diagnostic(s) from registry`);
      }
      logForDebugging(`LSP Diagnostics: Returning ${n.length} diagnostic attachment(s)`);
      return n;
    } catch (t) {
      let n = sr(t);
      Oe(Error(`Failed to get LSP diagnostic attachments: ${n.message}`));
      return [];
    }
  }
  async function* getAttachmentMessages(e, t, n, r, o, s, i, a) {
    let l = await getAttachments(e, t, n, r, s, i, a);
    if (l.length === 0) {
      return;
    }
    logEvent("tengu_attachments", {
      attachment_types: l.map(c => c.type)
    });
    for (let c of l) {
      yield createAttachmentMessage(c, o);
    }
  }
  async function tryGetPDFReference(e) {
    let t = zw.parse(e).ext.toLowerCase();
    if (!ylt(t)) {
      return null;
    }
    try {
      let [n, r] = await Promise.all([zt().stat(e), Vrr(e)]);
      let o = r ?? Math.ceil(n.size / 102400);
      if (o > 10) {
        logEvent("tengu_pdf_reference_attachment", {
          pageCount: o,
          fileSize: n.size,
          hadPdfinfo: r !== null
        });
        return {
          type: "pdf_reference",
          filename: e,
          pageCount: o,
          fileSize: n.size,
          displayPath: zw.relative(Nt(), e)
        };
      }
    } catch {}
    return null;
  }
  async function generateFileAttachment(e, t, n, r, o, s) {
    let {
      offset: i,
      limit: a
    } = s ?? {};
    if (YEt(e, getToolPermissionContext(t))) {
      return null;
    }
    if (o === "at-mention" && !dgn(e, UTe().maxSizeBytes)) {
      let c = zw.parse(e).ext.toLowerCase();
      if (!ylt(c)) {
        try {
          let u = await zt().stat(e);
          logEvent("tengu_attachment_file_too_large", {
            size_bytes: u.size,
            mode: o
          });
          return null;
        } catch {}
      }
    }
    if (o === "at-mention") {
      let c = await tryGetPDFReference(e);
      if (c) {
        logEvent(n, {});
        XF({
          mentionType: "file",
          success: true
        });
        return c;
      }
    }
    let l = t.readFileState.get(e);
    if (l && o === "at-mention") {
      try {
        let c = await aje(e);
        if (!l.isPartialView && l.timestamp <= c && c === l.timestamp && (l.content !== "" || (l.contentLength ?? 0) === 0)) {
          if (logEvent(n, {}), o === "at-mention") {
            XF({
              mentionType: "file",
              success: true
            });
          }
          return {
            type: "already_read_file",
            filename: e,
            displayPath: zw.relative(Nt(), e),
            content: {
              type: "text",
              file: {
                filePath: e,
                content: l.content,
                numLines: Ru(l.content, `
`) + 1,
                startLine: i ?? 1,
                totalLines: Ru(l.content, `
`) + 1
              }
            }
          };
        }
      } catch {}
    }
    try {
      let c = {
        file_path: e,
        offset: i,
        limit: a
      };
      async function u() {
        if (o === "compact") {
          return {
            type: "compact_file_reference",
            filename: e,
            displayPath: zw.relative(Nt(), e)
          };
        }
        if (YEt(e, getToolPermissionContext(t))) {
          return null;
        }
        try {
          let p = {
            file_path: e,
            offset: i ?? 1,
            limit: 2000
          };
          let m = await iy.call(p, t);
          if (logEvent(n, {}), o === "at-mention") {
            XF({
              mentionType: "file",
              success: true
            });
          }
          return {
            type: "file",
            filename: e,
            content: m.data,
            truncated: true,
            displayPath: zw.relative(Nt(), e)
          };
        } catch {
          if (logEvent(r, {}), o === "at-mention") {
            XF({
              mentionType: "file",
              success: false
            });
          }
          return null;
        }
      }
      if (!(await iy.validateInput(c, t)).result) {
        return null;
      }
      try {
        let p = await iy.call(c, t);
        if (p.data.type === "text" && p.data.file.truncatedByTokenCap === true) {
          return await u();
        }
        if (logEvent(n, {}), o === "at-mention") {
          XF({
            mentionType: "file",
            success: true
          });
        }
        return {
          type: "file",
          filename: e,
          content: p.data,
          displayPath: zw.relative(Nt(), e)
        };
      } catch (p) {
        if (p instanceof $de || p instanceof DEt) {
          return await u();
        }
        throw p;
      }
    } catch {
      if (logEvent(r, {}), o === "at-mention") {
        XF({
          mentionType: "file",
          success: false
        });
      }
      return null;
    }
  }
  function createAttachmentMessage(e, t = {
    now: () => new Date().toISOString(),
    uuid: () => t$o.randomUUID()
  }) {
    return {
      attachment: e,
      type: "attachment",
      uuid: t.uuid(),
      timestamp: e.type === "queued_command" && e.timestamp || t.now()
    };
  }
  function DUm(e) {
    let t = -1;
    let n = -1;
    let r = 0;
    let o = 0;
    for (let s = e.length - 1; s >= 0; s--) {
      let i = e[s];
      if (i?.type === "assistant") {
        if (mor(i)) {
          continue;
        }
        if (t === -1 && "message" in i && Array.isArray(i.message?.content) && i.message.content.some(a => a.type === "tool_use" && a.name === "TodoWrite")) {
          t = s;
        }
        if (t === -1) {
          r++;
        }
        if (n === -1) {
          o++;
        }
      } else if (n === -1 && i?.type === "attachment" && i.attachment.type === "todo_reminder") {
        n = s;
      }
      if (t !== -1 && n !== -1) {
        break;
      }
    }
    return {
      turnsSinceLastTodoWrite: r,
      turnsSinceLastReminder: o
    };
  }
  async function MUm(e, t) {
    if (!t.options.tools.some(o => bl(o, "TodoWrite"))) {
      return [];
    }
    if (aor && t.options.tools.some(o => bl(o, aor))) {
      return [];
    }
    if (!e || e.length === 0) {
      return [];
    }
    if (getTodoReminderMode() === "off") {
      return [];
    }
    let {
      turnsSinceLastTodoWrite: n,
      turnsSinceLastReminder: r
    } = DUm(e);
    if (n >= TODO_REMINDER_CONFIG.TURNS_SINCE_WRITE && r >= TODO_REMINDER_CONFIG.TURNS_BETWEEN_REMINDERS) {
      let o = t.agentId ?? getSessionId();
      let i = t.getAppState().todos[o] ?? [];
      return [{
        type: "todo_reminder",
        content: i,
        itemCount: i.length
      }];
    }
    return [];
  }
  function NUm(e) {
    let t = -1;
    let n = -1;
    let r = 0;
    let o = 0;
    for (let s = e.length - 1; s >= 0; s--) {
      let i = e[s];
      if (i?.type === "assistant") {
        if (mor(i)) {
          continue;
        }
        if (t === -1 && "message" in i && Array.isArray(i.message?.content) && i.message.content.some(a => a.type === "tool_use" && (a.name === "TaskCreate" || a.name === "TaskUpdate"))) {
          t = s;
        }
        if (t === -1) {
          r++;
        }
        if (n === -1) {
          o++;
        }
      } else if (n === -1 && i?.type === "attachment" && i.attachment.type === "task_reminder") {
        n = s;
      }
      if (t !== -1 && n !== -1) {
        break;
      }
    }
    return {
      turnsSinceLastTaskManagement: r,
      turnsSinceLastReminder: o
    };
  }
  async function LUm(e, t) {
    if (!sR()) {
      return [];
    }
    if (aor && t.options.tools.some(o => bl(o, aor))) {
      return [];
    }
    if (!t.options.tools.some(o => bl(o, "TaskUpdate"))) {
      return [];
    }
    if (!e || e.length === 0) {
      return [];
    }
    if (getTodoReminderMode() === "off") {
      return [];
    }
    let {
      turnsSinceLastTaskManagement: n,
      turnsSinceLastReminder: r
    } = NUm(e);
    if (n >= TODO_REMINDER_CONFIG.TURNS_SINCE_WRITE && r >= TODO_REMINDER_CONFIG.TURNS_BETWEEN_REMINDERS) {
      let o = await y3(H$());
      return [{
        type: "task_reminder",
        content: o,
        itemCount: o.length
      }];
    }
    return [];
  }
  function FUm(e) {
    let t = -1;
    let n = -1;
    let r = 0;
    let o = 0;
    for (let s = e.length - 1; s >= 0; s--) {
      let i = e[s];
      if (i?.type === "assistant") {
        if (mor(i)) {
          continue;
        }
        if (t === -1 && "message" in i && Array.isArray(i.message?.content) && i.message.content.some(a => a.type === "tool_use" && a.name === "ToolSearch")) {
          t = s;
        }
        if (t === -1) {
          r++;
        }
        if (n === -1) {
          o++;
        }
      } else if (n === -1 && i?.type === "attachment" && i.attachment.type === "tool_search_usage_reminder") {
        n = s;
      }
      if (t !== -1 && n !== -1) {
        break;
      }
    }
    return {
      turnsSinceLastToolSearch: r,
      turnsSinceLastReminder: o
    };
  }
  async function getToolSearchUsageReminderAttachments(e, t, n) {
    let r = GXr();
    if (r === null) {
      return [];
    }
    if (!e || e.length === 0) {
      return [];
    }
    let {
      turnsSinceLastToolSearch: o,
      turnsSinceLastReminder: s
    } = FUm(e);
    if (o < r.everyNTurns || s < r.everyNTurns) {
      return [];
    }
    let i = u => {
      if (s % r.everyNTurns === 0) {
        logEvent("tengu_juniper_shoal_shown", {
          delivered: false,
          skipReason: u,
          everyNTurns: r.everyNTurns,
          turnsSinceLastReminder: s
        });
      }
      return [];
    };
    if (G3t() !== "tst") {
      return i("mode_not_tst");
    }
    if (!CX(t.options.mainLoopModel)) {
      return i("model_unsupported");
    }
    if (!isToolSearchToolAvailable(t.options.tools)) {
      return i("toolsearch_unavailable");
    }
    let a = extractDiscoveredToolNames(e);
    let l = t.options.tools.filter(u => isDeferredTool(u) && !a.vZc(u.name)).map(u => u.name).sort();
    if (l.length === 0) {
      return i("no_undiscovered_tools");
    }
    let c = false;
    try {
      c = await n();
    } catch {
      c = false;
    }
    if (c) {
      return i("task_reminder_same_turn");
    }
    logEvent("tengu_juniper_shoal_shown", {
      delivered: true,
      undiscoveredCount: l.length,
      listedCount: Math.min(l.length, r.maxNames),
      everyNTurns: r.everyNTurns,
      maxNames: r.maxNames
    });
    return [{
      type: "tool_search_usage_reminder",
      undiscoveredToolNames: l.slice(0, r.maxNames),
      undiscoveredCount: l.length
    }];
  }
  async function UUm(e) {
    let {
      attachments: t,
      updatedTaskOffsets: n,
      evictedTaskIds: r
    } = await pGa(e.taskRegistry.all());
    e.taskRegistry.applyOffsetsAndEvict(n, r);
    return t.map(o => ({
      type: "task_status",
      taskId: o.taskId,
      taskType: o.taskType,
      status: o.status,
      description: o.description,
      deltaSummary: o.deltaSummary,
      outputFilePath: getTaskOutputPath(o.taskId)
    }));
  }
  function getMemoryUpdateAttachments(e) {
    let t = e.getAppState().pendingMemoryUpdates;
    if (t.length === 0) {
      return [];
    }
    e.setAppState(o => o.pendingMemoryUpdates.length === 0 ? o : {
      ...o,
      pendingMemoryUpdates: []
    });
    let n = Vd() && process.env.CLAUDE_COWORK_MEMORY_INDEX_CONTENT !== "" ? Obe() : null;
    let r = o => o === n || e.readFileState.vZc(o) || e.loadedNestedMemoryPaths?.[o] === true;
    return t.map(o => ({
      type: "memory_update",
      source: o.source,
      summary: o.summary,
      paths: o.paths,
      inContextPaths: o.paths.filter(r)
    }));
  }
  async function BUm() {
    let e = await wUl();
    if (e.length === 0) {
      return [];
    }
    logForDebugging(`Hooks: getAsyncHookResponseAttachments found ${e.length} responses`);
    let t = e.map(({
      processId: n,
      response: r,
      hookName: o,
      hookEvent: s,
      toolName: i,
      pluginId: a,
      stdout: l,
      stderr: c,
      exitCode: u
    }) => (logForDebugging(`Hooks: Creating attachment for ${n} (${o}): ${De(r)}`), emitHookMetrics(r.metrics, a, s), {
      type: "async_hook_response",
      processId: n,
      hookName: o,
      hookEvent: s,
      toolName: i,
      response: r,
      stdout: l,
      stderr: c,
      exitCode: u
    }));
    if (e.length > 0) {
      let n = e.map(r => r.processId);
      CUl(n);
      logForDebugging(`Hooks: Removed ${n.length} delivered hooks from registry`);
    }
    logForDebugging(`Hooks: getAsyncHookResponseAttachments found ${t.length} attachments`);
    return t;
  }
  async function $Um(e) {
    if (!isAgentSwarmsEnabled()) {
      return [];
    }
    return [];
  }
  function HUm(e) {
    let t = getTeamName();
    let n = getAgentId();
    let r = getAgentName();
    if (!t || !n) {
      return [];
    }
    if (e.some(l => l.type === "assistant")) {
      return [];
    }
    let s = er();
    let i = `${s}/teams/${t}/config.json`;
    let a = `${s}/tasks/${t}/`;
    return [{
      type: "team_context",
      agentId: n,
      agentName: r || n,
      teamName: t,
      teamConfigPath: i,
      taskListPath: a
    }];
  }
  function jUm(e, t, n) {
    if (!st(process.env.CLAUDE_CODE_ENABLE_TOKEN_USAGE_ATTACHMENT)) {
      return [];
    }
    let r = coe(t, n);
    let o = L1(e);
    return [{
      type: "token_usage",
      used: o,
      total: r,
      remaining: r - o
    }];
  }
  function qUm(e, t, n) {
    let r = FTe();
    if (r === "off") {
      return [];
    }
    let o = r === "countdown" ? iT(t, getSdkBetas()) - L1(e) : r === "padded-countdown" ? ojn() - Fba(n ?? "main", L1(e)) : 0;
    return [{
      type: "total_tokens_reminder",
      text: sjn(r, o)
    }];
  }
  function WUm() {
    return [];
  }
  function GUm(e) {
    if (e === undefined) {
      return [];
    }
    let t = getTotalCostUSD();
    let n = e - t;
    return [{
      type: "budget_usd",
      used: t,
      total: e,
      remaining: n
    }];
  }
  function getContextEfficiencyAttachment(e, t) {
    return [];
  }
  function getFoldNudgeAttachment(e) {
    return [];
  }
  function YEt(e, t) {
    if (isUntrustedUncPath(e, t.trustedNetworkDirectories)) {
      if (!Q2o.vZc(e) && Q2o.size < 1000) {
        Q2o.add(e);
        logEvent("tengu_attachment_unc_read_blocked", {});
      }
      return true;
    }
    return matchingRuleForInput(e, t, "read", "deny") !== null;
  }
  var JEt;
  var zw;
  var t$o;
  var sUm;
  var aor;
  var TODO_REMINDER_CONFIG;
  var PLAN_MODE_ATTACHMENT_CONFIG;
  var ULTRA_EFFORT_CONFIG;
  var RELEVANT_MEMORIES_CONFIG;
  var iUm;
  var kUm;
  var UNSAFE_DYNAMIC_SKILL_CHARS;
  var kXt;
  var lor = false;
  var vwe = null;
  var Q2o;
  var rR = __lazy(() => {
    Ot();
    ln();
    Gu();
    dw();
    ci();
    LEe();
    rrr();
    ku();
    Zn();
    T9();
    YI();
    xx();
    bT();
    bx();
    vo();
    wXt();
    Rn();
    yS();
    je();
    dt();
    K6e();
    S$();
    Kq();
    IMe();
    yG();
    JF();
    Eo();
    AI();
    Bm();
    at();
    uTe();
    Lve();
    VT();
    Tm();
    VDe();
    qI();
    Kp();
    dt();
    Zl();
    kS();
    Sh();
    LFo();
    oy();
    no();
    wm();
    U$();
    cE();
    ry();
    at();
    foe();
    RX();
    Y4e();
    kX();
    _Ul();
    b1();
    Qrr();
    Cbe();
    ror();
    _ht();
    ro();
    pr();
    gn();
    XN();
    CXt();
    N2();
    Sl();
    Fp();
    TO();
    d$();
    hWt();
    $n();
    Sp();
    eMn();
    v9e();
    B2o();
    Ire();
    mE();
    PUl();
    Tyo();
    Gd();
    Eb();
    Vbe();
    uA();
    qp();
    Uj();
    UM();
    YI();
    Sl();
    JEt = require("fs/promises");
    zw = require("path");
    t$o = require("crypto");
    sUm = (xse(), __toCommonJS(Fme));
    aor = (k2(), __toCommonJS(kIe)).BRIEF_TOOL_NAME;
    TODO_REMINDER_CONFIG = {
      TURNS_SINCE_WRITE: 10,
      TURNS_BETWEEN_REMINDERS: 10
    };
    PLAN_MODE_ATTACHMENT_CONFIG = {
      TURNS_BETWEEN_ATTACHMENTS: 5,
      FULL_REMINDER_EVERY_N_ATTACHMENTS: 5
    };
    ULTRA_EFFORT_CONFIG = {
      TURNS_BETWEEN_MAINTENANCE: 10
    };
    RELEVANT_MEMORIES_CONFIG = {
      MAX_SESSION_BYTES: 61440
    };
    iUm = new Set(["prompt", "task-notification"]);
    kUm = new Set(["extract_memories", "auto_dream", "memdir_relevance", "memdir_aki_extract", "prompt_suggestion", "compact"]);
    UNSAFE_DYNAMIC_SKILL_CHARS = /[\x00-\x1f\x7f-\x9f\u2028\u2029<>]/;
    kXt = new Map();
    Q2o = new Set();
  });
  async function XUm() {
    await Promise.all(Array.from(l$o).map(e => sK.rm(e, {
      force: true
    }).catch(() => {})));
    l$o.clear();
  }
  async function rBl(e) {
    let t = XEt.join(e, ".in_use");
    let n = XEt.join(t, String(process.pid));
    try {
      await sK.mkdir(t, {
        recursive: true
      });
      await Fm(n, De({
        pid: process.pid,
        procStart: await ownProcStartAsync()
      }));
    } catch (r) {
      logForDebugging(`Failed to write ${".in_use"} marker: ${e}: ${r}`);
      return;
    }
    l$o.add(n);
    JUm ??= Ti(XUm);
  }
  async function oBl(e) {
    if (e.length === 0) {
      return;
    }
    let t = XEt.join(XC(), ".last_inuse_sweep");
    try {
      let r = await sK.stat(t);
      if (Date.now() - r.mtimeMs < 86400000) {
        return;
      }
    } catch {}
    let n = await Promise.allSettled(e.map(r => IXt(r)));
    for (let [r, o] of n.entries()) {
      if (o.status === "rejected") {
        logForDebugging(`Failed to sweep ${".in_use"}: ${e[r]}: ${o.reason}`);
      }
    }
    try {
      await sK.writeFile(t, new Date().toISOString(), "utf-8");
    } catch (r) {
      logForDebugging(`Failed to stamp ${".last_inuse_sweep"}: ${r}`);
    }
  }
  async function IXt(e, t) {
    let n = XEt.join(e, ".in_use");
    let r;
    try {
      r = await sK.readdir(n);
    } catch (s) {
      if (Io(s)) {
        return false;
      }
      throw s;
    }
    let o = false;
    for (let s of r) {
      if (s.includes(".tmp.")) {
        o = true;
        continue;
      }
      let i = XEt.join(n, s);
      let a;
      try {
        a = await sK.readFile(i, "utf-8");
      } catch {}
      if (a === "") {
        o = true;
        continue;
      }
      let l = YUm().safeParse(Ba(a, false));
      if (t?.excludeSelf && l.success && l.data.pid === process.pid) {
        continue;
      }
      if (l.success && (l.data.pid === 1 || isProcessRunning(l.data.pid)) && (await isSameProcessAsync(l.data.pid, l.data.procStart))) {
        o = true;
        continue;
      }
      await sK.rm(i, {
        force: true
      });
    }
    return o;
  }
  var sK;
  var XEt;
  var YUm;
  var l$o;
  var JUm;
  var c$o = __lazy(() => {
    qg();
    BT();
    hd();
    je();
    dt();
    Tb();
    Gd();
    k1();
    sK = require("fs/promises");
    XEt = require("path");
    YUm = we(() => Ke.object({
      pid: Ke.number(),
      procStart: Ke.string().optional()
    }));
    l$o = new Set();
  });
  async function ZEt(e, t, n = {}) {
    let r = zt();
    let o = n.logLabel ?? "plugin";
    let s = 0;
    let i = false;
    async function a(l, c) {
      if (c.length >= 32) {
        logForDebugging(`Skipping ${o} directory beyond depth ${32}: ${l}`, {
          level: "error"
        });
        return;
      }
      if (++s > 4096) {
        if (!i) {
          i = true;
          logForDebugging(`Stopping ${o} scan after ${4096} directories (root=${e})`, {
            level: "error"
          });
        }
        return;
      }
      try {
        let u = await r.readdir(l);
        if (n.stopAtSkillDir && u.some(d => d.isFile() && ZUm.test(d.name))) {
          await Promise.all(u.map(d => d.isFile() && d.name.toLowerCase().endsWith(".md") ? t(u$o.join(l, d.name), c) : undefined));
          return;
        }
        await Promise.all(u.map(d => {
          let p = u$o.join(l, d.name);
          if (d.isDirectory()) {
            return a(p, [...c, d.name]);
          }
          if (d.isFile() && d.name.toLowerCase().endsWith(".md")) {
            return t(p, c);
          }
          return;
        }));
      } catch (u) {
        logForDebugging(`Failed to scan ${o} directory ${l}: ${u}`, {
          level: "error"
        });
      }
    }
    await a(e, []);
  }
  var u$o;
  var ZUm;
  var hor = __lazy(() => {
    je();
    u$o = require("path");
    ZUm = /^skill\.md$/i;
  });
  function d$o(e) {
    return /^skill\.md$/i.test(F0.basename(e));
  }
  function eBm(e, t, n) {
    if (d$o(e)) {
      let o = F0.dirname(e);
      let s = F0.dirname(o);
      let i = F0.basename(o);
      let a = s.startsWith(t) ? s.slice(t.length).replace(/^[/\\]/, "") : "";
      let l = a ? a.split(/[/\\]/).join(":") : "";
      return l ? `${n}:${l}:${i}` : `${n}:${i}`;
    } else {
      let o = F0.dirname(e);
      let s = F0.basename(e).replace(/\.md$/, "");
      let i = o.startsWith(t) ? o.slice(t.length).replace(/^[/\\]/, "") : "";
      let a = i ? i.split(/[/\\]/).join(":") : "";
      return a ? `${n}:${a}:${s}` : `${n}:${s}`;
    }
  }
  async function tBm(e, t, n) {
    let r = [];
    let o = zt();
    await ZEt(e, async s => {
      if (dte(o, s, n)) {
        return;
      }
      let i;
      try {
        let c = await $F(o, s, 1048576);
        if (c === null) {
          logForDebugging(`Skipping plugin command ${s}: not a regular file or exceeds ${1048576} byte limit`, {
            level: "warn"
          });
          return;
        }
        i = c;
      } catch (c) {
        logForDebugging(`Failed to read plugin command ${s}: ${c}`, {
          level: "error"
        });
        return;
      }
      let {
        frontmatter: a,
        content: l
      } = sf(i, s, {
        normalizeKeys: true
      });
      r.push({
        filePath: s,
        baseDir: t,
        frontmatter: a,
        content: PEe(s, l)
      });
    }, {
      stopAtSkillDir: true,
      logLabel: "commands"
    });
    return r.sort((s, i) => s.filePath.localeCompare(i.filePath));
  }
  function nBm(e) {
    let t = new Map();
    for (let r of e) {
      let o = F0.dirname(r.filePath);
      let s = t.get(o) ?? [];
      s.push(r);
      t.set(o, s);
    }
    let n = [];
    for (let [r, o] of t) {
      let s = o.filter(i => d$o(i.filePath));
      if (s.length > 0) {
        let i = s[0];
        if (s.length > 1) {
          logForDebugging(`Multiple skill files found in ${r}, using ${F0.basename(i.filePath)}`);
        }
        n.push(i);
      } else {
        n.push(...o);
      }
    }
    return n;
  }
  async function aBl(e, t, n, r, o, s = {
    isSkillMode: false
  }, i = new Set()) {
    let a = await tBm(e, e, i);
    let l = nBm(a);
    let c = [];
    for (let u of l) {
      let d = eBm(u.filePath, u.baseDir, t);
      let p = PXt(d, u, n, r, o, d$o(u.filePath), s);
      if (p) {
        c.push(p);
      }
    }
    return c;
  }
  function PXt(e, t, n, r, o, s, i = {
    isSkillMode: false
  }) {
    try {
      let {
        frontmatter: a,
        content: l
      } = t;
      let c = M2(a.description, e);
      let u = c ?? Rpe(l, s ? "Plugin skill" : "Plugin command");
      let p = F0.dirname(t.filePath);
      let m = H => {
        let U = Ooe(H, {
          path: o,
          source: n
        });
        if (i.isSkillMode) {
          U = U.replace(/\$\{CLAUDE_SKILL_DIR\}/g, () => p);
        }
        return U;
      };
      let f = a["allowed-tools"];
      let h = typeof f === "string" ? m(f) : Array.isArray(f) ? f.map(H => typeof H === "string" ? m(H) : H) : f;
      let g = bQ(h);
      let y = bQ(a["disallowed-tools"] ?? a.disallowedTools);
      let _ = a["argument-hint"] != null ? String(a["argument-hint"]) : undefined;
      let b = t9n(a.arguments);
      let S = a.when_to_use != null ? String(a.when_to_use) : undefined;
      let E = a.version != null ? String(a.version) : undefined;
      let C = a.name != null ? String(a.name) : undefined;
      let x = a.model;
      let A;
      if (typeof x === "string" && x.trim().length > 0) {
        let H = x.trim();
        A = H === "inherit" ? undefined : parseUserSpecifiedModel(H);
      }
      let k = a.effort;
      let I = k !== undefined ? L2(k) : undefined;
      if (k !== undefined && I === undefined) {
        logForDebugging(`Plugin command ${e} has invalid effort '${k}'. Valid options: ${UC.join(", ")} or an integer`);
      }
      let O = Qat(a["disable-model-invocation"]);
      let M = a["user-invocable"];
      let L = M === undefined ? true : Qat(M);
      let P = TDn(a.shell, e);
      let F;
      if ((s || i.isSkillMode) && a.hooks) {
        let H = cW().safeParse(a.hooks);
        if (H.success) {
          F = H.data;
        } else {
          logForDebugging(`Invalid hooks in plugin skill '${e}': ${H.error.message}`);
        }
      }
      return {
        type: "prompt",
        name: e,
        description: u,
        hasUserSpecifiedDescription: c !== null,
        allowedTools: g,
        disallowedTools: y.length > 0 ? y : undefined,
        argumentHint: _,
        argNames: b.length > 0 ? b : undefined,
        whenToUse: S,
        version: E,
        model: A,
        effort: I,
        context: a.context === "fork" ? "fork" : undefined,
        agent: a.agent != null ? String(a.agent) : undefined,
        disableModelInvocation: O,
        userInvocable: L,
        declaredFields: SDn(a),
        contentLength: l.length,
        source: "plugin",
        loadedFrom: s || i.isSkillMode ? "plugin" : undefined,
        hooks: F,
        skillRoot: (s || i.isSkillMode) && F ? o : undefined,
        pluginInfo: {
          pluginManifest: r,
          repository: n
        },
        isHidden: !L,
        progressMessage: s || i.isSkillMode ? "loading" : "running",
        userFacingName() {
          return C || e;
        },
        async getPromptForCommand(H, U) {
          let N = i.isSkillMode ? `Base directory for this skill: ${F0.dirname(t.filePath)}

${l}` : l;
          if (N = Pht(N, H, true, b, oz), N = Ooe(N, {
            path: o,
            source: n
          }), r.userConfig) {
            N = gWn(N, W1(n), r.userConfig, oz);
          }
          if (i.isSkillMode) {
            N = N.replace(/\$\{CLAUDE_SKILL_DIR\}/g, p);
          }
          if (N = N.replace(/\$\{CLAUDE_SESSION_ID\}/g, getSessionId()), N = N.replaceAll("${CLAUDE_EFFORT}", r1(A ?? U.options.mainLoopModel, I ?? getEffortValue(U))), U9n()) {
            N = B9n(N);
          } else {
            N = await Cpe(N, {
              ...U,
              getAppState() {
                let W = U.getAppState();
                return {
                  ...W,
                  toolPermissionContext: {
                    ...W.toolPermissionContext,
                    alwaysAllowRules: {
                      ...W.toolPermissionContext.alwaysAllowRules,
                      command: g
                    }
                  }
                };
              }
            }, `/${e}`, P);
          }
          return [{
            type: "text",
            text: N
          }];
        }
      };
    } catch (a) {
      logForDebugging(`Failed to create command from ${t.filePath}: ${a}`, {
        level: "error"
      });
      return null;
    }
  }
  function gor() {
    M7e.cache?.clear?.();
  }
  async function lBl(e, t, n, r, o, s) {
    let i = zt();
    let a = [];
    let l = F0.join(e, "SKILL.md");
    let c = null;
    try {
      if (c = await $F(i, l, 1048576), c === null) {
        logForDebugging(`Skipping plugin skill ${l}: not a regular file or exceeds ${1048576} byte limit`, {
          level: "warn"
        });
      }
    } catch (d) {
      if (!fn(d)) {
        logForDebugging(`Failed to load skill from ${l}: ${d}`, {
          level: "error"
        });
        return a;
      }
    }
    if (c !== null) {
      if (dte(i, l, s)) {
        return a;
      }
      try {
        let {
          frontmatter: d,
          content: p
        } = sf(c, l, {
          normalizeKeys: true
        });
        let f = ((typeof d.name === "string" ? d.name.trim() : "") || F0.basename(e)).replace(/[^a-zA-Z0-9_-]/g, "-");
        let h = `${t}:${f}`;
        let g = {
          filePath: l,
          baseDir: F0.dirname(l),
          frontmatter: d,
          content: PEe(l, p)
        };
        let y = PXt(h, g, n, r, o, true, {
          isSkillMode: true
        });
        if (y) {
          a.push({
            skill: y,
            filePath: l
          });
        }
      } catch (d) {
        logForDebugging(`Failed to load skill from ${l}: ${d}`, {
          level: "error"
        });
      }
      return a;
    }
    let u;
    try {
      u = await i.readdir(e);
    } catch (d) {
      if (!fn(d)) {
        logForDebugging(`Failed to load skills from directory ${e}: ${d}`, {
          level: "error"
        });
      }
      return a;
    }
    await Promise.all(u.map(async d => {
      if (!d.isDirectory() && !d.isSymbolicLink()) {
        return;
      }
      let p = F0.join(e, d.name);
      let m = F0.join(p, "SKILL.md");
      let f;
      try {
        let h = await $F(i, m, 1048576);
        if (h === null) {
          logForDebugging(`Skipping plugin skill ${m}: not a regular file or exceeds ${1048576} byte limit`, {
            level: "warn"
          });
          return;
        }
        f = h;
      } catch (h) {
        if (!fn(h)) {
          logForDebugging(`Failed to load skill from ${m}: ${h}`, {
            level: "error"
          });
        }
        return;
      }
      if (dte(i, m, s)) {
        return;
      }
      try {
        let {
          frontmatter: h,
          content: g
        } = sf(f, m, {
          normalizeKeys: true
        });
        let y = `${t}:${d.name.replace(/[^a-zA-Z0-9_-]/g, "-")}`;
        let _ = {
          filePath: m,
          baseDir: F0.dirname(m),
          frontmatter: h,
          content: PEe(m, g)
        };
        let b = PXt(y, _, n, r, o, true, {
          isSkillMode: true
        });
        if (b) {
          a.push({
            skill: b,
            filePath: m
          });
        }
      } catch (h) {
        logForDebugging(`Failed to load skill from ${m}: ${h}`, {
          level: "error"
        });
      }
    }));
    return a.sort((d, p) => d.skill.name.localeCompare(p.skill.name));
  }
  function uBl() {
    p$o.cache?.clear?.();
  }
  var cBl;
  var F0;
  var M7e;
  var p$o;
  var OXt = __lazy(() => {
    at();
    ln();
    T9();
    Evo();
    cV();
    J5t();
    Sl();
    wb();
    je();
    Fp();
    dt();
    fv();
    n1();
    v9();
    Eo();
    l8e();
    Rj();
    Tvo();
    xg();
    a9();
    hor();
    cBl = require("fs/promises");
    F0 = require("path");
    M7e = TEr(async () => {
      if (Pc("plugins", {
        explicitlyRequested: getInlinePlugins().length > 0 || getInlinePluginsNoMcp().length > 0 || getInlinePluginUrls().length > 0
      })) {
        return [];
      }
      let {
        enabled: e,
        errors: t
      } = await loadAllPluginsCacheOnly();
      if (t.length > 0) {
        logForDebugging(`Plugin loading errors: ${t.map(s => hS(s)).join(", ")}`);
      }
      let n = null;
      let o = (await Promise.all(e.map(async s => {
        let i = new Set();
        let a = [];
        if (s.commandsPath) {
          try {
            let l = await aBl(s.commandsPath, s.name, s.source, s.manifest, s.path, {
              isSkillMode: false
            }, i);
            if (a.push(...l), l.length > 0) {
              logForDebugging(`Loaded ${l.length} commands from plugin ${s.name} default directory`);
            }
          } catch (l) {
            n = "plugin_load_commands_dir_failed";
            logForDebugging(`Failed to load commands from plugin ${s.name} default directory: ${l}`, {
              level: "error"
            });
          }
        }
        if (s.commandsPaths) {
          logForDebugging(`Plugin ${s.name} has commandsPaths: ${s.commandsPaths.join(", ")}`);
          let l = await Promise.all(s.commandsPaths.map(async c => {
            try {
              let u = zt();
              let d = await u.stat(c);
              if (logForDebugging(`Checking commandPath ${c} - isDirectory: ${d.isDirectory()}, isFile: ${d.isFile()}`), d.isDirectory()) {
                let p = await aBl(c, s.name, s.source, s.manifest, s.path, {
                  isSkillMode: false
                }, i);
                if (p.length > 0) {
                  logForDebugging(`Loaded ${p.length} commands from plugin ${s.name} custom path: ${c}`);
                } else {
                  logForDebugging(`Warning: No commands found in plugin ${s.name} custom directory: ${c}. Expected .md files or SKILL.md in subdirectories.`, {
                    level: "warn"
                  });
                }
                return p;
              } else if (d.isFile() && c.endsWith(".md")) {
                if (dte(u, c, i)) {
                  return [];
                }
                let p = await $F(u, c, 1048576);
                if (p === null) {
                  logForDebugging(`Skipping plugin command ${c}: exceeds ${1048576} byte limit`, {
                    level: "warn"
                  });
                  return [];
                }
                let {
                  frontmatter: m,
                  content: f
                } = sf(p, c, {
                  normalizeKeys: true
                });
                let h;
                let g;
                if (s.commandsMetadata) {
                  for (let [S, E] of Object.entries(s.commandsMetadata)) {
                    if (E.source) {
                      let C = F0.join(s.path, E.source);
                      if (c === C) {
                        h = `${s.name}:${S}`;
                        g = E;
                        break;
                      }
                    }
                  }
                }
                if (!h) {
                  h = `${s.name}:${F0.basename(c).replace(/\.md$/, "")}`;
                }
                let y = g ? {
                  ...m,
                  ...(g.description && {
                    description: g.description
                  }),
                  ...(g.argumentHint && {
                    "argument-hint": g.argumentHint
                  }),
                  ...(g.model && {
                    model: g.model
                  }),
                  ...(g.allowedTools && {
                    "allowed-tools": g.allowedTools.join(",")
                  })
                } : m;
                let _ = {
                  filePath: c,
                  baseDir: F0.dirname(c),
                  frontmatter: y,
                  content: PEe(c, f)
                };
                let b = PXt(h, _, s.source, s.manifest, s.path, false);
                if (b) {
                  logForDebugging(`Loaded command from plugin ${s.name} custom file: ${c}${g ? " (with metadata override)" : ""}`);
                  return [b];
                }
              }
              return [];
            } catch (u) {
              n = "plugin_load_commands_path_failed";
              logForDebugging(`Failed to load commands from plugin ${s.name} custom path ${c}: ${u}`, {
                level: "error"
              });
              return [];
            }
          }));
          for (let c of l) {
            a.push(...c);
          }
        }
        if (s.commandsMetadata) {
          for (let [l, c] of Object.entries(s.commandsMetadata)) {
            if (c.content && !c.source) {
              try {
                let {
                  frontmatter: u,
                  content: d
                } = sf(c.content, `<inline:${s.name}:${l}>`, {
                  normalizeKeys: true
                });
                let p = {
                  ...u,
                  ...(c.description && {
                    description: c.description
                  }),
                  ...(c.argumentHint && {
                    "argument-hint": c.argumentHint
                  }),
                  ...(c.model && {
                    model: c.model
                  }),
                  ...(c.allowedTools && {
                    "allowed-tools": c.allowedTools.join(",")
                  })
                };
                let m = `${s.name}:${l}`;
                let f = `<inline:${m}>`;
                let h = {
                  filePath: f,
                  baseDir: s.path,
                  frontmatter: p,
                  content: PEe(f, d)
                };
                let g = PXt(m, h, s.source, s.manifest, s.path, false);
                if (g) {
                  a.push(g);
                  logForDebugging(`Loaded inline content command from plugin ${s.name}: ${m}`);
                }
              } catch (u) {
                n = "plugin_load_commands_inline_failed";
                logForDebugging(`Failed to load inline content command ${l} from plugin ${s.name}: ${u}`, {
                  level: "error"
                });
              }
            }
          }
        }
        return a;
      }))).flat();
      if (logForDebugging(`Total plugin commands loaded: ${o.length}`), n) {
        Ae("plugin_load_commands", n);
      } else {
        Pe("plugin_load_commands");
      }
      return o;
    });
    p$o = TEr(async () => {
      if (Pc("plugins", {
        explicitlyRequested: getInlinePlugins().length > 0 || getInlinePluginsNoMcp().length > 0 || getInlinePluginUrls().length > 0
      })) {
        return [];
      }
      let {
        enabled: e,
        errors: t
      } = await loadAllPluginsCacheOnly();
      if (t.length > 0) {
        logForDebugging(`Plugin loading errors: ${t.map(c => hS(c)).join(", ")}`);
      }
      logForDebugging(`getPluginSkills: Processing ${e.length} enabled plugins`);
      let n = null;
      let o = (await Promise.all(e.map(async c => {
        let u = new Set();
        let d = [];
        if (logForDebugging(`Checking plugin ${c.name}: skillsPath=${c.skillsPath ? "exists" : "none"}, skillsPaths=${c.skillsPaths ? c.skillsPaths.length : 0} paths`), c.skillsPath) {
          logForDebugging(`Attempting to load skills from plugin ${c.name} default skillsPath: ${c.skillsPath}`);
          try {
            let p = await lBl(c.skillsPath, c.name, c.source, c.manifest, c.path, u);
            d.push(...p);
            logForDebugging(`Loaded ${p.length} skills from plugin ${c.name} default directory`);
          } catch (p) {
            n = "plugin_load_skills_dir_failed";
            logForDebugging(`Failed to load skills from plugin ${c.name} default directory: ${p}`, {
              level: "error"
            });
          }
        }
        if (c.skillsPaths) {
          logForDebugging(`Attempting to load skills from plugin ${c.name} skillsPaths: ${c.skillsPaths.join(", ")}`);
          let p = await Promise.all(c.skillsPaths.map(async m => {
            try {
              logForDebugging(`Loading from skillPath: ${m} for plugin ${c.name}`);
              let f = await lBl(m, c.name, c.source, c.manifest, c.path, u);
              logForDebugging(`Loaded ${f.length} skills from plugin ${c.name} custom path: ${m}`);
              return f;
            } catch (f) {
              n = "plugin_load_skills_path_failed";
              logForDebugging(`Failed to load skills from plugin ${c.name} custom path ${m}: ${f}`, {
                level: "error"
              });
              return [];
            }
          }));
          for (let m of p) {
            d.push(...m);
          }
        }
        return d;
      }))).flat();
      let [s, i] = await Promise.all([Promise.all(o.map(async c => {
        try {
          return await cBl.realpath(c.filePath);
        } catch {
          return null;
        }
      })), e5a()]);
      let a = new Map();
      let l = [];
      for (let c = 0; c < o.length; c++) {
        let u = o[c];
        if (u === undefined) {
          continue;
        }
        let d = s[c];
        if (d === null || d === undefined) {
          l.push(u.skill);
          continue;
        }
        if (i !== null && i.vZc(d)) {
          logForDebugging(`Skipping plugin skill '${u.skill.name}' \u2014 ${d} is a user-level skill already surfaced by the skills directory loader`);
          continue;
        }
        let p = a.get(d);
        if (p !== undefined) {
          logForDebugging(`Skipping duplicate plugin skill '${u.skill.name}' \u2014 ${d} already loaded as '${p}'`);
          continue;
        }
        a.set(d, u.skill.name);
        l.push(u.skill);
      }
      if (logForDebugging(`Total plugin skills loaded: ${l.length} (${o.length - l.length} duplicate/user-owned entries skipped)`), n) {
        Ae("plugin_load_skills", n);
      } else {
        Pe("plugin_load_skills");
      }
      return l;
    });
  });
  async function pBl(e, t, n) {
    let r = [];
    await ZEt(e, async o => {
      let s = await fBl(o, t, n);
      if (s) {
        r.push(s);
      }
    }, {
      logLabel: "output-styles"
    });
    return r;
  }
  async function fBl(e, t, n) {
    let r = zt();
    if (dte(r, e, n)) {
      return null;
    }
    try {
      let o = await $F(r, e, 1048576);
      if (o === null) {
        logForDebugging(`Skipping plugin output-style ${e}: not a regular file or exceeds ${1048576} byte limit`, {
          level: "warn"
        });
        return null;
      }
      let {
        frontmatter: s,
        content: i
      } = sf(o, e, {
        normalizeKeys: true
      });
      let a = mBl.basename(e, ".md");
      let l = (s.name != null ? String(s.name) : undefined) || a;
      let c = `${t}:${l}`;
      let u = M2(s.description, c) ?? Rpe(i, `Output style from ${t} plugin`);
      return {
        name: c,
        description: u,
        prompt: i.trim(),
        source: "plugin",
        forceForPlugin: eWe(s["force-for-plugin"]),
        keepCodingInstructions: eWe(s["keep-coding-instructions"])
      };
    } catch (o) {
      logForDebugging(`Failed to load output style from ${e}: ${o}`, {
        level: "error"
      });
      return null;
    }
  }
  function f$o() {
    m$o.cache?.clear?.();
  }
  var mBl;
  var m$o;
  var yor = __lazy(() => {
    ln();
    cV();
    je();
    fv();
    n1();
    v9();
    xg();
    hor();
    mBl = require("path");
    m$o = TEr(async () => {
      let {
        enabled: e,
        errors: t
      } = await loadAllPluginsCacheOnly();
      let n = [];
      if (t.length > 0) {
        logForDebugging(`Plugin loading errors: ${t.map(o => hS(o)).join(", ")}`);
      }
      let r = null;
      for (let o of e) {
        let s = new Set();
        if (o.outputStylesPath) {
          try {
            let i = await pBl(o.outputStylesPath, o.name, s);
            if (n.push(...i), i.length > 0) {
              logForDebugging(`Loaded ${i.length} output styles from plugin ${o.name} default directory`);
            }
          } catch (i) {
            r = "plugin_load_output_styles_dir_failed";
            logForDebugging(`Failed to load output styles from plugin ${o.name} default directory: ${i}`, {
              level: "error"
            });
          }
        }
        if (o.outputStylesPaths) {
          for (let i of o.outputStylesPaths) {
            try {
              let l = await zt().stat(i);
              if (l.isDirectory()) {
                let c = await pBl(i, o.name, s);
                if (n.push(...c), c.length > 0) {
                  logForDebugging(`Loaded ${c.length} output styles from plugin ${o.name} custom path: ${i}`);
                }
              } else if (l.isFile() && i.endsWith(".md")) {
                let c = await fBl(i, o.name, s);
                if (c) {
                  n.push(c);
                  logForDebugging(`Loaded output style from plugin ${o.name} custom file: ${i}`);
                }
              }
            } catch (a) {
              r = "plugin_load_output_styles_path_failed";
              logForDebugging(`Failed to load output styles from plugin ${o.name} custom path ${i}: ${a}`, {
                level: "error"
              });
            }
          }
        }
      }
      if (logForDebugging(`Total plugin output styles loaded: ${n.length}`), r) {
        Ae("plugin_load_output_styles", r);
      } else {
        Pe("plugin_load_output_styles");
      }
      return n;
    });
  });
  function iK() {
    return st(process.env.CLAUDE_CODE_PLUGIN_USE_ZIP_CACHE);
  }
  function DXt() {
    if (!iK()) {
      return;
    }
    let e = process.env.CLAUDE_CODE_PLUGIN_CACHE_DIR;
    return e ? AP(e) : undefined;
  }
  function g$o() {
    let e = DXt();
    if (!e) {
      throw Error("Plugin zip cache is not enabled");
    }
    return hH.join(e, "known_marketplaces.json");
  }
  function gBl() {
    let e = DXt();
    if (!e) {
      throw Error("Plugin zip cache is not enabled");
    }
    return hH.join(e, "marketplaces");
  }
  function yBl() {
    let e = DXt();
    if (!e) {
      throw Error("Plugin zip cache is not enabled");
    }
    return hH.join(e, "plugins");
  }
  function rBm() {
    return {
      path: null,
      promise: null,
      cleanupHandle: null
    };
  }
  function iBm() {
    let e = sBm();
    let t = hBl.get(e);
    if (t) {
      return t;
    }
    let n = rBm();
    hBl.set(e, n);
    n.cleanupHandle = Ti(async () => {
      if (n.path) {
        try {
          await zO.rm(n.path, {
            recursive: true,
            force: true
          });
          logForDebugging(`Cleaned up session plugin cache at ${n.path}`);
        } catch (r) {
          logForDebugging(`Failed to clean up session plugin cache: ${r}`);
        }
      }
    });
    return n;
  }
  async function MXt() {
    let e = iBm();
    if (e.path) {
      return e.path;
    }
    if (!e.promise) {
      e.promise = (async () => {
        let t = h$o.randomBytes(8).toString("hex");
        let n = hH.join(F2(), `claude-plugin-session-${t}`);
        await zt().mkdir(n);
        e.path = n;
        logForDebugging(`Created session plugin cache at ${n}`);
        return n;
      })();
    }
    return e.promise;
  }
  async function _or(e, t) {
    let n = hH.dirname(e);
    await zt().mkdir(n);
    let r = `.${hH.basename(e)}.tmp.${h$o.randomBytes(4).toString("hex")}`;
    let o = hH.join(n, r);
    try {
      if (typeof t === "string") {
        await zO.writeFile(o, t, {
          encoding: "utf-8"
        });
      } else {
        await zO.writeFile(o, t);
      }
      await zO.rename(o, e);
    } catch (s) {
      try {
        await zO.rm(o, {
          force: true
        });
      } catch {}
      throw s;
    }
  }
  async function aBm(e) {
    let t = {};
    await _Bl(e, "", t, new Set());
    let {
      zipSync: r
    } = await Promise.resolve().then(() => (b6e(), O9t));
    let o = r(t, {
      level: 6
    });
    logForDebugging(`Created ZIP from ${e}: ${Object.keys(t).length} files, ${o.length} bytes`);
    return o;
  }
  async function _Bl(e, t, n, r) {
    let o = t ? hH.join(e, t) : e;
    let s;
    try {
      s = await zO.readdir(o);
    } catch {
      return;
    }
    try {
      let i = await zO.stat(o, {
        bigint: true
      });
      if (i.dev !== 0n || i.ino !== 0n) {
        let a = `${i.dev}:${i.ino}`;
        if (r.vZc(a)) {
          logForDebugging(`Skipping symlink cycle at ${o}`);
          return;
        }
        r.add(a);
      }
    } catch {
      return;
    }
    for (let i of s) {
      if (i === ".git") {
        continue;
      }
      let a = hH.join(o, i);
      let l = t ? `${t}/${i}` : i;
      let c;
      try {
        c = await zO.lstat(a);
      } catch {
        continue;
      }
      if (c.isSymbolicLink()) {
        continue;
      }
      if (c.isDirectory()) {
        await _Bl(e, l, n, r);
      } else if (c.isFile()) {
        try {
          let u = await zO.readFile(a);
          n[l] = [new Uint8Array(u), {
            os: 3,
            attrs: (c.mode & 65535) << 16
          }];
        } catch (u) {
          logForDebugging(`Failed to read file for zip: ${l}: ${u}`);
        }
      }
    }
  }
  async function IFe(e, t) {
    let n = await zt().readFileBytes(e);
    let r = await dpe(n);
    let o = rNe(n);
    await zt().mkdir(t);
    for (let [s, i] of Object.entries(r)) {
      if (s.endsWith("/")) {
        await zt().mkdir(hH.join(t, s));
        continue;
      }
      let a = hH.join(t, s);
      await zt().mkdir(hH.dirname(a));
      await zO.writeFile(a, i);
      let l = o[s];
      if (l && l & 73) {
        await zO.chmod(a, l & 511).catch(() => {});
      }
    }
    logForDebugging(`Extracted ZIP to ${t}: ${Object.keys(r).length} entries`);
  }
  async function bor(e, t) {
    let n = await aBm(e);
    await _or(t, n);
    await zO.rm(e, {
      recursive: true,
      force: true
    });
  }
  function bBl(e) {
    let t = e.replace(/[^a-zA-Z0-9\-_]/g, "-");
    return hH.join("marketplaces", `${t}.json`);
  }
  function SBl(e) {
    return ["github", "git", "url", "settings"].includes(e.source);
  }
  var h$o;
  var zO;
  var hH;
  var sBm = () => "cli";
  var hBl;
  var PFe = __lazy(() => {
    hd();
    je();
    w6e();
    gn();
    mde();
    BC();
    h$o = require("crypto");
    zO = require("fs/promises");
    hH = require("path");
    hBl = new Map();
  });
  function dBm() {
    clearPluginCache();
    gor();
    Tor();
    clearPluginHookCache();
    pruneRemovedPluginHooks().catch(e => Oe(e));
    hWn();
    f$o();
    vBl();
    lBm?.();
  }
  function Ag() {
    dBm();
    clearCommandsCache();
    clearAgentDefinitionsCache();
    clearPromptCache();
    resetSentSkillNames();
  }
  async function OFe(e) {
    try {
      await Jse.writeFile(y$o(e), `${Date.now()}`, "utf-8");
    } catch (t) {
      logForDebugging(`Failed to write .orphaned_at: ${e}: ${t}`);
    }
  }
  async function EBl() {
    if (iK()) {
      return;
    }
    try {
      let e = mBm();
      if (!e || e.size === 0) {
        return;
      }
      let t = getPluginCachePath();
      let n = Date.now();
      await Promise.all([...e].map(r => pBm(r)));
      for (let r of await Sor(t)) {
        let o = NXt.join(t, r);
        for (let s of await Sor(o)) {
          let i = NXt.join(o, s);
          for (let a of await Sor(i)) {
            let l = NXt.join(i, a);
            if (e.vZc(l)) {
              continue;
            }
            await fBm(l, n);
          }
          await TBl(i);
        }
        await TBl(o);
      }
    } catch (e) {
      logForDebugging(`Plugin cache cleanup failed: ${e}`);
    }
  }
  function y$o(e) {
    return NXt.join(e, ".orphaned_at");
  }
  async function pBm(e) {
    let t = y$o(e);
    try {
      await Jse.unlink(t);
    } catch (n) {
      if (en(n) === "ENOENT") {
        return;
      }
      logForDebugging(`Failed to remove .orphaned_at: ${e}: ${n}`);
    }
  }
  function mBm() {
    try {
      let e = new Set();
      let t = KO();
      for (let n of Object.values(t.plugins)) {
        for (let r of n) {
          e.add(r.installPath);
        }
      }
      return e;
    } catch (e) {
      logForDebugging(`Failed to load installed plugins: ${e}`);
      return null;
    }
  }
  async function fBm(e, t) {
    let n = y$o(e);
    let r;
    try {
      r = (await Jse.stat(n)).mtimeMs;
    } catch (o) {
      if (en(o) === "ENOENT") {
        await OFe(e);
        return;
      }
      logForDebugging(`Failed to stat orphaned marker: ${e}: ${o}`);
      return;
    }
    if (t - r > 1209600000) {
      try {
        if (await IXt(e)) {
          logForDebugging(`Skipping orphan cleanup, in use by live session: ${e}`);
          return;
        }
      } catch (o) {
        logForDebugging(`Failed to check ${e} for live users, skipping cleanup: ${o}`);
        return;
      }
      try {
        await Jse.rm(e, {
          recursive: true,
          force: true
        });
      } catch (o) {
        logForDebugging(`Failed to delete orphaned version: ${e}: ${o}`);
      }
    }
  }
  async function TBl(e) {
    if ((await Sor(e)).length === 0) {
      try {
        await Jse.rm(e, {
          recursive: true,
          force: true
        });
      } catch (t) {
        logForDebugging(`Failed to remove empty dir: ${e}: ${t}`);
      }
    }
  }
  async function Sor(e) {
    try {
      return (await Jse.readdir(e, {
        withFileTypes: true
      })).filter(n => n.isDirectory()).map(n => n.name);
    } catch {
      return [];
    }
  }
  var Jse;
  var NXt;
  var lBm;
  var p5 = __lazy(() => {
    Bm();
    Kq();
    kS();
    uTe();
    rR();
    je();
    dt();
    Rn();
    c$o();
    Qk();
    Eor();
    OXt();
    Y9e();
    yor();
    xg();
    a9();
    PFe();
    Jse = require("fs/promises");
    NXt = require("path");
    lBm = (GLo(), __toCommonJS(Ukl)).clearPluginWorkflowCache;
  });
  function evt(e, t) {
    let r = e.slice(0, 2).map(i => {
      let a = i.reason || i.error || "unknown error";
      return t ? `${i.name} (${a})` : i.name;
    }).join(t ? "; " : ", ");
    let o = e.length - 2;
    let s = o > 0 ? ` and ${o} more` : "";
    return `${r}${s}`;
  }
  function N7e(e) {
    switch (e.source) {
      case "github":
        return e.repo;
      case "url":
        return e.url;
      case "git":
        return e.url;
      case "directory":
        return e.path;
      case "file":
        return e.path;
      case "settings":
        return `settings:${e.name}`;
      default:
        return "Unknown source";
    }
  }
  function OZ(e, t) {
    return `${e}@${t}`;
  }
  async function Xse(e) {
    let t = [];
    let n = [];
    for (let [r, o] of Object.entries(e)) {
      if (!isSourceAllowedByPolicy(o.source)) {
        continue;
      }
      let s = null;
      try {
        s = await uL(r);
      } catch (i) {
        let a = i instanceof Error ? i.message : String(i);
        n.push({
          name: r,
          error: a
        });
        logForDebugging(`Failed to load plugin marketplace ${r}: ${a}`, {
          level: "error"
        });
      }
      t.push({
        name: r,
        config: o,
        data: s
      });
    }
    return {
      marketplaces: t,
      failures: n
    };
  }
  function tvt(e, t) {
    if (e.length === 0) {
      return null;
    }
    if (t > 0) {
      return {
        type: "warning",
        message: e.length === 1 ? `Warning: Failed to load marketplace '${e[0].name}': ${e[0].error}` : `Warning: Failed to load ${e.length} marketplaces: ${hBm(e)}`
      };
    }
    return {
      type: "error",
      message: `Failed to load all marketplaces. Errors: ${gBm(e)}`
    };
  }
  function hBm(e) {
    return e.map(t => t.name).join(", ");
  }
  function gBm(e) {
    return e.map(t => `${t.name}: ${t.error}`).join("; ");
  }
  function wwe(e) {
    switch (e.source) {
      case "github":
        return `github:${e.repo}${e.ref ? `@${e.ref}` : ""}`;
      case "url":
        return e.url;
      case "git":
        return `git:${e.url}${e.ref ? `@${e.ref}` : ""}`;
      case "npm":
        return `npm:${e.package}`;
      case "file":
        return `file:${e.path}`;
      case "directory":
        return `dir:${e.path}`;
      case "hostPattern":
        return `hostPattern:${e.hostPattern}`;
      case "pathPattern":
        return `pathPattern:${e.pathPattern}`;
      case "skills-dir":
        return "skills-dir";
      case "settings":
        return `settings:${e.name} (${e.plugins.length} ${un(e.plugins.length, "plugin")})`;
      default:
        return "unknown source";
    }
  }
  async function wBl({
    configuredMarketplaceCount: e,
    failedMarketplaceCount: t
  }) {
    if (!(await DGe())) {
      return "git-not-installed";
    }
    let r = getStrictKnownMarketplaces();
    if (r !== null) {
      if (r.length === 0) {
        return "all-blocked-by-policy";
      }
      if (e === 0) {
        return "policy-restricts-sources";
      }
    }
    if (e === 0) {
      return "no-marketplaces-configured";
    }
    if (t > 0 && t === e) {
      return "all-marketplaces-failed";
    }
    return "all-plugins-installed";
  }
  var Cwe = __lazy(() => {
    je();
    Zn();
    LFn();
    yT();
    Xk();
  });
  async function LXt(e, t) {
    let n = Qse.resolve(t);
    let r = Qse.resolve(e);
    if (r !== n && !r.startsWith(n + Qse.sep)) {
      logForDebugging(`fetchOfficialMarketplaceFromGcs: refusing path outside cache dir: ${e}`, {
        level: "error"
      });
      return null;
    }
    await waitForScrollIdle();
    let o = performance.now();
    let s = "failed";
    let i;
    let a;
    let l;
    try {
      let c = await aEe.get(`${"https://downloads.claude.ai/claude-code-releases/plugins/claude-plugins-official"}/latest`, {
        responseType: "text",
        timeout: 1e4
      });
      if (i = String(c.data).trim(), !i) {
        throw Error("latest pointer returned empty body");
      }
      let u = Qse.join(e, ".gcs-sha");
      if ((await dL.readFile(u, "utf8").then(b => b.trim(), () => null)) === i) {
        s = "noop";
        return i;
      }
      let p = await aEe.get(`${"https://downloads.claude.ai/claude-code-releases/plugins/claude-plugins-official"}/${i}.zip`, {
        responseType: "arraybuffer",
        timeout: 60000
      });
      let m = Buffer.from(p.data);
      a = m.length;
      let f = await dpe(m);
      let h = rNe(m);
      let g = `${e}.staging`;
      await dL.rm(g, {
        recursive: true,
        force: true
      });
      await dL.mkdir(g, {
        recursive: true
      });
      for (let [b, S] of Object.entries(f)) {
        if (!b.startsWith("marketplaces/claude-plugins-official/")) {
          continue;
        }
        let E = b.slice(("marketplaces/claude-plugins-official/").length);
        if (!E || E.endsWith("/")) {
          continue;
        }
        let C = Qse.join(g, E);
        await dL.mkdir(Qse.dirname(C), {
          recursive: true
        });
        await dL.writeFile(C, S);
        let x = h[b];
        if (x && x & 73) {
          await dL.chmod(C, x & 511).catch(() => {});
        }
      }
      await dL.writeFile(Qse.join(g, ".gcs-sha"), i);
      let y = `${e}.backup`;
      await dL.rm(y, {
        recursive: true,
        force: true
      }).catch(() => {});
      let _ = false;
      try {
        await dL.rename(e, y);
        _ = true;
      } catch (b) {
        if (en(b) !== "ENOENT") {
          throw b;
        }
      }
      try {
        await dL.rename(g, e);
      } catch (b) {
        if (_) {
          await dL.rename(y, e).catch(() => {});
        }
        throw b;
      }
      await dL.rm(y, {
        recursive: true,
        force: true
      }).catch(() => {});
      s = "updated";
      return i;
    } catch (c) {
      l = _Bm(c);
      logForDebugging(`Official marketplace GCS fetch failed: ${he(c)}`, {
        level: "warn"
      });
      return null;
    } finally {
      logEvent("tengu_plugin_remote_fetch", {
        source: "marketplace_gcs",
        host: "downloads.claude.ai",
        is_official: true,
        outcome: s,
        duration_ms: Math.round(performance.now() - o),
        ...(a !== undefined && {
          bytes: a
        }),
        ...(i && {
          sha: i
        }),
        ...(l && {
          error_kind: l
        })
      });
    }
  }
  function _Bm(e) {
    if (isAxiosError(e)) {
      if (e.code === "ECONNABORTED") {
        return "timeout";
      }
      if (e.response) {
        return `http_${e.response.status}`;
      }
      return "network";
    }
    let t = en(e);
    if (t && /^E[A-Z]+$/.test(t) && !t.startsWith("ERR_")) {
      return yBm.vZc(t) ? `fs_${t}` : "fs_other";
    }
    if (typeof e?.code === "number") {
      return "zip_parse";
    }
    let n = he(e);
    if (/unzip|invalid zip|central directory/i.test(n)) {
      return "zip_parse";
    }
    if (/empty body/.test(n)) {
      return "empty_latest";
    }
    return "other";
  }
  var dL;
  var Qse;
  var yBm;
  var _$o = __lazy(() => {
    at();
    Ot();
    h9t();
    je();
    w6e();
    dt();
    dL = require("fs/promises");
    Qse = require("path");
    yBm = new Set(["ENOSPC", "EACCES", "EPERM", "EXDEV", "EBUSY", "ENOENT", "ENOTDIR", "EROFS", "EMFILE", "ENAMETOOLONG"]);
  });
  function vor() {
    let e = getOriginalCwd();
    let t = $6(findCanonicalGitRoot(e) ?? e);
    return getGlobalConfig().projects?.[t]?.hasTrustDialogAccepted === true;
  }
  var b$o = __lazy(() => {
    at();
    na();
    ku();
  });
  function Ror() {
    return Jd.join(XC(), "known_marketplaces.json");
  }
  function MFe() {
    return Jd.join(XC(), "marketplaces");
  }
  function NFe() {
    uL.cache?.clear?.();
    Cor.clear();
  }
  function L3() {
    let e = {};
    let t = {
      ...AGe(),
      ...(getInitialSettings().enabledPlugins ?? {})
    };
    for (let [o, s] of Object.entries(t)) {
      if (s && Yo(o).marketplace === "claude-plugins-official") {
        e["claude-plugins-official"] = {
          source: Put,
          sourceIsFallback: true
        };
        break;
      }
    }
    let n = vor();
    let r = n ? getInitialSettings().extraKnownMarketplaces ?? {} : SBm();
    return {
      ...e,
      ...(n ? bso() : {}),
      ...r
    };
  }
  function SBm() {
    let e = {};
    for (let t of ew()) {
      if (bBm.vZc(t)) {
        continue;
      }
      let n = getSettingsForSource(t)?.extraKnownMarketplaces;
      if (n) {
        e = fqu(e, n, settingsMergeCustomizer);
      }
    }
    return e;
  }
  function TBm(e) {
    if (getSettingsForSource("policySettings")?.extraKnownMarketplaces?.[e]?.autoUpdate !== undefined) {
      return "managed settings (managed-settings.json)";
    }
    if (getSettingsForSource("flagSettings")?.extraKnownMarketplaces?.[e]?.autoUpdate !== undefined) {
      return "the --settings flag";
    }
    if (bso()[e]?.autoUpdate !== undefined && getInitialSettings().extraKnownMarketplaces?.[e] === undefined) {
      return "an --add-dir directory's settings";
    }
    return null;
  }
  function EBm(e) {
    let t = ["localSettings", "projectSettings", "userSettings"];
    for (let n of t) {
      if (getSettingsForSource(n)?.extraKnownMarketplaces?.[e]) {
        return n;
      }
    }
    return null;
  }
  function UXt(e, t, n = "userSettings") {
    let o = {
      ...(getSettingsForSource(n) ?? {}).extraKnownMarketplaces
    };
    o[e] = t;
    updateSettingsForSource(n, {
      extraKnownMarketplaces: o
    });
  }
  async function hf() {
    let e = zt();
    let t = Ror();
    try {
      let n = await e.readFile(t, {
        encoding: "utf-8"
      });
      let r = qt(n);
      let o = $nt().safeParse(r);
      if (!o.success) {
        let s = `Marketplace configuration file is corrupted: ${o.error.issues.map(i => `${i.path.join(".")}: ${i.message}`).join(", ")}`;
        throw logForDebugging(s, {
          level: "error"
        }), new PB(s, t, r);
      }
      return o.data;
    } catch (n) {
      if (fn(n)) {
        return {};
      }
      if (n instanceof PB) {
        throw n;
      }
      let r = `Failed to load marketplace configuration: ${he(n)}`;
      throw logForDebugging(r, {
        level: "error"
      }), Error(r);
    }
  }
  async function qM() {
    try {
      return await hf();
    } catch {
      return {};
    }
  }
  async function Zse(e) {
    let t = $nt().safeParse(e);
    let n = Ror();
    if (!t.success) {
      throw new PB(`Invalid marketplace config: ${t.error.message}`, n, e);
    }
    let r = zt();
    let o = Jd.join(n, "..");
    await r.mkdir(o);
    vj(n, De(t.data, null, 2));
  }
  async function xor() {
    let e = fde();
    if (e.length === 0) {
      return false;
    }
    let t = await hf();
    let n = new Set();
    let r = 0;
    for (let o of e) {
      let s = await vBm(o);
      if (!s) {
        continue;
      }
      for (let [i, a] of Object.entries(s)) {
        if (n.vZc(i)) {
          continue;
        }
        let l = await wBm(o, i);
        if (!l) {
          logForDebugging(`Seed marketplace '${i}' not found under ${o}/marketplaces/, skipping`, {
            level: "warn"
          });
          continue;
        }
        n.add(i);
        let c = {
          source: a.source,
          installLocation: l,
          lastUpdated: a.lastUpdated,
          autoUpdate: false
        };
        if (gbu(t[i], c)) {
          continue;
        }
        t[i] = c;
        r++;
      }
    }
    if (r > 0) {
      await Zse(t);
      logForDebugging(`Synced ${r} marketplace(s) from seed dir(s)`);
      return true;
    }
    return false;
  }
  async function vBm(e) {
    let t = Jd.join(e, "known_marketplaces.json");
    try {
      let n = await zt().readFile(t, {
        encoding: "utf-8"
      });
      let r = $nt().safeParse(qt(n));
      if (!r.success) {
        logForDebugging(`Seed known_marketplaces.json invalid at ${e}: ${r.error.message}`, {
          level: "warn"
        });
        return null;
      }
      return r.data;
    } catch (n) {
      if (!fn(n)) {
        logForDebugging(`Failed to read seed known_marketplaces.json at ${e}: ${n}`, {
          level: "warn"
        });
      }
      return null;
    }
  }
  async function wBm(e, t) {
    let n = Jd.join(e, "marketplaces", t);
    let r = Jd.join(e, "marketplaces", `${t}.json`);
    for (let o of [n, r]) {
      try {
        await FXt(o);
        return o;
      } catch {}
    }
    return null;
  }
  function LFe(e) {
    return fde().find(t => e === t || e.startsWith(t + Jd.sep));
  }
  function Rwe() {
    let e = process.env.CLAUDE_CODE_PLUGIN_GIT_TIMEOUT_MS;
    if (e) {
      let t = parseInt(e, 10);
      if (!isNaN(t) && t > 0) {
        return t;
      }
    }
    return 120000;
  }
  async function IBl(e, t) {
    await execFileNoThrowWithCwd(gitExe(), ["--git-dir=.git", "remote", "set-url", "origin", t], {
      cwd: e,
      stdin: "ignore"
    });
  }
  async function RBm(e, t, n) {
    logForDebugging(`git pull: cwd=${e} ref=${t ?? "default"}`);
    let r = {
      ...fV(),
      ...(n?.skipLfs && {
        GIT_LFS_SKIP_SMUDGE: "1"
      })
    };
    let o = n?.disableCredentialHelper ? ["-c", "credential.helper="] : [];
    if (t) {
      if (t.startsWith("-")) {
        return {
          code: 1,
          stderr: `Invalid ref "${t}": refs cannot start with "-"`
        };
      }
      let i = await execFileNoThrowWithCwd(gitExe(), [...o, "fetch", "origin", t], {
        cwd: e,
        timeout: Rwe(),
        stdin: "ignore",
        env: r
      });
      if (i.code !== 0) {
        return wor(i);
      }
      let a = await execFileNoThrowWithCwd(gitExe(), [...o, "checkout", t], {
        cwd: e,
        timeout: Rwe(),
        stdin: "ignore",
        env: r
      });
      if (a.code !== 0) {
        return wor(a);
      }
      let l = await execFileNoThrowWithCwd(gitExe(), [...o, "pull", "origin", t], {
        cwd: e,
        timeout: Rwe(),
        stdin: "ignore",
        env: r
      });
      if (l.code !== 0) {
        return wor(l);
      }
      await xBl(e, o, r, n?.sparsePaths);
      return l;
    }
    let s = await execFileNoThrowWithCwd(gitExe(), [...o, "pull", "origin", "HEAD"], {
      cwd: e,
      timeout: Rwe(),
      stdin: "ignore",
      env: r
    });
    if (s.code !== 0) {
      return wor(s);
    }
    await xBl(e, o, r, n?.sparsePaths);
    return s;
  }
  async function xBl(e, t, n, r) {
    if (r && r.length > 0) {
      return;
    }
    if (!(await zt().stat(Jd.join(e, ".gitmodules")).then(() => true, () => false))) {
      return;
    }
    let s = await execFileNoThrowWithCwd(gitExe(), ["-c", "core.sshCommand=ssh -o BatchMode=yes -o StrictHostKeyChecking=yes", ...t, "submodule", "update", "--init", "--recursive", "--depth", "1"], {
      cwd: e,
      timeout: Rwe(),
      stdin: "ignore",
      env: n
    });
    if (s.code !== 0) {
      logForDebugging(`git submodule update failed (non-fatal): ${s.stderr}`, {
        level: "warn"
      });
    }
  }
  function wor(e) {
    if (e.code === 0) {
      return e;
    }
    if (e.error?.includes("timed out")) {
      let t = Math.round(Rwe() / 1000);
      return {
        ...e,
        stderr: `Git pull timed out after ${t}s. Try increasing the timeout via CLAUDE_CODE_PLUGIN_GIT_TIMEOUT_MS environment variable.

Original error: ${e.stderr}`
      };
    }
    if (e.stderr.includes("REMOTE HOST IDENTIFICATION HAS CHANGED")) {
      return {
        ...e,
        stderr: `SSH host key for this marketplace's git host has changed (server key rotation or possible MITM). Remove the stale entry with: ssh-keygen -R <host>
Then connect once manually to accept the new key.

Original error: ${e.stderr}`
      };
    }
    if (e.stderr.includes("Host key verification failed")) {
      return {
        ...e,
        stderr: `SSH host key verification failed while updating marketplace. The host key is not in your known_hosts file. Connect once manually to add it (e.g., ssh -T git@<host>), or remove and re-add the marketplace with an HTTPS URL.

Original error: ${e.stderr}`
      };
    }
    if (e.stderr.includes("Permission denied (publickey)") || e.stderr.includes("Could not read from remote repository")) {
      return {
        ...e,
        stderr: `SSH authentication failed while updating marketplace. Please ensure your SSH keys are configured.

Original error: ${e.stderr}`
      };
    }
    if (e.stderr.includes("timed out") || e.stderr.includes("Could not resolve host")) {
      return {
        ...e,
        stderr: `Network error while updating marketplace. Please check your internet connection.

Original error: ${e.stderr}`
      };
    }
    return e;
  }
  async function PBl() {
    try {
      let e = await execFileNoThrow("ssh", ["-T", "-o", "BatchMode=yes", "-o", "ConnectTimeout=2", "-o", "StrictHostKeyChecking=yes", "git@github.com"], {
        timeout: 3000
      });
      let t = e.code === 1 && (e.stderr?.includes("successfully authenticated") || e.stdout?.includes("successfully authenticated"));
      logForDebugging(`SSH config check: code=${e.code} configured=${t}`);
      return t;
    } catch (e) {
      logForDebugging(`SSH configuration check failed: ${he(e)}`, {
        level: "warn"
      });
      return false;
    }
  }
  function xBm(e) {
    return e.includes("Authentication failed") || e.includes("could not read Username") || e.includes("terminal prompts disabled") || e.includes("403") || e.includes("401");
  }
  function kBl(e) {
    if (e.includes("://")) {
      return null;
    }
    return e.match(/^[^@]+@([^:]+):/)?.[1] ?? null;
  }
  async function kBm(e, t, n, r, o) {
    let s = r && r.length > 0;
    let i = {
      ...fV(),
      ...(o && {
        GIT_LFS_SKIP_SMUDGE: "1"
      })
    };
    let a = ["-c", "core.sshCommand=ssh -o BatchMode=yes -o StrictHostKeyChecking=yes", "clone", "--depth", "1"];
    if (s) {
      a.push("--filter=blob:none", "--no-checkout");
    } else {
      a.push("--recurse-submodules", "--shallow-submodules");
    }
    if (n) {
      a.push("--branch", n);
    }
    a.push("--", e, t);
    let l = Rwe();
    logForDebugging(`git clone: url=${L7e(e)} ref=${n ?? "default"} timeout=${l}ms`);
    let c = await execFileNoThrowWithCwd(gitExe(), a, {
      timeout: l,
      stdin: "ignore",
      env: i
    });
    let u = L7e(e);
    if (e !== u) {
      if (c.error) {
        c.error = c.error.replaceAll(e, u);
      }
      if (c.stderr) {
        c.stderr = c.stderr.replaceAll(e, u);
      }
    }
    if (c.code === 0) {
      if (s) {
        let d = await execFileNoThrowWithCwd(gitExe(), ["sparse-checkout", "set", "--cone", "--", ...r], {
          cwd: t,
          timeout: l,
          stdin: "ignore",
          env: i
        });
        if (d.code !== 0) {
          return {
            code: d.code,
            stderr: `git sparse-checkout set failed: ${d.stderr}`
          };
        }
        let p = await execFileNoThrowWithCwd(gitExe(), ["checkout", "HEAD"], {
          cwd: t,
          timeout: l,
          stdin: "ignore",
          env: i
        });
        if (p.code !== 0) {
          return {
            code: p.code,
            stderr: `git checkout after sparse-checkout failed: ${p.stderr}`
          };
        }
      }
      logForDebugging(`git clone succeeded: ${L7e(e)}`);
      return c;
    }
    if (logForDebugging(`git clone failed: url=${L7e(e)} code=${c.code} error=${c.error ?? "none"} stderr=${c.stderr}`, {
      level: "warn"
    }), c.error?.includes("timed out")) {
      return {
        ...c,
        stderr: `Git clone timed out after ${Math.round(l / 1000)}s. The repository may be too large for the current timeout. Set CLAUDE_CODE_PLUGIN_GIT_TIMEOUT_MS to increase it (e.g., 300000 for 5 minutes).

Original error: ${c.stderr}`
      };
    }
    if (c.stderr) {
      if (c.stderr.includes("REMOTE HOST IDENTIFICATION HAS CHANGED")) {
        let d = kBl(e);
        let p = d ? `ssh-keygen -R ${d}` : "ssh-keygen -R <host>";
        return {
          ...c,
          stderr: `SSH host key has changed (server key rotation or possible MITM). Remove the stale known_hosts entry:
  ${p}
Then connect once manually to verify and accept the new key.

Original error: ${c.stderr}`
        };
      }
      if (c.stderr.includes("Host key verification failed")) {
        let d = kBl(e);
        let p = d ? `ssh -T git@${d}` : "ssh -T git@<host>";
        return {
          ...c,
          stderr: `SSH host key is not in your known_hosts file. To add it, connect once manually (this will show the fingerprint for you to verify):
  ${p}

Or use an HTTPS URL instead (recommended for public repos).

Original error: ${c.stderr}`
        };
      }
      if (c.stderr.includes("Permission denied (publickey)") || c.stderr.includes("Could not read from remote repository")) {
        return {
          ...c,
          stderr: `SSH authentication failed. Please ensure your SSH keys are configured for GitHub, or use an HTTPS URL instead.

Original error: ${c.stderr}`
        };
      }
      if (xBm(c.stderr)) {
        return {
          ...c,
          stderr: `HTTPS authentication failed. Please ensure your credential helper is configured (e.g., gh auth login).

Original error: ${c.stderr}`
        };
      }
      if (c.stderr.includes("timed out") || c.stderr.includes("timeout") || c.stderr.includes("Could not resolve host")) {
        return {
          ...c,
          stderr: `Network error or timeout while cloning repository. Please check your internet connection and try again.

Original error: ${c.stderr}`
        };
      }
    }
    if (!c.stderr) {
      return {
        code: c.code,
        stderr: c.error || `git clone exited with code ${c.code} (no stderr output). Run with --debug to see the full command.`
      };
    }
    return c;
  }
  function f5(e, t) {
    if (!e) {
      return;
    }
    try {
      e(t);
    } catch (n) {
      logForDebugging(`Progress callback error: ${he(n)}`, {
        level: "warn"
      });
    }
  }
  async function ABm(e, t, n) {
    let r = {
      ...fV(),
      ...(n && {
        GIT_LFS_SKIP_SMUDGE: "1"
      })
    };
    if (t && t.length > 0) {
      return execFileNoThrowWithCwd(gitExe(), ["sparse-checkout", "set", "--cone", "--", ...t], {
        cwd: e,
        timeout: Rwe(),
        stdin: "ignore",
        env: r
      });
    }
    let o = await execFileNoThrowWithCwd(gitExe(), ["config", "--get", "core.sparseCheckout"], {
      cwd: e,
      stdin: "ignore",
      env: r
    });
    if (o.code === 0 && o.stdout.trim() === "true") {
      return {
        code: 1,
        stderr: "sparsePaths removed from config but repository is sparse; re-cloning for full checkout"
      };
    }
    return {
      code: 0,
      stderr: ""
    };
  }
  async function hfe(e, t, n, r, o, s) {
    let i = zt();
    let a = Math.round(Rwe() / 1000);
    f5(o, `Refreshing marketplace cache (timeout: ${a}s)\u2026`);
    let l = await ABm(t, r, s?.skipLfs);
    if (l.code === 0) {
      let f = performance.now();
      let h = await RBm(t, n, {
        disableCredentialHelper: s?.disableCredentialHelper,
        sparsePaths: r,
        skipLfs: s?.skipLfs
      });
      if (dM("marketplace_pull", e, h.code === 0 ? "success" : "failure", performance.now() - f, h.code === 0 ? undefined : mV(h.stderr)), h.code === 0) {
        return;
      }
      if (st(process.env.CLAUDE_CODE_PLUGIN_KEEP_MARKETPLACE_ON_FAILURE)) {
        let g = Jd.join(t, ".claude-plugin", "marketplace.json");
        if (await i.stat(g).then(() => true, () => false)) {
          logForDebugging(`git pull failed, keeping existing clone (CLAUDE_CODE_PLUGIN_KEEP_MARKETPLACE_ON_FAILURE): ${h.stderr}`, {
            level: "warn"
          });
          return;
        }
      }
      logForDebugging(`git pull failed, will re-clone: ${h.stderr}`, {
        level: "warn"
      });
    } else {
      logForDebugging(`sparse-checkout reconcile requires re-clone: ${l.stderr}`);
    }
    let c = `${t}.bak`;
    let u = false;
    try {
      await i.rename(c, t);
    } catch (f) {
      if (!fn(f)) {
        let h = Jd.join(t, ".claude-plugin", "marketplace.json");
        if (!(await i.stat(h).then(() => true, () => false))) {
          await i.rm(t, {
            recursive: true,
            force: true
          }).catch(() => {});
          await i.rename(c, t);
        }
      }
    }
    try {
      await i.rm(c, {
        recursive: true,
        force: true
      });
    } catch (f) {
      throw Error(`Failed to clean up stale marketplace backup directory. Please manually delete the directory at ${c} and try again.

Technical details: ${he(f)}`);
    }
    try {
      await i.rename(t, c);
      u = true;
      logForDebugging(`Found stale marketplace directory at ${t}, moving aside to allow re-clone`, {
        level: "warn"
      });
      f5(o, "Found stale directory, cleaning up and re-cloning\u2026");
    } catch (f) {
      if (!fn(f)) {
        throw Error(`Failed to clean up existing marketplace directory. Please manually delete the directory at ${t} and try again.

Technical details: ${he(f)}`);
      }
    }
    let d = n ? ` (ref: ${n})` : "";
    f5(o, `Cloning repository (timeout: ${a}s): ${L7e(e)}${d}`);
    let p = performance.now();
    let m = await kBm(e, t, n, r, s?.skipLfs);
    if (dM("marketplace_clone", e, m.code === 0 ? "success" : "failure", performance.now() - p, m.code === 0 ? undefined : mV(m.stderr)), m.code !== 0) {
      try {
        await i.rm(t, {
          recursive: true,
          force: true
        });
      } catch {}
      if (u) {
        try {
          await i.rename(c, t);
        } catch {}
      }
      throw new Po(`Failed to clone marketplace repository: ${m.stderr}`, `Failed to clone marketplace repository: ${mV(m.stderr)} (exit ${m.code})`);
    }
    if (u) {
      try {
        await i.rm(c, {
          recursive: true,
          force: true
        });
      } catch {}
    }
    f5(o, "Clone complete, validating marketplace\u2026");
  }
  function IBm(e) {
    return Sbu(e, () => "***REDACTED***");
  }
  function L7e(e) {
    try {
      let t = new URL(e);
      if ((t.protocol === "http:" || t.protocol === "https:") && (t.username || t.password)) {
        if (t.username) {
          t.username = "***";
        }
        if (t.password) {
          t.password = "***";
        }
        return t.toString();
      }
    } catch {}
    return e;
  }
  async function OBl(e, t, n, r) {
    let o = zt();
    let s = L7e(e);
    if (f5(r, `Downloading marketplace from ${s}`), logForDebugging(`Downloading marketplace from URL: ${s}`), n && Object.keys(n).length > 0) {
      logForDebugging(`Using custom headers: ${De(IBm(n))}`);
    }
    let i = {
      ...n,
      "User-Agent": "Claude-Code-Plugin-Manager"
    };
    let a;
    let l = performance.now();
    try {
      a = await externalHttp.get(e, {
        timeout: 1e4,
        headers: i
      });
    } catch (d) {
      if (dM("marketplace_url", e, "failure", performance.now() - l, mV(d)), isAxiosError(d)) {
        if (d.code === "ECONNREFUSED" || d.code === "ENOTFOUND") {
          throw Error(`Could not connect to ${s}. Please check your internet connection and verify the URL is correct.

Technical details: ${d.message}`);
        }
        if (d.code === "ETIMEDOUT") {
          throw Error(`Request timed out while downloading marketplace from ${s}. The server may be slow or unreachable.

Technical details: ${d.message}`);
        }
        if (d.response) {
          throw Error(`HTTP ${d.response.status} error while downloading marketplace from ${s}. The marketplace file may not exist at this URL.

Technical details: ${d.message}`);
        }
      }
      throw Error(`Failed to download marketplace from ${s}: ${he(d)}`);
    }
    f5(r, "Validating marketplace data");
    let c = fY().extend({
      plugins: v.array(v.unknown())
    }).safeParse(a.data);
    if (!c.success) {
      throw dM("marketplace_url", e, "failure", performance.now() - l, "invalid_schema"), new PB(`Invalid marketplace schema from URL: ${c.error.issues.map(d => `${d.path.join(".")}: ${d.message}`).join(", ")}`, s, a.data);
    }
    dM("marketplace_url", e, "success", performance.now() - l);
    f5(r, "Saving marketplace to cache");
    let u = Jd.join(t, "..");
    await o.mkdir(u);
    vj(t, De(a.data, null, 2));
  }
  function PBm(e) {
    let n = (e.source === "github" ? e.repo.replaceAll("/", "-") : e.source === "npm" ? e.package.replace("@", "").replaceAll("/", "-") : e.source === "file" ? Jd.basename(e.path).replace(".json", "") : e.source === "directory" ? Jd.basename(e.path) : "temp_" + Date.now()).replace(/[^a-zA-Z0-9\-_]/g, "-");
    return n === "" ? "temp_" + Date.now() : n;
  }
  async function S$o(e, t) {
    let r = await zt().readFile(e, {
      encoding: "utf-8"
    });
    let o;
    try {
      o = qt(r);
    } catch (i) {
      throw new PB(`Invalid JSON in ${e}: ${he(i)}`, e, r);
    }
    let s = t.safeParse(o);
    if (!s.success) {
      throw new PB(`Invalid schema: ${e} ${s.error?.issues.map(i => `${i.path.join(".")}: ${i.message}`).join(", ")}`, e, o);
    }
    return s.data;
  }
  async function T$o(e, t) {
    if (!isSourceAllowedByPolicy(e)) {
      throw Error(`Marketplace source '${wwe(e)}' is blocked by enterprise policy.`);
    }
    let n = zt();
    let r = MFe();
    await n.mkdir(r);
    let o;
    let s;
    let i = false;
    let a = PBm(e);
    try {
      switch (e.source) {
        case "url":
          {
            o = Jd.join(r, `${a}.json`);
            i = true;
            await OBl(e.url, o, e.headers, t);
            s = o;
            break;
          }
        case "github":
          {
            let m = `git@${"github.com"}:${e.repo}.git`;
            let f = `https://github.com/${e.repo}.git`;
            if (o = Jd.join(r, a), i = true, yOe()) {
              f5(t, `Cloning via HTTPS: ${f}`);
              await IBl(o, f);
              await hfe(f, o, e.ref, e.sparsePaths, t, {
                skipLfs: e.skipLfs
              });
              s = Jd.join(o, e.path || ".claude-plugin/marketplace.json");
              break;
            }
            let h = null;
            if (await PBl()) {
              f5(t, `Cloning via SSH: ${m}`);
              try {
                await hfe(m, o, e.ref, e.sparsePaths, t, {
                  skipLfs: e.skipLfs
                });
              } catch (y) {
                h = sr(y);
                logForDebugging(`SSH clone failed for ${e.repo}: ${h.message}`, {
                  level: "error"
                });
                f5(t, `SSH clone failed, retrying with HTTPS: ${f}`);
                logForDebugging(`SSH clone failed for ${e.repo} despite SSH being configured, falling back to HTTPS`, {
                  level: "info"
                });
                await n.rm(o, {
                  recursive: true,
                  force: true
                });
                try {
                  await hfe(f, o, e.ref, e.sparsePaths, t, {
                    skipLfs: e.skipLfs
                  });
                  h = null;
                } catch (_) {
                  h = sr(_);
                  logForDebugging(`Failed to clone marketplace repo ${e.repo} via HTTPS after SSH fallback: ${h.message}`, {
                    level: "error"
                  });
                }
              }
            } else {
              f5(t, `SSH not configured, cloning via HTTPS: ${f}`);
              logForDebugging(`SSH not configured for GitHub, using HTTPS for ${e.repo}`, {
                level: "info"
              });
              try {
                await hfe(f, o, e.ref, e.sparsePaths, t, {
                  skipLfs: e.skipLfs
                });
              } catch (y) {
                h = sr(y);
                logForDebugging(`HTTPS git clone failed for marketplace ${e.repo}: ${h.message}`, {
                  level: "error"
                });
                f5(t, `HTTPS clone failed, retrying with SSH: ${m}`);
                logForDebugging(`HTTPS clone failed for ${e.repo} (${h.message}), falling back to SSH`, {
                  level: "info"
                });
                await n.rm(o, {
                  recursive: true,
                  force: true
                });
                try {
                  await hfe(m, o, e.ref, e.sparsePaths, t, {
                    skipLfs: e.skipLfs
                  });
                  h = null;
                } catch (_) {
                  h = sr(_);
                  logForDebugging(`SSH clone fallback also failed for ${e.repo}: ${h.message}`, {
                    level: "error"
                  });
                }
              }
            }
            if (h) {
              throw h;
            }
            s = Jd.join(o, e.path || ".claude-plugin/marketplace.json");
            break;
          }
        case "git":
          {
            o = Jd.join(r, a);
            i = true;
            await hfe(e.url, o, e.ref, e.sparsePaths, t, {
              skipLfs: e.skipLfs
            });
            s = Jd.join(o, e.path || ".claude-plugin/marketplace.json");
            break;
          }
        case "npm":
          throw Error("NPM marketplace sources not yet implemented");
        case "file":
          {
            let m = Jd.resolve(e.path);
            s = m;
            o = Jd.dirname(Jd.dirname(m));
            i = false;
            break;
          }
        case "directory":
          {
            let m = Jd.resolve(e.path);
            s = Jd.join(m, ".claude-plugin", "marketplace.json");
            o = m;
            i = false;
            break;
          }
        case "settings":
          {
            o = Jd.join(r, e.name);
            s = Jd.join(o, ".claude-plugin", "marketplace.json");
            i = false;
            await n.mkdir(Jd.dirname(s));
            await ABl.writeFile(s, De({
              name: e.name,
              owner: e.owner ?? {
                name: "settings"
              },
              plugins: e.plugins
            }, null, 2));
            break;
          }
        default:
          throw Error("Unsupported marketplace source type");
      }
      logForDebugging(`Reading marketplace from ${s}`);
      let l;
      try {
        l = await S$o(s, fY());
      } catch (m) {
        if (fn(m)) {
          throw Error(`Marketplace file not found at ${s}`);
        }
        throw Error(`Failed to parse marketplace file at ${s}: ${he(m)}`);
      }
      let c = W1r(l.name, e);
      if (c) {
        throw Error(c);
      }
      let u = Jd.join(r, l.name);
      let d = Jd.resolve(u);
      let p = Jd.resolve(r);
      if (!d.startsWith(p + Jd.sep)) {
        throw Error(`Marketplace name '${l.name}' resolves to a path outside the cache directory`);
      }
      if (o !== u && !q6(e)) {
        let m = false;
        try {
          let [f, h] = await Promise.all([n.stat(o), n.stat(u)]);
          m = f.dev === h.dev && f.ino === h.ino && f.ino !== 0;
        } catch {}
        if (m) {
          o = u;
          i = false;
        } else {
          try {
            try {
              t?.("Cleaning up old marketplace cache\u2026");
            } catch (f) {
              logForDebugging(`Progress callback error: ${he(f)}`, {
                level: "warn"
              });
            }
            await n.rm(u, {
              recursive: true,
              force: true
            });
            await n.rename(o, u);
            o = u;
            i = false;
          } catch (f) {
            let h = he(f);
            throw Error(`Failed to finalize marketplace cache. Please manually delete the directory at ${u} if it exists and try again.

Technical details: ${h}`);
          }
        }
      }
      return {
        marketplace: l,
        cachePath: o
      };
    } catch (l) {
      if (i && o && !q6(e)) {
        try {
          await n.rm(o, {
            recursive: true,
            force: true
          });
        } catch (c) {
          logForDebugging(`Warning: Failed to clean up temporary marketplace cache at ${o}: ${he(c)}`, {
            level: "warn"
          });
        }
      }
      throw l;
    }
  }
  async function FFe(e, t) {
    let n = e;
    if (q6(e) && !Jd.isAbsolute(e.path)) {
      n = {
        ...e,
        path: Jd.resolve(e.path)
      };
    }
    if (!isSourceAllowedByPolicy(n)) {
      if (isSourceInBlocklist(n)) {
        throw Error(`Marketplace source '${wwe(n)}' is blocked by enterprise policy.`);
      }
      let c = getStrictKnownMarketplaces() || [];
      let u = getHostPatternsFromAllowlist();
      let d = extractHostFromSource(n);
      let p = `Marketplace source '${wwe(n)}'`;
      if (d) {
        p += ` (${d})`;
      }
      if (p += " is blocked by enterprise policy.", c.length > 0) {
        p += ` Allowed sources: ${c.map(m => wwe(m)).join(", ")}`;
      } else {
        p += " No external marketplaces are allowed.";
      }
      if (n.source === "github" && u.length > 0) {
        p += `

Tip: The shorthand "${n.repo}" assumes github.com. For internal GitHub Enterprise, use the full URL:
  git@your-github-host.com:${n.repo}.git`;
      }
      throw Error(p);
    }
    let r = await hf();
    for (let [c, u] of Object.entries(r)) {
      if (gbu(u.source, n)) {
        logForDebugging(`Source already materialized as '${c}', skipping clone`);
        return {
          name: c,
          alreadyMaterialized: true,
          resolvedSource: n
        };
      }
    }
    let {
      marketplace: o,
      cachePath: s
    } = await T$o(n, t);
    let i = W1r(o.name, n);
    if (i) {
      throw Error(i);
    }
    let a = await hf();
    let l = a[o.name];
    if (l) {
      let c = LFe(l.installLocation);
      if (c) {
        throw Error(`Marketplace '${o.name}' is seed-managed (${c}). To use a different source, ask your admin to update the seed, or use a different marketplace name.`);
      }
      if (logForDebugging(`Marketplace '${o.name}' exists with different source \u2014 overwriting`), !q6(l.source)) {
        let u = Jd.resolve(MFe());
        let d = Jd.resolve(l.installLocation);
        let p = Jd.resolve(s);
        if (d === p) {
          ;
        } else if (d === u || d.startsWith(u + Jd.sep)) {
          await zt().rm(l.installLocation, {
            recursive: true,
            force: true
          });
        } else {
          logForDebugging(`Skipping cleanup of old installLocation (${l.installLocation}) \u2014 ` + `outside ${u}. The path is corrupted; leaving it alone and overwriting the config entry.`, {
            level: "warn"
          });
        }
      }
    }
    a[o.name] = {
      source: n,
      installLocation: s,
      lastUpdated: new Date().toISOString()
    };
    await Zse(a);
    logForDebugging(`Added marketplace source: ${o.name}`);
    return {
      name: o.name,
      alreadyMaterialized: false,
      resolvedSource: n
    };
  }
  async function nvt(e, t) {
    let n = await hf();
    if (!n[e]) {
      throw Error(`Marketplace '${e}' not found`);
    }
    let r = n[e];
    let o = LFe(r.installLocation);
    let s = nso(e) ? ` To stop using its plugins: claude plugin disable <plugin>@${e}` : " To stop using its plugins, disable each one in /plugin.";
    if (o && t === undefined) {
      throw Error(`Marketplace '${e}' is registered from the read-only seed directory (${o}) and will be re-registered on next startup.${s}`);
    }
    let i = false;
    if (t !== undefined) {
      if (!getSettingsForSource(t)?.extraKnownMarketplaces?.[e]) {
        let u = o ? `It is registered from the read-only seed directory.${s}` : "Omit --scope to remove it from all scopes.";
        throw Error(`Marketplace '${e}' is not declared in ${vFn(t)} settings. ${u}`);
      }
      i = Boolean(o) || sF.some(u => u !== t && getSettingsForSource(u)?.extraKnownMarketplaces?.[e]) || Boolean(getSettingsForSource("policySettings")?.extraKnownMarketplaces?.[e]);
    }
    if (!i) {
      delete n[e];
      await Zse(n);
      let u = zt();
      let d = MFe();
      let p = Jd.join(d, e);
      await u.rm(p, {
        recursive: true,
        force: true
      });
      await u.rm(`${p}.bak`, {
        recursive: true,
        force: true
      });
      let m = Jd.join(d, `${e}.json`);
      await u.rm(m, {
        force: true
      });
    }
    let a = !i;
    for (let u of sF) {
      let d = t === undefined || u === t;
      if (!d && !a) {
        continue;
      }
      let p = getSettingsForSource(u);
      if (!p) {
        continue;
      }
      let m = false;
      let f = {};
      if (d && p.extraKnownMarketplaces?.[e]) {
        let h = {
          ...p.extraKnownMarketplaces
        };
        h[e] = undefined;
        f.extraKnownMarketplaces = h;
        m = true;
      }
      if (a && p.enabledPlugins) {
        let h = `@${e}`;
        let g = {
          ...p.enabledPlugins
        };
        let y = false;
        for (let _ in g) {
          if (_.endsWith(h)) {
            g[_] = undefined;
            y = true;
          }
        }
        if (y) {
          f.enabledPlugins = g;
          m = true;
        }
      }
      if (m) {
        let h = updateSettingsForSource(u, f);
        if (h.error) {
          logForDebugging(`Failed to clean up marketplace '${e}' from ${u} settings: ${h.error.message}`, {
            level: "error"
          });
        } else {
          logForDebugging(`Cleaned up marketplace '${e}' from ${u} settings`);
        }
      }
    }
    if (i) {
      logForDebugging(`Removed marketplace '${e}' declaration from ${t}; still declared in another scope, keeping state layer and installed plugins`);
      return;
    }
    let {
      orphanedPaths: l,
      removedPluginIds: c
    } = LBl(e);
    for (let u of l) {
      await OFe(u);
    }
    for (let u of c) {
      await Uft(u);
      await Pdt(u);
    }
    Aut(c);
    logForDebugging(`Removed marketplace source: ${e}`);
  }
  async function FXt(e) {
    let t = Jd.join(e, ".claude-plugin", "marketplace.json");
    try {
      return await S$o(t, fY());
    } catch (n) {
      if (n instanceof PB) {
        throw n;
      }
      let r = en(n);
      if (r !== "ENOENT" && r !== "ENOTDIR") {
        throw n;
      }
    }
    return await S$o(e, fY());
  }
  async function h5(e) {
    let t = zt();
    let n = Ror();
    try {
      let r = await t.readFile(n, {
        encoding: "utf-8"
      });
      let s = qt(r)[e];
      if (!s) {
        return null;
      }
      return await FXt(s.installLocation);
    } catch (r) {
      if (fn(r)) {
        return null;
      }
      logForDebugging(`Failed to read cached marketplace ${e}: ${he(r)}`, {
        level: "warn"
      });
      return null;
    }
  }
  async function E$o(e) {
    let {
      name: t,
      marketplace: n
    } = Yo(e);
    if (!t || !n) {
      return null;
    }
    let r = zt();
    let o = Ror();
    try {
      let s = await r.readFile(o, {
        encoding: "utf-8"
      });
      let a = qt(s)[n];
      if (!a) {
        return null;
      }
      let l = await h5(n);
      if (!l) {
        return null;
      }
      let c = l.plugins.find(u => u.name === t);
      if (!c) {
        return null;
      }
      return {
        entry: c,
        marketplaceInstallLocation: a.installLocation
      };
    } catch {
      return null;
    }
  }
  async function xO(e) {
    let t = await E$o(e);
    if (t) {
      return t;
    }
    let {
      name: n,
      marketplace: r
    } = Yo(e);
    if (!n || !r) {
      return null;
    }
    try {
      let s = (await hf())[r];
      if (!s) {
        return null;
      }
      let a = (await uL(r)).plugins.find(l => l.name === n);
      if (!a) {
        return null;
      }
      return {
        entry: a,
        marketplaceInstallLocation: s.installLocation
      };
    } catch (o) {
      logForDebugging(`Could not find plugin ${e}: ${he(o)}`, {
        level: "debug"
      });
      return null;
    }
  }
  async function DBl() {
    let e = await hf();
    for (let [t, n] of Object.entries(e)) {
      if (LFe(n.installLocation)) {
        logForDebugging(`Skipping seed-managed marketplace '${t}' in bulk refresh`);
        continue;
      }
      if (n.source.source === "settings") {
        continue;
      }
      if (!isSourceAllowedByPolicy(n.source)) {
        logForDebugging(`Skipping policy-blocked marketplace '${t}' in bulk refresh`);
        continue;
      }
      let r = false;
      if (t === "claude-plugins-official") {
        if ((await LXt(n.installLocation, MFe())) !== null) {
          Pe("plugin_official_marketplace_fetch");
          e[t].lastUpdated = new Date().toISOString();
          continue;
        }
        if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_plugin_official_mkt_git_fallback", true)) {
          Ae("plugin_official_marketplace_fetch", "gcs_failed_fallback_disabled");
          logForDebugging("Skipping official marketplace bulk refresh: GCS failed, git fallback disabled");
          continue;
        }
        r = true;
      }
      try {
        let {
          cachePath: o
        } = await T$o(n.source);
        if (e[t].lastUpdated = new Date().toISOString(), e[t].installLocation = o, r) {
          Et("plugin_official_marketplace_fetch", "gcs_failed_git_fallback");
        }
      } catch (o) {
        if (r) {
          Ae("plugin_official_marketplace_fetch", "gcs_and_git_failed");
        }
        logForDebugging(`Failed to refresh marketplace ${t}: ${he(o)}`, {
          level: "error"
        });
      }
    }
    await Zse(e);
  }
  function eie(e, t, n) {
    let r = `${e}:${n?.disableCredentialHelper ? 1 : 0}`;
    let o = Cor.get(r);
    if (o) {
      if (t) {
        o.listeners.push(t);
      }
      return o.promise;
    }
    let s = t ? [t] : [];
    let a = OBm(e, l => {
      for (let c of s) {
        f5(c, l);
      }
    }, n).finally(() => Cor.delete(r));
    Cor.set(r, {
      promise: a,
      listeners: s
    });
    return a;
  }
  async function OBm(e, t, n) {
    let r = await hf();
    let o = r[e];
    if (!o) {
      throw Error(`Marketplace '${e}' not found. Available marketplaces: ${Object.keys(r).join(", ")}`);
    }
    if (!isSourceAllowedByPolicy(o.source)) {
      throw Error(`Marketplace source '${wwe(o.source)}' is blocked by enterprise policy.`);
    }
    if (n?.skipIfRecent && o.lastUpdated) {
      let i = Date.now() - new Date(o.lastUpdated).getTime();
      if (i >= 0 && i < 30000) {
        logForDebugging(`Skipping refresh for marketplace '${e}' \u2014 refreshed ${Math.round(i / 1000)}s ago`);
        return;
      }
    }
    if (uL.cache?.delete?.(e), o.source.source === "settings") {
      logForDebugging(`Skipping refresh for settings-sourced marketplace '${e}' \u2014 no upstream`);
      return;
    }
    let s = false;
    try {
      let {
        installLocation: i,
        source: a
      } = o;
      let l = LFe(i);
      if (l) {
        throw Error(`Marketplace '${e}' is seed-managed (${l}) and its content is controlled by the seed image. To update: ask your admin to update the seed.`);
      }
      if (!q6(a)) {
        let c = Jd.resolve(MFe());
        let u = Jd.resolve(i);
        if (u !== c && !u.startsWith(c + Jd.sep)) {
          let d = Py("plugin marketplace remove", e);
          throw Error(`Marketplace '${e}' has a corrupted installLocation (${i}) \u2014 expected a path inside ${c}. This can happen after cross-platform path writes or manual edits to known_marketplaces.json. ${d ? `Run \`${d}\`` : "Remove the entry"} and re-add it.`);
        }
      }
      if (e === "claude-plugins-official") {
        if ((await LXt(i, MFe())) !== null) {
          Pe("plugin_official_marketplace_fetch");
          r[e] = {
            ...o,
            lastUpdated: new Date().toISOString()
          };
          await Zse(r);
          return;
        }
        if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_plugin_official_mkt_git_fallback", true)) {
          throw Ae("plugin_official_marketplace_fetch", "gcs_failed_fallback_disabled"), Error("Official marketplace GCS fetch failed and git fallback is disabled");
        }
        s = true;
        logForDebugging("Official marketplace GCS failed; falling back to git", {
          level: "warn"
        });
      }
      if (a.source === "github" || a.source === "git") {
        let c = {
          ...n,
          skipLfs: a.skipLfs
        };
        if (a.source === "github") {
          let u = `git@${"github.com"}:${a.repo}.git`;
          let d = `https://github.com/${a.repo}.git`;
          if (yOe()) {
            await IBl(i, d);
            await hfe(d, i, a.ref, a.sparsePaths, t, c);
          } else {
            let p = await PBl();
            let m = p ? u : d;
            let f = p ? d : u;
            try {
              await hfe(m, i, a.ref, a.sparsePaths, t, c);
            } catch {
              logForDebugging(`Marketplace refresh failed with ${p ? "SSH" : "HTTPS"} for ${a.repo}, falling back to ${p ? "HTTPS" : "SSH"}`, {
                level: "info"
              });
              await hfe(f, i, a.ref, a.sparsePaths, t, c);
            }
          }
        } else {
          await hfe(a.url, i, a.ref, a.sparsePaths, t, c);
        }
        try {
          await FXt(i);
        } catch {
          let u = a.source === "github" ? a.repo : L7e(a.url);
          let d = e === "claude-code-plugins" ? `We've deprecated "claude-code-plugins" in favor of "claude-plugins-official".` : "This marketplace may have been deprecated or moved to a new location.";
          let p = Py("plugin marketplace remove", e);
          throw Error(`The marketplace.json file is no longer present in this repository.

${d}
Source: ${u}` + (p ? `

You can remove this marketplace with: ${p}` : `

You can remove this marketplace from /plugin or by editing known_marketplaces.json.`));
        }
      } else if (a.source === "url") {
        await OBl(a.url, i, a.headers, t);
      } else if (q6(a)) {
        f5(t, "Validating local marketplace");
        await FXt(i);
      } else {
        throw Error("Unsupported marketplace source type for refresh");
      }
      if (r[e].lastUpdated = new Date().toISOString(), await Zse(r), s) {
        Et("plugin_official_marketplace_fetch", "gcs_failed_git_fallback");
      }
      logForDebugging(`Successfully refreshed marketplace: ${e}`);
    } catch (i) {
      if (s) {
        Ae("plugin_official_marketplace_fetch", "gcs_and_git_failed");
      }
      let a = i instanceof Error ? i.message : String(i);
      throw logForDebugging(`Failed to refresh marketplace ${e}: ${a}`, {
        level: "error"
      }), Error(`Failed to refresh marketplace '${e}': ${a}`);
    }
  }
  async function MBl(e, t) {
    let n = await hf();
    let r = n[e];
    if (!r) {
      throw Error(`Marketplace '${e}' not found. Available marketplaces: ${Object.keys(n).join(", ")}`);
    }
    let o = LFe(r.installLocation);
    if (o) {
      throw Error(`Marketplace '${e}' is seed-managed (${o}) and auto-update is always disabled for seed content. To update: ask your admin to update the seed.`);
    }
    let s = TBm(e);
    if (s !== null) {
      throw Error(`Auto-update for '${e}' is set by ${s} and can't be changed here. Update that settings source (or ask your admin to) instead.`);
    }
    if (r.autoUpdate === t) {
      return;
    }
    n[e] = {
      ...r,
      autoUpdate: t
    };
    await Zse(n);
    let i = EBm(e);
    if (i) {
      let a = getSettingsForSource(i)?.extraKnownMarketplaces?.[e];
      if (a) {
        UXt(e, {
          source: a.source,
          autoUpdate: t
        }, i);
      }
    }
    logForDebugging(`Set autoUpdate=${t} for marketplace: ${e}`);
  }
  async function NBl(e) {
    let t = L3();
    if (Object.keys(t).length === 0) {
      return false;
    }
    let n;
    if (e) {
      n = e;
    } else {
      try {
        n = await hf();
      } catch (o) {
        logForDebugging(`syncDeclaredAutoUpdateToJson: failed to load known_marketplaces.json: ${he(o)}`, {
          level: "error"
        });
        return false;
      }
    }
    let r = false;
    for (let [o, s] of Object.entries(t)) {
      if (s.autoUpdate === undefined) {
        continue;
      }
      let i = n[o];
      if (!i || LFe(i.installLocation)) {
        continue;
      }
      if (i.autoUpdate === s.autoUpdate) {
        continue;
      }
      n[o] = {
        ...i,
        autoUpdate: s.autoUpdate
      };
      r = true;
      logForDebugging(`Synced autoUpdate=${s.autoUpdate} from settings for marketplace: ${o}`);
    }
    if (r) {
      await Zse(n);
    }
    return r;
  }
  var ABl;
  var Jd;
  var bBm;
  var uL;
  var Cor;
  var yT = __lazy(() => {
    ln();
    $n();
    pk();
    BT();
    je();
    gn();
    dt();
    ji();
    na();
    fk();
    nf();
    Gke();
    dV();
    IFn();
    p5();
    iqt();
    MGe();
    Qk();
    Cwe();
    OGe();
    _$o();
    k1();
    Kf();
    a9();
    Xk();
    TC();
    b$o();
    ABl = require("fs/promises");
    Jd = require("path");
    bBm = new Set(["projectSettings", "localSettings"]);
    uL = TEr(async e => {
      let t = await hf();
      let n = t[e];
      if (!n) {
        throw $o(Error(`Marketplace '${e}' not found in configuration. Available marketplaces: ${Object.keys(t).join(", ")}`), "Marketplace not found in configuration");
      }
      if (q6(n.source) && !Jd.isAbsolute(n.source.path)) {
        let o = Py("plugin marketplace remove", e);
        throw $o(Error(`Marketplace "${e}" has a relative source path (${n.source.path}) ` + "in known_marketplaces.json \u2014 this is stale state from an older " + `Claude Code version. ${o ? `Run \`${o}\` and re-add` : "Remove and re-add"} it from the original project directory.`), "Marketplace has relative source path (legacy state)");
      }
      try {
        return await FXt(n.installLocation);
      } catch (o) {
        logForDebugging(`Cache corrupted or missing for marketplace ${e}, re-fetching from source: ${he(o)}`, {
          level: "warn"
        });
      }
      let r;
      try {
        ({
          marketplace: r
        } = await T$o(n.source));
      } catch (o) {
        throw $o(Error(`Failed to load marketplace "${e}" from source (${n.source.source}): ${he(o)}`), "Failed to load marketplace from source");
      }
      t[e].lastUpdated = new Date().toISOString();
      await Zse(t);
      return r;
    });
    Cor = new Map();
  });