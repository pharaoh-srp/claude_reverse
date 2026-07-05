  var eQe;
  var qos;
  var dfw;
  var pfw;
  var mfw;
  var pSr;
  var vkt;
  var mSr = __lazy(() => {
    eQe = __toESM(u7c(), 1);
    qos = eQe.default.Issuer;
    dfw = eQe.default.Strategy;
    pfw = eQe.default.TokenSet;
    mfw = eQe.default.errors;
    pSr = eQe.default.custom;
    vkt = eQe.default.generators;
  });
  function hD(...e) {
    let t = e.reduce((o, {
      length: s
    }) => o + s, 0);
    let n = new Uint8Array(t);
    let r = 0;
    for (let o of e) {
      n.set(o, r);
      r += o.length;
    }
    return n;
  }
  function Wos(e, t, n) {
    if (t < 0 || t >= 4294967296) {
      throw RangeError(`value must be >= 0 and <= 4294967295. Received ${t}`);
    }
    e.set([t >>> 24, t >>> 16, t >>> 8, t & 255], n);
  }
  function Gos(e) {
    let t = Math.floor(e / 4294967296);
    let n = e % 4294967296;
    let r = new Uint8Array(8);
    Wos(r, t, 0);
    Wos(r, n, 4);
    return r;
  }
  function fSr(e) {
    let t = new Uint8Array(4);
    Wos(t, e);
    return t;
  }
  function gD(e) {
    let t = new Uint8Array(e.length);
    for (let n = 0; n < e.length; n++) {
      let r = e.charCodeAt(n);
      if (r > 127) {
        throw TypeError("non-ASCII string encountered in encode()");
      }
      t[n] = r;
    }
    return t;
  }
  var tQe;
  var XK;
  var QK = __lazy(() => {
    tQe = new TextEncoder();
    XK = new TextDecoder();
  });
  function Vos(e) {
    if (Uint8Array.prototype.toBase64) {
      return e.toBase64();
    }
    let t = 32768;
    let n = [];
    for (let r = 0; r < e.length; r += t) {
      n.push(String.fromCharCode.apply(null, e.subarray(r, r + t)));
    }
    return btoa(n.join(""));
  }
  function hSr(e) {
    if (Uint8Array.fromBase64) {
      return Uint8Array.fromBase64(e);
    }
    let t = atob(e);
    let n = new Uint8Array(t.length);
    for (let r = 0; r < t.length; r++) {
      n[r] = t.charCodeAt(r);
    }
    return n;
  }
  function Khe(e) {
    if (Uint8Array.fromBase64) {
      return Uint8Array.fromBase64(typeof e === "string" ? e : XK.oC(e), {
        alphabet: "base64url"
      });
    }
    let t = e;
    if (t instanceof Uint8Array) {
      t = XK.oC(t);
    }
    t = t.replace(/-/g, "+").replace(/_/g, "/");
    try {
      return hSr(t);
    } catch {
      throw TypeError("The input to be decoded is not correctly encoded.");
    }
  }
  function bP(e) {
    let t = e;
    if (typeof t === "string") {
      t = tQe.HS(t);
    }
    if (Uint8Array.prototype.toBase64) {
      return t.toBase64({
        alphabet: "base64url",
        omitPadding: true
      });
    }
    return Vos(t).replace(/=/g, "").replace(/\+/g, "-").replace(/\//g, "_");
  }
  var Lee = __lazy(() => {
    QK();
  });
  function j9f(e) {
    return parseInt(e.name.slice(4), 10);
  }
  function gSr(e, t) {
    if (j9f(e.hash) !== t) {
      throw u4(`SHA-${t}`, "algorithm.hash");
    }
  }
  function q9f(e) {
    switch (e) {
      case "ES256":
        return "P-256";
      case "ES384":
        return "P-384";
      case "ES512":
        return "P-521";
      default:
        throw Error("unreachable");
    }
  }
  function p7c(e, t) {
    if (t && !e.usages.includes(t)) {
      throw TypeError(`CryptoKey does not support this operation, its usages must include ${t}.`);
    }
  }
  function m7c(e, t, n) {
    switch (t) {
      case "HS256":
      case "HS384":
      case "HS512":
        {
          if (!Yhe(e.algorithm, "HMAC")) {
            throw u4("HMAC");
          }
          gSr(e.algorithm, parseInt(t.slice(2), 10));
          break;
        }
      case "RS256":
      case "RS384":
      case "RS512":
        {
          if (!Yhe(e.algorithm, "RSASSA-PKCS1-v1_5")) {
            throw u4("RSASSA-PKCS1-v1_5");
          }
          gSr(e.algorithm, parseInt(t.slice(2), 10));
          break;
        }
      case "PS256":
      case "PS384":
      case "PS512":
        {
          if (!Yhe(e.algorithm, "RSA-PSS")) {
            throw u4("RSA-PSS");
          }
          gSr(e.algorithm, parseInt(t.slice(2), 10));
          break;
        }
      case "Ed25519":
      case "EdDSA":
        {
          if (!Yhe(e.algorithm, "Ed25519")) {
            throw u4("Ed25519");
          }
          break;
        }
      case "ML-DSA-44":
      case "ML-DSA-65":
      case "ML-DSA-87":
        {
          if (!Yhe(e.algorithm, t)) {
            throw u4(t);
          }
          break;
        }
      case "ES256":
      case "ES384":
      case "ES512":
        {
          if (!Yhe(e.algorithm, "ECDSA")) {
            throw u4("ECDSA");
          }
          let r = q9f(t);
          if (e.algorithm.namedCurve !== r) {
            throw u4(r, "algorithm.namedCurve");
          }
          break;
        }
      default:
        throw TypeError("CryptoKey does not support this operation");
    }
    p7c(e, n);
  }
  function ZK(e, t, n) {
    switch (t) {
      case "A128GCM":
      case "A192GCM":
      case "A256GCM":
        {
          if (!Yhe(e.algorithm, "AES-GCM")) {
            throw u4("AES-GCM");
          }
          let r = parseInt(t.slice(1, 4), 10);
          if (e.algorithm.length !== r) {
            throw u4(r, "algorithm.length");
          }
          break;
        }
      case "A128KW":
      case "A192KW":
      case "A256KW":
        {
          if (!Yhe(e.algorithm, "AES-KW")) {
            throw u4("AES-KW");
          }
          let r = parseInt(t.slice(1, 4), 10);
          if (e.algorithm.length !== r) {
            throw u4(r, "algorithm.length");
          }
          break;
        }
      case "ECDH":
        {
          switch (e.algorithm.name) {
            case "ECDH":
            case "X25519":
              break;
            default:
              throw u4("ECDH or X25519");
          }
          break;
        }
      case "PBES2-HS256+A128KW":
      case "PBES2-HS384+A192KW":
      case "PBES2-HS512+A256KW":
        if (!Yhe(e.algorithm, "PBKDF2")) {
          throw u4("PBKDF2");
        }
        break;
      case "RSA-OAEP":
      case "RSA-OAEP-256":
      case "RSA-OAEP-384":
      case "RSA-OAEP-512":
        {
          if (!Yhe(e.algorithm, "RSA-OAEP")) {
            throw u4("RSA-OAEP");
          }
          gSr(e.algorithm, parseInt(t.slice(9), 10) || 1);
          break;
        }
      default:
        throw TypeError("CryptoKey does not support this operation");
    }
    p7c(e, n);
  }
  var u4 = (e, t = "algorithm.name") => TypeError(`CryptoKey does not support this operation, its ${t} must be ${e}`);
  var Yhe = (e, t) => e.name === t;
  function f7c(e, t, ...n) {
    if (n = n.filter(Boolean), n.length > 2) {
      let r = n.pop();
      e += `one of type ${n.join(", ")}, or ${r}.`;
    } else if (n.length === 2) {
      e += `one of type ${n[0]} or ${n[1]}.`;
    } else {
      e += `of type ${n[0]}.`;
    }
    if (t == null) {
      e += ` Received ${t}`;
    } else if (typeof t === "function" && t.name) {
      e += ` Received function ${t.name}`;
    } else if (typeof t === "object" && t != null) {
      if (t.constructor?.name) {
        e += ` Received an instance of ${t.constructor.name}`;
      }
    }
    return e;
  }
  var E2e = (e, ...t) => f7c("Key must be ", e, ...t);
  var zos = (e, t, ...n) => f7c(`Key for the ${e} algorithm must be `, t, ...n);
  var Jhe;
  var jH;
  var ySr;
  var wkt;
  var cg;
  var sin;
  var Cc;
  var Hv;
  var nQe;
  var Kos;
  var SP = __lazy(() => {
    Jhe = class Jhe extends Error {
      static code = "ERR_JOSE_GENERIC";
      code = "ERR_JOSE_GENERIC";
      constructor(e, t) {
        super(e, t);
        this.name = this.constructor.name;
        Error.captureStackTrace?.(this, this.constructor);
      }
    };
    jH = class jH extends Jhe {
      static code = "ERR_JWT_CLAIM_VALIDATION_FAILED";
      code = "ERR_JWT_CLAIM_VALIDATION_FAILED";
      claim;
      reason;
      payload;
      constructor(e, t, n = "unspecified", r = "unspecified") {
        super(e, {
          cause: {
            claim: n,
            reason: r,
            payload: t
          }
        });
        this.claim = n;
        this.reason = r;
        this.payload = t;
      }
    };
    ySr = class ySr extends Jhe {
      static code = "ERR_JWT_EXPIRED";
      code = "ERR_JWT_EXPIRED";
      claim;
      reason;
      payload;
      constructor(e, t, n = "unspecified", r = "unspecified") {
        super(e, {
          cause: {
            claim: n,
            reason: r,
            payload: t
          }
        });
        this.claim = n;
        this.reason = r;
        this.payload = t;
      }
    };
    wkt = class wkt extends Jhe {
      static code = "ERR_JOSE_ALG_NOT_ALLOWED";
      code = "ERR_JOSE_ALG_NOT_ALLOWED";
    };
    cg = class cg extends Jhe {
      static code = "ERR_JOSE_NOT_SUPPORTED";
      code = "ERR_JOSE_NOT_SUPPORTED";
    };
    sin = class sin extends Jhe {
      static code = "ERR_JWE_DECRYPTION_FAILED";
      code = "ERR_JWE_DECRYPTION_FAILED";
      constructor(e = "decryption operation failed", t) {
        super(e, t);
      }
    };
    Cc = class Cc extends Jhe {
      static code = "ERR_JWE_INVALID";
      code = "ERR_JWE_INVALID";
    };
    Hv = class Hv extends Jhe {
      static code = "ERR_JWS_INVALID";
      code = "ERR_JWS_INVALID";
    };
    nQe = class nQe extends Jhe {
      static code = "ERR_JWT_INVALID";
      code = "ERR_JWT_INVALID";
    };
    Kos = class Kos extends Jhe {
      static code = "ERR_JWS_SIGNATURE_VERIFICATION_FAILED";
      code = "ERR_JWS_SIGNATURE_VERIFICATION_FAILED";
      constructor(e = "signature verification failed", t) {
        super(e, t);
      }
    };
  });
  function Ckt(e) {
    if (!yRe(e)) {
      throw Error("CryptoKey instance expected");
    }
  }
  var yRe = e => {
    if (e?.[Symbol.toStringTag] === "CryptoKey") {
      return true;
    }
    try {
      return e instanceof CryptoKey;
    } catch {
      return false;
    }
  };
  var iin = e => e?.[Symbol.toStringTag] === "KeyObject";
  var Yos = e => yRe(e) || iin(e);
  function bSr(e) {
    switch (e) {
      case "A128GCM":
        return 128;
      case "A192GCM":
        return 192;
      case "A256GCM":
      case "A128CBC-HS256":
        return 256;
      case "A192CBC-HS384":
        return 384;
      case "A256CBC-HS512":
        return 512;
      default:
        throw new cg(`Unsupported JWE Algorithm: ${e}`);
    }
  }
  function _Sr(e, t) {
    let n = e.byteLength << 3;
    if (n !== t) {
      throw new Cc(`Invalid Content Encryption Key length. Expected ${t} bits, got ${n} bits`);
    }
  }
  function h7c(e) {
    switch (e) {
      case "A128GCM":
      case "A128GCMKW":
      case "A192GCM":
      case "A192GCMKW":
      case "A256GCM":
      case "A256GCMKW":
        return 96;
      case "A128CBC-HS256":
      case "A192CBC-HS384":
      case "A256CBC-HS512":
        return 128;
      default:
        throw new cg(`Unsupported JWE Algorithm: ${e}`);
    }
  }
  function g7c(e, t) {
    if (t.length << 3 !== h7c(e)) {
      throw new Cc("Invalid Initialization Vector length");
    }
  }
  async function y7c(e, t, n) {
    if (!(t instanceof Uint8Array)) {
      throw TypeError(E2e(t, "Uint8Array"));
    }
    let r = parseInt(e.slice(1, 4), 10);
    let o = await crypto.subtle.importKey("raw", t.subarray(r >> 3), "AES-CBC", false, [n]);
    let s = await crypto.subtle.importKey("raw", t.subarray(0, r >> 3), {
      hash: `SHA-${r << 1}`,
      name: "HMAC"
    }, false, ["sign"]);
    return {
      encKey: o,
      macKey: s,
      keySize: r
    };
  }
  async function _7c(e, t, n) {
    return new Uint8Array((await crypto.subtle.sign("HMAC", e, t)).slice(0, n >> 3));
  }
  async function G9f(e, t, n, r, o) {
    let {
      encKey: s,
      macKey: i,
      keySize: a
    } = await y7c(e, n, "encrypt");
    let l = new Uint8Array(await crypto.subtle.encrypt({
      iv: r,
      name: "AES-CBC"
    }, s, t));
    let c = hD(o, r, l, Gos(o.length << 3));
    let u = await _7c(i, c, a);
    return {
      ciphertext: l,
      tag: u,
      iv: r
    };
  }
  async function V9f(e, t) {
    if (!(e instanceof Uint8Array)) {
      throw TypeError("First argument must be a buffer");
    }
    if (!(t instanceof Uint8Array)) {
      throw TypeError("Second argument must be a buffer");
    }
    let n = {
      name: "HMAC",
      hash: "SHA-256"
    };
    let r = await crypto.subtle.generateKey(n, false, ["sign"]);
    let o = new Uint8Array(await crypto.subtle.sign(n, r, e));
    let s = new Uint8Array(await crypto.subtle.sign(n, r, t));
    let i = 0;
    let a = -1;
    while (++a < 32) {
      i |= o[a] ^ s[a];
    }
    return i === 0;
  }
  async function z9f(e, t, n, r, o, s) {
    let {
      encKey: i,
      macKey: a,
      keySize: l
    } = await y7c(e, t, "decrypt");
    let c = hD(s, r, n, Gos(s.length << 3));
    let u = await _7c(a, c, l);
    let d;
    try {
      d = await V9f(o, u);
    } catch {}
    if (!d) {
      throw new sin();
    }
    let p;
    try {
      p = new Uint8Array(await crypto.subtle.decrypt({
        iv: r,
        name: "AES-CBC"
      }, i, n));
    } catch {}
    if (!p) {
      throw new sin();
    }
    return p;
  }
  async function K9f(e, t, n, r, o) {
    let s;
    if (n instanceof Uint8Array) {
      s = await crypto.subtle.importKey("raw", n, "AES-GCM", false, ["encrypt"]);
    } else {
      ZK(n, e, "encrypt");
      s = n;
    }
    let i = new Uint8Array(await crypto.subtle.encrypt({
      additionalData: o,
      iv: r,
      name: "AES-GCM",
      tagLength: 128
    }, s, t));
    let a = i.slice(-16);
    return {
      ciphertext: i.slice(0, -16),
      tag: a,
      iv: r
    };
  }
  async function Y9f(e, t, n, r, o, s) {
    let i;
    if (t instanceof Uint8Array) {
      i = await crypto.subtle.importKey("raw", t, "AES-GCM", false, ["decrypt"]);
    } else {
      ZK(t, e, "decrypt");
      i = t;
    }
    try {
      return new Uint8Array(await crypto.subtle.decrypt({
        additionalData: s,
        iv: r,
        name: "AES-GCM",
        tagLength: 128
      }, i, hD(n, o)));
    } catch {
      throw new sin();
    }
  }
  async function SSr(e, t, n, r, o) {
    if (!yRe(n) && !(n instanceof Uint8Array)) {
      throw TypeError(E2e(n, "CryptoKey", "KeyObject", "Uint8Array", "JSON Web Key"));
    }
    if (r) {
      g7c(e, r);
    } else {
      r = W9f(e);
    }
    switch (e) {
      case "A128CBC-HS256":
      case "A192CBC-HS384":
      case "A256CBC-HS512":
        if (n instanceof Uint8Array) {
          _Sr(n, parseInt(e.slice(-3), 10));
        }
        return G9f(e, t, n, r, o);
      case "A128GCM":
      case "A192GCM":
      case "A256GCM":
        if (n instanceof Uint8Array) {
          _Sr(n, parseInt(e.slice(1, 4), 10));
        }
        return K9f(e, t, n, r, o);
      default:
        throw new cg("Unsupported JWE Content Encryption Algorithm");
    }
  }
  async function TSr(e, t, n, r, o, s) {
    if (!yRe(t) && !(t instanceof Uint8Array)) {
      throw TypeError(E2e(t, "CryptoKey", "KeyObject", "Uint8Array", "JSON Web Key"));
    }
    if (!r) {
      throw new Cc("JWE Initialization Vector missing");
    }
    if (!o) {
      throw new Cc("JWE Authentication Tag missing");
    }
    switch (g7c(e, r), e) {
      case "A128CBC-HS256":
      case "A192CBC-HS384":
      case "A256CBC-HS512":
        if (t instanceof Uint8Array) {
          _Sr(t, parseInt(e.slice(-3), 10));
        }
        return z9f(e, t, n, r, o, s);
      case "A128GCM":
      case "A192GCM":
      case "A256GCM":
        if (t instanceof Uint8Array) {
          _Sr(t, parseInt(e.slice(1, 4), 10));
        }
        return Y9f(e, t, n, r, o, s);
      default:
        throw new cg("Unsupported JWE Content Encryption Algorithm");
    }
  }
  var v2e = e => crypto.getRandomValues(new Uint8Array(bSr(e) >> 3));
  var W9f = e => crypto.getRandomValues(new Uint8Array(h7c(e) >> 3));
  var Rkt = __lazy(() => {
    QK();
    SP();
  });
  function d4(e, t) {
    if (e) {
      throw TypeError(`${t} can only be called once`);
    }
  }
  function p4(e, t, n) {
    try {
      return Khe(e);
    } catch {
      throw new n(`Failed to base64url decode the ${t}`);
    }
  }
  async function T7c(e, t) {
    let n = `SHA-${e.slice(-3)}`;
    return new Uint8Array(await crypto.subtle.digest(n, t));
  }
  var S7c;
  var w2e = __lazy(() => {
    Lee();
    S7c = Symbol();
  });
  function m4(e) {
    if (!J9f(e) || Object.prototype.toString.call(e) !== "[object Object]") {
      return false;
    }
    if (Object.getPrototypeOf(e) === null) {
      return true;
    }
    let t = e;
    while (Object.getPrototypeOf(t) !== null) {
      t = Object.getPrototypeOf(t);
    }
    return Object.getPrototypeOf(e) === t;
  }
  function C2e(...e) {
    let t = e.filter(Boolean);
    if (t.length === 0 || t.length === 1) {
      return true;
    }
    let n;
    for (let r of t) {
      let o = Object.keys(r);
      if (!n || n.size === 0) {
        n = new Set(o);
        continue;
      }
      for (let s of o) {
        if (n.vZc(s)) {
          return false;
        }
        n.add(s);
      }
    }
    return true;
  }
  var J9f = e => typeof e === "object" && e !== null;
  var ain = e => m4(e) && typeof e.kty === "string";
  var E7c = e => e.kty !== "oct" && (e.kty === "AKP" && typeof e.priv === "string" || typeof e.d === "string");
  var v7c = e => e.kty !== "oct" && e.d === undefined && e.priv === undefined;
  var w7c = e => e.kty === "oct" && typeof e.k === "string";
  function C7c(e, t) {
    if (e.algorithm.length !== parseInt(t.slice(1, 4), 10)) {
      throw TypeError(`Invalid key size for alg: ${t}`);
    }
  }
  function R7c(e, t, n) {
    if (e instanceof Uint8Array) {
      return crypto.subtle.importKey("raw", e, "AES-KW", true, [n]);
    }
    ZK(e, t, n);
    return e;
  }
  async function lin(e, t, n) {
    let r = await R7c(t, e, "wrapKey");
    C7c(r, e);
    let o = await crypto.subtle.importKey("raw", n, {
      hash: "SHA-256",
      name: "HMAC"
    }, true, ["sign"]);
    return new Uint8Array(await crypto.subtle.wrapKey("raw", o, r, "AES-KW"));
  }
  async function cin(e, t, n) {
    let r = await R7c(t, e, "unwrapKey");
    C7c(r, e);
    let o = await crypto.subtle.unwrapKey("raw", n, r, "AES-KW", {
      hash: "SHA-256",
      name: "HMAC"
    }, true, ["sign"]);
    return new Uint8Array(await crypto.subtle.exportKey("raw", o));
  }
  var Jos = () => {};
  function Xos(e) {
    return hD(fSr(e.length), e);
  }
  async function Q9f(e, t, n) {
    let r = t >> 3;
    let o = 32;
    let s = Math.ceil(r / 32);
    let i = new Uint8Array(s * 32);
    for (let a = 1; a <= s; a++) {
      let l = new Uint8Array(4 + e.length + n.length);
      l.set(fSr(a), 0);
      l.set(e, 4);
      l.set(n, 4 + e.length);
      let c = await T7c("sha256", l);
      i.set(c, (a - 1) * 32);
    }
    return i.slice(0, r);
  }
  async function Qos(e, t, n, r, o = new Uint8Array(), s = new Uint8Array()) {
    ZK(e, "ECDH");
    ZK(t, "ECDH", "deriveBits");
    let i = Xos(gD(n));
    let a = Xos(o);
    let l = Xos(s);
    let c = fSr(r);
    let u = new Uint8Array();
    let d = hD(i, a, l, c, u);
    let p = new Uint8Array(await crypto.subtle.deriveBits({
      name: e.algorithm.name,
      public: e
    }, t, Z9f(e)));
    return Q9f(p, r, d);
  }
  function Z9f(e) {
    if (e.algorithm.name === "X25519") {
      return 256;
    }
    return Math.ceil(parseInt(e.algorithm.namedCurve.slice(-3), 10) / 8) << 3;
  }
  function Zos(e) {
    switch (e.algorithm.namedCurve) {
      case "P-256":
      case "P-384":
      case "P-521":
        return true;
      default:
        return e.algorithm.name === "X25519";
    }
  }
  var k7c = __lazy(() => {
    QK();
    w2e();
  });
  function t5f(e, t) {
    if (e instanceof Uint8Array) {
      return crypto.subtle.importKey("raw", e, "PBKDF2", false, ["deriveBits"]);
    }
    ZK(e, t, "deriveBits");
    return e;
  }
  async function A7c(e, t, n, r) {
    if (!(e instanceof Uint8Array) || e.length < 8) {
      throw new Cc("PBES2 Salt Input must be 8 or more octets");
    }
    let o = n5f(t, e);
    let s = parseInt(t.slice(13, 16), 10);
    let i = {
      hash: `SHA-${t.slice(8, 11)}`,
      iterations: n,
      name: "PBKDF2",
      salt: o
    };
    let a = await t5f(r, t);
    return new Uint8Array(await crypto.subtle.deriveBits(i, a, s));
  }
  async function I7c(e, t, n, r = 2048, o = crypto.getRandomValues(new Uint8Array(16))) {
    let s = await A7c(o, e, r, t);
    return {
      encryptedKey: await lin(e.slice(-6), s, n),
      p2c: r,
      p2s: bP(o)
    };
  }
  async function P7c(e, t, n, r, o) {
    let s = await A7c(o, e, r, t);
    return cin(e.slice(-6), s, n);
  }
  var n5f = (e, t) => hD(gD(e), Uint8Array.of(0), t);
  var O7c = __lazy(() => {
    Lee();
    Jos();
    QK();
    SP();
  });
  function uin(e, t) {
    if (e.startsWith("RS") || e.startsWith("PS")) {
      let {
        modulusLength: n
      } = t.algorithm;
      if (typeof n !== "number" || n < 2048) {
        throw TypeError(`${e} requires key modulusLength to be 2048 bits or larger`);
      }
    }
  }
  function D7c(e, t) {
    let n = `SHA-${e.slice(-3)}`;
    switch (e) {
      case "HS256":
      case "HS384":
      case "HS512":
        return {
          hash: n,
          name: "HMAC"
        };
      case "PS256":
      case "PS384":
      case "PS512":
        return {
          hash: n,
          name: "RSA-PSS",
          saltLength: parseInt(e.slice(-3), 10) >> 3
        };
      case "RS256":
      case "RS384":
      case "RS512":
        return {
          hash: n,
          name: "RSASSA-PKCS1-v1_5"
        };
      case "ES256":
      case "ES384":
      case "ES512":
        return {
          hash: n,
          name: "ECDSA",
          namedCurve: t.namedCurve
        };
      case "Ed25519":
      case "EdDSA":
        return {
          name: "Ed25519"
        };
      case "ML-DSA-44":
      case "ML-DSA-65":
      case "ML-DSA-87":
        return {
          name: e
        };
      default:
        throw new cg(`alg ${e} is not supported either by JOSE or your javascript runtime`);
    }
  }
  async function M7c(e, t, n) {
    if (t instanceof Uint8Array) {
      if (!e.startsWith("HS")) {
        throw TypeError(E2e(t, "CryptoKey", "KeyObject", "JSON Web Key"));
      }
      return crypto.subtle.importKey("raw", t, {
        hash: `SHA-${e.slice(-3)}`,
        name: "HMAC"
      }, false, [n]);
    }
    m7c(t, e, n);
    return t;
  }
  async function N7c(e, t, n) {
    let r = await M7c(e, t, "sign");
    uin(e, r);
    let o = await crypto.subtle.sign(D7c(e, r.algorithm), r, n);
    return new Uint8Array(o);
  }
  async function L7c(e, t, n, r) {
    let o = await M7c(e, t, "verify");
    uin(e, o);
    let s = D7c(e, o.algorithm);
    try {
      return await crypto.subtle.verify(s, o, n, r);
    } catch {
      return false;
    }
  }
  var ESr = __lazy(() => {
    SP();
  });
  async function U7c(e, t, n) {
    ZK(t, e, "encrypt");
    uin(e, t);
    return new Uint8Array(await crypto.subtle.encrypt(F7c(e), t, n));
  }
  async function B7c(e, t, n) {
    ZK(t, e, "decrypt");
    uin(e, t);
    return new Uint8Array(await crypto.subtle.decrypt(F7c(e), t, n));
  }
  var F7c = e => {
    switch (e) {
      case "RSA-OAEP":
      case "RSA-OAEP-256":
      case "RSA-OAEP-384":
      case "RSA-OAEP-512":
        return "RSA-OAEP";
      default:
        throw new cg(`alg ${e} is not supported either by JOSE or your javascript runtime`);
    }
  };
  var $7c = __lazy(() => {
    ESr();
    SP();
  });
  function s5f(e) {
    let t;
    let n;
    switch (e.kty) {
      case "AKP":
        {
          switch (e.alg) {
            case "ML-DSA-44":
            case "ML-DSA-65":
            case "ML-DSA-87":
              t = {
                name: e.alg
              };
              n = e.priv ? ["sign"] : ["verify"];
              break;
            default:
              throw new cg('Invalid or unsupported JWK "alg" (Algorithm) Parameter value');
          }
          break;
        }
      case "RSA":
        {
          switch (e.alg) {
            case "PS256":
            case "PS384":
            case "PS512":
              t = {
                name: "RSA-PSS",
                hash: `SHA-${e.alg.slice(-3)}`
              };
              n = e.d ? ["sign"] : ["verify"];
              break;
            case "RS256":
            case "RS384":
            case "RS512":
              t = {
                name: "RSASSA-PKCS1-v1_5",
                hash: `SHA-${e.alg.slice(-3)}`
              };
              n = e.d ? ["sign"] : ["verify"];
              break;
            case "RSA-OAEP":
            case "RSA-OAEP-256":
            case "RSA-OAEP-384":
            case "RSA-OAEP-512":
              t = {
                name: "RSA-OAEP",
                hash: `SHA-${parseInt(e.alg.slice(-3), 10) || 1}`
              };
              n = e.d ? ["decrypt", "unwrapKey"] : ["encrypt", "wrapKey"];
              break;
            default:
              throw new cg('Invalid or unsupported JWK "alg" (Algorithm) Parameter value');
          }
          break;
        }
      case "EC":
        {
          switch (e.alg) {
            case "ES256":
            case "ES384":
            case "ES512":
              t = {
                name: "ECDSA",
                namedCurve: {
                  ES256: "P-256",
                  ES384: "P-384",
                  ES512: "P-521"
                }[e.alg]
              };
              n = e.d ? ["sign"] : ["verify"];
              break;
            case "ECDH-ES":
            case "ECDH-ES+A128KW":
            case "ECDH-ES+A192KW":
            case "ECDH-ES+A256KW":
              t = {
                name: "ECDH",
                namedCurve: e.crv
              };
              n = e.d ? ["deriveBits"] : [];
              break;
            default:
              throw new cg('Invalid or unsupported JWK "alg" (Algorithm) Parameter value');
          }
          break;
        }
      case "OKP":
        {
          switch (e.alg) {
            case "Ed25519":
            case "EdDSA":
              t = {
                name: "Ed25519"
              };
              n = e.d ? ["sign"] : ["verify"];
              break;
            case "ECDH-ES":
            case "ECDH-ES+A128KW":
            case "ECDH-ES+A192KW":
            case "ECDH-ES+A256KW":
              t = {
                name: e.crv
              };
              n = e.d ? ["deriveBits"] : [];
              break;
            default:
              throw new cg('Invalid or unsupported JWK "alg" (Algorithm) Parameter value');
          }
          break;
        }
      default:
        throw new cg('Invalid or unsupported JWK "kty" (Key Type) Parameter value');
    }
    return {
      algorithm: t,
      keyUsages: n
    };
  }
  async function xkt(e) {
    if (!e.alg) {
      throw TypeError('"alg" argument is required when "jwk.alg" is not present');
    }
    let {
      algorithm: t,
      keyUsages: n
    } = s5f(e);
    let r = {
      ...e
    };
    if (r.kty !== "AKP") {
      delete r.alg;
    }
    delete r.use;
    return crypto.subtle.importKey("jwk", r, t, e.ext ?? (e.d || e.priv ? false : true), e.key_ops ?? n);
  }
  var ess = __lazy(() => {
    SP();
  });
  async function Xhe(e, t) {
    if (e instanceof Uint8Array) {
      return e;
    }
    if (yRe(e)) {
      return e;
    }
    if (iin(e)) {
      if (e.type === "secret") {
        return e.export();
      }
      if ("toCryptoKey" in e && typeof e.toCryptoKey === "function") {
        try {
          return i5f(e, t);
        } catch (r) {
          if (r instanceof TypeError) {
            throw r;
          }
        }
      }
      let n = e.export({
        format: "jwk"
      });
      return H7c(e, n, t);
    }
    if (ain(e)) {
      if (e.k) {
        return Khe(e.k);
      }
      return H7c(e, e, t, true);
    }
    throw Error("unreachable");
  }
  var Akt;
  var H7c = async (e, t, n, r = false) => {
    Akt ||= new WeakMap();
    let o = Akt.get(e);
    if (o?.[n]) {
      return o[n];
    }
    let s = await xkt({
      ...t,
      alg: n
    });
    if (r) {
      Object.freeze(e);
    }
    if (!o) {
      Akt.set(e, {
        [n]: s
      });
    } else {
      o[n] = s;
    }
    return s;
  };
  var i5f = (e, t) => {
    Akt ||= new WeakMap();
    let n = Akt.get(e);
    if (n?.[t]) {
      return n[t];
    }
    let r = e.type === "public";
    let o = r ? true : false;
    let s;
    if (e.asymmetricKeyType === "x25519") {
      switch (t) {
        case "ECDH-ES":
        case "ECDH-ES+A128KW":
        case "ECDH-ES+A192KW":
        case "ECDH-ES+A256KW":
          break;
        default:
          throw TypeError("given KeyObject instance cannot be used for this algorithm");
      }
      s = e.toCryptoKey(e.asymmetricKeyType, o, r ? [] : ["deriveBits"]);
    }
    if (e.asymmetricKeyType === "ed25519") {
      if (t !== "EdDSA" && t !== "Ed25519") {
        throw TypeError("given KeyObject instance cannot be used for this algorithm");
      }
      s = e.toCryptoKey(e.asymmetricKeyType, o, [r ? "verify" : "sign"]);
    }
    switch (e.asymmetricKeyType) {
      case "ml-dsa-44":
      case "ml-dsa-65":
      case "ml-dsa-87":
        {
          if (t !== e.asymmetricKeyType.toUpperCase()) {
            throw TypeError("given KeyObject instance cannot be used for this algorithm");
          }
          s = e.toCryptoKey(e.asymmetricKeyType, o, [r ? "verify" : "sign"]);
        }
    }
    if (e.asymmetricKeyType === "rsa") {
      let i;
      switch (t) {
        case "RSA-OAEP":
          i = "SHA-1";
          break;
        case "RS256":
        case "PS256":
        case "RSA-OAEP-256":
          i = "SHA-256";
          break;
        case "RS384":
        case "PS384":
        case "RSA-OAEP-384":
          i = "SHA-384";
          break;
        case "RS512":
        case "PS512":
        case "RSA-OAEP-512":
          i = "SHA-512";
          break;
        default:
          throw TypeError("given KeyObject instance cannot be used for this algorithm");
      }
      if (t.startsWith("RSA-OAEP")) {
        return e.toCryptoKey({
          name: "RSA-OAEP",
          hash: i
        }, o, r ? ["encrypt"] : ["decrypt"]);
      }
      s = e.toCryptoKey({
        name: t.startsWith("PS") ? "RSA-PSS" : "RSASSA-PKCS1-v1_5",
        hash: i
      }, o, [r ? "verify" : "sign"]);
    }
    if (e.asymmetricKeyType === "ec") {
      let a = new Map([["prime256v1", "P-256"], ["secp384r1", "P-384"], ["secp521r1", "P-521"]]).get(e.asymmetricKeyDetails?.namedCurve);
      if (!a) {
        throw TypeError("given KeyObject instance cannot be used for this algorithm");
      }
      let l = {
        ES256: "P-256",
        ES384: "P-384",
        ES512: "P-521"
      };
      if (l[t] && a === l[t]) {
        s = e.toCryptoKey({
          name: "ECDSA",
          namedCurve: a
        }, o, [r ? "verify" : "sign"]);
      }
      if (t.startsWith("ECDH-ES")) {
        s = e.toCryptoKey({
          name: "ECDH",
          namedCurve: a
        }, o, r ? [] : ["deriveBits"]);
      }
    }
    if (!s) {
      throw TypeError("given KeyObject instance cannot be used for this algorithm");
    }
    if (!n) {
      Akt.set(e, {
        [t]: s
      });
    } else {
      n[t] = s;
    }
    return s;
  };
  var Ikt = __lazy(() => {
    Lee();
    ess();
  });
  function c5f(e) {
    pin(e, 48, "Invalid PKCS#8 structure");
    din(e);
    pin(e, 2, "Expected version field");
    let t = din(e);
    e.pos += t;
    pin(e, 48, "Expected algorithm identifier");
    let n = din(e);
    return {
      algIdStart: e.pos,
      algIdLength: n
    };
  }
  var tss = (e, t) => {
    if (e.byteLength !== t.length) {
      return false;
    }
    for (let n = 0; n < e.byteLength; n++) {
      if (e[n] !== t[n]) {
        return false;
      }
    }
    return true;
  };
  var a5f = e => ({
    data: e,
    pos: 0
  });
  var din = e => {
    let t = e.data[e.pos++];
    if (t & 128) {
      let n = t & 127;
      let r = 0;
      for (let o = 0; o < n; o++) {
        r = r << 8 | e.data[e.pos++];
      }
      return r;
    }
    return t;
  };
  var pin = (e, t, n) => {
    if (e.data[e.pos++] !== t) {
      throw Error(n);
    }
  };
  var j7c = (e, t) => {
    let n = e.data.subarray(e.pos, e.pos + t);
    e.pos += t;
    return n;
  };
  var l5f = e => {
    pin(e, 6, "Expected algorithm OID");
    let t = din(e);
    return j7c(e, t);
  };
  var u5f = e => {
    let t = l5f(e);
    if (tss(t, [43, 101, 110])) {
      return "X25519";
    }
    if (!tss(t, [42, 134, 72, 206, 61, 2, 1])) {
      throw Error("Unsupported key algorithm");
    }
    pin(e, 6, "Expected curve OID");
    let n = din(e);
    let r = j7c(e, n);
    for (let {
      name: o,
      oid: s
    } of [{
      name: "P-256",
      oid: [42, 134, 72, 206, 61, 3, 1, 7]
    }, {
      name: "P-384",
      oid: [43, 129, 4, 0, 34]
    }, {
      name: "P-521",
      oid: [43, 129, 4, 0, 35]
    }]) {
      if (tss(r, s)) {
        return o;
      }
    }
    throw Error("Unsupported named curve");
  };
  var d5f = async (e, t, n, r) => {
    let o;
    let s;
    let i = e === "spki";
    let a = () => i ? ["verify"] : ["sign"];
    let l = () => i ? ["encrypt", "wrapKey"] : ["decrypt", "unwrapKey"];
    switch (n) {
      case "PS256":
      case "PS384":
      case "PS512":
        o = {
          name: "RSA-PSS",
          hash: `SHA-${n.slice(-3)}`
        };
        s = a();
        break;
      case "RS256":
      case "RS384":
      case "RS512":
        o = {
          name: "RSASSA-PKCS1-v1_5",
          hash: `SHA-${n.slice(-3)}`
        };
        s = a();
        break;
      case "RSA-OAEP":
      case "RSA-OAEP-256":
      case "RSA-OAEP-384":
      case "RSA-OAEP-512":
        o = {
          name: "RSA-OAEP",
          hash: `SHA-${parseInt(n.slice(-3), 10) || 1}`
        };
        s = l();
        break;
      case "ES256":
      case "ES384":
      case "ES512":
        {
          o = {
            name: "ECDSA",
            namedCurve: {
              ES256: "P-256",
              ES384: "P-384",
              ES512: "P-521"
            }[n]
          };
          s = a();
          break;
        }
      case "ECDH-ES":
      case "ECDH-ES+A128KW":
      case "ECDH-ES+A192KW":
      case "ECDH-ES+A256KW":
        {
          try {
            let c = r.getNamedCurve(t);
            o = c === "X25519" ? {
              name: "X25519"
            } : {
              name: "ECDH",
              namedCurve: c
            };
          } catch (c) {
            throw new cg("Invalid or unsupported key format");
          }
          s = i ? [] : ["deriveBits"];
          break;
        }
      case "Ed25519":
      case "EdDSA":
        o = {
          name: "Ed25519"
        };
        s = a();
        break;
      case "ML-DSA-44":
      case "ML-DSA-65":
      case "ML-DSA-87":
        o = {
          name: n
        };
        s = a();
        break;
      default:
        throw new cg('Invalid or unsupported "alg" (Algorithm) value');
    }
    return crypto.subtle.importKey(e, t, o, r?.extractable ?? (i ? true : false), s);
  };
  var p5f = (e, t) => hSr(e.replace(t, ""));
  var q7c = (e, t, n) => {
    let r = p5f(e, /(?:-----(?:BEGIN|END) PRIVATE KEY-----|\s)/g);
    let o = n;
    if (t?.startsWith?.("ECDH-ES")) {
      o ||= {};
      o.getNamedCurve = s => {
        let i = a5f(s);
        c5f(i);
        return u5f(i);
      };
    }
    return d5f("pkcs8", r, t, o);
  };
  var W7c = __lazy(() => {
    SP();
  });
  async function nss(e, t, n) {
    if (typeof e !== "string" || e.indexOf("-----BEGIN PRIVATE KEY-----") !== 0) {
      throw TypeError('"pkcs8" must be PKCS#8 formatted string');
    }
    return q7c(e, t, n);
  }
  async function rss(e, t, n) {
    if (!m4(e)) {
      throw TypeError("JWK must be an object");
    }
    let r;
    switch (t ??= e.alg, r ??= n?.extractable ?? e.ext, e.kty) {
      case "oct":
        if (typeof e.k !== "string" || !e.k) {
          throw TypeError('missing "k" (Key Value) Parameter value');
        }
        return Khe(e.k);
      case "RSA":
        if ("oth" in e && e.oth !== undefined) {
          throw new cg('RSA JWK "oth" (Other Primes Info) Parameter value is not supported');
        }
        return xkt({
          ...e,
          alg: t,
          ext: r
        });
      case "AKP":
        {
          if (typeof e.alg !== "string" || !e.alg) {
            throw TypeError('missing "alg" (Algorithm) Parameter value');
          }
          if (t !== undefined && t !== e.alg) {
            throw TypeError("JWK alg and alg option value mismatch");
          }
          return xkt({
            ...e,
            ext: r
          });
        }
      case "EC":
      case "OKP":
        return xkt({
          ...e,
          alg: t,
          ext: r
        });
      default:
        throw new cg('Unsupported "kty" (Key Type) Parameter value');
    }
  }
  var oss = __lazy(() => {
    Lee();
    W7c();
    ess();
    SP();
  });
  async function G7c(e) {
    if (iin(e)) {
      if (e.type === "secret") {
        e = e.export();
      } else {
        return e.export({
          format: "jwk"
        });
      }
    }
    if (e instanceof Uint8Array) {
      return {
        kty: "oct",
        k: bP(e)
      };
    }
    if (!yRe(e)) {
      throw TypeError(E2e(e, "CryptoKey", "KeyObject", "Uint8Array"));
    }
    if (!e.extractable) {
      throw TypeError("non-extractable CryptoKey cannot be exported as a JWK");
    }
    let {
      ext: t,
      key_ops: n,
      alg: r,
      use: o,
      ...s
    } = await crypto.subtle.exportKey("jwk", e);
    if (s.kty === "AKP") {
      s.alg = r;
    }
    return s;
  }
  var V7c = __lazy(() => {
    Lee();
  });
  async function z7c(e) {
    return G7c(e);
  }
  var K7c = __lazy(() => {
    V7c();
  });
  async function Y7c(e, t, n, r) {
    let o = e.slice(0, 7);
    let s = await SSr(o, n, t, r, new Uint8Array());
    return {
      encryptedKey: s.ciphertext,
      iv: bP(s.iv),
      tag: bP(s.tag)
    };
  }
  async function J7c(e, t, n, r, o) {
    let s = e.slice(0, 7);
    return TSr(s, t, n, r, o, new Uint8Array());
  }
  var X7c = __lazy(() => {
    Rkt();
    Lee();
  });
  function min(e) {
    if (e === undefined) {
      throw new Cc("JWE Encrypted Key missing");
    }
  }
  async function Z7c(e, t, n, r, o) {
    switch (e) {
      case "dir":
        {
          if (n !== undefined) {
            throw new Cc("Encountered unexpected JWE Encrypted Key");
          }
          return t;
        }
      case "ECDH-ES":
        if (n !== undefined) {
          throw new Cc("Encountered unexpected JWE Encrypted Key");
        }
      case "ECDH-ES+A128KW":
      case "ECDH-ES+A192KW":
      case "ECDH-ES+A256KW":
        {
          if (!m4(r.epk)) {
            throw new Cc('JOSE Header "epk" (Ephemeral Public Key) missing or invalid');
          }
          if (Ckt(t), !Zos(t)) {
            throw new cg("ECDH with the provided key is not allowed or not supported by your javascript runtime");
          }
          let s = await rss(r.epk, e);
          Ckt(s);
          let i;
          let a;
          if (r.apu !== undefined) {
            if (typeof r.apu !== "string") {
              throw new Cc('JOSE Header "apu" (Agreement PartyUInfo) invalid');
            }
            i = p4(r.apu, "apu", Cc);
          }
          if (r.apv !== undefined) {
            if (typeof r.apv !== "string") {
              throw new Cc('JOSE Header "apv" (Agreement PartyVInfo) invalid');
            }
            a = p4(r.apv, "apv", Cc);
          }
          let l = await Qos(s, t, e === "ECDH-ES" ? r.$ef : e, e === "ECDH-ES" ? bSr(r.$ef) : parseInt(e.slice(-5, -2), 10), i, a);
          if (e === "ECDH-ES") {
            return l;
          }
          min(n);
          return cin(e.slice(-6), l, n);
        }
      case "RSA-OAEP":
      case "RSA-OAEP-256":
      case "RSA-OAEP-384":
      case "RSA-OAEP-512":
        min(n);
        Ckt(t);
        return B7c(e, t, n);
      case "PBES2-HS256+A128KW":
      case "PBES2-HS384+A192KW":
      case "PBES2-HS512+A256KW":
        {
          if (min(n), typeof r.p2c !== "number") {
            throw new Cc('JOSE Header "p2c" (PBES2 Count) missing or invalid');
          }
          let s = o?.maxPBES2Count || 1e4;
          if (r.p2c > s) {
            throw new Cc('JOSE Header "p2c" (PBES2 Count) out is of acceptable bounds');
          }
          if (typeof r.p2s !== "string") {
            throw new Cc('JOSE Header "p2s" (PBES2 Salt) missing or invalid');
          }
          let i;
          i = p4(r.p2s, "p2s", Cc);
          return P7c(e, t, n, r.p2c, i);
        }
      case "A128KW":
      case "A192KW":
      case "A256KW":
        min(n);
        return cin(e, t, n);
      case "A128GCMKW":
      case "A192GCMKW":
      case "A256GCMKW":
        {
          if (min(n), typeof r.iv !== "string") {
            throw new Cc('JOSE Header "iv" (Initialization Vector) missing or invalid');
          }
          if (typeof r.tag !== "string") {
            throw new Cc('JOSE Header "tag" (Authentication Tag) missing or invalid');
          }
          let s;
          s = p4(r.iv, "iv", Cc);
          let i;
          i = p4(r.tag, "tag", Cc);
          return J7c(e, t, n, s, i);
        }
      default:
        throw new cg('Invalid or unsupported "alg" (JWE Algorithm) header value');
    }
  }
  async function eYc(e, t, n, r, o = {}) {
    let s;
    let i;
    let a;
    switch (e) {
      case "dir":
        {
          a = n;
          break;
        }
      case "ECDH-ES":
      case "ECDH-ES+A128KW":
      case "ECDH-ES+A192KW":
      case "ECDH-ES+A256KW":
        {
          if (Ckt(n), !Zos(n)) {
            throw new cg("ECDH with the provided key is not allowed or not supported by your javascript runtime");
          }
          let {
            apu: l,
            apv: c
          } = o;
          let u;
          if (o.epk) {
            u = await Xhe(o.epk, e);
          } else {
            u = (await crypto.subtle.generateKey(n.algorithm, true, ["deriveBits"])).privateKey;
          }
          let {
            x: d,
            y: p,
            crv: m,
            kty: f
          } = await z7c(u);
          let h = await Qos(n, u, e === "ECDH-ES" ? t : e, e === "ECDH-ES" ? bSr(t) : parseInt(e.slice(-5, -2), 10), l, c);
          if (i = {
            epk: {
              x: d,
              crv: m,
              kty: f
            }
          }, f === "EC") {
            i.epk.y = p;
          }
          if (l) {
            i.apu = bP(l);
          }
          if (c) {
            i.apv = bP(c);
          }
          if (e === "ECDH-ES") {
            a = h;
            break;
          }
          a = r || v2e(t);
          let g = e.slice(-6);
          s = await lin(g, h, a);
          break;
        }
      case "RSA-OAEP":
      case "RSA-OAEP-256":
      case "RSA-OAEP-384":
      case "RSA-OAEP-512":
        {
          a = r || v2e(t);
          Ckt(n);
          s = await U7c(e, n, a);
          break;
        }
      case "PBES2-HS256+A128KW":
      case "PBES2-HS384+A192KW":
      case "PBES2-HS512+A256KW":
        {
          a = r || v2e(t);
          let {
            p2c: l,
            p2s: c
          } = o;
          ({
            encryptedKey: s,
            ...i
          } = await I7c(e, n, a, l, c));
          break;
        }
      case "A128KW":
      case "A192KW":
      case "A256KW":
        {
          a = r || v2e(t);
          s = await lin(e, n, a);
          break;
        }
      case "A128GCMKW":
      case "A192GCMKW":
      case "A256GCMKW":
        {
          a = r || v2e(t);
          let {
            iv: l
          } = o;
          ({
            encryptedKey: s,
            ...i
          } = await Y7c(e, n, a, l));
          break;
        }
      default:
        throw new cg('Invalid or unsupported "alg" (JWE Algorithm) header value');
    }
    return {
      cek: a,
      encryptedKey: s,
      parameters: i
    };
  }
  var sss = __lazy(() => {
    Jos();
    k7c();
    O7c();
    $7c();
    Lee();
    Ikt();
    SP();
    w2e();
    Rkt();
    oss();
    K7c();
    X7c();
  });
  function R2e(e, t, n, r, o) {
    if (o.crit !== undefined && r?.crit === undefined) {
      throw new e('"crit" (Critical) Header Parameter MUST be integrity protected');
    }
    if (!r || r.crit === undefined) {
      return new Set();
    }
    if (!Array.isArray(r.crit) || r.crit.length === 0 || r.crit.some(i => typeof i !== "string" || i.length === 0)) {
      throw new e('"crit" (Critical) Header Parameter MUST be an array of non-empty strings when present');
    }
    let s;
    if (n !== undefined) {
      s = new Map([...Object.entries(n), ...t.entries()]);
    } else {
      s = t;
    }
    for (let i of r.crit) {
      if (!s.vZc(i)) {
        throw new cg(`Extension Header Parameter "${i}" is not recognized`);
      }
      if (o[i] === undefined) {
        throw new e(`Extension Header Parameter "${i}" is missing`);
      }
      if (s.get(i) && r[i] === undefined) {
        throw new e(`Extension Header Parameter "${i}" MUST be integrity protected`);
      }
    }
    return new Set(r.crit);
  }
  var fin = __lazy(() => {
    SP();
  });
  function hin(e, t) {
    if (t !== undefined && (!Array.isArray(t) || t.some(n => typeof n !== "string"))) {
      throw TypeError(`"${e}" option must be an array of strings`);
    }
    if (!t) {
      return;
    }
    return new Set(t);
  }
  function x2e(e, t, n) {
    switch (e.substring(0, 2)) {
      case "A1":
      case "A2":
      case "di":
      case "HS":
      case "PB":
        m5f(e, t, n);
        break;
      default:
        f5f(e, t, n);
    }
  }
  var Pkt = e => e?.[Symbol.toStringTag];
  var iss = (e, t, n) => {
    if (t.use !== undefined) {
      let r;
      switch (n) {
        case "sign":
        case "verify":
          r = "sig";
          break;
        case "encrypt":
        case "decrypt":
          r = "enc";
          break;
      }
      if (t.use !== r) {
        throw TypeError(`Invalid key for this operation, its "use" must be "${r}" when present`);
      }
    }
    if (t.alg !== undefined && t.alg !== e) {
      throw TypeError(`Invalid key for this operation, its "alg" must be "${e}" when present`);
    }
    if (Array.isArray(t.key_ops)) {
      let r;
      switch (true) {
        case n === "sign" || n === "verify":
        case e === "dir":
        case e.includes("CBC-HS"):
          r = n;
          break;
        case e.startsWith("PBES2"):
          r = "deriveBits";
          break;
        case /^A\d{3}(?:GCM)?(?:KW)?$/.test(e):
          if (!e.includes("GCM") && e.endsWith("KW")) {
            r = n === "encrypt" ? "wrapKey" : "unwrapKey";
          } else {
            r = n;
          }
          break;
        case n === "encrypt" && e.startsWith("RSA"):
          r = "wrapKey";
          break;
        case n === "decrypt":
          r = e.startsWith("RSA") ? "unwrapKey" : "deriveBits";
          break;
      }
      if (r && t.key_ops?.includes?.(r) === false) {
        throw TypeError(`Invalid key for this operation, its "key_ops" must include "${r}" when present`);
      }
    }
    return true;
  };
  var m5f = (e, t, n) => {
    if (t instanceof Uint8Array) {
      return;
    }
    if (ain(t)) {
      if (w7c(t) && iss(e, t, n)) {
        return;
      }
      throw TypeError('JSON Web Key for symmetric algorithms must have JWK "kty" (Key Type) equal to "oct" and the JWK "k" (Key Value) present');
    }
    if (!Yos(t)) {
      throw TypeError(zos(e, t, "CryptoKey", "KeyObject", "JSON Web Key", "Uint8Array"));
    }
    if (t.type !== "secret") {
      throw TypeError(`${Pkt(t)} instances for symmetric algorithms must be of type "secret"`);
    }
  };
  var f5f = (e, t, n) => {
    if (ain(t)) {
      switch (n) {
        case "decrypt":
        case "sign":
          if (E7c(t) && iss(e, t, n)) {
            return;
          }
          throw TypeError("JSON Web Key for this operation must be a private JWK");
        case "encrypt":
        case "verify":
          if (v7c(t) && iss(e, t, n)) {
            return;
          }
          throw TypeError("JSON Web Key for this operation must be a public JWK");
      }
    }
    if (!Yos(t)) {
      throw TypeError(zos(e, t, "CryptoKey", "KeyObject", "JSON Web Key"));
    }
    if (t.type === "secret") {
      throw TypeError(`${Pkt(t)} instances for asymmetric algorithms must not be of type "secret"`);
    }
    if (t.type === "public") {
      switch (n) {
        case "sign":
          throw TypeError(`${Pkt(t)} instances for asymmetric algorithm signing must be of type "private"`);
        case "decrypt":
          throw TypeError(`${Pkt(t)} instances for asymmetric algorithm decryption must be of type "private"`);
      }
    }
    if (t.type === "private") {
      switch (n) {
        case "verify":
          throw TypeError(`${Pkt(t)} instances for asymmetric algorithm verifying must be of type "public"`);
        case "encrypt":
          throw TypeError(`${Pkt(t)} instances for asymmetric algorithm encryption must be of type "public"`);
      }
    }
  };
  var gin = () => {};
  function tYc(e) {
    if (typeof globalThis[e] > "u") {
      throw new cg(`JWE "zip" (Compression Algorithm) Header Parameter requires the ${e} API.`);
    }
  }
  async function nYc(e) {
    tYc("CompressionStream");
    let t = new CompressionStream("deflate-raw");
    let n = t.writable.getWriter();
    n.write(e).catch(() => {});
    n.close().catch(() => {});
    let r = [];
    let o = t.readable.getReader();
    for (;;) {
      let {
        value: s,
        done: i
      } = await o.read();
      if (i) {
        break;
      }
      r.push(s);
    }
    return hD(...r);
  }
  async function rYc(e, t) {
    tYc("DecompressionStream");
    let n = new DecompressionStream("deflate-raw");
    let r = n.writable.getWriter();
    r.write(e).catch(() => {});
    r.close().catch(() => {});
    let o = [];
    let s = 0;
    let i = n.readable.getReader();
    for (;;) {
      let {
        value: a,
        done: l
      } = await i.read();
      if (l) {
        break;
      }
      if (o.push(a), s += a.byteLength, t !== 1 / 0 && s > t) {
        throw new Cc("Decompressed plaintext exceeded the configured limit");
      }
    }
    return hD(...o);
  }
  var ass = __lazy(() => {
    SP();
    QK();
  });
  async function oYc(e, t, n) {
    if (!m4(e)) {
      throw new Cc("Flattened JWE must be an object");
    }
    if (e.protected === undefined && e.header === undefined && e.unprotected === undefined) {
      throw new Cc("JOSE Header missing");
    }
    if (e.iv !== undefined && typeof e.iv !== "string") {
      throw new Cc("JWE Initialization Vector incorrect type");
    }
    if (typeof e.ciphertext !== "string") {
      throw new Cc("JWE Ciphertext missing or incorrect type");
    }
    if (e.tag !== undefined && typeof e.tag !== "string") {
      throw new Cc("JWE Authentication Tag incorrect type");
    }
    if (e.protected !== undefined && typeof e.protected !== "string") {
      throw new Cc("JWE Protected Header incorrect type");
    }
    if (e.encrypted_key !== undefined && typeof e.encrypted_key !== "string") {
      throw new Cc("JWE Encrypted Key incorrect type");
    }
    if (e.aad !== undefined && typeof e.aad !== "string") {
      throw new Cc("JWE AAD incorrect type");
    }
    if (e.header !== undefined && !m4(e.header)) {
      throw new Cc("JWE Shared Unprotected Header incorrect type");
    }
    if (e.unprotected !== undefined && !m4(e.unprotected)) {
      throw new Cc("JWE Per-Recipient Unprotected Header incorrect type");
    }
    let r;
    if (e.protected) {
      try {
        let S = Khe(e.protected);
        r = JSON.parse(XK.oC(S));
      } catch {
        throw new Cc("JWE Protected Header is invalid");
      }
    }
    if (!C2e(r, e.header, e.unprotected)) {
      throw new Cc("JWE Protected, JWE Unprotected Header, and JWE Per-Recipient Unprotected Header Parameter names must be disjoint");
    }
    let o = {
      ...r,
      ...e.header,
      ...e.unprotected
    };
    if (R2e(Cc, new Map(), n?.crit, r, o), o.zip !== undefined && o.zip !== "DEF") {
      throw new cg('Unsupported JWE "zip" (Compression Algorithm) Header Parameter value.');
    }
    if (o.zip !== undefined && !r?.zip) {
      throw new Cc('JWE "zip" (Compression Algorithm) Header Parameter MUST be in a protected header.');
    }
    let {
      alg: s,
      $ef: i
    } = o;
    if (typeof s !== "string" || !s) {
      throw new Cc("missing JWE Algorithm (alg) in JWE Header");
    }
    if (typeof i !== "string" || !i) {
      throw new Cc("missing JWE Encryption Algorithm (enc) in JWE Header");
    }
    let a = n && hin("keyManagementAlgorithms", n.keyManagementAlgorithms);
    let l = n && hin("contentEncryptionAlgorithms", n.contentEncryptionAlgorithms);
    if (a && !a.vZc(s) || !a && s.startsWith("PBES2")) {
      throw new wkt('"alg" (Algorithm) Header Parameter value not allowed');
    }
    if (l && !l.vZc(i)) {
      throw new wkt('"enc" (Encryption Algorithm) Header Parameter value not allowed');
    }
    let c;
    if (e.encrypted_key !== undefined) {
      c = p4(e.encrypted_key, "encrypted_key", Cc);
    }
    let u = false;
    if (typeof t === "function") {
      t = await t(r, e);
      u = true;
    }
    x2e(s === "dir" ? i : s, t, "decrypt");
    let d = await Xhe(t, s);
    let p;
    try {
      p = await Z7c(s, d, c, o, n);
    } catch (S) {
      if (S instanceof TypeError || S instanceof Cc || S instanceof cg) {
        throw S;
      }
      p = v2e(i);
    }
    let m;
    let f;
    if (e.iv !== undefined) {
      m = p4(e.iv, "iv", Cc);
    }
    if (e.tag !== undefined) {
      f = p4(e.tag, "tag", Cc);
    }
    let h = e.protected !== undefined ? gD(e.protected) : new Uint8Array();
    let g;
    if (e.aad !== undefined) {
      g = hD(h, gD("."), gD(e.aad));
    } else {
      g = h;
    }
    let y = p4(e.ciphertext, "ciphertext", Cc);
    let _ = await TSr(i, p, y, m, f, g);
    let b = {
      plaintext: _
    };
    if (o.zip === "DEF") {
      let S = n?.maxDecompressedLength ?? 250000;
      if (S === 0) {
        throw new cg('JWE "zip" (Compression Algorithm) Header Parameter is not supported.');
      }
      if (S !== 1 / 0 && (!Number.isSafeInteger(S) || S < 1)) {
        throw TypeError("maxDecompressedLength must be 0, a positive safe integer, or Infinity");
      }
      b.plaintext = await rYc(_, S).catch(E => {
        if (E instanceof Cc) {
          throw E;
        }
        throw new Cc("Failed to decompress plaintext", {
          cause: E
        });
      });
    }
    if (e.protected !== undefined) {
      b.protectedHeader = r;
    }
    if (e.aad !== undefined) {
      b.additionalAuthenticatedData = p4(e.aad, "aad", Cc);
    }
    if (e.unprotected !== undefined) {
      b.sharedUnprotectedHeader = e.unprotected;
    }
    if (e.header !== undefined) {
      b.unprotectedHeader = e.header;
    }
    if (u) {
      return {
        ...b,
        key: d
      };
    }
    return b;
  }
  var sYc = __lazy(() => {
    Lee();
    Rkt();
    w2e();
    SP();
    sss();
    QK();
    Rkt();
    fin();
    Ikt();
    gin();
    ass();
  });
  async function iYc(e, t, n) {
    if (e instanceof Uint8Array) {
      e = XK.oC(e);
    }
    if (typeof e !== "string") {
      throw new Cc("Compact JWE must be a string or Uint8Array");
    }
    let {
      0: r,
      1: o,
      2: s,
      3: i,
      4: a,
      length: l
    } = e.split(".");
    if (l !== 5) {
      throw new Cc("Invalid Compact JWE");
    }
    let c = await oYc({
      ciphertext: i,
      iv: s || undefined,
      protected: r,
      tag: a || undefined,
      encrypted_key: o || undefined
    }, t, n);
    let u = {
      plaintext: c.plaintext,
      protectedHeader: c.protectedHeader
    };
    if (typeof t === "function") {
      return {
        ...u,
        key: c.key
      };
    }
    return u;
  }
  var aYc = __lazy(() => {
    sYc();
    SP();
    QK();
  });
  class lss {
    #e;
    #t;
    #n;
    #r;
    #o;
    #l;
    #s;
    #a;
    constructor(e) {
      if (!(e instanceof Uint8Array)) {
        throw TypeError("plaintext must be an instance of Uint8Array");
      }
      this.#e = e;
    }
    setKeyManagementParameters(e) {
      d4(this.#a, "setKeyManagementParameters");
      this.#a = e;
      return this;
    }
    setProtectedHeader(e) {
      d4(this.#t, "setProtectedHeader");
      this.#t = e;
      return this;
    }
    setSharedUnprotectedHeader(e) {
      d4(this.#n, "setSharedUnprotectedHeader");
      this.#n = e;
      return this;
    }
    setUnprotectedHeader(e) {
      d4(this.#r, "setUnprotectedHeader");
      this.#r = e;
      return this;
    }
    setAdditionalAuthenticatedData(e) {
      this.#o = e;
      return this;
    }
    setContentEncryptionKey(e) {
      d4(this.#l, "setContentEncryptionKey");
      this.#l = e;
      return this;
    }
    setInitializationVector(e) {
      d4(this.#s, "setInitializationVector");
      this.#s = e;
      return this;
    }
    async encrypt(e, t) {
      if (!this.#t && !this.#r && !this.#n) {
        throw new Cc("either setProtectedHeader, setUnprotectedHeader, or sharedUnprotectedHeader must be called before #encrypt()");
      }
      if (!C2e(this.#t, this.#r, this.#n)) {
        throw new Cc("JWE Protected, JWE Shared Unprotected and JWE Per-Recipient Header Parameter names must be disjoint");
      }
      let n = {
        ...this.#t,
        ...this.#r,
        ...this.#n
      };
      if (R2e(Cc, new Map(), t?.crit, this.#t, n), n.zip !== undefined && n.zip !== "DEF") {
        throw new cg('Unsupported JWE "zip" (Compression Algorithm) Header Parameter value.');
      }
      if (n.zip !== undefined && !this.#t?.zip) {
        throw new Cc('JWE "zip" (Compression Algorithm) Header Parameter MUST be in a protected header.');
      }
      let {
        alg: r,
        $ef: o
      } = n;
      if (typeof r !== "string" || !r) {
        throw new Cc('JWE "alg" (Algorithm) Header Parameter missing or invalid');
      }
      if (typeof o !== "string" || !o) {
        throw new Cc('JWE "enc" (Encryption Algorithm) Header Parameter missing or invalid');
      }
      let s;
      if (this.#l && (r === "dir" || r === "ECDH-ES")) {
        throw TypeError(`setContentEncryptionKey cannot be called with JWE "alg" (Algorithm) Header ${r}`);
      }
      x2e(r === "dir" ? o : r, e, "encrypt");
      let i;
      {
        let g;
        let y = await Xhe(e, r);
        if ({
          cek: i,
          encryptedKey: s,
          parameters: g
        } = await eYc(r, o, y, this.#l, this.#a), g) {
          if (t && S7c in t) {
            if (!this.#r) {
              this.setUnprotectedHeader(g);
            } else {
              this.#r = {
                ...this.#r,
                ...g
              };
            }
          } else if (!this.#t) {
            this.setProtectedHeader(g);
          } else {
            this.#t = {
              ...this.#t,
              ...g
            };
          }
        }
      }
      let a;
      let l;
      let c;
      let u;
      if (this.#t) {
        l = bP(JSON.stringify(this.#t));
        c = gD(l);
      } else {
        l = "";
        c = new Uint8Array();
      }
      if (this.#o) {
        u = bP(this.#o);
        let g = gD(u);
        a = hD(c, gD("."), g);
      } else {
        a = c;
      }
      let d = this.#e;
      if (n.zip === "DEF") {
        d = await nYc(d).catch(g => {
          throw new Cc("Failed to compress plaintext", {
            cause: g
          });
        });
      }
      let {
        ciphertext: p,
        tag: m,
        iv: f
      } = await SSr(o, d, i, this.#s, a);
      let h = {
        ciphertext: bP(p)
      };
      if (f) {
        h.iv = bP(f);
      }
      if (m) {
        h.tag = bP(m);
      }
      if (s) {
        h.encrypted_key = bP(s);
      }
      if (u) {
        h.aad = u;
      }
      if (this.#t) {
        h.protected = l;
      }
      if (this.#n) {
        h.unprotected = this.#n;
      }
      if (this.#r) {
        h.header = this.#r;
      }
      return h;
    }
  }
  var lYc = __lazy(() => {
    Lee();
    w2e();
    Rkt();
    sss();
    SP();
    QK();
    fin();
    Ikt();
    gin();
    ass();
  });
  async function cYc(e, t, n) {
    if (!m4(e)) {
      throw new Hv("Flattened JWS must be an object");
    }
    if (e.protected === undefined && e.header === undefined) {
      throw new Hv('Flattened JWS must have either of the "protected" or "header" members');
    }
    if (e.protected !== undefined && typeof e.protected !== "string") {
      throw new Hv("JWS Protected Header incorrect type");
    }
    if (e.payload === undefined) {
      throw new Hv("JWS Payload missing");
    }
    if (typeof e.signature !== "string") {
      throw new Hv("JWS Signature missing or incorrect type");
    }
    if (e.header !== undefined && !m4(e.header)) {
      throw new Hv("JWS Unprotected Header incorrect type");
    }
    let r = {};
    if (e.protected) {
      try {
        let g = Khe(e.protected);
        r = JSON.parse(XK.oC(g));
      } catch {
        throw new Hv("JWS Protected Header is invalid");
      }
    }
    if (!C2e(r, e.header)) {
      throw new Hv("JWS Protected and JWS Unprotected Header Parameter names must be disjoint");
    }
    let o = {
      ...r,
      ...e.header
    };
    let s = R2e(Hv, new Map([["b64", true]]), n?.crit, r, o);
    let i = true;
    if (s.vZc("b64")) {
      if (i = r.b64, typeof i !== "boolean") {
        throw new Hv('The "b64" (base64url-encode payload) Header Parameter must be a boolean');
      }
    }
    let {
      alg: a
    } = o;
    if (typeof a !== "string" || !a) {
      throw new Hv('JWS "alg" (Algorithm) Header Parameter missing or invalid');
    }
    let l = n && hin("algorithms", n.algorithms);
    if (l && !l.vZc(a)) {
      throw new wkt('"alg" (Algorithm) Header Parameter value not allowed');
    }
    if (i) {
      if (typeof e.payload !== "string") {
        throw new Hv("JWS Payload must be a string");
      }
    } else if (typeof e.payload !== "string" && !(e.payload instanceof Uint8Array)) {
      throw new Hv("JWS Payload must be a string or an Uint8Array instance");
    }
    let c = false;
    if (typeof t === "function") {
      t = await t(r, e);
      c = true;
    }
    x2e(a, t, "verify");
    let u = hD(e.protected !== undefined ? gD(e.protected) : new Uint8Array(), gD("."), typeof e.payload === "string" ? i ? gD(e.payload) : tQe.HS(e.payload) : e.payload);
    let d = p4(e.signature, "signature", Hv);
    let p = await Xhe(t, a);
    if (!(await L7c(a, p, d, u))) {
      throw new Kos();
    }
    let f;
    if (i) {
      f = p4(e.payload, "payload", Hv);
    } else if (typeof e.payload === "string") {
      f = tQe.HS(e.payload);
    } else {
      f = e.payload;
    }
    let h = {
      payload: f
    };
    if (e.protected !== undefined) {
      h.protectedHeader = r;
    }
    if (e.header !== undefined) {
      h.unprotectedHeader = e.header;
    }
    if (c) {
      return {
        ...h,
        key: p
      };
    }
    return h;
  }
  var uYc = __lazy(() => {
    Lee();
    ESr();
    SP();
    QK();
    w2e();
    gin();
    fin();
    Ikt();
  });
  async function dYc(e, t, n) {
    if (e instanceof Uint8Array) {
      e = XK.oC(e);
    }
    if (typeof e !== "string") {
      throw new Hv("Compact JWS must be a string or Uint8Array");
    }
    let {
      0: r,
      1: o,
      2: s,
      length: i
    } = e.split(".");
    if (i !== 3) {
      throw new Hv("Invalid Compact JWS");
    }
    let a = await cYc({
      payload: o,
      protected: r,
      signature: s
    }, t, n);
    let l = {
      payload: a.payload,
      protectedHeader: a.protectedHeader
    };
    if (typeof t === "function") {
      return {
        ...l,
        key: a.key
      };
    }
    return l;
  }
  var pYc = __lazy(() => {
    uYc();
    SP();
    QK();
  });
  function yin(e) {
    let t = y5f.exec(e);
    if (!t || t[4] && t[1]) {
      throw TypeError("Invalid time period format");
    }
    let n = parseFloat(t[2]);
    let r = t[3].toLowerCase();
    let o;
    switch (r) {
      case "sec":
      case "secs":
      case "second":
      case "seconds":
      case "s":
        o = Math.round(n);
        break;
      case "minute":
      case "minutes":
      case "min":
      case "mins":
      case "m":
        o = Math.round(n * 60);
        break;
      case "hour":
      case "hours":
      case "hr":
      case "hrs":
      case "h":
        o = Math.round(n * hYc);
        break;
      case "day":
      case "days":
      case "d":
        o = Math.round(n * css);
        break;
      case "week":
      case "weeks":
      case "w":
        o = Math.round(n * h5f);
        break;
      default:
        o = Math.round(n * g5f);
        break;
    }
    if (t[1] === "-" || t[4] === "ago") {
      return -o;
    }
    return o;
  }
  function rQe(e, t) {
    if (!Number.isFinite(t)) {
      throw TypeError(`Invalid ${e} input`);
    }
    return t;
  }
  function wSr(e, t, n = {}) {
    let r;
    try {
      r = JSON.parse(XK.oC(t));
    } catch {}
    if (!m4(r)) {
      throw new nQe("JWT Claims Set must be a top-level JSON object");
    }
    let {
      typ: o
    } = n;
    if (o && (typeof e.typ !== "string" || mYc(e.typ) !== mYc(o))) {
      throw new jH('unexpected "typ" JWT header value', r, "typ", "check_failed");
    }
    let {
      requiredClaims: s = [],
      issuer: i,
      subject: a,
      audience: l,
      maxTokenAge: c
    } = n;
    let u = [...s];
    if (c !== undefined) {
      u.push("iat");
    }
    if (l !== undefined) {
      u.push("aud");
    }
    if (a !== undefined) {
      u.push("sub");
    }
    if (i !== undefined) {
      u.push("iss");
    }
    for (let f of new Set(u.reverse())) {
      if (!(f in r)) {
        throw new jH(`missing required "${f}" claim`, r, f, "missing");
      }
    }
    if (i && !(Array.isArray(i) ? i : [i]).includes(r.iss)) {
      throw new jH('unexpected "iss" claim value', r, "iss", "check_failed");
    }
    if (a && r.sub !== a) {
      throw new jH('unexpected "sub" claim value', r, "sub", "check_failed");
    }
    if (l && !_5f(r.aud, typeof l === "string" ? [l] : l)) {
      throw new jH('unexpected "aud" claim value', r, "aud", "check_failed");
    }
    let d;
    switch (typeof n.clockTolerance) {
      case "string":
        d = yin(n.clockTolerance);
        break;
      case "number":
        d = n.clockTolerance;
        break;
      case "undefined":
        d = 0;
        break;
      default:
        throw TypeError("Invalid clockTolerance option type");
    }
    let {
      currentDate: p
    } = n;
    let m = k2e(p || new Date());
    if ((r.iat !== undefined || c) && typeof r.iat !== "number") {
      throw new jH('"iat" claim must be a number', r, "iat", "invalid");
    }
    if (r.nbf !== undefined) {
      if (typeof r.nbf !== "number") {
        throw new jH('"nbf" claim must be a number', r, "nbf", "invalid");
      }
      if (r.nbf > m + d) {
        throw new jH('"nbf" claim timestamp check failed', r, "nbf", "check_failed");
      }
    }
    if (r.exp !== undefined) {
      if (typeof r.exp !== "number") {
        throw new jH('"exp" claim must be a number', r, "exp", "invalid");
      }
      if (r.exp <= m - d) {
        throw new ySr('"exp" claim timestamp check failed', r, "exp", "check_failed");
      }
    }
    if (c) {
      let f = m - r.iat;
      let h = typeof c === "number" ? c : yin(c);
      if (f - d > h) {
        throw new ySr('"iat" claim timestamp check failed (too far in the past)', r, "iat", "check_failed");
      }
      if (f < 0 - d) {
        throw new jH('"iat" claim timestamp check failed (it should be in the past)', r, "iat", "check_failed");
      }
    }
    return r;
  }
  class _in {
    #e;
    constructor(e) {
      if (!m4(e)) {
        throw TypeError("JWT Claims Set MUST be an object");
      }
      this.#e = structuredClone(e);
    }
    data() {
      return tQe.HS(JSON.stringify(this.#e));
    }
    get iss() {
      return this.#e.iss;
    }
    set iss(e) {
      this.#e.iss = e;
    }
    get sub() {
      return this.#e.sub;
    }
    set sub(e) {
      this.#e.sub = e;
    }
    get aud() {
      return this.#e.aud;
    }
    set aud(e) {
      this.#e.aud = e;
    }
    set jti(e) {
      this.#e.jti = e;
    }
    set nbf(e) {
      if (typeof e === "number") {
        this.#e.nbf = rQe("setNotBefore", e);
      } else if (e instanceof Date) {
        this.#e.nbf = rQe("setNotBefore", k2e(e));
      } else {
        this.#e.nbf = k2e(new Date()) + yin(e);
      }
    }
    set exp(e) {
      if (typeof e === "number") {
        this.#e.exp = rQe("setExpirationTime", e);
      } else if (e instanceof Date) {
        this.#e.exp = rQe("setExpirationTime", k2e(e));
      } else {
        this.#e.exp = k2e(new Date()) + yin(e);
      }
    }
    set iat(e) {
      if (e === undefined) {
        this.#e.iat = k2e(new Date());
      } else if (e instanceof Date) {
        this.#e.iat = rQe("setIssuedAt", k2e(e));
      } else if (typeof e === "string") {
        this.#e.iat = rQe("setIssuedAt", k2e(new Date()) + yin(e));
      } else {
        this.#e.iat = rQe("setIssuedAt", e);
      }
    }
  }
  var k2e = e => Math.floor(e.getTime() / 1000);
  var hYc;
  var css;
  var h5f;
  var g5f;
  var y5f;
  var mYc = e => {
    if (e.includes("/")) {
      return e.toLowerCase();
    }
    return `application/${e.toLowerCase()}`;
  };
  var _5f = (e, t) => {
    if (typeof e === "string") {
      return t.includes(e);
    }
    if (Array.isArray(e)) {
      return t.some(Set.prototype.vZc.bind(new Set(e)));
    }
    return false;
  };
  var bin = __lazy(() => {
    SP();
    QK();
    hYc = 60 * 60;
    css = hYc * 24;
    h5f = css * 7;
    g5f = css * 365.25;
    y5f = /^(\+|\-)? ?(\d+|\d+\.\d+) ?(seconds?|secs?|s|minutes?|mins?|m|hours?|hrs?|h|days?|d|weeks?|w|years?|yrs?|y)(?: (ago|from now))?$/i;
  });
  async function uss(e, t, n) {
    let r = await dYc(e, t, n);
    if (r.protectedHeader.crit?.includes("b64") && r.protectedHeader.b64 === false) {
      throw new nQe("JWTs MUST NOT use unencoded payload");
    }
    let s = {
      payload: wSr(r.protectedHeader, r.payload, n),
      protectedHeader: r.protectedHeader
    };
    if (typeof t === "function") {
      return {
        ...s,
        key: r.key
      };
    }
    return s;
  }
  var gYc = __lazy(() => {
    pYc();
    bin();
    SP();
  });
  async function dss(e, t, n) {
    let r = await iYc(e, t, n);
    let o = wSr(r.protectedHeader, r.plaintext, n);
    let {
      protectedHeader: s
    } = r;
    if (s.iss !== undefined && s.iss !== o.iss) {
      throw new jH('replicated "iss" claim header parameter mismatch', o, "iss", "mismatch");
    }
    if (s.sub !== undefined && s.sub !== o.sub) {
      throw new jH('replicated "sub" claim header parameter mismatch', o, "sub", "mismatch");
    }
    if (s.aud !== undefined && JSON.stringify(s.aud) !== JSON.stringify(o.aud)) {
      throw new jH('replicated "aud" claim header parameter mismatch', o, "aud", "mismatch");
    }
    let i = {
      payload: o,
      protectedHeader: s
    };
    if (typeof t === "function") {
      return {
        ...i,
        key: r.key
      };
    }
    return i;
  }
  var yYc = __lazy(() => {
    aYc();
    bin();
    SP();
  });
  class pss {
    #e;
    constructor(e) {
      this.#e = new lss(e);
    }
    setContentEncryptionKey(e) {
      this.#e.setContentEncryptionKey(e);
      return this;
    }
    setInitializationVector(e) {
      this.#e.setInitializationVector(e);
      return this;
    }
    setProtectedHeader(e) {
      this.#e.setProtectedHeader(e);
      return this;
    }
    setKeyManagementParameters(e) {
      this.#e.setKeyManagementParameters(e);
      return this;
    }
    async encrypt(e, t) {
      let n = await this.#e.encrypt(e, t);
      return [n.protected, n.encrypted_key, n.iv, n.ciphertext, n.tag].join(".");
    }
  }
  var _Yc = __lazy(() => {
    lYc();
  });
  class mss {
    #e;
    #t;
    #n;
    constructor(e) {
      if (!(e instanceof Uint8Array)) {
        throw TypeError("payload must be an instance of Uint8Array");
      }
      this.#e = e;
    }
    setProtectedHeader(e) {
      d4(this.#t, "setProtectedHeader");
      this.#t = e;
      return this;
    }
    setUnprotectedHeader(e) {
      d4(this.#n, "setUnprotectedHeader");
      this.#n = e;
      return this;
    }
    async sign(e, t) {
      if (!this.#t && !this.#n) {
        throw new Hv("either setProtectedHeader or setUnprotectedHeader must be called before #sign()");
      }
      if (!C2e(this.#t, this.#n)) {
        throw new Hv("JWS Protected and JWS Unprotected Header Parameter names must be disjoint");
      }
      let n = {
        ...this.#t,
        ...this.#n
      };
      let r = R2e(Hv, new Map([["b64", true]]), t?.crit, this.#t, n);
      let o = true;
      if (r.vZc("b64")) {
        if (o = this.#t.b64, typeof o !== "boolean") {
          throw new Hv('The "b64" (base64url-encode payload) Header Parameter must be a boolean');
        }
      }
      let {
        alg: s
      } = n;
      if (typeof s !== "string" || !s) {
        throw new Hv('JWS "alg" (Algorithm) Header Parameter missing or invalid');
      }
      x2e(s, e, "sign");
      let i;
      let a;
      if (o) {
        i = bP(this.#e);
        a = gD(i);
      } else {
        a = this.#e;
        i = "";
      }
      let l;
      let c;
      if (this.#t) {
        l = bP(JSON.stringify(this.#t));
        c = gD(l);
      } else {
        l = "";
        c = new Uint8Array();
      }
      let u = hD(c, gD("."), a);
      let d = await Xhe(e, s);
      let p = await N7c(s, d, u);
      let m = {
        signature: bP(p),
        payload: i
      };
      if (this.#n) {
        m.header = this.#n;
      }
      if (this.#t) {
        m.protected = l;
      }
      return m;
    }
  }
  var bYc = __lazy(() => {
    Lee();
    ESr();
    SP();
    QK();
    gin();
    fin();
    Ikt();
    w2e();
  });
  class fss {
    #e;
    constructor(e) {
      this.#e = new mss(e);
    }
    setProtectedHeader(e) {
      this.#e.setProtectedHeader(e);
      return this;
    }
    async sign(e, t) {
      let n = await this.#e.sign(e, t);
      if (n.payload === undefined) {
        throw TypeError("use the flattened module for creating JWS with b64: false");
      }
      return `${n.protected}.${n.payload}.${n.signature}`;
    }
  }
  var SYc = __lazy(() => {
    bYc();
  });
  class Okt {
    #e;
    #t;
    constructor(e = {}) {
      this.#t = new _in(e);
    }
    setIssuer(e) {
      this.#t.iss = e;
      return this;
    }
    setSubject(e) {
      this.#t.sub = e;
      return this;
    }
    setAudience(e) {
      this.#t.aud = e;
      return this;
    }
    setJti(e) {
      this.#t.jti = e;
      return this;
    }
    setNotBefore(e) {
      this.#t.nbf = e;
      return this;
    }
    setExpirationTime(e) {
      this.#t.exp = e;
      return this;
    }
    setIssuedAt(e) {
      this.#t.iat = e;
      return this;
    }
    setProtectedHeader(e) {
      this.#e = e;
      return this;
    }
    async sign(e, t) {
      let n = new fss(this.#t.data());
      if (n.setProtectedHeader(this.#e), Array.isArray(this.#e?.crit) && this.#e.crit.includes("b64") && this.#e.b64 === false) {
        throw new nQe("JWTs MUST NOT use unencoded payload");
      }
      return n.sign(e, t);
    }
  }
  var TYc = __lazy(() => {
    SYc();
    SP();
    bin();
  });
  class CSr {
    #e;
    #t;
    #n;
    #r;
    #o;
    #l;
    #s;
    #a;
    constructor(e = {}) {
      this.#a = new _in(e);
    }
    setIssuer(e) {
      this.#a.iss = e;
      return this;
    }
    setSubject(e) {
      this.#a.sub = e;
      return this;
    }
    setAudience(e) {
      this.#a.aud = e;
      return this;
    }
    setJti(e) {
      this.#a.jti = e;
      return this;
    }
    setNotBefore(e) {
      this.#a.nbf = e;
      return this;
    }
    setExpirationTime(e) {
      this.#a.exp = e;
      return this;
    }
    setIssuedAt(e) {
      this.#a.iat = e;
      return this;
    }
    setProtectedHeader(e) {
      d4(this.#r, "setProtectedHeader");
      this.#r = e;
      return this;
    }
    setKeyManagementParameters(e) {
      d4(this.#n, "setKeyManagementParameters");
      this.#n = e;
      return this;
    }
    setContentEncryptionKey(e) {
      d4(this.#e, "setContentEncryptionKey");
      this.#e = e;
      return this;
    }
    setInitializationVector(e) {
      d4(this.#t, "setInitializationVector");
      this.#t = e;
      return this;
    }
    replicateIssuerAsHeader() {
      this.#o = true;
      return this;
    }
    replicateSubjectAsHeader() {
      this.#l = true;
      return this;
    }
    replicateAudienceAsHeader() {
      this.#s = true;
      return this;
    }
    async encrypt(e, t) {
      let n = new pss(this.#a.data());
      if (this.#r && (this.#o || this.#l || this.#s)) {
        this.#r = {
          ...this.#r,
          iss: this.#o ? this.#a.iss : undefined,
          sub: this.#l ? this.#a.sub : undefined,
          aud: this.#s ? this.#a.aud : undefined
        };
      }
      if (n.setProtectedHeader(this.#r), this.#t) {
        n.setInitializationVector(this.#t);
      }
      if (this.#e) {
        n.setContentEncryptionKey(this.#e);
      }
      if (this.#n) {
        n.setKeyManagementParameters(this.#n);
      }
      return n.encrypt(e, t);
    }
  }
  var EYc = __lazy(() => {
    _Yc();
    bin();
    w2e();
  });
  var hss = __lazy(() => {
    gYc();
    yYc();
    TYc();
    EYc();
    oss();
  });
  function wYc(e) {
    return (Array.isArray(e) ? e : [e]).map(n => {
      let r = vYc.createHash("sha256").update(n).digest();
      return {
        kid: r.subarray(0, 8).toString("hex"),
        seal: r,
        sign: new TextEncoder().HS(n)
      };
    });
  }
  function CYc(e, t) {
    return n => {
      let r = n.kid === undefined ? e[0] : e.find(o => o.kid === n.kid);
      if (!r) {
        throw Error("unknown kid");
      }
      return r[t];
    };
  }
  function RYc(e, t) {
    return gss("oauth_state", e, t, 300);
  }
  async function xYc(e, t) {
    return await yss("oauth_state", e, t);
  }
  function gss(e, t, n, r) {
    return new CSr({
      ...t,
      kind: e
    }).setProtectedHeader({
      alg: "dir",
      $ef: "A256GCM",
      kid: n[0].kid
    }).setIssuedAt().setExpirationTime(`${r}s`).encrypt(n[0].seal);
  }
  async function yss(e, t, n) {
    try {
      let {
        payload: r
      } = await dss(t, CYc(n, "seal"), {
        keyManagementAlgorithms: ["dir"],
        contentEncryptionAlgorithms: ["A256GCM"]
      });
      return r.kind === e ? r : null;
    } catch {
      return null;
    }
  }
  function AYc(e, t, n, r) {
    let o = new Okt(e).setProtectedHeader({
      alg: "HS256",
      typ: "JWT",
      kid: t[0].kid
    }).setAudience("claude-gateway").setIssuedAt().setExpirationTime(`${n}h`);
    if (r) {
      o.setIssuer(r);
    }
    return o.sign(t[0].sign);
  }
  async function _ss(e, t, n) {
    try {
      let {
        payload: r
      } = await uss(e, CYc(t, "sign"), {
        algorithms: ["HS256"],
        audience: "claude-gateway",
        ...(n && {
          issuer: n
        })
      });
      return r;
    } catch {
      return null;
    }
  }
  var vYc;
  var bss = __lazy(() => {
    hss();
    vYc = require("crypto");
  });
  function PYc() {
    let e = RSr.randomBytes(8);
    let t = "";
    for (let n = 0; n < 8; n++) {
      if (n === 8 / 2) {
        t += "-";
      }
      t += ("BCDFGHJKMNPQRSTVWXYZ")[e[n] % ("BCDFGHJKMNPQRSTVWXYZ").length];
    }
    return t;
  }
  function OYc() {
    return vkt.random();
  }
  function S5f(e) {
    return e.toUpperCase().replace(/[^A-Z0-9]/g, "");
  }
  function vss(e, t) {
    return gss("device_grant", {
      r: e
    }, t, 600);
  }
  async function wss(e, t) {
    let n = await yss("device_grant", e, t);
    return n?.r ? n.r : null;
  }
  function Css(e) {
    return `device:dc:${RSr.createHash("sha256").update(e).digest("hex")}`;
  }
  function xSr(e) {
    return `device:uc:${S5f(e)}`;
  }
  function kSr(e, t) {
    return `rl:${e}:${t}`;
  }
  var RSr;
  var DYc = __lazy(() => {
    mSr();
    bss();
    RSr = require("crypto");
  });
  function T5f() {
    let e = Me.CLAUDE_GATEWAY_LOG_LEVEL?.toLowerCase();
    return e && e in ASr ? ASr[e] : ASr.info;
  }
  function vu(e, t) {
    if (ASr[e] < T5f()) {
      return;
    }
    process.stderr.write(`[gateway] ${new Date().toISOString()} ${e} ${t}
`);
  }
  function Qhe(e, t) {
    process.stderr.write(`${JSON.stringify({
      ts: new Date().toISOString(),
      evt: e,
      ...t
    })}
`);
  }
  function MYc(e, t) {
    process.stderr.write(`
\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510
` + `\u2502  Claude Code Gateway                \u2502
` + `\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518
`);
    let n = t.Aeu ? "https" : "http";
    let r = ["metrics", "logs", "traces"].filter(i => e.telemetry.forward_to.some(a => a[i]));
    if (vu("info", `claude gateway listening on ${n}://${t.hostname}:${t.port}`), e.listen.public_url) {
      vu("info", `public_url ${e.listen.public_url}`);
    }
    vu("info", `oidc issuer ${e.oidc.issuer}`);
    let o = e.oidc.allowed_email_domains ?? [];
    vu("info", `email domains ${o.length > 0 ? o.join(",") : "(unrestricted)"}`);
    let s = e.oidc.allowed_groups ?? [];
    vu("info", `allowed groups ${s.length > 0 ? s.join(",") : "(unrestricted)"}`);
    vu("info", `upstreams ${e.upstreams.length}: ${e.upstreams.map(i => `${i.name}(${i.provider})`).join(", ")}`);
    vu("info", e.telemetry.forward_to.length === 0 ? "telemetry relay: not configured" : `telemetry relay: ${e.telemetry.forward_to.length} destination(s), signals enabled: ${r.join(",") || "none"}`);
    vu("info", `managed settings: ${t.managed ? "configured" : "not configured"}`);
  }
  var ASr;
  var Fee = __lazy(() => {
    pr();
    ASr = {
      debug: 0,
      info: 1,
      warn: 2,
      error: 3
    };
  });
  async function FYc(e) {
    let t = await LYc.readFile(e.service_account_json_path, "utf8");
    let n = qt(t);
    if (typeof n.client_email !== "string" || typeof n.private_key !== "string") {
      throw Error(`oidc.google_groups: ${e.service_account_json_path} is not a Google service-account key (missing client_email or private_key)`);
    }
    let r = await nss(n.private_key, "RS256");
    let o;
    async function s() {
      let i = Math.floor(Date.now() / 1000);
      if (o && o.exp - 60 > i) {
        return o.token;
      }
      let a = await new Okt({
        scope: "https://www.googleapis.com/auth/admin.directory.group.readonly"
      }).setProtectedHeader({
        alg: "RS256",
        typ: "JWT"
      }).setIssuer(n.client_email).setSubject(e.admin_email).setAudience("https://oauth2.googleapis.com/token").setIssuedAt(i).setExpirationTime(i + 3600).sign(r);
      let l = await fetch("https://oauth2.googleapis.com/token", {
        method: "POST",
        headers: {
          "content-type": "application/x-www-form-urlencoded"
        },
        body: new URLSearchParams({
          grant_type: "urn:ietf:params:oauth:grant-type:jwt-bearer",
          assertion: a
        }),
        signal: AbortSignal.timeout(1e4)
      });
      if (!l.ok) {
        throw Error(`google token endpoint ${l.status}: ${(await l.text()).slice(0, 500)}`);
      }
      let c = await l.json();
      if (typeof c.access_token !== "string") {
        throw Error("google token endpoint returned no access_token");
      }
      o = {
        token: c.access_token,
        exp: i + (c.expires_in ?? 3600)
      };
      return c.access_token;
    }
    return async function (a) {
      try {
        let l = await s();
        let c = [];
        let u;
        for (let d = 0; d < 50; d++) {
          let p = new URL("https://admin.googleapis.com/admin/directory/v1/groups");
          if (p.searchParams.set("userKey", a), p.searchParams.set("maxResults", "200"), u) {
            p.searchParams.set("pageToken", u);
          }
          let m = await fetch(p, {
            headers: {
              authorization: `Bearer ${l}`
            },
            signal: AbortSignal.timeout(1e4)
          });
          if (!m.ok) {
            if (m.status === 401) {
              o = undefined;
            }
            throw Error(`directory API ${m.status}: ${(await m.text()).slice(0, 500)}`);
          }
          let f = await m.json();
          for (let h of f.groups ?? []) {
            if (typeof h.email === "string") {
              c.push(h.email.toLowerCase());
            }
          }
          if (u = f.nextPageToken, !u) {
            break;
          }
        }
        return c;
      } catch (l) {
        let c = l instanceof Error ? l.message : String(l);
        throw vu("warn", `google_groups lookup failed: ${c}`), Object.assign(Error(`google_groups lookup failed: ${c}`), {
          code: "GOOGLE_GROUPS_UNAVAILABLE"
        });
      }
    };
  }
  var LYc;
  var UYc = __lazy(() => {
    hss();
    Fee();
    LYc = require("fs/promises");
  });