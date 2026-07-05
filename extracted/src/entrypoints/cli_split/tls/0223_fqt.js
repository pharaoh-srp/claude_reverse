  var fqt = __commonJS((hIy, Sna) => {
    var Gso = wf();
    Sna.exports = Gso.jsbn = Gso.jsbn || {};
    var FSe;
    var mna = (244837814094590 & 16777215) == 15715070;
    function Gs(e, t, n) {
      if (this.data = [], e != null) {
        if (typeof e == "number") {
          this.fromNumber(e, t, n);
        } else if (t == null && typeof e != "string") {
          this.fromString(e, 256);
        } else {
          this.fromString(e, t);
        }
      }
    }
    Gso.jsbn.BigInteger = Gs;
    function Oy() {
      return new Gs(null);
    }
    function yip(e, t, n, r, o, s) {
      while (--s >= 0) {
        var i = t * this.data[e++] + n.data[r] + o;
        o = Math.floor(i / 67108864);
        n.data[r++] = i & 67108863;
      }
      return o;
    }
    function _ip(e, t, n, r, o, s) {
      var i = t & 32767;
      var a = t >> 15;
      while (--s >= 0) {
        var l = this.data[e] & 32767;
        var c = this.data[e++] >> 15;
        var u = a * l + c * i;
        l = i * l + ((u & 32767) << 15) + n.data[r] + (o & 1073741823);
        o = (l >>> 30) + (u >>> 15) + a * c + (o >>> 30);
        n.data[r++] = l & 1073741823;
      }
      return o;
    }
    function fna(e, t, n, r, o, s) {
      var i = t & 16383;
      var a = t >> 14;
      while (--s >= 0) {
        var l = this.data[e] & 16383;
        var c = this.data[e++] >> 14;
        var u = a * l + c * i;
        l = i * l + ((u & 16383) << 14) + n.data[r] + o;
        o = (l >> 28) + (u >> 14) + a * c;
        n.data[r++] = l & 268435455;
      }
      return o;
    }
    if (typeof navigator > "u") {
      Gs.prototype.am = fna;
      FSe = 28;
    } else if (mna && navigator.appName == "Microsoft Internet Explorer") {
      Gs.prototype.am = _ip;
      FSe = 30;
    } else if (mna && navigator.appName != "Netscape") {
      Gs.prototype.am = yip;
      FSe = 26;
    } else {
      Gs.prototype.am = fna;
      FSe = 28;
    }
    Gs.prototype.DB = FSe;
    Gs.prototype.DM = (1 << FSe) - 1;
    Gs.prototype.DV = 1 << FSe;
    Gs.prototype.FV = Math.pow(2, 52);
    Gs.prototype.F1 = 52 - FSe;
    Gs.prototype.F2 = 2 * FSe - 52;
    var QFn = [];
    var Lut;
    var cX;
    Lut = 48;
    for (cX = 0; cX <= 9; ++cX) {
      QFn[Lut++] = cX;
    }
    Lut = 97;
    for (cX = 10; cX < 36; ++cX) {
      QFn[Lut++] = cX;
    }
    Lut = 65;
    for (cX = 10; cX < 36; ++cX) {
      QFn[Lut++] = cX;
    }
    function hna(e) {
      return ("0123456789abcdefghijklmnopqrstuvwxyz").charAt(e);
    }
    function gna(e, t) {
      var n = QFn[e.charCodeAt(t)];
      return n == null ? -1 : n;
    }
    function Sip(e) {
      for (var t = this.t - 1; t >= 0; --t) {
        e.data[t] = this.data[t];
      }
      e.t = this.t;
      e.s = this.s;
    }
    function Tip(e) {
      if (this.t = 1, this.s = e < 0 ? -1 : 0, e > 0) {
        this.data[0] = e;
      } else if (e < -1) {
        this.data[0] = e + this.DV;
      } else {
        this.t = 0;
      }
    }
    function EOe(e) {
      var t = Oy();
      t.fromInt(e);
      return t;
    }
    function Eip(e, t) {
      var n;
      if (t == 16) {
        n = 4;
      } else if (t == 8) {
        n = 3;
      } else if (t == 256) {
        n = 8;
      } else if (t == 2) {
        n = 1;
      } else if (t == 32) {
        n = 5;
      } else if (t == 4) {
        n = 2;
      } else {
        this.fromRadix(e, t);
        return;
      }
      this.t = 0;
      this.s = 0;
      var r = e.length;
      var o = false;
      var s = 0;
      while (--r >= 0) {
        var i = n == 8 ? e[r] & 255 : gna(e, r);
        if (i < 0) {
          if (e.charAt(r) == "-") {
            o = true;
          }
          continue;
        }
        if (o = false, s == 0) {
          this.data[this.t++] = i;
        } else if (s + n > this.DB) {
          this.data[this.t - 1] |= (i & (1 << this.DB - s) - 1) << s;
          this.data[this.t++] = i >> this.DB - s;
        } else {
          this.data[this.t - 1] |= i << s;
        }
        if (s += n, s >= this.DB) {
          s -= this.DB;
        }
      }
      if (n == 8 && (e[0] & 128) != 0) {
        if (this.s = -1, s > 0) {
          this.data[this.t - 1] |= (1 << this.DB - s) - 1 << s;
        }
      }
      if (this.clamp(), o) {
        Gs.ZERO.subTo(this, this);
      }
    }
    function vip() {
      var e = this.s & this.DM;
      while (this.t > 0 && this.data[this.t - 1] == e) {
        --this.t;
      }
    }
    function wip(e) {
      if (this.s < 0) {
        return "-" + this.negate().toString(e);
      }
      var t;
      if (e == 16) {
        t = 4;
      } else if (e == 8) {
        t = 3;
      } else if (e == 2) {
        t = 1;
      } else if (e == 32) {
        t = 5;
      } else if (e == 4) {
        t = 2;
      } else {
        return this.toRadix(e);
      }
      var n = (1 << t) - 1;
      var r;
      var o = false;
      var s = "";
      var i = this.t;
      var a = this.DB - i * this.DB % t;
      if (i-- > 0) {
        if (a < this.DB && (r = this.data[i] >> a) > 0) {
          o = true;
          s = hna(r);
        }
        while (i >= 0) {
          if (a < t) {
            r = (this.data[i] & (1 << a) - 1) << t - a;
            r |= this.data[--i] >> (a += this.DB - t);
          } else if (r = this.data[i] >> (a -= t) & n, a <= 0) {
            a += this.DB;
            --i;
          }
          if (r > 0) {
            o = true;
          }
          if (o) {
            s += hna(r);
          }
        }
      }
      return o ? s : "0";
    }
    function Cip() {
      var e = Oy();
      Gs.ZERO.subTo(this, e);
      return e;
    }
    function Rip() {
      return this.s < 0 ? this.negate() : this;
    }
    function xip(e) {
      var t = this.s - e.s;
      if (t != 0) {
        return t;
      }
      var n = this.t;
      if (t = n - e.t, t != 0) {
        return this.s < 0 ? -t : t;
      }
      while (--n >= 0) {
        if ((t = this.data[n] - e.data[n]) != 0) {
          return t;
        }
      }
      return 0;
    }
    function ZFn(e) {
      var t = 1;
      var n;
      if ((n = e >>> 16) != 0) {
        e = n;
        t += 16;
      }
      if ((n = e >> 8) != 0) {
        e = n;
        t += 8;
      }
      if ((n = e >> 4) != 0) {
        e = n;
        t += 4;
      }
      if ((n = e >> 2) != 0) {
        e = n;
        t += 2;
      }
      if ((n = e >> 1) != 0) {
        e = n;
        t += 1;
      }
      return t;
    }
    function kip() {
      if (this.t <= 0) {
        return 0;
      }
      return this.DB * (this.t - 1) + ZFn(this.data[this.t - 1] ^ this.s & this.DM);
    }
    function Aip(e, t) {
      var n;
      for (n = this.t - 1; n >= 0; --n) {
        t.data[n + e] = this.data[n];
      }
      for (n = e - 1; n >= 0; --n) {
        t.data[n] = 0;
      }
      t.t = this.t + e;
      t.s = this.s;
    }
    function Iip(e, t) {
      for (var n = e; n < this.t; ++n) {
        t.data[n - e] = this.data[n];
      }
      t.t = Math.max(this.t - e, 0);
      t.s = this.s;
    }
    function Pip(e, t) {
      var n = e % this.DB;
      var r = this.DB - n;
      var o = (1 << r) - 1;
      var s = Math.floor(e / this.DB);
      var i = this.s << n & this.DM;
      var a;
      for (a = this.t - 1; a >= 0; --a) {
        t.data[a + s + 1] = this.data[a] >> r | i;
        i = (this.data[a] & o) << n;
      }
      for (a = s - 1; a >= 0; --a) {
        t.data[a] = 0;
      }
      t.data[s] = i;
      t.t = this.t + s + 1;
      t.s = this.s;
      t.clamp();
    }
    function Oip(e, t) {
      t.s = this.s;
      var n = Math.floor(e / this.DB);
      if (n >= this.t) {
        t.t = 0;
        return;
      }
      var r = e % this.DB;
      var o = this.DB - r;
      var s = (1 << r) - 1;
      t.data[0] = this.data[n] >> r;
      for (var i = n + 1; i < this.t; ++i) {
        t.data[i - n - 1] |= (this.data[i] & s) << o;
        t.data[i - n] = this.data[i] >> r;
      }
      if (r > 0) {
        t.data[this.t - n - 1] |= (this.s & s) << o;
      }
      t.t = this.t - n;
      t.clamp();
    }
    function Dip(e, t) {
      var n = 0;
      var r = 0;
      var o = Math.min(e.t, this.t);
      while (n < o) {
        r += this.data[n] - e.data[n];
        t.data[n++] = r & this.DM;
        r >>= this.DB;
      }
      if (e.t < this.t) {
        r -= e.s;
        while (n < this.t) {
          r += this.data[n];
          t.data[n++] = r & this.DM;
          r >>= this.DB;
        }
        r += this.s;
      } else {
        r += this.s;
        while (n < e.t) {
          r -= e.data[n];
          t.data[n++] = r & this.DM;
          r >>= this.DB;
        }
        r -= e.s;
      }
      if (t.s = r < 0 ? -1 : 0, r < -1) {
        t.data[n++] = this.DV + r;
      } else if (r > 0) {
        t.data[n++] = r;
      }
      t.t = n;
      t.clamp();
    }
    function Mip(e, t) {
      var n = this.abs();
      var r = e.abs();
      var o = n.t;
      t.t = o + r.t;
      while (--o >= 0) {
        t.data[o] = 0;
      }
      for (o = 0; o < r.t; ++o) {
        t.data[o + n.t] = n.am(0, r.data[o], t, o, 0, n.t);
      }
      if (t.s = 0, t.clamp(), this.s != e.s) {
        Gs.ZERO.subTo(t, t);
      }
    }
    function Nip(e) {
      var t = this.abs();
      var n = e.t = 2 * t.t;
      while (--n >= 0) {
        e.data[n] = 0;
      }
      for (n = 0; n < t.t - 1; ++n) {
        var r = t.am(n, t.data[n], e, 2 * n, 0, 1);
        if ((e.data[n + t.t] += t.am(n + 1, 2 * t.data[n], e, 2 * n + 1, r, t.t - n - 1)) >= t.DV) {
          e.data[n + t.t] -= t.DV;
          e.data[n + t.t + 1] = 1;
        }
      }
      if (e.t > 0) {
        e.data[e.t - 1] += t.am(n, t.data[n], e, 2 * n, 0, 1);
      }
      e.s = 0;
      e.clamp();
    }
    function Lip(e, t, n) {
      var r = e.abs();
      if (r.t <= 0) {
        return;
      }
      var o = this.abs();
      if (o.t < r.t) {
        if (t != null) {
          t.fromInt(0);
        }
        if (n != null) {
          this.copyTo(n);
        }
        return;
      }
      if (n == null) {
        n = Oy();
      }
      var s = Oy();
      var i = this.s;
      var a = e.s;
      var l = this.DB - ZFn(r.data[r.t - 1]);
      if (l > 0) {
        r.lShiftTo(l, s);
        o.lShiftTo(l, n);
      } else {
        r.copyTo(s);
        o.copyTo(n);
      }
      var c = s.t;
      var u = s.data[c - 1];
      if (u == 0) {
        return;
      }
      var d = u * (1 << this.F1) + (c > 1 ? s.data[c - 2] >> this.F2 : 0);
      var p = this.FV / d;
      var m = (1 << this.F1) / d;
      var f = 1 << this.F2;
      var h = n.t;
      var g = h - c;
      var y = t == null ? Oy() : t;
      if (s.dlShiftTo(g, y), n.compareTo(y) >= 0) {
        n.data[n.t++] = 1;
        n.subTo(y, n);
      }
      Gs.ONE.dlShiftTo(c, y);
      y.subTo(s, s);
      while (s.t < c) {
        s.data[s.t++] = 0;
      }
      while (--g >= 0) {
        var _ = n.data[--h] == u ? this.DM : Math.floor(n.data[h] * p + (n.data[h - 1] + f) * m);
        if ((n.data[h] += s.am(0, _, n, g, 0, c)) < _) {
          s.dlShiftTo(g, y);
          n.subTo(y, n);
          while (n.data[h] < --_) {
            n.subTo(y, n);
          }
        }
      }
      if (t != null) {
        if (n.drShiftTo(c, t), i != a) {
          Gs.ZERO.subTo(t, t);
        }
      }
      if (n.t = c, n.clamp(), l > 0) {
        n.rShiftTo(l, n);
      }
      if (i < 0) {
        Gs.ZERO.subTo(n, n);
      }
    }
    function Fip(e) {
      var t = Oy();
      if (this.abs().divRemTo(e, null, t), this.s < 0 && t.compareTo(Gs.ZERO) > 0) {
        e.subTo(t, t);
      }
      return t;
    }
    function FGe(e) {
      this.m = e;
    }
    function Uip(e) {
      if (e.s < 0 || e.compareTo(this.m) >= 0) {
        return e.mod(this.m);
      } else {
        return e;
      }
    }
    function Bip(e) {
      return e;
    }
    function $ip(e) {
      e.divRemTo(this.m, null, e);
    }
    function Hip(e, t, n) {
      e.multiplyTo(t, n);
      this.reduce(n);
    }
    function jip(e, t) {
      e.squareTo(t);
      this.reduce(t);
    }
    FGe.prototype.convert = Uip;
    FGe.prototype.revert = Bip;
    FGe.prototype.reduce = $ip;
    FGe.prototype.mulTo = Hip;
    FGe.prototype.sqrTo = jip;
    function qip() {
      if (this.t < 1) {
        return 0;
      }
      var e = this.data[0];
      if ((e & 1) == 0) {
        return 0;
      }
      var t = e & 3;
      t = t * (2 - (e & 15) * t) & 15;
      t = t * (2 - (e & 255) * t) & 255;
      t = t * (2 - ((e & 65535) * t & 65535)) & 65535;
      t = t * (2 - e * t % this.DV) % this.DV;
      return t > 0 ? this.DV - t : -t;
    }
    function UGe(e) {
      this.m = e;
      this.mp = e.invDigit();
      this.mpl = this.mp & 32767;
      this.mph = this.mp >> 15;
      this.um = (1 << e.DB - 15) - 1;
      this.mt2 = 2 * e.t;
    }
    function Wip(e) {
      var t = Oy();
      if (e.abs().dlShiftTo(this.m.t, t), t.divRemTo(this.m, null, t), e.s < 0 && t.compareTo(Gs.ZERO) > 0) {
        this.m.subTo(t, t);
      }
      return t;
    }
    function Gip(e) {
      var t = Oy();
      e.copyTo(t);
      this.reduce(t);
      return t;
    }
    function Vip(e) {
      while (e.t <= this.mt2) {
        e.data[e.t++] = 0;
      }
      for (var t = 0; t < this.m.t; ++t) {
        var n = e.data[t] & 32767;
        var r = n * this.mpl + ((n * this.mph + (e.data[t] >> 15) * this.mpl & this.um) << 15) & e.DM;
        n = t + this.m.t;
        e.data[n] += this.m.am(0, r, e, t, 0, this.m.t);
        while (e.data[n] >= e.DV) {
          e.data[n] -= e.DV;
          e.data[++n]++;
        }
      }
      if (e.clamp(), e.drShiftTo(this.m.t, e), e.compareTo(this.m) >= 0) {
        e.subTo(this.m, e);
      }
    }
    function zip(e, t) {
      e.squareTo(t);
      this.reduce(t);
    }
    function Kip(e, t, n) {
      e.multiplyTo(t, n);
      this.reduce(n);
    }
    UGe.prototype.convert = Wip;
    UGe.prototype.revert = Gip;
    UGe.prototype.reduce = Vip;
    UGe.prototype.mulTo = Kip;
    UGe.prototype.sqrTo = zip;
    function Yip() {
      return (this.t > 0 ? this.data[0] & 1 : this.s) == 0;
    }
    function Jip(e, t) {
      if (e > 4294967295 || e < 1) {
        return Gs.ONE;
      }
      var n = Oy();
      var r = Oy();
      var o = t.convert(this);
      var s = ZFn(e) - 1;
      o.copyTo(n);
      while (--s >= 0) {
        if (t.sqrTo(n, r), (e & 1 << s) > 0) {
          t.mulTo(r, o, n);
        } else {
          var i = n;
          n = r;
          r = i;
        }
      }
      return t.revert(n);
    }
    function Xip(e, t) {
      var n;
      if (e < 256 || t.isEven()) {
        n = new FGe(t);
      } else {
        n = new UGe(t);
      }
      return this.exp(e, n);
    }
    Gs.prototype.copyTo = Sip;
    Gs.prototype.fromInt = Tip;
    Gs.prototype.fromString = Eip;
    Gs.prototype.clamp = vip;
    Gs.prototype.dlShiftTo = Aip;
    Gs.prototype.drShiftTo = Iip;
    Gs.prototype.lShiftTo = Pip;
    Gs.prototype.rShiftTo = Oip;
    Gs.prototype.subTo = Dip;
    Gs.prototype.multiplyTo = Mip;
    Gs.prototype.squareTo = Nip;
    Gs.prototype.divRemTo = Lip;
    Gs.prototype.invDigit = qip;
    Gs.prototype.isEven = Yip;
    Gs.prototype.exp = Jip;
    Gs.prototype.toString = wip;
    Gs.prototype.negate = Cip;
    Gs.prototype.abs = Rip;
    Gs.prototype.compareTo = xip;
    Gs.prototype.bitLength = kip;
    Gs.prototype.mod = Fip;
    Gs.prototype.modPowInt = Xip;
    Gs.ZERO = EOe(0);
    Gs.ONE = EOe(1);
    function Qip() {
      var e = Oy();
      this.copyTo(e);
      return e;
    }
    function Zip() {
      if (this.s < 0) {
        if (this.t == 1) {
          return this.data[0] - this.DV;
        } else if (this.t == 0) {
          return -1;
        }
      } else if (this.t == 1) {
        return this.data[0];
      } else if (this.t == 0) {
        return 0;
      }
      return (this.data[1] & (1 << 32 - this.DB) - 1) << this.DB | this.data[0];
    }
    function eap() {
      return this.t == 0 ? this.s : this.data[0] << 24 >> 24;
    }
    function tap() {
      return this.t == 0 ? this.s : this.data[0] << 16 >> 16;
    }
    function nap(e) {
      return Math.floor(Math.LN2 * this.DB / Math.log(e));
    }
    function rap() {
      if (this.s < 0) {
        return -1;
      } else if (this.t <= 0 || this.t == 1 && this.data[0] <= 0) {
        return 0;
      } else {
        return 1;
      }
    }
    function oap(e) {
      if (e == null) {
        e = 10;
      }
      if (this.signum() == 0 || e < 2 || e > 36) {
        return "0";
      }
      var t = this.chunkSize(e);
      var n = Math.pow(e, t);
      var r = EOe(n);
      var o = Oy();
      var s = Oy();
      var i = "";
      this.divRemTo(r, o, s);
      while (o.signum() > 0) {
        i = (n + s.intValue()).toString(e).substr(1) + i;
        o.divRemTo(r, o, s);
      }
      return s.intValue().toString(e) + i;
    }
    function sap(e, t) {
      if (this.fromInt(0), t == null) {
        t = 10;
      }
      var n = this.chunkSize(t);
      var r = Math.pow(t, n);
      var o = false;
      var s = 0;
      var i = 0;
      for (var a = 0; a < e.length; ++a) {
        var l = gna(e, a);
        if (l < 0) {
          if (e.charAt(a) == "-" && this.signum() == 0) {
            o = true;
          }
          continue;
        }
        if (i = t * i + l, ++s >= n) {
          this.dMultiply(r);
          this.dAddOffset(i, 0);
          s = 0;
          i = 0;
        }
      }
      if (s > 0) {
        this.dMultiply(Math.pow(t, s));
        this.dAddOffset(i, 0);
      }
      if (o) {
        Gs.ZERO.subTo(this, this);
      }
    }
    function iap(e, t, n) {
      if (typeof t == "number") {
        if (e < 2) {
          this.fromInt(1);
        } else {
          if (this.fromNumber(e, n), !this.testBit(e - 1)) {
            this.bitwiseTo(Gs.ONE.shiftLeft(e - 1), zso, this);
          }
          if (this.isEven()) {
            this.dAddOffset(1, 0);
          }
          while (!this.isProbablePrime(t)) {
            if (this.dAddOffset(2, 0), this.bitLength() > e) {
              this.subTo(Gs.ONE.shiftLeft(e - 1), this);
            }
          }
        }
      } else {
        var r = [];
        var o = e & 7;
        if (r.length = (e >> 3) + 1, t.nextBytes(r), o > 0) {
          r[0] &= (1 << o) - 1;
        } else {
          r[0] = 0;
        }
        this.fromString(r, 256);
      }
    }
    function aap() {
      var e = this.t;
      var t = [];
      t[0] = this.s;
      var n = this.DB - e * this.DB % 8;
      var r;
      var o = 0;
      if (e-- > 0) {
        if (n < this.DB && (r = this.data[e] >> n) != (this.s & this.DM) >> n) {
          t[o++] = r | this.s << this.DB - n;
        }
        while (e >= 0) {
          if (n < 8) {
            r = (this.data[e] & (1 << n) - 1) << 8 - n;
            r |= this.data[--e] >> (n += this.DB - 8);
          } else if (r = this.data[e] >> (n -= 8) & 255, n <= 0) {
            n += this.DB;
            --e;
          }
          if ((r & 128) != 0) {
            r |= -256;
          }
          if (o == 0 && (this.s & 128) != (r & 128)) {
            ++o;
          }
          if (o > 0 || r != this.s) {
            t[o++] = r;
          }
        }
      }
      return t;
    }
    function lap(e) {
      return this.compareTo(e) == 0;
    }
    function cap(e) {
      return this.compareTo(e) < 0 ? this : e;
    }
    function uap(e) {
      return this.compareTo(e) > 0 ? this : e;
    }
    function dap(e, t, n) {
      var r;
      var o;
      var s = Math.min(e.t, this.t);
      for (r = 0; r < s; ++r) {
        n.data[r] = t(this.data[r], e.data[r]);
      }
      if (e.t < this.t) {
        o = e.s & this.DM;
        for (r = s; r < this.t; ++r) {
          n.data[r] = t(this.data[r], o);
        }
        n.t = this.t;
      } else {
        o = this.s & this.DM;
        for (r = s; r < e.t; ++r) {
          n.data[r] = t(o, e.data[r]);
        }
        n.t = e.t;
      }
      n.s = t(this.s, e.s);
      n.clamp();
    }
    function pap(e, t) {
      return e & t;
    }
    function map(e) {
      var t = Oy();
      this.bitwiseTo(e, pap, t);
      return t;
    }
    function zso(e, t) {
      return e | t;
    }
    function fap(e) {
      var t = Oy();
      this.bitwiseTo(e, zso, t);
      return t;
    }
    function yna(e, t) {
      return e ^ t;
    }
    function hap(e) {
      var t = Oy();
      this.bitwiseTo(e, yna, t);
      return t;
    }
    function _na(e, t) {
      return e & ~t;
    }
    function gap(e) {
      var t = Oy();
      this.bitwiseTo(e, _na, t);
      return t;
    }
    function yap() {
      var e = Oy();
      for (var t = 0; t < this.t; ++t) {
        e.data[t] = this.DM & ~this.data[t];
      }
      e.t = this.t;
      e.s = ~this.s;
      return e;
    }
    function _ap(e) {
      var t = Oy();
      if (e < 0) {
        this.rShiftTo(-e, t);
      } else {
        this.lShiftTo(e, t);
      }
      return t;
    }
    function bap(e) {
      var t = Oy();
      if (e < 0) {
        this.lShiftTo(-e, t);
      } else {
        this.rShiftTo(e, t);
      }
      return t;
    }
    function Sap(e) {
      if (e == 0) {
        return -1;
      }
      var t = 0;
      if ((e & 65535) == 0) {
        e >>= 16;
        t += 16;
      }
      if ((e & 255) == 0) {
        e >>= 8;
        t += 8;
      }
      if ((e & 15) == 0) {
        e >>= 4;
        t += 4;
      }
      if ((e & 3) == 0) {
        e >>= 2;
        t += 2;
      }
      if ((e & 1) == 0) {
        ++t;
      }
      return t;
    }
    function Tap() {
      for (var e = 0; e < this.t; ++e) {
        if (this.data[e] != 0) {
          return e * this.DB + Sap(this.data[e]);
        }
      }
      if (this.s < 0) {
        return this.t * this.DB;
      }
      return -1;
    }
    function Eap(e) {
      var t = 0;
      while (e != 0) {
        e &= e - 1;
        ++t;
      }
      return t;
    }
    function vap() {
      var e = 0;
      var t = this.s & this.DM;
      for (var n = 0; n < this.t; ++n) {
        e += Eap(this.data[n] ^ t);
      }
      return e;
    }
    function wap(e) {
      var t = Math.floor(e / this.DB);
      if (t >= this.t) {
        return this.s != 0;
      }
      return (this.data[t] & 1 << e % this.DB) != 0;
    }
    function Cap(e, t) {
      var n = Gs.ONE.shiftLeft(e);
      this.bitwiseTo(n, t, n);
      return n;
    }
    function Rap(e) {
      return this.changeBit(e, zso);
    }
    function xap(e) {
      return this.changeBit(e, _na);
    }
    function kap(e) {
      return this.changeBit(e, yna);
    }
    function Aap(e, t) {
      var n = 0;
      var r = 0;
      var o = Math.min(e.t, this.t);
      while (n < o) {
        r += this.data[n] + e.data[n];
        t.data[n++] = r & this.DM;
        r >>= this.DB;
      }
      if (e.t < this.t) {
        r += e.s;
        while (n < this.t) {
          r += this.data[n];
          t.data[n++] = r & this.DM;
          r >>= this.DB;
        }
        r += this.s;
      } else {
        r += this.s;
        while (n < e.t) {
          r += e.data[n];
          t.data[n++] = r & this.DM;
          r >>= this.DB;
        }
        r += e.s;
      }
      if (t.s = r < 0 ? -1 : 0, r > 0) {
        t.data[n++] = r;
      } else if (r < -1) {
        t.data[n++] = this.DV + r;
      }
      t.t = n;
      t.clamp();
    }
    function Iap(e) {
      var t = Oy();
      this.addTo(e, t);
      return t;
    }
    function Pap(e) {
      var t = Oy();
      this.subTo(e, t);
      return t;
    }
    function Oap(e) {
      var t = Oy();
      this.multiplyTo(e, t);
      return t;
    }
    function Dap() {
      var e = Oy();
      this.squareTo(e);
      return e;
    }
    function Nap(e) {
      var t = Oy();
      this.divRemTo(e, t, null);
      return t;
    }
    function Lap(e) {
      var t = Oy();
      this.divRemTo(e, null, t);
      return t;
    }
    function Fap(e) {
      var t = Oy();
      var n = Oy();
      this.divRemTo(e, t, n);
      return [t, n];
    }
    function Uap(e) {
      this.data[this.t] = this.am(0, e - 1, this, 0, 0, this.t);
      ++this.t;
      this.clamp();
    }
    function Bap(e, t) {
      if (e == 0) {
        return;
      }
      while (this.t <= t) {
        this.data[this.t++] = 0;
      }
      this.data[t] += e;
      while (this.data[t] >= this.DV) {
        if (this.data[t] -= this.DV, ++t >= this.t) {
          this.data[this.t++] = 0;
        }
        ++this.data[t];
      }
    }
    function mqt() {}
    function bna(e) {
      return e;
    }
    function $ap(e, t, n) {
      e.multiplyTo(t, n);
    }
    function Hap(e, t) {
      e.squareTo(t);
    }
    mqt.prototype.convert = bna;
    mqt.prototype.revert = bna;
    mqt.prototype.mulTo = $ap;
    mqt.prototype.sqrTo = Hap;
    function jap(e) {
      return this.exp(e, new mqt());
    }
    function qap(e, t, n) {
      var r = Math.min(this.t + e.t, t);
      n.s = 0;
      n.t = r;
      while (r > 0) {
        n.data[--r] = 0;
      }
      var o;
      for (o = n.t - this.t; r < o; ++r) {
        n.data[r + this.t] = this.am(0, e.data[r], n, r, 0, this.t);
      }
      for (o = Math.min(e.t, t); r < o; ++r) {
        this.am(0, e.data[r], n, r, 0, t - r);
      }
      n.clamp();
    }
    function Wap(e, t, n) {
      --t;
      var r = n.t = this.t + e.t - t;
      n.s = 0;
      while (--r >= 0) {
        n.data[r] = 0;
      }
      for (r = Math.max(t - this.t, 0); r < e.t; ++r) {
        n.data[this.t + r - t] = this.am(t - r, e.data[r], n, 0, 0, this.t + r - t);
      }
      n.clamp();
      n.drShiftTo(1, n);
    }
    function Fut(e) {
      this.r2 = Oy();
      this.q3 = Oy();
      Gs.ONE.dlShiftTo(2 * e.t, this.r2);
      this.mu = this.r2.divide(e);
      this.m = e;
    }
    function Gap(e) {
      if (e.s < 0 || e.t > 2 * this.m.t) {
        return e.mod(this.m);
      } else if (e.compareTo(this.m) < 0) {
        return e;
      } else {
        var t = Oy();
        e.copyTo(t);
        this.reduce(t);
        return t;
      }
    }
    function Vap(e) {
      return e;
    }
    function zap(e) {
      if (e.drShiftTo(this.m.t - 1, this.r2), e.t > this.m.t + 1) {
        e.t = this.m.t + 1;
        e.clamp();
      }
      this.mu.multiplyUpperTo(this.r2, this.m.t + 1, this.q3);
      this.m.multiplyLowerTo(this.q3, this.m.t + 1, this.r2);
      while (e.compareTo(this.r2) < 0) {
        e.dAddOffset(1, this.m.t + 1);
      }
      e.subTo(this.r2, e);
      while (e.compareTo(this.m) >= 0) {
        e.subTo(this.m, e);
      }
    }
    function Kap(e, t) {
      e.squareTo(t);
      this.reduce(t);
    }
    function Yap(e, t, n) {
      e.multiplyTo(t, n);
      this.reduce(n);
    }
    Fut.prototype.convert = Gap;
    Fut.prototype.revert = Vap;
    Fut.prototype.reduce = zap;
    Fut.prototype.mulTo = Yap;
    Fut.prototype.sqrTo = Kap;
    function Jap(e, t) {
      var n = e.bitLength();
      var r;
      var o = EOe(1);
      var s;
      if (n <= 0) {
        return o;
      } else if (n < 18) {
        r = 1;
      } else if (n < 48) {
        r = 3;
      } else if (n < 144) {
        r = 4;
      } else if (n < 768) {
        r = 5;
      } else {
        r = 6;
      }
      if (n < 8) {
        s = new FGe(t);
      } else if (t.isEven()) {
        s = new Fut(t);
      } else {
        s = new UGe(t);
      }
      var i = [];
      var a = 3;
      var l = r - 1;
      var c = (1 << r) - 1;
      if (i[1] = s.convert(this), r > 1) {
        var u = Oy();
        s.sqrTo(i[1], u);
        while (a <= c) {
          i[a] = Oy();
          s.mulTo(u, i[a - 2], i[a]);
          a += 2;
        }
      }
      var d = e.t - 1;
      var p;
      var m = true;
      var f = Oy();
      var h;
      n = ZFn(e.data[d]) - 1;
      while (d >= 0) {
        if (n >= l) {
          p = e.data[d] >> n - l & c;
        } else if (p = (e.data[d] & (1 << n + 1) - 1) << l - n, d > 0) {
          p |= e.data[d - 1] >> this.DB + n - l;
        }
        a = r;
        while ((p & 1) == 0) {
          p >>= 1;
          --a;
        }
        if ((n -= a) < 0) {
          n += this.DB;
          --d;
        }
        if (m) {
          i[p].copyTo(o);
          m = false;
        } else {
          while (a > 1) {
            s.sqrTo(o, f);
            s.sqrTo(f, o);
            a -= 2;
          }
          if (a > 0) {
            s.sqrTo(o, f);
          } else {
            h = o;
            o = f;
            f = h;
          }
          s.mulTo(f, i[p], o);
        }
        while (d >= 0 && (e.data[d] & 1 << n) == 0) {
          if (s.sqrTo(o, f), h = o, o = f, f = h, --n < 0) {
            n = this.DB - 1;
            --d;
          }
        }
      }
      return s.revert(o);
    }
    function Xap(e) {
      var t = this.s < 0 ? this.negate() : this.clone();
      var n = e.s < 0 ? e.negate() : e.clone();
      if (t.compareTo(n) < 0) {
        var r = t;
        t = n;
        n = r;
      }
      var o = t.getLowestSetBit();
      var s = n.getLowestSetBit();
      if (s < 0) {
        return t;
      }
      if (o < s) {
        s = o;
      }
      if (s > 0) {
        t.rShiftTo(s, t);
        n.rShiftTo(s, n);
      }
      while (t.signum() > 0) {
        if ((o = t.getLowestSetBit()) > 0) {
          t.rShiftTo(o, t);
        }
        if ((o = n.getLowestSetBit()) > 0) {
          n.rShiftTo(o, n);
        }
        if (t.compareTo(n) >= 0) {
          t.subTo(n, t);
          t.rShiftTo(1, t);
        } else {
          n.subTo(t, n);
          n.rShiftTo(1, n);
        }
      }
      if (s > 0) {
        n.lShiftTo(s, n);
      }
      return n;
    }
    function Qap(e) {
      if (e <= 0) {
        return 0;
      }
      var t = this.DV % e;
      var n = this.s < 0 ? e - 1 : 0;
      if (this.t > 0) {
        if (t == 0) {
          n = this.data[0] % e;
        } else {
          for (var r = this.t - 1; r >= 0; --r) {
            n = (t * n + this.data[r]) % e;
          }
        }
      }
      return n;
    }
    function Zap(e) {
      if (this.signum() == 0) {
        return Gs.ZERO;
      }
      var t = e.isEven();
      if (this.isEven() && t || e.signum() == 0) {
        return Gs.ZERO;
      }
      var n = e.clone();
      var r = this.clone();
      var o = EOe(1);
      var s = EOe(0);
      var i = EOe(0);
      var a = EOe(1);
      while (n.signum() != 0) {
        while (n.isEven()) {
          if (n.rShiftTo(1, n), t) {
            if (!o.isEven() || !s.isEven()) {
              o.addTo(this, o);
              s.subTo(e, s);
            }
            o.rShiftTo(1, o);
          } else if (!s.isEven()) {
            s.subTo(e, s);
          }
          s.rShiftTo(1, s);
        }
        while (r.isEven()) {
          if (r.rShiftTo(1, r), t) {
            if (!i.isEven() || !a.isEven()) {
              i.addTo(this, i);
              a.subTo(e, a);
            }
            i.rShiftTo(1, i);
          } else if (!a.isEven()) {
            a.subTo(e, a);
          }
          a.rShiftTo(1, a);
        }
        if (n.compareTo(r) >= 0) {
          if (n.subTo(r, n), t) {
            o.subTo(i, o);
          }
          s.subTo(a, s);
        } else {
          if (r.subTo(n, r), t) {
            i.subTo(o, i);
          }
          a.subTo(s, a);
        }
      }
      if (r.compareTo(Gs.ONE) != 0) {
        return Gs.ZERO;
      }
      if (a.compareTo(e) >= 0) {
        return a.subtract(e);
      }
      if (a.signum() < 0) {
        a.addTo(e, a);
      } else {
        return a;
      }
      if (a.signum() < 0) {
        return a.add(e);
      } else {
        return a;
      }
    }
    var qre = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997];
    var elp = 67108864 / qre[qre.length - 1];
    function tlp(e) {
      var t;
      var n = this.abs();
      if (n.t == 1 && n.data[0] <= qre[qre.length - 1]) {
        for (t = 0; t < qre.length; ++t) {
          if (n.data[0] == qre[t]) {
            return true;
          }
        }
        return false;
      }
      if (n.isEven()) {
        return false;
      }
      t = 1;
      while (t < qre.length) {
        var r = qre[t];
        var o = t + 1;
        while (o < qre.length && r < elp) {
          r *= qre[o++];
        }
        r = n.modInt(r);
        while (t < o) {
          if (r % qre[t++] == 0) {
            return false;
          }
        }
      }
      return n.millerRabin(e);
    }
    function nlp(e) {
      var t = this.subtract(Gs.ONE);
      var n = t.getLowestSetBit();
      if (n <= 0) {
        return false;
      }
      var r = t.shiftRight(n);
      var o = rlp();
      var s;
      for (var i = 0; i < e; ++i) {
        do {
          s = new Gs(this.bitLength(), o);
        } while (s.compareTo(Gs.ONE) <= 0 || s.compareTo(t) >= 0);
        var a = s.modPow(r, this);
        if (a.compareTo(Gs.ONE) != 0 && a.compareTo(t) != 0) {
          var l = 1;
          while (l++ < n && a.compareTo(t) != 0) {
            if (a = a.modPowInt(2, this), a.compareTo(Gs.ONE) == 0) {
              return false;
            }
          }
          if (a.compareTo(t) != 0) {
            return false;
          }
        }
      }
      return true;
    }
    function rlp() {
      return {
        nextBytes: function (e) {
          for (var t = 0; t < e.length; ++t) {
            e[t] = Math.floor(Math.random() * 256);
          }
        }
      };
    }
    Gs.prototype.chunkSize = nap;
    Gs.prototype.toRadix = oap;
    Gs.prototype.fromRadix = sap;
    Gs.prototype.fromNumber = iap;
    Gs.prototype.bitwiseTo = dap;
    Gs.prototype.changeBit = Cap;
    Gs.prototype.addTo = Aap;
    Gs.prototype.dMultiply = Uap;
    Gs.prototype.dAddOffset = Bap;
    Gs.prototype.multiplyLowerTo = qap;
    Gs.prototype.multiplyUpperTo = Wap;
    Gs.prototype.modInt = Qap;
    Gs.prototype.millerRabin = nlp;
    Gs.prototype.clone = Qip;
    Gs.prototype.intValue = Zip;
    Gs.prototype.byteValue = eap;
    Gs.prototype.shortValue = tap;
    Gs.prototype.signum = rap;
    Gs.prototype.toByteArray = aap;
    Gs.prototype.equals = lap;
    Gs.prototype.min = cap;
    Gs.prototype.max = uap;
    Gs.prototype.and = map;
    Gs.prototype.or = fap;
    Gs.prototype.xor = hap;
    Gs.prototype.andNot = gap;
    Gs.prototype.not = yap;
    Gs.prototype.shiftLeft = _ap;
    Gs.prototype.shiftRight = bap;
    Gs.prototype.getLowestSetBit = Tap;
    Gs.prototype.bitCount = vap;
    Gs.prototype.testBit = wap;
    Gs.prototype.setBit = Rap;
    Gs.prototype.clearBit = xap;
    Gs.prototype.flipBit = kap;
    Gs.prototype.add = Iap;
    Gs.prototype.subtract = Pap;
    Gs.prototype.multiply = Oap;
    Gs.prototype.divide = Nap;
    Gs.prototype.remainder = Lap;
    Gs.prototype.divideAndRemainder = Fap;
    Gs.prototype.modPow = Jap;
    Gs.prototype.modInverse = Zap;
    Gs.prototype.pow = jap;
    Gs.prototype.gcd = Xap;
    Gs.prototype.isProbablePrime = tlp;
    Gs.prototype.square = Dap;
  });