  var a4t = __commonJS((n3y, nma) => {
    var tma = {
      DOT_LITERAL: "\\.",
      PLUS_LITERAL: "\\+",
      QMARK_LITERAL: "\\?",
      SLASH_LITERAL: "\\/",
      ONE_CHAR: "(?=.)",
      QMARK: "[^/]",
      END_ANCHOR: "(?:\\/|$)",
      DOTS_SLASH: "\\.{1,2}(?:\\/|$)",
      NO_DOT: "(?!\\.)",
      NO_DOTS: "(?!(?:^|\\/)\\.{1,2}(?:\\/|$))",
      NO_DOT_SLASH: "(?!\\.{0,1}(?:\\/|$))",
      NO_DOTS_SLASH: "(?!\\.{1,2}(?:\\/|$))",
      QMARK_NO_DOT: "[^.\\/]",
      STAR: "[^/]*?",
      START_ANCHOR: "(?:^|\\/)",
      SEP: "/"
    };
    var Xyp = {
      ...tma,
      SLASH_LITERAL: "[\\\\/]",
      QMARK: "[^\\\\/]",
      STAR: "[^\\\\/]*?",
      DOTS_SLASH: "\\.{1,2}(?:[\\\\/]|$)",
      NO_DOT: "(?!\\.)",
      NO_DOTS: "(?!(?:^|[\\\\/])\\.{1,2}(?:[\\\\/]|$))",
      NO_DOT_SLASH: "(?!\\.{0,1}(?:[\\\\/]|$))",
      NO_DOTS_SLASH: "(?!\\.{1,2}(?:[\\\\/]|$))",
      QMARK_NO_DOT: "[^.\\\\/]",
      START_ANCHOR: "(?:^|[\\\\/])",
      END_ANCHOR: "(?:[\\\\/]|$)",
      SEP: "\\"
    };
    var Qyp = {
      __proto__: null,
      alnum: "a-zA-Z0-9",
      alpha: "a-zA-Z",
      ascii: "\\x00-\\x7F",
      blank: " \\t",
      cntrl: "\\x00-\\x1F\\x7F",
      digit: "0-9",
      graph: "\\x21-\\x7E",
      lower: "a-z",
      print: "\\x20-\\x7E ",
      punct: "\\-!\"#$%&'()\\*+,./:;<=>?@[\\]^_`{|}~",
      space: " \\t\\r\\n\\v\\f",
      upper: "A-Z",
      word: "A-Za-z0-9_",
      xdigit: "A-Fa-f0-9"
    };
    nma.exports = {
      DEFAULT_MAX_EXTGLOB_RECURSION: 0,
      MAX_LENGTH: 65536,
      POSIX_REGEX_SOURCE: Qyp,
      REGEX_BACKSLASH: /\\(?![*+?^${}(|)[\]])/g,
      REGEX_NON_SPECIAL_CHARS: /^[^@![\].,$*+?^{}()|\\/]+/,
      REGEX_SPECIAL_CHARS: /[-*+?.^${}(|)[\]]/,
      REGEX_SPECIAL_CHARS_BACKREF: /(\\?)((\W)(\3*))/g,
      REGEX_SPECIAL_CHARS_GLOBAL: /([-*+?.^${}(|)[\]])/g,
      REGEX_REMOVE_BACKSLASH: /(?:\[.*?[^\\]\]|\\(?=.))/g,
      REPLACEMENTS: {
        __proto__: null,
        "***": "*",
        "**/**": "**",
        "**/**/**": "**"
      },
      CHAR_0: 48,
      CHAR_9: 57,
      CHAR_UPPERCASE_A: 65,
      CHAR_LOWERCASE_A: 97,
      CHAR_UPPERCASE_Z: 90,
      CHAR_LOWERCASE_Z: 122,
      CHAR_LEFT_PARENTHESES: 40,
      CHAR_RIGHT_PARENTHESES: 41,
      CHAR_ASTERISK: 42,
      CHAR_AMPERSAND: 38,
      CHAR_AT: 64,
      CHAR_BACKWARD_SLASH: 92,
      CHAR_CARRIAGE_RETURN: 13,
      CHAR_CIRCUMFLEX_ACCENT: 94,
      CHAR_COLON: 58,
      CHAR_COMMA: 44,
      CHAR_DOT: 46,
      CHAR_DOUBLE_QUOTE: 34,
      CHAR_EQUAL: 61,
      CHAR_EXCLAMATION_MARK: 33,
      CHAR_FORM_FEED: 12,
      CHAR_FORWARD_SLASH: 47,
      CHAR_GRAVE_ACCENT: 96,
      CHAR_HASH: 35,
      CHAR_HYPHEN_MINUS: 45,
      CHAR_LEFT_ANGLE_BRACKET: 60,
      CHAR_LEFT_CURLY_BRACE: 123,
      CHAR_LEFT_SQUARE_BRACKET: 91,
      CHAR_LINE_FEED: 10,
      CHAR_NO_BREAK_SPACE: 160,
      CHAR_PERCENT: 37,
      CHAR_PLUS: 43,
      CHAR_QUESTION_MARK: 63,
      CHAR_RIGHT_ANGLE_BRACKET: 62,
      CHAR_RIGHT_CURLY_BRACE: 125,
      CHAR_RIGHT_SQUARE_BRACKET: 93,
      CHAR_SEMICOLON: 59,
      CHAR_SINGLE_QUOTE: 39,
      CHAR_SPACE: 32,
      CHAR_TAB: 9,
      CHAR_UNDERSCORE: 95,
      CHAR_VERTICAL_LINE: 124,
      CHAR_ZERO_WIDTH_NOBREAK_SPACE: 65279,
      extglobChars(e) {
        return {
          "!": {
            type: "negate",
            open: "(?:(?!(?:",
            close: `))${e.STAR})`
          },
          "?": {
            type: "qmark",
            open: "(?:",
            close: ")?"
          },
          "+": {
            type: "plus",
            open: "(?:",
            close: ")+"
          },
          "*": {
            type: "star",
            open: "(?:",
            close: ")*"
          },
          "@": {
            type: "at",
            open: "(?:",
            close: ")"
          }
        };
      },
      globChars(e) {
        return e === true ? Xyp : tma;
      }
    };
  });
  var l4t = __commonJS(MG => {
    var {
      REGEX_BACKSLASH: Zyp,
      REGEX_REMOVE_BACKSLASH: e_p,
      REGEX_SPECIAL_CHARS: t_p,
      REGEX_SPECIAL_CHARS_GLOBAL: n_p
    } = a4t();
    MG.isObject = e => e !== null && typeof e === "object" && !Array.isArray(e);
    MG.hasRegexChars = e => t_p.test(e);
    MG.isRegexChar = e => e.length === 1 && MG.hasRegexChars(e);
    MG.escapeRegex = e => e.replace(n_p, "\\$1");
    MG.toPosixSlashes = e => e.replace(Zyp, "/");
    MG.isWindows = () => {
      if (typeof navigator < "u" && navigator.platform) {
        let e = navigator.platform.toLowerCase();
        return e === "win32" || e === "windows";
      }
      if (typeof process < "u") {
        return false;
      }
      return false;
    };
    MG.removeBackslashes = e => e.replace(e_p, t => t === "\\" ? "" : t);
    MG.escapeLast = (e, t, n) => {
      let r = e.lastIndexOf(t, n);
      if (r === -1) {
        return e;
      }
      if (e[r - 1] === "\\") {
        return MG.escapeLast(e, t, r - 1);
      }
      return `${e.slice(0, r)}\\${e.slice(r)}`;
    };
    MG.removePrefix = (e, t = {}) => {
      let n = e;
      if (n.startsWith("./")) {
        n = n.slice(2);
        t.prefix = "./";
      }
      return n;
    };
    MG.wrapOutput = (e, t = {}, n = {}) => {
      let r = n.contains ? "" : "^";
      let o = n.contains ? "" : "$";
      let s = `${r}(?:${e})${o}`;
      if (t.negated === true) {
        s = `(?:^(?!${s}).*$)`;
      }
      return s;
    };
    MG.basename = (e, {
      windows: t
    } = {}) => {
      let n = e.split(t ? /[\\/]/ : "/");
      let r = n[n.length - 1];
      if (r === "") {
        return n[n.length - 2];
      }
      return r;
    };
  });
  var uma = __commonJS((o3y, cma) => {
    var rma = l4t();
    var {
      CHAR_ASTERISK: Ruo,
      CHAR_AT: r_p,
      CHAR_BACKWARD_SLASH: c4t,
      CHAR_COMMA: o_p,
      CHAR_DOT: xuo,
      CHAR_EXCLAMATION_MARK: kuo,
      CHAR_FORWARD_SLASH: lma,
      CHAR_LEFT_CURLY_BRACE: Auo,
      CHAR_LEFT_PARENTHESES: Iuo,
      CHAR_LEFT_SQUARE_BRACKET: s_p,
      CHAR_PLUS: i_p,
      CHAR_QUESTION_MARK: oma,
      CHAR_RIGHT_CURLY_BRACE: a_p,
      CHAR_RIGHT_PARENTHESES: sma,
      CHAR_RIGHT_SQUARE_BRACKET: l_p
    } = a4t();
    var ima = e => e === lma || e === c4t;
    var ama = e => {
      if (e.isPrefix !== true) {
        e.depth = e.isGlobstar ? 1 / 0 : 1;
      }
    };
    var c_p = (e, t) => {
      let n = t || {};
      let r = e.length - 1;
      let o = n.parts === true || n.scanToEnd === true;
      let s = [];
      let i = [];
      let a = [];
      let l = e;
      let c = -1;
      let u = 0;
      let d = 0;
      let p = false;
      let m = false;
      let f = false;
      let h = false;
      let g = false;
      let y = false;
      let _ = false;
      let b = false;
      let S = false;
      let E = false;
      let C = 0;
      let x;
      let A;
      let k = {
        value: "",
        depth: 0,
        isGlob: false
      };
      let I = () => c >= r;
      let O = () => l.charCodeAt(c + 1);
      let M = () => (x = A, l.charCodeAt(++c));
      while (c < r) {
        A = M();
        let U;
        if (A === c4t) {
          if (_ = k.backslashes = true, A = M(), A === Auo) {
            y = true;
          }
          continue;
        }
        if (y === true || A === Auo) {
          C++;
          while (I() !== true && (A = M())) {
            if (A === c4t) {
              _ = k.backslashes = true;
              M();
              continue;
            }
            if (A === Auo) {
              C++;
              continue;
            }
            if (y !== true && A === xuo && (A = M()) === xuo) {
              if (p = k.isBrace = true, f = k.isGlob = true, E = true, o === true) {
                continue;
              }
              break;
            }
            if (y !== true && A === o_p) {
              if (p = k.isBrace = true, f = k.isGlob = true, E = true, o === true) {
                continue;
              }
              break;
            }
            if (A === a_p) {
              if (C--, C === 0) {
                y = false;
                p = k.isBrace = true;
                E = true;
                break;
              }
            }
          }
          if (o === true) {
            continue;
          }
          break;
        }
        if (A === lma) {
          if (s.push(c), i.push(k), k = {
            value: "",
            depth: 0,
            isGlob: false
          }, E === true) {
            continue;
          }
          if (x === xuo && c === u + 1) {
            u += 2;
            continue;
          }
          d = c + 1;
          continue;
        }
        if (n.noext !== true) {
          if ((A === i_p || A === r_p || A === Ruo || A === oma || A === kuo) === true && O() === Iuo) {
            if (f = k.isGlob = true, h = k.isExtglob = true, E = true, A === kuo && c === u) {
              S = true;
            }
            if (o === true) {
              while (I() !== true && (A = M())) {
                if (A === c4t) {
                  _ = k.backslashes = true;
                  A = M();
                  continue;
                }
                if (A === sma) {
                  f = k.isGlob = true;
                  E = true;
                  break;
                }
              }
              continue;
            }
            break;
          }
        }
        if (A === Ruo) {
          if (x === Ruo) {
            g = k.isGlobstar = true;
          }
          if (f = k.isGlob = true, E = true, o === true) {
            continue;
          }
          break;
        }
        if (A === oma) {
          if (f = k.isGlob = true, E = true, o === true) {
            continue;
          }
          break;
        }
        if (A === s_p) {
          while (I() !== true && (U = M())) {
            if (U === c4t) {
              _ = k.backslashes = true;
              M();
              continue;
            }
            if (U === l_p) {
              m = k.isBracket = true;
              f = k.isGlob = true;
              E = true;
              break;
            }
          }
          if (o === true) {
            continue;
          }
          break;
        }
        if (n.nonegate !== true && A === kuo && c === u) {
          b = k.negated = true;
          u++;
          continue;
        }
        if (n.noparen !== true && A === Iuo) {
          if (f = k.isGlob = true, o === true) {
            while (I() !== true && (A = M())) {
              if (A === Iuo) {
                _ = k.backslashes = true;
                A = M();
                continue;
              }
              if (A === sma) {
                E = true;
                break;
              }
            }
            continue;
          }
          break;
        }
        if (f === true) {
          if (E = true, o === true) {
            continue;
          }
          break;
        }
      }
      if (n.noext === true) {
        h = false;
        f = false;
      }
      let L = l;
      let P = "";
      let F = "";
      if (u > 0) {
        P = l.slice(0, u);
        l = l.slice(u);
        d -= u;
      }
      if (L && f === true && d > 0) {
        L = l.slice(0, d);
        F = l.slice(d);
      } else if (f === true) {
        L = "";
        F = l;
      } else {
        L = l;
      }
      if (L && L !== "" && L !== "/" && L !== l) {
        if (ima(L.charCodeAt(L.length - 1))) {
          L = L.slice(0, -1);
        }
      }
      if (n.unescape === true) {
        if (F) {
          F = rma.removeBackslashes(F);
        }
        if (L && _ === true) {
          L = rma.removeBackslashes(L);
        }
      }
      let H = {
        prefix: P,
        input: e,
        start: u,
        base: L,
        glob: F,
        isBrace: p,
        isBracket: m,
        isGlob: f,
        isExtglob: h,
        isGlobstar: g,
        negated: b,
        negatedExtglob: S
      };
      if (n.tokens === true) {
        if (H.maxDepth = 0, !ima(A)) {
          i.push(k);
        }
        H.tokens = i;
      }
      if (n.parts === true || n.tokens === true) {
        let U;
        for (let N = 0; N < s.length; N++) {
          let W = U ? U + 1 : u;
          let j = s[N];
          let z = e.slice(W, j);
          if (n.tokens) {
            if (N === 0 && u !== 0) {
              i[N].isPrefix = true;
              i[N].value = P;
            } else {
              i[N].value = z;
            }
            ama(i[N]);
            H.maxDepth += i[N].depth;
          }
          if (N !== 0 || z !== "") {
            a.push(z);
          }
          U = j;
        }
        if (U && U + 1 < e.length) {
          let N = e.slice(U + 1);
          if (a.push(N), n.tokens) {
            i[i.length - 1].value = N;
            ama(i[i.length - 1]);
            H.maxDepth += i[i.length - 1].depth;
          }
        }
        H.slashes = s;
        H.parts = a;
      }
      return H;
    };
    cma.exports = c_p;
  });
  var hma = __commonJS((s3y, fma) => {
    var u4t = a4t();
    var kV = l4t();
    var {
      MAX_LENGTH: z2n,
      POSIX_REGEX_SOURCE: u_p,
      REGEX_NON_SPECIAL_CHARS: d_p,
      REGEX_SPECIAL_CHARS_BACKREF: p_p,
      REPLACEMENTS: dma
    } = u4t;
    var m_p = (e, t) => {
      if (typeof t.expandRange === "function") {
        return t.expandRange(...e, t);
      }
      e.sort();
      let n = `[${e.join("-")}]`;
      try {
        new RegExp(n);
      } catch (r) {
        return e.map(o => kV.escapeRegex(o)).join("..");
      }
      return n;
    };
    var Vdt = (e, t) => `Missing ${e}: "${t}" - use "\\\\${t}" to match literal characters`;
    var pma = e => {
      let t = [];
      let n = 0;
      let r = 0;
      let o = 0;
      let s = "";
      let i = false;
      for (let a of e) {
        if (i === true) {
          s += a;
          i = false;
          continue;
        }
        if (a === "\\") {
          s += a;
          i = true;
          continue;
        }
        if (a === '"') {
          o = o === 1 ? 0 : 1;
          s += a;
          continue;
        }
        if (o === 0) {
          if (a === "[") {
            n++;
          } else if (a === "]" && n > 0) {
            n--;
          } else if (n === 0) {
            if (a === "(") {
              r++;
            } else if (a === ")" && r > 0) {
              r--;
            } else if (a === "|" && r === 0) {
              t.push(s);
              s = "";
              continue;
            }
          }
        }
        s += a;
      }
      t.push(s);
      return t;
    };
    var f_p = e => {
      let t = false;
      for (let n of e) {
        if (t === true) {
          t = false;
          continue;
        }
        if (n === "\\") {
          t = true;
          continue;
        }
        if (/[?*+@!()[\]{}]/.test(n)) {
          return false;
        }
      }
      return true;
    };
    var mma = e => {
      let t = e.trim();
      let n = true;
      while (n === true) {
        if (n = false, /^@\([^\\()[\]{}|]+\)$/.test(t)) {
          t = t.slice(2, -1);
          n = true;
        }
      }
      if (!f_p(t)) {
        return;
      }
      return t.replace(/\\(.)/g, "$1");
    };
    var h_p = e => {
      let t = e.map(mma).filter(Boolean);
      for (let n = 0; n < t.length; n++) {
        for (let r = n + 1; r < t.length; r++) {
          let o = t[n];
          let s = t[r];
          let i = o[0];
          if (!i || o !== i.repeat(o.length) || s !== i.repeat(s.length)) {
            continue;
          }
          if (o === s || o.startsWith(s) || s.startsWith(o)) {
            return true;
          }
        }
      }
      return false;
    };
    var Puo = (e, t = true) => {
      if (e[0] !== "+" && e[0] !== "*" || e[1] !== "(") {
        return;
      }
      let n = 0;
      let r = 0;
      let o = 0;
      let s = false;
      for (let i = 1; i < e.length; i++) {
        let a = e[i];
        if (s === true) {
          s = false;
          continue;
        }
        if (a === "\\") {
          s = true;
          continue;
        }
        if (a === '"') {
          o = o === 1 ? 0 : 1;
          continue;
        }
        if (o === 1) {
          continue;
        }
        if (a === "[") {
          n++;
          continue;
        }
        if (a === "]" && n > 0) {
          n--;
          continue;
        }
        if (n > 0) {
          continue;
        }
        if (a === "(") {
          r++;
          continue;
        }
        if (a === ")") {
          if (r--, r === 0) {
            if (t === true && i !== e.length - 1) {
              return;
            }
            return {
              type: e[0],
              body: e.slice(2, i),
              end: i
            };
          }
        }
      }
    };
    var g_p = e => {
      let t = 0;
      let n = [];
      while (t < e.length) {
        let o = Puo(e.slice(t), false);
        if (!o || o.type !== "*") {
          return;
        }
        let s = pma(o.body).map(a => a.trim());
        if (s.length !== 1) {
          return;
        }
        let i = mma(s[0]);
        if (!i || i.length !== 1) {
          return;
        }
        n.push(i);
        t += o.end + 1;
      }
      if (n.length < 1) {
        return;
      }
      return `${n.length === 1 ? kV.escapeRegex(n[0]) : `[${n.map(o => kV.escapeRegex(o)).join("")}]`}*`;
    };
    var y_p = e => {
      let t = 0;
      let n = e.trim();
      let r = Puo(n);
      while (r) {
        t++;
        n = r.body.trim();
        r = Puo(n);
      }
      return t;
    };
    var __p = (e, t) => {
      if (t.maxExtglobRecursion === false) {
        return {
          risky: false
        };
      }
      let n = typeof t.maxExtglobRecursion === "number" ? t.maxExtglobRecursion : u4t.DEFAULT_MAX_EXTGLOB_RECURSION;
      let r = pma(e).map(o => o.trim());
      if (r.length > 1) {
        if (r.some(o => o === "") || r.some(o => /^[*?]+$/.test(o)) || h_p(r)) {
          return {
            risky: true
          };
        }
      }
      for (let o of r) {
        let s = g_p(o);
        if (s) {
          return {
            risky: true,
            safeOutput: s
          };
        }
        if (y_p(o) > n) {
          return {
            risky: true
          };
        }
      }
      return {
        risky: false
      };
    };
    var Ouo = (e, t) => {
      if (typeof e !== "string") {
        throw TypeError("Expected a string");
      }
      e = dma[e] || e;
      let n = {
        ...t
      };
      let r = typeof n.maxLength === "number" ? Math.min(z2n, n.maxLength) : z2n;
      let o = e.length;
      if (o > r) {
        throw SyntaxError(`Input length: ${o}, exceeds maximum allowed length: ${r}`);
      }
      let s = {
        type: "bos",
        value: "",
        output: n.prepend || ""
      };
      let i = [s];
      let a = n.capture ? "" : "?:";
      let l = u4t.globChars(n.windows);
      let c = u4t.extglobChars(l);
      let {
        DOT_LITERAL: u,
        PLUS_LITERAL: d,
        SLASH_LITERAL: p,
        ONE_CHAR: m,
        DOTS_SLASH: f,
        NO_DOT: h,
        NO_DOT_SLASH: g,
        NO_DOTS_SLASH: y,
        QMARK: _,
        QMARK_NO_DOT: b,
        STAR: S,
        START_ANCHOR: E
      } = l;
      let C = oe => `(${a}(?:(?!${E}${oe.dot ? f : u}).)*?)`;
      let x = n.dot ? "" : h;
      let A = n.dot ? _ : b;
      let k = n.bash === true ? C(n) : S;
      if (n.capture) {
        k = `(${k})`;
      }
      if (typeof n.noext === "boolean") {
        n.noextglob = n.noext;
      }
      let I = {
        input: e,
        index: -1,
        start: 0,
        dot: n.dot === true,
        consumed: "",
        output: "",
        prefix: "",
        backtrack: false,
        negated: false,
        brackets: 0,
        braces: 0,
        parens: 0,
        quotes: 0,
        globstar: false,
        tokens: i
      };
      e = kV.removePrefix(e, I);
      o = e.length;
      let O = [];
      let M = [];
      let L = [];
      let P = s;
      let F;
      let H = () => I.index === o - 1;
      let U = I.peek = (oe = 1) => e[I.index + oe];
      let N = I.advance = () => e[++I.index] || "";
      let W = () => e.slice(I.index + 1);
      let j = (oe = "", ee = 0) => {
        I.consumed += oe;
        I.index += ee;
      };
      let z = oe => {
        I.output += oe.output != null ? oe.output : oe.value;
        j(oe.value);
      };
      let V = () => {
        let oe = 1;
        while (U() === "!" && (U(2) !== "(" || U(3) === "?")) {
          N();
          I.start++;
          oe++;
        }
        if (oe % 2 === 0) {
          return false;
        }
        I.negated = true;
        I.start++;
        return true;
      };
      let K = oe => {
        I[oe]++;
        L.push(oe);
      };
      let J = oe => {
        I[oe]--;
        L.pop();
      };
      let Q = oe => {
        if (P.type === "globstar") {
          let ee = I.braces > 0 && (oe.type === "comma" || oe.type === "brace");
          let re = oe.extglob === true || O.length && (oe.type === "pipe" || oe.type === "paren");
          if (oe.type !== "slash" && oe.type !== "paren" && !ee && !re) {
            I.output = I.output.slice(0, -P.output.length);
            P.type = "star";
            P.value = "*";
            P.output = k;
            I.output += P.output;
          }
        }
        if (O.length && oe.type !== "paren") {
          O[O.length - 1].inner += oe.value;
        }
        if (oe.value || oe.output) {
          z(oe);
        }
        if (P && P.type === "text" && oe.type === "text") {
          P.output = (P.output || P.value) + oe.value;
          P.value += oe.value;
          return;
        }
        oe.prev = P;
        i.push(oe);
        P = oe;
      };
      let Z = (oe, ee) => {
        let re = {
          ...c[ee],
          conditions: 1,
          inner: ""
        };
        re.prev = P;
        re.parens = I.parens;
        re.output = I.output;
        re.startIndex = I.index;
        re.tokensIndex = i.length;
        let se = (n.capture ? "(" : "") + re.open;
        K("parens");
        Q({
          type: oe,
          value: ee,
          output: I.output ? "" : m
        });
        Q({
          type: "paren",
          extglob: true,
          value: N(),
          output: se
        });
        O.push(re);
      };
      let ne = oe => {
        let ee = e.slice(oe.startIndex, I.index + 1);
        let re = e.slice(oe.startIndex + 2, I.index);
        let se = __p(re, n);
        if ((oe.type === "plus" || oe.type === "star") && se.risky) {
          let be = se.safeOutput ? (oe.output ? "" : m) + (n.capture ? `(${se.safeOutput})` : se.safeOutput) : undefined;
          let fe = i[oe.tokensIndex];
          fe.type = "text";
          fe.value = ee;
          fe.output = be || kV.escapeRegex(ee);
          for (let me = oe.tokensIndex + 1; me < i.length; me++) {
            i[me].value = "";
            i[me].output = "";
            delete i[me].suffix;
          }
          I.output = oe.output + fe.output;
          I.backtrack = true;
          Q({
            type: "paren",
            extglob: true,
            value: F,
            output: ""
          });
          J("parens");
          return;
        }
        let ae = oe.close + (n.capture ? ")" : "");
        let de;
        if (oe.type === "negate") {
          let be = k;
          if (oe.inner && oe.inner.length > 1 && oe.inner.includes("/")) {
            be = C(n);
          }
          if (be !== k || H() || /^\)+$/.test(W())) {
            ae = oe.close = `)$))${be}`;
          }
          if (oe.inner.includes("*") && (de = W()) && /^\.[^\\/.]+$/.test(de)) {
            let fe = Ouo(de, {
              ...t,
              fastpaths: false
            }).output;
            ae = oe.close = `)${fe})${be})`;
          }
          if (oe.prev.type === "bos") {
            I.negatedExtglob = true;
          }
        }
        Q({
          type: "paren",
          extglob: true,
          value: F,
          output: ae
        });
        J("parens");
      };
      if (n.fastpaths !== false && !/(^[*!]|[/()[\]{}"])/.test(e)) {
        let oe = false;
        let ee = e.replace(p_p, (re, se, ae, de, be, fe) => {
          if (de === "\\") {
            oe = true;
            return re;
          }
          if (de === "?") {
            if (se) {
              return se + de + (be ? _.repeat(be.length) : "");
            }
            if (fe === 0) {
              return A + (be ? _.repeat(be.length) : "");
            }
            return _.repeat(ae.length);
          }
          if (de === ".") {
            return u.repeat(ae.length);
          }
          if (de === "*") {
            if (se) {
              return se + de + (be ? k : "");
            }
            return k;
          }
          return se ? re : `\\${re}`;
        });
        if (oe === true) {
          if (n.unescape === true) {
            ee = ee.replace(/\\/g, "");
          } else {
            ee = ee.replace(/\\+/g, re => re.length % 2 === 0 ? "\\\\" : re ? "\\" : "");
          }
        }
        if (ee === e && n.contains === true) {
          I.output = e;
          return I;
        }
        I.output = kV.wrapOutput(ee, I, t);
        return I;
      }
      while (!H()) {
        if (F = N(), F === "\x00") {
          continue;
        }
        if (F === "\\") {
          let re = U();
          if (re === "/" && n.bash !== true) {
            continue;
          }
          if (re === "." || re === ";") {
            continue;
          }
          if (!re) {
            F += "\\";
            Q({
              type: "text",
              value: F
            });
            continue;
          }
          let se = /^\\+/.exec(W());
          let ae = 0;
          if (se && se[0].length > 2) {
            if (ae = se[0].length, I.index += ae, ae % 2 !== 0) {
              F += "\\";
            }
          }
          if (n.unescape === true) {
            F = N();
          } else {
            F += N();
          }
          if (I.brackets === 0) {
            Q({
              type: "text",
              value: F
            });
            continue;
          }
        }
        if (I.brackets > 0 && (F !== "]" || P.value === "[" || P.value === "[^")) {
          if (n.posix !== false && F === ":") {
            let re = P.value.slice(1);
            if (re.includes("[")) {
              if (P.posix = true, re.includes(":")) {
                let se = P.value.lastIndexOf("[");
                let ae = P.value.slice(0, se);
                let de = P.value.slice(se + 2);
                let be = u_p[de];
                if (be) {
                  if (P.value = ae + be, I.backtrack = true, N(), !s.output && i.indexOf(P) === 1) {
                    s.output = m;
                  }
                  continue;
                }
              }
            }
          }
          if (F === "[" && U() !== ":" || F === "-" && U() === "]") {
            F = `\\${F}`;
          }
          if (F === "]" && (P.value === "[" || P.value === "[^")) {
            F = `\\${F}`;
          }
          if (n.posix === true && F === "!" && P.value === "[") {
            F = "^";
          }
          P.value += F;
          z({
            value: F
          });
          continue;
        }
        if (I.quotes === 1 && F !== '"') {
          F = kV.escapeRegex(F);
          P.value += F;
          z({
            value: F
          });
          continue;
        }
        if (F === '"') {
          if (I.quotes = I.quotes === 1 ? 0 : 1, n.keepQuotes === true) {
            Q({
              type: "text",
              value: F
            });
          }
          continue;
        }
        if (F === "(") {
          K("parens");
          Q({
            type: "paren",
            value: F
          });
          continue;
        }
        if (F === ")") {
          if (I.parens === 0 && n.strictBrackets === true) {
            throw SyntaxError(Vdt("opening", "("));
          }
          let re = O[O.length - 1];
          if (re && I.parens === re.parens + 1) {
            ne(O.pop());
            continue;
          }
          Q({
            type: "paren",
            value: F,
            output: I.parens ? ")" : "\\)"
          });
          J("parens");
          continue;
        }
        if (F === "[") {
          if (n.nobracket === true || !W().includes("]")) {
            if (n.nobracket !== true && n.strictBrackets === true) {
              throw SyntaxError(Vdt("closing", "]"));
            }
            F = `\\${F}`;
          } else {
            K("brackets");
          }
          Q({
            type: "bracket",
            value: F
          });
          continue;
        }
        if (F === "]") {
          if (n.nobracket === true || P && P.type === "bracket" && P.value.length === 1) {
            Q({
              type: "text",
              value: F,
              output: `\\${F}`
            });
            continue;
          }
          if (I.brackets === 0) {
            if (n.strictBrackets === true) {
              throw SyntaxError(Vdt("opening", "["));
            }
            Q({
              type: "text",
              value: F,
              output: `\\${F}`
            });
            continue;
          }
          J("brackets");
          let re = P.value.slice(1);
          if (P.posix !== true && re[0] === "^" && !re.includes("/")) {
            F = `/${F}`;
          }
          if (P.value += F, z({
            value: F
          }), n.literalBrackets === false || kV.hasRegexChars(re)) {
            continue;
          }
          let se = kV.escapeRegex(P.value);
          if (I.output = I.output.slice(0, -P.value.length), n.literalBrackets === true) {
            I.output += se;
            P.value = se;
            continue;
          }
          P.value = `(${a}${se}|${P.value})`;
          I.output += P.value;
          continue;
        }
        if (F === "{" && n.nobrace !== true) {
          K("braces");
          let re = {
            type: "brace",
            value: F,
            output: "(",
            outputIndex: I.output.length,
            tokensIndex: I.tokens.length
          };
          M.push(re);
          Q(re);
          continue;
        }
        if (F === "}") {
          let re = M[M.length - 1];
          if (n.nobrace === true || !re) {
            Q({
              type: "text",
              value: F,
              output: F
            });
            continue;
          }
          let se = ")";
          if (re.dots === true) {
            let ae = i.slice();
            let de = [];
            for (let be = ae.length - 1; be >= 0; be--) {
              if (i.pop(), ae[be].type === "brace") {
                break;
              }
              if (ae[be].type !== "dots") {
                de.unshift(ae[be].value);
              }
            }
            se = m_p(de, n);
            I.backtrack = true;
          }
          if (re.comma !== true && re.dots !== true) {
            let ae = I.output.slice(0, re.outputIndex);
            let de = I.tokens.slice(re.tokensIndex);
            re.value = re.output = "\\{";
            F = se = "\\}";
            I.output = ae;
            for (let be of de) {
              I.output += be.output || be.value;
            }
          }
          Q({
            type: "brace",
            value: F,
            output: se
          });
          J("braces");
          M.pop();
          continue;
        }
        if (F === "|") {
          if (O.length > 0) {
            O[O.length - 1].conditions++;
          }
          Q({
            type: "text",
            value: F
          });
          continue;
        }
        if (F === ",") {
          let re = F;
          let se = M[M.length - 1];
          if (se && L[L.length - 1] === "braces") {
            se.comma = true;
            re = "|";
          }
          Q({
            type: "comma",
            value: F,
            output: re
          });
          continue;
        }
        if (F === "/") {
          if (P.type === "dot" && I.index === I.start + 1) {
            I.start = I.index + 1;
            I.consumed = "";
            I.output = "";
            i.pop();
            P = s;
            continue;
          }
          Q({
            type: "slash",
            value: F,
            output: p
          });
          continue;
        }
        if (F === ".") {
          if (I.braces > 0 && P.type === "dot") {
            if (P.value === ".") {
              P.output = u;
            }
            let re = M[M.length - 1];
            P.type = "dots";
            P.output += F;
            P.value += F;
            re.dots = true;
            continue;
          }
          if (I.braces + I.parens === 0 && P.type !== "bos" && P.type !== "slash") {
            Q({
              type: "text",
              value: F,
              output: u
            });
            continue;
          }
          Q({
            type: "dot",
            value: F,
            output: u
          });
          continue;
        }
        if (F === "?") {
          if (!(P && P.value === "(") && n.noextglob !== true && U() === "(" && U(2) !== "?") {
            Z("qmark", F);
            continue;
          }
          if (P && P.type === "paren") {
            let se = U();
            let ae = F;
            if (P.value === "(" && !/[!=<:]/.test(se) || se === "<" && !/<([!=]|\w+>)/.test(W())) {
              ae = `\\${F}`;
            }
            Q({
              type: "text",
              value: F,
              output: ae
            });
            continue;
          }
          if (n.dot !== true && (P.type === "slash" || P.type === "bos")) {
            Q({
              type: "qmark",
              value: F,
              output: b
            });
            continue;
          }
          Q({
            type: "qmark",
            value: F,
            output: _
          });
          continue;
        }
        if (F === "!") {
          if (n.noextglob !== true && U() === "(") {
            if (U(2) !== "?" || !/[!=<:]/.test(U(3))) {
              Z("negate", F);
              continue;
            }
          }
          if (n.nonegate !== true && I.index === 0) {
            V();
            continue;
          }
        }
        if (F === "+") {
          if (n.noextglob !== true && U() === "(" && U(2) !== "?") {
            Z("plus", F);
            continue;
          }
          if (P && P.value === "(" || n.regex === false) {
            Q({
              type: "plus",
              value: F,
              output: d
            });
            continue;
          }
          if (P && (P.type === "bracket" || P.type === "paren" || P.type === "brace") || I.parens > 0) {
            Q({
              type: "plus",
              value: F
            });
            continue;
          }
          Q({
            type: "plus",
            value: d
          });
          continue;
        }
        if (F === "@") {
          if (n.noextglob !== true && U() === "(" && U(2) !== "?") {
            Q({
              type: "at",
              extglob: true,
              value: F,
              output: ""
            });
            continue;
          }
          Q({
            type: "text",
            value: F
          });
          continue;
        }
        if (F !== "*") {
          if (F === "$" || F === "^") {
            F = `\\${F}`;
          }
          let re = d_p.exec(W());
          if (re) {
            F += re[0];
            I.index += re[0].length;
          }
          Q({
            type: "text",
            value: F
          });
          continue;
        }
        if (P && (P.type === "globstar" || P.star === true)) {
          P.type = "star";
          P.star = true;
          P.value += F;
          P.output = k;
          I.backtrack = true;
          I.globstar = true;
          j(F);
          continue;
        }
        let oe = W();
        if (n.noextglob !== true && /^\([^?]/.test(oe)) {
          Z("star", F);
          continue;
        }
        if (P.type === "star") {
          if (n.noglobstar === true) {
            j(F);
            continue;
          }
          let re = P.prev;
          let se = re.prev;
          let ae = re.type === "slash" || re.type === "bos";
          let de = se && (se.type === "star" || se.type === "globstar");
          if (n.bash === true && (!ae || oe[0] && oe[0] !== "/")) {
            Q({
              type: "star",
              value: F,
              output: ""
            });
            continue;
          }
          let be = I.braces > 0 && (re.type === "comma" || re.type === "brace");
          let fe = O.length && (re.type === "pipe" || re.type === "paren");
          if (!ae && re.type !== "paren" && !be && !fe) {
            Q({
              type: "star",
              value: F,
              output: ""
            });
            continue;
          }
          while (oe.slice(0, 3) === "/**") {
            let me = e[I.index + 4];
            if (me && me !== "/") {
              break;
            }
            oe = oe.slice(3);
            j("/**", 3);
          }
          if (re.type === "bos" && H()) {
            P.type = "globstar";
            P.value += F;
            P.output = C(n);
            I.output = P.output;
            I.globstar = true;
            j(F);
            continue;
          }
          if (re.type === "slash" && re.prev.type !== "bos" && !de && H()) {
            I.output = I.output.slice(0, -(re.output + P.output).length);
            re.output = `(?:${re.output}`;
            P.type = "globstar";
            P.output = C(n) + (n.strictSlashes ? ")" : "|$)");
            P.value += F;
            I.globstar = true;
            I.output += re.output + P.output;
            j(F);
            continue;
          }
          if (re.type === "slash" && re.prev.type !== "bos" && oe[0] === "/") {
            let me = oe[1] !== undefined ? "|$" : "";
            I.output = I.output.slice(0, -(re.output + P.output).length);
            re.output = `(?:${re.output}`;
            P.type = "globstar";
            P.output = `${C(n)}${p}|${p}${me})`;
            P.value += F;
            I.output += re.output + P.output;
            I.globstar = true;
            j(F + N());
            Q({
              type: "slash",
              value: "/",
              output: ""
            });
            continue;
          }
          if (re.type === "bos" && oe[0] === "/") {
            P.type = "globstar";
            P.value += F;
            P.output = `(?:^|${p}|${C(n)}${p})`;
            I.output = P.output;
            I.globstar = true;
            j(F + N());
            Q({
              type: "slash",
              value: "/",
              output: ""
            });
            continue;
          }
          I.output = I.output.slice(0, -P.output.length);
          P.type = "globstar";
          P.output = C(n);
          P.value += F;
          I.output += P.output;
          I.globstar = true;
          j(F);
          continue;
        }
        let ee = {
          type: "star",
          value: F,
          output: k
        };
        if (n.bash === true) {
          if (ee.output = ".*?", P.type === "bos" || P.type === "slash") {
            ee.output = x + ee.output;
          }
          Q(ee);
          continue;
        }
        if (P && (P.type === "bracket" || P.type === "paren") && n.regex === true) {
          ee.output = F;
          Q(ee);
          continue;
        }
        if (I.index === I.start || P.type === "slash" || P.type === "dot") {
          if (P.type === "dot") {
            I.output += g;
            P.output += g;
          } else if (n.dot === true) {
            I.output += y;
            P.output += y;
          } else {
            I.output += x;
            P.output += x;
          }
          if (U() !== "*") {
            I.output += m;
            P.output += m;
          }
        }
        Q(ee);
      }
      while (I.brackets > 0) {
        if (n.strictBrackets === true) {
          throw SyntaxError(Vdt("closing", "]"));
        }
        I.output = kV.escapeLast(I.output, "[");
        J("brackets");
      }
      while (I.parens > 0) {
        if (n.strictBrackets === true) {
          throw SyntaxError(Vdt("closing", ")"));
        }
        I.output = kV.escapeLast(I.output, "(");
        J("parens");
      }
      while (I.braces > 0) {
        if (n.strictBrackets === true) {
          throw SyntaxError(Vdt("closing", "}"));
        }
        I.output = kV.escapeLast(I.output, "{");
        J("braces");
      }
      if (n.strictSlashes !== true && (P.type === "star" || P.type === "bracket")) {
        Q({
          type: "maybe_slash",
          value: "",
          output: `${p}?`
        });