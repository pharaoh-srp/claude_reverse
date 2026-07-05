  __export(ust, {
    sigtermThenKill: () => sigtermThenKill,
    ownProcStartAsync: () => ownProcStartAsync,
    ownProcStart: () => ownProcStart,
    isSameProcessAsync: () => isSameProcessAsync,
    isSameProcess: () => isSameProcess,
    isProcessRunning: () => isProcessRunning,
    getProcessStartTimeAsync: () => getProcessStartTimeAsync,
    getProcessStartTime: () => getProcessStartTime,
    getProcessCreationTimeMsAsync: () => getProcessCreationTimeMsAsync,
    getProcessCommand: () => getProcessCommand,
    getChildPids: () => getChildPids,
    getAncestorPidsAsync: () => getAncestorPidsAsync,
    getAncestorCommandsAsync: () => getAncestorCommandsAsync,
    _resetProcStartCacheForTesting: () => _resetProcStartCacheForTesting
  });
  function isProcessRunning(e) {
    if (e <= 1) {
      return false;
    }
    try {
      process.kill(e, 0);
      return true;
    } catch {
      return false;
    }
  }
  function sigtermThenKill(e, t) {
    for (let n of e) {
      try {
        process.kill(n, "SIGTERM");
      } catch {
        continue;
      }
      setTimeout((r, o, s) => {
        if (!isSameProcess(o, s)) {
          return;
        }
        try {
          process.kill(r, "SIGKILL");
        } catch {}
      }, 5000, n, Math.abs(e[0]), t).unref();
      return true;
    }
    return false;
  }
  async function getAncestorPidsAsync(e, t = 10) {
    let n = `pid=${String(e)}; for i in $(seq 1 ${t}); do ppid=$(ps -o ppid= -p $pid 2>/dev/null | tr -d ' '); if [ -z "$ppid" ] || [ "$ppid" = "0" ] || [ "$ppid" = "1" ]; then break; fi; echo $ppid; pid=$ppid; done`;
    let r = await execFileNoThrowWithCwd("sh", ["-c", n], {
      timeout: 3000
    });
    if (r.code !== 0 || !r.stdout?.trim()) {
      return [];
    }
    return r.stdout.trim().split(`
`).filter(Boolean).map(o => parseInt(o, 10)).filter(o => !isNaN(o));
  }
  function getProcessCommand(e) {
    try {
      let n = `ps -o command= -p ${String(e)}`;
      let r = execSyncWithDefaults_BLOCKS_EVENT_LOOP_WILL_FREEZE_UI_MAKE_SURE_YOU_KNOW_WHAT_YOU_ARE_DOING(n, {
        timeout: 1000
      });
      return r ? r.trim() : null;
    } catch {
      return null;
    }
  }
  function getProcessStartTime(e) {
    try {
      {
        let n = zt().readFileSync(`/proc/${e}/stat`, {
          encoding: "utf8"
        });
        let r = n.lastIndexOf(")");
        return n.slice(r + 2).split(" ")[19];
      }
      let t = execSyncWithDefaults_BLOCKS_EVENT_LOOP_WILL_FREEZE_UI_MAKE_SURE_YOU_KNOW_WHAT_YOU_ARE_DOING(`LC_ALL=C TZ=UTC ps -o lstart= -p ${e}`, {
        timeout: 1000
      });
      return t ? t.trim() : undefined;
    } catch {
      return;
    }
  }
  function isSameProcess(e, t) {
    if (t === undefined) {
      return true;
    }
    let n = getProcessStartTime(e);
    return n === undefined || n === t;
  }
  async function isSameProcessAsync(e, t) {
    if (t === undefined) {
      return true;
    }
    let n = await getProcessStartTimeAsync(e);
    return n === undefined || n === t;
  }
  function ownProcStart() {
    return PWr ??= getProcessStartTime(process.pid);
  }
  async function ownProcStartAsync() {
    return PWr ??= await getProcessStartTimeAsync(process.pid);
  }
  async function getProcessStartTimeAsync(e, t) {
    let n = Date.now();
    if (!t?.skipCache) {
      let i = rRn.get(e);
      let a = i?.miss ? 5000 : 60000;
      if (i && n - i.at < a) {
        return i.p;
      }
    }
    let r = Zvd(e);
    let o = {
      at: n,
      p: r
    };
    rRn.set(e, o);
    let s = await r;
    if (s === undefined && rRn.get(e) === o) {
      o.miss = true;
    }
    return s;
  }
  function _resetProcStartCacheForTesting() {
    rRn.clear();
    PWr = undefined;
  }
  async function Zvd(e) {
    try {
      {
        let n = await zt().readFile(`/proc/${e}/stat`, {
          encoding: "utf8"
        });
        let r = n.lastIndexOf(")");
        return n.slice(r + 2).split(" ")[19];
      }
      let t = await execFileNoThrowWithCwd("ps", ["-o", "lstart=", "-p", String(e)], {
        timeout: 1000,
        env: {
          ...process.env,
          LC_ALL: "C",
          TZ: "UTC"
        }
      });
      return t.code === 0 && t.stdout ? t.stdout.trim() : undefined;
    } catch {
      return;
    }
  }
  async function getProcessCreationTimeMsAsync(e) {
    try {
      {
        let r = await zt().readFile(`/proc/${e}/stat`, {
          encoding: "utf8"
        });
        let o = Number(r.slice(r.lastIndexOf(")") + 2).split(" ")[19]);
        let s = await zt().readFile("/proc/stat", {
          encoding: "utf8"
        });
        let i = Number(/^btime (\d+)/m.exec(s)?.[1]);
        if (!Number.isFinite(o) || !Number.isFinite(i)) {
          return null;
        }
        return i * 1000 + o / 100 * 1000;
      }
      let t = await execFileNoThrowWithCwd("ps", ["-o", "lstart=", "-p", String(e)], {
        timeout: 1000,
        env: {
          ...process.env,
          LC_ALL: "C",
          TZ: "UTC"
        }
      });
      if (t.code !== 0 || !t.stdout?.trim()) {
        return null;
      }
      let n = Date.parse(`${t.stdout.trim()} UTC`);
      return Number.isFinite(n) ? n : null;
    } catch {
      return null;
    }
  }
  async function getAncestorCommandsAsync(e, t = 10) {
    let n = `currentpid=${String(e)}; for i in $(seq 1 ${t}); do cmd=$(ps -o command= -p $currentpid 2>/dev/null); if [ -n "$cmd" ]; then printf '%s\\0' "$cmd"; fi; ppid=$(ps -o ppid= -p $currentpid 2>/dev/null | tr -d ' '); if [ -z "$ppid" ] || [ "$ppid" = "0" ] || [ "$ppid" = "1" ]; then break; fi; currentpid=$ppid; done`;
    let r = await execFileNoThrowWithCwd("sh", ["-c", n], {
      timeout: 3000
    });
    if (r.code !== 0 || !r.stdout?.trim()) {
      return [];
    }
    return r.stdout.split("\x00").filter(Boolean);
  }
  function getChildPids(e) {
    try {
      let n = `pgrep -P ${String(e)}`;
      let r = execSyncWithDefaults_BLOCKS_EVENT_LOOP_WILL_FREEZE_UI_MAKE_SURE_YOU_KNOW_WHAT_YOU_ARE_DOING(n, {
        timeout: 1000
      });
      if (!r) {
        return [];
      }
      return r.trim().split(`
`).filter(Boolean).map(o => parseInt(o, 10)).filter(o => !isNaN(o));
    } catch {
      return [];
    }
  }
  var PWr;
  var rRn;
  var Tb = __lazy(() => {
    ji();
    rRn = new Map();
  });
  function getTeammateContext() {
    return MWr.getStore();
  }
  function runWithTeammateContext(e, t) {
    return MWr.run(e, t);
  }
  function isInProcessTeammate() {
    return MWr.getStore() !== undefined;
  }
  function createTeammateContext(e) {
    return {
      ...e,
      isInProcess: true
    };
  }
  var ypi;
  var MWr;
  var Uj = __lazy(() => {
    ypi = require("async_hooks");
    MWr = new ypi.AsyncLocalStorage();
  });
  var UWr = {};