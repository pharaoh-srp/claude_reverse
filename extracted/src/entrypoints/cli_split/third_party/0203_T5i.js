  var T5i = __commonJS((Ocy, S5i) => {
    var FVd = $J();
    var UVd = (e, t, n) => FVd(t, e, n);
    S5i.exports = UVd;
  });
  var v5i = __commonJS((Dcy, E5i) => {
    var BVd = $J();
    var $Vd = (e, t) => BVd(e, t, true);
    E5i.exports = $Vd;
  });
  var rNn = __commonJS((Mcy, C5i) => {
    var w5i = H2();
    var HVd = (e, t, n) => {
      let r = new w5i(e, n);
      let o = new w5i(t, n);
      return r.compare(o) || r.compareBuild(o);
    };
    C5i.exports = HVd;
  });
  var x5i = __commonJS((Ncy, R5i) => {
    var jVd = rNn();
    var qVd = (e, t) => e.sort((n, r) => jVd(n, r, t));
    R5i.exports = qVd;
  });
  var A5i = __commonJS((Lcy, k5i) => {
    var WVd = rNn();
    var GVd = (e, t) => e.sort((n, r) => WVd(r, n, t));
    k5i.exports = GVd;
  });
  var cHt = __commonJS((Fcy, I5i) => {
    var VVd = $J();
    var zVd = (e, t, n) => VVd(e, t, n) > 0;
    I5i.exports = zVd;
  });
  var oNn = __commonJS((Ucy, P5i) => {
    var KVd = $J();
    var YVd = (e, t, n) => KVd(e, t, n) < 0;
    P5i.exports = YVd;
  });
  var veo = __commonJS((Bcy, O5i) => {
    var JVd = $J();
    var XVd = (e, t, n) => JVd(e, t, n) === 0;
    O5i.exports = XVd;
  });
  var weo = __commonJS(($cy, D5i) => {
    var QVd = $J();
    var ZVd = (e, t, n) => QVd(e, t, n) !== 0;
    D5i.exports = ZVd;
  });
  var sNn = __commonJS((Hcy, M5i) => {
    var ezd = $J();
    var tzd = (e, t, n) => ezd(e, t, n) >= 0;
    M5i.exports = tzd;
  });
  var iNn = __commonJS((jcy, N5i) => {
    var nzd = $J();
    var rzd = (e, t, n) => nzd(e, t, n) <= 0;
    N5i.exports = rzd;
  });
  var Ceo = __commonJS((qcy, L5i) => {
    var ozd = veo();
    var szd = weo();
    var izd = cHt();
    var azd = sNn();
    var lzd = oNn();
    var czd = iNn();
    var uzd = (e, t, n, r) => {
      switch (t) {
        case "===":
          if (typeof e === "object") {
            e = e.version;
          }
          if (typeof n === "object") {
            n = n.version;
          }
          return e === n;
        case "!==":
          if (typeof e === "object") {
            e = e.version;
          }
          if (typeof n === "object") {
            n = n.version;
          }
          return e !== n;
        case "":
        case "=":
        case "==":
          return ozd(e, n, r);
        case "!=":
          return szd(e, n, r);
        case ">":
          return izd(e, n, r);
        case ">=":
          return azd(e, n, r);
        case "<":
          return lzd(e, n, r);
        case "<=":
          return czd(e, n, r);
        default:
          throw TypeError(`Invalid operator: ${t}`);
      }
    };
    L5i.exports = uzd;
  });
  var U5i = __commonJS((Wcy, F5i) => {
    var dzd = H2();
    var pzd = DWe();
    var {
      safeRe: aNn,
      t: lNn
    } = $lt();
    var mzd = (e, t) => {
      if (e instanceof dzd) {
        return e;
      }
      if (typeof e === "number") {
        e = String(e);
      }
      if (typeof e !== "string") {
        return null;
      }
      t = t || {};
      let n = null;
      if (!t.rtl) {
        n = e.match(t.includePrerelease ? aNn[lNn.COERCEFULL] : aNn[lNn.COERCE]);
      } else {
        let l = t.includePrerelease ? aNn[lNn.COERCERTLFULL] : aNn[lNn.COERCERTL];
        let c;
        while ((c = l.exec(e)) && (!n || n.index + n[0].length !== e.length)) {
          if (!n || c.index + c[0].length !== n.index + n[0].length) {
            n = c;
          }
          l.lastIndex = c.index + c[1].length + c[2].length;
        }
        l.lastIndex = -1;
      }
      if (n === null) {
        return null;
      }
      let r = n[2];
      let o = n[3] || "0";
      let s = n[4] || "0";
      let i = t.includePrerelease && n[5] ? `-${n[5]}` : "";
      let a = t.includePrerelease && n[6] ? `+${n[6]}` : "";
      return pzd(`${r}.${o}.${s}${i}${a}`, t);
    };
    F5i.exports = mzd;
  });
  var H5i = __commonJS((Gcy, $5i) => {
    class B5i {
      constructor() {
        this.max = 1000;
        this.map = new Map();
      }
      get(e) {
        let t = this.map.get(e);
        if (t === undefined) {
          return;
        } else {
          this.map.delete(e);
          this.map.set(e, t);
          return t;
        }
      }
      delete(e) {
        return this.map.delete(e);
      }
      set(e, t) {
        if (!this.delete(e) && t !== undefined) {
          if (this.map.size >= this.max) {
            let r = this.map.keys().next().value;
            this.delete(r);
          }
          this.map.set(e, t);
        }
        return this;
      }
    }
    $5i.exports = B5i;
  });
  var HJ = __commonJS((Vcy, G5i) => {
    class uHt {
      constructor(e, t) {
        if (t = gzd(t), e instanceof uHt) {
          if (e.loose === !!t.loose && e.includePrerelease === !!t.includePrerelease) {
            return e;
          } else {
            return new uHt(e.raw, t);
          }
        }
        if (e instanceof Reo) {
          this.raw = e.value;
          this.set = [[e]];
          this.formatted = undefined;
          return this;
        }
        if (this.options = t, this.loose = !!t.loose, this.includePrerelease = !!t.includePrerelease, this.raw = e.trim().replace(/\s+/g, " "), this.set = this.raw.split("||").map(n => this.parseRange(n.trim())).filter(n => n.length), !this.set.length) {
          throw TypeError(`Invalid SemVer Range: ${this.raw}`);
        }
        if (this.set.length > 1) {
          let n = this.set[0];
          if (this.set = this.set.filter(r => !q5i(r[0])), this.set.length === 0) {
            this.set = [n];
          } else if (this.set.length > 1) {
            for (let r of this.set) {
              if (r.length === 1 && vzd(r[0])) {
                this.set = [r];
                break;
              }
            }
          }
        }
        this.formatted = undefined;
      }
      get range() {
        if (this.formatted === undefined) {
          this.formatted = "";
          for (let e = 0; e < this.set.length; e++) {
            if (e > 0) {
              this.formatted += "||";
            }
            let t = this.set[e];
            for (let n = 0; n < t.length; n++) {
              if (n > 0) {
                this.formatted += " ";
              }
              this.formatted += t[n].toString().trim();
            }
          }
        }
        return this.formatted;
      }
      format() {
        return this.range;
      }
      toString() {
        return this.range;
      }
      parseRange(e) {
        let n = ((this.options.includePrerelease && Tzd) | (this.options.loose && Ezd)) + ":" + e;
        let r = j5i.get(n);
        if (r) {
          return r;
        }
        let o = this.options.loose;
        let s = o ? oG[iq.HYPHENRANGELOOSE] : oG[iq.HYPHENRANGE];
        e = e.replace(s, Dzd(this.options.includePrerelease));
        jC("hyphen replace", e);
        e = e.replace(oG[iq.COMPARATORTRIM], _zd);
        jC("comparator trim", e);
        e = e.replace(oG[iq.TILDETRIM], bzd);
        jC("tilde trim", e);
        e = e.replace(oG[iq.CARETTRIM], Szd);
        jC("caret trim", e);
        let i = e.split(" ").map(u => wzd(u, this.options)).join(" ").split(/\s+/).map(u => Ozd(u, this.options));
        if (o) {
          i = i.filter(u => (jC("loose invalid filter", u, this.options), !!u.match(oG[iq.COMPARATORLOOSE])));
        }
        jC("range list", i);
        let a = new Map();
        let l = i.map(u => new Reo(u, this.options));
        for (let u of l) {
          if (q5i(u)) {
            return [u];
          }
          a.set(u.value, u);
        }
        if (a.size > 1 && a.vZc("")) {
          a.delete("");
        }
        let c = [...a.values()];
        j5i.set(n, c);
        return c;
      }
      intersects(e, t) {
        if (!(e instanceof uHt)) {
          throw TypeError("a Range is required");
        }
        return this.set.some(n => W5i(n, t) && e.set.some(r => W5i(r, t) && n.every(o => r.every(s => o.intersects(s, t)))));
      }
      test(e) {
        if (!e) {
          return false;
        }
        if (typeof e === "string") {
          try {
            e = new yzd(e, this.options);
          } catch (t) {
            return false;
          }
        }
        for (let t = 0; t < this.set.length; t++) {
          if (Mzd(this.set[t], e, this.options)) {
            return true;
          }
        }
        return false;
      }
    }
    G5i.exports = uHt;
    var hzd = H5i();
    var j5i = new hzd();
    var gzd = QMn();
    var Reo = dHt();
    var jC = lHt();
    var yzd = H2();
    var {
      safeRe: oG,
      t: iq,
      comparatorTrimReplace: _zd,
      tildeTrimReplace: bzd,
      caretTrimReplace: Szd
    } = $lt();
    var {
      FLAG_INCLUDE_PRERELEASE: Tzd,
      FLAG_LOOSE: Ezd
    } = aHt();
    var q5i = e => e.value === "<0.0.0-0";
    var vzd = e => e.value === "";
    var W5i = (e, t) => {
      let n = true;
      let r = e.slice();
      let o = r.pop();
      while (n && r.length) {
        n = r.every(s => o.intersects(s, t));
        o = r.pop();
      }
      return n;
    };
    var wzd = (e, t) => (jC("comp", e, t), e = xzd(e, t), jC("caret", e), e = Czd(e, t), jC("tildes", e), e = Azd(e, t), jC("xrange", e), e = Pzd(e, t), jC("stars", e), e);
    var aq = e => !e || e.toLowerCase() === "x" || e === "*";
    var Czd = (e, t) => e.trim().split(/\s+/).map(n => Rzd(n, t)).join(" ");
    var Rzd = (e, t) => {
      let n = t.loose ? oG[iq.TILDELOOSE] : oG[iq.TILDE];
      return e.replace(n, (r, o, s, i, a) => {
        jC("tilde", e, r, o, s, i, a);
        let l;
        if (aq(o)) {
          l = "";
        } else if (aq(s)) {
          l = `>=${o}.0.0 <${+o + 1}.0.0-0`;
        } else if (aq(i)) {
          l = `>=${o}.${s}.0 <${o}.${+s + 1}.0-0`;
        } else if (a) {
          jC("replaceTilde pr", a);
          l = `>=${o}.${s}.${i}-${a} <${o}.${+s + 1}.0-0`;
        } else {
          l = `>=${o}.${s}.${i} <${o}.${+s + 1}.0-0`;
        }
        jC("tilde return", l);
        return l;
      });
    };
    var xzd = (e, t) => e.trim().split(/\s+/).map(n => kzd(n, t)).join(" ");
    var kzd = (e, t) => {
      jC("caret", e, t);
      let n = t.loose ? oG[iq.CARETLOOSE] : oG[iq.CARET];
      let r = t.includePrerelease ? "-0" : "";
      return e.replace(n, (o, s, i, a, l) => {
        jC("caret", e, o, s, i, a, l);
        let c;
        if (aq(s)) {
          c = "";
        } else if (aq(i)) {
          c = `>=${s}.0.0${r} <${+s + 1}.0.0-0`;
        } else if (aq(a)) {
          if (s === "0") {
            c = `>=${s}.${i}.0${r} <${s}.${+i + 1}.0-0`;
          } else {
            c = `>=${s}.${i}.0${r} <${+s + 1}.0.0-0`;
          }
        } else if (l) {
          if (jC("replaceCaret pr", l), s === "0") {
            if (i === "0") {
              c = `>=${s}.${i}.${a}-${l} <${s}.${i}.${+a + 1}-0`;
            } else {
              c = `>=${s}.${i}.${a}-${l} <${s}.${+i + 1}.0-0`;
            }
          } else {
            c = `>=${s}.${i}.${a}-${l} <${+s + 1}.0.0-0`;
          }
        } else if (jC("no pr"), s === "0") {
          if (i === "0") {
            c = `>=${s}.${i}.${a}${r} <${s}.${i}.${+a + 1}-0`;
          } else {
            c = `>=${s}.${i}.${a}${r} <${s}.${+i + 1}.0-0`;
          }
        } else {
          c = `>=${s}.${i}.${a} <${+s + 1}.0.0-0`;
        }
        jC("caret return", c);
        return c;
      });
    };
    var Azd = (e, t) => (jC("replaceXRanges", e, t), e.split(/\s+/).map(n => Izd(n, t)).join(" "));
    var Izd = (e, t) => {
      e = e.trim();
      let n = t.loose ? oG[iq.XRANGELOOSE] : oG[iq.XRANGE];
      return e.replace(n, (r, o, s, i, a, l) => {
        jC("xRange", e, r, o, s, i, a, l);
        let c = aq(s);
        let u = c || aq(i);
        let d = u || aq(a);
        let p = d;
        if (o === "=" && p) {
          o = "";
        }
        if (l = t.includePrerelease ? "-0" : "", c) {
          if (o === ">" || o === "<") {
            r = "<0.0.0-0";
          } else {
            r = "*";
          }
        } else if (o && p) {
          if (u) {
            i = 0;
          }
          if (a = 0, o === ">") {
            if (o = ">=", u) {
              s = +s + 1;
              i = 0;
              a = 0;
            } else {
              i = +i + 1;
              a = 0;
            }
          } else if (o === "<=") {
            if (o = "<", u) {
              s = +s + 1;
            } else {
              i = +i + 1;
            }
          }
          if (o === "<") {
            l = "-0";
          }
          r = `${o + s}.${i}.${a}${l}`;
        } else if (u) {
          r = `>=${s}.0.0${l} <${+s + 1}.0.0-0`;
        } else if (d) {
          r = `>=${s}.${i}.0${l} <${s}.${+i + 1}.0-0`;
        }
        jC("xRange return", r);
        return r;
      });
    };
    var Pzd = (e, t) => (jC("replaceStars", e, t), e.trim().replace(oG[iq.STAR], ""));
    var Ozd = (e, t) => (jC("replaceGTE0", e, t), e.trim().replace(oG[t.includePrerelease ? iq.GTE0PRE : iq.GTE0], ""));
    var Dzd = e => (t, n, r, o, s, i, a, l, c, u, d, p) => {
      if (aq(r)) {
        n = "";
      } else if (aq(o)) {
        n = `>=${r}.0.0${e ? "-0" : ""}`;
      } else if (aq(s)) {
        n = `>=${r}.${o}.0${e ? "-0" : ""}`;
      } else if (i) {
        n = `>=${n}`;
      } else {
        n = `>=${n}${e ? "-0" : ""}`;
      }
      if (aq(c)) {
        l = "";
      } else if (aq(u)) {
        l = `<${+c + 1}.0.0-0`;
      } else if (aq(d)) {
        l = `<${c}.${+u + 1}.0-0`;
      } else if (p) {
        l = `<=${c}.${u}.${d}-${p}`;
      } else if (e) {
        l = `<${c}.${u}.${+d + 1}-0`;
      } else {
        l = `<=${l}`;
      }
      return `${n} ${l}`.trim();
    };
    var Mzd = (e, t, n) => {
      for (let r = 0; r < e.length; r++) {
        if (!e[r].test(t)) {
          return false;
        }
      }
      if (t.prerelease.length && !n.includePrerelease) {
        for (let r = 0; r < e.length; r++) {
          if (jC(e[r].semver), e[r].semver === Reo.ANY) {
            continue;
          }
          if (e[r].semver.prerelease.length > 0) {
            let o = e[r].semver;
            if (o.major === t.major && o.minor === t.minor && o.patch === t.patch) {
              return true;
            }
          }
        }
        return false;
      }
      return true;
    };
  });
  var dHt = __commonJS((zcy, X5i) => {
    var pHt = Symbol("SemVer ANY");
    class cNn {
      static get ANY() {
        return pHt;
      }
      constructor(e, t) {
        if (t = V5i(t), e instanceof cNn) {
          if (e.loose === !!t.loose) {
            return e;
          } else {
            e = e.value;
          }
        }
        if (e = e.trim().split(/\s+/).join(" "), keo("comparator", e, t), this.options = t, this.loose = !!t.loose, this.parse(e), this.semver === pHt) {
          this.value = "";
        } else {
          this.value = this.operator + this.semver.version;
        }
        keo("comp", this);
      }
      parse(e) {
        let t = this.options.loose ? z5i[K5i.COMPARATORLOOSE] : z5i[K5i.COMPARATOR];
        let n = e.match(t);
        if (!n) {
          throw TypeError(`Invalid comparator: ${e}`);
        }
        if (this.operator = n[1] !== undefined ? n[1] : "", this.operator === "=") {
          this.operator = "";
        }
        if (!n[2]) {
          this.semver = pHt;
        } else {
          this.semver = new Y5i(n[2], this.options.loose);
        }
      }
      toString() {
        return this.value;
      }
      test(e) {
        if (keo("Comparator.test", e, this.options.loose), this.semver === pHt || e === pHt) {
          return true;
        }
        if (typeof e === "string") {
          try {
            e = new Y5i(e, this.options);
          } catch (t) {
            return false;
          }
        }
        return xeo(e, this.operator, this.semver, this.options);
      }
      intersects(e, t) {
        if (!(e instanceof cNn)) {
          throw TypeError("a Comparator is required");
        }
        if (this.operator === "") {
          if (this.value === "") {
            return true;
          }
          return new J5i(e.value, t).test(this.value);
        } else if (e.operator === "") {
          if (e.value === "") {
            return true;
          }
          return new J5i(this.value, t).test(e.semver);
        }
        if (t = V5i(t), t.includePrerelease && (this.value === "<0.0.0-0" || e.value === "<0.0.0-0")) {
          return false;
        }
        if (!t.includePrerelease && (this.value.startsWith("<0.0.0") || e.value.startsWith("<0.0.0"))) {
          return false;
        }
        if (this.operator.startsWith(">") && e.operator.startsWith(">")) {
          return true;
        }
        if (this.operator.startsWith("<") && e.operator.startsWith("<")) {
          return true;
        }
        if (this.semver.version === e.semver.version && this.operator.includes("=") && e.operator.includes("=")) {
          return true;
        }
        if (xeo(this.semver, "<", e.semver, t) && this.operator.startsWith(">") && e.operator.startsWith("<")) {
          return true;
        }
        if (xeo(this.semver, ">", e.semver, t) && this.operator.startsWith("<") && e.operator.startsWith(">")) {
          return true;
        }
        return false;
      }
    }
    X5i.exports = cNn;
    var V5i = QMn();
    var {
      safeRe: z5i,
      t: K5i
    } = $lt();
    var xeo = Ceo();
    var keo = lHt();
    var Y5i = H2();
    var J5i = HJ();
  });
  var mHt = __commonJS((Kcy, Q5i) => {
    var Nzd = HJ();
    var Lzd = (e, t, n) => {
      try {
        t = new Nzd(t, n);
      } catch (r) {
        return false;
      }
      return t.test(e);
    };
    Q5i.exports = Lzd;
  });
  var e6i = __commonJS((Ycy, Z5i) => {
    var Fzd = HJ();
    var Uzd = (e, t) => new Fzd(e, t).set.map(n => n.map(r => r.value).join(" ").trim().split(" "));
    Z5i.exports = Uzd;
  });
  var n6i = __commonJS((Jcy, t6i) => {
    var Bzd = H2();
    var $zd = HJ();
    var Hzd = (e, t, n) => {
      let r = null;
      let o = null;
      let s = null;
      try {
        s = new $zd(t, n);
      } catch (i) {
        return null;
      }
      e.forEach(i => {
        if (s.test(i)) {
          if (!r || o.compare(i) === -1) {
            r = i;
            o = new Bzd(r, n);
          }
        }
      });
      return r;
    };
    t6i.exports = Hzd;
  });
  var o6i = __commonJS((Xcy, r6i) => {
    var jzd = H2();
    var qzd = HJ();
    var Wzd = (e, t, n) => {
      let r = null;
      let o = null;
      let s = null;
      try {
        s = new qzd(t, n);
      } catch (i) {
        return null;
      }
      e.forEach(i => {
        if (s.test(i)) {
          if (!r || o.compare(i) === 1) {
            r = i;
            o = new jzd(r, n);
          }
        }
      });
      return r;
    };
    r6i.exports = Wzd;
  });
  var a6i = __commonJS((Qcy, i6i) => {
    var Aeo = H2();
    var Gzd = HJ();
    var s6i = cHt();
    var Vzd = (e, t) => {
      e = new Gzd(e, t);
      let n = new Aeo("0.0.0");
      if (e.test(n)) {
        return n;
      }
      if (n = new Aeo("0.0.0-0"), e.test(n)) {
        return n;
      }
      n = null;
      for (let r = 0; r < e.set.length; ++r) {
        let o = e.set[r];
        let s = null;
        if (o.forEach(i => {
          let a = new Aeo(i.semver.version);
          switch (i.operator) {
            case ">":
              if (a.prerelease.length === 0) {
                a.patch++;
              } else {
                a.prerelease.push(0);
              }
              a.raw = a.format();
            case "":
            case ">=":
              if (!s || s6i(a, s)) {
                s = a;
              }
              break;
            case "<":
            case "<=":
              break;
            default:
              throw Error(`Unexpected operation: ${i.operator}`);
          }
        }), s && (!n || s6i(n, s))) {
          n = s;
        }
      }
      if (n && e.test(n)) {
        return n;
      }
      return null;
    };
    i6i.exports = Vzd;
  });
  var c6i = __commonJS((Zcy, l6i) => {
    var zzd = HJ();
    var Kzd = (e, t) => {
      try {
        return new zzd(e, t).range || "*";
      } catch (n) {
        return null;
      }
    };
    l6i.exports = Kzd;
  });
  var uNn = __commonJS((euy, m6i) => {
    var Yzd = H2();
    var p6i = dHt();
    var {
      ANY: Jzd
    } = p6i;
    var Xzd = HJ();
    var Qzd = mHt();
    var u6i = cHt();
    var d6i = oNn();
    var Zzd = iNn();
    var eKd = sNn();
    var tKd = (e, t, n, r) => {
      e = new Yzd(e, r);
      t = new Xzd(t, r);
      let o;
      let s;
      let i;
      let a;
      let l;
      switch (n) {
        case ">":
          o = u6i;
          s = Zzd;
          i = d6i;
          a = ">";
          l = ">=";
          break;
        case "<":
          o = d6i;
          s = eKd;
          i = u6i;
          a = "<";
          l = "<=";
          break;
        default:
          throw TypeError('Must provide a hilo val of "<" or ">"');
      }
      if (Qzd(e, t, r)) {
        return false;
      }
      for (let c = 0; c < t.set.length; ++c) {
        let u = t.set[c];
        let d = null;
        let p = null;
        if (u.forEach(m => {
          if (m.semver === Jzd) {
            m = new p6i(">=0.0.0");
          }
          if (d = d || m, p = p || m, o(m.semver, d.semver, r)) {
            d = m;
          } else if (i(m.semver, p.semver, r)) {
            p = m;
          }
        }), d.operator === a || d.operator === l) {
          return false;
        }
        if ((!p.operator || p.operator === a) && s(e, p.semver)) {
          return false;
        } else if (p.operator === l && i(e, p.semver)) {
          return false;
        }
      }
      return true;
    };
    m6i.exports = tKd;
  });
  var h6i = __commonJS((tuy, f6i) => {
    var nKd = uNn();
    var rKd = (e, t, n) => nKd(e, t, ">", n);
    f6i.exports = rKd;
  });
  var y6i = __commonJS((nuy, g6i) => {
    var oKd = uNn();
    var sKd = (e, t, n) => oKd(e, t, "<", n);
    g6i.exports = sKd;
  });
  var S6i = __commonJS((ruy, b6i) => {
    var _6i = HJ();
    var iKd = (e, t, n) => (e = new _6i(e, n), t = new _6i(t, n), e.intersects(t, n));
    b6i.exports = iKd;
  });
  var E6i = __commonJS((ouy, T6i) => {
    var aKd = mHt();
    var lKd = $J();
    T6i.exports = (e, t, n) => {
      let r = [];
      let o = null;
      let s = null;
      let i = e.sort((u, d) => lKd(u, d, n));
      for (let u of i) {
        if (aKd(u, t, n)) {
          if (s = u, !o) {
            o = u;
          }
        } else {
          if (s) {
            r.push([o, s]);
          }
          s = null;
          o = null;
        }
      }
      if (o) {
        r.push([o, null]);
      }
      let a = [];
      for (let [u, d] of r) {
        if (u === d) {
          a.push(u);
        } else if (!d && u === i[0]) {
          a.push("*");
        } else if (!d) {
          a.push(`>=${u}`);
        } else if (u === i[0]) {
          a.push(`<=${d}`);
        } else {
          a.push(`${u} - ${d}`);
        }
      }
      let l = a.join(" || ");
      let c = typeof t.raw === "string" ? t.raw : String(t);
      return l.length < c.length ? l : t;
    };
  });
  var k6i = __commonJS((suy, x6i) => {
    var v6i = HJ();
    var Peo = dHt();
    var {
      ANY: Ieo
    } = Peo;
    var fHt = mHt();
    var Oeo = $J();
    var cKd = (e, t, n = {}) => {
      if (e === t) {
        return true;
      }
      e = new v6i(e, n);
      t = new v6i(t, n);
      let r = false;
      e: for (let o of e.set) {
        for (let s of t.set) {
          let i = dKd(o, s, n);
          if (r = r || i !== null, i) {
            continue e;
          }
        }
        if (r) {
          return false;
        }
      }
      return true;
    };
    var uKd = [new Peo(">=0.0.0-0")];
    var w6i = [new Peo(">=0.0.0")];
    var dKd = (e, t, n) => {
      if (e === t) {
        return true;
      }
      if (e.length === 1 && e[0].semver === Ieo) {
        if (t.length === 1 && t[0].semver === Ieo) {
          return true;
        } else if (n.includePrerelease) {
          e = uKd;
        } else {
          e = w6i;
        }
      }
      if (t.length === 1 && t[0].semver === Ieo) {
        if (n.includePrerelease) {
          return true;
        } else {
          t = w6i;
        }
      }
      let r = new Set();
      let o;
      let s;
      for (let m of e) {
        if (m.operator === ">" || m.operator === ">=") {
          o = C6i(o, m, n);
        } else if (m.operator === "<" || m.operator === "<=") {
          s = R6i(s, m, n);
        } else {
          r.add(m.semver);
        }
      }
      if (r.size > 1) {
        return null;
      }
      let i;
      if (o && s) {
        if (i = Oeo(o.semver, s.semver, n), i > 0) {
          return null;
        } else if (i === 0 && (o.operator !== ">=" || s.operator !== "<=")) {
          return null;
        }
      }
      for (let m of r) {
        if (o && !fHt(m, String(o), n)) {
          return null;
        }
        if (s && !fHt(m, String(s), n)) {
          return null;
        }
        for (let f of t) {
          if (!fHt(m, String(f), n)) {
            return false;
          }
        }
        return true;
      }
      let a;
      let l;
      let c;
      let u;
      let d = s && !n.includePrerelease && s.semver.prerelease.length ? s.semver : false;
      let p = o && !n.includePrerelease && o.semver.prerelease.length ? o.semver : false;
      if (d && d.prerelease.length === 1 && s.operator === "<" && d.prerelease[0] === 0) {
        d = false;
      }
      for (let m of t) {
        if (u = u || m.operator === ">" || m.operator === ">=", c = c || m.operator === "<" || m.operator === "<=", o) {
          if (p) {
            if (m.semver.prerelease && m.semver.prerelease.length && m.semver.major === p.major && m.semver.minor === p.minor && m.semver.patch === p.patch) {
              p = false;
            }
          }
          if (m.operator === ">" || m.operator === ">=") {
            if (a = C6i(o, m, n), a === m && a !== o) {
              return false;
            }
          } else if (o.operator === ">=" && !fHt(o.semver, String(m), n)) {
            return false;
          }
        }
        if (s) {
          if (d) {
            if (m.semver.prerelease && m.semver.prerelease.length && m.semver.major === d.major && m.semver.minor === d.minor && m.semver.patch === d.patch) {
              d = false;
            }
          }
          if (m.operator === "<" || m.operator === "<=") {
            if (l = R6i(s, m, n), l === m && l !== s) {
              return false;
            }
          } else if (s.operator === "<=" && !fHt(s.semver, String(m), n)) {
            return false;
          }
        }
        if (!m.operator && (s || o) && i !== 0) {
          return false;
        }
      }
      if (o && c && !s && i !== 0) {
        return false;
      }
      if (s && u && !o && i !== 0) {
        return false;
      }
      if (p || d) {
        return false;
      }
      return true;
    };
    var C6i = (e, t, n) => {
      if (!e) {
        return t;
      }
      let r = Oeo(e.semver, t.semver, n);
      return r > 0 ? e : r < 0 ? t : t.operator === ">" && e.operator === ">=" ? t : e;
    };
    var R6i = (e, t, n) => {
      if (!e) {
        return t;
      }
      let r = Oeo(e.semver, t.semver, n);
      return r < 0 ? e : r > 0 ? t : t.operator === "<" && e.operator === "<=" ? t : e;
    };
    x6i.exports = cKd;
  });
  var lq = __commonJS((iuy, P6i) => {
    var Deo = $lt();
    var A6i = aHt();
    var pKd = H2();
    var I6i = Eeo();
    var mKd = DWe();
    var fKd = t5i();
    var hKd = r5i();
    var gKd = i5i();
    var yKd = c5i();
    var _Kd = d5i();
    var bKd = m5i();
    var SKd = h5i();
    var TKd = y5i();
    var EKd = $J();
    var vKd = T5i();
    var wKd = v5i();
    var CKd = rNn();
    var RKd = x5i();
    var xKd = A5i();
    var kKd = cHt();
    var AKd = oNn();
    var IKd = veo();
    var PKd = weo();
    var OKd = sNn();
    var DKd = iNn();
    var MKd = Ceo();
    var NKd = U5i();
    var LKd = dHt();
    var FKd = HJ();
    var UKd = mHt();
    var BKd = e6i();
    var $Kd = n6i();
    var HKd = o6i();
    var jKd = a6i();
    var qKd = c6i();
    var WKd = uNn();
    var GKd = h6i();
    var VKd = y6i();
    var zKd = S6i();
    var KKd = E6i();
    var YKd = k6i();
    P6i.exports = {
      parse: mKd,
      valid: fKd,
      clean: hKd,
      inc: gKd,
      diff: yKd,
      major: _Kd,
      minor: bKd,
      patch: SKd,
      prerelease: TKd,
      compare: EKd,
      rcompare: vKd,
      compareLoose: wKd,
      compareBuild: CKd,
      sort: RKd,
      rsort: xKd,
      gt: kKd,
      lt: AKd,
      eq: IKd,
      neq: PKd,
      gte: OKd,
      lte: DKd,
      cmp: MKd,
      coerce: NKd,
      Comparator: LKd,
      Range: FKd,
      satisfies: UKd,
      toComparators: BKd,
      maxSatisfying: $Kd,
      minSatisfying: HKd,
      minVersion: jKd,
      validRange: qKd,
      outside: WKd,
      gtr: GKd,
      ltr: VKd,
      intersects: zKd,
      simplifyRange: KKd,
      subset: YKd,
      SemVer: pKd,
      re: Deo.re,
      src: Deo.src,
      tokens: Deo.t,
      SEMVER_SPEC_VERSION: A6i.SEMVER_SPEC_VERSION,
      RELEASE_TYPES: A6i.RELEASE_TYPES,
      compareIdentifiers: I6i.compareIdentifiers,
      rcompareIdentifiers: I6i.rcompareIdentifiers
    };
  });