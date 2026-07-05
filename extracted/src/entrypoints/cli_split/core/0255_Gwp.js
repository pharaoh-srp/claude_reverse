  var $Ta = __commonJS((cJy, BTa) => {
    function Gwp(e) {
      let t = {
        className: "string",
        variants: [e.inherit(e.QUOTE_STRING_MODE, {
          begin: '((u8?|U)|L)?"'
        }), {
          begin: '(u8?|U)?R"',
          end: '"',
          contains: [e.BACKSLASH_ESCAPE]
        }, {
          begin: "'\\\\?.",
          end: "'",
          illegal: "."
        }]
      };
      let n = {
        className: "number",
        variants: [{
          begin: "\\b(\\d+(\\.\\d*)?|\\.\\d+)(u|U|l|L|ul|UL|f|F)"
        }, {
          begin: e.C_NUMBER_RE
        }],
        relevance: 0
      };
      let r = {
        className: "meta",
        begin: "#",
        end: "$",
        keywords: {
          keyword: "if else elif endif define undef ifdef ifndef"
        },
        contains: [{
          begin: /\\\n/,
          relevance: 0
        }, {
          beginKeywords: "include",
          end: "$",
          keywords: {
            keyword: "include"
          },
          contains: [e.inherit(t, {
            className: "string"
          }), {
            className: "string",
            begin: "<",
            end: ">",
            illegal: "\\n"
          }]
        }, t, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE]
      };
      let o = {
        className: "variable",
        begin: /&[a-z\d_]*\b/
      };
      let s = {
        className: "keyword",
        begin: "/[a-z][a-z\\d-]*/"
      };
      let i = {
        className: "symbol",
        begin: "^\\s*[a-zA-Z_][a-zA-Z\\d_]*:"
      };
      let a = {
        className: "params",
        relevance: 0,
        begin: "<",
        end: ">",
        contains: [n, o]
      };
      let l = {
        className: "title.class",
        begin: /[a-zA-Z_][a-zA-Z\d_@-]*(?=\s\{)/,
        relevance: 0.2
      };
      let c = {
        className: "title.class",
        begin: /^\/(?=\s*\{)/,
        relevance: 10
      };
      let u = {
        match: /[a-z][a-z-,]+(?=;)/,
        relevance: 0,
        scope: "attr"
      };
      let d = {
        relevance: 0,
        match: [/[a-z][a-z-,]+/, /\s*/, /=/],
        scope: {
          1: "attr",
          3: "operator"
        }
      };
      let p = {
        scope: "punctuation",
        relevance: 0,
        match: /\};|[;{}]/
      };
      return {
        name: "Device Tree",
        contains: [c, o, s, i, l, d, u, a, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, n, t, r, p, {
          begin: e.IDENT_RE + "::",
          keywords: ""
        }]
      };
    }
    BTa.exports = Gwp;
  });