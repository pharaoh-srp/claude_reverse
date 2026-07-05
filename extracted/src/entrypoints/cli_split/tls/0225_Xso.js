  var Xso = __commonJS((_Iy, Jso) => {
    var vOe = wf();
    g_();
    fqt();
    lX();
    (function () {
      if (vOe.prime) {
        Jso.exports = vOe.prime;
        return;
      }
      var e = Jso.exports = vOe.prime = vOe.prime || {};
      var t = vOe.jsbn.BigInteger;
      var n = [6, 4, 2, 4, 2, 4, 6, 2];
      var r = new t(null);
      r.fromInt(30);
      var o = function (d, p) {
        return d | p;
      };
      e.generateProbablePrime = function (d, p, m) {
        if (typeof p === "function") {
          m = p;
          p = {};
        }
        p = p || {};
        var f = p.algorithm || "PRIMEINC";
        if (typeof f === "string") {
          f = {
            name: f
          };
        }
        f.options = f.options || {};
        var h = p.prng || vOe.random;
        var g = {
          nextBytes: function (y) {
            var _ = h.getBytesSync(y.length);
            for (var b = 0; b < y.length; ++b) {
              y[b] = _.charCodeAt(b);
            }
          }
        };
        if (f.name === "PRIMEINC") {
          return s(d, g, f.options, m);
        }
        throw Error("Invalid prime generation algorithm: " + f.name);
      };
      function s(d, p, m, f) {
        if ("workers" in m) {
          return l(d, p, m, f);
        }
        return i(d, p, m, f);
      }
      function i(d, p, m, f) {
        var h = c(d, p);
        var g = 0;
        var y = u(h.bitLength());
        if ("millerRabinTests" in m) {
          y = m.millerRabinTests;
        }
        var _ = 10;
        if ("maxBlockTime" in m) {
          _ = m.maxBlockTime;
        }
        a(h, d, p, g, y, _, f);
      }
      function a(d, p, m, f, h, g, y) {
        var _ = +new Date();
        do {
          if (d.bitLength() > p) {
            d = c(p, m);
          }
          if (d.isProbablePrime(h)) {
            return y(null, d);
          }
          d.dAddOffset(n[f++ % 8], 0);
        } while (g < 0 || +new Date() - _ < g);
        vOe.util.setImmediate(function () {
          a(d, p, m, f, h, g, y);
        });
      }
      function l(d, p, m, f) {
        if (typeof Worker > "u") {
          return i(d, p, m, f);
        }
        var h = c(d, p);
        var g = m.workers;
        var y = m.workLoad || 100;
        var _ = y * 30 / 8;
        var b = m.workerScript || "forge/prime.worker.js";
        if (g === -1) {
          return vOe.util.estimateCores(function (E, C) {
            if (E) {
              C = 2;
            }
            g = C - 1;
            S();
          });
        }
        S();
        function S() {
          g = Math.max(1, g);
          var E = [];
          for (var C = 0; C < g; ++C) {
            E[C] = new Worker(b);
          }
          var x = g;
          for (var C = 0; C < g; ++C) {
            E[C].addEventListener("message", k);
          }
          var A = false;
          function k(I) {
            if (A) {
              return;
            }
            --x;
            var O = I.data;
            if (O.found) {
              for (var M = 0; M < E.length; ++M) {
                E[M].terminate();
              }
              A = true;
              return f(null, new t(O.prime, 16));
            }
            if (h.bitLength() > d) {
              h = c(d, p);
            }
            var L = h.toString(16);
            I.target.postMessage({
              hex: L,
              workLoad: y
            });
            h.dAddOffset(_, 0);
          }
        }
      }
      function c(d, p) {
        var m = new t(d, p);
        var f = d - 1;
        if (!m.testBit(f)) {
          m.bitwiseTo(t.ONE.shiftLeft(f), o, m);
        }
        m.dAddOffset(31 - m.mod(r).byteValue(), 0);
        return m;
      }
      function u(d) {
        if (d <= 100) {
          return 27;
        }
        if (d <= 150) {
          return 18;
        }
        if (d <= 200) {
          return 15;
        }
        if (d <= 250) {
          return 12;
        }
        if (d <= 300) {
          return 9;
        }
        if (d <= 350) {
          return 8;
        }
        if (d <= 400) {
          return 7;
        }
        if (d <= 500) {
          return 6;
        }
        if (d <= 600) {
          return 5;
        }
        if (d <= 800) {
          return 4;
        }
        if (d <= 1250) {
          return 3;
        }
        return 2;
      }
    })();
  });
  var hqt = __commonJS((bIy, Dna) => {
    var ed = wf();
    jre();
    fqt();
    TOe();
    Yso();
    Xso();
    lX();
    g_();
    if (typeof Qg > "u") {
      Qg = ed.jsbn.BigInteger;
    }
    var Qg;
    var Qso = ed.util.isNodejs ? require("crypto") : null;
    var lo = ed.asn1;
    var uX = ed.util;
    ed.pki = ed.pki || {};
    Dna.exports = ed.pki.rsa = ed.rsa = ed.rsa || {};
    var Rm = ed.pki;
    var slp = [6, 4, 2, 4, 2, 4, 6, 2];
    var ilp = {
      name: "PrivateKeyInfo",
      tagClass: lo.Class.UNIVERSAL,
      type: lo.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "PrivateKeyInfo.version",
        tagClass: lo.Class.UNIVERSAL,
        type: lo.Type.INTEGER,
        constructed: false,
        capture: "privateKeyVersion"
      }, {
        name: "PrivateKeyInfo.privateKeyAlgorithm",
        tagClass: lo.Class.UNIVERSAL,
        type: lo.Type.SEQUENCE,
        constructed: true,
        value: [{
          name: "AlgorithmIdentifier.algorithm",
          tagClass: lo.Class.UNIVERSAL,
          type: lo.Type.OID,
          constructed: false,
          capture: "privateKeyOid"
        }]
      }, {
        name: "PrivateKeyInfo",
        tagClass: lo.Class.UNIVERSAL,
        type: lo.Type.OCTETSTRING,
        constructed: false,
        capture: "privateKey"
      }]
    };
    var alp = {
      name: "RSAPrivateKey",
      tagClass: lo.Class.UNIVERSAL,
      type: lo.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "RSAPrivateKey.version",
        tagClass: lo.Class.UNIVERSAL,
        type: lo.Type.INTEGER,
        constructed: false,
        capture: "privateKeyVersion"
      }, {
        name: "RSAPrivateKey.modulus",
        tagClass: lo.Class.UNIVERSAL,
        type: lo.Type.INTEGER,
        constructed: false,
        capture: "privateKeyModulus"
      }, {
        name: "RSAPrivateKey.publicExponent",
        tagClass: lo.Class.UNIVERSAL,
        type: lo.Type.INTEGER,
        constructed: false,
        capture: "privateKeyPublicExponent"
      }, {
        name: "RSAPrivateKey.privateExponent",
        tagClass: lo.Class.UNIVERSAL,
        type: lo.Type.INTEGER,
        constructed: false,
        capture: "privateKeyPrivateExponent"
      }, {
        name: "RSAPrivateKey.prime1",
        tagClass: lo.Class.UNIVERSAL,
        type: lo.Type.INTEGER,
        constructed: false,
        capture: "privateKeyPrime1"
      }, {
        name: "RSAPrivateKey.prime2",
        tagClass: lo.Class.UNIVERSAL,
        type: lo.Type.INTEGER,
        constructed: false,
        capture: "privateKeyPrime2"
      }, {
        name: "RSAPrivateKey.exponent1",
        tagClass: lo.Class.UNIVERSAL,
        type: lo.Type.INTEGER,
        constructed: false,
        capture: "privateKeyExponent1"
      }, {
        name: "RSAPrivateKey.exponent2",
        tagClass: lo.Class.UNIVERSAL,
        type: lo.Type.INTEGER,
        constructed: false,
        capture: "privateKeyExponent2"
      }, {
        name: "RSAPrivateKey.coefficient",
        tagClass: lo.Class.UNIVERSAL,
        type: lo.Type.INTEGER,
        constructed: false,
        capture: "privateKeyCoefficient"
      }]
    };
    var llp = {
      name: "RSAPublicKey",
      tagClass: lo.Class.UNIVERSAL,
      type: lo.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "RSAPublicKey.modulus",
        tagClass: lo.Class.UNIVERSAL,
        type: lo.Type.INTEGER,
        constructed: false,
        capture: "publicKeyModulus"
      }, {
        name: "RSAPublicKey.exponent",
        tagClass: lo.Class.UNIVERSAL,
        type: lo.Type.INTEGER,
        constructed: false,
        capture: "publicKeyExponent"
      }]
    };
    var clp = ed.pki.rsa.publicKeyValidator = {
      name: "SubjectPublicKeyInfo",
      tagClass: lo.Class.UNIVERSAL,
      type: lo.Type.SEQUENCE,
      constructed: true,
      captureAsn1: "subjectPublicKeyInfo",
      value: [{
        name: "SubjectPublicKeyInfo.AlgorithmIdentifier",
        tagClass: lo.Class.UNIVERSAL,
        type: lo.Type.SEQUENCE,
        constructed: true,
        value: [{
          name: "AlgorithmIdentifier.algorithm",
          tagClass: lo.Class.UNIVERSAL,
          type: lo.Type.OID,
          constructed: false,
          capture: "publicKeyOid"
        }]
      }, {
        name: "SubjectPublicKeyInfo.subjectPublicKey",
        tagClass: lo.Class.UNIVERSAL,
        type: lo.Type.BITSTRING,
        constructed: false,
        value: [{
          name: "SubjectPublicKeyInfo.subjectPublicKey.RSAPublicKey",
          tagClass: lo.Class.UNIVERSAL,
          type: lo.Type.SEQUENCE,
          constructed: true,
          optional: true,
          captureAsn1: "rsaPublicKey"
        }]
      }]
    };
    var ulp = {
      name: "DigestInfo",
      tagClass: lo.Class.UNIVERSAL,
      type: lo.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "DigestInfo.DigestAlgorithm",
        tagClass: lo.Class.UNIVERSAL,
        type: lo.Type.SEQUENCE,
        constructed: true,
        value: [{
          name: "DigestInfo.DigestAlgorithm.algorithmIdentifier",
          tagClass: lo.Class.UNIVERSAL,
          type: lo.Type.OID,
          constructed: false,
          capture: "algorithmIdentifier"
        }, {
          name: "DigestInfo.DigestAlgorithm.parameters",
          tagClass: lo.Class.UNIVERSAL,
          type: lo.Type.NULL,
          capture: "parameters",
          optional: true,
          constructed: false
        }]
      }, {
        name: "DigestInfo.digest",
        tagClass: lo.Class.UNIVERSAL,
        type: lo.Type.OCTETSTRING,
        constructed: false,
        capture: "digest"
      }]
    };
    var dlp = function (e) {
      var t;
      if (e.algorithm in Rm.oids) {
        t = Rm.oids[e.algorithm];
      } else {
        var n = Error("Unknown message digest algorithm.");
        throw n.algorithm = e.algorithm, n;
      }
      var r = lo.oidToDer(t).getBytes();
      var o = lo.create(lo.Class.UNIVERSAL, lo.Type.SEQUENCE, true, []);
      var s = lo.create(lo.Class.UNIVERSAL, lo.Type.SEQUENCE, true, []);
      s.value.push(lo.create(lo.Class.UNIVERSAL, lo.Type.OID, false, r));
      s.value.push(lo.create(lo.Class.UNIVERSAL, lo.Type.NULL, false, ""));
      var i = lo.create(lo.Class.UNIVERSAL, lo.Type.OCTETSTRING, false, e.digest().getBytes());
      o.value.push(s);
      o.value.push(i);
      return lo.toDer(o).getBytes();
    };
    var Pna = function (e, t, n) {
      if (n) {
        return e.modPow(t.e, t.n);
      }
      if (!t.p || !t.q) {
        return e.modPow(t.d, t.n);
      }
      if (!t.dP) {
        t.dP = t.d.mod(t.p.subtract(Qg.ONE));
      }
      if (!t.dQ) {
        t.dQ = t.d.mod(t.q.subtract(Qg.ONE));
      }
      if (!t.qInv) {
        t.qInv = t.q.modInverse(t.p);
      }
      var r;
      do {
        r = new Qg(ed.util.bytesToHex(ed.random.getBytes(t.n.bitLength() / 8)), 16);
      } while (r.compareTo(t.n) >= 0 || !r.gcd(t.n).equals(Qg.ONE));
      e = e.multiply(r.modPow(t.e, t.n)).mod(t.n);
      var o = e.mod(t.p).modPow(t.dP, t.p);
      var s = e.mod(t.q).modPow(t.dQ, t.q);
      while (o.compareTo(s) < 0) {
        o = o.add(t.p);
      }
      var i = o.subtract(s).multiply(t.qInv).mod(t.p).multiply(t.q).add(s);
      i = i.multiply(r.modInverse(t.n)).mod(t.n);
      return i;
    };
    Rm.rsa.encrypt = function (e, t, n) {
      var r = n;
      var o;
      var s = Math.ceil(t.n.bitLength() / 8);
      if (n !== false && n !== true) {
        r = n === 2;
        o = Ona(e, t, n);
      } else {
        o = ed.util.createBuffer();
        o.putBytes(e);
      }
      var i = new Qg(o.toHex(), 16);
      var a = Pna(i, t, r);
      var l = a.toString(16);
      var c = ed.util.createBuffer();
      var u = s - Math.ceil(l.length / 2);
      while (u > 0) {
        c.putByte(0);
        --u;
      }
      c.putBytes(ed.util.hexToBytes(l));
      return c.getBytes();
    };
    Rm.rsa.decrypt = function (e, t, n, r) {
      var o = Math.ceil(t.n.bitLength() / 8);
      if (e.length !== o) {
        var s = Error("Encrypted message length is invalid.");
        throw s.length = e.length, s.expected = o, s;
      }
      var i = new Qg(ed.util.createBuffer(e).toHex(), 16);
      if (i.compareTo(t.n) >= 0) {
        throw Error("Encrypted message is invalid.");
      }
      var a = Pna(i, t, n);
      var l = a.toString(16);
      var c = ed.util.createBuffer();
      var u = o - Math.ceil(l.length / 2);
      while (u > 0) {
        c.putByte(0);
        --u;
      }
      if (c.putBytes(ed.util.hexToBytes(l)), r !== false) {
        return tUn(c.getBytes(), t, n);
      }
      return c.getBytes();
    };
    Rm.rsa.createKeyPairGenerationState = function (e, t, n) {
      if (typeof e === "string") {
        e = parseInt(e, 10);
      }
      e = e || 2048;
      n = n || {};
      var r = n.prng || ed.random;
      var o = {
        nextBytes: function (a) {
          var l = r.getBytesSync(a.length);
          for (var c = 0; c < a.length; ++c) {
            a[c] = l.charCodeAt(c);
          }
        }
      };
      var s = n.algorithm || "PRIMEINC";
      var i;
      if (s === "PRIMEINC") {
        i = {
          algorithm: s,
          state: 0,
          bits: e,
          rng: o,
          eInt: t || 65537,
          e: new Qg(null),
          p: null,
          q: null,
          qBits: e >> 1,
          pBits: e - (e >> 1),
          pqState: 0,
          num: null,
          keys: null
        };
        i.e.fromInt(i.eInt);
      } else {
        throw Error("Invalid key generation algorithm: " + s);
      }
      return i;
    };
    Rm.rsa.stepKeyPairGenerationState = function (e, t) {
      if (!("algorithm" in e)) {
        e.algorithm = "PRIMEINC";
      }
      var n = new Qg(null);
      n.fromInt(30);
      var r = 0;
      var o = function (d, p) {
        return d | p;
      };
      var s = +new Date();
      var i;
      var a = 0;
      while (e.keys === null && (t <= 0 || a < t)) {
        if (e.state === 0) {
          var l = e.p === null ? e.pBits : e.qBits;
          var c = l - 1;
          if (e.pqState === 0) {
            if (e.num = new Qg(l, e.rng), !e.num.testBit(c)) {
              e.num.bitwiseTo(Qg.ONE.shiftLeft(c), o, e.num);
            }
            e.num.dAddOffset(31 - e.num.mod(n).byteValue(), 0);
            r = 0;
            ++e.pqState;
          } else if (e.pqState === 1) {
            if (e.num.bitLength() > l) {
              e.pqState = 0;
            } else if (e.num.isProbablePrime(mlp(e.num.bitLength()))) {
              ++e.pqState;
            } else {
              e.num.dAddOffset(slp[r++ % 8], 0);
            }
          } else if (e.pqState === 2) {
            e.pqState = e.num.subtract(Qg.ONE).gcd(e.e).compareTo(Qg.ONE) === 0 ? 3 : 0;
          } else if (e.pqState === 3) {
            if (e.pqState = 0, e.p === null) {
              e.p = e.num;
            } else {
              e.q = e.num;
            }
            if (e.p !== null && e.q !== null) {
              ++e.state;
            }
            e.num = null;
          }
        } else if (e.state === 1) {
          if (e.p.compareTo(e.q) < 0) {
            e.num = e.p;
            e.p = e.q;
            e.q = e.num;
          }
          ++e.state;
        } else if (e.state === 2) {
          e.p1 = e.p.subtract(Qg.ONE);
          e.q1 = e.q.subtract(Qg.ONE);
          e.phi = e.p1.multiply(e.q1);
          ++e.state;
        } else if (e.state === 3) {
          if (e.phi.gcd(e.e).compareTo(Qg.ONE) === 0) {
            ++e.state;
          } else {
            e.p = null;
            e.q = null;
            e.state = 0;
          }
        } else if (e.state === 4) {
          if (e.n = e.p.multiply(e.q), e.n.bitLength() === e.bits) {
            ++e.state;
          } else {
            e.q = null;
            e.state = 0;
          }
        } else if (e.state === 5) {
          var u = e.e.modInverse(e.phi);
          e.keys = {
            privateKey: Rm.rsa.setPrivateKey(e.n, e.e, u, e.p, e.q, u.mod(e.p1), u.mod(e.q1), e.q.modInverse(e.p)),
            publicKey: Rm.rsa.setPublicKey(e.n, e.e)
          };
        }
        i = +new Date();
        a += i - s;
        s = i;
      }
      return e.keys !== null;
    };
    Rm.rsa.generateKeyPair = function (e, t, n, r) {
      if (arguments.length === 1) {
        if (typeof e === "object") {
          n = e;
          e = undefined;
        } else if (typeof e === "function") {
          r = e;
          e = undefined;
        }
      } else if (arguments.length === 2) {
        if (typeof e === "number") {
          if (typeof t === "function") {
            r = t;
            t = undefined;
          } else if (typeof t !== "number") {
            n = t;
            t = undefined;
          }
        } else {
          n = e;
          r = t;
          e = undefined;
          t = undefined;
        }
      } else if (arguments.length === 3) {
        if (typeof t === "number") {
          if (typeof n === "function") {
            r = n;
            n = undefined;
          }
        } else {
          r = n;
          n = t;
          t = undefined;
        }
      }
      if (n = n || {}, e === undefined) {
        e = n.bits || 2048;
      }
      if (t === undefined) {
        t = n.e || 65537;
      }
      if (!ed.options.usePureJavaScript && !n.prng && e >= 256 && e <= 16384 && (t === 65537 || t === 3)) {
        if (r) {
          if (xna("generateKeyPair")) {
            return Qso.generateKeyPair("rsa", {
              modulusLength: e,
              publicExponent: t,
              publicKeyEncoding: {
                type: "spki",
                format: "pem"
              },
              privateKeyEncoding: {
                type: "pkcs8",
                format: "pem"
              }
            }, function (a, l, c) {
              if (a) {
                return r(a);
              }
              r(null, {
                privateKey: Rm.privateKeyFromPem(c),
                publicKey: Rm.publicKeyFromPem(l)
              });
            });
          }
          if (kna("generateKey") && kna("exportKey")) {
            return uX.globalScope.crypto.subtle.generateKey({
              name: "RSASSA-PKCS1-v1_5",
              modulusLength: e,
              publicExponent: Ina(t),
              hash: {
                name: "SHA-256"
              }
            }, true, ["sign", "verify"]).then(function (a) {
              return uX.globalScope.crypto.subtle.exportKey("pkcs8", a.privateKey);
            }).then(undefined, function (a) {
              r(a);
            }).then(function (a) {
              if (a) {
                var l = Rm.privateKeyFromAsn1(lo.fromDer(ed.util.createBuffer(a)));
                r(null, {
                  privateKey: l,
                  publicKey: Rm.setRsaPublicKey(l.n, l.e)
                });
              }
            });
          }
          if (Ana("generateKey") && Ana("exportKey")) {
            var o = uX.globalScope.msCrypto.subtle.generateKey({
              name: "RSASSA-PKCS1-v1_5",
              modulusLength: e,
              publicExponent: Ina(t),
              hash: {
                name: "SHA-256"
              }
            }, true, ["sign", "verify"]);
            o.oncomplete = function (a) {
              var l = a.target.result;
              var c = uX.globalScope.msCrypto.subtle.exportKey("pkcs8", l.privateKey);
              c.oncomplete = function (u) {
                var d = u.target.result;
                var p = Rm.privateKeyFromAsn1(lo.fromDer(ed.util.createBuffer(d)));
                r(null, {
                  privateKey: p,
                  publicKey: Rm.setRsaPublicKey(p.n, p.e)
                });
              };
              c.onerror = function (u) {
                r(u);
              };
            };
            o.onerror = function (a) {
              r(a);
            };
            return;
          }
        } else if (xna("generateKeyPairSync")) {
          var s = Qso.generateKeyPairSync("rsa", {
            modulusLength: e,
            publicExponent: t,
            publicKeyEncoding: {
              type: "spki",
              format: "pem"
            },
            privateKeyEncoding: {
              type: "pkcs8",
              format: "pem"
            }
          });
          return {
            privateKey: Rm.privateKeyFromPem(s.privateKey),
            publicKey: Rm.publicKeyFromPem(s.publicKey)
          };
        }
      }
      var i = Rm.rsa.createKeyPairGenerationState(e, t, n);
      if (!r) {
        Rm.rsa.stepKeyPairGenerationState(i, 0);
        return i.keys;
      }
      plp(i, n, r);
    };
    Rm.setRsaPublicKey = Rm.rsa.setPublicKey = function (e, t) {
      var n = {
        n: e,
        e: t
      };
      n.encrypt = function (r, o, s) {
        if (typeof o === "string") {
          o = o.toUpperCase();
        } else if (o === undefined) {
          o = "RSAES-PKCS1-V1_5";
        }
        if (o === "RSAES-PKCS1-V1_5") {
          o = {
            HS: function (a, l, c) {
              return Ona(a, l, 2).getBytes();
            }
          };
        } else if (o === "RSA-OAEP" || o === "RSAES-OAEP") {
          o = {
            HS: function (a, l) {
              return ed.pkcs1.encode_rsa_oaep(l, a, s);
            }
          };
        } else if (["RAW", "NONE", "NULL", null].indexOf(o) !== -1) {
          o = {
            HS: function (a) {
              return a;
            }
          };
        } else if (typeof o === "string") {
          throw Error('Unsupported encryption scheme: "' + o + '".');
        }
        var i = o.HS(r, n, true);
        return Rm.rsa.encrypt(i, n, true);
      };
      n.verify = function (r, o, s, i) {
        if (typeof s === "string") {
          s = s.toUpperCase();
        } else if (s === undefined) {
          s = "RSASSA-PKCS1-V1_5";
        }
        if (i === undefined) {
          i = {
            _parseAllDigestBytes: true,
            _skipPaddingChecks: false
          };
        }
        if (!("_parseAllDigestBytes" in i)) {
          i._parseAllDigestBytes = true;
        }
        if (!("_skipPaddingChecks" in i)) {
          i._skipPaddingChecks = false;
        }
        if (s === "RSASSA-PKCS1-V1_5") {
          s = {
            verify: function (l, c) {
              c = tUn(c, n, true, undefined, i);
              var u = lo.fromDer(c, {
                parseAllBytes: i._parseAllDigestBytes
              });
              var d = {};
              var p = [];
              if (!lo.validate(u, ulp, d, p) || u.value.length !== 2) {
                var m = Error("ASN.1 object does not contain a valid RSASSA-PKCS1-v1_5 DigestInfo value.");
                throw m.errors = p, m;
              }
              var f = lo.derToOid(d.algorithmIdentifier);
              if (!(f === ed.oids.md2 || f === ed.oids.md5 || f === ed.oids.sha1 || f === ed.oids.sha224 || f === ed.oids.sha256 || f === ed.oids.sha384 || f === ed.oids.sha512 || f === ed.oids["sha512-224"] || f === ed.oids["sha512-256"])) {
                var m = Error("Unknown RSASSA-PKCS1-v1_5 DigestAlgorithm identifier.");
                throw m.oid = f, m;
              }
              if (f === ed.oids.md2 || f === ed.oids.md5) {
                if (!("parameters" in d)) {
                  throw Error("ASN.1 object does not contain a valid RSASSA-PKCS1-v1_5 DigestInfo value. Missing algorithm identifier NULL parameters.");
                }
              }
              return l === d.digest;
            }
          };
        } else if (s === "NONE" || s === "NULL" || s === null) {
          s = {
            verify: function (l, c) {
              c = tUn(c, n, true, undefined, i);
              return l === c;
            }
          };
        }
        var a = Rm.rsa.decrypt(o, n, true, false);
        return s.verify(r, a, n.n.bitLength());
      };
      return n;
    };
    Rm.setRsaPrivateKey = Rm.rsa.setPrivateKey = function (e, t, n, r, o, s, i, a) {
      var l = {
        n: e,
        e: t,
        d: n,
        p: r,
        q: o,
        dP: s,
        dQ: i,
        qInv: a
      };
      l.decrypt = function (c, u, d) {
        if (typeof u === "string") {
          u = u.toUpperCase();
        } else if (u === undefined) {
          u = "RSAES-PKCS1-V1_5";
        }
        var p = Rm.rsa.decrypt(c, l, false, false);
        if (u === "RSAES-PKCS1-V1_5") {
          u = {
            oC: tUn
          };
        } else if (u === "RSA-OAEP" || u === "RSAES-OAEP") {
          u = {
            oC: function (m, f) {
              return ed.pkcs1.decode_rsa_oaep(f, m, d);
            }
          };
        } else if (["RAW", "NONE", "NULL", null].indexOf(u) !== -1) {
          u = {
            oC: function (m) {
              return m;
            }
          };
        } else {
          throw Error('Unsupported encryption scheme: "' + u + '".');
        }
        return u.oC(p, l, false);
      };
      l.sign = function (c, u) {
        var d = false;
        if (typeof u === "string") {
          u = u.toUpperCase();
        }
        if (u === undefined || u === "RSASSA-PKCS1-V1_5") {
          u = {
            HS: dlp
          };
          d = 1;
        } else if (u === "NONE" || u === "NULL" || u === null) {
          u = {
            HS: function () {
              return c;
            }
          };
          d = 1;
        }
        var p = u.HS(c, l.n.bitLength());
        return Rm.rsa.encrypt(p, l, d);
      };
      return l;
    };
    Rm.wrapRsaPrivateKey = function (e) {
      return lo.create(lo.Class.UNIVERSAL, lo.Type.SEQUENCE, true, [lo.create(lo.Class.UNIVERSAL, lo.Type.INTEGER, false, lo.integerToDer(0).getBytes()), lo.create(lo.Class.UNIVERSAL, lo.Type.SEQUENCE, true, [lo.create(lo.Class.UNIVERSAL, lo.Type.OID, false, lo.oidToDer(Rm.oids.rsaEncryption).getBytes()), lo.create(lo.Class.UNIVERSAL, lo.Type.NULL, false, "")]), lo.create(lo.Class.UNIVERSAL, lo.Type.OCTETSTRING, false, lo.toDer(e).getBytes())]);
    };
    Rm.privateKeyFromAsn1 = function (e) {
      var t = {};
      var n = [];
      if (lo.validate(e, ilp, t, n)) {
        e = lo.fromDer(ed.util.createBuffer(t.privateKey));
      }
      if (t = {}, n = [], !lo.validate(e, alp, t, n)) {
        var r = Error("Cannot read private key. ASN.1 object does not contain an RSAPrivateKey.");
        throw r.errors = n, r;
      }
      var o;
      var s;
      var i;
      var a;
      var l;
      var c;
      var u;
      var d;
      o = ed.util.createBuffer(t.privateKeyModulus).toHex();
      s = ed.util.createBuffer(t.privateKeyPublicExponent).toHex();
      i = ed.util.createBuffer(t.privateKeyPrivateExponent).toHex();
      a = ed.util.createBuffer(t.privateKeyPrime1).toHex();
      l = ed.util.createBuffer(t.privateKeyPrime2).toHex();
      c = ed.util.createBuffer(t.privateKeyExponent1).toHex();
      u = ed.util.createBuffer(t.privateKeyExponent2).toHex();
      d = ed.util.createBuffer(t.privateKeyCoefficient).toHex();
      return Rm.setRsaPrivateKey(new Qg(o, 16), new Qg(s, 16), new Qg(i, 16), new Qg(a, 16), new Qg(l, 16), new Qg(c, 16), new Qg(u, 16), new Qg(d, 16));
    };
    Rm.privateKeyToAsn1 = Rm.privateKeyToRSAPrivateKey = function (e) {
      return lo.create(lo.Class.UNIVERSAL, lo.Type.SEQUENCE, true, [lo.create(lo.Class.UNIVERSAL, lo.Type.INTEGER, false, lo.integerToDer(0).getBytes()), lo.create(lo.Class.UNIVERSAL, lo.Type.INTEGER, false, Kue(e.n)), lo.create(lo.Class.UNIVERSAL, lo.Type.INTEGER, false, Kue(e.e)), lo.create(lo.Class.UNIVERSAL, lo.Type.INTEGER, false, Kue(e.d)), lo.create(lo.Class.UNIVERSAL, lo.Type.INTEGER, false, Kue(e.p)), lo.create(lo.Class.UNIVERSAL, lo.Type.INTEGER, false, Kue(e.q)), lo.create(lo.Class.UNIVERSAL, lo.Type.INTEGER, false, Kue(e.dP)), lo.create(lo.Class.UNIVERSAL, lo.Type.INTEGER, false, Kue(e.dQ)), lo.create(lo.Class.UNIVERSAL, lo.Type.INTEGER, false, Kue(e.qInv))]);
    };
    Rm.publicKeyFromAsn1 = function (e) {
      var t = {};
      var n = [];
      if (lo.validate(e, clp, t, n)) {
        var r = lo.derToOid(t.publicKeyOid);
        if (r !== Rm.oids.rsaEncryption) {
          var o = Error("Cannot read public key. Unknown OID.");
          throw o.oid = r, o;
        }
        e = t.rsaPublicKey;
      }
      if (n = [], !lo.validate(e, llp, t, n)) {
        var o = Error("Cannot read public key. ASN.1 object does not contain an RSAPublicKey.");
        throw o.errors = n, o;
      }
      var s = ed.util.createBuffer(t.publicKeyModulus).toHex();
      var i = ed.util.createBuffer(t.publicKeyExponent).toHex();
      return Rm.setRsaPublicKey(new Qg(s, 16), new Qg(i, 16));
    };
    Rm.publicKeyToAsn1 = Rm.publicKeyToSubjectPublicKeyInfo = function (e) {
      return lo.create(lo.Class.UNIVERSAL, lo.Type.SEQUENCE, true, [lo.create(lo.Class.UNIVERSAL, lo.Type.SEQUENCE, true, [lo.create(lo.Class.UNIVERSAL, lo.Type.OID, false, lo.oidToDer(Rm.oids.rsaEncryption).getBytes()), lo.create(lo.Class.UNIVERSAL, lo.Type.NULL, false, "")]), lo.create(lo.Class.UNIVERSAL, lo.Type.BITSTRING, false, [Rm.publicKeyToRSAPublicKey(e)])]);
    };
    Rm.publicKeyToRSAPublicKey = function (e) {
      return lo.create(lo.Class.UNIVERSAL, lo.Type.SEQUENCE, true, [lo.create(lo.Class.UNIVERSAL, lo.Type.INTEGER, false, Kue(e.n)), lo.create(lo.Class.UNIVERSAL, lo.Type.INTEGER, false, Kue(e.e))]);
    };
    function Ona(e, t, n) {
      var r = ed.util.createBuffer();
      var o = Math.ceil(t.n.bitLength() / 8);
      if (e.length > o - 11) {
        var s = Error("Message is too long for PKCS#1 v1.5 padding.");
        throw s.length = e.length, s.max = o - 11, s;
      }
      r.putByte(0);
      r.putByte(n);
      var i = o - 3 - e.length;
      var a;
      if (n === 0 || n === 1) {
        a = n === 0 ? 0 : 255;
        for (var l = 0; l < i; ++l) {
          r.putByte(a);
        }
      } else {
        while (i > 0) {
          var c = 0;
          var u = ed.random.getBytes(i);
          for (var l = 0; l < i; ++l) {
            if (a = u.charCodeAt(l), a === 0) {
              ++c;
            } else {
              r.putByte(a);
            }
          }
          i = c;
        }
      }
      r.putByte(0);
      r.putBytes(e);
      return r;
    }
    function tUn(e, t, n, r, o) {
      var s = Math.ceil(t.n.bitLength() / 8);
      var i = ed.util.createBuffer(e);
      var a = i.getByte();
      var l = i.getByte();
      if (a !== 0 || n && l !== 0 && l !== 1 || !n && l !== 2 || n && l === 0 && typeof r > "u") {
        throw Error("Encryption block is invalid.");
      }
      var c = 0;
      if (l === 0) {
        c = s - 3 - r;
        for (var u = 0; u < c; ++u) {
          if (i.getByte() !== 0) {
            throw Error("Encryption block is invalid.");
          }
        }
      } else if (l === 1) {
        c = 0;
        while (i.length() > 1) {
          if (i.getByte() !== 255) {
            --i.read;
            break;
          }
          ++c;
        }
        if (c < 8 && !(o ? o._skipPaddingChecks : false)) {
          throw Error("Encryption block is invalid.");
        }
      } else if (l === 2) {
        c = 0;
        while (i.length() > 1) {
          if (i.getByte() === 0) {
            --i.read;
            break;
          }
          ++c;
        }
        if (c < 8 && !(o ? o._skipPaddingChecks : false)) {
          throw Error("Encryption block is invalid.");
        }
      }
      var d = i.getByte();
      if (d !== 0 || c !== s - 3 - i.length()) {
        throw Error("Encryption block is invalid.");
      }
      return i.getBytes();
    }
    function plp(e, t, n) {
      if (typeof t === "function") {
        n = t;
        t = {};
      }
      t = t || {};
      var r = {
        algorithm: {
          name: t.algorithm || "PRIMEINC",
          options: {
            workers: t.workers || 2,
            workLoad: t.workLoad || 100,
            workerScript: t.workerScript
          }
        }
      };
      if ("prng" in t) {
        r.prng = t.prng;
      }
      o();
      function o() {
        s(e.pBits, function (a, l) {
          if (a) {
            return n(a);
          }
          if (e.p = l, e.q !== null) {
            return i(a, e.q);
          }
          s(e.qBits, i);
        });
      }
      function s(a, l) {
        ed.prime.generateProbablePrime(a, r, l);
      }
      function i(a, l) {
        if (a) {
          return n(a);
        }
        if (e.q = l, e.p.compareTo(e.q) < 0) {
          var c = e.p;
          e.p = e.q;
          e.q = c;
        }
        if (e.p.subtract(Qg.ONE).gcd(e.e).compareTo(Qg.ONE) !== 0) {
          e.p = null;
          o();
          return;
        }
        if (e.q.subtract(Qg.ONE).gcd(e.e).compareTo(Qg.ONE) !== 0) {
          e.q = null;
          s(e.qBits, i);
          return;
        }
        if (e.p1 = e.p.subtract(Qg.ONE), e.q1 = e.q.subtract(Qg.ONE), e.phi = e.p1.multiply(e.q1), e.phi.gcd(e.e).compareTo(Qg.ONE) !== 0) {
          e.p = e.q = null;
          o();
          return;
        }
        if (e.n = e.p.multiply(e.q), e.n.bitLength() !== e.bits) {
          e.q = null;
          s(e.qBits, i);
          return;
        }
        var u = e.e.modInverse(e.phi);
        e.keys = {
          privateKey: Rm.rsa.setPrivateKey(e.n, e.e, u, e.p, e.q, u.mod(e.p1), u.mod(e.q1), e.q.modInverse(e.p)),
          publicKey: Rm.rsa.setPublicKey(e.n, e.e)
        };
        n(null, e.keys);
      }
    }
    function Kue(e) {
      var t = e.toString(16);
      if (t[0] >= "8") {
        t = "00" + t;
      }
      var n = ed.util.hexToBytes(t);
      if (n.length > 1 && (n.charCodeAt(0) === 0 && (n.charCodeAt(1) & 128) === 0 || n.charCodeAt(0) === 255 && (n.charCodeAt(1) & 128) === 128)) {
        return n.substr(1);
      }
      return n;
    }
    function mlp(e) {
      if (e <= 100) {
        return 27;
      }
      if (e <= 150) {
        return 18;
      }
      if (e <= 200) {
        return 15;
      }
      if (e <= 250) {
        return 12;
      }
      if (e <= 300) {
        return 9;
      }
      if (e <= 350) {
        return 8;
      }
      if (e <= 400) {
        return 7;
      }
      if (e <= 500) {
        return 6;
      }
      if (e <= 600) {
        return 5;
      }
      if (e <= 800) {
        return 4;
      }
      if (e <= 1250) {
        return 3;
      }
      return 2;
    }
    function xna(e) {
      return ed.util.isNodejs && typeof Qso[e] === "function";
    }
    function kna(e) {
      return typeof uX.globalScope < "u" && typeof uX.globalScope.crypto === "object" && typeof uX.globalScope.crypto.subtle === "object" && typeof uX.globalScope.crypto.subtle[e] === "function";
    }
    function Ana(e) {
      return typeof uX.globalScope < "u" && typeof uX.globalScope.msCrypto === "object" && typeof uX.globalScope.msCrypto.subtle === "object" && typeof uX.globalScope.msCrypto.subtle[e] === "function";
    }
    function Ina(e) {
      var t = ed.util.hexToBytes(e.toString(16));
      var n = new Uint8Array(t.length);
      for (var r = 0; r < t.length; ++r) {
        n[r] = t.charCodeAt(r);
      }
      return n;
    }
  });
  var eio = __commonJS((SIy, Fna) => {
    var Rl = wf();
    SOe();
    jre();
    pqt();
    Hue();
    TOe();
    JFn();
    LGe();
    lX();
    Wso();
    hqt();
    g_();
    if (typeof Zso > "u") {
      Zso = Rl.jsbn.BigInteger;
    }
    var Zso;
    var Zo = Rl.asn1;
    var cf = Rl.pki = Rl.pki || {};
    Fna.exports = cf.pbe = Rl.pbe = Rl.pbe || {};
    var BGe = cf.oids;
    var flp = {
      name: "EncryptedPrivateKeyInfo",
      tagClass: Zo.Class.UNIVERSAL,
      type: Zo.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "EncryptedPrivateKeyInfo.encryptionAlgorithm",
        tagClass: Zo.Class.UNIVERSAL,
        type: Zo.Type.SEQUENCE,
        constructed: true,
        value: [{
          name: "AlgorithmIdentifier.algorithm",
          tagClass: Zo.Class.UNIVERSAL,
          type: Zo.Type.OID,
          constructed: false,
          capture: "encryptionOid"
        }, {
          name: "AlgorithmIdentifier.parameters",
          tagClass: Zo.Class.UNIVERSAL,
          type: Zo.Type.SEQUENCE,
          constructed: true,
          captureAsn1: "encryptionParams"
        }]
      }, {
        name: "EncryptedPrivateKeyInfo.encryptedData",
        tagClass: Zo.Class.UNIVERSAL,
        type: Zo.Type.OCTETSTRING,
        constructed: false,
        capture: "encryptedData"
      }]
    };
    var hlp = {
      name: "PBES2Algorithms",
      tagClass: Zo.Class.UNIVERSAL,
      type: Zo.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "PBES2Algorithms.keyDerivationFunc",
        tagClass: Zo.Class.UNIVERSAL,
        type: Zo.Type.SEQUENCE,
        constructed: true,
        value: [{
          name: "PBES2Algorithms.keyDerivationFunc.oid",
          tagClass: Zo.Class.UNIVERSAL,
          type: Zo.Type.OID,
          constructed: false,
          capture: "kdfOid"
        }, {
          name: "PBES2Algorithms.params",
          tagClass: Zo.Class.UNIVERSAL,
          type: Zo.Type.SEQUENCE,
          constructed: true,
          value: [{
            name: "PBES2Algorithms.params.salt",
            tagClass: Zo.Class.UNIVERSAL,
            type: Zo.Type.OCTETSTRING,
            constructed: false,
            capture: "kdfSalt"
          }, {
            name: "PBES2Algorithms.params.iterationCount",
            tagClass: Zo.Class.UNIVERSAL,
            type: Zo.Type.INTEGER,
            constructed: false,
            capture: "kdfIterationCount"
          }, {
            name: "PBES2Algorithms.params.keyLength",
            tagClass: Zo.Class.UNIVERSAL,
            type: Zo.Type.INTEGER,
            constructed: false,
            optional: true,
            capture: "keyLength"
          }, {
            name: "PBES2Algorithms.params.prf",
            tagClass: Zo.Class.UNIVERSAL,
            type: Zo.Type.SEQUENCE,
            constructed: true,
            optional: true,
            value: [{
              name: "PBES2Algorithms.params.prf.algorithm",
              tagClass: Zo.Class.UNIVERSAL,
              type: Zo.Type.OID,
              constructed: false,
              capture: "prfOid"
            }]
          }]
        }]
      }, {
        name: "PBES2Algorithms.encryptionScheme",
        tagClass: Zo.Class.UNIVERSAL,
        type: Zo.Type.SEQUENCE,
        constructed: true,
        value: [{
          name: "PBES2Algorithms.encryptionScheme.oid",
          tagClass: Zo.Class.UNIVERSAL,
          type: Zo.Type.OID,
          constructed: false,
          capture: "encOid"
        }, {
          name: "PBES2Algorithms.encryptionScheme.iv",
          tagClass: Zo.Class.UNIVERSAL,
          type: Zo.Type.OCTETSTRING,
          constructed: false,
          capture: "encIv"
        }]
      }]
    };
    var glp = {
      name: "pkcs-12PbeParams",
      tagClass: Zo.Class.UNIVERSAL,
      type: Zo.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "pkcs-12PbeParams.salt",
        tagClass: Zo.Class.UNIVERSAL,
        type: Zo.Type.OCTETSTRING,
        constructed: false,
        capture: "salt"
      }, {
        name: "pkcs-12PbeParams.iterations",
        tagClass: Zo.Class.UNIVERSAL,
        type: Zo.Type.INTEGER,
        constructed: false,
        capture: "iterations"
      }]
    };
    cf.encryptPrivateKeyInfo = function (e, t, n) {
      n = n || {};
      n.saltSize = n.saltSize || 8;
      n.count = n.count || 2048;
      n.algorithm = n.algorithm || "aes128";
      n.prfAlgorithm = n.prfAlgorithm || "sha1";
      var r = Rl.random.getBytesSync(n.saltSize);
      var o = n.count;
      var s = Zo.integerToDer(o);
      var i;
      var a;
      var l;
      if (n.algorithm.indexOf("aes") === 0 || n.algorithm === "des") {
        var c;
        var u;
        var d;
        switch (n.algorithm) {
          case "aes128":
            i = 16;
            c = 16;
            u = BGe["aes128-CBC"];
            d = Rl.aes.createEncryptionCipher;
            break;
          case "aes192":
            i = 24;
            c = 16;
            u = BGe["aes192-CBC"];
            d = Rl.aes.createEncryptionCipher;
            break;
          case "aes256":
            i = 32;
            c = 16;
            u = BGe["aes256-CBC"];
            d = Rl.aes.createEncryptionCipher;
            break;
          case "des":
            i = 8;
            c = 8;
            u = BGe.desCBC;
            d = Rl.des.createEncryptionCipher;
            break;
          default:
            var p = Error("Cannot encrypt private key. Unknown encryption algorithm.");
            throw p.algorithm = n.algorithm, p;
        }
        var m = "hmacWith" + n.prfAlgorithm.toUpperCase();
        var f = Lna(m);
        var h = Rl.pkcs5.pbkdf2(t, r, o, i, f);
        var g = Rl.random.getBytesSync(c);
        var y = d(h);
        y.start(g);
        y.update(Zo.toDer(e));
        y.finish();
        l = y.output.getBytes();
        var _ = ylp(r, s, i, m);
        a = Zo.create(Zo.Class.UNIVERSAL, Zo.Type.SEQUENCE, true, [Zo.create(Zo.Class.UNIVERSAL, Zo.Type.OID, false, Zo.oidToDer(BGe.pkcs5PBES2).getBytes()), Zo.create(Zo.Class.UNIVERSAL, Zo.Type.SEQUENCE, true, [Zo.create(Zo.Class.UNIVERSAL, Zo.Type.SEQUENCE, true, [Zo.create(Zo.Class.UNIVERSAL, Zo.Type.OID, false, Zo.oidToDer(BGe.pkcs5PBKDF2).getBytes()), _]), Zo.create(Zo.Class.UNIVERSAL, Zo.Type.SEQUENCE, true, [Zo.create(Zo.Class.UNIVERSAL, Zo.Type.OID, false, Zo.oidToDer(u).getBytes()), Zo.create(Zo.Class.UNIVERSAL, Zo.Type.OCTETSTRING, false, g)])])]);
      } else if (n.algorithm === "3des") {
        i = 24;
        var b = new Rl.util.ByteBuffer(r);
        var h = cf.pbe.generatePkcs12Key(t, b, 1, o, i);
        var g = cf.pbe.generatePkcs12Key(t, b, 2, o, i);
        var y = Rl.des.createEncryptionCipher(h);
        y.start(g);
        y.update(Zo.toDer(e));
        y.finish();
        l = y.output.getBytes();
        a = Zo.create(Zo.Class.UNIVERSAL, Zo.Type.SEQUENCE, true, [Zo.create(Zo.Class.UNIVERSAL, Zo.Type.OID, false, Zo.oidToDer(BGe["pbeWithSHAAnd3-KeyTripleDES-CBC"]).getBytes()), Zo.create(Zo.Class.UNIVERSAL, Zo.Type.SEQUENCE, true, [Zo.create(Zo.Class.UNIVERSAL, Zo.Type.OCTETSTRING, false, r), Zo.create(Zo.Class.UNIVERSAL, Zo.Type.INTEGER, false, s.getBytes())])]);
      } else {
        var p = Error("Cannot encrypt private key. Unknown encryption algorithm.");
        throw p.algorithm = n.algorithm, p;
      }
      var S = Zo.create(Zo.Class.UNIVERSAL, Zo.Type.SEQUENCE, true, [a, Zo.create(Zo.Class.UNIVERSAL, Zo.Type.OCTETSTRING, false, l)]);
      return S;
    };
    cf.decryptPrivateKeyInfo = function (e, t) {
      var n = null;
      var r = {};
      var o = [];
      if (!Zo.validate(e, flp, r, o)) {
        var s = Error("Cannot read encrypted private key. ASN.1 object is not a supported EncryptedPrivateKeyInfo.");
        throw s.errors = o, s;
      }
      var i = Zo.derToOid(r.encryptionOid);
      var a = cf.pbe.getCipher(i, r.encryptionParams, t);
      var l = Rl.util.createBuffer(r.encryptedData);
      if (a.update(l), a.finish()) {
        n = Zo.fromDer(a.output);
      }
      return n;
    };
    cf.encryptedPrivateKeyToPem = function (e, t) {
      var n = {
        type: "ENCRYPTED PRIVATE KEY",
        body: Zo.toDer(e).getBytes()
      };
      return Rl.pem.HS(n, {
        maxline: t
      });
    };
    cf.encryptedPrivateKeyFromPem = function (e) {
      var t = Rl.pem.oC(e)[0];
      if (t.type !== "ENCRYPTED PRIVATE KEY") {
        var n = Error('Could not convert encrypted private key from PEM; PEM header type is "ENCRYPTED PRIVATE KEY".');
        throw n.headerType = t.type, n;
      }
      if (t.procType && t.procType.type === "ENCRYPTED") {
        throw Error("Could not convert encrypted private key from PEM; PEM is encrypted.");
      }
      return Zo.fromDer(t.body);
    };
    cf.encryptRsaPrivateKey = function (e, t, n) {
      if (n = n || {}, !n.legacy) {
        var r = cf.wrapRsaPrivateKey(cf.privateKeyToAsn1(e));
        r = cf.encryptPrivateKeyInfo(r, t, n);
        return cf.encryptedPrivateKeyToPem(r);
      }
      var o;
      var s;
      var i;
      var a;
      switch (n.algorithm) {
        case "aes128":
          o = "AES-128-CBC";
          i = 16;
          s = Rl.random.getBytesSync(16);
          a = Rl.aes.createEncryptionCipher;
          break;
        case "aes192":
          o = "AES-192-CBC";
          i = 24;
          s = Rl.random.getBytesSync(16);
          a = Rl.aes.createEncryptionCipher;
          break;
        case "aes256":
          o = "AES-256-CBC";
          i = 32;
          s = Rl.random.getBytesSync(16);
          a = Rl.aes.createEncryptionCipher;
          break;
        case "3des":
          o = "DES-EDE3-CBC";
          i = 24;
          s = Rl.random.getBytesSync(8);
          a = Rl.des.createEncryptionCipher;
          break;
        case "des":
          o = "DES-CBC";
          i = 8;
          s = Rl.random.getBytesSync(8);
          a = Rl.des.createEncryptionCipher;
          break;
        default:
          var l = Error('Could not encrypt RSA private key; unsupported encryption algorithm "' + n.algorithm + '".');
          throw l.algorithm = n.algorithm, l;
      }
      var c = Rl.pbe.opensslDeriveBytes(t, s.substr(0, 8), i);
      var u = a(c);
      u.start(s);
      u.update(Zo.toDer(cf.privateKeyToAsn1(e)));
      u.finish();
      var d = {
        type: "RSA PRIVATE KEY",
        procType: {
          version: "4",
          type: "ENCRYPTED"
        },
        dekInfo: {
          algorithm: o,
          parameters: Rl.util.bytesToHex(s).toUpperCase()
        },
        body: u.output.getBytes()
      };
      return Rl.pem.HS(d);
    };
    cf.decryptRsaPrivateKey = function (e, t) {
      var n = null;
      var r = Rl.pem.oC(e)[0];
      if (r.type !== "ENCRYPTED PRIVATE KEY" && r.type !== "PRIVATE KEY" && r.type !== "RSA PRIVATE KEY") {
        var o = Error('Could not convert private key from PEM; PEM header type is not "ENCRYPTED PRIVATE KEY", "PRIVATE KEY", or "RSA PRIVATE KEY".');
        throw o.headerType = o, o;
      }
      if (r.procType && r.procType.type === "ENCRYPTED") {
        var s;
        var i;
        switch (r.dekInfo.algorithm) {
          case "DES-CBC":
            s = 8;
            i = Rl.des.createDecryptionCipher;
            break;
          case "DES-EDE3-CBC":
            s = 24;
            i = Rl.des.createDecryptionCipher;
            break;
          case "AES-128-CBC":
            s = 16;
            i = Rl.aes.createDecryptionCipher;
            break;
          case "AES-192-CBC":
            s = 24;
            i = Rl.aes.createDecryptionCipher;
            break;
          case "AES-256-CBC":
            s = 32;
            i = Rl.aes.createDecryptionCipher;
            break;
          case "RC2-40-CBC":
            s = 5;
            i = function (d) {
              return Rl.rc2.createDecryptionCipher(d, 40);
            };
            break;
          case "RC2-64-CBC":
            s = 8;
            i = function (d) {
              return Rl.rc2.createDecryptionCipher(d, 64);
            };
            break;
          case "RC2-128-CBC":
            s = 16;
            i = function (d) {
              return Rl.rc2.createDecryptionCipher(d, 128);
            };
            break;
          default:
            var o = Error('Could not decrypt private key; unsupported encryption algorithm "' + r.dekInfo.algorithm + '".');
            throw o.algorithm = r.dekInfo.algorithm, o;
        }
        var a = Rl.util.hexToBytes(r.dekInfo.parameters);
        var l = Rl.pbe.opensslDeriveBytes(t, a.substr(0, 8), s);
        var c = i(l);
        if (c.start(a), c.update(Rl.util.createBuffer(r.body)), c.finish()) {
          n = c.output.getBytes();
        } else {
          return n;
        }
      } else {
        n = r.body;
      }
      if (r.type === "ENCRYPTED PRIVATE KEY") {
        n = cf.decryptPrivateKeyInfo(Zo.fromDer(n), t);
      } else {
        n = Zo.fromDer(n);
      }
      if (n !== null) {
        n = cf.privateKeyFromAsn1(n);
      }
      return n;
    };
    cf.pbe.generatePkcs12Key = function (e, t, n, r, o, s) {
      var i;
      var a;
      if (typeof s > "u" || s === null) {
        if (!("sha1" in Rl.md)) {
          throw Error('"sha1" hash algorithm unavailable.');
        }
        s = Rl.md.sha1.create();
      }
      var {
        digestLength: l,
        blockLength: c
      } = s;
      var u = new Rl.util.ByteBuffer();
      var d = new Rl.util.ByteBuffer();
      if (e !== null && e !== undefined) {
        for (a = 0; a < e.length; a++) {
          d.putInt16(e.charCodeAt(a));
        }
        d.putInt16(0);
      }
      var p = d.length();
      var m = t.length();
      var f = new Rl.util.ByteBuffer();
      f.fillWithByte(n, c);
      var h = c * Math.ceil(m / c);
      var g = new Rl.util.ByteBuffer();
      for (a = 0; a < h; a++) {
        g.putByte(t.at(a % m));
      }
      var y = c * Math.ceil(p / c);
      var _ = new Rl.util.ByteBuffer();
      for (a = 0; a < y; a++) {
        _.putByte(d.at(a % p));
      }
      var b = g;
      b.putBuffer(_);
      var S = Math.ceil(o / l);
      for (var E = 1; E <= S; E++) {
        var C = new Rl.util.ByteBuffer();
        C.putBytes(f.bytes());
        C.putBytes(b.bytes());
        for (var x = 0; x < r; x++) {
          s.start();
          s.update(C.getBytes());
          C = s.digest();
        }
        var A = new Rl.util.ByteBuffer();
        for (a = 0; a < c; a++) {
          A.putByte(C.at(a % l));
        }
        var k = Math.ceil(m / c) + Math.ceil(p / c);
        var I = new Rl.util.ByteBuffer();
        for (i = 0; i < k; i++) {
          var O = new Rl.util.ByteBuffer(b.getBytes(c));
          var M = 511;
          for (a = A.length() - 1; a >= 0; a--) {
            M = M >> 8;
            M += A.at(a) + O.at(a);
            O.setAt(a, M & 255);
          }
          I.putBuffer(O);
        }
        b = I;
        u.putBuffer(C);
      }
      u.truncate(u.length() - o);
      return u;
    };
    cf.pbe.getCipher = function (e, t, n) {
      switch (e) {
        case cf.oids.pkcs5PBES2:
          return cf.pbe.getCipherForPBES2(e, t, n);
        case cf.oids["pbeWithSHAAnd3-KeyTripleDES-CBC"]:
        case cf.oids["pbewithSHAAnd40BitRC2-CBC"]:
          return cf.pbe.getCipherForPKCS12PBE(e, t, n);
        default:
          var r = Error("Cannot read encrypted PBE data block. Unsupported OID.");
          throw r.oid = e, r.supportedOids = ["pkcs5PBES2", "pbeWithSHAAnd3-KeyTripleDES-CBC", "pbewithSHAAnd40BitRC2-CBC"], r;
      }
    };
    cf.pbe.getCipherForPBES2 = function (e, t, n) {
      var r = {};
      var o = [];
      if (!Zo.validate(t, hlp, r, o)) {
        var s = Error("Cannot read password-based-encryption algorithm parameters. ASN.1 object is not a supported EncryptedPrivateKeyInfo.");
        throw s.errors = o, s;
      }
      if (e = Zo.derToOid(r.kdfOid), e !== cf.oids.pkcs5PBKDF2) {
        var s = Error("Cannot read encrypted private key. Unsupported key derivation function OID.");
        throw s.oid = e, s.supportedOids = ["pkcs5PBKDF2"], s;
      }
      if (e = Zo.derToOid(r.encOid), e !== cf.oids["aes128-CBC"] && e !== cf.oids["aes192-CBC"] && e !== cf.oids["aes256-CBC"] && e !== cf.oids["des-EDE3-CBC"] && e !== cf.oids.desCBC) {
        var s = Error("Cannot read encrypted private key. Unsupported encryption scheme OID.");
        throw s.oid = e, s.supportedOids = ["aes128-CBC", "aes192-CBC", "aes256-CBC", "des-EDE3-CBC", "desCBC"], s;
      }
      var i = r.kdfSalt;
      var a = Rl.util.createBuffer(r.kdfIterationCount);
      a = a.getInt(a.length() << 3);
      var l;
      var c;
      switch (cf.oids[e]) {
        case "aes128-CBC":
          l = 16;
          c = Rl.aes.createDecryptionCipher;
          break;
        case "aes192-CBC":
          l = 24;
          c = Rl.aes.createDecryptionCipher;
          break;
        case "aes256-CBC":
          l = 32;
          c = Rl.aes.createDecryptionCipher;
          break;
        case "des-EDE3-CBC":
          l = 24;
          c = Rl.des.createDecryptionCipher;
          break;
        case "desCBC":
          l = 8;
          c = Rl.des.createDecryptionCipher;
          break;
      }
      var u = Nna(r.prfOid);
      var d = Rl.pkcs5.pbkdf2(n, i, a, l, u);
      var p = r.encIv;
      var m = c(d);
      m.start(p);
      return m;
    };
    cf.pbe.getCipherForPKCS12PBE = function (e, t, n) {
      var r = {};
      var o = [];
      if (!Zo.validate(t, glp, r, o)) {
        var s = Error("Cannot read password-based-encryption algorithm parameters. ASN.1 object is not a supported EncryptedPrivateKeyInfo.");
        throw s.errors = o, s;
      }
      var i = Rl.util.createBuffer(r.salt);
      var a = Rl.util.createBuffer(r.iterations);
      a = a.getInt(a.length() << 3);
      var l;
      var c;
      var u;
      switch (e) {
        case cf.oids["pbeWithSHAAnd3-KeyTripleDES-CBC"]:
          l = 24;
          c = 8;
          u = Rl.des.startDecrypting;
          break;
        case cf.oids["pbewithSHAAnd40BitRC2-CBC"]:
          l = 5;
          c = 8;
          u = function (h, g) {
            var y = Rl.rc2.createDecryptionCipher(h, 40);
            y.start(g, null);
            return y;
          };
          break;
        default:
          var s = Error("Cannot read PKCS #12 PBE data block. Unsupported OID.");
          throw s.oid = e, s;
      }
      var d = Nna(r.prfOid);
      var p = cf.pbe.generatePkcs12Key(n, i, 1, a, l, d);
      d.start();
      var m = cf.pbe.generatePkcs12Key(n, i, 2, a, c, d);
      return u(p, m);
    };
    cf.pbe.opensslDeriveBytes = function (e, t, n, r) {
      if (typeof r > "u" || r === null) {
        if (!("md5" in Rl.md)) {
          throw Error('"md5" hash algorithm unavailable.');
        }
        r = Rl.md.md5.create();
      }
      if (t === null) {
        t = "";
      }
      var o = [Mna(r, e + t)];
      for (var s = 16, i = 1; s < n; ++i, s += 16) {
        o.push(Mna(r, o[i - 1] + e + t));
      }
      return o.join("").substr(0, n);
    };
    function Mna(e, t) {
      return e.start().update(t).digest().getBytes();
    }
    function Nna(e) {
      var t;
      if (!e) {
        t = "hmacWithSHA1";
      } else if (t = cf.oids[Zo.derToOid(e)], !t) {
        var n = Error("Unsupported PRF OID.");
        throw n.oid = e, n.supported = ["hmacWithSHA1", "hmacWithSHA224", "hmacWithSHA256", "hmacWithSHA384", "hmacWithSHA512"], n;
      }
      return Lna(t);
    }
    function Lna(e) {
      var t = Rl.md;
      switch (e) {
        case "hmacWithSHA224":
          t = Rl.md.sha512;
        case "hmacWithSHA1":
        case "hmacWithSHA256":
        case "hmacWithSHA384":
        case "hmacWithSHA512":
          e = e.substr(8).toLowerCase();
          break;
        default:
          var n = Error("Unsupported PRF algorithm.");
          throw n.algorithm = e, n.supported = ["hmacWithSHA1", "hmacWithSHA224", "hmacWithSHA256", "hmacWithSHA384", "hmacWithSHA512"], n;
      }
      if (!t || !(e in t)) {
        throw Error("Unknown hash algorithm: " + e);
      }
      return t[e].create();
    }
    function ylp(e, t, n, r) {
      var o = Zo.create(Zo.Class.UNIVERSAL, Zo.Type.SEQUENCE, true, [Zo.create(Zo.Class.UNIVERSAL, Zo.Type.OCTETSTRING, false, e), Zo.create(Zo.Class.UNIVERSAL, Zo.Type.INTEGER, false, t.getBytes())]);
      if (r !== "hmacWithSHA1") {
        o.value.push(Zo.create(Zo.Class.UNIVERSAL, Zo.Type.INTEGER, false, Rl.util.hexToBytes(n.toString(16))), Zo.create(Zo.Class.UNIVERSAL, Zo.Type.SEQUENCE, true, [Zo.create(Zo.Class.UNIVERSAL, Zo.Type.OID, false, Zo.oidToDer(cf.oids[r]).getBytes()), Zo.create(Zo.Class.UNIVERSAL, Zo.Type.NULL, false, "")]));
      }
      return o;
    }
  });