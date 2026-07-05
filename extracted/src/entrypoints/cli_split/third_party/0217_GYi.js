  var GYi = __commonJS((KSy, WYi) => {
    var qYi = $ct();
    var cZd = (e, t, n = false) => {
      if (e instanceof qYi) {
        return e;
      }
      try {
        return new qYi(e, t);
      } catch (r) {
        if (!n) {
          return null;
        }
        throw r;
      }
    };
    WYi.exports = cZd;
  });
  var zYi = __commonJS((YSy, VYi) => {
    var uZd = $ct();
    var dZd = GYi();
    var {
      safeRe: J1n,
      t: X1n
    } = ujt();
    var pZd = (e, t) => {
      if (e instanceof uZd) {
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
        n = e.match(t.includePrerelease ? J1n[X1n.COERCEFULL] : J1n[X1n.COERCE]);
      } else {
        let l = t.includePrerelease ? J1n[X1n.COERCERTLFULL] : J1n[X1n.COERCERTL];
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
      return dZd(`${r}.${o}.${s}${i}${a}`, t);
    };
    VYi.exports = pZd;
  });
  var nGe = __commonJS((JSy, YYi) => {
    var KYi = $ct();
    var mZd = (e, t, n) => new KYi(e, n).compare(new KYi(t, n));
    YYi.exports = mZd;
  });
  var Tro = __commonJS((XSy, JYi) => {
    var fZd = nGe();
    var hZd = (e, t, n) => fZd(e, t, n) >= 0;
    JYi.exports = hZd;
  });
  var ZYi = __commonJS((QSy, QYi) => {
    class XYi {
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
    QYi.exports = XYi;
  });
  var tJi = __commonJS((ZSy, eJi) => {
    var gZd = nGe();
    var yZd = (e, t, n) => gZd(e, t, n) === 0;
    eJi.exports = yZd;
  });
  var rJi = __commonJS((eTy, nJi) => {
    var _Zd = nGe();
    var bZd = (e, t, n) => _Zd(e, t, n) !== 0;
    nJi.exports = bZd;
  });
  var sJi = __commonJS((tTy, oJi) => {
    var SZd = nGe();
    var TZd = (e, t, n) => SZd(e, t, n) > 0;
    oJi.exports = TZd;
  });
  var aJi = __commonJS((nTy, iJi) => {
    var EZd = nGe();
    var vZd = (e, t, n) => EZd(e, t, n) < 0;
    iJi.exports = vZd;
  });
  var cJi = __commonJS((rTy, lJi) => {
    var wZd = nGe();
    var CZd = (e, t, n) => wZd(e, t, n) <= 0;
    lJi.exports = CZd;
  });
  var dJi = __commonJS((oTy, uJi) => {
    var RZd = tJi();
    var xZd = rJi();
    var kZd = sJi();
    var AZd = Tro();
    var IZd = aJi();
    var PZd = cJi();
    var OZd = (e, t, n, r) => {
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
          return RZd(e, n, r);
        case "!=":
          return xZd(e, n, r);
        case ">":
          return kZd(e, n, r);
        case ">=":
          return AZd(e, n, r);
        case "<":
          return IZd(e, n, r);
        case "<=":
          return PZd(e, n, r);
        default:
          throw TypeError(`Invalid operator: ${t}`);
      }
    };
    uJi.exports = OZd;
  });
  var _Ji = __commonJS((sTy, yJi) => {
    var djt = Symbol("SemVer ANY");
    class Q1n {
      static get ANY() {
        return djt;
      }
      constructor(e, t) {
        if (t = pJi(t), e instanceof Q1n) {
          if (e.loose === !!t.loose) {
            return e;
          } else {
            e = e.value;
          }
        }
        if (e = e.trim().split(/\s+/).join(" "), vro("comparator", e, t), this.options = t, this.loose = !!t.loose, this.parse(e), this.semver === djt) {
          this.value = "";
        } else {
          this.value = this.operator + this.semver.version;
        }
        vro("comp", this);
      }
      parse(e) {
        let t = this.options.loose ? mJi[fJi.COMPARATORLOOSE] : mJi[fJi.COMPARATOR];
        let n = e.match(t);
        if (!n) {
          throw TypeError(`Invalid comparator: ${e}`);
        }
        if (this.operator = n[1] !== undefined ? n[1] : "", this.operator === "=") {
          this.operator = "";
        }
        if (!n[2]) {
          this.semver = djt;
        } else {
          this.semver = new hJi(n[2], this.options.loose);
        }
      }
      toString() {
        return this.value;
      }
      test(e) {
        if (vro("Comparator.test", e, this.options.loose), this.semver === djt || e === djt) {
          return true;
        }
        if (typeof e === "string") {
          try {
            e = new hJi(e, this.options);
          } catch (t) {
            return false;
          }
        }
        return Ero(e, this.operator, this.semver, this.options);
      }
      intersects(e, t) {
        if (!(e instanceof Q1n)) {
          throw TypeError("a Comparator is required");
        }
        if (this.operator === "") {
          if (this.value === "") {
            return true;
          }
          return new gJi(e.value, t).test(this.value);
        } else if (e.operator === "") {
          if (e.value === "") {
            return true;
          }
          return new gJi(this.value, t).test(e.semver);
        }
        if (t = pJi(t), t.includePrerelease && (this.value === "<0.0.0-0" || e.value === "<0.0.0-0")) {
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
        if (Ero(this.semver, "<", e.semver, t) && this.operator.startsWith(">") && e.operator.startsWith("<")) {
          return true;
        }
        if (Ero(this.semver, ">", e.semver, t) && this.operator.startsWith("<") && e.operator.startsWith(">")) {
          return true;
        }
        return false;
      }
    }
    yJi.exports = Q1n;
    var pJi = G1n();
    var {
      safeRe: mJi,
      t: fJi
    } = ujt();
    var Ero = dJi();
    var vro = cjt();
    var hJi = $ct();
    var gJi = wro();
  });
  var wro = __commonJS((iTy, EJi) => {
    class pjt {
      constructor(e, t) {
        if (t = NZd(t), e instanceof pjt) {
          if (e.loose === !!t.loose && e.includePrerelease === !!t.includePrerelease) {
            return e;
          } else {
            return new pjt(e.raw, t);
          }
        }
        if (e instanceof Cro) {
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
          if (this.set = this.set.filter(r => !SJi(r[0])), this.set.length === 0) {
            this.set = [n];
          } else if (this.set.length > 1) {
            for (let r of this.set) {
              if (r.length === 1 && jZd(r[0])) {
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
        let n = ((this.options.includePrerelease && $Zd) | (this.options.loose && HZd)) + ":" + e;
        let r = bJi.get(n);
        if (r) {
          return r;
        }
        let o = this.options.loose;
        let s = o ? mq[K2.HYPHENRANGELOOSE] : mq[K2.HYPHENRANGE];
        e = e.replace(s, QZd(this.options.includePrerelease));
        qC("hyphen replace", e);
        e = e.replace(mq[K2.COMPARATORTRIM], FZd);
        qC("comparator trim", e);
        e = e.replace(mq[K2.TILDETRIM], UZd);
        qC("tilde trim", e);
        e = e.replace(mq[K2.CARETTRIM], BZd);
        qC("caret trim", e);
        let i = e.split(" ").map(u => qZd(u, this.options)).join(" ").split(/\s+/).map(u => XZd(u, this.options));
        if (o) {
          i = i.filter(u => (qC("loose invalid filter", u, this.options), !!u.match(mq[K2.COMPARATORLOOSE])));
        }
        qC("range list", i);
        let a = new Map();
        let l = i.map(u => new Cro(u, this.options));
        for (let u of l) {
          if (SJi(u)) {
            return [u];
          }
          a.set(u.value, u);
        }
        if (a.size > 1 && a.vZc("")) {
          a.delete("");
        }
        let c = [...a.values()];
        bJi.set(n, c);
        return c;
      }
      intersects(e, t) {
        if (!(e instanceof pjt)) {
          throw TypeError("a Range is required");
        }
        return this.set.some(n => TJi(n, t) && e.set.some(r => TJi(r, t) && n.every(o => r.every(s => o.intersects(s, t)))));
      }
      test(e) {
        if (!e) {
          return false;
        }
        if (typeof e === "string") {
          try {
            e = new LZd(e, this.options);
          } catch (t) {
            return false;
          }
        }
        for (let t = 0; t < this.set.length; t++) {
          if (ZZd(this.set[t], e, this.options)) {
            return true;
          }
        }
        return false;
      }
    }
    EJi.exports = pjt;
    var MZd = ZYi();
    var bJi = new MZd();
    var NZd = G1n();
    var Cro = _Ji();
    var qC = cjt();
    var LZd = $ct();
    var {
      safeRe: mq,
      t: K2,
      comparatorTrimReplace: FZd,
      tildeTrimReplace: UZd,
      caretTrimReplace: BZd
    } = ujt();
    var {
      FLAG_INCLUDE_PRERELEASE: $Zd,
      FLAG_LOOSE: HZd
    } = W1n();
    var SJi = e => e.value === "<0.0.0-0";
    var jZd = e => e.value === "";
    var TJi = (e, t) => {
      let n = true;
      let r = e.slice();
      let o = r.pop();
      while (n && r.length) {
        n = r.every(s => o.intersects(s, t));
        o = r.pop();
      }
      return n;
    };
    var qZd = (e, t) => (e = e.replace(mq[K2.BUILD], ""), qC("comp", e, t), e = VZd(e, t), qC("caret", e), e = WZd(e, t), qC("tildes", e), e = KZd(e, t), qC("xrange", e), e = JZd(e, t), qC("stars", e), e);
    var fq = e => !e || e.toLowerCase() === "x" || e === "*";
    var WZd = (e, t) => e.trim().split(/\s+/).map(n => GZd(n, t)).join(" ");
    var GZd = (e, t) => {
      let n = t.loose ? mq[K2.TILDELOOSE] : mq[K2.TILDE];
      return e.replace(n, (r, o, s, i, a) => {
        qC("tilde", e, r, o, s, i, a);
        let l;
        if (fq(o)) {
          l = "";
        } else if (fq(s)) {
          l = `>=${o}.0.0 <${+o + 1}.0.0-0`;
        } else if (fq(i)) {
          l = `>=${o}.${s}.0 <${o}.${+s + 1}.0-0`;
        } else if (a) {
          qC("replaceTilde pr", a);
          l = `>=${o}.${s}.${i}-${a} <${o}.${+s + 1}.0-0`;
        } else {
          l = `>=${o}.${s}.${i} <${o}.${+s + 1}.0-0`;
        }
        qC("tilde return", l);
        return l;
      });
    };
    var VZd = (e, t) => e.trim().split(/\s+/).map(n => zZd(n, t)).join(" ");
    var zZd = (e, t) => {
      qC("caret", e, t);
      let n = t.loose ? mq[K2.CARETLOOSE] : mq[K2.CARET];
      let r = t.includePrerelease ? "-0" : "";
      return e.replace(n, (o, s, i, a, l) => {
        qC("caret", e, o, s, i, a, l);
        let c;
        if (fq(s)) {
          c = "";
        } else if (fq(i)) {
          c = `>=${s}.0.0${r} <${+s + 1}.0.0-0`;
        } else if (fq(a)) {
          if (s === "0") {
            c = `>=${s}.${i}.0${r} <${s}.${+i + 1}.0-0`;
          } else {
            c = `>=${s}.${i}.0${r} <${+s + 1}.0.0-0`;
          }
        } else if (l) {
          if (qC("replaceCaret pr", l), s === "0") {
            if (i === "0") {
              c = `>=${s}.${i}.${a}-${l} <${s}.${i}.${+a + 1}-0`;
            } else {
              c = `>=${s}.${i}.${a}-${l} <${s}.${+i + 1}.0-0`;
            }
          } else {
            c = `>=${s}.${i}.${a}-${l} <${+s + 1}.0.0-0`;
          }
        } else if (qC("no pr"), s === "0") {
          if (i === "0") {
            c = `>=${s}.${i}.${a}${r} <${s}.${i}.${+a + 1}-0`;
          } else {
            c = `>=${s}.${i}.${a}${r} <${s}.${+i + 1}.0-0`;
          }
        } else {
          c = `>=${s}.${i}.${a} <${+s + 1}.0.0-0`;
        }
        qC("caret return", c);
        return c;
      });
    };
    var KZd = (e, t) => (qC("replaceXRanges", e, t), e.split(/\s+/).map(n => YZd(n, t)).join(" "));
    var YZd = (e, t) => {
      e = e.trim();
      let n = t.loose ? mq[K2.XRANGELOOSE] : mq[K2.XRANGE];
      return e.replace(n, (r, o, s, i, a, l) => {
        qC("xRange", e, r, o, s, i, a, l);
        let c = fq(s);
        let u = c || fq(i);
        let d = u || fq(a);
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
        qC("xRange return", r);
        return r;
      });
    };
    var JZd = (e, t) => (qC("replaceStars", e, t), e.trim().replace(mq[K2.STAR], ""));
    var XZd = (e, t) => (qC("replaceGTE0", e, t), e.trim().replace(mq[t.includePrerelease ? K2.GTE0PRE : K2.GTE0], ""));
    var QZd = e => (t, n, r, o, s, i, a, l, c, u, d, p) => {
      if (fq(r)) {
        n = "";
      } else if (fq(o)) {
        n = `>=${r}.0.0${e ? "-0" : ""}`;
      } else if (fq(s)) {
        n = `>=${r}.${o}.0${e ? "-0" : ""}`;
      } else if (i) {
        n = `>=${n}`;
      } else {
        n = `>=${n}${e ? "-0" : ""}`;
      }
      if (fq(c)) {
        l = "";
      } else if (fq(u)) {
        l = `<${+c + 1}.0.0-0`;
      } else if (fq(d)) {
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
    var ZZd = (e, t, n) => {
      for (let r = 0; r < e.length; r++) {
        if (!e[r].test(t)) {
          return false;
        }
      }
      if (t.prerelease.length && !n.includePrerelease) {
        for (let r = 0; r < e.length; r++) {
          if (qC(e[r].semver), e[r].semver === Cro.ANY) {
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
  var wJi = __commonJS((aTy, vJi) => {
    var eep = wro();
    var tep = (e, t, n) => {
      try {
        t = new eep(t, n);
      } catch (r) {
        return false;
      }
      return t.test(e);
    };
    vJi.exports = tep;
  });
  var Rro = __commonJS((lTy, nep) => {
    nep.exports = {
      name: "sharp",
      description: "High performance Node.js image processing, the fastest module to resize JPEG, PNG, WebP, GIF, AVIF and TIFF images",
      version: "0.34.5",
      author: "Lovell Fuller <npm@lovell.info>",
      homepage: "https://sharp.pixelplumbing.com",
      contributors: ["Pierre Inglebert <pierre.inglebert@gmail.com>", "Jonathan Ong <jonathanrichardong@gmail.com>", "Chanon Sajjamanochai <chanon.s@gmail.com>", "Juliano Julio <julianojulio@gmail.com>", "Daniel Gasienica <daniel@gasienica.ch>", "Julian Walker <julian@fiftythree.com>", "Amit Pitaru <pitaru.amit@gmail.com>", "Brandon Aaron <hello.brandon@aaron.sh>", "Andreas Lind <andreas@one.com>", "Maurus Cuelenaere <mcuelenaere@gmail.com>", "Linus Unneb\xE4ck <linus@folkdatorn.se>", "Victor Mateevitsi <mvictoras@gmail.com>", "Alaric Holloway <alaric.holloway@gmail.com>", "Bernhard K. Weisshuhn <bkw@codingforce.com>", "Chris Riley <criley@primedia.com>", "David Carley <dacarley@gmail.com>", "John Tobin <john@limelightmobileinc.com>", "Kenton Gray <kentongray@gmail.com>", "Felix B\xFCnemann <Felix.Buenemann@gmail.com>", "Samy Al Zahrani <samyalzahrany@gmail.com>", "Chintan Thakkar <lemnisk8@gmail.com>", "F. Orlando Galashan <frulo@gmx.de>", "Kleis Auke Wolthuizen <info@kleisauke.nl>", "Matt Hirsch <mhirsch@media.mit.edu>", "Matthias Thoemmes <thoemmes@gmail.com>", "Patrick Paskaris <patrick@paskaris.gr>", "J\xE9r\xE9my Lal <kapouer@melix.org>", "Rahul Nanwani <r.nanwani@gmail.com>", "Alice Monday <alice0meta@gmail.com>", "Kristo Jorgenson <kristo.jorgenson@gmail.com>", "YvesBos <yves_bos@outlook.com>", "Guy Maliar <guy@tailorbrands.com>", "Nicolas Coden <nicolas@ncoden.fr>", "Matt Parrish <matt.r.parrish@gmail.com>", "Marcel Bretschneider <marcel.bretschneider@gmail.com>", "Matthew McEachen <matthew+github@mceachen.org>", "Jarda Kot\u011B\u0161ovec <jarda.kotesovec@gmail.com>", "Kenric D'Souza <kenric.dsouza@gmail.com>", "Oleh Aleinyk <oleg.aleynik@gmail.com>", "Marcel Bretschneider <marcel.bretschneider@gmail.com>", "Andrea Bianco <andrea.bianco@unibas.ch>", "Rik Heywood <rik@rik.org>", "Thomas Parisot <hi@oncletom.io>", "Nathan Graves <nathanrgraves+github@gmail.com>", "Tom Lokhorst <tom@lokhorst.eu>", "Espen Hovlandsdal <espen@hovlandsdal.com>", "Sylvain Dumont <sylvain.dumont35@gmail.com>", "Alun Davies <alun.owain.davies@googlemail.com>", "Aidan Hoolachan <ajhoolachan21@gmail.com>", "Axel Eirola <axel.eirola@iki.fi>", "Freezy <freezy@xbmc.org>", "Daiz <taneli.vatanen@gmail.com>", "Julian Aubourg <j@ubourg.net>", "Keith Belovay <keith@picthrive.com>", "Michael B. Klein <mbklein@gmail.com>", "Jordan Prudhomme <jordan@raboland.fr>", "Ilya Ovdin <iovdin@gmail.com>", "Andargor <andargor@yahoo.com>", "Paul Neave <paul.neave@gmail.com>", "Brendan Kennedy <brenwken@gmail.com>", "Brychan Bennett-Odlum <git@brychan.io>", "Edward Silverton <e.silverton@gmail.com>", "Roman Malieiev <aromaleev@gmail.com>", "Tomas Szabo <tomas.szabo@deftomat.com>", "Robert O'Rourke <robert@o-rourke.org>", "Guillermo Alfonso Varela Chouci\xF1o <guillevch@gmail.com>", "Christian Flintrup <chr@gigahost.dk>", "Manan Jadhav <manan@motionden.com>", "Leon Radley <leon@radley.se>", "alza54 <alza54@thiocod.in>", "Jacob Smith <jacob@frende.me>", "Michael Nutt <michael@nutt.im>", "Brad Parham <baparham@gmail.com>", "Taneli Vatanen <taneli.vatanen@gmail.com>", "Joris Dugu\xE9 <zaruike10@gmail.com>", "Chris Banks <christopher.bradley.banks@gmail.com>", "Ompal Singh <ompal.hitm09@gmail.com>", "Brodan <christopher.hranj@gmail.com>", "Ankur Parihar <ankur.github@gmail.com>", "Brahim Ait elhaj <brahima@gmail.com>", "Mart Jansink <m.jansink@gmail.com>", "Lachlan Newman <lachnewman007@gmail.com>", "Dennis Beatty <dennis@dcbeatty.com>", "Ingvar Stepanyan <me@rreverser.com>", "Don Denton <don@happycollision.com>"],
      scripts: {
        build: "node install/build.js",
        install: "node install/check.js || npm run build",
        clean: "rm -rf src/build/ .nyc_output/ coverage/ test/fixtures/output.*",
        test: "npm run lint && npm run test-unit",
        lint: "npm run lint-cpp && npm run lint-js && npm run lint-types",
        "lint-cpp": "cpplint --quiet src/*.h src/*.cc",
        "lint-js": "biome lint",
        "lint-types": "tsd --files ./test/types/sharp.test-d.ts",
        "test-leak": "./test/leak/leak.sh",
        "test-unit": "node --experimental-test-coverage test/unit.mjs",
        "package-from-local-build": "node npm/from-local-build.js",
        "package-release-notes": "node npm/release-notes.js",
        "docs-build": "node docs/build.mjs",
        "docs-serve": "cd docs && npm start",
        "docs-publish": "cd docs && npm run build && npx firebase-tools deploy --project pixelplumbing --only hosting:pixelplumbing-sharp"
      },
      type: "commonjs",
      main: "lib/index.js",
      types: "lib/index.d.ts",
      files: ["install", "lib", "src/*.{cc,h,gyp}"],
      repository: {
        type: "git",
        url: "git://github.com/lovell/sharp.git"
      },
      keywords: ["jpeg", "png", "webp", "avif", "tiff", "gif", "svg", "jp2", "dzi", "image", "resize", "thumbnail", "crop", "embed", "libvips", "vips"],
      dependencies: {
        "@img/colour": "^1.0.0",
        "detect-libc": "^2.1.2",
        semver: "^7.7.3"
      },
      optionalDependencies: {
        "@img/sharp-darwin-arm64": "0.34.5",
        "@img/sharp-darwin-x64": "0.34.5",
        "@img/sharp-libvips-darwin-arm64": "1.2.4",
        "@img/sharp-libvips-darwin-x64": "1.2.4",
        "@img/sharp-libvips-linux-arm": "1.2.4",
        "@img/sharp-libvips-linux-arm64": "1.2.4",
        "@img/sharp-libvips-linux-ppc64": "1.2.4",
        "@img/sharp-libvips-linux-riscv64": "1.2.4",
        "@img/sharp-libvips-linux-s390x": "1.2.4",
        "@img/sharp-libvips-linux-x64": "1.2.4",
        "@img/sharp-libvips-linuxmusl-arm64": "1.2.4",
        "@img/sharp-libvips-linuxmusl-x64": "1.2.4",
        "@img/sharp-linux-arm": "0.34.5",
        "@img/sharp-linux-arm64": "0.34.5",
        "@img/sharp-linux-ppc64": "0.34.5",
        "@img/sharp-linux-riscv64": "0.34.5",
        "@img/sharp-linux-s390x": "0.34.5",
        "@img/sharp-linux-x64": "0.34.5",
        "@img/sharp-linuxmusl-arm64": "0.34.5",
        "@img/sharp-linuxmusl-x64": "0.34.5",
        "@img/sharp-wasm32": "0.34.5",
        "@img/sharp-win32-arm64": "0.34.5",
        "@img/sharp-win32-ia32": "0.34.5",
        "@img/sharp-win32-x64": "0.34.5"
      },
      devDependencies: {
        "@biomejs/biome": "^2.3.4",
        "@cpplint/cli": "^0.1.0",
        "@emnapi/runtime": "^1.7.0",
        "@img/sharp-libvips-dev": "1.2.4",
        "@img/sharp-libvips-dev-wasm32": "1.2.4",
        "@img/sharp-libvips-win32-arm64": "1.2.4",
        "@img/sharp-libvips-win32-ia32": "1.2.4",
        "@img/sharp-libvips-win32-x64": "1.2.4",
        "@types/node": "*",
        emnapi: "^1.7.0",
        "exif-reader": "^2.0.2",
        "extract-zip": "^2.0.1",
        icc: "^3.0.0",
        "jsdoc-to-markdown": "^9.1.3",
        "node-addon-api": "^8.5.0",
        "node-gyp": "^11.5.0",
        "tar-fs": "^3.1.1",
        tsd: "^0.33.0"
      },
      license: "Apache-2.0",
      engines: {
        node: "^18.17.0 || ^20.3.0 || >=21.0.0"
      },
      config: {
        libvips: ">=8.17.3"
      },
      funding: {
        url: "https://opencollective.com/libvips"
      }
    };
  });
  var Iro = __commonJS((cTy, MJi) => {
    /*!
    Copyright 2013 Lovell Fuller and others.
    SPDX-License-Identifier: Apache-2.0
    */
    var {
      spawnSync: kro
    } = require("child_process");
    var {
      createHash: rep
    } = require("crypto");
    var kJi = zYi();
    var oep = Tro();
    var sep = wJi();
    var CJi = q1n();
    var {
      config: iep,
      engines: RJi,
      optionalDependencies: aep
    } = Rro();
    var lep = process.env.npm_package_config_libvips || iep.libvips;
    var AJi = kJi(lep).version;
    var cep = ["darwin-arm64", "darwin-x64", "linux-arm", "linux-arm64", "linux-ppc64", "linux-riscv64", "linux-s390x", "linux-x64", "linuxmusl-arm64", "linuxmusl-x64", "win32-arm64", "win32-ia32", "win32-x64"];
    var Aro = {
      encoding: "utf8",
      shell: true
    };
    var uep = e => {
      if (e instanceof Error) {
        console.error(`sharp: Installation error: ${e.message}`);
      } else {
        console.log(`sharp: ${e}`);
      }
    };
    var IJi = () => CJi.isNonGlibcLinuxSync() ? CJi.familySync() : "";
    var dep = () => `linux${IJi()}-arm64`;
    var Hct = () => {
      if (PJi()) {
        return "wasm32";
      }
      let {
        npm_config_arch: e,
        npm_config_platform: t,
        npm_config_libc: n
      } = process.env;
      let r = typeof n === "string" ? n : IJi();
      return `${t || "linux"}${r}-${e || "arm64"}`;
    };
    var pep = () => {
      try {
        return require(`@img/sharp-libvips-dev-${Hct()}/include`);
      } catch {
        try {
          return (() => {
            throw new Error("Cannot require module " + "@img/sharp-libvips-dev/include");
          })();
        } catch {}
      }
      return "";
    };
    var mep = () => {
      try {
        return (() => {
          throw new Error("Cannot require module " + "@img/sharp-libvips-dev/cplusplus");
        })();
      } catch {}
      return "";
    };
    var fep = () => {
      try {
        return require(`@img/sharp-libvips-dev-${Hct()}/lib`);
      } catch {
        try {
          return require(`@img/sharp-libvips-${Hct()}/lib`);
        } catch {}
      }
      return "";
    };
    var hep = () => {
      if (process.release?.name === "node" && process.versions) {
        if (!sep(process.versions.node, RJi.node)) {
          return {
            found: process.versions.node,
            expected: RJi.node
          };
        }
      }
    };
    var PJi = () => {
      let {
        CC: e
      } = process.env;
      return Boolean(e?.endsWith("/emcc"));
    };
    var gep = () => false;
    var xJi = e => rep("sha512").update(e).digest("hex");
    var yep = () => {
      try {
        let e = xJi(`imgsharp-libvips-${Hct()}`);
        let t = kJi(aep[`@img/sharp-libvips-${Hct()}`], {
          includePrerelease: true
        }).version;
        return xJi(`${e}npm:${t}`).slice(0, 10);
      } catch {}
      return "";
    };
    var _ep = () => kro(`node-gyp rebuild --directory=src ${PJi() ? "--nodedir=emscripten" : ""}`, {
      ...Aro,
      stdio: "inherit"
    }).status;
    var OJi = () => (kro("pkg-config --modversion vips-cpp", {
      ...Aro,
      env: {
        ...process.env,
        PKG_CONFIG_PATH: DJi()
      }
    }).stdout || "").trim();
    var DJi = () => [(kro('which brew >/dev/null 2>&1 && brew environment --plain | grep PKG_CONFIG_LIBDIR | cut -d" " -f2', Aro).stdout || "").trim(), process.env.PKG_CONFIG_PATH, "/usr/local/lib/pkgconfig", "/usr/lib/pkgconfig", "/usr/local/libdata/pkgconfig", "/usr/libdata/pkgconfig"].filter(Boolean).join(":");
    var xro = (e, t, n) => {
      if (n) {
        n(`Detected ${t}, skipping search for globally-installed libvips`);
      }
      return e;
    };
    var bep = e => {
      if (Boolean(process.env.SHARP_IGNORE_GLOBAL_LIBVIPS) === true) {
        return xro(false, "SHARP_IGNORE_GLOBAL_LIBVIPS", e);
      }
      if (Boolean(process.env.SHARP_FORCE_GLOBAL_LIBVIPS) === true) {
        return xro(true, "SHARP_FORCE_GLOBAL_LIBVIPS", e);
      }
      if (gep()) {
        return xro(false, "Rosetta", e);
      }
      let t = OJi();
      return !!t && oep(t, AJi);
    };
    MJi.exports = {
      minimumLibvipsVersion: AJi,
      prebuiltPlatforms: cep,
      buildPlatformArch: Hct,
      buildSharpLibvipsIncludeDir: pep,
      buildSharpLibvipsCPlusPlusDir: mep,
      buildSharpLibvipsLibDir: fep,
      isUnsupportedNodeRuntime: hep,
      runtimePlatformArch: dep,
      log: uep,
      yarnLocator: yep,
      spawnRebuild: _ep,
      globalLibvipsVersion: OJi,
      pkgConfigPath: DJi,
      useGlobalLibvips: bep
    };
  });
  var fjt = __commonJS((uTy, LJi) => {
    /*!
    Copyright 2013 Lovell Fuller and others.
    SPDX-License-Identifier: Apache-2.0
    */
    var {
      familySync: Sep,
      versionSync: Tep
    } = q1n();
    var {
      runtimePlatformArch: Eep,
      isUnsupportedNodeRuntime: NJi,
      prebuiltPlatforms: vep,
      minimumLibvipsVersion: wep
    } = Iro();
    var rGe = Eep();
    var Cep = [`../src/build/Release/sharp-${rGe}.node`, "../src/build/Release/sharp-wasm32.node", `@img/sharp-${rGe}/sharp.node`, "@img/sharp-wasm32/sharp.node"];
    var Pro;
    var jct;
    var mjt = [];
    for (Pro of Cep) {
      try {
        jct = require(Pro);
        break;
      } catch (e) {
        mjt.push(e);
      }
    }
    if (jct && Pro.startsWith("@img/sharp-linux-x64") && !jct._isUsingX64V2()) {
      let e = Error("Prebuilt binaries for linux-x64 require v2 microarchitecture");
      e.code = "Unsupported CPU";
      mjt.push(e);
      jct = null;
    }
    if (jct) {
      LJi.exports = jct;
    } else {
      let [e, t, n] = ["linux", "darwin", "win32"].map(s => rGe.startsWith(s));
      let r = [`Could not load the "sharp" module using the ${rGe} runtime`];
      mjt.forEach(s => {
        if (s.code !== "MODULE_NOT_FOUND") {
          r.push(`${s.code}: ${s.message}`);
        }
      });
      let o = mjt.map(s => s.message).join(" ");
      if (r.push("Possible solutions:"), NJi()) {
        let {
          found: s,
          expected: i
        } = NJi();
        r.push("- Please upgrade Node.js:", `    Found ${s}`, `    Requires ${i}`);
      } else if (vep.includes(rGe)) {
        let [s, i] = rGe.split("-");
        let a = s.endsWith("musl") ? " --libc=musl" : "";
        r.push("- Ensure optional dependencies can be installed:", "    npm install --include=optional sharp", "- Ensure your package manager supports multi-platform installation:", "    See https://sharp.pixelplumbing.com/install#cross-platform", "- Add platform-specific dependencies:", `    npm install --os=${s.replace("musl", "")}${a} --cpu=${i} sharp`);
      } else {
        r.push(`- Manually install libvips >= ${wep}`, "- Add experimental WebAssembly-based dependencies:", "    npm install --cpu=wasm32 sharp", "    npm install @img/sharp-wasm32");
      }
      if (e && /(symbol not found|CXXABI_)/i.test(o)) {
        try {
          let {
            config: s
          } = require(`@img/sharp-libvips-${rGe}/package`);
          let i = `${Sep()} ${Tep()}`;
          let a = `${s.musl ? "musl" : "glibc"} ${s.musl || s.glibc}`;
          r.push("- Update your OS:", `    Found ${i}`, `    Requires ${a}`);
        } catch (s) {}
      }
      if (e && /\/snap\/core[0-9]{2}/.test(o)) {
        r.push("- Remove the Node.js Snap, which does not support native modules", "    snap remove node");
      }
      if (t && /Incompatible library version/.test(o)) {
        r.push("- Update Homebrew:", "    brew update && brew upgrade vips");
      }
      if (mjt.some(s => s.code === "ERR_DLOPEN_DISABLED")) {
        r.push("- Run Node.js without using the --no-addons flag");
      }
      if (n && /The specified procedure could not be found/.test(o)) {
        r.push("- Using the canvas package on Windows?", "    See https://sharp.pixelplumbing.com/install#canvas-and-windows", "- Check for outdated versions of sharp in the dependency tree:", "    npm ls sharp");
      }
      throw r.push("- Consult the installation documentation:", "    See https://sharp.pixelplumbing.com/install"), Error(r.join(`
`));
    }
  });
  var UJi = __commonJS((dTy, FJi) => {
    /*!
    Copyright 2013 Lovell Fuller and others.
    SPDX-License-Identifier: Apache-2.0
    */
    var Rep = require("util");
    var Oro = require("stream");
    var xep = Sue();
    fjt();
    var kep = Rep.debuglog("sharp");
    var Aep = e => {
      oGe.queue.emit("change", e);
    };
    var oGe = function (e, t) {
      if (arguments.length === 1 && !xep.defined(e)) {
        throw Error("Invalid input");
      }
      if (!(this instanceof oGe)) {
        return new oGe(e, t);
      }
      Oro.Duplex.call(this);
      this.options = {
        topOffsetPre: -1,
        leftOffsetPre: -1,
        widthPre: -1,
        heightPre: -1,
        topOffsetPost: -1,
        leftOffsetPost: -1,
        widthPost: -1,
        heightPost: -1,
        width: -1,
        height: -1,
        canvas: "crop",
        position: 0,
        resizeBackground: [0, 0, 0, 255],
        angle: 0,
        rotationAngle: 0,
        rotationBackground: [0, 0, 0, 255],
        rotateBefore: false,
        orientBefore: false,
        flip: false,
        flop: false,
        extendTop: 0,
        extendBottom: 0,
        extendLeft: 0,
        extendRight: 0,
        extendBackground: [0, 0, 0, 255],
        extendWith: "background",
        withoutEnlargement: false,
        withoutReduction: false,
        affineMatrix: [],
        affineBackground: [0, 0, 0, 255],
        affineIdx: 0,
        affineIdy: 0,
        affineOdx: 0,
        affineOdy: 0,
        affineInterpolator: this.constructor.interpolators.bilinear,
        kernel: "lanczos3",
        fastShrinkOnLoad: true,
        tint: [-1, 0, 0, 0],
        flatten: false,
        flattenBackground: [0, 0, 0],
        unflatten: false,
        negate: false,
        negateAlpha: true,
        medianSize: 0,
        blurSigma: 0,
        precision: "integer",
        minAmpl: 0.2,
        sharpenSigma: 0,
        sharpenM1: 1,
        sharpenM2: 2,
        sharpenX1: 2,
        sharpenY2: 10,
        sharpenY3: 20,
        threshold: 0,
        thresholdGrayscale: true,
        trimBackground: [],
        trimThreshold: -1,
        trimLineArt: false,
        dilateWidth: 0,
        erodeWidth: 0,
        gamma: 0,
        gammaOut: 0,
        greyscale: false,
        normalise: false,
        normaliseLower: 1,
        normaliseUpper: 99,
        claheWidth: 0,
        claheHeight: 0,
        claheMaxSlope: 3,
        brightness: 1,
        saturation: 1,
        hue: 0,
        lightness: 0,
        booleanBufferIn: null,
        booleanFileIn: "",
        joinChannelIn: [],
        extractChannel: -1,
        removeAlpha: false,
        ensureAlpha: -1,
        colourspace: "srgb",
        colourspacePipeline: "last",
        composite: [],
        fileOut: "",
        formatOut: "input",
        streamOut: false,
        keepMetadata: 0,
        withMetadataOrientation: -1,
        withMetadataDensity: 0,
        withIccProfile: "",
        withExif: {},
        withExifMerge: true,
        withXmp: "",
        resolveWithObject: false,
        loop: -1,
        delay: [],
        jpegQuality: 80,
        jpegProgressive: false,
        jpegChromaSubsampling: "4:2:0",
        jpegTrellisQuantisation: false,
        jpegOvershootDeringing: false,
        jpegOptimiseScans: false,
        jpegOptimiseCoding: true,
        jpegQuantisationTable: 0,
        pngProgressive: false,
        pngCompressionLevel: 6,
        pngAdaptiveFiltering: false,
        pngPalette: false,
        pngQuality: 100,
        pngEffort: 7,
        pngBitdepth: 8,
        pngDither: 1,
        jp2Quality: 80,
        jp2TileHeight: 512,
        jp2TileWidth: 512,
        jp2Lossless: false,
        jp2ChromaSubsampling: "4:4:4",
        webpQuality: 80,
        webpAlphaQuality: 100,
        webpLossless: false,
        webpNearLossless: false,
        webpSmartSubsample: false,
        webpSmartDeblock: false,
        webpPreset: "default",
        webpEffort: 4,
        webpMinSize: false,
        webpMixed: false,
        gifBitdepth: 8,
        gifEffort: 7,
        gifDither: 1,
        gifInterFrameMaxError: 0,
        gifInterPaletteMaxError: 3,
        gifKeepDuplicateFrames: false,
        gifReuse: true,
        gifProgressive: false,
        tiffQuality: 80,
        tiffCompression: "jpeg",
        tiffBigtiff: false,
        tiffPredictor: "horizontal",
        tiffPyramid: false,
        tiffMiniswhite: false,
        tiffBitdepth: 8,
        tiffTile: false,
        tiffTileHeight: 256,
        tiffTileWidth: 256,
        tiffXres: 1,
        tiffYres: 1,
        tiffResolutionUnit: "inch",
        heifQuality: 50,
        heifLossless: false,
        heifCompression: "av1",
        heifEffort: 4,
        heifChromaSubsampling: "4:4:4",
        heifBitdepth: 8,
        jxlDistance: 1,
        jxlDecodingTier: 0,
        jxlEffort: 7,
        jxlLossless: false,
        rawDepth: "uchar",
        tileSize: 256,
        tileOverlap: 0,
        tileContainer: "fs",
        tileLayout: "dz",
        tileFormat: "last",
        tileDepth: "last",
        tileAngle: 0,
        tileSkipBlanks: -1,
        tileBackground: [255, 255, 255, 255],
        tileCentre: false,
        tileId: "https://example.com/iiif",
        tileBasename: "",
        timeoutSeconds: 0,
        linearA: [],
        linearB: [],
        pdfBackground: [255, 255, 255, 255],
        debuglog: n => {
          this.emit("warning", n);
          kep(n);
        },
        queueListener: Aep
      };
      this.options.input = this._createInputDescriptor(e, t, {
        allowStream: true
      });
      return this;
    };
    Object.setPrototypeOf(oGe.prototype, Oro.Duplex.prototype);
    Object.setPrototypeOf(oGe, Oro.Duplex);
    function Iep() {
      let e = this.constructor.call();
      let {
        debuglog: t,
        queueListener: n,
        ...r
      } = this.options;
      if (e.options = structuredClone(r), e.options.debuglog = t, e.options.queueListener = n, this._isStreamInput()) {
        this.on("finish", () => {
          this._flattenBufferIn();
          e.options.input.buffer = this.options.input.buffer;
          e.emit("finish");
        });
      }
      return e;
    }
    Object.assign(oGe.prototype, {
      clone: Iep
    });
    FJi.exports = oGe;
  });
  var HJi = __commonJS((pTy, $Ji) => {
    /*!
    Copyright 2013 Lovell Fuller and others.
    SPDX-License-Identifier: Apache-2.0
    */
    var Ir = Sue();
    var HPe = fjt();
    var Pep = {
      left: "low",
      top: "low",
      low: "low",
      center: "centre",
      centre: "centre",
      right: "high",
      bottom: "high",
      high: "high"
    };
    var Oep = ["failOn", "limitInputPixels", "unlimited", "animated", "autoOrient", "density", "ignoreIcc", "page", "pages", "sequentialRead", "jp2", "openSlide", "pdf", "raw", "svg", "tiff", "failOnError", "openSlideLevel", "pdfBackground", "tiffSubifd"];
    function BJi(e) {
      let t = Oep.filter(n => Ir.defined(e[n])).map(n => [n, e[n]]);
      return t.length ? Object.fromEntries(t) : undefined;
    }
    function Dep(e, t, n) {
      let r = {
        autoOrient: false,
        failOn: "warning",
        limitInputPixels: 268402689,
        ignoreIcc: false,
        unlimited: false,
        sequentialRead: true
      };
      if (Ir.string(e)) {
        r.file = e;
      } else if (Ir.buffer(e)) {
        if (e.length === 0) {
          throw Error("Input Buffer is empty");
        }
        r.buffer = e;
      } else if (Ir.arrayBuffer(e)) {
        if (e.byteLength === 0) {
          throw Error("Input bit Array is empty");
        }
        r.buffer = Buffer.from(e, 0, e.byteLength);
      } else if (Ir.typedArray(e)) {
        if (e.length === 0) {
          throw Error("Input Bit Array is empty");
        }
        r.buffer = Buffer.from(e.buffer, e.byteOffset, e.byteLength);
      } else if (Ir.plainObject(e) && !Ir.defined(t)) {
        if (t = e, BJi(t)) {
          r.buffer = [];
        }
      } else if (!Ir.defined(e) && !Ir.defined(t) && Ir.object(n) && n.allowStream) {
        r.buffer = [];
      } else if (Array.isArray(e)) {
        if (e.length > 1) {
          if (!this.options.joining) {
            this.options.joining = true;
            this.options.join = e.map(o => this._createInputDescriptor(o));
          } else {
            throw Error("Recursive join is unsupported");
          }
        } else {
          throw Error("Expected at least two images to join");
        }
      } else {
        throw Error(`Unsupported input '${e}' of type ${typeof e}${Ir.defined(t) ? ` when also providing options of type ${typeof t}` : ""}`);
      }
      if (Ir.object(t)) {
        if (Ir.defined(t.failOnError)) {
          if (Ir.bool(t.failOnError)) {
            r.failOn = t.failOnError ? "warning" : "none";
          } else {
            throw Ir.invalidParameterError("failOnError", "boolean", t.failOnError);
          }
        }
        if (Ir.defined(t.failOn)) {
          if (Ir.string(t.failOn) && Ir.inArray(t.failOn, ["none", "truncated", "error", "warning"])) {
            r.failOn = t.failOn;
          } else {
            throw Ir.invalidParameterError("failOn", "one of: none, truncated, error, warning", t.failOn);
          }
        }
        if (Ir.defined(t.autoOrient)) {
          if (Ir.bool(t.autoOrient)) {
            r.autoOrient = t.autoOrient;
          } else {
            throw Ir.invalidParameterError("autoOrient", "boolean", t.autoOrient);
          }
        }
        if (Ir.defined(t.density)) {
          if (Ir.inRange(t.density, 1, 1e5)) {
            r.density = t.density;
          } else {
            throw Ir.invalidParameterError("density", "number between 1 and 100000", t.density);
          }
        }
        if (Ir.defined(t.ignoreIcc)) {
          if (Ir.bool(t.ignoreIcc)) {
            r.ignoreIcc = t.ignoreIcc;
          } else {
            throw Ir.invalidParameterError("ignoreIcc", "boolean", t.ignoreIcc);
          }
        }
        if (Ir.defined(t.limitInputPixels)) {
          if (Ir.bool(t.limitInputPixels)) {
            r.limitInputPixels = t.limitInputPixels ? 268402689 : 0;
          } else if (Ir.integer(t.limitInputPixels) && Ir.inRange(t.limitInputPixels, 0, Number.MAX_SAFE_INTEGER)) {
            r.limitInputPixels = t.limitInputPixels;
          } else {
            throw Ir.invalidParameterError("limitInputPixels", "positive integer", t.limitInputPixels);
          }
        }
        if (Ir.defined(t.unlimited)) {
          if (Ir.bool(t.unlimited)) {
            r.unlimited = t.unlimited;
          } else {
            throw Ir.invalidParameterError("unlimited", "boolean", t.unlimited);
          }
        }
        if (Ir.defined(t.sequentialRead)) {
          if (Ir.bool(t.sequentialRead)) {
            r.sequentialRead = t.sequentialRead;
          } else {
            throw Ir.invalidParameterError("sequentialRead", "boolean", t.sequentialRead);
          }
        }
        if (Ir.defined(t.raw)) {
          if (Ir.object(t.raw) && Ir.integer(t.raw.width) && t.raw.width > 0 && Ir.integer(t.raw.height) && t.raw.height > 0 && Ir.integer(t.raw.channels) && Ir.inRange(t.raw.channels, 1, 4)) {
            switch (r.rawWidth = t.raw.width, r.rawHeight = t.raw.height, r.rawChannels = t.raw.channels, e.constructor) {
              case Uint8Array:
              case Uint8ClampedArray:
                r.rawDepth = "uchar";
                break;
              case Int8Array:
                r.rawDepth = "char";
                break;
              case Uint16Array:
                r.rawDepth = "ushort";
                break;
              case Int16Array:
                r.rawDepth = "short";
                break;
              case Uint32Array:
                r.rawDepth = "uint";
                break;
              case Int32Array:
                r.rawDepth = "int";
                break;
              case Float32Array:
                r.rawDepth = "float";
                break;
              case Float64Array:
                r.rawDepth = "double";
                break;
              default:
                r.rawDepth = "uchar";
                break;
            }
          } else {
            throw Error("Expected width, height and channels for raw pixel input");
          }
          if (r.rawPremultiplied = false, Ir.defined(t.raw.premultiplied)) {
            if (Ir.bool(t.raw.premultiplied)) {
              r.rawPremultiplied = t.raw.premultiplied;
            } else {
              throw Ir.invalidParameterError("raw.premultiplied", "boolean", t.raw.premultiplied);
            }
          }
          if (r.rawPageHeight = 0, Ir.defined(t.raw.pageHeight)) {
            if (Ir.integer(t.raw.pageHeight) && t.raw.pageHeight > 0 && t.raw.pageHeight <= t.raw.height) {
              if (t.raw.height % t.raw.pageHeight !== 0) {
                throw Error(`Expected raw.height ${t.raw.height} to be a multiple of raw.pageHeight ${t.raw.pageHeight}`);
              }
              r.rawPageHeight = t.raw.pageHeight;
            } else {
              throw Ir.invalidParameterError("raw.pageHeight", "positive integer", t.raw.pageHeight);
            }
          }
        }
        if (Ir.defined(t.animated)) {
          if (Ir.bool(t.animated)) {
            r.pages = t.animated ? -1 : 1;
          } else {
            throw Ir.invalidParameterError("animated", "boolean", t.animated);
          }
        }
        if (Ir.defined(t.pages)) {
          if (Ir.integer(t.pages) && Ir.inRange(t.pages, -1, 1e5)) {
            r.pages = t.pages;
          } else {
            throw Ir.invalidParameterError("pages", "integer between -1 and 100000", t.pages);
          }
        }
        if (Ir.defined(t.page)) {
          if (Ir.integer(t.page) && Ir.inRange(t.page, 0, 1e5)) {
            r.page = t.page;
          } else {
            throw Ir.invalidParameterError("page", "integer between 0 and 100000", t.page);
          }
        }
        if (Ir.object(t.openSlide) && Ir.defined(t.openSlide.level)) {
          if (Ir.integer(t.openSlide.level) && Ir.inRange(t.openSlide.level, 0, 256)) {
            r.openSlideLevel = t.openSlide.level;
          } else {
            throw Ir.invalidParameterError("openSlide.level", "integer between 0 and 256", t.openSlide.level);
          }
        } else if (Ir.defined(t.level)) {
          if (Ir.integer(t.level) && Ir.inRange(t.level, 0, 256)) {
            r.openSlideLevel = t.level;
          } else {
            throw Ir.invalidParameterError("level", "integer between 0 and 256", t.level);
          }
        }
        if (Ir.object(t.tiff) && Ir.defined(t.tiff.subifd)) {
          if (Ir.integer(t.tiff.subifd) && Ir.inRange(t.tiff.subifd, -1, 1e5)) {
            r.tiffSubifd = t.tiff.subifd;
          } else {
            throw Ir.invalidParameterError("tiff.subifd", "integer between -1 and 100000", t.tiff.subifd);
          }
        } else if (Ir.defined(t.subifd)) {
          if (Ir.integer(t.subifd) && Ir.inRange(t.subifd, -1, 1e5)) {
            r.tiffSubifd = t.subifd;
          } else {
            throw Ir.invalidParameterError("subifd", "integer between -1 and 100000", t.subifd);
          }
        }
        if (Ir.object(t.svg)) {
          if (Ir.defined(t.svg.stylesheet)) {
            if (Ir.string(t.svg.stylesheet)) {
              r.svgStylesheet = t.svg.stylesheet;
            } else {
              throw Ir.invalidParameterError("svg.stylesheet", "string", t.svg.stylesheet);
            }
          }
          if (Ir.defined(t.svg.highBitdepth)) {
            if (Ir.bool(t.svg.highBitdepth)) {
              r.svgHighBitdepth = t.svg.highBitdepth;
            } else {
              throw Ir.invalidParameterError("svg.highBitdepth", "boolean", t.svg.highBitdepth);
            }
          }
        }
        if (Ir.object(t.pdf) && Ir.defined(t.pdf.background)) {
          r.pdfBackground = this._getBackgroundColourOption(t.pdf.background);
        } else if (Ir.defined(t.pdfBackground)) {
          r.pdfBackground = this._getBackgroundColourOption(t.pdfBackground);
        }
        if (Ir.object(t.jp2) && Ir.defined(t.jp2.oneshot)) {
          if (Ir.bool(t.jp2.oneshot)) {
            r.jp2Oneshot = t.jp2.oneshot;
          } else {
            throw Ir.invalidParameterError("jp2.oneshot", "boolean", t.jp2.oneshot);
          }
        }
        if (Ir.defined(t.create)) {
          if (Ir.object(t.create) && Ir.integer(t.create.width) && t.create.width > 0 && Ir.integer(t.create.height) && t.create.height > 0 && Ir.integer(t.create.channels)) {
            if (r.createWidth = t.create.width, r.createHeight = t.create.height, r.createChannels = t.create.channels, r.createPageHeight = 0, Ir.defined(t.create.pageHeight)) {
              if (Ir.integer(t.create.pageHeight) && t.create.pageHeight > 0 && t.create.pageHeight <= t.create.height) {
                if (t.create.height % t.create.pageHeight !== 0) {
                  throw Error(`Expected create.height ${t.create.height} to be a multiple of create.pageHeight ${t.create.pageHeight}`);
                }
                r.createPageHeight = t.create.pageHeight;
              } else {
                throw Ir.invalidParameterError("create.pageHeight", "positive integer", t.create.pageHeight);
              }
            }
            if (Ir.defined(t.create.noise)) {
              if (!Ir.object(t.create.noise)) {
                throw Error("Expected noise to be an object");
              }
              if (t.create.noise.type !== "gaussian") {
                throw Error("Only gaussian noise is supported at the moment");
              }
              if (r.createNoiseType = t.create.noise.type, !Ir.inRange(t.create.channels, 1, 4)) {
                throw Ir.invalidParameterError("create.channels", "number between 1 and 4", t.create.channels);
              }
              if (r.createNoiseMean = 128, Ir.defined(t.create.noise.mean)) {
                if (Ir.number(t.create.noise.mean) && Ir.inRange(t.create.noise.mean, 0, 1e4)) {
                  r.createNoiseMean = t.create.noise.mean;
                } else {
                  throw Ir.invalidParameterError("create.noise.mean", "number between 0 and 10000", t.create.noise.mean);
                }
              }
              if (r.createNoiseSigma = 30, Ir.defined(t.create.noise.sigma)) {
                if (Ir.number(t.create.noise.sigma) && Ir.inRange(t.create.noise.sigma, 0, 1e4)) {
                  r.createNoiseSigma = t.create.noise.sigma;
                } else {
                  throw Ir.invalidParameterError("create.noise.sigma", "number between 0 and 10000", t.create.noise.sigma);
                }
              }
            } else if (Ir.defined(t.create.background)) {
              if (!Ir.inRange(t.create.channels, 3, 4)) {
                throw Ir.invalidParameterError("create.channels", "number between 3 and 4", t.create.channels);
              }
              r.createBackground = this._getBackgroundColourOption(t.create.background);
            } else {
              throw Error("Expected valid noise or background to create a new input image");
            }
            delete r.buffer;
          } else {
            throw Error("Expected valid width, height and channels to create a new input image");
          }
        }
        if (Ir.defined(t.text)) {
          if (Ir.object(t.text) && Ir.string(t.text.text)) {
            if (r.textValue = t.text.text, Ir.defined(t.text.height) && Ir.defined(t.text.dpi)) {
              throw Error("Expected only one of dpi or height");
            }
            if (Ir.defined(t.text.font)) {
              if (Ir.string(t.text.font)) {
                r.textFont = t.text.font;
              } else {
                throw Ir.invalidParameterError("text.font", "string", t.text.font);
              }
            }
            if (Ir.defined(t.text.fontfile)) {
              if (Ir.string(t.text.fontfile)) {
                r.textFontfile = t.text.fontfile;
              } else {
                throw Ir.invalidParameterError("text.fontfile", "string", t.text.fontfile);
              }
            }
            if (Ir.defined(t.text.width)) {
              if (Ir.integer(t.text.width) && t.text.width > 0) {
                r.textWidth = t.text.width;
              } else {
                throw Ir.invalidParameterError("text.width", "positive integer", t.text.width);
              }
            }
            if (Ir.defined(t.text.height)) {
              if (Ir.integer(t.text.height) && t.text.height > 0) {
                r.textHeight = t.text.height;
              } else {
                throw Ir.invalidParameterError("text.height", "positive integer", t.text.height);
              }
            }
            if (Ir.defined(t.text.align)) {
              if (Ir.string(t.text.align) && Ir.string(this.constructor.align[t.text.align])) {
                r.textAlign = this.constructor.align[t.text.align];
              } else {
                throw Ir.invalidParameterError("text.align", "valid alignment", t.text.align);
              }
            }
            if (Ir.defined(t.text.justify)) {
              if (Ir.bool(t.text.justify)) {
                r.textJustify = t.text.justify;
              } else {
                throw Ir.invalidParameterError("text.justify", "boolean", t.text.justify);
              }
            }
            if (Ir.defined(t.text.dpi)) {
              if (Ir.integer(t.text.dpi) && Ir.inRange(t.text.dpi, 1, 1e6)) {
                r.textDpi = t.text.dpi;
              } else {
                throw Ir.invalidParameterError("text.dpi", "integer between 1 and 1000000", t.text.dpi);
              }
            }
            if (Ir.defined(t.text.rgba)) {
              if (Ir.bool(t.text.rgba)) {
                r.textRgba = t.text.rgba;
              } else {
                throw Ir.invalidParameterError("text.rgba", "bool", t.text.rgba);
              }
            }
            if (Ir.defined(t.text.spacing)) {
              if (Ir.integer(t.text.spacing) && Ir.inRange(t.text.spacing, -1e6, 1e6)) {
                r.textSpacing = t.text.spacing;
              } else {
                throw Ir.invalidParameterError("text.spacing", "integer between -1000000 and 1000000", t.text.spacing);
              }
            }
            if (Ir.defined(t.text.wrap)) {
              if (Ir.string(t.text.wrap) && Ir.inArray(t.text.wrap, ["word", "char", "word-char", "none"])) {
                r.textWrap = t.text.wrap;
              } else {
                throw Ir.invalidParameterError("text.wrap", "one of: word, char, word-char, none", t.text.wrap);
              }
            }
            delete r.buffer;
          } else {
            throw Error("Expected a valid string to create an image with text.");
          }
        }
        if (Ir.defined(t.join)) {
          if (Ir.defined(this.options.join)) {
            if (Ir.defined(t.join.animated)) {
              if (Ir.bool(t.join.animated)) {
                r.joinAnimated = t.join.animated;
              } else {
                throw Ir.invalidParameterError("join.animated", "boolean", t.join.animated);
              }
            }
            if (Ir.defined(t.join.across)) {
              if (Ir.integer(t.join.across) && Ir.inRange(t.join.across, 1, 1e6)) {
                r.joinAcross = t.join.across;
              } else {
                throw Ir.invalidParameterError("join.across", "integer between 1 and 100000", t.join.across);
              }
            }
            if (Ir.defined(t.join.shim)) {
              if (Ir.integer(t.join.shim) && Ir.inRange(t.join.shim, 0, 1e6)) {
                r.joinShim = t.join.shim;
              } else {
                throw Ir.invalidParameterError("join.shim", "integer between 0 and 100000", t.join.shim);
              }
            }
            if (Ir.defined(t.join.background)) {
              r.joinBackground = this._getBackgroundColourOption(t.join.background);
            }
            if (Ir.defined(t.join.halign)) {
              if (Ir.string(t.join.halign) && Ir.string(this.constructor.align[t.join.halign])) {
                r.joinHalign = this.constructor.align[t.join.halign];
              } else {
                throw Ir.invalidParameterError("join.halign", "valid alignment", t.join.halign);
              }
            }
            if (Ir.defined(t.join.valign)) {
              if (Ir.string(t.join.valign) && Ir.string(this.constructor.align[t.join.valign])) {
                r.joinValign = this.constructor.align[t.join.valign];
              } else {
                throw Ir.invalidParameterError("join.valign", "valid alignment", t.join.valign);
              }
            }
          } else {
            throw Error("Expected input to be an array of images to join");
          }
        }
      } else if (Ir.defined(t)) {
        throw Error(`Invalid input options ${t}`);
      }
      return r;
    }
    function Mep(e, t, n) {
      if (Array.isArray(this.options.input.buffer)) {
        if (Ir.buffer(e)) {
          if (this.options.input.buffer.length === 0) {
            this.on("finish", () => {
              this.streamInFinished = true;
            });
          }
          this.options.input.buffer.push(e);
          n();
        } else {
          n(Error("Non-Buffer data on Writable Stream"));
        }
      } else {
        n(Error("Unexpected data on Writable Stream"));
      }
    }
    function Nep() {
      if (this._isStreamInput()) {
        this.options.input.buffer = Buffer.concat(this.options.input.buffer);
      }
    }
    function Lep() {
      return Array.isArray(this.options.input.buffer);
    }
    function Fep(e) {
      let t = Error();
      if (Ir.fn(e)) {
        if (this._isStreamInput()) {
          this.on("finish", () => {
            this._flattenBufferIn();
            HPe.metadata(this.options, (n, r) => {
              if (n) {
                e(Ir.nativeError(n, t));
              } else {
                e(null, r);
              }
            });
          });
        } else {
          HPe.metadata(this.options, (n, r) => {
            if (n) {
              e(Ir.nativeError(n, t));
            } else {
              e(null, r);
            }
          });
        }
        return this;
      } else if (this._isStreamInput()) {
        return new Promise((n, r) => {
          let o = () => {
            this._flattenBufferIn();
            HPe.metadata(this.options, (s, i) => {
              if (s) {
                r(Ir.nativeError(s, t));
              } else {
                n(i);
              }
            });
          };
          if (this.writableFinished) {
            o();
          } else {
            this.once("finish", o);
          }
        });
      } else {
        return new Promise((n, r) => {
          HPe.metadata(this.options, (o, s) => {
            if (o) {
              r(Ir.nativeError(o, t));
            } else {
              n(s);
            }
          });
        });
      }
    }
    function Uep(e) {
      let t = Error();
      if (Ir.fn(e)) {
        if (this._isStreamInput()) {
          this.on("finish", () => {
            this._flattenBufferIn();
            HPe.stats(this.options, (n, r) => {
              if (n) {
                e(Ir.nativeError(n, t));
              } else {
                e(null, r);
              }
            });
          });
        } else {
          HPe.stats(this.options, (n, r) => {
            if (n) {
              e(Ir.nativeError(n, t));
            } else {
              e(null, r);
            }
          });
        }
        return this;
      } else if (this._isStreamInput()) {
        return new Promise((n, r) => {
          this.on("finish", function () {
            this._flattenBufferIn();
            HPe.stats(this.options, (o, s) => {
              if (o) {
                r(Ir.nativeError(o, t));
              } else {
                n(s);
              }
            });
          });
        });
      } else {
        return new Promise((n, r) => {
          HPe.stats(this.options, (o, s) => {
            if (o) {
              r(Ir.nativeError(o, t));
            } else {
              n(s);
            }
          });
        });
      }
    }
    $Ji.exports = e => {
      Object.assign(e.prototype, {
        _inputOptionsFromObject: BJi,
        _createInputDescriptor: Dep,
        _write: Mep,
        _flattenBufferIn: Nep,
        _isStreamInput: Lep,
        metadata: Fep,
        stats: Uep
      });
      e.align = Pep;
    };
  });
  var zJi = __commonJS((mTy, VJi) => {
    /*!
    Copyright 2013 Lovell Fuller and others.
    SPDX-License-Identifier: Apache-2.0
    */
    var hu = Sue();
    var qJi = {
      center: 0,
      centre: 0,
      north: 1,
      east: 2,
      south: 3,
      west: 4,
      northeast: 5,
      southeast: 6,
      southwest: 7,
      northwest: 8
    };
    var WJi = {
      top: 1,
      right: 2,
      bottom: 3,
      left: 4,
      "right top": 5,
      "right bottom": 6,
      "left bottom": 7,
      "left top": 8
    };
    var jJi = {
      background: "background",
      copy: "copy",
      repeat: "repeat",
      mirror: "mirror"
    };
    var GJi = {
      entropy: 16,
      attention: 17
    };
    var Dro = {
      nearest: "nearest",
      linear: "linear",
      cubic: "cubic",
      mitchell: "mitchell",
      lanczos2: "lanczos2",
      lanczos3: "lanczos3",
      mks2013: "mks2013",
      mks2021: "mks2021"
    };
    var Bep = {
      contain: "contain",
      cover: "cover",
      fill: "fill",
      inside: "inside",
      outside: "outside"
    };
    var $ep = {
      contain: "embed",
      cover: "crop",
      fill: "ignore_aspect",
      inside: "max",
      outside: "min"
    };
    function Mro(e) {
      return e.angle % 360 !== 0 || e.rotationAngle !== 0;
    }
    function Z1n(e) {
      return e.width !== -1 || e.height !== -1;
    }
    function Hep(e, t, n) {
      if (Z1n(this.options)) {
        this.options.debuglog("ignoring previous resize options");
      }
      if (this.options.widthPost !== -1) {
        this.options.debuglog("operation order will be: extract, resize, extract");
      }
      if (hu.defined(e)) {
        if (hu.object(e) && !hu.defined(n)) {
          n = e;
        } else if (hu.integer(e) && e > 0) {
          this.options.width = e;
        } else {
          throw hu.invalidParameterError("width", "positive integer", e);
        }
      } else {
        this.options.width = -1;
      }
      if (hu.defined(t)) {
        if (hu.integer(t) && t > 0) {
          this.options.height = t;
        } else {
          throw hu.invalidParameterError("height", "positive integer", t);
        }
      } else {
        this.options.height = -1;
      }
      if (hu.object(n)) {
        if (hu.defined(n.width)) {
          if (hu.integer(n.width) && n.width > 0) {
            this.options.width = n.width;
          } else {
            throw hu.invalidParameterError("width", "positive integer", n.width);
          }
        }
        if (hu.defined(n.height)) {
          if (hu.integer(n.height) && n.height > 0) {
            this.options.height = n.height;
          } else {
            throw hu.invalidParameterError("height", "positive integer", n.height);
          }
        }
        if (hu.defined(n.fit)) {
          let r = $ep[n.fit];
          if (hu.string(r)) {
            this.options.canvas = r;
          } else {
            throw hu.invalidParameterError("fit", "valid fit", n.fit);
          }
        }
        if (hu.defined(n.position)) {
          let r = hu.integer(n.position) ? n.position : GJi[n.position] || WJi[n.position] || qJi[n.position];
          if (hu.integer(r) && (hu.inRange(r, 0, 8) || hu.inRange(r, 16, 17))) {
            this.options.position = r;
          } else {
            throw hu.invalidParameterError("position", "valid position/gravity/strategy", n.position);
          }
        }
        if (this._setBackgroundColourOption("resizeBackground", n.background), hu.defined(n.kernel)) {
          if (hu.string(Dro[n.kernel])) {
            this.options.kernel = Dro[n.kernel];
          } else {
            throw hu.invalidParameterError("kernel", "valid kernel name", n.kernel);
          }
        }
        if (hu.defined(n.withoutEnlargement)) {
          this._setBooleanOption("withoutEnlargement", n.withoutEnlargement);
        }
        if (hu.defined(n.withoutReduction)) {
          this._setBooleanOption("withoutReduction", n.withoutReduction);
        }
        if (hu.defined(n.fastShrinkOnLoad)) {
          this._setBooleanOption("fastShrinkOnLoad", n.fastShrinkOnLoad);
        }
      }
      if (Mro(this.options) && Z1n(this.options)) {
        this.options.rotateBefore = true;
      }
      return this;
    }
    function jep(e) {
      if (hu.integer(e) && e > 0) {
        this.options.extendTop = e;
        this.options.extendBottom = e;
        this.options.extendLeft = e;
        this.options.extendRight = e;
      } else if (hu.object(e)) {
        if (hu.defined(e.top)) {
          if (hu.integer(e.top) && e.top >= 0) {
            this.options.extendTop = e.top;
          } else {
            throw hu.invalidParameterError("top", "positive integer", e.top);
          }
        }
        if (hu.defined(e.bottom)) {
          if (hu.integer(e.bottom) && e.bottom >= 0) {
            this.options.extendBottom = e.bottom;
          } else {
            throw hu.invalidParameterError("bottom", "positive integer", e.bottom);
          }
        }
        if (hu.defined(e.left)) {
          if (hu.integer(e.left) && e.left >= 0) {
            this.options.extendLeft = e.left;
          } else {
            throw hu.invalidParameterError("left", "positive integer", e.left);
          }
        }
        if (hu.defined(e.right)) {
          if (hu.integer(e.right) && e.right >= 0) {
            this.options.extendRight = e.right;
          } else {
            throw hu.invalidParameterError("right", "positive integer", e.right);
          }
        }
        if (this._setBackgroundColourOption("extendBackground", e.background), hu.defined(e.extendWith)) {
          if (hu.string(jJi[e.extendWith])) {
            this.options.extendWith = jJi[e.extendWith];
          } else {
            throw hu.invalidParameterError("extendWith", "one of: background, copy, repeat, mirror", e.extendWith);
          }
        }
      } else {
        throw hu.invalidParameterError("extend", "integer or object", e);
      }
      return this;
    }
    function qep(e) {
      let t = Z1n(this.options) || this.options.widthPre !== -1 ? "Post" : "Pre";
      if (this.options[`width${t}`] !== -1) {
        this.options.debuglog("ignoring previous extract options");
      }
      if (["left", "top", "width", "height"].forEach(function (n) {
        let r = e[n];
        if (hu.integer(r) && r >= 0) {
          this.options[n + (n === "left" || n === "top" ? "Offset" : "") + t] = r;
        } else {
          throw hu.invalidParameterError(n, "integer", r);
        }
      }, this), Mro(this.options) && !Z1n(this.options)) {
        if (this.options.widthPre === -1 || this.options.widthPost === -1) {
          this.options.rotateBefore = true;
        }
      }
      if (this.options.input.autoOrient) {
        this.options.orientBefore = true;
      }
      return this;
    }
    function Wep(e) {
      if (this.options.trimThreshold = 10, hu.defined(e)) {
        if (hu.object(e)) {
          if (hu.defined(e.background)) {
            this._setBackgroundColourOption("trimBackground", e.background);
          }
          if (hu.defined(e.threshold)) {
            if (hu.number(e.threshold) && e.threshold >= 0) {
              this.options.trimThreshold = e.threshold;
            } else {
              throw hu.invalidParameterError("threshold", "positive number", e.threshold);
            }
          }
          if (hu.defined(e.lineArt)) {
            this._setBooleanOption("trimLineArt", e.lineArt);
          }
        } else {
          throw hu.invalidParameterError("trim", "object", e);
        }
      }
      if (Mro(this.options)) {
        this.options.rotateBefore = true;
      }
      return this;
    }
    VJi.exports = e => {
      Object.assign(e.prototype, {
        resize: Hep,
        extend: jep,
        extract: qep,
        trim: Wep
      });
      e.gravity = qJi;
      e.strategy = GJi;
      e.kernel = Dro;
      e.fit = Bep;
      e.position = WJi;
    };
  });
  var YJi = __commonJS((fTy, KJi) => {
    /*!
    Copyright 2013 Lovell Fuller and others.
    SPDX-License-Identifier: Apache-2.0
    */
    var eE = Sue();
    var Nro = {
      clear: "clear",
      source: "source",
      over: "over",
      in: "in",
      out: "out",
      atop: "atop",
      dest: "dest",
      "dest-over": "dest-over",
      "dest-in": "dest-in",
      "dest-out": "dest-out",
      "dest-atop": "dest-atop",
      xor: "xor",
      add: "add",
      saturate: "saturate",
      multiply: "multiply",
      screen: "screen",
      overlay: "overlay",
      darken: "darken",
      lighten: "lighten",
      "colour-dodge": "colour-dodge",
      "color-dodge": "colour-dodge",
      "colour-burn": "colour-burn",
      "color-burn": "colour-burn",
      "hard-light": "hard-light",
      "soft-light": "soft-light",
      difference: "difference",
      exclusion: "exclusion"
    };
    function Gep(e) {
      if (!Array.isArray(e)) {
        throw eE.invalidParameterError("images to composite", "array", e);
      }
      this.options.composite = e.map(t => {
        if (!eE.object(t)) {
          throw eE.invalidParameterError("image to composite", "object", t);
        }
        let n = this._inputOptionsFromObject(t);
        let r = {
          input: this._createInputDescriptor(t.input, n, {
            allowStream: false
          }),
          blend: "over",
          tile: false,
          left: 0,
          top: 0,
          hasOffset: false,
          gravity: 0,
          premultiplied: false
        };
        if (eE.defined(t.blend)) {
          if (eE.string(Nro[t.blend])) {
            r.blend = Nro[t.blend];
          } else {
            throw eE.invalidParameterError("blend", "valid blend name", t.blend);
          }
        }
        if (eE.defined(t.tile)) {
          if (eE.bool(t.tile)) {
            r.tile = t.tile;
          } else {
            throw eE.invalidParameterError("tile", "boolean", t.tile);
          }
        }
        if (eE.defined(t.left)) {
          if (eE.integer(t.left)) {
            r.left = t.left;
          } else {
            throw eE.invalidParameterError("left", "integer", t.left);
          }
        }
        if (eE.defined(t.top)) {
          if (eE.integer(t.top)) {
            r.top = t.top;
          } else {
            throw eE.invalidParameterError("top", "integer", t.top);
          }
        }
        if (eE.defined(t.top) !== eE.defined(t.left)) {
          throw Error("Expected both left and top to be set");
        } else {
          r.hasOffset = eE.integer(t.top) && eE.integer(t.left);
        }
        if (eE.defined(t.gravity)) {
          if (eE.integer(t.gravity) && eE.inRange(t.gravity, 0, 8)) {
            r.gravity = t.gravity;
          } else if (eE.string(t.gravity) && eE.integer(this.constructor.gravity[t.gravity])) {
            r.gravity = this.constructor.gravity[t.gravity];
          } else {
            throw eE.invalidParameterError("gravity", "valid gravity", t.gravity);
          }
        }
        if (eE.defined(t.premultiplied)) {
          if (eE.bool(t.premultiplied)) {
            r.premultiplied = t.premultiplied;
          } else {
            throw eE.invalidParameterError("premultiplied", "boolean", t.premultiplied);
          }
        }
        return r;
      });
      return this;
    }
    KJi.exports = e => {
      e.prototype.composite = Gep;
      e.blend = Nro;
    };
  });
  var eXi = __commonJS((hTy, ZJi) => {
    /*!
    Copyright 2013 Lovell Fuller and others.
    SPDX-License-Identifier: Apache-2.0
    */
    var oo = Sue();
    var JJi = {
      integer: "integer",
      float: "float",
      approximate: "approximate"
    };
    function Vep(e, t) {
      if (!oo.defined(e)) {
        return this.autoOrient();
      }
      if (this.options.angle || this.options.rotationAngle) {
        this.options.debuglog("ignoring previous rotate options");
        this.options.angle = 0;
        this.options.rotationAngle = 0;
      }
      if (oo.integer(e) && !(e % 90)) {
        this.options.angle = e;
      } else if (oo.number(e)) {
        if (this.options.rotationAngle = e, oo.object(t) && t.background) {
          this._setBackgroundColourOption("rotationBackground", t.background);
        }
      } else {
        throw oo.invalidParameterError("angle", "numeric", e);
      }
      return this;
    }
    function zep() {
      this.options.input.autoOrient = true;
      return this;
    }
    function Kep(e) {
      this.options.flip = oo.bool(e) ? e : true;
      return this;
    }
    function Yep(e) {
      this.options.flop = oo.bool(e) ? e : true;
      return this;
    }
    function Jep(e, t) {
      let n = [].concat(...e);
      if (n.length === 4 && n.every(oo.number)) {
        this.options.affineMatrix = n;
      } else {
        throw oo.invalidParameterError("matrix", "1x4 or 2x2 array", e);
      }
      if (oo.defined(t)) {
        if (oo.object(t)) {
          if (this._setBackgroundColourOption("affineBackground", t.background), oo.defined(t.idx)) {
            if (oo.number(t.idx)) {
              this.options.affineIdx = t.idx;
            } else {
              throw oo.invalidParameterError("options.idx", "number", t.idx);
            }
          }
          if (oo.defined(t.idy)) {
            if (oo.number(t.idy)) {
              this.options.affineIdy = t.idy;
            } else {
              throw oo.invalidParameterError("options.idy", "number", t.idy);
            }
          }
          if (oo.defined(t.odx)) {
            if (oo.number(t.odx)) {
              this.options.affineOdx = t.odx;
            } else {
              throw oo.invalidParameterError("options.odx", "number", t.odx);
            }
          }
          if (oo.defined(t.ody)) {
            if (oo.number(t.ody)) {
              this.options.affineOdy = t.ody;
            } else {
              throw oo.invalidParameterError("options.ody", "number", t.ody);
            }
          }
          if (oo.defined(t.interpolator)) {
            if (oo.inArray(t.interpolator, Object.values(this.constructor.interpolators))) {
              this.options.affineInterpolator = t.interpolator;
            } else {
              throw oo.invalidParameterError("options.interpolator", "valid interpolator name", t.interpolator);
            }
          }
        } else {
          throw oo.invalidParameterError("options", "object", t);
        }
      }
      return this;
    }
    function Xep(e, t, n) {
      if (!oo.defined(e)) {
        this.options.sharpenSigma = -1;
      } else if (oo.bool(e)) {
        this.options.sharpenSigma = e ? -1 : 0;
      } else if (oo.number(e) && oo.inRange(e, 0.01, 1e4)) {
        if (this.options.sharpenSigma = e, oo.defined(t)) {
          if (oo.number(t) && oo.inRange(t, 0, 1e4)) {
            this.options.sharpenM1 = t;
          } else {
            throw oo.invalidParameterError("flat", "number between 0 and 10000", t);
          }
        }
        if (oo.defined(n)) {
          if (oo.number(n) && oo.inRange(n, 0, 1e4)) {
            this.options.sharpenM2 = n;
          } else {
            throw oo.invalidParameterError("jagged", "number between 0 and 10000", n);
          }
        }
      } else if (oo.plainObject(e)) {
        if (oo.number(e.sigma) && oo.inRange(e.sigma, 0.000001, 10)) {
          this.options.sharpenSigma = e.sigma;
        } else {
          throw oo.invalidParameterError("options.sigma", "number between 0.000001 and 10", e.sigma);
        }
        if (oo.defined(e.m1)) {
          if (oo.number(e.m1) && oo.inRange(e.m1, 0, 1e6)) {
            this.options.sharpenM1 = e.m1;
          } else {
            throw oo.invalidParameterError("options.m1", "number between 0 and 1000000", e.m1);
          }
        }
        if (oo.defined(e.m2)) {
          if (oo.number(e.m2) && oo.inRange(e.m2, 0, 1e6)) {
            this.options.sharpenM2 = e.m2;
          } else {
            throw oo.invalidParameterError("options.m2", "number between 0 and 1000000", e.m2);
          }
        }
        if (oo.defined(e.x1)) {
          if (oo.number(e.x1) && oo.inRange(e.x1, 0, 1e6)) {
            this.options.sharpenX1 = e.x1;
          } else {
            throw oo.invalidParameterError("options.x1", "number between 0 and 1000000", e.x1);
          }
        }
        if (oo.defined(e.y2)) {
          if (oo.number(e.y2) && oo.inRange(e.y2, 0, 1e6)) {
            this.options.sharpenY2 = e.y2;
          } else {
            throw oo.invalidParameterError("options.y2", "number between 0 and 1000000", e.y2);
          }
        }
        if (oo.defined(e.y3)) {
          if (oo.number(e.y3) && oo.inRange(e.y3, 0, 1e6)) {
            this.options.sharpenY3 = e.y3;
          } else {
            throw oo.invalidParameterError("options.y3", "number between 0 and 1000000", e.y3);
          }
        }
      } else {
        throw oo.invalidParameterError("sigma", "number between 0.01 and 10000", e);
      }
      return this;
    }
    function Qep(e) {
      if (!oo.defined(e)) {
        this.options.medianSize = 3;
      } else if (oo.integer(e) && oo.inRange(e, 1, 1000)) {
        this.options.medianSize = e;
      } else {
        throw oo.invalidParameterError("size", "integer between 1 and 1000", e);
      }
      return this;
    }
    function Zep(e) {
      let t;
      if (oo.number(e)) {
        t = e;
      } else if (oo.plainObject(e)) {
        if (!oo.number(e.sigma)) {
          throw oo.invalidParameterError("options.sigma", "number between 0.3 and 1000", t);
        }
        if (t = e.sigma, "precision" in e) {
          if (oo.string(JJi[e.precision])) {
            this.options.precision = JJi[e.precision];
          } else {
            throw oo.invalidParameterError("precision", "one of: integer, float, approximate", e.precision);
          }
        }
        if ("minAmplitude" in e) {
          if (oo.number(e.minAmplitude) && oo.inRange(e.minAmplitude, 0.001, 1)) {
            this.options.minAmpl = e.minAmplitude;
          } else {
            throw oo.invalidParameterError("minAmplitude", "number between 0.001 and 1", e.minAmplitude);
          }
        }
      }
      if (!oo.defined(e)) {
        this.options.blurSigma = -1;
      } else if (oo.bool(e)) {
        this.options.blurSigma = e ? -1 : 0;
      } else if (oo.number(t) && oo.inRange(t, 0.3, 1000)) {
        this.options.blurSigma = t;
      } else {
        throw oo.invalidParameterError("sigma", "number between 0.3 and 1000", t);
      }
      return this;
    }
    function XJi(e) {
      if (!oo.defined(e)) {
        this.options.dilateWidth = 1;
      } else if (oo.integer(e) && e > 0) {
        this.options.dilateWidth = e;
      } else {
        throw oo.invalidParameterError("dilate", "positive integer", XJi);
      }
      return this;
    }
    function QJi(e) {
      if (!oo.defined(e)) {
        this.options.erodeWidth = 1;
      } else if (oo.integer(e) && e > 0) {
        this.options.erodeWidth = e;
      } else {
        throw oo.invalidParameterError("erode", "positive integer", QJi);
      }
      return this;
    }
    function etp(e) {
      if (this.options.flatten = oo.bool(e) ? e : true, oo.object(e)) {
        this._setBackgroundColourOption("flattenBackground", e.background);
      }
      return this;
    }
    function ttp() {
      this.options.unflatten = true;
      return this;
    }
    function ntp(e, t) {
      if (!oo.defined(e)) {
        this.options.gamma = 2.2;
      } else if (oo.number(e) && oo.inRange(e, 1, 3)) {
        this.options.gamma = e;
      } else {
        throw oo.invalidParameterError("gamma", "number between 1.0 and 3.0", e);
      }
      if (!oo.defined(t)) {
        this.options.gammaOut = this.options.gamma;
      } else if (oo.number(t) && oo.inRange(t, 1, 3)) {
        this.options.gammaOut = t;
      } else {
        throw oo.invalidParameterError("gammaOut", "number between 1.0 and 3.0", t);
      }
      return this;
    }
    function rtp(e) {
      if (this.options.negate = oo.bool(e) ? e : true, oo.plainObject(e) && "alpha" in e) {
        if (!oo.bool(e.alpha)) {
          throw oo.invalidParameterError("alpha", "should be boolean value", e.alpha);
        } else {
          this.options.negateAlpha = e.alpha;
        }
      }
      return this;
    }
    function otp(e) {
      if (oo.plainObject(e)) {
        if (oo.defined(e.lower)) {
          if (oo.number(e.lower) && oo.inRange(e.lower, 0, 99)) {
            this.options.normaliseLower = e.lower;
          } else {
            throw oo.invalidParameterError("lower", "number between 0 and 99", e.lower);
          }
        }
        if (oo.defined(e.upper)) {
          if (oo.number(e.upper) && oo.inRange(e.upper, 1, 100)) {
            this.options.normaliseUpper = e.upper;
          } else {
            throw oo.invalidParameterError("upper", "number between 1 and 100", e.upper);
          }
        }
      }
      if (this.options.normaliseLower >= this.options.normaliseUpper) {
        throw oo.invalidParameterError("range", "lower to be less than upper", `${this.options.normaliseLower} >= ${this.options.normaliseUpper}`);
      }
      this.options.normalise = true;
      return this;
    }
    function stp(e) {
      return this.normalise(e);
    }
    function itp(e) {
      if (oo.plainObject(e)) {
        if (oo.integer(e.width) && e.width > 0) {
          this.options.claheWidth = e.width;
        } else {
          throw oo.invalidParameterError("width", "integer greater than zero", e.width);
        }
        if (oo.integer(e.height) && e.height > 0) {
          this.options.claheHeight = e.height;
        } else {
          throw oo.invalidParameterError("height", "integer greater than zero", e.height);
        }
        if (oo.defined(e.maxSlope)) {
          if (oo.integer(e.maxSlope) && oo.inRange(e.maxSlope, 0, 100)) {
            this.options.claheMaxSlope = e.maxSlope;
          } else {
            throw oo.invalidParameterError("maxSlope", "integer between 0 and 100", e.maxSlope);
          }
        }
      } else {
        throw oo.invalidParameterError("options", "plain object", e);
      }
      return this;
    }
    function atp(e) {
      if (!oo.object(e) || !Array.isArray(e.kernel) || !oo.integer(e.width) || !oo.integer(e.height) || !oo.inRange(e.width, 3, 1001) || !oo.inRange(e.height, 3, 1001) || e.height * e.width !== e.kernel.length) {
        throw Error("Invalid convolution kernel");
      }
      if (!oo.integer(e.scale)) {
        e.scale = e.kernel.reduce((t, n) => t + n, 0);
      }
      if (e.scale < 1) {
        e.scale = 1;
      }
      if (!oo.integer(e.offset)) {
        e.offset = 0;
      }
      this.options.convKernel = e;
      return this;
    }
    function ltp(e, t) {
      if (!oo.defined(e)) {
        this.options.threshold = 128;
      } else if (oo.bool(e)) {
        this.options.threshold = e ? 128 : 0;
      } else if (oo.integer(e) && oo.inRange(e, 0, 255)) {
        this.options.threshold = e;
      } else {
        throw oo.invalidParameterError("threshold", "integer between 0 and 255", e);
      }
      if (!oo.object(t) || t.greyscale === true || t.grayscale === true) {
        this.options.thresholdGrayscale = true;
      } else {
        this.options.thresholdGrayscale = false;
      }
      return this;
    }
    function ctp(e, t, n) {
      if (this.options.boolean = this._createInputDescriptor(e, n), oo.string(t) && oo.inArray(t, ["and", "or", "eor"])) {
        this.options.booleanOp = t;
      } else {
        throw oo.invalidParameterError("operator", "one of: and, or, eor", t);
      }
      return this;
    }
    function utp(e, t) {
      if (!oo.defined(e) && oo.number(t)) {
        e = 1;
      } else if (oo.number(e) && !oo.defined(t)) {
        t = 0;
      }
      if (!oo.defined(e)) {
        this.options.linearA = [];
      } else if (oo.number(e)) {
        this.options.linearA = [e];
      } else if (Array.isArray(e) && e.length && e.every(oo.number)) {
        this.options.linearA = e;
      } else {
        throw oo.invalidParameterError("a", "number or array of numbers", e);
      }
      if (!oo.defined(t)) {
        this.options.linearB = [];
      } else if (oo.number(t)) {
        this.options.linearB = [t];
      } else if (Array.isArray(t) && t.length && t.every(oo.number)) {
        this.options.linearB = t;
      } else {
        throw oo.invalidParameterError("b", "number or array of numbers", t);
      }
      if (this.options.linearA.length !== this.options.linearB.length) {
        throw Error("Expected a and b to be arrays of the same length");
      }
      return this;
    }
    function dtp(e) {
      if (!Array.isArray(e)) {
        throw oo.invalidParameterError("inputMatrix", "array", e);
      }
      if (e.length !== 3 && e.length !== 4) {
        throw oo.invalidParameterError("inputMatrix", "3x3 or 4x4 array", e.length);
      }
      let t = e.flat().map(Number);
      if (t.length !== 9 && t.length !== 16) {
        throw oo.invalidParameterError("inputMatrix", "cardinality of 9 or 16", t.length);
      }
      this.options.recombMatrix = t;
      return this;
    }
    function ptp(e) {
      if (!oo.plainObject(e)) {
        throw oo.invalidParameterError("options", "plain object", e);
      }
      if ("brightness" in e) {
        if (oo.number(e.brightness) && e.brightness >= 0) {
          this.options.brightness = e.brightness;
        } else {
          throw oo.invalidParameterError("brightness", "number above zero", e.brightness);
        }
      }
      if ("saturation" in e) {
        if (oo.number(e.saturation) && e.saturation >= 0) {
          this.options.saturation = e.saturation;
        } else {
          throw oo.invalidParameterError("saturation", "number above zero", e.saturation);
        }
      }
      if ("hue" in e) {
        if (oo.integer(e.hue)) {
          this.options.hue = e.hue % 360;
        } else {
          throw oo.invalidParameterError("hue", "number", e.hue);
        }
      }
      if ("lightness" in e) {
        if (oo.number(e.lightness)) {
          this.options.lightness = e.lightness;
        } else {
          throw oo.invalidParameterError("lightness", "number", e.lightness);
        }
      }
      return this;
    }
    ZJi.exports = e => {
      Object.assign(e.prototype, {
        autoOrient: zep,
        rotate: Vep,
        flip: Kep,
        flop: Yep,
        affine: Jep,
        sharpen: Xep,
        erode: QJi,
        dilate: XJi,
        median: Qep,
        blur: Zep,
        flatten: etp,
        unflatten: ttp,
        gamma: ntp,
        negate: rtp,
        normalise: otp,
        normalize: stp,
        clahe: itp,
        convolve: atp,
        threshold: ltp,
        boolean: ctp,
        linear: utp,
        recomb: dtp,
        modulate: ptp
      });
    };
  });
  var iXi = __commonJS((gTy, sXi) => {
    var {
      defineProperty: Bro,
      getOwnPropertyDescriptor: mtp,
      getOwnPropertyNames: ftp
    } = Object;
    var htp = Object.prototype.hasOwnProperty;
    var gtp = (e, t) => {
      for (var n in t) {
        Bro(e, n, {
          get: t[n],
          enumerable: true
        });
      }
    };
    var ytp = (e, t, n, r) => {
      if (t && typeof t === "object" || typeof t === "function") {
        for (let o of ftp(t)) {
          if (!htp.call(e, o) && o !== n) {
            Bro(e, o, {
              get: () => t[o],
              enumerable: !(r = mtp(t, o)) || r.enumerable
            });
          }
        }
      }
      return e;
    };
    var _tp = e => ytp(Bro({}, "__esModule", {
      value: true
    }), e);
    var tXi = {};
    gtp(tXi, {
      default: () => Otp
    });
    sXi.exports = _tp(tXi);
    var Cue = {
      aliceblue: [240, 248, 255],
      antiquewhite: [250, 235, 215],
      aqua: [0, 255, 255],
      aquamarine: [127, 255, 212],
      azure: [240, 255, 255],
      beige: [245, 245, 220],
      bisque: [255, 228, 196],
      black: [0, 0, 0],
      blanchedalmond: [255, 235, 205],
      blue: [0, 0, 255],
      blueviolet: [138, 43, 226],
      brown: [165, 42, 42],
      burlywood: [222, 184, 135],
      cadetblue: [95, 158, 160],
      chartreuse: [127, 255, 0],
      chocolate: [210, 105, 30],
      coral: [255, 127, 80],
      cornflowerblue: [100, 149, 237],
      cornsilk: [255, 248, 220],
      crimson: [220, 20, 60],
      cyan: [0, 255, 255],
      darkblue: [0, 0, 139],
      darkcyan: [0, 139, 139],
      darkgoldenrod: [184, 134, 11],
      darkgray: [169, 169, 169],
      darkgreen: [0, 100, 0],
      darkgrey: [169, 169, 169],
      darkkhaki: [189, 183, 107],
      darkmagenta: [139, 0, 139],
      darkolivegreen: [85, 107, 47],
      darkorange: [255, 140, 0],
      darkorchid: [153, 50, 204],
      darkred: [139, 0, 0],
      darksalmon: [233, 150, 122],
      darkseagreen: [143, 188, 143],
      darkslateblue: [72, 61, 139],
      darkslategray: [47, 79, 79],
      darkslategrey: [47, 79, 79],
      darkturquoise: [0, 206, 209],
      darkviolet: [148, 0, 211],
      deeppink: [255, 20, 147],
      deepskyblue: [0, 191, 255],
      dimgray: [105, 105, 105],
      dimgrey: [105, 105, 105],
      dodgerblue: [30, 144, 255],
      firebrick: [178, 34, 34],
      floralwhite: [255, 250, 240],
      forestgreen: [34, 139, 34],
      fuchsia: [255, 0, 255],
      gainsboro: [220, 220, 220],
      ghostwhite: [248, 248, 255],
      gold: [255, 215, 0],
      goldenrod: [218, 165, 32],
      gray: [128, 128, 128],
      green: [0, 128, 0],
      greenyellow: [173, 255, 47],
      grey: [128, 128, 128],
      honeydew: [240, 255, 240],
      hotpink: [255, 105, 180],
      indianred: [205, 92, 92],
      indigo: [75, 0, 130],
      ivory: [255, 255, 240],
      khaki: [240, 230, 140],
      lavender: [230, 230, 250],
      lavenderblush: [255, 240, 245],
      lawngreen: [124, 252, 0],
      lemonchiffon: [255, 250, 205],
      lightblue: [173, 216, 230],
      lightcoral: [240, 128, 128],
      lightcyan: [224, 255, 255],
      lightgoldenrodyellow: [250, 250, 210],
      lightgray: [211, 211, 211],
      lightgreen: [144, 238, 144],
      lightgrey: [211, 211, 211],
      lightpink: [255, 182, 193],
      lightsalmon: [255, 160, 122],
      lightseagreen: [32, 178, 170],
      lightskyblue: [135, 206, 250],
      lightslategray: [119, 136, 153],
      lightslategrey: [119, 136, 153],
      lightsteelblue: [176, 196, 222],
      lightyellow: [255, 255, 224],
      lime: [0, 255, 0],
      limegreen: [50, 205, 50],
      linen: [250, 240, 230],
      magenta: [255, 0, 255],
      maroon: [128, 0, 0],
      mediumaquamarine: [102, 205, 170],
      mediumblue: [0, 0, 205],
      mediumorchid: [186, 85, 211],
      mediumpurple: [147, 112, 219],
      mediumseagreen: [60, 179, 113],
      mediumslateblue: [123, 104, 238],
      mediumspringgreen: [0, 250, 154],
      mediumturquoise: [72, 209, 204],
      mediumvioletred: [199, 21, 133],
      midnightblue: [25, 25, 112],
      mintcream: [245, 255, 250],
      mistyrose: [255, 228, 225],
      moccasin: [255, 228, 181],
      navajowhite: [255, 222, 173],
      navy: [0, 0, 128],
      oldlace: [253, 245, 230],
      olive: [128, 128, 0],
      olivedrab: [107, 142, 35],
      orange: [255, 165, 0],
      orangered: [255, 69, 0],
      orchid: [218, 112, 214],
      palegoldenrod: [238, 232, 170],
      palegreen: [152, 251, 152],
      paleturquoise: [175, 238, 238],
      palevioletred: [219, 112, 147],
      papayawhip: [255, 239, 213],
      peachpuff: [255, 218, 185],
      peru: [205, 133, 63],
      pink: [255, 192, 203],
      plum: [221, 160, 221],
      powderblue: [176, 224, 230],
      purple: [128, 0, 128],
      rebeccapurple: [102, 51, 153],
      red: [255, 0, 0],
      rosybrown: [188, 143, 143],
      royalblue: [65, 105, 225],
      saddlebrown: [139, 69, 19],
      salmon: [250, 128, 114],
      sandybrown: [244, 164, 96],
      seagreen: [46, 139, 87],
      seashell: [255, 245, 238],
      sienna: [160, 82, 45],
      silver: [192, 192, 192],
      skyblue: [135, 206, 235],
      slateblue: [106, 90, 205],
      slategray: [112, 128, 144],
      slategrey: [112, 128, 144],
      snow: [255, 250, 250],
      springgreen: [0, 255, 127],
      steelblue: [70, 130, 180],
      tan: [210, 180, 140],
      teal: [0, 128, 128],
      thistle: [216, 191, 216],
      tomato: [255, 99, 71],
      turquoise: [64, 224, 208],
      violet: [238, 130, 238],
      wheat: [245, 222, 179],
      white: [255, 255, 255],
      whitesmoke: [245, 245, 245],
      yellow: [255, 255, 0],
      yellowgreen: [154, 205, 50]
    };
    var nXi = Object.create(null);
    for (let e in Cue) {
      if (Object.hasOwn(Cue, e)) {
        nXi[Cue[e]] = e;
      }
    }
    var gG = {
      to: {},
      get: {}
    };
    gG.get = function (e) {
      let t = e.slice(0, 3).toLowerCase();
      let n;
      let r;
      switch (t) {
        case "hsl":
          {
            n = gG.get.hsl(e);
            r = "hsl";
            break;
          }
        case "hwb":
          {
            n = gG.get.hwb(e);
            r = "hwb";
            break;
          }
        default:
          {
            n = gG.get.rgb(e);
            r = "rgb";
            break;
          }
      }
      if (!n) {
        return null;
      }
      return {
        model: r,
        value: n
      };
    };
    gG.get.rgb = function (e) {
      if (!e) {
        return null;
      }
      let t = /^#([a-f\d]{3,4})$/i;
      let n = /^#([a-f\d]{6})([a-f\d]{2})?$/i;
      let r = /^rgba?\(\s*([+-]?\d+)(?=[\s,])\s*(?:,\s*)?([+-]?\d+)(?=[\s,])\s*(?:,\s*)?([+-]?\d+)\s*(?:[\s,|/]\s*([+-]?[\d.]+)(%?)\s*)?\)$/;
      let o = /^rgba?\(\s*([+-]?[\d.]+)%\s*,?\s*([+-]?[\d.]+)%\s*,?\s*([+-]?[\d.]+)%\s*(?:[\s,|/]\s*([+-]?[\d.]+)(%?)\s*)?\)$/;
      let s = /^(\w+)$/;
      let i = [0, 0, 0, 1];
      let a;
      let l;
      let c;
      if (a = e.match(n)) {
        c = a[2];
        a = a[1];
        for (l = 0; l < 3; l++) {
          let u = l * 2;
          i[l] = Number.parseInt(a.slice(u, u + 2), 16);
        }
        if (c) {
          i[3] = Number.parseInt(c, 16) / 255;
        }
      } else if (a = e.match(t)) {
        a = a[1];
        c = a[3];
        for (l = 0; l < 3; l++) {
          i[l] = Number.parseInt(a[l] + a[l], 16);
        }
        if (c) {
          i[3] = Number.parseInt(c + c, 16) / 255;
        }
      } else if (a = e.match(r)) {
        for (l = 0; l < 3; l++) {
          i[l] = Number.parseInt(a[l + 1], 10);
        }
        if (a[4]) {
          i[3] = a[5] ? Number.parseFloat(a[4]) * 0.01 : Number.parseFloat(a[4]);
        }
      } else if (a = e.match(o)) {
        for (l = 0; l < 3; l++) {
          i[l] = Math.round(Number.parseFloat(a[l + 1]) * 2.55);
        }
        if (a[4]) {
          i[3] = a[5] ? Number.parseFloat(a[4]) * 0.01 : Number.parseFloat(a[4]);
        }
      } else if (a = e.match(s)) {
        if (a[1] === "transparent") {
          return [0, 0, 0, 0];
        }
        if (!Object.hasOwn(Cue, a[1])) {
          return null;
        }
        i = Cue[a[1]];
        i[3] = 1;
        return i;
      } else {
        return null;
      }
      for (l = 0; l < 3; l++) {
        i[l] = jPe(i[l], 0, 255);
      }
      i[3] = jPe(i[3], 0, 1);
      return i;
    };
    gG.get.hsl = function (e) {
      if (!e) {
        return null;
      }
      let t = /^hsla?\(\s*([+-]?(?:\d{0,3}\.)?\d+)(?:deg)?\s*,?\s*([+-]?[\d.]+)%\s*,?\s*([+-]?[\d.]+)%\s*(?:[,|/]\s*([+-]?(?=\.\d|\d)(?:0|[1-9]\d*)?(?:\.\d*)?(?:[eE][+-]?\d+)?)\s*)?\)$/;
      let n = e.match(t);
      if (n) {
        let r = Number.parseFloat(n[4]);
        let o = (Number.parseFloat(n[1]) % 360 + 360) % 360;
        let s = jPe(Number.parseFloat(n[2]), 0, 100);
        let i = jPe(Number.parseFloat(n[3]), 0, 100);
        let a = jPe(Number.isNaN(r) ? 1 : r, 0, 1);
        return [o, s, i, a];
      }
      return null;
    };
    gG.get.hwb = function (e) {
      if (!e) {
        return null;
      }
      let t = /^hwb\(\s*([+-]?\d{0,3}(?:\.\d+)?)(?:deg)?\s*[\s,]\s*([+-]?[\d.]+)%\s*[\s,]\s*([+-]?[\d.]+)%\s*(?:[\s,]\s*([+-]?(?=\.\d|\d)(?:0|[1-9]\d*)?(?:\.\d*)?(?:[eE][+-]?\d+)?)\s*)?\)$/;
      let n = e.match(t);
      if (n) {
        let r = Number.parseFloat(n[4]);
        let o = (Number.parseFloat(n[1]) % 360 + 360) % 360;
        let s = jPe(Number.parseFloat(n[2]), 0, 100);
        let i = jPe(Number.parseFloat(n[3]), 0, 100);
        let a = jPe(Number.isNaN(r) ? 1 : r, 0, 1);
        return [o, s, i, a];
      }
      return null;
    };
    gG.to.hex = function (...e) {
      return "#" + eLn(e[0]) + eLn(e[1]) + eLn(e[2]) + (e[3] < 1 ? eLn(Math.round(e[3] * 255)) : "");
    };
    gG.to.rgb = function (...e) {
      return e.length < 4 || e[3] === 1 ? "rgb(" + Math.round(e[0]) + ", " + Math.round(e[1]) + ", " + Math.round(e[2]) + ")" : "rgba(" + Math.round(e[0]) + ", " + Math.round(e[1]) + ", " + Math.round(e[2]) + ", " + e[3] + ")";
    };
    gG.to.rgb.percent = function (...e) {
      let t = Math.round(e[0] / 255 * 100);
      let n = Math.round(e[1] / 255 * 100);
      let r = Math.round(e[2] / 255 * 100);
      return e.length < 4 || e[3] === 1 ? "rgb(" + t + "%, " + n + "%, " + r + "%)" : "rgba(" + t + "%, " + n + "%, " + r + "%, " + e[3] + ")";
    };
    gG.to.hsl = function (...e) {
      return e.length < 4 || e[3] === 1 ? "hsl(" + e[0] + ", " + e[1] + "%, " + e[2] + "%)" : "hsla(" + e[0] + ", " + e[1] + "%, " + e[2] + "%, " + e[3] + ")";
    };
    gG.to.hwb = function (...e) {
      let t = "";
      if (e.length >= 4 && e[3] !== 1) {
        t = ", " + e[3];
      }
      return "hwb(" + e[0] + ", " + e[1] + "%, " + e[2] + "%" + t + ")";
    };
    gG.to.keyword = function (...e) {
      return nXi[e.slice(0, 3)];
    };
    function jPe(e, t, n) {
      return Math.min(Math.max(t, e), n);
    }
    function eLn(e) {
      let t = Math.round(e).toString(16).toUpperCase();
      return t.length < 2 ? "0" + t : t;
    }
    var qct = gG;
    var rXi = {};
    for (let e of Object.keys(Cue)) {
      rXi[Cue[e]] = e;
    }
    var Ol = {
      rgb: {
        channels: 3,
        labels: "rgb"
      },
      hsl: {
        channels: 3,
        labels: "hsl"
      },
      hsv: {
        channels: 3,
        labels: "hsv"
      },
      hwb: {
        channels: 3,
        labels: "hwb"
      },
      cmyk: {
        channels: 4,
        labels: "cmyk"
      },
      xyz: {
        channels: 3,
        labels: "xyz"
      },
      lab: {
        channels: 3,
        labels: "lab"
      },
      oklab: {
        channels: 3,
        labels: ["okl", "oka", "okb"]
      },
      lch: {
        channels: 3,
        labels: "lch"
      },
      oklch: {
        channels: 3,
        labels: ["okl", "okc", "okh"]
      },
      hex: {
        channels: 1,
        labels: ["hex"]
      },
      keyword: {
        channels: 1,
        labels: ["keyword"]
      },
      ansi16: {
        channels: 1,
        labels: ["ansi16"]
      },
      ansi256: {
        channels: 1,
        labels: ["ansi256"]
      },
      hcg: {
        channels: 3,
        labels: ["h", "c", "g"]
      },
      apple: {
        channels: 3,
        labels: ["r16", "g16", "b16"]
      },
      gray: {
        channels: 1,
        labels: ["gray"]
      }
    };
    var sGe = Ol;
    function Gct(e) {
      let t = e > 0.0031308 ? 1.055 * e ** 0.4166666666666667 - 0.055 : e * 12.92;
      return Math.min(Math.max(0, t), 1);
    }
    function Vct(e) {
      return e > 0.04045 ? ((e + 0.055) / 1.055) ** 2.4 : e / 12.92;
    }
    for (let e of Object.keys(Ol)) {
      if (!("channels" in Ol[e])) {
        throw Error("missing channels property: " + e);
      }
      if (!("labels" in Ol[e])) {
        throw Error("missing channel labels property: " + e);
      }
      if (Ol[e].labels.length !== Ol[e].channels) {
        throw Error("channel and label counts mismatch: " + e);
      }
      let {
        channels: t,
        labels: n
      } = Ol[e];
      delete Ol[e].channels;
      delete Ol[e].labels;
      Object.defineProperty(Ol[e], "channels", {
        value: t
      });
      Object.defineProperty(Ol[e], "labels", {
        value: n
      });
    }
    Ol.rgb.hsl = function (e) {
      let t = e[0] / 255;
      let n = e[1] / 255;
      let r = e[2] / 255;
      let o = Math.min(t, n, r);
      let s = Math.max(t, n, r);
      let i = s - o;
      let a;
      let l;
      switch (s) {
        case o:
          {
            a = 0;
            break;
          }
        case t:
          {
            a = (n - r) / i;
            break;
          }
        case n:
          {
            a = 2 + (r - t) / i;
            break;
          }
        case r:
          {
            a = 4 + (t - n) / i;
            break;
          }
      }
      if (a = Math.min(a * 60, 360), a < 0) {
        a += 360;
      }
      let c = (o + s) / 2;
      if (s === o) {
        l = 0;
      } else if (c <= 0.5) {
        l = i / (s + o);
      } else {
        l = i / (2 - s - o);
      }
      return [a, l * 100, c * 100];
    };
    Ol.rgb.hsv = function (e) {
      let t;
      let n;
      let r;
      let o;
      let s;
      let i = e[0] / 255;
      let a = e[1] / 255;
      let l = e[2] / 255;
      let c = Math.max(i, a, l);
      let u = c - Math.min(i, a, l);
      let d = function (p) {
        return (c - p) / 6 / u + 0.5;
      };
      if (u === 0) {
        o = 0;
        s = 0;
      } else {
        switch (s = u / c, t = d(i), n = d(a), r = d(l), c) {
          case i:
            {
              o = r - n;
              break;
            }
          case a:
            {
              o = 0.3333333333333333 + t - r;
              break;
            }
          case l:
            {
              o = 0.6666666666666666 + n - t;
              break;
            }
        }
        if (o < 0) {
          o += 1;
        } else if (o > 1) {
          o -= 1;
        }
      }
      return [o * 360, s * 100, c * 100];
    };
    Ol.rgb.hwb = function (e) {
      let t = e[0];
      let n = e[1];
      let r = e[2];
      let o = Ol.rgb.hsl(e)[0];
      let s = 0.00392156862745098 * Math.min(t, Math.min(n, r));
      r = 1 - 0.00392156862745098 * Math.max(t, Math.max(n, r));
      return [o, s * 100, r * 100];
    };
    Ol.rgb.oklab = function (e) {
      let t = Vct(e[0] / 255);
      let n = Vct(e[1] / 255);
      let r = Vct(e[2] / 255);
      let o = Math.cbrt(0.4122214708 * t + 0.5363325363 * n + 0.0514459929 * r);
      let s = Math.cbrt(0.2119034982 * t + 0.6806995451 * n + 0.1073969566 * r);
      let i = Math.cbrt(0.0883024619 * t + 0.2817188376 * n + 0.6299787005 * r);
      let a = 0.2104542553 * o + 0.793617785 * s - 0.0040720468 * i;
      let l = 1.9779984951 * o - 2.428592205 * s + 0.4505937099 * i;
      let c = 0.0259040371 * o + 0.7827717662 * s - 0.808675766 * i;
      return [a * 100, l * 100, c * 100];
    };
    Ol.rgb.cmyk = function (e) {
      let t = e[0] / 255;
      let n = e[1] / 255;
      let r = e[2] / 255;
      let o = Math.min(1 - t, 1 - n, 1 - r);
      let s = (1 - t - o) / (1 - o) || 0;
      let i = (1 - n - o) / (1 - o) || 0;
      let a = (1 - r - o) / (1 - o) || 0;
      return [s * 100, i * 100, a * 100, o * 100];
    };
    function btp(e, t) {
      return (e[0] - t[0]) ** 2 + (e[1] - t[1]) ** 2 + (e[2] - t[2]) ** 2;
    }
    Ol.rgb.keyword = function (e) {
      let t = rXi[e];
      if (t) {
        return t;
      }
      let n = Number.POSITIVE_INFINITY;
      let r;
      for (let o of Object.keys(Cue)) {
        let s = Cue[o];
        let i = btp(e, s);
        if (i < n) {
          n = i;
          r = o;
        }
      }
      return r;
    };
    Ol.keyword.rgb = function (e) {
      return Cue[e];
    };
    Ol.rgb.xyz = function (e) {
      let t = Vct(e[0] / 255);
      let n = Vct(e[1] / 255);
      let r = Vct(e[2] / 255);
      let o = t * 0.4124564 + n * 0.3575761 + r * 0.1804375;
      let s = t * 0.2126729 + n * 0.7151522 + r * 0.072175;
      let i = t * 0.0193339 + n * 0.119192 + r * 0.9503041;
      return [o * 100, s * 100, i * 100];
    };
    Ol.rgb.lab = function (e) {
      let t = Ol.rgb.xyz(e);
      let n = t[0];
      let r = t[1];
      let o = t[2];
      n /= 95.047;
      r /= 100;
      o /= 108.883;
      n = n > 0.008856451679035631 ? n ** 0.3333333333333333 : 7.787 * n + 0.13793103448275862;
      r = r > 0.008856451679035631 ? r ** 0.3333333333333333 : 7.787 * r + 0.13793103448275862;
      o = o > 0.008856451679035631 ? o ** 0.3333333333333333 : 7.787 * o + 0.13793103448275862;
      let s = 116 * r - 16;
      let i = 500 * (n - r);
      let a = 200 * (r - o);
      return [s, i, a];
    };
    Ol.hsl.rgb = function (e) {
      let t = e[0] / 360;
      let n = e[1] / 100;
      let r = e[2] / 100;
      let o;
      let s;
      if (n === 0) {
        s = r * 255;
        return [s, s, s];
      }
      let i = r < 0.5 ? r * (1 + n) : r + n - r * n;
      let a = 2 * r - i;
      let l = [0, 0, 0];
      for (let c = 0; c < 3; c++) {
        if (o = t + 0.3333333333333333 * -(c - 1), o < 0) {
          o++;
        }
        if (o > 1) {
          o--;
        }
        if (6 * o < 1) {
          s = a + (i - a) * 6 * o;
        } else if (2 * o < 1) {
          s = i;
        } else if (3 * o < 2) {
          s = a + (i - a) * (0.6666666666666666 - o) * 6;
        } else {
          s = a;
        }
        l[c] = s * 255;
      }
      return l;
    };
    Ol.hsl.hsv = function (e) {
      let t = e[0];
      let n = e[1] / 100;
      let r = e[2] / 100;
      let o = n;
      let s = Math.max(r, 0.01);
      r *= 2;
      n *= r <= 1 ? r : 2 - r;
      o *= s <= 1 ? s : 2 - s;
      let i = (r + n) / 2;
      let a = r === 0 ? 2 * o / (s + o) : 2 * n / (r + n);
      return [t, a * 100, i * 100];
    };
    Ol.hsv.rgb = function (e) {
      let t = e[0] / 60;
      let n = e[1] / 100;
      let r = e[2] / 100;
      let o = Math.floor(t) % 6;
      let s = t - Math.floor(t);
      let i = 255 * r * (1 - n);
      let a = 255 * r * (1 - n * s);
      let l = 255 * r * (1 - n * (1 - s));
      switch (r *= 255, o) {
        case 0:
          return [r, l, i];
        case 1:
          return [a, r, i];
        case 2:
          return [i, r, l];
        case 3:
          return [i, a, r];
        case 4:
          return [l, i, r];
        case 5:
          return [r, i, a];
      }
    };
    Ol.hsv.hsl = function (e) {
      let t = e[0];
      let n = e[1] / 100;
      let r = e[2] / 100;
      let o = Math.max(r, 0.01);
      let s;
      let i;
      i = (2 - n) * r;
      let a = (2 - n) * o;
      s = n * o;
      s /= a <= 1 ? a : 2 - a;
      s = s || 0;
      i /= 2;
      return [t, s * 100, i * 100];
    };
    Ol.hwb.rgb = function (e) {
      let t = e[0] / 360;
      let n = e[1] / 100;
      let r = e[2] / 100;
      let o = n + r;
      let s;
      if (o > 1) {
        n /= o;
        r /= o;
      }
      let i = Math.floor(6 * t);
      let a = 1 - r;
      if (s = 6 * t - i, (i & 1) !== 0) {
        s = 1 - s;
      }
      let l = n + s * (a - n);
      let c;
      let u;
      let d;
      switch (i) {
        default:
        case 6:
        case 0:
          {
            c = a;
            u = l;
            d = n;
            break;
          }
        case 1:
          {
            c = l;
            u = a;
            d = n;
            break;
          }
        case 2:
          {
            c = n;
            u = a;
            d = l;
            break;
          }
        case 3:
          {
            c = n;
            u = l;
            d = a;
            break;
          }
        case 4:
          {
            c = l;
            u = n;
            d = a;
            break;
          }
        case 5:
          {
            c = a;
            u = n;
            d = l;
            break;
          }
      }
      return [c * 255, u * 255, d * 255];
    };
    Ol.cmyk.rgb = function (e) {
      let t = e[0] / 100;
      let n = e[1] / 100;
      let r = e[2] / 100;
      let o = e[3] / 100;
      let s = 1 - Math.min(1, t * (1 - o) + o);
      let i = 1 - Math.min(1, n * (1 - o) + o);
      let a = 1 - Math.min(1, r * (1 - o) + o);
      return [s * 255, i * 255, a * 255];
    };
    Ol.xyz.rgb = function (e) {
      let t = e[0] / 100;
      let n = e[1] / 100;
      let r = e[2] / 100;
      let o;
      let s;
      let i;
      o = t * 3.2404542 + n * -1.5371385 + r * -0.4985314;
      s = t * -0.969266 + n * 1.8760108 + r * 0.041556;
      i = t * 0.0556434 + n * -0.2040259 + r * 1.0572252;
      o = Gct(o);
      s = Gct(s);
      i = Gct(i);
      return [o * 255, s * 255, i * 255];
    };
    Ol.xyz.lab = function (e) {
      let t = e[0];
      let n = e[1];
      let r = e[2];
      t /= 95.047;
      n /= 100;
      r /= 108.883;
      t = t > 0.008856451679035631 ? t ** 0.3333333333333333 : 7.787 * t + 0.13793103448275862;
      n = n > 0.008856451679035631 ? n ** 0.3333333333333333 : 7.787 * n + 0.13793103448275862;
      r = r > 0.008856451679035631 ? r ** 0.3333333333333333 : 7.787 * r + 0.13793103448275862;
      let o = 116 * n - 16;
      let s = 500 * (t - n);
      let i = 200 * (n - r);
      return [o, s, i];
    };
    Ol.xyz.oklab = function (e) {
      let t = e[0] / 100;
      let n = e[1] / 100;
      let r = e[2] / 100;
      let o = Math.cbrt(0.8189330101 * t + 0.3618667424 * n - 0.1288597137 * r);
      let s = Math.cbrt(0.0329845436 * t + 0.9293118715 * n + 0.0361456387 * r);
      let i = Math.cbrt(0.0482003018 * t + 0.2643662691 * n + 0.633851707 * r);
      let a = 0.2104542553 * o + 0.793617785 * s - 0.0040720468 * i;
      let l = 1.9779984951 * o - 2.428592205 * s + 0.4505937099 * i;
      let c = 0.0259040371 * o + 0.7827717662 * s - 0.808675766 * i;
      return [a * 100, l * 100, c * 100];
    };
    Ol.oklab.oklch = function (e) {
      return Ol.lab.lch(e);
    };
    Ol.oklab.xyz = function (e) {
      let t = e[0] / 100;
      let n = e[1] / 100;
      let r = e[2] / 100;
      let o = (0.999999998 * t + 0.396337792 * n + 0.215803758 * r) ** 3;
      let s = (1.000000008 * t - 0.105561342 * n - 0.063854175 * r) ** 3;
      let i = (1.000000055 * t - 0.089484182 * n - 1.291485538 * r) ** 3;
      let a = 1.227013851 * o - 0.55779998 * s + 0.281256149 * i;
      let l = -0.040580178 * o + 1.11225687 * s - 0.071676679 * i;
      let c = -0.076381285 * o - 0.421481978 * s + 1.58616322 * i;
      return [a * 100, l * 100, c * 100];
    };
    Ol.oklab.rgb = function (e) {
      let t = e[0] / 100;
      let n = e[1] / 100;
      let r = e[2] / 100;
      let o = (t + 0.3963377774 * n + 0.2158037573 * r) ** 3;
      let s = (t - 0.1055613458 * n - 0.0638541728 * r) ** 3;
      let i = (t - 0.0894841775 * n - 1.291485548 * r) ** 3;
      let a = Gct(4.0767416621 * o - 3.3077115913 * s + 0.2309699292 * i);
      let l = Gct(-1.2684380046 * o + 2.6097574011 * s - 0.3413193965 * i);
      let c = Gct(-0.0041960863 * o - 0.7034186147 * s + 1.707614701 * i);
      return [a * 255, l * 255, c * 255];
    };
    Ol.oklch.oklab = function (e) {
      return Ol.lch.lab(e);
    };
    Ol.lab.xyz = function (e) {
      let t = e[0];
      let n = e[1];
      let r = e[2];
      let o;
      let s;
      let i;
      s = (t + 16) / 116;
      o = n / 500 + s;
      i = s - r / 200;
      let a = s ** 3;
      let l = o ** 3;
      let c = i ** 3;
      s = a > 0.008856451679035631 ? a : (s - 0.13793103448275862) / 7.787;
      o = l > 0.008856451679035631 ? l : (o - 0.13793103448275862) / 7.787;
      i = c > 0.008856451679035631 ? c : (i - 0.13793103448275862) / 7.787;
      o *= 95.047;
      s *= 100;
      i *= 108.883;
      return [o, s, i];
    };
    Ol.lab.lch = function (e) {
      let t = e[0];
      let n = e[1];
      let r = e[2];
      let o;
      if (o = Math.atan2(r, n) * 360 / 2 / Math.PI, o < 0) {
        o += 360;
      }
      let i = Math.sqrt(n * n + r * r);
      return [t, i, o];
    };
    Ol.lch.lab = function (e) {
      let t = e[0];
      let n = e[1];
      let o = e[2] / 360 * 2 * Math.PI;
      let s = n * Math.cos(o);
      let i = n * Math.sin(o);
      return [t, s, i];
    };
    Ol.rgb.ansi16 = function (e, t = null) {
      let [n, r, o] = e;
      let s = t === null ? Ol.rgb.hsv(e)[2] : t;
      if (s = Math.round(s / 50), s === 0) {
        return 30;
      }
      let i = 30 + (Math.round(o / 255) << 2 | Math.round(r / 255) << 1 | Math.round(n / 255));
      if (s === 2) {
        i += 60;
      }
      return i;
    };
    Ol.hsv.ansi16 = function (e) {
      return Ol.rgb.ansi16(Ol.hsv.rgb(e), e[2]);
    };
    Ol.rgb.ansi256 = function (e) {
      let t = e[0];
      let n = e[1];
      let r = e[2];
      if (t >> 4 === n >> 4 && n >> 4 === r >> 4) {
        if (t < 8) {
          return 16;
        }
        if (t > 248) {
          return 231;
        }
        return Math.round((t - 8) / 247 * 24) + 232;
      }
      return 16 + 36 * Math.round(t / 255 * 5) + 6 * Math.round(n / 255 * 5) + Math.round(r / 255 * 5);
    };
    Ol.ansi16.rgb = function (e) {
      e = e[0];
      let t = e % 10;
      if (t === 0 || t === 7) {
        if (e > 50) {
          t += 3.5;
        }
        t = t / 10.5 * 255;
        return [t, t, t];
      }
      let n = (Math.trunc(e > 50) + 1) * 0.5;
      let r = (t & 1) * n * 255;
      let o = (t >> 1 & 1) * n * 255;
      let s = (t >> 2 & 1) * n * 255;
      return [r, o, s];
    };
    Ol.ansi256.rgb = function (e) {
      if (e = e[0], e >= 232) {
        let s = (e - 232) * 10 + 8;
        return [s, s, s];
      }
      e -= 16;
      let t;
      let n = Math.floor(e / 36) / 5 * 255;
      let r = Math.floor((t = e % 36) / 6) / 5 * 255;
      let o = t % 6 / 5 * 255;
      return [n, r, o];
    };
    Ol.rgb.hex = function (e) {
      let n = (((Math.round(e[0]) & 255) << 16) + ((Math.round(e[1]) & 255) << 8) + (Math.round(e[2]) & 255)).toString(16).toUpperCase();
      return "000000".slice(n.length) + n;
    };
    Ol.hex.rgb = function (e) {
      let t = e.toString(16).match(/[a-f\d]{6}|[a-f\d]{3}/i);
      if (!t) {
        return [0, 0, 0];
      }
      let n = t[0];
      if (t[0].length === 3) {
        n = [...n].map(a => a + a).join("");
      }
      let r = Number.parseInt(n, 16);
      let o = r >> 16 & 255;
      let s = r >> 8 & 255;
      let i = r & 255;
      return [o, s, i];
    };
    Ol.rgb.hcg = function (e) {
      let t = e[0] / 255;
      let n = e[1] / 255;
      let r = e[2] / 255;
      let o = Math.max(Math.max(t, n), r);
      let s = Math.min(Math.min(t, n), r);
      let i = o - s;
      let a;
      let l = i < 1 ? s / (1 - i) : 0;
      if (i <= 0) {
        a = 0;
      } else if (o === t) {
        a = (n - r) / i % 6;
      } else if (o === n) {
        a = 2 + (r - t) / i;
      } else {
        a = 4 + (t - n) / i;
      }
      a /= 6;
      a %= 1;
      return [a * 360, i * 100, l * 100];
    };
    Ol.hsl.hcg = function (e) {
      let t = e[1] / 100;
      let n = e[2] / 100;
      let r = n < 0.5 ? 2 * t * n : 2 * t * (1 - n);
      let o = 0;
      if (r < 1) {
        o = (n - 0.5 * r) / (1 - r);
      }
      return [e[0], r * 100, o * 100];
    };
    Ol.hsv.hcg = function (e) {
      let t = e[1] / 100;
      let n = e[2] / 100;
      let r = t * n;
      let o = 0;
      if (r < 1) {
        o = (n - r) / (1 - r);
      }
      return [e[0], r * 100, o * 100];
    };
    Ol.hcg.rgb = function (e) {
      let t = e[0] / 360;
      let n = e[1] / 100;
      let r = e[2] / 100;
      if (n === 0) {
        return [r * 255, r * 255, r * 255];
      }
      let o = [0, 0, 0];
      let s = t % 1 * 6;
      let i = s % 1;
      let a = 1 - i;
      let l = 0;
      switch (Math.floor(s)) {
        case 0:
          {
            o[0] = 1;
            o[1] = i;
            o[2] = 0;
            break;
          }
        case 1:
          {
            o[0] = a;
            o[1] = 1;
            o[2] = 0;
            break;
          }
        case 2:
          {
            o[0] = 0;
            o[1] = 1;
            o[2] = i;
            break;
          }
        case 3:
          {
            o[0] = 0;
            o[1] = a;
            o[2] = 1;
            break;
          }
        case 4:
          {
            o[0] = i;
            o[1] = 0;
            o[2] = 1;
            break;
          }
        default:
          o[0] = 1;
          o[1] = 0;
          o[2] = a;
      }
      l = (1 - n) * r;
      return [(n * o[0] + l) * 255, (n * o[1] + l) * 255, (n * o[2] + l) * 255];
    };
    Ol.hcg.hsv = function (e) {
      let t = e[1] / 100;
      let n = e[2] / 100;
      let r = t + n * (1 - t);
      let o = 0;
      if (r > 0) {
        o = t / r;
      }
      return [e[0], o * 100, r * 100];
    };
    Ol.hcg.hsl = function (e) {
      let t = e[1] / 100;
      let r = e[2] / 100 * (1 - t) + 0.5 * t;
      let o = 0;
      if (r > 0 && r < 0.5) {
        o = t / (2 * r);
      } else if (r >= 0.5 && r < 1) {
        o = t / (2 * (1 - r));
      }
      return [e[0], o * 100, r * 100];
    };
    Ol.hcg.hwb = function (e) {
      let t = e[1] / 100;
      let n = e[2] / 100;
      let r = t + n * (1 - t);
      return [e[0], (r - t) * 100, (1 - r) * 100];
    };
    Ol.hwb.hcg = function (e) {
      let t = e[1] / 100;
      let r = 1 - e[2] / 100;
      let o = r - t;
      let s = 0;
      if (o < 1) {
        s = (r - o) / (1 - o);
      }
      return [e[0], o * 100, s * 100];
    };
    Ol.apple.rgb = function (e) {
      return [e[0] / 65535 * 255, e[1] / 65535 * 255, e[2] / 65535 * 255];
    };
    Ol.rgb.apple = function (e) {
      return [e[0] / 255 * 65535, e[1] / 255 * 65535, e[2] / 255 * 65535];
    };
    Ol.gray.rgb = function (e) {
      return [e[0] / 100 * 255, e[0] / 100 * 255, e[0] / 100 * 255];
    };
    Ol.gray.hsl = function (e) {
      return [0, 0, e[0]];
    };
    Ol.gray.hsv = Ol.gray.hsl;
    Ol.gray.hwb = function (e) {
      return [0, 100, e[0]];
    };
    Ol.gray.cmyk = function (e) {
      return [0, 0, 0, e[0]];
    };
    Ol.gray.lab = function (e) {
      return [e[0], 0, 0];
    };
    Ol.gray.hex = function (e) {
      let t = Math.round(e[0] / 100 * 255) & 255;
      let r = ((t << 16) + (t << 8) + t).toString(16).toUpperCase();
      return "000000".slice(r.length) + r;
    };
    Ol.rgb.gray = function (e) {
      return [(e[0] + e[1] + e[2]) / 3 / 255 * 100];
    };
    function Stp() {
      let e = {};
      let t = Object.keys(sGe);
      for (let {
          length: n
        } = t, r = 0; r < n; r++) {
        e[t[r]] = {
          distance: -1,
          parent: null
        };
      }
      return e;
    }
    function Ttp(e) {
      let t = Stp();
      let n = [e];
      t[e].distance = 0;
      while (n.length > 0) {
        let r = n.pop();
        let o = Object.keys(sGe[r]);
        for (let {
            length: s
          } = o, i = 0; i < s; i++) {
          let a = o[i];
          let l = t[a];
          if (l.distance === -1) {
            l.distance = t[r].distance + 1;
            l.parent = r;
            n.unshift(a);
          }
        }
      }
      return t;
    }
    function Etp(e, t) {
      return function (n) {
        return t(e(n));
      };
    }
    function vtp(e, t) {
      let n = [t[e].parent, e];
      let r = sGe[t[e].parent][e];
      let o = t[e].parent;
      while (t[o].parent) {
        n.unshift(t[o].parent);
        r = Etp(sGe[t[o].parent][o], r);
        o = t[o].parent;
      }
      r.conversion = n;
      return r;
    }
    function wtp(e) {
      let t = Ttp(e);
      let n = {};
      let r = Object.keys(t);
      for (let {
          length: o
        } = r, s = 0; s < o; s++) {
        let i = r[s];
        if (t[i].parent === null) {
          continue;
        }
        n[i] = vtp(i, t);
      }
      return n;
    }
    var Ctp = wtp;
    var Wct = {};
    var Rtp = Object.keys(sGe);
    function xtp(e) {
      let t = function (...n) {
        let r = n[0];
        if (r === undefined || r === null) {
          return r;
        }
        if (r.length > 1) {
          n = r;
        }
        return e(n);
      };
      if ("conversion" in e) {
        t.conversion = e.conversion;
      }
      return t;
    }
    function ktp(e) {
      let t = function (...n) {
        let r = n[0];
        if (r === undefined || r === null) {
          return r;
        }
        if (r.length > 1) {
          n = r;
        }
        let o = e(n);
        if (typeof o === "object") {
          for (let {
              length: s
            } = o, i = 0; i < s; i++) {
            o[i] = Math.round(o[i]);
          }
        }
        return o;
      };
      if ("conversion" in e) {
        t.conversion = e.conversion;
      }
      return t;
    }
    for (let e of Rtp) {
      Wct[e] = {};
      Object.defineProperty(Wct[e], "channels", {
        value: sGe[e].channels
      });
      Object.defineProperty(Wct[e], "labels", {
        value: sGe[e].labels
      });
      let t = Ctp(e);
      let n = Object.keys(t);
      for (let r of n) {
        let o = t[r];
        Wct[e][r] = ktp(o);
        Wct[e][r].raw = xtp(o);
      }
    }
    var sV = Wct;
    var oXi = ["keyword", "gray", "hex"];
    var Lro = {};
    for (let e of Object.keys(sV)) {
      Lro[[...sV[e].labels].sort().join("")] = e;
    }
    var Fro = {};
    function m1(e, t) {
      if (!(this instanceof m1)) {
        return new m1(e, t);
      }
      if (t && t in oXi) {
        t = null;
      }
      if (t && !(t in sV)) {
        throw Error("Unknown model: " + t);
      }
      let n;
      let r;
      if (e == null) {
        this.model = "rgb";
        this.color = [0, 0, 0];
        this.valpha = 1;
      } else if (e instanceof m1) {
        this.model = e.model;
        this.color = [...e.color];
        this.valpha = e.valpha;
      } else if (typeof e === "string") {
        let o = qct.get(e);
        if (o === null) {
          throw Error("Unable to parse color from string: " + e);
        }
        this.model = o.model;
        r = sV[this.model].channels;
        this.color = o.value.slice(0, r);
        this.valpha = typeof o.value[r] === "number" ? o.value[r] : 1;
      } else if (e.length > 0) {
        this.model = t || "rgb";
        r = sV[this.model].channels;
        let o = Array.prototype.slice.call(e, 0, r);
        this.color = Uro(o, r);
        this.valpha = typeof e[r] === "number" ? e[r] : 1;
      } else if (typeof e === "number") {
        this.model = "rgb";
        this.color = [e >> 16 & 255, e >> 8 & 255, e & 255];
        this.valpha = 1;
      } else {
        this.valpha = 1;
        let o = Object.keys(e);
        if ("alpha" in e) {
          o.splice(o.indexOf("alpha"), 1);
          this.valpha = typeof e.alpha === "number" ? e.alpha : 0;
        }
        let s = o.sort().join("");
        if (!(s in Lro)) {
          throw Error("Unable to parse color from object: " + JSON.stringify(e));
        }
        this.model = Lro[s];
        let {
          labels: i
        } = sV[this.model];
        let a = [];
        for (n = 0; n < i.length; n++) {
          a.push(e[i[n]]);
        }
        this.color = Uro(a);
      }
      if (Fro[this.model]) {
        r = sV[this.model].channels;
        for (n = 0; n < r; n++) {
          let o = Fro[this.model][n];
          if (o) {
            this.color[n] = o(this.color[n]);
          }
        }
      }
      if (this.valpha = Math.max(0, Math.min(1, this.valpha)), Object.freeze) {
        Object.freeze(this);
      }
    }
    m1.prototype = {
      toString() {
        return this.string();
      },
      toJSON() {
        return this[this.model]();
      },
      string(e) {
        let t = this.model in qct.to ? this : this.rgb();
        t = t.round(typeof e === "number" ? e : 1);
        let n = t.valpha === 1 ? t.color : [...t.color, this.valpha];
        return qct.to[t.model](...n);
      },
      percentString(e) {
        let t = this.rgb().round(typeof e === "number" ? e : 1);
        let n = t.valpha === 1 ? t.color : [...t.color, this.valpha];
        return qct.to.rgb.percent(...n);
      },
      array() {
        return this.valpha === 1 ? [...this.color] : [...this.color, this.valpha];
      },
      object() {
        let e = {};
        let {
          channels: t
        } = sV[this.model];
        let {
          labels: n
        } = sV[this.model];
        for (let r = 0; r < t; r++) {
          e[n[r]] = this.color[r];
        }
        if (this.valpha !== 1) {
          e.alpha = this.valpha;
        }
        return e;
      },
      unitArray() {
        let e = this.rgb().color;
        if (e[0] /= 255, e[1] /= 255, e[2] /= 255, this.valpha !== 1) {
          e.push(this.valpha);
        }
        return e;
      },
      unitObject() {
        let e = this.rgb().object();
        if (e.r /= 255, e.g /= 255, e.b /= 255, this.valpha !== 1) {
          e.alpha = this.valpha;
        }
        return e;
      },
      round(e) {
        e = Math.max(e || 0, 0);
        return new m1([...this.color.map(Itp(e)), this.valpha], this.model);
      },
      alpha(e) {
        if (e !== undefined) {
          return new m1([...this.color, Math.max(0, Math.min(1, e))], this.model);
        }
        return this.valpha;
      },
      red: i0("rgb", 0, aM(255)),
      green: i0("rgb", 1, aM(255)),
      blue: i0("rgb", 2, aM(255)),
      hue: i0(["hsl", "hsv", "hsl", "hwb", "hcg"], 0, e => (e % 360 + 360) % 360),
      saturationl: i0("hsl", 1, aM(100)),
      lightness: i0("hsl", 2, aM(100)),
      saturationv: i0("hsv", 1, aM(100)),
      value: i0("hsv", 2, aM(100)),
      chroma: i0("hcg", 1, aM(100)),
      gray: i0("hcg", 2, aM(100)),
      white: i0("hwb", 1, aM(100)),
      wblack: i0("hwb", 2, aM(100)),
      cyan: i0("cmyk", 0, aM(100)),
      magenta: i0("cmyk", 1, aM(100)),
      yellow: i0("cmyk", 2, aM(100)),
      black: i0("cmyk", 3, aM(100)),
      x: i0("xyz", 0, aM(95.047)),
      y: i0("xyz", 1, aM(100)),
      z: i0("xyz", 2, aM(108.833)),
      l: i0("lab", 0, aM(100)),
      a: i0("lab", 1),
      b: i0("lab", 2),
      keyword(e) {
        if (e !== undefined) {
          return new m1(e);
        }
        return sV[this.model].keyword(this.color);
      },
      hex(e) {
        if (e !== undefined) {
          return new m1(e);
        }
        return qct.to.hex(...this.rgb().round().color);
      },
      hexa(e) {
        if (e !== undefined) {
          return new m1(e);
        }
        let t = this.rgb().round().color;
        let n = Math.round(this.valpha * 255).toString(16).toUpperCase();
        if (n.length === 1) {
          n = "0" + n;
        }
        return qct.to.hex(...t) + n;
      },
      rgbNumber() {
        let e = this.rgb().color;
        return (e[0] & 255) << 16 | (e[1] & 255) << 8 | e[2] & 255;
      },
      luminosity() {
        let e = this.rgb().color;
        let t = [];
        for (let [n, r] of e.entries()) {
          let o = r / 255;
          t[n] = o <= 0.04045 ? o / 12.92 : ((o + 0.055) / 1.055) ** 2.4;
        }
        return 0.2126 * t[0] + 0.7152 * t[1] + 0.0722 * t[2];
      },
      contrast(e) {
        let t = this.luminosity();
        let n = e.luminosity();
        if (t > n) {
          return (t + 0.05) / (n + 0.05);
        }
        return (n + 0.05) / (t + 0.05);
      },
      level(e) {
        let t = this.contrast(e);
        if (t >= 7) {
          return "AAA";
        }
        return t >= 4.5 ? "AA" : "";
      },
      isDark() {
        let e = this.rgb().color;
        return (e[0] * 2126 + e[1] * 7152 + e[2] * 722) / 1e4 < 128;
      },
      isLight() {
        return !this.isDark();
      },
      negate() {
        let e = this.rgb();
        for (let t = 0; t < 3; t++) {
          e.color[t] = 255 - e.color[t];
        }
        return e;
      },
      lighten(e) {
        let t = this.hsl();
        t.color[2] += t.color[2] * e;
        return t;
      },
      darken(e) {
        let t = this.hsl();
        t.color[2] -= t.color[2] * e;
        return t;
      },
      saturate(e) {
        let t = this.hsl();
        t.color[1] += t.color[1] * e;
        return t;
      },
      desaturate(e) {
        let t = this.hsl();
        t.color[1] -= t.color[1] * e;
        return t;
      },
      whiten(e) {
        let t = this.hwb();
        t.color[1] += t.color[1] * e;
        return t;
      },
      blacken(e) {
        let t = this.hwb();
        t.color[2] += t.color[2] * e;
        return t;
      },
      grayscale() {
        let e = this.rgb().color;
        let t = e[0] * 0.3 + e[1] * 0.59 + e[2] * 0.11;
        return m1.rgb(t, t, t);
      },
      fade(e) {
        return this.alpha(this.valpha - this.valpha * e);
      },
      opaquer(e) {
        return this.alpha(this.valpha + this.valpha * e);
      },
      rotate(e) {
        let t = this.hsl();
        let n = t.color[0];
        n = (n + e) % 360;
        n = n < 0 ? 360 + n : n;
        t.color[0] = n;
        return t;
      },
      mix(e, t) {
        if (!e || !e.rgb) {
          throw Error('Argument to "mix" was not a Color instance, but rather an instance of ' + typeof e);
        }
        let n = e.rgb();
        let r = this.rgb();
        let o = t === undefined ? 0.5 : t;
        let s = 2 * o - 1;
        let i = n.alpha() - r.alpha();
        let a = ((s * i === -1 ? s : (s + i) / (1 + s * i)) + 1) / 2;
        let l = 1 - a;
        return m1.rgb(a * n.red() + l * r.red(), a * n.green() + l * r.green(), a * n.blue() + l * r.blue(), n.alpha() * o + r.alpha() * (1 - o));
      }
    };
    for (let e of Object.keys(sV)) {
      if (oXi.includes(e)) {
        continue;
      }
      let {
        channels: t
      } = sV[e];
      m1.prototype[e] = function (...n) {
        if (this.model === e) {
          return new m1(this);
        }
        if (n.length > 0) {
          return new m1(n, e);
        }
        return new m1([...Ptp(sV[this.model][e].raw(this.color)), this.valpha], e);
      };
      m1[e] = function (...n) {
        let r = n[0];
        if (typeof r === "number") {
          r = Uro(n, t);
        }
        return new m1(r, e);
      };
    }
    function Atp(e, t) {
      return Number(e.toFixed(t));
    }
    function Itp(e) {
      return function (t) {
        return Atp(t, e);
      };
    }
    function i0(e, t, n) {
      e = Array.isArray(e) ? e : [e];
      for (let r of e) {
        (Fro[r] ||= [])[t] = n;
      }
      e = e[0];
      return function (r) {
        let o;
        if (r !== undefined) {
          if (n) {
            r = n(r);
          }
          o = this[e]();
          o.color[t] = r;
          return o;
        }
        if (o = this[e]().color[t], n) {
          o = n(o);
        }
        return o;
      };
    }
    function aM(e) {
      return function (t) {
        return Math.max(0, Math.min(e, t));
      };
    }
    function Ptp(e) {
      return Array.isArray(e) ? e : [e];
    }
    function Uro(e, t) {
      for (let n = 0; n < t; n++) {
        if (typeof e[n] !== "number") {
          e[n] = 0;
        }
      }
      return e;
    }
    var Otp = m1;
  });
  var lXi = __commonJS((yTy, aXi) => {
    aXi.exports = iXi().default;
  });
  var pXi = __commonJS((_Ty, dXi) => {
    /*!
    Copyright 2013 Lovell Fuller and others.
    SPDX-License-Identifier: Apache-2.0
    */
    var Dtp = lXi();
    var hSe = Sue();
    var cXi = {
      multiband: "multiband",
      "b-w": "b-w",
      bw: "b-w",
      cmyk: "cmyk",
      srgb: "srgb"
    };
    function Mtp(e) {
      this._setBackgroundColourOption("tint", e);
      return this;
    }
    function Ntp(e) {
      this.options.greyscale = hSe.bool(e) ? e : true;
      return this;
    }
    function Ltp(e) {
      return this.greyscale(e);
    }
    function Ftp(e) {
      if (!hSe.string(e)) {
        throw hSe.invalidParameterError("colourspace", "string", e);
      }
      this.options.colourspacePipeline = e;
      return this;
    }
    function Utp(e) {
      return this.pipelineColourspace(e);
    }
    function Btp(e) {
      if (!hSe.string(e)) {
        throw hSe.invalidParameterError("colourspace", "string", e);
      }
      this.options.colourspace = e;
      return this;
    }
    function $tp(e) {
      return this.toColourspace(e);
    }
    function uXi(e) {
      if (hSe.object(e) || hSe.string(e) && e.length >= 3 && e.length <= 200) {
        let t = Dtp(e);
        return [t.red(), t.green(), t.blue(), Math.round(t.alpha() * 255)];
      } else {
        throw hSe.invalidParameterError("background", "object or string", e);
      }
    }
    function Htp(e, t) {
      if (hSe.defined(t)) {
        this.options[e] = uXi(t);
      }
    }
    dXi.exports = e => {
      Object.assign(e.prototype, {
        tint: Mtp,
        greyscale: Ntp,
        grayscale: Ltp,
        pipelineColourspace: Ftp,
        pipelineColorspace: Utp,
        toColourspace: Btp,
        toColorspace: $tp,
        _getBackgroundColourOption: uXi,
        _setBackgroundColourOption: Htp
      });
      e.colourspace = cXi;
      e.colorspace = cXi;
    };
  });
  var fXi = __commonJS((bTy, mXi) => {
    /*!
    Copyright 2013 Lovell Fuller and others.
    SPDX-License-Identifier: Apache-2.0
    */
    var Rue = Sue();
    var jtp = {
      and: "and",
      or: "or",
      eor: "eor"
    };
    function qtp() {
      this.options.removeAlpha = true;
      return this;
    }
    function Wtp(e) {
      if (Rue.defined(e)) {
        if (Rue.number(e) && Rue.inRange(e, 0, 1)) {
          this.options.ensureAlpha = e;
        } else {
          throw Rue.invalidParameterError("alpha", "number between 0 and 1", e);
        }
      } else {
        this.options.ensureAlpha = 1;
      }
      return this;
    }
    function Gtp(e) {
      let t = {
        red: 0,
        green: 1,
        blue: 2,
        alpha: 3
      };
      if (Object.keys(t).includes(e)) {
        e = t[e];
      }
      if (Rue.integer(e) && Rue.inRange(e, 0, 4)) {
        this.options.extractChannel = e;
      } else {
        throw Rue.invalidParameterError("channel", "integer or one of: red, green, blue, alpha", e);
      }
      return this;
    }
    function Vtp(e, t) {
      if (Array.isArray(e)) {
        e.forEach(function (n) {
          this.options.joinChannelIn.push(this._createInputDescriptor(n, t));
        }, this);
      } else {
        this.options.joinChannelIn.push(this._createInputDescriptor(e, t));
      }
      return this;
    }
    function ztp(e) {
      if (Rue.string(e) && Rue.inArray(e, ["and", "or", "eor"])) {
        this.options.bandBoolOp = e;
      } else {
        throw Rue.invalidParameterError("boolOp", "one of: and, or, eor", e);
      }
      return this;
    }
    mXi.exports = e => {
      Object.assign(e.prototype, {
        removeAlpha: qtp,
        ensureAlpha: Wtp,
        extractChannel: Gtp,
        joinChannel: Vtp,
        bandbool: ztp
      });
      e.bool = jtp;
    };
  });
  var bXi = __commonJS((STy, _Xi) => {
    /*!
    Copyright 2013 Lovell Fuller and others.
    SPDX-License-Identifier: Apache-2.0
    */
    var $ro = require("path");
    var pn = Sue();
    var zct = fjt();
    var hXi = new Map([["heic", "heif"], ["heif", "heif"], ["avif", "avif"], ["jpeg", "jpeg"], ["jpg", "jpeg"], ["jpe", "jpeg"], ["tile", "tile"], ["dz", "tile"], ["png", "png"], ["raw", "raw"], ["tiff", "tiff"], ["tif", "tiff"], ["webp", "webp"], ["gif", "gif"], ["jp2", "jp2"], ["jpx", "jp2"], ["j2k", "jp2"], ["j2c", "jp2"], ["jxl", "jxl"]]);
    var gXi = () => Error("JP2 output requires libvips with support for OpenJPEG");
    var yXi = e => 1 << 31 - Math.clz32(Math.ceil(Math.log2(e)));
    function Ytp(e, t) {
      let n;
      if (!pn.string(e)) {
        n = Error("Missing output file path");
      } else if (pn.string(this.options.input.file) && $ro.resolve(this.options.input.file) === $ro.resolve(e)) {
        n = Error("Cannot use same file for input and output");
      } else if ((/\.(jp[2x]|j2[kc])$/i).test($ro.extname(e)) && !this.constructor.format.jp2k.output.file) {
        n = gXi();
      }
      if (n) {
        if (pn.fn(t)) {
          t(n);
        } else {
          return Promise.reject(n);
        }
      } else {
        this.options.fileOut = e;
        let r = Error();
        return this._pipeline(t, r);
      }
      return this;
    }
    function Jtp(e, t) {
      if (pn.object(e)) {
        this._setBooleanOption("resolveWithObject", e.resolveWithObject);
      } else if (this.options.resolveWithObject) {
        this.options.resolveWithObject = false;
      }
      this.options.fileOut = "";
      let n = Error();
      return this._pipeline(pn.fn(e) ? e : t, n);
    }
    function Xtp() {
      this.options.keepMetadata |= 1;
      return this;
    }
    function Qtp(e) {
      if (pn.object(e)) {
        for (let [t, n] of Object.entries(e)) {
          if (pn.object(n)) {
            for (let [r, o] of Object.entries(n)) {
              if (pn.string(o)) {
                this.options.withExif[`exif-${t.toLowerCase()}-${r}`] = o;
              } else {
                throw pn.invalidParameterError(`${t}.${r}`, "string", o);
              }
            }
          } else {
            throw pn.invalidParameterError(t, "object", n);
          }
        }
      } else {
        throw pn.invalidParameterError("exif", "object", e);
      }
      this.options.withExifMerge = false;
      return this.keepExif();
    }
    function Ztp(e) {
      this.withExif(e);
      this.options.withExifMerge = true;
      return this;
    }
    function enp() {
      this.options.keepMetadata |= 8;
      return this;
    }
    function tnp(e, t) {
      if (pn.string(e)) {
        this.options.withIccProfile = e;
      } else {
        throw pn.invalidParameterError("icc", "string", e);
      }
      if (this.keepIccProfile(), pn.object(t)) {
        if (pn.defined(t.attach)) {
          if (pn.bool(t.attach)) {
            if (!t.attach) {
              this.options.keepMetadata &= -9;
            }
          } else {
            throw pn.invalidParameterError("attach", "boolean", t.attach);
          }
        }
      }
      return this;
    }
    function nnp() {
      this.options.keepMetadata |= 2;
      return this;
    }
    function rnp(e) {
      if (pn.string(e) && e.length > 0) {
        this.options.withXmp = e;
        this.options.keepMetadata |= 2;
      } else {
        throw pn.invalidParameterError("xmp", "non-empty string", e);
      }
      return this;
    }
    function onp() {
      this.options.keepMetadata = 31;
      return this;
    }
    function snp(e) {
      if (this.keepMetadata(), this.withIccProfile("srgb"), pn.object(e)) {
        if (pn.defined(e.orientation)) {
          if (pn.integer(e.orientation) && pn.inRange(e.orientation, 1, 8)) {
            this.options.withMetadataOrientation = e.orientation;
          } else {
            throw pn.invalidParameterError("orientation", "integer between 1 and 8", e.orientation);
          }
        }
        if (pn.defined(e.density)) {
          if (pn.number(e.density) && e.density > 0) {
            this.options.withMetadataDensity = e.density;
          } else {
            throw pn.invalidParameterError("density", "positive number", e.density);
          }
        }
        if (pn.defined(e.icc)) {
          this.withIccProfile(e.icc);
        }
        if (pn.defined(e.exif)) {
          this.withExifMerge(e.exif);
        }
      }
      return this;
    }
    function inp(e, t) {
      let n = hXi.get((pn.object(e) && pn.string(e.id) ? e.id : e).toLowerCase());
      if (!n) {
        throw pn.invalidParameterError("format", `one of: ${[...hXi.keys()].join(", ")}`, e);
      }
      return this[n](t);
    }
    function anp(e) {
      if (pn.object(e)) {
        if (pn.defined(e.quality)) {
          if (pn.integer(e.quality) && pn.inRange(e.quality, 1, 100)) {
            this.options.jpegQuality = e.quality;
          } else {
            throw pn.invalidParameterError("quality", "integer between 1 and 100", e.quality);
          }
        }
        if (pn.defined(e.progressive)) {
          this._setBooleanOption("jpegProgressive", e.progressive);
        }
        if (pn.defined(e.chromaSubsampling)) {
          if (pn.string(e.chromaSubsampling) && pn.inArray(e.chromaSubsampling, ["4:2:0", "4:4:4"])) {
            this.options.jpegChromaSubsampling = e.chromaSubsampling;
          } else {
            throw pn.invalidParameterError("chromaSubsampling", "one of: 4:2:0, 4:4:4", e.chromaSubsampling);
          }
        }
        let t = pn.bool(e.optimizeCoding) ? e.optimizeCoding : e.optimiseCoding;
        if (pn.defined(t)) {
          this._setBooleanOption("jpegOptimiseCoding", t);
        }
        if (pn.defined(e.mozjpeg)) {
          if (pn.bool(e.mozjpeg)) {
            if (e.mozjpeg) {
              this.options.jpegTrellisQuantisation = true;
              this.options.jpegOvershootDeringing = true;
              this.options.jpegOptimiseScans = true;
              this.options.jpegProgressive = true;
              this.options.jpegQuantisationTable = 3;
            }
          } else {
            throw pn.invalidParameterError("mozjpeg", "boolean", e.mozjpeg);
          }
        }
        let n = pn.bool(e.trellisQuantization) ? e.trellisQuantization : e.trellisQuantisation;
        if (pn.defined(n)) {
          this._setBooleanOption("jpegTrellisQuantisation", n);
        }
        if (pn.defined(e.overshootDeringing)) {
          this._setBooleanOption("jpegOvershootDeringing", e.overshootDeringing);
        }
        let r = pn.bool(e.optimizeScans) ? e.optimizeScans : e.optimiseScans;
        if (pn.defined(r)) {
          if (this._setBooleanOption("jpegOptimiseScans", r), r) {
            this.options.jpegProgressive = true;
          }
        }
        let o = pn.number(e.quantizationTable) ? e.quantizationTable : e.quantisationTable;
        if (pn.defined(o)) {
          if (pn.integer(o) && pn.inRange(o, 0, 8)) {
            this.options.jpegQuantisationTable = o;
          } else {
            throw pn.invalidParameterError("quantisationTable", "integer between 0 and 8", o);
          }
        }
      }
      return this._updateFormatOut("jpeg", e);
    }
    function lnp(e) {
      if (pn.object(e)) {
        if (pn.defined(e.progressive)) {
          this._setBooleanOption("pngProgressive", e.progressive);
        }
        if (pn.defined(e.compressionLevel)) {
          if (pn.integer(e.compressionLevel) && pn.inRange(e.compressionLevel, 0, 9)) {
            this.options.pngCompressionLevel = e.compressionLevel;
          } else {
            throw pn.invalidParameterError("compressionLevel", "integer between 0 and 9", e.compressionLevel);
          }
        }
        if (pn.defined(e.adaptiveFiltering)) {
          this._setBooleanOption("pngAdaptiveFiltering", e.adaptiveFiltering);
        }
        let t = e.colours || e.colors;
        if (pn.defined(t)) {
          if (pn.integer(t) && pn.inRange(t, 2, 256)) {
            this.options.pngBitdepth = yXi(t);
          } else {
            throw pn.invalidParameterError("colours", "integer between 2 and 256", t);
          }
        }
        if (pn.defined(e.palette)) {
          this._setBooleanOption("pngPalette", e.palette);
        } else if ([e.quality, e.effort, e.colours, e.colors, e.dither].some(pn.defined)) {
          this._setBooleanOption("pngPalette", true);
        }
        if (this.options.pngPalette) {
          if (pn.defined(e.quality)) {
            if (pn.integer(e.quality) && pn.inRange(e.quality, 0, 100)) {
              this.options.pngQuality = e.quality;
            } else {
              throw pn.invalidParameterError("quality", "integer between 0 and 100", e.quality);
            }
          }
          if (pn.defined(e.effort)) {
            if (pn.integer(e.effort) && pn.inRange(e.effort, 1, 10)) {
              this.options.pngEffort = e.effort;
            } else {
              throw pn.invalidParameterError("effort", "integer between 1 and 10", e.effort);
            }
          }
          if (pn.defined(e.dither)) {
            if (pn.number(e.dither) && pn.inRange(e.dither, 0, 1)) {
              this.options.pngDither = e.dither;
            } else {
              throw pn.invalidParameterError("dither", "number between 0.0 and 1.0", e.dither);
            }
          }
        }
      }
      return this._updateFormatOut("png", e);
    }
    function cnp(e) {
      if (pn.object(e)) {
        if (pn.defined(e.quality)) {
          if (pn.integer(e.quality) && pn.inRange(e.quality, 1, 100)) {
            this.options.webpQuality = e.quality;
          } else {
            throw pn.invalidParameterError("quality", "integer between 1 and 100", e.quality);
          }
        }
        if (pn.defined(e.alphaQuality)) {
          if (pn.integer(e.alphaQuality) && pn.inRange(e.alphaQuality, 0, 100)) {
            this.options.webpAlphaQuality = e.alphaQuality;
          } else {
            throw pn.invalidParameterError("alphaQuality", "integer between 0 and 100", e.alphaQuality);
          }
        }
        if (pn.defined(e.lossless)) {
          this._setBooleanOption("webpLossless", e.lossless);
        }
        if (pn.defined(e.nearLossless)) {
          this._setBooleanOption("webpNearLossless", e.nearLossless);
        }
        if (pn.defined(e.smartSubsample)) {
          this._setBooleanOption("webpSmartSubsample", e.smartSubsample);
        }
        if (pn.defined(e.smartDeblock)) {
          this._setBooleanOption("webpSmartDeblock", e.smartDeblock);
        }
        if (pn.defined(e.preset)) {
          if (pn.string(e.preset) && pn.inArray(e.preset, ["default", "photo", "picture", "drawing", "icon", "text"])) {
            this.options.webpPreset = e.preset;
          } else {
            throw pn.invalidParameterError("preset", "one of: default, photo, picture, drawing, icon, text", e.preset);
          }
        }
        if (pn.defined(e.effort)) {
          if (pn.integer(e.effort) && pn.inRange(e.effort, 0, 6)) {
            this.options.webpEffort = e.effort;
          } else {
            throw pn.invalidParameterError("effort", "integer between 0 and 6", e.effort);
          }
        }
        if (pn.defined(e.minSize)) {
          this._setBooleanOption("webpMinSize", e.minSize);
        }
        if (pn.defined(e.mixed)) {
          this._setBooleanOption("webpMixed", e.mixed);
        }
      }
      Hro(e, this.options);
      return this._updateFormatOut("webp", e);
    }
    function unp(e) {
      if (pn.object(e)) {
        if (pn.defined(e.reuse)) {
          this._setBooleanOption("gifReuse", e.reuse);
        }
        if (pn.defined(e.progressive)) {
          this._setBooleanOption("gifProgressive", e.progressive);
        }
        let t = e.colours || e.colors;
        if (pn.defined(t)) {
          if (pn.integer(t) && pn.inRange(t, 2, 256)) {
            this.options.gifBitdepth = yXi(t);
          } else {
            throw pn.invalidParameterError("colours", "integer between 2 and 256", t);
          }
        }
        if (pn.defined(e.effort)) {
          if (pn.number(e.effort) && pn.inRange(e.effort, 1, 10)) {
            this.options.gifEffort = e.effort;
          } else {
            throw pn.invalidParameterError("effort", "integer between 1 and 10", e.effort);
          }
        }
        if (pn.defined(e.dither)) {
          if (pn.number(e.dither) && pn.inRange(e.dither, 0, 1)) {
            this.options.gifDither = e.dither;
          } else {
            throw pn.invalidParameterError("dither", "number between 0.0 and 1.0", e.dither);
          }
        }
        if (pn.defined(e.interFrameMaxError)) {
          if (pn.number(e.interFrameMaxError) && pn.inRange(e.interFrameMaxError, 0, 32)) {
            this.options.gifInterFrameMaxError = e.interFrameMaxError;
          } else {
            throw pn.invalidParameterError("interFrameMaxError", "number between 0.0 and 32.0", e.interFrameMaxError);
          }
        }
        if (pn.defined(e.interPaletteMaxError)) {
          if (pn.number(e.interPaletteMaxError) && pn.inRange(e.interPaletteMaxError, 0, 256)) {
            this.options.gifInterPaletteMaxError = e.interPaletteMaxError;
          } else {
            throw pn.invalidParameterError("interPaletteMaxError", "number between 0.0 and 256.0", e.interPaletteMaxError);
          }
        }
        if (pn.defined(e.keepDuplicateFrames)) {
          if (pn.bool(e.keepDuplicateFrames)) {
            this._setBooleanOption("gifKeepDuplicateFrames", e.keepDuplicateFrames);
          } else {
            throw pn.invalidParameterError("keepDuplicateFrames", "boolean", e.keepDuplicateFrames);
          }
        }
      }
      Hro(e, this.options);
      return this._updateFormatOut("gif", e);
    }
    function dnp(e) {
      if (!this.constructor.format.jp2k.output.buffer) {
        throw gXi();
      }
      if (pn.object(e)) {
        if (pn.defined(e.quality)) {
          if (pn.integer(e.quality) && pn.inRange(e.quality, 1, 100)) {
            this.options.jp2Quality = e.quality;
          } else {
            throw pn.invalidParameterError("quality", "integer between 1 and 100", e.quality);
          }
        }
        if (pn.defined(e.lossless)) {
          if (pn.bool(e.lossless)) {
            this.options.jp2Lossless = e.lossless;
          } else {
            throw pn.invalidParameterError("lossless", "boolean", e.lossless);
          }
        }
        if (pn.defined(e.tileWidth)) {
          if (pn.integer(e.tileWidth) && pn.inRange(e.tileWidth, 1, 32768)) {
            this.options.jp2TileWidth = e.tileWidth;
          } else {
            throw pn.invalidParameterError("tileWidth", "integer between 1 and 32768", e.tileWidth);
          }
        }
        if (pn.defined(e.tileHeight)) {
          if (pn.integer(e.tileHeight) && pn.inRange(e.tileHeight, 1, 32768)) {
            this.options.jp2TileHeight = e.tileHeight;
          } else {
            throw pn.invalidParameterError("tileHeight", "integer between 1 and 32768", e.tileHeight);
          }
        }
        if (pn.defined(e.chromaSubsampling)) {
          if (pn.string(e.chromaSubsampling) && pn.inArray(e.chromaSubsampling, ["4:2:0", "4:4:4"])) {
            this.options.jp2ChromaSubsampling = e.chromaSubsampling;
          } else {
            throw pn.invalidParameterError("chromaSubsampling", "one of: 4:2:0, 4:4:4", e.chromaSubsampling);
          }
        }
      }
      return this._updateFormatOut("jp2", e);
    }
    function Hro(e, t) {
      if (pn.object(e) && pn.defined(e.loop)) {
        if (pn.integer(e.loop) && pn.inRange(e.loop, 0, 65535)) {
          t.loop = e.loop;
        } else {
          throw pn.invalidParameterError("loop", "integer between 0 and 65535", e.loop);
        }
      }
      if (pn.object(e) && pn.defined(e.delay)) {
        if (pn.integer(e.delay) && pn.inRange(e.delay, 0, 65535)) {
          t.delay = [e.delay];
        } else if (Array.isArray(e.delay) && e.delay.every(pn.integer) && e.delay.every(n => pn.inRange(n, 0, 65535))) {
          t.delay = e.delay;
        } else {
          throw pn.invalidParameterError("delay", "integer or an array of integers between 0 and 65535", e.delay);
        }
      }
    }
    function pnp(e) {
      if (pn.object(e)) {
        if (pn.defined(e.quality)) {
          if (pn.integer(e.quality) && pn.inRange(e.quality, 1, 100)) {
            this.options.tiffQuality = e.quality;
          } else {
            throw pn.invalidParameterError("quality", "integer between 1 and 100", e.quality);
          }
        }
        if (pn.defined(e.bitdepth)) {
          if (pn.integer(e.bitdepth) && pn.inArray(e.bitdepth, [1, 2, 4, 8])) {
            this.options.tiffBitdepth = e.bitdepth;
          } else {
            throw pn.invalidParameterError("bitdepth", "1, 2, 4 or 8", e.bitdepth);
          }
        }
        if (pn.defined(e.tile)) {
          this._setBooleanOption("tiffTile", e.tile);
        }
        if (pn.defined(e.tileWidth)) {
          if (pn.integer(e.tileWidth) && e.tileWidth > 0) {
            this.options.tiffTileWidth = e.tileWidth;
          } else {
            throw pn.invalidParameterError("tileWidth", "integer greater than zero", e.tileWidth);
          }
        }
        if (pn.defined(e.tileHeight)) {
          if (pn.integer(e.tileHeight) && e.tileHeight > 0) {
            this.options.tiffTileHeight = e.tileHeight;
          } else {
            throw pn.invalidParameterError("tileHeight", "integer greater than zero", e.tileHeight);
          }
        }
        if (pn.defined(e.miniswhite)) {
          this._setBooleanOption("tiffMiniswhite", e.miniswhite);
        }
        if (pn.defined(e.pyramid)) {
          this._setBooleanOption("tiffPyramid", e.pyramid);
        }
        if (pn.defined(e.xres)) {
          if (pn.number(e.xres) && e.xres > 0) {
            this.options.tiffXres = e.xres;
          } else {
            throw pn.invalidParameterError("xres", "number greater than zero", e.xres);
          }
        }
        if (pn.defined(e.yres)) {
          if (pn.number(e.yres) && e.yres > 0) {
            this.options.tiffYres = e.yres;
          } else {
            throw pn.invalidParameterError("yres", "number greater than zero", e.yres);
          }
        }
        if (pn.defined(e.compression)) {
          if (pn.string(e.compression) && pn.inArray(e.compression, ["none", "jpeg", "deflate", "packbits", "ccittfax4", "lzw", "webp", "zstd", "jp2k"])) {
            this.options.tiffCompression = e.compression;
          } else {
            throw pn.invalidParameterError("compression", "one of: none, jpeg, deflate, packbits, ccittfax4, lzw, webp, zstd, jp2k", e.compression);
          }
        }
        if (pn.defined(e.bigtiff)) {
          this._setBooleanOption("tiffBigtiff", e.bigtiff);
        }
        if (pn.defined(e.predictor)) {
          if (pn.string(e.predictor) && pn.inArray(e.predictor, ["none", "horizontal", "float"])) {
            this.options.tiffPredictor = e.predictor;
          } else {
            throw pn.invalidParameterError("predictor", "one of: none, horizontal, float", e.predictor);
          }
        }
        if (pn.defined(e.resolutionUnit)) {
          if (pn.string(e.resolutionUnit) && pn.inArray(e.resolutionUnit, ["inch", "cm"])) {
            this.options.tiffResolutionUnit = e.resolutionUnit;
          } else {
            throw pn.invalidParameterError("resolutionUnit", "one of: inch, cm", e.resolutionUnit);
          }
        }
      }
      return this._updateFormatOut("tiff", e);
    }
    function mnp(e) {
      return this.heif({
        ...e,
        compression: "av1"
      });
    }
    function fnp(e) {
      if (pn.object(e)) {
        if (pn.string(e.compression) && pn.inArray(e.compression, ["av1", "hevc"])) {
          this.options.heifCompression = e.compression;
        } else {
          throw pn.invalidParameterError("compression", "one of: av1, hevc", e.compression);
        }
        if (pn.defined(e.quality)) {
          if (pn.integer(e.quality) && pn.inRange(e.quality, 1, 100)) {
            this.options.heifQuality = e.quality;
          } else {
            throw pn.invalidParameterError("quality", "integer between 1 and 100", e.quality);
          }
        }
        if (pn.defined(e.lossless)) {
          if (pn.bool(e.lossless)) {
            this.options.heifLossless = e.lossless;
          } else {
            throw pn.invalidParameterError("lossless", "boolean", e.lossless);
          }
        }
        if (pn.defined(e.effort)) {
          if (pn.integer(e.effort) && pn.inRange(e.effort, 0, 9)) {
            this.options.heifEffort = e.effort;
          } else {
            throw pn.invalidParameterError("effort", "integer between 0 and 9", e.effort);
          }
        }
        if (pn.defined(e.chromaSubsampling)) {
          if (pn.string(e.chromaSubsampling) && pn.inArray(e.chromaSubsampling, ["4:2:0", "4:4:4"])) {
            this.options.heifChromaSubsampling = e.chromaSubsampling;
          } else {
            throw pn.invalidParameterError("chromaSubsampling", "one of: 4:2:0, 4:4:4", e.chromaSubsampling);
          }
        }
        if (pn.defined(e.bitdepth)) {
          if (pn.integer(e.bitdepth) && pn.inArray(e.bitdepth, [8, 10, 12])) {
            if (e.bitdepth !== 8 && this.constructor.versions.heif) {
              throw pn.invalidParameterError("bitdepth when using prebuilt binaries", 8, e.bitdepth);
            }
            this.options.heifBitdepth = e.bitdepth;
          } else {
            throw pn.invalidParameterError("bitdepth", "8, 10 or 12", e.bitdepth);
          }
        }
      } else {
        throw pn.invalidParameterError("options", "Object", e);
      }
      return this._updateFormatOut("heif", e);
    }
    function hnp(e) {
      if (pn.object(e)) {
        if (pn.defined(e.quality)) {
          if (pn.integer(e.quality) && pn.inRange(e.quality, 1, 100)) {
            this.options.jxlDistance = e.quality >= 30 ? 0.1 + (100 - e.quality) * 0.09 : 0.017666666666666667 * e.quality * e.quality - 1.15 * e.quality + 25;
          } else {
            throw pn.invalidParameterError("quality", "integer between 1 and 100", e.quality);
          }
        } else if (pn.defined(e.distance)) {
          if (pn.number(e.distance) && pn.inRange(e.distance, 0, 15)) {
            this.options.jxlDistance = e.distance;
          } else {
            throw pn.invalidParameterError("distance", "number between 0.0 and 15.0", e.distance);
          }
        }
        if (pn.defined(e.decodingTier)) {
          if (pn.integer(e.decodingTier) && pn.inRange(e.decodingTier, 0, 4)) {
            this.options.jxlDecodingTier = e.decodingTier;
          } else {
            throw pn.invalidParameterError("decodingTier", "integer between 0 and 4", e.decodingTier);
          }
        }
        if (pn.defined(e.lossless)) {
          if (pn.bool(e.lossless)) {
            this.options.jxlLossless = e.lossless;
          } else {
            throw pn.invalidParameterError("lossless", "boolean", e.lossless);
          }
        }
        if (pn.defined(e.effort)) {
          if (pn.integer(e.effort) && pn.inRange(e.effort, 1, 9)) {
            this.options.jxlEffort = e.effort;
          } else {
            throw pn.invalidParameterError("effort", "integer between 1 and 9", e.effort);
          }
        }
      }
      Hro(e, this.options);
      return this._updateFormatOut("jxl", e);
    }
    function gnp(e) {
      if (pn.object(e)) {
        if (pn.defined(e.depth)) {
          if (pn.string(e.depth) && pn.inArray(e.depth, ["char", "uchar", "short", "ushort", "int", "uint", "float", "complex", "double", "dpcomplex"])) {
            this.options.rawDepth = e.depth;
          } else {
            throw pn.invalidParameterError("depth", "one of: char, uchar, short, ushort, int, uint, float, complex, double, dpcomplex", e.depth);
          }
        }
      }
      return this._updateFormatOut("raw");
    }
    function ynp(e) {
      if (pn.object(e)) {
        if (pn.defined(e.size)) {
          if (pn.integer(e.size) && pn.inRange(e.size, 1, 8192)) {
            this.options.tileSize = e.size;
          } else {
            throw pn.invalidParameterError("size", "integer between 1 and 8192", e.size);
          }
        }
        if (pn.defined(e.overlap)) {
          if (pn.integer(e.overlap) && pn.inRange(e.overlap, 0, 8192)) {
            if (e.overlap > this.options.tileSize) {
              throw pn.invalidParameterError("overlap", `<= size (${this.options.tileSize})`, e.overlap);
            }
            this.options.tileOverlap = e.overlap;
          } else {
            throw pn.invalidParameterError("overlap", "integer between 0 and 8192", e.overlap);
          }
        }
        if (pn.defined(e.container)) {
          if (pn.string(e.container) && pn.inArray(e.container, ["fs", "zip"])) {
            this.options.tileContainer = e.container;
          } else {
            throw pn.invalidParameterError("container", "one of: fs, zip", e.container);
          }
        }
        if (pn.defined(e.layout)) {
          if (pn.string(e.layout) && pn.inArray(e.layout, ["dz", "google", "iiif", "iiif3", "zoomify"])) {
            this.options.tileLayout = e.layout;
          } else {
            throw pn.invalidParameterError("layout", "one of: dz, google, iiif, iiif3, zoomify", e.layout);
          }
        }
        if (pn.defined(e.angle)) {
          if (pn.integer(e.angle) && !(e.angle % 90)) {
            this.options.tileAngle = e.angle;
          } else {
            throw pn.invalidParameterError("angle", "positive/negative multiple of 90", e.angle);
          }
        }
        if (this._setBackgroundColourOption("tileBackground", e.background), pn.defined(e.depth)) {
          if (pn.string(e.depth) && pn.inArray(e.depth, ["onepixel", "onetile", "one"])) {
            this.options.tileDepth = e.depth;
          } else {
            throw pn.invalidParameterError("depth", "one of: onepixel, onetile, one", e.depth);
          }
        }
        if (pn.defined(e.skipBlanks)) {
          if (pn.integer(e.skipBlanks) && pn.inRange(e.skipBlanks, -1, 65535)) {
            this.options.tileSkipBlanks = e.skipBlanks;
          } else {
            throw pn.invalidParameterError("skipBlanks", "integer between -1 and 255/65535", e.skipBlanks);
          }
        } else if (pn.defined(e.layout) && e.layout === "google") {
          this.options.tileSkipBlanks = 5;
        }
        let t = pn.bool(e.center) ? e.center : e.centre;
        if (pn.defined(t)) {
          this._setBooleanOption("tileCentre", t);
        }
        if (pn.defined(e.id)) {
          if (pn.string(e.id)) {
            this.options.tileId = e.id;
          } else {
            throw pn.invalidParameterError("id", "string", e.id);
          }
        }
        if (pn.defined(e.basename)) {
          if (pn.string(e.basename)) {
            this.options.tileBasename = e.basename;
          } else {
            throw pn.invalidParameterError("basename", "string", e.basename);
          }
        }
      }
      if (pn.inArray(this.options.formatOut, ["jpeg", "png", "webp"])) {
        this.options.tileFormat = this.options.formatOut;
      } else if (this.options.formatOut !== "input") {
        throw pn.invalidParameterError("format", "one of: jpeg, png, webp", this.options.formatOut);
      }
      return this._updateFormatOut("dz");
    }
    function _np(e) {
      if (!pn.plainObject(e)) {
        throw pn.invalidParameterError("options", "object", e);
      }
      if (pn.integer(e.seconds) && pn.inRange(e.seconds, 0, 3600)) {
        this.options.timeoutSeconds = e.seconds;
      } else {
        throw pn.invalidParameterError("seconds", "integer between 0 and 3600", e.seconds);
      }
      return this;
    }
    function bnp(e, t) {
      if (!(pn.object(t) && t.force === false)) {
        this.options.formatOut = e;
      }
      return this;
    }
    function Snp(e, t) {
      if (pn.bool(t)) {
        this.options[e] = t;
      } else {
        throw pn.invalidParameterError(e, "boolean", t);
      }
    }
    function Tnp() {
      if (!this.options.streamOut) {
        this.options.streamOut = true;
        let e = Error();
        this._pipeline(undefined, e);
      }
    }
    function Enp(e, t) {
      if (typeof e === "function") {
        if (this._isStreamInput()) {
          this.on("finish", () => {
            this._flattenBufferIn();
            zct.pipeline(this.options, (n, r, o) => {
              if (n) {
                e(pn.nativeError(n, t));
              } else {
                e(null, r, o);
              }
            });
          });
        } else {
          zct.pipeline(this.options, (n, r, o) => {
            if (n) {
              e(pn.nativeError(n, t));
            } else {
              e(null, r, o);
            }
          });
        }
        return this;
      } else if (this.options.streamOut) {
        if (this._isStreamInput()) {
          if (this.once("finish", () => {
            this._flattenBufferIn();
            zct.pipeline(this.options, (n, r, o) => {
              if (n) {
                this.emit("error", pn.nativeError(n, t));
              } else {
                this.emit("info", o);
                this.push(r);
              }
              this.push(null);
              this.on("end", () => this.emit("close"));
            });
          }), this.streamInFinished) {
            this.emit("finish");
          }
        } else {
          zct.pipeline(this.options, (n, r, o) => {
            if (n) {
              this.emit("error", pn.nativeError(n, t));
            } else {
              this.emit("info", o);
              this.push(r);
            }
            this.push(null);
            this.on("end", () => this.emit("close"));
          });
        }
        return this;
      } else if (this._isStreamInput()) {
        return new Promise((n, r) => {
          this.once("finish", () => {
            this._flattenBufferIn();
            zct.pipeline(this.options, (o, s, i) => {
              if (o) {
                r(pn.nativeError(o, t));
              } else if (this.options.resolveWithObject) {
                n({
                  data: s,
                  info: i
                });
              } else {
                n(s);
              }
            });
          });
        });
      } else {
        return new Promise((n, r) => {
          zct.pipeline(this.options, (o, s, i) => {
            if (o) {
              r(pn.nativeError(o, t));
            } else if (this.options.resolveWithObject) {
              n({
                data: s,
                info: i
              });
            } else {
              n(s);
            }
          });
        });
      }
    }
    _Xi.exports = e => {
      Object.assign(e.prototype, {
        toFile: Ytp,
        toBuffer: Jtp,
        keepExif: Xtp,
        withExif: Qtp,
        withExifMerge: Ztp,
        keepIccProfile: enp,
        withIccProfile: tnp,
        keepXmp: nnp,
        withXmp: rnp,
        keepMetadata: onp,
        withMetadata: snp,
        toFormat: inp,
        jpeg: anp,
        jp2: dnp,
        png: lnp,
        webp: cnp,
        tiff: pnp,
        avif: mnp,
        heif: fnp,
        jxl: hnp,
        gif: unp,
        raw: gnp,
        tile: ynp,
        timeout: _np,
        _updateFormatOut: bnp,
        _setBooleanOption: Snp,
        _read: Tnp,
        _pipeline: Enp
      });
    };
  });
  var vXi = __commonJS((TTy, EXi) => {
    /*!
    Copyright 2013 Lovell Fuller and others.
    SPDX-License-Identifier: Apache-2.0
    */
    var vnp = require("events");
    var tLn = q1n();
    var eX = Sue();
    var {
      runtimePlatformArch: wnp
    } = Iro();
    var hq = fjt();
    var SXi = wnp();
    var jro = hq.libvipsVersion();
    var qPe = hq.format();
    qPe.heif.output.alias = ["avif", "heic"];
    qPe.jpeg.output.alias = ["jpe", "jpg"];
    qPe.tiff.output.alias = ["tif"];
    qPe.jp2k.output.alias = ["j2c", "j2k", "jp2", "jpx"];
    var Cnp = {
      nearest: "nearest",
      bilinear: "bilinear",
      bicubic: "bicubic",
      locallyBoundedBicubic: "lbb",
      nohalo: "nohalo",
      vertexSplitQuadraticBasisSpline: "vsqbs"
    };
    var Kct = {
      vips: jro.semver
    };
    if (!jro.isGlobal) {
      if (!jro.isWasm) {
        try {
          Kct = require(`@img/sharp-${SXi}/versions`);
        } catch (e) {
          try {
            Kct = require(`@img/sharp-libvips-${SXi}/versions`);
          } catch (t) {}
        }
      } else {
        try {
          Kct = (() => {
            throw new Error("Cannot require module " + "@img/sharp-wasm32/versions");
          })();
        } catch (e) {}
      }
    }
    Kct.sharp = Rro().version;
    if (Kct.heif && qPe.heif) {
      qPe.heif.input.fileSuffix = [".avif"];
      qPe.heif.output.alias = ["avif"];
    }
    function TXi(e) {
      if (eX.bool(e)) {
        if (e) {
          return hq.cache(50, 20, 100);
        } else {
          return hq.cache(0, 0, 0);
        }
      } else if (eX.object(e)) {
        return hq.cache(e.memory, e.files, e.items);
      } else {
        return hq.cache();
      }
    }
    TXi(true);
    function Rnp(e) {
      return hq.concurrency(eX.integer(e) ? e : null);
    }
    if (tLn.familySync() === tLn.GLIBC && !hq._isUsingJemalloc()) {
      hq.concurrency(1);
    } else if (tLn.familySync() === tLn.MUSL && hq.concurrency() === 1024) {
      hq.concurrency(require("os").availableParallelism());
    }
    var xnp = new vnp.EventEmitter();
    function knp() {
      return hq.counters();
    }
    function Anp(e) {
      return hq.simd(eX.bool(e) ? e : null);
    }
    function Inp(e) {
      if (eX.object(e)) {
        if (Array.isArray(e.operation) && e.operation.every(eX.string)) {
          hq.block(e.operation, true);
        } else {
          throw eX.invalidParameterError("operation", "Array<string>", e.operation);
        }
      } else {
        throw eX.invalidParameterError("options", "object", e);
      }
    }
    function Pnp(e) {
      if (eX.object(e)) {
        if (Array.isArray(e.operation) && e.operation.every(eX.string)) {
          hq.block(e.operation, false);
        } else {
          throw eX.invalidParameterError("operation", "Array<string>", e.operation);
        }
      } else {
        throw eX.invalidParameterError("options", "object", e);
      }
    }
    EXi.exports = e => {
      e.cache = TXi;
      e.concurrency = Rnp;
      e.counters = knp;
      e.simd = Anp;
      e.format = qPe;
      e.interpolators = Cnp;
      e.versions = Kct;
      e.queue = xnp;
      e.block = Inp;
      e.unblock = Pnp;
    };
  });
  var CXi = __commonJS((ETy, wXi) => {
    /*!
    Copyright 2013 Lovell Fuller and others.
    SPDX-License-Identifier: Apache-2.0
    */
    var gSe = UJi();
    HJi()(gSe);
    zJi()(gSe);
    YJi()(gSe);
    eXi()(gSe);
    pXi()(gSe);
    fXi()(gSe);
    bXi()(gSe);
    vXi()(gSe);
    wXi.exports = gSe;
  });