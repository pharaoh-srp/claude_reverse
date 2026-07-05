  __export(base64url_export2, {
    HS: () => HS,
    oC: () => oC
  });
  function decodeProtectedHeader(e) {
    let t;
    if (typeof e === "string") {
      let n = e.split(".");
      if (n.length === 3 || n.length === 5) {
        [t] = n;
      }
    } else if (typeof e === "object" && e) {
      if ("protected" in e) {
        t = e.protected;
      } else {
        throw TypeError("Token does not contain a Protected Header");
      }
    }
    try {
      if (typeof t !== "string" || !t) {
        throw Error();
      }
      let n = JSON.parse(RA.oC(oC(t)));
      if (!lb(n)) {
        throw Error();
      }
      return n;
    } catch (n) {
      throw TypeError("Invalid Token or Protected Header formatting");
    }
  }
  var azc = __lazy(() => {
    pN();
  });
  function decodeJwt(e) {
    if (typeof e !== "string") {
      throw new JWTInvalid("JWTs must use Compact JWS serialization, JWT must be a string");
    }
    let {
      1: t,
      length: n
    } = e.split(".");
    if (n === 5) {
      throw new JWTInvalid("Only JWTs using Compact JWS serialization can be decoded");
    }
    if (n !== 3) {
      throw new JWTInvalid("Invalid JWT");
    }
    if (!t) {
      throw new JWTInvalid("JWTs must contain a payload");
    }
    let r;
    try {
      r = oC(t);
    } catch (s) {
      throw new JWTInvalid("Failed to base64url decode the payload");
    }
    let o;
    try {
      o = JSON.parse(RA.oC(r));
    } catch (s) {
      throw new JWTInvalid("Failed to parse the decoded payload as JSON");
    }
    if (!lb(o)) {
      throw new JWTInvalid("Invalid JWT Claims Set");
    }
    return o;
  }
  var czc = __lazy(() => {
    pN();
    Mf();
  });
  async function uzc(e, t) {
    var n;
    let r;
    let o;
    let s;
    switch (e) {
      case "HS256":
      case "HS384":
      case "HS512":
        r = parseInt(e.slice(-3), 10);
        o = {
          name: "HMAC",
          hash: `SHA-${r}`,
          length: r
        };
        s = ["sign", "verify"];
        break;
      case "A128CBC-HS256":
      case "A192CBC-HS384":
      case "A256CBC-HS512":
        r = parseInt(e.slice(-3), 10);
        return p2e(new Uint8Array(r >> 3));
      case "A128KW":
      case "A192KW":
      case "A256KW":
        r = parseInt(e.slice(1, 4), 10);
        o = {
          name: "AES-KW",
          length: r
        };
        s = ["wrapKey", "unwrapKey"];
        break;
      case "A128GCMKW":
      case "A192GCMKW":
      case "A256GCMKW":
      case "A128GCM":
      case "A192GCM":
      case "A256GCM":
        r = parseInt(e.slice(1, 4), 10);
        o = {
          name: "AES-GCM",
          length: r
        };
        s = ["encrypt", "decrypt"];
        break;
      default:
        throw new JOSENotSupported('Invalid or unsupported JWK "alg" (Algorithm) Parameter value');
    }
    return crypto.subtle.generateKey(o, (n = t === null || t === undefined ? undefined : t.extractable) !== null && n !== undefined ? n : false, s);
  }
  function Vrs(e) {
    var t;
    let n = (t = e === null || e === undefined ? undefined : e.modulusLength) !== null && t !== undefined ? t : 2048;
    if (typeof n !== "number" || n < 2048) {
      throw new JOSENotSupported("Invalid or unsupported modulusLength option provided, 2048 bits or larger keys must be used");
    }
    return n;
  }
  async function dzc(e, t) {
    var n;
    var r;
    var o;
    let s;
    let i;
    switch (e) {
      case "PS256":
      case "PS384":
      case "PS512":
        s = {
          name: "RSA-PSS",
          hash: `SHA-${e.slice(-3)}`,
          publicExponent: new Uint8Array([1, 0, 1]),
          modulusLength: Vrs(t)
        };
        i = ["sign", "verify"];
        break;
      case "RS256":
      case "RS384":
      case "RS512":
        s = {
          name: "RSASSA-PKCS1-v1_5",
          hash: `SHA-${e.slice(-3)}`,
          publicExponent: new Uint8Array([1, 0, 1]),
          modulusLength: Vrs(t)
        };
        i = ["sign", "verify"];
        break;
      case "RSA-OAEP":
      case "RSA-OAEP-256":
      case "RSA-OAEP-384":
      case "RSA-OAEP-512":
        s = {
          name: "RSA-OAEP",
          hash: `SHA-${parseInt(e.slice(-3), 10) || 1}`,
          publicExponent: new Uint8Array([1, 0, 1]),
          modulusLength: Vrs(t)
        };
        i = ["decrypt", "unwrapKey", "encrypt", "wrapKey"];
        break;
      case "ES256":
        s = {
          name: "ECDSA",
          namedCurve: "P-256"
        };
        i = ["sign", "verify"];
        break;
      case "ES384":
        s = {
          name: "ECDSA",
          namedCurve: "P-384"
        };
        i = ["sign", "verify"];
        break;
      case "ES512":
        s = {
          name: "ECDSA",
          namedCurve: "P-521"
        };
        i = ["sign", "verify"];
        break;
      case "EdDSA":
        i = ["sign", "verify"];
        let a = (n = t === null || t === undefined ? undefined : t.crv) !== null && n !== undefined ? n : "Ed25519";
        switch (a) {
          case "Ed25519":
          case "Ed448":
            s = {
              name: a
            };
            break;
          default:
            throw new JOSENotSupported("Invalid or unsupported crv option provided");
        }
        break;
      case "ECDH-ES":
      case "ECDH-ES+A128KW":
      case "ECDH-ES+A192KW":
      case "ECDH-ES+A256KW":
        {
          i = ["deriveKey", "deriveBits"];
          let l = (r = t === null || t === undefined ? undefined : t.crv) !== null && r !== undefined ? r : "P-256";
          switch (l) {
            case "P-256":
            case "P-384":
            case "P-521":
              {
                s = {
                  name: "ECDH",
                  namedCurve: l
                };
                break;
              }
            case "X25519":
            case "X448":
              s = {
                name: l
              };
              break;
            default:
              throw new JOSENotSupported("Invalid or unsupported crv option provided, supported values are P-256, P-384, P-521, X25519, and X448");
          }
          break;
        }
      default:
        throw new JOSENotSupported('Invalid or unsupported JWK "alg" (Algorithm) Parameter value');
    }
    return crypto.subtle.generateKey(s, (o = t === null || t === undefined ? undefined : t.extractable) !== null && o !== undefined ? o : false, i);
  }
  var zrs = __lazy(() => {
    Mf();
    Msn();
  });
  async function generateKeyPair(e, t) {
    return dzc(e, t);
  }
  var mzc = __lazy(() => {
    zrs();
  });
  async function generateSecret(e, t) {
    return uzc(e, t);
  }
  var hzc = __lazy(() => {
    zrs();
  });
  var Ybr = {};