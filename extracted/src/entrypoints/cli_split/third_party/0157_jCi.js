  var jCi = __commonJS((fqg, HCi) => {
    var xPd = b2();
    var kPd = (e, t) => new xPd(e, t).minor;
    HCi.exports = kPd;
  });
  var WCi = __commonJS((hqg, qCi) => {
    var APd = b2();
    var IPd = (e, t) => new APd(e, t).patch;
    qCi.exports = IPd;
  });
  var VCi = __commonJS((gqg, GCi) => {
    var PPd = q3e();
    var OPd = (e, t) => {
      let n = PPd(e, t);
      return n && n.prerelease.length ? n.prerelease : null;
    };
    GCi.exports = OPd;
  });
  var tJ = __commonJS((yqg, KCi) => {
    var zCi = b2();
    var DPd = (e, t, n) => new zCi(e, n).compare(new zCi(t, n));
    KCi.exports = DPd;
  });
  var JCi = __commonJS((_qg, YCi) => {
    var MPd = tJ();
    var NPd = (e, t, n) => MPd(t, e, n);
    YCi.exports = NPd;
  });
  var QCi = __commonJS((bqg, XCi) => {
    var LPd = tJ();
    var FPd = (e, t) => LPd(e, t, true);
    XCi.exports = FPd;
  });
  var RAn = __commonJS((Sqg, eRi) => {
    var ZCi = b2();
    var UPd = (e, t, n) => {
      let r = new ZCi(e, n);
      let o = new ZCi(t, n);
      return r.compare(o) || r.compareBuild(o);
    };
    eRi.exports = UPd;
  });
  var nRi = __commonJS((Tqg, tRi) => {
    var BPd = RAn();
    var $Pd = (e, t) => e.sort((n, r) => BPd(n, r, t));
    tRi.exports = $Pd;
  });
  var oRi = __commonJS((Eqg, rRi) => {
    var HPd = RAn();
    var jPd = (e, t) => e.sort((n, r) => HPd(r, n, t));
    rRi.exports = jPd;
  });
  var JUt = __commonJS((vqg, sRi) => {
    var qPd = tJ();
    var WPd = (e, t, n) => qPd(e, t, n) > 0;
    sRi.exports = WPd;
  });
  var xAn = __commonJS((wqg, iRi) => {
    var GPd = tJ();
    var VPd = (e, t, n) => GPd(e, t, n) < 0;
    iRi.exports = VPd;
  });
  var cVr = __commonJS((Cqg, aRi) => {
    var zPd = tJ();
    var KPd = (e, t, n) => zPd(e, t, n) === 0;
    aRi.exports = KPd;
  });
  var uVr = __commonJS((Rqg, lRi) => {
    var YPd = tJ();
    var JPd = (e, t, n) => YPd(e, t, n) !== 0;
    lRi.exports = JPd;
  });
  var kAn = __commonJS((xqg, cRi) => {
    var XPd = tJ();
    var QPd = (e, t, n) => XPd(e, t, n) >= 0;
    cRi.exports = QPd;
  });
  var AAn = __commonJS((kqg, uRi) => {
    var ZPd = tJ();
    var eOd = (e, t, n) => ZPd(e, t, n) <= 0;
    uRi.exports = eOd;
  });
  var dVr = __commonJS((Aqg, dRi) => {
    var tOd = cVr();
    var nOd = uVr();
    var rOd = JUt();
    var oOd = kAn();
    var sOd = xAn();
    var iOd = AAn();
    var aOd = (e, t, n, r) => {
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
          return tOd(e, n, r);
        case "!=":
          return nOd(e, n, r);
        case ">":
          return rOd(e, n, r);
        case ">=":
          return oOd(e, n, r);
        case "<":
          return sOd(e, n, r);
        case "<=":
          return iOd(e, n, r);
        default:
          throw TypeError(`Invalid operator: ${t}`);
      }
    };
    dRi.exports = aOd;
  });
  var mRi = __commonJS((Iqg, pRi) => {
    var lOd = b2();
    var cOd = q3e();
    var {
      safeRe: IAn,
      t: PAn
    } = bit();
    var uOd = (e, t) => {
      if (e instanceof lOd) {
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
        n = e.match(t.includePrerelease ? IAn[PAn.COERCEFULL] : IAn[PAn.COERCE]);
      } else {
        let l = t.includePrerelease ? IAn[PAn.COERCERTLFULL] : IAn[PAn.COERCERTL];
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
      return cOd(`${r}.${o}.${s}${i}${a}`, t);
    };
    pRi.exports = uOd;
  });
  var gRi = __commonJS((Pqg, hRi) => {
    class fRi {
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
    hRi.exports = fRi;
  });
  var nJ = __commonJS((Oqg, SRi) => {
    class XUt {
      constructor(e, t) {
        if (t = mOd(t), e instanceof XUt) {
          if (e.loose === !!t.loose && e.includePrerelease === !!t.includePrerelease) {
            return e;
          } else {
            return new XUt(e.raw, t);
          }
        }
        if (e instanceof pVr) {
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
          if (this.set = this.set.filter(r => !_Ri(r[0])), this.set.length === 0) {
            this.set = [n];
          } else if (this.set.length > 1) {
            for (let r of this.set) {
              if (r.length === 1 && SOd(r[0])) {
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
        let n = ((this.options.includePrerelease && _Od) | (this.options.loose && bOd)) + ":" + e;
        let r = yRi.get(n);
        if (r) {
          return r;
        }
        let o = this.options.loose;
        let s = o ? HW[zj.HYPHENRANGELOOSE] : HW[zj.HYPHENRANGE];
        e = e.replace(s, IOd(this.options.includePrerelease));
        OC("hyphen replace", e);
        e = e.replace(HW[zj.COMPARATORTRIM], hOd);
        OC("comparator trim", e);
        e = e.replace(HW[zj.TILDETRIM], gOd);
        OC("tilde trim", e);
        e = e.replace(HW[zj.CARETTRIM], yOd);
        OC("caret trim", e);
        let i = e.split(" ").map(u => TOd(u, this.options)).join(" ").split(/\s+/).map(u => AOd(u, this.options));
        if (o) {
          i = i.filter(u => (OC("loose invalid filter", u, this.options), !!u.match(HW[zj.COMPARATORLOOSE])));
        }
        OC("range list", i);
        let a = new Map();
        let l = i.map(u => new pVr(u, this.options));
        for (let u of l) {
          if (_Ri(u)) {
            return [u];
          }
          a.set(u.value, u);
        }
        if (a.size > 1 && a.vZc("")) {
          a.delete("");
        }
        let c = [...a.values()];
        yRi.set(n, c);
        return c;
      }
      intersects(e, t) {
        if (!(e instanceof XUt)) {
          throw TypeError("a Range is required");
        }
        return this.set.some(n => bRi(n, t) && e.set.some(r => bRi(r, t) && n.every(o => r.every(s => o.intersects(s, t)))));
      }
      test(e) {
        if (!e) {
          return false;
        }
        if (typeof e === "string") {
          try {
            e = new fOd(e, this.options);
          } catch (t) {
            return false;
          }
        }
        for (let t = 0; t < this.set.length; t++) {
          if (POd(this.set[t], e, this.options)) {
            return true;
          }
        }
        return false;
      }
    }
    SRi.exports = XUt;
    var pOd = gRi();
    var yRi = new pOd();
    var mOd = EAn();
    var pVr = QUt();
    var OC = YUt();
    var fOd = b2();
    var {
      safeRe: HW,
      t: zj,
      comparatorTrimReplace: hOd,
      tildeTrimReplace: gOd,
      caretTrimReplace: yOd
    } = bit();
    var {
      FLAG_INCLUDE_PRERELEASE: _Od,
      FLAG_LOOSE: bOd
    } = KUt();
    var _Ri = e => e.value === "<0.0.0-0";
    var SOd = e => e.value === "";
    var bRi = (e, t) => {
      let n = true;
      let r = e.slice();
      let o = r.pop();
      while (n && r.length) {
        n = r.every(s => o.intersects(s, t));
        o = r.pop();
      }
      return n;
    };
    var TOd = (e, t) => (OC("comp", e, t), e = wOd(e, t), OC("caret", e), e = EOd(e, t), OC("tildes", e), e = ROd(e, t), OC("xrange", e), e = kOd(e, t), OC("stars", e), e);
    var Kj = e => !e || e.toLowerCase() === "x" || e === "*";
    var EOd = (e, t) => e.trim().split(/\s+/).map(n => vOd(n, t)).join(" ");
    var vOd = (e, t) => {
      let n = t.loose ? HW[zj.TILDELOOSE] : HW[zj.TILDE];
      return e.replace(n, (r, o, s, i, a) => {
        OC("tilde", e, r, o, s, i, a);
        let l;
        if (Kj(o)) {
          l = "";
        } else if (Kj(s)) {
          l = `>=${o}.0.0 <${+o + 1}.0.0-0`;
        } else if (Kj(i)) {
          l = `>=${o}.${s}.0 <${o}.${+s + 1}.0-0`;
        } else if (a) {
          OC("replaceTilde pr", a);
          l = `>=${o}.${s}.${i}-${a} <${o}.${+s + 1}.0-0`;
        } else {
          l = `>=${o}.${s}.${i} <${o}.${+s + 1}.0-0`;
        }
        OC("tilde return", l);
        return l;
      });
    };
    var wOd = (e, t) => e.trim().split(/\s+/).map(n => COd(n, t)).join(" ");
    var COd = (e, t) => {
      OC("caret", e, t);
      let n = t.loose ? HW[zj.CARETLOOSE] : HW[zj.CARET];
      let r = t.includePrerelease ? "-0" : "";
      return e.replace(n, (o, s, i, a, l) => {
        OC("caret", e, o, s, i, a, l);
        let c;
        if (Kj(s)) {
          c = "";
        } else if (Kj(i)) {
          c = `>=${s}.0.0${r} <${+s + 1}.0.0-0`;
        } else if (Kj(a)) {
          if (s === "0") {
            c = `>=${s}.${i}.0${r} <${s}.${+i + 1}.0-0`;
          } else {
            c = `>=${s}.${i}.0${r} <${+s + 1}.0.0-0`;
          }
        } else if (l) {
          if (OC("replaceCaret pr", l), s === "0") {
            if (i === "0") {
              c = `>=${s}.${i}.${a}-${l} <${s}.${i}.${+a + 1}-0`;
            } else {
              c = `>=${s}.${i}.${a}-${l} <${s}.${+i + 1}.0-0`;
            }
          } else {
            c = `>=${s}.${i}.${a}-${l} <${+s + 1}.0.0-0`;
          }
        } else if (OC("no pr"), s === "0") {
          if (i === "0") {
            c = `>=${s}.${i}.${a}${r} <${s}.${i}.${+a + 1}-0`;
          } else {
            c = `>=${s}.${i}.${a}${r} <${s}.${+i + 1}.0-0`;
          }
        } else {
          c = `>=${s}.${i}.${a} <${+s + 1}.0.0-0`;
        }
        OC("caret return", c);
        return c;
      });
    };
    var ROd = (e, t) => (OC("replaceXRanges", e, t), e.split(/\s+/).map(n => xOd(n, t)).join(" "));
    var xOd = (e, t) => {
      e = e.trim();
      let n = t.loose ? HW[zj.XRANGELOOSE] : HW[zj.XRANGE];
      return e.replace(n, (r, o, s, i, a, l) => {
        OC("xRange", e, r, o, s, i, a, l);
        let c = Kj(s);
        let u = c || Kj(i);
        let d = u || Kj(a);
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
        OC("xRange return", r);
        return r;
      });
    };
    var kOd = (e, t) => (OC("replaceStars", e, t), e.trim().replace(HW[zj.STAR], ""));
    var AOd = (e, t) => (OC("replaceGTE0", e, t), e.trim().replace(HW[t.includePrerelease ? zj.GTE0PRE : zj.GTE0], ""));
    var IOd = e => (t, n, r, o, s, i, a, l, c, u, d, p) => {
      if (Kj(r)) {
        n = "";
      } else if (Kj(o)) {
        n = `>=${r}.0.0${e ? "-0" : ""}`;
      } else if (Kj(s)) {
        n = `>=${r}.${o}.0${e ? "-0" : ""}`;
      } else if (i) {
        n = `>=${n}`;
      } else {
        n = `>=${n}${e ? "-0" : ""}`;
      }
      if (Kj(c)) {
        l = "";
      } else if (Kj(u)) {
        l = `<${+c + 1}.0.0-0`;
      } else if (Kj(d)) {
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
    var POd = (e, t, n) => {
      for (let r = 0; r < e.length; r++) {
        if (!e[r].test(t)) {
          return false;
        }
      }
      if (t.prerelease.length && !n.includePrerelease) {
        for (let r = 0; r < e.length; r++) {
          if (OC(e[r].semver), e[r].semver === pVr.ANY) {
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
  var QUt = __commonJS((Dqg, RRi) => {
    var ZUt = Symbol("SemVer ANY");
    class OAn {
      static get ANY() {
        return ZUt;
      }
      constructor(e, t) {
        if (t = TRi(t), e instanceof OAn) {
          if (e.loose === !!t.loose) {
            return e;
          } else {
            e = e.value;
          }
        }
        if (e = e.trim().split(/\s+/).join(" "), fVr("comparator", e, t), this.options = t, this.loose = !!t.loose, this.parse(e), this.semver === ZUt) {
          this.value = "";
        } else {
          this.value = this.operator + this.semver.version;
        }
        fVr("comp", this);
      }
      parse(e) {
        let t = this.options.loose ? ERi[vRi.COMPARATORLOOSE] : ERi[vRi.COMPARATOR];
        let n = e.match(t);
        if (!n) {
          throw TypeError(`Invalid comparator: ${e}`);
        }
        if (this.operator = n[1] !== undefined ? n[1] : "", this.operator === "=") {
          this.operator = "";
        }
        if (!n[2]) {
          this.semver = ZUt;
        } else {
          this.semver = new wRi(n[2], this.options.loose);
        }
      }
      toString() {
        return this.value;
      }
      test(e) {
        if (fVr("Comparator.test", e, this.options.loose), this.semver === ZUt || e === ZUt) {
          return true;
        }
        if (typeof e === "string") {
          try {
            e = new wRi(e, this.options);
          } catch (t) {
            return false;
          }
        }
        return mVr(e, this.operator, this.semver, this.options);
      }
      intersects(e, t) {
        if (!(e instanceof OAn)) {
          throw TypeError("a Comparator is required");
        }
        if (this.operator === "") {
          if (this.value === "") {
            return true;
          }
          return new CRi(e.value, t).test(this.value);
        } else if (e.operator === "") {
          if (e.value === "") {
            return true;
          }
          return new CRi(this.value, t).test(e.semver);
        }
        if (t = TRi(t), t.includePrerelease && (this.value === "<0.0.0-0" || e.value === "<0.0.0-0")) {
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
        if (mVr(this.semver, "<", e.semver, t) && this.operator.startsWith(">") && e.operator.startsWith("<")) {
          return true;
        }
        if (mVr(this.semver, ">", e.semver, t) && this.operator.startsWith("<") && e.operator.startsWith(">")) {
          return true;
        }
        return false;
      }
    }
    RRi.exports = OAn;
    var TRi = EAn();
    var {
      safeRe: ERi,
      t: vRi
    } = bit();
    var mVr = dVr();
    var fVr = YUt();
    var wRi = b2();
    var CRi = nJ();
  });
  var eBt = __commonJS((Mqg, xRi) => {
    var OOd = nJ();
    var DOd = (e, t, n) => {
      try {
        t = new OOd(t, n);
      } catch (r) {
        return false;
      }
      return t.test(e);
    };
    xRi.exports = DOd;
  });
  var ARi = __commonJS((Nqg, kRi) => {
    var MOd = nJ();
    var NOd = (e, t) => new MOd(e, t).set.map(n => n.map(r => r.value).join(" ").trim().split(" "));
    kRi.exports = NOd;
  });
  var PRi = __commonJS((Lqg, IRi) => {
    var LOd = b2();
    var FOd = nJ();
    var UOd = (e, t, n) => {
      let r = null;
      let o = null;
      let s = null;
      try {
        s = new FOd(t, n);
      } catch (i) {
        return null;
      }
      e.forEach(i => {
        if (s.test(i)) {
          if (!r || o.compare(i) === -1) {
            r = i;
            o = new LOd(r, n);
          }
        }
      });
      return r;
    };
    IRi.exports = UOd;
  });
  var DRi = __commonJS((Fqg, ORi) => {
    var BOd = b2();
    var $Od = nJ();
    var HOd = (e, t, n) => {
      let r = null;
      let o = null;
      let s = null;
      try {
        s = new $Od(t, n);
      } catch (i) {
        return null;
      }
      e.forEach(i => {
        if (s.test(i)) {
          if (!r || o.compare(i) === 1) {
            r = i;
            o = new BOd(r, n);
          }
        }
      });
      return r;
    };
    ORi.exports = HOd;
  });
  var LRi = __commonJS((Uqg, NRi) => {
    var hVr = b2();
    var jOd = nJ();
    var MRi = JUt();
    var qOd = (e, t) => {
      e = new jOd(e, t);
      let n = new hVr("0.0.0");
      if (e.test(n)) {
        return n;
      }
      if (n = new hVr("0.0.0-0"), e.test(n)) {
        return n;
      }
      n = null;
      for (let r = 0; r < e.set.length; ++r) {
        let o = e.set[r];
        let s = null;
        if (o.forEach(i => {
          let a = new hVr(i.semver.version);
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
              if (!s || MRi(a, s)) {
                s = a;
              }
              break;
            case "<":
            case "<=":
              break;
            default:
              throw Error(`Unexpected operation: ${i.operator}`);
          }
        }), s && (!n || MRi(n, s))) {
          n = s;
        }
      }
      if (n && e.test(n)) {
        return n;
      }
      return null;
    };
    NRi.exports = qOd;
  });
  var URi = __commonJS((Bqg, FRi) => {
    var WOd = nJ();
    var GOd = (e, t) => {
      try {
        return new WOd(e, t).range || "*";
      } catch (n) {
        return null;
      }
    };
    FRi.exports = GOd;
  });
  var DAn = __commonJS(($qg, jRi) => {
    var VOd = b2();
    var HRi = QUt();
    var {
      ANY: zOd
    } = HRi;
    var KOd = nJ();
    var YOd = eBt();
    var BRi = JUt();
    var $Ri = xAn();
    var JOd = AAn();
    var XOd = kAn();
    var QOd = (e, t, n, r) => {
      e = new VOd(e, r);
      t = new KOd(t, r);
      let o;
      let s;
      let i;
      let a;
      let l;
      switch (n) {
        case ">":
          o = BRi;
          s = JOd;
          i = $Ri;
          a = ">";
          l = ">=";
          break;
        case "<":
          o = $Ri;
          s = XOd;
          i = BRi;
          a = "<";
          l = "<=";
          break;
        default:
          throw TypeError('Must provide a hilo val of "<" or ">"');
      }
      if (YOd(e, t, r)) {
        return false;
      }
      for (let c = 0; c < t.set.length; ++c) {
        let u = t.set[c];
        let d = null;
        let p = null;
        if (u.forEach(m => {
          if (m.semver === zOd) {
            m = new HRi(">=0.0.0");
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
    jRi.exports = QOd;
  });
  var WRi = __commonJS((Hqg, qRi) => {
    var ZOd = DAn();
    var eDd = (e, t, n) => ZOd(e, t, ">", n);
    qRi.exports = eDd;
  });
  var VRi = __commonJS((jqg, GRi) => {
    var tDd = DAn();
    var nDd = (e, t, n) => tDd(e, t, "<", n);
    GRi.exports = nDd;
  });
  var YRi = __commonJS((qqg, KRi) => {
    var zRi = nJ();
    var rDd = (e, t, n) => (e = new zRi(e, n), t = new zRi(t, n), e.intersects(t, n));
    KRi.exports = rDd;
  });
  var XRi = __commonJS((Wqg, JRi) => {
    var oDd = eBt();
    var sDd = tJ();
    JRi.exports = (e, t, n) => {
      let r = [];
      let o = null;
      let s = null;
      let i = e.sort((u, d) => sDd(u, d, n));
      for (let u of i) {
        if (oDd(u, t, n)) {
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
  var rxi = __commonJS((Gqg, nxi) => {
    var QRi = nJ();
    var yVr = QUt();
    var {
      ANY: gVr
    } = yVr;
    var tBt = eBt();
    var _Vr = tJ();
    var iDd = (e, t, n = {}) => {
      if (e === t) {
        return true;
      }
      e = new QRi(e, n);
      t = new QRi(t, n);
      let r = false;
      e: for (let o of e.set) {
        for (let s of t.set) {
          let i = lDd(o, s, n);
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
    var aDd = [new yVr(">=0.0.0-0")];
    var ZRi = [new yVr(">=0.0.0")];
    var lDd = (e, t, n) => {
      if (e === t) {
        return true;
      }
      if (e.length === 1 && e[0].semver === gVr) {
        if (t.length === 1 && t[0].semver === gVr) {
          return true;
        } else if (n.includePrerelease) {
          e = aDd;
        } else {
          e = ZRi;
        }
      }
      if (t.length === 1 && t[0].semver === gVr) {
        if (n.includePrerelease) {
          return true;
        } else {
          t = ZRi;
        }
      }
      let r = new Set();
      let o;
      let s;
      for (let m of e) {
        if (m.operator === ">" || m.operator === ">=") {
          o = exi(o, m, n);
        } else if (m.operator === "<" || m.operator === "<=") {
          s = txi(s, m, n);
        } else {
          r.add(m.semver);
        }
      }
      if (r.size > 1) {
        return null;
      }
      let i;
      if (o && s) {
        if (i = _Vr(o.semver, s.semver, n), i > 0) {
          return null;
        } else if (i === 0 && (o.operator !== ">=" || s.operator !== "<=")) {
          return null;
        }
      }
      for (let m of r) {
        if (o && !tBt(m, String(o), n)) {
          return null;
        }
        if (s && !tBt(m, String(s), n)) {
          return null;
        }
        for (let f of t) {
          if (!tBt(m, String(f), n)) {
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
            if (a = exi(o, m, n), a === m && a !== o) {
              return false;
            }
          } else if (o.operator === ">=" && !tBt(o.semver, String(m), n)) {
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
            if (l = txi(s, m, n), l === m && l !== s) {
              return false;
            }
          } else if (s.operator === "<=" && !tBt(s.semver, String(m), n)) {
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
    var exi = (e, t, n) => {
      if (!e) {
        return t;
      }
      let r = _Vr(e.semver, t.semver, n);
      return r > 0 ? e : r < 0 ? t : t.operator === ">" && e.operator === ">=" ? t : e;
    };
    var txi = (e, t, n) => {
      if (!e) {
        return t;
      }
      let r = _Vr(e.semver, t.semver, n);
      return r < 0 ? e : r > 0 ? t : t.operator === "<" && e.operator === "<=" ? t : e;
    };
    nxi.exports = iDd;
  });
  var MAn = __commonJS((Vqg, ixi) => {
    var bVr = bit();
    var oxi = KUt();
    var cDd = b2();
    var sxi = lVr();
    var uDd = q3e();
    var dDd = ICi();
    var pDd = OCi();
    var mDd = NCi();
    var fDd = UCi();
    var hDd = $Ci();
    var gDd = jCi();
    var yDd = WCi();
    var _Dd = VCi();
    var bDd = tJ();
    var SDd = JCi();
    var TDd = QCi();
    var EDd = RAn();
    var vDd = nRi();
    var wDd = oRi();
    var CDd = JUt();
    var RDd = xAn();
    var xDd = cVr();
    var kDd = uVr();
    var ADd = kAn();
    var IDd = AAn();
    var PDd = dVr();
    var ODd = mRi();
    var DDd = QUt();
    var MDd = nJ();
    var NDd = eBt();
    var LDd = ARi();
    var FDd = PRi();
    var UDd = DRi();
    var BDd = LRi();
    var $Dd = URi();
    var HDd = DAn();
    var jDd = WRi();
    var qDd = VRi();
    var WDd = YRi();
    var GDd = XRi();
    var VDd = rxi();
    ixi.exports = {
      parse: uDd,
      valid: dDd,
      clean: pDd,
      inc: mDd,
      diff: fDd,
      major: hDd,
      minor: gDd,
      patch: yDd,
      prerelease: _Dd,
      compare: bDd,
      rcompare: SDd,
      compareLoose: TDd,
      compareBuild: EDd,
      sort: vDd,
      rsort: wDd,
      gt: CDd,
      lt: RDd,
      eq: xDd,
      neq: kDd,
      gte: ADd,
      lte: IDd,
      cmp: PDd,
      coerce: ODd,
      Comparator: DDd,
      Range: MDd,
      satisfies: NDd,
      toComparators: LDd,
      maxSatisfying: FDd,
      minSatisfying: UDd,
      minVersion: BDd,
      validRange: $Dd,
      outside: HDd,
      gtr: jDd,
      ltr: qDd,
      intersects: WDd,
      simplifyRange: GDd,
      subset: VDd,
      SemVer: cDd,
      re: bVr.re,
      src: bVr.src,
      tokens: bVr.t,
      SEMVER_SPEC_VERSION: oxi.SEMVER_SPEC_VERSION,
      RELEASE_TYPES: oxi.RELEASE_TYPES,
      compareIdentifiers: sxi.compareIdentifiers,
      rcompareIdentifiers: sxi.rcompareIdentifiers
    };
  });
  var lxi = __commonJS((zqg, axi) => {
    var zDd = MAn();
    axi.exports = zDd.satisfies(process.version, ">=15.7.0");
  });
  var uxi = __commonJS((Kqg, cxi) => {
    var KDd = MAn();
    cxi.exports = KDd.satisfies(process.version, ">=16.9.0");
  });
  var SVr = __commonJS((Yqg, dxi) => {
    var YDd = lxi();
    var JDd = uxi();
    var XDd = {
      ec: ["ES256", "ES384", "ES512"],
      rsa: ["RS256", "PS256", "RS384", "PS384", "RS512", "PS512"],
      "rsa-pss": ["PS256", "PS384", "PS512"]
    };
    var QDd = {
      ES256: "prime256v1",
      ES384: "secp384r1",
      ES512: "secp521r1"
    };
    dxi.exports = function (e, t) {
      if (!e || !t) {
        return;
      }
      let n = t.asymmetricKeyType;
      if (!n) {
        return;
      }
      let r = XDd[n];
      if (!r) {
        throw Error(`Unknown key type "${n}".`);
      }
      if (!r.includes(e)) {
        throw Error(`"alg" parameter for "${n}" key type must be one of: ${r.join(", ")}.`);
      }
      if (YDd) {
        switch (n) {
          case "ec":
            let o = t.asymmetricKeyDetails.namedCurve;
            let s = QDd[e];
            if (o !== s) {
              throw Error(`"alg" parameter "${e}" requires curve "${s}".`);
            }
            break;
          case "rsa-pss":
            if (JDd) {
              let i = parseInt(e.slice(-3), 10);
              let {
                hashAlgorithm: a,
                mgf1HashAlgorithm: l,
                saltLength: c
              } = t.asymmetricKeyDetails;
              if (a !== `sha${i}` || l !== a) {
                throw Error(`Invalid key for this operation, its RSA-PSS parameters do not meet the requirements of "alg" ${e}.`);
              }
              if (c !== undefined && c > i >> 3) {
                throw Error(`Invalid key for this operation, its RSA-PSS parameter saltLength does not meet the requirements of "alg" ${e}.`);
              }
            }
            break;
        }
      }
    };
  });
  var TVr = __commonJS((Jqg, pxi) => {
    var ZDd = MAn();
    pxi.exports = ZDd.satisfies(process.version, "^6.12.0 || >=8.0.0");
  });
  var hxi = __commonJS((Xqg, fxi) => {
    var lw = zUt();
    var eMd = rVr();
    var mxi = oVr();
    var tMd = nVr();
    var nMd = sVr();
    var rMd = SVr();
    var oMd = TVr();
    var sMd = _it();
    var {
      KeyObject: iMd,
      createSecretKey: aMd,
      createPublicKey: lMd
    } = require("crypto");
    var EVr = ["RS256", "RS384", "RS512"];
    var cMd = ["ES256", "ES384", "ES512"];
    var vVr = ["RS256", "RS384", "RS512"];
    var uMd = ["HS256", "HS384", "HS512"];
    if (oMd) {
      EVr.splice(EVr.length, 0, "PS256", "PS384", "PS512");
      vVr.splice(vVr.length, 0, "PS256", "PS384", "PS512");
    }
    fxi.exports = function (e, t, n, r) {
      if (typeof n === "function" && !r) {
        r = n;
        n = {};
      }
      if (!n) {
        n = {};
      }
      n = Object.assign({}, n);
      let o;
      if (r) {
        o = r;
      } else {
        o = function (u, d) {
          if (u) {
            throw u;
          }
          return d;
        };
      }
      if (n.clockTimestamp && typeof n.clockTimestamp !== "number") {
        return o(new lw("clockTimestamp must be a number"));
      }
      if (n.nonce !== undefined && (typeof n.nonce !== "string" || n.nonce.trim() === "")) {
        return o(new lw("nonce must be a non-empty string"));
      }
      if (n.allowInvalidAsymmetricKeyTypes !== undefined && typeof n.allowInvalidAsymmetricKeyTypes !== "boolean") {
        return o(new lw("allowInvalidAsymmetricKeyTypes must be a boolean"));
      }
      let s = n.clockTimestamp || Math.floor(Date.now() / 1000);
      if (!e) {
        return o(new lw("jwt must be provided"));
      }
      if (typeof e !== "string") {
        return o(new lw("jwt must be a string"));
      }
      let i = e.split(".");
      if (i.length !== 3) {
        return o(new lw("jwt malformed"));
      }
      let a;
      try {
        a = tMd(e, {
          complete: true
        });
      } catch (u) {
        return o(u);
      }
      if (!a) {
        return o(new lw("invalid token"));
      }
      let l = a.header;
      let c;
      if (typeof t === "function") {
        if (!r) {
          return o(new lw("verify must be called asynchronous if secret or public key is provided as a callback"));
        }
        c = t;
      } else {
        c = function (u, d) {
          return d(null, t);
        };
      }
      return c(l, function (u, d) {
        if (u) {
          return o(new lw("error in secret or public key callback: " + u.message));
        }
        let p = i[2].trim() !== "";
        if (!p && d) {
          return o(new lw("jwt signature is required"));
        }
        if (p && !d) {
          return o(new lw("secret or public key must be provided"));
        }
        if (!p && !n.algorithms) {
          return o(new lw('please specify "none" in "algorithms" to verify unsigned tokens'));
        }
        if (d != null && !(d instanceof iMd)) {
          try {
            d = lMd(d);
          } catch (h) {
            try {
              d = aMd(typeof d === "string" ? Buffer.from(d) : d);
            } catch (g) {
              return o(new lw("secretOrPublicKey is not valid key material"));
            }
          }
        }
        if (!n.algorithms) {
          if (d.type === "secret") {
            n.algorithms = uMd;
          } else if (["rsa", "rsa-pss"].includes(d.asymmetricKeyType)) {
            n.algorithms = vVr;
          } else if (d.asymmetricKeyType === "ec") {
            n.algorithms = cMd;
          } else {
            n.algorithms = EVr;
          }
        }
        if (n.algorithms.indexOf(a.header.alg) === -1) {
          return o(new lw("invalid algorithm"));
        }
        if (l.alg.startsWith("HS") && d.type !== "secret") {
          return o(new lw(`secretOrPublicKey must be a symmetric key when using ${l.alg}`));
        } else if (/^(?:RS|PS|ES)/.test(l.alg) && d.type !== "public") {
          return o(new lw(`secretOrPublicKey must be an asymmetric key when using ${l.alg}`));
        }
        if (!n.allowInvalidAsymmetricKeyTypes) {
          try {
            rMd(l.alg, d);
          } catch (h) {
            return o(h);
          }
        }
        let m;
        try {
          m = sMd.verify(e, a.header.alg, d);
        } catch (h) {
          return o(h);
        }
        if (!m) {
          return o(new lw("invalid signature"));
        }
        let f = a.payload;
        if (typeof f.nbf < "u" && !n.ignoreNotBefore) {
          if (typeof f.nbf !== "number") {
            return o(new lw("invalid nbf value"));
          }
          if (f.nbf > s + (n.clockTolerance || 0)) {
            return o(new eMd("jwt not active", new Date(f.nbf * 1000)));
          }
        }
        if (typeof f.exp < "u" && !n.ignoreExpiration) {
          if (typeof f.exp !== "number") {
            return o(new lw("invalid exp value"));
          }
          if (s >= f.exp + (n.clockTolerance || 0)) {
            return o(new mxi("jwt expired", new Date(f.exp * 1000)));
          }
        }
        if (n.audience) {
          let h = Array.isArray(n.audience) ? n.audience : [n.audience];
          if (!(Array.isArray(f.aud) ? f.aud : [f.aud]).some(function (_) {
            return h.some(function (b) {
              return b instanceof RegExp ? b.test(_) : b === _;
            });
          })) {
            return o(new lw("jwt audience invalid. expected: " + h.join(" or ")));
          }
        }
        if (n.issuer) {
          if (typeof n.issuer === "string" && f.iss !== n.issuer || Array.isArray(n.issuer) && n.issuer.indexOf(f.iss) === -1) {
            return o(new lw("jwt issuer invalid. expected: " + n.issuer));
          }
        }
        if (n.subject) {
          if (f.sub !== n.subject) {
            return o(new lw("jwt subject invalid. expected: " + n.subject));
          }
        }
        if (n.jwtid) {
          if (f.jti !== n.jwtid) {
            return o(new lw("jwt jwtid invalid. expected: " + n.jwtid));
          }
        }
        if (n.nonce) {
          if (f.nonce !== n.nonce) {
            return o(new lw("jwt nonce invalid. expected: " + n.nonce));
          }
        }
        if (n.maxAge) {
          if (typeof f.iat !== "number") {
            return o(new lw("iat required when maxAge is specified"));
          }
          let h = nMd(n.maxAge, f.iat);
          if (typeof h > "u") {
            return o(new lw('"maxAge" should be a number of seconds or string representing a timespan eg: "1d", "20h", 60'));
          }
          if (s >= h + (n.clockTolerance || 0)) {
            return o(new mxi("maxAge exceeded", new Date(h * 1000)));
          }
        }
        if (n.complete === true) {
          let h = a.signature;
          return o(null, {
            header: l,
            payload: f,
            signature: h
          });
        }
        return o(null, f);
      });
    };
  });
  var Txi = __commonJS((Qqg, Sxi) => {
    var gxi = 1 / 0;
    var yxi = NaN;
    var EMd = parseInt;
    function vMd(e, t) {
      var n = -1;
      var r = e ? e.length : 0;
      var o = Array(r);
      while (++n < r) {
        o[n] = t(e[n], n, e);
      }
      return o;
    }
    function wMd(e, t, n, r) {
      var o = e.length;
      var s = n + (r ? 1 : -1);
      while (r ? s-- : ++s < o) {
        if (t(e[s], s, e)) {
          return s;
        }
      }
      return -1;
    }
    function CMd(e, t, n) {
      if (t !== t) {
        return wMd(e, RMd, n);
      }
      var r = n - 1;
      var o = e.length;
      while (++r < o) {
        if (e[r] === t) {
          return r;
        }
      }
      return -1;
    }
    function RMd(e) {
      return e !== e;
    }
    function xMd(e, t) {
      var n = -1;
      var r = Array(e);
      while (++n < e) {
        r[n] = t(n);
      }
      return r;
    }
    function kMd(e, t) {
      return vMd(t, function (n) {
        return e[n];
      });
    }
    function AMd(e, t) {
      return function (n) {
        return e(t(n));
      };
    }
    var NAn = Object.prototype;
    var CVr = NAn.hasOwnProperty;
    var LAn = NAn.toString;
    var IMd = NAn.propertyIsEnumerable;
    var PMd = AMd(Object.keys, Object);
    var OMd = Math.max;
    function DMd(e, t) {
      var n = bxi(e) || UMd(e) ? xMd(e.length, String) : [];
      var r = n.length;
      var o = !!r;
      for (var s in e) {
        if ((t || CVr.call(e, s)) && !(o && (s == "length" || NMd(s, r)))) {
          n.push(s);
        }
      }
      return n;
    }
    function MMd(e) {
      if (!LMd(e)) {
        return PMd(e);
      }
      var t = [];
      for (var n in Object(e)) {
        if (CVr.call(e, n) && n != "constructor") {
          t.push(n);
        }
      }
      return t;
    }
    function NMd(e, t) {
      t = t == null ? 9007199254740991 : t;
      return !!t && (typeof e == "number" || (/^(?:0|[1-9]\d*)$/).test(e)) && e > -1 && e % 1 == 0 && e < t;
    }
    function LMd(e) {
      var t = e && e.constructor;
      var n = typeof t == "function" && t.prototype || NAn;
      return e === n;
    }
    function FMd(e, t, n, r) {
      e = RVr(e) ? e : KMd(e);
      n = n && !r ? GMd(n) : 0;
      var o = e.length;
      if (n < 0) {
        n = OMd(o + n, 0);
      }
      return jMd(e) ? n <= o && e.indexOf(t, n) > -1 : !!o && CMd(e, t, n) > -1;
    }
    function UMd(e) {
      return BMd(e) && CVr.call(e, "callee") && (!IMd.call(e, "callee") || LAn.call(e) == "[object Arguments]");
    }
    var bxi = Array.isArray;
    function RVr(e) {
      return e != null && HMd(e.length) && !$Md(e);
    }
    function BMd(e) {
      return xVr(e) && RVr(e);
    }
    function $Md(e) {
      var t = wVr(e) ? LAn.call(e) : "";
      return t == "[object Function]" || t == "[object GeneratorFunction]";
    }
    function HMd(e) {
      return typeof e == "number" && e > -1 && e % 1 == 0 && e <= 9007199254740991;
    }
    function wVr(e) {
      var t = typeof e;
      return !!e && (t == "object" || t == "function");
    }
    function xVr(e) {
      return !!e && typeof e == "object";
    }
    function jMd(e) {
      return typeof e == "string" || !bxi(e) && xVr(e) && LAn.call(e) == "[object String]";
    }
    function qMd(e) {
      return typeof e == "symbol" || xVr(e) && LAn.call(e) == "[object Symbol]";
    }
    function WMd(e) {
      if (!e) {
        return e === 0 ? e : 0;
      }
      if (e = VMd(e), e === gxi || e === -gxi) {
        var t = e < 0 ? -1 : 1;
        return t * 179769313486231570000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000;
      }
      return e === e ? e : 0;
    }
    function GMd(e) {
      var t = WMd(e);
      var n = t % 1;
      return t === t ? n ? t - n : t : 0;
    }
    function VMd(e) {
      if (typeof e == "number") {
        return e;
      }
      if (qMd(e)) {
        return yxi;
      }
      if (wVr(e)) {
        var t = typeof e.valueOf == "function" ? e.valueOf() : e;
        e = wVr(t) ? t + "" : t;
      }
      if (typeof e != "string") {
        return e === 0 ? e : +e;
      }
      e = e.replace(/^\s+|\s+$/g, "");
      var n = (/^0b[01]+$/i).test(e);
      return n || (/^0o[0-7]+$/i).test(e) ? EMd(e.slice(2), n ? 2 : 8) : (/^[-+]0x[0-9a-f]+$/i).test(e) ? yxi : +e;
    }
    function zMd(e) {
      return RVr(e) ? DMd(e) : MMd(e);
    }
    function KMd(e) {
      return e ? kMd(e, zMd(e)) : [];
    }
    Sxi.exports = FMd;
  });
  var vxi = __commonJS((Zqg, Exi) => {
    var JMd = Object.prototype;
    var XMd = JMd.toString;
    function QMd(e) {
      return e === true || e === false || ZMd(e) && XMd.call(e) == "[object Boolean]";
    }
    function ZMd(e) {
      return !!e && typeof e == "object";
    }
    Exi.exports = QMd;
  });
  var kxi = __commonJS((e3g, xxi) => {
    var wxi = 1 / 0;
    var Cxi = NaN;
    var iNd = parseInt;
    var aNd = Object.prototype;
    var lNd = aNd.toString;
    function cNd(e) {
      return typeof e == "number" && e == mNd(e);
    }
    function Rxi(e) {
      var t = typeof e;
      return !!e && (t == "object" || t == "function");
    }
    function uNd(e) {
      return !!e && typeof e == "object";
    }
    function dNd(e) {
      return typeof e == "symbol" || uNd(e) && lNd.call(e) == "[object Symbol]";
    }
    function pNd(e) {
      if (!e) {
        return e === 0 ? e : 0;
      }
      if (e = fNd(e), e === wxi || e === -wxi) {
        var t = e < 0 ? -1 : 1;
        return t * 179769313486231570000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000;
      }
      return e === e ? e : 0;
    }
    function mNd(e) {
      var t = pNd(e);
      var n = t % 1;
      return t === t ? n ? t - n : t : 0;
    }
    function fNd(e) {
      if (typeof e == "number") {
        return e;
      }
      if (dNd(e)) {
        return Cxi;
      }
      if (Rxi(e)) {
        var t = typeof e.valueOf == "function" ? e.valueOf() : e;
        e = Rxi(t) ? t + "" : t;
      }
      if (typeof e != "string") {
        return e === 0 ? e : +e;
      }
      e = e.replace(/^\s+|\s+$/g, "");
      var n = (/^0b[01]+$/i).test(e);
      return n || (/^0o[0-7]+$/i).test(e) ? iNd(e.slice(2), n ? 2 : 8) : (/^[-+]0x[0-9a-f]+$/i).test(e) ? Cxi : +e;
    }
    xxi.exports = cNd;
  });
  var Ixi = __commonJS((t3g, Axi) => {
    var gNd = Object.prototype;
    var yNd = gNd.toString;
    function _Nd(e) {
      return !!e && typeof e == "object";
    }
    function bNd(e) {
      return typeof e == "number" || _Nd(e) && yNd.call(e) == "[object Number]";
    }
    Axi.exports = bNd;
  });
  var Mxi = __commonJS((n3g, Dxi) => {
    function TNd(e) {
      var t = false;
      if (e != null && typeof e.toString != "function") {
        try {
          t = !!(e + "");
        } catch (n) {}
      }
      return t;
    }
    function ENd(e, t) {
      return function (n) {
        return e(t(n));
      };
    }
    var vNd = Function.prototype;
    var Pxi = Object.prototype;
    var Oxi = vNd.toString;
    var wNd = Pxi.hasOwnProperty;
    var CNd = Oxi.call(Object);
    var RNd = Pxi.toString;
    var xNd = ENd(Object.getPrototypeOf, Object);
    function kNd(e) {
      return !!e && typeof e == "object";
    }
    function ANd(e) {
      if (!kNd(e) || RNd.call(e) != "[object Object]" || TNd(e)) {
        return false;
      }
      var t = xNd(e);
      if (t === null) {
        return true;
      }
      var n = wNd.call(t, "constructor") && t.constructor;
      return typeof n == "function" && n instanceof n && Oxi.call(n) == CNd;
    }
    Dxi.exports = ANd;
  });
  var Lxi = __commonJS((r3g, Nxi) => {
    var PNd = Object.prototype;
    var ONd = PNd.toString;
    var DNd = Array.isArray;
    function MNd(e) {
      return !!e && typeof e == "object";
    }
    function NNd(e) {
      return typeof e == "string" || !DNd(e) && MNd(e) && ONd.call(e) == "[object String]";
    }
    Nxi.exports = NNd;
  });
  var Hxi = __commonJS((o3g, $xi) => {
    var Fxi = 1 / 0;
    var Uxi = NaN;
    var qNd = parseInt;
    var WNd = Object.prototype;
    var GNd = WNd.toString;
    function VNd(e, t) {
      var n;
      if (typeof t != "function") {
        throw TypeError("Expected a function");
      }
      e = XNd(e);
      return function () {
        if (--e > 0) {
          n = t.apply(this, arguments);
        }
        if (e <= 1) {
          t = undefined;
        }
        return n;
      };
    }
    function zNd(e) {
      return VNd(2, e);
    }
    function Bxi(e) {
      var t = typeof e;
      return !!e && (t == "object" || t == "function");
    }
    function KNd(e) {
      return !!e && typeof e == "object";
    }
    function YNd(e) {
      return typeof e == "symbol" || KNd(e) && GNd.call(e) == "[object Symbol]";
    }
    function JNd(e) {
      if (!e) {
        return e === 0 ? e : 0;
      }
      if (e = QNd(e), e === Fxi || e === -Fxi) {
        var t = e < 0 ? -1 : 1;
        return t * 179769313486231570000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000;
      }
      return e === e ? e : 0;
    }
    function XNd(e) {
      var t = JNd(e);
      var n = t % 1;
      return t === t ? n ? t - n : t : 0;
    }
    function QNd(e) {
      if (typeof e == "number") {
        return e;
      }
      if (YNd(e)) {
        return Uxi;
      }
      if (Bxi(e)) {
        var t = typeof e.valueOf == "function" ? e.valueOf() : e;
        e = Bxi(t) ? t + "" : t;
      }
      if (typeof e != "string") {
        return e === 0 ? e : +e;
      }
      e = e.replace(/^\s+|\s+$/g, "");
      var n = (/^0b[01]+$/i).test(e);
      return n || (/^0o[0-7]+$/i).test(e) ? qNd(e.slice(2), n ? 2 : 8) : (/^[-+]0x[0-9a-f]+$/i).test(e) ? Uxi : +e;
    }
    $xi.exports = zNd;
  });
  var Jxi = __commonJS((s3g, Yxi) => {
    var jxi = sVr();
    var ZNd = TVr();
    var e1d = SVr();
    var qxi = _it();
    var t1d = Txi();
    var FAn = vxi();
    var Wxi = kxi();
    var kVr = Ixi();
    var Vxi = Mxi();
    var Q0e = Lxi();
    var n1d = Hxi();
    var {
      KeyObject: r1d,
      createSecretKey: o1d,
      createPrivateKey: s1d
    } = require("crypto");
    var zxi = ["RS256", "RS384", "RS512", "ES256", "ES384", "ES512", "HS256", "HS384", "HS512", "none"];
    if (ZNd) {
      zxi.splice(3, 0, "PS256", "PS384", "PS512");
    }
    var i1d = {
      expiresIn: {
        isValid: function (e) {
          return Wxi(e) || Q0e(e) && e;
        },
        message: '"expiresIn" should be a number of seconds or string representing a timespan'
      },
      notBefore: {
        isValid: function (e) {
          return Wxi(e) || Q0e(e) && e;
        },
        message: '"notBefore" should be a number of seconds or string representing a timespan'
      },
      audience: {
        isValid: function (e) {
          return Q0e(e) || Array.isArray(e);
        },
        message: '"audience" must be a string or array'
      },
      algorithm: {
        isValid: t1d.bind(null, zxi),
        message: '"algorithm" must be a valid string enum value'
      },
      header: {
        isValid: Vxi,
        message: '"header" must be an object'
      },
      encoding: {
        isValid: Q0e,
        message: '"encoding" must be a string'
      },
      issuer: {
        isValid: Q0e,
        message: '"issuer" must be a string'
      },
      subject: {
        isValid: Q0e,
        message: '"subject" must be a string'
      },
      jwtid: {
        isValid: Q0e,
        message: '"jwtid" must be a string'
      },
      noTimestamp: {
        isValid: FAn,
        message: '"noTimestamp" must be a boolean'
      },
      keyid: {
        isValid: Q0e,
        message: '"keyid" must be a string'
      },
      mutatePayload: {
        isValid: FAn,
        message: '"mutatePayload" must be a boolean'
      },
      allowInsecureKeySizes: {
        isValid: FAn,
        message: '"allowInsecureKeySizes" must be a boolean'
      },
      allowInvalidAsymmetricKeyTypes: {
        isValid: FAn,
        message: '"allowInvalidAsymmetricKeyTypes" must be a boolean'
      }
    };
    var a1d = {
      iat: {
        isValid: kVr,
        message: '"iat" should be a number of seconds'
      },
      exp: {
        isValid: kVr,
        message: '"exp" should be a number of seconds'
      },
      nbf: {
        isValid: kVr,
        message: '"nbf" should be a number of seconds'
      }
    };
    function Kxi(e, t, n, r) {
      if (!Vxi(n)) {
        throw Error('Expected "' + r + '" to be a plain object.');
      }
      Object.keys(n).forEach(function (o) {
        let s = e[o];
        if (!s) {
          if (!t) {
            throw Error('"' + o + '" is not allowed in "' + r + '"');
          }
          return;
        }
        if (!s.isValid(n[o])) {
          throw Error(s.message);
        }
      });
    }
    function l1d(e) {
      return Kxi(i1d, false, e, "options");
    }
    function c1d(e) {
      return Kxi(a1d, true, e, "payload");
    }
    var Gxi = {
      audience: "aud",
      issuer: "iss",
      subject: "sub",
      jwtid: "jti"
    };
    var u1d = ["expiresIn", "notBefore", "noTimestamp", "audience", "issuer", "subject", "jwtid"];
    Yxi.exports = function (e, t, n, r) {
      if (typeof n === "function") {
        r = n;
        n = {};
      } else {
        n = n || {};
      }
      let o = typeof e === "object" && !Buffer.isBuffer(e);
      let s = Object.assign({
        alg: n.algorithm || "HS256",
        typ: o ? "JWT" : undefined,
        kid: n.keyid
      }, n.header);
      function i(c) {
        if (r) {
          return r(c);
        }
        throw c;
      }
      if (!t && n.algorithm !== "none") {
        return i(Error("secretOrPrivateKey must have a value"));
      }
      if (t != null && !(t instanceof r1d)) {
        try {
          t = s1d(t);
        } catch (c) {
          try {
            t = o1d(typeof t === "string" ? Buffer.from(t) : t);
          } catch (u) {
            return i(Error("secretOrPrivateKey is not valid key material"));
          }
        }
      }
      if (s.alg.startsWith("HS") && t.type !== "secret") {
        return i(Error(`secretOrPrivateKey must be a symmetric key when using ${s.alg}`));
      } else if (/^(?:RS|PS|ES)/.test(s.alg)) {
        if (t.type !== "private") {
          return i(Error(`secretOrPrivateKey must be an asymmetric key when using ${s.alg}`));
        }
        if (!n.allowInsecureKeySizes && !s.alg.startsWith("ES") && t.asymmetricKeyDetails !== undefined && t.asymmetricKeyDetails.modulusLength < 2048) {
          return i(Error(`secretOrPrivateKey has a minimum key size of 2048 bits for ${s.alg}`));
        }
      }
      if (typeof e > "u") {
        return i(Error("payload is required"));
      } else if (o) {
        try {
          c1d(e);
        } catch (c) {
          return i(c);
        }
        if (!n.mutatePayload) {
          e = Object.assign({}, e);
        }
      } else {
        let c = u1d.filter(function (u) {
          return typeof n[u] < "u";
        });
        if (c.length > 0) {
          return i(Error("invalid " + c.join(",") + " option for " + typeof e + " payload"));
        }
      }
      if (typeof e.exp < "u" && typeof n.expiresIn < "u") {
        return i(Error('Bad "options.expiresIn" option the payload already has an "exp" property.'));
      }
      if (typeof e.nbf < "u" && typeof n.notBefore < "u") {
        return i(Error('Bad "options.notBefore" option the payload already has an "nbf" property.'));
      }
      try {
        l1d(n);
      } catch (c) {
        return i(c);
      }
      if (!n.allowInvalidAsymmetricKeyTypes) {
        try {
          e1d(s.alg, t);
        } catch (c) {
          return i(c);
        }
      }
      let a = e.iat || Math.floor(Date.now() / 1000);
      if (n.noTimestamp) {
        delete e.iat;
      } else if (o) {
        e.iat = a;
      }
      if (typeof n.notBefore < "u") {
        try {
          e.nbf = jxi(n.notBefore, a);
        } catch (c) {
          return i(c);
        }
        if (typeof e.nbf > "u") {
          return i(Error('"notBefore" should be a number of seconds or string representing a timespan eg: "1d", "20h", 60'));
        }
      }
      if (typeof n.expiresIn < "u" && typeof e === "object") {
        try {
          e.exp = jxi(n.expiresIn, a);
        } catch (c) {
          return i(c);
        }
        if (typeof e.exp > "u") {
          return i(Error('"expiresIn" should be a number of seconds or string representing a timespan eg: "1d", "20h", 60'));
        }
      }
      Object.keys(Gxi).forEach(function (c) {
        let u = Gxi[c];
        if (typeof n[c] < "u") {
          if (typeof e[u] < "u") {
            return i(Error('Bad "options.' + c + '" option. The payload already has an "' + u + '" property.'));
          }
          e[u] = n[c];
        }
      });
      let l = n.encoding || "utf8";
      if (typeof r === "function") {
        r = r && n1d(r);
        qxi.createSign({
          header: s,
          privateKey: t,
          payload: e,
          encoding: l
        }).once("error", r).once("done", function (c) {
          if (!n.allowInsecureKeySizes && /^(?:RS|PS)/.test(s.alg) && c.length < 256) {
            return r(Error(`secretOrPrivateKey has a minimum key size of 2048 bits for ${s.alg}`));
          }
          r(null, c);
        });
      } else {
        let c = qxi.sign({
          header: s,
          payload: e,
          secret: t,
          encoding: l
        });
        if (!n.allowInsecureKeySizes && /^(?:RS|PS)/.test(s.alg) && c.length < 256) {
          throw Error(`secretOrPrivateKey has a minimum key size of 2048 bits for ${s.alg}`);
        }
        return c;
      }
    };
  });
  var Qxi = __commonJS((i3g, Xxi) => {
    Xxi.exports = {
      oC: nVr(),
      verify: hxi(),
      sign: Jxi(),
      JsonWebTokenError: zUt(),
      NotBeforeError: rVr(),
      TokenExpiredError: oVr()
    };
  });