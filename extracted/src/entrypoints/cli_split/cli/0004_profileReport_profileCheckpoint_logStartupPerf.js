  __export(S0t, {
    stripProtoFields: () => stripProtoFields,
    logEventAsync: () => logEventAsync,
    logEvent: () => logEvent,
    createAnalyticsState: () => createAnalyticsState,
    attachAnalyticsSink: () => attachAnalyticsSink,
    _setGlobalAnalyticsStateForTesting: () => _setGlobalAnalyticsStateForTesting
  });
  function stripProtoFields(e) {
    let t;
    for (let n in e) {
      if (n.startsWith("_PROTO_")) {
        if (t === undefined) {
          t = {
            ...e
          };
        }
        delete t[n];
      }
    }
    return t ?? e;
  }
  function createAnalyticsState() {
    return {
      eventQueue: [],
      sink: null
    };
  }
  function _setGlobalAnalyticsStateForTesting(e) {
    Kln = e;
  }
  function attachAnalyticsSink(e) {
    let t = Kln;
    if (t.sink !== null) {
      return;
    }
    if (t.sink = e, t.eventQueue.length > 0) {
      let n = t.eventQueue;
      t.eventQueue = [];
      queueMicrotask(() => {
        for (let r of n) {
          if (r.async) {
            e.logEventAsync(r.eventName, r.metadata);
          } else {
            e.logEvent(r.eventName, r.metadata);
          }
        }
      });
    }
  }
  function logEvent(e, t) {
    let n = Kln;
    if (n.sink === null) {
      n.eventQueue.push({
        eventName: e,
        metadata: t,
        async: false
      });
      return;
    }
    n.sink.logEvent(e, t);
  }
  async function logEventAsync(e, t) {
    let n = Kln;
    if (n.sink === null) {
      n.eventQueue.push({
        eventName: e,
        metadata: t,
        async: true
      });
      return;
    }
    await n.sink.logEventAsync(e, t);
  }
  var Kln;
  var Ot = __lazy(() => {
    Kln = createAnalyticsState();
  });
  function wZe({
    writeFn: e,
    flushIntervalMs: t = 1000,
    maxBufferSize: n = 100,
    maxBufferBytes: r = 1 / 0,
    immediateMode: o = false
  }) {
    let s = [];
    let i = 0;
    let a = null;
    let l = null;
    function c() {
      if (a) {
        clearTimeout(a);
        a = null;
      }
    }
    function u(f) {
      try {
        e(f);
      } catch {}
    }
    function d() {
      if (l) {
        u(l.join(""));
        l = null;
      }
      if (s.length === 0) {
        return;
      }
      u(s.join(""));
      s = [];
      i = 0;
      c();
    }
    function p() {
      if (!a) {
        a = setTimeout(d, t);
      }
    }
    function m() {
      if (l) {
        l.push(...s);
        s = [];
        i = 0;
        c();
        return;
      }
      let f = s;
      s = [];
      i = 0;
      c();
      l = f;
      setImmediate(() => {
        let h = l;
        if (l = null, h) {
          u(h.join(""));
        }
      });
    }
    return {
      write(f) {
        if (o) {
          u(f);
          return;
        }
        if (s.push(f), i += f.length, p(), s.length >= n || i >= r) {
          m();
        }
      },
      flush: d,
      dispose() {
        d();
      }
    };
  }
  function Rc(e) {
    return /^[\\/]{2}/.test(e);
  }
  function CZe(e) {
    if (/^[\\/]{2}[?.][\\/](?!unc[\\/])/i.test(e)) {
      return null;
    }
    return e.match(/^[\\/]{2}(?:[?.][\\/]unc[\\/])?([^\\/]+)/i)?.[1]?.replace(/[A-Z]/g, t => t.toLowerCase()) ?? null;
  }
  function IB(e, t) {
    if (!Rc(e)) {
      return false;
    }
    if (/^[\\/]{2}[?.][\\/]/.test(e)) {
      return true;
    }
    if (/(^|[\\/])\.{1,2}([\\/]|$)/.test(e)) {
      return true;
    }
    let n = CZe(e);
    return n === null || n !== CZe(t);
  }
  function zS(e) {
    if (!e.startsWith("/")) {
      return false;
    }
    let t = [];
    for (let n of e.split("/")) {
      if (n === "" || n === ".") {
        continue;
      }
      if (n === "..") {
        t.pop();
        continue;
      }
      if (t.push(n), t.length === 2 && t[0].toLowerCase() === "net") {
        return true;
      }
    }
    return false;
  }
  function Pp(e) {
    return /^[\\/]{2}wsl(\$|\.localhost)[\\/]/i.test(e);
  }
  function Qwr(e) {
    return Rc(e) && !Pp(e);
  }
  function AP(e) {
    if (e === "~" || e.startsWith("~/")) {
      return rus.homedir() + e.slice(1);
    }
    return e;
  }
  function Oae(e) {
    for (let t = 0; t < e.length; t++) {
      let n = e[t];
      if (n === "*" || n === "?") {
        return t;
      }
      if (n === "[" && e.indexOf("]", t + 1) !== -1) {
        return t;
      }
    }
    return -1;
  }
  function Zwr(e) {
    if (e.startsWith("\\\\?\\UNC\\")) {
      return "\\\\" + e.slice(8);
    }
    if (e.startsWith("\\\\?\\") && e.length >= 7 && e[5] === ":") {
      return e.slice(4);
    }
    return e;
  }
  function lC(e) {
    if (ate(e)) {
      return Zwr(e).replace(/^([\\/])[\\/]+/, "$1");
    }
    return e;
  }
  function ate(e) {
    if (/^\\\\\?\\volume\{/i.test(e)) {
      return tus(e);
    }
    let t = Zwr(e);
    if (t !== e && tus(t)) {
      return true;
    }
    return Rc(t) && !Pp(t);
  }
  function tus(e) {
    return /(^|[\\/])\.{1,2}([\\/]|$)/.test(e) || e.includes("/");
  }
  function E$e(e) {
    try {
      return Zwr(nus.realpathSync.native(e));
    } catch {
      return null;
    }
  }
  function Yln(e, t) {
    let n = Pae.resolve(t).toLowerCase();
    let r = Pae.resolve(e).toLowerCase();
    if (Pae.dirname(r) === n || r.startsWith(n + Pae.sep)) {
      return true;
    }
    let o = E$e(t)?.toLowerCase();
    if (o == null) {
      return false;
    }
    let s = E$e(Pae.dirname(Pae.resolve(e)))?.toLowerCase();
    if (s == null) {
      return true;
    }
    return s === o || s.startsWith(o + Pae.sep);
  }
  var nus;
  var rus;
  var Pae;
  var mm = __lazy(() => {
    nus = require("fs");
    rus = require("os");
    Pae = require("path");
  });
  function hru(e) {
    if (typeof e === "function") {
      return e;
    }
    if (Symbol.asyncDispose in e) {
      return () => e[Symbol.asyncDispose]();
    }
    return () => e[Symbol.dispose]();
  }
  function Ti(e) {
    return ous.register(e);
  }
  async function RZe() {
    await ous.drain();
  }
  function ius(e) {
    return sus.register(e);
  }
  async function Jln() {
    await sus.drain();
  }
  var eCr;
  var ous;
  var sus;
  var hd = __lazy(() => {
    eCr = class eCr {
      #e = new Set();
      register(e) {
        let t = hru(e);
        this.#e.add(t);
        let n = () => {
          this.#e.delete(t);
        };
        return Object.assign(n, {
          [Symbol.dispose]: n
        });
      }
      async drain() {
        let e = Array.from(this.#e);
        this.#e.clear();
        await Promise.all(e.map(async t => t()));
      }
      async [Symbol.asyncDispose]() {
        await this.drain();
      }
      get sizeForTesting() {
        return this.#e.size;
      }
    };
    ous = new eCr();
    sus = new eCr();
  });
  function gru(e) {
    let t = [];
    let n = e.match(/^MCP server ["']([^"']+)["']/);
    if (n && n[1]) {
      t.push("mcp");
      t.push(n[1].toLowerCase());
    } else {
      let s = e.match(/^([^:[]+):/);
      if (s && s[1]) {
        t.push(s[1].trim().toLowerCase());
      }
    }
    let r = e.match(/^\[([^\]]+)]/);
    if (r && r[1]) {
      t.push(r[1].trim().toLowerCase());
    }
    if (e.toLowerCase().includes("1p event:")) {
      t.push("1p");
    }
    let o = e.match(/:\s*([^:]+?)(?:\s+(?:type|mode|status|event))?:/);
    if (o && o[1]) {
      let s = o[1].trim().toLowerCase();
      if (s.length < 30 && !s.includes(" ")) {
        t.push(s);
      }
    }
    return Array.from(new Set(t));
  }
  function yru(e, t) {
    if (!t) {
      return true;
    }
    if (e.length === 0) {
      return false;
    }
    if (t.isExclusive) {
      return !e.some(n => t.exclude.includes(n));
    } else {
      return e.some(n => t.include.includes(n));
    }
  }
  function lus(e, t) {
    if (!t) {
      return true;
    }
    let n = gru(e);
    return yru(n, t);
  }
  var aus;
  var cus = __lazy(() => {
    aus = TEr(e => {
      if (!e || e.trim() === "") {
        return null;
      }
      let t = e.split(",").map(s => s.trim()).filter(Boolean);
      if (t.length === 0) {
        return null;
      }
      let n = t.some(s => s.startsWith("!"));
      let r = t.some(s => !s.startsWith("!"));
      if (n && r) {
        return null;
      }
      let o = t.map(s => s.replace(/^!/, "").toLowerCase());
      return {
        include: n ? [] : o,
        exclude: n ? o : [],
        isExclusive: n
      };
    });
  });
  function pxe() {
    return tCr.join(er(), "teams");
  }
  function xZe(e) {
    let t = process.env.NODE_OPTIONS;
    if (!t) {
      return false;
    }
    return t.split(/\s+/).includes(e);
  }
  function R7(e, t) {
    if (e === undefined) {
      return t;
    }
    let n = parseInt(e, 10);
    return Number.isNaN(n) ? t : n;
  }
  function dus(e) {
    if (e !== undefined) {
      return e;
    }
    let t = process.env.CLAUDE_CODE_MAX_TURNS?.trim();
    if (!t) {
      return;
    }
    let n = Number(t);
    if (!Number.isInteger(n) || n <= 0) {
      throw Error(`CLAUDE_CODE_MAX_TURNS must be a positive integer; got "${t}"`);
    }
    return n;
  }
  function nCr(e) {
    let t = process.argv.indexOf("--");
    return (t === -1 ? process.argv : process.argv.slice(0, t)).includes(e);
  }
  function kd() {
    return st(process.env.CLAUDE_CODE_SIMPLE) || nCr("--bare");
  }
  function Ql() {
    return st(process.env.CLAUDE_CODE_SAFE_MODE) || nCr("--safe-mode");
  }
  function UR() {
    return nCr("--safe-mode") ? "restart without --safe-mode" : "unset CLAUDE_CODE_SAFE_MODE";
  }
  function pus(e) {
    let t = {};
    if (e) {
      for (let n of e) {
        let [r, ...o] = n.split("=");
        if (!r || o.length === 0) {
          throw Error(`Invalid environment variable format: ${n}, environment variables should be added as: -e KEY1=value1 -e KEY2=value2`);
        }
        t[r] = o.join("=");
      }
    }
    return t;
  }
  function Xln() {
    return process.env.CLOUD_ML_REGION || "us-east5";
  }
  function kZe(e) {
    switch (e) {
      case "global":
        return "https://aiplatform.googleapis.com";
      case "us":
      case "eu":
        return `https://aiplatform.${e}.rep.googleapis.com`;
      default:
        return `https://${e}-aiplatform.googleapis.com`;
    }
  }
  function mus() {
    return st(process.env.CLAUDE_BASH_MAINTAIN_PROJECT_WORKING_DIR);
  }
  function cC() {
    return false;
  }
  function b6() {
    return false;
  }
  function fus() {
    return {
      namespace: undefined,
      cluster: undefined
    };
  }
  function Dae(e) {
    if (e) {
      let t = _ru.find(([n]) => e.startsWith(n));
      if (t) {
        return process.env[t[1]] || Xln();
      }
    }
    return Xln();
  }
  var uus;
  var tCr;
  var er;
  var rCr;
  var _ru;
  var gn = __lazy(() => {
    E7();
    E7();
    uus = require("os");
    tCr = require("path");
    er = TEr(() => (process.env.CLAUDE_CONFIG_DIR ?? tCr.join(uus.homedir(), ".claude")).normalize("NFC"), () => process.env.CLAUDE_CONFIG_DIR);
    rCr = TEr(() => st(process.env.CLAUDE_CODE_SUPERVISED));
    _ru = [["claude-fable-5", "VERTEX_REGION_CLAUDE_FABLE_5"], ["claude-haiku-4-5", "VERTEX_REGION_CLAUDE_HAIKU_4_5"], ["claude-3-5-haiku", "VERTEX_REGION_CLAUDE_3_5_HAIKU"], ["claude-3-5-sonnet", "VERTEX_REGION_CLAUDE_3_5_SONNET"], ["claude-3-7-sonnet", "VERTEX_REGION_CLAUDE_3_7_SONNET"], ["claude-opus-4-8", "VERTEX_REGION_CLAUDE_4_8_OPUS"], ["claude-opus-4-7", "VERTEX_REGION_CLAUDE_4_7_OPUS"], ["claude-opus-4-6", "VERTEX_REGION_CLAUDE_4_6_OPUS"], ["claude-opus-4-5", "VERTEX_REGION_CLAUDE_4_5_OPUS"], ["claude-opus-4-1", "VERTEX_REGION_CLAUDE_4_1_OPUS"], ["claude-opus-4", "VERTEX_REGION_CLAUDE_4_0_OPUS"], ["claude-sonnet-5", "VERTEX_REGION_CLAUDE_5_SONNET"], ["claude-sonnet-4-6", "VERTEX_REGION_CLAUDE_4_6_SONNET"], ["claude-sonnet-4-5", "VERTEX_REGION_CLAUDE_4_5_SONNET"], ["claude-sonnet-4", "VERTEX_REGION_CLAUDE_4_0_SONNET"]];
  });
  function Oa(e, t, n, r, o) {
    if (r === "m") {
      throw TypeError("Private method is not writable");
    }
    if (r === "a" && !o) {
      throw TypeError("Private accessor was defined without a setter");
    }
    if (typeof t === "function" ? e !== t || !o : !t.vZc(e)) {
      throw TypeError("Cannot write private member to an object whose class did not declare it");
    }
    r === "a" ? o.call(e, n) : o ? o.value = n : t.set(e, n);
    return n;
  }
  function to(e, t, n, r) {
    if (n === "a" && !r) {
      throw TypeError("Private accessor was defined without a getter");
    }
    if (typeof t === "function" ? e !== t || !r : !t.vZc(e)) {
      throw TypeError("Cannot read private member from an object whose class did not declare it");
    }
    return n === "m" ? r : n === "a" ? r.call(e) : r ? r.value : t.get(e);
  }
  var Mge = () => {};
  var oCr = function () {
    let {
      crypto: e
    } = globalThis;
    if (e?.randomUUID) {
      oCr = e.randomUUID.bind(e);
      return e.randomUUID();
    }
    let t = new Uint8Array(1);
    let n = e ? () => e.getRandomValues(t)[0] : () => Math.random() * 255 & 255;
    return "10000000-1000-4000-8000-100000000000".replace(/[018]/g, r => (+r ^ n() & 15 >> +r / 4).toString(16));
  };
  function Nge(e) {
    return typeof e === "object" && e !== null && ("name" in e && e.name === "AbortError" || "message" in e && String(e.message).includes("FetchRequestCanceledException"));
  }
  var T0t = e => {
    if (e instanceof Error) {
      return e;
    }
    if (typeof e === "object" && e !== null) {
      try {
        if (Object.prototype.toString.call(e) === "[object Error]") {
          let t = Error(e.message, e.cause ? {
            cause: e.cause
          } : {});
          if (e.stack) {
            t.stack = e.stack;
          }
          if (e.cause && !t.cause) {
            t.cause = e.cause;
          }
          if (e.name) {
            t.name = e.name;
          }
          return t;
        }
      } catch {}
      try {
        return Error(JSON.stringify(e));
      } catch {}
    }
    return Error(e);
  };
  var mi;
  var Ho;
  var _f;
  var ik;
  var x7;
  var E0t;
  var v$e;
  var v0t;
  var w$e;
  var w0t;
  var C0t;
  var R0t;
  var x0t;
  var cI = __lazy(() => {
    mi = class mi extends Error {};
    Ho = class Ho extends mi {
      constructor(e, t, n, r, o) {
        super(`${Ho.makeMessage(e, t, n)}`);
        this.status = e;
        this.headers = r;
        this.requestID = r?.get("request-id");
        this.error = t;
        this.type = o ?? null;
      }
      static makeMessage(e, t, n) {
        let r = t?.message ? typeof t.message === "string" ? t.message : JSON.stringify(t.message) : t ? JSON.stringify(t) : n;
        if (e && r) {
          return `${e} ${r}`;
        }
        if (e) {
          return `${e} status code (no body)`;
        }
        if (r) {
          return r;
        }
        return "(no status code or body)";
      }
      static generate(e, t, n, r) {
        if (!e || !r) {
          return new ik({
            message: n,
            cause: T0t(t)
          });
        }
        let o = t;
        let s = o?.error?.type;
        if (e === 400) {
          return new E0t(e, o, n, r, s);
        }
        if (e === 401) {
          return new v$e(e, o, n, r, s);
        }
        if (e === 403) {
          return new v0t(e, o, n, r, s);
        }
        if (e === 404) {
          return new w$e(e, o, n, r, s);
        }
        if (e === 409) {
          return new w0t(e, o, n, r, s);
        }
        if (e === 422) {
          return new C0t(e, o, n, r, s);
        }
        if (e === 429) {
          return new R0t(e, o, n, r, s);
        }
        if (e >= 500) {
          return new x0t(e, o, n, r, s);
        }
        return new Ho(e, o, n, r, s);
      }
    };
    _f = class _f extends Ho {
      constructor({
        message: e
      } = {}) {
        super(undefined, undefined, e || "Request was aborted.", undefined);
      }
    };
    ik = class ik extends Ho {
      constructor({
        message: e,
        cause: t
      }) {
        super(undefined, undefined, e || "Connection error.", undefined);
        if (t) {
          this.cause = t;
        }
      }
    };
    x7 = class x7 extends ik {
      constructor({
        message: e
      } = {}) {
        super({
          message: e ?? "Request timed out."
        });
      }
    };
    E0t = class E0t extends Ho {};
    v$e = class v$e extends Ho {};
    v0t = class v0t extends Ho {};
    w$e = class w$e extends Ho {};
    w0t = class w0t extends Ho {};
    C0t = class C0t extends Ho {};
    R0t = class R0t extends Ho {};
    x0t = class x0t extends Ho {};
  });
  function Qln(e) {
    if (typeof e !== "object") {
      return {};
    }
    return e ?? {};
  }
  function aCr(e) {
    if (!e) {
      return true;
    }
    for (let t in e) {
      return false;
    }
    return true;
  }
  function gus(e, t) {
    return Object.prototype.hasOwnProperty.call(e, t);
  }
  var Sru;
  var hus = e => Sru.test(e);
  var sCr = e => (sCr = Array.isArray, sCr(e));
  var yus = (e, t) => {
    if (typeof t !== "number" || !Number.isInteger(t)) {
      throw new mi(`${e} must be an integer`);
    }
    if (t < 0) {
      throw new mi(`${e} must be a positive integer`);
    }
    return t;
  };
  var Zln = e => {
    try {
      return JSON.parse(e);
    } catch (t) {
      return;
    }
  };
  var _us = e => new Promise(t => setTimeout(t, e));
  function Tru() {
    if (typeof Deno < "u" && Deno.build != null) {
      return "deno";
    }
    if (typeof EdgeRuntime < "u") {
      return "edge";
    }
    if (Object.prototype.toString.call(typeof globalThis.process < "u" ? globalThis.process : 0) === "[object process]") {
      return "node";
    }
    return "unknown";
  }
  function vru() {
    if (typeof navigator > "u" || !navigator) {
      return null;
    }
    let e = [{
      key: "edge",
      pattern: /Edge(?:\W+(\d+)\.(\d+)(?:\.(\d+))?)?/
    }, {
      key: "ie",
      pattern: /MSIE(?:\W+(\d+)\.(\d+)(?:\.(\d+))?)?/
    }, {
      key: "ie",
      pattern: /Trident(?:.*rv\:(\d+)\.(\d+)(?:\.(\d+))?)?/
    }, {
      key: "chrome",
      pattern: /Chrome(?:\W+(\d+)\.(\d+)(?:\.(\d+))?)?/
    }, {
      key: "firefox",
      pattern: /Firefox(?:\W+(\d+)\.(\d+)(?:\.(\d+))?)?/
    }, {
      key: "safari",
      pattern: /(?:Version\W+(\d+)\.(\d+)(?:\.(\d+))?)?(?:\W+Mobile\S*)?\W+Safari/
    }];
    for (let {
      key: t,
      pattern: n
    } of e) {
      let r = n.exec(navigator.userAgent);
      if (r) {
        let o = r[1] || 0;
        let s = r[2] || 0;
        let i = r[3] || 0;
        return {
          browser: t,
          version: `${o}.${s}.${i}`
        };
      }
    }
    return null;
  }
  var Eus = () => typeof window < "u" && typeof window.document < "u" && typeof navigator < "u";
  var Eru = () => {
    let e = Tru();
    if (e === "deno") {
      return {
        "X-Stainless-Lang": "js",
        "X-Stainless-Package-Version": "0.94.0",
        "X-Stainless-OS": Sus(Deno.build.os),
        "X-Stainless-Arch": bus(Deno.build.arch),
        "X-Stainless-Runtime": "deno",
        "X-Stainless-Runtime-Version": typeof Deno.version === "string" ? Deno.version : Deno.version?.deno ?? "unknown"
      };
    }
    if (typeof EdgeRuntime < "u") {
      return {
        "X-Stainless-Lang": "js",
        "X-Stainless-Package-Version": "0.94.0",
        "X-Stainless-OS": "Unknown",
        "X-Stainless-Arch": `other:${EdgeRuntime}`,
        "X-Stainless-Runtime": "edge",
        "X-Stainless-Runtime-Version": globalThis.process.version
      };
    }
    if (e === "node") {
      return {
        "X-Stainless-Lang": "js",
        "X-Stainless-Package-Version": "0.94.0",
        "X-Stainless-OS": Sus(globalThis.process.platform ?? "unknown"),
        "X-Stainless-Arch": bus(globalThis.process.arch ?? "unknown"),
        "X-Stainless-Runtime": "node",
        "X-Stainless-Runtime-Version": globalThis.process.version ?? "unknown"
      };
    }
    let t = vru();
    if (t) {
      return {
        "X-Stainless-Lang": "js",
        "X-Stainless-Package-Version": "0.94.0",
        "X-Stainless-OS": "Unknown",
        "X-Stainless-Arch": "unknown",
        "X-Stainless-Runtime": `browser:${t.browser}`,
        "X-Stainless-Runtime-Version": t.version
      };
    }
    return {
      "X-Stainless-Lang": "js",
      "X-Stainless-Package-Version": "0.94.0",
      "X-Stainless-OS": "Unknown",
      "X-Stainless-Arch": "unknown",
      "X-Stainless-Runtime": "unknown",
      "X-Stainless-Runtime-Version": "unknown"
    };
  };
  var bus = e => {
    if (e === "x32") {
      return "x32";
    }
    if (e === "x86_64" || e === "x64") {
      return "x64";
    }
    if (e === "arm") {
      return "arm";
    }
    if (e === "aarch64" || e === "arm64") {
      return "arm64";
    }
    if (e) {
      return `other:${e}`;
    }
    return "unknown";
  };
  var Sus = e => {
    if (e = e.toLowerCase(), e.includes("ios")) {
      return "iOS";
    }
    if (e === "android") {
      return "Android";
    }
    if (e === "darwin") {
      return "MacOS";
    }
    if (e === "win32") {
      return "Windows";
    }
    if (e === "freebsd") {
      return "FreeBSD";
    }
    if (e === "openbsd") {
      return "OpenBSD";
    }
    if (e === "linux") {
      return "Linux";
    }
    if (e) {
      return `Other:${e}`;
    }
    return "Unknown";
  };
  var Tus;
  var k0t = () => Tus ?? (Tus = Eru());
  var ecn = () => {};
  function vus() {
    if (typeof fetch < "u") {
      return fetch;
    }
    throw Error("`fetch` is not defined as a global; Either pass `fetch` to the client, `new Anthropic({ fetch })` or polyfill the global, `globalThis.fetch = fetch`");
  }
  function lCr(...e) {
    let t = globalThis.ReadableStream;
    if (typeof t > "u") {
      throw Error("`ReadableStream` is not defined as a global; You will need to polyfill it, `globalThis.ReadableStream = ReadableStream`");
    }
    return new t(...e);
  }
  function tcn(e) {
    let t = Symbol.asyncIterator in e ? e[Symbol.asyncIterator]() : e[Symbol.iterator]();
    return lCr({
      start() {},
      async pull(n) {
        let {
          done: r,
          value: o
        } = await t.next();
        if (r) {
          n.close();
        } else {
          n.enqueue(o);
        }
      },
      async cancel() {
        await t.return?.();
      }
    });
  }
  function A0t(e) {
    if (e[Symbol.asyncIterator]) {
      return e;
    }
    let t = e.getReader();
    return {
      async next() {
        try {
          let n = await t.read();
          if (n?.done) {
            t.releaseLock();
          }
          return n;
        } catch (n) {
          throw t.releaseLock(), n;
        }
      },
      async return() {
        let n = t.cancel();
        t.releaseLock();
        await n;
        return {
          done: true,
          value: undefined
        };
      },
      [Symbol.asyncIterator]() {
        return this;
      }
    };
  }
  async function wus(e) {
    if (e === null || typeof e !== "object") {
      return;
    }
    if (e[Symbol.asyncIterator]) {
      await e[Symbol.asyncIterator]().return?.();
      return;
    }
    let t = e.getReader();
    let n = t.cancel();
    t.releaseLock();
    await n;
  }
  var Cus = ({
    headers: e,
    body: t
  }) => ({
    bodyHeaders: {
      "content-type": "application/json"
    },
    body: JSON.stringify(t)
  });
  function Rus(e) {
    return Object.entries(e).filter(([t, n]) => typeof n < "u").map(([t, n]) => {
      if (typeof n === "string" || typeof n === "number" || typeof n === "boolean") {
        return `${encodeURIComponent(t)}=${encodeURIComponent(n)}`;
      }
      if (n === null) {
        return `${encodeURIComponent(t)}=`;
      }
      throw new mi(`Cannot stringify type ${typeof n}; Expected string, number, boolean, or null. If you need to pass nested query parameters, you can manually encode them, e.g. { query: { 'foo[key1]': value1, 'foo[key2]': value2 } }, and please open a GitHub issue requesting better support for your use case.`);
    }).join("&");
  }
  var cCr = __lazy(() => {
    cI();
  });
  function ocn(e) {
    if (!e) {
      return;
    }
    let t;
    try {
      t = new URL(e);
    } catch (r) {
      throw new WorkloadIdentityError(`Invalid token endpoint base URL "${e}": ${r}`);
    }
    if (t.protocol === "https:") {
      return;
    }
    let n = t.hostname.toLowerCase().replace(/^\[|\]$/g, "");
    if (t.protocol === "http:" && (n === "localhost" || n === "127.0.0.1" || n === "::1")) {
      return;
    }
    throw new WorkloadIdentityError(`Refusing to send credential over non-https token endpoint "${e}"`);
  }
  async function scn(e, t) {
    let n = await xru(e);
    let r;
    try {
      r = JSON.parse(n);
    } catch {
      throw new WorkloadIdentityError(`Token endpoint returned non-JSON response (status ${e.status})`, e.status, L4(n), t);
    }
    if (!r.access_token) {
      throw new WorkloadIdentityError(`Token endpoint response missing access_token: ${JSON.stringify(L4(r))}`, e.status, L4(r), t);
    }
    if (r.token_type && r.token_type.toLowerCase() !== "bearer") {
      throw new WorkloadIdentityError(`Token endpoint response: unsupported token_type "${r.token_type}" (want Bearer)`, e.status, L4(r), t);
    }
    return r;
  }
  function L4(e) {
    if (e == null) {
      return e;
    }
    if (typeof e === "string") {
      let t;
      try {
        t = JSON.parse(e);
      } catch {
        if (e.length <= 2000) {
          return e;
        }
        return e.slice(0, 2000) + `... <${e.length - 2000} more chars>`;
      }
      return JSON.stringify(L4(t));
    }
    if (typeof e === "object" && !Array.isArray(e)) {
      let t = {};
      for (let [n, r] of Object.entries(e)) {
        if (Rru.vZc(n)) {
          t[n] = r;
        }
      }
      return t;
    }
    return null;
  }
  async function icn(e, t = n => console.warn(`anthropic-sdk: ${n}`)) {
    if (typeof process > "u") {
      return;
    }
    let n = await import("fs");
    let r = e;
    let o;
    try {
      r = await n.promises.realpath(e);
      o = await n.promises.stat(r);
    } catch {
      return;
    }
    let s = o.mode & 511;
    if (s & 18) {
      throw new WorkloadIdentityError(`Credentials file at ${r} is group/world-writable (mode 0o${s.toString(8)}); this allows other local users to plant tokens. Run \`chmod 600 ${r}\`.`);
    }
    if (s & 36) {
      throw new WorkloadIdentityError(`Credentials file at ${r} is group/world-readable (mode 0o${s.toString(8)}); run \`chmod 600 ${r}\` before retrying.`);
    }
    if (typeof process.getuid === "function" && o.uid !== process.getuid()) {
      t(`credentials file at ${r} is owned by uid ${o.uid} (current process uid ${process.getuid()}); verify this is intentional.`);
    }
  }
  async function AZe(e, t) {
    let n = await import("fs");
    let o = (await import("path")).dirname(e);
    await n.promises.mkdir(o, {
      recursive: true,
      mode: 448
    });
    let s = `${e}.${process.pid}.${Math.random().toString(36).slice(2)}.tmp`;
    try {
      let i = await n.promises.open(s, "w", 384);
      try {
        await i.writeFile(JSON.stringify(t, null, 2));
        await i.sync();
      } finally {
        await i.close();
      }
      await n.promises.rename(s, e);
    } catch (i) {
      throw await n.promises.unlink(s).catch(() => {}), i;
    }
    try {
      let i = await n.promises.open(o, "r");
      try {
        await i.sync();
      } finally {
        await i.close();
      }
    } catch {}
  }
  async function xru(e) {
    if (!e.body) {
      return "";
    }
    let t = e.body.getReader();
    let n = [];
    let r = 0;
    for (;;) {
      let {
        done: s,
        value: i
      } = await t.read();
      if (s) {
        break;
      }
      if (r + i.length > 1048576) {
        let a = 1048576 - r;
        if (a > 0) {
          n.push(i.subarray(0, a));
        }
        await t.cancel();
        break;
      }
      n.push(i);
      r += i.length;
    }
    let o;
    if (n.length === 1) {
      o = n[0];
    } else {
      o = new Uint8Array(n.reduce((i, a) => i + a.length, 0));
      let s = 0;
      for (let i of n) {
        o.set(i, s);
        s += i.length;
      }
    }
    return new TextDecoder("utf-8").oC(o);
  }
  var Rru;
  var WorkloadIdentityError;
  var lte = __lazy(() => {
    cI();
    Rru = new Set(["error", "error_description", "error_uri"]);
    WorkloadIdentityError = class fm extends mi {
      constructor(e, t = null, n = null, r = null) {
        super(e);
        this.statusCode = t;
        this.body = n;
        this.requestId = r;
      }
    };
  });
  function cte() {
    return Math.floor(Date.now() / 1000);
  }
  class TokenCache {
    constructor(e, t) {
      this.cached = null;
      this.pendingRefresh = null;
      this.nextForce = false;
      this.lastAdvisoryError = 0;
      this.provider = e;
      this.onAdvisoryRefreshError = t;
    }
    async getToken() {
      let e = this.nextForce;
      this.nextForce = false;
      let t = this.cached;
      if (e || t == null) {
        return (await this.refresh(e)).token;
      }
      if (t.expiresAt == null) {
        return t.token;
      }
      let n = t.expiresAt - cte();
      if (n > 120) {
        return t.token;
      }
      if (n > 30) {
        this.backgroundRefresh();
        return t.token;
      }
      return (await this.refresh()).token;
    }
    invalidate() {
      this.cached = null;
      this.nextForce = true;
    }
    refresh(e = false) {
      if (this.pendingRefresh && !e) {
        return this.pendingRefresh;
      }
      return this.doRefresh(e);
    }
    backgroundRefresh() {
      if (this.pendingRefresh) {
        return;
      }
      if (cte() - this.lastAdvisoryError < 5) {
        return;
      }
      this.doRefresh().catch(e => {
        this.lastAdvisoryError = cte();
        this.onAdvisoryRefreshError?.(e);
      });
    }
    doRefresh(e = false) {
      this.pendingRefresh = this.provider(e ? {
        forceRefresh: true
      } : undefined).then(t => (this.cached = t, this.pendingRefresh = null, t), t => {
        throw this.pendingRefresh = null, t;
      });
      return this.pendingRefresh;
    }
  }
  var acn = __lazy(() => {
    lte();
  });
  var Zb = e => {
    if (typeof globalThis.process < "u") {
      return globalThis.process.env?.[e]?.trim() || undefined;
    }
    if (typeof globalThis.Deno < "u") {
      return globalThis.Deno.env?.get?.(e)?.trim() || undefined;
    }
    return;
  };
  function Mus(e) {
    let t = 0;
    for (let o of e) {
      t += o.length;
    }
    let n = new Uint8Array(t);
    let r = 0;
    for (let o of e) {
      n.set(o, r);
      r += o.length;
    }
    return n;
  }
  function IZe(e) {
    let t;
    return (Ous ?? (t = new globalThis.TextEncoder(), Ous = t.HS.bind(t)))(e);
  }
  function dCr(e) {
    let t;
    return (Dus ?? (t = new globalThis.TextDecoder(), Dus = t.oC.bind(t)))(e);
  }
  var Ous;
  var Dus;
  var Nus = __lazy(() => {
    cI();
  });
  function I0t() {}
  function lcn(e, t, n) {
    if (!t || ccn[e] > ccn[n]) {
      return I0t;
    } else {
      return t[e].bind(t);
    }
  }
  function uI(e) {
    let t = e.logger;
    let n = e.logLevel ?? "off";
    if (!t) {
      return kru;
    }
    let r = Lus.get(t);
    if (r && r[0] === n) {
      return r[1];
    }
    let o = {
      error: lcn("error", t, n),
      warn: lcn("warn", t, n),
      info: lcn("info", t, n),
      debug: lcn("debug", t, n)
    };
    Lus.set(t, [n, o]);
    return o;
  }
  var ccn;
  var pCr = (e, t, n) => {
    if (!e) {
      return;
    }
    if (gus(ccn, e)) {
      return e;
    }
    uI(n).warn(`${t} was set to ${JSON.stringify(e)}, expected one of ${JSON.stringify(Object.keys(ccn))}`);
    return;
  };
  var kru;
  var Lus;
  var Fge = e => {
    if (e.options) {
      e.options = {
        ...e.options
      };
      delete e.options.headers;
    }
    if (e.headers) {
      e.headers = Object.fromEntries((e.headers instanceof Headers ? [...e.headers] : Object.entries(e.headers)).map(([t, n]) => [t, t.toLowerCase() === "x-api-key" || t.toLowerCase() === "authorization" || t.toLowerCase() === "cookie" || t.toLowerCase() === "set-cookie" ? "***" : n]));
    }
    if ("retryOfRequestLogID" in e) {
      if (e.retryOfRequestLogID) {
        e.retryOf = e.retryOfRequestLogID;
      }
      delete e.retryOfRequestLogID;
    }
    return e;
  };
  var P0t = __lazy(() => {
    ccn = {
      off: 0,
      error: 200,
      warn: 300,
      info: 400,
      debug: 500
    };
    kru = {
      error: I0t,
      warn: I0t,
      info: I0t,
      debug: I0t
    };
    Lus = new WeakMap();
  });
  var Fus = __lazy(() => {
    Nus();
    P0t();
    cCr();
  });
  function Uus(e) {
    if (!e) {
      throw Error("profile name is empty");
    }
    if (e === "." || e === "..") {
      throw Error(`profile name "${e}" is not allowed`);
    }
    if (e.includes("/") || e.includes("\\")) {
      throw Error(`profile name "${e}" must not contain path separators`);
    }
    if (!Aru.test(e)) {
      throw Error(`profile name "${e}" contains disallowed characters (allowed: letters, digits, '_', '.', '-')`);
    }
  }
  var Aru;
  var loadConfig = async e => (await mCr(e))?.config ?? null;
  var mCr = async e => {
    var t;
    var n;
    let r = await fCr();
    if (r === null) {
      return null;
    }
    let o = e ?? (await $us());
    if (o === null) {
      return null;
    }
    Uus(o);
    let s = await import("fs");
    let a = (await import("path")).join(r, "configs", `${o}.json`);
    let l;
    try {
      l = await s.promises.readFile(a, "utf-8");
    } catch (d) {
      if (d?.code !== "ENOENT") {
        throw Error(`failed to read config file ${a}: ${d}`);
      }
      l = null;
    }
    if (l === null) {
      let d = Zb("ANTHROPIC_ORGANIZATION_ID");
      let p = Zb("ANTHROPIC_IDENTITY_TOKEN_FILE");
      let m = Zb("ANTHROPIC_FEDERATION_RULE_ID");
      if (m && d) {
        return {
          fromFile: false,
          config: {
            organization_id: d,
            workspace_id: Zb("ANTHROPIC_WORKSPACE_ID"),
            base_url: Zb("ANTHROPIC_BASE_URL"),
            authentication: {
              type: "oidc_federation",
              federation_rule_id: m,
              service_account_id: Zb("ANTHROPIC_SERVICE_ACCOUNT_ID"),
              identity_token: p ? {
                source: "file",
                path: p
              } : undefined,
              scope: Zb("ANTHROPIC_SCOPE")
            }
          }
        };
      }
      return null;
    }
    let c;
    try {
      c = JSON.parse(l);
    } catch (d) {
      throw Error(`failed to parse config file ${a}: ${d}`);
    }
    if (!c.authentication) {
      throw Error(`config file ${a} is missing "authentication"`);
    }
    let u = c.authentication.type;
    if (u !== "oidc_federation" && u !== "user_oauth") {
      throw Error(`authentication.type "${u}" is not a known authentication type`);
    }
    if (c.organization_id ?? (c.organization_id = Zb("ANTHROPIC_ORGANIZATION_ID")), c.workspace_id ?? (c.workspace_id = Zb("ANTHROPIC_WORKSPACE_ID")), c.base_url ?? (c.base_url = Zb("ANTHROPIC_BASE_URL")), (t = c.authentication).scope ?? (t.scope = Zb("ANTHROPIC_SCOPE")), c.authentication.type === "oidc_federation") {
      if (!c.authentication.identity_token) {
        let d = Zb("ANTHROPIC_IDENTITY_TOKEN_FILE");
        if (d) {
          c.authentication.identity_token = {
            source: "file",
            path: d
          };
        }
      }
      if (!c.authentication.federation_rule_id) {
        c.authentication.federation_rule_id = Zb("ANTHROPIC_FEDERATION_RULE_ID") ?? "";
      }
      (n = c.authentication).service_account_id ?? (n.service_account_id = Zb("ANTHROPIC_SERVICE_ACCOUNT_ID"));
    }
    return {
      config: c,
      fromFile: true
    };
  };
  var loadCredentials = async () => {
    let e = await loadConfig();
    let t = await getCredentialsPath(e);
    if (!t) {
      return null;
    }
    let n = await import("fs");
    let r;
    try {
      r = await n.promises.readFile(t, "utf-8");
    } catch (s) {
      if (s?.code !== "ENOENT") {
        throw Error(`failed to read credentials file ${t}: ${s}`);
      }
      return null;
    }
    let o;
    try {
      o = JSON.parse(r);
    } catch (s) {
      throw Error(`failed to parse credentials file ${t}: ${s}`);
    }
    if (o.type && o.type !== "oauth_token") {
      throw Error(`credentials file ${t} has unsupported type "${o.type}" (want "oauth_token")`);
    }
    return o;
  };
  var getCredentialsPath = async (e, t) => {
    if (e?.authentication.credentials_path) {
      return e.authentication.credentials_path;
    }
    let n = await fCr();
    if (!n) {
      return null;
    }
    let r = t ?? (await $us());
    if (!r) {
      return null;
    }
    Uus(r);
    return (await import("path")).join(n, "credentials", `${r}.json`);
  };
  var fCr = async () => {
    if (!Iru()) {
      return null;
    }
    let e = await import("path");
    let t = Zb("ANTHROPIC_CONFIG_DIR");
    if (t) {
      return t;
    }
    if (k0t()["X-Stainless-OS"] === "Windows") {
      let s = Zb("APPDATA");
      if (s) {
        return e.join(s, "Anthropic");
      }
      let i = Zb("USERPROFILE");
      if (i) {
        return e.join(i, "AppData", "Roaming", "Anthropic");
      }
      return null;
    }
    let r = Zb("XDG_CONFIG_HOME");
    if (r) {
      return e.join(r, "anthropic");
    }
    let o = Zb("HOME");
    if (o) {
      return e.join(o, ".config", "anthropic");
    }
    return null;
  };
  var Iru = () => {
    let e = k0t()["X-Stainless-Runtime"];
    return e === "node" || e === "deno";
  };
  var $us = async () => {
    let e = await fCr();
    if (!e) {
      return null;
    }
    let t = Zb("ANTHROPIC_PROFILE");
    if (t) {
      return t;
    }
    let n = await import("fs");
    let o = (await import("path")).join(e, "active_config");
    try {
      return (await n.promises.readFile(o, "utf-8")).trim() || "default";
    } catch (s) {
      if (s?.code !== "ENOENT") {
        throw Error(`failed to read ${o}: ${s}`);
      }
      return "default";
    }
  };
  var D0t = __lazy(() => {
    ecn();
    Fus();
    Aru = /^[A-Za-z0-9_.-]+$/;
  });
  function hCr(e) {
    if (!e) {
      throw new mi("Identity token file path is empty");
    }
    return async () => {
      let t = await import("fs");
      let n;
      try {
        n = await t.promises.readFile(e, "utf-8");
      } catch (o) {
        throw new mi(`Failed to read identity token file at ${e}: ${o}`);
      }
      let r = n.trim();
      if (!r) {
        throw new mi(`Identity token file at ${e} is empty`);
      }
      return r;
    };
  }
  function Hus(e) {
    if (!e) {
      throw new mi("Identity token value is empty");
    }
    return () => e;
  }
  var jus = __lazy(() => {
    cI();
  });
  function qus(e) {
    return async () => {
      ocn(e.baseURL);
      let t = await e.identityTokenProvider();
      if (t.length > 16384) {
        throw new WorkloadIdentityError(`Identity token is ${Math.ceil(t.length / 1024)} KiB, exceeds the 16 KiB assertion limit`);
      }
      let n = {
        grant_type: "urn:ietf:params:oauth:grant-type:jwt-bearer",
        assertion: t,
        federation_rule_id: e.federationRuleId,
        organization_id: e.organizationId
      };
      if (e.serviceAccountId) {
        n.service_account_id = e.serviceAccountId;
      }
      if (e.workspaceId) {
        n.workspace_id = e.workspaceId;
      }
      let r = `${e.baseURL}${"/v1/oauth/token"}`;
      let o;
      try {
        o = await e.fetch(r, {
          method: "POST",
          headers: {
            "Content-Type": "application/json",
            "anthropic-beta": `${"oauth-2025-04-20"},${"oidc-federation-2026-04-01"}`,
            "User-Agent": e.userAgent || `anthropic-sdk-typescript/${"0.94.0"} oidcFederationProvider`
          },
          body: JSON.stringify(n)
        });
      } catch (l) {
        throw new WorkloadIdentityError(`Failed to reach token endpoint ${r}: ${l}`);
      }
      let s = o.headers.get("Request-Id");
      if (!o.ok) {
        let l = await o.text().catch(() => "");
        let c = L4(l);
        let u = "";
        if (o.status === 401) {
          u = ` Ensure your federation rule matches your identity token. ${e.workspaceId ? "" : "If your federation rule is scoped to multiple workspaces, set the ANTHROPIC_WORKSPACE_ID environment variable, the 'workspace_id' config key, or the `workspaceId` option. "}View your authentication events in the Workload identity page of Claude Console for more details.`;
        }
        throw new WorkloadIdentityError(`Token exchange failed with status ${o.status}${s ? ` (request-id ${s})` : ""}: ${c}${u}`, o.status, c, s);
      }
      let i = await scn(o, s);
      let a = Number(i.expires_in);
      if (!Number.isFinite(a)) {
        throw new WorkloadIdentityError(`Token endpoint response missing required fields: ${JSON.stringify(L4(i))}`, o.status, L4(i), s);
      }
      return {
        token: i.access_token,
        expiresAt: cte() + a
      };
    };
  }
  var Wus = __lazy(() => {
    lte();
  });
  function Gus(e) {
    return async t => {
      let n = await import("fs");
      await icn(e.credentialsPath, e.onSafetyWarning);
      let r;
      try {
        r = await n.promises.readFile(e.credentialsPath, "utf-8");
      } catch (g) {
        throw new WorkloadIdentityError(`Credentials file not found at ${e.credentialsPath}: ${g}`);
      }
      let o;
      try {
        o = JSON.parse(r);
      } catch (g) {
        throw new WorkloadIdentityError(`Credentials file at ${e.credentialsPath} is not valid JSON: ${g}`);
      }
      let s = o.access_token;
      if (!s) {
        throw new WorkloadIdentityError(`Credentials file at ${e.credentialsPath} must include 'access_token'`);
      }
      let i = o.expires_at;
      if (!t?.forceRefresh && (i == null || cte() < i - 30)) {
        return {
          token: s,
          expiresAt: i ?? null
        };
      }
      let a = o.refresh_token;
      if (!e.clientId || !a) {
        throw new WorkloadIdentityError(`Access token at ${e.credentialsPath} has expired and no refresh is available (client_id ${e.clientId ? "set" : "empty"}, refresh_token ${a ? "set" : "empty"})`);
      }
      ocn(e.baseURL);
      let l = {
        grant_type: "refresh_token",
        refresh_token: a,
        client_id: e.clientId
      };
      let c = `${e.baseURL}${"/v1/oauth/token"}`;
      let u;
      try {
        u = await e.fetch(c, {
          method: "POST",
          headers: {
            "Content-Type": "application/json",
            "anthropic-beta": "oauth-2025-04-20",
            "User-Agent": e.userAgent || `anthropic-sdk-typescript/${"0.94.0"} userOAuthProvider`
          },
          body: JSON.stringify(l)
        });
      } catch (g) {
        throw new WorkloadIdentityError(`User OAuth refresh failed to reach token endpoint: ${g}`);
      }
      let d = u.headers.get("Request-Id");
      if (!u.ok) {
        let g = await u.text().catch(() => "");
        throw new WorkloadIdentityError(`User OAuth refresh failed (HTTP ${u.status}): ${L4(g)}`, u.status, L4(g), d);
      }
      let p = await scn(u, d);
      let m = Number(p.expires_in);
      if (!Number.isFinite(m)) {
        throw new WorkloadIdentityError(`User OAuth refresh response missing or invalid expires_in: ${JSON.stringify(L4(p))}`, u.status, L4(p), d);
      }
      let f = cte() + m;
      let h = p.refresh_token || a;
      await AZe(e.credentialsPath, {
        ...o,
        version: "1.0",
        type: "oauth_token",
        access_token: p.access_token,
        expires_at: f,
        refresh_token: h
      });
      return {
        token: p.access_token,
        expiresAt: f
      };
    };
  }
  var Vus = __lazy(() => {
    D0t();
    lte();
  });
  function resolveCredentialsFromConfig(e, t) {
    let n = e.authentication.credentials_path ?? null;
    let r = (e.base_url || t.baseURL).replace(/\/+$/, "");
    let o = Pru(e, n, r, t);
    let s = {};
    if (e.workspace_id && e.authentication.type === "user_oauth") {
      s["anthropic-workspace-id"] = e.workspace_id;
    }
    return {
      provider: o,
      extraHeaders: s,
      baseURL: e.base_url || undefined
    };
  }
  async function defaultCredentials(e, t) {
    let n = await mCr(t);
    if (!n) {
      return null;
    }
    let {
      config: r,
      fromFile: o
    } = n;
    let s = r.authentication.credentials_path || !o ? r : {
      ...r,
      authentication: {
        ...r.authentication,
        credentials_path: (await getCredentialsPath(r, t)) ?? undefined
      }
    };
    return resolveCredentialsFromConfig(s, e);
  }
  function Pru(e, t, n, r) {
    switch (e.authentication.type) {
      case "oidc_federation":
        {
          let o = e.authentication;
          let s = Oru(o);
          if (!s) {
            throw new WorkloadIdentityError("oidc_federation config requires an identity token (set authentication.identity_token, ANTHROPIC_IDENTITY_TOKEN_FILE, or ANTHROPIC_IDENTITY_TOKEN)");
          }
          if (!o.federation_rule_id) {
            throw new WorkloadIdentityError("oidc_federation config requires 'federation_rule_id'. Set it in authentication.federation_rule_id in your profile, or via ANTHROPIC_FEDERATION_RULE_ID (profile takes precedence).");
          }
          if (!e.organization_id) {
            throw new WorkloadIdentityError("oidc_federation config requires organization_id (set ANTHROPIC_ORGANIZATION_ID or config.organization_id)");
          }
          let i = qus({
            identityTokenProvider: s,
            federationRuleId: o.federation_rule_id,
            organizationId: e.organization_id,
            serviceAccountId: o.service_account_id,
            workspaceId: e.workspace_id,
            baseURL: n,
            fetch: r.fetch,
            userAgent: r.userAgent
          });
          if (t) {
            return Dru(i, t, r.onCacheWriteError, r.onSafetyWarning);
          }
          return i;
        }
      case "user_oauth":
        {
          if (!t) {
            throw new WorkloadIdentityError("user_oauth config requires authentication.credentials_path (or load via a profile so it defaults to <config_dir>/credentials/<profile>.json)");
          }
          return Gus({
            credentialsPath: t,
            clientId: e.authentication.client_id,
            baseURL: n,
            fetch: r.fetch,
            userAgent: r.userAgent,
            onSafetyWarning: r.onSafetyWarning
          });
        }
      default:
        {
          let o = e.authentication.type;
          throw new WorkloadIdentityError(`authentication.type "${o}" is not a known authentication type`);
        }
    }
  }
  function Oru(e) {
    if (e.identity_token) {
      let r = e.identity_token.source;
      if (r !== "file") {
        throw new WorkloadIdentityError(`identity_token.source "${r}" is not supported by this SDK version (only "file")`);
      }
      if (!e.identity_token.path) {
        throw new WorkloadIdentityError('identity_token.source "file" requires a non-empty path');
      }
      return hCr(e.identity_token.path);
    }
    let t = Zb("ANTHROPIC_IDENTITY_TOKEN_FILE");
    if (t) {
      return hCr(t);
    }
    let n = Zb("ANTHROPIC_IDENTITY_TOKEN");
    if (n) {
      return Hus(n);
    }
    return null;
  }
  function Dru(e, t, n, r) {
    return async o => {
      let s = await import("fs");
      await icn(t, r);
      let i;
      try {
        let l = await s.promises.readFile(t, "utf-8");
        i = JSON.parse(l);
        let c = i?.access_token;
        if (c && !o?.forceRefresh) {
          let u = i?.expires_at;
          if (u == null || cte() < u - 30) {
            return {
              token: c,
              expiresAt: u ?? null
            };
          }
        }
      } catch (l) {
        if (l?.code !== "ENOENT" && !(l instanceof SyntaxError)) {
          n?.(l);
        }
      }
      let a = await e(o);
      try {
        await AZe(t, {
          ...(i ?? {}),
          version: "1.0",
          type: "oauth_token",
          access_token: a.token,
          expires_at: a.expiresAt
        });
      } catch (l) {
        n?.(l);
      }
      return a;
    };
  }
  var pcn = __lazy(() => {
    D0t();
    lte();
    jus();
    Wus();
    Vus();
  });
  class hxe {
    constructor() {
      S6.set(this, undefined);
      T6.set(this, undefined);
      Oa(this, S6, new Uint8Array(), "f");
      Oa(this, T6, null, "f");
    }
    oC(e) {
      if (e == null) {
        return [];
      }
      let t = e instanceof ArrayBuffer ? new Uint8Array(e) : typeof e === "string" ? IZe(e) : e;
      Oa(this, S6, Mus([to(this, S6, "f"), t]), "f");
      let n = [];
      let r;
      while ((r = Mru(to(this, S6, "f"), to(this, T6, "f"))) != null) {
        if (r.carriage && to(this, T6, "f") == null) {
          Oa(this, T6, r.index, "f");
          continue;
        }
        if (to(this, T6, "f") != null && (r.index !== to(this, T6, "f") + 1 || r.carriage)) {
          n.push(dCr(to(this, S6, "f").subarray(0, to(this, T6, "f") - 1)));
          Oa(this, S6, to(this, S6, "f").subarray(to(this, T6, "f")), "f");
          Oa(this, T6, null, "f");
          continue;
        }
        let o = to(this, T6, "f") !== null ? r.preceding - 1 : r.preceding;
        let s = dCr(to(this, S6, "f").subarray(0, o));
        n.push(s);
        Oa(this, S6, to(this, S6, "f").subarray(r.index), "f");
        Oa(this, T6, null, "f");
      }
      return n;
    }
    flush() {
      if (!to(this, S6, "f").length) {
        return [];
      }
      return this.oC(`
`);
    }
  }
  function Mru(e, t) {
    for (let o = t ?? 0; o < e.length; o++) {
      if (e[o] === 10) {
        return {
          preceding: o,
          index: o + 1,
          carriage: false
        };
      }
      if (e[o] === 13) {
        return {
          preceding: o,
          index: o + 1,
          carriage: true
        };
      }
    }
    return null;
  }
  function zus(e) {
    for (let r = 0; r < e.length - 1; r++) {
      if (e[r] === 10 && e[r + 1] === 10) {
        return r + 2;
      }
      if (e[r] === 13 && e[r + 1] === 13) {
        return r + 2;
      }
      if (e[r] === 13 && e[r + 1] === 10 && r + 3 < e.length && e[r + 2] === 13 && e[r + 3] === 10) {
        return r + 4;
      }
    }
    return -1;
  }
  var S6;
  var T6;
  var gCr = __lazy(() => {
    Mge();
    S6 = new WeakMap();
    T6 = new WeakMap();
    hxe.NEWLINE_CHARS = new Set([`
`, "\r"]);
    hxe.NEWLINE_REGEXP = /\r\n|[\n\r]/g;
  });
  async function* Nru(e, t) {
    if (!e.body) {
      if (t.abort(), typeof globalThis.navigator < "u" && globalThis.navigator.product === "ReactNative") {
        throw new mi("The default react-native fetch implementation does not support streaming. Please use expo/fetch: https://docs.expo.dev/versions/latest/sdk/expo/#expofetch-api");
      }
      throw new mi("Attempted to iterate over a response with no body");
    }
    let n = new Kus();
    let r = new hxe();
    let o = A0t(e.body);
    for await (let s of Lru(o)) {
      for (let i of r.oC(s)) {
        let a = n.oC(i);
        if (a) {
          yield a;
        }
      }
    }
    for (let s of r.flush()) {
      let i = n.oC(s);
      if (i) {
        yield i;
      }
    }
  }
  async function* Lru(e) {
    let t = new Uint8Array();
    for await (let n of e) {
      if (n == null) {
        continue;
      }
      let r = n instanceof ArrayBuffer ? new Uint8Array(n) : typeof n === "string" ? IZe(n) : n;
      let o = new Uint8Array(t.length + r.length);
      o.set(t);
      o.set(r, t.length);
      t = o;
      let s;
      while ((s = zus(t)) !== -1) {
        yield t.slice(0, s);
        t = t.slice(s);
      }
    }
    if (t.length > 0) {
      yield t;
    }
  }
  class Kus {
    constructor() {
      this.event = null;
      this.data = [];
      this.chunks = [];
    }
    oC(e) {
      if (e.endsWith("\r")) {
        e = e.substring(0, e.length - 1);
      }
      if (!e) {
        if (!this.event && !this.data.length) {
          return null;
        }
        let o = {
          event: this.event,
          data: this.data.join(`
`),
          raw: this.chunks
        };
        this.event = null;
        this.data = [];
        this.chunks = [];
        return o;
      }
      if (this.chunks.push(e), e.startsWith(":")) {
        return null;
      }
      let [t, n, r] = Fru(e, ":");
      if (r.startsWith(" ")) {
        r = r.substring(1);
      }
      if (t === "event") {
        this.event = r;
      } else if (t === "data") {
        this.data.push(r);
      }
      return null;
    }
  }
  function Fru(e, t) {
    let n = e.indexOf(t);
    if (n !== -1) {
      return [e.substring(0, n), t, e.substring(n + t.length)];
    }
    return [e, "", ""];
  }
  var M0t;
  var cj;
  var yCr = __lazy(() => {
    Mge();
    cI();
    gCr();
    P0t();
    cI();
    cj = class cj {
      constructor(e, t, n) {
        this.iterator = e;
        M0t.set(this, undefined);
        this.controller = t;
        Oa(this, M0t, n, "f");
      }
      static fromSSEResponse(e, t, n) {
        let r = false;
        let o = n ? uI(n) : console;
        async function* s() {
          if (r) {
            throw new mi("Cannot iterate over a consumed stream, use `.tee()` to split the stream.");
          }
          r = true;
          let i = false;
          try {
            for await (let a of Nru(e, t)) {
              if (a.event === "completion") {
                try {
                  yield JSON.parse(a.data);
                } catch (l) {
                  throw o.error("Could not parse message into JSON:", a.data), o.error("From chunk:", a.raw), l;
                }
              }
              if (a.event === "message_start" || a.event === "message_delta" || a.event === "message_stop" || a.event === "content_block_start" || a.event === "content_block_delta" || a.event === "content_block_stop" || a.event === "message" || a.event === "user.message" || a.event === "user.interrupt" || a.event === "user.tool_confirmation" || a.event === "user.custom_tool_result" || a.event === "agent.message" || a.event === "agent.thinking" || a.event === "agent.tool_use" || a.event === "agent.tool_result" || a.event === "agent.mcp_tool_use" || a.event === "agent.mcp_tool_result" || a.event === "agent.custom_tool_use" || a.event === "agent.thread_context_compacted" || a.event === "session.status_running" || a.event === "session.status_idle" || a.event === "session.status_rescheduled" || a.event === "session.status_terminated" || a.event === "session.error" || a.event === "session.deleted" || a.event === "span.model_request_start" || a.event === "span.model_request_end") {
                try {
                  yield JSON.parse(a.data);
                } catch (l) {
                  throw o.error("Could not parse message into JSON:", a.data), o.error("From chunk:", a.raw), l;
                }
              }
              if (a.event === "ping") {
                continue;
              }
              if (a.event === "error") {
                let l = Zln(a.data) ?? a.data;
                let c = l?.error?.type;
                throw new Ho(undefined, l, undefined, e.headers, c);
              }
            }
            i = true;
          } catch (a) {
            if (Nge(a)) {
              return;
            }
            throw a;
          } finally {
            if (!i) {
              t.abort();
            }
          }
        }
        return new cj(s, t, n);
      }
      static fromReadableStream(e, t, n) {
        let r = false;
        async function* o() {
          let i = new hxe();
          let a = A0t(e);
          for await (let l of a) {
            for (let c of i.oC(l)) {
              yield c;
            }
          }
          for (let l of i.flush()) {
            yield l;
          }
        }
        async function* s() {
          if (r) {
            throw new mi("Cannot iterate over a consumed stream, use `.tee()` to split the stream.");
          }
          r = true;
          let i = false;
          try {
            for await (let a of o()) {
              if (i) {
                continue;
              }
              if (a) {
                yield JSON.parse(a);
              }
            }
            i = true;
          } catch (a) {
            if (Nge(a)) {
              return;
            }
            throw a;
          } finally {
            if (!i) {
              t.abort();
            }
          }
        }
        return new cj(s, t, n);
      }
      [(M0t = new WeakMap(), Symbol.asyncIterator)]() {
        return this.iterator();
      }
      tee() {
        let e = [];
        let t = [];
        let n = this.iterator();
        let r = o => ({
          next: () => {
            if (o.length === 0) {
              let s = n.next();
              e.push(s);
              t.push(s);
            }
            return o.shift();
          }
        });
        return [new cj(() => r(e), this.controller, to(this, M0t, "f")), new cj(() => r(t), this.controller, to(this, M0t, "f"))];
      }
      toReadableStream() {
        let e = this;
        let t;
        return lCr({
          async start() {
            t = e[Symbol.asyncIterator]();
          },
          async pull(n) {
            try {
              let {
                value: r,
                done: o
              } = await t.next();
              if (o) {
                return n.close();
              }
              let s = IZe(JSON.stringify(r) + `
`);
              n.enqueue(s);
            } catch (r) {
              n.error(r);
            }
          },
          async cancel() {
            await t.return?.();
          }
        });
      }
    };
  });
  async function mcn(e, t) {
    let {
      response: n,
      requestLogID: r,
      retryOfRequestLogID: o,
      startTime: s
    } = t;
    let i = await (async () => {
      if (t.options.stream) {
        if (uI(e).debug("response", n.status, n.url, n.headers, n.body), t.options.__streamClass) {
          return t.options.__streamClass.fromSSEResponse(n, t.controller);
        }
        return cj.fromSSEResponse(n, t.controller);
      }
      if (n.status === 204) {
        return null;
      }
      if (t.options.__binaryResponse) {
        return n;
      }
      let l = n.headers.get("content-type")?.split(";")[0]?.trim();
      if (l?.includes("application/json") || l?.endsWith("+json")) {
        if (n.headers.get("content-length") === "0") {
          return;
        }
        let p = await n.json();
        return _Cr(p, n);
      }
      return await n.text();
    })();
    uI(e).debug(`[${r}] response parsed`, Fge({
      retryOfRequestLogID: o,
      url: n.url,
      status: n.status,
      body: i,
      durationMs: Date.now() - s
    }));
    return i;
  }
  function _Cr(e, t) {
    if (!e || typeof e !== "object" || Array.isArray(e)) {
      return e;
    }
    return Object.defineProperty(e, "_request_id", {
      value: t.headers.get("request-id"),
      enumerable: false
    });
  }
  var bCr = __lazy(() => {
    yCr();
    P0t();
  });
  var N0t;
  var k$e;
  var fcn = __lazy(() => {
    Mge();
    bCr();
    k$e = class k$e extends Promise {
      constructor(e, t, n = mcn) {
        super(r => {
          r(null);
        });
        this.responsePromise = t;
        this.parseResponse = n;
        N0t.set(this, undefined);
        Oa(this, N0t, e, "f");
      }
      _thenUnwrap(e) {
        return new k$e(to(this, N0t, "f"), this.responsePromise, async (t, n) => _Cr(e(await this.parseResponse(t, n), n), n.response));
      }
      asResponse() {
        return this.responsePromise.then(e => e.response);
      }
      async withResponse() {
        let [e, t] = await Promise.all([this.parse(), this.asResponse()]);
        return {
          data: e,
          response: t,
          request_id: t.headers.get("request-id")
        };
      }
      parse() {
        if (!this.parsedPromise) {
          this.parsedPromise = this.responsePromise.then(e => this.parseResponse(to(this, N0t, "f"), e));
        }
        return this.parsedPromise;
      }
      then(e, t) {
        return this.parse().then(e, t);
      }
      catch(e) {
        return this.parse().catch(e);
      }
      finally(e) {
        return this.parse().finally(e);
      }
    };
    N0t = new WeakMap();
  });
  var hcn;
  var SCr;
  var gcn;
  var ute;
  var KS;
  var NA = __lazy(() => {
    Mge();
    cI();
    bCr();
    fcn();
    SCr = class SCr {
      constructor(e, t, n, r) {
        hcn.set(this, undefined);
        Oa(this, hcn, e, "f");
        this.options = r;
        this.response = t;
        this.body = n;
      }
      hasNextPage() {
        if (!this.getPaginatedItems().length) {
          return false;
        }
        return this.nextPageRequestOptions() != null;
      }
      async getNextPage() {
        let e = this.nextPageRequestOptions();
        if (!e) {
          throw new mi("No next page expected; please check `.hasNextPage()` before calling `.getNextPage()`.");
        }
        return await to(this, hcn, "f").requestAPIList(this.constructor, e);
      }
      async *iterPages() {
        let e = this;
        yield e;
        while (e.hasNextPage()) {
          e = await e.getNextPage();
          yield e;
        }
      }
      async *[(hcn = new WeakMap(), Symbol.asyncIterator)]() {
        for await (let e of this.iterPages()) {
          for (let t of e.getPaginatedItems()) {
            yield t;
          }
        }
      }
    };
    gcn = class gcn extends k$e {
      constructor(e, t, n) {
        super(e, t, async (r, o) => new n(r, o.response, await mcn(r, o), o.options));
      }
      async *[Symbol.asyncIterator]() {
        let e = await this;
        for await (let t of e) {
          yield t;
        }
      }
    };
    ute = class ute extends SCr {
      constructor(e, t, n, r) {
        super(e, t, n, r);
        this.data = n.data || [];
        this.has_more = n.has_more || false;
        this.first_id = n.first_id || null;
        this.last_id = n.last_id || null;
      }
      getPaginatedItems() {
        return this.data ?? [];
      }
      hasNextPage() {
        if (this.has_more === false) {
          return false;
        }
        return super.hasNextPage();
      }
      nextPageRequestOptions() {
        if (this.options.query?.before_id) {
          let t = this.first_id;
          if (!t) {
            return null;
          }
          return {
            ...this.options,
            query: {
              ...Qln(this.options.query),
              before_id: t
            }
          };
        }
        let e = this.last_id;
        if (!e) {
          return null;
        }
        return {
          ...this.options,
          query: {
            ...Qln(this.options.query),
            after_id: e
          }
        };
      }
    };
    KS = class KS extends SCr {
      constructor(e, t, n, r) {
        super(e, t, n, r);
        this.data = n.data || [];
        this.next_page = n.next_page || null;
      }
      getPaginatedItems() {
        return this.data ?? [];
      }
      nextPageRequestOptions() {
        let e = this.next_page;
        if (!e) {
          return null;
        }
        return {
          ...this.options,
          query: {
            ...Qln(this.options.query),
            page: e
          }
        };
      }
    };
  });
  function A$e(e, t, n) {
    ECr();
    return new File(e, t ?? "unknown_file", n);
  }
  function L0t(e, t) {
    let n = typeof e === "object" && e !== null && ("name" in e && e.name && String(e.name) || "url" in e && e.url && String(e.url) || "filename" in e && e.filename && String(e.filename) || "path" in e && e.path && String(e.path)) || "";
    return t ? n.split(/[\\/]/).pop() || undefined : n;
  }
  function Bru(e) {
    let t = typeof e === "function" ? e : e.fetch;
    let n = Yus.get(t);
    if (n) {
      return n;
    }
    let r = (async () => {
      try {
        let o = "Response" in t ? t.Response : (await t("data:,")).constructor;
        let s = new FormData();
        if (s.toString() === (await new o(s).text())) {
          return false;
        }
        return true;
      } catch {
        return true;
      }
    })();
    Yus.set(t, r);
    return r;
  }
  var ECr = () => {
    if (typeof File > "u") {
      let {
        process: e
      } = globalThis;
      let t = typeof e?.versions?.node === "string" && parseInt(e.versions.node.split(".")) < 20;
      throw Error("`File` is not defined as a global, which is required for file uploads." + (t ? " Update to Node 20 LTS or newer, or set `globalThis.File` to `import('node:buffer').File`." : ""));
    }
  };
  var vCr = e => e != null && typeof e === "object" && typeof e[Symbol.asyncIterator] === "function";
  var PZe = async (e, t, n = true) => ({
    ...e,
    body: await $ru(e.body, t, n)
  });
  var Yus;
  var $ru = async (e, t, n = true) => {
    if (!(await Bru(t))) {
      throw TypeError("The provided fetch function does not support file uploads with the current global FormData class.");
    }
    let r = new FormData();
    await Promise.all(Object.entries(e || {}).map(([o, s]) => TCr(r, o, s, n)));
    return r;
  };
  var Hru = e => e instanceof Blob && "name" in e;
  var TCr = async (e, t, n, r) => {
    if (n === undefined) {
      return;
    }
    if (n == null) {
      throw TypeError(`Received null for "${t}"; to pass null in FormData, you must use the string 'null'`);
    }
    if (typeof n === "string" || typeof n === "number" || typeof n === "boolean") {
      e.append(t, String(n));
    } else if (n instanceof Response) {
      let o = {};
      let s = n.headers.get("Content-Type");
      if (s) {
        o = {
          type: s
        };
      }
      e.append(t, A$e([await n.blob()], L0t(n, r), o));
    } else if (vCr(n)) {
      e.append(t, A$e([await new Response(tcn(n)).blob()], L0t(n, r)));
    } else if (Hru(n)) {
      e.append(t, A$e([n], L0t(n, r), {
        type: n.type
      }));
    } else if (Array.isArray(n)) {
      await Promise.all(n.map(o => TCr(e, t + "[]", o, r)));
    } else if (typeof n === "object") {
      await Promise.all(Object.entries(n).map(([o, s]) => TCr(e, `${t}[${o}]`, s, r)));
    } else {
      throw TypeError(`Invalid value given to form, expected a string, number, boolean, object, Array, File or Blob but got ${n} instead`);
    }
  };
  var OZe = __lazy(() => {
    Yus = new WeakMap();
  });
  async function ycn(e, t, n) {
    if (ECr(), e = await e, t || (t = L0t(e, true)), jru(e)) {
      if (e instanceof File && t == null && n == null) {
        return e;
      }
      return A$e([await e.arrayBuffer()], t ?? e.name, {
        type: e.type,
        lastModified: e.lastModified,
        ...n
      });
    }
    if (qru(e)) {
      let o = await e.blob();
      t || (t = new URL(e.url).pathname.split(/[\\/]/).pop());
      return A$e(await wCr(o), t, n);
    }
    let r = await wCr(e);
    if (!n?.type) {
      let o = r.find(s => typeof s === "object" && "type" in s && s.type);
      if (typeof o === "string") {
        n = {
          ...n,
          type: o
        };
      }
    }
    return A$e(r, t, n);
  }
  async function wCr(e) {
    let t = [];
    if (typeof e === "string" || ArrayBuffer.isView(e) || e instanceof ArrayBuffer) {
      t.push(e);
    } else if (Jus(e)) {
      t.push(e instanceof Blob ? e : await e.arrayBuffer());
    } else if (vCr(e)) {
      for await (let n of e) {
        t.push(...(await wCr(n)));
      }
    } else {
      let n = e?.constructor?.name;
      throw Error(`Unexpected data type: ${typeof e}${n ? `; constructor: ${n}` : ""}${Wru(e)}`);
    }
    return t;
  }
  function Wru(e) {
    if (typeof e !== "object" || e === null) {
      return "";
    }
    return `; props: [${Object.getOwnPropertyNames(e).map(n => `"${n}"`).join(", ")}]`;
  }
  var Jus = e => e != null && typeof e === "object" && typeof e.size === "number" && typeof e.type === "string" && typeof e.text === "function" && typeof e.slice === "function" && typeof e.arrayBuffer === "function";
  var jru = e => e != null && typeof e === "object" && typeof e.name === "string" && typeof e.lastModified === "number" && Jus(e);
  var qru = e => e != null && typeof e === "object" && typeof e.url === "string" && typeof e.blob === "function";
  var Xus = __lazy(() => {
    OZe();
    OZe();
  });
  var CCr = __lazy(() => {
    Xus();
  });
  var Qus = () => {};
  class Cp {
    constructor(e) {
      this._client = e;
    }
  }
  function* Vru(e) {
    if (!e) {
      return;
    }
    if (Zus in e) {
      let {
        values: r,
        nulls: o
      } = e;
      yield* r.entries();
      for (let s of o) {
        yield [s, null];
      }
      return;
    }
    let t = false;
    let n;
    if (e instanceof Headers) {
      n = e.entries();
    } else if (sCr(e)) {
      n = e;
    } else {
      t = true;
      n = Object.entries(e ?? {});
    }
    for (let r of n) {
      let o = r[0];
      if (typeof o !== "string") {
        throw TypeError("expected header name to be a string");
      }
      let s = sCr(r[1]) ? r[1] : [r[1]];
      let i = false;
      for (let a of s) {
        if (a === undefined) {
          continue;
        }
        if (t && !i) {
          i = true;
          yield [o, null];
        }
        yield [o, a];
      }
    }
  }
  var Zus;
  var gs = e => {
    let t = new Headers();
    let n = new Set();
    for (let r of e) {
      let o = new Set();
      for (let [s, i] of Vru(r)) {
        let a = s.toLowerCase();
        if (!o.vZc(a)) {
          t.delete(s);
          o.add(a);
        }
        if (i === null) {
          t.delete(s);
          n.add(a);
        } else {
          t.append(s, i);
          n.delete(a);
        }
      }
    }
    return {
      [Zus]: true,
      values: t,
      nulls: n
    };
  };
  var uC = __lazy(() => {
    Zus = Symbol.for("brand.privateNullableHeaders");
  });
  function tds(e) {
    return e.replace(/[^A-Za-z0-9\-._~!$&'()*+,;=:@]+/g, encodeURIComponent);
  }
  var eds;
  var zru = (e = tds) => function (n, ...r) {
    if (n.length === 1) {
      return n[0];
    }
    let o = false;
    let s = [];
    let i = n.reduce((u, d, p) => {
      if (/[?#]/.test(d)) {
        o = true;
      }
      let m = r[p];
      let f = (o ? encodeURIComponent : e)("" + m);
      if (p !== r.length && (m == null || typeof m === "object" && m.toString === Object.getPrototypeOf(Object.getPrototypeOf(m.hasOwnProperty ?? eds) ?? eds)?.toString)) {
        f = m + "";
        s.push({
          start: u.length + d.length,
          length: f.length,
          error: `Value of type ${Object.prototype.toString.call(m).slice(8, -1)} is not a valid path parameter`
        });
      }
      return u + d + (p === r.length ? "" : f);
    }, "");
    let a = i.split(/[?#]/, 1)[0];
    let l = /(?<=^|\/)(?:\.|%2e){1,2}(?=\/|$)/gi;
    let c;
    while ((c = l.exec(a)) !== null) {
      s.push({
        start: c.index,
        length: c[0].length,
        error: `Value "${c[0]}" can't be safely passed as a path parameter`
      });
    }
    if (s.sort((u, d) => u.start - d.start), s.length > 0) {
      let u = 0;
      let d = s.reduce((p, m) => {
        let f = " ".repeat(m.start - u);
        let h = "^".repeat(m.length);
        u = m.start + m.length;
        return p + f + h;
      }, "");
      throw new mi(`Path parameters result in path with invalid segments:
${s.map(p => p.error).join(`
`)}
${i}
${d}`);
    }
    return i;
  };
  var Ta;
  var IP = __lazy(() => {
    cI();
    eds = Object.freeze(Object.create(null));
    Ta = zru(tds);
  });
  var F0t;
  var RCr = __lazy(() => {
    NA();
    uC();
    IP();
    F0t = class F0t extends Cp {
      create(e, t) {
        let {
          betas: n,
          ...r
        } = e;
        return this._client.post("/v1/environments?beta=true", {
          body: r,
          ...t,
          headers: gs([{
            "anthropic-beta": [...(n ?? []), "managed-agents-2026-04-01"].toString()
          }, t?.headers])
        });
      }
      retrieve(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.get(Ta`/v1/environments/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      update(e, t, n) {
        let {
          betas: r,
          ...o
        } = t;
        return this._client.post(Ta`/v1/environments/${e}?beta=true`, {
          body: o,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      list(e = {}, t) {
        let {
          betas: n,
          ...r
        } = e ?? {};
        return this._client.getAPIList("/v1/environments?beta=true", KS, {
          query: r,
          ...t,
          headers: gs([{
            "anthropic-beta": [...(n ?? []), "managed-agents-2026-04-01"].toString()
          }, t?.headers])
        });
      }
      delete(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.delete(Ta`/v1/environments/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      archive(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.post(Ta`/v1/environments/${e}/archive?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
    };
  });
  function _cn(e) {
    return typeof e === "object" && e !== null && U0t in e;
  }
  function xCr(e, t) {
    let n = new Set();
    if (e) {
      for (let r of e) {
        if (_cn(r)) {
          n.add(r[U0t]);
        }
      }
    }
    if (t) {
      for (let r of t) {
        if (_cn(r)) {
          n.add(r[U0t]);
        }
        if (Array.isArray(r.content)) {
          for (let o of r.content) {
            if (_cn(o)) {
              n.add(o[U0t]);
            }
          }
        }
      }
    }
    return Array.from(n);
  }
  function bcn(e, t) {
    let n = xCr(e, t);
    if (n.length === 0) {
      return {};
    }
    return {
      "x-stainless-helper": n.join(", ")
    };
  }
  function nds(e) {
    if (_cn(e)) {
      return {
        "x-stainless-helper": e[U0t]
      };
    }
    return {};
  }
  var U0t;
  var B0t = __lazy(() => {
    U0t = Symbol("anthropic.sdk.stainlessHelper");
  });
  var $0t;
  var kCr = __lazy(() => {
    NA();
    uC();
    B0t();
    OZe();
    IP();
    $0t = class $0t extends Cp {
      list(e = {}, t) {
        let {
          betas: n,
          ...r
        } = e ?? {};
        return this._client.getAPIList("/v1/files?beta=true", ute, {
          query: r,
          ...t,
          headers: gs([{
            "anthropic-beta": [...(n ?? []), "files-api-2025-04-14"].toString()
          }, t?.headers])
        });
      }
      delete(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.delete(Ta`/v1/files/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "files-api-2025-04-14"].toString()
          }, n?.headers])
        });
      }
      download(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.get(Ta`/v1/files/${e}/content?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "files-api-2025-04-14"].toString(),
            Accept: "application/binary"
          }, n?.headers]),
          __binaryResponse: true
        });
      }
      retrieveMetadata(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.get(Ta`/v1/files/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "files-api-2025-04-14"].toString()
          }, n?.headers])
        });
      }
      upload(e, t) {
        let {
          betas: n,
          ...r
        } = e;
        return this._client.post("/v1/files?beta=true", PZe({
          body: r,
          ...t,
          headers: gs([{
            "anthropic-beta": [...(n ?? []), "files-api-2025-04-14"].toString()
          }, nds(r.file), t?.headers])
        }, this._client));
      }
    };
  });
  var H0t;
  var ACr = __lazy(() => {
    NA();
    uC();
    IP();
    H0t = class H0t extends Cp {
      retrieve(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.get(Ta`/v1/models/${e}?beta=true`, {
          ...n,
          headers: gs([{
            ...(r?.toString() != null ? {
              "anthropic-beta": r?.toString()
            } : undefined)
          }, n?.headers])
        });
      }
      list(e = {}, t) {
        let {
          betas: n,
          ...r
        } = e ?? {};
        return this._client.getAPIList("/v1/models?beta=true", ute, {
          query: r,
          ...t,
          headers: gs([{
            ...(n?.toString() != null ? {
              "anthropic-beta": n?.toString()
            } : undefined)
          }, t?.headers])
        });
      }
    };
  });
  var j0t;
  var ICr = __lazy(() => {
    NA();
    uC();
    IP();
    j0t = class j0t extends Cp {
      create(e, t) {
        let {
          betas: n,
          ...r
        } = e;
        return this._client.post("/v1/user_profiles?beta=true", {
          body: r,
          ...t,
          headers: gs([{
            "anthropic-beta": [...(n ?? []), "user-profiles-2026-03-24"].toString()
          }, t?.headers])
        });
      }
      retrieve(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.get(Ta`/v1/user_profiles/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "user-profiles-2026-03-24"].toString()
          }, n?.headers])
        });
      }
      update(e, t, n) {
        let {
          betas: r,
          ...o
        } = t;
        return this._client.post(Ta`/v1/user_profiles/${e}?beta=true`, {
          body: o,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "user-profiles-2026-03-24"].toString()
          }, n?.headers])
        });
      }
      list(e = {}, t) {
        let {
          betas: n,
          ...r
        } = e ?? {};
        return this._client.getAPIList("/v1/user_profiles?beta=true", KS, {
          query: r,
          ...t,
          headers: gs([{
            "anthropic-beta": [...(n ?? []), "user-profiles-2026-03-24"].toString()
          }, t?.headers])
        });
      }
      createEnrollmentURL(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.post(Ta`/v1/user_profiles/${e}/enrollment_url?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "user-profiles-2026-03-24"].toString()
          }, n?.headers])
        });
      }
    };
  });
  var q0t;
  var PCr = __lazy(() => {
    NA();
    uC();
    IP();
    q0t = class q0t extends Cp {
      list(e, t = {}, n) {
        let {
          betas: r,
          ...o
        } = t ?? {};
        return this._client.getAPIList(Ta`/v1/agents/${e}/versions?beta=true`, KS, {
          query: o,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
    };
  });
  var DZe;
  var OCr = __lazy(() => {
    PCr();
    PCr();
    NA();
    uC();
    IP();
    DZe = class DZe extends Cp {
      constructor() {
        super(...arguments);
        this.versions = new q0t(this._client);
      }
      create(e, t) {
        let {
          betas: n,
          ...r
        } = e;
        return this._client.post("/v1/agents?beta=true", {
          body: r,
          ...t,
          headers: gs([{
            "anthropic-beta": [...(n ?? []), "managed-agents-2026-04-01"].toString()
          }, t?.headers])
        });
      }
      retrieve(e, t = {}, n) {
        let {
          betas: r,
          ...o
        } = t ?? {};
        return this._client.get(Ta`/v1/agents/${e}?beta=true`, {
          query: o,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      update(e, t, n) {
        let {
          betas: r,
          ...o
        } = t;
        return this._client.post(Ta`/v1/agents/${e}?beta=true`, {
          body: o,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      list(e = {}, t) {
        let {
          betas: n,
          ...r
        } = e ?? {};
        return this._client.getAPIList("/v1/agents?beta=true", KS, {
          query: r,
          ...t,
          headers: gs([{
            "anthropic-beta": [...(n ?? []), "managed-agents-2026-04-01"].toString()
          }, t?.headers])
        });
      }
      archive(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.post(Ta`/v1/agents/${e}/archive?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
    };
    DZe.Versions = q0t;
  });
  var W0t;
  var DCr = __lazy(() => {
    NA();
    uC();
    IP();
    W0t = class W0t extends Cp {
      create(e, t, n) {
        let {
          view: r,
          betas: o,
          ...s
        } = t;
        return this._client.post(Ta`/v1/memory_stores/${e}/memories?beta=true`, {
          query: {
            view: r
          },
          body: s,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(o ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      retrieve(e, t, n) {
        let {
          memory_store_id: r,
          betas: o,
          ...s
        } = t;
        return this._client.get(Ta`/v1/memory_stores/${r}/memories/${e}?beta=true`, {
          query: s,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(o ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      update(e, t, n) {
        let {
          memory_store_id: r,
          view: o,
          betas: s,
          ...i
        } = t;
        return this._client.post(Ta`/v1/memory_stores/${r}/memories/${e}?beta=true`, {
          query: {
            view: o
          },
          body: i,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(s ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      list(e, t = {}, n) {
        let {
          betas: r,
          ...o
        } = t ?? {};
        return this._client.getAPIList(Ta`/v1/memory_stores/${e}/memories?beta=true`, KS, {
          query: o,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      delete(e, t, n) {
        let {
          memory_store_id: r,
          expected_content_sha256: o,
          betas: s
        } = t;
        return this._client.delete(Ta`/v1/memory_stores/${r}/memories/${e}?beta=true`, {
          query: {
            expected_content_sha256: o
          },
          ...n,
          headers: gs([{
            "anthropic-beta": [...(s ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
    };
  });
  var G0t;
  var MCr = __lazy(() => {
    NA();
    uC();
    IP();
    G0t = class G0t extends Cp {
      retrieve(e, t, n) {
        let {
          memory_store_id: r,
          betas: o,
          ...s
        } = t;
        return this._client.get(Ta`/v1/memory_stores/${r}/memory_versions/${e}?beta=true`, {
          query: s,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(o ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      list(e, t = {}, n) {
        let {
          betas: r,
          ...o
        } = t ?? {};
        return this._client.getAPIList(Ta`/v1/memory_stores/${e}/memory_versions?beta=true`, KS, {
          query: o,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      redact(e, t, n) {
        let {
          memory_store_id: r,
          betas: o
        } = t;
        return this._client.post(Ta`/v1/memory_stores/${r}/memory_versions/${e}/redact?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(o ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
    };
  });
  var I$e;
  var NCr = __lazy(() => {
    DCr();
    DCr();
    MCr();
    MCr();
    NA();
    uC();
    IP();
    I$e = class I$e extends Cp {
      constructor() {
        super(...arguments);
        this.memories = new W0t(this._client);
        this.memoryVersions = new G0t(this._client);
      }
      create(e, t) {
        let {
          betas: n,
          ...r
        } = e;
        return this._client.post("/v1/memory_stores?beta=true", {
          body: r,
          ...t,
          headers: gs([{
            "anthropic-beta": [...(n ?? []), "managed-agents-2026-04-01"].toString()
          }, t?.headers])
        });
      }
      retrieve(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.get(Ta`/v1/memory_stores/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      update(e, t, n) {
        let {
          betas: r,
          ...o
        } = t;
        return this._client.post(Ta`/v1/memory_stores/${e}?beta=true`, {
          body: o,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      list(e = {}, t) {
        let {
          betas: n,
          ...r
        } = e ?? {};
        return this._client.getAPIList("/v1/memory_stores?beta=true", KS, {
          query: r,
          ...t,
          headers: gs([{
            "anthropic-beta": [...(n ?? []), "managed-agents-2026-04-01"].toString()
          }, t?.headers])
        });
      }
      delete(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.delete(Ta`/v1/memory_stores/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      archive(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.post(Ta`/v1/memory_stores/${e}/archive?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
    };
    I$e.Memories = W0t;
    I$e.MemoryVersions = G0t;
  });
  var Uge = __lazy(() => {
    cI();
  });
  var MZe;
  var LCr = __lazy(() => {
    cI();
    gCr();
    MZe = class MZe {
      constructor(e, t) {
        this.iterator = e;
        this.controller = t;
      }
      async *decoder() {
        let e = new hxe();
        for await (let t of this.iterator) {
          for (let n of e.oC(t)) {
            yield JSON.parse(n);
          }
        }
        for (let t of e.flush()) {
          yield JSON.parse(t);
        }
      }
      [Symbol.asyncIterator]() {
        return this.decoder();
      }
      static fromResponse(e, t) {
        if (!e.body) {
          if (t.abort(), typeof globalThis.navigator < "u" && globalThis.navigator.product === "ReactNative") {
            throw new mi("The default react-native fetch implementation does not support streaming. Please use expo/fetch: https://docs.expo.dev/versions/latest/sdk/expo/#expofetch-api");
          }
          throw new mi("Attempted to iterate over a response with no body");
        }
        return new MZe(A0t(e.body), t);
      }
    };
  });
  var V0t;
  var FCr = __lazy(() => {
    NA();
    uC();
    LCr();
    Uge();
    IP();
    V0t = class V0t extends Cp {
      create(e, t) {
        let {
          betas: n,
          ...r
        } = e;
        return this._client.post("/v1/messages/batches?beta=true", {
          body: r,
          ...t,
          headers: gs([{
            "anthropic-beta": [...(n ?? []), "message-batches-2024-09-24"].toString()
          }, t?.headers])
        });
      }
      retrieve(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.get(Ta`/v1/messages/batches/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "message-batches-2024-09-24"].toString()
          }, n?.headers])
        });
      }
      list(e = {}, t) {
        let {
          betas: n,
          ...r
        } = e ?? {};
        return this._client.getAPIList("/v1/messages/batches?beta=true", ute, {
          query: r,
          ...t,
          headers: gs([{
            "anthropic-beta": [...(n ?? []), "message-batches-2024-09-24"].toString()
          }, t?.headers])
        });
      }
      delete(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.delete(Ta`/v1/messages/batches/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "message-batches-2024-09-24"].toString()
          }, n?.headers])
        });
      }
      cancel(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.post(Ta`/v1/messages/batches/${e}/cancel?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "message-batches-2024-09-24"].toString()
          }, n?.headers])
        });
      }
      async results(e, t = {}, n) {
        let r = await this.retrieve(e);
        if (!r.results_url) {
          throw new mi(`No batch \`results_url\`; Has it finished processing? ${r.processing_status} - ${r.id}`);
        }
        let {
          betas: o
        } = t ?? {};
        return this._client.get(r.results_url, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(o ?? []), "message-batches-2024-09-24"].toString(),
            Accept: "application/binary"
          }, n?.headers]),
          stream: true,
          __binaryResponse: true
        })._thenUnwrap((s, i) => MZe.fromResponse(i.response, i.controller));
      }
    };
  });
  var Scn;
  var UCr = __lazy(() => {
    Scn = {
      "claude-opus-4-20250514": 8192,
      "claude-opus-4-0": 8192,
      "claude-4-opus-20250514": 8192,
      "anthropic.claude-opus-4-20250514-v1:0": 8192,
      "claude-opus-4@20250514": 8192,
      "claude-opus-4-1-20250805": 8192,
      "anthropic.claude-opus-4-1-20250805-v1:0": 8192,
      "claude-opus-4-1@20250805": 8192
    };
  });
  function rds(e) {
    return e?.output_format ?? e?.output_config?.format;
  }
  function BCr(e, t, n) {
    let r = rds(t);
    if (!t || !("parse" in (r ?? {}))) {
      return {
        ...e,
        content: e.content.map(o => {
          if (o.type === "text") {
            let s = Object.defineProperty({
              ...o
            }, "parsed_output", {
              value: null,
              enumerable: false
            });
            return Object.defineProperty(s, "parsed", {
              get() {
                n.logger.warn("The `parsed` property on `text` blocks is deprecated, please use `parsed_output` instead.");
                return null;
              },
              enumerable: false
            });
          }
          return o;
        }),
        parsed_output: null
      };
    }
    return $Cr(e, t, n);
  }
  function $Cr(e, t, n) {
    let r = null;
    let o = e.content.map(s => {
      if (s.type === "text") {
        let i = oou(t, s.text);
        if (r === null) {
          r = i;
        }
        let a = Object.defineProperty({
          ...s
        }, "parsed_output", {
          value: i,
          enumerable: false
        });
        return Object.defineProperty(a, "parsed", {
          get() {
            n.logger.warn("The `parsed` property on `text` blocks is deprecated, please use `parsed_output` instead.");
            return i;
          },
          enumerable: false
        });
      }
      return s;
    });
    return {
      ...e,
      content: o,
      parsed_output: r
    };
  }
  function oou(e, t) {
    let n = rds(e);
    if (n?.type !== "json_schema") {
      return null;
    }
    try {
      if ("parse" in n) {
        return n.parse(t);
      }
      return JSON.parse(t);
    } catch (r) {
      throw new mi(`Failed to parse structured output: ${r}`);
    }
  }
  var HCr = __lazy(() => {
    cI();
  });
  var sou = e => {
    let t = 0;
    let n = [];
    while (t < e.length) {
      let r = e[t];
      if (r === "\\") {
        t++;
        continue;
      }
      if (r === "{") {
        n.push({
          type: "brace",
          value: "{"
        });
        t++;
        continue;
      }
      if (r === "}") {
        n.push({
          type: "brace",
          value: "}"
        });
        t++;
        continue;
      }
      if (r === "[") {
        n.push({
          type: "paren",
          value: "["
        });
        t++;
        continue;
      }
      if (r === "]") {
        n.push({
          type: "paren",
          value: "]"
        });
        t++;
        continue;
      }
      if (r === ":") {
        n.push({
          type: "separator",
          value: ":"
        });
        t++;
        continue;
      }
      if (r === ",") {
        n.push({
          type: "delimiter",
          value: ","
        });
        t++;
        continue;
      }
      if (r === '"') {
        let a = "";
        let l = false;
        r = e[++t];
        while (r !== '"') {
          if (t === e.length) {
            l = true;
            break;
          }
          if (r === "\\") {
            if (t++, t === e.length) {
              l = true;
              break;
            }
            a += r + e[t];
            r = e[++t];
          } else {
            a += r;
            r = e[++t];
          }
        }
        if (r = e[++t], !l) {
          n.push({
            type: "string",
            value: a
          });
        }
        continue;
      }
      if (r && /\s/.test(r)) {
        t++;
        continue;
      }
      let s = /[0-9]/;
      if (r && s.test(r) || r === "-" || r === ".") {
        let a = "";
        if (r === "-") {
          a += r;
          r = e[++t];
        }
        while (r && s.test(r) || r === ".") {
          a += r;
          r = e[++t];
        }
        n.push({
          type: "number",
          value: a
        });
        continue;
      }
      let i = /[a-z]/i;
      if (r && i.test(r)) {
        let a = "";
        while (r && i.test(r)) {
          if (t === e.length) {
            break;
          }
          a += r;
          r = e[++t];
        }
        if (a == "true" || a == "false" || a === "null") {
          n.push({
            type: "name",
            value: a
          });
        } else {
          t++;
          continue;
        }
        continue;
      }
      t++;
    }
    return n;
  };
  var NZe = e => {
    if (e.length === 0) {
      return e;
    }
    let t = e[e.length - 1];
    switch (t.type) {
      case "separator":
        e = e.slice(0, e.length - 1);
        return NZe(e);
        break;
      case "number":
        let n = t.value[t.value.length - 1];
        if (n === "." || n === "-") {
          e = e.slice(0, e.length - 1);
          return NZe(e);
        }
      case "string":
        let r = e[e.length - 2];
        if (r?.type === "delimiter") {
          e = e.slice(0, e.length - 1);
          return NZe(e);
        } else if (r?.type === "brace" && r.value === "{") {
          e = e.slice(0, e.length - 1);
          return NZe(e);
        }
        break;
      case "delimiter":
        e = e.slice(0, e.length - 1);
        return NZe(e);
        break;
    }
    return e;
  };
  var iou = e => {
    let t = [];
    if (e.map(n => {
      if (n.type === "brace") {
        if (n.value === "{") {
          t.push("}");
        } else {
          t.splice(t.lastIndexOf("}"), 1);
        }
      }
      if (n.type === "paren") {
        if (n.value === "[") {
          t.push("]");
        } else {
          t.splice(t.lastIndexOf("]"), 1);
        }
      }
    }), t.length > 0) {
      t.reverse().map(n => {
        if (n === "}") {
          e.push({
            type: "brace",
            value: "}"
          });
        } else if (n === "]") {
          e.push({
            type: "paren",
            value: "]"
          });
        }
      });
    }
    return e;
  };
  var aou = e => {
    let t = "";
    e.map(n => {
      switch (n.type) {
        case "string":
          t += '"' + n.value + '"';
          break;
        default:
          t += n.value;
          break;
      }
    });
    return t;
  };
  var Tcn = e => JSON.parse(aou(iou(NZe(sou(e)))));
  var jCr = () => {};
  var Ecn = __lazy(() => {
    yCr();
  });
  function ads(e) {
    return e.type === "tool_use" || e.type === "server_tool_use" || e.type === "mcp_tool_use";
  }
  function lds(e) {}
  var A7;
  var gxe;
  var LZe;
  var z0t;
  var vcn;
  var K0t;
  var Y0t;
  var wcn;
  var J0t;
  var Bge;
  var X0t;
  var Ccn;
  var Rcn;
  var P$e;
  var xcn;
  var kcn;
  var Q0t;
  var qCr;
  var ods;
  var Acn;
  var WCr;
  var GCr;
  var VCr;
  var sds;
  var Z0t;
  var cds = __lazy(() => {
    Mge();
    jCr();
    Uge();
    Ecn();
    HCr();
    Z0t = class Z0t {
      constructor(e, t) {
        A7.add(this);
        this.messages = [];
        this.receivedMessages = [];
        gxe.set(this, undefined);
        LZe.set(this, null);
        this.controller = new AbortController();
        z0t.set(this, undefined);
        vcn.set(this, () => {});
        K0t.set(this, () => {});
        Y0t.set(this, undefined);
        wcn.set(this, () => {});
        J0t.set(this, () => {});
        Bge.set(this, {});
        X0t.set(this, false);
        Ccn.set(this, false);
        Rcn.set(this, false);
        P$e.set(this, false);
        xcn.set(this, undefined);
        kcn.set(this, undefined);
        Q0t.set(this, undefined);
        Acn.set(this, n => {
          if (Oa(this, Ccn, true, "f"), Nge(n)) {
            n = new _f();
          }
          if (n instanceof _f) {
            Oa(this, Rcn, true, "f");
            return this._emit("abort", n);
          }
          if (n instanceof mi) {
            return this._emit("error", n);
          }
          if (n instanceof Error) {
            let r = new mi(n.message);
            r.cause = n;
            return this._emit("error", r);
          }
          return this._emit("error", new mi(String(n)));
        });
        Oa(this, z0t, new Promise((n, r) => {
          Oa(this, vcn, n, "f");
          Oa(this, K0t, r, "f");
        }), "f");
        Oa(this, Y0t, new Promise((n, r) => {
          Oa(this, wcn, n, "f");
          Oa(this, J0t, r, "f");
        }), "f");
        to(this, z0t, "f").catch(() => {});
        to(this, Y0t, "f").catch(() => {});
        Oa(this, LZe, e, "f");
        Oa(this, Q0t, t?.logger ?? console, "f");
      }
      get response() {
        return to(this, xcn, "f");
      }
      get request_id() {
        return to(this, kcn, "f");
      }
      async withResponse() {
        Oa(this, P$e, true, "f");
        let e = await to(this, z0t, "f");
        if (!e) {
          throw Error("Could not resolve a `Response` object");
        }
        return {
          data: this,
          response: e,
          request_id: e.headers.get("request-id")
        };
      }
      static fromReadableStream(e) {
        let t = new Z0t(null);
        t._run(() => t._fromReadableStream(e));
        return t;
      }
      static createMessage(e, t, n, {
        logger: r
      } = {}) {
        let o = new Z0t(t, {
          logger: r
        });
        for (let s of t.messages) {
          o._addMessageParam(s);
        }
        Oa(o, LZe, {
          ...t,
          stream: true
        }, "f");
        o._run(() => o._createMessage(e, {
          ...t,
          stream: true
        }, {
          ...n,
          headers: {
            ...n?.headers,
            "X-Stainless-Helper-Method": "stream"
          }
        }));
        return o;
      }
      _run(e) {
        e().then(() => {
          this._emitFinal();
          this._emit("end");
        }, to(this, Acn, "f"));
      }
      _addMessageParam(e) {
        this.messages.push(e);
      }
      _addMessage(e, t = true) {
        if (this.receivedMessages.push(e), t) {
          this._emit("message", e);
        }
      }
      async _createMessage(e, t, n) {
        let r = n?.signal;
        let o;
        if (r) {
          if (r.aborted) {
            this.controller.abort();
          }
          o = this.controller.abort.bind(this.controller);
          r.addEventListener("abort", o);
        }
        try {
          to(this, A7, "m", WCr).call(this);
          let {
            response: s,
            data: i
          } = await e.create({
            ...t,
            stream: true
          }, {
            ...n,
            signal: this.controller.signal
          }).withResponse();
          this._connected(s);
          for await (let a of i) {
            to(this, A7, "m", GCr).call(this, a);
          }
          if (i.controller.signal?.aborted) {
            throw new _f();
          }
          to(this, A7, "m", VCr).call(this);
        } finally {
          if (r && o) {
            r.removeEventListener("abort", o);
          }
        }
      }
      _connected(e) {
        if (this.ended) {
          return;
        }
        Oa(this, xcn, e, "f");
        Oa(this, kcn, e?.headers.get("request-id"), "f");
        to(this, vcn, "f").call(this, e);
        this._emit("connect");
      }
      get ended() {
        return to(this, X0t, "f");
      }
      get errored() {
        return to(this, Ccn, "f");
      }
      get aborted() {
        return to(this, Rcn, "f");
      }
      abort() {
        this.controller.abort();
      }
      on(e, t) {
        (to(this, Bge, "f")[e] || (to(this, Bge, "f")[e] = [])).push({
          listener: t
        });
        return this;
      }
      off(e, t) {
        let n = to(this, Bge, "f")[e];
        if (!n) {
          return this;
        }
        let r = n.findIndex(o => o.listener === t);
        if (r >= 0) {
          n.splice(r, 1);
        }
        return this;
      }
      once(e, t) {
        (to(this, Bge, "f")[e] || (to(this, Bge, "f")[e] = [])).push({
          listener: t,
          once: true
        });
        return this;
      }
      emitted(e) {
        return new Promise((t, n) => {
          if (Oa(this, P$e, true, "f"), e !== "error") {
            this.once("error", n);
          }
          this.once(e, t);
        });
      }
      async done() {
        Oa(this, P$e, true, "f");
        await to(this, Y0t, "f");
      }
      get currentMessage() {
        return to(this, gxe, "f");
      }
      async finalMessage() {
        await this.done();
        return to(this, A7, "m", qCr).call(this);
      }
      async finalText() {
        await this.done();
        return to(this, A7, "m", ods).call(this);
      }
      _emit(e, ...t) {
        if (to(this, X0t, "f")) {
          return;
        }
        if (e === "end") {
          Oa(this, X0t, true, "f");
          to(this, wcn, "f").call(this);
        }
        let n = to(this, Bge, "f")[e];
        if (n) {
          to(this, Bge, "f")[e] = n.filter(r => !r.once);
          n.forEach(({
            listener: r
          }) => r(...t));
        }
        if (e === "abort") {
          let r = t[0];
          if (!to(this, P$e, "f") && !n?.length) {
            Promise.reject(r);
          }
          to(this, K0t, "f").call(this, r);
          to(this, J0t, "f").call(this, r);
          this._emit("end");
          return;
        }
        if (e === "error") {
          let r = t[0];
          if (!to(this, P$e, "f") && !n?.length) {
            Promise.reject(r);
          }
          to(this, K0t, "f").call(this, r);
          to(this, J0t, "f").call(this, r);
          this._emit("end");
        }
      }
      _emitFinal() {
        if (this.receivedMessages.at(-1)) {
          this._emit("finalMessage", to(this, A7, "m", qCr).call(this));
        }
      }
      async _fromReadableStream(e, t) {
        let n = t?.signal;
        let r;
        if (n) {
          if (n.aborted) {
            this.controller.abort();
          }
          r = this.controller.abort.bind(this.controller);
          n.addEventListener("abort", r);
        }
        try {
          to(this, A7, "m", WCr).call(this);
          this._connected(null);
          let o = cj.fromReadableStream(e, this.controller);
          for await (let s of o) {
            to(this, A7, "m", GCr).call(this, s);
          }
          if (o.controller.signal?.aborted) {
            throw new _f();
          }
          to(this, A7, "m", VCr).call(this);
        } finally {
          if (n && r) {
            n.removeEventListener("abort", r);
          }
        }
      }
      [(gxe = new WeakMap(), LZe = new WeakMap(), z0t = new WeakMap(), vcn = new WeakMap(), K0t = new WeakMap(), Y0t = new WeakMap(), wcn = new WeakMap(), J0t = new WeakMap(), Bge = new WeakMap(), X0t = new WeakMap(), Ccn = new WeakMap(), Rcn = new WeakMap(), P$e = new WeakMap(), xcn = new WeakMap(), kcn = new WeakMap(), Q0t = new WeakMap(), Acn = new WeakMap(), A7 = new WeakSet(), qCr = function () {
        if (this.receivedMessages.length === 0) {
          throw new mi("stream ended without producing a Message with role=assistant");
        }
        return this.receivedMessages.at(-1);
      }, ods = function () {
        if (this.receivedMessages.length === 0) {
          throw new mi("stream ended without producing a Message with role=assistant");
        }
        let t = this.receivedMessages.at(-1).content.filter(n => n.type === "text").map(n => n.text);
        if (t.length === 0) {
          throw new mi("stream ended without producing a content block with type=text");
        }
        return t.join(" ");
      }, WCr = function () {
        if (this.ended) {
          return;
        }
        Oa(this, gxe, undefined, "f");
      }, GCr = function (t) {
        if (this.ended) {
          return;
        }
        let n = to(this, A7, "m", sds).call(this, t);
        switch (this._emit("streamEvent", t, n), t.type) {
          case "content_block_delta":
            {
              let r = n.content.at(-1);
              switch (t.delta.type) {
                case "text_delta":
                  {
                    if (r.type === "text") {
                      this._emit("text", t.delta.text, r.text || "");
                    }
                    break;
                  }
                case "citations_delta":
                  {
                    if (r.type === "text") {
                      this._emit("citation", t.delta.citation, r.citations ?? []);
                    }
                    break;
                  }
                case "input_json_delta":
                  {
                    if (ads(r) && r.input) {
                      this._emit("inputJson", t.delta.partial_json, r.input);
                    }
                    break;
                  }
                case "thinking_delta":
                  {
                    if (r.type === "thinking") {
                      this._emit("thinking", t.delta.thinking, r.thinking);
                    }
                    break;
                  }
                case "signature_delta":
                  {
                    if (r.type === "thinking") {
                      this._emit("signature", r.signature);
                    }
                    break;
                  }
                case "compaction_delta":
                  {
                    if (r.type === "compaction" && r.content) {
                      this._emit("compaction", r.content);
                    }
                    break;
                  }
                default:
                  lds(t.delta);
              }
              break;
            }
          case "message_stop":
            {
              this._addMessageParam(n);
              this._addMessage(BCr(n, to(this, LZe, "f"), {
                logger: to(this, Q0t, "f")
              }), true);
              break;
            }
          case "content_block_stop":
            {
              this._emit("contentBlock", n.content.at(-1));
              break;
            }
          case "message_start":
            {
              Oa(this, gxe, n, "f");
              break;
            }
          case "content_block_start":
          case "message_delta":
            break;
        }
      }, VCr = function () {
        if (this.ended) {
          throw new mi("stream has ended, this shouldn't happen");
        }
        let t = to(this, gxe, "f");
        if (!t) {
          throw new mi("request ended without sending any chunks");
        }
        Oa(this, gxe, undefined, "f");
        return BCr(t, to(this, LZe, "f"), {
          logger: to(this, Q0t, "f")
        });
      }, sds = function (t) {
        let n = to(this, gxe, "f");
        if (t.type === "message_start") {
          if (n) {
            throw new mi(`Unexpected event order, got ${t.type} before receiving "message_stop"`);
          }
          return t.message;
        }
        if (!n) {
          throw new mi(`Unexpected event order, got ${t.type} before "message_start"`);
        }
        switch (t.type) {
          case "message_stop":
            return n;
          case "message_delta":
            if (n.container = t.delta.container, n.stop_reason = t.delta.stop_reason, n.stop_sequence = t.delta.stop_sequence, n.usage.output_tokens = t.usage.output_tokens, n.context_management = t.context_management, t.usage.input_tokens != null) {
              n.usage.input_tokens = t.usage.input_tokens;
            }
            if (t.usage.cache_creation_input_tokens != null) {
              n.usage.cache_creation_input_tokens = t.usage.cache_creation_input_tokens;
            }
            if (t.usage.cache_read_input_tokens != null) {
              n.usage.cache_read_input_tokens = t.usage.cache_read_input_tokens;
            }
            if (t.usage.server_tool_use != null) {
              n.usage.server_tool_use = t.usage.server_tool_use;
            }
            if (t.usage.iterations != null) {
              n.usage.iterations = t.usage.iterations;
            }
            return n;
          case "content_block_start":
            n.content.push(t.content_block);
            return n;
          case "content_block_delta":
            {
              let r = n.content.at(t.index);
              switch (t.delta.type) {
                case "text_delta":
                  {
                    if (r?.type === "text") {
                      n.content[t.index] = {
                        ...r,
                        text: (r.text || "") + t.delta.text
                      };
                    }
                    break;
                  }
                case "citations_delta":
                  {
                    if (r?.type === "text") {
                      n.content[t.index] = {
                        ...r,
                        citations: [...(r.citations ?? []), t.delta.citation]
                      };
                    }
                    break;
                  }
                case "input_json_delta":
                  {
                    if (r && ads(r)) {
                      let o = r["__json_buf"] || "";
                      o += t.delta.partial_json;
                      let s = {
                        ...r
                      };
                      if (Object.defineProperty(s, "__json_buf", {
                        value: o,
                        enumerable: false,
                        writable: true
                      }), o) {
                        try {
                          s.input = Tcn(o);
                        } catch (i) {
                          let a = new mi(`Unable to parse tool parameter JSON from model. Please retry your request or adjust your prompt. Error: ${i}. JSON: ${o}`);
                          to(this, Acn, "f").call(this, a);
                        }
                      }
                      n.content[t.index] = s;
                    }
                    break;
                  }
                case "thinking_delta":
                  {
                    if (r?.type === "thinking") {
                      n.content[t.index] = {
                        ...r,
                        thinking: r.thinking + t.delta.thinking
                      };
                    }
                    break;
                  }
                case "signature_delta":
                  {
                    if (r?.type === "thinking") {
                      n.content[t.index] = {
                        ...r,
                        signature: t.delta.signature
                      };
                    }
                    break;
                  }
                case "compaction_delta":
                  {
                    if (r?.type === "compaction") {
                      n.content[t.index] = {
                        ...r,
                        content: (r.content || "") + t.delta.content
                      };
                    }
                    break;
                  }
                default:
                  lds(t.delta);
              }
              return n;
            }
          case "content_block_stop":
            return n;
        }
      }, Symbol.asyncIterator)]() {
        let e = [];
        let t = [];
        let n = false;
        this.on("streamEvent", r => {
          let o = t.shift();
          if (o) {
            o.resolve(r);
          } else {
            e.push(r);
          }
        });
        this.on("end", () => {
          n = true;
          for (let r of t) {
            r.resolve(undefined);
          }
          t.length = 0;
        });
        this.on("abort", r => {
          n = true;
          for (let o of t) {
            o.reject(r);
          }
          t.length = 0;
        });
        this.on("error", r => {
          n = true;
          for (let o of t) {
            o.reject(r);
          }
          t.length = 0;
        });
        return {
          next: async () => {
            if (!e.length) {
              if (n) {
                return {
                  value: undefined,
                  done: true
                };
              }
              return new Promise((o, s) => t.push({
                resolve: o,
                reject: s
              })).then(o => o ? {
                value: o,
                done: false
              } : {
                value: undefined,
                done: true
              });
            }
            return {
              value: e.shift(),
              done: false
            };
          },
          return: async () => (this.abort(), {
            value: undefined,
            done: true
          })
        };
      }
      toReadableStream() {
        return new cj(this[Symbol.asyncIterator].bind(this), this.controller).toReadableStream();
      }
    };
  });
  var FZe;
  var Icn = __lazy(() => {
    FZe = class FZe extends Error {
      constructor(e) {
        let t = typeof e === "string" ? e : e.map(n => {
          if (n.type === "text") {
            return n.text;
          }
          return `[${n.type}]`;
        }).join(" ");
        super(t);
        this.name = "ToolError";
        this.content = e;
      }
    };
  });
  var dds = `You have been working on the task described above but have not yet completed it. Write a continuation summary that will allow you (or another instance of yourself) to resume work efficiently in a future context window where the conversation history will be replaced with this summary. Your summary should be structured, concise, and actionable. Include:
1. Task Overview
The user's core request and success criteria
Any clarifications or constraints they specified
2. Current State
What has been completed so far
Files created, modified, or analyzed (with paths if relevant)
Key outputs or artifacts produced
3. Important Discoveries
Technical constraints or requirements uncovered
Decisions made and their rationale
Errors encountered and how they were resolved
What approaches were tried that didn't work (and why)
4. Next Steps
Specific actions needed to complete the task
Any blockers or open questions to resolve
Priority order if multiple steps remain
5. Context to Preserve
User preferences or style requirements
Domain-specific details that aren't obvious
Any promises made to the user
Be concise but complete\u2014err on the side of including information that would prevent duplicate work or repeated mistakes. Write in a way that enables immediate resumption of the task.
Wrap your summary in <summary></summary> tags.`;
  function mds() {
    let e;
    let t;
    return {
      promise: new Promise((r, o) => {
        e = r;
        t = o;
      }),
      resolve: e,
      reject: t
    };
  }
  async function lou(e, t = e.messages.at(-1), n) {
    if (!t || t.role !== "assistant" || !t.content || typeof t.content === "string") {
      return null;
    }
    let r = t.content.filter(s => s.type === "tool_use");
    if (r.length === 0) {
      return null;
    }
    return {
      role: "user",
      content: await Promise.all(r.map(async s => {
        let i = e.tools.find(a => ("name" in a ? a.name : a.mcp_server_name) === s.name);
        if (!i || !("run" in i)) {
          return {
            type: "tool_result",
            tool_use_id: s.id,
            content: `Error: Tool '${s.name}' not found`,
            is_error: true
          };
        }
        try {
          let a = s.input;
          if ("parse" in i && i.parse) {
            a = i.parse(a);
          }
          let l = await i.run(a, {
            toolUseBlock: s,
            signal: n?.signal
          });
          return {
            type: "tool_result",
            tool_use_id: s.id,
            content: l
          };
        } catch (a) {
          return {
            type: "tool_result",
            tool_use_id: s.id,
            content: a instanceof FZe ? a.content : `Error: ${a instanceof Error ? a.message : String(a)}`,
            is_error: true
          };
        }
      }))
    };
  }
  var eIt;
  var UZe;
  var O$e;
  var PD;
  var F4;
  var E6;
  var $ge;
  var yxe;
  var tIt;
  var pds;
  var zCr;
  var nIt;
  var KCr = __lazy(() => {
    Mge();
    Icn();
    cI();
    uC();
    B0t();
    nIt = class nIt {
      constructor(e, t, n) {
        eIt.add(this);
        this.client = e;
        UZe.set(this, false);
        O$e.set(this, false);
        PD.set(this, undefined);
        F4.set(this, undefined);
        E6.set(this, undefined);
        $ge.set(this, undefined);
        yxe.set(this, undefined);
        tIt.set(this, 0);
        Oa(this, PD, {
          params: {
            ...t,
            messages: structuredClone(t.messages)
          }
        }, "f");
        let o = ["BetaToolRunner", ...xCr(t.tools, t.messages)].join(", ");
        if (Oa(this, F4, {
          ...n,
          headers: gs([{
            "x-stainless-helper": o
          }, n?.headers])
        }, "f"), Oa(this, yxe, mds(), "f"), t.compactionControl?.enabled) {
          console.warn('Anthropic: The `compactionControl` parameter is deprecated and will be removed in a future version. Use server-side compaction instead by passing `edits: [{ type: "compact_20260112" }]` in the params passed to `toolRunner()`. See https://platform.claude.com/docs/en/build-with-claude/compaction');
        }
      }
      async *[(UZe = new WeakMap(), O$e = new WeakMap(), PD = new WeakMap(), F4 = new WeakMap(), E6 = new WeakMap(), $ge = new WeakMap(), yxe = new WeakMap(), tIt = new WeakMap(), eIt = new WeakSet(), pds = async function () {
        let t = to(this, PD, "f").params.compactionControl;
        if (!t || !t.enabled) {
          return false;
        }
        let n = 0;
        if (to(this, E6, "f") !== undefined) {
          try {
            let l = await to(this, E6, "f");
            n = l.usage.input_tokens + (l.usage.cache_creation_input_tokens ?? 0) + (l.usage.cache_read_input_tokens ?? 0) + l.usage.output_tokens;
          } catch {
            return false;
          }
        }
        let r = t.contextTokenThreshold ?? 1e5;
        if (n < r) {
          return false;
        }
        let o = t.model ?? to(this, PD, "f").params.model;
        let s = t.summaryPrompt ?? dds;
        let i = to(this, PD, "f").params.messages;
        if (i[i.length - 1].role === "assistant") {
          let l = i[i.length - 1];
          if (Array.isArray(l.content)) {
            let c = l.content.filter(u => u.type !== "tool_use");
            if (c.length === 0) {
              i.pop();
            } else {
              l.content = c;
            }
          }
        }
        let a = await this.client.beta.messages.create({
          model: o,
          messages: [...i, {
            role: "user",
            content: [{
              type: "text",
              text: s
            }]
          }],
          max_tokens: to(this, PD, "f").params.max_tokens
        }, {
          signal: to(this, F4, "f").signal,
          headers: gs([to(this, F4, "f").headers, {
            "x-stainless-helper": "compaction"
          }])
        });
        if (a.content[0]?.type !== "text") {
          throw new mi("Expected text response for compaction");
        }
        to(this, PD, "f").params.messages = [{
          role: "user",
          content: a.content
        }];
        return true;
      }, Symbol.asyncIterator)]() {
        var e;
        if (to(this, UZe, "f")) {
          throw new mi("Cannot iterate over a consumed stream");
        }
        Oa(this, UZe, true, "f");
        Oa(this, O$e, true, "f");
        Oa(this, $ge, undefined, "f");
        try {
          while (true) {
            let t;
            try {
              if (to(this, PD, "f").params.max_iterations && to(this, tIt, "f") >= to(this, PD, "f").params.max_iterations) {
                break;
              }
              Oa(this, O$e, false, "f");
              Oa(this, $ge, undefined, "f");
              Oa(this, tIt, (e = to(this, tIt, "f"), e++, e), "f");
              Oa(this, E6, undefined, "f");
              let {
                max_iterations: n,
                compactionControl: r,
                ...o
              } = to(this, PD, "f").params;
              if (o.stream) {
                t = this.client.beta.messages.stream({
                  ...o
                }, to(this, F4, "f"));
                Oa(this, E6, t.finalMessage(), "f");
                to(this, E6, "f").catch(() => {});
                yield t;
              } else {
                Oa(this, E6, this.client.beta.messages.create({
                  ...o,
                  stream: false
                }, to(this, F4, "f")), "f");
                yield to(this, E6, "f");
              }
              if (!(await to(this, eIt, "m", pds).call(this))) {
                if (!to(this, O$e, "f")) {
                  let {
                    role: a,
                    content: l
                  } = await to(this, E6, "f");
                  to(this, PD, "f").params.messages.push({
                    role: a,
                    content: l
                  });
                }
                let i = await to(this, eIt, "m", zCr).call(this, to(this, PD, "f").params.messages.at(-1));
                if (i) {
                  to(this, PD, "f").params.messages.push(i);
                } else if (!to(this, O$e, "f")) {
                  break;
                }
              }
            } finally {
              if (t) {
                t.abort();
              }
            }
          }
          if (!to(this, E6, "f")) {
            throw new mi("ToolRunner concluded without a message from the server");
          }
          to(this, yxe, "f").resolve(await to(this, E6, "f"));
        } catch (t) {
          throw Oa(this, UZe, false, "f"), to(this, yxe, "f").promise.catch(() => {}), to(this, yxe, "f").reject(t), Oa(this, yxe, mds(), "f"), t;
        }
      }
      setMessagesParams(e) {
        if (typeof e === "function") {
          to(this, PD, "f").params = e(to(this, PD, "f").params);
        } else {
          to(this, PD, "f").params = e;
        }
        Oa(this, O$e, true, "f");
        Oa(this, $ge, undefined, "f");
      }
      setRequestOptions(e) {
        if (typeof e === "function") {
          Oa(this, F4, e(to(this, F4, "f")), "f");
        } else {
          Oa(this, F4, {
            ...to(this, F4, "f"),
            ...e
          }, "f");
        }
      }
      async generateToolResponse(e = to(this, F4, "f").signal) {
        let t = (await to(this, E6, "f")) ?? this.params.messages.at(-1);
        if (!t) {
          return null;
        }
        return to(this, eIt, "m", zCr).call(this, t, e);
      }
      done() {
        return to(this, yxe, "f").promise;
      }
      async runUntilDone() {
        if (!to(this, UZe, "f")) {
          for await (let e of this) {
            ;
          }
        }
        return this.done();
      }
      get params() {
        return to(this, PD, "f").params;
      }
      pushMessages(...e) {
        this.setMessagesParams(t => ({
          ...t,
          messages: [...t.messages, ...e]
        }));
      }
      then(e, t) {
        return this.runUntilDone().then(e, t);
      }
    };
    zCr = async function (t, n = to(this, F4, "f").signal) {
      if (to(this, $ge, "f") !== undefined) {
        return to(this, $ge, "f");
      }
      Oa(this, $ge, lou(to(this, PD, "f").params, t, {
        ...to(this, F4, "f"),
        signal: n
      }), "f");
      return to(this, $ge, "f");
    };
  });
  function hds(e) {
    if (!e.output_format) {
      return e;
    }
    if (e.output_config?.format) {
      throw new mi("Both output_format and output_config.format were provided. Please use only output_config.format (output_format is deprecated).");
    }
    let {
      output_format: t,
      ...n
    } = e;
    return {
      ...n,
      output_config: {
        ...e.output_config,
        format: t
      }
    };
  }
  var fds;
  var cou;
  var _xe;
  var YCr = __lazy(() => {
    Uge();
    FCr();
    UCr();
    uC();
    B0t();
    HCr();
    cds();
    KCr();
    Icn();
    FCr();
    KCr();
    Icn();
    fds = {
      "claude-1.3": "November 6th, 2024",
      "claude-1.3-100k": "November 6th, 2024",
      "claude-instant-1.1": "November 6th, 2024",
      "claude-instant-1.1-100k": "November 6th, 2024",
      "claude-instant-1.2": "November 6th, 2024",
      "claude-3-sonnet-20240229": "July 21st, 2025",
      "claude-3-opus-20240229": "January 5th, 2026",
      "claude-2.1": "July 21st, 2025",
      "claude-2.0": "July 21st, 2025",
      "claude-3-7-sonnet-latest": "February 19th, 2026",
      "claude-3-7-sonnet-20250219": "February 19th, 2026"
    };
    cou = ["claude-mythos-preview", "claude-opus-4-6"];
    _xe = class _xe extends Cp {
      constructor() {
        super(...arguments);
        this.batches = new V0t(this._client);
      }
      create(e, t) {
        let n = hds(e);
        let {
          betas: r,
          ...o
        } = n;
        if (o.model in fds) {
          console.warn(`The model '${o.model}' is deprecated and will reach end-of-life on ${fds[o.model]}
Please migrate to a newer model. Visit https://docs.anthropic.com/en/docs/resources/model-deprecations for more information.`);
        }
        if (cou.includes(o.model) && o.thinking && o.thinking.type === "enabled") {
          console.warn(`Using Claude with ${o.model} and 'thinking.type=enabled' is deprecated. Use 'thinking.type=adaptive' instead which results in better model performance in our testing: https://platform.claude.com/docs/en/build-with-claude/adaptive-thinking`);
        }
        let s = this._client._options.timeout;
        if (!o.stream && s == null) {
          let a = Scn[o.model] ?? undefined;
          s = this._client.calculateNonstreamingTimeout(o.max_tokens, a);
        }
        let i = bcn(o.tools, o.messages);
        return this._client.post("/v1/messages?beta=true", {
          body: o,
          timeout: s ?? 600000,
          ...t,
          headers: gs([{
            ...(r?.toString() != null ? {
              "anthropic-beta": r?.toString()
            } : undefined)
          }, i, t?.headers]),
          stream: n.stream ?? false
        });
      }
      parse(e, t) {
        t = {
          ...t,
          headers: gs([{
            "anthropic-beta": [...(e.betas ?? []), "structured-outputs-2025-12-15"].toString()
          }, t?.headers])
        };
        return this.create(e, t).then(n => $Cr(n, e, {
          logger: this._client.logger ?? console
        }));
      }
      stream(e, t) {
        return Z0t.createMessage(this, e, t);
      }
      countTokens(e, t) {
        let n = hds(e);
        let {
          betas: r,
          ...o
        } = n;
        return this._client.post("/v1/messages/count_tokens?beta=true", {
          body: o,
          ...t,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "token-counting-2024-11-01"].toString()
          }, t?.headers])
        });
      }
      toolRunner(e, t) {
        return new nIt(this._client, e, t);
      }
    };
    _xe.Batches = V0t;
    _xe.BetaToolRunner = nIt;
    _xe.ToolError = FZe;
  });
  var rIt;
  var JCr = __lazy(() => {
    NA();
    uC();
    IP();
    rIt = class rIt extends Cp {
      list(e, t = {}, n) {
        let {
          betas: r,
          ...o
        } = t ?? {};
        return this._client.getAPIList(Ta`/v1/sessions/${e}/events?beta=true`, KS, {
          query: o,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      send(e, t, n) {
        let {
          betas: r,
          ...o
        } = t;
        return this._client.post(Ta`/v1/sessions/${e}/events?beta=true`, {
          body: o,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      stream(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.get(Ta`/v1/sessions/${e}/events/stream?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers]),
          stream: true
        });
      }
    };
  });
  var oIt;
  var XCr = __lazy(() => {
    NA();
    uC();
    IP();
    oIt = class oIt extends Cp {
      retrieve(e, t, n) {
        let {
          session_id: r,
          betas: o
        } = t;
        return this._client.get(Ta`/v1/sessions/${r}/resources/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(o ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      update(e, t, n) {
        let {
          session_id: r,
          betas: o,
          ...s
        } = t;
        return this._client.post(Ta`/v1/sessions/${r}/resources/${e}?beta=true`, {
          body: s,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(o ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      list(e, t = {}, n) {
        let {
          betas: r,
          ...o
        } = t ?? {};
        return this._client.getAPIList(Ta`/v1/sessions/${e}/resources?beta=true`, KS, {
          query: o,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      delete(e, t, n) {
        let {
          session_id: r,
          betas: o
        } = t;
        return this._client.delete(Ta`/v1/sessions/${r}/resources/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(o ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      add(e, t, n) {
        let {
          betas: r,
          ...o
        } = t;
        return this._client.post(Ta`/v1/sessions/${e}/resources?beta=true`, {
          body: o,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
    };
  });
  var D$e;
  var QCr = __lazy(() => {
    JCr();
    JCr();
    XCr();
    XCr();
    NA();
    uC();
    IP();
    D$e = class D$e extends Cp {
      constructor() {
        super(...arguments);
        this.events = new rIt(this._client);
        this.resources = new oIt(this._client);
      }
      create(e, t) {
        let {
          betas: n,
          ...r
        } = e;
        return this._client.post("/v1/sessions?beta=true", {
          body: r,
          ...t,
          headers: gs([{
            "anthropic-beta": [...(n ?? []), "managed-agents-2026-04-01"].toString()
          }, t?.headers])
        });
      }
      retrieve(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.get(Ta`/v1/sessions/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      update(e, t, n) {
        let {
          betas: r,
          ...o
        } = t;
        return this._client.post(Ta`/v1/sessions/${e}?beta=true`, {
          body: o,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      list(e = {}, t) {
        let {
          betas: n,
          ...r
        } = e ?? {};
        return this._client.getAPIList("/v1/sessions?beta=true", KS, {
          query: r,
          ...t,
          headers: gs([{
            "anthropic-beta": [...(n ?? []), "managed-agents-2026-04-01"].toString()
          }, t?.headers])
        });
      }
      delete(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.delete(Ta`/v1/sessions/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      archive(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.post(Ta`/v1/sessions/${e}/archive?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
    };
    D$e.Events = rIt;
    D$e.Resources = oIt;
  });
  var sIt;
  var ZCr = __lazy(() => {
    NA();
    uC();
    OZe();
    IP();
    sIt = class sIt extends Cp {
      create(e, t = {}, n) {
        let {
          betas: r,
          ...o
        } = t ?? {};
        return this._client.post(Ta`/v1/skills/${e}/versions?beta=true`, PZe({
          body: o,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "skills-2025-10-02"].toString()
          }, n?.headers])
        }, this._client));
      }
      retrieve(e, t, n) {
        let {
          skill_id: r,
          betas: o
        } = t;
        return this._client.get(Ta`/v1/skills/${r}/versions/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(o ?? []), "skills-2025-10-02"].toString()
          }, n?.headers])
        });
      }
      list(e, t = {}, n) {
        let {
          betas: r,
          ...o
        } = t ?? {};
        return this._client.getAPIList(Ta`/v1/skills/${e}/versions?beta=true`, KS, {
          query: o,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "skills-2025-10-02"].toString()
          }, n?.headers])
        });
      }
      delete(e, t, n) {
        let {
          skill_id: r,
          betas: o
        } = t;
        return this._client.delete(Ta`/v1/skills/${r}/versions/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(o ?? []), "skills-2025-10-02"].toString()
          }, n?.headers])
        });
      }
    };
  });
  var BZe;
  var eRr = __lazy(() => {
    ZCr();
    ZCr();
    NA();
    uC();
    OZe();
    IP();
    BZe = class BZe extends Cp {
      constructor() {
        super(...arguments);
        this.versions = new sIt(this._client);
      }
      create(e = {}, t) {
        let {
          betas: n,
          ...r
        } = e ?? {};
        return this._client.post("/v1/skills?beta=true", PZe({
          body: r,
          ...t,
          headers: gs([{
            "anthropic-beta": [...(n ?? []), "skills-2025-10-02"].toString()
          }, t?.headers])
        }, this._client, false));
      }
      retrieve(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.get(Ta`/v1/skills/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "skills-2025-10-02"].toString()
          }, n?.headers])
        });
      }
      list(e = {}, t) {
        let {
          betas: n,
          ...r
        } = e ?? {};
        return this._client.getAPIList("/v1/skills?beta=true", KS, {
          query: r,
          ...t,
          headers: gs([{
            "anthropic-beta": [...(n ?? []), "skills-2025-10-02"].toString()
          }, t?.headers])
        });
      }
      delete(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.delete(Ta`/v1/skills/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "skills-2025-10-02"].toString()
          }, n?.headers])
        });
      }
    };
    BZe.Versions = sIt;
  });
  var iIt;
  var tRr = __lazy(() => {
    NA();
    uC();
    IP();
    iIt = class iIt extends Cp {
      create(e, t, n) {
        let {
          betas: r,
          ...o
        } = t;
        return this._client.post(Ta`/v1/vaults/${e}/credentials?beta=true`, {
          body: o,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      retrieve(e, t, n) {
        let {
          vault_id: r,
          betas: o
        } = t;
        return this._client.get(Ta`/v1/vaults/${r}/credentials/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(o ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      update(e, t, n) {
        let {
          vault_id: r,
          betas: o,
          ...s
        } = t;
        return this._client.post(Ta`/v1/vaults/${r}/credentials/${e}?beta=true`, {
          body: s,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(o ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      list(e, t = {}, n) {
        let {
          betas: r,
          ...o
        } = t ?? {};
        return this._client.getAPIList(Ta`/v1/vaults/${e}/credentials?beta=true`, KS, {
          query: o,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      delete(e, t, n) {
        let {
          vault_id: r,
          betas: o
        } = t;
        return this._client.delete(Ta`/v1/vaults/${r}/credentials/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(o ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      archive(e, t, n) {
        let {
          vault_id: r,
          betas: o
        } = t;
        return this._client.post(Ta`/v1/vaults/${r}/credentials/${e}/archive?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(o ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
    };
  });
  var $Ze;
  var nRr = __lazy(() => {
    tRr();
    tRr();
    NA();
    uC();
    IP();
    $Ze = class $Ze extends Cp {
      constructor() {
        super(...arguments);
        this.credentials = new iIt(this._client);
      }
      create(e, t) {
        let {
          betas: n,
          ...r
        } = e;
        return this._client.post("/v1/vaults?beta=true", {
          body: r,
          ...t,
          headers: gs([{
            "anthropic-beta": [...(n ?? []), "managed-agents-2026-04-01"].toString()
          }, t?.headers])
        });
      }
      retrieve(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.get(Ta`/v1/vaults/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      update(e, t, n) {
        let {
          betas: r,
          ...o
        } = t;
        return this._client.post(Ta`/v1/vaults/${e}?beta=true`, {
          body: o,
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      list(e = {}, t) {
        let {
          betas: n,
          ...r
        } = e ?? {};
        return this._client.getAPIList("/v1/vaults?beta=true", KS, {
          query: r,
          ...t,
          headers: gs([{
            "anthropic-beta": [...(n ?? []), "managed-agents-2026-04-01"].toString()
          }, t?.headers])
        });
      }
      delete(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.delete(Ta`/v1/vaults/${e}?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
      archive(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.post(Ta`/v1/vaults/${e}/archive?beta=true`, {
          ...n,
          headers: gs([{
            "anthropic-beta": [...(r ?? []), "managed-agents-2026-04-01"].toString()
          }, n?.headers])
        });
      }
    };
    $Ze.Credentials = iIt;
  });
  var BR;
  var rRr = __lazy(() => {
    RCr();
    RCr();
    kCr();
    kCr();
    ACr();
    ACr();
    ICr();
    ICr();
    OCr();
    OCr();
    NCr();
    NCr();
    YCr();
    YCr();
    QCr();
    QCr();
    eRr();
    eRr();
    nRr();
    nRr();
    BR = class BR extends Cp {
      constructor() {
        super(...arguments);
        this.models = new H0t(this._client);
        this.messages = new _xe(this._client);
        this.agents = new DZe(this._client);
        this.environments = new F0t(this._client);
        this.sessions = new D$e(this._client);
        this.vaults = new $Ze(this._client);
        this.memoryStores = new I$e(this._client);
        this.files = new $0t(this._client);
        this.skills = new BZe(this._client);
        this.userProfiles = new j0t(this._client);
      }
    };
    BR.Models = H0t;
    BR.Messages = _xe;
    BR.Agents = DZe;
    BR.Environments = F0t;
    BR.Sessions = D$e;
    BR.Vaults = $Ze;
    BR.MemoryStores = I$e;
    BR.Files = $0t;
    BR.Skills = BZe;
    BR.UserProfiles = j0t;
  });
  var bxe;
  var oRr = __lazy(() => {
    uC();
    bxe = class bxe extends Cp {
      create(e, t) {
        let {
          betas: n,
          ...r
        } = e;
        return this._client.post("/v1/complete", {
          body: r,
          timeout: this._client._options.timeout ?? 600000,
          ...t,
          headers: gs([{
            ...(n?.toString() != null ? {
              "anthropic-beta": n?.toString()
            } : undefined)
          }, t?.headers]),
          stream: e.stream ?? false
        });
      }
    };
  });
  function gds(e) {
    return e?.output_config?.format;
  }
  function sRr(e, t, n) {
    let r = gds(t);
    if (!t || !("parse" in (r ?? {}))) {
      return {
        ...e,
        content: e.content.map(o => {
          if (o.type === "text") {
            return Object.defineProperty({
              ...o
            }, "parsed_output", {
              value: null,
              enumerable: false
            });
          }
          return o;
        }),
        parsed_output: null
      };
    }
    return iRr(e, t, n);
  }
  function iRr(e, t, n) {
    let r = null;
    let o = e.content.map(s => {
      if (s.type === "text") {
        let i = _ou(t, s.text);
        if (r === null) {
          r = i;
        }
        return Object.defineProperty({
          ...s
        }, "parsed_output", {
          value: i,
          enumerable: false
        });
      }
      return s;
    });
    return {
      ...e,
      content: o,
      parsed_output: r
    };
  }
  function _ou(e, t) {
    let n = gds(e);
    if (n?.type !== "json_schema") {
      return null;
    }
    try {
      if ("parse" in n) {
        return n.parse(t);
      }
      return JSON.parse(t);
    } catch (r) {
      throw new mi(`Failed to parse structured output: ${r}`);
    }
  }
  var aRr = __lazy(() => {
    cI();
  });
  function Sds(e) {
    return e.type === "tool_use" || e.type === "server_tool_use";
  }
  function Tds(e) {}
  var I7;
  var Sxe;
  var HZe;
  var aIt;
  var Pcn;
  var lIt;
  var cIt;
  var Ocn;
  var uIt;
  var Hge;
  var dIt;
  var Dcn;
  var Mcn;
  var M$e;
  var Ncn;
  var Lcn;
  var pIt;
  var lRr;
  var yds;
  var cRr;
  var uRr;
  var dRr;
  var pRr;
  var _ds;
  var mIt;
  var Eds = __lazy(() => {
    Mge();
    Uge();
    Ecn();
    jCr();
    aRr();
    mIt = class mIt {
      constructor(e, t) {
        I7.add(this);
        this.messages = [];
        this.receivedMessages = [];
        Sxe.set(this, undefined);
        HZe.set(this, null);
        this.controller = new AbortController();
        aIt.set(this, undefined);
        Pcn.set(this, () => {});
        lIt.set(this, () => {});
        cIt.set(this, undefined);
        Ocn.set(this, () => {});
        uIt.set(this, () => {});
        Hge.set(this, {});
        dIt.set(this, false);
        Dcn.set(this, false);
        Mcn.set(this, false);
        M$e.set(this, false);
        Ncn.set(this, undefined);
        Lcn.set(this, undefined);
        pIt.set(this, undefined);
        cRr.set(this, n => {
          if (Oa(this, Dcn, true, "f"), Nge(n)) {
            n = new _f();
          }
          if (n instanceof _f) {
            Oa(this, Mcn, true, "f");
            return this._emit("abort", n);
          }
          if (n instanceof mi) {
            return this._emit("error", n);
          }
          if (n instanceof Error) {
            let r = new mi(n.message);
            r.cause = n;
            return this._emit("error", r);
          }
          return this._emit("error", new mi(String(n)));
        });
        Oa(this, aIt, new Promise((n, r) => {
          Oa(this, Pcn, n, "f");
          Oa(this, lIt, r, "f");
        }), "f");
        Oa(this, cIt, new Promise((n, r) => {
          Oa(this, Ocn, n, "f");
          Oa(this, uIt, r, "f");
        }), "f");
        to(this, aIt, "f").catch(() => {});
        to(this, cIt, "f").catch(() => {});
        Oa(this, HZe, e, "f");
        Oa(this, pIt, t?.logger ?? console, "f");
      }
      get response() {
        return to(this, Ncn, "f");
      }
      get request_id() {
        return to(this, Lcn, "f");
      }
      async withResponse() {
        Oa(this, M$e, true, "f");
        let e = await to(this, aIt, "f");
        if (!e) {
          throw Error("Could not resolve a `Response` object");
        }
        return {
          data: this,
          response: e,
          request_id: e.headers.get("request-id")
        };
      }
      static fromReadableStream(e) {
        let t = new mIt(null);
        t._run(() => t._fromReadableStream(e));
        return t;
      }
      static createMessage(e, t, n, {
        logger: r
      } = {}) {
        let o = new mIt(t, {
          logger: r
        });
        for (let s of t.messages) {
          o._addMessageParam(s);
        }
        Oa(o, HZe, {
          ...t,
          stream: true
        }, "f");
        o._run(() => o._createMessage(e, {
          ...t,
          stream: true
        }, {
          ...n,
          headers: {
            ...n?.headers,
            "X-Stainless-Helper-Method": "stream"
          }
        }));
        return o;
      }
      _run(e) {
        e().then(() => {
          this._emitFinal();
          this._emit("end");
        }, to(this, cRr, "f"));
      }
      _addMessageParam(e) {
        this.messages.push(e);
      }
      _addMessage(e, t = true) {
        if (this.receivedMessages.push(e), t) {
          this._emit("message", e);
        }
      }
      async _createMessage(e, t, n) {
        let r = n?.signal;
        let o;
        if (r) {
          if (r.aborted) {
            this.controller.abort();
          }
          o = this.controller.abort.bind(this.controller);
          r.addEventListener("abort", o);
        }
        try {
          to(this, I7, "m", uRr).call(this);
          let {
            response: s,
            data: i
          } = await e.create({
            ...t,
            stream: true
          }, {
            ...n,
            signal: this.controller.signal
          }).withResponse();
          this._connected(s);
          for await (let a of i) {
            to(this, I7, "m", dRr).call(this, a);
          }
          if (i.controller.signal?.aborted) {
            throw new _f();
          }
          to(this, I7, "m", pRr).call(this);
        } finally {
          if (r && o) {
            r.removeEventListener("abort", o);
          }
        }
      }
      _connected(e) {
        if (this.ended) {
          return;
        }
        Oa(this, Ncn, e, "f");
        Oa(this, Lcn, e?.headers.get("request-id"), "f");
        to(this, Pcn, "f").call(this, e);
        this._emit("connect");
      }
      get ended() {
        return to(this, dIt, "f");
      }
      get errored() {
        return to(this, Dcn, "f");
      }
      get aborted() {
        return to(this, Mcn, "f");
      }
      abort() {
        this.controller.abort();
      }
      on(e, t) {
        (to(this, Hge, "f")[e] || (to(this, Hge, "f")[e] = [])).push({
          listener: t
        });
        return this;
      }
      off(e, t) {
        let n = to(this, Hge, "f")[e];
        if (!n) {
          return this;
        }
        let r = n.findIndex(o => o.listener === t);
        if (r >= 0) {
          n.splice(r, 1);
        }
        return this;
      }
      once(e, t) {
        (to(this, Hge, "f")[e] || (to(this, Hge, "f")[e] = [])).push({
          listener: t,
          once: true
        });
        return this;
      }
      emitted(e) {
        return new Promise((t, n) => {
          if (Oa(this, M$e, true, "f"), e !== "error") {
            this.once("error", n);
          }
          this.once(e, t);
        });
      }
      async done() {
        Oa(this, M$e, true, "f");
        await to(this, cIt, "f");
      }
      get currentMessage() {
        return to(this, Sxe, "f");
      }
      async finalMessage() {
        await this.done();
        return to(this, I7, "m", lRr).call(this);
      }
      async finalText() {
        await this.done();
        return to(this, I7, "m", yds).call(this);
      }
      _emit(e, ...t) {
        if (to(this, dIt, "f")) {
          return;
        }
        if (e === "end") {
          Oa(this, dIt, true, "f");
          to(this, Ocn, "f").call(this);
        }
        let n = to(this, Hge, "f")[e];
        if (n) {
          to(this, Hge, "f")[e] = n.filter(r => !r.once);
          n.forEach(({
            listener: r
          }) => r(...t));
        }
        if (e === "abort") {
          let r = t[0];
          if (!to(this, M$e, "f") && !n?.length) {
            Promise.reject(r);
          }
          to(this, lIt, "f").call(this, r);
          to(this, uIt, "f").call(this, r);
          this._emit("end");
          return;
        }
        if (e === "error") {
          let r = t[0];
          if (!to(this, M$e, "f") && !n?.length) {
            Promise.reject(r);
          }
          to(this, lIt, "f").call(this, r);
          to(this, uIt, "f").call(this, r);
          this._emit("end");
        }
      }
      _emitFinal() {
        if (this.receivedMessages.at(-1)) {
          this._emit("finalMessage", to(this, I7, "m", lRr).call(this));
        }
      }
      async _fromReadableStream(e, t) {
        let n = t?.signal;
        let r;
        if (n) {
          if (n.aborted) {
            this.controller.abort();
          }
          r = this.controller.abort.bind(this.controller);
          n.addEventListener("abort", r);
        }
        try {
          to(this, I7, "m", uRr).call(this);
          this._connected(null);
          let o = cj.fromReadableStream(e, this.controller);
          for await (let s of o) {
            to(this, I7, "m", dRr).call(this, s);
          }
          if (o.controller.signal?.aborted) {
            throw new _f();
          }
          to(this, I7, "m", pRr).call(this);
        } finally {
          if (n && r) {
            n.removeEventListener("abort", r);
          }
        }
      }
      [(Sxe = new WeakMap(), HZe = new WeakMap(), aIt = new WeakMap(), Pcn = new WeakMap(), lIt = new WeakMap(), cIt = new WeakMap(), Ocn = new WeakMap(), uIt = new WeakMap(), Hge = new WeakMap(), dIt = new WeakMap(), Dcn = new WeakMap(), Mcn = new WeakMap(), M$e = new WeakMap(), Ncn = new WeakMap(), Lcn = new WeakMap(), pIt = new WeakMap(), cRr = new WeakMap(), I7 = new WeakSet(), lRr = function () {
        if (this.receivedMessages.length === 0) {
          throw new mi("stream ended without producing a Message with role=assistant");
        }
        return this.receivedMessages.at(-1);
      }, yds = function () {
        if (this.receivedMessages.length === 0) {
          throw new mi("stream ended without producing a Message with role=assistant");
        }
        let t = this.receivedMessages.at(-1).content.filter(n => n.type === "text").map(n => n.text);
        if (t.length === 0) {
          throw new mi("stream ended without producing a content block with type=text");
        }
        return t.join(" ");
      }, uRr = function () {
        if (this.ended) {
          return;
        }
        Oa(this, Sxe, undefined, "f");
      }, dRr = function (t) {
        if (this.ended) {
          return;
        }
        let n = to(this, I7, "m", _ds).call(this, t);
        switch (this._emit("streamEvent", t, n), t.type) {
          case "content_block_delta":
            {
              let r = n.content.at(-1);
              switch (t.delta.type) {
                case "text_delta":
                  {
                    if (r.type === "text") {
                      this._emit("text", t.delta.text, r.text || "");
                    }
                    break;
                  }
                case "citations_delta":
                  {
                    if (r.type === "text") {
                      this._emit("citation", t.delta.citation, r.citations ?? []);
                    }
                    break;
                  }
                case "input_json_delta":
                  {
                    if (Sds(r) && r.input) {
                      this._emit("inputJson", t.delta.partial_json, r.input);
                    }
                    break;
                  }
                case "thinking_delta":
                  {
                    if (r.type === "thinking") {
                      this._emit("thinking", t.delta.thinking, r.thinking);
                    }
                    break;
                  }
                case "signature_delta":
                  {
                    if (r.type === "thinking") {
                      this._emit("signature", r.signature);
                    }
                    break;
                  }
                default:
                  Tds(t.delta);
              }
              break;
            }
          case "message_stop":
            {
              this._addMessageParam(n);
              this._addMessage(sRr(n, to(this, HZe, "f"), {
                logger: to(this, pIt, "f")
              }), true);
              break;
            }
          case "content_block_stop":
            {
              this._emit("contentBlock", n.content.at(-1));
              break;
            }
          case "message_start":
            {
              Oa(this, Sxe, n, "f");
              break;
            }
          case "content_block_start":
          case "message_delta":
            break;
        }
      }, pRr = function () {
        if (this.ended) {
          throw new mi("stream has ended, this shouldn't happen");
        }
        let t = to(this, Sxe, "f");
        if (!t) {
          throw new mi("request ended without sending any chunks");
        }
        Oa(this, Sxe, undefined, "f");
        return sRr(t, to(this, HZe, "f"), {
          logger: to(this, pIt, "f")
        });
      }, _ds = function (t) {
        let n = to(this, Sxe, "f");
        if (t.type === "message_start") {
          if (n) {
            throw new mi(`Unexpected event order, got ${t.type} before receiving "message_stop"`);
          }
          return t.message;
        }
        if (!n) {
          throw new mi(`Unexpected event order, got ${t.type} before "message_start"`);
        }
        switch (t.type) {
          case "message_stop":
            return n;
          case "message_delta":
            if (n.stop_reason = t.delta.stop_reason, n.stop_sequence = t.delta.stop_sequence, n.usage.output_tokens = t.usage.output_tokens, t.usage.input_tokens != null) {
              n.usage.input_tokens = t.usage.input_tokens;
            }
            if (t.usage.cache_creation_input_tokens != null) {
              n.usage.cache_creation_input_tokens = t.usage.cache_creation_input_tokens;
            }
            if (t.usage.cache_read_input_tokens != null) {
              n.usage.cache_read_input_tokens = t.usage.cache_read_input_tokens;
            }
            if (t.usage.server_tool_use != null) {
              n.usage.server_tool_use = t.usage.server_tool_use;
            }
            return n;
          case "content_block_start":
            n.content.push({
              ...t.content_block
            });
            return n;
          case "content_block_delta":
            {
              let r = n.content.at(t.index);
              switch (t.delta.type) {
                case "text_delta":
                  {
                    if (r?.type === "text") {
                      n.content[t.index] = {
                        ...r,
                        text: (r.text || "") + t.delta.text
                      };
                    }
                    break;
                  }
                case "citations_delta":
                  {
                    if (r?.type === "text") {
                      n.content[t.index] = {
                        ...r,
                        citations: [...(r.citations ?? []), t.delta.citation]
                      };
                    }
                    break;
                  }
                case "input_json_delta":
                  {
                    if (r && Sds(r)) {
                      let o = r["__json_buf"] || "";
                      o += t.delta.partial_json;
                      let s = {
                        ...r
                      };
                      if (Object.defineProperty(s, "__json_buf", {
                        value: o,
                        enumerable: false,
                        writable: true
                      }), o) {
                        s.input = Tcn(o);
                      }
                      n.content[t.index] = s;
                    }
                    break;
                  }
                case "thinking_delta":
                  {
                    if (r?.type === "thinking") {
                      n.content[t.index] = {
                        ...r,
                        thinking: r.thinking + t.delta.thinking
                      };
                    }
                    break;
                  }
                case "signature_delta":
                  {
                    if (r?.type === "thinking") {
                      n.content[t.index] = {
                        ...r,
                        signature: t.delta.signature
                      };
                    }
                    break;
                  }
                default:
                  Tds(t.delta);
              }
              return n;
            }
          case "content_block_stop":
            return n;
        }
      }, Symbol.asyncIterator)]() {
        let e = [];
        let t = [];
        let n = false;
        this.on("streamEvent", r => {
          let o = t.shift();
          if (o) {
            o.resolve(r);
          } else {
            e.push(r);
          }
        });
        this.on("end", () => {
          n = true;
          for (let r of t) {
            r.resolve(undefined);
          }
          t.length = 0;
        });
        this.on("abort", r => {
          n = true;
          for (let o of t) {
            o.reject(r);
          }
          t.length = 0;
        });
        this.on("error", r => {
          n = true;
          for (let o of t) {
            o.reject(r);
          }
          t.length = 0;
        });
        return {
          next: async () => {
            if (!e.length) {
              if (n) {
                return {
                  value: undefined,
                  done: true
                };
              }
              return new Promise((o, s) => t.push({
                resolve: o,
                reject: s
              })).then(o => o ? {
                value: o,
                done: false
              } : {
                value: undefined,
                done: true
              });
            }
            return {
              value: e.shift(),
              done: false
            };
          },
          return: async () => (this.abort(), {
            value: undefined,
            done: true
          })
        };
      }
      toReadableStream() {
        return new cj(this[Symbol.asyncIterator].bind(this), this.controller).toReadableStream();
      }
    };
  });
  var fIt;
  var mRr = __lazy(() => {
    NA();
    uC();
    LCr();
    Uge();
    IP();
    fIt = class fIt extends Cp {
      create(e, t) {
        return this._client.post("/v1/messages/batches", {
          body: e,
          ...t
        });
      }
      retrieve(e, t) {
        return this._client.get(Ta`/v1/messages/batches/${e}`, t);
      }
      list(e = {}, t) {
        return this._client.getAPIList("/v1/messages/batches", ute, {
          query: e,
          ...t
        });
      }
      delete(e, t) {
        return this._client.delete(Ta`/v1/messages/batches/${e}`, t);
      }
      cancel(e, t) {
        return this._client.post(Ta`/v1/messages/batches/${e}/cancel`, t);
      }
      async results(e, t) {
        let n = await this.retrieve(e);
        if (!n.results_url) {
          throw new mi(`No batch \`results_url\`; Has it finished processing? ${n.processing_status} - ${n.id}`);
        }
        return this._client.get(n.results_url, {
          ...t,
          headers: gs([{
            Accept: "application/binary"
          }, t?.headers]),
          stream: true,
          __binaryResponse: true
        })._thenUnwrap((r, o) => MZe.fromResponse(o.response, o.controller));
      }
    };
  });
  var uj;
  var vds;
  var Sou;
  var fRr = __lazy(() => {
    uC();
    B0t();
    Eds();
    aRr();
    mRr();
    mRr();
    UCr();
    uj = class uj extends Cp {
      constructor() {
        super(...arguments);
        this.batches = new fIt(this._client);
      }
      create(e, t) {
        if (e.model in vds) {
          console.warn(`The model '${e.model}' is deprecated and will reach end-of-life on ${vds[e.model]}
Please migrate to a newer model. Visit https://docs.anthropic.com/en/docs/resources/model-deprecations for more information.`);
        }
        if (Sou.includes(e.model) && e.thinking && e.thinking.type === "enabled") {
          console.warn(`Using Claude with ${e.model} and 'thinking.type=enabled' is deprecated. Use 'thinking.type=adaptive' instead which results in better model performance in our testing: https://platform.claude.com/docs/en/build-with-claude/adaptive-thinking`);
        }
        let n = this._client._options.timeout;
        if (!e.stream && n == null) {
          let o = Scn[e.model] ?? undefined;
          n = this._client.calculateNonstreamingTimeout(e.max_tokens, o);
        }
        let r = bcn(e.tools, e.messages);
        return this._client.post("/v1/messages", {
          body: e,
          timeout: n ?? 600000,
          ...t,
          headers: gs([r, t?.headers]),
          stream: e.stream ?? false
        });
      }
      parse(e, t) {
        return this.create(e, t).then(n => iRr(n, e, {
          logger: this._client.logger ?? console
        }));
      }
      stream(e, t) {
        return mIt.createMessage(this, e, t, {
          logger: this._client.logger ?? console
        });
      }
      countTokens(e, t) {
        return this._client.post("/v1/messages/count_tokens", {
          body: e,
          ...t
        });
      }
    };
    vds = {
      "claude-1.3": "November 6th, 2024",
      "claude-1.3-100k": "November 6th, 2024",
      "claude-instant-1.1": "November 6th, 2024",
      "claude-instant-1.1-100k": "November 6th, 2024",
      "claude-instant-1.2": "November 6th, 2024",
      "claude-3-sonnet-20240229": "July 21st, 2025",
      "claude-3-opus-20240229": "January 5th, 2026",
      "claude-2.1": "July 21st, 2025",
      "claude-2.0": "July 21st, 2025",
      "claude-3-7-sonnet-latest": "February 19th, 2026",
      "claude-3-7-sonnet-20250219": "February 19th, 2026",
      "claude-3-5-haiku-latest": "February 19th, 2026",
      "claude-3-5-haiku-20241022": "February 19th, 2026",
      "claude-opus-4-0": "June 15th, 2026",
      "claude-opus-4-20250514": "June 15th, 2026",
      "claude-sonnet-4-0": "June 15th, 2026",
      "claude-sonnet-4-20250514": "June 15th, 2026"
    };
    Sou = ["claude-mythos-preview", "claude-opus-4-6"];
    uj.Batches = fIt;
  });
  var jZe;
  var hRr = __lazy(() => {
    NA();
    uC();
    IP();
    jZe = class jZe extends Cp {
      retrieve(e, t = {}, n) {
        let {
          betas: r
        } = t ?? {};
        return this._client.get(Ta`/v1/models/${e}`, {
          ...n,
          headers: gs([{
            ...(r?.toString() != null ? {
              "anthropic-beta": r?.toString()
            } : undefined)
          }, n?.headers])
        });
      }
      list(e = {}, t) {
        let {
          betas: n,
          ...r
        } = e ?? {};
        return this._client.getAPIList("/v1/models", ute, {
          query: r,
          ...t,
          headers: gs([{
            ...(n?.toString() != null ? {
              "anthropic-beta": n?.toString()
            } : undefined)
          }, t?.headers])
        });
      }
    };
  });
  var qZe = __lazy(() => {
    rRr();
    oRr();
    fRr();
    hRr();
    Qus();
  });
  class BaseAnthropic {
    get credentials() {
      return this._authState.provider;
    }
    constructor({
      baseURL: e = Zb("ANTHROPIC_BASE_URL"),
      apiKey: t,
      authToken: n,
      ...r
    } = {}) {
      if (gRr.add(this), this._requestAuthFlags = new WeakMap(), Fcn.set(this, undefined), t === undefined) {
        t = r.profile != null ? null : Zb("ANTHROPIC_API_KEY") ?? null;
      }
      if (n === undefined) {
        n = r.profile != null ? null : Zb("ANTHROPIC_AUTH_TOKEN") ?? null;
      }
      if (r.profile != null && (r.credentials != null || r.config != null)) {
        throw TypeError("Pass at most one of `profile`, `credentials`, or `config`.");
      }
      let o = {
        apiKey: t,
        authToken: n,
        ...r,
        baseURL: e || "https://api.anthropic.com"
      };
      if (!o.dangerouslyAllowBrowser && Eus()) {
        throw new mi(`It looks like you're running in a browser-like environment.

This is disabled by default, as it risks exposing your secret API credentials to attackers.
If you understand the risks and have appropriate mitigations in place,
you can set the \`dangerouslyAllowBrowser\` option to \`true\`, e.g.,

new Anthropic({ apiKey, dangerouslyAllowBrowser: true });
`);
      }
      this.baseURL = o.baseURL;
      this._baseURLIsExplicit = r.__baseURLIsExplicit ?? !!e;
      this.timeout = o.timeout ?? BaseAnthropic.DEFAULT_TIMEOUT;
      this.logger = o.logger ?? console;
      let s = "warn";
      this.logLevel = s;
      this.logLevel = pCr(o.logLevel, "ClientOptions.logLevel", this) ?? pCr(Zb("ANTHROPIC_LOG"), "process.env['ANTHROPIC_LOG']", this) ?? s;
      this.fetchOptions = o.fetchOptions;
      this.maxRetries = o.maxRetries ?? 2;
      this.fetch = o.fetch ?? vus();
      Oa(this, Fcn, Cus, "f");
      let i = Zb("ANTHROPIC_CUSTOM_HEADERS");
      if (i) {
        let l = {};
        for (let c of i.split(`
`)) {
          let u = c.indexOf(":");
          if (u >= 0) {
            l[c.substring(0, u).trim()] = c.substring(u + 1).trim();
          }
        }
        o.defaultHeaders = {
          ...l,
          ...o.defaultHeaders
        };
      }
      let a = r.__auth;
      if (delete o.__auth, delete o.__baseURLIsExplicit, this._options = o, this.apiKey = typeof t === "string" ? t : null, this.authToken = n, a) {
        if (this._authState = a, !this._baseURLIsExplicit && a.baseURL) {
          this.baseURL = a.baseURL;
        }
      } else if (this._authState = {
        provider: null,
        tokenCache: null,
        resolution: null,
        error: null,
        extraHeaders: {}
      }, this.apiKey == null && this.authToken == null) {
        let l = o.credentials ?? null;
        if (l) {
          this._authState.provider = l;
          this._authState.tokenCache = this._makeTokenCache(l);
        } else if (o.config != null) {
          let c = resolveCredentialsFromConfig(o.config, this._credentialResolverOptions());
          this._authState.provider = c.provider;
          this._authState.tokenCache = this._makeTokenCache(c.provider);
          this._authState.extraHeaders = c.extraHeaders;
          this._applyCredentialBaseURL(c.baseURL);
        } else if (o.profile != null) {
          this._authState.resolution = this._resolveDefaultCredentials(o.profile);
        } else {
          this._authState.resolution = this._resolveDefaultCredentials();
        }
      }
    }
    _applyCredentialBaseURL(e) {
      if (!e) {
        return;
      }
      let t = e.replace(/\/+$/, "");
      if (this._authState.baseURL = t, !this._baseURLIsExplicit) {
        this.baseURL = t;
      }
    }
    _credentialResolverOptions() {
      return {
        baseURL: this.baseURL,
        fetch: this.fetch,
        userAgent: this.getUserAgent(),
        onCacheWriteError: e => {
          uI(this).debug("credential cache write failed (best-effort)", e);
        },
        onSafetyWarning: e => {
          uI(this).warn(e);
        }
      };
    }
    _makeTokenCache(e) {
      return new TokenCache(e, t => {
        uI(this).debug("advisory token refresh failed; serving cached token", t);
      });
    }
    withOptions(e) {
      let t = "credentials" in e || "config" in e || "profile" in e;
      let n = "apiKey" in e || "authToken" in e || t;
      let r = {
        ...this._options,
        ...(this._baseURLIsExplicit ? {
          baseURL: this.baseURL
        } : {}),
        maxRetries: this.maxRetries,
        timeout: this.timeout,
        logger: this.logger,
        logLevel: this.logLevel,
        fetch: this.fetch,
        fetchOptions: this.fetchOptions,
        apiKey: this.apiKey,
        authToken: this.authToken,
        credentials: this.credentials,
        ...(t ? {
          credentials: undefined,
          config: undefined,
          profile: undefined
        } : {}),
        ...e,
        __auth: n ? undefined : this._authState,
        __baseURLIsExplicit: "baseURL" in e ? true : this._baseURLIsExplicit
      };
      return new this.constructor(r);
    }
    async _resolveDefaultCredentials(e) {
      try {
        let t = await defaultCredentials(this._credentialResolverOptions(), e);
        if (t) {
          this._authState.provider = t.provider;
          this._authState.tokenCache = this._makeTokenCache(t.provider);
          this._authState.extraHeaders = t.extraHeaders;
          this._applyCredentialBaseURL(t.baseURL);
        } else if (e != null) {
          throw new mi(`Profile "${e}" could not be resolved (no <config_dir>/configs/${e}.json found).`);
        }
      } catch (t) {
        this._authState.error = t;
      } finally {
        this._authState.resolution = null;
      }
    }
    defaultQuery() {
      return this._options.defaultQuery;
    }
    validateHeaders({
      values: e,
      nulls: t
    }) {
      if (e.get("x-api-key") || e.get("authorization")) {
        return;
      }
      if (this._authState.error) {
        throw this._authState.error;
      }
      if (this._authState.tokenCache || this._authState.resolution) {
        return;
      }
      if (this.apiKey && e.get("x-api-key")) {
        return;
      }
      if (t.vZc("x-api-key")) {
        return;
      }
      if (this.authToken && e.get("authorization")) {
        return;
      }
      if (t.vZc("authorization")) {
        return;
      }
      throw Error('Could not resolve authentication method. Expected one of apiKey, authToken, credentials, config, or profile to be set. Or for one of the "X-Api-Key" or "Authorization" headers to be explicitly omitted');
    }
    _authFlags(e) {
      let t = this._requestAuthFlags.get(e);
      if (!t) {
        t = {
          usedTokenCache: false,
          didRefreshFor401: false
        };
        this._requestAuthFlags.set(e, t);
      }
      return t;
    }
    async authHeaders(e) {
      if (this._authState.resolution) {
        await this._authState.resolution;
      }
      if (this._authState.error) {
        return;
      }
      if (this._authState.tokenCache && this.apiKey == null) {
        let t = await this._authState.tokenCache.getToken();
        this._authFlags(e).usedTokenCache = true;
        return gs([{
          Authorization: `Bearer ${t}`
        }]);
      }
      return gs([await this.apiKeyAuth(e), await this.bearerAuth(e)]);
    }
    async apiKeyAuth(e) {
      if (this.apiKey == null) {
        return;
      }
      return gs([{
        "X-Api-Key": this.apiKey
      }]);
    }
    async bearerAuth(e) {
      if (this.authToken == null) {
        return;
      }
      return gs([{
        Authorization: `Bearer ${this.authToken}`
      }]);
    }
    stringifyQuery(e) {
      return Rus(e);
    }
    getUserAgent() {
      return `${this.constructor.name}/JS ${"0.94.0"}`;
    }
    defaultIdempotencyKey() {
      return `stainless-node-retry-${oCr()}`;
    }
    makeStatusError(e, t, n, r) {
      return Ho.generate(e, t, n, r);
    }
    buildURL(e, t, n) {
      let r = !to(this, gRr, "m", wds).call(this) && n || this.baseURL;
      let o = hus(e) ? new URL(e) : new URL(r + (r.endsWith("/") && e.startsWith("/") ? e.slice(1) : e));
      let s = this.defaultQuery();
      let i = Object.fromEntries(o.searchParams);
      if (!aCr(s) || !aCr(i)) {
        t = {
          ...i,
          ...s,
          ...t
        };
      }
      if (typeof t === "object" && t && !Array.isArray(t)) {
        o.search = this.stringifyQuery(t);
      }
      return o.toString();
    }
    _calculateNonstreamingTimeout(e) {
      if (3600 * e / 128000 > 600) {
        throw new mi("Streaming is required for operations that may take longer than 10 minutes. See https://github.com/anthropics/anthropic-sdk-typescript#streaming-responses for more details");
      }
      return 600000;
    }
    async prepareOptions(e) {}
    async prepareRequest(e, {
      url: t,
      options: n
    }) {
      if (this._authState.tokenCache && this.apiKey == null) {
        let r = e.headers instanceof Headers ? e.headers : new Headers(e.headers);
        for (let [s, i] of Object.entries(this._authState.extraHeaders)) {
          if (!r.vZc(s)) {
            r.set(s, i);
          }
        }
        if (!r.get("anthropic-beta")?.split(",").map(s => s.trim())?.includes("oauth-2025-04-20")) {
          r.append("anthropic-beta", "oauth-2025-04-20");
        }
        e.headers = r;
      }
    }
    get(e, t) {
      return this.methodRequest("get", e, t);
    }
    post(e, t) {
      return this.methodRequest("post", e, t);
    }
    patch(e, t) {
      return this.methodRequest("patch", e, t);
    }
    put(e, t) {
      return this.methodRequest("put", e, t);
    }
    delete(e, t) {
      return this.methodRequest("delete", e, t);
    }
    methodRequest(e, t, n) {
      return this.request(Promise.resolve(n).then(r => ({
        method: e,
        path: t,
        ...r
      })));
    }
    request(e, t = null) {
      return new k$e(this, this.makeRequest(e, t, undefined));
    }
    async makeRequest(e, t, n) {
      let r = await e;
      let o = r.maxRetries ?? this.maxRetries;
      if (t == null) {
        t = o;
        this._requestAuthFlags.delete(r);
      }
      await this.prepareOptions(r);
      let {
        req: s,
        url: i,
        timeout: a
      } = await this.buildRequest(r, {
        retryCount: o - t
      });
      await this.prepareRequest(s, {
        url: i,
        options: r
      });
      let l = "log_" + (Math.random() * 16777216 | 0).toString(16).padStart(6, "0");
      let c = n === undefined ? "" : `, retryOf: ${n}`;
      let u = Date.now();
      if (uI(this).debug(`[${l}] sending request`, Fge({
        retryOfRequestLogID: n,
        method: r.method,
        url: i,
        options: r,
        headers: s.headers
      })), r.signal?.aborted) {
        throw new _f();
      }
      let d = new AbortController();
      let p = await this.fetchWithTimeout(i, s, a, d).catch(T0t);
      let m = Date.now();
      if (p instanceof globalThis.Error) {
        let g = `retrying, ${t} attempts remaining`;
        if (r.signal?.aborted) {
          throw new _f();
        }
        let y = Nge(p) || /timed? ?out/i.test(String(p) + ("cause" in p ? String(p.cause) : ""));
        if (t) {
          uI(this).info(`[${l}] connection ${y ? "timed out" : "failed"} - ${g}`);
          uI(this).debug(`[${l}] connection ${y ? "timed out" : "failed"} (${g})`, Fge({
            retryOfRequestLogID: n,
            url: i,
            durationMs: m - u,
            message: p.message
          }));
          return this.retryRequest(r, t, n ?? l);
        }
        if (uI(this).info(`[${l}] connection ${y ? "timed out" : "failed"} - error; no more retries left`), uI(this).debug(`[${l}] connection ${y ? "timed out" : "failed"} (error; no more retries left)`, Fge({
          retryOfRequestLogID: n,
          url: i,
          durationMs: m - u,
          message: p.message
        })), y) {
          throw new x7();
        }
        throw new ik({
          cause: p
        });
      }
      let f = [...p.headers.entries()].filter(([g]) => g === "request-id").map(([g, y]) => ", " + g + ": " + JSON.stringify(y)).join("");
      let h = `[${l}${c}${f}] ${s.method} ${i} ${p.ok ? "succeeded" : "failed"} with status ${p.status} in ${m - u}ms`;
      if (!p.ok) {
        let g = await this.shouldRetry(p, r);
        if (t && g) {
          let C = `retrying, ${t} attempts remaining`;
          await wus(p.body);
          uI(this).info(`${h} - ${C}`);
          uI(this).debug(`[${l}] response error (${C})`, Fge({
            retryOfRequestLogID: n,
            url: p.url,
            status: p.status,
            headers: p.headers,
            durationMs: m - u
          }));
          return this.retryRequest(r, t, n ?? l, p.headers);
        }
        let y = g ? "error; no more retries left" : "error; not retryable";
        uI(this).info(`${h} - ${y}`);
        let _ = await p.text().catch(C => T0t(C).message);
        let b = Zln(_);
        let S = b ? undefined : _;
        throw uI(this).debug(`[${l}] response error (${y})`, Fge({
          retryOfRequestLogID: n,
          url: p.url,
          status: p.status,
          headers: p.headers,
          message: S,
          durationMs: Date.now() - u
        })), this.makeStatusError(p.status, b, S, p.headers);
      }
      uI(this).info(h);
      uI(this).debug(`[${l}] response start`, Fge({
        retryOfRequestLogID: n,
        url: p.url,
        status: p.status,
        headers: p.headers,
        durationMs: m - u
      }));
      return {
        response: p,
        options: r,
        controller: d,
        requestLogID: l,
        retryOfRequestLogID: n,
        startTime: u
      };
    }
    getAPIList(e, t, n) {
      return this.requestAPIList(t, n && "then" in n ? n.then(r => ({
        method: "get",
        path: e,
        ...r
      })) : {
        method: "get",
        path: e,
        ...n
      });
    }
    requestAPIList(e, t) {
      let n = this.makeRequest(t, null, undefined);
      return new gcn(this, n, e);
    }
    async fetchWithTimeout(e, t, n, r) {
      let {
        signal: o,
        method: s,
        ...i
      } = t || {};
      let a = this._makeAbort(r);
      if (o) {
        o.addEventListener("abort", a, {
          once: true
        });
      }
      let l = setTimeout(a, n);
      let c = globalThis.ReadableStream && i.body instanceof globalThis.ReadableStream || typeof i.body === "object" && i.body !== null && Symbol.asyncIterator in i.body;
      let u = {
        signal: r.signal,
        ...(c ? {
          duplex: "half"
        } : {}),
        method: "GET",
        ...i
      };
      if (s) {
        u.method = s.toUpperCase();
      }
      try {
        return await this.fetch.call(undefined, e, u);
      } finally {
        clearTimeout(l);
      }
    }
    async shouldRetry(e, t) {
      let n = this._authFlags(t);
      if (e.status === 401 && this._authState.tokenCache && n.usedTokenCache && !n.didRefreshFor401) {
        n.didRefreshFor401 = true;
        this._authState.tokenCache.invalidate();
        return true;
      }
      let r = e.headers.get("x-should-retry");
      if (r === "true") {
        return true;
      }
      if (r === "false") {
        return false;
      }
      if (e.status === 408) {
        return true;
      }
      if (e.status === 409) {
        return true;
      }
      if (e.status === 429) {
        return true;
      }
      if (e.status >= 500) {
        return true;
      }
      return false;
    }
    async retryRequest(e, t, n, r) {
      let o;
      let s = r?.get("retry-after-ms");
      if (s) {
        let a = parseFloat(s);
        if (!Number.isNaN(a)) {
          o = a;
        }
      }
      let i = r?.get("retry-after");
      if (i && !o) {
        let a = parseFloat(i);
        if (!Number.isNaN(a)) {
          o = a * 1000;
        } else {
          o = Date.parse(i) - Date.now();
        }
      }
      if (o === undefined) {
        let a = e.maxRetries ?? this.maxRetries;
        o = this.calculateDefaultRetryTimeoutMillis(t, a);
      }
      await _us(o);
      return this.makeRequest(e, t - 1, n);
    }
    calculateDefaultRetryTimeoutMillis(e, t) {
      let o = t - e;
      let s = Math.min(0.5 * Math.pow(2, o), 8);
      let i = 1 - Math.random() * 0.25;
      return s * i * 1000;
    }
    calculateNonstreamingTimeout(e, t) {
      if (3600000 * e / 128000 > 600000 || t != null && e > t) {
        throw new mi("Streaming is required for operations that may take longer than 10 minutes. See https://github.com/anthropics/anthropic-sdk-typescript#long-requests for more details");
      }
      return 600000;
    }
    async buildRequest(e, {
      retryCount: t = 0
    } = {}) {
      let n = {
        ...e
      };
      let {
        method: r,
        path: o,
        query: s,
        defaultBaseURL: i
      } = n;
      if (this._authState.resolution) {
        await this._authState.resolution;
      }
      if (!this._baseURLIsExplicit && this._authState.baseURL && this.baseURL !== this._authState.baseURL) {
        this.baseURL = this._authState.baseURL;
      }
      let a = this.buildURL(o, s, i);
      if ("timeout" in n) {
        yus("timeout", n.timeout);
      }
      n.timeout = n.timeout ?? this.timeout;
      let {
        bodyHeaders: l,
        body: c
      } = this.buildBody({
        options: n
      });
      let u = await this.buildHeaders({
        options: e,
        method: r,
        bodyHeaders: l,
        retryCount: t
      });
      return {
        req: {
          method: r,
          headers: u,
          ...(n.signal && {
            signal: n.signal
          }),
          ...(globalThis.ReadableStream && c instanceof globalThis.ReadableStream && {
            duplex: "half"
          }),
          ...(c && {
            body: c
          }),
          ...(this.fetchOptions ?? {}),
          ...(n.fetchOptions ?? {})
        },
        url: a,
        timeout: n.timeout
      };
    }
    async buildHeaders({
      options: e,
      method: t,
      bodyHeaders: n,
      retryCount: r
    }) {
      let o = {};
      if (this.idempotencyHeader && t !== "get") {
        if (!e.idempotencyKey) {
          e.idempotencyKey = this.defaultIdempotencyKey();
        }
        o[this.idempotencyHeader] = e.idempotencyKey;
      }
      let s = gs([o, {
        Accept: "application/json",
        "User-Agent": this.getUserAgent(),
        "X-Stainless-Retry-Count": String(r),
        ...(e.timeout ? {
          "X-Stainless-Timeout": String(Math.trunc(e.timeout / 1000))
        } : {}),
        ...k0t(),
        ...(this._options.dangerouslyAllowBrowser ? {
          "anthropic-dangerous-direct-browser-access": "true"
        } : undefined),
        "anthropic-version": "2023-06-01"
      }, await this.authHeaders(e), this._options.defaultHeaders, n, e.headers]);
      this.validateHeaders(s);
      return s.values;
    }
    _makeAbort(e) {
      return () => e.abort();
    }
    buildBody({
      options: {
        body: e,
        headers: t
      }
    }) {
      if (!e) {
        return {
          bodyHeaders: undefined,
          body: undefined
        };
      }
      let n = gs([t]);
      if (ArrayBuffer.isView(e) || e instanceof ArrayBuffer || e instanceof DataView || typeof e === "string" && n.values.vZc("content-type") || globalThis.Blob && e instanceof globalThis.Blob || e instanceof FormData || e instanceof URLSearchParams || globalThis.ReadableStream && e instanceof globalThis.ReadableStream) {
        return {
          bodyHeaders: undefined,
          body: e
        };
      } else if (typeof e === "object" && (Symbol.asyncIterator in e || Symbol.iterator in e && "next" in e && typeof e.next === "function")) {
        return {
          bodyHeaders: undefined,
          body: tcn(e)
        };
      } else if (typeof e === "object" && n.values.get("content-type") === "application/x-www-form-urlencoded") {
        return {
          bodyHeaders: {
            "content-type": "application/x-www-form-urlencoded"
          },
          body: this.stringifyQuery(e)
        };
      } else {
        return to(this, Fcn, "f").call(this, {
          body: e,
          headers: n
        });
      }
    }
  }
  var gRr;
  var Fcn;
  var wds;
  var dj;
  var CN = __lazy(() => {
    CCr();
    fcn();
    NA();
    cI();
  });
  function mg(e) {
    try {
      return e instanceof xc || e instanceof _f || e instanceof Error && (e.name === "AbortError" || "__CANCEL__" in e && Boolean(e.__CANCEL__));
    } catch {
      return false;
    }
  }
  function Mae(e, t) {
    return e instanceof Error && e.message === t;
  }
  function sr(e) {
    return e instanceof Error ? e : Error(String(e));
  }
  function he(e) {
    return e instanceof Error ? e.message : String(e);
  }
  function en(e) {
    if (e && typeof e === "object" && "code" in e && typeof e.code === "string") {
      return e.code;
    }
    return;
  }
  function gd(e) {
    let t = en(e);
    return t && /^[A-Z][A-Z0-9_]{0,63}$/.test(t) ? t : undefined;
  }
  function U4(e) {
    let t = e?.name;
    return typeof t === "string" && /^[A-Z][a-zA-Z]*$/.test(t) ? t : undefined;
  }
  function WZe(e) {
    let t = gd(e) ?? U4(e);
    return t === undefined ? undefined : t;
  }
  function xds(e) {
    let t = U4(e);
    return t === undefined ? undefined : t;
  }
  function kds(e) {
    return e !== undefined && /^[A-Z][A-Za-z0-9_]*$/.test(e) ? e : undefined;
  }
  function N$e(e) {
    return typeof e === "string" && /^[A-Z][a-zA-Z]*$/.test(e) ? e : undefined;
  }
  function Ads(e) {
    return typeof e === "string" && /^[a-z][a-z_]{0,39}$/.test(e) ? e : "unparseable";
  }
  function Ids(e) {
    let t = N$e(e);
    return t === undefined ? undefined : t;
  }
  function Pds(e) {
    let t = e?.constructor?.name;
    return typeof t === "string" && /^[A-Za-z][A-Za-z0-9_]{0,39}$/.test(t) ? t : "unparseable";
  }
  function Ods(e) {
    return /^[^/\\]+:\d+:\d+$/.test(e) ? e : undefined;
  }
  function Zd(e) {
    return e !== null && typeof e === "object" && "errno" in e && typeof e.errno === "number";
  }
  function fn(e) {
    return en(e) === "ENOENT";
  }
  function Nae(e) {
    return en(e) === "EISDIR";
  }
  function Dds(e) {
    if (e && typeof e === "object" && "path" in e && typeof e.path === "string") {
      return e.path;
    }
    return;
  }
  function Mds(e, t = 5) {
    if (!(e instanceof Error)) {
      return String(e);
    }
    if (!e.stack) {
      return e.message;
    }
    let n = e.stack.split(`
`);
    let r = n[0] ?? e.message;
    let o = n.slice(1).filter(s => s.trim().startsWith("at "));
    if (o.length <= t) {
      return e.stack;
    }
    return [r, ...o.slice(0, t)].join(`
`);
  }
  function Io(e) {
    let t = en(e);
    return t === "ENOENT" || t === "EACCES" || t === "EPERM" || t === "ENOTDIR" || t === "ELOOP" || t === "ENAMETOOLONG" || t === "EROFS";
  }
  function M_(e, t) {
    if (t?.(e)) {
      return true;
    }
    if (!e || typeof e !== "object" || !("isAxiosError" in e) || !e.isAxiosError) {
      return false;
    }
    let n = e.response?.status;
    return n === undefined || n === 401 || n === 403 || n === 429;
  }
  function YS(e) {
    let t = he(e);
    if (!e || typeof e !== "object" || !("isAxiosError" in e) || !e.isAxiosError) {
      return {
        kind: "other",
        message: t
      };
    }
    let n = e;
    let r = n.response?.status;
    if (r === 401 || r === 403) {
      return {
        kind: "auth",
        status: r,
        message: t
      };
    }
    if (n.code === "ECONNABORTED") {
      return {
        kind: "timeout",
        status: r,
        message: t
      };
    }
    if (n.code === "ECONNREFUSED" || n.code === "ENOTFOUND") {
      return {
        kind: "network",
        status: r,
        message: t
      };
    }
    return {
      kind: "http",
      status: r,
      message: t
    };
  }
  var gIt;
  var O7;
  var Ucn;
  var xc;
  var PB;
  var RN;
  var eS;
  var Po;
  var $o = (e, t) => e !== null && typeof e === "object" && !("telemetryMessage" in e) ? Object.assign(e, {
    telemetryMessage: t
  }) : e;
  var v6;
  var dt = __lazy(() => {
    CN();
    gIt = class gIt extends Error {
      constructor(e) {
        super(e);
        this.name = this.constructor.name;
      }
    };
    O7 = class O7 extends Error {};
    Ucn = class Ucn extends Error {
      name = "CliUserError";
    };
    xc = class xc extends Error {
      constructor(e) {
        super(e);
        this.name = "AbortError";
      }
    };
    PB = class PB extends Error {
      filePath;
      defaultConfig;
      constructor(e, t, n) {
        super(e);
        this.name = "ConfigParseError";
        this.filePath = t;
        this.defaultConfig = n;
      }
    };
    RN = class RN extends Error {
      stdout;
      stderr;
      code;
      interrupted;
      hadSandboxViolation;
      constructor(e, t, n, r, o = false) {
        super("Shell command failed");
        this.stdout = e;
        this.stderr = t;
        this.code = n;
        this.interrupted = r;
        this.hadSandboxViolation = o;
        this.name = "ShellError";
      }
    };
    eS = class eS extends Error {
      formattedMessage;
      constructor(e, t) {
        super(e);
        this.formattedMessage = t;
        this.name = "TeleportOperationError";
      }
    };
    Po = class Po extends Error {
      telemetryMessage;
      constructor(e, t) {
        super(e);
        this.name = "TelemetrySafeError";
        this.telemetryMessage = t ?? e;
      }
    };
    v6 = new Set(["ENOSPC", "EDQUOT", "ENFILE", "EMFILE"]);
  });
  function Tou(e, t) {
    var n = -1;
    var r = e == null ? 0 : e.length;
    while (++n < r) {
      if (t(e[n], n, e) === false) {
        break;
      }
    }
    return e;
  }
  var Eou;
  function vou(e, t, n) {
    if (t == "__proto__" && Eou) {
      Eou(e, t, {
        configurable: true,
        enumerable: true,
        value: n,
        writable: true
      });
    } else {
      e[t] = n;
    }
  }
  function Rou(e, t, n) {
    var r = e[t];
    if (!(Cou.call(e, t) && GQc(r, n)) || n === undefined && !(t in e)) {
      vou(e, t, n);
    }
  }
  var wou;
  var Cou;
  function xou(e, t, n, r) {
    var o = !n;
    n || (n = {});
    var s = -1;
    var i = t.length;
    while (++s < i) {
      var a = t[s];
      var l = r ? r(n[a], e[a], a, n, e) : undefined;
      if (l === undefined) {
        l = e[a];
      }
      if (o) {
        vou(n, a, l);
      } else {
        Rou(n, a, l);
      }
    }
    return n;
  }
  function kou(e, t) {
    return e && xou(t, $tu(t), e);
  }
  function Aou(e) {
    var t = [];
    if (e != null) {
      for (var n in Object(e)) {
        t.push(n);
      }
    }
    return t;
  }
  function Oou(e) {
    if (!gZc(e)) {
      return Aou(e);
    }
    var t = Dtu(e);
    var n = [];
    for (var r in e) {
      if (!(r == "constructor" && (t || !Pou.call(e, r)))) {
        n.push(r);
      }
    }
    return n;
  }
  var Iou;
  var Pou;
  function Dou(e) {
    return Btu(e) ? Ptu(e, true) : Oou(e);
  }
  function Mou(e, t) {
    return e && xou(t, Dou(t), e);
  }
  var bIt = {};
  __export(bIt, {
    default: () => Lou
  });
  function Lou(e, t) {
    if (t) {
      return e.slice();
    }
    var n = e.length;
    var r = zds ? zds(n) : new e.constructor(n);
    e.copy(r);
    return r;
  }
  var Kds;
  var Gds;
  var Nou;
  var Vds;
  var zds;
  function Fou(e, t) {
    var n = -1;
    var r = e.length;
    t || (t = Array(r));
    while (++n < r) {
      t[n] = e[n];
    }
    return t;
  }
  function Uou(e, t) {
    return xou(e, Feu(e), t);
  }
  var Bou;
  var $ou;
  var Hou;
  function jou(e, t) {
    return xou(e, Hou(e), t);
  }
  function qou(e) {
    return Oeu(e, Dou, Hou);
  }
  function Vou(e) {
    var t = e.length;
    var n = new e.constructor(t);
    if (t && typeof e[0] == "string" && Gou.call(e, "index")) {
      n.index = e.index;
      n.input = e.input;
    }
    return n;
  }
  var Wou;
  var Gou;
  function zou(e) {
    var t = new e.constructor(e.byteLength);
    new meu(t).set(new meu(e));
    return t;
  }
  function Kou(e, t) {
    var n = t ? zou(e.buffer) : e.buffer;
    return new e.constructor(n, e.byteOffset, e.byteLength);
  }
  function Jou(e) {
    var t = new e.constructor(e.source, You.exec(e));
    t.lastIndex = e.lastIndex;
    return t;
  }
  var You;
  function Xou(e) {
    return ips ? Object(ips.call(e)) : {};
  }
  var sps;
  var ips;
  function Qou(e, t) {
    var n = t ? zou(e.buffer) : e.buffer;
    return new e.constructor(n, e.byteOffset, e.length);
  }
  function _su(e, t, n) {
    var r = e.constructor;
    switch (t) {
      case "[object ArrayBuffer]":
        return zou(e);
      case "[object Boolean]":
      case "[object Date]":
        return new r(+e);
      case "[object DataView]":
        return Kou(e, n);
      case "[object Float32Array]":
      case "[object Float64Array]":
      case "[object Int8Array]":
      case "[object Int16Array]":
      case "[object Int32Array]":
      case "[object Uint8Array]":
      case "[object Uint8ClampedArray]":
      case "[object Uint16Array]":
      case "[object Uint32Array]":
        return Qou(e, n);
      case "[object Map]":
        return new r();
      case "[object Number]":
      case "[object String]":
        return new r(e);
      case "[object RegExp]":
        return Jou(e);
      case "[object Set]":
        return new r();
      case "[object Symbol]":
        return Xou(e);
    }
  }
  var dps;
  var bsu;
  function Ssu(e) {
    return typeof e.constructor == "function" && !Dtu(e) ? bsu(Bou(e)) : {};
  }
  function Esu(e) {
    return Beu(e) && t$e(e) == "[object Map]";
  }
  var gps;
  var vsu;
  function Csu(e) {
    return Beu(e) && t$e(e) == "[object Set]";
  }
  var Tps;
  var Rsu;
  function zcn(e, t, n, r, o, s) {
    var i;
    var a = t & 1;
    var l = t & 2;
    var c = t & 4;
    if (n) {
      i = o ? n(e, r, o, s) : n(e);
    }
    if (i !== undefined) {
      return i;
    }
    if (!gZc(e)) {
      return e;
    }
    var u = Peu(e);
    if (u) {
      if (i = Vou(e), !a) {
        return Fou(e, i);
      }
    } else {
      var d = t$e(e);
      var p = d == "[object Function]" || d == "[object GeneratorFunction]";
      if (Keu(e)) {
        return Lou(e, a);
      }
      if (d == "[object Object]" || d == "[object Arguments]" || p && !o) {
        if (i = l || p ? {} : Ssu(e), !a) {
          return l ? jou(e, Mou(i, e)) : Uou(e, kou(i, e));
        }
      } else {
        if (!zv[d]) {
          return o ? e : {};
        }
        i = _su(e, d, a);
      }
    }
    s || (s = new WQe());
    var m = s.get(e);
    if (m) {
      return m;
    }
    if (s.set(e, i), Rsu(e)) {
      e.forEach(function (g) {
        i.add(zcn(g, t, n, g, e, s));
      });
    } else if (vsu(e)) {
      e.forEach(function (g, y) {
        i.set(y, zcn(g, t, n, y, e, s));
      });
    }
    var f = c ? l ? qou : Htu : l ? Dou : $tu;
    var h = u ? undefined : f(e);
    Tou(h || e, function (g, y) {
      if (h) {
        y = g;
        g = e[y];
      }
      Rou(i, y, zcn(g, t, n, y, e, s));
    });
    return i;
  }
  var zv;
  function eiu() {
    return Zsu;
  }
  function De(e, t, n) {
    using r = eiu`JSON.stringify(${e})`;
    return JSON.stringify(e, t, n);
  }
  function Ips(e) {
    return JSON.stringify(e) + `
`;
  }
  function Pps(e) {
    using t = eiu`jsonlJoin(${e.length})`;
    let n = "";
    for (let r = 0; r < e.length; r++) {
      n += JSON.stringify(e[r]) + `
`;
    }
    return n;
  }
  function jge(e) {
    return JSON.parse(e);
  }
  function xN(e, t) {
    using n = eiu`structuredClone(${e})`;
    return structuredClone(e, t);
  }
  function vxe(e, t, n) {
    using r = eiu`fs.writeFileSync(${e}, ${t})`;
    Aps.writeFileSync(e, t, n);
  }
  var Aps;
  var Ush;
  var Zsu;
  var qt = (e, t) => {
    using n = eiu`JSON.parse(${e})`;
    return typeof t > "u" ? JSON.parse(e) : JSON.parse(e, t);
  };
  function TIt(e, t) {
    if (Rc(t) && !Pp(t) || zS(t)) {
      return;
    }
    let n = a_.resolve(t);
    let r = a_.parse(n).root;
    let o = r;
    let s = n.slice(r.length).split(/[\\/]+/).filter(Boolean);
    let i = 0;
    let a = 64;
    while (s.length > 0 && i < a) {
      let l = a_.join(o, s[0]);
      if (zS(l)) {
        return s.length === 1 ? l : a_.join(l, ...s.slice(1));
      }
      let c;
      try {
        c = e.lstatSync(l);
      } catch {
        return;
      }
      if (!c.isSymbolicLink()) {
        s.shift();
        o = l;
        continue;
      }
      i++;
      let u;
      try {
        u = e.readlinkSync(l);
      } catch {
        return;
      }
      let d = a_.isAbsolute(u) ? u : a_.resolve(o, u);
      if (Rc(d) && !Pp(d) || zS(d)) {
        s.shift();
        return s.length === 0 ? d : a_.join(d, ...s);
      }
      s.shift();
      let p = a_.parse(d).root || a_.sep;
      o = p;
      s = [...d.slice(p.length).split(/[\\/]+/).filter(Boolean), ...s];
    }
    return;
  }
  function qd(e, t) {
    if (Rc(t) && !Pp(t) || zS(t)) {
      return {
        resolvedPath: t,
        isSymlink: false,
        isCanonical: false
      };
    }
    let n = TIt(e, t);
    if (n !== undefined) {
      return {
        resolvedPath: n,
        isSymlink: true,
        isCanonical: false
      };
    }
    try {
      let r = e.realpathSync(t);
      return {
        resolvedPath: r,
        isSymlink: r !== t,
        isCanonical: true
      };
    } catch (r) {
      return {
        resolvedPath: t,
        isSymlink: false,
        isCanonical: false
      };
    }
  }
  function dte(e, t, n) {
    let {
      resolvedPath: r
    } = qd(e, t);
    if (n.vZc(r)) {
      return true;
    }
    n.add(r);
    return false;
  }
  function Fae(e, t) {
    if (Rc(t) && !Pp(t) || zS(t)) {
      return t;
    }
    let n = TIt(e, t);
    if (n !== undefined) {
      return n;
    }
    let r = t;
    let o = [];
    while (r !== a_.dirname(r)) {
      let s;
      let i;
      try {
        s = e.readlinkSync(r);
      } catch (a) {
        i = en(a);
      }
      if (s !== undefined) {
        let a = a_.isAbsolute(s) ? s : a_.resolve(a_.dirname(r), s);
        if (Rc(a) && !Pp(a) || zS(a)) {
          return o.length === 0 ? a : a_.join(a, ...o);
        }
        try {
          let l = e.realpathSync(r);
          return o.length === 0 ? l : a_.join(l, ...o);
        } catch {
          let l = r;
          let c = 0;
          let u = 64;
          while (c < u) {
            let d;
            try {
              d = e.readlinkSync(l);
            } catch {
              break;
            }
            let p = a_.isAbsolute(d) ? d : a_.resolve(a_.dirname(l), d);
            if (Rc(p) && !Pp(p) || zS(p)) {
              l = p;
              break;
            }
            let m;
            try {
              m = e.lstatSync(p);
            } catch {
              l = p;
              break;
            }
            if (!m.isSymbolicLink()) {
              l = p;
              break;
            }
            l = p;
            c++;
          }
          return o.length === 0 ? l : a_.join(l, ...o);
        }
      }
      if (i === "ENOENT") {
        o.unshift(a_.basename(r));
        r = a_.dirname(r);
        continue;
      }
      try {
        let a = e.realpathSync(r);
        if (a !== r) {
          return o.length === 0 ? a : a_.join(a, ...o);
        }
      } catch {}
      return;
    }
    return;
  }
  function fg(e) {
    let t = e;
    if (t === "~") {
      t = wRr.homedir().normalize("NFC");
    } else if (t.startsWith("~/")) {
      t = a_.join(wRr.homedir().normalize("NFC"), t.slice(2));
    }
    let n = new Set();
    let r = zt();
    if (n.add(t), Rc(t) && !Pp(t) || zS(t)) {
      return Array.from(n);
    }
    let o = TIt(r, t);
    if (o !== undefined) {
      n.add(o);
      return Array.from(n);
    }
    try {
      let a = t;
      let l = new Set();
      let c = 64;
      for (let u = 0; u < c; u++) {
        if (l.vZc(a)) {
          break;
        }
        l.add(a);
        let d;
        let p;
        try {
          d = r.readlinkSync(a);
        } catch (f) {
          p = en(f);
        }
        if (d === undefined) {
          if (p === "ENOENT") {
            if (a === t) {
              let f = Fae(r, t);
              if (f !== undefined) {
                n.add(f);
              }
            }
          }
          break;
        }
        let m = a_.isAbsolute(d) ? d : a_.resolve(a_.dirname(a), d);
        if (n.add(m), Rc(m) && !Pp(m) || zS(m)) {
          return Array.from(n);
        }
        a = m;
      }
    } catch {}
    let {
      resolvedPath: s,
      isSymlink: i
    } = qd(r, t);
    if (i && s !== t) {
      n.add(s);
    }
    return Array.from(n);
  }
  function zt() {
    return CRr;
  }
  async function Ycn(e, t, n) {
    await using r = await bf.open(e, "r");
    let o = (await r.stat()).size;
    if (o <= t) {
      return null;
    }
    let s = Math.min(o - t, n);
    let i = Buffer.allocUnsafe(s);
    let a = 0;
    while (a < s) {
      let {
        bytesRead: l
      } = await r.read(i, a, s - a, t + a);
      if (l === 0) {
        break;
      }
      a += l;
    }
    return {
      content: i.toString("utf8", 0, a),
      bytesRead: a,
      bytesTotal: o
    };
  }
  async function LA(e, t) {
    await using n = await bf.open(e, "r");
    let r = (await n.stat()).size;
    if (r === 0) {
      return {
        content: "",
        bytesRead: 0,
        bytesTotal: 0
      };
    }
    let o = Math.max(0, r - t);
    let s = r - o;
    let i = Buffer.allocUnsafe(s);
    let a = 0;
    while (a < s) {
      let {
        bytesRead: l
      } = await n.read(i, a, s - a, o + a);
      if (l === 0) {
        break;
      }
      a += l;
    }
    return {
      content: i.toString("utf8", 0, a),
      bytesRead: a,
      bytesTotal: r
    };
  }
  async function* Ops(e, t = 65536) {
    let n = await bf.open(e, "r");
    let r = Buffer.alloc(t);
    let o = 0;
    let s = [];
    let i = 0;
    try {
      while (true) {
        let {
          bytesRead: a
        } = await n.read(r, 0, t, o);
        if (a === 0) {
          break;
        }
        o += a;
        let l = r.subarray(0, a);
        let c = 0;
        while (c < a) {
          let u = l.indexOf(10, c);
          if (u === -1) {
            s.push(Buffer.from(l.subarray(c)));
            i += a - c;
            break;
          }
          if (i === 0) {
            yield l.subarray(c, u);
          } else {
            yield Buffer.concat([...s, l.subarray(c, u)], i + (u - c));
            s = [];
            i = 0;
          }
          c = u + 1;
        }
      }
    } finally {
      await n.close();
    }
    if (i > 0) {
      yield s.length === 1 ? s[0] : Buffer.concat(s, i);
    }
  }
  async function* Jcn(e) {
    let n = await bf.open(e, "r");
    try {
      let o = (await n.stat()).size;
      let s = Buffer.alloc(0);
      let i = Buffer.alloc(4096);
      while (o > 0) {
        let a = Math.min(4096, o);
        o -= a;
        await n.read(i, 0, a, o);
        let l = Buffer.concat([i.subarray(0, a), s]);
        let c = l.indexOf(10);
        if (c === -1) {
          s = l;
          continue;
        }
        s = Buffer.from(l.subarray(0, c));
        let u = l.toString("utf8", c + 1).split(`
`);
        for (let d = u.length - 1; d >= 0; d--) {
          let p = u[d];
          if (p) {
            yield p;
          }
        }
      }
      if (s.length > 0) {
        yield s.toString("utf8");
      }
    } finally {
      await n.close();
    }
  }
  var Hp;
  var bf;
  var wRr;
  var a_;
  var CRr;
  var Mps = {};
  __export(Mps, {
    setBgExitCause: () => setBgExitCause,
    readAndClearBgExitCause: () => readAndClearBgExitCause
  });
  function setBgExitCause(e, t) {
    let n = t ?? process.env.CLAUDE_JOB_DIR;
    if (!n) {
      return;
    }
    try {
      Uae.writeFileSync(RRr.join(n, "exit-cause"), e);
    } catch {}
  }
  function readAndClearBgExitCause(e) {
    let t = RRr.join(e, "exit-cause");
    try {
      let n = Uae.lstatSync(t);
      if (!n.isFile() || n.size > 65536) {
        try {
          Uae.rmSync(t, {
            recursive: true,
            force: true
          });
        } catch {}
        return;
      }
      let r = Uae.readFileSync(t, "utf8");
      Uae.unlinkSync(t);
      return r;
    } catch {
      return;
    }
  }
  var Uae;
  var RRr;
  var M7 = __lazy(() => {
    Uae = require("fs");
    RRr = require("path");
  });
  var F$e = {};
  __export(F$e, {
    writeToStdout: () => writeToStdout,
    writeToStderr: () => writeToStderr,
    registerProcessIOErrorHandlers: () => registerProcessIOErrorHandlers,
    peekForStdinData: () => peekForStdinData,
    iterateStreamUntilClose: () => iterateStreamUntilClose,
    handleStreamGoneErrors: () => handleStreamGoneErrors,
    exitWithError: () => exitWithError
  });
  function handleStreamGoneErrors(e, t) {
    e.on("error", n => {
      if (n.code !== undefined && niu.vZc(n.code)) {
        try {
          e.destroy?.();
        } catch {}
        t?.(n.code);
      }
    });
  }
  function registerProcessIOErrorHandlers(e) {
    handleStreamGoneErrors(process.stdin, t => e("stdin", t));
    handleStreamGoneErrors(process.stdout, t => e("stdout", t));
    handleStreamGoneErrors(process.stderr);
  }
  function Nps(e, t) {
    if (e.destroyed) {
      return;
    }
    e.write(t);
  }
  function writeToStdout(e) {
    Nps(process.stdout, e);
  }
  function writeToStderr(e) {
    Nps(process.stderr, e);
  }
  function exitWithError(e) {
    console.error(e);
    setBgExitCause("exit_with_error");
    process.exit(1);
  }
  function peekForStdinData(e, t) {
    let n = e;
    if (n.readableEnded || n.destroyed) {
      return Promise.resolve(false);
    }
    return new Promise(r => {
      let o = l => {
        clearTimeout(a);
        e.off("end", s);
        e.off("close", s);
        e.off("data", i);
        r(l);
      };
      let s = () => o(false);
      let i = () => {
        if (clearTimeout(a), n.readableEnded || n.destroyed) {
          o(false);
        }
      };
      let a = setTimeout(o, t, true);
      e.once("end", s);
      e.once("close", s);
      e.once("data", i);
    });
  }
  async function* iterateStreamUntilClose(e) {
    if (e.readableEnded || e.destroyed) {
      return;
    }
    let t = Symbol("stream-closed");
    let n = false;
    let r = null;
    let o = () => {
      n = true;
      r?.();
    };
    e.once("close", o);
    let s = e[Symbol.asyncIterator]();
    try {
      while (!n) {
        let i = s.next();
        i.catch(() => {});
        let a = new Promise(c => {
          r = () => c(t);
        });
        let l = await Promise.race([i, a]);
        if (r = null, l === t || l.done) {
          return;
        }
        yield String(l.value);
      }
    } finally {
      e.off("close", o);
      s.return?.().catch(() => {});
    }
  }
  var niu;
  var OD = __lazy(() => {
    M7();
    niu = new Set(["EPIPE", "EIO", "ENXIO", "EBADF"]);
  });
  function hm(e, t) {
    return e.repeat(Number.isFinite(t) && t > 0 ? t : 0);
  }
  function FA(e) {
    return e.replace(/[.*+?^${}()|[\]\\]/g, "\\$&");
  }
  function DD(e) {
    return e.charAt(0).toUpperCase() + e.slice(1);
  }
  function un(e, t, n = t + "s") {
    return e === 1 ? t : n;
  }
  function wxe(e, t) {
    if (e.length <= t) {
      return e;
    }
    let n = [];
    for (let r of e) {
      if (n.length >= t) {
        break;
      }
      n.push(r);
    }
    return n.join("");
  }
  function pC(e, t) {
    if (e.length <= t) {
      return e;
    }
    let n = e.slice(0, t);
    let r = n.charCodeAt(t - 1);
    return r >= 55296 && r <= 56319 ? n.slice(0, -1) : n;
  }
  function qge(e, t) {
    if (e.length <= t) {
      return e;
    }
    let n = e.slice(-t);
    let r = n.charCodeAt(0);
    return r >= 56320 && r <= 57343 ? n.slice(1) : n;
  }
  function Qcn(e) {
    if (Xcn) {
      return Xcn(e);
    }
    return !oiu.test(e);
  }
  function Zcn(e) {
    if (Lps) {
      return Lps(e);
    }
    return e.replace(Fps, "\uFFFD");
  }
  function Ups(e) {
    if (Xcn && Xcn(e)) {
      return e;
    }
    return e.replace(Fps, "");
  }
  function QZe(e) {
    let t = false;
    let n = [e];
    while (n.length > 0) {
      let r = n.pop();
      if (Array.isArray(r)) {
        for (let o = 0; o < r.length; o++) {
          let s = r[o];
          if (typeof s === "string") {
            if (!Qcn(s)) {
              r[o] = Zcn(s);
              t = true;
            }
          } else if (s !== null && typeof s === "object") {
            n.push(s);
          }
        }
      } else if (r !== null && typeof r === "object") {
        let o = r;
        for (let s of Object.keys(o)) {
          let i = o[s];
          if (typeof i === "string") {
            if (!Qcn(i)) {
              o[s] = Zcn(i);
              t = true;
            }
          } else if (i !== null && typeof i === "object") {
            n.push(i);
          }
        }
      }
    }
    return t;
  }
  function eun(e) {
    let t = [e];
    while (t.length > 0) {
      let n = t.pop();
      if (Array.isArray(n)) {
        for (let r = 0; r < n.length; r++) {
          let o = n[r];
          if (typeof o === "string") {
            if (!Qcn(o)) {
              return true;
            }
          } else if (o !== null && typeof o === "object") {
            t.push(o);
          }
        }
      } else if (n !== null && typeof n === "object") {
        let r = n;
        for (let o of Object.keys(r)) {
          let s = r[o];
          if (typeof s === "string") {
            if (!Qcn(s)) {
              return true;
            }
          } else if (s !== null && typeof s === "object") {
            t.push(s);
          }
        }
      }
    }
    return false;
  }
  function ii(e, t) {
    let n = e.indexOf(t);
    return n === -1 ? e : e.slice(0, n);
  }
  function Ad(e) {
    return ii(e, `
`);
  }
  function Ru(e, t, n = 0) {
    let r = 0;
    let o = e.indexOf(t, n);
    while (o !== -1) {
      r++;
      o = e.indexOf(t, o + 1);
    }
    return r;
  }
  function N7(e) {
    return e.replace(/[\uFF10-\uFF19]/g, t => String.fromCharCode(t.charCodeAt(0) - 65248));
  }
  function Bae(e) {
    return e.replaceAll("\u3000", " ");
  }
  function tun(e, t = ",", n = 33554432) {
    let o = "";
    for (let s of e) {
      let i = o ? t : "";
      let a = i + s;
      if (o.length + a.length <= n) {
        o += a;
      } else {
        let l = n - o.length - i.length - 14;
        if (l > 0) {
          o += i + s.slice(0, l) + "...[truncated]";
        } else {
          o += "...[truncated]";
        }
        return o;
      }
    }
    return o;
  }
  class vIt {
    maxSize;
    content = "";
    isTruncated = false;
    totalBytesReceived = 0;
    constructor(e = 33554432) {
      this.maxSize = e;
    }
    append(e) {
      let t = typeof e === "string" ? e : e.toString();
      if (this.totalBytesReceived += t.length, this.isTruncated && this.content.length >= this.maxSize) {
        return;
      }
      if (this.content.length + t.length > this.maxSize) {
        let n = this.maxSize - this.content.length;
        if (n > 0) {
          this.content += t.slice(0, n);
        }
        this.isTruncated = true;
      } else {
        this.content += t;
      }
    }
    toString() {
      if (!this.isTruncated) {
        return this.content;
      }
      let e = this.totalBytesReceived - this.maxSize;
      let t = Math.round(e / 1024);
      return this.content + `
... [output truncated - ${t}KB removed]`;
    }
    clear() {
      this.content = "";
      this.isTruncated = false;
      this.totalBytesReceived = 0;
    }
    get length() {
      return this.content.length;
    }
    get truncated() {
      return this.isTruncated;
    }
    get totalBytes() {
      return this.totalBytesReceived;
    }
  }
  function nun(e, t) {
    let n = e.split(`
`);
    if (n.length <= t) {
      return e;
    }
    return n.slice(0, t).join(`
`) + "\u2026";
  }
  function Wge(e, t) {
    if (e.length <= t) {
      return e;
    }
    let n = pC(e, t);
    return `${n}\u2026 [+${e.length - n.length} chars]`;
  }
  var oiu;
  var Fps;
  var Xcn;
  var Lps;
  var Zn = __lazy(() => {
    oiu = /[\uD800-\uDBFF](?![\uDC00-\uDFFF])|(?<![\uD800-\uDBFF])[\uDC00-\uDFFF]/;
    Fps = /[\uD800-\uDBFF](?![\uDC00-\uDFFF])|(?<![\uD800-\uDBFF])[\uDC00-\uDFFF]/g;
    Xcn = typeof String.prototype.isWellFormed === "function" ? Function.prototype.call.bind(String.prototype.isWellFormed) : undefined;
    Lps = typeof String.prototype.toWellFormed === "function" ? Function.prototype.call.bind(String.prototype.toWellFormed) : undefined;
  });
  function Vps(e) {
    return aiu.map(t => ({
      id: t.id,
      confidence: t.confidence,
      re: new RegExp(t.source, e ? (t.flags ?? "").replace("g", "") + "g" : t.flags ?? "")
    }));
  }
  function ZZe(e) {
    jps ??= Vps(false);
    let t = [];
    for (let n of jps) {
      if (n.confidence === "high" && n.re.test(e)) {
        t.push({
          ruleId: n.id,
          label: ciu(n.id)
        });
      }
    }
    return t;
  }
  function Lc(e) {
    qps ??= Vps(true);
    for (let t of qps) {
      e = e.replace(t.re, (n, r) => {
        if (typeof r !== "string") {
          return "[REDACTED]";
        }
        let o = r.length >= 2 && (r[0] === '"' || r[0] === "'") && r.at(-1) === r[0] ? r[0] : "";
        let s = n.lastIndexOf(r);
        return `${n.slice(0, s)}${o}[REDACTED]${o}${n.slice(s + r.length)}`;
      });
    }
    return e;
  }
  function Gge(e) {
    if (typeof e === "string") {
      return Lc(e);
    }
    if (Array.isArray(e)) {
      return e.map(Gge);
    }
    if (e !== null && typeof e === "object") {
      let t = {};
      for (let [n, r] of Object.entries(e)) {
        if (typeof r === "string") {
          let o = `${n}: `;
          let s = Lc(o + r);
          t[n] = s.startsWith(o) ? s.slice(o.length) : Lc(r);
        } else {
          t[n] = Gge(r);
        }
      }
      return t;
    }
    return e;
  }
  function IRr(e) {
    let t = {};
    for (let [n, r] of Object.entries(e)) {
      t[n] = Wps.test(n) ? "[REDACTED]" : r;
    }
    return t;
  }
  function Vge(e) {
    if (!e) {
      return e;
    }
    try {
      let t = new URL(e);
      if (!t.host) {
        throw TypeError("opaque");
      }
      t.username = "";
      t.password = "";
      t.search = "";
      t.hash = "";
      return t.toString().replace(/\/$/, "");
    } catch {
      let t = ii(ii(e, "?"), "#");
      let n = t.lastIndexOf("@");
      return n >= 0 ? t.slice(n + 1) : t;
    }
  }
  function ciu(e) {
    return e.split("-").map(t => liu[t] ?? DD(t)).join(" ");
  }
  var Wps;
  var siu;
  var Hps;
  var iiu;
  var aiu;
  var jps = null;
  var qps = null;
  var liu;
  var Kv = __lazy(() => {
    Zn();
    Wps = /api[_-]?key|secret|token|password|passwd|credential|bearer|authorization|auth[_-]?header|cookie|session[_-]?(?:id|key)|connection[_-]?string|(?:private|ssh|encryption|signing|access|deploy|master|license)[_-]?key|client[_-]?secret/i;
    siu = `[^\\s-]{0,4}${"-----BEGIN[ A-Z0-9_-]{0,100}PRIVATE KEY(?: BLOCK)?-----[\\s\\S-]{64,}?-----END[ A-Z0-9_-]{0,100}PRIVATE KEY(?: BLOCK)?-----"}['"\`]?`;
    Hps = `\\[REDACTED\\]|"[^"]*"|'[^']*'|(?:Bearer|Basic)\\s+(?:\\[REDACTED\\]|${"[^\\s,;&}\\])]+"})|${siu}|${"[^\\s,;&}\\])]+"}`;
    iiu = ["sk", "ant", "api"].join("-");
    aiu = [{
      id: "url-userinfo",
      source: ":\\/\\/([^/@\\s]+)@",
      confidence: "low"
    }, {
      id: "gcp-service-account",
      source: "\\b([a-z0-9-]+@[a-z0-9-]+\\.iam\\.gserviceaccount\\.com)\\b",
      flags: "i",
      confidence: "low"
    }, {
      id: "loose-anthropic-key",
      source: "\\b(sk-ant-?[\\w-]{10,})",
      confidence: "low"
    }, {
      id: "http-auth-scheme",
      source: "\\b(?:Bearer|Basic)\\s+([A-Za-z0-9+/=._~-]{20,})",
      flags: "i",
      confidence: "low"
    }, {
      id: "loose-jwt",
      source: "\\b(eyJ[A-Za-z0-9_-]{10,}\\.[A-Za-z0-9_-]{10,}\\.[A-Za-z0-9_-]{10,})",
      confidence: "low"
    }, {
      id: "sensitive-assign",
      source: `(?:${Wps.source})[\\w.-]*["']?\\s*[=:]\\s*(${Hps})`,
      flags: "i",
      confidence: "low"
    }, {
      id: "cloud-env-var",
      source: `\\b(?:AWS|GOOGLE|GCP|GCLOUD|AZURE)_\\w+\\s*[=:]\\s*(${Hps})`,
      flags: "i",
      confidence: "low"
    }, {
      id: "aws-access-token",
      source: "\\b((?:A3T[A-Z0-9]|AKIA|ASIA|ABIA|ACCA)[A-Z2-7]{16})\\b",
      confidence: "high"
    }, {
      id: "gcp-api-key",
      source: "\\b(AIza[\\w-]{35})(?![\\w-])",
      confidence: "high"
    }, {
      id: "google-oauth-client-secret",
      source: "\\bGOCSPX-[\\w-]{28}(?![\\w-])",
      confidence: "high"
    }, {
      id: "azure-ad-client-secret",
      source: `(?:^|[\\\\'"\\x60\\s>=:(,)])([a-zA-Z0-9_~.]{3}\\dQ~[a-zA-Z0-9_~.-]{31,34})(?:$|[\\\\'"\\x60\\s<),])`,
      confidence: "high"
    }, {
      id: "digitalocean-pat",
      source: `\\b(dop_v1_[a-f0-9]{64})(?:[\\x60'"\\s;]|\\\\[nr]|$)`,
      confidence: "high"
    }, {
      id: "digitalocean-access-token",
      source: `\\b(doo_v1_[a-f0-9]{64})(?:[\\x60'"\\s;]|\\\\[nr]|$)`,
      confidence: "high"
    }, {
      id: "anthropic-api-key",
      source: `\\b(${iiu}03-[a-zA-Z0-9_\\-]{93}AA)(?:[\\x60'"\\s;]|\\\\[nr]|$)`,
      confidence: "high"
    }, {
      id: "anthropic-admin-api-key",
      source: `\\b(sk-ant-admin01-[a-zA-Z0-9_\\-]{93}AA)(?:[\\x60'"\\s;]|\\\\[nr]|$)`,
      confidence: "high"
    }, {
      id: "openai-api-key",
      source: "sk-[A-Za-z0-9_-]{8,200}T3BlbkFJ[A-Za-z0-9_-]{8,200}",
      confidence: "high"
    }, {
      id: "openai-legacy-api-key",
      source: "\\bsk-[a-zA-Z0-9]{48}(?![a-zA-Z0-9])",
      confidence: "high"
    }, {
      id: "huggingface-access-token",
      source: `\\b(hf_[a-zA-Z]{34})(?:[\\x60'"\\s;]|\\\\[nr]|$)`,
      confidence: "high"
    }, {
      id: "supabase-secret-key",
      source: "\\bsb_secret_[A-Za-z0-9_-]{20,}",
      confidence: "high"
    }, {
      id: "supabase-access-token",
      source: "\\bsbp_[a-z0-9]{40,}",
      confidence: "high"
    }, {
      id: "github-pat",
      source: "ghp_[0-9a-zA-Z]{36}",
      confidence: "high"
    }, {
      id: "github-fine-grained-pat",
      source: "github_pat_\\w{82}",
      confidence: "high"
    }, {
      id: "github-app-token",
      source: "(?:ghu|ghs)_[0-9a-zA-Z]{36}",
      confidence: "high"
    }, {
      id: "github-oauth",
      source: "gho_[0-9a-zA-Z]{36}",
      confidence: "high"
    }, {
      id: "github-refresh-token",
      source: "ghr_[0-9a-zA-Z]{36}",
      confidence: "high"
    }, {
      id: "gitlab-pat",
      source: "glpat-[\\w-]{20}",
      confidence: "high"
    }, {
      id: "gitlab-deploy-token",
      source: "gldt-[0-9a-zA-Z_\\-]{20}",
      confidence: "high"
    }, {
      id: "slack-bot-token",
      source: "xoxb-[0-9]{10,13}-[0-9]{10,13}[a-zA-Z0-9-]*",
      confidence: "high"
    }, {
      id: "slack-user-token",
      source: "xox[pe](?:-[0-9]{10,13}){3}-[a-zA-Z0-9-]{28,34}",
      confidence: "high"
    }, {
      id: "slack-app-token",
      source: "xapp-\\d-[A-Z0-9]+-\\d+-[a-z0-9]+",
      flags: "i",
      confidence: "high"
    }, {
      id: "twilio-api-key",
      source: "SK[0-9a-fA-F]{32}",
      confidence: "high"
    }, {
      id: "sendgrid-api-token",
      source: `\\b(SG\\.[a-zA-Z0-9=_\\-.]{66})(?:[\\x60'"\\s;]|\\\\[nr]|$)`,
      confidence: "high"
    }, {
      id: "npm-access-token",
      source: `\\b(npm_[a-zA-Z0-9]{36})(?:[\\x60'"\\s;]|\\\\[nr]|$)`,
      confidence: "high"
    }, {
      id: "pypi-upload-token",
      source: "pypi-AgEIcHlwaS5vcmc[\\w-]{50,1000}",
      confidence: "high"
    }, {
      id: "databricks-api-token",
      source: `\\b(dapi[a-f0-9]{32}(?:-\\d)?)(?:[\\x60'"\\s;]|\\\\[nr]|$)`,
      confidence: "high"
    }, {
      id: "hashicorp-tf-api-token",
      source: "[a-zA-Z0-9]{14}\\.atlasv1\\.[a-zA-Z0-9\\-_=]{60,70}",
      confidence: "high"
    }, {
      id: "pulumi-api-token",
      source: `\\b(pul-[a-f0-9]{40})(?:[\\x60'"\\s;]|\\\\[nr]|$)`,
      confidence: "high"
    }, {
      id: "postman-api-token",
      source: `\\b(PMAK-[a-fA-F0-9]{24}-[a-fA-F0-9]{34})(?:[\\x60'"\\s;]|\\\\[nr]|$)`,
      confidence: "high"
    }, {
      id: "grafana-api-key",
      source: `\\b(eyJrIjoi[A-Za-z0-9+/]{70,400}={0,3})(?:[\\x60'"\\s;]|\\\\[nr]|$)`,
      confidence: "high"
    }, {
      id: "grafana-cloud-api-token",
      source: `\\b(glc_[A-Za-z0-9+/]{32,400}={0,3})(?:[\\x60'"\\s;]|\\\\[nr]|$)`,
      confidence: "high"
    }, {
      id: "grafana-service-account-token",
      source: `\\b(glsa_[A-Za-z0-9]{32}_[A-Fa-f0-9]{8})(?:[\\x60'"\\s;]|\\\\[nr]|$)`,
      confidence: "high"
    }, {
      id: "sentry-user-token",
      source: `\\b(sntryu_[a-f0-9]{64})(?:[\\x60'"\\s;]|\\\\[nr]|$)`,
      confidence: "high"
    }, {
      id: "sentry-org-token",
      source: "\\bsntrys_eyJpYXQiO[a-zA-Z0-9+/]{10,200}(?:LCJyZWdpb25fdXJs|InJlZ2lvbl91cmwi|cmVnaW9uX3VybCI6)[a-zA-Z0-9+/]{10,200}={0,2}_[a-zA-Z0-9+/]{43}",
      confidence: "high"
    }, {
      id: "stripe-access-token",
      source: `\\b((?:sk|rk)_(?:test|live|prod)_[a-zA-Z0-9]{10,99})(?:[\\x60'"\\s;]|\\\\[nr]|$)`,
      confidence: "high"
    }, {
      id: "shopify-access-token",
      source: "shpat_[a-fA-F0-9]{32}",
      confidence: "high"
    }, {
      id: "shopify-shared-secret",
      source: "shpss_[a-fA-F0-9]{32}",
      confidence: "high"
    }, {
      id: "private-key",
      source: "-----BEGIN[ A-Z0-9_-]{0,100}PRIVATE KEY(?: BLOCK)?-----[\\s\\S-]{64,}?-----END[ A-Z0-9_-]{0,100}PRIVATE KEY(?: BLOCK)?-----",
      flags: "i",
      confidence: "high"
    }];
    liu = {
      aws: "AWS",
      gcp: "GCP",
      api: "API",
      pat: "PAT",
      ad: "AD",
      tf: "TF",
      oauth: "OAuth",
      npm: "NPM",
      pypi: "PyPI",
      jwt: "JWT",
      github: "GitHub",
      gitlab: "GitLab",
      openai: "OpenAI",
      digitalocean: "DigitalOcean",
      huggingface: "HuggingFace",
      hashicorp: "HashiCorp",
      sendgrid: "SendGrid"
    };
  });
  var Zps = {};
  __export(Zps, {
    setHasFormattedOutput: () => setHasFormattedOutput,
    resetDebugLogRotationForTest: () => resetDebugLogRotationForTest,
    resetDebugCaches: () => resetDebugCaches,
    maybeRotateDebugLog: () => maybeRotateDebugLog,
    logForDebugging: () => logForDebugging,
    logAntError: () => logAntError,
    isDebugToStdErr: () => isDebugToStdErr,
    isDebugMode: () => isDebugMode,
    getMinDebugLogLevel: () => getMinDebugLogLevel,
    getHasFormattedOutput: () => getHasFormattedOutput,
    getDebugLogPath: () => getDebugLogPath,
    getDebugFilter: () => getDebugFilter,
    getDebugFilePath: () => getDebugFilePath,
    getDebugExitHandlerForTest: () => getDebugExitHandlerForTest,
    flushDebugLogs: () => flushDebugLogs,
    enableDebugLogging: () => enableDebugLogging
  });
  function sun() {
    if (typeof process > "u" || !Array.isArray(process.argv)) {
      return [];
    }
    let e = process.argv.indexOf("--");
    return e === -1 ? process.argv : process.argv.slice(0, e);
  }
  function enableDebugLogging() {
    let e = isDebugMode() || false;
    Kps = true;
    isDebugMode.cache.clear?.();
    return e;
  }
  function resetDebugCaches() {
    tet = null;
    getMinDebugLogLevel.cache.clear?.();
    isDebugMode.cache.clear?.();
    getDebugFilter.cache.clear?.();
    isDebugToStdErr.cache.clear?.();
    getDebugFilePath.cache.clear?.();
    Cxe?.dispose();
    Cxe = null;
    Qps.cache.clear?.();
    U$e = -1;
    wIt = false;
    oun = null;
  }
  function zps(e) {
    return ate(e) ? null : $ae.resolve(e);
  }
  function uiu(e) {
    if (!isDebugMode()) {
      return false;
    }
    if (typeof process > "u" || typeof process.versions > "u" || typeof process.versions.node > "u") {
      return false;
    }
    let t = getDebugFilter();
    return lus(e, t);
  }
  function setHasFormattedOutput(e) {
    LRr = e;
  }
  function getHasFormattedOutput() {
    return LRr;
  }
  function getDebugExitHandlerForTest() {
    return ORr;
  }
  async function maybeRotateDebugLog(e, t, n = 10485760) {
    if (U$e < 0) {
      U$e = await OB.stat(e).then(r => r.size).catch(() => 0);
    } else {
      U$e += t;
    }
    if (U$e <= n || wIt) {
      return;
    }
    wIt = true;
    try {
      let r = e.endsWith(".txt") ? `${e.slice(0, -4)}.1.txt` : `${e}.1`;
      try {
        await OB.rename(e, r);
      } catch (o) {
        if (!fn(o)) {
          await OB.unlink(r).catch(() => {});
          await OB.rename(e, r).catch(() => OB.unlink(e).catch(() => {}));
        }
      }
      U$e = 0;
    } finally {
      wIt = false;
    }
  }
  function resetDebugLogRotationForTest() {
    U$e = -1;
    wIt = false;
  }
  function Jps(e) {
    oun = $ae.join(e, `${getSessionId()}.txt`);
    return oun;
  }
  async function fiu(e, t, n, r) {
    if (e) {
      await OB.mkdir(t, {
        recursive: true
      }).catch(() => {});
    }
    let o = n;
    try {
      await OB.appendFile(n, r);
    } catch (s) {
      if (!Nae(s)) {
        throw s;
      }
      o = Jps(n);
      await OB.appendFile(o, r);
    }
    await maybeRotateDebugLog(o, Buffer.byteLength(r)).catch(Xps);
    Qps();
  }
  function Xps() {}
  function hiu() {
    eet.shift();
  }
  function giu() {
    if (!Cxe) {
      let e = null;
      if (Cxe = wZe({
        writeFn: t => {
          if (tet) {
            eet.push(t);
            tet();
            return;
          }
          let n = getDebugLogPath();
          let r = $ae.dirname(n);
          let o = e !== r;
          e = r;
          eet.push(t);
          run = run.then(fiu.bind(null, o, r, n, t)).catch(Xps).then(hiu);
        },
        flushIntervalMs: 1000,
        maxBufferSize: 100,
        immediateMode: isDebugMode()
      }), Ti(async () => {
        Cxe?.dispose();
        await run;
      }), !ORr) {
        process.on("exit", ORr = () => {
          tet = () => {
            if (eet.length === 0) {
              return;
            }
            let t = eet.join("");
            eet.length = 0;
            let n = getDebugLogPath();
            try {
              zt().mkdirSync($ae.dirname(n));
            } catch {}
            try {
              zt().appendFileSync(n, t);
            } catch (r) {
              if (Nae(r)) {
                try {
                  zt().appendFileSync(Jps(n), t);
                } catch {}
              }
            }
          };
          Cxe?.flush();
          tet();
        });
      }
    }
    return Cxe;
  }
  async function flushDebugLogs() {
    Cxe?.flush();
    await run;
  }
  function logForDebugging(e, {
    level: t
  } = {
    level: "debug"
  }) {
    if (PRr[t] < PRr[getMinDebugLogLevel()]) {
      return;
    }
    if (!uiu(e)) {
      return;
    }
    if (LRr && e.includes(`
`)) {
      e = De(e);
    }
    let r = `${new Date().toISOString()} [${t.toUpperCase()}] ${Lc(e.trim())}
`;
    if (isDebugToStdErr()) {
      writeToStderr(r);
      return;
    }
    let o = giu();
    if (o.write(r), tet) {
      o.flush();
    }
  }
  function getDebugLogPath() {
    return getDebugFilePath() ?? oun ?? process.env.CLAUDE_CODE_DEBUG_LOGS_DIR ?? $ae.join(er(), "debug", `${getSessionId()}.txt`);
  }
  function logAntError(e, t) {
    return;
  }
  var OB;
  var $ae;
  var PRr;
  var getMinDebugLogLevel;
  var Kps = false;
  var isDebugMode;
  var getDebugFilter;
  var isDebugToStdErr;
  var getDebugFilePath;
  var LRr = false;
  var Cxe = null;
  var run;
  var eet;
  var tet = null;
  var ORr = null;
  var U$e = -1;
  var wIt = false;
  var oun = null;
  var Qps;
  var je = __lazy(() => {
    at();
    mm();
    hd();
    cus();
    gn();
    dt();
    OD();
    Kv();
    OB = require("fs/promises");
    $ae = require("path");
    PRr = {
      verbose: 0,
      debug: 1,
      info: 2,
      warn: 3,
      error: 4
    };
    getMinDebugLogLevel = TEr(() => {
      let e = process.env.CLAUDE_CODE_DEBUG_LOG_LEVEL?.toLowerCase().trim();
      if (e && Object.hasOwn(PRr, e)) {
        return e;
      }
      return "debug";
    });
    isDebugMode = TEr(() => {
      let e = sun();
      return Kps || st(process.env.DEBUG) || st(process.env.DEBUG_SDK) || e.includes("--debug") || e.includes("-d") || isDebugToStdErr() || e.some(t => t.startsWith("--debug=")) || getDebugFilePath() !== null;
    });
    getDebugFilter = TEr(() => {
      let e = sun().find(n => n.startsWith("--debug="));
      if (!e) {
        return null;
      }
      let t = e.substring(8);
      return aus(t);
    });
    isDebugToStdErr = TEr(() => {
      let e = sun();
      return e.includes("--debug-to-stderr") || e.includes("-d2e");
    });
    getDebugFilePath = TEr(() => {
      let e = sun();
      for (let t = 0; t < e.length; t++) {
        let n = e[t];
        if (n.startsWith("--debug-file=")) {
          return zps(n.substring(13));
        }
        if (n === "--debug-file" && t + 1 < e.length) {
          return zps(e[t + 1]);
        }
      }
      return null;
    });
    run = Promise.resolve();
    eet = [];
    Qps = TEr(async () => {
      try {
        let e = getDebugLogPath();
        let t = $ae.dirname(e);
        let n = $ae.join(t, "latest");
        await OB.unlink(n).catch(() => {});
        await OB.symlink(e, n);
      } catch {}
    });
  });
  function rms() {
    if (!HRr) {
      HRr = new Intl.DisplayNames(["en"], {
        type: "language"
      });
    }
    return HRr;
  }
  function JS() {
    if (!BRr) {
      BRr = new Intl.Segmenter(undefined, {
        granularity: "grapheme"
      });
    }
    return BRr;
  }
  function CIt(e) {
    if (!e) {
      return "";
    }
    return JS().segment(e)[Symbol.iterator]().next().value?.segment ?? "";
  }
  function L7(e) {
    if (!e) {
      return "";
    }
    let t = "";
    for (let {
      segment: n
    } of JS().segment(e)) {
      t = n;
    }
    return t;
  }
  function $$e(e) {
    if (!e) {
      return 0;
    }
    let t = 0;
    for (let n of JS().segment(e)) {
      t++;
    }
    return t;
  }
  function aun(e) {
    if (!e) {
      return [];
    }
    return Array.from(JS().segment(e), t => t.segment);
  }
  function qRr() {
    if (!$Rr) {
      $Rr = new Intl.Segmenter(undefined, {
        granularity: "word"
      });
    }
    return $Rr;
  }
  function oms(e) {
    let t = e.trim();
    if (t === "") {
      return 0;
    }
    let n = t.split(/\s+/).length;
    let r = 0;
    for (let o of qRr().segment(t)) {
      if (o.isWordLike) {
        r++;
      }
    }
    return Math.max(n, r);
  }
  function WRr(e, t) {
    let n = `${e}:${t}`;
    let r = ems.get(n);
    if (!r) {
      r = new Intl.RelativeTimeFormat("en", {
        style: e,
        numeric: t
      });
      ems.set(n, r);
    }
    return r;
  }
  function GRr() {
    if (!jRr) {
      jRr = Intl.DateTimeFormat().resolvedOptions().timeZone;
    }
    return jRr;
  }
  function sms() {
    if (iun === null) {
      try {
        let e = Intl.DateTimeFormat().resolvedOptions().locale;
        iun = new Intl.Locale(e).language;
      } catch {
        iun = undefined;
      }
    }
    return iun;
  }
  function yiu(e) {
    if (!e) {
      return "";
    }
    let t = tms.get(e);
    if (t !== undefined) {
      return t;
    }
    let n = Object.entries(e).sort(([o], [s]) => o < s ? -1 : o > s ? 1 : 0);
    let r = "";
    for (let [o, s] of n) {
      r += `${o}=${String(s)};`;
    }
    tms.set(e, r);
    return r;
  }
  function lun(e, t) {
    let n = `${e ?? ""}|${yiu(t)}`;
    let r = nms.get(n);
    if (!r) {
      r = new Intl.DateTimeFormat(e, t);
      nms.set(n, r);
    }
    return r;
  }
  var BRr = null;
  var $Rr = null;
  var HRr = null;
  var ems;
  var jRr = null;
  var iun = null;
  var tms;
  var nms;
  var PP = __lazy(() => {
    ems = new Map();
    tms = new WeakMap();
    nms = new Map();
  });
  function an(e) {
    return Bun.stringWidth(e, _iu);
  }
  var _iu;
  var bc = __lazy(() => {
    _iu = {
      ambiguousIsNarrow: true
    };
  });
  function MB(e, t, n) {
    if (!(t > 0)) {
      return e;
    }
    let r = Bun.wrapAnsi(e, t, n);
    if (biu.test(e) && r.includes(`
`)) {
      return Eiu(r);
    }
    return r;
  }
  function Eiu(e) {
    let t = "";
    let n = "";
    let r = "";
    let o = 0;
    VRr.lastIndex = 0;
    let s;
    while ((s = VRr.exec(e)) !== null) {
      t += ims(e.slice(o, s.index), n, r);
      t += s[0];
      o = VRr.lastIndex;
      let i = s[1];
      if (i === "" || i === "0") {
        n = "";
        r = "";
      } else if (i.startsWith("38;")) {
        n = s[0];
      } else if (Siu.test(i)) {
        n = "";
      } else if (i.startsWith("48;")) {
        r = s[0];
      } else if (Tiu.test(i)) {
        r = "";
      }
    }
    t += ims(e.slice(o), n, r);
    return t;
  }
  function ims(e, t, n) {
    if (e === "" || t === "" && n === "") {
      return e;
    }
    let r = "";
    let o = 0;
    for (let s = 0; s < e.length; s++) {
      if (e.charCodeAt(s) === 10) {
        if (r += e.slice(o, s), t) {
          r += "\x1B[39m";
        }
        if (n) {
          r += "\x1B[49m";
        }
        r += `
` + t + n;
        o = s + 1;
      }
    }
    r += e.slice(o);
    return r;
  }
  var biu;
  var VRr;
  var Siu;
  var Tiu;
  var Kge = __lazy(() => {
    biu = /\x1b\[[34]8;[25];/;
    VRr = /\x1b\[([\d;]*)m/g;
    Siu = /^(3[0-79]|9[0-7])$/;
    Tiu = /^(4[0-79]|10[0-7])$/;
  });
  function truncatePathMiddle(e, t) {
    if (an(e) <= t) {
      return e;
    }
    if (t <= 0) {
      return "\u2026";
    }
    if (t < 5) {
      return truncateToWidth(e, t);
    }
    let n = e.lastIndexOf("/");
    let r = n >= 0 ? e.slice(n) : e;
    let o = n >= 0 ? e.slice(0, n) : "";
    let s = an(r);
    if (s >= t - 1) {
      return truncateStartToWidth(e, t);
    }
    let i = t - 1 - s;
    return truncateToWidthNoEllipsis(o, i) + "\u2026" + r;
  }
  function truncateToWidth(e, t) {
    if (an(e) <= t) {
      return e;
    }
    if (t <= 1) {
      return "\u2026";
    }
    let n = 0;
    let r = "";
    for (let {
      segment: o
    } of JS().segment(e)) {
      let s = an(o);
      if (n + s > t - 1) {
        break;
      }
      r += o;
      n += s;
    }
    return r + "\u2026";
  }
  function truncateStartToWidth(e, t) {
    if (an(e) <= t) {
      return e;
    }
    if (t <= 1) {
      return "\u2026";
    }
    let n = [...JS().segment(e)];
    let r = 0;
    let o = n.length;
    for (let s = n.length - 1; s >= 0; s--) {
      let i = an(n[s].segment);
      if (r + i > t - 1) {
        break;
      }
      r += i;
      o = s;
    }
    return "\u2026" + n.slice(o).map(s => s.segment).join("");
  }
  function truncateToWidthNoEllipsis(e, t) {
    if (an(e) <= t) {
      return e;
    }
    if (t <= 0) {
      return "";
    }
    let n = 0;
    let r = "";
    for (let {
      segment: o
    } of JS().segment(e)) {
      let s = an(o);
      if (n + s > t) {
        break;
      }
      r += o;
      n += s;
    }
    return r;
  }
  function truncate(e, t, n = false) {
    let r = e;
    if (n) {
      let o = e.indexOf(`
`);
      if (o !== -1) {
        if (r = e.substring(0, o), an(r) + 1 > t) {
          return truncateToWidth(r, t);
        }
        return `${r}\u2026`;
      }
    }
    if (an(r) <= t) {
      return r;
    }
    return truncateToWidth(r, t);
  }
  function wrapText(e, t) {
    let n = [];
    let r = "";
    let o = 0;
    for (let {
      segment: s
    } of JS().segment(e)) {
      let i = an(s);
      if (o + i <= t) {
        r += s;
        o += i;
      } else {
        if (r) {
          n.push(r);
        }
        r = s;
        o = i;
      }
    }
    if (r) {
      n.push(r);
    }
    return n;
  }
  var dI = __lazy(() => {
    bc();
    Kge();
    PP();
  });
  var ams = {};
  __export(ams, {
    wrapText: () => wrapText,
    truncateToWidthNoEllipsis: () => truncateToWidthNoEllipsis,
    truncateToWidth: () => truncateToWidth,
    truncateStartToWidth: () => truncateStartToWidth,
    truncatePathMiddle: () => truncatePathMiddle,
    truncate: () => truncate,
    formatTokens: () => formatTokens,
    formatTokenEstimate: () => formatTokenEstimate,
    formatSecondsShort: () => formatSecondsShort,
    formatResetTime: () => formatResetTime,
    formatResetText: () => formatResetText,
    formatRelativeTimeAgo: () => formatRelativeTimeAgo,
    formatRelativeTime: () => formatRelativeTime,
    formatNumber: () => formatNumber,
    formatLogMetadata: () => formatLogMetadata,
    formatFileSize: () => formatFileSize,
    formatDuration: () => formatDuration,
    formatBarElapsed: () => formatBarElapsed
  });
  function formatFileSize(e) {
    let t = e / 1024;
    if (t < 1) {
      return `${e} bytes`;
    }
    if (t < 1024) {
      return `${t.toFixed(1).replace(/\.0$/, "")}KB`;
    }
    let n = t / 1024;
    if (n < 1024) {
      return `${n.toFixed(1).replace(/\.0$/, "")}MB`;
    }
    return `${(n / 1024).toFixed(1).replace(/\.0$/, "")}GB`;
  }
  function formatSecondsShort(e) {
    return `${(e / 1000).toFixed(1)}s`;
  }
  function formatDuration(e, t) {
    if (e < 60000) {
      if (e === 0) {
        return "0s";
      }
      if (e < 1) {
        return `${(e / 1000).toFixed(1)}s`;
      }
      return `${Math.floor(e / 1000).toString()}s`;
    }
    let n = Math.floor(e / 86400000);
    let r = Math.floor(e % 86400000 / 3600000);
    let o = Math.floor(e % 3600000 / 60000);
    let s = Math.round(e % 60000 / 1000);
    if (s === 60) {
      s = 0;
      o++;
    }
    if (o === 60) {
      o = 0;
      r++;
    }
    if (r === 24) {
      r = 0;
      n++;
    }
    let i = t?.hideTrailingZeros;
    if (t?.mostSignificantOnly) {
      if (n > 0) {
        return `${n}d`;
      }
      if (r > 0) {
        return `${r}h`;
      }
      if (o > 0) {
        return `${o}m`;
      }
      return `${s}s`;
    }
    if (n > 0) {
      if (i && r === 0 && o === 0) {
        return `${n}d`;
      }
      if (i && o === 0) {
        return `${n}d ${r}h`;
      }
      return `${n}d ${r}h ${o}m`;
    }
    if (r > 0) {
      if (i && o === 0 && s === 0) {
        return `${r}h`;
      }
      if (i && s === 0) {
        return `${r}h ${o}m`;
      }
      return `${r}h ${o}m ${s}s`;
    }
    if (o > 0) {
      if (i && s === 0) {
        return `${o}m`;
      }
      return `${o}m ${s}s`;
    }
    return `${s}s`;
  }
  function formatBarElapsed(e) {
    let t = Math.max(0, Math.floor(e / 1000));
    if (t < 60) {
      return `${t}s`;
    }
    let n = Math.floor(t / 60);
    if (n < 60) {
      return `${n}m${String(t % 60).padStart(2, "0")}s`;
    }
    let r = Math.floor(n / 60);
    if (r < 24) {
      return `${r}h${String(n % 60).padStart(2, "0")}m`;
    }
    return `${Math.floor(r / 24)}d${String(r % 24).padStart(2, "0")}h`;
  }
  function formatNumber(e) {
    let t = e >= 1000;
    return viu(t).format(e).toLowerCase();
  }
  function formatTokens(e) {
    return formatNumber(e).replace(".0", "");
  }
  function formatTokenEstimate(e) {
    if (e < 20) {
      return "< 20";
    }
    return `~${formatTokens(Math.round(e / 10) * 10)}`;
  }
  function formatRelativeTime(e, t = {}) {
    let {
      style: n = "narrow",
      numeric: r = "always",
      maxUnit: o,
      now: s = new Date()
    } = t;
    let i = e.getTime() - s.getTime();
    let a = Math.trunc(i / 1000);
    let l = [{
      unit: "year",
      seconds: 31536000,
      shortUnit: "y"
    }, {
      unit: "month",
      seconds: 2592000,
      shortUnit: "mo"
    }, {
      unit: "week",
      seconds: 604800,
      shortUnit: "w"
    }, {
      unit: "day",
      seconds: 86400,
      shortUnit: "d"
    }, {
      unit: "hour",
      seconds: 3600,
      shortUnit: "h"
    }, {
      unit: "minute",
      seconds: 60,
      shortUnit: "m"
    }, {
      unit: "second",
      seconds: 1,
      shortUnit: "s"
    }];
    let c = o ? l.filter(u => u.seconds <= 86400) : l;
    for (let {
      unit: u,
      seconds: d,
      shortUnit: p
    } of c) {
      if (Math.abs(a) >= d) {
        let m = Math.trunc(a / d);
        if (n === "narrow") {
          return a < 0 ? `${Math.abs(m)}${p} ago` : `in ${m}${p}`;
        }
        return WRr("long", r).format(m, u);
      }
    }
    if (n === "narrow") {
      return a <= 0 ? "0s ago" : "in 0s";
    }
    return WRr(n, r).format(0, "second");
  }
  function formatRelativeTimeAgo(e, t = {}) {
    let {
      now: n = new Date(),
      ...r
    } = t;
    if (e > n) {
      return formatRelativeTime(e, {
        ...r,
        now: n
      });
    }
    return formatRelativeTime(e, {
      ...r,
      numeric: "always",
      now: n
    });
  }
  function formatLogMetadata(e) {
    let t = e.fileSize !== undefined ? formatFileSize(e.fileSize) : `${e.messageCount} messages`;
    let n = [formatRelativeTimeAgo(e.modified, {
      style: "short"
    }), ...(e.sessionKind === "bg" ? ["bg"] : []), ...(e.gitBranch ? [e.gitBranch] : []), t];
    if (e.tag) {
      n.push(`#${e.tag}`);
    }
    if (e.agentSetting) {
      n.push(`@${e.agentSetting}`);
    }
    if (e.prNumber) {
      n.push(e.prRepository ? `${e.prRepository}#${e.prNumber}` : `#${e.prNumber}`);
    }
    return n.join(" \xB7 ");
  }
  function formatResetTime(e, t = false, n = true, r = false) {
    if (!e) {
      return;
    }
    let o = new Date(e * 1000);
    let s = new Date();
    let i = o.getMinutes();
    let a = (o.getTime() - s.getTime()) / 3600000;
    if (r || a > 24) {
      let c = {
        month: "short",
        day: "numeric",
        hour: n ? "numeric" : undefined,
        minute: !n || i === 0 ? undefined : "2-digit",
        hour12: n ? true : undefined
      };
      if (o.getFullYear() !== s.getFullYear()) {
        c.year = "numeric";
      }
      return o.toLocaleString("en-US", c).replace(/ ([AP]M)/i, (d, p) => p.toLowerCase()) + (t ? ` (${GRr()})` : "");
    }
    return o.toLocaleTimeString("en-US", {
      hour: "numeric",
      minute: i === 0 ? undefined : "2-digit",
      hour12: true
    }).replace(/ ([AP]M)/i, (c, u) => u.toLowerCase()) + (t ? ` (${GRr()})` : "");
  }
  function formatResetText(e, t = false, n = true, r = false) {
    let o = new Date(e);
    return `${formatResetTime(Math.floor(o.getTime() / 1000), t, n, r)}`;
  }
  var zRr = null;
  var KRr = null;
  var viu = e => {
    if (e) {
      if (!zRr) {
        zRr = new Intl.NumberFormat("en-US", {
          notation: "compact",
          maximumFractionDigits: 1,
          minimumFractionDigits: 1
        });
      }
      return zRr;
    } else {
      if (!KRr) {
        KRr = new Intl.NumberFormat("en-US", {
          notation: "compact",
          maximumFractionDigits: 1,
          minimumFractionDigits: 0
        });
      }
      return KRr;
    }
  };
  var cs = __lazy(() => {
    PP();
    dI();
  });
  function $4() {
    if (!YRr) {
      YRr = require("perf_hooks").performance;
    }
    return YRr;
  }
  function mte(e) {
    return e.toFixed(3);
  }
  function uun(e, t, n, r, o, s, i = "") {
    let a = r ? ` | RSS: ${formatFileSize(r.rss)}, Heap: ${formatFileSize(r.heapUsed)}` : "";
    return `[+${mte(e).padStart(o)}ms] (+${mte(t).padStart(s)}ms) ${n}${i}${a}`;
  }
  var YRr = null;
  var dun = __lazy(() => {
    cs();
  });
  var Sms = {};
  __export(Sms, {
    profileReport: () => profileReport,
    profileCheckpoint: () => profileCheckpoint,
    logStartupPerf: () => logStartupPerf,
    isDetailedProfilingEnabled: () => isDetailedProfilingEnabled,
    getStartupPerfLogPath: () => getStartupPerfLogPath,
    getStartupPerfJsonPath: () => getStartupPerfJsonPath,
    addStartupContext: () => addStartupContext
  });
  function addStartupContext(e) {
    if (!IIt) {
      return;
    }
    Object.assign(gms, e);
  }
  function profileCheckpoint(e, {
    once: t = false
  } = {}) {
    if (!IIt) {
      return false;
    }
    if (t) {
      if (cms.vZc(e)) {
        return false;
      }
      cms.add(e);
    }
    if ($4().mark(e), AIt) {
      ZRr.push(process.memoryUsage());
    }
    return true;
  }
  function ums() {
    if (!AIt) {
      return "Startup profiling not enabled";
    }
    let t = $4().getEntriesByType("mark");
    if (t.length === 0) {
      return "No profiling checkpoints recorded";
    }
    let n = [];
    n.push("=".repeat(80));
    n.push("STARTUP PROFILING REPORT");
    n.push("=".repeat(80));
    n.push("");
    let r = 0;
    for (let [s, i] of t.entries()) {
      n.push(uun(i.startTime, i.startTime - r, i.name, ZRr[s], 8, 7));
      r = i.startTime;
    }
    let o = t.at(-1);
    n.push("");
    n.push(`Total startup time: ${mte(o?.startTime ?? 0)}ms`);
    n.push("=".repeat(80));
    return n.join(`
`);
  }
  function profileReport() {
    if (dms) {
      if (!pms) {
        pms = true;
        logStartupPerf({
          late: true
        });
        fms();
      }
      return;
    }
    dms = true;
    logStartupPerf({
      late: false
    });
    fms();
  }
  function fms() {
    if (!AIt) {
      return;
    }
    let e = getStartupPerfLogPath();
    let t = kIt.dirname(e);
    zt().mkdirSync(t);
    vxe(e, ums(), {
      encoding: "utf8",
      flush: true
    });
    let o = $4().getEntriesByType("mark");
    vxe(getStartupPerfJsonPath(), JSON.stringify({
      metadata: bms({
        late: false
      }) ?? {},
      marks: o.map(s => ({
        name: s.name,
        startTime: s.startTime
      })),
      memory: ZRr,
      nodeBootMs: XRr
    }, null, 2), {
      encoding: "utf8",
      flush: true
    });
    logForDebugging("Startup profiling report:");
    logForDebugging(ums());
  }
  function isDetailedProfilingEnabled() {
    return AIt;
  }
  function getStartupPerfLogPath() {
    return kIt.join(er(), "startup-perf", `${getSessionId()}.txt`);
  }
  function getStartupPerfJsonPath() {
    return kIt.join(er(), "startup-perf", `${getSessionId()}.json`);
  }
  function bms({
    late: e
  }) {
    let n = $4().getEntriesByType("mark");
    if (n.length === 0) {
      return null;
    }
    let r = new Map();
    for (let d of n) {
      r.set(d.name, d.startTime);
    }
    let o = r.get("main_after_run");
    let s = {};
    let i = 0;
    let a = 0;
    for (let [d, [p, m]] of Object.entries(Ciu)) {
      if (e && mms.vZc(d)) {
        continue;
      }
      let f = r.get(p);
      let h = r.get(m);
      if (f !== undefined && h !== undefined) {
        let g = Math.round(h - f);
        if (s[`${d}_ms`] = g, i++, !e) {
          mms.add(d);
        }
        if (!Riu.vZc(d) && (o === undefined || h <= o)) {
          a += g;
        }
      }
    }
    if (e) {
      if (i === 0) {
        return null;
      }
      s.late = true;
    } else {
      s.late = false;
    }
    let l = s.total_time_ms;
    if (typeof l === "number") {
      s.gap_unaccounted_ms = Math.max(0, l - a);
    }
    s.free_mem_mb = Math.round(JRr.default.freemem() / 1048576);
    s.load_avg_1m = Math.round((JRr.default.loadavg()[0] ?? 0) * 100) / 100;
    s.checkpoint_count = n.length;
    let c = process.env.CLAUDE_CODE_REMOTE_SESSION_ID;
    if (c) {
      s.ccr_session_id = c;
    }
    if (XRr !== undefined) {
      s.node_boot_ms = XRr;
    }
    let u = Number.parseInt(process.env.CCR_SPAWN_TIMESTAMP_MS ?? process.env.CLAUDE_CODE_SPAWN_TIMESTAMP_MS ?? "", 10);
    if (Number.isFinite(u) && lms !== undefined) {
      s.spawn_to_first_checkpoint_ms = Math.round(lms - u);
    }
    Object.assign(s, gms);
    return s;
  }
  function logStartupPerf({
    late: e
  } = {
    late: false
  }) {
    if (!hms) {
      return;
    }
    let t = bms({
      late: e
    });
    if (t === null) {
      return;
    }
    logEvent("tengu_startup_perf", t);
  }
  var JRr;
  var kIt;
  var AIt;
  var hms;
  var IIt;
  var ZRr;
  var Ciu;
  var Riu;
  var lms;
  var XRr;
  var gms;
  var cms;
  var dms = false;
  var pms = false;
  var mms;
  var H4 = __lazy(() => {
    at();
    Ot();
    je();
    gn();
    dun();
    JRr = __toESM(require("os"));
    kIt = require("path");
    AIt = st(process.env.CLAUDE_CODE_PROFILE_STARTUP);
    hms = Math.random() < 0.005;
    IIt = AIt || hms;
    ZRr = [];
    Ciu = {
      import_time: ["cli_entry", "main_tsx_imports_loaded"],
      main_imports: ["cli_before_main_import", "main_tsx_entry"],
      mdm_keychain_await: ["preAction_start", "preAction_after_mdm"],
      init_time: ["init_function_start", "init_function_end"],
      init_safe_env: ["init_configs_enabled", "init_safe_env_vars_applied"],
      init_network: ["init_after_remote_settings_check", "init_network_configured"],
      init_tail: ["init_network_configured", "init_function_end"],
      settings_time: ["eagerLoadSettings_start", "eagerLoadSettings_end"],
      tools_loaded: ["init_function_end", "action_tools_loaded"],
      preaction_tail: ["init_function_end", "action_handler_start"],
      action_prologue: ["action_handler_start", "action_after_input_prompt"],
      action_setup_span: ["action_after_input_prompt", "action_after_setup"],
      mcp_configs: ["action_tools_loaded", "action_mcp_configs_loaded"],
      plugins_init: ["action_mcp_configs_loaded", "action_after_plugins_init"],
      headless_setup: ["action_after_plugins_init", "before_validateForceLoginOrg"],
      force_login_org: ["before_validateForceLoginOrg", "before_connectMcp"],
      mcp_connect: ["before_connectMcp", "after_connectMcp_claudeai"],
      mcp_connect_user: ["before_mcp_connect_user", "after_mcp_connect_user"],
      mcp_connect_connector: ["before_mcp_connect_connector", "after_mcp_connect_connector"],
      growthbook_init: ["before_growthbook_init", "after_growthbook_init"],
      prewait: ["after_connectMcp_claudeai", "after_print_import"],
      sandbox_init: ["before_sandbox_init", "after_sandbox_init"],
      load_initial_messages: ["before_loadInitialMessages", "after_loadInitialMessages"],
      process_user_input: ["before_processUserInput", "after_processUserInput"],
      total_time: ["cli_entry", "main_after_run"]
    };
    Riu = new Set(["total_time", "main_imports", "mdm_keychain_await", "init_safe_env", "init_network", "init_tail", "mcp_connect_user", "mcp_connect_connector", "growthbook_init", "preaction_tail", "action_prologue", "action_setup_span"]);
    if (IIt) {
      profileCheckpoint("profiler_initialized");
    }
    lms = IIt ? Date.now() : undefined;
    XRr = IIt ? Math.round(process.uptime() * 1000) : undefined;
    gms = {};
    cms = new Set();
    mms = new Set();
  });
  function kiu(e) {
    return "result" in e || "error" in e;
  }
  function Aiu(e) {
    return "method" in e && typeof e.method === "string";
  }
  class wms {
    socket = null;
    connected = false;
    connecting = false;
    responseCallback = null;
    notificationHandler = null;
    responseBuffer = Buffer.alloc(0);
    reconnectAttempts = 0;
    maxReconnectAttempts = 10;
    reconnectDelay = 1000;
    reconnectTimer = null;
    context;
    disableAutoReconnect = false;
    constructor(e) {
      this.context = e;
    }
    async connect() {
      let {
        serverName: e,
        logger: t
      } = this.context;
      if (this.connecting) {
        t.info(`[${e}] Already connecting, skipping duplicate attempt`);
        return;
      }
      this.closeSocket();
      this.connecting = true;
      let n = this.context.getSocketPath?.() ?? this.context.socketPath;
      t.info(`[${e}] Attempting to connect to: ${n}`);
      try {
        await this.validateSocketSecurity(n);
      } catch (o) {
        this.connecting = false;
        t.info(`[${e}] Security validation failed:`, o);
        return;
      }
      this.socket = Tms.createConnection(n);
      let r = setTimeout(() => {
        if (!this.connected) {
          t.info(`[${e}] Connection attempt timed out after 5000ms`);
          this.closeSocket();
          this.scheduleReconnect();
        }
      }, 5000);
      this.socket.on("connect", () => {
        clearTimeout(r);
        this.connected = true;
        this.connecting = false;
        this.reconnectAttempts = 0;
        t.info(`[${e}] Successfully connected to bridge server`);
      });
      this.socket.on("data", o => {
        this.responseBuffer = Buffer.concat([this.responseBuffer, o]);
        while (this.responseBuffer.length >= 4) {
          let s = this.responseBuffer.readUInt32LE(0);
          if (this.responseBuffer.length < 4 + s) {
            break;
          }
          let i = this.responseBuffer.slice(4, 4 + s);
          this.responseBuffer = this.responseBuffer.slice(4 + s);
          try {
            let a = JSON.parse(i.toString("utf-8"));
            if (Aiu(a)) {
              if (t.info(`[${e}] Received notification: ${a.method}`), this.notificationHandler) {
                this.notificationHandler(a);
              }
            } else if (kiu(a)) {
              t.info(`[${e}] Received tool response: ${a}`);
              this.handleResponse(a);
            } else {
              t.info(`[${e}] Received unknown message: ${a}`);
            }
          } catch (a) {
            t.info(`[${e}] Failed to parse message:`, a);
          }
        }
      });
      this.socket.on("error", o => {
        if (clearTimeout(r), t.info(`[${e}] Socket error (code: ${o.code}):`, o), this.connected = false, this.connecting = false, o.code && ["ECONNREFUSED", "ECONNRESET", "EPIPE", "ENOENT", "EOPNOTSUPP", "ECONNABORTED"].includes(o.code)) {
          this.scheduleReconnect();
        }
      });
      this.socket.on("close", () => {
        clearTimeout(r);
        this.connected = false;
        this.connecting = false;
        this.scheduleReconnect();
      });
    }
    scheduleReconnect() {
      let {
        serverName: e,
        logger: t
      } = this.context;
      if (this.disableAutoReconnect) {
        return;
      }
      if (this.reconnectTimer) {
        t.info(`[${e}] Reconnect already scheduled, skipping`);
        return;
      }
      this.reconnectAttempts++;
      let n = 100;
      if (this.reconnectAttempts > n) {
        t.info(`[${e}] Giving up after ${n} attempts. Will retry on next tool call.`);
        this.reconnectAttempts = 0;
        return;
      }
      let r = Math.min(this.reconnectDelay * Math.pow(1.5, this.reconnectAttempts - 1), 30000);
      if (this.reconnectAttempts <= this.maxReconnectAttempts) {
        t.info(`[${e}] Reconnecting in ${Math.round(r)}ms (attempt ${this.reconnectAttempts})`);
      } else if (this.reconnectAttempts % 10 === 0) {
        t.info(`[${e}] Still polling for native host (attempt ${this.reconnectAttempts})`);
      }
      this.reconnectTimer = setTimeout(() => {
        this.reconnectTimer = null;
        this.connect();
      }, r);
    }
    handleResponse(e) {
      if (this.responseCallback) {
        let t = this.responseCallback;
        this.responseCallback = null;
        t(e);
      }
    }
    setNotificationHandler(e) {
      this.notificationHandler = e;
    }
    async ensureConnected() {
      let {
        serverName: e
      } = this.context;
      if (this.connected && this.socket) {
        return true;
      }
      if (!this.socket && !this.connecting) {
        await this.connect();
      }
      return new Promise((t, n) => {
        let r = null;
        let o = setTimeout(() => {
          if (r) {
            clearTimeout(r);
          }
          n(new SocketConnectionError(`[${e}] Connection attempt timed out after 5000ms`));
        }, 5000);
        let s = () => {
          if (this.connected) {
            clearTimeout(o);
            t(true);
          } else {
            r = setTimeout(s, 500);
          }
        };
        s();
      });
    }
    async sendRequest(e, t = 30000) {
      let {
        serverName: n
      } = this.context;
      if (!this.socket) {
        throw new SocketConnectionError(`[${n}] Cannot send request: not connected`);
      }
      let r = this.socket;
      return new Promise((o, s) => {
        let i = setTimeout(() => {
          this.responseCallback = null;
          s(new SocketConnectionError(`[${n}] Tool request timed out after ${t}ms`));
        }, t);
        this.responseCallback = d => {
          clearTimeout(i);
          o(d);
        };
        let a = JSON.stringify(e);
        let l = Buffer.from(a, "utf-8");
        let c = Buffer.allocUnsafe(4);
        c.writeUInt32LE(l.length, 0);
        let u = Buffer.concat([c, l]);
        r.write(u);
      });
    }
    async callTool(e, t, n) {
      let r = {
        method: "execute_tool",
        params: {
          client_id: this.context.clientTypeId,
          tool: e,
          args: t,
          ...(n?.sessionScope ? {
            session_scope: n.sessionScope
          } : {})
        }
      };
      return this.sendRequestWithRetry(r);
    }
    async sendRequestWithRetry(e) {
      let {
        serverName: t,
        logger: n
      } = this.context;
      try {
        return await this.sendRequest(e);
      } catch (r) {
        if (!(r instanceof SocketConnectionError)) {
          throw r;
        }
        n.info(`[${t}] Connection error, forcing reconnect and retrying: ${r.message}`);
        this.closeSocket();
        await this.ensureConnected();
        return await this.sendRequest(e);
      }
    }
    isConnected() {
      return this.connected;
    }
    closeSocket() {
      if (this.socket) {
        this.socket.removeAllListeners();
        this.socket.end();
        this.socket.destroy();
        this.socket = null;
      }
      this.connected = false;
      this.connecting = false;
    }
    cleanup() {
      if (this.reconnectTimer) {
        clearTimeout(this.reconnectTimer);
        this.reconnectTimer = null;
      }
      this.closeSocket();
      this.reconnectAttempts = 0;
      this.responseBuffer = Buffer.alloc(0);
      this.responseCallback = null;
    }
    disconnect() {
      this.cleanup();
    }
    async validateSocketSecurity(e) {
      let {
        serverName: t,
        logger: n
      } = this.context;
      if (Ems.platform() === "win32") {
        return;
      }
      try {
        let r = vms.dirname(e);
        if ((r.split("/").pop() || "").startsWith("claude-mcp-browser-bridge-")) {
          try {
            let c = await exr.promises.stat(r);
            if (c.isDirectory()) {
              let u = c.mode & 511;
              if (u !== 448) {
                throw Error(`[${t}] Insecure socket directory permissions: ${u.toString(8)} (expected 0700). Directory may have been tampered with.`);
              }
              let d = process.getuid?.();
              if (d !== undefined && c.uid !== d) {
                throw Error(`Socket directory not owned by current user (uid: ${d}, dir uid: ${c.uid}). Potential security risk.`);
              }
            }
          } catch (c) {
            if (c.code !== "ENOENT") {
              throw c;
            }
          }
        }
        let i = await exr.promises.stat(e);
        if (!i.isSocket()) {
          throw Error(`[${t}] Path exists but it's not a socket: ${e}`);
        }
        let a = i.mode & 511;
        if (a !== 384) {
          throw Error(`[${t}] Insecure socket permissions: ${a.toString(8)} (expected 0600). Socket may have been tampered with.`);
        }
        let l = process.getuid?.();
        if (l !== undefined && i.uid !== l) {
          throw Error(`Socket not owned by current user (uid: ${l}, socket uid: ${i.uid}). Potential security risk.`);
        }
        n.info(`[${t}] Socket security validation passed`);
      } catch (r) {
        if (r.code === "ENOENT") {
          n.info(`[${t}] Socket not found, will be created by server`);
          return;
        }
        throw r;
      }
    }
  }
  function pun(e) {
    return new wms(e);
  }
  var exr;
  var Tms;
  var Ems;
  var vms;
  var SocketConnectionError;
  var NoExtensionConnectedError;
  var ToolCallTimeoutError;
  var ExtensionDisconnectedMidCallError;
  var set = __lazy(() => {
    exr = require("fs");
    Tms = require("net");
    Ems = require("os");
    vms = require("path");
    SocketConnectionError = class OP extends Error {
      constructor(e) {
        super(e);
        this.name = "SocketConnectionError";
      }
    };
    NoExtensionConnectedError = class j$e extends Error {
      constructor(e) {
        super(e);
        this.name = "NoExtensionConnectedError";
      }
    };
    ToolCallTimeoutError = class q$e extends Error {
      constructor(e) {
        super(e);
        this.name = "ToolCallTimeoutError";
      }
    };
    ExtensionDisconnectedMidCallError = class Rxe extends Error {
      constructor(e) {
        super(e);
        this.name = "ExtensionDisconnectedMidCallError";
      }
    };
  });
  function localPlatformLabel() {
    return "Linux";
  }
  function DIt(e, t) {
    if (typeof e !== "string") {
      return;
    }
    let n = e.replace(/[\r\n\t\u0000-\u001f]/g, " ").trim();
    return n.length > t ? `${n.slice(0, t)}\u2026` : n;
  }
  function Piu(e) {
    return {
      deviceId: DIt(e.deviceId, 64) ?? "",
      name: DIt(e.name, 50),
      osPlatform: DIt(e.osPlatform, 30),
      connectedAt: typeof e.connectedAt === "number" ? e.connectedAt : 0
    };
  }
  class BridgeClient {
    0 = null;
    connected = false;
    authenticated = false;
    connecting = false;
    reconnectTimer = null;
    handshakeTimer = null;
    reconnectAttempts = 0;
    pendingCalls = new Map();
    timedOutCalls = new Map();
    notificationHandler = null;
    context;
    permissionMode = "ask";
    allowedDomains;
    connectionStartTime = null;
    connectionEstablishedTime = null;
    selectedDeviceId;
    discoveryComplete = false;
    multiBrowserPendingSelection = false;
    lastKnownExtensionIds = [];
    discoveryPromise = null;
    pendingDiscovery = null;
    listExtensionsPromise = null;
    previousSelectedDeviceId;
    peerConnectedWaiters = [];
    pendingPairingRequestId;
    pairingInProgress = false;
    persistedDeviceId;
    pendingSwitchResolve = null;
    pairingPromptAbort = null;
    pairingPromptTimeout = null;
    keepAliveInterval = null;
    lastPongReceived = 0;
    constructor(e) {
      if (this.context = e, e.initialPermissionMode) {
        this.permissionMode = e.initialPermissionMode;
      }
    }
    async ensureConnected() {
      let {
        logger: e,
        serverName: t
      } = this.context;
      if (e.info(`[${t}] ensureConnected called, connected=${this.connected}, authenticated=${this.authenticated}, wsState=${this.ws?.readyState}`), this.connected && this.authenticated && this.ws?.readyState === Jge.default.OPEN) {
        e.info(`[${t}] Already connected and authenticated`);
        return true;
      }
      if (!this.connecting && !this.reconnectTimer) {
        e.info(`[${t}] Not connecting, starting connection...`);
        await this.connect();
      } else {
        e.info(`[${t}] Connect in progress or reconnect scheduled, waiting...`);
      }
      return new Promise(n => {
        let r = null;
        let o = setTimeout(() => {
          if (r) {
            clearTimeout(r);
          }
          e.info(`[${t}] Connection timeout, connected=${this.connected}, authenticated=${this.authenticated}`);
          n(false);
        }, 1e4);
        let s = () => {
          if (this.connected && this.authenticated) {
            e.info(`[${t}] Connection successful`);
            clearTimeout(o);
            n(true);
          } else if (!this.connecting && !this.reconnectTimer) {
            e.info(`[${t}] No longer connecting, giving up`);
            clearTimeout(o);
            n(false);
          } else {
            r = setTimeout(s, 200);
          }
        };
        s();
      });
    }
    async callTool(e, t, n) {
      let {
        logger: r,
        serverName: o,
        trackEvent: s
      } = this.context;
      if (!this.ws || this.ws.readyState !== Jge.default.OPEN) {
        throw new SocketConnectionError(`[${o}] Bridge not connected`);
      }
      if (!this.selectedDeviceId && !this.discoveryComplete) {
        this.discoveryPromise ??= this.discoverAndSelectExtension().finally(() => {
          this.discoveryPromise = null;
        });
        await this.discoveryPromise;
      }
      if (this.discoveryComplete && !this.selectedDeviceId && !this.pairingInProgress && !this.multiBrowserPendingSelection) {
        throw new NoExtensionConnectedError(`[${o}] No Chrome extension connected after discovery`);
      }
      let i = crypto.randomUUID();
      let a = Date.now();
      let l = this.context.getToolCallTimeoutMs?.(e) ?? 60000;
      let c = n?.sessionScope?.sessionId;
      let u = n?.sessionScope?.userMessageUuid;
      s?.("chrome_bridge_tool_call_started", {
        tool_name: e,
        tool_use_id: i,
        session_id: c,
        user_message_uuid: u,
        timeout_ms: l
      });
      let d = n?.permissionMode ?? this.permissionMode;
      let p = n?.allowedDomains ?? this.allowedDomains;
      let m = {
        type: "tool_call",
        tool_use_id: i,
        client_type: this.context.clientTypeId,
        tool: e,
        args: t
      };
      if (this.selectedDeviceId) {
        m.target_device_id = this.selectedDeviceId;
      }
      if (d) {
        m.permission_mode = d;
      }
      if (p?.length) {
        m.allowed_domains = p;
      }
      if (n?.onPermissionRequest) {
        m.handle_permission_prompts = true;
      }
      if (n?.sessionScope) {
        m.session_scope = n.sessionScope;
      }
      return new Promise((f, h) => {
        let g = this.createTimeoutTimer(i, l);
        this.pendingCalls.set(i, {
          resolve: f,
          reject: h,
          timer: g,
          onPermissionRequest: n?.onPermissionRequest,
          startTime: a,
          toolName: e,
          timeoutMs: l,
          sessionId: c,
          userMessageUuid: u
        });
        r.debug(`[${o}] Sending tool_call: ${e} (${i.slice(0, 8)})`);
        this.ws.send(JSON.stringify(m));
      });
    }
    isConnected() {
      return this.connected && this.authenticated && this.ws?.readyState === Jge.default.OPEN;
    }
    disconnect() {
      this.cleanup();
    }
    setNotificationHandler(e) {
      this.notificationHandler = e;
    }
    async discoverAndSelectExtension() {
      let {
        logger: e,
        serverName: t
      } = this.context;
      this.persistedDeviceId = this.context.getPersistedDeviceId?.();
      let n = await this.queryBridgeExtensions();
      if (n.length === 0) {
        if (e.info(`[${t}] No extensions connected, waiting up to ${1e4}ms for peer_connected`), await this.waitForPeerConnected(1e4)) {
          n = await this.queryBridgeExtensions();
        }
      }
      if (this.context.getRequirePairedDevice?.()) {
        if (!this.persistedDeviceId) {
          e.info(`[${t}] requirePairedDevice set but no persistedDeviceId; refusing to auto-select`);
          this.discoveryComplete = true;
          return;
        }
        let r = this.persistedDeviceId;
        let o = n.find(s => s.deviceId === r);
        if (!o) {
          if (e.info(`[${t}] requirePairedDevice: persisted ${r.slice(0, 8)} not connected (${n.length} other(s) visible); waiting`), await this.waitForPeerConnected(1e4)) {
            n = await this.queryBridgeExtensions();
            o = n.find(s => s.deviceId === r);
          }
        }
        if (this.discoveryComplete = true, o) {
          this.selectExtension(o.deviceId);
        } else {
          e.info(`[${t}] requirePairedDevice: persisted device never arrived; refusing to auto-select`);
        }
        return;
      }
      if (this.discoveryComplete = true, this.selectedDeviceId) {
        return;
      }
      if (n.length === 0) {
        e.info(`[${t}] No extensions found after waiting`);
        return;
      }
      if (n.length === 1) {
        let r = n[0];
        if (!this.isLocalExtension(r)) {
          this.context.onRemoteExtensionWarning?.(r);
        }
        this.selectExtension(r.deviceId);
        return;
      }
      if (this.persistedDeviceId) {
        let r = n.find(o => o.deviceId === this.persistedDeviceId);
        if (r) {
          e.info(`[${t}] Auto-connecting to persisted extension: ${r.name || r.deviceId.slice(0, 8)}`);
          this.selectExtension(r.deviceId);
          return;
        }
      }
      if (this.context.askUserToolName) {
        this.multiBrowserPendingSelection = true;
        return;
      }
      this.broadcastPairingRequest();
      this.pairingInProgress = true;
      this.firePairingPrompt();
    }
    queryBridgeExtensions() {
      if (this.listExtensionsPromise) {
        return this.listExtensionsPromise;
      }
      let e = new Promise(t => {
        let n = setTimeout(() => {
          this.pendingDiscovery = null;
          t([]);
        }, 5000);
        this.pendingDiscovery = {
          resolve: t,
          timeout: n
        };
        this.ws?.send(JSON.stringify({
          type: "list_extensions"
        }));
      }).then(t => {
        let n = new Map();
        for (let o of t) {
          let s = n.get(o.deviceId);
          if (!s || o.connectedAt > s.connectedAt) {
            n.set(o.deviceId, o);
          }
        }
        let r = [...n.values()].map(Piu);
        this.lastKnownExtensionIds = r.map(o => o.deviceId);
        return r;
      });
      this.listExtensionsPromise = e;
      e.finally(() => {
        if (this.listExtensionsPromise === e) {
          this.listExtensionsPromise = null;
        }
      });
      return e;
    }
    getSelectedDeviceId() {
      return this.selectedDeviceId ?? this.context.getPersistedDeviceId?.();
    }
    hasActiveSelection() {
      return this.selectedDeviceId !== undefined;
    }
    clearSelection() {
      this.selectedDeviceId = undefined;
      this.previousSelectedDeviceId = undefined;
      this.discoveryComplete = false;
      this.multiBrowserPendingSelection = false;
      this.lastKnownExtensionIds = [];
      this.pairingInProgress = false;
      this.abortPairingPrompt();
    }
    selectExtension(e) {
      let {
        logger: t,
        serverName: n
      } = this.context;
      this.selectedDeviceId = e;
      this.previousSelectedDeviceId = undefined;
      this.multiBrowserPendingSelection = false;
      t.info(`[${n}] Selected Chrome extension: ${e.slice(0, 8)}...`);
    }
    async listConnectedExtensions() {
      if (!(await this.ensureConnected())) {
        return [];
      }
      return (await this.queryBridgeExtensions()).map(t => ({
        ...t,
        isLocal: this.isLocalExtension(t)
      }));
    }
    selectExtensionById(e, t, n) {
      if (this.discoveryComplete = true, this.pairingInProgress = false, this.pendingPairingRequestId = undefined, this.selectExtension(e), this.context.onExtensionPaired?.(e, t, n ?? this.lastKnownExtensionIds), this.pendingSwitchResolve) {
        this.pendingSwitchResolve({
          deviceId: e,
          name: t
        });
      }
      this.abortPairingPrompt();
    }
    firePairingPrompt() {
      if (this.abortPairingPrompt(), !this.context.onPairingPrompted) {
        return;
      }
      let e = new AbortController();
      this.pairingPromptAbort = e;
      this.pairingPromptTimeout = setTimeout(() => this.abortPairingPrompt(), 120000);
      this.context.onPairingPrompted(e.signal);
    }
    abortPairingPrompt() {
      if (this.pairingPromptTimeout) {
        clearTimeout(this.pairingPromptTimeout);
        this.pairingPromptTimeout = null;
      }
      if (this.pairingPromptAbort) {
        this.pairingPromptAbort.abort();
        this.pairingPromptAbort = null;
      }
    }
    isLocalExtension(e) {
      if (!e.osPlatform) {
        return false;
      }
      return e.osPlatform === localPlatformLabel();
    }
    waitForPeerConnected(e) {
      return new Promise(t => {
        let n = setTimeout(() => {
          this.peerConnectedWaiters = this.peerConnectedWaiters.filter(o => o !== r);
          t(false);
        }, e);
        let r = o => {
          clearTimeout(n);
          t(o);
        };
        this.peerConnectedWaiters.push(r);
      });
    }
    broadcastPairingRequest() {
      let e = crypto.randomUUID();
      this.pendingPairingRequestId = e;
      this.ws?.send(JSON.stringify({
        type: "pairing_request",
        request_id: e,
        client_type: this.context.clientTypeId
      }));
    }
    async switchBrowser() {
      let e = await this.queryBridgeExtensions();
      let t = this.selectedDeviceId ?? this.previousSelectedDeviceId;
      if (e.length === 0 || e.length === 1 && (!t || e[0].deviceId === t)) {
        return "no_other_browsers";
      }
      this.previousSelectedDeviceId = this.selectedDeviceId;
      this.selectedDeviceId = undefined;
      this.discoveryComplete = false;
      this.pairingInProgress = false;
      let n = crypto.randomUUID();
      if (this.pendingPairingRequestId = n, this.ws?.readyState !== Jge.default.OPEN) {
        return null;
      }
      if (this.ws.send(JSON.stringify({
        type: "pairing_request",
        request_id: n,
        client_type: this.context.clientTypeId
      })), this.firePairingPrompt(), this.pendingSwitchResolve) {
        this.pendingSwitchResolve(null);
      }
      return new Promise(r => {
        let o = setTimeout(() => {
          if (this.pendingPairingRequestId === n) {
            this.pendingPairingRequestId = undefined;
          }
          this.pendingSwitchResolve = null;
          this.abortPairingPrompt();
          r(null);
        }, 120000);
        this.pendingSwitchResolve = s => {
          clearTimeout(o);
          this.pendingSwitchResolve = null;
          r(s);
        };
      });
    }
    async connect() {
      let {
        logger: e,
        serverName: t,
        bridgeConfig: n,
        trackEvent: r
      } = this.context;
      if (!n) {
        e.error(`[${t}] No bridge config provided`);
        return;
      }
      if (this.connecting) {
        return;
      }
      this.connecting = true;
      this.authenticated = false;
      this.connectionStartTime = Date.now();
      this.closeSocket();
      this.handshakeTimer = setTimeout(() => {
        if (this.handshakeTimer = null, !this.connecting) {
          return;
        }
        let a = this.ws?.readyState;
        if (e.warn(`[${t}] Bridge connect stuck after ${30000}ms (ws_state=${a})`), r?.("chrome_bridge_handshake_timeout", {
          duration_ms: Date.now() - (this.connectionStartTime ?? 0),
          ws_state: a
        }), a === undefined) {
          return;
        }
        this.connecting = false;
        this.closeSocket();
        this.scheduleReconnect();
      }, 30000);
      let o;
      let s;
      if (n.devUserId) {
        o = n.devUserId;
        e.debug(`[${t}] Using dev user ID for bridge connection`);
      } else {
        e.debug(`[${t}] Fetching user ID for bridge connection`);
        let a;
        let l;
        if (n.getUserIdResult) {
          let c = await n.getUserIdResult();
          if (c.ok) {
            l = c.userId;
          } else {
            a = c.error;
          }
        } else {
          l = await n.getUserId();
        }
        if (!l) {
          let c = Date.now() - this.connectionStartTime;
          e.error(`[${t}] No user ID available after ${c}ms`);
          r?.("chrome_bridge_connection_failed", {
            duration_ms: c,
            error_type: "no_user_id",
            error_detail: a,
            reconnect_attempt: this.reconnectAttempts
          });
          this.connecting = false;
          this.scheduleReconnect();
          return;
        }
        if (o = l, e.debug(`[${t}] Fetching OAuth token for bridge connection`), s = await n.getOAuthToken(), !s) {
          let c = Date.now() - this.connectionStartTime;
          e.error(`[${t}] No OAuth token available after ${c}ms`);
          r?.("chrome_bridge_connection_failed", {
            duration_ms: c,
            error_type: "no_oauth_token",
            reconnect_attempt: this.reconnectAttempts
          });
          this.connecting = false;
          this.scheduleReconnect();
          return;
        }
      }
      let i = `${n.url}/chrome/${o}`;
      e.info(`[${t}] Connecting to bridge: ${i}`);
      r?.("chrome_bridge_connection_started", {
        bridge_url: i
      });
      try {
        let a = (await n.getWsOptions?.()) ?? n.wsOptions;
        this.ws = new Jge.default(i, a ? {
          ...a,
          Aeu: a
        } : undefined);
      } catch (a) {
        let l = Date.now() - this.connectionStartTime;
        e.error(`[${t}] Failed to create WebSocket after ${l}ms:`, a);
        r?.("chrome_bridge_connection_failed", {
          duration_ms: l,
          error_type: "websocket_error",
          error_code: a?.code,
          reconnect_attempt: this.reconnectAttempts
        });
        this.connecting = false;
        this.scheduleReconnect();
        return;
      }
      this.ws.on("open", () => {
        e.info(`[${t}] WebSocket connected, sending connect message`);
        let a = {
          type: "connect",
          client_type: this.context.clientTypeId
        };
        if (n.devUserId) {
          a.dev_user_id = n.devUserId;
        } else {
          a.oauth_token = s;
        }
        this.ws?.send(JSON.stringify(a));
      });
      this.ws.on("message", a => {
        try {
          let l = JSON.parse(a.toString());
          e.debug(`[${t}] Bridge received: ${JSON.stringify(l)}`);
          this.handleMessage(l);
        } catch (l) {
          e.error(`[${t}] Failed to parse bridge message:`, l);
        }
      });
      this.ws.on("close", a => {
        let l = this.connectionEstablishedTime ? Date.now() - this.connectionEstablishedTime : 0;
        e.info(`[${t}] Bridge connection closed (code: ${a}, duration: ${l}ms)`);
        r?.("chrome_bridge_disconnected", {
          close_code: a,
          duration_since_connect_ms: l,
          reconnect_attempt: this.reconnectAttempts + 1
        });
        this.connected = false;
        this.authenticated = false;
        this.connecting = false;
        this.connectionEstablishedTime = null;
        this.rejectPendingCalls(new SocketConnectionError("Bridge connection closed mid-call"));
        this.scheduleReconnect();
      });
      this.ws.on("error", a => {
        let l = this.connectionStartTime ? Date.now() - this.connectionStartTime : 0;
        e.error(`[${t}] Bridge WebSocket error after ${l}ms: ${a.message}`);
        r?.("chrome_bridge_connection_failed", {
          duration_ms: l,
          error_type: "websocket_error",
          error_code: a.code,
          reconnect_attempt: this.reconnectAttempts
        });
        this.connected = false;
        this.authenticated = false;
        this.connecting = false;
        this.rejectPendingCalls(new SocketConnectionError(`Bridge connection error: ${a.message}`));
      });
    }
    handleMessage(e) {
      let {
        logger: t,
        serverName: n,
        trackEvent: r
      } = this.context;
      switch (e.type) {
        case "paired":
          {
            let o = this.connectionStartTime ? Date.now() - this.connectionStartTime : 0;
            t.info(`[${n}] Paired with Chrome extension (duration: ${o}ms)`);
            this.connected = true;
            this.authenticated = true;
            this.connecting = false;
            this.reconnectAttempts = 0;
            this.connectionEstablishedTime = Date.now();
            this.startKeepAlive();
            r?.("chrome_bridge_connection_succeeded", {
              duration_ms: o,
              status: "paired"
            });
            break;
          }
        case "waiting":
          {
            let o = this.connectionStartTime ? Date.now() - this.connectionStartTime : 0;
            t.info(`[${n}] Waiting for Chrome extension to connect (duration: ${o}ms)`);
            this.connected = true;
            this.authenticated = true;
            this.connecting = false;
            this.reconnectAttempts = 0;
            this.connectionEstablishedTime = Date.now();
            this.startKeepAlive();
            r?.("chrome_bridge_connection_succeeded", {
              duration_ms: o,
              status: "waiting"
            });
            break;
          }
        case "peer_connected":
          if (t.info(`[${n}] Chrome extension connected to bridge`), r?.("chrome_bridge_peer_connected", null), !this.selectedDeviceId) {
            this.discoveryComplete = false;
          }
          if (this.previousSelectedDeviceId && e.deviceId === this.previousSelectedDeviceId && !this.pendingSwitchResolve) {
            t.info(`[${n}] Previously selected extension reconnected, auto-reselecting`);
            this.selectExtension(this.previousSelectedDeviceId);
            this.previousSelectedDeviceId = undefined;
          }
          if (this.peerConnectedWaiters.length > 0) {
            let o = this.peerConnectedWaiters;
            this.peerConnectedWaiters = [];
            for (let s of o) {
              s(true);
            }
          }
          break;
        case "peer_disconnected":
          {
            let o = e.deviceId;
            if (t.info(`[${n}] Chrome extension disconnected from bridge (deviceId=${o ?? "none"}, selected=${this.selectedDeviceId ?? "none"})`), r?.("chrome_bridge_peer_disconnected", {
              disconnected_device_id: o ?? null,
              selected_device_id: this.selectedDeviceId ?? null,
              had_match: o != null && o === this.selectedDeviceId,
              pending_calls: this.pendingCalls.size
            }), e.deviceId && e.deviceId === this.selectedDeviceId) {
              t.info(`[${n}] Selected extension disconnected, clearing selection`);
              this.previousSelectedDeviceId = this.selectedDeviceId;
              this.selectedDeviceId = undefined;
              this.discoveryComplete = false;
              this.rejectPendingCalls(new ExtensionDisconnectedMidCallError("Chrome extension disconnected mid-call"));
            } else if (!this.selectedDeviceId && this.multiBrowserPendingSelection) {
              this.discoveryComplete = false;
              this.multiBrowserPendingSelection = false;
            }
            break;
          }
        case "routing_ack":
          {
            r?.("chrome_bridge_routing_ack", {
              tool_use_id: e.tool_use_id ?? null,
              routed_to: e.routed_to ?? null,
              target_connected_at: e.target_connected_at ?? null,
              target_pong_age_ms: e.target_pong_age_ms ?? null,
              extension_sockets: e.extension_sockets ?? null,
              mcp_sockets: e.mcp_sockets ?? null
            });
            let o = this.pendingCalls.get(e.tool_use_id ?? "");
            if (o) {
              o.routingAckReceived = true;
              o.routingAckPongAgeMs = e.target_pong_age_ms ?? null;
            }
            break;
          }
        case "extensions_list":
          if (this.pendingDiscovery) {
            clearTimeout(this.pendingDiscovery.timeout);
            this.pendingDiscovery.resolve(e.extensions ?? []);
            this.pendingDiscovery = null;
          }
          break;
        case "pairing_response":
          {
            let o = e.request_id;
            if (this.pendingPairingRequestId !== o) {
              break;
            }
            if (e.dismissed === true) {
              t.info(`[${n}] Pairing prompt dismissed in extension`);
              this.abortPairingPrompt();
              break;
            }
            let s = DIt(e.device_id, 64);
            let i = DIt(e.name, 50);
            if (s && i) {
              if (this.pendingPairingRequestId = undefined, this.pairingInProgress = false, this.selectExtension(s), this.context.onExtensionPaired?.(s, i, this.lastKnownExtensionIds), this.abortPairingPrompt(), t.info(`[${n}] Paired with "${i}" (${s.slice(0, 8)})`), this.pendingSwitchResolve) {
                this.pendingSwitchResolve({
                  deviceId: s,
                  name: i
                });
                this.pendingSwitchResolve = null;
              }
            }
            break;
          }
        case "ping":
          this.ws?.send(JSON.stringify({
            type: "pong"
          }));
          break;
        case "pong":
          this.lastPongReceived = Date.now();
          break;
        case "tool_result":
          this.handleToolResult(e);
          break;
        case "permission_request":
          this.handlePermissionRequest(e);
          break;
        case "notification":
          if (this.notificationHandler) {
            this.notificationHandler({
              method: e.method,
              params: e.params
            });
          }
          break;
        case "error":
          if (t.warn(`[${n}] Bridge error: ${e.error}`), this.selectedDeviceId) {
            this.selectedDeviceId = undefined;
            this.discoveryComplete = false;
          }
          break;
        default:
          t.warn(`[${n}] Unrecognized bridge message type: ${e.type}`);
      }
    }
    async handlePermissionRequest(e) {
      let {
        logger: t,
        serverName: n
      } = this.context;
      let r = e.tool_use_id;
      let o = e.request_id;
      if (!r || !o) {
        t.warn(`[${n}] permission_request missing tool_use_id or request_id`);
        return;
      }
      let s = this.pendingCalls.get(r);
      if (!s?.onPermissionRequest) {
        t.debug(`[${n}] Ignoring permission_request for unknown tool_use_id ${r.slice(0, 8)} (not our call)`);
        return;
      }
      let i = {
        toolUseId: r,
        requestId: o,
        toolType: e.tool_type ?? "unknown",
        url: e.url ?? "",
        actionData: e.action_data
      };
      clearTimeout(s.timer);
      s.permissionPaused = true;
      try {
        let l = await s.onPermissionRequest(i);
        this.sendPermissionResponse(o, l);
      } catch (l) {
        t.error(`[${n}] Error handling permission request:`, l);
        this.sendPermissionResponse(o, false);
      }
      let a = this.pendingCalls.get(r);
      if (a) {
        a.timer = this.createTimeoutTimer(r, a.timeoutMs);
      }
    }
    sendPermissionResponse(e, t) {
      if (this.ws?.readyState === Jge.default.OPEN) {
        let n = {
          type: "permission_response",
          request_id: e,
          allowed: t
        };
        if (this.selectedDeviceId) {
          n.target_device_id = this.selectedDeviceId;
        }
        this.ws.send(JSON.stringify(n));
      }
    }
    handleToolResult(e) {
      let {
        logger: t,
        serverName: n,
        trackEvent: r
      } = this.context;
      let o = e.tool_use_id;
      if (!o) {
        t.warn(`[${n}] Received tool_result without tool_use_id`);
        return;
      }
      let s = this.pendingCalls.get(o);
      if (!s) {
        t.debug(`[${n}] Received tool_result for unknown call: ${o.slice(0, 8)}`);
        let c = this.timedOutCalls.get(o);
        if (r?.("chrome_bridge_tool_call_late_result", {
          tool_use_id: o,
          gap_from_timeout_ms: c ? Date.now() - c : null,
          reason: c ? "post_timeout" : "unknown",
          is_error: typeof e.is_error === "boolean" ? e.is_error : null
        }), c) {
          this.timedOutCalls.delete(o);
        }
        return;
      }
      let i = Date.now() - s.startTime;
      let a = this.normalizeBridgeResponse(e);
      let l = Boolean(e.is_error) || "error" in a;
      if (clearTimeout(s.timer), this.pendingCalls.delete(o), l) {
        let c = a.error?.content;
        let u = "Unknown error";
        if (typeof c === "string" && c) {
          u = c.slice(0, 200);
        } else if (Array.isArray(c)) {
          let d = c.find(p => typeof p === "object" && p !== null && "text" in p);
          if (d?.text) {
            u = d.text.slice(0, 200);
          }
        }
        if (t.warn(`[${n}] Tool call error: ${s.toolName} (${o.slice(0, 8)}) after ${i}ms`), r?.("chrome_bridge_tool_call_error", {
          tool_name: s.toolName,
          tool_use_id: o,
          duration_ms: i,
          error_message: u,
          session_id: s.sessionId,
          user_message_uuid: s.userMessageUuid
        }), !this.selectedDeviceId && !this.pairingInProgress) {
          this.discoveryComplete = false;
          s.reject(new ExtensionDisconnectedMidCallError(`[${n}] Extension disconnected during tool call: ${s.toolName}`));
          return;
        }
      } else {
        t.debug(`[${n}] Tool call completed: ${s.toolName} (${o.slice(0, 8)}) in ${i}ms`);
        r?.("chrome_bridge_tool_call_completed", {
          tool_name: s.toolName,
          tool_use_id: o,
          duration_ms: i,
          session_id: s.sessionId,
          user_message_uuid: s.userMessageUuid
        });
      }
      s.resolve(a);
    }
    normalizeBridgeResponse(e) {
      if (e.result || e.error) {
        return e;
      }
      if (e.content) {
        if (e.is_error) {
          return {
            error: {
              content: e.content
            }
          };
        }
        return {
          result: {
            content: e.content
          }
        };
      }
      return e;
    }
    getTimeoutDiagnostics() {
      let e = -1;
      try {
        let n = process.getSystemMemoryInfo();
        let r = n.free + (n.fileBacked ?? 0);
        e = n.total > 0 ? Math.round(r / n.total * 1000) / 10 : -1;
      } catch {}
      let t = this.lastPongReceived > 0 ? Date.now() - this.lastPongReceived : undefined;
      return {
        free_mem_pct: e,
        pong_age_ms: t
      };
    }
    createTimeoutTimer(e, t) {
      let {
        logger: n,
        serverName: r,
        trackEvent: o
      } = this.context;
      return setTimeout(() => {
        let s = this.pendingCalls.get(e);
        if (!s) {
          return;
        }
        if (this.timedOutCalls.set(e, Date.now()), this.timedOutCalls.size > 200) {
          let l = this.timedOutCalls.keys().next().value;
          if (l) {
            this.timedOutCalls.delete(l);
          }
        }
        this.pendingCalls.delete(e);
        let i = Date.now() - s.startTime;
        let a = this.getTimeoutDiagnostics();
        if (n.warn(`[${r}] Tool call timeout: ${s.toolName} (${e.slice(0, 8)}) after ${i}ms, pending calls: ${this.pendingCalls.size}`), o?.("chrome_bridge_tool_call_timeout", {
          tool_name: s.toolName,
          tool_use_id: e,
          duration_ms: i,
          timeout_ms: t,
          session_id: s.sessionId,
          user_message_uuid: s.userMessageUuid,
          routing_ack_received: s.routingAckReceived ?? false,
          routing_ack_pong_age_ms: s.routingAckPongAgeMs ?? null,
          permission_paused: s.permissionPaused ?? false,
          ...a
        }), this.isConnected()) {
          s.reject(new ToolCallTimeoutError(`[${r}] Tool call timed out: ${s.toolName}`));
        } else {
          s.reject(new SocketConnectionError(`[${r}] Tool call timed out with bridge disconnected: ${s.toolName}`));
        }
      }, t);
    }
    scheduleReconnect() {
      let {
        logger: e,
        serverName: t,
        trackEvent: n
      } = this.context;
      if (this.reconnectTimer) {
        return;
      }
      if (this.reconnectAttempts++, this.reconnectAttempts > 100) {
        e.warn(`[${t}] Giving up bridge reconnection after 100 attempts`);
        n?.("chrome_bridge_reconnect_exhausted", {
          total_attempts: 100
        });
        this.reconnectAttempts = 0;
        return;
      }
      let r = Math.min(2000 * Math.pow(1.5, this.reconnectAttempts - 1), 30000);
      if (this.reconnectAttempts <= 10 || this.reconnectAttempts % 10 === 0) {
        e.info(`[${t}] Bridge reconnecting in ${Math.round(r)}ms (attempt ${this.reconnectAttempts})`);
      }
      this.reconnectTimer = setTimeout(() => {
        this.reconnectTimer = null;
        this.connect();
      }, r);
    }
    startKeepAlive() {
      this.stopKeepAlive();
      this.lastPongReceived = Date.now();
      let {
        logger: e,
        serverName: t
      } = this.context;
      this.keepAliveInterval = setInterval(() => {
        if (this.ws?.readyState === Jge.default.OPEN) {
          this.ws.send(JSON.stringify({
            type: "ping"
          }));
        }
        if (this.lastPongReceived > 0 && Date.now() - this.lastPongReceived > 90000) {
          e.warn(`[${t}] No pong received in ${90000}ms, closing dead connection`);
          this.rejectPendingCalls(new SocketConnectionError("Bridge keepalive timeout \u2014 connection dead"));
          this.closeSocket();
          this.scheduleReconnect();
        }
      }, 30000);
    }
    stopKeepAlive() {
      if (this.keepAliveInterval) {
        clearInterval(this.keepAliveInterval);
        this.keepAliveInterval = null;
      }
      this.lastPongReceived = 0;
    }
    closeSocket() {
      if (this.stopKeepAlive(), this.handshakeTimer) {
        clearTimeout(this.handshakeTimer);
        this.handshakeTimer = null;
      }
      if (this.ws) {
        if (this.ws.removeAllListeners(), this.ws.on("error", () => {}), this.ws.readyState === Jge.default.OPEN) {
          this.ws.close();
        } else {
          this.ws.terminate();
        }
        this.ws = null;
      }
      if (this.connected = false, this.authenticated = false, this.selectedDeviceId) {
        this.previousSelectedDeviceId = this.selectedDeviceId;
      }
      if (this.selectedDeviceId = undefined, this.discoveryComplete = false, this.multiBrowserPendingSelection = false, this.pendingPairingRequestId = undefined, this.pairingInProgress = false, this.abortPairingPrompt(), this.pendingSwitchResolve) {
        this.pendingSwitchResolve(null);
        this.pendingSwitchResolve = null;
      }
      if (this.pendingDiscovery) {
        clearTimeout(this.pendingDiscovery.timeout);
        this.pendingDiscovery.resolve([]);
        this.pendingDiscovery = null;
      }
      if (this.peerConnectedWaiters.length > 0) {
        let e = this.peerConnectedWaiters;
        this.peerConnectedWaiters = [];
        for (let t of e) {
          t(false);
        }
      }
    }
    rejectPendingCalls(e) {
      for (let t of this.pendingCalls.values()) {
        clearTimeout(t.timer);
        t.reject(e);
      }
      this.pendingCalls.clear();
    }
    cleanup() {
      if (this.reconnectTimer) {
        clearTimeout(this.reconnectTimer);
        this.reconnectTimer = null;
      }
      this.rejectPendingCalls(new SocketConnectionError("Bridge client disconnected"));
      this.closeSocket();
      this.reconnectAttempts = 0;
    }
  }
  function createBridgeClient(e) {
    return new BridgeClient(e);
  }
  var Jge;
  var txr = __lazy(() => {
    set();
    Jge = __toESM(require("ws"));
  });
  function NIt(e) {
    return `Before any browser action, you MUST call ${e ? `the ${e} tool` : "your ask-user tool (if available)"} with a question listing EVERY connected browser as a separate option (use the display name as the label, and include the deviceId in parentheses), plus one final option labeled exactly: "${"Open a confirmation screen in every connected Chrome extension and let me select the right one there."}" Do not skip any connected browser and do not pick one yourself. If the user picks a specific browser, call select_browser with that browser's deviceId. ` + "If the user picks the final option, call switch_browser \u2014 this sends a confirmation prompt to every connected Chrome extension and waits for the user to click Connect in the one they want; it also lets them name that browser.";
  }
  var MIt;
  var xms;
  var BROWSER_TOOLS;
  var aet = __lazy(() => {
    MIt = new Set(["tabs_context_mcp", "tabs_create_mcp", "tabs_close_mcp", "shortcuts_list", "shortcuts_execute", "resize_window", "switch_browser", "list_connected_browsers", "gif_creator"]);
    xms = new Set(["switch_browser", "list_connected_browsers", "select_browser"]);
    BROWSER_TOOLS = [{
      name: "javascript_tool",
      description: "Execute JavaScript code in the context of the current page. The code runs in the page's context and can interact with the DOM, window object, and page variables. Returns the result of the last expression or any thrown errors. If you don't have a valid tab ID, use tabs_context_mcp first to get available tabs.",
      inputSchema: {
        type: "object",
        properties: {
          action: {
            type: "string",
            description: "Must be set to 'javascript_exec'"
          },
          text: {
            type: "string",
            description: "The JavaScript code to execute. Evaluated in the page context with REPL semantics: top-level `await` works, and the result of the last expression is returned automatically \u2014 write the expression you want (e.g. `window.myData.value`, or `await fetch(url).then(r=>r.json())`) rather than `return ...`. You can access and modify the DOM, call page functions, and interact with page variables."
          },
          tabId: {
            type: "number",
            description: "Tab ID to execute the code in. Must be a tab in the current group. Use tabs_context_mcp first if you don't have a valid tab ID."
          }
        },
        required: ["action", "text", "tabId"]
      }
    }, {
      name: "read_page",
      description: "Get an accessibility tree representation of elements on the page. By default returns all elements including non-visible ones. Output is limited to 50000 characters by default. If the output exceeds this limit, you will receive an error asking you to specify a smaller depth or focus on a specific element using ref_id. Optionally filter for only interactive elements. If you don't have a valid tab ID, use tabs_context_mcp first to get available tabs.",
      inputSchema: {
        type: "object",
        properties: {
          filter: {
            type: "string",
            enum: ["interactive", "all"],
            description: 'Filter elements: "interactive" for buttons/links/inputs only, "all" for all elements including non-visible ones (default: all elements)'
          },
          tabId: {
            type: "number",
            description: "Tab ID to read from. Must be a tab in the current group. Use tabs_context_mcp first if you don't have a valid tab ID."
          },
          depth: {
            type: "number",
            description: "Maximum depth of the tree to traverse (default: 15). Use a smaller depth if output is too large."
          },
          ref_id: {
            type: "string",
            description: "Reference ID of a parent element to read. Will return the specified element and all its children. Use this to focus on a specific part of the page when output is too large."
          },
          max_chars: {
            type: "number",
            description: "Maximum characters for output (default: 50000). Set to a higher value if your client can handle large outputs."
          }
        },
        required: ["tabId"]
      }
    }, {
      name: "find",
      description: `Find elements on the page using natural language. Can search for elements by their purpose (e.g., "search bar", "login button") or by text content (e.g., "organic mango product"). Returns up to 20 matching elements with references that can be used with other tools. If more than 20 matches exist, you'll be notified to use a more specific query. If you don't have a valid tab ID, use tabs_context_mcp first to get available tabs.`,
      inputSchema: {
        type: "object",
        properties: {
          query: {
            type: "string",
            description: 'Natural language description of what to find (e.g., "search bar", "add to cart button", "product title containing organic")'
          },
          tabId: {
            type: "number",
            description: "Tab ID to search in. Must be a tab in the current group. Use tabs_context_mcp first if you don't have a valid tab ID."
          }
        },
        required: ["query", "tabId"]
      }
    }, {
      name: "form_input",
      description: "Set values in form elements using element reference ID from the read_page tool. If you don't have a valid tab ID, use tabs_context_mcp first to get available tabs.",
      inputSchema: {
        type: "object",
        properties: {
          ref: {
            type: "string",
            description: 'Element reference ID from the read_page tool (e.g., "ref_1", "ref_2")'
          },
          value: {
            type: ["string", "boolean", "number"],
            description: "The value to set. For checkboxes use boolean, for selects use option value or text, for other inputs use appropriate string/number"
          },
          tabId: {
            type: "number",
            description: "Tab ID to set form value in. Must be a tab in the current group. Use tabs_context_mcp first if you don't have a valid tab ID."
          }
        },
        required: ["ref", "value", "tabId"]
      }
    }, {
      name: "computer",
      description: `Use a mouse and keyboard to interact with a web browser, and take screenshots. If you don't have a valid tab ID, use tabs_context_mcp first to get available tabs.
* Whenever you intend to click on an element like an icon, you should consult a screenshot to determine the coordinates of the element before moving the cursor.
* If you tried clicking on a program or link but it failed to load, even after waiting, try adjusting your click location so that the tip of the cursor visually falls on the element that you want to click.
* Make sure to click any buttons, links, icons, etc with the cursor tip in the center of the element. Don't click boxes on their edges unless asked.`,
      inputSchema: {
        type: "object",
        properties: {
          action: {
            type: "string",
            enum: ["left_click", "right_click", "type", "screenshot", "wait", "scroll", "key", "left_click_drag", "double_click", "triple_click", "zoom", "scroll_to", "hover"],
            description: "The action to perform:\n* `left_click`: Click the left mouse button at the specified coordinates.\n* `right_click`: Click the right mouse button at the specified coordinates to open context menus.\n* `double_click`: Double-click the left mouse button at the specified coordinates.\n* `triple_click`: Triple-click the left mouse button at the specified coordinates.\n* `type`: Type a string of text.\n* `screenshot`: Take a screenshot of the screen.\n* `wait`: Wait for a specified number of seconds.\n* `scroll`: Scroll up, down, left, or right at the specified coordinates.\n* `key`: Press a specific keyboard key.\n* `left_click_drag`: Drag from start_coordinate to coordinate.\n* `zoom`: Take a screenshot of a specific region for closer inspection.\n* `scroll_to`: Scroll an element into view using its element reference ID from read_page or find tools.\n* `hover`: Move the mouse cursor to the specified coordinates or element without clicking. Useful for revealing tooltips, dropdown menus, or triggering hover states."
          },
          coordinate: {
            type: "array",
            items: {
              type: "number"
            },
            minItems: 2,
            maxItems: 2,
            description: "(x, y): The x (pixels from the left edge) and y (pixels from the top edge) coordinates. Required for `left_click`, `right_click`, `double_click`, `triple_click`, and `scroll`. For `left_click_drag`, this is the end position."
          },
          text: {
            type: "string",
            description: 'The text to type (for `type` action) or the key(s) to press (for `key` action). For `key` action: Provide space-separated keys (e.g., "Backspace Backspace Delete"). Supports keyboard shortcuts using the platform\'s modifier key (use "cmd" on Mac, "ctrl" on Windows/Linux, e.g., "cmd+a" or "ctrl+a" for select all).'
          },
          duration: {
            type: "number",
            minimum: 0,
            maximum: 10,
            description: `The number of seconds to wait. Required for \`wait\`. Maximum ${10} seconds.`
          },
          scroll_direction: {
            type: "string",
            enum: ["up", "down", "left", "right"],
            description: "The direction to scroll. Required for `scroll`."
          },
          scroll_amount: {
            type: "number",
            minimum: 1,
            maximum: 10,
            description: "The number of scroll wheel ticks. Optional for `scroll`, defaults to 3."
          },
          start_coordinate: {
            type: "array",
            items: {
              type: "number"
            },
            minItems: 2,
            maxItems: 2,
            description: "(x, y): The starting coordinates for `left_click_drag`."
          },
          region: {
            type: "array",
            items: {
              type: "number"
            },
            minItems: 4,
            maxItems: 4,
            description: "(x0, y0, x1, y1): The rectangular region to capture for `zoom`. Coordinates define a rectangle from top-left (x0, y0) to bottom-right (x1, y1) in pixels from the viewport origin. Required for `zoom` action. Useful for inspecting small UI elements like icons, buttons, or text."
          },
          repeat: {
            type: "number",
            minimum: 1,
            maximum: 100,
            description: "Number of times to repeat the key sequence. Only applicable for `key` action. Must be a positive integer between 1 and 100. Default is 1. Useful for navigation tasks like pressing arrow keys multiple times."
          },
          ref: {
            type: "string",
            description: 'Element reference ID from read_page or find tools (e.g., "ref_1", "ref_2"). Required for `scroll_to` action. Can be used as alternative to `coordinate` for click actions.'
          },
          modifiers: {
            type: "string",
            description: 'Modifier keys for click actions. Supports: "ctrl", "shift", "alt", "cmd" (or "meta"), "win" (or "windows"). Can be combined with "+" (e.g., "ctrl+shift", "cmd+alt"). Optional.'
          },
          tabId: {
            type: "number",
            description: "Tab ID to execute the action on. Must be a tab in the current group. Use tabs_context_mcp first if you don't have a valid tab ID."
          },
          save_to_disk: {
            type: "boolean",
            description: "For screenshot/zoom actions: save the image to disk so it can be attached to a message for the user. Returns the saved path in the tool result. Only set this when you intend to share the image \u2014 screenshots you're just looking at don't need saving."
          }
        },
        required: ["action", "tabId"]
      }
    }, {
      name: "browser_batch",
      description: "Execute a sequence of browser tool calls in ONE round trip. Each item is {name, input} where input is exactly what you'd pass to that tool standalone. Actions execute SEQUENTIALLY (not in parallel) and stop on the first error. Use this tool extensively to quickly execute work whenever you can predict two or more steps ahead \u2014 e.g. navigate, click a field, type, press Return, screenshot. Each tool's own permission check runs per item \u2014 if an action navigates to a domain without permission, the next item's check fails and the batch stops. Screenshots and other images are returned interleaved with outputs; coordinates you write in THIS batch refer to the screenshot taken BEFORE this call. browser_batch cannot be nested.",
      inputSchema: {
        type: "object",
        properties: {
          actions: {
            type: "array",
            minItems: 1,
            items: {
              type: "object",
              properties: {
                name: {
                  type: "string",
                  description: "Tool name (e.g. computer, navigate, find, tabs_create_mcp). browser_batch cannot be nested."
                },
                input: {
                  type: "object",
                  description: "That tool's input \u2014 same shape you'd pass when calling it directly."
                }
              },
              required: ["name", "input"]
            },
            description: 'List of tool calls to execute sequentially. Example: [{"name":"computer","input":{"action":"left_click","coordinate":[100,200],"tabId":123}},{"name":"computer","input":{"action":"type","text":"hello","tabId":123}},{"name":"navigate","input":{"url":"https://example.com","tabId":123}}]'
          }
        },
        required: ["actions"]
      }
    }, {
      name: "navigate",
      description: "Navigate to a URL, or go forward/back in browser history. If you don't have a valid tab ID, use tabs_context_mcp first to get available tabs.",
      inputSchema: {
        type: "object",
        properties: {
          url: {
            type: "string",
            description: 'The URL to navigate to. Can be provided with or without protocol (defaults to https://). Use "forward" to go forward in history or "back" to go back in history.'
          },
          tabId: {
            type: "number",
            description: "Tab ID to navigate. Must be a tab in the current group. Use tabs_context_mcp first if you don't have a valid tab ID."
          }
        },
        required: ["url", "tabId"]
      }
    }, {
      name: "resize_window",
      description: "Resize the current browser window to specified dimensions. Useful for testing responsive designs or setting up specific screen sizes. If you don't have a valid tab ID, use tabs_context_mcp first to get available tabs.",
      inputSchema: {
        type: "object",
        properties: {
          width: {
            type: "number",
            description: "Target window width in pixels"
          },
          height: {
            type: "number",
            description: "Target window height in pixels"
          },
          tabId: {
            type: "number",
            description: "Tab ID to get the window for. Must be a tab in the current group. Use tabs_context_mcp first if you don't have a valid tab ID."
          }
        },
        required: ["width", "height", "tabId"]
      }
    }, {
      name: "gif_creator",
      description: "Manage GIF recording and export for browser automation sessions. Control when to start/stop recording browser actions (clicks, scrolls, navigation), then export as an animated GIF with visual overlays (click indicators, action labels, progress bar, watermark). All operations are scoped to the tab's group. When starting recording, take a screenshot immediately after to capture the initial state as the first frame. When stopping recording, take a screenshot immediately before to capture the final state as the last frame. For export, either provide 'coordinate' to drag/drop upload to a page element, or set 'download: true' to download the GIF.",
      inputSchema: {
        type: "object",
        properties: {
          action: {
            type: "string",
            enum: ["start_recording", "stop_recording", "export", "clear"],
            description: "Action to perform: 'start_recording' (begin capturing), 'stop_recording' (stop capturing but keep frames), 'export' (generate and export GIF), 'clear' (discard frames)"
          },
          tabId: {
            type: "number",
            description: "Tab ID to identify which tab group this operation applies to"
          },
          download: {
            type: "boolean",
            description: "Always set this to true for the 'export' action only. This causes the gif to be downloaded in the browser."
          },
          filename: {
            type: "string",
            description: "Optional filename for exported GIF (default: 'recording-[timestamp].gif'). For 'export' action only."
          },
          options: {
            type: "object",
            description: "Optional GIF enhancement options for 'export' action. Properties: showClickIndicators (bool), showDragPaths (bool), showActionLabels (bool), showProgressBar (bool), showWatermark (bool), quality (number 1-30). All default to true except quality (default: 10).",
            properties: {
              showClickIndicators: {
                type: "boolean",
                description: "Show orange circles at click locations (default: true)"
              },
              showDragPaths: {
                type: "boolean",
                description: "Show red arrows for drag actions (default: true)"
              },
              showActionLabels: {
                type: "boolean",
                description: "Show black labels describing actions (default: true)"
              },
              showProgressBar: {
                type: "boolean",
                description: "Show orange progress bar at bottom (default: true)"
              },
              showWatermark: {
                type: "boolean",
                description: "Show Claude logo watermark (default: true)"
              },
              quality: {
                type: "number",
                description: "GIF compression quality, 1-30 (lower = better quality, slower encoding). Default: 10"
              }
            }
          }
        },
        required: ["action", "tabId"]
      }
    }, {
      name: "upload_image",
      description: "Upload a previously captured screenshot or user-uploaded image to a file input or drag & drop target. Supports two approaches: (1) ref - for targeting specific elements, especially hidden file inputs, (2) coordinate - for drag & drop to visible locations like Google Docs. Provide either ref or coordinate, not both.",
      inputSchema: {
        type: "object",
        properties: {
          imageId: {
            type: "string",
            description: "ID of a previously captured screenshot (from the computer tool's screenshot action) or a user-uploaded image"
          },
          ref: {
            type: "string",
            description: 'Element reference ID from read_page or find tools (e.g., "ref_1", "ref_2"). Use this for file inputs (especially hidden ones) or specific elements. Provide either ref or coordinate, not both.'
          },
          coordinate: {
            type: "array",
            items: {
              type: "number"
            },
            description: "Viewport coordinates [x, y] for drag & drop to a visible location. Use this for drag & drop targets like Google Docs. Provide either ref or coordinate, not both."
          },
          tabId: {
            type: "number",
            description: "Tab ID where the target element is located. This is where the image will be uploaded to."
          },
          filename: {
            type: "string",
            description: 'Optional filename for the uploaded file (default: "image.png")'
          }
        },
        required: ["imageId", "tabId"]
      }
    }, {
      name: "get_page_text",
      description: "Extract raw text content from the page, prioritizing article content. Ideal for reading articles, blog posts, or other text-heavy pages. Returns plain text without HTML formatting. If you don't have a valid tab ID, use tabs_context_mcp first to get available tabs.",
      inputSchema: {
        type: "object",
        properties: {
          tabId: {
            type: "number",
            description: "Tab ID to extract text from. Must be a tab in the current group. Use tabs_context_mcp first if you don't have a valid tab ID."
          }
        },
        required: ["tabId"]
      }
    }, {
      name: "tabs_context_mcp",
      title: "Tabs Context",
      description: "Get context information about the current MCP tab group. Returns all tab IDs inside the group if it exists. CRITICAL: You must get the context at least once before using other browser automation tools so you know what tabs exist. Each new conversation should create its own new tab (using tabs_create_mcp) rather than reusing existing tabs, unless the user explicitly asks to use an existing tab.",
      inputSchema: {
        type: "object",
        properties: {
          createIfEmpty: {
            type: "boolean",
            description: "Creates a new MCP tab group if none exists, creates a new Window with a new tab group containing an empty tab (which can be used for this conversation). If a MCP tab group already exists, this parameter has no effect."
          }
        },
        required: []
      }
    }, {
      name: "tabs_create_mcp",
      title: "Tabs Create",
      description: "Creates a new empty tab in the MCP tab group. CRITICAL: You must get the context using tabs_context_mcp at least once before using other browser automation tools so you know what tabs exist.",
      inputSchema: {
        type: "object",
        properties: {},
        required: []
      }
    }, {
      name: "tabs_close_mcp",
      title: "Tabs Close",
      description: "Close a tab in the MCP tab group by its ID. Use to clean up tabs you're done with. Only tabs in this session's group are closable; call tabs_context_mcp first to get valid IDs. If you " + "close the group's last tab, Chrome auto-removes the group \u2014 " + "the next tabs_context_mcp with createIfEmpty starts fresh.",
      inputSchema: {
        type: "object",
        properties: {
          tabId: {
            type: "integer",
            description: "The ID of the tab to close. Must be in this session's tab group. Get valid IDs from tabs_context_mcp."
          }
        },
        required: ["tabId"]
      }
    }, {
      name: "read_console_messages",
      description: "Read browser console messages (console.log, console.error, console.warn, etc.) from a specific tab. Useful for debugging JavaScript errors, viewing application logs, or understanding what's happening in the browser console. Returns console messages from the current domain only. If you don't have a valid tab ID, use tabs_context_mcp first to get available tabs. IMPORTANT: Always provide a pattern to filter messages - without a pattern, you may get too many irrelevant messages.",
      inputSchema: {
        type: "object",
        properties: {
          tabId: {
            type: "number",
            description: "Tab ID to read console messages from. Must be a tab in the current group. Use tabs_context_mcp first if you don't have a valid tab ID."
          },
          onlyErrors: {
            type: "boolean",
            description: "If true, only return error and exception messages. Default is false (return all message types)."
          },
          clear: {
            type: "boolean",
            description: "If true, clear the console messages after reading to avoid duplicates on subsequent calls. Default is false."
          },
          pattern: {
            type: "string",
            description: "Regex pattern to filter console messages. Only messages matching this pattern will be returned (e.g., 'error|warning' to find errors and warnings, 'MyApp' to filter app-specific logs). You should always provide a pattern to avoid getting too many irrelevant messages."
          },
          limit: {
            type: "number",
            description: "Maximum number of messages to return. Defaults to 100. Increase only if you need more results."
          }
        },
        required: ["tabId"]
      }
    }, {
      name: "read_network_requests",
      description: "Read HTTP network requests (XHR, Fetch, documents, images, etc.) from a specific tab. Useful for debugging API calls, monitoring network activity, or understanding what requests a page is making. Returns all network requests made by the current page, including cross-origin requests. Requests are automatically cleared when the page navigates to a different domain. If you don't have a valid tab ID, use tabs_context_mcp first to get available tabs.",
      inputSchema: {
        type: "object",
        properties: {
          tabId: {
            type: "number",
            description: "Tab ID to read network requests from. Must be a tab in the current group. Use tabs_context_mcp first if you don't have a valid tab ID."
          },
          urlPattern: {
            type: "string",
            description: "Optional URL pattern to filter requests. Only requests whose URL contains this string will be returned (e.g., '/api/' to filter API calls, 'example.com' to filter by domain)."
          },
          clear: {
            type: "boolean",
            description: "If true, clear the network requests after reading to avoid duplicates on subsequent calls. Default is false."
          },
          limit: {
            type: "number",
            description: "Maximum number of requests to return. Defaults to 100. Increase only if you need more results."
          }
        },
        required: ["tabId"]
      }
    }, {
      name: "shortcuts_list",
      description: "List all available shortcuts and workflows (shortcuts and workflows are interchangeable). Returns shortcuts with their commands, descriptions, and whether they are workflows. Use shortcuts_execute to run a shortcut or workflow.",
      inputSchema: {
        type: "object",
        properties: {
          tabId: {
            type: "number",
            description: "Tab ID to list shortcuts from. Must be a tab in the current group. Use tabs_context_mcp first if you don't have a valid tab ID."
          }
        },
        required: ["tabId"]
      }
    }, {
      name: "shortcuts_execute",
      description: "Execute a shortcut or workflow by running it in a new sidepanel window using the current tab (shortcuts and workflows are interchangeable). Use shortcuts_list first to see available shortcuts. This starts the execution and returns immediately - it does not wait for completion.",
      inputSchema: {
        type: "object",
        properties: {
          tabId: {
            type: "number",
            description: "Tab ID to execute the shortcut on. Must be a tab in the current group. Use tabs_context_mcp first if you don't have a valid tab ID."
          },
          shortcutId: {
            type: "string",
            description: "The ID of the shortcut to execute"
          },
          command: {
            type: "string",
            description: "The command name of the shortcut to execute (e.g., 'debug', 'summarize'). Do not include the leading slash."
          }
        },
        required: ["tabId"]
      }
    }, {
      name: "file_upload",
      description: "Upload one or multiple files to a file input element on the page. Do not click on file upload buttons or file inputs \u2014 clicking opens a native file picker dialog that you cannot see or interact with. Instead, use read_page or find to locate the file input element, then use this tool with its ref to upload files directly. Only files the user has shared with this session (attachments, the session's outputs/uploads folders, or folders the user has connected) can be uploaded; other paths will be rejected. The combined size of all files in a single call must stay under 10 MB.",
      inputSchema: {
        type: "object",
        properties: {
          paths: {
            type: "array",
            items: {
              type: "string"
            },
            description: "Absolute paths to the files to upload. Each path must be a file the user has shared with this session."
          },
          ref: {
            type: "string",
            description: 'Element reference ID of the file input from read_page or find tools (e.g., "ref_1", "ref_2").'
          },
          tabId: {
            type: "number",
            description: "Tab ID where the file input is located. Use tabs_context_mcp first if you don't have a valid tab ID."
          }
        },
        required: ["paths", "ref", "tabId"]
      }
    }, {
      name: "switch_browser",
      description: "Send a connection request to every Chrome browser with the extension installed and wait (up to 2 minutes) for the user to click 'Connect' in the one they want to use. The user can name the browser when they connect. Use this when the user wants to pick the browser themselves from inside Chrome rather than choosing from a list; otherwise prefer select_browser with a known deviceId.",
      inputSchema: {
        type: "object",
        properties: {},
        required: []
      }
    }, {
      name: "list_connected_browsers",
      description: "List all Chrome browsers (extension instances) currently connected to this account. Returns each browser's deviceId, display name, OS platform, and whether it appears to be on this computer. Use this before select_browser to present choices to the user.",
      inputSchema: {
        type: "object",
        properties: {},
        required: []
      }
    }, {
      name: "select_browser",
      description: "Select a specific Chrome browser by deviceId for browser automation, without broadcasting a pairing request. Use this after list_connected_browsers when the user has chosen one from the list.",
      inputSchema: {
        type: "object",
        properties: {
          deviceId: {
            type: "string",
            description: "The deviceId from list_connected_browsers."
          }
        },
        required: ["deviceId"]
      }
    }];
  });
  var util;
  var objectUtil;
  var ZodParsedType;
  var getParsedType = e => {
    switch (typeof e) {
      case "undefined":
        return ZodParsedType.undefined;
      case "string":
        return ZodParsedType.string;
      case "number":
        return Number.isNaN(e) ? ZodParsedType.nan : ZodParsedType.number;
      case "boolean":
        return ZodParsedType.boolean;
      case "function":
        return ZodParsedType.function;
      case "bigint":
        return ZodParsedType.bigint;
      case "symbol":
        return ZodParsedType.symbol;
      case "object":
        if (Array.isArray(e)) {
          return ZodParsedType.array;
        }
        if (e === null) {
          return ZodParsedType.null;
        }
        if (e.then && typeof e.then === "function" && e.catch && typeof e.catch === "function") {
          return ZodParsedType.promise;
        }
        if (typeof Map < "u" && e instanceof Map) {
          return ZodParsedType.map;
        }
        if (typeof Set < "u" && e instanceof Set) {
          return ZodParsedType.set;
        }
        if (typeof Date < "u" && e instanceof Date) {
          return ZodParsedType.date;
        }
        return ZodParsedType.object;
      default:
        return ZodParsedType.unknown;
    }
  };
  var FIt = __lazy(() => {
    (function (e) {
      e.assertEqual = o => {};
      function t(o) {}
      e.assertIs = t;
      function n(o) {
        throw Error();
      }
      e.assertNever = n;
      e.arrayToEnum = o => {
        let s = {};
        for (let i of o) {
          s[i] = i;
        }
        return s;
      };
      e.getValidEnumValues = o => {
        let s = e.objectKeys(o).filter(a => typeof o[o[a]] !== "number");
        let i = {};
        for (let a of s) {
          i[a] = o[a];
        }
        return e.objectValues(i);
      };
      e.objectValues = o => e.objectKeys(o).map(function (s) {
        return o[s];
      });
      e.objectKeys = typeof Object.keys === "function" ? o => Object.keys(o) : o => {
        let s = [];
        for (let i in o) {
          if (Object.prototype.hasOwnProperty.call(o, i)) {
            s.push(i);
          }
        }
        return s;
      };
      e.find = (o, s) => {
        for (let i of o) {
          if (s(i)) {
            return i;
          }
        }
        return;
      };
      e.isInteger = typeof Number.isInteger === "function" ? o => Number.isInteger(o) : o => typeof o === "number" && Number.isFinite(o) && Math.floor(o) === o;
      function r(o, s = " | ") {
        return o.map(i => typeof i === "string" ? `'${i}'` : i).join(s);
      }
      e.joinValues = r;
      e.jsonStringifyReplacer = (o, s) => {
        if (typeof s === "bigint") {
          return s.toString();
        }
        return s;
      };
    })(util || (util = {}));
    (function (e) {
      e.mergeShapes = (t, n) => ({
        ...t,
        ...n
      });
    })(objectUtil || (objectUtil = {}));
    ZodParsedType = util.arrayToEnum(["string", "nan", "number", "integer", "float", "boolean", "date", "bigint", "symbol", "function", "undefined", "null", "array", "object", "unknown", "promise", "void", "never", "map", "set"]);
  });
  var ZodIssueCode;
  var quotelessJson = e => JSON.stringify(e, null, 2).replace(/"([^"]+)":/g, "$1:");
  var ZodError;
  var _un = __lazy(() => {
    FIt();
    ZodIssueCode = util.arrayToEnum(["invalid_type", "invalid_literal", "custom", "invalid_union", "invalid_union_discriminator", "invalid_enum_value", "unrecognized_keys", "invalid_arguments", "invalid_return_type", "invalid_date", "invalid_string", "too_small", "too_big", "invalid_intersection_types", "not_multiple_of", "not_finite"]);
    ZodError = class j4 extends Error {
      get errors() {
        return this.issues;
      }
      constructor(e) {
        super();
        this.issues = [];
        this.addIssue = n => {
          this.issues = [...this.issues, n];
        };
        this.addIssues = (n = []) => {
          this.issues = [...this.issues, ...n];
        };
        let t = new.target.prototype;
        if (Object.setPrototypeOf) {
          Object.setPrototypeOf(this, t);
        } else {
          this.__proto__ = t;
        }
        this.name = "ZodError";
        this.issues = e;
      }
      format(e) {
        let t = e || function (o) {
          return o.message;
        };
        let n = {
          _errors: []
        };
        let r = o => {
          for (let s of o.issues) {
            if (s.code === "invalid_union") {
              s.unionErrors.map(r);
            } else if (s.code === "invalid_return_type") {
              r(s.returnTypeError);
            } else if (s.code === "invalid_arguments") {
              r(s.argumentsError);
            } else if (s.path.length === 0) {
              n._errors.push(t(s));
            } else {
              let i = n;
              let a = 0;
              while (a < s.path.length) {
                let l = s.path[a];
                if (a !== s.path.length - 1) {
                  i[l] = i[l] || {
                    _errors: []
                  };
                } else {
                  i[l] = i[l] || {
                    _errors: []
                  };
                  i[l]._errors.push(t(s));
                }
                i = i[l];
                a++;
              }
            }
          }
        };
        r(this);
        return n;
      }
      static assert(e) {
        if (!(e instanceof j4)) {
          throw Error(`Not a ZodError: ${e}`);
        }
      }
      toString() {
        return this.message;
      }
      get message() {
        return JSON.stringify(this.issues, util.jsonStringifyReplacer, 2);
      }
      get isEmpty() {
        return this.issues.length === 0;
      }
      flatten(e = t => t.message) {
        let t = {};
        let n = [];
        for (let r of this.issues) {
          if (r.path.length > 0) {
            let o = r.path[0];
            t[o] = t[o] || [];
            t[o].push(e(r));
          } else {
            n.push(e(r));
          }
        }
        return {
          formErrors: n,
          fieldErrors: t
        };
      }
      get formErrors() {
        return this.flatten();
      }
    };
    ZodError.create = e => new ZodError(e);
  });
  var Niu = (e, t) => {
    let n;
    switch (e.code) {
      case ZodIssueCode.invalid_type:
        if (e.received === ZodParsedType.undefined) {
          n = "Required";
        } else {
          n = `Expected ${e.expected}, received ${e.received}`;
        }
        break;
      case ZodIssueCode.invalid_literal:
        n = `Invalid literal value, expected ${JSON.stringify(e.expected, util.jsonStringifyReplacer)}`;
        break;
      case ZodIssueCode.unrecognized_keys:
        n = `Unrecognized key(s) in object: ${util.joinValues(e.keys, ", ")}`;
        break;
      case ZodIssueCode.invalid_union:
        n = "Invalid input";
        break;
      case ZodIssueCode.invalid_union_discriminator:
        n = `Invalid discriminator value. Expected ${util.joinValues(e.options)}`;
        break;
      case ZodIssueCode.invalid_enum_value:
        n = `Invalid enum value. Expected ${util.joinValues(e.options)}, received '${e.received}'`;
        break;
      case ZodIssueCode.invalid_arguments:
        n = "Invalid function arguments";
        break;
      case ZodIssueCode.invalid_return_type:
        n = "Invalid function return type";
        break;
      case ZodIssueCode.invalid_date:
        n = "Invalid date";
        break;
      case ZodIssueCode.invalid_string:
        if (typeof e.validation === "object") {
          if ("includes" in e.validation) {
            if (n = `Invalid input: must include "${e.validation.includes}"`, typeof e.validation.position === "number") {
              n = `${n} at one or more positions greater than or equal to ${e.validation.position}`;
            }
          } else if ("startsWith" in e.validation) {
            n = `Invalid input: must start with "${e.validation.startsWith}"`;
          } else if ("endsWith" in e.validation) {
            n = `Invalid input: must end with "${e.validation.endsWith}"`;
          } else {
            util.assertNever(e.validation);
          }
        } else if (e.validation !== "regex") {
          n = `Invalid ${e.validation}`;
        } else {
          n = "Invalid";
        }
        break;
      case ZodIssueCode.too_small:
        if (e.type === "array") {
          n = `Array must contain ${e.exact ? "exactly" : e.inclusive ? "at least" : "more than"} ${e.minimum} element(s)`;
        } else if (e.type === "string") {
          n = `String must contain ${e.exact ? "exactly" : e.inclusive ? "at least" : "over"} ${e.minimum} character(s)`;
        } else if (e.type === "number") {
          n = `Number must be ${e.exact ? "exactly equal to " : e.inclusive ? "greater than or equal to " : "greater than "}${e.minimum}`;
        } else if (e.type === "bigint") {
          n = `Number must be ${e.exact ? "exactly equal to " : e.inclusive ? "greater than or equal to " : "greater than "}${e.minimum}`;
        } else if (e.type === "date") {
          n = `Date must be ${e.exact ? "exactly equal to " : e.inclusive ? "greater than or equal to " : "greater than "}${new Date(Number(e.minimum))}`;
        } else {
          n = "Invalid input";
        }
        break;
      case ZodIssueCode.too_big:
        if (e.type === "array") {
          n = `Array must contain ${e.exact ? "exactly" : e.inclusive ? "at most" : "less than"} ${e.maximum} element(s)`;
        } else if (e.type === "string") {
          n = `String must contain ${e.exact ? "exactly" : e.inclusive ? "at most" : "under"} ${e.maximum} character(s)`;
        } else if (e.type === "number") {
          n = `Number must be ${e.exact ? "exactly" : e.inclusive ? "less than or equal to" : "less than"} ${e.maximum}`;
        } else if (e.type === "bigint") {
          n = `BigInt must be ${e.exact ? "exactly" : e.inclusive ? "less than or equal to" : "less than"} ${e.maximum}`;
        } else if (e.type === "date") {
          n = `Date must be ${e.exact ? "exactly" : e.inclusive ? "smaller than or equal to" : "smaller than"} ${new Date(Number(e.maximum))}`;
        } else {
          n = "Invalid input";
        }
        break;
      case ZodIssueCode.custom:
        n = "Invalid input";
        break;
      case ZodIssueCode.invalid_intersection_types:
        n = "Intersection results could not be merged";
        break;
      case ZodIssueCode.not_multiple_of:
        n = `Number must be a multiple of ${e.multipleOf}`;
        break;
      case ZodIssueCode.not_finite:
        n = "Number must be finite";
        break;
      default:
        n = t.defaultError;
        util.assertNever(e);
    }
    return {
      message: n
    };
  };
  function setErrorMap(e) {
    kms = e;
  }
  function getErrorMap() {
    return defaultErrorMap;
  }
  function addIssueToContext(e, t) {
    let n = getErrorMap();
    let r = makeIssue({
      issueData: t,
      data: e.data,
      path: e.path,
      errorMaps: [e.common.contextualErrorMap, e.schemaErrorMap, n, n === Niu ? undefined : Niu].filter(o => !!o)
    });
    e.common.issues.push(r);
  }
  class ParseStatus {
    constructor() {
      this.value = "valid";
    }
    dirty() {
      if (this.value === "valid") {
        this.value = "dirty";
      }
    }
    abort() {
      if (this.value !== "aborted") {
        this.value = "aborted";
      }
    }
    static mergeArray(e, t) {
      let n = [];
      for (let r of t) {
        if (r.status === "aborted") {
          return INVALID;
        }
        if (r.status === "dirty") {
          e.dirty();
        }
        n.push(r.value);
      }
      return {
        status: e.value,
        value: n
      };
    }
    static async mergeObjectAsync(e, t) {
      let n = [];
      for (let r of t) {
        let o = await r.key;
        let s = await r.value;
        n.push({
          key: o,
          value: s
        });
      }
      return ParseStatus.mergeObjectSync(e, n);
    }
    static mergeObjectSync(e, t) {
      let n = {};
      for (let r of t) {
        let {
          key: o,
          value: s
        } = r;
        if (o.status === "aborted") {
          return INVALID;
        }
        if (s.status === "aborted") {
          return INVALID;
        }
        if (o.status === "dirty") {
          e.dirty();
        }
        if (s.status === "dirty") {
          e.dirty();
        }
        if (o.value !== "__proto__" && (typeof s.value < "u" || r.alwaysSet)) {
          n[o.value] = s.value;
        }
      }
      return {
        status: e.value,
        value: n
      };
    }
  }
  var makeIssue = e => {
    let {
      data: t,
      path: n,
      errorMaps: r,
      issueData: o
    } = e;
    let s = [...n, ...(o.path || [])];
    let i = {
      ...o,
      path: s
    };
    if (o.message !== undefined) {
      return {
        ...o,
        path: s,
        message: o.message
      };
    }
    let a = "";
    let l = r.filter(c => !!c).slice().reverse();
    for (let c of l) {
      a = c(i, {
        data: t,
        defaultError: a
      }).message;
    }
    return {
      ...o,
      path: s,
      message: a
    };
  };
  var EMPTY_PATH;
  var INVALID;
  var DIRTY = e => ({
    status: "dirty",
    value: e
  });
  var OK = e => ({
    status: "valid",
    value: e
  });
  var isAborted = e => e.status === "aborted";
  var isDirty = e => e.status === "dirty";
  var isValid = e => e.status === "valid";
  var isAsync = e => typeof Promise < "u" && e instanceof Promise;
  var oxr = __lazy(() => {
    EMPTY_PATH = [];
    INVALID = Object.freeze({
      status: "aborted"
    });
  });
  var Ams = () => {};
  var qc;
  var Ims = __lazy(() => {
    (function (e) {
      e.errToObj = t => typeof t === "string" ? {
        message: t
      } : t || {};
      e.toString = t => typeof t === "string" ? t : t?.message;
    })(qc || (qc = {}));
  });
  class gte {
    constructor(e, t, n, r) {
      this._cachedPath = [];
      this.parent = e;
      this.data = t;
      this._path = n;
      this._key = r;
    }
    get path() {
      if (!this._cachedPath.length) {
        if (Array.isArray(this._key)) {
          this._cachedPath.push(...this._path, ...this._key);
        } else {
          this._cachedPath.push(...this._path, this._key);
        }
      }
      return this._cachedPath;
    }
  }
  function Lm(e) {
    if (!e) {
      return {};
    }
    let {
      errorMap: t,
      invalid_type_error: n,
      required_error: r,
      description: o
    } = e;
    if (t && (n || r)) {
      throw Error(`Can't use "invalid_type_error" or "required_error" in conjunction with custom error map.`);
    }
    if (t) {
      return {
        errorMap: t,
        description: o
      };
    }
    return {
      errorMap: (i, a) => {
        let {
          message: l
        } = e;
        if (i.code === "invalid_enum_value") {
          return {
            message: l ?? a.defaultError
          };
        }
        if (typeof a.data > "u") {
          return {
            message: l ?? r ?? a.defaultError
          };
        }
        if (i.code !== "invalid_type") {
          return {
            message: a.defaultError
          };
        }
        return {
          message: l ?? n ?? a.defaultError
        };
      },
      description: o
    };
  }
  class ZodType {
    get description() {
      return this._def.description;
    }
    _getType(e) {
      return getParsedType(e.data);
    }
    _getOrReturnCtx(e, t) {
      return t || {
        common: e.parent.common,
        data: e.data,
        parsedType: getParsedType(e.data),
        schemaErrorMap: this._def.errorMap,
        path: e.path,
        parent: e.parent
      };
    }
    _processInputParams(e) {
      return {
        status: new ParseStatus(),
        ctx: {
          common: e.parent.common,
          data: e.data,
          parsedType: getParsedType(e.data),
          schemaErrorMap: this._def.errorMap,
          path: e.path,
          parent: e.parent
        }
      };
    }
    _parseSync(e) {
      let t = this._parse(e);
      if (isAsync(t)) {
        throw Error("Synchronous parse encountered promise.");
      }
      return t;
    }
    _parseAsync(e) {
      let t = this._parse(e);
      return Promise.resolve(t);
    }
    parse(e, t) {
      let n = this.safeParse(e, t);
      if (n.success) {
        return n.data;
      }
      throw n.error;
    }
    safeParse(e, t) {
      let n = {
        common: {
          issues: [],
          async: t?.async ?? false,
          contextualErrorMap: t?.errorMap
        },
        path: t?.path || [],
        schemaErrorMap: this._def.errorMap,
        parent: null,
        data: e,
        parsedType: getParsedType(e)
      };
      let r = this._parseSync({
        data: e,
        path: n.path,
        parent: n
      });
      return Pms(n, r);
    }
    "~validate"(e) {
      let t = {
        common: {
          issues: [],
          async: !!this["~standard"].async
        },
        path: [],
        schemaErrorMap: this._def.errorMap,
        parent: null,
        data: e,
        parsedType: getParsedType(e)
      };
      if (!this["~standard"].async) {
        try {
          let n = this._parseSync({
            data: e,
            path: [],
            parent: t
          });
          return isValid(n) ? {
            value: n.value
          } : {
            issues: t.common.issues
          };
        } catch (n) {
          if (n?.message?.toLowerCase()?.includes("encountered")) {
            this["~standard"].async = true;
          }
          t.common = {
            issues: [],
            async: true
          };
        }
      }
      return this._parseAsync({
        data: e,
        path: [],
        parent: t
      }).then(n => isValid(n) ? {
        value: n.value
      } : {
        issues: t.common.issues
      });
    }
    async parseAsync(e, t) {
      let n = await this.safeParseAsync(e, t);
      if (n.success) {
        return n.data;
      }
      throw n.error;
    }
    async safeParseAsync(e, t) {
      let n = {
        common: {
          issues: [],
          contextualErrorMap: t?.errorMap,
          async: true
        },
        path: t?.path || [],
        schemaErrorMap: this._def.errorMap,
        parent: null,
        data: e,
        parsedType: getParsedType(e)
      };
      let r = this._parse({
        data: e,
        path: n.path,
        parent: n
      });
      let o = await (isAsync(r) ? r : Promise.resolve(r));
      return Pms(n, o);
    }
    refine(e, t) {
      let n = r => {
        if (typeof t === "string" || typeof t > "u") {
          return {
            message: t
          };
        } else if (typeof t === "function") {
          return t(r);
        } else {
          return t;
        }
      };
      return this._refinement((r, o) => {
        let s = e(r);
        let i = () => o.addIssue({
          code: ZodIssueCode.custom,
          ...n(r)
        });
        if (typeof Promise < "u" && s instanceof Promise) {
          return s.then(a => {
            if (!a) {
              i();
              return false;
            } else {
              return true;
            }
          });
        }
        if (!s) {
          i();
          return false;
        } else {
          return true;
        }
      });
    }
    refinement(e, t) {
      return this._refinement((n, r) => {
        if (!e(n)) {
          r.addIssue(typeof t === "function" ? t(n, r) : t);
          return false;
        } else {
          return true;
        }
      });
    }
    _refinement(e) {
      return new ZodTransformer({
        schema: this,
        typeName: ZodFirstPartyTypeKind.ZodEffects,
        effect: {
          type: "refinement",
          refinement: e
        }
      });
    }
    superRefine(e) {
      return this._refinement(e);
    }
    constructor(e) {
      this.spa = this.safeParseAsync;
      this._def = e;
      this.parse = this.parse.bind(this);
      this.safeParse = this.safeParse.bind(this);
      this.parseAsync = this.parseAsync.bind(this);
      this.safeParseAsync = this.safeParseAsync.bind(this);
      this.spa = this.spa.bind(this);
      this.refine = this.refine.bind(this);
      this.refinement = this.refinement.bind(this);
      this.superRefine = this.superRefine.bind(this);
      this.optional = this.optional.bind(this);
      this.nullable = this.nullable.bind(this);
      this.nullish = this.nullish.bind(this);
      this.array = this.array.bind(this);
      this.promise = this.promise.bind(this);
      this.or = this.or.bind(this);
      this.and = this.and.bind(this);
      this.transform = this.transform.bind(this);
      this.brand = this.brand.bind(this);
      this.default = this.default.bind(this);
      this.catch = this.catch.bind(this);
      this.describe = this.describe.bind(this);
      this.pipe = this.pipe.bind(this);
      this.readonly = this.readonly.bind(this);
      this.isNullable = this.isNullable.bind(this);
      this.isOptional = this.isOptional.bind(this);
      this["~standard"] = {
        version: 1,
        vendor: "zod",
        validate: t => this["~validate"](t)
      };
    }
    optional() {
      return ZodOptional.create(this, this._def);
    }
    nullable() {
      return ZodNullable.create(this, this._def);
    }
    nullish() {
      return this.nullable().optional();
    }
    array() {
      return ZodArray.create(this);
    }
    promise() {
      return ZodPromise.create(this, this._def);
    }
    or(e) {
      return ZodUnion.create([this, e], this._def);
    }
    and(e) {
      return ZodIntersection.create(this, e, this._def);
    }
    transform(e) {
      return new ZodTransformer({
        ...Lm(this._def),
        schema: this,
        typeName: ZodFirstPartyTypeKind.ZodEffects,
        effect: {
          type: "transform",
          transform: e
        }
      });
    }
    default(e) {
      let t = typeof e === "function" ? e : () => e;
      return new ZodDefault({
        ...Lm(this._def),
        innerType: this,
        defaultValue: t,
        typeName: ZodFirstPartyTypeKind.ZodDefault
      });
    }
    brand() {
      return new ZodBranded({
        typeName: ZodFirstPartyTypeKind.ZodBranded,
        type: this,
        ...Lm(this._def)
      });
    }
    catch(e) {
      let t = typeof e === "function" ? e : () => e;
      return new ZodCatch({
        ...Lm(this._def),
        innerType: this,
        catchValue: t,
        typeName: ZodFirstPartyTypeKind.ZodCatch
      });
    }
    describe(e) {
      return new this.constructor({
        ...this._def,
        description: e
      });
    }
    pipe(e) {
      return ZodPipeline.create(this, e);
    }
    readonly() {
      return ZodReadonly.create(this);
    }
    isOptional() {
      return this.safeParse(undefined).success;
    }
    isNullable() {
      return this.safeParse(null).success;
    }
  }
  function Mms(e) {
    let t = "[0-5]\\d";
    if (e.precision) {
      t = `${t}\\.\\d{${e.precision}}`;
    } else if (e.precision == null) {
      t = `${t}(\\.\\d+)?`;
    }
    let n = e.precision ? "+" : "?";
    return `([01]\\d|2[0-3]):[0-5]\\d(:${t})${n}`;
  }
  function eau(e) {
    return new RegExp(`^${Mms(e)}$`);
  }
  function datetimeRegex(e) {
    let t = `${"((\\d\\d[2468][048]|\\d\\d[13579][26]|\\d\\d0[48]|[02468][048]00|[13579][26]00)-02-29|\\d{4}-((0[13578]|1[02])-(0[1-9]|[12]\\d|3[01])|(0[469]|11)-(0[1-9]|[12]\\d|30)|(02)-(0[1-9]|1\\d|2[0-8])))"}T${Mms(e)}`;
    let n = [];
    if (n.push(e.local ? "Z?" : "Z"), e.offset) {
      n.push("([+-]\\d{2}:?\\d{2})");
    }
    t = `${t}(${n.join("|")})`;
    return new RegExp(`^${t}$`);
  }
  function tau(e, t) {
    if ((t === "v4" || !t) && ziu.test(e)) {
      return true;
    }
    if ((t === "v6" || !t) && Yiu.test(e)) {
      return true;
    }
    return false;
  }
  function nau(e, t) {
    if (!qiu.test(e)) {
      return false;
    }
    try {
      let [n] = e.split(".");
      if (!n) {
        return false;
      }
      let r = n.replace(/-/g, "+").replace(/_/g, "/").padEnd(n.length + (4 - n.length % 4) % 4, "=");
      let o = JSON.parse(atob(r));
      if (typeof o !== "object" || o === null) {
        return false;
      }
      if ("typ" in o && o?.typ !== "JWT") {
        return false;
      }
      if (!o.alg) {
        return false;
      }
      if (t && o.alg !== t) {
        return false;
      }
      return true;
    } catch {
      return false;
    }
  }
  function rau(e, t) {
    if ((t === "v4" || !t) && Kiu.test(e)) {
      return true;
    }
    if ((t === "v6" || !t) && Jiu.test(e)) {
      return true;
    }
    return false;
  }
  function oau(e, t) {
    let n = (e.toString().split(".")[1] || "").length;
    let r = (t.toString().split(".")[1] || "").length;
    let o = n > r ? n : r;
    let s = Number.parseInt(e.toFixed(o).replace(".", ""));
    let i = Number.parseInt(t.toFixed(o).replace(".", ""));
    return s % i / 10 ** o;
  }
  function det(e) {
    if (e instanceof ZodObject) {
      let t = {};
      for (let n in e.shape) {
        let r = e.shape[n];
        t[n] = ZodOptional.create(det(r));
      }
      return new ZodObject({
        ...e._def,
        shape: () => t
      });
    } else if (e instanceof ZodArray) {
      return new ZodArray({
        ...e._def,
        type: det(e.element)
      });
    } else if (e instanceof ZodOptional) {
      return ZodOptional.create(det(e.unwrap()));
    } else if (e instanceof ZodNullable) {
      return ZodNullable.create(det(e.unwrap()));
    } else if (e instanceof ZodTuple) {
      return ZodTuple.create(e.items.map(t => det(t)));
    } else {
      return e;
    }
  }
  function ixr(e, t) {
    let n = getParsedType(e);
    let r = getParsedType(t);
    if (e === t) {
      return {
        valid: true,
        data: e
      };
    } else if (n === ZodParsedType.object && r === ZodParsedType.object) {
      let o = util.objectKeys(t);
      let s = util.objectKeys(e).filter(a => o.indexOf(a) !== -1);
      let i = {
        ...e,
        ...t
      };
      for (let a of s) {
        let l = ixr(e[a], t[a]);
        if (!l.valid) {
          return {
            valid: false
          };
        }
        i[a] = l.data;
      }
      return {
        valid: true,
        data: i
      };
    } else if (n === ZodParsedType.array && r === ZodParsedType.array) {
      if (e.length !== t.length) {
        return {
          valid: false
        };
      }
      let o = [];
      for (let s = 0; s < e.length; s++) {
        let i = e[s];
        let a = t[s];
        let l = ixr(i, a);
        if (!l.valid) {
          return {
            valid: false
          };
        }
        o.push(l.data);
      }
      return {
        valid: true,
        data: o
      };
    } else if (n === ZodParsedType.date && r === ZodParsedType.date && +e === +t) {
      return {
        valid: true,
        data: e
      };
    } else {
      return {
        valid: false
      };
    }
  }
  function Lms(e, t) {
    return new ZodEnum({
      values: e,
      typeName: ZodFirstPartyTypeKind.ZodEnum,
      ...Lm(t)
    });
  }
  function Oms(e, t) {
    let n = typeof e === "function" ? e(t) : typeof e === "string" ? {
      message: e
    } : e;
    return typeof n === "string" ? {
      message: n
    } : n;
  }
  function custom(e, t = {}, n) {
    if (e) {
      return ZodAny.create().superRefine((r, o) => {
        let s = e(r);
        if (s instanceof Promise) {
          return s.then(i => {
            if (!i) {
              let a = Oms(t, r);
              let l = a.fatal ?? n ?? true;
              o.addIssue({
                code: "custom",
                ...a,
                fatal: l
              });
            }
          });
        }
        if (!s) {
          let i = Oms(t, r);
          let a = i.fatal ?? n ?? true;
          o.addIssue({
            code: "custom",
            ...i,
            fatal: a
          });
        }
        return;
      });
    }
    return ZodAny.create();
  }
  var Pms = (e, t) => {
    if (isValid(t)) {
      return {
        success: true,
        data: t.value
      };
    } else {
      if (!e.common.issues.length) {
        throw Error("Validation failed but no issues detected.");
      }
      return {
        success: false,
        get error() {
          if (this._error) {
            return this._error;
          }
          let n = new ZodError(e.common.issues);
          this._error = n;
          return this._error;
        }
      };
    }
  };
  var Uiu;
  var Biu;
  var $iu;
  var Hiu;
  var jiu;
  var qiu;
  var Wiu;
  var Giu;
  var sxr;
  var ziu;
  var Kiu;
  var Yiu;
  var Jiu;
  var Xiu;
  var Qiu;
  var Ziu;
  var ZodString;
  var ZodNumber;
  var ZodBigInt;
  var ZodBoolean;
  var ZodDate;
  var ZodSymbol;
  var ZodUndefined;
  var ZodNull;
  var ZodAny;
  var ZodUnknown;
  var ZodNever;
  var ZodVoid;
  var ZodArray;
  var ZodObject;
  var ZodUnion;
  var Qge = e => {
    if (e instanceof ZodLazy) {
      return Qge(e.schema);
    } else if (e instanceof ZodTransformer) {
      return Qge(e.innerType());
    } else if (e instanceof ZodLiteral) {
      return [e.value];
    } else if (e instanceof ZodEnum) {
      return e.options;
    } else if (e instanceof ZodNativeEnum) {
      return util.objectValues(e.enum);
    } else if (e instanceof ZodDefault) {
      return Qge(e._def.innerType);
    } else if (e instanceof ZodUndefined) {
      return [undefined];
    } else if (e instanceof ZodNull) {
      return [null];
    } else if (e instanceof ZodOptional) {
      return [undefined, ...Qge(e.unwrap())];
    } else if (e instanceof ZodNullable) {
      return [null, ...Qge(e.unwrap())];
    } else if (e instanceof ZodBranded) {
      return Qge(e.unwrap());
    } else if (e instanceof ZodReadonly) {
      return Qge(e.unwrap());
    } else if (e instanceof ZodCatch) {
      return Qge(e._def.innerType);
    } else {
      return [];
    }
  };
  var ZodDiscriminatedUnion;
  var ZodIntersection;
  var ZodTuple;
  var ZodRecord;
  var ZodMap;
  var ZodSet;
  var ZodFunction;
  var ZodLazy;
  var ZodLiteral;
  var ZodEnum;
  var ZodNativeEnum;
  var ZodPromise;
  var ZodTransformer;
  var ZodOptional;
  var ZodNullable;
  var ZodDefault;
  var ZodCatch;
  var ZodNaN;
  var BRAND;
  var ZodBranded;
  var ZodPipeline;
  var ZodReadonly;
  var late;
  var ZodFirstPartyTypeKind;
  var aau = (e, t = {
    message: `Input not instance of ${e.name}`
  }) => custom(n => n instanceof e, t);
  var string;
  var number;
  var nan;
  var bigint;
  var boolean;
  var date;
  var symbol;
  var undefined_export;
  var mau;
  var any;
  var unknown;
  var never;
  var yau;
  var array;
  var object;
  var strictObject;
  var union;
  var discriminatedUnion;
  var intersection;
  var tuple;
  var record;
  var map;
  var set_export;
  var vau;
  var lazy;
  var literal;
  var bte;
  var nativeEnum;
  var promise;
  var transformer;
  var optional;
  var nullable;
  var preprocess;
  var pipeline;
  var ostring = () => string().optional();
  var onumber = () => number().optional();
  var oboolean = () => boolean().optional();
  var coerce;
  var Ke = {};