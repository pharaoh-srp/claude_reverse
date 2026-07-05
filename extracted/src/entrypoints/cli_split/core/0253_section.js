      let l = {
        className: "number",
        variants: [{
          begin: "\\b(0b[01']+)"
        }, {
          begin: "(-?)\\b([\\d']+(\\.[\\d']*)?|\\.[\\d']+)(u|U|l|L|ul|UL|f|F|b|B)"
        }, {
          begin: "(-?)(\\b0[xX][a-fA-F0-9']+|(\\b[\\d']+(\\.[\\d']*)?|\\.[\\d']+)([eE][-+]?[\\d']+)?)"
        }],
        relevance: 0
      };
      let c = {
        className: "string",
        begin: /"""("*)(?!")(.|\n)*?"""\1/,
        relevance: 1
      };
      let u = {
        className: "string",
        begin: '@"',
        end: '"',
        contains: [{
          begin: '""'
        }]
      };
      let d = e.inherit(u, {
        illegal: /\n/
      });
      let p = {
        className: "subst",
        begin: /\{/,
        end: /\}/,
        keywords: i
      };
      let m = e.inherit(p, {
        illegal: /\n/
      });
      let f = {
        className: "string",
        begin: /\$"/,
        end: '"',
        illegal: /\n/,
        contains: [{
          begin: /\{\{/
        }, {
          begin: /\}\}/
        }, e.BACKSLASH_ESCAPE, m]
      };
      let h = {
        className: "string",
        begin: /\$@"/,
        end: '"',
        contains: [{
          begin: /\{\{/
        }, {
          begin: /\}\}/
        }, {
          begin: '""'
        }, p]
      };
      let g = e.inherit(h, {
        illegal: /\n/,
        contains: [{
          begin: /\{\{/
        }, {
          begin: /\}\}/
        }, {
          begin: '""'
        }, m]
      });
      p.contains = [h, f, u, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, l, e.C_BLOCK_COMMENT_MODE];
      m.contains = [g, f, d, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, l, e.inherit(e.C_BLOCK_COMMENT_MODE, {
        illegal: /\n/
      })];
      let y = {
        variants: [c, h, f, u, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE]
      };
      let _ = {
        begin: "<",
        end: ">",
        contains: [{
          beginKeywords: "in out"
        }, a]
      };
      let b = e.IDENT_RE + "(<" + e.IDENT_RE + "(\\s*,\\s*" + e.IDENT_RE + ")*>)?(\\[\\])?";
      let S = {
        begin: "@" + e.IDENT_RE,
        relevance: 0
      };
      return {
        name: "C#",
        aliases: ["cs", "c#"],
        keywords: i,
        illegal: /::/,
        contains: [e.COMMENT("///", "$", {
          returnBegin: true,
          contains: [{
            className: "doctag",
            variants: [{
              begin: "///",
              relevance: 0
            }, {
              begin: "<!--|-->"
            }, {
              begin: "</?",
              end: ">"
            }]
          }]
        }), e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, {
          className: "meta",
          begin: "#",
          end: "$",
          keywords: {
            keyword: "if else elif endif define undef warning error line region endregion pragma checksum"
          }
        }, y, l, {
          beginKeywords: "class interface",
          relevance: 0,
          end: /[{;=]/,
          illegal: /[^\s:,]/,
          contains: [{
            beginKeywords: "where class"
          }, a, _, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE]
        }, {
          beginKeywords: "namespace",
          relevance: 0,
          end: /[{;=]/,
          illegal: /[^\s:]/,
          contains: [a, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE]
        }, {
          beginKeywords: "record",
          relevance: 0,
          end: /[{;=]/,
          illegal: /[^\s:]/,
          contains: [a, _, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE]
        }, {
          className: "meta",
          begin: "^\\s*\\[(?=[\\w])",
          excludeBegin: true,
          end: "\\]",
          excludeEnd: true,
          contains: [{
            className: "string",
            begin: /"/,
            end: /"/
          }]
        }, {
          beginKeywords: "new return throw await else",
          relevance: 0
        }, {
          className: "function",
          begin: "(" + b + "\\s+)+" + e.IDENT_RE + "\\s*(<[^=]+>\\s*)?\\(",
          returnBegin: true,
          end: /\s*[{;=]/,
          excludeEnd: true,
          keywords: i,
          contains: [{
            beginKeywords: n.join(" "),
            relevance: 0
          }, {
            begin: e.IDENT_RE + "\\s*(<[^=]+>\\s*)?\\(",
            returnBegin: true,
            contains: [e.TITLE_MODE, _],
            relevance: 0
          }, {
            match: /\(\)/
          }, {
            className: "params",
            begin: /\(/,
            end: /\)/,
            excludeBegin: true,
            excludeEnd: true,
            keywords: i,
            relevance: 0,
            contains: [y, l, e.C_BLOCK_COMMENT_MODE]
          }, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE]
        }, S]
      };
    }
    hTa.exports = Cwp;
  });