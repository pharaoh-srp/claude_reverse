  __export(hAt, {
    default: () => Keu
  });
  var pls;
  var uls;
  var Veu;
  var dls;
  var zeu;
  var Keu;
  function Xeu(e, t) {
    var n = typeof e;
    t = t == null ? 9007199254740991 : t;
    return !!t && (n == "number" || n != "symbol" && Jeu.test(e)) && e > -1 && e % 1 == 0 && e < t;
  }
  var Jeu;
  function Zeu(e) {
    return typeof e == "number" && e > -1 && e % 1 == 0 && e <= 9007199254740991;
  }
  function wtu(e) {
    return Beu(e) && Zeu(e.length) && !!aC[hZc(e)];
  }
  var aC;
  function Ctu(e) {
    return function (t) {
      return e(t);
    };
  }
  var _At = {};
  __export(_At, {
    default: () => xtu
  });
  var hls;
  var bAt;
  var Rtu;
  var fEr;
  var xtu;
  var gls;
  var ktu;
  function Ptu(e, t) {
    var n = Peu(e);
    var r = !n && Weu(e);
    var o = !n && !r && Keu(e);
    var s = !n && !r && !o && ktu(e);
    var i = n || r || o || s;
    var a = i ? Ueu(e.length, String) : [];
    var l = a.length;
    for (var c in e) {
      if ((t || Itu.call(e, c)) && !(i && (c == "length" || o && (c == "offset" || c == "parent") || s && (c == "buffer" || c == "byteLength" || c == "byteOffset") || Xeu(c, l)))) {
        a.push(c);
      }
    }
    return a;
  }
  var Atu;
  var Itu;
  function Dtu(e) {
    var t = e && e.constructor;
    var n = typeof t == "function" && t.prototype || Otu;
    return e === n;
  }
  var Otu;
  function Mtu(e, t) {
    return function (n) {
      return e(t(n));
    };
  }
  var Ntu;
  function Utu(e) {
    if (!Dtu(e)) {
      return Ntu(e);
    }
    var t = [];
    for (var n in Object(e)) {
      if (Ftu.call(e, n) && n != "constructor") {
        t.push(n);
      }
    }
    return t;
  }
  var Ltu;
  var Ftu;
  function Btu(e) {
    return e != null && Zeu(e.length) && !TZc(e);
  }
  function $tu(e) {
    return Btu(e) ? Ptu(e) : Utu(e);
  }
  function Htu(e) {
    return Oeu(e, $tu, Feu);
  }
  function Gtu(e, t, n, r, o, s) {
    var i = n & 1;
    var a = Htu(e);
    var l = a.length;
    var c = Htu(t);
    var u = c.length;
    if (l != u && !i) {
      return false;
    }
    var d = l;
    while (d--) {
      var p = a[d];
      if (!(i ? p in t : Wtu.call(t, p))) {
        return false;
      }
    }
    var m = s.get(e);
    var f = s.get(t);
    if (m && f) {
      return m == t && f == e;
    }
    var h = true;
    s.set(e, t);
    s.set(t, e);
    var g = i;
    while (++d < l) {
      p = a[d];
      var y = e[p];
      var _ = t[p];
      if (r) {
        var b = i ? r(_, y, p, t, e, s) : r(y, _, p, e, t, s);
      }
      if (!(b === undefined ? y === _ || o(y, _, n, r, s) : b)) {
        h = false;
        break;
      }
      g || (g = p == "constructor");
    }
    if (h && !g) {
      var S = e.constructor;
      var E = t.constructor;
      if (S != E && "constructor" in e && "constructor" in t && !(typeof S == "function" && S instanceof S && typeof E == "function" && E instanceof E)) {
        h = false;
      }
    }
    s.delete(e);
    s.delete(t);
    return h;
  }
  var qtu;
  var Wtu;
  var Vtu;
  var ztu;
  var Ktu;
  var Ytu;
  var Xtu;
  var Qtu;
  var Ztu;
  var enu;
  var tnu;
  function onu(e, t, n, r, o, s) {
    var i = Peu(e);
    var a = Peu(t);
    var l = i ? "[object Array]" : t$e(e);
    var c = a ? "[object Array]" : t$e(t);
    l = l == "[object Arguments]" ? "[object Object]" : l;
    c = c == "[object Arguments]" ? "[object Object]" : c;
    var u = l == "[object Object]";
    var d = c == "[object Object]";
    var p = l == c;
    if (p && Keu(e)) {
      if (!Keu(t)) {
        return false;
      }
      i = true;
      u = false;
    }
    if (p && !u) {
      s || (s = new WQe());
      return i || ktu(e) ? peu(e, t, n, r, o, s) : Aeu(e, t, l, n, r, o, s);
    }
    if (!(n & 1)) {
      var m = u && Dls.call(e, "__wrapped__");
      var f = d && Dls.call(t, "__wrapped__");
      if (m || f) {
        var h = m ? e.value() : e;
        var g = f ? t.value() : t;
        s || (s = new WQe());
        return o(h, g, n, r, s);
      }
    }
    if (!p) {
      return false;
    }
    s || (s = new WQe());
    return Gtu(e, t, n, r, o, s);
  }
  var rnu;
  var Dls;
  function Lls(e, t, n, r, o) {
    if (e === t) {
      return true;
    }
    if (e == null || t == null || !Beu(e) && !Beu(t)) {
      return e !== e && t !== t;
    }
    return onu(e, t, n, r, Lls, o);
  }
  function anu(e, t, n, r) {
    var o = n.length;
    var s = o;
    var i = !r;
    if (e == null) {
      return !s;
    }
    e = Object(e);
    while (o--) {
      var a = n[o];
      if (i && a[2] ? a[1] !== e[a[0]] : !(a[0] in e)) {
        return false;
      }
    }
    while (++o < s) {
      a = n[o];
      var l = a[0];
      var c = e[l];
      var u = a[1];
      if (i && a[2]) {
        if (c === undefined && !(l in e)) {
          return false;
        }
      } else {
        var d = new WQe();
        if (r) {
          var p = r(c, u, l, e, t, d);
        }
        if (!(p === undefined ? Lls(u, c, 1 | 2, r, d) : p)) {
          return false;
        }
      }
    }
    return true;
  }
  function lnu(e) {
    return e === e && !gZc(e);
  }
  function cnu(e) {
    var t = $tu(e);
    var n = t.length;
    while (n--) {
      var r = t[n];
      var o = e[r];
      t[n] = [r, o, lnu(o)];
    }
    return t;
  }
  function unu(e, t) {
    return function (n) {
      if (n == null) {
        return false;
      }
      return n[e] === t && (t !== undefined || e in Object(n));
    };
  }
  function dnu(e) {
    var t = cnu(e);
    if (t.length == 1 && t[0][2]) {
      return unu(t[0][0], t[0][1]);
    }
    return function (n) {
      return n === e || anu(n, e, t);
    };
  }
  function mnu(e) {
    return typeof e == "symbol" || Beu(e) && hZc(e) == "[object Symbol]";
  }
  function gnu(e, t) {
    if (Peu(e)) {
      return false;
    }
    var n = typeof e;
    if (n == "number" || n == "symbol" || n == "boolean" || e == null || mnu(e)) {
      return true;
    }
    return hnu.test(e) || !fnu.test(e) || t != null && e in Object(t);
  }
  var fnu;
  var hnu;
  function TEr(e, t) {
    if (typeof e != "function" || t != null && typeof t != "function") {
      throw TypeError("Expected a function");
    }
    var n = function () {
      var r = arguments;
      var o = t ? t.apply(this, r) : r[0];
      var s = n.cache;
      if (s.vZc(o)) {
        return s.get(o);
      }
      var i = e.apply(this, r);
      n.cache = s.set(o, i) || s;
      return i;
    };
    n.cache = new (TEr.Cache || qQe)();
    return n;
  }
  function bnu(e) {
    var t = TEr(e, function (r) {
      if (n.size === 500) {
        n.clear();
      }
      return r;
    });
    var n = t.cache;
    return t;
  }
  var Snu;
  var Tnu;
  var Enu;
  function vnu(e, t) {
    var n = -1;
    var r = e == null ? 0 : e.length;
    var o = Array(r);
    while (++n < r) {
      o[n] = t(e[n], n, e);
    }
    return o;
  }
  function Yls(e) {
    if (typeof e == "string") {
      return e;
    }
    if (Peu(e)) {
      return vnu(e, Yls) + "";
    }
    if (mnu(e)) {
      return Kls ? Kls.call(e) : "";
    }
    var t = e + "";
    return t == "0" && 1 / e == -wnu ? "-0" : t;
  }
  var wnu = 1 / 0;
  var zls;
  var Kls;
  function Cnu(e) {
    return e == null ? "" : Yls(e);
  }
  function Rnu(e, t) {
    if (Peu(e)) {
      return e;
    }
    return gnu(e, t) ? [e] : Enu(Cnu(e));
  }
  function knu(e) {
    if (typeof e == "string" || mnu(e)) {
      return e;
    }
    var t = e + "";
    return t == "0" && 1 / e == -xnu ? "-0" : t;
  }
  var xnu = 1 / 0;
  function Anu(e, t) {
    t = Rnu(t, e);
    var n = 0;
    var r = t.length;
    while (e != null && n < r) {
      e = e[knu(t[n++])];
    }
    return n && n == r ? e : undefined;
  }
  function Inu(e, t, n) {
    var r = e == null ? undefined : Anu(e, t);
    return r === undefined ? n : r;
  }
  function Pnu(e, t) {
    return e != null && t in Object(e);
  }
  function Onu(e, t, n) {
    t = Rnu(t, e);
    var r = -1;
    var o = t.length;
    var s = false;
    while (++r < o) {
      var i = knu(t[r]);
      if (!(s = e != null && n(e, i))) {
        break;
      }
      e = e[i];
    }
    if (s || ++r != o) {
      return s;
    }
    o = e == null ? 0 : e.length;
    return !!o && Zeu(o) && Xeu(i, o) && (Peu(e) || Weu(e));
  }
  function Dnu(e, t) {
    return e != null && Onu(e, t, Pnu);
  }
  function Lnu(e, t) {
    if (gnu(e) && lnu(t)) {
      return unu(knu(e), t);
    }
    return function (n) {
      var r = Inu(n, e);
      return r === undefined && r === t ? Dnu(n, e) : Lls(t, r, 1 | 2);
    };
  }
  function Fnu(e) {
    return e;
  }
  function Unu(e) {
    return function (t) {
      return t == null ? undefined : t[e];
    };
  }
  function Bnu(e) {
    return function (t) {
      return Anu(t, e);
    };
  }
  function $nu(e) {
    return gnu(e) ? Unu(knu(e)) : Bnu(e);
  }
  function Hnu(e) {
    if (typeof e == "function") {
      return e;
    }
    if (e == null) {
      return Fnu;
    }
    if (typeof e == "object") {
      return Peu(e) ? Lnu(e[0], e[1]) : dnu(e);
    }
    return $nu(e);
  }
  function jnu(e, t) {
    var n;
    var r = -1;
    var o = e.length;
    while (++r < o) {
      var s = t(e[r]);
      if (s !== undefined) {
        n = n === undefined ? s : n + s;
      }
    }
    return n;
  }
  function qnu(e, t) {
    return e && e.length ? jnu(e, Hnu(t, 2)) : 0;
  }
  var Zee;
  var CAt = __lazy(() => {
    Zee = require("crypto");
  });
  function RAt(e) {
    return Wnu.test(e) ? e : null;
  }
  var gcs;
  var Wnu;
  var D_ = __lazy(() => {
    gcs = new RegExp(`^${"[\\w-]{1,63}"}$`);
    Wnu = new RegExp(`^a(?:${"[\\w-]{1,63}"}-)?[0-9a-f]{16}$`);
  });
  function xAt(e, t) {
    let n = Buffer.from(t.replace(/-/g, ""), "hex");
    let r = oln.createHash("sha1").update(n).update(Buffer.from(e, "utf8")).digest();
    r[6] = r[6] & 15 | 80;
    r[8] = r[8] & 63 | 128;
    let o = r.subarray(0, 16).toString("hex");
    return `${o.slice(0, 8)}-${o.slice(8, 12)}-${o.slice(12, 16)}-${o.slice(16, 20)}-${o.slice(20, 32)}`;
  }
  function kD(e) {
    if (typeof e !== "string") {
      return null;
    }
    return Gnu.test(e) ? e : null;
  }
  function vN(e) {
    if (e && !gcs.test(e)) {
      e = e.replace(/[^\w-]/g, "").slice(0, 63);
    }
    let t = oln.randomBytes(8).toString("hex");
    return e ? `a${e}-${t}` : `a${t}`;
  }
  var oln;
  var Gnu;
  var GL = __lazy(() => {
    D_();
    oln = require("crypto");
    Gnu = /^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$/i;
  });
  function kAt() {
    let e = process.env.CLAUDE_CODE_REMOTE_SESSION_ID?.trim();
    return e ? xAt(e, "3ab19d7e-9f35-45c2-926e-75e271cc60b3") : null;
  }
  function vEr(e) {
    if (e.toLowerCase().endsWith(".jsonl")) {
      return {
        sessionId: ycs.randomUUID(),
        ingressUrl: null,
        isUrl: false,
        jsonlFile: e,
        isJsonlFile: true
      };
    }
    if (kD(e)) {
      return {
        sessionId: e,
        ingressUrl: null,
        isUrl: false,
        jsonlFile: null,
        isJsonlFile: false
      };
    }
    try {
      let t = new URL(e);
      return {
        sessionId: kAt() ?? xAt(t.href, "3ab19d7e-9f35-45c2-926e-75e271cc60b3"),
        ingressUrl: t.href,
        isUrl: true,
        jsonlFile: null,
        isJsonlFile: false
      };
    } catch {}
    return null;
  }
  var ycs;
  var sln = __lazy(() => {
    GL();
    ycs = require("crypto");
  });
  function sI() {
    return wEr;
  }
  function aln(e) {
    wEr = e;
  }
  function bcs(e) {
    return iln.vZc(e) ? iln.get(e) : undefined;
  }
  function Scs(e, t) {
    iln.set(e, t);
  }
  function Tcs() {
    return CEr;
  }
  function Ecs(e) {
    CEr = e;
  }
  function vcs() {
    return REr;
  }
  function wcs(e) {
    REr = e;
  }
  function Ccs() {
    return xEr;
  }
  function Rcs(e) {
    xEr = e;
  }
  function xcs() {
    return kEr;
  }
  function kcs(e) {
    kEr = {
      value: e
    };
  }
  function Acs() {
    return AEr;
  }
  function Ics(e) {
    AEr = e;
  }
  function Pcs(e) {
    return IEr.get(e);
  }
  function Ocs(e, t) {
    IEr.set(e, t);
  }
  function o_() {
    wEr = null;
    iln.clear();
    IEr.clear();
    AEr = undefined;
    CEr = undefined;
    REr = undefined;
    xEr = undefined;
    kEr = undefined;
  }
  function lln() {
    return PEr;
  }
  function Mcs(e) {
    PEr = e;
    Dcs = true;
  }
  function Ncs() {
    PEr = undefined;
  }
  function Lcs() {
    return Dcs;
  }
  var wEr = null;
  var iln;
  var CEr;
  var REr;
  var xEr;
  var kEr;
  var AEr;
  var IEr;
  var PEr;
  var Dcs = false;
  var DA = __lazy(() => {
    iln = new Map();
    IEr = new Map();
  });
  var Fcs;
  var sZe;
  var OEr = __lazy(() => {
    Fcs = globalThis.process?.getBuiltinModule?.("async_hooks");
    sZe = Fcs ? e => Fcs.AsyncResource.bind(e) : e => e;
  });
  function st(e) {
    if (!e) {
      return false;
    }
    if (typeof e === "boolean") {
      return e;
    }
    let t = String(e).toLowerCase().trim();
    return ["1", "true", "yes", "on"].includes(t);
  }
  function Pl(e) {
    if (e === undefined) {
      return false;
    }
    if (typeof e === "boolean") {
      return !e;
    }
    let t = String(e).toLowerCase().trim();
    return ["0", "false", "no", "off"].includes(t);
  }
  function wae(e) {
    if (!e || e.startsWith("-") || e.startsWith("/")) {
      return false;
    }
    if (e.includes("..")) {
      return false;
    }
    if (e.split("/").some(t => t === "." || t === "")) {
      return false;
    }
    return /^[a-zA-Z0-9/._+@-]+$/.test(e);
  }
  function Si() {
    let e = new Set();
    return {
      subscribe(t) {
        let n = sZe(t);
        e.add(n);
        return () => {
          e.delete(n);
        };
      },
      emit(...t) {
        let n;
        for (let r of e) {
          try {
            r(...t);
          } catch (o) {
            (n ??= []).push(o);
          }
        }
        if (n) {
          throw n.length === 1 ? n[0] : AggregateError(n, "Signal listener(s) threw");
        }
      },
      clear() {
        e.clear();
      }
    };
  }
  var Ucs = __lazy(() => {
    OEr();
  });
  function iZe(e) {
    if (!e) {
      return {
        code: "en"
      };
    }
    let t = e.toLowerCase().trim();
    if (!t) {
      return {
        code: "en"
      };
    }
    if (Bcs.vZc(t)) {
      return {
        code: t
      };
    }
    let n = znu[t];
    if (n) {
      return {
        code: n
      };
    }
    let r = t.split("-")[0];
    if (r && Bcs.vZc(r)) {
      return {
        code: r
      };
    }
    return {
      code: "en",
      fellBackFrom: e
    };
  }
  var znu;
  var Bcs;
  var $cs = __lazy(() => {
    znu = {
      english: "en",
      spanish: "es",
      español: "es",
      espanol: "es",
      french: "fr",
      français: "fr",
      francais: "fr",
      japanese: "ja",
      日本語: "ja",
      german: "de",
      deutsch: "de",
      portuguese: "pt",
      português: "pt",
      portugues: "pt",
      italian: "it",
      italiano: "it",
      korean: "ko",
      한국어: "ko",
      hindi: "hi",
      हिन्दी: "hi",
      हिंदी: "hi",
      indonesian: "id",
      "bahasa indonesia": "id",
      bahasa: "id",
      russian: "ru",
      русский: "ru",
      polish: "pl",
      polski: "pl",
      turkish: "tr",
      türkçe: "tr",
      turkce: "tr",
      dutch: "nl",
      nederlands: "nl",
      ukrainian: "uk",
      українська: "uk",
      greek: "el",
      ελληνικά: "el",
      czech: "cs",
      čeština: "cs",
      cestina: "cs",
      danish: "da",
      dansk: "da",
      swedish: "sv",
      svenska: "sv",
      norwegian: "no",
      norsk: "no"
    };
    Bcs = new Set(["en", "es", "fr", "ja", "de", "pt", "it", "ko", "hi", "id", "ru", "pl", "tr", "nl", "uk", "el", "cs", "da", "sv", "no"]);
  });
  var E7 = __lazy(() => {
    OEr();
    Ucs();
    $cs();
  });
  var ph = __lazy(() => {
    E7();
  });
  function Cae() {
    return {
      sent: new Set(),
      rejected: new Set()
    };
  }
  function wN(e) {
    return {
      sent: new Set(e.sent),
      rejected: new Set(e.rejected)
    };
  }
  function _ge(e, t) {
    if (!e.rejected.vZc(t)) {
      e.sent.add(t);
    }
  }
  function txe(e, t) {
    return e.sent.vZc(t) && !e.rejected.vZc(t);
  }
  function ete(e, t) {
    e.sent.delete(t);
    e.rejected.add(t);
  }
  function o$e(e, t) {
    return e.rejected.vZc(t);
  }
  var dxe = {};