  __export(OIs, {
    resolveRef: () => resolveRef,
    resolveGitDir: () => resolveGitDir,
    resetGitFileWatcher: () => resetGitFileWatcher,
    removeWatchedRepo: () => removeWatchedRepo,
    reanchorGitFileWatcher: () => reanchorGitFileWatcher,
    readWorktreeHeadSha: () => readWorktreeHeadSha,
    readRawSymref: () => readRawSymref,
    readGitHead: () => readGitHead,
    onWatchedGitStateChange: () => onWatchedGitStateChange,
    onRepoBranchChange: () => onRepoBranchChange,
    isValidGitSha: () => isValidGitSha,
    isShallowClone: () => isShallowClone,
    getWorktreeCountFromFs: () => getWorktreeCountFromFs,
    getRemoteUrlForDir: () => getRemoteUrlForDir,
    getHeadForDir: () => getHeadForDir,
    getCommonDir: () => getCommonDir,
    getCachedRemoteUrl: () => getCachedRemoteUrl,
    getCachedHead: () => getCachedHead,
    getCachedDefaultBranch: () => getCachedDefaultBranch,
    getCachedBranchForRepo: () => getCachedBranchForRepo,
    getCachedBranch: () => getCachedBranch,
    clearResolveGitDirCache: () => clearResolveGitDirCache,
    addWatchedRepo: () => addWatchedRepo
  });
  function clearResolveGitDirCache() {
    dje.clear();
  }
  async function resolveGitDir(e) {
    let t = FN.resolve(e ?? Nt());
    let n = dje.get(t);
    if (n !== undefined) {
      return n;
    }
    let r = findGitRoot(t);
    if (!r) {
      dje.set(t, null);
      return null;
    }
    let o = FN.join(r, ".git");
    try {
      if ((await iY.stat(o)).isFile()) {
        let i = (await iY.readFile(o, "utf-8")).trim();
        if (i.startsWith("gitdir:")) {
          let a = i.slice(7).trim();
          if (IB(a, r)) {
            dje.set(t, null);
            return null;
          }
          let l = FN.resolve(r, a);
          dje.set(t, l);
          return l;
        }
      }
      dje.set(t, o);
      return o;
    } catch {
      dje.set(t, null);
      return null;
    }
  }
  function isValidGitSha(e) {
    return /^[0-9a-f]{40}$/.test(e) || /^[0-9a-f]{64}$/.test(e);
  }
  async function readGitHead(e) {
    try {
      let t = (await iY.readFile(FN.join(e, "HEAD"), "utf-8")).trim();
      if (t.startsWith("ref:")) {
        let n = t.slice(4).trim();
        if (n.startsWith("refs/heads/")) {
          let o = n.slice(11);
          if (!wae(o)) {
            return null;
          }
          return {
            type: "branch",
            name: o
          };
        }
        if (!wae(n)) {
          return null;
        }
        let r = await resolveRef(e, n);
        return r ? {
          type: "detached",
          sha: r
        } : {
          type: "detached",
          sha: ""
        };
      }
      if (!isValidGitSha(t)) {
        return null;
      }
      return {
        type: "detached",
        sha: t
      };
    } catch {
      return null;
    }
  }
  async function resolveRef(e, t) {
    let n = await kIs(e, t);
    if (n) {
      return n;
    }
    let r = await getCommonDir(e);
    if (r && r !== e) {
      return kIs(r, t);
    }
    return null;
  }
  async function kIs(e, t) {
    try {
      let n = (await iY.readFile(FN.join(e, t), "utf-8")).trim();
      if (n.startsWith("ref:")) {
        let r = n.slice(4).trim();
        if (!wae(r)) {
          return null;
        }
        return resolveRef(e, r);
      }
      if (!isValidGitSha(n)) {
        return null;
      }
      return n;
    } catch {}
    return RIs(e, t);
  }
  async function getCommonDir(e) {
    try {
      let t = (await iY.readFile(FN.join(e, "commondir"), "utf-8")).trim();
      if (IB(t, e)) {
        return null;
      }
      return FN.resolve(e, t);
    } catch {
      return null;
    }
  }
  async function readRawSymref(e, t, n) {
    try {
      let r = (await iY.readFile(FN.join(e, t), "utf-8")).trim();
      if (r.startsWith("ref:")) {
        let o = r.slice(4).trim();
        if (o.startsWith(n)) {
          let s = o.slice(n.length);
          if (!wae(s)) {
            return null;
          }
          return s;
        }
      }
    } catch {}
    return null;
  }
  class PIs {
    gitDir = null;
    commonDir = null;
    initialized = false;
    initPromise = null;
    watchedFiles = [];
    branchRefPath = null;
    generation = 0;
    cache = new Map();
    stateChanged = Si();
    repoBranches = new Map();
    repoWatchers = new Map();
    repoBranchListeners = [];
    async ensureStarted() {
      if (this.initialized) {
        return;
      }
      if (this.initPromise) {
        return this.initPromise;
      }
      this.initPromise = this.start();
      return this.initPromise;
    }
    cleanupRegistered = false;
    async start() {
      let e = this.generation;
      if (va()) {
        this.gitDir = null;
        this.initialized = true;
        return;
      }
      let t = await resolveGitDir();
      if (e !== this.generation) {
        return;
      }
      if (this.gitDir = t, this.initialized = true, !this.cleanupRegistered) {
        this.cleanupRegistered = true;
        Ti(async () => {
          this.stopWatching();
        });
      }
      if (!this.gitDir) {
        return;
      }
      let n = await getCommonDir(this.gitDir);
      if (e !== this.generation) {
        return;
      }
      this.commonDir = n;
      this.watchPath(FN.join(this.gitDir, "HEAD"), () => {
        this.onHeadChanged();
      });
      this.watchPath(FN.join(this.commonDir ?? this.gitDir, "config"), () => {
        this.invalidate();
      });
      await this.watchCurrentBranchRef();
    }
    watchPath(e, t) {
      let n = QDt(e, {
        interval: 1000
      }, t);
      this.watchedFiles.push({
        path: e,
        listener: n
      });
    }
    async watchCurrentBranchRef() {
      if (!this.gitDir) {
        return;
      }
      let e = this.generation;
      let t = await readGitHead(this.gitDir);
      if (e !== this.generation) {
        return;
      }
      let n = this.commonDir ?? this.gitDir;
      let r = t?.type === "branch" ? FN.join(n, "refs", "heads", t.name) : null;
      if (r === this.branchRefPath) {
        return;
      }
      if (this.branchRefPath) {
        for (let {
          path: o,
          listener: s
        } of this.watchedFiles) {
          if (o === this.branchRefPath) {
            Snt.unwatchFile(o, s);
          }
        }
        this.watchedFiles = this.watchedFiles.filter(o => o.path !== this.branchRefPath);
      }
      if (this.branchRefPath = r, !r) {
        return;
      }
      this.watchPath(r, () => {
        this.invalidate();
      });
    }
    async onHeadChanged() {
      this.invalidate();
      await waitForScrollIdle();
      await this.watchCurrentBranchRef();
    }
    invalidate() {
      for (let e of this.cache.values()) {
        e.dirty = true;
      }
      this.stateChanged.emit();
    }
    onStateChange(e) {
      return this.stateChanged.subscribe(e);
    }
    stopWatching() {
      for (let {
        path: e,
        listener: t
      } of this.watchedFiles) {
        Snt.unwatchFile(e, t);
      }
      for (let {
        headPath: e,
        listener: t
      } of this.repoWatchers.values()) {
        Snt.unwatchFile(e, t);
      }
      this.watchedFiles = [];
      this.branchRefPath = null;
    }
    async get(e, t) {
      for (;;) {
        let n = this.generation;
        await this.ensureStarted();
        let r = this.cache.get(e);
        if (r && !r.dirty) {
          return r.value;
        }
        if (r) {
          r.dirty = false;
        }
        let o = await t();
        if (n !== this.generation) {
          continue;
        }
        let s = this.cache.get(e);
        if (s && !s.dirty) {
          s.value = o;
        }
        if (!s) {
          this.cache.set(e, {
            value: o,
            dirty: false,
            compute: t
          });
        }
        return o;
      }
    }
    async addRepo(e) {
      if (this.repoWatchers.vZc(e)) {
        return;
      }
      let t = await resolveGitDir(e);
      if (!t) {
        return;
      }
      if (this.repoWatchers.vZc(e)) {
        return;
      }
      let n = FN.join(t, "HEAD");
      let r = QDt(n, {
        interval: 1000
      }, () => {
        this.repoBranches.delete(e);
        for (let o of this.repoBranchListeners) {
          o();
        }
      });
      this.repoWatchers.set(e, {
        gitDir: t,
        headPath: n,
        listener: r
      });
    }
    removeRepo(e) {
      let t = this.repoWatchers.get(e);
      if (!t) {
        return;
      }
      Snt.unwatchFile(t.headPath, t.listener);
      this.repoWatchers.delete(e);
      this.repoBranches.delete(e);
    }
    onRepoBranchChange(e) {
      this.repoBranchListeners.push(e);
      return () => {
        let t = this.repoBranchListeners.indexOf(e);
        if (t !== -1) {
          this.repoBranchListeners.splice(t, 1);
        }
      };
    }
    async getBranchForRepo(e) {
      if (this.repoBranches.vZc(e)) {
        return this.repoBranches.get(e);
      }
      let t = this.repoWatchers.get(e)?.gitDir;
      if (!t) {
        return;
      }
      let n = await readGitHead(t);
      let r = n?.type === "branch" ? n.name : null;
      this.repoBranches.set(e, r);
      return r;
    }
    reset() {
      this.generation++;
      this.stopWatching();
      this.cache.clear();
      this.stateChanged.clear();
      this.repoBranches.clear();
      this.repoWatchers.clear();
      this.repoBranchListeners = [];
      this.initialized = false;
      this.initPromise = null;
      this.gitDir = null;
      this.commonDir = null;
    }
    reanchor() {
      this.generation++;
      for (let {
        path: e,
        listener: t
      } of this.watchedFiles) {
        Snt.unwatchFile(e, t);
      }
      this.watchedFiles = [];
      this.branchRefPath = null;
      this.cache.clear();
      this.initialized = false;
      this.initPromise = null;
      this.gitDir = null;
      this.commonDir = null;
    }
  }
  async function $4u() {
    let e = await resolveGitDir();
    if (!e) {
      return "HEAD";
    }
    let t = await readGitHead(e);
    if (!t) {
      return "HEAD";
    }
    return t.type === "branch" ? t.name : "HEAD";
  }
  async function H4u() {
    let e = await resolveGitDir();
    if (!e) {
      return "";
    }
    let t = await readGitHead(e);
    if (!t) {
      return "";
    }
    if (t.type === "branch") {
      return (await resolveRef(e, `refs/heads/${t.name}`)) ?? "";
    }
    return t.sha;
  }
  async function xgn(e) {
    return (await XDt(e, "remote", "origin", "pushurl")) || (await XDt(e, "remote", "origin", "url"));
  }
  async function j4u() {
    let e = await resolveGitDir();
    if (!e) {
      return null;
    }
    let t = await xgn(e);
    if (t) {
      return t;
    }
    let n = await getCommonDir(e);
    if (n && n !== e) {
      return xgn(n);
    }
    return null;
  }
  async function q4u() {
    let e = await resolveGitDir();
    if (!e) {
      return "main";
    }
    let t = (await getCommonDir(e)) ?? e;
    let n = await readRawSymref(t, "refs/remotes/origin/HEAD", "refs/remotes/origin/");
    if (n && (await resolveRef(t, `refs/remotes/origin/${n}`))) {
      return n;
    }
    for (let r of ["main", "master"]) {
      if (await resolveRef(t, `refs/remotes/origin/${r}`)) {
        return r;
      }
    }
    return "main";
  }
  function getCachedBranch() {
    return sY.get("branch", $4u);
  }
  function getCachedHead() {
    return sY.get("head", H4u);
  }
  function getCachedRemoteUrl() {
    return sY.get("remoteUrl", j4u);
  }
  function getCachedDefaultBranch() {
    return sY.get("defaultBranch", q4u);
  }
  function addWatchedRepo(e) {
    return sY.addRepo(e);
  }
  function removeWatchedRepo(e) {
    sY.removeRepo(e);
  }
  function onRepoBranchChange(e) {
    return sY.onRepoBranchChange(e);
  }
  function onWatchedGitStateChange(e) {
    sY.ensureStarted();
    return sY.onStateChange(e);
  }
  function getCachedBranchForRepo(e) {
    return sY.getBranchForRepo(e);
  }
  function resetGitFileWatcher() {
    sY.reset();
  }
  function reanchorGitFileWatcher() {
    sY.reanchor();
  }
  async function getHeadForDir(e) {
    let t = await resolveGitDir(e);
    if (!t) {
      return null;
    }
    let n = await readGitHead(t);
    if (!n) {
      return null;
    }
    if (n.type === "branch") {
      return resolveRef(t, `refs/heads/${n.name}`);
    }
    return n.sha;
  }
  async function readWorktreeHeadSha(e) {
    let t;
    try {
      let r = (await iY.readFile(FN.join(e, ".git"), "utf-8")).trim();
      if (!r.startsWith("gitdir:")) {
        return null;
      }
      let o = r.slice(7).trim();
      if (IB(o, e)) {
        return null;
      }
      t = FN.resolve(e, o);
    } catch {
      return null;
    }
    let n = await readGitHead(t);
    if (!n) {
      return null;
    }
    if (n.type === "branch") {
      return resolveRef(t, `refs/heads/${n.name}`);
    }
    return n.sha;
  }
  async function getRemoteUrlForDir(e) {
    let t = await resolveGitDir(e);
    if (!t) {
      return null;
    }
    let n = await xgn(t);
    if (n) {
      return n;
    }
    let r = await getCommonDir(t);
    if (r && r !== t) {
      return xgn(r);
    }
    return null;
  }
  async function isShallowClone() {
    let e = await resolveGitDir();
    if (!e) {
      return false;
    }
    let t = (await getCommonDir(e)) ?? e;
    try {
      await iY.stat(FN.join(t, "shallow"));
      return true;
    } catch {
      return false;
    }
  }
  async function getWorktreeCountFromFs() {
    try {
      let e = await resolveGitDir();
      if (!e) {
        return 0;
      }
      let t = (await getCommonDir(e)) ?? e;
      return (await iY.readdir(FN.join(t, "worktrees"))).length + 1;
    } catch {
      return 1;
    }
  }
  var Snt;
  var iY;
  var FN;
  var dje;
  var sY;
  var FP = __lazy(() => {
    E7();
    at();
    ru();
    mm();
    hd();
    vo();
    na();
    INr();
    ph();
    Rgn();
    xIs();
    Snt = require("fs");
    iY = require("fs/promises");
    FN = require("path");
    dje = new Map();
    sY = new PIs();
  });
  function rMt(e) {
    let t = MIs(e.replace(/[\t\n\r]/g, "").toLowerCase());
    if (t === "" || G4u.test(t)) {
      return t;
    }
    try {
      let n = new URL(`https://${t}`);
      if (n.username !== "" || n.password !== "" || n.port !== "" || n.pathname !== "/" || n.search !== "" || n.hash !== "") {
        return t;
      }
      return MIs(n.hostname);
    } catch {
      return t;
    }
  }
  function ef(e) {
    let t = rMt(e);
    while (t.startsWith("www.")) {
      t = t.slice(4);
    }
    return t === "github.com";
  }
  function Ign(e, t) {
    if (!e || !t) {
      return false;
    }
    let n = rMt(e);
    return n !== "" && n === rMt(t);
  }
  function oMt(e) {
    return ef(e) ? "https://api.github.com" : `https://${e}/api/v3`;
  }
  function NIs(e) {
    return ef(e) ? "https://api.github.com/graphql" : `https://${e}/api/graphql`;
  }
  function DIs(e) {
    return /[%\x00-\x1f\x7f-\u{10FFFF}]/u.test(e);
  }
  function sMt(e) {
    if (e.includes("://")) {
      try {
        let o = new URL(e);
        if (o.protocol === "http:" || o.protocol === "https:") {
          return false;
        }
        return DIs(o.hostname);
      } catch {
        return true;
      }
    }
    let t = e.indexOf(":");
    let n = e.indexOf("@");
    if (t >= 0 && n > t) {
      return true;
    }
    let r = e.match(/^(?:[^@]+@)?([^:]+):/)?.[1];
    return r ? DIs(r) : false;
  }
  function MIs(e) {
    let t = e.length;
    while (t > 0 && e[t - 1] === ".") {
      t--;
    }
    return e.slice(0, t);
  }
  var G4u;
  var fk = __lazy(() => {
    G4u = /[:/\\?#@\s]/;
  });
  var iMt = {};
  __export(iMt, {
    parseGitRemote: () => parseGitRemote,
    parseGitHubRepository: () => parseGitHubRepository,
    isCachedGitHubRepo: () => isCachedGitHubRepo,
    getCachedRepositoryHost: () => getCachedRepositoryHost,
    getCachedRepository: () => getCachedRepository,
    detectCurrentRepositoryWithHost: () => detectCurrentRepositoryWithHost,
    detectCurrentRepository: () => detectCurrentRepository,
    clearRepositoryCaches: () => clearRepositoryCaches
  });
  function clearRepositoryCaches() {
    Cke.clear();
  }
  async function detectCurrentRepository() {
    let e = await detectCurrentRepositoryWithHost();
    if (!e) {
      return null;
    }
    if (!ef(e.host)) {
      return null;
    }
    return `${e.owner}/${e.name}`;
  }
  async function detectCurrentRepositoryWithHost(e, t) {
    let n = e ?? Nt();
    if (!t?.skipCache && Cke.vZc(n)) {
      return Cke.get(n) ?? null;
    }
    try {
      let r = e === undefined ? await getRemoteUrl() : null;
      if (!r) {
        let {
          stdout: s,
          code: i
        } = await execFileNoThrowWithCwd(gitExe(), ["config", "--get", "remote.origin.url"], {
          cwd: n,
          preserveOutputOnError: false
        });
        r = i === 0 ? s.trim() || null : null;
      }
      if (logForDebugging(`Git remote URL: ${redactGitRemoteCredentials(r)}`), !r) {
        logForDebugging("No git remote URL found");
        return null;
      }
      let o = parseGitRemote(r);
      if (logForDebugging(`Parsed repository: ${o ? `${o.host}/${o.owner}/${o.name}` : null} from URL: ${redactGitRemoteCredentials(r)}`), o) {
        Cke.set(n, o);
      }
      return o;
    } catch (r) {
      logForDebugging(`Error detecting repository: ${r}`);
      return null;
    }
  }
  function getCachedRepository() {
    let e = Cke.get(Nt());
    if (!e || !ef(e.host)) {
      return null;
    }
    return `${e.owner}/${e.name}`;
  }
  function getCachedRepositoryHost() {
    return Cke.get(Nt())?.host ?? null;
  }
  function isCachedGitHubRepo() {
    let e = Nt();
    if (!Cke.vZc(e)) {
      return;
    }
    let t = Cke.get(e);
    return !!t && ef(t.host);
  }
  function parseGitRemote(e) {
    let t = e.trim();
    let n = t.match(/^git@([^:]+):([^/]+)\/([^/]+?)(?:\.git)?$/);
    if (n?.[1] && n[2] && n[3]) {
      if (!LIs(n[1])) {
        return null;
      }
      if (!Tnt(n[2]) || !Tnt(n[3])) {
        return null;
      }
      return {
        host: n[1],
        owner: n[2],
        name: n[3]
      };
    }
    let r = t.match(/^(https?|ssh|git):\/\/(?:[^@]+@)?([^/:]+(?::\d+)?)\/([^/]+)\/([^/]+?)(?:\.git)?$/);
    if (r?.[1] && r[2] && r[3] && r[4]) {
      let o = r[1];
      let s = r[2];
      let i = ii(s, ":");
      if (!LIs(i)) {
        return null;
      }
      let a = o === "https" || o === "http" ? s : i;
      if (!Tnt(r[3]) || !Tnt(r[4])) {
        return null;
      }
      return {
        host: a,
        owner: r[3],
        name: r[4]
      };
    }
    return null;
  }
  function parseGitHubRepository(e) {
    let t = e.trim();
    let n = parseGitRemote(t);
    if (n) {
      if (!ef(n.host)) {
        return null;
      }
      return `${n.owner}/${n.name}`;
    }
    if (!t.includes("://") && !t.includes("@") && t.includes("/")) {
      let r = t.split("/");
      if (r.length === 2 && r[0] && r[1]) {
        let o = r[1].replace(/\.git$/, "");
        if (!Tnt(r[0]) || !Tnt(o)) {
          return null;
        }
        return `${r[0]}/${o}`;
      }
    }
    logForDebugging(`Could not parse repository from: ${t}`);
    return null;
  }
  function Tnt(e) {
    return z4u.test(e) && !e.startsWith("-") && e !== "." && e !== "..";
  }
  function LIs(e) {
    if (!e.includes(".")) {
      return false;
    }
    let t = e.split(".").pop();
    if (!t) {
      return false;
    }
    return /^[a-zA-Z]+$/.test(t);
  }
  var Cke;
  var z4u;
  var bI = __lazy(() => {
    vo();
    je();
    ji();
    na();
    fk();
    Zn();
    Cke = new Map();
    z4u = /^[A-Za-z0-9._-]+$/;
  });
  var Fgn = {};
  __export(Fgn, {
    stashToCleanState: () => stashToCleanState,
    redactGitRemoteCredentials: () => redactGitRemoteCredentials,
    preserveGitStateForIssue: () => preserveGitStateForIssue,
    normalizeGitRemoteUrl: () => normalizeGitRemoteUrl,
    isLocalHost: () => isLocalHost,
    isLinkedWorktree: () => isLinkedWorktree,
    isCurrentDirectoryBareGitRepo: () => isCurrentDirectoryBareGitRepo,
    isBranchOnOrigin: () => isBranchOnOrigin,
    isAtGitRoot: () => isAtGitRoot,
    hasUnpushedCommits: () => hasUnpushedCommits,
    gitExe: () => gitExe,
    getWorktreeCount: () => getWorktreeCount,
    getRepoRemoteHash: () => getRepoRemoteHash,
    getRemoteUrlForBridge: () => getRemoteUrlForBridge,
    getRemoteUrl: () => getRemoteUrl,
    getIsHeadOnRemote: () => getIsHeadOnRemote,
    getIsGit: () => getIsGit,
    getIsClean: () => getIsClean,
    getHead: () => getHead,
    getGithubRepo: () => getGithubRepo,
    getGitWorktreeName: () => getGitWorktreeName,
    getGitState: () => getGitState,
    getGitDir: () => getGitDir,
    getFileStatus: () => getFileStatus,
    getDefaultBranch: () => getDefaultBranch,
    getChangedFiles: () => getChangedFiles,
    getBranch: () => getBranch,
    findRepoRemoteSlug: () => findRepoRemoteSlug,
    findRemoteBase: () => findRemoteBase,
    findGitRootRecheckingNegative: () => findGitRootRecheckingNegative,
    findGitRoot: () => findGitRoot,
    findCanonicalGitRoot: () => findCanonicalGitRoot,
    dirIsInGitRepo: () => dirIsInGitRepo
  });
  function K4u() {
    function e(t) {
      let n = Ogn(t);
      return n === VNr ? null : n;
    }
    e.cache = Ogn.cache;
    return e;
  }
  function findGitRootRecheckingNegative(e) {
    if (Ogn.cache.get(e) === VNr) {
      Ogn.cache.delete(e);
    }
    return findGitRoot(e);
  }
  function isLinkedWorktree(e) {
    let t = findGitRoot(e);
    return t !== null && findCanonicalGitRoot(e) !== t;
  }
  async function getGitWorktreeName(e) {
    if (va()) {
      return null;
    }
    let t = await resolveGitDir(e);
    if (!t || pu.basename(t) === ".git" || pu.basename(pu.dirname(t)) !== "worktrees") {
      return null;
    }
    return pu.basename(t);
  }
  function Y4u() {
    function e(t) {
      let n = findGitRoot(t);
      if (!n) {
        return null;
      }
      return FIs(n);
    }
    e.cache = FIs.cache;
    return e;
  }
  function getGitDir(e) {
    return resolveGitDir(e);
  }
  async function isAtGitRoot() {
    let e = Nt();
    let t = findGitRoot(e);
    if (!t) {
      return false;
    }
    try {
      let [n, r] = await Promise.all([kye.realpath(e), kye.realpath(t)]);
      return n === r;
    } catch {
      return e === t;
    }
  }
  async function isBranchOnOrigin(e, t) {
    return (await execFileNoThrowWithCwd(gitExe(), ["show-ref", "--verify", "--quiet", `refs/remotes/origin/${e}`], {
      cwd: t ?? Nt(),
      preserveOutputOnError: false
    })).code === 0;
  }
  function redactGitRemoteCredentials(e) {
    return e == null ? e : e.replace(/:\/\/[^/]*@/, "://***@");
  }
  function normalizeGitRemoteUrl(e) {
    let t = e.trim();
    if (!t) {
      return null;
    }
    let n = t.match(/^git@([^:]+):(.+?)(?:\.git)?$/);
    if (n && n[1] && n[2]) {
      return `${n[1]}/${n[2]}`.toLowerCase();
    }
    let r = t.match(/^(?:https?|ssh):\/\/(?:[^@]+@)?([^/]+)\/(.+?)(?:\.git)?$/);
    if (r && r[1] && r[2]) {
      let o = r[1];
      let s = r[2];
      if (isLocalHost(o) && s.startsWith("git/")) {
        let i = s.slice(4);
        let a = i.split("/");
        if (a.length >= 3 && a[0].includes(".")) {
          return i.toLowerCase();
        }
        return `github.com/${i}`.toLowerCase();
      }
      return `${o}/${s}`.toLowerCase();
    }
    return null;
  }
  function X4u(e) {
    for (let t of [pu.join(e, ".git", "config"), pu.join(e, "config")]) {
      try {
        return UN.readFileSync(t, "utf-8");
      } catch {}
    }
    return null;
  }
  function findRepoRemoteSlug(e) {
    let t = Q4u(e);
    return t === GNr ? null : t;
  }
  async function getRepoRemoteHash() {
    let e = await getRemoteUrl();
    if (!e) {
      return null;
    }
    let t = normalizeGitRemoteUrl(e);
    if (!t) {
      return null;
    }
    return jIs.createHash("sha256").update(t).digest("hex").substring(0, 16);
  }
  async function getGitState() {
    try {
      let [e, t, n, r, o, s] = await Promise.all([getHead(), getBranch(), getRemoteUrl(), getIsHeadOnRemote(), getIsClean(), getWorktreeCount()]);
      Pe("git_status_fetch");
      return {
        commitHash: e,
        branchName: t,
        remoteUrl: n,
        isHeadOnRemote: r,
        isClean: o,
        worktreeCount: s
      };
    } catch (e) {
      Et("git_status_fetch", "git_status_fetch_failed");
      return null;
    }
  }
  async function getGithubRepo() {
    let {
      parseGitRemote: e
    } = await Promise.resolve().then(() => (bI(), iMt));
    let t = await getRemoteUrl();
    if (!t) {
      logForDebugging("Local GitHub repo: unknown");
      return null;
    }
    let n = e(t);
    if (n && ef(n.host)) {
      let r = `${n.owner}/${n.name}`;
      logForDebugging(`Local GitHub repo: ${r}`);
      return r;
    }
    logForDebugging("Local GitHub repo: unknown");
    return null;
  }
  async function findRemoteBase() {
    let {
      stdout: e,
      code: t
    } = await execFileNoThrow(gitExe(), ["rev-parse", "--abbrev-ref", "--symbolic-full-name", "@{u}"], {
      preserveOutputOnError: false
    });
    if (t === 0 && e.trim()) {
      return e.trim();
    }
    let {
      stdout: n,
      code: r
    } = await execFileNoThrow(gitExe(), ["symbolic-ref", "--short", "refs/remotes/origin/HEAD"], {
      preserveOutputOnError: false
    });
    let o = ["origin/main", "origin/staging", "origin/master"];
    let s = n.trim();
    if (r === 0 && s) {
      o.unshift(s);
    }
    for (let i of o) {
      let {
        code: a
      } = await execFileNoThrow(gitExe(), ["rev-parse", "--verify", i], {
        preserveOutputOnError: false
      });
      if (a === 0) {
        return i;
      }
    }
    return null;
  }
  function nWu() {
    return isShallowClone();
  }
  async function Pgn() {
    let {
      stdout: e,
      code: t
    } = await execFileNoThrow(gitExe(), ["ls-files", "--others", "--exclude-standard"], {
      preserveOutputOnError: false
    });
    let n = e.trim();
    if (t !== 0 || !n) {
      return [];
    }
    let r = n.split(`
`).filter(Boolean);
    let o = [];
    let s = 0;
    for (let i of r) {
      if (o.length >= 200) {
        logForDebugging(`Untracked file capture: reached max file count (${200})`);
        break;
      }
      if (YDt(i)) {
        continue;
      }
      try {
        let l = (await kye.stat(i)).size;
        if (l > 1048576) {
          logForDebugging(`Untracked file capture: skipping ${i} (exceeds ${1048576} bytes)`);
          continue;
        }
        if (s + l > 52428800) {
          logForDebugging(`Untracked file capture: reached total size limit (${52428800} bytes)`);
          break;
        }
        if (l === 0) {
          o.push({
            path: i,
            content: ""
          });
          continue;
        }
        let c = Math.min(65536, l);
        let u = await kye.open(i, "r");
        try {
          let d = Buffer.alloc(c);
          let {
            bytesRead: p
          } = await u.read(d, 0, c, 0);
          let m = d.subarray(0, p);
          if (xNr(m)) {
            continue;
          }
          let f;
          if (l <= c) {
            f = m.toString("utf-8");
          } else {
            f = await kye.readFile(i, "utf-8");
          }
          o.push({
            path: i,
            content: f
          });
          s += l;
        } finally {
          await u.close();
        }
      } catch (a) {
        logForDebugging(`Failed to read untracked file ${i}: ${a}`);
      }
    }
    return o;
  }
  async function preserveGitStateForIssue() {
    try {
      if (!(await getIsGit())) {
        return null;
      }
      if (await nWu()) {
        logForDebugging("Shallow clone detected, using HEAD-only mode for issue");
        let [{
          stdout: m
        }, f] = await Promise.all([execFileNoThrow(gitExe(), ["diff", "HEAD"]), Pgn()]);
        return {
          remote_base_sha: null,
          remote_base: null,
          patch: m || "",
          untracked_files: f,
          format_patch: null,
          head_sha: null,
          branch_name: null
        };
      }
      let t = await findRemoteBase();
      if (!t) {
        logForDebugging("No remote found, using HEAD-only mode for issue");
        let [{
          stdout: m
        }, f] = await Promise.all([execFileNoThrow(gitExe(), ["diff", "HEAD"]), Pgn()]);
        return {
          remote_base_sha: null,
          remote_base: null,
          patch: m || "",
          untracked_files: f,
          format_patch: null,
          head_sha: null,
          branch_name: null
        };
      }
      let {
        stdout: n,
        code: r
      } = await execFileNoThrow(gitExe(), ["merge-base", "HEAD", t], {
        preserveOutputOnError: false
      });
      if (r !== 0 || !n.trim()) {
        logForDebugging("Merge-base failed, using HEAD-only mode for issue");
        let [{
          stdout: m
        }, f] = await Promise.all([execFileNoThrow(gitExe(), ["diff", "HEAD"]), Pgn()]);
        return {
          remote_base_sha: null,
          remote_base: null,
          patch: m || "",
          untracked_files: f,
          format_patch: null,
          head_sha: null,
          branch_name: null
        };
      }
      let o = n.trim();
      let [{
        stdout: s
      }, i, {
        stdout: a,
        code: l
      }, {
        stdout: c
      }, {
        stdout: u
      }] = await Promise.all([execFileNoThrow(gitExe(), ["diff", o]), Pgn(), execFileNoThrow(gitExe(), ["format-patch", `${o}..HEAD`, "--stdout"]), execFileNoThrow(gitExe(), ["rev-parse", "HEAD"]), execFileNoThrow(gitExe(), ["rev-parse", "--abbrev-ref", "HEAD"])]);
      let d = null;
      if (l === 0 && a && a.trim()) {
        d = a;
      }
      let p = u?.trim();
      return {
        remote_base_sha: o,
        remote_base: t,
        patch: s || "",
        untracked_files: i,
        format_patch: d,
        head_sha: c?.trim() || null,
        branch_name: p && p !== "HEAD" ? p : null
      };
    } catch (e) {
      logForDebugging(`Failed to preserve git state for issue: ${e}`, {
        level: "error"
      });
      return null;
    }
  }
  function isLocalHost(e) {
    let t = e.indexOf(":");
    let n = t === -1 ? e : e.slice(0, t);
    let r = t === -1 ? "" : e.slice(t + 1);
    if (r !== "" && !/^\d+$/.test(r)) {
      return false;
    }
    return n === "localhost" || /^127\.\d{1,3}\.\d{1,3}\.\d{1,3}$/.test(n);
  }
  function HIs(e, t) {
    let n = /\/+/;
    let r = t.split(n);
    let o = r[0] === "" ? pu.sep : r[0] + pu.sep;
    let s = 0;
    for (let i = 1; i < r.length; i++) {
      let a = r[i];
      if (a === "" || a === ".") {
        continue;
      }
      if (a === "..") {
        o = pu.dirname(o);
        continue;
      }
      let l = o.endsWith(pu.sep) ? o + a : o + pu.sep + a;
      let c;
      try {
        c = e.lstatSync(l);
      } catch {
        return null;
      }
      if (!c.isSymbolicLink()) {
        o = l;
        continue;
      }
      if (++s > 64) {
        return null;
      }
      let u;
      try {
        u = e.readlinkSync(l);
      } catch {
        return null;
      }
      if (Rc(u)) {
        return null;
      }
      let d = u.split(n);
      if (pu.isAbsolute(u)) {
        r.splice(0, i + 1, ...d);
        o = d[0] === "" ? pu.sep : d[0] + pu.sep;
        i = 0;
      } else {
        r.splice(i, 1, ...d);
        i--;
      }
    }
    return o;
  }
  function isCurrentDirectoryBareGitRepo() {
    let e = zt();
    let t = Nt();
    let n = HIs(e, t) ?? t;
    n = n.normalize("NFC").toLowerCase();
    let r = n.endsWith(pu.sep) ? n : n + pu.sep;
    let o = p => {
      let m = p.toLowerCase();
      return m === n || m.startsWith(r);
    };
    function s(p) {
      if (Rc(p)) {
        if (!/^[\\/]{2}wsl(\$|\.localhost)[\\/]/i.test(p)) {
          return null;
        }
        if (!Rc(t)) {
          return {
            canonical: p.normalize("NFC"),
            crossOs: true
          };
        }
      }
      let m = HIs(e, p);
      if (m === null) {
        return null;
      }
      return {
        canonical: m.normalize("NFC"),
        crossOs: false
      };
    }
    function i(p, m) {
      if (!m && o(p)) {
        return true;
      }
      for (let f of p.split(m ? /[\\/]+/ : pu.sep)) {
        if (f.toLowerCase() === ".git") {
          return false;
        }
      }
      return true;
    }
    function a(p) {
      try {
        let m = e.lstatSync(pu.join(p, "HEAD"));
        if (!m.isFile() || m.size > 4096) {
          return false;
        }
        let f = UN.readFileSync(pu.join(p, "HEAD"), "utf8").slice(0, 255);
        return /^ref:[ \t]*refs\//.test(f) || /^[0-9a-f]{40}([0-9a-f]{24})?[ \t\n\r]*$/.test(f);
      } catch {
        return false;
      }
    }
    function l(p) {
      try {
        let m = pu.join(p, "HEAD");
        let f = e.lstatSync(m);
        if (!f.isFile() || f.size > 4096) {
          return false;
        }
        let h = UN.readFileSync(m, "utf8").slice(0, 255);
        if (!/^ref:[ \t]*refs\//.test(h) && !/^[0-9a-f]{40}([0-9a-f]{24})?[ \t\n\r]*$/.test(h)) {
          return false;
        }
        for (let g of ["objects", "refs"]) {
          let y = pu.join(p, g);
          if (!e.statSync(y).isDirectory()) {
            return false;
          }
          UN.accessSync(y, UN.constants.X_OK);
        }
        try {
          e.statSync(pu.join(p, "commondir"));
          return false;
        } catch {}
        return true;
      } catch {
        return false;
      }
    }
    function c(p) {
      try {
        let m = e.lstatSync(pu.join(p, "HEAD"));
        if (m.isFile() || m.isSymbolicLink()) {
          return true;
        }
      } catch {}
      for (let m of ["objects", "refs"]) {
        try {
          e.statSync(pu.join(p, m));
          return true;
        } catch {}
      }
      return false;
    }
    function u(p) {
      let m = f => {
        let h = s(f);
        if (h === null) {
          Et("git_bare_repo_gate", "gitdir_target_uncanonical");
          return "plantable";
        }
        if (i(h.canonical, h.crossOs)) {
          Et("git_bare_repo_gate", "gitdir_target_plantable");
          return "plantable";
        }
        return a(h.canonical) ? "trusted" : "none";
      };
      try {
        let f = e.lstatSync(pu.join(p, ".git"));
        if (f.isSymbolicLink()) {
          let h;
          try {
            h = e.readlinkSync(pu.join(p, ".git"));
          } catch {
            return "plantable";
          }
          return m(pu.isAbsolute(h) ? h : p + pu.sep + h);
        }
        if (f.isFile()) {
          if (f.size > 4096) {
            return "oversized";
          }
          try {
            let h = UN.readFileSync(pu.join(p, ".git"), "utf8");
            if (h.includes("\x00")) {
              return "plantable";
            }
            if (!h.startsWith("gitdir: ")) {
              return "none";
            }
            let g = h.slice(8).replace(/[\r\n]+$/, "");
            return m(pu.isAbsolute(g) ? g : p + pu.sep + g);
          } catch {
            return "none";
          }
        }
        if (f.isDirectory()) {
          return l(pu.join(p, ".git")) ? "trusted" : "none";
        }
      } catch {}
      return "none";
    }
    switch (u(t)) {
      case "plantable":
        return "gitdir-redirect-plantable";
      case "oversized":
        return "gitdir-file-oversized";
      case "trusted":
        Pe("git_bare_repo_gate");
        return false;
      case "none":
        break;
    }
    let d = t;
    for (;;) {
      if (c(d)) {
        Et("git_bare_repo_gate", "bare_indicators");
        return "bare-indicators";
      }
      let p = pu.dirname(d);
      if (p === d) {
        break;
      }
      switch (u(p)) {
        case "trusted":
          Pe("git_bare_repo_gate");
          return false;
        case "plantable":
          return "gitdir-redirect-plantable";
        case "oversized":
          return "gitdir-file-oversized";
        case "none":
          break;
      }
      d = p;
    }
    Pe("git_bare_repo_gate");
    return false;
  }
  var jIs;
  var UN;
  var kye;
  var qIs;
  var pu;
  var VNr;
  var Ogn;
  var findGitRoot;
  var FIs;
  var findCanonicalGitRoot;
  var gitExe;
  var getIsGit;
  var dirIsInGitRepo = async e => findGitRoot(e) !== null;
  var getHead = async () => getCachedHead();
  var getBranch = async e => {
    if (e === undefined) {
      return getCachedBranch();
    }
    let {
      stdout: t,
      code: n
    } = await execFileNoThrowWithCwd(gitExe(), ["rev-parse", "--abbrev-ref", "HEAD"], {
      cwd: e,
      preserveOutputOnError: false
    });
    return n === 0 ? t.trim() || "HEAD" : "HEAD";
  };
  var getDefaultBranch = async e => {
    if (e === undefined) {
      return getCachedDefaultBranch();
    }
    let {
      stdout: t,
      code: n
    } = await execFileNoThrowWithCwd(gitExe(), ["symbolic-ref", "--short", "refs/remotes/origin/HEAD"], {
      cwd: e,
      preserveOutputOnError: false
    });
    let r = n === 0 ? t.trim().replace(/^origin\//, "") : "";
    let o = r ? [r, "main", "master"] : ["main", "master"];
    for (let s of o) {
      if ((await execFileNoThrowWithCwd(gitExe(), ["show-ref", "--verify", "--quiet", `refs/remotes/origin/${s}`], {
        cwd: e,
        preserveOutputOnError: false
      })).code === 0) {
        return s;
      }
    }
    return "main";
  };
  var getRemoteUrl = async () => getCachedRemoteUrl();
  var getRemoteUrlForBridge = async () => {
    let e = findGitRoot(Nt());
    if (e === null) {
      return null;
    }
    try {
      let t = qIs.homedir();
      if (t && e === pu.resolve(t)) {
        return null;
      }
    } catch {}
    return getCachedRemoteUrl();
  };
  var GNr;
  var Q4u;
  var getIsHeadOnRemote = async () => {
    let {
      code: e
    } = await execFileNoThrow(gitExe(), ["rev-parse", "@{u}"], {
      preserveOutputOnError: false
    });
    return e === 0;
  };
  var hasUnpushedCommits = async e => {
    let {
      stdout: t,
      code: n
    } = await execFileNoThrowWithCwd(gitExe(), ["rev-list", "--count", "@{u}..HEAD"], {
      cwd: e,
      preserveOutputOnError: false
    });
    return n === 0 && parseInt(t.trim(), 10) > 0;
  };
  var getIsClean = async e => {
    let t = ["--no-optional-locks", "status", "--porcelain"];
    if (e?.ignoreUntracked) {
      t.push("-uno");
    }
    let {
      stdout: n
    } = await execFileNoThrow(gitExe(), t, {
      preserveOutputOnError: false
    });
    return n.trim().length === 0;
  };
  var getChangedFiles = async () => {
    let {
      stdout: e
    } = await execFileNoThrow(gitExe(), ["--no-optional-locks", "status", "--porcelain"], {
      preserveOutputOnError: false
    });
    return e.trim().split(`
`).map(t => t.trim().split(" ", 2)[1]?.trim()).filter(t => typeof t === "string");
  };
  var getFileStatus = async () => {
    let {
      stdout: e
    } = await execFileNoThrow(gitExe(), ["--no-optional-locks", "status", "--porcelain"], {
      preserveOutputOnError: false
    });
    let t = [];
    let n = [];
    e.trim().split(`
`).filter(r => r.length > 0).forEach(r => {
      let o = r.substring(0, 2);
      let s = r.substring(2).trim();
      if (o === "??") {
        n.push(s);
      } else if (s) {
        t.push(s);
      }
    });
    return {
      tracked: t,
      untracked: n
    };
  };
  var getWorktreeCount = async () => getWorktreeCountFromFs();
  var stashToCleanState = async e => {
    try {
      let t = e || `Claude Code auto-stash - ${new Date().toISOString()}`;
      let {
        untracked: n
      } = await getFileStatus();
      if (n.length > 0) {
        let {
          code: o
        } = await execFileNoThrow(gitExe(), ["add", "--", ...n], {
          preserveOutputOnError: false
        });
        if (o !== 0) {
          return false;
        }
      }
      let {
        code: r
      } = await execFileNoThrow(gitExe(), ["stash", "push", "--message", t], {
        preserveOutputOnError: false
      });
      return r === 0;
    } catch (t) {
      return false;
    }
  };
  var na = __lazy(() => {
    at();
    Cgn();
    ru();
    ln();
    mm();
    vo();
    je();
    Zm();
    ji();
    Rgn();
    FP();
    fk();
    nW();
    jIs = require("crypto");
    UN = require("fs");
    kye = require("fs/promises");
    qIs = require("os");
    pu = require("path");
    VNr = Symbol("git-root-not-found");
    Ogn = mk(e => {
      let t = Date.now();
      wn("info", "find_git_root_started");
      let n = pu.resolve(e);
      let r = n.substring(0, n.indexOf(pu.sep) + 1) || pu.sep;
      let o = 0;
      while (n !== r) {
        try {
          let i = pu.join(n, ".git");
          o++;
          let a = UN.statSync(i);
          if (a.isDirectory() || a.isFile()) {
            wn("info", "find_git_root_completed", {
              duration_ms: Date.now() - t,
              stat_count: o,
              found: true
            });
            return n;
          }
        } catch {}
        let s = pu.dirname(n);
        if (s === n) {
          break;
        }
        n = s;
      }
      try {
        let s = pu.join(r, ".git");
        o++;
        let i = UN.statSync(s);
        if (i.isDirectory() || i.isFile()) {
          wn("info", "find_git_root_completed", {
            duration_ms: Date.now() - t,
            stat_count: o,
            found: true
          });
          return r;
        }
      } catch {}
      wn("info", "find_git_root_completed", {
        duration_ms: Date.now() - t,
        stat_count: o,
        found: false
      });
      return VNr;
    }, e => e, 50);
    findGitRoot = K4u();
    FIs = mk(e => {
      try {
        let t = UN.readFileSync(pu.join(e, ".git"), "utf-8").trim();
        if (!t.startsWith("gitdir:")) {
          return e;
        }
        let n = t.slice(7).trim();
        if (IB(n, e)) {
          return e;
        }
        let r = pu.resolve(e, n);
        let o = UN.readFileSync(pu.join(r, "commondir"), "utf-8").trim();
        if (IB(o, r)) {
          return e;
        }
        let s = pu.resolve(r, o);
        if (pu.resolve(pu.dirname(r)) !== pu.join(s, "worktrees")) {
          return e;
        }
        let i = UN.readFileSync(pu.join(r, "gitdir"), "utf-8").trim();
        if (IB(i, e)) {
          return e;
        }
        if (UN.realpathSync(pu.resolve(r, i)) !== pu.join(UN.realpathSync(e), ".git")) {
          return e;
        }
        if (pu.basename(s) !== ".git") {
          return s;
        }
        return pu.dirname(s);
      } catch {
        return e;
      }
    }, e => e, 50);
    findCanonicalGitRoot = Y4u();
    gitExe = TEr(() => MTs("git") || "git");
    getIsGit = TEr(async () => {
      let e = Date.now();
      wn("info", "is_git_check_started");
      let t = findGitRoot(Nt()) !== null;
      wn("info", "is_git_check_completed", {
        duration_ms: Date.now() - e,
        is_git: t
      });
      return t;
    }, () => getSessionId());
    GNr = Symbol("remote-slug-not-found");
    Q4u = mk(e => {
      let t = X4u(e);
      if (!t) {
        return GNr;
      }
      let n = r => {
        let o = ANr(t, "remote", "origin", r);
        return o ? normalizeGitRemoteUrl(o) : null;
      };
      return n("pushurl") ?? n("url") ?? GNr;
    }, e => e, 50);
  });
  async function Ugn(e, t) {
    let {
      code: n
    } = await execFileNoThrowWithCwd("git", ["check-ignore", "--", e], {
      preserveOutputOnError: false,
      cwd: t
    });
    return n === 0;
  }
  async function sWu(e) {
    let {
      stdout: t,
      code: n
    } = await execFileNoThrowWithCwd("git", ["config", "--global", "--get", "core.excludesfile"], {
      preserveOutputOnError: false,
      cwd: e
    });
    let r = n === 0 ? t.trim() : "";
    if (r) {
      if (r === "~" || r.startsWith("~/")) {
        return Iye.join(e1r.homedir(), r.slice(2));
      }
      if (Iye.isAbsolute(r)) {
        return r;
      }
    }
    let o = process.env.XDG_CONFIG_HOME;
    if (o && Iye.isAbsolute(o)) {
      return Iye.join(o, "git", "ignore");
    }
    return Iye.join(e1r.homedir(), ".config", "git", "ignore");
  }
  async function Bgn(e, t = Nt()) {
    try {
      if (!(await dirIsInGitRepo(t))) {
        return {
          written: false,
          effective: false
        };
      }
      let n = e.replaceAll("\\", "/");
      let r = `**/${n}`;
      let o = n.endsWith("/") ? `${n}sample-file.txt` : n;
      if (await Ugn(o, t)) {
        return {
          written: false,
          effective: true
        };
      }
      let s = await sWu(t);
      let i = Iye.dirname(s);
      await kke.mkdir(i, {
        recursive: true
      });
      try {
        if ((await kke.readFile(s, {
          encoding: "utf-8"
        })).includes(r)) {
          let c = (await GIs(o, t)) ? "already_tracked" : "excludesfile_not_read";
          logForDebugging(`[gitignore] '${r}' already present in ${s} but git check-ignore reports not-ignored \u2014 ${VIs(c, o)}`, {
            level: "warn"
          });
          return {
            written: false,
            effective: false,
            reason: c
          };
        }
        await kke.appendFile(s, `
${r}
`);
      } catch (l) {
        if (en(l) === "ENOENT") {
          await kke.writeFile(s, `${r}
`, "utf-8");
        } else {
          throw l;
        }
      }
      if (!(await Ugn(o, t))) {
        let l = (await GIs(o, t)) ? "already_tracked" : "excludesfile_not_read";
        logForDebugging(`[gitignore] wrote '${r}' to ${s} but git check-ignore still reports not-ignored \u2014 ${VIs(l, o)}`, {
          level: "warn"
        });
        return {
          written: true,
          effective: false,
          reason: l
        };
      }
      return {
        written: true,
        effective: true
      };
    } catch (n) {
      logForDebugging(`Failed to add gitignore entry to global gitignore: ${n instanceof Error ? n.message : String(n)}`, {
        level: "error"
      });
      return {
        written: false,
        effective: false
      };
    }
  }
  async function GIs(e, t) {
    let {
      code: n
    } = await execFileNoThrowWithCwd("git", ["ls-files", "--error-unmatch", "--", e], {
      preserveOutputOnError: false,
      cwd: t
    });
    return n === 0;
  }
  function VIs(e, t) {
    return e === "already_tracked" ? `'${t}' is tracked in the index; gitignore rules do not apply to tracked files` : "core.excludesfile may point elsewhere";
  }
  var kke;
  var e1r;
  var Iye;
  var $gn = __lazy(() => {
    vo();
    je();
    dt();
    ji();
    na();
    kke = require("fs/promises");
    e1r = require("os");
    Iye = require("path");
  });
  function pMt(e, t = false) {
    let n = e.length;
    let r = 0;
    let o = "";
    let s = 0;
    let i = 16;
    let a = 0;
    let l = 0;
    let c = 0;
    let u = 0;
    let d = 0;
    function p(b, S) {
      let E = 0;
      let C = 0;
      while (E < b || !S) {
        let x = e.charCodeAt(r);
        if (x >= 48 && x <= 57) {
          C = C * 16 + x - 48;
        } else if (x >= 65 && x <= 70) {
          C = C * 16 + x - 65 + 10;
        } else if (x >= 97 && x <= 102) {
          C = C * 16 + x - 97 + 10;
        } else {
          break;
        }
        r++;
        E++;
      }
      if (E < b) {
        C = -1;
      }
      return C;
    }
    function m(b) {
      r = b;
      o = "";
      s = 0;
      i = 16;
      d = 0;
    }
    function f() {
      let b = r;
      if (e.charCodeAt(r) === 48) {
        r++;
      } else {
        r++;
        while (r < e.length && wnt(e.charCodeAt(r))) {
          r++;
        }
      }
      if (r < e.length && e.charCodeAt(r) === 46) {
        if (r++, r < e.length && wnt(e.charCodeAt(r))) {
          r++;
          while (r < e.length && wnt(e.charCodeAt(r))) {
            r++;
          }
        } else {
          d = 3;
          return e.substring(b, r);
        }
      }
      let S = r;
      if (r < e.length && (e.charCodeAt(r) === 69 || e.charCodeAt(r) === 101)) {
        if (r++, r < e.length && e.charCodeAt(r) === 43 || e.charCodeAt(r) === 45) {
          r++;
        }
        if (r < e.length && wnt(e.charCodeAt(r))) {
          r++;
          while (r < e.length && wnt(e.charCodeAt(r))) {
            r++;
          }
          S = r;
        } else {
          d = 3;
        }
      }
      return e.substring(b, S);
    }
    function h() {
      let b = "";
      let S = r;
      while (true) {
        if (r >= n) {
          b += e.substring(S, r);
          d = 2;
          break;
        }
        let E = e.charCodeAt(r);
        if (E === 34) {
          b += e.substring(S, r);
          r++;
          break;
        }
        if (E === 92) {
          if (b += e.substring(S, r), r++, r >= n) {
            d = 2;
            break;
          }
          switch (e.charCodeAt(r++)) {
            case 34:
              b += '"';
              break;
            case 92:
              b += "\\";
              break;
            case 47:
              b += "/";
              break;
            case 98:
              b += "\b";
              break;
            case 102:
              b += "\f";
              break;
            case 110:
              b += `
`;
              break;
            case 114:
              b += "\r";
              break;
            case 116:
              b += "\t";
              break;
            case 117:
              let x = p(4, true);
              if (x >= 0) {
                b += String.fromCharCode(x);
              } else {
                d = 4;
              }
              break;
            default:
              d = 5;
          }
          S = r;
          continue;
        }
        if (E >= 0 && E <= 31) {
          if (dMt(E)) {
            b += e.substring(S, r);
            d = 2;
            break;
          } else {
            d = 6;
          }
        }
        r++;
      }
      return b;
    }
    function g() {
      if (o = "", d = 0, s = r, l = a, u = c, r >= n) {
        s = n;
        return i = 17;
      }
      let b = e.charCodeAt(r);
      if (t1r(b)) {
        do {
          r++;
          o += String.fromCharCode(b);
          b = e.charCodeAt(r);
        } while (t1r(b));
        return i = 15;
      }
      if (dMt(b)) {
        if (r++, o += String.fromCharCode(b), b === 13 && e.charCodeAt(r) === 10) {
          r++;
          o += `
`;
        }
        a++;
        c = r;
        return i = 14;
      }
      switch (b) {
        case 123:
          r++;
          return i = 1;
        case 125:
          r++;
          return i = 2;
        case 91:
          r++;
          return i = 3;
        case 93:
          r++;
          return i = 4;
        case 58:
          r++;
          return i = 6;
        case 44:
          r++;
          return i = 5;
        case 34:
          r++;
          o = h();
          return i = 10;
        case 47:
          let S = r - 1;
          if (e.charCodeAt(r + 1) === 47) {
            r += 2;
            while (r < n) {
              if (dMt(e.charCodeAt(r))) {
                break;
              }
              r++;
            }
            o = e.substring(S, r);
            return i = 12;
          }
          if (e.charCodeAt(r + 1) === 42) {
            r += 2;
            let E = n - 1;
            let C = false;
            while (r < E) {
              let x = e.charCodeAt(r);
              if (x === 42 && e.charCodeAt(r + 1) === 47) {
                r += 2;
                C = true;
                break;
              }
              if (r++, dMt(x)) {
                if (x === 13 && e.charCodeAt(r) === 10) {
                  r++;
                }
                a++;
                c = r;
              }
            }
            if (!C) {
              r++;
              d = 1;
            }
            o = e.substring(S, r);
            return i = 13;
          }
          o += String.fromCharCode(b);
          r++;
          return i = 16;
        case 45:
          if (o += String.fromCharCode(b), r++, r === n || !wnt(e.charCodeAt(r))) {
            return i = 16;
          }
        case 48:
        case 49:
        case 50:
        case 51:
        case 52:
        case 53:
        case 54:
        case 55:
        case 56:
        case 57:
          o += f();
          return i = 11;
        default:
          while (r < n && y(b)) {
            r++;
            b = e.charCodeAt(r);
          }
          if (s !== r) {
            switch (o = e.substring(s, r), o) {
              case "true":
                return i = 8;
              case "false":
                return i = 9;
              case "null":
                return i = 7;
            }
            return i = 16;
          }
          o += String.fromCharCode(b);
          r++;
          return i = 16;
      }
    }
    function y(b) {
      if (t1r(b) || dMt(b)) {
        return false;
      }
      switch (b) {
        case 125:
        case 93:
        case 123:
        case 91:
        case 34:
        case 58:
        case 44:
        case 47:
          return false;
      }
      return true;
    }
    function _() {
      let b;
      do {
        b = g();
      } while (b >= 12 && b <= 15);
      return b;
    }
    return {
      setPosition: m,
      getPosition: () => r,
      scan: t ? _ : g,
      getToken: () => i,
      getTokenValue: () => o,
      getTokenOffset: () => s,
      getTokenLength: () => r - s,
      getTokenStartLine: () => l,
      getTokenStartCharacter: () => s - u,
      getTokenError: () => d
    };
  }
  function t1r(e) {
    return e === 32 || e === 9;
  }
  function dMt(e) {
    return e === 10 || e === 13;
  }
  function wnt(e) {
    return e >= 48 && e <= 57;
  }
  var zIs;
  var Hgn = __lazy(() => {
    (function (e) {
      e[e.lineFeed = 10] = "lineFeed";
      e[e.carriageReturn = 13] = "carriageReturn";
      e[e.space = 32] = "space";
      e[e._0 = 48] = "_0";
      e[e._1 = 49] = "_1";
      e[e._2 = 50] = "_2";
      e[e._3 = 51] = "_3";
      e[e._4 = 52] = "_4";
      e[e.B2m = 53] = "_5";
      e[e._6 = 54] = "_6";
      e[e._7 = 55] = "_7";
      e[e._8 = 56] = "_8";
      e[e._9 = 57] = "_9";
      e[e.a = 97] = "a";
      e[e.b = 98] = "b";
      e[e.c = 99] = "c";
      e[e.d = 100] = "d";
      e[e.e = 101] = "e";
      e[e.f = 102] = "f";
      e[e.g = 103] = "g";
      e[e.h = 104] = "h";
      e[e.i = 105] = "i";
      e[e.j = 106] = "j";
      e[e.k = 107] = "k";
      e[e.l = 108] = "l";
      e[e.m = 109] = "m";
      e[e.n = 110] = "n";
      e[e.o = 111] = "o";
      e[e.p = 112] = "p";
      e[e.q = 113] = "q";
      e[e.r = 114] = "r";
      e[e.s = 115] = "s";
      e[e.t = 116] = "t";
      e[e.u = 117] = "u";
      e[e.v = 118] = "v";
      e[e.w = 119] = "w";
      e[e.x = 120] = "x";
      e[e.y = 121] = "y";
      e[e.z = 122] = "z";
      e[e.A = 65] = "A";
      e[e.B = 66] = "B";
      e[e.C = 67] = "C";
      e[e.D = 68] = "D";
      e[e.E = 69] = "E";
      e[e.F = 70] = "F";
      e[e.G = 71] = "G";
      e[e.H = 72] = "H";
      e[e.I = 73] = "I";
      e[e.J = 74] = "J";
      e[e.K = 75] = "K";
      e[e.L = 76] = "L";
      e[e.M = 77] = "M";
      e[e.N = 78] = "N";
      e[e.O = 79] = "O";
      e[e.P = 80] = "P";
      e[e.Q = 81] = "Q";
      e[e.R = 82] = "R";
      e[e.S = 83] = "S";
      e[e.T = 84] = "T";
      e[e.U = 85] = "U";
      e[e.V = 86] = "V";
      e[e.W = 87] = "W";
      e[e.X = 88] = "X";
      e[e.Y = 89] = "Y";
      e[e.Z = 90] = "Z";
      e[e.asterisk = 42] = "asterisk";
      e[e.backslash = 92] = "backslash";
      e[e.closeBrace = 125] = "closeBrace";
      e[e.closeBracket = 93] = "closeBracket";
      e[e.colon = 58] = "colon";
      e[e.comma = 44] = "comma";
      e[e.dot = 46] = "dot";
      e[e.doubleQuote = 34] = "doubleQuote";
      e[e.minus = 45] = "minus";
      e[e.openBrace = 123] = "openBrace";
      e[e.openBracket = 91] = "openBracket";
      e[e.plus = 43] = "plus";
      e[e.slash = 47] = "slash";
      e[e.formFeed = 12] = "formFeed";
      e[e.tab = 9] = "tab";
    })(zIs || (zIs = {}));
  });
  var H6;
  var n1r;
  var KIs;
  var YIs = __lazy(() => {
    H6 = Array(20).fill(0).map((e, t) => " ".repeat(t));
    n1r = {
      " ": {
        "\n": Array(200).fill(0).map((e, t) => `
` + " ".repeat(t)),
        "\r": Array(200).fill(0).map((e, t) => "\r" + " ".repeat(t)),
        "\r\n": Array(200).fill(0).map((e, t) => `\r
` + " ".repeat(t))
      },
      "\t": {
        "\n": Array(200).fill(0).map((e, t) => `
` + "\t".repeat(t)),
        "\r": Array(200).fill(0).map((e, t) => "\r" + "\t".repeat(t)),
        "\r\n": Array(200).fill(0).map((e, t) => `\r
` + "\t".repeat(t))
      }
    };
    KIs = [`
`, "\r", `\r
`];
  });
  function r1r(e, t, n) {
    let r;
    let o;
    let s;
    let i;
    let a;
    if (t) {
      i = t.offset;
      a = i + t.length;
      s = i;
      while (s > 0 && !mMt(e, s - 1)) {
        s--;
      }
      let E = a;
      while (E < e.length && !mMt(e, E)) {
        E++;
      }
      o = e.substring(s, E);
      r = aWu(o, n);
    } else {
      o = e;
      r = 0;
      s = 0;
      i = 0;
      a = e.length;
    }
    let l = lWu(n, e);
    let c = KIs.includes(l);
    let u = 0;
    let d = 0;
    let p;
    if (n.insertSpaces) {
      p = H6[n.tabSize || 4] ?? Cnt(H6[1], n.tabSize || 4);
    } else {
      p = "\t";
    }
    let m = p === "\t" ? "\t" : " ";
    let f = pMt(o, false);
    let h = false;
    function g() {
      if (u > 1) {
        return Cnt(l, u) + Cnt(p, r + d);
      }
      let E = p.length * (r + d);
      if (!c || E > n1r[m][l].length) {
        return l + Cnt(p, r + d);
      }
      if (E <= 0) {
        return l;
      }
      return n1r[m][l][E];
    }
    function y() {
      let E = f.scan();
      u = 0;
      while (E === 15 || E === 14) {
        if (E === 14 && n.keepLines) {
          u += 1;
        } else if (E === 14) {
          u = 1;
        }
        E = f.scan();
      }
      h = E === 16 || f.getTokenError() !== 0;
      return E;
    }
    let _ = [];
    function b(E, C, x) {
      if (!h && (!t || C < a && x > i) && e.substring(C, x) !== E) {
        _.push({
          offset: C,
          length: x - C,
          content: E
        });
      }
    }
    let S = y();
    if (n.keepLines && u > 0) {
      b(Cnt(l, u), 0, 0);
    }
    if (S !== 17) {
      let E = f.getTokenOffset() + s;
      let C = p.length * r < 20 && n.insertSpaces ? H6[p.length * r] : Cnt(p, r);
      b(C, s, E);
    }
    while (S !== 17) {
      let E = f.getTokenOffset() + f.getTokenLength() + s;
      let C = y();
      let x = "";
      let A = false;
      while (u === 0 && (C === 12 || C === 13)) {
        let I = f.getTokenOffset() + s;
        b(H6[1], E, I);
        E = f.getTokenOffset() + f.getTokenLength() + s;
        A = C === 12;
        x = A ? g() : "";
        C = y();
      }
      if (C === 2) {
        if (S !== 1) {
          d--;
        }
        if (n.keepLines && u > 0 || !n.keepLines && S !== 1) {
          x = g();
        } else if (n.keepLines) {
          x = H6[1];
        }
      } else if (C === 4) {
        if (S !== 3) {
          d--;
        }
        if (n.keepLines && u > 0 || !n.keepLines && S !== 3) {
          x = g();
        } else if (n.keepLines) {
          x = H6[1];
        }
      } else {
        switch (S) {
          case 3:
          case 1:
            if (d++, n.keepLines && u > 0 || !n.keepLines) {
              x = g();
            } else {
              x = H6[1];
            }
            break;
          case 5:
            if (n.keepLines && u > 0 || !n.keepLines) {
              x = g();
            } else {
              x = H6[1];
            }
            break;
          case 12:
            x = g();
            break;
          case 13:
            if (u > 0) {
              x = g();
            } else if (!A) {
              x = H6[1];
            }
            break;
          case 6:
            if (n.keepLines && u > 0) {
              x = g();
            } else if (!A) {
              x = H6[1];
            }
            break;
          case 10:
            if (n.keepLines && u > 0) {
              x = g();
            } else if (C === 6 && !A) {
              x = "";
            }
            break;
          case 7:
          case 8:
          case 9:
          case 11:
          case 2:
          case 4:
            if (n.keepLines && u > 0) {
              x = g();
            } else if ((C === 12 || C === 13) && !A) {
              x = H6[1];
            } else if (C !== 5 && C !== 17) {
              h = true;
            }
            break;
          case 16:
            h = true;
            break;
        }
        if (u > 0 && (C === 12 || C === 13)) {
          x = g();
        }
      }
      if (C === 17) {
        if (n.keepLines && u > 0) {
          x = g();
        } else {
          x = n.insertFinalNewline ? l : "";
        }
      }
      let k = f.getTokenOffset() + s;
      b(x, E, k);
      S = C;
    }
    return _;
  }
  function Cnt(e, t) {
    let n = "";
    for (let r = 0; r < t; r++) {
      n += e;
    }
    return n;
  }
  function aWu(e, t) {
    let n = 0;
    let r = 0;
    let o = t.tabSize || 4;
    while (n < e.length) {
      let s = e.charAt(n);
      if (s === H6[1]) {
        r++;
      } else if (s === "\t") {
        r += o;
      } else {
        break;
      }
      n++;
    }
    return Math.floor(r / o);
  }
  function lWu(e, t) {
    for (let n = 0; n < t.length; n++) {
      let r = t.charAt(n);
      if (r === "\r") {
        if (n + 1 < t.length && t.charAt(n + 1) === `
`) {
          return `\r
`;
        }
        return "\r";
      } else if (r === `
`) {
        return `
`;
      }
    }
    return e && e.eol || `
`;
  }
  function mMt(e, t) {
    return `\r
`.indexOf(e.charAt(t)) !== -1;
  }
  var o1r = __lazy(() => {
    Hgn();
    YIs();
  });
  function JIs(e, t = [], n = fMt.DEFAULT) {
    let r = null;
    let o = [];
    let s = [];
    function i(l) {
      if (Array.isArray(o)) {
        o.push(l);
      } else if (r !== null) {
        o[r] = l;
      }
    }
    i1r(e, {
      onObjectBegin: () => {
        let l = {};
        i(l);
        s.push(o);
        o = l;
        r = null;
      },
      onObjectProperty: l => {
        r = l;
      },
      onObjectEnd: () => {
        o = s.pop();
      },
      onArrayBegin: () => {
        let l = [];
        i(l);
        s.push(o);
        o = l;
        r = null;
      },
      onArrayEnd: () => {
        o = s.pop();
      },
      onLiteralValue: i,
      onError: (l, c, u) => {
        t.push({
          error: l,
          offset: c,
          length: u
        });
      }
    }, n);
    return o[0];
  }
  function s1r(e, t = [], n = fMt.DEFAULT) {
    let r = {
      type: "array",
      offset: -1,
      length: -1,
      children: [],
      parent: undefined
    };
    function o(l) {
      if (r.type === "property") {
        r.length = l - r.offset;
        r = r.parent;
      }
    }
    function s(l) {
      r.children.push(l);
      return l;
    }
    i1r(e, {
      onObjectBegin: l => {
        r = s({
          type: "object",
          offset: l,
          length: -1,
          parent: r,
          children: []
        });
      },
      onObjectProperty: (l, c, u) => {
        r = s({
          type: "property",
          offset: c,
          length: -1,
          parent: r,
          children: []
        });
        r.children.push({
          type: "string",
          value: l,
          offset: c,
          length: u,
          parent: r
        });
      },
      onObjectEnd: (l, c) => {
        o(l + c);
        r.length = l + c - r.offset;
        r = r.parent;
        o(l + c);
      },
      onArrayBegin: (l, c) => {
        r = s({
          type: "array",
          offset: l,
          length: -1,
          parent: r,
          children: []
        });
      },
      onArrayEnd: (l, c) => {
        r.length = l + c - r.offset;
        r = r.parent;
        o(l + c);
      },
      onLiteralValue: (l, c, u) => {
        s({
          type: uWu(l),
          offset: c,
          length: u,
          parent: r,
          value: l
        });
        o(c + u);
      },
      onSeparator: (l, c, u) => {
        if (r.type === "property") {
          if (l === ":") {
            r.colonOffset = c;
          } else if (l === ",") {
            o(c);
          }
        }
      },
      onError: (l, c, u) => {
        t.push({
          error: l,
          offset: c,
          length: u
        });
      }
    }, n);
    let a = r.children[0];
    if (a) {
      delete a.parent;
    }
    return a;
  }
  function jgn(e, t) {
    if (!e) {
      return;
    }
    let n = e;
    for (let r of t) {
      if (typeof r === "string") {
        if (n.type !== "object" || !Array.isArray(n.children)) {
          return;
        }
        let o = false;
        for (let s of n.children) {
          if (Array.isArray(s.children) && s.children[0].value === r && s.children.length === 2) {
            n = s.children[1];
            o = true;
            break;
          }
        }
        if (!o) {
          return;
        }
      } else {
        let o = r;
        if (n.type !== "array" || o < 0 || !Array.isArray(n.children) || o >= n.children.length) {
          return;
        }
        n = n.children[o];
      }
    }
    return n;
  }
  function i1r(e, t, n = fMt.DEFAULT) {
    let r = pMt(e, false);
    let o = [];
    function s(M) {
      return M ? () => M(r.getTokenOffset(), r.getTokenLength(), r.getTokenStartLine(), r.getTokenStartCharacter()) : () => true;
    }
    function i(M) {
      return M ? () => M(r.getTokenOffset(), r.getTokenLength(), r.getTokenStartLine(), r.getTokenStartCharacter(), () => o.slice()) : () => true;
    }
    function a(M) {
      return M ? L => M(L, r.getTokenOffset(), r.getTokenLength(), r.getTokenStartLine(), r.getTokenStartCharacter()) : () => true;
    }
    function l(M) {
      return M ? L => M(L, r.getTokenOffset(), r.getTokenLength(), r.getTokenStartLine(), r.getTokenStartCharacter(), () => o.slice()) : () => true;
    }
    let c = i(t.onObjectBegin);
    let u = l(t.onObjectProperty);
    let d = s(t.onObjectEnd);
    let p = i(t.onArrayBegin);
    let m = s(t.onArrayEnd);
    let f = l(t.onLiteralValue);
    let h = a(t.onSeparator);
    let g = s(t.onComment);
    let y = a(t.onError);
    let _ = n && n.disallowComments;
    let b = n && n.allowTrailingComma;
    function S() {
      while (true) {
        let M = r.scan();
        switch (r.getTokenError()) {
          case 4:
            E(14);
            break;
          case 5:
            E(15);
            break;
          case 3:
            E(13);
            break;
          case 1:
            if (!_) {
              E(11);
            }
            break;
          case 2:
            E(12);
            break;
          case 6:
            E(16);
            break;
        }
        switch (M) {
          case 12:
          case 13:
            if (_) {
              E(10);
            } else {
              g();
            }
            break;
          case 16:
            E(1);
            break;
          case 15:
          case 14:
            break;
          default:
            return M;
        }
      }
    }
    function E(M, L = [], P = []) {
      if (y(M), L.length + P.length > 0) {
        let F = r.getToken();
        while (F !== 17) {
          if (L.indexOf(F) !== -1) {
            S();
            break;
          } else if (P.indexOf(F) !== -1) {
            break;
          }
          F = S();
        }
      }
    }
    function C(M) {
      let L = r.getTokenValue();
      if (M) {
        f(L);
      } else {
        u(L);
        o.push(L);
      }
      S();
      return true;
    }
    function x() {
      switch (r.getToken()) {
        case 11:
          let M = r.getTokenValue();
          let L = Number(M);
          if (isNaN(L)) {
            E(2);
            L = 0;
          }
          f(L);
          break;
        case 7:
          f(null);
          break;
        case 8:
          f(true);
          break;
        case 9:
          f(false);
          break;
        default:
          return false;
      }
      S();
      return true;
    }
    function A() {
      if (r.getToken() !== 10) {
        E(3, [], [2, 5]);
        return false;
      }
      if (C(false), r.getToken() === 6) {
        if (h(":"), S(), !O()) {
          E(4, [], [2, 5]);
        }
      } else {
        E(5, [], [2, 5]);
      }
      o.pop();
      return true;
    }
    function k() {
      c();
      S();
      let M = false;
      while (r.getToken() !== 2 && r.getToken() !== 17) {
        if (r.getToken() === 5) {
          if (!M) {
            E(4, [], []);
          }
          if (h(","), S(), r.getToken() === 2 && b) {
            break;
          }
        } else if (M) {
          E(6, [], []);
        }
        if (!A()) {
          E(4, [], [2, 5]);
        }
        M = true;
      }
      if (d(), r.getToken() !== 2) {
        E(7, [2], []);
      } else {
        S();
      }
      return true;
    }
    function I() {
      p();
      S();
      let M = true;
      let L = false;
      while (r.getToken() !== 4 && r.getToken() !== 17) {
        if (r.getToken() === 5) {
          if (!L) {
            E(4, [], []);
          }
          if (h(","), S(), r.getToken() === 4 && b) {
            break;
          }
        } else if (L) {
          E(6, [], []);
        }
        if (M) {
          o.push(0);
          M = false;
        } else {
          o[o.length - 1]++;
        }
        if (!O()) {
          E(4, [], [4, 5]);
        }
        L = true;
      }
      if (m(), !M) {
        o.pop();
      }
      if (r.getToken() !== 4) {
        E(8, [4], []);
      } else {
        S();
      }
      return true;
    }
    function O() {
      switch (r.getToken()) {
        case 3:
          return I();
        case 1:
          return k();
        case 10:
          return C(true);
        default:
          return x();
      }
    }
    if (S(), r.getToken() === 17) {
      if (n.allowEmptyContent) {
        return true;
      }
      E(4, [], []);
      return false;
    }
    if (!O()) {
      E(4, [], []);
      return false;
    }
    if (r.getToken() !== 17) {
      E(9, [], []);
    }
    return true;
  }
  function uWu(e) {
    switch (typeof e) {
      case "boolean":
        return "boolean";
      case "number":
        return "number";
      case "string":
        return "string";
      case "object":
        {
          if (!e) {
            return "null";
          } else if (Array.isArray(e)) {
            return "array";
          }
          return "object";
        }
      default:
        return "null";
    }
  }
  var fMt;
  var a1r = __lazy(() => {
    Hgn();
    (function (e) {
      e.DEFAULT = {
        allowTrailingComma: false
      };
    })(fMt || (fMt = {}));
  });
  function XIs(e, t, n, r) {
    let o = t.slice();
    let i = s1r(e, []);
    let a = undefined;
    let l = undefined;
    while (o.length > 0) {
      if (l = o.pop(), a = jgn(i, o), a === undefined && n !== undefined) {
        if (typeof l === "string") {
          n = {
            [l]: n
          };
        } else {
          n = [n];
        }
      } else {
        break;
      }
    }
    if (!a) {
      if (n === undefined) {
        throw Error("Can not delete in empty document");
      }
      return gje(e, {
        offset: i ? i.offset : 0,
        length: i ? i.length : 0,
        content: JSON.stringify(n)
      }, r);
    } else if (a.type === "object" && typeof l === "string" && Array.isArray(a.children)) {
      let c = jgn(a, [l]);
      if (c !== undefined) {
        if (n === undefined) {
          if (!c.parent) {
            throw Error("Malformed AST");
          }
          let u = a.children.indexOf(c.parent);
          let d;
          let p = c.parent.offset + c.parent.length;
          if (u > 0) {
            let m = a.children[u - 1];
            d = m.offset + m.length;
          } else if (d = a.offset + 1, a.children.length > 1) {
            p = a.children[1].offset;
          }
          return gje(e, {
            offset: d,
            length: p - d,
            content: ""
          }, r);
        } else {
          return gje(e, {
            offset: c.offset,
            length: c.length,
            content: JSON.stringify(n)
          }, r);
        }
      } else {
        if (n === undefined) {
          return [];
        }
        let u = `${JSON.stringify(l)}: ${JSON.stringify(n)}`;
        let d = r.getInsertionIndex ? r.getInsertionIndex(a.children.map(m => m.children[0].value)) : a.children.length;
        let p;
        if (d > 0) {
          let m = a.children[d - 1];
          p = {
            offset: m.offset + m.length,
            length: 0,
            content: "," + u
          };
        } else if (a.children.length === 0) {
          p = {
            offset: a.offset + 1,
            length: 0,
            content: u
          };
        } else {
          p = {
            offset: a.offset + 1,
            length: 0,
            content: u + ","
          };
        }
        return gje(e, p, r);
      }
    } else if (a.type === "array" && typeof l === "number" && Array.isArray(a.children)) {
      let c = l;
      if (c === -1) {
        let u = `${JSON.stringify(n)}`;
        let d;
        if (a.children.length === 0) {
          d = {
            offset: a.offset + 1,
            length: 0,
            content: u
          };
        } else {
          let p = a.children[a.children.length - 1];
          d = {
            offset: p.offset + p.length,
            length: 0,
            content: "," + u
          };
        }
        return gje(e, d, r);
      } else if (n === undefined && a.children.length >= 0) {
        let u = l;
        let d = a.children[u];
        let p;
        if (a.children.length === 1) {
          p = {
            offset: a.offset + 1,
            length: a.length - 2,
            content: ""
          };
        } else if (a.children.length - 1 === u) {
          let m = a.children[u - 1];
          let f = m.offset + m.length;
          let h = a.offset + a.length;
          p = {
            offset: f,
            length: h - 2 - f,
            content: ""
          };
        } else {
          p = {
            offset: d.offset,
            length: a.children[u + 1].offset - d.offset,
            content: ""
          };
        }
        return gje(e, p, r);
      } else if (n !== undefined) {
        let u;
        let d = `${JSON.stringify(n)}`;
        if (!r.isArrayInsertion && a.children.length > l) {
          let p = a.children[l];
          u = {
            offset: p.offset,
            length: p.length,
            content: d
          };
        } else if (a.children.length === 0 || l === 0) {
          u = {
            offset: a.offset + 1,
            length: 0,
            content: a.children.length === 0 ? d : d + ","
          };
        } else {
          let p = l > a.children.length ? a.children.length : l;
          let m = a.children[p - 1];
          u = {
            offset: m.offset + m.length,
            length: 0,
            content: "," + d
          };
        }
        return gje(e, u, r);
      } else {
        throw Error(`Can not ${n === undefined ? "remove" : r.isArrayInsertion ? "insert" : "modify"} Array index ${c} as length is not sufficient`);
      }
    } else {
      throw Error(`Can not add ${typeof l !== "number" ? "index" : "property"} to parent of type ${a.type}`);
    }
  }
  function gje(e, t, n) {
    if (!n.formattingOptions) {
      return [t];
    }
    let r = qgn(e, t);
    let o = t.offset;
    let s = t.offset + t.content.length;
    if (t.length === 0 || t.content.length === 0) {
      while (o > 0 && !mMt(r, o - 1)) {
        o--;
      }
      while (s < r.length && !mMt(r, s)) {
        s++;
      }
    }
    let i = r1r(r, {
      offset: o,
      length: s - o
    }, {
      ...n.formattingOptions,
      keepLines: false
    });
    for (let l = i.length - 1; l >= 0; l--) {
      let c = i[l];
      r = qgn(r, c);
      o = Math.min(o, c.offset);
      s = Math.max(s, c.offset + c.length);
      s += c.content.length - c.length;
    }
    let a = e.length - (r.length - s) - o;
    return [{
      offset: o,
      length: a,
      content: r.substring(o, s)
    }];
  }
  function qgn(e, t) {
    return e.substring(0, t.offset) + t.content + e.substring(t.offset + t.length);
  }
  var QIs = __lazy(() => {
    o1r();
    a1r();
  });
  function l1r(e, t, n, r) {
    return XIs(e, t, n, r);
  }
  function c1r(e, t) {
    let n = t.slice(0).sort((o, s) => {
      let i = o.offset - s.offset;
      if (i === 0) {
        return o.length - s.length;
      }
      return i;
    });
    let r = e.length;
    for (let o = n.length - 1; o >= 0; o--) {
      let s = n[o];
      if (s.offset + s.length <= r) {
        e = qgn(e, s);
      } else {
        throw Error("Overlapping edit");
      }
      r = s.offset;
    }
    return e;
  }
  var ZIs;
  var ePs;
  var tPs;
  function iW(e) {
    return e.startsWith("\uFEFF") ? e.slice(1) : e;
  }
  function yje(e) {
    if (typeof e !== "object" || e === null || Array.isArray(e)) {
      return false;
    }
    let t = Object.entries(e);
    if (t.length !== 1) {
      return false;
    }
    let [n, r] = t[0];
    return n === "__unparsedToolInput" && typeof r === "object" && r !== null && typeof r.raw === "string" && typeof r.len === "number";
  }
  function yle(e) {
    if (!yje(e)) {
      return null;
    }
    let {
      len: t
    } = e["__unparsedToolInput"];
    return `input JSON failed to parse \u2014 ${t} bytes`;
  }
  function oPs(e, t) {
    try {
      return {
        ok: true,
        value: JSON.parse(iW(e))
      };
    } catch (n) {
      if (t) {
        Oe($o(n, `safeParseJSON: invalid JSON (${n instanceof Error ? n.constructor.name : typeof n}, ${e.length} bytes)`));
      }
      return {
        ok: false
      };
    }
  }
  function aW(e) {
    return e.trim().replace(/^```[a-zA-Z]*\s*/, "").replace(/\s*```$/, "").trim();
  }
  function gMt(e) {
    if (!e) {
      return null;
    }
    try {
      return JIs(iW(e));
    } catch (t) {
      logForDebugging(`Failed to parse JSONC: ${t instanceof Error ? t.message : String(t)}`, {
        level: "error"
      });
      return null;
    }
  }
  function fWu() {
    return Bun.JSONL?.parseChunk;
  }
  function hWu(e, t) {
    let n = e.length;
    let r = t(e);
    if (!r.error || r.done || r.read >= n) {
      return r.values;
    }
    let {
      values: o,
      read: s
    } = r;
    while (s < n) {
      let i = typeof e === "string" ? e.indexOf(`
`, s) : e.indexOf(10, s);
      if (i === -1) {
        break;
      }
      s = i + 1;
      let a = t(e, s);
      if (a.values.length > 0) {
        o = o.concat(a.values);
      }
      if (!a.error || a.done || a.read >= n) {
        break;
      }
      s = a.read;
    }
    return o;
  }
  function gWu(e) {
    let t = e.length;
    let n = 0;
    if (e[0] === 239 && e[1] === 187 && e[2] === 191) {
      n = 3;
    }
    let r = [];
    while (n < t) {
      let o = e.indexOf(10, n);
      if (o === -1) {
        o = t;
      }
      let s = e.toString("utf8", n, o).trim();
      if (n = o + 1, !s) {
        continue;
      }
      try {
        r.push(JSON.parse(s));
      } catch {}
    }
    return r;
  }
  function yWu(e) {
    let t = iW(e);
    let n = t.length;
    let r = 0;
    let o = [];
    while (r < n) {
      let s = t.indexOf(`
`, r);
      if (s === -1) {
        s = n;
      }
      let i = t.substring(r, s).trim();
      if (r = s + 1, !i) {
        continue;
      }
      try {
        o.push(JSON.parse(i));
      } catch {}
    }
    return o;
  }
  function Ake(e) {
    let t = fWu();
    if (t) {
      return hWu(e, t);
    }
    if (typeof e === "string") {
      return yWu(e);
    }
    return gWu(e);
  }
  async function knt(e) {
    let {
      size: t
    } = await Rnt.stat(e);
    if (t <= 104857600) {
      return Ake(await Rnt.readFile(e));
    }
    await using n = await Rnt.open(e, "r");
    let r = Buffer.allocUnsafe(104857600);
    let o = 0;
    let s = t - 104857600;
    while (o < 104857600) {
      let {
        bytesRead: a
      } = await n.read(r, o, 104857600 - o, s + o);
      if (a === 0) {
        break;
      }
      o += a;
    }
    let i = r.indexOf(10);
    if (i !== -1 && i < o - 1) {
      return Ake(r.subarray(i + 1, o));
    }
    return Ake(r.subarray(0, o));
  }
  function u1r(e, t, n) {
    if (!e || e.trim() === "") {
      return De({
        [t]: n
      }, null, 4);
    }
    let r = iW(e);
    try {
      let o = [];
      let s = JIs(r, o);
      if (o.length > 0 || s === null || typeof s !== "object" || Array.isArray(s)) {
        return e;
      }
      let i = l1r(r, [t], n, {
        formattingOptions: {
          insertSpaces: true,
          tabSize: 4
        }
      });
      if (!i || i.length === 0) {
        return r;
      }
      return c1r(r, i);
    } catch (o) {
      logForDebugging(`Failed to set JSONC property "${t}": ${o instanceof Error ? o.message : String(o)}`, {
        level: "error"
      });
      return e;
    }
  }
  function sPs(e, t) {
    try {
      if (!e || e.trim() === "") {
        return De([t], null, 4);
      }
      let n = iW(e);
      let r = JIs(n);
      if (Array.isArray(r)) {
        let o = r.length;
        let a = l1r(n, o === 0 ? [0] : [o], t, {
          formattingOptions: {
            insertSpaces: true,
            tabSize: 4
          },
          isArrayInsertion: true
        });
        if (!a || a.length === 0) {
          let l = [...r, t];
          return De(l, null, 4);
        }
        return c1r(n, a);
      } else {
        return De([t], null, 4);
      }
    } catch (n) {
      logForDebugging(`Failed to insert item into user JSONC array, falling back to overwrite: ${n instanceof Error ? n.message : String(n)}`, {
        level: "error"
      });
      return De([t], null, 4);
    }
  }
  var Rnt;
  var rPs;
  var Ba;
  var Gd = __lazy(() => {
    je();
    dt();
    Rn();
    nW();
    Rnt = require("fs/promises");
    rPs = mk(oPs, e => e, 50);
    Ba = Object.assign(function (t, n = true) {
      if (!t) {
        return null;
      }
      let r = t.length > 8192 ? oPs(t, n) : rPs(t, n);
      return r.ok ? r.value : null;
    }, {
      cache: rPs.cache
    });
  });
  function cY(e) {
    switch (e) {
      case "userSettings":
        return "user";
      case "projectSettings":
        return "project";
      case "localSettings":
        return "project, gitignored";
      case "flagSettings":
        return "cli flag";
      case "policySettings":
        return "managed";
    }
  }
  function _je(e) {
    switch (e) {
      case "userSettings":
        return "User";
      case "projectSettings":
        return "Project";
      case "localSettings":
        return "Local";
      case "flagSettings":
        return "Flag";
      case "policySettings":
        return "Managed";
      case "plugin":
        return "Plugin";
      case "built-in":
        return "Built-in";
      case "mcp":
        return "MCP";
    }
  }
  function iPs(e) {
    switch (e) {
      case "userSettings":
        return "user settings";
      case "projectSettings":
        return "shared project settings";
      case "localSettings":
        return "project local settings";
      case "flagSettings":
        return "command line arguments";
      case "policySettings":
        return "enterprise managed settings";
      case "cliArg":
        return "CLI argument";
      case "command":
        return "command configuration";
      case "session":
        return "current session";
      case "toolsNarrowing":
        return "CLI tool narrowing";
      case "mcpServerPolicy":
        return "MCP server policy";
    }
  }
  function aPs(e) {
    switch (e) {
      case "userSettings":
        return "User settings";
      case "projectSettings":
        return "Shared project settings";
      case "localSettings":
        return "Project local settings";
      case "flagSettings":
        return "Command line arguments";
      case "policySettings":
        return "Enterprise managed settings";
      case "cliArg":
        return "CLI argument";
      case "command":
        return "Command configuration";
      case "session":
        return "Current session";
      case "toolsNarrowing":
        return "CLI tool narrowing";
      case "mcpServerPolicy":
        return "MCP server policy";
    }
  }
  function lPs(e) {
    if (e === "") {
      return [];
    }
    let t = e.split(",").map(r => r.trim());
    let n = [];
    for (let r of t) {
      switch (r) {
        case "user":
          n.push("userSettings");
          break;
        case "project":
          n.push("projectSettings");
          break;
        case "local":
          n.push("localSettings");
          break;
        default:
          throw Error(`Invalid setting source: ${r}. Valid options are: user, project, local`);
      }
    }
    return n;
  }
  function ew() {
    let e = getAllowedSettingSources();
    if (d1r?.allowed === e) {
      return d1r.result;
    }
    let t = new Set(e);
    t.add("flagSettings");
    t.add("policySettings");
    let n = bC.filter(r => t.vZc(r));
    d1r = {
      allowed: e,
      result: n
    };
    return n;
  }
  function qf(e) {
    return ew().includes(e);
  }
  var bC;
  var d1r;
  var sF;
  var yMt;
  var nf = __lazy(() => {
    at();
    bC = ["userSettings", "projectSettings", "localSettings", "flagSettings", "policySettings"];
    sF = ["userSettings", "projectSettings", "localSettings"];
    yMt = ["localSettings", "projectSettings", "userSettings"];
  });
  function p1r(e) {
    Ggn.set(e, Date.now());
  }
  function cPs(e, t) {
    let n = Ggn.get(e);
    if (n !== undefined && Date.now() - n < t) {
      Ggn.delete(e);
      return true;
    }
    return false;
  }
  function uPs() {
    Ggn.clear();
  }
  var Ggn;
  var Vgn = __lazy(() => {
    Ggn = new Map();
  });
  var dPs;
  var SI;
  var _Mt;
  var Bte = __lazy(() => {
    Cs();
    dPs = require("path");
    SI = TEr(function () {
      switch (Wt()) {
        case "macos":
          return "/Library/Application Support/ClaudeCode";
        case "windows":
          return "C:\\Program Files\\ClaudeCode";
        default:
          return "/etc/claude-code";
      }
    });
    _Mt = TEr(function () {
      return dPs.join(SI(), "managed-settings.d");
    });
  });
  function bMt() {
    if (process.env.WSL_DISTRO_NAME) {
      return true;
    }
    try {
      let e = require("fs").readFileSync("/proc/version", "utf8").toLowerCase();
      return e.includes("microsoft") || e.includes("wsl");
    } catch {
      return false;
    }
  }
  var Ike = () => {};
  function _Wu(e, t) {
    return u_u(e, t, function (n, r) {
      return Dnu(e, r);
    });
  }
  function bWu(e) {
    return Peu(e) || Weu(e) || !!(hPs && e && e[hPs]);
  }
  var hPs;
  function _Ps(e, t, n, r, o) {
    var s = -1;
    var i = e.length;
    n || (n = bWu);
    o || (o = []);
    while (++s < i) {
      var a = e[s];
      if (t > 0 && n(a)) {
        if (t > 1) {
          _Ps(a, t - 1, n, r, o);
        } else {
          Ieu(o, a);
        }
      } else if (!r) {
        o[o.length] = a;
      }
    }
    return o;
  }
  function SWu(e) {
    var t = e == null ? 0 : e.length;
    return t ? _Ps(e, 1) : [];
  }
  function TWu(e) {
    return uqu(rqu(e, undefined, SWu), e + "");
  }
  var EWu;
  function Xgn(e) {
    let t = e.toUpperCase();
    return vWu.vZc(t) || SMt.some(n => t.startsWith(n));
  }
  function Qgn(e) {
    return wWu.vZc(e.toUpperCase());
  }
  function eyn(e) {
    return !!e.ANTHROPIC_UNIX_SOCKET || st(e.CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST) || !!e.CLAUDE_CODE_HOST_AUTH_ENV_VAR;
  }
  function tyn(e) {
    if (!st(e.CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST)) {
      return [];
    }
    return ["ANTHROPIC_CUSTOM_HEADERS", ...uY, e.CLAUDE_CODE_HOST_AUTH_ENV_VAR, "CLAUDE_CODE_HOST_CREDS_FILE"].filter(t => !!t);
  }
  var $te;
  var _le;
  var uY;
  var h1r;
  var g1r;
  var wPs;
  var vWu;
  var SMt;
  var wWu;
  var Zgn;
  var CPs;
  var Int;
  var lW = __lazy(() => {
    gn();
    $te = ["CLAUDE_CODE_USE_BEDROCK", "CLAUDE_CODE_USE_VERTEX", "CLAUDE_CODE_USE_FOUNDRY", "CLAUDE_CODE_USE_ANTHROPIC_AWS", "CLAUDE_CODE_USE_MANTLE", "CLAUDE_CODE_USE_GATEWAY", "ANTHROPIC_FOUNDRY_RESOURCE", "ANTHROPIC_VERTEX_PROJECT_ID", "ANTHROPIC_AWS_WORKSPACE_ID", "CLOUD_ML_REGION"];
    _le = ["ANTHROPIC_BASE_URL", "_CLAUDE_CODE_ASSUME_FIRST_PARTY_BASE_URL", "ANTHROPIC_BEDROCK_BASE_URL", "ANTHROPIC_VERTEX_BASE_URL", "ANTHROPIC_FOUNDRY_BASE_URL", "ANTHROPIC_AWS_BASE_URL", "ANTHROPIC_BEDROCK_MANTLE_BASE_URL", "CLAUDE_CODE_ARTIFACTS_API_BASE_URL"];
    uY = ["ANTHROPIC_API_KEY", "ANTHROPIC_AUTH_TOKEN", "CLAUDE_CODE_OAUTH_TOKEN", "AWS_BEARER_TOKEN_BEDROCK", "ANTHROPIC_FOUNDRY_API_KEY", "ANTHROPIC_AWS_API_KEY", "ANTHROPIC_BEDROCK_MANTLE_API_KEY"];
    h1r = ["CLAUDE_CODE_SKIP_BEDROCK_AUTH", "CLAUDE_CODE_SKIP_VERTEX_AUTH", "CLAUDE_CODE_SKIP_FOUNDRY_AUTH", "CLAUDE_CODE_SKIP_ANTHROPIC_AWS_AUTH", "CLAUDE_CODE_SKIP_MANTLE_AUTH"];
    g1r = ["ANTHROPIC_MODEL", "ANTHROPIC_DEFAULT_FABLE_MODEL", "ANTHROPIC_DEFAULT_FABLE_MODEL_DESCRIPTION", "ANTHROPIC_DEFAULT_FABLE_MODEL_NAME", "ANTHROPIC_DEFAULT_FABLE_MODEL_SUPPORTED_CAPABILITIES", "ANTHROPIC_DEFAULT_HAIKU_MODEL", "ANTHROPIC_DEFAULT_HAIKU_MODEL_DESCRIPTION", "ANTHROPIC_DEFAULT_HAIKU_MODEL_NAME", "ANTHROPIC_DEFAULT_HAIKU_MODEL_SUPPORTED_CAPABILITIES", "ANTHROPIC_DEFAULT_OPUS_MODEL", "ANTHROPIC_DEFAULT_OPUS_MODEL_DESCRIPTION", "ANTHROPIC_DEFAULT_OPUS_MODEL_NAME", "ANTHROPIC_DEFAULT_OPUS_MODEL_SUPPORTED_CAPABILITIES", "ANTHROPIC_DEFAULT_SONNET_MODEL", "ANTHROPIC_DEFAULT_SONNET_MODEL_DESCRIPTION", "ANTHROPIC_DEFAULT_SONNET_MODEL_NAME", "ANTHROPIC_DEFAULT_SONNET_MODEL_SUPPORTED_CAPABILITIES", "ANTHROPIC_SMALL_FAST_MODEL", "ANTHROPIC_SMALL_FAST_MODEL_AWS_REGION", "CLAUDE_CODE_SUBAGENT_MODEL"];
    wPs = ["ANTHROPIC_CUSTOM_MODEL_OPTION", "ANTHROPIC_CUSTOM_MODEL_OPTION_DESCRIPTION", "ANTHROPIC_CUSTOM_MODEL_OPTION_NAME", "ANTHROPIC_CUSTOM_MODEL_OPTION_SUPPORTED_CAPABILITIES"];
    vWu = new Set(["CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST", ...$te, ..._le, ...uY, ...h1r, "CLAUDE_CODE_HOST_AUTH_ENV_VAR", "CLAUDE_CODE_SDK_HAS_HOST_AUTH_REFRESH", "CLAUDE_CODE_HOST_AUTH_REFRESH_TIMEOUT_MS", "CLAUDE_CODE_HOST_CREDS_FILE", ...g1r, "ANTHROPIC_BEDROCK_SERVICE_TIER", "CLAUDE_CODE_CERT_STORE", "DISABLE_GROWTHBOOK"]);
    SMt = ["VERTEX_REGION_CLAUDE_"];
    wWu = new Set(["HTTP_PROXY", "HTTPS_PROXY", "NO_PROXY"]);
    Zgn = ["ANTHROPIC_UNIX_SOCKET", "CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST", "CLAUDE_CODE_HOST_AUTH_ENV_VAR"];
    CPs = ["apiKeyHelper", "awsAuthRefresh", "awsCredentialExport", "fileSuggestion", "gcpAuthRefresh", "otelHeadersHelper", "proxyAuthHelper", "statusLine", "subagentStatusLine"];
    Int = new Set(["ANTHROPIC_BEDROCK_SERVICE_TIER", "ANTHROPIC_CUSTOM_HEADERS", "ANTHROPIC_CUSTOM_MODEL_OPTION", "ANTHROPIC_CUSTOM_MODEL_OPTION_DESCRIPTION", "ANTHROPIC_CUSTOM_MODEL_OPTION_NAME", "ANTHROPIC_CUSTOM_MODEL_OPTION_SUPPORTED_CAPABILITIES", "ANTHROPIC_DEFAULT_FABLE_MODEL", "ANTHROPIC_DEFAULT_FABLE_MODEL_DESCRIPTION", "ANTHROPIC_DEFAULT_FABLE_MODEL_NAME", "ANTHROPIC_DEFAULT_FABLE_MODEL_SUPPORTED_CAPABILITIES", "ANTHROPIC_DEFAULT_HAIKU_MODEL", "ANTHROPIC_DEFAULT_HAIKU_MODEL_DESCRIPTION", "ANTHROPIC_DEFAULT_HAIKU_MODEL_NAME", "ANTHROPIC_DEFAULT_HAIKU_MODEL_SUPPORTED_CAPABILITIES", "ANTHROPIC_DEFAULT_OPUS_MODEL", "ANTHROPIC_DEFAULT_OPUS_MODEL_DESCRIPTION", "ANTHROPIC_DEFAULT_OPUS_MODEL_NAME", "ANTHROPIC_DEFAULT_OPUS_MODEL_SUPPORTED_CAPABILITIES", "ANTHROPIC_DEFAULT_SONNET_MODEL", "ANTHROPIC_DEFAULT_SONNET_MODEL_DESCRIPTION", "ANTHROPIC_DEFAULT_SONNET_MODEL_NAME", "ANTHROPIC_DEFAULT_SONNET_MODEL_SUPPORTED_CAPABILITIES", "ANTHROPIC_FOUNDRY_API_KEY", "ANTHROPIC_MODEL", "ANTHROPIC_SMALL_FAST_MODEL_AWS_REGION", "ANTHROPIC_SMALL_FAST_MODEL", "AWS_DEFAULT_REGION", "AWS_PROFILE", "AWS_REGION", "BASH_DEFAULT_TIMEOUT_MS", "BASH_MAX_OUTPUT_LENGTH", "BASH_MAX_TIMEOUT_MS", "CLAUDE_BASH_MAINTAIN_PROJECT_WORKING_DIR", "CLAUDE_CODE_API_KEY_HELPER_TTL_MS", "CLAUDE_CODE_DISABLE_EXPERIMENTAL_BETAS", "CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC", "CLAUDE_CODE_DISABLE_TERMINAL_TITLE", "CLAUDE_CODE_ENABLE_AUTO_MODE", "CLAUDE_CODE_ENABLE_DESIGN_SYNC", "CLAUDE_CODE_ENABLE_FEEDBACK_SURVEY_FOR_OTEL", "CLAUDE_CODE_ENABLE_TELEMETRY", "CLAUDE_CODE_EXPERIMENTAL_AGENT_TEAMS", "CLAUDE_CODE_IDE_SKIP_AUTO_INSTALL", "CLAUDE_CODE_MAX_OUTPUT_TOKENS", "CLAUDE_CODE_SKIP_BEDROCK_AUTH", "CLAUDE_CODE_SKIP_FOUNDRY_AUTH", "CLAUDE_CODE_SKIP_ANTHROPIC_AWS_AUTH", "CLAUDE_CODE_SKIP_MANTLE_AUTH", "CLAUDE_CODE_SKIP_VERTEX_AUTH", "CLAUDE_CODE_SUBAGENT_MODEL", "CLAUDE_CODE_USE_BEDROCK", "CLAUDE_CODE_USE_FOUNDRY", "CLAUDE_CODE_USE_ANTHROPIC_AWS", "CLAUDE_CODE_USE_GATEWAY", "CLAUDE_CODE_USE_MANTLE", "CLAUDE_CODE_USE_POWERSHELL_TOOL", "CLAUDE_CODE_USE_VERTEX", "DISABLE_AUTOUPDATER", "DISABLE_BUG_COMMAND", "DISABLE_COST_WARNINGS", "DISABLE_ERROR_REPORTING", "DISABLE_FEEDBACK_COMMAND", "DISABLE_GROWTHBOOK", "DISABLE_INSTALLATION_CHECKS", "DISABLE_TELEMETRY", "DISABLE_UPDATES", "ENABLE_TOOL_SEARCH", "MAX_MCP_OUTPUT_TOKENS", "MAX_THINKING_TOKENS", "MCP_CONNECT_TIMEOUT_MS", "MCP_TIMEOUT", "MCP_TOOL_TIMEOUT", "OTEL_EXPORTER_OTLP_HEADERS", "OTEL_EXPORTER_OTLP_LOGS_HEADERS", "OTEL_EXPORTER_OTLP_LOGS_PROTOCOL", "OTEL_EXPORTER_OTLP_METRICS_HEADERS", "OTEL_EXPORTER_OTLP_METRICS_PROTOCOL", "OTEL_EXPORTER_OTLP_PROTOCOL", "OTEL_EXPORTER_OTLP_TRACES_HEADERS", "OTEL_LOG_ASSISTANT_RESPONSES", "OTEL_LOG_TOOL_CONTENT", "OTEL_LOG_TOOL_DETAILS", "OTEL_LOG_USER_PROMPTS", "OTEL_LOGS_EXPORT_INTERVAL", "OTEL_LOGS_EXPORTER", "OTEL_METRIC_EXPORT_INTERVAL", "OTEL_METRICS_EXPORTER", "OTEL_METRICS_INCLUDE_ACCOUNT_UUID", "OTEL_METRICS_INCLUDE_ENTRYPOINT", "OTEL_METRICS_INCLUDE_RESOURCE_ATTRIBUTES", "OTEL_METRICS_INCLUDE_SESSION_ID", "OTEL_METRICS_INCLUDE_VERSION", "OTEL_RESOURCE_ATTRIBUTES", "OTEL_TRACES_EXPORTER", "USE_BUILTIN_RIPGREP", "VERTEX_REGION_CLAUDE_3_5_HAIKU", "VERTEX_REGION_CLAUDE_3_5_SONNET", "VERTEX_REGION_CLAUDE_3_7_SONNET", "VERTEX_REGION_CLAUDE_4_0_OPUS", "VERTEX_REGION_CLAUDE_4_0_SONNET", "VERTEX_REGION_CLAUDE_4_1_OPUS", "VERTEX_REGION_CLAUDE_4_5_OPUS", "VERTEX_REGION_CLAUDE_4_6_OPUS", "VERTEX_REGION_CLAUDE_4_7_OPUS", "VERTEX_REGION_CLAUDE_4_8_OPUS", "VERTEX_REGION_CLAUDE_FABLE_5", "VERTEX_REGION_CLAUDE_4_5_SONNET", "VERTEX_REGION_CLAUDE_4_6_SONNET", "VERTEX_REGION_CLAUDE_5_SONNET", "VERTEX_REGION_CLAUDE_HAIKU_4_5"]);
  });
  function Pnt(e, t) {
    if (bje = e, t?.verified) {
      nyn = e;
    }
    o_();
  }
  function xPs() {
    return bje !== null && bje === nyn;
  }
  function kPs() {
    bje = null;
    y1r = undefined;
    _1r = false;
    nyn = null;
  }
  function APs() {
    _1r = true;
  }
  function IPs() {
    return _1r;
  }
  function ble(e) {
    y1r = e;
    return e;
  }
  function Sle() {
    return;
  }
  function ryn() {
    return Sle() ?? RPs.join(er(), "remote-settings.json");
  }
  function RWu() {
    try {
      let e = LP(ryn());
      let t = qt(iW(e));
      if (!t || typeof t !== "object" || Array.isArray(t)) {
        return null;
      }
      return t;
    } catch {
      return null;
    }
  }
  function kWu(e) {
    if (!e?.env) {
      return e;
    }
    let t = vbu(e.env, (n, r) => xWu.vZc(r.toUpperCase()));
    return {
      ...e,
      env: t
    };
  }
  function b1r() {
    if (!Sle() && y1r !== true) {
      return null;
    }
    if (bje) {
      return bje;
    }
    let e = RWu();
    if (e) {
      bje = e;
      o_();
      return e;
    }
    return null;
  }
  function Pke() {
    let e = b1r();
    if (e === nyn || Sle()) {
      return e;
    }
    return kWu(e);
  }
  var RPs;
  var bje = null;
  var y1r;
  var _1r = false;
  var nyn = null;
  var xWu;
  var TMt = __lazy(() => {
    gn();
    KB();
    lW();
    DA();
    RPs = require("path");
    xWu = new Set(["HTTPS_PROXY", "HTTP_PROXY", "NO_PROXY", "CLAUDE_CODE_PROXY_RESOLVES_HOSTS", "CLAUDE_CODE_ENABLE_PROXY_AUTH_HELPER", "CLAUDE_CODE_PROXY_AUTH_HELPER_TTL_MS", "API_FORCE_IDLE_TIMEOUT", "ANTHROPIC_UNIX_SOCKET", "NODE_EXTRA_CA_CERTS", "CLAUDE_CODE_CERT_STORE", "CLAUDE_CODE_CLIENT_CERT", "CLAUDE_CODE_CLIENT_KEY", "CLAUDE_CODE_CLIENT_KEY_PASSPHRASE", "ALL_PROXY", "NODE_OPTIONS", "NODE_TLS_REJECT_UNAUTHORIZED", ...$te, ..._le, "CLAUDE_CODE_CUSTOM_OAUTH_URL", ...uY, "ANTHROPIC_CUSTOM_HEADERS", "CLAUDE_CODE_HOST_CREDS_FILE", "CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST", "CLAUDE_CODE_HOST_AUTH_ENV_VAR", "CLAUDE_CONFIG_DIR", "CLAUDE_SECURESTORAGE_CONFIG_DIR", "CLAUDE_CODE_REMOTE_SETTINGS_PATH", "CLAUDE_CODE_MOCK_REMOTE_SETTINGS", "USE_LOCAL_OAUTH", "USE_STAGING_OAUTH", "CLAUDE_LOCAL_OAUTH_API_BASE"].map(e => e.toUpperCase()));
  });
  var S1r;
  var AWu;
  var IWu;
  var T1r;
  var E1r;
  var PWu;
  var v1r;
  var PPs = __lazy(() => {
    S1r = require("path");
    AWu = we(() => v.object({
      allowedDomains: v.array(v.string()).optional(),
      deniedDomains: v.array(v.string()).optional().describe("Domains that are always blocked, even if matched by allowedDomains. Supports the same wildcard syntax as allowedDomains. Merged from all settings sources regardless of allowManagedDomainsOnly."),
      allowManagedDomainsOnly: v.boolean().optional().describe("When true (and set in managed settings), only allowedDomains and WebFetch(domain:...) allow rules from managed settings are respected. User, project, local, and flag settings domains are ignored. Denied domains are still respected from all sources."),
      allowUnixSockets: v.array(v.string()).optional().describe("macOS only: Unix socket paths to allow. Ignored on Linux (seccomp cannot filter by path)."),
      allowAllUnixSockets: v.boolean().optional().describe("If true, allow all Unix sockets (disables blocking on both platforms)."),
      allowLocalBinding: v.boolean().optional(),
      allowMachLookup: v.array(v.string().refine(e => !(e.endsWith("*") ? e.slice(0, -1) : e).includes("*"), {
        message: 'Wildcards are only allowed as a single trailing "*" (e.g., "com.example.*" or "*" for all services).'
      })).optional().describe('macOS only: Additional XPC/Mach service names to allow looking up. Supports trailing-wildcard prefix matching (e.g., "com.apple.coresimulator.*"). Needed for tools that communicate via XPC such as the iOS Simulator or Playwright.'),
      httpProxyPort: v.number().optional(),
      socksProxyPort: v.number().optional(),
      tlsTerminate: v.object({
        caCertPath: v.string().min(1).optional(),
        caKeyPath: v.string().min(1).optional()
      }).optional().describe("[EXPERIMENTAL] Enable in-process TLS termination so the per-request filter can see HTTPS request bodies. Provide a CA cert+key, or omit both to have sandbox-runtime generate an ephemeral one for the session.")
    }).optional());
    IWu = we(() => v.object({
      allowWrite: v.array(v.string()).optional().describe("Additional paths to allow writing within the sandbox. Merged with paths from Edit(...) allow permission rules."),
      denyWrite: v.array(v.string()).optional().describe("Additional paths to deny writing within the sandbox. Merged with paths from Edit(...) deny permission rules."),
      denyRead: v.array(v.string()).optional().describe("Additional paths to deny reading within the sandbox. Merged with paths from Read(...) deny permission rules."),
      allowRead: v.array(v.string()).optional().describe("Paths to re-allow reading within denyRead regions. Takes precedence over denyRead for matching paths."),
      allowManagedReadPathsOnly: v.boolean().optional().describe("When true (set in managed settings), only allowRead paths from policySettings are used.")
    }).optional());
    T1r = we(() => v.object({
      path: v.string().min(1).describe("Path to a credential file or directory. Same resolution as sandbox.filesystem.* paths: absolute, ~ expanded, or relative to the settings file root (project root for project settings, ~/.claude for user settings)."),
      mode: v.literal("deny").describe("Access mode for this path. Only `deny` is supported.")
    }));
    E1r = we(() => v.object({
      name: v.string().regex(/^[A-Za-z_][A-Za-z0-9_]*$/, "Environment variable name must start with a letter or underscore and contain only letters, digits, and underscores").describe("Environment variable name."),
      mode: v.literal("deny").describe("Access mode for this environment variable. Only `deny` is supported.")
    }));
    PWu = we(() => v.object({
      files: v.array(T1r()).optional().describe("Credential files or directories to protect. `deny` blocks reads inside the sandbox."),
      envVars: v.array(E1r()).optional().describe("Environment variables to protect. `deny` unsets the variable for sandboxed commands.")
    }).optional());
    v1r = we(() => v.object({
      enabled: v.boolean().optional(),
      failIfUnavailable: v.boolean().optional().describe("Exit with an error at startup if sandbox.enabled is true but the sandbox cannot start (missing dependencies or unsupported platform). When false (default), a warning is shown and commands run unsandboxed. Intended for managed-settings deployments that require sandboxing as a hard gate."),
      autoAllowBashIfSandboxed: v.boolean().optional(),
      allowUnsandboxedCommands: v.boolean().optional().describe("Allow commands to run outside the sandbox via the dangerouslyDisableSandbox parameter. When false, the dangerouslyDisableSandbox parameter is completely ignored and all commands must run sandboxed. Default: true."),
      network: AWu(),
      filesystem: IWu(),
      credentials: PWu(),
      ignoreViolations: v.record(v.string(), v.array(v.string())).optional(),
      enableWeakerNestedSandbox: v.boolean().optional(),
      enableWeakerNetworkIsolation: v.boolean().optional().describe("macOS only: Allow access to com.apple.trustd.agent in the sandbox. Needed for Go-based CLI tools (gh, gcloud, terraform, etc.) to verify TLS certificates when using httpProxyPort with a MITM proxy and custom CA. " + "**Reduces security** \u2014 opens a potential data exfiltration vector through the trustd service. Default: false"),
      allowAppleEvents: v.boolean().optional().describe("macOS only: Allow sandboxed commands to send Apple Events (and look up the appleeventsd Mach service). Needed for `open`, `osascript`, and browser-based auth flows that open URLs. " + "**Removes code-execution isolation** \u2014 sandboxed commands can launch other applications " + "unsandboxed with no user prompt, and can script running apps (e.g. Terminal) subject to the user's per-app TCC automation consent. " + "Only honored from user, managed/policy, or CLI (--settings) settings \u2014 " + "project settings (.claude/settings.json and .claude/settings.local.json) are ignored. Default: false"),
      excludedCommands: v.array(v.string()).optional(),
      ripgrep: v.object({
        command: v.string(),
        args: v.array(v.string()).optional()
      }).optional().describe("Custom ripgrep configuration for bundled ripgrep support"),
      bwrapPath: v.preprocess(e => typeof e === "string" && S1r.isAbsolute(e) ? e : undefined, v.string()).optional().catch(undefined).describe("Linux/WSL only: Absolute path to the bwrap (bubblewrap) binary. Overrides auto-detection via PATH. Only honored from admin-controlled managed settings."),
      socatPath: v.preprocess(e => typeof e === "string" && S1r.isAbsolute(e) ? e : undefined, v.string()).optional().catch(undefined).describe("Linux/WSL only: Absolute path to the socat binary used for the sandbox network proxy. Overrides auto-detection via PATH. Only honored from admin-controlled managed settings.")
    }).passthrough());
  });
  var NOTIFICATION_CHANNELS;
  var EDITOR_MODES;
  var OPs;
  var w1r;
  var EMt;
  var vMt = __lazy(() => {
    NOTIFICATION_CHANNELS = ["auto", "iterm2", "iterm2_with_bell", "terminal_bell", "kitty", "ghostty", "notifications_disabled"];
    EDITOR_MODES = ["normal", "vim"];
    OPs = ["auto", "tmux", "iterm2", "in-process"];
    w1r = ["dark", "light", "light-daltonized", "dark-daltonized", "light-ansi", "dark-ansi"];
    EMt = ["auto", ...w1r];
  });
  function GPs() {
    return OWu;
  }
  var Tc;
  var CMt;
  var OWu;
  var lF;
  var cF;
  var wl = __lazy(() => {
    Cs();
    Tc = Wt() === "macos" ? "\u23FA" : "\u25CF";
    CMt = ["\xB7|\xB7", "\xB7/\xB7", "\xB7\u2014\xB7", "\xB7\\\xB7"];
    OWu = ["\u280B", "\u2819", "\u2839", "\u2838", "\u283C", "\u2834", "\u2826", "\u2827", "\u2807", "\u280F"];
    lF = {
      topLeft: "\u256D",
      topRight: "\u256E",
      bottomLeft: "\u2570",
      bottomRight: "\u256F"
    };
    cF = {
      branch: "\u251C",
      last: "\u2514",
      pipe: "\u2502",
      teeDown: "\u252C",
      teeUp: "\u2534"
    };
  });
  var P1r = {};