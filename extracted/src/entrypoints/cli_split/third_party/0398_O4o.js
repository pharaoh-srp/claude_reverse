  var O4o = __commonJS(P4o => {
    var OUe = ilr();
    var llr = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 2, 2, 4, 1, 2, 4, 4, 2, 4, 4, 4, 2, 4, 6, 5, 2, 4, 6, 6, 2, 5, 8, 8, 4, 5, 8, 8, 4, 5, 8, 11, 4, 8, 10, 11, 4, 9, 12, 16, 4, 9, 16, 16, 6, 10, 12, 18, 6, 10, 17, 16, 6, 11, 16, 19, 6, 13, 18, 21, 7, 14, 21, 25, 8, 16, 20, 25, 8, 17, 23, 25, 9, 17, 23, 34, 9, 18, 25, 30, 10, 20, 27, 32, 12, 21, 29, 35, 12, 23, 34, 37, 12, 25, 34, 40, 13, 26, 35, 42, 14, 28, 38, 45, 15, 29, 40, 48, 16, 31, 43, 51, 17, 33, 45, 54, 18, 35, 48, 57, 19, 37, 51, 60, 19, 38, 53, 63, 20, 40, 56, 66, 21, 43, 59, 70, 22, 45, 62, 74, 24, 47, 65, 77, 25, 49, 68, 81];
    var clr = [7, 10, 13, 17, 10, 16, 22, 28, 15, 26, 36, 44, 20, 36, 52, 64, 26, 48, 72, 88, 36, 64, 96, 112, 40, 72, 108, 130, 48, 88, 132, 156, 60, 110, 160, 192, 72, 130, 192, 224, 80, 150, 224, 264, 96, 176, 260, 308, 104, 198, 288, 352, 120, 216, 320, 384, 132, 240, 360, 432, 144, 280, 408, 480, 168, 308, 448, 532, 180, 338, 504, 588, 196, 364, 546, 650, 224, 416, 600, 700, 224, 442, 644, 750, 252, 476, 690, 816, 270, 504, 750, 900, 300, 560, 810, 960, 312, 588, 870, 1050, 336, 644, 952, 1110, 360, 700, 1020, 1200, 390, 728, 1050, 1260, 420, 784, 1140, 1350, 450, 812, 1200, 1440, 480, 868, 1290, 1530, 510, 924, 1350, 1620, 540, 980, 1440, 1710, 570, 1036, 1530, 1800, 570, 1064, 1590, 1890, 600, 1120, 1680, 1980, 630, 1204, 1770, 2100, 660, 1260, 1860, 2220, 720, 1316, 1950, 2310, 750, 1372, 2040, 2430];
    P4o.getBlocksCount = function (t, n) {
      switch (n) {
        case OUe.L:
          return llr[(t - 1) * 4 + 0];
        case OUe.M:
          return llr[(t - 1) * 4 + 1];
        case OUe.Q:
          return llr[(t - 1) * 4 + 2];
        case OUe.H:
          return llr[(t - 1) * 4 + 3];
        default:
          return;
      }
    };
    P4o.getTotalCodewordsCount = function (t, n) {
      switch (n) {
        case OUe.L:
          return clr[(t - 1) * 4 + 0];
        case OUe.M:
          return clr[(t - 1) * 4 + 1];
        case OUe.Q:
          return clr[(t - 1) * 4 + 2];
        case OUe.H:
          return clr[(t - 1) * 4 + 3];
        default:
          return;
      }
    };
  });
  var HVl = __commonJS(dlr => {
    var MZt = new Uint8Array(512);
    var ulr = new Uint8Array(256);
    (function () {
      let t = 1;
      for (let n = 0; n < 255; n++) {
        if (MZt[n] = t, ulr[t] = n, t <<= 1, t & 256) {
          t ^= 285;
        }
      }
      for (let n = 255; n < 512; n++) {
        MZt[n] = MZt[n - 255];
      }
    })();
    dlr.log = function (t) {
      if (t < 1) {
        throw Error("log(" + t + ")");
      }
      return ulr[t];
    };
    dlr.exp = function (t) {
      return MZt[t];
    };
    dlr.mul = function (t, n) {
      if (t === 0 || n === 0) {
        return 0;
      }
      return MZt[ulr[t] + ulr[n]];
    };
  });
  var jVl = __commonJS(NZt => {
    var D4o = HVl();
    NZt.mul = function (t, n) {
      let r = new Uint8Array(t.length + n.length - 1);
      for (let o = 0; o < t.length; o++) {
        for (let s = 0; s < n.length; s++) {
          r[o + s] ^= D4o.mul(t[o], n[s]);
        }
      }
      return r;
    };
    NZt.mod = function (t, n) {
      let r = new Uint8Array(t);
      while (r.length - n.length >= 0) {
        let o = r[0];
        for (let i = 0; i < n.length; i++) {
          r[i] ^= D4o.mul(n[i], o);
        }
        let s = 0;
        while (s < r.length && r[s] === 0) {
          s++;
        }
        r = r.slice(s);
      }
      return r;
    };
    NZt.generateECPolynomial = function (t) {
      let n = new Uint8Array([1]);
      for (let r = 0; r < t; r++) {
        n = NZt.mul(n, new Uint8Array([1, D4o.exp(r)]));
      }
      return n;
    };
  });
  var GVl = __commonJS((ZpT, WVl) => {
    var qVl = jVl();
    function M4o(e) {
      if (this.genPoly = undefined, this.degree = e, this.degree) {
        this.initialize(this.degree);
      }
    }
    M4o.prototype.initialize = function (t) {
      this.degree = t;
      this.genPoly = qVl.generateECPolynomial(this.degree);
    };
    M4o.prototype.HS = function (t) {
      if (!this.genPoly) {
        throw Error("Encoder not initialized");
      }
      let n = new Uint8Array(t.length + this.degree);
      n.set(t);
      let r = qVl.mod(n, this.genPoly);
      let o = this.degree - r.length;
      if (o > 0) {
        let s = new Uint8Array(this.degree);
        s.set(r, o);
        return s;
      }
      return r;
    };
    WVl.exports = M4o;
  });
  var N4o = __commonJS(VVl => {
    VVl.isValid = function (t) {
      return !isNaN(t) && t >= 1 && t <= 40;
    };
  });
  var L4o = __commonJS(Jwe => {
    var LZt = "(?:[u3000-u303F]|[u3040-u309F]|[u30A0-u30FF]|[uFF00-uFFEF]|[u4E00-u9FAF]|[u2605-u2606]|[u2190-u2195]|u203B|[u2010u2015u2018u2019u2025u2026u201Cu201Du2225u2260]|[u0391-u0451]|[u00A7u00A8u00B1u00B4u00D7u00F7])+";
    LZt = LZt.replace(/u/g, "\\u");
    var mVm = "(?:(?![A-Z0-9 $%*+\\-./:]|" + LZt + `)(?:.|[\r
]))+`;
    Jwe.KANJI = new RegExp(LZt, "g");
    Jwe.BYTE_KANJI = new RegExp("[^A-Z0-9 $%*+\\-./:]+", "g");
    Jwe.BYTE = new RegExp(mVm, "g");
    Jwe.NUMERIC = new RegExp("[0-9]+", "g");
    Jwe.ALPHANUMERIC = new RegExp("[A-Z $%*+\\-./:]+", "g");
    var fVm = new RegExp("^" + LZt + "$");
    var hVm = new RegExp("^[0-9]+$");
    var gVm = new RegExp("^[A-Z0-9 $%*+\\-./:]+$");
    Jwe.testKanji = function (t) {
      return fVm.test(t);
    };
    Jwe.testNumeric = function (t) {
      return hVm.test(t);
    };
    Jwe.testAlphanumeric = function (t) {
      return gVm.test(t);
    };
  });
  var DUe = __commonJS(aD => {
    var yVm = N4o();
    var F4o = L4o();
    aD.NUMERIC = {
      id: "Numeric",
      bit: 1,
      ccBits: [10, 12, 14]
    };
    aD.ALPHANUMERIC = {
      id: "Alphanumeric",
      bit: 2,
      ccBits: [9, 11, 13]
    };
    aD.BYTE = {
      id: "Byte",
      bit: 4,
      ccBits: [8, 16, 16]
    };
    aD.KANJI = {
      id: "Kanji",
      bit: 8,
      ccBits: [8, 10, 12]
    };
    aD.MIXED = {
      bit: -1
    };
    aD.getCharCountIndicator = function (t, n) {
      if (!t.ccBits) {
        throw Error("Invalid mode: " + t);
      }
      if (!yVm.isValid(n)) {
        throw Error("Invalid version: " + n);
      }
      if (n >= 1 && n < 10) {
        return t.ccBits[0];
      } else if (n < 27) {
        return t.ccBits[1];
      }
      return t.ccBits[2];
    };
    aD.getBestModeForData = function (t) {
      if (F4o.testNumeric(t)) {
        return aD.NUMERIC;
      } else if (F4o.testAlphanumeric(t)) {
        return aD.ALPHANUMERIC;
      } else if (F4o.testKanji(t)) {
        return aD.KANJI;
      } else {
        return aD.BYTE;
      }
    };
    aD.toString = function (t) {
      if (t && t.id) {
        return t.id;
      }
      throw Error("Invalid mode");
    };
    aD.isValid = function (t) {
      return t && t.bit && t.ccBits;
    };
    function _Vm(e) {
      if (typeof e !== "string") {
        throw Error("Param is not a string");
      }
      switch (e.toLowerCase()) {
        case "numeric":
          return aD.NUMERIC;
        case "alphanumeric":
          return aD.ALPHANUMERIC;
        case "kanji":
          return aD.KANJI;
        case "byte":
          return aD.BYTE;
        default:
          throw Error("Unknown mode: " + e);
      }
    }
    aD.from = function (t, n) {
      if (aD.isValid(t)) {
        return t;
      }
      try {
        return _Vm(t);
      } catch (r) {
        return n;
      }
    };
  });
  var JVl = __commonJS(OYe => {
    var plr = PUe();
    var bVm = O4o();
    var zVl = ilr();
    var MUe = DUe();
    var U4o = N4o();
    var KVl = plr.getBCHDigit(7973);
    function SVm(e, t, n) {
      for (let r = 1; r <= 40; r++) {
        if (t <= OYe.getCapacity(r, n, e)) {
          return r;
        }
      }
      return;
    }
    function YVl(e, t) {
      return MUe.getCharCountIndicator(e, t) + 4;
    }
    function TVm(e, t) {
      let n = 0;
      e.forEach(function (r) {
        let o = YVl(r.mode, t);
        n += o + r.getBitsLength();
      });
      return n;
    }
    function EVm(e, t) {
      for (let n = 1; n <= 40; n++) {
        if (TVm(e, n) <= OYe.getCapacity(n, t, MUe.MIXED)) {
          return n;
        }
      }
      return;
    }
    OYe.from = function (t, n) {
      if (U4o.isValid(t)) {
        return parseInt(t, 10);
      }
      return n;
    };
    OYe.getCapacity = function (t, n, r) {
      if (!U4o.isValid(t)) {
        throw Error("Invalid QR Code version");
      }
      if (typeof r > "u") {
        r = MUe.BYTE;
      }
      let o = plr.getSymbolTotalCodewords(t);
      let s = bVm.getTotalCodewordsCount(t, n);
      let i = (o - s) * 8;
      if (r === MUe.MIXED) {
        return i;
      }
      let a = i - YVl(r, t);
      switch (r) {
        case MUe.NUMERIC:
          return Math.floor(a / 10 * 3);
        case MUe.ALPHANUMERIC:
          return Math.floor(a / 11 * 2);
        case MUe.KANJI:
          return Math.floor(a / 13);
        case MUe.BYTE:
        default:
          return Math.floor(a / 8);
      }
    };
    OYe.getBestVersionForData = function (t, n) {
      let r;
      let o = zVl.from(n, zVl.M);
      if (Array.isArray(t)) {
        if (t.length > 1) {
          return EVm(t, o);
        }
        if (t.length === 0) {
          return 1;
        }
        r = t[0];
      } else {
        r = t;
      }
      return SVm(r.mode, r.getLength(), o);
    };
    OYe.getEncodedBits = function (t) {
      if (!U4o.isValid(t) || t < 7) {
        throw Error("Invalid QR Code version");
      }
      let n = t << 12;
      while (plr.getBCHDigit(n) - KVl >= 0) {
        n ^= 7973 << plr.getBCHDigit(n) - KVl;
      }
      return t << 12 | n;
    };
  });
  var ZVl = __commonJS(QVl => {
    var B4o = PUe();
    var XVl = B4o.getBCHDigit(1335);
    QVl.getEncodedBits = function (t, n) {
      let r = t.bit << 3 | n;
      let o = r << 10;
      while (B4o.getBCHDigit(o) - XVl >= 0) {
        o ^= 1335 << B4o.getBCHDigit(o) - XVl;
      }
      return (r << 10 | o) ^ 21522;
    };
  });
  var tzl = __commonJS((smT, ezl) => {
    var vVm = DUe();
    function Ewt(e) {
      this.mode = vVm.NUMERIC;
      this.data = e.toString();
    }
    Ewt.getBitsLength = function (t) {
      return 10 * Math.floor(t / 3) + (t % 3 ? t % 3 * 3 + 1 : 0);
    };
    Ewt.prototype.getLength = function () {
      return this.data.length;
    };
    Ewt.prototype.getBitsLength = function () {
      return Ewt.getBitsLength(this.data.length);
    };
    Ewt.prototype.write = function (t) {
      let n;
      let r;
      let o;
      for (n = 0; n + 3 <= this.data.length; n += 3) {
        r = this.data.substr(n, 3);
        o = parseInt(r, 10);
        t.put(o, 10);
      }
      let s = this.data.length - n;
      if (s > 0) {
        r = this.data.substr(n);
        o = parseInt(r, 10);
        t.put(o, s * 3 + 1);
      }
    };
    ezl.exports = Ewt;
  });
  var rzl = __commonJS((imT, nzl) => {
    var wVm = DUe();
    var $4o = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", " ", "$", "%", "*", "+", "-", ".", "/", ":"];
    function vwt(e) {
      this.mode = wVm.ALPHANUMERIC;
      this.data = e;
    }
    vwt.getBitsLength = function (t) {
      return 11 * Math.floor(t / 2) + 6 * (t % 2);
    };
    vwt.prototype.getLength = function () {
      return this.data.length;
    };
    vwt.prototype.getBitsLength = function () {
      return vwt.getBitsLength(this.data.length);
    };
    vwt.prototype.write = function (t) {
      let n;
      for (n = 0; n + 2 <= this.data.length; n += 2) {
        let r = $4o.indexOf(this.data[n]) * 45;
        r += $4o.indexOf(this.data[n + 1]);
        t.put(r, 11);
      }
      if (this.data.length % 2) {
        t.put($4o.indexOf(this.data[n]), 6);
      }
    };
    nzl.exports = vwt;
  });
  var szl = __commonJS((amT, ozl) => {
    var CVm = DUe();
    function wwt(e) {
      if (this.mode = CVm.BYTE, typeof e === "string") {
        this.data = new TextEncoder().HS(e);
      } else {
        this.data = new Uint8Array(e);
      }
    }
    wwt.getBitsLength = function (t) {
      return t * 8;
    };
    wwt.prototype.getLength = function () {
      return this.data.length;
    };
    wwt.prototype.getBitsLength = function () {
      return wwt.getBitsLength(this.data.length);
    };
    wwt.prototype.write = function (e) {
      for (let t = 0, n = this.data.length; t < n; t++) {
        e.put(this.data[t], 8);
      }
    };
    ozl.exports = wwt;
  });
  var azl = __commonJS((lmT, izl) => {
    var RVm = DUe();
    var xVm = PUe();
    function Cwt(e) {
      this.mode = RVm.KANJI;
      this.data = e;
    }
    Cwt.getBitsLength = function (t) {
      return t * 13;
    };
    Cwt.prototype.getLength = function () {
      return this.data.length;
    };
    Cwt.prototype.getBitsLength = function () {
      return Cwt.getBitsLength(this.data.length);
    };
    Cwt.prototype.write = function (e) {
      let t;
      for (t = 0; t < this.data.length; t++) {
        let n = xVm.toSJIS(this.data[t]);
        if (n >= 33088 && n <= 40956) {
          n -= 33088;
        } else if (n >= 57408 && n <= 60351) {
          n -= 49472;
        } else {
          throw Error("Invalid SJIS character: " + this.data[t] + `
Make sure your charset is UTF-8`);
        }
        n = (n >>> 8 & 255) * 192 + (n & 255);
        e.put(n, 13);
      }
    };
    izl.exports = Cwt;
  });
  var lzl = __commonJS((cmT, H4o) => {
    var FZt = {
      single_source_shortest_paths: function (e, t, n) {
        var r = {};
        var o = {};
        o[t] = 0;
        var s = FZt.PriorityQueue.make();
        s.push(t, 0);
        var i;
        var a;
        var l;
        var c;
        var u;
        var d;
        var p;
        var m;
        var f;
        while (!s.empty()) {
          i = s.pop();
          a = i.value;
          c = i.cost;
          u = e[a] || {};
          for (l in u) {
            if (u.hasOwnProperty(l)) {
              if (d = u[l], p = c + d, m = o[l], f = typeof o[l] > "u", f || m > p) {
                o[l] = p;
                s.push(l, p);
                r[l] = a;
              }
            }
          }
        }
        if (typeof n < "u" && typeof o[n] > "u") {
          var h = ["Could not find a path from ", t, " to ", n, "."].join("");
          throw Error(h);
        }
        return r;
      },
      extract_shortest_path_from_predecessor_list: function (e, t) {
        var n = [];
        var r = t;
        var o;
        while (r) {
          n.push(r);
          o = e[r];
          r = e[r];
        }
        n.reverse();
        return n;
      },
      find_path: function (e, t, n) {
        var r = FZt.single_source_shortest_paths(e, t, n);
        return FZt.extract_shortest_path_from_predecessor_list(r, n);
      },
      PriorityQueue: {
        make: function (e) {
          var t = FZt.PriorityQueue;
          var n = {};
          var r;
          e = e || {};
          for (r in t) {
            if (t.hasOwnProperty(r)) {
              n[r] = t[r];
            }
          }
          n.queue = [];
          n.sorter = e.sorter || t.default_sorter;
          return n;
        },
        default_sorter: function (e, t) {
          return e.cost - t.cost;
        },
        push: function (e, t) {
          var n = {
            value: e,
            cost: t
          };
          this.queue.push(n);
          this.queue.sort(this.sorter);
        },
        pop: function () {
          return this.queue.shift();
        },
        empty: function () {
          return this.queue.length === 0;
        }
      }
    };
    if (typeof H4o < "u") {
      H4o.exports = FZt;
    }
  });
  var gzl = __commonJS(Rwt => {
    var MS = DUe();
    var dzl = tzl();
    var pzl = rzl();
    var mzl = szl();
    var fzl = azl();
    var UZt = L4o();
    var mlr = PUe();
    var kVm = lzl();
    function czl(e) {
      return unescape(encodeURIComponent(e)).length;
    }
    function BZt(e, t, n) {
      let r = [];
      let o;
      while ((o = e.exec(n)) !== null) {
        r.push({
          data: o[0],
          index: o.index,
          mode: t,
          length: o[0].length
        });
      }
      return r;
    }
    function hzl(e) {
      let t = BZt(UZt.NUMERIC, MS.NUMERIC, e);
      let n = BZt(UZt.ALPHANUMERIC, MS.ALPHANUMERIC, e);
      let r;
      let o;
      if (mlr.isKanjiModeEnabled()) {
        r = BZt(UZt.BYTE, MS.BYTE, e);
        o = BZt(UZt.KANJI, MS.KANJI, e);
      } else {
        r = BZt(UZt.BYTE_KANJI, MS.BYTE, e);
        o = [];
      }
      return t.concat(n, r, o).sort(function (i, a) {
        return i.index - a.index;
      }).map(function (i) {
        return {
          data: i.data,
          mode: i.mode,
          length: i.length
        };
      });
    }
    function j4o(e, t) {
      switch (t) {
        case MS.NUMERIC:
          return dzl.getBitsLength(e);
        case MS.ALPHANUMERIC:
          return pzl.getBitsLength(e);
        case MS.KANJI:
          return fzl.getBitsLength(e);
        case MS.BYTE:
          return mzl.getBitsLength(e);
      }
    }
    function AVm(e) {
      return e.reduce(function (t, n) {
        let r = t.length - 1 >= 0 ? t[t.length - 1] : null;
        if (r && r.mode === n.mode) {
          t[t.length - 1].data += n.data;
          return t;
        }
        t.push(n);
        return t;
      }, []);
    }
    function IVm(e) {
      let t = [];
      for (let n = 0; n < e.length; n++) {
        let r = e[n];
        switch (r.mode) {
          case MS.NUMERIC:
            t.push([r, {
              data: r.data,
              mode: MS.ALPHANUMERIC,
              length: r.length
            }, {
              data: r.data,
              mode: MS.BYTE,
              length: r.length
            }]);
            break;
          case MS.ALPHANUMERIC:
            t.push([r, {
              data: r.data,
              mode: MS.BYTE,
              length: r.length
            }]);
            break;
          case MS.KANJI:
            t.push([r, {
              data: r.data,
              mode: MS.BYTE,
              length: czl(r.data)
            }]);
            break;
          case MS.BYTE:
            t.push([{
              data: r.data,
              mode: MS.BYTE,
              length: czl(r.data)
            }]);
        }
      }
      return t;
    }
    function PVm(e, t) {
      let n = {};
      let r = {
        start: {}
      };
      let o = ["start"];
      for (let s = 0; s < e.length; s++) {
        let i = e[s];
        let a = [];
        for (let l = 0; l < i.length; l++) {
          let c = i[l];
          let u = "" + s + l;
          a.push(u);
          n[u] = {
            node: c,
            lastCount: 0
          };
          r[u] = {};
          for (let d = 0; d < o.length; d++) {
            let p = o[d];
            if (n[p] && n[p].node.mode === c.mode) {
              r[p][u] = j4o(n[p].lastCount + c.length, c.mode) - j4o(n[p].lastCount, c.mode);
              n[p].lastCount += c.length;
            } else {
              if (n[p]) {
                n[p].lastCount = c.length;
              }
              r[p][u] = j4o(c.length, c.mode) + 4 + MS.getCharCountIndicator(c.mode, t);
            }
          }
        }
        o = a;
      }
      for (let s = 0; s < o.length; s++) {
        r[o[s]].end = 0;
      }
      return {
        map: r,
        table: n
      };
    }
    function uzl(e, t) {
      let n;
      let r = MS.getBestModeForData(e);
      if (n = MS.from(t, r), n !== MS.BYTE && n.bit < r.bit) {
        throw Error('"' + e + '" cannot be encoded with mode ' + MS.toString(n) + `.
 Suggested mode is: ` + MS.toString(r));
      }
      if (n === MS.KANJI && !mlr.isKanjiModeEnabled()) {
        n = MS.BYTE;
      }
      switch (n) {
        case MS.NUMERIC:
          return new dzl(e);
        case MS.ALPHANUMERIC:
          return new pzl(e);
        case MS.KANJI:
          return new fzl(e);
        case MS.BYTE:
          return new mzl(e);
      }
    }
    Rwt.fromArray = function (t) {
      return t.reduce(function (n, r) {
        if (typeof r === "string") {
          n.push(uzl(r, null));
        } else if (r.data) {
          n.push(uzl(r.data, r.mode));
        }
        return n;
      }, []);
    };
    Rwt.fromString = function (t, n) {
      let r = hzl(t, mlr.isKanjiModeEnabled());
      let o = IVm(r);
      let s = PVm(o, n);
      let i = kVm.find_path(s.map, "start", "end");
      let a = [];
      for (let l = 1; l < i.length - 1; l++) {
        a.push(s.table[i[l]].node);
      }
      return Rwt.fromArray(AVm(a));
    };
    Rwt.rawSplit = function (t) {
      return Rwt.fromArray(hzl(t, mlr.isKanjiModeEnabled()));
    };
  });
  var K4o = __commonJS(yzl => {
    var hlr = PUe();
    var q4o = ilr();
    var OVm = MVl();
    var DVm = LVl();
    var MVm = FVl();
    var NVm = BVl();
    var V4o = $Vl();
    var z4o = O4o();
    var LVm = GVl();
    var flr = JVl();
    var FVm = ZVl();
    var UVm = DUe();
    var W4o = gzl();
    function BVm(e, t) {
      let n = e.size;
      let r = NVm.getPositions(t);
      for (let o = 0; o < r.length; o++) {
        let s = r[o][0];
        let i = r[o][1];
        for (let a = -1; a <= 7; a++) {
          if (s + a <= -1 || n <= s + a) {
            continue;
          }
          for (let l = -1; l <= 7; l++) {
            if (i + l <= -1 || n <= i + l) {
              continue;
            }
            if (a >= 0 && a <= 6 && (l === 0 || l === 6) || l >= 0 && l <= 6 && (a === 0 || a === 6) || a >= 2 && a <= 4 && l >= 2 && l <= 4) {
              e.set(s + a, i + l, true, true);
            } else {
              e.set(s + a, i + l, false, true);
            }
          }
        }
      }
    }
    function $Vm(e) {
      let t = e.size;
      for (let n = 8; n < t - 8; n++) {
        let r = n % 2 === 0;
        e.set(n, 6, r, true);
        e.set(6, n, r, true);
      }
    }
    function HVm(e, t) {
      let n = MVm.getPositions(t);
      for (let r = 0; r < n.length; r++) {
        let o = n[r][0];
        let s = n[r][1];
        for (let i = -2; i <= 2; i++) {
          for (let a = -2; a <= 2; a++) {
            if (i === -2 || i === 2 || a === -2 || a === 2 || i === 0 && a === 0) {
              e.set(o + i, s + a, true, true);
            } else {
              e.set(o + i, s + a, false, true);
            }
          }
        }
      }
    }
    function jVm(e, t) {
      let n = e.size;
      let r = flr.getEncodedBits(t);
      let o;
      let s;
      let i;
      for (let a = 0; a < 18; a++) {
        o = Math.floor(a / 3);
        s = a % 3 + n - 8 - 3;
        i = (r >> a & 1) === 1;
        e.set(o, s, i, true);
        e.set(s, o, i, true);
      }
    }
    function G4o(e, t, n) {
      let r = e.size;
      let o = FVm.getEncodedBits(t, n);
      let s;
      let i;
      for (s = 0; s < 15; s++) {
        if (i = (o >> s & 1) === 1, s < 6) {
          e.set(s, 8, i, true);
        } else if (s < 8) {
          e.set(s + 1, 8, i, true);
        } else {
          e.set(r - 15 + s, 8, i, true);
        }
        if (s < 8) {
          e.set(8, r - s - 1, i, true);
        } else if (s < 9) {
          e.set(8, 15 - s - 1 + 1, i, true);
        } else {
          e.set(8, 15 - s - 1, i, true);
        }
      }
      e.set(r - 8, 8, 1, true);
    }
    function qVm(e, t) {
      let n = e.size;
      let r = -1;
      let o = n - 1;
      let s = 7;
      let i = 0;
      for (let a = n - 1; a > 0; a -= 2) {
        if (a === 6) {
          a--;
        }
        while (true) {
          for (let l = 0; l < 2; l++) {
            if (!e.isReserved(o, a - l)) {
              let c = false;
              if (i < t.length) {
                c = (t[i] >>> s & 1) === 1;
              }
              if (e.set(o, a - l, c), s--, s === -1) {
                i++;
                s = 7;
              }
            }
          }
          if (o += r, o < 0 || n <= o) {
            o -= r;
            r = -r;
            break;
          }
        }
      }
    }
    function WVm(e, t, n) {
      let r = new OVm();
      n.forEach(function (l) {
        r.put(l.mode.bit, 4);
        r.put(l.getLength(), UVm.getCharCountIndicator(l.mode, e));
        l.write(r);
      });
      let o = hlr.getSymbolTotalCodewords(e);
      let s = z4o.getTotalCodewordsCount(e, t);
      let i = (o - s) * 8;
      if (r.getLengthInBits() + 4 <= i) {
        r.put(0, 4);
      }
      while (r.getLengthInBits() % 8 !== 0) {
        r.putBit(0);
      }
      let a = (i - r.getLengthInBits()) / 8;
      for (let l = 0; l < a; l++) {
        r.put(l % 2 ? 17 : 236, 8);
      }
      return GVm(r, e, t);
    }
    function GVm(e, t, n) {
      let r = hlr.getSymbolTotalCodewords(t);
      let o = z4o.getTotalCodewordsCount(t, n);
      let s = r - o;
      let i = z4o.getBlocksCount(t, n);
      let a = r % i;
      let l = i - a;
      let c = Math.floor(r / i);
      let u = Math.floor(s / i);
      let d = u + 1;
      let p = c - u;
      let m = new LVm(p);
      let f = 0;
      let h = Array(i);
      let g = Array(i);
      let y = 0;
      let _ = new Uint8Array(e.buffer);
      for (let x = 0; x < i; x++) {
        let A = x < l ? u : d;
        h[x] = _.slice(f, f + A);
        g[x] = m.HS(h[x]);
        f += A;
        y = Math.max(y, A);
      }
      let b = new Uint8Array(r);
      let S = 0;
      let E;
      let C;
      for (E = 0; E < y; E++) {
        for (C = 0; C < i; C++) {
          if (E < h[C].length) {
            b[S++] = h[C][E];
          }
        }
      }
      for (E = 0; E < p; E++) {
        for (C = 0; C < i; C++) {
          b[S++] = g[C][E];
        }
      }
      return b;
    }
    function VVm(e, t, n, r) {
      let o;
      if (Array.isArray(e)) {
        o = W4o.fromArray(e);
      } else if (typeof e === "string") {
        let c = t;
        if (!c) {
          let u = W4o.rawSplit(e);
          c = flr.getBestVersionForData(u, n);
        }
        o = W4o.fromString(e, c || 40);
      } else {
        throw Error("Invalid data");
      }
      let s = flr.getBestVersionForData(o, n);
      if (!s) {
        throw Error("The amount of data is too big to be stored in a QR Code");
      }
      if (!t) {
        t = s;
      } else if (t < s) {
        throw Error(`
The chosen QR Code version cannot contain this amount of data.
Minimum version required to store current data is: ` + s + `.
`);
      }
      let i = WVm(t, n, o);
      let a = hlr.getSymbolSize(t);
      let l = new DVm(a);
      if (BVm(l, t), $Vm(l), HVm(l, t), G4o(l, n, 0), t >= 7) {
        jVm(l, t);
      }
      if (qVm(l, i), isNaN(r)) {
        r = V4o.getBestMask(l, G4o.bind(null, l, n));
      }
      V4o.applyMask(r, l);
      G4o(l, n, r);
      return {
        modules: l,
        version: t,
        errorCorrectionLevel: n,
        maskPattern: r,
        segments: o
      };
    }
    yzl.create = function (t, n) {
      if (typeof t > "u" || t === "") {
        throw Error("No input text");
      }
      let r = q4o.M;
      let o;
      let s;
      if (typeof n < "u") {
        if (r = q4o.from(n.errorCorrectionLevel, q4o.M), o = flr.from(n.version), s = V4o.from(n.maskPattern), n.toSJISFunc) {
          hlr.setToSJISFunction(n.toSJISFunc);
        }
      }
      return VVm(t, o, r, s);
    };
  });
  var Y4o = __commonJS((pmT, bzl) => {
    var zVm = require("util");
    var _zl = require("stream");
    var bie = bzl.exports = function () {
      _zl.call(this);
      this._buffers = [];
      this._buffered = 0;
      this._reads = [];
      this._paused = false;
      this._encoding = "utf8";
      this.writable = true;
    };
    zVm.inherits(bie, _zl);
    bie.prototype.read = function (e, t) {
      this._reads.push({
        length: Math.abs(e),
        allowLess: e < 0,
        func: t
      });
      process.nextTick(function () {
        if (this._process(), this._paused && this._reads && this._reads.length > 0) {
          this._paused = false;
          this.emit("drain");
        }
      }.bind(this));
    };
    bie.prototype.write = function (e, t) {
      if (!this.writable) {
        this.emit("error", Error("Stream not writable"));
        return false;
      }
      let n;
      if (Buffer.isBuffer(e)) {
        n = e;
      } else {
        n = Buffer.from(e, t || this._encoding);
      }
      if (this._buffers.push(n), this._buffered += n.length, this._process(), this._reads && this._reads.length === 0) {
        this._paused = true;
      }
      return this.writable && !this._paused;
    };
    bie.prototype.end = function (e, t) {
      if (e) {
        this.write(e, t);
      }
      if (this.writable = false, !this._buffers) {
        return;
      }
      if (this._buffers.length === 0) {
        this._end();
      } else {
        this._buffers.push(null);
        this._process();
      }
    };
    bie.prototype.destroySoon = bie.prototype.end;
    bie.prototype._end = function () {
      if (this._reads.length > 0) {
        this.emit("error", Error("Unexpected end of input"));
      }
      this.destroy();
    };
    bie.prototype.destroy = function () {
      if (!this._buffers) {
        return;
      }
      this.writable = false;
      this._reads = null;
      this._buffers = null;
      this.emit("close");
    };
    bie.prototype._processReadAllowingLess = function (e) {
      this._reads.shift();
      let t = this._buffers[0];
      if (t.length > e.length) {
        this._buffered -= e.length;
        this._buffers[0] = t.slice(e.length);
        e.func.call(this, t.slice(0, e.length));
      } else {
        this._buffered -= t.length;
        this._buffers.shift();
        e.func.call(this, t);
      }
    };
    bie.prototype._processRead = function (e) {
      this._reads.shift();
      let t = 0;
      let n = 0;
      let r = Buffer.alloc(e.length);
      while (t < e.length) {
        let o = this._buffers[n++];
        let s = Math.min(o.length, e.length - t);
        if (o.copy(r, t, 0, s), t += s, s !== o.length) {
          this._buffers[--n] = o.slice(s);
        }
      }
      if (n > 0) {
        this._buffers.splice(0, n);
      }
      this._buffered -= e.length;
      e.func.call(this, r);
    };
    bie.prototype._process = function () {
      try {
        while (this._buffered > 0 && this._reads && this._reads.length > 0) {
          let e = this._reads[0];
          if (e.allowLess) {
            this._processReadAllowingLess(e);
          } else if (this._buffered >= e.length) {
            this._processRead(e);
          } else {
            break;
          }
        }
        if (this._buffers && !this.writable) {
          this._end();
        }
      } catch (e) {
        this.emit("error", e);
      }
    };
  });
  var X4o = __commonJS(J4o => {
    var NUe = [{
      x: [0],
      y: [0]
    }, {
      x: [4],
      y: [0]
    }, {
      x: [0, 4],
      y: [4]
    }, {
      x: [2, 6],
      y: [0, 4]
    }, {
      x: [0, 2, 4, 6],
      y: [2, 6]
    }, {
      x: [1, 3, 5, 7],
      y: [0, 2, 4, 6]
    }, {
      x: [0, 1, 2, 3, 4, 5, 6, 7],
      y: [1, 3, 5, 7]
    }];
    J4o.getImagePasses = function (e, t) {
      let n = [];
      let r = e % 8;
      let o = t % 8;
      let s = (e - r) / 8;
      let i = (t - o) / 8;
      for (let a = 0; a < NUe.length; a++) {
        let l = NUe[a];
        let c = s * l.x.length;
        let u = i * l.y.length;
        for (let d = 0; d < l.x.length; d++) {
          if (l.x[d] < r) {
            c++;
          } else {
            break;
          }
        }
        for (let d = 0; d < l.y.length; d++) {
          if (l.y[d] < o) {
            u++;
          } else {
            break;
          }
        }
        if (c > 0 && u > 0) {
          n.push({
            width: c,
            height: u,
            index: a
          });
        }
      }
      return n;
    };
    J4o.getInterlaceIterator = function (e) {
      return function (t, n, r) {
        let o = t % NUe[r].x.length;
        let s = (t - o) / NUe[r].x.length * 8 + NUe[r].x[o];
        let i = n % NUe[r].y.length;
        let a = (n - i) / NUe[r].y.length * 8 + NUe[r].y[i];
        return s * 4 + a * e * 4;
      };
    };
  });
  var Q4o = __commonJS((fmT, Szl) => {
    Szl.exports = function (t, n, r) {
      let o = t + n - r;
      let s = Math.abs(o - t);
      let i = Math.abs(o - n);
      let a = Math.abs(o - r);
      if (s <= i && s <= a) {
        return t;
      }
      if (i <= a) {
        return n;
      }
      return r;
    };
  });
  var Z4o = __commonJS((hmT, Ezl) => {
    var KVm = X4o();
    var YVm = Q4o();
    function Tzl(e, t, n) {
      let r = e * t;
      if (n !== 8) {
        r = Math.ceil(r / (8 / n));
      }
      return r;
    }
    var xwt = Ezl.exports = function (e, t) {
      let {
        width: n,
        height: r,
        interlace: o,
        bpp: s,
        depth: i
      } = e;
      if (this.read = t.read, this.write = t.write, this.complete = t.complete, this._imageIndex = 0, this._images = [], o) {
        let a = KVm.getImagePasses(n, r);
        for (let l = 0; l < a.length; l++) {
          this._images.push({
            byteWidth: Tzl(a[l].width, s, i),
            height: a[l].height,
            lineIndex: 0
          });
        }
      } else {
        this._images.push({
          byteWidth: Tzl(n, s, i),
          height: r,
          lineIndex: 0
        });
      }
      if (i === 8) {
        this._xComparison = s;
      } else if (i === 16) {
        this._xComparison = s * 2;
      } else {
        this._xComparison = 1;
      }
    };
    xwt.prototype.start = function () {
      this.read(this._images[this._imageIndex].byteWidth + 1, this._reverseFilterLine.bind(this));
    };
    xwt.prototype._unFilterType1 = function (e, t, n) {
      let r = this._xComparison;
      let o = r - 1;
      for (let s = 0; s < n; s++) {
        let i = e[1 + s];
        let a = s > o ? t[s - r] : 0;
        t[s] = i + a;
      }
    };
    xwt.prototype._unFilterType2 = function (e, t, n) {
      let r = this._lastLine;
      for (let o = 0; o < n; o++) {
        let s = e[1 + o];
        let i = r ? r[o] : 0;
        t[o] = s + i;
      }
    };
    xwt.prototype._unFilterType3 = function (e, t, n) {
      let r = this._xComparison;
      let o = r - 1;
      let s = this._lastLine;
      for (let i = 0; i < n; i++) {
        let a = e[1 + i];
        let l = s ? s[i] : 0;
        let c = i > o ? t[i - r] : 0;
        let u = Math.floor((c + l) / 2);
        t[i] = a + u;
      }
    };
    xwt.prototype._unFilterType4 = function (e, t, n) {
      let r = this._xComparison;
      let o = r - 1;
      let s = this._lastLine;
      for (let i = 0; i < n; i++) {
        let a = e[1 + i];
        let l = s ? s[i] : 0;
        let c = i > o ? t[i - r] : 0;
        let u = i > o && s ? s[i - r] : 0;
        let d = YVm(c, l, u);
        t[i] = a + d;
      }
    };
    xwt.prototype._reverseFilterLine = function (e) {
      let t = e[0];
      let n;
      let r = this._images[this._imageIndex];
      let o = r.byteWidth;
      if (t === 0) {
        n = e.slice(1, o + 1);
      } else {
        switch (n = Buffer.alloc(o), t) {
          case 1:
            this._unFilterType1(e, n, o);
            break;
          case 2:
            this._unFilterType2(e, n, o);
            break;
          case 3:
            this._unFilterType3(e, n, o);
            break;
          case 4:
            this._unFilterType4(e, n, o);
            break;
          default:
            throw Error("Unrecognised filter type - " + t);
        }
      }
      if (this.write(n), r.lineIndex++, r.lineIndex >= r.height) {
        this._lastLine = null;
        this._imageIndex++;
        r = this._images[this._imageIndex];
      } else {
        this._lastLine = n;
      }
      if (r) {
        this.read(r.byteWidth + 1, this._reverseFilterLine.bind(this));
      } else {
        this._lastLine = null;
        this.complete();
      }
    };
  });
  var Czl = __commonJS((gmT, wzl) => {
    var JVm = require("util");
    var vzl = Y4o();
    var XVm = Z4o();
    var QVm = wzl.exports = function (e) {
      vzl.call(this);
      let t = [];
      let n = this;
      this._filter = new XVm(e, {
        read: this.read.bind(this),
        write: function (r) {
          t.push(r);
        },
        complete: function () {
          n.emit("complete", Buffer.concat(t));
        }
      });
      this._filter.start();
    };
    JVm.inherits(QVm, vzl);
  });
  var kwt = __commonJS((ymT, Rzl) => {
    Rzl.exports = {
      PNG_SIGNATURE: [137, 80, 78, 71, 13, 10, 26, 10],
      TYPE_IHDR: 1229472850,
      TYPE_IEND: 1229278788,
      TYPE_IDAT: 1229209940,
      TYPE_PLTE: 1347179589,
      TYPE_tRNS: 1951551059,
      TYPE_gAMA: 1732332865,
      COLORTYPE_GRAYSCALE: 0,
      COLORTYPE_PALETTE: 1,
      COLORTYPE_COLOR: 2,
      COLORTYPE_ALPHA: 4,
      COLORTYPE_PALETTE_COLOR: 3,
      COLORTYPE_COLOR_ALPHA: 6,
      COLORTYPE_TO_BPP_MAP: {
        0: 1,
        2: 3,
        3: 1,
        4: 2,
        6: 4
      },
      GAMMA_DIVISION: 1e5
    };
  });
  var nWo = __commonJS((_mT, xzl) => {
    var eWo = [];
    (function () {
      for (let e = 0; e < 256; e++) {
        let t = e;
        for (let n = 0; n < 8; n++) {
          if (t & 1) {
            t = 3988292384 ^ t >>> 1;
          } else {
            t = t >>> 1;
          }
        }
        eWo[e] = t;
      }
    })();
    var tWo = xzl.exports = function () {
      this._crc = -1;
    };
    tWo.prototype.write = function (e) {
      for (let t = 0; t < e.length; t++) {
        this._crc = eWo[(this._crc ^ e[t]) & 255] ^ this._crc >>> 8;
      }
      return true;
    };
    tWo.prototype.crc32 = function () {
      return this._crc ^ -1;
    };
    tWo.crc32 = function (e) {
      let t = -1;
      for (let n = 0; n < e.length; n++) {
        t = eWo[(t ^ e[n]) & 255] ^ t >>> 8;
      }
      return t ^ -1;
    };
  });
  var rWo = __commonJS((bmT, kzl) => {
    var QM = kwt();
    var ZVm = nWo();
    var yL = kzl.exports = function (e, t) {
      this._options = e;
      e.checkCRC = e.checkCRC !== false;
      this._hasIHDR = false;
      this._hasIEND = false;
      this._emittedHeadersFinished = false;
      this._palette = [];
      this._colorType = 0;
      this._chunks = {};
      this._chunks[QM.TYPE_IHDR] = this._handleIHDR.bind(this);
      this._chunks[QM.TYPE_IEND] = this._handleIEND.bind(this);
      this._chunks[QM.TYPE_IDAT] = this._handleIDAT.bind(this);
      this._chunks[QM.TYPE_PLTE] = this._handlePLTE.bind(this);
      this._chunks[QM.TYPE_tRNS] = this._handleTRNS.bind(this);
      this._chunks[QM.TYPE_gAMA] = this._handleGAMA.bind(this);
      this.read = t.read;
      this.error = t.error;
      this.metadata = t.metadata;
      this.gamma = t.gamma;
      this.transColor = t.transColor;
      this.palette = t.palette;
      this.parsed = t.parsed;
      this.inflateData = t.inflateData;
      this.finished = t.finished;
      this.simpleTransparency = t.simpleTransparency;
      this.headersFinished = t.headersFinished || function () {};
    };
    yL.prototype.start = function () {
      this.read(QM.PNG_SIGNATURE.length, this._parseSignature.bind(this));
    };
    yL.prototype._parseSignature = function (e) {
      let t = QM.PNG_SIGNATURE;
      for (let n = 0; n < t.length; n++) {
        if (e[n] !== t[n]) {
          this.error(Error("Invalid file signature"));
          return;
        }
      }
      this.read(8, this._parseChunkBegin.bind(this));
    };
    yL.prototype._parseChunkBegin = function (e) {
      let t = e.readUInt32BE(0);
      let n = e.readUInt32BE(4);
      let r = "";
      for (let s = 4; s < 8; s++) {
        r += String.fromCharCode(e[s]);
      }
      let o = Boolean(e[4] & 32);
      if (!this._hasIHDR && n !== QM.TYPE_IHDR) {
        this.error(Error("Expected IHDR on beggining"));
        return;
      }
      if (this._crc = new ZVm(), this._crc.write(Buffer.from(r)), this._chunks[n]) {
        return this._chunks[n](t);
      }
      if (!o) {
        this.error(Error("Unsupported critical chunk type " + r));
        return;
      }
      this.read(t + 4, this._skipChunk.bind(this));
    };
    yL.prototype._skipChunk = function () {
      this.read(8, this._parseChunkBegin.bind(this));
    };
    yL.prototype._handleChunkEnd = function () {
      this.read(4, this._parseChunkEnd.bind(this));
    };
    yL.prototype._parseChunkEnd = function (e) {
      let t = e.readInt32BE(0);
      let n = this._crc.crc32();
      if (this._options.checkCRC && n !== t) {
        this.error(Error("Crc error - " + t + " - " + n));
        return;
      }
      if (!this._hasIEND) {
        this.read(8, this._parseChunkBegin.bind(this));
      }
    };
    yL.prototype._handleIHDR = function (e) {
      this.read(e, this._parseIHDR.bind(this));
    };
    yL.prototype._parseIHDR = function (e) {
      this._crc.write(e);
      let t = e.readUInt32BE(0);
      let n = e.readUInt32BE(4);
      let r = e[8];
      let o = e[9];
      let s = e[10];
      let i = e[11];
      let a = e[12];
      if (r !== 8 && r !== 4 && r !== 2 && r !== 1 && r !== 16) {
        this.error(Error("Unsupported bit depth " + r));
        return;
      }
      if (!(o in QM.COLORTYPE_TO_BPP_MAP)) {
        this.error(Error("Unsupported color type"));
        return;
      }
      if (s !== 0) {
        this.error(Error("Unsupported compression method"));
        return;
      }
      if (i !== 0) {
        this.error(Error("Unsupported filter method"));
        return;
      }
      if (a !== 0 && a !== 1) {
        this.error(Error("Unsupported interlace method"));
        return;
      }
      this._colorType = o;
      let l = QM.COLORTYPE_TO_BPP_MAP[this._colorType];
      this._hasIHDR = true;
      this.metadata({
        width: t,
        height: n,
        depth: r,
        interlace: Boolean(a),
        palette: Boolean(o & QM.COLORTYPE_PALETTE),
        color: Boolean(o & QM.COLORTYPE_COLOR),
        alpha: Boolean(o & QM.COLORTYPE_ALPHA),
        bpp: l,
        colorType: o
      });
      this._handleChunkEnd();
    };
    yL.prototype._handlePLTE = function (e) {
      this.read(e, this._parsePLTE.bind(this));
    };
    yL.prototype._parsePLTE = function (e) {
      this._crc.write(e);
      let t = Math.floor(e.length / 3);
      for (let n = 0; n < t; n++) {
        this._palette.push([e[n * 3], e[n * 3 + 1], e[n * 3 + 2], 255]);
      }
      this.palette(this._palette);
      this._handleChunkEnd();
    };
    yL.prototype._handleTRNS = function (e) {
      this.simpleTransparency();
      this.read(e, this._parseTRNS.bind(this));
    };
    yL.prototype._parseTRNS = function (e) {
      if (this._crc.write(e), this._colorType === QM.COLORTYPE_PALETTE_COLOR) {
        if (this._palette.length === 0) {
          this.error(Error("Transparency chunk must be after palette"));
          return;
        }
        if (e.length > this._palette.length) {
          this.error(Error("More transparent colors than palette size"));
          return;
        }
        for (let t = 0; t < e.length; t++) {
          this._palette[t][3] = e[t];
        }
        this.palette(this._palette);
      }
      if (this._colorType === QM.COLORTYPE_GRAYSCALE) {
        this.transColor([e.readUInt16BE(0)]);
      }
      if (this._colorType === QM.COLORTYPE_COLOR) {
        this.transColor([e.readUInt16BE(0), e.readUInt16BE(2), e.readUInt16BE(4)]);
      }
      this._handleChunkEnd();
    };
    yL.prototype._handleGAMA = function (e) {
      this.read(e, this._parseGAMA.bind(this));
    };
    yL.prototype._parseGAMA = function (e) {
      this._crc.write(e);
      this.gamma(e.readUInt32BE(0) / QM.GAMMA_DIVISION);
      this._handleChunkEnd();
    };
    yL.prototype._handleIDAT = function (e) {
      if (!this._emittedHeadersFinished) {
        this._emittedHeadersFinished = true;
        this.headersFinished();
      }
      this.read(-e, this._parseIDAT.bind(this, e));
    };
    yL.prototype._parseIDAT = function (e, t) {
      if (this._crc.write(t), this._colorType === QM.COLORTYPE_PALETTE_COLOR && this._palette.length === 0) {
        throw Error("Expected palette not found");
      }
      this.inflateData(t);
      let n = e - t.length;
      if (n > 0) {
        this._handleIDAT(n);
      } else {
        this._handleChunkEnd();
      }
    };
    yL.prototype._handleIEND = function (e) {
      this.read(e, this._parseIEND.bind(this));
    };
    yL.prototype._parseIEND = function (e) {
      if (this._crc.write(e), this._hasIEND = true, this._handleChunkEnd(), this.finished) {
        this.finished();
      }
    };
  });
  var oWo = __commonJS(Izl => {
    var Azl = X4o();
    var ezm = [function () {}, function (e, t, n, r) {
      if (r === t.length) {
        throw Error("Ran out of data");
      }
      let o = t[r];
      e[n] = o;
      e[n + 1] = o;
      e[n + 2] = o;
      e[n + 3] = 255;
    }, function (e, t, n, r) {
      if (r + 1 >= t.length) {
        throw Error("Ran out of data");
      }
      let o = t[r];
      e[n] = o;
      e[n + 1] = o;
      e[n + 2] = o;
      e[n + 3] = t[r + 1];
    }, function (e, t, n, r) {
      if (r + 2 >= t.length) {
        throw Error("Ran out of data");
      }
      e[n] = t[r];
      e[n + 1] = t[r + 1];
      e[n + 2] = t[r + 2];
      e[n + 3] = 255;
    }, function (e, t, n, r) {
      if (r + 3 >= t.length) {
        throw Error("Ran out of data");
      }
      e[n] = t[r];
      e[n + 1] = t[r + 1];
      e[n + 2] = t[r + 2];
      e[n + 3] = t[r + 3];
    }];
    var tzm = [function () {}, function (e, t, n, r) {
      let o = t[0];
      e[n] = o;
      e[n + 1] = o;
      e[n + 2] = o;
      e[n + 3] = r;
    }, function (e, t, n) {
      let r = t[0];
      e[n] = r;
      e[n + 1] = r;
      e[n + 2] = r;
      e[n + 3] = t[1];
    }, function (e, t, n, r) {
      e[n] = t[0];
      e[n + 1] = t[1];
      e[n + 2] = t[2];
      e[n + 3] = r;
    }, function (e, t, n) {
      e[n] = t[0];
      e[n + 1] = t[1];
      e[n + 2] = t[2];
      e[n + 3] = t[3];
    }];
    function nzm(e, t) {
      let n = [];
      let r = 0;
      function o() {
        if (r === e.length) {
          throw Error("Ran out of data");
        }
        let s = e[r];
        r++;
        let i;
        let a;
        let l;
        let c;
        let u;
        let d;
        let p;
        let m;
        switch (t) {
          default:
            throw Error("unrecognised depth");
          case 16:
            p = e[r];
            r++;
            n.push((s << 8) + p);
            break;
          case 4:
            p = s & 15;
            m = s >> 4;
            n.push(m, p);
            break;
          case 2:
            u = s & 3;
            d = s >> 2 & 3;
            p = s >> 4 & 3;
            m = s >> 6 & 3;
            n.push(m, p, d, u);
            break;
          case 1:
            i = s & 1;
            a = s >> 1 & 1;
            l = s >> 2 & 1;
            c = s >> 3 & 1;
            u = s >> 4 & 1;
            d = s >> 5 & 1;
            p = s >> 6 & 1;
            m = s >> 7 & 1;
            n.push(m, p, d, u, c, l, a, i);
            break;
        }
      }
      return {
        get: function (s) {
          while (n.length < s) {
            o();
          }
          let i = n.slice(0, s);
          n = n.slice(s);
          return i;
        },
        resetAfterLine: function () {
          n.length = 0;
        },
        end: function () {
          if (r !== e.length) {
            throw Error("extra data found");
          }
        }
      };
    }
    function rzm(e, t, n, r, o, s) {
      let {
        width: i,
        height: a,
        index: l
      } = e;
      for (let c = 0; c < a; c++) {
        for (let u = 0; u < i; u++) {
          let d = n(u, c, l);
          ezm[r](t, o, d, s);
          s += r;
        }
      }
      return s;
    }
    function ozm(e, t, n, r, o, s) {
      let {
        width: i,
        height: a,
        index: l
      } = e;
      for (let c = 0; c < a; c++) {
        for (let u = 0; u < i; u++) {
          let d = o.get(r);
          let p = n(u, c, l);
          tzm[r](t, d, p, s);
        }
        o.resetAfterLine();
      }
    }
    Izl.dataToBitMap = function (e, t) {
      let {
        width: n,
        height: r,
        depth: o,
        bpp: s,
        interlace: i
      } = t;
      let a;
      if (o !== 8) {
        a = nzm(e, o);
      }
      let l;
      if (o <= 8) {
        l = Buffer.alloc(n * r * 4);
      } else {
        l = new Uint16Array(n * r * 4);
      }
      let c = Math.pow(2, o) - 1;
      let u = 0;
      let d;
      let p;
      if (i) {
        d = Azl.getImagePasses(n, r);
        p = Azl.getInterlaceIterator(n, r);
      } else {
        let m = 0;
        p = function () {
          let f = m;
          m += 4;
          return f;
        };
        d = [{
          width: n,
          height: r
        }];
      }
      for (let m = 0; m < d.length; m++) {
        if (o === 8) {
          u = rzm(d[m], l, p, s, e, u);
        } else {
          ozm(d[m], l, p, s, a, c);
        }
      }
      if (o === 8) {
        if (u !== e.length) {
          throw Error("extra data found");
        }
      } else {
        a.end();
      }
      return l;
    };
  });
  var sWo = __commonJS((TmT, Pzl) => {
    function szm(e, t, n, r, o) {
      let s = 0;
      for (let i = 0; i < r; i++) {
        for (let a = 0; a < n; a++) {
          let l = o[e[s]];
          if (!l) {
            throw Error("index " + e[s] + " not in palette");
          }
          for (let c = 0; c < 4; c++) {
            t[s + c] = l[c];
          }
          s += 4;
        }
      }
    }
    function izm(e, t, n, r, o) {
      let s = 0;
      for (let i = 0; i < r; i++) {
        for (let a = 0; a < n; a++) {
          let l = false;
          if (o.length === 1) {
            if (o[0] === e[s]) {
              l = true;
            }
          } else if (o[0] === e[s] && o[1] === e[s + 1] && o[2] === e[s + 2]) {
            l = true;
          }
          if (l) {
            for (let c = 0; c < 4; c++) {
              t[s + c] = 0;
            }
          }
          s += 4;
        }
      }
    }
    function azm(e, t, n, r, o) {
      let s = 255;
      let i = Math.pow(2, o) - 1;
      let a = 0;
      for (let l = 0; l < r; l++) {
        for (let c = 0; c < n; c++) {
          for (let u = 0; u < 4; u++) {
            t[a + u] = Math.floor(e[a + u] * s / i + 0.5);
          }
          a += 4;
        }
      }
    }
    Pzl.exports = function (e, t) {
      let {
        depth: n,
        width: r,
        height: o,
        colorType: s,
        transColor: i,
        palette: a
      } = t;
      let l = e;
      if (s === 3) {
        szm(e, l, r, o, a);
      } else {
        if (i) {
          izm(e, l, r, o, i);
        }
        if (n !== 8) {
          if (n === 16) {
            l = Buffer.alloc(r * o * 4);
          }
          azm(e, l, r, o, n);
        }
      }
      return l;
    };
  });
  var Mzl = __commonJS((EmT, Dzl) => {
    var lzm = require("util");
    var iWo = require("zlib");
    var Ozl = Y4o();
    var czm = Czl();
    var uzm = rWo();
    var dzm = oWo();
    var pzm = sWo();
    var jfe = Dzl.exports = function (e) {
      Ozl.call(this);
      this._parser = new uzm(e, {
        read: this.read.bind(this),
        error: this._handleError.bind(this),
        metadata: this._handleMetaData.bind(this),
        gamma: this.emit.bind(this, "gamma"),
        palette: this._handlePalette.bind(this),
        transColor: this._handleTransColor.bind(this),
        finished: this._finished.bind(this),
        inflateData: this._inflateData.bind(this),
        simpleTransparency: this._simpleTransparency.bind(this),
        headersFinished: this._headersFinished.bind(this)
      });
      this._options = e;
      this.writable = true;
      this._parser.start();
    };
    lzm.inherits(jfe, Ozl);
    jfe.prototype._handleError = function (e) {
      if (this.emit("error", e), this.writable = false, this.destroy(), this._inflate && this._inflate.destroy) {
        this._inflate.destroy();
      }
      if (this._filter) {
        this._filter.destroy();
        this._filter.on("error", function () {});
      }
      this.errord = true;
    };
    jfe.prototype._inflateData = function (e) {
      if (!this._inflate) {
        if (this._bitmapInfo.interlace) {
          this._inflate = iWo.createInflate();
          this._inflate.on("error", this.emit.bind(this, "error"));
          this._filter.on("complete", this._complete.bind(this));
          this._inflate.pipe(this._filter);
        } else {
          let n = ((this._bitmapInfo.width * this._bitmapInfo.bpp * this._bitmapInfo.depth + 7 >> 3) + 1) * this._bitmapInfo.height;
          let r = Math.max(n, iWo.Z_MIN_CHUNK);
          this._inflate = iWo.createInflate({
            chunkSize: r
          });
          let o = n;
          let s = this.emit.bind(this, "error");
          this._inflate.on("error", function (a) {
            if (!o) {
              return;
            }
            s(a);
          });
          this._filter.on("complete", this._complete.bind(this));
          let i = this._filter.write.bind(this._filter);
          this._inflate.on("data", function (a) {
            if (!o) {
              return;
            }
            if (a.length > o) {
              a = a.slice(0, o);
            }
            o -= a.length;
            i(a);
          });
          this._inflate.on("end", this._filter.end.bind(this._filter));
        }
      }
      this._inflate.write(e);
    };
    jfe.prototype._handleMetaData = function (e) {
      this._metaData = e;
      this._bitmapInfo = Object.create(e);
      this._filter = new czm(this._bitmapInfo);
    };
    jfe.prototype._handleTransColor = function (e) {
      this._bitmapInfo.transColor = e;
    };
    jfe.prototype._handlePalette = function (e) {
      this._bitmapInfo.palette = e;
    };
    jfe.prototype._simpleTransparency = function () {
      this._metaData.alpha = true;
    };
    jfe.prototype._headersFinished = function () {
      this.emit("metadata", this._metaData);
    };
    jfe.prototype._finished = function () {
      if (this.errord) {
        return;
      }
      if (!this._inflate) {
        this.emit("error", "No Inflate block");
      } else {
        this._inflate.end();
      }
    };
    jfe.prototype._complete = function (e) {
      if (this.errord) {
        return;
      }
      let t;
      try {
        let n = dzm.dataToBitMap(e, this._bitmapInfo);
        t = pzm(n, this._bitmapInfo);
        n = null;
      } catch (n) {
        this._handleError(n);
        return;
      }
      this.emit("parsed", t);
    };
  });
  var Lzl = __commonJS((vmT, Nzl) => {
    var eee = kwt();
    Nzl.exports = function (e, t, n, r) {
      let o = [eee.COLORTYPE_COLOR_ALPHA, eee.COLORTYPE_ALPHA].indexOf(r.colorType) !== -1;
      if (r.colorType === r.inputColorType) {
        let f = function () {
          let h = new ArrayBuffer(2);
          new DataView(h).setInt16(0, 256, true);
          return new Int16Array(h)[0] !== 256;
        }();
        if (r.bitDepth === 8 || r.bitDepth === 16 && f) {
          return e;
        }
      }
      let s = r.bitDepth !== 16 ? e : new Uint16Array(e.buffer);
      let i = 255;
      let a = eee.COLORTYPE_TO_BPP_MAP[r.inputColorType];
      if (a === 4 && !r.inputHasAlpha) {
        a = 3;
      }
      let l = eee.COLORTYPE_TO_BPP_MAP[r.colorType];
      if (r.bitDepth === 16) {
        i = 65535;
        l *= 2;
      }
      let c = Buffer.alloc(t * n * l);
      let u = 0;
      let d = 0;
      let p = r.bgColor || {};
      if (p.red === undefined) {
        p.red = i;
      }
      if (p.green === undefined) {
        p.green = i;
      }
      if (p.blue === undefined) {
        p.blue = i;
      }
      function m() {
        let f;
        let h;
        let g;
        let y = i;
        switch (r.inputColorType) {
          case eee.COLORTYPE_COLOR_ALPHA:
            y = s[u + 3];
            f = s[u];
            h = s[u + 1];
            g = s[u + 2];
            break;
          case eee.COLORTYPE_COLOR:
            f = s[u];
            h = s[u + 1];
            g = s[u + 2];
            break;
          case eee.COLORTYPE_ALPHA:
            y = s[u + 1];
            f = s[u];
            h = f;
            g = f;
            break;
          case eee.COLORTYPE_GRAYSCALE:
            f = s[u];
            h = f;
            g = f;
            break;
          default:
            throw Error("input color type:" + r.inputColorType + " is not supported at present");
        }
        if (r.inputHasAlpha) {
          if (!o) {
            y /= i;
            f = Math.min(Math.max(Math.round((1 - y) * p.red + y * f), 0), i);
            h = Math.min(Math.max(Math.round((1 - y) * p.green + y * h), 0), i);
            g = Math.min(Math.max(Math.round((1 - y) * p.blue + y * g), 0), i);
          }
        }
        return {
          red: f,
          green: h,
          blue: g,
          alpha: y
        };
      }
      for (let f = 0; f < n; f++) {
        for (let h = 0; h < t; h++) {
          let g = m(s, u);
          switch (r.colorType) {
            case eee.COLORTYPE_COLOR_ALPHA:
            case eee.COLORTYPE_COLOR:
              if (r.bitDepth === 8) {
                if (c[d] = g.red, c[d + 1] = g.green, c[d + 2] = g.blue, o) {
                  c[d + 3] = g.alpha;
                }
              } else if (c.writeUInt16BE(g.red, d), c.writeUInt16BE(g.green, d + 2), c.writeUInt16BE(g.blue, d + 4), o) {
                c.writeUInt16BE(g.alpha, d + 6);
              }
              break;
            case eee.COLORTYPE_ALPHA:
            case eee.COLORTYPE_GRAYSCALE:
              {
                let y = (g.red + g.green + g.blue) / 3;
                if (r.bitDepth === 8) {
                  if (c[d] = y, o) {
                    c[d + 1] = g.alpha;
                  }
                } else if (c.writeUInt16BE(y, d), o) {
                  c.writeUInt16BE(g.alpha, d + 2);
                }
                break;
              }
            default:
              throw Error("unrecognised color Type " + r.colorType);
          }
          u += a;
          d += l;
        }
      }
      return c;
    };
  });
  var Bzl = __commonJS((wmT, Uzl) => {
    var Fzl = Q4o();
    function mzm(e, t, n, r, o) {
      for (let s = 0; s < n; s++) {
        r[o + s] = e[t + s];
      }
    }
    function fzm(e, t, n) {
      let r = 0;
      let o = t + n;
      for (let s = t; s < o; s++) {
        r += Math.abs(e[s]);
      }
      return r;
    }
    function hzm(e, t, n, r, o, s) {
      for (let i = 0; i < n; i++) {
        let a = i >= s ? e[t + i - s] : 0;
        let l = e[t + i] - a;
        r[o + i] = l;
      }
    }
    function gzm(e, t, n, r) {
      let o = 0;
      for (let s = 0; s < n; s++) {
        let i = s >= r ? e[t + s - r] : 0;
        let a = e[t + s] - i;
        o += Math.abs(a);
      }
      return o;
    }
    function yzm(e, t, n, r, o) {
      for (let s = 0; s < n; s++) {
        let i = t > 0 ? e[t + s - n] : 0;
        let a = e[t + s] - i;
        r[o + s] = a;
      }
    }
    function _zm(e, t, n) {
      let r = 0;
      let o = t + n;
      for (let s = t; s < o; s++) {
        let i = t > 0 ? e[s - n] : 0;
        let a = e[s] - i;
        r += Math.abs(a);
      }
      return r;
    }
    function bzm(e, t, n, r, o, s) {
      for (let i = 0; i < n; i++) {
        let a = i >= s ? e[t + i - s] : 0;
        let l = t > 0 ? e[t + i - n] : 0;
        let c = e[t + i] - (a + l >> 1);
        r[o + i] = c;
      }
    }
    function Szm(e, t, n, r) {
      let o = 0;
      for (let s = 0; s < n; s++) {
        let i = s >= r ? e[t + s - r] : 0;
        let a = t > 0 ? e[t + s - n] : 0;
        let l = e[t + s] - (i + a >> 1);
        o += Math.abs(l);
      }
      return o;
    }
    function Tzm(e, t, n, r, o, s) {
      for (let i = 0; i < n; i++) {
        let a = i >= s ? e[t + i - s] : 0;
        let l = t > 0 ? e[t + i - n] : 0;
        let c = t > 0 && i >= s ? e[t + i - (n + s)] : 0;
        let u = e[t + i] - Fzl(a, l, c);
        r[o + i] = u;
      }
    }
    function Ezm(e, t, n, r) {
      let o = 0;
      for (let s = 0; s < n; s++) {
        let i = s >= r ? e[t + s - r] : 0;
        let a = t > 0 ? e[t + s - n] : 0;
        let l = t > 0 && s >= r ? e[t + s - (n + r)] : 0;
        let c = e[t + s] - Fzl(i, a, l);
        o += Math.abs(c);
      }
      return o;
    }
    var vzm = {
      0: mzm,
      1: hzm,
      2: yzm,
      3: bzm,
      4: Tzm
    };
    var wzm = {
      0: fzm,
      1: gzm,
      2: _zm,
      3: Szm,
      4: Ezm
    };
    Uzl.exports = function (e, t, n, r, o) {
      let s;
      if (!("filterType" in r) || r.filterType === -1) {
        s = [0, 1, 2, 3, 4];
      } else if (typeof r.filterType === "number") {
        s = [r.filterType];
      } else {
        throw Error("unrecognised filter types");
      }
      if (r.bitDepth === 16) {
        o *= 2;
      }
      let i = t * o;
      let a = 0;
      let l = 0;
      let c = Buffer.alloc((i + 1) * n);
      let u = s[0];
      for (let d = 0; d < n; d++) {
        if (s.length > 1) {
          let p = 1 / 0;
          for (let m = 0; m < s.length; m++) {
            let f = wzm[s[m]](e, l, i, o);
            if (f < p) {
              u = s[m];
              p = f;
            }
          }
        }
        c[a] = u;
        a++;
        vzm[u](e, l, i, c, a, o);
        a += i;
        l += i;
      }
      return c;
    };
  });
  var aWo = __commonJS((CmT, $zl) => {
    var EH = kwt();
    var Czm = nWo();
    var Rzm = Lzl();
    var xzm = Bzl();
    var kzm = require("zlib");
    var LUe = $zl.exports = function (e) {
      if (this._options = e, e.deflateChunkSize = e.deflateChunkSize || 32768, e.deflateLevel = e.deflateLevel != null ? e.deflateLevel : 9, e.deflateStrategy = e.deflateStrategy != null ? e.deflateStrategy : 3, e.inputHasAlpha = e.inputHasAlpha != null ? e.inputHasAlpha : true, e.deflateFactory = e.deflateFactory || kzm.createDeflate, e.bitDepth = e.bitDepth || 8, e.colorType = typeof e.colorType === "number" ? e.colorType : EH.COLORTYPE_COLOR_ALPHA, e.inputColorType = typeof e.inputColorType === "number" ? e.inputColorType : EH.COLORTYPE_COLOR_ALPHA, [EH.COLORTYPE_GRAYSCALE, EH.COLORTYPE_COLOR, EH.COLORTYPE_COLOR_ALPHA, EH.COLORTYPE_ALPHA].indexOf(e.colorType) === -1) {
        throw Error("option color type:" + e.colorType + " is not supported at present");
      }
      if ([EH.COLORTYPE_GRAYSCALE, EH.COLORTYPE_COLOR, EH.COLORTYPE_COLOR_ALPHA, EH.COLORTYPE_ALPHA].indexOf(e.inputColorType) === -1) {
        throw Error("option input color type:" + e.inputColorType + " is not supported at present");
      }
      if (e.bitDepth !== 8 && e.bitDepth !== 16) {
        throw Error("option bit depth:" + e.bitDepth + " is not supported at present");
      }
    };
    LUe.prototype.getDeflateOptions = function () {
      return {
        chunkSize: this._options.deflateChunkSize,
        level: this._options.deflateLevel,
        strategy: this._options.deflateStrategy
      };
    };
    LUe.prototype.createDeflate = function () {
      return this._options.deflateFactory(this.getDeflateOptions());
    };
    LUe.prototype.filterData = function (e, t, n) {
      let r = Rzm(e, t, n, this._options);
      let o = EH.COLORTYPE_TO_BPP_MAP[this._options.colorType];
      return xzm(r, t, n, this._options, o);
    };
    LUe.prototype._packChunk = function (e, t) {
      let n = t ? t.length : 0;
      let r = Buffer.alloc(n + 12);
      if (r.writeUInt32BE(n, 0), r.writeUInt32BE(e, 4), t) {
        t.copy(r, 8);
      }
      r.writeInt32BE(Czm.crc32(r.slice(4, r.length - 4)), r.length - 4);
      return r;
    };
    LUe.prototype.packGAMA = function (e) {
      let t = Buffer.alloc(4);
      t.writeUInt32BE(Math.floor(e * EH.GAMMA_DIVISION), 0);
      return this._packChunk(EH.TYPE_gAMA, t);
    };
    LUe.prototype.packIHDR = function (e, t) {
      let n = Buffer.alloc(13);
      n.writeUInt32BE(e, 0);
      n.writeUInt32BE(t, 4);
      n[8] = this._options.bitDepth;
      n[9] = this._options.colorType;
      n[10] = 0;
      n[11] = 0;
      n[12] = 0;
      return this._packChunk(EH.TYPE_IHDR, n);
    };
    LUe.prototype.packIDAT = function (e) {
      return this._packChunk(EH.TYPE_IDAT, e);
    };
    LUe.prototype.packIEND = function () {
      return this._packChunk(EH.TYPE_IEND, null);
    };
  });
  var Wzl = __commonJS((RmT, qzl) => {
    var Azm = require("util");
    var Hzl = require("stream");
    var Izm = kwt();
    var Pzm = aWo();
    var jzl = qzl.exports = function (e) {
      Hzl.call(this);
      let t = e || {};
      this._packer = new Pzm(t);
      this._deflate = this._packer.createDeflate();
      this.readable = true;
    };
    Azm.inherits(jzl, Hzl);
    jzl.prototype.pack = function (e, t, n, r) {
      if (this.emit("data", Buffer.from(Izm.PNG_SIGNATURE)), this.emit("data", this._packer.packIHDR(t, n)), r) {
        this.emit("data", this._packer.packGAMA(r));
      }
      let o = this._packer.filterData(e, t, n);
      this._deflate.on("error", this.emit.bind(this, "error"));
      this._deflate.on("data", function (s) {
        this.emit("data", this._packer.packIDAT(s));
      }.bind(this));
      this._deflate.on("end", function () {
        this.emit("data", this._packer.packIEND());
        this.emit("end");
      }.bind(this));
      this._deflate.end(o);
    };
  });
  var Jzl = __commonJS(($Zt, Yzl) => {
    var Gzl = require("assert").ok;
    var Awt = require("zlib");
    var Ozm = require("util");
    var Vzl = require("buffer").kMaxLength;
    function DYe(e) {
      if (!(this instanceof DYe)) {
        return new DYe(e);
      }
      if (e && e.chunkSize < Awt.Z_MIN_CHUNK) {
        e.chunkSize = Awt.Z_MIN_CHUNK;
      }
      if (Awt.Inflate.call(this, e), this._offset = this._offset === undefined ? this._outOffset : this._offset, this._buffer = this._buffer || this._outBuffer, e && e.maxLength != null) {
        this._maxLength = e.maxLength;
      }
    }
    function Dzm(e) {
      return new DYe(e);
    }
    function zzl(e, t) {
      if (t) {
        process.nextTick(t);
      }
      if (!e._handle) {
        return;
      }
      e._handle.close();
      e._handle = null;
    }
    DYe.prototype._processChunk = function (e, t, n) {
      if (typeof n === "function") {
        return Awt.Inflate._processChunk.call(this, e, t, n);
      }
      let r = this;
      let o = e && e.length;
      let s = this._chunkSize - this._offset;
      let i = this._maxLength;
      let a = 0;
      let l = [];
      let c = 0;
      let u;
      this.on("error", function (f) {
        u = f;
      });
      function d(f, h) {
        if (r._hadError) {
          return;
        }
        let g = s - h;
        if (Gzl(g >= 0, "have should not go down"), g > 0) {
          let y = r._buffer.slice(r._offset, r._offset + g);
          if (r._offset += g, y.length > i) {
            y = y.slice(0, i);
          }
          if (l.push(y), c += y.length, i -= y.length, i === 0) {
            return false;
          }
        }
        if (h === 0 || r._offset >= r._chunkSize) {
          s = r._chunkSize;
          r._offset = 0;
          r._buffer = Buffer.allocUnsafe(r._chunkSize);
        }
        if (h === 0) {
          a += o - f;
          o = f;
          return true;
        }
        return false;
      }
      Gzl(this._handle, "zlib binding closed");
      let p;
      do {
        p = this._handle.writeSync(t, e, a, o, this._buffer, this._offset, s);
        p = p || this._writeState;
      } while (!this._hadError && d(p[0], p[1]));
      if (this._hadError) {
        throw u;
      }
      if (c >= Vzl) {
        throw zzl(this), RangeError("Cannot create final Buffer. It would be larger than 0x" + Vzl.toString(16) + " bytes");
      }
      let m = Buffer.concat(l, c);
      zzl(this);
      return m;
    };
    Ozm.inherits(DYe, Awt.Inflate);
    function Mzm(e, t) {
      if (typeof t === "string") {
        t = Buffer.from(t);
      }
      if (!(t instanceof Buffer)) {
        throw TypeError("Not a string or buffer");
      }
      let n = e._finishFlushFlag;
      if (n == null) {
        n = Awt.Z_FINISH;
      }
      return e._processChunk(t, n);
    }
    function Kzl(e, t) {
      return Mzm(new DYe(t), e);
    }
    Yzl.exports = $Zt = Kzl;
    $Zt.Inflate = DYe;
    $Zt.createInflate = Dzm;
    $Zt.inflateSync = Kzl;
  });
  var lWo = __commonJS((xmT, Qzl) => {
    var Xzl = Qzl.exports = function (e) {
      this._buffer = e;
      this._reads = [];
    };
    Xzl.prototype.read = function (e, t) {
      this._reads.push({
        length: Math.abs(e),
        allowLess: e < 0,
        func: t
      });
    };
    Xzl.prototype.process = function () {
      while (this._reads.length > 0 && this._buffer.length) {
        let e = this._reads[0];
        if (this._buffer.length && (this._buffer.length >= e.length || e.allowLess)) {
          this._reads.shift();
          let t = this._buffer;
          this._buffer = t.slice(e.length);
          e.func.call(this, t.slice(0, e.length));
        } else {
          break;
        }
      }
      if (this._reads.length > 0) {
        return Error("There are some read requests waitng on finished stream");
      }
      if (this._buffer.length > 0) {
        return Error("unrecognised content at end of stream");
      }
    };
  });
  var eKl = __commonJS(Zzl => {
    var Nzm = lWo();
    var Lzm = Z4o();
    Zzl.process = function (e, t) {
      let n = [];
      let r = new Nzm(e);
      new Lzm(t, {
        read: r.read.bind(r),
        write: function (s) {
          n.push(s);
        },
        complete: function () {}
      }).start();
      r.process();
      return Buffer.concat(n);
    };
  });
  var oKl = __commonJS((AmT, rKl) => {
    var tKl = true;
    var nKl = require("zlib");
    var Fzm = Jzl();
    if (!nKl.deflateSync) {
      tKl = false;
    }
    var Uzm = lWo();
    var Bzm = eKl();
    var $zm = rWo();
    var Hzm = oWo();
    var jzm = sWo();
    rKl.exports = function (e, t) {
      if (!tKl) {
        throw Error("To use the sync capability of this library in old node versions, please pin pngjs to v2.3.0");
      }
      let n;
      function r(S) {
        n = S;
      }
      let o;
      function s(S) {
        o = S;
      }
      function i(S) {
        o.transColor = S;
      }
      function a(S) {
        o.palette = S;
      }
      function l() {
        o.alpha = true;
      }
      let c;
      function u(S) {
        c = S;
      }
      let d = [];
      function p(S) {
        d.push(S);
      }
      let m = new Uzm(e);
      if (new $zm(t, {
        read: m.read.bind(m),
        error: r,
        metadata: s,
        gamma: u,
        palette: a,
        transColor: i,
        inflateData: p,
        simpleTransparency: l
      }).start(), m.process(), n) {
        throw n;
      }
      let h = Buffer.concat(d);
      d.length = 0;
      let g;
      if (o.interlace) {
        g = nKl.inflateSync(h);
      } else {
        let E = ((o.width * o.bpp * o.depth + 7 >> 3) + 1) * o.height;
        g = Fzm(h, {
          chunkSize: E,
          maxLength: E
        });
      }
      if (h = null, !g || !g.length) {
        throw Error("bad png - invalid inflate data response");
      }
      let y = Bzm.process(g, o);
      h = null;
      let _ = Hzm.dataToBitMap(y, o);
      y = null;
      let b = jzm(_, o);
      o.data = b;
      o.gamma = c || 0;
      return o;
    };
  });
  var lKl = __commonJS((ImT, aKl) => {
    var sKl = true;
    var iKl = require("zlib");
    if (!iKl.deflateSync) {
      sKl = false;
    }
    var qzm = kwt();
    var Wzm = aWo();
    aKl.exports = function (e, t) {
      if (!sKl) {
        throw Error("To use the sync capability of this library in old node versions, please pin pngjs to v2.3.0");
      }
      let r = new Wzm(t || {});
      let o = [];
      if (o.push(Buffer.from(qzm.PNG_SIGNATURE)), o.push(r.packIHDR(e.width, e.height)), e.gamma) {
        o.push(r.packGAMA(e.gamma));
      }
      let s = r.filterData(e.data, e.width, e.height);
      let i = iKl.deflateSync(s, r.getDeflateOptions());
      if (s = null, !i || !i.length) {
        throw Error("bad png - invalid compressed data response");
      }
      o.push(r.packIDAT(i));
      o.push(r.packIEND());
      return Buffer.concat(o);
    };
  });
  var cKl = __commonJS(cWo => {
    var Gzm = oKl();
    var Vzm = lKl();
    cWo.read = function (e, t) {
      return Gzm(e, t || {});
    };
    cWo.write = function (e, t) {
      return Vzm(e, t);
    };
  });
  var pKl = __commonJS(dKl => {
    var zzm = require("util");
    var uKl = require("stream");
    var Kzm = Mzl();
    var Yzm = Wzl();
    var Jzm = cKl();
    var W3 = dKl.PNG = function (e) {
      if (uKl.call(this), e = e || {}, this.width = e.width | 0, this.height = e.height | 0, this.data = this.width > 0 && this.height > 0 ? Buffer.alloc(4 * this.width * this.height) : null, e.fill && this.data) {
        this.data.fill(0);
      }
      this.gamma = 0;
      this.readable = this.writable = true;
      this._parser = new Kzm(e);
      this._parser.on("error", this.emit.bind(this, "error"));
      this._parser.on("close", this._handleClose.bind(this));
      this._parser.on("metadata", this._metadata.bind(this));
      this._parser.on("gamma", this._gamma.bind(this));
      this._parser.on("parsed", function (t) {
        this.data = t;
        this.emit("parsed", t);
      }.bind(this));
      this._packer = new Yzm(e);
      this._packer.on("data", this.emit.bind(this, "data"));
      this._packer.on("end", this.emit.bind(this, "end"));
      this._parser.on("close", this._handleClose.bind(this));
      this._packer.on("error", this.emit.bind(this, "error"));
    };
    zzm.inherits(W3, uKl);
    W3.sync = Jzm;
    W3.prototype.pack = function () {
      if (!this.data || !this.data.length) {
        this.emit("error", "No data provided");
        return this;
      }
      process.nextTick(function () {
        this._packer.pack(this.data, this.width, this.height, this.gamma);
      }.bind(this));
      return this;
    };
    W3.prototype.parse = function (e, t) {
      if (t) {
        let n;
        let r;
        n = function (o) {
          this.removeListener("error", r);
          this.data = o;
          t(null, this);
        }.bind(this);
        r = function (o) {
          this.removeListener("parsed", n);
          t(o, null);
        }.bind(this);
        this.once("parsed", n);
        this.once("error", r);
      }
      this.end(e);
      return this;
    };
    W3.prototype.write = function (e) {
      this._parser.write(e);
      return true;
    };
    W3.prototype.end = function (e) {
      this._parser.end(e);
    };
    W3.prototype._metadata = function (e) {
      this.width = e.width;
      this.height = e.height;
      this.emit("metadata", e);
    };
    W3.prototype._gamma = function (e) {
      this.gamma = e;
    };
    W3.prototype._handleClose = function () {
      if (!this._parser.writable && !this._packer.readable) {
        this.emit("close");
      }
    };
    W3.bitblt = function (e, t, n, r, o, s, i, a) {
      if (n |= 0, r |= 0, o |= 0, s |= 0, i |= 0, a |= 0, n > e.width || r > e.height || n + o > e.width || r + s > e.height) {
        throw Error("bitblt reading outside image");
      }
      if (i > t.width || a > t.height || i + o > t.width || a + s > t.height) {
        throw Error("bitblt writing outside image");
      }
      for (let l = 0; l < s; l++) {
        e.data.copy(t.data, (a + l) * t.width + i << 2, (r + l) * e.width + n << 2, (r + l) * e.width + n + o << 2);
      }
    };
    W3.prototype.bitblt = function (e, t, n, r, o, s, i) {
      W3.bitblt(this, e, t, n, r, o, s, i);
      return this;
    };
    W3.adjustGamma = function (e) {
      if (e.gamma) {
        for (let t = 0; t < e.height; t++) {
          for (let n = 0; n < e.width; n++) {
            let r = e.width * t + n << 2;
            for (let o = 0; o < 3; o++) {
              let s = e.data[r + o] / 255;
              s = Math.pow(s, 0.45454545454545453 / e.gamma);
              e.data[r + o] = Math.round(s * 255);
            }
          }
        }
        e.gamma = 0;
      }
    };
    W3.prototype.adjustGamma = function () {
      W3.adjustGamma(this);
    };
  });
  var HZt = __commonJS(MYe => {
    function mKl(e) {
      if (typeof e === "number") {
        e = e.toString();
      }
      if (typeof e !== "string") {
        throw Error("Color should be defined as hex string");
      }
      let t = e.slice().replace("#", "").split("");
      if (t.length < 3 || t.length === 5 || t.length > 8) {
        throw Error("Invalid hex color: " + e);
      }
      if (t.length === 3 || t.length === 4) {
        t = Array.prototype.concat.apply([], t.map(function (r) {
          return [r, r];
        }));
      }
      if (t.length === 6) {
        t.push("F", "F");
      }
      let n = parseInt(t.join(""), 16);
      return {
        r: n >> 24 & 255,
        g: n >> 16 & 255,
        b: n >> 8 & 255,
        a: n & 255,
        hex: "#" + t.slice(0, 6).join("")
      };
    }
    MYe.getOptions = function (t) {
      if (!t) {
        t = {};
      }
      if (!t.color) {
        t.color = {};
      }
      let n = typeof t.margin > "u" || t.margin === null || t.margin < 0 ? 4 : t.margin;
      let r = t.width && t.width >= 21 ? t.width : undefined;
      let o = t.scale || 4;
      return {
        width: r,
        scale: r ? 4 : o,
        margin: n,
        color: {
          dark: mKl(t.color.dark || "#000000ff"),
          light: mKl(t.color.light || "#ffffffff")
        },
        type: t.type,
        rendererOpts: t.rendererOpts || {}
      };
    };
    MYe.getScale = function (t, n) {
      return n.width && n.width >= t + n.margin * 2 ? n.width / (t + n.margin * 2) : n.scale;
    };
    MYe.getImageWidth = function (t, n) {
      let r = MYe.getScale(t, n);
      return Math.floor((t + n.margin * 2) * r);
    };
    MYe.qrToImageData = function (t, n, r) {
      let o = n.modules.size;
      let s = n.modules.data;
      let i = MYe.getScale(o, r);
      let a = Math.floor((o + r.margin * 2) * i);
      let l = r.margin * i;
      let c = [r.color.light, r.color.dark];
      for (let u = 0; u < a; u++) {
        for (let d = 0; d < a; d++) {
          let p = (u * a + d) * 4;
          let m = r.color.light;
          if (u >= l && d >= l && u < a - l && d < a - l) {
            let f = Math.floor((u - l) / i);
            let h = Math.floor((d - l) / i);
            m = c[s[f * o + h] ? 1 : 0];
          }
          t[p++] = m.r;
          t[p++] = m.g;
          t[p++] = m.b;
          t[p] = m.a;
        }
      }
    };
  });
  var fKl = __commonJS(qfe => {
    var Xzm = require("fs");
    var Qzm = pKl().PNG;
    var uWo = HZt();
    qfe.render = function (t, n) {
      let r = uWo.getOptions(n);
      let o = r.rendererOpts;
      let s = uWo.getImageWidth(t.modules.size, r);
      o.width = s;
      o.height = s;
      let i = new Qzm(o);
      uWo.qrToImageData(i.data, t, r);
      return i;
    };
    qfe.renderToDataURL = function (t, n, r) {
      if (typeof r > "u") {
        r = n;
        n = undefined;
      }
      qfe.renderToBuffer(t, n, function (o, s) {
        if (o) {
          r(o);
        }
        let i = "data:image/png;base64,";
        i += s.toString("base64");
        r(null, i);
      });
    };
    qfe.renderToBuffer = function (t, n, r) {
      if (typeof r > "u") {
        r = n;
        n = undefined;
      }
      let o = qfe.render(t, n);
      let s = [];
      o.on("error", r);
      o.on("data", function (i) {
        s.push(i);
      });
      o.on("end", function () {
        r(null, Buffer.concat(s));
      });
      o.pack();
    };
    qfe.renderToFile = function (t, n, r, o) {
      if (typeof o > "u") {
        o = r;
        r = undefined;
      }
      let s = false;
      let i = (...l) => {
        if (s) {
          return;
        }
        s = true;
        o.apply(null, l);
      };
      let a = Xzm.createWriteStream(t);
      a.on("error", i);
      a.on("close", i);
      qfe.renderToFileStream(a, n, r);
    };
    qfe.renderToFileStream = function (t, n, r) {
      qfe.render(n, r).pack().pipe(t);
    };
  });
  var hKl = __commonJS(glr => {
    var Zzm = HZt();
    var eKm = {
      WW: " ",
      WB: "\u2584",
      BB: "\u2588",
      BW: "\u2580"
    };
    var tKm = {
      BB: " ",
      BW: "\u2584",
      WW: "\u2588",
      WB: "\u2580"
    };
    function nKm(e, t, n) {
      if (e && t) {
        return n.BB;
      }
      if (e && !t) {
        return n.BW;
      }
      if (!e && t) {
        return n.WB;
      }
      return n.WW;
    }
    glr.render = function (e, t, n) {
      let r = Zzm.getOptions(t);
      let o = eKm;
      if (r.color.dark.hex === "#ffffff" || r.color.light.hex === "#000000") {
        o = tKm;
      }
      let s = e.modules.size;
      let i = e.modules.data;
      let a = "";
      let l = Array(s + r.margin * 2 + 1).join(o.WW);
      l = Array(r.margin / 2 + 1).join(l + `
`);
      let c = Array(r.margin + 1).join(o.WW);
      a += l;
      for (let u = 0; u < s; u += 2) {
        a += c;
        for (let d = 0; d < s; d++) {
          let p = i[u * s + d];
          let m = i[(u + 1) * s + d];
          a += nKm(p, m, o);
        }
        a += c + `
`;
      }
      if (a += l.slice(0, -1), typeof n === "function") {
        n(null, a);
      }
      return a;
    };
    glr.renderToFile = function (t, n, r, o) {
      if (typeof o > "u") {
        o = r;
        r = undefined;
      }
      let s = require("fs");
      let i = glr.render(n, r);
      s.writeFile(t, i, o);
    };
  });
  var yKl = __commonJS(gKl => {
    gKl.render = function (e, t, n) {
      let r = e.modules.size;
      let o = e.modules.data;
      let s = "\x1B[40m  \x1B[0m";
      let i = "\x1B[47m  \x1B[0m";
      let a = "";
      let l = Array(r + 3).join("\x1B[47m  \x1B[0m");
      let c = Array(2).join("\x1B[47m  \x1B[0m");
      a += l + `
`;
      for (let u = 0; u < r; ++u) {
        a += "\x1B[47m  \x1B[0m";
        for (let d = 0; d < r; d++) {
          a += o[u * r + d] ? "\x1B[40m  \x1B[0m" : "\x1B[47m  \x1B[0m";
        }
        a += c + `
`;
      }
      if (a += l + `
`, typeof n === "function") {
        n(null, a);
      }
      return a;
    };
  });
  var TKl = __commonJS(SKl => {
    var sKm = function (e, t, n) {
      return {
        "00": "\x1B[0m " + e,
        "01": "\x1B[0m" + t + "\u2584" + e,
        "02": "\x1B[0m" + n + "\u2584" + e,
        10: "\x1B[0m" + t + "\u2580" + e,
        11: " ",
        12: "\u2584",
        20: "\x1B[0m" + n + "\u2580" + e,
        21: "\u2580",
        22: "\u2588"
      };
    };
    var _Kl = function (e, t, n, r) {
      let o = t + 1;
      if (n >= o || r >= o || r < -1 || n < -1) {
        return "0";
      }
      if (n >= t || r >= t || r < 0 || n < 0) {
        return "1";
      }
      let s = r * t + n;
      return e[s] ? "2" : "1";
    };
    var bKl = function (e, t, n, r) {
      return _Kl(e, t, n, r) + _Kl(e, t, n, r + 1);
    };
    SKl.render = function (e, t, n) {
      let r = e.modules.size;
      let o = e.modules.data;
      let s = !!(t && t.inverse);
      let i = t && t.inverse ? "\x1B[40m\x1B[37m" : "\x1B[47m\x1B[30m";
      let c = sKm(i, s ? "\x1B[30m" : "\x1B[37m", s ? "\x1B[37m" : "\x1B[30m");
      let u = `\x1B[0m
` + i;
      let d = i;
      for (let p = -1; p < r + 1; p += 2) {
        for (let m = -1; m < r; m++) {
          d += c[bKl(o, r, m, p)];
        }
        d += c[bKl(o, r, r, p)] + u;
      }
      if (d += "\x1B[0m", typeof n === "function") {
        n(null, d);
      }
      return d;
    };
  });
  var vKl = __commonJS(EKl => {
    var iKm = yKl();
    var aKm = TKl();
    EKl.render = function (e, t, n) {
      if (t && t.small) {
        return aKm.render(e, t, n);
      }
      return iKm.render(e, t, n);
    };
  });
  var pWo = __commonJS(CKl => {
    var lKm = HZt();
    function wKl(e, t) {
      let n = e.a / 255;
      let r = t + '="' + e.hex + '"';
      return n < 1 ? r + " " + t + '-opacity="' + n.toFixed(2).slice(1) + '"' : r;
    }
    function dWo(e, t, n) {
      let r = e + t;
      if (typeof n < "u") {
        r += " " + n;
      }
      return r;
    }
    function cKm(e, t, n) {
      let r = "";
      let o = 0;
      let s = false;
      let i = 0;
      for (let a = 0; a < e.length; a++) {
        let l = Math.floor(a % t);
        let c = Math.floor(a / t);
        if (!l && !s) {
          s = true;
        }
        if (e[a]) {
          if (i++, !(a > 0 && l > 0 && e[a - 1])) {
            r += s ? dWo("M", l + n, 0.5 + c + n) : dWo("m", o, 0);
            o = 0;
            s = false;
          }
          if (!(l + 1 < t && e[a + 1])) {
            r += dWo("h", i);
            i = 0;
          }
        } else {
          o++;
        }
      }
      return r;
    }
    CKl.render = function (t, n, r) {
      let o = lKm.getOptions(n);
      let s = t.modules.size;
      let i = t.modules.data;
      let a = s + o.margin * 2;
      let l = !o.color.light.a ? "" : "<path " + wKl(o.color.light, "fill") + ' d="M0 0h' + a + "v" + a + 'H0z"/>';
      let c = "<path " + wKl(o.color.dark, "stroke") + ' d="' + cKm(i, s, o.margin) + '"/>';
      let u = 'viewBox="0 0 ' + a + " " + a + '"';
      let p = '<svg xmlns="http://www.w3.org/2000/svg" ' + (!o.width ? "" : 'width="' + o.width + '" height="' + o.width + '" ') + u + ' shape-rendering="crispEdges">' + l + c + `</svg>
`;
      if (typeof r === "function") {
        r(null, p);
      }
      return p;
    };
  });
  var RKl = __commonJS(ylr => {
    var uKm = pWo();
    ylr.render = uKm.render;
    ylr.renderToFile = function (t, n, r, o) {
      if (typeof o > "u") {
        o = r;
        r = undefined;
      }
      let s = require("fs");
      let a = '<?xml version="1.0" encoding="utf-8"?><!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">' + ylr.render(n, r);
      s.writeFile(t, a, o);
    };
  });
  var xKl = __commonJS(_lr => {
    var mWo = HZt();
    function dKm(e, t, n) {
      if (e.clearRect(0, 0, t.width, t.height), !t.style) {
        t.style = {};
      }
      t.height = n;
      t.width = n;
      t.style.height = n + "px";
      t.style.width = n + "px";
    }
    function pKm() {
      try {
        return document.createElement("canvas");
      } catch (e) {
        throw Error("You need to specify a canvas element");
      }
    }
    _lr.render = function (t, n, r) {
      let o = r;
      let s = n;
      if (typeof o > "u" && (!n || !n.getContext)) {
        o = n;
        n = undefined;
      }
      if (!n) {
        s = pKm();
      }
      o = mWo.getOptions(o);
      let i = mWo.getImageWidth(t.modules.size, o);
      let a = s.getContext("2d");
      let l = a.createImageData(i, i);
      mWo.qrToImageData(l.data, t, o);
      dKm(a, s, i);
      a.putImageData(l, 0, 0);
      return s;
    };
    _lr.renderToDataURL = function (t, n, r) {
      let o = r;
      if (typeof o > "u" && (!n || !n.getContext)) {
        o = n;
        n = undefined;
      }
      if (!o) {
        o = {};
      }
      let s = _lr.render(t, n, o);
      let i = o.type || "image/png";
      let a = o.rendererOpts || {};
      return s.toDataURL(i, a.quality);
    };
  });
  var AKl = __commonJS(jZt => {
    var mKm = A4o();
    var fWo = K4o();
    var kKl = xKl();
    var fKm = pWo();
    function hWo(e, t, n, r, o) {
      let s = [].slice.call(arguments, 1);
      let i = s.length;
      let a = typeof s[i - 1] === "function";
      if (!a && !mKm()) {
        throw Error("Callback required as last argument");
      }
      if (a) {
        if (i < 2) {
          throw Error("Too few arguments provided");
        }
        if (i === 2) {
          o = n;
          n = t;
          t = r = undefined;
        } else if (i === 3) {
          if (t.getContext && typeof o > "u") {
            o = r;
            r = undefined;
          } else {
            o = r;
            r = n;
            n = t;
            t = undefined;
          }
        }
      } else {
        if (i < 1) {
          throw Error("Too few arguments provided");
        }
        if (i === 1) {
          n = t;
          t = r = undefined;
        } else if (i === 2 && !t.getContext) {
          r = n;
          n = t;
          t = undefined;
        }
        return new Promise(function (l, c) {
          try {
            let u = fWo.create(n, r);
            l(e(u, t, r));
          } catch (u) {
            c(u);
          }
        });
      }
      try {
        let l = fWo.create(n, r);
        o(null, e(l, t, r));
      } catch (l) {
        o(l);
      }
    }
    jZt.create = fWo.create;
    jZt.toCanvas = hWo.bind(null, kKl.render);
    jZt.toDataURL = hWo.bind(null, kKl.renderToDataURL);
    jZt.toString = hWo.bind(null, function (e, t, n) {
      return fKm.render(e, n);
    });
  });
  var DKl = __commonJS(FUe => {
    var IKl = A4o();
    var gWo = K4o();
    var hKm = fKl();
    var PKl = hKl();
    var gKm = vKl();
    var OKl = RKl();
    function qZt(e, t, n) {
      if (typeof e > "u") {
        throw Error("String required as first argument");
      }
      if (typeof n > "u") {
        n = t;
        t = {};
      }
      if (typeof n !== "function") {
        if (!IKl()) {
          throw Error("Callback required as last argument");
        } else {
          t = n || {};
          n = null;
        }
      }
      return {
        opts: t,
        cb: n
      };
    }
    function yKm(e) {
      return e.slice((e.lastIndexOf(".") - 1 >>> 0) + 2).toLowerCase();
    }
    function blr(e) {
      switch (e) {
        case "svg":
          return OKl;
        case "txt":
        case "utf8":
          return PKl;
        case "png":
        case "image/png":
        default:
          return hKm;
      }
    }
    function _Km(e) {
      switch (e) {
        case "svg":
          return OKl;
        case "terminal":
          return gKm;
        case "utf8":
        default:
          return PKl;
      }
    }
    function WZt(e, t, n) {
      if (!n.cb) {
        return new Promise(function (r, o) {
          try {
            let s = gWo.create(t, n.opts);
            return e(s, n.opts, function (i, a) {
              return i ? o(i) : r(a);
            });
          } catch (s) {
            o(s);
          }
        });
      }
      try {
        let r = gWo.create(t, n.opts);
        return e(r, n.opts, n.cb);
      } catch (r) {
        n.cb(r);
      }
    }
    FUe.create = gWo.create;
    FUe.toCanvas = AKl().toCanvas;
    FUe.toString = function (t, n, r) {
      let o = qZt(t, n, r);
      let s = o.opts ? o.opts.type : undefined;
      let i = _Km(s);
      return WZt(i.render, t, o);
    };
    FUe.toDataURL = function (t, n, r) {
      let o = qZt(t, n, r);
      let s = blr(o.opts.type);
      return WZt(s.renderToDataURL, t, o);
    };
    FUe.toBuffer = function (t, n, r) {
      let o = qZt(t, n, r);
      let s = blr(o.opts.type);
      return WZt(s.renderToBuffer, t, o);
    };
    FUe.toFile = function (t, n, r, o) {
      if (typeof t !== "string" || !(typeof n === "string" || typeof n === "object")) {
        throw Error("Invalid argument");
      }
      if (arguments.length < 3 && !IKl()) {
        throw Error("Too few arguments provided");
      }
      let s = qZt(n, r, o);
      let i = s.opts.type || yKm(t);
      let l = blr(i).renderToFile.bind(null, t);
      return WZt(l, n, s);
    };
    FUe.toFileStream = function (t, n, r) {
      if (arguments.length < 2) {
        throw Error("Too few arguments provided");
      }
      let o = qZt(n, r, t.emit.bind(t, "error"));
      let i = blr("png").renderToFileStream.bind(null, t);
      WZt(i, n, o);
    };
  });
  var Iwt = __commonJS((WmT, MKl) => {
    MKl.exports = DKl();
  });