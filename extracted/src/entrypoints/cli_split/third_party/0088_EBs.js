  var EBs = __commonJS(tv => {
    tv.HttpAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(tv.HttpAuthLocation || (tv.HttpAuthLocation = {}));
    tv.HttpApiKeyAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(tv.HttpApiKeyAuthLocation || (tv.HttpApiKeyAuthLocation = {}));
    tv.EndpointURLScheme = undefined;
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(tv.EndpointURLScheme || (tv.EndpointURLScheme = {}));
    tv.AlgorithmId = undefined;
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(tv.AlgorithmId || (tv.AlgorithmId = {}));
    var uKu = e => {
      let t = [];
      if (e.sha256 !== undefined) {
        t.push({
          algorithmId: () => tv.AlgorithmId.SHA256,
          checksumConstructor: () => e.sha256
        });
      }
      if (e.md5 != null) {
        t.push({
          algorithmId: () => tv.AlgorithmId.MD5,
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
    var dKu = e => {
      let t = {};
      e.checksumAlgorithms().forEach(n => {
        t[n.algorithmId()] = n.checksumConstructor();
      });
      return t;
    };
    var pKu = e => uKu(e);
    var mKu = e => dKu(e);
    tv.FieldPosition = undefined;
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(tv.FieldPosition || (tv.FieldPosition = {}));
    tv.IniSectionType = undefined;
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(tv.IniSectionType || (tv.IniSectionType = {}));
    tv.RequestHandlerProtocol = undefined;
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(tv.RequestHandlerProtocol || (tv.RequestHandlerProtocol = {}));
    tv.SMITHY_CONTEXT_KEY = "__smithy_context";
    tv.getDefaultExtensionConfiguration = pKu;
    tv.resolveDefaultRuntimeConfig = mKu;
  });
  var RBs = __commonJS(lAe => {
    var hKu = EBs();
    var gKu = e => ({
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
    var yKu = e => ({
      httpHandler: e.httpHandler()
    });
    class vBs {
      name;
      kind;
      values;
      constructor({
        name: e,
        kind: t = hKu.FieldPosition.HEADER,
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
    class wBs {
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
    class dbn {
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
        let t = new dbn({
          ...e,
          headers: {
            ...e.headers
          }
        });
        if (t.query) {
          t.query = _Ku(t.query);
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
        return dbn.clone(this);
      }
    }
    function _Ku(e) {
      return Object.keys(e).reduce((t, n) => {
        let r = e[n];
        return {
          ...t,
          [n]: Array.isArray(r) ? [...r] : r
        };
      }, {});
    }
    class CBs {
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
    function bKu(e) {
      return /^[a-z0-9][a-z0-9\.\-]*[a-z0-9]$/.test(e);
    }
    lAe.Field = vBs;
    lAe.Fields = wBs;
    lAe.HttpRequest = dbn;
    lAe.HttpResponse = CBs;
    lAe.getHttpHandlerExtensionConfiguration = gKu;
    lAe.isValidHostname = bKu;
    lAe.resolveHttpHandlerRuntimeConfig = yKu;
  });
  var qye = __commonJS(INt => {
    var SKu = RBs();
    function TKu(e) {
      return e;
    }
    var xBs = e => t => async n => {
      if (!SKu.HttpRequest.isInstance(n.request)) {
        return t(n);
      }
      let {
        request: r
      } = n;
      let {
        handlerProtocol: o = ""
      } = e.requestHandler.metadata || {};
      if (o.indexOf("h2") >= 0 && !r.headers[":authority"]) {
        delete r.headers.host;
        r.headers[":authority"] = r.hostname + (r.port ? ":" + r.port : "");
      } else if (!r.headers.host) {
        let s = r.hostname;
        if (r.port != null) {
          s += `:${r.port}`;
        }
        r.headers.host = s;
      }
      return t(n);
    };
    var kBs = {
      name: "hostHeaderMiddleware",
      step: "build",
      priority: "low",
      tags: ["HOST"],
      override: true
    };
    var EKu = e => ({
      applyToStack: t => {
        t.add(xBs(e), kBs);
      }
    });
    INt.getHostHeaderPlugin = EKu;
    INt.hostHeaderMiddleware = xBs;
    INt.hostHeaderMiddlewareOptions = kBs;
    INt.resolveHostHeaderConfig = TKu;
  });
  var Wye = __commonJS(pbn => {
    var ABs = () => (e, t) => async n => {
      try {
        let r = await e(n);
        let {
          clientName: o,
          commandName: s,
          logger: i,
          dynamoDbDocumentClientOptions: a = {}
        } = t;
        let {
          overrideInputFilterSensitiveLog: l,
          overrideOutputFilterSensitiveLog: c
        } = a;
        let u = l ?? t.inputFilterSensitiveLog;
        let d = c ?? t.outputFilterSensitiveLog;
        let {
          $metadata: p,
          ...m
        } = r.output;
        i?.info?.({
          clientName: o,
          commandName: s,
          input: u(n.input),
          output: d(m),
          metadata: p
        });
        return r;
      } catch (r) {
        let {
          clientName: o,
          commandName: s,
          logger: i,
          dynamoDbDocumentClientOptions: a = {}
        } = t;
        let {
          overrideInputFilterSensitiveLog: l
        } = a;
        let c = l ?? t.inputFilterSensitiveLog;
        throw i?.error?.({
          clientName: o,
          commandName: s,
          input: c(n.input),
          error: r,
          metadata: r.$metadata
        }), r;
      }
    };
    var IBs = {
      name: "loggerMiddleware",
      tags: ["LOGGER"],
      step: "initialize",
      override: true
    };
    var vKu = e => ({
      applyToStack: t => {
        t.add(ABs(), IBs);
      }
    });
    pbn.getLoggerPlugin = vKu;
    pbn.loggerMiddleware = ABs;
    pbn.loggerMiddlewareOptions = IBs;
  });
  var OBs = __commonJS(ONt => {
    var PNt = {
      REQUEST_ID: Symbol.for("_AWS_LAMBDA_REQUEST_ID"),
      X_RAY_TRACE_ID: Symbol.for("_AWS_LAMBDA_X_RAY_TRACE_ID"),
      TENANT_ID: Symbol.for("_AWS_LAMBDA_TENANT_ID")
    };
    var CUr = ["true", "1"].includes(process.env?.AWS_LAMBDA_NODEJS_NO_GLOBAL_AWSLAMBDA ?? "");
    if (!CUr) {
      globalThis.awslambda = globalThis.awslambda || {};
    }
    class mbn {
      static PROTECTED_KEYS = PNt;
      isProtectedKey(e) {
        return Object.values(PNt).includes(e);
      }
      getRequestId() {
        return this.get(PNt.REQUEST_ID) ?? "-";
      }
      getXRayTraceId() {
        return this.get(PNt.X_RAY_TRACE_ID);
      }
      getTenantId() {
        return this.get(PNt.TENANT_ID);
      }
    }
    class PBs extends mbn {
      currentContext;
      getContext() {
        return this.currentContext;
      }
      hasContext() {
        return this.currentContext !== undefined;
      }
      get(e) {
        return this.currentContext?.[e];
      }
      set(e, t) {
        if (this.isProtectedKey(e)) {
          throw Error(`Cannot modify protected Lambda context field: ${String(e)}`);
        }
        this.currentContext = this.currentContext || {};
        this.currentContext[e] = t;
      }
      run(e, t) {
        this.currentContext = e;
        try {
          return t();
        } finally {
          this.currentContext = undefined;
        }
      }
    }
    class RUr extends mbn {
      als;
      static async create() {
        let e = new RUr();
        let t = await import("async_hooks");
        e.als = new t.AsyncLocalStorage();
        return e;
      }
      getContext() {
        return this.als.getStore();
      }
      hasContext() {
        return this.als.getStore() !== undefined;
      }
      get(e) {
        return this.als.getStore()?.[e];
      }
      set(e, t) {
        if (this.isProtectedKey(e)) {
          throw Error(`Cannot modify protected Lambda context field: ${String(e)}`);
        }
        let n = this.als.getStore();
        if (!n) {
          throw Error("No context available");
        }
        n[e] = t;
      }
      run(e, t) {
        return this.als.run(e, t);
      }
    }
    ONt.InvokeStore = undefined;
    (function (e) {
      let t = null;
      async function n() {
        if (!t) {
          t = (async () => {
            let o = "AWS_LAMBDA_MAX_CONCURRENCY" in process.env ? await RUr.create() : new PBs();
            if (!CUr && globalThis.awslambda?.InvokeStore) {
              return globalThis.awslambda.InvokeStore;
            } else if (!CUr && globalThis.awslambda) {
              globalThis.awslambda.InvokeStore = o;
              return o;
            } else {
              return o;
            }
          })();
        }
        return t;
      }
      e.getInstanceAsync = n;
      e._testing = process.env.AWS_LAMBDA_BENCHMARK_MODE === "1" ? {
        reset: () => {
          if (t = null, globalThis.awslambda?.InvokeStore) {
            delete globalThis.awslambda.InvokeStore;
          }
          globalThis.awslambda = {};
        }
      } : undefined;
    })(ONt.InvokeStore || (ONt.InvokeStore = {}));
    ONt.InvokeStoreBase = mbn;
  });
  var DBs = __commonJS(nv => {
    nv.HttpAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(nv.HttpAuthLocation || (nv.HttpAuthLocation = {}));
    nv.HttpApiKeyAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(nv.HttpApiKeyAuthLocation || (nv.HttpApiKeyAuthLocation = {}));
    nv.EndpointURLScheme = undefined;
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(nv.EndpointURLScheme || (nv.EndpointURLScheme = {}));
    nv.AlgorithmId = undefined;
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(nv.AlgorithmId || (nv.AlgorithmId = {}));
    var wKu = e => {
      let t = [];
      if (e.sha256 !== undefined) {
        t.push({
          algorithmId: () => nv.AlgorithmId.SHA256,
          checksumConstructor: () => e.sha256
        });
      }
      if (e.md5 != null) {
        t.push({
          algorithmId: () => nv.AlgorithmId.MD5,
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
    var CKu = e => {
      let t = {};
      e.checksumAlgorithms().forEach(n => {
        t[n.algorithmId()] = n.checksumConstructor();
      });
      return t;
    };
    var RKu = e => wKu(e);
    var xKu = e => CKu(e);
    nv.FieldPosition = undefined;
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(nv.FieldPosition || (nv.FieldPosition = {}));
    nv.IniSectionType = undefined;
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(nv.IniSectionType || (nv.IniSectionType = {}));
    nv.RequestHandlerProtocol = undefined;
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(nv.RequestHandlerProtocol || (nv.RequestHandlerProtocol = {}));
    nv.SMITHY_CONTEXT_KEY = "__smithy_context";
    nv.getDefaultExtensionConfiguration = RKu;
    nv.resolveDefaultRuntimeConfig = xKu;
  });
  var FBs = __commonJS(cAe => {
    var AKu = DBs();
    var IKu = e => ({
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
    var PKu = e => ({
      httpHandler: e.httpHandler()
    });
    class MBs {
      name;
      kind;
      values;
      constructor({
        name: e,
        kind: t = AKu.FieldPosition.HEADER,
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
    class NBs {
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
    class fbn {
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
        let t = new fbn({
          ...e,
          headers: {
            ...e.headers
          }
        });
        if (t.query) {
          t.query = OKu(t.query);
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
        return fbn.clone(this);
      }
    }
    function OKu(e) {
      return Object.keys(e).reduce((t, n) => {
        let r = e[n];
        return {
          ...t,
          [n]: Array.isArray(r) ? [...r] : r
        };
      }, {});
    }
    class LBs {
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
    function DKu(e) {
      return /^[a-z0-9][a-z0-9\.\-]*[a-z0-9]$/.test(e);
    }
    cAe.Field = MBs;
    cAe.Fields = NBs;
    cAe.HttpRequest = fbn;
    cAe.HttpResponse = LBs;
    cAe.getHttpHandlerExtensionConfiguration = IKu;
    cAe.isValidHostname = DKu;
    cAe.resolveHttpHandlerRuntimeConfig = PKu;
  });
  var UBs = __commonJS(hbn => {
    Object.defineProperty(hbn, "__esModule", {
      value: true
    });
    hbn.recursionDetectionMiddleware = undefined;
    var MKu = OBs();
    var NKu = FBs();
    var UKu = () => e => async t => {
      let {
        request: n
      } = t;
      if (!NKu.HttpRequest.isInstance(n)) {
        return e(t);
      }
      let r = Object.keys(n.headers ?? {}).find(u => u.toLowerCase() === ("X-Amzn-Trace-Id").toLowerCase()) ?? "X-Amzn-Trace-Id";
      if (n.headers.hasOwnProperty(r)) {
        return e(t);
      }
      let o = process.env["AWS_LAMBDA_FUNCTION_NAME"];
      let s = process.env["_X_AMZN_TRACE_ID"];
      let l = (await MKu.InvokeStore.getInstanceAsync())?.getXRayTraceId() ?? s;
      let c = u => typeof u === "string" && u.length > 0;
      if (c(o) && c(l)) {
        n.headers["X-Amzn-Trace-Id"] = l;
      }
      return e({
        ...t,
        request: n
      });
    };
    hbn.recursionDetectionMiddleware = UKu;
  });
  var Gye = __commonJS(gbn => {
    var kUr = UBs();
    var BKu = {
      step: "build",
      tags: ["RECURSION_DETECTION"],
      name: "recursionDetectionMiddleware",
      override: true,
      priority: "low"
    };
    var $Ku = e => ({
      applyToStack: t => {
        t.add(kUr.recursionDetectionMiddleware(), BKu);
      }
    });
    gbn.getRecursionDetectionPlugin = $Ku;
    Object.keys(kUr).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(gbn, e)) {
        Object.defineProperty(gbn, e, {
          enumerable: true,
          get: function () {
            return kUr[e];
          }
        });
      }
    });
  });
  var Ale = __commonJS(Jte => {
    var mrt = Lte();
    var HKu = bY();
    var $Bs = (e, t = false) => {
      if (t) {
        for (let n of e.split(".")) {
          if (!$Bs(n)) {
            return false;
          }
        }
        return true;
      }
      if (!mrt.isValidHostLabel(e)) {
        return false;
      }
      if (e.length < 3 || e.length > 63) {
        return false;
      }
      if (e !== e.toLowerCase()) {
        return false;
      }
      if (mrt.isIpAddress(e)) {
        return false;
      }
      return true;
    };
    var qKu = e => {
      let t = e.split(":");
      if (t.length < 6) {
        return null;
      }
      let [n, r, o, s, i, ...a] = t;
      if (n !== "arn" || r === "" || o === "" || a.join(":") === "") {
        return null;
      }
      let l = a.map(c => c.split("/")).flat();
      return {
        partition: r,
        service: o,
        region: s,
        accountId: i,
        resourceId: l
      };
    };
    var WKu = [{
      id: "aws",
      outputs: {
        dnsSuffix: "amazonaws.com",
        dualStackDnsSuffix: "api.aws",
        implicitGlobalRegion: "us-east-1",
        name: "aws",
        supportsDualStack: true,
        supportsFIPS: true
      },
      regionRegex: "^(us|eu|ap|sa|ca|me|af|il|mx)\\-\\w+\\-\\d+$",
      regions: {
        "af-south-1": {
          description: "Africa (Cape Town)"
        },
        "ap-east-1": {
          description: "Asia Pacific (Hong Kong)"
        },
        "ap-east-2": {
          description: "Asia Pacific (Taipei)"
        },
        "ap-northeast-1": {
          description: "Asia Pacific (Tokyo)"
        },
        "ap-northeast-2": {
          description: "Asia Pacific (Seoul)"
        },
        "ap-northeast-3": {
          description: "Asia Pacific (Osaka)"
        },
        "ap-south-1": {
          description: "Asia Pacific (Mumbai)"
        },
        "ap-south-2": {
          description: "Asia Pacific (Hyderabad)"
        },
        "ap-southeast-1": {
          description: "Asia Pacific (Singapore)"
        },
        "ap-southeast-2": {
          description: "Asia Pacific (Sydney)"
        },
        "ap-southeast-3": {
          description: "Asia Pacific (Jakarta)"
        },
        "ap-southeast-4": {
          description: "Asia Pacific (Melbourne)"
        },
        "ap-southeast-5": {
          description: "Asia Pacific (Malaysia)"
        },
        "ap-southeast-6": {
          description: "Asia Pacific (New Zealand)"
        },
        "ap-southeast-7": {
          description: "Asia Pacific (Thailand)"
        },
        "aws-global": {
          description: "aws global region"
        },
        "ca-central-1": {
          description: "Canada (Central)"
        },
        "ca-west-1": {
          description: "Canada West (Calgary)"
        },
        "eu-central-1": {
          description: "Europe (Frankfurt)"
        },
        "eu-central-2": {
          description: "Europe (Zurich)"
        },
        "eu-north-1": {
          description: "Europe (Stockholm)"
        },
        "eu-south-1": {
          description: "Europe (Milan)"
        },
        "eu-south-2": {
          description: "Europe (Spain)"
        },
        "eu-west-1": {
          description: "Europe (Ireland)"
        },
        "eu-west-2": {
          description: "Europe (London)"
        },
        "eu-west-3": {
          description: "Europe (Paris)"
        },
        "il-central-1": {
          description: "Israel (Tel Aviv)"
        },
        "me-central-1": {
          description: "Middle East (UAE)"
        },
        "me-south-1": {
          description: "Middle East (Bahrain)"
        },
        "mx-central-1": {
          description: "Mexico (Central)"
        },
        "sa-east-1": {
          description: "South America (Sao Paulo)"
        },
        "us-east-1": {
          description: "US East (N. Virginia)"
        },
        "us-east-2": {
          description: "US East (Ohio)"
        },
        "us-west-1": {
          description: "US West (N. California)"
        },
        "us-west-2": {
          description: "US West (Oregon)"
        }
      }
    }, {
      id: "aws-cn",
      outputs: {
        dnsSuffix: "amazonaws.com.cn",
        dualStackDnsSuffix: "api.amazonwebservices.com.cn",
        implicitGlobalRegion: "cn-northwest-1",
        name: "aws-cn",
        supportsDualStack: true,
        supportsFIPS: true
      },
      regionRegex: "^cn\\-\\w+\\-\\d+$",
      regions: {
        "aws-cn-global": {
          description: "aws-cn global region"
        },
        "cn-north-1": {
          description: "China (Beijing)"
        },
        "cn-northwest-1": {
          description: "China (Ningxia)"
        }
      }
    }, {
      id: "aws-eusc",
      outputs: {
        dnsSuffix: "amazonaws.eu",
        dualStackDnsSuffix: "api.amazonwebservices.eu",
        implicitGlobalRegion: "eusc-de-east-1",
        name: "aws-eusc",
        supportsDualStack: true,
        supportsFIPS: true
      },
      regionRegex: "^eusc\\-(de)\\-\\w+\\-\\d+$",
      regions: {
        "eusc-de-east-1": {
          description: "EU (Germany)"
        }
      }
    }, {
      id: "aws-iso",
      outputs: {
        dnsSuffix: "c2s.ic.gov",
        dualStackDnsSuffix: "api.aws.ic.gov",
        implicitGlobalRegion: "us-iso-east-1",
        name: "aws-iso",
        supportsDualStack: true,
        supportsFIPS: true
      },
      regionRegex: "^us\\-iso\\-\\w+\\-\\d+$",
      regions: {
        "aws-iso-global": {
          description: "aws-iso global region"
        },
        "us-iso-east-1": {
          description: "US ISO East"
        },
        "us-iso-west-1": {
          description: "US ISO WEST"
        }
      }
    }, {
      id: "aws-iso-b",
      outputs: {
        dnsSuffix: "sc2s.sgov.gov",
        dualStackDnsSuffix: "api.aws.scloud",
        implicitGlobalRegion: "us-isob-east-1",
        name: "aws-iso-b",
        supportsDualStack: true,
        supportsFIPS: true
      },
      regionRegex: "^us\\-isob\\-\\w+\\-\\d+$",
      regions: {
        "aws-iso-b-global": {
          description: "aws-iso-b global region"
        },
        "us-isob-east-1": {
          description: "US ISOB East (Ohio)"
        },
        "us-isob-west-1": {
          description: "US ISOB West"
        }
      }
    }, {
      id: "aws-iso-e",
      outputs: {
        dnsSuffix: "cloud.adc-e.uk",
        dualStackDnsSuffix: "api.cloud-aws.adc-e.uk",
        implicitGlobalRegion: "eu-isoe-west-1",
        name: "aws-iso-e",
        supportsDualStack: true,
        supportsFIPS: true
      },
      regionRegex: "^eu\\-isoe\\-\\w+\\-\\d+$",
      regions: {
        "aws-iso-e-global": {
          description: "aws-iso-e global region"
        },
        "eu-isoe-west-1": {
          description: "EU ISOE West"
        }
      }
    }, {
      id: "aws-iso-f",
      outputs: {
        dnsSuffix: "csp.hci.ic.gov",
        dualStackDnsSuffix: "api.aws.hci.ic.gov",
        implicitGlobalRegion: "us-isof-south-1",
        name: "aws-iso-f",
        supportsDualStack: true,
        supportsFIPS: true
      },
      regionRegex: "^us\\-isof\\-\\w+\\-\\d+$",
      regions: {
        "aws-iso-f-global": {
          description: "aws-iso-f global region"
        },
        "us-isof-east-1": {
          description: "US ISOF EAST"
        },
        "us-isof-south-1": {
          description: "US ISOF SOUTH"
        }
      }
    }, {
      id: "aws-us-gov",
      outputs: {
        dnsSuffix: "amazonaws.com",
        dualStackDnsSuffix: "api.aws",
        implicitGlobalRegion: "us-gov-west-1",
        name: "aws-us-gov",
        supportsDualStack: true,
        supportsFIPS: true
      },
      regionRegex: "^us\\-gov\\-\\w+\\-\\d+$",
      regions: {
        "aws-us-gov-global": {
          description: "aws-us-gov global region"
        },
        "us-gov-east-1": {
          description: "AWS GovCloud (US-East)"
        },
        "us-gov-west-1": {
          description: "AWS GovCloud (US-West)"
        }
      }
    }];
    var HBs = {
      partitions: WKu,
      version: "1.1"
    };
    var jBs = HBs;
    var qBs = "";
    var WBs = e => {
      let {
        partitions: t
      } = jBs;
      for (let r of t) {
        let {
          regions: o,
          outputs: s
        } = r;
        for (let [i, a] of Object.entries(o)) {
          if (i === e) {
            return {
              ...s,
              ...a
            };
          }
        }
      }
      for (let r of t) {
        let {
          regionRegex: o,
          outputs: s
        } = r;
        if (new RegExp(o).test(e)) {
          return {
            ...s
          };
        }
      }
      let n = t.find(r => r.id === "aws");
      if (!n) {
        throw Error("Provided region was not found in the partition array or regex, and default partition with id 'aws' doesn't exist.");
      }
      return {
        ...n.outputs
      };
    };
    var GBs = (e, t = "") => {
      jBs = e;
      qBs = t;
    };
    var VKu = () => {
      GBs(HBs, "");
    };
    var zKu = () => qBs;
    var VBs = {
      isVirtualHostableS3Bucket: $Bs,
      parseArn: qKu,
      partition: WBs
    };
    mrt.customEndpointFunctions.aws = VBs;
    var KKu = e => {
      if (typeof e.endpointProvider !== "function") {
        throw Error("@aws-sdk/util-endpoint - endpointProvider and endpoint missing in config for this client.");
      }
      let {
        endpoint: t
      } = e;
      if (t === undefined) {
        e.endpoint = async () => zBs(e.endpointProvider({
          Region: typeof e.region === "function" ? await e.region() : e.region,
          UseDualStack: typeof e.useDualstackEndpoint === "function" ? await e.useDualstackEndpoint() : e.useDualstackEndpoint,
          UseFIPS: typeof e.useFipsEndpoint === "function" ? await e.useFipsEndpoint() : e.useFipsEndpoint,
          Endpoint: undefined
        }, {
          logger: e.logger
        }));
      }
      return e;
    };
    var zBs = e => HKu.parseUrl(e.url);
    Object.defineProperty(Jte, "EndpointError", {
      enumerable: true,
      get: function () {
        return mrt.EndpointError;
      }
    });
    Object.defineProperty(Jte, "isIpAddress", {
      enumerable: true,
      get: function () {
        return mrt.isIpAddress;
      }
    });
    Object.defineProperty(Jte, "resolveEndpoint", {
      enumerable: true,
      get: function () {
        return mrt.resolveEndpoint;
      }
    });
    Jte.awsEndpointFunctions = VBs;
    Jte.getUserAgentPrefix = zKu;
    Jte.partition = WBs;
    Jte.resolveDefaultAwsRegionalEndpointsConfig = KKu;
    Jte.setPartitionInfo = GBs;
    Jte.toEndpointV1 = zBs;
    Jte.useDefaultPartitionInfo = VKu;
  });
  var KBs = __commonJS(rv => {
    rv.HttpAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(rv.HttpAuthLocation || (rv.HttpAuthLocation = {}));
    rv.HttpApiKeyAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(rv.HttpApiKeyAuthLocation || (rv.HttpApiKeyAuthLocation = {}));
    rv.EndpointURLScheme = undefined;
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(rv.EndpointURLScheme || (rv.EndpointURLScheme = {}));
    rv.AlgorithmId = undefined;
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(rv.AlgorithmId || (rv.AlgorithmId = {}));
    var YKu = e => {
      let t = [];
      if (e.sha256 !== undefined) {
        t.push({
          algorithmId: () => rv.AlgorithmId.SHA256,
          checksumConstructor: () => e.sha256
        });
      }
      if (e.md5 != null) {
        t.push({
          algorithmId: () => rv.AlgorithmId.MD5,
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
    var JKu = e => {
      let t = {};
      e.checksumAlgorithms().forEach(n => {
        t[n.algorithmId()] = n.checksumConstructor();
      });
      return t;
    };
    var XKu = e => YKu(e);
    var QKu = e => JKu(e);
    rv.FieldPosition = undefined;
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(rv.FieldPosition || (rv.FieldPosition = {}));
    rv.IniSectionType = undefined;
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(rv.IniSectionType || (rv.IniSectionType = {}));
    rv.RequestHandlerProtocol = undefined;
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(rv.RequestHandlerProtocol || (rv.RequestHandlerProtocol = {}));
    rv.SMITHY_CONTEXT_KEY = "__smithy_context";
    rv.getDefaultExtensionConfiguration = XKu;
    rv.resolveDefaultRuntimeConfig = QKu;
  });
  var QBs = __commonJS(uAe => {
    var e7u = KBs();
    var t7u = e => ({
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
    var n7u = e => ({
      httpHandler: e.httpHandler()
    });
    class YBs {
      name;
      kind;
      values;
      constructor({
        name: e,
        kind: t = e7u.FieldPosition.HEADER,
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
    class JBs {
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
    class ybn {
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
        let t = new ybn({
          ...e,
          headers: {
            ...e.headers
          }
        });
        if (t.query) {
          t.query = r7u(t.query);
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
        return ybn.clone(this);
      }
    }
    function r7u(e) {
      return Object.keys(e).reduce((t, n) => {
        let r = e[n];
        return {
          ...t,
          [n]: Array.isArray(r) ? [...r] : r
        };
      }, {});
    }
    class XBs {
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
    function o7u(e) {
      return /^[a-z0-9][a-z0-9\.\-]*[a-z0-9]$/.test(e);
    }
    uAe.Field = YBs;
    uAe.Fields = JBs;
    uAe.HttpRequest = ybn;
    uAe.HttpResponse = XBs;
    uAe.getHttpHandlerExtensionConfiguration = t7u;
    uAe.isValidHostname = o7u;
    uAe.resolveHttpHandlerRuntimeConfig = n7u;
  });
  var t2s = __commonJS(e2s => {
    var ZBs = typeof TextEncoder == "function" ? new TextEncoder() : null;
    var s7u = e => {
      if (typeof e === "string") {
        if (ZBs) {
          return ZBs.HS(e).byteLength;
        }
        let t = e.length;
        for (let n = t - 1; n >= 0; n--) {
          let r = e.charCodeAt(n);
          if (r > 127 && r <= 2047) {
            t++;
          } else if (r > 2047 && r <= 65535) {
            t += 2;
          }
          if (r >= 56320 && r <= 57343) {
            n--;
          }
        }
        return t;
      } else if (typeof e.byteLength === "number") {
        return e.byteLength;
      } else if (typeof e.size === "number") {
        return e.size;
      }
      throw Error(`Body Length computation failed for ${e}`);
    };
    e2s.calculateBodyLength = s7u;
  });