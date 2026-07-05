  var KLs = __commonJS(B_n => {
    Object.defineProperty(B_n, "__esModule", {
      value: true
    });
    B_n.randomUUID = undefined;
    var C8u = ort();
    var zLs = C8u.__importDefault(require("crypto"));
    B_n.randomUUID = zLs.default.randomUUID.bind(zLs.default);
  });
  var xFr = __commonJS(JLs => {
    var YLs = KLs();
    var ZB = Array.from({
      length: 256
    }, (e, t) => t.toString(16).padStart(2, "0"));
    var R8u = () => {
      if (YLs.randomUUID) {
        return YLs.randomUUID();
      }
      let e = new Uint8Array(16);
      crypto.getRandomValues(e);
      e[6] = e[6] & 15 | 64;
      e[8] = e[8] & 63 | 128;
      return ZB[e[0]] + ZB[e[1]] + ZB[e[2]] + ZB[e[3]] + "-" + ZB[e[4]] + ZB[e[5]] + "-" + ZB[e[6]] + ZB[e[7]] + "-" + ZB[e[8]] + ZB[e[9]] + "-" + ZB[e[10]] + ZB[e[11]] + ZB[e[12]] + ZB[e[13]] + ZB[e[14]] + ZB[e[15]];
    };
    JLs.v4 = R8u;
  });
  var yW = __commonJS(gm => {
    var x8u = xFr();
    var k8u = (e, t, n = r => r) => e;
    var A8u = e => {
      switch (e) {
        case "true":
          return true;
        case "false":
          return false;
        default:
          throw Error(`Unable to parse boolean value "${e}"`);
      }
    };
    var I8u = e => {
      if (e === null || e === undefined) {
        return;
      }
      if (typeof e === "number") {
        if (e === 0 || e === 1) {
          CNt.warn(H_n(`Expected boolean, got ${typeof e}: ${e}`));
        }
        if (e === 0) {
          return false;
        }
        if (e === 1) {
          return true;
        }
      }
      if (typeof e === "string") {
        let t = e.toLowerCase();
        if (t === "false" || t === "true") {
          CNt.warn(H_n(`Expected boolean, got ${typeof e}: ${e}`));
        }
        if (t === "false") {
          return false;
        }
        if (t === "true") {
          return true;
        }
      }
      if (typeof e === "boolean") {
        return e;
      }
      throw TypeError(`Expected boolean, got ${typeof e}: ${e}`);
    };
    var vNt = e => {
      if (e === null || e === undefined) {
        return;
      }
      if (typeof e === "string") {
        let t = parseFloat(e);
        if (!Number.isNaN(t)) {
          if (String(t) !== String(e)) {
            CNt.warn(H_n(`Expected number but observed string: ${e}`));
          }
          return t;
        }
      }
      if (typeof e === "number") {
        return e;
      }
      throw TypeError(`Expected number, got ${typeof e}: ${e}`);
    };
    var P8u = Math.ceil(340282346638528860000000000000000000000);
    var $_n = e => {
      let t = vNt(e);
      if (t !== undefined && !Number.isNaN(t) && t !== 1 / 0 && t !== -1 / 0) {
        if (Math.abs(t) > P8u) {
          throw TypeError(`Expected 32-bit float, got ${e}`);
        }
      }
      return t;
    };
    var wNt = e => {
      if (e === null || e === undefined) {
        return;
      }
      if (Number.isInteger(e) && !Number.isNaN(e)) {
        return e;
      }
      throw TypeError(`Expected integer, got ${typeof e}: ${e}`);
    };
    var O8u = wNt;
    var AFr = e => OFr(e, 32);
    var IFr = e => OFr(e, 16);
    var PFr = e => OFr(e, 8);
    var OFr = (e, t) => {
      let n = wNt(e);
      if (n !== undefined && D8u(n, t) !== n) {
        throw TypeError(`Expected ${t}-bit integer, got ${e}`);
      }
      return n;
    };
    var D8u = (e, t) => {
      switch (t) {
        case 32:
          return Int32Array.of(e)[0];
        case 16:
          return Int16Array.of(e)[0];
        case 8:
          return Int8Array.of(e)[0];
      }
    };
    var M8u = (e, t) => {
      if (e === null || e === undefined) {
        if (t) {
          throw TypeError(`Expected a non-null value for ${t}`);
        }
        throw TypeError("Expected a non-null value");
      }
      return e;
    };
    var QLs = e => {
      if (e === null || e === undefined) {
        return;
      }
      if (typeof e === "object" && !Array.isArray(e)) {
        return e;
      }
      let t = Array.isArray(e) ? "array" : typeof e;
      throw TypeError(`Expected object, got ${t}: ${e}`);
    };
    var N8u = e => {
      if (e === null || e === undefined) {
        return;
      }
      if (typeof e === "string") {
        return e;
      }
      if (["boolean", "number", "bigint"].includes(typeof e)) {
        CNt.warn(H_n(`Expected string, got ${typeof e}: ${e}`));
        return String(e);
      }
      throw TypeError(`Expected string, got ${typeof e}: ${e}`);
    };
    var L8u = e => {
      if (e === null || e === undefined) {
        return;
      }
      let t = QLs(e);
      let n = Object.entries(t).filter(([, r]) => r != null).map(([r]) => r);
      if (n.length === 0) {
        throw TypeError("Unions must have exactly one non-null member. None were found.");
      }
      if (n.length > 1) {
        throw TypeError(`Unions must have exactly one non-null member. Keys ${n} were not null.`);
      }
      return t;
    };
    var DFr = e => {
      if (typeof e == "string") {
        return vNt(art(e));
      }
      return vNt(e);
    };
    var F8u = DFr;
    var ZLs = e => {
      if (typeof e == "string") {
        return $_n(art(e));
      }
      return $_n(e);
    };
    var art = e => {
      let t = e.match(/(-?(?:0|[1-9]\d*)(?:\.\d+)?(?:[eE][+-]?\d+)?)|(-?Infinity)|(NaN)/g);
      if (t === null || t[0].length !== e.length) {
        throw TypeError("Expected real number, got implicit NaN");
      }
      return parseFloat(e);
    };
    var MFr = e => {
      if (typeof e == "string") {
        return eFs(e);
      }
      return vNt(e);
    };
    var B8u = MFr;
    var $8u = MFr;
    var H8u = e => {
      if (typeof e == "string") {
        return eFs(e);
      }
      return $_n(e);
    };
    var eFs = e => {
      switch (e) {
        case "NaN":
          return NaN;
        case "Infinity":
          return 1 / 0;
        case "-Infinity":
          return -1 / 0;
        default:
          throw Error(`Unable to parse float value: ${e}`);
      }
    };
    var tFs = e => {
      if (typeof e === "string") {
        return wNt(art(e));
      }
      return wNt(e);
    };
    var j8u = tFs;
    var q8u = e => {
      if (typeof e === "string") {
        return AFr(art(e));
      }
      return AFr(e);
    };
    var srt = e => {
      if (typeof e === "string") {
        return IFr(art(e));
      }
      return IFr(e);
    };
    var nFs = e => {
      if (typeof e === "string") {
        return PFr(art(e));
      }
      return PFr(e);
    };
    var H_n = e => String(TypeError(e).stack || e).split(`
`).slice(0, 5).filter(t => !t.includes("stackTraceWarning")).join(`
`);
    var CNt = {
      warn: console.warn
    };
    var W8u = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];
    var NFr = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"];
    function G8u(e) {
      let t = e.getUTCFullYear();
      let n = e.getUTCMonth();
      let r = e.getUTCDay();
      let o = e.getUTCDate();
      let s = e.getUTCHours();
      let i = e.getUTCMinutes();
      let a = e.getUTCSeconds();
      let l = o < 10 ? `0${o}` : `${o}`;
      let c = s < 10 ? `0${s}` : `${s}`;
      let u = i < 10 ? `0${i}` : `${i}`;
      let d = a < 10 ? `0${a}` : `${a}`;
      return `${W8u[r]}, ${l} ${NFr[n]} ${t} ${c}:${u}:${d} GMT`;
    }
    var V8u = new RegExp(/^(\d{4})-(\d{2})-(\d{2})[tT](\d{2}):(\d{2}):(\d{2})(?:\.(\d+))?[zZ]$/);
    var z8u = e => {
      if (e === null || e === undefined) {
        return;
      }
      if (typeof e !== "string") {
        throw TypeError("RFC-3339 date-times must be expressed as strings");
      }
      let t = V8u.exec(e);
      if (!t) {
        throw TypeError("Invalid RFC-3339 date-time value");
      }
      let [n, r, o, s, i, a, l, c] = t;
      let u = srt(irt(r));
      let d = kle(o, "month", 1, 12);
      let p = kle(s, "day", 1, 31);
      return ENt(u, d, p, {
        hours: i,
        minutes: a,
        seconds: l,
        fractionalMilliseconds: c
      });
    };
    var K8u = new RegExp(/^(\d{4})-(\d{2})-(\d{2})[tT](\d{2}):(\d{2}):(\d{2})(?:\.(\d+))?(([-+]\d{2}\:\d{2})|[zZ])$/);
    var Y8u = e => {
      if (e === null || e === undefined) {
        return;
      }
      if (typeof e !== "string") {
        throw TypeError("RFC-3339 date-times must be expressed as strings");
      }
      let t = K8u.exec(e);
      if (!t) {
        throw TypeError("Invalid RFC-3339 date-time value");
      }
      let [n, r, o, s, i, a, l, c, u] = t;
      let d = srt(irt(r));
      let p = kle(o, "month", 1, 12);
      let m = kle(s, "day", 1, 31);
      let f = ENt(d, p, m, {
        hours: i,
        minutes: a,
        seconds: l,
        fractionalMilliseconds: c
      });
      if (u.toUpperCase() != "Z") {
        f.setTime(f.getTime() - lVu(u));
      }
      return f;
    };
    var J8u = new RegExp(/^(?:Mon|Tue|Wed|Thu|Fri|Sat|Sun), (\d{2}) (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) (\d{4}) (\d{1,2}):(\d{2}):(\d{2})(?:\.(\d+))? GMT$/);
    var X8u = new RegExp(/^(?:Monday|Tuesday|Wednesday|Thursday|Friday|Saturday|Sunday), (\d{2})-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)-(\d{2}) (\d{1,2}):(\d{2}):(\d{2})(?:\.(\d+))? GMT$/);
    var Q8u = new RegExp(/^(?:Mon|Tue|Wed|Thu|Fri|Sat|Sun) (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) ( [1-9]|\d{2}) (\d{1,2}):(\d{2}):(\d{2})(?:\.(\d+))? (\d{4})$/);
    var Z8u = e => {
      if (e === null || e === undefined) {
        return;
      }
      if (typeof e !== "string") {
        throw TypeError("RFC-7231 date-times must be expressed as strings");
      }
      let t = J8u.exec(e);
      if (t) {
        let [n, r, o, s, i, a, l, c] = t;
        return ENt(srt(irt(s)), kFr(o), kle(r, "day", 1, 31), {
          hours: i,
          minutes: a,
          seconds: l,
          fractionalMilliseconds: c
        });
      }
      if (t = X8u.exec(e), t) {
        let [n, r, o, s, i, a, l, c] = t;
        return rVu(ENt(tVu(s), kFr(o), kle(r, "day", 1, 31), {
          hours: i,
          minutes: a,
          seconds: l,
          fractionalMilliseconds: c
        }));
      }
      if (t = Q8u.exec(e), t) {
        let [n, r, o, s, i, a, l, c] = t;
        return ENt(srt(irt(c)), kFr(r), kle(o.trimLeft(), "day", 1, 31), {
          hours: s,
          minutes: i,
          seconds: a,
          fractionalMilliseconds: l
        });
      }
      throw TypeError("Invalid RFC-7231 date-time value");
    };
    var eVu = e => {
      if (e === null || e === undefined) {
        return;
      }
      let t;
      if (typeof e === "number") {
        t = e;
      } else if (typeof e === "string") {
        t = DFr(e);
      } else if (typeof e === "object" && e.tag === 1) {
        t = e.value;
      } else {
        throw TypeError("Epoch timestamps must be expressed as floating point numbers or their string representation");
      }
      if (Number.isNaN(t) || t === 1 / 0 || t === -1 / 0) {
        throw TypeError("Epoch timestamps must be valid, non-Infinite, non-NaN numerics");
      }
      return new Date(Math.round(t * 1000));
    };
    var ENt = (e, t, n, r) => {
      let o = t - 1;
      sVu(e, o, n);
      return new Date(Date.UTC(e, o, n, kle(r.hours, "hour", 0, 23), kle(r.minutes, "minute", 0, 59), kle(r.seconds, "seconds", 0, 60), aVu(r.fractionalMilliseconds)));
    };
    var tVu = e => {
      let t = new Date().getUTCFullYear();
      let n = Math.floor(t / 100) * 100 + srt(irt(e));
      if (n < t) {
        return n + 100;
      }
      return n;
    };
    var rVu = e => {
      if (e.getTime() - new Date().getTime() > 1576800000000) {
        return new Date(Date.UTC(e.getUTCFullYear() - 100, e.getUTCMonth(), e.getUTCDate(), e.getUTCHours(), e.getUTCMinutes(), e.getUTCSeconds(), e.getUTCMilliseconds()));
      }
      return e;
    };
    var kFr = e => {
      let t = NFr.indexOf(e);
      if (t < 0) {
        throw TypeError(`Invalid month: ${e}`);
      }
      return t + 1;
    };
    var oVu = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    var sVu = (e, t, n) => {
      let r = oVu[t];
      if (t === 1 && iVu(e)) {
        r = 29;
      }
      if (n > r) {
        throw TypeError(`Invalid day for ${NFr[t]} in ${e}: ${n}`);
      }
    };
    var iVu = e => e % 4 === 0 && (e % 100 !== 0 || e % 400 === 0);
    var kle = (e, t, n, r) => {
      let o = nFs(irt(e));
      if (o < n || o > r) {
        throw TypeError(`${t} must be between ${n} and ${r}, inclusive`);
      }
      return o;
    };
    var aVu = e => {
      if (e === null || e === undefined) {
        return 0;
      }
      return ZLs("0." + e) * 1000;
    };
    var lVu = e => {
      let t = e[0];
      let n = 1;
      if (t == "+") {
        n = 1;
      } else if (t == "-") {
        n = -1;
      } else {
        throw TypeError(`Offset direction, ${t}, must be "+" or "-"`);
      }
      let r = Number(e.substring(1, 3));
      let o = Number(e.substring(4, 6));
      return n * (r * 60 + o) * 60 * 1000;
    };
    var irt = e => {
      let t = 0;
      while (t < e.length - 1 && e.charAt(t) === "0") {
        t++;
      }
      if (t === 0) {
        return e;
      }
      return e.slice(t);
    };
    var Nje = function (t) {
      return Object.assign(new String(t), {
        deserializeJSON() {
          return JSON.parse(String(t));
        },
        toString() {
          return String(t);
        },
        toJSON() {
          return String(t);
        }
      });
    };
    Nje.from = e => {
      if (e && typeof e === "object" && (e instanceof Nje || "deserializeJSON" in e)) {
        return e;
      } else if (typeof e === "string" || Object.getPrototypeOf(e) === String.prototype) {
        return Nje(String(e));
      }
      return Nje(JSON.stringify(e));
    };
    Nje.fromObject = Nje.from;
    function cVu(e) {
      if (e.includes(",") || e.includes('"')) {
        e = `"${e.replace(/"/g, "\\\"")}"`;
      }
      return e;
    }
    var uVu = new RegExp(/^(\d{4})-(\d\d)-(\d\d)[tT](\d\d):(\d\d):(\d\d)(\.(\d+))?(([-+]\d\d:\d\d)|[zZ])$/);
    var dVu = new RegExp(`^${"(?:Mon|Tue|Wed|Thu|Fri|Sat|Sun)(?:[ne|u?r]?s?day)?"}, ${"(\\d?\\d)"} ${"(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)"} ${"(\\d{4})"} ${"(\\d?\\d):(\\d{2}):(\\d{2})(?:\\.(\\d+))?"} GMT$`);
    var pVu = new RegExp(`^${"(?:Mon|Tue|Wed|Thu|Fri|Sat|Sun)(?:[ne|u?r]?s?day)?"}, ${"(\\d?\\d)"}-${"(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)"}-(\\d\\d) ${"(\\d?\\d):(\\d{2}):(\\d{2})(?:\\.(\\d+))?"} GMT$`);
    var mVu = new RegExp(`^${"(?:Mon|Tue|Wed|Thu|Fri|Sat|Sun)(?:[ne|u?r]?s?day)?"} ${"(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)"} ( [1-9]|\\d\\d) ${"(\\d?\\d):(\\d{2}):(\\d{2})(?:\\.(\\d+))?"} ${"(\\d{4})"}$`);
    var fVu = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"];
    var hVu = e => {
      if (e == null) {
        return;
      }
      let t = NaN;
      if (typeof e === "number") {
        t = e;
      } else if (typeof e === "string") {
        if (!/^-?\d*\.?\d+$/.test(e)) {
          throw TypeError("parseEpochTimestamp - numeric string invalid.");
        }
        t = Number.parseFloat(e);
      } else if (typeof e === "object" && e.tag === 1) {
        t = e.value;
      }
      if (isNaN(t) || Math.abs(t) === 1 / 0) {
        throw TypeError("Epoch timestamps must be valid finite numbers.");
      }
      return new Date(Math.round(t * 1000));
    };
    var gVu = e => {
      if (e == null) {
        return;
      }
      if (typeof e !== "string") {
        throw TypeError("RFC3339 timestamps must be strings");
      }
      let t = uVu.exec(e);
      if (!t) {
        throw TypeError(`Invalid RFC3339 timestamp format ${e}`);
      }
      let [, n, r, o, s, i, a,, l, c] = t;
      jye(r, 1, 12);
      jye(o, 1, 31);
      jye(s, 0, 23);
      jye(i, 0, 59);
      jye(a, 0, 60);
      let u = new Date(Date.UTC(Number(n), Number(r) - 1, Number(o), Number(s), Number(i), Number(a), Number(l) ? Math.round(parseFloat(`0.${l}`) * 1000) : 0));
      if (u.setUTCFullYear(Number(n)), c.toUpperCase() != "Z") {
        let [, d, p, m] = /([+-])(\d\d):(\d\d)/.exec(c) || [undefined, "+", 0, 0];
        let f = d === "-" ? 1 : -1;
        u.setTime(u.getTime() + f * (Number(p) * 60 * 60 * 1000 + Number(m) * 60 * 1000));
      }
      return u;
    };
    var yVu = e => {
      if (e == null) {
        return;
      }
      if (typeof e !== "string") {
        throw TypeError("RFC7231 timestamps must be strings.");
      }
      let t;
      let n;
      let r;
      let o;
      let s;
      let i;
      let a;
      let l;
      if (l = dVu.exec(e)) {
        [, t, n, r, o, s, i, a] = l;
      } else if (l = pVu.exec(e)) {
        [, t, n, r, o, s, i, a] = l;
        r = (Number(r) + 1900).toString();
      } else if (l = mVu.exec(e)) {
        [, n, t, o, s, i, a, r] = l;
      }
      if (r && i) {
        let c = Date.UTC(Number(r), fVu.indexOf(n), Number(t), Number(o), Number(s), Number(i), a ? Math.round(parseFloat(`0.${a}`) * 1000) : 0);
        jye(t, 1, 31);
        jye(o, 0, 23);
        jye(s, 0, 59);
        jye(i, 0, 60);
        let u = new Date(c);
        u.setUTCFullYear(Number(r));
        return u;
      }
      throw TypeError(`Invalid RFC7231 date-time value ${e}.`);
    };
    function jye(e, t, n) {
      let r = Number(e);
      if (r < t || r > n) {
        throw Error(`Value ${r} out of range [${t}, ${n}]`);
      }
    }
    function _Vu(e, t, n) {
      if (n <= 0 || !Number.isInteger(n)) {
        throw Error("Invalid number of delimiters (" + n + ") for splitEvery.");
      }
      let r = e.split(t);
      if (n === 1) {
        return r;
      }
      let o = [];
      let s = "";
      for (let i = 0; i < r.length; i++) {
        if (s === "") {
          s = r[i];
        } else {
          s += t + r[i];
        }
        if ((i + 1) % n === 0) {
          o.push(s);
          s = "";
        }
      }
      if (s !== "") {
        o.push(s);
      }
      return o;
    }
    var bVu = e => {
      let t = e.length;
      let n = [];
      let r = false;
      let o = undefined;
      let s = 0;
      for (let i = 0; i < t; ++i) {
        let a = e[i];
        switch (a) {
          case '"':
            if (o !== "\\") {
              r = !r;
            }
            break;
          case ",":
            if (!r) {
              n.push(e.slice(s, i));
              s = i + 1;
            }
            break;
        }
        o = a;
      }
      n.push(e.slice(s));
      return n.map(i => {
        i = i.trim();
        let a = i.length;
        if (a < 2) {
          return i;
        }
        if (i[0] === '"' && i[a - 1] === '"') {
          i = i.slice(1, a - 1);
        }
        return i.replace(/\\"/g, '"');
      });
    };
    class j_n {
      string;
      type;
      constructor(e, t) {
        if (this.string = e, this.type = t, !(/^-?\d*(\.\d+)?$/).test(e)) {
          throw Error('@smithy/core/serde - NumericValue must only contain [0-9], at most one decimal point ".", and an optional negation prefix "-".');
        }
      }
      toString() {
        return this.string;
      }
      static [Symbol.hasInstance](e) {
        if (!e || typeof e !== "object") {
          return false;
        }
        let t = e;
        return j_n.prototype.isPrototypeOf(e) || t.type === "bigDecimal" && (/^-?\d*(\.\d+)?$/).test(t.string);
      }
    }
    function SVu(e) {
      return new j_n(String(e), "bigDecimal");
    }
    Object.defineProperty(gm, "generateIdempotencyToken", {
      enumerable: true,
      get: function () {
        return x8u.v4;
      }
    });
    gm.LazyJsonString = Nje;
    gm.NumericValue = j_n;
    gm._parseEpochTimestamp = hVu;
    gm._parseRfc3339DateTimeWithOffset = gVu;
    gm._parseRfc7231DateTime = yVu;
    gm.copyDocumentWithTransform = k8u;
    gm.dateToUtcString = G8u;
    gm.expectBoolean = I8u;
    gm.expectByte = PFr;
    gm.expectFloat32 = $_n;
    gm.expectInt = O8u;
    gm.expectInt32 = AFr;
    gm.expectLong = wNt;
    gm.expectNonNull = M8u;
    gm.expectNumber = vNt;
    gm.expectObject = QLs;
    gm.expectShort = IFr;
    gm.expectString = N8u;
    gm.expectUnion = L8u;
    gm.handleFloat = B8u;
    gm.limitedParseDouble = MFr;
    gm.limitedParseFloat = $8u;
    gm.limitedParseFloat32 = H8u;
    gm.logger = CNt;
    gm.nv = SVu;
    gm.parseBoolean = A8u;
    gm.parseEpochTimestamp = eVu;
    gm.parseRfc3339DateTime = z8u;
    gm.parseRfc3339DateTimeWithOffset = Y8u;
    gm.parseRfc7231DateTime = Z8u;
    gm.quoteHeader = cVu;
    gm.splitEvery = _Vu;
    gm.splitHeader = bVu;
    gm.strictParseByte = nFs;
    gm.strictParseDouble = DFr;
    gm.strictParseFloat = F8u;
    gm.strictParseFloat32 = ZLs;
    gm.strictParseInt = j8u;
    gm.strictParseInt32 = q8u;
    gm.strictParseLong = tFs;
    gm.strictParseShort = srt;
  });
  var iFs = __commonJS(sFs => {
    var TVu = e => typeof ArrayBuffer === "function" && e instanceof ArrayBuffer || Object.prototype.toString.call(e) === "[object ArrayBuffer]";
    sFs.isArrayBuffer = TVu;
  });
  var HFr = __commonJS($Fr => {
    var EVu = iFs();
    var BFr = require("buffer");
    var vVu = (e, t = 0, n = e.byteLength - t) => {
      if (!EVu.isArrayBuffer(e)) {
        throw TypeError(`The "input" argument must be ArrayBuffer. Received type ${typeof e} (${e})`);
      }
      return BFr.Buffer.from(e, t, n);
    };
    var wVu = (e, t) => {
      if (typeof e !== "string") {
        throw TypeError(`The "input" argument must be of type string. Received type ${typeof e} (${e})`);
      }
      return t ? BFr.Buffer.from(e, t) : BFr.Buffer.from(e);
    };
    $Fr.fromArrayBuffer = vVu;
    $Fr.fromString = wVu;
  });
  var aFs = __commonJS(q_n => {
    Object.defineProperty(q_n, "__esModule", {
      value: true
    });
    q_n.fromBase64 = undefined;
    var CVu = HFr();
    var xVu = e => {
      if (e.length * 3 % 4 !== 0) {
        throw TypeError("Incorrect padding on base64 string.");
      }
      if (!(/^[A-Za-z0-9+/]*={0,2}$/).exec(e)) {
        throw TypeError("Invalid base64 string.");
      }
      let t = (0, CVu.fromString)(e, "base64");
      return new Uint8Array(t.buffer, t.byteOffset, t.byteLength);
    };
    q_n.fromBase64 = xVu;
  });