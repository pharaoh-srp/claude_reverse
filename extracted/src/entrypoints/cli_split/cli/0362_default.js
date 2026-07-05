  __export(YRl, {
    default: () => ber
  });
  function ckm(e) {
    for (var t = 1; t < arguments.length; t++) {
      var n = arguments[t];
      for (var r in n) {
        if (n.hasOwnProperty(r)) {
          e[r] = n[r];
        }
      }
    }
    return e;
  }
  function eLo(e, t) {
    return Array(t + 1).join(e);
  }
  function ukm(e) {
    return e.replace(/^\n*/, "");
  }
  function dkm(e) {
    var t = e.length;
    while (t > 0 && e[t - 1] === `
`) {
      t--;
    }
    return e.substring(0, t);
  }
  function tLo(e) {
    return nLo(e, pkm);
  }
  function jRl(e) {
    return nLo(e, HRl);
  }
  function mkm(e) {
    return WRl(e, HRl);
  }
  function fkm(e) {
    return nLo(e, qRl);
  }
  function hkm(e) {
    return WRl(e, qRl);
  }
  function nLo(e, t) {
    return t.indexOf(e.nodeName) >= 0;
  }
  function WRl(e, t) {
    return e.getElementsByTagName && t.some(function (n) {
      return e.getElementsByTagName(n).length;
    });
  }
  function _er(e) {
    return e ? e.replace(/(\n+\s*)+/g, `
`) : "";
  }
  function GRl(e) {
    this.options = e;
    this._keep = [];
    this._remove = [];
    this.blankRule = {
      replacement: e.blankReplacement
    };
    this.keepReplacement = e.keepReplacement;
    this.defaultRule = {
      replacement: e.defaultReplacement
    };
    this.array = [];
    for (var t in e.rules) {
      this.array.push(e.rules[t]);
    }
  }
  function X1o(e, t, n) {
    for (var r = 0; r < e.length; r++) {
      var o = e[r];
      if (gkm(o, t, n)) {
        return o;
      }
    }
    return;
  }
  function gkm(e, t, n) {
    var r = e.filter;
    if (typeof r === "string") {
      if (r === t.nodeName.toLowerCase()) {
        return true;
      }
    } else if (Array.isArray(r)) {
      if (r.indexOf(t.nodeName.toLowerCase()) > -1) {
        return true;
      }
    } else if (typeof r === "function") {
      if (r.call(e, t, n)) {
        return true;
      }
    } else {
      throw TypeError("`filter` needs to be a string, array, or function");
    }
  }
  function ykm(e) {
    var {
      element: t,
      isBlock: n,
      isVoid: r
    } = e;
    var o = e.isPre || function (d) {
      return d.nodeName === "PRE";
    };
    if (!t.firstChild || o(t)) {
      return;
    }
    var s = null;
    var i = false;
    var a = null;
    var l = BRl(a, t, o);
    while (l !== t) {
      if (l.nodeType === 3 || l.nodeType === 4) {
        var c = l.data.replace(/[ \r\n\t]+/g, " ");
        if ((!s || / $/.test(s.data)) && !i && c[0] === " ") {
          c = c.substr(1);
        }
        if (!c) {
          l = Q1o(l);
          continue;
        }
        l.data = c;
        s = l;
      } else if (l.nodeType === 1) {
        if (n(l) || l.nodeName === "BR") {
          if (s) {
            s.data = s.data.replace(/ $/, "");
          }
          s = null;
          i = false;
        } else if (r(l) || o(l)) {
          s = null;
          i = true;
        } else if (s) {
          i = false;
        }
      } else {
        l = Q1o(l);
        continue;
      }
      var u = BRl(a, l, o);
      a = l;
      l = u;
    }
    if (s) {
      if (s.data = s.data.replace(/ $/, ""), !s.data) {
        Q1o(s);
      }
    }
  }
  function Q1o(e) {
    var t = e.nextSibling || e.parentNode;
    e.parentNode.removeChild(e);
    return t;
  }
  function BRl(e, t, n) {
    if (e && e.parentNode === t || n(t)) {
      return t.nextSibling || t.parentNode;
    }
    return t.firstChild || t.nextSibling || t.parentNode;
  }
  function _km() {
    var e = VRl.DOMParser;
    var t = false;
    try {
      if (new e().parseFromString("", "text/html")) {
        t = true;
      }
    } catch (n) {}
    return t;
  }
  function bkm() {
    var e = function () {};
    {
      var t = URl();
      e.prototype.parseFromString = function (n) {
        return t.createDocument(n);
      };
    }
    return e;
  }
  function Tkm(e, t) {
    var n;
    if (typeof e === "string") {
      var r = Ekm().parseFromString('<x-turndown id="turndown-root">' + e + "</x-turndown>", "text/html");
      n = r.getElementById("turndown-root");
    } else {
      n = e.cloneNode(true);
    }
    ykm({
      element: n,
      isBlock: tLo,
      isVoid: jRl,
      isPre: t.preformattedCode ? vkm : null
    });
    return n;
  }
  function Ekm() {
    Z1o = Z1o || new Skm();
    return Z1o;
  }
  function vkm(e) {
    return e.nodeName === "PRE" || e.nodeName === "CODE";
  }
  function wkm(e, t) {
    e.isBlock = tLo(e);
    e.isCode = e.nodeName === "CODE" || e.parentNode.isCode;
    e.isBlank = Ckm(e);
    e.flankingWhitespace = Rkm(e, t);
    return e;
  }
  function Ckm(e) {
    return !jRl(e) && !fkm(e) && /^\s*$/i.test(e.textContent) && !mkm(e) && !hkm(e);
  }
  function Rkm(e, t) {
    if (e.isBlock || t.preformattedCode && e.isCode) {
      return {
        leading: "",
        trailing: ""
      };
    }
    var n = xkm(e.textContent);
    if (n.leadingAscii && $Rl("left", e, t)) {
      n.leading = n.leadingNonAscii;
    }
    if (n.trailingAscii && $Rl("right", e, t)) {
      n.trailing = n.trailingNonAscii;
    }
    return {
      leading: n.leading,
      trailing: n.trailing
    };
  }
  function xkm(e) {
    var t = e.match(/^(([ \t\r\n]*)(\s*))(?:(?=\S)[\s\S]*\S)?((\s*?)([ \t\r\n]*))$/);
    return {
      leading: t[1],
      leadingAscii: t[2],
      leadingNonAscii: t[3],
      trailing: t[4],
      trailingNonAscii: t[5],
      trailingAscii: t[6]
    };
  }
  function $Rl(e, t, n) {
    var r;
    var o;
    var s;
    if (e === "left") {
      r = t.previousSibling;
      o = / $/;
    } else {
      r = t.nextSibling;
      o = /^ /;
    }
    if (r) {
      if (r.nodeType === 3) {
        s = o.test(r.nodeValue);
      } else if (n.preformattedCode && r.nodeName === "CODE") {
        s = false;
      } else if (r.nodeType === 1 && !tLo(r)) {
        s = o.test(r.textContent);
      }
    }
    return s;
  }
  function ber(e) {
    if (!(this instanceof ber)) {
      return new ber(e);
    }
    var t = {
      rules: dH,
      headingStyle: "setext",
      hr: "* * *",
      bulletListMarker: "*",
      codeBlockStyle: "indented",
      fence: "```",
      emDelimiter: "_",
      strongDelimiter: "**",
      linkStyle: "inlined",
      linkReferenceStyle: "full",
      br: "  ",
      preformattedCode: false,
      blankReplacement: function (n, r) {
        return r.isBlock ? `

` : "";
      },
      keepReplacement: function (n, r) {
        return r.isBlock ? `

` + r.outerHTML + `

` : r.outerHTML;
      },
      defaultReplacement: function (n, r) {
        return r.isBlock ? `

` + n + `

` : n;
      }
    };
    this.options = ckm({}, t, e);
    this.rules = new GRl(this.options);
  }
  function zRl(e) {
    var t = this;
    return kkm.call(e.childNodes, function (n, r) {
      r = new wkm(r, t.options);
      var o = "";
      if (r.nodeType === 3) {
        o = r.isCode ? r.nodeValue : t.escape(r.nodeValue);
      } else if (r.nodeType === 1) {
        o = Pkm.call(t, r);
      }
      return KRl(n, o);
    }, "");
  }
  function Ikm(e) {
    var t = this;
    this.rules.forEach(function (n) {
      if (typeof n.append === "function") {
        e = KRl(e, n.append(t.options));
      }
    });
    return e.replace(/^[\t\r\n]+/, "").replace(/[\t\r\n\s]+$/, "");
  }
  function Pkm(e) {
    var t = this.rules.forNode(e);
    var n = zRl.call(this, e);
    var r = e.flankingWhitespace;
    if (r.leading || r.trailing) {
      n = n.trim();
    }
    return r.leading + t.replacement(n, e, this.options) + r.trailing;
  }
  function KRl(e, t) {
    var n = dkm(e);
    var r = ukm(t);
    var o = Math.max(e.length - n.length, t.length - r.length);
    var s = `

`.substring(0, o);
    return n + s + r;
  }
  function Okm(e) {
    return e != null && (typeof e === "string" || e.nodeType && (e.nodeType === 1 || e.nodeType === 9 || e.nodeType === 11));
  }
  var pkm;
  var HRl;
  var qRl;
  var dH;
  var VRl;
  var Skm;
  var Z1o;
  var kkm;
  var Akm;
  var rxl = {};