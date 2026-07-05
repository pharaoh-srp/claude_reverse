  var TGr = __commonJS((ivg, MRn) => {
    /*! *****************************************************************************
    Copyright (c) Microsoft Corporation.
    Permission to use, copy, modify, and/or distribute this software for any
    purpose with or without fee is hereby granted.
    THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH
    REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY
    AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
    INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM
    LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR
    OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
    PERFORMANCE OF THIS SOFTWARE.
    ***************************************************************************** */
    var xmi;
    var kmi;
    var Ami;
    var Imi;
    var Pmi;
    var Omi;
    var Dmi;
    var Mmi;
    var Nmi;
    var DRn;
    var SGr;
    var Lmi;
    var Fmi;
    var Est;
    var Umi;
    var Bmi;
    var $mi;
    var Hmi;
    var jmi;
    var qmi;
    var Wmi;
    var Gmi;
    var Vmi;
    (function (e) {
      var t = typeof global === "object" ? global : typeof self === "object" ? self : typeof this === "object" ? this : {};
      if (typeof define === "function" && define.amd) {
        define("tslib", ["exports"], function (r) {
          e(n(t, n(r)));
        });
      } else if (typeof MRn === "object" && typeof MRn.exports === "object") {
        e(n(t, n(MRn.exports)));
      } else {
        e(n(t));
      }
      function n(r, o) {
        if (r !== t) {
          if (typeof Object.create === "function") {
            Object.defineProperty(r, "__esModule", {
              value: true
            });
          } else {
            r.__esModule = true;
          }
        }
        return function (s, i) {
          return r[s] = o ? o(s, i) : i;
        };
      }
    })(function (e) {
      var t = Object.setPrototypeOf || {
        __proto__: []
      } instanceof Array && function (n, r) {
        n.__proto__ = r;
      } || function (n, r) {
        for (var o in r) {
          if (r.hasOwnProperty(o)) {
            n[o] = r[o];
          }
        }
      };
      xmi = function (n, r) {
        t(n, r);
        function o() {
          this.constructor = n;
        }
        n.prototype = r === null ? Object.create(r) : (o.prototype = r.prototype, new o());
      };
      kmi = Object.assign || function (n) {
        for (var r, o = 1, s = arguments.length; o < s; o++) {
          r = arguments[o];
          for (var i in r) {
            if (Object.prototype.hasOwnProperty.call(r, i)) {
              n[i] = r[i];
            }
          }
        }
        return n;
      };
      Ami = function (n, r) {
        var o = {};
        for (var s in n) {
          if (Object.prototype.hasOwnProperty.call(n, s) && r.indexOf(s) < 0) {
            o[s] = n[s];
          }
        }
        if (n != null && typeof Object.getOwnPropertySymbols === "function") {
          for (var i = 0, s = Object.getOwnPropertySymbols(n); i < s.length; i++) {
            if (r.indexOf(s[i]) < 0 && Object.prototype.propertyIsEnumerable.call(n, s[i])) {
              o[s[i]] = n[s[i]];
            }
          }
        }
        return o;
      };
      Imi = function (n, r, o, s) {
        var i = arguments.length;
        var a = i < 3 ? r : s === null ? s = Object.getOwnPropertyDescriptor(r, o) : s;
        var l;
        if (typeof Reflect === "object" && typeof Reflect.decorate === "function") {
          a = Reflect.decorate(n, r, o, s);
        } else {
          for (var c = n.length - 1; c >= 0; c--) {
            if (l = n[c]) {
              a = (i < 3 ? l(a) : i > 3 ? l(r, o, a) : l(r, o)) || a;
            }
          }
        }
        i > 3 && a && Object.defineProperty(r, o, a);
        return a;
      };
      Pmi = function (n, r) {
        return function (o, s) {
          r(o, s, n);
        };
      };
      Omi = function (n, r) {
        if (typeof Reflect === "object" && typeof Reflect.metadata === "function") {
          return Reflect.metadata(n, r);
        }
      };
      Dmi = function (n, r, o, s) {
        function i(a) {
          return a instanceof o ? a : new o(function (l) {
            l(a);
          });
        }
        return new (o || (o = Promise))(function (a, l) {
          function c(p) {
            try {
              d(s.next(p));
            } catch (m) {
              l(m);
            }
          }
          function u(p) {
            try {
              d(s.throw(p));
            } catch (m) {
              l(m);
            }
          }
          function d(p) {
            p.done ? a(p.value) : i(p.value).then(c, u);
          }
          d((s = s.apply(n, r || [])).next());
        });
      };
      Mmi = function (n, r) {
        var o = {
          label: 0,
          sent: function () {
            if (a[0] & 1) {
              throw a[1];
            }
            return a[1];
          },
          trys: [],
          ops: []
        };
        var s;
        var i;
        var a;
        var l;
        l = {
          next: c(0),
          throw: c(1),
          return: c(2)
        };
        typeof Symbol === "function" && (l[Symbol.iterator] = function () {
          return this;
        });
        return l;
        function c(d) {
          return function (p) {
            return u([d, p]);
          };
        }
        function u(d) {
          if (s) {
            throw TypeError("Generator is already executing.");
          }
          while (o) {
            try {
              if (s = 1, i && (a = d[0] & 2 ? i.return : d[0] ? i.throw || ((a = i.return) && a.call(i), 0) : i.next) && !(a = a.call(i, d[1])).done) {
                return a;
              }
              if (i = 0, a) {
                d = [d[0] & 2, a.value];
              }
              switch (d[0]) {
                case 0:
                case 1:
                  a = d;
                  break;
                case 4:
                  o.label++;
                  return {
                    value: d[1],
                    done: false
                  };
                case 5:
                  o.label++;
                  i = d[1];
                  d = [0];
                  continue;
                case 7:
                  d = o.ops.pop();
                  o.trys.pop();
                  continue;
                default:
                  if ((a = o.trys, !(a = a.length > 0 && a[a.length - 1])) && (d[0] === 6 || d[0] === 2)) {
                    o = 0;
                    continue;
                  }
                  if (d[0] === 3 && (!a || d[1] > a[0] && d[1] < a[3])) {
                    o.label = d[1];
                    break;
                  }
                  if (d[0] === 6 && o.label < a[1]) {
                    o.label = a[1];
                    a = d;
                    break;
                  }
                  if (a && o.label < a[2]) {
                    o.label = a[2];
                    o.ops.push(d);
                    break;
                  }
                  if (a[2]) {
                    o.ops.pop();
                  }
                  o.trys.pop();
                  continue;
              }
              d = r.call(n, o);
            } catch (p) {
              d = [6, p];
              i = 0;
            } finally {
              s = a = 0;
            }
          }
          if (d[0] & 5) {
            throw d[1];
          }
          return {
            value: d[0] ? d[1] : undefined,
            done: true
          };
        }
      };
      Vmi = function (n, r, o, s) {
        if (s === undefined) {
          s = o;
        }
        n[s] = r[o];
      };
      Nmi = function (n, r) {
        for (var o in n) {
          if (o !== "default" && !r.hasOwnProperty(o)) {
            r[o] = n[o];
          }
        }
      };
      DRn = function (n) {
        var r = typeof Symbol === "function" && Symbol.iterator;
        var o = r && n[r];
        var s = 0;
        if (o) {
          return o.call(n);
        }
        if (n && typeof n.length === "number") {
          return {
            next: function () {
              if (n && s >= n.length) {
                n = undefined;
              }
              return {
                value: n && n[s++],
                done: !n
              };
            }
          };
        }
        throw TypeError(r ? "Object is not iterable." : "Symbol.iterator is not defined.");
      };
      SGr = function (n, r) {
        var o = typeof Symbol === "function" && n[Symbol.iterator];
        if (!o) {
          return n;
        }
        var s = o.call(n);
        var i;
        var a = [];
        var l;
        try {
          while ((r === undefined || r-- > 0) && !(i = s.next()).done) {
            a.push(i.value);
          }
        } catch (c) {
          l = {
            error: c
          };
        } finally {
          try {
            if (i && !i.done && (o = s.return)) {
              o.call(s);
            }
          } finally {
            if (l) {
              throw l.error;
            }
          }
        }
        return a;
      };
      Lmi = function () {
        for (var n = [], r = 0; r < arguments.length; r++) {
          n = n.concat(SGr(arguments[r]));
        }
        return n;
      };
      Fmi = function () {
        for (var n = 0, r = 0, o = arguments.length; r < o; r++) {
          n += arguments[r].length;
        }
        for (var s = Array(n), i = 0, r = 0; r < o; r++) {
          for (var a = arguments[r], l = 0, c = a.length; l < c; l++, i++) {
            s[i] = a[l];
          }
        }
        return s;
      };
      Est = function (n) {
        return this instanceof Est ? (this.v = n, this) : new Est(n);
      };
      Umi = function (n, r, o) {
        if (!Symbol.asyncIterator) {
          throw TypeError("Symbol.asyncIterator is not defined.");
        }
        var s = o.apply(n, r || []);
        var i;
        var a = [];
        i = {};
        l("next");
        l("throw");
        l("return");
        i[Symbol.asyncIterator] = function () {
          return this;
        };
        return i;
        function l(f) {
          if (s[f]) {
            i[f] = function (h) {
              return new Promise(function (g, y) {
                a.push([f, h, g, y]) > 1 || c(f, h);
              });
            };
          }
        }
        function c(f, h) {
          try {
            u(s[f](h));
          } catch (g) {
            m(a[0][3], g);
          }
        }
        function u(f) {
          f.value instanceof Est ? Promise.resolve(f.value.v).then(d, p) : m(a[0][2], f);
        }
        function d(f) {
          c("next", f);
        }
        function p(f) {
          c("throw", f);
        }
        function m(f, h) {
          if (f(h), a.shift(), a.length) {
            c(a[0][0], a[0][1]);
          }
        }
      };
      Bmi = function (n) {
        var r;
        var o;
        r = {};
        s("next");
        s("throw", function (i) {
          throw i;
        });
        s("return");
        r[Symbol.iterator] = function () {
          return this;
        };
        return r;
        function s(i, a) {
          r[i] = n[i] ? function (l) {
            return (o = !o) ? {
              value: Est(n[i](l)),
              done: i === "return"
            } : a ? a(l) : l;
          } : a;
        }
      };
      $mi = function (n) {
        if (!Symbol.asyncIterator) {
          throw TypeError("Symbol.asyncIterator is not defined.");
        }
        var r = n[Symbol.asyncIterator];
        var o;
        return r ? r.call(n) : (n = typeof DRn === "function" ? DRn(n) : n[Symbol.iterator](), o = {}, s("next"), s("throw"), s("return"), o[Symbol.asyncIterator] = function () {
          return this;
        }, o);
        function s(a) {
          o[a] = n[a] && function (l) {
            return new Promise(function (c, u) {
              l = n[a](l);
              i(c, u, l.done, l.value);
            });
          };
        }
        function i(a, l, c, u) {
          Promise.resolve(u).then(function (d) {
            a({
              value: d,
              done: c
            });
          }, l);
        }
      };
      Hmi = function (n, r) {
        if (Object.defineProperty) {
          Object.defineProperty(n, "raw", {
            value: r
          });
        } else {
          n.raw = r;
        }
        return n;
      };
      jmi = function (n) {
        if (n && n.__esModule) {
          return n;
        }
        var r = {};
        if (n != null) {
          for (var o in n) {
            if (Object.hasOwnProperty.call(n, o)) {
              r[o] = n[o];
            }
          }
        }
        r.default = n;
        return r;
      };
      qmi = function (n) {
        return n && n.__esModule ? n : {
          default: n
        };
      };
      Wmi = function (n, r) {
        if (!r.vZc(n)) {
          throw TypeError("attempted to get private field on non-instance");
        }
        return r.get(n);
      };
      Gmi = function (n, r, o) {
        if (!r.vZc(n)) {
          throw TypeError("attempted to set private field on non-instance");
        }
        r.set(n, o);
        return o;
      };
      e("__extends", xmi);
      e("__assign", kmi);
      e("__rest", Ami);
      e("__decorate", Imi);
      e("__param", Pmi);
      e("__metadata", Omi);
      e("__awaiter", Dmi);
      e("__generator", Mmi);
      e("__exportStar", Nmi);
      e("__createBinding", Vmi);
      e("__values", DRn);
      e("__read", SGr);
      e("__spread", Lmi);
      e("__spreadArrays", Fmi);
      e("__await", Est);
      e("__asyncGenerator", Umi);
      e("__asyncDelegator", Bmi);
      e("__asyncValues", $mi);
      e("__makeTemplateObject", Hmi);
      e("__importStar", jmi);
      e("__importDefault", qmi);
      e("__classPrivateFieldGet", Wmi);
      e("__classPrivateFieldSet", Gmi);
    });
  });
  var EGr = __commonJS(zY => {
    Object.defineProperty(zY, "__esModule", {
      value: true
    });
    zY.MAX_HASHABLE_LENGTH = zY.INIT = zY.KEY = zY.DIGEST_LENGTH = zY.BLOCK_SIZE = undefined;
    zY.BLOCK_SIZE = 64;
    zY.DIGEST_LENGTH = 32;
    zY.KEY = new Uint32Array([1116352408, 1899447441, 3049323471, 3921009573, 961987163, 1508970993, 2453635748, 2870763221, 3624381080, 310598401, 607225278, 1426881987, 1925078388, 2162078206, 2614888103, 3248222580, 3835390401, 4022224774, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, 2554220882, 2821834349, 2952996808, 3210313671, 3336571891, 3584528711, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, 2177026350, 2456956037, 2730485921, 2820302411, 3259730800, 3345764771, 3516065817, 3600352804, 4094571909, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, 2227730452, 2361852424, 2428436474, 2756734187, 3204031479, 3329325298]);
    zY.INIT = [1779033703, 3144134277, 1013904242, 2773480762, 1359893119, 2600822924, 528734635, 1541459225];
    zY.MAX_HASHABLE_LENGTH = Math.pow(2, 53) - 1;
  });
  var zmi = __commonJS(NRn => {
    Object.defineProperty(NRn, "__esModule", {
      value: true
    });
    NRn.RawSha256 = undefined;
    var KY = EGr();
    var iCd = function () {
      function e() {
        this.state = Int32Array.from(KY.INIT);
        this.temp = new Int32Array(64);
        this.buffer = new Uint8Array(64);
        this.bufferLength = 0;
        this.bytesHashed = 0;
        this.finished = false;
      }
      e.prototype.update = function (t) {
        if (this.finished) {
          throw Error("Attempted to update an already finished hash.");
        }
        var n = 0;
        var r = t.byteLength;
        if (this.bytesHashed += r, this.bytesHashed * 8 > KY.MAX_HASHABLE_LENGTH) {
          throw Error("Cannot hash more than 2^53 - 1 bits");
        }
        while (r > 0) {
          if (this.buffer[this.bufferLength++] = t[n++], r--, this.bufferLength === KY.BLOCK_SIZE) {
            this.hashBuffer();
            this.bufferLength = 0;
          }
        }
      };
      e.prototype.digest = function () {
        if (!this.finished) {
          var t = this.bytesHashed * 8;
          var n = new DataView(this.buffer.buffer, this.buffer.byteOffset, this.buffer.byteLength);
          var r = this.bufferLength;
          if (n.setUint8(this.bufferLength++, 128), r % KY.BLOCK_SIZE >= KY.BLOCK_SIZE - 8) {
            for (var o = this.bufferLength; o < KY.BLOCK_SIZE; o++) {
              n.setUint8(o, 0);
            }
            this.hashBuffer();
            this.bufferLength = 0;
          }
          for (var o = this.bufferLength; o < KY.BLOCK_SIZE - 8; o++) {
            n.setUint8(o, 0);
          }
          n.setUint32(KY.BLOCK_SIZE - 8, Math.floor(t / 4294967296), true);
          n.setUint32(KY.BLOCK_SIZE - 4, t);
          this.hashBuffer();
          this.finished = true;
        }
        var s = new Uint8Array(KY.DIGEST_LENGTH);
        for (var o = 0; o < 8; o++) {
          s[o * 4] = this.state[o] >>> 24 & 255;
          s[o * 4 + 1] = this.state[o] >>> 16 & 255;
          s[o * 4 + 2] = this.state[o] >>> 8 & 255;
          s[o * 4 + 3] = this.state[o] >>> 0 & 255;
        }
        return s;
      };
      e.prototype.hashBuffer = function () {
        var t = this;
        var n = t.buffer;
        var r = t.state;
        var o = r[0];
        var s = r[1];
        var i = r[2];
        var a = r[3];
        var l = r[4];
        var c = r[5];
        var u = r[6];
        var d = r[7];
        for (var p = 0; p < KY.BLOCK_SIZE; p++) {
          if (p < 16) {
            this.temp[p] = (n[p * 4] & 255) << 24 | (n[p * 4 + 1] & 255) << 16 | (n[p * 4 + 2] & 255) << 8 | n[p * 4 + 3] & 255;
          } else {
            var m = this.temp[p - 2];
            var f = (m >>> 17 | m << 15) ^ (m >>> 19 | m << 13) ^ m >>> 10;
            m = this.temp[p - 15];
            var h = (m >>> 7 | m << 25) ^ (m >>> 18 | m << 14) ^ m >>> 3;
            this.temp[p] = (f + this.temp[p - 7] | 0) + (h + this.temp[p - 16] | 0);
          }
          var g = (((l >>> 6 | l << 26) ^ (l >>> 11 | l << 21) ^ (l >>> 25 | l << 7)) + (l & c ^ ~l & u) | 0) + (d + (KY.KEY[p] + this.temp[p] | 0) | 0) | 0;
          var y = ((o >>> 2 | o << 30) ^ (o >>> 13 | o << 19) ^ (o >>> 22 | o << 10)) + (o & s ^ o & i ^ s & i) | 0;
          d = u;
          u = c;
          c = l;
          l = a + g | 0;
          a = i;
          i = s;
          s = o;
          o = g + y | 0;
        }
        r[0] += o;
        r[1] += s;
        r[2] += i;
        r[3] += a;
        r[4] += l;
        r[5] += c;
        r[6] += u;
        r[7] += d;
      };
      return e;
    }();
    NRn.RawSha256 = iCd;
  });
  var Kmi = __commonJS(vst => {
    Object.defineProperty(vst, "__esModule", {
      value: true
    });
    vst.toUtf8 = vst.fromUtf8 = undefined;
    var aCd = e => {
      let t = [];
      for (let n = 0, r = e.length; n < r; n++) {
        let o = e.charCodeAt(n);
        if (o < 128) {
          t.push(o);
        } else if (o < 2048) {
          t.push(o >> 6 | 192, o & 63 | 128);
        } else if (n + 1 < e.length && (o & 64512) === 55296 && (e.charCodeAt(n + 1) & 64512) === 56320) {
          let s = 65536 + ((o & 1023) << 10) + (e.charCodeAt(++n) & 1023);
          t.push(s >> 18 | 240, s >> 12 & 63 | 128, s >> 6 & 63 | 128, s & 63 | 128);
        } else {
          t.push(o >> 12 | 224, o >> 6 & 63 | 128, o & 63 | 128);
        }
      }
      return Uint8Array.from(t);
    };
    vst.fromUtf8 = aCd;
    var lCd = e => {
      let t = "";
      for (let n = 0, r = e.length; n < r; n++) {
        let o = e[n];
        if (o < 128) {
          t += String.fromCharCode(o);
        } else if (192 <= o && o < 224) {
          let s = e[++n];
          t += String.fromCharCode((o & 31) << 6 | s & 63);
        } else if (240 <= o && o < 365) {
          let i = "%" + [o, e[++n], e[++n], e[++n]].map(a => a.toString(16)).join("%");
          t += decodeURIComponent(i);
        } else {
          t += String.fromCharCode((o & 15) << 12 | (e[++n] & 63) << 6 | e[++n] & 63);
        }
      }
      return t;
    };
    vst.toUtf8 = lCd;
  });
  var Ymi = __commonJS(wst => {
    Object.defineProperty(wst, "__esModule", {
      value: true
    });
    wst.toUtf8 = wst.fromUtf8 = undefined;
    function cCd(e) {
      return new TextEncoder().HS(e);
    }
    wst.fromUtf8 = cCd;
    function uCd(e) {
      return new TextDecoder("utf-8").oC(e);
    }
    wst.toUtf8 = uCd;
  });
  var vGr = __commonJS(Cst => {
    Object.defineProperty(Cst, "__esModule", {
      value: true
    });
    Cst.toUtf8 = Cst.fromUtf8 = undefined;
    var Jmi = Kmi();
    var Xmi = Ymi();
    var dCd = e => typeof TextEncoder === "function" ? (0, Xmi.fromUtf8)(e) : (0, Jmi.fromUtf8)(e);
    Cst.fromUtf8 = dCd;
    var pCd = e => typeof TextDecoder === "function" ? (0, Xmi.toUtf8)(e) : (0, Jmi.toUtf8)(e);
    Cst.toUtf8 = pCd;
  });
  var Qmi = __commonJS(LRn => {
    Object.defineProperty(LRn, "__esModule", {
      value: true
    });
    LRn.convertToBuffer = undefined;
    var mCd = vGr();
    var fCd = typeof Buffer < "u" && Buffer.from ? function (e) {
      return Buffer.from(e, "utf8");
    } : mCd.fromUtf8;
    function hCd(e) {
      if (e instanceof Uint8Array) {
        return e;
      }
      if (typeof e === "string") {
        return fCd(e);
      }
      if (ArrayBuffer.isView(e)) {
        return new Uint8Array(e.buffer, e.byteOffset, e.byteLength / Uint8Array.BYTES_PER_ELEMENT);
      }
      return new Uint8Array(e);
    }
    LRn.convertToBuffer = hCd;
  });
  var Zmi = __commonJS(FRn => {
    Object.defineProperty(FRn, "__esModule", {
      value: true
    });
    FRn.isEmptyData = undefined;
    function gCd(e) {
      if (typeof e === "string") {
        return e.length === 0;
      }
      return e.byteLength === 0;
    }
    FRn.isEmptyData = gCd;
  });
  var efi = __commonJS(URn => {
    Object.defineProperty(URn, "__esModule", {
      value: true
    });
    URn.numToUint8 = undefined;
    function yCd(e) {
      return new Uint8Array([(e & 4278190080) >> 24, (e & 16711680) >> 16, (e & 65280) >> 8, e & 255]);
    }
    URn.numToUint8 = yCd;
  });
  var tfi = __commonJS(BRn => {
    Object.defineProperty(BRn, "__esModule", {
      value: true
    });
    BRn.uint32ArrayFrom = undefined;
    function _Cd(e) {
      if (!Uint32Array.from) {
        var t = new Uint32Array(e.length);
        var n = 0;
        while (n < e.length) {
          t[n] = e[n];
          n += 1;
        }
        return t;
      }
      return Uint32Array.from(e);
    }
    BRn.uint32ArrayFrom = _Cd;
  });
  var nfi = __commonJS(ece => {
    Object.defineProperty(ece, "__esModule", {
      value: true
    });
    ece.uint32ArrayFrom = ece.numToUint8 = ece.isEmptyData = ece.convertToBuffer = undefined;
    var bCd = Qmi();
    Object.defineProperty(ece, "convertToBuffer", {
      enumerable: true,
      get: function () {
        return bCd.convertToBuffer;
      }
    });
    var SCd = Zmi();
    Object.defineProperty(ece, "isEmptyData", {
      enumerable: true,
      get: function () {
        return SCd.isEmptyData;
      }
    });
    var TCd = efi();
    Object.defineProperty(ece, "numToUint8", {
      enumerable: true,
      get: function () {
        return TCd.numToUint8;
      }
    });
    var ECd = tfi();
    Object.defineProperty(ece, "uint32ArrayFrom", {
      enumerable: true,
      get: function () {
        return ECd.uint32ArrayFrom;
      }
    });
  });
  var ofi = __commonJS(jRn => {
    Object.defineProperty(jRn, "__esModule", {
      value: true
    });
    jRn.Sha256 = undefined;
    var rfi = TGr();
    var HRn = EGr();
    var $Rn = zmi();
    var wGr = nfi();
    var vCd = function () {
      function e(t) {
        this.secret = t;
        this.hash = new $Rn.RawSha256();
        this.reset();
      }
      e.prototype.update = function (t) {
        if ((0, wGr.isEmptyData)(t) || this.error) {
          return;
        }
        try {
          this.hash.update((0, wGr.convertToBuffer)(t));
        } catch (n) {
          this.error = n;
        }
      };
      e.prototype.digestSync = function () {
        if (this.error) {
          throw this.error;
        }
        if (this.outer) {
          if (!this.outer.finished) {
            this.outer.update(this.hash.digest());
          }
          return this.outer.digest();
        }
        return this.hash.digest();
      };
      e.prototype.digest = function () {
        return rfi.__awaiter(this, undefined, undefined, function () {
          return rfi.__generator(this, function (t) {
            return [2, this.digestSync()];
          });
        });
      };
      e.prototype.reset = function () {
        if (this.hash = new $Rn.RawSha256(), this.secret) {
          this.outer = new $Rn.RawSha256();
          var t = wCd(this.secret);
          var n = new Uint8Array(HRn.BLOCK_SIZE);
          n.set(t);
          for (var r = 0; r < HRn.BLOCK_SIZE; r++) {
            t[r] ^= 54;
            n[r] ^= 92;
          }
          this.hash.update(t);
          this.outer.update(n);
          for (var r = 0; r < t.byteLength; r++) {
            t[r] = 0;
          }
        }
      };
      return e;
    }();
    jRn.Sha256 = vCd;
    function wCd(e) {
      var t = (0, wGr.convertToBuffer)(e);
      if (t.byteLength > HRn.BLOCK_SIZE) {
        var n = new $Rn.RawSha256();
        n.update(t);
        t = n.digest();
      }
      var r = new Uint8Array(HRn.BLOCK_SIZE);
      r.set(t);
      return r;
    }
  });
  var qRn = __commonJS(CGr => {
    Object.defineProperty(CGr, "__esModule", {
      value: true
    });
    var CCd = TGr();
    CCd.__exportStar(ofi(), CGr);
  });