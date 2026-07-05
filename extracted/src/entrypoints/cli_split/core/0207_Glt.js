  var gPe = __lazy(() => {
    JZr();
  });
  function Glt(e) {
    let t = RNn.get(e);
    if (t !== undefined) {
      return t;
    }
    let n = an(e);
    if (RNn.size >= 4096) {
      RNn.clear();
    }
    RNn.set(e, n);
    return n;
  }
  var RNn;
  var xNn = __lazy(() => {
    bc();
    RNn = new Map();
  });
  function D7d(e, t) {
    if (e.length === 0) {
      return {
        width: 0,
        height: 0
      };
    }
    let n = t <= 0 || !Number.isFinite(t);
    let r = 0;
    let o = 0;
    let s = 0;
    while (s <= e.length) {
      let i = e.indexOf(`
`, s);
      let a = i === -1 ? e.substring(s) : e.substring(s, i);
      let l = Glt(a);
      if (o = Math.max(o, l), n) {
        r++;
      } else {
        r += l === 0 ? 1 : Math.ceil(l / t);
      }
      if (i === -1) {
        break;
      }
      s = i + 1;
    }
    return {
      width: o,
      height: r
    };
  }
  function v8i(e, t, n) {
    let r = CHt.get(e);
    if (r) {
      r.push(t);
    } else {
      CHt.set(e, [t]);
    }
    if (n) {
      ito = true;
    }
  }
  function w8i() {
    let e = ito;
    ito = false;
    return e;
  }
  var Kg;
  var CHt;
  var ito = false;
  var oSe = __lazy(() => {
    Kg = new WeakMap();
    CHt = new WeakMap();
  });
  function kNn(e, t = {}, n, r = []) {
    let o = e.textStyles ? {
      ...t,
      ...e.textStyles
    } : t;
    for (let s of e.childNodes) {
      if (s === undefined) {
        continue;
      }
      if (s.nodeName === "#text") {
        if (s.nodeValue.length > 0) {
          r.push({
            text: s.nodeValue,
            styles: o,
            hyperlink: n
          });
        }
      } else if (s.nodeName === "ink-text" || s.nodeName === "ink-virtual-text") {
        kNn(s, o, n, r);
      } else if (s.nodeName === "ink-link") {
        let i = s.attributes.href;
        kNn(s, o, i || n, r);
      }
    }
    return r;
  }
  function ato(e) {
    let t = "";
    for (let n of e.childNodes) {
      if (n === undefined) {
        continue;
      }
      if (n.nodeName === "#text") {
        t += n.nodeValue;
      } else if (n.nodeName === "ink-text" || n.nodeName === "ink-virtual-text") {
        t += ato(n);
      } else if (n.nodeName === "ink-link") {
        t += ato(n);
      }
    }
    return t;
  }
  function R8i(e, t = 8) {
    if (!e.includes("\t")) {
      return e;
    }
    let n = mPe();
    let r = n.feed(e);
    r.push(...n.flush());
    let o = "";
    let s = 0;
    for (let i of r) {
      if (i.type === "sequence") {
        o += i.value;
      } else {
        let a = i.value.split(/(\t|\n)/);
        for (let l of a) {
          if (l === "\t") {
            let c = t - s % t;
            o += " ".repeat(c);
            s += c;
          } else if (l === `
`) {
            o += l;
            s = 0;
          } else {
            o += l;
            s += an(l);
          }
        }
      }
    }
    return o;
  }
  var x8i = __lazy(() => {
    bc();
    _Ht();
  });
  function F7d() {
    let e = new Map();
    for (let [t, n] of Object.entries(ux)) {
      for (let [r, o] of Object.entries(n)) {
        ux[r] = {
          open: `\x1B[${o[0]}m`,
          close: `\x1B[${o[1]}m`
        };
        n[r] = ux[r];
        e.set(o[0], o[1]);
      }
      Object.defineProperty(ux, t, {
        value: n,
        enumerable: false
      });
    }
    Object.defineProperty(ux, "codes", {
      value: e,
      enumerable: false
    });
    ux.color.close = "\x1B[39m";
    ux.bgColor.close = "\x1B[49m";
    ux.color.ansi = k8i();
    ux.color.ansi256 = A8i();
    ux.color.ansi16m = I8i();
    ux.bgColor.ansi = k8i(10);
    ux.bgColor.ansi256 = A8i(10);
    ux.bgColor.ansi16m = I8i(10);
    Object.defineProperties(ux, {
      rgbToAnsi256: {
        value: (t, n, r) => {
          if (t === n && n === r) {
            if (t < 8) {
              return 16;
            }
            if (t > 248) {
              return 231;
            }
            return Math.round((t - 8) / 247 * 24) + 232;
          }
          return 16 + 36 * Math.round(t / 255 * 5) + 6 * Math.round(n / 255 * 5) + Math.round(r / 255 * 5);
        },
        enumerable: false
      },
      hexToRgb: {
        value: t => {
          let n = /[a-f\d]{6}|[a-f\d]{3}/i.exec(t.toString(16));
          if (!n) {
            return [0, 0, 0];
          }
          let [r] = n;
          if (r.length === 3) {
            r = [...r].map(s => s + s).join("");
          }
          let o = Number.parseInt(r, 16);
          return [o >> 16 & 255, o >> 8 & 255, o & 255];
        },
        enumerable: false
      },
      hexToAnsi256: {
        value: t => ux.rgbToAnsi256(...ux.hexToRgb(t)),
        enumerable: false
      },
      ansi256ToAnsi: {
        value: t => {
          if (t < 8) {
            return 30 + t;
          }
          if (t < 16) {
            return 90 + (t - 8);
          }
          let n;
          let r;
          let o;
          if (t >= 232) {
            n = ((t - 232) * 10 + 8) / 255;
            r = n;
            o = n;
          } else {
            t -= 16;
            let a = t % 36;
            n = Math.floor(t / 36) / 5;
            r = Math.floor(a / 6) / 5;
            o = a % 6 / 5;
          }
          let s = Math.max(n, r, o) * 2;
          if (s === 0) {
            return 30;
          }
          let i = 30 + (Math.round(o) << 2 | Math.round(r) << 1 | Math.round(n));
          if (s === 2) {
            i += 60;
          }
          return i;
        },
        enumerable: false
      },
      rgbToAnsi: {
        value: (t, n, r) => ux.ansi256ToAnsi(ux.rgbToAnsi256(t, n, r)),
        enumerable: false
      },
      hexToAnsi: {
        value: t => ux.ansi256ToAnsi(ux.hexToAnsi256(t)),
        enumerable: false
      }
    });
    return ux;
  }
  var k8i = (e = 0) => t => `\x1B[${t + e}m`;
  var A8i = (e = 0) => t => `\x1B[${38 + e};5;${t}m`;
  var I8i = (e = 0) => (t, n, r) => `\x1B[${38 + e};2;${t};${n};${r}m`;
  var ux;
  var edy;
  var N7d;
  var L7d;
  var tdy;
  var U7d;
  function pto(e) {
    if (ANn.vZc(e)) {
      return e;
    }
    if (uto.vZc(e)) {
      return uto.get(e);
    }
    if (e.startsWith("\x1B]8;;")) {
      return B7d;
    }
    if (e = e.slice(2), e.startsWith("38")) {
      return U7d.color.close;
    } else if (e.startsWith("48")) {
      return U7d.bgColor.close;
    }
    let t = U7d.codes.get(parseInt(e, 10));
    if (t) {
      return U7d.color.ansi(t);
    } else {
      return U7d.reset.open;
    }
  }
  function zF(e) {
    return e.map(t => t.code).join("");
  }
  var P8i;
  var O8i;
  var D8i;
  var ANn;
  var uto;
  var dto;
  var ody;
  var B7d;
  var RHt = __lazy(() => {
    P8i = new Set([27, 155]);
    O8i = "[".codePointAt(0);
    D8i = "]".codePointAt(0);
    ANn = new Set();
    uto = new Map();
    for (let [e, t] of U7d.codes) {
      ANn.add(U7d.color.ansi(t));
      uto.set(U7d.color.ansi(e), U7d.color.ansi(t));
    }
    dto = ("\x1B]8;;").split("").map(e => e.charCodeAt(0));
    ody = ("\x07").charCodeAt(0);
    B7d = `\x1B]8;;${"\x07"}`;
  });
  function GJ(e) {
    return PNn([], e);
  }
  function PNn(e, t) {
    let n = [...e];
    for (let r of t) {
      if (r.code === U7d.reset.open) {
        n = [];
      } else if (ANn.vZc(r.code)) {
        n = n.filter(o => o.endCode !== r.code);
      } else if (r.code === U7d.bold.open || r.code === U7d.dim.open) {
        if (!n.find(s => s.code === r.code && s.endCode === r.endCode)) {
          n.push(r);
        }
      } else {
        n = n.filter(s => s.endCode !== r.endCode);
        n.push(r);
      }
    }
    return n;
  }
  var ONn = __lazy(() => {
    RHt();
  });
  function sSe(e) {
    return GJ(e).reverse().map(t => ({
      ...t,
      code: t.endCode
    }));
  }
  var mto = __lazy(() => {
    ONn();
  });
  function LWe(e, t) {
    let n = new Set(t.map(o => o.endCode));
    let r = new Set(e.map(o => o.code));
    return [...sSe(e.filter(o => !n.vZc(o.endCode))), ...t.filter(o => !r.vZc(o.code))];
  }
  var fto = __lazy(() => {
    mto();
  });
  function N8i(e) {
    let t = [];
    let n = [];
    for (let r of e) {
      if (r.type === "ansi") {
        t = PNn(t, [r]);
      } else if (r.type === "char") {
        n.push({
          ...r,
          styles: [...t]
        });
      }
    }
    return n;
  }
  var L8i = __lazy(() => {
    RHt();
    fto();
    ONn();
  });
  function hto(e) {
    return e === 12288 || e >= 65281 && e <= 65376 || e >= 65504 && e <= 65510;
  }
  function gto(e) {
    return e >= 4352 && e <= 4447 || e === 8986 || e === 8987 || e === 9001 || e === 9002 || e >= 9193 && e <= 9196 || e === 9200 || e === 9203 || e === 9725 || e === 9726 || e === 9748 || e === 9749 || e >= 9776 && e <= 9783 || e >= 9800 && e <= 9811 || e === 9855 || e >= 9866 && e <= 9871 || e === 9875 || e === 9889 || e === 9898 || e === 9899 || e === 9917 || e === 9918 || e === 9924 || e === 9925 || e === 9934 || e === 9940 || e === 9962 || e === 9970 || e === 9971 || e === 9973 || e === 9978 || e === 9981 || e === 9989 || e === 9994 || e === 9995 || e === 10024 || e === 10060 || e === 10062 || e >= 10067 && e <= 10069 || e === 10071 || e >= 10133 && e <= 10135 || e === 10160 || e === 10175 || e === 11035 || e === 11036 || e === 11088 || e === 11093 || e >= 11904 && e <= 11929 || e >= 11931 && e <= 12019 || e >= 12032 && e <= 12245 || e >= 12272 && e <= 12287 || e >= 12289 && e <= 12350 || e >= 12353 && e <= 12438 || e >= 12441 && e <= 12543 || e >= 12549 && e <= 12591 || e >= 12593 && e <= 12686 || e >= 12688 && e <= 12773 || e >= 12783 && e <= 12830 || e >= 12832 && e <= 12871 || e >= 12880 && e <= 42124 || e >= 42128 && e <= 42182 || e >= 43360 && e <= 43388 || e >= 44032 && e <= 55203 || e >= 63744 && e <= 64255 || e >= 65040 && e <= 65049 || e >= 65072 && e <= 65106 || e >= 65108 && e <= 65126 || e >= 65128 && e <= 65131 || e >= 94176 && e <= 94180 || e >= 94192 && e <= 94198 || e >= 94208 && e <= 101589 || e >= 101631 && e <= 101662 || e >= 101760 && e <= 101874 || e >= 110576 && e <= 110579 || e >= 110581 && e <= 110587 || e === 110589 || e === 110590 || e >= 110592 && e <= 110882 || e === 110898 || e >= 110928 && e <= 110930 || e === 110933 || e >= 110948 && e <= 110951 || e >= 110960 && e <= 111355 || e >= 119552 && e <= 119638 || e >= 119648 && e <= 119670 || e === 126980 || e === 127183 || e === 127374 || e >= 127377 && e <= 127386 || e >= 127488 && e <= 127490 || e >= 127504 && e <= 127547 || e >= 127552 && e <= 127560 || e === 127568 || e === 127569 || e >= 127584 && e <= 127589 || e >= 127744 && e <= 127776 || e >= 127789 && e <= 127797 || e >= 127799 && e <= 127868 || e >= 127870 && e <= 127891 || e >= 127904 && e <= 127946 || e >= 127951 && e <= 127955 || e >= 127968 && e <= 127984 || e === 127988 || e >= 127992 && e <= 128062 || e === 128064 || e >= 128066 && e <= 128252 || e >= 128255 && e <= 128317 || e >= 128331 && e <= 128334 || e >= 128336 && e <= 128359 || e === 128378 || e === 128405 || e === 128406 || e === 128420 || e >= 128507 && e <= 128591 || e >= 128640 && e <= 128709 || e === 128716 || e >= 128720 && e <= 128722 || e >= 128725 && e <= 128728 || e >= 128732 && e <= 128735 || e === 128747 || e === 128748 || e >= 128756 && e <= 128764 || e >= 128992 && e <= 129003 || e === 129008 || e >= 129292 && e <= 129338 || e >= 129340 && e <= 129349 || e >= 129351 && e <= 129535 || e >= 129648 && e <= 129660 || e >= 129664 && e <= 129674 || e >= 129678 && e <= 129734 || e === 129736 || e >= 129741 && e <= 129756 || e >= 129759 && e <= 129770 || e >= 129775 && e <= 129784 || e >= 131072 && e <= 196605 || e >= 196608 && e <= 262141;
  }
  var F8i = () => {};
  var U8i = __lazy(() => {
    F8i();
  });
  function yto(e) {
    if (!Number.isInteger(e)) {
      return false;
    }
    return hto(e) || gto(e);
  }
  var B8i = __lazy(() => {
    U8i();
  });
  function $7d(e, t) {
    e = e.slice(t);
    for (let r = 1; r < dto.length; r++) {
      if (e.charCodeAt(r) !== dto[r]) {
        return;
      }
    }
    let n = e.indexOf("\x07", ("\x1B]8;;").length);
    if (n === -1) {
      return;
    }
    return e.slice(0, n + 1);
  }
  function G7d(e) {
    for (let t = 2; t < e.length; t++) {
      let n = e.charCodeAt(t);
      if (n === 109) {
        return t;
      }
      if (n === 59) {
        continue;
      }
      if (n >= 48 && n <= 57) {
        continue;
      }
      break;
    }
    return -1;
  }
  function V7d(e, t) {
    e = e.slice(t);
    let n = G7d(e);
    if (n === -1) {
      return;
    }
    return e.slice(0, n + 1);
  }
  function z7d(e) {
    if (!e.includes(";")) {
      return [e];
    }
    let t = e.slice(2, -1).split(";");
    let n = [];
    for (let r = 0; r < t.length; r++) {
      let o = t[r];
      if (o === "38" || o === "48") {
        if (r + 2 < t.length && t[r + 1] === "5") {
          n.push(t.slice(r, r + 3).join(";"));
          r += 2;
          continue;
        } else if (r + 4 < t.length && t[r + 1] === "2") {
          n.push(t.slice(r, r + 5).join(";"));
          r += 4;
          continue;
        }
      }
      n.push(o);
    }
    return n.map(r => `\x1B[${r}m`);
  }
  function Vlt(e, t = Number.POSITIVE_INFINITY) {
    let n = [];
    let r = 0;
    let o = 0;
    while (r < e.length) {
      let s = e.codePointAt(r);
      if (P8i.vZc(s)) {
        let l;
        let c = e.codePointAt(r + 1);
        if (c === D8i) {
          if (l = $7d(e, r), l) {
            n.push({
              type: "ansi",
              code: l,
              endCode: pto(l)
            });
          }
        } else if (c === O8i) {
          if (l = V7d(e, r), l) {
            let u = z7d(l);
            for (let d of u) {
              n.push({
                type: "ansi",
                code: d,
                endCode: pto(d)
              });
            }
          }
        }
        if (l) {
          r += l.length;
          continue;
        }
      }
      let i = yto(s);
      let a = String.fromCodePoint(s);
      if (n.push({
        type: "char",
        value: a,
        fullWidth: i
      }), r += a.length, o += i ? 2 : a.length, o >= t) {
        break;
      }
    }
    return n;
  }
  var $8i = __lazy(() => {
    B8i();
    RHt();
  });
  var zlt = __lazy(() => {
    RHt();
    fto();
    ONn();
    mto();
    L8i();
    $8i();
  });
  function j8i(e) {
    let t = mPe();
    let n = [...t.feed(e), ...t.flush()];
    let r = [];
    for (let o of n) {
      if (o.type === "text") {
        for (let {
          segment: i
        } of JS().segment(o.value)) {
          r.push({
            type: "char",
            value: i
          });
        }
        continue;
      }
      let s = o.value;
      if (s.charCodeAt(1) === nG.CSI && s.endsWith("m")) {
        for (let i of Vlt(s)) {
          if (i.type === "ansi") {
            r.push(i);
          }
        }
      } else if (s.startsWith("\x1B]8;") && (s.endsWith("\x07") || s.endsWith("\x1B\\"))) {
        let i = s.endsWith("\x1B\\") ? s.slice(0, -2) + "\x07" : s;
        r.push({
          type: "ansi",
          code: i,
          endCode: K7d
        });
      }
    }
    return r;
  }
  function Y7d(e) {
    return e.code === e.endCode;
  }
  function Klt(e) {
    return e.filter(t => !Y7d(t));
  }
  function KF(e, t, n) {
    let r = j8i(e);
    let o = [];
    let s = 0;
    let i = "";
    let a = false;
    for (let c of r) {
      let u = c.type === "ansi" ? 0 : an(c.value);
      if (n !== undefined && s >= n) {
        if (c.type === "ansi" || u > 0 || !a) {
          break;
        }
      }
      if (c.type === "ansi") {
        if (o.push(c), a) {
          i += c.code;
        }
      } else {
        if (!a && s >= t) {
          if (t > 0 && u === 0) {
            continue;
          }
          a = true;
          o = Klt(GJ(o));
          i = zF(o);
        }
        if (a) {
          i += c.value;
        }
        s += u;
      }
    }
    let l = Klt(GJ(o));
    i += zF(sSe(l));
    return i;
  }
  function q8i(e, t) {
    let n = j8i(e);
    let r = 0;
    let o = [];
    let s = "";
    let i = false;
    let a = false;
    let l = [];
    let c = "";
    let u = false;
    for (let m of n) {
      let f = m.type === "ansi" ? 0 : an(m.value);
      if (!a) {
        if (r >= t && (m.type === "ansi" || f > 0 || !i)) {
          a = true;
        } else if (m.type === "ansi") {
          if (o.push(m), i) {
            s += m.code;
          }
        } else {
          if (!i) {
            i = true;
            o = Klt(GJ(o));
            s = zF(o);
          }
          s += m.value;
        }
      }
      if (m.type === "ansi") {
        if (l.push(m), u) {
          c += m.code;
        }
      } else {
        if (!u && r >= t) {
          if (!(t > 0 && f === 0)) {
            u = true;
            l = Klt(GJ(l));
            c = zF(l);
          }
        }
        if (u) {
          c += m.value;
        }
      }
      if (m.type !== "ansi") {
        r += f;
      }
    }
    let d = Klt(GJ(o));
    s += zF(sSe(d));
    let p = Klt(GJ(l));
    c += zF(sSe(p));
    return [s, c];
  }
  var K7d;
  var yPe = __lazy(() => {
    zlt();
    bc();
    ore();
    _Ht();
    PP();
    K7d = `\x1B]8;;${"\x07"}`;
  });
  function MNn(e, t, n) {
    let r = KF(e, t, n);
    while (an(r) > n - t && n > t) {
      n--;
      r = KF(e, t, n);
    }
    return r;
  }
  function J7d(e, t, n) {
    if (t < 1) {
      return "";
    }
    let r = an(e);
    if (r <= t) {
      return e;
    }
    if (t === 1) {
      return "\u2026";
    }
    if (n === "start") {
      return "\u2026" + MNn(e, r - t + 1, r);
    }
    if (n === "middle") {
      let o = Math.floor(t / 2);
      return MNn(e, 0, o) + "\u2026" + MNn(e, r - (t - o) + 1, r);
    }
    return MNn(e, 0, t - 1) + "\u2026";
  }
  function wrapText_export(e, t, n = "wrap") {
    if (n === "wrap" || n === "wrap-stream") {
      return MB(e, t, {
        trim: false,
        hard: true
      });
    }
    if (n === "wrap-trim") {
      return MB(e, t, {
        trim: true,
        hard: true
      });
    }
    if (n === "end" || n === "middle" || n.startsWith("truncate")) {
      let r = "end";
      if (n === "truncate-middle" || n === "middle") {
        r = "middle";
      }
      if (n === "truncate-start") {
        r = "start";
      }
      return J7d(e, t, r);
    }
    return e;
  }
  var xHt = __lazy(() => {
    yPe();
    bc();
    Kge();
  });
  function _to(e) {
    let t = e;
    while (t && !t.hasAbsoluteDescendant) {
      t.hasAbsoluteDescendant = true;
      t = t.parentNode;
    }
  }
  function W8i(e, t, n = false) {
    if (t.nodeName === "#text") {
      return;
    }
    let r = t;
    let o = n || r.style.position === "absolute";
    let s = Kg.get(r);
    if (s) {
      v8i(e, s, o);
      Kg.delete(r);
    }
    for (let i of r.childNodes) {
      W8i(e, i, o);
    }
  }
  function X7d(e, t) {
    return V8i(e, t);
  }
  function V8i(e, t) {
    if (e === t) {
      return true;
    }
    if (e === undefined || t === undefined) {
      return false;
    }
    let n = Object.keys(e);
    let r = Object.keys(t);
    if (n.length !== r.length) {
      return false;
    }
    for (let o of n) {
      if (!Object.hasOwn(t, o) || e[o] !== t[o]) {
        return false;
      }
    }
    return true;
  }
  function eYd(e) {
    return e.nodeName !== "#text";
  }
  function Y8i(e, t) {
    let n = [];
    r(e, 0);
    return n;
    function r(o, s) {
      let i = o.yogaNode;
      if (!i || i.getDisplay() === 1) {
        return;
      }
      let a = s + i.getComputedTop();
      let l = i.getComputedHeight();
      if (t < a || t >= a + l) {
        return;
      }
      if (o.debugOwnerChain) {
        n = o.debugOwnerChain;
      }
      for (let c of o.childNodes) {
        if (eYd(c)) {
          r(c, a);
        }
      }
    }
  }
  var kHt = e => {
    let n = {
      nodeName: e,
      attributes: {},
      childNodes: [],
      textStyles: undefined,
      accessibility: undefined,
      onComputeLayout: undefined,
      onRender: undefined,
      onImmediateRender: undefined,
      hasRenderedContent: undefined,
      dirty: false,
      isHidden: undefined,
      _eventHandlers: undefined,
      _holdsRawModeRef: undefined,
      scrollTop: undefined,
      pendingScrollDelta: undefined,
      scrollClampMin: undefined,
      scrollClampMax: undefined,
      scrollHeight: undefined,
      scrollHeightHwm: undefined,
      scrollViewportHeight: undefined,
      scrollViewportTop: undefined,
      scrollTopRendered: undefined,
      stickyScroll: undefined,
      scrollAnchor: undefined,
      focusManager: undefined,
      setRawMode: undefined,
      _pendingRawModeDelta: undefined,
      debugOwnerChain: undefined,
      hasAbsoluteDescendant: undefined,
      parentNode: undefined,
      yogaNode: e !== "ink-virtual-text" && e !== "ink-link" && e !== "ink-progress" ? F8d.Node.create() : undefined,
      style: {}
    };
    if (e === "ink-text") {
      n.yogaNode?.setMeasureFunc(Q7d.bind(null, n));
    } else if (e === "ink-raw-ansi") {
      n.yogaNode?.setMeasureFunc(Z7d.bind(null, n));
    }
    return n;
  };
  var NNn = (e, t) => {
    if (t.parentNode) {
      AHt(t.parentNode, t);
    }
    if (t.parentNode = e, e.childNodes.push(t), t.yogaNode) {
      e.yogaNode?.insertChild(t.yogaNode, e.yogaNode.getChildCount());
    }
    if (t.style.position === "absolute" || t.hasAbsoluteDescendant) {
      _to(e);
    }
    d1(e);
  };
  var bto = (e, t, n) => {
    if (t.parentNode) {
      AHt(t.parentNode, t);
    }
    if (t.parentNode = e, t.style.position === "absolute" || t.nodeName !== "#text" && t.hasAbsoluteDescendant) {
      _to(e);
    }
    let r = e.childNodes.indexOf(n);
    if (r >= 0) {
      let o = 0;
      if (t.yogaNode && e.yogaNode) {
        for (let s = 0; s < r; s++) {
          if (e.childNodes[s]?.yogaNode) {
            o++;
          }
        }
      }
      if (e.childNodes.splice(r, 0, t), t.yogaNode && e.yogaNode) {
        e.yogaNode.insertChild(t.yogaNode, o);
      }
      d1(e);
      return;
    }
    if (e.childNodes.push(t), t.yogaNode) {
      e.yogaNode?.insertChild(t.yogaNode, e.yogaNode.getChildCount());
    }
    d1(e);
  };
  var AHt = (e, t) => {
    if (t.yogaNode) {
      t.parentNode?.yogaNode?.removeChild(t.yogaNode);
    }
    W8i(e, t);
    t.parentNode = undefined;
    let n = e.childNodes.indexOf(t);
    if (n >= 0) {
      e.childNodes.splice(n, 1);
    }
    d1(e);
  };
  var Sto = (e, t, n) => {
    if (t === "children") {
      return;
    }
    if (e.attributes[t] === n) {
      return;
    }
    e.attributes[t] = n;
    d1(e);
  };
  var Tto = (e, t) => {
    e.accessibility = t;
  };
  var Eto = (e, t) => {
    if (X7d(e.style, t)) {
      return;
    }
    let n = t.position === "absolute" && e.style.position !== "absolute";
    if (e.style = t, n && e.parentNode) {
      _to(e.parentNode);
    }
    d1(e);
  };
  var G8i = (e, t) => {
    if (V8i(e.textStyles, t)) {
      return;
    }
    e.textStyles = t;
    d1(e);
  };
  var z8i = e => {
    let t = {
      nodeName: "#text",
      nodeValue: e,
      yogaNode: undefined,
      parentNode: undefined,
      style: {}
    };
    IHt(t, e);
    return t;
  };
  var Q7d = function (e, t, n) {
    let r = e.nodeName === "#text" ? e.nodeValue : ato(e);
    let o = R8i(r);
    let s = e.style?.textWrap ?? "wrap";
    if (s === "wrap-stream") {
      let l = D7d(wrapText_export(o, t, "wrap"), t);
      return {
        width: l.width,
        height: Math.max(0, l.height - 1)
      };
    }
    let i = D7d(o, t);
    if (i.width <= t) {
      return i;
    }
    if (i.width >= 1 && t > 0 && t < 1) {
      return i;
    }
    if (o.includes(`
`) && n === 0) {
      let l = Math.max(t, i.width);
      return D7d(o, l);
    }
    let a = wrapText_export(o, t, s);
    return D7d(a, t);
  };
  var Z7d = function (e) {
    return {
      width: e.attributes.rawWidth,
      height: e.attributes.rawHeight
    };
  };
  var d1 = e => {
    let t = e;
    let n = false;
    while (t) {
      if (t.nodeName !== "#text") {
        if (t.dirty = true, !n && (t.nodeName === "ink-text" || t.nodeName === "ink-raw-ansi") && t.yogaNode) {
          t.yogaNode.markDirty();
          n = true;
        }
      }
      t = t.parentNode;
    }
  };
  var K8i = e => {
    let t = e;
    while (t?.parentNode) {
      t = t.parentNode;
    }
    if (t && t.nodeName !== "#text") {
      t.onRender?.();
    }
  };
  var IHt = (e, t) => {
    if (typeof t !== "string") {
      t = String(t);
    }
    if (e.nodeValue === t) {
      return;
    }
    e.nodeValue = t;
    d1(e);
  };
  var vto = e => {
    if ("childNodes" in e) {
      for (let t of e.childNodes) {
        vto(t);
      }
    }
    e.yogaNode = undefined;
  };
  var Ylt = __lazy(() => {
    gPe();
    oSe();
    x8i();
    xHt();
  });
  var J8i;
  var wto;
  var Cto;
  var Rto = __lazy(() => {
    J8i = {
      keydown: {
        bubble: "onKeyDown",
        capture: "onKeyDownCapture"
      },
      focus: {
        bubble: "onFocus",
        capture: "onFocusCapture"
      },
      blur: {
        bubble: "onBlur",
        capture: "onBlurCapture"
      },
      paste: {
        bubble: "onPaste",
        capture: "onPasteCapture"
      },
      wheel: {
        bubble: "onWheel",
        capture: "onWheelCapture"
      },
      action: {
        bubble: "onAction",
        capture: "onActionCapture"
      },
      resize: {
        bubble: "onResize"
      },
      click: {
        bubble: "onClick"
      }
    };
    wto = new Set(["onKeyDown", "onKeyDownCapture", "onPaste", "onPasteCapture", "onWheel", "onWheelCapture"]);
    Cto = new Set(["onKeyDown", "onKeyDownCapture", "onFocus", "onFocusCapture", "onBlur", "onBlurCapture", "onPaste", "onPasteCapture", "onWheel", "onWheelCapture", "onAction", "onActionCapture", "onResize", "onClick", "onMouseEnter", "onMouseLeave"]);
  });
  function X8i(e, t, n) {
    let r = e._eventHandlers;
    if (!r) {
      return;
    }
    let o = J8i[t];
    if (!o) {
      return;
    }
    let s = n ? o.capture : o.bubble;
    if (!s) {
      return;
    }
    return r[s];
  }
  function nYd(e, t) {
    let n = [];
    let r = e;
    while (r) {
      let o = r === e;
      let s = X8i(r, t.type, true);
      let i = X8i(r, t.type, false);
      if (s) {
        n.unshift({
          node: r,
          handler: s,
          phase: o ? "at_target" : "capturing"
        });
      }
      if (i && (t.bubbles || o)) {
        n.push({
          node: r,
          handler: i,
          phase: o ? "at_target" : "bubbling"
        });
      }
      r = r.parentNode;
    }
    return n;
  }
  function rYd(e, t) {
    let n;
    for (let {
      node: r,
      handler: o,
      phase: s
    } of e) {
      if (t._isImmediatePropagationStopped()) {
        break;
      }
      if (t._isPropagationStopped() && r !== n) {
        break;
      }
      t._setEventPhase(s);
      t._setCurrentTarget(r);
      t._prepareForTarget(r);
      try {
        o(t);
      } catch (i) {
        Oe($o(sr(i), "Ink event handler threw"));
      }
      n = r;
    }
  }
  function oYd(e) {
    switch (e) {
      case "keydown":
      case "keyup":
      case "click":
      case "focus":
      case "blur":
      case "paste":
      case "action":
        return fre.DiscreteEventPriority;
      case "resize":
      case "scroll":
      case "wheel":
      case "mousemove":
        return fre.ContinuousEventPriority;
      default:
        return fre.DefaultEventPriority;
    }
  }
  class xto {
    currentEvent = null;
    currentUpdatePriority = fre.DefaultEventPriority;
    discreteUpdates = null;
    resolveEventPriority() {
      if (this.currentUpdatePriority !== fre.NoEventPriority) {
        return this.currentUpdatePriority;
      }
      if (this.currentEvent) {
        return oYd(this.currentEvent.type);
      }
      return fre.DefaultEventPriority;
    }
    dispatch(e, t) {
      let n = this.currentEvent;
      this.currentEvent = t;
      try {
        t._setTarget(e);
        let r = nYd(e, t);
        rYd(r, t);
        t._setEventPhase("none");
        t._setCurrentTarget(null);
        return !t.defaultPrevented;
      } finally {
        this.currentEvent = n;
      }
    }
    dispatchDiscrete(e, t) {
      if (!this.discreteUpdates) {
        return this.dispatch(e, t);
      }
      return this.discreteUpdates((n, r) => this.dispatch(n, r), e, t, undefined, undefined);
    }
    dispatchContinuous(e, t) {
      let n = this.currentUpdatePriority;
      try {
        this.currentUpdatePriority = fre.ContinuousEventPriority;
        return this.dispatch(e, t);
      } finally {
        this.currentUpdatePriority = n;
      }
    }
  }
  var fre;
  var Q8i = __lazy(() => {
    dt();
    Rn();
    Rto();
    fre = __toESM(FMn(), 1);
  });
  var hre;
  var Jlt = __lazy(() => {
    hre = class hre extends Event_export {
      type;
      timeStamp;
      bubbles;
      cancelable;
      _target = null;
      _currentTarget = null;
      _eventPhase = "none";
      _propagationStopped = false;
      _defaultPrevented = false;
      constructor(e, t) {
        super();
        this.type = e;
        this.timeStamp = performance.now();
        this.bubbles = t?.bubbles ?? true;
        this.cancelable = t?.cancelable ?? true;
      }
      get target() {
        return this._target;
      }
      get currentTarget() {
        return this._currentTarget;
      }
      get eventPhase() {
        return this._eventPhase;
      }
      get defaultPrevented() {
        return this._defaultPrevented;
      }
      stopPropagation() {
        this._propagationStopped = true;
      }
      stopImmediatePropagation() {
        super.stopImmediatePropagation();
        this._propagationStopped = true;
      }
      preventDefault() {
        if (this.cancelable) {
          this._defaultPrevented = true;
        }
      }
      consume() {
        this.preventDefault();
        this.stopImmediatePropagation();
      }
      _setTarget(e) {
        this._target = e;
      }
      _setCurrentTarget(e) {
        this._currentTarget = e;
      }
      _setEventPhase(e) {
        this._eventPhase = e;
      }
      _isPropagationStopped() {
        return this._propagationStopped;
      }
      _isImmediatePropagationStopped() {
        return this.didStopImmediatePropagation();
      }
      _prepareForTarget(e) {}
    };
  });
  var _Pe;
  var Z8i = __lazy(() => {
    Jlt();
    _Pe = class _Pe extends hre {
      relatedTarget;
      constructor(e, t = null) {
        super(e, {
          bubbles: true,
          cancelable: false
        });
        this.relatedTarget = t;
      }
    };
  });
  class FocusManager {
    activeElement = null;
    dispatchFocusEvent;
    focusStack = [];
    autoFocusStack = [];
    listeners = new Set();
    constructor(e) {
      this.dispatchFocusEvent = e;
    }
    subscribe = e => (this.listeners.add(e), () => this.listeners.delete(e));
    notify() {
      for (let e of this.listeners) {
        e();
      }
    }
    focus(e) {
      if (e === this.activeElement) {
        return;
      }
      let t = this.activeElement;
      if (t) {
        let n = this.focusStack.indexOf(t);
        if (n !== -1) {
          this.focusStack.splice(n, 1);
        }
        if (this.focusStack.push(t), this.focusStack.length > 32) {
          this.focusStack.shift();
        }
        this.dispatchFocusEvent(t, new _Pe("blur", e));
      }
      this.activeElement = e;
      this.dispatchFocusEvent(e, new _Pe("focus", t));
      this.notify();
    }
    blur() {
      if (!this.activeElement) {
        return;
      }
      let e = this.activeElement;
      this.activeElement = null;
      this.dispatchFocusEvent(e, new _Pe("blur", null));
      this.notify();
    }
    handleNodeRemoved(e, t) {
      if (this.focusStack = this.focusStack.filter(o => o !== e && gre(o, t)), this.autoFocusStack = this.autoFocusStack.filter(o => o !== e && gre(o, t)), !this.activeElement) {
        return;
      }
      if (this.activeElement !== e && gre(this.activeElement, t)) {
        return;
      }
      let n = this.activeElement;
      this.activeElement = null;
      this.dispatchFocusEvent(n, new _Pe("blur", null));
      while (this.focusStack.length > 0) {
        let o = this.focusStack.pop();
        if (gre(o, t)) {
          this.activeElement = o;
          this.dispatchFocusEvent(o, new _Pe("focus", n));
          this.notify();
          return;
        }
      }
      let r = this.autoFocusStack.at(-1);
      if (r) {
        this.activeElement = r;
        this.dispatchFocusEvent(r, new _Pe("focus", n));
      }
      this.notify();
    }
    pushAutoFocusFallback(e) {
      if (this.autoFocusStack.at(-1) === e) {
        return;
      }
      let t = this.autoFocusStack.indexOf(e);
      if (t !== -1) {
        this.autoFocusStack.splice(t, 1);
      }
      if (this.autoFocusStack.push(e), this.autoFocusStack.length > 32) {
        this.autoFocusStack.shift();
      }
    }
    handleAutoFocus(e) {
      this.pushAutoFocusFallback(e);
      this.focus(e);
    }
    handleClickFocus(e) {
      if (typeof e.attributes.tabIndex !== "number") {
        return;
      }
      this.focus(e);
    }
    focusNext(e) {
      this.moveFocus(1, e);
    }
    focusPrevious(e) {
      this.moveFocus(-1, e);
    }
    focusDirection(e, t) {
      if (!this.activeElement) {
        this.moveFocus(1, t);
        return true;
      }
      let n = rVi(this.activeElement);
      if (!n) {
        return false;
      }
      let r = null;
      let o = 1 / 0;
      for (let s of kto(t)) {
        if (s === this.activeElement) {
          continue;
        }
        let i = rVi(s);
        if (!i) {
          continue;
        }
        let a = sYd(n, i, e);
        if (a < o) {
          o = a;
          r = s;
        }
      }
      if (r) {
        this.focus(r);
        return true;
      }
      return false;
    }
    moveFocus(e, t) {
      let n = kto(t);
      if (n.length === 0) {
        return;
      }
      let r = this.activeElement ? n.indexOf(this.activeElement) : -1;
      let o = r === -1 ? e === 1 ? 0 : n.length - 1 : (r + e + n.length) % n.length;
      let s = n[o];
      if (s) {
        this.focus(s);
      }
    }
  }
  function kto(e) {
    let t = [];
    oVi(e, t);
    return t;
  }
  function oVi(e, t) {
    let n = e.attributes.tabIndex;
    if (typeof n === "number" && n >= 0) {
      t.push(e);
    }
    for (let r of e.childNodes) {
      if (r.nodeName !== "#text") {
        oVi(r, t);
      }
    }
  }
  function sVi(e) {
    for (let t of e.childNodes) {
      if (t.nodeName === "#text") {
        continue;
      }
      if (kto(t).length > 0) {
        return true;
      }
    }
    return false;
  }
  function sYd(e, t, n) {
    let r = e.x + e.width / 2;
    let o = e.y + e.height / 2;
    let s = t.x + t.width / 2;
    let i = t.y + t.height / 2;
    let a = n === "left" || n === "right";
    let l = n === "right" || n === "down" ? 1 : -1;
    let c = (a ? s - r : i - o) * l;
    if (c <= 0) {
      return 1 / 0;
    }
    let u = a ? tVi(o, t.y, t.height) : tVi(r, t.x, t.width);
    let d = a ? nVi(e.y, e.height, t.y, t.height) : nVi(e.x, e.width, t.x, t.width);
    return c + (a ? 2 : 0.5) * u - d;
  }
  function tVi(e, t, n) {
    if (e < t) {
      return t - e;
    }
    if (e > t + n) {
      return e - (t + n);
    }
    return 0;
  }
  function nVi(e, t, n, r) {
    return Math.max(0, Math.min(e + t, n + r) - Math.max(e, n));
  }
  function rVi(e) {
    let t = Kg.get(e);
    if (t) {
      return t;
    }
    let n = e.yogaNode;
    if (!n) {
      return;
    }
    let r = n.getComputedLeft();
    let o = n.getComputedTop();
    let s = e.parentNode;
    while (s) {
      let i = Kg.get(s);
      if (i) {
        return {
          x: i.x + r,
          y: i.y + o,
          width: n.getComputedWidth(),
          height: n.getComputedHeight()
        };
      }
      if (s.yogaNode) {
        r += s.yogaNode.getComputedLeft();
        o += s.yogaNode.getComputedTop();
      }
      s = s.parentNode;
    }
    return;
  }
  function gre(e, t) {
    let n = e;
    while (n) {
      if (n === t) {
        return true;
      }
      n = n.parentNode;
    }
    return false;
  }
  function Qlt(e) {
    let t = e;
    while (t) {
      if (t.focusManager) {
        return t;
      }
      t = t.parentNode;
    }
    throw Error("Node is not in a tree with a FocusManager");
  }
  function yre(e) {
    return Qlt(e).focusManager;
  }
  var iSe = __lazy(() => {
    Z8i();
    oSe();
  });
  function iYd(e) {
    return e === "absolute" ? 2 : 1;
  }
  function aYd(e) {
    return e === "none" ? 1 : 0;
  }
  function lYd(e) {
    switch (e) {
      case "wrap":
        return 1;
      case "wrap-reverse":
        return 2;
      default:
        return 0;
    }
  }
  function cYd(e) {
    switch (e) {
      case "row":
        return 2;
      case "row-reverse":
        return 3;
      case "column-reverse":
        return 1;
      default:
        return 0;
    }
  }
  function iVi(e, t) {
    switch (e) {
      case "auto":
        return 0;
      case "stretch":
        return 4;
      case "flex-start":
        return 1;
      case "center":
        return 2;
      case "flex-end":
        return 3;
      default:
        return t;
    }
  }
  function uYd(e) {
    switch (e) {
      case "center":
        return 1;
      case "flex-end":
        return 2;
      case "space-between":
        return 3;
      case "space-around":
        return 4;
      case "space-evenly":
        return 5;
      default:
        return 0;
    }
  }
  function LNn(e, t, n) {
    if (typeof n === "string") {
      e.setPositionPercent(t, Number.parseInt(n, 10));
    } else if (typeof n === "number") {
      e.setPosition(t, n);
    } else {
      e.setPosition(t, Number.NaN);
    }
  }
  var dYd = (e, t) => {
    if ("position" in t) {
      e.setPositionType(iYd(t.position));
    }
    if ("top" in t) {
      LNn(e, 1, t.top);
    }
    if ("bottom" in t) {
      LNn(e, 3, t.bottom);
    }
    if ("left" in t) {
      LNn(e, 0, t.left);
    }
    if ("right" in t) {
      LNn(e, 2, t.right);
    }
  };
  var pYd = (e, t) => {
    let n = t.overflowY ?? t.overflow;
    let r = t.overflowX ?? t.overflow;
    if (n === "scroll" || r === "scroll") {
      e.setOverflow(2);
    } else if (n === "hidden" || r === "hidden") {
      e.setOverflow(1);
    } else if ("overflow" in t || "overflowX" in t || "overflowY" in t) {
      e.setOverflow(0);
    }
  };
  var mYd = (e, t) => {
    if ("margin" in t) {
      e.setMargin(8, t.margin ?? 0);
    }
    if ("marginX" in t) {
      e.setMargin(6, t.marginX ?? 0);
    }
    if ("marginY" in t) {
      e.setMargin(7, t.marginY ?? 0);
    }
    if ("marginLeft" in t) {
      let n = t.marginLeft;
      if (n === "auto") {
        e.setMarginAuto(4);
      } else {
        e.setMargin(4, n || 0);
      }
    }
    if ("marginRight" in t) {
      let n = t.marginRight;
      if (n === "auto") {
        e.setMarginAuto(5);
      } else {
        e.setMargin(5, n || 0);
      }
    }
    if ("marginTop" in t) {
      e.setMargin(1, t.marginTop || 0);
    }
    if ("marginBottom" in t) {
      e.setMargin(3, t.marginBottom || 0);
    }
  };
  var fYd = (e, t) => {
    if ("padding" in t) {
      e.setPadding(8, t.padding ?? 0);
    }
    if ("paddingX" in t) {
      e.setPadding(6, t.paddingX ?? 0);
    }
    if ("paddingY" in t) {
      e.setPadding(7, t.paddingY ?? 0);
    }
    if ("paddingLeft" in t) {
      e.setPadding(0, t.paddingLeft || 0);
    }
    if ("paddingRight" in t) {
      e.setPadding(2, t.paddingRight || 0);
    }
    if ("paddingTop" in t) {
      e.setPadding(1, t.paddingTop || 0);
    }
    if ("paddingBottom" in t) {
      e.setPadding(3, t.paddingBottom || 0);
    }
  };
  var hYd = (e, t) => {
    if ("flexGrow" in t) {
      e.setFlexGrow(t.flexGrow ?? 0);
    }
    if ("flexShrink" in t) {
      let n = t.flexShrink;
      e.setFlexShrink(typeof n === "number" ? n : 1);
    }
    if ("flexWrap" in t) {
      e.setFlexWrap(lYd(t.flexWrap));
    }
    if ("flexDirection" in t) {
      e.setFlexDirection(cYd(t.flexDirection));
    }
    if ("flexBasis" in t) {
      let n = t.flexBasis;
      if (typeof n === "number") {
        e.setFlexBasis(n);
      } else if (typeof n === "string") {
        e.setFlexBasisPercent(Number.parseInt(n, 10));
      } else {
        e.setFlexBasis(Number.NaN);
      }
    }
    if ("alignItems" in t) {
      e.setAlignItems(iVi(t.alignItems, 4));
    }
    if ("alignSelf" in t) {
      e.setAlignSelf(iVi(t.alignSelf, 0));
    }
    if ("justifyContent" in t) {
      e.setJustifyContent(uYd(t.justifyContent));
    }
  };
  var gYd = (e, t) => {
    if ("width" in t) {
      let n = t.width;
      if (typeof n === "number") {
        e.setWidth(n);
      } else if (typeof n === "string") {
        e.setWidthPercent(Number.parseInt(n, 10));
      } else {
        e.setWidthAuto();
      }
    }
    if ("height" in t) {
      let n = t.height;
      if (typeof n === "number") {
        e.setHeight(n);
      } else if (typeof n === "string") {
        e.setHeightPercent(Number.parseInt(n, 10));
      } else {
        e.setHeightAuto();
      }
    }
    if ("minWidth" in t) {
      let n = t.minWidth;
      if (typeof n === "string") {
        e.setMinWidthPercent(Number.parseInt(n, 10));
      } else {
        e.setMinWidth(n ?? 0);
      }
    }
    if ("minHeight" in t) {
      let n = t.minHeight;
      if (typeof n === "string") {
        e.setMinHeightPercent(Number.parseInt(n, 10));
      } else {
        e.setMinHeight(n ?? 0);
      }
    }
    if ("maxWidth" in t) {
      let n = t.maxWidth;
      if (typeof n === "string") {
        e.setMaxWidthPercent(Number.parseInt(n, 10));
      } else {
        e.setMaxWidth(n);
      }
    }
    if ("maxHeight" in t) {
      let n = t.maxHeight;
      if (typeof n === "string") {
        e.setMaxHeightPercent(Number.parseInt(n, 10));
      } else {
        e.setMaxHeight(n);
      }
    }
  };
  var yYd = (e, t) => {
    if ("display" in t) {
      e.setDisplay(aYd(t.display));
    }
  };
  var _Yd = (e, t, n) => {
    let r = n ?? t;
    if ("borderStyle" in t) {
      let o = t.borderStyle ? 1 : 0;
      e.setBorder(1, r.borderTop !== false ? o : 0);
      e.setBorder(3, r.borderBottom !== false ? o : 0);
      e.setBorder(0, r.borderLeft !== false ? o : 0);
      e.setBorder(2, r.borderRight !== false ? o : 0);
    } else {
      let o = r.borderStyle ? 1 : 0;
      if ("borderTop" in t) {
        e.setBorder(1, t.borderTop === false ? 0 : o);
      }
      if ("borderBottom" in t) {
        e.setBorder(3, t.borderBottom === false ? 0 : o);
      }
      if ("borderLeft" in t) {
        e.setBorder(0, t.borderLeft === false ? 0 : o);
      }
      if ("borderRight" in t) {
        e.setBorder(2, t.borderRight === false ? 0 : o);
      }
    }
  };
  var bYd = (e, t) => {
    if ("gap" in t) {
      e.setGap(2, t.gap ?? 0);
    }
    if ("columnGap" in t) {
      e.setGap(0, t.columnGap ?? 0);
    }
    if ("rowGap" in t) {
      e.setGap(1, t.rowGap ?? 0);
    }
  };
  var SYd = (e, t = {}, n) => {
    dYd(e, t);
    pYd(e, t);
    mYd(e, t);
    fYd(e, t);
    hYd(e, t);
    gYd(e, t);
    yYd(e, t);
    _Yd(e, t, n);
    bYd(e, t);
  };
  function fVi(e, t, n) {
    if (!e._eventHandlers) {
      e._eventHandlers = {};
    }
    e._eventHandlers[t] = n;
  }
  function TYd(e) {
    let t = e._eventHandlers;
    if (!t) {
      return false;
    }
    for (let n of wto) {
      if (t[n] != null) {
        return true;
      }
    }
    return false;
  }
  function hVi(e, t) {
    if (e.setRawMode) {
      e.setRawMode(t > 0);
    } else {
      e._pendingRawModeDelta = (e._pendingRawModeDelta ?? 0) + t;
    }
  }
  function uVi(e, t) {
    let n = TYd(e);
    if (n === !!e._holdsRawModeRef) {
      return;
    }
    e._holdsRawModeRef = n;
    hVi(t, n ? 1 : -1);
  }
  function Mto(e, t) {
    if (e._holdsRawModeRef) {
      e._holdsRawModeRef = false;
      hVi(t, -1);
    }
    for (let n of e.childNodes) {
      if (n.nodeName !== "#text") {
        Mto(n, t);
      }
    }
  }
  function EYd(e, t, n) {
    if (t === "children") {
      return;
    }
    if (t === "style") {
      if (Eto(e, n), e.yogaNode) {
        SYd(e.yogaNode, n);
      }
      return;
    }
    if (t === "textStyles") {
      e.textStyles = n;
      return;
    }
    if (t === "accessibility") {
      Tto(e, n);
      return;
    }
    if (Cto.vZc(t)) {
      fVi(e, t, n);
      return;
    }
    Sto(e, t, n);
  }
  function gVi(e) {
    let t = [];
    let n = new Set();
    let r = e;
    for (let o = 0; r && o < 50; o++) {
      if (n.vZc(r)) {
        break;
      }
      n.add(r);
      let s = r.elementType;
      let i = typeof s === "function" ? s.displayName || s.name : typeof s === "string" ? undefined : s?.displayName || s?.name;
      if (i && i !== t.at(-1)) {
        t.push(i);
      }
      r = r._debugOwner ?? r.return;
    }
    return t;
  }
  function dVi(e) {
    try {
      let t = gVi(e);
      return t.length > 0 ? ` (owner chain: ${t.join(" > ")})` : "";
    } catch {
      return "";
    }
  }
  function Lto() {
    if (Ito === undefined) {
      Ito = Me.CLAUDE_CODE_DEBUG_REPAINTS;
    }
    return Ito;
  }
  function yVi(e) {
    Fto = e;
  }
  function _Vi() {
    return Fto;
  }
  function bVi() {
    OHt = performance.now();
  }
  function SVi() {
    return Uto;
  }
  function TVi() {
    Fto = 0;
    Uto = 0;
    OHt = 0;
  }
  var PHt;
  var mVi;
  var lVi = (e, t) => {
    if (e === t) {
      return;
    }
    if (!e) {
      return t;
    }
    let n = {};
    let r = false;
    for (let o of Object.keys(e)) {
      if (t ? !Object.hasOwn(t, o) : true) {
        n[o] = undefined;
        r = true;
      }
    }
    if (t) {
      for (let o of Object.keys(t)) {
        if (t[o] !== e[o]) {
          n[o] = t[o];
          r = true;
        }
      }
    }
    return r ? n : undefined;
  };
  var cVi = e => {
    let t = e.yogaNode;
    if (t) {
      t.unsetMeasureFunc();
      vto(e);
      t.freeRecursive();
    }
  };
  var Ito;
  var X8;
  var _re;
  var Fto = 0;
  var Uto = 0;
  var OHt = 0;
  var Nto;
  function FWe(e, t) {
    let n = Math.min(e.x, t.x);
    let r = Math.min(e.y, t.y);
    let o = Math.max(e.x + e.width, t.x + t.width);
    let s = Math.max(e.y + e.height, t.y + t.height);
    return {
      x: n,
      y: r,
      width: o - n,
      height: s - r
    };
  }
  function j_(e, t, n) {
    if (t !== undefined && e < t) {
      return t;
    }
    if (n !== undefined && e > n) {
      return n;
    }
    return e;
  }
  var Q8 = () => {};
  function $k(e, t) {
    if (e === undefined) {
      return;
    }
    if (Number.isInteger(e)) {
      return;
    }
    logForDebugging(`${t} should be an integer, got ${e}`, {
      level: "warn"
    });
  }
  var Bto = __lazy(() => {
    je();
  });
  function vYd(e, t) {
    let n = 0;
    let r = 0;
    for (let o of e) {
      if (o.code === "\x1B[1m") {
        n |= 1;
      } else if (o.code === "\x1B[2m") {
        n |= 2;
      }
    }
    for (let o of t) {
      if (o.code === "\x1B[1m") {
        r |= 1;
      } else if (o.code === "\x1B[2m") {
        r |= 2;
      }
    }
    if (n & ~r && r) {
      let o = n & r;
      return "\x1B[22m" + (o & 1 ? "\x1B[1m" : "") + (o & 2 ? "\x1B[2m" : "");
    }
    return "";
  }
  class $Nn {
    strings = [" ", ""];
    stringMap = new Map([[" ", 0], ["", 1]]);
    ascii = PYd();
    intern(e) {
      if (e.length === 1) {
        let r = e.charCodeAt(0);
        if (r < 128) {
          let o = this.ascii[r];
          if (o !== -1) {
            return o;
          }
          let s = this.strings.length;
          this.strings.push(e);
          this.ascii[r] = s;
          return s;
        }
      }
      let t = this.stringMap.get(e);
      if (t !== undefined) {
        return t;
      }
      let n = this.strings.length;
      this.strings.push(e);
      this.stringMap.set(e, n);
      return n;
    }
    get(e) {
      return this.strings[e] ?? " ";
    }
    get size() {
      return this.strings.length;
    }
  }
  class DHt {
    strings = [""];
    stringMap = new Map();
    intern(e) {
      if (!e) {
        return 0;
      }
      let t = this.stringMap.get(e);
      if (t === undefined) {
        t = this.strings.length;
        this.strings.push(e);
        this.stringMap.set(e, t);
      }
      return t;
    }
    get(e) {
      return e === 0 ? undefined : this.strings[e];
    }
    get size() {
      return this.strings.length;
    }
  }
  class HNn {
    "__json_buf" = new Map();
    styles = [];
    transitionCache = new Map();
    overflowWarned = false;
    generationCount = 0;
    none;
    constructor() {
      this.none = this.intern([]);
    }
    get size() {
      return this.styles.length;
    }
    get overflowed() {
      return this.overflowWarned;
    }
    get transitionCacheSize() {
      return this.transitionCache.size;
    }
    needsCompaction(e) {
      return this.overflowWarned || this.styles.length > Math.max(512, 2 * e);
    }
    get generation() {
      return this.generationCount;
    }
    intern(e) {
      let t = e.length === 0 ? "" : e.map(r => r.code).join("\x00");
      let n = this.ids.get(t);
      if (n === undefined) {
        let r = this.styles.length;
        if (r > jto) {
          if (!this.overflowWarned) {
            this.overflowWarned = true;
            logForDebugging(`StylePool exhausted ${jto} unique styles \u2014 further ` + "style combinations render unstyled to avoid packed-cell aliasing", {
              level: "warn"
            });
          }
          return this.none;
        }
        this.styles.push(e.length === 0 ? [] : e);
        n = r << 1 | (e.length > 0 && IYd(e) ? 1 : 0);
        this.ids.set(t, n);
      }
      return n;
    }
    get(e) {
      return this.styles[e >>> 1] ?? [];
    }
    transition(e, t) {
      if (e === t) {
        return "";
      }
      let n = e * 1048576 + t;
      let r = this.transitionCache.get(n);
      if (r === undefined) {
        if (this.transitionCache.size >= 8192) {
          this.transitionCache.clear();
        }
        let o = this.get(e);
        let s = this.get(t);
        r = vYd(o, s) + zF(LWe(o, s));
        this.transitionCache.set(n, r);
      }
      return r;
    }
    inverseCache = new Map();
    withInverse(e) {
      let t = this.inverseCache.get(e);
      if (t === undefined) {
        let n = this.get(e);
        t = n.some(o => o.endCode === "\x1B[27m") ? e : this.intern([...n, vVi]);
        this.inverseCache.set(e, t);
      }
      return t;
    }
    currentMatchCache = new Map();
    withCurrentMatch(e) {
      let t = this.currentMatchCache.get(e);
      if (t === undefined) {
        let n = this.get(e);
        let r = n.filter(o => o.endCode !== "\x1B[39m" && o.endCode !== "\x1B[49m");
        if (r.push(kYd), !n.some(o => o.endCode === "\x1B[27m")) {
          r.push(vVi);
        }
        if (!n.some(o => o.endCode === "\x1B[22m")) {
          r.push(RYd);
        }
        if (!n.some(o => o.endCode === "\x1B[24m")) {
          r.push(xYd);
        }
        t = this.intern(r);
        this.currentMatchCache.set(e, t);
      }
      return t;
    }
    selectionBgCode = null;
    selectionBgCache = new Map();
    setSelectionBg(e) {
      if (this.selectionBgCode?.code === e?.code) {
        return;
      }
      this.selectionBgCode = e;
      this.selectionBgCache.clear();
    }
    withSelectionBg(e) {
      let t = this.selectionBgCode;
      if (t === null) {
        return this.withInverse(e);
      }
      let n = this.selectionBgCache.get(e);
      if (n === undefined) {
        let r = this.get(e).filter(o => o.endCode !== "\x1B[49m" && o.endCode !== "\x1B[27m");
        r.push(t);
        n = this.intern(r);
        this.selectionBgCache.set(e, n);
      }
      return n;
    }
    compact() {
      let e = this.styles;
      this.ids = new Map();
      this.styles = [];
      this.transitionCache.clear();
      this.inverseCache.clear();
      this.currentMatchCache.clear();
      this.selectionBgCache.clear();
      this.overflowWarned = false;
      this.generationCount++;
      this.intern([]);
      let t = new Int32Array(e.length).fill(-1);
      return n => {
        let r = n >>> 1;
        let o = t[r];
        if (o !== undefined && o !== -1) {
          return o;
        }
        let s = this.intern(e[r] ?? []);
        if (r < t.length) {
          t[r] = s;
        }
        return s;
      };
    }
  }
  function IYd(e) {
    for (let t of e) {
      if (AYd.vZc(t.endCode)) {
        return true;
      }
    }
    return false;
  }
  function PYd() {
    let e = new Int32Array(128);
    e.fill(-1);
    e[32] = 0;
    return e;
  }
  function VJ(e, t, n) {
    return e << 17 | t << 2 | n;
  }
  function CVi(e) {
    let t = e.cells;
    for (let n = 0; n < t.length; n += 2) {
      t[n] = 1;
    }
  }
  function RVi(e, t) {
    if (e.width !== t.width || e.height !== t.height) {
      return false;
    }
    let n = e.width * e.height * 2;
    let r = e.cells;
    let o = t.cells;
    for (let s = 0; s < n; s++) {
      if (r[s] !== o[s]) {
        return false;
      }
    }
    return true;
  }
  function Wto(e, t) {
    if (t > 32767) {
      logForDebugging(`packSoftWrap: start column ${t} exceeds the 15-bit field; bit 15 is reserved for SW_ELIDED_SEP and will be corrupted`, {
        level: "error"
      });
    }
    return e << 16 | t & 32767;
  }
  function NHt(e) {
    return e & 32767;
  }
  function DYd(e, t) {
    let n = t << 1;
    return (e.cells[n] | e.cells[n | 1]) === 0;
  }
  function BWe(e, t, n) {
    if (t < 0 || n < 0 || t >= e.width || n >= e.height) {
      return true;
    }
    return DYd(e, n * e.width + t);
  }
  function MYd(e, t) {
    return e.hyperlinkPool.intern(t);
  }
  function zJ(e, t, n, r, o) {
    if ($k(e, "createScreen width"), $k(t, "createScreen height"), !Number.isInteger(e) || e < 0) {
      e = Math.max(0, Math.floor(e) || 0);
    }
    if (!Number.isInteger(t) || t < 0) {
      t = Math.max(0, Math.floor(t) || 0);
    }
    let s = e * t;
    let i = new ArrayBuffer(s << 3);
    let a = new Int32Array(i);
    let l = new BigInt64Array(i);
    return {
      width: e,
      height: t,
      cells: a,
      cells64: l,
      charPool: r,
      hyperlinkPool: o,
      emptyStyleId: n.none,
      damage: undefined,
      noSelect: new Uint8Array(s),
      softWrap: new Int32Array(t)
    };
  }
  function Gto(e, t, n) {
    if ($k(t, "resetScreen width"), $k(n, "resetScreen height"), !Number.isInteger(t) || t < 0) {
      t = Math.max(0, Math.floor(t) || 0);
    }
    if (!Number.isInteger(n) || n < 0) {
      n = Math.max(0, Math.floor(n) || 0);
    }
    let r = t * n;
    if (e.cells64.length < r) {
      let o = new ArrayBuffer(r << 3);
      e.cells = new Int32Array(o);
      e.cells64 = new BigInt64Array(o);
      e.noSelect = new Uint8Array(r);
    }
    if (e.softWrap.length < n) {
      e.softWrap = new Int32Array(n);
    }
    e.cells64.fill(0n, 0, r);
    e.noSelect.fill(0, 0, r);
    e.softWrap.fill(0, 0, n);
    e.width = t;
    e.height = n;
    e.damage = undefined;
  }
  function xVi(e, t, n, r) {
    let {
      charPool: o,
      hyperlinkPool: s
    } = e;
    let i = o !== t;
    let a = s !== n;
    if (!i && !a && !r) {
      return;
    }
    let l = e.width * e.height;
    let c = e.cells;
    for (let u = 0; u < l << 1; u += 2) {
      if (i) {
        let g = c[u];
        c[u] = t.intern(o.get(g));
      }
      let d = c[u + 1];
      let p = d >>> 2 & 32767;
      let m = d >>> 17;
      let f = a && p !== 0 ? n.intern(s.get(p)) : p;
      let h = r && m !== 0 ? r(m) : m;
      if (f !== p || h !== m) {
        let g = d & 3;
        c[u + 1] = VJ(h, f, g);
      }
    }
    e.charPool = t;
    e.hyperlinkPool = n;
  }
  function cq(e, t, n) {
    if (t < 0 || n < 0 || t >= e.width || n >= e.height) {
      return;
    }
    return KJ(e, n * e.width + t);
  }
  function KJ(e, t) {
    let n = t << 1;
    let r = e.cells[n + 1];
    let o = r >>> 2 & 32767;
    return {
      char: e.charPool.get(e.cells[n]),
      styleId: r >>> 17,
      width: r & 3,
      hyperlink: o === 0 ? undefined : e.hyperlinkPool.get(o)
    };
  }
  function kVi(e, t, n, r, o) {
    let s = r << 1;
    let i = e[s];
    if (i === 1) {
      return;
    }
    let a = e[s + 1];
    if (i === 0 && (a & 262140) === 0) {
      let c = a >>> 17;
      if (c === 0 || c === o) {
        return;
      }
    }
    let l = a >>> 2 & 32767;
    return {
      char: t.get(i),
      styleId: a >>> 17,
      width: a & 3,
      hyperlink: l === 0 ? undefined : n.get(l)
    };
  }
  function SPe(e, t, n) {
    let r = t | 1;
    let o = e.cells[r];
    n.char = e.charPool.get(e.cells[t]);
    n.styleId = o >>> 17;
    n.width = o & 3;
    let s = o >>> 2 & 32767;
    n.hyperlink = s === 0 ? undefined : e.hyperlinkPool.get(s);
  }
  function AVi(e, t, n) {
    if (t < 0 || n < 0 || t >= e.width || n >= e.height) {
      return;
    }
    let r = n * e.width + t << 1;
    return e.charPool.get(e.cells[r]);
  }
  function nct(e, t, n, r) {
    if (t < 0 || n < 0 || t >= e.width || n >= e.height) {
      return;
    }
    let o = n * e.width + t << 1;
    let s = e.cells;
    let i = s[o + 1] & 3;
    if (i === 1 && r.width !== 1) {
      if (t + 1 < e.width) {
        let d = o + 2;
        if ((s[d + 1] & 3) === 2) {
          s[d] = 0;
          s[d + 1] = VJ(e.emptyStyleId, 0, 0);
        }
      }
    }
    let a = -1;
    if (i === 2 && r.width !== 2) {
      if (t > 0) {
        let u = o - 2;
        if ((s[u + 1] & 3) === 1) {
          s[u] = 0;
          s[u + 1] = VJ(e.emptyStyleId, 0, 0);
          a = t - 1;
        }
      }
    }
    if (s[o] = NYd(e, r.char), s[o + 1] = VJ(r.styleId, MYd(e, r.hyperlink), r.width), YMn) {
      E9i(s[o], r.styleId);
    }
    let l = a >= 0 ? Math.min(t, a) : t;
    let c = e.damage;
    if (c) {
      let u = c.x + c.width;
      let d = c.y + c.height;
      if (l < c.x) {
        c.width += c.x - l;
        c.x = l;
      } else if (t >= u) {
        c.width = t - c.x + 1;
      }
      if (n < c.y) {
        c.height += c.y - n;
        c.y = n;
      } else if (n >= d) {
        c.height = n - c.y + 1;
      }
    } else {
      e.damage = {
        x: l,
        y: n,
        width: t - l + 1,
        height: 1
      };
    }
    if (r.width === 1) {
      let u = t + 1;
      if (u < e.width) {
        let d = o + 2;
        if ((s[d + 1] & 3) === 1) {
          let m = d + 2;
          if (u + 1 < e.width && (s[m + 1] & 3) === 2) {
            s[m] = 0;
            s[m + 1] = VJ(e.emptyStyleId, 0, 0);
          }
        }
        s[d] = 1;
        s[d + 1] = VJ(e.emptyStyleId, 0, 2);
        let p = e.damage;
        if (p && u >= p.x + p.width) {
          p.width = u - p.x + 1;
        }
      }
    }
  }
  function rct(e, t, n, r) {
    if (t < 0 || n < 0 || t >= e.width || n >= e.height) {
      return;
    }
    let o = n * e.width + t << 1;
    let s = e.cells;
    let i = s[o + 1];
    let a = i & 3;
    if (a === 2 || a === 3) {
      return;
    }
    let l = i >>> 2 & 32767;
    s[o + 1] = VJ(r, l, a);
    let c = e.damage;
    if (c) {
      let u = c.x + c.width;
      let d = c.y + c.height;
      if (t < c.x) {
        c.width += c.x - t;
        c.x = t;
      } else if (t >= u) {
        c.width = t - c.x + 1;
      }
      if (n < c.y) {
        c.height += c.y - n;
        c.y = n;
      } else if (n >= d) {
        c.height = n - c.y + 1;
      }
    } else {
      e.damage = {
        x: t,
        y: n,
        width: 1,
        height: 1
      };
    }
  }
  function NYd(e, t) {
    return e.charPool.intern(t);
  }
  function jNn(e, t, n, r, o, s) {
    if (n = Math.max(0, n), r = Math.max(0, r), n >= o || r >= s) {
      return;
    }
    let i = o - n;
    let a = t.width << 1;
    let l = e.width << 1;
    let c = i << 1;
    let u = t.cells;
    let d = e.cells;
    let p = t.noSelect;
    let m = e.noSelect;
    if (e.softWrap.set(t.softWrap.subarray(r, s), r), n === 0 && o === t.width && t.width === e.width) {
      let E = r * a;
      let C = (s - r) * a;
      d.set(u.subarray(E, E + C), E);
      let x = r * t.width;
      let A = (s - r) * t.width;
      m.set(p.subarray(x, x + A), x);
    } else {
      let E = r * a + (n << 1);
      let C = r * l + (n << 1);
      let x = r * t.width + n;
      let A = r * e.width + n;
      for (let k = r; k < s; k++) {
        d.set(u.subarray(E, E + c), C);
        m.set(p.subarray(x, x + i), A);
        E += a;
        C += l;
        x += t.width;
        A += e.width;
      }
    }
    let f = n > 0;
    let h = o < e.width;
    let g = false;
    let y = 0;
    if (f || h) {
      let E = r * e.width + n - 1 << 1;
      let C = r * e.width + o - 1 << 1;
      for (let x = r; x < s; x++) {
        if (f) {
          let A = d[E + 3] & 3;
          if ((d[E + 1] & 3) === 1) {
            if (A !== 2) {
              d[E] = 0;
              d[E + 1] = VJ(e.emptyStyleId, 0, 0);
              g = true;
            }
          } else if (A === 2) {
            d[E + 2] = 0;
            d[E + 3] = VJ(e.emptyStyleId, 0, 0);
          }
        }
        if (h) {
          if ((d[C + 1] & 3) === 1) {
            if (o + 1 < e.width && (d[C + 3] & 3) === 1 && (d[C + 5] & 3) === 2) {
              d[C + 4] = 0;
              d[C + 5] = VJ(e.emptyStyleId, 0, 0);
              y = 2;
            } else if (y < 1) {
              y = 1;
            }
            d[C + 2] = 1;
            d[C + 3] = VJ(e.emptyStyleId, 0, 2);
          } else if ((d[C + 3] & 3) === 2) {
            if (d[C + 2] = 0, d[C + 3] = VJ(e.emptyStyleId, 0, 0), y < 1) {
              y = 1;
            }
          }
        }
        E += l;
        C += l;
      }
    }
    let _ = g ? n - 1 : n;
    let b = o + y;
    let S = {
      x: _,
      y: r,
      width: b - _,
      height: s - r
    };
    if (e.damage) {
      e.damage = FWe(e.damage, S);
    } else {
      e.damage = S;
    }
  }
  function qNn(e, t, n, r) {
    if (r === 0 || t < 0 || n >= e.height || t > n) {
      return;
    }
    let {
      width: o,
      cells64: s,
      noSelect: i,
      softWrap: a
    } = e;
    if (Math.abs(r) > n - t) {
      s.fill(0n, t * o, (n + 1) * o);
      i.fill(0, t * o, (n + 1) * o);
      a.fill(0, t, n + 1);
      return;
    }
    if (r > 0) {
      s.copyWithin(t * o, (t + r) * o, (n + 1) * o);
      i.copyWithin(t * o, (t + r) * o, (n + 1) * o);
      a.copyWithin(t, t + r, n + 1);
      s.fill(0n, (n - r + 1) * o, (n + 1) * o);
      i.fill(0, (n - r + 1) * o, (n + 1) * o);
      a.fill(0, n - r + 1, n + 1);
    } else {
      s.copyWithin((t - r) * o, t * o, (n + r + 1) * o);
      i.copyWithin((t - r) * o, t * o, (n + r + 1) * o);
      a.copyWithin(t - r, t, n + r + 1);
      s.fill(0n, t * o, (t - r) * o);
      i.fill(0, t * o, (t - r) * o);
      a.fill(0, t, t - r);
    }
  }
  function PVi(e) {
    for (let t of e) {
      let n = t.code;
      if (n.length < 5 || !n.startsWith(TPe)) {
        continue;
      }
      let r = n.match(IVi);
      if (r) {
        return r[1] || null;
      }
    }
    return null;
  }
  function OVi(e) {
    return e.filter(t => !t.code.startsWith(TPe) || !IVi.test(t.code));
  }
  function DVi(e, t, n) {
    let r = e.width;
    let o = t.width;
    let s = e.height;
    let i = t.height;
    let a;
    if (r === 0 && s === 0) {
      a = {
        x: 0,
        y: 0,
        width: o,
        height: i
      };
    } else if (t.damage) {
      if (a = t.damage, e.damage) {
        a = FWe(a, e.damage);
      }
    } else if (e.damage) {
      a = e.damage;
    } else {
      a = {
        x: 0,
        y: 0,
        width: 0,
        height: 0
      };
    }
    if (s > i) {
      a = FWe(a, {
        x: 0,
        y: i,
        width: r,
        height: s - i
      });
    }
    if (r > o) {
      a = FWe(a, {
        x: o,
        y: 0,
        width: r - o,
        height: s
      });
    }
    let l = Math.max(s, i);
    let c = Math.max(r, o);
    let u = Math.min(a.y + a.height, l);
    let d = Math.min(a.x + a.width, c);
    if (r === o) {
      return $Yd(e, t, a.x, d, a.y, u, n);
    }
    return HYd(e, t, a.x, d, a.y, u, n);
  }
  function LYd(e, t, n, r) {
    for (let o = 0; o < r; o++, n += 2) {
      let s = n | 1;
      if (e[n] !== t[n] || e[s] !== t[s]) {
        return o;
      }
    }
    return r;
  }
  function FYd(e, t, n, r, o, s, i, a, l, c, u) {
    let d = i;
    while (d < a) {
      let p = LYd(e, t, o, a - d);
      if (d += p, o += p << 1, d >= a) {
        break;
      }
      if (SPe(n, o, l), SPe(r, o, c), u(d, s, l, c)) {
        return true;
      }
      d++;
      o += 2;
    }
    return false;
  }
  function UYd(e, t, n, r, o, s, i) {
    for (let a = r; a < o; a++, t += 2) {
      if (SPe(e, t, s), i(a, n, s, undefined)) {
        return true;
      }
    }
    return false;
  }
  function BYd(e, t, n, r, o, s, i, a) {
    for (let l = o; l < s; l++, n += 2) {
      if (e[n] === 0 && e[n | 1] === 0) {
        continue;
      }
      if (SPe(t, n, i), a(l, r, undefined, i)) {
        return true;
      }
    }
    return false;
  }
  function $Yd(e, t, n, r, o, s, i) {
    let a = e.cells;
    let l = t.cells;
    let c = e.width;
    let u = e.height;
    let d = t.height;
    let p = c << 1;
    let m = {
      char: " ",
      styleId: 0,
      width: 0,
      hyperlink: undefined
    };
    let f = {
      char: " ",
      styleId: 0,
      width: 0,
      hyperlink: undefined
    };
    let h = Math.min(r, c);
    let g = o * c + n << 1;
    for (let y = o; y < s; y++) {
      let _ = y < u;
      let b = y < d;
      if (_ && b) {
        if (FYd(a, l, e, t, g, y, n, h, m, f, i)) {
          return true;
        }
      } else if (_) {
        if (UYd(e, g, y, n, h, m, i)) {
          return true;
        }
      } else if (b) {
        if (BYd(l, t, g, y, n, h, f, i)) {
          return true;
        }
      }
      g += p;
    }
    return false;
  }
  function HYd(e, t, n, r, o, s, i) {
    let a = e.width;
    let l = t.width;
    let c = e.cells;
    let u = t.cells;
    let d = {
      char: " ",
      styleId: 0,
      width: 0,
      hyperlink: undefined
    };
    let p = {
      char: " ",
      styleId: 0,
      width: 0,
      hyperlink: undefined
    };
    let m = a << 1;
    let f = l << 1;
    let h = o * a + n << 1;
    let g = o * l + n << 1;
    for (let y = o; y < s; y++) {
      let _ = y < e.height;
      let b = y < t.height;
      let S = _ ? Math.min(r, a) : n;
      let E = b ? Math.min(r, l) : n;
      let C = Math.min(S, E);
      let x = h;
      let A = g;
      for (let k = n; k < C; k++) {
        if (c[x] === u[A] && c[x + 1] === u[A + 1]) {
          x += 2;
          A += 2;
          continue;
        }
        if (SPe(e, x, d), SPe(t, A, p), x += 2, A += 2, i(k, y, d, p)) {
          return true;
        }
      }
      if (S > C) {
        x = h + (C - n << 1);
        for (let k = C; k < S; k++) {
          if (SPe(e, x, d), x += 2, i(k, y, d, undefined)) {
            return true;
          }
        }
      }
      if (E > C) {
        A = g + (C - n << 1);
        for (let k = C; k < E; k++) {
          if (u[A] === 0 && u[A | 1] === 0) {
            A += 2;
            continue;
          }
          if (SPe(t, A, p), A += 2, i(k, y, undefined, p)) {
            return true;
          }
        }
      }
      h += m;
      g += f;
    }
    return false;
  }
  function MVi(e, t, n, r, o) {
    let s = Math.min(t + r, e.width);
    let i = Math.min(n + o, e.height);
    let a = e.noSelect;
    let l = e.width;
    for (let c = Math.max(0, n); c < i; c++) {
      let u = c * l;
      a.fill(1, u + Math.max(0, t), u + s);
    }
  }
  var vVi;
  var RYd;
  var xYd;
  var kYd;
  var AYd;
  var OYd;
  var jto;
  var Sre;
  var IVi;
  var TPe;
  var iG = __lazy(() => {
    zlt();
    je();
    Llt();
    Q8();
    ore();
    Bto();
    vVi = {
      type: "ansi",
      code: "\x1B[7m",
      endCode: "\x1B[27m"
    };
    RYd = {
      type: "ansi",
      code: "\x1B[1m",
      endCode: "\x1B[22m"
    };
    xYd = {
      type: "ansi",
      code: "\x1B[4m",
      endCode: "\x1B[24m"
    };
    kYd = {
      type: "ansi",
      code: "\x1B[33m",
      endCode: "\x1B[39m"
    };
    AYd = new Set(["\x1B[49m", "\x1B[27m", "\x1B[24m", "\x1B[29m", "\x1B[55m"]);
    OYd = (1 << 32 - 17) - 1;
    jto = OYd >>> 1;
    Sre = {
      HardBreak: 0,
      Continuation: 1,
      ContinuationElidedSep: 2
    };
    IVi = new RegExp(`^${"\x1B"}\\]8${";"}${";"}([^${"\x07"}]*)${"\x07"}$`);
    TPe = `${"\x1B"}]8${";"}`;
  });
  function NVi() {
    return {
      anchor: null,
      focus: null,
      isDragging: false,
      anchorSpan: null,
      scrolledOffAbove: [],
      scrolledOffBelow: [],
      scrolledOffAboveSW: [],
      scrolledOffBelowSW: [],
      lastPressHadAlt: false
    };
  }
  function Xto(e, t, n, r) {
    e.scope = r;
    e.anchor = {
      col: oct(e, t),
      row: n
    };
    e.focus = null;
    e.isDragging = true;
    e.anchorSpan = null;
    e.scrolledOffAbove = [];
    e.scrolledOffBelow = [];
    e.scrolledOffAboveSW = [];
    e.scrolledOffBelowSW = [];
    e.virtualAnchorRow = undefined;
    e.virtualFocusRow = undefined;
    e.virtualAnchorCol = undefined;
    e.virtualFocusCol = undefined;
    e.lastPressHadAlt = false;
  }
  function LVi(e, t, n) {
    if (!e.isDragging) {
      return;
    }
    let r = oct(e, t);
    if (!e.focus && e.anchor && e.anchor.col === r && e.anchor.row === n) {
      return;
    }
    e.focus = {
      col: r,
      row: n
    };
  }
  function oct(e, t) {
    return e.scope ? j_(t, e.scope.x1, e.scope.x2 - 1) : t;
  }
  function ict(e, t) {
    return e.scope ? {
      lo: e.scope.x1,
      hi: Math.min(e.scope.x2, t) - 1
    } : {
      lo: 0,
      hi: t - 1
    };
  }
  function act(e) {
    e.isDragging = false;
  }
  function LHt(e) {
    e.anchor = null;
    e.focus = null;
    e.isDragging = false;
    e.anchorSpan = null;
    e.scope = undefined;
    e.scrolledOffAbove = [];
    e.scrolledOffBelow = [];
    e.scrolledOffAboveSW = [];
    e.scrolledOffBelowSW = [];
    e.virtualAnchorRow = undefined;
    e.virtualFocusRow = undefined;
    e.virtualAnchorCol = undefined;
    e.virtualFocusCol = undefined;
    e.lastPressHadAlt = false;
  }
  function WNn(e) {
    if (e === " " || e === "") {
      return 0;
    }
    if (jYd.test(e)) {
      return 1;
    }
    return 2;
  }
  function FVi(e, t, n) {
    if (n < 0 || n >= e.height) {
      return null;
    }
    let {
      width: r,
      noSelect: o
    } = e;
    let s = n * r;
    let i = t;
    if (i > 0) {
      let p = cq(e, i, n);
      if (p && p.width === 2) {
        i -= 1;
      }
    }
    if (i < 0 || i >= r || o[s + i] === 1) {
      return null;
    }
    let a = cq(e, i, n);
    if (!a) {
      return null;
    }
    let l = $Vi(e, i, n);
    if (l) {
      return {
        lo: l.lo,
        hi: l.hi
      };
    }
    let c = WNn(a.char);
    let u = i;
    while (u > 0) {
      let p = u - 1;
      if (o[s + p] === 1) {
        break;
      }
      let m = cq(e, p, n);
      if (!m) {
        break;
      }
      if (m.width === 2) {
        if (p === 0 || o[s + p - 1] === 1) {
          break;
        }
        let f = cq(e, p - 1, n);
        if (!f || WNn(f.char) !== c) {
          break;
        }
        u = p - 1;
        continue;
      }
      if (WNn(m.char) !== c) {
        break;
      }
      u = p;
    }
    let d = i;
    while (d < r - 1) {
      let p = d + 1;
      if (o[s + p] === 1) {
        break;
      }
      let m = cq(e, p, n);
      if (!m) {
        break;
      }
      if (m.width === 2) {
        d = p;
        continue;
      }
      if (WNn(m.char) !== c) {
        break;
      }
      d = p;
    }
    return {
      lo: u,
      hi: d
    };
  }
  function Jto(e, t) {
    if (e.row !== t.row) {
      return e.row < t.row ? -1 : 1;
    }
    if (e.col !== t.col) {
      return e.col < t.col ? -1 : 1;
    }
    return 0;
  }
  function UVi(e, t, n, r) {
    let o = FVi(t, n, r);
    if (!o) {
      return;
    }
    let s = {
      col: oct(e, o.lo),
      row: r
    };
    let i = {
      col: oct(e, o.hi),
      row: r
    };
    e.anchor = s;
    e.focus = i;
    e.isDragging = true;
    e.anchorSpan = {
      lo: s,
      hi: i,
      kind: "word"
    };
  }
  function WYd(e) {
    if (e.length !== 1) {
      return false;
    }
    let t = e.charCodeAt(0);
    return t >= 33 && t <= 126 && !qYd.vZc(e);
  }
  function Vto(e, t, n) {
    if (e.noSelect[n * e.width + t] === 1) {
      return null;
    }
    let r = cq(e, t, n);
    return r && r.width === 0 && WYd(r.char) ? r.char : null;
  }
  function zto(e, t, n, r, o) {
    if (n < r || n > o) {
      return null;
    }
    let s = Vto(e, n, t);
    if (s === null) {
      return null;
    }
    let i = n;
    let a = "";
    while (i > r) {
      let u = Vto(e, i - 1, t);
      if (u === null) {
        break;
      }
      a = u + a;
      i--;
    }
    let l = n;
    let c = "";
    while (l < o) {
      let u = Vto(e, l + 1, t);
      if (u === null) {
        break;
      }
      c += u;
      l++;
    }
    return {
      lo: i,
      hi: l,
      text: a + s + c
    };
  }
  function Kto(e, t) {
    let n = e.softWrap[t];
    let r = t + 1 < e.height ? e.softWrap[t + 1] : 0;
    return {
      start: n !== 0 ? NHt(n) : 0,
      end: r !== 0 ? r >>> 16 : e.width
    };
  }
  function BVi(e, t, n) {
    return $Vi(e, t, n)?.url;
  }
  function $Vi(e, t, n) {
    if (n < 0 || n >= e.height) {
      return;
    }
    let r = e.width;
    let o = t;
    if (o > 0) {
      let k = cq(e, o, n);
      if (k && k.width === 2) {
        o -= 1;
      }
    }
    if (o < 0 || o >= r) {
      return;
    }
    let s = e.softWrap;
    let i = Kto(e, n);
    let a;
    let l;
    let c = o >= i.start && o < i.end;
    if (c) {
      a = i.start;
      l = i.end - 1;
    } else if (o >= i.end) {
      a = i.end;
      l = r - 1;
    } else {
      a = 0;
      l = i.start - 1;
    }
    let u = zto(e, n, o, a, l);
    if (!u) {
      return;
    }
    let d = u.text;
    let p = o - u.lo;
    let m = n;
    let f = u.hi;
    let h = n;
    let g = u.lo;
    if (c) {
      while (m + 1 < e.height) {
        let k = s[m + 1];
        if (k === 0 || f + 1 !== k >>> 16 || (k & 32768) !== 0) {
          break;
        }
        let I = Kto(e, m + 1);
        let O = zto(e, m + 1, I.start, I.start, I.end - 1);
        if (!O) {
          break;
        }
        d += O.text;
        m++;
        f = O.hi;
      }
      while (h > 0) {
        let k = s[h];
        let I = k >>> 16;
        if (k === 0 || g !== NHt(k) || I === 0 || (k & 32768) !== 0) {
          break;
        }
        let O = Kto(e, h - 1);
        let M = zto(e, h - 1, I - 1, O.start, I - 1);
        if (!M) {
          break;
        }
        d = M.text + d;
        p += M.text.length;
        h--;
        g = M.lo;
      }
    }
    let y = /(?:https?|file):\/\//g;
    let _ = -1;
    let b = d.length;
    for (let k; k = y.exec(d);) {
      if (k.index > p) {
        b = k.index;
        break;
      }
      _ = k.index;
    }
    if (_ < 0) {
      return;
    }
    if (b === d.length && f + 1 < r) {
      if (cq(e, f + 1, m)?.char === "\u2026") {
        return;
      }
    }
    let S = d.slice(_, b);
    let E = {
      ")": "(",
      "]": "[",
      "}": "{"
    };
    while (S.length > 0) {
      let k = S.at(-1);
      if (".,;:!?".includes(k)) {
        S = S.slice(0, -1);
        continue;
      }
      let I = E[k];
      if (!I) {
        break;
      }
      let O = 0;
      let M = 0;
      for (let L = 0; L < S.length; L++) {
        let P = S.charAt(L);
        if (P === I) {
          O++;
        } else if (P === k) {
          M++;
        }
      }
      if (M > O) {
        S = S.slice(0, -1);
      } else {
        break;
      }
    }
    if (p >= _ + S.length) {
      return;
    }
    let C = p - (o - u.lo);
    let x = u.lo + Math.max(0, _ - C);
    let A = u.lo + Math.min(u.hi - u.lo, _ + S.length - 1 - C);
    return {
      url: S,
      lo: x,
      hi: A
    };
  }
  function HVi(e, t, n) {
    if (n < 0 || n >= t.height) {
      return;
    }
    let r = ict(e, t.width);
    let o = {
      col: r.lo,
      row: n
    };
    let s = {
      col: r.hi,
      row: n
    };
    e.anchor = o;
    e.focus = s;
    e.isDragging = true;
    e.anchorSpan = {
      lo: o,
      hi: s,
      kind: "line"
    };
  }
  function jVi(e, t, n, r) {
    if (!e.isDragging || !e.anchorSpan) {
      return;
    }
    let o = e.anchorSpan;
    let s;
    let i;
    if (o.kind === "word") {
      let a = FVi(t, n, r);
      s = {
        col: oct(e, a ? a.lo : n),
        row: r
      };
      i = {
        col: oct(e, a ? a.hi : n),
        row: r
      };
    } else {
      let a = j_(r, 0, t.height - 1);
      let l = ict(e, t.width);
      s = {
        col: l.lo,
        row: a
      };
      i = {
        col: l.hi,
        row: a
      };
    }
    if (Jto(i, o.lo) < 0) {
      e.anchor = o.hi;
      e.focus = s;
    } else if (Jto(s, o.hi) > 0) {
      e.anchor = o.lo;
      e.focus = i;
    } else {
      e.anchor = o.lo;
      e.focus = o.hi;
    }
  }
  function qVi(e, t, n) {
    if (!e.focus) {
      return;
    }
    e.anchorSpan = null;
    e.focus = {
      col: t,
      row: n
    };
    e.virtualFocusRow = undefined;
    e.virtualFocusCol = undefined;
  }
  function WVi(e, t, n, r, o) {
    if (!e.anchor || !e.focus) {
      return;
    }
    let s = (e.virtualAnchorRow ?? e.anchor.row) + t;
    let i = (e.virtualFocusRow ?? e.focus.row) + t;
    let a = Math.min(e.virtualAnchorRow ?? e.anchor.row, e.virtualFocusRow ?? e.focus.row);
    let l = Math.max(e.virtualAnchorRow ?? e.anchor.row, e.virtualFocusRow ?? e.focus.row);
    let c = l - a + 1;
    let u = Math.min(c, Math.max(0, n - a));
    let d = Math.min(c, Math.max(0, l - r));
    let p = Math.min(c, Math.max(0, n - Math.min(s, i)));
    let m = Math.min(c, Math.max(0, Math.max(s, i) - r));
    if (d === c && p === c) {
      e.scrolledOffAbove = e.scrolledOffBelow;
      e.scrolledOffAboveSW = e.scrolledOffBelowSW;
      e.scrolledOffBelow = [];
      e.scrolledOffBelowSW = [];
    } else if (u === c && m === c) {
      e.scrolledOffBelow = e.scrolledOffAbove;
      e.scrolledOffBelowSW = e.scrolledOffAboveSW;
      e.scrolledOffAbove = [];
      e.scrolledOffAboveSW = [];
    }
    if (p < u) {
      let S = Math.min(u - p, e.scrolledOffAbove.length);
      e.scrolledOffAbove.length -= S;
      e.scrolledOffAboveSW.length = e.scrolledOffAbove.length;
    }
    if (m < d) {
      let S = d - m;
      e.scrolledOffBelow.splice(0, S);
      e.scrolledOffBelowSW.splice(0, S);
    }
    if (e.scrolledOffAbove.length > p) {
      e.scrolledOffAbove = p > 0 ? e.scrolledOffAbove.slice(-p) : [];
      e.scrolledOffAboveSW = p > 0 ? e.scrolledOffAboveSW.slice(-p) : [];
    }
    if (e.scrolledOffBelow.length > m) {
      e.scrolledOffBelow = e.scrolledOffBelow.slice(0, m);
      e.scrolledOffBelowSW = e.scrolledOffBelowSW.slice(0, m);
    }
    let f = ict(e, o);
    let h = (S, E) => {
      if (S < n) {
        return {
          col: f.lo,
          row: n
        };
      }
      if (S > r) {
        return {
          col: f.hi,
          row: r
        };
      }
      return {
        col: E,
        row: S
      };
    };
    let g = e.virtualAnchorCol ?? e.anchor.col;
    let y = e.virtualFocusCol ?? e.focus.col;
    e.anchor = h(s, g);
    e.focus = h(i, y);
    let _ = s < n || s > r;
    let b = i < n || i > r;
    if (e.virtualAnchorRow = _ ? s : undefined, e.virtualAnchorCol = _ ? g : undefined, e.virtualFocusRow = b ? i : undefined, e.virtualFocusCol = b ? y : undefined, e.anchorSpan) {
      let S = E => {
        let C = E.row + t;
        if (C < n) {
          return {
            col: f.lo,
            row: n
          };
        }
        if (C > r) {
          return {
            col: f.hi,
            row: r
          };
        }
        return {
          col: E.col,
          row: C
        };
      };
      e.anchorSpan = {
        lo: S(e.anchorSpan.lo),
        hi: S(e.anchorSpan.hi),
        kind: e.anchorSpan.kind
      };
    }
  }
  function GVi(e, t, n, r) {
    if (!e.anchor) {
      return;
    }
    let o = (e.virtualAnchorRow ?? e.anchor.row) + t;
    let s = o < n || o > r;
    let i = e.virtualAnchorCol ?? e.anchor.col;
    if (e.anchor = {
      col: s ? e.anchor.col : i,
      row: j_(o, n, r)
    }, e.virtualAnchorRow = s ? o : undefined, e.virtualAnchorCol = s ? i : undefined, e.anchorSpan) {
      let a = l => ({
        col: l.col,
        row: j_(l.row + t, n, r)
      });
      e.anchorSpan = {
        lo: a(e.anchorSpan.lo),
        hi: a(e.anchorSpan.hi),
        kind: e.anchorSpan.kind
      };
    }
  }
  function Tre(e) {
    return e.anchor !== null && e.focus !== null;
  }
  function EPe(e) {
    if (!e.anchor || !e.focus || e.virtualAnchorRow === undefined || e.virtualFocusRow === undefined) {
      return false;
    }
    return e.virtualAnchorRow < e.anchor.row && e.virtualFocusRow < e.focus.row || e.virtualAnchorRow > e.anchor.row && e.virtualFocusRow > e.focus.row;
  }
  function FHt(e) {
    if (!e.anchor || !e.focus) {
      return null;
    }
    return Jto(e.anchor, e.focus) <= 0 ? {
      start: e.anchor,
      end: e.focus
    } : {
      start: e.focus,
      end: e.anchor
    };
  }
  function GNn(e, t) {
    if (!(e > 0)) {
      return false;
    }
    let n = NHt(e);
    return n >= t.lo && n <= t.hi;
  }
  function VVi(e, t, n, r, o, s) {
    let i = e.noSelect;
    let a = t * e.width;
    let l = GNn(e.softWrap[t], s) ? e.softWrap[t] : 0;
    let u = (t + 1 < e.height && GNn(e.softWrap[t + 1], s) ? e.softWrap[t + 1] : 0) >>> 16;
    let d = u > 0 ? Math.min(r, u - 1) : r;
    let p = l !== 0 ? NHt(l) : 0;
    let m = l !== 0 ? Math.max(n, p) : n;
    let f = o && l !== 0 && (l & 32768) !== 0 && n <= p && r >= p ? " " : "";
    for (let h = m; h <= d; h++) {
      if (i[a + h] === 1) {
        continue;
      }
      let g = cq(e, h, t);
      if (!g) {
        continue;
      }
      if (g.width === 2 || g.width === 3) {
        continue;
      }
      f += g.char;
    }
    return u > 0 ? f : f.replace(/\s+$/, "");
  }
  function Yto(e, t, n) {
    if (n && e.length > 0) {
      e[e.length - 1] += t;
    } else {
      e.push(t);
    }
  }
  function zVi(e, t) {
    let n = FHt(e);
    if (!n) {
      return "";
    }
    let {
      start: r,
      end: o
    } = n;
    let s = t.softWrap;
    let i = [];
    for (let a = 0; a < e.scrolledOffAbove.length; a++) {
      Yto(i, e.scrolledOffAbove[a], e.scrolledOffAboveSW[a]);
    }
    if (!EPe(e)) {
      let a = ict(e, t.width);
      for (let l = r.row; l <= o.row; l++) {
        let c = l === r.row ? Math.max(r.col, a.lo) : a.lo;
        let u = l === o.row ? Math.min(o.col, a.hi) : a.hi;
        Yto(i, VVi(t, l, c, u, i.length > 0, a), GNn(s[l], a));
      }
    }
    for (let a = 0; a < e.scrolledOffBelow.length; a++) {
      Yto(i, e.scrolledOffBelow[a], e.scrolledOffBelowSW[a]);
    }
    return i.join(`
`);
  }
  function Qto(e, t, n, r, o) {
    let s = FHt(e);
    if (!s || n > r || EPe(e)) {
      return;
    }
    let {
      start: i,
      end: a
    } = s;
    let l = Math.max(n, i.row);
    let c = Math.min(r, a.row);
    if (l > c) {
      return;
    }
    let {
      width: u,
      softWrap: d
    } = t;
    let p = [];
    let m = [];
    let f = ict(e, u);
    for (let h = l; h <= c; h++) {
      let g = h === i.row ? Math.max(i.col, f.lo) : f.lo;
      let y = h === a.row ? Math.min(a.col, f.hi) : f.hi;
      let _ = h > i.row || e.scrolledOffAbove.length > 0;
      p.push(VVi(t, h, g, y, _, f));
      m.push(GNn(d[h], f));
    }
    if (o === "above") {
      if (e.scrolledOffAbove.push(...p), e.scrolledOffAboveSW.push(...m), e.anchor && e.anchor.row === i.row && l === i.row) {
        if (e.virtualAnchorCol ??= e.anchor.col, e.anchor = {
          col: f.lo,
          row: e.anchor.row
        }, e.anchorSpan) {
          e.anchorSpan = {
            kind: e.anchorSpan.kind,
            lo: {
              col: f.lo,
              row: e.anchorSpan.lo.row
            },
            hi: {
              col: f.hi,
              row: e.anchorSpan.hi.row
            }
          };
        }
      }
    } else if (e.scrolledOffBelow.unshift(...p), e.scrolledOffBelowSW.unshift(...m), e.anchor && e.anchor.row === a.row && c === a.row) {
      if (e.virtualAnchorCol ??= e.anchor.col, e.anchor = {
        col: f.hi,
        row: e.anchor.row
      }, e.anchorSpan) {
        e.anchorSpan = {
          kind: e.anchorSpan.kind,
          lo: {
            col: f.lo,
            row: e.anchorSpan.lo.row
          },
          hi: {
            col: f.hi,
            row: e.anchorSpan.hi.row
          }
        };
      }
    }
  }
  function KVi(e, t, n) {
    let r = FHt(t);
    if (!r || EPe(t)) {
      return;
    }
    let {
      start: o,
      end: s
    } = r;
    let i = e.width;
    let a = e.noSelect;
    let l = ict(t, i);
    for (let c = o.row; c <= s.row && c < e.height; c++) {
      let u = c === o.row ? Math.max(o.col, l.lo) : l.lo;
      let d = c === s.row ? Math.min(s.col, i - 1, l.hi) : l.hi;
      let p = c * i;
      for (let m = u; m <= d; m++) {
        let f = p + m;
        if (a[f] === 1) {
          continue;
        }
        let h = KJ(e, f);
        rct(e, m, c, n.withSelectionBg(h.styleId));
      }
    }
  }
  var jYd;
  var qYd;
  var UHt = __lazy(() => {
    Q8();
    iG();
    jYd = /[\p{L}\p{N}_/.\-+~\\]/u;
    qYd = new Set([..."<>\"'` "]);
  });
  function VNn(e) {
    return H_(Wh.SET_BG_COLOR, e);
  }
  function lct() {
    return H_(Wh.RESET_BG_COLOR);
  }
  var zNn = __lazy(() => {
    Tg();
  });
  var YVi;
  var JVi;
  function QVi(e) {
    let t = XVi.c(6);
    let {
      children: n
    } = e;
    let r = BHt.useSyncExternalStore(EWe, Clt);
    let o = BHt.useSyncExternalStore(EWe, nre);
    let s;
    if (t[0] !== r || t[1] !== o) {
      s = {
        isTerminalFocused: r,
        terminalFocusState: o
      };
      t[0] = r;
      t[1] = o;
      t[2] = s;
    } else {
      s = t[2];
    }
    let i = s;
    let a;
    if (t[3] !== n || t[4] !== i) {
      a = ZVi.jsx(Zto.Provider, {
        value: i,
        children: n
      });
      t[3] = n;
      t[4] = i;
      t[5] = a;
    } else {
      a = t[5];
    }
    return a;
  }
  var XVi;
  var BHt;
  var ZVi;
  var Zto;
  function useTerminalFocus() {
    let {
      isTerminalFocused: e
    } = nno.useContext(Zto);
    return e;
  }
  function KNn() {
    let {
      terminalFocusState: e
    } = nno.useContext(Zto);
    return e;
  }
  var nno;
  var vPe = __lazy(() => {
    nno = __toESM(ot(), 1);
  });
  function GYd(e) {
    let t = new Map();
    let n = null;
    let r = e;
    let o = performance.now();
    let s = 0;
    function i() {
      s = performance.now() - o;
      for (let c of t.keys()) {
        c();
      }
    }
    function a() {
      if ([...t.values()].some(Boolean)) {
        if (n) {
          clearInterval(n);
          n = null;
        }
        n = setInterval(i, r);
      } else if (n) {
        clearInterval(n);
        n = null;
      }
    }
    function l(c, u) {
      t.set(c, u);
      a();
      return () => {
        t.delete(c);
        a();
      };
    }
    return {
      subscribeKeepAlive(c) {
        return l(c, true);
      },
      subscribeFollower(c) {
        return l(c, false);
      },
      now() {
        if (n && s) {
          return s;
        }
        return performance.now() - o;
      },
      setTickInterval(c) {
        if (c === r) {
          return;
        }
        r = c;
        a();
      },
      setTimeout(c, u) {
        let d = setTimeout(c, u);
        return () => clearTimeout(d);
      }
    };
  }
  function tzi(e) {
    let t = ezi.c(7);
    let {
      children: n
    } = e;
    let [r] = cct.useState(zYd);
    let o = useTerminalFocus();
    let s;
    let i;
    if (t[0] !== r || t[1] !== o) {
      s = () => {
        r.setTickInterval(o ? 16 : VYd);
      };
      i = [r, o];
      t[0] = r;
      t[1] = o;
      t[2] = s;
      t[3] = i;
    } else {
      s = t[2];
      i = t[3];
    }
    cct.useEffect(s, i);
    let a;
    if (t[4] !== n || t[5] !== r) {
      a = nzi.jsx(aG.Provider, {
        value: r,
        children: n
      });
      t[4] = n;
      t[5] = r;
      t[6] = a;
    } else {
      a = t[6];
    }
    return a;
  }
  function zYd() {
    return GYd(16);
  }
  var ezi;
  var cct;
  var nzi;
  var uct = (e, t) => {
    let n = setTimeout(e, t);
    return () => clearTimeout(n);
  };
  var dct = () => () => {};
  var YNn = () => null;
  var aG;
  var VYd;
  var wPe = __lazy(() => {
    vPe();
    ezi = __toESM(pt(), 1);
    cct = __toESM(ot(), 1);
    nzi = __toESM(ie(), 1);
    aG = cct.createContext(null);
    VYd = 16 * 2;
  });
  var rzi;
  var KYd;
  var YYd = (e, t = 2) => e.replace(/^\t+/gm, n => " ".repeat(n.length * t));
  var JYd = (e, t) => {
    let n = [];
    let r = e - t;
    let o = e + t;
    for (let s = r; s <= o; s++) {
      n.push(s);
    }
    return n;
  };
  var XYd = (e, t, n = {}) => {
    var r;
    if (typeof e !== "string") {
      throw TypeError("Source code is missing.");
    }
    if (!t || t < 1) {
      throw TypeError("Line number must start from `1`.");
    }
    let o = YYd(e).split(/\r?\n/);
    if (t > o.length) {
      return;
    }
    return JYd(t, (r = n.around) !== null && r !== undefined ? r : 3).filter(s => o[s - 1] !== undefined).map(s => ({
      line: s,
      value: o[s - 1]
    }));
  };