  __export(errors, {
    JWTInvalid: () => JWTInvalid,
    JWTExpired: () => JWTExpired,
    JWTClaimValidationFailed: () => JWTClaimValidationFailed,
    JWSSignatureVerificationFailed: () => JWSSignatureVerificationFailed,
    JWSInvalid: () => JWSInvalid,
    JWKSTimeout: () => JWKSTimeout,
    JWKSNoMatchingKey: () => JWKSNoMatchingKey,
    JWKSMultipleMatchingKeys: () => JWKSMultipleMatchingKeys,
    JWKSInvalid: () => JWKSInvalid,
    JWKInvalid: () => JWKInvalid,
    JWEInvalid: () => JWEInvalid,
    JWEDecryptionFailed: () => JWEDecryptionFailed,
    JWEDecompressionFailed: () => JWEDecompressionFailed,
    JOSENotSupported: () => JOSENotSupported,
    JOSEError: () => JOSEError,
    JOSEAlgNotAllowed: () => JOSEAlgNotAllowed
  });
  var JOSEError;
  var JWTClaimValidationFailed;
  var JWTExpired;
  var JOSEAlgNotAllowed;
  var JOSENotSupported;
  var JWEDecryptionFailed;
  var JWEDecompressionFailed;
  var JWEInvalid;
  var JWSInvalid;
  var JWTInvalid;
  var JWKInvalid;
  var JWKSInvalid;
  var JWKSNoMatchingKey;
  var JWKSMultipleMatchingKeys;
  var JWKSTimeout;
  var JWSSignatureVerificationFailed;
  var Mf = __lazy(() => {
    JOSEError = class mD extends Error {
      static get code() {
        return "ERR_JOSE_GENERIC";
      }
      constructor(e) {
        var t;
        super(e);
        this.code = "ERR_JOSE_GENERIC";
        this.name = this.constructor.name;
        (t = Error.captureStackTrace) === null || t === undefined || t.call(Error, this, this.constructor);
      }
    };
    JWTClaimValidationFailed = class bB extends JOSEError {
      static get code() {
        return "ERR_JWT_CLAIM_VALIDATION_FAILED";
      }
      constructor(e, t = "unspecified", n = "unspecified") {
        super(e);
        this.code = "ERR_JWT_CLAIM_VALIDATION_FAILED";
        this.claim = t;
        this.reason = n;
      }
    };
    JWTExpired = class Dsn extends JOSEError {
      static get code() {
        return "ERR_JWT_EXPIRED";
      }
      constructor(e, t = "unspecified", n = "unspecified") {
        super(e);
        this.code = "ERR_JWT_EXPIRED";
        this.claim = t;
        this.reason = n;
      }
    };
    JOSEAlgNotAllowed = class GXe extends JOSEError {
      constructor() {
        super(...arguments);
        this.code = "ERR_JOSE_ALG_NOT_ALLOWED";
      }
      static get code() {
        return "ERR_JOSE_ALG_NOT_ALLOWED";
      }
    };
    JOSENotSupported = class fd extends JOSEError {
      constructor() {
        super(...arguments);
        this.code = "ERR_JOSE_NOT_SUPPORTED";
      }
      static get code() {
        return "ERR_JOSE_NOT_SUPPORTED";
      }
    };
    JWEDecryptionFailed = class d2e extends JOSEError {
      constructor() {
        super(...arguments);
        this.code = "ERR_JWE_DECRYPTION_FAILED";
        this.message = "decryption operation failed";
      }
      static get code() {
        return "ERR_JWE_DECRYPTION_FAILED";
      }
    };
    JWEDecompressionFailed = class q8c extends JOSEError {
      constructor() {
        super(...arguments);
        this.code = "ERR_JWE_DECOMPRESSION_FAILED";
        this.message = "decompression operation failed";
      }
      static get code() {
        return "ERR_JWE_DECOMPRESSION_FAILED";
      }
    };
    JWEInvalid = class Qa extends JOSEError {
      constructor() {
        super(...arguments);
        this.code = "ERR_JWE_INVALID";
      }
      static get code() {
        return "ERR_JWE_INVALID";
      }
    };
    JWSInvalid = class Dg extends JOSEError {
      constructor() {
        super(...arguments);
        this.code = "ERR_JWS_INVALID";
      }
      static get code() {
        return "ERR_JWS_INVALID";
      }
    };
    JWTInvalid = class fD extends JOSEError {
      constructor() {
        super(...arguments);
        this.code = "ERR_JWT_INVALID";
      }
      static get code() {
        return "ERR_JWT_INVALID";
      }
    };
    JWKInvalid = class Cbr extends JOSEError {
      constructor() {
        super(...arguments);
        this.code = "ERR_JWK_INVALID";
      }
      static get code() {
        return "ERR_JWK_INVALID";
      }
    };
    JWKSInvalid = class VXe extends JOSEError {
      constructor() {
        super(...arguments);
        this.code = "ERR_JWKS_INVALID";
      }
      static get code() {
        return "ERR_JWKS_INVALID";
      }
    };
    JWKSNoMatchingKey = class akt extends JOSEError {
      constructor() {
        super(...arguments);
        this.code = "ERR_JWKS_NO_MATCHING_KEY";
        this.message = "no applicable key found in the JSON Web Key Set";
      }
      static get code() {
        return "ERR_JWKS_NO_MATCHING_KEY";
      }
    };
    JWKSMultipleMatchingKeys = class Rbr extends JOSEError {
      constructor() {
        super(...arguments);
        this.code = "ERR_JWKS_MULTIPLE_MATCHING_KEYS";
        this.message = "multiple matching keys found in the JSON Web Key Set";
      }
      static get code() {
        return "ERR_JWKS_MULTIPLE_MATCHING_KEYS";
      }
    };
    JWKSTimeout = class xbr extends JOSEError {
      constructor() {
        super(...arguments);
        this.code = "ERR_JWKS_TIMEOUT";
        this.message = "request timed out";
      }
      static get code() {
        return "ERR_JWKS_TIMEOUT";
      }
    };
    JWSSignatureVerificationFailed = class lkt extends JOSEError {
      constructor() {
        super(...arguments);
        this.code = "ERR_JWS_SIGNATURE_VERIFICATION_FAILED";
        this.message = "signature verification failed";
      }
      static get code() {
        return "ERR_JWS_SIGNATURE_VERIFICATION_FAILED";
      }
    };
  });
  var p2e;
  var Msn = __lazy(() => {
    p2e = crypto.getRandomValues.bind(crypto);
  });
  function crs(e) {
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
        throw new JOSENotSupported(`Unsupported JWE Algorithm: ${e}`);
    }
  }
  var kbr = e => p2e(new Uint8Array(crs(e) >> 3));
  var Abr = __lazy(() => {
    Mf();
    Msn();
  });
  var dWf = (e, t) => {
    if (t.length << 3 !== crs(e)) {
      throw new JWEInvalid("Invalid Initialization Vector length");
    }
  };
  var pWf = (e, t) => {
    let n = e.byteLength << 3;
    if (n !== t) {
      throw new JWEInvalid(`Invalid Content Encryption Key length. Expected ${t} bits, got ${n} bits`);
    }
  };
  var mWf = (e, t) => {
    if (!(e instanceof Uint8Array)) {
      throw TypeError("First argument must be a buffer");
    }
    if (!(t instanceof Uint8Array)) {
      throw TypeError("Second argument must be a buffer");
    }
    if (e.length !== t.length) {
      throw TypeError("Input buffers must have the same length");
    }
    let n = e.length;
    let r = 0;
    let o = -1;
    while (++o < n) {
      r |= e[o] ^ t[o];
    }
    return r === 0;
  };
  function SB(e, t = "algorithm.name") {
    return TypeError(`CryptoKey does not support this operation, its ${t} must be ${e}`);
  }
  function m2e(e, t) {
    return e.name === t;
  }
  function Pbr(e) {
    return parseInt(e.name.slice(4), 10);
  }
  function fWf(e) {
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
  function V8c(e, t) {
    if (t.length && !t.some(n => e.usages.includes(n))) {
      let n = "CryptoKey does not support this operation, its usages must include ";
      if (t.length > 2) {
        let r = t.pop();
        n += `one of ${t.join(", ")}, or ${r}.`;
      } else if (t.length === 2) {
        n += `one of ${t[0]} or ${t[1]}.`;
      } else {
        n += `${t[0]}.`;
      }
      throw TypeError(n);
    }
  }
  function z8c(e, t, ...n) {
    switch (t) {
      case "HS256":
      case "HS384":
      case "HS512":
        {
          if (!m2e(e.algorithm, "HMAC")) {
            throw SB("HMAC");
          }
          let r = parseInt(t.slice(2), 10);
          if (Pbr(e.algorithm.hash) !== r) {
            throw SB(`SHA-${r}`, "algorithm.hash");
          }
          break;
        }
      case "RS256":
      case "RS384":
      case "RS512":
        {
          if (!m2e(e.algorithm, "RSASSA-PKCS1-v1_5")) {
            throw SB("RSASSA-PKCS1-v1_5");
          }
          let r = parseInt(t.slice(2), 10);
          if (Pbr(e.algorithm.hash) !== r) {
            throw SB(`SHA-${r}`, "algorithm.hash");
          }
          break;
        }
      case "PS256":
      case "PS384":
      case "PS512":
        {
          if (!m2e(e.algorithm, "RSA-PSS")) {
            throw SB("RSA-PSS");
          }
          let r = parseInt(t.slice(2), 10);
          if (Pbr(e.algorithm.hash) !== r) {
            throw SB(`SHA-${r}`, "algorithm.hash");
          }
          break;
        }
      case "EdDSA":
        {
          if (e.algorithm.name !== "Ed25519" && e.algorithm.name !== "Ed448") {
            throw SB("Ed25519 or Ed448");
          }
          break;
        }
      case "ES256":
      case "ES384":
      case "ES512":
        {
          if (!m2e(e.algorithm, "ECDSA")) {
            throw SB("ECDSA");
          }
          let r = fWf(t);
          if (e.algorithm.namedCurve !== r) {
            throw SB(r, "algorithm.namedCurve");
          }
          break;
        }
      default:
        throw TypeError("CryptoKey does not support this operation");
    }
    V8c(e, n);
  }
  function Z5(e, t, ...n) {
    switch (t) {
      case "A128GCM":
      case "A192GCM":
      case "A256GCM":
        {
          if (!m2e(e.algorithm, "AES-GCM")) {
            throw SB("AES-GCM");
          }
          let r = parseInt(t.slice(1, 4), 10);
          if (e.algorithm.length !== r) {
            throw SB(r, "algorithm.length");
          }
          break;
        }
      case "A128KW":
      case "A192KW":
      case "A256KW":
        {
          if (!m2e(e.algorithm, "AES-KW")) {
            throw SB("AES-KW");
          }
          let r = parseInt(t.slice(1, 4), 10);
          if (e.algorithm.length !== r) {
            throw SB(r, "algorithm.length");
          }
          break;
        }
      case "ECDH":
        {
          switch (e.algorithm.name) {
            case "ECDH":
            case "X25519":
            case "X448":
              break;
            default:
              throw SB("ECDH, X25519, or X448");
          }
          break;
        }
      case "PBES2-HS256+A128KW":
      case "PBES2-HS384+A192KW":
      case "PBES2-HS512+A256KW":
        if (!m2e(e.algorithm, "PBKDF2")) {
          throw SB("PBKDF2");
        }
        break;
      case "RSA-OAEP":
      case "RSA-OAEP-256":
      case "RSA-OAEP-384":
      case "RSA-OAEP-512":
        {
          if (!m2e(e.algorithm, "RSA-OAEP")) {
            throw SB("RSA-OAEP");
          }
          let r = parseInt(t.slice(9), 10) || 1;
          if (Pbr(e.algorithm.hash) !== r) {
            throw SB(`SHA-${r}`, "algorithm.hash");
          }
          break;
        }
      default:
        throw TypeError("CryptoKey does not support this operation");
    }
    V8c(e, n);
  }
  function K8c(e, t, ...n) {
    if (n.length > 2) {
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
      if (t.constructor && t.constructor.name) {
        e += ` Received an instance of ${t.constructor.name}`;
      }
    }
    return e;
  }
  function prs(e, t, ...n) {
    return K8c(`Key for the ${e} algorithm must be `, t, ...n);
  }
  var AR = (e, ...t) => K8c("Key must be ", e, ...t);
  var mrs = e => Yx(e);
  var ab;
  var Xie = __lazy(() => {
    ab = ["CryptoKey"];
  });
  async function hWf(e, t, n, r, o, s) {
    if (!(t instanceof Uint8Array)) {
      throw TypeError(AR(t, "Uint8Array"));
    }
    let i = parseInt(e.slice(1, 4), 10);
    let a = await crypto.subtle.importKey("raw", t.subarray(i >> 3), "AES-CBC", false, ["decrypt"]);
    let l = await crypto.subtle.importKey("raw", t.subarray(0, i >> 3), {
      hash: `SHA-${i << 1}`,
      name: "HMAC"
    }, false, ["sign"]);
    let c = yB(s, r, n, Tbr(s.length << 3));
    let u = new Uint8Array((await crypto.subtle.sign("HMAC", l, c)).slice(0, i >> 3));
    let d;
    try {
      d = mWf(o, u);
    } catch (m) {}
    if (!d) {
      throw new JWEDecryptionFailed();
    }
    let p;
    try {
      p = new Uint8Array(await crypto.subtle.decrypt({
        iv: r,
        name: "AES-CBC"
      }, a, n));
    } catch (m) {}
    if (!p) {
      throw new JWEDecryptionFailed();
    }
    return p;
  }
  async function gWf(e, t, n, r, o, s) {
    let i;
    if (t instanceof Uint8Array) {
      i = await crypto.subtle.importKey("raw", t, "AES-GCM", false, ["decrypt"]);
    } else {
      Z5(t, e, "decrypt");
      i = t;
    }
    try {
      return new Uint8Array(await crypto.subtle.decrypt({
        additionalData: s,
        iv: r,
        name: "AES-GCM",
        tagLength: 128
      }, i, yB(n, o)));
    } catch (a) {
      throw new JWEDecryptionFailed();
    }
  }
  var yWf = async (e, t, n, r, o, s) => {
    if (!Yx(t) && !(t instanceof Uint8Array)) {
      throw TypeError(AR(t, ...ab, "Uint8Array"));
    }
    switch (dWf(e, r), e) {
      case "A128CBC-HS256":
      case "A192CBC-HS384":
      case "A256CBC-HS512":
        if (t instanceof Uint8Array) {
          pWf(t, parseInt(e.slice(-3), 10));
        }
        return hWf(e, t, n, r, o, s);
      case "A128GCM":
      case "A192GCM":
      case "A256GCM":
        if (t instanceof Uint8Array) {
          pWf(t, parseInt(e.slice(1, 4), 10));
        }
        return gWf(e, t, n, r, o, s);
      default:
        throw new JOSENotSupported("Unsupported JWE Content Encryption Algorithm");
    }
  };
  var Y8c = async () => {
    throw new JOSENotSupported('JWE "zip" (Compression Algorithm) Header Parameter is not supported by your javascript runtime. You need to use the `inflateRaw` decrypt option to provide Inflate Raw implementation.');
  };
  var J8c = async () => {
    throw new JOSENotSupported('JWE "zip" (Compression Algorithm) Header Parameter is not supported by your javascript runtime. You need to use the `deflateRaw` encrypt option to provide Deflate Raw implementation.');
  };
  var hrs = __lazy(() => {
    Mf();
  });
  var _Wf = (...e) => {
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
  };
  function bWf(e) {
    return typeof e === "object" && e !== null;
  }
  function lb(e) {
    if (!bWf(e) || Object.prototype.toString.call(e) !== "[object Object]") {
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
  var SWf;
  function X8c(e, t) {
    if (e.algorithm.length !== parseInt(t.slice(1, 4), 10)) {
      throw TypeError(`Invalid key size for alg: ${t}`);
    }
  }
  function Q8c(e, t, n) {
    if (Yx(e)) {
      Z5(e, t, n);
      return e;
    }
    if (e instanceof Uint8Array) {
      return crypto.subtle.importKey("raw", e, "AES-KW", true, [n]);
    }
    throw TypeError(AR(e, ...ab, "Uint8Array"));
  }
  var Nsn = async (e, t, n) => {
    let r = await Q8c(t, e, "wrapKey");
    X8c(r, e);
    let o = await crypto.subtle.importKey("raw", n, ...SWf);
    return new Uint8Array(await crypto.subtle.wrapKey("raw", o, r, "AES-KW"));
  };
  var Lsn = async (e, t, n) => {
    let r = await Q8c(t, e, "unwrapKey");
    X8c(r, e);
    let o = await crypto.subtle.unwrapKey("raw", n, r, "AES-KW", ...SWf);
    return new Uint8Array(await crypto.subtle.exportKey("raw", o));
  };
  var Dbr = __lazy(() => {
    Xie();
  });
  async function Mbr(e, t, n, r, o = new Uint8Array(0), s = new Uint8Array(0)) {
    if (!Yx(e)) {
      throw TypeError(AR(e, ...ab));
    }
    if (Z5(e, "ECDH"), !Yx(t)) {
      throw TypeError(AR(t, ...ab));
    }
    Z5(t, "ECDH", "deriveBits");
    let i = yB(vbr($S.HS(n)), vbr(o), vbr(s), Ebr(r));
    let a;
    if (e.algorithm.name === "X25519") {
      a = 256;
    } else if (e.algorithm.name === "X448") {
      a = 448;
    } else {
      a = Math.ceil(parseInt(e.algorithm.namedCurve.substr(-3), 10) / 8) << 3;
    }
    let l = new Uint8Array(await crypto.subtle.deriveBits({
      name: e.algorithm.name,
      public: e
    }, t, a));
    return H8c(l, r, i);
  }
  async function Z8c(e) {
    if (!Yx(e)) {
      throw TypeError(AR(e, ...ab));
    }
    return crypto.subtle.generateKey(e.algorithm, true, ["deriveBits"]);
  }
  function Nbr(e) {
    if (!Yx(e)) {
      throw TypeError(AR(e, ...ab));
    }
    return ["P-256", "P-384", "P-521"].includes(e.algorithm.namedCurve) || e.algorithm.name === "X25519" || e.algorithm.name === "X448";
  }
  var yrs = __lazy(() => {
    pN();
    Xie();
  });
  function _rs(e) {
    if (!(e instanceof Uint8Array) || e.length < 8) {
      throw new JWEInvalid("PBES2 Salt Input must be 8 or more octets");
    }
  }
  var tVc = __lazy(() => {
    Mf();
  });
  function TWf(e, t) {
    if (e instanceof Uint8Array) {
      return crypto.subtle.importKey("raw", e, "PBKDF2", false, ["deriveBits"]);
    }
    if (Yx(e)) {
      Z5(e, t, "deriveBits", "deriveKey");
      return e;
    }
    throw TypeError(AR(e, ...ab, "Uint8Array"));
  }
  async function nVc(e, t, n, r) {
    _rs(e);
    let o = $8c(t, e);
    let s = parseInt(t.slice(13, 16), 10);
    let i = {
      hash: `SHA-${t.slice(8, 11)}`,
      iterations: n,
      name: "PBKDF2",
      salt: o
    };
    let a = {
      length: s,
      name: "AES-KW"
    };
    let l = await TWf(r, t);
    if (l.usages.includes("deriveBits")) {
      return new Uint8Array(await crypto.subtle.deriveBits(i, l, s));
    }
    if (l.usages.includes("deriveKey")) {
      return crypto.subtle.deriveKey(i, l, a, false, ["wrapKey", "unwrapKey"]);
    }
    throw TypeError('PBKDF2 key "usages" must include "deriveBits" or "deriveKey"');
  }
  var rVc = async (e, t, n, r = 2048, o = p2e(new Uint8Array(16))) => {
    let s = await nVc(o, e, r, t);
    return {
      encryptedKey: await Nsn(e.slice(-6), s, n),
      p2c: r,
      p2s: HS(o)
    };
  };
  var oVc = async (e, t, n, r, o) => {
    let s = await nVc(o, e, r, t);
    return Lsn(e.slice(-6), s, n);
  };
  var brs = __lazy(() => {
    Msn();
    pN();
    _B();
    Dbr();
    tVc();
    Xie();
  });
  function pkt(e) {
    switch (e) {
      case "RSA-OAEP":
      case "RSA-OAEP-256":
      case "RSA-OAEP-384":
      case "RSA-OAEP-512":
        return "RSA-OAEP";
      default:
        throw new JOSENotSupported(`alg ${e} is not supported either by JOSE or your javascript runtime`);
    }
  }
  var sVc = __lazy(() => {
    Mf();
  });
  var zXe = (e, t) => {
    if (e.startsWith("RS") || e.startsWith("PS")) {
      let {
        modulusLength: n
      } = t.algorithm;
      if (typeof n !== "number" || n < 2048) {
        throw TypeError(`${e} requires key modulusLength to be 2048 bits or larger`);
      }
    }
  };
  var iVc = async (e, t, n) => {
    if (!Yx(t)) {
      throw TypeError(AR(t, ...ab));
    }
    if (Z5(t, e, "encrypt", "wrapKey"), zXe(e, t), t.usages.includes("encrypt")) {
      return new Uint8Array(await crypto.subtle.encrypt(pkt(e), t, n));
    }
    if (t.usages.includes("wrapKey")) {
      let r = await crypto.subtle.importKey("raw", n, ...SWf);
      return new Uint8Array(await crypto.subtle.wrapKey("raw", r, t, pkt(e)));
    }
    throw TypeError('RSA-OAEP key "usages" must include "encrypt" or "wrapKey" for this operation');
  };
  var aVc = async (e, t, n) => {
    if (!Yx(t)) {
      throw TypeError(AR(t, ...ab));
    }
    if (Z5(t, e, "decrypt", "unwrapKey"), zXe(e, t), t.usages.includes("decrypt")) {
      return new Uint8Array(await crypto.subtle.decrypt(pkt(e), t, n));
    }
    if (t.usages.includes("unwrapKey")) {
      let r = await crypto.subtle.unwrapKey("raw", n, t, pkt(e), ...SWf);
      return new Uint8Array(await crypto.subtle.exportKey("raw", r));
    }
    throw TypeError('RSA-OAEP key "usages" must include "decrypt" or "unwrapKey" for this operation');
  };
  var Srs = __lazy(() => {
    sVc();
    Xie();
  });
  function Fsn(e) {
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
        throw new JOSENotSupported(`Unsupported JWE Algorithm: ${e}`);
    }
  }
  var Vhe = e => p2e(new Uint8Array(Fsn(e) >> 3));
  var Usn = __lazy(() => {
    Mf();
    Msn();
  });
  var Trs = (e, t) => {
    let n = (e.match(/.{1,64}/g) || []).join(`
`);
    return `-----BEGIN ${t}-----
${n}
-----END ${t}-----`;
  };
  function cVc(e) {
    let t = [];
    let n = 0;
    while (n < e.length) {
      let r = hVc(e.subarray(n));
      t.push(r);
      n += r.byteLength;
    }
    return t;
  }
  function hVc(e) {
    let t = 0;
    let n = e[0] & 31;
    if (t++, n === 31) {
      n = 0;
      while (e[t] >= 128) {
        n = n * 128 + e[t] - 128;
        t++;
      }
      n = n * 128 + e[t] - 128;
      t++;
    }
    let r = 0;
    if (e[t] < 128) {
      r = e[t];
      t++;
    } else if (r === 128) {
      r = 0;
      while (e[t + r] !== 0 || e[t + r + 1] !== 0) {
        if (r > e.byteLength) {
          throw TypeError("invalid indefinite form length");
        }
        r++;
      }
      let s = t + r + 2;
      return {
        byteLength: s,
        contents: e.subarray(t, t + r),
        raw: e.subarray(0, s)
      };
    } else {
      let s = e[t] & 127;
      t++;
      r = 0;
      for (let i = 0; i < s; i++) {
        r = r * 256 + e[t];
        t++;
      }
    }
    let o = t + r;
    return {
      byteLength: o,
      contents: e.subarray(t, o),
      raw: e.subarray(0, o)
    };
  }
  function EWf(e) {
    let t = cVc(cVc(hVc(e).contents)[0].contents);
    return wbr(t[t[0].raw[0] === 160 ? 6 : 5].raw);
  }
  function vWf(e) {
    let t = e.replace(/(?:-----(?:BEGIN|END) CERTIFICATE-----|\s)/g, "");
    let n = ars(t);
    return Trs(EWf(n), "PUBLIC KEY");
  }
  var uVc = async (e, t, n) => {
    if (!Yx(n)) {
      throw TypeError(AR(n, ...ab));
    }
    if (!n.extractable) {
      throw TypeError("CryptoKey is not extractable");
    }
    if (n.type !== e) {
      throw TypeError(`key is not a ${e} key`);
    }
    return Trs(wbr(new Uint8Array(await crypto.subtle.exportKey(t, n))), `${e.toUpperCase()} KEY`);
  };
  var dVc = e => uVc("public", "spki", e);
  var pVc = e => uVc("private", "pkcs8", e);
  var f2e = (e, t, n = 0) => {
    if (n === 0) {
      t.unshift(t.length);
      t.unshift(6);
    }
    let r = e.indexOf(t[0], n);
    if (r === -1) {
      return false;
    }
    let o = e.subarray(r, r + t.length);
    if (o.length !== t.length) {
      return false;
    }
    return o.every((s, i) => s === t[i]) || f2e(e, t, r + 1);
  };
  var lVc = e => {
    switch (true) {
      case f2e(e, [42, 134, 72, 206, 61, 3, 1, 7]):
        return "P-256";
      case f2e(e, [43, 129, 4, 0, 34]):
        return "P-384";
      case f2e(e, [43, 129, 4, 0, 35]):
        return "P-521";
      case f2e(e, [43, 101, 110]):
        return "X25519";
      case f2e(e, [43, 101, 111]):
        return "X448";
      case f2e(e, [43, 101, 112]):
        return "Ed25519";
      case f2e(e, [43, 101, 113]):
        return "Ed448";
      default:
        throw new JOSENotSupported("Invalid or unsupported EC Key Curve or OKP Key Sub Type");
    }
  };
  var mVc = async (e, t, n, r, o) => {
    var s;
    let i;
    let a;
    let l = new Uint8Array(atob(n.replace(e, "")).split("").map(u => u.charCodeAt(0)));
    let c = t === "spki";
    switch (r) {
      case "PS256":
      case "PS384":
      case "PS512":
        i = {
          name: "RSA-PSS",
          hash: `SHA-${r.slice(-3)}`
        };
        a = c ? ["verify"] : ["sign"];
        break;
      case "RS256":
      case "RS384":
      case "RS512":
        i = {
          name: "RSASSA-PKCS1-v1_5",
          hash: `SHA-${r.slice(-3)}`
        };
        a = c ? ["verify"] : ["sign"];
        break;
      case "RSA-OAEP":
      case "RSA-OAEP-256":
      case "RSA-OAEP-384":
      case "RSA-OAEP-512":
        i = {
          name: "RSA-OAEP",
          hash: `SHA-${parseInt(r.slice(-3), 10) || 1}`
        };
        a = c ? ["encrypt", "wrapKey"] : ["decrypt", "unwrapKey"];
        break;
      case "ES256":
        i = {
          name: "ECDSA",
          namedCurve: "P-256"
        };
        a = c ? ["verify"] : ["sign"];
        break;
      case "ES384":
        i = {
          name: "ECDSA",
          namedCurve: "P-384"
        };
        a = c ? ["verify"] : ["sign"];
        break;
      case "ES512":
        i = {
          name: "ECDSA",
          namedCurve: "P-521"
        };
        a = c ? ["verify"] : ["sign"];
        break;
      case "ECDH-ES":
      case "ECDH-ES+A128KW":
      case "ECDH-ES+A192KW":
      case "ECDH-ES+A256KW":
        {
          let u = lVc(l);
          i = u.startsWith("P-") ? {
            name: "ECDH",
            namedCurve: u
          } : {
            name: u
          };
          a = c ? [] : ["deriveBits"];
          break;
        }
      case "EdDSA":
        i = {
          name: lVc(l)
        };
        a = c ? ["verify"] : ["sign"];
        break;
      default:
        throw new JOSENotSupported('Invalid or unsupported "alg" (Algorithm) value');
    }
    return crypto.subtle.importKey(t, l, i, (s = o === null || o === undefined ? undefined : o.extractable) !== null && s !== undefined ? s : false, a);
  };
  var fVc = (e, t, n) => mVc(/(?:-----(?:BEGIN|END) PRIVATE KEY-----|\s)/g, "pkcs8", e, t, n);
  var Ers = (e, t, n) => mVc(/(?:-----(?:BEGIN|END) PUBLIC KEY-----|\s)/g, "spki", e, t, n);
  var gVc = (e, t, n) => {
    let r;
    try {
      r = vWf(e);
    } catch (o) {
      throw TypeError("Failed to parse the X.509 certificate", {
        cause: o
      });
    }
    return Ers(r, t, n);
  };
  var Lbr = __lazy(() => {
    _B();
    Mf();
    Xie();
  });
  function wWf(e) {
    let t;
    let n;
    switch (e.kty) {
      case "oct":
        {
          switch (e.alg) {
            case "HS256":
            case "HS384":
            case "HS512":
              t = {
                name: "HMAC",
                hash: `SHA-${e.alg.slice(-3)}`
              };
              n = ["sign", "verify"];
              break;
            case "A128CBC-HS256":
            case "A192CBC-HS384":
            case "A256CBC-HS512":
              throw new JOSENotSupported(`${e.alg} keys cannot be imported as CryptoKey instances`);
            case "A128GCM":
            case "A192GCM":
            case "A256GCM":
            case "A128GCMKW":
            case "A192GCMKW":
            case "A256GCMKW":
              t = {
                name: "AES-GCM"
              };
              n = ["encrypt", "decrypt"];
              break;
            case "A128KW":
            case "A192KW":
            case "A256KW":
              t = {
                name: "AES-KW"
              };
              n = ["wrapKey", "unwrapKey"];
              break;
            case "PBES2-HS256+A128KW":
            case "PBES2-HS384+A192KW":
            case "PBES2-HS512+A256KW":
              t = {
                name: "PBKDF2"
              };
              n = ["deriveBits"];
              break;
            default:
              throw new JOSENotSupported('Invalid or unsupported JWK "alg" (Algorithm) Parameter value');
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
              throw new JOSENotSupported('Invalid or unsupported JWK "alg" (Algorithm) Parameter value');
          }
          break;
        }
      case "EC":
        {
          switch (e.alg) {
            case "ES256":
              t = {
                name: "ECDSA",
                namedCurve: "P-256"
              };
              n = e.d ? ["sign"] : ["verify"];
              break;
            case "ES384":
              t = {
                name: "ECDSA",
                namedCurve: "P-384"
              };
              n = e.d ? ["sign"] : ["verify"];
              break;
            case "ES512":
              t = {
                name: "ECDSA",
                namedCurve: "P-521"
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
              throw new JOSENotSupported('Invalid or unsupported JWK "alg" (Algorithm) Parameter value');
          }
          break;
        }
      case "OKP":
        {
          switch (e.alg) {
            case "EdDSA":
              t = {
                name: e.crv
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
              throw new JOSENotSupported('Invalid or unsupported JWK "alg" (Algorithm) Parameter value');
          }
          break;
        }
      default:
        throw new JOSENotSupported('Invalid or unsupported JWK "kty" (Key Type) Parameter value');
    }
    return {
      algorithm: t,
      keyUsages: n
    };
  }
  var CWf = async e => {
    var t;
    var n;
    if (!e.alg) {
      throw TypeError('"alg" argument is required when "jwk.alg" is not present');
    }
    let {
      algorithm: r,
      keyUsages: o
    } = wWf(e);
    let s = [r, (t = e.ext) !== null && t !== undefined ? t : false, (n = e.key_ops) !== null && n !== undefined ? n : o];
    if (r.name === "PBKDF2") {
      return crypto.subtle.importKey("raw", oC(e.k), ...s);
    }
    let i = {
      ...e
    };
    delete i.alg;
    delete i.use;
    return crypto.subtle.importKey("jwk", i, ...s);
  };
  async function importSPKI(e, t, n) {
    if (typeof e !== "string" || e.indexOf("-----BEGIN PUBLIC KEY-----") !== 0) {
      throw TypeError('"spki" must be SPKI formatted string');
    }
    return Ers(e, t, n);
  }
  async function importX509(e, t, n) {
    if (typeof e !== "string" || e.indexOf("-----BEGIN CERTIFICATE-----") !== 0) {
      throw TypeError('"x509" must be X.509 formatted string');
    }
    return gVc(e, t, n);
  }
  async function importPKCS8(e, t, n) {
    if (typeof e !== "string" || e.indexOf("-----BEGIN PRIVATE KEY-----") !== 0) {
      throw TypeError('"pkcs8" must be PKCS#8 formatted string');
    }
    return fVc(e, t, n);
  }
  async function importJWK(e, t, n) {
    var r;
    if (!lb(e)) {
      throw TypeError("JWK must be an object");
    }
    switch (t || (t = e.alg), e.kty) {
      case "oct":
        if (typeof e.k !== "string" || !e.k) {
          throw TypeError('missing "k" (Key Value) Parameter value');
        }
        if (n !== null && n !== undefined || (n = e.ext !== true), n) {
          return CWf({
            ...e,
            alg: t,
            ext: (r = e.ext) !== null && r !== undefined ? r : false
          });
        }
        return oC(e.k);
      case "RSA":
        if (e.oth !== undefined) {
          throw new JOSENotSupported('RSA JWK "oth" (Other Primes Info) Parameter value is not supported');
        }
      case "EC":
      case "OKP":
        return CWf({
          ...e,
          alg: t
        });
      default:
        throw new JOSENotSupported('Unsupported "kty" (Key Type) Parameter value');
    }
  }
  var Bsn = __lazy(() => {
    _B();
    Lbr();
    Mf();
  });
  var RWf = (e, t) => {
    if (t instanceof Uint8Array) {
      return;
    }
    if (!mrs(t)) {
      throw TypeError(prs(e, t, ...ab, "Uint8Array"));
    }
    if (t.type !== "secret") {
      throw TypeError(`${ab.join(" or ")} instances for symmetric algorithms must be of type "secret"`);
    }
  };
  var xWf = (e, t, n) => {
    if (!mrs(t)) {
      throw TypeError(prs(e, t, ...ab));
    }
    if (t.type === "secret") {
      throw TypeError(`${ab.join(" or ")} instances for asymmetric algorithms must not be of type "secret"`);
    }
    if (n === "sign" && t.type === "public") {
      throw TypeError(`${ab.join(" or ")} instances for asymmetric algorithm signing must be of type "private"`);
    }
    if (n === "decrypt" && t.type === "public") {
      throw TypeError(`${ab.join(" or ")} instances for asymmetric algorithm decryption must be of type "private"`);
    }
    if (t.algorithm && n === "verify" && t.type === "private") {
      throw TypeError(`${ab.join(" or ")} instances for asymmetric algorithm verifying must be of type "public"`);
    }
    if (t.algorithm && n === "encrypt" && t.type === "private") {
      throw TypeError(`${ab.join(" or ")} instances for asymmetric algorithm encryption must be of type "public"`);
    }
  };
  var kWf = (e, t, n) => {
    if (e.startsWith("HS") || e === "dir" || e.startsWith("PBES2") || /^A\d{3}(?:GCM)?KW$/.test(e)) {
      RWf(e, t);
    } else {
      xWf(e, t, n);
    }
  };
  async function AWf(e, t, n, r, o) {
    if (!(n instanceof Uint8Array)) {
      throw TypeError(AR(n, "Uint8Array"));
    }
    let s = parseInt(e.slice(1, 4), 10);
    let i = await crypto.subtle.importKey("raw", n.subarray(s >> 3), "AES-CBC", false, ["encrypt"]);
    let a = await crypto.subtle.importKey("raw", n.subarray(0, s >> 3), {
      hash: `SHA-${s << 1}`,
      name: "HMAC"
    }, false, ["sign"]);
    let l = new Uint8Array(await crypto.subtle.encrypt({
      iv: r,
      name: "AES-CBC"
    }, i, t));
    let c = yB(o, r, l, Tbr(o.length << 3));
    let u = new Uint8Array((await crypto.subtle.sign("HMAC", a, c)).slice(0, s >> 3));
    return {
      ciphertext: l,
      tag: u
    };
  }
  async function IWf(e, t, n, r, o) {
    let s;
    if (n instanceof Uint8Array) {
      s = await crypto.subtle.importKey("raw", n, "AES-GCM", false, ["encrypt"]);
    } else {
      Z5(n, e, "encrypt");
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
      tag: a
    };
  }
  var PWf = async (e, t, n, r, o) => {
    if (!Yx(n) && !(n instanceof Uint8Array)) {
      throw TypeError(AR(n, ...ab, "Uint8Array"));
    }
    switch (dWf(e, r), e) {
      case "A128CBC-HS256":
      case "A192CBC-HS384":
      case "A256CBC-HS512":
        if (n instanceof Uint8Array) {
          pWf(n, parseInt(e.slice(-3), 10));
        }
        return AWf(e, t, n, r, o);
      case "A128GCM":
      case "A192GCM":
      case "A256GCM":
        if (n instanceof Uint8Array) {
          pWf(n, parseInt(e.slice(1, 4), 10));
        }
        return IWf(e, t, n, r, o);
      default:
        throw new JOSENotSupported("Unsupported JWE Content Encryption Algorithm");
    }
  };
  async function TVc(e, t, n, r) {
    let o = e.slice(0, 7);
    r || (r = kbr(o));
    let {
      ciphertext: s,
      tag: i
    } = await PWf(o, n, t, r, new Uint8Array(0));
    return {
      encryptedKey: s,
      iv: HS(r),
      tag: HS(i)
    };
  }
  async function EVc(e, t, n, r, o) {
    let s = e.slice(0, 7);
    return yWf(s, t, n, r, o, new Uint8Array(0));
  }
  var Crs = __lazy(() => {
    Abr();
    _B();
  });
  async function OWf(e, t, n, r, o) {
    switch (kWf(e, t, "decrypt"), e) {
      case "dir":
        {
          if (n !== undefined) {
            throw new JWEInvalid("Encountered unexpected JWE Encrypted Key");
          }
          return t;
        }
      case "ECDH-ES":
        if (n !== undefined) {
          throw new JWEInvalid("Encountered unexpected JWE Encrypted Key");
        }
      case "ECDH-ES+A128KW":
      case "ECDH-ES+A192KW":
      case "ECDH-ES+A256KW":
        {
          if (!lb(r.epk)) {
            throw new JWEInvalid('JOSE Header "epk" (Ephemeral Public Key) missing or invalid');
          }
          if (!Nbr(t)) {
            throw new JOSENotSupported("ECDH with the provided key is not allowed or not supported by your javascript runtime");
          }
          let s = await importJWK(r.epk, e);
          let i;
          let a;
          if (r.apu !== undefined) {
            if (typeof r.apu !== "string") {
              throw new JWEInvalid('JOSE Header "apu" (Agreement PartyUInfo) invalid');
            }
            try {
              i = oC(r.apu);
            } catch (c) {
              throw new JWEInvalid("Failed to base64url decode the apu");
            }
          }
          if (r.apv !== undefined) {
            if (typeof r.apv !== "string") {
              throw new JWEInvalid('JOSE Header "apv" (Agreement PartyVInfo) invalid');
            }
            try {
              a = oC(r.apv);
            } catch (c) {
              throw new JWEInvalid("Failed to base64url decode the apv");
            }
          }
          let l = await Mbr(s, t, e === "ECDH-ES" ? r.$ef : e, e === "ECDH-ES" ? Fsn(r.$ef) : parseInt(e.slice(-5, -2), 10), i, a);
          if (e === "ECDH-ES") {
            return l;
          }
          if (n === undefined) {
            throw new JWEInvalid("JWE Encrypted Key missing");
          }
          return Lsn(e.slice(-6), l, n);
        }
      case "RSA1_5":
      case "RSA-OAEP":
      case "RSA-OAEP-256":
      case "RSA-OAEP-384":
      case "RSA-OAEP-512":
        {
          if (n === undefined) {
            throw new JWEInvalid("JWE Encrypted Key missing");
          }
          return aVc(e, t, n);
        }
      case "PBES2-HS256+A128KW":
      case "PBES2-HS384+A192KW":
      case "PBES2-HS512+A256KW":
        {
          if (n === undefined) {
            throw new JWEInvalid("JWE Encrypted Key missing");
          }
          if (typeof r.p2c !== "number") {
            throw new JWEInvalid('JOSE Header "p2c" (PBES2 Count) missing or invalid');
          }
          let s = (o === null || o === undefined ? undefined : o.maxPBES2Count) || 1e4;
          if (r.p2c > s) {
            throw new JWEInvalid('JOSE Header "p2c" (PBES2 Count) out is of acceptable bounds');
          }
          if (typeof r.p2s !== "string") {
            throw new JWEInvalid('JOSE Header "p2s" (PBES2 Salt) missing or invalid');
          }
          let i;
          try {
            i = oC(r.p2s);
          } catch (a) {
            throw new JWEInvalid("Failed to base64url decode the p2s");
          }
          return oVc(e, t, n, r.p2c, i);
        }
      case "A128KW":
      case "A192KW":
      case "A256KW":
        {
          if (n === undefined) {
            throw new JWEInvalid("JWE Encrypted Key missing");
          }
          return Lsn(e, t, n);
        }
      case "A128GCMKW":
      case "A192GCMKW":
      case "A256GCMKW":
        {
          if (n === undefined) {
            throw new JWEInvalid("JWE Encrypted Key missing");
          }
          if (typeof r.iv !== "string") {
            throw new JWEInvalid('JOSE Header "iv" (Initialization Vector) missing or invalid');
          }
          if (typeof r.tag !== "string") {
            throw new JWEInvalid('JOSE Header "tag" (Authentication Tag) missing or invalid');
          }
          let s;
          try {
            s = oC(r.iv);
          } catch (a) {
            throw new JWEInvalid("Failed to base64url decode the iv");
          }
          let i;
          try {
            i = oC(r.tag);
          } catch (a) {
            throw new JWEInvalid("Failed to base64url decode the tag");
          }
          return EVc(e, t, n, s, i);
        }
      default:
        throw new JOSENotSupported('Invalid or unsupported "alg" (JWE Algorithm) header value');
    }
  }
  function DWf(e, t, n, r, o) {
    if (o.crit !== undefined && r.crit === undefined) {
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
        throw new JOSENotSupported(`Extension Header Parameter "${i}" is not recognized`);
      }
      if (o[i] === undefined) {
        throw new e(`Extension Header Parameter "${i}" is missing`);
      } else if (s.get(i) && r[i] === undefined) {
        throw new e(`Extension Header Parameter "${i}" MUST be integrity protected`);
      }
    }
    return new Set(r.crit);
  }
  var MWf = (e, t) => {
    if (t !== undefined && (!Array.isArray(t) || t.some(n => typeof n !== "string"))) {
      throw TypeError(`"${e}" option must be an array of strings`);
    }
    if (!t) {
      return;
    }
    return new Set(t);
  };
  async function flattenedDecrypt(e, t, n) {
    var r;
    if (!lb(e)) {
      throw new JWEInvalid("Flattened JWE must be an object");
    }
    if (e.protected === undefined && e.header === undefined && e.unprotected === undefined) {
      throw new JWEInvalid("JOSE Header missing");
    }
    if (typeof e.iv !== "string") {
      throw new JWEInvalid("JWE Initialization Vector missing or incorrect type");
    }
    if (typeof e.ciphertext !== "string") {
      throw new JWEInvalid("JWE Ciphertext missing or incorrect type");
    }
    if (typeof e.tag !== "string") {
      throw new JWEInvalid("JWE Authentication Tag missing or incorrect type");
    }
    if (e.protected !== undefined && typeof e.protected !== "string") {
      throw new JWEInvalid("JWE Protected Header incorrect type");
    }
    if (e.encrypted_key !== undefined && typeof e.encrypted_key !== "string") {
      throw new JWEInvalid("JWE Encrypted Key incorrect type");
    }
    if (e.aad !== undefined && typeof e.aad !== "string") {
      throw new JWEInvalid("JWE AAD incorrect type");
    }
    if (e.header !== undefined && !lb(e.header)) {
      throw new JWEInvalid("JWE Shared Unprotected Header incorrect type");
    }
    if (e.unprotected !== undefined && !lb(e.unprotected)) {
      throw new JWEInvalid("JWE Per-Recipient Unprotected Header incorrect type");
    }
    let o;
    if (e.protected) {
      try {
        let S = oC(e.protected);
        o = JSON.parse(RA.oC(S));
      } catch (S) {
        throw new JWEInvalid("JWE Protected Header is invalid");
      }
    }
    if (!_Wf(o, e.header, e.unprotected)) {
      throw new JWEInvalid("JWE Protected, JWE Unprotected Header, and JWE Per-Recipient Unprotected Header Parameter names must be disjoint");
    }
    let s = {
      ...o,
      ...e.header,
      ...e.unprotected
    };
    if (DWf(JWEInvalid, new Map(), n === null || n === undefined ? undefined : n.crit, o, s), s.zip !== undefined) {
      if (!o || !o.zip) {
        throw new JWEInvalid('JWE "zip" (Compression Algorithm) Header MUST be integrity protected');
      }
      if (s.zip !== "DEF") {
        throw new JOSENotSupported('Unsupported JWE "zip" (Compression Algorithm) Header Parameter value');
      }
    }
    let {
      alg: i,
      $ef: a
    } = s;
    if (typeof i !== "string" || !i) {
      throw new JWEInvalid("missing JWE Algorithm (alg) in JWE Header");
    }
    if (typeof a !== "string" || !a) {
      throw new JWEInvalid("missing JWE Encryption Algorithm (enc) in JWE Header");
    }
    let l = n && MWf("keyManagementAlgorithms", n.keyManagementAlgorithms);
    let c = n && MWf("contentEncryptionAlgorithms", n.contentEncryptionAlgorithms);
    if (l && !l.vZc(i)) {
      throw new JOSEAlgNotAllowed('"alg" (Algorithm) Header Parameter not allowed');
    }
    if (c && !c.vZc(a)) {
      throw new JOSEAlgNotAllowed('"enc" (Encryption Algorithm) Header Parameter not allowed');
    }
    let u;
    if (e.encrypted_key !== undefined) {
      try {
        u = oC(e.encrypted_key);
      } catch (S) {
        throw new JWEInvalid("Failed to base64url decode the encrypted_key");
      }
    }
    let d = false;
    if (typeof t === "function") {
      t = await t(o, e);
      d = true;
    }
    let p;
    try {
      p = await OWf(i, t, u, s, n);
    } catch (S) {
      if (S instanceof TypeError || S instanceof JWEInvalid || S instanceof JOSENotSupported) {
        throw S;
      }
      p = Vhe(a);
    }
    let m;
    let f;
    try {
      m = oC(e.iv);
    } catch (S) {
      throw new JWEInvalid("Failed to base64url decode the iv");
    }
    try {
      f = oC(e.tag);
    } catch (S) {
      throw new JWEInvalid("Failed to base64url decode the tag");
    }
    let h = $S.HS((r = e.protected) !== null && r !== undefined ? r : "");
    let g;
    if (e.aad !== undefined) {
      g = yB(h, $S.HS("."), $S.HS(e.aad));
    } else {
      g = h;
    }
    let y;
    try {
      y = oC(e.ciphertext);
    } catch (S) {
      throw new JWEInvalid("Failed to base64url decode the ciphertext");
    }
    let _ = await yWf(a, p, y, m, f, g);
    if (s.zip === "DEF") {
      _ = await ((n === null || n === undefined ? undefined : n.inflateRaw) || Y8c)(_);
    }
    let b = {
      plaintext: _
    };
    if (e.protected !== undefined) {
      b.protectedHeader = o;
    }
    if (e.aad !== undefined) {
      try {
        b.additionalAuthenticatedData = oC(e.aad);
      } catch (S) {
        throw new JWEInvalid("Failed to base64url decode the aad");
      }
    }
    if (e.unprotected !== undefined) {
      b.sharedUnprotectedHeader = e.unprotected;
    }
    if (e.header !== undefined) {
      b.unprotectedHeader = e.header;
    }
    if (d) {
      return {
        ...b,
        key: t
      };
    }
    return b;
  }
  var Fbr = __lazy(() => {
    _B();
    hrs();
    Mf();
    pN();
    Usn();
  });
  async function compactDecrypt(e, t, n) {
    if (e instanceof Uint8Array) {
      e = RA.oC(e);
    }
    if (typeof e !== "string") {
      throw new JWEInvalid("Compact JWE must be a string or Uint8Array");
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
      throw new JWEInvalid("Invalid Compact JWE");
    }
    let c = await flattenedDecrypt({
      ciphertext: i,
      iv: s || undefined,
      protected: r || undefined,
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
  var xrs = __lazy(() => {
    Fbr();
    Mf();
    pN();
  });
  async function generalDecrypt(e, t, n) {
    if (!lb(e)) {
      throw new JWEInvalid("General JWE must be an object");
    }
    if (!Array.isArray(e.recipients) || !e.recipients.every(lb)) {
      throw new JWEInvalid("JWE Recipients missing or incorrect type");
    }
    if (!e.recipients.length) {
      throw new JWEInvalid("JWE Recipients has no members");
    }
    for (let r of e.recipients) {
      try {
        return await flattenedDecrypt({
          aad: e.aad,
          ciphertext: e.ciphertext,
          encrypted_key: r.encrypted_key,
          header: r.header,
          iv: e.iv,
          protected: e.protected,
          tag: e.tag,
          unprotected: e.unprotected
        }, t, n);
      } catch (o) {}
    }
    throw new JWEDecryptionFailed();
  }
  var RVc = __lazy(() => {
    Fbr();
    Mf();
  });
  var NWf = async e => {
    if (e instanceof Uint8Array) {
      return {
        kty: "oct",
        k: HS(e)
      };
    }
    if (!Yx(e)) {
      throw TypeError(AR(e, ...ab, "Uint8Array"));
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
    return s;
  };
  async function exportSPKI(e) {
    return dVc(e);
  }
  async function exportPKCS8(e) {
    return pVc(e);
  }
  async function exportJWK(e) {
    return NWf(e);
  }
  var krs = __lazy(() => {
    Lbr();
    Lbr();
  });
  async function LWf(e, t, n, r, o = {}) {
    let s;
    let i;
    let a;
    switch (kWf(e, n, "encrypt"), e) {
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
          if (!Nbr(n)) {
            throw new JOSENotSupported("ECDH with the provided key is not allowed or not supported by your javascript runtime");
          }
          let {
            apu: l,
            apv: c
          } = o;
          let {
            epk: u
          } = o;
          u || (u = (await Z8c(n)).privateKey);
          let {
            x: d,
            y: p,
            crv: m,
            kty: f
          } = await exportJWK(u);
          let h = await Mbr(n, u, e === "ECDH-ES" ? t : e, e === "ECDH-ES" ? Fsn(t) : parseInt(e.slice(-5, -2), 10), l, c);
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
            i.apu = HS(l);
          }
          if (c) {
            i.apv = HS(c);
          }
          if (e === "ECDH-ES") {
            a = h;
            break;
          }
          a = r || Vhe(t);
          let g = e.slice(-6);
          s = await Nsn(g, h, a);
          break;
        }
      case "RSA1_5":
      case "RSA-OAEP":
      case "RSA-OAEP-256":
      case "RSA-OAEP-384":
      case "RSA-OAEP-512":
        {
          a = r || Vhe(t);
          s = await iVc(e, n, a);
          break;
        }
      case "PBES2-HS256+A128KW":
      case "PBES2-HS384+A192KW":
      case "PBES2-HS512+A256KW":
        {
          a = r || Vhe(t);
          let {
            p2c: l,
            p2s: c
          } = o;
          ({
            encryptedKey: s,
            ...i
          } = await rVc(e, n, a, l, c));
          break;
        }
      case "A128KW":
      case "A192KW":
      case "A256KW":
        {
          a = r || Vhe(t);
          s = await Nsn(e, n, a);
          break;
        }
      case "A128GCMKW":
      case "A192GCMKW":
      case "A256GCMKW":
        {
          a = r || Vhe(t);
          let {
            iv: l
          } = o;
          ({
            encryptedKey: s,
            ...i
          } = await TVc(e, n, a, l));
          break;
        }
      default:
        throw new JOSENotSupported('Invalid or unsupported "alg" (JWE Algorithm) header value');
    }
    return {
      cek: a,
      encryptedKey: s,
      parameters: i
    };
  }
  class FlattenedEncrypt {
    constructor(e) {
      if (!(e instanceof Uint8Array)) {
        throw TypeError("plaintext must be an instance of Uint8Array");
      }
      this._plaintext = e;
    }
    setKeyManagementParameters(e) {
      if (this._keyManagementParameters) {
        throw TypeError("setKeyManagementParameters can only be called once");
      }
      this._keyManagementParameters = e;
      return this;
    }
    setProtectedHeader(e) {
      if (this._protectedHeader) {
        throw TypeError("setProtectedHeader can only be called once");
      }
      this._protectedHeader = e;
      return this;
    }
    setSharedUnprotectedHeader(e) {
      if (this._sharedUnprotectedHeader) {
        throw TypeError("setSharedUnprotectedHeader can only be called once");
      }
      this._sharedUnprotectedHeader = e;
      return this;
    }
    setUnprotectedHeader(e) {
      if (this._unprotectedHeader) {
        throw TypeError("setUnprotectedHeader can only be called once");
      }
      this._unprotectedHeader = e;
      return this;
    }
    setAdditionalAuthenticatedData(e) {
      this._aad = e;
      return this;
    }
    setContentEncryptionKey(e) {
      if (this._cek) {
        throw TypeError("setContentEncryptionKey can only be called once");
      }
      this._cek = e;
      return this;
    }
    setInitializationVector(e) {
      if (this._iv) {
        throw TypeError("setInitializationVector can only be called once");
      }
      this._iv = e;
      return this;
    }
    async encrypt(e, t) {
      if (!this._protectedHeader && !this._unprotectedHeader && !this._sharedUnprotectedHeader) {
        throw new JWEInvalid("either setProtectedHeader, setUnprotectedHeader, or sharedUnprotectedHeader must be called before #encrypt()");
      }
      if (!_Wf(this._protectedHeader, this._unprotectedHeader, this._sharedUnprotectedHeader)) {
        throw new JWEInvalid("JWE Protected, JWE Shared Unprotected and JWE Per-Recipient Header Parameter names must be disjoint");
      }
      let n = {
        ...this._protectedHeader,
        ...this._unprotectedHeader,
        ...this._sharedUnprotectedHeader
      };
      if (DWf(JWEInvalid, new Map(), t === null || t === undefined ? undefined : t.crit, this._protectedHeader, n), n.zip !== undefined) {
        if (!this._protectedHeader || !this._protectedHeader.zip) {
          throw new JWEInvalid('JWE "zip" (Compression Algorithm) Header MUST be integrity protected');
        }
        if (n.zip !== "DEF") {
          throw new JOSENotSupported('Unsupported JWE "zip" (Compression Algorithm) Header Parameter value');
        }
      }
      let {
        alg: r,
        $ef: o
      } = n;
      if (typeof r !== "string" || !r) {
        throw new JWEInvalid('JWE "alg" (Algorithm) Header Parameter missing or invalid');
      }
      if (typeof o !== "string" || !o) {
        throw new JWEInvalid('JWE "enc" (Encryption Algorithm) Header Parameter missing or invalid');
      }
      let s;
      if (r === "dir") {
        if (this._cek) {
          throw TypeError("setContentEncryptionKey cannot be called when using Direct Encryption");
        }
      } else if (r === "ECDH-ES") {
        if (this._cek) {
          throw TypeError("setContentEncryptionKey cannot be called when using Direct Key Agreement");
        }
      }
      let i;
      {
        let m;
        if ({
          cek: i,
          encryptedKey: s,
          parameters: m
        } = await LWf(r, o, e, this._cek, this._keyManagementParameters), m) {
          if (t && Irs in t) {
            if (!this._unprotectedHeader) {
              this.setUnprotectedHeader(m);
            } else {
              this._unprotectedHeader = {
                ...this._unprotectedHeader,
                ...m
              };
            }
          } else if (!this._protectedHeader) {
            this.setProtectedHeader(m);
          } else {
            this._protectedHeader = {
              ...this._protectedHeader,
              ...m
            };
          }
        }
      }
      this._iv || (this._iv = kbr(o));
      let a;
      let l;
      let c;
      if (this._protectedHeader) {
        l = $S.HS(HS(JSON.stringify(this._protectedHeader)));
      } else {
        l = $S.HS("");
      }
      if (this._aad) {
        c = HS(this._aad);
        a = yB(l, $S.HS("."), $S.HS(c));
      } else {
        a = l;
      }
      let u;
      let d;
      if (n.zip === "DEF") {
        let m = await ((t === null || t === undefined ? undefined : t.deflateRaw) || J8c)(this._plaintext);
        ({
          ciphertext: u,
          tag: d
        } = await PWf(o, m, i, this._iv, a));
      } else {
        ({
          ciphertext: u,
          tag: d
        } = await PWf(o, this._plaintext, i, this._iv, a));
      }
      let p = {
        ciphertext: HS(u),
        iv: HS(this._iv),
        tag: HS(d)
      };
      if (s) {
        p.encrypted_key = HS(s);
      }
      if (c) {
        p.aad = c;
      }
      if (this._protectedHeader) {
        p.protected = RA.oC(l);
      }
      if (this._sharedUnprotectedHeader) {
        p.unprotected = this._sharedUnprotectedHeader;
      }
      if (this._unprotectedHeader) {
        p.header = this._unprotectedHeader;
      }
      return p;
    }
  }
  var Irs;
  var Hbr = __lazy(() => {
    _B();
    hrs();
    Abr();
    Mf();
    pN();
    Irs = Symbol();
  });
  class PVc {
    constructor(e, t, n) {
      this.parent = e;
      this.key = t;
      this.options = n;
    }
    setUnprotectedHeader(e) {
      if (this.unprotectedHeader) {
        throw TypeError("setUnprotectedHeader can only be called once");
      }
      this.unprotectedHeader = e;
      return this;
    }
    addRecipient(...e) {
      return this.parent.addRecipient(...e);
    }
    encrypt(...e) {
      return this.parent.encrypt(...e);
    }
    done() {
      return this.parent;
    }
  }
  class GeneralEncrypt {
    constructor(e) {
      this._recipients = [];
      this._plaintext = e;
    }
    addRecipient(e, t) {
      let n = new PVc(this, e, {
        crit: t === null || t === undefined ? undefined : t.crit
      });
      this._recipients.push(n);
      return n;
    }
    setProtectedHeader(e) {
      if (this._protectedHeader) {
        throw TypeError("setProtectedHeader can only be called once");
      }
      this._protectedHeader = e;
      return this;
    }
    setSharedUnprotectedHeader(e) {
      if (this._unprotectedHeader) {
        throw TypeError("setSharedUnprotectedHeader can only be called once");
      }
      this._unprotectedHeader = e;
      return this;
    }
    setAdditionalAuthenticatedData(e) {
      this._aad = e;
      return this;
    }
    async encrypt(e) {
      var t;
      var n;
      var r;
      if (!this._recipients.length) {
        throw new JWEInvalid("at least one recipient must be added");
      }
      if (e = {
        deflateRaw: e === null || e === undefined ? undefined : e.deflateRaw
      }, this._recipients.length === 1) {
        let [a] = this._recipients;
        let l = await new FlattenedEncrypt(this._plaintext).setAdditionalAuthenticatedData(this._aad).setProtectedHeader(this._protectedHeader).setSharedUnprotectedHeader(this._unprotectedHeader).setUnprotectedHeader(a.unprotectedHeader).encrypt(a.key, {
          ...a.options,
          ...e
        });
        let c = {
          ciphertext: l.ciphertext,
          iv: l.iv,
          recipients: [{}],
          tag: l.tag
        };
        if (l.aad) {
          c.aad = l.aad;
        }
        if (l.protected) {
          c.protected = l.protected;
        }
        if (l.unprotected) {
          c.unprotected = l.unprotected;
        }
        if (l.encrypted_key) {
          c.recipients[0].encrypted_key = l.encrypted_key;
        }
        if (l.header) {
          c.recipients[0].header = l.header;
        }
        return c;
      }
      let o;
      for (let a = 0; a < this._recipients.length; a++) {
        let l = this._recipients[a];
        if (!_Wf(this._protectedHeader, this._unprotectedHeader, l.unprotectedHeader)) {
          throw new JWEInvalid("JWE Protected, JWE Shared Unprotected and JWE Per-Recipient Header Parameter names must be disjoint");
        }
        let c = {
          ...this._protectedHeader,
          ...this._unprotectedHeader,
          ...l.unprotectedHeader
        };
        let {
          alg: u
        } = c;
        if (typeof u !== "string" || !u) {
          throw new JWEInvalid('JWE "alg" (Algorithm) Header Parameter missing or invalid');
        }
        if (u === "dir" || u === "ECDH-ES") {
          throw new JWEInvalid('"dir" and "ECDH-ES" alg may only be used with a single recipient');
        }
        if (typeof c.$ef !== "string" || !c.$ef) {
          throw new JWEInvalid('JWE "enc" (Encryption Algorithm) Header Parameter missing or invalid');
        }
        if (!o) {
          o = c.$ef;
        } else if (o !== c.$ef) {
          throw new JWEInvalid('JWE "enc" (Encryption Algorithm) Header Parameter must be the same for all recipients');
        }
        if (DWf(JWEInvalid, new Map(), l.options.crit, this._protectedHeader, c), c.zip !== undefined) {
          if (!this._protectedHeader || !this._protectedHeader.zip) {
            throw new JWEInvalid('JWE "zip" (Compression Algorithm) Header MUST be integrity protected');
          }
        }
      }
      let s = Vhe(o);
      let i = {
        ciphertext: "",
        iv: "",
        recipients: [],
        tag: ""
      };
      for (let a = 0; a < this._recipients.length; a++) {
        let l = this._recipients[a];
        let c = {};
        i.recipients.push(c);
        let d = {
          ...this._protectedHeader,
          ...this._unprotectedHeader,
          ...l.unprotectedHeader
        }.alg.startsWith("PBES2") ? 2048 + a : undefined;
        if (a === 0) {
          let f = await new FlattenedEncrypt(this._plaintext).setAdditionalAuthenticatedData(this._aad).setContentEncryptionKey(s).setProtectedHeader(this._protectedHeader).setSharedUnprotectedHeader(this._unprotectedHeader).setUnprotectedHeader(l.unprotectedHeader).setKeyManagementParameters({
            p2c: d
          }).encrypt(l.key, {
            ...l.options,
            ...e,
            [Irs]: true
          });
          if (i.ciphertext = f.ciphertext, i.iv = f.iv, i.tag = f.tag, f.aad) {
            i.aad = f.aad;
          }
          if (f.protected) {
            i.protected = f.protected;
          }
          if (f.unprotected) {
            i.unprotected = f.unprotected;
          }
          if (c.encrypted_key = f.encrypted_key, f.header) {
            c.header = f.header;
          }
          continue;
        }
        let {
          encryptedKey: p,
          parameters: m
        } = await LWf(((t = l.unprotectedHeader) === null || t === undefined ? undefined : t.alg) || ((n = this._protectedHeader) === null || n === undefined ? undefined : n.alg) || ((r = this._unprotectedHeader) === null || r === undefined ? undefined : r.alg), o, l.key, s, {
          p2c: d
        });
        if (c.encrypted_key = HS(p), l.unprotectedHeader || m) {
          c.header = {
            ...l.unprotectedHeader,
            ...m
          };
        }
      }
      return i;
    }
  }
  var OVc = __lazy(() => {
    Hbr();
    Mf();
    Usn();
    _B();
  });
  function qsn(e, t) {
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
          saltLength: e.slice(-3) >> 3
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
      case "EdDSA":
        return {
          name: t.name
        };
      default:
        throw new JOSENotSupported(`alg ${e} is not supported either by JOSE or your javascript runtime`);
    }
  }
  var Ors = __lazy(() => {
    Mf();
  });
  function Wsn(e, t, n) {
    if (Yx(t)) {
      z8c(t, e, n);
      return t;
    }
    if (t instanceof Uint8Array) {
      if (!e.startsWith("HS")) {
        throw TypeError(AR(t, ...ab));
      }
      return crypto.subtle.importKey("raw", t, {
        hash: `SHA-${e.slice(-3)}`,
        name: "HMAC"
      }, false, [n]);
    }
    throw TypeError(AR(t, ...ab, "Uint8Array"));
  }
  var Drs = __lazy(() => {
    Xie();
  });
  var FWf = async (e, t, n, r) => {
    let o = await Wsn(e, t, "verify");
    zXe(e, o);
    let s = qsn(e, o.algorithm);
    try {
      return await crypto.subtle.verify(s, o, n, r);
    } catch (i) {
      return false;
    }
  };
  async function flattenedVerify(e, t, n) {
    var r;
    if (!lb(e)) {
      throw new JWSInvalid("Flattened JWS must be an object");
    }
    if (e.protected === undefined && e.header === undefined) {
      throw new JWSInvalid('Flattened JWS must have either of the "protected" or "header" members');
    }
    if (e.protected !== undefined && typeof e.protected !== "string") {
      throw new JWSInvalid("JWS Protected Header incorrect type");
    }
    if (e.payload === undefined) {
      throw new JWSInvalid("JWS Payload missing");
    }
    if (typeof e.signature !== "string") {
      throw new JWSInvalid("JWS Signature missing or incorrect type");
    }
    if (e.header !== undefined && !lb(e.header)) {
      throw new JWSInvalid("JWS Unprotected Header incorrect type");
    }
    let o = {};
    if (e.protected) {
      try {
        let g = oC(e.protected);
        o = JSON.parse(RA.oC(g));
      } catch (g) {
        throw new JWSInvalid("JWS Protected Header is invalid");
      }
    }
    if (!_Wf(o, e.header)) {
      throw new JWSInvalid("JWS Protected and JWS Unprotected Header Parameter names must be disjoint");
    }
    let s = {
      ...o,
      ...e.header
    };
    let i = DWf(JWSInvalid, new Map([["b64", true]]), n === null || n === undefined ? undefined : n.crit, o, s);
    let a = true;
    if (i.vZc("b64")) {
      if (a = o.b64, typeof a !== "boolean") {
        throw new JWSInvalid('The "b64" (base64url-encode payload) Header Parameter must be a boolean');
      }
    }
    let {
      alg: l
    } = s;
    if (typeof l !== "string" || !l) {
      throw new JWSInvalid('JWS "alg" (Algorithm) Header Parameter missing or invalid');
    }
    let c = n && MWf("algorithms", n.algorithms);
    if (c && !c.vZc(l)) {
      throw new JOSEAlgNotAllowed('"alg" (Algorithm) Header Parameter not allowed');
    }
    if (a) {
      if (typeof e.payload !== "string") {
        throw new JWSInvalid("JWS Payload must be a string");
      }
    } else if (typeof e.payload !== "string" && !(e.payload instanceof Uint8Array)) {
      throw new JWSInvalid("JWS Payload must be a string or an Uint8Array instance");
    }
    let u = false;
    if (typeof t === "function") {
      t = await t(o, e);
      u = true;
    }
    kWf(l, t, "verify");
    let d = yB($S.HS((r = e.protected) !== null && r !== undefined ? r : ""), $S.HS("."), typeof e.payload === "string" ? $S.HS(e.payload) : e.payload);
    let p;
    try {
      p = oC(e.signature);
    } catch (g) {
      throw new JWSInvalid("Failed to base64url decode the signature");
    }
    if (!(await FWf(l, t, p, d))) {
      throw new JWSSignatureVerificationFailed();
    }
    let f;
    if (a) {
      try {
        f = oC(e.payload);
      } catch (g) {
        throw new JWSInvalid("Failed to base64url decode the payload");
      }
    } else if (typeof e.payload === "string") {
      f = $S.HS(e.payload);
    } else {
      f = e.payload;
    }
    let h = {
      payload: f
    };
    if (e.protected !== undefined) {
      h.protectedHeader = o;
    }
    if (e.header !== undefined) {
      h.unprotectedHeader = e.header;
    }
    if (u) {
      return {
        ...h,
        key: t
      };
    }
    return h;
  }
  var jbr = __lazy(() => {
    _B();
    Mf();
    pN();
  });
  async function compactVerify(e, t, n) {
    if (e instanceof Uint8Array) {
      e = RA.oC(e);
    }
    if (typeof e !== "string") {
      throw new JWSInvalid("Compact JWS must be a string or Uint8Array");
    }
    let {
      0: r,
      1: o,
      2: s,
      length: i
    } = e.split(".");
    if (i !== 3) {
      throw new JWSInvalid("Invalid Compact JWS");
    }
    let a = await flattenedVerify({
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
  var Mrs = __lazy(() => {
    jbr();
    Mf();
    pN();
  });
  async function generalVerify(e, t, n) {
    if (!lb(e)) {
      throw new JWSInvalid("General JWS must be an object");
    }
    if (!Array.isArray(e.signatures) || !e.signatures.every(lb)) {
      throw new JWSInvalid("JWS Signatures missing or incorrect type");
    }
    for (let r of e.signatures) {
      try {
        return await flattenedVerify({
          header: r.header,
          payload: e.payload,
          protected: r.protected,
          signature: r.signature
        }, t, n);
      } catch (o) {}
    }
    throw new JWSSignatureVerificationFailed();
  }
  var LVc = __lazy(() => {
    jbr();
    Mf();
  });
  var gkt = e => Math.floor(e.getTime() / 1000);
  var UWf;
  var ykt = e => {
    let t = UWf.exec(e);
    if (!t) {
      throw TypeError("Invalid time period format");
    }
    let n = parseFloat(t[1]);
    switch (t[2].toLowerCase()) {
      case "sec":
      case "secs":
      case "second":
      case "seconds":
      case "s":
        return Math.round(n);
      case "minute":
      case "minutes":
      case "min":
      case "mins":
      case "m":
        return Math.round(n * 60);
      case "hour":
      case "hours":
      case "hr":
      case "hrs":
      case "h":
        return Math.round(n * 3600);
      case "day":
      case "days":
      case "d":
        return Math.round(n * 86400);
      case "week":
      case "weeks":
      case "w":
        return Math.round(n * 604800);
      default:
        return Math.round(n * 31557600);
    }
  };
  var Nrs = __lazy(() => {
    UWf = /^(\d+|\d+\.\d+) ?(seconds?|secs?|s|minutes?|mins?|m|hours?|hrs?|h|days?|d|weeks?|w|years?|yrs?|y)$/i;
  });
  var FVc = e => e.toLowerCase().replace(/^application\//, "");
  var BWf = (e, t) => {
    if (typeof e === "string") {
      return t.includes(e);
    }
    if (Array.isArray(e)) {
      return t.some(Set.prototype.vZc.bind(new Set(e)));
    }
    return false;
  };
  var _kt = (e, t, n = {}) => {
    let {
      typ: r
    } = n;
    if (r && (typeof e.typ !== "string" || FVc(e.typ) !== FVc(r))) {
      throw new JWTClaimValidationFailed('unexpected "typ" JWT header value', "typ", "check_failed");
    }
    let o;
    try {
      o = JSON.parse(RA.oC(t));
    } catch (m) {}
    if (!lb(o)) {
      throw new JWTInvalid("JWT Claims Set must be a top-level JSON object");
    }
    let {
      requiredClaims: s = [],
      issuer: i,
      subject: a,
      audience: l,
      maxTokenAge: c
    } = n;
    if (c !== undefined) {
      s.push("iat");
    }
    if (l !== undefined) {
      s.push("aud");
    }
    if (a !== undefined) {
      s.push("sub");
    }
    if (i !== undefined) {
      s.push("iss");
    }
    for (let m of new Set(s.reverse())) {
      if (!(m in o)) {
        throw new JWTClaimValidationFailed(`missing required "${m}" claim`, m, "missing");
      }
    }
    if (i && !(Array.isArray(i) ? i : [i]).includes(o.iss)) {
      throw new JWTClaimValidationFailed('unexpected "iss" claim value', "iss", "check_failed");
    }
    if (a && o.sub !== a) {
      throw new JWTClaimValidationFailed('unexpected "sub" claim value', "sub", "check_failed");
    }
    if (l && !BWf(o.aud, typeof l === "string" ? [l] : l)) {
      throw new JWTClaimValidationFailed('unexpected "aud" claim value', "aud", "check_failed");
    }
    let u;
    switch (typeof n.clockTolerance) {
      case "string":
        u = ykt(n.clockTolerance);
        break;
      case "number":
        u = n.clockTolerance;
        break;
      case "undefined":
        u = 0;
        break;
      default:
        throw TypeError("Invalid clockTolerance option type");
    }
    let {
      currentDate: d
    } = n;
    let p = gkt(d || new Date());
    if ((o.iat !== undefined || c) && typeof o.iat !== "number") {
      throw new JWTClaimValidationFailed('"iat" claim must be a number', "iat", "invalid");
    }
    if (o.nbf !== undefined) {
      if (typeof o.nbf !== "number") {
        throw new JWTClaimValidationFailed('"nbf" claim must be a number', "nbf", "invalid");
      }
      if (o.nbf > p + u) {
        throw new JWTClaimValidationFailed('"nbf" claim timestamp check failed', "nbf", "check_failed");
      }
    }
    if (o.exp !== undefined) {
      if (typeof o.exp !== "number") {
        throw new JWTClaimValidationFailed('"exp" claim must be a number', "exp", "invalid");
      }
      if (o.exp <= p - u) {
        throw new JWTExpired('"exp" claim timestamp check failed', "exp", "check_failed");
      }
    }
    if (c) {
      let m = p - o.iat;
      let f = typeof c === "number" ? c : ykt(c);
      if (m - u > f) {
        throw new JWTExpired('"iat" claim timestamp check failed (too far in the past)', "iat", "check_failed");
      }
      if (m < 0 - u) {
        throw new JWTClaimValidationFailed('"iat" claim timestamp check failed (it should be in the past)', "iat", "check_failed");
      }
    }
    return o;
  };
  var Wbr = __lazy(() => {
    Mf();
    pN();
    Nrs();
  });
  async function jwtVerify(e, t, n) {
    var r;
    let o = await compactVerify(e, t, n);
    if (((r = o.protectedHeader.crit) === null || r === undefined ? undefined : r.includes("b64")) && o.protectedHeader.b64 === false) {
      throw new JWTInvalid("JWTs MUST NOT use unencoded payload");
    }
    let i = {
      payload: _kt(o.protectedHeader, o.payload, n),
      protectedHeader: o.protectedHeader
    };
    if (typeof t === "function") {
      return {
        ...i,
        key: o.key
      };
    }
    return i;
  }
  var BVc = __lazy(() => {
    Mrs();
    Wbr();
    Mf();
  });
  async function jwtDecrypt(e, t, n) {
    let r = await compactDecrypt(e, t, n);
    let o = _kt(r.protectedHeader, r.plaintext, n);
    let {
      protectedHeader: s
    } = r;
    if (s.iss !== undefined && s.iss !== o.iss) {
      throw new JWTClaimValidationFailed('replicated "iss" claim header parameter mismatch', "iss", "mismatch");
    }
    if (s.sub !== undefined && s.sub !== o.sub) {
      throw new JWTClaimValidationFailed('replicated "sub" claim header parameter mismatch', "sub", "mismatch");
    }
    if (s.aud !== undefined && JSON.stringify(s.aud) !== JSON.stringify(o.aud)) {
      throw new JWTClaimValidationFailed('replicated "aud" claim header parameter mismatch', "aud", "mismatch");
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
  var HVc = __lazy(() => {
    xrs();
    Wbr();
    Mf();
  });
  class CompactEncrypt {
    constructor(e) {
      this._flattened = new FlattenedEncrypt(e);
    }
    setContentEncryptionKey(e) {
      this._flattened.setContentEncryptionKey(e);
      return this;
    }
    setInitializationVector(e) {
      this._flattened.setInitializationVector(e);
      return this;
    }
    setProtectedHeader(e) {
      this._flattened.setProtectedHeader(e);
      return this;
    }
    setKeyManagementParameters(e) {
      this._flattened.setKeyManagementParameters(e);
      return this;
    }
    async encrypt(e, t) {
      let n = await this._flattened.encrypt(e, t);
      return [n.protected, n.encrypted_key, n.iv, n.ciphertext, n.tag].join(".");
    }
  }
  var Lrs = __lazy(() => {
    Hbr();
  });
  var $Wf = async (e, t, n) => {
    let r = await Wsn(e, t, "sign");
    zXe(e, r);
    let o = await crypto.subtle.sign(qsn(e, r.algorithm), r, n);
    return new Uint8Array(o);
  };
  class FlattenedSign {
    constructor(e) {
      if (!(e instanceof Uint8Array)) {
        throw TypeError("payload must be an instance of Uint8Array");
      }
      this._payload = e;
    }
    setProtectedHeader(e) {
      if (this._protectedHeader) {
        throw TypeError("setProtectedHeader can only be called once");
      }
      this._protectedHeader = e;
      return this;
    }
    setUnprotectedHeader(e) {
      if (this._unprotectedHeader) {
        throw TypeError("setUnprotectedHeader can only be called once");
      }
      this._unprotectedHeader = e;
      return this;
    }
    async sign(e, t) {
      if (!this._protectedHeader && !this._unprotectedHeader) {
        throw new JWSInvalid("either setProtectedHeader or setUnprotectedHeader must be called before #sign()");
      }
      if (!_Wf(this._protectedHeader, this._unprotectedHeader)) {
        throw new JWSInvalid("JWS Protected and JWS Unprotected Header Parameter names must be disjoint");
      }
      let n = {
        ...this._protectedHeader,
        ...this._unprotectedHeader
      };
      let r = DWf(JWSInvalid, new Map([["b64", true]]), t === null || t === undefined ? undefined : t.crit, this._protectedHeader, n);
      let o = true;
      if (r.vZc("b64")) {
        if (o = this._protectedHeader.b64, typeof o !== "boolean") {
          throw new JWSInvalid('The "b64" (base64url-encode payload) Header Parameter must be a boolean');
        }
      }
      let {
        alg: s
      } = n;
      if (typeof s !== "string" || !s) {
        throw new JWSInvalid('JWS "alg" (Algorithm) Header Parameter missing or invalid');
      }
      kWf(s, e, "sign");
      let i = this._payload;
      if (o) {
        i = $S.HS(HS(i));
      }
      let a;
      if (this._protectedHeader) {
        a = $S.HS(HS(JSON.stringify(this._protectedHeader)));
      } else {
        a = $S.HS("");
      }
      let l = yB(a, $S.HS("."), i);
      let c = await $Wf(s, e, l);
      let u = {
        signature: HS(c),
        payload: ""
      };
      if (o) {
        u.payload = RA.oC(i);
      }
      if (this._unprotectedHeader) {
        u.header = this._unprotectedHeader;
      }
      if (this._protectedHeader) {
        u.protected = RA.oC(a);
      }
      return u;
    }
  }
  var Gbr = __lazy(() => {
    _B();
    Mf();
    pN();
  });
  class CompactSign {
    constructor(e) {
      this._flattened = new FlattenedSign(e);
    }
    setProtectedHeader(e) {
      this._flattened.setProtectedHeader(e);
      return this;
    }
    async sign(e, t) {
      let n = await this._flattened.sign(e, t);
      if (n.payload === undefined) {
        throw TypeError("use the flattened module for creating JWS with b64: false");
      }
      return `${n.protected}.${n.payload}.${n.signature}`;
    }
  }
  var Frs = __lazy(() => {
    Gbr();
  });
  class WVc {
    constructor(e, t, n) {
      this.parent = e;
      this.key = t;
      this.options = n;
    }
    setProtectedHeader(e) {
      if (this.protectedHeader) {
        throw TypeError("setProtectedHeader can only be called once");
      }
      this.protectedHeader = e;
      return this;
    }
    setUnprotectedHeader(e) {
      if (this.unprotectedHeader) {
        throw TypeError("setUnprotectedHeader can only be called once");
      }
      this.unprotectedHeader = e;
      return this;
    }
    addSignature(...e) {
      return this.parent.addSignature(...e);
    }
    sign(...e) {
      return this.parent.sign(...e);
    }
    done() {
      return this.parent;
    }
  }
  class GeneralSign {
    constructor(e) {
      this._signatures = [];
      this._payload = e;
    }
    addSignature(e, t) {
      let n = new WVc(this, e, t);
      this._signatures.push(n);
      return n;
    }
    async sign() {
      if (!this._signatures.length) {
        throw new JWSInvalid("at least one signature must be added");
      }
      let e = {
        signatures: [],
        payload: ""
      };
      for (let t = 0; t < this._signatures.length; t++) {
        let n = this._signatures[t];
        let r = new FlattenedSign(this._payload);
        r.setProtectedHeader(n.protectedHeader);
        r.setUnprotectedHeader(n.unprotectedHeader);
        let {
          payload: o,
          ...s
        } = await r.sign(n.key, n.options);
        if (t === 0) {
          e.payload = o;
        } else if (e.payload !== o) {
          throw new JWSInvalid("inconsistent use of JWS Unencoded Payload (RFC7797)");
        }
        e.signatures.push(s);
      }
      return e;
    }
  }
  var GVc = __lazy(() => {
    Gbr();
    Mf();
  });
  class YXe {
    constructor(e) {
      if (!lb(e)) {
        throw TypeError("JWT Claims Set MUST be an object");
      }
      this._payload = e;
    }
    setIssuer(e) {
      this._payload = {
        ...this._payload,
        iss: e
      };
      return this;
    }
    setSubject(e) {
      this._payload = {
        ...this._payload,
        sub: e
      };
      return this;
    }
    setAudience(e) {
      this._payload = {
        ...this._payload,
        aud: e
      };
      return this;
    }
    setJti(e) {
      this._payload = {
        ...this._payload,
        jti: e
      };
      return this;
    }
    setNotBefore(e) {
      if (typeof e === "number") {
        this._payload = {
          ...this._payload,
          nbf: e
        };
      } else {
        this._payload = {
          ...this._payload,
          nbf: gkt(new Date()) + ykt(e)
        };
      }
      return this;
    }
    setExpirationTime(e) {
      if (typeof e === "number") {
        this._payload = {
          ...this._payload,
          exp: e
        };
      } else {
        this._payload = {
          ...this._payload,
          exp: gkt(new Date()) + ykt(e)
        };
      }
      return this;
    }
    setIssuedAt(e) {
      if (typeof e > "u") {
        this._payload = {
          ...this._payload,
          iat: gkt(new Date())
        };
      } else {
        this._payload = {
          ...this._payload,
          iat: e
        };
      }
      return this;
    }
  }
  var Vbr = __lazy(() => {
    Nrs();
  });
  var SignJWT;
  var VVc = __lazy(() => {
    Frs();
    Mf();
    pN();
    Vbr();
    SignJWT = class Brs extends YXe {
      setProtectedHeader(e) {
        this._protectedHeader = e;
        return this;
      }
      async sign(e, t) {
        var n;
        let r = new CompactSign($S.HS(JSON.stringify(this._payload)));
        if (r.setProtectedHeader(this._protectedHeader), Array.isArray((n = this._protectedHeader) === null || n === undefined ? undefined : n.crit) && this._protectedHeader.crit.includes("b64") && this._protectedHeader.b64 === false) {
          throw new JWTInvalid("JWTs MUST NOT use unencoded payload");
        }
        return r.sign(e, t);
      }
    };
  });
  var EncryptJWT;
  var zVc = __lazy(() => {
    Lrs();
    pN();
    Vbr();
    EncryptJWT = class $rs extends YXe {
      setProtectedHeader(e) {
        if (this._protectedHeader) {
          throw TypeError("setProtectedHeader can only be called once");
        }
        this._protectedHeader = e;
        return this;
      }
      setKeyManagementParameters(e) {
        if (this._keyManagementParameters) {
          throw TypeError("setKeyManagementParameters can only be called once");
        }
        this._keyManagementParameters = e;
        return this;
      }
      setContentEncryptionKey(e) {
        if (this._cek) {
          throw TypeError("setContentEncryptionKey can only be called once");
        }
        this._cek = e;
        return this;
      }
      setInitializationVector(e) {
        if (this._iv) {
          throw TypeError("setInitializationVector can only be called once");
        }
        this._iv = e;
        return this;
      }
      replicateIssuerAsHeader() {
        this._replicateIssuerAsHeader = true;
        return this;
      }
      replicateSubjectAsHeader() {
        this._replicateSubjectAsHeader = true;
        return this;
      }
      replicateAudienceAsHeader() {
        this._replicateAudienceAsHeader = true;
        return this;
      }
      async encrypt(e, t) {
        let n = new CompactEncrypt($S.HS(JSON.stringify(this._payload)));
        if (this._replicateIssuerAsHeader) {
          this._protectedHeader = {
            ...this._protectedHeader,
            iss: this._payload.iss
          };
        }
        if (this._replicateSubjectAsHeader) {
          this._protectedHeader = {
            ...this._protectedHeader,
            sub: this._payload.sub
          };
        }
        if (this._replicateAudienceAsHeader) {
          this._protectedHeader = {
            ...this._protectedHeader,
            aud: this._payload.aud
          };
        }
        if (n.setProtectedHeader(this._protectedHeader), this._iv) {
          n.setInitializationVector(this._iv);
        }
        if (this._cek) {
          n.setContentEncryptionKey(this._cek);
        }
        if (this._keyManagementParameters) {
          n.setKeyManagementParameters(this._keyManagementParameters);
        }
        return n.encrypt(e, t);
      }
    };
  });
  async function calculateJwkThumbprint(e, t) {
    if (!lb(e)) {
      throw TypeError("JWK must be an object");
    }
    if (t !== null && t !== undefined || (t = "sha256"), t !== "sha256" && t !== "sha384" && t !== "sha512") {
      throw TypeError('digestAlgorithm must one of "sha256", "sha384", or "sha512"');
    }
    let n;
    switch (e.kty) {
      case "EC":
        _2e(e.crv, '"crv" (Curve) Parameter');
        _2e(e.x, '"x" (X Coordinate) Parameter');
        _2e(e.y, '"y" (Y Coordinate) Parameter');
        n = {
          crv: e.crv,
          kty: e.kty,
          x: e.x,
          y: e.y
        };
        break;
      case "OKP":
        _2e(e.crv, '"crv" (Subtype of Key Pair) Parameter');
        _2e(e.x, '"x" (Public Key) Parameter');
        n = {
          crv: e.crv,
          kty: e.kty,
          x: e.x
        };
        break;
      case "RSA":
        _2e(e.e, '"e" (Exponent) Parameter');
        _2e(e.n, '"n" (Modulus) Parameter');
        n = {
          e: e.e,
          kty: e.kty,
          n: e.n
        };
        break;
      case "oct":
        _2e(e.k, '"k" (Key Value) Parameter');
        n = {
          k: e.k,
          kty: e.kty
        };
        break;
      default:
        throw new JOSENotSupported('"kty" (Key Type) Parameter missing or unsupported');
    }
    let r = $S.HS(JSON.stringify(n));
    return HS(await uWf(t, r));
  }
  async function calculateJwkThumbprintUri(e, t) {
    t !== null && t !== undefined || (t = "sha256");
    let n = await calculateJwkThumbprint(e, t);
    return `urn:ietf:params:oauth:jwk-thumbprint:sha-${t.slice(-3)}:${n}`;
  }
  var _2e = (e, t) => {
    if (typeof e !== "string" || !e) {
      throw new JWKInvalid(`${t} missing or invalid`);
    }
  };
  var YVc = __lazy(() => {
    _B();
    Mf();
    pN();
  });
  async function EmbeddedJWK(e, t) {
    let n = {
      ...e,
      ...(t === null || t === undefined ? undefined : t.header)
    };
    if (!lb(n.jwk)) {
      throw new JWSInvalid('"jwk" (JSON Web Key) Header Parameter must be a JSON object');
    }
    let r = await importJWK({
      ...n.jwk,
      ext: true
    }, n.alg, true);
    if (r instanceof Uint8Array || r.type !== "public") {
      throw new JWSInvalid('"jwk" (JSON Web Key) Header Parameter must be a public key');
    }
    return r;
  }
  var XVc = __lazy(() => {
    Bsn();
    Mf();
  });
  function HWf(e) {
    switch (typeof e === "string" && e.slice(0, 2)) {
      case "RS":
      case "PS":
        return "RSA";
      case "ES":
        return "EC";
      case "Ed":
        return "OKP";
      default:
        throw new JOSENotSupported('Unsupported "alg" value for a JSON Web Key Set');
    }
  }
  function jrs(e) {
    return e && typeof e === "object" && Array.isArray(e.keys) && e.keys.every(jWf);
  }
  function jWf(e) {
    return lb(e);
  }
  function qWf(e) {
    if (typeof structuredClone === "function") {
      return structuredClone(e);
    }
    return JSON.parse(JSON.stringify(e));
  }
  class zbr {
    constructor(e) {
      if (this._cached = new WeakMap(), !jrs(e)) {
        throw new JWKSInvalid("JSON Web Key Set malformed");
      }
      this._jwks = qWf(e);
    }
    async getKey(e, t) {
      let {
        alg: n,
        kid: r
      } = {
        ...e,
        ...(t === null || t === undefined ? undefined : t.header)
      };
      let o = HWf(n);
      let s = this._jwks.keys.filter(l => {
        let c = o === l.kty;
        if (c && typeof r === "string") {
          c = r === l.kid;
        }
        if (c && typeof l.alg === "string") {
          c = n === l.alg;
        }
        if (c && typeof l.use === "string") {
          c = l.use === "sig";
        }
        if (c && Array.isArray(l.key_ops)) {
          c = l.key_ops.includes("verify");
        }
        if (c && n === "EdDSA") {
          c = l.crv === "Ed25519" || l.crv === "Ed448";
        }
        if (c) {
          switch (n) {
            case "ES256":
              c = l.crv === "P-256";
              break;
            case "ES256K":
              c = l.crv === "secp256k1";
              break;
            case "ES384":
              c = l.crv === "P-384";
              break;
            case "ES512":
              c = l.crv === "P-521";
              break;
          }
        }
        return c;
      });
      let {
        0: i,
        length: a
      } = s;
      if (a === 0) {
        throw new JWKSNoMatchingKey();
      } else if (a !== 1) {
        let l = new JWKSMultipleMatchingKeys();
        let {
          _cached: c
        } = this;
        throw l[Symbol.asyncIterator] = async function* () {
          for (let u of s) {
            try {
              yield await QVc(c, u, n);
            } catch (d) {
              continue;
            }
          }
        }, l;
      }
      return QVc(this._cached, i, n);
    }
  }
  async function QVc(e, t, n) {
    let r = e.get(t) || e.set(t, {}).get(t);
    if (r[n] === undefined) {
      let o = await importJWK({
        ...t,
        ext: true
      }, n);
      if (o instanceof Uint8Array || o.type !== "public") {
        throw new JWKSInvalid("JSON Web Key Set members must be public keys");
      }
      r[n] = o;
    }
    return r[n];
  }
  function createLocalJWKSet(e) {
    let t = new zbr(e);
    return async function (n, r) {
      return t.getKey(n, r);
    };
  }
  var qrs = __lazy(() => {
    Bsn();
    Mf();
  });
  var WWf = async (e, t, n) => {
    let r;
    let o;
    let s = false;
    if (typeof AbortController === "function") {
      r = new AbortController();
      o = setTimeout(() => {
        s = true;
        r.abort();
      }, t);
    }
    let i = await fetch(e.href, {
      signal: r ? r.signal : undefined,
      redirect: "manual",
      headers: n.headers
    }).catch(a => {
      if (s) {
        throw new JWKSTimeout();
      }
      throw a;
    });
    if (o !== undefined) {
      clearTimeout(o);
    }
    if (i.status !== 200) {
      throw new JOSEError("Expected 200 OK from the JSON Web Key Set HTTP response");
    }
    try {
      return await i.json();
    } catch (a) {
      throw new JOSEError("Failed to parse the JSON Web Key Set HTTP response as JSON");
    }
  };
  function GWf() {
    return typeof WebSocketPair < "u" || typeof navigator < "u" && navigator.userAgent === "Cloudflare-Workers" || typeof EdgeRuntime < "u" && EdgeRuntime === "vercel";
  }
  function createRemoteJWKSet(e, t) {
    let n = new nzc(e, t);
    return async function (r, o) {
      return n.getKey(r, o);
    };
  }
  var nzc;
  var ozc = __lazy(() => {
    Mf();
    qrs();
    nzc = class nzc extends zbr {
      constructor(e, t) {
        super({
          keys: []
        });
        if (this._jwks = undefined, !(e instanceof URL)) {
          throw TypeError("url must be an instance of URL");
        }
        this._url = new URL(e.href);
        this._options = {
          agent: t === null || t === undefined ? undefined : t.agent,
          headers: t === null || t === undefined ? undefined : t.headers
        };
        this._timeoutDuration = typeof (t === null || t === undefined ? undefined : t.timeoutDuration) === "number" ? t === null || t === undefined ? undefined : t.timeoutDuration : 5000;
        this._cooldownDuration = typeof (t === null || t === undefined ? undefined : t.cooldownDuration) === "number" ? t === null || t === undefined ? undefined : t.cooldownDuration : 30000;
        this._cacheMaxAge = typeof (t === null || t === undefined ? undefined : t.cacheMaxAge) === "number" ? t === null || t === undefined ? undefined : t.cacheMaxAge : 600000;
      }
      coolingDown() {
        return typeof this._jwksTimestamp === "number" ? Date.now() < this._jwksTimestamp + this._cooldownDuration : false;
      }
      fresh() {
        return typeof this._jwksTimestamp === "number" ? Date.now() < this._jwksTimestamp + this._cacheMaxAge : false;
      }
      async getKey(e, t) {
        if (!this._jwks || !this.fresh()) {
          await this.reload();
        }
        try {
          return await super.getKey(e, t);
        } catch (n) {
          if (n instanceof JWKSNoMatchingKey) {
            if (this.coolingDown() === false) {
              await this.reload();
              return super.getKey(e, t);
            }
          }
          throw n;
        }
      }
      async reload() {
        if (this._pendingFetch && GWf()) {
          this._pendingFetch = undefined;
        }
        this._pendingFetch || (this._pendingFetch = WWf(this._url, this._timeoutDuration, this._options).then(e => {
          if (!jrs(e)) {
            throw new JWKSInvalid("JSON Web Key Set malformed");
          }
          this._jwks = {
            keys: e.keys
          };
          this._jwksTimestamp = Date.now();
          this._pendingFetch = undefined;
        }).catch(e => {
          throw this._pendingFetch = undefined, e;
        }));
        await this._pendingFetch;
      }
    };
  });
  var UnsecuredJWT;
  var szc = __lazy(() => {
    _B();
    pN();
    Mf();
    Wbr();
    Vbr();
    UnsecuredJWT = class Wrs extends YXe {
      HS() {
        let e = HS(JSON.stringify({
          alg: "none"
        }));
        let t = HS(JSON.stringify(this._payload));
        return `${e}.${t}.`;
      }
      static oC(e, t) {
        if (typeof e !== "string") {
          throw new JWTInvalid("Unsecured JWT must be a string");
        }
        let {
          0: n,
          1: r,
          2: o,
          length: s
        } = e.split(".");
        if (s !== 3 || o !== "") {
          throw new JWTInvalid("Invalid Unsecured JWT");
        }
        let i;
        try {
          if (i = JSON.parse(RA.oC(oC(n))), i.alg !== "none") {
            throw Error();
          }
        } catch (l) {
          throw new JWTInvalid("Invalid Unsecured JWT");
        }
        return {
          payload: _kt(i, oC(r), t),
          header: i
        };
      }
    };
  });
  var base64url_export2 = {};