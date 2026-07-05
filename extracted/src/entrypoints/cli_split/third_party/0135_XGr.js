  var XGr = __commonJS((Vxg, txn) => {
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
    var uyi;
    var dyi;
    var pyi;
    var myi;
    var fyi;
    var hyi;
    var gyi;
    var yyi;
    var _yi;
    var exn;
    var JGr;
    var byi;
    var Syi;
    var xst;
    var Tyi;
    var Eyi;
    var vyi;
    var wyi;
    var Cyi;
    var Ryi;
    var xyi;
    var kyi;
    var Ayi;
    (function (e) {
      var t = typeof global === "object" ? global : typeof self === "object" ? self : typeof this === "object" ? this : {};
      if (typeof define === "function" && define.amd) {
        define("tslib", ["exports"], function (r) {
          e(n(t, n(r)));
        });
      } else if (typeof txn === "object" && typeof txn.exports === "object") {
        e(n(t, n(txn.exports)));
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
      uyi = function (n, r) {
        t(n, r);
        function o() {
          this.constructor = n;
        }
        n.prototype = r === null ? Object.create(r) : (o.prototype = r.prototype, new o());
      };
      dyi = Object.assign || function (n) {
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
      pyi = function (n, r) {
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
      myi = function (n, r, o, s) {
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
      fyi = function (n, r) {
        return function (o, s) {
          r(o, s, n);
        };
      };
      hyi = function (n, r) {
        if (typeof Reflect === "object" && typeof Reflect.metadata === "function") {
          return Reflect.metadata(n, r);
        }
      };
      gyi = function (n, r, o, s) {
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
      yyi = function (n, r) {
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
      Ayi = function (n, r, o, s) {
        if (s === undefined) {
          s = o;
        }
        n[s] = r[o];
      };
      _yi = function (n, r) {
        for (var o in n) {
          if (o !== "default" && !r.hasOwnProperty(o)) {
            r[o] = n[o];
          }
        }
      };
      exn = function (n) {
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
      JGr = function (n, r) {
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
      byi = function () {
        for (var n = [], r = 0; r < arguments.length; r++) {
          n = n.concat(JGr(arguments[r]));
        }
        return n;
      };
      Syi = function () {
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
      xst = function (n) {
        return this instanceof xst ? (this.v = n, this) : new xst(n);
      };
      Tyi = function (n, r, o) {
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
          f.value instanceof xst ? Promise.resolve(f.value.v).then(d, p) : m(a[0][2], f);
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
      Eyi = function (n) {
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
              value: xst(n[i](l)),
              done: i === "return"
            } : a ? a(l) : l;
          } : a;
        }
      };
      vyi = function (n) {
        if (!Symbol.asyncIterator) {
          throw TypeError("Symbol.asyncIterator is not defined.");
        }
        var r = n[Symbol.asyncIterator];
        var o;
        return r ? r.call(n) : (n = typeof exn === "function" ? exn(n) : n[Symbol.iterator](), o = {}, s("next"), s("throw"), s("return"), o[Symbol.asyncIterator] = function () {
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
      wyi = function (n, r) {
        if (Object.defineProperty) {
          Object.defineProperty(n, "raw", {
            value: r
          });
        } else {
          n.raw = r;
        }
        return n;
      };
      Cyi = function (n) {
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
      Ryi = function (n) {
        return n && n.__esModule ? n : {
          default: n
        };
      };
      xyi = function (n, r) {
        if (!r.vZc(n)) {
          throw TypeError("attempted to get private field on non-instance");
        }
        return r.get(n);
      };
      kyi = function (n, r, o) {
        if (!r.vZc(n)) {
          throw TypeError("attempted to set private field on non-instance");
        }
        r.set(n, o);
        return o;
      };
      e("__extends", uyi);
      e("__assign", dyi);
      e("__rest", pyi);
      e("__decorate", myi);
      e("__param", fyi);
      e("__metadata", hyi);
      e("__awaiter", gyi);
      e("__generator", yyi);
      e("__exportStar", _yi);
      e("__createBinding", Ayi);
      e("__values", exn);
      e("__read", JGr);
      e("__spread", byi);
      e("__spreadArrays", Syi);
      e("__await", xst);
      e("__asyncGenerator", Tyi);
      e("__asyncDelegator", Eyi);
      e("__asyncValues", vyi);
      e("__makeTemplateObject", wyi);
      e("__importStar", Cyi);
      e("__importDefault", Ryi);
      e("__classPrivateFieldGet", xyi);
      e("__classPrivateFieldSet", kyi);
    });
  });
  var Iyi = __commonJS(nxn => {
    Object.defineProperty(nxn, "__esModule", {
      value: true
    });
    nxn.convertToBuffer = undefined;
    var OCd = vGr();
    var DCd = typeof Buffer < "u" && Buffer.from ? function (e) {
      return Buffer.from(e, "utf8");
    } : OCd.fromUtf8;
    function MCd(e) {
      if (e instanceof Uint8Array) {
        return e;
      }
      if (typeof e === "string") {
        return DCd(e);
      }
      if (ArrayBuffer.isView(e)) {
        return new Uint8Array(e.buffer, e.byteOffset, e.byteLength / Uint8Array.BYTES_PER_ELEMENT);
      }
      return new Uint8Array(e);
    }
    nxn.convertToBuffer = MCd;
  });
  var Pyi = __commonJS(rxn => {
    Object.defineProperty(rxn, "__esModule", {
      value: true
    });
    rxn.isEmptyData = undefined;
    function NCd(e) {
      if (typeof e === "string") {
        return e.length === 0;
      }
      return e.byteLength === 0;
    }
    rxn.isEmptyData = NCd;
  });
  var Oyi = __commonJS(oxn => {
    Object.defineProperty(oxn, "__esModule", {
      value: true
    });
    oxn.numToUint8 = undefined;
    function LCd(e) {
      return new Uint8Array([(e & 4278190080) >> 24, (e & 16711680) >> 16, (e & 65280) >> 8, e & 255]);
    }
    oxn.numToUint8 = LCd;
  });
  var Dyi = __commonJS(sxn => {
    Object.defineProperty(sxn, "__esModule", {
      value: true
    });
    sxn.uint32ArrayFrom = undefined;
    function FCd(e) {
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
    sxn.uint32ArrayFrom = FCd;
  });
  var QGr = __commonJS(tce => {
    Object.defineProperty(tce, "__esModule", {
      value: true
    });
    tce.uint32ArrayFrom = tce.numToUint8 = tce.isEmptyData = tce.convertToBuffer = undefined;
    var UCd = Iyi();
    Object.defineProperty(tce, "convertToBuffer", {
      enumerable: true,
      get: function () {
        return UCd.convertToBuffer;
      }
    });
    var BCd = Pyi();
    Object.defineProperty(tce, "isEmptyData", {
      enumerable: true,
      get: function () {
        return BCd.isEmptyData;
      }
    });
    var $Cd = Oyi();
    Object.defineProperty(tce, "numToUint8", {
      enumerable: true,
      get: function () {
        return $Cd.numToUint8;
      }
    });
    var HCd = Dyi();
    Object.defineProperty(tce, "uint32ArrayFrom", {
      enumerable: true,
      get: function () {
        return HCd.uint32ArrayFrom;
      }
    });
  });
  var Lyi = __commonJS(ixn => {
    Object.defineProperty(ixn, "__esModule", {
      value: true
    });
    ixn.AwsCrc32 = undefined;
    var Myi = XGr();
    var ZGr = QGr();
    var Nyi = axn();
    var jCd = function () {
      function e() {
        this.crc32 = new Nyi.Crc32();
      }
      e.prototype.update = function (t) {
        if ((0, ZGr.isEmptyData)(t)) {
          return;
        }
        this.crc32.update((0, ZGr.convertToBuffer)(t));
      };
      e.prototype.digest = function () {
        return Myi.__awaiter(this, undefined, undefined, function () {
          return Myi.__generator(this, function (t) {
            return [2, (0, ZGr.numToUint8)(this.crc32.digest())];
          });
        });
      };
      e.prototype.reset = function () {
        this.crc32 = new Nyi.Crc32();
      };
      return e;
    }();
    ixn.AwsCrc32 = jCd;
  });
  var axn = __commonJS(w0e => {
    Object.defineProperty(w0e, "__esModule", {
      value: true
    });
    w0e.AwsCrc32 = w0e.Crc32 = w0e.crc32 = undefined;
    var qCd = XGr();
    var WCd = QGr();
    function GCd(e) {
      return new Fyi().update(e).digest();
    }
    w0e.crc32 = GCd;
    var Fyi = function () {
      function e() {
        this.checksum = 4294967295;
      }
      e.prototype.update = function (t) {
        var n;
        var r;
        try {
          for (var o = qCd.__values(t), s = o.next(); !s.done; s = o.next()) {
            var i = s.value;
            this.checksum = this.checksum >>> 8 ^ zCd[(this.checksum ^ i) & 255];
          }
        } catch (a) {
          n = {
            error: a
          };
        } finally {
          try {
            if (s && !s.done && (r = o.return)) {
              r.call(o);
            }
          } finally {
            if (n) {
              throw n.error;
            }
          }
        }
        return this;
      };
      e.prototype.digest = function () {
        return (this.checksum ^ 4294967295) >>> 0;
      };
      return e;
    }();
    w0e.Crc32 = Fyi;
    var VCd = [0, 1996959894, 3993919788, 2567524794, 124634137, 1886057615, 3915621685, 2657392035, 249268274, 2044508324, 3772115230, 2547177864, 162941995, 2125561021, 3887607047, 2428444049, 498536548, 1789927666, 4089016648, 2227061214, 450548861, 1843258603, 4107580753, 2211677639, 325883990, 1684777152, 4251122042, 2321926636, 335633487, 1661365465, 4195302755, 2366115317, 997073096, 1281953886, 3579855332, 2724688242, 1006888145, 1258607687, 3524101629, 2768942443, 901097722, 1119000684, 3686517206, 2898065728, 853044451, 1172266101, 3705015759, 2882616665, 651767980, 1373503546, 3369554304, 3218104598, 565507253, 1454621731, 3485111705, 3099436303, 671266974, 1594198024, 3322730930, 2970347812, 795835527, 1483230225, 3244367275, 3060149565, 1994146192, 31158534, 2563907772, 4023717930, 1907459465, 112637215, 2680153253, 3904427059, 2013776290, 251722036, 2517215374, 3775830040, 2137656763, 141376813, 2439277719, 3865271297, 1802195444, 476864866, 2238001368, 4066508878, 1812370925, 453092731, 2181625025, 4111451223, 1706088902, 314042704, 2344532202, 4240017532, 1658658271, 366619977, 2362670323, 4224994405, 1303535960, 984961486, 2747007092, 3569037538, 1256170817, 1037604311, 2765210733, 3554079995, 1131014506, 879679996, 2909243462, 3663771856, 1141124467, 855842277, 2852801631, 3708648649, 1342533948, 654459306, 3188396048, 3373015174, 1466479909, 544179635, 3110523913, 3462522015, 1591671054, 702138776, 2966460450, 3352799412, 1504918807, 783551873, 3082640443, 3233442989, 3988292384, 2596254646, 62317068, 1957810842, 3939845945, 2647816111, 81470997, 1943803523, 3814918930, 2489596804, 225274430, 2053790376, 3826175755, 2466906013, 167816743, 2097651377, 4027552580, 2265490386, 503444072, 1762050814, 4150417245, 2154129355, 426522225, 1852507879, 4275313526, 2312317920, 282753626, 1742555852, 4189708143, 2394877945, 397917763, 1622183637, 3604390888, 2714866558, 953729732, 1340076626, 3518719985, 2797360999, 1068828381, 1219638859, 3624741850, 2936675148, 906185462, 1090812512, 3747672003, 2825379669, 829329135, 1181335161, 3412177804, 3160834842, 628085408, 1382605366, 3423369109, 3138078467, 570562233, 1426400815, 3317316542, 2998733608, 733239954, 1555261956, 3268935591, 3050360625, 752459403, 1541320221, 2607071920, 3965973030, 1969922972, 40735498, 2617837225, 3943577151, 1913087877, 83908371, 2512341634, 3803740692, 2075208622, 213261112, 2463272603, 3855990285, 2094854071, 198958881, 2262029012, 4057260610, 1759359992, 534414190, 2176718541, 4139329115, 1873836001, 414664567, 2282248934, 4279200368, 1711684554, 285281116, 2405801727, 4167216745, 1634467795, 376229701, 2685067896, 3608007406, 1308918612, 956543938, 2808555105, 3495958263, 1231636301, 1047427035, 2932959818, 3654703836, 1088359270, 936918000, 2847714899, 3736837829, 1202900863, 817233897, 3183342108, 3401237130, 1404277552, 615818150, 3134207493, 3453421203, 1423857449, 601450431, 3009837614, 3294710456, 1567103746, 711928724, 3020668471, 3272380065, 1510334235, 755167117];
    var zCd = (0, WCd.uint32ArrayFrom)(VCd);
    var KCd = Lyi();
    Object.defineProperty(w0e, "AwsCrc32", {
      enumerable: true,
      get: function () {
        return KCd.AwsCrc32;
      }
    });
  });