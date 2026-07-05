  __export(Amc, {
    repointTaskOutputSymlinks: () => repointTaskOutputSymlinks,
    initTaskOutputAsSymlink: () => initTaskOutputAsSymlink,
    initTaskOutput: () => initTaskOutput,
    getTaskOutputSize: () => getTaskOutputSize,
    getTaskOutputPath: () => getTaskOutputPath,
    getTaskOutputDir: () => getTaskOutputDir,
    getTaskOutputDelta: () => getTaskOutputDelta,
    getTaskOutput: () => getTaskOutput,
    flushTaskOutput: () => flushTaskOutput,
    evictTaskOutput: () => evictTaskOutput,
    cleanupTaskOutput: () => cleanupTaskOutput,
    appendTaskOutput: () => appendTaskOutput,
    _resetTaskOutputDirForTest: () => _resetTaskOutputDirForTest,
    _clearOutputsForTest: () => _clearOutputsForTest,
    MAX_TASK_OUTPUT_BYTES_DISPLAY: () => "5GB",
    MAX_TASK_OUTPUT_BYTES: () => 5368709120,
    DiskTaskOutput: () => DiskTaskOutput
  });
  function getTaskOutputDir() {
    if (OJe === undefined) {
      OJe = dRt.join(getProjectTempDir(), getSessionId(), "tasks");
    }
    return OJe;
  }
  function _resetTaskOutputDirForTest() {
    OJe = undefined;
  }
  async function bzo() {
    await Wx.mkdir(getTaskOutputDir(), {
      recursive: true
    });
  }
  function getTaskOutputPath(e) {
    return dRt.join(getTaskOutputDir(), `${e}.output`);
  }
  function Npr(e) {
    Dpr.add(e);
    e.finally(() => Dpr.delete(e)).catch(() => {});
    return e;
  }
  class DiskTaskOutput {
    #e;
    #t = null;
    #n = [];
    #r = 0;
    #o = false;
    #l = null;
    #s = null;
    constructor(e) {
      this.#e = getTaskOutputPath(e);
    }
    append(e) {
      if (this.#o) {
        return;
      }
      if (this.#r += e.length, this.#r > 5368709120) {
        this.#o = true;
        this.#n.push(`
[output truncated: exceeded ${"5GB"} disk cap]
`);
      } else {
        this.#n.push(e);
      }
      if (!this.#l) {
        this.#l = new Promise(t => {
          this.#s = t;
        });
        Npr(this.#i());
      }
    }
    flush() {
      return this.#l ?? Promise.resolve();
    }
    cancel() {
      this.#n.length = 0;
    }
    async #a() {
      while (true) {
        try {
          if (!this.#t) {
            await bzo();
            this.#t = await Wx.open(this.#e, TBe.constants.O_WRONLY | TBe.constants.O_APPEND | TBe.constants.O_CREAT | Kmc);
          }
          while (true) {
            if (await this.#c(), this.#n.length === 0) {
              break;
            }
          }
        } finally {
          if (this.#t) {
            let e = this.#t;
            this.#t = null;
            await e.close();
          }
        }
        if (this.#n.length) {
          continue;
        }
        break;
      }
    }
    #c() {
      return this.#t.appendFile(this.#u());
    }
    #u() {
      let e = this.#n.splice(0, this.#n.length);
      let t = 0;
      for (let o of e) {
        t += Buffer.byteLength(o, "utf8");
      }
      let n = Buffer.allocUnsafe(t);
      let r = 0;
      for (let o of e) {
        r += n.write(o, r, "utf8");
      }
      return n;
    }
    async #i() {
      try {
        await this.#a();
      } catch (e) {
        if (logForDebugging(`Task output drain failed (will retry once): ${e}`, {
          level: "error"
        }), this.#n.length > 0) {
          try {
            await this.#a();
          } catch (t) {
            let n = en(t);
            if (n && v6.vZc(n)) {
              logForDebugging(`Task output drain retry failed (${n}): ${t}`, {
                level: "error"
              });
            } else {
              Oe(t);
            }
          }
        }
      } finally {
        let e = this.#s;
        this.#l = null;
        this.#s = null;
        e();
      }
    }
  }
  async function _clearOutputsForTest() {
    for (let e of PCe.values()) {
      e.cancel();
    }
    while (Dpr.size > 0) {
      await Promise.allSettled([...Dpr]);
    }
    PCe.clear();
  }
  function Upf(e) {
    let t = PCe.get(e);
    if (!t) {
      t = new DiskTaskOutput(e);
      PCe.set(e, t);
    }
    return t;
  }
  function appendTaskOutput(e, t) {
    Upf(e).append(t);
  }
  async function flushTaskOutput(e) {
    let t = PCe.get(e);
    if (t) {
      await t.flush();
    }
  }
  function evictTaskOutput(e) {
    return Npr((async () => {
      let t = PCe.get(e);
      if (t) {
        await t.flush();
        PCe.delete(e);
      }
    })());
  }
  async function getTaskOutputDelta(e, t, n = 8388608) {
    try {
      let r = await Ycn(getTaskOutputPath(e), t, n);
      if (!r) {
        return {
          content: "",
          newOffset: t
        };
      }
      return {
        content: r.content,
        newOffset: t + r.bytesRead
      };
    } catch (r) {
      let o = en(r);
      if (o === "ENOENT") {
        return {
          content: "",
          newOffset: t
        };
      }
      if (o && v6.vZc(o)) {
        logForDebugging(`getTaskOutputDelta failed (${o}): ${r}`, {
          level: "error"
        });
      } else {
        Oe(r);
      }
      return {
        content: "",
        newOffset: t
      };
    }
  }
  async function getTaskOutput(e, t = 8388608) {
    try {
      let {
        content: n,
        bytesTotal: r,
        bytesRead: o
      } = await LA(getTaskOutputPath(e), t);
      if (r > o) {
        return `[${Math.round((r - o) / 1024)}KB of earlier output omitted]
${n}`;
      }
      return n;
    } catch (n) {
      let r = en(n);
      if (r === "ENOENT") {
        return "";
      }
      if (r && v6.vZc(r)) {
        logForDebugging(`getTaskOutput failed (${r}): ${n}`, {
          level: "error"
        });
      } else {
        Oe(n);
      }
      return "";
    }
  }
  async function getTaskOutputSize(e) {
    try {
      return (await Wx.stat(getTaskOutputPath(e))).size;
    } catch (t) {
      let n = en(t);
      if (n === "ENOENT") {
        return 0;
      }
      if (n && v6.vZc(n)) {
        logForDebugging(`getTaskOutputSize failed (${n}): ${t}`, {
          level: "error"
        });
      } else {
        Oe(t);
      }
      return 0;
    }
  }
  async function cleanupTaskOutput(e) {
    let t = PCe.get(e);
    if (t) {
      t.cancel();
      PCe.delete(e);
    }
    try {
      await Wx.unlink(getTaskOutputPath(e));
    } catch (n) {
      let r = en(n);
      if (r === "ENOENT") {
        return;
      }
      if (r && v6.vZc(r)) {
        logForDebugging(`cleanupTaskOutput failed (${r}): ${n}`, {
          level: "error"
        });
      } else {
        Oe(n);
      }
    }
  }
  async function repointTaskOutputSymlinks(e, t) {
    if (OJe === undefined) {
      return;
    }
    let n;
    try {
      n = await Wx.readdir(OJe);
    } catch (o) {
      let s = en(o);
      if (s !== "ENOENT") {
        if (s && v6.vZc(s)) {
          logForDebugging(`repointTaskOutputSymlinks readdir failed (${s}): ${o}`, {
            level: "error"
          });
        } else {
          Oe(o);
        }
      }
      return;
    }
    let r = e + dRt.sep;
    for (let o of n) {
      if (!o.endsWith(".output")) {
        continue;
      }
      let s = dRt.join(OJe, o);
      let i;
      try {
        i = await Wx.readlink(s);
      } catch {
        continue;
      }
      if (!i.startsWith(r)) {
        continue;
      }
      let a = t + i.slice(e.length);
      try {
        await Wx.unlink(s);
        await Wx.symlink(a, s);
      } catch (l) {
        Oe(l);
      }
    }
  }
  function initTaskOutput(e) {
    return Npr((async () => {
      await bzo();
      let t = getTaskOutputPath(e);
      await (await Wx.open(t, TBe.constants.O_WRONLY | TBe.constants.O_CREAT | TBe.constants.O_EXCL | Kmc)).close();
      return t;
    })());
  }
  async function qpf(e, t) {
    if (e === t) {
      return true;
    }
    try {
      if (!(await Wx.lstat(e)).isFile()) {
        return false;
      }
      return (await Wx.realpath(e)) === (await Wx.realpath(t));
    } catch {
      return false;
    }
  }
  function initTaskOutputAsSymlink(e, t, n) {
    return Npr((async () => {
      try {
        await bzo();
        let r = getTaskOutputPath(e);
        if (await qpf(r, t)) {
          n?.("noop");
          return r;
        }
        try {
          await Wx.symlink(t, r);
        } catch (o) {
          if (en(o) !== "EEXIST") {
            throw o;
          }
          await Wx.unlink(r);
          await Wx.symlink(t, r);
        }
        n?.("symlink");
        return r;
      } catch (r) {
        let o = en(r);
        if (o && v6.vZc(o)) {
          logForDebugging(`initTaskOutputAsSymlink failed (${o}): ${r}`, {
            level: "error"
          });
        } else {
          Oe(r);
        }
        return initTaskOutput(e);
      }
    })());
  }
  var TBe;
  var Wx;
  var dRt;
  var Kmc;
  var OJe;
  var Dpr;
  var PCe;
  var cE = __lazy(() => {
    at();
    je();
    dt();
    Rn();
    wm();
    TBe = require("fs");
    Wx = require("fs/promises");
    dRt = require("path");
    Kmc = TBe.constants.O_NOFOLLOW ?? 0;
    Dpr = new Set();
    PCe = new Map();
  });
  function Mw(e) {
    return e === "completed" || e === "failed" || e === "killed";
  }
  function S5e(e) {
    for (let t of Object.values(e)) {
      if (Wpf.vZc(t.type) && !Mw(t.status) && !(t.type === "in_process_teammate" && t.isIdle) && !(t.type === "remote_agent" && t.isLongRunning)) {
        return true;
      }
    }
    return false;
  }
  function Trr(e) {
    for (let t of Object.values(e)) {
      if (t.type === "local_bash" && !Mw(t.status)) {
        return true;
      }
    }
    return false;
  }
  function Vpf(e) {
    return Gpf[e] ?? "x";
  }
  function TU(e) {
    let t = Vpf(e);
    let n = Xmc.randomBytes(8);
    let r = t;
    for (let o = 0; o < 8; o++) {
      r += ("0123456789abcdefghijklmnopqrstuvwxyz")[n[o] % ("0123456789abcdefghijklmnopqrstuvwxyz").length];
    }
    return r;
  }
  function ww(e, t, n, r) {
    return {
      id: e,
      type: t,
      status: "pending",
      description: n,
      toolUseId: r,
      startTime: Date.now(),
      outputFile: getTaskOutputPath(e),
      outputOffset: 0,
      notified: false
    };
  }
  var Xmc;
  var Wpf;
  var Gpf;
  var Cx = __lazy(() => {
    cE();
    Xmc = require("crypto");
    Wpf = new Set(["local_agent", "remote_agent", "in_process_teammate", "local_workflow"]);
    Gpf = {
      local_bash: "b",
      local_agent: "a",
      remote_agent: "r",
      in_process_teammate: "t",
      local_workflow: "w",
      monitor_mcp: "m",
      monitor_ws: "s",
      mcp_task: "k",
      dream: "d"
    };
  });
  async function SOa() {
    await Promise.allSettled(Array.from(Szo));
  }
  function Jpf(e, t) {
    return t ? `${e} ${t}` : e;
  }
  async function Xpf(e) {
    try {
      let t = efc.dirname(e);
      let n = await Fpr.statfs(t, {
        bigint: true
      });
      let r = n.bavail * n.bsize / (1024n * 1024n);
      let o = "Free up space or set CLAUDE_CODE_TMPDIR to a directory on a filesystem with room.";
      if (r < 0n) {
        return null;
      }
      if (r < 10n) {
        return `Command output was lost: the temp filesystem at ${t} is full (${r}MB free). The child process's stdout/stderr writes failed with ENOSPC. Free up space or set CLAUDE_CODE_TMPDIR to a directory on a filesystem with room.`;
      }
      if (n.files > 0n && n.ffree < 1000n) {
        return `Command output was lost: the temp filesystem at ${t} is out of inodes (${n.ffree} free). The child process's stdout/stderr writes failed with ENOSPC. Free up space or set CLAUDE_CODE_TMPDIR to a directory on a filesystem with room.`;
      }
    } catch {}
    return null;
  }
  class Tzo {
    #e;
    #t = false;
    #n;
    #r;
    #o = this.#l.bind(this);
    constructor(e, t, n) {
      this.#e = e;
      this.#n = t;
      this.#r = n;
      e.setEncoding("utf-8");
      e.on("data", this.#o);
    }
    #l(e) {
      let t = typeof e === "string" ? e : e.toString();
      if (this.#r) {
        this.#n.writeStderr(t);
      } else {
        this.#n.writeStdout(t);
      }
    }
    cleanup() {
      if (this.#t) {
        return;
      }
      this.#t = true;
      this.#e.removeListener("data", this.#o);
      this.#e = null;
      this.#n = null;
      this.#o = () => {};
    }
  }
  class Ezo {
    #e = "running";
    #t;
    #n;
    #r;
    #o;
    #l = null;
    #s = null;
    #a = false;
    #c;
    #u;
    #i;
    #p;
    #g;
    #f = null;
    #d = null;
    #y = null;
    taskOutput;
    static #h(e) {
      if (e.#g && e.#i) {
        e.#i(e.background.bind(e));
      } else {
        e.#R(143);
      }
    }
    result;
    onTimeout;
    constructor(e, t, n, r, o = false, s = 5368709120) {
      if (this.#o = e, this.#u = t, this.#p = n, this.#g = o, this.#c = s, this.taskOutput = r, this.#r = e.stderr ? new Tzo(e.stderr, r, true) : null, this.#n = e.stdout ? new Tzo(e.stdout, r, false) : null, o) {
        this.onTimeout = i => {
          this.#i = i;
        };
      }
      this.result = this.#I();
    }
    get status() {
      return this.#e;
    }
    #b() {
      if (unwrapAbortReason(this.#u.reason) === "interrupt") {
        return;
      }
      this.kill();
    }
    #E(e, t) {
      let n = e !== null && e !== undefined ? e : t === "SIGTERM" ? 144 : 1;
      this.#T(n);
    }
    #S() {
      this.#T(1);
    }
    #T(e) {
      if (this.#d) {
        this.#d(e);
        this.#d = null;
      }
    }
    #w() {
      this.#_();
      let e = this.#l;
      if (e) {
        clearTimeout(e);
        this.#l = null;
      }
      let t = this.#y;
      if (t) {
        this.#u.removeEventListener("abort", t);
        this.#y = null;
      }
    }
    #_() {
      if (this.#s) {
        clearInterval(this.#s);
        this.#s = null;
      }
    }
    #P() {
      if (this.#s) {
        return;
      }
      this.#s = setInterval(() => {
        Fpr.stat(this.taskOutput.path).then(e => {
          if (e.size > this.#c && (this.#e === "running" || this.#e === "backgrounded") && this.#s !== null) {
            this.#a = true;
            this.#_();
            this.#R(137);
          }
        }, () => {});
      }, 5000);
      this.#s.unref();
    }
    #I() {
      if (this.#y = this.#b.bind(this), this.#u.addEventListener("abort", this.#y, {
        once: true
      }), this.#o.once("exit", this.#E.bind(this)), this.#o.once("error", this.#S.bind(this)), this.#l = setTimeout(Ezo.#h, this.#p, this), this.taskOutput.stdoutToFile) {
        this.#P();
      }
      let e = new Promise(t => {
        this.#d = t;
      });
      return new Promise(t => {
        this.#f = t;
        e.then(this.#C.bind(this));
      });
    }
    async #C(e) {
      if (this.#w(), this.#e === "running" || this.#e === "backgrounded") {
        this.#e = "completed";
      }
      let t = await this.taskOutput.getStdout();
      let n = {
        code: e,
        stdout: t,
        stderr: this.taskOutput.getStderr(),
        interrupted: e === 137,
        backgroundTaskId: this.#t
      };
      if (this.taskOutput.stdoutToFile && !this.#t) {
        if (this.taskOutput.outputFileRedundant || this.#a) {
          setImmediate(() => {
            if (!this.#t) {
              this.taskOutput.deleteOutputFile();
            }
          });
        } else {
          n.outputFilePath = this.taskOutput.path;
          n.outputFileSize = this.taskOutput.outputFileSize;
          n.outputTaskId = this.taskOutput.taskId;
        }
      }
      let r = s => {
        if (this.taskOutput.stdoutToFile && !this.#t) {
          n.stdout = t ? `${s}
${t}` : s;
        } else {
          n.stderr = Jpf(s, n.stderr);
        }
      };
      if (this.#a) {
        r(`Command killed: output file exceeded ${"5GB"}`);
        n.outputFileSize = this.taskOutput.outputFileSize;
      } else if (e === 143) {
        r(`Command timed out after ${formatDuration(this.#p)}`);
      } else if (this.taskOutput.stdoutToFile && t === "" && e !== 0 && e !== 137) {
        let s = await Xpf(this.taskOutput.path);
        if (s) {
          n.stdout = s;
        }
      }
      let o = this.#f;
      if (o) {
        this.#f = null;
        o(n);
      }
    }
    #R(e) {
      this.#e = "killed";
      let t = this.#o?.pid;
      if (this.#T(e ?? 137), !t) {
        return Promise.resolve();
      }
      let n = $6e(t, "SIGTERM");
      let r = new Promise(o => {
        let s;
        let i = false;
        let a = setTimeout(() => {
          i = true;
          clearInterval(s);
          try {
            process.kill(-t, "SIGKILL");
          } catch {}
          $6e(t, "SIGKILL").finally(o);
        }, 1500);
        if (a.unref(), Wt() !== "windows") {
          n.then(() => {
            if (i) {
              return;
            }
            if (Zmc(t)) {
              clearTimeout(a);
              o();
              return;
            }
            s = setInterval(() => {
              if (!Zmc(t)) {
                return;
              }
              clearTimeout(a);
              clearInterval(s);
              o();
            }, 100);
            s.unref();
          });
        }
      });
      Szo.add(r);
      r.finally(() => Szo.delete(r));
      return r;
    }
    kill() {
      return this.#R();
    }
    background(e, t) {
      if (this.#e === "running") {
        if (this.#t = e, this.#e = "backgrounded", this.#w(), this.taskOutput.stdoutToFile) {
          this.#P();
        } else if (!t?.skipSpill) {
          this.taskOutput.spillToDisk();
        }
        if (t?.capMs) {
          this.#l = setTimeout(n => void n.#R(), t.capMs, this);
          this.#l.unref?.();
        }
        return true;
      }
      return false;
    }
    detach() {
      let e = this.#o?.pid;
      if (e !== undefined) {
        this.#o.unref();
      }
      return e;
    }
    cleanup() {
      this.#n?.cleanup();
      this.#r?.cleanup();
      this.taskOutput.clear();
      this.#w();
      this.#o = null;
      this.#u = null;
      this.#i = undefined;
    }
  }
  function Tqn(e, t, n, r, o = false, s = 5368709120) {
    return new Ezo(e, t, n, r, o, s);
  }
  class tfc {
    status = "killed";
    result;
    taskOutput;
    constructor() {
      this.taskOutput = new Db(TU("local_bash"), null);
      this.result = Promise.resolve({
        code: 145,
        stdout: "",
        stderr: "Command aborted before execution",
        interrupted: true
      });
    }
    background() {
      return false;
    }
    kill() {
      return Promise.resolve();
    }
    cleanup() {}
  }
  function xIa() {
    return new tfc();
  }
  function Zmc(e) {
    for (let t of [-e, e]) {
      try {
        process.kill(t, 0);
        return false;
      } catch (n) {
        if (en(n) !== "ESRCH") {
          return false;
        }
      }
    }
    return true;
  }
  function bqn(e) {
    let t = new Db(TU("local_bash"), null);
    return {
      status: "completed",
      result: Promise.resolve({
        code: 1,
        stdout: "",
        stderr: e,
        interrupted: false,
        preSpawnError: e
      }),
      taskOutput: t,
      background() {
        return false;
      },
      kill() {
        return Promise.resolve();
      },
      cleanup() {}
    };
  }
  var Fpr;
  var efc;
  var Szo;
  var Eqn = __lazy(() => {
    Cx();
    Kp();
    dt();
    cs();
    y5t();
    Cs();
    cE();
    w5e();
    Fpr = require("fs/promises");
    efc = require("path");
    Szo = new Set();
  });
  function TL(e) {
    return !("async" in e && e.async === true);
  }
  function mhe(e) {
    return "async" in e && e.async === true;
  }
  var Qpf;
  var Zpf;
  var pRt;
  var vzo = __lazy(() => {
    qte();
    Ctr();
    Qpf = we(() => v.enum(["allow", "deny", "ask", "defer"]));
    Zpf = we(() => v.object({
      continue: v.boolean().describe("Whether Claude should continue after hook (default: true)").optional(),
      suppressOutput: v.boolean().describe("Hide stdout from transcript (default: false)").optional(),
      stopReason: v.string().describe("Message shown when continue is false").optional(),
      decision: v.enum(["approve", "block"]).optional(),
      reason: v.string().describe("Explanation for the decision").optional(),
      systemMessage: v.string().describe("Warning message shown to the user").optional(),
      terminalSequence: v.string().describe("A terminal escape sequence (e.g. OSC 9 / OSC 777 desktop-notification) for Claude Code to emit on your behalf. Only notification/title OSCs (0, 1, 2, 9, 99, 777) and BEL are permitted; anything else is dropped.").optional(),
      hookSpecificOutput: v.union([v.object({
        hookEventName: v.literal("PreToolUse"),
        permissionDecision: Qpf().optional(),
        permissionDecisionReason: v.string().optional(),
        updatedInput: v.record(v.string(), v.unknown()).optional(),
        additionalContext: v.string().optional()
      }), v.object({
        hookEventName: v.literal("UserPromptSubmit"),
        additionalContext: v.string().optional(),
        sessionTitle: v.string().describe("Set the session title").optional(),
        suppressOriginalPrompt: v.boolean().describe('When decision is "block", omit the original prompt from the block message').optional()
      }), v.object({
        hookEventName: v.literal("UserPromptExpansion"),
        additionalContext: v.string().optional()
      }), v.object({
        hookEventName: v.literal("SessionStart"),
        additionalContext: v.string().optional(),
        initialUserMessage: v.string().optional(),
        sessionTitle: v.string().describe("Set the session title").optional(),
        watchPaths: v.array(v.string()).describe("Absolute paths to watch for FileChanged hooks").optional(),
        reloadSkills: v.boolean().describe("Re-scan skill and command directories after SessionStart hooks complete, so skills installed by the hook are available in the same session").optional()
      }), v.object({
        hookEventName: v.literal("Setup"),
        additionalContext: v.string().optional()
      }), v.object({
        hookEventName: v.literal("SubagentStart"),
        additionalContext: v.string().optional()
      }), v.object({
        hookEventName: v.literal("PostToolUse"),
        additionalContext: v.string().optional(),
        updatedToolOutput: v.unknown().describe("Replaces the tool output before it is sent to the model").optional(),
        updatedMCPToolOutput: v.unknown().describe("Replaces the output for MCP tools only. Prefer updatedToolOutput, which works for all tools").optional()
      }), v.object({
        hookEventName: v.literal("PostToolUseFailure"),
        additionalContext: v.string().optional()
      }), v.object({
        hookEventName: v.literal("PostToolBatch"),
        additionalContext: v.string().optional()
      }), v.object({
        hookEventName: v.literal("Stop"),
        additionalContext: v.string().optional()
      }), v.object({
        hookEventName: v.literal("SubagentStop"),
        additionalContext: v.string().optional()
      }), v.object({
        hookEventName: v.literal("PermissionDenied"),
        retry: v.boolean().optional()
      }), v.object({
        hookEventName: v.literal("Notification"),
        additionalContext: v.string().optional()
      }), v.object({
        hookEventName: v.literal("PermissionRequest"),
        decision: v.union([v.object({
          behavior: v.literal("allow"),
          updatedInput: v.record(v.string(), v.unknown()).optional(),
          updatedPermissions: v.array(KTt()).optional()
        }), v.object({
          behavior: v.literal("deny"),
          message: v.string().optional(),
          interrupt: v.boolean().optional()
        })])
      }), v.object({
        hookEventName: v.literal("Elicitation"),
        action: v.enum(["accept", "decline", "cancel"]).optional(),
        content: v.record(v.string(), v.unknown()).optional()
      }), v.object({
        hookEventName: v.literal("ElicitationResult"),
        action: v.enum(["accept", "decline", "cancel"]).optional(),
        content: v.record(v.string(), v.unknown()).optional()
      }), v.object({
        hookEventName: v.literal("CwdChanged"),
        watchPaths: v.array(v.string()).describe("Absolute paths to watch for FileChanged hooks").optional()
      }), v.object({
        hookEventName: v.literal("FileChanged"),
        watchPaths: v.array(v.string()).describe("Absolute paths to watch for FileChanged hooks").optional()
      }), v.object({
        hookEventName: v.literal("WorktreeCreate"),
        worktreePath: v.string()
      }), v.object({
        hookEventName: v.literal("MessageDisplay"),
        displayContent: v.string().describe("Text displayed in place of the delta. Omit (or return the delta unchanged) to display the original.").optional()
      })]).optional()
    }));
    pRt = we(() => {
      let e = v.object({
        async: v.literal(true),
        asyncTimeout: v.number().optional()
      });
      return v.union([e, Zpf()]);
    });
  });
  function Upr(e, t) {
    return Pht(e, t);
  }
  function nfc() {
    return {
      ...nuo,
      alwaysLoad: true,
      inputSchema: inn(),
      inputJSONSchema: {
        type: "object",
        properties: {
          ok: {
            type: "boolean",
            description: "Whether the condition was met"
          },
          reason: {
            type: "string",
            description: "Reason, if the condition was not met"
          }
        },
        required: ["ok"],
        additionalProperties: false
      },
      async prompt() {
        return "Use this tool to return your verification result. You MUST call this tool exactly once at the end of your response.";
      }
    };
  }
  var inn;
  var wzo = __lazy(() => {
    O1();
    J5t();
    inn = we(() => v.object({
      ok: v.boolean().describe("Whether the condition was met"),
      reason: v.string().describe("Reason, if the condition was not met").optional(),
      impossible: v.boolean().describe("Whether the condition can never be satisfied (only meaningful when ok is false)").optional()
    }));
  });
  async function ofc(e, t, n, r, o, s, i, a) {
    let l = a || `hook-${rfc.randomUUID()}`;
    let c = n === "Stop" || n === "SubagentStop";
    try {
      let u = c ? `Based on the conversation transcript above, has the following stopping condition been satisfied? Answer based on transcript evidence only.

Condition: ${e.prompt}` : e.prompt;
      let d = Upr(u, r);
      logForDebugging(`Hooks: Processing prompt hook with prompt: ${d}`);
      let p = In({
        content: d
      });
      let m = e.model ?? getSmallFastModel();
      let f = b => i && i.length > 0 ? [...nmf(i, m, b), p] : [p];
      let h = f();
      logForDebugging(`Hooks: Querying model with ${h.length} messages`);
      let g = e.timeout ? e.timeout * 1000 : 30000;
      let {
        signal: y,
        cleanup: _
      } = jO(o, {
        timeoutMs: g
      });
      try {
        let E = O => ann({
          messages: O,
          systemPrompt: [c ? `You are evaluating a stop-condition hook in Claude Code. Read the conversation transcript carefully, then judge whether the user-provided condition is satisfied.

Your response must be a JSON object with one of these shapes:
- {"ok": true, "reason": "<quote evidence from the transcript that satisfies the condition>"}
- {"ok": false, "reason": "<quote what is missing or what blocks the condition>"}
- {"ok": false, "impossible": true, "reason": "<explain why the condition can never be satisfied>"}

Always include a "reason" field, quoting specific text from the transcript whenever possible. If the transcript does not contain clear evidence that the condition is satisfied, return {"ok": false, "reason": "insufficient evidence in transcript"}.

Only use {"ok": false, "impossible": true} when the condition is genuinely unachievable in this session \u2014 for example: the condition is self-contradictory, it depends on a resource or capability that is unavailable, or the assistant has explicitly tried, exhausted reasonable approaches, and stated it cannot be done. Apply your own judgment when deciding this \u2014 the assistant claiming the goal is impossible is evidence, not proof; independently confirm the condition is genuinely unachievable rather than deferring to the assistant's self-assessment. Do not use it just because the goal has not been reached yet or because progress is slow. When in doubt, return {"ok": false} without "impossible".` : `You are evaluating a hook condition in Claude Code. Judge whether the user-provided condition is met.

Your response must be a JSON object with one of these shapes:
- {"ok": true, "reason": "<reason the condition is met>"}
- {"ok": false, "reason": "<reason the condition is not met>"}

Always include a "reason" field.`],
          thinkingConfig: {
            type: "disabled"
          },
          tools: [],
          signal: y,
          options: {
            async getToolPermissionContext() {
              return getToolPermissionContext(s);
            },
            model: m,
            toolChoice: undefined,
            isNonInteractiveSession: true,
            hasAppendSystemPrompt: false,
            agents: [],
            querySource: "hook_prompt",
            promptTooLongIsHandled: true,
            mcpTools: [],
            agentId: s.agentId,
            agentContext: s.agentContext,
            stickyBetas: wN(getStickyBetas()),
            outputFormat: {
              type: "json_schema",
              schema: {
                type: "object",
                properties: {
                  ok: {
                    type: "boolean"
                  },
                  reason: {
                    type: "string"
                  },
                  impossible: {
                    type: "boolean"
                  }
                },
                required: ["ok", "reason"],
                additionalProperties: false
              }
            }
          }
        });
        let C = await E(h);
        if (wTe(C) && i && i.length > 0) {
          logEvent("tengu_hook_prompt_too_long_retry", {
            evaluatorModel: m
          });
          h = f(0.5 / 2);
          logForDebugging(`Hooks: evaluator prompt too long; retrying with ${h.length} messages`);
          C = await E(h);
        }
        if (_(), C.isApiErrorMessage) {
          let O = Tl(C.message.content).trim();
          logForDebugging(`Hooks: prompt-hook evaluator API error: ${O}`, {
            level: "error"
          });
          return {
            hook: e,
            outcome: "non_blocking_error",
            message: createAttachmentMessage({
              type: "hook_non_blocking_error",
              hookName: t,
              toolUseID: l,
              hookEvent: n,
              stderr: `Hook evaluator API error: ${O}`,
              stdout: "",
              exitCode: 1
            })
          };
        }
        let A = Tl(C.message.content).trim();
        logForDebugging(`Hooks: Model response: ${A}`);
        let k = Ba(aW(A), false);
        if (!k) {
          logForDebugging(`Hooks: error parsing response as JSON: ${A}`);
          return {
            hook: e,
            outcome: "non_blocking_error",
            message: createAttachmentMessage({
              type: "hook_non_blocking_error",
              hookName: t,
              toolUseID: l,
              hookEvent: n,
              stderr: "JSON validation failed",
              stdout: A,
              exitCode: 1
            })
          };
        }
        let I = inn().safeParse(k);
        if (!I.success) {
          logForDebugging(`Hooks: model response does not conform to expected schema: ${I.error.message}`);
          return {
            hook: e,
            outcome: "non_blocking_error",
            message: createAttachmentMessage({
              type: "hook_non_blocking_error",
              hookName: t,
              toolUseID: l,
              hookEvent: n,
              stderr: `Schema validation failed: ${I.error.message}`,
              stdout: A,
              exitCode: 1
            })
          };
        }
        if (!I.data.ok) {
          if (I.data.impossible === true && c) {
            logForDebugging(`Hooks: Prompt hook condition judged impossible: ${I.data.reason}`);
            return {
              hook: e,
              outcome: "success",
              impossible: true,
              stopReason: I.data.reason,
              message: createAttachmentMessage({
                type: "hook_success",
                hookName: t,
                toolUseID: l,
                hookEvent: n,
                content: ""
              })
            };
          }
          logForDebugging(`Hooks: Prompt hook condition was not met: ${I.data.reason}`);
          return {
            hook: e,
            outcome: "blocking",
            blockingError: {
              blockingError: `[${e.prompt}]: ${I.data.reason}`,
              command: e.prompt
            },
            preventContinuation: !c && e.continueOnBlock !== true,
            stopReason: I.data.reason
          };
        }
        logForDebugging(`Hooks: Prompt hook condition was met: ${I.data.reason}`);
        return {
          hook: e,
          outcome: "success",
          stopReason: I.data.reason,
          message: createAttachmentMessage({
            type: "hook_success",
            hookName: t,
            toolUseID: l,
            hookEvent: n,
            content: ""
          })
        };
      } catch (b) {
        if (_(), y.aborted) {
          return {
            hook: e,
            outcome: "cancelled"
          };
        }
        throw b;
      }
    } catch (u) {
      let d = he(u);
      logForDebugging(`Hooks: Prompt hook error: ${d}`);
      return {
        hook: e,
        outcome: "non_blocking_error",
        message: createAttachmentMessage({
          type: "hook_non_blocking_error",
          hookName: t,
          toolUseID: l,
          hookEvent: n,
          stderr: `Error executing prompt hook: ${d}`,
          stdout: "",
          exitCode: 1
        })
      };
    }
  }
  function emf(e) {
    for (let t = e.length - 1; t >= 0; t--) {
      let n = e[t];
      if (n.type === "assistant" && "usage" in n.message && n.message.model !== "<synthetic>") {
        let r = n.message.usage;
        return r.input_tokens + (r.cache_creation_input_tokens ?? 0) + (r.cache_read_input_tokens ?? 0) + r.output_tokens;
      }
    }
    return 0;
  }
  function tmf(e) {
    let t = 0;
    for (let n of e) {
      t += n.type === "assistant" || n.type === "user" ? XOe(n.message.content) : De(n).length / 4;
    }
    return Math.ceil(t);
  }
  function nmf(e, t, n = 0.5) {
    let r = hg(t) || modelHasNative1MContext(t) ? 1e6 : 200000;
    let o = Math.floor(r * n);
    if (emf(e) <= o) {
      return e;
    }
    let s = Apt(e);
    let i = 0;
    let a = s.length;
    for (let u = s.length - 1; u >= 0; u--) {
      let d = tmf(s[u]);
      if (a < s.length && i + d > o) {
        break;
      }
      i += d;
      a = u;
    }
    let l = s.slice(a).flat();
    let c = e.length - l.length;
    if (c <= 0) {
      return e;
    }
    logForDebugging(`Hooks: truncated Stop transcript ${e.length}\u2192${l.length} msgs (budget ${o}, model ${t})`);
    logEvent("tengu_hook_prompt_transcript_truncated", {
      droppedMessages: c,
      keptMessages: l.length,
      budget: o,
      evaluatorModel: t
    });
    return [In({
      content: `[Earlier conversation truncated to fit the hook evaluator's context window \u2014 ${c} earlier messages omitted. Evaluate the condition against the recent transcript below; if the required evidence may be in the omitted prefix, return {"ok": false, "reason": "insufficient evidence in transcript"}.]`
    }), ...l];
  }
  var rfc;
  var ifc = __lazy(() => {
    at();
    Ot();
    aE();
    vO();
    aU();
    rR();
    Bve();
    VT();
    Sl();
    je();
    dt();
    Gd();
    ro();
    Eo();
    wzo();
    rfc = require("crypto");
  });
  async function afc(e, t, n, r, o, s, i, a) {
    let l = i || `hook-${Czo.randomUUID()}`;
    let c = s.agentId ? Ew(s.agentId) : wh();
    let u = qd(zt(), c).resolvedPath;
    let d = Date.now();
    try {
      let p = Upr(e.prompt, r);
      logForDebugging(`Hooks: Processing agent hook with prompt: ${p}`);
      let f = [In({
        content: p
      })];
      logForDebugging(`Hooks: Starting agent query with ${f.length} messages`);
      let h = e.timeout ? e.timeout * 1000 : 60000;
      let g = createAbortController();
      let {
        signal: y,
        cleanup: _
      } = jO(o, {
        timeoutMs: h
      });
      let b = () => g.abort();
      y.addEventListener("abort", b);
      let S = g.signal;
      try {
        let E = nfc();
        let C = [...rmf(s.options.tools), E];
        let A = n === "Stop" || n === "SubagentStop" ? "You are verifying a stop condition in Claude Code. Your task is to verify that the agent completed the given plan." : `You are evaluating a ${n} hook in Claude Code. Your task is to evaluate the condition described in the user message.`;
        let k = [`${A} The conversation transcript is available at: ${u}
You can read this file to analyze the conversation history if needed.

Use the available tools to inspect the codebase and verify the condition.
Use as few steps as possible - be efficient and direct.

When done, return your result using the ${"StructuredOutput"} tool with:
- ok: true if the condition is met
- ok: false with reason if the condition is not met`];
        let I = e.model ?? getSmallFastModel();
        let O = 50;
        let M = `${"hook-agent-"}${Czo.randomUUID()}`;
        let L = {
          ...s,
          agentId: M,
          abortController: g,
          options: {
            ...s.options,
            tools: C,
            mainLoopModel: I,
            isNonInteractiveSession: true,
            requiresStructuredOutput: true,
            thinkingConfig: {
              type: "disabled"
            },
            activeMcpServer: undefined,
            activeMcpTool: undefined,
            refreshTools: undefined,
            refreshMcpClients: undefined
          },
          getAppState() {
            let U = s.getAppState();
            let N = U.toolPermissionContext.alwaysAllowRules.session ?? [];
            return {
              ...U,
              toolPermissionContext: {
                ...U.toolPermissionContext,
                mode: "dontAsk",
                alwaysAllowRules: {
                  ...U.toolPermissionContext.alwaysAllowRules,
                  session: [...N, `Read(/${u})`]
                }
              }
            };
          }
        };
        let P = null;
        let F = 0;
        let H = false;
        for await (let U of _U({
          messages: f,
          systemPrompt: k,
          userContext: {},
          systemContext: {},
          canUseTool: hasPermissionsToUseTool,
          toolUseContext: L,
          querySource: "hook_agent"
        })) {
          if (EBe(U, {
            onMessage: () => {},
            onUpdateLength: () => {},
            onSetStreamMode: () => {},
            onStreamingToolUses: () => {}
          }), U.type === "stream_event" || U.type === "stream_request_start") {
            continue;
          }
          if (U.type === "assistant") {
            if (F++, F >= 50) {
              H = true;
              logForDebugging(`Hooks: Agent turn ${F} hit max turns, aborting`);
              g.abort();
              break;
            }
          }
          if (U.type === "attachment" && U.attachment.type === "structured_output") {
            let N = inn().safeParse(U.attachment.data);
            if (N.success) {
              P = N.data;
              logForDebugging(`Hooks: Got structured output: ${De(P)}`);
              g.abort();
              break;
            }
          }
        }
        if (y.removeEventListener("abort", b), _(), !P) {
          if (H) {
            logForDebugging("Hooks: Agent hook did not complete within 50 turns");
            logEvent("tengu_agent_stop_hook_max_turns", {
              durationMs: Date.now() - d,
              turnCount: F,
              hookEvent: n,
              agentName: a
            });
            return {
              hook: e,
              outcome: "cancelled"
            };
          }
          logForDebugging("Hooks: Agent hook did not return structured output");
          logEvent("tengu_agent_stop_hook_error", {
            durationMs: Date.now() - d,
            turnCount: F,
            errorType: 1,
            hookEvent: n,
            agentName: a
          });
          return {
            hook: e,
            outcome: "cancelled"
          };
        }
        if (!P.ok) {
          logForDebugging(`Hooks: Agent hook condition was not met: ${P.reason}`);
          logEvent("tengu_agent_stop_hook_blocking", {
            durationMs: Date.now() - d,
            turnCount: F,
            hookEvent: n,
            agentName: a
          });
          return {
            hook: e,
            outcome: "blocking",
            blockingError: {
              blockingError: `Agent hook condition was not met: ${P.reason}`,
              command: e.prompt
            }
          };
        }
        logForDebugging("Hooks: Agent hook condition was met");
        logEvent("tengu_agent_stop_hook_success", {
          durationMs: Date.now() - d,
          turnCount: F,
          hookEvent: n,
          agentName: a
        });
        return {
          hook: e,
          outcome: "success",
          message: createAttachmentMessage({
            type: "hook_success",
            hookName: t,
            toolUseID: l,
            hookEvent: n,
            content: ""
          })
        };
      } catch (E) {
        if (y.removeEventListener("abort", b), _(), S.aborted) {
          return {
            hook: e,
            outcome: "cancelled"
          };
        }
        throw E;
      }
    } catch (p) {
      let m = he(p);
      logForDebugging(`Hooks: Agent hook error: ${m}`);
      logEvent("tengu_agent_stop_hook_error", {
        durationMs: Date.now() - d,
        errorType: 2,
        hookEvent: n,
        agentName: a
      });
      return {
        hook: e,
        outcome: "non_blocking_error",
        message: createAttachmentMessage({
          type: "hook_non_blocking_error",
          hookName: t,
          toolUseID: l,
          hookEvent: n,
          stderr: `Error executing agent hook: ${m}`,
          stdout: "",
          exitCode: 1
        })
      };
    }
  }
  function rmf(e) {
    return e.filter(t => !bl(t, "StructuredOutput") && !oDe.vZc(t.name) && !bl(t, "Agent"));
  }
  var Czo;
  var lfc = __lazy(() => {
    BTe();
    Ot();
    ci();
    Sh();
    O1();
    jM();
    D_();
    Kp();
    rR();
    Bve();
    je();
    dt();
    ro();
    Eo();
    oy();
    Fy();
    wzo();
    Czo = require("crypto");
  });
  async function omf() {
    let {
      SandboxManager: e
    } = await Promise.resolve().then(() => (Th(), Hlo));
    if (!e.isSandboxingEnabled()) {
      return;
    }
    await e.waitForNetworkInitialization();
    let t = e.getProxyPort();
    if (!t) {
      return;
    }
    let n = e.getProxyAuthToken();
    return {
      host: "127.0.0.1",
      port: t,
      protocol: "http",
      ...(n && {
        auth: {
          username: "srt",
          password: n
        }
      })
    };
  }
  function smf() {
    let e = getInitialSettings();
    return {
      allowedUrls: e.allowedHttpHookUrls,
      allowedEnvVars: e.httpHookAllowedEnvVars
    };
  }
  function imf(e) {
    return e.replace(/[\r\n\x00]/g, "");
  }
  function amf(e, t) {
    let n = e.replace(/\$\{([A-Z_][A-Z0-9_]*)\}|\$([A-Z_][A-Z0-9_]*)/g, (r, o, s) => {
      let i = o ?? s;
      if (!t.vZc(i)) {
        logForDebugging(`Hooks: env var $${i} not in allowedEnvVars, skipping interpolation`, {
          level: "warn"
        });
        return "";
      }
      return subprocessEnv()[i] ?? "";
    });
    return imf(n);
  }
  async function Rzo(e, t, n, r, o = 600000) {
    let s = smf();
    if (s.allowedUrls !== undefined) {
      if (!s.allowedUrls.some(u => e5t(e.url, u))) {
        let u = `HTTP hook blocked: ${e.url} does not match any pattern in allowedHttpHookUrls`;
        logForDebugging(u, {
          level: "warn"
        });
        return {
          ok: false,
          body: "",
          error: u
        };
      }
    }
    let i = e.timeout ? e.timeout * 1000 : o;
    let {
      signal: a,
      cleanup: l
    } = jO(r, {
      timeoutMs: i
    });
    try {
      let c = {
        "Content-Type": "application/json"
      };
      if (e.headers) {
        let f = e.allowedEnvVars ?? [];
        let h = s.allowedEnvVars !== undefined ? f.filter(y => s.allowedEnvVars.includes(y)) : f;
        let g = new Set(h);
        for (let [y, _] of Object.entries(e.headers)) {
          c[y] = amf(_, g);
        }
      }
      let u = await omf();
      let d = !u && getProxyUrl() !== undefined && !shouldBypassProxy(e.url);
      if (u) {
        logForDebugging(`Hooks: HTTP hook POST to ${e.url} (via sandbox proxy :${u.port})`);
      } else if (d) {
        logForDebugging(`Hooks: HTTP hook POST to ${e.url} (via env-var proxy)`);
      } else {
        logForDebugging(`Hooks: HTTP hook POST to ${e.url}`);
      }
      let p = await externalHttp.post(e.url, n, {
        headers: c,
        signal: a,
        responseType: "text",
        validateStatus: () => true,
        maxRedirects: 0,
        proxy: u ?? false,
        lookup: u || d ? undefined : xAl
      });
      l();
      let m = p.data ?? "";
      logForDebugging(`Hooks: HTTP hook response status ${p.status}, body length ${m.length}`);
      return {
        ok: p.status >= 200 && p.status < 300,
        statusCode: p.status,
        body: m
      };
    } catch (c) {
      if (l(), a.aborted) {
        return {
          ok: false,
          body: "",
          aborted: true
        };
      }
      let u = he(c);
      logForDebugging(`Hooks: HTTP hook error: ${u}`, {
        level: "error"
      });
      return {
        ok: false,
        body: "",
        error: u
      };
    }
  }
  var cfc = __lazy(() => {
    pk();
    Bve();
    je();
    dt();
    Fh();
    s1();
    mSo();
    _tr();
  });
  function lmf(e, t) {
    let n = o => {
      let s = t;
      for (let i of o.split(".")) {
        if (s == null || typeof s !== "object") {
          return;
        }
        s = s[i];
      }
      return s;
    };
    let r = o => {
      if (typeof o === "string") {
        return o.replace(/\$\{([a-zA-Z_][a-zA-Z0-9_.]*)\}/g, (s, i) => {
          let a = n(i);
          if (a === undefined || a === null) {
            return "";
          }
          return typeof a === "object" ? De(a) : String(a);
        });
      }
      if (Array.isArray(o)) {
        return o.map(r);
      }
      if (o !== null && typeof o === "object") {
        let s = {};
        for (let [i, a] of Object.entries(o)) {
          s[i] = r(a);
        }
        return s;
      }
      return o;
    };
    return r(e);
  }
  async function xzo(e, t, n, r, o, s = 600000) {
    let i = r ?? getMcpClientsFromAccessor();
    if (i === undefined) {
      let p = `mcp_tool hooks are not available for the '${t}' hook event (no MCP client context)`;
      logForDebugging(`Hooks: mcp_tool hook skipped \u2014 ${p}`, {
        level: "warn"
      });
      return {
        ok: false,
        body: "",
        error: p
      };
    }
    let a = i.find(p => p.name === e.server);
    if (!a || a.type !== "connected") {
      let p = `MCP server '${e.server}' not connected`;
      logForDebugging(`Hooks: mcp_tool hook skipped \u2014 ${p}`, {
        level: "warn"
      });
      return {
        ok: false,
        body: "",
        error: p
      };
    }
    let l = e.input ? lmf(e.input, n) : {};
    let c = e.timeout ? e.timeout * 1000 : s;
    let {
      signal: u,
      cleanup: d
    } = jO(o, {
      timeoutMs: c
    });
    try {
      logForDebugging(`Hooks: mcp_tool calling ${e.server}/${e.tool} with ${Object.keys(l).length} arg(s)`);
      let p = await a.client.callTool({
        name: e.tool,
        arguments: l
      }, hj, {
        signal: u,
        timeout: c
      });
      d();
      let m = Array.isArray(p.content) ? p.content.map(f => f.type === "text" ? f.text : `[${f.type}]`).join(`
`) : "";
      if (p.isError) {
        return {
          ok: false,
          body: m,
          error: m || "MCP tool returned an error"
        };
      }
      return {
        ok: true,
        body: m
      };
    } catch (p) {
      if (d(), u.aborted) {
        return {
          ok: false,
          body: "",
          aborted: true
        };
      }
      let m = he(p);
      logForDebugging(`Hooks: mcp_tool hook error: ${m}`, {
        level: "error"
      });
      return {
        ok: false,
        body: "",
        error: m
      };
    }
  }
  var ufc = __lazy(() => {
    at();
    Bve();
    je();
    dt();
  });
  function dfc(e, t) {
    if (!e || typeof e !== "object" || Array.isArray(e) || !t || typeof t !== "object") {
      return;
    }
    let n = [];
    let r = new Set(Object.keys(t));
    for (let a of Object.keys(e)) {
      if (!r.vZc(a)) {
        n.push(a);
      }
    }
    let o = e.hookSpecificOutput;
    let s = "hookSpecificOutput" in t ? t.hookSpecificOutput : undefined;
    if (o && typeof o === "object" && !Array.isArray(o) && s && typeof s === "object") {
      let a = new Set(Object.keys(s));
      for (let l of Object.keys(o)) {
        if (!a.vZc(l)) {
          n.push(`hookSpecificOutput.${l}`);
        }
      }
    }
    if (n.length === 0) {
      return;
    }
    let i = n.includes("additionalContext") ? " Did you mean hookSpecificOutput.additionalContext (with a hookEventName)?" : "";
    logForDebugging(`Hook JSON output had unrecognized keys (ignored): ${n.join(", ")}.${i}`);
  }
  var pfc = __lazy(() => {
    je();
  });
  async function executePreCompactHooks(e, t, n = 600000) {
    let r = {
      ...createBaseHookInput(undefined),
      hook_event_name: "PreCompact",
      trigger: e.trigger,
      custom_instructions: e.customInstructions
    };
    let o = await executeHooksOutsideREPL({
      hookInput: r,
      matchQuery: e.trigger,
      signal: t,
      timeoutMs: n
    });
    if (o.length === 0) {
      return {};
    }
    let s = o.filter(l => l.succeeded && !l.blocked && l.output.trim().length > 0).map(l => l.output.trim());
    let i = [];
    for (let l of o) {
      if (l.succeeded && !l.blocked) {
        if (l.output.trim()) {
          i.push(`PreCompact [${l.command}] completed successfully: ${l.output.trim()}`);
        } else {
          i.push(`PreCompact [${l.command}] completed successfully`);
        }
      } else if (l.output.trim()) {
        i.push(`PreCompact [${l.command}] failed: ${l.output.trim()}`);
      } else {
        i.push(`PreCompact [${l.command}] failed`);
      }
    }
    let a = o.filter(l => l.blocked);
    return {
      newCustomInstructions: s.length > 0 ? s.join(`

`) : undefined,
      userDisplayMessage: i.length > 0 ? i.join(`
`) : undefined,
      ...(a.length > 0 && {
        blockedBy: a.map(l => {
          let c = l.output.trim();
          return `[${l.command}]${c ? `: ${c}` : ""}`;
        }).join(`
`)
      })
    };
  }
  async function executePostCompactHooks(e, t, n = 600000) {
    let r = {
      ...createBaseHookInput(undefined),
      hook_event_name: "PostCompact",
      trigger: e.trigger,
      compact_summary: e.compactSummary
    };
    let o = await executeHooksOutsideREPL({
      hookInput: r,
      matchQuery: e.trigger,
      signal: t,
      timeoutMs: n
    });
    if (o.length === 0) {
      return {};
    }
    let s = [];
    for (let i of o) {
      if (i.succeeded) {
        if (i.output.trim()) {
          s.push(`PostCompact [${i.command}] completed successfully: ${i.output.trim()}`);
        } else {
          s.push(`PostCompact [${i.command}] completed successfully`);
        }
      } else if (i.output.trim()) {
        s.push(`PostCompact [${i.command}] failed: ${i.output.trim()}`);
      } else {
        s.push(`PostCompact [${i.command}] failed`);
      }
    }
    return {
      userDisplayMessage: s.length > 0 ? s.join(`
`) : undefined
    };
  }
  var mfc = __lazy(() => {
    Sp();
  });
  async function executeConfigChangeHooks(e, t, n = 600000) {
    let r = {
      ...createBaseHookInput(undefined),
      hook_event_name: "ConfigChange",
      source: e,
      file_path: t
    };
    let o = await executeHooksOutsideREPL({
      hookInput: r,
      timeoutMs: n,
      matchQuery: e
    });
    if (e === "policy_settings") {
      return o.map(s => ({
        ...s,
        blocked: false
      }));
    }
    return o;
  }
  var ffc = __lazy(() => {
    Sp();
  });
  async function executeElicitationHooks({
    serverName: e,
    message: t,
    requestedSchema: n,
    permissionMode: r,
    signal: o,
    timeoutMs: s = Ep,
    mode: i,
    url: a,
    elicitationId: l
  }) {
    let c = {
      ...createBaseHookInput(r),
      hook_event_name: "Elicitation",
      mcp_server_name: e,
      message: t,
      mode: i,
      url: a,
      elicitation_id: l,
      requested_schema: n
    };
    let u = await executeHooksOutsideREPL({
      hookInput: c,
      matchQuery: e,
      signal: o,
      timeoutMs: s
    });
    let d;
    let p;
    for (let m of u) {
      let f = parseElicitationHookOutput(m, "Elicitation");
      if (f.blockingError) {
        p = f.blockingError;
      }
      if (f.response) {
        d = f.response;
      }
    }
    return {
      elicitationResponse: d,
      blockingError: p
    };
  }
  async function executeElicitationResultHooks({
    serverName: e,
    action: t,
    content: n,
    permissionMode: r,
    signal: o,
    timeoutMs: s = Ep,
    mode: i,
    elicitationId: a
  }) {
    let l = {
      ...createBaseHookInput(r),
      hook_event_name: "ElicitationResult",
      mcp_server_name: e,
      elicitation_id: a,
      mode: i,
      action: t,
      content: n
    };
    let c = await executeHooksOutsideREPL({
      hookInput: l,
      matchQuery: e,
      signal: o,
      timeoutMs: s
    });
    let u;
    let d;
    for (let p of c) {
      let m = parseElicitationHookOutput(p, "ElicitationResult");
      if (m.blockingError) {
        d = m.blockingError;
      }
      if (m.response) {
        u = m.response;
      }
    }
    return {
      elicitationResultResponse: u,
      blockingError: d
    };
  }
  var hfc = __lazy(() => {
    Sp();
  });
  async function gfc(e, t) {
    let n = await executeHooksOutsideREPL({
      hookInput: e,
      timeoutMs: t
    });
    if (n.length > 0) {
      Rpt();
    }
    let r = n.flatMap(s => s.watchPaths ?? []);
    let o = n.map(s => s.systemMessage).filter(s => !!s);
    return {
      results: n,
      watchPaths: r,
      systemMessages: o
    };
  }
  function executeCwdChangedHooks(e, t, n = 600000) {
    let r = {
      ...createBaseHookInput(undefined),
      hook_event_name: "CwdChanged",
      old_cwd: e,
      new_cwd: t
    };
    return gfc(r, n);
  }
  function executeFileChangedHooks(e, t, n = 600000) {
    let r = {
      ...createBaseHookInput(undefined),
      hook_event_name: "FileChanged",
      file_path: e,
      event: t
    };
    return gfc(r, n);
  }
  var yfc = __lazy(() => {
    Sp();
    K9e();
  });
  async function executeInstructionsLoadedHooks(e, t, n, r) {
    let {
      globs: o,
      triggerFilePath: s,
      parentFilePath: i,
      timeoutMs: a = Ep
    } = r ?? {};
    let l = {
      ...createBaseHookInput(undefined),
      hook_event_name: "InstructionsLoaded",
      file_path: e,
      memory_type: t,
      load_reason: n,
      globs: o,
      trigger_file_path: s,
      parent_file_path: i
    };
    await executeHooksOutsideREPL({
      hookInput: l,
      timeoutMs: a,
      matchQuery: n
    });
  }
  var _fc = __lazy(() => {
    Sp();
  });
  async function* executeMessageDisplayHooks(e, t, n, r = 600000) {
    let o = {
      ...createBaseHookInput(undefined),
      hook_event_name: "MessageDisplay",
      turn_id: e.turnId,
      message_id: e.messageId,
      index: e.index,
      final: e.final,
      delta: e.delta
    };
    yield* executeHooks({
      hookInput: o,
      toolUseID: `${e.messageId}-${e.index}`,
      signal: n,
      timeoutMs: r,
      getAppState: t,
      forceSyncExecution: true,
      suppressPerInvocationTelemetry: true
    });
  }
  var kzo = __lazy(() => {
    Sp();
  });
  async function executeNotificationHooks(e, t = 600000) {
    let {
      message: n,
      title: r,
      notificationType: o
    } = e;
    let s = {
      ...createBaseHookInput(undefined),
      hook_event_name: "Notification",
      message: n,
      title: r,
      notification_type: o
    };
    await executeHooksOutsideREPL({
      hookInput: s,
      timeoutMs: t,
      matchQuery: o
    });
  }
  var bfc = __lazy(() => {
    Sp();
  });
  async function* executeSessionStartHooks(e, t, n, r, o, s, i = 600000, a) {
    let l = {
      ...createBaseHookInput(undefined, t),
      hook_event_name: "SessionStart",
      source: e,
      agent_type: r,
      model: o,
      session_title: n ?? getCurrentSessionTitle(t !== undefined ? t : getSessionId())
    };
    yield* executeHooks({
      hookInput: l,
      toolUseID: Hpr.randomUUID(),
      matchQuery: e,
      signal: s,
      timeoutMs: i,
      forceSyncExecution: a
    });
  }
  async function* executeSetupHooks(e, t, n = 600000, r) {
    let o = {
      ...createBaseHookInput(undefined),
      hook_event_name: "Setup",
      trigger: e
    };
    yield* executeHooks({
      hookInput: o,
      toolUseID: Hpr.randomUUID(),
      matchQuery: e,
      signal: t,
      timeoutMs: n,
      forceSyncExecution: r
    });
  }
  async function* executeSubagentStartHooks(e, t, n, r = 600000, o) {
    let s = {
      ...createBaseHookInput(undefined),
      hook_event_name: "SubagentStart",
      agent_id: e,
      agent_type: t
    };
    yield* executeHooks({
      hookInput: s,
      toolUseID: Hpr.randomUUID(),
      matchQuery: t,
      signal: n,
      timeoutMs: r,
      getAppState: o
    });
  }
  async function executeSessionEndHooks(e, t) {
    let {
      getAppState: n,
      setAppState: r,
      signal: o
    } = t || {};
    let s = {
      ...createBaseHookInput(undefined),
      hook_event_name: "SessionEnd",
      reason: e
    };
    let i = await executeHooksOutsideREPL({
      getAppState: n,
      hookInput: s,
      matchQuery: e,
      signal: o,
      timeoutMs: 1500
    });
    for (let a of i) {
      if (!a.succeeded && a.output) {
        process.stderr.write(`SessionEnd hook [${a.command}] failed: ${a.output}
`);
      }
    }
    if (r) {
      let a = getSessionId();
      _No(r, a);
    }
  }
  var Hpr;
  var Sfc = __lazy(() => {
    at();
    D_();
    Sp();
    fa();
    pZ();
    Hpr = require("crypto");
  });
  function Tfc(e) {
    let t = [];
    for (let n of Object.values(e)) {
      if (!kv(n)) {
        continue;
      }
      let r = {
        id: n.id,
        type: Xwo[n.type] ?? n.type,
        status: n.status,
        description: Wge(n.description, 1000)
      };
      switch (n.type) {
        case "local_bash":
          r.command = Wge(n.command, 1000);
          break;
        case "local_agent":
          r.agent_type = n.agentType;
          break;
        case "monitor_mcp":
          r.server = n.server;
          r.tool = n.tool;
          break;
        case "mcp_task":
          r.server = n.serverName;
          r.tool = n.toolName;
          break;
        case "local_workflow":
          r.name = n.workflowName;
          break;
        case "in_process_teammate":
        case "remote_agent":
        case "dream":
        case "monitor_ws":
          break;
      }
      t.push(r);
    }
    return t;
  }
  function Efc(e = getSessionCronTasks()) {
    return e.map(t => ({
      id: t.id,
      schedule: t.cron,
      recurring: t.recurring ?? false,
      prompt: Wge(t.prompt, Azo)
    }));
  }
  var vfc = __lazy(() => {
    at();
    U8e();
    Zn();
  });
  async function executeStopFailureHooks(e, t, n = 600000) {
    let r = t?.getAppState();
    let o = getSessionId();
    if (!hasHookForEvent("StopFailure", r, o)) {
      return;
    }
    let s = Tl(e.message.content, `
`).trim() || undefined;
    let i = e.error ?? "unknown";
    let a = {
      ...createBaseHookInput(undefined, undefined, t),
      hook_event_name: "StopFailure",
      error: i,
      error_details: e.errorDetails,
      last_assistant_message: s
    };
    await executeHooksOutsideREPL({
      getAppState: t?.getAppState,
      hookInput: a,
      timeoutMs: n,
      matchQuery: i
    });
  }
  async function* executeStopHooks(e, t, n = 600000, r = false, o, s, i, a) {
    let l = o ? "SubagentStop" : "Stop";
    let c = s?.getAppState();
    let u = s?.agentId ?? getSessionId();
    if (!hasHookForEvent(l, c, u)) {
      return;
    }
    let d = i ? Yk(i) : undefined;
    let p = d ? Tl(d.message.content, `
`).trim() || undefined : undefined;
    let m = s ? {
      background_tasks: Tfc(s.taskRegistry.all()),
      session_crons: Efc()
    } : undefined;
    let f = o ? {
      ...createBaseHookInput(e, undefined, s),
      hook_event_name: "SubagentStop",
      stop_hook_active: r,
      agent_id: o,
      agent_transcript_path: Ew(o),
      agent_type: a ?? "",
      last_assistant_message: p,
      ...m
    } : {
      ...createBaseHookInput(e, undefined, s),
      hook_event_name: "Stop",
      stop_hook_active: r,
      last_assistant_message: p,
      ...m
    };
    let h;
    yield* executeHooks({
      hookInput: f,
      extendedHookInput: h,
      toolUseID: wfc.randomUUID(),
      signal: t,
      timeoutMs: n,
      toolUseContext: s,
      messages: i
    });
  }
  var wfc;
  var Cfc = __lazy(() => {
    at();
    Sp();
    ro();
    Fy();
    vfc();
    wfc = require("crypto");
  });
  async function* executeTeammateIdleHooks(e, t, n, r, o = 600000, s) {
    let i = {
      ...createBaseHookInput(n),
      hook_event_name: "TeammateIdle",
      teammate_name: e,
      team_name: t
    };
    yield* executeHooks({
      hookInput: i,
      toolUseID: qpr.randomUUID(),
      signal: r,
      timeoutMs: o,
      toolUseContext: s
    });
  }
  async function* executeTaskCreatedHooks(e, t, n, r, o, s, i, a = 600000, l) {
    let c = {
      ...createBaseHookInput(s),
      hook_event_name: "TaskCreated",
      task_id: e,
      task_subject: t,
      task_description: n,
      teammate_name: r,
      team_name: o
    };
    yield* executeHooks({
      hookInput: c,
      toolUseID: qpr.randomUUID(),
      signal: i,
      timeoutMs: a,
      toolUseContext: l
    });
  }
  async function* executeTaskCompletedHooks(e, t, n, r, o, s, i, a = 600000, l) {
    let c = {
      ...createBaseHookInput(s),
      hook_event_name: "TaskCompleted",
      task_id: e,
      task_subject: t,
      task_description: n,
      teammate_name: r,
      team_name: o
    };
    yield* executeHooks({
      hookInput: c,
      toolUseID: qpr.randomUUID(),
      signal: i,
      timeoutMs: a,
      toolUseContext: l
    });
  }
  var qpr;
  var Rfc = __lazy(() => {
    Sp();
    qpr = require("crypto");
  });
  async function* executePreToolHooks(e, t, n, r, o, s, i = 600000) {
    let a = r.getAppState();
    let l = r.agentId ?? getSessionId();
    if (!hasHookForEvent("PreToolUse", a, l)) {
      return;
    }
    logForDebugging(`executePreToolHooks called for tool: ${e}`, {
      level: "verbose"
    });
    let c = {
      ...createBaseHookInput(o, undefined, r),
      hook_event_name: "PreToolUse",
      tool_name: e,
      tool_input: n,
      tool_use_id: t
    };
    yield* executeHooks({
      hookInput: c,
      toolUseID: t,
      matchQuery: e,
      signal: s,
      timeoutMs: i,
      toolUseContext: r
    });
  }
  async function* executePostToolHooks(e, t, n, r, o, s, i, a = 600000, l) {
    let c = {
      ...createBaseHookInput(s, undefined, o),
      hook_event_name: "PostToolUse",
      tool_name: e,
      tool_input: n,
      tool_response: r,
      tool_use_id: t,
      duration_ms: l
    };
    yield* executeHooks({
      hookInput: c,
      toolUseID: t,
      matchQuery: e,
      signal: i,
      timeoutMs: a,
      toolUseContext: o
    });
  }
  async function* executePostToolUseFailureHooks(e, t, n, r, o, s, i, a, l = 600000, c) {
    let u = o.getAppState();
    let d = o.agentId ?? getSessionId();
    if (!hasHookForEvent("PostToolUseFailure", u, d)) {
      return;
    }
    let p = {
      ...createBaseHookInput(i, undefined, o),
      hook_event_name: "PostToolUseFailure",
      tool_name: e,
      tool_input: n,
      tool_use_id: t,
      error: r,
      is_interrupt: s,
      duration_ms: c
    };
    yield* executeHooks({
      hookInput: p,
      toolUseID: t,
      matchQuery: e,
      signal: a,
      timeoutMs: l,
      toolUseContext: o
    });
  }
  async function* executePostToolBatchHooks(e, t, n, r, o, s = 600000) {
    let i = n.getAppState();
    let a = n.agentId ?? getSessionId();
    if (!hasHookForEvent("PostToolBatch", i, a)) {
      return;
    }
    let l = {
      ...createBaseHookInput(r, undefined, n),
      hook_event_name: "PostToolBatch",
      tool_calls: e
    };
    yield* executeHooks({
      hookInput: l,
      toolUseID: t,
      signal: o,
      timeoutMs: s,
      toolUseContext: n
    });
  }
  async function* executePermissionDeniedHooks(e, t, n, r, o, s, i, a = 600000) {
    let l = o.getAppState();
    let c = o.agentId ?? getSessionId();
    if (!hasHookForEvent("PermissionDenied", l, c)) {
      return;
    }
    let u = {
      ...createBaseHookInput(s, undefined, o),
      hook_event_name: "PermissionDenied",
      tool_name: e,
      tool_input: n,
      tool_use_id: t,
      reason: r
    };
    yield* executeHooks({
      hookInput: u,
      toolUseID: t,
      matchQuery: e,
      signal: i,
      timeoutMs: a,
      toolUseContext: o
    });
  }
  async function* executePermissionRequestHooks(e, t, n, r, o, s, i, a = 600000) {
    logForDebugging(`executePermissionRequestHooks called for tool: ${e}`);
    let l = {
      ...createBaseHookInput(o, undefined, r),
      hook_event_name: "PermissionRequest",
      tool_name: e,
      tool_input: n,
      permission_suggestions: s
    };
    yield* executeHooks({
      hookInput: l,
      toolUseID: t,
      matchQuery: e,
      signal: i,
      timeoutMs: a,
      toolUseContext: r
    });
  }
  var xfc = __lazy(() => {
    at();
    je();
    Sp();
  });
  async function applyHookSessionTitle(e) {
    if (isTeammate()) {
      return;
    }
    let t = normalizeSessionTitle(e);
    if (!t) {
      return;
    }
    let n = getSessionId();
    let r = getCurrentSessionTitle(n);
    if (t === (r && normalizeSessionTitle(r))) {
      return;
    }
    logForDebugging(`Hook sessionTitle applied (${[...t].length} chars)`);
    await _we(t, "hook");
    await Fue(fT(), t, "user");
  }
  async function* executeUserPromptSubmitHooks(e, t, n) {
    let r = n.getAppState();
    let o = n.agentId ?? getSessionId();
    if (!hasHookForEvent("UserPromptSubmit", r, o)) {
      return;
    }
    let s = {
      ...createBaseHookInput(t),
      hook_event_name: "UserPromptSubmit",
      prompt: e,
      session_title: getCurrentSessionTitle(getSessionId())
    };
    yield* executeHooks({
      hookInput: s,
      toolUseID: kfc.randomUUID(),
      signal: n.abortController.signal,
      timeoutMs: 30000,
      toolUseContext: n
    });
  }
  var kfc;
  var Afc = __lazy(() => {
    at();
    oXt();
    zf();
    je();
    Sp();
    fa();
    qp();
    kfc = require("crypto");
  });
  async function executeWorktreeCreateHook(e) {
    let t = {
      ...createBaseHookInput(undefined),
      hook_event_name: "WorktreeCreate",
      name: e
    };
    let n = await executeHooksOutsideREPL({
      hookInput: t,
      timeoutMs: 600000
    });
    let r = n.filter(o => o.succeeded).map(o => cmf(o.output)).find(o => o.length > 0);
    if (r === undefined) {
      if (n.length === 0) {
        throw Error("WorktreeCreate hook failed: hook is configured but did not run (workspace not trusted, disableAllHooks set, or matcher mismatch)");
      }
      let o = n.filter(s => !s.succeeded).map(s => `${s.command}: ${s.output.trim() || "no output"}`);
      if (o.length === 0) {
        throw Error("WorktreeCreate hook failed: hook succeeded but returned no worktree path (command: echo the path to stdout; http/callback: return hookSpecificOutput.worktreePath)");
      }
      throw new Po(`WorktreeCreate hook failed: ${o.join("; ")}`, "WorktreeCreate hook failed (stderr redacted)");
    }
    return {
      worktreePath: r
    };
  }
  function cmf(e) {
    return Li(e).split(`
`).map(t => t.trim()).filter(Boolean).at(-1) ?? "";
  }
  async function executeWorktreeRemoveHook(e) {
    let t = U2()?.WorktreeRemove;
    let n = getRegisteredHooks()?.WorktreeRemove;
    let r = $_() ? undefined : getMainThreadAgentHooks()?.WorktreeRemove;
    let o = t && t.length > 0;
    let s = n && n.length > 0;
    let i = r && r.length > 0;
    if (!o && !s && !i) {
      return false;
    }
    let a = {
      ...createBaseHookInput(undefined),
      hook_event_name: "WorktreeRemove",
      worktree_path: e
    };
    let l = await executeHooksOutsideREPL({
      hookInput: a,
      timeoutMs: 600000
    });
    let c = false;
    for (let u of l) {
      if (u.succeeded) {
        c = true;
      } else {
        logForDebugging(`WorktreeRemove hook failed [${u.command}]: ${u.output.trim()}`, {
          level: "error"
        });
      }
    }
    return c;
  }
  var Ifc = __lazy(() => {
    at();
    je();
    dt();
    Sp();
    i1();
  });
  var HOOK_EVENT_REGISTRY;
  var Pfc = __lazy(() => {
    mfc();
    ffc();
    hfc();
    yfc();
    _fc();
    kzo();
    bfc();
    Sfc();
    Cfc();
    Rfc();
    xfc();
    gNo();
    Afc();
    Ifc();
    HOOK_EVENT_REGISTRY = {
      PreToolUse: executePreToolHooks,
      PostToolUse: executePostToolHooks,
      PostToolUseFailure: executePostToolUseFailureHooks,
      PostToolBatch: executePostToolBatchHooks,
      PermissionDenied: executePermissionDeniedHooks,
      PermissionRequest: executePermissionRequestHooks,
      Notification: executeNotificationHooks,
      Stop: executeStopHooks,
      SubagentStop: executeStopHooks,
      StopFailure: executeStopFailureHooks,
      TeammateIdle: executeTeammateIdleHooks,
      TaskCreated: executeTaskCreatedHooks,
      TaskCompleted: executeTaskCompletedHooks,
      UserPromptSubmit: executeUserPromptSubmitHooks,
      UserPromptExpansion: executeUserPromptExpansionHooks,
      SessionStart: executeSessionStartHooks,
      SessionEnd: executeSessionEndHooks,
      Setup: executeSetupHooks,
      SubagentStart: executeSubagentStartHooks,
      PreCompact: executePreCompactHooks,
      PostCompact: executePostCompactHooks,
      ConfigChange: executeConfigChangeHooks,
      CwdChanged: executeCwdChangedHooks,
      FileChanged: executeFileChangedHooks,
      InstructionsLoaded: executeInstructionsLoadedHooks,
      Elicitation: executeElicitationHooks,
      ElicitationResult: executeElicitationResultHooks,
      WorktreeCreate: executeWorktreeCreateHook,
      WorktreeRemove: executeWorktreeRemoveHook,
      MessageDisplay: executeMessageDisplayHooks
    };
  });
  var TOa = {};