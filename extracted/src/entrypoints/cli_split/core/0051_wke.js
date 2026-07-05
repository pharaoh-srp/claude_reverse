  var Egn;
  var U0s;
  var B0s;
  var $0s = e => {
    if (e !== undefined) {
      throw TypeError("The `input` and `inputFile` options cannot be both set.");
    }
  };
  var p4u = ({
    input: e,
    inputFile: t
  }) => {
    if (typeof t !== "string") {
      return e;
    }
    $0s(e);
    return Egn.readFileSync(t);
  };
  var H0s = e => {
    let t = p4u(e);
    if (ygn(t)) {
      throw TypeError("The `input` option cannot be a stream in sync mode");
    }
    return t;
  };
  var m4u = ({
    input: e,
    inputFile: t
  }) => {
    if (typeof t !== "string") {
      return e;
    }
    $0s(e);
    return Egn.createReadStream(t);
  };
  var j0s = (e, t) => {
    let n = m4u(t);
    if (n === undefined) {
      return;
    }
    if (ygn(n)) {
      n.pipe(e.stdin);
    } else {
      e.stdin.end(n);
    }
  };
  var q0s = (e, {
    all: t
  }) => {
    if (!t || !e.stdout && !e.stderr) {
      return;
    }
    let n = B0s.default();
    if (e.stdout) {
      n.add(e.stdout);
    }
    if (e.stderr) {
      n.add(e.stderr);
    }
    return n;
  };
  var hNr = async (e, t) => {
    if (!e || t === undefined) {
      return;
    }
    await U0s.setTimeout(0);
    e.destroy();
    try {
      return await t;
    } catch (n) {
      return n.bufferedData;
    }
  };
  var gNr = (e, {
    encoding: t,
    buffer: n,
    maxBuffer: r
  }) => {
    if (!e || !n) {
      return;
    }
    if (t === "utf8" || t === "utf-8") {
      return fNr(e, {
        maxBuffer: r
      });
    }
    if (t === null || t === "buffer") {
      return Sgn(e, {
        maxBuffer: r
      });
    }
    return f4u(e, r, t);
  };
  var f4u = async (e, t, n) => (await Sgn(e, {
    maxBuffer: t
  })).toString(n);
  var W0s = async ({
    stdout: e,
    stderr: t,
    all: n
  }, {
    encoding: r,
    buffer: o,
    maxBuffer: s
  }, i) => {
    let a = gNr(e, {
      encoding: r,
      buffer: o,
      maxBuffer: s
    });
    let l = gNr(t, {
      encoding: r,
      buffer: o,
      maxBuffer: s
    });
    let c = gNr(n, {
      encoding: r,
      buffer: o,
      maxBuffer: s * 2
    });
    try {
      return await Promise.all([i, a, l, c]);
    } catch (u) {
      return Promise.all([{
        error: u,
        signal: u.signal,
        timedOut: u.timedOut
      }, hNr(e, a), hNr(t, l), hNr(n, c)]);
    }
  };
  var G0s = __lazy(() => {
    N0s();
    Egn = require("fs");
    U0s = require("timers/promises");
    B0s = __toESM(F0s(), 1);
  });
  var h4u;
  var g4u;
  var yNr = (e, t) => {
    for (let [n, r] of g4u) {
      let o = typeof t === "function" ? (...s) => Reflect.apply(r.value, t(), s) : r.value.bind(t);
      Reflect.defineProperty(e, n, {
        ...r,
        value: o
      });
    }
  };
  var V0s = e => new Promise((t, n) => {
    if (e.on("exit", (r, o) => {
      t({
        exitCode: r,
        signal: o
      });
    }), e.on("error", r => {
      n(r);
    }), e.stdin) {
      e.stdin.on("error", r => {
        n(r);
      });
    }
  });
  var z0s = __lazy(() => {
    h4u = (async () => {})().constructor.prototype;
    g4u = ["then", "catch", "finally"].map(e => [e, Reflect.getOwnPropertyDescriptor(h4u, e)]);
  });
  var J0s;
  var X0s;
  var Q0s = (e, t = []) => {
    if (!Array.isArray(t)) {
      return [e];
    }
    return [e, ...t];
  };
  var y4u;
  var _4u = e => {
    if (typeof e !== "string" || y4u.test(e)) {
      return e;
    }
    return `"${e.replaceAll('"', "\\\"")}"`;
  };
  var _Nr = (e, t) => Q0s(e, t).join(" ");
  var bNr = (e, t) => Q0s(e, t).map(n => _4u(n)).join(" ");
  var b4u;
  var K0s = e => {
    let t = typeof e;
    if (t === "string") {
      return e;
    }
    if (t === "number") {
      return String(e);
    }
    if (t === "object" && e !== null && !(e instanceof X0s.ChildProcess) && "stdout" in e) {
      let n = typeof e.stdout;
      if (n === "string") {
        return e.stdout;
      }
      if (J0s.Buffer.isBuffer(e.stdout)) {
        return e.stdout.toString();
      }
      throw TypeError(`Unexpected "${n}" stdout in template expression`);
    }
    throw TypeError(`Unexpected "${t}" in template expression`);
  };
  var Y0s = (e, t, n) => n || e.length === 0 || t.length === 0 ? [...e, ...t] : [...e.slice(0, -1), `${e.at(-1)}${t[0]}`, ...t.slice(1)];
  var S4u = ({
    templates: e,
    expressions: t,
    tokens: n,
    index: r,
    template: o
  }) => {
    let s = o ?? e.raw[r];
    let i = s.split(b4u).filter(Boolean);
    let a = Y0s(n, i, s.startsWith(" "));
    if (r === t.length) {
      return a;
    }
    let l = t[r];
    let c = Array.isArray(l) ? l.map(u => K0s(u)) : [K0s(l)];
    return Y0s(a, c, s.endsWith(" "));
  };
  var SNr = (e, t) => {
    let n = [];
    for (let [r, o] of e.entries()) {
      n = S4u({
        templates: e,
        expressions: t,
        tokens: n,
        index: r,
        template: o
      });
    }
    return n;
  };
  var Z0s = __lazy(() => {
    J0s = require("buffer");
    X0s = require("child_process");
    y4u = /^[\w.-]+$/;
    b4u = / +/g;
  });
  var eIs;
  var tIs;
  var nIs;
  var vgn = (e, t) => String(e).padStart(t, "0");
  var T4u = () => {
    let e = new Date();
    return `${vgn(e.getHours(), 2)}:${vgn(e.getMinutes(), 2)}:${vgn(e.getSeconds(), 2)}.${vgn(e.getMilliseconds(), 3)}`;
  };
  var TNr = (e, {
    verbose: t
  }) => {
    if (!t) {
      return;
    }
    tIs.default.stderr.write(`[${T4u()}] ${e}
`);
  };
  var rIs = __lazy(() => {
    eIs = require("util");
    tIs = __toESM(require("process"));
    nIs = eIs.debuglog("execa").enabled;
  });
  function wke(e, t, n) {
    let r = lIs(e, t, n);
    let o = _Nr(e, t);
    let s = bNr(e, t);
    TNr(s, r.options);
    g0s(r.options);
    let i;
    try {
      i = wgn.default.spawn(r.file, r.args, r.options);
    } catch (m) {
      let f = new wgn.default.ChildProcess();
      let h = Promise.reject(WDt({
        error: m,
        stdout: "",
        stderr: "",
        all: "",
        command: o,
        escapedCommand: s,
        parsed: r,
        timedOut: false,
        isCanceled: false,
        killed: false
      }));
      yNr(f, h);
      return f;
    }
    let a = V0s(i);
    let l = h0s(i, r.options, a);
    let c = y0s(i, r.options, l);
    let u = {
      isCanceled: false
    };
    i.kill = m0s.bind(null, i.kill.bind(i));
    i.cancel = f0s.bind(null, i, u);
    let p = VAs(async () => {
      let [{
        error: m,
        exitCode: f,
        signal: h,
        timedOut: g
      }, y, _, b] = await W0s(i, r.options, c);
      let S = KDt(r.options, y);
      let E = KDt(r.options, _);
      let C = KDt(r.options, b);
      if (m || f !== 0 || h !== null) {
        let x = WDt({
          error: m,
          exitCode: f,
          signal: h,
          stdout: S,
          stderr: E,
          all: C,
          command: o,
          escapedCommand: s,
          parsed: r,
          timedOut: g,
          isCanceled: u.isCanceled || (r.options.signal ? r.options.signal.aborted : false),
          killed: i.killed
        });
        if (!r.options.reject) {
          return x;
        }
        throw x;
      }
      return {
        command: o,
        escapedCommand: s,
        exitCode: 0,
        stdout: S,
        stderr: E,
        all: C,
        failed: false,
        timedOut: false,
        isCanceled: false,
        killed: false
      };
    });
    j0s(i, r.options);
    i.all = q0s(i, r.options);
    T0s(i);
    yNr(i, p);
    return i;
  }
  function ENr(e, t, n) {
    let r = lIs(e, t, n);
    let o = _Nr(e, t);
    let s = bNr(e, t);
    TNr(s, r.options);
    let i = H0s(r.options);
    let a;
    try {
      a = wgn.default.spawnSync(r.file, r.args, {
        ...r.options,
        input: i
      });
    } catch (u) {
      throw WDt({
        error: u,
        stdout: "",
        stderr: "",
        all: "",
        command: o,
        escapedCommand: s,
        parsed: r,
        timedOut: false,
        isCanceled: false,
        killed: false
      });
    }
    let l = KDt(r.options, a.stdout, a.error);
    let c = KDt(r.options, a.stderr, a.error);
    if (a.error || a.status !== 0 || a.signal !== null) {
      let u = WDt({
        stdout: l,
        stderr: c,
        error: a.error,
        signal: a.signal,
        exitCode: a.status,
        command: o,
        escapedCommand: s,
        parsed: r,
        timedOut: a.error && a.error.code === "ETIMEDOUT",
        isCanceled: false,
        killed: a.signal !== null
      });
      if (!r.options.reject) {
        return u;
      }
      throw u;
    }
    return {
      command: o,
      escapedCommand: s,
      exitCode: 0,
      stdout: l,
      stderr: c,
      failed: false,
      timedOut: false,
      isCanceled: false,
      killed: false
    };
  }
  function cIs(e) {
    function t(n, ...r) {
      if (!Array.isArray(n)) {
        return cIs({
          ...e,
          ...n
        });
      }
      let [o, ...s] = SNr(n, r);
      return wke(o, s, oIs(e));
    }
    t.sync = (n, ...r) => {
      if (!Array.isArray(n)) {
        throw TypeError("Please use $(options).sync`command` instead of $.sync(options)`command`.");
      }
      let [o, ...s] = SNr(n, r);
      return ENr(o, s, oIs(e));
    };
    return t;
  }
  var sIs;
  var iIs;
  var wgn;
  var zDt;
  var aIs;
  var v4u = ({
    env: e,
    extendEnv: t,
    preferLocal: n,
    localDir: r,
    execPath: o
  }) => {
    let s = t ? {
      ...zDt.default.env,
      ...e
    } : e;
    if (n) {
      return qAs({
        env: s,
        cwd: r,
        execPath: o
      });
    }
    return s;
  };
  var lIs = (e, t, n = {}) => {
    let r = aIs.default._parse(e, t, n);
    if (e = r.command, t = r.args, n = r.options, n = {
      maxBuffer: 1e8,
      buffer: true,
      stripFinalNewline: true,
      extendEnv: true,
      preferLocal: false,
      localDir: n.cwd || zDt.default.cwd(),
      execPath: zDt.default.execPath,
      encoding: "utf8",
      reject: true,
      cleanup: true,
      all: false,
      windowsHide: true,
      verbose: nIs,
      ...n
    }, n.env = v4u(n), n.stdio = i0s(n), zDt.default.platform === "win32" && iIs.default.basename(e, ".exe") === "cmd") {
      t.unshift("/q");
    }
    return {
      file: e,
      args: t,
      options: n,
      parsed: r
    };
  };
  var KDt = (e, t, n) => {
    if (typeof t !== "string" && !sIs.Buffer.isBuffer(t)) {
      return n === undefined ? undefined : "";
    }
    if (e.stripFinalNewline) {
      return XMr(t);
    }
    return t;
  };
  var w4u = ({
    input: e,
    inputFile: t,
    stdio: n
  }) => e === undefined && t === undefined && n === undefined ? {
    stdin: "inherit"
  } : {};
  var oIs = (e = {}) => ({
    preferLocal: true,
    ...w4u(e),
    ...e
  });
  var ZRh;
  var vNr = __lazy(() => {
    WAs();
    s0s();
    a0s();
    _0s();
    E0s();
    G0s();
    z0s();
    Z0s();
    rIs();
    sIs = require("buffer");
    iIs = __toESM(require("path"));
    wgn = __toESM(require("child_process"));
    zDt = __toESM(require("process"));
    aIs = __toESM(JMr(), 1);
    ZRh = cIs();
  });
  function uIs() {
    return false;
  }
  async function _C(e, t = [], n) {
    if (uIs()) {
      let r = resolveExecutableSafely(e);
      if (r === null) {
        throw Error(`Command '${e}' not found or is in an unsafe location (current directory)`);
      }
      return wke(r, t, n);
    }
    return wke(e, t, n);
  }
  function dIs(e, t = [], n) {
    let r = e;
    if (uIs()) {
      let s = resolveExecutableSafely(e);
      if (s === null) {
        throw Object.assign(new Po(`Command '${e}' not found or is in an unsafe location (current directory)`, "safeSpawn: command not found or is in an unsafe location (current directory)"), {
          code: "ENOENT"
        });
      }
      r = s;
    }
    let o = wke(r, t, {
      ...n,
      buffer: false,
      reject: false
    });
    o.catch(() => {});
    return o;
  }
  async function yI(e, t) {
    return wke(e, {
      ...t,
      shell: true
    });
  }
  function pIs(e, t) {
    return ENr(e, {
      ...t,
      shell: true
    });
  }
  var oF = __lazy(() => {
    vNr();
    dt();
    tje();
  });
  function execSyncWithDefaults_BLOCKS_EVENT_LOOP_WILL_FREEZE_UI_MAKE_SURE_YOU_KNOW_WHAT_YOU_ARE_DOING(e, t, n = 10 * 60 * 1000) {
    let r;
    if (t === undefined) {
      r = {};
    } else if (t instanceof AbortSignal) {
      r = {
        abortSignal: t,
        timeout: n
      };
    } else {
      r = t;
    }
    let {
      abortSignal: o,
      timeout: s = 10 * fIs * mIs,
      input: i,
      stdio: a = ["ignore", "pipe", "pipe"]
    } = r;
    o?.throwIfAborted();
    using l = eiu`exec: ${e.slice(0, 200)}`;
    try {
      let c = pIs(e, {
        env: process.env,
        maxBuffer: 1e6,
        timeout: s,
        cwd: Nt(),
        stdio: a,
        reject: false,
        input: i
      });
      if (!c.stdout) {
        return null;
      }
      return c.stdout.trim() || null;
    } catch {
      return null;
    }
  }
  var wNr = __lazy(() => {
    vo();
    oF();
  });
  var hIs = {};