  __export(ZJn, {
    sendToUdsSocket: () => sendToUdsSocket,
    sendControlToUdsSocket: () => sendControlToUdsSocket,
    listLivePeerSessions: () => listLivePeerSessions,
    listAllLiveSessions: () => listAllLiveSessions,
    formatCrossSessionMessage: () => formatCrossSessionMessage,
    buildCrossSessionAttrs: () => buildCrossSessionAttrs
  });
  function gym(e) {
    return hym.includes(e) ? e : undefined;
  }
  function _ym(e) {
    return yym.includes(e) ? e : undefined;
  }
  async function sendToUdsSocket(e, t, n) {
    let o = formatCrossSessionMessage(undefined, n, t);
    logForDebugging(`[uds-client] Sending ${t.length} chars to ${e}`);
    let s = vKt();
    await _hl(e, {
      ...s,
      type: "user",
      message: {
        role: "user",
        content: o
      },
      priority: "next",
      from: undefined
    });
    return {
      msgId: s.msg_id
    };
  }
  function sendControlToUdsSocket(e, t) {
    logForDebugging(`[uds-client] Sending control:${t.action} to ${e}`);
    return _hl(e, {
      type: "control",
      ...t,
      ...vKt()
    });
  }
  function buildCrossSessionAttrs(e, t) {
    let n = [];
    if (e) {
      n.push(`from="${e}"`);
    }
    let r = t?.replace(/["\n\r<>]/g, "").trim();
    if (r) {
      n.push(`from-name="${r}"`);
    }
    return n.length > 0 ? ` ${n.join(" ")}` : "";
  }
  function formatCrossSessionMessage(e, t, n) {
    let r = buildCrossSessionAttrs(e, t);
    return `<${"cross-session-message"}${r}>
${YDe("cross-session-message", n)}
</${"cross-session-message"}>`;
  }
  function _hl(e, t) {
    return new Promise((n, r) => {
      if (!Sse(e)) {
        r(Error(`Refusing to connect to non-local IPC path: ${e}`));
        return;
      }
      let o = BPo.connect({
        path: e
      });
      let s = false;
      o.setTimeout(5000, () => {
        s = true;
        o.destroy();
        r(Error(`Timed out sending to ${e}`));
      });
      o.on("error", i => {
        s = true;
        r(i);
      });
      o.on("connect", () => {
        o.end(De(t) + `
`);
      });
      o.on("close", () => {
        if (!s) {
          logForDebugging(`[uds-client] Sent to ${e}`);
        }
        n();
      });
    });
  }
  function bym(e) {
    return new Promise(t => {
      if (!Sse(e)) {
        t(false);
        return;
      }
      let n = BPo.connect({
        path: e
      });
      let r = o => {
        n.destroy();
        t(o);
      };
      n.on("connect", () => r(true));
      n.on("error", o => r(en(o) === "EBUSY"));
      n.setTimeout(250, () => r(false));
    });
  }
  async function bhl() {
    let e = UPo.join(er(), "sessions");
    let t;
    try {
      t = await wKt.readdir(e);
    } catch {
      return [];
    }
    return (await Promise.all(t.filter(r => /^\d+\.json$/.test(r)).map(async r => {
      try {
        let o = parseInt(r.replace(/\.json$/, ""), 10);
        if (isNaN(o)) {
          return null;
        }
        let s = UPo.join(e, r);
        let i = await t0(s, 262144);
        if (i === null) {
          return null;
        }
        let a = qt(i);
        return {
          sock: typeof a.messagingSocketPath === "string" ? a.messagingSocketPath : "",
          cwd: typeof a.cwd === "string" ? a.cwd : "?",
          startedAt: a.startedAt ?? 0,
          procStart: typeof a.procStart === "string" ? a.procStart : undefined,
          name: typeof a.name === "string" ? a.name : undefined,
          kind: gym(a.kind),
          sessionId: a.sessionId,
          jobId: typeof a.jobId === "string" ? a.jobId : undefined,
          bridgeSessionId: typeof a.bridgeSessionId === "string" ? a.bridgeSessionId : undefined,
          logPath: a.logPath,
          status: _ym(a.status),
          waitingFor: typeof a.waitingFor === "string" ? a.waitingFor : undefined,
          updatedAt: typeof a.updatedAt === "number" ? a.updatedAt : undefined,
          statusUpdatedAt: typeof a.statusUpdatedAt === "number" ? a.statusUpdatedAt : undefined,
          entrypoint: typeof a.entrypoint === "string" ? a.entrypoint : undefined,
          agent: typeof a.agent === "string" ? a.agent : undefined,
          state: typeof a.state === "string" ? a.state : undefined,
          detail: typeof a.detail === "string" ? a.detail : undefined,
          tempo: a.tempo === "active" || a.tempo === "idle" || a.tempo === "blocked" ? a.tempo : undefined,
          needs: typeof a.needs === "string" ? a.needs : undefined,
          peerProtocol: typeof a.peerProtocol === "number" ? a.peerProtocol : undefined,
          tmux: typeof a.tmux === "string" ? a.tmux : undefined,
          pid: o,
          file: s
        };
      } catch {
        return null;
      }
    }))).filter(r => r !== null);
  }
  async function listAllLiveSessions() {
    let e = await bhl();
    let t = e.map(s => isProcessRunning(s.pid));
    let n = await Promise.all(e.map((s, i) => t[i] && isSameProcessAsync(s.pid, s.procStart)));
    let r = Wt() !== "wsl";
    let o = [];
    for (let s = 0; s < e.length; s++) {
      let {
        file: i,
        ...a
      } = e[s];
      if (n[s]) {
        o.push(a);
      } else if (r && !t[s]) {
        wKt.unlink(i).catch(() => {});
      }
    }
    return o;
  }
  async function listLivePeerSessions() {
    let t = (await bhl()).filter(s => s.sock && s.sock !== undefined);
    let n = await Promise.all(t.map(s => bym(s.sock)));
    let r = Wt() !== "wsl";
    let o = [];
    for (let s = 0; s < t.length; s++) {
      let {
        file: i,
        ...a
      } = t[s];
      if (n[s]) {
        o.push(a);
      } else if (r && !isProcessRunning(a.pid)) {
        wKt.unlink(i).catch(() => {});
      }
    }
    return o;
  }
  var wKt;
  var BPo;
  var UPo;
  var hym;
  var yym;
  var wze = __lazy(() => {
    np();
    je();
    gn();
    dt();
    n1();
    Tb();
    XJn();
    Cs();
    wx();
    wKt = require("fs/promises");
    BPo = require("net");
    UPo = require("path");
    hym = ["interactive", "bg", "daemon", "daemon-worker"];
    yym = ["busy", "shell", "idle", "waiting"];
  });
  var whl = {};
  __export(whl, {
    restoreSkillStateFromMessages: () => restoreSkillStateFromMessages,
    removeInterruptedMessage: () => removeInterruptedMessage,
    loadMessagesFromJsonlPath: () => loadMessagesFromJsonlPath,
    loadConversationForResume: () => loadConversationForResume,
    getResumePrompt: () => getResumePrompt,
    findLiveNonInteractiveSession: () => findLiveNonInteractiveSession,
    dropRetractedMessages: () => dropRetractedMessages,
    deserializeMessagesWithInterruptDetection: () => deserializeMessagesWithInterruptDetection,
    deserializeMessages: () => deserializeMessages,
    dedupeSessionStartHookMessages: () => dedupeSessionStartHookMessages
  });
  function Rym(e) {
    if (e.type !== "attachment") {
      return e;
    }
    let t = e.attachment;
    if (Cym.vZc(t.type)) {
      return null;
    }
    if (t.type === "new_file") {
      return {
        ...e,
        attachment: {
          ...t,
          type: "file",
          displayPath: Ibt.relative(Nt(), t.filename)
        }
      };
    }
    if (t.type === "new_directory") {
      return {
        ...e,
        attachment: {
          ...t,
          type: "directory",
          displayPath: Ibt.relative(Nt(), t.path)
        }
      };
    }
    if (!("displayPath" in t)) {
      let n = "filename" in t ? t.filename : "path" in t ? t.path : "skillDir" in t ? t.skillDir : undefined;
      if (n) {
        return {
          ...e,
          attachment: {
            ...t,
            displayPath: Ibt.relative(Nt(), n)
          }
        };
      }
    }
    return e;
  }
  function xym(e) {
    if (e.type !== "assistant" && e.type !== "user") {
      return null;
    }
    let t = e.message.content;
    if (!Array.isArray(t)) {
      return null;
    }
    let n = t.filter(r => r.type !== "text" || typeof r.text === "string");
    if (n.length === t.length) {
      return null;
    }
    return {
      ...e,
      message: {
        ...e.message,
        content: n
      }
    };
  }
  function getResumePrompt() {
    return process.env.CLAUDE_CODE_RESUME_PROMPT || "Continue from where you left off.";
  }
  function removeInterruptedMessage(e, t) {
    let n = e.findIndex(r => r.uuid === t.uuid);
    if (n !== -1) {
      e.splice(n, 2);
    }
  }
  function deserializeMessages(e) {
    return deserializeMessagesWithInterruptDetection(e).messages;
  }
  function deserializeMessagesWithInterruptDetection(e, t, n, r) {
    try {
      let o = dropRetractedMessages(e);
      let s = 0;
      let i = o.map(Rym).filter(y => y !== null).flatMap(y => {
        let _ = xym(y);
        if (_ === null) {
          return [y];
        }
        s += 1;
        let b = _.message.content;
        if (Array.isArray(b) && b.length === 0) {
          return [];
        }
        return [_];
      });
      if (s > 0) {
        logForDebugging(`deserializeMessages: dropped non-string text block(s) from ${s} message(s) \u2014 interrupted-stream artifact`, {
          level: "warn"
        });
      }
      let a = new Set(INTERNAL_PERMISSION_MODES);
      for (let y of i) {
        if (y.type === "user" && y.permissionMode !== undefined && !a.vZc(y.permissionMode)) {
          y.permissionMode = undefined;
        }
      }
      let l = new Set();
      let c = Me.CLAUDE_CODE_RESUME_INTERRUPTED_TURN && !t?.size && !n;
      let u = Mbt(i, t, c ? {
        dropSiblingBlocks: true,
        outSupersededToolUseIds: l
      } : undefined);
      let d = kze(u);
      let p = xze(d);
      let m = t?.size || n ? {
        kind: "none"
      } : kym(p);
      let f = r !== undefined && m.kind !== "none" && p.findLast(y => y.type === "user" || y.type === "assistant")?.uuid === r;
      let h;
      if (f) {
        h = {
          kind: "none"
        };
      } else if (m.kind === "interrupted_turn") {
        let [y] = xS([In({
          content: getResumePrompt(),
          isMeta: true
        })]);
        p.push(y);
        h = {
          kind: "interrupted_prompt",
          message: y
        };
      } else {
        h = m;
      }
      let g = p.findLastIndex(y => y.type !== "system" && y.type !== "progress");
      if (!n && g !== -1 && p[g].type === "user") {
        p.splice(g + 1, 0, ST({
          content: "No response requested."
        }));
      }
      return {
        messages: p,
        turnInterruptionState: h,
        supersededToolUseIds: l
      };
    } catch (o) {
      throw Oe(o), o;
    }
  }
  function kym(e) {
    if (e.length === 0) {
      return {
        kind: "none"
      };
    }
    let t = e.findLastIndex(r => r.type !== "system" && r.type !== "progress" && !(r.type === "assistant" && r.isApiErrorMessage && r.message.stop_reason !== "refusal"));
    let n = t !== -1 ? e[t] : undefined;
    if (!n) {
      return {
        kind: "none"
      };
    }
    if (n.type === "assistant") {
      if (n.isApiErrorMessage) {
        logEvent("tengu_refusal_turn_classified_complete", {});
      }
      return {
        kind: "none"
      };
    }
    if (n.type === "user") {
      if (n.isMeta || n.isCompactSummary) {
        return {
          kind: "none"
        };
      }
      if (Shl(n)) {
        return {
          kind: "none"
        };
      }
      if (rLe(n)) {
        if (Thl(n, e, t)) {
          return {
            kind: "none"
          };
        }
        return {
          kind: "interrupted_turn"
        };
      }
      return {
        kind: "interrupted_prompt",
        message: n
      };
    }
    if (n.type === "attachment") {
      for (let r = t - 1; r >= 0; r--) {
        let o = e[r];
        if (o.type === "system" || o.type === "progress" || o.type === "attachment" || o.type === "assistant" && o.isApiErrorMessage && o.message.stop_reason !== "refusal") {
          continue;
        }
        if (o.type === "assistant" && o.isApiErrorMessage && o.message.stop_reason === "refusal") {
          logEvent("tengu_refusal_turn_classified_complete", {});
          return {
            kind: "none"
          };
        }
        if (o.type === "assistant") {
          return {
            kind: "none"
          };
        }
        if (o.type === "user" && o.isCompactSummary) {
          return {
            kind: "none"
          };
        }
        if (o.type === "user" && Shl(o)) {
          return {
            kind: "none"
          };
        }
        if (o.type === "user" && rLe(o) && Thl(o, e, r)) {
          return {
            kind: "none"
          };
        }
        break;
      }
      return {
        kind: "interrupted_turn"
      };
    }
    return {
      kind: "none"
    };
  }
  function Shl(e) {
    let t = e.message.content;
    let n = typeof t === "string" ? t : t.length === 1 && t[0].type === "text" ? t[0].text : undefined;
    return n === "[Request interrupted by user]" || n === "[Request interrupted by user for tool use]";
  }
  function Thl(e, t, n) {
    let r = e.message.content;
    if (!Array.isArray(r)) {
      return false;
    }
    let o = r[0];
    if (o?.type !== "tool_result") {
      return false;
    }
    let s = o.tool_use_id;
    for (let i = n - 1; i >= 0; i--) {
      let a = t[i];
      if (a.type !== "assistant") {
        continue;
      }
      for (let l of a.message.content) {
        if (l.type === "tool_use" && l.id === s) {
          return l.name === Eym || l.name === vym || l.name === wym || lfo().vZc(l.name) && !o.is_error;
        }
      }
    }
    return false;
  }
  function restoreSkillStateFromMessages(e) {
    for (let t of e) {
      if (t.type !== "attachment") {
        continue;
      }
      if (t.attachment.type === "invoked_skills") {
        for (let n of t.attachment.skills) {
          if (n.name && n.path && n.content) {
            addInvokedSkill(n.name, n.path, n.content, null);
          }
        }
      }
      if (t.attachment.type === "skill_listing") {
        if (t.attachment.names) {
          seedSentSkillNames(t.attachment.names);
        } else {
          suppressNextSkillListing();
        }
      }
    }
  }
  async function loadMessagesFromJsonlPath(e) {
    let {
      messages: t,
      leafUuids: n,
      endedSessions: r
    } = await loadTranscriptFile(e);
    let o = null;
    let s = 0;
    for (let l of t.values()) {
      if (l.isSidechain || !n.vZc(l.uuid)) {
        continue;
      }
      let c = new Date(l.timestamp).getTime();
      if (c > s) {
        s = c;
        o = l;
      }
    }
    if (!o) {
      return Tve({
        messages: [],
        sessionId: undefined
      }, false);
    }
    let i = buildConversationChain(t, o);
    let a = o.sessionId;
    return Tve({
      messages: removeExtraFields(i),
      sessionId: a
    }, a ? r.vZc(a) : false);
  }
  async function findLiveNonInteractiveSession(e) {
    let t = await Promise.resolve().then(() => (wze(), ZJn)).then(n => n.listAllLiveSessions()).catch(() => []);
    for (let n of t) {
      if (n.sessionId === e && n.kind && n.kind !== "interactive") {
        return {
          kind: n.kind
        };
      }
    }
    return null;
  }
  function dedupeSessionStartHookMessages(e, t) {
    if (t.length === 0) {
      return [];
    }
    let n = new Set();
    for (let s of e) {
      for (let i of Ehl(s)) {
        n.add(i);
      }
    }
    if (n.size === 0) {
      return [...t];
    }
    let r = false;
    let o = [];
    for (let s of t) {
      let i = Ehl(s);
      if (i.length === 0 || s.type !== "attachment") {
        o.push(s);
        continue;
      }
      let a = s.attachment;
      if (a.type === "hook_additional_context" && a.content.length > 1) {
        let l = a.content.filter(c => !n.vZc(jPo(c)));
        if (l.length === 0) {
          continue;
        }
        r = true;
        o.push(l.length === a.content.length ? s : {
          ...s,
          attachment: {
            ...a,
            content: l
          }
        });
        continue;
      }
      if (n.vZc(i[0])) {
        continue;
      }
      r = true;
      o.push(s);
    }
    if (!r) {
      return [];
    }
    return o;
  }
  function Ehl(e) {
    if (e.type !== "attachment") {
      return [];
    }
    let t = e.attachment;
    if (!("hookEvent" in t) || t.hookEvent !== "SessionStart") {
      return [];
    }
    if (t.type === "hook_additional_context") {
      return t.content.map(jPo);
    }
    if (t.type === "hook_success" && t.content !== "") {
      return [jPo(t.content)];
    }
    return [];
  }
  function jPo(e) {
    if (!e.startsWith("<persisted-output>")) {
      return e;
    }
    return e.replace(/(Full output saved to: ).*$/m, "$1<persisted>");
  }
  function dropRetractedMessages(e) {
    let t = new Set(e.flatMap(r => r.type === "system" && r.subtype === "model_refusal_fallback" && r.retractedMessageUuids !== undefined ? r.retractedMessageUuids.map(o => o.slice(0, 24)) : []));
    if (t.size === 0) {
      return e;
    }
    let n = e.filter(r => r.type === "system" || !t.vZc(r.uuid.slice(0, 24)));
    if (n.length !== e.length) {
      logEvent("tengu_resume_retracted_dropped", {
        dropped: e.length - n.length,
        chain_length: e.length
      });
    }
    return n;
  }
  async function loadConversationForResume(e, t, n) {
    try {
      let r = null;
      let o = null;
      let s;
      if (e === undefined) {
        let p = loadMessageLogs();
        let m = new Set();
        try {
          let {
            listAllLiveSessions: h
          } = await Promise.resolve().then(() => (wze(), ZJn));
          let g = await h();
          m = new Set(g.flatMap(y => y.kind && y.kind !== "interactive" && y.sessionId ? [y.sessionId] : []));
        } catch {}
        r = (await p).find(h => {
          if (h.sessionKind) {
            return false;
          }
          let g = getSessionIdFromLog(h);
          return !g || !m.vZc(g);
        }) ?? null;
      } else if (t && typeof e === "string") {
        r = await getLastSessionLog(e, t);
        s = r?.messages.at(-1)?.sessionId ?? r?.sessionId ?? e;
      } else if (typeof e === "string") {
        r = (await getLastSessionLog(e)) ?? (await Iym(e));
        s = e;
      } else {
        r = e;
      }
      if (!r && !o) {
        Et("session_resume", "not_found");
        return null;
      }
      if (r) {
        if (isLiteLog(r)) {
          r = await loadFullLog(r);
        }
        if (!s) {
          s = getSessionIdFromLog(r);
        }
        if (s) {
          await copyPlanForResume(r, s);
        }
        copyFileHistoryForResume(r, !n.forkSession && s ? s : undefined);
        o = r.messages;
        checkResumeConsistency(o);
      }
      o = dropRetractedMessages(o);
      restoreSkillStateFromMessages(o);
      let i = r?.fullPath ?? t;
      let a = i ? (await findDeferredToolMarkerInTranscript(i)) ?? undefined : undefined;
      let l = deserializeMessagesWithInterruptDetection(o, a ? new Set([a.toolUseID]) : undefined, n.replyOnResume, r?.rewindAnchorUuid);
      o = l.messages;
      let c = performance.now();
      let u = await MV("resume", {
        sessionId: s,
        sessionTitle: getCurrentSessionTitle(getSessionId()) ?? r?.customTitle
      });
      au("hooks_init_ms", performance.now() - c, c);
      let d = xpt();
      if (d) {
        cacheHookSessionTitle(d);
      }
      o.push(...dedupeSessionStartHookMessages(o, u));
      Pe("session_resume");
      return {
        messages: o,
        turnInterruptionState: l.turnInterruptionState,
        supersededToolUseIds: l.supersededToolUseIds,
        deferredToolUse: a,
        fileHistorySnapshots: r?.fileHistorySnapshots,
        attributionSnapshots: r?.attributionSnapshots,
        contentReplacements: r?.contentReplacements,
        contextCollapseCommits: r?.contextCollapseCommits,
        contextCollapseSnapshot: r?.contextCollapseSnapshot,
        sessionId: s,
        agentName: r?.agentName,
        agentColor: r?.agentColor,
        agentSetting: r?.agentSetting,
        customTitle: r?.customTitle,
        ...Tve({}, nLe(r)),
        aiTitle: r?.aiTitle,
        tag: r?.tag,
        relocatedCwd: r?.relocatedCwd,
        mode: r?.mode,
        permissionMode: r?.permissionMode,
        isolationLatch: r?.isolationLatch,
        worktreeSession: r?.worktreeSession,
        prNumber: r?.prNumber,
        prUrl: r?.prUrl,
        prRepository: r?.prRepository,
        bridgeSessionId: r?.bridgeSessionId,
        bridgeLastSeq: r?.bridgeLastSeq,
        bridgeDialogKinds: r?.bridgeDialogKinds,
        fullPath: r?.fullPath
      };
    } catch (r) {
      throw Ae("session_resume", "load_failed"), Oe($o(sr(r), "loadConversationForResume failed")), r;
    }
  }
  async function Iym(e) {
    for (let t of await vve(getOriginalCwd())) {
      for (let n of await jA(t)) {
        let r = await getLastSessionLog(e, Ibt.join(n, `${e}.jsonl`));
        if (r) {
          logEvent("tengu_resume_worktree_fallback", {});
          return r;
        }
      }
    }
    return null;
  }
  var Ibt;
  var Eym;
  var vym;
  var wym;
  var Cym;
  var Pme = __lazy(() => {
    Eve();
    Ot();
    vo();
    at();
    ln();
    D_();
    rR();
    je();
    pr();
    Jq();
    TKt();
    dt();
    Rn();
    ro();
    xx();
    DDe();
    fa();
    ZS();
    R3();
    zI();
    Ibt = require("path");
    Eym = (k2(), __toCommonJS(kIe)).BRIEF_TOOL_NAME;
    vym = (k2(), __toCommonJS(kIe)).LEGACY_BRIEF_TOOL_NAME;
    wym = __toCommonJS(VOn).SEND_USER_FILE_TOOL_NAME;
    Cym = new Set(["compaction_reminder", "companion_intro", "echo_activities", "pen_mode_enter", "pen_mode_exit", "verify_plan_reminder"]);
  });
  function Chl(e, t) {
    let n = new Set();
    for (let r of e) {
      if (!t.vZc(r)) {
        n.add(r);
      }
    }
    return n;
  }
  function Rhl(e, t) {
    for (let n of e) {
      if (!t.vZc(n)) {
        return false;
      }
    }
    return true;
  }
  function xhl(e) {
    return e.githubPr == null;
  }
  function KPo(e, t) {
    if (t?.type === "not_found_error" && t.resource_type === "session_grouping") {
      return `Project not found: ${e}. Check the id \u2014 a Project you don't have access to looks the same as one that doesn't exist.`;
    }
    switch (t?.reason) {
      case "public_grouping_hosted_only":
        return `${e} is a public Project, and public Projects run on Anthropic-hosted infrastructure only. Pick an Anthropic-managed cloud environment, or use a private Project.`;
      case "feature_disabled":
        return "Projects are not available for your organization.";
      default:
        return;
    }
  }
  var nXn = () => {};
  function Ohl() {
    return process.env.ANTHROPIC_BASE_URL || process.env.CLAUDE_CODE_API_BASE_URL || "https://api.anthropic.com";
  }
  function Dhl() {
    if (getAPIProvider() !== "firstParty") {
      throw Error("Files API is unavailable on third-party providers (data-residency)");
    }
    if (l8("hipaa")) {
      throw Error("Files API is unavailable for HIPAA-regulated organizations");
    }
  }
  function YPo(e) {
    logForDebugging(`[files-api] ${e}`, {
      level: "error"
    });
  }
  function xve(e) {
    logForDebugging(`[files-api] ${e}`);
  }
  async function Mhl(e, t) {
    let n = "";
    for (let r = 1; r <= 3; r++) {
      let o = await t(r);
      if (o.done) {
        return o.value;
      }
      if (n = o.error || `${e} failed`, xve(`${e} attempt ${r}/${3} failed: ${n}`), r < 3) {
        let s = 500 * Math.pow(2, r - 1);
        xve(`Retrying ${e} in ${s}ms...`);
        await sleep(s);
      }
    }
    throw Error(`${n} after ${3} attempts`);
  }
  async function Oym(e, t) {
    Dhl();
    let r = `${t.baseUrl || Ohl()}/v1/files/${e}/content`;
    let o = {
      Authorization: `Bearer ${t.oauthToken}`,
      "anthropic-version": "2023-06-01",
      "anthropic-beta": Ihl
    };
    xve(`Downloading file ${e} from ${r}`);
    return Mhl(`Download file ${e}`, async () => {
      try {
        let s = await NP.get(r, {
          headers: o,
          responseType: "arraybuffer",
          timeout: 60000,
          validateStatus: i => i < 500
        });
        if (s.status === 200) {
          xve(`Downloaded file ${e} (${s.data.length} bytes)`);
          return {
            done: true,
            value: Buffer.from(s.data)
          };
        }
        if (s.status === 404) {
          throw Error(`File not found: ${e}`);
        }
        if (s.status === 401) {
          throw Error("Authentication failed: invalid or missing API key");
        }
        if (s.status === 403) {
          throw Error(`Access denied to file: ${e}`);
        }
        return {
          done: false,
          error: `status ${s.status}`
        };
      } catch (s) {
        if (!NP.isAxiosError(s)) {
          throw s;
        }
        return {
          done: false,
          error: s.message
        };
      }
    });
  }
  function Dym(e, t, n) {
    let r = V9.normalize(n);
    if (r.startsWith("..")) {
      YPo(`Invalid file path: ${n}. Path must not traverse above workspace`);
      return null;
    }
    let o = V9.join(e, t, "uploads");
    let i = [V9.join(e, t, "uploads") + V9.sep, V9.sep + "uploads" + V9.sep].find(l => r.startsWith(l));
    let a = i ? r.slice(i.length) : r;
    return V9.join(o, a);
  }
  async function Mym(e, t) {
    let {
      fileId: n,
      relativePath: r
    } = e;
    let o = Dym(Nt(), t.sessionId, r);
    if (!o) {
      return {
        fileId: n,
        path: "",
        success: false,
        error: `Invalid file path: ${r}`
      };
    }
    try {
      let s = await Oym(n, t);
      let i = V9.dirname(o);
      await Nbt.mkdir(i, {
        recursive: true
      });
      await Nbt.writeFile(o, s);
      xve(`Saved file ${n} to ${o} (${s.length} bytes)`);
      return {
        fileId: n,
        path: o,
        success: true,
        bytesWritten: s.length
      };
    } catch (s) {
      YPo(`Failed to download file ${n}: ${he(s)}`);
      return {
        fileId: n,
        path: o,
        success: false,
        error: he(s)
      };
    }
  }
  async function Lym(e, t, n) {
    let r = Array(e.length);
    let o = 0;
    async function s() {
      while (o < e.length) {
        let l = o++;
        let c = e[l];
        if (c !== undefined) {
          r[l] = await t(c, l);
        }
      }
    }
    let i = [];
    let a = Math.min(n, e.length);
    for (let l = 0; l < a; l++) {
      i.push(s());
    }
    await Promise.all(i);
    return r;
  }
  async function Nhl(e, t, n = 5) {
    if (e.length === 0) {
      return [];
    }
    xve(`Downloading ${e.length} file(s) for session ${t.sessionId}`);
    let r = Date.now();
    let o = await Lym(e, a => Mym(a, t), n);
    let s = Date.now() - r;
    let i = Bn(o, a => a.success);
    if (xve(`Downloaded ${i}/${e.length} file(s) in ${s}ms`), i === e.length) {
      Pe("api_files_download");
    } else if (i > 0) {
      Et("api_files_download", "partial_failed");
    } else {
      Ae("api_files_download", "all_failed");
    }
    return o;
  }
  async function Lhl(e, t, n, r) {
    Dhl();
    let s = `${n.baseUrl || Ohl()}/v1/files`;
    let i = {
      Authorization: `Bearer ${n.oauthToken}`,
      "anthropic-version": "2023-06-01",
      "anthropic-beta": Ihl
    };
    xve(`Uploading file ${e} as ${t}`);
    let a;
    try {
      a = await Nbt.readFile(e);
    } catch (m) {
      logEvent("tengu_file_upload_failed", {
        error_type: "file_read"
      });
      return {
        path: t,
        error: he(m),
        success: false
      };
    }
    let l = a.length;
    if (l > 524288000) {
      logEvent("tengu_file_upload_failed", {
        error_type: "file_too_large"
      });
      return {
        path: t,
        error: `File exceeds maximum size of ${524288000} bytes (actual: ${l})`,
        success: false
      };
    }
    let c = `----FormBoundary${Ahl.randomUUID()}`;
    let u = V9.basename(t);
    let d = [];
    d.push(Buffer.from(`--${c}\r
Content-Disposition: form-data; name="file"; filename="${u}"\r
Content-Type: application/octet-stream\r
\r
`));
    d.push(a);
    d.push(Buffer.from(`\r
`));
    d.push(Buffer.from(`--${c}\r
Content-Disposition: form-data; name="purpose"\r
\r
user_data\r
`));
    d.push(Buffer.from(`--${c}--\r
`));
    let p = Buffer.concat(d);
    try {
      return await Mhl(`Upload file ${t}`, async () => {
        try {
          let m = await NP.post(s, p, {
            headers: {
              ...i,
              "Content-Type": `multipart/form-data; boundary=${c}`,
              "Content-Length": p.length.toString()
            },
            timeout: 120000,
            signal: r?.signal,
            validateStatus: f => f < 500
          });
          if (m.status === 200 || m.status === 201) {
            let f = m.data?.id;
            if (!f) {
              return {
                done: false,
                error: "Upload succeeded but no file ID returned"
              };
            }
            xve(`Uploaded file ${e} -> ${f} (${l} bytes)`);
            return {
              done: true,
              value: {
                path: t,
                fileId: f,
                size: l,
                success: true
              }
            };
          }
          if (m.status === 401) {
            throw logEvent("tengu_file_upload_failed", {
              error_type: "auth"
            }), new Aze("Authentication failed: invalid or missing API key");
          }
          if (m.status === 403) {
            throw logEvent("tengu_file_upload_failed", {
              error_type: "forbidden"
            }), new Aze("Access denied for upload");
          }
          if (m.status === 413) {
            throw logEvent("tengu_file_upload_failed", {
              error_type: "size"
            }), new Aze("File too large for upload");
          }
          return {
            done: false,
            error: `status ${m.status}`
          };
        } catch (m) {
          if (m instanceof Aze) {
            throw m;
          }
          if (NP.isCancel(m)) {
            throw new Aze("Upload canceled");
          }
          if (NP.isAxiosError(m)) {
            return {
              done: false,
              error: m.message
            };
          }
          throw m;
        }
      });
    } catch (m) {
      if (m instanceof Aze) {
        return {
          path: t,
          error: m.message,
          success: false
        };
      }
      logEvent("tengu_file_upload_failed", {
        error_type: "network"
      });
      return {
        path: t,
        error: he(m),
        success: false
      };
    }
  }
  function Fhl(e) {
    let t = [];
    let n = e.flatMap(r => r.split(" ").filter(Boolean));
    for (let r of n) {
      let o = r.indexOf(":");
      if (o === -1) {
        continue;
      }
      let s = r.substring(0, o);
      let i = r.substring(o + 1);
      if (!s || !i) {
        YPo(`Invalid file spec: ${r}. Both file_id and path are required`);
        continue;
      }
      t.push({
        fileId: s,
        relativePath: i
      });
    }
    return t;
  }
  var Ahl;
  var Nbt;
  var V9;
  var Ihl;
  var Aze;
  var oXn = __lazy(() => {
    Dp();
    KN();
    vo();
    je();
    dt();
    Ds();
    ln();
    Ot();
    $Y();
    Ahl = require("crypto");
    Nbt = __toESM(require("fs/promises"));
    V9 = __toESM(require("path"));
    Ihl = `${J4r.header},${c0e.header}`;
    Aze = class Aze extends Error {
      constructor(e) {
        super(e);
        this.name = "UploadNonRetriableError";
      }
    };
  });
  function Uhl() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_ccr_bundle_max_bytes", null) ?? 104857600;
  }
  async function Bhl(e, t) {
    let n = await execFileNoThrowWithCwd(gitExe(), ["count-objects", "-v"], {
      cwd: e,
      abortSignal: t
    });
    if (n.code !== 0) {
      return {
        sizeBytes: null,
        inPackCount: null
      };
    }
    let r = n.stdout.match(/^size-pack:\s*(\d+)/m);
    let o = n.stdout.match(/^in-pack:\s*(\d+)/m);
    return {
      sizeBytes: r ? Number(r[1]) * 1024 : null,
      inPackCount: o ? Number(o[1]) : null
    };
  }
  async function $hl(e) {
    let t = findGitRoot(e?.cwd ?? Nt());
    if (!t) {
      return {
        tooLarge: false,
        sizeBytes: null,
        inPackCount: null
      };
    }
    let {
      sizeBytes: n,
      inPackCount: r
    } = await Bhl(t, e?.signal);
    if (n === null) {
      return {
        tooLarge: false,
        sizeBytes: null,
        inPackCount: r
      };
    }
    let o = Uhl();
    return {
      tooLarge: n > 3 * o && (n > 100 * o || r !== null && r > 5000000),
      sizeBytes: n,
      inPackCount: r
    };
  }
  async function Uym(e, t, n, r, o, s) {
    let i = r ? ["refs/seed/stash"] : [];
    let a = b => execFileNoThrowWithCwd(gitExe(), ["bundle", "create", t, b, ...i], {
      cwd: e,
      abortSignal: o
    });
    let {
      sizeBytes: l,
      inPackCount: c
    } = await Bhl(e, o);
    let u = l !== null && l > n;
    let d = l !== null && l > 3 * n;
    let p = d && (l !== null && l > 100 * n || c !== null && c > 5000000);
    if (u) {
      logForDebugging(`[gitBundle] size-pack ${(l / 1024 / 1024).toFixed(0)}MB > ${(n / 1024 / 1024).toFixed(0)}MB cap; skipping --all${d ? " and HEAD" : ""}${p ? " and squashed" : ""}`);
    }
    if (!u) {
      let b = await a("--all");
      if (b.code !== 0) {
        return {
          ok: false,
          error: `git bundle create --all failed (${b.code}): ${b.stderr.slice(0, 200)}`,
          failReason: "git_error"
        };
      }
      let {
        size: S
      } = await Lbt.stat(t);
      if (S <= n) {
        return {
          ok: true,
          size: S,
          scope: "all"
        };
      }
      logForDebugging(`[gitBundle] --all bundle is ${(S / 1024 / 1024).toFixed(1)}MB (> ${(n / 1024 / 1024).toFixed(0)}MB), retrying HEAD-only`);
    }
    if (!d) {
      let b = await a("HEAD");
      if (b.code !== 0) {
        return {
          ok: false,
          error: `git bundle create HEAD failed (${b.code}): ${b.stderr.slice(0, 200)}`,
          failReason: "git_error"
        };
      }
      let {
        size: S
      } = await Lbt.stat(t);
      if (S <= n) {
        return {
          ok: true,
          size: S,
          scope: "head"
        };
      }
      logForDebugging(`[gitBundle] HEAD bundle is ${(S / 1024 / 1024).toFixed(1)}MB, retrying squashed-root`);
    }
    if (p) {
      return {
        ok: false,
        error: "Repo is too large to bundle. Please setup GitHub on https://claude.ai/code",
        failReason: "too_large"
      };
    }
    let m = r ? "refs/seed/stash^{tree}" : "HEAD^{tree}";
    let f = [];
    if (s) {
      let [b, S] = await Promise.all([m, `${s}^{tree}`].map(C => execFileNoThrowWithCwd(gitExe(), ["rev-parse", C], {
        cwd: e,
        abortSignal: o
      })));
      if (b?.code === 0 && b.stdout.trim() === S?.stdout.trim()) {
        return {
          ok: false,
          error: "It doesn't look like you have any new commits or changes to review. Stage or commit them first?",
          failReason: "no_changes"
        };
      }
      let E = await execFileNoThrowWithCwd(gitExe(), ["commit-tree", `${s}^{tree}`, "-m", "seed-base"], {
        cwd: e,
        abortSignal: o
      });
      if (E.code === 0) {
        f = ["-p", E.stdout.trim()];
      } else {
        logForDebugging(`[gitBundle] baseRef commit-tree failed (${E.code}), squashing without parent: ${E.stderr.slice(0, 200)}`);
      }
    }
    let h = await execFileNoThrowWithCwd(gitExe(), ["commit-tree", m, ...f, "-m", "seed"], {
      cwd: e,
      abortSignal: o
    });
    if (h.code !== 0) {
      return {
        ok: false,
        error: `git commit-tree failed (${h.code}): ${h.stderr.slice(0, 200)}`,
        failReason: "git_error"
      };
    }
    let g = h.stdout.trim();
    await execFileNoThrowWithCwd(gitExe(), ["update-ref", "refs/seed/root", g], {
      cwd: e
    });
    let y = await execFileNoThrowWithCwd(gitExe(), ["bundle", "create", t, "refs/seed/root"], {
      cwd: e,
      abortSignal: o
    });
    if (y.code !== 0) {
      return {
        ok: false,
        error: `git bundle create refs/seed/root failed (${y.code}): ${y.stderr.slice(0, 200)}`,
        failReason: "git_error"
      };
    }
    let {
      size: _
    } = await Lbt.stat(t);
    if (_ <= n) {
      return {
        ok: true,
        size: _,
        scope: "squashed"
      };
    }
    return {
      ok: false,
      error: "Repo is too large to bundle. Please setup GitHub on https://claude.ai/code",
      failReason: "too_large"
    };
  }
  async function JPo(e, t) {
    let n = t?.cwd ?? Nt();
    let r = findGitRoot(n);
    if (!r) {
      Ae("teleport_git_bundle_upload", "empty_repo");
      return {
        success: false,
        error: "Not in a git repository"
      };
    }
    for (let c of ["refs/seed/stash", "refs/seed/root"]) {
      await execFileNoThrowWithCwd(gitExe(), ["update-ref", "-d", c], {
        cwd: r
      });
    }
    let o = await execFileNoThrowWithCwd(gitExe(), ["for-each-ref", "--count=1", "refs/"], {
      cwd: r
    });
    if (o.code === 0 && o.stdout.trim() === "") {
      logEvent("tengu_ccr_bundle_upload", {
        outcome: "empty_repo"
      });
      Ae("teleport_git_bundle_upload", "empty_repo");
      return {
        success: false,
        error: "Repository has no commits yet",
        failReason: "empty_repo"
      };
    }
    let s = await execFileNoThrowWithCwd(gitExe(), ["stash", "create"], {
      cwd: r,
      abortSignal: t?.signal
    });
    let i = s.code === 0 ? s.stdout.trim() : "";
    let a = i !== "";
    if (s.code !== 0 && s.stderr.trim() === "") {
      logForDebugging(`[gitBundle] git stash create exited ${s.code} with no output \u2014 treating as no uncommitted changes`);
    } else if (s.code !== 0) {
      if (logForDebugging(`[gitBundle] git stash create failed (${s.code}): ${s.stderr.slice(0, 200)}`), (await execFileNoThrowWithCwd(gitExe(), ["rev-parse", "--verify", "HEAD"], {
        cwd: r
      })).code === 0) {
        logEvent("tengu_ccr_bundle_upload", {
          outcome: "stash_failed"
        });
        Ae("teleport_git_bundle_upload", "stash_failed");
        return {
          success: false,
          error: `Could not capture uncommitted changes (git stash create: ${Ad(s.stderr.trim())}). Run \`git add .\` or commit, then retry.`,
          failReason: "stash_failed"
        };
      }
    } else if (a) {
      logForDebugging(`[gitBundle] Captured WIP as stash ${i}`);
      await execFileNoThrowWithCwd(gitExe(), ["update-ref", "refs/seed/stash", i], {
        cwd: r
      });
    }
    let l = olt("ccr-seed", ".bundle");
    try {
      let c = Uhl();
      let u = await Uym(r, l, c, a, t?.signal, t?.baseRef);
      if (!u.ok) {
        logForDebugging(`[gitBundle] ${u.error}`);
        logEvent("tengu_ccr_bundle_upload", {
          outcome: u.failReason,
          max_bytes: c
        });
        Ae("teleport_git_bundle_upload", u.failReason);
        return {
          success: false,
          error: u.error,
          failReason: u.failReason
        };
      }
      let d = await Lhl(l, "_source_seed.bundle", e, {
        signal: t?.signal
      });
      if (!d.success) {
        logEvent("tengu_ccr_bundle_upload", {
          outcome: "failed"
        });
        Ae("teleport_git_bundle_upload", "upload_failed");
        return {
          success: false,
          error: d.error
        };
      }
      if (logForDebugging(`[gitBundle] Uploaded ${d.size} bytes as file_id ${d.fileId}`), logEvent("tengu_ccr_bundle_upload", {
        outcome: "success",
        size_bytes: d.size,
        scope: u.scope,
        has_wip: a
      }), u.scope === "head") {
        Et("teleport_git_bundle_upload", "fallback_head");
      } else if (u.scope === "squashed") {
        Et("teleport_git_bundle_upload", "fallback_squashed");
      } else {
        Pe("teleport_git_bundle_upload");
      }
      return {
        success: true,
        fileId: d.fileId,
        bundleSizeBytes: d.size,
        scope: u.scope,
        hasWip: a
      };
    } finally {
      try {
        await Lbt.unlink(l);
      } catch {
        logForDebugging(`[gitBundle] Could not delete ${l} (non-fatal)`);
      }
      for (let c of ["refs/seed/stash", "refs/seed/root"]) {
        await execFileNoThrowWithCwd(gitExe(), ["update-ref", "-d", c], {
          cwd: r
        });
      }
    }
  }
  var Lbt;
  var XPo = __lazy(() => {
    Ot();
    ln();
    $n();
    oXn();
    vo();
    je();
    ji();
    na();
    Zn();
    BC();
    Lbt = require("fs/promises");
  });