  var Hso = __commonJS((pIy, cna) => {
    var Gue = wf();
    g_();
    var XFn = null;
    if (Gue.util.isNodejs && !Gue.options.usePureJavaScript && !process.versions["node-webkit"]) {
      XFn = require("crypto");
    }
    var mip = cna.exports = Gue.prng = Gue.prng || {};
    mip.create = function (e) {
      var t = {
        plugin: e,
        key: null,
        seed: null,
        time: null,
        reseeds: 0,
        generated: 0,
        keyBytes: ""
      };
      var n = e.md;
      var r = Array(32);
      for (var o = 0; o < 32; ++o) {
        r[o] = n.create();
      }
      t.pools = r;
      t.pool = 0;
      t.generate = function (c, u) {
        if (!u) {
          return t.generateSync(c);
        }
        var d = t.plugin.cipher;
        var p = t.plugin.increment;
        var m = t.plugin.formatKey;
        var f = t.plugin.formatSeed;
        var h = Gue.util.createBuffer();
        t.key = null;
        g();
        function g(y) {
          if (y) {
            return u(y);
          }
          if (h.length() >= c) {
            return u(null, h.getBytes(c));
          }
          if (t.generated > 1048575) {
            t.key = null;
          }
          if (t.key === null) {
            return Gue.util.nextTick(function () {
              s(g);
            });
          }
          var _ = d(t.key, t.seed);
          t.generated += _.length;
          h.putBytes(_);
          t.key = m(d(t.key, p(t.seed)));
          t.seed = f(d(t.key, t.seed));
          Gue.util.setImmediate(g);
        }
      };
      t.generateSync = function (c) {
        var u = t.plugin.cipher;
        var d = t.plugin.increment;
        var p = t.plugin.formatKey;
        var m = t.plugin.formatSeed;
        t.key = null;
        var f = Gue.util.createBuffer();
        while (f.length() < c) {
          if (t.generated > 1048575) {
            t.key = null;
          }
          if (t.key === null) {
            i();
          }
          var h = u(t.key, t.seed);
          t.generated += h.length;
          f.putBytes(h);
          t.key = p(u(t.key, d(t.seed)));
          t.seed = m(u(t.key, t.seed));
        }
        return f.getBytes(c);
      };
      function s(c) {
        if (t.pools[0].messageLength >= 32) {
          a();
          return c();
        }
        var u = 32 - t.pools[0].messageLength << 5;
        t.seedFile(u, function (d, p) {
          if (d) {
            return c(d);
          }
          t.collect(p);
          a();
          c();
        });
      }
      function i() {
        if (t.pools[0].messageLength >= 32) {
          return a();
        }
        var c = 32 - t.pools[0].messageLength << 5;
        t.collect(t.seedFileSync(c));
        a();
      }
      function a() {
        t.reseeds = t.reseeds === 4294967295 ? 0 : t.reseeds + 1;
        var c = t.plugin.md.create();
        c.update(t.keyBytes);
        var u = 1;
        for (var d = 0; d < 32; ++d) {
          if (t.reseeds % u === 0) {
            c.update(t.pools[d].digest().getBytes());
            t.pools[d].start();
          }
          u = u << 1;
        }
        t.keyBytes = c.digest().getBytes();
        c.start();
        c.update(t.keyBytes);
        var p = c.digest().getBytes();
        t.key = t.plugin.formatKey(t.keyBytes);
        t.seed = t.plugin.formatSeed(p);
        t.generated = 0;
      }
      function l(c) {
        var u = null;
        var d = Gue.util.globalScope;
        var p = d.crypto || d.msCrypto;
        if (p && p.getRandomValues) {
          u = function (E) {
            return p.getRandomValues(E);
          };
        }
        var m = Gue.util.createBuffer();
        if (u) {
          while (m.length() < c) {
            var f = Math.max(1, Math.min(c - m.length(), 65536) / 4);
            var h = new Uint32Array(Math.floor(f));
            try {
              u(h);
              for (var g = 0; g < h.length; ++g) {
                m.putInt32(h[g]);
              }
            } catch (E) {
              if (!(typeof QuotaExceededError < "u" && E instanceof QuotaExceededError)) {
                throw E;
              }
            }
          }
        }
        if (m.length() < c) {
          var y;
          var _;
          var b;
          var S = Math.floor(Math.random() * 65536);
          while (m.length() < c) {
            _ = 16807 * (S & 65535);
            y = 16807 * (S >> 16);
            _ += (y & 32767) << 16;
            _ += y >> 15;
            _ = (_ & 2147483647) + (_ >> 31);
            S = _ & 4294967295;
            for (var g = 0; g < 3; ++g) {
              b = S >>> (g << 3);
              b ^= Math.floor(Math.random() * 256);
              m.putByte(b & 255);
            }
          }
        }
        return m.getBytes(c);
      }
      if (XFn) {
        t.seedFile = function (c, u) {
          XFn.randomBytes(c, function (d, p) {
            if (d) {
              return u(d);
            }
            u(null, p.toString());
          });
        };
        t.seedFileSync = function (c) {
          return XFn.randomBytes(c).toString();
        };
      } else {
        t.seedFile = function (c, u) {
          try {
            u(null, l(c));
          } catch (d) {
            u(d);
          }
        };
        t.seedFileSync = l;
      }
      t.collect = function (c) {
        var u = c.length;
        for (var d = 0; d < u; ++d) {
          t.pools[t.pool].update(c.substr(d, 1));
          t.pool = t.pool === 31 ? 0 : t.pool + 1;
        }
      };
      t.collectInt = function (c, u) {
        var d = "";
        for (var p = 0; p < u; p += 8) {
          d += String.fromCharCode(c >> p & 255);
        }
        t.collect(d);
      };
      t.registerWorker = function (c) {
        if (c === self) {
          t.seedFile = function (d, p) {
            function m(f) {
              var h = f.data;
              if (h.forge && h.forge.prng) {
                self.removeEventListener("message", m);
                p(h.forge.prng.err, h.forge.prng.bytes);
              }
            }
            self.addEventListener("message", m);
            self.postMessage({
              forge: {
                prng: {
                  needed: d
                }
              }
            });
          };
        } else {
          var u = function (d) {
            var p = d.data;
            if (p.forge && p.forge.prng) {
              t.seedFile(p.forge.prng.needed, function (m, f) {
                c.postMessage({
                  forge: {
                    prng: {
                      err: m,
                      bytes: f
                    }
                  }
                });
              });
            }
          };
          c.addEventListener("message", u);
        }
      };
      return t;
    };
  });
  var lX = __commonJS((mIy, jso) => {
    var w1 = wf();
    SOe();
    $so();
    Hso();
    g_();
    (function () {
      if (w1.random && w1.random.getBytes) {
        jso.exports = w1.random;
        return;
      }
      (function (e) {
        var t = {};
        var n = [,,,,];
        var r = w1.util.createBuffer();
        t.formatKey = function (d) {
          var p = w1.util.createBuffer(d);
          d = [,,,,];
          d[0] = p.getInt32();
          d[1] = p.getInt32();
          d[2] = p.getInt32();
          d[3] = p.getInt32();
          return w1.aes._expandKey(d, false);
        };
        t.formatSeed = function (d) {
          var p = w1.util.createBuffer(d);
          d = [,,,,];
          d[0] = p.getInt32();
          d[1] = p.getInt32();
          d[2] = p.getInt32();
          d[3] = p.getInt32();
          return d;
        };
        t.cipher = function (d, p) {
          w1.aes._updateBlock(d, p, n, false);
          r.putInt32(n[0]);
          r.putInt32(n[1]);
          r.putInt32(n[2]);
          r.putInt32(n[3]);
          return r.getBytes();
        };
        t.increment = function (d) {
          ++d[3];
          return d;
        };
        t.md = w1.md.sha256;
        function o() {
          var d = w1.prng.create(t);
          d.getBytes = function (p, m) {
            return d.generate(p, m);
          };
          d.getBytesSync = function (p) {
            return d.generate(p);
          };
          return d;
        }
        var s = o();
        var i = null;
        var a = w1.util.globalScope;
        var l = a.crypto || a.msCrypto;
        if (l && l.getRandomValues) {
          i = function (d) {
            return l.getRandomValues(d);
          };
        }
        if (w1.options.usePureJavaScript || !w1.util.isNodejs && !i) {
          if (typeof window > "u" || window.document === undefined) {
            ;
          }
          if (s.collectInt(+new Date(), 32), typeof navigator < "u") {
            var c = "";
            for (var u in navigator) {
              try {
                if (typeof navigator[u] == "string") {
                  c += navigator[u];
                }
              } catch (d) {}
            }
            s.collect(c);
            c = null;
          }
          if (e) {
            e().mousemove(function (d) {
              s.collectInt(d.clientX, 16);
              s.collectInt(d.clientY, 16);
            });
            e().keypress(function (d) {
              s.collectInt(d.charCode, 8);
            });
          }
        }
        if (!w1.random) {
          w1.random = s;
        } else {
          for (var u in s) {
            w1.random[u] = s[u];
          }
        }
        w1.random.createInstance = o;
        jso.exports = w1.random;
      })(typeof jQuery < "u" ? jQuery : null);
    })();
  });
  var Wso = __commonJS((fIy, pna) => {
    var EG = wf();
    g_();
    var qso = [217, 120, 249, 196, 25, 221, 181, 237, 40, 233, 253, 121, 74, 160, 216, 157, 198, 126, 55, 131, 43, 118, 83, 142, 98, 76, 100, 136, 68, 139, 251, 162, 23, 154, 89, 245, 135, 179, 79, 19, 97, 69, 109, 141, 9, 129, 125, 50, 189, 143, 64, 235, 134, 183, 123, 11, 240, 149, 33, 34, 92, 107, 78, 130, 84, 214, 101, 147, 206, 96, 178, 28, 115, 86, 192, 20, 167, 140, 241, 220, 18, 117, 202, 31, 59, 190, 228, 209, 66, 61, 212, 48, 163, 60, 182, 38, 111, 191, 14, 218, 70, 105, 7, 87, 39, 242, 29, 155, 188, 148, 67, 3, 248, 17, 199, 246, 144, 239, 62, 231, 6, 195, 213, 47, 200, 102, 30, 215, 8, 232, 234, 222, 128, 82, 238, 247, 132, 170, 114, 172, 53, 77, 106, 42, 150, 26, 210, 113, 90, 21, 73, 116, 75, 159, 208, 94, 4, 24, 164, 236, 194, 224, 65, 110, 15, 81, 203, 204, 36, 145, 175, 80, 161, 244, 112, 57, 153, 124, 58, 133, 35, 184, 180, 122, 252, 2, 54, 91, 37, 85, 151, 49, 45, 93, 250, 152, 227, 138, 146, 174, 5, 223, 41, 16, 103, 108, 186, 201, 211, 0, 230, 207, 225, 158, 168, 44, 99, 22, 1, 63, 88, 226, 137, 169, 13, 56, 52, 27, 171, 51, 255, 176, 187, 72, 12, 95, 185, 177, 205, 46, 197, 243, 219, 71, 229, 165, 156, 119, 10, 166, 32, 104, 254, 127, 193, 173];
    var una = [1, 2, 3, 5];
    var fip = function (e, t) {
      return e << t & 65535 | (e & 65535) >> 16 - t;
    };
    var hip = function (e, t) {
      return (e & 65535) >> t | e << 16 - t & 65535;
    };
    pna.exports = EG.rc2 = EG.rc2 || {};
    EG.rc2.expandKey = function (e, t) {
      if (typeof e === "string") {
        e = EG.util.createBuffer(e);
      }
      t = t || 128;
      var n = e;
      var r = e.length();
      var o = t;
      var s = Math.ceil(o / 8);
      var i = 255 >> (o & 7);
      var a;
      for (a = r; a < 128; a++) {
        n.putByte(qso[n.at(a - 1) + n.at(a - r) & 255]);
      }
      n.setAt(128 - s, qso[n.at(128 - s) & i]);
      for (a = 127 - s; a >= 0; a--) {
        n.setAt(a, qso[n.at(a + 1) ^ n.at(a + s)]);
      }
      return n;
    };
    var dna = function (e, t, n) {
      var r = false;
      var o = null;
      var s = null;
      var i = null;
      var a;
      var l;
      var c;
      var u;
      var d = [];
      e = EG.rc2.expandKey(e, t);
      for (c = 0; c < 64; c++) {
        d.push(e.getInt16Le());
      }
      if (n) {
        a = function (f) {
          for (c = 0; c < 4; c++) {
            f[c] += d[u] + (f[(c + 3) % 4] & f[(c + 2) % 4]) + (~f[(c + 3) % 4] & f[(c + 1) % 4]);
            f[c] = fip(f[c], una[c]);
            u++;
          }
        };
        l = function (f) {
          for (c = 0; c < 4; c++) {
            f[c] += d[f[(c + 3) % 4] & 63];
          }
        };
      } else {
        a = function (f) {
          for (c = 3; c >= 0; c--) {
            f[c] = hip(f[c], una[c]);
            f[c] -= d[u] + (f[(c + 3) % 4] & f[(c + 2) % 4]) + (~f[(c + 3) % 4] & f[(c + 1) % 4]);
            u--;
          }
        };
        l = function (f) {
          for (c = 3; c >= 0; c--) {
            f[c] -= d[f[(c + 3) % 4] & 63];
          }
        };
      }
      var p = function (f) {
        var h = [];
        for (c = 0; c < 4; c++) {
          var g = o.getInt16Le();
          if (i !== null) {
            if (n) {
              g ^= i.getInt16Le();
            } else {
              i.putInt16Le(g);
            }
          }
          h.push(g & 65535);
        }
        u = n ? 0 : 63;
        for (var y = 0; y < f.length; y++) {
          for (var _ = 0; _ < f[y][0]; _++) {
            f[y][1](h);
          }
        }
        for (c = 0; c < 4; c++) {
          if (i !== null) {
            if (n) {
              i.putInt16Le(h[c]);
            } else {
              h[c] ^= i.getInt16Le();
            }
          }
          s.putInt16Le(h[c]);
        }
      };
      var m = null;
      m = {
        start: function (f, h) {
          if (f) {
            if (typeof f === "string") {
              f = EG.util.createBuffer(f);
            }
          }
          r = false;
          o = EG.util.createBuffer();
          s = h || new EG.util.createBuffer();
          i = f;
          m.output = s;
        },
        update: function (f) {
          if (!r) {
            o.putBuffer(f);
          }
          while (o.length() >= 8) {
            p([[5, a], [1, l], [6, a], [1, l], [5, a]]);
          }
        },
        finish: function (f) {
          var h = true;
          if (n) {
            if (f) {
              h = f(8, o, !n);
            } else {
              var g = o.length() === 8 ? 8 : 8 - o.length();
              o.fillWithByte(g, g);
            }
          }
          if (h) {
            r = true;
            m.update();
          }
          if (!n) {
            if (h = o.length() === 0, h) {
              if (f) {
                h = f(8, s, !n);
              } else {
                var y = s.length();
                var _ = s.at(y - 1);
                if (_ > y) {
                  h = false;
                } else {
                  s.truncate(_);
                }
              }
            }
          }
          return h;
        }
      };
      return m;
    };
    EG.rc2.startEncrypting = function (e, t, n) {
      var r = EG.rc2.createEncryptionCipher(e, 128);
      r.start(t, n);
      return r;
    };
    EG.rc2.createEncryptionCipher = function (e, t) {
      return dna(e, t, true);
    };
    EG.rc2.startDecrypting = function (e, t, n) {
      var r = EG.rc2.createDecryptionCipher(e, 128);
      r.start(t, n);
      return r;
    };
    EG.rc2.createDecryptionCipher = function (e, t) {
      return dna(e, t, false);
    };
  });