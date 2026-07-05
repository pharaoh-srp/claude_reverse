  var ARa = __commonJS((vQy, kRa) => {
    function Yxp(e) {
      return {
        name: "Tagger Script",
        contains: [{
          className: "comment",
          begin: /\$noop\(/,
          end: /\)/,
          contains: [{
            begin: /\\[()]/
          }, {
            begin: /\(/,
            end: /\)/,
            contains: [{
              begin: /\\[()]/
            }, "self"]
          }],
          relevance: 10
        }, {
          className: "keyword",
          begin: /\$[_a-zA-Z0-9]+(?=\()/
        }, {
          className: "variable",
          begin: /%[_a-zA-Z0-9:]+%/
        }, {
          className: "symbol",
          begin: /\\[\\nt$%,()]/
        }, {
          className: "symbol",
          begin: /\\u[a-fA-F0-9]{4}/
        }]
      };
    }
    kRa.exports = Yxp;
  });
  var PRa = __commonJS((wQy, IRa) => {
    function Jxp(e) {
      return {
        name: "Test Anything Protocol",
        case_insensitive: true,
        contains: [e.HASH_COMMENT_MODE, {
          className: "meta",
          variants: [{
            begin: "^TAP version (\\d+)$"
          }, {
            begin: "^1\\.\\.(\\d+)$"
          }]
        }, {
          begin: /---$/,
          end: "\\.\\.\\.$",
          subLanguage: "yaml",
          relevance: 0
        }, {
          className: "number",
          begin: " (\\d+) "
        }, {
          className: "symbol",
          variants: [{
            begin: "^ok"
          }, {
            begin: "^not ok"
          }]
        }]
      };
    }
    IRa.exports = Jxp;
  });
  var DRa = __commonJS((CQy, ORa) => {
    function Xxp(e) {
      let t = e.regex;
      let n = /[a-zA-Z_][a-zA-Z0-9_]*/;
      let r = {
        className: "number",
        variants: [e.BINARY_NUMBER_MODE, e.C_NUMBER_MODE]
      };
      return {
        name: "Tcl",
        aliases: ["tk"],
        keywords: ["after", "append", "apply", "array", "auto_execok", "auto_import", "auto_load", "auto_mkindex", "auto_mkindex_old", "auto_qualify", "auto_reset", "bgerror", "binary", "break", "catch", "cd", "chan", "clock", "close", "concat", "continue", "dde", "dict", "encoding", "eof", "error", "eval", "exec", "exit", "expr", "fblocked", "fconfigure", "fcopy", "file", "fileevent", "filename", "flush", "for", "foreach", "format", "gets", "glob", "global", "history", "http", "if", "incr", "info", "interp", "join", "lappend|10", "lassign|10", "lindex|10", "linsert|10", "list", "llength|10", "load", "lrange|10", "lrepeat|10", "lreplace|10", "lreverse|10", "lsearch|10", "lset|10", "lsort|10", "mathfunc", "mathop", "memory", "msgcat", "namespace", "open", "package", "parray", "pid", "pkg::create", "pkg_mkIndex", "platform", "platform::shell", "proc", "puts", "pwd", "read", "refchan", "regexp", "registry", "regsub|10", "rename", "return", "safe", "scan", "seek", "set", "socket", "source", "split", "string", "subst", "switch", "tcl_endOfWord", "tcl_findLibrary", "tcl_startOfNextWord", "tcl_startOfPreviousWord", "tcl_wordBreakAfter", "tcl_wordBreakBefore", "tcltest", "tclvars", "tell", "time", "tm", "trace", "unknown", "unload", "unset", "update", "uplevel", "upvar", "variable", "vwait", "while"],
        contains: [e.COMMENT(";[ \\t]*#", "$"), e.COMMENT("^[ \\t]*#", "$"), {
          beginKeywords: "proc",
          end: "[\\{]",
          excludeEnd: true,
          contains: [{
            className: "title",
            begin: "[ \\t\\n\\r]+(::)?[a-zA-Z_]((::)?[a-zA-Z0-9_])*",
            end: "[ \\t\\n\\r]",
            endsWithParent: true,
            excludeEnd: true
          }]
        }, {
          className: "variable",
          variants: [{
            begin: t.concat(/\$/, t.optional(/::/), n, "(::", n, ")*")
          }, {
            begin: "\\$\\{(::)?[a-zA-Z_]((::)?[a-zA-Z0-9_])*",
            end: "\\}",
            contains: [r]
          }]
        }, {
          className: "string",
          contains: [e.BACKSLASH_ESCAPE],
          variants: [e.inherit(e.QUOTE_STRING_MODE, {
            illegal: null
          })]
        }, r]
      };
    }
    ORa.exports = Xxp;
  });
  var NRa = __commonJS((RQy, MRa) => {
    function Qxp(e) {
      let t = ["bool", "byte", "i16", "i32", "i64", "double", "string", "binary"];
      return {
        name: "Thrift",
        keywords: {
          keyword: ["namespace", "const", "typedef", "struct", "enum", "service", "exception", "void", "oneway", "set", "list", "map", "required", "optional"],
          type: t,
          literal: "true false"
        },
        contains: [e.QUOTE_STRING_MODE, e.NUMBER_MODE, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, {
          className: "class",
          beginKeywords: "struct enum service exception",
          end: /\{/,
          illegal: /\n/,
          contains: [e.inherit(e.TITLE_MODE, {
            starts: {
              endsWithParent: true,
              excludeEnd: true
            }
          })]
        }, {
          begin: "\\b(set|list|map)\\s*<",
          keywords: {
            type: [...t, "set", "list", "map"]
          },
          end: ">",
          contains: ["self"]
        }]
      };
    }
    MRa.exports = Qxp;
  });
  var FRa = __commonJS((xQy, LRa) => {
    function Zxp(e) {
      let t = {
        className: "number",
        begin: "[1-9][0-9]*",
        relevance: 0
      };
      let n = {
        className: "symbol",
        begin: ":[^\\]]+"
      };
      let r = {
        className: "built_in",
        begin: "(AR|P|PAYLOAD|PR|R|SR|RSR|LBL|VR|UALM|MESSAGE|UTOOL|UFRAME|TIMER|TIMER_OVERFLOW|JOINT_MAX_SPEED|RESUME_PROG|DIAG_REC)\\[",
        end: "\\]",
        contains: ["self", t, n]
      };
      let o = {
        className: "built_in",
        begin: "(AI|AO|DI|DO|F|RI|RO|UI|UO|GI|GO|SI|SO)\\[",
        end: "\\]",
        contains: ["self", t, e.QUOTE_STRING_MODE, n]
      };
      return {
        name: "TP",
        keywords: {
          keyword: ["ABORT", "ACC", "ADJUST", "AND", "AP_LD", "BREAK", "CALL", "CNT", "COL", "CONDITION", "CONFIG", "DA", "DB", "DIV", "DETECT", "ELSE", "END", "ENDFOR", "ERR_NUM", "ERROR_PROG", "FINE", "FOR", "GP", "GUARD", "INC", "IF", "JMP", "LINEAR_MAX_SPEED", "LOCK", "MOD", "MONITOR", "OFFSET", "Offset", "OR", "OVERRIDE", "PAUSE", "PREG", "PTH", "RT_LD", "RUN", "SELECT", "SKIP", "Skip", "TA", "TB", "TO", "TOOL_OFFSET", "Tool_Offset", "UF", "UT", "UFRAME_NUM", "UTOOL_NUM", "UNLOCK", "WAIT", "X", "Y", "Z", "W", "P", "R", "STRLEN", "SUBSTR", "FINDSTR", "VOFFSET", "PROG", "ATTR", "MN", "POS"],
          literal: ["ON", "OFF", "max_speed", "LPOS", "JPOS", "ENABLE", "DISABLE", "START", "STOP", "RESET"]
        },
        contains: [r, o, {
          className: "keyword",
          begin: "/(PROG|ATTR|MN|POS|END)\\b"
        }, {
          className: "keyword",
          begin: "(CALL|RUN|POINT_LOGIC|LBL)\\b"
        }, {
          className: "keyword",
          begin: "\\b(ACC|CNT|Skip|Offset|PSPD|RT_LD|AP_LD|Tool_Offset)"
        }, {
          className: "number",
          begin: "\\d+(sec|msec|mm/sec|cm/min|inch/min|deg/sec|mm|in|cm)?\\b",
          relevance: 0
        }, e.COMMENT("//", "[;$]"), e.COMMENT("!", "[;$]"), e.COMMENT("--eg:", "$"), e.QUOTE_STRING_MODE, {
          className: "string",
          begin: "'",
          end: "'"
        }, e.C_NUMBER_MODE, {
          className: "variable",
          begin: "\\$[A-Za-z0-9_]+"
        }]
      };
    }
    LRa.exports = Zxp;
  });
  var BRa = __commonJS((kQy, URa) => {
    function ekp(e) {
      let t = e.regex;
      let n = ["absolute_url", "asset|0", "asset_version", "attribute", "block", "constant", "controller|0", "country_timezones", "csrf_token", "cycle", "date", "dump", "expression", "form|0", "form_end", "form_errors", "form_help", "form_label", "form_rest", "form_row", "form_start", "form_widget", "html_classes", "include", "is_granted", "logout_path", "logout_url", "max", "min", "parent", "path|0", "random", "range", "relative_path", "render", "render_esi", "source", "template_from_string", "url|0"];
      let r = ["abs", "abbr_class", "abbr_method", "batch", "capitalize", "column", "convert_encoding", "country_name", "currency_name", "currency_symbol", "data_uri", "date", "date_modify", "default", "escape", "file_excerpt", "file_link", "file_relative", "filter", "first", "format", "format_args", "format_args_as_text", "format_currency", "format_date", "format_datetime", "format_file", "format_file_from_text", "format_number", "format_time", "html_to_markdown", "humanize", "inky_to_html", "inline_css", "join", "json_encode", "keys", "language_name", "last", "length", "locale_name", "lower", "map", "markdown", "markdown_to_html", "merge", "nl2br", "number_format", "raw", "reduce", "replace", "reverse", "round", "slice", "slug", "sort", "spaceless", "split", "striptags", "timezone_name", "title", "trans", "transchoice", "trim", "u|0", "upper", "url_encode", "yaml_dump", "yaml_encode"];
      let o = ["apply", "autoescape", "block", "cache", "deprecated", "do", "embed", "extends", "filter", "flush", "for", "form_theme", "from", "if", "import", "include", "macro", "sandbox", "set", "stopwatch", "trans", "trans_default_domain", "transchoice", "use", "verbatim", "with"];
      o = o.concat(o.map(f => `end${f}`));
      let s = {
        scope: "string",
        variants: [{
          begin: /'/,
          end: /'/
        }, {
          begin: /"/,
          end: /"/
        }]
      };
      let i = {
        scope: "number",
        match: /\d+/
      };
      let a = {
        begin: /\(/,
        end: /\)/,
        excludeBegin: true,
        excludeEnd: true,
        contains: [s, i]
      };
      let l = {
        beginKeywords: n.join(" "),
        keywords: {
          name: n
        },
        relevance: 0,
        contains: [a]
      };
      let c = {
        match: /\|(?=[A-Za-z_]+:?)/,
        beginScope: "punctuation",
        relevance: 0,
        contains: [{
          match: /[A-Za-z_]+:?/,
          keywords: r
        }]
      };
      let u = (f, {
        relevance: h
      }) => ({
        beginScope: {
          1: "template-tag",
          3: "name"
        },
        relevance: h || 2,
        endScope: "template-tag",
        begin: [/\{%/, /\s*/, t.either(...f)],
        end: /%\}/,
        keywords: "in",
        contains: [c, l, s, i]
      });
      let d = /[a-z_]+/;
      let p = u(o, {
        relevance: 2
      });
      let m = u([d], {
        relevance: 1
      });
      return {
        name: "Twig",
        aliases: ["craftcms"],
        case_insensitive: true,
        subLanguage: "xml",
        contains: [e.COMMENT(/\{#/, /#\}/), p, m, {
          className: "template-variable",
          begin: /\{\{/,
          end: /\}\}/,
          contains: ["self", c, l, s, i]
        }]
      };
    }
    URa.exports = ekp;
  });
  var KRa = __commonJS((AQy, zRa) => {
    var $Ra = ["as", "in", "of", "if", "for", "while", "finally", "var", "new", "function", "do", "return", "void", "else", "break", "catch", "instanceof", "with", "throw", "case", "default", "try", "switch", "continue", "typeof", "delete", "let", "yield", "const", "class", "debugger", "async", "await", "static", "import", "from", "export", "extends", "using"];
    var HRa = ["true", "false", "null", "undefined", "NaN", "Infinity"];
    var jRa = ["Object", "Function", "Boolean", "Symbol", "Math", "Date", "Number", "BigInt", "String", "RegExp", "Array", "Float32Array", "Float64Array", "Int8Array", "Uint8Array", "Uint8ClampedArray", "Int16Array", "Int32Array", "Uint16Array", "Uint32Array", "BigInt64Array", "BigUint64Array", "Set", "Map", "WeakSet", "WeakMap", "ArrayBuffer", "SharedArrayBuffer", "Atomics", "DataView", "JSON", "Promise", "Generator", "GeneratorFunction", "AsyncFunction", "Reflect", "Proxy", "Intl", "WebAssembly"];
    var qRa = ["Error", "EvalError", "InternalError", "RangeError", "ReferenceError", "SyntaxError", "TypeError", "URIError"];
    var WRa = ["setInterval", "setTimeout", "clearInterval", "clearTimeout", "require", "exports", "eval", "isFinite", "isNaN", "parseFloat", "parseInt", "decodeURI", "decodeURIComponent", "encodeURI", "encodeURIComponent", "escape", "unescape"];
    var GRa = ["arguments", "this", "super", "console", "window", "document", "localStorage", "sessionStorage", "module", "global"];
    var VRa = [].concat(WRa, jRa, qRa);
    function tkp(e) {
      let t = e.regex;
      let n = (N, {
        after: W
      }) => {
        let j = "</" + N[0].slice(1);
        return N.input.indexOf(j, W) !== -1;
      };
      let r = "[A-Za-z$_][0-9A-Za-z$_]*";
      let o = {
        begin: "<>",
        end: "</>"
      };
      let s = /<[A-Za-z0-9\\._:-]+\s*\/>/;
      let i = {
        begin: /<[A-Za-z0-9\\._:-]+/,
        end: /\/[A-Za-z0-9\\._:-]+>|\/>/,
        isTrulyOpeningTag: (N, W) => {
          let j = N[0].length + N.index;
          let z = N.input[j];
          if (z === "<" || z === ",") {
            W.ignoreMatch();
            return;
          }
          if (z === ">") {
            if (!n(N, {
              after: j
            })) {
              W.ignoreMatch();
            }
          }
          let V;
          let K = N.input.substring(j);
          if (V = K.match(/^\s*=/)) {
            W.ignoreMatch();
            return;
          }
          if (V = K.match(/^\s+extends\s+/)) {
            if (V.index === 0) {
              W.ignoreMatch();
              return;
            }
          }
        }
      };
      let a = {
        $pattern: "[A-Za-z$_][0-9A-Za-z$_]*",
        keyword: $Ra,
        literal: HRa,
        built_in: VRa,
        "variable.language": GRa
      };
      let l = "[0-9](_?[0-9])*";
      let c = "\\.([0-9](_?[0-9])*)";
      let u = "0|[1-9](_?[0-9])*|0[0-7]*[89][0-9]*";
      let d = {
        className: "number",
        variants: [{
          begin: "(\\b(0|[1-9](_?[0-9])*|0[0-7]*[89][0-9]*)((\\.([0-9](_?[0-9])*))|\\.)?|(\\.([0-9](_?[0-9])*)))[eE][+-]?([0-9](_?[0-9])*)\\b"
        }, {
          begin: "\\b(0|[1-9](_?[0-9])*|0[0-7]*[89][0-9]*)\\b((\\.([0-9](_?[0-9])*))\\b|\\.)?|(\\.([0-9](_?[0-9])*))\\b"
        }, {
          begin: "\\b(0|[1-9](_?[0-9])*)n\\b"
        }, {
          begin: "\\b0[xX][0-9a-fA-F](_?[0-9a-fA-F])*n?\\b"
        }, {
          begin: "\\b0[bB][0-1](_?[0-1])*n?\\b"
        }, {
          begin: "\\b0[oO][0-7](_?[0-7])*n?\\b"
        }, {
          begin: "\\b0[0-7]+n?\\b"
        }],
        relevance: 0
      };
      let p = {
        className: "subst",
        begin: "\\$\\{",
        end: "\\}",
        keywords: a,
        contains: []
      };
      let m = {
        begin: ".?html`",
        end: "",
        starts: {
          end: "`",
          returnEnd: false,
          contains: [e.BACKSLASH_ESCAPE, p],
          subLanguage: "xml"
        }
      };
      let f = {
        begin: ".?css`",
        end: "",
        starts: {
          end: "`",
          returnEnd: false,
          contains: [e.BACKSLASH_ESCAPE, p],
          subLanguage: "css"
        }
      };
      let h = {
        begin: ".?gql`",
        end: "",
        starts: {
          end: "`",
          returnEnd: false,
          contains: [e.BACKSLASH_ESCAPE, p],
          subLanguage: "graphql"
        }
      };
      let g = {
        className: "string",
        begin: "`",
        end: "`",
        contains: [e.BACKSLASH_ESCAPE, p]
      };
      let _ = {
        className: "comment",
        variants: [e.COMMENT(/\/\*\*(?!\/)/, "\\*/", {
          relevance: 0,
          contains: [{
            begin: "(?=@[A-Za-z]+)",
            relevance: 0,
            contains: [{
              className: "doctag",
              begin: "@[A-Za-z]+"
            }, {
              className: "type",
              begin: "\\{",
              end: "\\}",
              excludeEnd: true,
              excludeBegin: true,
              relevance: 0
            }, {
              className: "variable",
              begin: "[A-Za-z$_][0-9A-Za-z$_]*(?=\\s*(-)|$)",
              endsParent: true,
              relevance: 0
            }, {
              begin: /(?=[^\n])\s/,
              relevance: 0
            }]
          }]
        }), e.C_BLOCK_COMMENT_MODE, e.C_LINE_COMMENT_MODE]
      };
      let b = [e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, m, f, h, g, {
        match: /\$\d+/
      }, d];
      p.contains = b.concat({
        begin: /\{/,
        end: /\}/,
        keywords: a,
        contains: ["self"].concat(b)
      });
      let S = [].concat(_, p.contains);
      let E = S.concat([{
        begin: /(\s*)\(/,
        end: /\)/,
        keywords: a,
        contains: ["self"].concat(S)
      }]);
      let C = {
        className: "params",
        begin: /(\s*)\(/,
        end: /\)/,
        excludeBegin: true,
        excludeEnd: true,
        keywords: a,
        contains: E
      };
      let x = {
        variants: [{
          match: [/class/, /\s+/, "[A-Za-z$_][0-9A-Za-z$_]*", /\s+/, /extends/, /\s+/, t.concat("[A-Za-z$_][0-9A-Za-z$_]*", "(", t.concat(/\./, "[A-Za-z$_][0-9A-Za-z$_]*"), ")*")],
          scope: {
            1: "keyword",
            3: "title.class",
            5: "keyword",
            7: "title.class.inherited"
          }
        }, {
          match: [/class/, /\s+/, "[A-Za-z$_][0-9A-Za-z$_]*"],
          scope: {
            1: "keyword",
            3: "title.class"
          }
        }]
      };
      let A = {
        relevance: 0,
        match: t.either(/\bJSON/, /\b[A-Z][a-z]+([A-Z][a-z]*|\d)*/, /\b[A-Z]{2,}([A-Z][a-z]+|\d)+([A-Z][a-z]*)*/, /\b[A-Z]{2,}[a-z]+([A-Z][a-z]+|\d)*([A-Z][a-z]*)*/),
        className: "title.class",
        keywords: {
          _: [...jRa, ...qRa]
        }
      };
      let k = {
        label: "use_strict",
        className: "meta",
        relevance: 10,
        begin: /^\s*['"]use (strict|asm)['"]/
      };
      let I = {
        variants: [{
          match: [/function/, /\s+/, "[A-Za-z$_][0-9A-Za-z$_]*", /(?=\s*\()/]
        }, {
          match: [/function/, /\s*(?=\()/]
        }],
        className: {
          1: "keyword",
          3: "title.function"
        },
        label: "func.def",
        contains: [C],
        illegal: /%/
      };
      let O = {
        relevance: 0,
        match: /\b[A-Z][A-Z_0-9]+\b/,
        className: "variable.constant"
      };
      function M(N) {
        return t.concat("(?!", N.join("|"), ")");
      }
      let L = {
        match: t.concat(/\b/, M([...WRa, "super", "import"].map(N => `${N}\\s*\\(`)), "[A-Za-z$_][0-9A-Za-z$_]*", t.lookahead(/\s*\(/)),
        className: "title.function",
        relevance: 0
      };
      let P = {
        begin: t.concat(/\./, t.lookahead(t.concat("[A-Za-z$_][0-9A-Za-z$_]*", /(?![0-9A-Za-z$_(])/))),
        end: "[A-Za-z$_][0-9A-Za-z$_]*",
        excludeBegin: true,
        keywords: "prototype",
        className: "property",
        relevance: 0
      };
      let F = {
        match: [/get|set/, /\s+/, "[A-Za-z$_][0-9A-Za-z$_]*", /(?=\()/],
        className: {
          1: "keyword",
          3: "title.function"
        },
        contains: [{
          begin: /\(\)/
        }, C]
      };
      let H = "(\\([^()]*(\\([^()]*(\\([^()]*\\)[^()]*)*\\)[^()]*)*\\)|" + e.UNDERSCORE_IDENT_RE + ")\\s*=>";
      let U = {
        match: [/const|var|let/, /\s+/, "[A-Za-z$_][0-9A-Za-z$_]*", /\s*/, /=\s*/, /(async\s*)?/, t.lookahead(H)],
        keywords: "async",
        className: {
          1: "keyword",
          3: "title.function"
        },
        contains: [C]
      };
      return {
        name: "JavaScript",
        aliases: ["js", "jsx", "mjs", "cjs"],
        keywords: a,
        exports: {
          PARAMS_CONTAINS: E,
          CLASS_REFERENCE: A
        },
        illegal: /#(?![$_A-z])/,
        contains: [e.SHEBANG({
          label: "shebang",
          binary: "node",
          relevance: 5
        }), k, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, m, f, h, g, _, {
          match: /\$\d+/
        }, d, A, {
          scope: "attr",
          match: "[A-Za-z$_][0-9A-Za-z$_]*" + t.lookahead(":"),
          relevance: 0
        }, U, {
          begin: "(" + e.RE_STARTERS_RE + "|\\b(case|return|throw)\\b)\\s*",
          keywords: "return throw case",
          relevance: 0,
          contains: [_, e.REGEXP_MODE, {
            className: "function",
            begin: H,
            returnBegin: true,
            end: "\\s*=>",
            contains: [{
              className: "params",
              variants: [{
                begin: e.UNDERSCORE_IDENT_RE,
                relevance: 0
              }, {
                className: null,
                begin: /\(\s*\)/,
                skip: true
              }, {
                begin: /(\s*)\(/,
                end: /\)/,
                excludeBegin: true,
                excludeEnd: true,
                keywords: a,
                contains: E
              }]
            }]
          }, {
            begin: /,/,
            relevance: 0
          }, {
            match: /\s+/,
            relevance: 0
          }, {
            variants: [{
              begin: o.begin,
              end: o.end
            }, {
              match: s
            }, {
              begin: i.begin,
              "on:begin": i.isTrulyOpeningTag,
              end: i.end
            }],
            subLanguage: "xml",
            contains: [{
              begin: i.begin,
              end: i.end,
              skip: true,
              contains: ["self"]
            }]
          }]
        }, I, {
          beginKeywords: "while if switch catch for"
        }, {
          begin: "\\b(?!function)" + e.UNDERSCORE_IDENT_RE + "\\([^()]*(\\([^()]*(\\([^()]*\\)[^()]*)*\\)[^()]*)*\\)\\s*\\{",
          returnBegin: true,
          label: "func.def",
          contains: [C, e.inherit(e.TITLE_MODE, {
            begin: "[A-Za-z$_][0-9A-Za-z$_]*",
            className: "title.function"
          })]
        }, {
          match: /\.\.\./,
          relevance: 0
        }, P, {
          match: "\\$[A-Za-z$_][0-9A-Za-z$_]*",
          relevance: 0
        }, {
          match: [/\bconstructor(?=\s*\()/],
          className: {
            1: "title.function"
          },
          contains: [C]
        }, L, O, x, F, {
          match: /\$[(.]/
        }]
      };
    }
    function nkp(e) {
      let t = e.regex;
      let n = tkp(e);
      let r = "[A-Za-z$_][0-9A-Za-z$_]*";
      let o = ["any", "void", "number", "boolean", "string", "object", "never", "symbol", "bigint", "unknown"];
      let s = {
        begin: [/namespace/, /\s+/, e.IDENT_RE],
        beginScope: {
          1: "keyword",
          3: "title.class"
        }
      };
      let i = {
        beginKeywords: "interface",
        end: /\{/,
        excludeEnd: true,
        keywords: {
          keyword: "interface extends",
          built_in: o
        },
        contains: [n.exports.CLASS_REFERENCE]
      };
      let a = {
        className: "meta",
        relevance: 10,
        begin: /^\s*['"]use strict['"]/
      };
      let l = ["type", "interface", "public", "private", "protected", "implements", "declare", "abstract", "readonly", "enum", "override", "satisfies"];
      let c = {
        $pattern: "[A-Za-z$_][0-9A-Za-z$_]*",
        keyword: $Ra.concat(l),
        literal: HRa,
        built_in: VRa.concat(o),
        "variable.language": GRa
      };
      let u = {
        className: "meta",
        begin: "@[A-Za-z$_][0-9A-Za-z$_]*"
      };
      let d = (h, g, y) => {
        let _ = h.contains.findIndex(b => b.label === g);
        if (_ === -1) {
          throw Error("can not find mode to replace");
        }
        h.contains.splice(_, 1, y);
      };
      Object.assign(n.keywords, c);
      n.exports.PARAMS_CONTAINS.push(u);
      let p = n.contains.find(h => h.scope === "attr");
      let m = Object.assign({}, p, {
        match: t.concat("[A-Za-z$_][0-9A-Za-z$_]*", t.lookahead(/\s*\?:/))
      });
      n.exports.PARAMS_CONTAINS.push([n.exports.CLASS_REFERENCE, p, m]);
      n.contains = n.contains.concat([u, s, i, m]);
      d(n, "shebang", e.SHEBANG());
      d(n, "use_strict", a);
      let f = n.contains.find(h => h.label === "func.def");
      f.relevance = 0;
      Object.assign(n, {
        name: "TypeScript",
        aliases: ["ts", "tsx", "mts", "cts"]
      });
      return n;
    }
    zRa.exports = nkp;
  });
  var JRa = __commonJS((IQy, YRa) => {
    function rkp(e) {
      return {
        name: "Vala",
        keywords: {
          keyword: "char uchar unichar int uint long ulong short ushort int8 int16 int32 int64 uint8 uint16 uint32 uint64 float double bool struct enum string void weak unowned owned async signal static abstract interface override virtual delegate if while do for foreach else switch case break default return try catch public private protected internal using new this get set const stdout stdin stderr var",
          built_in: "DBus GLib CCode Gee Object Gtk Posix",
          literal: "false true null"
        },
        contains: [{
          className: "class",
          beginKeywords: "class interface namespace",
          end: /\{/,
          excludeEnd: true,
          illegal: "[^,:\\n\\s\\.]",
          contains: [e.UNDERSCORE_TITLE_MODE]
        }, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, {
          className: "string",
          begin: '"""',
          end: '"""',
          relevance: 5
        }, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, e.C_NUMBER_MODE, {
          className: "meta",
          begin: "^#",
          end: "$"
        }]
      };
    }
    YRa.exports = rkp;
  });
  var QRa = __commonJS((PQy, XRa) => {
    function okp(e) {
      let t = e.regex;
      let n = {
        className: "string",
        begin: /"(""|[^/n])"C\b/
      };
      let r = {
        className: "string",
        begin: /"/,
        end: /"/,
        illegal: /\n/,
        contains: [{
          begin: /""/
        }]
      };
      let o = /\d{1,2}\/\d{1,2}\/\d{4}/;
      let s = /\d{4}-\d{1,2}-\d{1,2}/;
      let i = /(\d|1[012])(:\d+){0,2} *(AM|PM)/;
      let a = /\d{1,2}(:\d{1,2}){1,2}/;
      let l = {
        className: "literal",
        variants: [{
          begin: t.concat(/# */, t.either(s, o), / *#/)
        }, {
          begin: t.concat(/# */, a, / *#/)
        }, {
          begin: t.concat(/# */, i, / *#/)
        }, {
          begin: t.concat(/# */, t.either(s, o), / +/, t.either(i, a), / *#/)
        }]
      };
      let c = {
        className: "number",
        relevance: 0,
        variants: [{
          begin: /\b\d[\d_]*((\.[\d_]+(E[+-]?[\d_]+)?)|(E[+-]?[\d_]+))[RFD@!#]?/
        }, {
          begin: /\b\d[\d_]*((U?[SIL])|[%&])?/
        }, {
          begin: /&H[\dA-F_]+((U?[SIL])|[%&])?/
        }, {
          begin: /&O[0-7_]+((U?[SIL])|[%&])?/
        }, {
          begin: /&B[01_]+((U?[SIL])|[%&])?/
        }]
      };
      let u = {
        className: "label",
        begin: /^\w+:/
      };
      let d = e.COMMENT(/'''/, /$/, {
        contains: [{
          className: "doctag",
          begin: /<\/?/,
          end: />/
        }]
      });
      let p = e.COMMENT(null, /$/, {
        variants: [{
          begin: /'/
        }, {
          begin: /([\t ]|^)REM(?=\s)/
        }]
      });