      };
    };
    eF.CONFIG_USE_DUALSTACK_ENDPOINT = "use_dualstack_endpoint";
    eF.CONFIG_USE_FIPS_ENDPOINT = "use_fips_endpoint";
    eF.DEFAULT_USE_DUALSTACK_ENDPOINT = false;
    eF.DEFAULT_USE_FIPS_ENDPOINT = false;
    eF.ENV_USE_DUALSTACK_ENDPOINT = "AWS_USE_DUALSTACK_ENDPOINT";
    eF.ENV_USE_FIPS_ENDPOINT = "AWS_USE_FIPS_ENDPOINT";
    eF.NODE_REGION_CONFIG_FILE_OPTIONS = Lju;
    eF.NODE_REGION_CONFIG_OPTIONS = Nju;
    eF.NODE_USE_DUALSTACK_ENDPOINT_CONFIG_OPTIONS = Aju;
    eF.NODE_USE_FIPS_ENDPOINT_CONFIG_OPTIONS = Pju;
    eF.REGION_ENV_NAME = "AWS_REGION";
    eF.REGION_INI_NAME = "region";
    eF.getRegionInfo = qju;
    eF.resolveCustomEndpointsConfig = Oju;
    eF.resolveEndpointsConfig = Mju;
    eF.resolveRegionConfig = Bju;
  });
  function YHe() {
    return Me.AWS_REGION || Me.AWS_DEFAULT_REGION || "us-east-1";
  }
  function RMr() {
    return `${Me.AWS_CONFIG_FILE ?? ""}|${Me.AWS_SHARED_CREDENTIALS_FILE ?? ""}|${Me.AWS_PROFILE ?? ""}`;
  }
  async function Ej() {
    let e = Me.AWS_REGION || Me.AWS_DEFAULT_REGION;
    if (e) {
      return e;
    }
    return (await Wju()) || YHe();
  }
  function Wxs() {
    return xMr().region;
  }
  function xMr() {
    let e = Me.AWS_REGION || Me.AWS_DEFAULT_REGION;
    if (e) {
      return {
        region: e,
        source: "env"
      };
    }
    let t = qxs.get(RMr());
    if (t) {
      return {
        region: t,
        source: "shared-config"
      };
    }
    return {
      region: YHe(),
      source: "default"
    };
  }
  var qxs;
  var Wju;
  var JHe = __lazy(() => {
    pr();
    qxs = new Map();
    Wju = TEr(async () => {
      let e = RMr();
      let t;
      try {
        let [n, r] = await Promise.all([Promise.resolve().then(() => __toESM(VB(), 1)), Promise.resolve().then(() => __toESM(HA(), 1))]);
        let o = n.loadConfig ?? n.default?.loadConfig;
        let s = r.NODE_REGION_CONFIG_FILE_OPTIONS ?? r.default?.NODE_REGION_CONFIG_FILE_OPTIONS;
        t = (await o({
          environmentVariableSelector: () => {
            return;
          },
          configFileSelector: a => a.region,
          default: () => {
            return;
          }
        }, s)())?.trim() || undefined;
      } catch {
        t = undefined;
      }
      qxs.set(e, t);
      return t;
    }, RMr);
  });
  function tnt(e) {
    let t = [];
    let n = false;
    async function r() {
      if (n) {
        return;
      }
      if (t.length === 0) {
        return;
      }
      n = true;
      while (t.length > 0) {
        let {
          args: o,
          resolve: s,
          reject: i,
          context: a
        } = t.shift();
        try {
          let l = await e.apply(a, o);
          s(l);
        } catch (l) {
          i(l);
        }
      }
      if (n = false, t.length > 0) {
        r();
      }
    }
    return function (...o) {
      return new Promise((s, i) => {
        t.push({
          args: o,
          resolve: s,
          reject: i,
          context: this
        });
        r();
      });
    };
  }
  function Gju(e, t, n) {
    if (n !== undefined && !GQc(e[t], n) || n === undefined && !(t in e)) {
      vou(e, t, n);
    }
  }
  function Vju(e) {
    return Beu(e) && Btu(e);
  }
  function Qju(e) {
    if (!Beu(e) || hZc(e) != "[object Object]") {
      return false;
    }
    var t = Bou(e);
    if (t === null) {
      return true;
    }
    var n = Jju.call(t, "constructor") && t.constructor;
    return typeof n == "function" && n instanceof n && zxs.call(n) == Xju;
  }
  var Kju;
  var Yju;
  var zxs;
  var Jju;
  var Xju;
  function Zju(e, t) {
    if (t === "constructor" && typeof e[t] === "function") {
      return;
    }
    if (t == "__proto__") {
      return;
    }
    return e[t];
  }
  function equ(e) {
    return xou(e, Dou(e));
  }
  function tqu(e, t, n, r, o, s, i) {
    var a = Zju(e, n);
    var l = Zju(t, n);
    var c = i.get(l);
    if (c) {
      Gju(e, n, c);
      return;
    }
    var u = s ? s(a, l, n + "", e, t, i) : undefined;
    var d = u === undefined;
    if (d) {
      var p = Peu(l);
      var m = !p && Keu(l);
      var f = !p && !m && ktu(l);
      if (u = l, p || m || f) {
        if (Peu(a)) {
          u = a;
        } else if (Vju(a)) {
          u = Fou(a);
        } else if (m) {
          d = false;
          u = Lou(l, true);
        } else if (f) {
          d = false;
          u = Qou(l, true);
        } else {
          u = [];
        }
      } else if (Qju(l) || Weu(l)) {
        if (u = a, Weu(a)) {
          u = equ(a);
        } else if (!gZc(a) || TZc(a)) {
          u = Ssu(l);
        }
      } else {
        d = false;
      }
    }
    if (d) {
      i.set(l, u);
      o(u, l, r, s, i);
      i.delete(l);
    }
    Gju(e, n, u);
  }
  function Qxs(e, t, n, r, o) {
    if (e === t) {
      return;
    }
    _bu(t, function (s, i) {
      if (o || (o = new WQe()), gZc(s)) {
        tqu(e, t, i, n, Qxs, r, o);
      } else {
        var a = r ? r(Zju(e, i), s, i + "", e, t, o) : undefined;
        if (a === undefined) {
          a = s;
        }
        Gju(e, i, a);
      }
    }, Dou);
  }
  function nqu(e, t, n) {
    switch (n.length) {
      case 0:
        return e.call(t);
      case 1:
        return e.call(t, n[0]);
      case 2:
        return e.call(t, n[0], n[1]);
      case 3:
        return e.call(t, n[0], n[1], n[2]);
    }
    return e.apply(t, n);
  }
  function rqu(e, t, n) {
    t = rks(t === undefined ? e.length - 1 : t, 0);
    return function () {
      var r = arguments;
      var o = -1;
      var s = rks(r.length - t, 0);
      var i = Array(s);
      while (++o < s) {
        i[o] = r[t + o];
      }
      o = -1;
      var a = Array(t + 1);
      while (++o < t) {
        a[o] = r[o];
      }
      a[t] = n(i);
      return nqu(e, this, a);
    };
  }
  var rks;
  function oqu(e) {
    return function () {
      return e;
    };
  }
  var squ;
  function cqu(e) {
    var t = 0;
    var n = 0;
    return function () {
      var r = lqu();
      var o = 16 - (r - n);
      if (n = r, o > 0) {
        if (++t >= 800) {
          return arguments[0];
        }
      } else {
        t = 0;
      }
      return e.apply(undefined, arguments);
    };
  }
  var lqu;
  var uqu;
  function dqu(e, t) {
    return uqu(rqu(e, t, Fnu), e + "");
  }
  function pqu(e, t, n) {
    if (!gZc(n)) {
      return false;
    }
    var r = typeof t;
    if (r == "number" ? Btu(n) && Xeu(t, n.length) : r == "string" && t in n) {
      return GQc(n[t], e);
    }
    return false;
  }
  function mqu(e) {
    return dqu(function (t, n) {
      var r = -1;
      var o = n.length;
      var s = o > 1 ? n[o - 1] : undefined;
      var i = o > 2 ? n[2] : undefined;
      if (s = e.length > 3 && typeof s == "function" ? (o--, s) : undefined, i && pqu(n[0], n[1], i)) {
        s = o < 3 ? undefined : s;
        o = 1;
      }
      t = Object(t);
      while (++r < o) {
        var a = n[r];
        if (a) {
          e(t, a, r, s);
        }
      }
      return t;
    });
  }
  var fqu;
  function hqu(e, t) {
    return Ghn.run({
      cwd: e
    }, t);
  }
  function Sye(e, t) {
    return hqu(e ?? Nt(), t);
  }
  function XHe() {
    return Ghn.getStore() !== undefined;
  }
  function OMr(e) {
    let t = Ghn.getStore();
    if (t) {
      t.cwd = e;
    } else {
      setCwdState(e);
    }
  }
  function Vhn() {
    return Ghn.getStore()?.cwd ?? getCwdState();
  }
  function Nt() {
    try {
      return Vhn();
    } catch {
      return getOriginalCwd();
    }
  }
  var gks;
  var Ghn;
  var vo = __lazy(() => {
    at();
    mm();
    gks = require("async_hooks");
    Ghn = new gks.AsyncLocalStorage();
  });
  function _qu(e) {
    Atomics.wait(yqu, 0, 0, e);
  }
  function _ks(e, t) {
    return false;
  }
  async function QHe(e, t, n = eY.rename) {
    let r = false;
    for (let o = 0;; o++) {
      try {
        await n(e, t);
        return r;
      } catch (s) {
        if (_ks(s, o)) {
          r = true;
          await sleep(50);
          continue;
        }
        throw s;
      }
    }
  }
  function NMr(e, t, n = Z7.renameSync) {
    let r = false;
    for (let o = 0;; o++) {
      try {
        n(e, t);
        return r;
      } catch (s) {
        if (_ks(s, o)) {
          r = true;
          _qu(50);
          continue;
        }
        throw s;
      }
    }
  }
  async function Fm(e, t, n) {
    let r = `${e}.tmp.${DMr.randomBytes(4).toString("hex")}`;
    try {
      await eY.writeFile(r, t, {
        encoding: "utf8",
        mode: n
      });
      try {
        await QHe(r, e);
      } catch (o) {
        let s = en(o);
        if (s !== undefined && Tye.vZc(s)) {
          try {
            if (await eY.copyFile(r, e), n !== undefined) {
              await eY.chmod(e, n).catch(() => {});
            }
          } catch (i) {
            if (bks.vZc(en(i) ?? "")) {
              await eY.unlink(e).catch(() => {});
            }
            throw i;
          }
          await eY.unlink(r).catch(() => {});
        } else {
          throw o;
        }
      }
    } catch (o) {
      throw await eY.unlink(r).catch(() => {}), o;
    }
  }
  function vj(e, t, n) {
    let r = `${e}.tmp.${DMr.randomBytes(4).toString("hex")}`;
    try {
      Z7.writeFileSync(r, t, {
        encoding: "utf8",
        mode: n
      });
      try {
        NMr(r, e);
      } catch (o) {
        let s = en(o);
        if (s !== undefined && Tye.vZc(s)) {
          try {
            if (Z7.copyFileSync(r, e), n !== undefined) {
              try {
                Z7.chmodSync(e, n);
              } catch {}
            }
          } catch (i) {
            if (bks.vZc(en(i) ?? "")) {
              try {
                Z7.unlinkSync(e);
              } catch {}
            }
            throw i;
          }
          try {
            Z7.unlinkSync(r);
          } catch {}
        } else {
          throw o;
        }
      }
    } catch (o) {
      try {
        Z7.unlinkSync(r);
      } catch {}
      throw o;
    }
  }
  var DMr;
  var Z7;
  var eY;
  var Tye;
  var MMr;
  var yqu;
  var bks;
  var BT = __lazy(() => {
    dt();
    DMr = require("crypto");
    Z7 = require("fs");
    eY = require("fs/promises");
    Tye = new Set(["EXDEV", "EPERM", "EEXIST", "EBUSY"]);
    MMr = new Set(["EPERM", "EBUSY", "EACCES"]);
    yqu = new Int32Array(new SharedArrayBuffer(4));
    bks = new Set(["ENOSPC", "EIO", "EDQUOT", "EFBIG"]);
  });
  function Sks(e, t, n) {
    let r = e.statSync(t);
    if (r.isDirectory()) {
      throw Object.assign(Error("EISDIR: illegal operation on a directory, read"), {
        code: "EISDIR",
        errno: -21,
        syscall: "read",
        path: t
      });
    }
    if (!r.isFile()) {
      throw Object.assign(Error("Not a regular file (device, FIFO, or socket)"), {
        code: "ERR_NOT_REGULAR_FILE",
        path: t
      });
    }
    if (n !== undefined && r.size > n) {
      throw Object.assign(Error("File exceeds maxBytes limit"), {
        code: "ERR_FILE_TOO_LARGE",
        path: t,
        size: r.size,
        maxBytes: n
      });
    }
  }
  function ZHe(e) {
    return e != null && typeof e === "object" && "code" in e && e.code === "ERR_NOT_REGULAR_FILE";
  }
  function zhn(e) {
    let {
      buffer: t,
      bytesRead: n
    } = zt().readSync(e, {
      length: 4096
    });
    if (n === 0) {
      return "utf8";
    }
    if (n >= 2) {
      if (t[0] === 255 && t[1] === 254) {
        return "utf16le";
      }
    }
    if (n >= 3 && t[0] === 239 && t[1] === 187 && t[2] === 191) {
      return "utf8";
    }
    return "utf8";
  }
  function Khn(e) {
    let t = 0;
    let n = 0;
    for (let r = 0; r < e.length; r++) {
      if (e[r] === `
`) {
        if (r > 0 && e[r - 1] === "\r") {
          t++;
        } else {
          n++;
        }
      }
    }
    return t > n ? "CRLF" : "LF";
  }
  function Eye(e, t) {
    let n = zt();
    let {
      resolvedPath: r,
      isSymlink: o
    } = qd(n, e);
    if (o) {
      logForDebugging(`Reading through symlink: ${e} -> ${r}`);
    }
    Sks(n, r, t);
    let s = zhn(r);
    let i = n.readFileSync(r, {
      encoding: s
    });
    let a = Khn(i.slice(0, 4096));
    return {
      content: i.replaceAll(`\r
`, `
`),
      encoding: s,
      lineEndings: a
    };
  }
  function LP(e, t) {
    return Eye(e, t).content;
  }
  async function eje(e, t) {
    let n = zt();
    let {
      resolvedPath: r,
      isSymlink: o
    } = qd(n, e);
    if (o) {
      logForDebugging(`Reading through symlink: ${e} -> ${r}`);
    }
    Sks(n, r, t);
    let s = zhn(r);
    let i = await n.readFile(r, {
      encoding: s
    });
    let a = Khn(i.slice(0, 4096));
    return {
      content: i.replaceAll(`\r
`, `
`),
      encoding: s,
      lineEndings: a
    };
  }
  var KB = __lazy(() => {
    je();
  });
  class ont {
    heap;
    length;
    static #e = false;
    static create(e) {
      let t = wks(e);
      if (!t) {
        return [];
      }
      ont.#e = true;
      let n = new ont(e, t);
      ont.#e = false;
      return n;
    }
    constructor(e, t) {
      if (!ont.#e) {
        throw TypeError("instantiate Stack using Stack.create(n)");
      }
      this.heap = new t(e);
      this.length = 0;
    }
    push(e) {
      this.heap[this.length++] = e;
    }
    pop() {
      return this.heap[--this.length];
    }
  }
  var rnt;
  var Eks;
  var LMr;
  var vks = (e, t, n, r) => {
    typeof LMr.emitWarning === "function" ? LMr.emitWarning(e, t, n, r) : console.error(`[${n}] ${t}: ${e}`);
  };
  var Yhn;
  var Tks;
  var bqu = e => !Eks.vZc(e);
  var Mwh;
  var fke = e => e && e === Math.floor(e) && e > 0 && isFinite(e);
  var wks = e => !fke(e) ? null : e <= Math.pow(2, 8) ? Uint8Array : e <= Math.pow(2, 16) ? Uint16Array : e <= Math.pow(2, 32) ? Uint32Array : e <= Number.MAX_SAFE_INTEGER ? LDt : null;
  var LDt;
  var tW;
  var snt = __lazy(() => {
    rnt = typeof performance === "object" && performance && typeof performance.now === "function" ? performance : Date;
    Eks = new Set();
    LMr = typeof process === "object" && !!process ? process : {};
    Yhn = globalThis.AbortController;
    Tks = globalThis.AbortSignal;
    if (typeof Yhn > "u") {
      Tks = class {
        onabort;
        _onabort = [];
        reason;
        aborted = false;
        addEventListener(r, o) {
          this._onabort.push(o);
        }
      };
      Yhn = class {
        constructor() {
          t();
        }
        signal = new Tks();
        abort(r) {
          if (this.signal.aborted) {
            return;
          }
          this.signal.reason = r;
          this.signal.aborted = true;
          for (let o of this.signal._onabort) {
            o(r);
          }
          this.signal.onabort?.(r);
        }
      };
      let e = LMr.env?.LRU_CACHE_IGNORE_AC_WARNING !== "1";
      let t = () => {
        if (!e) {
          return;
        }
        e = false;
        vks("AbortController is not defined. If using lru-cache in node 14, load an AbortController polyfill from the `node-abort-controller` package. A minimal polyfill is provided for use by LRUCache.fetch(), but it should not be relied upon in other contexts (eg, passing it to other APIs that use AbortController/AbortSignal might have undesirable effects). You may disable this with LRU_CACHE_IGNORE_AC_WARNING=1 in the env.", "NO_ABORT_CONTROLLER", "ENOTSUP", t);
      };
    }
    Mwh = Symbol("type");
    LDt = class LDt extends Array {
      constructor(e) {
        super(e);
        this.fill(0);
      }
    };
    tW = class tW {
      #e;
      #t;
      #n;
      #r;
      #o;
      #l;
      ttl;
      ttlResolution;
      ttlAutopurge;
      updateAgeOnGet;
      updateAgeOnHas;
      allowStale;
      noDisposeOnSet;
      noUpdateTTL;
      maxEntrySize;
      sizeCalculation;
      noDeleteOnFetchRejection;
      noDeleteOnStaleGet;
      allowStaleOnFetchAbort;
      allowStaleOnFetchRejection;
      ignoreFetchAbort;
      #s;
      #a;
      #c;
      #u;
      #i;
      #p;
      #g;
      #f;
      #d;
      #y;
      #h;
      #b;
      #E;
      #S;
      #T;
      #w;
      #_;
      static unsafeExposeInternals(e) {
        return {
          starts: e.#E,
          ttls: e.#S,
          sizes: e.#b,
          keyMap: e.#c,
          keyList: e.#u,
          valList: e.#i,
          next: e.#p,
          prev: e.#g,
          get head() {
            return e.#f;
          },
          get tail() {
            return e.#d;
          },
          free: e.#y,
          isBackgroundFetch: t => e.#m(t),
          backgroundFetch: (t, n, r, o) => e.#L(t, n, r, o),
          moveToTail: t => e.#D(t),
          indexes: t => e.#x(t),
          rindexes: t => e.#k(t),
          isStale: t => e.#v(t)
        };
      }
      get max() {
        return this.#e;
      }
      get maxSize() {
        return this.#t;
      }
      get calculatedSize() {
        return this.#a;
      }
      get size() {
        return this.#s;
      }
      get fetchMethod() {
        return this.#o;
      }
      get memoMethod() {
        return this.#l;
      }
      get dispose() {
        return this.#n;
      }
      get disposeAfter() {
        return this.#r;
      }
      constructor(e) {
        let {
          max: t = 0,
          ttl: n,
          ttlResolution: r = 1,
          ttlAutopurge: o,
          updateAgeOnGet: s,
          updateAgeOnHas: i,
          allowStale: a,
          dispose: l,
          disposeAfter: c,
          noDisposeOnSet: u,
          noUpdateTTL: d,
          maxSize: p = 0,
          maxEntrySize: m = 0,
          sizeCalculation: f,
          fetchMethod: h,
          memoMethod: g,
          noDeleteOnFetchRejection: y,
          noDeleteOnStaleGet: _,
          allowStaleOnFetchRejection: b,
          allowStaleOnFetchAbort: S,
          ignoreFetchAbort: E
        } = e;
        if (t !== 0 && !fke(t)) {
          throw TypeError("max option must be a nonnegative integer");
        }
        let C = t ? wks(t) : Array;
        if (!C) {
          throw Error("invalid max value: " + t);
        }
        if (this.#e = t, this.#t = p, this.maxEntrySize = m || this.#t, this.sizeCalculation = f, this.sizeCalculation) {
          if (!this.#t && !this.maxEntrySize) {
            throw TypeError("cannot set sizeCalculation without setting maxSize or maxEntrySize");
          }
          if (typeof this.sizeCalculation !== "function") {
            throw TypeError("sizeCalculation set to non-function");
          }
        }
        if (g !== undefined && typeof g !== "function") {
          throw TypeError("memoMethod must be a function if defined");
        }
        if (this.#l = g, h !== undefined && typeof h !== "function") {
          throw TypeError("fetchMethod must be a function if specified");
        }
        if (this.#o = h, this.#w = !!h, this.#c = new Map(), this.#u = Array(t).fill(undefined), this.#i = Array(t).fill(undefined), this.#p = new C(t), this.#g = new C(t), this.#f = 0, this.#d = 0, this.#y = ont.create(t), this.#s = 0, this.#a = 0, typeof l === "function") {
          this.#n = l;
        }
        if (typeof c === "function") {
          this.#r = c;
          this.#h = [];
        } else {
          this.#r = undefined;
          this.#h = undefined;
        }
        if (this.#T = !!this.#n, this.#_ = !!this.#r, this.noDisposeOnSet = !!u, this.noUpdateTTL = !!d, this.noDeleteOnFetchRejection = !!y, this.allowStaleOnFetchRejection = !!b, this.allowStaleOnFetchAbort = !!S, this.ignoreFetchAbort = !!E, this.maxEntrySize !== 0) {
          if (this.#t !== 0) {
            if (!fke(this.#t)) {
              throw TypeError("maxSize must be a positive integer if specified");
            }
          }
          if (!fke(this.maxEntrySize)) {
            throw TypeError("maxEntrySize must be a positive integer if specified");
          }
          this.#H();
        }
        if (this.allowStale = !!a, this.noDeleteOnStaleGet = !!_, this.updateAgeOnGet = !!s, this.updateAgeOnHas = !!i, this.ttlResolution = fke(r) || r === 0 ? r : 1, this.ttlAutopurge = !!o, this.ttl = n || 0, this.ttl) {
          if (!fke(this.ttl)) {
            throw TypeError("ttl must be a positive integer if specified");
          }
          this.#P();
        }
        if (this.#e === 0 && this.ttl === 0 && this.#t === 0) {
          throw TypeError("At least one of max, maxSize, or ttl is required");
        }
        if (!this.ttlAutopurge && !this.#e && !this.#t) {
          if (bqu("LRU_CACHE_UNBOUNDED")) {
            Eks.add("LRU_CACHE_UNBOUNDED");
            vks("TTL caching without ttlAutopurge, max, or maxSize can result in unbounded memory consumption.", "UnboundedCacheWarning", "LRU_CACHE_UNBOUNDED", tW);
          }
        }
      }
      getRemainingTTL(e) {
        return this.#c.vZc(e) ? 1 / 0 : 0;
      }
      #P() {
        let e = new LDt(this.#e);
        let t = new LDt(this.#e);
        this.#S = e;
        this.#E = t;
        this.#R = (o, s, i = rnt.now()) => {
          if (t[o] = s !== 0 ? i : 0, e[o] = s, s !== 0 && this.ttlAutopurge) {
            let a = setTimeout(() => {
              if (this.#v(o)) {
                this.#A(this.#u[o], "expire");
              }
            }, s + 1);
            if (a.unref) {
              a.unref();
            }
          }
        };
        this.#I = o => {
          t[o] = e[o] !== 0 ? rnt.now() : 0;
        };
        this.#C = (o, s) => {
          if (e[s]) {
            let i = e[s];
            let a = t[s];
            if (!i || !a) {
              return;
            }
            o.ttl = i;
            o.start = a;
            o.now = n || r();
            let l = o.now - a;
            o.remainingTTL = i - l;
          }
        };
        let n = 0;
        let r = () => {
          let o = rnt.now();
          if (this.ttlResolution > 0) {
            n = o;
            let s = setTimeout(() => n = 0, this.ttlResolution);
            if (s.unref) {
              s.unref();
            }
          }
          return o;
        };
        this.getRemainingTTL = o => {
          let s = this.#c.get(o);
          if (s === undefined) {
            return 0;
          }
          let i = e[s];
          let a = t[s];
          if (!i || !a) {
            return 1 / 0;
          }
          let l = (n || r()) - a;
          return i - l;
        };
        this.#v = o => {
          let s = t[o];
          let i = e[o];
          return !!i && !!s && (n || r()) - s > i;
        };
      }
      #I = () => {};
      #C = () => {};
      #R = () => {};
      #v = () => false;
      #H() {
        let e = new LDt(this.#e);
        this.#a = 0;
        this.#b = e;
        this.#O = t => {
          this.#a -= e[t];
          e[t] = 0;
        };
        this.#F = (t, n, r, o) => {
          if (this.#m(n)) {
            return 0;
          }
          if (!fke(r)) {
            if (o) {
              if (typeof o !== "function") {
                throw TypeError("sizeCalculation must be a function");
              }
              if (r = o(n, t), !fke(r)) {
                throw TypeError("sizeCalculation return invalid (expect positive integer)");
              }
            } else {
              throw TypeError("invalid size value (must be positive integer). When maxSize or maxEntrySize is used, sizeCalculation or size must be set.");
            }
          }
          return r;
        };
        this.#M = (t, n, r) => {
          if (e[t] = n, this.#t) {
            let o = this.#t - e[t];
            while (this.#a > o) {
              this.#N(true);
            }
          }
          if (this.#a += e[t], r) {
            r.entrySize = n;
            r.totalCalculatedSize = this.#a;
          }
        };
      }
      #O = e => {};
      #M = (e, t, n) => {};
      #F = (e, t, n, r) => {
        if (n || r) {
          throw TypeError("cannot set size without setting maxSize or maxEntrySize on cache");
        }
        return 0;
      };
      *#x({
        allowStale: e = this.allowStale
      } = {}) {
        if (this.#s) {
          for (let t = this.#d;;) {
            if (!this.#U(t)) {
              break;
            }
            if (e || !this.#v(t)) {
              yield t;
            }
            if (t === this.#f) {
              break;
            } else {
              t = this.#g[t];
            }
          }
        }
      }
      *#k({
        allowStale: e = this.allowStale
      } = {}) {
        if (this.#s) {
          for (let t = this.#f;;) {
            if (!this.#U(t)) {
              break;
            }
            if (e || !this.#v(t)) {
              yield t;
            }
            if (t === this.#d) {
              break;
            } else {
              t = this.#p[t];
            }
          }
        }
      }
      #U(e) {
        return e !== undefined && this.#c.get(this.#u[e]) === e;
      }
      *entries() {
        for (let e of this.#x()) {
          if (this.#i[e] !== undefined && this.#u[e] !== undefined && !this.#m(this.#i[e])) {
            yield [this.#u[e], this.#i[e]];
          }
        }
      }
      *rentries() {
        for (let e of this.#k()) {
          if (this.#i[e] !== undefined && this.#u[e] !== undefined && !this.#m(this.#i[e])) {
            yield [this.#u[e], this.#i[e]];
          }
        }
      }
      *keys() {
        for (let e of this.#x()) {
          let t = this.#u[e];
          if (t !== undefined && !this.#m(this.#i[e])) {
            yield t;
          }
        }
      }
      *rkeys() {
        for (let e of this.#k()) {
          let t = this.#u[e];
          if (t !== undefined && !this.#m(this.#i[e])) {
            yield t;
          }
        }
      }
      *values() {
        for (let e of this.#x()) {
          if (this.#i[e] !== undefined && !this.#m(this.#i[e])) {
            yield this.#i[e];
          }
        }
      }
      *rvalues() {
        for (let e of this.#k()) {
          if (this.#i[e] !== undefined && !this.#m(this.#i[e])) {
            yield this.#i[e];
          }
        }
      }
      [Symbol.iterator]() {
        return this.entries();
      }
      [Symbol.toStringTag] = "LRUCache";
      find(e, t = {}) {
        for (let n of this.#x()) {
          let r = this.#i[n];
          let o = this.#m(r) ? r.__staleWhileFetching : r;
          if (o === undefined) {
            continue;
          }
          if (e(o, this.#u[n], this)) {
            return this.get(this.#u[n], t);
          }
        }
      }
      forEach(e, t = this) {
        for (let n of this.#x()) {
          let r = this.#i[n];
          let o = this.#m(r) ? r.__staleWhileFetching : r;
          if (o === undefined) {
            continue;
          }
          e.call(t, o, this.#u[n], this);
        }
      }
      rforEach(e, t = this) {
        for (let n of this.#k()) {
          let r = this.#i[n];
          let o = this.#m(r) ? r.__staleWhileFetching : r;
          if (o === undefined) {
            continue;
          }
          e.call(t, o, this.#u[n], this);
        }
      }
      purgeStale() {
        let e = false;
        for (let t of this.#k({
          allowStale: true
        })) {
          if (this.#v(t)) {
            this.#A(this.#u[t], "expire");
            e = true;
          }
        }
        return e;
      }
      info(e) {
        let t = this.#c.get(e);
        if (t === undefined) {
          return;
        }
        let n = this.#i[t];
        let r = this.#m(n) ? n.__staleWhileFetching : n;
        if (r === undefined) {
          return;
        }
        let o = {
          value: r
        };
        if (this.#S && this.#E) {
          let s = this.#S[t];
          let i = this.#E[t];
          if (s && i) {
            let a = s - (rnt.now() - i);
            o.ttl = a;
            o.start = Date.now();
          }
        }
        if (this.#b) {
          o.size = this.#b[t];
        }
        return o;
      }
      dump() {
        let e = [];
        for (let t of this.#x({
          allowStale: true
        })) {
          let n = this.#u[t];
          let r = this.#i[t];
          let o = this.#m(r) ? r.__staleWhileFetching : r;
          if (o === undefined || n === undefined) {
            continue;
          }
          let s = {
            value: o
          };
          if (this.#S && this.#E) {
            s.ttl = this.#S[t];
            let i = rnt.now() - this.#E[t];
            s.start = Math.floor(Date.now() - i);
          }
          if (this.#b) {
            s.size = this.#b[t];
          }
          e.unshift([n, s]);
        }
        return e;
      }
      load(e) {
        this.clear();
        for (let [t, n] of e) {
          if (n.start) {
            let r = Date.now() - n.start;
            n.start = rnt.now() - r;
          }
          this.set(t, n.value, n);
        }
      }
      set(e, t, n = {}) {
        if (t === undefined) {
          this.delete(e);
          return this;
        }
        let {
          ttl: r = this.ttl,
          start: o,
          noDisposeOnSet: s = this.noDisposeOnSet,
          sizeCalculation: i = this.sizeCalculation,
          status: a
        } = n;
        let {
          noUpdateTTL: l = this.noUpdateTTL
        } = n;
        let c = this.#F(e, t, n.size || 0, i);
        if (this.maxEntrySize && c > this.maxEntrySize) {
          if (a) {
            a.set = "miss";
            a.maxEntrySizeExceeded = true;
          }
          this.#A(e, "set");
          return this;
        }
        let u = this.#s === 0 ? undefined : this.#c.get(e);
        if (u === undefined) {
          if (u = this.#s === 0 ? this.#d : this.#y.length !== 0 ? this.#y.pop() : this.#s === this.#e ? this.#N(false) : this.#s, this.#u[u] = e, this.#i[u] = t, this.#c.set(e, u), this.#p[this.#d] = u, this.#g[u] = this.#d, this.#d = u, this.#s++, this.#M(u, c, a), a) {
            a.set = "add";
          }
          l = false;
        } else {
          this.#D(u);
          let d = this.#i[u];
          if (t !== d) {
            if (this.#w && this.#m(d)) {
              d.__abortController.abort(Error("replaced"));
              let {
                __staleWhileFetching: p
              } = d;
              if (p !== undefined && !s) {
                if (this.#T) {
                  this.#n?.(p, e, "set");
                }
                if (this.#_) {
                  this.#h?.push([p, e, "set"]);
                }
              }
            } else if (!s) {
              if (this.#T) {
                this.#n?.(d, e, "set");
              }
              if (this.#_) {
                this.#h?.push([d, e, "set"]);
              }
            }
            if (this.#O(u), this.#M(u, c, a), this.#i[u] = t, a) {
              a.set = "replace";
              let p = d && this.#m(d) ? d.__staleWhileFetching : d;
              if (p !== undefined) {
                a.oldValue = p;
              }
            }
          } else if (a) {
            a.set = "update";
          }
        }
        if (r !== 0 && !this.#S) {
          this.#P();
        }
        if (this.#S) {
          if (!l) {
            this.#R(u, r, o);
          }
          if (a) {
            this.#C(a, u);
          }
        }
        if (!s && this.#_ && this.#h) {
          let d = this.#h;
          let p;
          while (p = d?.shift()) {
            this.#r?.(...p);
          }
        }
        return this;
      }
      pop() {
        try {
          while (this.#s) {
            let e = this.#i[this.#f];
            if (this.#N(true), this.#m(e)) {
              if (e.__staleWhileFetching) {
                return e.__staleWhileFetching;
              }
            } else if (e !== undefined) {
              return e;
            }
          }
        } finally {
          if (this.#_ && this.#h) {
            let e = this.#h;
            let t;
            while (t = e?.shift()) {
              this.#r?.(...t);
            }
          }
        }
      }
      #N(e) {
        let t = this.#f;
        let n = this.#u[t];
        let r = this.#i[t];
        if (this.#w && this.#m(r)) {
          r.__abortController.abort(Error("evicted"));
        } else if (this.#T || this.#_) {
          if (this.#T) {
            this.#n?.(r, n, "evict");
          }
          if (this.#_) {
            this.#h?.push([r, n, "evict"]);
          }
        }
        if (this.#O(t), e) {
          this.#u[t] = undefined;
          this.#i[t] = undefined;
          this.#y.push(t);
        }
        if (this.#s === 1) {
          this.#f = this.#d = 0;
          this.#y.length = 0;
        } else {
          this.#f = this.#p[t];
        }
        this.#c.delete(n);
        this.#s--;
        return t;
      }
      vZc(e, t = {}) {
        let {
          updateAgeOnHas: n = this.updateAgeOnHas,
          status: r
        } = t;
        let o = this.#c.get(e);
        if (o !== undefined) {
          let s = this.#i[o];
          if (this.#m(s) && s.__staleWhileFetching === undefined) {
            return false;
          }
          if (!this.#v(o)) {
            if (n) {
              this.#I(o);
            }
            if (r) {
              r.vZc = "hit";
              this.#C(r, o);
            }
            return true;
          } else if (r) {
            r.vZc = "stale";
            this.#C(r, o);
          }
        } else if (r) {
          r.vZc = "miss";
        }
        return false;
      }
      peek(e, t = {}) {
        let {
          allowStale: n = this.allowStale
        } = t;
        let r = this.#c.get(e);
        if (r === undefined || !n && this.#v(r)) {
          return;
        }
        let o = this.#i[r];
        return this.#m(o) ? o.__staleWhileFetching : o;
      }
      #L(e, t, n, r) {
        let o = t === undefined ? undefined : this.#i[t];
        if (this.#m(o)) {
          return o;
        }
        let s = new Yhn();
        let {
          signal: i
        } = n;
        i?.addEventListener("abort", () => s.abort(i.reason), {
          signal: s.signal
        });
        let a = {
          signal: s.signal,
          options: n,
          context: r
        };
        let l = (f, h = false) => {
          let {
            aborted: g
          } = s.signal;
          let y = n.ignoreFetchAbort && f !== undefined;
          if (n.status) {
            if (g && !h) {
              if (n.status.fetchAborted = true, n.status.fetchError = s.signal.reason, y) {
                n.status.fetchAbortIgnored = true;
              }
            } else {
              n.status.fetchResolved = true;
            }
          }
          if (g && !y && !h) {
            return u(s.signal.reason);
          }
          let _ = p;
          if (this.#i[t] === p) {
            if (f === undefined) {
              if (_.__staleWhileFetching) {
                this.#i[t] = _.__staleWhileFetching;
              } else {
                this.#A(e, "fetch");
              }
            } else {
              if (n.status) {
                n.status.fetchUpdated = true;
              }
              this.set(e, f, a.options);
            }
          }
          return f;
        };
        let c = f => {
          if (n.status) {
            n.status.fetchRejected = true;
            n.status.fetchError = f;
          }
          return u(f);
        };
        let u = f => {
          let {
            aborted: h
          } = s.signal;
          let g = h && n.allowStaleOnFetchAbort;
          let y = g || n.allowStaleOnFetchRejection;
          let _ = y || n.noDeleteOnFetchRejection;
          let b = p;
          if (this.#i[t] === p) {
            if (!_ || b.__staleWhileFetching === undefined) {
              this.#A(e, "fetch");
            } else if (!g) {
              this.#i[t] = b.__staleWhileFetching;
            }
          }
          if (y) {
            if (n.status && b.__staleWhileFetching !== undefined) {
              n.status.returnedStale = true;
            }
            return b.__staleWhileFetching;
          } else if (b.__returned === b) {
            throw f;
          }
        };
        let d = (f, h) => {
          let g = this.#o?.(e, o, a);
          if (g && g instanceof Promise) {
            g.then(y => f(y === undefined ? undefined : y), h);
          }
          s.signal.addEventListener("abort", () => {
            if (!n.ignoreFetchAbort || n.allowStaleOnFetchAbort) {
              if (f(undefined), n.allowStaleOnFetchAbort) {
                f = y => l(y, true);
              }
            }
          });
        };
        if (n.status) {
          n.status.fetchDispatched = true;
        }
        let p = new Promise(d).then(l, c);
        let m = Object.assign(p, {
          __abortController: s,
          __staleWhileFetching: o,
          __returned: undefined
        });
        if (t === undefined) {
          this.set(e, m, {
            ...a.options,
            status: undefined
          });
          t = this.#c.get(e);
        } else {
          this.#i[t] = m;
        }
        return m;
      }
      #m(e) {
        if (!this.#w) {
          return false;
        }
        let t = e;
        return !!t && t instanceof Promise && t.hasOwnProperty("__staleWhileFetching") && t.__abortController instanceof Yhn;
      }
      async fetch(e, t = {}) {
        let {
          allowStale: n = this.allowStale,
          updateAgeOnGet: r = this.updateAgeOnGet,
          noDeleteOnStaleGet: o = this.noDeleteOnStaleGet,
          ttl: s = this.ttl,
          noDisposeOnSet: i = this.noDisposeOnSet,
          size: a = 0,
          sizeCalculation: l = this.sizeCalculation,
          noUpdateTTL: c = this.noUpdateTTL,
          noDeleteOnFetchRejection: u = this.noDeleteOnFetchRejection,
          allowStaleOnFetchRejection: d = this.allowStaleOnFetchRejection,
          ignoreFetchAbort: p = this.ignoreFetchAbort,
          allowStaleOnFetchAbort: m = this.allowStaleOnFetchAbort,
          context: f,
          forceRefresh: h = false,
          status: g,
          signal: y
        } = t;
        if (!this.#w) {
          if (g) {
            g.fetch = "get";
          }
          return this.get(e, {
            allowStale: n,
            updateAgeOnGet: r,
            noDeleteOnStaleGet: o,
            status: g
          });
        }
        let _ = {
          allowStale: n,
          updateAgeOnGet: r,
          noDeleteOnStaleGet: o,
          ttl: s,
          noDisposeOnSet: i,
          size: a,
          sizeCalculation: l,
          noUpdateTTL: c,
          noDeleteOnFetchRejection: u,
          allowStaleOnFetchRejection: d,
          allowStaleOnFetchAbort: m,
          ignoreFetchAbort: p,
          status: g,
          signal: y
        };
        let b = this.#c.get(e);
        if (b === undefined) {
          if (g) {
            g.fetch = "miss";
          }
          let S = this.#L(e, b, _, f);
          return S.__returned = S;
        } else {
          let S = this.#i[b];
          if (this.#m(S)) {
            let k = n && S.__staleWhileFetching !== undefined;
            if (g) {
              if (g.fetch = "inflight", k) {
                g.returnedStale = true;
              }
            }
            return k ? S.__staleWhileFetching : S.__returned = S;
          }
          let E = this.#v(b);
          if (!h && !E) {
            if (g) {
              g.fetch = "hit";
            }
            if (this.#D(b), r) {
              this.#I(b);
            }
            if (g) {
              this.#C(g, b);
            }
            return S;
          }
          let C = this.#L(e, b, _, f);
          let A = C.__staleWhileFetching !== undefined && n;
          if (g) {
            if (g.fetch = E ? "stale" : "refresh", A && E) {
              g.returnedStale = true;
            }
          }
          return A ? C.__staleWhileFetching : C.__returned = C;
        }
      }
      async forceFetch(e, t = {}) {
        let n = await this.fetch(e, t);
        if (n === undefined) {
          throw Error("fetch() returned undefined");
        }
        return n;
      }
      memo(e, t = {}) {
        let n = this.#l;
        if (!n) {
          throw Error("no memoMethod provided to constructor");
        }
        let {
          context: r,
          forceRefresh: o,
          ...s
        } = t;
        let i = this.get(e, s);
        if (!o && i !== undefined) {
          return i;
        }
        let a = n(e, i, {
          options: s,
          context: r
        });
        this.set(e, a, s);
        return a;
      }
      get(e, t = {}) {
        let {
          allowStale: n = this.allowStale,
          updateAgeOnGet: r = this.updateAgeOnGet,
          noDeleteOnStaleGet: o = this.noDeleteOnStaleGet,
          status: s
        } = t;
        let i = this.#c.get(e);
        if (i !== undefined) {
          let a = this.#i[i];
          let l = this.#m(a);
          if (s) {
            this.#C(s, i);
          }
          if (this.#v(i)) {
            if (s) {
              s.get = "stale";
            }
            if (!l) {
              if (!o) {
                this.#A(e, "expire");
              }
              if (s && n) {
                s.returnedStale = true;
              }
              return n ? a : undefined;
            } else {
              if (s && n && a.__staleWhileFetching !== undefined) {
                s.returnedStale = true;
              }
              return n ? a.__staleWhileFetching : undefined;
            }
          } else {
            if (s) {
              s.get = "hit";
            }
            if (l) {
              return a.__staleWhileFetching;
            }
            if (this.#D(i), r) {
              this.#I(i);
            }
            return a;
          }
        } else if (s) {
          s.get = "miss";
        }
      }
      #B(e, t) {
        this.#g[t] = e;
        this.#p[e] = t;
      }
      #D(e) {
        if (e !== this.#d) {
          if (e === this.#f) {
            this.#f = this.#p[e];
          } else {
            this.#B(this.#g[e], this.#p[e]);
          }
          this.#B(this.#d, e);
          this.#d = e;
        }
      }
      delete(e) {
        return this.#A(e, "delete");
      }
      #A(e, t) {
        let n = false;
        if (this.#s !== 0) {
          let r = this.#c.get(e);
          if (r !== undefined) {
            if (n = true, this.#s === 1) {
              this.#$(t);
            } else {
              this.#O(r);
              let o = this.#i[r];
              if (this.#m(o)) {
                o.__abortController.abort(Error("deleted"));
              } else if (this.#T || this.#_) {
                if (this.#T) {
                  this.#n?.(o, e, t);
                }
                if (this.#_) {
                  this.#h?.push([o, e, t]);
                }
              }
              if (this.#c.delete(e), this.#u[r] = undefined, this.#i[r] = undefined, r === this.#d) {
                this.#d = this.#g[r];
              } else if (r === this.#f) {
                this.#f = this.#p[r];
              } else {
                let s = this.#g[r];
                this.#p[s] = this.#p[r];
                let i = this.#p[r];
                this.#g[i] = this.#g[r];
              }
              this.#s--;
              this.#y.push(r);
            }
          }
        }
        if (this.#_ && this.#h?.length) {
          let r = this.#h;
          let o;
          while (o = r?.shift()) {
            this.#r?.(...o);
          }
        }
        return n;
      }
      clear() {
        return this.#$("delete");
      }
      #$(e) {
        for (let t of this.#k({
          allowStale: true
        })) {
          let n = this.#i[t];
          if (this.#m(n)) {
            n.__abortController.abort(Error("deleted"));
          } else {
            let r = this.#u[t];
            if (this.#T) {
              this.#n?.(n, r, e);
            }
            if (this.#_) {
              this.#h?.push([n, r, e]);
            }
          }
        }
        if (this.#c.clear(), this.#i.fill(undefined), this.#u.fill(undefined), this.#S && this.#E) {
          this.#S.fill(0);
          this.#E.fill(0);
        }
        if (this.#b) {
          this.#b.fill(0);
        }
        if (this.#f = 0, this.#d = 0, this.#y.length = 0, this.#a = 0, this.#s = 0, this.#_ && this.#h) {
          let t = this.#h;
          let n;
          while (n = t?.shift()) {
            this.#r?.(...n);
          }
        }
      }
    };
  });
  function vye(e, t = 300000) {
    let n = i => typeof t === "function" ? t(i) : t;
    let r = new Map();
    let o = new Map();
    let s = async (...i) => {
      let a = De(i);
      let l = r.get(a);
      let c = Date.now();
      if (!l) {
        let u = o.get(a);
        if (u) {
          return u;
        }
        let d = e(...i);
        o.set(a, d);
        try {
          let p = await d;
          if (o.get(a) === d) {
            r.set(a, {
              value: p,
              timestamp: Date.now(),
              refreshing: false,
              lifetimeMs: n(p)
            });
          }
          return p;
        } finally {
          if (o.get(a) === d) {
            o.delete(a);
          }
        }
      }
      if (l && c - l.timestamp > l.lifetimeMs && !l.refreshing) {
        l.refreshing = true;
        let u = l;
        e(...i).then(d => {
          if (r.get(a) === u) {
            r.set(a, {
              value: d,
              timestamp: Date.now(),
              refreshing: false,
              lifetimeMs: n(d)
            });
          }
        }).catch(d => {
          if (logForDebugging(String(d), {
            level: "error"
          }), r.get(a) === u) {
            r.delete(a);
          }
        });
        return l.value;
      }
      return r.get(a).value;
    };
    s.cache = {
      clear: () => {
        r.clear();
        o.clear();
      }
    };
    return s;
  }
  function mk(e, t, n = 100) {
    let r = new tW({
      max: n
    });
    let o = (...s) => {
      let i = t(...s);
      let a = r.get(i);
      if (a !== undefined) {
        return a;
      }
      let l = e(...s);
      r.set(i, l);
      return l;
    };
    o.cache = {
      clear: () => r.clear(),
      size: () => r.size,
      delete: s => r.delete(s),
      get: s => r.peek(s),
      vZc: s => r.vZc(s)
    };
    return o;
  }
  function FDt(e, t, n) {
    let r = n?.maxSize ?? 128;
    let o = new Map();
    Squ.add(o);
    function s(...i) {
      let a = t ? t(...i) : i[0];
      let l = o.get(a);
      if (l) {
        return l;
      }
      let c = e(...i);
      if (o.size >= r) {
        o.delete(o.keys().next().value);
      }
      o.set(a, c);
      c.catch(() => {
        if (o.get(a) === c) {
          o.delete(a);
        }
      });
      return c;
    }
    s.cache = o;
    return s;
  }
  var Squ;
  var nW = __lazy(() => {
    snt();
    je();
    Squ = new Set();
  });
  var Aks = {};