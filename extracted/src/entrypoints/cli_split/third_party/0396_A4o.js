  var A4o = __commonJS((jpT, PVl) => {
    PVl.exports = function () {
      return typeof Promise === "function" && Promise.prototype && Promise.prototype.then;
    };
  });
  var PUe = __commonJS(IYe => {
    var I4o;
    var lVm = [0, 26, 44, 70, 100, 134, 172, 196, 242, 292, 346, 404, 466, 532, 581, 655, 733, 815, 901, 991, 1085, 1156, 1258, 1364, 1474, 1588, 1706, 1828, 1921, 2051, 2185, 2323, 2465, 2611, 2761, 2876, 3034, 3196, 3362, 3532, 3706];
    IYe.getSymbolSize = function (t) {
      if (!t) {
        throw Error('"version" cannot be null or undefined');
      }
      if (t < 1 || t > 40) {
        throw Error('"version" should be in range from 1 to 40');
      }
      return t * 4 + 17;
    };
    IYe.getSymbolTotalCodewords = function (t) {
      return lVm[t];
    };
    IYe.getBCHDigit = function (e) {
      let t = 0;
      while (e !== 0) {
        t++;
        e >>>= 1;
      }
      return t;
    };
    IYe.setToSJISFunction = function (t) {
      if (typeof t !== "function") {
        throw Error('"toSJISFunc" is not a valid function.');
      }
      I4o = t;
    };
    IYe.isKanjiModeEnabled = function () {
      return typeof I4o < "u";
    };
    IYe.toSJIS = function (t) {
      return I4o(t);
    };
  });
  var ilr = __commonJS(ZZ => {
    ZZ.L = {
      bit: 1
    };
    ZZ.M = {
      bit: 0
    };
    ZZ.Q = {
      bit: 3
    };
    ZZ.H = {
      bit: 2
    };
    function cVm(e) {
      if (typeof e !== "string") {
        throw Error("Param is not a string");
      }
      switch (e.toLowerCase()) {
        case "l":
        case "low":
          return ZZ.L;
        case "m":
        case "medium":
          return ZZ.M;
        case "q":
        case "quartile":
          return ZZ.Q;
        case "h":
        case "high":
          return ZZ.H;
        default:
          throw Error("Unknown EC Level: " + e);
      }
    }
    ZZ.isValid = function (t) {
      return t && typeof t.bit < "u" && t.bit >= 0 && t.bit < 4;
    };
    ZZ.from = function (t, n) {
      if (ZZ.isValid(t)) {
        return t;
      }
      try {
        return cVm(t);
      } catch (r) {
        return n;
      }
    };
  });
  var MVl = __commonJS((GpT, DVl) => {
    function OVl() {
      this.buffer = [];
      this.length = 0;
    }
    OVl.prototype = {
      get: function (e) {
        let t = Math.floor(e / 8);
        return (this.buffer[t] >>> 7 - e % 8 & 1) === 1;
      },
      put: function (e, t) {
        for (let n = 0; n < t; n++) {
          this.putBit((e >>> t - n - 1 & 1) === 1);
        }
      },
      getLengthInBits: function () {
        return this.length;
      },
      putBit: function (e) {
        let t = Math.floor(this.length / 8);
        if (this.buffer.length <= t) {
          this.buffer.push(0);
        }
        if (e) {
          this.buffer[t] |= 128 >>> this.length % 8;
        }
        this.length++;
      }
    };
    DVl.exports = OVl;
  });
  var LVl = __commonJS((VpT, NVl) => {
    function DZt(e) {
      if (!e || e < 1) {
        throw Error("BitMatrix size must be defined and greater than 0");
      }
      this.size = e;
      this.data = new Uint8Array(e * e);
      this.reservedBit = new Uint8Array(e * e);
    }
    DZt.prototype.set = function (e, t, n, r) {
      let o = e * this.size + t;
      if (this.data[o] = n, r) {
        this.reservedBit[o] = true;
      }
    };
    DZt.prototype.get = function (e, t) {
      return this.data[e * this.size + t];
    };
    DZt.prototype.xor = function (e, t, n) {
      this.data[e * this.size + t] ^= n;
    };
    DZt.prototype.isReserved = function (e, t) {
      return this.reservedBit[e * this.size + t];
    };
    NVl.exports = DZt;
  });
  var FVl = __commonJS(alr => {
    var uVm = PUe().getSymbolSize;
    alr.getRowColCoords = function (t) {
      if (t === 1) {
        return [];
      }
      let n = Math.floor(t / 7) + 2;
      let r = uVm(t);
      let o = r === 145 ? 26 : Math.ceil((r - 13) / (2 * n - 2)) * 2;
      let s = [r - 7];
      for (let i = 1; i < n - 1; i++) {
        s[i] = s[i - 1] - o;
      }
      s.push(6);
      return s.reverse();
    };
    alr.getPositions = function (t) {
      let n = [];
      let r = alr.getRowColCoords(t);
      let o = r.length;
      for (let s = 0; s < o; s++) {
        for (let i = 0; i < o; i++) {
          if (s === 0 && i === 0 || s === 0 && i === o - 1 || s === o - 1 && i === 0) {
            continue;
          }
          n.push([r[s], r[i]]);
        }
      }
      return n;
    };
  });
  var BVl = __commonJS(UVl => {
    var dVm = PUe().getSymbolSize;
    UVl.getPositions = function (t) {
      let n = dVm(t);
      return [[0, 0], [n - 7, 0], [0, n - 7]];
    };
  });