  var jSa = __commonJS((FYy, HSa) => {
    function swp(e) {
      let t = e.regex;
      let n = e.COMMENT("//", "$", {
        contains: [{
          begin: /\\\n/
        }]
      });
      let r = "decltype\\(auto\\)";
      let o = "[a-zA-Z_]\\w*::";
      let s = "<[^<>]+>";
      let i = "(decltype\\(auto\\)|" + t.optional("[a-zA-Z_]\\w*::") + "[a-zA-Z_]\\w*" + t.optional("<[^<>]+>") + ")";
      let a = {
        className: "type",
        variants: [{
          begin: "\\b[a-z\\d_]*_t\\b"
        }, {
          match: /\batomic_[a-z]{3,6}\b/
        }]
      };
      let l = "\\\\(x[0-9A-Fa-f]{2}|u[0-9A-Fa-f]{4,8}|[0-7]{3}|\\S)";
      let c = {
        className: "string",
        variants: [{
          begin: '(u8?|U|L)?"',
          end: '"',
          illegal: "\\n",
          contains: [e.BACKSLASH_ESCAPE]
        }, {
          begin: "(u8?|U|L)?'(\\\\(x[0-9A-Fa-f]{2}|u[0-9A-Fa-f]{4,8}|[0-7]{3}|\\S)|.)",
          end: "'",
          illegal: "."
        }, e.END_SAME_AS_BEGIN({
          begin: /(?:u8?|U|L)?R"([^()\\ ]{0,16})\(/,
          end: /\)([^()\\ ]{0,16})"/
        })]
      };
      let u = {
        className: "number",
        variants: [{
          match: /\b(0b[01']+)/
        }, {
          match: /(-?)\b([\d']+(\.[\d']*)?|\.[\d']+)((ll|LL|l|L)(u|U)?|(u|U)(ll|LL|l|L)?|f|F|b|B)/
        }, {
          match: /(-?)\b(0[xX][a-fA-F0-9]+(?:'[a-fA-F0-9]+)*(?:\.[a-fA-F0-9]*(?:'[a-fA-F0-9]*)*)?(?:[pP][-+]?[0-9]+)?(l|L)?(u|U)?)/
        }, {
          match: /(-?)\b\d+(?:'\d+)*(?:\.\d*(?:'\d*)*)?(?:[eE][-+]?\d+)?/
        }],
        relevance: 0
      };
      let d = {
        className: "meta",
        begin: /#\s*[a-z]+\b/,
        end: /$/,
        keywords: {
          keyword: "if else elif endif define undef warning error line pragma _Pragma ifdef ifndef elifdef elifndef include"
        },
        contains: [{
          begin: /\\\n/,
          relevance: 0
        }, e.inherit(c, {
          className: "string"
        }), {
          className: "string",
          begin: /<.*?>/
        }, n, e.C_BLOCK_COMMENT_MODE]
      };
      let p = {
        className: "title",
        begin: t.optional("[a-zA-Z_]\\w*::") + e.IDENT_RE,
        relevance: 0
      };
      let m = t.optional("[a-zA-Z_]\\w*::") + e.IDENT_RE + "\\s*\\(";
      let g = {
        keyword: ["asm", "auto", "break", "case", "continue", "default", "do", "else", "enum", "extern", "for", "fortran", "goto", "if", "inline", "register", "restrict", "return", "sizeof", "typeof", "typeof_unqual", "struct", "switch", "typedef", "union", "volatile", "while", "_Alignas", "_Alignof", "_Atomic", "_Generic", "_Noreturn", "_Static_assert", "_Thread_local", "alignas", "alignof", "noreturn", "static_assert", "thread_local", "_Pragma"],
        type: ["float", "double", "signed", "unsigned", "int", "short", "long", "char", "void", "_Bool", "_BitInt", "_Complex", "_Imaginary", "_Decimal32", "_Decimal64", "_Decimal96", "_Decimal128", "_Decimal64x", "_Decimal128x", "_Float16", "_Float32", "_Float64", "_Float128", "_Float32x", "_Float64x", "_Float128x", "const", "static", "constexpr", "complex", "bool", "imaginary"],
        literal: "true false NULL",
        built_in: "std string wstring cin cout cerr clog stdin stdout stderr stringstream istringstream ostringstream auto_ptr deque list queue stack vector map set pair bitset multiset multimap unordered_set unordered_map unordered_multiset unordered_multimap priority_queue make_pair array shared_ptr abort terminate abs acos asin atan2 atan calloc ceil cosh cos exit exp fabs floor fmod fprintf fputs free frexp fscanf future isalnum isalpha iscntrl isdigit isgraph islower isprint ispunct isspace isupper isxdigit tolower toupper labs ldexp log10 log malloc realloc memchr memcmp memcpy memset modf pow printf putchar puts scanf sinh sin snprintf sprintf sqrt sscanf strcat strchr strcmp strcpy strcspn strlen strncat strncmp strncpy strpbrk strrchr strspn strstr tanh tan vfprintf vprintf vsprintf endl initializer_list unique_ptr"
      };
      let y = [d, a, n, e.C_BLOCK_COMMENT_MODE, u, c];
      let _ = {
        variants: [{
          begin: /=/,
          end: /;/
        }, {
          begin: /\(/,
          end: /\)/
        }, {
          beginKeywords: "new throw return else",
          end: /;/
        }],
        keywords: g,
        contains: y.concat([{
          begin: /\(/,
          end: /\)/,
          keywords: g,
          contains: y.concat(["self"]),
          relevance: 0
        }]),
        relevance: 0
      };
      let b = {
        begin: "(" + i + "[\\*&\\s]+)+" + m,
        returnBegin: true,
        end: /[{;=]/,
        excludeEnd: true,
        keywords: g,
        illegal: /[^\w\s\*&:<>.]/,
        contains: [{
          begin: "decltype\\(auto\\)",
          keywords: g,
          relevance: 0
        }, {
          begin: m,
          returnBegin: true,
          contains: [e.inherit(p, {
            className: "title.function"
          })],
          relevance: 0
        }, {
          relevance: 0,
          match: /,/
        }, {
          className: "params",
          begin: /\(/,
          end: /\)/,
          keywords: g,
          relevance: 0,
          contains: [n, e.C_BLOCK_COMMENT_MODE, c, u, a, {
            begin: /\(/,
            end: /\)/,
            keywords: g,
            relevance: 0,
            contains: ["self", n, e.C_BLOCK_COMMENT_MODE, c, u, a]
          }]
        }, a, n, e.C_BLOCK_COMMENT_MODE, d]
      };
      return {
        name: "C",
        aliases: ["h"],
        keywords: g,
        disableAutodetect: true,
        illegal: "</",
        contains: [].concat(_, b, y, [d, {
          begin: e.IDENT_RE + "::",
          keywords: g
        }, {
          className: "class",
          beginKeywords: "enum class struct union",
          end: /[{;:<>=]/,
          contains: [{
            beginKeywords: "final class struct"
          }, e.TITLE_MODE]
        }]),
        exports: {
          preprocessor: d,
          strings: c,
          keywords: g
        }
      };
    }
    HSa.exports = swp;
  });
  var WSa = __commonJS((UYy, qSa) => {
    function iwp(e) {
      let t = e.regex;
      let n = ["div", "mod", "in", "and", "or", "not", "xor", "asserterror", "begin", "case", "do", "downto", "else", "end", "exit", "for", "local", "if", "of", "repeat", "then", "to", "until", "while", "with", "var"];
      let r = "false true";
      let o = [e.C_LINE_COMMENT_MODE, e.COMMENT(/\{/, /\}/, {
        relevance: 0
      }), e.COMMENT(/\(\*/, /\*\)/, {
        relevance: 10
      })];
      let s = {
        className: "string",
        begin: /'/,
        end: /'/,
        contains: [{
          begin: /''/
        }]
      };
      let i = {
        className: "string",
        begin: /(#\d+)+/
      };
      let a = {
        className: "number",
        begin: "\\b\\d+(\\.\\d+)?(DT|D|T)",
        relevance: 0
      };
      let l = {
        className: "string",
        begin: '"',
        end: '"'
      };
      let c = {
        match: [/procedure/, /\s+/, /[a-zA-Z_][\w@]*/, /\s*/],
        scope: {
          1: "keyword",
          3: "title.function"
        },
        contains: [{
          className: "params",
          begin: /\(/,
          end: /\)/,
          keywords: n,
          contains: [s, i, e.NUMBER_MODE]
        }, ...o]
      };
      let u = ["Table", "Form", "Report", "Dataport", "Codeunit", "XMLport", "MenuSuite", "Page", "Query"];
      let d = {
        match: [/OBJECT/, /\s+/, t.either(...u), /\s+/, /\d+/, /\s+(?=[^\s])/, /.*/, /$/],
        relevance: 3,
        scope: {
          1: "keyword",
          3: "type",
          5: "number",
          7: "title"
        }
      };
      return {
        name: "C/AL",
        case_insensitive: true,
        keywords: {
          keyword: n,
          literal: "false true"
        },
        illegal: /\/\*/,
        contains: [{
          match: /[\w]+(?=\=)/,
          scope: "attribute",
          relevance: 0
        }, s, i, a, l, e.NUMBER_MODE, d, c]
      };
    }
    qSa.exports = iwp;
  });
  var VSa = __commonJS((BYy, GSa) => {
    function awp(e) {
      let t = ["struct", "enum", "interface", "union", "group", "import", "using", "const", "annotation", "extends", "in", "of", "on", "as", "with", "from", "fixed"];
      let n = ["Void", "Bool", "Int8", "Int16", "Int32", "Int64", "UInt8", "UInt16", "UInt32", "UInt64", "Float32", "Float64", "Text", "Data", "AnyPointer", "AnyStruct", "Capability", "List"];
      let r = ["true", "false"];
      let o = {
        variants: [{
          match: [/(struct|enum|interface)/, /\s+/, e.IDENT_RE]
        }, {
          match: [/extends/, /\s*\(/, e.IDENT_RE, /\s*\)/]
        }],
        scope: {
          1: "keyword",
          3: "title.class"
        }
      };
      return {
        name: "Cap\u2019n Proto",
        aliases: ["capnp"],
        keywords: {
          keyword: t,
          type: n,
          literal: r
        },
        contains: [e.QUOTE_STRING_MODE, e.NUMBER_MODE, e.HASH_COMMENT_MODE, {
          className: "meta",
          begin: /@0x[\w\d]{16};/,
          illegal: /\n/
        }, {
          className: "symbol",
          begin: /@\d+\b/
        }, o]
      };
    }
    GSa.exports = awp;
  });
  var KSa = __commonJS(($Yy, zSa) => {
    function lwp(e) {
      let t = ["assembly", "module", "package", "import", "alias", "class", "interface", "object", "given", "value", "assign", "void", "function", "new", "of", "extends", "satisfies", "abstracts", "in", "out", "return", "break", "continue", "throw", "assert", "dynamic", "if", "else", "switch", "case", "for", "while", "try", "catch", "finally", "then", "let", "this", "outer", "super", "is", "exists", "nonempty"];
      let n = ["shared", "abstract", "formal", "default", "actual", "variable", "late", "native", "deprecated", "final", "sealed", "annotation", "suppressWarnings", "small"];
      let r = ["doc", "by", "license", "see", "throws", "tagged"];
      let o = {
        className: "subst",
        excludeBegin: true,
        excludeEnd: true,
        begin: /``/,
        end: /``/,
        keywords: t,
        relevance: 10
      };
      let s = [{
        className: "string",
        begin: '"""',
        end: '"""',
        relevance: 10
      }, {
        className: "string",
        begin: '"',
        end: '"',
        contains: [o]
      }, {
        className: "string",
        begin: "'",
        end: "'"
      }, {
        className: "number",
        begin: "#[0-9a-fA-F_]+|\\$[01_]+|[0-9_]+(?:\\.[0-9_](?:[eE][+-]?\\d+)?)?[kMGTPmunpf]?",
        relevance: 0
      }];
      o.contains = s;
      return {
        name: "Ceylon",
        keywords: {
          keyword: t.concat(n),
          meta: r
        },
        illegal: "\\$[^01]|#[^0-9a-fA-F]",
        contains: [e.C_LINE_COMMENT_MODE, e.COMMENT("/\\*", "\\*/", {
          contains: ["self"]
        }), {
          className: "meta",
          begin: '@[a-z]\\w*(?::"[^"]*")?'
        }].concat(s)
      };
    }
    zSa.exports = lwp;
  });
  var JSa = __commonJS((HYy, YSa) => {
    function cwp(e) {
      return {
        name: "Clean",
        aliases: ["icl", "dcl"],
        keywords: {
          keyword: ["if", "let", "in", "with", "where", "case", "of", "class", "instance", "otherwise", "implementation", "definition", "system", "module", "from", "import", "qualified", "as", "special", "code", "inline", "foreign", "export", "ccall", "stdcall", "generic", "derive", "infix", "infixl", "infixr"],
          built_in: "Int Real Char Bool",
          literal: "True False"
        },
        contains: [e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, e.C_NUMBER_MODE, {
          begin: "->|<-[|:]?|#!?|>>=|\\{\\||\\|\\}|:==|=:|<>"
        }]
      };
    }
    YSa.exports = cwp;
  });
  var QSa = __commonJS((jYy, XSa) => {
    function uwp(e) {
      let n = "[#]?[a-zA-Z_\\-!.?+*=<>&'][a-zA-Z_\\-!.?+*=<>&'0-9/;:$#]*";
      let r = "def defonce defprotocol defstruct defmulti defmethod defn- defn defmacro deftype defrecord";
      let o = {
        $pattern: n,
        built_in: "def defonce defprotocol defstruct defmulti defmethod defn- defn defmacro deftype defrecord cond apply if-not if-let if not not= =|0 <|0 >|0 <=|0 >=|0 ==|0 +|0 /|0 *|0 -|0 rem quot neg? pos? delay? symbol? keyword? true? false? integer? empty? coll? list? set? ifn? fn? associative? sequential? sorted? counted? reversible? number? decimal? class? distinct? isa? float? rational? reduced? ratio? odd? even? char? seq? vector? string? map? nil? contains? zero? instance? not-every? not-any? libspec? -> ->> .. . inc compare do dotimes mapcat take remove take-while drop letfn drop-last take-last drop-while while intern condp case reduced cycle split-at split-with repeat replicate iterate range merge zipmap declare line-seq sort comparator sort-by dorun doall nthnext nthrest partition eval doseq await await-for let agent atom send send-off release-pending-sends add-watch mapv filterv remove-watch agent-error restart-agent set-error-handler error-handler set-error-mode! error-mode shutdown-agents quote var fn loop recur throw try monitor-enter monitor-exit macroexpand macroexpand-1 for dosync and or when when-not when-let comp juxt partial sequence memoize constantly complement identity assert peek pop doto proxy first rest cons cast coll last butlast sigs reify second ffirst fnext nfirst nnext meta with-meta ns in-ns create-ns import refer keys select-keys vals key val rseq name namespace promise into transient persistent! conj! assoc! dissoc! pop! disj! use class type num float double short byte boolean bigint biginteger bigdec print-method print-dup throw-if printf format load compile get-in update-in pr pr-on newline flush read slurp read-line subvec with-open memfn time re-find re-groups rand-int rand mod locking assert-valid-fdecl alias resolve ref deref refset swap! reset! set-validator! compare-and-set! alter-meta! reset-meta! commute get-validator alter ref-set ref-history-count ref-min-history ref-max-history ensure sync io! new next conj set! to-array future future-call into-array aset gen-class reduce map filter find empty hash-map hash-set sorted-map sorted-map-by sorted-set sorted-set-by vec vector seq flatten reverse assoc dissoc list disj get union difference intersection extend extend-type extend-protocol int nth delay count concat chunk chunk-buffer chunk-append chunk-first chunk-rest max min dec unchecked-inc-int unchecked-inc unchecked-dec-inc unchecked-dec unchecked-negate unchecked-add-int unchecked-add unchecked-subtract-int unchecked-subtract chunk-next chunk-cons chunked-seq? prn vary-meta lazy-seq spread list* str find-keyword keyword symbol gensym force rationalize"
      };
      let s = {
        begin: n,
        relevance: 0
      };
      let i = {
        scope: "number",
        relevance: 0,
        variants: [{
          match: /[-+]?0[xX][0-9a-fA-F]+N?/
        }, {
          match: /[-+]?0[0-7]+N?/
        }, {
          match: /[-+]?[1-9][0-9]?[rR][0-9a-zA-Z]+N?/
        }, {
          match: /[-+]?[0-9]+\/[0-9]+N?/
        }, {
          match: /[-+]?[0-9]+((\.[0-9]*([eE][+-]?[0-9]+)?M?)|([eE][+-]?[0-9]+M?|M))/
        }, {
          match: /[-+]?([1-9][0-9]*|0)N?/
        }]
      };
      let a = {
        scope: "character",
        variants: [{
          match: /\\o[0-3]?[0-7]{1,2}/
        }, {
          match: /\\u[0-9a-fA-F]{4}/
        }, {
          match: /\\(newline|space|tab|formfeed|backspace|return)/
        }, {
          match: /\\\S/,
          relevance: 0
        }]
      };
      let l = {
        scope: "regex",
        begin: /#"/,
        end: /"/,
        contains: [e.BACKSLASH_ESCAPE]
      };
      let c = e.inherit(e.QUOTE_STRING_MODE, {
        illegal: null
      });
      let u = {
        scope: "punctuation",
        match: /,/,
        relevance: 0
      };
      let d = e.COMMENT(";", "$", {
        relevance: 0
      });
      let p = {
        className: "literal",
        begin: /\b(true|false|nil)\b/
      };
      let m = {
        begin: "\\[|(#::?" + n + ")?\\{",
        end: "[\\]\\}]",
        relevance: 0
      };
      let f = {
        className: "symbol",
        begin: "[:]{1,2}" + n
      };
      let h = {
        begin: "\\(",
        end: "\\)"
      };
      let g = {
        endsWithParent: true,
        relevance: 0
      };
      let y = {
        keywords: o,
        className: "name",
        begin: n,
        relevance: 0,
        starts: g
      };
      let _ = [u, h, a, l, c, d, f, m, i, p, s];
      let b = {
        beginKeywords: "def defonce defprotocol defstruct defmulti defmethod defn- defn defmacro deftype defrecord",
        keywords: {
          $pattern: n,
          keyword: "def defonce defprotocol defstruct defmulti defmethod defn- defn defmacro deftype defrecord"
        },
        end: '(\\[|#|\\d|"|:|\\{|\\)|\\(|$)',
        contains: [{
          className: "title",
          begin: n,
          relevance: 0,
          excludeEnd: true,
          endsParent: true
        }].concat(_)
      };
      h.contains = [b, y, g];
      g.contains = _;
      m.contains = _;
      return {
        name: "Clojure",
        aliases: ["clj", "edn"],
        illegal: /\S/,
        contains: [u, h, a, l, c, d, f, m, i, p]
      };
    }
    XSa.exports = uwp;
  });
  var eTa = __commonJS((qYy, ZSa) => {
    function dwp(e) {
      return {
        name: "Clojure REPL",
        contains: [{
          className: "meta.prompt",
          begin: /^([\w.-]+|\s*#_)?=>/,
          starts: {
            end: /$/,
            subLanguage: "clojure"
          }
        }]
      };
    }
    ZSa.exports = dwp;
  });
  var nTa = __commonJS((WYy, tTa) => {
    function pwp(e) {
      return {
        name: "CMake",
        aliases: ["cmake.in"],
        case_insensitive: true,
        keywords: {
          keyword: "break cmake_host_system_information cmake_minimum_required cmake_parse_arguments cmake_policy configure_file continue elseif else endforeach endfunction endif endmacro endwhile execute_process file find_file find_library find_package find_path find_program foreach function get_cmake_property get_directory_property get_filename_component get_property if include include_guard list macro mark_as_advanced math message option return separate_arguments set_directory_properties set_property set site_name string unset variable_watch while add_compile_definitions add_compile_options add_custom_command add_custom_target add_definitions add_dependencies add_executable add_library add_link_options add_subdirectory add_test aux_source_directory build_command create_test_sourcelist define_property enable_language enable_testing export fltk_wrap_ui get_source_file_property get_target_property get_test_property include_directories include_external_msproject include_regular_expression install link_directories link_libraries load_cache project qt_wrap_cpp qt_wrap_ui remove_definitions set_source_files_properties set_target_properties set_tests_properties source_group target_compile_definitions target_compile_features target_compile_options target_include_directories target_link_directories target_link_libraries target_link_options target_sources try_compile try_run ctest_build ctest_configure ctest_coverage ctest_empty_binary_directory ctest_memcheck ctest_read_custom_files ctest_run_script ctest_sleep ctest_start ctest_submit ctest_test ctest_update ctest_upload build_name exec_program export_library_dependencies install_files install_programs install_targets load_command make_directory output_required_files remove subdir_depends subdirs use_mangled_mesa utility_source variable_requires write_file qt5_use_modules qt5_use_package qt5_wrap_cpp on off true false and or not command policy target test exists is_newer_than is_directory is_symlink is_absolute matches less greater equal less_equal greater_equal strless strgreater strequal strless_equal strgreater_equal version_less version_greater version_equal version_less_equal version_greater_equal in_list defined"
        },
        contains: [{
          className: "variable",
          begin: /\$\{/,
          end: /\}/
        }, e.COMMENT(/#\[\[/, /]]/), e.HASH_COMMENT_MODE, e.QUOTE_STRING_MODE, e.NUMBER_MODE]
      };
    }
    tTa.exports = pwp;
  });
  var oTa = __commonJS((GYy, rTa) => {
    var mwp = ["as", "in", "of", "if", "for", "while", "finally", "var", "new", "function", "do", "return", "void", "else", "break", "catch", "instanceof", "with", "throw", "case", "default", "try", "switch", "continue", "typeof", "delete", "let", "yield", "const", "class", "debugger", "async", "await", "static", "import", "from", "export", "extends", "using"];
    var fwp = ["true", "false", "null", "undefined", "NaN", "Infinity"];
    var hwp = ["Object", "Function", "Boolean", "Symbol", "Math", "Date", "Number", "BigInt", "String", "RegExp", "Array", "Float32Array", "Float64Array", "Int8Array", "Uint8Array", "Uint8ClampedArray", "Int16Array", "Int32Array", "Uint16Array", "Uint32Array", "BigInt64Array", "BigUint64Array", "Set", "Map", "WeakSet", "WeakMap", "ArrayBuffer", "SharedArrayBuffer", "Atomics", "DataView", "JSON", "Promise", "Generator", "GeneratorFunction", "AsyncFunction", "Reflect", "Proxy", "Intl", "WebAssembly"];
    var gwp = ["Error", "EvalError", "InternalError", "RangeError", "ReferenceError", "SyntaxError", "TypeError", "URIError"];
    var ywp = ["setInterval", "setTimeout", "clearInterval", "clearTimeout", "require", "exports", "eval", "isFinite", "isNaN", "parseFloat", "parseInt", "decodeURI", "decodeURIComponent", "encodeURI", "encodeURIComponent", "escape", "unescape"];
    var _wp = [].concat(ywp, hwp, gwp);
    function bwp(e) {
      let t = ["npm", "print"];
      let n = ["yes", "no", "on", "off"];
      let r = ["then", "unless", "until", "loop", "by", "when", "and", "or", "is", "isnt", "not"];
      let o = ["var", "const", "let", "function", "static"];
      let s = f => h => !f.includes(h);
      let i = {
        keyword: mwp.concat(r).filter(s(o)),
        literal: fwp.concat(n),
        built_in: _wp.concat(t)
      };
      let a = "[A-Za-z$_][0-9A-Za-z$_]*";
      let l = {
        className: "subst",
        begin: /#\{/,
        end: /\}/,
        keywords: i
      };
      let c = [e.BINARY_NUMBER_MODE, e.inherit(e.C_NUMBER_MODE, {
        starts: {
          end: "(\\s*/)?",
          relevance: 0
        }
      }), {
        className: "string",
        variants: [{
          begin: /'''/,
          end: /'''/,
          contains: [e.BACKSLASH_ESCAPE]
        }, {
          begin: /'/,
          end: /'/,
          contains: [e.BACKSLASH_ESCAPE]
        }, {
          begin: /"""/,
          end: /"""/,
          contains: [e.BACKSLASH_ESCAPE, l]
        }, {
          begin: /"/,
          end: /"/,
          contains: [e.BACKSLASH_ESCAPE, l]
        }]
      }, {
        className: "regexp",
        variants: [{
          begin: "///",
          end: "///",
          contains: [l, e.HASH_COMMENT_MODE]
        }, {
          begin: "//[gim]{0,3}(?=\\W)",
          relevance: 0
        }, {
          begin: /\/(?![ *]).*?(?![\\]).\/[gim]{0,3}(?=\W)/
        }]
      }, {
        begin: "@[A-Za-z$_][0-9A-Za-z$_]*"
      }, {
        subLanguage: "javascript",
        excludeBegin: true,
        excludeEnd: true,
        variants: [{
          begin: "```",
          end: "```"
        }, {
          begin: "`",
          end: "`"
        }]
      }];
      l.contains = c;
      let u = e.inherit(e.TITLE_MODE, {
        begin: "[A-Za-z$_][0-9A-Za-z$_]*"
      });
      let d = "(\\(.*\\)\\s*)?\\B[-=]>";
      let p = {
        className: "params",
        begin: "\\([^\\(]",
        returnBegin: true,
        contains: [{
          begin: /\(/,
          end: /\)/,
          keywords: i,
          contains: ["self"].concat(c)
        }]
      };
      let m = {
        variants: [{
          match: [/class\s+/, "[A-Za-z$_][0-9A-Za-z$_]*", /\s+extends\s+/, "[A-Za-z$_][0-9A-Za-z$_]*"]
        }, {
          match: [/class\s+/, "[A-Za-z$_][0-9A-Za-z$_]*"]
        }],
        scope: {
          2: "title.class",
          4: "title.class.inherited"
        },
        keywords: i
      };
      return {
        name: "CoffeeScript",
        aliases: ["coffee", "cson", "iced"],
        keywords: i,
        illegal: /\/\*/,
        contains: [...c, e.COMMENT("###", "###"), e.HASH_COMMENT_MODE, {
          className: "function",
          begin: "^\\s*[A-Za-z$_][0-9A-Za-z$_]*\\s*=\\s*" + d,
          end: "[-=]>",
          returnBegin: true,
          contains: [u, p]
        }, {
          begin: /[:\(,=]\s*/,
          relevance: 0,
          contains: [{
            className: "function",
            begin: d,
            end: "[-=]>",
            returnBegin: true,
            contains: [p]
          }]
        }, m, {
          begin: "[A-Za-z$_][0-9A-Za-z$_]*:",
          end: ":",
          returnBegin: true,
          returnEnd: true,
          relevance: 0
        }]
      };
    }
    rTa.exports = bwp;
  });
  var iTa = __commonJS((VYy, sTa) => {
    function Swp(e) {
      return {
        name: "Coq",
        keywords: {
          keyword: ["_|0", "as", "at", "cofix", "else", "end", "exists", "exists2", "fix", "for", "forall", "fun", "if", "IF", "in", "let", "match", "mod", "Prop", "return", "Set", "then", "Type", "using", "where", "with", "Abort", "About", "Add", "Admit", "Admitted", "All", "Arguments", "Assumptions", "Axiom", "Back", "BackTo", "Backtrack", "Bind", "Blacklist", "Canonical", "Cd", "Check", "Class", "Classes", "Close", "Coercion", "Coercions", "CoFixpoint", "CoInductive", "Collection", "Combined", "Compute", "Conjecture", "Conjectures", "Constant", "constr", "Constraint", "Constructors", "Context", "Corollary", "CreateHintDb", "Cut", "Declare", "Defined", "Definition", "Delimit", "Dependencies", "Dependent", "Derive", "Drop", "eauto", "End", "Equality", "Eval", "Example", "Existential", "Existentials", "Existing", "Export", "exporting", "Extern", "Extract", "Extraction", "Fact", "Field", "Fields", "File", "Fixpoint", "Focus", "for", "From", "Function", "Functional", "Generalizable", "Global", "Goal", "Grab", "Grammar", "Graph", "Guarded", "Heap", "Hint", "HintDb", "Hints", "Hypotheses", "Hypothesis", "ident", "Identity", "If", "Immediate", "Implicit", "Import", "Include", "Inductive", "Infix", "Info", "Initial", "Inline", "Inspect", "Instance", "Instances", "Intro", "Intros", "Inversion", "Inversion_clear", "Language", "Left", "Lemma", "Let", "Libraries", "Library", "Load", "LoadPath", "Local", "Locate", "Ltac", "ML", "Mode", "Module", "Modules", "Monomorphic", "Morphism", "Next", "NoInline", "Notation", "Obligation", "Obligations", "Opaque", "Open", "Optimize", "Options", "Parameter", "Parameters", "Parametric", "Path", "Paths", "pattern", "Polymorphic", "Preterm", "Print", "Printing", "Program", "Projections", "Proof", "Proposition", "Pwd", "Qed", "Quit", "Rec", "Record", "Recursive", "Redirect", "Relation", "Remark", "Remove", "Require", "Reserved", "Reset", "Resolve", "Restart", "Rewrite", "Right", "Ring", "Rings", "Save", "Scheme", "Scope", "Scopes", "Script", "Search", "SearchAbout", "SearchHead", "SearchPattern", "SearchRewrite", "Section", "Separate", "Set", "Setoid", "Show", "Solve", "Sorted", "Step", "Strategies", "Strategy", "Structure", "SubClass", "Table", "Tables", "Tactic", "Term", "Test", "Theorem", "Time", "Timeout", "Transparent", "Type", "Typeclasses", "Types", "Undelimit", "Undo", "Unfocus", "Unfocused", "Unfold", "Universe", "Universes", "Unset", "Unshelve", "using", "Variable", "Variables", "Variant", "Verbose", "Visibility", "where", "with"],
          built_in: ["abstract", "absurd", "admit", "after", "apply", "as", "assert", "assumption", "at", "auto", "autorewrite", "autounfold", "before", "bottom", "btauto", "by", "case", "case_eq", "cbn", "cbv", "change", "classical_left", "classical_right", "clear", "clearbody", "cofix", "compare", "compute", "congruence", "constr_eq", "constructor", "contradict", "contradiction", "cut", "cutrewrite", "cycle", "decide", "decompose", "dependent", "destruct", "destruction", "dintuition", "discriminate", "discrR", "do", "double", "dtauto", "eapply", "eassumption", "eauto", "ecase", "econstructor", "edestruct", "ediscriminate", "eelim", "eexact", "eexists", "einduction", "einjection", "eleft", "elim", "elimtype", "enough", "equality", "erewrite", "eright", "esimplify_eq", "esplit", "evar", "exact", "exactly_once", "exfalso", "exists", "f_equal", "fail", "field", "field_simplify", "field_simplify_eq", "first", "firstorder", "fix", "fold", "fourier", "functional", "generalize", "generalizing", "gfail", "give_up", "has_evar", "hnf", "idtac", "in", "induction", "injection", "instantiate", "intro", "intro_pattern", "intros", "intuition", "inversion", "inversion_clear", "is_evar", "is_var", "lapply", "lazy", "left", "lia", "lra", "move", "native_compute", "nia", "nsatz", "omega", "once", "pattern", "pose", "progress", "proof", "psatz", "quote", "record", "red", "refine", "reflexivity", "remember", "rename", "repeat", "replace", "revert", "revgoals", "rewrite", "rewrite_strat", "right", "ring", "ring_simplify", "rtauto", "set", "setoid_reflexivity", "setoid_replace", "setoid_rewrite", "setoid_symmetry", "setoid_transitivity", "shelve", "shelve_unifiable", "simpl", "simple", "simplify_eq", "solve", "specialize", "split", "split_Rabs", "split_Rmult", "stepl", "stepr", "subst", "sum", "swap", "symmetry", "tactic", "tauto", "time", "timeout", "top", "transitivity", "trivial", "try", "tryif", "unfold", "unify", "until", "using", "vm_compute", "with"]
        },
        contains: [e.QUOTE_STRING_MODE, e.COMMENT("\\(\\*", "\\*\\)"), e.C_NUMBER_MODE, {
          className: "type",
          excludeBegin: true,
          begin: "\\|\\s*",
          end: "\\w+"
        }, {
          begin: /[-=]>/
        }]
      };
    }
    sTa.exports = Swp;
  });
  var lTa = __commonJS((zYy, aTa) => {
    function Twp(e) {
      return {
        name: "Cach\xE9 Object Script",
        case_insensitive: true,
        aliases: ["cls"],
        keywords: "property parameter class classmethod clientmethod extends as break catch close continue do d|0 else elseif for goto halt hang h|0 if job j|0 kill k|0 lock l|0 merge new open quit q|0 read r|0 return set s|0 tcommit throw trollback try tstart use view while write w|0 xecute x|0 zkill znspace zn ztrap zwrite zw zzdump zzwrite print zbreak zinsert zload zprint zremove zsave zzprint mv mvcall mvcrt mvdim mvprint zquit zsync ascii",
        contains: [{
          className: "number",
          begin: "\\b(\\d+(\\.\\d*)?|\\.\\d+)",
          relevance: 0
        }, {
          className: "string",
          variants: [{
            begin: '"',
            end: '"',
            contains: [{
              begin: '""',
              relevance: 0
            }]
          }]
        }, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, {
          className: "comment",
          begin: /;/,
          end: "$",
          relevance: 0
        }, {
          className: "built_in",
          begin: /(?:\$\$?|\.\.)\^?[a-zA-Z]+/
        }, {
          className: "built_in",
          begin: /\$\$\$[a-zA-Z]+/
        }, {
          className: "built_in",
          begin: /%[a-z]+(?:\.[a-z]+)*/
        }, {
          className: "symbol",
          begin: /\^%?[a-zA-Z][\w]*/
        }, {
          className: "keyword",
          begin: /##class|##super|#define|#dim/
        }, {
          begin: /&sql\(/,
          end: /\)/,
          excludeBegin: true,
          excludeEnd: true,
          subLanguage: "sql"
        }, {
          begin: /&(js|jscript|javascript)</,
          end: />/,
          excludeBegin: true,
          excludeEnd: true,
          subLanguage: "javascript"
        }, {
          begin: /&html<\s*</,
          end: />\s*>/,
          subLanguage: "xml"
        }]
      };
    }
    aTa.exports = Twp;
  });
  var uTa = __commonJS((KYy, cTa) => {
    function Ewp(e) {
      let t = e.regex;
      let n = e.COMMENT("//", "$", {
        contains: [{
          begin: /\\\n/
        }]
      });
      let r = "decltype\\(auto\\)";
      let o = "[a-zA-Z_]\\w*::";
      let s = "<[^<>]+>";
      let i = "(?!struct)(decltype\\(auto\\)|" + t.optional("[a-zA-Z_]\\w*::") + "[a-zA-Z_]\\w*" + t.optional("<[^<>]+>") + ")";
      let a = {
        className: "type",
        begin: "\\b[a-z\\d_]*_t\\b"
      };
      let l = "\\\\(x[0-9A-Fa-f]{2}|u[0-9A-Fa-f]{4,8}|[0-7]{3}|\\S)";
      let c = {
        className: "string",
        variants: [{
          begin: '(u8?|U|L)?"',
          end: '"',
          illegal: "\\n",
          contains: [e.BACKSLASH_ESCAPE]
        }, {
          begin: "(u8?|U|L)?'(\\\\(x[0-9A-Fa-f]{2}|u[0-9A-Fa-f]{4,8}|[0-7]{3}|\\S)|.)",
          end: "'",
          illegal: "."
        }, e.END_SAME_AS_BEGIN({
          begin: /(?:u8?|U|L)?R"([^()\\ ]{0,16})\(/,
          end: /\)([^()\\ ]{0,16})"/
        })]
      };
      let u = {
        className: "number",
        variants: [{
          begin: "[+-]?(?:(?:[0-9](?:'?[0-9])*\\.(?:[0-9](?:'?[0-9])*)?|\\.[0-9](?:'?[0-9])*)(?:[Ee][+-]?[0-9](?:'?[0-9])*)?|[0-9](?:'?[0-9])*[Ee][+-]?[0-9](?:'?[0-9])*|0[Xx](?:[0-9A-Fa-f](?:'?[0-9A-Fa-f])*(?:\\.(?:[0-9A-Fa-f](?:'?[0-9A-Fa-f])*)?)?|\\.[0-9A-Fa-f](?:'?[0-9A-Fa-f])*)[Pp][+-]?[0-9](?:'?[0-9])*)(?:[Ff](?:16|32|64|128)?|(BF|bf)16|[Ll]|)"
        }, {
          begin: "[+-]?\\b(?:0[Bb][01](?:'?[01])*|0[Xx][0-9A-Fa-f](?:'?[0-9A-Fa-f])*|0(?:'?[0-7])*|[1-9](?:'?[0-9])*)(?:[Uu](?:LL?|ll?)|[Uu][Zz]?|(?:LL?|ll?)[Uu]?|[Zz][Uu]|)"
        }],
        relevance: 0
      };
      let d = {
        className: "meta",
        begin: /#\s*[a-z]+\b/,
        end: /$/,
        keywords: {
          keyword: "if else elif endif define undef warning error line pragma _Pragma ifdef ifndef include"
        },
        contains: [{
          begin: /\\\n/,
          relevance: 0
        }, e.inherit(c, {
          className: "string"
        }), {
          className: "string",
          begin: /<.*?>/
        }, n, e.C_BLOCK_COMMENT_MODE]
      };
      let p = {
        className: "title",
        begin: t.optional("[a-zA-Z_]\\w*::") + e.IDENT_RE,
        relevance: 0
      };
      let m = t.optional("[a-zA-Z_]\\w*::") + e.IDENT_RE + "\\s*\\(";
      let f = ["alignas", "alignof", "and", "and_eq", "asm", "atomic_cancel", "atomic_commit", "atomic_noexcept", "auto", "bitand", "bitor", "break", "case", "catch", "class", "co_await", "co_return", "co_yield", "compl", "concept", "const_cast|10", "consteval", "constexpr", "constinit", "continue", "decltype", "default", "delete", "do", "dynamic_cast|10", "else", "enum", "explicit", "export", "extern", "false", "final", "for", "friend", "goto", "if", "import", "inline", "module", "mutable", "namespace", "new", "noexcept", "not", "not_eq", "nullptr", "operator", "or", "or_eq", "override", "private", "protected", "public", "reflexpr", "register", "reinterpret_cast|10", "requires", "return", "sizeof", "static_assert", "static_cast|10", "struct", "switch", "synchronized", "template", "this", "thread_local", "throw", "transaction_safe", "transaction_safe_dynamic", "true", "try", "typedef", "typeid", "typename", "union", "using", "virtual", "volatile", "while", "xor", "xor_eq"];
      let h = ["bool", "char", "char16_t", "char32_t", "char8_t", "double", "float", "int", "long", "short", "void", "wchar_t", "unsigned", "signed", "const", "static"];
      let g = ["any", "auto_ptr", "barrier", "binary_semaphore", "bitset", "complex", "condition_variable", "condition_variable_any", "counting_semaphore", "deque", "false_type", "flat_map", "flat_set", "future", "imaginary", "initializer_list", "istringstream", "jthread", "latch", "lock_guard", "multimap", "multiset", "mutex", "optional", "ostringstream", "packaged_task", "pair", "promise", "priority_queue", "queue", "recursive_mutex", "recursive_timed_mutex", "scoped_lock", "set", "shared_future", "shared_lock", "shared_mutex", "shared_timed_mutex", "shared_ptr", "stack", "string_view", "stringstream", "timed_mutex", "thread", "true_type", "tuple", "unique_lock", "unique_ptr", "unordered_map", "unordered_multimap", "unordered_multiset", "unordered_set", "variant", "vector", "weak_ptr", "wstring", "wstring_view"];
      let y = ["abort", "abs", "acos", "apply", "as_const", "asin", "atan", "atan2", "calloc", "ceil", "cerr", "cin", "clog", "cos", "cosh", "cout", "declval", "endl", "exchange", "exit", "exp", "fabs", "floor", "fmod", "forward", "fprintf", "fputs", "free", "frexp", "fscanf", "future", "invoke", "isalnum", "isalpha", "iscntrl", "isdigit", "isgraph", "islower", "isprint", "ispunct", "isspace", "isupper", "isxdigit", "labs", "launder", "ldexp", "log", "log10", "make_pair", "make_shared", "make_shared_for_overwrite", "make_tuple", "make_unique", "malloc", "memchr", "memcmp", "memcpy", "memset", "modf", "move", "pow", "printf", "putchar", "puts", "realloc", "scanf", "sin", "sinh", "snprintf", "sprintf", "sqrt", "sscanf", "std", "stderr", "stdin", "stdout", "strcat", "strchr", "strcmp", "strcpy", "strcspn", "strlen", "strncat", "strncmp", "strncpy", "strpbrk", "strrchr", "strspn", "strstr", "swap", "tan", "tanh", "terminate", "to_underlying", "tolower", "toupper", "vfprintf", "visit", "vprintf", "vsprintf"];
      let S = {
        type: h,
        keyword: f,
        literal: ["NULL", "false", "nullopt", "nullptr", "true"],
        built_in: ["_Pragma"],
        _type_hints: g
      };
      let E = {
        className: "function.dispatch",
        relevance: 0,
        keywords: {
          _hint: y
        },
        begin: t.concat(/\b/, /(?!decltype)/, /(?!if)/, /(?!for)/, /(?!switch)/, /(?!while)/, e.IDENT_RE, t.lookahead(/(<[^<>]+>|)\s*\(/))
      };
      let C = [E, d, a, n, e.C_BLOCK_COMMENT_MODE, u, c];
      let x = {
        variants: [{
          begin: /=/,
          end: /;/
        }, {
          begin: /\(/,
          end: /\)/
        }, {
          beginKeywords: "new throw return else",
          end: /;/
        }],
        keywords: S,
        contains: C.concat([{
          begin: /\(/,
          end: /\)/,
          keywords: S,
          contains: C.concat(["self"]),
          relevance: 0
        }]),
        relevance: 0
      };
      let A = {
        className: "function",
        begin: "(" + i + "[\\*&\\s]+)+" + m,
        returnBegin: true,
        end: /[{;=]/,
        excludeEnd: true,
        keywords: S,
        illegal: /[^\w\s\*&:<>.]/,
        contains: [{
          begin: "decltype\\(auto\\)",
          keywords: S,
          relevance: 0
        }, {
          begin: m,
          returnBegin: true,
          contains: [p],
          relevance: 0
        }, {
          begin: /::/,
          relevance: 0
        }, {
          begin: /:/,
          endsWithParent: true,
          contains: [c, u]
        }, {
          relevance: 0,
          match: /,/
        }, {
          className: "params",
          begin: /\(/,
          end: /\)/,
          keywords: S,
          relevance: 0,
          contains: [n, e.C_BLOCK_COMMENT_MODE, c, u, a, {
            begin: /\(/,
            end: /\)/,
            keywords: S,
            relevance: 0,
            contains: ["self", n, e.C_BLOCK_COMMENT_MODE, c, u, a]
          }]
        }, a, n, e.C_BLOCK_COMMENT_MODE, d]
      };
      return {
        name: "C++",
        aliases: ["cc", "c++", "h++", "hpp", "hh", "hxx", "cxx"],
        keywords: S,
        illegal: "</",
        classNameAliases: {
          "function.dispatch": "built_in"
        },
        contains: [].concat(x, A, E, C, [d, {
          begin: "\\b(deque|list|queue|priority_queue|pair|stack|vector|map|set|bitset|multiset|multimap|unordered_map|unordered_set|unordered_multiset|unordered_multimap|array|tuple|optional|variant|function|flat_map|flat_set)\\s*<(?!<)",
          end: ">",
          keywords: S,
          contains: ["self", a]
        }, {
          begin: e.IDENT_RE + "::",
          keywords: S
        }, {
          match: [/\b(?:enum(?:\s+(?:class|struct))?|class|struct|union)/, /\s+/, /\w+/],
          className: {
            1: "keyword",
            3: "title.class"
          }
        }])
      };
    }
    cTa.exports = Ewp;
  });
  var pTa = __commonJS((YYy, dTa) => {
    function vwp(e) {
      let n = "group clone ms master location colocation order fencing_topology rsc_ticket acl_target acl_group user role tag xml";
      let r = "property rsc_defaults op_defaults";
      let o = "params meta operations op rule attributes utilization";
      let s = "read write deny defined not_defined in_range date spec in ref reference attribute type xpath version and or lt gt tag lte gte eq ne \\";
      let i = "number string";
      let a = "Master Started Slave Stopped start promote demote stop monitor true false";
      return {
        name: "crmsh",
        aliases: ["crm", "pcmk"],
        case_insensitive: true,
        keywords: {
          keyword: "params meta operations op rule attributes utilization " + s + " number string",
          literal: "Master Started Slave Stopped start promote demote stop monitor true false"
        },
        contains: [e.HASH_COMMENT_MODE, {
          beginKeywords: "node",
          starts: {
            end: "\\s*([\\w_-]+:)?",
            starts: {
              className: "title",
              end: "\\s*[\\$\\w_][\\w_-]*"
            }
          }
        }, {
          beginKeywords: "primitive rsc_template",
          starts: {
            className: "title",
            end: "\\s*[\\$\\w_][\\w_-]*",
            starts: {
              end: "\\s*@?[\\w_][\\w_\\.:-]*"
            }
          }
        }, {
          begin: "\\b(" + n.split(" ").join("|") + ")\\s+",
          keywords: n,
          starts: {
            className: "title",
            end: "[\\$\\w_][\\w_-]*"
          }
        }, {
          beginKeywords: "property rsc_defaults op_defaults",
          starts: {
            className: "title",
            end: "\\s*([\\w_-]+:)?"
          }
        }, e.QUOTE_STRING_MODE, {
          className: "meta",
          begin: "(ocf|systemd|service|lsb):[\\w_:-]+",
          relevance: 0
        }, {
          className: "number",
          begin: "\\b\\d+(\\.\\d+)?(ms|s|h|m)?",
          relevance: 0
        }, {
          className: "literal",
          begin: "[-]?(infinity|inf)",
          relevance: 0
        }, {
          className: "attr",
          begin: /([A-Za-z$_#][\w_-]+)=/,
          relevance: 0
        }, {
          className: "tag",
          begin: "</?",
          end: "/?>",
          relevance: 0
        }]
      };
    }
    dTa.exports = vwp;
  });
  var fTa = __commonJS((JYy, mTa) => {
    function wwp(e) {
      let i = {
        $pattern: "[a-zA-Z_]\\w*[!?=]?",
        keyword: "abstract alias annotation as as? asm begin break case class def do else elsif end ensure enum extend for fun if include instance_sizeof is_a? lib macro module next nil? of out pointerof private protected rescue responds_to? return require select self sizeof struct super then type typeof union uninitialized unless until verbatim when while with yield __DIR__ __END_LINE__ __FILE__ __LINE__",
        literal: "false nil true"
      };
      let a = {
        className: "subst",
        begin: /#\{/,
        end: /\}/,
        keywords: i
      };
      let l = {
        className: "variable",
        begin: "(\\$\\W)|((\\$|@@?)(\\w+))(?=[^@$?])(?![A-Za-z])(?![@$?'])"
      };
      let c = {
        className: "template-variable",
        variants: [{
          begin: "\\{\\{",
          end: "\\}\\}"
        }, {
          begin: "\\{%",
          end: "%\\}"
        }],
        keywords: i
      };
      function u(y, _) {
        let b = [{
          begin: y,
          end: _
        }];
        b[0].contains = b;
        return b;
      }
      let d = {
        className: "string",
        contains: [e.BACKSLASH_ESCAPE, a],
        variants: [{
          begin: /'/,
          end: /'/
        }, {
          begin: /"/,
          end: /"/
        }, {
          begin: /`/,
          end: /`/
        }, {
          begin: "%[Qwi]?\\(",
          end: "\\)",
          contains: u("\\(", "\\)")
        }, {
          begin: "%[Qwi]?\\[",
          end: "\\]",
          contains: u("\\[", "\\]")
        }, {
          begin: "%[Qwi]?\\{",
          end: /\}/,
          contains: u(/\{/, /\}/)
        }, {
          begin: "%[Qwi]?<",
          end: ">",
          contains: u("<", ">")
        }, {
          begin: "%[Qwi]?\\|",
          end: "\\|"
        }, {
          begin: /<<-\w+$/,
          end: /^\s*\w+$/
        }],
        relevance: 0
      };
      let p = {
        className: "string",
        variants: [{
          begin: "%q\\(",
          end: "\\)",
          contains: u("\\(", "\\)")
        }, {
          begin: "%q\\[",
          end: "\\]",
          contains: u("\\[", "\\]")
        }, {
          begin: "%q\\{",
          end: /\}/,
          contains: u(/\{/, /\}/)
        }, {
          begin: "%q<",
          end: ">",
          contains: u("<", ">")
        }, {
          begin: "%q\\|",
          end: "\\|"
        }, {
          begin: /<<-'\w+'$/,
          end: /^\s*\w+$/
        }],
        relevance: 0
      };
      let m = {
        begin: "(?!%\\})(" + e.RE_STARTERS_RE + "|\\n|\\b(case|if|select|unless|until|when|while)\\b)\\s*",
        keywords: "case if select unless until when while",
        contains: [{
          className: "regexp",
          contains: [e.BACKSLASH_ESCAPE, a],
          variants: [{
            begin: "//[a-z]*",
            relevance: 0
          }, {
            begin: "/(?!\\/)",
            end: "/[a-z]*"
          }]
        }],
        relevance: 0
      };
      let f = {
        className: "regexp",
        contains: [e.BACKSLASH_ESCAPE, a],
        variants: [{
          begin: "%r\\(",
          end: "\\)",
          contains: u("\\(", "\\)")
        }, {
          begin: "%r\\[",
          end: "\\]",
          contains: u("\\[", "\\]")
        }, {
          begin: "%r\\{",
          end: /\}/,
          contains: u(/\{/, /\}/)
        }, {
          begin: "%r<",
          end: ">",
          contains: u("<", ">")
        }, {
          begin: "%r\\|",
          end: "\\|"
        }],
        relevance: 0
      };
      let h = {
        className: "meta",
        begin: "@\\[",
        end: "\\]",
        contains: [e.inherit(e.QUOTE_STRING_MODE, {
          className: "string"
        })]
      };
      let g = [c, d, p, f, m, h, l, e.HASH_COMMENT_MODE, {
        className: "class",
        beginKeywords: "class module struct",
        end: "$|;",
        illegal: /=/,
        contains: [e.HASH_COMMENT_MODE, e.inherit(e.TITLE_MODE, {
          begin: "[A-Za-z_]\\w*(::\\w+)*(\\?|!)?"
        }), {
          begin: "<"
        }]
      }, {
        className: "class",
        beginKeywords: "lib enum union",
        end: "$|;",
        illegal: /=/,
        contains: [e.HASH_COMMENT_MODE, e.inherit(e.TITLE_MODE, {
          begin: "[A-Za-z_]\\w*(::\\w+)*(\\?|!)?"
        })]
      }, {
        beginKeywords: "annotation",
        end: "$|;",
        illegal: /=/,
        contains: [e.HASH_COMMENT_MODE, e.inherit(e.TITLE_MODE, {
          begin: "[A-Za-z_]\\w*(::\\w+)*(\\?|!)?"
        })],
        relevance: 2
      }, {
        className: "function",
        beginKeywords: "def",
        end: /\B\b/,
        contains: [e.inherit(e.TITLE_MODE, {
          begin: "[a-zA-Z_]\\w*[!?=]?|[-+~]@|<<|>>|[=!]~|===?|<=>|[<>]=?|\\*\\*|[-/+%^&*~|]|//|//=|&[-+*]=?|&\\*\\*|\\[\\][=?]?",
          endsParent: true
        })]
      }, {
        className: "function",
        beginKeywords: "fun macro",
        end: /\B\b/,
        contains: [e.inherit(e.TITLE_MODE, {
          begin: "[a-zA-Z_]\\w*[!?=]?|[-+~]@|<<|>>|[=!]~|===?|<=>|[<>]=?|\\*\\*|[-/+%^&*~|]|//|//=|&[-+*]=?|&\\*\\*|\\[\\][=?]?",
          endsParent: true
        })],
        relevance: 2
      }, {
        className: "symbol",
        begin: e.UNDERSCORE_IDENT_RE + "(!|\\?)?:",
        relevance: 0
      }, {
        className: "symbol",
        begin: ":",
        contains: [d, {
          begin: "[a-zA-Z_]\\w*[!?=]?|[-+~]@|<<|>>|[=!]~|===?|<=>|[<>]=?|\\*\\*|[-/+%^&*~|]|//|//=|&[-+*]=?|&\\*\\*|\\[\\][=?]?"
        }],
        relevance: 0
      }, {
        className: "number",
        variants: [{
          begin: "\\b0b([01_]+)(_?[ui](8|16|32|64|128))?"
        }, {
          begin: "\\b0o([0-7_]+)(_?[ui](8|16|32|64|128))?"
        }, {
          begin: "\\b0x([A-Fa-f0-9_]+)(_?[ui](8|16|32|64|128))?"
        }, {
          begin: "\\b([1-9][0-9_]*[0-9]|[0-9])(\\.[0-9][0-9_]*)?([eE]_?[-+]?[0-9_]*)?(_?f(32|64))?(?!_)"
        }, {
          begin: "\\b([1-9][0-9_]*|0)(_?[ui](8|16|32|64|128))?"
        }],
        relevance: 0
      }];
      a.contains = g;
      c.contains = g.slice(1);
      return {
        name: "Crystal",
        aliases: ["cr"],
        keywords: i,
        contains: g
      };
    }
    mTa.exports = wwp;
  });
  var gTa = __commonJS((XYy, hTa) => {
    function Cwp(e) {
      let t = ["bool", "byte", "char", "decimal", "delegate", "double", "dynamic", "enum", "float", "int", "long", "nint", "nuint", "object", "sbyte", "short", "string", "ulong", "uint", "ushort"];
      let n = ["public", "private", "protected", "static", "internal", "protected", "abstract", "async", "extern", "override", "unsafe", "virtual", "new", "sealed", "partial"];
      let r = ["default", "false", "null", "true"];
      let o = ["abstract", "as", "base", "break", "case", "catch", "class", "const", "continue", "do", "else", "event", "explicit", "extern", "finally", "fixed", "for", "foreach", "goto", "if", "implicit", "in", "interface", "internal", "is", "lock", "namespace", "new", "operator", "out", "override", "params", "private", "protected", "public", "readonly", "record", "ref", "return", "scoped", "sealed", "sizeof", "stackalloc", "static", "struct", "switch", "this", "throw", "try", "typeof", "unchecked", "unsafe", "using", "virtual", "void", "volatile", "while"];
      let s = ["add", "alias", "and", "ascending", "args", "async", "await", "by", "descending", "dynamic", "equals", "file", "from", "get", "global", "group", "init", "into", "join", "let", "nameof", "not", "notnull", "on", "or", "orderby", "partial", "record", "remove", "required", "scoped", "select", "set", "unmanaged", "value|0", "var", "when", "where", "with", "yield"];
      let i = {
        keyword: o.concat(s),
        built_in: t,
        literal: r
      };
      let a = e.inherit(e.TITLE_MODE, {
        begin: "[a-zA-Z](\\.?\\w)*"
      });