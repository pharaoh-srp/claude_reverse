  var $Vl = __commonJS(Zw => {
    Zw.Patterns = {
      PATTERN000: 0,
      PATTERN001: 1,
      PATTERN010: 2,
      PATTERN011: 3,
      PATTERN100: 4,
      PATTERN101: 5,
      PATTERN110: 6,
      PATTERN111: 7
    };
    var PYe = {
      N1: 3,
      N2: 3,
      N3: 40,
      N4: 10
    };
    Zw.isValid = function (t) {
      return t != null && t !== "" && !isNaN(t) && t >= 0 && t <= 7;
    };
    Zw.from = function (t) {
      return Zw.isValid(t) ? parseInt(t, 10) : undefined;
    };
    Zw.getPenaltyN1 = function (t) {
      let n = t.size;
      let r = 0;
      let o = 0;
      let s = 0;
      let i = null;
      let a = null;
      for (let l = 0; l < n; l++) {
        o = s = 0;
        i = a = null;
        for (let c = 0; c < n; c++) {
          let u = t.get(l, c);
          if (u === i) {
            o++;
          } else {
            if (o >= 5) {
              r += PYe.N1 + (o - 5);
            }
            i = u;
            o = 1;
          }
          if (u = t.get(c, l), u === a) {
            s++;
          } else {
            if (s >= 5) {
              r += PYe.N1 + (s - 5);
            }
            a = u;
            s = 1;
          }
        }
        if (o >= 5) {
          r += PYe.N1 + (o - 5);
        }
        if (s >= 5) {
          r += PYe.N1 + (s - 5);
        }
      }
      return r;
    };
    Zw.getPenaltyN2 = function (t) {
      let n = t.size;
      let r = 0;
      for (let o = 0; o < n - 1; o++) {
        for (let s = 0; s < n - 1; s++) {
          let i = t.get(o, s) + t.get(o, s + 1) + t.get(o + 1, s) + t.get(o + 1, s + 1);
          if (i === 4 || i === 0) {
            r++;
          }
        }
      }
      return r * PYe.N2;
    };
    Zw.getPenaltyN3 = function (t) {
      let n = t.size;
      let r = 0;
      let o = 0;
      let s = 0;
      for (let i = 0; i < n; i++) {
        o = s = 0;
        for (let a = 0; a < n; a++) {
          if (o = o << 1 & 2047 | t.get(i, a), a >= 10 && (o === 1488 || o === 93)) {
            r++;
          }
          if (s = s << 1 & 2047 | t.get(a, i), a >= 10 && (s === 1488 || s === 93)) {
            r++;
          }
        }
      }
      return r * PYe.N3;
    };
    Zw.getPenaltyN4 = function (t) {
      let n = 0;
      let r = t.data.length;
      for (let s = 0; s < r; s++) {
        n += t.data[s];
      }
      return Math.abs(Math.ceil(n * 100 / r / 5) - 10) * PYe.N4;
    };
    function pVm(e, t, n) {
      switch (e) {
        case Zw.Patterns.PATTERN000:
          return (t + n) % 2 === 0;
        case Zw.Patterns.PATTERN001:
          return t % 2 === 0;
        case Zw.Patterns.PATTERN010:
          return n % 3 === 0;
        case Zw.Patterns.PATTERN011:
          return (t + n) % 3 === 0;
        case Zw.Patterns.PATTERN100:
          return (Math.floor(t / 2) + Math.floor(n / 3)) % 2 === 0;
        case Zw.Patterns.PATTERN101:
          return t * n % 2 + t * n % 3 === 0;
        case Zw.Patterns.PATTERN110:
          return (t * n % 2 + t * n % 3) % 2 === 0;
        case Zw.Patterns.PATTERN111:
          return (t * n % 3 + (t + n) % 2) % 2 === 0;
        default:
          throw Error("bad maskPattern:" + e);
      }
    }
    Zw.applyMask = function (t, n) {
      let r = n.size;
      for (let o = 0; o < r; o++) {
        for (let s = 0; s < r; s++) {
          if (n.isReserved(s, o)) {
            continue;
          }
          n.xor(s, o, pVm(t, s, o));
        }
      }
    };
    Zw.getBestMask = function (t, n) {
      let r = Object.keys(Zw.Patterns).length;
      let o = 0;
      let s = 1 / 0;
      for (let i = 0; i < r; i++) {
        n(i);
        Zw.applyMask(i, t);
        let a = Zw.getPenaltyN1(t) + Zw.getPenaltyN2(t) + Zw.getPenaltyN3(t) + Zw.getPenaltyN4(t);
        if (Zw.applyMask(i, t), a < s) {
          s = a;
          o = i;
        }
      }
      return o;
    };
  });