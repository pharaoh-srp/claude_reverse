  __export(y5e, {
    writeRemoteAgentMetadata: () => writeRemoteAgentMetadata,
    writeAgentMetadata: () => writeAgentMetadata,
    worktreeStateSignal: () => worktreeStateSignal,
    updateCCRTipFromAckedBatch: () => updateCCRTipFromAckedBatch,
    transcriptCursorEnd: () => transcriptCursorEnd,
    touchSessionTranscript: () => touchSessionTranscript,
    subscribeSessionTitleChanged: () => subscribeSessionTitleChanged,
    subscribeSessionAgentNameChanged: () => subscribeSessionAgentNameChanged,
    snapshotSessionMetadata: () => snapshotSessionMetadata,
    setSessionFileForTesting: () => setSessionFileForTesting,
    setRemoteIngressUrlForTesting: () => setRemoteIngressUrlForTesting,
    setInternalEventWriter: () => setInternalEventWriter,
    setInternalEventReader: () => setInternalEventReader,
    sessionIdExists: () => sessionIdExists,
    searchSessionsByCustomTitle: () => searchSessionsByCustomTitle,
    saveWorktreeState: () => saveWorktreeState,
    savePermissionMode: () => savePermissionMode,
    saveMode: () => saveMode,
    saveIsolationLatch: () => saveIsolationLatch,
    saveCustomTitle: () => saveCustomTitle,
    saveBridgeSession: () => saveBridgeSession,
    saveAiGeneratedTitle: () => saveAiGeneratedTitle,
    saveAgentSetting: () => saveAgentSetting,
    saveAgentName: () => saveAgentName,
    saveAgentColor: () => saveAgentColor,
    restoreSessionMetadata: () => restoreSessionMetadata,
    resetSessionFilePointer: () => resetSessionFilePointer,
    resetProjectForTesting: () => resetProjectForTesting,
    resetProjectFlushStateForTesting: () => resetProjectFlushStateForTesting,
    removeTranscriptMessageIfPersisted: () => removeTranscriptMessageIfPersisted,
    removeTranscriptMessage: () => removeTranscriptMessage,
    removeExtraFields: () => removeExtraFields,
    relocateSessionTranscript: () => relocateSessionTranscript,
    recordTranscript: () => recordTranscript,
    recordSidechainTranscript: () => recordSidechainTranscript,
    recordSessionAlias: () => recordSessionAlias,
    recordQueueOperation: () => recordQueueOperation,
    recordForkContextRef: () => recordForkContextRef,
    recordFileHistorySnapshot: () => recordFileHistorySnapshot,
    recordContextCollapseSnapshot: () => recordContextCollapseSnapshot,
    recordContextCollapseReset: () => recordContextCollapseReset,
    recordContextCollapseCommit: () => recordContextCollapseCommit,
    recordContentReplacement: () => recordContentReplacement,
    recordAttributionSnapshot: () => recordAttributionSnapshot,
    readRemoteAgentMetadata: () => readRemoteAgentMetadata,
    readCCRTip: () => readCCRTip,
    readAgentMetadata: () => readAgentMetadata,
    reAppendSessionMetadataAtExit: () => reAppendSessionMetadataAtExit,
    reAppendSessionMetadataAsyncForTesting: () => reAppendSessionMetadataAsyncForTesting,
    reAppendSessionMetadata: () => reAppendSessionMetadata,
    persistLeafCheckpoint: () => persistLeafCheckpoint,
    normalizeSessionTitle: () => normalizeSessionTitle,
    mirrorLeafCheckpointToRemote: () => mirrorLeafCheckpointToRemote,
    markSessionEndedByModel: () => markSessionEndedByModel,
    loadTranscriptFromFile: () => loadTranscriptFromFile,
    loadTranscriptFile: () => loadTranscriptFile,
    loadSubagentTranscripts: () => loadSubagentTranscripts,
    loadSameRepoMessageLogsProgressive: () => loadSameRepoMessageLogsProgressive,
    loadSameRepoMessageLogs: () => loadSameRepoMessageLogs,
    loadMessageLogs: () => loadMessageLogs,
    loadFullLog: () => loadFullLog,
    loadAllSubagentTranscriptsFromDisk: () => loadAllSubagentTranscriptsFromDisk,
    loadAllProjectsMessageLogsProgressive: () => loadAllProjectsMessageLogsProgressive,
    loadAllProjectsMessageLogs: () => loadAllProjectsMessageLogs,
    loadAllLogsFromSessionFile: () => loadAllLogsFromSessionFile,
    listRemoteAgentMetadata: () => listRemoteAgentMetadata,
    linkSessionToPR: () => linkSessionToPR,
    isTranscriptPersistenceDisabled: () => isTranscriptPersistenceDisabled,
    isTranscriptMessage: () => isTranscriptMessage,
    isTranscriptFileResumeArg: () => isTranscriptFileResumeArg,
    isSyncedTranscriptEntry: () => isSyncedTranscriptEntry,
    isLoggableMessage: () => isLoggableMessage,
    isLiteLog: () => isLiteLog,
    isEphemeralToolProgress: () => isEphemeralToolProgress,
    isCustomTitleEnabled: () => isCustomTitleEnabled,
    isChainParticipant: () => isChainParticipant,
    hydrateRemoteSession: () => hydrateRemoteSession,
    hydrateFromCCRv2InternalEvents: () => hydrateFromCCRv2InternalEvents,
    getValidatedCCRTip: () => getValidatedCCRTip,
    getUserType: () => getUserType,
    getTranscriptPathForSession: () => getTranscriptPathForSession,
    getSessionIdFromLog: () => getSessionIdFromLog,
    getSessionFilesWithMtime: () => getSessionFilesWithMtime,
    getSessionFilesLite: () => getSessionFilesLite,
    getNodeEnv: () => getNodeEnv,
    getMaterializedSessionFile: () => getMaterializedSessionFile,
    getLogByIndex: () => getLogByIndex,
    getLastSessionLog: () => getLastSessionLog,
    getFirstMeaningfulUserMessageTextContent: () => getFirstMeaningfulUserMessageTextContent,
    getCurrentSessionTitle: () => getCurrentSessionTitle,
    getCurrentSessionIsolationLatch: () => getCurrentSessionIsolationLatch,
    getCurrentSessionFile: () => getCurrentSessionFile,
    getCurrentSessionBridge: () => getCurrentSessionBridge,
    getCurrentSessionAiTitle: () => getCurrentSessionAiTitle,
    getCurrentSessionAgentName: () => getCurrentSessionAgentName,
    getCurrentSessionAgentColor: () => getCurrentSessionAgentColor,
    getAgentTranscript: () => getAgentTranscript,
    flushSessionStorageAtExit: () => flushSessionStorageAtExit,
    flushSessionStorage: () => flushSessionStorage,
    flushAppendEntryQueues: () => flushAppendEntryQueues,
    fireSessionMirror: () => fireSessionMirror,
    findUnresolvedToolUse: () => findUnresolvedToolUse,
    findDeferredToolMarkerInTranscript: () => findDeferredToolMarkerInTranscript,
    fetchLogs: () => fetchLogs,
    extractLatestIntersectingSyncedUuid: () => extractLatestIntersectingSyncedUuid,
    extractLastSyncedEventUuid: () => extractLastSyncedEventUuid,
    extractAgentIdsFromMessages: () => extractAgentIdsFromMessages,
    enrichLogs: () => enrichLogs,
    doesMessageExistInSession: () => doesMessageExistInSession,
    deleteRemoteAgentMetadata: () => deleteRemoteAgentMetadata,
    collectTailUuids: () => collectTailUuids,
    collectReplIds: () => collectReplIds,
    clearSessionMetadata: () => clearSessionMetadata,
    clearSessionMessagesCache: () => clearSessionMessagesCache,
    clearInternalEventWriter: () => clearInternalEventWriter,
    clearBridgeSessionCache: () => clearBridgeSessionCache,
    clearBridgeSession: () => clearBridgeSession,
    cleanMessagesForLogging: () => cleanMessagesForLogging,
    checkResumeConsistency: () => checkResumeConsistency,
    cacheSessionTitle: () => cacheSessionTitle,
    cacheHookSessionTitle: () => cacheHookSessionTitle,
    cacheAiTitle: () => cacheAiTitle,
    cacheAgentName: () => cacheAgentName,
    buildConversationChain: () => buildConversationChain,
    applyEndedByModelOnResume: () => applyEndedByModelOnResume,
    appendEntryToFileAsync: () => appendEntryToFileAsync,
    adoptResumedSessionFile: () => adoptResumedSessionFile,
    addSessionMirror: () => addSessionMirror,
    TranscriptFileFormatError: () => TranscriptFileFormatError,
    MAX_TRANSCRIPT_READ_BYTES: () => 52428800,
    LAST_PROMPT_PREFIX_SCAN_BYTES: () => 64,
    INDEX_LAST_PROMPT_SCAN_BYTES: () => 1024,
    INDEX_HEAD_SCAN_BYTES: () => 256,
    INDEX_BOUNDARY_SCAN_BYTES: () => 4096,
    ENTRY_APPEND_POLICY: () => ENTRY_APPEND_POLICY
  });
  function isTranscriptMessage(e) {
    return e.type === "user" || e.type === "assistant" || e.type === "attachment" || e.type === "system";
  }
  function isSyncedTranscriptEntry(e) {
    return typeof e === "object" && e !== null && "type" in e && "uuid" in e && typeof e.uuid === "string" && isTranscriptMessage(e);
  }
  function isChainParticipant(e) {
    return e.type !== "progress";
  }
  function transcriptCursorEnd(e, t, n) {
    if (!n) {
      return e.length;
    }
    for (let r = t; r < e.length; r++) {
      let o = e[r];
      if (o.type === "assistant" && o.message.stop_reason === null) {
        return r;
      }
    }
    return e.length;
  }
  function Adf(e) {
    return typeof e === "object" && e !== null && "type" in e && e.type === "progress" && "uuid" in e && typeof e.uuid === "string";
  }
  function isEphemeralToolProgress(e) {
    return typeof e === "string" && Idf.vZc(e);
  }
  function getMaterializedSessionFile() {
    return yBe?.sessionFile ?? null;
  }
  function getTranscriptPathForSession(e) {
    if (e === getSessionId()) {
      return getMaterializedSessionFile() ?? wh();
    }
    let t = ty(getOriginalCwd());
    return Og.join(t, `${e}.jsonl`);
  }
  function amc(e) {
    return Ew(e).replace(/\.jsonl$/, ".meta.json");
  }
  async function writeAgentMetadata(e, t) {
    let n = amc(e);
    await Al.mkdir(Og.dirname(n), {
      recursive: true
    });
    await Al.writeFile(n, De(t));
    let r = n.replace(/\.meta\.json$/, ".jsonl");
    eu().fireMirror(r, [{
      type: "agent_metadata",
      agentType: t.agentType,
      ...(t.isFork !== undefined && {
        isFork: t.isFork
      }),
      ...(t.worktreePath && {
        worktreePath: t.worktreePath
      }),
      ...(t.worktreeBranch && {
        worktreeBranch: t.worktreeBranch
      }),
      ...(t.cwd && {
        cwd: t.cwd
      }),
      ...(t.spawnMode && {
        spawnMode: t.spawnMode
      }),
      ...(t.description && {
        description: t.description
      }),
      ...(t.name && {
        name: t.name
      }),
      ...(t.toolUseId && {
        toolUseId: t.toolUseId
      }),
      ...(t.stoppedByUser && {
        stoppedByUser: true
      }),
      ...(t.spawnDepth !== undefined && {
        spawnDepth: t.spawnDepth
      }),
      ...(t.taskKind && {
        taskKind: t.taskKind
      }),
      ...(t.teamName && {
        teamName: t.teamName
      }),
      ...(t.color && {
        color: t.color
      }),
      ...(t.planModeRequired !== undefined && {
        planModeRequired: t.planModeRequired
      }),
      ...(t.customAgentType && {
        customAgentType: t.customAgentType
      }),
      ...(t.model && {
        model: t.model
      }),
      ...(t.permissionMode && {
        permissionMode: t.permissionMode
      })
    }]);
  }
  async function readAgentMetadata(e) {
    let t = amc(e);
    try {
      let n = await Al.readFile(t, "utf-8");
      return qt(n);
    } catch (n) {
      if (Io(n)) {
        return null;
      }
      throw n;
    }
  }
  function lmc() {
    let e = getSessionProjectDir() ?? ty(getOriginalCwd());
    return Og.join(e, getSessionId(), "remote-agents");
  }
  function GVo(e) {
    return Og.join(lmc(), `remote-agent-${e}.meta.json`);
  }
  async function writeRemoteAgentMetadata(e, t) {
    let n = GVo(e);
    await Al.mkdir(Og.dirname(n), {
      recursive: true
    });
    await Al.writeFile(n, De(t));
  }
  async function readRemoteAgentMetadata(e) {
    let t = GVo(e);
    try {
      let n = await Al.readFile(t, "utf-8");
      return qt(n);
    } catch (n) {
      if (Io(n)) {
        return null;
      }
      throw n;
    }
  }
  async function deleteRemoteAgentMetadata(e) {
    let t = GVo(e);
    try {
      await Al.unlink(t);
    } catch (n) {
      if (Io(n)) {
        return;
      }
      throw n;
    }
  }
  async function listRemoteAgentMetadata() {
    let e = lmc();
    let t;
    try {
      t = await Al.readdir(e, {
        withFileTypes: true
      });
    } catch (r) {
      if (Io(r)) {
        return [];
      }
      throw r;
    }
    let n = [];
    for (let r of t) {
      if (!r.isFile() || !r.name.endsWith(".meta.json")) {
        continue;
      }
      try {
        let o = await Al.readFile(Og.join(e, r.name), "utf-8");
        n.push(qt(o));
      } catch (o) {
        logForDebugging(`listRemoteAgentMetadata: skipping ${r.name}: ${String(o)}`);
      }
    }
    return n;
  }
  function sessionIdExists(e) {
    let t = getSessionProjectDir() ?? ty(getOriginalCwd());
    let n = Og.join(t, `${e}.jsonl`);
    let r = zt();
    try {
      r.statSync(n);
      return true;
    } catch {
      return false;
    }
  }
  function getNodeEnv() {
    return "production";
  }
  function isTranscriptPersistenceDisabled() {
    let e = st(process.env.TEST_ENABLE_SESSION_PERSISTENCE);
    return getNodeEnv() === "test" && !e || isSessionPersistenceDisabled() || st(process.env.CLAUDE_CODE_SKIP_PROMPT_HISTORY) || isNestedInteractiveClaudeSession();
  }
  function getUserType() {
    return "external";
  }
  function umc() {
    return process.env.CLAUDE_CODE_ENTRYPOINT;
  }
  function isCustomTitleEnabled() {
    return true;
  }
  async function recordSessionAlias(e) {
    if (isTranscriptPersistenceDisabled()) {
      return;
    }
    let t = e;
    try {
      t = await Al.realpath(e);
    } catch (s) {
      if (!fn(s)) {
        logForDebugging(`recordSessionAlias: realpath failed for ${e}: ${s}`, {
          level: "error"
        });
      }
    }
    let n = getSessionProjectDir() ?? ty(getOriginalCwd());
    let r = ty(t);
    if (r === n) {
      return;
    }
    let o = Og.join(r, ".session-aliases");
    try {
      if ((await Al.readFile(o, "utf8")).split(`
`).includes(n)) {
        return;
      }
    } catch (s) {
      if (!fn(s)) {
        if (Io(s)) {
          logForDebugging(`recordSessionAlias: read failed for ${o}: ${s}`);
          return;
        }
        Oe(s);
        return;
      }
      try {
        await Al.mkdir(Og.dirname(o), {
          recursive: true,
          mode: 448
        });
      } catch (i) {
        if (Io(i)) {
          logForDebugging(`recordSessionAlias: mkdir failed for ${o}: ${i}`);
          return;
        }
        Oe(i);
        return;
      }
    }
    try {
      await Al.appendFile(o, n + `
`, {
        mode: 384
      });
    } catch (s) {
      if (Io(s)) {
        logForDebugging(`recordSessionAlias: append failed for ${o}: ${s}`);
        return;
      }
      Oe(s);
    }
  }
  async function pmc(e) {
    let t = Og.join(ty(e), ".session-aliases");
    try {
      let n = await Al.readFile(t, "utf8");
      return Ro(n.split(`
`).filter(r => r.length > 0));
    } catch (n) {
      if (!fn(n)) {
        if (Io(n)) {
          logForDebugging(`readSessionAliases: read failed for ${t}: ${n}`);
        } else {
          Oe(n);
        }
      }
      return [];
    }
  }
  function reAppendSessionMetadataAtExit() {
    if (UVo) {
      return;
    }
    UVo = true;
    try {
      yBe?.reAppendSessionMetadata();
    } catch {}
  }
  async function flushSessionStorageAtExit() {
    try {
      await yBe?.flush();
      await flushAppendEntryQueues();
    } catch {} finally {
      reAppendSessionMetadataAtExit();
    }
  }
  function eu() {
    if (!yBe) {
      if (yBe = new fmc(), !Gpc) {
        Ti(flushSessionStorageAtExit);
        process.on("exit", reAppendSessionMetadataAtExit);
        Gpc = true;
      }
    }
    return yBe;
  }
  function resetProjectFlushStateForTesting() {
    yBe?._resetFlushState();
  }
  function resetProjectForTesting() {
    yBe = null;
    UVo = false;
  }
  function setSessionFileForTesting(e) {
    eu().sessionFile = e;
  }
  async function reAppendSessionMetadataAsyncForTesting() {
    await eu().reAppendSessionMetadataAsync(false, true);
  }
  function getCurrentSessionFile() {
    return eu().sessionFile;
  }
  function setInternalEventWriter(e) {
    eu().setInternalEventWriter(e);
  }
  function clearInternalEventWriter() {
    eu().clearInternalEventWriter();
  }
  function addSessionMirror(e) {
    eu().addMirror(e);
  }
  function fireSessionMirror(e, t) {
    eu().fireMirror(e, t);
  }
  function setInternalEventReader(e, t) {
    eu().setInternalEventReader(e);
    eu().setInternalSubagentEventReader(t);
  }
  function setRemoteIngressUrlForTesting(e) {
    eu().setRemoteIngressUrl(e);
  }
  class fmc {
    currentSessionTag;
    currentSessionRelocatedCwd;
    currentSessionTitle;
    currentSessionAiTitle;
    currentSessionAgentName;
    currentSessionAgentColor;
    currentSessionLastPrompt;
    currentSessionLeafUuid;
    currentSessionLeafTs;
    currentSessionAgentSetting;
    currentSessionMode;
    currentSessionPermissionMode;
    currentSessionIsolationLatch;
    currentSessionWorktree;
    currentSessionPrNumber;
    currentSessionPrUrl;
    currentSessionPrRepository;
    currentSessionBridgeId;
    currentSessionBridgeSeq;
    currentSessionBridgeDialogKinds;
    sessionFile = null;
    pendingEntries = [];
    relocationBuffer = null;
    remoteIngressUrl = null;
    internalEventWriter = null;
    internalEventReader = null;
    internalSubagentEventReader = null;
    mirrors = [];
    pendingWriteCount = 0;
    flushResolvers = [];
    writeQueues = new Map();
    flushTimer = null;
    activeDrain = null;
    drainChain = Promise.resolve();
    FLUSH_INTERVAL_MS = 100;
    MAX_CHUNK_BYTES = 104857600;
    bytesSinceMetadataReAppend = 0;
    constructor() {}
    _resetFlushState() {
      if (this.pendingWriteCount = 0, this.bytesSinceMetadataReAppend = 0, this.flushResolvers = [], this.flushTimer) {
        clearTimeout(this.flushTimer);
      }
      this.flushTimer = null;
      this.activeDrain = null;
      this.drainChain = Promise.resolve();
      this.writeQueues = new Map();
      this.mirrors = [];
    }
    addMirror(e) {
      this.mirrors.push(e);
    }
    fireMirror(e, t) {
      for (let n of this.mirrors) {
        try {
          n(e, t);
        } catch (r) {
          logForDebugging(`[SessionMirror] mirror failed for ${e}: ${r}`, {
            level: "error"
          });
        }
      }
    }
    incrementPendingWrites() {
      this.pendingWriteCount++;
    }
    decrementPendingWrites() {
      if (this.pendingWriteCount--, this.pendingWriteCount === 0) {
        for (let e of this.flushResolvers) {
          e();
        }
        this.flushResolvers = [];
      }
    }
    async trackWrite(e) {
      this.incrementPendingWrites();
      try {
        return await e();
      } finally {
        this.decrementPendingWrites();
      }
    }
    pushQueueItem(e, t) {
      let n = this.writeQueues.get(e);
      if (!n) {
        n = [];
        this.writeQueues.set(e, n);
      }
      n.push(t);
      this.scheduleDrain();
    }
    enqueueWrite(e, t) {
      return new Promise(n => {
        this.pushQueueItem(e, {
          entry: t,
          resolve: n
        });
      });
    }
    enqueueRemove(e, t) {
      return new Promise(n => {
        this.pushQueueItem(e, {
          removeUuid: t,
          resolve: n
        });
      });
    }
    scheduleDrain() {
      if (this.flushTimer) {
        return;
      }
      this.flushTimer = setTimeout(async () => {
        if (this.flushTimer = null, this.activeDrain = this.drainWriteQueue(), await this.activeDrain, this.activeDrain = null, this.writeQueues.size > 0) {
          this.scheduleDrain();
        }
      }, this.FLUSH_INTERVAL_MS);
    }
    async appendToFile(e, t) {
      try {
        await Al.appendFile(e, t, {
          mode: 384
        });
      } catch {
        await Al.mkdir(Og.dirname(e), {
          recursive: true,
          mode: 448
        });
        await Al.appendFile(e, t, {
          mode: 384
        });
      }
      if (e === this.sessionFile) {
        this.bytesSinceMetadataReAppend += Buffer.byteLength(t, "utf8");
      }
    }
    drainWriteQueue() {
      let e = this.drainChain.then(() => this.drainQueuesOnce());
      this.drainChain = e.catch(() => {});
      return e;
    }
    async drainQueuesOnce() {
      for (let [e, t] of this.writeQueues) {
        if (t.length === 0) {
          continue;
        }
        let n = t.splice(0);
        let r = 0;
        try {
          let o = "";
          let s = 0;
          let a = this.mirrors.length > 0 ? [] : undefined;
          for (let l = 0; l < n.length; l++) {
            let c = n[l];
            if (!("entry" in c)) {
              if (o.length > 0) {
                if (await this.appendToFile(e, o), a) {
                  this.fireMirror(e, a.slice());
                  a.length = 0;
                }
                for (let p = s; p < l; p++) {
                  n[p].resolve();
                }
                r = l;
                o = "";
              }
              await this.performRemoveByUuid(e, c.removeUuid);
              c.resolve();
              r = l + 1;
              s = l + 1;
              continue;
            }
            let {
              entry: u
            } = c;
            let d = Ips(u);
            if (o.length + d.length >= this.MAX_CHUNK_BYTES) {
              if (await this.appendToFile(e, o), a) {
                this.fireMirror(e, a.slice());
                a.length = 0;
              }
              for (let p = s; p < l; p++) {
                n[p].resolve();
              }
              r = l;
              s = l;
              o = "";
            }
            o += d;
            a?.push(u);
          }
          if (o.length > 0) {
            if (await this.appendToFile(e, o), a) {
              this.fireMirror(e, a);
            }
            for (let l = s; l < n.length; l++) {
              n[l].resolve();
            }
            r = n.length;
          }
        } catch (o) {
          let s = en(o);
          if (Zd(o)) {
            logForDebugging(`Transcript write failed (${s}): ${he(o)}`, {
              level: "error"
            });
          } else {
            Oe(o);
          }
          logEvent("tengu_transcript_write_failed", {
            source: "drain",
            errno_enospc: s === "ENOSPC",
            errno_emfile: s === "EMFILE"
          });
          for (let i = r; i < n.length; i++) {
            n[i].resolve();
          }
        }
      }
      for (let [e, t] of this.writeQueues) {
        if (t.length === 0) {
          this.writeQueues.delete(e);
        }
      }
      if (this.bytesSinceMetadataReAppend >= 65536 / 2) {
        try {
          await this.reAppendSessionMetadataAsync(false, true);
        } catch (e) {
          if (Zd(e)) {
            logForDebugging(`Metadata re-append failed (${en(e)}): ${he(e)}`, {
              level: "error"
            });
          } else {
            Oe(e);
          }
        }
      }
    }
    resetSessionFile() {
      this.sessionFile = null;
      this.pendingEntries = [];
      this.bytesSinceMetadataReAppend = 0;
    }
    reAppendSessionMetadata(e = false, t = false) {
      if (!this.sessionFile) {
        return;
      }
      this.bytesSinceMetadataReAppend = 0;
      let n = Qdf(this.sessionFile);
      let r = this.planReAppendSessionMetadata(n, e, t);
      if (!r) {
        return;
      }
      for (let o of r.entries) {
        Xdf(r.sessionFile, o);
      }
    }
    async reAppendSessionMetadataAsync(e = false, t = false) {
      let n = this.sessionFile;
      if (!n) {
        return;
      }
      this.bytesSinceMetadataReAppend = 0;
      await flushAppendEntryQueues();
      let r = await Zdf(n);
      let o = this.planReAppendSessionMetadata(r, e, t);
      if (!o || o.entries.length === 0) {
        return;
      }
      let s = Pps(o.entries);
      try {
        await Al.appendFile(o.sessionFile, s, {
          mode: 384
        });
      } catch {
        await Al.mkdir(Og.dirname(o.sessionFile), {
          recursive: true,
          mode: 448
        });
        await Al.appendFile(o.sessionFile, s, {
          mode: 384
        });
      }
      this.fireMirror(o.sessionFile, o.entries);
    }
    planReAppendSessionMetadata(e, t, n) {
      if (!this.sessionFile) {
        return null;
      }
      let r = getSessionId();
      if (!r) {
        return null;
      }
      let o = this.sessionFile;
      let s = e.split(`
`);
      if (!t) {
        let m = s.findLast(h => h.includes('"type":"custom-title"') && h.includes('"customTitle":"'));
        if (m) {
          let h = rS(m, "customTitle");
          if (h !== undefined) {
            this.currentSessionTitle = h || undefined;
          }
        }
        let f = s.findLast(h => h.includes('"type":"ai-title"') && h.includes('"aiTitle":"'));
        if (f) {
          let h = rS(f, "aiTitle");
          if (h !== undefined) {
            this.currentSessionAiTitle = h || undefined;
          }
        }
      }
      let i = s.findLast(m => m.includes('"type":"tag"') && m.includes('"tag":"'));
      if (i) {
        let m = rS(i, "tag");
        if (m !== undefined) {
          this.currentSessionTag = m || undefined;
        }
      }
      let a = BDt(e, "relocated", "relocatedCwd");
      if (a) {
        this.currentSessionRelocatedCwd ??= a;
      }
      let l = [];
      if (this.currentSessionLastPrompt !== undefined || this.currentSessionLeafUuid !== undefined) {
        l.push({
          type: "last-prompt",
          ...(this.currentSessionLastPrompt && {
            lastPrompt: this.currentSessionLastPrompt
          }),
          ...(this.currentSessionLeafUuid && {
            leafUuid: this.currentSessionLeafUuid
          }),
          sessionId: r
        });
      }
      if (this.currentSessionTitle) {
        l.push({
          type: "custom-title",
          customTitle: this.currentSessionTitle,
          sessionId: r
        });
      }
      if (this.currentSessionAiTitle) {
        l.push({
          type: "ai-title",
          aiTitle: this.currentSessionAiTitle,
          sessionId: r
        });
      }
      if (this.currentSessionTag) {
        l.push({
          type: "tag",
          tag: this.currentSessionTag,
          sessionId: r
        });
      }
      if (this.currentSessionRelocatedCwd && e !== "") {
        l.push({
          type: "relocated",
          relocatedCwd: this.currentSessionRelocatedCwd,
          sessionId: r
        });
      }
      if (this.currentSessionAgentName) {
        l.push({
          type: "agent-name",
          agentName: this.currentSessionAgentName,
          sessionId: r
        });
      }
      if (this.currentSessionAgentColor) {
        l.push({
          type: "agent-color",
          agentColor: this.currentSessionAgentColor,
          sessionId: r
        });
      }
      if (this.currentSessionAgentSetting) {
        l.push({
          type: "agent-setting",
          agentSetting: this.currentSessionAgentSetting,
          sessionId: r
        });
      }
      if (this.currentSessionMode) {
        l.push({
          type: "mode",
          mode: this.currentSessionMode,
          sessionId: r
        });
      }
      if (this.currentSessionPermissionMode) {
        l.push({
          type: "permission-mode",
          permissionMode: this.currentSessionPermissionMode,
          sessionId: r
        });
      }
      if (this.currentSessionIsolationLatch) {
        l.push({
          type: "isolation-latch",
          side: this.currentSessionIsolationLatch,
          sessionId: r
        });
      }
      if (this.currentSessionWorktree !== undefined) {
        l.push({
          type: "worktree-state",
          worktreeSession: this.currentSessionWorktree,
          sessionId: r
        });
      }
      if (this.currentSessionPrNumber !== undefined && this.currentSessionPrUrl && this.currentSessionPrRepository) {
        l.push({
          type: "pr-link",
          sessionId: r,
          prNumber: this.currentSessionPrNumber,
          prUrl: this.currentSessionPrUrl,
          prRepository: this.currentSessionPrRepository,
          timestamp: new Date().toISOString()
        });
      }
      if (this.currentSessionBridgeId) {
        l.push({
          type: "bridge-session",
          sessionId: r,
          bridgeSessionId: this.currentSessionBridgeId,
          lastSequenceNum: this.currentSessionBridgeSeq ?? 0,
          ...(this.currentSessionBridgeDialogKinds?.length && {
            declaredDialogKinds: this.currentSessionBridgeDialogKinds
          })
        });
      }
      if (n || l.length === 0) {
        return {
          sessionFile: o,
          entries: l
        };
      }
      let c = new Set(l.map(m => m.type));
      let u = new Map();
      let d = 0;
      for (let m = s.length - 1; m >= 0; m--) {
        if (u.size === c.size) {
          break;
        }
        let f = s[m] ?? "";
        if (d += Buffer.byteLength(f, "utf8") + 1, d > 65536 / 2) {
          break;
        }
        if (!f) {
          continue;
        }
        let h;
        for (let g of c) {
          if (!u.vZc(g) && f.includes(`"type":"${g}"`)) {
            h = g;
            break;
          }
        }
        if (!h) {
          continue;
        }
        try {
          let g = jge(f);
          if (g.type === h) {
            u.set(h, g);
          }
        } catch {}
      }
      let p = m => {
        let {
          timestamp: f,
          ...h
        } = m;
        return De(h);
      };
      return {
        sessionFile: o,
        entries: l.filter(m => {
          let f = u.get(m.type);
          return !f || p(m) !== p(f);
        })
      };
    }
    async flush() {
      if (this.flushTimer) {
        clearTimeout(this.flushTimer);
        this.flushTimer = null;
      }
      if (this.activeDrain) {
        await this.activeDrain;
      }
      if (await this.drainWriteQueue(), this.pendingWriteCount === 0) {
        return;
      }
      return new Promise(e => {
        this.flushResolvers.push(e);
      });
    }
    async removeMessageByUuid(e) {
      return this.trackWrite(async () => {
        let t = this.sessionFile;
        if (t === null) {
          return;
        }
        return this.enqueueRemove(t, e);
      });
    }
    async performRemoveByUuid(e, t) {
      try {
        let n = 0;
        let r = await Al.open(e, "r+");
        try {
          let {
            size: a
          } = await r.stat();
          if (n = a, a === 0) {
            return;
          }
          let l = Math.min(a, 65536);
          let c = a - l;
          let u = Buffer.allocUnsafe(l);
          let {
            bytesRead: d
          } = await r.read(u, 0, l, c);
          let p = u.subarray(0, d);
          let m = `"uuid":"${t}"`;
          let f = p.lastIndexOf(m);
          if (f >= 0) {
            let h = p.lastIndexOf(10, f);
            if (h >= 0 || c === 0) {
              let g = h + 1;
              let y = p.indexOf(10, f + m.length);
              let _ = y >= 0 ? y + 1 : d;
              let b = c + g;
              let S = d - _;
              if (await r.truncate(b), S > 0) {
                await r.write(p, _, S, b);
              }
              return;
            }
          }
        } finally {
          await r.close();
        }
        if (n > 52428800) {
          logForDebugging(`Skipping tombstone removal: session file too large (${formatFileSize(n)})`, {
            level: "warn"
          });
          return;
        }
        let s = (await Al.readFile(e, {
          encoding: "utf-8"
        })).split(`
`);
        let i = s.filter(a => {
          if (!a.trim()) {
            return true;
          }
          try {
            return qt(a).uuid !== t;
          } catch {
            return true;
          }
        });
        if (i.length === s.length) {
          return;
        }
        await Al.writeFile(e, i.join(`
`), {
          encoding: "utf8"
        });
      } catch {}
    }
    shouldSkipPersistence() {
      return isTranscriptPersistenceDisabled();
    }
    async materializeSessionFile() {
      if (this.shouldSkipPersistence()) {
        return;
      }
      if (this.ensureCurrentSessionFile(), await this.reAppendSessionMetadataAsync(), this.pendingEntries.length > 0) {
        let e = this.pendingEntries;
        this.pendingEntries = [];
        for (let t of e) {
          await this.appendEntry(t);
        }
        if (this.currentSessionRelocatedCwd) {
          await this.reAppendSessionMetadataAsync(true);
        }
      }
    }
    async insertMessageChain(e, t = false, n, r, o) {
      return this.trackWrite(async () => {
        let s = r ?? null;
        let i;
        if (this.sessionFile === null && e.some(d => d.type === "user" || d.type === "assistant" || d.type === "system")) {
          await this.materializeSessionFile();
        }
        let a;
        try {
          a = await getBranch();
        } catch {
          a = undefined;
        }
        iZr();
        let l = getSessionId();
        let c = getPlanSlugCache().get(l);
        let u = t || this.shouldSkipPersistence() ? null : await _Be(l);
        for (let d of e) {
          let p = SS(d);
          let m = s;
          if (d.type === "user" && "sourceToolAssistantUUID" in d && d.sourceToolAssistantUUID) {
            let h = d.sourceToolAssistantUUID;
            if (u === null || u.vZc(h)) {
              m = h;
            } else {
              logEvent("tengu_phantom_parent_write", {});
            }
          }
          if (m === d.uuid) {
            logEvent("tengu_chain_self_reference_write", {});
          }
          let f = {
            parentUuid: p ? null : m,
            logicalParentUuid: p ? s : undefined,
            isSidechain: t,
            teamName: o?.teamName,
            agentName: o?.agentName,
            promptId: d.type === "user" ? getPromptId() ?? undefined : undefined,
            agentId: n,
            ...d,
            sessionKind: h0e(),
            userType: getUserType(),
            entrypoint: umc(),
            cwd: Nt(),
            sessionId: l,
            version: xdf,
            gitBranch: a,
            slug: c
          };
          if (f.type === "user" && f.toolUseResult != null) {
            f.toolUseResult = Imc(f.toolUseResult);
          }
          if (await this.appendEntry(f), isChainParticipant(d)) {
            s = d.uuid;
            i = d.timestamp;
          }
        }
        if (!t) {
          if (s && i && (!this.currentSessionLeafTs || i >= this.currentSessionLeafTs)) {
            this.currentSessionLeafUuid = s;
            this.currentSessionLeafTs = i;
          }
          let d = getFirstMeaningfulUserMessageTextContent(e);
          if (d) {
            let p = d.replaceAll(`
`, " ").trim();
            this.currentSessionLastPrompt = p.length > 200 ? p.slice(0, 200).trim() + "\u2026" : p;
          }
        }
      });
    }
    async insertFileHistorySnapshot(e, t, n) {
      return this.trackWrite(async () => {
        let r = {
          type: "file-history-snapshot",
          messageId: e,
          snapshot: t,
          isSnapshotUpdate: n
        };
        await this.appendEntry(r);
      });
    }
    async insertQueueOperation(e) {
      return this.trackWrite(async () => {
        await this.appendEntry(e);
      });
    }
    async insertAttributionSnapshot(e) {
      return this.trackWrite(async () => {
        await this.appendEntry(e);
      });
    }
    async insertContentReplacement(e, t) {
      return this.trackWrite(async () => {
        let n = {
          type: "content-replacement",
          sessionId: getSessionId(),
          agentId: t,
          replacements: e
        };
        await this.appendEntry(n);
      });
    }
    async appendEntry(e, t = getSessionId()) {
      if (this.shouldSkipPersistence()) {
        return;
      }
      if (this.relocationBuffer) {
        this.relocationBuffer.push({
          entry: e,
          sessionId: t
        });
        return;
      }
      let n = getSessionId();
      let r = t === n;
      let o;
      if (r) {
        if (this.sessionFile === null) {
          this.pendingEntries.push(e);
          return;
        }
        o = this.sessionFile;
      } else {
        let s = await this.getExistingSessionFile(t);
        if (!s) {
          Oe(Error(`appendEntry: session file not found for other session ${t}`));
          return;
        }
        o = s;
      }
      switch (ENTRY_APPEND_POLICY[e.type]) {
        case "always":
          {
            this.enqueueWrite(o, e);
            return;
          }
        case "route-by-agent":
          {
            let s = (e.type === "content-replacement" || e.type === "fork-context-ref") && e.agentId ? Ew(e.agentId) : o;
            this.enqueueWrite(s, e);
            return;
          }
        case "dedup-transcript":
          {
            if (e.type !== "progress" && !isTranscriptMessage(e)) {
              Oe(Error(`appendEntry invariant: dedup-transcript policy on non-transcript type '${e.type}'`));
              return;
            }
            let s = await _Be(t);
            let i = e.isSidechain && e.agentId !== undefined;
            let a = i ? Ew(e.agentId) : o;
            let l = !s.vZc(e.uuid);
            if (i || l) {
              if (this.enqueueWrite(a, e), !i) {
                if (s.add(e.uuid), isTranscriptMessage(e)) {
                  await this.persistToRemote(t, e);
                }
              } else if (this.internalEventWriter && isTranscriptMessage(e)) {
                this.persistToRemote(t, e);
              }
            }
            return;
          }
      }
    }
    beginTranscriptRelocation() {
      this.relocationBuffer ??= [];
    }
    async endTranscriptRelocation() {
      let e = this.relocationBuffer;
      if (this.relocationBuffer = null, !e) {
        return;
      }
      for (let {
        entry: t,
        sessionId: n
      } of e) {
        await this.appendEntry(t, n);
      }
    }
    ensureCurrentSessionFile() {
      if (this.sessionFile === null) {
        this.sessionFile = wh();
      }
      return this.sessionFile;
    }
    existingSessionFiles = new Map();
    async getExistingSessionFile(e) {
      let t = this.existingSessionFiles.get(e);
      if (t) {
        return t;
      }
      let n = getTranscriptPathForSession(e);
      try {
        await Al.stat(n);
        this.existingSessionFiles.set(e, n);
        return n;
      } catch (r) {
        if (Io(r)) {
          return null;
        }
        throw r;
      }
    }
    async persistToRemote(e, t) {
      if (isShuttingDown()) {
        return;
      }
      if (this.internalEventWriter) {
        try {
          await this.internalEventWriter("transcript", t, {
            ...(SS(t) && {
              isCompaction: true,
              preservedEventIds: t.compactMetadata.preservedMessages?.uuids
            }),
            ...(t.agentId && {
              agentId: t.agentId
            })
          });
        } catch {
          logEvent("tengu_session_persistence_failed", {});
          logForDebugging("Failed to write transcript as internal event");
        }
        return;
      }
      if (!st("true") || !this.remoteIngressUrl) {
        return;
      }
      if (!(await Wfl(e, t, this.remoteIngressUrl))) {
        logEvent("tengu_session_persistence_failed", {});
        gracefulShutdownSync(1, "other");
      }
    }
    async mirrorInternalEntry(e) {
      if (!this.internalEventWriter || isShuttingDown()) {
        return;
      }
      try {
        await this.internalEventWriter(e.type, e, {});
      } catch (t) {
        throw logEvent("tengu_session_persistence_failed", {}), logForDebugging("Failed to mirror internal entry to CCR"), t;
      }
    }
    setRemoteIngressUrl(e) {
      if (this.remoteIngressUrl = e, logForDebugging(`Remote persistence enabled with URL: ${e}`), e) {
        this.FLUSH_INTERVAL_MS = 10;
      }
    }
    setInternalEventWriter(e) {
      this.internalEventWriter = e;
      logForDebugging("CCR v2 internal event writer registered for transcript persistence");
      this.FLUSH_INTERVAL_MS = 10;
    }
    clearInternalEventWriter() {
      if (!this.internalEventWriter) {
        return;
      }
      this.internalEventWriter = null;
      logForDebugging("CCR v2 internal event writer cleared");
    }
    setInternalEventReader(e) {
      this.internalEventReader = e;
      logForDebugging("CCR v2 internal event reader registered for session resume");
    }
    setInternalSubagentEventReader(e) {
      this.internalSubagentEventReader = e;
      logForDebugging("CCR v2 subagent event reader registered for session resume");
    }
    getInternalEventReader() {
      return this.internalEventReader;
    }
    getInternalSubagentEventReader() {
      return this.internalSubagentEventReader;
    }
  }
  async function recordTranscript(e, t, n, r) {
    let o = cleanMessagesForLogging(e, r);
    let s = getSessionId();
    let i = await _Be(s);
    let a = [];
    let l = n;
    if (l && !isTranscriptPersistenceDisabled() && !i.vZc(l)) {
      logEvent("tengu_phantom_parent_hint", {});
    }
    let c = false;
    for (let d of o) {
      if (i.vZc(d.uuid)) {
        if (!c && isChainParticipant(d)) {
          l = d.uuid;
        }
      } else {
        a.push(d);
        c = true;
      }
    }
    if (a.length > 0) {
      await eu().insertMessageChain(a, false, undefined, l, t);
    }
    return a.findLast(isChainParticipant)?.uuid ?? l ?? null;
  }
  async function persistLeafCheckpoint(e, t) {
    let n = eu();
    n.currentSessionLeafUuid = e ?? undefined;
    n.currentSessionLeafTs = new Date().toISOString();
    await n.appendEntry({
      type: "last-prompt",
      ...(n.currentSessionLastPrompt && {
        lastPrompt: n.currentSessionLastPrompt
      }),
      leafUuid: e,
      explicit: true,
      ...(t?.rewound && {
        rewound: true
      }),
      sessionId: getSessionId()
    });
  }
  async function mirrorLeafCheckpointToRemote(e, t) {
    let n = eu();
    await n.mirrorInternalEntry({
      type: "last-prompt",
      ...(n.currentSessionLastPrompt && {
        lastPrompt: n.currentSessionLastPrompt
      }),
      leafUuid: e,
      explicit: true,
      ...(t?.rewound && {
        rewound: true
      }),
      sessionId: getSessionId()
    });
  }
  async function recordSidechainTranscript(e, t, n) {
    await eu().insertMessageChain(cleanMessagesForLogging(e), true, t, n);
  }
  async function recordForkContextRef(e) {
    await eu().appendEntry({
      type: "fork-context-ref",
      ...e
    });
  }
  async function Bdf(e) {
    let t = xJe.get(e.parentLastUuid);
    if (t) {
      xJe.delete(e.parentLastUuid);
      xJe.set(e.parentLastUuid, t);
      return t;
    }
    let n = getTranscriptPathForSession(e.parentSessionId);
    let {
      messages: r
    } = await loadTranscriptFile(n);
    let o = r.get(e.parentLastUuid);
    if (!o) {
      logForDebugging(`[fork-context-ref] parent uuid ${e.parentLastUuid} not found in ${n}; returning empty prefix`, {
        level: "warn"
      });
      return [];
    }
    let s = buildConversationChain(r, o).filter(i => !i.isSidechain).map(({
      isSidechain: i,
      parentUuid: a,
      ...l
    }) => l);
    if (xJe.size >= 4) {
      let i = xJe.keys().next().value;
      if (i !== undefined) {
        xJe.delete(i);
      }
    }
    xJe.set(e.parentLastUuid, s);
    return s;
  }
  async function recordQueueOperation(e) {
    await eu().insertQueueOperation(e);
  }
  async function removeTranscriptMessage(e) {
    await eu().removeMessageByUuid(e);
  }
  async function removeTranscriptMessageIfPersisted(e) {
    if (!(await _Be(getSessionId())).vZc(e)) {
      return;
    }
    await eu().removeMessageByUuid(e);
  }
  async function recordFileHistorySnapshot(e, t, n) {
    await eu().insertFileHistorySnapshot(e, t, n);
  }
  async function recordAttributionSnapshot(e) {
    await eu().insertAttributionSnapshot(e);
  }
  async function recordContentReplacement(e, t) {
    await eu().insertContentReplacement(e, t);
  }
  async function resetSessionFilePointer() {
    eu().resetSessionFile();
  }
  function adoptResumedSessionFile() {
    let e = eu();
    e.sessionFile = wh();
    let t = new Date();
    Al.utimes(e.sessionFile, t, t).catch(() => {});
    e.reAppendSessionMetadata(true);
  }
  function touchSessionTranscript() {
    let e = eu().sessionFile;
    if (e === null) {
      return;
    }
    let t = new Date();
    Al.utimes(e, t, t).catch(() => {});
  }
  async function relocateSessionTranscript() {
    let e = getSessionId();
    let t = ty(getOriginalCwd());
    let n = eu();
    let r = n.sessionFile;
    if (r === null || isTranscriptPersistenceDisabled()) {
      n.currentSessionRelocatedCwd = getOriginalCwd();
      switchSession(e, "cd", t);
      return;
    }
    let o = Og.join(t, `${e}.jsonl`);
    if (r === o) {
      switchSession(e, "cd", t);
      let s = getOriginalCwd();
      if (n.currentSessionRelocatedCwd !== s) {
        n.currentSessionRelocatedCwd = s;
        let i = {
          type: "relocated",
          sessionId: e,
          relocatedCwd: s
        };
        n.beginTranscriptRelocation();
        Jpc(r);
        try {
          if (await n.flush(), await flushAppendEntryQueues(), await ytn(r, De(i) + `
`)) {
            n.fireMirror(r, [i]);
          }
        } catch (a) {
          logForDebugging(`relocateSessionTranscript: same-target relocated stamp failed: ${a}`);
        } finally {
          Xpc(r);
          await n.endTranscriptRelocation();
        }
      }
      return;
    }
    n.beginTranscriptRelocation();
    Jpc(r);
    try {
      await n.flush();
      await flushAppendEntryQueues();
      await Al.mkdir(t, {
        recursive: true,
        mode: 448
      });
      let s = true;
      try {
        await zpc(r, o);
      } catch (c) {
        if (fn(c)) {
          logForDebugging(`relocateSessionTranscript: old file missing: ${c}`);
          s = false;
        } else {
          throw c;
        }
      }
      let i = Og.join(Og.dirname(r), e);
      let a = Og.join(t, e);
      let l = true;
      try {
        await zpc(i, a);
      } catch (c) {
        if (l = false, !fn(c)) {
          Oe(c);
        }
      }
      if (n.sessionFile = o, switchSession(e, "cd", t), n.currentSessionRelocatedCwd = getOriginalCwd(), s) {
        try {
          await appendEntryToFileAsync(o, {
            type: "relocated",
            sessionId: e,
            relocatedCwd: n.currentSessionRelocatedCwd
          });
        } catch (c) {
          logForDebugging(`relocateSessionTranscript: relocated stamp failed: ${c}`);
        }
      }
      if (l) {
        try {
          await (cE(), __toCommonJS(Amc)).repointTaskOutputSymlinks(i, a);
        } catch (c) {
          Oe(c);
        }
      }
    } finally {
      Xpc(n.sessionFile ?? r);
      await n.endTranscriptRelocation();
    }
  }
  async function zpc(e, t) {
    try {
      await Al.rename(e, t);
      return;
    } catch (n) {
      let r = en(n);
      if (r === "EEXIST" || r === "EPERM" || r === "EBUSY" || r === "ENOTEMPTY") {
        await Al.rm(t, {
          recursive: true,
          force: true
        }).catch(() => {});
        await Al.rename(e, t);
        return;
      }
      if (r === "EXDEV") {
        try {
          await Al.copyFile(e, t);
        } catch (o) {
          let s = en(o);
          if (s === "EISDIR" || s === "ENOTSUP" || s === "EPERM") {
            await gmc(e, t);
          } else {
            throw o;
          }
        }
        await Al.rm(e, {
          recursive: true,
          force: true
        });
        return;
      }
      throw n;
    }
  }
  async function gmc(e, t) {
    await Al.mkdir(t, {
      recursive: true,
      mode: 448
    });
    for (let n of await Al.readdir(e, {
      withFileTypes: true
    })) {
      let r = Og.join(e, n.name);
      let o = Og.join(t, n.name);
      if (n.isDirectory()) {
        await gmc(r, o);
      } else {
        await Al.copyFile(r, o);
      }
    }
  }
  async function recordContextCollapseCommit(e) {
    let t = getSessionId();
    if (!t) {
      return;
    }
    await eu().appendEntry({
      type: "marble-origami-commit",
      sessionId: t,
      ...e
    });
  }
  async function recordContextCollapseSnapshot(e) {
    let t = getSessionId();
    if (!t) {
      return;
    }
    await eu().appendEntry({
      type: "marble-origami-snapshot",
      sessionId: t,
      ...e
    });
  }
  async function recordContextCollapseReset(e) {
    let t = getSessionId();
    if (!t) {
      return;
    }
    await eu().appendEntry({
      type: "marble-origami-reset",
      sessionId: t,
      ...e
    });
  }
  async function flushSessionStorage() {
    await eu().flush();
  }
  function ppr(e) {
    if (typeof e !== "object" || e === null) {
      return false;
    }
    let t = e.type;
    return t === "user" || t === "assistant";
  }
  async function BVo(e) {
    let n;
    try {
      n = await Al.open(e, "r");
      let r = Buffer.allocUnsafe(65536);
      let o = new emc.StringDecoder("utf8");
      let s = "";
      for (;;) {
        let {
          bytesRead: i
        } = await n.read(r, 0, 65536, null);
        if (i <= 0) {
          break;
        }
        let l = (s + o.write(r.subarray(0, i))).split(`
`);
        s = l.pop() ?? "";
        for (let c of l) {
          if (Kpc(c)) {
            return true;
          }
        }
      }
      return Kpc(s + o.end());
    } catch {
      return false;
    } finally {
      if (n) {
        try {
          await n.close();
        } catch {}
      }
    }
  }
  function Kpc(e) {
    if (!e.includes('"type":"user"') && !e.includes('"type": "user"') && !e.includes('"type":"assistant"') && !e.includes('"type": "assistant"')) {
      return false;
    }
    try {
      return ppr(jge(e));
    } catch {
      return false;
    }
  }
  async function hydrateRemoteSession(e, t) {
    switchSession(e, "hydrate");
    let n = eu();
    try {
      let r = (await Gfl(e, t)) || [];
      let o = ty(getOriginalCwd());
      await Al.mkdir(o, {
        recursive: true,
        mode: 448
      });
      let s = getTranscriptPathForSession(e);
      if (!r.some(ppr) && (await BVo(s))) {
        logForDebugging(`Skipping remote hydration: server set of ${r.length} entries has no content-bearing entries but the local transcript does`);
        wn("info", "hydrate_skip_zero_content_replace", {
          path: "v1_session_ingress",
          server_entry_count: r.length
        });
        return true;
      }
      await Rye(s, r);
      logForDebugging(`Hydrated ${r.length} entries from remote`);
      return r.length > 0;
    } catch (r) {
      logForDebugging(`Error hydrating session from remote: ${r}`);
      wn("error", "hydrate_remote_session_fail");
      return false;
    } finally {
      n.setRemoteIngressUrl(t);
    }
  }
  function ymc(e) {
    let t = getTranscriptPathForSession(e);
    return t.endsWith(".jsonl") ? t.slice(0, -6) + ".ccr-tip.json" : t + ".ccr-tip.json";
  }
  async function readCCRTip(e) {
    try {
      let t = await Al.readFile(ymc(e), "utf-8");
      let n = qt(t);
      if (typeof n === "object" && n !== null && "eventId" in n && typeof n.eventId === "string") {
        return n;
      }
      return null;
    } catch {
      return null;
    }
  }
  async function bmc(e, t) {
    let n = {
      eventId: t,
      updatedAt: new Date().toISOString()
    };
    try {
      await Fm(ymc(e), De(n), 384);
    } catch (r) {
      logForDebugging(`Failed to write CCR tip sidecar: ${r}`);
    }
  }
  async function updateCCRTipFromAckedBatch(e) {
    for (let t = e.length - 1; t >= 0; t--) {
      let n = e[t];
      if (!n || n.session_agent_id) {
        continue;
      }
      if (isSyncedTranscriptEntry(n.payload)) {
        await bmc(getSessionId(), n.payload.uuid);
        return;
      }
    }
  }
  function collectTailUuids(e) {
    let t = new Set();
    for (let n of Ake(e)) {
      if (typeof n !== "object" || n === null) {
        continue;
      }
      let r = n.uuid;
      if (typeof r === "string") {
        t.add(r);
      }
    }
    return t;
  }
  async function getValidatedCCRTip(e, t, n) {
    if (!t) {
      return {
        fallbackReason: "client-gated"
      };
    }
    let [r, o] = await Promise.all([readCCRTip(e), n !== undefined ? n : LA(getTranscriptPathForSession(e), 65536).catch(() => null)]);
    if (!r) {
      return {
        fallbackReason: "no-sidecar"
      };
    }
    if (!o || !collectTailUuids(o.content).vZc(r.eventId)) {
      return {
        fallbackReason: "tip-not-in-tail"
      };
    }
    return {
      eventId: r.eventId
    };
  }
  function extractLastSyncedEventUuid(e) {
    for (let t of Tmc(e)) {
      return t;
    }
    return;
  }
  function* Tmc(e) {
    let t = e.split(`
`);
    for (let n = t.length - 1; n >= 0; n--) {
      let r = t[n];
      if (!r) {
        continue;
      }
      let o;
      try {
        o = jge(r);
      } catch {
        continue;
      }
      if (isSyncedTranscriptEntry(o)) {
        yield o.uuid;
      }
    }
  }
  function extractLatestIntersectingSyncedUuid(e, t) {
    let n = 0;
    for (let r of Tmc(e)) {
      if (t.vZc(r)) {
        return {
          uuid: r,
          walkback: n
        };
      }
      n++;
    }
    return;
  }
  async function hydrateFromCCRv2InternalEvents(e, t, n = false) {
    let r = Date.now();
    switchSession(e, "hydrate");
    let o = eu();
    let s = o.getInternalEventReader();
    if (!s) {
      logForDebugging("No internal event reader registered for CCR v2 resume");
      return false;
    }
    try {
      let i = getTranscriptPathForSession(e);
      let a = LA(i, 65536).catch(() => null);
      let l;
      let c;
      let u;
      if (t) {
        l = t[0];
        c = t[2]?.eventId;
        u = t[2]?.fallbackReason;
      } else {
        let F = await getValidatedCCRTip(e, n, await a);
        c = F.eventId;
        u = F.fallbackReason;
        let H = performance.now();
        l = await s(c);
        au("resume_hydrate_fetch_ms", performance.now() - H, H);
      }
      if (!l) {
        logForDebugging("Failed to read internal events for resume");
        wn("error", "hydrate_ccr_v2_read_fail");
        return false;
      }
      let {
        events: d,
        stats: p
      } = l;
      let m = ty(getOriginalCwd());
      await Al.mkdir(m, {
        recursive: true,
        mode: 448
      });
      let f = await a;
      let h = f?.bytesTotal ?? 0;
      let g;
      let y;
      let _;
      if (f) {
        if (g = extractLastSyncedEventUuid(f.content), c === undefined) {
          let F = new Map();
          for (let H = 0; H < d.length; H++) {
            let U = d[H]?.payload.uuid;
            if (typeof U === "string") {
              F.set(U, H);
            }
          }
          y = extractLatestIntersectingSyncedUuid(f.content, F);
          _ = y === undefined ? undefined : F.get(y.uuid);
        }
      }
      let b = _ === undefined ? d.length : d.length - 1 - _;
      uhl(h, p?.bytesReceived ?? null, d.length, b, c !== undefined, y?.walkback);
      let S = false;
      let E = l.anchorFallback !== undefined;
      let C = c !== undefined && !E && d.some(F => F.event_id !== undefined ? F.event_id === c : F.payload.uuid === c);
      let x = c !== undefined && f ? collectTailUuids(f.content) : null;
      let A = c !== undefined && f !== null && x !== null && x.vZc(c) && f.content.endsWith(`
`);
      let k = d;
      if (c && !E && !C) {
        if (!A) {
          u = "tail-incoherent";
          let F = await s();
          if (!F) {
            logForDebugging("Failed to refetch full read after incoherent local tail");
            wn("error", "hydrate_ccr_v2_read_fail");
            return false;
          }
          k = F.events;
        }
      }
      let I = false;
      if (c && !E && !C && A) {
        let F = d.map(H => H.payload).filter(H => {
          let U = H.uuid;
          return typeof U !== "string" || !x.vZc(U);
        });
        if (F.length > 0) {
          await Fks(i, F);
        }
        S = true;
        I = true;
        logForDebugging(`Hydrated delta: appended ${F.length}/${d.length} foreground entries from CCR v2 internal events`);
      } else {
        if (c && u !== "tail-incoherent") {
          u = l.anchorFallback === "rejected" ? "anchor-rejected" : l.anchorFallback === "not-found" ? "anchor-not-found" : "anchor-in-response";
        }
        if (!k.some(H => ppr(H.payload)) && (await BVo(i))) {
          logForDebugging(`Skipping CCR v2 foreground hydration: fetched set of ${k.length} events has no content-bearing entries but the local transcript does`);
          wn("info", "hydrate_skip_zero_content_replace", {
            path: "v2_foreground",
            server_entry_count: k.length
          });
        } else {
          await Rye(i, k.map(H => H.payload));
          I = true;
          logForDebugging(`Hydrated ${k.length} foreground entries from CCR v2 internal events`);
        }
      }
      let O = S ? d : k;
      if (I) {
        for (let F = O.length - 1; F >= 0; F--) {
          let H = O[F];
          if (H && isSyncedTranscriptEntry(H.payload)) {
            await bmc(e, H.event_id ?? H.payload.uuid);
            break;
          }
        }
      }
      let M = 0;
      let L;
      let P = o.getInternalSubagentEventReader();
      if (P) {
        let F = t ? t[1] : await P();
        L = F?.stats;
        let H = F?.events;
        if (H && H.length > 0) {
          M = H.length;
          let U = new Map();
          for (let N of H) {
            let W = N.session_agent_id || "";
            if (!W) {
              continue;
            }
            let j = U.get(W);
            if (!j) {
              j = [];
              U.set(W, j);
            }
            j.push(N.payload);
          }
          for (let [N, W] of U) {
            let j = Ew(N);
            if (!W.some(ppr) && (await BVo(j))) {
              wn("info", "hydrate_skip_zero_content_replace", {
                path: "v2_subagent",
                server_entry_count: W.length
              });
              continue;
            }
            await Al.mkdir(Og.dirname(j), {
              recursive: true,
              mode: 448
            });
            await Rye(j, W);
          }
          logForDebugging(`Hydrated ${H.length} subagent entries across ${U.size} agents`);
        }
      }
      wn("info", "hydrate_ccr_v2_completed", {
        duration_ms: Date.now() - r,
        event_count: O.length,
        subagent_event_count: M,
        page_count: p?.pageCount,
        bytes_received: p?.bytesReceived,
        content_encoding: p?.contentEncoding,
        subagent_page_count: L?.pageCount,
        subagent_bytes_received: L?.bytesReceived,
        prefetched: t?.[0] != null,
        on_disk_bytes: h,
        delta_events: b,
        delta_fetch_attempted: c !== undefined,
        delta_fetch_applied: S,
        ...(u && {
          delta_fallback_reason: u
        }),
        delta_anchor: y !== undefined && y.walkback > 0 ? "intersected" : "synced",
        on_disk_last_uuid: g,
        anchor_uuid: y?.uuid,
        anchor_walkback: y?.walkback,
        ccr_last_uuid: O.at(-1)?.payload.uuid
      });
      return O.length > 0;
    } catch (i) {
      if (i instanceof Error && i.message === "CCRClient: Epoch mismatch (409)") {
        throw i;
      }
      logForDebugging(`Error hydrating session from CCR v2: ${i}`);
      wn("error", "hydrate_ccr_v2_fail");
      return false;
    }
  }
  function ezo(e) {
    let t = getFirstMeaningfulUserMessageTextContent(e);
    if (t) {
      let n = t.replaceAll(`
`, " ").trim();
      if (n.length > 200) {
        n = n.slice(0, 200).trim() + "\u2026";
      }
      return n;
    }
    return "No prompt";
  }
  function getFirstMeaningfulUserMessageTextContent(e) {
    for (let t of e) {
      if (t.type !== "user" || t.isMeta) {
        continue;
      }
      if ("isCompactSummary" in t && t.isCompactSummary) {
        continue;
      }
      let n = t.message?.content;
      if (!n) {
        continue;
      }
      let r = [];
      if (typeof n === "string") {
        r.push(n);
      } else if (Array.isArray(n)) {
        for (let o of n) {
          if (o.type === "text" && o.text) {
            r.push(o.text);
          }
        }
      }
      for (let o of r) {
        if (!o) {
          continue;
        }
        let s = Nl(o, "command-name");
        if (s) {
          let a = s.replace(/^\//, "");
          if (builtInCommandNames().vZc(a)) {
            continue;
          } else {
            let l = Nl(o, "command-args")?.trim();
            if (!l) {
              continue;
            }
            return `${s} ${l}`;
          }
        }
        let i = Nl(o, "bash-input");
        if (i) {
          return `! ${i}`;
        }
        if (tmc.test(o)) {
          continue;
        }
        return o;
      }
    }
    return;
  }
  function removeExtraFields(e) {
    return e.map(t => {
      let {
        isSidechain: n,
        parentUuid: r,
        ...o
      } = t;
      return o;
    });
  }
  function Ypc(e) {
    let t;
    let n = -1;
    let r = -1;
    let o = new Map();
    let s = 0;
    for (let p of e.values()) {
      if (o.set(p.uuid, s), SS(p)) {
        r = s;
        let m = p.compactMetadata;
        if (m?.preservedMessages || m?.preservedSegment) {
          t = m;
          n = s;
        }
      }
      s++;
    }
    if (!t) {
      return;
    }
    let i = n === r;
    let a = i ? qdf(t, e) : undefined;
    if (i && !a) {
      return;
    }
    let l = a && a.preserved.uuids.length > 0 ? a.preserved : undefined;
    if (l?.uuids.some(p => !e.vZc(p))) {
      logEvent("tengu_relink_walk_broken", {
        source: a?.source == null ? undefined : a?.source,
        listed: l.uuids.length,
        present: Bn(l.uuids, p => e.vZc(p)),
        anchorInTranscript: e.vZc(l.anchorUuid),
        transcriptSize: e.size
      });
      return;
    }
    let c = l?.uuids ?? [];
    let u = new Set(c);
    if (l) {
      let p = c.at(-1);
      let m = l.anchorUuid;
      for (let f of c) {
        let h = e.get(f);
        e.set(f, {
          ...h,
          parentUuid: m
        });
        m = f;
      }
      for (let [f, h] of e) {
        if (h.parentUuid === l.anchorUuid && f !== c[0]) {
          e.set(f, {
            ...h,
            parentUuid: p
          });
        }
      }
      for (let f of c) {
        let h = e.get(f);
        if (h?.type !== "assistant") {
          continue;
        }
        e.set(f, {
          ...h,
          message: {
            ...h.message,
            usage: {
              ...h.message.usage,
              input_tokens: 0,
              output_tokens: 0,
              cache_creation_input_tokens: 0,
              cache_read_input_tokens: 0
            }
          }
        });
      }
    }
    let d = [];
    for (let [p] of e) {
      let m = o.get(p);
      if (m !== undefined && m < r && !u.vZc(p)) {
        d.push(p);
      }
    }
    for (let p of d) {
      e.delete(p);
    }
    if (l && d.length > 0) {
      let p = c.at(-1);
      let m = new Set(d);
      for (let [f, h] of e) {
        if ((h.type === "user" || h.type === "assistant") && h.parentUuid !== null && m.vZc(h.parentUuid)) {
          e.set(f, {
            ...h,
            parentUuid: p
          });
        }
      }
    }
    return c.at(-1);
  }
  function qdf(e, t) {
    if (e.preservedMessages) {
      return {
        preserved: e.preservedMessages,
        source: "list"
      };
    }
    let n = e.preservedSegment;
    if (!n) {
      return;
    }
    let r = new Set();
    let o = [];
    let s = t.get(n.tailUuid);
    while (s && !r.vZc(s.uuid)) {
      if (r.add(s.uuid), o.push(s.uuid), s.uuid === n.headUuid) {
        o.reverse();
        return {
          preserved: {
            anchorUuid: n.anchorUuid,
            uuids: o
          },
          source: "walk"
        };
      }
      s = s.parentUuid ? t.get(s.parentUuid) : undefined;
    }
    logEvent("tengu_relink_walk_broken", {
      source: "walk",
      tailInTranscript: t.vZc(n.tailUuid),
      headInTranscript: t.vZc(n.headUuid),
      anchorInTranscript: t.vZc(n.anchorUuid),
      walkSteps: r.size,
      transcriptSize: t.size
    });
    return;
  }
  function kJe(e, t) {
    let n;
    let r = -1 / 0;
    for (let o of e) {
      if (!t(o)) {
        continue;
      }
      let s = Date.parse(o.timestamp);
      if (s > r) {
        r = s;
        n = o;
      }
    }
    return n;
  }
  function buildConversationChain(e, t, n) {
    let r = [];
    let o = new Set();
    let s = t;
    while (s) {
      if (o.vZc(s.uuid)) {
        Oe(Error(`Cycle detected in parentUuid chain at message ${s.uuid}. Returning partial transcript.`));
        logEvent("tengu_chain_parent_cycle", {});
        break;
      }
      o.add(s.uuid);
      r.push(s);
      let a = s.parentUuid;
      if (!a) {
        break;
      }
      let l = e.get(a);
      if (!l || o.vZc(l.uuid)) {
        if (l = Vdf(e, s, o), l) {
          logEvent("tengu_chain_timestamp_fallback", {});
        }
      }
      s = l;
    }
    r.reverse();
    let i = zdf(e, r, o);
    Wdf(t, i, o, n ?? vmc(e));
    return i;
  }
  function vmc(e) {
    let t = new Map();
    for (let n of e.values()) {
      if (n.parentUuid && n.type !== "user" && n.type !== "assistant") {
        let r = t.get(n.parentUuid);
        if (r) {
          r.push(n);
        } else {
          t.set(n.parentUuid, [n]);
        }
      }
    }
    return t;
  }
  function Wdf(e, t, n, r) {
    let o = [];
    let s = [e.uuid];
    while (s.length > 0) {
      let i = s.shift();
      for (let a of r.get(i) ?? []) {
        if (n.vZc(a.uuid)) {
          continue;
        }
        n.add(a.uuid);
        o.push(a);
        s.push(a.uuid);
      }
    }
    if (o.length > 1) {
      o.sort((i, a) => i.timestamp < a.timestamp ? -1 : i.timestamp > a.timestamp ? 1 : 0);
    }
    t.push(...o);
  }
  function Vdf(e, t, n) {
    let r = new Date(t.timestamp).getTime();
    if (Number.isNaN(r)) {
      return;
    }
    let o;
    let s = 1 / 0;
    for (let i of e.values()) {
      if (n.vZc(i.uuid)) {
        continue;
      }
      if (i.isSidechain !== t.isSidechain) {
        continue;
      }
      let a = new Date(i.timestamp).getTime();
      if (Number.isNaN(a)) {
        continue;
      }
      let l = r - a;
      if (l >= 0 && l <= 5000 && l < s) {
        s = l;
        o = i;
      }
    }
    return o;
  }
  function zdf(e, t, n) {
    let r = t.filter(d => d.type === "assistant");
    if (r.length === 0) {
      return t;
    }
    let o = new Map();
    for (let d of r) {
      if (d.message.id) {
        o.set(d.message.id, d);
      }
    }
    let s = new Map();
    let i = new Map();
    for (let d of e.values()) {
      if (d.type === "assistant" && d.message.id) {
        let p = s.get(d.message.id);
        if (p) {
          p.push(d);
        } else {
          s.set(d.message.id, [d]);
        }
      } else if (d.type === "user" && d.parentUuid && Array.isArray(d.message.content) && d.message.content.some(p => p.type === "tool_result")) {
        let p = i.get(d.parentUuid);
        if (p) {
          p.push(d);
        } else {
          i.set(d.parentUuid, [d]);
        }
      }
    }
    let a = new Set();
    let l = new Map();
    let c = 0;
    for (let d of r) {
      let p = d.message.id;
      if (!p || a.vZc(p)) {
        continue;
      }
      a.add(p);
      let m = s.get(p) ?? [d];
      let f = m.filter(_ => !n.vZc(_.uuid));
      let h = [];
      for (let _ of m) {
        let b = i.get(_.uuid);
        if (!b) {
          continue;
        }
        for (let S of b) {
          if (!n.vZc(S.uuid)) {
            h.push(S);
          }
        }
      }
      if (f.length === 0 && h.length === 0) {
        continue;
      }
      f.sort((_, b) => _.timestamp.localeCompare(b.timestamp));
      h.sort((_, b) => _.timestamp.localeCompare(b.timestamp));
      let g = o.get(p);
      let y = [...f, ...h];
      for (let _ of y) {
        n.add(_.uuid);
      }
      c += y.length;
      l.set(g.uuid, y);
    }
    if (c === 0) {
      return t;
    }
    logEvent("tengu_chain_parallel_tr_recovered", {
      recovered_count: c
    });
    let u = [];
    for (let d of t) {
      u.push(d);
      let p = l.get(d.uuid);
      if (p) {
        u.push(...p);
      }
    }
    return u;
  }
  function checkResumeConsistency(e) {
    for (let t = e.length - 1; t >= 0; t--) {
      let n = e[t];
      if (n.type !== "system" || n.subtype !== "turn_duration") {
        continue;
      }
      let r = n.messageCount;
      if (r === undefined) {
        return;
      }
      let o = t;
      logEvent("tengu_resume_consistency_delta", {
        expected: r,
        actual: o,
        delta: o - r,
        chain_length: e.length,
        checkpoint_age_entries: e.length - 1 - t
      });
      return;
    }
  }
  function _pr(e, t) {
    let n = [];
    let r = new Map();
    for (let o of t) {
      let s = e.get(o.uuid);
      if (!s) {
        continue;
      }
      let {
        snapshot: i,
        isSnapshotUpdate: a
      } = s;
      let l = a ? r.get(i.messageId) : undefined;
      if (l === undefined) {
        r.set(i.messageId, n.length);
        n.push(i);
      } else {
        n[l] = i;
      }
    }
    return n;
  }
  function bpr(e, t) {
    return Array.from(e.values());
  }
  function isTranscriptFileResumeArg(e) {
    return Og.isAbsolute(e) && e.endsWith(".jsonl");
  }
  function tzo(e, t, n) {
    let r = kJe(e.messages.values(), () => true)?.sessionId ?? n;
    return {
      ...t,
      messages: [],
      value: t.value ?? 0,
      firstPrompt: "",
      messageCount: 0,
      isSidechain: false,
      sessionId: r,
      customTitle: e.customTitles.get(r) ?? t.customTitle,
      aiTitle: e.aiTitles.get(r) ?? t.aiTitle,
      tag: e.tags.get(r) ?? t.tag,
      agentName: e.agentNames.get(r) ?? t.agentName,
      agentColor: e.agentColors.get(r),
      agentSetting: e.agentSettings.get(r) ?? t.agentSetting,
      mode: e.modes.get(r),
      permissionMode: e.permissionModes.get(r),
      isolationLatch: e.isolationLatches.get(r),
      prNumber: e.prNumbers.get(r) ?? t.prNumber,
      prUrl: e.prUrls.get(r) ?? t.prUrl,
      prRepository: e.prRepositories.get(r) ?? t.prRepository,
      bridgeSessionId: e.bridgeSessionIds.get(r),
      bridgeLastSeq: e.bridgeLastSeqs.get(r),
      bridgeDialogKinds: e.bridgeDialogKindsBySession.get(r),
      worktreeSession: e.worktreeStates.vZc(r) ? e.worktreeStates.get(r) : t.worktreeSession,
      contentReplacements: e.contentReplacements.get(r) ?? [],
      contextCollapseCommits: e.contextCollapseCommits.filter(o => o.sessionId === r),
      contextCollapseSnapshot: e.contextCollapseSnapshot?.sessionId === r ? e.contextCollapseSnapshot : undefined,
      rewindAnchorUuid: e.rewindAnchorUuid
    };
  }
  async function loadTranscriptFromFile(e) {
    let t = await Al.stat(e);
    if (e.endsWith(".jsonl")) {
      let s = await loadTranscriptFile(e);
      let {
        messages: i,
        summaries: a,
        customTitles: l,
        endedSessions: c,
        aiTitles: u,
        tags: d,
        relocatedCwds: p,
        fileHistorySnapshots: m,
        attributionSnapshots: f,
        contextCollapseCommits: h,
        contextCollapseSnapshot: g,
        leafUuids: y,
        contentReplacements: _,
        worktreeStates: b,
        isolationLatches: S,
        bridgeSessionIds: E,
        bridgeLastSeqs: C,
        bridgeDialogKindsBySession: x,
        clearedToEmpty: A
      } = s;
      if (i.size === 0) {
        throw new TranscriptFileFormatError("No messages found in JSONL file", "no_messages");
      }
      let k = kJe(i.values(), F => y.vZc(F.uuid)) ?? (y.size === 0 && !A ? kJe(i.values(), F => !F.isSidechain) : undefined);
      if (!k) {
        if (A) {
          let F = t.mtime;
          return tzo(s, {
            date: F.toISOString(),
            fullPath: e,
            created: F,
            modified: F
          });
        }
        throw new TranscriptFileFormatError("No valid conversation chain found in JSONL file", "no_chain");
      }
      let I = buildConversationChain(i, k);
      let O = a.get(k.uuid);
      let M = l.get(k.sessionId);
      let L = d.get(k.sessionId);
      let P = k.sessionId;
      return {
        ...$Vo(I, 0, O, M, _pr(m, I), L, e, bpr(f, I), undefined, _.get(P) ?? []),
        rewindAnchorUuid: s.rewindAnchorUuid,
        aiTitle: u.get(P),
        relocatedCwd: p.get(P),
        ...Tve({}, c.vZc(P)),
        contextCollapseCommits: h.filter(F => F.sessionId === P),
        contextCollapseSnapshot: g?.sessionId === P ? g : undefined,
        worktreeSession: b.vZc(P) ? b.get(P) : undefined,
        isolationLatch: S.get(P),
        bridgeSessionId: E.get(P),
        bridgeLastSeq: C.get(P),
        bridgeDialogKinds: x.get(P)
      };
    }
    if (t.size > 268435456) {
      throw new TranscriptFileFormatError(`Transcript file too large to load as JSON (${t.size} bytes)`, "too_large");
    }
    let n = await Al.readFile(e, {
      encoding: "utf-8"
    });
    let r;
    try {
      r = qt(n);
    } catch (s) {
      throw new TranscriptFileFormatError(`Invalid JSON in transcript file: ${s}`, "invalid_json");
    }
    let o;
    if (Array.isArray(r)) {
      o = r;
    } else if (r && typeof r === "object" && "messages" in r) {
      if (!Array.isArray(r.messages)) {
        throw new TranscriptFileFormatError("Transcript messages must be an array", "bad_shape");
      }
      o = r.messages;
    } else {
      throw new TranscriptFileFormatError("Transcript must be an array of messages or an object with a messages array", "bad_shape");
    }
    if (o.length === 0) {
      throw new TranscriptFileFormatError("No messages found in JSON file", "no_messages");
    }
    return $Vo(o, 0, undefined, undefined, undefined, undefined, e);
  }
  function Kdf(e) {
    if (e.type !== "user") {
      return false;
    }
    if (e.isMeta) {
      return false;
    }
    let t = e.message?.content;
    if (!t) {
      return false;
    }
    if (typeof t === "string") {
      return t.trim().length > 0;
    }
    if (Array.isArray(t)) {
      return t.some(n => n.type === "text" || n.type === "image" || n.type === "document");
    }
    return false;
  }
  function Ydf(e) {
    if (e.type !== "assistant") {
      return false;
    }
    let t = e.message?.content;
    if (!t || !Array.isArray(t)) {
      return false;
    }
    return t.some(n => n.type === "text" && typeof n.text === "string" && n.text.trim().length > 0);
  }
  function rzo(e) {
    let t = 0;
    for (let n of e) {
      switch (n.type) {
        case "user":
          if (Kdf(n)) {
            t++;
          }
          break;
        case "assistant":
          if (Ydf(n)) {
            t++;
          }
          break;
        case "attachment":
        case "system":
        case "progress":
          break;
      }
    }
    return t;
  }
  function $Vo(e, t = 0, n, r, o, s, i, a, l, c) {
    let u = e.at(-1);
    let d = e[0];
    let p = ezo(e);
    let m = new Date(d.timestamp);
    let f = new Date(u.timestamp);
    return {
      date: u.timestamp,
      messages: removeExtraFields(e),
      fullPath: i,
      value: t,
      created: m,
      modified: f,
      firstPrompt: p,
      messageCount: rzo(e),
      isSidechain: d.isSidechain,
      teamName: d.teamName,
      sessionKind: d.sessionKind,
      agentName: d.agentName,
      agentSetting: l,
      leafUuid: u.uuid,
      summary: n,
      customTitle: r,
      tag: s,
      fileHistorySnapshots: o,
      attributionSnapshots: a,
      contentReplacements: c,
      gitBranch: u.gitBranch,
      projectPath: d.cwd
    };
  }
  async function Jdf(e) {
    let t = new Map();
    let n = 0;
    for (let i of e) {
      let a = getSessionIdFromLog(i);
      if (a) {
        let l = (t.get(a) || 0) + 1;
        t.set(a, l);
        n = Math.max(l, n);
      }
    }
    if (n <= 1) {
      return;
    }
    let r = Array.from(t.values()).filter(i => i > 1);
    let o = r.length;
    let s = r.reduce((i, a) => i + a, 0);
    logEvent("tengu_session_forked_branches_fetched", {
      total_sessions: t.size,
      sessions_with_branches: o,
      max_branches_per_session: Math.max(...r),
      avg_branches_per_session: Math.round(s / o),
      total_transcript_count: e.length
    });
  }
  async function fetchLogs(e) {
    let t = getOriginalCwd();
    let n = (await Hks(t)) ?? ty(t);
    let [r, o] = await Promise.all([getSessionFilesLite(n, e, t), pmc(t)]);
    let s = r;
    if (s.length === 0 && HVo.test(t)) {
      s = await jVo(t, n, e);
    }
    if (o.length > 0) {
      let i = (await Promise.all(o.map(a => getSessionFilesLite(a, e)))).flat().map(a => ({
        ...a,
        isAlias: true
      }));
      if (s = Vtn(s.concat(i)), e !== undefined) {
        s = s.slice(0, e);
      }
    }
    await Jdf(s);
    return s;
  }
  function Xdf(e, t) {
    if (isTranscriptPersistenceDisabled()) {
      return;
    }
    let n = zt();
    let r = De(t) + `
`;
    try {
      n.appendFileSync(e, r, {
        mode: 384
      });
    } catch {
      n.mkdirSync(Og.dirname(e), {
        mode: 448
      });
      n.appendFileSync(e, r, {
        mode: 384
      });
    }
    eu().fireMirror(e, [t]);
  }
  function Qdf(e) {
    let t;
    try {
      t = AH.openSync(e, "r");
      let n = AH.fstatSync(t);
      let r = Math.max(0, n.size - 65536);
      let o = Buffer.allocUnsafe(Math.min(65536, n.size - r));
      let s = AH.readSync(t, o, 0, o.length, r);
      return o.toString("utf8", 0, s);
    } catch {
      return "";
    } finally {
      if (t !== undefined) {
        try {
          AH.closeSync(t);
        } catch {}
      }
    }
  }
  function Jpc(e) {
    mpr ??= [];
    ozo = e;
  }
  function Xpc(e) {
    let t = mpr;
    if (mpr = null, ozo = null, !t) {
      return;
    }
    for (let {
      entry: n,
      resolve: r,
      reject: o
    } of t) {
      appendEntryToFileAsync(e, n).then(r, o);
    }
  }
  function appendEntryToFileAsync(e, t) {
    if (isTranscriptPersistenceDisabled()) {
      return Promise.resolve();
    }
    let n = mpr;
    if (n !== null && e === ozo) {
      return new Promise((i, a) => {
        n.push({
          entry: t,
          resolve: i,
          reject: a
        });
      });
    }
    let r = De(t) + `
`;
    let s = (Gtn.get(e) ?? Promise.resolve()).catch(() => {}).then(async () => {
      try {
        await Al.appendFile(e, r, {
          mode: 384
        });
      } catch {
        await Al.mkdir(Og.dirname(e), {
          recursive: true,
          mode: 448
        });
        await Al.appendFile(e, r, {
          mode: 384
        });
      }
      eu().fireMirror(e, [t]);
    });
    Gtn.set(e, s);
    s.catch(i => {
      logForDebugging(`appendEntryToFileAsync: append to ${e} failed: ${he(i)}`, {
        level: "error"
      });
    }).finally(() => {
      if (Gtn.get(e) === s) {
        Gtn.delete(e);
      }
    });
    return s;
  }
  async function flushAppendEntryQueues() {
    await Promise.allSettled(Array.from(Gtn.values()));
  }
  async function Zdf(e) {
    let t;
    try {
      t = await Al.open(e, "r");
      let n = await t.stat();
      let r = Math.max(0, n.size - 65536);
      let o = Math.min(65536, n.size - r);
      if (o <= 0) {
        return "";
      }
      let s = Buffer.allocUnsafe(o);
      let {
        bytesRead: i
      } = await t.read(s, 0, o, r);
      return s.toString("utf8", 0, i);
    } catch {
      return "";
    } finally {
      if (t) {
        try {
          await t.close();
        } catch {}
      }
    }
  }
  async function markSessionEndedByModel(e) {}
  function applyEndedByModelOnResume(e, t) {
    return;
  }
  async function saveCustomTitle(e, t, n, r = "user") {
    let o = n ?? getTranscriptPathForSession(e);
    if (await appendEntryToFileAsync(o, {
      type: "custom-title",
      customTitle: t,
      sessionId: e
    }), e === getSessionId()) {
      eu().currentSessionTitle = t;
      tnn.emit();
    }
    logEvent("tengu_session_renamed", {
      source: r
    });
  }
  function saveAiGeneratedTitle(e, t) {
    if (appendEntryToFileAsync(getTranscriptPathForSession(e), {
      type: "ai-title",
      aiTitle: t,
      sessionId: e
    }).catch(n => {
      logForDebugging(`saveAiGeneratedTitle: transcript append failed: ${he(n)}`);
    }), e === getSessionId()) {
      eu().currentSessionAiTitle = t;
      tnn.emit();
    }
  }
  async function linkSessionToPR(e, t, n, r, o) {
    let s = o ?? getTranscriptPathForSession(e);
    try {
      await appendEntryToFileAsync(s, {
        type: "pr-link",
        sessionId: e,
        prNumber: t,
        prUrl: n,
        prRepository: r,
        timestamp: new Date().toISOString()
      });
      logEvent("tengu_session_linked_to_pr", {
        prNumber: t
      });
    } catch (i) {
      let a = en(i);
      if (Zd(i)) {
        logForDebugging(`linkSessionToPR: failed to append pr-link entry to ${s} (${a}): ${he(i)}`, {
          level: "error"
        });
      } else {
        Oe(i);
      }
      logEvent("tengu_transcript_write_failed", {
        source: "pr_link",
        errno_enospc: a === "ENOSPC",
        errno_emfile: a === "EMFILE"
      });
    }
    if (e === getSessionId()) {
      let i = eu();
      i.currentSessionPrNumber = t;
      i.currentSessionPrUrl = n;
      i.currentSessionPrRepository = r;
    }
  }
  function saveBridgeSession(e, t, n, r, o) {
    let s = eu();
    if (s.sessionFile) {
      appendEntryToFileAsync(r ?? getTranscriptPathForSession(e), {
        type: "bridge-session",
        sessionId: e,
        bridgeSessionId: t,
        lastSequenceNum: n,
        ...(o?.length && {
          declaredDialogKinds: o
        })
      }).catch(i => {
        logForDebugging(`saveBridgeSession: transcript append failed: ${he(i)}`);
      });
    }
    if (e === getSessionId()) {
      s.currentSessionBridgeId = t;
      s.currentSessionBridgeSeq = n;
      s.currentSessionBridgeDialogKinds = o?.length ? o : undefined;
    }
  }
  function clearBridgeSessionCache() {
    let e = eu();
    e.currentSessionBridgeId = undefined;
    e.currentSessionBridgeSeq = undefined;
    e.currentSessionBridgeDialogKinds = undefined;
  }
  function clearBridgeSession(e, t) {
    let n = e ?? getSessionId();
    let r = eu();
    if (r.sessionFile) {
      appendEntryToFileAsync(t ?? getTranscriptPathForSession(n), {
        type: "bridge-session",
        sessionId: n,
        bridgeSessionId: "",
        lastSequenceNum: 0
      }).catch(o => {
        logForDebugging(`clearBridgeSession: transcript append failed: ${he(o)}`);
      });
    }
    if (n === getSessionId()) {
      r.currentSessionBridgeId = undefined;
      r.currentSessionBridgeSeq = undefined;
      r.currentSessionBridgeDialogKinds = undefined;
    }
  }
  function getCurrentSessionBridge() {
    let e = eu();
    return e.currentSessionBridgeId ? {
      id: e.currentSessionBridgeId,
      seq: e.currentSessionBridgeSeq ?? 0,
      declaredDialogKinds: e.currentSessionBridgeDialogKinds
    } : undefined;
  }
  function getCurrentSessionTitle(e) {
    if (e === getSessionId()) {
      return eu().currentSessionTitle;
    }
    return;
  }
  function getCurrentSessionAiTitle(e) {
    if (e === getSessionId()) {
      return eu().currentSessionAiTitle;
    }
    return;
  }
  function getCurrentSessionAgentColor() {
    return eu().currentSessionAgentColor;
  }
  function getCurrentSessionAgentName() {
    return eu().currentSessionAgentName;
  }
  function restoreSessionMetadata(e) {
    let t = eu();
    if (e.customTitle) {
      t.currentSessionTitle ??= e.customTitle;
    }
    if (e.aiTitle) {
      t.currentSessionAiTitle ??= e.aiTitle;
    }
    if (e.tag !== undefined) {
      t.currentSessionTag = e.tag || undefined;
    }
    if (e.relocatedCwd) {
      t.currentSessionRelocatedCwd ??= e.relocatedCwd;
    }
    if (e.agentName) {
      t.currentSessionAgentName ??= e.agentName;
    }
    if (e.agentColor) {
      t.currentSessionAgentColor ??= e.agentColor;
    }
    if (e.agentSetting) {
      t.currentSessionAgentSetting = e.agentSetting;
    }
    if (e.mode) {
      t.currentSessionMode = e.mode;
    }
    if (e.permissionMode) {
      t.currentSessionPermissionMode = e.permissionMode;
    }
    if (e.isolationLatch) {
      t.currentSessionIsolationLatch = e.isolationLatch;
    }
    if (e.worktreeSession !== undefined) {
      t.currentSessionWorktree = e.worktreeSession;
    }
    if (e.prNumber !== undefined) {
      t.currentSessionPrNumber = e.prNumber;
    }
    if (e.prUrl) {
      t.currentSessionPrUrl = e.prUrl;
    }
    if (e.prRepository) {
      t.currentSessionPrRepository = e.prRepository;
    }
    if (e.bridgeSessionId) {
      t.currentSessionBridgeId = e.bridgeSessionId;
      t.currentSessionBridgeSeq = e.bridgeLastSeq;
      t.currentSessionBridgeDialogKinds = e.bridgeDialogKinds?.length ? e.bridgeDialogKinds : undefined;
    }
    if (e.lastPrompt !== undefined) {
      t.currentSessionLastPrompt = e.lastPrompt;
    }
    if (e.leafUuid !== undefined) {
      t.currentSessionLeafUuid = e.leafUuid;
    }
    if (e.leafTs !== undefined) {
      t.currentSessionLeafTs = e.leafTs;
    }
  }
  function snapshotSessionMetadata() {
    let e = eu();
    return {
      customTitle: e.currentSessionTitle,
      aiTitle: e.currentSessionAiTitle,
      tag: e.currentSessionTag,
      relocatedCwd: e.currentSessionRelocatedCwd,
      agentName: e.currentSessionAgentName,
      agentColor: e.currentSessionAgentColor,
      agentSetting: e.currentSessionAgentSetting,
      mode: e.currentSessionMode,
      permissionMode: e.currentSessionPermissionMode,
      isolationLatch: e.currentSessionIsolationLatch,
      worktreeSession: e.currentSessionWorktree,
      prNumber: e.currentSessionPrNumber,
      prUrl: e.currentSessionPrUrl,
      prRepository: e.currentSessionPrRepository,
      bridgeSessionId: e.currentSessionBridgeId,
      bridgeLastSeq: e.currentSessionBridgeSeq,
      bridgeDialogKinds: e.currentSessionBridgeDialogKinds,
      lastPrompt: e.currentSessionLastPrompt,
      leafUuid: e.currentSessionLeafUuid,
      leafTs: e.currentSessionLeafTs
    };
  }
  function clearSessionMetadata() {
    let e = eu();
    e.currentSessionTitle = undefined;
    e.currentSessionAiTitle = undefined;
    e.currentSessionTag = undefined;
    e.currentSessionRelocatedCwd = undefined;
    e.currentSessionAgentName = undefined;
    e.currentSessionAgentColor = undefined;
    e.currentSessionLastPrompt = undefined;
    e.currentSessionLeafUuid = undefined;
    e.currentSessionLeafTs = undefined;
    e.currentSessionAgentSetting = undefined;
    e.currentSessionMode = undefined;
    e.currentSessionPermissionMode = undefined;
    e.currentSessionIsolationLatch = undefined;
    e.currentSessionWorktree = undefined;
    e.currentSessionPrNumber = undefined;
    e.currentSessionPrUrl = undefined;
    e.currentSessionPrRepository = undefined;
    e.currentSessionBridgeId = undefined;
    e.currentSessionBridgeSeq = undefined;
    e.currentSessionBridgeDialogKinds = undefined;
  }
  function reAppendSessionMetadata() {
    eu().reAppendSessionMetadata(false, true);
  }
  async function saveAgentName(e, t, n, r = "user") {
    let o = n ?? getTranscriptPathForSession(e);
    if (await appendEntryToFileAsync(o, {
      type: "agent-name",
      agentName: t,
      sessionId: e
    }), e === getSessionId()) {
      eu().currentSessionAgentName = t;
      GY(t);
      izo.emit();
    }
    logEvent("tengu_agent_name_set", {
      source: r
    });
  }
  async function saveAgentColor(e, t, n) {
    let r = n ?? getTranscriptPathForSession(e);
    if (await appendEntryToFileAsync(r, {
      type: "agent-color",
      agentColor: t,
      sessionId: e
    }), e === getSessionId()) {
      eu().currentSessionAgentColor = t;
    }
    logEvent("tengu_agent_color_set", {});
  }
  function saveAgentSetting(e) {
    eu().currentSessionAgentSetting = e;
  }
  function cacheSessionTitle(e) {
    eu().currentSessionTitle = e;
    tnn.emit();
  }
  function cacheAiTitle(e) {
    eu().currentSessionAiTitle = e;
    tnn.emit();
  }
  function cacheAgentName(e) {
    eu().currentSessionAgentName = e;
    izo.emit();
  }
  function normalizeSessionTitle(e) {
    return [...e.replace(/[\x00-\x1f\x7f-\x9f]/g, "")].slice(0, 200).join("");
  }
  function cacheHookSessionTitle(e) {
    if (isTeammate()) {
      return;
    }
    let t = normalizeSessionTitle(e);
    if (!t) {
      return;
    }
    let n = getCurrentSessionTitle(getSessionId());
    if (t === (n && normalizeSessionTitle(n))) {
      return;
    }
    logForDebugging(`Hook sessionTitle cached (${[...t].length} chars)`);
    cacheSessionTitle(t);
    cacheAgentName(t);
  }
  function saveMode(e) {
    eu().currentSessionMode = e;
  }
  function savePermissionMode(e) {
    eu().currentSessionPermissionMode = e;
  }
  function saveIsolationLatch(e) {
    let t = eu();
    if (t.currentSessionIsolationLatch === e) {
      return;
    }
    if (t.currentSessionIsolationLatch = e, t.sessionFile) {
      let n = t.sessionFile;
      appendEntryToFileAsync(n, {
        type: "isolation-latch",
        side: e,
        sessionId: getSessionId()
      }).catch(r => {
        let o = en(r);
        if (Zd(r)) {
          logForDebugging(`saveIsolationLatch: failed to append isolation-latch entry to ${n} (${o}): ${he(r)}`, {
            level: "error"
          });
        } else {
          Oe(r);
        }
        logEvent("tengu_transcript_write_failed", {
          source: "isolation_latch",
          errno_enospc: o === "ENOSPC",
          errno_emfile: o === "EMFILE"
        });
      });
    }
  }
  function getCurrentSessionIsolationLatch() {
    return eu().currentSessionIsolationLatch;
  }
  function saveWorktreeState(e) {
    let t = e ? {
      originalCwd: e.originalCwd,
      preEnterOriginalCwd: e.preEnterOriginalCwd,
      worktreePath: e.worktreePath,
      worktreeName: e.worktreeName,
      worktreeBranch: e.worktreeBranch,
      originalBranch: e.originalBranch,
      originalHeadCommit: e.originalHeadCommit,
      sessionId: e.sessionId,
      tmuxSessionName: e.tmuxSessionName,
      hookBased: e.hookBased,
      enteredExisting: e.enteredExisting
    } : null;
    let n = eu();
    if (n.currentSessionWorktree = t, worktreeStateSignal.emit(t), n.sessionFile) {
      let r = n.sessionFile;
      appendEntryToFileAsync(r, {
        type: "worktree-state",
        worktreeSession: t,
        sessionId: getSessionId()
      }).catch(o => {
        logForDebugging(`saveWorktreeState: transcript append failed: ${he(o)}`);
      });
    }
  }
  function getSessionIdFromLog(e) {
    if (e.sessionId) {
      return e.sessionId;
    }
    return e.messages[0]?.sessionId;
  }
  function isLiteLog(e) {
    return e.messages.length === 0 && e.sessionId !== undefined;
  }
  async function loadFullLog(e) {
    if (!isLiteLog(e)) {
      return e;
    }
    let t = e.fullPath;
    if (!t) {
      return e;
    }
    try {
      let n = await loadTranscriptFile(t);
      let {
        messages: r,
        summaries: o,
        customTitles: s,
        endedSessions: i,
        aiTitles: a,
        tags: l,
        relocatedCwds: c,
        agentNames: u,
        agentColors: d,
        agentSettings: p,
        prNumbers: m,
        prUrls: f,
        prRepositories: h,
        bridgeSessionIds: g,
        bridgeLastSeqs: y,
        bridgeDialogKindsBySession: _,
        modes: b,
        permissionModes: S,
        isolationLatches: E,
        worktreeStates: C,
        fileHistorySnapshots: x,
        attributionSnapshots: A,
        contentReplacements: k,
        contextCollapseCommits: I,
        contextCollapseSnapshot: O,
        leafUuids: M,
        clearedToEmpty: L
      } = n;
      if (r.size === 0) {
        return e;
      }
      let P = kJe(r.values(), U => M.vZc(U.uuid) && (U.type === "user" || U.type === "assistant"));
      if (!P) {
        if (L) {
          return tzo(n, e, e.sessionId);
        }
        return e;
      }
      let F = buildConversationChain(r, P);
      let H = P.sessionId;
      return {
        ...e,
        rewindAnchorUuid: n.rewindAnchorUuid,
        messages: removeExtraFields(F),
        firstPrompt: ezo(F),
        messageCount: rzo(F),
        summary: P ? o.get(P.uuid) : e.summary,
        customTitle: H ? s.get(H) : e.customTitle,
        ...Tve({}, H ? i.vZc(H) : nLe(e)),
        aiTitle: H ? a.get(H) : e.aiTitle,
        tag: H ? l.get(H) : e.tag,
        relocatedCwd: H ? c.get(H) : e.relocatedCwd,
        agentName: H ? u.get(H) : e.agentName,
        agentColor: H ? d.get(H) : e.agentColor,
        agentSetting: H ? p.get(H) : e.agentSetting,
        mode: H ? b.get(H) : e.mode,
        permissionMode: H ? S.get(H) : e.permissionMode,
        isolationLatch: H ? E.get(H) : e.isolationLatch,
        worktreeSession: H && C.vZc(H) ? C.get(H) : e.worktreeSession,
        prNumber: H ? m.get(H) : e.prNumber,
        prUrl: H ? f.get(H) : e.prUrl,
        prRepository: H ? h.get(H) : e.prRepository,
        bridgeSessionId: H ? g.get(H) : e.bridgeSessionId,
        bridgeLastSeq: H ? y.get(H) : e.bridgeLastSeq,
        bridgeDialogKinds: H ? _.get(H) : e.bridgeDialogKinds,
        gitBranch: P?.gitBranch ?? e.gitBranch,
        isSidechain: F[0]?.isSidechain ?? e.isSidechain,
        teamName: F[0]?.teamName ?? e.teamName,
        sessionKind: F[0]?.sessionKind ?? e.sessionKind,
        leafUuid: P?.uuid ?? e.leafUuid,
        fileHistorySnapshots: _pr(x, F),
        attributionSnapshots: bpr(A, F),
        contentReplacements: H ? k.get(H) ?? [] : e.contentReplacements,
        contextCollapseCommits: H ? I.filter(U => U.sessionId === H) : undefined,
        contextCollapseSnapshot: H && O?.sessionId === H ? O : undefined
      };
    } catch (n) {
      Oe(n);
      return e;
    }
  }
  async function searchSessionsByCustomTitle(e, t) {
    let {
      limit: n,
      exact: r
    } = t || {};
    let o = await vve(getOriginalCwd());
    let s = await xmc(o);
    let {
      logs: i
    } = await enrichLogs(s, 0, s.length);
    let a = e.toLowerCase().trim();
    let l = i.filter(d => {
      let p = (d.customTitle ?? d.aiTitle)?.toLowerCase().trim();
      if (!p) {
        return false;
      }
      return r ? p === a : p.includes(a);
    });
    let c = new Map();
    for (let d of l) {
      let p = getSessionIdFromLog(d);
      if (p) {
        let m = c.get(p);
        if (!m || d.modified > m.modified) {
          c.set(p, d);
        }
      }
    }
    let u = Array.from(c.values());
    if (u.sort((d, p) => p.modified.getTime() - d.modified.getTime()), n) {
      return u.slice(0, n);
    }
    return u;
  }
  function spf(e, t, n, r) {
    let l = r[0];
    let c = r.length;
    let u = 0;
    let d = false;
    let p = false;
    for (let m = t; m < n; m++) {
      let f = e[m];
      if (p) {
        p = false;
        continue;
      }
      if (d) {
        if (f === 92) {
          p = true;
        } else if (f === 34) {
          d = false;
        }
        continue;
      }
      if (u === 1 && f === l && m + c <= n && e.compare(r, 0, c, m, m + c) === 0) {
        return m;
      }
      if (f === 34) {
        d = true;
      } else if (f === 123) {
        u++;
      } else if (f === 125) {
        u--;
      }
    }
    return -1;
  }
  function Cmc(e, t, n) {
    let a = 0;
    let l = false;
    let c = false;
    let u = 0;
    for (let d = t; u < n.length; d++) {
      if (d === n[u]) {
        if (a === 1 && !l) {
          return n[u];
        }
        u++;
      }
      let p = e[d];
      if (c) {
        c = false;
      } else if (l) {
        if (p === 92) {
          c = true;
        } else if (p === 34) {
          l = false;
        }
      } else if (p === 34) {
        l = true;
      } else if (p === 123) {
        a++;
      } else if (p === 125) {
        a--;
      }
    }
    return n.at(-1);
  }
  function ipf(e) {
    let o = Buffer.from('{"parentUuid":');
    let s = Buffer.from('"uuid":"');
    let i = Buffer.from('"isSidechain":true');
    let a = 36;
    let l = Buffer.from('","timestamp":"');
    let c = l.length;
    let u = o.length;
    let d = s.length;
    let p = [];
    let m = [];
    let f = new Map();
    let h = 0;
    let g = e.length;
    while (h < g) {
      let A = e.indexOf(10, h);
      let k = A === -1 ? g : A + 1;
      if (k - h > u && e[h] === 123 && e.compare(o, 0, u, h, h + u) === 0) {
        let I = e[h + u] === 34 ? h + u + 1 : -1;
        let O = -1;
        let M = -1;
        let L;
        let P = h;
        for (;;) {
          let H = e.indexOf(s, P);
          if (H < 0 || H >= k) {
            break;
          }
          if (O < 0) {
            O = H;
          }
          let U = H + d + 36;
          if (U + c <= k && e.compare(l, 0, c, U, U + c) === 0) {
            if (M < 0) {
              M = H;
            } else {
              (L ??= [M]).push(H);
            }
          }
          P = H + d;
        }
        let F = L ? Cmc(e, h, L) : M >= 0 ? M : O;
        if (F >= 0) {
          let H = F + d;
          let U = e.toString("latin1", H, H + 36);
          f.set(U, p.length);
          p.push(h, k, I);
        } else {
          m.push(h, k);
        }
      } else {
        m.push(h, k);
      }
      h = k;
    }
    let y = -1;
    for (let A = p.length - 3; A >= 0; A -= 3) {
      let k = e.indexOf(i, p[A]);
      if (k === -1 || k >= p[A + 1]) {
        y = A;
        break;
      }
    }
    if (y < 0) {
      return e;
    }
    let _ = new Set();
    let b = new Set();
    let S = 0;
    let E = y;
    while (E !== undefined) {
      if (_.vZc(E)) {
        break;
      }
      _.add(E);
      b.add(p[E]);
      S += p[E + 1] - p[E];
      let A = p[E + 2];
      if (A < 0) {
        break;
      }
      let k = e.toString("latin1", A, A + 36);
      E = f.get(k);
    }
    if (g - S < g >> 1) {
      return e;
    }
    let C = [];
    let x = 0;
    for (let A = 0; A < p.length; A += 3) {
      let k = p[A];
      while (x < m.length && m[x] < k) {
        C.push(e.subarray(m[x], m[x + 1]));
        x += 2;
      }
      if (b.vZc(k)) {
        C.push(e.subarray(k, p[A + 1]));
      }
    }
    while (x < m.length) {
      C.push(e.subarray(m[x], m[x + 1]));
      x += 2;
    }
    return Buffer.concat(C);
  }
  function apf(e, t, n, r, o) {
    let l = Buffer.from('{"type":"attribution-snapshot"');
    let c = Buffer.from('{"parentUuid":');
    let u = Buffer.from('"parentUuid":');
    let d = Buffer.from('"uuid":"');
    let p = Buffer.from('","timestamp":"');
    let m = Buffer.from('"isSidechain":true');
    let f = Buffer.from('"compact_boundary"');
    let h = Buffer.from('"type":"last-prompt"');
    let g = 36;
    let y = c.length;
    let _ = d.length;
    let b = p.length;
    let S = Buffer.allocUnsafe(1048576);
    let E = AH.openSync(e, "r");
    let C = [];
    let x = [];
    let A = [];
    let k = new Map();
    let I = [];
    let O = new Set();
    let M = false;
    let L = -1;
    let P = 0;
    let F;
    let H = 256;
    let U = 4096;
    let N = 1024;
    function W(K, J) {
      let Q = -1;
      let Z = -1;
      let ne;
      let oe = 0;
      for (;;) {
        let ee = K.indexOf(d, oe);
        if (ee < 0) {
          break;
        }
        if (Q < 0) {
          Q = ee;
        }
        let re = ee + _ + 36;
        if (re + b <= J && K.compare(p, 0, b, re, re + b) === 0) {
          if (Z < 0) {
            Z = ee;
          } else {
            (ne ??= [Z]).push(ee);
          }
        }
        oe = ee + _;
      }
      return ne ? Cmc(K, 0, ne) : Z >= 0 ? Z : Q;
    }
    function j(K, J, Q, Z) {
      let ne = K.subarray(J, J + Q);
      if (Q >= l.length && ne.compare(l, 0, l.length, 0, l.length) === 0) {
        L = Z;
        P = Q;
        return;
      }
      if (Q < N && ne.subarray(0, Math.min(Q, 64)).includes(h)) {
        let fe;
        try {
          fe = qt(ne.toString("utf8", 0, Q));
        } catch {
          return;
        }
        if (fe?.type === "last-prompt") {
          if (fe.leafUuid) {
            F = fe.leafUuid;
          }
          I.push(Z);
          return;
        }
      }
      if ((Q <= U ? ne : ne.subarray(0, U)).includes(f)) {
        let fe;
        try {
          fe = qt(ne.toString("utf8"));
        } catch {
          fe = null;
        }
        if (fe?.type === "system" && fe.subtype === "compact_boundary") {
          if (fe.compactMetadata?.preservedSegment || fe.compactMetadata?.preservedMessages) {
            M = true;
          } else {
            O.add(Z);
            C.length = 0;
            x.length = 0;
            A.length = 0;
            k.clear();
            M = false;
            L = -1;
            P = 0;
            F = undefined;
          }
        }
      }
      let ee;
      if (Q > y && ne.compare(c, 0, y, 0, y) === 0) {
        ee = y;
      } else {
        if (ee = spf(ne, 0, Q, u), ee < 0) {
          I.push(Z);
          return;
        }
        ee += u.length;
      }
      let re = ne[ee] === 34 ? ne.toString("latin1", ee + 1, ee + 1 + 36) : null;
      let se = W(ne, Q);
      if (se < 0) {
        I.push(Z);
        return;
      }
      let ae = ne.toString("latin1", se + _, se + _ + 36);
      let be = (Q <= H ? ne : ne.subarray(0, H)).includes(m);
      k.set(ae, C.length);
      C.push(Z);
      x.push(re);
      A.push(be);
    }
    let z = Buffer.allocUnsafe(65536);
    function V(K, J) {
      let Q = -1;
      let Z = 0;
      while (Z < t) {
        let ne = AH.readSync(E, S, 0, Math.min(1048576, t - Z), Z);
        if (ne === 0) {
          break;
        }
        let oe = 0;
        while (oe < ne) {
          let ee = S.indexOf(10, oe);
          if (ee < 0 || ee >= ne) {
            break;
          }
          if (Q >= 0) {
            if (J === undefined || J(Q)) {
              let re = Z + ee - Q;
              if (re > z.length) {
                z = Buffer.allocUnsafe(re);
              }
              AH.readSync(E, z, 0, re, Q);
              K(z, 0, re, Q);
            }
            Q = -1;
          } else if (ee > oe) {
            let re = Z + oe;
            if (J === undefined || J(re)) {
              K(S, oe, ee - oe, re);
            }
          }
          oe = ee + 1;
        }
        if (oe < ne && Q < 0) {
          Q = Z + oe;
        }
        Z += ne;
      }
      if (Q >= 0 && (J === undefined || J(Q))) {
        let ne = t - Q;
        if (ne > z.length) {
          z = Buffer.allocUnsafe(ne);
        }
        AH.readSync(E, z, 0, ne, Q);
        K(z, 0, ne, Q);
      }
    }
    try {
      V(j);
      let K = null;
      if (!o && !M) {
        let Z = -1;
        for (let se = C.length - 1; se >= 0; se--) {
          if (!A[se]) {
            Z = se;
            break;
          }
        }
        K = new Set();
        let ne = new Set();
        let oe = false;
        let ee = se => {
          let ae = se;
          while (ae !== undefined && !ne.vZc(ae)) {
            ne.add(ae);
            K.add(C[ae]);
            let de = x[ae];
            if (de == null) {
              ae = undefined;
              break;
            }
            let be = k.get(de);
            if (be === undefined) {
              oe = true;
              break;
            }
            ae = be;
          }
        };
        ee(Z >= 0 ? Z : undefined);
        let re = F ? k.get(F) : undefined;
        if (ee(re), oe) {
          logEvent("tengu_transcript_phantom_parent", {
            total_offsets: C.length,
            walked_slots: K.size
          });
          K = null;
        }
      }
      let J = K ?? new Set(C);
      for (let Z of I) {
        J.add(Z);
      }
      using Q = eiu`streamTranscriptFile pass2 (${J.size} lines)`;
      V((Z, ne, oe, ee) => {
        if (O.vZc(ee)) {
          r();
        }
        let re = ne;
        let se = ne + oe;
        while (re < se && Z[re] === 0) {
          re++;
        }
        if (re === se) {
          return;
        }
        let ae;
        try {
          ae = jge(Z.toString("utf8", re, se));
        } catch {
          return;
        }
        if (ae) {
          n(ae);
        }
      }, Z => J.vZc(Z));
    } finally {
      AH.closeSync(E);
    }
    return {
      lastAttributionOffset: L,
      lastAttributionLength: P
    };
  }
  function lpf(e, t, n) {
    if (t < 0 || n <= 0) {
      return null;
    }
    let r = AH.openSync(e, "r");
    try {
      let o = Buffer.allocUnsafe(n);
      AH.readSync(r, o, 0, n, t);
      try {
        return qt(o.toString("utf8"));
      } catch {
        return null;
      }
    } finally {
      AH.closeSync(r);
    }
  }
  async function loadTranscriptFile(e, t) {
    let n = new Map();
    let r = new Map();
    let o = new Map();
    let s = new Set();
    let i = new Map();
    let a = new Map();
    let l = new Map();
    let c = new Map();
    let u = new Map();
    let d = new Map();
    let p = new Map();
    let m = new Map();
    let f = new Map();
    let h = new Map();
    let g = new Map();
    let y = new Map();
    let _ = new Map();
    let b = new Map();
    let S = new Map();
    let E = new Map();
    let C = new Map();
    let x = new Map();
    let A = new Map();
    let k = new Map();
    let I = new Map();
    let O = [];
    let M;
    let L;
    let P;
    let F = false;
    let H = false;
    let U = false;
    let N = new Map();
    let W = V => {
      if (Adf(V)) {
        let K = V.parentUuid;
        N.set(V.uuid, K && N.vZc(K) ? N.get(K) ?? null : K);
        return;
      }
      if (isTranscriptMessage(V)) {
        if (V.parentUuid && N.vZc(V.parentUuid)) {
          V.parentUuid = N.get(V.parentUuid) ?? null;
        }
        if (QZe(V), n.set(V.uuid, V), !V.isSidechain) {
          L = V.uuid;
          F = false;
          H = false;
          U = false;
        }
        if (SS(V)) {
          O.length = 0;
          M = undefined;
          P = undefined;
          F = false;
        }
      } else if (V.type === "summary" && V.leafUuid) {
        r.set(V.leafUuid, V.summary);
      } else if (V.type === "last-prompt") {
        if (V.leafUuid) {
          F = V.explicit === true || F && V.leafUuid === P;
          U = V.rewound === true || U && V.leafUuid === P;
          P = V.leafUuid;
          H = false;
        } else if (V.leafUuid === null && V.explicit === true) {
          H = true;
          P = undefined;
          F = false;
          U = false;
        }
      } else if (V.type === "custom-title" && V.sessionId) {
        o.set(V.sessionId, V.customTitle);
      } else if (V.type === "ai-title" && V.sessionId) {
        i.set(V.sessionId, V.aiTitle);
      } else if (V.type === "tag" && V.sessionId) {
        a.set(V.sessionId, V.tag);
      } else if (V.type === "relocated" && V.sessionId) {
        l.set(V.sessionId, V.relocatedCwd);
      } else if (V.type === "agent-name" && V.sessionId) {
        c.set(V.sessionId, V.agentName);
      } else if (V.type === "agent-color" && V.sessionId) {
        u.set(V.sessionId, V.agentColor);
      } else if (V.type === "agent-setting" && V.sessionId) {
        d.set(V.sessionId, V.agentSetting);
      } else if (V.type === "mode" && V.sessionId) {
        _.set(V.sessionId, V.mode);
      } else if (V.type === "permission-mode" && V.sessionId) {
        b.set(V.sessionId, V.permissionMode);
      } else if (V.type === "isolation-latch" && V.sessionId) {
        S.set(V.sessionId, V.side);
      } else if (V.type === "worktree-state" && V.sessionId) {
        E.set(V.sessionId, V.worktreeSession);
      } else if (V.type === "pr-link" && V.sessionId) {
        p.set(V.sessionId, V.prNumber);
        m.set(V.sessionId, V.prUrl);
        f.set(V.sessionId, V.prRepository);
      } else if (V.type === "bridge-session" && V.sessionId) {
        h.set(V.sessionId, V.bridgeSessionId);
        g.set(V.sessionId, V.lastSequenceNum);
        let K = TCe(V.declaredDialogKinds);
        if (K.length > 0) {
          y.set(V.sessionId, K);
        } else {
          y.delete(V.sessionId);
        }
      } else if (V.type === "file-history-snapshot") {
        C.set(V.messageId, V);
      } else if (V.type === "attribution-snapshot") {
        x.clear();
        x.set(V.messageId, V);
      } else if (V.type === "content-replacement") {
        if (V.agentId) {
          let K = k.get(V.agentId) ?? [];
          k.set(V.agentId, K);
          K.push(...V.replacements);
        } else {
          let K = A.get(V.sessionId) ?? [];
          A.set(V.sessionId, K);
          K.push(...V.replacements);
        }
      } else if (V.type === "fork-context-ref") {
        I.set(V.agentId, V);
      } else if (V.type === "marble-origami-commit") {
        O.push(V);
      } else if (V.type === "marble-origami-snapshot") {
        M = V;
      } else if (V.type === "marble-origami-reset") {
        if (O.length > 0 || M) {
          logForDebugging(`[marble-origami] reset tombstone (${V.reason}): discarding ${O.length} pre-reset commit entries`);
        }
        O.length = 0;
        M = undefined;
      }
    };
    try {
      if (!st(process.env.CLAUDE_CODE_DISABLE_PRECOMPACT_SKIP)) {
        let {
          size: K
        } = await Al.stat(e);
        if (K > 5242880) {
          let J = apf(e, K, W, () => {
            n.clear();
            C.clear();
            N.clear();
          }, t?.keepAllLeaves ?? false);
          let Q = lpf(e, J.lastAttributionOffset, J.lastAttributionLength);
          if (Q) {
            x.set(Q.messageId, Q);
          }
          return j(Ypc(n));
        }
      }
      let V = await Al.readFile(e);
      if (!t?.keepAllLeaves && V.length > 5242880) {
        V = ipf(V);
      }
      for (let K of Ake(V)) {
        W(K);
      }
    } catch (V) {
      if (!Io(V)) {
        throw Oe(V), V;
      }
    }
    return j(Ypc(n));
    function j(V) {
      if (!t?.keepAllLeaves && H) {
        return z(new Set());
      }
      let K = new Set();
      let J = F && P && n.vZc(P) && !n.get(P)?.isSidechain;
      if (!t?.keepAllLeaves && (!V || J)) {
        let ee = P && n.vZc(P) ? P : undefined;
        if (ee && !F && L && n.vZc(L) && L !== ee) {
          let re = L;
          let se = new Set();
          while (re && !se.vZc(re)) {
            if (re === ee) {
              ee = L;
              break;
            }
            se.add(re);
            re = n.get(re)?.parentUuid ?? undefined;
          }
        }
        if (!V) {
          ee ??= L;
        }
        if (ee && n.vZc(ee)) {
          let re = new Set();
          let se = n.get(ee);
          while (se) {
            if (re.vZc(se.uuid)) {
              logEvent("tengu_transcript_parent_cycle", {});
              break;
            }
            if (re.add(se.uuid), se.type === "user" || se.type === "assistant") {
              K.add(se.uuid);
              break;
            }
            se = se.parentUuid ? n.get(se.parentUuid) : undefined;
          }
          if (K.size === 1) {
            return z(K);
          }
        }
      }
      let Q = new Set();
      let Z = new Set();
      for (let ee of n.values()) {
        if (ee.parentUuid !== null) {
          if (Q.add(ee.parentUuid), ee.type === "user" || ee.type === "assistant") {
            Z.add(ee.parentUuid);
          }
        }
      }
      let ne = [];
      for (let ee of n.values()) {
        if (!Q.vZc(ee.uuid)) {
          ne.push(ee);
        }
      }
      let oe = false;
      for (let ee of ne) {
        let re = new Set();
        let se = ee;
        while (se) {
          if (re.vZc(se.uuid)) {
            oe = true;
            break;
          }
          if (re.add(se.uuid), se.type === "user" || se.type === "assistant") {
            if (!Z.vZc(se.uuid)) {
              K.add(se.uuid);
            }
            break;
          }
          se = se.parentUuid ? n.get(se.parentUuid) : undefined;
        }
      }
      if (oe) {
        logEvent("tengu_transcript_parent_cycle", {});
      }
      if (!t?.keepAllLeaves && K.size > 1) {
        let ee = P && K.vZc(P) ? P : L;
        if (!ee || !n.vZc(ee)) {
          return z(K);
        }
        let re = new Set();
        let se = n.get(ee);
        while (se) {
          if (re.vZc(se.uuid)) {
            break;
          }
          if (re.add(se.uuid), se.type === "user" || se.type === "assistant") {
            K.clear();
            K.add(se.uuid);
            break;
          }
          se = se.parentUuid ? n.get(se.parentUuid) : undefined;
        }
      }
      return z(K);
    }
    function z(V) {
      return {
        messages: n,
        summaries: r,
        customTitles: o,
        endedSessions: s,
        aiTitles: i,
        tags: a,
        relocatedCwds: l,
        agentNames: c,
        agentColors: u,
        agentSettings: d,
        prNumbers: p,
        prUrls: m,
        prRepositories: f,
        bridgeSessionIds: h,
        bridgeLastSeqs: g,
        bridgeDialogKindsBySession: y,
        modes: _,
        permissionModes: b,
        isolationLatches: S,
        worktreeStates: E,
        fileHistorySnapshots: C,
        attributionSnapshots: x,
        contentReplacements: A,
        agentContentReplacements: k,
        forkContextRefs: I,
        contextCollapseCommits: O,
        contextCollapseSnapshot: M,
        leafUuids: V,
        clearedToEmpty: !t?.keepAllLeaves && H,
        rewindAnchorUuid: U ? P : undefined
      };
    }
  }
  async function Rmc(e, t) {
    let n = t ?? (await cpf(e));
    let r = await loadTranscriptFile(n);
    return Object.assign(r, {
      sessionFile: n
    });
  }
  async function cpf(e) {
    let t = getSessionProjectDir();
    let n = getOriginalCwd();
    let r = `${e}.jsonl`;
    let o = Og.join(t ?? ty(n), r);
    if (t !== null) {
      return o;
    }
    for (let s of await jA(n)) {
      let i = Og.join(s, r);
      try {
        await Al.stat(i);
        return i;
      } catch {}
    }
    return o;
  }
  function clearSessionMessagesCache() {
    _Be.cache.clear?.();
  }
  async function doesMessageExistInSession(e, t) {
    return (await _Be(e)).vZc(t);
  }
  async function getLastSessionLog(e, t) {
    let n = await Rmc(e, t);
    let {
      messages: r,
      summaries: o,
      customTitles: s,
      endedSessions: i,
      aiTitles: a,
      tags: l,
      relocatedCwds: c,
      agentNames: u,
      agentColors: d,
      agentSettings: p,
      prNumbers: m,
      prUrls: f,
      prRepositories: h,
      bridgeSessionIds: g,
      bridgeLastSeqs: y,
      bridgeDialogKindsBySession: _,
      modes: b,
      permissionModes: S,
      isolationLatches: E,
      worktreeStates: C,
      fileHistorySnapshots: x,
      attributionSnapshots: A,
      contentReplacements: k,
      contextCollapseCommits: I,
      contextCollapseSnapshot: O,
      leafUuids: M,
      clearedToEmpty: L,
      sessionFile: P
    } = n;
    if (r.size === 0) {
      return null;
    }
    if (!_Be.cache.vZc(e)) {
      _Be.cache.set(e, Promise.resolve(new Set(r.keys())));
    }
    let F = kJe(r.values(), J => M.vZc(J.uuid) && !J.isSidechain && (J.type === "user" || J.type === "assistant")) ?? (M.size === 0 && !L ? kJe(r.values(), J => !J.isSidechain) : undefined);
    if (!F) {
      if (L) {
        let J = await Al.stat(P);
        return tzo(n, {
          date: J.mtime.toISOString(),
          fullPath: P,
          created: J.mtime,
          modified: J.mtime
        }, e);
      }
      return null;
    }
    let H = buildConversationChain(r, F);
    let U = F.sessionId;
    let N = o.get(F.uuid);
    let W = s.get(U);
    let j = l.get(U);
    let z = p.get(U);
    let V = $Vo(H, 0, N, W, _pr(x, H), j, P, bpr(A, H), z, k.get(U) ?? []);
    let K = c.get(U);
    return {
      ...V,
      projectPath: K ?? V.projectPath,
      rewindAnchorUuid: n.rewindAnchorUuid,
      aiTitle: a.get(U),
      relocatedCwd: K,
      ...Tve({}, i.vZc(U)),
      agentName: u.get(U) ?? V.agentName,
      agentColor: d.get(U),
      mode: b.get(U),
      permissionMode: S.get(U),
      isolationLatch: E.get(U),
      prNumber: m.get(U),
      prUrl: f.get(U),
      prRepository: h.get(U),
      bridgeSessionId: g.get(U),
      bridgeLastSeq: y.get(U),
      bridgeDialogKinds: _.get(U),
      worktreeSession: C.get(U),
      contextCollapseCommits: I.filter(J => J.sessionId === U),
      contextCollapseSnapshot: O?.sessionId === U ? O : undefined
    };
  }
  async function loadMessageLogs(e) {
    let t = await fetchLogs(e);
    let {
      logs: n
    } = await enrichLogs(t, 0, t.length);
    let r = AHe(n);
    r.forEach((o, s) => {
      o.value = s;
    });
    return r;
  }
  async function loadAllProjectsMessageLogs(e, t) {
    if (t?.skipIndex) {
      return upf(e);
    }
    return (await loadAllProjectsMessageLogsProgressive(e, t?.initialEnrichCount ?? 50)).logs;
  }
  async function upf(e) {
    let t = y$();
    let n;
    try {
      n = await Al.readdir(t, {
        withFileTypes: true
      });
    } catch {
      return [];
    }
    let r = n.filter(l => l.isDirectory()).map(l => Og.join(t, l.name));
    let s = (await Promise.all(r.map(l => fpf(l, e)))).flat();
    let i = new Map();
    for (let l of s) {
      let c = `${l.sessionId ?? ""}:${l.leafUuid ?? ""}`;
      let u = i.get(c);
      if (!u || l.modified.getTime() > u.modified.getTime()) {
        i.set(c, l);
      }
    }
    let a = AHe([...i.values()]);
    a.forEach((l, c) => {
      l.value = c;
    });
    return a;
  }
  async function loadAllProjectsMessageLogsProgressive(e, t = 50) {
    let n = y$();
    let r;
    try {
      r = await Al.readdir(n, {
        withFileTypes: true
      });
    } catch {
      return {
        logs: [],
        allStatLogs: [],
        nextIndex: 0
      };
    }
    let o = r.filter(c => c.isDirectory()).map(c => Og.join(n, c.name));
    let s = await Promise.all(o.map(c => getSessionFilesLite(c, e)));
    let i = Vtn(s.flat());
    let {
      logs: a,
      nextIndex: l
    } = await enrichLogs(i, 0, t);
    a.forEach((c, u) => {
      c.value = u;
    });
    return {
      logs: a,
      allStatLogs: i,
      nextIndex: l
    };
  }
  async function loadSameRepoMessageLogs(e, t, n = 50) {
    return (await loadSameRepoMessageLogsProgressive(e, t, n)).logs;
  }
  async function loadSameRepoMessageLogsProgressive(e, t, n = 50) {
    logForDebugging(`/resume: loading sessions for cwd=${getOriginalCwd()}, worktrees=[${e.join(", ")}]`);
    let r = await xmc(e, t);
    logForDebugging(`/resume: found ${r.length} session files on disk`);
    let {
      logs: o,
      nextIndex: s
    } = await enrichLogs(r, 0, n);
    o.forEach((i, a) => {
      i.value = a;
    });
    return {
      logs: o,
      allStatLogs: r,
      nextIndex: s
    };
  }
  async function xmc(e, t) {
    let n = y$();
    let r = getOriginalCwd();
    let o = S => S.replaceAll("\\", "/");
    let s = o(r);
    let i = e.filter(S => {
      let E = o(S);
      return s === E || s.startsWith(E + "/");
    }).sort((S, E) => E.length - S.length)[0];
    let l = Ro((await Promise.all((i && i !== r ? [r, i] : [r]).map(pmc))).flat());
    let c = l.length > 0 ? (await Promise.all(l.map(S => getSessionFilesLite(S, t)))).flat().map(S => ({
      ...S,
      isAlias: true
    })) : [];
    if (e.length <= 1) {
      let S = ty(r);
      let E = await getSessionFilesLite(S, undefined, r);
      let C = E.length === 0 && HVo.test(r) ? await jVo(r, S, t) : [];
      if (c.length > 0 || C.length > 0) {
        return Vtn([...E, ...C, ...c]);
      }
      return E;
    }
    let u = false;
    let d = e.map(S => {
      let E = $T(S);
      return {
        path: S,
        prefix: u ? E.toLowerCase() : E
      };
    });
    d.sort((S, E) => E.prefix.length - S.prefix.length);
    let p = new Set();
    let m;
    try {
      m = await Al.readdir(n, {
        withFileTypes: true
      });
    } catch (S) {
      logForDebugging(`Failed to read projects dir ${n}, falling back to current project: ${S}`);
      let E = ty(getOriginalCwd());
      let C = await getSessionFilesLite(E, t, getOriginalCwd());
      return c.length > 0 ? Vtn(C.concat(c)) : C;
    }
    let f = [];
    if (i === undefined) {
      let S = ty(r);
      let E = Og.basename(S);
      p.add(u ? E.toLowerCase() : E);
      f.push({
        projectDir: S,
        wtPath: r
      });
    }
    for (let S of m) {
      if (!S.isDirectory()) {
        continue;
      }
      let E = u ? S.name.toLowerCase() : S.name;
      if (p.vZc(E)) {
        continue;
      }
      for (let {
        path: C,
        prefix: x
      } of d) {
        if (E === x || E.startsWith(x + "-")) {
          p.add(E);
          f.push({
            projectDir: Og.join(n, S.name),
            wtPath: C
          });
          break;
        }
      }
    }
    let h = await Promise.all(f.map(({
      projectDir: S,
      wtPath: E
    }) => getSessionFilesLite(S, undefined, E)));
    let g = new Map();
    for (let S = 0; S < f.length; S++) {
      let E = f[S].wtPath;
      g.set(E, (g.get(E) ?? 0) + h[S].length);
    }
    let _ = (i === undefined ? [r, ...e] : e).filter(S => HVo.test(S) && (g.get(S) ?? 0) === 0);
    let b = _.length > 0 ? await Promise.all(_.map(async S => {
      let E = S;
      try {
        E = await Al.realpath(S);
      } catch {}
      return jVo(E, ty(S), t, true);
    })) : [];
    return Vtn(h.flat().concat(b.flat(), c));
  }
  async function jVo(e, t, n, r = false) {
    let o = y$();
    let s;
    try {
      s = await Al.readdir(o, {
        withFileTypes: true
      });
    } catch {
      return [];
    }
    let i = d => d.replaceAll("\\", "/");
    let a = i(e);
    let l = await Promise.all(s.map(async d => {
      if (!d.isDirectory()) {
        return null;
      }
      let p = Og.join(o, d.name);
      if (p === t) {
        return null;
      }
      let m = await getSessionFilesWithMtime(p);
      let f = [...m.values()].sort((g, y) => y.mtime - g.mtime)[0];
      if (!f) {
        return null;
      }
      let h = Buffer.allocUnsafe(65536);
      try {
        let g = await kmc(f.path, f.size, h);
        let y = g.relocatedCwd ?? g.projectPath;
        if (y) {
          let _ = i(y);
          if (_ === a || r && _.startsWith(a + "/")) {
            return {
              sessionFiles: m
            };
          }
        }
      } catch {}
      return null;
    }));
    let c = [];
    for (let d of l) {
      if (!d) {
        continue;
      }
      let p = [...d.sessionFiles.entries()].sort((m, f) => f[1].mtime - m[1].mtime);
      if (n && p.length > n) {
        p = p.slice(0, n);
      }
      for (let [m, f] of p) {
        c.push({
          date: new Date(f.mtime).toISOString(),
          messages: [],
          isLite: true,
          fullPath: f.path,
          value: 0,
          created: new Date(f.ctime),
          modified: new Date(f.mtime),
          firstPrompt: "",
          messageCount: 0,
          fileSize: f.size,
          isSidechain: false,
          sessionId: m,
          projectPath: e
        });
      }
    }
    let u = AHe(c);
    u.forEach((d, p) => {
      d.value = p;
    });
    return u;
  }
  async function getAgentTranscript(e) {
    let t = Ew(e);
    try {
      let {
        messages: n,
        agentContentReplacements: r,
        forkContextRefs: o
      } = await loadTranscriptFile(t);
      let s = Array.from(n.values()).filter(m => m.agentId === e && m.isSidechain);
      if (s.length === 0) {
        return null;
      }
      let i = new Set(s.map(m => m.parentUuid));
      let a = kJe(s, m => !i.vZc(m.uuid) && !(m.type === "system" && "subtype" in m && m.subtype === "compact_boundary"));
      if (!a) {
        return null;
      }
      let u = buildConversationChain(n, a).filter(m => m.agentId === e).map(({
        isSidechain: m,
        parentUuid: f,
        ...h
      }) => h);
      let d = o.get(e);
      return {
        messages: d === undefined ? u : (await Bdf(d)).concat(u),
        contentReplacements: r.get(e) ?? []
      };
    } catch {
      return null;
    }
  }
  function extractAgentIdsFromMessages(e) {
    let t = [];
    for (let n of e) {
      if (n.type === "progress" && n.data && typeof n.data === "object" && "type" in n.data && (n.data.type === "agent_progress" || n.data.type === "skill_progress") && "agentId" in n.data && typeof n.data.agentId === "string") {
        t.push(n.data.agentId);
      }
    }
    return Ro(t);
  }
  async function loadSubagentTranscripts(e) {
    let t = await Promise.all(e.map(async r => {
      try {
        let o = await getAgentTranscript(r);
        if (o && o.messages.length > 0) {
          return {
            agentId: r,
            transcript: o.messages
          };
        }
        return null;
      } catch {
        return null;
      }
    }));
    let n = {};
    for (let r of t) {
      if (r) {
        n[r.agentId] = r.transcript;
      }
    }
    return n;
  }
  async function loadAllSubagentTranscriptsFromDisk() {
    return loadSubagentTranscripts(await pHn());
  }
  function isLoggableMessage(e) {
    if (e.type === "progress") {
      return false;
    }
    if (e.type === "attachment" && e.attachment.type === "hook_success" && !e.attachment.content && !e.attachment.stdout?.trim() && !e.attachment.stderr?.trim()) {
      return false;
    }
    if (e.type === "attachment" && getUserType() !== "ant" && dpf.vZc(e.attachment.type)) {
      return false;
    }
    return true;
  }
  function collectReplIds(e, t = new Set()) {
    for (let n of e) {
      if (n.type === "assistant" && Array.isArray(n.message.content)) {
        for (let r of n.message.content) {
          if (r.type === "tool_use" && r.name === "REPL") {
            t.add(r.id);
          }
        }
      }
    }
    return t;
  }
  function ppf(e, t) {
    return e.flatMap(n => {
      if (n.type === "assistant" && Array.isArray(n.message.content)) {
        let r = n.message.content;
        let s = r.some(i => i.type === "tool_use" && i.name === "REPL") ? r.filter(i => !(i.type === "tool_use" && i.name === "REPL")) : r;
        if (s.length === 0) {
          return [];
        }
        if (n.isVirtual) {
          let {
            isVirtual: i,
            ...a
          } = n;
          return [{
            ...a,
            message: {
              ...n.message,
              content: s
            }
          }];
        }
        if (s !== r) {
          return [{
            ...n,
            message: {
              ...n.message,
              content: s
            }
          }];
        }
        return [n];
      }
      if (n.type === "user" && Array.isArray(n.message.content)) {
        let r = n.message.content;
        let s = r.some(i => i.type === "tool_result" && t.vZc(i.tool_use_id)) ? r.filter(i => !(i.type === "tool_result" && t.vZc(i.tool_use_id))) : r;
        if (s.length === 0) {
          return [];
        }
        if (n.isVirtual) {
          let {
            isVirtual: i,
            ...a
          } = n;
          return [{
            ...a,
            message: {
              ...n.message,
              content: s
            }
          }];
        }
        if (s !== r) {
          return [{
            ...n,
            message: {
              ...n.message,
              content: s
            }
          }];
        }
        return [n];
      }
      if ("isVirtual" in n && n.isVirtual) {
        let {
          isVirtual: r,
          ...o
        } = n;
        return [o];
      }
      return [n];
    });
  }
  function cleanMessagesForLogging(e, t = e) {
    let n = e.filter(isLoggableMessage);
    if (getUserType() === "ant") {
      return n;
    }
    let r = t instanceof Set ? t : collectReplIds(t);
    return ppf(n, r);
  }
  async function getLogByIndex(e) {
    return (await loadMessageLogs())[e] || null;
  }
  async function findUnresolvedToolUse(e) {
    let t;
    try {
      t = wh();
      let {
        messages: n
      } = await loadTranscriptFile(t);
      let r = null;
      for (let o of n.values()) {
        if (o.type === "assistant") {
          let s = o.message.content;
          if (Array.isArray(s)) {
            for (let i of s) {
              if (i.type === "tool_use" && i.id === e) {
                r = o;
                break;
              }
            }
          }
        } else if (o.type === "user") {
          let s = o.message.content;
          if (Array.isArray(s)) {
            for (let i of s) {
              if (i.type === "tool_result" && i.tool_use_id === e) {
                return null;
              }
            }
          }
        }
      }
      if (!r) {
        logForDebugging(`findUnresolvedToolUse: tool_use ${e} not present in transcript ${t} (${n.size} messages)`, {
          level: "warn"
        });
      }
      return r;
    } catch (n) {
      logForDebugging(`findUnresolvedToolUse: failed to read transcript${t ? ` ${t}` : ""} for tool_use ${e}: ${n}`, {
        level: "warn"
      });
      return null;
    }
  }
  async function findDeferredToolMarkerInTranscript(e) {
    try {
      let {
        content: t,
        bytesRead: n,
        bytesTotal: r
      } = await LA(e, 1048576);
      let o = t.split(`
`);
      if (n < r) {
        o.shift();
      }
      let s = null;
      let i = -1;
      for (let l = o.length - 1; l >= 0; l--) {
        let c = o[l].trim();
        if (!c.includes('"hook_deferred_tool"')) {
          continue;
        }
        let u = qt(c);
        if (u?.type === "attachment" && u.attachment?.type === "hook_deferred_tool") {
          s = u.attachment;
          i = l;
          break;
        }
      }
      if (!s) {
        return null;
      }
      let a = `"tool_use_id":"${s.toolUseID}"`;
      for (let l = i + 1; l < o.length; l++) {
        if (o[l].includes(a)) {
          return null;
        }
      }
      return s;
    } catch {
      return null;
    }
  }
  async function getSessionFilesWithMtime(e) {
    let t = new Map();
    let n;
    try {
      n = await Al.readdir(e, {
        withFileTypes: true
      });
    } catch {
      return t;
    }
    let r = [];
    for (let o of n) {
      if (!o.isFile() || !o.name.endsWith(".jsonl")) {
        continue;
      }
      let s = kD(Og.basename(o.name, ".jsonl"));
      if (!s) {
        continue;
      }
      r.push({
        sessionId: s,
        filePath: Og.join(e, o.name)
      });
    }
    await Promise.all(r.map(async ({
      sessionId: o,
      filePath: s
    }) => {
      try {
        let i = await Al.stat(s);
        t.set(o, {
          path: s,
          mtime: i.mtime.getTime(),
          ctime: i.birthtime.getTime(),
          size: i.size
        });
      } catch {
        logForDebugging(`Failed to stat session file: ${s}`);
      }
    }));
    return t;
  }
  async function loadAllLogsFromSessionFile(e, t) {
    let {
      messages: n,
      summaries: r,
      customTitles: o,
      endedSessions: s,
      aiTitles: i,
      tags: a,
      relocatedCwds: l,
      agentNames: c,
      agentColors: u,
      agentSettings: d,
      prNumbers: p,
      prUrls: m,
      prRepositories: f,
      modes: h,
      permissionModes: g,
      isolationLatches: y,
      fileHistorySnapshots: _,
      attributionSnapshots: b,
      contentReplacements: S,
      leafUuids: E
    } = await loadTranscriptFile(e, {
      keepAllLeaves: true
    });
    if (n.size === 0) {
      return [];
    }
    let C = [];
    for (let k of n.values()) {
      if (E.vZc(k.uuid)) {
        C.push(k);
      }
    }
    let x = vmc(n);
    let A = [];
    for (let k of C) {
      let I = buildConversationChain(n, k, x);
      if (I.length === 0) {
        continue;
      }
      let O = I[0];
      let M = k.sessionId;
      A.push({
        date: k.timestamp,
        messages: removeExtraFields(I),
        fullPath: e,
        value: 0,
        created: new Date(O.timestamp),
        modified: new Date(k.timestamp),
        firstPrompt: ezo(I),
        messageCount: rzo(I),
        isSidechain: O.isSidechain ?? false,
        sessionId: M,
        leafUuid: k.uuid,
        summary: r.get(k.uuid),
        customTitle: o.get(M),
        ...Tve({}, s.vZc(M)),
        aiTitle: i.get(M),
        tag: a.get(M),
        relocatedCwd: l.get(M),
        agentName: c.get(M),
        agentColor: u.get(M),
        agentSetting: d.get(M),
        mode: h.get(M),
        permissionMode: g.get(M),
        isolationLatch: y.get(M),
        prNumber: p.get(M),
        prUrl: m.get(M),
        prRepository: f.get(M),
        gitBranch: k.gitBranch,
        projectPath: t ?? O.cwd,
        fileHistorySnapshots: _pr(_, I),
        attributionSnapshots: bpr(b, I),
        contentReplacements: S.get(M) ?? []
      });
    }
    return A;
  }
  async function fpf(e, t) {
    let n = await getSessionFilesWithMtime(e);
    if (n.size === 0) {
      return [];
    }
    let r;
    if (t && n.size > t) {
      r = [...n.values()].sort((s, i) => i.mtime - s.mtime).slice(0, t);
    } else {
      r = [...n.values()];
    }
    let o = [];
    for (let s of r) {
      try {
        let i = await loadAllLogsFromSessionFile(s.path);
        o.push(...i);
      } catch {
        logForDebugging(`Failed to load session file: ${s.path}`);
      }
    }
    return o;
  }
  async function kmc(e, t, n) {
    let {
      head: r,
      tail: o
    } = await $ks(e, t, n);
    if (!r) {
      return {
        firstPrompt: "",
        isSidechain: false
      };
    }
    let s = r.includes('"isSidechain":true') || r.includes('"isSidechain": true');
    let i = rW(r, "cwd");
    let a = rW(r, "teamName");
    let l = r.split(`
`).find(k => k.includes('"parentUuid":')) ?? r;
    let c = rW(l, "sessionKind");
    let u = c === "bg" || c === "daemon" || c === "daemon-worker" ? c : undefined;
    let d = rW(r, "agentSetting");
    let p = rW(r, "entrypoint") ?? rS(o, "entrypoint");
    let m = r.includes("<command-name>/loop</command-name>");
    let f = rS(o, "lastPrompt") || hpf(r) || Qpc(r, "content", 200) || Qpc(r, "text", 200) || "";
    let h = rS(o, "customTitle") ?? rS(r, "customTitle");
    let g = rS(o, "aiTitle") ?? rS(r, "aiTitle");
    let y = gpf(o, "summary", "summary");
    let _ = rS(o, "tag");
    let b = BDt(o, "relocated", "relocatedCwd");
    let S = rS(o, "gitBranch") ?? rW(r, "gitBranch");
    let E = rS(o, "prUrl");
    let C = rS(o, "prRepository");
    let x;
    let A = rS(o, "prNumber");
    if (A) {
      x = parseInt(A, 10) || undefined;
    }
    if (!x) {
      let k = o.lastIndexOf('"prNumber":');
      if (k >= 0) {
        let I = o.slice(k + 11, k + 25);
        let O = parseInt(I.trim(), 10);
        if (O > 0) {
          x = O;
        }
      }
    }
    return {
      firstPrompt: f,
      gitBranch: S,
      isSidechain: s,
      projectPath: i,
      relocatedCwd: b,
      teamName: a,
      sessionKind: u,
      isLoopSession: m,
      customTitle: h,
      aiTitle: g,
      summary: y,
      tag: _,
      agentSetting: d,
      entrypoint: p,
      prNumber: x,
      prUrl: E,
      prRepository: C
    };
  }
  function hpf(e) {
    let t = 0;
    let n = false;
    let r = "";
    while (t < e.length) {
      let o = e.indexOf(`
`, t);
      let s = o >= 0 ? e.slice(t, o) : e.slice(t);
      if (t = o >= 0 ? o + 1 : e.length, !s.includes('"type":"user"') && !s.includes('"type": "user"')) {
        continue;
      }
      if (s.includes('"tool_result"')) {
        continue;
      }
      if (s.includes('"isMeta":true') || s.includes('"isMeta": true')) {
        continue;
      }
      try {
        let i = qt(s);
        if (i.type !== "user") {
          continue;
        }
        let a = i.message;
        if (!a) {
          continue;
        }
        let l = a.content;
        let c = [];
        if (typeof l === "string") {
          c.push(l);
        } else if (Array.isArray(l)) {
          for (let u of l) {
            let d = u;
            if (d.type === "text" && typeof d.text === "string") {
              c.push(d.text);
            }
          }
        }
        for (let u of c) {
          if (!u) {
            continue;
          }
          let d = u.replaceAll(`
`, " ").trim();
          let p = Nl(d, "command-name");
          if (p) {
            let f = p.replace(/^\//, "");
            let h = Nl(d, "command-args")?.trim() || "";
            if (builtInCommandNames().vZc(f) || !h) {
              if (!r) {
                r = p;
              }
              continue;
            }
            return h ? `${p} ${h}` : p;
          }
          let m = Nl(d, "bash-input");
          if (m) {
            return `! ${m}`;
          }
          if (tmc.test(d)) {
            if (d.startsWith(`<${"tick"}>`)) {
              n = true;
            }
            continue;
          }
          if (d.length > 200) {
            d = d.slice(0, 200).trim() + "\u2026";
          }
          return d;
        }
      } catch {
        continue;
      }
    }
    if (r) {
      return r;
    }
    if (n) {
      return "Proactive session";
    }
    return "";
  }
  function gpf(e, t, n) {
    let r = `"type":"${t}"`;
    let o = `"${n}":`;
    let s = e.length;
    while (s > 0) {
      let i = e.lastIndexOf(`
`, s - 1);
      let a = e.slice(i + 1, s);
      if (s = i, a.includes(r) && a.includes(o)) {
        let l = rW(a, n);
        if (l !== undefined) {
          return l;
        }
      }
      if (i < 0) {
        break;
      }
    }
    return;
  }
  function Qpc(e, t, n) {
    let r = [`"${t}":"`, `"${t}": "`];
    for (let o of r) {
      let s = e.indexOf(o);
      if (s < 0) {
        continue;
      }
      let i = s + o.length;
      let a = i;
      let l = 0;
      while (a < e.length && l < n) {
        if (e[a] === "\\") {
          a += 2;
          l++;
          continue;
        }
        if (e[a] === '"') {
          break;
        }
        a++;
        l++;
      }
      return e.slice(i, a).replaceAll("\\n", " ").replaceAll("\\t", " ").trim();
    }
    return "";
  }
  function Vtn(e) {
    let t = new Map();
    for (let n of e) {
      if (!n.sessionId) {
        continue;
      }
      let r = t.get(n.sessionId);
      if (!r || n.modified.getTime() > r.modified.getTime()) {
        t.set(n.sessionId, n);
      }
    }
    return AHe([...t.values()]).map((n, r) => ({
      ...n,
      value: r
    }));
  }
  async function getSessionFilesLite(e, t, n) {
    let o = [...(await getSessionFilesWithMtime(e)).entries()].sort((a, l) => l[1].mtime - a[1].mtime);
    if (t && o.length > t) {
      o = o.slice(0, t);
    }
    let s = [];
    for (let [a, l] of o) {
      s.push({
        date: new Date(l.mtime).toISOString(),
        messages: [],
        isLite: true,
        fullPath: l.path,
        value: 0,
        created: new Date(l.ctime),
        modified: new Date(l.mtime),
        firstPrompt: "",
        messageCount: 0,
        fileSize: l.size,
        isSidechain: false,
        sessionId: a,
        projectPath: n
      });
    }
    let i = AHe(s);
    i.forEach((a, l) => {
      a.value = l;
    });
    return i;
  }
  async function ypf(e, t) {
    if (!e.isLite || !e.fullPath) {
      return e;
    }
    let n = await kmc(e.fullPath, e.fileSize ?? 0, t);
    let r = l => l;
    let o = n.projectPath !== undefined && r(Og.dirname(e.fullPath)) === r(ty(n.projectPath));
    let s = n.relocatedCwd ?? (o || e.projectPath === undefined ? n.projectPath ?? e.projectPath : e.projectPath);
    let i = {
      ...e,
      isLite: false,
      firstPrompt: n.firstPrompt,
      gitBranch: n.gitBranch,
      isSidechain: n.isSidechain,
      teamName: n.teamName,
      sessionKind: n.sessionKind,
      customTitle: n.customTitle,
      aiTitle: n.aiTitle,
      summary: n.summary,
      tag: n.tag,
      agentSetting: n.agentSetting,
      prNumber: n.prNumber,
      prUrl: n.prUrl,
      prRepository: n.prRepository,
      projectPath: s
    };
    if (!i.firstPrompt && !i.customTitle && !i.aiTitle) {
      i.firstPrompt = "(session)";
    }
    if (i.isSidechain) {
      logForDebugging(`Session ${e.sessionId} filtered from /resume: isSidechain=true`);
      return null;
    }
    if (i.teamName) {
      logForDebugging(`Session ${e.sessionId} filtered from /resume: teamName=${i.teamName}`);
      return null;
    }
    if (i.sessionKind === "daemon" || i.sessionKind === "daemon-worker") {
      logForDebugging(`Session ${e.sessionId} filtered from /resume: sessionKind=${i.sessionKind}`);
      return null;
    }
    let a = rgn.vZc(umc() ?? "");
    if (!a && rgn.vZc(n.entrypoint ?? "")) {
      logForDebugging(`Session ${e.sessionId} filtered from /resume: entrypoint=${n.entrypoint}`);
      return null;
    }
    if (!a && n.isLoopSession) {
      logForDebugging(`Session ${e.sessionId} filtered from /resume: /loop session`);
      return null;
    }
    return i;
  }
  async function enrichLogs(e, t, n) {
    let r = [];
    let o = Buffer.alloc(65536);
    let s = t;
    while (s < e.length && r.length < n) {
      let l = e[s];
      s++;
      let c = await ypf(l, o);
      if (c) {
        r.push(c);
      }
    }
    let i = s - t;
    let a = i - r.length;
    if (a > 0) {
      logForDebugging(`/resume: enriched ${i} sessions, ${a} filtered out, ${r.length} visible (${e.length - s} remaining on disk)`);
    }
    return {
      logs: r,
      nextIndex: s
    };
  }
  var AH;
  var Al;
  var Og;
  var emc;
  var xdf;
  var tmc;
  var ENTRY_APPEND_POLICY;
  var Idf;
  var yBe = null;
  var Gpc = false;
  var UVo = false;
  var xJe;
  var TranscriptFileFormatError;
  var Gtn;
  var mpr = null;
  var ozo = null;
  var izo;
  var subscribeSessionAgentNameChanged;
  var tnn;
  var subscribeSessionTitleChanged;
  var worktreeStateSignal;
  var _Be;
  var HVo;
  var dpf;
  var fa = __lazy(() => {
    Ot();
    at();
    sMn();
    Bm();
    np();
    YJn();
    ZC();
    D_();
    BT();
    mm();
    hd();
    yd();
    vo();
    je();
    Zm();
    Eve();
    gn();
    dt();
    cs();
    TKt();
    na();
    lm();
    Gd();
    Rn();
    ro();
    ku();
    g8o();
    Fy();
    ZS();
    ph();
    R3();
    Zn();
    qp();
    GL();
    AH = require("fs");
    Al = require("fs/promises");
    Og = require("path");
    emc = require("string_decoder");
    xdf = {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION;
    tmc = /^(?:\s*<[a-z][\w-]*[\s>]|\[Request interrupted by user[^\]]*\])/;
    ENTRY_APPEND_POLICY = {
      user: "dedup-transcript",
      assistant: "dedup-transcript",
      attachment: "dedup-transcript",
      system: "dedup-transcript",
      progress: "dedup-transcript",
      summary: "always",
      "custom-title": "always",
      "ended-by-model": "always",
      "ai-title": "always",
      "last-prompt": "always",
      tag: "always",
      relocated: "always",
      "agent-name": "always",
      "agent-color": "always",
      "agent-setting": "always",
      "pr-link": "always",
      "frame-link": "always",
      "bridge-session": "always",
      "file-history-snapshot": "always",
      "attribution-snapshot": "always",
      mode: "always",
      "permission-mode": "always",
      "isolation-latch": "always",
      "worktree-state": "always",
      "queue-operation": "always",
      "marble-origami-commit": "always",
      "marble-origami-snapshot": "always",
      "marble-origami-reset": "always",
      "content-replacement": "route-by-agent",
      "fork-context-ref": "route-by-agent"
    };
    Idf = new Set(["bash_progress", "powershell_progress", "mcp_progress", ...[], "repl_tool_call"]);
    xJe = new Map();
    TranscriptFileFormatError = class Pie extends Error {
      code;
      constructor(e, t) {
        super(e);
        this.code = t;
      }
    };
    Gtn = new Map();
    izo = Si();
    subscribeSessionAgentNameChanged = izo.subscribe;
    tnn = Si();
    subscribeSessionTitleChanged = tnn.subscribe;
    worktreeStateSignal = Si();
    _Be = TEr(async e => {
      try {
        let {
          messages: t
        } = await Rmc(e);
        return new Set(t.keys());
      } catch (t) {
        logForDebugging(`getSessionMessages: loadSessionFile failed: ${t instanceof Error ? t.message : String(t)}`, {
          level: "error"
        });
        return new Set();
      }
    }, e => e);
    HVo = /[^a-zA-Z0-9/\\:-]/;
    dpf = new Set([]);
  });
  var Dmc = {};