  var PDs = __commonJS(JE => {
    JE.HttpAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(JE.HttpAuthLocation || (JE.HttpAuthLocation = {}));
    JE.HttpApiKeyAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(JE.HttpApiKeyAuthLocation || (JE.HttpApiKeyAuthLocation = {}));
    JE.EndpointURLScheme = undefined;
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(JE.EndpointURLScheme || (JE.EndpointURLScheme = {}));
    JE.AlgorithmId = undefined;
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(JE.AlgorithmId || (JE.AlgorithmId = {}));
    var M9u = e => {
      let t = [];
      if (e.sha256 !== undefined) {
        t.push({
          algorithmId: () => JE.AlgorithmId.SHA256,
          checksumConstructor: () => e.sha256
        });
      }
      if (e.md5 != null) {
        t.push({
          algorithmId: () => JE.AlgorithmId.MD5,
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
    var N9u = e => {
      let t = {};
      e.checksumAlgorithms().forEach(n => {
        t[n.algorithmId()] = n.checksumConstructor();
      });
      return t;
    };
    var L9u = e => M9u(e);
    var F9u = e => N9u(e);
    JE.FieldPosition = undefined;
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(JE.FieldPosition || (JE.FieldPosition = {}));
    JE.IniSectionType = undefined;
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(JE.IniSectionType || (JE.IniSectionType = {}));
    JE.RequestHandlerProtocol = undefined;
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(JE.RequestHandlerProtocol || (JE.RequestHandlerProtocol = {}));
    JE.SMITHY_CONTEXT_KEY = "__smithy_context";
    JE.getDefaultExtensionConfiguration = L9u;
    JE.resolveDefaultRuntimeConfig = F9u;
  });
  var NDs = __commonJS(Xke => {
    var B9u = PDs();
    var $9u = e => ({
      setHttpHandler(t) {
        e.httpHandler = t;
      },
      httpHandler() {
        return e.httpHandler;
      },
      updateHttpClientConfig(t, n) {
        e.httpHandler?.updateHttpClientConfig(t, n);
      },
      httpHandlerConfigs() {
        return e.httpHandler.httpHandlerConfigs();
      }
    });
    var H9u = e => ({
      httpHandler: e.httpHandler()
    });
    class ODs {
      name;
      kind;
      values;
      constructor({
        name: e,
        kind: t = B9u.FieldPosition.HEADER,
        values: n = []
      }) {
        this.name = e;
        this.kind = t;
        this.values = n;
      }
      add(e) {
        this.values.push(e);
      }
      set(e) {
        this.values = e;
      }
      remove(e) {
        this.values = this.values.filter(t => t !== e);
      }
      toString() {
        return this.values.map(e => e.includes(",") || e.includes(" ") ? `"${e}"` : e).join(", ");
      }
      get() {
        return this.values;
      }
    }
    class DDs {
      entries = {};
      encoding;
      constructor({
        fields: e = [],
        encoding: t = "utf-8"
      }) {
        e.forEach(this.setField.bind(this));
        this.encoding = t;
      }
      setField(e) {
        this.entries[e.name.toLowerCase()] = e;
      }
      getField(e) {
        return this.entries[e.toLowerCase()];
      }
      removeField(e) {
        delete this.entries[e.toLowerCase()];
      }
      getByType(e) {
        return Object.values(this.entries).filter(t => t.kind === e);
      }
    }
    class Xyn {
      method;
      protocol;
      hostname;
      port;
      path;
      query;
      headers;
      username;
      password;
      fragment;
      body;
      constructor(e) {
        this.method = e.method || "GET";
        this.hostname = e.hostname || "localhost";
        this.port = e.port;
        this.query = e.query || {};
        this.headers = e.headers || {};
        this.body = e.body;
        this.protocol = e.protocol ? e.protocol.slice(-1) !== ":" ? `${e.protocol}:` : e.protocol : "https:";
        this.path = e.path ? e.path.charAt(0) !== "/" ? `/${e.path}` : e.path : "/";
        this.username = e.username;
        this.password = e.password;
        this.fragment = e.fragment;
      }
      static clone(e) {
        let t = new Xyn({
          ...e,
          headers: {
            ...e.headers
          }
        });
        if (t.query) {
          t.query = j9u(t.query);
        }
        return t;
      }
      static isInstance(e) {
        if (!e) {
          return false;
        }
        let t = e;
        return "method" in t && "protocol" in t && "hostname" in t && "path" in t && typeof t.query === "object" && typeof t.headers === "object";
      }
      clone() {
        return Xyn.clone(this);
      }
    }
    function j9u(e) {
      return Object.keys(e).reduce((t, n) => {
        let r = e[n];
        return {
          ...t,
          [n]: Array.isArray(r) ? [...r] : r
        };
      }, {});
    }
    class MDs {
      statusCode;
      reason;
      headers;
      body;
      constructor(e) {
        this.statusCode = e.statusCode;
        this.reason = e.reason;
        this.headers = e.headers || {};
        this.body = e.body;
      }
      static isInstance(e) {
        if (!e) {
          return false;
        }
        let t = e;
        return typeof t.statusCode === "number" && typeof t.headers === "object";
      }
    }
    function q9u(e) {
      return /^[a-z0-9][a-z0-9\.\-]*[a-z0-9]$/.test(e);
    }
    Xke.Field = ODs;
    Xke.Fields = DDs;
    Xke.HttpRequest = Xyn;
    Xke.HttpResponse = MDs;
    Xke.getHttpHandlerExtensionConfiguration = $9u;
    Xke.isValidHostname = q9u;
    Xke.resolveHttpHandlerRuntimeConfig = H9u;
  });
  var FDs = __commonJS(BLr => {
    var LDs = e => encodeURIComponent(e).replace(/[!'()*]/g, W9u);
    var W9u = e => `%${e.charCodeAt(0).toString(16).toUpperCase()}`;
    var G9u = e => e.split("/").map(LDs).join("/");
    BLr.escapeUri = LDs;
    BLr.escapeUriPath = G9u;
  });
  var HLr = __commonJS(UDs => {
    var $Lr = FDs();
    function V9u(e) {
      let t = [];
      for (let n of Object.keys(e).sort()) {
        let r = e[n];
        if (n = $Lr.escapeUri(n), Array.isArray(r)) {
          for (let o = 0, s = r.length; o < s; o++) {
            t.push(`${n}=${$Lr.escapeUri(r[o])}`);
          }
        } else {
          let o = n;
          if (r || typeof r === "string") {
            o += `=${$Lr.escapeUri(r)}`;
          }
          t.push(o);
        }
      }
      return t.join("&");
    }
    UDs.buildQueryString = V9u;
  });