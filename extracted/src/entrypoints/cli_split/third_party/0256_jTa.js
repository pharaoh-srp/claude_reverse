  var jTa = __commonJS((uJy, HTa) => {
    function Vwp(e) {
      return {
        name: "Dust",
        aliases: ["dst"],
        case_insensitive: true,
        subLanguage: "xml",
        contains: [{
          className: "template-tag",
          begin: /\{[#\/]/,
          end: /\}/,
          illegal: /;/,
          contains: [{
            className: "name",
            begin: /[a-zA-Z\.-]+/,
            starts: {
              endsWithParent: true,
              relevance: 0,
              contains: [e.QUOTE_STRING_MODE]
            }
          }]
        }, {
          className: "template-variable",
          begin: /\{/,
          end: /\}/,
          illegal: /;/,
          keywords: "if eq ne lt lte gt gte select default math sep"
        }]
      };
    }
    HTa.exports = Vwp;
  });
  var WTa = __commonJS((dJy, qTa) => {
    function zwp(e) {
      let t = e.COMMENT(/\(\*/, /\*\)/);
      let n = {
        className: "attribute",
        begin: /^[ ]*[a-zA-Z]+([\s_-]+[a-zA-Z]+)*/
      };
      let o = {
        begin: /=/,
        end: /[.;]/,
        contains: [t, {
          className: "meta",
          begin: /\?.*\?/
        }, {
          className: "string",
          variants: [e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, {
            begin: "`",
            end: "`"
          }]
        }]
      };
      return {
        name: "Extended Backus-Naur Form",
        illegal: /\S/,
        contains: [t, n, o]
      };
    }
    qTa.exports = zwp;
  });
  var VTa = __commonJS((pJy, GTa) => {
    function Kwp(e) {
      let t = e.regex;
      let n = "[a-zA-Z_][a-zA-Z0-9_.]*(!|\\?)?";
      let r = "[a-zA-Z_]\\w*[!?=]?|[-+~]@|<<|>>|=~|===?|<=>|[<>]=?|\\*\\*|[-/+%^&*~`|]|\\[\\]=?";
      let i = {
        $pattern: "[a-zA-Z_][a-zA-Z0-9_.]*(!|\\?)?",
        keyword: ["after", "alias", "and", "case", "catch", "cond", "defstruct", "defguard", "do", "else", "end", "fn", "for", "if", "import", "in", "not", "or", "quote", "raise", "receive", "require", "reraise", "rescue", "try", "unless", "unquote", "unquote_splicing", "use", "when", "with|0"],
        literal: ["false", "nil", "true"]
      };
      let a = {
        className: "subst",
        begin: /#\{/,
        end: /\}/,
        keywords: i
      };
      let l = {
        className: "number",
        begin: "(\\b0o[0-7_]+)|(\\b0b[01_]+)|(\\b0x[0-9a-fA-F_]+)|(-?\\b[0-9][0-9_]*(\\.[0-9_]+([eE][-+]?[0-9]+)?)?)",
        relevance: 0
      };
      let u = {
        match: /\\[\s\S]/,
        scope: "char.escape",
        relevance: 0
      };
      let d = `[/|([{<"']`;
      let p = [{
        begin: /"/,
        end: /"/
      }, {
        begin: /'/,
        end: /'/
      }, {
        begin: /\//,
        end: /\//
      }, {
        begin: /\|/,
        end: /\|/
      }, {
        begin: /\(/,
        end: /\)/
      }, {
        begin: /\[/,
        end: /\]/
      }, {
        begin: /\{/,
        end: /\}/
      }, {
        begin: /</,
        end: />/
      }];
      let m = E => ({
        scope: "char.escape",
        begin: t.concat(/\\/, E),
        relevance: 0
      });
      let f = {
        className: "string",
        begin: `~[a-z](?=[/|([{<"'])`,
        contains: p.map(E => e.inherit(E, {
          contains: [m(E.end), u, a]
        }))
      };
      let h = {
        className: "string",
        begin: `~[A-Z](?=[/|([{<"'])`,
        contains: p.map(E => e.inherit(E, {
          contains: [m(E.end)]
        }))
      };
      let g = {
        className: "regex",
        variants: [{
          begin: `~r(?=[/|([{<"'])`,
          contains: p.map(E => e.inherit(E, {
            end: t.concat(E.end, /[uismxfU]{0,7}/),
            contains: [m(E.end), u, a]
          }))
        }, {
          begin: `~R(?=[/|([{<"'])`,
          contains: p.map(E => e.inherit(E, {
            end: t.concat(E.end, /[uismxfU]{0,7}/),
            contains: [m(E.end)]
          }))
        }]
      };
      let y = {
        className: "string",
        contains: [e.BACKSLASH_ESCAPE, a],
        variants: [{
          begin: /"""/,
          end: /"""/
        }, {
          begin: /'''/,
          end: /'''/
        }, {
          begin: /~S"""/,
          end: /"""/,
          contains: []
        }, {
          begin: /~S"/,
          end: /"/,
          contains: []
        }, {
          begin: /~S'''/,
          end: /'''/,
          contains: []
        }, {
          begin: /~S'/,
          end: /'/,
          contains: []
        }, {
          begin: /'/,
          end: /'/
        }, {
          begin: /"/,
          end: /"/
        }]
      };
      let _ = {
        className: "function",
        beginKeywords: "def defp defmacro defmacrop",
        end: /\B\b/,
        contains: [e.inherit(e.TITLE_MODE, {
          begin: "[a-zA-Z_][a-zA-Z0-9_.]*(!|\\?)?",
          endsParent: true
        })]
      };
      let b = e.inherit(_, {
        className: "class",
        beginKeywords: "defimpl defmodule defprotocol defrecord",
        end: /\bdo\b|$|;/
      });
      let S = [y, g, h, f, e.HASH_COMMENT_MODE, b, _, {
        begin: "::"
      }, {
        className: "symbol",
        begin: ":(?![\\s:])",
        contains: [y, {
          begin: "[a-zA-Z_]\\w*[!?=]?|[-+~]@|<<|>>|=~|===?|<=>|[<>]=?|\\*\\*|[-/+%^&*~`|]|\\[\\]=?"
        }],
        relevance: 0
      }, {
        className: "symbol",
        begin: "[a-zA-Z_][a-zA-Z0-9_.]*(!|\\?)?:(?!:)",
        relevance: 0
      }, {
        className: "title.class",
        begin: /(\b[A-Z][a-zA-Z0-9_]+)/,
        relevance: 0
      }, l, {
        className: "variable",
        begin: "(\\$\\W)|((\\$|@@?)(\\w+))"
      }];
      a.contains = S;
      return {
        name: "Elixir",
        aliases: ["ex", "exs"],
        keywords: i,
        contains: S
      };
    }
    GTa.exports = Kwp;
  });
  var KTa = __commonJS((mJy, zTa) => {
    function Ywp(e) {
      let t = {
        variants: [e.COMMENT("--", "$"), e.COMMENT(/\{-/, /-\}/, {
          contains: ["self"]
        })]
      };
      let n = {
        className: "type",
        begin: "\\b[A-Z][\\w']*",
        relevance: 0
      };
      let r = {
        begin: "\\(",
        end: "\\)",
        illegal: '"',
        contains: [{
          className: "type",
          begin: "\\b[A-Z][\\w]*(\\((\\.\\.|,|\\w+)\\))?"
        }, t]
      };
      let o = {
        begin: /\{/,
        end: /\}/,
        contains: r.contains
      };
      let s = {
        className: "string",
        begin: "'\\\\?.",
        end: "'",
        illegal: "."
      };
      return {
        name: "Elm",
        keywords: ["let", "in", "if", "then", "else", "case", "of", "where", "module", "import", "exposing", "type", "alias", "as", "infix", "infixl", "infixr", "port", "effect", "command", "subscription"],
        contains: [{
          beginKeywords: "port effect module",
          end: "exposing",
          keywords: "port effect module where command subscription exposing",
          contains: [r, t],
          illegal: "\\W\\.|;"
        }, {
          begin: "import",
          end: "$",
          keywords: "import as exposing",
          contains: [r, t],
          illegal: "\\W\\.|;"
        }, {
          begin: "type",
          end: "$",
          keywords: "type alias",
          contains: [n, r, o, t]
        }, {
          beginKeywords: "infix infixl infixr",
          end: "$",
          contains: [e.C_NUMBER_MODE, t]
        }, {
          begin: "port",
          end: "$",
          keywords: "port",
          contains: [t]
        }, s, e.QUOTE_STRING_MODE, e.C_NUMBER_MODE, n, e.inherit(e.TITLE_MODE, {
          begin: "^[_a-z][\\w']*"
        }), t, {
          begin: "->|<-"
        }],
        illegal: /;/
      };
    }
    zTa.exports = Ywp;
  });
  var JTa = __commonJS((fJy, YTa) => {
    function Jwp(e) {
      return {
        name: "ERB",
        subLanguage: "xml",
        contains: [e.COMMENT("<%#", "%>"), {
          begin: "<%[%=-]?",
          end: "[%-]?%>",
          subLanguage: "ruby",
          excludeBegin: true,
          excludeEnd: true
        }]
      };
    }
    YTa.exports = Jwp;
  });
  var QTa = __commonJS((hJy, XTa) => {
    function Xwp(e) {
      let n = "([a-z'][a-zA-Z0-9_']*:[a-z'][a-zA-Z0-9_']*|[a-z'][a-zA-Z0-9_']*)";
      let r = {
        keyword: "after and andalso|10 band begin bnot bor bsl bzr bxor case catch cond div end fun if let not of orelse|10 query receive rem try when xor maybe else",
        literal: "false true"
      };
      let o = e.COMMENT("%", "$");
      let s = {
        className: "number",
        begin: "\\b(\\d+(_\\d+)*#[a-fA-F0-9]+(_[a-fA-F0-9]+)*|\\d+(_\\d+)*(\\.\\d+(_\\d+)*)?([eE][-+]?\\d+)?)",
        relevance: 0
      };
      let i = {
        begin: "fun\\s+[a-z'][a-zA-Z0-9_']*/\\d+"
      };
      let a = {
        begin: n + "\\(",
        end: "\\)",
        returnBegin: true,
        relevance: 0,
        contains: [{
          begin: n,
          relevance: 0
        }, {
          begin: "\\(",
          end: "\\)",
          endsWithParent: true,
          returnEnd: true,
          relevance: 0
        }]
      };
      let l = {
        begin: /\{/,
        end: /\}/,
        relevance: 0
      };
      let c = {
        begin: "\\b_([A-Z][A-Za-z0-9_]*)?",
        relevance: 0
      };
      let u = {
        begin: "[A-Z][a-zA-Z0-9_]*",
        relevance: 0
      };
      let d = {
        begin: "#" + e.UNDERSCORE_IDENT_RE,
        relevance: 0,
        returnBegin: true,
        contains: [{
          begin: "#" + e.UNDERSCORE_IDENT_RE,
          relevance: 0
        }, {
          begin: /\{/,
          end: /\}/,
          relevance: 0
        }]
      };
      let p = {
        scope: "string",
        match: /\$(\\([^0-9]|[0-9]{1,3}|)|.)/
      };
      let m = {
        scope: "string",
        match: /"""("*)(?!")[\s\S]*?"""\1/
      };
      let f = {
        scope: "string",
        contains: [e.BACKSLASH_ESCAPE],
        variants: [{
          match: /~\w?"""("*)(?!")[\s\S]*?"""\1/
        }, {
          begin: /~\w?\(/,
          end: /\)/
        }, {
          begin: /~\w?\[/,
          end: /\]/
        }, {
          begin: /~\w?{/,
          end: /}/
        }, {
          begin: /~\w?</,
          end: />/
        }, {
          begin: /~\w?\//,
          end: /\//
        }, {
          begin: /~\w?\|/,
          end: /\|/
        }, {
          begin: /~\w?'/,
          end: /'/
        }, {
          begin: /~\w?"/,
          end: /"/
        }, {
          begin: /~\w?`/,
          end: /`/
        }, {
          begin: /~\w?#/,
          end: /#/
        }]
      };
      let h = {
        beginKeywords: "fun receive if try case maybe",
        end: "end",
        keywords: r
      };
      h.contains = [o, i, e.inherit(e.APOS_STRING_MODE, {
        className: ""
      }), h, a, f, m, e.QUOTE_STRING_MODE, s, l, c, u, d, p];
      let g = [o, i, h, a, f, m, e.QUOTE_STRING_MODE, s, l, c, u, d, p];
      a.contains[1].contains = g;
      l.contains = g;
      d.contains[1].contains = g;
      let y = ["-module", "-record", "-undef", "-export", "-ifdef", "-ifndef", "-author", "-copyright", "-doc", "-moduledoc", "-vsn", "-import", "-include", "-include_lib", "-compile", "-define", "-else", "-endif", "-file", "-behaviour", "-behavior", "-spec", "-on_load", "-nifs"];
      let _ = {
        className: "params",
        begin: "\\(",
        end: "\\)",
        contains: g
      };
      return {
        name: "Erlang",
        aliases: ["erl"],
        keywords: r,
        illegal: "(</|\\*=|\\+=|-=|/\\*|\\*/|\\(\\*|\\*\\))",
        contains: [{
          className: "function",
          begin: "^[a-z'][a-zA-Z0-9_']*\\s*\\(",
          end: "->",
          returnBegin: true,
          illegal: "\\(|#|//|/\\*|\\\\|:|;",
          contains: [_, e.inherit(e.TITLE_MODE, {
            begin: "[a-z'][a-zA-Z0-9_']*"
          })],
          starts: {
            end: ";|\\.",
            keywords: r,
            contains: g
          }
        }, o, {
          begin: "^-",
          end: "\\.",
          relevance: 0,
          excludeEnd: true,
          returnBegin: true,
          keywords: {
            $pattern: "-" + e.IDENT_RE,
            keyword: y.map(b => `${b}|1.5`).join(" ")
          },
          contains: [_, f, m, e.QUOTE_STRING_MODE]
        }, s, f, m, e.QUOTE_STRING_MODE, d, c, u, l, p, {
          begin: /\.$/
        }]
      };
    }
    XTa.exports = Xwp;
  });
  var eEa = __commonJS((gJy, ZTa) => {
    function Qwp(e) {
      let t = e.regex;
      return {
        name: "Erlang REPL",
        keywords: {
          built_in: "spawn spawn_link self",
          keyword: "after and andalso|10 band begin bnot bor bsl bsr bxor case catch cond div end fun if let not of or orelse|10 query receive rem try when xor"
        },
        contains: [{
          className: "meta.prompt",
          begin: "^[0-9]+> ",
          relevance: 10
        }, e.COMMENT("%", "$"), {
          className: "number",
          begin: "\\b(\\d+(_\\d+)*#[a-fA-F0-9]+(_[a-fA-F0-9]+)*|\\d+(_\\d+)*(\\.\\d+(_\\d+)*)?([eE][-+]?\\d+)?)",
          relevance: 0
        }, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, {
          begin: t.concat(/\?(::)?/, /([A-Z]\w*)/, /((::)[A-Z]\w*)*/)
        }, {
          begin: "->"
        }, {
          begin: "ok"
        }, {
          begin: "!"
        }, {
          begin: "(\\b[a-z'][a-zA-Z0-9_']*:[a-z'][a-zA-Z0-9_']*)|(\\b[a-z'][a-zA-Z0-9_']*)",
          relevance: 0
        }, {
          begin: "[A-Z][a-zA-Z0-9_']*",
          relevance: 0
        }]
      };
    }
    ZTa.exports = Qwp;
  });
  var nEa = __commonJS((yJy, tEa) => {
    function Zwp(e) {
      return {
        name: "Excel formulae",
        aliases: ["xlsx", "xls"],
        case_insensitive: true,
        keywords: {
          $pattern: /[a-zA-Z][\w\.]*/,
          built_in: ["ABS", "ACCRINT", "ACCRINTM", "ACOS", "ACOSH", "ACOT", "ACOTH", "AGGREGATE", "ADDRESS", "AMORDEGRC", "AMORLINC", "AND", "ARABIC", "AREAS", "ARRAYTOTEXT", "ASC", "ASIN", "ASINH", "ATAN", "ATAN2", "ATANH", "AVEDEV", "AVERAGE", "AVERAGEA", "AVERAGEIF", "AVERAGEIFS", "BAHTTEXT", "BASE", "BESSELI", "BESSELJ", "BESSELK", "BESSELY", "BETADIST", "BETA.DIST", "BETAINV", "BETA.INV", "BIN2DEC", "BIN2HEX", "BIN2OCT", "BINOMDIST", "BINOM.DIST", "BINOM.DIST.RANGE", "BINOM.INV", "BITAND", "BITLSHIFT", "BITOR", "BITRSHIFT", "BITXOR", "BYCOL", "BYROW", "CALL", "CEILING", "CEILING.MATH", "CEILING.PRECISE", "CELL", "CHAR", "CHIDIST", "CHIINV", "CHITEST", "CHISQ.DIST", "CHISQ.DIST.RT", "CHISQ.INV", "CHISQ.INV.RT", "CHISQ.TEST", "CHOOSE", "CHOOSECOLS", "CHOOSEROWS", "CLEAN", "CODE", "COLUMN", "COLUMNS", "COMBIN", "COMBINA", "COMPLEX", "CONCAT", "CONCATENATE", "CONFIDENCE", "CONFIDENCE.NORM", "CONFIDENCE.T", "CONVERT", "CORREL", "COS", "COSH", "COT", "COTH", "COUNT", "COUNTA", "COUNTBLANK", "COUNTIF", "COUNTIFS", "COUPDAYBS", "COUPDAYS", "COUPDAYSNC", "COUPNCD", "COUPNUM", "COUPPCD", "COVAR", "COVARIANCE.P", "COVARIANCE.S", "CRITBINOM", "CSC", "CSCH", "CUBEKPIMEMBER", "CUBEMEMBER", "CUBEMEMBERPROPERTY", "CUBERANKEDMEMBER", "CUBESET", "CUBESETCOUNT", "CUBEVALUE", "CUMIPMT", "CUMPRINC", "DATE", "DATEDIF", "DATEVALUE", "DAVERAGE", "DAY", "DAYS", "DAYS360", "DB", "DBCS", "DCOUNT", "DCOUNTA", "DDB", "DEC2BIN", "DEC2HEX", "DEC2OCT", "DECIMAL", "DEGREES", "DELTA", "DEVSQ", "DGET", "DISC", "DMAX", "DMIN", "DOLLAR", "DOLLARDE", "DOLLARFR", "DPRODUCT", "DROP", "DSTDEV", "DSTDEVP", "DSUM", "DURATION", "DVAR", "DVARP", "EDATE", "EFFECT", "ENCODEURL", "EOMONTH", "ERF", "ERF.PRECISE", "ERFC", "ERFC.PRECISE", "ERROR.TYPE", "EUROCONVERT", "EVEN", "EXACT", "EXP", "EXPAND", "EXPON.DIST", "EXPONDIST", "FACT", "FACTDOUBLE", "FALSE", "F.DIST", "FDIST", "F.DIST.RT", "FILTER", "FILTERXML", "FIND", "FINDB", "F.INV", "F.INV.RT", "FINV", "FISHER", "FISHERINV", "FIXED", "FLOOR", "FLOOR.MATH", "FLOOR.PRECISE", "FORECAST", "FORECAST.ETS", "FORECAST.ETS.CONFINT", "FORECAST.ETS.SEASONALITY", "FORECAST.ETS.STAT", "FORECAST.LINEAR", "FORMULATEXT", "FREQUENCY", "F.TEST", "FTEST", "FV", "FVSCHEDULE", "GAMMA", "GAMMA.DIST", "GAMMADIST", "GAMMA.INV", "GAMMAINV", "GAMMALN", "GAMMALN.PRECISE", "GAUSS", "GCD", "GEOMEAN", "GESTEP", "GETPIVOTDATA", "GROWTH", "HARMEAN", "HEX2BIN", "HEX2DEC", "HEX2OCT", "HLOOKUP", "HOUR", "HSTACK", "HYPERLINK", "HYPGEOM.DIST", "HYPGEOMDIST", "IF", "IFERROR", "IFNA", "IFS", "IMABS", "IMAGE", "IMAGINARY", "IMARGUMENT", "IMCONJUGATE", "IMCOS", "IMCOSH", "IMCOT", "IMCSC", "IMCSCH", "IMDIV", "IMEXP", "IMLN", "IMLOG10", "IMLOG2", "IMPOWER", "IMPRODUCT", "IMREAL", "IMSEC", "IMSECH", "IMSIN", "IMSINH", "IMSQRT", "IMSUB", "IMSUM", "IMTAN", "INDEX", "INDIRECT", "INFO", "INT", "INTERCEPT", "INTRATE", "IPMT", "IRR", "ISBLANK", "ISERR", "ISERROR", "ISEVEN", "ISFORMULA", "ISLOGICAL", "ISNA", "ISNONTEXT", "ISNUMBER", "ISODD", "ISOMITTED", "ISREF", "ISTEXT", "ISO.CEILING", "ISOWEEKNUM", "ISPMT", "JIS", "KURT", "LAMBDA", "LARGE", "LCM", "LEFT", "LEFTB", "LEN", "LENB", "LET", "LINEST", "LN", "LOG", "LOG10", "LOGEST", "LOGINV", "LOGNORM.DIST", "LOGNORMDIST", "LOGNORM.INV", "LOOKUP", "LOWER", "MAKEARRAY", "MAP", "MATCH", "MAX", "MAXA", "MAXIFS", "MDETERM", "MDURATION", "MEDIAN", "MID", "MIDB", "MIN", "MINIFS", "MINA", "MINUTE", "MINVERSE", "MIRR", "MMULT", "MOD", "MODE", "MODE.MULT", "MODE.SNGL", "MONTH", "MROUND", "MULTINOMIAL", "MUNIT", "N", "NA", "NEGBINOM.DIST", "NEGBINOMDIST", "NETWORKDAYS", "NETWORKDAYS.INTL", "NOMINAL", "NORM.DIST", "NORMDIST", "NORMINV", "NORM.INV", "NORM.S.DIST", "NORMSDIST", "NORM.S.INV", "NORMSINV", "NOT", "NOW", "NPER", "NPV", "NUMBERVALUE", "OCT2BIN", "OCT2DEC", "OCT2HEX", "ODD", "ODDFPRICE", "ODDFYIELD", "ODDLPRICE", "ODDLYIELD", "OFFSET", "OR", "PDURATION", "PEARSON", "PERCENTILE.EXC", "PERCENTILE.INC", "PERCENTILE", "PERCENTRANK.EXC", "PERCENTRANK.INC", "PERCENTRANK", "PERMUT", "PERMUTATIONA", "PHI", "PHONETIC", "PI", "PMT", "POISSON.DIST", "POISSON", "POWER", "PPMT", "PRICE", "PRICEDISC", "PRICEMAT", "PROB", "PRODUCT", "PROPER", "PV", "QUARTILE", "QUARTILE.EXC", "QUARTILE.INC", "QUOTIENT", "RADIANS", "RAND", "RANDARRAY", "RANDBETWEEN", "RANK.AVG", "RANK.EQ", "RANK", "RATE", "RECEIVED", "REDUCE", "REGISTER.ID", "REPLACE", "REPLACEB", "REPT", "RIGHT", "RIGHTB", "ROMAN", "ROUND", "ROUNDDOWN", "ROUNDUP", "ROW", "ROWS", "RRI", "RSQ", "RTD", "SCAN", "SEARCH", "SEARCHB", "SEC", "SECH", "SECOND", "SEQUENCE", "SERIESSUM", "SHEET", "SHEETS", "SIGN", "SIN", "SINH", "SKEW", "SKEW.P", "SLN", "SLOPE", "SMALL", "SORT", "SORTBY", "SQRT", "SQRTPI", "SQL.REQUEST", "STANDARDIZE", "STOCKHISTORY", "STDEV", "STDEV.P", "STDEV.S", "STDEVA", "STDEVP", "STDEVPA", "STEYX", "SUBSTITUTE", "SUBTOTAL", "SUM", "SUMIF", "SUMIFS", "SUMPRODUCT", "SUMSQ", "SUMX2MY2", "SUMX2PY2", "SUMXMY2", "SWITCH", "SYD", "T", "TAN", "TANH", "TAKE", "TBILLEQ", "TBILLPRICE", "TBILLYIELD", "T.DIST", "T.DIST.2T", "T.DIST.RT", "TDIST", "TEXT", "TEXTAFTER", "TEXTBEFORE", "TEXTJOIN", "TEXTSPLIT", "TIME", "TIMEVALUE", "T.INV", "T.INV.2T", "TINV", "TOCOL", "TOROW", "TODAY", "TRANSPOSE", "TREND", "TRIM", "TRIMMEAN", "TRUE", "TRUNC", "T.TEST", "TTEST", "TYPE", "UNICHAR", "UNICODE", "UNIQUE", "UPPER", "VALUE", "VALUETOTEXT", "VAR", "VAR.P", "VAR.S", "VARA", "VARP", "VARPA", "VDB", "VLOOKUP", "VSTACK", "WEBSERVICE", "WEEKDAY", "WEEKNUM", "WEIBULL", "WEIBULL.DIST", "WORKDAY", "WORKDAY.INTL", "WRAPCOLS", "WRAPROWS", "XIRR", "XLOOKUP", "XMATCH", "XNPV", "XOR", "YEAR", "YEARFRAC", "YIELD", "YIELDDISC", "YIELDMAT", "Z.TEST", "ZTEST"]
        },
        contains: [{
          begin: /^=/,
          end: /[^=]/,
          returnEnd: true,
          illegal: /=/,
          relevance: 10
        }, {
          className: "symbol",
          begin: /\b[A-Z]{1,2}\d+\b/,
          end: /[^\d]/,
          excludeEnd: true,
          relevance: 0
        }, {
          className: "symbol",
          begin: /[A-Z]{0,2}\d*:[A-Z]{0,2}\d*/,
          relevance: 0
        }, e.BACKSLASH_ESCAPE, e.QUOTE_STRING_MODE, {
          className: "number",
          begin: e.NUMBER_RE + "(%)?",
          relevance: 0
        }, e.COMMENT(/\bN\(/, /\)/, {
          excludeBegin: true,
          excludeEnd: true,
          illegal: /\n/
        })]
      };
    }
    tEa.exports = Zwp;
  });
  var oEa = __commonJS((_Jy, rEa) => {
    function eCp(e) {
      return {
        name: "FIX",
        contains: [{
          begin: /[^\u2401\u0001]+/,
          end: /[\u2401\u0001]/,
          excludeEnd: true,
          returnBegin: true,
          returnEnd: false,
          contains: [{
            begin: /([^\u2401\u0001=]+)/,
            end: /=([^\u2401\u0001=]+)/,
            returnEnd: true,
            returnBegin: false,
            className: "attr"
          }, {
            begin: /=/,
            end: /([\u2401\u0001])/,
            excludeEnd: true,
            excludeBegin: true,
            className: "string"
          }]
        }],
        case_insensitive: true
      };
    }
    rEa.exports = eCp;
  });
  var iEa = __commonJS((bJy, sEa) => {
    function tCp(e) {
      let t = {
        className: "string",
        begin: /'(.|\\[xXuU][a-zA-Z0-9]+)'/
      };
      let n = {
        className: "string",
        variants: [{
          begin: '"',
          end: '"'
        }]
      };
      let o = {
        className: "function",
        beginKeywords: "def",
        end: /[:={\[(\n;]/,
        excludeEnd: true,
        contains: [{
          className: "title",
          relevance: 0,
          begin: /[^0-9\n\t "'(),.`{}\[\]:;][^\n\t "'(),.`{}\[\]:;]+|[^0-9\n\t "'(),.`{}\[\]:;=]/
        }]
      };
      return {
        name: "Flix",
        keywords: {
          keyword: ["case", "class", "def", "else", "enum", "if", "impl", "import", "in", "lat", "rel", "index", "let", "match", "namespace", "switch", "type", "yield", "with"],
          literal: ["true", "false"]
        },
        contains: [e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, t, n, o, e.C_NUMBER_MODE]
      };
    }
    sEa.exports = tCp;
  });
  var lEa = __commonJS((SJy, aEa) => {
    function nCp(e) {
      let t = e.regex;
      let n = {
        className: "params",
        begin: "\\(",
        end: "\\)"
      };
      let r = {
        variants: [e.COMMENT("!", "$", {
          relevance: 0
        }), e.COMMENT("^C[ ]", "$", {
          relevance: 0
        }), e.COMMENT("^C$", "$", {
          relevance: 0
        })]
      };
      let o = /(_[a-z_\d]+)?/;
      let s = /([de][+-]?\d+)?/;
      let i = {
        className: "number",
        variants: [{
          begin: t.concat(/\b\d+/, /\.(\d*)/, s, o)
        }, {
          begin: t.concat(/\b\d+/, s, o)
        }, {
          begin: t.concat(/\.\d+/, s, o)
        }],
        relevance: 0
      };
      let a = {
        className: "function",
        beginKeywords: "subroutine function program",
        illegal: "[${=\\n]",
        contains: [e.UNDERSCORE_TITLE_MODE, n]
      };
      let l = {
        className: "string",
        relevance: 0,
        variants: [e.APOS_STRING_MODE, e.QUOTE_STRING_MODE]
      };
      return {
        name: "Fortran",
        case_insensitive: true,
        aliases: ["f90", "f95"],
        keywords: {
          $pattern: /\b[a-z][a-z0-9_]+\b|\.[a-z][a-z0-9_]+\./,
          keyword: ["kind", "do", "concurrent", "local", "shared", "while", "private", "call", "intrinsic", "where", "elsewhere", "type", "endtype", "endmodule", "endselect", "endinterface", "end", "enddo", "endif", "if", "forall", "endforall", "only", "contains", "default", "return", "stop", "then", "block", "endblock", "endassociate", "public", "subroutine|10", "function", "program", ".and.", ".or.", ".not.", ".le.", ".eq.", ".ge.", ".gt.", ".lt.", "goto", "save", "else", "use", "module", "select", "case", "access", "blank", "direct", "exist", "file", "fmt", "form", "formatted", "iostat", "name", "named", "nextrec", "number", "opened", "rec", "recl", "sequential", "status", "unformatted", "unit", "continue", "format", "pause", "cycle", "exit", "c_null_char", "c_alert", "c_backspace", "c_form_feed", "flush", "wait", "decimal", "round", "iomsg", "synchronous", "nopass", "non_overridable", "pass", "protected", "volatile", "abstract", "extends", "import", "non_intrinsic", "value", "deferred", "generic", "final", "enumerator", "class", "associate", "bind", "enum", "c_int", "c_short", "c_long", "c_long_long", "c_signed_char", "c_size_t", "c_int8_t", "c_int16_t", "c_int32_t", "c_int64_t", "c_int_least8_t", "c_int_least16_t", "c_int_least32_t", "c_int_least64_t", "c_int_fast8_t", "c_int_fast16_t", "c_int_fast32_t", "c_int_fast64_t", "c_intmax_t", "C_intptr_t", "c_float", "c_double", "c_long_double", "c_float_complex", "c_double_complex", "c_long_double_complex", "c_bool", "c_char", "c_null_ptr", "c_null_funptr", "c_new_line", "c_carriage_return", "c_horizontal_tab", "c_vertical_tab", "iso_c_binding", "c_loc", "c_funloc", "c_associated", "c_f_pointer", "c_ptr", "c_funptr", "iso_fortran_env", "character_storage_size", "error_unit", "file_storage_size", "input_unit", "iostat_end", "iostat_eor", "numeric_storage_size", "output_unit", "c_f_procpointer", "ieee_arithmetic", "ieee_support_underflow_control", "ieee_get_underflow_mode", "ieee_set_underflow_mode", "newunit", "contiguous", "recursive", "pad", "position", "action", "delim", "readwrite", "eor", "advance", "nml", "interface", "procedure", "namelist", "include", "sequence", "elemental", "pure", "impure", "integer", "real", "character", "complex", "logical", "codimension", "dimension", "allocatable|10", "parameter", "external", "implicit|10", "none", "double", "precision", "assign", "intent", "optional", "pointer", "target", "in", "out", "common", "equivalence", "data"],
          literal: [".False.", ".True."],
          built_in: ["alog", "alog10", "amax0", "amax1", "amin0", "amin1", "amod", "cabs", "ccos", "cexp", "clog", "csin", "csqrt", "dabs", "dacos", "dasin", "datan", "datan2", "dcos", "dcosh", "ddim", "dexp", "dint", "dlog", "dlog10", "dmax1", "dmin1", "dmod", "dnint", "dsign", "dsin", "dsinh", "dsqrt", "dtan", "dtanh", "float", "iabs", "idim", "idint", "idnint", "ifix", "isign", "max0", "max1", "min0", "min1", "sngl", "algama", "cdabs", "cdcos", "cdexp", "cdlog", "cdsin", "cdsqrt", "cqabs", "cqcos", "cqexp", "cqlog", "cqsin", "cqsqrt", "dcmplx", "dconjg", "derf", "derfc", "dfloat", "dgamma", "dimag", "dlgama", "iqint", "qabs", "qacos", "qasin", "qatan", "qatan2", "qcmplx", "qconjg", "qcos", "qcosh", "qdim", "qerf", "qerfc", "qexp", "qgamma", "qimag", "qlgama", "qlog", "qlog10", "qmax1", "qmin1", "qmod", "qnint", "qsign", "qsin", "qsinh", "qsqrt", "qtan", "qtanh", "abs", "acos", "aimag", "aint", "anint", "asin", "atan", "atan2", "char", "cmplx", "conjg", "cos", "cosh", "exp", "ichar", "index", "int", "log", "log10", "max", "min", "nint", "sign", "sin", "sinh", "sqrt", "tan", "tanh", "print", "write", "dim", "lge", "lgt", "lle", "llt", "mod", "nullify", "allocate", "deallocate", "adjustl", "adjustr", "all", "allocated", "any", "associated", "bit_size", "btest", "ceiling", "count", "cshift", "date_and_time", "digits", "dot_product", "eoshift", "epsilon", "exponent", "floor", "fraction", "huge", "iand", "ibclr", "ibits", "ibset", "ieor", "ior", "ishft", "ishftc", "lbound", "len_trim", "matmul", "maxexponent", "maxloc", "maxval", "merge", "minexponent", "minloc", "minval", "modulo", "mvbits", "nearest", "pack", "present", "product", "radix", "random_number", "random_seed", "range", "repeat", "reshape", "rrspacing", "scale", "scan", "selected_int_kind", "selected_real_kind", "set_exponent", "shape", "size", "spacing", "spread", "sum", "system_clock", "tiny", "transpose", "trim", "ubound", "unpack", "verify", "achar", "iachar", "transfer", "dble", "entry", "dprod", "cpu_time", "command_argument_count", "get_command", "get_command_argument", "get_environment_variable", "is_iostat_end", "ieee_arithmetic", "ieee_support_underflow_control", "ieee_get_underflow_mode", "ieee_set_underflow_mode", "is_iostat_eor", "move_alloc", "new_line", "selected_char_kind", "same_type_as", "extends_type_of", "acosh", "asinh", "atanh", "bessel_j0", "bessel_j1", "bessel_jn", "bessel_y0", "bessel_y1", "bessel_yn", "erf", "erfc", "erfc_scaled", "gamma", "log_gamma", "hypot", "norm2", "atomic_define", "atomic_ref", "execute_command_line", "leadz", "trailz", "storage_size", "merge_bits", "bge", "bgt", "ble", "blt", "dshiftl", "dshiftr", "findloc", "iall", "iany", "iparity", "image_index", "lcobound", "ucobound", "maskl", "maskr", "num_images", "parity", "popcnt", "poppar", "shifta", "shiftl", "shiftr", "this_image", "sync", "change", "team", "co_broadcast", "co_max", "co_min", "co_sum", "co_reduce"]
        },
        illegal: /\/\*/,
        contains: [l, a, {
          begin: /^C\s*=(?!=)/,
          relevance: 0
        }, r, i]
      };
    }
    aEa.exports = nCp;
  });
  var dEa = __commonJS((TJy, uEa) => {
    function rCp(e) {
      return new RegExp(e.replace(/[-/\\^$*+?.()|[\]{}]/g, "\\$&"), "m");
    }
    function cEa(e) {
      if (!e) {
        return null;
      }
      if (typeof e === "string") {
        return e;
      }
      return e.source;
    }
    function _Wt(e) {
      return goe("(?=", e, ")");
    }
    function goe(...e) {
      return e.map(n => cEa(n)).join("");
    }
    function oCp(e) {
      let t = e[e.length - 1];
      if (typeof t === "object" && t.constructor === Object) {
        e.splice(e.length - 1, 1);
        return t;
      } else {
        return {};
      }
    }
    function u5e(...e) {
      return "(" + (oCp(e).capture ? "" : "?:") + e.map(r => cEa(r)).join("|") + ")";
    }
    function sCp(e) {
      let t = ["abstract", "and", "as", "assert", "base", "begin", "class", "default", "delegate", "do", "done", "downcast", "downto", "elif", "else", "end", "exception", "extern", "finally", "fixed", "for", "fun", "function", "global", "if", "in", "inherit", "inline", "interface", "internal", "lazy", "let", "match", "member", "module", "mutable", "namespace", "new", "of", "open", "or", "override", "private", "public", "rec", "return", "static", "struct", "then", "to", "try", "type", "upcast", "use", "val", "void", "when", "while", "with", "yield"];
      let n = {
        scope: "keyword",
        match: /\b(yield|return|let|do|match|use)!/
      };
      let r = ["if", "else", "endif", "line", "nowarn", "light", "r", "i", "I", "load", "time", "help", "quit"];
      let o = ["true", "false", "null", "Some", "None", "Ok", "Error", "infinity", "infinityf", "nan", "nanf"];
      let s = ["__LINE__", "__SOURCE_DIRECTORY__", "__SOURCE_FILE__"];
      let i = ["bool", "byte", "sbyte", "int8", "int16", "int32", "uint8", "uint16", "uint32", "int", "uint", "int64", "uint64", "nativeint", "unativeint", "decimal", "float", "double", "float32", "single", "char", "string", "unit", "bigint", "option", "voption", "list", "array", "seq", "byref", "exn", "inref", "nativeptr", "obj", "outref", "voidptr", "Result"];
      let l = {
        keyword: t,
        literal: o,
        built_in: ["not", "ref", "raise", "reraise", "dict", "readOnlyDict", "set", "get", "enum", "sizeof", "typeof", "typedefof", "nameof", "nullArg", "invalidArg", "invalidOp", "id", "fst", "snd", "ignore", "lock", "using", "box", "unbox", "tryUnbox", "printf", "printfn", "sprintf", "eprintf", "eprintfn", "fprintf", "fprintfn", "failwith", "failwithf"],
        "variable.constant": s
      };
      let u = {
        variants: [e.COMMENT(/\(\*(?!\))/, /\*\)/, {
          contains: ["self"]
        }), e.C_LINE_COMMENT_MODE]
      };
      let d = /[a-zA-Z_](\w|')*/;
      let p = {
        scope: "variable",
        begin: /``/,
        end: /``/
      };
      let m = /\B('|\^)/;
      let f = {
        scope: "symbol",
        variants: [{
          match: goe(m, /``.*?``/)
        }, {
          match: goe(m, e.UNDERSCORE_IDENT_RE)
        }],
        relevance: 0
      };
      let h = function ({
        includeEqual: N
      }) {
        let W;
        if (N) {
          W = "!%&*+-/<=>@^|~?";
        } else {
          W = "!%&*+-/<>@^|~?";
        }
        let j = Array.from(W);
        let z = goe("[", ...j.map(rCp), "]");
        let V = u5e(z, /\./);
        let K = goe(V, _Wt(V));
        let J = u5e(goe(K, V, "*"), goe(z, "+"));
        return {
          scope: "operator",
          match: u5e(J, /:\?>/, /:\?/, /:>/, /:=/, /::?/, /\$/),
          relevance: 0
        };
      };
      let g = h({
        includeEqual: true
      });
      let y = h({
        includeEqual: false
      });
      let _ = function (N, W) {
        return {
          begin: goe(N, _Wt(goe(/\s*/, u5e(/\w/, /'/, /\^/, /#/, /``/, /\(/, /{\|/)))),
          beginScope: W,
          end: _Wt(u5e(/\n/, /=/)),
          relevance: 0,
          keywords: e.inherit(l, {
            type: i
          }),
          contains: [u, f, e.inherit(p, {
            scope: null
          }), y]
        };
      };
      let b = _(/:/, "operator");
      let S = _(/\bof\b/, "keyword");
      let E = {
        begin: [/(^|\s+)/, /type/, /\s+/, d],
        beginScope: {
          2: "keyword",
          4: "title.class"
        },
        end: _Wt(/\(|=|$/),
        keywords: l,
        contains: [u, e.inherit(p, {
          scope: null
        }), f, {
          scope: "operator",
          match: /<|>/
        }, b]
      };
      let C = {
        scope: "computation-expression",
        match: /\b[_a-z]\w*(?=\s*\{)/
      };
      let x = {
        begin: [/^\s*/, goe(/#/, u5e(...r)), /\b/],
        beginScope: {
          2: "meta"
        },
        end: _Wt(/\s|$/)
      };
      let A = {
        variants: [e.BINARY_NUMBER_MODE, e.C_NUMBER_MODE]
      };
      let k = {
        scope: "string",
        begin: /"/,
        end: /"/,
        contains: [e.BACKSLASH_ESCAPE]
      };
      let I = {
        scope: "string",
        begin: /@"/,
        end: /"/,
        contains: [{
          match: /""/
        }, e.BACKSLASH_ESCAPE]
      };
      let O = {
        scope: "string",
        begin: /"""/,
        end: /"""/,
        relevance: 2
      };
      let M = {
        scope: "subst",
        begin: /\{/,
        end: /\}/,
        keywords: l
      };
      let L = {
        scope: "string",
        begin: /\$"/,
        end: /"/,
        contains: [{
          match: /\{\{/
        }, {
          match: /\}\}/
        }, e.BACKSLASH_ESCAPE, M]
      };
      let P = {
        scope: "string",
        begin: /(\$@|@\$)"/,
        end: /"/,
        contains: [{
          match: /\{\{/
        }, {
          match: /\}\}/
        }, {
          match: /""/
        }, e.BACKSLASH_ESCAPE, M]
      };
      let F = {
        scope: "string",
        begin: /\$"""/,
        end: /"""/,
        contains: [{
          match: /\{\{/
        }, {
          match: /\}\}/
        }, M],
        relevance: 2
      };
      let H = {
        scope: "string",
        match: goe(/'/, u5e(/[^\\']/, /\\(?:.|\d{3}|x[a-fA-F\d]{2}|u[a-fA-F\d]{4}|U[a-fA-F\d]{8})/), /'/)
      };
      M.contains = [P, L, I, k, H, n, u, p, b, C, x, A, f, g];
      return {
        name: "F#",
        aliases: ["fs", "f#"],
        keywords: l,
        illegal: /\/\*/,
        classNameAliases: {
          "computation-expression": "keyword"
        },
        contains: [n, {
          variants: [F, P, L, O, I, k, H]
        }, u, p, E, {
          scope: "meta",
          begin: /\[</,
          end: />\]/,
          relevance: 2,
          contains: [p, O, I, k, H, A]
        }, S, b, C, x, A, f, g]
      };
    }
    uEa.exports = sCp;
  });
  var mEa = __commonJS((EJy, pEa) => {
    function iCp(e) {
      let t = e.regex;
      let n = {
        keyword: "abort acronym acronyms alias all and assign binary card diag display else eq file files for free ge gt if integer le loop lt maximizing minimizing model models ne negative no not option options or ord positive prod put putpage puttl repeat sameas semicont semiint smax smin solve sos1 sos2 sum system table then until using while xor yes",
        literal: "eps inf na",
        built_in: "abs arccos arcsin arctan arctan2 Beta betaReg binomial ceil centropy cos cosh cvPower div div0 eDist entropy errorf execSeed exp fact floor frac gamma gammaReg log logBeta logGamma log10 log2 mapVal max min mod ncpCM ncpF ncpVUpow ncpVUsin normal pi poly power randBinomial randLinear randTriangle round rPower sigmoid sign signPower sin sinh slexp sllog10 slrec sqexp sqlog10 sqr sqrec sqrt tan tanh trunc uniform uniformInt vcPower bool_and bool_eqv bool_imp bool_not bool_or bool_xor ifThen rel_eq rel_ge rel_gt rel_le rel_lt rel_ne gday gdow ghour gleap gmillisec gminute gmonth gsecond gyear jdate jnow jstart jtime errorLevel execError gamsRelease gamsVersion handleCollect handleDelete handleStatus handleSubmit heapFree heapLimit heapSize jobHandle jobKill jobStatus jobTerminate licenseLevel licenseStatus maxExecError sleep timeClose timeComp timeElapsed timeExec timeStart"
      };
      let r = {
        className: "params",
        begin: /\(/,
        end: /\)/,
        excludeBegin: true,
        excludeEnd: true
      };
      let o = {
        className: "symbol",
        variants: [{
          begin: /=[lgenxc]=/
        }, {
          begin: /\$/
        }]
      };
      let s = {
        className: "comment",
        variants: [{
          begin: "'",
          end: "'"
        }, {
          begin: '"',
          end: '"'
        }],
        illegal: "\\n",
        contains: [e.BACKSLASH_ESCAPE]
      };
      let i = {
        begin: "/",
        end: "/",
        keywords: n,
        contains: [s, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, e.QUOTE_STRING_MODE, e.APOS_STRING_MODE, e.C_NUMBER_MODE]
      };
      let a = /[a-z0-9&#*=?@\\><:,()$[\]_.{}!+%^-]+/;
      let l = {
        begin: /[a-z][a-z0-9_]*(\([a-z0-9_, ]*\))?[ \t]+/,
        excludeBegin: true,
        end: "$",
        endsWithParent: true,
        contains: [s, i, {
          className: "comment",
          begin: t.concat(a, t.anyNumberOfTimes(t.concat(/[ ]+/, a))),
          relevance: 0
        }]
      };
      return {
        name: "GAMS",
        aliases: ["gms"],
        case_insensitive: true,
        keywords: n,
        contains: [e.COMMENT(/^\$ontext/, /^\$offtext/), {
          className: "meta",
          begin: "^\\$[a-z0-9]+",
          end: "$",
          returnBegin: true,
          contains: [{
            className: "keyword",
            begin: "^\\$[a-z0-9]+"
          }]
        }, e.COMMENT("^\\*", "$"), e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, e.QUOTE_STRING_MODE, e.APOS_STRING_MODE, {
          beginKeywords: "set sets parameter parameters variable variables scalar scalars equation equations",
          end: ";",
          contains: [e.COMMENT("^\\*", "$"), e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, e.QUOTE_STRING_MODE, e.APOS_STRING_MODE, i, l]
        }, {
          beginKeywords: "table",
          end: ";",
          returnBegin: true,
          contains: [{
            beginKeywords: "table",
            end: "$",
            contains: [l]
          }, e.COMMENT("^\\*", "$"), e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, e.QUOTE_STRING_MODE, e.APOS_STRING_MODE, e.C_NUMBER_MODE]
        }, {
          className: "function",
          begin: /^[a-z][a-z0-9_,\-+' ()$]+\.{2}/,
          returnBegin: true,
          contains: [{
            className: "title",
            begin: /^[a-z0-9_]+/
          }, r, o]
        }, e.C_NUMBER_MODE, o]
      };
    }
    pEa.exports = iCp;
  });
  var hEa = __commonJS((vJy, fEa) => {
    function aCp(e) {
      let t = {
        keyword: "bool break call callexe checkinterrupt clear clearg closeall cls comlog compile continue create debug declare delete disable dlibrary dllcall do dos ed edit else elseif enable end endfor endif endp endo errorlog errorlogat expr external fn for format goto gosub graph if keyword let lib library line load loadarray loadexe loadf loadk loadm loadp loads loadx local locate loopnextindex lprint lpwidth lshow matrix msym ndpclex new open output outwidth plot plotsym pop prcsn print printdos proc push retp return rndcon rndmod rndmult rndseed run save saveall screen scroll setarray show sparse stop string struct system trace trap threadfor threadendfor threadbegin threadjoin threadstat threadend until use while winprint ne ge le gt lt and xor or not eq eqv",
        built_in: "abs acf aconcat aeye amax amean AmericanBinomCall AmericanBinomCall_Greeks AmericanBinomCall_ImpVol AmericanBinomPut AmericanBinomPut_Greeks AmericanBinomPut_ImpVol AmericanBSCall AmericanBSCall_Greeks AmericanBSCall_ImpVol AmericanBSPut AmericanBSPut_Greeks AmericanBSPut_ImpVol amin amult annotationGetDefaults annotationSetBkd annotationSetFont annotationSetLineColor annotationSetLineStyle annotationSetLineThickness annualTradingDays arccos arcsin areshape arrayalloc arrayindex arrayinit arraytomat asciiload asclabel astd astds asum atan atan2 atranspose axmargin balance band bandchol bandcholsol bandltsol bandrv bandsolpd bar base10 begwind besselj bessely beta box boxcox cdfBeta cdfBetaInv cdfBinomial cdfBinomialInv cdfBvn cdfBvn2 cdfBvn2e cdfCauchy cdfCauchyInv cdfChic cdfChii cdfChinc cdfChincInv cdfExp cdfExpInv cdfFc cdfFnc cdfFncInv cdfGam cdfGenPareto cdfHyperGeo cdfLaplace cdfLaplaceInv cdfLogistic cdfLogisticInv cdfmControlCreate cdfMvn cdfMvn2e cdfMvnce cdfMvne cdfMvt2e cdfMvtce cdfMvte cdfN cdfN2 cdfNc cdfNegBinomial cdfNegBinomialInv cdfNi cdfPoisson cdfPoissonInv cdfRayleigh cdfRayleighInv cdfTc cdfTci cdfTnc cdfTvn cdfWeibull cdfWeibullInv cdir ceil ChangeDir chdir chiBarSquare chol choldn cholsol cholup chrs close code cols colsf combinate combinated complex con cond conj cons ConScore contour conv convertsatostr convertstrtosa corrm corrms corrvc corrx corrxs cos cosh counts countwts crossprd crout croutp csrcol csrlin csvReadM csvReadSA cumprodc cumsumc curve cvtos datacreate datacreatecomplex datalist dataload dataloop dataopen datasave date datestr datestring datestrymd dayinyr dayofweek dbAddDatabase dbClose dbCommit dbCreateQuery dbExecQuery dbGetConnectOptions dbGetDatabaseName dbGetDriverName dbGetDrivers dbGetHostName dbGetLastErrorNum dbGetLastErrorText dbGetNumericalPrecPolicy dbGetPassword dbGetPort dbGetTableHeaders dbGetTables dbGetUserName dbHasFeature dbIsDriverAvailable dbIsOpen dbIsOpenError dbOpen dbQueryBindValue dbQueryClear dbQueryCols dbQueryExecPrepared dbQueryFetchAllM dbQueryFetchAllSA dbQueryFetchOneM dbQueryFetchOneSA dbQueryFinish dbQueryGetBoundValue dbQueryGetBoundValues dbQueryGetField dbQueryGetLastErrorNum dbQueryGetLastErrorText dbQueryGetLastInsertID dbQueryGetLastQuery dbQueryGetPosition dbQueryIsActive dbQueryIsForwardOnly dbQueryIsNull dbQueryIsSelect dbQueryIsValid dbQueryPrepare dbQueryRows dbQuerySeek dbQuerySeekFirst dbQuerySeekLast dbQuerySeekNext dbQuerySeekPrevious dbQuerySetForwardOnly dbRemoveDatabase dbRollback dbSetConnectOptions dbSetDatabaseName dbSetHostName dbSetNumericalPrecPolicy dbSetPort dbSetUserName dbTransaction DeleteFile delif delrows denseToSp denseToSpRE denToZero design det detl dfft dffti diag diagrv digamma doswin DOSWinCloseall DOSWinOpen dotfeq dotfeqmt dotfge dotfgemt dotfgt dotfgtmt dotfle dotflemt dotflt dotfltmt dotfne dotfnemt draw drop dsCreate dstat dstatmt dstatmtControlCreate dtdate dtday dttime dttodtv dttostr dttoutc dtvnormal dtvtodt dtvtoutc dummy dummybr dummydn eig eigh eighv eigv elapsedTradingDays endwind envget eof eqSolve eqSolvemt eqSolvemtControlCreate eqSolvemtOutCreate eqSolveset erf erfc erfccplx erfcplx error etdays ethsec etstr EuropeanBinomCall EuropeanBinomCall_Greeks EuropeanBinomCall_ImpVol EuropeanBinomPut EuropeanBinomPut_Greeks EuropeanBinomPut_ImpVol EuropeanBSCall EuropeanBSCall_Greeks EuropeanBSCall_ImpVol EuropeanBSPut EuropeanBSPut_Greeks EuropeanBSPut_ImpVol exctsmpl exec execbg exp extern eye fcheckerr fclearerr feq feqmt fflush fft ffti fftm fftmi fftn fge fgemt fgets fgetsa fgetsat fgetst fgt fgtmt fileinfo filesa fle flemt floor flt fltmt fmod fne fnemt fonts fopen formatcv formatnv fputs fputst fseek fstrerror ftell ftocv ftos ftostrC gamma gammacplx gammaii gausset gdaAppend gdaCreate gdaDStat gdaDStatMat gdaGetIndex gdaGetName gdaGetNames gdaGetOrders gdaGetType gdaGetTypes gdaGetVarInfo gdaIsCplx gdaLoad gdaPack gdaRead gdaReadByIndex gdaReadSome gdaReadSparse gdaReadStruct gdaReportVarInfo gdaSave gdaUpdate gdaUpdateAndPack gdaVars gdaWrite gdaWrite32 gdaWriteSome getarray getdims getf getGAUSShome getmatrix getmatrix4D getname getnamef getNextTradingDay getNextWeekDay getnr getorders getpath getPreviousTradingDay getPreviousWeekDay getRow getscalar3D getscalar4D getTrRow getwind glm gradcplx gradMT gradMTm gradMTT gradMTTm gradp graphprt graphset hasimag header headermt hess hessMT hessMTg hessMTgw hessMTm hessMTmw hessMTT hessMTTg hessMTTgw hessMTTm hessMTw hessp hist histf histp hsec imag indcv indexcat indices indices2 indicesf indicesfn indnv indsav integrate1d integrateControlCreate intgrat2 intgrat3 inthp1 inthp2 inthp3 inthp4 inthpControlCreate intquad1 intquad2 intquad3 intrleav intrleavsa intrsect intsimp inv invpd invswp iscplx iscplxf isden isinfnanmiss ismiss key keyav keyw lag lag1 lagn lapEighb lapEighi lapEighvb lapEighvi lapgEig lapgEigh lapgEighv lapgEigv lapgSchur lapgSvdcst lapgSvds lapgSvdst lapSvdcusv lapSvds lapSvdusv ldlp ldlsol linSolve listwise ln lncdfbvn lncdfbvn2 lncdfmvn lncdfn lncdfn2 lncdfnc lnfact lngammacplx lnpdfmvn lnpdfmvt lnpdfn lnpdft loadd loadstruct loadwind loess loessmt loessmtControlCreate log loglog logx logy lower lowmat lowmat1 ltrisol lu lusol machEpsilon make makevars makewind margin matalloc matinit mattoarray maxbytes maxc maxindc maxv maxvec mbesselei mbesselei0 mbesselei1 mbesseli mbesseli0 mbesseli1 meanc median mergeby mergevar minc minindc minv miss missex missrv moment momentd movingave movingaveExpwgt movingaveWgt nextindex nextn nextnevn nextwind ntos null null1 numCombinations ols olsmt olsmtControlCreate olsqr olsqr2 olsqrmt ones optn optnevn orth outtyp pacf packedToSp packr parse pause pdfCauchy pdfChi pdfExp pdfGenPareto pdfHyperGeo pdfLaplace pdfLogistic pdfn pdfPoisson pdfRayleigh pdfWeibull pi pinv pinvmt plotAddArrow plotAddBar plotAddBox plotAddHist plotAddHistF plotAddHistP plotAddPolar plotAddScatter plotAddShape plotAddTextbox plotAddTS plotAddXY plotArea plotBar plotBox plotClearLayout plotContour plotCustomLayout plotGetDefaults plotHist plotHistF plotHistP plotLayout plotLogLog plotLogX plotLogY plotOpenWindow plotPolar plotSave plotScatter plotSetAxesPen plotSetBar plotSetBarFill plotSetBarStacked plotSetBkdColor plotSetFill plotSetGrid plotSetLegend plotSetLineColor plotSetLineStyle plotSetLineSymbol plotSetLineThickness plotSetNewWindow plotSetTitle plotSetWhichYAxis plotSetXAxisShow plotSetXLabel plotSetXRange plotSetXTicInterval plotSetXTicLabel plotSetYAxisShow plotSetYLabel plotSetYRange plotSetZAxisShow plotSetZLabel plotSurface plotTS plotXY polar polychar polyeval polygamma polyint polymake polymat polymroot polymult polyroot pqgwin previousindex princomp printfm printfmt prodc psi putarray putf putvals pvCreate pvGetIndex pvGetParNames pvGetParVector pvLength pvList pvPack pvPacki pvPackm pvPackmi pvPacks pvPacksi pvPacksm pvPacksmi pvPutParVector pvTest pvUnpack QNewton QNewtonmt QNewtonmtControlCreate QNewtonmtOutCreate QNewtonSet QProg QProgmt QProgmtInCreate qqr qqre qqrep qr qre qrep qrsol qrtsol qtyr qtyre qtyrep quantile quantiled qyr qyre qyrep qz rank rankindx readr real reclassify reclassifyCuts recode recserar recsercp recserrc rerun rescale reshape rets rev rfft rffti rfftip rfftn rfftnp rfftp rndBernoulli rndBeta rndBinomial rndCauchy rndChiSquare rndCon rndCreateState rndExp rndGamma rndGeo rndGumbel rndHyperGeo rndi rndKMbeta rndKMgam rndKMi rndKMn rndKMnb rndKMp rndKMu rndKMvm rndLaplace rndLCbeta rndLCgam rndLCi rndLCn rndLCnb rndLCp rndLCu rndLCvm rndLogNorm rndMTu rndMVn rndMVt rndn rndnb rndNegBinomial rndp rndPoisson rndRayleigh rndStateSkip rndu rndvm rndWeibull rndWishart rotater round rows rowsf rref sampleData satostrC saved saveStruct savewind scale scale3d scalerr scalinfnanmiss scalmiss schtoc schur searchsourcepath seekr select selif seqa seqm setdif setdifsa setvars setvwrmode setwind shell shiftr sin singleindex sinh sleep solpd sortc sortcc sortd sorthc sorthcc sortind sortindc sortmc sortr sortrc spBiconjGradSol spChol spConjGradSol spCreate spDenseSubmat spDiagRvMat spEigv spEye spLDL spline spLU spNumNZE spOnes spreadSheetReadM spreadSheetReadSA spreadSheetWrite spScale spSubmat spToDense spTrTDense spTScalar spZeros sqpSolve sqpSolveMT sqpSolveMTControlCreate sqpSolveMTlagrangeCreate sqpSolveMToutCreate sqpSolveSet sqrt statements stdc stdsc stocv stof strcombine strindx strlen strput strrindx strsect strsplit strsplitPad strtodt strtof strtofcplx strtriml strtrimr strtrunc strtruncl strtruncpad strtruncr submat subscat substute subvec sumc sumr surface svd svd1 svd2 svdcusv svds svdusv sysstate tab tan tanh tempname time timedt timestr timeutc title tkf2eps tkf2ps tocart todaydt toeplitz token topolar trapchk trigamma trimr trunc type typecv typef union unionsa uniqindx uniqindxsa unique uniquesa upmat upmat1 upper utctodt utctodtv utrisol vals varCovMS varCovXS varget vargetl varmall varmares varput varputl vartypef vcm vcms vcx vcxs vec vech vecr vector vget view viewxyz vlist vnamecv volume vput vread vtypecv wait waitc walkindex where window writer xlabel xlsGetSheetCount xlsGetSheetSize xlsGetSheetTypes xlsMakeRange xlsReadM xlsReadSA xlsWrite xlsWriteM xlsWriteSA xpnd xtics xy xyz ylabel ytics zeros zeta zlabel ztics cdfEmpirical dot h5create h5open h5read h5readAttribute h5write h5writeAttribute ldl plotAddErrorBar plotAddSurface plotCDFEmpirical plotSetColormap plotSetContourLabels plotSetLegendFont plotSetTextInterpreter plotSetXTicCount plotSetYTicCount plotSetZLevels powerm strjoin sylvester strtrim",
        literal: "DB_AFTER_LAST_ROW DB_ALL_TABLES DB_BATCH_OPERATIONS DB_BEFORE_FIRST_ROW DB_BLOB DB_EVENT_NOTIFICATIONS DB_FINISH_QUERY DB_HIGH_PRECISION DB_LAST_INSERT_ID DB_LOW_PRECISION_DOUBLE DB_LOW_PRECISION_INT32 DB_LOW_PRECISION_INT64 DB_LOW_PRECISION_NUMBERS DB_MULTIPLE_RESULT_SETS DB_NAMED_PLACEHOLDERS DB_POSITIONAL_PLACEHOLDERS DB_PREPARED_QUERIES DB_QUERY_SIZE DB_SIMPLE_LOCKING DB_SYSTEM_TABLES DB_TABLES DB_TRANSACTIONS DB_UNICODE DB_VIEWS __STDIN __STDOUT __STDERR __FILE_DIR"
      };
      let n = e.COMMENT("@", "@");
      let r = {
        className: "meta",
        begin: "#",
        end: "$",
        keywords: {
          keyword: "define definecs|10 undef ifdef ifndef iflight ifdllcall ifmac ifos2win ifunix else endif lineson linesoff srcfile srcline"
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
          contains: [{
            className: "string",
            begin: '"',
            end: '"',
            illegal: "\\n"
          }]
        }, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, n]
      };
      let o = {
        begin: /\bstruct\s+/,
        end: /\s/,
        keywords: "struct",
        contains: [{
          className: "type",
          begin: e.UNDERSCORE_IDENT_RE,
          relevance: 0
        }]
      };
      let s = [{
        className: "params",
        begin: /\(/,
        end: /\)/,
        excludeBegin: true,
        excludeEnd: true,
        endsWithParent: true,
        relevance: 0,
        contains: [{
          className: "literal",
          begin: /\.\.\./
        }, e.C_NUMBER_MODE, e.C_BLOCK_COMMENT_MODE, n, o]
      }];
      let i = {
        className: "title",
        begin: e.UNDERSCORE_IDENT_RE,
        relevance: 0
      };
      let a = function (p, m, f) {
        let h = e.inherit({
          className: "function",
          beginKeywords: p,
          end: m,
          excludeEnd: true,
          contains: [].concat(s)
        }, {});
        h.contains.push(i);
        h.contains.push(e.C_NUMBER_MODE);
        h.contains.push(e.C_BLOCK_COMMENT_MODE);
        h.contains.push(n);
        return h;
      };
      let l = {
        className: "built_in",
        begin: "\\b(" + t.built_in.split(" ").join("|") + ")\\b"
      };
      let c = {
        className: "string",
        begin: '"',
        end: '"',
        contains: [e.BACKSLASH_ESCAPE],
        relevance: 0
      };
      let u = {
        begin: e.UNDERSCORE_IDENT_RE + "\\s*\\(",
        returnBegin: true,
        keywords: t,
        relevance: 0,
        contains: [{
          beginKeywords: t.keyword
        }, l, {
          className: "built_in",
          begin: e.UNDERSCORE_IDENT_RE,
          relevance: 0
        }]
      };
      let d = {
        begin: /\(/,
        end: /\)/,
        relevance: 0,
        keywords: {
          built_in: t.built_in,
          literal: t.literal
        },
        contains: [e.C_NUMBER_MODE, e.C_BLOCK_COMMENT_MODE, n, l, u, c, "self"]
      };
      u.contains.push(d);
      return {
        name: "GAUSS",
        aliases: ["gss"],
        case_insensitive: true,
        keywords: t,
        illegal: /(\{[%#]|[%#]\}| <- )/,
        contains: [e.C_NUMBER_MODE, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, n, c, r, {
          className: "keyword",
          begin: /\bexternal (matrix|string|array|sparse matrix|struct|proc|keyword|fn)/
        }, a("proc keyword", ";"), a("fn", "="), {
          beginKeywords: "for threadfor",
          end: /;/,
          relevance: 0,
          contains: [e.C_BLOCK_COMMENT_MODE, n, d]
        }, {
          variants: [{
            begin: e.UNDERSCORE_IDENT_RE + "\\." + e.UNDERSCORE_IDENT_RE
          }, {
            begin: e.UNDERSCORE_IDENT_RE + "\\s*="
          }],
          relevance: 0
        }, u, o]
      };
    }
    fEa.exports = aCp;
  });
  var yEa = __commonJS((wJy, gEa) => {
    function lCp(e) {
      let t = e.regex;
      let n = {
        $pattern: /[A-Z]+|%/,
        keyword: ["THEN", "ELSE", "ENDIF", "IF", "GOTO", "DO", "WHILE", "WH", "END", "CALL", "SUB", "ENDSUB", "EQ", "NE", "LT", "GT", "LE", "GE", "AND", "OR", "XOR", "%"],
        built_in: ["ATAN", "ABS", "ACOS", "ASIN", "COS", "EXP", "FIX", "FUP", "ROUND", "LN", "SIN", "SQRT", "TAN", "EXISTS"]
      };
      let r = /\b/;
      function o(m, f) {
        if (m.index === 0) {
          return;
        }
        let h = m.input[m.index - 1];
        if (h >= "0" && h <= "9") {
          return;
        }
        if (h === "_") {
          return;
        }
        f.ignoreMatch();
      }
      let s = /[+-]?((\.\d+)|(\d+)(\.\d*)?)/;
      let i = /[GM]\s*\d+(\.\d+)?/;
      let a = /T\s*\d+/;
      let l = /O\s*\d+/;
      let c = /O<.+>/;
      let u = /[ABCUVWXYZ]\s*/;
      let d = /[FHIJKPQRS]\s*/;
      let p = [e.COMMENT(/\(/, /\)/), e.COMMENT(/;/, /$/), e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, e.C_NUMBER_MODE, {
        scope: "title.function",
        variants: [{
          match: t.concat(r, i)
        }, {
          begin: i,
          "on:begin": o
        }, {
          match: t.concat(r, a)
        }, {
          begin: a,
          "on:begin": o
        }]
      }, {
        scope: "symbol",
        variants: [{
          match: t.concat(r, l)
        }, {
          begin: l,
          "on:begin": o
        }, {
          match: t.concat(r, c)
        }, {
          begin: c,
          "on:begin": o
        }, {
          match: /\*\s*\d+\s*$/
        }]
      }, {
        scope: "operator",
        match: /^N\s*\d+/
      }, {
        scope: "variable",
        match: /-?#\s*\d+/
      }, {
        scope: "property",
        variants: [{
          match: t.concat(r, u, s)
        }, {
          begin: t.concat(u, s),
          "on:begin": o
        }]
      }, {
        scope: "params",
        variants: [{
          match: t.concat(r, d, s)
        }, {
          begin: t.concat(d, s),
          "on:begin": o
        }]
      }];
      return {
        name: "G-code (ISO 6983)",
        aliases: ["nc"],
        case_insensitive: true,
        disableAutodetect: true,
        keywords: n,
        contains: p
      };
    }
    gEa.exports = lCp;
  });
  var bEa = __commonJS((CJy, _Ea) => {
    function cCp(e) {
      return {
        name: "Gherkin",
        aliases: ["feature"],
        keywords: "Feature Background Ability Business Need Scenario Scenarios Scenario Outline Scenario Template Examples Given And Then But When",
        contains: [{
          className: "symbol",
          begin: "\\*",
          relevance: 0
        }, {
          className: "meta",
          begin: "@[^@\\s]+"
        }, {
          begin: "\\|",
          end: "\\|\\w*$",
          contains: [{
            className: "string",
            begin: "[^|]+"
          }]
        }, {
          className: "variable",
          begin: "<",
          end: ">"
        }, e.HASH_COMMENT_MODE, {
          className: "string",
          begin: '"""',
          end: '"""'
        }, e.QUOTE_STRING_MODE]
      };
    }
    _Ea.exports = cCp;
  });
  var TEa = __commonJS((RJy, SEa) => {
    function uCp(e) {
      return {
        name: "GLSL",
        keywords: {
          keyword: "break continue discard do else for if return while switch case default attribute binding buffer ccw centroid centroid varying coherent column_major const cw depth_any depth_greater depth_less depth_unchanged early_fragment_tests equal_spacing flat fractional_even_spacing fractional_odd_spacing highp in index inout invariant invocations isolines layout line_strip lines lines_adjacency local_size_x local_size_y local_size_z location lowp max_vertices mediump noperspective offset origin_upper_left out packed patch pixel_center_integer point_mode points precise precision quads r11f_g11f_b10f r16 r16_snorm r16f r16i r16ui r32f r32i r32ui r8 r8_snorm r8i r8ui readonly restrict rg16 rg16_snorm rg16f rg16i rg16ui rg32f rg32i rg32ui rg8 rg8_snorm rg8i rg8ui rgb10_a2 rgb10_a2ui rgba16 rgba16_snorm rgba16f rgba16i rgba16ui rgba32f rgba32i rgba32ui rgba8 rgba8_snorm rgba8i rgba8ui row_major sample shared smooth std140 std430 stream triangle_strip triangles triangles_adjacency uniform varying vertices volatile writeonly",
          type: "atomic_uint bool bvec2 bvec3 bvec4 dmat2 dmat2x2 dmat2x3 dmat2x4 dmat3 dmat3x2 dmat3x3 dmat3x4 dmat4 dmat4x2 dmat4x3 dmat4x4 double dvec2 dvec3 dvec4 float iimage1D iimage1DArray iimage2D iimage2DArray iimage2DMS iimage2DMSArray iimage2DRect iimage3D iimageBuffer iimageCube iimageCubeArray image1D image1DArray image2D image2DArray image2DMS image2DMSArray image2DRect image3D imageBuffer imageCube imageCubeArray int isampler1D isampler1DArray isampler2D isampler2DArray isampler2DMS isampler2DMSArray isampler2DRect isampler3D isamplerBuffer isamplerCube isamplerCubeArray ivec2 ivec3 ivec4 mat2 mat2x2 mat2x3 mat2x4 mat3 mat3x2 mat3x3 mat3x4 mat4 mat4x2 mat4x3 mat4x4 sampler1D sampler1DArray sampler1DArrayShadow sampler1DShadow sampler2D sampler2DArray sampler2DArrayShadow sampler2DMS sampler2DMSArray sampler2DRect sampler2DRectShadow sampler2DShadow sampler3D samplerBuffer samplerCube samplerCubeArray samplerCubeArrayShadow samplerCubeShadow image1D uimage1DArray uimage2D uimage2DArray uimage2DMS uimage2DMSArray uimage2DRect uimage3D uimageBuffer uimageCube uimageCubeArray uint usampler1D usampler1DArray usampler2D usampler2DArray usampler2DMS usampler2DMSArray usampler2DRect usampler3D samplerBuffer usamplerCube usamplerCubeArray uvec2 uvec3 uvec4 vec2 vec3 vec4 void",
          built_in: "gl_MaxAtomicCounterBindings gl_MaxAtomicCounterBufferSize gl_MaxClipDistances gl_MaxClipPlanes gl_MaxCombinedAtomicCounterBuffers gl_MaxCombinedAtomicCounters gl_MaxCombinedImageUniforms gl_MaxCombinedImageUnitsAndFragmentOutputs gl_MaxCombinedTextureImageUnits gl_MaxComputeAtomicCounterBuffers gl_MaxComputeAtomicCounters gl_MaxComputeImageUniforms gl_MaxComputeTextureImageUnits gl_MaxComputeUniformComponents gl_MaxComputeWorkGroupCount gl_MaxComputeWorkGroupSize gl_MaxDrawBuffers gl_MaxFragmentAtomicCounterBuffers gl_MaxFragmentAtomicCounters gl_MaxFragmentImageUniforms gl_MaxFragmentInputComponents gl_MaxFragmentInputVectors gl_MaxFragmentUniformComponents gl_MaxFragmentUniformVectors gl_MaxGeometryAtomicCounterBuffers gl_MaxGeometryAtomicCounters gl_MaxGeometryImageUniforms gl_MaxGeometryInputComponents gl_MaxGeometryOutputComponents gl_MaxGeometryOutputVertices gl_MaxGeometryTextureImageUnits gl_MaxGeometryTotalOutputComponents gl_MaxGeometryUniformComponents gl_MaxGeometryVaryingComponents gl_MaxImageSamples gl_MaxImageUnits gl_MaxLights gl_MaxPatchVertices gl_MaxProgramTexelOffset gl_MaxTessControlAtomicCounterBuffers gl_MaxTessControlAtomicCounters gl_MaxTessControlImageUniforms gl_MaxTessControlInputComponents gl_MaxTessControlOutputComponents gl_MaxTessControlTextureImageUnits gl_MaxTessControlTotalOutputComponents gl_MaxTessControlUniformComponents gl_MaxTessEvaluationAtomicCounterBuffers gl_MaxTessEvaluationAtomicCounters gl_MaxTessEvaluationImageUniforms gl_MaxTessEvaluationInputComponents gl_MaxTessEvaluationOutputComponents gl_MaxTessEvaluationTextureImageUnits gl_MaxTessEvaluationUniformComponents gl_MaxTessGenLevel gl_MaxTessPatchComponents gl_MaxTextureCoords gl_MaxTextureImageUnits gl_MaxTextureUnits gl_MaxVaryingComponents gl_MaxVaryingFloats gl_MaxVaryingVectors gl_MaxVertexAtomicCounterBuffers gl_MaxVertexAtomicCounters gl_MaxVertexAttribs gl_MaxVertexImageUniforms gl_MaxVertexOutputComponents gl_MaxVertexOutputVectors gl_MaxVertexTextureImageUnits gl_MaxVertexUniformComponents gl_MaxVertexUniformVectors gl_MaxViewports gl_MinProgramTexelOffset gl_BackColor gl_BackLightModelProduct gl_BackLightProduct gl_BackMaterial gl_BackSecondaryColor gl_ClipDistance gl_ClipPlane gl_ClipVertex gl_Color gl_DepthRange gl_EyePlaneQ gl_EyePlaneR gl_EyePlaneS gl_EyePlaneT gl_Fog gl_FogCoord gl_FogFragCoord gl_FragColor gl_FragCoord gl_FragData gl_FragDepth gl_FrontColor gl_FrontFacing gl_FrontLightModelProduct gl_FrontLightProduct gl_FrontMaterial gl_FrontSecondaryColor gl_GlobalInvocationID gl_InstanceID gl_InvocationID gl_Layer gl_LightModel gl_LightSource gl_LocalInvocationID gl_LocalInvocationIndex gl_ModelViewMatrix gl_ModelViewMatrixInverse gl_ModelViewMatrixInverseTranspose gl_ModelViewMatrixTranspose gl_ModelViewProjectionMatrix gl_ModelViewProjectionMatrixInverse gl_ModelViewProjectionMatrixInverseTranspose gl_ModelViewProjectionMatrixTranspose gl_MultiTexCoord0 gl_MultiTexCoord1 gl_MultiTexCoord2 gl_MultiTexCoord3 gl_MultiTexCoord4 gl_MultiTexCoord5 gl_MultiTexCoord6 gl_MultiTexCoord7 gl_Normal gl_NormalMatrix gl_NormalScale gl_NumSamples gl_NumWorkGroups gl_ObjectPlaneQ gl_ObjectPlaneR gl_ObjectPlaneS gl_ObjectPlaneT gl_PatchVerticesIn gl_Point gl_PointCoord gl_PointSize gl_Position gl_PrimitiveID gl_PrimitiveIDIn gl_ProjectionMatrix gl_ProjectionMatrixInverse gl_ProjectionMatrixInverseTranspose gl_ProjectionMatrixTranspose gl_SampleID gl_SampleMask gl_SampleMaskIn gl_SamplePosition gl_SecondaryColor gl_TessCoord gl_TessLevelInner gl_TessLevelOuter gl_TexCoord gl_TextureEnvColor gl_TextureMatrix gl_TextureMatrixInverse gl_TextureMatrixInverseTranspose gl_TextureMatrixTranspose gl_Vertex gl_VertexID gl_ViewportIndex gl_WorkGroupID gl_WorkGroupSize gl_in gl_out EmitStreamVertex EmitVertex EndPrimitive EndStreamPrimitive abs acos acosh all any asin asinh atan atanh atomicAdd atomicAnd atomicCompSwap atomicCounter atomicCounterDecrement atomicCounterIncrement atomicExchange atomicMax atomicMin atomicOr atomicXor barrier bitCount bitfieldExtract bitfieldInsert bitfieldReverse ceil clamp cos cosh cross dFdx dFdy degrees determinant distance dot equal exp exp2 faceforward findLSB findMSB floatBitsToInt floatBitsToUint floor fma fract frexp ftransform fwidth greaterThan greaterThanEqual groupMemoryBarrier imageAtomicAdd imageAtomicAnd imageAtomicCompSwap imageAtomicExchange imageAtomicMax imageAtomicMin imageAtomicOr imageAtomicXor imageLoad imageSize imageStore imulExtended intBitsToFloat interpolateAtCentroid interpolateAtOffset interpolateAtSample inverse inversesqrt isinf isnan ldexp length lessThan lessThanEqual log log2 matrixCompMult max memoryBarrier memoryBarrierAtomicCounter memoryBarrierBuffer memoryBarrierImage memoryBarrierShared min mix mod modf noise1 noise2 noise3 noise4 normalize not notEqual outerProduct packDouble2x32 packHalf2x16 packSnorm2x16 packSnorm4x8 packUnorm2x16 packUnorm4x8 pow radians reflect refract round roundEven shadow1D shadow1DLod shadow1DProj shadow1DProjLod shadow2D shadow2DLod shadow2DProj shadow2DProjLod sign sin sinh smoothstep sqrt step tan tanh texelFetch texelFetchOffset texture texture1D texture1DLod texture1DProj texture1DProjLod texture2D texture2DLod texture2DProj texture2DProjLod texture3D texture3DLod texture3DProj texture3DProjLod textureCube textureCubeLod textureGather textureGatherOffset textureGatherOffsets textureGrad textureGradOffset textureLod textureLodOffset textureOffset textureProj textureProjGrad textureProjGradOffset textureProjLod textureProjLodOffset textureProjOffset textureQueryLevels textureQueryLod textureSize transpose trunc uaddCarry uintBitsToFloat umulExtended unpackDouble2x32 unpackHalf2x16 unpackSnorm2x16 unpackSnorm4x8 unpackUnorm2x16 unpackUnorm4x8 usubBorrow",
          literal: "true false"
        },
        illegal: '"',
        contains: [e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, e.C_NUMBER_MODE, {
          className: "meta",
          begin: "#",
          end: "$"
        }]
      };
    }
    SEa.exports = uCp;
  });
  var vEa = __commonJS((xJy, EEa) => {
    function dCp(e) {
      return {
        name: "GML",
        case_insensitive: false,
        keywords: {
          keyword: ["#endregion", "#macro", "#region", "and", "begin", "break", "case", "constructor", "continue", "default", "delete", "div", "do", "else", "end", "enum", "exit", "for", "function", "globalvar", "if", "mod", "new", "not", "or", "repeat", "return", "static", "switch", "then", "until", "var", "while", "with", "xor"],
          built_in: ["abs", "alarm_get", "alarm_set", "angle_difference", "animcurve_channel_evaluate", "animcurve_channel_new", "animcurve_create", "animcurve_destroy", "animcurve_exists", "animcurve_get", "animcurve_get_channel", "animcurve_get_channel_index", "animcurve_point_new", "ansi_char", "application_get_position", "application_surface_draw_enable", "application_surface_enable", "application_surface_is_enabled", "arccos", "arcsin", "arctan", "arctan2", "array_all", "array_any", "array_concat", "array_contains", "array_contains_ext", "array_copy", "array_copy_while", "array_create", "array_create_ext", "array_delete", "array_equals", "array_filter", "array_filter_ext", "array_find_index", "array_first", "array_foreach", "array_get", "array_get_index", "array_insert", "array_intersection", "array_last", "array_length", "array_map", "array_map_ext", "array_pop", "array_push", "array_reduce", "array_resize", "array_reverse", "array_reverse_ext", "array_set", "array_shuffle", "array_shuffle_ext", "array_sort", "array_union", "array_unique", "array_unique_ext", "asset_add_tags", "asset_clear_tags", "asset_get_ids", "asset_get_index", "asset_get_tags", "asset_get_type", "asset_has_any_tag", "asset_has_tags", "asset_remove_tags", "audio_bus_clear_emitters", "audio_bus_create", "audio_bus_get_emitters", "audio_channel_num", "audio_create_buffer_sound", "audio_create_play_queue", "audio_create_stream", "audio_create_sync_group", "audio_debug", "audio_destroy_stream", "audio_destroy_sync_group", "audio_effect_create", "audio_emitter_bus", "audio_emitter_create", "audio_emitter_exists", "audio_emitter_falloff", "audio_emitter_free", "audio_emitter_gain", "audio_emitter_get_bus", "audio_emitter_get_gain", "audio_emitter_get_listener_mask", "audio_emitter_get_pitch", "audio_emitter_get_vx", "audio_emitter_get_vy", "audio_emitter_get_vz", "audio_emitter_get_x", "audio_emitter_get_y", "audio_emitter_get_z", "audio_emitter_pitch", "audio_emitter_position", "audio_emitter_set_listener_mask", "audio_emitter_velocity", "audio_exists", "audio_falloff_set_model", "audio_free_buffer_sound", "audio_free_play_queue", "audio_get_listener_count", "audio_get_listener_info", "audio_get_listener_mask", "audio_get_master_gain", "audio_get_name", "audio_get_recorder_count", "audio_get_recorder_info", "audio_get_type", "audio_group_get_assets", "audio_group_get_gain", "audio_group_is_loaded", "audio_group_load", "audio_group_load_progress", "audio_group_name", "audio_group_set_gain", "audio_group_stop_all", "audio_group_unload", "audio_is_paused", "audio_is_playing", "audio_listener_get_data", "audio_listener_orientation", "audio_listener_position", "audio_listener_set_orientation", "audio_listener_set_position", "audio_listener_set_velocity", "audio_listener_velocity", "audio_master_gain", "audio_pause_all", "audio_pause_sound", "audio_pause_sync_group", "audio_play_in_sync_group", "audio_play_sound", "audio_play_sound_at", "audio_play_sound_ext", "audio_play_sound_on", "audio_queue_sound", "audio_resume_all", "audio_resume_sound", "audio_resume_sync_group", "audio_set_listener_mask", "audio_set_master_gain", "audio_sound_gain", "audio_sound_get_audio_group", "audio_sound_get_gain", "audio_sound_get_listener_mask", "audio_sound_get_loop", "audio_sound_get_loop_end", "audio_sound_get_loop_start", "audio_sound_get_pitch", "audio_sound_get_track_position", "audio_sound_is_playable", "audio_sound_length", "audio_sound_loop", "audio_sound_loop_end", "audio_sound_loop_start", "audio_sound_pitch", "audio_sound_set_listener_mask", "audio_sound_set_track_position", "audio_start_recording", "audio_start_sync_group", "audio_stop_all", "audio_stop_recording", "audio_stop_sound", "audio_stop_sync_group", "audio_sync_group_debug", "audio_sync_group_get_track_pos", "audio_sync_group_is_paused", "audio_sync_group_is_playing", "audio_system_is_available", "audio_system_is_initialised", "base64_decode", "base64_encode", "bool", "browser_input_capture", "buffer_async_group_begin", "buffer_async_group_end", "buffer_async_group_option", "buffer_base64_decode", "buffer_base64_decode_ext", "buffer_base64_encode", "buffer_compress", "buffer_copy", "buffer_copy_from_vertex_buffer", "buffer_copy_stride", "buffer_crc32", "buffer_create", "buffer_create_from_vertex_buffer", "buffer_create_from_vertex_buffer_ext", "buffer_decompress", "buffer_delete", "buffer_exists", "buffer_fill", "buffer_get_address", "buffer_get_alignment", "buffer_get_size", "buffer_get_surface", "buffer_get_type", "buffer_load", "buffer_load_async", "buffer_load_ext", "buffer_load_partial", "buffer_md5", "buffer_peek", "buffer_poke", "buffer_read", "buffer_resize", "buffer_save", "buffer_save_async", "buffer_save_ext", "buffer_seek", "buffer_set_surface", "buffer_set_used_size", "buffer_sha1", "buffer_sizeof", "buffer_tell", "buffer_write", "call_cancel", "call_later", "camera_apply", "camera_copy_transforms", "camera_create", "camera_create_view", "camera_destroy", "camera_get_active", "camera_get_begin_script", "camera_get_default", "camera_get_end_script", "camera_get_proj_mat", "camera_get_update_script", "camera_get_view_angle", "camera_get_view_border_x", "camera_get_view_border_y", "camera_get_view_height", "camera_get_view_mat", "camera_get_view_speed_x", "camera_get_view_speed_y", "camera_get_view_target", "camera_get_view_width", "camera_get_view_x", "camera_get_view_y", "camera_set_begin_script", "camera_set_default", "camera_set_end_script", "camera_set_proj_mat", "camera_set_update_script", "camera_set_view_angle", "camera_set_view_border", "camera_set_view_mat", "camera_set_view_pos", "camera_set_view_size", "camera_set_view_speed", "camera_set_view_target", "ceil", "choose", "chr", "clamp", "clickable_add", "clickable_add_ext", "clickable_change", "clickable_change_ext", "clickable_delete", "clickable_exists", "clickable_set_style", "clipboard_get_text", "clipboard_has_text", "clipboard_set_text", "cloud_file_save", "cloud_string_save", "cloud_synchronise", "code_is_compiled", "collision_circle", "collision_circle_list", "collision_ellipse", "collision_ellipse_list", "collision_line", "collision_line_list", "collision_point", "collision_point_list", "collision_rectangle", "collision_rectangle_list", "color_get_blue", "color_get_green", "color_get_hue", "color_get_red", "color_get_saturation", "color_get_value", "colour_get_blue", "colour_get_green", "colour_get_hue", "colour_get_red", "colour_get_saturation", "colour_get_value", "cos", "darccos", "darcsin", "darctan", "darctan2", "date_compare_date", "date_compare_datetime", "date_compare_time", "date_create_datetime", "date_current_datetime", "date_date_of", "date_date_string", "date_datetime_string", "date_day_span", "date_days_in_month", "date_days_in_year", "date_get_day", "date_get_day_of_year", "date_get_hour", "date_get_hour_of_year", "date_get_minute", "date_get_minute_of_year", "date_get_month", "date_get_second", "date_get_second_of_year", "date_get_timezone", "date_get_week", "date_get_weekday", "date_get_year", "date_hour_span", "date_inc_day", "date_inc_hour", "date_inc_minute", "date_inc_month", "date_inc_second", "date_inc_week", "date_inc_year", "date_is_today", "date_leap_year", "date_minute_span", "date_month_span", "date_second_span", "date_set_timezone", "date_time_of", "date_time_string", "date_valid_datetime", "date_week_span", "date_year_span", "db_to_lin", "dbg_add_font_glyphs", "dbg_button", "dbg_checkbox", "dbg_color", "dbg_colour", "dbg_drop_down", "dbg_same_line", "dbg_section", "dbg_section_delete", "dbg_section_exists", "dbg_slider", "dbg_slider_int", "dbg_sprite", "dbg_text", "dbg_text_input", "dbg_view", "dbg_view_delete", "dbg_view_exists", "dbg_watch", "dcos", "debug_event", "debug_get_callstack", "degtorad", "device_get_tilt_x", "device_get_tilt_y", "device_get_tilt_z", "device_is_keypad_open", "device_mouse_check_button", "device_mouse_check_button_pressed", "device_mouse_check_button_released", "device_mouse_dbclick_enable", "device_mouse_raw_x", "device_mouse_raw_y", "device_mouse_x", "device_mouse_x_to_gui", "device_mouse_y", "device_mouse_y_to_gui", "directory_create", "directory_destroy", "directory_exists", "display_get_dpi_x", "display_get_dpi_y", "display_get_frequency", "display_get_gui_height", "display_get_gui_width", "display_get_height", "display_get_orientation", "display_get_sleep_margin", "display_get_timing_method", "display_get_width", "display_mouse_get_x", "display_mouse_get_y", "display_mouse_set", "display_reset", "display_set_gui_maximise", "display_set_gui_maximize", "display_set_gui_size", "display_set_sleep_margin", "display_set_timing_method", "display_set_ui_visibility", "distance_to_object", "distance_to_point", "dot_product", "dot_product_3d", "dot_product_3d_normalised", "dot_product_3d_normalized", "dot_product_normalised", "dot_product_normalized", "draw_arrow", "draw_button", "draw_circle", "draw_circle_color", "draw_circle_colour", "draw_clear", "draw_clear_alpha", "draw_ellipse", "draw_ellipse_color", "draw_ellipse_colour", "draw_enable_drawevent", "draw_enable_skeleton_blendmodes", "draw_enable_swf_aa", "draw_flush", "draw_get_alpha", "draw_get_color", "draw_get_colour", "draw_get_enable_skeleton_blendmodes", "draw_get_font", "draw_get_halign", "draw_get_lighting", "draw_get_swf_aa_level", "draw_get_valign", "draw_getpixel", "draw_getpixel_ext", "draw_healthbar", "draw_highscore", "draw_light_define_ambient", "draw_light_define_direction", "draw_light_define_point", "draw_light_enable", "draw_light_get", "draw_light_get_ambient", "draw_line", "draw_line_color", "draw_line_colour", "draw_line_width", "draw_line_width_color", "draw_line_width_colour", "draw_path", "draw_point", "draw_point_color", "draw_point_colour", "draw_primitive_begin", "draw_primitive_begin_texture", "draw_primitive_end", "draw_rectangle", "draw_rectangle_color", "draw_rectangle_colour", "draw_roundrect", "draw_roundrect_color", "draw_roundrect_color_ext", "draw_roundrect_colour", "draw_roundrect_colour_ext", "draw_roundrect_ext", "draw_self", "draw_set_alpha", "draw_set_circle_precision", "draw_set_color", "draw_set_colour", "draw_set_font", "draw_set_halign", "draw_set_lighting", "draw_set_swf_aa_level", "draw_set_valign", "draw_skeleton", "draw_skeleton_collision", "draw_skeleton_instance", "draw_skeleton_time", "draw_sprite", "draw_sprite_ext", "draw_sprite_general", "draw_sprite_part", "draw_sprite_part_ext", "draw_sprite_pos", "draw_sprite_stretched", "draw_sprite_stretched_ext", "draw_sprite_tiled", "draw_sprite_tiled_ext", "draw_surface", "draw_surface_ext", "draw_surface_general", "draw_surface_part", "draw_surface_part_ext", "draw_surface_stretched", "draw_surface_stretched_ext", "draw_surface_tiled", "draw_surface_tiled_ext", "draw_text", "draw_text_color", "draw_text_colour", "draw_text_ext", "draw_text_ext_color", "draw_text_ext_colour", "draw_text_ext_transformed", "draw_text_ext_transformed_color", "draw_text_ext_transformed_colour", "draw_text_transformed", "draw_text_transformed_color", "draw_text_transformed_colour", "draw_texture_flush", "draw_tile", "draw_tilemap", "draw_triangle", "draw_triangle_color", "draw_triangle_colour", "draw_vertex", "draw_vertex_color", "draw_vertex_colour", "draw_vertex_texture", "draw_vertex_texture_color", "draw_vertex_texture_colour", "ds_exists", "ds_grid_add", "ds_grid_add_disk", "ds_grid_add_grid_region", "ds_grid_add_region", "ds_grid_clear", "ds_grid_copy", "ds_grid_create", "ds_grid_destroy", "ds_grid_get", "ds_grid_get_disk_max", "ds_grid_get_disk_mean", "ds_grid_get_disk_min", "ds_grid_get_disk_sum", "ds_grid_get_max", "ds_grid_get_mean", "ds_grid_get_min", "ds_grid_get_sum", "ds_grid_height", "ds_grid_multiply", "ds_grid_multiply_disk", "ds_grid_multiply_grid_region", "ds_grid_multiply_region", "ds_grid_read", "ds_grid_resize", "ds_grid_set", "ds_grid_set_disk", "ds_grid_set_grid_region", "ds_grid_set_region", "ds_grid_shuffle", "ds_grid_sort", "ds_grid_to_mp_grid", "ds_grid_value_disk_exists", "ds_grid_value_disk_x", "ds_grid_value_disk_y", "ds_grid_value_exists", "ds_grid_value_x", "ds_grid_value_y", "ds_grid_width", "ds_grid_write", "ds_list_add", "ds_list_clear", "ds_list_copy", "ds_list_create", "ds_list_delete", "ds_list_destroy", "ds_list_empty", "ds_list_find_index", "ds_list_find_value", "ds_list_insert", "ds_list_is_list", "ds_list_is_map", "ds_list_mark_as_list", "ds_list_mark_as_map", "ds_list_read", "ds_list_replace", "ds_list_set", "ds_list_shuffle", "ds_list_size", "ds_list_sort", "ds_list_write", "ds_map_add", "ds_map_add_list", "ds_map_add_map", "ds_map_clear", "ds_map_copy", "ds_map_create", "ds_map_delete", "ds_map_destroy", "ds_map_empty", "ds_map_exists", "ds_map_find_first", "ds_map_find_last", "ds_map_find_next", "ds_map_find_previous", "ds_map_find_value", "ds_map_is_list", "ds_map_is_map", "ds_map_keys_to_array", "ds_map_read", "ds_map_replace", "ds_map_replace_list", "ds_map_replace_map", "ds_map_secure_load", "ds_map_secure_load_buffer", "ds_map_secure_save", "ds_map_secure_save_buffer", "ds_map_set", "ds_map_size", "ds_map_values_to_array", "ds_map_write", "ds_priority_add", "ds_priority_change_priority", "ds_priority_clear", "ds_priority_copy", "ds_priority_create", "ds_priority_delete_max", "ds_priority_delete_min", "ds_priority_delete_value", "ds_priority_destroy", "ds_priority_empty", "ds_priority_find_max", "ds_priority_find_min", "ds_priority_find_priority", "ds_priority_read", "ds_priority_size", "ds_priority_write", "ds_queue_clear", "ds_queue_copy", "ds_queue_create", "ds_queue_dequeue", "ds_queue_destroy", "ds_queue_empty", "ds_queue_enqueue", "ds_queue_head", "ds_queue_read", "ds_queue_size", "ds_queue_tail", "ds_queue_write", "ds_set_precision", "ds_stack_clear", "ds_stack_copy", "ds_stack_create", "ds_stack_destroy", "ds_stack_empty", "ds_stack_pop", "ds_stack_push", "ds_stack_read", "ds_stack_size", "ds_stack_top", "ds_stack_write", "dsin", "dtan", "effect_clear", "effect_create_above", "effect_create_below", "effect_create_depth", "effect_create_layer", "environment_get_variable", "event_inherited", "event_perform", "event_perform_async", "event_perform_object", "event_user", "exception_unhandled_handler", "exp", "extension_exists", "extension_get_option_count", "extension_get_option_names", "extension_get_option_value", "extension_get_options", "extension_get_version", "external_call", "external_define", "external_free", "file_attributes", "file_bin_close", "file_bin_open", "file_bin_position", "file_bin_read_byte", "file_bin_rewrite", "file_bin_seek", "file_bin_size", "file_bin_write_byte", "file_copy", "file_delete", "file_exists", "file_find_close", "file_find_first", "file_find_next", "file_rename", "file_text_close", "file_text_eof", "file_text_eoln", "file_text_open_append", "file_text_open_from_string", "file_text_open_read", "file_text_open_write", "file_text_read_real", "file_text_read_string", "file_text_readln", "file_text_write_real", "file_text_write_string", "file_text_writeln", "filename_change_ext", "filename_dir", "filename_drive", "filename_ext", "filename_name", "filename_path", "floor", "font_add", "font_add_enable_aa", "font_add_get_enable_aa", "font_add_sprite", "font_add_sprite_ext", "font_cache_glyph", "font_delete", "font_enable_effects", "font_enable_sdf", "font_exists", "font_get_bold", "font_get_first", "font_get_fontname", "font_get_info", "font_get_italic", "font_get_last", "font_get_name", "font_get_sdf_enabled", "font_get_sdf_spread", "font_get_size", "font_get_texture", "font_get_uvs", "font_replace_sprite", "font_replace_sprite_ext", "font_sdf_spread", "font_set_cache_size", "frac", "fx_create", "fx_get_name", "fx_get_parameter", "fx_get_parameter_names", "fx_get_parameters", "fx_get_single_layer", "fx_set_parameter", "fx_set_parameters", "fx_set_single_layer", "game_change", "game_end", "game_get_speed", "game_load", "game_load_buffer", "game_restart", "game_save", "game_save_buffer", "game_set_speed", "gamepad_axis_count", "gamepad_axis_value", "gamepad_button_check", "gamepad_button_check_pressed", "gamepad_button_check_released", "gamepad_button_count", "gamepad_button_value", "gamepad_get_axis_deadzone", "gamepad_get_button_threshold", "gamepad_get_description", "gamepad_get_device_count", "gamepad_get_guid", "gamepad_get_mapping", "gamepad_get_option", "gamepad_hat_count", "gamepad_hat_value", "gamepad_is_connected", "gamepad_is_supported", "gamepad_remove_mapping", "gamepad_set_axis_deadzone", "gamepad_set_button_threshold", "gamepad_set_color", "gamepad_set_colour", "gamepad_set_option", "gamepad_set_vibration", "gamepad_test_mapping", "gc_collect", "gc_enable", "gc_get_stats", "gc_get_target_frame_time", "gc_is_enabled", "gc_target_frame_time", "gesture_double_tap_distance", "gesture_double_tap_time", "gesture_drag_distance", "gesture_drag_time", "gesture_flick_speed", "gesture_get_double_tap_distance", "gesture_get_double_tap_time", "gesture_get_drag_distance", "gesture_get_drag_time", "gesture_get_flick_speed", "gesture_get_pinch_angle_away", "gesture_get_pinch_angle_towards", "gesture_get_pinch_distance", "gesture_get_rotate_angle", "gesture_get_rotate_time", "gesture_get_tap_count", "gesture_pinch_angle_away", "gesture_pinch_angle_towards", "gesture_pinch_distance", "gesture_rotate_angle", "gesture_rotate_time", "gesture_tap_count", "get_integer", "get_integer_async", "get_login_async", "get_open_filename", "get_open_filename_ext", "get_save_filename", "get_save_filename_ext", "get_string", "get_string_async", "get_timer", "gif_add_surface", "gif_open", "gif_save", "gif_save_buffer", "gml_pragma", "gml_release_mode", "gpu_get_alphatestenable", "gpu_get_alphatestref", "gpu_get_blendenable", "gpu_get_blendmode", "gpu_get_blendmode_dest", "gpu_get_blendmode_destalpha", "gpu_get_blendmode_ext", "gpu_get_blendmode_ext_sepalpha", "gpu_get_blendmode_src", "gpu_get_blendmode_srcalpha", "gpu_get_colorwriteenable", "gpu_get_colourwriteenable", "gpu_get_cullmode", "gpu_get_depth", "gpu_get_fog", "gpu_get_state", "gpu_get_tex_filter", "gpu_get_tex_filter_ext", "gpu_get_tex_max_aniso", "gpu_get_tex_max_aniso_ext", "gpu_get_tex_max_mip", "gpu_get_tex_max_mip_ext", "gpu_get_tex_min_mip", "gpu_get_tex_min_mip_ext", "gpu_get_tex_mip_bias", "gpu_get_tex_mip_bias_ext", "gpu_get_tex_mip_enable", "gpu_get_tex_mip_enable_ext", "gpu_get_tex_mip_filter", "gpu_get_tex_mip_filter_ext", "gpu_get_tex_repeat", "gpu_get_tex_repeat_ext", "gpu_get_texfilter", "gpu_get_texfilter_ext", "gpu_get_texrepeat", "gpu_get_texrepeat_ext", "gpu_get_zfunc", "gpu_get_ztestenable", "gpu_get_zwriteenable", "gpu_pop_state", "gpu_push_state", "gpu_set_alphatestenable", "gpu_set_alphatestref", "gpu_set_blendenable", "gpu_set_blendmode", "gpu_set_blendmode_ext", "gpu_set_blendmode_ext_sepalpha", "gpu_set_colorwriteenable", "gpu_set_colourwriteenable", "gpu_set_cullmode", "gpu_set_depth", "gpu_set_fog", "gpu_set_state", "gpu_set_tex_filter", "gpu_set_tex_filter_ext", "gpu_set_tex_max_aniso", "gpu_set_tex_max_aniso_ext", "gpu_set_tex_max_mip", "gpu_set_tex_max_mip_ext", "gpu_set_tex_min_mip", "gpu_set_tex_min_mip_ext", "gpu_set_tex_mip_bias", "gpu_set_tex_mip_bias_ext", "gpu_set_tex_mip_enable", "gpu_set_tex_mip_enable_ext", "gpu_set_tex_mip_filter", "gpu_set_tex_mip_filter_ext", "gpu_set_tex_repeat", "gpu_set_tex_repeat_ext", "gpu_set_texfilter", "gpu_set_texfilter_ext", "gpu_set_texrepeat", "gpu_set_texrepeat_ext", "gpu_set_zfunc", "gpu_set_ztestenable", "gpu_set_zwriteenable", "handle_parse", "highscore_add", "highscore_clear", "highscore_name", "highscore_value", "http_get", "http_get_file", "http_get_request_crossorigin", "http_post_string", "http_request", "http_set_request_crossorigin", "iap_acquire", "iap_activate", "iap_consume", "iap_enumerate_products", "iap_product_details", "iap_purchase_details", "iap_restore_all", "iap_status", "ini_close", "ini_key_delete", "ini_key_exists", "ini_open", "ini_open_from_string", "ini_read_real", "ini_read_string", "ini_section_delete", "ini_section_exists", "ini_write_real", "ini_write_string", "instance_activate_all", "instance_activate_layer", "instance_activate_object", "instance_activate_region", "instance_change", "instance_copy", "instance_create_depth", "instance_create_layer", "instance_deactivate_all", "instance_deactivate_layer", "instance_deactivate_object", "instance_deactivate_region", "instance_destroy", "instance_exists", "instance_find", "instance_furthest", "instance_id_get", "instance_nearest", "instance_number", "instance_place", "instance_place_list", "instance_position", "instance_position_list", "instanceof", "int64", "io_clear", "irandom", "irandom_range", "is_array", "is_bool", "is_callable", "is_debug_overlay_open", "is_handle", "is_infinity", "is_instanceof", "is_int32", "is_int64", "is_keyboard_used_debug_overlay", "is_method", "is_mouse_over_debug_overlay", "is_nan", "is_numeric", "is_ptr", "is_real", "is_string", "is_struct", "is_undefined", "json_decode", "json_encode", "json_parse", "json_stringify", "keyboard_check", "keyboard_check_direct", "keyboard_check_pressed", "keyboard_check_released", "keyboard_clear", "keyboard_get_map", "keyboard_get_numlock", "keyboard_key_press", "keyboard_key_release", "keyboard_set_map", "keyboard_set_numlock", "keyboard_unset_map", "keyboard_virtual_height", "keyboard_virtual_hide", "keyboard_virtual_show", "keyboard_virtual_status", "layer_add_instance", "layer_background_alpha", "layer_background_blend", "layer_background_change", "layer_background_create", "layer_background_destroy", "layer_background_exists", "layer_background_get_alpha", "layer_background_get_blend", "layer_background_get_htiled", "layer_background_get_id", "layer_background_get_index", "layer_background_get_speed", "layer_background_get_sprite", "layer_background_get_stretch", "layer_background_get_visible", "layer_background_get_vtiled", "layer_background_get_xscale", "layer_background_get_yscale", "layer_background_htiled", "layer_background_index", "layer_background_speed", "layer_background_sprite", "layer_background_stretch", "layer_background_visible", "layer_background_vtiled", "layer_background_xscale", "layer_background_yscale", "layer_clear_fx", "layer_create", "layer_depth", "layer_destroy", "layer_destroy_instances", "layer_element_move", "layer_enable_fx", "layer_exists", "layer_force_draw_depth", "layer_fx_is_enabled", "layer_get_all", "layer_get_all_elements", "layer_get_depth", "layer_get_element_layer", "layer_get_element_type", "layer_get_forced_depth", "layer_get_fx", "layer_get_hspeed", "layer_get_id", "layer_get_id_at_depth", "layer_get_name", "layer_get_script_begin", "layer_get_script_end", "layer_get_shader", "layer_get_target_room", "layer_get_visible", "layer_get_vspeed", "layer_get_x", "layer_get_y", "layer_has_instance", "layer_hspeed", "layer_instance_get_instance", "layer_is_draw_depth_forced", "layer_reset_target_room", "layer_script_begin", "layer_script_end", "layer_sequence_angle", "layer_sequence_create", "layer_sequence_destroy", "layer_sequence_exists", "layer_sequence_get_angle", "layer_sequence_get_headdir", "layer_sequence_get_headpos", "layer_sequence_get_instance", "layer_sequence_get_length", "layer_sequence_get_sequence", "layer_sequence_get_speedscale", "layer_sequence_get_x", "layer_sequence_get_xscale", "layer_sequence_get_y", "layer_sequence_get_yscale", "layer_sequence_headdir", "layer_sequence_headpos", "layer_sequence_is_finished", "layer_sequence_is_paused", "layer_sequence_pause", "layer_sequence_play", "layer_sequence_speedscale", "layer_sequence_x", "layer_sequence_xscale", "layer_sequence_y", "layer_sequence_yscale", "layer_set_fx", "layer_set_target_room", "layer_set_visible", "layer_shader", "layer_sprite_alpha", "layer_sprite_angle", "layer_sprite_blend", "layer_sprite_change", "layer_sprite_create", "layer_sprite_destroy", "layer_sprite_exists", "layer_sprite_get_alpha", "layer_sprite_get_angle", "layer_sprite_get_blend", "layer_sprite_get_id", "layer_sprite_get_index", "layer_sprite_get_speed", "layer_sprite_get_sprite", "layer_sprite_get_x", "layer_sprite_get_xscale", "layer_sprite_get_y", "layer_sprite_get_yscale", "layer_sprite_index", "layer_sprite_speed", "layer_sprite_x", "layer_sprite_xscale", "layer_sprite_y", "layer_sprite_yscale", "layer_tile_alpha", "layer_tile_blend", "layer_tile_change", "layer_tile_create", "layer_tile_destroy", "layer_tile_exists", "layer_tile_get_alpha", "layer_tile_get_blend", "layer_tile_get_region", "layer_tile_get_sprite", "layer_tile_get_visible", "layer_tile_get_x", "layer_tile_get_xscale", "layer_tile_get_y", "layer_tile_get_yscale", "layer_tile_region", "layer_tile_visible", "layer_tile_x", "layer_tile_xscale", "layer_tile_y", "layer_tile_yscale", "layer_tilemap_create", "layer_tilemap_destroy", "layer_tilemap_exists", "layer_tilemap_get_id", "layer_vspeed", "layer_x", "layer_y", "lengthdir_x", "lengthdir_y", "lerp", "lin_to_db", "ln", "load_csv", "log10", "log2", "logn", "make_color_hsv", "make_color_rgb", "make_colour_hsv", "make_colour_rgb", "math_get_epsilon", "math_set_epsilon", "matrix_build", "matrix_build_identity", "matrix_build_lookat", "matrix_build_projection_ortho", "matrix_build_projection_perspective", "matrix_build_projection_perspective_fov", "matrix_get", "matrix_multiply", "matrix_set", "matrix_stack_clear", "matrix_stack_is_empty", "matrix_stack_pop", "matrix_stack_push", "matrix_stack_set", "matrix_stack_top", "matrix_transform_vertex", "max", "md5_file", "md5_string_unicode", "md5_string_utf8", "mean", "median", "merge_color", "merge_colour", "method", "method_call", "method_get_index", "method_get_self", "min", "motion_add", "motion_set", "mouse_check_button", "mouse_check_button_pressed", "mouse_check_button_released", "mouse_clear", "mouse_wheel_down", "mouse_wheel_up", "move_and_collide", "move_bounce_all", "move_bounce_solid", "move_contact_all", "move_contact_solid", "move_outside_all", "move_outside_solid", "move_random", "move_snap", "move_towards_point", "move_wrap", "mp_grid_add_cell", "mp_grid_add_instances", "mp_grid_add_rectangle", "mp_grid_clear_all", "mp_grid_clear_cell", "mp_grid_clear_rectangle", "mp_grid_create", "mp_grid_destroy", "mp_grid_draw", "mp_grid_get_cell", "mp_grid_path", "mp_grid_to_ds_grid", "mp_linear_path", "mp_linear_path_object", "mp_linear_step", "mp_linear_step_object", "mp_potential_path", "mp_potential_path_object", "mp_potential_settings", "mp_potential_step", "mp_potential_step_object", "nameof", "network_connect", "network_connect_async", "network_connect_raw", "network_connect_raw_async", "network_create_server", "network_create_server_raw", "network_create_socket", "network_create_socket_ext", "network_destroy", "network_resolve", "network_send_broadcast", "network_send_packet", "network_send_raw", "network_send_udp", "network_send_udp_raw", "network_set_config", "network_set_timeout", "object_exists", "object_get_mask", "object_get_name", "object_get_parent", "object_get_persistent", "object_get_physics", "object_get_solid", "object_get_sprite", "object_get_visible", "object_is_ancestor", "object_set_mask", "object_set_persistent", "object_set_solid", "object_set_sprite", "object_set_visible", "ord", "os_check_permission", "os_get_config", "os_get_info", "os_get_language", "os_get_region", "os_is_network_connected", "os_is_paused", "os_lock_orientation", "os_powersave_enable", "os_request_permission", "os_set_orientation_lock", "parameter_count", "parameter_string", "part_emitter_burst", "part_emitter_clear", "part_emitter_create", "part_emitter_delay", "part_emitter_destroy", "part_emitter_destroy_all", "part_emitter_enable", "part_emitter_exists", "part_emitter_interval", "part_emitter_region", "part_emitter_relative", "part_emitter_stream", "part_particles_burst", "part_particles_clear", "part_particles_count", "part_particles_create", "part_particles_create_color", "part_particles_create_colour", "part_system_angle", "part_system_automatic_draw", "part_system_automatic_update", "part_system_clear", "part_system_color", "part_system_colour", "part_system_create", "part_system_create_layer", "part_system_depth", "part_system_destroy", "part_system_draw_order", "part_system_drawit", "part_system_exists", "part_system_get_info", "part_system_get_layer", "part_system_global_space", "part_system_layer", "part_system_position", "part_system_update", "part_type_alpha1", "part_type_alpha2", "part_type_alpha3", "part_type_blend", "part_type_clear", "part_type_color1", "part_type_color2", "part_type_color3", "part_type_color_hsv", "part_type_color_mix", "part_type_color_rgb", "part_type_colour1", "part_type_colour2", "part_type_colour3", "part_type_colour_hsv", "part_type_colour_mix", "part_type_colour_rgb", "part_type_create", "part_type_death", "part_type_destroy", "part_type_direction", "part_type_exists", "part_type_gravity", "part_type_life", "part_type_orientation", "part_type_scale", "part_type_shape", "part_type_size", "part_type_size_x", "part_type_size_y", "part_type_speed", "part_type_sprite", "part_type_step", "part_type_subimage", "particle_exists", "particle_get_info", "path_add", "path_add_point", "path_append", "path_assign", "path_change_point", "path_clear_points", "path_delete", "path_delete_point", "path_duplicate", "path_end", "path_exists", "path_flip", "path_get_closed", "path_get_kind", "path_get_length", "path_get_name", "path_get_number", "path_get_point_speed", "path_get_point_x", "path_get_point_y", "path_get_precision", "path_get_speed", "path_get_x", "path_get_y", "path_insert_point", "path_mirror", "path_rescale", "path_reverse", "path_rotate", "path_set_closed", "path_set_kind", "path_set_precision", "path_shift", "path_start", "physics_apply_angular_impulse", "physics_apply_force", "physics_apply_impulse", "physics_apply_local_force", "physics_apply_local_impulse", "physics_apply_torque", "physics_draw_debug", "physics_fixture_add_point", "physics_fixture_bind", "physics_fixture_bind_ext", "physics_fixture_create", "physics_fixture_delete", "physics_fixture_set_angular_damping", "physics_fixture_set_awake", "physics_fixture_set_box_shape", "physics_fixture_set_chain_shape", "physics_fixture_set_circle_shape", "physics_fixture_set_collision_group", "physics_fixture_set_density", "physics_fixture_set_edge_shape", "physics_fixture_set_friction", "physics_fixture_set_kinematic", "physics_fixture_set_linear_damping", "physics_fixture_set_polygon_shape", "physics_fixture_set_restitution", "physics_fixture_set_sensor", "physics_get_density", "physics_get_friction", "physics_get_restitution", "physics_joint_delete", "physics_joint_distance_create", "physics_joint_enable_motor", "physics_joint_friction_create", "physics_joint_gear_create", "physics_joint_get_value", "physics_joint_prismatic_create", "physics_joint_pulley_create", "physics_joint_revolute_create", "physics_joint_rope_create", "physics_joint_set_value", "physics_joint_weld_create", "physics_joint_wheel_create", "physics_mass_properties", "physics_particle_count", "physics_particle_create", "physics_particle_delete", "physics_particle_delete_region_box", "physics_particle_delete_region_circle", "physics_particle_delete_region_poly", "physics_particle_draw", "physics_particle_draw_ext", "physics_particle_get_damping", "physics_particle_get_data", "physics_particle_get_data_particle", "physics_particle_get_density", "physics_particle_get_gravity_scale", "physics_particle_get_group_flags", "physics_particle_get_max_count", "physics_particle_get_radius", "physics_particle_group_add_point", "physics_particle_group_begin", "physics_particle_group_box", "physics_particle_group_circle", "physics_particle_group_count", "physics_particle_group_delete", "physics_particle_group_end", "physics_particle_group_get_ang_vel", "physics_particle_group_get_angle", "physics_particle_group_get_centre_x", "physics_particle_group_get_centre_y", "physics_particle_group_get_data", "physics_particle_group_get_inertia", "physics_particle_group_get_mass", "physics_particle_group_get_vel_x", "physics_particle_group_get_vel_y", "physics_particle_group_get_x", "physics_particle_group_get_y", "physics_particle_group_join", "physics_particle_group_polygon", "physics_particle_set_category_flags", "physics_particle_set_damping", "physics_particle_set_density", "physics_particle_set_flags", "physics_particle_set_gravity_scale", "physics_particle_set_group_flags", "physics_particle_set_max_count", "physics_particle_set_radius", "physics_pause_enable", "physics_remove_fixture", "physics_set_density", "physics_set_friction", "physics_set_restitution", "physics_test_overlap", "physics_world_create", "physics_world_draw_debug", "physics_world_gravity", "physics_world_update_iterations", "physics_world_update_speed", "place_empty", "place_free", "place_meeting", "place_snapped", "point_direction", "point_distance", "point_distance_3d", "point_in_circle", "point_in_rectangle", "point_in_triangle", "position_change", "position_destroy", "position_empty", "position_meeting", "power", "ptr", "radtodeg", "random", "random_get_seed", "random_range", "random_set_seed", "randomise", "randomize", "real", "rectangle_in_circle", "rectangle_in_rectangle", "rectangle_in_triangle", "ref_create", "rollback_chat", "rollback_create_game", "rollback_define_extra_network_latency", "rollback_define_input", "rollback_define_input_frame_delay", "rollback_define_mock_input", "rollback_define_player", "rollback_display_events", "rollback_get_info", "rollback_get_input", "rollback_get_player_prefs", "rollback_join_game", "rollback_leave_game", "rollback_set_player_prefs", "rollback_start_game", "rollback_sync_on_frame", "rollback_use_late_join", "rollback_use_manual_start", "rollback_use_player_prefs", "rollback_use_random_input", "room_add", "room_assign", "room_duplicate", "room_exists", "room_get_camera", "room_get_info", "room_get_name", "room_get_viewport", "room_goto", "room_goto_next", "room_goto_previous", "room_instance_add", "room_instance_clear", "room_next", "room_previous", "room_restart", "room_set_camera", "room_set_height", "room_set_persistent", "room_set_view_enabled", "room_set_viewport", "room_set_width", "round", "scheduler_resolution_get", "scheduler_resolution_set", "screen_save", "screen_save_part", "script_execute", "script_execute_ext", "script_exists", "script_get_name", "sequence_create", "sequence_destroy", "sequence_exists", "sequence_get", "sequence_get_objects", "sequence_instance_override_object", "sequence_keyframe_new", "sequence_keyframedata_new", "sequence_track_new", "sha1_file", "sha1_string_unicode", "sha1_string_utf8", "shader_current", "shader_enable_corner_id", "shader_get_name", "shader_get_sampler_index", "shader_get_uniform", "shader_is_compiled", "shader_reset", "shader_set", "shader_set_uniform_f", "shader_set_uniform_f_array", "shader_set_uniform_f_buffer", "shader_set_uniform_i", "shader_set_uniform_i_array", "shader_set_uniform_matrix", "shader_set_uniform_matrix_array", "shaders_are_supported", "shop_leave_rating", "show_debug_message", "show_debug_message_ext", "show_debug_overlay", "show_error", "show_message", "show_message_async", "show_question", "show_question_async", "sign", "sin", "skeleton_animation_clear", "skeleton_animation_get", "skeleton_animation_get_duration", "skeleton_animation_get_event_frames", "skeleton_animation_get_ext", "skeleton_animation_get_frame", "skeleton_animation_get_frames", "skeleton_animation_get_position", "skeleton_animation_is_finished", "skeleton_animation_is_looping", "skeleton_animation_list", "skeleton_animation_mix", "skeleton_animation_set", "skeleton_animation_set_ext", "skeleton_animation_set_frame", "skeleton_animation_set_position", "skeleton_attachment_create", "skeleton_attachment_create_color", "skeleton_attachment_create_colour", "skeleton_attachment_destroy", "skeleton_attachment_exists", "skeleton_attachment_get", "skeleton_attachment_replace", "skeleton_attachment_replace_color", "skeleton_attachment_replace_colour", "skeleton_attachment_set", "skeleton_bone_data_get", "skeleton_bone_data_set", "skeleton_bone_list", "skeleton_bone_state_get", "skeleton_bone_state_set", "skeleton_collision_draw_set", "skeleton_find_slot", "skeleton_get_bounds", "skeleton_get_minmax", "skeleton_get_num_bounds", "skeleton_skin_create", "skeleton_skin_get", "skeleton_skin_list", "skeleton_skin_set", "skeleton_slot_alpha_get", "skeleton_slot_color_get", "skeleton_slot_color_set", "skeleton_slot_colour_get", "skeleton_slot_colour_set", "skeleton_slot_data", "skeleton_slot_data_instance", "skeleton_slot_list", "sprite_add", "sprite_add_ext", "sprite_add_from_surface", "sprite_assign", "sprite_collision_mask", "sprite_create_from_surface", "sprite_delete", "sprite_duplicate", "sprite_exists", "sprite_flush", "sprite_flush_multi", "sprite_get_bbox_bottom", "sprite_get_bbox_left", "sprite_get_bbox_mode", "sprite_get_bbox_right", "sprite_get_bbox_top", "sprite_get_height", "sprite_get_info", "sprite_get_name", "sprite_get_nineslice", "sprite_get_number", "sprite_get_speed", "sprite_get_speed_type", "sprite_get_texture", "sprite_get_tpe", "sprite_get_uvs", "sprite_get_width", "sprite_get_xoffset", "sprite_get_yoffset", "sprite_merge", "sprite_nineslice_create", "sprite_prefetch", "sprite_prefetch_multi", "sprite_replace", "sprite_save", "sprite_save_strip", "sprite_set_alpha_from_sprite", "sprite_set_bbox", "sprite_set_bbox_mode", "sprite_set_cache_size", "sprite_set_cache_size_ext", "sprite_set_nineslice", "sprite_set_offset", "sprite_set_speed", "sqr", "sqrt", "static_get", "static_set", "string", "string_byte_at", "string_byte_length", "string_char_at", "string_concat", "string_concat_ext", "string_copy", "string_count", "string_delete", "string_digits", "string_ends_with", "string_ext", "string_foreach", "string_format", "string_hash_to_newline", "string_height", "string_height_ext", "string_insert", "string_join", "string_join_ext", "string_last_pos", "string_last_pos_ext", "string_length", "string_letters", "string_lettersdigits", "string_lower", "string_ord_at", "string_pos", "string_pos_ext", "string_repeat", "string_replace", "string_replace_all", "string_set_byte_at", "string_split", "string_split_ext", "string_starts_with", "string_trim", "string_trim_end", "string_trim_start", "string_upper", "string_width", "string_width_ext", "struct_exists", "struct_foreach", "struct_get", "struct_get_from_hash", "struct_get_names", "struct_names_count", "struct_remove", "struct_set", "struct_set_from_hash", "surface_copy", "surface_copy_part", "surface_create", "surface_create_ext", "surface_depth_disable", "surface_exists", "surface_format_is_supported", "surface_free", "surface_get_depth_disable", "surface_get_format", "surface_get_height", "surface_get_target", "surface_get_target_ext", "surface_get_texture", "surface_get_width", "surface_getpixel", "surface_getpixel_ext", "surface_reset_target", "surface_resize", "surface_save", "surface_save_part", "surface_set_target", "surface_set_target_ext", "tag_get_asset_ids", "tag_get_assets", "tan", "texture_debug_messages", "texture_flush", "texture_get_height", "texture_get_texel_height", "texture_get_texel_width", "texture_get_uvs", "texture_get_width", "texture_global_scale", "texture_is_ready", "texture_prefetch", "texture_set_stage", "texturegroup_get_fonts", "texturegroup_get_names", "texturegroup_get_sprites", "texturegroup_get_status", "texturegroup_get_textures", "texturegroup_get_tilesets", "texturegroup_load", "texturegroup_set_mode", "texturegroup_unload", "tile_get_empty", "tile_get_flip", "tile_get_index", "tile_get_mirror", "tile_get_rotate", "tile_set_empty", "tile_set_flip", "tile_set_index", "tile_set_mirror", "tile_set_rotate", "tilemap_clear", "tilemap_get", "tilemap_get_at_pixel", "tilemap_get_cell_x_at_pixel", "tilemap_get_cell_y_at_pixel", "tilemap_get_frame", "tilemap_get_global_mask", "tilemap_get_height", "tilemap_get_mask", "tilemap_get_tile_height", "tilemap_get_tile_width", "tilemap_get_tileset", "tilemap_get_width", "tilemap_get_x", "tilemap_get_y", "tilemap_set", "tilemap_set_at_pixel", "tilemap_set_global_mask", "tilemap_set_height", "tilemap_set_mask", "tilemap_set_width", "tilemap_tileset", "tilemap_x", "tilemap_y", "tileset_get_info", "tileset_get_name", "tileset_get_texture", "tileset_get_uvs", "time_bpm_to_seconds", "time_seconds_to_bpm", "time_source_create", "time_source_destroy", "time_source_exists", "time_source_get_children", "time_source_get_parent", "time_source_get_period", "time_source_get_reps_completed", "time_source_get_reps_remaining", "time_source_get_state", "time_source_get_time_remaining", "time_source_get_units", "time_source_pause", "time_source_reconfigure", "time_source_reset", "time_source_resume", "time_source_start", "time_source_stop", "timeline_add", "timeline_clear", "timeline_delete", "timeline_exists", "timeline_get_name", "timeline_max_moment", "timeline_moment_add_script", "timeline_moment_clear", "timeline_size", "typeof", "url_get_domain", "url_open", "url_open_ext", "url_open_full", "uwp_device_touchscreen_available", "uwp_livetile_badge_clear", "uwp_livetile_badge_notification", "uwp_livetile_notification_begin", "uwp_livetile_notification_end", "uwp_livetile_notification_expiry", "uwp_livetile_notification_image_add", "uwp_livetile_notification_secondary_begin", "uwp_livetile_notification_tag", "uwp_livetile_notification_template_add", "uwp_livetile_notification_text_add", "uwp_livetile_queue_enable", "uwp_livetile_tile_clear", "uwp_secondarytile_badge_clear", "uwp_secondarytile_badge_notification", "uwp_secondarytile_delete", "uwp_secondarytile_pin", "uwp_secondarytile_tile_clear", "variable_clone", "variable_get_hash", "variable_global_exists", "variable_global_get", "variable_global_set", "variable_instance_exists", "variable_instance_get", "variable_instance_get_names", "variable_instance_names_count", "variable_instance_set", "variable_struct_exists", "variable_struct_get", "variable_struct_get_names", "variable_struct_names_count", "variable_struct_remove", "variable_struct_set", "vertex_argb", "vertex_begin", "vertex_color", "vertex_colour", "vertex_create_buffer", "vertex_create_buffer_ext", "vertex_create_buffer_from_buffer", "vertex_create_buffer_from_buffer_ext", "vertex_delete_buffer", "vertex_end", "vertex_float1", "vertex_float2", "vertex_float3", "vertex_float4", "vertex_format_add_color", "vertex_format_add_colour", "vertex_format_add_custom", "vertex_format_add_normal", "vertex_format_add_position", "vertex_format_add_position_3d", "vertex_format_add_texcoord", "vertex_format_begin", "vertex_format_delete", "vertex_format_end", "vertex_format_get_info", "vertex_freeze", "vertex_get_buffer_size", "vertex_get_number", "vertex_normal", "vertex_position", "vertex_position_3d", "vertex_submit", "vertex_submit_ext", "vertex_texcoord", "vertex_ubyte4", "vertex_update_buffer_from_buffer", "vertex_update_buffer_from_vertex", "video_close", "video_draw", "video_enable_loop", "video_get_duration", "video_get_format", "video_get_position", "video_get_status", "video_get_volume", "video_is_looping", "video_open", "video_pause", "video_resume", "video_seek_to", "video_set_volume", "view_get_camera", "view_get_hport", "view_get_surface_id", "view_get_visible", "view_get_wport", "view_get_xport", "view_get_yport", "view_set_camera", "view_set_hport", "view_set_surface_id", "view_set_visible", "view_set_wport", "view_set_xport", "view_set_yport", "virtual_key_add", "virtual_key_delete", "virtual_key_hide", "virtual_key_show", "wallpaper_set_config", "wallpaper_set_subscriptions", "weak_ref_alive", "weak_ref_any_alive", "weak_ref_create", "window_center", "window_device", "window_enable_borderless_fullscreen", "window_get_borderless_fullscreen", "window_get_caption", "window_get_color", "window_get_colour", "window_get_cursor", "window_get_fullscreen", "window_get_height", "window_get_showborder", "window_get_visible_rects", "window_get_width", "window_get_x", "window_get_y", "window_handle", "window_has_focus", "window_mouse_get_delta_x", "window_mouse_get_delta_y", "window_mouse_get_locked", "window_mouse_get_x", "window_mouse_get_y", "window_mouse_set", "window_mouse_set_locked", "window_set_caption", "window_set_color", "window_set_colour", "window_set_cursor", "window_set_fullscreen", "window_set_max_height", "window_set_max_width", "window_set_min_height", "window_set_min_width", "window_set_position", "window_set_rectangle", "window_set_showborder", "window_set_size", "window_view_mouse_get_x", "window_view_mouse_get_y", "window_views_mouse_get_x", "window_views_mouse_get_y", "winphone_tile_background_color", "winphone_tile_background_colour", "zip_add_file", "zip_create", "zip_save", "zip_unzip", "zip_unzip_async"],
          symbol: ["AudioEffect", "AudioEffectType", "AudioLFOType", "GM_build_date", "GM_build_type", "GM_is_sandboxed", "GM_project_filename", "GM_runtime_version", "GM_version", "NaN", "_GMFILE_", "_GMFUNCTION_", "_GMLINE_", "alignmentH", "alignmentV", "all", "animcurvetype_bezier", "animcurvetype_catmullrom", "animcurvetype_linear", "asset_animationcurve", "asset_font", "asset_object", "asset_path", "asset_room", "asset_script", "asset_sequence", "asset_shader", "asset_sound", "asset_sprite", "asset_tiles", "asset_timeline", "asset_unknown", "audio_3D", "audio_bus_main", "audio_falloff_exponent_distance", "audio_falloff_exponent_distance_clamped", "audio_falloff_exponent_distance_scaled", "audio_falloff_inverse_distance", "audio_falloff_inverse_distance_clamped", "audio_falloff_inverse_distance_scaled", "audio_falloff_linear_distance", "audio_falloff_linear_distance_clamped", "audio_falloff_none", "audio_mono", "audio_stereo", "bboxkind_diamond", "bboxkind_ellipse", "bboxkind_precise", "bboxkind_rectangular", "bboxmode_automatic", "bboxmode_fullimage", "bboxmode_manual", "bm_add", "bm_dest_alpha", "bm_dest_color", "bm_dest_colour", "bm_inv_dest_alpha", "bm_inv_dest_color", "bm_inv_dest_colour", "bm_inv_src_alpha", "bm_inv_src_color", "bm_inv_src_colour", "bm_max", "bm_normal", "bm_one", "bm_src_alpha", "bm_src_alpha_sat", "bm_src_color", "bm_src_colour", "bm_subtract", "bm_zero", "browser_chrome", "browser_edge", "browser_firefox", "browser_ie", "browser_ie_mobile", "browser_not_a_browser", "browser_opera", "browser_safari", "browser_safari_mobile", "browser_tizen", "browser_unknown", "browser_windows_store", "buffer_bool", "buffer_f16", "buffer_f32", "buffer_f64", "buffer_fast", "buffer_fixed", "buffer_grow", "buffer_s16", "buffer_s32", "buffer_s8", "buffer_seek_end", "buffer_seek_relative", "buffer_seek_start", "buffer_string", "buffer_text", "buffer_u16", "buffer_u32", "buffer_u64", "buffer_u8", "buffer_vbuffer", "buffer_wrap", "c_aqua", "c_black", "c_blue", "c_dkgray", "c_dkgrey", "c_fuchsia", "c_gray", "c_green", "c_grey", "c_lime", "c_ltgray", "c_ltgrey", "c_maroon", "c_navy", "c_olive", "c_orange", "c_purple", "c_red", "c_silver", "c_teal", "c_white", "c_yellow", "cache_directory", "characterSpacing", "cmpfunc_always", "cmpfunc_equal", "cmpfunc_greater", "cmpfunc_greaterequal", "cmpfunc_less", "cmpfunc_lessequal", "cmpfunc_never", "cmpfunc_notequal", "coreColor", "coreColour", "cr_appstart", "cr_arrow", "cr_beam", "cr_cross", "cr_default", "cr_drag", "cr_handpoint", "cr_hourglass", "cr_none", "cr_size_all", "cr_size_nesw", "cr_size_ns", "cr_size_nwse", "cr_size_we", "cr_uparrow", "cull_clockwise", "cull_counterclockwise", "cull_noculling", "device_emulator", "device_ios_ipad", "device_ios_ipad_retina", "device_ios_iphone", "device_ios_iphone5", "device_ios_iphone6", "device_ios_iphone6plus", "device_ios_iphone_retina", "device_ios_unknown", "device_tablet", "display_landscape", "display_landscape_flipped", "display_portrait", "display_portrait_flipped", "dll_cdecl", "dll_stdcall", "dropShadowEnabled", "dropShadowEnabled", "ds_type_grid", "ds_type_list", "ds_type_map", "ds_type_priority", "ds_type_queue", "ds_type_stack", "ef_cloud", "ef_ellipse", "ef_explosion", "ef_firework", "ef_flare", "ef_rain", "ef_ring", "ef_smoke", "ef_smokeup", "ef_snow", "ef_spark", "ef_star", "effectsEnabled", "effectsEnabled", "ev_alarm", "ev_animation_end", "ev_animation_event", "ev_animation_update", "ev_async_audio_playback", "ev_async_audio_playback_ended", "ev_async_audio_recording", "ev_async_dialog", "ev_async_push_notification", "ev_async_save_load", "ev_async_save_load", "ev_async_social", "ev_async_system_event", "ev_async_web", "ev_async_web_cloud", "ev_async_web_iap", "ev_async_web_image_load", "ev_async_web_networking", "ev_async_web_steam", "ev_audio_playback", "ev_audio_playback_ended", "ev_audio_recording", "ev_boundary", "ev_boundary_view0", "ev_boundary_view1", "ev_boundary_view2", "ev_boundary_view3", "ev_boundary_view4", "ev_boundary_view5", "ev_boundary_view6", "ev_boundary_view7", "ev_broadcast_message", "ev_cleanup", "ev_collision", "ev_create", "ev_destroy", "ev_dialog_async", "ev_draw", "ev_draw_begin", "ev_draw_end", "ev_draw_normal", "ev_draw_post", "ev_draw_pre", "ev_end_of_path", "ev_game_end", "ev_game_start", "ev_gesture", "ev_gesture_double_tap", "ev_gesture_drag_end", "ev_gesture_drag_start", "ev_gesture_dragging", "ev_gesture_flick", "ev_gesture_pinch_end", "ev_gesture_pinch_in", "ev_gesture_pinch_out", "ev_gesture_pinch_start", "ev_gesture_rotate_end", "ev_gesture_rotate_start", "ev_gesture_rotating", "ev_gesture_tap", "ev_global_gesture_double_tap", "ev_global_gesture_drag_end", "ev_global_gesture_drag_start", "ev_global_gesture_dragging", "ev_global_gesture_flick", "ev_global_gesture_pinch_end", "ev_global_gesture_pinch_in", "ev_global_gesture_pinch_out", "ev_global_gesture_pinch_start", "ev_global_gesture_rotate_end", "ev_global_gesture_rotate_start", "ev_global_gesture_rotating", "ev_global_gesture_tap", "ev_global_left_button", "ev_global_left_press", "ev_global_left_release", "ev_global_middle_button", "ev_global_middle_press", "ev_global_middle_release", "ev_global_right_button", "ev_global_right_press", "ev_global_right_release", "ev_gui", "ev_gui_begin", "ev_gui_end", "ev_joystick1_button1", "ev_joystick1_button2", "ev_joystick1_button3", "ev_joystick1_button4", "ev_joystick1_button5", "ev_joystick1_button6", "ev_joystick1_button7", "ev_joystick1_button8", "ev_joystick1_down", "ev_joystick1_left", "ev_joystick1_right", "ev_joystick1_up", "ev_joystick2_button1", "ev_joystick2_button2", "ev_joystick2_button3", "ev_joystick2_button4", "ev_joystick2_button5", "ev_joystick2_button6", "ev_joystick2_button7", "ev_joystick2_button8", "ev_joystick2_down", "ev_joystick2_left", "ev_joystick2_right", "ev_joystick2_up", "ev_keyboard", "ev_keypress", "ev_keyrelease", "ev_left_button", "ev_left_press", "ev_left_release", "ev_middle_button", "ev_middle_press", "ev_middle_release", "ev_mouse", "ev_mouse_enter", "ev_mouse_leave", "ev_mouse_wheel_down", "ev_mouse_wheel_up", "ev_no_button", "ev_no_more_health", "ev_no_more_lives", "ev_other", "ev_outside", "ev_outside_view0", "ev_outside_view1", "ev_outside_view2", "ev_outside_view3", "ev_outside_view4", "ev_outside_view5", "ev_outside_view6", "ev_outside_view7", "ev_pre_create", "ev_push_notification", "ev_right_button", "ev_right_press", "ev_right_release", "ev_room_end", "ev_room_start", "ev_social", "ev_step", "ev_step_begin", "ev_step_end", "ev_step_normal", "ev_system_event", "ev_trigger", "ev_user0", "ev_user1", "ev_user10", "ev_user11", "ev_user12", "ev_user13", "ev_user14", "ev_user15", "ev_user2", "ev_user3", "ev_user4", "ev_user5", "ev_user6", "ev_user7", "ev_user8", "ev_user9", "ev_web_async", "ev_web_cloud", "ev_web_iap", "ev_web_image_load", "ev_web_networking", "ev_web_sound_load", "ev_web_steam", "fa_archive", "fa_bottom", "fa_center", "fa_directory", "fa_hidden", "fa_left", "fa_middle", "fa_none", "fa_readonly", "fa_right", "fa_sysfile", "fa_top", "fa_volumeid", "false", "frameSizeX", "frameSizeY", "gamespeed_fps", "gamespeed_microseconds", "global", "glowColor", "glowColour", "glowEnabled", "glowEnabled", "glowEnd", "glowStart", "gp_axis_acceleration_x", "gp_axis_acceleration_y", "gp_axis_acceleration_z", "gp_axis_angular_velocity_x", "gp_axis_angular_velocity_y", "gp_axis_angular_velocity_z", "gp_axis_orientation_w", "gp_axis_orientation_x", "gp_axis_orientation_y", "gp_axis_orientation_z", "gp_axislh", "gp_axislv", "gp_axisrh", "gp_axisrv", "gp_face1", "gp_face2", "gp_face3", "gp_face4", "gp_padd", "gp_padl", "gp_padr", "gp_padu", "gp_select", "gp_shoulderl", "gp_shoulderlb", "gp_shoulderr", "gp_shoulderrb", "gp_start", "gp_stickl", "gp_stickr", "iap_available", "iap_canceled", "iap_ev_consume", "iap_ev_product", "iap_ev_purchase", "iap_ev_restore", "iap_ev_storeload", "iap_failed", "iap_purchased", "iap_refunded", "iap_status_available", "iap_status_loading", "iap_status_processing", "iap_status_restoring", "iap_status_unavailable", "iap_status_uninitialised", "iap_storeload_failed", "iap_storeload_ok", "iap_unavailable", "infinity", "kbv_autocapitalize_characters", "kbv_autocapitalize_none", "kbv_autocapitalize_sentences", "kbv_autocapitalize_words", "kbv_returnkey_continue", "kbv_returnkey_default", "kbv_returnkey_done", "kbv_returnkey_emergency", "kbv_returnkey_go", "kbv_returnkey_google", "kbv_returnkey_join", "kbv_returnkey_next", "kbv_returnkey_route", "kbv_returnkey_search", "kbv_returnkey_send", "kbv_returnkey_yahoo", "kbv_type_ascii", "kbv_type_default", "kbv_type_email", "kbv_type_numbers", "kbv_type_phone", "kbv_type_phone_name", "kbv_type_url", "layerelementtype_background", "layerelementtype_instance", "layerelementtype_oldtilemap", "layerelementtype_particlesystem", "layerelementtype_sequence", "layerelementtype_sprite", "layerelementtype_tile", "layerelementtype_tilemap", "layerelementtype_undefined", "leaderboard_type_number", "leaderboard_type_time_mins_secs", "lighttype_dir", "lighttype_point", "lineSpacing", "m_axisx", "m_axisx_gui", "m_axisy", "m_axisy_gui", "m_scroll_down", "m_scroll_up", "matrix_projection", "matrix_view", "matrix_world", "mb_any", "mb_left", "mb_middle", "mb_none", "mb_right", "mb_side1", "mb_side2", "mip_markedonly", "mip_off", "mip_on", "network_config_avoid_time_wait", "network_config_connect_timeout", "network_config_disable_multicast", "network_config_disable_reliable_udp", "network_config_enable_multicast", "network_config_enable_reliable_udp", "network_config_use_non_blocking_socket", "network_config_websocket_protocol", "network_connect_active", "network_connect_blocking", "network_connect_nonblocking", "network_connect_none", "network_connect_passive", "network_send_binary", "network_send_text", "network_socket_bluetooth", "network_socket_tcp", "network_socket_udp", "network_socket_ws", "network_socket_wss", "network_type_connect", "network_type_data", "network_type_disconnect", "network_type_down", "network_type_non_blocking_connect", "network_type_up", "network_type_up_failed", "nineslice_blank", "nineslice_bottom", "nineslice_center", "nineslice_centre", "nineslice_hide", "nineslice_left", "nineslice_mirror", "nineslice_repeat", "nineslice_right", "nineslice_stretch", "nineslice_top", "noone", "of_challenge_lose", "of_challenge_tie", "of_challenge_win", "os_android", "os_gdk", "os_gxgames", "os_ios", "os_linux", "os_macosx", "os_operagx", "os_permission_denied", "os_permission_denied_dont_request", "os_permission_granted", "os_ps3", "os_ps4", "os_ps5", "os_psvita", "os_switch", "os_tvos", "os_unknown", "os_uwp", "os_win8native", "os_windows", "os_winphone", "os_xboxone", "os_xboxseriesxs", "other", "outlineColor", "outlineColour", "outlineDist", "outlineEnabled", "outlineEnabled", "paragraphSpacing", "path_action_continue", "path_action_restart", "path_action_reverse", "path_action_stop", "phy_debug_render_aabb", "phy_debug_render_collision_pairs", "phy_debug_render_coms", "phy_debug_render_core_shapes", "phy_debug_render_joints", "phy_debug_render_obb", "phy_debug_render_shapes", "phy_joint_anchor_1_x", "phy_joint_anchor_1_y", "phy_joint_anchor_2_x", "phy_joint_anchor_2_y", "phy_joint_angle", "phy_joint_angle_limits", "phy_joint_damping_ratio", "phy_joint_frequency", "phy_joint_length_1", "phy_joint_length_2", "phy_joint_lower_angle_limit", "phy_joint_max_force", "phy_joint_max_length", "phy_joint_max_motor_force", "phy_joint_max_motor_torque", "phy_joint_max_torque", "phy_joint_motor_force", "phy_joint_motor_speed", "phy_joint_motor_torque", "phy_joint_reaction_force_x", "phy_joint_reaction_force_y", "phy_joint_reaction_torque", "phy_joint_speed", "phy_joint_translation", "phy_joint_upper_angle_limit", "phy_particle_data_flag_category", "phy_particle_data_flag_color", "phy_particle_data_flag_colour", "phy_particle_data_flag_position", "phy_particle_data_flag_typeflags", "phy_particle_data_flag_velocity", "phy_particle_flag_colormixing", "phy_particle_flag_colourmixing", "phy_particle_flag_elastic", "phy_particle_flag_powder", "phy_particle_flag_spring", "phy_particle_flag_tensile", "phy_particle_flag_viscous", "phy_particle_flag_wall", "phy_particle_flag_water", "phy_particle_flag_zombie", "phy_particle_group_flag_rigid", "phy_particle_group_flag_solid", "pi", "pointer_invalid", "pointer_null", "pr_linelist", "pr_linestrip", "pr_pointlist", "pr_trianglefan", "pr_trianglelist", "pr_trianglestrip", "ps_distr_gaussian", "ps_distr_invgaussian", "ps_distr_linear", "ps_mode_burst", "ps_mode_stream", "ps_shape_diamond", "ps_shape_ellipse", "ps_shape_line", "ps_shape_rectangle", "pt_shape_circle", "pt_shape_cloud", "pt_shape_disk", "pt_shape_explosion", "pt_shape_flare", "pt_shape_line", "pt_shape_pixel", "pt_shape_ring", "pt_shape_smoke", "pt_shape_snow", "pt_shape_spark", "pt_shape_sphere", "pt_shape_square", "pt_shape_star", "rollback_chat_message", "rollback_connect_error", "rollback_connect_info", "rollback_connected_to_peer", "rollback_connection_rejected", "rollback_disconnected_from_peer", "rollback_end_game", "rollback_game_full", "rollback_game_info", "rollback_game_interrupted", "rollback_game_resumed", "rollback_high_latency", "rollback_player_prefs", "rollback_protocol_rejected", "rollback_synchronized_with_peer", "rollback_synchronizing_with_peer", "self", "seqaudiokey_loop", "seqaudiokey_oneshot", "seqdir_left", "seqdir_right", "seqinterpolation_assign", "seqinterpolation_lerp", "seqplay_loop", "seqplay_oneshot", "seqplay_pingpong", "seqtextkey_bottom", "seqtextkey_center", "seqtextkey_justify", "seqtextkey_left", "seqtextkey_middle", "seqtextkey_right", "seqtextkey_top", "seqtracktype_audio", "seqtracktype_bool", "seqtracktype_clipmask", "seqtracktype_clipmask_mask", "seqtracktype_clipmask_subject", "seqtracktype_color", "seqtracktype_colour", "seqtracktype_empty", "seqtracktype_graphic", "seqtracktype_group", "seqtracktype_instance", "seqtracktype_message", "seqtracktype_moment", "seqtracktype_particlesystem", "seqtracktype_real", "seqtracktype_sequence", "seqtracktype_spriteframes", "seqtracktype_string", "seqtracktype_text", "shadowColor", "shadowColour", "shadowOffsetX", "shadowOffsetY", "shadowSoftness", "sprite_add_ext_error_cancelled", "sprite_add_ext_error_decompressfailed", "sprite_add_ext_error_loadfailed", "sprite_add_ext_error_setupfailed", "sprite_add_ext_error_spritenotfound", "sprite_add_ext_error_unknown", "spritespeed_framespergameframe", "spritespeed_framespersecond", "surface_r16float", "surface_r32float", "surface_r8unorm", "surface_rg8unorm", "surface_rgba16float", "surface_rgba32float", "surface_rgba4unorm", "surface_rgba8unorm", "texturegroup_status_fetched", "texturegroup_status_loaded", "texturegroup_status_loading", "texturegroup_status_unloaded", "tf_anisotropic", "tf_linear", "tf_point", "thickness", "tile_flip", "tile_index_mask", "tile_mirror", "tile_rotate", "time_source_expire_after", "time_source_expire_nearest", "time_source_game", "time_source_global", "time_source_state_active", "time_source_state_initial", "time_source_state_paused", "time_source_state_stopped", "time_source_units_frames", "time_source_units_seconds", "timezone_local", "timezone_utc", "tm_countvsyncs", "tm_sleep", "tm_systemtiming", "true", "ty_real", "ty_string", "undefined", "vertex_type_color", "vertex_type_colour", "vertex_type_float1", "vertex_type_float2", "vertex_type_float3", "vertex_type_float4", "vertex_type_ubyte4", "vertex_usage_binormal", "vertex_usage_blendindices", "vertex_usage_blendweight", "vertex_usage_color", "vertex_usage_colour", "vertex_usage_depth", "vertex_usage_fog", "vertex_usage_normal", "vertex_usage_position", "vertex_usage_psize", "vertex_usage_sample", "vertex_usage_tangent", "vertex_usage_texcoord", "video_format_rgba", "video_format_yuv", "video_status_closed", "video_status_paused", "video_status_playing", "video_status_preparing", "vk_add", "vk_alt", "vk_anykey", "vk_backspace", "vk_control", "vk_decimal", "vk_delete", "vk_divide", "vk_down", "vk_end", "vk_enter", "vk_escape", "vk_f1", "vk_f10", "vk_f11", "vk_f12", "vk_f2", "vk_f3", "vk_f4", "vk_f5", "vk_f6", "vk_f7", "vk_f8", "vk_f9", "vk_home", "vk_insert", "vk_lalt", "vk_lcontrol", "vk_left", "vk_lshift", "vk_multiply", "vk_nokey", "vk_numpad0", "vk_numpad1", "vk_numpad2", "vk_numpad3", "vk_numpad4", "vk_numpad5", "vk_numpad6", "vk_numpad7", "vk_numpad8", "vk_numpad9", "vk_pagedown", "vk_pageup", "vk_pause", "vk_printscreen", "vk_ralt", "vk_rcontrol", "vk_return", "vk_right", "vk_rshift", "vk_shift", "vk_space", "vk_subtract", "vk_tab", "vk_up", "wallpaper_config", "wallpaper_subscription_data", "wrap"],
          "variable.language": ["alarm", "application_surface", "argument", "argument0", "argument1", "argument2", "argument3", "argument4", "argument5", "argument6", "argument7", "argument8", "argument9", "argument10", "argument11", "argument12", "argument13", "argument14", "argument15", "argument_count", "async_load", "background_color", "background_colour", "background_showcolor", "background_showcolour", "bbox_bottom", "bbox_left", "bbox_right", "bbox_top", "browser_height", "browser_width", "colour?ColourTrack", "current_day", "current_hour", "current_minute", "current_month", "current_second", "current_time", "current_weekday", "current_year", "cursor_sprite", "debug_mode", "delta_time", "depth", "direction", "display_aa", "drawn_by_sequence", "event_action", "event_data", "event_number", "event_object", "event_type", "font_texture_page_size", "fps", "fps_real", "friction", "game_display_name", "game_id", "game_project_name", "game_save_id", "gravity", "gravity_direction", "health", "hspeed", "iap_data", "id", "image_alpha", "image_angle", "image_blend", "image_index", "image_number", "image_speed", "image_xscale", "image_yscale", "in_collision_tree", "in_sequence", "instance_count", "instance_id", "keyboard_key", "keyboard_lastchar", "keyboard_lastkey", "keyboard_string", "layer", "lives", "longMessage", "managed", "mask_index", "message", "mouse_button", "mouse_lastbutton", "mouse_x", "mouse_y", "object_index", "os_browser", "os_device", "os_type", "os_version", "path_endaction", "path_index", "path_orientation", "path_position", "path_positionprevious", "path_scale", "path_speed", "persistent", "phy_active", "phy_angular_damping", "phy_angular_velocity", "phy_bullet", "phy_col_normal_x", "phy_col_normal_y", "phy_collision_points", "phy_collision_x", "phy_collision_y", "phy_com_x", "phy_com_y", "phy_dynamic", "phy_fixed_rotation", "phy_inertia", "phy_kinematic", "phy_linear_damping", "phy_linear_velocity_x", "phy_linear_velocity_y", "phy_mass", "phy_position_x", "phy_position_xprevious", "phy_position_y", "phy_position_yprevious", "phy_rotation", "phy_sleeping", "phy_speed", "phy_speed_x", "phy_speed_y", "player_avatar_sprite", "player_avatar_url", "player_id", "player_local", "player_type", "player_user_id", "program_directory", "rollback_api_server", "rollback_confirmed_frame", "rollback_current_frame", "rollback_event_id", "rollback_event_param", "rollback_game_running", "room", "room_first", "room_height", "room_last", "room_persistent", "room_speed", "room_width", "score", "script", "sequence_instance", "solid", "speed", "sprite_height", "sprite_index", "sprite_width", "sprite_xoffset", "sprite_yoffset", "stacktrace", "temp_directory", "timeline_index", "timeline_loop", "timeline_position", "timeline_running", "timeline_speed", "view_camera", "view_current", "view_enabled", "view_hport", "view_surface_id", "view_visible", "view_wport", "view_xport", "view_yport", "visible", "vspeed", "webgl_enabled", "working_directory", "x", "xprevious", "xstart", "y", "yprevious", "ystart"]
        },
        contains: [e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, e.C_NUMBER_MODE]
      };
    }
    EEa.exports = dCp;
  });
  var CEa = __commonJS((kJy, wEa) => {
    function pCp(e) {
      let s = {
        keyword: ["break", "case", "chan", "const", "continue", "default", "defer", "else", "fallthrough", "for", "func", "go", "goto", "if", "import", "interface", "map", "package", "range", "return", "select", "struct", "switch", "type", "var"],
        type: ["bool", "byte", "complex64", "complex128", "error", "float32", "float64", "int8", "int16", "int32", "int64", "string", "uint8", "uint16", "uint32", "uint64", "int", "uint", "uintptr", "rune"],
        literal: ["true", "false", "iota", "nil"],
        built_in: ["append", "cap", "close", "complex", "copy", "imag", "len", "make", "new", "panic", "print", "println", "real", "recover", "delete"]
      };
      return {
        name: "Go",
        aliases: ["golang"],
        keywords: s,
        illegal: "</",
        contains: [e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, {
          className: "string",
          variants: [e.QUOTE_STRING_MODE, e.APOS_STRING_MODE, {
            begin: "`",
            end: "`"
          }]
        }, {
          className: "number",
          variants: [{
            match: /-?\b0[xX]\.[a-fA-F0-9](_?[a-fA-F0-9])*[pP][+-]?\d(_?\d)*i?/,
            relevance: 0
          }, {
            match: /-?\b0[xX](_?[a-fA-F0-9])+((\.([a-fA-F0-9](_?[a-fA-F0-9])*)?)?[pP][+-]?\d(_?\d)*)?i?/,
            relevance: 0
          }, {
            match: /-?\b0[oO](_?[0-7])*i?/,
            relevance: 0
          }, {
            match: /-?\.\d(_?\d)*([eE][+-]?\d(_?\d)*)?i?/,
            relevance: 0
          }, {
            match: /-?\b\d(_?\d)*(\.(\d(_?\d)*)?)?([eE][+-]?\d(_?\d)*)?i?/,
            relevance: 0
          }]
        }, {
          begin: /:=/
        }, {
          className: "function",
          beginKeywords: "func",
          end: "\\s*(\\{|$)",
          excludeEnd: true,
          contains: [e.TITLE_MODE, {
            className: "params",
            begin: /\(/,
            end: /\)/,
            endsParent: true,
            keywords: s,
            illegal: /["']/
          }]
        }]
      };
    }
    wEa.exports = pCp;
  });
  var xEa = __commonJS((AJy, REa) => {
    function mCp(e) {
      return {
        name: "Golo",
        keywords: {
          keyword: ["println", "readln", "print", "import", "module", "function", "local", "return", "let", "var", "while", "for", "foreach", "times", "in", "case", "when", "match", "with", "break", "continue", "augment", "augmentation", "each", "find", "filter", "reduce", "if", "then", "else", "otherwise", "try", "catch", "finally", "raise", "throw", "orIfNull", "DynamicObject|10", "DynamicVariable", "struct", "Observable", "map", "set", "vector", "list", "array"],
          literal: ["true", "false", "null"]
        },
        contains: [e.HASH_COMMENT_MODE, e.QUOTE_STRING_MODE, e.C_NUMBER_MODE, {
          className: "meta",
          begin: "@[A-Za-z]+"
        }]
      };
    }
    REa.exports = mCp;
  });
  var AEa = __commonJS((IJy, kEa) => {
    function fCp(e) {
      return {
        name: "Gradle",
        case_insensitive: true,
        keywords: ["task", "project", "allprojects", "subprojects", "artifacts", "buildscript", "configurations", "dependencies", "repositories", "sourceSets", "description", "delete", "from", "into", "include", "exclude", "source", "classpath", "destinationDir", "includes", "options", "sourceCompatibility", "targetCompatibility", "group", "flatDir", "doLast", "doFirst", "flatten", "todir", "fromdir", "ant", "def", "abstract", "break", "case", "catch", "continue", "default", "do", "else", "extends", "final", "finally", "for", "if", "implements", "instanceof", "native", "new", "private", "protected", "public", "return", "static", "switch", "synchronized", "throw", "throws", "transient", "try", "volatile", "while", "strictfp", "package", "import", "false", "null", "super", "this", "true", "antlrtask", "checkstyle", "codenarc", "copy", "boolean", "byte", "char", "class", "double", "float", "int", "interface", "long", "short", "void", "compile", "runTime", "file", "fileTree", "abs", "any", "append", "asList", "asWritable", "call", "collect", "compareTo", "count", "div", "dump", "each", "eachByte", "eachFile", "eachLine", "every", "find", "findAll", "flatten", "getAt", "getErr", "getIn", "getOut", "getText", "grep", "immutable", "inject", "inspect", "intersect", "invokeMethods", "isCase", "join", "leftShift", "minus", "multiply", "newInputStream", "newOutputStream", "newPrintWriter", "newReader", "newWriter", "next", "plus", "pop", "power", "previous", "print", "println", "push", "putAt", "read", "readBytes", "readLines", "reverse", "reverseEach", "round", "size", "sort", "splitEachLine", "step", "subMap", "times", "toInteger", "toList", "tokenize", "upto", "waitForOrKill", "withPrintWriter", "withReader", "withStream", "withWriter", "withWriterAppend", "write", "writeLine"],
        contains: [e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, e.NUMBER_MODE, e.REGEXP_MODE]
      };
    }
    kEa.exports = fCp;
  });
  var PEa = __commonJS((PJy, IEa) => {
    function hCp(e) {
      let t = e.regex;
      let n = /[_A-Za-z][_0-9A-Za-z]*/;
      return {
        name: "GraphQL",
        aliases: ["gql"],
        case_insensitive: true,
        disableAutodetect: false,
        keywords: {
          keyword: ["query", "mutation", "subscription", "type", "input", "schema", "directive", "interface", "union", "scalar", "fragment", "enum", "on"],
          literal: ["true", "false", "null"]
        },
        contains: [e.HASH_COMMENT_MODE, e.QUOTE_STRING_MODE, e.NUMBER_MODE, {
          scope: "punctuation",
          match: /[.]{3}/,
          relevance: 0
        }, {
          scope: "punctuation",
          begin: /[\!\(\)\:\=\[\]\{\|\}]{1}/,
          relevance: 0
        }, {
          scope: "variable",
          begin: /\$/,
          end: /\W/,
          excludeEnd: true,
          relevance: 0
        }, {
          scope: "meta",
          match: /@\w+/,
          excludeEnd: true
        }, {
          scope: "symbol",
          begin: t.concat(n, t.lookahead(/\s*:/)),
          relevance: 0
        }],
        illegal: [/[;<']/, /BEGIN/]
      };
    }
    IEa.exports = hCp;
  });
  var DEa = __commonJS((OJy, OEa) => {
    function cfo(e, t = {}) {
      t.variants = e;
      return t;
    }
    function gCp(e) {
      let t = e.regex;
      let n = "[A-Za-z0-9_$]+";
      let r = cfo([e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, e.COMMENT("/\\*\\*", "\\*/", {
        relevance: 0,
        contains: [{
          begin: /\w+@/,
          relevance: 0
        }, {
          className: "doctag",
          begin: "@[A-Za-z]+"
        }]
      })]);
      let o = {
        className: "regexp",
        begin: /~?\/[^\/\n]+\//,
        contains: [e.BACKSLASH_ESCAPE]
      };
      let s = cfo([e.BINARY_NUMBER_MODE, e.C_NUMBER_MODE]);
      let i = cfo([{
        begin: /"""/,
        end: /"""/
      }, {
        begin: /'''/,
        end: /'''/
      }, {
        begin: "\\$/",
        end: "/\\$",
        relevance: 10
      }, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE], {
        className: "string"
      });
      let a = {
        match: [/(class|interface|trait|enum|record|extends|implements)/, /\s+/, e.UNDERSCORE_IDENT_RE],
        scope: {
          1: "keyword",
          3: "title.class"
        }
      };
      return {
        name: "Groovy",
        keywords: {
          "variable.language": "this super",
          literal: "true false null",
          type: ["byte", "short", "char", "int", "long", "boolean", "float", "double", "void"],
          keyword: ["def", "as", "in", "assert", "trait", "abstract", "static", "volatile", "transient", "public", "private", "protected", "synchronized", "final", "class", "interface", "enum", "if", "else", "for", "while", "switch", "case", "break", "default", "continue", "throw", "throws", "try", "catch", "finally", "implements", "extends", "new", "import", "package", "return", "instanceof", "var"]
        },
        contains: [e.SHEBANG({
          binary: "groovy",
          relevance: 10
        }), r, i, o, s, a, {
          className: "meta",
          begin: "@[A-Za-z]+",
          relevance: 0
        }, {
          className: "attr",
          begin: "[A-Za-z0-9_$]+[ \t]*:",
          relevance: 0
        }, {
          begin: /\?/,
          end: /:/,
          relevance: 0,
          contains: [r, i, o, s, "self"]
        }, {
          className: "symbol",
          begin: "^[ \t]*" + t.lookahead("[A-Za-z0-9_$]+:"),
          excludeBegin: true,
          end: "[A-Za-z0-9_$]+:",
          relevance: 0
        }],
        illegal: /#|<\//
      };
    }
    OEa.exports = gCp;
  });
  var NEa = __commonJS((DJy, MEa) => {
    function yCp(e) {
      return {
        name: "HAML",
        case_insensitive: true,
        contains: [{
          className: "meta",
          begin: "^!!!( (5|1\\.1|Strict|Frameset|Basic|Mobile|RDFa|XML\\b.*))?$",
          relevance: 10
        }, e.COMMENT("^\\s*(!=#|=#|-#|/).*$", null, {
          relevance: 0
        }), {
          begin: "^\\s*(-|=|!=)(?!#)",
          end: /$/,
          subLanguage: "ruby",
          excludeBegin: true,
          excludeEnd: true
        }, {
          className: "tag",
          begin: "^\\s*%",
          contains: [{
            className: "selector-tag",
            begin: "\\w+"
          }, {
            className: "selector-id",
            begin: "#[\\w-]+"
          }, {
            className: "selector-class",
            begin: "\\.[\\w-]+"
          }, {
            begin: /\{\s*/,
            end: /\s*\}/,
            contains: [{
              begin: ":\\w+\\s*=>",
              end: ",\\s+",
              returnBegin: true,
              endsWithParent: true,
              contains: [{
                className: "attr",
                begin: ":\\w+"
              }, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, {
                begin: "\\w+",
                relevance: 0
              }]
            }]
          }, {
            begin: "\\(\\s*",
            end: "\\s*\\)",
            excludeEnd: true,
            contains: [{
              begin: "\\w+\\s*=",
              end: "\\s+",
              returnBegin: true,
              endsWithParent: true,
              contains: [{
                className: "attr",
                begin: "\\w+",
                relevance: 0
              }, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, {
                begin: "\\w+",
                relevance: 0
              }]
            }]
          }]
        }, {
          begin: "^\\s*[=~]\\s*"
        }, {
          begin: /#\{/,
          end: /\}/,
          subLanguage: "ruby",
          excludeBegin: true,
          excludeEnd: true
        }]
      };
    }
    MEa.exports = yCp;
  });
  var FEa = __commonJS((MJy, LEa) => {
    function _Cp(e) {
      let t = e.regex;
      let n = {
        $pattern: /[\w.\/]+/,
        built_in: ["action", "bindattr", "collection", "component", "concat", "debugger", "each", "each-in", "get", "hash", "if", "in", "input", "link-to", "loc", "log", "lookup", "mut", "outlet", "partial", "query-params", "render", "template", "textarea", "unbound", "unless", "view", "with", "yield"]
      };
      let r = {
        $pattern: /[\w.\/]+/,
        literal: ["true", "false", "undefined", "null"]
      };
      let o = /""|"[^"]+"/;
      let s = /''|'[^']+'/;
      let i = /\[\]|\[[^\]]+\]/;
      let a = /[^\s!"#%&'()*+,.\/;<=>@\[\\\]^`{|}~]+/;
      let l = /(\.|\/)/;
      let c = t.either(o, s, i, a);
      let u = t.concat(t.optional(/\.|\.\/|\//), c, t.anyNumberOfTimes(t.concat(l, c)));
      let d = t.concat("(", i, "|", a, ")(?==)");
      let p = {
        begin: u
      };
      let m = e.inherit(p, {
        keywords: r
      });
      let f = {
        begin: /\(/,
        end: /\)/
      };
      let h = {
        className: "attr",
        begin: d,
        relevance: 0,
        starts: {
          begin: /=/,
          end: /=/,
          starts: {
            contains: [e.NUMBER_MODE, e.QUOTE_STRING_MODE, e.APOS_STRING_MODE, m, f]
          }
        }
      };
      let g = {
        begin: /as\s+\|/,
        keywords: {
          keyword: "as"
        },
        end: /\|/,
        contains: [{
          begin: /\w+/
        }]
      };
      let y = {
        contains: [e.NUMBER_MODE, e.QUOTE_STRING_MODE, e.APOS_STRING_MODE, g, h, m, f],
        returnEnd: true
      };
      let _ = e.inherit(p, {
        className: "name",
        keywords: n,
        starts: e.inherit(y, {
          end: /\)/
        })
      });
      f.contains = [_];
      let b = e.inherit(p, {
        keywords: n,
        className: "name",
        starts: e.inherit(y, {
          end: /\}\}/
        })
      });
      let S = e.inherit(p, {
        keywords: n,
        className: "name"
      });
      let E = e.inherit(p, {
        className: "name",
        keywords: n,
        starts: e.inherit(y, {
          end: /\}\}/
        })
      });
      return {
        name: "Handlebars",
        aliases: ["hbs", "html.hbs", "html.handlebars", "htmlbars"],
        case_insensitive: true,
        subLanguage: "xml",
        contains: [{
          begin: /\\\{\{/,
          skip: true
        }, {
          begin: /\\\\(?=\{\{)/,
          skip: true
        }, e.COMMENT(/\{\{!--/, /--\}\}/), e.COMMENT(/\{\{!/, /\}\}/), {
          className: "template-tag",
          begin: /\{\{\{\{(?!\/)/,
          end: /\}\}\}\}/,
          contains: [b],
          starts: {
            end: /\{\{\{\{\//,
            returnEnd: true,
            subLanguage: "xml"
          }
        }, {
          className: "template-tag",
          begin: /\{\{\{\{\//,
          end: /\}\}\}\}/,
          contains: [S]
        }, {
          className: "template-tag",
          begin: /\{\{#/,
          end: /\}\}/,
          contains: [b]
        }, {
          className: "template-tag",
          begin: /\{\{(?=else\}\})/,
          end: /\}\}/,
          keywords: "else"
        }, {
          className: "template-tag",
          begin: /\{\{(?=else if)/,
          end: /\}\}/,
          keywords: "else if"
        }, {
          className: "template-tag",
          begin: /\{\{\//,
          end: /\}\}/,
          contains: [S]
        }, {
          className: "template-variable",
          begin: /\{\{\{/,
          end: /\}\}\}/,
          contains: [E]
        }, {
          className: "template-variable",
          begin: /\{\{/,
          end: /\}\}/,
          contains: [E]
        }]
      };
    }
    LEa.exports = _Cp;
  });
  var BEa = __commonJS((NJy, UEa) => {
    function bCp(e) {
      let c = {
        variants: [e.COMMENT("--+", "$"), e.COMMENT(/\{-/, /-\}/, {
          contains: ["self"]
        })]
      };
      let u = {
        className: "meta",
        begin: /\{-#/,
        end: /#-\}/
      };
      let d = {
        className: "meta",
        begin: "^#",
        end: "$"
      };
      let p = {
        className: "type",
        begin: "\\b[A-Z][\\w']*",
        relevance: 0
      };
      let m = {
        begin: "\\(",
        end: "\\)",
        illegal: '"',
        contains: [u, d, {
          className: "type",
          begin: "\\b[A-Z][\\w]*(\\((\\.\\.|,|\\w+)\\))?"
        }, e.inherit(e.TITLE_MODE, {
          begin: "[_a-z][\\w']*"
        }), c]
      };
      let f = {
        begin: /\{/,
        end: /\}/,
        contains: m.contains
      };
      let h = {
        className: "number",
        relevance: 0,
        variants: [{
          match: "\\b(([0-9]_*)+)(\\.(([0-9]_*)+))?([eE][+-]?(([0-9]_*)+))?\\b"
        }, {
          match: "\\b0[xX]_*(([0-9a-fA-F]_*)+)(\\.(([0-9a-fA-F]_*)+))?([pP][+-]?(([0-9]_*)+))?\\b"
        }, {
          match: "\\b0[oO](([0-7]_*)+)\\b"
        }, {
          match: "\\b0[bB](([01]_*)+)\\b"
        }]
      };
      return {
        name: "Haskell",
        aliases: ["hs"],
        keywords: "let in if then else case of where do module import hiding qualified type data newtype deriving class instance as default infix infixl infixr foreign export ccall stdcall cplusplus jvm dotnet safe unsafe family forall mdo proc rec",
        unicodeRegex: true,
        contains: [{
          beginKeywords: "module",
          end: "where",
          keywords: "module where",
          contains: [m, c],
          illegal: "\\W\\.|;"
        }, {
          begin: "\\bimport\\b",
          end: "$",
          keywords: "import qualified as hiding",
          contains: [m, c],
          illegal: "\\W\\.|;"
        }, {
          className: "class",
          begin: "^(\\s*)?(class|instance)\\b",
          end: "where",
          keywords: "class family instance where",
          contains: [p, m, c]
        }, {
          className: "class",
          begin: "\\b(data|(new)?type)\\b",
          end: "$",
          keywords: "data family type newtype deriving",
          contains: [u, p, m, f, c]
        }, {
          beginKeywords: "default",
          end: "$",
          contains: [p, m, c]
        }, {
          beginKeywords: "infix infixl infixr",
          end: "$",
          contains: [e.C_NUMBER_MODE, c]
        }, {
          begin: "\\bforeign\\b",
          end: "$",
          keywords: "foreign import export ccall stdcall cplusplus jvm dotnet safe unsafe",
          contains: [p, e.QUOTE_STRING_MODE, c]
        }, {
          className: "meta",
          begin: "#!\\/usr\\/bin\\/env runhaskell",
          end: "$"
        }, u, d, {
          scope: "string",
          begin: /'(?=\\?.')/,
          end: /'/,
          contains: [{
            scope: "char.escape",
            match: /\\./
          }]
        }, e.QUOTE_STRING_MODE, h, p, e.inherit(e.TITLE_MODE, {
          begin: "^[_a-z][\\w']*"
        }), {
          begin: "(?!-)([!#$%&*+.\\/<=>?@\\\\^~-]|(?!([(),;\\[\\]`|{}]|[_:\"']))(\\p{S}|\\p{P}))--+|--+(?!-)([!#$%&*+.\\/<=>?@\\\\^~-]|(?!([(),;\\[\\]`|{}]|[_:\"']))(\\p{S}|\\p{P}))"
        }, c, {
          begin: "->|<-"
        }]
      };
    }
    UEa.exports = bCp;
  });
  var HEa = __commonJS((LJy, $Ea) => {
    function SCp(e) {
      let n = /(-?)(\b0[xX][a-fA-F0-9_]+|(\b\d+(\.[\d_]*)?|\.[\d_]+)(([eE][-+]?\d+)|i32|u32|i64|f64)?)/;
      let r = "Int Float String Bool Dynamic Void Array ";
      return {
        name: "Haxe",
        aliases: ["hx"],
        keywords: {
          keyword: "abstract break case cast catch continue default do dynamic else enum extern final for function here if import in inline is macro never new override package private get set public return static super switch this throw trace try typedef untyped using var while Int Float String Bool Dynamic Void Array ",
          built_in: "trace this",
          literal: "true false null _"
        },
        contains: [{
          className: "string",
          begin: "'",
          end: "'",
          contains: [e.BACKSLASH_ESCAPE, {
            className: "subst",
            begin: /\$\{/,
            end: /\}/
          }, {
            className: "subst",
            begin: /\$/,
            end: /\W\}/
          }]
        }, e.QUOTE_STRING_MODE, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, {
          className: "number",
          begin: n,
          relevance: 0
        }, {
          className: "variable",
          begin: "\\$[a-zA-Z_$][a-zA-Z0-9_$]*"
        }, {
          className: "meta",
          begin: /@:?/,
          end: /\(|$/,
          excludeEnd: true
        }, {
          className: "meta",
          begin: "#",
          end: "$",
          keywords: {
            keyword: "if else elseif end error"
          }
        }, {
          className: "type",
          begin: /:[ \t]*/,
          end: /[^A-Za-z0-9_ \t\->]/,
          excludeBegin: true,
          excludeEnd: true,
          relevance: 0
        }, {
          className: "type",
          begin: /:[ \t]*/,
          end: /\W/,
          excludeBegin: true,
          excludeEnd: true
        }, {
          className: "type",
          beginKeywords: "new",
          end: /\W/,
          excludeBegin: true,
          excludeEnd: true
        }, {
          className: "title.class",
          beginKeywords: "enum",
          end: /\{/,
          contains: [e.TITLE_MODE]
        }, {
          className: "title.class",
          begin: "\\babstract\\b(?=\\s*" + e.IDENT_RE + "\\s*\\()",
          end: /[\{$]/,
          contains: [{
            className: "type",
            begin: /\(/,
            end: /\)/,
            excludeBegin: true,
            excludeEnd: true
          }, {
            className: "type",
            begin: /from +/,
            end: /\W/,
            excludeBegin: true,
            excludeEnd: true
          }, {
            className: "type",
            begin: /to +/,
            end: /\W/,
            excludeBegin: true,
            excludeEnd: true
          }, e.TITLE_MODE],
          keywords: {
            keyword: "abstract from to"
          }
        }, {
          className: "title.class",
          begin: /\b(class|interface) +/,
          end: /[\{$]/,
          excludeEnd: true,
          keywords: "class interface",
          contains: [{
            className: "keyword",
            begin: /\b(extends|implements) +/,
            keywords: "extends implements",
            contains: [{
              className: "type",
              begin: e.IDENT_RE,
              relevance: 0
            }]
          }, e.TITLE_MODE]
        }, {
          className: "title.function",
          beginKeywords: "function",
          end: /\(/,
          excludeEnd: true,
          illegal: /\S/,
          contains: [e.TITLE_MODE]
        }],
        illegal: /<\//
      };
    }
    $Ea.exports = SCp;
  });
  var qEa = __commonJS((FJy, jEa) => {
    function TCp(e) {
      return {
        name: "HSP",
        case_insensitive: true,
        keywords: {
          $pattern: /[\w._]+/,
          keyword: "goto gosub return break repeat loop continue wait await dim sdim foreach dimtype dup dupptr end stop newmod delmod mref run exgoto on mcall assert logmes newlab resume yield onexit onerror onkey onclick oncmd exist delete mkdir chdir dirlist bload bsave bcopy memfile if else poke wpoke lpoke getstr chdpm memexpand memcpy memset notesel noteadd notedel noteload notesave randomize noteunsel noteget split strrep setease button chgdisp exec dialog mmload mmplay mmstop mci pset pget syscolor mes print title pos circle cls font sysfont objsize picload color palcolor palette redraw width gsel gcopy gzoom gmode bmpsave hsvcolor getkey listbox chkbox combox input mesbox buffer screen bgscr mouse objsel groll line clrobj boxf objprm objmode stick grect grotate gsquare gradf objimage objskip objenable celload celdiv celput newcom querycom delcom cnvstow comres axobj winobj sendmsg comevent comevarg sarrayconv callfunc cnvwtos comevdisp libptr system hspstat hspver stat cnt err strsize looplev sublev iparam wparam lparam refstr refdval int rnd strlen length length2 length3 length4 vartype gettime peek wpeek lpeek varptr varuse noteinfo instr abs limit getease str strmid strf getpath strtrim sin cos tan atan sqrt double absf expf logf limitf powf geteasef mousex mousey mousew hwnd hinstance hdc ginfo objinfo dirinfo sysinfo thismod __hspver__ __hsp30__ __date__ __time__ __line__ __file__ _debug __hspdef__ and or xor not screen_normal screen_palette screen_hide screen_fixedsize screen_tool screen_frame gmode_gdi gmode_mem gmode_rgb0 gmode_alpha gmode_rgb0alpha gmode_add gmode_sub gmode_pixela ginfo_mx ginfo_my ginfo_act ginfo_sel ginfo_wx1 ginfo_wy1 ginfo_wx2 ginfo_wy2 ginfo_vx ginfo_vy ginfo_sizex ginfo_sizey ginfo_winx ginfo_winy ginfo_mesx ginfo_mesy ginfo_r ginfo_g ginfo_b ginfo_paluse ginfo_dispx ginfo_dispy ginfo_cx ginfo_cy ginfo_intid ginfo_newid ginfo_sx ginfo_sy objinfo_mode objinfo_bmscr objinfo_hwnd notemax notesize dir_cur dir_exe dir_win dir_sys dir_cmdline dir_desktop dir_mydoc dir_tv font_normal font_bold font_italic font_underline font_strikeout font_antialias objmode_normal objmode_guifont objmode_usefont gsquare_grad msgothic msmincho do until while wend for next _break _continue switch case default swbreak swend ddim ldim alloc m_pi rad2deg deg2rad ease_linear ease_quad_in ease_quad_out ease_quad_inout ease_cubic_in ease_cubic_out ease_cubic_inout ease_quartic_in ease_quartic_out ease_quartic_inout ease_bounce_in ease_bounce_out ease_bounce_inout ease_shake_in ease_shake_out ease_shake_inout ease_loop"
        },
        contains: [e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, e.QUOTE_STRING_MODE, e.APOS_STRING_MODE, {
          className: "string",
          begin: /\{"/,
          end: /"\}/,
          contains: [e.BACKSLASH_ESCAPE]
        }, e.COMMENT(";", "$", {
          relevance: 0
        }), {
          className: "meta",
          begin: "#",
          end: "$",
          keywords: {
            keyword: "addion cfunc cmd cmpopt comfunc const defcfunc deffunc define else endif enum epack func global if ifdef ifndef include modcfunc modfunc modinit modterm module pack packopt regcmd runtime undef usecom uselib"
          },
          contains: [e.inherit(e.QUOTE_STRING_MODE, {
            className: "string"
          }), e.NUMBER_MODE, e.C_NUMBER_MODE, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE]
        }, {
          className: "symbol",
          begin: "^\\*(\\w+|@)"
        }, e.NUMBER_MODE, e.C_NUMBER_MODE]
      };
    }
    jEa.exports = TCp;
  });
  var GEa = __commonJS((UJy, WEa) => {
    function ECp(e) {
      let t = e.regex;
      let n = "HTTP/([32]|1\\.[01])";
      let r = /[A-Za-z][A-Za-z0-9-]*/;
      let o = {
        className: "attribute",
        begin: t.concat("^", r, "(?=\\:\\s)"),
        starts: {
          contains: [{
            className: "punctuation",
            begin: /: /,
            relevance: 0,
            starts: {
              end: "$",
              relevance: 0
            }
          }]
        }
      };
      let s = [o, {
        begin: "\\n\\n",
        starts: {
          subLanguage: [],
          endsWithParent: true
        }
      }];
      return {
        name: "HTTP",
        aliases: ["https"],
        illegal: /\S/,
        contains: [{
          begin: "^(?=HTTP/([32]|1\\.[01]) \\d{3})",
          end: /$/,
          contains: [{
            className: "meta",
            begin: "HTTP/([32]|1\\.[01])"
          }, {
            className: "number",
            begin: "\\b\\d{3}\\b"
          }],
          starts: {
            end: /\b\B/,
            illegal: /\S/,
            contains: s
          }
        }, {
          begin: "(?=^[A-Z]+ (.*?) HTTP/([32]|1\\.[01])$)",
          end: /$/,
          contains: [{
            className: "string",
            begin: " ",
            end: " ",
            excludeBegin: true,
            excludeEnd: true
          }, {
            className: "meta",
            begin: "HTTP/([32]|1\\.[01])"
          }, {
            className: "keyword",
            begin: "[A-Z]+"
          }],
          starts: {
            end: /\b\B/,
            illegal: /\S/,
            contains: s
          }
        }, e.inherit(o, {
          relevance: 0
        })]
      };
    }
    WEa.exports = ECp;
  });
  var zEa = __commonJS((BJy, VEa) => {
    function vCp(e) {
      let n = "[a-zA-Z_\\-!.?+*=<>&#'][a-zA-Z_\\-!.?+*=<>&#'0-9/;:]*";
      let r = {
        $pattern: n,
        built_in: "!= % %= & &= * ** **= *= *map + += , --build-class-- --import-- -= . / // //= /= < << <<= <= = > >= >> >>= @ @= ^ ^= abs accumulate all and any ap-compose ap-dotimes ap-each ap-each-while ap-filter ap-first ap-if ap-last ap-map ap-map-when ap-pipe ap-reduce ap-reject apply as-> ascii assert assoc bin break butlast callable calling-module-name car case cdr chain chr coll? combinations compile compress cond cons cons? continue count curry cut cycle dec def default-method defclass defmacro defmacro-alias defmacro/g! defmain defmethod defmulti defn defn-alias defnc defnr defreader defseq del delattr delete-route dict-comp dir disassemble dispatch-reader-macro distinct divmod do doto drop drop-last drop-while empty? end-sequence eval eval-and-compile eval-when-compile even? every? except exec filter first flatten float? fn fnc fnr for for* format fraction genexpr gensym get getattr global globals group-by hasattr hash hex id identity if if* if-not if-python2 import in inc input instance? integer integer-char? integer? interleave interpose is is-coll is-cons is-empty is-even is-every is-float is-instance is-integer is-integer-char is-iterable is-iterator is-keyword is-neg is-none is-not is-numeric is-odd is-pos is-string is-symbol is-zero isinstance islice issubclass iter iterable? iterate iterator? keyword keyword? lambda last len let lif lif-not list* list-comp locals loop macro-error macroexpand macroexpand-1 macroexpand-all map max merge-with method-decorator min multi-decorator multicombinations name neg? next none? nonlocal not not-in not? nth numeric? oct odd? open or ord partition permutations pos? post-route postwalk pow prewalk print product profile/calls profile/cpu put-route quasiquote quote raise range read read-str recursive-replace reduce remove repeat repeatedly repr require rest round route route-with-methods rwm second seq set-comp setattr setv some sorted string string? sum switch symbol? take take-nth take-while tee try unless unquote unquote-splicing vars walk when while with with* with-decorator with-gensyms xi xor yield yield-from zero? zip zip-longest | |= ~"
      };
      let o = "[-+]?\\d+(\\.\\d+)?";
      let s = {
        begin: n,
        relevance: 0
      };
      let i = {
        className: "number",
        begin: "[-+]?\\d+(\\.\\d+)?",
        relevance: 0
      };
      let a = e.inherit(e.QUOTE_STRING_MODE, {
        illegal: null
      });
      let l = e.COMMENT(";", "$", {
        relevance: 0
      });
      let c = {
        className: "literal",
        begin: /\b([Tt]rue|[Ff]alse|nil|None)\b/
      };
      let u = {
        begin: "[\\[\\{]",
        end: "[\\]\\}]",
        relevance: 0
      };
      let d = {
        className: "comment",
        begin: "\\^" + n
      };
      let p = e.COMMENT("\\^\\{", "\\}");
      let m = {
        className: "symbol",
        begin: "[:]{1,2}" + n
      };
      let f = {
        begin: "\\(",
        end: "\\)"
      };
      let h = {
        endsWithParent: true,
        relevance: 0
      };
      let g = {
        className: "name",
        relevance: 0,
        keywords: r,
        begin: n,
        starts: h
      };
      let y = [f, a, d, p, l, m, u, i, c, s];
      f.contains = [e.COMMENT("comment", ""), g, h];
      h.contains = y;
      u.contains = y;
      return {
        name: "Hy",
        aliases: ["hylang"],
        illegal: /\S/,
        contains: [e.SHEBANG(), f, a, d, p, l, m, u, i, c]
      };
    }
    VEa.exports = vCp;
  });
  var YEa = __commonJS(($Jy, KEa) => {
    function wCp(e) {
      return {
        name: "Inform 7",
        aliases: ["i7"],
        case_insensitive: true,
        keywords: {
          keyword: "thing room person man woman animal container supporter backdrop door scenery open closed locked inside gender is are say understand kind of rule"
        },
        contains: [{
          className: "string",
          begin: '"',
          end: '"',
          relevance: 0,
          contains: [{
            className: "subst",
            begin: "\\[",
            end: "\\]"
          }]
        }, {
          className: "section",
          begin: /^(Volume|Book|Part|Chapter|Section|Table)\b/,
          end: "$"
        }, {
          begin: /^(Check|Carry out|Report|Instead of|To|Rule|When|Before|After)\b/,
          end: ":",
          contains: [{
            begin: "\\(This",
            end: "\\)"
          }]
        }, {
          className: "comment",
          begin: "\\[",
          end: "\\]",
          contains: ["self"]
        }]
      };
    }
    KEa.exports = wCp;
  });
  var XEa = __commonJS((HJy, JEa) => {
    function CCp(e) {
      let t = e.regex;
      let n = {
        className: "number",
        relevance: 0,
        variants: [{
          begin: /([+-]+)?[\d]+_[\d_]+/
        }, {
          begin: e.NUMBER_RE
        }]
      };
      let r = e.COMMENT();
      r.variants = [{
        begin: /;/,
        end: /$/
      }, {
        begin: /#/,
        end: /$/
      }];
      let o = {
        className: "variable",
        variants: [{
          begin: /\$[\w\d"][\w\d_]*/
        }, {
          begin: /\$\{(.*?)\}/
        }]
      };
      let s = {
        className: "literal",
        begin: /\bon|off|true|false|yes|no\b/
      };
      let i = {
        className: "string",
        contains: [e.BACKSLASH_ESCAPE],
        variants: [{
          begin: "'''",
          end: "'''",
          relevance: 10
        }, {
          begin: '"""',
          end: '"""',
          relevance: 10
        }, {
          begin: '"',
          end: '"'
        }, {
          begin: "'",
          end: "'"
        }]
      };
      let a = {
        begin: /\[/,
        end: /\]/,
        contains: [r, s, o, i, n, "self"],
        relevance: 0
      };
      let l = /[A-Za-z0-9_-]+/;
      let c = /"(\\"|[^"])*"/;
      let u = /'[^']*'/;
      let d = t.either(l, c, u);
      let p = t.concat(d, "(\\s*\\.\\s*", d, ")*", t.lookahead(/\s*=\s*[^#\s]/));
      return {
        name: "TOML, also INI",
        aliases: ["toml"],
        case_insensitive: true,
        illegal: /\S/,
        contains: [r, {
          className: "section",
          begin: /\[+/,
          end: /\]+/
        }, {
          begin: p,
          className: "attr",
          starts: {
            end: /$/,
            contains: [r, a, s, o, i, n]
          }
        }]
      };
    }
    JEa.exports = CCp;
  });
  var ZEa = __commonJS((jJy, QEa) => {
    function RCp(e) {
      let t = e.regex;
      let n = {
        className: "params",
        begin: "\\(",
        end: "\\)"
      };
      let r = /(_[a-z_\d]+)?/;
      let o = /([de][+-]?\d+)?/;
      let s = {
        className: "number",
        variants: [{
          begin: t.concat(/\b\d+/, /\.(\d*)/, o, r)
        }, {
          begin: t.concat(/\b\d+/, o, r)
        }, {
          begin: t.concat(/\.\d+/, o, r)
        }],
        relevance: 0
      };
      return {
        name: "IRPF90",
        case_insensitive: true,
        keywords: {
          literal: ".False. .True.",
          keyword: "kind do while private call intrinsic where elsewhere type endtype endmodule endselect endinterface end enddo endif if forall endforall only contains default return stop then public subroutine|10 function program .and. .or. .not. .le. .eq. .ge. .gt. .lt. goto save else use module select case access blank direct exist file fmt form formatted iostat name named nextrec number opened rec recl sequential status unformatted unit continue format pause cycle exit c_null_char c_alert c_backspace c_form_feed flush wait decimal round iomsg synchronous nopass non_overridable pass protected volatile abstract extends import non_intrinsic value deferred generic final enumerator class associate bind enum c_int c_short c_long c_long_long c_signed_char c_size_t c_int8_t c_int16_t c_int32_t c_int64_t c_int_least8_t c_int_least16_t c_int_least32_t c_int_least64_t c_int_fast8_t c_int_fast16_t c_int_fast32_t c_int_fast64_t c_intmax_t C_intptr_t c_float c_double c_long_double c_float_complex c_double_complex c_long_double_complex c_bool c_char c_null_ptr c_null_funptr c_new_line c_carriage_return c_horizontal_tab c_vertical_tab iso_c_binding c_loc c_funloc c_associated  c_f_pointer c_ptr c_funptr iso_fortran_env character_storage_size error_unit file_storage_size input_unit iostat_end iostat_eor numeric_storage_size output_unit c_f_procpointer ieee_arithmetic ieee_support_underflow_control ieee_get_underflow_mode ieee_set_underflow_mode newunit contiguous recursive pad position action delim readwrite eor advance nml interface procedure namelist include sequence elemental pure integer real character complex logical dimension allocatable|10 parameter external implicit|10 none double precision assign intent optional pointer target in out common equivalence data begin_provider &begin_provider end_provider begin_shell end_shell begin_template end_template subst assert touch soft_touch provide no_dep free irp_if irp_else irp_endif irp_write irp_read",
          built_in: "alog alog10 amax0 amax1 amin0 amin1 amod cabs ccos cexp clog csin csqrt dabs dacos dasin datan datan2 dcos dcosh ddim dexp dint dlog dlog10 dmax1 dmin1 dmod dnint dsign dsin dsinh dsqrt dtan dtanh float iabs idim idint idnint ifix isign max0 max1 min0 min1 sngl algama cdabs cdcos cdexp cdlog cdsin cdsqrt cqabs cqcos cqexp cqlog cqsin cqsqrt dcmplx dconjg derf derfc dfloat dgamma dimag dlgama iqint qabs qacos qasin qatan qatan2 qcmplx qconjg qcos qcosh qdim qerf qerfc qexp qgamma qimag qlgama qlog qlog10 qmax1 qmin1 qmod qnint qsign qsin qsinh qsqrt qtan qtanh abs acos aimag aint anint asin atan atan2 char cmplx conjg cos cosh exp ichar index int log log10 max min nint sign sin sinh sqrt tan tanh print write dim lge lgt lle llt mod nullify allocate deallocate adjustl adjustr all allocated any associated bit_size btest ceiling count cshift date_and_time digits dot_product eoshift epsilon exponent floor fraction huge iand ibclr ibits ibset ieor ior ishft ishftc lbound len_trim matmul maxexponent maxloc maxval merge minexponent minloc minval modulo mvbits nearest pack present product radix random_number random_seed range repeat reshape rrspacing scale scan selected_int_kind selected_real_kind set_exponent shape size spacing spread sum system_clock tiny transpose trim ubound unpack verify achar iachar transfer dble entry dprod cpu_time command_argument_count get_command get_command_argument get_environment_variable is_iostat_end ieee_arithmetic ieee_support_underflow_control ieee_get_underflow_mode ieee_set_underflow_mode is_iostat_eor move_alloc new_line selected_char_kind same_type_as extends_type_of acosh asinh atanh bessel_j0 bessel_j1 bessel_jn bessel_y0 bessel_y1 bessel_yn erf erfc erfc_scaled gamma log_gamma hypot norm2 atomic_define atomic_ref execute_command_line leadz trailz storage_size merge_bits bge bgt ble blt dshiftl dshiftr findloc iall iany iparity image_index lcobound ucobound maskl maskr num_images parity popcnt poppar shifta shiftl shiftr this_image IRP_ALIGN irp_here"
        },
        illegal: /\/\*/,
        contains: [e.inherit(e.APOS_STRING_MODE, {
          className: "string",
          relevance: 0
        }), e.inherit(e.QUOTE_STRING_MODE, {
          className: "string",
          relevance: 0
        }), {
          className: "function",
          beginKeywords: "subroutine function program",
          illegal: "[${=\\n]",
          contains: [e.UNDERSCORE_TITLE_MODE, n]
        }, e.COMMENT("!", "$", {
          relevance: 0
        }), e.COMMENT("begin_doc", "end_doc", {
          relevance: 10
        }), s]
      };
    }
    QEa.exports = RCp;
  });
  var tva = __commonJS((qJy, eva) => {
    function xCp(e) {
      let r = "and \u0438 else \u0438\u043D\u0430\u0447\u0435 endexcept endfinally endforeach \u043A\u043E\u043D\u0435\u0446\u0432\u0441\u0435 endif \u043A\u043E\u043D\u0435\u0446\u0435\u0441\u043B\u0438 endwhile \u043A\u043E\u043D\u0435\u0446\u043F\u043E\u043A\u0430 " + "except exitfor finally foreach \u0432\u0441\u0435 if \u0435\u0441\u043B\u0438 in \u0432 not \u043D\u0435 or \u0438\u043B\u0438 try while \u043F\u043E\u043A\u0430 ";
      let o = "SYSRES_CONST_ACCES_RIGHT_TYPE_EDIT SYSRES_CONST_ACCES_RIGHT_TYPE_FULL SYSRES_CONST_ACCES_RIGHT_TYPE_VIEW SYSRES_CONST_ACCESS_MODE_REQUISITE_CODE SYSRES_CONST_ACCESS_NO_ACCESS_VIEW SYSRES_CONST_ACCESS_NO_ACCESS_VIEW_CODE SYSRES_CONST_ACCESS_RIGHTS_ADD_REQUISITE_CODE SYSRES_CONST_ACCESS_RIGHTS_ADD_REQUISITE_YES_CODE SYSRES_CONST_ACCESS_RIGHTS_CHANGE_REQUISITE_CODE SYSRES_CONST_ACCESS_RIGHTS_CHANGE_REQUISITE_YES_CODE SYSRES_CONST_ACCESS_RIGHTS_DELETE_REQUISITE_CODE SYSRES_CONST_ACCESS_RIGHTS_DELETE_REQUISITE_YES_CODE SYSRES_CONST_ACCESS_RIGHTS_EXECUTE_REQUISITE_CODE SYSRES_CONST_ACCESS_RIGHTS_EXECUTE_REQUISITE_YES_CODE SYSRES_CONST_ACCESS_RIGHTS_NO_ACCESS_REQUISITE_CODE SYSRES_CONST_ACCESS_RIGHTS_NO_ACCESS_REQUISITE_YES_CODE SYSRES_CONST_ACCESS_RIGHTS_RATIFY_REQUISITE_CODE SYSRES_CONST_ACCESS_RIGHTS_RATIFY_REQUISITE_YES_CODE SYSRES_CONST_ACCESS_RIGHTS_REQUISITE_CODE SYSRES_CONST_ACCESS_RIGHTS_VIEW SYSRES_CONST_ACCESS_RIGHTS_VIEW_CODE SYSRES_CONST_ACCESS_RIGHTS_VIEW_REQUISITE_CODE SYSRES_CONST_ACCESS_RIGHTS_VIEW_REQUISITE_YES_CODE SYSRES_CONST_ACCESS_TYPE_CHANGE SYSRES_CONST_ACCESS_TYPE_CHANGE_CODE SYSRES_CONST_ACCESS_TYPE_EXISTS SYSRES_CONST_ACCESS_TYPE_EXISTS_CODE SYSRES_CONST_ACCESS_TYPE_FULL SYSRES_CONST_ACCESS_TYPE_FULL_CODE SYSRES_CONST_ACCESS_TYPE_VIEW SYSRES_CONST_ACCESS_TYPE_VIEW_CODE SYSRES_CONST_ACTION_TYPE_ABORT SYSRES_CONST_ACTION_TYPE_ACCEPT SYSRES_CONST_ACTION_TYPE_ACCESS_RIGHTS SYSRES_CONST_ACTION_TYPE_ADD_ATTACHMENT SYSRES_CONST_ACTION_TYPE_CHANGE_CARD SYSRES_CONST_ACTION_TYPE_CHANGE_KIND SYSRES_CONST_ACTION_TYPE_CHANGE_STORAGE SYSRES_CONST_ACTION_TYPE_CONTINUE SYSRES_CONST_ACTION_TYPE_COPY SYSRES_CONST_ACTION_TYPE_CREATE SYSRES_CONST_ACTION_TYPE_CREATE_VERSION SYSRES_CONST_ACTION_TYPE_DELETE SYSRES_CONST_ACTION_TYPE_DELETE_ATTACHMENT SYSRES_CONST_ACTION_TYPE_DELETE_VERSION SYSRES_CONST_ACTION_TYPE_DISABLE_DELEGATE_ACCESS_RIGHTS SYSRES_CONST_ACTION_TYPE_ENABLE_DELEGATE_ACCESS_RIGHTS SYSRES_CONST_ACTION_TYPE_ENCRYPTION_BY_CERTIFICATE SYSRES_CONST_ACTION_TYPE_ENCRYPTION_BY_CERTIFICATE_AND_PASSWORD SYSRES_CONST_ACTION_TYPE_ENCRYPTION_BY_PASSWORD SYSRES_CONST_ACTION_TYPE_EXPORT_WITH_LOCK SYSRES_CONST_ACTION_TYPE_EXPORT_WITHOUT_LOCK SYSRES_CONST_ACTION_TYPE_IMPORT_WITH_UNLOCK SYSRES_CONST_ACTION_TYPE_IMPORT_WITHOUT_UNLOCK SYSRES_CONST_ACTION_TYPE_LIFE_CYCLE_STAGE SYSRES_CONST_ACTION_TYPE_LOCK SYSRES_CONST_ACTION_TYPE_LOCK_FOR_SERVER SYSRES_CONST_ACTION_TYPE_LOCK_MODIFY SYSRES_CONST_ACTION_TYPE_MARK_AS_READED SYSRES_CONST_ACTION_TYPE_MARK_AS_UNREADED SYSRES_CONST_ACTION_TYPE_MODIFY SYSRES_CONST_ACTION_TYPE_MODIFY_CARD SYSRES_CONST_ACTION_TYPE_MOVE_TO_ARCHIVE SYSRES_CONST_ACTION_TYPE_OFF_ENCRYPTION SYSRES_CONST_ACTION_TYPE_PASSWORD_CHANGE SYSRES_CONST_ACTION_TYPE_PERFORM SYSRES_CONST_ACTION_TYPE_RECOVER_FROM_LOCAL_COPY SYSRES_CONST_ACTION_TYPE_RESTART SYSRES_CONST_ACTION_TYPE_RESTORE_FROM_ARCHIVE SYSRES_CONST_ACTION_TYPE_REVISION SYSRES_CONST_ACTION_TYPE_SEND_BY_MAIL SYSRES_CONST_ACTION_TYPE_SIGN SYSRES_CONST_ACTION_TYPE_START SYSRES_CONST_ACTION_TYPE_UNLOCK SYSRES_CONST_ACTION_TYPE_UNLOCK_FROM_SERVER SYSRES_CONST_ACTION_TYPE_VERSION_STATE SYSRES_CONST_ACTION_TYPE_VERSION_VISIBILITY SYSRES_CONST_ACTION_TYPE_VIEW SYSRES_CONST_ACTION_TYPE_VIEW_SHADOW_COPY SYSRES_CONST_ACTION_TYPE_WORKFLOW_DESCRIPTION_MODIFY SYSRES_CONST_ACTION_TYPE_WRITE_HISTORY SYSRES_CONST_ACTIVE_VERSION_STATE_PICK_VALUE SYSRES_CONST_ADD_REFERENCE_MODE_NAME SYSRES_CONST_ADDITION_REQUISITE_CODE SYSRES_CONST_ADDITIONAL_PARAMS_REQUISITE_CODE SYSRES_CONST_ADITIONAL_JOB_END_DATE_REQUISITE_NAME SYSRES_CONST_ADITIONAL_JOB_READ_REQUISITE_NAME SYSRES_CONST_ADITIONAL_JOB_START_DATE_REQUISITE_NAME SYSRES_CONST_ADITIONAL_JOB_STATE_REQUISITE_NAME SYSRES_CONST_ADMINISTRATION_HISTORY_ADDING_USER_TO_GROUP_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_ADDING_USER_TO_GROUP_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_CREATION_COMP_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_CREATION_COMP_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_CREATION_GROUP_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_CREATION_GROUP_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_CREATION_USER_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_CREATION_USER_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_DATABASE_USER_CREATION SYSRES_CONST_ADMINISTRATION_HISTORY_DATABASE_USER_CREATION_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_DATABASE_USER_DELETION SYSRES_CONST_ADMINISTRATION_HISTORY_DATABASE_USER_DELETION_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_DELETION_COMP_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_DELETION_COMP_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_DELETION_GROUP_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_DELETION_GROUP_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_DELETION_USER_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_DELETION_USER_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_DELETION_USER_FROM_GROUP_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_DELETION_USER_FROM_GROUP_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_GRANTING_FILTERER_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_GRANTING_FILTERER_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_GRANTING_FILTERER_RESTRICTION_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_GRANTING_FILTERER_RESTRICTION_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_GRANTING_PRIVILEGE_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_GRANTING_PRIVILEGE_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_GRANTING_RIGHTS_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_GRANTING_RIGHTS_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_IS_MAIN_SERVER_CHANGED_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_IS_MAIN_SERVER_CHANGED_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_IS_PUBLIC_CHANGED_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_IS_PUBLIC_CHANGED_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_REMOVING_FILTERER_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_REMOVING_FILTERER_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_REMOVING_FILTERER_RESTRICTION_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_REMOVING_FILTERER_RESTRICTION_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_REMOVING_PRIVILEGE_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_REMOVING_PRIVILEGE_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_REMOVING_RIGHTS_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_REMOVING_RIGHTS_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_SERVER_LOGIN_CREATION SYSRES_CONST_ADMINISTRATION_HISTORY_SERVER_LOGIN_CREATION_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_SERVER_LOGIN_DELETION SYSRES_CONST_ADMINISTRATION_HISTORY_SERVER_LOGIN_DELETION_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_UPDATING_CATEGORY_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_UPDATING_CATEGORY_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_UPDATING_COMP_TITLE_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_UPDATING_COMP_TITLE_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_UPDATING_FULL_NAME_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_UPDATING_FULL_NAME_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_UPDATING_GROUP_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_UPDATING_GROUP_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_UPDATING_PARENT_GROUP_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_UPDATING_PARENT_GROUP_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_UPDATING_USER_AUTH_TYPE_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_UPDATING_USER_AUTH_TYPE_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_UPDATING_USER_LOGIN_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_UPDATING_USER_LOGIN_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_UPDATING_USER_STATUS_ACTION SYSRES_CONST_ADMINISTRATION_HISTORY_UPDATING_USER_STATUS_ACTION_CODE SYSRES_CONST_ADMINISTRATION_HISTORY_USER_PASSWORD_CHANGE SYSRES_CONST_ADMINISTRATION_HISTORY_USER_PASSWORD_CHANGE_ACTION SYSRES_CONST_ALL_ACCEPT_CONDITION_RUS SYSRES_CONST_ALL_USERS_GROUP SYSRES_CONST_ALL_USERS_GROUP_NAME SYSRES_CONST_ALL_USERS_SERVER_GROUP_NAME SYSRES_CONST_ALLOWED_ACCESS_TYPE_CODE SYSRES_CONST_ALLOWED_ACCESS_TYPE_NAME SYSRES_CONST_APP_VIEWER_TYPE_REQUISITE_CODE SYSRES_CONST_APPROVING_SIGNATURE_NAME SYSRES_CONST_APPROVING_SIGNATURE_REQUISITE_CODE SYSRES_CONST_ASSISTANT_SUBSTITUE_TYPE SYSRES_CONST_ASSISTANT_SUBSTITUE_TYPE_CODE SYSRES_CONST_ATTACH_TYPE_COMPONENT_TOKEN SYSRES_CONST_ATTACH_TYPE_DOC SYSRES_CONST_ATTACH_TYPE_EDOC SYSRES_CONST_ATTACH_TYPE_FOLDER SYSRES_CONST_ATTACH_TYPE_JOB SYSRES_CONST_ATTACH_TYPE_REFERENCE SYSRES_CONST_ATTACH_TYPE_TASK SYSRES_CONST_AUTH_ENCODED_PASSWORD SYSRES_CONST_AUTH_ENCODED_PASSWORD_CODE SYSRES_CONST_AUTH_NOVELL SYSRES_CONST_AUTH_PASSWORD SYSRES_CONST_AUTH_PASSWORD_CODE SYSRES_CONST_AUTH_WINDOWS SYSRES_CONST_AUTHENTICATING_SIGNATURE_NAME SYSRES_CONST_AUTHENTICATING_SIGNATURE_REQUISITE_CODE SYSRES_CONST_AUTO_ENUM_METHOD_FLAG SYSRES_CONST_AUTO_NUMERATION_CODE SYSRES_CONST_AUTO_STRONG_ENUM_METHOD_FLAG SYSRES_CONST_AUTOTEXT_NAME_REQUISITE_CODE SYSRES_CONST_AUTOTEXT_TEXT_REQUISITE_CODE SYSRES_CONST_AUTOTEXT_USAGE_ALL SYSRES_CONST_AUTOTEXT_USAGE_ALL_CODE SYSRES_CONST_AUTOTEXT_USAGE_SIGN SYSRES_CONST_AUTOTEXT_USAGE_SIGN_CODE SYSRES_CONST_AUTOTEXT_USAGE_WORK SYSRES_CONST_AUTOTEXT_USAGE_WORK_CODE SYSRES_CONST_AUTOTEXT_USE_ANYWHERE_CODE SYSRES_CONST_AUTOTEXT_USE_ON_SIGNING_CODE SYSRES_CONST_AUTOTEXT_USE_ON_WORK_CODE SYSRES_CONST_BEGIN_DATE_REQUISITE_CODE SYSRES_CONST_BLACK_LIFE_CYCLE_STAGE_FONT_COLOR SYSRES_CONST_BLUE_LIFE_CYCLE_STAGE_FONT_COLOR SYSRES_CONST_BTN_PART SYSRES_CONST_CALCULATED_ROLE_TYPE_CODE SYSRES_CONST_CALL_TYPE_VARIABLE_BUTTON_VALUE SYSRES_CONST_CALL_TYPE_VARIABLE_PROGRAM_VALUE SYSRES_CONST_CANCEL_MESSAGE_FUNCTION_RESULT SYSRES_CONST_CARD_PART SYSRES_CONST_CARD_REFERENCE_MODE_NAME SYSRES_CONST_CERTIFICATE_TYPE_REQUISITE_ENCRYPT_VALUE SYSRES_CONST_CERTIFICATE_TYPE_REQUISITE_SIGN_AND_ENCRYPT_VALUE SYSRES_CONST_CERTIFICATE_TYPE_REQUISITE_SIGN_VALUE SYSRES_CONST_CHECK_PARAM_VALUE_DATE_PARAM_TYPE SYSRES_CONST_CHECK_PARAM_VALUE_FLOAT_PARAM_TYPE SYSRES_CONST_CHECK_PARAM_VALUE_INTEGER_PARAM_TYPE SYSRES_CONST_CHECK_PARAM_VALUE_PICK_PARAM_TYPE SYSRES_CONST_CHECK_PARAM_VALUE_REEFRENCE_PARAM_TYPE SYSRES_CONST_CLOSED_RECORD_FLAG_VALUE_FEMININE SYSRES_CONST_CLOSED_RECORD_FLAG_VALUE_MASCULINE SYSRES_CONST_CODE_COMPONENT_TYPE_ADMIN SYSRES_CONST_CODE_COMPONENT_TYPE_DEVELOPER SYSRES_CONST_CODE_COMPONENT_TYPE_DOCS SYSRES_CONST_CODE_COMPONENT_TYPE_EDOC_CARDS SYSRES_CONST_CODE_COMPONENT_TYPE_EXTERNAL_EXECUTABLE SYSRES_CONST_CODE_COMPONENT_TYPE_OTHER SYSRES_CONST_CODE_COMPONENT_TYPE_REFERENCE SYSRES_CONST_CODE_COMPONENT_TYPE_REPORT SYSRES_CONST_CODE_COMPONENT_TYPE_SCRIPT SYSRES_CONST_CODE_COMPONENT_TYPE_URL SYSRES_CONST_CODE_REQUISITE_ACCESS SYSRES_CONST_CODE_REQUISITE_CODE SYSRES_CONST_CODE_REQUISITE_COMPONENT SYSRES_CONST_CODE_REQUISITE_DESCRIPTION SYSRES_CONST_CODE_REQUISITE_EXCLUDE_COMPONENT SYSRES_CONST_CODE_REQUISITE_RECORD SYSRES_CONST_COMMENT_REQ_CODE SYSRES_CONST_COMMON_SETTINGS_REQUISITE_CODE SYSRES_CONST_COMP_CODE_GRD SYSRES_CONST_COMPONENT_GROUP_TYPE_REQUISITE_CODE SYSRES_CONST_COMPONENT_TYPE_ADMIN_COMPONENTS SYSRES_CONST_COMPONENT_TYPE_DEVELOPER_COMPONENTS SYSRES_CONST_COMPONENT_TYPE_DOCS SYSRES_CONST_COMPONENT_TYPE_EDOC_CARDS SYSRES_CONST_COMPONENT_TYPE_EDOCS SYSRES_CONST_COMPONENT_TYPE_EXTERNAL_EXECUTABLE SYSRES_CONST_COMPONENT_TYPE_OTHER SYSRES_CONST_COMPONENT_TYPE_REFERENCE_TYPES SYSRES_CONST_COMPONENT_TYPE_REFERENCES SYSRES_CONST_COMPONENT_TYPE_REPORTS SYSRES_CONST_COMPONENT_TYPE_SCRIPTS SYSRES_CONST_COMPONENT_TYPE_URL SYSRES_CONST_COMPONENTS_REMOTE_SERVERS_VIEW_CODE SYSRES_CONST_CONDITION_BLOCK_DESCRIPTION SYSRES_CONST_CONST_FIRM_STATUS_COMMON SYSRES_CONST_CONST_FIRM_STATUS_INDIVIDUAL SYSRES_CONST_CONST_NEGATIVE_VALUE SYSRES_CONST_CONST_POSITIVE_VALUE SYSRES_CONST_CONST_SERVER_STATUS_DONT_REPLICATE SYSRES_CONST_CONST_SERVER_STATUS_REPLICATE SYSRES_CONST_CONTENTS_REQUISITE_CODE SYSRES_CONST_DATA_TYPE_BOOLEAN SYSRES_CONST_DATA_TYPE_DATE SYSRES_CONST_DATA_TYPE_FLOAT SYSRES_CONST_DATA_TYPE_INTEGER SYSRES_CONST_DATA_TYPE_PICK SYSRES_CONST_DATA_TYPE_REFERENCE SYSRES_CONST_DATA_TYPE_STRING SYSRES_CONST_DATA_TYPE_TEXT SYSRES_CONST_DATA_TYPE_VARIANT SYSRES_CONST_DATE_CLOSE_REQ_CODE SYSRES_CONST_DATE_FORMAT_DATE_ONLY_CHAR SYSRES_CONST_DATE_OPEN_REQ_CODE SYSRES_CONST_DATE_REQUISITE SYSRES_CONST_DATE_REQUISITE_CODE SYSRES_CONST_DATE_REQUISITE_NAME SYSRES_CONST_DATE_REQUISITE_TYPE SYSRES_CONST_DATE_TYPE_CHAR SYSRES_CONST_DATETIME_FORMAT_VALUE SYSRES_CONST_DEA_ACCESS_RIGHTS_ACTION_CODE SYSRES_CONST_DESCRIPTION_LOCALIZE_ID_REQUISITE_CODE SYSRES_CONST_DESCRIPTION_REQUISITE_CODE SYSRES_CONST_DET1_PART SYSRES_CONST_DET2_PART SYSRES_CONST_DET3_PART SYSRES_CONST_DET4_PART SYSRES_CONST_DET5_PART SYSRES_CONST_DET6_PART SYSRES_CONST_DETAIL_DATASET_KEY_REQUISITE_CODE SYSRES_CONST_DETAIL_PICK_REQUISITE_CODE SYSRES_CONST_DETAIL_REQ_CODE SYSRES_CONST_DO_NOT_USE_ACCESS_TYPE_CODE SYSRES_CONST_DO_NOT_USE_ACCESS_TYPE_NAME SYSRES_CONST_DO_NOT_USE_ON_VIEW_ACCESS_TYPE_CODE SYSRES_CONST_DO_NOT_USE_ON_VIEW_ACCESS_TYPE_NAME SYSRES_CONST_DOCUMENT_STORAGES_CODE SYSRES_CONST_DOCUMENT_TEMPLATES_TYPE_NAME SYSRES_CONST_DOUBLE_REQUISITE_CODE SYSRES_CONST_EDITOR_CLOSE_FILE_OBSERV_TYPE_CODE SYSRES_CONST_EDITOR_CLOSE_PROCESS_OBSERV_TYPE_CODE SYSRES_CONST_EDITOR_TYPE_REQUISITE_CODE SYSRES_CONST_EDITORS_APPLICATION_NAME_REQUISITE_CODE SYSRES_CONST_EDITORS_CREATE_SEVERAL_PROCESSES_REQUISITE_CODE SYSRES_CONST_EDITORS_EXTENSION_REQUISITE_CODE SYSRES_CONST_EDITORS_OBSERVER_BY_PROCESS_TYPE SYSRES_CONST_EDITORS_REFERENCE_CODE SYSRES_CONST_EDITORS_REPLACE_SPEC_CHARS_REQUISITE_CODE SYSRES_CONST_EDITORS_USE_PLUGINS_REQUISITE_CODE SYSRES_CONST_EDITORS_VIEW_DOCUMENT_OPENED_TO_EDIT_CODE SYSRES_CONST_EDOC_CARD_TYPE_REQUISITE_CODE SYSRES_CONST_EDOC_CARD_TYPES_LINK_REQUISITE_CODE SYSRES_CONST_EDOC_CERTIFICATE_AND_PASSWORD_ENCODE_CODE SYSRES_CONST_EDOC_CERTIFICATE_ENCODE_CODE SYSRES_CONST_EDOC_DATE_REQUISITE_CODE SYSRES_CONST_EDOC_KIND_REFERENCE_CODE SYSRES_CONST_EDOC_KINDS_BY_TEMPLATE_ACTION_CODE SYSRES_CONST_EDOC_MANAGE_ACCESS_CODE SYSRES_CONST_EDOC_NONE_ENCODE_CODE SYSRES_CONST_EDOC_NUMBER_REQUISITE_CODE SYSRES_CONST_EDOC_PASSWORD_ENCODE_CODE SYSRES_CONST_EDOC_READONLY_ACCESS_CODE SYSRES_CONST_EDOC_SHELL_LIFE_TYPE_VIEW_VALUE SYSRES_CONST_EDOC_SIZE_RESTRICTION_PRIORITY_REQUISITE_CODE SYSRES_CONST_EDOC_STORAGE_CHECK_ACCESS_RIGHTS_REQUISITE_CODE SYSRES_CONST_EDOC_STORAGE_COMPUTER_NAME_REQUISITE_CODE SYSRES_CONST_EDOC_STORAGE_DATABASE_NAME_REQUISITE_CODE SYSRES_CONST_EDOC_STORAGE_EDIT_IN_STORAGE_REQUISITE_CODE SYSRES_CONST_EDOC_STORAGE_LOCAL_PATH_REQUISITE_CODE SYSRES_CONST_EDOC_STORAGE_SHARED_SOURCE_NAME_REQUISITE_CODE SYSRES_CONST_EDOC_TEMPLATE_REQUISITE_CODE SYSRES_CONST_EDOC_TYPES_REFERENCE_CODE SYSRES_CONST_EDOC_VERSION_ACTIVE_STAGE_CODE SYSRES_CONST_EDOC_VERSION_DESIGN_STAGE_CODE SYSRES_CONST_EDOC_VERSION_OBSOLETE_STAGE_CODE SYSRES_CONST_EDOC_WRITE_ACCES_CODE SYSRES_CONST_EDOCUMENT_CARD_REQUISITES_REFERENCE_CODE_SELECTED_REQUISITE SYSRES_CONST_ENCODE_CERTIFICATE_TYPE_CODE SYSRES_CONST_END_DATE_REQUISITE_CODE SYSRES_CONST_ENUMERATION_TYPE_REQUISITE_CODE SYSRES_CONST_EXECUTE_ACCESS_RIGHTS_TYPE_CODE SYSRES_CONST_EXECUTIVE_FILE_STORAGE_TYPE SYSRES_CONST_EXIST_CONST SYSRES_CONST_EXIST_VALUE SYSRES_CONST_EXPORT_LOCK_TYPE_ASK SYSRES_CONST_EXPORT_LOCK_TYPE_WITH_LOCK SYSRES_CONST_EXPORT_LOCK_TYPE_WITHOUT_LOCK SYSRES_CONST_EXPORT_VERSION_TYPE_ASK SYSRES_CONST_EXPORT_VERSION_TYPE_LAST SYSRES_CONST_EXPORT_VERSION_TYPE_LAST_ACTIVE SYSRES_CONST_EXTENSION_REQUISITE_CODE SYSRES_CONST_FILTER_NAME_REQUISITE_CODE SYSRES_CONST_FILTER_REQUISITE_CODE SYSRES_CONST_FILTER_TYPE_COMMON_CODE SYSRES_CONST_FILTER_TYPE_COMMON_NAME SYSRES_CONST_FILTER_TYPE_USER_CODE SYSRES_CONST_FILTER_TYPE_USER_NAME SYSRES_CONST_FILTER_VALUE_REQUISITE_NAME SYSRES_CONST_FLOAT_NUMBER_FORMAT_CHAR SYSRES_CONST_FLOAT_REQUISITE_TYPE SYSRES_CONST_FOLDER_AUTHOR_VALUE SYSRES_CONST_FOLDER_KIND_ANY_OBJECTS SYSRES_CONST_FOLDER_KIND_COMPONENTS SYSRES_CONST_FOLDER_KIND_EDOCS SYSRES_CONST_FOLDER_KIND_JOBS SYSRES_CONST_FOLDER_KIND_TASKS SYSRES_CONST_FOLDER_TYPE_COMMON SYSRES_CONST_FOLDER_TYPE_COMPONENT SYSRES_CONST_FOLDER_TYPE_FAVORITES SYSRES_CONST_FOLDER_TYPE_INBOX SYSRES_CONST_FOLDER_TYPE_OUTBOX SYSRES_CONST_FOLDER_TYPE_QUICK_LAUNCH SYSRES_CONST_FOLDER_TYPE_SEARCH SYSRES_CONST_FOLDER_TYPE_SHORTCUTS SYSRES_CONST_FOLDER_TYPE_USER SYSRES_CONST_FROM_DICTIONARY_ENUM_METHOD_FLAG SYSRES_CONST_FULL_SUBSTITUTE_TYPE SYSRES_CONST_FULL_SUBSTITUTE_TYPE_CODE SYSRES_CONST_FUNCTION_CANCEL_RESULT SYSRES_CONST_FUNCTION_CATEGORY_SYSTEM SYSRES_CONST_FUNCTION_CATEGORY_USER SYSRES_CONST_FUNCTION_FAILURE_RESULT SYSRES_CONST_FUNCTION_SAVE_RESULT SYSRES_CONST_GENERATED_REQUISITE SYSRES_CONST_GREEN_LIFE_CYCLE_STAGE_FONT_COLOR SYSRES_CONST_GROUP_ACCOUNT_TYPE_VALUE_CODE SYSRES_CONST_GROUP_CATEGORY_NORMAL_CODE SYSRES_CONST_GROUP_CATEGORY_NORMAL_NAME SYSRES_CONST_GROUP_CATEGORY_SERVICE_CODE SYSRES_CONST_GROUP_CATEGORY_SERVICE_NAME SYSRES_CONST_GROUP_COMMON_CATEGORY_FIELD_VALUE SYSRES_CONST_GROUP_FULL_NAME_REQUISITE_CODE SYSRES_CONST_GROUP_NAME_REQUISITE_CODE SYSRES_CONST_GROUP_RIGHTS_T_REQUISITE_CODE SYSRES_CONST_GROUP_SERVER_CODES_REQUISITE_CODE SYSRES_CONST_GROUP_SERVER_NAME_REQUISITE_CODE SYSRES_CONST_GROUP_SERVICE_CATEGORY_FIELD_VALUE SYSRES_CONST_GROUP_USER_REQUISITE_CODE SYSRES_CONST_GROUPS_REFERENCE_CODE SYSRES_CONST_GROUPS_REQUISITE_CODE SYSRES_CONST_HIDDEN_MODE_NAME SYSRES_CONST_HIGH_LVL_REQUISITE_CODE SYSRES_CONST_HISTORY_ACTION_CREATE_CODE SYSRES_CONST_HISTORY_ACTION_DELETE_CODE SYSRES_CONST_HISTORY_ACTION_EDIT_CODE SYSRES_CONST_HOUR_CHAR SYSRES_CONST_ID_REQUISITE_CODE SYSRES_CONST_IDSPS_REQUISITE_CODE SYSRES_CONST_IMAGE_MODE_COLOR SYSRES_CONST_IMAGE_MODE_GREYSCALE SYSRES_CONST_IMAGE_MODE_MONOCHROME SYSRES_CONST_IMPORTANCE_HIGH SYSRES_CONST_IMPORTANCE_LOW SYSRES_CONST_IMPORTANCE_NORMAL SYSRES_CONST_IN_DESIGN_VERSION_STATE_PICK_VALUE SYSRES_CONST_INCOMING_WORK_RULE_TYPE_CODE SYSRES_CONST_INT_REQUISITE SYSRES_CONST_INT_REQUISITE_TYPE SYSRES_CONST_INTEGER_NUMBER_FORMAT_CHAR SYSRES_CONST_INTEGER_TYPE_CHAR SYSRES_CONST_IS_GENERATED_REQUISITE_NEGATIVE_VALUE SYSRES_CONST_IS_PUBLIC_ROLE_REQUISITE_CODE SYSRES_CONST_IS_REMOTE_USER_NEGATIVE_VALUE SYSRES_CONST_IS_REMOTE_USER_POSITIVE_VALUE SYSRES_CONST_IS_STORED_REQUISITE_NEGATIVE_VALUE SYSRES_CONST_IS_STORED_REQUISITE_STORED_VALUE SYSRES_CONST_ITALIC_LIFE_CYCLE_STAGE_DRAW_STYLE SYSRES_CONST_JOB_BLOCK_DESCRIPTION SYSRES_CONST_JOB_KIND_CONTROL_JOB SYSRES_CONST_JOB_KIND_JOB SYSRES_CONST_JOB_KIND_NOTICE SYSRES_CONST_JOB_STATE_ABORTED SYSRES_CONST_JOB_STATE_COMPLETE SYSRES_CONST_JOB_STATE_WORKING SYSRES_CONST_KIND_REQUISITE_CODE SYSRES_CONST_KIND_REQUISITE_NAME SYSRES_CONST_KINDS_CREATE_SHADOW_COPIES_REQUISITE_CODE SYSRES_CONST_KINDS_DEFAULT_EDOC_LIFE_STAGE_REQUISITE_CODE SYSRES_CONST_KINDS_EDOC_ALL_TEPLATES_ALLOWED_REQUISITE_CODE SYSRES_CONST_KINDS_EDOC_ALLOW_LIFE_CYCLE_STAGE_CHANGING_REQUISITE_CODE SYSRES_CONST_KINDS_EDOC_ALLOW_MULTIPLE_ACTIVE_VERSIONS_REQUISITE_CODE SYSRES_CONST_KINDS_EDOC_SHARE_ACCES_RIGHTS_BY_DEFAULT_CODE SYSRES_CONST_KINDS_EDOC_TEMPLATE_REQUISITE_CODE SYSRES_CONST_KINDS_EDOC_TYPE_REQUISITE_CODE SYSRES_CONST_KINDS_SIGNERS_REQUISITES_CODE SYSRES_CONST_KOD_INPUT_TYPE SYSRES_CONST_LAST_UPDATE_DATE_REQUISITE_CODE SYSRES_CONST_LIFE_CYCLE_START_STAGE_REQUISITE_CODE SYSRES_CONST_LILAC_LIFE_CYCLE_STAGE_FONT_COLOR SYSRES_CONST_LINK_OBJECT_KIND_COMPONENT SYSRES_CONST_LINK_OBJECT_KIND_DOCUMENT SYSRES_CONST_LINK_OBJECT_KIND_EDOC SYSRES_CONST_LINK_OBJECT_KIND_FOLDER SYSRES_CONST_LINK_OBJECT_KIND_JOB SYSRES_CONST_LINK_OBJECT_KIND_REFERENCE SYSRES_CONST_LINK_OBJECT_KIND_TASK SYSRES_CONST_LINK_REF_TYPE_REQUISITE_CODE SYSRES_CONST_LIST_REFERENCE_MODE_NAME SYSRES_CONST_LOCALIZATION_DICTIONARY_MAIN_VIEW_CODE SYSRES_CONST_MAIN_VIEW_CODE SYSRES_CONST_MANUAL_ENUM_METHOD_FLAG SYSRES_CONST_MASTER_COMP_TYPE_REQUISITE_CODE SYSRES_CONST_MASTER_TABLE_REC_ID_REQUISITE_CODE SYSRES_CONST_MAXIMIZED_MODE_NAME SYSRES_CONST_ME_VALUE SYSRES_CONST_MESSAGE_ATTENTION_CAPTION SYSRES_CONST_MESSAGE_CONFIRMATION_CAPTION SYSRES_CONST_MESSAGE_ERROR_CAPTION SYSRES_CONST_MESSAGE_INFORMATION_CAPTION SYSRES_CONST_MINIMIZED_MODE_NAME SYSRES_CONST_MINUTE_CHAR SYSRES_CONST_MODULE_REQUISITE_CODE SYSRES_CONST_MONITORING_BLOCK_DESCRIPTION SYSRES_CONST_MONTH_FORMAT_VALUE SYSRES_CONST_NAME_LOCALIZE_ID_REQUISITE_CODE SYSRES_CONST_NAME_REQUISITE_CODE SYSRES_CONST_NAME_SINGULAR_REQUISITE_CODE SYSRES_CONST_NAMEAN_INPUT_TYPE SYSRES_CONST_NEGATIVE_PICK_VALUE SYSRES_CONST_NEGATIVE_VALUE SYSRES_CONST_NO SYSRES_CONST_NO_PICK_VALUE SYSRES_CONST_NO_SIGNATURE_REQUISITE_CODE SYSRES_CONST_NO_VALUE SYSRES_CONST_NONE_ACCESS_RIGHTS_TYPE_CODE SYSRES_CONST_NONOPERATING_RECORD_FLAG_VALUE SYSRES_CONST_NONOPERATING_RECORD_FLAG_VALUE_MASCULINE SYSRES_CONST_NORMAL_ACCESS_RIGHTS_TYPE_CODE SYSRES_CONST_NORMAL_LIFE_CYCLE_STAGE_DRAW_STYLE SYSRES_CONST_NORMAL_MODE_NAME SYSRES_CONST_NOT_ALLOWED_ACCESS_TYPE_CODE SYSRES_CONST_NOT_ALLOWED_ACCESS_TYPE_NAME SYSRES_CONST_NOTE_REQUISITE_CODE SYSRES_CONST_NOTICE_BLOCK_DESCRIPTION SYSRES_CONST_NUM_REQUISITE SYSRES_CONST_NUM_STR_REQUISITE_CODE SYSRES_CONST_NUMERATION_AUTO_NOT_STRONG SYSRES_CONST_NUMERATION_AUTO_STRONG SYSRES_CONST_NUMERATION_FROM_DICTONARY SYSRES_CONST_NUMERATION_MANUAL SYSRES_CONST_NUMERIC_TYPE_CHAR SYSRES_CONST_NUMREQ_REQUISITE_CODE SYSRES_CONST_OBSOLETE_VERSION_STATE_PICK_VALUE SYSRES_CONST_OPERATING_RECORD_FLAG_VALUE SYSRES_CONST_OPERATING_RECORD_FLAG_VALUE_CODE SYSRES_CONST_OPERATING_RECORD_FLAG_VALUE_FEMININE SYSRES_CONST_OPERATING_RECORD_FLAG_VALUE_MASCULINE SYSRES_CONST_OPTIONAL_FORM_COMP_REQCODE_PREFIX SYSRES_CONST_ORANGE_LIFE_CYCLE_STAGE_FONT_COLOR SYSRES_CONST_ORIGINALREF_REQUISITE_CODE SYSRES_CONST_OURFIRM_REF_CODE SYSRES_CONST_OURFIRM_REQUISITE_CODE SYSRES_CONST_OURFIRM_VAR SYSRES_CONST_OUTGOING_WORK_RULE_TYPE_CODE SYSRES_CONST_PICK_NEGATIVE_RESULT SYSRES_CONST_PICK_POSITIVE_RESULT SYSRES_CONST_PICK_REQUISITE SYSRES_CONST_PICK_REQUISITE_TYPE SYSRES_CONST_PICK_TYPE_CHAR SYSRES_CONST_PLAN_STATUS_REQUISITE_CODE SYSRES_CONST_PLATFORM_VERSION_COMMENT SYSRES_CONST_PLUGINS_SETTINGS_DESCRIPTION_REQUISITE_CODE SYSRES_CONST_POSITIVE_PICK_VALUE SYSRES_CONST_POWER_TO_CREATE_ACTION_CODE SYSRES_CONST_POWER_TO_SIGN_ACTION_CODE SYSRES_CONST_PRIORITY_REQUISITE_CODE SYSRES_CONST_QUALIFIED_TASK_TYPE SYSRES_CONST_QUALIFIED_TASK_TYPE_CODE SYSRES_CONST_RECSTAT_REQUISITE_CODE SYSRES_CONST_RED_LIFE_CYCLE_STAGE_FONT_COLOR SYSRES_CONST_REF_ID_T_REF_TYPE_REQUISITE_CODE SYSRES_CONST_REF_REQUISITE SYSRES_CONST_REF_REQUISITE_TYPE SYSRES_CONST_REF_REQUISITES_REFERENCE_CODE_SELECTED_REQUISITE SYSRES_CONST_REFERENCE_RECORD_HISTORY_CREATE_ACTION_CODE SYSRES_CONST_REFERENCE_RECORD_HISTORY_DELETE_ACTION_CODE SYSRES_CONST_REFERENCE_RECORD_HISTORY_MODIFY_ACTION_CODE SYSRES_CONST_REFERENCE_TYPE_CHAR SYSRES_CONST_REFERENCE_TYPE_REQUISITE_NAME SYSRES_CONST_REFERENCES_ADD_PARAMS_REQUISITE_CODE SYSRES_CONST_REFERENCES_DISPLAY_REQUISITE_REQUISITE_CODE SYSRES_CONST_REMOTE_SERVER_STATUS_WORKING SYSRES_CONST_REMOTE_SERVER_TYPE_MAIN SYSRES_CONST_REMOTE_SERVER_TYPE_SECONDARY SYSRES_CONST_REMOTE_USER_FLAG_VALUE_CODE SYSRES_CONST_REPORT_APP_EDITOR_INTERNAL SYSRES_CONST_REPORT_BASE_REPORT_ID_REQUISITE_CODE SYSRES_CONST_REPORT_BASE_REPORT_REQUISITE_CODE SYSRES_CONST_REPORT_SCRIPT_REQUISITE_CODE SYSRES_CONST_REPORT_TEMPLATE_REQUISITE_CODE SYSRES_CONST_REPORT_VIEWER_CODE_REQUISITE_CODE SYSRES_CONST_REQ_ALLOW_COMPONENT_DEFAULT_VALUE SYSRES_CONST_REQ_ALLOW_RECORD_DEFAULT_VALUE SYSRES_CONST_REQ_ALLOW_SERVER_COMPONENT_DEFAULT_VALUE SYSRES_CONST_REQ_MODE_AVAILABLE_CODE SYSRES_CONST_REQ_MODE_EDIT_CODE SYSRES_CONST_REQ_MODE_HIDDEN_CODE SYSRES_CONST_REQ_MODE_NOT_AVAILABLE_CODE SYSRES_CONST_REQ_MODE_VIEW_CODE SYSRES_CONST_REQ_NUMBER_REQUISITE_CODE SYSRES_CONST_REQ_SECTION_VALUE SYSRES_CONST_REQ_TYPE_VALUE SYSRES_CONST_REQUISITE_FORMAT_BY_UNIT SYSRES_CONST_REQUISITE_FORMAT_DATE_FULL SYSRES_CONST_REQUISITE_FORMAT_DATE_TIME SYSRES_CONST_REQUISITE_FORMAT_LEFT SYSRES_CONST_REQUISITE_FORMAT_RIGHT SYSRES_CONST_REQUISITE_FORMAT_WITHOUT_UNIT SYSRES_CONST_REQUISITE_NUMBER_REQUISITE_CODE SYSRES_CONST_REQUISITE_SECTION_ACTIONS SYSRES_CONST_REQUISITE_SECTION_BUTTON SYSRES_CONST_REQUISITE_SECTION_BUTTONS SYSRES_CONST_REQUISITE_SECTION_CARD SYSRES_CONST_REQUISITE_SECTION_TABLE SYSRES_CONST_REQUISITE_SECTION_TABLE10 SYSRES_CONST_REQUISITE_SECTION_TABLE11 SYSRES_CONST_REQUISITE_SECTION_TABLE12 SYSRES_CONST_REQUISITE_SECTION_TABLE13 SYSRES_CONST_REQUISITE_SECTION_TABLE14 SYSRES_CONST_REQUISITE_SECTION_TABLE15 SYSRES_CONST_REQUISITE_SECTION_TABLE16 SYSRES_CONST_REQUISITE_SECTION_TABLE17 SYSRES_CONST_REQUISITE_SECTION_TABLE18 SYSRES_CONST_REQUISITE_SECTION_TABLE19 SYSRES_CONST_REQUISITE_SECTION_TABLE2 SYSRES_CONST_REQUISITE_SECTION_TABLE20 SYSRES_CONST_REQUISITE_SECTION_TABLE21 SYSRES_CONST_REQUISITE_SECTION_TABLE22 SYSRES_CONST_REQUISITE_SECTION_TABLE23 SYSRES_CONST_REQUISITE_SECTION_TABLE24 SYSRES_CONST_REQUISITE_SECTION_TABLE3 SYSRES_CONST_REQUISITE_SECTION_TABLE4 SYSRES_CONST_REQUISITE_SECTION_TABLE5 SYSRES_CONST_REQUISITE_SECTION_TABLE6 SYSRES_CONST_REQUISITE_SECTION_TABLE7 SYSRES_CONST_REQUISITE_SECTION_TABLE8 SYSRES_CONST_REQUISITE_SECTION_TABLE9 SYSRES_CONST_REQUISITES_PSEUDOREFERENCE_REQUISITE_NUMBER_REQUISITE_CODE SYSRES_CONST_RIGHT_ALIGNMENT_CODE SYSRES_CONST_ROLES_REFERENCE_CODE SYSRES_CONST_ROUTE_STEP_AFTER_RUS SYSRES_CONST_ROUTE_STEP_AND_CONDITION_RUS SYSRES_CONST_ROUTE_STEP_OR_CONDITION_RUS SYSRES_CONST_ROUTE_TYPE_COMPLEX SYSRES_CONST_ROUTE_TYPE_PARALLEL SYSRES_CONST_ROUTE_TYPE_SERIAL SYSRES_CONST_SBDATASETDESC_NEGATIVE_VALUE SYSRES_CONST_SBDATASETDESC_POSITIVE_VALUE SYSRES_CONST_SBVIEWSDESC_POSITIVE_VALUE SYSRES_CONST_SCRIPT_BLOCK_DESCRIPTION SYSRES_CONST_SEARCH_BY_TEXT_REQUISITE_CODE SYSRES_CONST_SEARCHES_COMPONENT_CONTENT SYSRES_CONST_SEARCHES_CRITERIA_ACTION_NAME SYSRES_CONST_SEARCHES_EDOC_CONTENT SYSRES_CONST_SEARCHES_FOLDER_CONTENT SYSRES_CONST_SEARCHES_JOB_CONTENT SYSRES_CONST_SEARCHES_REFERENCE_CODE SYSRES_CONST_SEARCHES_TASK_CONTENT SYSRES_CONST_SECOND_CHAR SYSRES_CONST_SECTION_REQUISITE_ACTIONS_VALUE SYSRES_CONST_SECTION_REQUISITE_CARD_VALUE SYSRES_CONST_SECTION_REQUISITE_CODE SYSRES_CONST_SECTION_REQUISITE_DETAIL_1_VALUE SYSRES_CONST_SECTION_REQUISITE_DETAIL_2_VALUE SYSRES_CONST_SECTION_REQUISITE_DETAIL_3_VALUE SYSRES_CONST_SECTION_REQUISITE_DETAIL_4_VALUE SYSRES_CONST_SECTION_REQUISITE_DETAIL_5_VALUE SYSRES_CONST_SECTION_REQUISITE_DETAIL_6_VALUE SYSRES_CONST_SELECT_REFERENCE_MODE_NAME SYSRES_CONST_SELECT_TYPE_SELECTABLE SYSRES_CONST_SELECT_TYPE_SELECTABLE_ONLY_CHILD SYSRES_CONST_SELECT_TYPE_SELECTABLE_WITH_CHILD SYSRES_CONST_SELECT_TYPE_UNSLECTABLE SYSRES_CONST_SERVER_TYPE_MAIN SYSRES_CONST_SERVICE_USER_CATEGORY_FIELD_VALUE SYSRES_CONST_SETTINGS_USER_REQUISITE_CODE SYSRES_CONST_SIGNATURE_AND_ENCODE_CERTIFICATE_TYPE_CODE SYSRES_CONST_SIGNATURE_CERTIFICATE_TYPE_CODE SYSRES_CONST_SINGULAR_TITLE_REQUISITE_CODE SYSRES_CONST_SQL_SERVER_AUTHENTIFICATION_FLAG_VALUE_CODE SYSRES_CONST_SQL_SERVER_ENCODE_AUTHENTIFICATION_FLAG_VALUE_CODE SYSRES_CONST_STANDART_ROUTE_REFERENCE_CODE SYSRES_CONST_STANDART_ROUTE_REFERENCE_COMMENT_REQUISITE_CODE SYSRES_CONST_STANDART_ROUTES_GROUPS_REFERENCE_CODE SYSRES_CONST_STATE_REQ_NAME SYSRES_CONST_STATE_REQUISITE_ACTIVE_VALUE SYSRES_CONST_STATE_REQUISITE_CLOSED_VALUE SYSRES_CONST_STATE_REQUISITE_CODE SYSRES_CONST_STATIC_ROLE_TYPE_CODE SYSRES_CONST_STATUS_PLAN_DEFAULT_VALUE SYSRES_CONST_STATUS_VALUE_AUTOCLEANING SYSRES_CONST_STATUS_VALUE_BLUE_SQUARE SYSRES_CONST_STATUS_VALUE_COMPLETE SYSRES_CONST_STATUS_VALUE_GREEN_SQUARE SYSRES_CONST_STATUS_VALUE_ORANGE_SQUARE SYSRES_CONST_STATUS_VALUE_PURPLE_SQUARE SYSRES_CONST_STATUS_VALUE_RED_SQUARE SYSRES_CONST_STATUS_VALUE_SUSPEND SYSRES_CONST_STATUS_VALUE_YELLOW_SQUARE SYSRES_CONST_STDROUTE_SHOW_TO_USERS_REQUISITE_CODE SYSRES_CONST_STORAGE_TYPE_FILE SYSRES_CONST_STORAGE_TYPE_SQL_SERVER SYSRES_CONST_STR_REQUISITE SYSRES_CONST_STRIKEOUT_LIFE_CYCLE_STAGE_DRAW_STYLE SYSRES_CONST_STRING_FORMAT_LEFT_ALIGN_CHAR SYSRES_CONST_STRING_FORMAT_RIGHT_ALIGN_CHAR SYSRES_CONST_STRING_REQUISITE_CODE SYSRES_CONST_STRING_REQUISITE_TYPE SYSRES_CONST_STRING_TYPE_CHAR SYSRES_CONST_SUBSTITUTES_PSEUDOREFERENCE_CODE SYSRES_CONST_SUBTASK_BLOCK_DESCRIPTION SYSRES_CONST_SYSTEM_SETTING_CURRENT_USER_PARAM_VALUE SYSRES_CONST_SYSTEM_SETTING_EMPTY_VALUE_PARAM_VALUE SYSRES_CONST_SYSTEM_VERSION_COMMENT SYSRES_CONST_TASK_ACCESS_TYPE_ALL SYSRES_CONST_TASK_ACCESS_TYPE_ALL_MEMBERS SYSRES_CONST_TASK_ACCESS_TYPE_MANUAL SYSRES_CONST_TASK_ENCODE_TYPE_CERTIFICATION SYSRES_CONST_TASK_ENCODE_TYPE_CERTIFICATION_AND_PASSWORD SYSRES_CONST_TASK_ENCODE_TYPE_NONE SYSRES_CONST_TASK_ENCODE_TYPE_PASSWORD SYSRES_CONST_TASK_ROUTE_ALL_CONDITION SYSRES_CONST_TASK_ROUTE_AND_CONDITION SYSRES_CONST_TASK_ROUTE_OR_CONDITION SYSRES_CONST_TASK_STATE_ABORTED SYSRES_CONST_TASK_STATE_COMPLETE SYSRES_CONST_TASK_STATE_CONTINUED SYSRES_CONST_TASK_STATE_CONTROL SYSRES_CONST_TASK_STATE_INIT SYSRES_CONST_TASK_STATE_WORKING SYSRES_CONST_TASK_TITLE SYSRES_CONST_TASK_TYPES_GROUPS_REFERENCE_CODE SYSRES_CONST_TASK_TYPES_REFERENCE_CODE SYSRES_CONST_TEMPLATES_REFERENCE_CODE SYSRES_CONST_TEST_DATE_REQUISITE_NAME SYSRES_CONST_TEST_DEV_DATABASE_NAME SYSRES_CONST_TEST_DEV_SYSTEM_CODE SYSRES_CONST_TEST_EDMS_DATABASE_NAME SYSRES_CONST_TEST_EDMS_MAIN_CODE SYSRES_CONST_TEST_EDMS_MAIN_DB_NAME SYSRES_CONST_TEST_EDMS_SECOND_CODE SYSRES_CONST_TEST_EDMS_SECOND_DB_NAME SYSRES_CONST_TEST_EDMS_SYSTEM_CODE SYSRES_CONST_TEST_NUMERIC_REQUISITE_NAME SYSRES_CONST_TEXT_REQUISITE SYSRES_CONST_TEXT_REQUISITE_CODE SYSRES_CONST_TEXT_REQUISITE_TYPE SYSRES_CONST_TEXT_TYPE_CHAR SYSRES_CONST_TYPE_CODE_REQUISITE_CODE SYSRES_CONST_TYPE_REQUISITE_CODE SYSRES_CONST_UNDEFINED_LIFE_CYCLE_STAGE_FONT_COLOR SYSRES_CONST_UNITS_SECTION_ID_REQUISITE_CODE SYSRES_CONST_UNITS_SECTION_REQUISITE_CODE SYSRES_CONST_UNOPERATING_RECORD_FLAG_VALUE_CODE SYSRES_CONST_UNSTORED_DATA_REQUISITE_CODE SYSRES_CONST_UNSTORED_DATA_REQUISITE_NAME SYSRES_CONST_USE_ACCESS_TYPE_CODE SYSRES_CONST_USE_ACCESS_TYPE_NAME SYSRES_CONST_USER_ACCOUNT_TYPE_VALUE_CODE SYSRES_CONST_USER_ADDITIONAL_INFORMATION_REQUISITE_CODE SYSRES_CONST_USER_AND_GROUP_ID_FROM_PSEUDOREFERENCE_REQUISITE_CODE SYSRES_CONST_USER_CATEGORY_NORMAL SYSRES_CONST_USER_CERTIFICATE_REQUISITE_CODE SYSRES_CONST_USER_CERTIFICATE_STATE_REQUISITE_CODE SYSRES_CONST_USER_CERTIFICATE_SUBJECT_NAME_REQUISITE_CODE SYSRES_CONST_USER_CERTIFICATE_THUMBPRINT_REQUISITE_CODE SYSRES_CONST_USER_COMMON_CATEGORY SYSRES_CONST_USER_COMMON_CATEGORY_CODE SYSRES_CONST_USER_FULL_NAME_REQUISITE_CODE SYSRES_CONST_USER_GROUP_TYPE_REQUISITE_CODE SYSRES_CONST_USER_LOGIN_REQUISITE_CODE SYSRES_CONST_USER_REMOTE_CONTROLLER_REQUISITE_CODE SYSRES_CONST_USER_REMOTE_SYSTEM_REQUISITE_CODE SYSRES_CONST_USER_RIGHTS_T_REQUISITE_CODE SYSRES_CONST_USER_SERVER_NAME_REQUISITE_CODE SYSRES_CONST_USER_SERVICE_CATEGORY SYSRES_CONST_USER_SERVICE_CATEGORY_CODE SYSRES_CONST_USER_STATUS_ADMINISTRATOR_CODE SYSRES_CONST_USER_STATUS_ADMINISTRATOR_NAME SYSRES_CONST_USER_STATUS_DEVELOPER_CODE SYSRES_CONST_USER_STATUS_DEVELOPER_NAME SYSRES_CONST_USER_STATUS_DISABLED_CODE SYSRES_CONST_USER_STATUS_DISABLED_NAME SYSRES_CONST_USER_STATUS_SYSTEM_DEVELOPER_CODE SYSRES_CONST_USER_STATUS_USER_CODE SYSRES_CONST_USER_STATUS_USER_NAME SYSRES_CONST_USER_STATUS_USER_NAME_DEPRECATED SYSRES_CONST_USER_TYPE_FIELD_VALUE_USER SYSRES_CONST_USER_TYPE_REQUISITE_CODE SYSRES_CONST_USERS_CONTROLLER_REQUISITE_CODE SYSRES_CONST_USERS_IS_MAIN_SERVER_REQUISITE_CODE SYSRES_CONST_USERS_REFERENCE_CODE SYSRES_CONST_USERS_REGISTRATION_CERTIFICATES_ACTION_NAME SYSRES_CONST_USERS_REQUISITE_CODE SYSRES_CONST_USERS_SYSTEM_REQUISITE_CODE SYSRES_CONST_USERS_USER_ACCESS_RIGHTS_TYPR_REQUISITE_CODE SYSRES_CONST_USERS_USER_AUTHENTICATION_REQUISITE_CODE SYSRES_CONST_USERS_USER_COMPONENT_REQUISITE_CODE SYSRES_CONST_USERS_USER_GROUP_REQUISITE_CODE SYSRES_CONST_USERS_VIEW_CERTIFICATES_ACTION_NAME SYSRES_CONST_VIEW_DEFAULT_CODE SYSRES_CONST_VIEW_DEFAULT_NAME SYSRES_CONST_VIEWER_REQUISITE_CODE SYSRES_CONST_WAITING_BLOCK_DESCRIPTION SYSRES_CONST_WIZARD_FORM_LABEL_TEST_STRING  SYSRES_CONST_WIZARD_QUERY_PARAM_HEIGHT_ETALON_STRING SYSRES_CONST_WIZARD_REFERENCE_COMMENT_REQUISITE_CODE SYSRES_CONST_WORK_RULES_DESCRIPTION_REQUISITE_CODE SYSRES_CONST_WORK_TIME_CALENDAR_REFERENCE_CODE SYSRES_CONST_WORK_WORKFLOW_HARD_ROUTE_TYPE_VALUE SYSRES_CONST_WORK_WORKFLOW_HARD_ROUTE_TYPE_VALUE_CODE SYSRES_CONST_WORK_WORKFLOW_HARD_ROUTE_TYPE_VALUE_CODE_RUS SYSRES_CONST_WORK_WORKFLOW_SOFT_ROUTE_TYPE_VALUE_CODE_RUS SYSRES_CONST_WORKFLOW_ROUTE_TYPR_HARD SYSRES_CONST_WORKFLOW_ROUTE_TYPR_SOFT SYSRES_CONST_XML_ENCODING SYSRES_CONST_XREC_STAT_REQUISITE_CODE SYSRES_CONST_XRECID_FIELD_NAME SYSRES_CONST_YES SYSRES_CONST_YES_NO_2_REQUISITE_CODE SYSRES_CONST_YES_NO_REQUISITE_CODE SYSRES_CONST_YES_NO_T_REF_TYPE_REQUISITE_CODE SYSRES_CONST_YES_PICK_VALUE SYSRES_CONST_YES_VALUE ";
      let s = "CR FALSE nil NO_VALUE NULL TAB TRUE YES_VALUE ";
      let i = "ADMINISTRATORS_GROUP_NAME CUSTOMIZERS_GROUP_NAME DEVELOPERS_GROUP_NAME SERVICE_USERS_GROUP_NAME ";
      let a = "DECISION_BLOCK_FIRST_OPERAND_PROPERTY DECISION_BLOCK_NAME_PROPERTY DECISION_BLOCK_OPERATION_PROPERTY DECISION_BLOCK_RESULT_TYPE_PROPERTY DECISION_BLOCK_SECOND_OPERAND_PROPERTY ";
      let l = "ANY_FILE_EXTENTION COMPRESSED_DOCUMENT_EXTENSION EXTENDED_DOCUMENT_EXTENSION SHORT_COMPRESSED_DOCUMENT_EXTENSION SHORT_EXTENDED_DOCUMENT_EXTENSION ";
      let c = "JOB_BLOCK_ABORT_DEADLINE_PROPERTY JOB_BLOCK_AFTER_FINISH_EVENT JOB_BLOCK_AFTER_QUERY_PARAMETERS_EVENT JOB_BLOCK_ATTACHMENT_PROPERTY JOB_BLOCK_ATTACHMENTS_RIGHTS_GROUP_PROPERTY JOB_BLOCK_ATTACHMENTS_RIGHTS_TYPE_PROPERTY JOB_BLOCK_BEFORE_QUERY_PARAMETERS_EVENT JOB_BLOCK_BEFORE_START_EVENT JOB_BLOCK_CREATED_JOBS_PROPERTY JOB_BLOCK_DEADLINE_PROPERTY JOB_BLOCK_EXECUTION_RESULTS_PROPERTY JOB_BLOCK_IS_PARALLEL_PROPERTY JOB_BLOCK_IS_RELATIVE_ABORT_DEADLINE_PROPERTY JOB_BLOCK_IS_RELATIVE_DEADLINE_PROPERTY JOB_BLOCK_JOB_TEXT_PROPERTY JOB_BLOCK_NAME_PROPERTY JOB_BLOCK_NEED_SIGN_ON_PERFORM_PROPERTY JOB_BLOCK_PERFORMER_PROPERTY JOB_BLOCK_RELATIVE_ABORT_DEADLINE_TYPE_PROPERTY JOB_BLOCK_RELATIVE_DEADLINE_TYPE_PROPERTY JOB_BLOCK_SUBJECT_PROPERTY ";
      let u = "ENGLISH_LANGUAGE_CODE RUSSIAN_LANGUAGE_CODE ";
      let d = "smHidden smMaximized smMinimized smNormal wmNo wmYes ";
      let p = "COMPONENT_TOKEN_LINK_KIND DOCUMENT_LINK_KIND EDOCUMENT_LINK_KIND FOLDER_LINK_KIND JOB_LINK_KIND REFERENCE_LINK_KIND TASK_LINK_KIND ";
      let m = "COMPONENT_TOKEN_LOCK_TYPE EDOCUMENT_VERSION_LOCK_TYPE ";
      let f = "MONITOR_BLOCK_AFTER_FINISH_EVENT MONITOR_BLOCK_BEFORE_START_EVENT MONITOR_BLOCK_DEADLINE_PROPERTY MONITOR_BLOCK_INTERVAL_PROPERTY MONITOR_BLOCK_INTERVAL_TYPE_PROPERTY MONITOR_BLOCK_IS_RELATIVE_DEADLINE_PROPERTY MONITOR_BLOCK_NAME_PROPERTY MONITOR_BLOCK_RELATIVE_DEADLINE_TYPE_PROPERTY MONITOR_BLOCK_SEARCH_SCRIPT_PROPERTY ";
      let h = "NOTICE_BLOCK_AFTER_FINISH_EVENT NOTICE_BLOCK_ATTACHMENT_PROPERTY NOTICE_BLOCK_ATTACHMENTS_RIGHTS_GROUP_PROPERTY NOTICE_BLOCK_ATTACHMENTS_RIGHTS_TYPE_PROPERTY NOTICE_BLOCK_BEFORE_START_EVENT NOTICE_BLOCK_CREATED_NOTICES_PROPERTY NOTICE_BLOCK_DEADLINE_PROPERTY NOTICE_BLOCK_IS_RELATIVE_DEADLINE_PROPERTY NOTICE_BLOCK_NAME_PROPERTY NOTICE_BLOCK_NOTICE_TEXT_PROPERTY NOTICE_BLOCK_PERFORMER_PROPERTY NOTICE_BLOCK_RELATIVE_DEADLINE_TYPE_PROPERTY NOTICE_BLOCK_SUBJECT_PROPERTY ";
      let g = "dseAfterCancel dseAfterClose dseAfterDelete dseAfterDeleteOutOfTransaction dseAfterInsert dseAfterOpen dseAfterScroll dseAfterUpdate dseAfterUpdateOutOfTransaction dseBeforeCancel dseBeforeClose dseBeforeDelete dseBeforeDetailUpdate dseBeforeInsert dseBeforeOpen dseBeforeUpdate dseOnAnyRequisiteChange dseOnCloseRecord dseOnDeleteError dseOnOpenRecord dseOnPrepareUpdate dseOnUpdateError dseOnUpdateRatifiedRecord dseOnValidDelete dseOnValidUpdate reOnChange reOnChangeValues SELECTION_BEGIN_ROUTE_EVENT SELECTION_END_ROUTE_EVENT ";
      let y = "CURRENT_PERIOD_IS_REQUIRED PREVIOUS_CARD_TYPE_NAME SHOW_RECORD_PROPERTIES_FORM ";
      let _ = "ACCESS_RIGHTS_SETTING_DIALOG_CODE ADMINISTRATOR_USER_CODE ANALYTIC_REPORT_TYPE asrtHideLocal asrtHideRemote CALCULATED_ROLE_TYPE_CODE COMPONENTS_REFERENCE_DEVELOPER_VIEW_CODE DCTS_TEST_PROTOCOLS_FOLDER_PATH E_EDOC_VERSION_ALREADY_APPROVINGLY_SIGNED E_EDOC_VERSION_ALREADY_APPROVINGLY_SIGNED_BY_USER E_EDOC_VERSION_ALREDY_SIGNED E_EDOC_VERSION_ALREDY_SIGNED_BY_USER EDOC_TYPES_CODE_REQUISITE_FIELD_NAME EDOCUMENTS_ALIAS_NAME FILES_FOLDER_PATH FILTER_OPERANDS_DELIMITER FILTER_OPERATIONS_DELIMITER FORMCARD_NAME FORMLIST_NAME GET_EXTENDED_DOCUMENT_EXTENSION_CREATION_MODE GET_EXTENDED_DOCUMENT_EXTENSION_IMPORT_MODE INTEGRATED_REPORT_TYPE IS_BUILDER_APPLICATION_ROLE IS_BUILDER_APPLICATION_ROLE2 IS_BUILDER_USERS ISBSYSDEV LOG_FOLDER_PATH mbCancel mbNo mbNoToAll mbOK mbYes mbYesToAll MEMORY_DATASET_DESRIPTIONS_FILENAME mrNo mrNoToAll mrYes mrYesToAll MULTIPLE_SELECT_DIALOG_CODE NONOPERATING_RECORD_FLAG_FEMININE NONOPERATING_RECORD_FLAG_MASCULINE OPERATING_RECORD_FLAG_FEMININE OPERATING_RECORD_FLAG_MASCULINE PROFILING_SETTINGS_COMMON_SETTINGS_CODE_VALUE PROGRAM_INITIATED_LOOKUP_ACTION ratDelete ratEdit ratInsert REPORT_TYPE REQUIRED_PICK_VALUES_VARIABLE rmCard rmList SBRTE_PROGID_DEV SBRTE_PROGID_RELEASE STATIC_ROLE_TYPE_CODE SUPPRESS_EMPTY_TEMPLATE_CREATION SYSTEM_USER_CODE UPDATE_DIALOG_DATASET USED_IN_OBJECT_HINT_PARAM USER_INITIATED_LOOKUP_ACTION USER_NAME_FORMAT USER_SELECTION_RESTRICTIONS WORKFLOW_TEST_PROTOCOLS_FOLDER_PATH ELS_SUBTYPE_CONTROL_NAME ELS_FOLDER_KIND_CONTROL_NAME REPEAT_PROCESS_CURRENT_OBJECT_EXCEPTION_NAME ";
      let b = "PRIVILEGE_COMPONENT_FULL_ACCESS PRIVILEGE_DEVELOPMENT_EXPORT PRIVILEGE_DEVELOPMENT_IMPORT PRIVILEGE_DOCUMENT_DELETE PRIVILEGE_ESD PRIVILEGE_FOLDER_DELETE PRIVILEGE_MANAGE_ACCESS_RIGHTS PRIVILEGE_MANAGE_REPLICATION PRIVILEGE_MANAGE_SESSION_SERVER PRIVILEGE_OBJECT_FULL_ACCESS PRIVILEGE_OBJECT_VIEW PRIVILEGE_RESERVE_LICENSE PRIVILEGE_SYSTEM_CUSTOMIZE PRIVILEGE_SYSTEM_DEVELOP PRIVILEGE_SYSTEM_INSTALL PRIVILEGE_TASK_DELETE PRIVILEGE_USER_PLUGIN_SETTINGS_CUSTOMIZE PRIVILEGES_PSEUDOREFERENCE_CODE ";
      let S = "ACCESS_TYPES_PSEUDOREFERENCE_CODE ALL_AVAILABLE_COMPONENTS_PSEUDOREFERENCE_CODE ALL_AVAILABLE_PRIVILEGES_PSEUDOREFERENCE_CODE ALL_REPLICATE_COMPONENTS_PSEUDOREFERENCE_CODE AVAILABLE_DEVELOPERS_COMPONENTS_PSEUDOREFERENCE_CODE COMPONENTS_PSEUDOREFERENCE_CODE FILTRATER_SETTINGS_CONFLICTS_PSEUDOREFERENCE_CODE GROUPS_PSEUDOREFERENCE_CODE RECEIVE_PROTOCOL_PSEUDOREFERENCE_CODE REFERENCE_REQUISITE_PSEUDOREFERENCE_CODE REFERENCE_REQUISITES_PSEUDOREFERENCE_CODE REFTYPES_PSEUDOREFERENCE_CODE REPLICATION_SEANCES_DIARY_PSEUDOREFERENCE_CODE SEND_PROTOCOL_PSEUDOREFERENCE_CODE SUBSTITUTES_PSEUDOREFERENCE_CODE SYSTEM_SETTINGS_PSEUDOREFERENCE_CODE UNITS_PSEUDOREFERENCE_CODE USERS_PSEUDOREFERENCE_CODE VIEWERS_PSEUDOREFERENCE_CODE ";
      let E = "CERTIFICATE_TYPE_ENCRYPT CERTIFICATE_TYPE_SIGN CERTIFICATE_TYPE_SIGN_AND_ENCRYPT ";
      let C = "STORAGE_TYPE_FILE STORAGE_TYPE_NAS_CIFS STORAGE_TYPE_SAPERION STORAGE_TYPE_SQL_SERVER ";
      let x = "COMPTYPE2_REQUISITE_DOCUMENTS_VALUE COMPTYPE2_REQUISITE_TASKS_VALUE COMPTYPE2_REQUISITE_FOLDERS_VALUE COMPTYPE2_REQUISITE_REFERENCES_VALUE ";
      let A = "SYSREQ_CODE SYSREQ_COMPTYPE2 SYSREQ_CONST_AVAILABLE_FOR_WEB SYSREQ_CONST_COMMON_CODE SYSREQ_CONST_COMMON_VALUE SYSREQ_CONST_FIRM_CODE SYSREQ_CONST_FIRM_STATUS SYSREQ_CONST_FIRM_VALUE SYSREQ_CONST_SERVER_STATUS SYSREQ_CONTENTS SYSREQ_DATE_OPEN SYSREQ_DATE_CLOSE SYSREQ_DESCRIPTION SYSREQ_DESCRIPTION_LOCALIZE_ID SYSREQ_DOUBLE SYSREQ_EDOC_ACCESS_TYPE SYSREQ_EDOC_AUTHOR SYSREQ_EDOC_CREATED SYSREQ_EDOC_DELEGATE_RIGHTS_REQUISITE_CODE SYSREQ_EDOC_EDITOR SYSREQ_EDOC_ENCODE_TYPE SYSREQ_EDOC_ENCRYPTION_PLUGIN_NAME SYSREQ_EDOC_ENCRYPTION_PLUGIN_VERSION SYSREQ_EDOC_EXPORT_DATE SYSREQ_EDOC_EXPORTER SYSREQ_EDOC_KIND SYSREQ_EDOC_LIFE_STAGE_NAME SYSREQ_EDOC_LOCKED_FOR_SERVER_CODE SYSREQ_EDOC_MODIFIED SYSREQ_EDOC_NAME SYSREQ_EDOC_NOTE SYSREQ_EDOC_QUALIFIED_ID SYSREQ_EDOC_SESSION_KEY SYSREQ_EDOC_SESSION_KEY_ENCRYPTION_PLUGIN_NAME SYSREQ_EDOC_SESSION_KEY_ENCRYPTION_PLUGIN_VERSION SYSREQ_EDOC_SIGNATURE_TYPE SYSREQ_EDOC_SIGNED SYSREQ_EDOC_STORAGE SYSREQ_EDOC_STORAGES_ARCHIVE_STORAGE SYSREQ_EDOC_STORAGES_CHECK_RIGHTS SYSREQ_EDOC_STORAGES_COMPUTER_NAME SYSREQ_EDOC_STORAGES_EDIT_IN_STORAGE SYSREQ_EDOC_STORAGES_EXECUTIVE_STORAGE SYSREQ_EDOC_STORAGES_FUNCTION SYSREQ_EDOC_STORAGES_INITIALIZED SYSREQ_EDOC_STORAGES_LOCAL_PATH SYSREQ_EDOC_STORAGES_SAPERION_DATABASE_NAME SYSREQ_EDOC_STORAGES_SEARCH_BY_TEXT SYSREQ_EDOC_STORAGES_SERVER_NAME SYSREQ_EDOC_STORAGES_SHARED_SOURCE_NAME SYSREQ_EDOC_STORAGES_TYPE SYSREQ_EDOC_TEXT_MODIFIED SYSREQ_EDOC_TYPE_ACT_CODE SYSREQ_EDOC_TYPE_ACT_DESCRIPTION SYSREQ_EDOC_TYPE_ACT_DESCRIPTION_LOCALIZE_ID SYSREQ_EDOC_TYPE_ACT_ON_EXECUTE SYSREQ_EDOC_TYPE_ACT_ON_EXECUTE_EXISTS SYSREQ_EDOC_TYPE_ACT_SECTION SYSREQ_EDOC_TYPE_ADD_PARAMS SYSREQ_EDOC_TYPE_COMMENT SYSREQ_EDOC_TYPE_EVENT_TEXT SYSREQ_EDOC_TYPE_NAME_IN_SINGULAR SYSREQ_EDOC_TYPE_NAME_IN_SINGULAR_LOCALIZE_ID SYSREQ_EDOC_TYPE_NAME_LOCALIZE_ID SYSREQ_EDOC_TYPE_NUMERATION_METHOD SYSREQ_EDOC_TYPE_PSEUDO_REQUISITE_CODE SYSREQ_EDOC_TYPE_REQ_CODE SYSREQ_EDOC_TYPE_REQ_DESCRIPTION SYSREQ_EDOC_TYPE_REQ_DESCRIPTION_LOCALIZE_ID SYSREQ_EDOC_TYPE_REQ_IS_LEADING SYSREQ_EDOC_TYPE_REQ_IS_REQUIRED SYSREQ_EDOC_TYPE_REQ_NUMBER SYSREQ_EDOC_TYPE_REQ_ON_CHANGE SYSREQ_EDOC_TYPE_REQ_ON_CHANGE_EXISTS SYSREQ_EDOC_TYPE_REQ_ON_SELECT SYSREQ_EDOC_TYPE_REQ_ON_SELECT_KIND SYSREQ_EDOC_TYPE_REQ_SECTION SYSREQ_EDOC_TYPE_VIEW_CARD SYSREQ_EDOC_TYPE_VIEW_CODE SYSREQ_EDOC_TYPE_VIEW_COMMENT SYSREQ_EDOC_TYPE_VIEW_IS_MAIN SYSREQ_EDOC_TYPE_VIEW_NAME SYSREQ_EDOC_TYPE_VIEW_NAME_LOCALIZE_ID SYSREQ_EDOC_VERSION_AUTHOR SYSREQ_EDOC_VERSION_CRC SYSREQ_EDOC_VERSION_DATA SYSREQ_EDOC_VERSION_EDITOR SYSREQ_EDOC_VERSION_EXPORT_DATE SYSREQ_EDOC_VERSION_EXPORTER SYSREQ_EDOC_VERSION_HIDDEN SYSREQ_EDOC_VERSION_LIFE_STAGE SYSREQ_EDOC_VERSION_MODIFIED SYSREQ_EDOC_VERSION_NOTE SYSREQ_EDOC_VERSION_SIGNATURE_TYPE SYSREQ_EDOC_VERSION_SIGNED SYSREQ_EDOC_VERSION_SIZE SYSREQ_EDOC_VERSION_SOURCE SYSREQ_EDOC_VERSION_TEXT_MODIFIED SYSREQ_EDOCKIND_DEFAULT_VERSION_STATE_CODE SYSREQ_FOLDER_KIND SYSREQ_FUNC_CATEGORY SYSREQ_FUNC_COMMENT SYSREQ_FUNC_GROUP SYSREQ_FUNC_GROUP_COMMENT SYSREQ_FUNC_GROUP_NUMBER SYSREQ_FUNC_HELP SYSREQ_FUNC_PARAM_DEF_VALUE SYSREQ_FUNC_PARAM_IDENT SYSREQ_FUNC_PARAM_NUMBER SYSREQ_FUNC_PARAM_TYPE SYSREQ_FUNC_TEXT SYSREQ_GROUP_CATEGORY SYSREQ_ID SYSREQ_LAST_UPDATE SYSREQ_LEADER_REFERENCE SYSREQ_LINE_NUMBER SYSREQ_MAIN_RECORD_ID SYSREQ_NAME SYSREQ_NAME_LOCALIZE_ID SYSREQ_NOTE SYSREQ_ORIGINAL_RECORD SYSREQ_OUR_FIRM SYSREQ_PROFILING_SETTINGS_BATCH_LOGING SYSREQ_PROFILING_SETTINGS_BATCH_SIZE SYSREQ_PROFILING_SETTINGS_PROFILING_ENABLED SYSREQ_PROFILING_SETTINGS_SQL_PROFILING_ENABLED SYSREQ_PROFILING_SETTINGS_START_LOGGED SYSREQ_RECORD_STATUS SYSREQ_REF_REQ_FIELD_NAME SYSREQ_REF_REQ_FORMAT SYSREQ_REF_REQ_GENERATED SYSREQ_REF_REQ_LENGTH SYSREQ_REF_REQ_PRECISION SYSREQ_REF_REQ_REFERENCE SYSREQ_REF_REQ_SECTION SYSREQ_REF_REQ_STORED SYSREQ_REF_REQ_TOKENS SYSREQ_REF_REQ_TYPE SYSREQ_REF_REQ_VIEW SYSREQ_REF_TYPE_ACT_CODE SYSREQ_REF_TYPE_ACT_DESCRIPTION SYSREQ_REF_TYPE_ACT_DESCRIPTION_LOCALIZE_ID SYSREQ_REF_TYPE_ACT_ON_EXECUTE SYSREQ_REF_TYPE_ACT_ON_EXECUTE_EXISTS SYSREQ_REF_TYPE_ACT_SECTION SYSREQ_REF_TYPE_ADD_PARAMS SYSREQ_REF_TYPE_COMMENT SYSREQ_REF_TYPE_COMMON_SETTINGS SYSREQ_REF_TYPE_DISPLAY_REQUISITE_NAME SYSREQ_REF_TYPE_EVENT_TEXT SYSREQ_REF_TYPE_MAIN_LEADING_REF SYSREQ_REF_TYPE_NAME_IN_SINGULAR SYSREQ_REF_TYPE_NAME_IN_SINGULAR_LOCALIZE_ID SYSREQ_REF_TYPE_NAME_LOCALIZE_ID SYSREQ_REF_TYPE_NUMERATION_METHOD SYSREQ_REF_TYPE_REQ_CODE SYSREQ_REF_TYPE_REQ_DESCRIPTION SYSREQ_REF_TYPE_REQ_DESCRIPTION_LOCALIZE_ID SYSREQ_REF_TYPE_REQ_IS_CONTROL SYSREQ_REF_TYPE_REQ_IS_FILTER SYSREQ_REF_TYPE_REQ_IS_LEADING SYSREQ_REF_TYPE_REQ_IS_REQUIRED SYSREQ_REF_TYPE_REQ_NUMBER SYSREQ_REF_TYPE_REQ_ON_CHANGE SYSREQ_REF_TYPE_REQ_ON_CHANGE_EXISTS SYSREQ_REF_TYPE_REQ_ON_SELECT SYSREQ_REF_TYPE_REQ_ON_SELECT_KIND SYSREQ_REF_TYPE_REQ_SECTION SYSREQ_REF_TYPE_VIEW_CARD SYSREQ_REF_TYPE_VIEW_CODE SYSREQ_REF_TYPE_VIEW_COMMENT SYSREQ_REF_TYPE_VIEW_IS_MAIN SYSREQ_REF_TYPE_VIEW_NAME SYSREQ_REF_TYPE_VIEW_NAME_LOCALIZE_ID SYSREQ_REFERENCE_TYPE_ID SYSREQ_STATE " + "SYSREQ_STAT\u0415 " + "SYSREQ_SYSTEM_SETTINGS_VALUE SYSREQ_TYPE SYSREQ_UNIT SYSREQ_UNIT_ID SYSREQ_USER_GROUPS_GROUP_FULL_NAME SYSREQ_USER_GROUPS_GROUP_NAME SYSREQ_USER_GROUPS_GROUP_SERVER_NAME SYSREQ_USERS_ACCESS_RIGHTS SYSREQ_USERS_AUTHENTICATION SYSREQ_USERS_CATEGORY SYSREQ_USERS_COMPONENT SYSREQ_USERS_COMPONENT_USER_IS_PUBLIC SYSREQ_USERS_DOMAIN SYSREQ_USERS_FULL_USER_NAME SYSREQ_USERS_GROUP SYSREQ_USERS_IS_MAIN_SERVER SYSREQ_USERS_LOGIN SYSREQ_USERS_REFERENCE_USER_IS_PUBLIC SYSREQ_USERS_STATUS SYSREQ_USERS_USER_CERTIFICATE SYSREQ_USERS_USER_CERTIFICATE_INFO SYSREQ_USERS_USER_CERTIFICATE_PLUGIN_NAME SYSREQ_USERS_USER_CERTIFICATE_PLUGIN_VERSION SYSREQ_USERS_USER_CERTIFICATE_STATE SYSREQ_USERS_USER_CERTIFICATE_SUBJECT_NAME SYSREQ_USERS_USER_CERTIFICATE_THUMBPRINT SYSREQ_USERS_USER_DEFAULT_CERTIFICATE SYSREQ_USERS_USER_DESCRIPTION SYSREQ_USERS_USER_GLOBAL_NAME SYSREQ_USERS_USER_LOGIN SYSREQ_USERS_USER_MAIN_SERVER SYSREQ_USERS_USER_TYPE SYSREQ_WORK_RULES_FOLDER_ID ";
      let k = "RESULT_VAR_NAME RESULT_VAR_NAME_ENG ";
      let I = "AUTO_NUMERATION_RULE_ID CANT_CHANGE_ID_REQUISITE_RULE_ID CANT_CHANGE_OURFIRM_REQUISITE_RULE_ID CHECK_CHANGING_REFERENCE_RECORD_USE_RULE_ID CHECK_CODE_REQUISITE_RULE_ID CHECK_DELETING_REFERENCE_RECORD_USE_RULE_ID CHECK_FILTRATER_CHANGES_RULE_ID CHECK_RECORD_INTERVAL_RULE_ID CHECK_REFERENCE_INTERVAL_RULE_ID CHECK_REQUIRED_DATA_FULLNESS_RULE_ID CHECK_REQUIRED_REQUISITES_FULLNESS_RULE_ID MAKE_RECORD_UNRATIFIED_RULE_ID RESTORE_AUTO_NUMERATION_RULE_ID SET_FIRM_CONTEXT_FROM_RECORD_RULE_ID SET_FIRST_RECORD_IN_LIST_FORM_RULE_ID SET_IDSPS_VALUE_RULE_ID SET_NEXT_CODE_VALUE_RULE_ID SET_OURFIRM_BOUNDS_RULE_ID SET_OURFIRM_REQUISITE_RULE_ID ";
      let O = "SCRIPT_BLOCK_AFTER_FINISH_EVENT SCRIPT_BLOCK_BEFORE_START_EVENT SCRIPT_BLOCK_EXECUTION_RESULTS_PROPERTY SCRIPT_BLOCK_NAME_PROPERTY SCRIPT_BLOCK_SCRIPT_PROPERTY ";
      let M = "SUBTASK_BLOCK_ABORT_DEADLINE_PROPERTY SUBTASK_BLOCK_AFTER_FINISH_EVENT SUBTASK_BLOCK_ASSIGN_PARAMS_EVENT SUBTASK_BLOCK_ATTACHMENTS_PROPERTY SUBTASK_BLOCK_ATTACHMENTS_RIGHTS_GROUP_PROPERTY SUBTASK_BLOCK_ATTACHMENTS_RIGHTS_TYPE_PROPERTY SUBTASK_BLOCK_BEFORE_START_EVENT SUBTASK_BLOCK_CREATED_TASK_PROPERTY SUBTASK_BLOCK_CREATION_EVENT SUBTASK_BLOCK_DEADLINE_PROPERTY SUBTASK_BLOCK_IMPORTANCE_PROPERTY SUBTASK_BLOCK_INITIATOR_PROPERTY SUBTASK_BLOCK_IS_RELATIVE_ABORT_DEADLINE_PROPERTY SUBTASK_BLOCK_IS_RELATIVE_DEADLINE_PROPERTY SUBTASK_BLOCK_JOBS_TYPE_PROPERTY SUBTASK_BLOCK_NAME_PROPERTY SUBTASK_BLOCK_PARALLEL_ROUTE_PROPERTY SUBTASK_BLOCK_PERFORMERS_PROPERTY SUBTASK_BLOCK_RELATIVE_ABORT_DEADLINE_TYPE_PROPERTY SUBTASK_BLOCK_RELATIVE_DEADLINE_TYPE_PROPERTY SUBTASK_BLOCK_REQUIRE_SIGN_PROPERTY SUBTASK_BLOCK_STANDARD_ROUTE_PROPERTY SUBTASK_BLOCK_START_EVENT SUBTASK_BLOCK_STEP_CONTROL_PROPERTY SUBTASK_BLOCK_SUBJECT_PROPERTY SUBTASK_BLOCK_TASK_CONTROL_PROPERTY SUBTASK_BLOCK_TEXT_PROPERTY SUBTASK_BLOCK_UNLOCK_ATTACHMENTS_ON_STOP_PROPERTY SUBTASK_BLOCK_USE_STANDARD_ROUTE_PROPERTY SUBTASK_BLOCK_WAIT_FOR_TASK_COMPLETE_PROPERTY ";
      let L = "SYSCOMP_CONTROL_JOBS SYSCOMP_FOLDERS SYSCOMP_JOBS SYSCOMP_NOTICES SYSCOMP_TASKS ";
      let P = "SYSDLG_CREATE_EDOCUMENT SYSDLG_CREATE_EDOCUMENT_VERSION SYSDLG_CURRENT_PERIOD SYSDLG_EDIT_FUNCTION_HELP SYSDLG_EDOCUMENT_KINDS_FOR_TEMPLATE SYSDLG_EXPORT_MULTIPLE_EDOCUMENTS SYSDLG_EXPORT_SINGLE_EDOCUMENT SYSDLG_IMPORT_EDOCUMENT SYSDLG_MULTIPLE_SELECT SYSDLG_SETUP_ACCESS_RIGHTS SYSDLG_SETUP_DEFAULT_RIGHTS SYSDLG_SETUP_FILTER_CONDITION SYSDLG_SETUP_SIGN_RIGHTS SYSDLG_SETUP_TASK_OBSERVERS SYSDLG_SETUP_TASK_ROUTE SYSDLG_SETUP_USERS_LIST SYSDLG_SIGN_EDOCUMENT SYSDLG_SIGN_MULTIPLE_EDOCUMENTS ";
      let F = "SYSREF_ACCESS_RIGHTS_TYPES SYSREF_ADMINISTRATION_HISTORY SYSREF_ALL_AVAILABLE_COMPONENTS SYSREF_ALL_AVAILABLE_PRIVILEGES SYSREF_ALL_REPLICATING_COMPONENTS SYSREF_AVAILABLE_DEVELOPERS_COMPONENTS SYSREF_CALENDAR_EVENTS SYSREF_COMPONENT_TOKEN_HISTORY SYSREF_COMPONENT_TOKENS SYSREF_COMPONENTS SYSREF_CONSTANTS SYSREF_DATA_RECEIVE_PROTOCOL SYSREF_DATA_SEND_PROTOCOL SYSREF_DIALOGS SYSREF_DIALOGS_REQUISITES SYSREF_EDITORS SYSREF_EDOC_CARDS SYSREF_EDOC_TYPES SYSREF_EDOCUMENT_CARD_REQUISITES SYSREF_EDOCUMENT_CARD_TYPES SYSREF_EDOCUMENT_CARD_TYPES_REFERENCE SYSREF_EDOCUMENT_CARDS SYSREF_EDOCUMENT_HISTORY SYSREF_EDOCUMENT_KINDS SYSREF_EDOCUMENT_REQUISITES SYSREF_EDOCUMENT_SIGNATURES SYSREF_EDOCUMENT_TEMPLATES SYSREF_EDOCUMENT_TEXT_STORAGES SYSREF_EDOCUMENT_VIEWS SYSREF_FILTERER_SETUP_CONFLICTS SYSREF_FILTRATER_SETTING_CONFLICTS SYSREF_FOLDER_HISTORY SYSREF_FOLDERS SYSREF_FUNCTION_GROUPS SYSREF_FUNCTION_PARAMS SYSREF_FUNCTIONS SYSREF_JOB_HISTORY SYSREF_LINKS SYSREF_LOCALIZATION_DICTIONARY SYSREF_LOCALIZATION_LANGUAGES SYSREF_MODULES SYSREF_PRIVILEGES SYSREF_RECORD_HISTORY SYSREF_REFERENCE_REQUISITES SYSREF_REFERENCE_TYPE_VIEWS SYSREF_REFERENCE_TYPES SYSREF_REFERENCES SYSREF_REFERENCES_REQUISITES SYSREF_REMOTE_SERVERS SYSREF_REPLICATION_SESSIONS_LOG SYSREF_REPLICATION_SESSIONS_PROTOCOL SYSREF_REPORTS SYSREF_ROLES SYSREF_ROUTE_BLOCK_GROUPS SYSREF_ROUTE_BLOCKS SYSREF_SCRIPTS SYSREF_SEARCHES SYSREF_SERVER_EVENTS SYSREF_SERVER_EVENTS_HISTORY SYSREF_STANDARD_ROUTE_GROUPS SYSREF_STANDARD_ROUTES SYSREF_STATUSES SYSREF_SYSTEM_SETTINGS SYSREF_TASK_HISTORY SYSREF_TASK_KIND_GROUPS SYSREF_TASK_KINDS SYSREF_TASK_RIGHTS SYSREF_TASK_SIGNATURES SYSREF_TASKS SYSREF_UNITS SYSREF_USER_GROUPS SYSREF_USER_GROUPS_REFERENCE SYSREF_USER_SUBSTITUTION SYSREF_USERS SYSREF_USERS_REFERENCE SYSREF_VIEWERS SYSREF_WORKING_TIME_CALENDARS ";
      let H = "ACCESS_RIGHTS_TABLE_NAME EDMS_ACCESS_TABLE_NAME EDOC_TYPES_TABLE_NAME ";
      let U = "TEST_DEV_DB_NAME TEST_DEV_SYSTEM_CODE TEST_EDMS_DB_NAME TEST_EDMS_MAIN_CODE TEST_EDMS_MAIN_DB_NAME TEST_EDMS_SECOND_CODE TEST_EDMS_SECOND_DB_NAME TEST_EDMS_SYSTEM_CODE TEST_ISB5_MAIN_CODE TEST_ISB5_SECOND_CODE TEST_SQL_SERVER_2005_NAME TEST_SQL_SERVER_NAME ";
      let N = "ATTENTION_CAPTION cbsCommandLinks cbsDefault CONFIRMATION_CAPTION ERROR_CAPTION INFORMATION_CAPTION mrCancel mrOk ";
      let W = "EDOC_VERSION_ACTIVE_STAGE_CODE EDOC_VERSION_DESIGN_STAGE_CODE EDOC_VERSION_OBSOLETE_STAGE_CODE ";
      let j = "cpDataEnciphermentEnabled cpDigitalSignatureEnabled cpID cpIssuer cpPluginVersion cpSerial cpSubjectName cpSubjSimpleName cpValidFromDate cpValidToDate ";
      let z = "ISBL_SYNTAX NO_SYNTAX XML_SYNTAX ";
      let V = "WAIT_BLOCK_AFTER_FINISH_EVENT WAIT_BLOCK_BEFORE_START_EVENT WAIT_BLOCK_DEADLINE_PROPERTY WAIT_BLOCK_IS_RELATIVE_DEADLINE_PROPERTY WAIT_BLOCK_NAME_PROPERTY WAIT_BLOCK_RELATIVE_DEADLINE_TYPE_PROPERTY ";
      let K = "SYSRES_COMMON SYSRES_CONST SYSRES_MBFUNC SYSRES_SBDATA SYSRES_SBGUI SYSRES_SBINTF SYSRES_SBREFDSC SYSRES_SQLERRORS SYSRES_SYSCOMP ";
      let J = o + "CR FALSE nil NO_VALUE NULL TAB TRUE YES_VALUE ADMINISTRATORS_GROUP_NAME CUSTOMIZERS_GROUP_NAME DEVELOPERS_GROUP_NAME SERVICE_USERS_GROUP_NAME " + a + l + c + "ENGLISH_LANGUAGE_CODE RUSSIAN_LANGUAGE_CODE smHidden smMaximized smMinimized smNormal wmNo wmYes " + p + "COMPONENT_TOKEN_LOCK_TYPE EDOCUMENT_VERSION_LOCK_TYPE " + f + h + g + y + _ + b + S + E + C + x + A + "RESULT_VAR_NAME RESULT_VAR_NAME_ENG " + I + O + M + L + P + F + H + U + N + W + j + z + V + K;
      let Q = "atUser atGroup atRole ";
      let Z = "aemEnabledAlways aemDisabledAlways aemEnabledOnBrowse aemEnabledOnEdit aemDisabledOnBrowseEmpty ";
      let ne = "apBegin apEnd ";
      let oe = "alLeft alRight ";
      let ee = "asmNever asmNoButCustomize asmAsLastTime asmYesButCustomize asmAlways ";
      let re = "cirCommon cirRevoked ";
      let se = "ctSignature ctEncode ctSignatureEncode ";
      let ae = "clbUnchecked clbChecked clbGrayed ";
      let de = "ceISB ceAlways ceNever ";
      let be = "ctDocument ctReference ctScript ctUnknown ctReport ctDialog ctFunction ctFolder ctEDocument ctTask ctJob ctNotice ctControlJob ";
      let fe = "cfInternal cfDisplay ";
      let me = "ciUnspecified ciWrite ciRead ";
      let Te = "ckFolder ckEDocument ckTask ckJob ckComponentToken ckAny ckReference ckScript ckReport ckDialog ";
      let ue = "ctISBLEditor ctBevel ctButton ctCheckListBox ctComboBox ctComboEdit ctGrid ctDBCheckBox ctDBComboBox ctDBEdit ctDBEllipsis ctDBMemo ctDBNavigator ctDBRadioGroup ctDBStatusLabel ctEdit ctGroupBox ctInplaceHint ctMemo ctPanel ctListBox ctRadioButton ctRichEdit ctTabSheet ctWebBrowser ctImage ctHyperLink ctLabel ctDBMultiEllipsis ctRibbon ctRichView ctInnerPanel ctPanelGroup ctBitButton ";
      let ce = "cctDate cctInteger cctNumeric cctPick cctReference cctString cctText ";
      let le = "cltInternal cltPrimary cltGUI ";
      let pe = "dseBeforeOpen dseAfterOpen dseBeforeClose dseAfterClose dseOnValidDelete dseBeforeDelete dseAfterDelete dseAfterDeleteOutOfTransaction dseOnDeleteError dseBeforeInsert dseAfterInsert dseOnValidUpdate dseBeforeUpdate dseOnUpdateRatifiedRecord dseAfterUpdate dseAfterUpdateOutOfTransaction dseOnUpdateError dseAfterScroll dseOnOpenRecord dseOnCloseRecord dseBeforeCancel dseAfterCancel dseOnUpdateDeadlockError dseBeforeDetailUpdate dseOnPrepareUpdate dseOnAnyRequisiteChange ";
      let ve = "dssEdit dssInsert dssBrowse dssInActive ";
      let _e = "dftDate dftShortDate dftDateTime dftTimeStamp ";
      let xe = "dotDays dotHours dotMinutes dotSeconds ";
      let ke = "dtkndLocal dtkndUTC ";
      let Ie = "arNone arView arEdit arFull ";
      let Ue = "ddaView ddaEdit ";
      let Ge = "emLock emEdit emSign emExportWithLock emImportWithUnlock emChangeVersionNote emOpenForModify emChangeLifeStage emDelete emCreateVersion emImport emUnlockExportedWithLock emStart emAbort emReInit emMarkAsReaded emMarkAsUnreaded emPerform emAccept emResume emChangeRights emEditRoute emEditObserver emRecoveryFromLocalCopy emChangeWorkAccessType emChangeEncodeTypeToCertificate emChangeEncodeTypeToPassword emChangeEncodeTypeToNone emChangeEncodeTypeToCertificatePassword emChangeStandardRoute emGetText emOpenForView emMoveToStorage emCreateObject emChangeVersionHidden emDeleteVersion emChangeLifeCycleStage emApprovingSign emExport emContinue emLockFromEdit emUnLockForEdit emLockForServer emUnlockFromServer emDelegateAccessRights emReEncode ";
      let Be = "ecotFile ecotProcess ";
      let We = "eaGet eaCopy eaCreate eaCreateStandardRoute ";
      let Ze = "edltAll edltNothing edltQuery ";
      let Tt = "essmText essmCard ";
      let kt = "esvtLast esvtLastActive esvtSpecified ";
      let Ye = "edsfExecutive edsfArchive ";
      let ht = "edstSQLServer edstFile ";
      let It = "edvstNone edvstEDocumentVersionCopy edvstFile edvstTemplate edvstScannedFile ";
      let Rt = "vsDefault vsDesign vsActive vsObsolete ";
      let wt = "etNone etCertificate etPassword etCertificatePassword ";
      let vt = "ecException ecWarning ecInformation ";
      let yt = "estAll estApprovingOnly ";
      let gt = "evtLast evtLastActive evtQuery ";
      let Ft = "fdtString fdtNumeric fdtInteger fdtDate fdtText fdtUnknown fdtWideString fdtLargeInteger ";
      let on = "ftInbox ftOutbox ftFavorites ftCommonFolder ftUserFolder ftComponents ftQuickLaunch ftShortcuts ftSearch ";
      let rn = "grhAuto grhX1 grhX2 grhX3 ";
      let Sn = "hltText hltRTF hltHTML ";
      let jn = "iffBMP iffJPEG iffMultiPageTIFF iffSinglePageTIFF iffTIFF iffPNG ";
      let Xr = "im8bGrayscale im24bRGB im1bMonochrome ";
      let co = "itBMP itJPEG itWMF itPNG ";
      let Yt = "ikhInformation ikhWarning ikhError ikhNoIcon ";
      let Ee = "icUnknown icScript icFunction icIntegratedReport icAnalyticReport icDataSetEventHandler icActionHandler icFormEventHandler icLookUpEventHandler icRequisiteChangeEventHandler icBeforeSearchEventHandler icRoleCalculation icSelectRouteEventHandler icBlockPropertyCalculation icBlockQueryParamsEventHandler icChangeSearchResultEventHandler icBlockEventHandler icSubTaskInitEventHandler icEDocDataSetEventHandler icEDocLookUpEventHandler icEDocActionHandler icEDocFormEventHandler icEDocRequisiteChangeEventHandler icStructuredConversionRule icStructuredConversionEventBefore icStructuredConversionEventAfter icWizardEventHandler icWizardFinishEventHandler icWizardStepEventHandler icWizardStepFinishEventHandler icWizardActionEnableEventHandler icWizardActionExecuteEventHandler icCreateJobsHandler icCreateNoticesHandler icBeforeLookUpEventHandler icAfterLookUpEventHandler icTaskAbortEventHandler icWorkflowBlockActionHandler icDialogDataSetEventHandler icDialogActionHandler icDialogLookUpEventHandler icDialogRequisiteChangeEventHandler icDialogFormEventHandler icDialogValidCloseEventHandler icBlockFormEventHandler icTaskFormEventHandler icReferenceMethod icEDocMethod icDialogMethod icProcessMessageHandler ";
      let Re = "isShow isHide isByUserSettings ";
      let Ce = "jkJob jkNotice jkControlJob ";
      let Fe = "jtInner jtLeft jtRight jtFull jtCross ";
      let Xe = "lbpAbove lbpBelow lbpLeft lbpRight ";
      let He = "eltPerConnection eltPerUser ";
      let Gt = "sfcUndefined sfcBlack sfcGreen sfcRed sfcBlue sfcOrange sfcLilac ";
      let mt = "sfsItalic sfsStrikeout sfsNormal ";
      let Dt = "ldctStandardRoute ldctWizard ldctScript ldctFunction ldctRouteBlock ldctIntegratedReport ldctAnalyticReport ldctReferenceType ldctEDocumentType ldctDialog ldctServerEvents ";
      let jt = "mrcrtNone mrcrtUser mrcrtMaximal mrcrtCustom ";
      let bn = "vtEqual vtGreaterOrEqual vtLessOrEqual vtRange ";
      let Ct = "rdYesterday rdToday rdTomorrow rdThisWeek rdThisMonth rdThisYear rdNextMonth rdNextWeek rdLastWeek rdLastMonth ";
      let hn = "rdWindow rdFile rdPrinter ";
      let vn = "rdtString rdtNumeric rdtInteger rdtDate rdtReference rdtAccount rdtText rdtPick rdtUnknown rdtLargeInteger rdtDocument ";
      let zn = "reOnChange reOnChangeValues ";
      let Pn = "ttGlobal ttLocal ttUser ttSystem ";
      let Lr = "ssmBrowse ssmSelect ssmMultiSelect ssmBrowseModal ";
      let ao = "smSelect smLike smCard ";
      let Nn = "stNone stAuthenticating stApproving ";
      let Tr = "sctString sctStream ";
      let To = "sstAnsiSort sstNaturalSort ";
      let wr = "svtEqual svtContain ";
      let Ut = "soatString soatNumeric soatInteger soatDatetime soatReferenceRecord soatText soatPick soatBoolean soatEDocument soatAccount soatIntegerCollection soatNumericCollection soatStringCollection soatPickCollection soatDatetimeCollection soatBooleanCollection soatReferenceRecordCollection soatEDocumentCollection soatAccountCollection soatContents soatUnknown ";
      let Wn = "tarAbortByUser tarAbortByWorkflowException ";
      let Fr = "tvtAllWords tvtExactPhrase tvtAnyWord ";
      let Is = "usNone usCompleted usRedSquare usBlueSquare usYellowSquare usGreenSquare usOrangeSquare usPurpleSquare usFollowUp ";
      let _r = "utUnknown utUser utDeveloper utAdministrator utSystemDeveloper utDisconnected ";
      let kn = "btAnd btDetailAnd btOr btNotOr btOnly ";
      let Qn = "vmView vmSelect vmNavigation ";
      let gi = "vsmSingle vsmMultiple vsmMultipleCheck vsmNoSelection ";
      let Ks = "wfatPrevious wfatNext wfatCancel wfatFinish ";
      let Fa = "wfepUndefined wfepText3 wfepText6 wfepText9 wfepSpinEdit wfepDropDown wfepRadioGroup wfepFlag wfepText12 wfepText15 wfepText18 wfepText21 wfepText24 wfepText27 wfepText30 wfepRadioGroupColumn1 wfepRadioGroupColumn2 wfepRadioGroupColumn3 ";
      let Hs = "wfetQueryParameter wfetText wfetDelimiter wfetLabel ";
      let Ms = "wptString wptInteger wptNumeric wptBoolean wptDateTime wptPick wptText wptUser wptUserList wptEDocumentInfo wptEDocumentInfoList wptReferenceRecordInfo wptReferenceRecordInfoList wptFolderInfo wptTaskInfo wptContents wptFileName wptDate ";
      let Ia = "wsrComplete wsrGoNext wsrGoPrevious wsrCustom wsrCancel wsrGoFinal ";
      let ec = "wstForm wstEDocument wstTaskCard wstReferenceRecordCard wstFinal ";
      let Os = "wsbStart wsbFinish wsbNotice wsbStep wsbDecision wsbWait wsbMonitor wsbScript wsbConnector wsbSubTask wsbLifeCycleStage wsbPause ";
      let Kn = "wdtInteger wdtFloat wdtString wdtPick wdtDateTime wdtBoolean wdtTask wdtJob wdtFolder wdtEDocument wdtReferenceRecord wdtUser wdtGroup wdtRole wdtIntegerCollection wdtFloatCollection wdtStringCollection wdtPickCollection wdtDateTimeCollection wdtBooleanCollection wdtTaskCollection wdtJobCollection wdtFolderCollection wdtEDocumentCollection wdtReferenceRecordCollection wdtUserCollection wdtGroupCollection wdtRoleCollection wdtContents wdtUserList wdtSearchDescription wdtDeadLine wdtPickSet wdtAccountCollection ";
      let sn = "wiLow wiNormal wiHigh ";
      let Ln = "wrtSoft wrtHard ";
      let ct = "wsInit wsRunning wsDone wsControlled wsAborted wsContinued ";
      let Br = "wtmFull wtmFromCurrent wtmOnlyCurrent ";
      let Pr = "atUser atGroup atRole " + Z + "apBegin apEnd alLeft alRight " + ee + "cirCommon cirRevoked ctSignature ctEncode ctSignatureEncode clbUnchecked clbChecked clbGrayed ceISB ceAlways ceNever " + be + "cfInternal cfDisplay ciUnspecified ciWrite ciRead " + Te + ue + ce + "cltInternal cltPrimary cltGUI " + pe + "dssEdit dssInsert dssBrowse dssInActive dftDate dftShortDate dftDateTime dftTimeStamp dotDays dotHours dotMinutes dotSeconds dtkndLocal dtkndUTC arNone arView arEdit arFull ddaView ddaEdit " + Ge + "ecotFile ecotProcess eaGet eaCopy eaCreate eaCreateStandardRoute edltAll edltNothing edltQuery essmText essmCard esvtLast esvtLastActive esvtSpecified edsfExecutive edsfArchive edstSQLServer edstFile edvstNone edvstEDocumentVersionCopy edvstFile edvstTemplate edvstScannedFile vsDefault vsDesign vsActive vsObsolete etNone etCertificate etPassword etCertificatePassword ecException ecWarning ecInformation estAll estApprovingOnly evtLast evtLastActive evtQuery " + Ft + on + rn + Sn + jn + Xr + co + Yt + Ee + Re + Ce + Fe + Xe + He + Gt + mt + Dt + jt + bn + Ct + hn + vn + zn + Pn + Lr + ao + Nn + Tr + To + wr + Ut + Wn + Fr + Is + _r + kn + Qn + gi + Ks + Fa + Hs + Ms + Ia + ec + 0 + Os + Kn + sn + Ln + ct + Br;
      let Vr = "AddSubString AdjustLineBreaks AmountInWords Analysis ArrayDimCount ArrayHighBound ArrayLowBound ArrayOf ArrayReDim Assert Assigned BeginOfMonth BeginOfPeriod BuildProfilingOperationAnalysis CallProcedure CanReadFile CArrayElement CDataSetRequisite ChangeDate ChangeReferenceDataset Char CharPos CheckParam CheckParamValue CompareStrings ConstantExists ControlState ConvertDateStr Copy CopyFile CreateArray CreateCachedReference CreateConnection CreateDialog CreateDualListDialog CreateEditor CreateException CreateFile CreateFolderDialog CreateInputDialog CreateLinkFile CreateList CreateLock CreateMemoryDataSet CreateObject CreateOpenDialog CreateProgress CreateQuery CreateReference CreateReport CreateSaveDialog CreateScript CreateSQLPivotFunction CreateStringList CreateTreeListSelectDialog CSelectSQL CSQL CSubString CurrentUserID CurrentUserName CurrentVersion DataSetLocateEx DateDiff DateTimeDiff DateToStr DayOfWeek DeleteFile DirectoryExists DisableCheckAccessRights DisableCheckFullShowingRestriction DisableMassTaskSendingRestrictions DropTable DupeString EditText EnableCheckAccessRights EnableCheckFullShowingRestriction EnableMassTaskSendingRestrictions EndOfMonth EndOfPeriod ExceptionExists ExceptionsOff ExceptionsOn Execute ExecuteProcess Exit ExpandEnvironmentVariables ExtractFileDrive ExtractFileExt ExtractFileName ExtractFilePath ExtractParams FileExists FileSize FindFile FindSubString FirmContext ForceDirectories Format FormatDate FormatNumeric FormatSQLDate FormatString FreeException GetComponent GetComponentLaunchParam GetConstant GetLastException GetReferenceRecord GetRefTypeByRefID GetTableID GetTempFolder IfThen In IndexOf InputDialog InputDialogEx InteractiveMode IsFileLocked IsGraphicFile IsNumeric Length LoadString LoadStringFmt LocalTimeToUTC LowerCase Max MessageBox MessageBoxEx MimeDecodeBinary MimeDecodeString MimeEncodeBinary MimeEncodeString Min MoneyInWords MoveFile NewID Now OpenFile Ord Precision Raise ReadCertificateFromFile ReadFile ReferenceCodeByID ReferenceNumber ReferenceRequisiteMode ReferenceRequisiteValue RegionDateSettings RegionNumberSettings RegionTimeSettings RegRead RegWrite RenameFile Replace Round SelectServerCode SelectSQL ServerDateTime SetConstant SetManagedFolderFieldsState ShowConstantsInputDialog ShowMessage Sleep Split SQL SQL2XLSTAB SQLProfilingSendReport StrToDate SubString SubStringCount SystemSetting Time TimeDiff Today Transliterate Trim UpperCase UserStatus UTCToLocalTime ValidateXML VarIsClear VarIsEmpty VarIsNull WorkTimeDiff WriteFile WriteFileEx WriteObjectHistory " + "\u0410\u043D\u0430\u043B\u0438\u0437 " + "\u0411\u0430\u0437\u0430\u0414\u0430\u043D\u043D\u044B\u0445 " + "\u0411\u043B\u043E\u043A\u0415\u0441\u0442\u044C " + "\u0411\u043B\u043E\u043A\u0415\u0441\u0442\u044C\u0420\u0430\u0441\u0448 " + "\u0411\u043B\u043E\u043A\u0418\u043D\u0444\u043E " + "\u0411\u043B\u043E\u043A\u0421\u043D\u044F\u0442\u044C " + "\u0411\u043B\u043E\u043A\u0421\u043D\u044F\u0442\u044C\u0420\u0430\u0441\u0448 " + "\u0411\u043B\u043E\u043A\u0423\u0441\u0442\u0430\u043D\u043E\u0432\u0438\u0442\u044C " + "\u0412\u0432\u043E\u0434 " + "\u0412\u0432\u043E\u0434\u041C\u0435\u043D\u044E " + "\u0412\u0435\u0434\u0421 " + "\u0412\u0435\u0434\u0421\u043F\u0440 " + "\u0412\u0435\u0440\u0445\u043D\u044F\u044F\u0413\u0440\u0430\u043D\u0438\u0446\u0430\u041C\u0430\u0441\u0441\u0438\u0432\u0430 " + "\u0412\u043D\u0435\u0448\u041F\u0440\u043E\u0433\u0440 " + "\u0412\u043E\u0441\u0441\u0442 " + "\u0412\u0440\u0435\u043C\u0435\u043D\u043D\u0430\u044F\u041F\u0430\u043F\u043A\u0430 " + "\u0412\u0440\u0435\u043C\u044F " + "\u0412\u044B\u0431\u043E\u0440SQL " + "\u0412\u044B\u0431\u0440\u0430\u0442\u044C\u0417\u0430\u043F\u0438\u0441\u044C " + "\u0412\u044B\u0434\u0435\u043B\u0438\u0442\u044C\u0421\u0442\u0440 " + "\u0412\u044B\u0437\u0432\u0430\u0442\u044C " + "\u0412\u044B\u043F\u043E\u043B\u043D\u0438\u0442\u044C " + "\u0412\u044B\u043F\u041F\u0440\u043E\u0433\u0440 " + "\u0413\u0440\u0430\u0444\u0438\u0447\u0435\u0441\u043A\u0438\u0439\u0424\u0430\u0439\u043B " + "\u0413\u0440\u0443\u043F\u043F\u0430\u0414\u043E\u043F\u043E\u043B\u043D\u0438\u0442\u0435\u043B\u044C\u043D\u043E " + "\u0414\u0430\u0442\u0430\u0412\u0440\u0435\u043C\u044F\u0421\u0435\u0440\u0432 " + "\u0414\u0435\u043D\u044C\u041D\u0435\u0434\u0435\u043B\u0438 " + "\u0414\u0438\u0430\u043B\u043E\u0433\u0414\u0430\u041D\u0435\u0442 " + "\u0414\u043B\u0438\u043D\u0430\u0421\u0442\u0440 " + "\u0414\u043E\u0431\u041F\u043E\u0434\u0441\u0442\u0440 " + "\u0415\u041F\u0443\u0441\u0442\u043E " + "\u0415\u0441\u043B\u0438\u0422\u043E " + "\u0415\u0427\u0438\u0441\u043B\u043E " + "\u0417\u0430\u043C\u041F\u043E\u0434\u0441\u0442\u0440 " + "\u0417\u0430\u043F\u0438\u0441\u044C\u0421\u043F\u0440\u0430\u0432\u043E\u0447\u043D\u0438\u043A\u0430 " + "\u0417\u043D\u0430\u0447\u041F\u043E\u043B\u044F\u0421\u043F\u0440 " + "\u0418\u0414\u0422\u0438\u043F\u0421\u043F\u0440 " + "\u0418\u0437\u0432\u043B\u0435\u0447\u044C\u0414\u0438\u0441\u043A " + "\u0418\u0437\u0432\u043B\u0435\u0447\u044C\u0418\u043C\u044F\u0424\u0430\u0439\u043B\u0430 " + "\u0418\u0437\u0432\u043B\u0435\u0447\u044C\u041F\u0443\u0442\u044C " + "\u0418\u0437\u0432\u043B\u0435\u0447\u044C\u0420\u0430\u0441\u0448\u0438\u0440\u0435\u043D\u0438\u0435 " + "\u0418\u0437\u043C\u0414\u0430\u0442 " + "\u0418\u0437\u043C\u0435\u043D\u0438\u0442\u044C\u0420\u0430\u0437\u043C\u0435\u0440\u041C\u0430\u0441\u0441\u0438\u0432\u0430 " + "\u0418\u0437\u043C\u0435\u0440\u0435\u043D\u0438\u0439\u041C\u0430\u0441\u0441\u0438\u0432\u0430 " + "\u0418\u043C\u044F\u041E\u0440\u0433 " + "\u0418\u043C\u044F\u041F\u043E\u043B\u044F\u0421\u043F\u0440 " + "\u0418\u043D\u0434\u0435\u043A\u0441 " + "\u0418\u043D\u0434\u0438\u043A\u0430\u0442\u043E\u0440\u0417\u0430\u043A\u0440\u044B\u0442\u044C " + "\u0418\u043D\u0434\u0438\u043A\u0430\u0442\u043E\u0440\u041E\u0442\u043A\u0440\u044B\u0442\u044C " + "\u0418\u043D\u0434\u0438\u043A\u0430\u0442\u043E\u0440\u0428\u0430\u0433 " + "\u0418\u043D\u0442\u0435\u0440\u0430\u043A\u0442\u0438\u0432\u043D\u044B\u0439\u0420\u0435\u0436\u0438\u043C " + "\u0418\u0442\u043E\u0433\u0422\u0431\u043B\u0421\u043F\u0440 " + "\u041A\u043E\u0434\u0412\u0438\u0434\u0412\u0435\u0434\u0421\u043F\u0440 " + "\u041A\u043E\u0434\u0412\u0438\u0434\u0421\u043F\u0440\u041F\u043E\u0418\u0414 " + "\u041A\u043E\u0434\u041F\u043EAnalit " + "\u041A\u043E\u0434\u0421\u0438\u043C\u0432\u043E\u043B\u0430 " + "\u041A\u043E\u0434\u0421\u043F\u0440 " + "\u041A\u043E\u043B\u041F\u043E\u0434\u0441\u0442\u0440 " + "\u041A\u043E\u043B\u041F\u0440\u043E\u043F " + "\u041A\u043E\u043D\u041C\u0435\u0441 " + "\u041A\u043E\u043D\u0441\u0442 " + "\u041A\u043E\u043D\u0441\u0442\u0415\u0441\u0442\u044C " + "\u041A\u043E\u043D\u0441\u0442\u0417\u043D\u0430\u0447 " + "\u041A\u043E\u043D\u0422\u0440\u0430\u043D " + "\u041A\u043E\u043F\u0438\u0440\u043E\u0432\u0430\u0442\u044C\u0424\u0430\u0439\u043B " + "\u041A\u043E\u043F\u0438\u044F\u0421\u0442\u0440 " + "\u041A\u041F\u0435\u0440\u0438\u043E\u0434 " + "\u041A\u0421\u0442\u0440\u0422\u0431\u043B\u0421\u043F\u0440 " + "\u041C\u0430\u043A\u0441 " + "\u041C\u0430\u043A\u0441\u0421\u0442\u0440\u0422\u0431\u043B\u0421\u043F\u0440 " + "\u041C\u0430\u0441\u0441\u0438\u0432 " + "\u041C\u0435\u043D\u044E " + "\u041C\u0435\u043D\u044E\u0420\u0430\u0441\u0448 " + "\u041C\u0438\u043D " + "\u041D\u0430\u0431\u043E\u0440\u0414\u0430\u043D\u043D\u044B\u0445\u041D\u0430\u0439\u0442\u0438\u0420\u0430\u0441\u0448 " + "\u041D\u0430\u0438\u043C\u0412\u0438\u0434\u0421\u043F\u0440 " + "\u041D\u0430\u0438\u043C\u041F\u043EAnalit " + "\u041D\u0430\u0438\u043C\u0421\u043F\u0440 " + "\u041D\u0430\u0441\u0442\u0440\u043E\u0438\u0442\u044C\u041F\u0435\u0440\u0435\u0432\u043E\u0434\u044B\u0421\u0442\u0440\u043E\u043A " + "\u041D\u0430\u0447\u041C\u0435\u0441 " + "\u041D\u0430\u0447\u0422\u0440\u0430\u043D " + "\u041D\u0438\u0436\u043D\u044F\u044F\u0413\u0440\u0430\u043D\u0438\u0446\u0430\u041C\u0430\u0441\u0441\u0438\u0432\u0430 " + "\u041D\u043E\u043C\u0435\u0440\u0421\u043F\u0440 " + "\u041D\u041F\u0435\u0440\u0438\u043E\u0434 " + "\u041E\u043A\u043D\u043E " + "\u041E\u043A\u0440 " + "\u041E\u043A\u0440\u0443\u0436\u0435\u043D\u0438\u0435 " + "\u041E\u0442\u043B\u0418\u043D\u0444\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C " + "\u041E\u0442\u043B\u0418\u043D\u0444\u0423\u0434\u0430\u043B\u0438\u0442\u044C " + "\u041E\u0442\u0447\u0435\u0442 " + "\u041E\u0442\u0447\u0435\u0442\u0410\u043D\u0430\u043B " + "\u041E\u0442\u0447\u0435\u0442\u0418\u043D\u0442 " + "\u041F\u0430\u043F\u043A\u0430\u0421\u0443\u0449\u0435\u0441\u0442\u0432\u0443\u0435\u0442 " + "\u041F\u0430\u0443\u0437\u0430 " + "\u041F\u0412\u044B\u0431\u043E\u0440SQL " + "\u041F\u0435\u0440\u0435\u0438\u043C\u0435\u043D\u043E\u0432\u0430\u0442\u044C\u0424\u0430\u0439\u043B " + "\u041F\u0435\u0440\u0435\u043C\u0435\u043D\u043D\u044B\u0435 " + "\u041F\u0435\u0440\u0435\u043C\u0435\u0441\u0442\u0438\u0442\u044C\u0424\u0430\u0439\u043B " + "\u041F\u043E\u0434\u0441\u0442\u0440 " + "\u041F\u043E\u0438\u0441\u043A\u041F\u043E\u0434\u0441\u0442\u0440 " + "\u041F\u043E\u0438\u0441\u043A\u0421\u0442\u0440 " + "\u041F\u043E\u043B\u0443\u0447\u0438\u0442\u044C\u0418\u0414\u0422\u0430\u0431\u043B\u0438\u0446\u044B " + "\u041F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044C\u0414\u043E\u043F\u043E\u043B\u043D\u0438\u0442\u0435\u043B\u044C\u043D\u043E " + "\u041F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044C\u0418\u0414 " + "\u041F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044C\u0418\u043C\u044F " + "\u041F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044C\u0421\u0442\u0430\u0442\u0443\u0441 " + "\u041F\u0440\u0435\u0440\u0432\u0430\u0442\u044C " + "\u041F\u0440\u043E\u0432\u0435\u0440\u0438\u0442\u044C\u041F\u0430\u0440\u0430\u043C\u0435\u0442\u0440 " + "\u041F\u0440\u043E\u0432\u0435\u0440\u0438\u0442\u044C\u041F\u0430\u0440\u0430\u043C\u0435\u0442\u0440\u0417\u043D\u0430\u0447 " + "\u041F\u0440\u043E\u0432\u0435\u0440\u0438\u0442\u044C\u0423\u0441\u043B\u043E\u0432\u0438\u0435 " + "\u0420\u0430\u0437\u0431\u0421\u0442\u0440 " + "\u0420\u0430\u0437\u043D\u0412\u0440\u0435\u043C\u044F " + "\u0420\u0430\u0437\u043D\u0414\u0430\u0442 " + "\u0420\u0430\u0437\u043D\u0414\u0430\u0442\u0430\u0412\u0440\u0435\u043C\u044F " + "\u0420\u0430\u0437\u043D\u0420\u0430\u0431\u0412\u0440\u0435\u043C\u044F " + "\u0420\u0435\u0433\u0423\u0441\u0442\u0412\u0440\u0435\u043C " + "\u0420\u0435\u0433\u0423\u0441\u0442\u0414\u0430\u0442 " + "\u0420\u0435\u0433\u0423\u0441\u0442\u0427\u0441\u043B " + "\u0420\u0435\u0434\u0422\u0435\u043A\u0441\u0442 " + "\u0420\u0435\u0435\u0441\u0442\u0440\u0417\u0430\u043F\u0438\u0441\u044C " + "\u0420\u0435\u0435\u0441\u0442\u0440\u0421\u043F\u0438\u0441\u043E\u043A\u0418\u043C\u0435\u043D\u041F\u0430\u0440\u0430\u043C " + "\u0420\u0435\u0435\u0441\u0442\u0440\u0427\u0442\u0435\u043D\u0438\u0435 " + "\u0420\u0435\u043A\u0432\u0421\u043F\u0440 " + "\u0420\u0435\u043A\u0432\u0421\u043F\u0440\u041F\u0440 " + "\u0421\u0435\u0433\u043E\u0434\u043D\u044F " + "\u0421\u0435\u0439\u0447\u0430\u0441 " + "\u0421\u0435\u0440\u0432\u0435\u0440 " + "\u0421\u0435\u0440\u0432\u0435\u0440\u041F\u0440\u043E\u0446\u0435\u0441\u0441\u0418\u0414 " + "\u0421\u0435\u0440\u0442\u0438\u0444\u0438\u043A\u0430\u0442\u0424\u0430\u0439\u043B\u0421\u0447\u0438\u0442\u0430\u0442\u044C " + "\u0421\u0436\u041F\u0440\u043E\u0431 " + "\u0421\u0438\u043C\u0432\u043E\u043B " + "\u0421\u0438\u0441\u0442\u0435\u043C\u0430\u0414\u0438\u0440\u0435\u043A\u0442\u0443\u043C\u041A\u043E\u0434 " + "\u0421\u0438\u0441\u0442\u0435\u043C\u0430\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u044F " + "\u0421\u0438\u0441\u0442\u0435\u043C\u0430\u041A\u043E\u0434 " + "\u0421\u043E\u0434\u0435\u0440\u0436\u0438\u0442 " + "\u0421\u043E\u0435\u0434\u0438\u043D\u0435\u043D\u0438\u0435\u0417\u0430\u043A\u0440\u044B\u0442\u044C " + "\u0421\u043E\u0435\u0434\u0438\u043D\u0435\u043D\u0438\u0435\u041E\u0442\u043A\u0440\u044B\u0442\u044C " + "\u0421\u043E\u0437\u0434\u0430\u0442\u044C\u0414\u0438\u0430\u043B\u043E\u0433 " + "\u0421\u043E\u0437\u0434\u0430\u0442\u044C\u0414\u0438\u0430\u043B\u043E\u0433\u0412\u044B\u0431\u043E\u0440\u0430\u0418\u0437\u0414\u0432\u0443\u0445\u0421\u043F\u0438\u0441\u043A\u043E\u0432 " + "\u0421\u043E\u0437\u0434\u0430\u0442\u044C\u0414\u0438\u0430\u043B\u043E\u0433\u0412\u044B\u0431\u043E\u0440\u0430\u041F\u0430\u043F\u043A\u0438 " + "\u0421\u043E\u0437\u0434\u0430\u0442\u044C\u0414\u0438\u0430\u043B\u043E\u0433\u041E\u0442\u043A\u0440\u044B\u0442\u0438\u044F\u0424\u0430\u0439\u043B\u0430 " + "\u0421\u043E\u0437\u0434\u0430\u0442\u044C\u0414\u0438\u0430\u043B\u043E\u0433\u0421\u043E\u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F\u0424\u0430\u0439\u043B\u0430 " + "\u0421\u043E\u0437\u0434\u0430\u0442\u044C\u0417\u0430\u043F\u0440\u043E\u0441 " + "\u0421\u043E\u0437\u0434\u0430\u0442\u044C\u0418\u043D\u0434\u0438\u043A\u0430\u0442\u043E\u0440 " + "\u0421\u043E\u0437\u0434\u0430\u0442\u044C\u0418\u0441\u043A\u043B\u044E\u0447\u0435\u043D\u0438\u0435 " + "\u0421\u043E\u0437\u0434\u0430\u0442\u044C\u041A\u044D\u0448\u0438\u0440\u043E\u0432\u0430\u043D\u043D\u044B\u0439\u0421\u043F\u0440\u0430\u0432\u043E\u0447\u043D\u0438\u043A " + "\u0421\u043E\u0437\u0434\u0430\u0442\u044C\u041C\u0430\u0441\u0441\u0438\u0432 " + "\u0421\u043E\u0437\u0434\u0430\u0442\u044C\u041D\u0430\u0431\u043E\u0440\u0414\u0430\u043D\u043D\u044B\u0445 " + "\u0421\u043E\u0437\u0434\u0430\u0442\u044C\u041E\u0431\u044A\u0435\u043A\u0442 " + "\u0421\u043E\u0437\u0434\u0430\u0442\u044C\u041E\u0442\u0447\u0435\u0442 " + "\u0421\u043E\u0437\u0434\u0430\u0442\u044C\u041F\u0430\u043F\u043A\u0443 " + "\u0421\u043E\u0437\u0434\u0430\u0442\u044C\u0420\u0435\u0434\u0430\u043A\u0442\u043E\u0440 " + "\u0421\u043E\u0437\u0434\u0430\u0442\u044C\u0421\u043E\u0435\u0434\u0438\u043D\u0435\u043D\u0438\u0435 " + "\u0421\u043E\u0437\u0434\u0430\u0442\u044C\u0421\u043F\u0438\u0441\u043E\u043A " + "\u0421\u043E\u0437\u0434\u0430\u0442\u044C\u0421\u043F\u0438\u0441\u043E\u043A\u0421\u0442\u0440\u043E\u043A " + "\u0421\u043E\u0437\u0434\u0430\u0442\u044C\u0421\u043F\u0440\u0430\u0432\u043E\u0447\u043D\u0438\u043A " + "\u0421\u043E\u0437\u0434\u0430\u0442\u044C\u0421\u0446\u0435\u043D\u0430\u0440\u0438\u0439 " + "\u0421\u043E\u0437\u0434\u0421\u043F\u0440 " + "\u0421\u043E\u0441\u0442\u0421\u043F\u0440 " + "\u0421\u043E\u0445\u0440 " + "\u0421\u043E\u0445\u0440\u0421\u043F\u0440 " + "\u0421\u043F\u0438\u0441\u043E\u043A\u0421\u0438\u0441\u0442\u0435\u043C " + "\u0421\u043F\u0440 " + "\u0421\u043F\u0440\u0430\u0432\u043E\u0447\u043D\u0438\u043A " + "\u0421\u043F\u0440\u0411\u043B\u043E\u043A\u0415\u0441\u0442\u044C " + "\u0421\u043F\u0440\u0411\u043B\u043E\u043A\u0421\u043D\u044F\u0442\u044C " + "\u0421\u043F\u0440\u0411\u043B\u043E\u043A\u0421\u043D\u044F\u0442\u044C\u0420\u0430\u0441\u0448 " + "\u0421\u043F\u0440\u0411\u043B\u043E\u043A\u0423\u0441\u0442\u0430\u043D\u043E\u0432\u0438\u0442\u044C " + "\u0421\u043F\u0440\u0418\u0437\u043C\u041D\u0430\u0431\u0414\u0430\u043D " + "\u0421\u043F\u0440\u041A\u043E\u0434 " + "\u0421\u043F\u0440\u041D\u043E\u043C\u0435\u0440 " + "\u0421\u043F\u0440\u041E\u0431\u043D\u043E\u0432\u0438\u0442\u044C " + "\u0421\u043F\u0440\u041E\u0442\u043A\u0440\u044B\u0442\u044C " + "\u0421\u043F\u0440\u041E\u0442\u043C\u0435\u043D\u0438\u0442\u044C " + "\u0421\u043F\u0440\u041F\u0430\u0440\u0430\u043C " + "\u0421\u043F\u0440\u041F\u043E\u043B\u0435\u0417\u043D\u0430\u0447 " + "\u0421\u043F\u0440\u041F\u043E\u043B\u0435\u0418\u043C\u044F " + "\u0421\u043F\u0440\u0420\u0435\u043A\u0432 " + "\u0421\u043F\u0440\u0420\u0435\u043A\u0432\u0412\u0432\u0435\u0434\u0417\u043D " + "\u0421\u043F\u0440\u0420\u0435\u043A\u0432\u041D\u043E\u0432\u044B\u0435 " + "\u0421\u043F\u0440\u0420\u0435\u043A\u0432\u041F\u0440 " + "\u0421\u043F\u0440\u0420\u0435\u043A\u0432\u041F\u0440\u0435\u0434\u0417\u043D " + "\u0421\u043F\u0440\u0420\u0435\u043A\u0432\u0420\u0435\u0436\u0438\u043C " + "\u0421\u043F\u0440\u0420\u0435\u043A\u0432\u0422\u0438\u043F\u0422\u0435\u043A\u0441\u0442 " + "\u0421\u043F\u0440\u0421\u043E\u0437\u0434\u0430\u0442\u044C " + "\u0421\u043F\u0440\u0421\u043E\u0441\u0442 " + "\u0421\u043F\u0440\u0421\u043E\u0445\u0440\u0430\u043D\u0438\u0442\u044C " + "\u0421\u043F\u0440\u0422\u0431\u043B\u0418\u0442\u043E\u0433 " + "\u0421\u043F\u0440\u0422\u0431\u043B\u0421\u0442\u0440 " + "\u0421\u043F\u0440\u0422\u0431\u043B\u0421\u0442\u0440\u041A\u043E\u043B " + "\u0421\u043F\u0440\u0422\u0431\u043B\u0421\u0442\u0440\u041C\u0430\u043A\u0441 " + "\u0421\u043F\u0440\u0422\u0431\u043B\u0421\u0442\u0440\u041C\u0438\u043D " + "\u0421\u043F\u0440\u0422\u0431\u043B\u0421\u0442\u0440\u041F\u0440\u0435\u0434 " + "\u0421\u043F\u0440\u0422\u0431\u043B\u0421\u0442\u0440\u0421\u043B\u0435\u0434 " + "\u0421\u043F\u0440\u0422\u0431\u043B\u0421\u0442\u0440\u0421\u043E\u0437\u0434 " + "\u0421\u043F\u0440\u0422\u0431\u043B\u0421\u0442\u0440\u0423\u0434 " + "\u0421\u043F\u0440\u0422\u0435\u043A\u041F\u0440\u0435\u0434\u0441\u0442 " + "\u0421\u043F\u0440\u0423\u0434\u0430\u043B\u0438\u0442\u044C " + "\u0421\u0440\u0430\u0432\u043D\u0438\u0442\u044C\u0421\u0442\u0440 " + "\u0421\u0442\u0440\u0412\u0435\u0440\u0445\u0420\u0435\u0433\u0438\u0441\u0442\u0440 " + "\u0421\u0442\u0440\u041D\u0438\u0436\u043D\u0420\u0435\u0433\u0438\u0441\u0442\u0440 " + "\u0421\u0442\u0440\u0422\u0431\u043B\u0421\u043F\u0440 " + "\u0421\u0443\u043C\u041F\u0440\u043E\u043F " + "\u0421\u0446\u0435\u043D\u0430\u0440\u0438\u0439 " + "\u0421\u0446\u0435\u043D\u0430\u0440\u0438\u0439\u041F\u0430\u0440\u0430\u043C " + "\u0422\u0435\u043A\u0412\u0435\u0440\u0441\u0438\u044F " + "\u0422\u0435\u043A\u041E\u0440\u0433 " + "\u0422\u043E\u0447\u043D " + "\u0422\u0440\u0430\u043D " + "\u0422\u0440\u0430\u043D\u0441\u043B\u0438\u0442\u0435\u0440\u0430\u0446\u0438\u044F " + "\u0423\u0434\u0430\u043B\u0438\u0442\u044C\u0422\u0430\u0431\u043B\u0438\u0446\u0443 " + "\u0423\u0434\u0430\u043B\u0438\u0442\u044C\u0424\u0430\u0439\u043B " + "\u0423\u0434\u0421\u043F\u0440 " + "\u0423\u0434\u0421\u0442\u0440\u0422\u0431\u043B\u0421\u043F\u0440 " + "\u0423\u0441\u0442 " + "\u0423\u0441\u0442\u0430\u043D\u043E\u0432\u043A\u0438\u041A\u043E\u043D\u0441\u0442\u0430\u043D\u0442 " + "\u0424\u0430\u0439\u043B\u0410\u0442\u0440\u0438\u0431\u0443\u0442\u0421\u0447\u0438\u0442\u0430\u0442\u044C " + "\u0424\u0430\u0439\u043B\u0410\u0442\u0440\u0438\u0431\u0443\u0442\u0423\u0441\u0442\u0430\u043D\u043E\u0432\u0438\u0442\u044C " + "\u0424\u0430\u0439\u043B\u0412\u0440\u0435\u043C\u044F " + "\u0424\u0430\u0439\u043B\u0412\u0440\u0435\u043C\u044F\u0423\u0441\u0442\u0430\u043D\u043E\u0432\u0438\u0442\u044C " + "\u0424\u0430\u0439\u043B\u0412\u044B\u0431\u0440\u0430\u0442\u044C " + "\u0424\u0430\u0439\u043B\u0417\u0430\u043D\u044F\u0442 " + "\u0424\u0430\u0439\u043B\u0417\u0430\u043F\u0438\u0441\u0430\u0442\u044C " + "\u0424\u0430\u0439\u043B\u0418\u0441\u043A\u0430\u0442\u044C " + "\u0424\u0430\u0439\u043B\u041A\u043E\u043F\u0438\u0440\u043E\u0432\u0430\u0442\u044C " + "\u0424\u0430\u0439\u043B\u041C\u043E\u0436\u043D\u043E\u0427\u0438\u0442\u0430\u0442\u044C " + "\u0424\u0430\u0439\u043B\u041E\u0442\u043A\u0440\u044B\u0442\u044C " + "\u0424\u0430\u0439\u043B\u041F\u0435\u0440\u0435\u0438\u043C\u0435\u043D\u043E\u0432\u0430\u0442\u044C " + "\u0424\u0430\u0439\u043B\u041F\u0435\u0440\u0435\u043A\u043E\u0434\u0438\u0440\u043E\u0432\u0430\u0442\u044C " + "\u0424\u0430\u0439\u043B\u041F\u0435\u0440\u0435\u043C\u0435\u0441\u0442\u0438\u0442\u044C " + "\u0424\u0430\u0439\u043B\u041F\u0440\u043E\u0441\u043C\u043E\u0442\u0440\u0435\u0442\u044C " + "\u0424\u0430\u0439\u043B\u0420\u0430\u0437\u043C\u0435\u0440 " + "\u0424\u0430\u0439\u043B\u0421\u043E\u0437\u0434\u0430\u0442\u044C " + "\u0424\u0430\u0439\u043B\u0421\u0441\u044B\u043B\u043A\u0430\u0421\u043E\u0437\u0434\u0430\u0442\u044C " + "\u0424\u0430\u0439\u043B\u0421\u0443\u0449\u0435\u0441\u0442\u0432\u0443\u0435\u0442 " + "\u0424\u0430\u0439\u043B\u0421\u0447\u0438\u0442\u0430\u0442\u044C " + "\u0424\u0430\u0439\u043B\u0423\u0434\u0430\u043B\u0438\u0442\u044C " + "\u0424\u043C\u0442SQL\u0414\u0430\u0442 " + "\u0424\u043C\u0442\u0414\u0430\u0442 " + "\u0424\u043C\u0442\u0421\u0442\u0440 " + "\u0424\u043C\u0442\u0427\u0441\u043B " + "\u0424\u043E\u0440\u043C\u0430\u0442 " + "\u0426\u041C\u0430\u0441\u0441\u0438\u0432\u042D\u043B\u0435\u043C\u0435\u043D\u0442 " + "\u0426\u041D\u0430\u0431\u043E\u0440\u0414\u0430\u043D\u043D\u044B\u0445\u0420\u0435\u043A\u0432\u0438\u0437\u0438\u0442 " + "\u0426\u041F\u043E\u0434\u0441\u0442\u0440 ";
      let Xo = "AltState Application CallType ComponentTokens CreatedJobs CreatedNotices ControlState DialogResult Dialogs EDocuments EDocumentVersionSource Folders GlobalIDs Job Jobs InputValue LookUpReference LookUpRequisiteNames LookUpSearch Object ParentComponent Processes References Requisite ReportName Reports Result Scripts Searches SelectedAttachments SelectedItems SelectMode Sender ServerEvents ServiceFactory ShiftState SubTask SystemDialogs Tasks Wizard Wizards Work " + "\u0412\u044B\u0437\u043E\u0432\u0421\u043F\u043E\u0441\u043E\u0431 " + "\u0418\u043C\u044F\u041E\u0442\u0447\u0435\u0442\u0430 " + "\u0420\u0435\u043A\u0432\u0417\u043D\u0430\u0447 ";
      let qo = "IApplication IAccessRights IAccountRepository IAccountSelectionRestrictions IAction IActionList IAdministrationHistoryDescription IAnchors IApplication IArchiveInfo IAttachment IAttachmentList ICheckListBox ICheckPointedList IColumn IComponent IComponentDescription IComponentToken IComponentTokenFactory IComponentTokenInfo ICompRecordInfo IConnection IContents IControl IControlJob IControlJobInfo IControlList ICrypto ICrypto2 ICustomJob ICustomJobInfo ICustomListBox ICustomObjectWizardStep ICustomWork ICustomWorkInfo IDataSet IDataSetAccessInfo IDataSigner IDateCriterion IDateRequisite IDateRequisiteDescription IDateValue IDeaAccessRights IDeaObjectInfo IDevelopmentComponentLock IDialog IDialogFactory IDialogPickRequisiteItems IDialogsFactory IDICSFactory IDocRequisite IDocumentInfo IDualListDialog IECertificate IECertificateInfo IECertificates IEditControl IEditorForm IEdmsExplorer IEdmsObject IEdmsObjectDescription IEdmsObjectFactory IEdmsObjectInfo IEDocument IEDocumentAccessRights IEDocumentDescription IEDocumentEditor IEDocumentFactory IEDocumentInfo IEDocumentStorage IEDocumentVersion IEDocumentVersionListDialog IEDocumentVersionSource IEDocumentWizardStep IEDocVerSignature IEDocVersionState IEnabledMode IEncodeProvider IEncrypter IEvent IEventList IException IExternalEvents IExternalHandler IFactory IField IFileDialog IFolder IFolderDescription IFolderDialog IFolderFactory IFolderInfo IForEach IForm IFormTitle IFormWizardStep IGlobalIDFactory IGlobalIDInfo IGrid IHasher IHistoryDescription IHyperLinkControl IImageButton IImageControl IInnerPanel IInplaceHint IIntegerCriterion IIntegerList IIntegerRequisite IIntegerValue IISBLEditorForm IJob IJobDescription IJobFactory IJobForm IJobInfo ILabelControl ILargeIntegerCriterion ILargeIntegerRequisite ILargeIntegerValue ILicenseInfo ILifeCycleStage IList IListBox ILocalIDInfo ILocalization ILock IMemoryDataSet IMessagingFactory IMetadataRepository INotice INoticeInfo INumericCriterion INumericRequisite INumericValue IObject IObjectDescription IObjectImporter IObjectInfo IObserver IPanelGroup IPickCriterion IPickProperty IPickRequisite IPickRequisiteDescription IPickRequisiteItem IPickRequisiteItems IPickValue IPrivilege IPrivilegeList IProcess IProcessFactory IProcessMessage IProgress IProperty IPropertyChangeEvent IQuery IReference IReferenceCriterion IReferenceEnabledMode IReferenceFactory IReferenceHistoryDescription IReferenceInfo IReferenceRecordCardWizardStep IReferenceRequisiteDescription IReferencesFactory IReferenceValue IRefRequisite IReport IReportFactory IRequisite IRequisiteDescription IRequisiteDescriptionList IRequisiteFactory IRichEdit IRouteStep IRule IRuleList ISchemeBlock IScript IScriptFactory ISearchCriteria ISearchCriterion ISearchDescription ISearchFactory ISearchFolderInfo ISearchForObjectDescription ISearchResultRestrictions ISecuredContext ISelectDialog IServerEvent IServerEventFactory IServiceDialog IServiceFactory ISignature ISignProvider ISignProvider2 ISignProvider3 ISimpleCriterion IStringCriterion IStringList IStringRequisite IStringRequisiteDescription IStringValue ISystemDialogsFactory ISystemInfo ITabSheet ITask ITaskAbortReasonInfo ITaskCardWizardStep ITaskDescription ITaskFactory ITaskInfo ITaskRoute ITextCriterion ITextRequisite ITextValue ITreeListSelectDialog IUser IUserList IValue IView IWebBrowserControl IWizard IWizardAction IWizardFactory IWizardFormElement IWizardParam IWizardPickParam IWizardReferenceParam IWizardStep IWorkAccessRights IWorkDescription IWorkflowAskableParam IWorkflowAskableParams IWorkflowBlock IWorkflowBlockResult IWorkflowEnabledMode IWorkflowParam IWorkflowPickParam IWorkflowReferenceParam IWorkState IWorkTreeCustomNode IWorkTreeJobNode IWorkTreeTaskNode IXMLEditorForm SBCrypto ";
      let ss = J + Pr;
      let Ri = Xo;
      let ya = "null true false nil ";
      let fs = {
        className: "number",
        begin: e.NUMBER_RE,
        relevance: 0
      };
      let tc = {
        className: "string",
        variants: [{
          begin: '"',
          end: '"'
        }, {
          begin: "'",
          end: "'"
        }]
      };
      let On = {
        className: "doctag",
        begin: "\\b(?:TODO|DONE|BEGIN|END|STUB|CHG|FIXME|NOTE|BUG|XXX)\\b",
        relevance: 0
      };
      let lr = {
        className: "comment",
        begin: "//",
        end: "$",
        relevance: 0,
        contains: [e.PHRASAL_WORDS_MODE, On]
      };
      let Mn = {
        className: "comment",
        begin: "/\\*",
        end: "\\*/",
        relevance: 0,
        contains: [e.PHRASAL_WORDS_MODE, On]
      };
      let Un = {
        variants: [lr, Mn]
      };
      let Er = {
        $pattern: "[A-Za-z\u0410-\u042F\u0430-\u044F\u0451\u0401_!][A-Za-z\u0410-\u042F\u0430-\u044F\u0451\u0401_0-9]*",
        keyword: r,
        built_in: ss,
        class: Ri,
        literal: "null true false nil "
      };
      let Or = {
        begin: "\\.\\s*" + e.UNDERSCORE_IDENT_RE,
        keywords: Er,
        relevance: 0
      };
      let Y = {
        className: "type",
        begin: ":[ \\t]*(" + qo.trim().replace(/\s/g, "|") + ")",
        end: "[ \\t]*=",
        excludeEnd: true
      };
      let Se = {
        className: "variable",
        keywords: Er,
        begin: "[A-Za-z\u0410-\u042F\u0430-\u044F\u0451\u0401_!][A-Za-z\u0410-\u042F\u0430-\u044F\u0451\u0401_0-9]*",
        relevance: 0,
        contains: [Y, Or]
      };
      let qe = "[A-Za-z\u0410-\u042F\u0430-\u044F\u0451\u0401_][A-Za-z\u0410-\u042F\u0430-\u044F\u0451\u0401_0-9]*" + "\\(";
      return {
        name: "ISBL",
        case_insensitive: true,
        keywords: Er,
        illegal: "\\$|\\?|%|,|;$|~|#|@|</",
        contains: [{
          className: "function",
          begin: qe,
          end: "\\)$",
          returnBegin: true,
          keywords: Er,
          illegal: "[\\[\\]\\|\\$\\?%,~#@]",
          contains: [{
            className: "title",
            keywords: {
              $pattern: "[A-Za-z\u0410-\u042F\u0430-\u044F\u0451\u0401_!][A-Za-z\u0410-\u042F\u0430-\u044F\u0451\u0401_0-9]*",
              built_in: Vr
            },
            begin: qe,
            end: "\\(",
            returnBegin: true,
            excludeEnd: true
          }, Or, Se, tc, fs, Un]
        }, Y, Or, Se, tc, fs, Un]
      };
    }
    eva.exports = xCp;
  });
  var sva = __commonJS((WJy, ova) => {
    var ljn = `\\.(${"[0-9](_*[0-9])*"})`;
    var nva = {
      className: "number",
      variants: [{
        begin: `(\\b(${"[0-9](_*[0-9])*"})((${ljn})|\\.)?|(${ljn}))[eE][+-]?(${"[0-9](_*[0-9])*"})[fFdD]?\\b`
      }, {
        begin: `\\b(${"[0-9](_*[0-9])*"})((${ljn})[fFdD]?\\b|\\.([fFdD]\\b)?)`
      }, {
        begin: `(${ljn})[fFdD]?\\b`
      }, {
        begin: `\\b(${"[0-9](_*[0-9])*"})[fFdD]\\b`
      }, {
        begin: `\\b0[xX]((${"[0-9a-fA-F](_*[0-9a-fA-F])*"})\\.?|(${"[0-9a-fA-F](_*[0-9a-fA-F])*"})?\\.(${"[0-9a-fA-F](_*[0-9a-fA-F])*"}))[pP][+-]?(${"[0-9](_*[0-9])*"})[fFdD]?\\b`
      }, {
        begin: "\\b(0|[1-9](_*[0-9])*)[lL]?\\b"
      }, {
        begin: `\\b0[xX](${"[0-9a-fA-F](_*[0-9a-fA-F])*"})[lL]?\\b`
      }, {
        begin: "\\b0(_*[0-7])*[lL]?\\b"
      }, {
        begin: "\\b0[bB][01](_*[01])*[lL]?\\b"
      }],
      relevance: 0
    };
    function rva(e, t, n) {
      if (n === -1) {
        return "";
      }
      return e.replace(t, r => rva(e, t, n - 1));
    }
    function kCp(e) {
      let t = e.regex;
      let n = "[\xC0-\u02B8a-zA-Z_$][\xC0-\u02B8a-zA-Z_$0-9]*";
      let r = "[\xC0-\u02B8a-zA-Z_$][\xC0-\u02B8a-zA-Z_$0-9]*" + rva("(?:<" + "[\xC0-\u02B8a-zA-Z_$][\xC0-\u02B8a-zA-Z_$0-9]*" + "~~~(?:\\s*,\\s*" + "[\xC0-\u02B8a-zA-Z_$][\xC0-\u02B8a-zA-Z_$0-9]*" + "~~~)*>)?", /~~~/g, 2);
      let l = {
        keyword: ["synchronized", "abstract", "private", "var", "static", "if", "const ", "for", "while", "strictfp", "finally", "protected", "import", "native", "final", "void", "enum", "else", "break", "transient", "catch", "instanceof", "volatile", "case", "assert", "package", "default", "public", "try", "switch", "continue", "throws", "protected", "public", "private", "module", "requires", "exports", "do", "sealed", "yield", "permits", "goto", "when"],
        literal: ["false", "true", "null"],
        type: ["char", "boolean", "long", "float", "int", "byte", "short", "double"],
        built_in: ["super", "this"]
      };
      let c = {
        className: "meta",
        begin: "@" + "[\xC0-\u02B8a-zA-Z_$][\xC0-\u02B8a-zA-Z_$0-9]*",
        contains: [{
          begin: /\(/,
          end: /\)/,
          contains: ["self"]
        }]
      };
      let u = {
        className: "params",
        begin: /\(/,
        end: /\)/,
        keywords: l,
        relevance: 0,
        contains: [e.C_BLOCK_COMMENT_MODE],
        endsParent: true
      };
      return {
        name: "Java",
        aliases: ["jsp"],
        keywords: l,
        illegal: /<\/|#/,
        contains: [e.COMMENT("/\\*\\*", "\\*/", {
          relevance: 0,
          contains: [{
            begin: /\w+@/,
            relevance: 0
          }, {
            className: "doctag",
            begin: "@[A-Za-z]+"
          }]
        }), {
          begin: /import java\.[a-z]+\./,
          keywords: "import",
          relevance: 2
        }, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, {
          begin: /"""/,
          end: /"""/,
          className: "string",
          contains: [e.BACKSLASH_ESCAPE]
        }, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, {
          match: [/\b(?:class|interface|enum|extends|implements|new)/, /\s+/, "[\xC0-\u02B8a-zA-Z_$][\xC0-\u02B8a-zA-Z_$0-9]*"],
          className: {
            1: "keyword",
            3: "title.class"
          }
        }, {
          match: /non-sealed/,
          scope: "keyword"
        }, {
          begin: [t.concat(/(?!else)/, "[\xC0-\u02B8a-zA-Z_$][\xC0-\u02B8a-zA-Z_$0-9]*"), /\s+/, "[\xC0-\u02B8a-zA-Z_$][\xC0-\u02B8a-zA-Z_$0-9]*", /\s+/, /=(?!=)/],
          className: {
            1: "type",
            3: "variable",
            5: "operator"
          }
        }, {
          begin: [/record/, /\s+/, "[\xC0-\u02B8a-zA-Z_$][\xC0-\u02B8a-zA-Z_$0-9]*"],
          className: {
            1: "keyword",
            3: "title.class"
          },
          contains: [u, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE]
        }, {
          beginKeywords: "new throw return else",
          relevance: 0
        }, {
          begin: ["(?:" + r + "\\s+)", e.UNDERSCORE_IDENT_RE, /\s*(?=\()/],
          className: {
            2: "title.function"
          },
          keywords: l,
          contains: [{
            className: "params",
            begin: /\(/,
            end: /\)/,
            keywords: l,
            relevance: 0,
            contains: [c, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, nva, e.C_BLOCK_COMMENT_MODE]
          }, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE]
        }, nva, c]
      };
    }
    ova.exports = kCp;
  });
  var uva = __commonJS((GJy, cva) => {
    var ACp = ["as", "in", "of", "if", "for", "while", "finally", "var", "new", "function", "do", "return", "void", "else", "break", "catch", "instanceof", "with", "throw", "case", "default", "try", "switch", "continue", "typeof", "delete", "let", "yield", "const", "class", "debugger", "async", "await", "static", "import", "from", "export", "extends", "using"];
    var ICp = ["true", "false", "null", "undefined", "NaN", "Infinity"];
    var iva = ["Object", "Function", "Boolean", "Symbol", "Math", "Date", "Number", "BigInt", "String", "RegExp", "Array", "Float32Array", "Float64Array", "Int8Array", "Uint8Array", "Uint8ClampedArray", "Int16Array", "Int32Array", "Uint16Array", "Uint32Array", "BigInt64Array", "BigUint64Array", "Set", "Map", "WeakSet", "WeakMap", "ArrayBuffer", "SharedArrayBuffer", "Atomics", "DataView", "JSON", "Promise", "Generator", "GeneratorFunction", "AsyncFunction", "Reflect", "Proxy", "Intl", "WebAssembly"];
    var ava = ["Error", "EvalError", "InternalError", "RangeError", "ReferenceError", "SyntaxError", "TypeError", "URIError"];
    var lva = ["setInterval", "setTimeout", "clearInterval", "clearTimeout", "require", "exports", "eval", "isFinite", "isNaN", "parseFloat", "parseInt", "decodeURI", "decodeURIComponent", "encodeURI", "encodeURIComponent", "escape", "unescape"];
    var PCp = ["arguments", "this", "super", "console", "window", "document", "localStorage", "sessionStorage", "module", "global"];
    var OCp = [].concat(lva, iva, ava);
    function DCp(e) {
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
        keyword: ACp,
        literal: ICp,
        built_in: OCp,
        "variable.language": PCp
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
          _: [...iva, ...ava]
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
        match: t.concat(/\b/, M([...lva, "super", "import"].map(N => `${N}\\s*\\(`)), "[A-Za-z$_][0-9A-Za-z$_]*", t.lookahead(/\s*\(/)),
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
    cva.exports = DCp;
  });
  var pva = __commonJS((VJy, dva) => {
    function MCp(e) {
      let n = {
        className: "params",
        begin: /\(/,
        end: /\)/,
        contains: [{
          begin: /[\w-]+ *=/,
          returnBegin: true,
          relevance: 0,
          contains: [{
            className: "attr",
            begin: /[\w-]+/
          }]
        }],
        relevance: 0
      };
      let r = {
        className: "function",
        begin: /:[\w\-.]+/,
        relevance: 0
      };
      let o = {
        className: "string",
        begin: /\B([\/.])[\w\-.\/=]+/
      };
      let s = {
        className: "params",
        begin: /--[\w\-=\/]+/
      };
      return {
        name: "JBoss CLI",
        aliases: ["wildfly-cli"],
        keywords: {
          $pattern: "[a-z-]+",
          keyword: "alias batch cd clear command connect connection-factory connection-info data-source deploy deployment-info deployment-overlay echo echo-dmr help history if jdbc-driver-info jms-queue|20 jms-topic|20 ls patch pwd quit read-attribute read-operation reload rollout-plan run-batch set shutdown try unalias undeploy unset version xa-data-source",
          literal: "true false"
        },
        contains: [e.HASH_COMMENT_MODE, e.QUOTE_STRING_MODE, s, r, o, n]
      };
    }
    dva.exports = MCp;
  });
  var fva = __commonJS((zJy, mva) => {
    function NCp(e) {
      let t = {
        className: "attr",
        begin: /"(\\.|[^\\"\r\n])*"(?=\s*:)/,
        relevance: 1.01
      };
      let n = {
        match: /[{}[\],:]/,
        className: "punctuation",
        relevance: 0
      };
      let r = ["true", "false", "null"];
      let o = {
        scope: "literal",
        beginKeywords: r.join(" ")
      };
      return {
        name: "JSON",
        aliases: ["jsonc"],
        keywords: {
          literal: r
        },
        contains: [t, n, e.QUOTE_STRING_MODE, o, e.C_NUMBER_MODE, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE],
        illegal: "\\S"
      };
    }
    mva.exports = NCp;
  });
  var gva = __commonJS((KJy, hva) => {
    function LCp(e) {
      let s = {
        $pattern: "[A-Za-z_\\u00A1-\\uFFFF][A-Za-z_0-9\\u00A1-\\uFFFF]*",
        keyword: ["baremodule", "begin", "break", "catch", "ccall", "const", "continue", "do", "else", "elseif", "end", "export", "false", "finally", "for", "function", "global", "if", "import", "in", "isa", "let", "local", "macro", "module", "quote", "return", "true", "try", "using", "where", "while"],
        literal: ["ARGS", "C_NULL", "DEPOT_PATH", "ENDIAN_BOM", "ENV", "Inf", "Inf16", "Inf32", "Inf64", "InsertionSort", "LOAD_PATH", "MergeSort", "NaN", "NaN16", "NaN32", "NaN64", "PROGRAM_FILE", "QuickSort", "RoundDown", "RoundFromZero", "RoundNearest", "RoundNearestTiesAway", "RoundNearestTiesUp", "RoundToZero", "RoundUp", "VERSION|0", "devnull", "false", "im", "missing", "nothing", "pi", "stderr", "stdin", "stdout", "true", "undef", "\u03C0", "\u212F"],
        built_in: ["AbstractArray", "AbstractChannel", "AbstractChar", "AbstractDict", "AbstractDisplay", "AbstractFloat", "AbstractIrrational", "AbstractMatrix", "AbstractRange", "AbstractSet", "AbstractString", "AbstractUnitRange", "AbstractVecOrMat", "AbstractVector", "Any", "ArgumentError", "Array", "AssertionError", "BigFloat", "BigInt", "BitArray", "BitMatrix", "BitSet", "BitVector", "Bool", "BoundsError", "CapturedException", "CartesianIndex", "CartesianIndices", "Cchar", "Cdouble", "Cfloat", "Channel", "Char", "Cint", "Cintmax_t", "Clong", "Clonglong", "Cmd", "Colon", "Complex", "ComplexF16", "ComplexF32", "ComplexF64", "CompositeException", "Condition", "Cptrdiff_t", "Cshort", "Csize_t", "Cssize_t", "Cstring", "Cuchar", "Cuint", "Cuintmax_t", "Culong", "Culonglong", "Cushort", "Cvoid", "Cwchar_t", "Cwstring", "DataType", "DenseArray", "DenseMatrix", "DenseVecOrMat", "DenseVector", "Dict", "DimensionMismatch", "Dims", "DivideError", "DomainError", "EOFError", "Enum", "ErrorException", "Exception", "ExponentialBackOff", "Expr", "Float16", "Float32", "Float64", "Function", "GlobalRef", "HTML", "IO", "IOBuffer", "IOContext", "IOStream", "IdDict", "IndexCartesian", "IndexLinear", "IndexStyle", "InexactError", "InitError", "Int", "Int128", "Int16", "Int32", "Int64", "Int8", "Integer", "InterruptException", "InvalidStateException", "Irrational", "KeyError", "LinRange", "LineNumberNode", "LinearIndices", "LoadError", "MIME", "Matrix", "Method", "MethodError", "Missing", "MissingException", "Module", "NTuple", "NamedTuple", "Nothing", "Number", "OrdinalRange", "OutOfMemoryError", "OverflowError", "Pair", "PartialQuickSort", "PermutedDimsArray", "Pipe", "ProcessFailedException", "Ptr", "QuoteNode", "Rational", "RawFD", "ReadOnlyMemoryError", "Real", "ReentrantLock", "Ref", "Regex", "RegexMatch", "RoundingMode", "SegmentationFault", "Set", "Signed", "Some", "StackOverflowError", "StepRange", "StepRangeLen", "StridedArray", "StridedMatrix", "StridedVecOrMat", "StridedVector", "String", "StringIndexError", "SubArray", "SubString", "SubstitutionString", "Symbol", "SystemError", "Task", "TaskFailedException", "Text", "TextDisplay", "Timer", "Tuple", "Type", "TypeError", "TypeVar", "UInt", "UInt128", "UInt16", "UInt32", "UInt64", "UInt8", "UndefInitializer", "UndefKeywordError", "UndefRefError", "UndefVarError", "Union", "UnionAll", "UnitRange", "Unsigned", "Val", "Vararg", "VecElement", "VecOrMat", "Vector", "VersionNumber", "WeakKeyDict", "WeakRef"]
      };
      let i = {
        keywords: s,
        illegal: /<\//
      };
      let a = {
        className: "number",
        begin: /(\b0x[\d_]*(\.[\d_]*)?|0x\.\d[\d_]*)p[-+]?\d+|\b0[box][a-fA-F0-9][a-fA-F0-9_]*|(\b\d[\d_]*(\.[\d_]*)?|\.\d[\d_]*)([eEfF][-+]?\d+)?/,
        relevance: 0
      };
      let l = {
        className: "string",
        begin: /'(.|\\[xXuU][a-zA-Z0-9]+)'/
      };
      let c = {
        className: "subst",
        begin: /\$\(/,
        end: /\)/,
        keywords: s
      };
      let u = {
        className: "variable",
        begin: "\\$[A-Za-z_\\u00A1-\\uFFFF][A-Za-z_0-9\\u00A1-\\uFFFF]*"
      };
      let d = {
        className: "string",
        contains: [e.BACKSLASH_ESCAPE, c, u],
        variants: [{
          begin: /\w*"""/,
          end: /"""\w*/,
          relevance: 10
        }, {
          begin: /\w*"/,
          end: /"\w*/
        }]
      };
      let p = {
        className: "string",
        contains: [e.BACKSLASH_ESCAPE, c, u],
        begin: "`",
        end: "`"
      };
      let m = {
        className: "meta",
        begin: "@[A-Za-z_\\u00A1-\\uFFFF][A-Za-z_0-9\\u00A1-\\uFFFF]*"
      };
      let f = {
        className: "comment",
        variants: [{
          begin: "#=",
          end: "=#",
          relevance: 10
        }, {
          begin: "#",
          end: "$"
        }]
      };
      i.name = "Julia";
      i.contains = [a, l, d, p, m, f, e.HASH_COMMENT_MODE, {
        className: "keyword",
        begin: "\\b(((abstract|primitive)\\s+)type|(mutable\\s+)?struct)\\b"
      }, {
        begin: /<:/
      }];
      c.contains = i.contains;
      return i;
    }
    hva.exports = LCp;
  });
  var _va = __commonJS((YJy, yva) => {
    function FCp(e) {
      return {
        name: "Julia REPL",
        contains: [{
          className: "meta.prompt",
          begin: /^julia>/,
          relevance: 10,
          starts: {
            end: /^(?![ ]{6})/,
            subLanguage: "julia"
          }
        }],
        aliases: ["jldoctest"]
      };
    }
    yva.exports = FCp;
  });
  var Sva = __commonJS((JJy, bva) => {
    var ujn = `\\.(${"[0-9](_*[0-9])*"})`;
    var UCp = {
      className: "number",
      variants: [{
        begin: `(\\b(${"[0-9](_*[0-9])*"})((${ujn})|\\.)?|(${ujn}))[eE][+-]?(${"[0-9](_*[0-9])*"})[fFdD]?\\b`
      }, {
        begin: `\\b(${"[0-9](_*[0-9])*"})((${ujn})[fFdD]?\\b|\\.([fFdD]\\b)?)`
      }, {
        begin: `(${ujn})[fFdD]?\\b`
      }, {
        begin: `\\b(${"[0-9](_*[0-9])*"})[fFdD]\\b`
      }, {
        begin: `\\b0[xX]((${"[0-9a-fA-F](_*[0-9a-fA-F])*"})\\.?|(${"[0-9a-fA-F](_*[0-9a-fA-F])*"})?\\.(${"[0-9a-fA-F](_*[0-9a-fA-F])*"}))[pP][+-]?(${"[0-9](_*[0-9])*"})[fFdD]?\\b`
      }, {
        begin: "\\b(0|[1-9](_*[0-9])*)[lL]?\\b"
      }, {
        begin: `\\b0[xX](${"[0-9a-fA-F](_*[0-9a-fA-F])*"})[lL]?\\b`
      }, {
        begin: "\\b0(_*[0-7])*[lL]?\\b"
      }, {
        begin: "\\b0[bB][01](_*[01])*[lL]?\\b"
      }],
      relevance: 0
    };
    function BCp(e) {
      let t = {
        keyword: "abstract as val var vararg get set class object open private protected public noinline crossinline dynamic final enum if else do while for when throw try catch finally import package is in fun override companion reified inline lateinit init interface annotation data sealed internal infix operator out by constructor super tailrec where const inner suspend typealias external expect actual",
        built_in: "Byte Short Char Int Long Boolean Float Double Void Unit Nothing",
        literal: "true false null"
      };
      let n = {
        className: "keyword",
        begin: /\b(break|continue|return|this)\b/,
        starts: {
          contains: [{
            className: "symbol",
            begin: /@\w+/
          }]
        }
      };
      let r = {
        className: "symbol",
        begin: e.UNDERSCORE_IDENT_RE + "@"
      };
      let o = {
        className: "subst",
        begin: /\$\{/,
        end: /\}/,
        contains: [e.C_NUMBER_MODE]
      };
      let s = {
        className: "variable",
        begin: "\\$" + e.UNDERSCORE_IDENT_RE
      };
      let i = {
        className: "string",
        variants: [{
          begin: '"""',
          end: '"""(?=[^"])',
          contains: [s, o]
        }, {
          begin: "'",
          end: "'",
          illegal: /\n/,
          contains: [e.BACKSLASH_ESCAPE]
        }, {
          begin: '"',
          end: '"',
          illegal: /\n/,
          contains: [e.BACKSLASH_ESCAPE, s, o]
        }]
      };
      o.contains.push(i);
      let a = {
        className: "meta",
        begin: "@(?:file|property|field|get|set|receiver|param|setparam|delegate)\\s*:(?:\\s*" + e.UNDERSCORE_IDENT_RE + ")?"
      };
      let l = {
        className: "meta",
        begin: "@" + e.UNDERSCORE_IDENT_RE,
        contains: [{
          begin: /\(/,
          end: /\)/,
          contains: [e.inherit(i, {
            className: "string"
          }), "self"]
        }]
      };
      let c = UCp;
      let u = e.COMMENT("/\\*", "\\*/", {
        contains: [e.C_BLOCK_COMMENT_MODE]
      });
      let d = {
        variants: [{
          className: "type",
          begin: e.UNDERSCORE_IDENT_RE
        }, {
          begin: /\(/,
          end: /\)/,
          contains: []
        }]
      };
      let p = d;
      p.variants[1].contains = [d];
      d.variants[1].contains = [p];
      return {
        name: "Kotlin",
        aliases: ["kt", "kts"],
        keywords: t,
        contains: [e.COMMENT("/\\*\\*", "\\*/", {
          relevance: 0,
          contains: [{
            className: "doctag",
            begin: "@[A-Za-z]+"
          }]
        }), e.C_LINE_COMMENT_MODE, u, n, r, a, l, {
          className: "function",
          beginKeywords: "fun",
          end: "[(]|$",
          returnBegin: true,
          excludeEnd: true,
          keywords: t,
          relevance: 5,
          contains: [{
            begin: e.UNDERSCORE_IDENT_RE + "\\s*\\(",
            returnBegin: true,
            relevance: 0,
            contains: [e.UNDERSCORE_TITLE_MODE]
          }, {
            className: "type",
            begin: /</,
            end: />/,
            keywords: "reified",
            relevance: 0
          }, {
            className: "params",
            begin: /\(/,
            end: /\)/,
            endsParent: true,
            keywords: t,
            relevance: 0,
            contains: [{
              begin: /:/,
              end: /[=,\/]/,
              endsWithParent: true,
              contains: [d, e.C_LINE_COMMENT_MODE, u],
              relevance: 0
            }, e.C_LINE_COMMENT_MODE, u, a, l, i, e.C_NUMBER_MODE]
          }, u]
        }, {
          begin: [/class|interface|trait/, /\s+/, e.UNDERSCORE_IDENT_RE],
          beginScope: {
            3: "title.class"
          },
          keywords: "class interface trait",
          end: /[:\{(]|$/,
          excludeEnd: true,
          illegal: "extends implements",
          contains: [{
            beginKeywords: "public protected internal private constructor"
          }, e.UNDERSCORE_TITLE_MODE, {
            className: "type",
            begin: /</,
            end: />/,
            excludeBegin: true,
            excludeEnd: true,
            relevance: 0
          }, {
            className: "type",
            begin: /[,:]\s*/,
            end: /[<\(,){\s]|$/,
            excludeBegin: true,
            returnEnd: true
          }, a, l]
        }, i, {
          className: "meta",
          begin: "^#!/usr/bin/env",
          end: "$",
          illegal: `
`
        }, c]
      };
    }
    bva.exports = BCp;
  });
  var Eva = __commonJS((XJy, Tva) => {
    function $Cp(e) {
      let o = {
        $pattern: "[a-zA-Z_][\\w.]*|&[lg]t;",
        literal: "true false none minimal full all void and or not bw nbw ew new cn ncn lt lte gt gte eq neq rx nrx ft",
        built_in: "array date decimal duration integer map pair string tag xml null boolean bytes keyword list locale queue set stack staticarray local var variable global data self inherited currentcapture givenblock",
        keyword: "cache database_names database_schemanames database_tablenames define_tag define_type email_batch encode_set html_comment handle handle_error header if inline iterate ljax_target link link_currentaction link_currentgroup link_currentrecord link_detail link_firstgroup link_firstrecord link_lastgroup link_lastrecord link_nextgroup link_nextrecord link_prevgroup link_prevrecord log loop namespace_using output_none portal private protect records referer referrer repeating resultset rows search_args search_arguments select sort_args sort_arguments thread_atomic value_list while abort case else fail_if fail_ifnot fail if_empty if_false if_null if_true loop_abort loop_continue loop_count params params_up return return_value run_children soap_definetag soap_lastrequest soap_lastresponse tag_name ascending average by define descending do equals frozen group handle_failure import in into join let match max min on order parent protected provide public require returnhome skip split_thread sum take thread to trait type where with yield yieldhome"
      };
      let s = e.COMMENT("<!--", "-->", {
        relevance: 0
      });
      let i = {
        className: "meta",
        begin: "\\[noprocess\\]",
        starts: {
          end: "\\[/noprocess\\]",
          returnEnd: true,
          contains: [s]
        }
      };
      let a = {
        className: "meta",
        begin: "\\[/noprocess|<\\?(lasso(script)?|=)"
      };
      let l = {
        className: "symbol",
        begin: "'[a-zA-Z_][\\w.]*'"
      };
      let c = [e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, e.inherit(e.C_NUMBER_MODE, {
        begin: e.C_NUMBER_RE + "|(-?infinity|NaN)\\b"
      }), e.inherit(e.APOS_STRING_MODE, {
        illegal: null
      }), e.inherit(e.QUOTE_STRING_MODE, {
        illegal: null
      }), {
        className: "string",
        begin: "`",
        end: "`"
      }, {
        variants: [{
          begin: "[#$][a-zA-Z_][\\w.]*"
        }, {
          begin: "#",
          end: "\\d+",
          illegal: "\\W"
        }]
      }, {
        className: "type",
        begin: "::\\s*",
        end: "[a-zA-Z_][\\w.]*",
        illegal: "\\W"
      }, {
        className: "params",
        variants: [{
          begin: "-(?!infinity)[a-zA-Z_][\\w.]*",
          relevance: 0
        }, {
          begin: "(\\.\\.\\.)"
        }]
      }, {
        begin: /(->|\.)\s*/,
        relevance: 0,
        contains: [l]
      }, {
        className: "class",
        beginKeywords: "define",
        returnEnd: true,
        end: "\\(|=>",
        contains: [e.inherit(e.TITLE_MODE, {
          begin: "[a-zA-Z_][\\w.]*(=(?!>))?|[-+*/%](?!>)"
        })]
      }];
      return {
        name: "Lasso",
        aliases: ["ls", "lassoscript"],
        case_insensitive: true,
        keywords: o,
        contains: [{
          className: "meta",
          begin: "\\]|\\?>",
          relevance: 0,
          starts: {
            end: "\\[|<\\?(lasso(script)?|=)",
            returnEnd: true,
            relevance: 0,
            contains: [s]
          }
        }, i, a, {
          className: "meta",
          begin: "\\[no_square_brackets",
          starts: {
            end: "\\[/no_square_brackets\\]",
            keywords: o,
            contains: [{
              className: "meta",
              begin: "\\]|\\?>",
              relevance: 0,
              starts: {
                end: "\\[noprocess\\]|<\\?(lasso(script)?|=)",
                returnEnd: true,
                contains: [s]
              }
            }, i, a].concat(c)
          }
        }, {
          className: "meta",
          begin: "\\[",
          relevance: 0
        }, {
          className: "meta",
          begin: "^#!",
          end: "lasso9$",
          relevance: 10
        }].concat(c)
      };
    }
    Tva.exports = $Cp;
  });
  var wva = __commonJS((QJy, vva) => {
    function HCp(e) {
      let n = e.regex.either(...["(?:NeedsTeXFormat|RequirePackage|GetIdInfo)", "Provides(?:Expl)?(?:Package|Class|File)", "(?:DeclareOption|ProcessOptions)", "(?:documentclass|usepackage|input|include)", "makeat(?:letter|other)", "ExplSyntax(?:On|Off)", "(?:new|renew|provide)?command", "(?:re)newenvironment", "(?:New|Renew|Provide|Declare)(?:Expandable)?DocumentCommand", "(?:New|Renew|Provide|Declare)DocumentEnvironment", "(?:(?:e|g|x)?def|let)", "(?:begin|end)", "(?:part|chapter|(?:sub){0,2}section|(?:sub)?paragraph)", "caption", "(?:label|(?:eq|page|name)?ref|(?:paren|foot|super)?cite)", "(?:alpha|beta|[Gg]amma|[Dd]elta|(?:var)?epsilon|zeta|eta|[Tt]heta|vartheta)", "(?:iota|(?:var)?kappa|[Ll]ambda|mu|nu|[Xx]i|[Pp]i|varpi|(?:var)rho)", "(?:[Ss]igma|varsigma|tau|[Uu]psilon|[Pp]hi|varphi|chi|[Pp]si|[Oo]mega)", "(?:frac|sum|prod|lim|infty|times|sqrt|leq|geq|left|right|middle|[bB]igg?)", "(?:[lr]angle|q?quad|[lcvdi]?dots|d?dot|hat|tilde|bar)"].map(I => I + "(?![a-zA-Z@:_])"));
      let r = new RegExp(["(?:__)?[a-zA-Z]{2,}_[a-zA-Z](?:_?[a-zA-Z])+:[a-zA-Z]*", "[lgc]__?[a-zA-Z](?:_?[a-zA-Z])*_[a-zA-Z]{2,}", "[qs]__?[a-zA-Z](?:_?[a-zA-Z])+", "use(?:_i)?:[a-zA-Z]*", "(?:else|fi|or):", "(?:if|cs|exp):w", "(?:hbox|vbox):n", "::[a-zA-Z]_unbraced", "::[a-zA-Z:]"].map(I => I + "(?![a-zA-Z:_])").join("|"));
      let o = [{
        begin: /[a-zA-Z@]+/
      }, {
        begin: /[^a-zA-Z@]?/
      }];
      let s = [{
        begin: /\^{6}[0-9a-f]{6}/
      }, {
        begin: /\^{5}[0-9a-f]{5}/
      }, {
        begin: /\^{4}[0-9a-f]{4}/
      }, {
        begin: /\^{3}[0-9a-f]{3}/
      }, {
        begin: /\^{2}[0-9a-f]{2}/
      }, {
        begin: /\^{2}[\u0000-\u007f]/
      }];
      let i = {
        className: "keyword",
        begin: /\\/,
        relevance: 0,
        contains: [{
          endsParent: true,
          begin: n
        }, {
          endsParent: true,
          begin: r
        }, {
          endsParent: true,
          variants: s
        }, {
          endsParent: true,
          relevance: 0,
          variants: o
        }]
      };
      let a = {
        className: "params",
        relevance: 0,
        begin: /#+\d?/
      };
      let l = {
        variants: s
      };
      let c = {
        className: "built_in",
        relevance: 0,
        begin: /[$&^_]/
      };
      let u = {
        className: "meta",
        begin: /% ?!(T[eE]X|tex|BIB|bib)/,
        end: "$",
        relevance: 10
      };
      let d = e.COMMENT("%", "$", {
        relevance: 0
      });
      let p = [i, a, l, c, u, d];
      let m = {
        begin: /\{/,
        end: /\}/,
        relevance: 0,
        contains: ["self", ...p]
      };
      let f = e.inherit(m, {
        relevance: 0,
        endsParent: true,
        contains: [m, ...p]
      });
      let h = {
        begin: /\[/,
        end: /\]/,
        endsParent: true,
        relevance: 0,
        contains: [m, ...p]
      };
      let g = {
        begin: /\s+/,
        relevance: 0
      };
      let y = [f];
      let _ = [h];
      let b = function (I, O) {
        return {
          contains: [g],
          starts: {
            relevance: 0,
            contains: I,
            starts: O
          }
        };
      };
      let S = function (I, O) {
        return {
          begin: "\\\\" + I + "(?![a-zA-Z@:_])",
          keywords: {
            $pattern: /\\[a-zA-Z]+/,
            keyword: "\\" + I
          },
          relevance: 0,
          contains: [g],
          starts: O
        };
      };
      let E = function (I, O) {
        return e.inherit({
          begin: "\\\\begin(?=[ \t]*(\\r?\\n[ \t]*)?\\{" + I + "\\})",
          keywords: {
            $pattern: /\\[a-zA-Z]+/,
            keyword: "\\begin"
          },
          relevance: 0
        }, b(y, O));
      };
      let C = (I = "string") => e.END_SAME_AS_BEGIN({
        className: I,
        begin: /(.|\r?\n)/,
        end: /(.|\r?\n)/,
        excludeBegin: true,
        excludeEnd: true,
        endsParent: true
      });
      let x = function (I) {
        return {
          className: "string",
          end: "(?=\\\\end\\{" + I + "\\})"
        };
      };
      let A = (I = "string") => ({
        relevance: 0,
        begin: /\{/,
        starts: {
          endsParent: true,
          contains: [{
            className: I,
            end: /(?=\})/,
            endsParent: true,
            contains: [{
              begin: /\{/,
              end: /\}/,
              relevance: 0,
              contains: ["self"]
            }]
          }]
        }
      });
      let k = [...["verb", "lstinline"].map(I => S(I, {
        contains: [C()]
      })), S("mint", b(y, {
        contains: [C()]
      })), S("mintinline", b(y, {
        contains: [A(), C()]
      })), S("url", {
        contains: [A("link"), A("link")]
      }), S("hyperref", {
        contains: [A("link")]
      }), S("href", b(_, {
        contains: [A("link")]
      })), ...[].concat(...["", "\\*"].map(I => [E("verbatim" + I, x("verbatim" + I)), E("filecontents" + I, b(y, x("filecontents" + I))), ...["", "B", "L"].map(O => E(O + "Verbatim" + I, b(_, x(O + "Verbatim" + I))))])), E("minted", b(_, b(y, x("minted"))))];
      return {
        name: "LaTeX",
        aliases: ["tex"],
        contains: [...k, ...p]
      };
    }
    vva.exports = HCp;
  });
  var Rva = __commonJS((ZJy, Cva) => {
    function jCp(e) {
      return {
        name: "LDIF",
        contains: [{
          className: "attribute",
          match: "^dn(?=:)",
          relevance: 10
        }, {
          className: "attribute",
          match: "^\\w+(?=:)"
        }, {
          className: "literal",
          match: "^-"
        }, e.HASH_COMMENT_MODE]
      };
    }
    Cva.exports = jCp;
  });
  var kva = __commonJS((eXy, xva) => {
    function qCp(e) {
      let t = /([A-Za-z_][A-Za-z_0-9]*)?/;
      let r = {
        scope: "params",
        begin: /\(/,
        end: /\)(?=\:?)/,
        endsParent: true,
        relevance: 7,
        contains: [{
          scope: "string",
          begin: '"',
          end: '"'
        }, {
          scope: "keyword",
          match: ["true", "false", "in"].join("|")
        }, {
          scope: "variable",
          match: /[A-Za-z_][A-Za-z_0-9]*/
        }, {
          scope: "operator",
          match: /\+|\-|\*|\/|\%|\=\=|\=|\!|\>|\<|\&\&|\|\|/
        }]
      };
      let o = {
        match: [t, /(?=\()/],
        scope: {
          1: "keyword"
        },
        contains: [r]
      };
      r.contains.unshift(o);
      return {
        name: "Leaf",
        contains: [{
          match: [/#+/, t, /(?=\()/],
          scope: {
            1: "punctuation",
            2: "keyword"
          },
          starts: {
            contains: [{
              match: /\:/,
              scope: "punctuation"
            }]
          },
          contains: [r]
        }, {
          match: [/#+/, t, /:?/],
          scope: {
            1: "punctuation",
            2: "keyword",
            3: "punctuation"
          }
        }]
      };
    }
    xva.exports = qCp;
  });
  var Ova = __commonJS((tXy, Pva) => {
    var WCp = e => ({
      IMPORTANT: {
        scope: "meta",
        begin: "!important"
      },
      BLOCK_COMMENT: e.C_BLOCK_COMMENT_MODE,
      HEXCOLOR: {
        scope: "number",
        begin: /#(([0-9a-fA-F]{3,4})|(([0-9a-fA-F]{2}){3,4}))\b/
      },
      FUNCTION_DISPATCH: {
        className: "built_in",
        begin: /[\w-]+(?=\()/
      },
      ATTRIBUTE_SELECTOR_MODE: {
        scope: "selector-attr",
        begin: /\[/,
        end: /\]/,
        illegal: "$",
        contains: [e.APOS_STRING_MODE, e.QUOTE_STRING_MODE]
      },
      CSS_NUMBER_MODE: {
        scope: "number",
        begin: e.NUMBER_RE + "(%|em|ex|ch|rem|vw|vh|vmin|vmax|cm|mm|in|pt|pc|px|deg|grad|rad|turn|s|ms|Hz|kHz|dpi|dpcm|dppx)?",
        relevance: 0
      },
      CSS_VARIABLE: {
        className: "attr",
        begin: /--[A-Za-z_][A-Za-z0-9_-]*/
      }
    });
    var GCp = ["a", "abbr", "address", "article", "aside", "audio", "b", "blockquote", "body", "button", "canvas", "caption", "cite", "code", "dd", "del", "details", "dfn", "div", "dl", "dt", "em", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "html", "i", "iframe", "img", "input", "ins", "kbd", "label", "legend", "li", "main", "mark", "menu", "nav", "object", "ol", "optgroup", "option", "p", "picture", "q", "quote", "samp", "section", "select", "source", "span", "strong", "summary", "sup", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "time", "tr", "ul", "var", "video"];
    var VCp = ["defs", "g", "marker", "mask", "pattern", "svg", "switch", "symbol", "feBlend", "feColorMatrix", "feComponentTransfer", "feComposite", "feConvolveMatrix", "feDiffuseLighting", "feDisplacementMap", "feFlood", "feGaussianBlur", "feImage", "feMerge", "feMorphology", "feOffset", "feSpecularLighting", "feTile", "feTurbulence", "linearGradient", "radialGradient", "stop", "circle", "ellipse", "image", "line", "path", "polygon", "polyline", "rect", "text", "use", "textPath", "tspan", "foreignObject", "clipPath"];
    var zCp = [...GCp, ...VCp];
    var KCp = ["any-hover", "any-pointer", "aspect-ratio", "color", "color-gamut", "color-index", "device-aspect-ratio", "device-height", "device-width", "display-mode", "forced-colors", "grid", "height", "hover", "inverted-colors", "monochrome", "orientation", "overflow-block", "overflow-inline", "pointer", "prefers-color-scheme", "prefers-contrast", "prefers-reduced-motion", "prefers-reduced-transparency", "resolution", "scan", "scripting", "update", "width", "min-width", "max-width", "min-height", "max-height"].sort().reverse();
    var Ava = ["active", "any-link", "blank", "checked", "current", "default", "defined", "dir", "disabled", "drop", "empty", "enabled", "first", "first-child", "first-of-type", "fullscreen", "future", "focus", "focus-visible", "focus-within", "has", "host", "host-context", "hover", "indeterminate", "in-range", "invalid", "is", "lang", "last-child", "last-of-type", "left", "link", "local-link", "not", "nth-child", "nth-col", "nth-last-child", "nth-last-col", "nth-last-of-type", "nth-of-type", "only-child", "only-of-type", "optional", "out-of-range", "past", "placeholder-shown", "read-only", "read-write", "required", "right", "root", "scope", "target", "target-within", "user-invalid", "valid", "visited", "where"].sort().reverse();
    var Iva = ["after", "backdrop", "before", "cue", "cue-region", "first-letter", "first-line", "grammar-error", "marker", "part", "placeholder", "selection", "slotted", "spelling-error"].sort().reverse();
    var YCp = ["accent-color", "align-content", "align-items", "align-self", "alignment-baseline", "all", "anchor-name", "animation", "animation-composition", "animation-delay", "animation-direction", "animation-duration", "animation-fill-mode", "animation-iteration-count", "animation-name", "animation-play-state", "animation-range", "animation-range-end", "animation-range-start", "animation-timeline", "animation-timing-function", "appearance", "aspect-ratio", "backdrop-filter", "backface-visibility", "background", "background-attachment", "background-blend-mode", "background-clip", "background-color", "background-image", "background-origin", "background-position", "background-position-x", "background-position-y", "background-repeat", "background-size", "baseline-shift", "block-size", "border", "border-block", "border-block-color", "border-block-end", "border-block-end-color", "border-block-end-style", "border-block-end-width", "border-block-start", "border-block-start-color", "border-block-start-style", "border-block-start-width", "border-block-style", "border-block-width", "border-bottom", "border-bottom-color", "border-bottom-left-radius", "border-bottom-right-radius", "border-bottom-style", "border-bottom-width", "border-collapse", "border-color", "border-end-end-radius", "border-end-start-radius", "border-image", "border-image-outset", "border-image-repeat", "border-image-slice", "border-image-source", "border-image-width", "border-inline", "border-inline-color", "border-inline-end", "border-inline-end-color", "border-inline-end-style", "border-inline-end-width", "border-inline-start", "border-inline-start-color", "border-inline-start-style", "border-inline-start-width", "border-inline-style", "border-inline-width", "border-left", "border-left-color", "border-left-style", "border-left-width", "border-radius", "border-right", "border-right-color", "border-right-style", "border-right-width", "border-spacing", "border-start-end-radius", "border-start-start-radius", "border-style", "border-top", "border-top-color", "border-top-left-radius", "border-top-right-radius", "border-top-style", "border-top-width", "border-width", "bottom", "box-align", "box-decoration-break", "box-direction", "box-flex", "box-flex-group", "box-lines", "box-ordinal-group", "box-orient", "box-pack", "box-shadow", "box-sizing", "break-after", "break-before", "break-inside", "caption-side", "caret-color", "clear", "clip", "clip-path", "clip-rule", "color", "color-interpolation", "color-interpolation-filters", "color-profile", "color-rendering", "color-scheme", "column-count", "column-fill", "column-gap", "column-rule", "column-rule-color", "column-rule-style", "column-rule-width", "column-span", "column-width", "columns", "contain", "contain-intrinsic-block-size", "contain-intrinsic-height", "contain-intrinsic-inline-size", "contain-intrinsic-size", "contain-intrinsic-width", "container", "container-name", "container-type", "content", "content-visibility", "counter-increment", "counter-reset", "counter-set", "cue", "cue-after", "cue-before", "cursor", "cx", "cy", "direction", "display", "dominant-baseline", "empty-cells", "enable-background", "field-sizing", "fill", "fill-opacity", "fill-rule", "filter", "flex", "flex-basis", "flex-direction", "flex-flow", "flex-grow", "flex-shrink", "flex-wrap", "float", "flood-color", "flood-opacity", "flow", "font", "font-display", "font-family", "font-feature-settings", "font-kerning", "font-language-override", "font-optical-sizing", "font-palette", "font-size", "font-size-adjust", "font-smooth", "font-smoothing", "font-stretch", "font-style", "font-synthesis", "font-synthesis-position", "font-synthesis-small-caps", "font-synthesis-style", "font-synthesis-weight", "font-variant", "font-variant-alternates", "font-variant-caps", "font-variant-east-asian", "font-variant-emoji", "font-variant-ligatures", "font-variant-numeric", "font-variant-position", "font-variation-settings", "font-weight", "forced-color-adjust", "gap", "glyph-orientation-horizontal", "glyph-orientation-vertical", "grid", "grid-area", "grid-auto-columns", "grid-auto-flow", "grid-auto-rows", "grid-column", "grid-column-end", "grid-column-start", "grid-gap", "grid-row", "grid-row-end", "grid-row-start", "grid-template", "grid-template-areas", "grid-template-columns", "grid-template-rows", "hanging-punctuation", "height", "hyphenate-character", "hyphenate-limit-chars", "hyphens", "icon", "image-orientation", "image-rendering", "image-resolution", "ime-mode", "initial-letter", "initial-letter-align", "inline-size", "inset", "inset-area", "inset-block", "inset-block-end", "inset-block-start", "inset-inline", "inset-inline-end", "inset-inline-start", "isolation", "justify-content", "justify-items", "justify-self", "kerning", "left", "letter-spacing", "lighting-color", "line-break", "line-height", "line-height-step", "list-style", "list-style-image", "list-style-position", "list-style-type", "margin", "margin-block", "margin-block-end", "margin-block-start", "margin-bottom", "margin-inline", "margin-inline-end", "margin-inline-start", "margin-left", "margin-right", "margin-top", "margin-trim", "marker", "marker-end", "marker-mid", "marker-start", "marks", "mask", "mask-border", "mask-border-mode", "mask-border-outset", "mask-border-repeat", "mask-border-slice", "mask-border-source", "mask-border-width", "mask-clip", "mask-composite", "mask-image", "mask-mode", "mask-origin", "mask-position", "mask-repeat", "mask-size", "mask-type", "masonry-auto-flow", "math-depth", "math-shift", "math-style", "max-block-size", "max-height", "max-inline-size", "max-width", "min-block-size", "min-height", "min-inline-size", "min-width", "mix-blend-mode", "nav-down", "nav-index", "nav-left", "nav-right", "nav-up", "none", "normal", "object-fit", "object-position", "offset", "offset-anchor", "offset-distance", "offset-path", "offset-position", "offset-rotate", "opacity", "order", "orphans", "outline", "outline-color", "outline-offset", "outline-style", "outline-width", "overflow", "overflow-anchor", "overflow-block", "overflow-clip-margin", "overflow-inline", "overflow-wrap", "overflow-x", "overflow-y", "overlay", "overscroll-behavior", "overscroll-behavior-block", "overscroll-behavior-inline", "overscroll-behavior-x", "overscroll-behavior-y", "padding", "padding-block", "padding-block-end", "padding-block-start", "padding-bottom", "padding-inline", "padding-inline-end", "padding-inline-start", "padding-left", "padding-right", "padding-top", "page", "page-break-after", "page-break-before", "page-break-inside", "paint-order", "pause", "pause-after", "pause-before", "perspective", "perspective-origin", "place-content", "place-items", "place-self", "pointer-events", "position", "position-anchor", "position-visibility", "print-color-adjust", "quotes", "r", "resize", "rest", "rest-after", "rest-before", "right", "rotate", "row-gap", "ruby-align", "ruby-position", "scale", "scroll-behavior", "scroll-margin", "scroll-margin-block", "scroll-margin-block-end", "scroll-margin-block-start", "scroll-margin-bottom", "scroll-margin-inline", "scroll-margin-inline-end", "scroll-margin-inline-start", "scroll-margin-left", "scroll-margin-right", "scroll-margin-top", "scroll-padding", "scroll-padding-block", "scroll-padding-block-end", "scroll-padding-block-start", "scroll-padding-bottom", "scroll-padding-inline", "scroll-padding-inline-end", "scroll-padding-inline-start", "scroll-padding-left", "scroll-padding-right", "scroll-padding-top", "scroll-snap-align", "scroll-snap-stop", "scroll-snap-type", "scroll-timeline", "scroll-timeline-axis", "scroll-timeline-name", "scrollbar-color", "scrollbar-gutter", "scrollbar-width", "shape-image-threshold", "shape-margin", "shape-outside", "shape-rendering", "speak", "speak-as", "src", "stop-color", "stop-opacity", "stroke", "stroke-dasharray", "stroke-dashoffset", "stroke-linecap", "stroke-linejoin", "stroke-miterlimit", "stroke-opacity", "stroke-width", "tab-size", "table-layout", "text-align", "text-align-all", "text-align-last", "text-anchor", "text-combine-upright", "text-decoration", "text-decoration-color", "text-decoration-line", "text-decoration-skip", "text-decoration-skip-ink", "text-decoration-style", "text-decoration-thickness", "text-emphasis", "text-emphasis-color", "text-emphasis-position", "text-emphasis-style", "text-indent", "text-justify", "text-orientation", "text-overflow", "text-rendering", "text-shadow", "text-size-adjust", "text-transform", "text-underline-offset", "text-underline-position", "text-wrap", "text-wrap-mode", "text-wrap-style", "timeline-scope", "top", "touch-action", "transform", "transform-box", "transform-origin", "transform-style", "transition", "transition-behavior", "transition-delay", "transition-duration", "transition-property", "transition-timing-function", "translate", "unicode-bidi", "user-modify", "user-select", "vector-effect", "vertical-align", "view-timeline", "view-timeline-axis", "view-timeline-inset", "view-timeline-name", "view-transition-name", "visibility", "voice-balance", "voice-duration", "voice-family", "voice-pitch", "voice-range", "voice-rate", "voice-stress", "voice-volume", "white-space", "white-space-collapse", "widows", "width", "will-change", "word-break", "word-spacing", "word-wrap", "writing-mode", "x", "y", "z-index", "zoom"].sort().reverse();
    var JCp = Ava.concat(Iva).sort().reverse();
    function XCp(e) {
      let t = WCp(e);
      let n = JCp;
      let r = "and or not only";
      let o = "[\\w-]+";
      let s = "([\\w-]+|@\\{[\\w-]+\\})";
      let i = [];
      let a = [];
      let l = function (b) {
        return {
          className: "string",
          begin: "~?" + b + ".*?" + b
        };
      };
      let c = function (b, S, E) {
        return {
          className: b,
          begin: S,
          relevance: E
        };
      };
      let u = {
        $pattern: /[a-z-]+/,
        keyword: "and or not only",
        attribute: KCp.join(" ")
      };
      let d = {
        begin: "\\(",
        end: "\\)",
        contains: a,
        keywords: u,
        relevance: 0
      };
      a.push(e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, l("'"), l('"'), t.CSS_NUMBER_MODE, {
        begin: "(url|data-uri)\\(",
        starts: {
          className: "string",
          end: "[\\)\\n]",
          excludeEnd: true
        }
      }, t.HEXCOLOR, d, c("variable", "@@?[\\w-]+", 10), c("variable", "@\\{[\\w-]+\\}"), c("built_in", "~?`[^`]*?`"), {
        className: "attribute",
        begin: "[\\w-]+\\s*:",
        end: ":",
        returnBegin: true,
        excludeEnd: true
      }, t.IMPORTANT, {
        beginKeywords: "and not"
      }, t.FUNCTION_DISPATCH);
      let p = a.concat({
        begin: /\{/,
        end: /\}/,
        contains: i
      });
      let m = {
        beginKeywords: "when",
        endsWithParent: true,
        contains: [{
          beginKeywords: "and not"
        }].concat(a)
      };
      let f = {
        begin: s + "\\s*:",
        returnBegin: true,
        end: /[;}]/,
        relevance: 0,
        contains: [{
          begin: /-(webkit|moz|ms|o)-/
        }, t.CSS_VARIABLE, {
          className: "attribute",
          begin: "\\b(" + YCp.join("|") + ")\\b",
          end: /(?=:)/,
          starts: {
            endsWithParent: true,
            illegal: "[<=$]",
            relevance: 0,
            contains: a
          }
        }]
      };
      let h = {
        className: "keyword",
        begin: "@(import|media|charset|font-face|(-[a-z]+-)?keyframes|supports|document|namespace|page|viewport|host)\\b",
        starts: {
          end: "[;{}]",
          keywords: u,
          returnEnd: true,
          contains: a,
          relevance: 0
        }
      };
      let g = {
        className: "variable",
        variants: [{
          begin: "@[\\w-]+\\s*:",
          relevance: 15
        }, {
          begin: "@[\\w-]+"
        }],
        starts: {
          end: "[;}]",
          returnEnd: true,
          contains: p
        }
      };
      let y = {
        variants: [{
          begin: "[\\.#:&\\[>]",
          end: "[;{}]"
        }, {
          begin: s,
          end: /\{/
        }],
        returnBegin: true,
        returnEnd: true,
        illegal: `[<='$"]`,
        relevance: 0,
        contains: [e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, m, c("keyword", "all\\b"), c("variable", "@\\{[\\w-]+\\}"), {
          begin: "\\b(" + zCp.join("|") + ")\\b",
          className: "selector-tag"
        }, t.CSS_NUMBER_MODE, c("selector-tag", s, 0), c("selector-id", "#" + s), c("selector-class", "\\." + s, 0), c("selector-tag", "&", 0), t.ATTRIBUTE_SELECTOR_MODE, {
          className: "selector-pseudo",
          begin: ":(" + Ava.join("|") + ")"
        }, {
          className: "selector-pseudo",
          begin: ":(:)?(" + Iva.join("|") + ")"
        }, {
          begin: /\(/,
          end: /\)/,
          relevance: 0,
          contains: p
        }, {
          begin: "!important"
        }, t.FUNCTION_DISPATCH]
      };
      let _ = {
        begin: `[\\w-]+:(:)?(${n.join("|")})`,
        returnBegin: true,
        contains: [y]
      };
      i.push(e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, h, g, _, f, y, m, t.FUNCTION_DISPATCH);
      return {
        name: "Less",
        case_insensitive: true,
        illegal: `[=>'/<($"]`,
        contains: i
      };
    }
    Pva.exports = XCp;
  });
  var Mva = __commonJS((nXy, Dva) => {
    function QCp(e) {
      let o = {
        className: "literal",
        begin: "\\b(t{1}|nil)\\b"
      };
      let s = {
        className: "number",
        variants: [{
          begin: "(-|\\+)?\\d+(\\.\\d+|\\/\\d+)?((d|e|f|l|s|D|E|F|L|S)(\\+|-)?\\d+)?",
          relevance: 0
        }, {
          begin: "#(b|B)[0-1]+(/[0-1]+)?"
        }, {
          begin: "#(o|O)[0-7]+(/[0-7]+)?"
        }, {
          begin: "#(x|X)[0-9a-fA-F]+(/[0-9a-fA-F]+)?"
        }, {
          begin: "#(c|C)\\((-|\\+)?\\d+(\\.\\d+|\\/\\d+)?((d|e|f|l|s|D|E|F|L|S)(\\+|-)?\\d+)? +(-|\\+)?\\d+(\\.\\d+|\\/\\d+)?((d|e|f|l|s|D|E|F|L|S)(\\+|-)?\\d+)?",
          end: "\\)"
        }]
      };
      let i = e.inherit(e.QUOTE_STRING_MODE, {
        illegal: null
      });
      let a = e.COMMENT(";", "$", {
        relevance: 0
      });
      let l = {
        begin: "\\*",
        end: "\\*"
      };
      let c = {
        className: "symbol",
        begin: "[:&][a-zA-Z_\\-+\\*\\/<=>&#][a-zA-Z0-9_\\-+*\\/<=>&#!]*"
      };
      let u = {
        begin: "[a-zA-Z_\\-+\\*\\/<=>&#][a-zA-Z0-9_\\-+*\\/<=>&#!]*",
        relevance: 0
      };
      let d = {
        begin: "\\|[^]*?\\|"
      };
      let m = {
        contains: [s, i, l, c, {
          begin: "\\(",
          end: "\\)",
          contains: ["self", o, i, s, u]
        }, u],
        variants: [{
          begin: "['`]\\(",
          end: "\\)"
        }, {
          begin: "\\(quote ",
          end: "\\)",
          keywords: {
            name: "quote"
          }
        }, {
          begin: "'\\|[^]*?\\|"
        }]
      };
      let f = {
        variants: [{
          begin: "'[a-zA-Z_\\-+\\*\\/<=>&#][a-zA-Z0-9_\\-+*\\/<=>&#!]*"
        }, {
          begin: "#'[a-zA-Z_\\-+\\*\\/<=>&#][a-zA-Z0-9_\\-+*\\/<=>&#!]*(::[a-zA-Z_\\-+\\*\\/<=>&#][a-zA-Z0-9_\\-+*\\/<=>&#!]*)*"
        }]
      };
      let h = {
        begin: "\\(\\s*",
        end: "\\)"
      };
      let g = {
        endsWithParent: true,
        relevance: 0
      };
      h.contains = [{
        className: "name",
        variants: [{
          begin: "[a-zA-Z_\\-+\\*\\/<=>&#][a-zA-Z0-9_\\-+*\\/<=>&#!]*",
          relevance: 0
        }, {
          begin: "\\|[^]*?\\|"
        }]
      }, g];
      g.contains = [m, f, h, o, s, i, a, l, c, d, u];
      return {
        name: "Lisp",
        illegal: /\S/,
        contains: [s, e.SHEBANG(), o, i, a, m, f, h, u]
      };
    }
    Dva.exports = QCp;
  });
  var Lva = __commonJS((rXy, Nva) => {
    function ZCp(e) {
      let t = {
        className: "variable",
        variants: [{
          begin: "\\b([gtps][A-Z]{1}[a-zA-Z0-9]*)(\\[.+\\])?(?:\\s*?)"
        }, {
          begin: "\\$_[A-Z]+"
        }],
        relevance: 0
      };
      let n = [e.C_BLOCK_COMMENT_MODE, e.HASH_COMMENT_MODE, e.COMMENT("--", "$"), e.COMMENT("[^:]//", "$")];
      let r = e.inherit(e.TITLE_MODE, {
        variants: [{
          begin: "\\b_*rig[A-Z][A-Za-z0-9_\\-]*"
        }, {
          begin: "\\b_[a-z0-9\\-]+"
        }]
      });
      let o = e.inherit(e.TITLE_MODE, {
        begin: "\\b([A-Za-z0-9_\\-]+)\\b"
      });
      return {
        name: "LiveCode",
        case_insensitive: false,
        keywords: {
          keyword: "$_COOKIE $_FILES $_GET $_GET_BINARY $_GET_RAW $_POST $_POST_BINARY $_POST_RAW $_SESSION $_SERVER codepoint codepoints segment segments codeunit codeunits sentence sentences trueWord trueWords paragraph after byte bytes english the until http forever descending using line real8 with seventh for stdout finally element word words fourth before black ninth sixth characters chars stderr uInt1 uInt1s uInt2 uInt2s stdin string lines relative rel any fifth items from middle mid at else of catch then third it file milliseconds seconds second secs sec int1 int1s int4 int4s internet int2 int2s normal text item last long detailed effective uInt4 uInt4s repeat end repeat URL in try into switch to words https token binfile each tenth as ticks tick system real4 by dateItems without char character ascending eighth whole dateTime numeric short first ftp integer abbreviated abbr abbrev private case while if div mod wrap and or bitAnd bitNot bitOr bitXor among not in a an within contains ends with begins the keys of keys",
          literal: "SIX TEN FORMFEED NINE ZERO NONE SPACE FOUR FALSE COLON CRLF PI COMMA ENDOFFILE EOF EIGHT FIVE QUOTE EMPTY ONE TRUE RETURN CR LINEFEED RIGHT BACKSLASH NULL SEVEN TAB THREE TWO six ten formfeed nine zero none space four false colon crlf pi comma endoffile eof eight five quote empty one true return cr linefeed right backslash null seven tab three two RIVERSION RISTATE FILE_READ_MODE FILE_WRITE_MODE FILE_WRITE_MODE DIR_WRITE_MODE FILE_READ_UMASK FILE_WRITE_UMASK DIR_READ_UMASK DIR_WRITE_UMASK",
          built_in: "put abs acos aliasReference annuity arrayDecode arrayEncode asin atan atan2 average avg avgDev base64Decode base64Encode baseConvert binaryDecode binaryEncode byteOffset byteToNum cachedURL cachedURLs charToNum cipherNames codepointOffset codepointProperty codepointToNum codeunitOffset commandNames compound compress constantNames cos date dateFormat decompress difference directories diskSpace DNSServers exp exp1 exp2 exp10 extents files flushEvents folders format functionNames geometricMean global globals hasMemory harmonicMean hostAddress hostAddressToName hostName hostNameToAddress isNumber ISOToMac itemOffset keys len length libURLErrorData libUrlFormData libURLftpCommand libURLLastHTTPHeaders libURLLastRHHeaders libUrlMultipartFormAddPart libUrlMultipartFormData libURLVersion lineOffset ln ln1 localNames log log2 log10 longFilePath lower macToISO matchChunk matchText matrixMultiply max md5Digest median merge messageAuthenticationCode messageDigest millisec millisecs millisecond milliseconds min monthNames nativeCharToNum normalizeText num number numToByte numToChar numToCodepoint numToNativeChar offset open openfiles openProcesses openProcessIDs openSockets paragraphOffset paramCount param params peerAddress pendingMessages platform popStdDev populationStandardDeviation populationVariance popVariance processID random randomBytes replaceText result revCreateXMLTree revCreateXMLTreeFromFile revCurrentRecord revCurrentRecordIsFirst revCurrentRecordIsLast revDatabaseColumnCount revDatabaseColumnIsNull revDatabaseColumnLengths revDatabaseColumnNames revDatabaseColumnNamed revDatabaseColumnNumbered revDatabaseColumnTypes revDatabaseConnectResult revDatabaseCursors revDatabaseID revDatabaseTableNames revDatabaseType revDataFromQuery revdb_closeCursor revdb_columnbynumber revdb_columncount revdb_columnisnull revdb_columnlengths revdb_columnnames revdb_columntypes revdb_commit revdb_connect revdb_connections revdb_connectionerr revdb_currentrecord revdb_cursorconnection revdb_cursorerr revdb_cursors revdb_dbtype revdb_disconnect revdb_execute revdb_iseof revdb_isbof revdb_movefirst revdb_movelast revdb_movenext revdb_moveprev revdb_query revdb_querylist revdb_recordcount revdb_rollback revdb_tablenames revGetDatabaseDriverPath revNumberOfRecords revOpenDatabase revOpenDatabases revQueryDatabase revQueryDatabaseBlob revQueryResult revQueryIsAtStart revQueryIsAtEnd revUnixFromMacPath revXMLAttribute revXMLAttributes revXMLAttributeValues revXMLChildContents revXMLChildNames revXMLCreateTreeFromFileWithNamespaces revXMLCreateTreeWithNamespaces revXMLDataFromXPathQuery revXMLEvaluateXPath revXMLFirstChild revXMLMatchingNode revXMLNextSibling revXMLNodeContents revXMLNumberOfChildren revXMLParent revXMLPreviousSibling revXMLRootNode revXMLRPC_CreateRequest revXMLRPC_Documents revXMLRPC_Error revXMLRPC_GetHost revXMLRPC_GetMethod revXMLRPC_GetParam revXMLText revXMLRPC_Execute revXMLRPC_GetParamCount revXMLRPC_GetParamNode revXMLRPC_GetParamType revXMLRPC_GetPath revXMLRPC_GetPort revXMLRPC_GetProtocol revXMLRPC_GetRequest revXMLRPC_GetResponse revXMLRPC_GetSocket revXMLTree revXMLTrees revXMLValidateDTD revZipDescribeItem revZipEnumerateItems revZipOpenArchives round sampVariance sec secs seconds sentenceOffset sha1Digest shell shortFilePath sin specialFolderPath sqrt standardDeviation statRound stdDev sum sysError systemVersion tan tempName textDecode textEncode tick ticks time to tokenOffset toLower toUpper transpose truewordOffset trunc uniDecode uniEncode upper URLDecode URLEncode URLStatus uuid value variableNames variance version waitDepth weekdayNames wordOffset xsltApplyStylesheet xsltApplyStylesheetFromFile xsltLoadStylesheet xsltLoadStylesheetFromFile add breakpoint cancel clear local variable file word line folder directory URL close socket process combine constant convert create new alias folder directory decrypt delete variable word line folder directory URL dispatch divide do encrypt filter get include intersect kill libURLDownloadToFile libURLFollowHttpRedirects libURLftpUpload libURLftpUploadFile libURLresetAll libUrlSetAuthCallback libURLSetDriver libURLSetCustomHTTPHeaders libUrlSetExpect100 libURLSetFTPListCommand libURLSetFTPMode libURLSetFTPStopTime libURLSetStatusCallback load extension loadedExtensions multiply socket prepare process post seek rel relative read from process rename replace require resetAll resolve revAddXMLNode revAppendXML revCloseCursor revCloseDatabase revCommitDatabase revCopyFile revCopyFolder revCopyXMLNode revDeleteFolder revDeleteXMLNode revDeleteAllXMLTrees revDeleteXMLTree revExecuteSQL revGoURL revInsertXMLNode revMoveFolder revMoveToFirstRecord revMoveToLastRecord revMoveToNextRecord revMoveToPreviousRecord revMoveToRecord revMoveXMLNode revPutIntoXMLNode revRollBackDatabase revSetDatabaseDriverPath revSetXMLAttribute revXMLRPC_AddParam revXMLRPC_DeleteAllDocuments revXMLAddDTD revXMLRPC_Free revXMLRPC_FreeAll revXMLRPC_DeleteDocument revXMLRPC_DeleteParam revXMLRPC_SetHost revXMLRPC_SetMethod revXMLRPC_SetPort revXMLRPC_SetProtocol revXMLRPC_SetSocket revZipAddItemWithData revZipAddItemWithFile revZipAddUncompressedItemWithData revZipAddUncompressedItemWithFile revZipCancel revZipCloseArchive revZipDeleteItem revZipExtractItemToFile revZipExtractItemToVariable revZipSetProgressCallback revZipRenameItem revZipReplaceItemWithData revZipReplaceItemWithFile revZipOpenArchive send set sort split start stop subtract symmetric union unload vectorDotProduct wait write"
        },
        contains: [t, {
          className: "keyword",
          begin: "\\bend\\sif\\b"
        }, {
          className: "function",
          beginKeywords: "function",
          end: "$",
          contains: [t, o, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, e.BINARY_NUMBER_MODE, e.C_NUMBER_MODE, r]
        }, {
          className: "function",
          begin: "\\bend\\s+",
          end: "$",
          keywords: "end",
          contains: [o, r],
          relevance: 0
        }, {
          beginKeywords: "command on",
          end: "$",
          contains: [t, o, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, e.BINARY_NUMBER_MODE, e.C_NUMBER_MODE, r]
        }, {
          className: "meta",
          variants: [{
            begin: "<\\?(rev|lc|livecode)",
            relevance: 10
          }, {
            begin: "<\\?"
          }, {
            begin: "\\?>"
          }]
        }, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, e.BINARY_NUMBER_MODE, e.C_NUMBER_MODE, r].concat(n),
        illegal: ";$|^\\[|^=|&|\\{"
      };
    }
    Nva.exports = ZCp;
  });
  var Uva = __commonJS((oXy, Fva) => {
    var eRp = ["as", "in", "of", "if", "for", "while", "finally", "var", "new", "function", "do", "return", "void", "else", "break", "catch", "instanceof", "with", "throw", "case", "default", "try", "switch", "continue", "typeof", "delete", "let", "yield", "const", "class", "debugger", "async", "await", "static", "import", "from", "export", "extends", "using"];
    var tRp = ["true", "false", "null", "undefined", "NaN", "Infinity"];
    var nRp = ["Object", "Function", "Boolean", "Symbol", "Math", "Date", "Number", "BigInt", "String", "RegExp", "Array", "Float32Array", "Float64Array", "Int8Array", "Uint8Array", "Uint8ClampedArray", "Int16Array", "Int32Array", "Uint16Array", "Uint32Array", "BigInt64Array", "BigUint64Array", "Set", "Map", "WeakSet", "WeakMap", "ArrayBuffer", "SharedArrayBuffer", "Atomics", "DataView", "JSON", "Promise", "Generator", "GeneratorFunction", "AsyncFunction", "Reflect", "Proxy", "Intl", "WebAssembly"];
    var rRp = ["Error", "EvalError", "InternalError", "RangeError", "ReferenceError", "SyntaxError", "TypeError", "URIError"];
    var oRp = ["setInterval", "setTimeout", "clearInterval", "clearTimeout", "require", "exports", "eval", "isFinite", "isNaN", "parseFloat", "parseInt", "decodeURI", "decodeURIComponent", "encodeURI", "encodeURIComponent", "escape", "unescape"];
    var sRp = [].concat(oRp, nRp, rRp);
    function iRp(e) {
      let t = ["npm", "print"];
      let n = ["yes", "no", "on", "off", "it", "that", "void"];
      let r = ["then", "unless", "until", "loop", "of", "by", "when", "and", "or", "is", "isnt", "not", "it", "that", "otherwise", "from", "to", "til", "fallthrough", "case", "enum", "native", "list", "map", "__hasProp", "__extends", "__slice", "__bind", "__indexOf"];
      let o = {
        keyword: eRp.concat(r),
        literal: tRp.concat(n),
        built_in: sRp.concat(t)
      };
      let s = "[A-Za-z$_](?:-[0-9A-Za-z$_]|[0-9A-Za-z$_])*";
      let i = e.inherit(e.TITLE_MODE, {
        begin: "[A-Za-z$_](?:-[0-9A-Za-z$_]|[0-9A-Za-z$_])*"
      });
      let a = {
        className: "subst",
        begin: /#\{/,
        end: /\}/,
        keywords: o
      };
      let l = {
        className: "subst",
        begin: /#[A-Za-z$_]/,
        end: /(?:-[0-9A-Za-z$_]|[0-9A-Za-z$_])*/,
        keywords: o
      };
      let c = [e.BINARY_NUMBER_MODE, {
        className: "number",
        begin: "(\\b0[xX][a-fA-F0-9_]+)|(\\b\\d(\\d|_\\d)*(\\.(\\d(\\d|_\\d)*)?)?(_*[eE]([-+]\\d(_\\d|\\d)*)?)?[_a-z]*)",
        relevance: 0,
        starts: {
          end: "(\\s*/)?",
          relevance: 0
        }
      }, {
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
          contains: [e.BACKSLASH_ESCAPE, a, l]
        }, {
          begin: /"/,
          end: /"/,
          contains: [e.BACKSLASH_ESCAPE, a, l]
        }, {
          begin: /\\/,
          end: /(\s|$)/,
          excludeEnd: true
        }]
      }, {
        className: "regexp",
        variants: [{
          begin: "//",
          end: "//[gim]*",
          contains: [a, e.HASH_COMMENT_MODE]
        }, {
          begin: /\/(?![ *])(\\.|[^\\\n])*?\/[gim]*(?=\W)/
        }]
      }, {
        begin: "@[A-Za-z$_](?:-[0-9A-Za-z$_]|[0-9A-Za-z$_])*"
      }, {
        begin: "``",
        end: "``",
        excludeBegin: true,
        excludeEnd: true,
        subLanguage: "javascript"
      }];
      a.contains = c;
      let u = {
        className: "params",
        begin: "\\(",
        returnBegin: true,
        contains: [{
          begin: /\(/,
          end: /\)/,
          keywords: o,
          contains: ["self"].concat(c)
        }]
      };
      let d = {
        begin: "(#=>|=>|\\|>>|-?->|!->)"
      };
      let p = {
        variants: [{
          match: [/class\s+/, "[A-Za-z$_](?:-[0-9A-Za-z$_]|[0-9A-Za-z$_])*", /\s+extends\s+/, "[A-Za-z$_](?:-[0-9A-Za-z$_]|[0-9A-Za-z$_])*"]
        }, {
          match: [/class\s+/, "[A-Za-z$_](?:-[0-9A-Za-z$_]|[0-9A-Za-z$_])*"]
        }],
        scope: {
          2: "title.class",
          4: "title.class.inherited"
        },
        keywords: o
      };
      return {
        name: "LiveScript",
        aliases: ["ls"],
        keywords: o,
        illegal: /\/\*/,
        contains: c.concat([e.COMMENT("\\/\\*", "\\*\\/"), e.HASH_COMMENT_MODE, d, {
          className: "function",
          contains: [i, u],
          returnBegin: true,
          variants: [{
            begin: "([A-Za-z$_](?:-[0-9A-Za-z$_]|[0-9A-Za-z$_])*\\s*(?:=|:=)\\s*)?(\\(.*\\)\\s*)?\\B->\\*?",
            end: "->\\*?"
          }, {
            begin: "([A-Za-z$_](?:-[0-9A-Za-z$_]|[0-9A-Za-z$_])*\\s*(?:=|:=)\\s*)?!?(\\(.*\\)\\s*)?\\B[-~]{1,2}>\\*?",
            end: "[-~]{1,2}>\\*?"
          }, {
            begin: "([A-Za-z$_](?:-[0-9A-Za-z$_]|[0-9A-Za-z$_])*\\s*(?:=|:=)\\s*)?(\\(.*\\)\\s*)?\\B!?[-~]{1,2}>\\*?",
            end: "!?[-~]{1,2}>\\*?"
          }]
        }, p, {
          begin: "[A-Za-z$_](?:-[0-9A-Za-z$_]|[0-9A-Za-z$_])*:",
          end: ":",
          returnBegin: true,
          returnEnd: true,
          relevance: 0
        }])
      };
    }
    Fva.exports = iRp;
  });