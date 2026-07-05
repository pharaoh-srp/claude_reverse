      }
      if (I.backtrack === true) {
        I.output = "";
        for (let oe of I.tokens) {
          if (I.output += oe.output != null ? oe.output : oe.value, oe.suffix) {
            I.output += oe.suffix;
          }
        }
      }
      return I;
    };
    Ouo.fastpaths = (e, t) => {
      let n = {
        ...t
      };
      let r = typeof n.maxLength === "number" ? Math.min(z2n, n.maxLength) : z2n;
      let o = e.length;
      if (o > r) {
        throw SyntaxError(`Input length: ${o}, exceeds maximum allowed length: ${r}`);
      }
      e = dma[e] || e;
      let {
        DOT_LITERAL: s,
        SLASH_LITERAL: i,
        ONE_CHAR: a,
        DOTS_SLASH: l,
        NO_DOT: c,
        NO_DOTS: u,
        NO_DOTS_SLASH: d,
        STAR: p,
        START_ANCHOR: m
      } = u4t.globChars(n.windows);
      let f = n.dot ? u : c;
      let h = n.dot ? d : c;
      let g = n.capture ? "" : "?:";
      let y = {
        negated: false,
        prefix: ""
      };
      let _ = n.bash === true ? ".*?" : p;
      if (n.capture) {
        _ = `(${_})`;
      }
      let b = x => {
        if (x.noglobstar === true) {
          return _;
        }
        return `(${g}(?:(?!${m}${x.dot ? l : s}).)*?)`;
      };
      let S = x => {
        switch (x) {
          case "*":
            return `${f}${a}${_}`;
          case ".*":
            return `${s}${a}${_}`;
          case "*.*":
            return `${f}${_}${s}${a}${_}`;
          case "*/*":
            return `${f}${_}${i}${a}${h}${_}`;
          case "**":
            return f + b(n);
          case "**/*":
            return `(?:${f}${b(n)}${i})?${h}${a}${_}`;
          case "**/*.*":
            return `(?:${f}${b(n)}${i})?${h}${_}${s}${a}${_}`;
          case "**/.*":
            return `(?:${f}${b(n)}${i})?${s}${a}${_}`;
          default:
            {
              let A = /^(.*?)\.(\w+)$/.exec(x);
              if (!A) {
                return;
              }
              let k = S(A[1]);
              if (!k) {
                return;
              }
              return k + s + A[2];
            }
        }
      };
      let E = kV.removePrefix(e, y);
      let C = S(E);
      if (C && n.strictSlashes !== true) {
        C += `${i}?`;
      }
      return C;
    };
    fma.exports = Ouo;
  });