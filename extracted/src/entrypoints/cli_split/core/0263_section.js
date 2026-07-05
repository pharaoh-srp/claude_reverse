          return F;
        })(g),
        built_in: _
      };
      let E = P => P.map(F => F.replace(/\|\d+$/, ""));
      let C = {
        variants: [{
          match: [/new/, t.concat(`[ 	
]`, "+"), t.concat("(?!", E(_).join("\\b|"), "\\b)"), o],
          scope: {
            1: "keyword",
            4: "title.class"
          }
        }]
      };
      let x = t.concat(r, "\\b(?!\\()");
      let A = {
        variants: [{
          match: [t.concat(/::/, t.lookahead(/(?!class\b)/)), x],
          scope: {
            2: "variable.constant"
          }
        }, {
          match: [/::/, /class/],
          scope: {
            2: "variable.language"
          }
        }, {
          match: [o, t.concat(/::/, t.lookahead(/(?!class\b)/)), x],
          scope: {
            1: "title.class",
            3: "variable.constant"
          }
        }, {
          match: [o, t.concat("::", t.lookahead(/(?!class\b)/))],
          scope: {
            1: "title.class"
          }
        }, {
          match: [o, /::/, /class/],
          scope: {
            1: "title.class",
            3: "variable.language"
          }
        }]
      };
      let k = {
        scope: "attr",
        match: t.concat(r, t.lookahead(":"), t.lookahead(/(?!::)/))
      };
      let I = {
        relevance: 0,
        begin: /\(/,
        end: /\)/,
        keywords: S,
        contains: [k, i, A, e.C_BLOCK_COMMENT_MODE, f, h, C]
      };
      let O = {
        relevance: 0,
        match: [/\b/, t.concat("(?!fn\\b|function\\b|", E(y).join("\\b|"), "|", E(_).join("\\b|"), "\\b)"), r, t.concat(`[ 	
]`, "*"), t.lookahead(/(?=\()/)],
        scope: {
          3: "title.function.invoke"
        },
        contains: [I]
      };
      I.contains.push(O);
      let M = [k, A, e.C_BLOCK_COMMENT_MODE, f, h, C];
      let L = {
        begin: t.concat(/#\[\s*\\?/, t.either(o, s)),
        beginScope: "meta",
        end: /]/,
        endScope: "meta",
        keywords: {
          literal: g,
          keyword: ["new", "array"]
        },
        contains: [{
          begin: /\[/,
          end: /]/,
          keywords: {
            literal: g,
            keyword: ["new", "array"]
          },
          contains: ["self", ...M]
        }, ...M, {
          scope: "meta",
          variants: [{
            match: o
          }, {
            match: s
          }]
        }]
      };
      return {
        case_insensitive: false,
        keywords: S,
        contains: [L, e.HASH_COMMENT_MODE, e.COMMENT("//", "$"), e.COMMENT("/\\*", "\\*/", {
          contains: [{
            scope: "doctag",
            match: "@[A-Za-z]+"
          }]
        }), {
          match: /__halt_compiler\(\);/,
          keywords: "__halt_compiler",
          starts: {
            scope: "comment",
            end: e.MATCH_NOTHING_RE,
            contains: [{
              match: /\?>/,
              scope: "meta",
              endsParent: true
            }]
          }
        }, a, {
          scope: "variable.language",
          match: /\$this\b/
        }, i, O, A, {
          match: [/const/, /\s/, r],
          scope: {
            1: "keyword",
            3: "variable.constant"
          }
        }, C, {
          scope: "function",
          relevance: 0,
          beginKeywords: "fn function",
          end: /[;{]/,
          excludeEnd: true,
          illegal: "[$%\\[]",
          contains: [{
            beginKeywords: "use"
          }, e.UNDERSCORE_TITLE_MODE, {
            begin: "=>",
            endsParent: true
          }, {
            scope: "params",
            begin: "\\(",
            end: "\\)",
            excludeBegin: true,
            excludeEnd: true,
            keywords: S,
            contains: ["self", L, i, A, e.C_BLOCK_COMMENT_MODE, f, h]
          }]
        }, {
          scope: "class",
          variants: [{
            beginKeywords: "enum",
            illegal: /[($"]/
          }, {
            beginKeywords: "class interface trait",
            illegal: /[:($"]/
          }],
          relevance: 0,
          end: /\{/,
          excludeEnd: true,
          contains: [{
            beginKeywords: "extends implements"
          }, e.UNDERSCORE_TITLE_MODE]
        }, {
          beginKeywords: "namespace",
          relevance: 0,
          end: ";",
          illegal: /[.']/,
          contains: [e.inherit(e.UNDERSCORE_TITLE_MODE, {
            scope: "title.class"
          })]
        }, {
          beginKeywords: "use",
          relevance: 0,
          end: ";",
          contains: [{
            match: /\b(as|const|function)\b/,
            scope: "keyword"
          }, e.UNDERSCORE_TITLE_MODE]
        }, f, h]
      };
    }
    Gwa.exports = URp;
  });