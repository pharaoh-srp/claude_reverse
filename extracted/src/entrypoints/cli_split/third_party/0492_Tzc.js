  var Tzc = __commonJS((Omw, Szc) => {
    var zWf = require("crypto");
    var [bzc, KWf] = process.version.substring(1).split(".").map(e => parseInt(e, 10));
    var YWf = bzc > 12 || bzc === 12 && KWf >= 8;
    var JWf = YWf && zWf.getHashes().includes("shake256");
    Szc.exports = JWf;
  });
  var Czc = __commonJS((Dmw, wzc) => {
    var {
      strict: Krs
    } = require("assert");
    var {
      createHash: Ksn
    } = require("crypto");
    var {
      format: Ezc
    } = require("util");
    var XWf = Tzc();
    var Yrs;
    if (Buffer.isEncoding("base64url")) {
      Yrs = e => e.toString("base64url");
    } else {
      let e = t => t.replace(/=/g, "").replace(/\+/g, "-").replace(/\//g, "_");
      Yrs = t => e(t.toString("base64"));
    }
    function QWf(e, t) {
      switch (e) {
        case "HS256":
        case "RS256":
        case "PS256":
        case "ES256":
        case "ES256K":
          return Ksn("sha256");
        case "HS384":
        case "RS384":
        case "PS384":
        case "ES384":
          return Ksn("sha384");
        case "HS512":
        case "RS512":
        case "PS512":
        case "ES512":
          return Ksn("sha512");
        case "EdDSA":
          switch (t) {
            case "Ed25519":
              return Ksn("sha512");
            case "Ed448":
              if (!XWf) {
                throw TypeError("Ed448 *_hash calculation is not supported in your Node.js runtime version");
              }
              return Ksn("shake256", {
                outputLength: 114
              });
            default:
              throw TypeError("unrecognized or invalid EdDSA curve provided");
          }
        default:
          throw TypeError("unrecognized or invalid JWS algorithm provided");
      }
    }
    function vzc(e, t, n) {
      let r = QWf(t, n).update(e).digest();
      return Yrs(r.slice(0, r.length / 2));
    }
    function ZWf(e, t, n, r, o) {
      if (typeof e.claim !== "string" || !e.claim) {
        throw TypeError("names.claim must be a non-empty string");
      }
      if (typeof e.source !== "string" || !e.source) {
        throw TypeError("names.source must be a non-empty string");
      }
      Krs(typeof t === "string" && t, `${e.claim} must be a non-empty string`);
      Krs(typeof n === "string" && n, `${e.source} must be a non-empty string`);
      let s;
      let i;
      try {
        s = vzc(n, r, o);
      } catch (a) {
        i = Ezc("%s could not be validated (%s)", e.claim, a.message);
      }
      i = i || Ezc("%s mismatch, expected %s, got: %s", e.claim, s, t);
      Krs.equal(s, t, i);
    }
    wzc.exports = {
      validate: ZWf,
      generate: vzc
    };
  });
  var xzc = __commonJS((Mmw, Rzc) => {
    var eGf = require("util");
    var tGf = require("crypto");
    Rzc.exports = eGf.types.isKeyObject || (e => e && e instanceof tGf.KeyObject);
  });
  var Ysn = __commonJS((Nmw, Xrs) => {
    var Jrs;
    if (Buffer.isEncoding("base64url")) {
      Jrs = (e, t = "utf8") => Buffer.from(e, t).toString("base64url");
    } else {
      let e = t => t.replace(/=/g, "").replace(/\+/g, "-").replace(/\//g, "_");
      Jrs = (t, n = "utf8") => e(Buffer.from(t, n).toString("base64"));
    }
    var nGf = e => Buffer.from(e, "base64");
    Xrs.exports.oC = nGf;
    Xrs.exports.HS = Jrs;
  });
  var Izc = __commonJS((Lmw, Azc) => {
    var kzc = Ysn();
    Azc.exports = e => {
      if (typeof e !== "string" || !e) {
        throw TypeError("JWT must be a string");
      }
      let {
        0: t,
        1: n,
        2: r,
        length: o
      } = e.split(".");
      if (o === 5) {
        throw TypeError("encrypted JWTs cannot be decoded");
      }
      if (o !== 3) {
        throw Error("JWTs must have three components");
      }
      try {
        return {
          header: JSON.parse(kzc.oC(t)),
          payload: JSON.parse(kzc.oC(n)),
          signature: r
        };
      } catch (s) {
        throw Error("JWT is malformed");
      }
    };
  });
  var Jsn = __commonJS((Fmw, Pzc) => {
    Pzc.exports = e => !!e && e.constructor === Object;
  });
  var tos = __commonJS((Umw, eos) => {
    var Qrs = Jsn();
    function Zrs(e, t, ...n) {
      for (let r of n) {
        if (!Qrs(r)) {
          continue;
        }
        for (let [o, s] of Object.entries(r)) {
          if (o === "__proto__" || o === "constructor") {
            continue;
          }
          if (typeof t[o] > "u" && typeof s < "u") {
            t[o] = s;
          }
          if (e && Qrs(t[o]) && Qrs(s)) {
            Zrs(true, t[o], s);
          }
        }
      }
      return t;
    }
    eos.exports = Zrs.bind(undefined, false);
    eos.exports.deep = Zrs.bind(undefined, true);
  });
  var nos = __commonJS((Bmw, Ozc) => {
    Ozc.exports = e => {
      let t = {};
      try {
        while ((/(\w+)=("[^"]*")/g).exec(e) !== null) {
          if (RegExp.$1 && RegExp.$2) {
            t[RegExp.$1] = RegExp.$2.slice(1, -1);
          }
        }
      } catch (n) {}
      return t;
    };
  });
  var Xbr = __commonJS(($mw, Dzc) => {
    function oGf(e, t, n) {
      if (!t[`${e}_endpoint`]) {
        return;
      }
      let r = `${e}_endpoint_auth_method`;
      let o = `${e}_endpoint_auth_signing_alg`;
      let s = `${e}_endpoint_auth_signing_alg_values_supported`;
      if (n[r] && n[r].endsWith("_jwt") && !n[o] && !t[s]) {
        throw TypeError(`${s} must be configured on the issuer if ${o} is not defined on a client`);
      }
    }
    function sGf(e, t) {
      if (!e[t]) {
        throw TypeError(`${t} must be configured on the issuer`);
      }
    }
    Dzc.exports = {
      assertSigningAlgValuesSupport: oGf,
      assertIssuerConfiguration: sGf
    };
  });
  var Qbr = __commonJS((Hmw, Mzc) => {
    Mzc.exports = function (t, ...n) {
      let r = {};
      for (let o of n) {
        if (t[o] !== undefined) {
          r[o] = t[o];
        }
      }
      return r;
    };
  });
  var eSr = __commonJS((jmw, Lzc) => {
    var {
      STATUS_CODES: ros
    } = require("http");
    var {
      format: Nzc
    } = require("util");
    var {
      OPError: Zbr
    } = Whe();
    var iGf = nos();
    var aGf = e => {
      let t = iGf(e.headers["www-authenticate"]);
      if (t.error) {
        throw new Zbr(t, e);
      }
    };
    var lGf = e => {
      let t = false;
      try {
        let n;
        if (typeof e.body !== "object" || Buffer.isBuffer(e.body)) {
          n = JSON.parse(e.body);
        } else {
          n = e.body;
        }
        if (t = typeof n.error === "string" && n.error.length, t) {
          Object.defineProperty(e, "body", {
            value: n,
            configurable: true
          });
        }
      } catch (n) {}
      return t;
    };
    function cGf(e, {
      statusCode: t = 200,
      body: n = true,
      bearer: r = false
    } = {}) {
      if (e.statusCode !== t) {
        if (r) {
          aGf(e);
        }
        if (lGf(e)) {
          throw new Zbr(e.body, e);
        }
        throw new Zbr({
          error: Nzc("expected %i %s, got: %i %s", t, ros[t], e.statusCode, ros[e.statusCode])
        }, e);
      }
      if (n && !e.body) {
        throw new Zbr({
          error: Nzc("expected %i %s with body but no body was returned", t, ros[t])
        }, e);
      }
      return e.body;
    }
    Lzc.exports = cGf;
  });
  var Xsn = __commonJS((qmw, Fzc) => {
    Fzc.exports = () => Math.floor(Date.now() / 1000);
  });
  var oos = __commonJS((Wmw, $zc) => {
    var uGf = Ysn();
    var Uzc = Xsn();
    class Bzc {
      constructor(e) {
        Object.assign(this, e);
        let {
          constructor: t,
          ...n
        } = Object.getOwnPropertyDescriptors(this.constructor.prototype);
        Object.defineProperties(this, n);
      }
      set expires_in(e) {
        this.expires_at = Uzc() + Number(e);
      }
      get expires_in() {
        return Math.max.apply(null, [this.expires_at - Uzc(), 0]);
      }
      expired() {
        return this.expires_in === 0;
      }
      claims() {
        if (!this.id_token) {
          throw TypeError("id_token not present in TokenSet");
        }
        return JSON.parse(uGf.oC(this.id_token.split(".")[1]));
      }
    }
    $zc.exports = Bzc;
  });
  var Qsn = __commonJS((Gmw, jzc) => {
    var {
      createHash: dGf,
      randomBytes: pGf
    } = require("crypto");
    var Hzc = Ysn();
    var tSr = (e = 32) => Hzc.HS(pGf(e));
    jzc.exports = {
      random: tSr,
      state: tSr,
      nonce: tSr,
      codeVerifier: tSr,
      codeChallenge: e => Hzc.HS(dGf("sha256").update(e).digest())
    };
  });
  var Wzc = __commonJS((Vmw, qzc) => {
    qzc.exports = function (e) {
      e.prototype[Symbol.iterator] = function* () {
        for (let t = this.head; t; t = t.next) {
          yield t.value;
        }
      };
    };
  });
  var Vzc = __commonJS((zmw, Gzc) => {
    Gzc.exports = cb;
    cb.Node = JXe;
    cb.create = cb;
    function cb(e) {
      var t = this;
      if (!(t instanceof cb)) {
        t = new cb();
      }
      if (t.tail = null, t.head = null, t.length = 0, e && typeof e.forEach === "function") {
        e.forEach(function (o) {
          t.push(o);
        });
      } else if (arguments.length > 0) {
        for (var n = 0, r = arguments.length; n < r; n++) {
          t.push(arguments[n]);
        }
      }
      return t;
    }
    cb.prototype.removeNode = function (e) {
      if (e.list !== this) {
        throw Error("removing node which does not belong to this list");
      }
      var {
        next: t,
        prev: n
      } = e;
      if (t) {
        t.prev = n;
      }
      if (n) {
        n.next = t;
      }
      if (e === this.head) {
        this.head = t;
      }
      if (e === this.tail) {
        this.tail = n;
      }
      e.list.length--;
      e.next = null;
      e.prev = null;
      e.list = null;
      return t;
    };
    cb.prototype.unshiftNode = function (e) {
      if (e === this.head) {
        return;
      }
      if (e.list) {
        e.list.removeNode(e);
      }
      var t = this.head;
      if (e.list = this, e.next = t, t) {
        t.prev = e;
      }
      if (this.head = e, !this.tail) {
        this.tail = e;
      }
      this.length++;
    };
    cb.prototype.pushNode = function (e) {
      if (e === this.tail) {
        return;
      }
      if (e.list) {
        e.list.removeNode(e);
      }
      var t = this.tail;
      if (e.list = this, e.prev = t, t) {
        t.next = e;
      }
      if (this.tail = e, !this.head) {
        this.head = e;
      }
      this.length++;
    };
    cb.prototype.push = function () {
      for (var e = 0, t = arguments.length; e < t; e++) {
        fGf(this, arguments[e]);
      }
      return this.length;
    };
    cb.prototype.unshift = function () {
      for (var e = 0, t = arguments.length; e < t; e++) {
        hGf(this, arguments[e]);
      }
      return this.length;
    };
    cb.prototype.pop = function () {
      if (!this.tail) {
        return;
      }
      var e = this.tail.value;
      if (this.tail = this.tail.prev, this.tail) {
        this.tail.next = null;
      } else {
        this.head = null;
      }
      this.length--;
      return e;
    };
    cb.prototype.shift = function () {
      if (!this.head) {
        return;
      }
      var e = this.head.value;
      if (this.head = this.head.next, this.head) {
        this.head.prev = null;
      } else {
        this.tail = null;
      }
      this.length--;
      return e;
    };
    cb.prototype.forEach = function (e, t) {
      t = t || this;
      for (var n = this.head, r = 0; n !== null; r++) {
        e.call(t, n.value, r, this);
        n = n.next;
      }
    };
    cb.prototype.forEachReverse = function (e, t) {
      t = t || this;
      for (var n = this.tail, r = this.length - 1; n !== null; r--) {
        e.call(t, n.value, r, this);
        n = n.prev;
      }
    };
    cb.prototype.get = function (e) {
      for (var t = 0, n = this.head; n !== null && t < e; t++) {
        n = n.next;
      }
      if (t === e && n !== null) {
        return n.value;
      }
    };
    cb.prototype.getReverse = function (e) {
      for (var t = 0, n = this.tail; n !== null && t < e; t++) {
        n = n.prev;
      }
      if (t === e && n !== null) {
        return n.value;
      }
    };
    cb.prototype.map = function (e, t) {
      t = t || this;
      var n = new cb();
      for (var r = this.head; r !== null;) {
        n.push(e.call(t, r.value, this));
        r = r.next;
      }
      return n;
    };
    cb.prototype.mapReverse = function (e, t) {
      t = t || this;
      var n = new cb();
      for (var r = this.tail; r !== null;) {
        n.push(e.call(t, r.value, this));
        r = r.prev;
      }
      return n;
    };
    cb.prototype.reduce = function (e, t) {
      var n;
      var r = this.head;
      if (arguments.length > 1) {
        n = t;
      } else if (this.head) {
        r = this.head.next;
        n = this.head.value;
      } else {
        throw TypeError("Reduce of empty list with no initial value");
      }
      for (var o = 0; r !== null; o++) {
        n = e(n, r.value, o);
        r = r.next;
      }
      return n;
    };
    cb.prototype.reduceReverse = function (e, t) {
      var n;
      var r = this.tail;
      if (arguments.length > 1) {
        n = t;
      } else if (this.tail) {
        r = this.tail.prev;
        n = this.tail.value;
      } else {
        throw TypeError("Reduce of empty list with no initial value");
      }
      for (var o = this.length - 1; r !== null; o--) {
        n = e(n, r.value, o);
        r = r.prev;
      }
      return n;
    };
    cb.prototype.toArray = function () {
      var e = Array(this.length);
      for (var t = 0, n = this.head; n !== null; t++) {
        e[t] = n.value;
        n = n.next;
      }
      return e;
    };
    cb.prototype.toArrayReverse = function () {
      var e = Array(this.length);
      for (var t = 0, n = this.tail; n !== null; t++) {
        e[t] = n.value;
        n = n.prev;
      }
      return e;
    };
    cb.prototype.slice = function (e, t) {
      if (t = t || this.length, t < 0) {
        t += this.length;
      }
      if (e = e || 0, e < 0) {
        e += this.length;
      }
      var n = new cb();
      if (t < e || t < 0) {
        return n;
      }
      if (e < 0) {
        e = 0;
      }
      if (t > this.length) {
        t = this.length;
      }
      for (var r = 0, o = this.head; o !== null && r < e; r++) {
        o = o.next;
      }
      for (; o !== null && r < t; r++, o = o.next) {
        n.push(o.value);
      }
      return n;
    };
    cb.prototype.sliceReverse = function (e, t) {
      if (t = t || this.length, t < 0) {
        t += this.length;
      }
      if (e = e || 0, e < 0) {
        e += this.length;
      }
      var n = new cb();
      if (t < e || t < 0) {
        return n;
      }
      if (e < 0) {
        e = 0;
      }
      if (t > this.length) {
        t = this.length;
      }
      for (var r = this.length, o = this.tail; o !== null && r > t; r--) {
        o = o.prev;
      }
      for (; o !== null && r > e; r--, o = o.prev) {
        n.push(o.value);
      }
      return n;
    };
    cb.prototype.splice = function (e, t, ...n) {
      if (e > this.length) {
        e = this.length - 1;
      }
      if (e < 0) {
        e = this.length + e;
      }
      for (var r = 0, o = this.head; o !== null && r < e; r++) {
        o = o.next;
      }
      var s = [];
      for (var r = 0; o && r < t; r++) {
        s.push(o.value);
        o = this.removeNode(o);
      }
      if (o === null) {
        o = this.tail;
      }
      if (o !== this.head && o !== this.tail) {
        o = o.prev;
      }
      for (var r = 0; r < n.length; r++) {
        o = mGf(this, o, n[r]);
      }
      return s;
    };
    cb.prototype.reverse = function () {
      var e = this.head;
      var t = this.tail;
      for (var n = e; n !== null; n = n.prev) {
        var r = n.prev;
        n.prev = n.next;
        n.next = r;
      }
      this.head = t;
      this.tail = e;
      return this;
    };
    function mGf(e, t, n) {
      var r = t === e.head ? new JXe(n, null, t, e) : new JXe(n, t, t.next, e);
      if (r.next === null) {
        e.tail = r;
      }
      if (r.prev === null) {
        e.head = r;
      }
      e.length++;
      return r;
    }
    function fGf(e, t) {
      if (e.tail = new JXe(t, e.tail, null, e), !e.head) {
        e.head = e.tail;
      }
      e.length++;
    }
    function hGf(e, t) {
      if (e.head = new JXe(t, null, e.head, e), !e.tail) {
        e.tail = e.head;
      }
      e.length++;
    }
    function JXe(e, t, n, r) {
      if (!(this instanceof JXe)) {
        return new JXe(e, t, n, r);
      }
      if (this.list = r, this.value = e, t) {
        t.next = this;
        this.prev = t;
      } else {
        this.prev = null;
      }
      if (n) {
        n.prev = this;
        this.next = n;
      } else {
        this.next = null;
      }
    }
    try {
      Wzc()(cb);
    } catch (e) {}
  });
  var rSr = __commonJS((Kmw, Qzc) => {
    var gGf = Vzc();
    var XXe = Symbol("max");
    var gRe = Symbol("length");
    var bkt = Symbol("lengthCalculator");
    var ein = Symbol("allowStale");
    var QXe = Symbol("maxAge");
    var hRe = Symbol("dispose");
    var zzc = Symbol("noDisposeOnSet");
    var PL = Symbol("lruList");
    var Qie = Symbol("cache");
    var Yzc = Symbol("updateAgeOnGet");
    var sos = () => 1;
    class Jzc {
      constructor(e) {
        if (typeof e === "number") {
          e = {
            max: e
          };
        }
        if (!e) {
          e = {};
        }
        if (e.max && (typeof e.max !== "number" || e.max < 0)) {
          throw TypeError("max must be a non-negative number");
        }
        let t = this[XXe] = e.max || 1 / 0;
        let n = e.length || sos;
        if (this[bkt] = typeof n !== "function" ? sos : n, this[ein] = e.stale || false, e.maxAge && typeof e.maxAge !== "number") {
          throw TypeError("maxAge must be a number");
        }
        this[QXe] = e.maxAge || 0;
        this[hRe] = e.dispose;
        this[zzc] = e.noDisposeOnSet || false;
        this[Yzc] = e.updateAgeOnGet || false;
        this.reset();
      }
      set max(e) {
        if (typeof e !== "number" || e < 0) {
          throw TypeError("max must be a non-negative number");
        }
        this[XXe] = e || 1 / 0;
        Zsn(this);
      }
      get max() {
        return this[XXe];
      }
      set allowStale(e) {
        this[ein] = !!e;
      }
      get allowStale() {
        return this[ein];
      }
      set maxAge(e) {
        if (typeof e !== "number") {
          throw TypeError("maxAge must be a non-negative number");
        }
        this[QXe] = e;
        Zsn(this);
      }
      get maxAge() {
        return this[QXe];
      }
      set lengthCalculator(e) {
        if (typeof e !== "function") {
          e = sos;
        }
        if (e !== this[bkt]) {
          this[bkt] = e;
          this[gRe] = 0;
          this[PL].forEach(t => {
            t.length = this[bkt](t.value, t.key);
            this[gRe] += t.length;
          });
        }
        Zsn(this);
      }
      get lengthCalculator() {
        return this[bkt];
      }
      get length() {
        return this[gRe];
      }
      get itemCount() {
        return this[PL].length;
      }
      rforEach(e, t) {
        t = t || this;
        for (let n = this[PL].tail; n !== null;) {
          let r = n.prev;
          Kzc(this, e, n, t);
          n = r;
        }
      }
      forEach(e, t) {
        t = t || this;
        for (let n = this[PL].head; n !== null;) {
          let r = n.next;
          Kzc(this, e, n, t);
          n = r;
        }
      }
      keys() {
        return this[PL].toArray().map(e => e.key);
      }
      values() {
        return this[PL].toArray().map(e => e.value);
      }
      reset() {
        if (this[hRe] && this[PL] && this[PL].length) {
          this[PL].forEach(e => this[hRe](e.key, e.value));
        }
        this[Qie] = new Map();
        this[PL] = new gGf();
        this[gRe] = 0;
      }
      dump() {
        return this[PL].map(e => nSr(this, e) ? false : {
          k: e.key,
          v: e.value,
          e: e.now + (e.maxAge || 0)
        }).toArray().filter(e => e);
      }
      dumpLru() {
        return this[PL];
      }
      set(e, t, n) {
        if (n = n || this[QXe], n && typeof n !== "number") {
          throw TypeError("maxAge must be a number");
        }
        let r = n ? Date.now() : 0;
        let o = this[bkt](t, e);
        if (this[Qie].vZc(e)) {
          if (o > this[XXe]) {
            Skt(this, this[Qie].get(e));
            return false;
          }
          let a = this[Qie].get(e).value;
          if (this[hRe]) {
            if (!this[zzc]) {
              this[hRe](e, a.value);
            }
          }
          a.now = r;
          a.maxAge = n;
          a.value = t;
          this[gRe] += o - a.length;
          a.length = o;
          this.get(e);
          Zsn(this);
          return true;
        }
        let s = new Xzc(e, t, o, r, n);
        if (s.length > this[XXe]) {
          if (this[hRe]) {
            this[hRe](e, t);
          }
          return false;
        }
        this[gRe] += s.length;
        this[PL].unshift(s);
        this[Qie].set(e, this[PL].head);
        Zsn(this);
        return true;
      }
      vZc(e) {
        if (!this[Qie].vZc(e)) {
          return false;
        }
        let t = this[Qie].get(e).value;
        return !nSr(this, t);
      }
      get(e) {
        return ios(this, e, true);
      }
      peek(e) {
        return ios(this, e, false);
      }
      pop() {
        let e = this[PL].tail;
        if (!e) {
          return null;
        }
        Skt(this, e);
        return e.value;
      }
      del(e) {
        Skt(this, this[Qie].get(e));
      }
      load(e) {
        this.reset();
        let t = Date.now();
        for (let n = e.length - 1; n >= 0; n--) {
          let r = e[n];
          let o = r.e || 0;
          if (o === 0) {
            this.set(r.k, r.v);
          } else {
            let s = o - t;
            if (s > 0) {
              this.set(r.k, r.v, s);
            }
          }
        }
      }
      prune() {
        this[Qie].forEach((e, t) => ios(this, t, false));
      }
    }
    var ios = (e, t, n) => {
      let r = e[Qie].get(t);
      if (r) {
        let o = r.value;
        if (nSr(e, o)) {
          if (Skt(e, r), !e[ein]) {
            return;
          }
        } else if (n) {
          if (e[Yzc]) {
            r.value.now = Date.now();
          }
          e[PL].unshiftNode(r);
        }
        return o.value;
      }
    };
    var nSr = (e, t) => {
      if (!t || !t.maxAge && !e[QXe]) {
        return false;
      }
      let n = Date.now() - t.now;
      return t.maxAge ? n > t.maxAge : e[QXe] && n > e[QXe];
    };
    var Zsn = e => {
      if (e[gRe] > e[XXe]) {
        for (let t = e[PL].tail; e[gRe] > e[XXe] && t !== null;) {
          let n = t.prev;
          Skt(e, t);
          t = n;
        }
      }
    };
    var Skt = (e, t) => {
      if (t) {
        let n = t.value;
        if (e[hRe]) {
          e[hRe](n.key, n.value);
        }
        e[gRe] -= n.length;
        e[Qie].delete(n.key);
        e[PL].removeNode(t);
      }
    };
    class Xzc {
      constructor(e, t, n, r, o) {
        this.key = e;
        this.value = t;
        this.length = n;
        this.now = r;
        this.maxAge = o || 0;
      }
    }
    var Kzc = (e, t, n, r) => {
      let o = n.value;
      if (nSr(e, o)) {
        if (Skt(e, n), !e[ein]) {
          o = undefined;
        }
      }
      if (o) {
        t.call(r, o.value, o.key, e);
      }
    };
    Qzc.exports = Jzc;
  });