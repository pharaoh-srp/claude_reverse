  function XMr(e) {
    let t = typeof e === "string" ? `
` : `
`.charCodeAt();
    let n = typeof e === "string" ? "\r" : "\r".charCodeAt();
    if (e[e.length - 1] === t) {
      e = e.slice(0, -1);
    }
    if (e[e.length - 1] === n) {
      e = e.slice(0, -1);
    }
    return e;
  }
  function mgn(e = {}) {
    let {
      env: t = process.env,
      platform: n = "linux"
    } = e;
    if (n !== "win32") {
      return "PATH";
    }
    return Object.keys(t).reverse().find(r => r.toUpperCase() === "PATH") || "Path";
  }
  var qDt;
  var ynt;
  var QMr;
  var S3u = ({
    cwd: e = qDt.default.cwd(),
    path: t = qDt.default.env[mgn()],
    preferLocal: n = true,
    execPath: r = qDt.default.execPath,
    addExecPath: o = true
  } = {}) => {
    let s = e instanceof URL ? QMr.fileURLToPath(e) : e;
    let i = ynt.default.resolve(s);
    let a = [];
    if (n) {
      T3u(a, i);
    }
    if (o) {
      E3u(a, r, i);
    }
    return [...a, t].join(ynt.default.delimiter);
  };
  var T3u = (e, t) => {
    let n;
    while (n !== t) {
      e.push(ynt.default.join(t, "node_modules/.bin"));
      n = t;
      t = ynt.default.resolve(t, "..");
    }
  };
  var E3u = (e, t, n) => {
    let r = t instanceof URL ? QMr.fileURLToPath(t) : t;
    e.push(ynt.default.resolve(n, r, ".."));
  };
  var qAs = ({
    env: e = qDt.default.env,
    ...t
  } = {}) => {
    e = {
      ...e
    };
    let n = mgn({
      env: e
    });
    t.path = e[n];
    e[n] = S3u(t);
    return e;
  };
  var WAs = __lazy(() => {
    qDt = __toESM(require("process"));
    ynt = __toESM(require("path"));
    QMr = require("url");
  });
  function ZMr(e, t, {
    ignoreNonConfigurable: n = false
  } = {}) {
    let {
      name: r
    } = e;
    for (let o of Reflect.ownKeys(t)) {
      v3u(e, t, o, n);
    }
    C3u(e, t);
    A3u(e, t, r);
    return e;
  }
  var v3u = (e, t, n, r) => {
    if (n === "length" || n === "prototype") {
      return;
    }
    if (n === "arguments" || n === "caller") {
      return;
    }
    let o = Object.getOwnPropertyDescriptor(e, n);
    let s = Object.getOwnPropertyDescriptor(t, n);
    if (!w3u(o, s) && r) {
      return;
    }
    Object.defineProperty(e, n, s);
  };
  var w3u = function (e, t) {
    return e === undefined || e.configurable || e.writable === t.writable && e.enumerable === t.enumerable && e.configurable === t.configurable && (e.writable || e.value === t.value);
  };
  var C3u = (e, t) => {
    let n = Object.getPrototypeOf(t);
    if (n === Object.getPrototypeOf(e)) {
      return;
    }
    Object.setPrototypeOf(e, n);
  };
  var R3u = (e, t) => `/* Wrapped ${e}*/
${t}`;
  var x3u;
  var k3u;
  var A3u = (e, t, n) => {
    let r = n === "" ? "" : `with ${n.trim()}() `;
    let o = R3u.bind(null, r, t.toString());
    Object.defineProperty(o, "name", k3u);
    Object.defineProperty(e, "toString", {
      ...x3u,
      value: o
    });
  };
  var GAs = __lazy(() => {
    x3u = Object.getOwnPropertyDescriptor(Function.prototype, "toString");
    k3u = Object.getOwnPropertyDescriptor(Function.prototype.toString, "name");
  });
  var fgn;
  var VAs = (e, t = {}) => {
    if (typeof e !== "function") {
      throw TypeError("Expected a function");
    }
    let n;
    let r = 0;
    let o = e.displayName || e.name || "<anonymous>";
    let s = function (...i) {
      if (fgn.set(s, ++r), r === 1) {
        n = e.apply(this, i);
        e = null;
      } else if (t.throw === true) {
        throw Error(`Function \`${o}\` can only be called once`);
      }
      return n;
    };
    ZMr(s, e);
    fgn.set(s, r);
    return s;
  };
  var YAs = () => {
    let e = 64 - 34 + 1;
    return Array.from({
      length: e
    }, I3u);
  };
  var I3u = (e, t) => ({
    name: `SIGRT${t + 1}`,
    number: JAs + t,
    action: "terminate",
    description: "Application-specific signal (realtime)",
    standard: "posix"
  });
  var XAs;
  var QAs = __lazy(() => {
    XAs = [{
      name: "SIGHUP",
      number: 1,
      action: "terminate",
      description: "Terminal closed",
      standard: "posix"
    }, {
      name: "SIGINT",
      number: 2,
      action: "terminate",
      description: "User interruption with CTRL-C",
      standard: "ansi"
    }, {
      name: "SIGQUIT",
      number: 3,
      action: "core",
      description: "User interruption with CTRL-\\",
      standard: "posix"
    }, {
      name: "SIGILL",
      number: 4,
      action: "core",
      description: "Invalid machine instruction",
      standard: "ansi"
    }, {
      name: "SIGTRAP",
      number: 5,
      action: "core",
      description: "Debugger breakpoint",
      standard: "posix"
    }, {
      name: "SIGABRT",
      number: 6,
      action: "core",
      description: "Aborted",
      standard: "ansi"
    }, {
      name: "SIGIOT",
      number: 6,
      action: "core",
      description: "Aborted",
      standard: "bsd"
    }, {
      name: "SIGBUS",
      number: 7,
      action: "core",
      description: "Bus error due to misaligned, non-existing address or paging error",
      standard: "bsd"
    }, {
      name: "SIGEMT",
      number: 7,
      action: "terminate",
      description: "Command should be emulated but is not implemented",
      standard: "other"
    }, {
      name: "SIGFPE",
      number: 8,
      action: "core",
      description: "Floating point arithmetic error",
      standard: "ansi"
    }, {
      name: "SIGKILL",
      number: 9,
      action: "terminate",
      description: "Forced termination",
      standard: "posix",
      forced: true
    }, {
      name: "SIGUSR1",
      number: 10,
      action: "terminate",
      description: "Application-specific signal",
      standard: "posix"
    }, {
      name: "SIGSEGV",
      number: 11,
      action: "core",
      description: "Segmentation fault",
      standard: "ansi"
    }, {
      name: "SIGUSR2",
      number: 12,
      action: "terminate",
      description: "Application-specific signal",
      standard: "posix"
    }, {
      name: "SIGPIPE",
      number: 13,
      action: "terminate",
      description: "Broken pipe or socket",
      standard: "posix"
    }, {
      name: "SIGALRM",
      number: 14,
      action: "terminate",
      description: "Timeout or timer",
      standard: "posix"
    }, {
      name: "SIGTERM",
      number: 15,
      action: "terminate",
      description: "Termination",
      standard: "ansi"
    }, {
      name: "SIGSTKFLT",
      number: 16,
      action: "terminate",
      description: "Stack is empty or overflowed",
      standard: "other"
    }, {
      name: "SIGCHLD",
      number: 17,
      action: "ignore",
      description: "Child process terminated, paused or unpaused",
      standard: "posix"
    }, {
      name: "SIGCLD",
      number: 17,
      action: "ignore",
      description: "Child process terminated, paused or unpaused",
      standard: "other"
    }, {
      name: "SIGCONT",
      number: 18,
      action: "unpause",
      description: "Unpaused",
      standard: "posix",
      forced: true
    }, {
      name: "SIGSTOP",
      number: 19,
      action: "pause",
      description: "Paused",
      standard: "posix",
      forced: true
    }, {
      name: "SIGTSTP",
      number: 20,
      action: "pause",
      description: 'Paused using CTRL-Z or "suspend"',
      standard: "posix"
    }, {
      name: "SIGTTIN",
      number: 21,
      action: "pause",
      description: "Background process cannot read terminal input",
      standard: "posix"
    }, {
      name: "SIGBREAK",
      number: 21,
      action: "terminate",
      description: "User interruption with CTRL-BREAK",
      standard: "other"
    }, {
      name: "SIGTTOU",
      number: 22,
      action: "pause",
      description: "Background process cannot write to terminal output",
      standard: "posix"
    }, {
      name: "SIGURG",
      number: 23,
      action: "ignore",
      description: "Socket received out-of-band data",
      standard: "bsd"
    }, {
      name: "SIGXCPU",
      number: 24,
      action: "core",
      description: "Process timed out",
      standard: "bsd"
    }, {
      name: "SIGXFSZ",
      number: 25,
      action: "core",
      description: "File too big",
      standard: "bsd"
    }, {
      name: "SIGVTALRM",
      number: 26,
      action: "terminate",
      description: "Timeout or timer",
      standard: "bsd"
    }, {
      name: "SIGPROF",
      number: 27,
      action: "terminate",
      description: "Timeout or timer",
      standard: "bsd"
    }, {
      name: "SIGWINCH",
      number: 28,
      action: "ignore",
      description: "Terminal window size changed",
      standard: "bsd"
    }, {
      name: "SIGIO",
      number: 29,
      action: "terminate",
      description: "I/O is available",
      standard: "other"
    }, {
      name: "SIGPOLL",
      number: 29,
      action: "terminate",
      description: "Watched event",
      standard: "other"
    }, {
      name: "SIGINFO",
      number: 29,
      action: "ignore",
      description: "Request for process information",
      standard: "other"
    }, {
      name: "SIGPWR",
      number: 30,
      action: "terminate",
      description: "Device running out of power",
      standard: "systemv"
    }, {
      name: "SIGSYS",
      number: 31,
      action: "core",
      description: "Invalid system call",
      standard: "other"
    }, {
      name: "SIGUNUSED",
      number: 31,
      action: "terminate",
      description: "Invalid system call",
      standard: "other"
    }];
  });
  var ZAs;
  var tNr = () => {
    let e = YAs();
    return [...XAs, ...e].map(P3u);
  };
  var P3u = ({
    name: e,
    number: t,
    description: n,
    action: r,
    forced: o = false,
    standard: s
  }) => {
    let {
      signals: {
        [e]: i
      }
    } = ZAs.constants;
    let a = i !== undefined;
    return {
      name: e,
      number: a ? i : t,
      description: n,
      supported: a,
      action: r,
      forced: o,
      standard: s
    };
  };
  var e0s = __lazy(() => {
    QAs();
    ZAs = require("os");
  });
  var t0s;
  var O3u = () => {
    let e = tNr();
    return Object.fromEntries(e.map(D3u));
  };
  var D3u = ({
    name: e,
    number: t,
    description: n,
    supported: r,
    action: o,
    forced: s,
    standard: i
  }) => [e, {
    name: e,
    number: t,
    description: n,
    supported: r,
    action: o,
    forced: s,
    standard: i
  }];
  var n0s;
  var M3u = () => {
    let e = tNr();
    let t = 64 + 1;
    let n = Array.from({
      length: t
    }, (r, o) => N3u(o, e));
    return Object.assign({}, ...n);
  };
  var N3u = (e, t) => {
    let n = L3u(e, t);
    if (n === undefined) {
      return {};
    }
    let {
      name: r,
      description: o,
      supported: s,
      action: i,
      forced: a,
      standard: l
    } = n;
    return {
      [e]: {
        name: r,
        number: e,
        description: o,
        supported: s,
        action: i,
        forced: a,
        standard: l
      }
    };
  };
  var L3u = (e, t) => {
    let n = t.find(({
      name: r
    }) => t0s.constants.signals[r] === e);
    if (n !== undefined) {
      return n;
    }
    return t.find(r => r.number === e);
  };
  var QCh;
  var r0s = __lazy(() => {
    e0s();
    t0s = require("os");
    n0s = O3u();
    QCh = M3u();
  });
  var o0s;
  var F3u = ({
    timedOut: e,
    timeout: t,
    errorCode: n,
    signal: r,
    signalDescription: o,
    exitCode: s,
    isCanceled: i
  }) => {
    if (e) {
      return `timed out after ${t} milliseconds`;
    }
    if (i) {
      return "was canceled";
    }
    if (n !== undefined) {
      return `failed with ${n}`;
    }
    if (r !== undefined) {
      return `was killed with ${r} (${o})`;
    }
    if (s !== undefined) {
      return `failed with exit code ${s}`;
    }
    return "failed";
  };
  var WDt = ({
    stdout: e,
    stderr: t,
    all: n,
    error: r,
    signal: o,
    exitCode: s,
    command: i,
    escapedCommand: a,
    timedOut: l,
    isCanceled: c,
    killed: u,
    parsed: {
      options: {
        timeout: d,
        cwd: p = o0s.default.cwd()
      }
    }
  }) => {
    s = s === null ? undefined : s;
    o = o === null ? undefined : o;
    let m = o === undefined ? undefined : n0s[o].description;
    let f = r && r.code;
    let g = `Command ${F3u({
      timedOut: l,
      timeout: d,
      errorCode: f,
      signal: o,
      signalDescription: m,
      exitCode: s,
      isCanceled: c
    })}: ${i}`;
    let y = Object.prototype.toString.call(r) === "[object Error]";
    let _ = y ? `${g}
${r.message}` : g;
    let b = [_, t, e].filter(Boolean).join(`
`);
    if (y) {
      r.originalMessage = r.message;
      r.message = b;
    } else {
      r = Error(b);
    }
    if (r.shortMessage = _, r.command = i, r.escapedCommand = a, r.exitCode = s, r.signal = o, r.signalDescription = m, r.stdout = e, r.stderr = t, r.cwd = p, n !== undefined) {
      r.all = n;
    }
    if ("bufferedData" in r) {
      delete r.bufferedData;
    }
    r.failed = true;
    r.timedOut = Boolean(l);
    r.isCanceled = c;
    r.killed = u && !l;
    return r;
  };
  var s0s = __lazy(() => {
    r0s();
    o0s = __toESM(require("process"));
  });
  var hgn;
  var U3u = e => hgn.some(t => e[t] !== undefined);
  var i0s = e => {
    if (!e) {
      return;
    }
    let {
      stdio: t
    } = e;
    if (t === undefined) {
      return hgn.map(r => e[r]);
    }
    if (U3u(e)) {
      throw Error(`It's not possible to provide \`stdio\` in combination with one of ${hgn.map(r => `\`${r}\``).join(", ")}`);
    }
    if (typeof t === "string") {
      return t;
    }
    if (!Array.isArray(t)) {
      throw TypeError(`Expected \`stdio\` to be of type \`string\` or \`Array\`, got \`${typeof t}\``);
    }
    let n = Math.max(t.length, hgn.length);
    return Array.from({
      length: n
    }, (r, o) => t[o]);
  };
  var a0s = __lazy(() => {
    hgn = ["stdin", "stdout", "stderr"];
  });
  var lje;
  var l0s = __lazy(() => {
    lje = [];
    lje.push("SIGHUP", "SIGINT", "SIGTERM");
    lje.push("SIGALRM", "SIGABRT", "SIGVTALRM", "SIGXCPU", "SIGXFSZ", "SIGUSR2", "SIGTRAP", "SIGSYS", "SIGQUIT", "SIGIOT");
    lje.push("SIGIO", "SIGPOLL", "SIGPWR", "SIGSTKFLT");
  });
  class c0s {
    emitted = {
      afterExit: false,
      exit: false
    };
    listeners = {
      afterExit: [],
      exit: []
    };
    count = 0;
    id = Math.random();
    constructor() {
      if (globalThis[nNr]) {
        return globalThis[nNr];
      }
      B3u(globalThis, nNr, {
        value: this,
        writable: false,
        enumerable: false,
        configurable: false
      });
    }
    on(e, t) {
      this.listeners[e].push(t);
    }
    removeListener(e, t) {
      let n = this.listeners[e];
      let r = n.indexOf(t);
      if (r === -1) {
        return;
      }
      if (r === 0 && n.length === 1) {
        n.length = 0;
      } else {
        n.splice(r, 1);
      }
    }
    emit(e, t, n) {
      if (this.emitted[e]) {
        return false;
      }
      this.emitted[e] = true;
      let r = false;
      for (let o of this.listeners[e]) {
        r = o(t, n) === true || r;
      }
      if (e === "exit") {
        r = this.emit("afterExit", t, n) || r;
      }
      return r;
    }
  }
  class sNr {}
  var ggn = e => !!e && typeof e === "object" && typeof e.removeListener === "function" && typeof e.emit === "function" && typeof e.reallyExit === "function" && typeof e.listeners === "function" && typeof e.kill === "function" && typeof e.pid === "number" && typeof e.on === "function";
  var nNr;
  var B3u;
  var $3u = e => ({
    onExit(t, n) {
      return e.onExit(t, n);
    },
    load() {
      return e.load();
    },
    unload() {
      return e.unload();
    }
  });
  var u0s;
  var d0s;
  var oNr;
  var Ute;
  var sRh;
  var iRh;
  var p0s;
  var m0s = (e, t = "SIGTERM", n = {}) => {
    let r = e(t);
    j3u(e, t, n, r);
    return r;
  };
  var j3u = (e, t, n, r) => {
    if (!q3u(t, n, r)) {
      return;
    }
    let o = G3u(n);
    let s = setTimeout(() => {
      e("SIGKILL");
    }, o);
    if (s.unref) {
      s.unref();
    }
  };
  var q3u = (e, {
    forceKillAfterTimeout: t
  }, n) => W3u(e) && t !== false && n;
  var W3u = e => e === p0s.default.constants.signals.SIGTERM || typeof e === "string" && e.toUpperCase() === "SIGTERM";
  var G3u = ({
    forceKillAfterTimeout: e = true
  }) => {
    if (e === true) {
      return 5000;
    }
    if (!Number.isFinite(e) || e < 0) {
      throw TypeError(`Expected the \`forceKillAfterTimeout\` option to be a non-negative integer, got \`${e}\` (${typeof e})`);
    }
    return e;
  };
  var f0s = (e, t) => {
    if (e.kill()) {
      t.isCanceled = true;
    }
  };
  var V3u = (e, t, n) => {
    e.kill(t);
    n(Object.assign(Error("Timed out"), {
      timedOut: true,
      signal: t
    }));
  };
  var h0s = (e, {
    timeout: t,
    killSignal: n = "SIGTERM"
  }, r) => {
    if (t === 0 || t === undefined) {
      return r;
    }
    let o;
    let s = new Promise((a, l) => {
      o = setTimeout(() => {
        V3u(e, n, l);
      }, t);
    });
    let i = r.finally(() => {
      clearTimeout(o);
    });
    return Promise.race([s, i]);
  };
  var g0s = ({
    timeout: e
  }) => {
    if (e !== undefined && (!Number.isFinite(e) || e < 0)) {
      throw TypeError(`Expected the \`timeout\` option to be a non-negative integer, got \`${e}\` (${typeof e})`);
    }
  };
  var y0s = async (e, {
    cleanup: t,
    detached: n
  }, r) => {
    if (!t || n) {
      return r;
    }
    let o = Ute(() => {
      e.kill();
    });
    return r.finally(() => {
      o();
    });
  };
  var _0s = __lazy(() => {
    p0s = __toESM(require("os"));
  });
  function ygn(e) {
    return e !== null && typeof e === "object" && typeof e.pipe === "function";
  }
  function iNr(e) {
    return ygn(e) && e.writable !== false && typeof e._write === "function" && typeof e._writableState === "object";
  }
  var b0s;
  var S0s;
  var z3u = e => e instanceof S0s.ChildProcess && typeof e.then === "function";
  var aNr = (e, t, n) => {
    if (typeof n === "string") {
      e[t].pipe(b0s.createWriteStream(n));
      return e;
    }
    if (iNr(n)) {
      e[t].pipe(n);
      return e;
    }
    if (!z3u(n)) {
      throw TypeError("The second argument must be a string, a stream or an Execa child process.");
    }
    if (!iNr(n.stdin)) {
      throw TypeError("The target child process's stdin must be available.");
    }
    e[t].pipe(n.stdin);
    return n;
  };
  var T0s = e => {
    if (e.stdout !== null) {
      e.pipeStdout = aNr.bind(undefined, e, "stdout");
    }
    if (e.stderr !== null) {
      e.pipeStderr = aNr.bind(undefined, e, "stderr");
    }
    if (e.all !== undefined) {
      e.pipeAll = aNr.bind(undefined, e, "all");
    }
  };
  var E0s = __lazy(() => {
    b0s = require("fs");
    S0s = require("child_process");
  });
  var GDt = async (e, {
    init: t,
    convertChunk: n,
    getSize: r,
    truncateChunk: o,
    addChunk: s,
    getFinalChunk: i,
    finalize: a
  }, {
    maxBuffer: l = Number.POSITIVE_INFINITY
  } = {}) => {
    if (!Y3u(e)) {
      throw Error("The first argument must be a Readable, a ReadableStream, or an async iterable.");
    }
    let c = t();
    c.length = 0;
    try {
      for await (let u of e) {
        let d = J3u(u);
        let p = n[d](u, c);
        C0s({
          convertedChunk: p,
          state: c,
          getSize: r,
          truncateChunk: o,
          addChunk: s,
          maxBuffer: l
        });
      }
      K3u({
        state: c,
        convertChunk: n,
        getSize: r,
        truncateChunk: o,
        addChunk: s,
        getFinalChunk: i,
        maxBuffer: l
      });
      return a(c);
    } catch (u) {
      throw u.bufferedData = a(c), u;
    }
  };
  var K3u = ({
    state: e,
    getSize: t,
    truncateChunk: n,
    addChunk: r,
    getFinalChunk: o,
    maxBuffer: s
  }) => {
    let i = o(e);
    if (i !== undefined) {
      C0s({
        convertedChunk: i,
        state: e,
        getSize: t,
        truncateChunk: n,
        addChunk: r,
        maxBuffer: s
      });
    }
  };
  var C0s = ({
    convertedChunk: e,
    state: t,
    getSize: n,
    truncateChunk: r,
    addChunk: o,
    maxBuffer: s
  }) => {
    let i = n(e);
    let a = t.length + i;
    if (a <= s) {
      v0s(e, t, o, a);
      return;
    }
    let l = r(e, s - t.length);
    if (l !== undefined) {
      v0s(l, t, o, s);
    }
    throw new lNr();
  };
  var v0s = (e, t, n, r) => {
    t.contents = n(e, t, r);
    t.length = r;
  };
  var Y3u = e => typeof e === "object" && e !== null && typeof e[Symbol.asyncIterator] === "function";
  var J3u = e => {
    let t = typeof e;
    if (t === "string") {
      return "string";
    }
    if (t !== "object" || e === null) {
      return "others";
    }
    if (globalThis.Buffer?.isBuffer(e)) {
      return "buffer";
    }
    let n = w0s.call(e);
    if (n === "[object ArrayBuffer]") {
      return "arrayBuffer";
    }
    if (n === "[object DataView]") {
      return "dataView";
    }
    if (Number.isInteger(e.byteLength) && Number.isInteger(e.byteOffset) && w0s.call(e.buffer) === "[object ArrayBuffer]") {
      return "typedArray";
    }
    return "others";
  };
  var w0s;
  var lNr;
  var VDt = __lazy(() => {
    ({
      toString: w0s
    } = Object.prototype);
    lNr = class lNr extends Error {
      name = "MaxBufferError";
      constructor() {
        super("maxBuffer exceeded");
      }
    };
  });
  var cNr = e => e;
  var uNr = () => {
    return;
  };
  var dNr = ({
    contents: e
  }) => e;
  var _gn = e => {
    throw Error(`Streams in object mode are not supported: ${String(e)}`);
  };
  var bgn = e => e.length;
  var R0s = __lazy(() => {
    VDt();
  });
  async function pNr(e, t) {
    return GDt(e, s4u, t);
  }
  var X3u = () => ({
    contents: new ArrayBuffer(0)
  });
  var Q3u = e => Z3u.HS(e);
  var Z3u;
  var x0s = e => new Uint8Array(e);
  var k0s = e => new Uint8Array(e.buffer, e.byteOffset, e.byteLength);
  var e4u = (e, t) => e.slice(0, t);
  var t4u = (e, {
    contents: t,
    length: n
  }, r) => {
    let o = P0s() ? r4u(t, r) : n4u(t, r);
    new Uint8Array(o).set(e, n);
    return o;
  };
  var n4u = (e, t) => {
    if (t <= e.byteLength) {
      return e;
    }
    let n = new ArrayBuffer(I0s(t));
    new Uint8Array(n).set(new Uint8Array(e), 0);
    return n;
  };
  var r4u = (e, t) => {
    if (t <= e.maxByteLength) {
      e.resize(t);
      return e;
    }
    let n = new ArrayBuffer(t, {
      maxByteLength: I0s(t)
    });
    new Uint8Array(n).set(new Uint8Array(e), 0);
    return n;
  };
  var I0s = e => 2 ** Math.ceil(Math.log(e) / Math.log(2));
  var o4u = ({
    contents: e,
    length: t
  }) => P0s() ? e : e.slice(0, t);
  var P0s = () => "resize" in ArrayBuffer.prototype;
  var s4u;
  var mNr = __lazy(() => {
    VDt();
    Z3u = new TextEncoder();
    s4u = {
      init: X3u,
      convertChunk: {
        string: Q3u,
        buffer: x0s,
        arrayBuffer: x0s,
        dataView: k0s,
        typedArray: k0s,
        others: _gn
      },
      getSize: bgn,
      truncateChunk: e4u,
      addChunk: t4u,
      getFinalChunk: uNr,
      finalize: o4u
    };
  });
  async function Sgn(e, t) {
    if (!("Buffer" in globalThis)) {
      throw Error("getStreamAsBuffer() is only supported in Node.js");
    }
    try {
      return O0s(await pNr(e, t));
    } catch (n) {
      if (n.bufferedData !== undefined) {
        n.bufferedData = O0s(n.bufferedData);
      }
      throw n;
    }
  }
  var O0s = e => globalThis.Buffer.from(e);
  var D0s = __lazy(() => {
    mNr();
  });
  async function fNr(e, t) {
    return GDt(e, u4u, t);
  }
  var i4u = () => ({
    contents: "",
    textDecoder: new TextDecoder()
  });
  var Tgn = (e, {
    textDecoder: t
  }) => t.oC(e, {
    stream: true
  });
  var a4u = (e, {
    contents: t
  }) => t + e;
  var l4u = (e, t) => e.slice(0, t);
  var c4u = ({
    textDecoder: e
  }) => {
    let t = e.oC();
    return t === "" ? undefined : t;
  };
  var u4u;
  var M0s = __lazy(() => {
    VDt();
    u4u = {
      init: i4u,
      convertChunk: {
        string: cNr,
        buffer: Tgn,
        arrayBuffer: Tgn,
        dataView: Tgn,
        typedArray: Tgn,
        others: _gn
      },
      getSize: bgn,
      truncateChunk: l4u,
      addChunk: a4u,
      getFinalChunk: c4u,
      finalize: dNr
    };
  });
  var N0s = __lazy(() => {
    R0s();
    mNr();
    D0s();
    M0s();
    VDt();
  });