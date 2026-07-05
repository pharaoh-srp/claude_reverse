  var Uut = __commonJS((gIy, wna) => {
    var Vue = wf();
    Hue();
    g_();
    var Ena = wna.exports = Vue.sha1 = Vue.sha1 || {};
    Vue.md.sha1 = Vue.md.algorithms.sha1 = Ena;
    Ena.create = function () {
      if (!vna) {
        olp();
      }
      var e = null;
      var t = Vue.util.createBuffer();
      var n = Array(80);
      var r = {
        algorithm: "sha1",
        blockLength: 64,
        digestLength: 20,
        messageLength: 0,
        fullMessageLength: null,
        messageLengthSize: 8
      };
      r.start = function () {
        r.messageLength = 0;
        r.fullMessageLength = r.messageLength64 = [];
        var o = r.messageLengthSize / 4;
        for (var s = 0; s < o; ++s) {
          r.fullMessageLength.push(0);
        }
        t = Vue.util.createBuffer();
        e = {
          h0: 1732584193,
          h1: 4023233417,
          h2: 2562383102,
          h3: 271733878,
          h4: 3285377520
        };
        return r;
      };
      r.start();
      r.update = function (o, s) {
        if (s === "utf8") {
          o = Vue.util.encodeUtf8(o);
        }
        var i = o.length;
        r.messageLength += i;
        i = [i / 4294967296 >>> 0, i >>> 0];
        for (var a = r.fullMessageLength.length - 1; a >= 0; --a) {
          r.fullMessageLength[a] += i[1];
          i[1] = i[0] + (r.fullMessageLength[a] / 4294967296 >>> 0);
          r.fullMessageLength[a] = r.fullMessageLength[a] >>> 0;
          i[0] = i[1] / 4294967296 >>> 0;
        }
        if (t.putBytes(o), Tna(e, n, t), t.read > 2048 || t.length() === 0) {
          t.compact();
        }
        return r;
      };
      r.digest = function () {
        var o = Vue.util.createBuffer();
        o.putBytes(t.bytes());
        var s = r.fullMessageLength[r.fullMessageLength.length - 1] + r.messageLengthSize;
        var i = s & r.blockLength - 1;
        o.putBytes(Kso.substr(0, r.blockLength - i));
        var a;
        var l;
        var c = r.fullMessageLength[0] * 8;
        for (var u = 0; u < r.fullMessageLength.length - 1; ++u) {
          a = r.fullMessageLength[u + 1] * 8;
          l = a / 4294967296 >>> 0;
          c += l;
          o.putInt32(c >>> 0);
          c = a >>> 0;
        }
        o.putInt32(c);
        var d = {
          h0: e.h0,
          h1: e.h1,
          h2: e.h2,
          h3: e.h3,
          h4: e.h4
        };
        Tna(d, n, o);
        var p = Vue.util.createBuffer();
        p.putInt32(d.h0);
        p.putInt32(d.h1);
        p.putInt32(d.h2);
        p.putInt32(d.h3);
        p.putInt32(d.h4);
        return p;
      };
      return r;
    };
    var Kso = null;
    var vna = false;
    function olp() {
      Kso = String.fromCharCode(128);
      Kso += Vue.util.fillString(String.fromCharCode(0), 64);
      vna = true;
    }
    function Tna(e, t, n) {
      var r;
      var o;
      var s;
      var i;
      var a;
      var l;
      var c;
      var u;
      var d = n.length();
      while (d >= 64) {
        o = e.h0;
        s = e.h1;
        i = e.h2;
        a = e.h3;
        l = e.h4;
        for (u = 0; u < 16; ++u) {
          r = n.getInt32();
          t[u] = r;
          c = a ^ s & (i ^ a);
          r = (o << 5 | o >>> 27) + c + l + 1518500249 + r;
          l = a;
          a = i;
          i = (s << 30 | s >>> 2) >>> 0;
          s = o;
          o = r;
        }
        for (; u < 20; ++u) {
          r = t[u - 3] ^ t[u - 8] ^ t[u - 14] ^ t[u - 16];
          r = r << 1 | r >>> 31;
          t[u] = r;
          c = a ^ s & (i ^ a);
          r = (o << 5 | o >>> 27) + c + l + 1518500249 + r;
          l = a;
          a = i;
          i = (s << 30 | s >>> 2) >>> 0;
          s = o;
          o = r;
        }
        for (; u < 32; ++u) {
          r = t[u - 3] ^ t[u - 8] ^ t[u - 14] ^ t[u - 16];
          r = r << 1 | r >>> 31;
          t[u] = r;
          c = s ^ i ^ a;
          r = (o << 5 | o >>> 27) + c + l + 1859775393 + r;
          l = a;
          a = i;
          i = (s << 30 | s >>> 2) >>> 0;
          s = o;
          o = r;
        }
        for (; u < 40; ++u) {
          r = t[u - 6] ^ t[u - 16] ^ t[u - 28] ^ t[u - 32];
          r = r << 2 | r >>> 30;
          t[u] = r;
          c = s ^ i ^ a;
          r = (o << 5 | o >>> 27) + c + l + 1859775393 + r;
          l = a;
          a = i;
          i = (s << 30 | s >>> 2) >>> 0;
          s = o;
          o = r;
        }
        for (; u < 60; ++u) {
          r = t[u - 6] ^ t[u - 16] ^ t[u - 28] ^ t[u - 32];
          r = r << 2 | r >>> 30;
          t[u] = r;
          c = s & i | a & (s ^ i);
          r = (o << 5 | o >>> 27) + c + l + 2400959708 + r;
          l = a;
          a = i;
          i = (s << 30 | s >>> 2) >>> 0;
          s = o;
          o = r;
        }
        for (; u < 80; ++u) {
          r = t[u - 6] ^ t[u - 16] ^ t[u - 28] ^ t[u - 32];
          r = r << 2 | r >>> 30;
          t[u] = r;
          c = s ^ i ^ a;
          r = (o << 5 | o >>> 27) + c + l + 3395469782 + r;
          l = a;
          a = i;
          i = (s << 30 | s >>> 2) >>> 0;
          s = o;
          o = r;
        }
        e.h0 = e.h0 + o | 0;
        e.h1 = e.h1 + s | 0;
        e.h2 = e.h2 + i | 0;
        e.h3 = e.h3 + a | 0;
        e.h4 = e.h4 + l | 0;
        d -= 64;
      }
    }
  });
  var Yso = __commonJS((yIy, Rna) => {
    var zue = wf();
    g_();
    lX();
    Uut();
    var Cna = Rna.exports = zue.pkcs1 = zue.pkcs1 || {};
    Cna.encode_rsa_oaep = function (e, t, n) {
      var r;
      var o;
      var s;
      var i;
      if (typeof n === "string") {
        r = n;
        o = arguments[3] || undefined;
        s = arguments[4] || undefined;
      } else if (n) {
        if (r = n.label || undefined, o = n.seed || undefined, s = n.md || undefined, n.mgf1 && n.mgf1.md) {
          i = n.mgf1.md;
        }
      }
      if (!s) {
        s = zue.md.sha1.create();
      } else {
        s.start();
      }
      if (!i) {
        i = s;
      }
      var a = Math.ceil(e.n.bitLength() / 8);
      var l = a - 2 * s.digestLength - 2;
      if (t.length > l) {
        var c = Error("RSAES-OAEP input message length is too long.");
        throw c.length = t.length, c.maxLength = l, c;
      }
      if (!r) {
        r = "";
      }
      s.update(r, "raw");
      var u = s.digest();
      var d = "";
      var p = l - t.length;
      for (var m = 0; m < p; m++) {
        d += "\x00";
      }
      var f = u.getBytes() + d + "\x01" + t;
      if (!o) {
        o = zue.random.getBytes(s.digestLength);
      } else if (o.length !== s.digestLength) {
        var c = Error("Invalid RSAES-OAEP seed. The seed length must match the digest length.");
        throw c.seedLength = o.length, c.digestLength = s.digestLength, c;
      }
      var h = eUn(o, a - s.digestLength - 1, i);
      var g = zue.util.xorBytes(f, h, f.length);
      var y = eUn(g, s.digestLength, i);
      var _ = zue.util.xorBytes(o, y, o.length);
      return "\x00" + _ + g;
    };
    Cna.decode_rsa_oaep = function (e, t, n) {
      var r;
      var o;
      var s;
      if (typeof n === "string") {
        r = n;
        o = arguments[3] || undefined;
      } else if (n) {
        if (r = n.label || undefined, o = n.md || undefined, n.mgf1 && n.mgf1.md) {
          s = n.mgf1.md;
        }
      }
      var i = Math.ceil(e.n.bitLength() / 8);
      if (t.length !== i) {
        var g = Error("RSAES-OAEP encoded message length is invalid.");
        throw g.length = t.length, g.expectedLength = i, g;
      }
      if (o === undefined) {
        o = zue.md.sha1.create();
      } else {
        o.start();
      }
      if (!s) {
        s = o;
      }
      if (i < 2 * o.digestLength + 2) {
        throw Error("RSAES-OAEP key is too short for the hash function.");
      }
      if (!r) {
        r = "";
      }
      o.update(r, "raw");
      var a = o.digest().getBytes();
      var l = t.charAt(0);
      var c = t.substring(1, o.digestLength + 1);
      var u = t.substring(1 + o.digestLength);
      var d = eUn(u, o.digestLength, s);
      var p = zue.util.xorBytes(c, d, c.length);
      var m = eUn(p, i - o.digestLength - 1, s);
      var f = zue.util.xorBytes(u, m, u.length);
      var h = f.substring(0, o.digestLength);
      var g = l !== "\x00";
      for (var y = 0; y < o.digestLength; ++y) {
        g |= a.charAt(y) !== h.charAt(y);
      }
      var _ = 1;
      var b = o.digestLength;
      for (var S = o.digestLength; S < f.length; S++) {
        var E = f.charCodeAt(S);
        var C = E & 1 ^ 1;
        var x = _ ? 65534 : 0;
        g |= E & x;
        _ = _ & C;
        b += _;
      }
      if (g || f.charCodeAt(b) !== 1) {
        throw Error("Invalid RSAES-OAEP padding.");
      }
      return f.substring(b + 1);
    };
    function eUn(e, t, n) {
      if (!n) {
        n = zue.md.sha1.create();
      }
      var r = "";
      var o = Math.ceil(t / n.digestLength);
      for (var s = 0; s < o; ++s) {
        var i = String.fromCharCode(s >> 24 & 255, s >> 16 & 255, s >> 8 & 255, s & 255);
        n.start();
        n.update(e + i);
        r += n.digest().getBytes();
      }
      return r.substring(0, t);
    }
  });