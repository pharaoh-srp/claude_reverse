  var Xte = __commonJS(Dle => {
    var WNt = HA();
    var Bjs = Ujs();
    var hZu = e => ({
      setRegion(t) {
        e.region = t;
      },
      region() {
        return e.region;
      }
    });
    var gZu = e => ({
      region: e.region()
    });
    Object.defineProperty(Dle, "NODE_REGION_CONFIG_FILE_OPTIONS", {
      enumerable: true,
      get: function () {
        return WNt.NODE_REGION_CONFIG_FILE_OPTIONS;
      }
    });
    Object.defineProperty(Dle, "NODE_REGION_CONFIG_OPTIONS", {
      enumerable: true,
      get: function () {
        return WNt.NODE_REGION_CONFIG_OPTIONS;
      }
    });
    Object.defineProperty(Dle, "REGION_ENV_NAME", {
      enumerable: true,
      get: function () {
        return WNt.REGION_ENV_NAME;
      }
    });
    Object.defineProperty(Dle, "REGION_INI_NAME", {
      enumerable: true,
      get: function () {
        return WNt.REGION_INI_NAME;
      }
    });
    Object.defineProperty(Dle, "resolveRegionConfig", {
      enumerable: true,
      get: function () {
        return WNt.resolveRegionConfig;
      }
    });
    Dle.getAwsRegionExtensionConfiguration = hZu;
    Dle.resolveAwsRegionExtensionConfiguration = gZu;
    Object.keys(Bjs).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(Dle, e)) {
        Object.defineProperty(Dle, e, {
          enumerable: true,
          get: function () {
            return Bjs[e];
          }
        });
      }
    });
  });
  var eSn = __commonJS(TAe => {
    var yZu = DBr();
    var _Zu = e => ({
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
    var bZu = e => ({
      httpHandler: e.httpHandler()
    });
    class $js {
      name;
      kind;
      values;
      constructor({
        name: e,
        kind: t = yZu.FieldPosition.HEADER,
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
    class Hjs {
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
    class Zbn {
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
        let t = new Zbn({
          ...e,
          headers: {
            ...e.headers
          }
        });
        if (t.query) {
          t.query = SZu(t.query);
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
        return Zbn.clone(this);
      }
    }
    function SZu(e) {
      return Object.keys(e).reduce((t, n) => {
        let r = e[n];
        return {
          ...t,
          [n]: Array.isArray(r) ? [...r] : r
        };
      }, {});
    }
    class jjs {
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
    function TZu(e) {
      return /^[a-z0-9][a-z0-9\.\-]*[a-z0-9]$/.test(e);
    }
    TAe.Field = $js;
    TAe.Fields = Hjs;
    TAe.HttpRequest = Zbn;
    TAe.HttpResponse = jjs;
    TAe.getHttpHandlerExtensionConfiguration = _Zu;
    TAe.isValidHostname = TZu;
    TAe.resolveHttpHandlerRuntimeConfig = bZu;
  });
  var u2r = __commonJS(BP => {
    var qjs = qye();
    var EZu = Wye();
    var vZu = Gye();
    var Wjs = Ple();
    var wZu = HA();
    var i2r = Od();
    var Y6 = qT();
    var CZu = Xye();
    var Yjs = _o();
    var Gjs = yF();
    var EAe = Pj();
    var Vjs = HBr();
    var RZu = Ljs();
    var zjs = Xte();
    var Kjs = eSn();
    var xZu = e => Object.assign(e, {
      useDualstackEndpoint: e.useDualstackEndpoint ?? false,
      useFipsEndpoint: e.useFipsEndpoint ?? false,
      defaultSigningName: "sso-oauth"
    });
    var kZu = {
      UseFIPS: {
        type: "builtInParams",
        name: "useFipsEndpoint"
      },
      Endpoint: {
        type: "builtInParams",
        name: "endpoint"
      },
      Region: {
        type: "builtInParams",
        name: "region"
      },
      UseDualStack: {
        type: "builtInParams",
        name: "useDualstackEndpoint"
      }
    };
    var AZu = e => {
      let {
        httpAuthSchemes: t,
        httpAuthSchemeProvider: n,
        credentials: r
      } = e;
      return {
        setHttpAuthScheme(o) {
          let s = t.findIndex(i => i.schemeId === o.schemeId);
          if (s === -1) {
            t.push(o);
          } else {
            t.splice(s, 1, o);
          }
        },
        httpAuthSchemes() {
          return t;
        },
        setHttpAuthSchemeProvider(o) {
          n = o;
        },
        httpAuthSchemeProvider() {
          return n;
        },
        setCredentials(o) {
          r = o;
        },
        credentials() {
          return r;
        }
      };
    };
    var IZu = e => ({
      httpAuthSchemes: e.httpAuthSchemes(),
      httpAuthSchemeProvider: e.httpAuthSchemeProvider(),
      credentials: e.credentials()
    });
    var PZu = (e, t) => {
      let n = Object.assign(zjs.getAwsRegionExtensionConfiguration(e), EAe.getDefaultExtensionConfiguration(e), Kjs.getHttpHandlerExtensionConfiguration(e), AZu(e));
      t.forEach(r => r.configure(n));
      return Object.assign(e, zjs.resolveAwsRegionExtensionConfiguration(n), EAe.resolveDefaultRuntimeConfig(n), Kjs.resolveHttpHandlerRuntimeConfig(n), IZu(n));
    };
    class a2r extends EAe.Client {
      config;
      constructor(...[e]) {
        let t = RZu.getRuntimeConfig(e || {});
        super(t);
        this.initConfig = t;
        let n = xZu(t);
        let r = Wjs.resolveUserAgentConfig(n);
        let o = Gjs.resolveRetryConfig(r);
        let s = wZu.resolveRegionConfig(o);
        let i = qjs.resolveHostHeaderConfig(s);
        let a = Yjs.resolveEndpointConfig(i);
        let l = Vjs.resolveHttpAuthSchemeConfig(a);
        let c = PZu(l, e?.extensions || []);
        this.config = c;
        this.middlewareStack.use(Y6.getSchemaSerdePlugin(this.config));
        this.middlewareStack.use(Wjs.getUserAgentPlugin(this.config));
        this.middlewareStack.use(Gjs.getRetryPlugin(this.config));
        this.middlewareStack.use(CZu.getContentLengthPlugin(this.config));
        this.middlewareStack.use(qjs.getHostHeaderPlugin(this.config));
        this.middlewareStack.use(EZu.getLoggerPlugin(this.config));
        this.middlewareStack.use(vZu.getRecursionDetectionPlugin(this.config));
        this.middlewareStack.use(i2r.getHttpAuthSchemeEndpointRuleSetPlugin(this.config, {
          httpAuthSchemeParametersProvider: Vjs.defaultSSOOIDCHttpAuthSchemeParametersProvider,
          identityProviderConfigProvider: async u => new i2r.DefaultIdentityProviderConfig({
            "aws.auth#sigv4": u.credentials
          })
        }));
        this.middlewareStack.use(i2r.getHttpSigningPlugin(this.config));
      }
      destroy() {
        super.destroy();
      }
    }
    var J6 = class e extends EAe.ServiceException {
      constructor(t) {
        super(t);
        Object.setPrototypeOf(this, e.prototype);
      }
    };
    var Jjs = class e extends J6 {
      name = "AccessDeniedException";
      $fault = "client";
      error;
      reason;
      error_description;
      constructor(t) {
        super({
          name: "AccessDeniedException",
          $fault: "client",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
        this.error = t.error;
        this.reason = t.reason;
        this.error_description = t.error_description;
      }
    };
    var Xjs = class e extends J6 {
      name = "AuthorizationPendingException";
      $fault = "client";
      error;
      error_description;
      constructor(t) {
        super({
          name: "AuthorizationPendingException",
          $fault: "client",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
        this.error = t.error;
        this.error_description = t.error_description;
      }
    };
    var Qjs = class e extends J6 {
      name = "ExpiredTokenException";
      $fault = "client";
      error;
      error_description;
      constructor(t) {
        super({
          name: "ExpiredTokenException",
          $fault: "client",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
        this.error = t.error;
        this.error_description = t.error_description;
      }
    };
    var Zjs = class e extends J6 {
      name = "InternalServerException";
      $fault = "server";
      error;
      error_description;
      constructor(t) {
        super({
          name: "InternalServerException",
          $fault: "server",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
        this.error = t.error;
        this.error_description = t.error_description;
      }
    };
    var eqs = class e extends J6 {
      name = "InvalidClientException";
      $fault = "client";
      error;
      error_description;
      constructor(t) {
        super({
          name: "InvalidClientException",
          $fault: "client",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
        this.error = t.error;
        this.error_description = t.error_description;
      }
    };
    var tqs = class e extends J6 {
      name = "InvalidGrantException";
      $fault = "client";
      error;
      error_description;
      constructor(t) {
        super({
          name: "InvalidGrantException",
          $fault: "client",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
        this.error = t.error;
        this.error_description = t.error_description;
      }
    };
    var nqs = class e extends J6 {
      name = "InvalidRequestException";
      $fault = "client";
      error;
      reason;
      error_description;
      constructor(t) {
        super({
          name: "InvalidRequestException",
          $fault: "client",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
        this.error = t.error;
        this.reason = t.reason;
        this.error_description = t.error_description;
      }
    };
    var rqs = class e extends J6 {
      name = "InvalidScopeException";
      $fault = "client";
      error;
      error_description;
      constructor(t) {
        super({
          name: "InvalidScopeException",
          $fault: "client",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
        this.error = t.error;
        this.error_description = t.error_description;
      }
    };
    var oqs = class e extends J6 {
      name = "SlowDownException";
      $fault = "client";
      error;
      error_description;
      constructor(t) {
        super({
          name: "SlowDownException",
          $fault: "client",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
        this.error = t.error;
        this.error_description = t.error_description;
      }
    };
    var sqs = class e extends J6 {
      name = "UnauthorizedClientException";
      $fault = "client";
      error;
      error_description;
      constructor(t) {
        super({
          name: "UnauthorizedClientException",
          $fault: "client",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
        this.error = t.error;
        this.error_description = t.error_description;
      }
    };
    var iqs = class e extends J6 {
      name = "UnsupportedGrantTypeException";
      $fault = "client";
      error;
      error_description;
      constructor(t) {
        super({
          name: "UnsupportedGrantTypeException",
          $fault: "client",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
        this.error = t.error;
        this.error_description = t.error_description;
      }
    };
    var ded = [0, "com.amazonaws.ssooidc", "AccessToken", 8, 0];
    var ped = [0, "com.amazonaws.ssooidc", "ClientSecret", 8, 0];
    var med = [0, "com.amazonaws.ssooidc", "CodeVerifier", 8, 0];
    var fed = [0, "com.amazonaws.ssooidc", "IdToken", 8, 0];
    var uqs = [0, "com.amazonaws.ssooidc", "RefreshToken", 8, 0];
    var hed = [-3, "com.amazonaws.ssooidc", "AccessDeniedException", {
      ["error"]: "client",
      ["httpError"]: 400
    }, ["error", "reason", "error_description"], [0, 0, 0]];
    Y6.TypeRegistry.for("com.amazonaws.ssooidc").registerError(hed, Jjs);
    var ged = [-3, "com.amazonaws.ssooidc", "AuthorizationPendingException", {
      ["error"]: "client",
      ["httpError"]: 400
    }, ["error", "error_description"], [0, 0]];
    Y6.TypeRegistry.for("com.amazonaws.ssooidc").registerError(ged, Xjs);
    var yed = [3, "com.amazonaws.ssooidc", "CreateTokenRequest", 0, ["clientId", "clientSecret", "grantType", "deviceCode", "code", "refreshToken", "scope", "redirectUri", "codeVerifier"], [0, [() => ped, 0], 0, 0, 0, [() => uqs, 0], 64, 0, [() => med, 0]]];
    var _ed = [3, "com.amazonaws.ssooidc", "CreateTokenResponse", 0, ["accessToken", "tokenType", "expiresIn", "refreshToken", "idToken"], [[() => ded, 0], 0, 1, [() => uqs, 0], [() => fed, 0]]];
    var bed = [-3, "com.amazonaws.ssooidc", "ExpiredTokenException", {
      ["error"]: "client",
      ["httpError"]: 400
    }, ["error", "error_description"], [0, 0]];
    Y6.TypeRegistry.for("com.amazonaws.ssooidc").registerError(bed, Qjs);
    var Sed = [-3, "com.amazonaws.ssooidc", "InternalServerException", {
      ["error"]: "server",
      ["httpError"]: 500
    }, ["error", "error_description"], [0, 0]];
    Y6.TypeRegistry.for("com.amazonaws.ssooidc").registerError(Sed, Zjs);
    var Ted = [-3, "com.amazonaws.ssooidc", "InvalidClientException", {
      ["error"]: "client",
      ["httpError"]: 401
    }, ["error", "error_description"], [0, 0]];
    Y6.TypeRegistry.for("com.amazonaws.ssooidc").registerError(Ted, eqs);
    var Eed = [-3, "com.amazonaws.ssooidc", "InvalidGrantException", {
      ["error"]: "client",
      ["httpError"]: 400
    }, ["error", "error_description"], [0, 0]];
    Y6.TypeRegistry.for("com.amazonaws.ssooidc").registerError(Eed, tqs);
    var ved = [-3, "com.amazonaws.ssooidc", "InvalidRequestException", {
      ["error"]: "client",
      ["httpError"]: 400
    }, ["error", "reason", "error_description"], [0, 0, 0]];
    Y6.TypeRegistry.for("com.amazonaws.ssooidc").registerError(ved, nqs);
    var wed = [-3, "com.amazonaws.ssooidc", "InvalidScopeException", {
      ["error"]: "client",
      ["httpError"]: 400
    }, ["error", "error_description"], [0, 0]];
    Y6.TypeRegistry.for("com.amazonaws.ssooidc").registerError(wed, rqs);
    var Ced = [-3, "com.amazonaws.ssooidc", "SlowDownException", {
      ["error"]: "client",
      ["httpError"]: 400
    }, ["error", "error_description"], [0, 0]];
    Y6.TypeRegistry.for("com.amazonaws.ssooidc").registerError(Ced, oqs);
    var Red = [-3, "com.amazonaws.ssooidc", "UnauthorizedClientException", {
      ["error"]: "client",
      ["httpError"]: 400
    }, ["error", "error_description"], [0, 0]];
    Y6.TypeRegistry.for("com.amazonaws.ssooidc").registerError(Red, sqs);
    var xed = [-3, "com.amazonaws.ssooidc", "UnsupportedGrantTypeException", {
      ["error"]: "client",
      ["httpError"]: 400
    }, ["error", "error_description"], [0, 0]];
    Y6.TypeRegistry.for("com.amazonaws.ssooidc").registerError(xed, iqs);
    var ked = [-3, "smithy.ts.sdk.synthetic.com.amazonaws.ssooidc", "SSOOIDCServiceException", 0, [], []];
    Y6.TypeRegistry.for("smithy.ts.sdk.synthetic.com.amazonaws.ssooidc").registerError(ked, J6);
    var Aed = [9, "com.amazonaws.ssooidc", "CreateToken", {
      ["http"]: ["POST", "/token", 200]
    }, () => yed, () => _ed];
    class l2r extends EAe.Command.classBuilder().ep(kZu).m(function (e, t, n, r) {
      return [Yjs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSSSOOIDCService", "CreateToken", {}).n("SSOOIDCClient", "CreateTokenCommand").sc(Aed).build() {}
    var Ied = {
      CreateTokenCommand: l2r
    };
    class c2r extends a2r {}
    EAe.createAggregatedClient(Ied, c2r);
    var Ped = {
      KMS_ACCESS_DENIED: "KMS_AccessDeniedException"
    };
    var Oed = {
      KMS_DISABLED_KEY: "KMS_DisabledException",
      KMS_INVALID_KEY_USAGE: "KMS_InvalidKeyUsageException",
      KMS_INVALID_STATE: "KMS_InvalidStateException",
      KMS_KEY_NOT_FOUND: "KMS_NotFoundException"
    };
    Object.defineProperty(BP, "$Command", {
      enumerable: true,
      get: function () {
        return EAe.Command;
      }
    });
    Object.defineProperty(BP, "__Client", {
      enumerable: true,
      get: function () {
        return EAe.Client;
      }
    });
    BP.AccessDeniedException = Jjs;
    BP.AccessDeniedExceptionReason = Ped;
    BP.AuthorizationPendingException = Xjs;
    BP.CreateTokenCommand = l2r;
    BP.ExpiredTokenException = Qjs;
    BP.InternalServerException = Zjs;
    BP.InvalidClientException = eqs;
    BP.InvalidGrantException = tqs;
    BP.InvalidRequestException = nqs;
    BP.InvalidRequestExceptionReason = Oed;
    BP.InvalidScopeException = rqs;
    BP.SSOOIDC = c2r;
    BP.SSOOIDCClient = a2r;
    BP.SSOOIDCServiceException = J6;
    BP.SlowDownException = oqs;
    BP.UnauthorizedClientException = sqs;
    BP.UnsupportedGrantTypeException = iqs;
  });