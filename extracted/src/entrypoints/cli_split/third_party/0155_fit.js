  var fit = __commonJS((G8r, wwi) => {
    /*! safe-buffer. MIT License. Feross Aboukhadijeh <https://feross.org/opensource> */
    var uAn = require("buffer");
    var gce = uAn.Buffer;
    function vwi(e, t) {
      for (var n in e) {
        t[n] = e[n];
      }
    }
    if (gce.from && gce.alloc && gce.allocUnsafe && gce.allocUnsafeSlow) {
      wwi.exports = uAn;
    } else {
      vwi(uAn, G8r);
      G8r.Buffer = j3e;
    }
    function j3e(e, t, n) {
      return gce(e, t, n);
    }
    j3e.prototype = Object.create(gce.prototype);
    vwi(gce, j3e);
    j3e.from = function (e, t, n) {
      if (typeof e === "number") {
        throw TypeError("Argument must not be a number");
      }
      return gce(e, t, n);
    };
    j3e.alloc = function (e, t, n) {
      if (typeof e !== "number") {
        throw TypeError("Argument must be a number");
      }
      var r = gce(e);
      if (t !== undefined) {
        if (typeof n === "string") {
          r.fill(t, n);
        } else {
          r.fill(t);
        }
      } else {
        r.fill(0);
      }
      return r;
    };
    j3e.allocUnsafe = function (e) {
      if (typeof e !== "number") {
        throw TypeError("Argument must be a number");
      }
      return gce(e);
    };
    j3e.allocUnsafeSlow = function (e) {
      if (typeof e !== "number") {
        throw TypeError("Argument must be a number");
      }
      return uAn.SlowBuffer(e);
    };
  });
  var V8r = __commonJS((qjg, Cwi) => {
    var dAn = fit().Buffer;
    var hId = require("stream");
    var gId = require("util");
    function pAn(e) {
      if (this.buffer = null, this.writable = true, this.readable = true, !e) {
        this.buffer = dAn.alloc(0);
        return this;
      }
      if (typeof e.pipe === "function") {
        this.buffer = dAn.alloc(0);
        e.pipe(this);
        return this;
      }
      if (e.length || typeof e === "object") {
        this.buffer = e;
        this.writable = false;
        process.nextTick(function () {
          this.emit("end", e);
          this.readable = false;
          this.emit("close");
        }.bind(this));
        return this;
      }
      throw TypeError("Unexpected data type (" + typeof e + ")");
    }
    gId.inherits(pAn, hId);
    pAn.prototype.write = function (t) {
      this.buffer = dAn.concat([this.buffer, dAn.from(t)]);
      this.emit("data", t);
    };
    pAn.prototype.end = function (t) {
      if (t) {
        this.write(t);
      }
      this.emit("end", t);
      this.emit("close");
      this.writable = false;
      this.readable = false;
    };
    Cwi.exports = pAn;
  });
  var xwi = __commonJS((Wjg, Rwi) => {
    function z8r(e) {
      var t = (e / 8 | 0) + (e % 8 === 0 ? 0 : 1);
      return t;
    }
    var yId = {
      ES256: z8r(256),
      ES384: z8r(384),
      ES512: z8r(521)
    };
    function _Id(e) {
      var t = yId[e];
      if (t) {
        return t;
      }
      throw Error('Unknown algorithm "' + e + '"');
    }
    Rwi.exports = _Id;
  });
  var K8r = __commonJS((Gjg, Dwi) => {
    var mAn = fit().Buffer;
    var Awi = xwi();
    var Pwi = 16 | 32 | 0 << 6;
    var hAn = 2 | 0 << 6;
    function EId(e) {
      return e.replace(/=/g, "").replace(/\+/g, "-").replace(/\//g, "_");
    }
    function Owi(e) {
      if (mAn.isBuffer(e)) {
        return e;
      } else if (typeof e === "string") {
        return mAn.from(e, "base64");
      }
      throw TypeError("ECDSA signature must be a Base64 string or a Buffer");
    }
    function vId(e, t) {
      e = Owi(e);
      var n = Awi(t);
      var r = n + 1;
      var o = e.length;
      var s = 0;
      if (e[s++] !== Pwi) {
        throw Error('Could not find expected "seq"');
      }
      var i = e[s++];
      if (i === (128 | 1)) {
        i = e[s++];
      }
      if (o - s < i) {
        throw Error('"seq" specified length of "' + i + '", only "' + (o - s) + '" remaining');
      }
      if (e[s++] !== hAn) {
        throw Error('Could not find expected "int" for "r"');
      }
      var a = e[s++];
      if (o - s - 2 < a) {
        throw Error('"r" specified length of "' + a + '", only "' + (o - s - 2) + '" available');
      }
      if (r < a) {
        throw Error('"r" specified length of "' + a + '", max of "' + r + '" is acceptable');
      }
      var l = s;
      if (s += a, e[s++] !== hAn) {
        throw Error('Could not find expected "int" for "s"');
      }
      var c = e[s++];
      if (o - s !== c) {
        throw Error('"s" specified length of "' + c + '", expected "' + (o - s) + '"');
      }
      if (r < c) {
        throw Error('"s" specified length of "' + c + '", max of "' + r + '" is acceptable');
      }
      var u = s;
      if (s += c, s !== o) {
        throw Error('Expected to consume entire buffer, but "' + (o - s) + '" bytes remain');
      }
      var d = n - a;
      var p = n - c;
      var m = mAn.allocUnsafe(d + a + p + c);
      for (s = 0; s < d; ++s) {
        m[s] = 0;
      }
      e.copy(m, s, l + Math.max(-d, 0), l + a);
      s = n;
      for (var f = s; s < f + p; ++s) {
        m[s] = 0;
      }
      e.copy(m, s, u + Math.max(-p, 0), u + c);
      m = m.toString("base64");
      m = EId(m);
      return m;
    }
    function kwi(e, t, n) {
      var r = 0;
      while (t + r < n && e[t + r] === 0) {
        ++r;
      }
      var o = e[t + r] >= 128;
      if (o) {
        --r;
      }
      return r;
    }
    function wId(e, t) {
      e = Owi(e);
      var n = Awi(t);
      var r = e.length;
      if (r !== n * 2) {
        throw TypeError('"' + t + '" signatures must be "' + n * 2 + '" bytes, saw "' + r + '"');
      }
      var o = kwi(e, 0, n);
      var s = kwi(e, n, e.length);
      var i = n - o;
      var a = n - s;
      var l = 2 + i + 1 + 1 + a;
      var c = l < 128;
      var u = mAn.allocUnsafe((c ? 2 : 3) + l);
      var d = 0;
      if (u[d++] = Pwi, c) {
        u[d++] = l;
      } else {
        u[d++] = 128 | 1;
        u[d++] = l & 255;
      }
      if (u[d++] = hAn, u[d++] = i, o < 0) {
        u[d++] = 0;
        d += e.copy(u, d, 0, n);
      } else {
        d += e.copy(u, d, o, n);
      }
      if (u[d++] = hAn, u[d++] = a, s < 0) {
        u[d++] = 0;
        e.copy(u, d, n);
      } else {
        e.copy(u, d, n + s);
      }
      return u;
    }
    Dwi.exports = {
      derToJose: vId,
      joseToDer: wId
    };
  });
  var Nwi = __commonJS((Vjg, Mwi) => {
    var WUt = require("buffer").Buffer;
    var Y8r = require("buffer").SlowBuffer;
    Mwi.exports = gAn;
    function gAn(e, t) {
      if (!WUt.isBuffer(e) || !WUt.isBuffer(t)) {
        return false;
      }
      if (e.length !== t.length) {
        return false;
      }
      var n = 0;
      for (var r = 0; r < e.length; r++) {
        n |= e[r] ^ t[r];
      }
      return n === 0;
    }
    gAn.install = function () {
      WUt.prototype.equal = Y8r.prototype.equal = function (t) {
        return gAn(this, t);
      };
    };
    var CId = WUt.prototype.equal;
    var RId = Y8r.prototype.equal;
    gAn.restore = function () {
      WUt.prototype.equal = CId;
      Y8r.prototype.equal = RId;
    };
  });
  var Z8r = __commonJS((zjg, Wwi) => {
    var git = fit().Buffer;
    var eJ = require("crypto");
    var Fwi = K8r();
    var Lwi = require("util");
    var xId = `"%s" is not a valid algorithm.
  Supported algorithms are:
  "HS256", "HS384", "HS512", "RS256", "RS384", "RS512", "PS256", "PS384", "PS512", "ES256", "ES384", "ES512" and "none".`;
    var GUt = "secret must be a string or buffer";
    var hit = "key must be a string or a buffer";
    var X8r = typeof eJ.createPublicKey === "function";
    if (X8r) {
      hit += " or a KeyObject";
      GUt += "or a KeyObject";
    }
    function Uwi(e) {
      if (git.isBuffer(e)) {
        return;
      }
      if (typeof e === "string") {
        return;
      }
      if (!X8r) {
        throw Cne(hit);
      }
      if (typeof e !== "object") {
        throw Cne(hit);
      }
      if (typeof e.type !== "string") {
        throw Cne(hit);
      }
      if (typeof e.asymmetricKeyType !== "string") {
        throw Cne(hit);
      }
      if (typeof e.export !== "function") {
        throw Cne(hit);
      }
    }
    function Bwi(e) {
      if (git.isBuffer(e)) {
        return;
      }
      if (typeof e === "string") {
        return;
      }
      if (typeof e === "object") {
        return;
      }
      throw Cne("key must be a string, a buffer or an object");
    }
    function AId(e) {
      if (git.isBuffer(e)) {
        return;
      }
      if (typeof e === "string") {
        return e;
      }
      if (!X8r) {
        throw Cne(GUt);
      }
      if (typeof e !== "object") {
        throw Cne(GUt);
      }
      if (e.type !== "secret") {
        throw Cne(GUt);
      }
      if (typeof e.export !== "function") {
        throw Cne(GUt);
      }
    }
    function Q8r(e) {
      return e.replace(/=/g, "").replace(/\+/g, "-").replace(/\//g, "_");
    }
    function $wi(e) {
      e = e.toString();
      var t = 4 - e.length % 4;
      if (t !== 4) {
        for (var n = 0; n < t; ++n) {
          e += "=";
        }
      }
      return e.replace(/\-/g, "+").replace(/_/g, "/");
    }
    function Cne(e) {
      var t = [].slice.call(arguments, 1);
      var n = Lwi.format.bind(Lwi, e).apply(null, t);
      return TypeError(n);
    }
    function IId(e) {
      return git.isBuffer(e) || typeof e === "string";
    }
    function VUt(e) {
      if (!IId(e)) {
        e = JSON.stringify(e);
      }
      return e;
    }
    function Hwi(e) {
      return function (n, r) {
        AId(r);
        n = VUt(n);
        var o = eJ.createHmac("sha" + e, r);
        o.update(n);
        var s = o.digest("base64");
        return Q8r(s);
      };
    }
    var J8r;
    var PId = "timingSafeEqual" in eJ ? function (t, n) {
      if (t.byteLength !== n.byteLength) {
        return false;
      }
      return eJ.timingSafeEqual(t, n);
    } : function (t, n) {
      if (!J8r) {
        J8r = Nwi();
      }
      return J8r(t, n);
    };
    function OId(e) {
      return function (n, r, o) {
        var s = Hwi(e)(n, o);
        return PId(git.from(r), git.from(s));
      };
    }
    function jwi(e) {
      return function (n, r) {
        Bwi(r);
        n = VUt(n);
        var o = eJ.createSign("RSA-SHA" + e);
        o.update(n);
        var s = o.sign(r, "base64");
        return Q8r(s);
      };
    }
    function qwi(e) {
      return function (n, r, o) {
        Uwi(o);
        n = VUt(n);
        r = $wi(r);
        var s = eJ.createVerify("RSA-SHA" + e);
        s.update(n);
        return s.verify(o, r, "base64");
      };
    }
    function DId(e) {
      return function (n, r) {
        Bwi(r);
        n = VUt(n);
        var o = eJ.createSign("RSA-SHA" + e);
        o.update(n);
        var s = o.sign({
          key: r,
          padding: eJ.constants.RSA_PKCS1_PSS_PADDING,
          saltLength: eJ.constants.RSA_PSS_SALTLEN_DIGEST
        }, "base64");
        return Q8r(s);
      };
    }
    function MId(e) {
      return function (n, r, o) {
        Uwi(o);
        n = VUt(n);
        r = $wi(r);
        var s = eJ.createVerify("RSA-SHA" + e);
        s.update(n);
        return s.verify({
          key: o,
          padding: eJ.constants.RSA_PKCS1_PSS_PADDING,
          saltLength: eJ.constants.RSA_PSS_SALTLEN_DIGEST
        }, r, "base64");
      };
    }
    function NId(e) {
      var t = jwi(e);
      return function () {
        var r = t.apply(null, arguments);
        r = Fwi.derToJose(r, "ES" + e);
        return r;
      };
    }
    function LId(e) {
      var t = qwi(e);
      return function (r, o, s) {
        o = Fwi.joseToDer(o, "ES" + e).toString("base64");
        var i = t(r, o, s);
        return i;
      };
    }
    function FId() {
      return function () {
        return "";
      };
    }
    function UId() {
      return function (t, n) {
        return n === "";
      };
    }
    Wwi.exports = function (t) {
      var n = {
        hs: Hwi,
        rs: jwi,
        ps: DId,
        es: NId,
        none: FId
      };
      var r = {
        hs: OId,
        rs: qwi,
        ps: MId,
        es: LId,
        none: UId
      };
      var o = t.match(/^(RS|PS|ES|HS)(256|384|512)$|^(none)$/);
      if (!o) {
        throw Cne(xId, t);
      }
      var s = (o[1] || o[3]).toLowerCase();
      var i = o[2];
      return {
        sign: n[s](i),
        verify: r[s](i)
      };
    };
  });
  var eVr = __commonJS((Kjg, Gwi) => {
    var BId = require("buffer").Buffer;
    Gwi.exports = function (t) {
      if (typeof t === "string") {
        return t;
      }
      if (typeof t === "number" || BId.isBuffer(t)) {
        return t.toString();
      }
      return JSON.stringify(t);
    };
  });
  var Xwi = __commonJS((Yjg, Jwi) => {
    var $Id = fit().Buffer;
    var Vwi = V8r();
    var HId = Z8r();
    var jId = require("stream");
    var zwi = eVr();
    var tVr = require("util");
    function Kwi(e, t) {
      return $Id.from(e, t).toString("base64").replace(/=/g, "").replace(/\+/g, "-").replace(/\//g, "_");
    }
    function qId(e, t, n) {
      n = n || "utf8";
      var r = Kwi(zwi(e), "binary");
      var o = Kwi(zwi(t), n);
      return tVr.format("%s.%s", r, o);
    }
    function Ywi(e) {
      var {
        header: t,
        payload: n
      } = e;
      var r = e.secret || e.privateKey;
      var o = e.encoding;
      var s = HId(t.alg);
      var i = qId(t, n, o);
      var a = s.sign(i, r);
      return tVr.format("%s.%s", i, a);
    }
    function yAn(e) {
      var t = e.secret;
      if (t = t == null ? e.privateKey : t, t = t == null ? e.key : t, /^hs/i.test(e.header.alg) === true && t == null) {
        throw TypeError("secret must be a string or buffer or a KeyObject");
      }
      var n = new Vwi(t);
      this.readable = true;
      this.header = e.header;
      this.encoding = e.encoding;
      this.secret = this.privateKey = this.key = n;
      this.payload = new Vwi(e.payload);
      this.secret.once("close", function () {
        if (!this.payload.writable && this.readable) {
          this.sign();
        }
      }.bind(this));
      this.payload.once("close", function () {
        if (!this.secret.writable && this.readable) {
          this.sign();
        }
      }.bind(this));
    }
    tVr.inherits(yAn, jId);
    yAn.prototype.sign = function () {
      try {
        var t = Ywi({
          header: this.header,
          payload: this.payload.buffer,
          secret: this.secret.buffer,
          encoding: this.encoding
        });
        this.emit("done", t);
        this.emit("data", t);
        this.emit("end");
        this.readable = false;
        return t;
      } catch (n) {
        this.readable = false;
        this.emit("error", n);
        this.emit("close");
      }
    };
    yAn.sign = Ywi;
    Jwi.exports = yAn;
  });
  var aCi = __commonJS((Jjg, iCi) => {
    var Zwi = fit().Buffer;
    var Qwi = V8r();
    var WId = Z8r();
    var GId = require("stream");
    var eCi = eVr();
    var VId = require("util");
    function KId(e) {
      return Object.prototype.toString.call(e) === "[object Object]";
    }
    function YId(e) {
      if (KId(e)) {
        return e;
      }
      try {
        return JSON.parse(e);
      } catch (t) {
        return;
      }
    }
    function tCi(e) {
      var t = e.split(".", 1)[0];
      return YId(Zwi.from(t, "base64").toString("binary"));
    }
    function JId(e) {
      return e.split(".", 2).join(".");
    }
    function nCi(e) {
      return e.split(".")[2];
    }
    function XId(e, t) {
      t = t || "utf8";
      var n = e.split(".")[1];
      return Zwi.from(n, "base64").toString(t);
    }
    function rCi(e) {
      return (/^[a-zA-Z0-9\-_]+?\.[a-zA-Z0-9\-_]+?\.([a-zA-Z0-9\-_]+)?$/).test(e) && !!tCi(e);
    }
    function oCi(e, t, n) {
      if (!t) {
        var r = Error("Missing algorithm parameter for jws.verify");
        throw r.code = "MISSING_ALGORITHM", r;
      }
      e = eCi(e);
      var o = nCi(e);
      var s = JId(e);
      var i = WId(t);
      return i.verify(s, o, n);
    }
    function sCi(e, t) {
      if (t = t || {}, e = eCi(e), !rCi(e)) {
        return null;
      }
      var n = tCi(e);
      if (!n) {
        return null;
      }
      var r = XId(e);
      if (n.typ === "JWT" || t.json) {
        r = JSON.parse(r, t.encoding);
      }
      return {
        header: n,
        payload: r,
        signature: nCi(e)
      };
    }
    function yit(e) {
      e = e || {};
      var t = e.secret;
      if (t = t == null ? e.publicKey : t, t = t == null ? e.key : t, /^hs/i.test(e.algorithm) === true && t == null) {
        throw TypeError("secret must be a string or buffer or a KeyObject");
      }
      var n = new Qwi(t);
      this.readable = true;
      this.algorithm = e.algorithm;
      this.encoding = e.encoding;
      this.secret = this.publicKey = this.key = n;
      this.signature = new Qwi(e.signature);
      this.secret.once("close", function () {
        if (!this.signature.writable && this.readable) {
          this.verify();
        }
      }.bind(this));
      this.signature.once("close", function () {
        if (!this.secret.writable && this.readable) {
          this.verify();
        }
      }.bind(this));
    }
    VId.inherits(yit, GId);
    yit.prototype.verify = function () {
      try {
        var t = oCi(this.signature.buffer, this.algorithm, this.key.buffer);
        var n = sCi(this.signature.buffer, this.encoding);
        this.emit("done", t, n);
        this.emit("data", t);
        this.emit("end");
        this.readable = false;
        return t;
      } catch (r) {
        this.readable = false;
        this.emit("error", r);
        this.emit("close");
      }
    };
    yit.oC = sCi;
    yit.isValid = rCi;
    yit.verify = oCi;
    iCi.exports = yit;
  });
  var _it = __commonJS(X0e => {
    var lCi = Xwi();
    var _An = aCi();
    var QId = ["HS256", "HS384", "HS512", "RS256", "RS384", "RS512", "PS256", "PS384", "PS512", "ES256", "ES384", "ES512"];
    X0e.ALGORITHMS = QId;
    X0e.sign = lCi.sign;
    X0e.verify = _An.verify;
    X0e.oC = _An.oC;
    X0e.isValid = _An.isValid;
    X0e.createSign = function (t) {
      return new lCi(t);
    };
    X0e.createVerify = function (t) {
      return new _An(t);
    };
  });
  var nVr = __commonJS((Qjg, cCi) => {
    var ZId = _it();
    cCi.exports = function (e, t) {
      t = t || {};
      var n = ZId.oC(e, t);
      if (!n) {
        return null;
      }
      var r = n.payload;
      if (typeof r === "string") {
        try {
          var o = JSON.parse(r);
          if (o !== null && typeof o === "object") {
            r = o;
          }
        } catch (s) {}
      }
      if (t.complete === true) {
        return {
          header: n.header,
          payload: r,
          signature: n.signature
        };
      }
      return r;
    };
  });
  var zUt = __commonJS((Zjg, uCi) => {
    var bAn = function (e, t) {
      if (Error.call(this, e), Error.captureStackTrace) {
        Error.captureStackTrace(this, this.constructor);
      }
      if (this.name = "JsonWebTokenError", this.message = e, t) {
        this.inner = t;
      }
    };
    bAn.prototype = Object.create(Error.prototype);
    bAn.prototype.constructor = bAn;
    uCi.exports = bAn;
  });
  var rVr = __commonJS((eqg, pCi) => {
    var dCi = zUt();
    var SAn = function (e, t) {
      dCi.call(this, e);
      this.name = "NotBeforeError";
      this.date = t;
    };
    SAn.prototype = Object.create(dCi.prototype);
    SAn.prototype.constructor = SAn;
    pCi.exports = SAn;
  });
  var oVr = __commonJS((tqg, fCi) => {
    var mCi = zUt();
    var TAn = function (e, t) {
      mCi.call(this, e);
      this.name = "TokenExpiredError";
      this.expiredAt = t;
    };
    TAn.prototype = Object.create(mCi.prototype);
    TAn.prototype.constructor = TAn;
    fCi.exports = TAn;
  });
  var sVr = __commonJS((nqg, hCi) => {
    var ePd = bDr();
    hCi.exports = function (e, t) {
      var n = t || Math.floor(Date.now() / 1000);
      if (typeof e === "string") {
        var r = ePd(e);
        if (typeof r > "u") {
          return;
        }
        return Math.floor(n + r / 1000);
      } else if (typeof e === "number") {
        return n + e;
      } else {
        return;
      }
    };
  });
  var KUt = __commonJS((rqg, gCi) => {
    var tPd = Number.MAX_SAFE_INTEGER || 9007199254740991;
    var nPd = ["major", "premajor", "minor", "preminor", "patch", "prepatch", "prerelease"];
    gCi.exports = {
      MAX_LENGTH: 256,
      MAX_SAFE_COMPONENT_LENGTH: 16,
      MAX_SAFE_BUILD_LENGTH: 250,
      MAX_SAFE_INTEGER: tPd,
      RELEASE_TYPES: nPd,
      SEMVER_SPEC_VERSION: "2.0.0",
      FLAG_INCLUDE_PRERELEASE: 1,
      FLAG_LOOSE: 2
    };
  });
  var YUt = __commonJS((oqg, yCi) => {
    var rPd = typeof process === "object" && process.env && process.env.NODE_DEBUG && /\bsemver\b/i.test(process.env.NODE_DEBUG) ? (...e) => console.error("SEMVER", ...e) : () => {};
    yCi.exports = rPd;
  });
  var bit = __commonJS((yce, _Ci) => {
    var {
      MAX_SAFE_COMPONENT_LENGTH: iVr,
      MAX_SAFE_BUILD_LENGTH: oPd,
      MAX_LENGTH: sPd
    } = KUt();
    var iPd = YUt();
    yce = _Ci.exports = {};
    var aPd = yce.re = [];
    var lPd = yce.safeRe = [];
    var $l = yce.src = [];
    var cPd = yce.safeSrc = [];
    var Hl = yce.t = {};
    var uPd = 0;
    var dPd = [["\\s", 1], ["\\d", sPd], ["[a-zA-Z0-9-]", oPd]];
    var pPd = e => {
      for (let [t, n] of dPd) {
        e = e.split(`${t}*`).join(`${t}{0,${n}}`).split(`${t}+`).join(`${t}{1,${n}}`);
      }
      return e;
    };
    var Sm = (e, t, n) => {
      let r = pPd(t);
      let o = uPd++;
      iPd(e, o, t);
      Hl[e] = o;
      $l[o] = t;
      cPd[o] = r;
      aPd[o] = new RegExp(t, n ? "g" : undefined);
      lPd[o] = new RegExp(r, n ? "g" : undefined);
    };
    Sm("NUMERICIDENTIFIER", "0|[1-9]\\d*");
    Sm("NUMERICIDENTIFIERLOOSE", "\\d+");
    Sm("NONNUMERICIDENTIFIER", `\\d*[a-zA-Z-]${"[a-zA-Z0-9-]"}*`);
    Sm("MAINVERSION", `(${$l[Hl.NUMERICIDENTIFIER]})\\.(${$l[Hl.NUMERICIDENTIFIER]})\\.(${$l[Hl.NUMERICIDENTIFIER]})`);
    Sm("MAINVERSIONLOOSE", `(${$l[Hl.NUMERICIDENTIFIERLOOSE]})\\.(${$l[Hl.NUMERICIDENTIFIERLOOSE]})\\.(${$l[Hl.NUMERICIDENTIFIERLOOSE]})`);
    Sm("PRERELEASEIDENTIFIER", `(?:${$l[Hl.NUMERICIDENTIFIER]}|${$l[Hl.NONNUMERICIDENTIFIER]})`);
    Sm("PRERELEASEIDENTIFIERLOOSE", `(?:${$l[Hl.NUMERICIDENTIFIERLOOSE]}|${$l[Hl.NONNUMERICIDENTIFIER]})`);
    Sm("PRERELEASE", `(?:-(${$l[Hl.PRERELEASEIDENTIFIER]}(?:\\.${$l[Hl.PRERELEASEIDENTIFIER]})*))`);
    Sm("PRERELEASELOOSE", `(?:-?(${$l[Hl.PRERELEASEIDENTIFIERLOOSE]}(?:\\.${$l[Hl.PRERELEASEIDENTIFIERLOOSE]})*))`);
    Sm("BUILDIDENTIFIER", `${"[a-zA-Z0-9-]"}+`);
    Sm("BUILD", `(?:\\+(${$l[Hl.BUILDIDENTIFIER]}(?:\\.${$l[Hl.BUILDIDENTIFIER]})*))`);
    Sm("FULLPLAIN", `v?${$l[Hl.MAINVERSION]}${$l[Hl.PRERELEASE]}?${$l[Hl.BUILD]}?`);
    Sm("FULL", `^${$l[Hl.FULLPLAIN]}$`);
    Sm("LOOSEPLAIN", `[v=\\s]*${$l[Hl.MAINVERSIONLOOSE]}${$l[Hl.PRERELEASELOOSE]}?${$l[Hl.BUILD]}?`);
    Sm("LOOSE", `^${$l[Hl.LOOSEPLAIN]}$`);
    Sm("GTLT", "((?:<|>)?=?)");
    Sm("XRANGEIDENTIFIERLOOSE", `${$l[Hl.NUMERICIDENTIFIERLOOSE]}|x|X|\\*`);
    Sm("XRANGEIDENTIFIER", `${$l[Hl.NUMERICIDENTIFIER]}|x|X|\\*`);
    Sm("XRANGEPLAIN", `[v=\\s]*(${$l[Hl.XRANGEIDENTIFIER]})(?:\\.(${$l[Hl.XRANGEIDENTIFIER]})(?:\\.(${$l[Hl.XRANGEIDENTIFIER]})(?:${$l[Hl.PRERELEASE]})?${$l[Hl.BUILD]}?)?)?`);
    Sm("XRANGEPLAINLOOSE", `[v=\\s]*(${$l[Hl.XRANGEIDENTIFIERLOOSE]})(?:\\.(${$l[Hl.XRANGEIDENTIFIERLOOSE]})(?:\\.(${$l[Hl.XRANGEIDENTIFIERLOOSE]})(?:${$l[Hl.PRERELEASELOOSE]})?${$l[Hl.BUILD]}?)?)?`);
    Sm("XRANGE", `^${$l[Hl.GTLT]}\\s*${$l[Hl.XRANGEPLAIN]}$`);
    Sm("XRANGELOOSE", `^${$l[Hl.GTLT]}\\s*${$l[Hl.XRANGEPLAINLOOSE]}$`);
    Sm("COERCEPLAIN", `(^|[^\\d])(\\d{1,${iVr}})(?:\\.(\\d{1,${iVr}}))?(?:\\.(\\d{1,${iVr}}))?`);
    Sm("COERCE", `${$l[Hl.COERCEPLAIN]}(?:$|[^\\d])`);
    Sm("COERCEFULL", $l[Hl.COERCEPLAIN] + `(?:${$l[Hl.PRERELEASE]})?(?:${$l[Hl.BUILD]})?(?:$|[^\\d])`);
    Sm("COERCERTL", $l[Hl.COERCE], true);
    Sm("COERCERTLFULL", $l[Hl.COERCEFULL], true);
    Sm("LONETILDE", "(?:~>?)");
    Sm("TILDETRIM", `(\\s*)${$l[Hl.LONETILDE]}\\s+`, true);
    yce.tildeTrimReplace = "$1~";
    Sm("TILDE", `^${$l[Hl.LONETILDE]}${$l[Hl.XRANGEPLAIN]}$`);
    Sm("TILDELOOSE", `^${$l[Hl.LONETILDE]}${$l[Hl.XRANGEPLAINLOOSE]}$`);
    Sm("LONECARET", "(?:\\^)");
    Sm("CARETTRIM", `(\\s*)${$l[Hl.LONECARET]}\\s+`, true);
    yce.caretTrimReplace = "$1^";
    Sm("CARET", `^${$l[Hl.LONECARET]}${$l[Hl.XRANGEPLAIN]}$`);
    Sm("CARETLOOSE", `^${$l[Hl.LONECARET]}${$l[Hl.XRANGEPLAINLOOSE]}$`);
    Sm("COMPARATORLOOSE", `^${$l[Hl.GTLT]}\\s*(${$l[Hl.LOOSEPLAIN]})$|^$`);
    Sm("COMPARATOR", `^${$l[Hl.GTLT]}\\s*(${$l[Hl.FULLPLAIN]})$|^$`);
    Sm("COMPARATORTRIM", `(\\s*)${$l[Hl.GTLT]}\\s*(${$l[Hl.LOOSEPLAIN]}|${$l[Hl.XRANGEPLAIN]})`, true);
    yce.comparatorTrimReplace = "$1$2$3";
    Sm("HYPHENRANGE", `^\\s*(${$l[Hl.XRANGEPLAIN]})\\s+-\\s+(${$l[Hl.XRANGEPLAIN]})\\s*$`);
    Sm("HYPHENRANGELOOSE", `^\\s*(${$l[Hl.XRANGEPLAINLOOSE]})\\s+-\\s+(${$l[Hl.XRANGEPLAINLOOSE]})\\s*$`);
    Sm("STAR", "(<|>)?=?\\s*\\*");
    Sm("GTE0", "^\\s*>=\\s*0\\.0\\.0\\s*$");
    Sm("GTE0PRE", "^\\s*>=\\s*0\\.0\\.0-0\\s*$");
  });
  var EAn = __commonJS((sqg, bCi) => {
    var mPd = Object.freeze({
      loose: true
    });
    var fPd = Object.freeze({});
    var hPd = e => {
      if (!e) {
        return fPd;
      }
      if (typeof e !== "object") {
        return mPd;
      }
      return e;
    };
    bCi.exports = hPd;
  });
  var lVr = __commonJS((iqg, ECi) => {
    var TCi = (e, t) => {
      let n = (/^[0-9]+$/).test(e);
      let r = (/^[0-9]+$/).test(t);
      if (n && r) {
        e = +e;
        t = +t;
      }
      return e === t ? 0 : n && !r ? -1 : r && !n ? 1 : e < t ? -1 : 1;
    };
    var gPd = (e, t) => TCi(t, e);
    ECi.exports = {
      compareIdentifiers: TCi,
      rcompareIdentifiers: gPd
    };
  });
  var b2 = __commonJS((aqg, RCi) => {
    var vAn = YUt();
    var {
      MAX_LENGTH: vCi,
      MAX_SAFE_INTEGER: wAn
    } = KUt();
    var {
      safeRe: wCi,
      safeSrc: CCi,
      t: CAn
    } = bit();
    var yPd = EAn();
    var {
      compareIdentifiers: Sit
    } = lVr();
    class Rne {
      constructor(e, t) {
        if (t = yPd(t), e instanceof Rne) {
          if (e.loose === !!t.loose && e.includePrerelease === !!t.includePrerelease) {
            return e;
          } else {
            e = e.version;
          }
        } else if (typeof e !== "string") {
          throw TypeError(`Invalid version. Must be a string. Got type "${typeof e}".`);
        }
        if (e.length > vCi) {
          throw TypeError(`version is longer than ${vCi} characters`);
        }
        vAn("SemVer", e, t);
        this.options = t;
        this.loose = !!t.loose;
        this.includePrerelease = !!t.includePrerelease;
        let n = e.trim().match(t.loose ? wCi[CAn.LOOSE] : wCi[CAn.FULL]);
        if (!n) {
          throw TypeError(`Invalid Version: ${e}`);
        }
        if (this.raw = e, this.major = +n[1], this.minor = +n[2], this.patch = +n[3], this.major > wAn || this.major < 0) {
          throw TypeError("Invalid major version");
        }
        if (this.minor > wAn || this.minor < 0) {
          throw TypeError("Invalid minor version");
        }
        if (this.patch > wAn || this.patch < 0) {
          throw TypeError("Invalid patch version");
        }
        if (!n[4]) {
          this.prerelease = [];
        } else {
          this.prerelease = n[4].split(".").map(r => {
            if (/^[0-9]+$/.test(r)) {
              let o = +r;
              if (o >= 0 && o < wAn) {
                return o;
              }
            }
            return r;
          });
        }
        this.build = n[5] ? n[5].split(".") : [];
        this.format();
      }
      format() {
        if (this.version = `${this.major}.${this.minor}.${this.patch}`, this.prerelease.length) {
          this.version += `-${this.prerelease.join(".")}`;
        }
        return this.version;
      }
      toString() {
        return this.version;
      }
      compare(e) {
        if (vAn("SemVer.compare", this.version, this.options, e), !(e instanceof Rne)) {
          if (typeof e === "string" && e === this.version) {
            return 0;
          }
          e = new Rne(e, this.options);
        }
        if (e.version === this.version) {
          return 0;
        }
        return this.compareMain(e) || this.comparePre(e);
      }
      compareMain(e) {
        if (!(e instanceof Rne)) {
          e = new Rne(e, this.options);
        }
        return Sit(this.major, e.major) || Sit(this.minor, e.minor) || Sit(this.patch, e.patch);
      }
      comparePre(e) {
        if (!(e instanceof Rne)) {
          e = new Rne(e, this.options);
        }
        if (this.prerelease.length && !e.prerelease.length) {
          return -1;
        } else if (!this.prerelease.length && e.prerelease.length) {
          return 1;
        } else if (!this.prerelease.length && !e.prerelease.length) {
          return 0;
        }
        let t = 0;
        do {
          let n = this.prerelease[t];
          let r = e.prerelease[t];
          if (vAn("prerelease compare", t, n, r), n === undefined && r === undefined) {
            return 0;
          } else if (r === undefined) {
            return 1;
          } else if (n === undefined) {
            return -1;
          } else if (n === r) {
            continue;
          } else {
            return Sit(n, r);
          }
        } while (++t);
      }
      compareBuild(e) {
        if (!(e instanceof Rne)) {
          e = new Rne(e, this.options);
        }
        let t = 0;
        do {
          let n = this.build[t];
          let r = e.build[t];
          if (vAn("build compare", t, n, r), n === undefined && r === undefined) {
            return 0;
          } else if (r === undefined) {
            return 1;
          } else if (n === undefined) {
            return -1;
          } else if (n === r) {
            continue;
          } else {
            return Sit(n, r);
          }
        } while (++t);
      }
      inc(e, t, n) {
        if (e.startsWith("pre")) {
          if (!t && n === false) {
            throw Error("invalid increment argument: identifier is empty");
          }
          if (t) {
            let r = new RegExp(`^${this.options.loose ? CCi[CAn.PRERELEASELOOSE] : CCi[CAn.PRERELEASE]}$`);
            let o = `-${t}`.match(r);
            if (!o || o[1] !== t) {
              throw Error(`invalid identifier: ${t}`);
            }
          }
        }
        switch (e) {
          case "premajor":
            this.prerelease.length = 0;
            this.patch = 0;
            this.minor = 0;
            this.major++;
            this.inc("pre", t, n);
            break;
          case "preminor":
            this.prerelease.length = 0;
            this.patch = 0;
            this.minor++;
            this.inc("pre", t, n);
            break;
          case "prepatch":
            this.prerelease.length = 0;
            this.inc("patch", t, n);
            this.inc("pre", t, n);
            break;
          case "prerelease":
            if (this.prerelease.length === 0) {
              this.inc("patch", t, n);
            }
            this.inc("pre", t, n);
            break;
          case "release":
            if (this.prerelease.length === 0) {
              throw Error(`version ${this.raw} is not a prerelease`);
            }
            this.prerelease.length = 0;
            break;
          case "major":
            if (this.minor !== 0 || this.patch !== 0 || this.prerelease.length === 0) {
              this.major++;
            }
            this.minor = 0;
            this.patch = 0;
            this.prerelease = [];
            break;
          case "minor":
            if (this.patch !== 0 || this.prerelease.length === 0) {
              this.minor++;
            }
            this.patch = 0;
            this.prerelease = [];
            break;
          case "patch":
            if (this.prerelease.length === 0) {
              this.patch++;
            }
            this.prerelease = [];
            break;
          case "pre":
            {
              let r = Number(n) ? 1 : 0;
              if (this.prerelease.length === 0) {
                this.prerelease = [r];
              } else {
                let o = this.prerelease.length;
                while (--o >= 0) {
                  if (typeof this.prerelease[o] === "number") {
                    this.prerelease[o]++;
                    o = -2;
                  }
                }
                if (o === -1) {
                  if (t === this.prerelease.join(".") && n === false) {
                    throw Error("invalid increment argument: identifier already exists");
                  }
                  this.prerelease.push(r);
                }
              }
              if (t) {
                let o = [t, r];
                if (n === false) {
                  o = [t];
                }
                if (Sit(this.prerelease[0], t) === 0) {
                  if (isNaN(this.prerelease[1])) {
                    this.prerelease = o;
                  }
                } else {
                  this.prerelease = o;
                }
              }
              break;
            }
          default:
            throw Error(`invalid increment argument: ${e}`);
        }
        if (this.raw = this.format(), this.build.length) {
          this.raw += `+${this.build.join(".")}`;
        }
        return this;
      }
    }
    RCi.exports = Rne;
  });
  var q3e = __commonJS((lqg, kCi) => {
    var xCi = b2();
    var _Pd = (e, t, n = false) => {
      if (e instanceof xCi) {
        return e;
      }
      try {
        return new xCi(e, t);
      } catch (r) {
        if (!n) {
          return null;
        }
        throw r;
      }
    };
    kCi.exports = _Pd;
  });
  var ICi = __commonJS((cqg, ACi) => {
    var bPd = q3e();
    var SPd = (e, t) => {
      let n = bPd(e, t);
      return n ? n.version : null;
    };
    ACi.exports = SPd;
  });
  var OCi = __commonJS((uqg, PCi) => {
    var TPd = q3e();
    var EPd = (e, t) => {
      let n = TPd(e.trim().replace(/^[=v]+/, ""), t);
      return n ? n.version : null;
    };
    PCi.exports = EPd;
  });
  var NCi = __commonJS((dqg, MCi) => {
    var DCi = b2();
    var vPd = (e, t, n, r, o) => {
      if (typeof n === "string") {
        o = r;
        r = n;
        n = undefined;
      }
      try {
        return new DCi(e instanceof DCi ? e.version : e, n).inc(t, r, o).version;
      } catch (s) {
        return null;
      }
    };
    MCi.exports = vPd;
  });
  var UCi = __commonJS((pqg, FCi) => {
    var LCi = q3e();
    var wPd = (e, t) => {
      let n = LCi(e, null, true);
      let r = LCi(t, null, true);
      let o = n.compare(r);
      if (o === 0) {
        return null;
      }
      let s = o > 0;
      let i = s ? n : r;
      let a = s ? r : n;
      let l = !!i.prerelease.length;
      if (!!a.prerelease.length && !l) {
        if (!a.patch && !a.minor) {
          return "major";
        }
        if (a.compareMain(i) === 0) {
          if (a.minor && !a.patch) {
            return "minor";
          }
          return "patch";
        }
      }
      let u = l ? "pre" : "";
      if (n.major !== r.major) {
        return u + "major";
      }
      if (n.minor !== r.minor) {
        return u + "minor";
      }
      if (n.patch !== r.patch) {
        return u + "patch";
      }
      return "prerelease";
    };
    FCi.exports = wPd;
  });