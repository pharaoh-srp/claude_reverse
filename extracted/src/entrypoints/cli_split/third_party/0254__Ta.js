  var _Ta = __commonJS((QYy, yTa) => {
    function Rwp(e) {
      return {
        name: "CSP",
        case_insensitive: false,
        keywords: {
          $pattern: "[a-zA-Z][a-zA-Z0-9_-]*",
          keyword: ["base-uri", "child-src", "connect-src", "default-src", "font-src", "form-action", "frame-ancestors", "frame-src", "img-src", "manifest-src", "media-src", "object-src", "plugin-types", "report-uri", "sandbox", "script-src", "style-src", "trusted-types", "unsafe-hashes", "worker-src"]
        },
        contains: [{
          className: "string",
          begin: "'",
          end: "'"
        }, {
          className: "attribute",
          begin: "^Content",
          end: ":",
          excludeEnd: true
        }]
      };
    }
    yTa.exports = Rwp;
  });
  var STa = __commonJS((ZYy, bTa) => {
    var xwp = e => ({
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
    var kwp = ["a", "abbr", "address", "article", "aside", "audio", "b", "blockquote", "body", "button", "canvas", "caption", "cite", "code", "dd", "del", "details", "dfn", "div", "dl", "dt", "em", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "html", "i", "iframe", "img", "input", "ins", "kbd", "label", "legend", "li", "main", "mark", "menu", "nav", "object", "ol", "optgroup", "option", "p", "picture", "q", "quote", "samp", "section", "select", "source", "span", "strong", "summary", "sup", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "time", "tr", "ul", "var", "video"];
    var Awp = ["defs", "g", "marker", "mask", "pattern", "svg", "switch", "symbol", "feBlend", "feColorMatrix", "feComponentTransfer", "feComposite", "feConvolveMatrix", "feDiffuseLighting", "feDisplacementMap", "feFlood", "feGaussianBlur", "feImage", "feMerge", "feMorphology", "feOffset", "feSpecularLighting", "feTile", "feTurbulence", "linearGradient", "radialGradient", "stop", "circle", "ellipse", "image", "line", "path", "polygon", "polyline", "rect", "text", "use", "textPath", "tspan", "foreignObject", "clipPath"];
    var Iwp = [...kwp, ...Awp];
    var Pwp = ["any-hover", "any-pointer", "aspect-ratio", "color", "color-gamut", "color-index", "device-aspect-ratio", "device-height", "device-width", "display-mode", "forced-colors", "grid", "height", "hover", "inverted-colors", "monochrome", "orientation", "overflow-block", "overflow-inline", "pointer", "prefers-color-scheme", "prefers-contrast", "prefers-reduced-motion", "prefers-reduced-transparency", "resolution", "scan", "scripting", "update", "width", "min-width", "max-width", "min-height", "max-height"].sort().reverse();
    var Owp = ["active", "any-link", "blank", "checked", "current", "default", "defined", "dir", "disabled", "drop", "empty", "enabled", "first", "first-child", "first-of-type", "fullscreen", "future", "focus", "focus-visible", "focus-within", "has", "host", "host-context", "hover", "indeterminate", "in-range", "invalid", "is", "lang", "last-child", "last-of-type", "left", "link", "local-link", "not", "nth-child", "nth-col", "nth-last-child", "nth-last-col", "nth-last-of-type", "nth-of-type", "only-child", "only-of-type", "optional", "out-of-range", "past", "placeholder-shown", "read-only", "read-write", "required", "right", "root", "scope", "target", "target-within", "user-invalid", "valid", "visited", "where"].sort().reverse();
    var Dwp = ["after", "backdrop", "before", "cue", "cue-region", "first-letter", "first-line", "grammar-error", "marker", "part", "placeholder", "selection", "slotted", "spelling-error"].sort().reverse();
    var Mwp = ["accent-color", "align-content", "align-items", "align-self", "alignment-baseline", "all", "anchor-name", "animation", "animation-composition", "animation-delay", "animation-direction", "animation-duration", "animation-fill-mode", "animation-iteration-count", "animation-name", "animation-play-state", "animation-range", "animation-range-end", "animation-range-start", "animation-timeline", "animation-timing-function", "appearance", "aspect-ratio", "backdrop-filter", "backface-visibility", "background", "background-attachment", "background-blend-mode", "background-clip", "background-color", "background-image", "background-origin", "background-position", "background-position-x", "background-position-y", "background-repeat", "background-size", "baseline-shift", "block-size", "border", "border-block", "border-block-color", "border-block-end", "border-block-end-color", "border-block-end-style", "border-block-end-width", "border-block-start", "border-block-start-color", "border-block-start-style", "border-block-start-width", "border-block-style", "border-block-width", "border-bottom", "border-bottom-color", "border-bottom-left-radius", "border-bottom-right-radius", "border-bottom-style", "border-bottom-width", "border-collapse", "border-color", "border-end-end-radius", "border-end-start-radius", "border-image", "border-image-outset", "border-image-repeat", "border-image-slice", "border-image-source", "border-image-width", "border-inline", "border-inline-color", "border-inline-end", "border-inline-end-color", "border-inline-end-style", "border-inline-end-width", "border-inline-start", "border-inline-start-color", "border-inline-start-style", "border-inline-start-width", "border-inline-style", "border-inline-width", "border-left", "border-left-color", "border-left-style", "border-left-width", "border-radius", "border-right", "border-right-color", "border-right-style", "border-right-width", "border-spacing", "border-start-end-radius", "border-start-start-radius", "border-style", "border-top", "border-top-color", "border-top-left-radius", "border-top-right-radius", "border-top-style", "border-top-width", "border-width", "bottom", "box-align", "box-decoration-break", "box-direction", "box-flex", "box-flex-group", "box-lines", "box-ordinal-group", "box-orient", "box-pack", "box-shadow", "box-sizing", "break-after", "break-before", "break-inside", "caption-side", "caret-color", "clear", "clip", "clip-path", "clip-rule", "color", "color-interpolation", "color-interpolation-filters", "color-profile", "color-rendering", "color-scheme", "column-count", "column-fill", "column-gap", "column-rule", "column-rule-color", "column-rule-style", "column-rule-width", "column-span", "column-width", "columns", "contain", "contain-intrinsic-block-size", "contain-intrinsic-height", "contain-intrinsic-inline-size", "contain-intrinsic-size", "contain-intrinsic-width", "container", "container-name", "container-type", "content", "content-visibility", "counter-increment", "counter-reset", "counter-set", "cue", "cue-after", "cue-before", "cursor", "cx", "cy", "direction", "display", "dominant-baseline", "empty-cells", "enable-background", "field-sizing", "fill", "fill-opacity", "fill-rule", "filter", "flex", "flex-basis", "flex-direction", "flex-flow", "flex-grow", "flex-shrink", "flex-wrap", "float", "flood-color", "flood-opacity", "flow", "font", "font-display", "font-family", "font-feature-settings", "font-kerning", "font-language-override", "font-optical-sizing", "font-palette", "font-size", "font-size-adjust", "font-smooth", "font-smoothing", "font-stretch", "font-style", "font-synthesis", "font-synthesis-position", "font-synthesis-small-caps", "font-synthesis-style", "font-synthesis-weight", "font-variant", "font-variant-alternates", "font-variant-caps", "font-variant-east-asian", "font-variant-emoji", "font-variant-ligatures", "font-variant-numeric", "font-variant-position", "font-variation-settings", "font-weight", "forced-color-adjust", "gap", "glyph-orientation-horizontal", "glyph-orientation-vertical", "grid", "grid-area", "grid-auto-columns", "grid-auto-flow", "grid-auto-rows", "grid-column", "grid-column-end", "grid-column-start", "grid-gap", "grid-row", "grid-row-end", "grid-row-start", "grid-template", "grid-template-areas", "grid-template-columns", "grid-template-rows", "hanging-punctuation", "height", "hyphenate-character", "hyphenate-limit-chars", "hyphens", "icon", "image-orientation", "image-rendering", "image-resolution", "ime-mode", "initial-letter", "initial-letter-align", "inline-size", "inset", "inset-area", "inset-block", "inset-block-end", "inset-block-start", "inset-inline", "inset-inline-end", "inset-inline-start", "isolation", "justify-content", "justify-items", "justify-self", "kerning", "left", "letter-spacing", "lighting-color", "line-break", "line-height", "line-height-step", "list-style", "list-style-image", "list-style-position", "list-style-type", "margin", "margin-block", "margin-block-end", "margin-block-start", "margin-bottom", "margin-inline", "margin-inline-end", "margin-inline-start", "margin-left", "margin-right", "margin-top", "margin-trim", "marker", "marker-end", "marker-mid", "marker-start", "marks", "mask", "mask-border", "mask-border-mode", "mask-border-outset", "mask-border-repeat", "mask-border-slice", "mask-border-source", "mask-border-width", "mask-clip", "mask-composite", "mask-image", "mask-mode", "mask-origin", "mask-position", "mask-repeat", "mask-size", "mask-type", "masonry-auto-flow", "math-depth", "math-shift", "math-style", "max-block-size", "max-height", "max-inline-size", "max-width", "min-block-size", "min-height", "min-inline-size", "min-width", "mix-blend-mode", "nav-down", "nav-index", "nav-left", "nav-right", "nav-up", "none", "normal", "object-fit", "object-position", "offset", "offset-anchor", "offset-distance", "offset-path", "offset-position", "offset-rotate", "opacity", "order", "orphans", "outline", "outline-color", "outline-offset", "outline-style", "outline-width", "overflow", "overflow-anchor", "overflow-block", "overflow-clip-margin", "overflow-inline", "overflow-wrap", "overflow-x", "overflow-y", "overlay", "overscroll-behavior", "overscroll-behavior-block", "overscroll-behavior-inline", "overscroll-behavior-x", "overscroll-behavior-y", "padding", "padding-block", "padding-block-end", "padding-block-start", "padding-bottom", "padding-inline", "padding-inline-end", "padding-inline-start", "padding-left", "padding-right", "padding-top", "page", "page-break-after", "page-break-before", "page-break-inside", "paint-order", "pause", "pause-after", "pause-before", "perspective", "perspective-origin", "place-content", "place-items", "place-self", "pointer-events", "position", "position-anchor", "position-visibility", "print-color-adjust", "quotes", "r", "resize", "rest", "rest-after", "rest-before", "right", "rotate", "row-gap", "ruby-align", "ruby-position", "scale", "scroll-behavior", "scroll-margin", "scroll-margin-block", "scroll-margin-block-end", "scroll-margin-block-start", "scroll-margin-bottom", "scroll-margin-inline", "scroll-margin-inline-end", "scroll-margin-inline-start", "scroll-margin-left", "scroll-margin-right", "scroll-margin-top", "scroll-padding", "scroll-padding-block", "scroll-padding-block-end", "scroll-padding-block-start", "scroll-padding-bottom", "scroll-padding-inline", "scroll-padding-inline-end", "scroll-padding-inline-start", "scroll-padding-left", "scroll-padding-right", "scroll-padding-top", "scroll-snap-align", "scroll-snap-stop", "scroll-snap-type", "scroll-timeline", "scroll-timeline-axis", "scroll-timeline-name", "scrollbar-color", "scrollbar-gutter", "scrollbar-width", "shape-image-threshold", "shape-margin", "shape-outside", "shape-rendering", "speak", "speak-as", "src", "stop-color", "stop-opacity", "stroke", "stroke-dasharray", "stroke-dashoffset", "stroke-linecap", "stroke-linejoin", "stroke-miterlimit", "stroke-opacity", "stroke-width", "tab-size", "table-layout", "text-align", "text-align-all", "text-align-last", "text-anchor", "text-combine-upright", "text-decoration", "text-decoration-color", "text-decoration-line", "text-decoration-skip", "text-decoration-skip-ink", "text-decoration-style", "text-decoration-thickness", "text-emphasis", "text-emphasis-color", "text-emphasis-position", "text-emphasis-style", "text-indent", "text-justify", "text-orientation", "text-overflow", "text-rendering", "text-shadow", "text-size-adjust", "text-transform", "text-underline-offset", "text-underline-position", "text-wrap", "text-wrap-mode", "text-wrap-style", "timeline-scope", "top", "touch-action", "transform", "transform-box", "transform-origin", "transform-style", "transition", "transition-behavior", "transition-delay", "transition-duration", "transition-property", "transition-timing-function", "translate", "unicode-bidi", "user-modify", "user-select", "vector-effect", "vertical-align", "view-timeline", "view-timeline-axis", "view-timeline-inset", "view-timeline-name", "view-transition-name", "visibility", "voice-balance", "voice-duration", "voice-family", "voice-pitch", "voice-range", "voice-rate", "voice-stress", "voice-volume", "white-space", "white-space-collapse", "widows", "width", "will-change", "word-break", "word-spacing", "word-wrap", "writing-mode", "x", "y", "z-index", "zoom"].sort().reverse();
    function Nwp(e) {
      let t = e.regex;
      let n = xwp(e);
      let r = {
        begin: /-(webkit|moz|ms|o)-(?=[a-z])/
      };
      let o = "and or not only";
      let s = /@-?\w[\w]*(-\w+)*/;
      let i = "[a-zA-Z-][a-zA-Z0-9_-]*";
      let a = [e.APOS_STRING_MODE, e.QUOTE_STRING_MODE];
      return {
        name: "CSS",
        case_insensitive: true,
        illegal: /[=|'\$]/,
        keywords: {
          keyframePosition: "from to"
        },
        classNameAliases: {
          keyframePosition: "selector-tag"
        },
        contains: [n.BLOCK_COMMENT, r, n.CSS_NUMBER_MODE, {
          className: "selector-id",
          begin: /#[A-Za-z0-9_-]+/,
          relevance: 0
        }, {
          className: "selector-class",
          begin: "\\.[a-zA-Z-][a-zA-Z0-9_-]*",
          relevance: 0
        }, n.ATTRIBUTE_SELECTOR_MODE, {
          className: "selector-pseudo",
          variants: [{
            begin: ":(" + Owp.join("|") + ")"
          }, {
            begin: ":(:)?(" + Dwp.join("|") + ")"
          }]
        }, n.CSS_VARIABLE, {
          className: "attribute",
          begin: "\\b(" + Mwp.join("|") + ")\\b"
        }, {
          begin: /:/,
          end: /[;}{]/,
          contains: [n.BLOCK_COMMENT, n.HEXCOLOR, n.IMPORTANT, n.CSS_NUMBER_MODE, ...a, {
            begin: /(url|data-uri)\(/,
            end: /\)/,
            relevance: 0,
            keywords: {
              built_in: "url data-uri"
            },
            contains: [...a, {
              className: "string",
              begin: /[^)]/,
              endsWithParent: true,
              excludeEnd: true
            }]
          }, n.FUNCTION_DISPATCH]
        }, {
          begin: t.lookahead(/@/),
          end: "[{;]",
          relevance: 0,
          illegal: /:/,
          contains: [{
            className: "keyword",
            begin: s
          }, {
            begin: /\s/,
            endsWithParent: true,
            excludeEnd: true,
            relevance: 0,
            keywords: {
              $pattern: /[a-z-]+/,
              keyword: "and or not only",
              attribute: Pwp.join(" ")
            },
            contains: [{
              begin: /[a-z-]+(?=:)/,
              className: "attribute"
            }, ...a, n.CSS_NUMBER_MODE]
          }]
        }, {
          className: "selector-tag",
          begin: "\\b(" + Iwp.join("|") + ")\\b"
        }]
      };
    }
    bTa.exports = Nwp;
  });
  var ETa = __commonJS((eJy, TTa) => {
    function Lwp(e) {
      let t = {
        $pattern: e.UNDERSCORE_IDENT_RE,
        keyword: "abstract alias align asm assert auto body break byte case cast catch class const continue debug default delete deprecated do else enum export extern final finally for foreach foreach_reverse|10 goto if immutable import in inout int interface invariant is lazy macro mixin module new nothrow out override package pragma private protected public pure ref return scope shared static struct super switch synchronized template this throw try typedef typeid typeof union unittest version void volatile while with __FILE__ __LINE__ __gshared|10 __thread __traits __DATE__ __EOF__ __TIME__ __TIMESTAMP__ __VENDOR__ __VERSION__",
        built_in: "bool cdouble cent cfloat char creal dchar delegate double dstring float function idouble ifloat ireal long real short string ubyte ucent uint ulong ushort wchar wstring",
        literal: "false null true"
      };
      let n = "(0|[1-9][\\d_]*)";
      let r = "(0|[1-9][\\d_]*|\\d[\\d_]*|[\\d_]+?\\d)";
      let o = "0[bB][01_]+";
      let s = "([\\da-fA-F][\\da-fA-F_]*|_[\\da-fA-F][\\da-fA-F_]*)";
      let i = "0[xX]([\\da-fA-F][\\da-fA-F_]*|_[\\da-fA-F][\\da-fA-F_]*)";
      let a = "([eE][+-]?(0|[1-9][\\d_]*|\\d[\\d_]*|[\\d_]+?\\d))";
      let l = "((0|[1-9][\\d_]*|\\d[\\d_]*|[\\d_]+?\\d)(\\.\\d*|" + a + ")|\\d+\\.(0|[1-9][\\d_]*|\\d[\\d_]*|[\\d_]+?\\d)|\\.(0|[1-9][\\d_]*)" + a + "?)";
      let c = "(0[xX](([\\da-fA-F][\\da-fA-F_]*|_[\\da-fA-F][\\da-fA-F_]*)\\.([\\da-fA-F][\\da-fA-F_]*|_[\\da-fA-F][\\da-fA-F_]*)|\\.?([\\da-fA-F][\\da-fA-F_]*|_[\\da-fA-F][\\da-fA-F_]*))[pP][+-]?(0|[1-9][\\d_]*|\\d[\\d_]*|[\\d_]+?\\d))";
      let u = "((0|[1-9][\\d_]*)|0[bB][01_]+|" + i + ")";
      let d = "(" + c + "|" + l + ")";
      let p = `\\\\(['"\\?\\\\abfnrtv]|u[\\dA-Fa-f]{4}|[0-7]{1,3}|x[\\dA-Fa-f]{2}|U[\\dA-Fa-f]{8})|&[a-zA-Z\\d]{2,};`;
      let m = {
        className: "number",
        begin: "\\b" + u + "(L|u|U|Lu|LU|uL|UL)?",
        relevance: 0
      };
      let f = {
        className: "number",
        begin: "\\b(" + d + "([fF]|L|i|[fF]i|Li)?|" + u + "(i|[fF]i|Li))",
        relevance: 0
      };
      let h = {
        className: "string",
        begin: "'(" + p + "|.)",
        end: "'",
        illegal: "."
      };
      let y = {
        className: "string",
        begin: '"',
        contains: [{
          begin: p,
          relevance: 0
        }],
        end: '"[cwd]?'
      };
      let _ = {
        className: "string",
        begin: '[rq]"',
        end: '"[cwd]?',
        relevance: 5
      };
      let b = {
        className: "string",
        begin: "`",
        end: "`[cwd]?"
      };
      let S = {
        className: "string",
        begin: 'x"[\\da-fA-F\\s\\n\\r]*"[cwd]?',
        relevance: 10
      };
      let E = {
        className: "string",
        begin: 'q"\\{',
        end: '\\}"'
      };
      let C = {
        className: "meta",
        begin: "^#!",
        end: "$",
        relevance: 5
      };
      let x = {
        className: "meta",
        begin: "#(line)",
        end: "$",
        relevance: 5
      };
      let A = {
        className: "keyword",
        begin: "@[a-zA-Z_][a-zA-Z_\\d]*"
      };
      let k = e.COMMENT("\\/\\+", "\\+\\/", {
        contains: ["self"],
        relevance: 10
      });
      return {
        name: "D",
        keywords: t,
        contains: [e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, k, S, y, _, b, E, f, m, h, C, x, A]
      };
    }
    TTa.exports = Lwp;
  });
  var wTa = __commonJS((tJy, vTa) => {
    function Fwp(e) {
      let t = {
        className: "subst",
        variants: [{
          begin: "\\$[A-Za-z0-9_]+"
        }]
      };
      let n = {
        className: "subst",
        variants: [{
          begin: /\$\{/,
          end: /\}/
        }],
        keywords: "true false null this is new super"
      };
      let r = {
        className: "number",
        relevance: 0,
        variants: [{
          match: /\b[0-9][0-9_]*(\.[0-9][0-9_]*)?([eE][+-]?[0-9][0-9_]*)?\b/
        }, {
          match: /\b0[xX][0-9A-Fa-f][0-9A-Fa-f_]*\b/
        }]
      };
      let o = {
        className: "string",
        variants: [{
          begin: "r'''",
          end: "'''"
        }, {
          begin: 'r"""',
          end: '"""'
        }, {
          begin: "r'",
          end: "'",
          illegal: "\\n"
        }, {
          begin: 'r"',
          end: '"',
          illegal: "\\n"
        }, {
          begin: "'''",
          end: "'''",
          contains: [e.BACKSLASH_ESCAPE, t, n]
        }, {
          begin: '"""',
          end: '"""',
          contains: [e.BACKSLASH_ESCAPE, t, n]
        }, {
          begin: "'",
          end: "'",
          illegal: "\\n",
          contains: [e.BACKSLASH_ESCAPE, t, n]
        }, {
          begin: '"',
          end: '"',
          illegal: "\\n",
          contains: [e.BACKSLASH_ESCAPE, t, n]
        }]
      };
      n.contains = [r, o];
      let s = ["Comparable", "DateTime", "Duration", "Function", "Iterable", "Iterator", "List", "Map", "Match", "Object", "Pattern", "RegExp", "Set", "Stopwatch", "String", "StringBuffer", "StringSink", "Symbol", "Type", "Uri", "bool", "double", "int", "num", "Element", "ElementList"];
      let i = s.map(c => `${c}?`);
      return {
        name: "Dart",
        keywords: {
          keyword: ["abstract", "as", "assert", "async", "await", "base", "break", "case", "catch", "class", "const", "continue", "covariant", "default", "deferred", "do", "dynamic", "else", "enum", "export", "extends", "extension", "external", "factory", "false", "final", "finally", "for", "Function", "get", "hide", "if", "implements", "import", "in", "interface", "is", "late", "library", "mixin", "new", "null", "on", "operator", "part", "required", "rethrow", "return", "sealed", "set", "show", "static", "super", "switch", "sync", "this", "throw", "true", "try", "typedef", "var", "void", "when", "while", "with", "yield"],
          built_in: s.concat(i).concat(["Never", "Null", "dynamic", "print", "document", "querySelector", "querySelectorAll", "window"]),
          $pattern: /[A-Za-z][A-Za-z0-9_]*\??/
        },
        contains: [o, e.COMMENT(/\/\*\*(?!\/)/, /\*\//, {
          subLanguage: "markdown",
          relevance: 0
        }), e.COMMENT(/\/{3,} ?/, /$/, {
          contains: [{
            subLanguage: "markdown",
            begin: ".",
            end: "$",
            relevance: 0
          }]
        }), e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, {
          className: "class",
          beginKeywords: "class interface",
          end: /\{/,
          excludeEnd: true,
          contains: [{
            beginKeywords: "extends implements"
          }, e.UNDERSCORE_TITLE_MODE]
        }, r, {
          className: "meta",
          begin: "@[A-Za-z]+"
        }, {
          begin: "=>"
        }]
      };
    }
    vTa.exports = Fwp;
  });
  var RTa = __commonJS((nJy, CTa) => {
    function Uwp(e) {
      let t = ["exports", "register", "file", "shl", "array", "record", "property", "for", "mod", "while", "set", "ally", "label", "uses", "raise", "not", "stored", "class", "safecall", "var", "interface", "or", "private", "static", "exit", "index", "inherited", "to", "else", "stdcall", "override", "shr", "asm", "far", "resourcestring", "finalization", "packed", "virtual", "out", "and", "protected", "library", "do", "xorwrite", "goto", "near", "function", "end", "div", "overload", "object", "unit", "begin", "string", "on", "inline", "repeat", "until", "destructor", "write", "message", "program", "with", "read", "initialization", "except", "default", "nil", "if", "case", "cdecl", "in", "downto", "threadvar", "of", "try", "pascal", "const", "external", "constructor", "type", "public", "then", "implementation", "finally", "published", "procedure", "absolute", "reintroduce", "operator", "as", "is", "abstract", "alias", "assembler", "bitpacked", "break", "continue", "cppdecl", "cvar", "enumerator", "experimental", "platform", "deprecated", "unimplemented", "dynamic", "export", "far16", "forward", "generic", "helper", "implements", "interrupt", "iochecks", "local", "name", "nodefault", "noreturn", "nostackframe", "oldfpccall", "otherwise", "saveregisters", "softfloat", "specialize", "strict", "unaligned", "varargs"];
      let n = [e.C_LINE_COMMENT_MODE, e.COMMENT(/\{/, /\}/, {
        relevance: 0
      }), e.COMMENT(/\(\*/, /\*\)/, {
        relevance: 10
      })];
      let r = {
        className: "meta",
        variants: [{
          begin: /\{\$/,
          end: /\}/
        }, {
          begin: /\(\*\$/,
          end: /\*\)/
        }]
      };
      let o = {
        className: "string",
        begin: /'/,
        end: /'/,
        contains: [{
          begin: /''/
        }]
      };
      let s = {
        className: "number",
        relevance: 0,
        variants: [{
          match: /\b\d[\d_]*(\.\d[\d_]*)?/
        }, {
          match: /\$[\dA-Fa-f_]+/
        }, {
          match: /\$/,
          relevance: 0
        }, {
          match: /&[0-7][0-7_]*/
        }, {
          match: /%[01_]+/
        }, {
          match: /%/,
          relevance: 0
        }]
      };
      let i = {
        className: "string",
        variants: [{
          match: /#\d[\d_]*/
        }, {
          match: /#\$[\dA-Fa-f][\dA-Fa-f_]*/
        }, {
          match: /#&[0-7][0-7_]*/
        }, {
          match: /#%[01][01_]*/
        }]
      };
      let a = {
        begin: e.IDENT_RE + "\\s*=\\s*class\\s*\\(",
        returnBegin: true,
        contains: [e.TITLE_MODE]
      };
      let l = {
        className: "function",
        beginKeywords: "function constructor destructor procedure",
        end: /[:;]/,
        keywords: "function constructor|10 destructor|10 procedure|10",
        contains: [e.TITLE_MODE, {
          className: "params",
          begin: /\(/,
          end: /\)/,
          keywords: t,
          contains: [o, i, r].concat(n)
        }, r].concat(n)
      };
      return {
        name: "Delphi",
        aliases: ["dpr", "dfm", "pas", "pascal"],
        case_insensitive: true,
        keywords: t,
        illegal: /"|\$[G-Zg-z]|\/\*|<\/|\|/,
        contains: [o, i, s, a, l, r].concat(n)
      };
    }
    CTa.exports = Uwp;
  });
  var kTa = __commonJS((rJy, xTa) => {
    function Bwp(e) {
      let t = e.regex;
      return {
        name: "Diff",
        aliases: ["patch"],
        contains: [{
          className: "meta",
          relevance: 10,
          match: t.either(/^@@ +-\d+,\d+ +\+\d+,\d+ +@@/, /^\*\*\* +\d+,\d+ +\*\*\*\*$/, /^--- +\d+,\d+ +----$/)
        }, {
          className: "comment",
          variants: [{
            begin: t.either(/Index: /, /^index/, /={3,}/, /^-{3}/, /^\*{3} /, /^\+{3}/, /^diff --git/),
            end: /$/
          }, {
            match: /^\*{15}$/
          }]
        }, {
          className: "addition",
          begin: /^\+/,
          end: /$/
        }, {
          className: "deletion",
          begin: /^-/,
          end: /$/
        }, {
          className: "addition",
          begin: /^!/,
          end: /$/
        }]
      };
    }
    xTa.exports = Bwp;
  });
  var ITa = __commonJS((oJy, ATa) => {
    function $wp(e) {
      let t = {
        begin: /\|[A-Za-z]+:?/,
        keywords: {
          name: "truncatewords removetags linebreaksbr yesno get_digit timesince random striptags filesizeformat escape linebreaks length_is ljust rjust cut urlize fix_ampersands title floatformat capfirst pprint divisibleby add make_list unordered_list urlencode timeuntil urlizetrunc wordcount stringformat linenumbers slice date dictsort dictsortreversed default_if_none pluralize lower join center default truncatewords_html upper length phone2numeric wordwrap time addslashes slugify first escapejs force_escape iriencode last safe safeseq truncatechars localize unlocalize localtime utc timezone"
        },
        contains: [e.QUOTE_STRING_MODE, e.APOS_STRING_MODE]
      };
      return {
        name: "Django",
        aliases: ["jinja"],
        case_insensitive: true,
        subLanguage: "xml",
        contains: [e.COMMENT(/\{%\s*comment\s*%\}/, /\{%\s*endcomment\s*%\}/), e.COMMENT(/\{#/, /#\}/), {
          className: "template-tag",
          begin: /\{%/,
          end: /%\}/,
          contains: [{
            className: "name",
            begin: /\w+/,
            keywords: {
              name: "comment endcomment load templatetag ifchanged endifchanged if endif firstof for endfor ifnotequal endifnotequal widthratio extends include spaceless endspaceless regroup ifequal endifequal ssi now with cycle url filter endfilter debug block endblock else autoescape endautoescape csrf_token empty elif endwith static trans blocktrans endblocktrans get_static_prefix get_media_prefix plural get_current_language language get_available_languages get_current_language_bidi get_language_info get_language_info_list localize endlocalize localtime endlocaltime timezone endtimezone get_current_timezone verbatim"
            },
            starts: {
              endsWithParent: true,
              keywords: "in by as",
              contains: [t],
              relevance: 0
            }
          }]
        }, {
          className: "template-variable",
          begin: /\{\{/,
          end: /\}\}/,
          contains: [t]
        }]
      };
    }
    ATa.exports = $wp;
  });
  var OTa = __commonJS((sJy, PTa) => {
    function Hwp(e) {
      return {
        name: "DNS Zone",
        aliases: ["bind", "zone"],
        keywords: ["IN", "A", "AAAA", "AFSDB", "APL", "CAA", "CDNSKEY", "CDS", "CERT", "CNAME", "DHCID", "DLV", "DNAME", "DNSKEY", "DS", "HIP", "IPSECKEY", "KEY", "KX", "LOC", "MX", "NAPTR", "NS", "NSEC", "NSEC3", "NSEC3PARAM", "PTR", "RRSIG", "RP", "SIG", "SOA", "SRV", "SSHFP", "TA", "TKEY", "TLSA", "TSIG", "TXT"],
        contains: [e.COMMENT(";", "$", {
          relevance: 0
        }), {
          className: "meta",
          begin: /^\$(TTL|GENERATE|INCLUDE|ORIGIN)\b/
        }, {
          className: "number",
          begin: "((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){1}(((:[0-9A-Fa-f]{1,4}){1,6})|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:)))\\b"
        }, {
          className: "number",
          begin: "((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]).){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\b"
        }, e.inherit(e.NUMBER_MODE, {
          begin: /\b\d+[dhwm]?/
        })]
      };
    }
    PTa.exports = Hwp;
  });
  var MTa = __commonJS((iJy, DTa) => {
    function jwp(e) {
      return {
        name: "Dockerfile",
        aliases: ["docker"],
        case_insensitive: true,
        keywords: ["from", "maintainer", "expose", "env", "arg", "user", "onbuild", "stopsignal"],
        contains: [e.HASH_COMMENT_MODE, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, e.NUMBER_MODE, {
          beginKeywords: "run cmd entrypoint volume add copy workdir label healthcheck shell",
          starts: {
            end: /[^\\]$/,
            subLanguage: "bash"
          }
        }],
        illegal: "</"
      };
    }
    DTa.exports = jwp;
  });
  var LTa = __commonJS((aJy, NTa) => {
    function qwp(e) {
      let t = e.COMMENT(/^\s*@?rem\b/, /$/, {
        relevance: 10
      });
      return {
        name: "Batch file (DOS)",
        aliases: ["bat", "cmd"],
        case_insensitive: true,
        illegal: /\/\*/,
        keywords: {
          keyword: ["if", "else", "goto", "for", "in", "do", "call", "exit", "not", "exist", "errorlevel", "defined", "equ", "neq", "lss", "leq", "gtr", "geq"],
          built_in: ["prn", "nul", "lpt3", "lpt2", "lpt1", "con", "com4", "com3", "com2", "com1", "aux", "shift", "cd", "dir", "echo", "setlocal", "endlocal", "set", "pause", "copy", "append", "assoc", "at", "attrib", "break", "cacls", "cd", "chcp", "chdir", "chkdsk", "chkntfs", "cls", "cmd", "color", "comp", "compact", "convert", "date", "dir", "diskcomp", "diskcopy", "doskey", "erase", "fs", "find", "findstr", "format", "ftype", "graftabl", "help", "keyb", "label", "md", "mkdir", "mode", "more", "move", "path", "pause", "print", "popd", "pushd", "promt", "rd", "recover", "rem", "rename", "replace", "restore", "rmdir", "shift", "sort", "start", "subst", "time", "title", "tree", "type", "ver", "verify", "vol", "ping", "net", "ipconfig", "taskkill", "xcopy", "ren", "del"]
        },
        contains: [{
          className: "variable",
          begin: /%%[^ ]|%[^ ]+?%|![^ ]+?!/
        }, {
          className: "function",
          begin: {
            className: "symbol",
            begin: "^\\s*[A-Za-z._?][A-Za-z0-9_$#@~.?]*(:|\\s+label)",
            relevance: 0
          }.begin,
          end: "goto:eof",
          contains: [e.inherit(e.TITLE_MODE, {
            begin: "([_a-zA-Z]\\w*\\.)*([_a-zA-Z]\\w*:)?[_a-zA-Z]\\w*"
          }), t]
        }, {
          className: "number",
          begin: "\\b\\d+",
          relevance: 0
        }, t]
      };
    }
    NTa.exports = qwp;
  });
  var UTa = __commonJS((lJy, FTa) => {
    function Wwp(e) {
      return {
        keywords: "dsconfig",
        contains: [{
          className: "keyword",
          begin: "^dsconfig",
          end: /\s/,
          excludeEnd: true,
          relevance: 10
        }, {
          className: "built_in",
          begin: /(list|create|get|set|delete)-(\w+)/,
          end: /\s/,
          excludeEnd: true,
          illegal: "!@#$%^&*()",
          relevance: 10
        }, {
          className: "built_in",
          begin: /--(\w+)/,
          end: /\s/,
          excludeEnd: true
        }, {
          className: "string",
          begin: /"/,
          end: /"/
        }, {
          className: "string",
          begin: /'/,
          end: /'/
        }, {
          className: "string",
          begin: /[\w\-?]+:\w+/,
          end: /\W/,
          relevance: 0
        }, {
          className: "string",
          begin: /\w+(\-\w+)*/,
          end: /(?=\W)/,
          relevance: 0
        }, e.HASH_COMMENT_MODE]
      };
    }
    FTa.exports = Wwp;
  });