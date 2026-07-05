  var $No = __commonJS((bqb, Qvl) => {
    Qvl.exports = {
      serializeOne: oRm,
      ɵescapeMatchingClosingTag: Yvl,
      ɵescapeClosingCommentTag: Jvl,
      ɵescapeProcessingInstructionContent: Xvl
    };
    var Kvl = O0();
    var NKe = Kvl.NAMESPACE;
    var Gvl = {
      STYLE: true,
      SCRIPT: true,
      XMP: true,
      IFRAME: true,
      NOEMBED: true,
      NOFRAMES: true,
      PLAINTEXT: true
    };
    var QCm = {
      area: true,
      base: true,
      basefont: true,
      bgsound: true,
      br: true,
      col: true,
      embed: true,
      frame: true,
      hr: true,
      img: true,
      input: true,
      keygen: true,
      link: true,
      meta: true,
      param: true,
      source: true,
      track: true,
      wbr: true
    };
    var ZCm = {};
    function eRm(e) {
      if (!(/[&<>\u00A0]/g).test(e)) {
        return e;
      }
      return e.replace(/[&<>\u00A0]/g, t => {
        switch (t) {
          case "&":
            return "&amp;";
          case "<":
            return "&lt;";
          case ">":
            return "&gt;";
          case "\xA0":
            return "&nbsp;";
        }
      });
    }
    function tRm(e) {
      if (!(/[&"<>\u00A0]/g).test(e)) {
        return e;
      }
      return e.replace(/[&"<>\u00A0]/g, t => {
        switch (t) {
          case "<":
            return "&lt;";
          case ">":
            return "&gt;";
          case "&":
            return "&amp;";
          case '"':
            return "&quot;";
          case "\xA0":
            return "&nbsp;";
        }
      });
    }
    function nRm(e) {
      var t = e.namespaceURI;
      if (!t) {
        return e.localName;
      }
      if (t === NKe.XML) {
        return "xml:" + e.localName;
      }
      if (t === NKe.XLINK) {
        return "xlink:" + e.localName;
      }
      if (t === NKe.XMLNS) {
        if (e.localName === "xmlns") {
          return "xmlns";
        } else {
          return "xmlns:" + e.localName;
        }
      }
      return e.name;
    }
    function Yvl(e, t) {
      let n = "</" + t;
      if (!e.toLowerCase().includes(n)) {
        return e;
      }
      let r = [...e];
      let o = e.matchAll(new RegExp(n, "ig"));
      for (let s of o) {
        r[s.index] = "&lt;";
      }
      return r.join("");
    }
    function Jvl(e) {
      if (!(/--!?>/).test(e)) {
        return e;
      }
      return e.replace(/(--\!?)>/g, "$1&gt;");
    }
    function Xvl(e) {
      return e.includes(">") ? e.replaceAll(">", "&gt;") : e;
    }
    function oRm(e, t) {
      var n = "";
      switch (e.nodeType) {
        case 1:
          var r = e.namespaceURI;
          var o = r === NKe.HTML;
          var s = o || r === NKe.SVG || r === NKe.MATHML ? e.localName : e.tagName;
          n += "<" + s;
          for (var i = 0, a = e._numattrs; i < a; i++) {
            var l = e._attr(i);
            if (n += " " + nRm(l), l.value !== undefined) {
              n += '="' + tRm(l.value) + '"';
            }
          }
          if (n += ">", !(o && QCm[s])) {
            var c = e.serialize();
            if (Gvl[s.toUpperCase()]) {
              c = Yvl(c, s);
            }
            if (o && ZCm[s] && c.charAt(0) === `
`) {
              n += `
`;
            }
            n += c;
            n += "</" + s + ">";
          }
          break;
        case 3:
        case 4:
          var u;
          if (t.nodeType === 1 && t.namespaceURI === NKe.HTML) {
            u = t.tagName;
          } else {
            u = "";
          }
          if (Gvl[u] || u === "NOSCRIPT" && t.ownerDocument._scripting_enabled) {
            n += e.data;
          } else {
            n += eRm(e.data);
          }
          break;
        case 8:
          n += "<!--" + Jvl(e.data) + "-->";
          break;
        case 7:
          let d = Xvl(e.data);
          n += "<?" + e.target + " " + d + "?>";
          break;
        case 10:
          n += "<!DOCTYPE " + e.name;
          n += ">";
          break;
        default:
          Kvl.InvalidStateError();
      }
      return n;
    }
  });