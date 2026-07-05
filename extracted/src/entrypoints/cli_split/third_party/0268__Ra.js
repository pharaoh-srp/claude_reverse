  var _Ra = __commonJS((TQy, yRa) => {
    function $xp(e) {
      return {
        name: "SubUnit",
        case_insensitive: true,
        contains: [{
          className: "string",
          begin: `\\[
(multipart)?`,
          end: `\\]
`
        }, {
          className: "string",
          begin: "\\d{4}-\\d{2}-\\d{2}(\\s+)\\d{2}:\\d{2}:\\d{2}.\\d+Z"
        }, {
          className: "string",
          begin: "(\\+|-)\\d+"
        }, {
          className: "keyword",
          relevance: 10,
          variants: [{
            begin: "^(test|testing|success|successful|failure|error|skip|xfail|uxsuccess)(:?)\\s+(test)?"
          }, {
            begin: "^progress(:?)(\\s+)?(pop|push)?"
          }, {
            begin: "^tags:"
          }, {
            begin: "^time:"
          }]
        }]
      };
    }
    yRa.exports = $xp;
  });
  var xRa = __commonJS((EQy, RRa) => {
    function ERa(e) {
      if (!e) {
        return null;
      }
      if (typeof e === "string") {
        return e;
      }
      return e.source;
    }
    function bWt(e) {
      return lE("(?=", e, ")");
    }
    function lE(...e) {
      return e.map(n => ERa(n)).join("");
    }
    function Hxp(e) {
      let t = e[e.length - 1];
      if (typeof t === "object" && t.constructor === Object) {
        e.splice(e.length - 1, 1);
        return t;
      } else {
        return {};
      }
    }
    function zq(...e) {
      return "(" + (Hxp(e).capture ? "" : "?:") + e.map(r => ERa(r)).join("|") + ")";
    }
    var pfo = e => lE(/\b/, e, /\w$/.test(e) ? /\b/ : /\B/);
    var jxp = ["Protocol", "Type"].map(pfo);
    var bRa = ["init", "self"].map(pfo);
    var qxp = ["Any", "Self"];
    var ufo = ["actor", "any", "associatedtype", "async", "await", /as\?/, /as!/, "as", "borrowing", "break", "case", "catch", "class", "consume", "consuming", "continue", "convenience", "copy", "default", "defer", "deinit", "didSet", "distributed", "do", "dynamic", "each", "else", "enum", "extension", "fallthrough", /fileprivate\(set\)/, "fileprivate", "final", "for", "func", "get", "guard", "if", "import", "indirect", "infix", /init\?/, /init!/, "inout", /internal\(set\)/, "internal", "in", "is", "isolated", "nonisolated", "lazy", "let", "macro", "mutating", "nonmutating", /open\(set\)/, "open", "operator", "optional", "override", "package", "postfix", "precedencegroup", "prefix", /private\(set\)/, "private", "protocol", /public\(set\)/, "public", "repeat", "required", "rethrows", "return", "set", "some", "static", "struct", "subscript", "super", "switch", "throws", "throw", /try\?/, /try!/, "try", "typealias", /unowned\(safe\)/, /unowned\(unsafe\)/, "unowned", "var", "weak", "where", "while", "willSet"];
    var SRa = ["false", "nil", "true"];
    var Wxp = ["assignment", "associativity", "higherThan", "left", "lowerThan", "none", "right"];
    var Gxp = ["#colorLiteral", "#column", "#dsohandle", "#else", "#elseif", "#endif", "#error", "#file", "#fileID", "#fileLiteral", "#filePath", "#function", "#if", "#imageLiteral", "#keyPath", "#line", "#selector", "#sourceLocation", "#warning"];
    var TRa = ["abs", "all", "any", "assert", "assertionFailure", "debugPrint", "dump", "fatalError", "getVaList", "isKnownUniquelyReferenced", "max", "min", "numericCast", "pointwiseMax", "pointwiseMin", "precondition", "preconditionFailure", "print", "readLine", "repeatElement", "sequence", "stride", "swap", "swift_unboxFromSwiftValueWithType", "transcode", "type", "unsafeBitCast", "unsafeDowncast", "withExtendedLifetime", "withUnsafeMutablePointer", "withUnsafePointer", "withVaList", "withoutActuallyEscaping", "zip"];
    var vRa = zq(/[/=\-+!*%<>&|^~?]/, /[\u00A1-\u00A7]/, /[\u00A9\u00AB]/, /[\u00AC\u00AE]/, /[\u00B0\u00B1]/, /[\u00B6\u00BB\u00BF\u00D7\u00F7]/, /[\u2016-\u2017]/, /[\u2020-\u2027]/, /[\u2030-\u203E]/, /[\u2041-\u2053]/, /[\u2055-\u205E]/, /[\u2190-\u23FF]/, /[\u2500-\u2775]/, /[\u2794-\u2BFF]/, /[\u2E00-\u2E7F]/, /[\u3001-\u3003]/, /[\u3008-\u3020]/, /[\u3030]/);
    var wRa = zq(vRa, /[\u0300-\u036F]/, /[\u1DC0-\u1DFF]/, /[\u20D0-\u20FF]/, /[\uFE00-\uFE0F]/, /[\uFE20-\uFE2F]/);
    var dfo = lE(vRa, wRa, "*");
    var CRa = zq(/[a-zA-Z_]/, /[\u00A8\u00AA\u00AD\u00AF\u00B2-\u00B5\u00B7-\u00BA]/, /[\u00BC-\u00BE\u00C0-\u00D6\u00D8-\u00F6\u00F8-\u00FF]/, /[\u0100-\u02FF\u0370-\u167F\u1681-\u180D\u180F-\u1DBF]/, /[\u1E00-\u1FFF]/, /[\u200B-\u200D\u202A-\u202E\u203F-\u2040\u2054\u2060-\u206F]/, /[\u2070-\u20CF\u2100-\u218F\u2460-\u24FF\u2776-\u2793]/, /[\u2C00-\u2DFF\u2E80-\u2FFF]/, /[\u3004-\u3007\u3021-\u302F\u3031-\u303F\u3040-\uD7FF]/, /[\uF900-\uFD3D\uFD40-\uFDCF\uFDF0-\uFE1F\uFE30-\uFE44]/, /[\uFE47-\uFEFE\uFF00-\uFFFD]/);
    var mjn = zq(CRa, /\d/, /[\u0300-\u036F\u1DC0-\u1DFF\u20D0-\u20FF\uFE20-\uFE2F]/);
    var Bde = lE(CRa, mjn, "*");
    var pjn = lE(/[A-Z]/, mjn, "*");
    var Vxp = ["attached", "autoclosure", lE(/convention\(/, zq("swift", "block", "c"), /\)/), "discardableResult", "dynamicCallable", "dynamicMemberLookup", "escaping", "freestanding", "frozen", "GKInspectable", "IBAction", "IBDesignable", "IBInspectable", "IBOutlet", "IBSegueAction", "inlinable", "main", "nonobjc", "NSApplicationMain", "NSCopying", "NSManaged", lE(/objc\(/, Bde, /\)/), "objc", "objcMembers", "propertyWrapper", "requires_stored_property_inits", "resultBuilder", "Sendable", "testable", "UIApplicationMain", "unchecked", "unknown", "usableFromInline", "warn_unqualified_access"];
    var zxp = ["iOS", "iOSApplicationExtension", "macOS", "macOSApplicationExtension", "macCatalyst", "macCatalystApplicationExtension", "watchOS", "watchOSApplicationExtension", "tvOS", "tvOSApplicationExtension", "swift"];
    function Kxp(e) {
      let t = {
        match: /\s+/,
        relevance: 0
      };
      let n = e.COMMENT("/\\*", "\\*/", {
        contains: ["self"]
      });