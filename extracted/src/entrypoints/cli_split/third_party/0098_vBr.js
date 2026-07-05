  var vBr = __commonJS(sv => {
    sv.HttpAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(sv.HttpAuthLocation || (sv.HttpAuthLocation = {}));
    sv.HttpApiKeyAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(sv.HttpApiKeyAuthLocation || (sv.HttpApiKeyAuthLocation = {}));
    sv.EndpointURLScheme = undefined;
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(sv.EndpointURLScheme || (sv.EndpointURLScheme = {}));
    sv.AlgorithmId = undefined;
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(sv.AlgorithmId || (sv.AlgorithmId = {}));
    var PJu = e => {
      let t = [];
      if (e.sha256 !== undefined) {
        t.push({
          algorithmId: () => sv.AlgorithmId.SHA256,
          checksumConstructor: () => e.sha256
        });
      }
      if (e.md5 != null) {
        t.push({
          algorithmId: () => sv.AlgorithmId.MD5,
          checksumConstructor: () => e.md5
        });
      }
      return {
        addChecksumAlgorithm(n) {
          t.push(n);
        },
        checksumAlgorithms() {
          return t;
        }
      };
    };
    var OJu = e => {
      let t = {};
      e.checksumAlgorithms().forEach(n => {
        t[n.algorithmId()] = n.checksumConstructor();
      });
      return t;
    };
    var DJu = e => PJu(e);
    var MJu = e => OJu(e);
    sv.FieldPosition = undefined;
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(sv.FieldPosition || (sv.FieldPosition = {}));
    sv.IniSectionType = undefined;
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(sv.IniSectionType || (sv.IniSectionType = {}));
    sv.RequestHandlerProtocol = undefined;
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(sv.RequestHandlerProtocol || (sv.RequestHandlerProtocol = {}));
    sv.SMITHY_CONTEXT_KEY = "__smithy_context";
    sv.getDefaultExtensionConfiguration = DJu;
    sv.resolveDefaultRuntimeConfig = MJu;
  });