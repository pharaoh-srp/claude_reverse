  __export(yk, {
    withBaseException: () => withBaseException_export,
    throwDefaultError: () => throwDefaultError_export,
    take: () => take_export,
    serializeFloat: () => serializeFloat_export,
    serializeDateTime: () => serializeDateTime_export,
    resolvedPath: () => d4s.resolvedPath,
    resolveDefaultRuntimeConfig: () => resolveDefaultRuntimeConfig_export,
    map: () => map_export3,
    loadConfigsForDefaultMode: () => loadConfigsForDefaultMode_export,
    isSerializableHeaderValue: () => isSerializableHeaderValue_export,
    getValueFromTextNode: () => getValueFromTextNode_export,
    getDefaultExtensionConfiguration: () => getDefaultExtensionConfiguration_export,
    getDefaultExtensionConfiguration: () => getDefaultExtensionConfiguration_export,
    getArrayIfSingleItem: () => getArrayIfSingleItem_export,
    extendedEncodeURIComponent: () => Z3s.extendedEncodeURIComponent,
    emitWarningIfUnsupportedVersion: () => emitWarningIfUnsupportedVersion_export,
    decorateServiceException: () => decorateServiceException_export,
    createAggregatedClient: () => createAggregatedClient_export,
    convertMap: () => convertMap_export,
    collectBody: () => xqs.collectBody,
    _json: () => _json_export,
    ServiceException: () => ServiceException_export,
    SENSITIVE_STRING: () => "***SensitiveInformation***",
    NoOpLogger: () => NoOpLogger_export,
    Command: () => Command_export,
    Client: () => Client_export
  });
  var xY = __lazy(() => {
    Rqs();
    kqs();
    Y3s();
    X3s();
    y2r();
    e4s();
    a4s();
    p4s();
    __reExport(yk, __toESM(yW(), 1), module.exports);
  });
  function zed(e) {
    return {
      schemeId: "aws.auth#sigv4",
      signingProperties: {
        name: "awsssoportal",
        region: e.region
      },
      propertiesExtractor: (t, n) => ({
        signingProperties: {
          config: t,
          context: n
        }
      })
    };
  }
  function lSn(e) {
    return {
      schemeId: "smithy.api#noAuth"
    };
  }
  var m4s;
  var GNt;
  var f4s = async (e, t, n) => ({
    operation: GNt.getSmithyContext(t).operation,
    region: (await GNt.normalizeProvider(e.region)()) || (() => {
      throw Error("expected `region` to be configured for `aws.auth#sigv4`");
    })()
  });
  var h4s = e => {
    let t = [];
    switch (e.operation) {
      case "GetRoleCredentials":
        {
          t.push(lSn(e));
          break;
        }
      case "ListAccountRoles":
        {
          t.push(lSn(e));
          break;
        }
      case "ListAccounts":
        {
          t.push(lSn(e));
          break;
        }
      case "Logout":
        {
          t.push(lSn(e));
          break;
        }
      default:
        t.push(zed(e));
    }
    return t;
  };
  var g4s = e => {
    let t = m4s.resolveAwsSdkSigV4Config(e);
    return Object.assign(t, {
      authSchemePreference: GNt.normalizeProvider(e.authSchemePreference ?? [])
    });
  };
  var E2r = __lazy(() => {
    m4s = __toESM(nw(), 1);
    GNt = __toESM(zB(), 1);
  });
  var y4s = e => Object.assign(e, {
    useDualstackEndpoint: e.useDualstackEndpoint ?? false,
    useFipsEndpoint: e.useFipsEndpoint ?? false,
    defaultSigningName: "awsssoportal"
  });
  var RAe;
  var Irt = __lazy(() => {
    RAe = {
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
  });
  var b4s;
  var _4s = __lazy(() => {
    b4s = {
      name: "@aws-sdk/client-sso",
      description: "AWS SDK for JavaScript Sso Client for Node.js, Browser and React Native",
      version: "3.936.0",
      scripts: {
        build: "concurrently 'yarn:build:cjs' 'yarn:build:es' 'yarn:build:types'",
        "build:cjs": "node ../../scripts/compilation/inline client-sso",
        "build:es": "tsc -p tsconfig.es.json",
        "build:include:deps": "lerna run --scope $npm_package_name --include-dependencies build",
        "build:types": "tsc -p tsconfig.types.json",
        "build:types:downlevel": "downlevel-dts dist-types dist-types/ts3.4",
        clean: "rimraf ./dist-* && rimraf *.tsbuildinfo",
        "extract:docs": "api-extractor run --local",
        "generate:client": "node ../../scripts/generate-clients/single-service --solo sso"
      },
      main: "./dist-cjs/index.js",
      types: "./dist-types/index.d.ts",
      module: "./dist-es/index.js",
      sideEffects: false,
      dependencies: {
        "@aws-crypto/sha256-browser": "5.2.0",
        "@aws-crypto/sha256-js": "5.2.0",
        "@aws-sdk/core": "3.936.0",
        "@aws-sdk/middleware-host-header": "3.936.0",
        "@aws-sdk/middleware-logger": "3.936.0",
        "@aws-sdk/middleware-recursion-detection": "3.936.0",
        "@aws-sdk/middleware-user-agent": "3.936.0",
        "@aws-sdk/region-config-resolver": "3.936.0",
        "@aws-sdk/types": "3.936.0",
        "@aws-sdk/util-endpoints": "3.936.0",
        "@aws-sdk/util-user-agent-browser": "3.936.0",
        "@aws-sdk/util-user-agent-node": "3.936.0",
        "@smithy/config-resolver": "^4.4.3",
        "@smithy/core": "^3.18.5",
        "@smithy/fetch-http-handler": "^5.3.6",
        "@smithy/hash-node": "^4.2.5",
        "@smithy/invalid-dependency": "^4.2.5",
        "@smithy/middleware-content-length": "^4.2.5",
        "@smithy/middleware-endpoint": "^4.3.12",
        "@smithy/middleware-retry": "^4.4.12",
        "@smithy/middleware-serde": "^4.2.6",
        "@smithy/middleware-stack": "^4.2.5",
        "@smithy/node-config-provider": "^4.3.5",
        "@smithy/node-http-handler": "^4.4.5",
        "@smithy/protocol-http": "^5.3.5",
        "@smithy/smithy-client": "^4.9.8",
        "@smithy/types": "^4.9.0",
        "@smithy/url-parser": "^4.2.5",
        "@smithy/util-base64": "^4.3.0",
        "@smithy/util-body-length-browser": "^4.2.0",
        "@smithy/util-body-length-node": "^4.2.1",
        "@smithy/util-defaults-mode-browser": "^4.3.11",
        "@smithy/util-defaults-mode-node": "^4.2.14",
        "@smithy/util-endpoints": "^3.2.5",
        "@smithy/util-middleware": "^4.2.5",
        "@smithy/util-retry": "^4.2.5",
        "@smithy/util-utf8": "^4.2.0",
        tslib: "^2.6.2"
      },
      devDependencies: {
        "@tsconfig/node18": "18.2.4",
        "@types/node": "^18.19.69",
        concurrently: "7.0.0",
        "downlevel-dts": "0.10.1",
        rimraf: "3.0.2",
        typescript: "~5.8.3"
      },
      engines: {
        node: ">=18.0.0"
      },
      typesVersions: {
        "<4.0": {
          "dist-types/*": ["dist-types/ts3.4/*"]
        }
      },
      files: ["dist-*/**"],
      author: {
        name: "AWS SDK for JavaScript Team",
        url: "https://aws.amazon.com/javascript/"
      },
      license: "Apache-2.0",
      browser: {
        "./dist-es/runtimeConfig": "./dist-es/runtimeConfig.browser"
      },
      "react-native": {
        "./dist-es/runtimeConfig": "./dist-es/runtimeConfig.native"
      },
      homepage: "https://github.com/aws/aws-sdk-js-v3/tree/main/clients/client-sso",
      repository: {
        type: "git",
        url: "https://github.com/aws/aws-sdk-js-v3.git",
        directory: "clients/client-sso"
      }
    };
  });
  var S4s = e => typeof ArrayBuffer === "function" && e instanceof ArrayBuffer || Object.prototype.toString.call(e) === "[object ArrayBuffer]";
  var cSn;
  var T4s = (e, t = 0, n = e.byteLength - t) => {
    if (!S4s(e)) {
      throw TypeError(`The "input" argument must be ArrayBuffer. Received type ${typeof e} (${e})`);
    }
    return cSn.Buffer.from(e, t, n);
  };
  var E4s = (e, t) => {
    if (typeof e !== "string") {
      throw TypeError(`The "input" argument must be of type string. Received type ${typeof e} (${e})`);
    }
    return t ? cSn.Buffer.from(e, t) : cSn.Buffer.from(e);
  };
  var v2r = __lazy(() => {
    cSn = require("buffer");
  });
  var Yed;
  var v4s = e => {
    if (e.length * 3 % 4 !== 0) {
      throw TypeError("Incorrect padding on base64 string.");
    }
    if (!Yed.exec(e)) {
      throw TypeError("Invalid base64 string.");
    }
    let t = E4s(e, "base64");
    return new Uint8Array(t.buffer, t.byteOffset, t.byteLength);
  };
  var w4s = __lazy(() => {
    v2r();
    Yed = /^[A-Za-z0-9+/]*={0,2}$/;
  });
  var C4s;
  var R4s = e => {
    let t;
    if (typeof e === "string") {
      t = C4s.fromUtf8(e);
    } else {
      t = e;
    }
    if (typeof t !== "object" || typeof t.byteOffset !== "number" || typeof t.byteLength !== "number") {
      throw Error("@smithy/util-base64: toBase64 encoder function only accepts string | Uint8Array.");
    }
    return T4s(t.buffer, t.byteOffset, t.byteLength).toString("base64");
  };
  var x4s = __lazy(() => {
    v2r();
    C4s = __toESM(jT(), 1);
  });
  var k4s = __lazy(() => {
    w4s();
    x4s();
  });
  var A4s;
  var I4s;
  var P4s;
  var F4s;
  var U4s;
  var kY;
  var O4s;
  var B4s;
  var D4s;
  var M4s;
  var N4s;
  var L4s;
  var Jed;
  var j4s;
  var Prt;
  var Xed;
  var q4s = (e, t = {}) => Xed.get(e, () => Prt.resolveEndpoint(Jed, {
    endpointParams: e,
    logger: t.logger
  }));
  var W4s = __lazy(() => {
    j4s = __toESM(Ale(), 1);
    Prt = __toESM(Lte(), 1);
    Xed = new Prt.EndpointCache({
      size: 50,
      params: ["Endpoint", "Region", "UseDualStack", "UseFIPS"]
    });
    Prt.customEndpointFunctions.aws = j4s.awsEndpointFunctions;
  });
  var G4s;
  var V4s;
  var z4s;
  var K4s;
  var uSn;
  var Y4s = e => ({
    apiVersion: "2019-06-10",
    base64Decoder: e?.base64Decoder ?? v4s,
    base64Encoder: e?.base64Encoder ?? R4s,
    disableHostPrefix: e?.disableHostPrefix ?? false,
    endpointProvider: e?.endpointProvider ?? q4s,
    extensions: e?.extensions ?? [],
    httpAuthSchemeProvider: e?.httpAuthSchemeProvider ?? h4s,
    httpAuthSchemes: e?.httpAuthSchemes ?? [{
      schemeId: "aws.auth#sigv4",
      identityProvider: t => t.getIdentityProvider("aws.auth#sigv4"),
      signer: new G4s.AwsSdkSigV4Signer()
    }, {
      schemeId: "smithy.api#noAuth",
      identityProvider: t => t.getIdentityProvider("smithy.api#noAuth") || (async () => ({})),
      signer: new z4s.NoAuthSigner()
    }],
    logger: e?.logger ?? new NoOpLogger_export(),
    protocol: e?.protocol ?? new V4s.AwsRestJsonProtocol({
      defaultNamespace: "com.amazonaws.sso"
    }),
    serviceId: e?.serviceId ?? "SSO",
    urlParser: e?.urlParser ?? K4s.parseUrl,
    utf8Decoder: e?.utf8Decoder ?? uSn.fromUtf8,
    utf8Encoder: e?.utf8Encoder ?? uSn.toUtf8
  });
  var J4s = __lazy(() => {
    xY();
    k4s();
    E2r();
    W4s();
    G4s = __toESM(nw(), 1);
    V4s = __toESM(r_e(), 1);
    z4s = __toESM(Od(), 1);
    K4s = __toESM(bY(), 1);
    uSn = __toESM(jT(), 1);
  });
  var dSn;
  var pSn;
  var kAe;
  var X4s;
  var mSn;
  var xAe;
  var fSn;
  var Q4s;
  var Z4s;
  var eWs;
  var tWs = e => {
    emitWarningIfUnsupportedVersion_export(process.version);
    let t = eWs.resolveDefaultsModeConfig(e);
    let n = () => t().then(loadConfigsForDefaultMode_export);
    let r = Y4s(e);
    dSn.emitWarningIfUnsupportedVersion(process.version);
    let o = {
      profile: e?.profile,
      logger: r.logger
    };
    return {
      ...r,
      ...e,
      runtime: "node",
      defaultsMode: t,
      authSchemePreference: e?.authSchemePreference ?? xAe.loadConfig(dSn.NODE_AUTH_SCHEME_PREFERENCE_OPTIONS, o),
      bodyLengthChecker: e?.bodyLengthChecker ?? Q4s.calculateBodyLength,
      defaultUserAgentProvider: e?.defaultUserAgentProvider ?? pSn.createDefaultUserAgentProvider({
        serviceId: r.serviceId,
        clientVersion: b4s.version
      }),
      maxAttempts: e?.maxAttempts ?? xAe.loadConfig(mSn.NODE_MAX_ATTEMPT_CONFIG_OPTIONS, e),
      region: e?.region ?? xAe.loadConfig(kAe.NODE_REGION_CONFIG_OPTIONS, {
        ...kAe.NODE_REGION_CONFIG_FILE_OPTIONS,
        ...o
      }),
      requestHandler: fSn.NodeHttpHandler.create(e?.requestHandler ?? n),
      retryMode: e?.retryMode ?? xAe.loadConfig({
        ...mSn.NODE_RETRY_MODE_CONFIG_OPTIONS,
        default: async () => (await n()).retryMode || Z4s.DEFAULT_RETRY_MODE
      }, e),
      sha256: e?.sha256 ?? X4s.Hash.bind(null, "sha256"),
      streamCollector: e?.streamCollector ?? fSn.streamCollector,
      useDualstackEndpoint: e?.useDualstackEndpoint ?? xAe.loadConfig(kAe.NODE_USE_DUALSTACK_ENDPOINT_CONFIG_OPTIONS, o),
      useFipsEndpoint: e?.useFipsEndpoint ?? xAe.loadConfig(kAe.NODE_USE_FIPS_ENDPOINT_CONFIG_OPTIONS, o),
      userAgentAppId: e?.userAgentAppId ?? xAe.loadConfig(pSn.NODE_APP_ID_CONFIG_OPTIONS, o)
    };
  };
  var nWs = __lazy(() => {
    _4s();
    J4s();
    xY();
    xY();
    dSn = __toESM(nw(), 1);
    pSn = __toESM(Zye(), 1);
    kAe = __toESM(HA(), 1);
    X4s = __toESM(e_e(), 1);
    mSn = __toESM(yF(), 1);
    xAe = __toESM(VB(), 1);
    fSn = __toESM(hW(), 1);
    Q4s = __toESM(t_e(), 1);
    Z4s = __toESM(Ole(), 1);
    eWs = __toESM(s_e(), 1);
  });
  var rWs = e => ({
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
  var oWs = e => ({
    httpHandler: e.httpHandler()
  });
  var sWs = () => {};
  var iWs = () => {};
  var aWs = () => {};
  var lWs = () => {};
  var cWs = __lazy(() => {
    sWs();
    iWs();
    aWs();
    lWs();
  });
  var uWs = e => {
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
  var dWs = e => ({
    httpAuthSchemes: e.httpAuthSchemes(),
    httpAuthSchemeProvider: e.httpAuthSchemeProvider(),
    credentials: e.credentials()
  });
  var hSn;
  var pWs = (e, t) => {
    let n = Object.assign(hSn.getAwsRegionExtensionConfiguration(e), getDefaultExtensionConfiguration_export(e), rWs(e), uWs(e));
    t.forEach(r => r.configure(n));
    return Object.assign(e, hSn.resolveAwsRegionExtensionConfiguration(n), resolveDefaultRuntimeConfig_export(n), oWs(n), dWs(n));
  };
  var mWs = __lazy(() => {
    cWs();
    xY();
    hSn = __toESM(Xte(), 1);
  });
  var gSn;
  var fWs;
  var hWs;
  var ySn;
  var gWs;
  var Ort;
  var yWs;
  var _Ws;
  var bWs;
  var _Sn;
  var SSOClient;
  var VNt = __lazy(() => {
    xY();
    E2r();
    Irt();
    nWs();
    mWs();
    gSn = __toESM(qye(), 1);
    fWs = __toESM(Wye(), 1);
    hWs = __toESM(Gye(), 1);
    ySn = __toESM(Ple(), 1);
    gWs = __toESM(HA(), 1);
    Ort = __toESM(Od(), 1);
    yWs = __toESM(qT(), 1);
    _Ws = __toESM(Xye(), 1);
    bWs = __toESM(_o(), 1);
    _Sn = __toESM(yF(), 1);
    SSOClient = class i_e extends Client_export {
      config;
      constructor(...[e]) {
        let t = tWs(e || {});
        super(t);
        this.initConfig = t;
        let n = y4s(t);
        let r = ySn.resolveUserAgentConfig(n);
        let o = _Sn.resolveRetryConfig(r);
        let s = gWs.resolveRegionConfig(o);
        let i = gSn.resolveHostHeaderConfig(s);
        let a = bWs.resolveEndpointConfig(i);
        let l = g4s(a);
        let c = pWs(l, e?.extensions || []);
        this.config = c;
        this.middlewareStack.use(yWs.getSchemaSerdePlugin(this.config));
        this.middlewareStack.use(ySn.getUserAgentPlugin(this.config));
        this.middlewareStack.use(_Sn.getRetryPlugin(this.config));
        this.middlewareStack.use(_Ws.getContentLengthPlugin(this.config));
        this.middlewareStack.use(gSn.getHostHeaderPlugin(this.config));
        this.middlewareStack.use(fWs.getLoggerPlugin(this.config));
        this.middlewareStack.use(hWs.getRecursionDetectionPlugin(this.config));
        this.middlewareStack.use(Ort.getHttpAuthSchemeEndpointRuleSetPlugin(this.config, {
          httpAuthSchemeParametersProvider: f4s,
          identityProviderConfigProvider: async u => new Ort.DefaultIdentityProviderConfig({
            "aws.auth#sigv4": u.credentials
          })
        }));
        this.middlewareStack.use(Ort.getHttpSigningPlugin(this.config));
      }
      destroy() {
        super.destroy();
      }
    };
  });
  var a_e;
  var w2r = __lazy(() => {
    xY();
    a_e = class a_e extends ServiceException_export {
      constructor(e) {
        super(e);
        Object.setPrototypeOf(this, a_e.prototype);
      }
    };
  });
  var bSn;
  var SSn;
  var TSn;
  var ESn;
  var C2r = __lazy(() => {
    w2r();
    bSn = class bSn extends a_e {
      name = "InvalidRequestException";
      $fault = "client";
      constructor(e) {
        super({
          name: "InvalidRequestException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, bSn.prototype);
      }
    };
    SSn = class SSn extends a_e {
      name = "ResourceNotFoundException";
      $fault = "client";
      constructor(e) {
        super({
          name: "ResourceNotFoundException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, SSn.prototype);
      }
    };
    TSn = class TSn extends a_e {
      name = "TooManyRequestsException";
      $fault = "client";
      constructor(e) {
        super({
          name: "TooManyRequestsException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, TSn.prototype);
      }
    };
    ESn = class ESn extends a_e {
      name = "UnauthorizedException";
      $fault = "client";
      constructor(e) {
        super({
          name: "UnauthorizedException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, ESn.prototype);
      }
    };
  });
  var Drt;
  var vSn;
  var Qed;
  var Zed;
  var etd;
  var ttd;
  var ntd;
  var rtd;
  var otd;
  var std;
  var itd;
  var atd;
  var ltd;
  var ctd;
  var utd;
  var dtd;
  var ptd;
  var mtd;
  var htd;
  var gtd;
  var ytd;
  var SWs;
  var TWs;
  var EWs;
  var vWs;
  var zNt = __lazy(() => {
    C2r();
    w2r();
    Drt = __toESM(qT(), 1);
    vSn = [0, "com.amazonaws.sso", "AccessTokenType", 8, 0];
    Qed = [0, "com.amazonaws.sso", "SecretAccessKeyType", 8, 0];
    Zed = [0, "com.amazonaws.sso", "SessionTokenType", 8, 0];
    etd = [3, "com.amazonaws.sso", "AccountInfo", 0, ["accountId", "accountName", "emailAddress"], [0, 0, 0]];
    ttd = [3, "com.amazonaws.sso", "GetRoleCredentialsRequest", 0, ["roleName", "accountId", "accessToken"], [[0, {
      httpQuery: "role_name"
    }], [0, {
      httpQuery: "account_id"
    }], [() => vSn, {
      httpHeader: "x-amz-sso_bearer_token"
    }]]];
    ntd = [3, "com.amazonaws.sso", "GetRoleCredentialsResponse", 0, ["roleCredentials"], [[() => utd, 0]]];
    rtd = [-3, "com.amazonaws.sso", "InvalidRequestException", {
      error: "client",
      httpError: 400
    }, ["message"], [0]];
    Drt.TypeRegistry.for("com.amazonaws.sso").registerError(rtd, bSn);
    otd = [3, "com.amazonaws.sso", "ListAccountRolesRequest", 0, ["nextToken", "maxResults", "accessToken", "accountId"], [[0, {
      httpQuery: "next_token"
    }], [1, {
      httpQuery: "max_result"
    }], [() => vSn, {
      httpHeader: "x-amz-sso_bearer_token"
    }], [0, {
      httpQuery: "account_id"
    }]]];
    std = [3, "com.amazonaws.sso", "ListAccountRolesResponse", 0, ["nextToken", "roleList"], [0, () => ytd]];
    itd = [3, "com.amazonaws.sso", "ListAccountsRequest", 0, ["nextToken", "maxResults", "accessToken"], [[0, {
      httpQuery: "next_token"
    }], [1, {
      httpQuery: "max_result"
    }], [() => vSn, {
      httpHeader: "x-amz-sso_bearer_token"
    }]]];
    atd = [3, "com.amazonaws.sso", "ListAccountsResponse", 0, ["nextToken", "accountList"], [0, () => gtd]];
    ltd = [3, "com.amazonaws.sso", "LogoutRequest", 0, ["accessToken"], [[() => vSn, {
      httpHeader: "x-amz-sso_bearer_token"
    }]]];
    ctd = [-3, "com.amazonaws.sso", "ResourceNotFoundException", {
      error: "client",
      httpError: 404
    }, ["message"], [0]];
    Drt.TypeRegistry.for("com.amazonaws.sso").registerError(ctd, SSn);
    utd = [3, "com.amazonaws.sso", "RoleCredentials", 0, ["accessKeyId", "secretAccessKey", "sessionToken", "expiration"], [0, [() => Qed, 0], [() => Zed, 0], 1]];
    dtd = [3, "com.amazonaws.sso", "RoleInfo", 0, ["roleName", "accountId"], [0, 0]];
    ptd = [-3, "com.amazonaws.sso", "TooManyRequestsException", {
      error: "client",
      httpError: 429
    }, ["message"], [0]];
    Drt.TypeRegistry.for("com.amazonaws.sso").registerError(ptd, TSn);
    mtd = [-3, "com.amazonaws.sso", "UnauthorizedException", {
      error: "client",
      httpError: 401
    }, ["message"], [0]];
    Drt.TypeRegistry.for("com.amazonaws.sso").registerError(mtd, ESn);
    htd = [-3, "smithy.ts.sdk.synthetic.com.amazonaws.sso", "SSOServiceException", 0, [], []];
    Drt.TypeRegistry.for("smithy.ts.sdk.synthetic.com.amazonaws.sso").registerError(htd, a_e);
    gtd = [1, "com.amazonaws.sso", "AccountListType", 0, () => etd];
    ytd = [1, "com.amazonaws.sso", "RoleListType", 0, () => dtd];
    SWs = [9, "com.amazonaws.sso", "GetRoleCredentials", {
      http: ["GET", "/federation/credentials", 200]
    }, () => ttd, () => ntd];
    TWs = [9, "com.amazonaws.sso", "ListAccountRoles", {
      http: ["GET", "/assignment/roles", 200]
    }, () => otd, () => std];
    EWs = [9, "com.amazonaws.sso", "ListAccounts", {
      http: ["GET", "/assignment/accounts", 200]
    }, () => itd, () => atd];
    vWs = [9, "com.amazonaws.sso", "Logout", {
      http: ["POST", "/logout", 200]
    }, () => ltd, () => "unit"];
  });
  var wWs;
  var GetRoleCredentialsCommand;
  var R2r = __lazy(() => {
    xY();
    Irt();
    zNt();
    wWs = __toESM(_o(), 1);
    GetRoleCredentialsCommand = class KNt extends Command_export.classBuilder().ep(RAe).m(function (e, t, n, r) {
      return [wWs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("SWBPortalService", "GetRoleCredentials", {}).n("SSOClient", "GetRoleCredentialsCommand").sc(SWs).build() {};
  });
  var CWs;
  var YNt;
  var wSn = __lazy(() => {
    xY();
    Irt();
    zNt();
    CWs = __toESM(_o(), 1);
    YNt = class YNt extends Command_export.classBuilder().ep(RAe).m(function (e, t, n, r) {
      return [CWs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("SWBPortalService", "ListAccountRoles", {}).n("SSOClient", "ListAccountRolesCommand").sc(TWs).build() {};
  });
  var RWs;
  var JNt;
  var CSn = __lazy(() => {
    xY();
    Irt();
    zNt();
    RWs = __toESM(_o(), 1);
    JNt = class JNt extends Command_export.classBuilder().ep(RAe).m(function (e, t, n, r) {
      return [RWs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("SWBPortalService", "ListAccounts", {}).n("SSOClient", "ListAccountsCommand").sc(EWs).build() {};
  });
  var xWs;
  var x2r;
  var k2r = __lazy(() => {
    xY();
    Irt();
    zNt();
    xWs = __toESM(_o(), 1);
    x2r = class x2r extends Command_export.classBuilder().ep(RAe).m(function (e, t, n, r) {
      return [xWs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("SWBPortalService", "Logout", {}).n("SSOClient", "LogoutCommand").sc(vWs).build() {};
  });
  var _td;
  var kWs;
  var AWs = __lazy(() => {
    xY();
    R2r();
    wSn();
    CSn();
    k2r();
    VNt();
    _td = {
      GetRoleCredentialsCommand: GetRoleCredentialsCommand,
      ListAccountRolesCommand: YNt,
      ListAccountsCommand: JNt,
      LogoutCommand: x2r
    };
    kWs = class kWs extends SSOClient {};
    createAggregatedClient_export(_td, kWs);
  });
  var IWs = __lazy(() => {
    R2r();
    wSn();
    CSn();
    k2r();
  });
  var PWs = () => {};
  var OWs;
  var s$h;
  var DWs = __lazy(() => {
    wSn();
    VNt();
    OWs = __toESM(Od(), 1);
    s$h = OWs.createPaginator(SSOClient, YNt, "nextToken", "nextToken", "maxResults");
  });
  var MWs;
  var c$h;
  var NWs = __lazy(() => {
    CSn();
    VNt();
    MWs = __toESM(Od(), 1);
    c$h = MWs.createPaginator(SSOClient, JNt, "nextToken", "nextToken", "maxResults");
  });
  var LWs = __lazy(() => {
    PWs();
    DWs();
    NWs();
  });
  var FWs = __lazy(() => {
    VNt();
    AWs();
    IWs();
    LWs();
    C2r();
  });
  var UWs = {};