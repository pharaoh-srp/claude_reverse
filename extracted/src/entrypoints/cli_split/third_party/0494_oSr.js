  var oSr = __commonJS((Jmw, eKc) => {
    var _Gf = Symbol();
    var bGf = Symbol();
    eKc.exports = {
      CLOCK_TOLERANCE: bGf,
      HTTP_OPTIONS: _Gf
    };
  });
  var Tkt = __commonJS((Xmw, cos) => {
    var SGf = require("assert");
    var TGf = require("querystring");
    var EGf = require("http");
    var vGf = require("https");
    var {
      once: tKc
    } = require("events");
    var {
      URL: wGf
    } = require("url");
    var CGf = rSr();
    var aos = Zzc();
    var {
      RPError: RGf
    } = Whe();
    var rKc = Qbr();
    var {
      deep: los
    } = tos();
    var {
      HTTP_OPTIONS: xGf
    } = oSr();
    var iSr;
    var oKc = ["agent", "ca", "cert", "crl", "headers", "key", "lookup", "passphrase", "pfx", "timeout"];
    var sKc = (e, t) => {
      iSr = los({}, e.length ? rKc(t, ...e) : t, iSr);
    };
    sKc([], {
      headers: {
        "User-Agent": `${aos.name}/${aos.version} (${aos.homepage})`,
        "Accept-Encoding": "identity"
      },
      timeout: 3500
    });
    function sSr(e, t, n) {
      if (n) {
        e.removeHeader("content-type");
        e.setHeader("content-type", n);
      }
      if (t) {
        e.removeHeader("content-length");
        e.setHeader("content-length", Buffer.byteLength(t));
        e.write(t);
      }
      e.end();
    }
    var nKc = new CGf({
      max: 100
    });
    cos.exports = async function (t, {
      accessToken: n,
      mTLS: r = false,
      DPoP: o
    } = {}) {
      let s;
      try {
        s = new wGf(t.url);
        delete t.url;
        SGf(/^(https?:)$/.test(s.protocol));
      } catch (g) {
        throw TypeError("only valid absolute URLs can be requested");
      }
      let i = this[xGf];
      let a = t;
      let l = `${s.origin}${s.pathname}`;
      if (o && "dpopProof" in this) {
        a.headers = a.headers || {};
        a.headers.DPoP = await this.dpopProof({
          htu: `${s.origin}${s.pathname}`,
          htm: t.method || "GET",
          nonce: nKc.get(l)
        }, o, n);
      }
      let c;
      if (i) {
        c = rKc(i.call(this, s, los({}, a, iSr)), ...oKc);
      }
      if (a = los({}, c, a, iSr), r && !a.pfx && !(a.key && a.cert)) {
        throw TypeError("mutual-TLS certificate and key not set");
      }
      if (a.searchParams) {
        for (let [g, y] of Object.entries(a.searchParams)) {
          s.searchParams.delete(g);
          s.searchParams.set(g, y);
        }
      }
      let u;
      let d;
      let p;
      let m;
      ({
        form: d,
        responseType: u,
        json: p,
        body: m,
        ...a
      } = a);
      for (let [g, y] of Object.entries(a.headers || {})) {
        if (y === undefined) {
          delete a.headers[g];
        }
      }
      let f;
      let h = (s.protocol === "https:" ? vGf.request : EGf.request)(s.href, a);
      return (async () => {
        if (p) {
          sSr(h, JSON.stringify(p), "application/json");
        } else if (d) {
          sSr(h, TGf.stringify(d), "application/x-www-form-urlencoded");
        } else if (m) {
          sSr(h, m);
        } else {
          sSr(h);
        }
        if ([f] = await Promise.race([tKc(h, "response"), tKc(h, "timeout")]), !f) {
          throw h.destroy(), new RGf(`outgoing request timed out after ${a.timeout}ms`);
        }
        let g = [];
        for await (let y of f) {
          g.push(y);
        }
        if (g.length) {
          switch (u) {
            case "json":
              {
                Object.defineProperty(f, "body", {
                  get() {
                    let y = Buffer.concat(g);
                    try {
                      y = JSON.parse(y);
                    } catch (_) {
                      throw Object.defineProperty(_, "response", {
                        value: f
                      }), _;
                    } finally {
                      Object.defineProperty(f, "body", {
                        value: y,
                        configurable: true
                      });
                    }
                    return y;
                  },
                  configurable: true
                });
                break;
              }
            case undefined:
            case "buffer":
              {
                Object.defineProperty(f, "body", {
                  get() {
                    let y = Buffer.concat(g);
                    Object.defineProperty(f, "body", {
                      value: y,
                      configurable: true
                    });
                    return y;
                  },
                  configurable: true
                });
                break;
              }
            default:
              throw TypeError("unsupported responseType request option");
          }
        }
        return f;
      })().catch(g => {
        if (f) {
          Object.defineProperty(g, "response", {
            value: f
          });
        }
        throw g;
      }).finally(() => {
        let g = f && f.headers["dpop-nonce"];
        if (g && (/^[\x21\x23-\x5B\x5D-\x7E]+$/).test(g)) {
          nKc.set(l, g);
        }
      });
    };
    cos.exports.setDefaults = sKc.bind(undefined, oKc);
  });
  var aSr = __commonJS((Qmw, iKc) => {
    iKc.exports.keystores = new WeakMap();
  });
  var tin = __commonJS((Zmw, aKc) => {
    aKc.exports = globalThis.structuredClone || (e => JSON.parse(JSON.stringify(e)));
  });
  var dos = __commonJS((efw, dKc) => {
    Jbr();
    var uos = __toCommonJS(Ybr);
    var AGf = tin();
    var lKc = Jsn();
    var cKc = Symbol();
    var uKc = (e, {
      alg: t,
      use: n
    }) => {
      let r = 0;
      if (t && e.alg) {
        r++;
      }
      if (n && e.use) {
        r++;
      }
      return r;
    };
    function IGf(e) {
      switch (typeof e === "string" && e.slice(0, 2)) {
        case "RS":
        case "PS":
          return "RSA";
        case "ES":
          return "EC";
        case "Ed":
          return "OKP";
        default:
          return;
      }
    }
    function PGf(e, t, n, r) {
      if (t) {
        return new Set([t]);
      }
      switch (n) {
        case "EC":
          {
            let o = [];
            if (e === "enc" || e === undefined) {
              o = o.concat(["ECDH-ES", "ECDH-ES+A128KW", "ECDH-ES+A192KW", "ECDH-ES+A256KW"]);
            }
            if (e === "sig" || e === undefined) {
              switch (r) {
                case "P-256":
                case "P-384":
                  o = o.concat([`ES${r.slice(-3)}`]);
                  break;
                case "P-521":
                  o = o.concat(["ES512"]);
                  break;
                case "secp256k1":
                  if (uos.gzc === "node:crypto") {
                    o = o.concat(["ES256K"]);
                  }
                  break;
              }
            }
            return new Set(o);
          }
        case "OKP":
          return new Set(["ECDH-ES", "ECDH-ES+A128KW", "ECDH-ES+A192KW", "ECDH-ES+A256KW"]);
        case "RSA":
          {
            let o = [];
            if (e === "enc" || e === undefined) {
              if (o = o.concat(["RSA-OAEP", "RSA-OAEP-256", "RSA-OAEP-384", "RSA-OAEP-512"]), uos.gzc === "node:crypto") {
                o = o.concat(["RSA1_5"]);
              }
            }
            if (e === "sig" || e === undefined) {
              o = o.concat(["PS256", "PS384", "PS512", "RS256", "RS384", "RS512"]);
            }
            return new Set(o);
          }
        default:
          throw Error("unreachable");
      }
    }
    dKc.exports = class {
      #e;
      constructor(t, n) {
        if (t !== cKc) {
          throw Error("invalid constructor call");
        }
        this.#e = n;
      }
      toJWKS() {
        return {
          keys: this.map(({
            jwk: {
              d: t,
              p: n,
              q: r,
              dp: o,
              dq: s,
              qi: i,
              ...a
            }
          }) => a)
        };
      }
      all({
        alg: t,
        kid: n,
        use: r
      } = {}) {
        if (!r || !t) {
          throw Error();
        }
        let o = IGf(t);
        let s = {
          alg: t,
          use: r
        };
        return this.filter(i => {
          let a = true;
          if (a && o !== undefined && i.jwk.kty !== o) {
            a = false;
          }
          if (a && n !== undefined && i.jwk.kid !== n) {
            a = false;
          }
          if (a && r !== undefined && i.jwk.use !== undefined && i.jwk.use !== r) {
            a = false;
          }
          if (a && i.jwk.alg && i.jwk.alg !== t) {
            a = false;
          } else if (!i.algorithms.vZc(t)) {
            a = false;
          }
          return a;
        }).sort((i, a) => uKc(a, s) - uKc(i, s));
      }
      get(...t) {
        return this.all(...t)[0];
      }
      static async fromJWKS(t, {
        onlyPublic: n = false,
        onlyPrivate: r = false
      } = {}) {
        if (!lKc(t) || !Array.isArray(t.keys) || t.keys.some(s => !lKc(s) || !("kty" in s))) {
          throw TypeError("jwks must be a JSON Web Key Set formatted object");
        }
        let o = [];
        for (let s of t.keys) {
          s = AGf(s);
          let {
            kty: i,
            kid: a,
            crv: l
          } = s;
          let {
            alg: c,
            use: u
          } = s;
          if (typeof i !== "string" || !i) {
            continue;
          }
          if (u !== undefined && u !== "sig" && u !== "enc") {
            continue;
          }
          if (typeof c !== "string" && c !== undefined) {
            continue;
          }
          if (typeof a !== "string" && a !== undefined) {
            continue;
          }
          if (i === "EC" && u === "sig") {
            switch (l) {
              case "P-256":
                c = "ES256";
                break;
              case "P-384":
                c = "ES384";
                break;
              case "P-521":
                c = "ES512";
                break;
              default:
                break;
            }
          }
          if (l === "secp256k1") {
            u = "sig";
            c = "ES256K";
          }
          if (i === "OKP") {
            switch (l) {
              case "Ed25519":
              case "Ed448":
                u = "sig";
                c = "EdDSA";
                break;
              case "X25519":
              case "X448":
                u = "enc";
                break;
              default:
                break;
            }
          }
          if (c && !u) {
            switch (true) {
              case c.startsWith("ECDH"):
                u = "enc";
                break;
              case c.startsWith("RSA"):
                u = "enc";
                break;
              default:
                break;
            }
          }
          if (r && (s.kty === "oct" || !s.d)) {
            throw Error("jwks must only contain private keys");
          }
          if (n && (s.d || s.k)) {
            continue;
          }
          o.push({
            jwk: {
              ...s,
              alg: c,
              use: u
            },
            async keyObject(d) {
              if (this[d]) {
                return this[d];
              }
              let p = await uos.importJWK(this.jwk, d);
              this[d] = p;
              return p;
            },
            get algorithms() {
              Object.defineProperty(this, "algorithms", {
                value: PGf(this.jwk.use, this.jwk.alg, this.jwk.kty, this.jwk.crv),
                enumerable: true,
                configurable: false
              });
              return this.algorithms;
            }
          });
        }
        return new this(cKc, o);
      }
      filter(...t) {
        return this.#e.filter(...t);
      }
      find(...t) {
        return this.#e.find(...t);
      }
      every(...t) {
        return this.#e.every(...t);
      }
      some(...t) {
        return this.#e.some(...t);
      }
      map(...t) {
        return this.#e.map(...t);
      }
      forEach(...t) {
        return this.#e.forEach(...t);
      }
      reduce(...t) {
        return this.#e.reduce(...t);
      }
      sort(...t) {
        return this.#e.sort(...t);
      }
      *[Symbol.iterator]() {
        for (let t of this.#e) {
          yield t;
        }
      }
    };
  });
  var fKc = __commonJS((tfw, mKc) => {
    var pos = Jsn();
    function pKc(e, ...t) {
      for (let n of t) {
        if (!pos(n)) {
          continue;
        }
        for (let [r, o] of Object.entries(n)) {
          if (r === "__proto__" || r === "constructor") {
            continue;
          }
          if (pos(e[r]) && pos(o)) {
            e[r] = pKc(e[r], o);
          } else if (typeof o < "u") {
            e[r] = o;
          }
        }
      }
      return e;
    }
    mKc.exports = pKc;
  });
  var fos = __commonJS((nfw, _Kc) => {
    Jbr();
    var hKc = __toCommonJS(Ybr);
    var {
      RPError: mos
    } = Whe();
    var {
      assertIssuerConfiguration: OGf
    } = Xbr();
    var {
      random: DGf
    } = Qsn();
    var MGf = Xsn();
    var NGf = Tkt();
    var {
      keystores: LGf
    } = aSr();
    var FGf = fKc();
    var gKc = e => encodeURIComponent(e).replace(/%20/g, "+");
    async function UGf(e, t) {
      let n = this[`${e}_endpoint_auth_signing_alg`];
      if (!n) {
        OGf(this.issuer, `${e}_endpoint_auth_signing_alg_values_supported`);
      }
      if (this[`${e}_endpoint_auth_method`] === "client_secret_jwt") {
        if (!n) {
          let s = this.issuer[`${e}_endpoint_auth_signing_alg_values_supported`];
          n = Array.isArray(s) && s.find(i => /^HS(?:256|384|512)/.test(i));
        }
        if (!n) {
          throw new mos(`failed to determine a JWS Algorithm to use for ${this[`${e}_endpoint_auth_method`]} Client Assertion`);
        }
        return new hKc.CompactSign(Buffer.from(JSON.stringify(t))).setProtectedHeader({
          alg: n
        }).sign(this.secretForAlg(n));
      }
      let r = await LGf.get(this);
      if (!r) {
        throw TypeError("no client jwks provided for signing a client assertion with");
      }
      if (!n) {
        let s = this.issuer[`${e}_endpoint_auth_signing_alg_values_supported`];
        n = Array.isArray(s) && s.find(i => r.get({
          alg: i,
          use: "sig"
        }));
      }
      if (!n) {
        throw new mos(`failed to determine a JWS Algorithm to use for ${this[`${e}_endpoint_auth_method`]} Client Assertion`);
      }
      let o = r.get({
        alg: n,
        use: "sig"
      });
      if (!o) {
        throw new mos(`no key found in client jwks to sign a client assertion with using alg ${n}`);
      }
      return new hKc.CompactSign(Buffer.from(JSON.stringify(t))).setProtectedHeader({
        alg: n,
        kid: o.jwk && o.jwk.kid
      }).sign(await o.keyObject(n));
    }
    async function yKc(e, {
      clientAssertionPayload: t
    } = {}) {
      switch (this[`${e}_endpoint_auth_method`]) {
        case "self_signed_tls_client_auth":
        case "tls_client_auth":
        case "none":
          return {
            form: {
              client_id: this.client_id
            }
          };
        case "client_secret_post":
          if (typeof this.client_secret !== "string") {
            throw TypeError("client_secret_post client authentication method requires a client_secret");
          }
          return {
            form: {
              client_id: this.client_id,
              client_secret: this.client_secret
            }
          };
        case "private_key_jwt":
        case "client_secret_jwt":
          {
            let r = MGf();
            let o = await UGf.call(this, e, {
              iat: r,
              exp: r + 60,
              jti: DGf(),
              iss: this.client_id,
              sub: this.client_id,
              aud: this.issuer.issuer,
              ...t
            });
            return {
              form: {
                client_id: this.client_id,
                client_assertion: o,
                client_assertion_type: "urn:ietf:params:oauth:client-assertion-type:jwt-bearer"
              }
            };
          }
        case "client_secret_basic":
          {
            if (typeof this.client_secret !== "string") {
              throw TypeError("client_secret_basic client authentication method requires a client_secret");
            }
            let r = `${gKc(this.client_id)}:${gKc(this.client_secret)}`;
            return {
              headers: {
                Authorization: `Basic ${Buffer.from(r).toString("base64")}`
              }
            };
          }
        default:
          throw TypeError(`missing, or unsupported, ${e}_endpoint_auth_method`);
      }
    }
    function BGf() {
      let {
        length: e,
        0: t
      } = this.response_types;
      if (e === 1) {
        return t;
      }
      return;
    }
    function $Gf() {
      let {
        length: e,
        0: t
      } = this.redirect_uris || [];
      if (e === 1) {
        return t;
      }
      return;
    }
    async function HGf(e, t, {
      clientAssertionPayload: n,
      endpointAuthMethod: r = e,
      DPoP: o
    } = {}) {
      let s = await yKc.call(this, r, {
        clientAssertionPayload: n
      });
      let i = FGf(t, s);
      let a = this[`${r}_endpoint_auth_method`].includes("tls_client_auth") || e === "token" && this.tls_client_certificate_bound_access_tokens;
      let l;
      if (a && this.issuer.mtls_endpoint_aliases) {
        l = this.issuer.mtls_endpoint_aliases[`${e}_endpoint`];
      }
      if (l = l || this.issuer[`${e}_endpoint`], "form" in i) {
        for (let [c, u] of Object.entries(i.form)) {
          if (typeof u > "u") {
            delete i.form[c];
          }
        }
      }
      return NGf.call(this, {
        ...i,
        method: "POST",
        url: l,
        headers: {
          ...(e !== "revocation" ? {
            Accept: "application/json"
          } : undefined),
          ...i.headers
        }
      }, {
        mTLS: a,
        DPoP: o
      });
    }
    _Kc.exports = {
      resolveResponseType: BGf,
      resolveRedirectUri: $Gf,
      authFor: yKc,
      authenticatedPost: HGf
    };
  });
  var wKc = __commonJS((ZXe, vKc) => {
    var hos = require("crypto");
    ZXe = vKc.exports = nin;
    function nin(e, t) {
      t = TKc(e, t);
      return jGf(e, t);
    }
    ZXe.sha1 = function (e) {
      return nin(e);
    };
    ZXe.keys = function (e) {
      return nin(e, {
        excludeValues: true,
        algorithm: "sha1",
        encoding: "hex"
      });
    };
    ZXe.MD5 = function (e) {
      return nin(e, {
        algorithm: "md5",
        encoding: "hex"
      });
    };
    ZXe.keysMD5 = function (e) {
      return nin(e, {
        algorithm: "md5",
        encoding: "hex",
        excludeValues: true
      });
    };
    var Ekt = hos.getHashes ? hos.getHashes().slice() : ["sha1", "md5"];
    Ekt.push("passthrough");
    var bKc = ["buffer", "hex", "binary", "base64"];
    function TKc(e, t) {
      t = t || {};
      var n = {};
      if (n.algorithm = t.algorithm || "sha1", n.encoding = t.encoding || "hex", n.excludeValues = t.excludeValues ? true : false, n.algorithm = n.algorithm.toLowerCase(), n.encoding = n.encoding.toLowerCase(), n.ignoreUnknown = t.ignoreUnknown !== true ? false : true, n.respectType = t.respectType === false ? false : true, n.respectFunctionNames = t.respectFunctionNames === false ? false : true, n.respectFunctionProperties = t.respectFunctionProperties === false ? false : true, n.unorderedArrays = t.unorderedArrays !== true ? false : true, n.unorderedSets = t.unorderedSets === false ? false : true, n.unorderedObjects = t.unorderedObjects === false ? false : true, n.replacer = t.replacer || undefined, n.excludeKeys = t.excludeKeys || undefined, typeof e > "u") {
        throw Error("Object argument required.");
      }
      for (var r = 0; r < Ekt.length; ++r) {
        if (Ekt[r].toLowerCase() === n.algorithm.toLowerCase()) {
          n.algorithm = Ekt[r];
        }
      }
      if (Ekt.indexOf(n.algorithm) === -1) {
        throw Error('Algorithm "' + n.algorithm + '"  not supported. supported values: ' + Ekt.join(", "));
      }
      if (bKc.indexOf(n.encoding) === -1 && n.algorithm !== "passthrough") {
        throw Error('Encoding "' + n.encoding + '"  not supported. supported values: ' + bKc.join(", "));
      }
      return n;
    }
    function SKc(e) {
      if (typeof e !== "function") {
        return false;
      }
      var t = /^function\s+\w*\s*\(\s*\)\s*{\s+\[native code\]\s+}$/i;
      return t.exec(Function.prototype.toString.call(e)) != null;
    }
    function jGf(e, t) {
      var n;
      if (t.algorithm !== "passthrough") {
        n = hos.createHash(t.algorithm);
      } else {
        n = new EKc();
      }
      if (typeof n.write > "u") {
        n.write = n.update;
        n.end = n.update;
      }
      var r = gos(t, n);
      if (r.dispatch(e), !n.update) {
        n.end("");
      }
      if (n.digest) {
        return n.digest(t.encoding === "buffer" ? undefined : t.encoding);
      }
      var o = n.read();
      if (t.encoding === "buffer") {
        return o;
      }
      return o.toString(t.encoding);
    }
    ZXe.writeToStream = function (e, t, n) {
      if (typeof n > "u") {
        n = t;
        t = {};
      }
      t = TKc(e, t);
      return gos(t, n).dispatch(e);
    };
    function gos(e, t, n) {
      n = n || [];
      var r = function (o) {
        if (t.update) {
          return t.update(o, "utf8");
        } else {
          return t.write(o, "utf8");
        }
      };
      return {
        dispatch: function (o) {
          if (e.replacer) {
            o = e.replacer(o);
          }
          var s = typeof o;
          if (o === null) {
            s = "null";
          }
          return this["_" + s](o);
        },
        _object: function (o) {
          var s = /\[object (.*)\]/i;
          var i = Object.prototype.toString.call(o);
          var a = s.exec(i);
          if (!a) {
            a = "unknown:[" + i + "]";
          } else {
            a = a[1];
          }
          a = a.toLowerCase();
          var l = null;
          if ((l = n.indexOf(o)) >= 0) {
            return this.dispatch("[CIRCULAR:" + l + "]");
          } else {
            n.push(o);
          }
          if (typeof Buffer < "u" && Buffer.isBuffer && Buffer.isBuffer(o)) {
            r("buffer:");
            return r(o);
          }
          if (a !== "object" && a !== "function" && a !== "asyncfunction") {
            if (this["_" + a]) {
              this["_" + a](o);
            } else if (e.ignoreUnknown) {
              return r("[" + a + "]");
            } else {
              throw Error('Unknown object type "' + a + '"');
            }
          } else {
            var c = Object.keys(o);
            if (e.unorderedObjects) {
              c = c.sort();
            }
            if (e.respectType !== false && !SKc(o)) {
              c.splice(0, 0, "prototype", "__proto__", "constructor");
            }
            if (e.excludeKeys) {
              c = c.filter(function (d) {
                return !e.excludeKeys(d);
              });
            }
            r("object:" + c.length + ":");
            var u = this;
            return c.forEach(function (d) {
              if (u.dispatch(d), r(":"), !e.excludeValues) {
                u.dispatch(o[d]);
              }
              r(",");
            });
          }
        },
        _array: function (o, s) {
          s = typeof s < "u" ? s : e.unorderedArrays !== false;
          var i = this;
          if (r("array:" + o.length + ":"), !s || o.length <= 1) {
            return o.forEach(function (c) {
              return i.dispatch(c);
            });
          }
          var a = [];
          var l = o.map(function (c) {
            var u = new EKc();
            var d = n.slice();
            var p = gos(e, u, d);
            p.dispatch(c);
            a = a.concat(d.slice(n.length));
            return u.read().toString();
          });
          n = n.concat(a);
          l.sort();
          return this._array(l, false);
        },
        _date: function (o) {
          return r("date:" + o.toJSON());
        },
        _symbol: function (o) {
          return r("symbol:" + o.toString());
        },
        _error: function (o) {
          return r("error:" + o.toString());
        },
        _boolean: function (o) {
          return r("bool:" + o.toString());
        },
        _string: function (o) {
          r("string:" + o.length + ":");
          r(o.toString());
        },
        _function: function (o) {
          if (r("fn:"), SKc(o)) {
            this.dispatch("[native]");
          } else {
            this.dispatch(o.toString());
          }
          if (e.respectFunctionNames !== false) {
            this.dispatch("function-name:" + String(o.name));
          }
          if (e.respectFunctionProperties) {
            this._object(o);
          }
        },
        _number: function (o) {
          return r("number:" + o.toString());
        },
        _xml: function (o) {
          return r("xml:" + o.toString());
        },
        _null: function () {
          return r("Null");
        },
        _undefined: function () {
          return r("Undefined");
        },
        _regexp: function (o) {
          return r("regex:" + o.toString());
        },
        _uint8array: function (o) {
          r("uint8array:");
          return this.dispatch(Array.prototype.slice.call(o));
        },
        _uint8clampedarray: function (o) {
          r("uint8clampedarray:");
          return this.dispatch(Array.prototype.slice.call(o));
        },
        _int8array: function (o) {
          r("uint8array:");
          return this.dispatch(Array.prototype.slice.call(o));
        },
        _uint16array: function (o) {
          r("uint16array:");
          return this.dispatch(Array.prototype.slice.call(o));
        },
        _int16array: function (o) {
          r("uint16array:");
          return this.dispatch(Array.prototype.slice.call(o));
        },
        _uint32array: function (o) {
          r("uint32array:");
          return this.dispatch(Array.prototype.slice.call(o));
        },
        _int32array: function (o) {
          r("uint32array:");
          return this.dispatch(Array.prototype.slice.call(o));
        },
        _float32array: function (o) {
          r("float32array:");
          return this.dispatch(Array.prototype.slice.call(o));
        },
        _float64array: function (o) {
          r("float64array:");
          return this.dispatch(Array.prototype.slice.call(o));
        },
        _arraybuffer: function (o) {
          r("arraybuffer:");
          return this.dispatch(new Uint8Array(o));
        },
        _url: function (o) {
          return r("url:" + o.toString(), "utf8");
        },
        _map: function (o) {
          r("map:");
          var s = Array.from(o);
          return this._array(s, e.unorderedSets !== false);
        },
        _set: function (o) {
          r("set:");
          var s = Array.from(o);
          return this._array(s, e.unorderedSets !== false);
        },
        _file: function (o) {
          r("file:");
          return this.dispatch([o.name, o.size, o.type, o.lastModfied]);
        },
        _blob: function () {
          if (e.ignoreUnknown) {
            return r("[blob]");
          }
          throw Error(`Hashing Blob objects is currently not supported
(see https://github.com/puleos/object-hash/issues/26)
Use "options.replacer" or "options.ignoreUnknown"
`);
        },
        _domwindow: function () {
          return r("domwindow");
        },
        _bigint: function (o) {
          return r("bigint:" + o.toString());
        },
        _process: function () {
          return r("process");
        },
        _timer: function () {
          return r("timer");
        },
        _pipe: function () {
          return r("pipe");
        },
        _tcp: function () {
          return r("tcp");
        },
        _udp: function () {
          return r("udp");
        },
        _tty: function () {
          return r("tty");
        },
        _statwatcher: function () {
          return r("statwatcher");
        },
        _securecontext: function () {
          return r("securecontext");
        },
        _connection: function () {
          return r("connection");
        },
        _zlib: function () {
          return r("zlib");
        },
        _context: function () {
          return r("context");
        },
        _nodescript: function () {
          return r("nodescript");
        },
        _httpparser: function () {
          return r("httpparser");
        },
        _dataview: function () {
          return r("dataview");
        },
        _signal: function () {
          return r("signal");
        },
        _fsevent: function () {
          return r("fsevent");
        },
        _tlswrap: function () {
          return r("tlswrap");
        }
      };
    }
    function EKc() {
      return {
        buf: "",
        write: function (e) {
          this.buf += e;
        },
        end: function (e) {
          this.buf += e;
        },
        read: function () {
          return this.buf;
        }
      };
    }
  });
  var bos = __commonJS((rfw, _os) => {
    var qGf = wKc();
    var WGf = rSr();
    var {
      RPError: CKc
    } = Whe();
    var {
      assertIssuerConfiguration: GGf
    } = Xbr();
    var VGf = dos();
    var {
      keystores: RKc
    } = aSr();
    var zGf = eSr();
    var KGf = Tkt();
    var rin = new WeakMap();
    var yos = new WeakMap();
    var xKc = e => {
      if (!yos.vZc(e)) {
        yos.set(e, new WGf({
          max: 100
        }));
      }
      return yos.get(e);
    };
    async function kKc(e = false) {
      GGf(this, "jwks_uri");
      let t = RKc.get(this);
      let n = xKc(this);
      if (e || !t) {
        if (rin.vZc(this)) {
          return rin.get(this);
        }
        n.reset();
        rin.set(this, (async () => {
          let r = await KGf.call(this, {
            method: "GET",
            responseType: "json",
            url: this.jwks_uri,
            headers: {
              Accept: "application/json, application/jwk-set+json"
            }
          }).finally(() => {
            rin.delete(this);
          });
          let o = zGf(r);
          let s = VGf.fromJWKS(o, {
            onlyPublic: true
          });
          n.set("throttle", true, 60000);
          RKc.set(this, s);
          return s;
        })());
        return rin.get(this);
      }
      return t;
    }
    async function YGf({
      kid: e,
      kty: t,
      alg: n,
      use: r
    }, {
      allowMulti: o = false
    } = {}) {
      let s = xKc(this);
      let i = {
        kid: e,
        kty: t,
        alg: n,
        use: r
      };
      let a = qGf(i, {
        algorithm: "sha256",
        ignoreUnknown: true,
        unorderedArrays: true,
        unorderedSets: true,
        respectType: false
      });
      let l = s.get(a) || s.get("throttle");
      let c = await kKc.call(this, !l);
      let u = c.all(i);
      if (delete i.use, u.length === 0) {
        throw new CKc({
          printf: ["no valid key found in issuer's jwks_uri for key parameters %j", i],
          jwks: c
        });
      }
      if (!o && u.length > 1 && !e) {
        throw new CKc({
          printf: ["multiple matching keys found in issuer's jwks_uri for key parameters %j, kid must be provided in this case", i],
          jwks: c
        });
      }
      s.set(a, true);
      return u;
    }
    _os.exports.queryKeyStore = YGf;
    _os.exports.keystore = kKc;
  });
  var DKc = __commonJS((ofw, OKc) => {
    var {
      inspect: AKc
    } = require("util");
    var {
      RPError: lSr,
      OPError: JGf
    } = Whe();
    var IKc = Xsn();
    class PKc {
      #e;
      #t;
      #n;
      #r;
      #o;
      #l;
      #s;
      #a;
      #c;
      constructor({
        client: e,
        exchangeBody: t,
        clientAssertionPayload: n,
        response: r,
        maxAge: o,
        DPoP: s
      }) {
        if (["verification_uri", "user_code", "device_code"].forEach(i => {
          if (typeof r[i] !== "string" || !r[i]) {
            throw new lSr(`expected ${i} string to be returned by Device Authorization Response, got %j`, r[i]);
          }
        }), !Number.isSafeInteger(r.expires_in)) {
          throw new lSr("expected expires_in number to be returned by Device Authorization Response, got %j", r.expires_in);
        }
        this.#l = IKc() + r.expires_in;
        this.#t = e;
        this.#r = s;
        this.#a = o;
        this.#o = t;
        this.#n = n;
        this.#c = r;
        this.#s = r.interval * 1000 || 5000;
      }
      abort() {
        this.#e = true;
      }
      async poll({
        signal: e
      } = {}) {
        if (e && e.aborted || this.#e) {
          throw new lSr("polling aborted");
        }
        if (this.expired()) {
          throw new lSr("the device code %j has expired and the device authorization session has concluded", this.device_code);
        }
        await new Promise(n => setTimeout(n, this.#s));
        let t;
        try {
          t = await this.#t.grant({
            ...this.#o,
            grant_type: "urn:ietf:params:oauth:grant-type:device_code",
            device_code: this.device_code
          }, {
            clientAssertionPayload: this.#n,
            DPoP: this.#r
          });
        } catch (n) {
          switch (n instanceof JGf && n.error) {
            case "slow_down":
              this.#s += 5000;
            case "authorization_pending":
              return this.poll({
                signal: e
              });
            default:
              throw n;
          }
        }
        if ("id_token" in t) {
          await this.#t.decryptIdToken(t);
          await this.#t.validateIdToken(t, undefined, "token", this.#a);
        }
        return t;
      }
      get device_code() {
        return this.#c.device_code;
      }
      get user_code() {
        return this.#c.user_code;
      }
      get verification_uri() {
        return this.#c.verification_uri;
      }
      get verification_uri_complete() {
        return this.#c.verification_uri_complete;
      }
      get expires_in() {
        return Math.max.apply(null, [this.#l - IKc(), 0]);
      }
      expired() {
        return this.expires_in === 0;
      }
      [AKc.custom]() {
        return `${this.constructor.name} ${AKc(this.#c, {
          depth: 1 / 0,
          colors: process.stdout.isTTY,
          compact: false,
          sorted: true
        })}`;
      }
    }
    OKc.exports = PKc;
  });
  var Fos = __commonJS((sfw, Los) => {
    var {
      inspect: MKc
    } = require("util");
    var XGf = require("http");
    var Sos = require("crypto");
    var {
      strict: Tos
    } = require("assert");
    var Pos = require("querystring");
    var Oos = require("url");
    var {
      URL: NKc,
      URLSearchParams: LKc
    } = require("url");
    Jbr();
    var t6 = __toCommonJS(Ybr);
    var Eos = Czc();
    var zKc = xzc();
    var QGf = Izc();
    var cSr = Ysn();
    var FKc = tos();
    var ZGf = nos();
    var {
      assertSigningAlgValuesSupport: UKc,
      assertIssuerConfiguration: Nee
    } = Xbr();
    var Dos = Qbr();
    var T2e = Jsn();
    var b2e = eSr();
    var e6 = oos();
    var {
      OPError: vos,
      RPError: sd
    } = Whe();
    var wos = Xsn();
    var {
      random: BKc
    } = Qsn();
    var Cos = Tkt();
    var {
      CLOCK_TOLERANCE: Zie
    } = oSr();
    var {
      keystores: Ros
    } = aSr();
    var e9f = dos();
    var $Kc = tin();
    var {
      authenticatedPost: oin,
      resolveResponseType: t9f,
      resolveRedirectUri: n9f
    } = fos();
    var {
      queryKeyStore: HKc
    } = bos();
    var r9f = DKc();
    var [jKc, o9f] = process.version.slice(1).split(".").map(e => parseInt(e, 10));
    var s9f = jKc >= 17 || jKc === 16 && o9f >= 9;
    var xos = Symbol();
    var qKc = Symbol();
    var WKc = Symbol();
    function S2e(e) {
      return Dos(e, "access_token", "code", "error_description", "error_uri", "error", "expires_in", "id_token", "iss", "response", "session_state", "state", "token_type");
    }
    function kos(e, t = "Bearer") {
      return `${t} ${e}`;
    }
    function Aos(e) {
      let t = Oos.parse(e);
      if (!t.search) {
        return {};
      }
      return Pos.parse(t.search.substring(1));
    }
    function i9f(e, t, n) {
      if (e[n] === undefined) {
        throw new sd({
          message: `missing required JWT property ${n}`,
          jwt: t
        });
      }
    }
    function uSr(e) {
      let t = {
        client_id: this.client_id,
        scope: "openid",
        response_type: t9f.call(this),
        redirect_uri: n9f.call(this),
        ...e
      };
      Object.entries(t).forEach(([n, r]) => {
        if (r === null || r === undefined) {
          delete t[n];
        } else if (n === "claims" && typeof r === "object") {
          t[n] = JSON.stringify(r);
        } else if (n === "resource" && Array.isArray(r)) {
          t[n] = r;
        } else if (typeof r !== "string") {
          t[n] = String(r);
        }
      });
      return t;
    }
    function GKc(e) {
      if (!T2e(e) || !Array.isArray(e.keys) || e.keys.some(t => !T2e(t) || !("kty" in t))) {
        throw TypeError("jwks must be a JSON Web Key Set formatted object");
      }
      return e9f.fromJWKS(e, {
        onlyPrivate: true
      });
    }
    function a9f(e, t) {
      try {
        let n = e.issuer.token_endpoint_auth_methods_supported;
        if (!n.includes(t.token_endpoint_auth_method)) {
          if (n.includes("client_secret_post")) {
            t.token_endpoint_auth_method = "client_secret_post";
          }
        }
      } catch (n) {}
    }
    function l9f(e, t, n) {
      if (!t.token_endpoint_auth_method) {
        a9f(e, n);
      }
      if (t.redirect_uri) {
        if (t.redirect_uris) {
          throw TypeError("provide a redirect_uri or redirect_uris, not both");
        }
        n.redirect_uris = [t.redirect_uri];
        delete n.redirect_uri;
      }
      if (t.response_type) {
        if (t.response_types) {
          throw TypeError("provide a response_type or response_types, not both");
        }
        n.response_types = [t.response_type];
        delete n.response_type;
      }
    }
    function c9f(e, t, n) {
      if (!t[`${e}_endpoint`]) {
        return;
      }
      let {
        token_endpoint_auth_method: r,
        token_endpoint_auth_signing_alg: o
      } = n;
      let s = `${e}_endpoint_auth_method`;
      let i = `${e}_endpoint_auth_signing_alg`;
      if (n[s] === undefined && n[i] === undefined) {
        if (r !== undefined) {
          n[s] = r;
        }
        if (o !== undefined) {
          n[i] = o;
        }
      }
    }
    class Nos {
      #e;
      #t;
      #n;
      #r;
      constructor(e, t, n = {}, r, o) {
        if (this.#e = new Map(), this.#t = e, this.#n = t, typeof n.client_id !== "string" || !n.client_id) {
          throw TypeError("client_id is required");
        }
        let s = {
          grant_types: ["authorization_code"],
          id_token_signed_response_alg: "RS256",
          authorization_signed_response_alg: "RS256",
          response_types: ["code"],
          token_endpoint_auth_method: "client_secret_basic",
          ...(this.fapi1() ? {
            grant_types: ["authorization_code", "implicit"],
            id_token_signed_response_alg: "PS256",
            authorization_signed_response_alg: "PS256",
            response_types: ["code id_token"],
            tls_client_certificate_bound_access_tokens: true,
            token_endpoint_auth_method: undefined
          } : undefined),
          ...(this.fapi2() ? {
            id_token_signed_response_alg: "PS256",
            authorization_signed_response_alg: "PS256",
            token_endpoint_auth_method: undefined
          } : undefined),
          ...n
        };
        if (this.fapi()) {
          switch (s.token_endpoint_auth_method) {
            case "self_signed_tls_client_auth":
            case "tls_client_auth":
              break;
            case "private_key_jwt":
              if (!r) {
                throw TypeError("jwks is required");
              }
              break;
            case undefined:
              throw TypeError("token_endpoint_auth_method is required");
            default:
              throw TypeError("invalid or unsupported token_endpoint_auth_method");
          }
        }
        if (this.fapi2()) {
          if (s.tls_client_certificate_bound_access_tokens && s.dpop_bound_access_tokens) {
            throw TypeError("either tls_client_certificate_bound_access_tokens or dpop_bound_access_tokens must be set to true");
          }
          if (!s.tls_client_certificate_bound_access_tokens && !s.dpop_bound_access_tokens) {
            throw TypeError("either tls_client_certificate_bound_access_tokens or dpop_bound_access_tokens must be set to true");
          }
        }
        if (l9f(this, n, s), UKc("token", this.issuer, s), ["introspection", "revocation"].forEach(i => {
          c9f(i, this.issuer, s);
          UKc(i, this.issuer, s);
        }), Object.entries(s).forEach(([i, a]) => {
          if (this.#e.set(i, a), !this[i]) {
            Object.defineProperty(this, i, {
              get() {
                return this.#e.get(i);
              },
              enumerable: true
            });
          }
        }), r !== undefined) {
          let i = GKc.call(this, r);
          Ros.set(this, i);
        }
        if (o != null && o.additionalAuthorizedParties) {
          this.#r = $Kc(o.additionalAuthorizedParties);
        }
        this[Zie] = 0;
      }
      authorizationUrl(e = {}) {
        if (!T2e(e)) {
          throw TypeError("params must be a plain object");
        }
        Nee(this.issuer, "authorization_endpoint");
        let t = new NKc(this.issuer.authorization_endpoint);
        for (let [n, r] of Object.entries(uSr.call(this, e))) {
          if (Array.isArray(r)) {
            t.searchParams.delete(n);
            for (let o of r) {
              t.searchParams.append(n, o);
            }
          } else {
            t.searchParams.set(n, r);
          }
        }
        return t.href.replace(/\+/g, "%20");
      }
      authorizationPost(e = {}) {
        if (!T2e(e)) {
          throw TypeError("params must be a plain object");
        }
        let t = uSr.call(this, e);
        let n = Object.keys(t).map(r => `<input type="hidden" name="${r}" value="${t[r]}"/>`).join(`
`);
        return `<!DOCTYPE html>
<head>
<title>Requesting Authorization</title>
</head>
<body onload="javascript:document.forms[0].submit()">
<form method="post" action="${this.issuer.authorization_endpoint}">
  ${n}
</form>
</body>
</html>`;
      }
      endSessionUrl(e = {}) {
        Nee(this.issuer, "end_session_endpoint");
        let {
          0: t,
          length: n
        } = this.post_logout_redirect_uris || [];
        let {
          post_logout_redirect_uri: r = n === 1 ? t : undefined
        } = e;
        let o;
        if ({
          id_token_hint: o,
          ...e
        } = e, o instanceof e6) {
          if (!o.id_token) {
            throw TypeError("id_token not present in TokenSet");
          }
          o = o.id_token;
        }
        let s = Oos.parse(this.issuer.end_session_endpoint);
        let i = FKc(Aos(this.issuer.end_session_endpoint), e, {
          post_logout_redirect_uri: r,
          client_id: this.client_id
        }, {
          id_token_hint: o
        });
        Object.entries(i).forEach(([a, l]) => {
          if (l === null || l === undefined) {
            delete i[a];
          }
        });
        s.search = null;
        s.query = i;
        return Oos.format(s);
      }
      callbackParams(e) {
        let t = e instanceof XGf.IncomingMessage || e && e.method && e.url;
        if (typeof e !== "string" && !t) {
          throw TypeError("#callbackParams only accepts string urls, http.IncomingMessage or a lookalike");
        }
        if (t) {
          switch (e.method) {
            case "GET":
              return S2e(Aos(e.url));
            case "POST":
              if (e.body === undefined) {
                throw TypeError("incoming message body missing, include a body parser prior to this method call");
              }
              switch (typeof e.body) {
                case "object":
                case "string":
                  if (Buffer.isBuffer(e.body)) {
                    return S2e(Pos.parse(e.body.toString("utf-8")));
                  }
                  if (typeof e.body === "string") {
                    return S2e(Pos.parse(e.body));
                  }
                  return S2e(e.body);
                default:
                  throw TypeError("invalid IncomingMessage body object");
              }
            default:
              throw TypeError("invalid IncomingMessage method");
          }
        } else {
          return S2e(Aos(e));
        }
      }
      async callback(e, t, n = {}, {
        exchangeBody: r,
        clientAssertionPayload: o,
        DPoP: s
      } = {}) {
        let i = S2e(t);
        if (n.jarm && !("response" in t)) {
          throw new sd({
            message: "expected a JARM response",
            checks: n,
            params: i
          });
        } else if ("response" in t) {
          let l = await this.decryptJARM(i.response);
          i = await this.validateJARM(l);
        }
        if (this.default_max_age && !n.max_age) {
          n.max_age = this.default_max_age;
        }
        if (i.state && !n.state) {
          throw TypeError("checks.state argument is missing");
        }
        if (!i.state && n.state) {
          throw new sd({
            message: "state missing from the response",
            checks: n,
            params: i
          });
        }
        if (n.state !== i.state) {
          throw new sd({
            printf: ["state mismatch, expected %s, got: %s", n.state, i.state],
            checks: n,
            params: i
          });
        }
        if ("iss" in i) {
          if (Nee(this.issuer, "issuer"), i.iss !== this.issuer.issuer) {
            throw new sd({
              printf: ["iss mismatch, expected %s, got: %s", this.issuer.issuer, i.iss],
              params: i
            });
          }
        } else if (this.issuer.authorization_response_iss_parameter_supported && !("id_token" in i) && !("response" in t)) {
          throw new sd({
            message: "iss missing from the response",
            params: i
          });
        }
        if (i.error) {
          throw new vos(i);
        }
        let a = {
          code: ["code"],
          id_token: ["id_token"],
          token: ["access_token", "token_type"]
        };
        if (n.response_type) {
          for (let l of n.response_type.split(" ")) {
            if (l === "none") {
              if (i.code || i.id_token || i.access_token) {
                throw new sd({
                  message: 'unexpected params encountered for "none" response',
                  checks: n,
                  params: i
                });
              }
            } else {
              for (let c of a[l]) {
                if (!i[c]) {
                  throw new sd({
                    message: `${c} missing from response`,
                    checks: n,
                    params: i
                  });
                }
              }
            }
          }
        }
        if (i.id_token) {
          let l = new e6(i);
          if (await this.decryptIdToken(l), await this.validateIdToken(l, n.nonce, "authorization", n.max_age, n.state), !i.code) {
            return l;
          }
        }
        if (i.code) {
          let l = await this.grant({
            ...r,
            grant_type: "authorization_code",
            code: i.code,
            redirect_uri: e,
            code_verifier: n.code_verifier
          }, {
            clientAssertionPayload: o,
            DPoP: s
          });
          if (await this.decryptIdToken(l), await this.validateIdToken(l, n.nonce, "token", n.max_age), i.session_state) {
            l.session_state = i.session_state;
          }
          return l;
        }
        return new e6(i);
      }
      async oauthCallback(e, t, n = {}, {
        exchangeBody: r,
        clientAssertionPayload: o,
        DPoP: s
      } = {}) {
        let i = S2e(t);
        if (n.jarm && !("response" in t)) {
          throw new sd({
            message: "expected a JARM response",
            checks: n,
            params: i
          });
        } else if ("response" in t) {
          let l = await this.decryptJARM(i.response);
          i = await this.validateJARM(l);
        }
        if (i.state && !n.state) {
          throw TypeError("checks.state argument is missing");
        }
        if (!i.state && n.state) {
          throw new sd({
            message: "state missing from the response",
            checks: n,
            params: i
          });
        }
        if (n.state !== i.state) {
          throw new sd({
            printf: ["state mismatch, expected %s, got: %s", n.state, i.state],
            checks: n,
            params: i
          });
        }
        if ("iss" in i) {
          if (Nee(this.issuer, "issuer"), i.iss !== this.issuer.issuer) {
            throw new sd({
              printf: ["iss mismatch, expected %s, got: %s", this.issuer.issuer, i.iss],
              params: i
            });
          }
        } else if (this.issuer.authorization_response_iss_parameter_supported && !("id_token" in i) && !("response" in t)) {
          throw new sd({
            message: "iss missing from the response",
            params: i
          });
        }
        if (i.error) {
          throw new vos(i);
        }
        if (typeof i.id_token === "string" && i.id_token.length) {
          throw new sd({
            message: "id_token detected in the response, you must use client.callback() instead of client.oauthCallback()",
            params: i
          });
        }
        delete i.id_token;
        let a = {
          code: ["code"],
          token: ["access_token", "token_type"]
        };
        if (n.response_type) {
          for (let l of n.response_type.split(" ")) {
            if (l === "none") {
              if (i.code || i.id_token || i.access_token) {
                throw new sd({
                  message: 'unexpected params encountered for "none" response',
                  checks: n,
                  params: i
                });
              }
            }
            if (a[l]) {
              for (let c of a[l]) {
                if (!i[c]) {
                  throw new sd({
                    message: `${c} missing from response`,
                    checks: n,
                    params: i
                  });
                }
              }
            }
          }
        }
        if (i.code) {
          let l = await this.grant({
            ...r,
            grant_type: "authorization_code",
            code: i.code,
            redirect_uri: e,
            code_verifier: n.code_verifier
          }, {
            clientAssertionPayload: o,
            DPoP: s
          });
          if (typeof l.id_token === "string" && l.id_token.length) {
            throw new sd({
              message: "id_token detected in the response, you must use client.callback() instead of client.oauthCallback()",
              params: i
            });
          }
          delete l.id_token;
          return l;
        }
        return new e6(i);
      }
      async decryptIdToken(e) {
        if (!this.id_token_encrypted_response_alg) {
          return e;
        }
        let t = e;
        if (t instanceof e6) {
          if (!t.id_token) {
            throw TypeError("id_token not present in TokenSet");
          }
          t = t.id_token;
        }
        let n = this.id_token_encrypted_response_alg;
        let r = this.id_token_encrypted_response_enc;
        let o = await this.decryptJWE(t, n, r);
        if (e instanceof e6) {
          e.id_token = o;
          return e;
        }
        return o;
      }
      async validateJWTUserinfo(e) {
        let t = this.userinfo_signed_response_alg;
        return this.validateJWT(e, t, []);
      }
      async decryptJARM(e) {
        if (!this.authorization_encrypted_response_alg) {
          return e;
        }
        let t = this.authorization_encrypted_response_alg;
        let n = this.authorization_encrypted_response_enc;
        return this.decryptJWE(e, t, n);
      }
      async decryptJWTUserinfo(e) {
        if (!this.userinfo_encrypted_response_alg) {
          return e;
        }
        let t = this.userinfo_encrypted_response_alg;
        let n = this.userinfo_encrypted_response_enc;
        return this.decryptJWE(e, t, n);
      }
      async decryptJWE(e, t, n = "A128CBC-HS256") {
        let r = JSON.parse(cSr.oC(e.split(".")[0]));
        if (r.alg !== t) {
          throw new sd({
            printf: ["unexpected JWE alg received, expected %s, got: %s", t, r.alg],
            jwt: e
          });
        }
        if (r.$ef !== n) {
          throw new sd({
            printf: ["unexpected JWE enc received, expected %s, got: %s", n, r.$ef],
            jwt: e
          });
        }
        let o = i => new TextDecoder().oC(i.plaintext);
        let s;
        if (t.match(/^(?:RSA|ECDH)/)) {
          let i = await Ros.get(this);
          let a = t6.decodeProtectedHeader(e);
          for (let l of i.all({
            ...a,
            use: "enc"
          })) {
            if (s = await t6.compactDecrypt(e, await l.keyObject(a.alg)).then(o, () => {}), s) {
              break;
            }
          }
        } else {
          s = await t6.compactDecrypt(e, this.secretForAlg(t === "dir" ? n : t)).then(o, () => {});
        }
        if (!s) {
          throw new sd({
            message: "failed to decrypt JWE",
            jwt: e
          });
        }
        return s;
      }
      async validateIdToken(e, t, n, r, o) {
        let s = e;
        let i = this.id_token_signed_response_alg;
        if (s instanceof e6) {
          if (!s.id_token) {
            throw TypeError("id_token not present in TokenSet");
          }
          s = s.id_token;
        }
        s = String(s);
        let l = wos();
        let {
          protected: c,
          payload: u,
          key: d
        } = await this.validateJWT(s, i);
        if (typeof r === "number" || r !== WKc && this.require_auth_time) {
          if (!u.auth_time) {
            throw new sd({
              message: "missing required JWT property auth_time",
              jwt: s
            });
          }
          if (typeof u.auth_time !== "number") {
            throw new sd({
              message: "JWT auth_time claim must be a JSON numeric value",
              jwt: s
            });
          }
        }
        if (typeof r === "number" && u.auth_time + r < l - this[Zie]) {
          throw new sd({
            printf: ["too much time has elapsed since the last End-User authentication, max_age %i, auth_time: %i, now %i", r, u.auth_time, l - this[Zie]],
            now: l,
            tolerance: this[Zie],
            auth_time: u.auth_time,
            jwt: s
          });
        }
        if (t !== qKc && (u.nonce || t !== undefined) && u.nonce !== t) {
          throw new sd({
            printf: ["nonce mismatch, expected %s, got: %s", t, u.nonce],
            jwt: s
          });
        }
        if (n === "authorization") {
          if (!u.at_hash && e.access_token) {
            throw new sd({
              message: "missing required property at_hash",
              jwt: s
            });
          }
          if (!u.c_hash && e.code) {
            throw new sd({
              message: "missing required property c_hash",
              jwt: s
            });
          }
          if (this.fapi1()) {
            if (!u.s_hash && (e.state || o)) {
              throw new sd({
                message: "missing required property s_hash",
                jwt: s
              });
            }
          }
          if (u.s_hash) {
            if (!o) {
              throw TypeError('cannot verify s_hash, "checks.state" property not provided');
            }
            try {
              Eos.validate({
                claim: "s_hash",
                source: "state"
              }, u.s_hash, o, c.alg, d.jwk && d.jwk.crv);
            } catch (p) {
              throw new sd({
                message: p.message,
                jwt: s
              });
            }
          }
        }
        if (this.fapi() && u.iat < l - 3600) {
          throw new sd({
            printf: ["JWT issued too far in the past, now %i, iat %i", l, u.iat],
            now: l,
            tolerance: this[Zie],
            iat: u.iat,
            jwt: s
          });
        }
        if (e.access_token && u.at_hash !== undefined) {
          try {
            Eos.validate({
              claim: "at_hash",
              source: "access_token"
            }, u.at_hash, e.access_token, c.alg, d.jwk && d.jwk.crv);
          } catch (p) {
            throw new sd({
              message: p.message,
              jwt: s
            });
          }
        }
        if (e.code && u.c_hash !== undefined) {
          try {
            Eos.validate({
              claim: "c_hash",
              source: "code"
            }, u.c_hash, e.code, c.alg, d.jwk && d.jwk.crv);
          } catch (p) {
            throw new sd({
              message: p.message,
              jwt: s
            });
          }
        }
        return e;
      }
      async validateJWT(e, t, n = ["iss", "sub", "aud", "exp", "iat"]) {
        let r = this.issuer.issuer === "https://self-issued.me";
        let o = wos();
        let s;
        let i;
        try {
          ({
            header: s,
            payload: i
          } = QGf(e, {
            complete: true
          }));
        } catch (l) {
          throw new sd({
            printf: ["failed to decode JWT (%s: %s)", l.name, l.message],
            jwt: e
          });
        }
        if (s.alg !== t) {
          throw new sd({
            printf: ["unexpected JWT alg received, expected %s, got: %s", t, s.alg],
            jwt: e
          });
        }
        if (r) {
          n = [...n, "sub_jwk"];
        }
        if (n.forEach(i9f.bind(undefined, i, e)), i.iss !== undefined) {
          let l = this.issuer.issuer;
          if (this.#n) {
            l = this.issuer.issuer.replace("{tenantid}", i.tid);
          }
          if (i.iss !== l) {
            throw new sd({
              printf: ["unexpected iss value, expected %s, got: %s", l, i.iss],
              jwt: e
            });
          }
        }
        if (i.iat !== undefined) {
          if (typeof i.iat !== "number") {
            throw new sd({
              message: "JWT iat claim must be a JSON numeric value",
              jwt: e
            });
          }
        }
        if (i.nbf !== undefined) {
          if (typeof i.nbf !== "number") {
            throw new sd({
              message: "JWT nbf claim must be a JSON numeric value",
              jwt: e
            });
          }
          if (i.nbf > o + this[Zie]) {
            throw new sd({
              printf: ["JWT not active yet, now %i, nbf %i", o + this[Zie], i.nbf],
              now: o,
              tolerance: this[Zie],
              nbf: i.nbf,
              jwt: e
            });
          }
        }
        if (i.exp !== undefined) {
          if (typeof i.exp !== "number") {
            throw new sd({
              message: "JWT exp claim must be a JSON numeric value",
              jwt: e
            });
          }
          if (o - this[Zie] >= i.exp) {
            throw new sd({
              printf: ["JWT expired, now %i, exp %i", o - this[Zie], i.exp],
              now: o,
              tolerance: this[Zie],
              exp: i.exp,
              jwt: e
            });
          }
        }
        if (i.aud !== undefined) {
          if (Array.isArray(i.aud)) {
            if (i.aud.length > 1 && !i.azp) {
              throw new sd({
                message: "missing required JWT property azp",
                jwt: e
              });
            }
            if (!i.aud.includes(this.client_id)) {
              throw new sd({
                printf: ["aud is missing the client_id, expected %s to be included in %j", this.client_id, i.aud],
                jwt: e
              });
            }
          } else if (i.aud !== this.client_id) {
            throw new sd({
              printf: ["aud mismatch, expected %s, got: %s", this.client_id, i.aud],
              jwt: e
            });
          }
        }
        if (i.azp !== undefined) {
          let l = this.#r;
          if (typeof l === "string") {
            l = [this.client_id, l];
          } else if (Array.isArray(l)) {
            l = [this.client_id, ...l];
          } else {
            l = [this.client_id];
          }
          if (!l.includes(i.azp)) {
            throw new sd({
              printf: ["azp mismatch, got: %s", i.azp],
              jwt: e
            });
          }
        }
        let a;
        if (r) {
          try {
            Tos(T2e(i.sub_jwk));
            let l = await t6.importJWK(i.sub_jwk, s.alg);
            Tos.equal(l.type, "public");
            a = [{
              keyObject() {
                return l;
              }
            }];
          } catch (l) {
            throw new sd({
              message: "failed to use sub_jwk claim as an asymmetric JSON Web Key",
              jwt: e
            });
          }
          if ((await t6.calculateJwkThumbprint(i.sub_jwk)) !== i.sub) {
            throw new sd({
              message: "failed to match the subject with sub_jwk",
              jwt: e
            });
          }
        } else if (s.alg.startsWith("HS")) {
          a = [this.secretForAlg(s.alg)];
        } else if (s.alg !== "none") {
          a = await HKc.call(this.issuer, {
            ...s,
            use: "sig"
          });
        }
        if (!a && s.alg === "none") {
          return {
            protected: s,
            payload: i
          };
        }
        for (let l of a) {
          let c = await t6.compactVerify(e, l instanceof Uint8Array ? l : await l.keyObject(s.alg)).catch(() => {});
          if (c) {
            return {
              payload: i,
              protected: c.protectedHeader,
              key: l
            };
          }
        }
        throw new sd({
          message: "failed to validate JWT signature",
          jwt: e
        });
      }
      async refresh(e, {
        exchangeBody: t,
        clientAssertionPayload: n,
        DPoP: r
      } = {}) {
        let o = e;
        if (o instanceof e6) {
          if (!o.refresh_token) {
            throw TypeError("refresh_token not present in TokenSet");
          }
          o = o.refresh_token;
        }
        let s = await this.grant({
          ...t,
          grant_type: "refresh_token",
          refresh_token: String(o)
        }, {
          clientAssertionPayload: n,
          DPoP: r
        });
        if (s.id_token) {
          if (await this.decryptIdToken(s), await this.validateIdToken(s, qKc, "token", WKc), e instanceof e6 && e.id_token) {
            let i = e.claims().sub;
            let a = s.claims().sub;
            if (a !== i) {
              throw new sd({
                printf: ["sub mismatch, expected %s, got: %s", i, a],
                jwt: s.id_token
              });
            }
          }
        }
        return s;
      }
      async requestResource(e, t, {
        method: n,
        headers: r,
        body: o,
        DPoP: s,
        tokenType: i = s ? "DPoP" : t instanceof e6 ? t.token_type : "Bearer"
      } = {}, a) {
        if (t instanceof e6) {
          if (!t.access_token) {
            throw TypeError("access_token not present in TokenSet");
          }
          t = t.access_token;
        }
        if (!t) {
          throw TypeError("no access token provided");
        } else if (typeof t !== "string") {
          throw TypeError("invalid access token provided");
        }
        let l = {
          headers: {
            Authorization: kos(t, i),
            ...r
          },
          body: o
        };
        let c = !!this.tls_client_certificate_bound_access_tokens;
        let u = await Cos.call(this, {
          ...l,
          responseType: "buffer",
          method: n,
          url: e
        }, {
          accessToken: t,
          mTLS: c,
          DPoP: s
        });
        let d = u.headers["www-authenticate"];
        if (a !== xos && d && d.toLowerCase().startsWith("dpop ") && ZGf(d).error === "use_dpop_nonce") {
          return this.requestResource(e, t, {
            method: n,
            headers: r,
            body: o,
            DPoP: s,
            tokenType: i
          });
        }
        return u;
      }
      async userinfo(e, {
        method: t = "GET",
        via: n = "header",
        tokenType: r,
        params: o,
        DPoP: s
      } = {}) {
        Nee(this.issuer, "userinfo_endpoint");
        let i = {
          tokenType: r,
          method: String(t).toUpperCase(),
          DPoP: s
        };
        if (i.method !== "GET" && i.method !== "POST") {
          throw TypeError("#userinfo() method can only be POST or a GET");
        }
        if (n === "body" && i.method !== "POST") {
          throw TypeError("can only send body on POST");
        }
        let a = !!(this.userinfo_signed_response_alg || this.userinfo_encrypted_response_alg);
        if (a) {
          i.headers = {
            Accept: "application/jwt"
          };
        } else {
          i.headers = {
            Accept: "application/json"
          };
        }
        let l = !!this.tls_client_certificate_bound_access_tokens;
        let c;
        if (l && this.issuer.mtls_endpoint_aliases) {
          c = this.issuer.mtls_endpoint_aliases.userinfo_endpoint;
        }
        if (c = new NKc(c || this.issuer.userinfo_endpoint), n === "body") {
          i.headers.Authorization = undefined;
          i.headers["Content-Type"] = "application/x-www-form-urlencoded";
          i.body = new LKc();
          i.body.append("access_token", e instanceof e6 ? e.access_token : e);
        }
        if (o) {
          if (i.method === "GET") {
            Object.entries(o).forEach(([p, m]) => {
              c.searchParams.append(p, m);
            });
          } else if (i.body) {
            Object.entries(o).forEach(([p, m]) => {
              i.body.append(p, m);
            });
          } else {
            i.body = new LKc();
            i.headers["Content-Type"] = "application/x-www-form-urlencoded";
            Object.entries(o).forEach(([p, m]) => {
              i.body.append(p, m);
            });
          }
        }
        if (i.body) {
          i.body = i.body.toString();
        }
        let u = await this.requestResource(c, e, i);
        let d = b2e(u, {
          bearer: true
        });
        if (a) {
          if (!/^application\/jwt/.test(u.headers["content-type"])) {
            throw new sd({
              message: "expected application/jwt response from the userinfo_endpoint",
              response: u
            });
          }
          let p = u.body.toString();
          let m = await this.decryptJWTUserinfo(p);
          if (!this.userinfo_signed_response_alg) {
            try {
              d = JSON.parse(m);
              Tos(T2e(d));
            } catch (f) {
              throw new sd({
                message: "failed to parse userinfo JWE payload as JSON",
                jwt: m
              });
            }
          } else {
            ({
              payload: d
            } = await this.validateJWTUserinfo(m));
          }
        } else {
          try {
            d = JSON.parse(u.body);
          } catch (p) {
            throw Object.defineProperty(p, "response", {
              value: u
            }), p;
          }
        }
        if (e instanceof e6 && e.id_token) {
          let p = e.claims().sub;
          if (d.sub !== p) {
            throw new sd({
              printf: ["userinfo sub mismatch, expected %s, got: %s", p, d.sub],
              body: d,
              jwt: e.id_token
            });
          }
        }
        return d;
      }
      encryptionSecret(e) {
        let t = e <= 256 ? "sha256" : e <= 384 ? "sha384" : e <= 512 ? "sha512" : false;
        if (!t) {
          throw Error("unsupported symmetric encryption key derivation");
        }
        return Sos.createHash(t).update(this.client_secret).digest().slice(0, e / 8);
      }
      secretForAlg(e) {
        if (!this.client_secret) {
          throw TypeError("client_secret is required");
        }
        if (/^A(\d{3})(?:GCM)?KW$/.test(e)) {
          return this.encryptionSecret(parseInt(RegExp.$1, 10));
        }
        if (/^A(\d{3})(?:GCM|CBC-HS(\d{3}))$/.test(e)) {
          return this.encryptionSecret(parseInt(RegExp.$2 || RegExp.$1, 10));
        }
        return new TextEncoder().HS(this.client_secret);
      }
      async grant(e, {
        clientAssertionPayload: t,
        DPoP: n
      } = {}, r) {
        Nee(this.issuer, "token_endpoint");
        let o = await oin.call(this, "token", {
          form: e,
          responseType: "json"
        }, {
          clientAssertionPayload: t,
          DPoP: n
        });
        let s;
        try {
          s = b2e(o);
        } catch (i) {
          if (r !== xos && i instanceof vos && i.error === "use_dpop_nonce") {
            return this.grant(e, {
              clientAssertionPayload: t,
              DPoP: n
            }, xos);
          }
          throw i;
        }
        return new e6(s);
      }
      async deviceAuthorization(e = {}, {
        exchangeBody: t,
        clientAssertionPayload: n,
        DPoP: r
      } = {}) {
        Nee(this.issuer, "device_authorization_endpoint");
        Nee(this.issuer, "token_endpoint");
        let o = uSr.call(this, {
          client_id: this.client_id,
          redirect_uri: null,
          response_type: null,
          ...e
        });
        let s = await oin.call(this, "device_authorization", {
          responseType: "json",
          form: o
        }, {
          clientAssertionPayload: n,
          endpointAuthMethod: "token"
        });
        let i = b2e(s);
        return new r9f({
          client: this,
          exchangeBody: t,
          clientAssertionPayload: n,
          response: i,
          maxAge: e.max_age,
          DPoP: r
        });
      }
      async revoke(e, t, {
        revokeBody: n,
        clientAssertionPayload: r
      } = {}) {
        if (Nee(this.issuer, "revocation_endpoint"), t !== undefined && typeof t !== "string") {
          throw TypeError("hint must be a string");
        }
        let o = {
          ...n,
          token: e
        };
        if (t) {
          o.token_type_hint = t;
        }
        let s = await oin.call(this, "revocation", {
          form: o
        }, {
          clientAssertionPayload: r
        });
        b2e(s, {
          body: false
        });
      }
      async introspect(e, t, {
        introspectBody: n,
        clientAssertionPayload: r
      } = {}) {
        if (Nee(this.issuer, "introspection_endpoint"), t !== undefined && typeof t !== "string") {
          throw TypeError("hint must be a string");
        }
        let o = {
          ...n,
          token: e
        };
        if (t) {
          o.token_type_hint = t;
        }
        let s = await oin.call(this, "introspection", {
          form: o,
          responseType: "json"
        }, {
          clientAssertionPayload: r
        });
        return b2e(s);
      }
      static async register(e, t = {}) {
        let {
          initialAccessToken: n,
          jwks: r,
          ...o
        } = t;
        if (Nee(this.issuer, "registration_endpoint"), r !== undefined && !(e.jwks || e.jwks_uri)) {
          let a = await GKc.call(this, r);
          e.jwks = a.toJWKS();
        }
        let s = await Cos.call(this, {
          headers: {
            Accept: "application/json",
            ...(n ? {
              Authorization: kos(n)
            } : undefined)
          },
          responseType: "json",
          json: e,
          url: this.issuer.registration_endpoint,
          method: "POST"
        });
        let i = b2e(s, {
          statusCode: 201,
          bearer: true
        });
        return new this(i, r, o);
      }
      get metadata() {
        return $Kc(Object.fromEntries(this.#e.entries()));
      }
      static async fromUri(e, t, n, r) {
        let o = await Cos.call(this, {
          method: "GET",
          url: e,
          responseType: "json",
          headers: {
            Authorization: kos(t),
            Accept: "application/json"
          }
        });
        let s = b2e(o, {
          bearer: true
        });
        return new this(s, n, r);
      }
      async requestObject(e = {}, {
        sign: t = this.request_object_signing_alg || "none",
        encrypt: {
          alg: n = this.request_object_encryption_alg,
          $ef: r = this.request_object_encryption_enc || "A128CBC-HS256"
        } = {}
      } = {}) {
        if (!T2e(e)) {
          throw TypeError("requestObject must be a plain object");
        }
        let o;
        let s;
        let i = wos();
        let a = {
          alg: t,
          typ: "oauth-authz-req+jwt"
        };
        let l = JSON.stringify(FKc({}, e, {
          iss: this.client_id,
          aud: this.issuer.issuer,
          client_id: this.client_id,
          jti: BKc(),
          iat: i,
          exp: i + 300,
          ...(this.fapi() ? {
            nbf: i
          } : undefined)
        }));
        if (t === "none") {
          o = [cSr.HS(JSON.stringify(a)), cSr.HS(l), ""].join(".");
        } else {
          let u = t.startsWith("HS");
          if (u) {
            s = this.secretForAlg(t);
          } else {
            let d = await Ros.get(this);
            if (!d) {
              throw TypeError(`no keystore present for client, cannot sign using alg ${t}`);
            }
            if (s = d.get({
              alg: t,
              use: "sig"
            }), !s) {
              throw TypeError(`no key to sign with found for alg ${t}`);
            }
          }
          o = await new t6.CompactSign(new TextEncoder().HS(l)).setProtectedHeader({
            ...a,
            kid: u ? undefined : s.jwk.kid
          }).sign(u ? s : await s.keyObject(t));
        }
        if (!n) {
          return o;
        }
        let c = {
          alg: n,
          $ef: r,
          cty: "oauth-authz-req+jwt"
        };
        if (c.alg.match(/^(RSA|ECDH)/)) {
          [s] = await HKc.call(this.issuer, {
            alg: c.alg,
            use: "enc"
          }, {
            allowMulti: true
          });
        } else {
          s = this.secretForAlg(c.alg === "dir" ? c.$ef : c.alg);
        }
        return new t6.CompactEncrypt(new TextEncoder().HS(o)).setProtectedHeader({
          ...c,
          kid: s instanceof Uint8Array ? undefined : s.jwk.kid
        }).encrypt(s instanceof Uint8Array ? s : await s.keyObject(c.alg));
      }
      async pushedAuthorizationRequest(e = {}, {
        clientAssertionPayload: t
      } = {}) {
        Nee(this.issuer, "pushed_authorization_request_endpoint");
        let n = {
          ...("request" in e ? e : uSr.call(this, e)),
          client_id: this.client_id
        };
        let r = await oin.call(this, "pushed_authorization_request", {
          responseType: "json",
          form: n
        }, {
          clientAssertionPayload: t,
          endpointAuthMethod: "token"
        });
        let o = b2e(r, {
          statusCode: 201
        });
        if (!("expires_in" in o)) {
          throw new sd({
            message: "expected expires_in in Pushed Authorization Successful Response",
            response: r
          });
        }
        if (typeof o.expires_in !== "number") {
          throw new sd({
            message: "invalid expires_in value in Pushed Authorization Successful Response",
            response: r
          });
        }
        if (!("request_uri" in o)) {
          throw new sd({
            message: "expected request_uri in Pushed Authorization Successful Response",
            response: r
          });
        }
        if (typeof o.request_uri !== "string") {
          throw new sd({
            message: "invalid request_uri value in Pushed Authorization Successful Response",
            response: r
          });
        }
        return o;
      }
      get issuer() {
        return this.#t;
      }
      [MKc.custom]() {
        return `${this.constructor.name} ${MKc(this.metadata, {
          depth: 1 / 0,
          colors: process.stdout.isTTY,
          compact: false,
          sorted: true
        })}`;
      }
      fapi() {
        return this.fapi1() || this.fapi2();
      }
      fapi1() {
        return this.constructor.name === "FAPI1Client";
      }
      fapi2() {
        return this.constructor.name === "FAPI2Client";
      }
      async validateJARM(e) {
        let t = this.authorization_signed_response_alg;
        let {
          payload: n
        } = await this.validateJWT(e, t, ["iss", "exp", "aud"]);
        return S2e(n);
      }
      async dpopProof(e, t, n) {
        if (!T2e(e)) {
          throw TypeError("payload must be a plain object");
        }
        let r;
        if (zKc(t)) {
          r = t;
        } else if (t[Symbol.toStringTag] === "CryptoKey") {
          r = t;
        } else if (t6.gzc === "node:crypto") {
          r = Sos.createPrivateKey(t);
        } else {
          throw TypeError("unrecognized crypto runtime");
        }
        if (r.type !== "private") {
          throw TypeError('"DPoP" option must be a private key');
        }
        let o = Mos.call(this, r, t);
        if (!o) {
          throw TypeError("could not determine DPoP JWS Algorithm");
        }
        return new t6.SignJWT({
          ath: n ? cSr.HS(Sos.createHash("sha256").update(n).digest()) : undefined,
          ...e
        }).setProtectedHeader({
          alg: o,
          typ: "dpop+jwt",
          jwk: await u9f(r, t)
        }).setIssuedAt().setJti(BKc()).sign(r);
      }
    }
    function VKc(e) {
      switch (e.algorithm.name) {
        case "Ed25519":
        case "Ed448":
          return "EdDSA";
        case "ECDSA":
          {
            switch (e.algorithm.namedCurve) {
              case "P-256":
                return "ES256";
              case "P-384":
                return "ES384";
              case "P-521":
                return "ES512";
              default:
                break;
            }
            break;
          }
        case "RSASSA-PKCS1-v1_5":
          return `RS${e.algorithm.hash.name.slice(4)}`;
        case "RSA-PSS":
          return `PS${e.algorithm.hash.name.slice(4)}`;
        default:
          throw TypeError("unsupported DPoP private key");
      }
    }
    var Mos;
    if (t6.gzc === "node:crypto") {
      let t = function (a, l, c) {
        if (typeof l === "object" && l.format === "jwk" && l.key && l.key.alg) {
          return l.key.alg;
        }
        if (Array.isArray(c)) {
          let u = c.filter(RegExp.prototype.test.bind(e));
          if (a.asymmetricKeyType === "rsa-pss") {
            u = u.filter(d => d.startsWith("PS"));
          }
          return ["PS256", "PS384", "PS512", "RS256", "RS384", "RS384"].find(d => u.includes(d));
        }
        return "PS256";
      };
      let i = function (a, l) {
        switch (typeof l === "object" && typeof l.key === "object" && l.key.crv) {
          case "P-256":
            return "ES256";
          case "secp256k1":
            return "ES256K";
          case "P-384":
            return "ES384";
          case "P-512":
            return "ES512";
          default:
            break;
        }
        let c = a.export({
          format: "der",
          type: "pkcs8"
        });
        let u = c[1] < 128 ? 17 : 18;
        let d = c[u];
        let p = c.slice(u + 1, u + 1 + d);
        if (p.equals(n)) {
          return "ES256";
        }
        if (p.equals(r)) {
          return "ES384";
        }
        if (p.equals(o)) {
          return "ES512";
        }
        if (p.equals(s)) {
          return "ES256K";
        }
        throw TypeError("unsupported DPoP private key curve");
      };
      d9f = t;
      p9f = i;
      Mos = function (a, l) {
        if (l[Symbol.toStringTag] === "CryptoKey") {
          return VKc(a);
        }
        switch (a.asymmetricKeyType) {
          case "ed25519":
          case "ed448":
            return "EdDSA";
          case "ec":
            return i(a, l);
          case "rsa":
          case s9f && "rsa-pss":
            return t(a, l, this.issuer.dpop_signing_alg_values_supported);
          default:
            throw TypeError("unsupported DPoP private key");
        }
      };
      let e = /^(?:RS|PS)(?:256|384|512)$/;
      let n = Buffer.from([42, 134, 72, 206, 61, 3, 1, 7]);
      let r = Buffer.from([43, 129, 4, 0, 34]);
      let o = Buffer.from([43, 129, 4, 0, 35]);
      let s = Buffer.from([43, 129, 4, 0, 10]);
    } else {
      Mos = VKc;
    }
    var d9f;
    var p9f;
    var Ios = new WeakMap();
    async function u9f(e, t) {
      if (t6.gzc === "node:crypto" && typeof t === "object" && typeof t.key === "object" && t.format === "jwk") {
        return Dos(t.key, "kty", "crv", "x", "y", "e", "n");
      }
      if (Ios.vZc(t)) {
        return Ios.get(t);
      }
      let n = Dos(await t6.exportJWK(e), "kty", "crv", "x", "y", "e", "n");
      if (zKc(t) || t6.gzc === "WebCryptoAPI") {
        Ios.set(t, n);
      }
      return n;
    }
    Los.exports = (e, t = false) => class extends Nos {
      constructor(...r) {
        super(e, t, ...r);
      }
      static get issuer() {
        return e;
      }
    };
    Los.exports.BaseClient = Nos;
  });
  var YKc = __commonJS((ifw, KKc) => {
    var m9f = rSr();
    KKc.exports = new m9f({
      max: 100
    });
  });
  var XKc = __commonJS((afw, JKc) => {
    function h9f(e) {
      if (e.includes("://")) {
        return true;
      }
      let t = e.replace(/(\/|\?)/g, "#").split("#")[0];
      if (t.includes(":")) {
        let n = t.indexOf(":");
        let r = t.slice(n + 1);
        if (!(/^\d+$/).test(r)) {
          return true;
        }
      }
      return false;
    }
    function g9f(e) {
      if (!e.includes("@")) {
        return false;
      }
      let t = e.split("@");
      let n = t[t.length - 1];
      return !(n.includes(":") || n.includes("/") || n.includes("?"));
    }
    function y9f(e) {
      if (typeof e !== "string") {
        throw TypeError("input must be a string");
      }
      let t;
      if (h9f(e)) {
        t = e;
      } else if (g9f(e)) {
        t = `acct:${e}`;
      } else {
        t = `https://${e}`;
      }
      return t.split("#")[0];
    }
    JKc.exports = y9f;
  });
  var n7c = __commonJS((lfw, t7c) => {
    var {
      inspect: QKc
    } = require("util");
    var $os = require("url");
    var {
      RPError: Uos
    } = Whe();
    var _9f = Fos();
    var dSr = YKc();
    var ZKc = eSr();
    var b9f = XKc();
    var e7c = Tkt();
    var S9f = tin();
    var {
      keystore: T9f
    } = bos();
    var E9f = ["https://login.microsoftonline.com/common/.well-known/openid-configuration", "https://login.microsoftonline.com/common/v2.0/.well-known/openid-configuration", "https://login.microsoftonline.com/organizations/v2.0/.well-known/openid-configuration", "https://login.microsoftonline.com/consumers/v2.0/.well-known/openid-configuration"];
    var Bos = Symbol();
    var v9f = {
      claim_types_supported: ["normal"],
      claims_parameter_supported: false,
      grant_types_supported: ["authorization_code", "implicit"],
      request_parameter_supported: false,
      request_uri_parameter_supported: true,
      require_request_uri_registration: false,
      response_modes_supported: ["query", "fragment"],
      token_endpoint_auth_methods_supported: ["client_secret_basic"]
    };
    class Hos {
      #e;
      constructor(e = {}) {
        let t = e[Bos];
        delete e[Bos];
        ["introspection", "revocation"].forEach(r => {
          if (e[`${r}_endpoint`] && e[`${r}_endpoint_auth_methods_supported`] === undefined && e[`${r}_endpoint_auth_signing_alg_values_supported`] === undefined) {
            if (e.token_endpoint_auth_methods_supported) {
              e[`${r}_endpoint_auth_methods_supported`] = e.token_endpoint_auth_methods_supported;
            }
            if (e.token_endpoint_auth_signing_alg_values_supported) {
              e[`${r}_endpoint_auth_signing_alg_values_supported`] = e.token_endpoint_auth_signing_alg_values_supported;
            }
          }
        });
        this.#e = new Map();
        Object.entries(e).forEach(([r, o]) => {
          if (this.#e.set(r, o), !this[r]) {
            Object.defineProperty(this, r, {
              get() {
                return this.#e.get(r);
              },
              enumerable: true
            });
          }
        });
        dSr.set(this.issuer, this);
        let n = _9f(this, t);
        Object.defineProperties(this, {
          Client: {
            value: n,
            enumerable: true
          },
          FAPI1Client: {
            value: class extends n {},
            enumerable: true
          },
          FAPI2Client: {
            value: class extends n {},
            enumerable: true
          }
        });
      }
      get metadata() {
        return S9f(Object.fromEntries(this.#e.entries()));
      }
      static async webfinger(e) {
        let t = b9f(e);
        let {
          host: n
        } = $os.parse(t);
        let r = `https://${n}/.well-known/webfinger`;
        let o = await e7c.call(this, {
          method: "GET",
          url: r,
          responseType: "json",
          searchParams: {
            resource: t,
            rel: "http://openid.net/specs/connect/1.0/issuer"
          },
          headers: {
            Accept: "application/json"
          }
        });
        let s = ZKc(o);
        let i = Array.isArray(s.links) && s.links.find(c => typeof c === "object" && c.rel === "http://openid.net/specs/connect/1.0/issuer" && c.href);
        if (!i) {
          throw new Uos({
            message: "no issuer found in webfinger response",
            body: s
          });
        }
        if (typeof i.href !== "string" || !i.href.startsWith("https://")) {
          throw new Uos({
            printf: ["invalid issuer location %s", i.href],
            body: s
          });
        }
        let a = i.href;
        if (dSr.vZc(a)) {
          return dSr.get(a);
        }
        let l = await this.discover(a);
        if (l.issuer !== a) {
          throw dSr.del(l.issuer), new Uos("discovered issuer mismatch, expected %s, got: %s", a, l.issuer);
        }
        return l;
      }
      static async discover(e) {
        let t = w9f(e);
        let n = await e7c.call(this, {
          method: "GET",
          responseType: "json",
          url: t,
          headers: {
            Accept: "application/json"
          }
        });
        let r = ZKc(n);
        return new Hos({
          ...v9f,
          ...r,
          [Bos]: !!E9f.find(o => t.startsWith(o))
        });
      }
      async reloadJwksUri() {
        await T9f.call(this, true);
      }
      [QKc.custom]() {
        return `${this.constructor.name} ${QKc(this.metadata, {
          depth: 1 / 0,
          colors: process.stdout.isTTY,
          compact: false,
          sorted: true
        })}`;
      }
    }
    function w9f(e) {
      let t = $os.parse(e);
      if (t.pathname.includes("/.well-known/")) {
        return e;
      } else {
        let n;
        if (t.pathname.endsWith("/")) {
          n = `${t.pathname}.well-known/openid-configuration`;
        } else {
          n = `${t.pathname}/.well-known/openid-configuration`;
        }
        return $os.format({
          ...t,
          pathname: n
        });
      }
    }
    t7c.exports = Hos;
  });
  var l7c = __commonJS((cfw, a7c) => {
    var r7c = require("url");
    var {
      format: C9f
    } = require("util");
    var o7c = tin();
    var {
      RPError: s7c,
      OPError: R9f
    } = Whe();
    var {
      BaseClient: x9f
    } = Fos();
    var {
      random: jos,
      codeChallenge: k9f
    } = Qsn();
    var A9f = Qbr();
    var {
      resolveResponseType: I9f,
      resolveRedirectUri: P9f
    } = fos();
    function O9f(e, t, n = {}) {
      if (e) {
        this.error(e);
      } else if (!t) {
        this.fail(n);
      } else {
        this.success(t, n);
      }
    }
    function i7c({
      client: e,
      params: t = {},
      passReqToCallback: n = false,
      sessionKey: r,
      usePKCE: o = true,
      extras: s = {}
    } = {}, i) {
      if (!(e instanceof x9f)) {
        throw TypeError("client must be an instance of openid-client Client");
      }
      if (typeof i !== "function") {
        throw TypeError("verify callback must be a function");
      }
      if (!e.issuer || !e.issuer.issuer) {
        throw TypeError("client must have an issuer with an identifier");
      }
      if (this._client = e, this._issuer = e.issuer, this._verify = i, this._passReqToCallback = n, this._usePKCE = o, this._key = r || `oidc:${r7c.parse(this._issuer.issuer).hostname}`, this._params = o7c(t), delete this._params.state, delete this._params.nonce, this._extras = o7c(s), !this._params.response_type) {
        this._params.response_type = I9f.call(e);
      }
      if (!this._params.redirect_uri) {
        this._params.redirect_uri = P9f.call(e);
      }
      if (!this._params.scope) {
        this._params.scope = "openid";
      }
      if (this._usePKCE === true) {
        let a = Array.isArray(this._issuer.code_challenge_methods_supported) ? this._issuer.code_challenge_methods_supported : false;
        if (a && a.includes("S256")) {
          this._usePKCE = "S256";
        } else if (a && a.includes("plain")) {
          this._usePKCE = "plain";
        } else if (a) {
          throw TypeError("neither code_challenge_method supported by the client is supported by the issuer");
        } else {
          this._usePKCE = "S256";
        }
      } else if (typeof this._usePKCE === "string" && !["plain", "S256"].includes(this._usePKCE)) {
        throw TypeError(`${this._usePKCE} is not valid/implemented PKCE code_challenge_method`);
      }
      this.name = r7c.parse(e.issuer.issuer).hostname;
    }
    i7c.prototype.authenticate = function (t, n) {
      (async () => {
        let r = this._client;
        if (!t.session) {
          throw TypeError("authentication requires session support");
        }
        let o = r.callbackParams(t);
        let s = this._key;
        let {
          0: i,
          length: a
        } = Object.keys(o);
        if (a === 0 || a === 1 && i === "iss") {
          let S = {
            state: jos(),
            ...this._params,
            ...n
          };
          if (!S.nonce && S.response_type.includes("id_token")) {
            S.nonce = jos();
          }
          if (t.session[s] = A9f(S, "nonce", "state", "max_age", "response_type"), this._usePKCE && S.response_type.includes("code")) {
            let E = jos();
            switch (t.session[s].code_verifier = E, this._usePKCE) {
              case "S256":
                S.code_challenge = k9f(E);
                S.code_challenge_method = "S256";
                break;
              case "plain":
                S.code_challenge = E;
                break;
            }
          }
          this.redirect(r.authorizationUrl(S));
          return;
        }
        let l = t.session[s];
        if (Object.keys(l || {}).length === 0) {
          throw Error(C9f('did not find expected authorization request details in session, req.session["%s"] is %j', s, l));
        }
        let {
          state: c,
          nonce: u,
          max_age: d,
          code_verifier: p,
          response_type: m
        } = l;
        try {
          delete t.session[s];
        } catch (S) {}
        let f = {
          redirect_uri: this._params.redirect_uri,
          ...n
        };
        let h = {
          state: c,
          nonce: u,
          max_age: d,
          code_verifier: p,
          response_type: m
        };
        let g = await r.callback(f.redirect_uri, o, h, this._extras);
        let y = this._passReqToCallback;
        let _ = this._verify.length > (y ? 3 : 2) && r.issuer.userinfo_endpoint;
        let b = [g, O9f.bind(this)];
        if (_) {
          if (!g.access_token) {
            throw new s7c({
              message: "expected access_token to be returned when asking for userinfo in verify callback",
              tokenset: g
            });
          }
          let S = await r.userinfo(g);
          b.splice(1, 0, S);
        }
        if (y) {
          b.unshift(t);
        }
        this._verify(...b);
      })().catch(r => {
        if (r instanceof R9f && r.error !== "server_error" && !r.error.startsWith("invalid") || r instanceof s7c) {
          this.fail(r);
        } else {
          this.error(r);
        }
      });
    };
    a7c.exports = i7c;
  });
  var u7c = __commonJS((ufw, c7c) => {
    var D9f = n7c();
    var {
      OPError: M9f,
      RPError: N9f
    } = Whe();
    var L9f = l7c();
    var F9f = oos();
    var {
      CLOCK_TOLERANCE: U9f,
      HTTP_OPTIONS: B9f
    } = oSr();
    var $9f = Qsn();
    var {
      setDefaults: H9f
    } = Tkt();
    c7c.exports = {
      Issuer: D9f,
      Strategy: L9f,
      TokenSet: F9f,
      errors: {
        OPError: M9f,
        RPError: N9f
      },
      custom: {
        setHttpOptionsDefaults: H9f,
        http_options: B9f,
        clock_tolerance: U9f
      },
      generators: $9f
    };
  });