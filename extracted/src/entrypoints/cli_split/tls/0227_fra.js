  var fra = __commonJS(yio => {
    var lcp = wf();
    jre();
    var C1 = lcp.asn1;
    yio.privateKeyValidator = {
      name: "PrivateKeyInfo",
      tagClass: C1.Class.UNIVERSAL,
      type: C1.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "PrivateKeyInfo.version",
        tagClass: C1.Class.UNIVERSAL,
        type: C1.Type.INTEGER,
        constructed: false,
        capture: "privateKeyVersion"
      }, {
        name: "PrivateKeyInfo.privateKeyAlgorithm",
        tagClass: C1.Class.UNIVERSAL,
        type: C1.Type.SEQUENCE,
        constructed: true,
        value: [{
          name: "AlgorithmIdentifier.algorithm",
          tagClass: C1.Class.UNIVERSAL,
          type: C1.Type.OID,
          constructed: false,
          capture: "privateKeyOid"
        }]
      }, {
        name: "PrivateKeyInfo",
        tagClass: C1.Class.UNIVERSAL,
        type: C1.Type.OCTETSTRING,
        constructed: false,
        capture: "privateKey"
      }]
    };
    yio.publicKeyValidator = {
      name: "SubjectPublicKeyInfo",
      tagClass: C1.Class.UNIVERSAL,
      type: C1.Type.SEQUENCE,
      constructed: true,
      captureAsn1: "subjectPublicKeyInfo",
      value: [{
        name: "SubjectPublicKeyInfo.AlgorithmIdentifier",
        tagClass: C1.Class.UNIVERSAL,
        type: C1.Type.SEQUENCE,
        constructed: true,
        value: [{
          name: "AlgorithmIdentifier.algorithm",
          tagClass: C1.Class.UNIVERSAL,
          type: C1.Type.OID,
          constructed: false,
          capture: "publicKeyOid"
        }]
      }, {
        tagClass: C1.Class.UNIVERSAL,
        type: C1.Type.BITSTRING,
        constructed: false,
        composed: true,
        captureBitStringValue: "ed25519PublicKey"
      }]
    };
  });
  var Rra = __commonJS((OIy, Cra) => {
    var eU = wf();
    fqt();
    lX();
    gio();
    g_();
    var bra = fra();
    var ccp = bra.publicKeyValidator;
    var ucp = bra.privateKeyValidator;
    if (typeof bio > "u") {
      bio = eU.jsbn.BigInteger;
    }
    var bio;
    var Sio = eU.util.ByteBuffer;
    var vG = typeof Buffer > "u" ? Uint8Array : Buffer;
    eU.pki = eU.pki || {};
    Cra.exports = eU.pki.ed25519 = eU.ed25519 = eU.ed25519 || {};
    var Kh = eU.ed25519;
    Kh.constants = {};
    Kh.constants.PUBLIC_KEY_BYTE_LENGTH = 32;
    Kh.constants.PRIVATE_KEY_BYTE_LENGTH = 64;
    Kh.constants.SEED_BYTE_LENGTH = 32;
    Kh.constants.SIGN_BYTE_LENGTH = 64;
    Kh.constants.HASH_BYTE_LENGTH = 64;
    Kh.generateKeyPair = function (e) {
      e = e || {};
      var t = e.seed;
      if (t === undefined) {
        t = eU.random.getBytesSync(Kh.constants.SEED_BYTE_LENGTH);
      } else if (typeof t === "string") {
        if (t.length !== Kh.constants.SEED_BYTE_LENGTH) {
          throw TypeError('"seed" must be ' + Kh.constants.SEED_BYTE_LENGTH + " bytes in length.");
        }
      } else if (!(t instanceof Uint8Array)) {
        throw TypeError('"seed" must be a node.js Buffer, Uint8Array, or a binary string.');
      }
      t = USe({
        message: t,
        encoding: "binary"
      });
      var n = new vG(Kh.constants.PUBLIC_KEY_BYTE_LENGTH);
      var r = new vG(Kh.constants.PRIVATE_KEY_BYTE_LENGTH);
      for (var o = 0; o < 32; ++o) {
        r[o] = t[o];
      }
      fcp(n, r);
      return {
        publicKey: n,
        privateKey: r
      };
    };
    Kh.privateKeyFromAsn1 = function (e) {
      var t = {};
      var n = [];
      var r = eU.asn1.validate(e, ucp, t, n);
      if (!r) {
        var o = Error("Invalid Key.");
        throw o.errors = n, o;
      }
      var s = eU.asn1.derToOid(t.privateKeyOid);
      var i = eU.oids.EdDSA25519;
      if (s !== i) {
        throw Error('Invalid OID "' + s + '"; OID must be "' + i + '".');
      }
      var a = t.privateKey;
      var l = USe({
        message: eU.asn1.fromDer(a).value,
        encoding: "binary"
      });
      return {
        privateKeyBytes: l
      };
    };
    Kh.publicKeyFromAsn1 = function (e) {
      var t = {};
      var n = [];
      var r = eU.asn1.validate(e, ccp, t, n);
      if (!r) {
        var o = Error("Invalid Key.");
        throw o.errors = n, o;
      }
      var s = eU.asn1.derToOid(t.publicKeyOid);
      var i = eU.oids.EdDSA25519;
      if (s !== i) {
        throw Error('Invalid OID "' + s + '"; OID must be "' + i + '".');
      }
      var a = t.ed25519PublicKey;
      if (a.length !== Kh.constants.PUBLIC_KEY_BYTE_LENGTH) {
        throw Error("Key length is invalid.");
      }
      return USe({
        message: a,
        encoding: "binary"
      });
    };
    Kh.publicKeyFromPrivateKey = function (e) {
      e = e || {};
      var t = USe({
        message: e.privateKey,
        encoding: "binary"
      });
      if (t.length !== Kh.constants.PRIVATE_KEY_BYTE_LENGTH) {
        throw TypeError('"options.privateKey" must have a byte length of ' + Kh.constants.PRIVATE_KEY_BYTE_LENGTH);
      }
      var n = new vG(Kh.constants.PUBLIC_KEY_BYTE_LENGTH);
      for (var r = 0; r < n.length; ++r) {
        n[r] = t[32 + r];
      }
      return n;
    };
    Kh.sign = function (e) {
      e = e || {};
      var t = USe(e);
      var n = USe({
        message: e.privateKey,
        encoding: "binary"
      });
      if (n.length === Kh.constants.SEED_BYTE_LENGTH) {
        var r = Kh.generateKeyPair({
          seed: n
        });
        n = r.privateKey;
      } else if (n.length !== Kh.constants.PRIVATE_KEY_BYTE_LENGTH) {
        throw TypeError('"options.privateKey" must have a byte length of ' + Kh.constants.SEED_BYTE_LENGTH + " or " + Kh.constants.PRIVATE_KEY_BYTE_LENGTH);
      }
      var o = new vG(Kh.constants.SIGN_BYTE_LENGTH + t.length);
      hcp(o, t, t.length, n);
      var s = new vG(Kh.constants.SIGN_BYTE_LENGTH);
      for (var i = 0; i < s.length; ++i) {
        s[i] = o[i];
      }
      return s;
    };
    Kh.verify = function (e) {
      e = e || {};
      var t = USe(e);
      if (e.signature === undefined) {
        throw TypeError('"options.signature" must be a node.js Buffer, a Uint8Array, a forge ByteBuffer, or a binary string.');
      }
      var n = USe({
        message: e.signature,
        encoding: "binary"
      });
      if (n.length !== Kh.constants.SIGN_BYTE_LENGTH) {
        throw TypeError('"options.signature" must have a byte length of ' + Kh.constants.SIGN_BYTE_LENGTH);
      }
      var r = USe({
        message: e.publicKey,
        encoding: "binary"
      });
      if (r.length !== Kh.constants.PUBLIC_KEY_BYTE_LENGTH) {
        throw TypeError('"options.publicKey" must have a byte length of ' + Kh.constants.PUBLIC_KEY_BYTE_LENGTH);
      }
      var o = new vG(Kh.constants.SIGN_BYTE_LENGTH + t.length);
      var s = new vG(Kh.constants.SIGN_BYTE_LENGTH + t.length);
      var i;
      for (i = 0; i < Kh.constants.SIGN_BYTE_LENGTH; ++i) {
        o[i] = n[i];
      }
      for (i = 0; i < t.length; ++i) {
        o[i + Kh.constants.SIGN_BYTE_LENGTH] = t[i];
      }
      return gcp(s, o, o.length, r) >= 0;
    };
    function USe(e) {
      var t = e.message;
      if (t instanceof Uint8Array || t instanceof vG) {
        return t;
      }
      var n = e.encoding;
      if (t === undefined) {
        if (e.md) {
          t = e.md.digest().getBytes();
          n = "binary";
        } else {
          throw TypeError('"options.message" or "options.md" not specified.');
        }
      }
      if (typeof t === "string" && !n) {
        throw TypeError('"options.encoding" must be "binary" or "utf8".');
      }
      if (typeof t === "string") {
        if (typeof Buffer < "u") {
          return Buffer.from(t, n);
        }
        t = new Sio(t, n);
      } else if (!(t instanceof Sio)) {
        throw TypeError('"options.message" must be a node.js Buffer, a Uint8Array, a forge ByteBuffer, or a string with "options.encoding" specifying its encoding.');
      }
      var r = new vG(t.length());
      for (var o = 0; o < r.length; ++o) {
        r[o] = t.at(o);
      }
      return r;
    }
    var Tio = Kd();
    var uUn = Kd([1]);
    var dcp = Kd([30883, 4953, 19914, 30187, 55467, 16705, 2637, 112, 59544, 30585, 16505, 36039, 65139, 11119, 27886, 20995]);
    var pcp = Kd([61785, 9906, 39828, 60374, 45398, 33411, 5274, 224, 53552, 61171, 33010, 6542, 64743, 22239, 55772, 9222]);
    var hra = Kd([54554, 36645, 11616, 51542, 42930, 38181, 51040, 26924, 56412, 64982, 57905, 49316, 21502, 52590, 14035, 8553]);
    var gra = Kd([26200, 26214, 26214, 26214, 26214, 26214, 26214, 26214, 26214, 26214, 26214, 26214, 26214, 26214, 26214, 26214]);
    var Sqt = new Float64Array([237, 211, 245, 92, 26, 99, 18, 88, 214, 156, 247, 162, 222, 249, 222, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16]);
    var mcp = Kd([41136, 18958, 6951, 50414, 58488, 44335, 6150, 12099, 55207, 15867, 153, 11085, 57099, 20417, 9344, 11139]);
    function Tqt(e, t) {
      var n = eU.md.sha512.create();
      var r = new Sio(e);
      n.update(r.getBytes(t), "binary");
      var o = n.digest().getBytes();
      if (typeof Buffer < "u") {
        return Buffer.from(o, "binary");
      }
      var s = new vG(Kh.constants.HASH_BYTE_LENGTH);
      for (var i = 0; i < 64; ++i) {
        s[i] = o.charCodeAt(i);
      }
      return s;
    }
    function fcp(e, t) {
      var n = [Kd(), Kd(), Kd(), Kd()];
      var r;
      var o = Tqt(t, 32);
      o[0] &= 248;
      o[31] &= 127;
      o[31] |= 64;
      Cio(n, o);
      wio(e, n);
      for (r = 0; r < 32; ++r) {
        t[r + 32] = e[r];
      }
      return 0;
    }
    function hcp(e, t, n, r) {
      var o;
      var s;
      var i = new Float64Array(64);
      var a = [Kd(), Kd(), Kd(), Kd()];
      var l = Tqt(r, 32);
      l[0] &= 248;
      l[31] &= 127;
      l[31] |= 64;
      var c = n + 64;
      for (o = 0; o < n; ++o) {
        e[64 + o] = t[o];
      }
      for (o = 0; o < 32; ++o) {
        e[32 + o] = l[32 + o];
      }
      var u = Tqt(e.subarray(32), n + 32);
      Eio(u);
      Cio(a, u);
      wio(e, a);
      for (o = 32; o < 64; ++o) {
        e[o] = r[o];
      }
      var d = Tqt(e, n + 64);
      Eio(d);
      for (o = 32; o < 64; ++o) {
        i[o] = 0;
      }
      for (o = 0; o < 32; ++o) {
        i[o] = u[o];
      }
      for (o = 0; o < 32; ++o) {
        for (s = 0; s < 32; s++) {
          i[o + s] += d[o] * l[s];
        }
      }
      Sra(e.subarray(32), i);
      return c;
    }
    function gcp(e, t, n, r) {
      var o;
      var s;
      var i = new vG(32);
      var a = [Kd(), Kd(), Kd(), Kd()];
      var l = [Kd(), Kd(), Kd(), Kd()];
      if (s = -1, n < 64) {
        return -1;
      }
      if (_cp(l, r)) {
        return -1;
      }
      if (!ycp(t, 32)) {
        return -1;
      }
      for (o = 0; o < n; ++o) {
        e[o] = t[o];
      }
      for (o = 0; o < 32; ++o) {
        e[o + 32] = r[o];
      }
      var c = Tqt(e, n);
      if (Eio(c), vra(a, l, c), Cio(l, t.subarray(32)), vio(a, l), wio(i, a), n -= 64, Tra(t, 0, i, 0)) {
        for (o = 0; o < n; ++o) {
          e[o] = 0;
        }
        return -1;
      }
      for (o = 0; o < n; ++o) {
        e[o] = t[o + 64];
      }
      s = n;
      return s;
    }
    function ycp(e, t) {
      var n;
      for (n = 31; n >= 0; --n) {
        if (e[t + n] < Sqt[n]) {
          return true;
        }
        if (e[t + n] > Sqt[n]) {
          return false;
        }
      }
      return false;
    }
    function Sra(e, t) {
      var n;
      var r;
      var o;
      var s;
      for (r = 63; r >= 32; --r) {
        n = 0;
        for (o = r - 32, s = r - 12; o < s; ++o) {
          t[o] += n - 16 * t[r] * Sqt[o - (r - 32)];
          n = t[o] + 128 >> 8;
          t[o] -= n * 256;
        }
        t[o] += n;
        t[r] = 0;
      }
      n = 0;
      for (o = 0; o < 32; ++o) {
        t[o] += n - (t[31] >> 4) * Sqt[o];
        n = t[o] >> 8;
        t[o] &= 255;
      }
      for (o = 0; o < 32; ++o) {
        t[o] -= n * Sqt[o];
      }
      for (r = 0; r < 32; ++r) {
        t[r + 1] += t[r] >> 8;
        e[r] = t[r] & 255;
      }
    }
    function Eio(e) {
      var t = new Float64Array(64);
      for (var n = 0; n < 64; ++n) {
        t[n] = e[n];
        e[n] = 0;
      }
      Sra(e, t);
    }
    function vio(e, t) {
      var n = Kd();
      var r = Kd();
      var o = Kd();
      var s = Kd();
      var i = Kd();
      var a = Kd();
      var l = Kd();
      var c = Kd();
      var u = Kd();
      Wut(n, e[1], e[0]);
      Wut(u, t[1], t[0]);
      Sv(n, n, u);
      qut(r, e[0], e[1]);
      qut(u, t[0], t[1]);
      Sv(r, r, u);
      Sv(o, e[3], t[3]);
      Sv(o, o, pcp);
      Sv(s, e[2], t[2]);
      qut(s, s, s);
      Wut(i, r, n);
      Wut(a, s, o);
      qut(l, s, o);
      qut(c, r, n);
      Sv(e[0], i, a);
      Sv(e[1], c, l);
      Sv(e[2], l, a);
      Sv(e[3], i, c);
    }
    function yra(e, t, n) {
      for (var r = 0; r < 4; ++r) {
        wra(e[r], t[r], n);
      }
    }
    function wio(e, t) {
      var n = Kd();
      var r = Kd();
      var o = Kd();
      Ecp(o, t[2]);
      Sv(n, t[0], o);
      Sv(r, t[1], o);
      dUn(e, r);
      e[31] ^= Era(n) << 7;
    }
    function dUn(e, t) {
      var n;
      var r;
      var o;
      var s = Kd();
      var i = Kd();
      for (n = 0; n < 16; ++n) {
        i[n] = t[n];
      }
      _io(i);
      _io(i);
      _io(i);
      for (r = 0; r < 2; ++r) {
        s[0] = i[0] - 65517;
        for (n = 1; n < 15; ++n) {
          s[n] = i[n] - 65535 - (s[n - 1] >> 16 & 1);
          s[n - 1] &= 65535;
        }
        s[15] = i[15] - 32767 - (s[14] >> 16 & 1);
        o = s[15] >> 16 & 1;
        s[14] &= 65535;
        wra(i, s, 1 - o);
      }
      for (n = 0; n < 16; n++) {
        e[2 * n] = i[n] & 255;
        e[2 * n + 1] = i[n] >> 8;
      }
    }
    function _cp(e, t) {
      var n = Kd();
      var r = Kd();
      var o = Kd();
      var s = Kd();
      var i = Kd();
      var a = Kd();
      var l = Kd();
      if (kOe(e[2], uUn), bcp(e[1], t), qGe(o, e[1]), Sv(s, o, dcp), Wut(o, o, e[2]), qut(s, e[2], s), qGe(i, s), qGe(a, i), Sv(l, a, i), Sv(n, l, o), Sv(n, n, s), Scp(n, n), Sv(n, n, o), Sv(n, n, s), Sv(n, n, s), Sv(e[0], n, s), qGe(r, e[0]), Sv(r, r, s), _ra(r, o)) {
        Sv(e[0], e[0], mcp);
      }
      if (qGe(r, e[0]), Sv(r, r, s), _ra(r, o)) {
        return -1;
      }
      if (Era(e[0]) === t[31] >> 7) {
        Wut(e[0], Tio, e[0]);
      }
      Sv(e[3], e[0], e[1]);
      return 0;
    }
    function bcp(e, t) {
      var n;
      for (n = 0; n < 16; ++n) {
        e[n] = t[2 * n] + (t[2 * n + 1] << 8);
      }
      e[15] &= 32767;
    }
    function Scp(e, t) {
      var n = Kd();
      var r;
      for (r = 0; r < 16; ++r) {
        n[r] = t[r];
      }
      for (r = 250; r >= 0; --r) {
        if (qGe(n, n), r !== 1) {
          Sv(n, n, t);
        }
      }
      for (r = 0; r < 16; ++r) {
        e[r] = n[r];
      }
    }
    function _ra(e, t) {
      var n = new vG(32);
      var r = new vG(32);
      dUn(n, e);
      dUn(r, t);
      return Tra(n, 0, r, 0);
    }
    function Tra(e, t, n, r) {
      return Tcp(e, t, n, r, 32);
    }
    function Tcp(e, t, n, r, o) {
      var s;
      var i = 0;
      for (s = 0; s < o; ++s) {
        i |= e[t + s] ^ n[r + s];
      }
      return (1 & i - 1 >>> 8) - 1;
    }
    function Era(e) {
      var t = new vG(32);
      dUn(t, e);
      return t[0] & 1;
    }
    function vra(e, t, n) {
      var r;
      var o;
      kOe(e[0], Tio);
      kOe(e[1], uUn);
      kOe(e[2], uUn);
      kOe(e[3], Tio);
      for (o = 255; o >= 0; --o) {
        r = n[o / 8 | 0] >> (o & 7) & 1;
        yra(e, t, r);
        vio(t, e);
        vio(e, e);
        yra(e, t, r);
      }
    }
    function Cio(e, t) {
      var n = [Kd(), Kd(), Kd(), Kd()];
      kOe(n[0], hra);
      kOe(n[1], gra);
      kOe(n[2], uUn);
      Sv(n[3], hra, gra);
      vra(e, n, t);
    }
    function kOe(e, t) {
      var n;
      for (n = 0; n < 16; n++) {
        e[n] = t[n] | 0;
      }
    }
    function Ecp(e, t) {
      var n = Kd();
      var r;
      for (r = 0; r < 16; ++r) {
        n[r] = t[r];
      }
      for (r = 253; r >= 0; --r) {
        if (qGe(n, n), r !== 2 && r !== 4) {
          Sv(n, n, t);
        }
      }
      for (r = 0; r < 16; ++r) {
        e[r] = n[r];
      }
    }
    function _io(e) {
      var t;
      var n;
      var r = 1;
      for (t = 0; t < 16; ++t) {
        n = e[t] + r + 65535;
        r = Math.floor(n / 65536);
        e[t] = n - r * 65536;
      }
      e[0] += r - 1 + 37 * (r - 1);
    }
    function wra(e, t, n) {
      var r;
      var o = ~(n - 1);
      for (var s = 0; s < 16; ++s) {
        r = o & (e[s] ^ t[s]);
        e[s] ^= r;
        t[s] ^= r;
      }
    }
    function Kd(e) {
      var t;
      var n = new Float64Array(16);
      if (e) {
        for (t = 0; t < e.length; ++t) {
          n[t] = e[t];
        }
      }
      return n;
    }
    function qut(e, t, n) {
      for (var r = 0; r < 16; ++r) {
        e[r] = t[r] + n[r];
      }
    }
    function Wut(e, t, n) {
      for (var r = 0; r < 16; ++r) {
        e[r] = t[r] - n[r];
      }
    }
    function qGe(e, t) {
      Sv(e, t, t);
    }
    function Sv(e, t, n) {
      var r;
      var o;
      var s = 0;
      var i = 0;
      var a = 0;
      var l = 0;
      var c = 0;
      var u = 0;
      var d = 0;
      var p = 0;
      var m = 0;
      var f = 0;
      var h = 0;
      var g = 0;
      var y = 0;
      var _ = 0;
      var b = 0;
      var S = 0;
      var E = 0;
      var C = 0;
      var x = 0;
      var A = 0;
      var k = 0;
      var I = 0;
      var O = 0;
      var M = 0;
      var L = 0;
      var P = 0;
      var F = 0;
      var H = 0;
      var U = 0;
      var N = 0;
      var W = 0;
      var j = n[0];
      var z = n[1];
      var V = n[2];
      var K = n[3];
      var J = n[4];
      var Q = n[5];
      var Z = n[6];
      var ne = n[7];
      var oe = n[8];
      var ee = n[9];
      var re = n[10];
      var se = n[11];
      var ae = n[12];
      var de = n[13];
      var be = n[14];
      var fe = n[15];
      r = t[0];
      s += r * j;
      i += r * z;
      a += r * V;
      l += r * K;
      c += r * J;
      u += r * Q;
      d += r * Z;
      p += r * ne;
      m += r * oe;
      f += r * ee;
      h += r * re;
      g += r * se;
      y += r * ae;
      _ += r * de;
      b += r * be;
      S += r * fe;
      r = t[1];
      i += r * j;
      a += r * z;
      l += r * V;
      c += r * K;
      u += r * J;
      d += r * Q;
      p += r * Z;
      m += r * ne;
      f += r * oe;
      h += r * ee;
      g += r * re;
      y += r * se;
      _ += r * ae;
      b += r * de;
      S += r * be;
      E += r * fe;
      r = t[2];
      a += r * j;
      l += r * z;
      c += r * V;
      u += r * K;
      d += r * J;
      p += r * Q;
      m += r * Z;
      f += r * ne;
      h += r * oe;
      g += r * ee;
      y += r * re;
      _ += r * se;
      b += r * ae;
      S += r * de;
      E += r * be;
      C += r * fe;
      r = t[3];
      l += r * j;
      c += r * z;
      u += r * V;
      d += r * K;
      p += r * J;
      m += r * Q;
      f += r * Z;
      h += r * ne;
      g += r * oe;
      y += r * ee;
      _ += r * re;
      b += r * se;
      S += r * ae;
      E += r * de;
      C += r * be;
      x += r * fe;
      r = t[4];
      c += r * j;
      u += r * z;
      d += r * V;
      p += r * K;
      m += r * J;
      f += r * Q;
      h += r * Z;
      g += r * ne;
      y += r * oe;
      _ += r * ee;
      b += r * re;
      S += r * se;
      E += r * ae;
      C += r * de;
      x += r * be;
      A += r * fe;
      r = t[5];
      u += r * j;
      d += r * z;
      p += r * V;
      m += r * K;
      f += r * J;
      h += r * Q;
      g += r * Z;
      y += r * ne;
      _ += r * oe;
      b += r * ee;
      S += r * re;
      E += r * se;
      C += r * ae;
      x += r * de;
      A += r * be;
      k += r * fe;
      r = t[6];
      d += r * j;
      p += r * z;
      m += r * V;
      f += r * K;
      h += r * J;
      g += r * Q;
      y += r * Z;
      _ += r * ne;
      b += r * oe;
      S += r * ee;
      E += r * re;
      C += r * se;
      x += r * ae;
      A += r * de;
      k += r * be;
      I += r * fe;
      r = t[7];
      p += r * j;
      m += r * z;
      f += r * V;
      h += r * K;
      g += r * J;
      y += r * Q;
      _ += r * Z;
      b += r * ne;
      S += r * oe;
      E += r * ee;
      C += r * re;
      x += r * se;
      A += r * ae;
      k += r * de;
      I += r * be;
      O += r * fe;
      r = t[8];
      m += r * j;
      f += r * z;
      h += r * V;
      g += r * K;
      y += r * J;
      _ += r * Q;
      b += r * Z;
      S += r * ne;
      E += r * oe;
      C += r * ee;
      x += r * re;
      A += r * se;
      k += r * ae;
      I += r * de;
      O += r * be;
      M += r * fe;
      r = t[9];
      f += r * j;
      h += r * z;
      g += r * V;
      y += r * K;
      _ += r * J;
      b += r * Q;
      S += r * Z;
      E += r * ne;
      C += r * oe;
      x += r * ee;
      A += r * re;
      k += r * se;
      I += r * ae;
      O += r * de;
      M += r * be;
      L += r * fe;
      r = t[10];
      h += r * j;
      g += r * z;
      y += r * V;
      _ += r * K;
      b += r * J;
      S += r * Q;
      E += r * Z;
      C += r * ne;
      x += r * oe;
      A += r * ee;
      k += r * re;
      I += r * se;
      O += r * ae;
      M += r * de;
      L += r * be;
      P += r * fe;
      r = t[11];
      g += r * j;
      y += r * z;
      _ += r * V;
      b += r * K;
      S += r * J;
      E += r * Q;
      C += r * Z;
      x += r * ne;
      A += r * oe;
      k += r * ee;
      I += r * re;
      O += r * se;
      M += r * ae;
      L += r * de;
      P += r * be;
      F += r * fe;
      r = t[12];
      y += r * j;
      _ += r * z;
      b += r * V;
      S += r * K;
      E += r * J;
      C += r * Q;
      x += r * Z;
      A += r * ne;
      k += r * oe;
      I += r * ee;
      O += r * re;
      M += r * se;
      L += r * ae;
      P += r * de;
      F += r * be;
      H += r * fe;
      r = t[13];
      _ += r * j;
      b += r * z;
      S += r * V;
      E += r * K;
      C += r * J;
      x += r * Q;
      A += r * Z;
      k += r * ne;
      I += r * oe;
      O += r * ee;
      M += r * re;
      L += r * se;
      P += r * ae;
      F += r * de;
      H += r * be;
      U += r * fe;
      r = t[14];
      b += r * j;
      S += r * z;
      E += r * V;
      C += r * K;
      x += r * J;
      A += r * Q;
      k += r * Z;
      I += r * ne;
      O += r * oe;
      M += r * ee;
      L += r * re;
      P += r * se;
      F += r * ae;
      H += r * de;
      U += r * be;
      N += r * fe;
      r = t[15];
      S += r * j;
      E += r * z;
      C += r * V;
      x += r * K;
      A += r * J;
      k += r * Q;
      I += r * Z;
      O += r * ne;
      M += r * oe;
      L += r * ee;
      P += r * re;
      F += r * se;
      H += r * ae;
      U += r * de;
      N += r * be;
      W += r * fe;
      s += 38 * E;
      i += 38 * C;
      a += 38 * x;
      l += 38 * A;
      c += 38 * k;
      u += 38 * I;
      d += 38 * O;
      p += 38 * M;
      m += 38 * L;
      f += 38 * P;
      h += 38 * F;
      g += 38 * H;
      y += 38 * U;
      _ += 38 * N;
      b += 38 * W;
      o = 1;
      r = s + o + 65535;
      o = Math.floor(r / 65536);
      s = r - o * 65536;
      r = i + o + 65535;
      o = Math.floor(r / 65536);
      i = r - o * 65536;
      r = a + o + 65535;
      o = Math.floor(r / 65536);
      a = r - o * 65536;
      r = l + o + 65535;
      o = Math.floor(r / 65536);
      l = r - o * 65536;
      r = c + o + 65535;
      o = Math.floor(r / 65536);
      c = r - o * 65536;
      r = u + o + 65535;
      o = Math.floor(r / 65536);
      u = r - o * 65536;
      r = d + o + 65535;
      o = Math.floor(r / 65536);
      d = r - o * 65536;
      r = p + o + 65535;
      o = Math.floor(r / 65536);
      p = r - o * 65536;
      r = m + o + 65535;
      o = Math.floor(r / 65536);
      m = r - o * 65536;
      r = f + o + 65535;
      o = Math.floor(r / 65536);
      f = r - o * 65536;
      r = h + o + 65535;
      o = Math.floor(r / 65536);
      h = r - o * 65536;
      r = g + o + 65535;
      o = Math.floor(r / 65536);
      g = r - o * 65536;
      r = y + o + 65535;
      o = Math.floor(r / 65536);
      y = r - o * 65536;
      r = _ + o + 65535;
      o = Math.floor(r / 65536);
      _ = r - o * 65536;
      r = b + o + 65535;
      o = Math.floor(r / 65536);
      b = r - o * 65536;
      r = S + o + 65535;
      o = Math.floor(r / 65536);
      S = r - o * 65536;
      s += o - 1 + 37 * (o - 1);
      o = 1;
      r = s + o + 65535;
      o = Math.floor(r / 65536);
      s = r - o * 65536;
      r = i + o + 65535;
      o = Math.floor(r / 65536);
      i = r - o * 65536;
      r = a + o + 65535;
      o = Math.floor(r / 65536);
      a = r - o * 65536;
      r = l + o + 65535;
      o = Math.floor(r / 65536);
      l = r - o * 65536;
      r = c + o + 65535;
      o = Math.floor(r / 65536);
      c = r - o * 65536;
      r = u + o + 65535;
      o = Math.floor(r / 65536);
      u = r - o * 65536;
      r = d + o + 65535;
      o = Math.floor(r / 65536);
      d = r - o * 65536;
      r = p + o + 65535;
      o = Math.floor(r / 65536);
      p = r - o * 65536;
      r = m + o + 65535;
      o = Math.floor(r / 65536);
      m = r - o * 65536;
      r = f + o + 65535;
      o = Math.floor(r / 65536);
      f = r - o * 65536;
      r = h + o + 65535;
      o = Math.floor(r / 65536);
      h = r - o * 65536;
      r = g + o + 65535;
      o = Math.floor(r / 65536);
      g = r - o * 65536;
      r = y + o + 65535;
      o = Math.floor(r / 65536);
      y = r - o * 65536;
      r = _ + o + 65535;
      o = Math.floor(r / 65536);
      _ = r - o * 65536;
      r = b + o + 65535;
      o = Math.floor(r / 65536);
      b = r - o * 65536;
      r = S + o + 65535;
      o = Math.floor(r / 65536);
      S = r - o * 65536;
      s += o - 1 + 37 * (o - 1);
      e[0] = s;
      e[1] = i;
      e[2] = a;
      e[3] = l;
      e[4] = c;
      e[5] = u;
      e[6] = d;
      e[7] = p;
      e[8] = m;
      e[9] = f;
      e[10] = h;
      e[11] = g;
      e[12] = y;
      e[13] = _;
      e[14] = b;
      e[15] = S;
    }
  });
  var Ira = __commonJS((DIy, Ara) => {
    var gV = wf();
    g_();
    lX();
    fqt();
    Ara.exports = gV.kem = gV.kem || {};
    var xra = gV.jsbn.BigInteger;
    gV.kem.rsa = {};
    gV.kem.rsa.create = function (e, t) {
      t = t || {};
      var n = t.prng || gV.random;
      var r = {};
      r.encrypt = function (o, s) {
        var i = Math.ceil(o.n.bitLength() / 8);
        var a;
        do {
          a = new xra(gV.util.bytesToHex(n.getBytesSync(i)), 16).mod(o.n);
        } while (a.compareTo(xra.ONE) <= 0);
        a = gV.util.hexToBytes(a.toString(16));
        var l = i - a.length;
        if (l > 0) {
          a = gV.util.fillString(String.fromCharCode(0), l) + a;
        }
        var c = o.encrypt(a, "NONE");
        var u = e.generate(a, s);
        return {
          encapsulation: c,
          key: u
        };
      };
      r.decrypt = function (o, s, i) {
        var a = o.decrypt(s, "NONE");
        return e.generate(a, i);
      };
      return r;
    };
    gV.kem.kdf1 = function (e, t) {
      kra(this, e, 0, t || e.digestLength);
    };
    gV.kem.kdf2 = function (e, t) {
      kra(this, e, 1, t || e.digestLength);
    };
    function kra(e, t, n, r) {
      e.generate = function (o, s) {
        var i = new gV.util.ByteBuffer();
        var a = Math.ceil(s / r) + n;
        var l = new gV.util.ByteBuffer();
        for (var c = n; c < a; ++c) {
          l.putInt32(c);
          t.start();
          t.update(o + l.getBytes());
          var u = t.digest();
          i.putBytes(u.getBytes(r));
        }
        i.truncate(i.length() - s);
        return i.getBytes();
      };
    }
  });