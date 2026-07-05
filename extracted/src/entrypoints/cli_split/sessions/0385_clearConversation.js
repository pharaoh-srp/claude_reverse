  __export(hHl, {
    startBackgroundCacheRefresh: () => startBackgroundCacheRefresh,
    resetFileIndexCache: () => resetFileIndexCache,
    pathListSignature: () => pathListSignature,
    normalizeGitPathsAsync: () => normalizeGitPathsAsync,
    globalFileIndexCache: () => globalFileIndexCache,
    getPathsForSuggestions: () => getPathsForSuggestions,
    getDirectoryNamesAsync: () => getDirectoryNamesAsync,
    getDirectoryNames: () => getDirectoryNames,
    generateFileSuggestions: () => generateFileSuggestions,
    findLongestCommonPrefix: () => findLongestCommonPrefix,
    filterIgnoredAsync: () => filterIgnoredAsync,
    createFileIndexCache: () => createFileIndexCache,
    applyFileSuggestion: () => applyFileSuggestion
  });
  function createFileIndexCache() {
    return {
      fileIndex: null,
      fileListRefreshPromise: null,
      cacheGeneration: 0,
      untrackedFetchPromise: null,
      cachedTrackedFiles: [],
      cachedConfigFiles: [],
      cachedTrackedDirs: [],
      ignorePatternsCache: null,
      ignorePatternsCacheKey: null,
      lastRefreshMs: 0,
      lastScanDurationMs: null,
      lastGitIndexMtime: null,
      loadedTrackedSignature: null,
      loadedMergedSignature: null,
      normalizedTrackedInputs: null,
      indexBuildComplete: Si()
    };
  }
  function resetFileIndexCache(e) {
    e.fileIndex = null;
    e.fileListRefreshPromise = null;
    e.cacheGeneration++;
    e.untrackedFetchPromise = null;
    e.cachedTrackedFiles = [];
    e.cachedConfigFiles = [];
    e.cachedTrackedDirs = [];
    e.ignorePatternsCache = null;
    e.ignorePatternsCacheKey = null;
    e.lastRefreshMs = 0;
    e.lastScanDurationMs = null;
    e.lastGitIndexMtime = null;
    e.loadedTrackedSignature = null;
    e.loadedMergedSignature = null;
    e.normalizedTrackedInputs = null;
  }
  function pathListSignature(e) {
    let t = e.length;
    let n = Math.max(1, Math.floor(t / 500));
    let r = -2128831035;
    for (let o = 0; o < t; o += n) {
      let s = e[o];
      for (let i = 0; i < s.length; i++) {
        r = (r ^ s.charCodeAt(i)) * 16777619 | 0;
      }
      r = r * 16777619 | 0;
    }
    if (t > 0) {
      let o = e[t - 1];
      for (let s = 0; s < o.length; s++) {
        r = (r ^ o.charCodeAt(s)) * 16777619 | 0;
      }
    }
    return `${t}:${(r >>> 0).toString(16)}`;
  }
  function U$m() {
    let e = findGitRoot(Nt());
    if (!e) {
      return null;
    }
    try {
      return dHl.statSync(tB.join(e, ".git", "index")).mtimeMs;
    } catch {
      return null;
    }
  }
  async function normalizeGitPathsAsync(e, t, n) {
    if (n === t) {
      return e;
    }
    let r = Array(e.length);
    let o = performance.now();
    for (let s = 0; s < e.length; s++) {
      let i = tB.join(t, e[s]);
      if (r[s] = tB.relative(n, i), (s & 255) === 255 && performance.now() - o > 4) {
        await gvt();
        o = performance.now();
      }
    }
    return r;
  }
  async function B$m(e, t) {
    if (t.length === 0) {
      return;
    }
    if (!e.fileIndex) {
      return;
    }
    let n = await getDirectoryNamesAsync(t);
    let r = [...e.cachedTrackedFiles, ...e.cachedConfigFiles, ...e.cachedTrackedDirs, ...t, ...n];
    let o = pathListSignature(r);
    if (o === e.loadedMergedSignature) {
      logForDebugging("[FileIndex] skipped index rebuild \u2014 merged paths unchanged");
      return;
    }
    if (await e.fileIndex.loadFromFileListAsync(r).done) {
      e.loadedMergedSignature = o;
      logForDebugging(`[FileIndex] rebuilt index with ${e.cachedTrackedFiles.length} tracked + ${t.length} untracked files`);
    }
  }
  async function uHl(e, t, n) {
    let r = `${t}:${n}`;
    if (e.ignorePatternsCacheKey === r) {
      return e.ignorePatternsCache;
    }
    let o = zt();
    let s = [".ignore", ".rgignore"];
    let i = Ro([t, n]);
    let a = kHo.default();
    let l = false;
    let c = i.flatMap(p => s.map(m => tB.join(p, m)));
    let u = await Promise.all(c.map(p => o.readFile(p, {
      encoding: "utf8"
    }).catch(() => null)));
    for (let [p, m] of u.entries()) {
      if (m === null) {
        continue;
      }
      a.add(m);
      l = true;
      logForDebugging(`[FileIndex] loaded ignore patterns from ${c[p]}`);
    }
    let d = l ? a : null;
    e.ignorePatternsCache = d;
    e.ignorePatternsCacheKey = r;
    return d;
  }
  async function filterIgnoredAsync(e, t) {
    let n = [];
    let r = performance.now();
    for (let o = 0; o < t.length; o++) {
      let s = t[o];
      if (!kHo.default.isPathValid(s) || !e.ignores(s)) {
        n.push(s);
      }
      if ((o & 255) === 255 && performance.now() - r > 4) {
        await gvt();
        r = performance.now();
      }
    }
    return n;
  }
  async function $$m(e, t, n) {
    let r = Date.now();
    let o = e.cacheGeneration;
    logForDebugging("[FileIndex] getFilesUsingGit called");
    let s = findGitRoot(Nt());
    if (!s) {
      logForDebugging("[FileIndex] not a git repo, returning null");
      return null;
    }
    try {
      let i = Nt();
      let a = Date.now();
      let l = await execFileNoThrowWithCwd(gitExe(), ["-c", "core.quotepath=false", "ls-files", "--recurse-submodules"], {
        timeout: 5000,
        abortSignal: t,
        cwd: s
      });
      if (logForDebugging(`[FileIndex] git ls-files (tracked) took ${Date.now() - a}ms`), l.code !== 0) {
        logForDebugging(`[FileIndex] git ls-files failed (code=${l.code}, stderr=${l.stderr}), falling back to ripgrep`);
        return null;
      }
      let c = e.normalizedTrackedInputs;
      let u;
      let d = null;
      if (c !== null && c.repoRoot === s && c.cwd === i && c.rawStdout === l.stdout && e.cachedTrackedFiles.length > 0) {
        u = e.cachedTrackedFiles;
        logForDebugging("[FileIndex] skipped path normalization \u2014 raw git paths unchanged");
      } else {
        let m = l.stdout.trim().split(`
`).filter(Boolean);
        u = await normalizeGitPathsAsync(m, s, i);
        let f = await uHl(e, s, i);
        if (f) {
          let h = u.length;
          u = await filterIgnoredAsync(f, u);
          logForDebugging(`[FileIndex] applied ignore patterns: ${h} -> ${u.length} files`);
        }
        d = {
          repoRoot: s,
          cwd: i,
          rawStdout: l.stdout
        };
      }
      if (o !== e.cacheGeneration) {
        logForDebugging("[FileIndex] discarding refresh results \u2014 cache was reset mid-refresh");
        return u;
      }
      if (d !== null) {
        e.normalizedTrackedInputs = d;
      }
      e.cachedTrackedFiles = u;
      let p = Date.now() - r;
      if (logForDebugging(`[FileIndex] git ls-files: ${u.length} tracked files in ${p}ms`), logEvent("tengu_file_suggestions_git_ls_files", {
        file_count: u.length,
        tracked_count: u.length,
        untracked_count: 0,
        duration_ms: p
      }), !e.untrackedFetchPromise) {
        let m = n ? ["-c", "core.quotepath=false", "ls-files", "--others", "--exclude-standard"] : ["-c", "core.quotepath=false", "ls-files", "--others"];
        let f = e.cacheGeneration;
        e.untrackedFetchPromise = execFileNoThrowWithCwd(gitExe(), m, {
          timeout: 1e4,
          cwd: s
        }).then(async h => {
          if (f !== e.cacheGeneration) {
            return;
          }
          if (h.code === 0) {
            let g = h.stdout.trim().split(`
`).filter(Boolean);
            let y = await normalizeGitPathsAsync(g, s, i);
            let _ = await uHl(e, s, i);
            if (_ && y.length > 0) {
              let b = y.length;
              y = await filterIgnoredAsync(_, y);
              logForDebugging(`[FileIndex] applied ignore patterns to untracked: ${b} -> ${y.length} files`);
            }
            logForDebugging(`[FileIndex] background untracked fetch: ${y.length} files`);
            return B$m(e, y);
          }
        }).catch(h => {
          logForDebugging(`[FileIndex] background untracked fetch failed: ${h}`);
        }).finally(() => {
          e.untrackedFetchPromise = null;
        });
      }
      return u;
    } catch (i) {
      logForDebugging(`[FileIndex] git ls-files error: ${he(i)}`);
      return null;
    }
  }
  function getDirectoryNames(e) {
    let t = new Set();
    mHl(e, 0, e.length, t);
    return [...t].map(n => n + tB.sep);
  }
  async function getDirectoryNamesAsync(e) {
    let t = new Set();
    let n = performance.now();
    for (let r = 0; r < e.length; r++) {
      if (mHl(e, r, r + 1, t), (r & 255) === 255 && performance.now() - n > 4) {
        await gvt();
        n = performance.now();
      }
    }
    return [...t].map(r => r + tB.sep);
  }
  function mHl(e, t, n, r) {
    for (let o = t; o < n; o++) {
      let s = tB.dirname(e[o]);
      while (s !== "." && !r.vZc(s)) {
        let i = tB.dirname(s);
        if (i === s) {
          break;
        }
        r.add(s);
        s = i;
      }
    }
  }
  async function j$m(e) {
    return (await Promise.all(gHl.map(n => E9(n, e)))).flatMap(n => n.map(r => r.filePath));
  }
  async function q$m(e, t, n) {
    logForDebugging(`[FileIndex] getProjectFiles called, respectGitignore=${n}`);
    let r = await $$m(e, t, n);
    if (r !== null) {
      logForDebugging(`[FileIndex] using git ls-files result (${r.length} files)`);
      return r;
    }
    logForDebugging("[FileIndex] git ls-files returned null, falling back to ripgrep");
    let o = Date.now();
    let s = Nt();
    let i = null;
    let a;
    {
      let u = ["--files", "--follow", "--hidden", "--glob", "!.git/", "--glob", "!.svn/", "--glob", "!.hg/", "--glob", "!.bzr/", "--glob", "!.jj/", "--glob", "!.sl/"];
      if (!n) {
        u.push("--no-ignore-vcs");
      }
      a = await sde(u, s, t);
    }
    let l = a.map(u => tB.relative(s, u));
    let c = Date.now() - o;
    logForDebugging(`[FileIndex] ripgrep: ${l.length} files in ${c}ms`);
    logEvent("tengu_file_suggestions_ripgrep", {
      file_count: l.length,
      duration_ms: c
    });
    return l;
  }
  async function getPathsForSuggestions(e) {
    let t = AbortSignal.timeout(1e4);
    let n = e.fileIndex ??= new aQt();
    try {
      let r = getInitialSettings();
      let o = getGlobalConfig();
      let s = r.respectGitignore ?? o.respectGitignore ?? true;
      let i = Nt();
      let [a, l] = await Promise.all([q$m(e, t, s), j$m(i)]);
      e.cachedConfigFiles = l;
      let c = [...a, ...l];
      let u = await getDirectoryNamesAsync(c);
      e.cachedTrackedDirs = u;
      let d = [...u, ...c];
      let p = pathListSignature(d);
      if (p !== e.loadedTrackedSignature) {
        if (await n.loadFromFileListAsync(d).done) {
          e.loadedTrackedSignature = p;
          e.loadedMergedSignature = null;
        }
      } else {
        logForDebugging("[FileIndex] skipped index rebuild \u2014 tracked paths unchanged");
      }
    } catch (r) {
      logForDebugging(`[FileIndex] getPathsForSuggestions failed: ${he(r)}`, {
        level: "error"
      });
    }
    return n;
  }
  function W$m(e, t) {
    let n = Math.min(e.length, t.length);
    let r = 0;
    while (r < n && e[r] === t[r]) {
      r++;
    }
    return e.substring(0, r);
  }
  function findLongestCommonPrefix(e) {
    if (e.length === 0) {
      return "";
    }
    let t = e.map(r => r.displayText);
    let n = t[0];
    for (let r = 1; r < t.length; r++) {
      let o = t[r];
      if (n = W$m(n, o), n === "") {
        return "";
      }
    }
    return n;
  }
  function psr(e, t) {
    return {
      id: `file-${e}`,
      displayText: e,
      metadata: t !== undefined ? {
        score: t
      } : undefined
    };
  }
  function G$m(e, t) {
    return e.search(t, 15).map(r => psr(r.path, r.score));
  }
  function startBackgroundCacheRefresh(e) {
    if (e.fileListRefreshPromise) {
      return;
    }
    let t = U$m();
    if (e.fileIndex) {
      if (t === null && e.lastRefreshMs > 0 && e.lastScanDurationMs !== null && e.lastScanDurationMs > 1000) {
        return;
      }
      if (!(t !== null && t !== e.lastGitIndexMtime) && Date.now() - e.lastRefreshMs < 5000) {
        return;
      }
    }
    let n = e.cacheGeneration;
    let r = Date.now();
    e.fileIndex ??= new aQt();
    e.fileListRefreshPromise = getPathsForSuggestions(e).then(o => {
      if (n !== e.cacheGeneration) {
        return o;
      }
      e.fileListRefreshPromise = null;
      e.indexBuildComplete.emit();
      e.lastGitIndexMtime = t;
      let s = Date.now();
      e.lastRefreshMs = s;
      e.lastScanDurationMs = s - r;
      logForDebugging(`[FileIndex] cache refresh completed in ${e.lastScanDurationMs}ms`);
      return o;
    }).catch(o => {
      if (logForDebugging(`[FileIndex] Cache refresh failed: ${he(o)}`), Oe(o), n === e.cacheGeneration) {
        e.fileListRefreshPromise = null;
      }
      return e.fileIndex ??= new aQt();
    });
  }
  async function K$m() {
    let e = zt();
    let t = Nt();
    try {
      return (await e.readdir(t)).map(r => {
        let o = tB.join(t, r.name);
        let s = tB.relative(t, o);
        return r.isDirectory() ? s + tB.sep : s;
      });
    } catch (n) {
      logForDebugging(`[FileSuggestions] readdir failed for cwd: ${he(n)}`, {
        level: "error"
      });
      return [];
    }
  }
  async function generateFileSuggestions(e, t, n = false) {
    if (va()) {
      if (!t && !n) {
        return [];
      }
      return Y$m(t);
    }
    if (!t && !n) {
      return [];
    }
    if (dsr(getInitialSettings().fileSuggestion)?.type === "command") {
      let s = {
        ...createBaseHookInput(),
        query: t
      };
      return (await executeFileSuggestionCommand(s)).slice(0, 15).map(psr);
    }
    if (t === "" || t === "." || t === "./") {
      let s = await K$m();
      startBackgroundCacheRefresh(e);
      return s.slice(0, 15).map(psr);
    }
    let o = Date.now();
    try {
      let s = e.fileListRefreshPromise !== null;
      startBackgroundCacheRefresh(e);
      let i = t;
      let a = "." + tB.sep;
      if (t.startsWith(a)) {
        i = t.substring(2);
      }
      if (i.startsWith("~")) {
        i = us(i);
      }
      let l = e.fileIndex ? G$m(e.fileIndex, i) : [];
      let c = Date.now() - o;
      logForDebugging(`[FileIndex] generateFileSuggestions: ${l.length} results in ${c}ms (${s ? "partial" : "full"} index)`);
      logEvent("tengu_file_suggestions_query", {
        duration_ms: c,
        cache_hit: !s,
        result_count: l.length,
        query_length: t.length
      });
      return l;
    } catch (s) {
      Oe(s);
      return [];
    }
  }
  async function Y$m(e) {
    let t = Ul();
    if (!t || !c_()) {
      return [];
    }
    try {
      return (await t.sendControlRequest({
        subtype: "file_suggestions",
        query: e
      })).suggestions.map(r => psr(r.path, r.score));
    } catch (n) {
      logForDebugging(`[FileIndex] remote file_suggestions RPC failed: ${he(n)}`);
      return [];
    }
  }
  function applyFileSuggestion(e, t, n, r, o, s) {
    let i = typeof e === "string" ? e : e.displayText;
    let a = t.substring(0, r) + i + t.substring(r + n.length);
    o(a);
    let l = r + i.length;
    s(l);
    return a;
  }
  var dHl;
  var kHo;
  var tB;
  var globalFileIndexCache;
  var yvt = __lazy(() => {
    v9();
    cHl();
    ru();
    Ot();
    vo();
    je();
    dt();
    ji();
    na();
    lQt();
    Sp();
    Rn();
    ku();
    eoe();
    ph();
    dHl = require("fs");
    kHo = __toESM(aWe(), 1);
    tB = __toESM(require("path"));
    globalFileIndexCache = createFileIndexCache();
  });
  var _vt = {};
  __export(_vt, {
    clearSessionCaches: () => clearSessionCaches
  });
  function clearSessionCaches(e = new Set(), t) {
    let n = e.size > 0;
    if (iE.cache.clear?.(), Tv.cache.clear?.(), Quo.cache.clear?.(), getIsGit.cache.clear?.(), fTe.cache.clear?.(), resetFileIndexCache(globalFileIndexCache), clearCommandsCache(), !n) {
      Yga();
    }
    if (setLastEmittedDate(null), Mde(undefined, t), resetSentSkillNames(), resetGetMemoryFilesCache("session_start"), t?.(r => {
      if (r.storedImagePaths.size === 0 && r.imageDescriptions.size === 0 && Object.keys(r.displayedMessageContent).length === 0) {
        return r;
      }
      return {
        ...r,
        storedImagePaths: new Map(),
        imageDescriptions: new Map(),
        displayedMessageContent: {}
      };
    }), Kfl(), !n) {
      KAl();
    }
    if (clearRepositoryCaches(), yHl(), !n) {
      jba();
    }
    clearInvokedSkills(e);
    clearResolveGitDirCache();
    i5a();
    e4a();
    Promise.resolve().then(() => (lLo(), rxl)).then(({
      clearWebFetchCache: r
    }) => r());
    Promise.resolve().then(() => (K$n(), _ga)).then(({
      clearToolSearchDescriptionCache: r
    }) => r());
    Promise.resolve().then(() => (kS(), cvt)).then(({
      clearAgentDefinitionsCache: r
    }) => r());
    Promise.resolve().then(() => (uTe(), Sda)).then(({
      clearPromptCache: r
    }) => r());
  }
  var z7e = __lazy(() => {
    at();
    Bm();
    v9e();
    LG();
    yvt();
    na();
    XTt();
    gWt();
    ADe();
    YJn();
    Npt();
    _ht();
    T9();
    rR();
    bU();
    bx();
    bI();
    FP();
  });
  var bHl = {};
  __export(bHl, {
    clearConversation: () => clearConversation
  });
  async function* clearConversation({
    setMessages: e,
    readFileState: t,
    loadedNestedMemoryPaths: n,
    sessionEnvVars: r,
    memorySelector: o,
    getAppState: s,
    setAppState: i,
    isolationLatch: a,
    clearedSessionTitle: l
  }) {
    let c = getSessionEndHookTimeoutMs();
    await executeSessionEndHooks("clear", {
      getAppState: s,
      setAppState: i,
      signal: AbortSignal.timeout(c)
    });
    let u = getLastMainRequestId();
    if (u) {
      logEvent("tengu_cache_eviction_hint", {
        scope: "conversation_clear",
        last_request_id: br(u)
      });
    }
    let d = new Set();
    let p = [];
    let m = S => "isBackgrounded" in S && S.isBackgrounded === false;
    if (s) {
      for (let S of Object.values(s().tasks)) {
        if (m(S)) {
          continue;
        }
        if (za(S)) {
          d.add(S.agentId);
          p.push(S);
        } else if (RS(S)) {
          d.add(S.identity.agentId);
        }
      }
    }
    e(S => {
      if (FTe() === "padded-countdown") {
        fWt("main", L1(S));
      }
      return [];
    });
    clearSessionCaches(d, i);
    let f = getOriginalCwd();
    try {
      By(f);
    } catch {
      logForDebugging(`/clear: originalCwd "${f}" no longer exists; falling back`);
      let S = getProjectRoot();
      if (S !== f) {
        try {
          By(S);
        } catch {}
      }
    }
    if (t.clear(), n) {
      for (let S of Object.keys(n)) {
        delete n[S];
      }
    }
    if (r?.clear(), W9e(o), a && d.size === 0) {
      a.current = null;
    }
    if (i) {
      i(S => {
        let E = {};
        for (let [C, x] of Object.entries(S.tasks)) {
          if (!m(x)) {
            E[C] = x;
            continue;
          }
          try {
            if (x.status === "running") {
              if (Cw(x)) {
                if (x.shellCommand?.kill(), x.shellCommand?.cleanup(), x.cleanupTimeoutId) {
                  clearTimeout(x.cleanupTimeoutId);
                }
              }
              if ("abortController" in x) {
                x.abortController?.abort();
              }
            }
          } catch (A) {
            Oe(A);
          }
          evictTaskOutput(C);
        }
        return {
          ...S,
          tasks: E,
          ...{},
          attribution: fmt(),
          cacheBreakerPhrase: undefined,
          activeGoal: undefined,
          frameUrls: {},
          frameNavPath: null,
          frameExpanded: false,
          footerLinks: S.footerLinks.filter(C => C.key !== undefined),
          standaloneAgentContext: S.standaloneAgentContext?.prideGradient ? {
            prideGradient: S.standaloneAgentContext.prideGradient
          } : undefined,
          fileHistory: {
            snapshots: [],
            trackedFiles: new Set(),
            snapshotSequence: 0
          }
        };
      });
    }
    if (s) {
      for (let S of s().mcp.clients) {
        if (S.name === "ide" && S.type === "connected") {
          S.client.onclose = undefined;
          await Ow(S.name, S.config).catch(() => {});
        }
      }
    }
    clearAllPlanSlugs();
    let h = getCurrentSessionTitle(getSessionId());
    let g = getSessionId();
    let y = l ? getMaterializedSessionFile() ?? wh() : undefined;
    if (clearSessionMetadata(), yield {
      type: "conversation_reset",
      newConversationId: _Hl.randomUUID()
    }, regenerateSessionId({
      setCurrentAsParent: true
    }), F8a(), process.env.CLAUDE_CODE_SESSION_ID) {
      process.env.CLAUDE_CODE_SESSION_ID = getSessionId();
    }
    if (await resetSessionFilePointer(), await Iea(getSessionId(), wh()), l) {
      await saveCustomTitle(g, l, y, "user");
    } else if (h) {
      await saveCustomTitle(getSessionId(), h, undefined, "user");
    }
    for (let S of p) {
      if (S.status !== "running") {
        continue;
      }
      initTaskOutputAsSymlink(S.id, Ew(S.agentId));
    }
    {
      fa();
      let {
        saveMode: S
      } = __toCommonJS(y5e);
      N1();
      let {
        isCoordinatorMode: E
      } = __toCommonJS(DG);
      S(E() ? "coordinator" : "normal");
    }
    let _ = getCurrentWorktreeSession();
    if (_) {
      saveWorktreeState(_);
    }
    if (a?.current) {
      saveIsolationLatch(a.current);
    }
    let b = await MV("clear");
    if (b.length > 0) {
      e(() => b);
    }
  }
  var _Hl;
  var msr = __lazy(() => {
    at();
    zf();
    Ot();
    B_();
    eA();
    ry();
    D_();
    HG();
    je();
    Sp();
    Rn();
    xx();
    U1();
    Fy();
    DDe();
    fa();
    I8e();
    cE();
    TO();
    hWt();
    iP();
    z7e();
    _Hl = require("crypto");
  });
  var SHl = {};