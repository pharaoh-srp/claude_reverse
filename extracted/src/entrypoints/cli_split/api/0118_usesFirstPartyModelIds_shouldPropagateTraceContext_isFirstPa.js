  __export(_k, {
    withBaseException: () => withBaseException_export2,
    throwDefaultError: () => throwDefaultError_export2,
    take: () => take_export2,
    serializeFloat: () => serializeFloat_export2,
    serializeDateTime: () => serializeDateTime_export2,
    resolvedPath: () => V8s.resolvedPath,
    resolveDefaultRuntimeConfig: () => resolveDefaultRuntimeConfig_export2,
    map: () => map_export4,
    loadConfigsForDefaultMode: () => loadConfigsForDefaultMode_export2,
    isSerializableHeaderValue: () => isSerializableHeaderValue_export2,
    getValueFromTextNode: () => getValueFromTextNode_export2,
    getDefaultExtensionConfiguration: () => getDefaultExtensionConfiguration_export2,
    getDefaultExtensionConfiguration: () => getDefaultExtensionConfiguration_export2,
    getArrayIfSingleItem: () => getArrayIfSingleItem_export2,
    extendedEncodeURIComponent: () => M8s.extendedEncodeURIComponent,
    emitWarningIfUnsupportedVersion: () => emitWarningIfUnsupportedVersion_export2,
    decorateServiceException: () => decorateServiceException_export2,
    createAggregatedClient: () => createAggregatedClient_export2,
    convertMap: () => convertMap_export2,
    collectBody: () => l6s.collectBody,
    _json: () => _json_export2,
    ServiceException: () => ServiceException_export2,
    SENSITIVE_STRING: () => "***SensitiveInformation***",
    NoOpLogger: () => NoOpLogger_export2,
    Command: () => Command_export2,
    Client: () => Client_export2
  });
  var ni = __lazy(() => {
    a6s();
    c6s();
    I8s();
    O8s();
    L$r();
    N8s();
    j8s();
    z8s();
    __reExport(_k, __toESM(yW(), 1), module.exports);
  });
  function usd(e) {
    return {
      schemeId: "aws.auth#sigv4",
      signingProperties: {
        name: "bedrock",
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
  function dsd(e) {
    return {
      schemeId: "smithy.api#httpBearerAuth",
      propertiesExtractor: ({
        profile: t,
        filepath: n,
        configFilepath: r,
        ignoreCache: o
      }, s) => ({
        identityProperties: {
          profile: t,
          filepath: n,
          configFilepath: r,
          ignoreCache: o
        }
      })
    };
  }
  var K8s;
  var Krt;
  var i1t;
  var Y8s = async (e, t, n) => ({
    operation: i1t.getSmithyContext(t).operation,
    region: (await i1t.normalizeProvider(e.region)()) || (() => {
      throw Error("expected `region` to be configured for `aws.auth#sigv4`");
    })()
  });
  var J8s = e => {
    let t = [];
    switch (e.operation) {
      default:
        t.push(usd(e));
        t.push(dsd(e));
    }
    return t;
  };
  var X8s = e => {
    let t = Krt.memoizeIdentityProvider(e.token, Krt.isIdentityExpired, Krt.doesIdentityRequireRefresh);
    let n = K8s.resolveAwsSdkSigV4Config(e);
    return Object.assign(n, {
      authSchemePreference: i1t.normalizeProvider(e.authSchemePreference ?? []),
      token: t
    });
  };
  var H$r = __lazy(() => {
    K8s = __toESM(nw(), 1);
    Krt = __toESM(Od(), 1);
    i1t = __toESM(zB(), 1);
  });
  var Q8s = e => Object.assign(e, {
    useDualstackEndpoint: e.useDualstackEndpoint ?? false,
    useFipsEndpoint: e.useFipsEndpoint ?? false,
    defaultSigningName: "bedrock"
  });
  var Mr;
  var vi = __lazy(() => {
    Mr = {
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
  var eVs;
  var Z8s = __lazy(() => {
    eVs = {
      name: "@aws-sdk/client-bedrock",
      description: "AWS SDK for JavaScript Bedrock Client for Node.js, Browser and React Native",
      version: "3.936.0",
      scripts: {
        build: "concurrently 'yarn:build:cjs' 'yarn:build:es' 'yarn:build:types'",
        "build:cjs": "node ../../scripts/compilation/inline client-bedrock",
        "build:es": "tsc -p tsconfig.es.json",
        "build:include:deps": "lerna run --scope $npm_package_name --include-dependencies build",
        "build:types": "tsc -p tsconfig.types.json",
        "build:types:downlevel": "downlevel-dts dist-types dist-types/ts3.4",
        clean: "rimraf ./dist-* && rimraf *.tsbuildinfo",
        "extract:docs": "api-extractor run --local",
        "generate:client": "node ../../scripts/generate-clients/single-service --solo bedrock"
      },
      main: "./dist-cjs/index.js",
      types: "./dist-types/index.d.ts",
      module: "./dist-es/index.js",
      sideEffects: false,
      dependencies: {
        "@aws-crypto/sha256-browser": "5.2.0",
        "@aws-crypto/sha256-js": "5.2.0",
        "@aws-sdk/core": "3.936.0",
        "@aws-sdk/credential-provider-node": "3.936.0",
        "@aws-sdk/middleware-host-header": "3.936.0",
        "@aws-sdk/middleware-logger": "3.936.0",
        "@aws-sdk/middleware-recursion-detection": "3.936.0",
        "@aws-sdk/middleware-user-agent": "3.936.0",
        "@aws-sdk/region-config-resolver": "3.936.0",
        "@aws-sdk/token-providers": "3.936.0",
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
      homepage: "https://github.com/aws/aws-sdk-js-v3/tree/main/clients/client-bedrock",
      repository: {
        type: "git",
        url: "https://github.com/aws/aws-sdk-js-v3.git",
        directory: "clients/client-bedrock"
      }
    };
  });
  var tVs = e => typeof ArrayBuffer === "function" && e instanceof ArrayBuffer || Object.prototype.toString.call(e) === "[object ArrayBuffer]";
  var cTn;
  var nVs = (e, t = 0, n = e.byteLength - t) => {
    if (!tVs(e)) {
      throw TypeError(`The "input" argument must be ArrayBuffer. Received type ${typeof e} (${e})`);
    }
    return cTn.Buffer.from(e, t, n);
  };
  var rVs = (e, t) => {
    if (typeof e !== "string") {
      throw TypeError(`The "input" argument must be of type string. Received type ${typeof e} (${e})`);
    }
    return t ? cTn.Buffer.from(e, t) : cTn.Buffer.from(e);
  };
  var j$r = __lazy(() => {
    cTn = require("buffer");
  });
  var msd;
  var oVs = e => {
    if (e.length * 3 % 4 !== 0) {
      throw TypeError("Incorrect padding on base64 string.");
    }
    if (!msd.exec(e)) {
      throw TypeError("Invalid base64 string.");
    }
    let t = rVs(e, "base64");
    return new Uint8Array(t.buffer, t.byteOffset, t.byteLength);
  };
  var sVs = __lazy(() => {
    j$r();
    msd = /^[A-Za-z0-9+/]*={0,2}$/;
  });
  var iVs;
  var aVs = e => {
    let t;
    if (typeof e === "string") {
      t = iVs.fromUtf8(e);
    } else {
      t = e;
    }
    if (typeof t !== "object" || typeof t.byteOffset !== "number" || typeof t.byteLength !== "number") {
      throw Error("@smithy/util-base64: toBase64 encoder function only accepts string | Uint8Array.");
    }
    return nVs(t.buffer, t.byteOffset, t.byteLength).toString("base64");
  };
  var lVs = __lazy(() => {
    j$r();
    iVs = __toESM(jT(), 1);
  });
  var cVs = __lazy(() => {
    sVs();
    lVs();
  });
  var uVs;
  var dVs;
  var pVs;
  var _Vs;
  var bVs;
  var Lle;
  var mVs;
  var fVs;
  var hVs;
  var gVs;
  var yVs;
  var fsd;
  var EVs;
  var Yrt;
  var hsd;
  var vVs = (e, t = {}) => hsd.get(e, () => Yrt.resolveEndpoint(fsd, {
    endpointParams: e,
    logger: t.logger
  }));
  var wVs = __lazy(() => {
    EVs = __toESM(Ale(), 1);
    Yrt = __toESM(Lte(), 1);
    hsd = new Yrt.EndpointCache({
      size: 50,
      params: ["Endpoint", "Region", "UseDualStack", "UseFIPS"]
    });
    Yrt.customEndpointFunctions.aws = EVs.awsEndpointFunctions;
  });
  var CVs;
  var RVs;
  var xVs;
  var kVs;
  var uTn;
  var AVs = e => ({
    apiVersion: "2023-04-20",
    base64Decoder: e?.base64Decoder ?? oVs,
    base64Encoder: e?.base64Encoder ?? aVs,
    disableHostPrefix: e?.disableHostPrefix ?? false,
    endpointProvider: e?.endpointProvider ?? vVs,
    extensions: e?.extensions ?? [],
    httpAuthSchemeProvider: e?.httpAuthSchemeProvider ?? J8s,
    httpAuthSchemes: e?.httpAuthSchemes ?? [{
      schemeId: "aws.auth#sigv4",
      identityProvider: t => t.getIdentityProvider("aws.auth#sigv4"),
      signer: new CVs.AwsSdkSigV4Signer()
    }, {
      schemeId: "smithy.api#httpBearerAuth",
      identityProvider: t => t.getIdentityProvider("smithy.api#httpBearerAuth"),
      signer: new xVs.HttpBearerAuthSigner()
    }],
    logger: e?.logger ?? new NoOpLogger_export2(),
    protocol: e?.protocol ?? new RVs.AwsRestJsonProtocol({
      defaultNamespace: "com.amazonaws.bedrock"
    }),
    serviceId: e?.serviceId ?? "Bedrock",
    urlParser: e?.urlParser ?? kVs.parseUrl,
    utf8Decoder: e?.utf8Decoder ?? uTn.fromUtf8,
    utf8Encoder: e?.utf8Encoder ?? uTn.toUtf8
  });
  var IVs = __lazy(() => {
    ni();
    cVs();
    H$r();
    wVs();
    CVs = __toESM(nw(), 1);
    RVs = __toESM(r_e(), 1);
    xVs = __toESM(Od(), 1);
    kVs = __toESM(bY(), 1);
    uTn = __toESM(jT(), 1);
  });
  var Jrt;
  var dTn;
  var jAe;
  var PVs;
  var OVs;
  var pTn;
  var HAe;
  var mTn;
  var DVs;
  var MVs;
  var NVs;
  var LVs = e => {
    emitWarningIfUnsupportedVersion_export2(process.version);
    let t = NVs.resolveDefaultsModeConfig(e);
    let n = () => t().then(loadConfigsForDefaultMode_export2);
    let r = AVs(e);
    Jrt.emitWarningIfUnsupportedVersion(process.version);
    let o = {
      profile: e?.profile,
      logger: r.logger,
      signingName: "bedrock"
    };
    return {
      ...r,
      ...e,
      runtime: "node",
      defaultsMode: t,
      authSchemePreference: e?.authSchemePreference ?? HAe.loadConfig(Jrt.NODE_AUTH_SCHEME_PREFERENCE_OPTIONS, o),
      bodyLengthChecker: e?.bodyLengthChecker ?? DVs.calculateBodyLength,
      credentialDefaultProvider: e?.credentialDefaultProvider ?? defaultProvider,
      defaultUserAgentProvider: e?.defaultUserAgentProvider ?? dTn.createDefaultUserAgentProvider({
        serviceId: r.serviceId,
        clientVersion: eVs.version
      }),
      httpAuthSchemes: e?.httpAuthSchemes ?? [{
        schemeId: "aws.auth#sigv4",
        identityProvider: s => s.getIdentityProvider("aws.auth#sigv4"),
        signer: new Jrt.AwsSdkSigV4Signer()
      }, {
        schemeId: "smithy.api#httpBearerAuth",
        identityProvider: s => s.getIdentityProvider("smithy.api#httpBearerAuth") || (async i => {
          try {
            return await ubn({
              signingName: "bedrock"
            })();
          } catch (a) {
            return await nSn(i)(i);
          }
        }),
        signer: new PVs.HttpBearerAuthSigner()
      }],
      maxAttempts: e?.maxAttempts ?? HAe.loadConfig(pTn.NODE_MAX_ATTEMPT_CONFIG_OPTIONS, e),
      region: e?.region ?? HAe.loadConfig(jAe.NODE_REGION_CONFIG_OPTIONS, {
        ...jAe.NODE_REGION_CONFIG_FILE_OPTIONS,
        ...o
      }),
      requestHandler: mTn.NodeHttpHandler.create(e?.requestHandler ?? n),
      retryMode: e?.retryMode ?? HAe.loadConfig({
        ...pTn.NODE_RETRY_MODE_CONFIG_OPTIONS,
        default: async () => (await n()).retryMode || MVs.DEFAULT_RETRY_MODE
      }, e),
      sha256: e?.sha256 ?? OVs.Hash.bind(null, "sha256"),
      streamCollector: e?.streamCollector ?? mTn.streamCollector,
      useDualstackEndpoint: e?.useDualstackEndpoint ?? HAe.loadConfig(jAe.NODE_USE_DUALSTACK_ENDPOINT_CONFIG_OPTIONS, o),
      useFipsEndpoint: e?.useFipsEndpoint ?? HAe.loadConfig(jAe.NODE_USE_FIPS_ENDPOINT_CONFIG_OPTIONS, o),
      userAgentAppId: e?.userAgentAppId ?? HAe.loadConfig(dTn.NODE_APP_ID_CONFIG_OPTIONS, o)
    };
  };
  var FVs = __lazy(() => {
    Z8s();
    Xje();
    rSn();
    IVs();
    ni();
    ni();
    Jrt = __toESM(nw(), 1);
    dTn = __toESM(Zye(), 1);
    jAe = __toESM(HA(), 1);
    PVs = __toESM(Od(), 1);
    OVs = __toESM(e_e(), 1);
    pTn = __toESM(yF(), 1);
    HAe = __toESM(VB(), 1);
    mTn = __toESM(hW(), 1);
    DVs = __toESM(t_e(), 1);
    MVs = __toESM(Ole(), 1);
    NVs = __toESM(s_e(), 1);
  });
  var UVs = e => ({
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
  var BVs = e => ({
    httpHandler: e.httpHandler()
  });
  var $Vs = () => {};
  var HVs = () => {};
  var jVs = () => {};
  var qVs = () => {};
  var WVs = __lazy(() => {
    $Vs();
    HVs();
    jVs();
    qVs();
  });
  var GVs = e => {
    let {
      httpAuthSchemes: t,
      httpAuthSchemeProvider: n,
      credentials: r,
      token: o
    } = e;
    return {
      setHttpAuthScheme(s) {
        let i = t.findIndex(a => a.schemeId === s.schemeId);
        if (i === -1) {
          t.push(s);
        } else {
          t.splice(i, 1, s);
        }
      },
      httpAuthSchemes() {
        return t;
      },
      setHttpAuthSchemeProvider(s) {
        n = s;
      },
      httpAuthSchemeProvider() {
        return n;
      },
      setCredentials(s) {
        r = s;
      },
      credentials() {
        return r;
      },
      setToken(s) {
        o = s;
      },
      token() {
        return o;
      }
    };
  };
  var VVs = e => ({
    httpAuthSchemes: e.httpAuthSchemes(),
    httpAuthSchemeProvider: e.httpAuthSchemeProvider(),
    credentials: e.credentials(),
    token: e.token()
  });
  var fTn;
  var zVs = (e, t) => {
    let n = Object.assign(fTn.getAwsRegionExtensionConfiguration(e), getDefaultExtensionConfiguration_export2(e), UVs(e), GVs(e));
    t.forEach(r => r.configure(n));
    return Object.assign(e, fTn.resolveAwsRegionExtensionConfiguration(n), resolveDefaultRuntimeConfig_export2(n), BVs(n), VVs(n));
  };
  var KVs = __lazy(() => {
    WVs();
    ni();
    fTn = __toESM(Xte(), 1);
  });
  var hTn;
  var YVs;
  var JVs;
  var gTn;
  var XVs;
  var Xrt;
  var QVs;
  var ZVs;
  var ezs;
  var yTn;
  var BedrockClient;
  var $P = __lazy(() => {
    ni();
    H$r();
    vi();
    FVs();
    KVs();
    hTn = __toESM(qye(), 1);
    YVs = __toESM(Wye(), 1);
    JVs = __toESM(Gye(), 1);
    gTn = __toESM(Ple(), 1);
    XVs = __toESM(HA(), 1);
    Xrt = __toESM(Od(), 1);
    QVs = __toESM(qT(), 1);
    ZVs = __toESM(Xye(), 1);
    ezs = __toESM(_o(), 1);
    yTn = __toESM(yF(), 1);
    BedrockClient = class gh extends Client_export2 {
      config;
      constructor(...[e]) {
        let t = LVs(e || {});
        super(t);
        this.initConfig = t;
        let n = Q8s(t);
        let r = gTn.resolveUserAgentConfig(n);
        let o = yTn.resolveRetryConfig(r);
        let s = XVs.resolveRegionConfig(o);
        let i = hTn.resolveHostHeaderConfig(s);
        let a = ezs.resolveEndpointConfig(i);
        let l = X8s(a);
        let c = zVs(l, e?.extensions || []);
        this.config = c;
        this.middlewareStack.use(QVs.getSchemaSerdePlugin(this.config));
        this.middlewareStack.use(gTn.getUserAgentPlugin(this.config));
        this.middlewareStack.use(yTn.getRetryPlugin(this.config));
        this.middlewareStack.use(ZVs.getContentLengthPlugin(this.config));
        this.middlewareStack.use(hTn.getHostHeaderPlugin(this.config));
        this.middlewareStack.use(YVs.getLoggerPlugin(this.config));
        this.middlewareStack.use(JVs.getRecursionDetectionPlugin(this.config));
        this.middlewareStack.use(Xrt.getHttpAuthSchemeEndpointRuleSetPlugin(this.config, {
          httpAuthSchemeParametersProvider: Y8s,
          identityProviderConfigProvider: async u => new Xrt.DefaultIdentityProviderConfig({
            "aws.auth#sigv4": u.credentials,
            "smithy.api#httpBearerAuth": u.token
          })
        }));
        this.middlewareStack.use(Xrt.getHttpSigningPlugin(this.config));
      }
      destroy() {
        super.destroy();
      }
    };
  });
  var BedrockServiceException;
  var _Tn = __lazy(() => {
    ni();
    BedrockServiceException = class TF extends ServiceException_export2 {
      constructor(e) {
        super(e);
        Object.setPrototypeOf(this, TF.prototype);
      }
    };
  });
  var AccessDeniedException;
  var InternalServerException;
  var ResourceNotFoundException;
  var ThrottlingException;
  var ValidationException;
  var ConflictException;
  var ServiceQuotaExceededException;
  var TooManyTagsException;
  var ResourceInUseException;
  var ServiceUnavailableException;
  var q$r = __lazy(() => {
    _Tn();
    AccessDeniedException = class a1t extends BedrockServiceException {
      name = "AccessDeniedException";
      $fault = "client";
      constructor(e) {
        super({
          name: "AccessDeniedException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, a1t.prototype);
      }
    };
    InternalServerException = class l1t extends BedrockServiceException {
      name = "InternalServerException";
      $fault = "server";
      constructor(e) {
        super({
          name: "InternalServerException",
          $fault: "server",
          ...e
        });
        Object.setPrototypeOf(this, l1t.prototype);
      }
    };
    ResourceNotFoundException = class c1t extends BedrockServiceException {
      name = "ResourceNotFoundException";
      $fault = "client";
      constructor(e) {
        super({
          name: "ResourceNotFoundException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, c1t.prototype);
      }
    };
    ThrottlingException = class u1t extends BedrockServiceException {
      name = "ThrottlingException";
      $fault = "client";
      constructor(e) {
        super({
          name: "ThrottlingException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, u1t.prototype);
      }
    };
    ValidationException = class d1t extends BedrockServiceException {
      name = "ValidationException";
      $fault = "client";
      constructor(e) {
        super({
          name: "ValidationException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, d1t.prototype);
      }
    };
    ConflictException = class p1t extends BedrockServiceException {
      name = "ConflictException";
      $fault = "client";
      constructor(e) {
        super({
          name: "ConflictException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, p1t.prototype);
      }
    };
    ServiceQuotaExceededException = class m1t extends BedrockServiceException {
      name = "ServiceQuotaExceededException";
      $fault = "client";
      constructor(e) {
        super({
          name: "ServiceQuotaExceededException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, m1t.prototype);
      }
    };
    TooManyTagsException = class f1t extends BedrockServiceException {
      name = "TooManyTagsException";
      $fault = "client";
      resourceName;
      constructor(e) {
        super({
          name: "TooManyTagsException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, f1t.prototype);
        this.resourceName = e.resourceName;
      }
    };
    ResourceInUseException = class h1t extends BedrockServiceException {
      name = "ResourceInUseException";
      $fault = "client";
      constructor(e) {
        super({
          name: "ResourceInUseException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, h1t.prototype);
      }
    };
    ServiceUnavailableException = class g1t extends BedrockServiceException {
      name = "ServiceUnavailableException";
      $fault = "server";
      constructor(e) {
        super({
          name: "ServiceUnavailableException",
          $fault: "server",
          ...e
        });
        Object.setPrototypeOf(this, g1t.prototype);
      }
    };
  });
  var PY;
  var gsd;
  var szs;
  var izs;
  var ysd;
  var _sd;
  var bsd;
  var azs;
  var lzs;
  var Ssd;
  var W$r;
  var G$r;
  var Fle;
  var V$r;
  var z$r;
  var eqe;
  var Zrt;
  var WAe;
  var Tsd;
  var czs;
  var wTn;
  var CTn;
  var Esd;
  var vsd;
  var uzs;
  var _1t;
  var wsd;
  var dzs;
  var Csd;
  var Qrt;
  var bTn;
  var pzs;
  var mzs;
  var b1t;
  var Rsd;
  var xsd;
  var RTn;
  var ksd;
  var STn;
  var fzs;
  var Asd;
  var hzs;
  var gzs;
  var qAe;
  var Isd;
  var Psd;
  var K$r;
  var yzs;
  var Osd;
  var Y$r;
  var Dsd;
  var Msd;
  var Nsd;
  var Lsd;
  var Fsd;
  var Usd;
  var Bsd;
  var $sd;
  var xTn;
  var Hsd;
  var jsd;
  var qsd;
  var TTn;
  var Wsd;
  var S1t;
  var Gsd;
  var Vsd;
  var zsd;
  var Ksd;
  var Ysd;
  var Jsd;
  var Xsd;
  var Qsd;
  var Zsd;
  var eid;
  var tid;
  var nid;
  var rid;
  var oid;
  var sid;
  var iid;
  var aid;
  var lid;
  var cid;
  var uid;
  var T1t;
  var did;
  var kTn;
  var ATn;
  var pid;
  var mid;
  var ITn;
  var fid;
  var hid;
  var gid;
  var yid;
  var _id;
  var bid;
  var Sid;
  var Tid;
  var Eid;
  var vid;
  var wid;
  var Cid;
  var Rid;
  var xid;
  var J$r;
  var _zs;
  var kid;
  var Aid;
  var Iid;
  var Pid;
  var Oid;
  var Did;
  var Mid;
  var Nid;
  var Lid;
  var Fid;
  var Uid;
  var Bid;
  var $id;
  var Hid;
  var jid;
  var qid;
  var Wid;
  var Gid;
  var Vid;
  var zid;
  var Kid;
  var Yid;
  var Jid;
  var Xid;
  var Qid;
  var Zid;
  var ead;
  var tad;
  var nad;
  var rad;
  var oad;
  var sad;
  var iad;
  var aad;
  var lad;
  var cad;
  var uad;
  var dad;
  var pad;
  var mad;
  var fad;
  var had;
  var gad;
  var yad;
  var _ad;
  var bad;
  var Sad;
  var Tad;
  var Ead;
  var vad;
  var wad;
  var Cad;
  var Rad;
  var xad;
  var kad;
  var Aad;
  var Iad;
  var Pad;
  var Oad;
  var Dad;
  var Mad;
  var Nad;
  var Lad;
  var Fad;
  var Uad;
  var Bad;
  var $ad;
  var Had;
  var jad;
  var qad;
  var Wad;
  var Gad;
  var Vad;
  var zad;
  var Kad;
  var Yad;
  var Jad;
  var Xad;
  var Qad;
  var Zad;
  var eld;
  var tld;
  var nld;
  var rld;
  var old;
  var sld;
  var ild;
  var ald;
  var lld;
  var cld;
  var uld;
  var dld;
  var pld;
  var mld;
  var fld;
  var bzs;
  var hld;
  var gld;
  var yld;
  var _ld;
  var bld;
  var Sld;
  var Tld;
  var Eld;
  var vld;
  var wld;
  var Cld;
  var rne;
  var Rld;
  var Szs;
  var xld;
  var kld;
  var Ald;
  var Ild;
  var Pld;
  var Old;
  var Dld;
  var Mld;
  var Nld;
  var Lld;
  var Fld;
  var Uld;
  var Bld;
  var $ld;
  var Hld;
  var jld;
  var qld;
  var Wld;
  var Gld;
  var Vld;
  var zld;
  var Kld;
  var Yld;
  var Jld;
  var Xld;
  var Qld;
  var Zld;
  var ecd;
  var tcd;
  var ncd;
  var rcd;
  var ocd;
  var scd;
  var icd;
  var acd;
  var lcd;
  var ccd;
  var ucd;
  var dcd;
  var pcd;
  var mcd;
  var fcd;
  var hcd;
  var gcd;
  var ycd;
  var _cd;
  var bcd;
  var Scd;
  var Tcd;
  var Ecd;
  var vcd;
  var Tzs;
  var Ezs;
  var wcd;
  var Ccd;
  var Rcd;
  var xcd;
  var kcd;
  var vzs;
  var Acd;
  var Icd;
  var Pcd;
  var wzs;
  var Czs;
  var Rzs;
  var Ocd;
  var Dcd;
  var Mcd;
  var Ncd;
  var Lcd;
  var Fcd;
  var Ucd;
  var xzs;
  var Bcd;
  var $cd;
  var Hcd;
  var jcd;
  var kzs;
  var qcd;
  var Wcd;
  var Gcd;
  var Vcd;
  var zcd;
  var Azs;
  var Kcd;
  var Ycd;
  var Jcd;
  var Xcd;
  var Qcd;
  var Zcd;
  var eud;
  var tud;
  var nud;
  var Izs;
  var Pzs;
  var rud;
  var oud;
  var sud;
  var iud;
  var aud;
  var lud;
  var cud;
  var uud;
  var dud;
  var pud;
  var mud;
  var fud;
  var hud;
  var gud;
  var yud;
  var _ud;
  var bud;
  var Sud;
  var Tud;
  var Eud;
  var vud;
  var wud;
  var Cud;
  var Rud;
  var xud;
  var kud;
  var Aud;
  var Iud;
  var Pud;
  var Oud;
  var Dud;
  var Mud;
  var Nud;
  var Lud;
  var Fud;
  var Uud;
  var Bud;
  var $ud;
  var Hud;
  var jud;
  var qud;
  var Wud;
  var Gud;
  var Ozs;
  var PTn;
  var Vud;
  var zud;
  var Kud;
  var Yud;
  var Jud;
  var Xud;
  var Qud;
  var Zud;
  var edd;
  var tdd;
  var ndd;
  var X$r;
  var rdd;
  var odd;
  var sdd;
  var OTn;
  var Dzs;
  var idd;
  var add;
  var ldd;
  var cdd;
  var udd;
  var ddd;
  var pdd;
  var mdd;
  var fdd;
  var hdd;
  var gdd;
  var ydd;
  var _dd;
  var bdd;
  var Q$r;
  var Mzs;
  var Sdd;
  var Tdd;
  var Edd;
  var vdd;
  var wdd;
  var Cdd;
  var Rdd;
  var xdd;
  var kdd;
  var Nzs;
  var Add;
  var Idd;
  var Pdd;
  var Odd;
  var Ddd;
  var Mdd;
  var Ndd;
  var Ldd;
  var Fdd;
  var Udd;
  var Bdd;
  var $dd;
  var Hdd;
  var jdd;
  var qdd;
  var Z$r;
  var Wdd;
  var Lzs;
  var Gdd;
  var Vdd;
  var zdd;
  var Kdd;
  var Ydd;
  var Jdd;
  var Xdd;
  var Qdd;
  var Zdd;
  var epd;
  var tpd;
  var npd;
  var rpd;
  var opd;
  var eHr;
  var spd;
  var ipd;
  var apd;
  var lpd;
  var cpd;
  var upd;
  var dpd;
  var ppd;
  var GAe;
  var mpd;
  var fpd;
  var hpd;
  var gpd;
  var tzs;
  var tHr;
  var ypd;
  var _pd;
  var y1t;
  var nHr;
  var bpd;
  var Spd;
  var Tpd;
  var Epd;
  var vpd;
  var wpd;
  var Cpd;
  var Rpd;
  var Fzs;
  var xpd;
  var kpd;
  var Uzs;
  var Apd;
  var Ipd;
  var Ppd;
  var Opd;
  var Dpd;
  var Mpd;
  var Npd;
  var Lpd;
  var Fpd;
  var Upd;
  var Bpd;
  var $pd;
  var Bzs;
  var Hpd;
  var jpd;
  var qpd;
  var Wpd;
  var Gpd;
  var nzs;
  var Vpd;
  var zpd;
  var Kpd;
  var Ypd;
  var Jpd;
  var Xpd;
  var Qpd;
  var Zpd;
  var ETn;
  var emd;
  var tmd;
  var nmd;
  var rmd;
  var omd;
  var smd;
  var $zs;
  var imd;
  var amd;
  var lmd;
  var cmd;
  var umd;
  var dmd;
  var Hzs;
  var pmd;
  var mmd;
  var fmd;
  var hmd;
  var gmd;
  var ymd;
  var _md;
  var bmd;
  var Smd;
  var rHr;
  var Tmd;
  var Emd;
  var vmd;
  var wmd;
  var rzs;
  var ozs;
  var HP;
  var jzs;
  var Cmd;
  var vTn;
  var Rmd;
  var xmd;
  var qzs;
  var kmd;
  var Amd;
  var Imd;
  var Pmd;
  var Omd;
  var Dmd;
  var oHr;
  var sHr;
  var Wzs;
  var Mmd;
  var Gzs;
  var Nmd;
  var Lmd;
  var Fmd;
  var Umd;
  var Bmd;
  var $md;
  var DTn;
  var iHr;
  var aHr;
  var Hmd;
  var jmd;
  var qmd;
  var Wmd;
  var Vzs;
  var zzs;
  var Kzs;
  var Yzs;
  var Jzs;
  var Xzs;
  var Qzs;
  var Zzs;
  var eKs;
  var tKs;
  var nKs;
  var rKs;
  var oKs;
  var sKs;
  var iKs;
  var aKs;
  var lKs;
  var cKs;
  var uKs;
  var dKs;
  var pKs;
  var mKs;
  var fKs;
  var hKs;
  var gKs;
  var yKs;
  var _Ks;
  var bKs;
  var SKs;
  var TKs;
  var EKs;
  var vKs;
  var wKs;
  var CKs;
  var RKs;
  var xKs;
  var kKs;
  var AKs;
  var IKs;
  var PKs;
  var OKs;
  var DKs;
  var MKs;
  var NKs;
  var LKs;
  var FKs;
  var UKs;
  var BKs;
  var $Ks;
  var HKs;
  var jKs;
  var qKs;
  var WKs;
  var GKs;
  var VKs;
  var zKs;
  var KKs;
  var YKs;
  var JKs;
  var XKs;
  var QKs;
  var ZKs;
  var e7s;
  var t7s;
  var n7s;
  var r7s;
  var o7s;
  var s7s;
  var i7s;
  var a7s;
  var l7s;
  var c7s;
  var u7s;
  var d7s;
  var p7s;
  var m7s;
  var f7s;
  var h7s;
  var g7s;
  var y7s;
  var _7s;
  var b7s;
  var S7s;
  var T7s;
  var E7s;
  var v7s;
  var w7s;
  var C7s;
  var R7s;
  var x7s;
  var k7s;
  var A7s;
  var I7s;
  var P7s;
  var O7s;
  var xi = __lazy(() => {
    _Tn();
    q$r();
    PY = __toESM(qT(), 1);
    gsd = [0, "com.amazonaws.bedrock", "AutomatedReasoningLogicStatementContent", 8, 0];
    szs = [0, "com.amazonaws.bedrock", "AutomatedReasoningNaturalLanguageStatementContent", 8, 0];
    izs = [0, "com.amazonaws.bedrock", "AutomatedReasoningPolicyAnnotationFeedbackNaturalLanguage", 8, 0];
    ysd = [0, "com.amazonaws.bedrock", "AutomatedReasoningPolicyAnnotationIngestContent", 8, 0];
    _sd = [0, "com.amazonaws.bedrock", "AutomatedReasoningPolicyAnnotationRuleNaturalLanguage", 8, 0];
    bsd = [0, "com.amazonaws.bedrock", "AutomatedReasoningPolicyBuildDocumentBlob", 8, 21];
    azs = [0, "com.amazonaws.bedrock", "AutomatedReasoningPolicyBuildDocumentDescription", 8, 0];
    lzs = [0, "com.amazonaws.bedrock", "AutomatedReasoningPolicyBuildDocumentName", 8, 0];
    Ssd = [0, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionRuleAlternateExpression", 8, 0];
    W$r = [0, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionRuleExpression", 8, 0];
    G$r = [0, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionTypeDescription", 8, 0];
    Fle = [0, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionTypeName", 8, 0];
    V$r = [0, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionTypeValueDescription", 8, 0];
    z$r = [0, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionVariableDescription", 8, 0];
    eqe = [0, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionVariableName", 8, 0];
    Zrt = [0, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDescription", 8, 0];
    WAe = [0, "com.amazonaws.bedrock", "AutomatedReasoningPolicyName", 8, 0];
    Tsd = [0, "com.amazonaws.bedrock", "AutomatedReasoningPolicyScenarioAlternateExpression", 8, 0];
    czs = [0, "com.amazonaws.bedrock", "AutomatedReasoningPolicyScenarioExpression", 8, 0];
    wTn = [0, "com.amazonaws.bedrock", "AutomatedReasoningPolicyTestGuardContent", 8, 0];
    CTn = [0, "com.amazonaws.bedrock", "AutomatedReasoningPolicyTestQueryContent", 8, 0];
    Esd = [0, "com.amazonaws.bedrock", "ByteContentBlob", 8, 21];
    vsd = [0, "com.amazonaws.bedrock", "EvaluationDatasetName", 8, 0];
    uzs = [0, "com.amazonaws.bedrock", "EvaluationJobDescription", 8, 0];
    _1t = [0, "com.amazonaws.bedrock", "EvaluationJobIdentifier", 8, 0];
    wsd = [0, "com.amazonaws.bedrock", "EvaluationMetricDescription", 8, 0];
    dzs = [0, "com.amazonaws.bedrock", "EvaluationMetricName", 8, 0];
    Csd = [0, "com.amazonaws.bedrock", "EvaluationModelInferenceParams", 8, 0];
    Qrt = [0, "com.amazonaws.bedrock", "GuardrailBlockedMessaging", 8, 0];
    bTn = [0, "com.amazonaws.bedrock", "GuardrailContentFilterAction", 8, 0];
    pzs = [0, "com.amazonaws.bedrock", "GuardrailContentFiltersTierName", 8, 0];
    mzs = [0, "com.amazonaws.bedrock", "GuardrailContextualGroundingAction", 8, 0];
    b1t = [0, "com.amazonaws.bedrock", "GuardrailDescription", 8, 0];
    Rsd = [0, "com.amazonaws.bedrock", "GuardrailFailureRecommendation", 8, 0];
    xsd = [0, "com.amazonaws.bedrock", "GuardrailModality", 8, 0];
    RTn = [0, "com.amazonaws.bedrock", "GuardrailName", 8, 0];
    ksd = [0, "com.amazonaws.bedrock", "GuardrailStatusReason", 8, 0];
    STn = [0, "com.amazonaws.bedrock", "GuardrailTopicAction", 8, 0];
    fzs = [0, "com.amazonaws.bedrock", "GuardrailTopicDefinition", 8, 0];
    Asd = [0, "com.amazonaws.bedrock", "GuardrailTopicExample", 8, 0];
    hzs = [0, "com.amazonaws.bedrock", "GuardrailTopicName", 8, 0];
    gzs = [0, "com.amazonaws.bedrock", "GuardrailTopicsTierName", 8, 0];
    qAe = [0, "com.amazonaws.bedrock", "GuardrailWordAction", 8, 0];
    Isd = [0, "com.amazonaws.bedrock", "HumanTaskInstructions", 8, 0];
    Psd = [0, "com.amazonaws.bedrock", "Identifier", 8, 0];
    K$r = [0, "com.amazonaws.bedrock", "InferenceProfileDescription", 8, 0];
    yzs = [0, "com.amazonaws.bedrock", "Message", 8, 0];
    Osd = [0, "com.amazonaws.bedrock", "MetricName", 8, 0];
    Y$r = [0, "com.amazonaws.bedrock", "PromptRouterDescription", 8, 0];
    Dsd = [0, "com.amazonaws.bedrock", "TextPromptTemplate", 8, 0];
    Msd = [-3, "com.amazonaws.bedrock", "AccessDeniedException", {
      error: "client",
      httpError: 403
    }, ["message"], [0]];
    PY.TypeRegistry.for("com.amazonaws.bedrock").registerError(Msd, AccessDeniedException);
    Nsd = [3, "com.amazonaws.bedrock", "AgreementAvailability", 0, ["status", "errorMessage"], [0, 0]];
    Lsd = [3, "com.amazonaws.bedrock", "AutomatedEvaluationConfig", 0, ["datasetMetricConfigs", "evaluatorModelConfig", "customMetricConfig"], [[() => Bzs, 0], () => Fmd, [() => Fsd, 0]]];
    Fsd = [3, "com.amazonaws.bedrock", "AutomatedEvaluationCustomMetricConfig", 0, ["customMetrics", "evaluatorModelConfig"], [[() => fpd, 0], () => Aad]];
    Usd = [3, "com.amazonaws.bedrock", "AutomatedReasoningCheckImpossibleFinding", 0, ["translation", "contradictingRules", "logicWarning"], [[() => S1t, 0], () => tHr, [() => xTn, 0]]];
    Bsd = [3, "com.amazonaws.bedrock", "AutomatedReasoningCheckInputTextReference", 0, ["text"], [[() => szs, 0]]];
    $sd = [3, "com.amazonaws.bedrock", "AutomatedReasoningCheckInvalidFinding", 0, ["translation", "contradictingRules", "logicWarning"], [[() => S1t, 0], () => tHr, [() => xTn, 0]]];
    xTn = [3, "com.amazonaws.bedrock", "AutomatedReasoningCheckLogicWarning", 0, ["type", "premises", "claims"], [0, [() => y1t, 0], [() => y1t, 0]]];
    Hsd = [3, "com.amazonaws.bedrock", "AutomatedReasoningCheckNoTranslationsFinding", 0, [], []];
    jsd = [3, "com.amazonaws.bedrock", "AutomatedReasoningCheckRule", 0, ["id", "policyVersionArn"], [0, 0]];
    qsd = [3, "com.amazonaws.bedrock", "AutomatedReasoningCheckSatisfiableFinding", 0, ["translation", "claimsTrueScenario", "claimsFalseScenario", "logicWarning"], [[() => S1t, 0], [() => TTn, 0], [() => TTn, 0], [() => xTn, 0]]];
    TTn = [3, "com.amazonaws.bedrock", "AutomatedReasoningCheckScenario", 0, ["statements"], [[() => y1t, 0]]];
    Wsd = [3, "com.amazonaws.bedrock", "AutomatedReasoningCheckTooComplexFinding", 0, [], []];
    S1t = [3, "com.amazonaws.bedrock", "AutomatedReasoningCheckTranslation", 0, ["premises", "claims", "untranslatedPremises", "untranslatedClaims", "confidence"], [[() => y1t, 0], [() => y1t, 0], [() => tzs, 0], [() => tzs, 0], 1]];
    Gsd = [3, "com.amazonaws.bedrock", "AutomatedReasoningCheckTranslationAmbiguousFinding", 0, ["options", "differenceScenarios"], [[() => _pd, 0], [() => hpd, 0]]];
    Vsd = [3, "com.amazonaws.bedrock", "AutomatedReasoningCheckTranslationOption", 0, ["translations"], [[() => ypd, 0]]];
    zsd = [3, "com.amazonaws.bedrock", "AutomatedReasoningCheckValidFinding", 0, ["translation", "claimsTrueScenario", "supportingRules", "logicWarning"], [[() => S1t, 0], [() => TTn, 0], () => tHr, [() => xTn, 0]]];
    Ksd = [3, "com.amazonaws.bedrock", "AutomatedReasoningLogicStatement", 0, ["logic", "naturalLanguage"], [[() => gsd, 0], [() => szs, 0]]];
    Ysd = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyAddRuleAnnotation", 0, ["expression"], [[() => W$r, 0]]];
    Jsd = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyAddRuleFromNaturalLanguageAnnotation", 0, ["naturalLanguage"], [[() => _sd, 0]]];
    Xsd = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyAddRuleMutation", 0, ["rule"], [[() => kTn, 0]]];
    Qsd = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyAddTypeAnnotation", 0, ["name", "description", "values"], [[() => Fle, 0], [() => G$r, 0], [() => Fzs, 0]]];
    Zsd = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyAddTypeMutation", 0, ["type"], [[() => ATn, 0]]];
    eid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyAddTypeValue", 0, ["value", "description"], [0, [() => V$r, 0]]];
    tid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyAddVariableAnnotation", 0, ["name", "type", "description"], [[() => eqe, 0], [() => Fle, 0], [() => z$r, 0]]];
    nid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyAddVariableMutation", 0, ["variable"], [[() => ITn, 0]]];
    rid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyBuildLog", 0, ["entries"], [[() => bpd, 0]]];
    oid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyBuildLogEntry", 0, ["annotation", "status", "buildSteps"], [[() => qzs, 0], 0, [() => Spd, 0]]];
    sid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyBuildStep", 0, ["context", "priorElement", "messages"], [[() => Amd, 0], [() => Imd, 0], () => Tpd]];
    iid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyBuildStepMessage", 0, ["message", "messageType"], [0, 0]];
    aid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyBuildWorkflowDocument", 0, ["document", "documentContentType", "documentName", "documentDescription"], [[() => bsd, 0], 0, [() => lzs, 0], [() => azs, 0]]];
    lid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyBuildWorkflowRepairContent", 0, ["annotations"], [[() => nHr, 0]]];
    cid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyBuildWorkflowSource", 0, ["policyDefinition", "workflowContent"], [[() => T1t, 0], [() => Dmd, 0]]];
    uid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyBuildWorkflowSummary", 0, ["policyArn", "buildWorkflowId", "status", "buildWorkflowType", "createdAt", "updatedAt"], [0, 0, 0, 0, 5, 5]];
    T1t = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinition", 0, ["version", "types", "rules", "variables"], [0, [() => Cpd, 0], [() => wpd, 0], [() => kpd, 0]]];
    did = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionQualityReport", 0, ["typeCount", "variableCount", "ruleCount", "unusedTypes", "unusedTypeValues", "unusedVariables", "conflictingRules", "disjointRuleSets"], [1, 1, 1, [() => Rpd, 0], [() => xpd, 0], [() => Uzs, 0], 64, [() => Apd, 0]]];
    kTn = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionRule", 0, ["id", "expression", "alternateExpression"], [0, [() => W$r, 0], [() => Ssd, 0]]];
    ATn = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionType", 0, ["name", "description", "values"], [[() => Fle, 0], [() => G$r, 0], [() => Fzs, 0]]];
    pid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionTypeValue", 0, ["value", "description"], [0, [() => V$r, 0]]];
    mid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionTypeValuePair", 0, ["typeName", "valueName"], [[() => Fle, 0], 0]];
    ITn = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionVariable", 0, ["name", "type", "description"], [[() => eqe, 0], [() => Fle, 0], [() => z$r, 0]]];
    fid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDeleteRuleAnnotation", 0, ["ruleId"], [0]];
    hid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDeleteRuleMutation", 0, ["id"], [0]];
    gid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDeleteTypeAnnotation", 0, ["name"], [[() => Fle, 0]]];
    yid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDeleteTypeMutation", 0, ["name"], [[() => Fle, 0]]];
    _id = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDeleteTypeValue", 0, ["value"], [0]];
    bid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDeleteVariableAnnotation", 0, ["name"], [[() => eqe, 0]]];
    Sid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDeleteVariableMutation", 0, ["name"], [[() => eqe, 0]]];
    Tid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDisjointRuleSet", 0, ["variables", "rules"], [[() => Uzs, 0], 64]];
    Eid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyGeneratedTestCase", 0, ["queryContent", "guardContent", "expectedAggregatedFindingsResult"], [[() => CTn, 0], [() => wTn, 0], 0]];
    vid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyGeneratedTestCases", 0, ["generatedTestCases"], [[() => Ipd, 0]]];
    wid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyIngestContentAnnotation", 0, ["content"], [[() => ysd, 0]]];
    Cid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyPlanning", 0, [], []];
    Rid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyScenario", 0, ["expression", "alternateExpression", "ruleIds", "expectedResult"], [[() => czs, 0], [() => Tsd, 0], 64, 0]];
    xid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicySummary", 0, ["policyArn", "name", "description", "version", "policyId", "createdAt", "updatedAt"], [0, [() => WAe, 0], [() => Zrt, 0], 0, 0, 5, 5]];
    J$r = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyTestCase", 0, ["testCaseId", "guardContent", "queryContent", "expectedAggregatedFindingsResult", "createdAt", "updatedAt", "confidenceThreshold"], [0, [() => wTn, 0], [() => CTn, 0], 0, 5, 5, 1]];
    _zs = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyTestResult", 0, ["testCase", "policyArn", "testRunStatus", "testFindings", "testRunResult", "aggregatedTestFindingsResult", "updatedAt"], [[() => J$r, 0], 0, 0, [() => gpd, 0], 0, 0, 5]];
    kid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyUpdateFromRuleFeedbackAnnotation", 0, ["ruleIds", "feedback"], [64, [() => izs, 0]]];
    Aid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyUpdateFromScenarioFeedbackAnnotation", 0, ["ruleIds", "scenarioExpression", "feedback"], [64, [() => czs, 0], [() => izs, 0]]];
    Iid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyUpdateRuleAnnotation", 0, ["ruleId", "expression"], [0, [() => W$r, 0]]];
    Pid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyUpdateRuleMutation", 0, ["rule"], [[() => kTn, 0]]];
    Oid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyUpdateTypeAnnotation", 0, ["name", "newName", "description", "values"], [[() => Fle, 0], [() => Fle, 0], [() => G$r, 0], [() => Mpd, 0]]];
    Did = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyUpdateTypeMutation", 0, ["type"], [[() => ATn, 0]]];
    Mid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyUpdateTypeValue", 0, ["value", "newValue", "description"], [0, 0, [() => V$r, 0]]];
    Nid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyUpdateVariableAnnotation", 0, ["name", "newName", "description"], [[() => eqe, 0], [() => eqe, 0], [() => z$r, 0]]];
    Lid = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyUpdateVariableMutation", 0, ["variable"], [[() => ITn, 0]]];
    Fid = [3, "com.amazonaws.bedrock", "BatchDeleteEvaluationJobError", 0, ["jobIdentifier", "code", "message"], [[() => _1t, 0], 0, 0]];
    Uid = [3, "com.amazonaws.bedrock", "BatchDeleteEvaluationJobItem", 0, ["jobIdentifier", "jobStatus"], [[() => _1t, 0], 0]];
    Bid = [3, "com.amazonaws.bedrock", "BatchDeleteEvaluationJobRequest", 0, ["jobIdentifiers"], [[() => Hpd, 0]]];
    $id = [3, "com.amazonaws.bedrock", "BatchDeleteEvaluationJobResponse", 0, ["errors", "evaluationJobs"], [[() => Npd, 0], [() => Lpd, 0]]];
    Hid = [3, "com.amazonaws.bedrock", "BedrockEvaluatorModel", 0, ["modelIdentifier"], [0]];
    jid = [3, "com.amazonaws.bedrock", "ByteContentDoc", 0, ["identifier", "contentType", "data"], [[() => Psd, 0], 0, [() => Esd, 0]]];
    qid = [3, "com.amazonaws.bedrock", "CancelAutomatedReasoningPolicyBuildWorkflowRequest", 0, ["policyArn", "buildWorkflowId"], [[0, 1], [0, 1]]];
    Wid = [3, "com.amazonaws.bedrock", "CancelAutomatedReasoningPolicyBuildWorkflowResponse", 0, [], []];
    Gid = [3, "com.amazonaws.bedrock", "CloudWatchConfig", 0, ["logGroupName", "roleArn", "largeDataDeliveryS3Config"], [0, 0, () => Mzs]];
    Vid = [-3, "com.amazonaws.bedrock", "ConflictException", {
      error: "client",
      httpError: 400
    }, ["message"], [0]];
    PY.TypeRegistry.for("com.amazonaws.bedrock").registerError(Vid, ConflictException);
    zid = [3, "com.amazonaws.bedrock", "CreateAutomatedReasoningPolicyRequest", 0, ["name", "description", "clientRequestToken", "policyDefinition", "kmsKeyId", "tags"], [[() => WAe, 0], [() => Zrt, 0], [0, 4], [() => T1t, 0], 0, () => HP]];
    Kid = [3, "com.amazonaws.bedrock", "CreateAutomatedReasoningPolicyResponse", 0, ["policyArn", "version", "name", "description", "definitionHash", "createdAt", "updatedAt"], [0, 0, [() => WAe, 0], [() => Zrt, 0], 0, 5, 5]];
    Yid = [3, "com.amazonaws.bedrock", "CreateAutomatedReasoningPolicyTestCaseRequest", 0, ["policyArn", "guardContent", "queryContent", "expectedAggregatedFindingsResult", "clientRequestToken", "confidenceThreshold"], [[0, 1], [() => wTn, 0], [() => CTn, 0], 0, [0, 4], 1]];
    Jid = [3, "com.amazonaws.bedrock", "CreateAutomatedReasoningPolicyTestCaseResponse", 0, ["policyArn", "testCaseId"], [0, 0]];
    Xid = [3, "com.amazonaws.bedrock", "CreateAutomatedReasoningPolicyVersionRequest", 0, ["policyArn", "clientRequestToken", "lastUpdatedDefinitionHash", "tags"], [[0, 1], [0, 4], 0, () => HP]];
    Qid = [3, "com.amazonaws.bedrock", "CreateAutomatedReasoningPolicyVersionResponse", 0, ["policyArn", "version", "name", "description", "definitionHash", "createdAt"], [0, 0, [() => WAe, 0], [() => Zrt, 0], 0, 5]];
    Zid = [3, "com.amazonaws.bedrock", "CreateCustomModelDeploymentRequest", 0, ["modelDeploymentName", "modelArn", "description", "tags", "clientRequestToken"], [0, 0, 0, () => HP, [0, 4]]];
    ead = [3, "com.amazonaws.bedrock", "CreateCustomModelDeploymentResponse", 0, ["customModelDeploymentArn"], [0]];
    tad = [3, "com.amazonaws.bedrock", "CreateCustomModelRequest", 0, ["modelName", "modelSourceConfig", "modelKmsKeyArn", "roleArn", "modelTags", "clientRequestToken"], [0, () => DTn, 0, 0, () => HP, [0, 4]]];
    nad = [3, "com.amazonaws.bedrock", "CreateCustomModelResponse", 0, ["modelArn"], [0]];
    rad = [3, "com.amazonaws.bedrock", "CreateEvaluationJobRequest", 0, ["jobName", "jobDescription", "clientRequestToken", "roleArn", "customerEncryptionKeyId", "jobTags", "applicationType", "evaluationConfig", "inferenceConfig", "outputDataConfig"], [0, [() => uzs, 0], [0, 4], 0, 0, () => HP, 0, [() => Wzs, 0], [() => Gzs, 0], () => bzs]];
    oad = [3, "com.amazonaws.bedrock", "CreateEvaluationJobResponse", 0, ["jobArn"], [0]];
    sad = [3, "com.amazonaws.bedrock", "CreateFoundationModelAgreementRequest", 0, ["offerToken", "modelId"], [0, 0]];
    iad = [3, "com.amazonaws.bedrock", "CreateFoundationModelAgreementResponse", 0, ["modelId"], [0]];
    aad = [3, "com.amazonaws.bedrock", "CreateGuardrailRequest", 0, ["name", "description", "topicPolicyConfig", "contentPolicyConfig", "wordPolicyConfig", "sensitiveInformationPolicyConfig", "contextualGroundingPolicyConfig", "automatedReasoningPolicyConfig", "crossRegionConfig", "blockedInputMessaging", "blockedOutputsMessaging", "kmsKeyId", "tags", "clientRequestToken"], [[() => RTn, 0], [() => b1t, 0], [() => kzs, 0], [() => vzs, 0], [() => Azs, 0], () => xzs, [() => wzs, 0], () => Tzs, () => Czs, [() => Qrt, 0], [() => Qrt, 0], 0, () => HP, [0, 4]]];
    lad = [3, "com.amazonaws.bedrock", "CreateGuardrailResponse", 0, ["guardrailId", "guardrailArn", "version", "createdAt"], [0, 0, 0, 5]];
    cad = [3, "com.amazonaws.bedrock", "CreateGuardrailVersionRequest", 0, ["guardrailIdentifier", "description", "clientRequestToken"], [[0, 1], [() => b1t, 0], [0, 4]]];
    uad = [3, "com.amazonaws.bedrock", "CreateGuardrailVersionResponse", 0, ["guardrailId", "version"], [0, 0]];
    dad = [3, "com.amazonaws.bedrock", "CreateInferenceProfileRequest", 0, ["inferenceProfileName", "description", "clientRequestToken", "modelSource", "tags"], [0, [() => K$r, 0], [0, 4], () => Umd, () => HP]];
    pad = [3, "com.amazonaws.bedrock", "CreateInferenceProfileResponse", 0, ["inferenceProfileArn", "status"], [0, 0]];
    mad = [3, "com.amazonaws.bedrock", "CreateMarketplaceModelEndpointRequest", 0, ["modelSourceIdentifier", "endpointConfig", "acceptEula", "endpointName", "clientRequestToken", "tags"], [0, () => sHr, 2, 0, [0, 4], () => HP]];
    fad = [3, "com.amazonaws.bedrock", "CreateMarketplaceModelEndpointResponse", 0, ["marketplaceModelEndpoint"], [() => PTn]];
    had = [3, "com.amazonaws.bedrock", "CreateModelCopyJobRequest", 0, ["sourceModelArn", "targetModelName", "modelKmsKeyId", "targetModelTags", "clientRequestToken"], [0, 0, 0, () => HP, [0, 4]]];
    gad = [3, "com.amazonaws.bedrock", "CreateModelCopyJobResponse", 0, ["jobArn"], [0]];
    yad = [3, "com.amazonaws.bedrock", "CreateModelCustomizationJobRequest", 0, ["jobName", "customModelName", "roleArn", "clientRequestToken", "baseModelIdentifier", "customizationType", "customModelKmsKeyId", "jobTags", "customModelTags", "trainingDataConfig", "validationDataConfig", "outputDataConfig", "hyperParameters", "vpcConfig", "customizationConfig"], [0, 0, 0, [0, 4], 0, 0, 0, () => HP, () => HP, [() => Z$r, 0], () => eHr, () => X$r, 128, () => GAe, () => oHr]];
    _ad = [3, "com.amazonaws.bedrock", "CreateModelCustomizationJobResponse", 0, ["jobArn"], [0]];
    bad = [3, "com.amazonaws.bedrock", "CreateModelImportJobRequest", 0, ["jobName", "importedModelName", "roleArn", "modelDataSource", "jobTags", "importedModelTags", "clientRequestToken", "vpcConfig", "importedModelKmsKeyId"], [0, 0, 0, () => DTn, () => HP, () => HP, 0, () => GAe, 0]];
    Sad = [3, "com.amazonaws.bedrock", "CreateModelImportJobResponse", 0, ["jobArn"], [0]];
    Tad = [3, "com.amazonaws.bedrock", "CreateModelInvocationJobRequest", 0, ["jobName", "roleArn", "clientRequestToken", "modelId", "inputDataConfig", "outputDataConfig", "vpcConfig", "timeoutDurationInHours", "tags"], [0, 0, [0, 4], 0, () => iHr, () => aHr, () => GAe, 1, () => HP]];
    Ead = [3, "com.amazonaws.bedrock", "CreateModelInvocationJobResponse", 0, ["jobArn"], [0]];
    vad = [3, "com.amazonaws.bedrock", "CreatePromptRouterRequest", 0, ["clientRequestToken", "promptRouterName", "models", "description", "routingCriteria", "fallbackModel", "tags"], [[0, 4], 0, () => rHr, [() => Y$r, 0], () => Q$r, () => OTn, () => HP]];
    wad = [3, "com.amazonaws.bedrock", "CreatePromptRouterResponse", 0, ["promptRouterArn"], [0]];
    Cad = [3, "com.amazonaws.bedrock", "CreateProvisionedModelThroughputRequest", 0, ["clientRequestToken", "modelUnits", "provisionedModelName", "modelId", "commitmentDuration", "tags"], [[0, 4], 1, 0, 0, 0, () => HP]];
    Rad = [3, "com.amazonaws.bedrock", "CreateProvisionedModelThroughputResponse", 0, ["provisionedModelArn"], [0]];
    xad = [3, "com.amazonaws.bedrock", "CustomMetricBedrockEvaluatorModel", 0, ["modelIdentifier"], [0]];
    kad = [3, "com.amazonaws.bedrock", "CustomMetricDefinition", 8, ["name", "instructions", "ratingScale"], [[() => Osd, 0], 0, () => wmd]];
    Aad = [3, "com.amazonaws.bedrock", "CustomMetricEvaluatorModelConfig", 0, ["bedrockEvaluatorModels"], [() => Upd]];
    Iad = [3, "com.amazonaws.bedrock", "CustomModelDeploymentSummary", 0, ["customModelDeploymentArn", "customModelDeploymentName", "modelArn", "createdAt", "status", "lastUpdatedAt", "failureMessage"], [0, 0, 0, 5, 0, 5, 0]];
    Pad = [3, "com.amazonaws.bedrock", "CustomModelSummary", 0, ["modelArn", "modelName", "creationTime", "baseModelArn", "baseModelName", "customizationType", "ownerAccountId", "modelStatus"], [0, 0, 5, 0, 0, 0, 0, 0]];
    Oad = [3, "com.amazonaws.bedrock", "CustomModelUnits", 0, ["customModelUnitsPerModelCopy", "customModelUnitsVersion"], [1, 0]];
    Dad = [3, "com.amazonaws.bedrock", "DataProcessingDetails", 0, ["status", "creationTime", "lastModifiedTime"], [0, 5, 5]];
    Mad = [3, "com.amazonaws.bedrock", "DeleteAutomatedReasoningPolicyBuildWorkflowRequest", 0, ["policyArn", "buildWorkflowId", "lastUpdatedAt"], [[0, 1], [0, 1], [5, {
      httpQuery: "updatedAt"
    }]]];
    Nad = [3, "com.amazonaws.bedrock", "DeleteAutomatedReasoningPolicyBuildWorkflowResponse", 0, [], []];
    Lad = [3, "com.amazonaws.bedrock", "DeleteAutomatedReasoningPolicyRequest", 0, ["policyArn", "force"], [[0, 1], [2, {
      httpQuery: "force"
    }]]];
    Fad = [3, "com.amazonaws.bedrock", "DeleteAutomatedReasoningPolicyResponse", 0, [], []];
    Uad = [3, "com.amazonaws.bedrock", "DeleteAutomatedReasoningPolicyTestCaseRequest", 0, ["policyArn", "testCaseId", "lastUpdatedAt"], [[0, 1], [0, 1], [5, {
      httpQuery: "updatedAt"
    }]]];
    Bad = [3, "com.amazonaws.bedrock", "DeleteAutomatedReasoningPolicyTestCaseResponse", 0, [], []];
    $ad = [3, "com.amazonaws.bedrock", "DeleteCustomModelDeploymentRequest", 0, ["customModelDeploymentIdentifier"], [[0, 1]]];
    Had = [3, "com.amazonaws.bedrock", "DeleteCustomModelDeploymentResponse", 0, [], []];
    jad = [3, "com.amazonaws.bedrock", "DeleteCustomModelRequest", 0, ["modelIdentifier"], [[0, 1]]];
    qad = [3, "com.amazonaws.bedrock", "DeleteCustomModelResponse", 0, [], []];
    Wad = [3, "com.amazonaws.bedrock", "DeleteFoundationModelAgreementRequest", 0, ["modelId"], [0]];
    Gad = [3, "com.amazonaws.bedrock", "DeleteFoundationModelAgreementResponse", 0, [], []];
    Vad = [3, "com.amazonaws.bedrock", "DeleteGuardrailRequest", 0, ["guardrailIdentifier", "guardrailVersion"], [[0, 1], [0, {
      httpQuery: "guardrailVersion"
    }]]];
    zad = [3, "com.amazonaws.bedrock", "DeleteGuardrailResponse", 0, [], []];
    Kad = [3, "com.amazonaws.bedrock", "DeleteImportedModelRequest", 0, ["modelIdentifier"], [[0, 1]]];
    Yad = [3, "com.amazonaws.bedrock", "DeleteImportedModelResponse", 0, [], []];
    Jad = [3, "com.amazonaws.bedrock", "DeleteInferenceProfileRequest", 0, ["inferenceProfileIdentifier"], [[0, 1]]];
    Xad = [3, "com.amazonaws.bedrock", "DeleteInferenceProfileResponse", 0, [], []];
    Qad = [3, "com.amazonaws.bedrock", "DeleteMarketplaceModelEndpointRequest", 0, ["endpointArn"], [[0, 1]]];
    Zad = [3, "com.amazonaws.bedrock", "DeleteMarketplaceModelEndpointResponse", 0, [], []];
    eld = [3, "com.amazonaws.bedrock", "DeleteModelInvocationLoggingConfigurationRequest", 0, [], []];
    tld = [3, "com.amazonaws.bedrock", "DeleteModelInvocationLoggingConfigurationResponse", 0, [], []];
    nld = [3, "com.amazonaws.bedrock", "DeletePromptRouterRequest", 0, ["promptRouterArn"], [[0, 1]]];
    rld = [3, "com.amazonaws.bedrock", "DeletePromptRouterResponse", 0, [], []];
    old = [3, "com.amazonaws.bedrock", "DeleteProvisionedModelThroughputRequest", 0, ["provisionedModelId"], [[0, 1]]];
    sld = [3, "com.amazonaws.bedrock", "DeleteProvisionedModelThroughputResponse", 0, [], []];
    ild = [3, "com.amazonaws.bedrock", "DeregisterMarketplaceModelEndpointRequest", 0, ["endpointArn"], [[0, 1]]];
    ald = [3, "com.amazonaws.bedrock", "DeregisterMarketplaceModelEndpointResponse", 0, [], []];
    lld = [3, "com.amazonaws.bedrock", "DimensionalPriceRate", 0, ["dimension", "price", "description", "unit"], [0, 0, 0, 0]];
    cld = [3, "com.amazonaws.bedrock", "DistillationConfig", 0, ["teacherModelConfig"], [() => Bdd]];
    uld = [3, "com.amazonaws.bedrock", "EvaluationBedrockModel", 0, ["modelIdentifier", "inferenceParams", "performanceConfig"], [0, [() => Csd, 0], () => rdd]];
    dld = [3, "com.amazonaws.bedrock", "EvaluationDataset", 0, ["name", "datasetLocation"], [[() => vsd, 0], () => Mmd]];
    pld = [3, "com.amazonaws.bedrock", "EvaluationDatasetMetricConfig", 0, ["taskType", "dataset", "metricNames"], [0, [() => dld, 0], [() => jpd, 0]]];
    mld = [3, "com.amazonaws.bedrock", "EvaluationInferenceConfigSummary", 0, ["modelConfigSummary", "ragConfigSummary"], [() => fld, () => _ld]];
    fld = [3, "com.amazonaws.bedrock", "EvaluationModelConfigSummary", 0, ["bedrockModelIdentifiers", "precomputedInferenceSourceIdentifiers"], [64, 64]];
    bzs = [3, "com.amazonaws.bedrock", "EvaluationOutputDataConfig", 0, ["s3Uri"], [0]];
    hld = [3, "com.amazonaws.bedrock", "EvaluationPrecomputedInferenceSource", 0, ["inferenceSourceIdentifier"], [0]];
    gld = [3, "com.amazonaws.bedrock", "EvaluationPrecomputedRetrieveAndGenerateSourceConfig", 0, ["ragSourceIdentifier"], [0]];
    yld = [3, "com.amazonaws.bedrock", "EvaluationPrecomputedRetrieveSourceConfig", 0, ["ragSourceIdentifier"], [0]];
    _ld = [3, "com.amazonaws.bedrock", "EvaluationRagConfigSummary", 0, ["bedrockKnowledgeBaseIdentifiers", "precomputedRagSourceIdentifiers"], [64, 64]];
    bld = [3, "com.amazonaws.bedrock", "EvaluationSummary", 0, ["jobArn", "jobName", "status", "creationTime", "jobType", "evaluationTaskTypes", "modelIdentifiers", "ragIdentifiers", "evaluatorModelIdentifiers", "customMetricsEvaluatorModelIdentifiers", "inferenceConfigSummary", "applicationType"], [0, 0, 0, 5, 0, 64, 64, 64, 64, 64, () => mld, 0]];
    Sld = [3, "com.amazonaws.bedrock", "ExportAutomatedReasoningPolicyVersionRequest", 0, ["policyArn"], [[0, 1]]];
    Tld = [3, "com.amazonaws.bedrock", "ExportAutomatedReasoningPolicyVersionResponse", 0, ["policyDefinition"], [[() => T1t, 16]]];
    Eld = [3, "com.amazonaws.bedrock", "ExternalSource", 0, ["sourceType", "s3Location", "byteContent"], [0, () => Tdd, [() => jid, 0]]];
    vld = [3, "com.amazonaws.bedrock", "ExternalSourcesGenerationConfiguration", 0, ["promptTemplate", "guardrailConfiguration", "kbInferenceConfig", "additionalModelRequestFields"], [[() => Dzs, 0], () => Ezs, () => Izs, 143]];
    wld = [3, "com.amazonaws.bedrock", "ExternalSourcesRetrieveAndGenerateConfiguration", 0, ["modelArn", "sources", "generationConfiguration"], [0, [() => Gpd, 0], [() => vld, 0]]];
    Cld = [3, "com.amazonaws.bedrock", "FieldForReranking", 0, ["fieldName"], [0]];
    rne = [3, "com.amazonaws.bedrock", "FilterAttribute", 0, ["key", "value"], [0, 15]];
    Rld = [3, "com.amazonaws.bedrock", "FoundationModelDetails", 0, ["modelArn", "modelId", "modelName", "providerName", "inputModalities", "outputModalities", "responseStreamingSupported", "customizationsSupported", "inferenceTypesSupported", "modelLifecycle"], [0, 0, 0, 0, 64, 64, 2, 64, 64, () => Szs]];
    Szs = [3, "com.amazonaws.bedrock", "FoundationModelLifecycle", 0, ["status"], [0]];
    xld = [3, "com.amazonaws.bedrock", "FoundationModelSummary", 0, ["modelArn", "modelId", "modelName", "providerName", "inputModalities", "outputModalities", "responseStreamingSupported", "customizationsSupported", "inferenceTypesSupported", "modelLifecycle"], [0, 0, 0, 0, 64, 64, 2, 64, 64, () => Szs]];
    kld = [3, "com.amazonaws.bedrock", "GenerationConfiguration", 0, ["promptTemplate", "guardrailConfiguration", "kbInferenceConfig", "additionalModelRequestFields"], [[() => Dzs, 0], () => Ezs, () => Izs, 143]];
    Ald = [3, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicyAnnotationsRequest", 0, ["policyArn", "buildWorkflowId"], [[0, 1], [0, 1]]];
    Ild = [3, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicyAnnotationsResponse", 0, ["policyArn", "name", "buildWorkflowId", "annotations", "annotationSetHash", "updatedAt"], [0, [() => WAe, 0], 0, [() => nHr, 0], 0, 5]];
    Pld = [3, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicyBuildWorkflowRequest", 0, ["policyArn", "buildWorkflowId"], [[0, 1], [0, 1]]];
    Old = [3, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicyBuildWorkflowResponse", 0, ["policyArn", "buildWorkflowId", "status", "buildWorkflowType", "documentName", "documentContentType", "documentDescription", "createdAt", "updatedAt"], [0, 0, 0, 0, [() => lzs, 0], 0, [() => azs, 0], 5, 5]];
    Dld = [3, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicyBuildWorkflowResultAssetsRequest", 0, ["policyArn", "buildWorkflowId", "assetType"], [[0, 1], [0, 1], [0, {
      httpQuery: "assetType"
    }]]];
    Mld = [3, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicyBuildWorkflowResultAssetsResponse", 0, ["policyArn", "buildWorkflowId", "buildWorkflowAssets"], [0, 0, [() => kmd, 0]]];
    Nld = [3, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicyNextScenarioRequest", 0, ["policyArn", "buildWorkflowId"], [[0, 1], [0, 1]]];
    Lld = [3, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicyNextScenarioResponse", 0, ["policyArn", "scenario"], [0, [() => Rid, 0]]];
    Fld = [3, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicyRequest", 0, ["policyArn"], [[0, 1]]];
    Uld = [3, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicyResponse", 0, ["policyArn", "name", "version", "policyId", "description", "definitionHash", "kmsKeyArn", "createdAt", "updatedAt"], [0, [() => WAe, 0], 0, 0, [() => Zrt, 0], 0, 0, 5, 5]];
    Bld = [3, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicyTestCaseRequest", 0, ["policyArn", "testCaseId"], [[0, 1], [0, 1]]];
    $ld = [3, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicyTestCaseResponse", 0, ["policyArn", "testCase"], [0, [() => J$r, 0]]];
    Hld = [3, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicyTestResultRequest", 0, ["policyArn", "buildWorkflowId", "testCaseId"], [[0, 1], [0, 1], [0, 1]]];
    jld = [3, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicyTestResultResponse", 0, ["testResult"], [[() => _zs, 0]]];
    qld = [3, "com.amazonaws.bedrock", "GetCustomModelDeploymentRequest", 0, ["customModelDeploymentIdentifier"], [[0, 1]]];
    Wld = [3, "com.amazonaws.bedrock", "GetCustomModelDeploymentResponse", 0, ["customModelDeploymentArn", "modelDeploymentName", "modelArn", "createdAt", "status", "description", "failureMessage", "lastUpdatedAt"], [0, 0, 0, 5, 0, 0, 0, 5]];
    Gld = [3, "com.amazonaws.bedrock", "GetCustomModelRequest", 0, ["modelIdentifier"], [[0, 1]]];
    Vld = [3, "com.amazonaws.bedrock", "GetCustomModelResponse", 0, ["modelArn", "modelName", "jobName", "jobArn", "baseModelArn", "customizationType", "modelKmsKeyArn", "hyperParameters", "trainingDataConfig", "validationDataConfig", "outputDataConfig", "trainingMetrics", "validationMetrics", "creationTime", "customizationConfig", "modelStatus", "failureMessage"], [0, 0, 0, 0, 0, 0, 0, 128, [() => Z$r, 0], () => eHr, () => X$r, () => Lzs, () => jzs, 5, () => oHr, 0, 0]];
    zld = [3, "com.amazonaws.bedrock", "GetEvaluationJobRequest", 0, ["jobIdentifier"], [[() => _1t, 1]]];
    Kld = [3, "com.amazonaws.bedrock", "GetEvaluationJobResponse", 0, ["jobName", "status", "jobArn", "jobDescription", "roleArn", "customerEncryptionKeyId", "jobType", "applicationType", "evaluationConfig", "inferenceConfig", "outputDataConfig", "creationTime", "lastModifiedTime", "failureMessages"], [0, 0, 0, [() => uzs, 0], 0, 0, 0, 0, [() => Wzs, 0], [() => Gzs, 0], () => bzs, 5, 5, 64]];
    Yld = [3, "com.amazonaws.bedrock", "GetFoundationModelAvailabilityRequest", 0, ["modelId"], [[0, 1]]];
    Jld = [3, "com.amazonaws.bedrock", "GetFoundationModelAvailabilityResponse", 0, ["modelId", "agreementAvailability", "authorizationStatus", "entitlementAvailability", "regionAvailability"], [0, () => Nsd, 0, 0, 0]];
    Xld = [3, "com.amazonaws.bedrock", "GetFoundationModelRequest", 0, ["modelIdentifier"], [[0, 1]]];
    Qld = [3, "com.amazonaws.bedrock", "GetFoundationModelResponse", 0, ["modelDetails"], [() => Rld]];
    Zld = [3, "com.amazonaws.bedrock", "GetGuardrailRequest", 0, ["guardrailIdentifier", "guardrailVersion"], [[0, 1], [0, {
      httpQuery: "guardrailVersion"
    }]]];
    ecd = [3, "com.amazonaws.bedrock", "GetGuardrailResponse", 0, ["name", "description", "guardrailId", "guardrailArn", "version", "status", "topicPolicy", "contentPolicy", "wordPolicy", "sensitiveInformationPolicy", "contextualGroundingPolicy", "automatedReasoningPolicy", "crossRegionDetails", "createdAt", "updatedAt", "statusReasons", "failureRecommendations", "blockedInputMessaging", "blockedOutputsMessaging", "kmsKeyArn"], [[() => RTn, 0], [() => b1t, 0], 0, 0, 0, 0, [() => jcd, 0], [() => kcd, 0], [() => zcd, 0], () => Ucd, [() => Pcd, 0], () => vcd, () => Rzs, 5, 5, [() => omd, 0], [() => Xpd, 0], [() => Qrt, 0], [() => Qrt, 0], 0]];
    tcd = [3, "com.amazonaws.bedrock", "GetImportedModelRequest", 0, ["modelIdentifier"], [[0, 1]]];
    ncd = [3, "com.amazonaws.bedrock", "GetImportedModelResponse", 0, ["modelArn", "modelName", "jobName", "jobArn", "modelDataSource", "creationTime", "modelArchitecture", "modelKmsKeyArn", "instructSupported", "customModelUnits"], [0, 0, 0, 0, () => DTn, 5, 0, 0, 2, () => Oad]];
    rcd = [3, "com.amazonaws.bedrock", "GetInferenceProfileRequest", 0, ["inferenceProfileIdentifier"], [[0, 1]]];
    ocd = [3, "com.amazonaws.bedrock", "GetInferenceProfileResponse", 0, ["inferenceProfileName", "description", "createdAt", "updatedAt", "inferenceProfileArn", "models", "inferenceProfileId", "status", "type"], [0, [() => K$r, 0], 5, 5, 0, () => Hzs, 0, 0, 0]];
    scd = [3, "com.amazonaws.bedrock", "GetMarketplaceModelEndpointRequest", 0, ["endpointArn"], [[0, 1]]];
    icd = [3, "com.amazonaws.bedrock", "GetMarketplaceModelEndpointResponse", 0, ["marketplaceModelEndpoint"], [() => PTn]];
    acd = [3, "com.amazonaws.bedrock", "GetModelCopyJobRequest", 0, ["jobArn"], [[0, 1]]];
    lcd = [3, "com.amazonaws.bedrock", "GetModelCopyJobResponse", 0, ["jobArn", "status", "creationTime", "targetModelArn", "targetModelName", "sourceAccountId", "sourceModelArn", "targetModelKmsKeyArn", "targetModelTags", "failureMessage", "sourceModelName"], [0, 0, 5, 0, 0, 0, 0, 0, () => HP, 0, 0]];
    ccd = [3, "com.amazonaws.bedrock", "GetModelCustomizationJobRequest", 0, ["jobIdentifier"], [[0, 1]]];
    ucd = [3, "com.amazonaws.bedrock", "GetModelCustomizationJobResponse", 0, ["jobArn", "jobName", "outputModelName", "outputModelArn", "clientRequestToken", "roleArn", "status", "statusDetails", "failureMessage", "creationTime", "lastModifiedTime", "endTime", "baseModelArn", "hyperParameters", "trainingDataConfig", "validationDataConfig", "outputDataConfig", "customizationType", "outputModelKmsKeyArn", "trainingMetrics", "validationMetrics", "vpcConfig", "customizationConfig"], [0, 0, 0, 0, 0, 0, 0, () => Nzs, 0, 5, 5, 5, 0, 128, [() => Z$r, 0], () => eHr, () => X$r, 0, 0, () => Lzs, () => jzs, () => GAe, () => oHr]];
    dcd = [3, "com.amazonaws.bedrock", "GetModelImportJobRequest", 0, ["jobIdentifier"], [[0, 1]]];
    pcd = [3, "com.amazonaws.bedrock", "GetModelImportJobResponse", 0, ["jobArn", "jobName", "importedModelName", "importedModelArn", "roleArn", "modelDataSource", "status", "failureMessage", "creationTime", "lastModifiedTime", "endTime", "vpcConfig", "importedModelKmsKeyArn"], [0, 0, 0, 0, 0, () => DTn, 0, 0, 5, 5, 5, () => GAe, 0]];
    mcd = [3, "com.amazonaws.bedrock", "GetModelInvocationJobRequest", 0, ["jobIdentifier"], [[0, 1]]];
    fcd = [3, "com.amazonaws.bedrock", "GetModelInvocationJobResponse", 0, ["jobArn", "jobName", "modelId", "clientRequestToken", "roleArn", "status", "message", "submitTime", "lastModifiedTime", "endTime", "inputDataConfig", "outputDataConfig", "vpcConfig", "timeoutDurationInHours", "jobExpirationTime"], [0, 0, 0, 0, 0, 0, [() => yzs, 0], 5, 5, 5, () => iHr, () => aHr, () => GAe, 1, 5]];
    hcd = [3, "com.amazonaws.bedrock", "GetModelInvocationLoggingConfigurationRequest", 0, [], []];
    gcd = [3, "com.amazonaws.bedrock", "GetModelInvocationLoggingConfigurationResponse", 0, ["loggingConfig"], [() => Ozs]];
    ycd = [3, "com.amazonaws.bedrock", "GetPromptRouterRequest", 0, ["promptRouterArn"], [[0, 1]]];
    _cd = [3, "com.amazonaws.bedrock", "GetPromptRouterResponse", 0, ["promptRouterName", "routingCriteria", "description", "createdAt", "updatedAt", "promptRouterArn", "models", "fallbackModel", "status", "type"], [0, () => Q$r, [() => Y$r, 0], 5, 5, 0, () => rHr, () => OTn, 0, 0]];
    bcd = [3, "com.amazonaws.bedrock", "GetProvisionedModelThroughputRequest", 0, ["provisionedModelId"], [[0, 1]]];
    Scd = [3, "com.amazonaws.bedrock", "GetProvisionedModelThroughputResponse", 0, ["modelUnits", "desiredModelUnits", "provisionedModelName", "provisionedModelArn", "modelArn", "desiredModelArn", "foundationModelArn", "status", "creationTime", "lastModifiedTime", "failureMessage", "commitmentDuration", "commitmentExpirationTime"], [1, 1, 0, 0, 0, 0, 0, 0, 5, 5, 0, 0, 5]];
    Tcd = [3, "com.amazonaws.bedrock", "GetUseCaseForModelAccessRequest", 0, [], []];
    Ecd = [3, "com.amazonaws.bedrock", "GetUseCaseForModelAccessResponse", 0, ["formData"], [21]];
    vcd = [3, "com.amazonaws.bedrock", "GuardrailAutomatedReasoningPolicy", 0, ["policies", "confidenceThreshold"], [64, 1]];
    Tzs = [3, "com.amazonaws.bedrock", "GuardrailAutomatedReasoningPolicyConfig", 0, ["policies", "confidenceThreshold"], [64, 1]];
    Ezs = [3, "com.amazonaws.bedrock", "GuardrailConfiguration", 0, ["guardrailId", "guardrailVersion"], [0, 0]];
    wcd = [3, "com.amazonaws.bedrock", "GuardrailContentFilter", 0, ["type", "inputStrength", "outputStrength", "inputModalities", "outputModalities", "inputAction", "outputAction", "inputEnabled", "outputEnabled"], [0, 0, 0, [() => ETn, 0], [() => ETn, 0], [() => bTn, 0], [() => bTn, 0], 2, 2]];
    Ccd = [3, "com.amazonaws.bedrock", "GuardrailContentFilterConfig", 0, ["type", "inputStrength", "outputStrength", "inputModalities", "outputModalities", "inputAction", "outputAction", "inputEnabled", "outputEnabled"], [0, 0, 0, [() => ETn, 0], [() => ETn, 0], [() => bTn, 0], [() => bTn, 0], 2, 2]];
    Rcd = [3, "com.amazonaws.bedrock", "GuardrailContentFiltersTier", 0, ["tierName"], [[() => pzs, 0]]];
    xcd = [3, "com.amazonaws.bedrock", "GuardrailContentFiltersTierConfig", 0, ["tierName"], [[() => pzs, 0]]];
    kcd = [3, "com.amazonaws.bedrock", "GuardrailContentPolicy", 0, ["filters", "tier"], [[() => zpd, 0], [() => Rcd, 0]]];
    vzs = [3, "com.amazonaws.bedrock", "GuardrailContentPolicyConfig", 0, ["filtersConfig", "tierConfig"], [[() => Kpd, 0], [() => xcd, 0]]];
    Acd = [3, "com.amazonaws.bedrock", "GuardrailContextualGroundingFilter", 0, ["type", "threshold", "action", "enabled"], [0, 1, [() => mzs, 0], 2]];
    Icd = [3, "com.amazonaws.bedrock", "GuardrailContextualGroundingFilterConfig", 0, ["type", "threshold", "action", "enabled"], [0, 1, [() => mzs, 0], 2]];
    Pcd = [3, "com.amazonaws.bedrock", "GuardrailContextualGroundingPolicy", 0, ["filters"], [[() => Ypd, 0]]];
    wzs = [3, "com.amazonaws.bedrock", "GuardrailContextualGroundingPolicyConfig", 0, ["filtersConfig"], [[() => Jpd, 0]]];
    Czs = [3, "com.amazonaws.bedrock", "GuardrailCrossRegionConfig", 0, ["guardrailProfileIdentifier"], [0]];
    Rzs = [3, "com.amazonaws.bedrock", "GuardrailCrossRegionDetails", 0, ["guardrailProfileId", "guardrailProfileArn"], [0, 0]];
    Ocd = [3, "com.amazonaws.bedrock", "GuardrailManagedWords", 0, ["type", "inputAction", "outputAction", "inputEnabled", "outputEnabled"], [0, [() => qAe, 0], [() => qAe, 0], 2, 2]];
    Dcd = [3, "com.amazonaws.bedrock", "GuardrailManagedWordsConfig", 0, ["type", "inputAction", "outputAction", "inputEnabled", "outputEnabled"], [0, [() => qAe, 0], [() => qAe, 0], 2, 2]];
    Mcd = [3, "com.amazonaws.bedrock", "GuardrailPiiEntity", 0, ["type", "action", "inputAction", "outputAction", "inputEnabled", "outputEnabled"], [0, 0, 0, 0, 2, 2]];
    Ncd = [3, "com.amazonaws.bedrock", "GuardrailPiiEntityConfig", 0, ["type", "action", "inputAction", "outputAction", "inputEnabled", "outputEnabled"], [0, 0, 0, 0, 2, 2]];
    Lcd = [3, "com.amazonaws.bedrock", "GuardrailRegex", 0, ["name", "description", "pattern", "action", "inputAction", "outputAction", "inputEnabled", "outputEnabled"], [0, 0, 0, 0, 0, 0, 2, 2]];
    Fcd = [3, "com.amazonaws.bedrock", "GuardrailRegexConfig", 0, ["name", "description", "pattern", "action", "inputAction", "outputAction", "inputEnabled", "outputEnabled"], [0, 0, 0, 0, 0, 0, 2, 2]];
    Ucd = [3, "com.amazonaws.bedrock", "GuardrailSensitiveInformationPolicy", 0, ["piiEntities", "regexes"], [() => emd, () => nmd]];
    xzs = [3, "com.amazonaws.bedrock", "GuardrailSensitiveInformationPolicyConfig", 0, ["piiEntitiesConfig", "regexesConfig"], [() => tmd, () => rmd]];
    Bcd = [3, "com.amazonaws.bedrock", "GuardrailSummary", 0, ["id", "arn", "status", "name", "description", "version", "createdAt", "updatedAt", "crossRegionDetails"], [0, 0, 0, [() => RTn, 0], [() => b1t, 0], 0, 5, 5, () => Rzs]];
    $cd = [3, "com.amazonaws.bedrock", "GuardrailTopic", 0, ["name", "definition", "examples", "type", "inputAction", "outputAction", "inputEnabled", "outputEnabled"], [[() => hzs, 0], [() => fzs, 0], [() => $zs, 0], 0, [() => STn, 0], [() => STn, 0], 2, 2]];
    Hcd = [3, "com.amazonaws.bedrock", "GuardrailTopicConfig", 0, ["name", "definition", "examples", "type", "inputAction", "outputAction", "inputEnabled", "outputEnabled"], [[() => hzs, 0], [() => fzs, 0], [() => $zs, 0], 0, [() => STn, 0], [() => STn, 0], 2, 2]];
    jcd = [3, "com.amazonaws.bedrock", "GuardrailTopicPolicy", 0, ["topics", "tier"], [[() => imd, 0], [() => qcd, 0]]];
    kzs = [3, "com.amazonaws.bedrock", "GuardrailTopicPolicyConfig", 0, ["topicsConfig", "tierConfig"], [[() => amd, 0], [() => Wcd, 0]]];
    qcd = [3, "com.amazonaws.bedrock", "GuardrailTopicsTier", 0, ["tierName"], [[() => gzs, 0]]];
    Wcd = [3, "com.amazonaws.bedrock", "GuardrailTopicsTierConfig", 0, ["tierName"], [[() => gzs, 0]]];
    Gcd = [3, "com.amazonaws.bedrock", "GuardrailWord", 0, ["text", "inputAction", "outputAction", "inputEnabled", "outputEnabled"], [0, [() => qAe, 0], [() => qAe, 0], 2, 2]];
    Vcd = [3, "com.amazonaws.bedrock", "GuardrailWordConfig", 0, ["text", "inputAction", "outputAction", "inputEnabled", "outputEnabled"], [0, [() => qAe, 0], [() => qAe, 0], 2, 2]];
    zcd = [3, "com.amazonaws.bedrock", "GuardrailWordPolicy", 0, ["words", "managedWordLists"], [[() => lmd, 0], [() => Qpd, 0]]];
    Azs = [3, "com.amazonaws.bedrock", "GuardrailWordPolicyConfig", 0, ["wordsConfig", "managedWordListsConfig"], [[() => cmd, 0], [() => Zpd, 0]]];
    Kcd = [3, "com.amazonaws.bedrock", "HumanEvaluationConfig", 0, ["humanWorkflowConfig", "customMetrics", "datasetMetricConfigs"], [[() => Jcd, 0], [() => umd, 0], [() => Bzs, 0]]];
    Ycd = [3, "com.amazonaws.bedrock", "HumanEvaluationCustomMetric", 0, ["name", "description", "ratingMethod"], [[() => dzs, 0], [() => wsd, 0], 0]];
    Jcd = [3, "com.amazonaws.bedrock", "HumanWorkflowConfig", 0, ["flowDefinitionArn", "instructions"], [0, [() => Isd, 0]]];
    Xcd = [3, "com.amazonaws.bedrock", "ImplicitFilterConfiguration", 0, ["metadataAttributes", "modelArn"], [[() => fmd, 0], 0]];
    Qcd = [3, "com.amazonaws.bedrock", "ImportedModelSummary", 0, ["modelArn", "modelName", "creationTime", "instructSupported", "modelArchitecture"], [0, 0, 5, 2, 0]];
    Zcd = [3, "com.amazonaws.bedrock", "InferenceProfileModel", 0, ["modelArn"], [0]];
    eud = [3, "com.amazonaws.bedrock", "InferenceProfileSummary", 0, ["inferenceProfileName", "description", "createdAt", "updatedAt", "inferenceProfileArn", "models", "inferenceProfileId", "status", "type"], [0, [() => K$r, 0], 5, 5, 0, () => Hzs, 0, 0, 0]];
    tud = [-3, "com.amazonaws.bedrock", "InternalServerException", {
      error: "server",
      httpError: 500
    }, ["message"], [0]];
    PY.TypeRegistry.for("com.amazonaws.bedrock").registerError(tud, InternalServerException);
    nud = [3, "com.amazonaws.bedrock", "InvocationLogsConfig", 0, ["usePromptResponse", "invocationLogSource", "requestMetadataFilters"], [2, () => Bmd, [() => qmd, 0]]];
    Izs = [3, "com.amazonaws.bedrock", "KbInferenceConfig", 0, ["textInferenceConfig"], [() => Hdd]];
    Pzs = [3, "com.amazonaws.bedrock", "KnowledgeBaseRetrievalConfiguration", 0, ["vectorSearchConfiguration"], [[() => oud, 0]]];
    rud = [3, "com.amazonaws.bedrock", "KnowledgeBaseRetrieveAndGenerateConfiguration", 0, ["knowledgeBaseId", "modelArn", "retrievalConfiguration", "generationConfiguration", "orchestrationConfiguration"], [0, 0, [() => Pzs, 0], [() => kld, 0], () => ndd]];
    oud = [3, "com.amazonaws.bedrock", "KnowledgeBaseVectorSearchConfiguration", 0, ["numberOfResults", "overrideSearchType", "filter", "implicitFilterConfiguration", "rerankingConfiguration"], [1, 0, [() => Vzs, 0], [() => Xcd, 0], [() => ppd, 0]]];
    sud = [3, "com.amazonaws.bedrock", "LegalTerm", 0, ["url"], [0]];
    iud = [3, "com.amazonaws.bedrock", "ListAutomatedReasoningPoliciesRequest", 0, ["policyArn", "nextToken", "maxResults"], [[0, {
      httpQuery: "policyArn"
    }], [0, {
      httpQuery: "nextToken"
    }], [1, {
      httpQuery: "maxResults"
    }]]];
    aud = [3, "com.amazonaws.bedrock", "ListAutomatedReasoningPoliciesResponse", 0, ["automatedReasoningPolicySummaries", "nextToken"], [[() => Ppd, 0], 0]];
    lud = [3, "com.amazonaws.bedrock", "ListAutomatedReasoningPolicyBuildWorkflowsRequest", 0, ["policyArn", "nextToken", "maxResults"], [[0, 1], [0, {
      httpQuery: "nextToken"
    }], [1, {
      httpQuery: "maxResults"
    }]]];
    cud = [3, "com.amazonaws.bedrock", "ListAutomatedReasoningPolicyBuildWorkflowsResponse", 0, ["automatedReasoningPolicyBuildWorkflowSummaries", "nextToken"], [() => vpd, 0]];
    uud = [3, "com.amazonaws.bedrock", "ListAutomatedReasoningPolicyTestCasesRequest", 0, ["policyArn", "nextToken", "maxResults"], [[0, 1], [0, {
      httpQuery: "nextToken"
    }], [1, {
      httpQuery: "maxResults"
    }]]];
    dud = [3, "com.amazonaws.bedrock", "ListAutomatedReasoningPolicyTestCasesResponse", 0, ["testCases", "nextToken"], [[() => Opd, 0], 0]];
    pud = [3, "com.amazonaws.bedrock", "ListAutomatedReasoningPolicyTestResultsRequest", 0, ["policyArn", "buildWorkflowId", "nextToken", "maxResults"], [[0, 1], [0, 1], [0, {
      httpQuery: "nextToken"
    }], [1, {
      httpQuery: "maxResults"
    }]]];
    mud = [3, "com.amazonaws.bedrock", "ListAutomatedReasoningPolicyTestResultsResponse", 0, ["testResults", "nextToken"], [[() => Dpd, 0], 0]];
    fud = [3, "com.amazonaws.bedrock", "ListCustomModelDeploymentsRequest", 0, ["createdBefore", "createdAfter", "nameContains", "maxResults", "nextToken", "sortBy", "sortOrder", "statusEquals", "modelArnEquals"], [[5, {
      httpQuery: "createdBefore"
    }], [5, {
      httpQuery: "createdAfter"
    }], [0, {
      httpQuery: "nameContains"
    }], [1, {
      httpQuery: "maxResults"
    }], [0, {
      httpQuery: "nextToken"
    }], [0, {
      httpQuery: "sortBy"
    }], [0, {
      httpQuery: "sortOrder"
    }], [0, {
      httpQuery: "statusEquals"
    }], [0, {
      httpQuery: "modelArnEquals"
    }]]];
    hud = [3, "com.amazonaws.bedrock", "ListCustomModelDeploymentsResponse", 0, ["nextToken", "modelDeploymentSummaries"], [0, () => Bpd]];
    gud = [3, "com.amazonaws.bedrock", "ListCustomModelsRequest", 0, ["creationTimeBefore", "creationTimeAfter", "nameContains", "baseModelArnEquals", "foundationModelArnEquals", "maxResults", "nextToken", "sortBy", "sortOrder", "isOwned", "modelStatus"], [[5, {
      httpQuery: "creationTimeBefore"
    }], [5, {
      httpQuery: "creationTimeAfter"
    }], [0, {
      httpQuery: "nameContains"
    }], [0, {
      httpQuery: "baseModelArnEquals"
    }], [0, {
      httpQuery: "foundationModelArnEquals"
    }], [1, {
      httpQuery: "maxResults"
    }], [0, {
      httpQuery: "nextToken"
    }], [0, {
      httpQuery: "sortBy"
    }], [0, {
      httpQuery: "sortOrder"
    }], [2, {
      httpQuery: "isOwned"
    }], [0, {
      httpQuery: "modelStatus"
    }]]];
    yud = [3, "com.amazonaws.bedrock", "ListCustomModelsResponse", 0, ["nextToken", "modelSummaries"], [0, () => $pd]];
    _ud = [3, "com.amazonaws.bedrock", "ListEvaluationJobsRequest", 0, ["creationTimeAfter", "creationTimeBefore", "statusEquals", "applicationTypeEquals", "nameContains", "maxResults", "nextToken", "sortBy", "sortOrder"], [[5, {
      httpQuery: "creationTimeAfter"
    }], [5, {
      httpQuery: "creationTimeBefore"
    }], [0, {
      httpQuery: "statusEquals"
    }], [0, {
      httpQuery: "applicationTypeEquals"
    }], [0, {
      httpQuery: "nameContains"
    }], [1, {
      httpQuery: "maxResults"
    }], [0, {
      httpQuery: "nextToken"
    }], [0, {
      httpQuery: "sortBy"
    }], [0, {
      httpQuery: "sortOrder"
    }]]];
    bud = [3, "com.amazonaws.bedrock", "ListEvaluationJobsResponse", 0, ["nextToken", "jobSummaries"], [0, () => Wpd]];
    Sud = [3, "com.amazonaws.bedrock", "ListFoundationModelAgreementOffersRequest", 0, ["modelId", "offerType"], [[0, 1], [0, {
      httpQuery: "offerType"
    }]]];
    Tud = [3, "com.amazonaws.bedrock", "ListFoundationModelAgreementOffersResponse", 0, ["modelId", "offers"], [0, () => bmd]];
    Eud = [3, "com.amazonaws.bedrock", "ListFoundationModelsRequest", 0, ["byProvider", "byCustomizationType", "byOutputModality", "byInferenceType"], [[0, {
      httpQuery: "byProvider"
    }], [0, {
      httpQuery: "byCustomizationType"
    }], [0, {
      httpQuery: "byOutputModality"
    }], [0, {
      httpQuery: "byInferenceType"
    }]]];
    vud = [3, "com.amazonaws.bedrock", "ListFoundationModelsResponse", 0, ["modelSummaries"], [() => Vpd]];
    wud = [3, "com.amazonaws.bedrock", "ListGuardrailsRequest", 0, ["guardrailIdentifier", "maxResults", "nextToken"], [[0, {
      httpQuery: "guardrailIdentifier"
    }], [1, {
      httpQuery: "maxResults"
    }], [0, {
      httpQuery: "nextToken"
    }]]];
    Cud = [3, "com.amazonaws.bedrock", "ListGuardrailsResponse", 0, ["guardrails", "nextToken"], [[() => smd, 0], 0]];
    Rud = [3, "com.amazonaws.bedrock", "ListImportedModelsRequest", 0, ["creationTimeBefore", "creationTimeAfter", "nameContains", "maxResults", "nextToken", "sortBy", "sortOrder"], [[5, {
      httpQuery: "creationTimeBefore"
    }], [5, {
      httpQuery: "creationTimeAfter"
    }], [0, {
      httpQuery: "nameContains"
    }], [1, {
      httpQuery: "maxResults"
    }], [0, {
      httpQuery: "nextToken"
    }], [0, {
      httpQuery: "sortBy"
    }], [0, {
      httpQuery: "sortOrder"
    }]]];
    xud = [3, "com.amazonaws.bedrock", "ListImportedModelsResponse", 0, ["nextToken", "modelSummaries"], [0, () => dmd]];
    kud = [3, "com.amazonaws.bedrock", "ListInferenceProfilesRequest", 0, ["maxResults", "nextToken", "typeEquals"], [[1, {
      httpQuery: "maxResults"
    }], [0, {
      httpQuery: "nextToken"
    }], [0, {
      httpQuery: "type"
    }]]];
    Aud = [3, "com.amazonaws.bedrock", "ListInferenceProfilesResponse", 0, ["inferenceProfileSummaries", "nextToken"], [[() => pmd, 0], 0]];
    Iud = [3, "com.amazonaws.bedrock", "ListMarketplaceModelEndpointsRequest", 0, ["maxResults", "nextToken", "modelSourceEquals"], [[1, {
      httpQuery: "maxResults"
    }], [0, {
      httpQuery: "nextToken"
    }], [0, {
      httpQuery: "modelSourceIdentifier"
    }]]];
    Pud = [3, "com.amazonaws.bedrock", "ListMarketplaceModelEndpointsResponse", 0, ["marketplaceModelEndpoints", "nextToken"], [() => mmd, 0]];
    Oud = [3, "com.amazonaws.bedrock", "ListModelCopyJobsRequest", 0, ["creationTimeAfter", "creationTimeBefore", "statusEquals", "sourceAccountEquals", "sourceModelArnEquals", "targetModelNameContains", "maxResults", "nextToken", "sortBy", "sortOrder"], [[5, {
      httpQuery: "creationTimeAfter"
    }], [5, {
      httpQuery: "creationTimeBefore"
    }], [0, {
      httpQuery: "statusEquals"
    }], [0, {
      httpQuery: "sourceAccountEquals"
    }], [0, {
      httpQuery: "sourceModelArnEquals"
    }], [0, {
      httpQuery: "outputModelNameContains"
    }], [1, {
      httpQuery: "maxResults"
    }], [0, {
      httpQuery: "nextToken"
    }], [0, {
      httpQuery: "sortBy"
    }], [0, {
      httpQuery: "sortOrder"
    }]]];
    Dud = [3, "com.amazonaws.bedrock", "ListModelCopyJobsResponse", 0, ["nextToken", "modelCopyJobSummaries"], [0, () => hmd]];
    Mud = [3, "com.amazonaws.bedrock", "ListModelCustomizationJobsRequest", 0, ["creationTimeAfter", "creationTimeBefore", "statusEquals", "nameContains", "maxResults", "nextToken", "sortBy", "sortOrder"], [[5, {
      httpQuery: "creationTimeAfter"
    }], [5, {
      httpQuery: "creationTimeBefore"
    }], [0, {
      httpQuery: "statusEquals"
    }], [0, {
      httpQuery: "nameContains"
    }], [1, {
      httpQuery: "maxResults"
    }], [0, {
      httpQuery: "nextToken"
    }], [0, {
      httpQuery: "sortBy"
    }], [0, {
      httpQuery: "sortOrder"
    }]]];
    Nud = [3, "com.amazonaws.bedrock", "ListModelCustomizationJobsResponse", 0, ["nextToken", "modelCustomizationJobSummaries"], [0, () => gmd]];
    Lud = [3, "com.amazonaws.bedrock", "ListModelImportJobsRequest", 0, ["creationTimeAfter", "creationTimeBefore", "statusEquals", "nameContains", "maxResults", "nextToken", "sortBy", "sortOrder"], [[5, {
      httpQuery: "creationTimeAfter"
    }], [5, {
      httpQuery: "creationTimeBefore"
    }], [0, {
      httpQuery: "statusEquals"
    }], [0, {
      httpQuery: "nameContains"
    }], [1, {
      httpQuery: "maxResults"
    }], [0, {
      httpQuery: "nextToken"
    }], [0, {
      httpQuery: "sortBy"
    }], [0, {
      httpQuery: "sortOrder"
    }]]];
    Fud = [3, "com.amazonaws.bedrock", "ListModelImportJobsResponse", 0, ["nextToken", "modelImportJobSummaries"], [0, () => ymd]];
    Uud = [3, "com.amazonaws.bedrock", "ListModelInvocationJobsRequest", 0, ["submitTimeAfter", "submitTimeBefore", "statusEquals", "nameContains", "maxResults", "nextToken", "sortBy", "sortOrder"], [[5, {
      httpQuery: "submitTimeAfter"
    }], [5, {
      httpQuery: "submitTimeBefore"
    }], [0, {
      httpQuery: "statusEquals"
    }], [0, {
      httpQuery: "nameContains"
    }], [1, {
      httpQuery: "maxResults"
    }], [0, {
      httpQuery: "nextToken"
    }], [0, {
      httpQuery: "sortBy"
    }], [0, {
      httpQuery: "sortOrder"
    }]]];
    Bud = [3, "com.amazonaws.bedrock", "ListModelInvocationJobsResponse", 0, ["nextToken", "invocationJobSummaries"], [0, [() => _md, 0]]];
    $ud = [3, "com.amazonaws.bedrock", "ListPromptRoutersRequest", 0, ["maxResults", "nextToken", "type"], [[1, {
      httpQuery: "maxResults"
    }], [0, {
      httpQuery: "nextToken"
    }], [0, {
      httpQuery: "type"
    }]]];
    Hud = [3, "com.amazonaws.bedrock", "ListPromptRoutersResponse", 0, ["promptRouterSummaries", "nextToken"], [[() => Smd, 0], 0]];
    jud = [3, "com.amazonaws.bedrock", "ListProvisionedModelThroughputsRequest", 0, ["creationTimeAfter", "creationTimeBefore", "statusEquals", "modelArnEquals", "nameContains", "maxResults", "nextToken", "sortBy", "sortOrder"], [[5, {
      httpQuery: "creationTimeAfter"
    }], [5, {
      httpQuery: "creationTimeBefore"
    }], [0, {
      httpQuery: "statusEquals"
    }], [0, {
      httpQuery: "modelArnEquals"
    }], [0, {
      httpQuery: "nameContains"
    }], [1, {
      httpQuery: "maxResults"
    }], [0, {
      httpQuery: "nextToken"
    }], [0, {
      httpQuery: "sortBy"
    }], [0, {
      httpQuery: "sortOrder"
    }]]];
    qud = [3, "com.amazonaws.bedrock", "ListProvisionedModelThroughputsResponse", 0, ["nextToken", "provisionedModelSummaries"], [0, () => Tmd]];
    Wud = [3, "com.amazonaws.bedrock", "ListTagsForResourceRequest", 0, ["resourceARN"], [0]];
    Gud = [3, "com.amazonaws.bedrock", "ListTagsForResourceResponse", 0, ["tags"], [() => HP]];
    Ozs = [3, "com.amazonaws.bedrock", "LoggingConfig", 0, ["cloudWatchConfig", "s3Config", "textDataDeliveryEnabled", "imageDataDeliveryEnabled", "embeddingDataDeliveryEnabled", "videoDataDeliveryEnabled"], [() => Gid, () => Mzs, 2, 2, 2, 2]];
    PTn = [3, "com.amazonaws.bedrock", "MarketplaceModelEndpoint", 0, ["endpointArn", "modelSourceIdentifier", "status", "statusMessage", "createdAt", "updatedAt", "endpointConfig", "endpointStatus", "endpointStatusMessage"], [0, 0, 0, 0, 5, 5, () => sHr, 0, 0]];
    Vud = [3, "com.amazonaws.bedrock", "MarketplaceModelEndpointSummary", 0, ["endpointArn", "modelSourceIdentifier", "status", "statusMessage", "createdAt", "updatedAt"], [0, 0, 0, 0, 5, 5]];
    zud = [3, "com.amazonaws.bedrock", "MetadataAttributeSchema", 8, ["key", "type", "description"], [0, 0, 0]];
    Kud = [3, "com.amazonaws.bedrock", "MetadataConfigurationForReranking", 0, ["selectionMode", "selectiveModeConfiguration"], [0, [() => Wmd, 0]]];
    Yud = [3, "com.amazonaws.bedrock", "ModelCopyJobSummary", 0, ["jobArn", "status", "creationTime", "targetModelArn", "targetModelName", "sourceAccountId", "sourceModelArn", "targetModelKmsKeyArn", "targetModelTags", "failureMessage", "sourceModelName"], [0, 0, 5, 0, 0, 0, 0, 0, () => HP, 0, 0]];
    Jud = [3, "com.amazonaws.bedrock", "ModelCustomizationJobSummary", 0, ["jobArn", "baseModelArn", "jobName", "status", "statusDetails", "lastModifiedTime", "creationTime", "endTime", "customModelArn", "customModelName", "customizationType"], [0, 0, 0, 0, () => Nzs, 5, 5, 5, 0, 0, 0]];
    Xud = [3, "com.amazonaws.bedrock", "ModelImportJobSummary", 0, ["jobArn", "jobName", "status", "lastModifiedTime", "creationTime", "endTime", "importedModelArn", "importedModelName"], [0, 0, 0, 5, 5, 5, 0, 0]];
    Qud = [3, "com.amazonaws.bedrock", "ModelInvocationJobS3InputDataConfig", 0, ["s3InputFormat", "s3Uri", "s3BucketOwner"], [0, 0, 0]];
    Zud = [3, "com.amazonaws.bedrock", "ModelInvocationJobS3OutputDataConfig", 0, ["s3Uri", "s3EncryptionKeyId", "s3BucketOwner"], [0, 0, 0]];
    edd = [3, "com.amazonaws.bedrock", "ModelInvocationJobSummary", 0, ["jobArn", "jobName", "modelId", "clientRequestToken", "roleArn", "status", "message", "submitTime", "lastModifiedTime", "endTime", "inputDataConfig", "outputDataConfig", "vpcConfig", "timeoutDurationInHours", "jobExpirationTime"], [0, 0, 0, 0, 0, 0, [() => yzs, 0], 5, 5, 5, () => iHr, () => aHr, () => GAe, 1, 5]];
    tdd = [3, "com.amazonaws.bedrock", "Offer", 0, ["offerId", "offerToken", "termDetails"], [0, 0, () => $dd]];
    ndd = [3, "com.amazonaws.bedrock", "OrchestrationConfiguration", 0, ["queryTransformationConfiguration"], [() => ddd]];
    X$r = [3, "com.amazonaws.bedrock", "OutputDataConfig", 0, ["s3Uri"], [0]];
    rdd = [3, "com.amazonaws.bedrock", "PerformanceConfiguration", 0, ["latency"], [0]];
    odd = [3, "com.amazonaws.bedrock", "PricingTerm", 0, ["rateCard"], [() => vmd]];
    sdd = [3, "com.amazonaws.bedrock", "PromptRouterSummary", 0, ["promptRouterName", "routingCriteria", "description", "createdAt", "updatedAt", "promptRouterArn", "models", "fallbackModel", "status", "type"], [0, () => Q$r, [() => Y$r, 0], 5, 5, 0, () => rHr, () => OTn, 0, 0]];
    OTn = [3, "com.amazonaws.bedrock", "PromptRouterTargetModel", 0, ["modelArn"], [0]];
    Dzs = [3, "com.amazonaws.bedrock", "PromptTemplate", 0, ["textPromptTemplate"], [[() => Dsd, 0]]];
    idd = [3, "com.amazonaws.bedrock", "ProvisionedModelSummary", 0, ["provisionedModelName", "provisionedModelArn", "modelArn", "desiredModelArn", "foundationModelArn", "modelUnits", "desiredModelUnits", "status", "commitmentDuration", "commitmentExpirationTime", "creationTime", "lastModifiedTime"], [0, 0, 0, 0, 0, 1, 1, 0, 0, 5, 5, 5]];
    add = [3, "com.amazonaws.bedrock", "PutModelInvocationLoggingConfigurationRequest", 0, ["loggingConfig"], [() => Ozs]];
    ldd = [3, "com.amazonaws.bedrock", "PutModelInvocationLoggingConfigurationResponse", 0, [], []];
    cdd = [3, "com.amazonaws.bedrock", "PutUseCaseForModelAccessRequest", 0, ["formData"], [21]];
    udd = [3, "com.amazonaws.bedrock", "PutUseCaseForModelAccessResponse", 0, [], []];
    ddd = [3, "com.amazonaws.bedrock", "QueryTransformationConfiguration", 0, ["type"], [0]];
    pdd = [3, "com.amazonaws.bedrock", "RatingScaleItem", 0, ["definition", "value"], [0, () => jmd]];
    mdd = [3, "com.amazonaws.bedrock", "RegisterMarketplaceModelEndpointRequest", 0, ["endpointIdentifier", "modelSourceIdentifier"], [[0, 1], 0]];
    fdd = [3, "com.amazonaws.bedrock", "RegisterMarketplaceModelEndpointResponse", 0, ["marketplaceModelEndpoint"], [() => PTn]];
    hdd = [3, "com.amazonaws.bedrock", "RequestMetadataBaseFilters", 0, ["equals", "notEquals"], [[() => vTn, 0], [() => vTn, 0]]];
    gdd = [-3, "com.amazonaws.bedrock", "ResourceInUseException", {
      error: "client",
      httpError: 400
    }, ["message"], [0]];
    PY.TypeRegistry.for("com.amazonaws.bedrock").registerError(gdd, ResourceInUseException);
    ydd = [-3, "com.amazonaws.bedrock", "ResourceNotFoundException", {
      error: "client",
      httpError: 404
    }, ["message"], [0]];
    PY.TypeRegistry.for("com.amazonaws.bedrock").registerError(ydd, ResourceNotFoundException);
    _dd = [3, "com.amazonaws.bedrock", "RetrieveAndGenerateConfiguration", 0, ["type", "knowledgeBaseConfiguration", "externalSourcesConfiguration"], [0, [() => rud, 0], [() => wld, 0]]];
    bdd = [3, "com.amazonaws.bedrock", "RetrieveConfig", 0, ["knowledgeBaseId", "knowledgeBaseRetrievalConfiguration"], [0, [() => Pzs, 0]]];
    Q$r = [3, "com.amazonaws.bedrock", "RoutingCriteria", 0, ["responseQualityDifference"], [1]];
    Mzs = [3, "com.amazonaws.bedrock", "S3Config", 0, ["bucketName", "keyPrefix"], [0, 0]];
    Sdd = [3, "com.amazonaws.bedrock", "S3DataSource", 0, ["s3Uri"], [0]];
    Tdd = [3, "com.amazonaws.bedrock", "S3ObjectDoc", 0, ["uri"], [0]];
    Edd = [3, "com.amazonaws.bedrock", "SageMakerEndpoint", 0, ["initialInstanceCount", "instanceType", "executionRole", "kmsEncryptionKey", "vpc"], [1, 0, 0, 0, () => GAe]];
    vdd = [-3, "com.amazonaws.bedrock", "ServiceQuotaExceededException", {
      error: "client",
      httpError: 400
    }, ["message"], [0]];
    PY.TypeRegistry.for("com.amazonaws.bedrock").registerError(vdd, ServiceQuotaExceededException);
    wdd = [-3, "com.amazonaws.bedrock", "ServiceUnavailableException", {
      error: "server",
      httpError: 503
    }, ["message"], [0]];
    PY.TypeRegistry.for("com.amazonaws.bedrock").registerError(wdd, ServiceUnavailableException);
    Cdd = [3, "com.amazonaws.bedrock", "StartAutomatedReasoningPolicyBuildWorkflowRequest", 0, ["policyArn", "buildWorkflowType", "clientRequestToken", "sourceContent"], [[0, 1], [0, 1], [0, {
      httpHeader: "x-amz-client-token",
      idempotencyToken: 1
    }], [() => cid, 16]]];
    Rdd = [3, "com.amazonaws.bedrock", "StartAutomatedReasoningPolicyBuildWorkflowResponse", 0, ["policyArn", "buildWorkflowId"], [0, 0]];
    xdd = [3, "com.amazonaws.bedrock", "StartAutomatedReasoningPolicyTestWorkflowRequest", 0, ["policyArn", "buildWorkflowId", "testCaseIds", "clientRequestToken"], [[0, 1], [0, 1], 64, [0, 4]]];
    kdd = [3, "com.amazonaws.bedrock", "StartAutomatedReasoningPolicyTestWorkflowResponse", 0, ["policyArn"], [0]];
    Nzs = [3, "com.amazonaws.bedrock", "StatusDetails", 0, ["validationDetails", "dataProcessingDetails", "trainingDetails"], [() => spd, () => Dad, () => Wdd]];
    Add = [3, "com.amazonaws.bedrock", "StopEvaluationJobRequest", 0, ["jobIdentifier"], [[() => _1t, 1]]];
    Idd = [3, "com.amazonaws.bedrock", "StopEvaluationJobResponse", 0, [], []];
    Pdd = [3, "com.amazonaws.bedrock", "StopModelCustomizationJobRequest", 0, ["jobIdentifier"], [[0, 1]]];
    Odd = [3, "com.amazonaws.bedrock", "StopModelCustomizationJobResponse", 0, [], []];
    Ddd = [3, "com.amazonaws.bedrock", "StopModelInvocationJobRequest", 0, ["jobIdentifier"], [[0, 1]]];
    Mdd = [3, "com.amazonaws.bedrock", "StopModelInvocationJobResponse", 0, [], []];
    Ndd = [3, "com.amazonaws.bedrock", "SupportTerm", 0, ["refundPolicyDescription"], [0]];
    Ldd = [3, "com.amazonaws.bedrock", "Tag", 0, ["key", "value"], [0, 0]];
    Fdd = [3, "com.amazonaws.bedrock", "TagResourceRequest", 0, ["resourceARN", "tags"], [0, () => HP]];
    Udd = [3, "com.amazonaws.bedrock", "TagResourceResponse", 0, [], []];
    Bdd = [3, "com.amazonaws.bedrock", "TeacherModelConfig", 0, ["teacherModelIdentifier", "maxResponseLengthForInference"], [0, 1]];
    $dd = [3, "com.amazonaws.bedrock", "TermDetails", 0, ["usageBasedPricingTerm", "legalTerm", "supportTerm", "validityTerm"], [() => odd, () => sud, () => Ndd, () => cpd]];
    Hdd = [3, "com.amazonaws.bedrock", "TextInferenceConfig", 0, ["temperature", "topP", "maxTokens", "stopSequences"], [1, 1, 1, 64]];
    jdd = [-3, "com.amazonaws.bedrock", "ThrottlingException", {
      error: "client",
      httpError: 429
    }, ["message"], [0]];
    PY.TypeRegistry.for("com.amazonaws.bedrock").registerError(jdd, ThrottlingException);
    qdd = [-3, "com.amazonaws.bedrock", "TooManyTagsException", {
      error: "client",
      httpError: 400
    }, ["message", "resourceName"], [0, 0]];
    PY.TypeRegistry.for("com.amazonaws.bedrock").registerError(qdd, TooManyTagsException);
    Z$r = [3, "com.amazonaws.bedrock", "TrainingDataConfig", 0, ["s3Uri", "invocationLogsConfig"], [0, [() => nud, 0]]];
    Wdd = [3, "com.amazonaws.bedrock", "TrainingDetails", 0, ["status", "creationTime", "lastModifiedTime"], [0, 5, 5]];
    Lzs = [3, "com.amazonaws.bedrock", "TrainingMetrics", 0, ["trainingLoss"], [1]];
    Gdd = [3, "com.amazonaws.bedrock", "UntagResourceRequest", 0, ["resourceARN", "tagKeys"], [0, 64]];
    Vdd = [3, "com.amazonaws.bedrock", "UntagResourceResponse", 0, [], []];
    zdd = [3, "com.amazonaws.bedrock", "UpdateAutomatedReasoningPolicyAnnotationsRequest", 0, ["policyArn", "buildWorkflowId", "annotations", "lastUpdatedAnnotationSetHash"], [[0, 1], [0, 1], [() => nHr, 0], 0]];
    Kdd = [3, "com.amazonaws.bedrock", "UpdateAutomatedReasoningPolicyAnnotationsResponse", 0, ["policyArn", "buildWorkflowId", "annotationSetHash", "updatedAt"], [0, 0, 0, 5]];
    Ydd = [3, "com.amazonaws.bedrock", "UpdateAutomatedReasoningPolicyRequest", 0, ["policyArn", "policyDefinition", "name", "description"], [[0, 1], [() => T1t, 0], [() => WAe, 0], [() => Zrt, 0]]];
    Jdd = [3, "com.amazonaws.bedrock", "UpdateAutomatedReasoningPolicyResponse", 0, ["policyArn", "name", "definitionHash", "updatedAt"], [0, [() => WAe, 0], 0, 5]];
    Xdd = [3, "com.amazonaws.bedrock", "UpdateAutomatedReasoningPolicyTestCaseRequest", 0, ["policyArn", "testCaseId", "guardContent", "queryContent", "lastUpdatedAt", "expectedAggregatedFindingsResult", "confidenceThreshold", "clientRequestToken"], [[0, 1], [0, 1], [() => wTn, 0], [() => CTn, 0], 5, 0, 1, [0, 4]]];
    Qdd = [3, "com.amazonaws.bedrock", "UpdateAutomatedReasoningPolicyTestCaseResponse", 0, ["policyArn", "testCaseId"], [0, 0]];
    Zdd = [3, "com.amazonaws.bedrock", "UpdateGuardrailRequest", 0, ["guardrailIdentifier", "name", "description", "topicPolicyConfig", "contentPolicyConfig", "wordPolicyConfig", "sensitiveInformationPolicyConfig", "contextualGroundingPolicyConfig", "automatedReasoningPolicyConfig", "crossRegionConfig", "blockedInputMessaging", "blockedOutputsMessaging", "kmsKeyId"], [[0, 1], [() => RTn, 0], [() => b1t, 0], [() => kzs, 0], [() => vzs, 0], [() => Azs, 0], () => xzs, [() => wzs, 0], () => Tzs, () => Czs, [() => Qrt, 0], [() => Qrt, 0], 0]];
    epd = [3, "com.amazonaws.bedrock", "UpdateGuardrailResponse", 0, ["guardrailId", "guardrailArn", "version", "updatedAt"], [0, 0, 0, 5]];
    tpd = [3, "com.amazonaws.bedrock", "UpdateMarketplaceModelEndpointRequest", 0, ["endpointArn", "endpointConfig", "clientRequestToken"], [[0, 1], () => sHr, [0, 4]]];
    npd = [3, "com.amazonaws.bedrock", "UpdateMarketplaceModelEndpointResponse", 0, ["marketplaceModelEndpoint"], [() => PTn]];
    rpd = [3, "com.amazonaws.bedrock", "UpdateProvisionedModelThroughputRequest", 0, ["provisionedModelId", "desiredProvisionedModelName", "desiredModelId"], [[0, 1], 0, 0]];
    opd = [3, "com.amazonaws.bedrock", "UpdateProvisionedModelThroughputResponse", 0, [], []];
    eHr = [3, "com.amazonaws.bedrock", "ValidationDataConfig", 0, ["validators"], [() => Cmd]];
    spd = [3, "com.amazonaws.bedrock", "ValidationDetails", 0, ["status", "creationTime", "lastModifiedTime"], [0, 5, 5]];
    ipd = [-3, "com.amazonaws.bedrock", "ValidationException", {
      error: "client",
      httpError: 400
    }, ["message"], [0]];
    PY.TypeRegistry.for("com.amazonaws.bedrock").registerError(ipd, ValidationException);
    apd = [3, "com.amazonaws.bedrock", "Validator", 0, ["s3Uri"], [0]];
    lpd = [3, "com.amazonaws.bedrock", "ValidatorMetric", 0, ["validationLoss"], [1]];
    cpd = [3, "com.amazonaws.bedrock", "ValidityTerm", 0, ["agreementDuration"], [0]];
    upd = [3, "com.amazonaws.bedrock", "VectorSearchBedrockRerankingConfiguration", 0, ["modelConfiguration", "numberOfRerankedResults", "metadataConfiguration"], [() => dpd, 1, [() => Kud, 0]]];
    dpd = [3, "com.amazonaws.bedrock", "VectorSearchBedrockRerankingModelConfiguration", 0, ["modelArn", "additionalModelRequestFields"], [0, 143]];
    ppd = [3, "com.amazonaws.bedrock", "VectorSearchRerankingConfiguration", 0, ["type", "bedrockRerankingConfiguration"], [0, [() => upd, 0]]];
    GAe = [3, "com.amazonaws.bedrock", "VpcConfig", 0, ["subnetIds", "securityGroupIds"], [64, 64]];
    mpd = [-3, "smithy.ts.sdk.synthetic.com.amazonaws.bedrock", "BedrockServiceException", 0, [], []];
    PY.TypeRegistry.for("smithy.ts.sdk.synthetic.com.amazonaws.bedrock").registerError(mpd, BedrockServiceException);
    fpd = [1, "com.amazonaws.bedrock", "AutomatedEvaluationCustomMetrics", 0, [() => Rmd, 0]];
    hpd = [1, "com.amazonaws.bedrock", "AutomatedReasoningCheckDifferenceScenarioList", 0, [() => TTn, 0]];
    gpd = [1, "com.amazonaws.bedrock", "AutomatedReasoningCheckFindingList", 0, [() => xmd, 0]];
    tzs = [1, "com.amazonaws.bedrock", "AutomatedReasoningCheckInputTextReferenceList", 0, [() => Bsd, 0]];
    tHr = [1, "com.amazonaws.bedrock", "AutomatedReasoningCheckRuleList", 0, () => jsd];
    ypd = [1, "com.amazonaws.bedrock", "AutomatedReasoningCheckTranslationList", 0, [() => S1t, 0]];
    _pd = [1, "com.amazonaws.bedrock", "AutomatedReasoningCheckTranslationOptionList", 0, [() => Vsd, 0]];
    y1t = [1, "com.amazonaws.bedrock", "AutomatedReasoningLogicStatementList", 0, [() => Ksd, 0]];
    nHr = [1, "com.amazonaws.bedrock", "AutomatedReasoningPolicyAnnotationList", 0, [() => qzs, 0]];
    bpd = [1, "com.amazonaws.bedrock", "AutomatedReasoningPolicyBuildLogEntryList", 0, [() => oid, 0]];
    Spd = [1, "com.amazonaws.bedrock", "AutomatedReasoningPolicyBuildStepList", 0, [() => sid, 0]];
    Tpd = [1, "com.amazonaws.bedrock", "AutomatedReasoningPolicyBuildStepMessageList", 0, () => iid];
    Epd = [1, "com.amazonaws.bedrock", "AutomatedReasoningPolicyBuildWorkflowDocumentList", 0, [() => aid, 0]];
    vpd = [1, "com.amazonaws.bedrock", "AutomatedReasoningPolicyBuildWorkflowSummaries", 0, () => uid];
    wpd = [1, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionRuleList", 0, [() => kTn, 0]];
    Cpd = [1, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionTypeList", 0, [() => ATn, 0]];
    Rpd = [1, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionTypeNameList", 0, [() => Fle, 0]];
    Fzs = [1, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionTypeValueList", 0, [() => pid, 0]];
    xpd = [1, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionTypeValuePairList", 0, [() => mid, 0]];
    kpd = [1, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionVariableList", 0, [() => ITn, 0]];
    Uzs = [1, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionVariableNameList", 0, [() => eqe, 0]];
    Apd = [1, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDisjointRuleSetList", 0, [() => Tid, 0]];
    Ipd = [1, "com.amazonaws.bedrock", "AutomatedReasoningPolicyGeneratedTestCaseList", 0, [() => Eid, 0]];
    Ppd = [1, "com.amazonaws.bedrock", "AutomatedReasoningPolicySummaries", 0, [() => xid, 0]];
    Opd = [1, "com.amazonaws.bedrock", "AutomatedReasoningPolicyTestCaseList", 0, [() => J$r, 0]];
    Dpd = [1, "com.amazonaws.bedrock", "AutomatedReasoningPolicyTestList", 0, [() => _zs, 0]];
    Mpd = [1, "com.amazonaws.bedrock", "AutomatedReasoningPolicyTypeValueAnnotationList", 0, [() => Omd, 0]];
    Npd = [1, "com.amazonaws.bedrock", "BatchDeleteEvaluationJobErrors", 0, [() => Fid, 0]];
    Lpd = [1, "com.amazonaws.bedrock", "BatchDeleteEvaluationJobItems", 0, [() => Uid, 0]];
    Fpd = [1, "com.amazonaws.bedrock", "BedrockEvaluatorModels", 0, () => Hid];
    Upd = [1, "com.amazonaws.bedrock", "CustomMetricBedrockEvaluatorModels", 0, () => xad];
    Bpd = [1, "com.amazonaws.bedrock", "CustomModelDeploymentSummaryList", 0, () => Iad];
    $pd = [1, "com.amazonaws.bedrock", "CustomModelSummaryList", 0, () => Pad];
    Bzs = [1, "com.amazonaws.bedrock", "EvaluationDatasetMetricConfigs", 0, [() => pld, 0]];
    Hpd = [1, "com.amazonaws.bedrock", "EvaluationJobIdentifiers", 0, [() => _1t, 0]];
    jpd = [1, "com.amazonaws.bedrock", "EvaluationMetricNames", 0, [() => dzs, 0]];
    qpd = [1, "com.amazonaws.bedrock", "EvaluationModelConfigs", 0, [() => Nmd, 0]];
    Wpd = [1, "com.amazonaws.bedrock", "EvaluationSummaries", 0, () => bld];
    Gpd = [1, "com.amazonaws.bedrock", "ExternalSources", 0, [() => Eld, 0]];
    nzs = [1, "com.amazonaws.bedrock", "FieldsForReranking", 8, () => Cld];
    Vpd = [1, "com.amazonaws.bedrock", "FoundationModelSummaryList", 0, () => xld];
    zpd = [1, "com.amazonaws.bedrock", "GuardrailContentFilters", 0, [() => wcd, 0]];
    Kpd = [1, "com.amazonaws.bedrock", "GuardrailContentFiltersConfig", 0, [() => Ccd, 0]];
    Ypd = [1, "com.amazonaws.bedrock", "GuardrailContextualGroundingFilters", 0, [() => Acd, 0]];
    Jpd = [1, "com.amazonaws.bedrock", "GuardrailContextualGroundingFiltersConfig", 0, [() => Icd, 0]];
    Xpd = [1, "com.amazonaws.bedrock", "GuardrailFailureRecommendations", 0, [() => Rsd, 0]];
    Qpd = [1, "com.amazonaws.bedrock", "GuardrailManagedWordLists", 0, [() => Ocd, 0]];
    Zpd = [1, "com.amazonaws.bedrock", "GuardrailManagedWordListsConfig", 0, [() => Dcd, 0]];
    ETn = [1, "com.amazonaws.bedrock", "GuardrailModalities", 0, [() => xsd, 0]];
    emd = [1, "com.amazonaws.bedrock", "GuardrailPiiEntities", 0, () => Mcd];
    tmd = [1, "com.amazonaws.bedrock", "GuardrailPiiEntitiesConfig", 0, () => Ncd];
    nmd = [1, "com.amazonaws.bedrock", "GuardrailRegexes", 0, () => Lcd];
    rmd = [1, "com.amazonaws.bedrock", "GuardrailRegexesConfig", 0, () => Fcd];
    omd = [1, "com.amazonaws.bedrock", "GuardrailStatusReasons", 0, [() => ksd, 0]];
    smd = [1, "com.amazonaws.bedrock", "GuardrailSummaries", 0, [() => Bcd, 0]];
    $zs = [1, "com.amazonaws.bedrock", "GuardrailTopicExamples", 0, [() => Asd, 0]];
    imd = [1, "com.amazonaws.bedrock", "GuardrailTopics", 0, [() => $cd, 0]];
    amd = [1, "com.amazonaws.bedrock", "GuardrailTopicsConfig", 0, [() => Hcd, 0]];
    lmd = [1, "com.amazonaws.bedrock", "GuardrailWords", 0, [() => Gcd, 0]];
    cmd = [1, "com.amazonaws.bedrock", "GuardrailWordsConfig", 0, [() => Vcd, 0]];
    umd = [1, "com.amazonaws.bedrock", "HumanEvaluationCustomMetrics", 0, [() => Ycd, 0]];
    dmd = [1, "com.amazonaws.bedrock", "ImportedModelSummaryList", 0, () => Qcd];
    Hzs = [1, "com.amazonaws.bedrock", "InferenceProfileModels", 0, () => Zcd];
    pmd = [1, "com.amazonaws.bedrock", "InferenceProfileSummaries", 0, [() => eud, 0]];
    mmd = [1, "com.amazonaws.bedrock", "MarketplaceModelEndpointSummaries", 0, () => Vud];
    fmd = [1, "com.amazonaws.bedrock", "MetadataAttributeSchemaList", 0, [() => zud, 0]];
    hmd = [1, "com.amazonaws.bedrock", "ModelCopyJobSummaries", 0, () => Yud];
    gmd = [1, "com.amazonaws.bedrock", "ModelCustomizationJobSummaries", 0, () => Jud];
    ymd = [1, "com.amazonaws.bedrock", "ModelImportJobSummaries", 0, () => Xud];
    _md = [1, "com.amazonaws.bedrock", "ModelInvocationJobSummaries", 0, [() => edd, 0]];
    bmd = [1, "com.amazonaws.bedrock", "Offers", 0, () => tdd];
    Smd = [1, "com.amazonaws.bedrock", "PromptRouterSummaries", 0, [() => sdd, 0]];
    rHr = [1, "com.amazonaws.bedrock", "PromptRouterTargetModels", 0, () => OTn];
    Tmd = [1, "com.amazonaws.bedrock", "ProvisionedModelSummaries", 0, () => idd];
    Emd = [1, "com.amazonaws.bedrock", "RagConfigs", 0, [() => Hmd, 0]];
    vmd = [1, "com.amazonaws.bedrock", "RateCard", 0, () => lld];
    wmd = [1, "com.amazonaws.bedrock", "RatingScale", 0, () => pdd];
    rzs = [1, "com.amazonaws.bedrock", "RequestMetadataFiltersList", 0, [() => hdd, 0]];
    ozs = [1, "com.amazonaws.bedrock", "RetrievalFilterList", 0, [() => Vzs, 0]];
    HP = [1, "com.amazonaws.bedrock", "TagList", 0, () => Ldd];
    jzs = [1, "com.amazonaws.bedrock", "ValidationMetrics", 0, () => lpd];
    Cmd = [1, "com.amazonaws.bedrock", "Validators", 0, () => apd];
    vTn = [2, "com.amazonaws.bedrock", "RequestMetadataMap", 8, 0, 0];
    Rmd = [3, "com.amazonaws.bedrock", "AutomatedEvaluationCustomMetricSource", 0, ["customMetricDefinition"], [[() => kad, 0]]];
    xmd = [3, "com.amazonaws.bedrock", "AutomatedReasoningCheckFinding", 0, ["valid", "invalid", "satisfiable", "impossible", "translationAmbiguous", "tooComplex", "noTranslations"], [[() => zsd, 0], [() => $sd, 0], [() => qsd, 0], [() => Usd, 0], [() => Gsd, 0], () => Wsd, () => Hsd]];
    qzs = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyAnnotation", 0, ["addType", "updateType", "deleteType", "addVariable", "updateVariable", "deleteVariable", "addRule", "updateRule", "deleteRule", "addRuleFromNaturalLanguage", "updateFromRulesFeedback", "updateFromScenarioFeedback", "ingestContent"], [[() => Qsd, 0], [() => Oid, 0], [() => gid, 0], [() => tid, 0], [() => Nid, 0], [() => bid, 0], [() => Ysd, 0], [() => Iid, 0], () => fid, [() => Jsd, 0], [() => kid, 0], [() => Aid, 0], [() => wid, 0]]];
    kmd = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyBuildResultAssets", 0, ["policyDefinition", "qualityReport", "buildLog", "generatedTestCases"], [[() => T1t, 0], [() => did, 0], [() => rid, 0], [() => vid, 0]]];
    Amd = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyBuildStepContext", 0, ["planning", "mutation"], [() => Cid, [() => Pmd, 0]]];
    Imd = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyDefinitionElement", 0, ["policyDefinitionVariable", "policyDefinitionType", "policyDefinitionRule"], [[() => ITn, 0], [() => ATn, 0], [() => kTn, 0]]];
    Pmd = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyMutation", 0, ["addType", "updateType", "deleteType", "addVariable", "updateVariable", "deleteVariable", "addRule", "updateRule", "deleteRule"], [[() => Zsd, 0], [() => Did, 0], [() => yid, 0], [() => nid, 0], [() => Lid, 0], [() => Sid, 0], [() => Xsd, 0], [() => Pid, 0], () => hid]];
    Omd = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyTypeValueAnnotation", 0, ["addTypeValue", "updateTypeValue", "deleteTypeValue"], [[() => eid, 0], [() => Mid, 0], () => _id]];
    Dmd = [3, "com.amazonaws.bedrock", "AutomatedReasoningPolicyWorkflowTypeContent", 0, ["documents", "policyRepairAssets"], [[() => Epd, 0], [() => lid, 0]]];
    oHr = [3, "com.amazonaws.bedrock", "CustomizationConfig", 0, ["distillationConfig"], [() => cld]];
    sHr = [3, "com.amazonaws.bedrock", "EndpointConfig", 0, ["sageMaker"], [() => Edd]];
    Wzs = [3, "com.amazonaws.bedrock", "EvaluationConfig", 0, ["automated", "human"], [[() => Lsd, 0], [() => Kcd, 0]]];
    Mmd = [3, "com.amazonaws.bedrock", "EvaluationDatasetLocation", 0, ["s3Uri"], [0]];
    Gzs = [3, "com.amazonaws.bedrock", "EvaluationInferenceConfig", 0, ["models", "ragConfigs"], [[() => qpd, 0], [() => Emd, 0]]];
    Nmd = [3, "com.amazonaws.bedrock", "EvaluationModelConfig", 0, ["bedrockModel", "precomputedInferenceSource"], [[() => uld, 0], () => hld]];
    Lmd = [3, "com.amazonaws.bedrock", "EvaluationPrecomputedRagSourceConfig", 0, ["retrieveSourceConfig", "retrieveAndGenerateSourceConfig"], [() => yld, () => gld]];
    Fmd = [3, "com.amazonaws.bedrock", "EvaluatorModelConfig", 0, ["bedrockEvaluatorModels"], [() => Fpd]];
    Umd = [3, "com.amazonaws.bedrock", "InferenceProfileModelSource", 0, ["copyFrom"], [0]];
    Bmd = [3, "com.amazonaws.bedrock", "InvocationLogSource", 0, ["s3Uri"], [0]];
    $md = [3, "com.amazonaws.bedrock", "KnowledgeBaseConfig", 0, ["retrieveConfig", "retrieveAndGenerateConfig"], [[() => bdd, 0], [() => _dd, 0]]];
    DTn = [3, "com.amazonaws.bedrock", "ModelDataSource", 0, ["s3DataSource"], [() => Sdd]];
    iHr = [3, "com.amazonaws.bedrock", "ModelInvocationJobInputDataConfig", 0, ["s3InputDataConfig"], [() => Qud]];
    aHr = [3, "com.amazonaws.bedrock", "ModelInvocationJobOutputDataConfig", 0, ["s3OutputDataConfig"], [() => Zud]];
    Hmd = [3, "com.amazonaws.bedrock", "RAGConfig", 0, ["knowledgeBaseConfig", "precomputedRagSourceConfig"], [[() => $md, 0], () => Lmd]];
    jmd = [3, "com.amazonaws.bedrock", "RatingScaleItemValue", 0, ["stringValue", "floatValue"], [0, 1]];
    qmd = [3, "com.amazonaws.bedrock", "RequestMetadataFilters", 0, ["equals", "notEquals", "andAll", "orAll"], [[() => vTn, 0], [() => vTn, 0], [() => rzs, 0], [() => rzs, 0]]];
    Wmd = [3, "com.amazonaws.bedrock", "RerankingMetadataSelectiveModeConfiguration", 0, ["fieldsToInclude", "fieldsToExclude"], [[() => nzs, 0], [() => nzs, 0]]];
    Vzs = [3, "com.amazonaws.bedrock", "RetrievalFilter", 8, ["equals", "notEquals", "greaterThan", "greaterThanOrEquals", "lessThan", "lessThanOrEquals", "in", "notIn", "startsWith", "listContains", "stringContains", "andAll", "orAll"], [() => rne, () => rne, () => rne, () => rne, () => rne, () => rne, () => rne, () => rne, () => rne, () => rne, () => rne, [() => ozs, 0], [() => ozs, 0]]];
    zzs = [9, "com.amazonaws.bedrock", "BatchDeleteEvaluationJob", {
      http: ["POST", "/evaluation-jobs/batch-delete", 202]
    }, () => Bid, () => $id];
    Kzs = [9, "com.amazonaws.bedrock", "CancelAutomatedReasoningPolicyBuildWorkflow", {
      http: ["POST", "/automated-reasoning-policies/{policyArn}/build-workflows/{buildWorkflowId}/cancel", 202]
    }, () => qid, () => Wid];
    Yzs = [9, "com.amazonaws.bedrock", "CreateAutomatedReasoningPolicy", {
      http: ["POST", "/automated-reasoning-policies", 200]
    }, () => zid, () => Kid];
    Jzs = [9, "com.amazonaws.bedrock", "CreateAutomatedReasoningPolicyTestCase", {
      http: ["POST", "/automated-reasoning-policies/{policyArn}/test-cases", 200]
    }, () => Yid, () => Jid];
    Xzs = [9, "com.amazonaws.bedrock", "CreateAutomatedReasoningPolicyVersion", {
      http: ["POST", "/automated-reasoning-policies/{policyArn}/versions", 200]
    }, () => Xid, () => Qid];
    Qzs = [9, "com.amazonaws.bedrock", "CreateCustomModel", {
      http: ["POST", "/custom-models/create-custom-model", 202]
    }, () => tad, () => nad];
    Zzs = [9, "com.amazonaws.bedrock", "CreateCustomModelDeployment", {
      http: ["POST", "/model-customization/custom-model-deployments", 202]
    }, () => Zid, () => ead];
    eKs = [9, "com.amazonaws.bedrock", "CreateEvaluationJob", {
      http: ["POST", "/evaluation-jobs", 202]
    }, () => rad, () => oad];
    tKs = [9, "com.amazonaws.bedrock", "CreateFoundationModelAgreement", {
      http: ["POST", "/create-foundation-model-agreement", 202]
    }, () => sad, () => iad];
    nKs = [9, "com.amazonaws.bedrock", "CreateGuardrail", {
      http: ["POST", "/guardrails", 202]
    }, () => aad, () => lad];
    rKs = [9, "com.amazonaws.bedrock", "CreateGuardrailVersion", {
      http: ["POST", "/guardrails/{guardrailIdentifier}", 202]
    }, () => cad, () => uad];
    oKs = [9, "com.amazonaws.bedrock", "CreateInferenceProfile", {
      http: ["POST", "/inference-profiles", 201]
    }, () => dad, () => pad];
    sKs = [9, "com.amazonaws.bedrock", "CreateMarketplaceModelEndpoint", {
      http: ["POST", "/marketplace-model/endpoints", 200]
    }, () => mad, () => fad];
    iKs = [9, "com.amazonaws.bedrock", "CreateModelCopyJob", {
      http: ["POST", "/model-copy-jobs", 201]
    }, () => had, () => gad];
    aKs = [9, "com.amazonaws.bedrock", "CreateModelCustomizationJob", {
      http: ["POST", "/model-customization-jobs", 201]
    }, () => yad, () => _ad];
    lKs = [9, "com.amazonaws.bedrock", "CreateModelImportJob", {
      http: ["POST", "/model-import-jobs", 201]
    }, () => bad, () => Sad];
    cKs = [9, "com.amazonaws.bedrock", "CreateModelInvocationJob", {
      http: ["POST", "/model-invocation-job", 200]
    }, () => Tad, () => Ead];
    uKs = [9, "com.amazonaws.bedrock", "CreatePromptRouter", {
      http: ["POST", "/prompt-routers", 200]
    }, () => vad, () => wad];
    dKs = [9, "com.amazonaws.bedrock", "CreateProvisionedModelThroughput", {
      http: ["POST", "/provisioned-model-throughput", 201]
    }, () => Cad, () => Rad];
    pKs = [9, "com.amazonaws.bedrock", "DeleteAutomatedReasoningPolicy", {
      http: ["DELETE", "/automated-reasoning-policies/{policyArn}", 202]
    }, () => Lad, () => Fad];
    mKs = [9, "com.amazonaws.bedrock", "DeleteAutomatedReasoningPolicyBuildWorkflow", {
      http: ["DELETE", "/automated-reasoning-policies/{policyArn}/build-workflows/{buildWorkflowId}", 202]
    }, () => Mad, () => Nad];
    fKs = [9, "com.amazonaws.bedrock", "DeleteAutomatedReasoningPolicyTestCase", {
      http: ["DELETE", "/automated-reasoning-policies/{policyArn}/test-cases/{testCaseId}", 202]
    }, () => Uad, () => Bad];
    hKs = [9, "com.amazonaws.bedrock", "DeleteCustomModel", {
      http: ["DELETE", "/custom-models/{modelIdentifier}", 200]
    }, () => jad, () => qad];
    gKs = [9, "com.amazonaws.bedrock", "DeleteCustomModelDeployment", {
      http: ["DELETE", "/model-customization/custom-model-deployments/{customModelDeploymentIdentifier}", 200]
    }, () => $ad, () => Had];
    yKs = [9, "com.amazonaws.bedrock", "DeleteFoundationModelAgreement", {
      http: ["POST", "/delete-foundation-model-agreement", 202]
    }, () => Wad, () => Gad];
    _Ks = [9, "com.amazonaws.bedrock", "DeleteGuardrail", {
      http: ["DELETE", "/guardrails/{guardrailIdentifier}", 202]
    }, () => Vad, () => zad];
    bKs = [9, "com.amazonaws.bedrock", "DeleteImportedModel", {
      http: ["DELETE", "/imported-models/{modelIdentifier}", 200]
    }, () => Kad, () => Yad];
    SKs = [9, "com.amazonaws.bedrock", "DeleteInferenceProfile", {
      http: ["DELETE", "/inference-profiles/{inferenceProfileIdentifier}", 200]
    }, () => Jad, () => Xad];
    TKs = [9, "com.amazonaws.bedrock", "DeleteMarketplaceModelEndpoint", {
      http: ["DELETE", "/marketplace-model/endpoints/{endpointArn}", 200]
    }, () => Qad, () => Zad];
    EKs = [9, "com.amazonaws.bedrock", "DeleteModelInvocationLoggingConfiguration", {
      http: ["DELETE", "/logging/modelinvocations", 200]
    }, () => eld, () => tld];
    vKs = [9, "com.amazonaws.bedrock", "DeletePromptRouter", {
      http: ["DELETE", "/prompt-routers/{promptRouterArn}", 200]
    }, () => nld, () => rld];
    wKs = [9, "com.amazonaws.bedrock", "DeleteProvisionedModelThroughput", {
      http: ["DELETE", "/provisioned-model-throughput/{provisionedModelId}", 200]
    }, () => old, () => sld];
    CKs = [9, "com.amazonaws.bedrock", "DeregisterMarketplaceModelEndpoint", {
      http: ["DELETE", "/marketplace-model/endpoints/{endpointArn}/registration", 200]
    }, () => ild, () => ald];
    RKs = [9, "com.amazonaws.bedrock", "ExportAutomatedReasoningPolicyVersion", {
      http: ["GET", "/automated-reasoning-policies/{policyArn}/export", 200]
    }, () => Sld, () => Tld];
    xKs = [9, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicy", {
      http: ["GET", "/automated-reasoning-policies/{policyArn}", 200]
    }, () => Fld, () => Uld];
    kKs = [9, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicyAnnotations", {
      http: ["GET", "/automated-reasoning-policies/{policyArn}/build-workflows/{buildWorkflowId}/annotations", 200]
    }, () => Ald, () => Ild];
    AKs = [9, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicyBuildWorkflow", {
      http: ["GET", "/automated-reasoning-policies/{policyArn}/build-workflows/{buildWorkflowId}", 200]
    }, () => Pld, () => Old];
    IKs = [9, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicyBuildWorkflowResultAssets", {
      http: ["GET", "/automated-reasoning-policies/{policyArn}/build-workflows/{buildWorkflowId}/result-assets", 200]
    }, () => Dld, () => Mld];
    PKs = [9, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicyNextScenario", {
      http: ["GET", "/automated-reasoning-policies/{policyArn}/build-workflows/{buildWorkflowId}/scenarios", 200]
    }, () => Nld, () => Lld];
    OKs = [9, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicyTestCase", {
      http: ["GET", "/automated-reasoning-policies/{policyArn}/test-cases/{testCaseId}", 200]
    }, () => Bld, () => $ld];
    DKs = [9, "com.amazonaws.bedrock", "GetAutomatedReasoningPolicyTestResult", {
      http: ["GET", "/automated-reasoning-policies/{policyArn}/build-workflows/{buildWorkflowId}/test-cases/{testCaseId}/test-results", 200]
    }, () => Hld, () => jld];
    MKs = [9, "com.amazonaws.bedrock", "GetCustomModel", {
      http: ["GET", "/custom-models/{modelIdentifier}", 200]
    }, () => Gld, () => Vld];
    NKs = [9, "com.amazonaws.bedrock", "GetCustomModelDeployment", {
      http: ["GET", "/model-customization/custom-model-deployments/{customModelDeploymentIdentifier}", 200]
    }, () => qld, () => Wld];
    LKs = [9, "com.amazonaws.bedrock", "GetEvaluationJob", {
      http: ["GET", "/evaluation-jobs/{jobIdentifier}", 200]
    }, () => zld, () => Kld];
    FKs = [9, "com.amazonaws.bedrock", "GetFoundationModel", {
      http: ["GET", "/foundation-models/{modelIdentifier}", 200]
    }, () => Xld, () => Qld];
    UKs = [9, "com.amazonaws.bedrock", "GetFoundationModelAvailability", {
      http: ["GET", "/foundation-model-availability/{modelId}", 200]
    }, () => Yld, () => Jld];
    BKs = [9, "com.amazonaws.bedrock", "GetGuardrail", {
      http: ["GET", "/guardrails/{guardrailIdentifier}", 200]
    }, () => Zld, () => ecd];
    $Ks = [9, "com.amazonaws.bedrock", "GetImportedModel", {
      http: ["GET", "/imported-models/{modelIdentifier}", 200]
    }, () => tcd, () => ncd];
    HKs = [9, "com.amazonaws.bedrock", "GetInferenceProfile", {
      http: ["GET", "/inference-profiles/{inferenceProfileIdentifier}", 200]
    }, () => rcd, () => ocd];
    jKs = [9, "com.amazonaws.bedrock", "GetMarketplaceModelEndpoint", {
      http: ["GET", "/marketplace-model/endpoints/{endpointArn}", 200]
    }, () => scd, () => icd];
    qKs = [9, "com.amazonaws.bedrock", "GetModelCopyJob", {
      http: ["GET", "/model-copy-jobs/{jobArn}", 200]
    }, () => acd, () => lcd];
    WKs = [9, "com.amazonaws.bedrock", "GetModelCustomizationJob", {
      http: ["GET", "/model-customization-jobs/{jobIdentifier}", 200]
    }, () => ccd, () => ucd];
    GKs = [9, "com.amazonaws.bedrock", "GetModelImportJob", {
      http: ["GET", "/model-import-jobs/{jobIdentifier}", 200]
    }, () => dcd, () => pcd];
    VKs = [9, "com.amazonaws.bedrock", "GetModelInvocationJob", {
      http: ["GET", "/model-invocation-job/{jobIdentifier}", 200]
    }, () => mcd, () => fcd];
    zKs = [9, "com.amazonaws.bedrock", "GetModelInvocationLoggingConfiguration", {
      http: ["GET", "/logging/modelinvocations", 200]
    }, () => hcd, () => gcd];
    KKs = [9, "com.amazonaws.bedrock", "GetPromptRouter", {
      http: ["GET", "/prompt-routers/{promptRouterArn}", 200]
    }, () => ycd, () => _cd];
    YKs = [9, "com.amazonaws.bedrock", "GetProvisionedModelThroughput", {
      http: ["GET", "/provisioned-model-throughput/{provisionedModelId}", 200]
    }, () => bcd, () => Scd];
    JKs = [9, "com.amazonaws.bedrock", "GetUseCaseForModelAccess", {
      http: ["GET", "/use-case-for-model-access", 200]
    }, () => Tcd, () => Ecd];
    XKs = [9, "com.amazonaws.bedrock", "ListAutomatedReasoningPolicies", {
      http: ["GET", "/automated-reasoning-policies", 200]
    }, () => iud, () => aud];
    QKs = [9, "com.amazonaws.bedrock", "ListAutomatedReasoningPolicyBuildWorkflows", {
      http: ["GET", "/automated-reasoning-policies/{policyArn}/build-workflows", 200]
    }, () => lud, () => cud];
    ZKs = [9, "com.amazonaws.bedrock", "ListAutomatedReasoningPolicyTestCases", {
      http: ["GET", "/automated-reasoning-policies/{policyArn}/test-cases", 200]
    }, () => uud, () => dud];
    e7s = [9, "com.amazonaws.bedrock", "ListAutomatedReasoningPolicyTestResults", {
      http: ["GET", "/automated-reasoning-policies/{policyArn}/build-workflows/{buildWorkflowId}/test-results", 200]
    }, () => pud, () => mud];
    t7s = [9, "com.amazonaws.bedrock", "ListCustomModelDeployments", {
      http: ["GET", "/model-customization/custom-model-deployments", 200]
    }, () => fud, () => hud];
    n7s = [9, "com.amazonaws.bedrock", "ListCustomModels", {
      http: ["GET", "/custom-models", 200]
    }, () => gud, () => yud];
    r7s = [9, "com.amazonaws.bedrock", "ListEvaluationJobs", {
      http: ["GET", "/evaluation-jobs", 200]
    }, () => _ud, () => bud];
    o7s = [9, "com.amazonaws.bedrock", "ListFoundationModelAgreementOffers", {
      http: ["GET", "/list-foundation-model-agreement-offers/{modelId}", 200]
    }, () => Sud, () => Tud];
    s7s = [9, "com.amazonaws.bedrock", "ListFoundationModels", {
      http: ["GET", "/foundation-models", 200]
    }, () => Eud, () => vud];
    i7s = [9, "com.amazonaws.bedrock", "ListGuardrails", {
      http: ["GET", "/guardrails", 200]
    }, () => wud, () => Cud];
    a7s = [9, "com.amazonaws.bedrock", "ListImportedModels", {
      http: ["GET", "/imported-models", 200]
    }, () => Rud, () => xud];
    l7s = [9, "com.amazonaws.bedrock", "ListInferenceProfiles", {
      http: ["GET", "/inference-profiles", 200]
    }, () => kud, () => Aud];
    c7s = [9, "com.amazonaws.bedrock", "ListMarketplaceModelEndpoints", {
      http: ["GET", "/marketplace-model/endpoints", 200]
    }, () => Iud, () => Pud];
    u7s = [9, "com.amazonaws.bedrock", "ListModelCopyJobs", {
      http: ["GET", "/model-copy-jobs", 200]
    }, () => Oud, () => Dud];
    d7s = [9, "com.amazonaws.bedrock", "ListModelCustomizationJobs", {
      http: ["GET", "/model-customization-jobs", 200]
    }, () => Mud, () => Nud];
    p7s = [9, "com.amazonaws.bedrock", "ListModelImportJobs", {
      http: ["GET", "/model-import-jobs", 200]
    }, () => Lud, () => Fud];
    m7s = [9, "com.amazonaws.bedrock", "ListModelInvocationJobs", {
      http: ["GET", "/model-invocation-jobs", 200]
    }, () => Uud, () => Bud];
    f7s = [9, "com.amazonaws.bedrock", "ListPromptRouters", {
      http: ["GET", "/prompt-routers", 200]
    }, () => $ud, () => Hud];
    h7s = [9, "com.amazonaws.bedrock", "ListProvisionedModelThroughputs", {
      http: ["GET", "/provisioned-model-throughputs", 200]
    }, () => jud, () => qud];
    g7s = [9, "com.amazonaws.bedrock", "ListTagsForResource", {
      http: ["POST", "/listTagsForResource", 200]
    }, () => Wud, () => Gud];
    y7s = [9, "com.amazonaws.bedrock", "PutModelInvocationLoggingConfiguration", {
      http: ["PUT", "/logging/modelinvocations", 200]
    }, () => add, () => ldd];
    _7s = [9, "com.amazonaws.bedrock", "PutUseCaseForModelAccess", {
      http: ["POST", "/use-case-for-model-access", 201]
    }, () => cdd, () => udd];
    b7s = [9, "com.amazonaws.bedrock", "RegisterMarketplaceModelEndpoint", {
      http: ["POST", "/marketplace-model/endpoints/{endpointIdentifier}/registration", 200]
    }, () => mdd, () => fdd];
    S7s = [9, "com.amazonaws.bedrock", "StartAutomatedReasoningPolicyBuildWorkflow", {
      http: ["POST", "/automated-reasoning-policies/{policyArn}/build-workflows/{buildWorkflowType}/start", 200]
    }, () => Cdd, () => Rdd];
    T7s = [9, "com.amazonaws.bedrock", "StartAutomatedReasoningPolicyTestWorkflow", {
      http: ["POST", "/automated-reasoning-policies/{policyArn}/build-workflows/{buildWorkflowId}/test-workflows", 200]
    }, () => xdd, () => kdd];
    E7s = [9, "com.amazonaws.bedrock", "StopEvaluationJob", {
      http: ["POST", "/evaluation-job/{jobIdentifier}/stop", 200]
    }, () => Add, () => Idd];
    v7s = [9, "com.amazonaws.bedrock", "StopModelCustomizationJob", {
      http: ["POST", "/model-customization-jobs/{jobIdentifier}/stop", 200]
    }, () => Pdd, () => Odd];
    w7s = [9, "com.amazonaws.bedrock", "StopModelInvocationJob", {
      http: ["POST", "/model-invocation-job/{jobIdentifier}/stop", 200]
    }, () => Ddd, () => Mdd];
    C7s = [9, "com.amazonaws.bedrock", "TagResource", {
      http: ["POST", "/tagResource", 200]
    }, () => Fdd, () => Udd];
    R7s = [9, "com.amazonaws.bedrock", "UntagResource", {
      http: ["POST", "/untagResource", 200]
    }, () => Gdd, () => Vdd];
    x7s = [9, "com.amazonaws.bedrock", "UpdateAutomatedReasoningPolicy", {
      http: ["PATCH", "/automated-reasoning-policies/{policyArn}", 200]
    }, () => Ydd, () => Jdd];
    k7s = [9, "com.amazonaws.bedrock", "UpdateAutomatedReasoningPolicyAnnotations", {
      http: ["PATCH", "/automated-reasoning-policies/{policyArn}/build-workflows/{buildWorkflowId}/annotations", 200]
    }, () => zdd, () => Kdd];
    A7s = [9, "com.amazonaws.bedrock", "UpdateAutomatedReasoningPolicyTestCase", {
      http: ["PATCH", "/automated-reasoning-policies/{policyArn}/test-cases/{testCaseId}", 200]
    }, () => Xdd, () => Qdd];
    I7s = [9, "com.amazonaws.bedrock", "UpdateGuardrail", {
      http: ["PUT", "/guardrails/{guardrailIdentifier}", 202]
    }, () => Zdd, () => epd];
    P7s = [9, "com.amazonaws.bedrock", "UpdateMarketplaceModelEndpoint", {
      http: ["PATCH", "/marketplace-model/endpoints/{endpointArn}", 200]
    }, () => tpd, () => npd];
    O7s = [9, "com.amazonaws.bedrock", "UpdateProvisionedModelThroughput", {
      http: ["PATCH", "/provisioned-model-throughput/{provisionedModelId}", 200]
    }, () => rpd, () => opd];
  });
  var D7s;
  var BatchDeleteEvaluationJobCommand;
  var lHr = __lazy(() => {
    ni();
    vi();
    xi();
    D7s = __toESM(_o(), 1);
    BatchDeleteEvaluationJobCommand = class MTn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [D7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "BatchDeleteEvaluationJob", {}).n("BedrockClient", "BatchDeleteEvaluationJobCommand").sc(zzs).build() {};
  });
  var M7s;
  var CancelAutomatedReasoningPolicyBuildWorkflowCommand;
  var cHr = __lazy(() => {
    ni();
    vi();
    xi();
    M7s = __toESM(_o(), 1);
    CancelAutomatedReasoningPolicyBuildWorkflowCommand = class NTn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [M7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "CancelAutomatedReasoningPolicyBuildWorkflow", {}).n("BedrockClient", "CancelAutomatedReasoningPolicyBuildWorkflowCommand").sc(Kzs).build() {};
  });
  var N7s;
  var CreateAutomatedReasoningPolicyCommand;
  var uHr = __lazy(() => {
    ni();
    vi();
    xi();
    N7s = __toESM(_o(), 1);
    CreateAutomatedReasoningPolicyCommand = class LTn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [N7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "CreateAutomatedReasoningPolicy", {}).n("BedrockClient", "CreateAutomatedReasoningPolicyCommand").sc(Yzs).build() {};
  });
  var L7s;
  var CreateAutomatedReasoningPolicyTestCaseCommand;
  var dHr = __lazy(() => {
    ni();
    vi();
    xi();
    L7s = __toESM(_o(), 1);
    CreateAutomatedReasoningPolicyTestCaseCommand = class FTn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [L7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "CreateAutomatedReasoningPolicyTestCase", {}).n("BedrockClient", "CreateAutomatedReasoningPolicyTestCaseCommand").sc(Jzs).build() {};
  });
  var F7s;
  var CreateAutomatedReasoningPolicyVersionCommand;
  var pHr = __lazy(() => {
    ni();
    vi();
    xi();
    F7s = __toESM(_o(), 1);
    CreateAutomatedReasoningPolicyVersionCommand = class UTn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [F7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "CreateAutomatedReasoningPolicyVersion", {}).n("BedrockClient", "CreateAutomatedReasoningPolicyVersionCommand").sc(Xzs).build() {};
  });
  var U7s;
  var CreateCustomModelCommand;
  var mHr = __lazy(() => {
    ni();
    vi();
    xi();
    U7s = __toESM(_o(), 1);
    CreateCustomModelCommand = class BTn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [U7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "CreateCustomModel", {}).n("BedrockClient", "CreateCustomModelCommand").sc(Qzs).build() {};
  });
  var B7s;
  var CreateCustomModelDeploymentCommand;
  var fHr = __lazy(() => {
    ni();
    vi();
    xi();
    B7s = __toESM(_o(), 1);
    CreateCustomModelDeploymentCommand = class $Tn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [B7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "CreateCustomModelDeployment", {}).n("BedrockClient", "CreateCustomModelDeploymentCommand").sc(Zzs).build() {};
  });
  var $7s;
  var CreateEvaluationJobCommand;
  var hHr = __lazy(() => {
    ni();
    vi();
    xi();
    $7s = __toESM(_o(), 1);
    CreateEvaluationJobCommand = class HTn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [$7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "CreateEvaluationJob", {}).n("BedrockClient", "CreateEvaluationJobCommand").sc(eKs).build() {};
  });
  var H7s;
  var CreateFoundationModelAgreementCommand;
  var gHr = __lazy(() => {
    ni();
    vi();
    xi();
    H7s = __toESM(_o(), 1);
    CreateFoundationModelAgreementCommand = class jTn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [H7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "CreateFoundationModelAgreement", {}).n("BedrockClient", "CreateFoundationModelAgreementCommand").sc(tKs).build() {};
  });
  var j7s;
  var CreateGuardrailCommand;
  var yHr = __lazy(() => {
    ni();
    vi();
    xi();
    j7s = __toESM(_o(), 1);
    CreateGuardrailCommand = class qTn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [j7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "CreateGuardrail", {}).n("BedrockClient", "CreateGuardrailCommand").sc(nKs).build() {};
  });
  var q7s;
  var CreateGuardrailVersionCommand;
  var _Hr = __lazy(() => {
    ni();
    vi();
    xi();
    q7s = __toESM(_o(), 1);
    CreateGuardrailVersionCommand = class WTn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [q7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "CreateGuardrailVersion", {}).n("BedrockClient", "CreateGuardrailVersionCommand").sc(rKs).build() {};
  });
  var W7s;
  var CreateInferenceProfileCommand;
  var bHr = __lazy(() => {
    ni();
    vi();
    xi();
    W7s = __toESM(_o(), 1);
    CreateInferenceProfileCommand = class GTn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [W7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "CreateInferenceProfile", {}).n("BedrockClient", "CreateInferenceProfileCommand").sc(oKs).build() {};
  });
  var G7s;
  var CreateMarketplaceModelEndpointCommand;
  var SHr = __lazy(() => {
    ni();
    vi();
    xi();
    G7s = __toESM(_o(), 1);
    CreateMarketplaceModelEndpointCommand = class VTn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [G7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "CreateMarketplaceModelEndpoint", {}).n("BedrockClient", "CreateMarketplaceModelEndpointCommand").sc(sKs).build() {};
  });
  var V7s;
  var CreateModelCopyJobCommand;
  var THr = __lazy(() => {
    ni();
    vi();
    xi();
    V7s = __toESM(_o(), 1);
    CreateModelCopyJobCommand = class zTn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [V7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "CreateModelCopyJob", {}).n("BedrockClient", "CreateModelCopyJobCommand").sc(iKs).build() {};
  });
  var z7s;
  var CreateModelCustomizationJobCommand;
  var EHr = __lazy(() => {
    ni();
    vi();
    xi();
    z7s = __toESM(_o(), 1);
    CreateModelCustomizationJobCommand = class KTn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [z7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "CreateModelCustomizationJob", {}).n("BedrockClient", "CreateModelCustomizationJobCommand").sc(aKs).build() {};
  });
  var K7s;
  var CreateModelImportJobCommand;
  var vHr = __lazy(() => {
    ni();
    vi();
    xi();
    K7s = __toESM(_o(), 1);
    CreateModelImportJobCommand = class YTn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [K7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "CreateModelImportJob", {}).n("BedrockClient", "CreateModelImportJobCommand").sc(lKs).build() {};
  });
  var Y7s;
  var CreateModelInvocationJobCommand;
  var wHr = __lazy(() => {
    ni();
    vi();
    xi();
    Y7s = __toESM(_o(), 1);
    CreateModelInvocationJobCommand = class JTn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [Y7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "CreateModelInvocationJob", {}).n("BedrockClient", "CreateModelInvocationJobCommand").sc(cKs).build() {};
  });
  var J7s;
  var CreatePromptRouterCommand;
  var CHr = __lazy(() => {
    ni();
    vi();
    xi();
    J7s = __toESM(_o(), 1);
    CreatePromptRouterCommand = class XTn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [J7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "CreatePromptRouter", {}).n("BedrockClient", "CreatePromptRouterCommand").sc(uKs).build() {};
  });
  var X7s;
  var CreateProvisionedModelThroughputCommand;
  var RHr = __lazy(() => {
    ni();
    vi();
    xi();
    X7s = __toESM(_o(), 1);
    CreateProvisionedModelThroughputCommand = class QTn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [X7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "CreateProvisionedModelThroughput", {}).n("BedrockClient", "CreateProvisionedModelThroughputCommand").sc(dKs).build() {};
  });
  var Q7s;
  var DeleteAutomatedReasoningPolicyBuildWorkflowCommand;
  var xHr = __lazy(() => {
    ni();
    vi();
    xi();
    Q7s = __toESM(_o(), 1);
    DeleteAutomatedReasoningPolicyBuildWorkflowCommand = class ZTn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [Q7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "DeleteAutomatedReasoningPolicyBuildWorkflow", {}).n("BedrockClient", "DeleteAutomatedReasoningPolicyBuildWorkflowCommand").sc(mKs).build() {};
  });
  var Z7s;
  var DeleteAutomatedReasoningPolicyCommand;
  var kHr = __lazy(() => {
    ni();
    vi();
    xi();
    Z7s = __toESM(_o(), 1);
    DeleteAutomatedReasoningPolicyCommand = class eEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [Z7s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "DeleteAutomatedReasoningPolicy", {}).n("BedrockClient", "DeleteAutomatedReasoningPolicyCommand").sc(pKs).build() {};
  });
  var eYs;
  var DeleteAutomatedReasoningPolicyTestCaseCommand;
  var AHr = __lazy(() => {
    ni();
    vi();
    xi();
    eYs = __toESM(_o(), 1);
    DeleteAutomatedReasoningPolicyTestCaseCommand = class tEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [eYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "DeleteAutomatedReasoningPolicyTestCase", {}).n("BedrockClient", "DeleteAutomatedReasoningPolicyTestCaseCommand").sc(fKs).build() {};
  });
  var tYs;
  var DeleteCustomModelCommand;
  var IHr = __lazy(() => {
    ni();
    vi();
    xi();
    tYs = __toESM(_o(), 1);
    DeleteCustomModelCommand = class nEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [tYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "DeleteCustomModel", {}).n("BedrockClient", "DeleteCustomModelCommand").sc(hKs).build() {};
  });
  var nYs;
  var DeleteCustomModelDeploymentCommand;
  var PHr = __lazy(() => {
    ni();
    vi();
    xi();
    nYs = __toESM(_o(), 1);
    DeleteCustomModelDeploymentCommand = class rEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [nYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "DeleteCustomModelDeployment", {}).n("BedrockClient", "DeleteCustomModelDeploymentCommand").sc(gKs).build() {};
  });
  var rYs;
  var DeleteFoundationModelAgreementCommand;
  var OHr = __lazy(() => {
    ni();
    vi();
    xi();
    rYs = __toESM(_o(), 1);
    DeleteFoundationModelAgreementCommand = class oEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [rYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "DeleteFoundationModelAgreement", {}).n("BedrockClient", "DeleteFoundationModelAgreementCommand").sc(yKs).build() {};
  });
  var oYs;
  var DeleteGuardrailCommand;
  var DHr = __lazy(() => {
    ni();
    vi();
    xi();
    oYs = __toESM(_o(), 1);
    DeleteGuardrailCommand = class sEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [oYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "DeleteGuardrail", {}).n("BedrockClient", "DeleteGuardrailCommand").sc(_Ks).build() {};
  });
  var sYs;
  var DeleteImportedModelCommand;
  var MHr = __lazy(() => {
    ni();
    vi();
    xi();
    sYs = __toESM(_o(), 1);
    DeleteImportedModelCommand = class iEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [sYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "DeleteImportedModel", {}).n("BedrockClient", "DeleteImportedModelCommand").sc(bKs).build() {};
  });
  var iYs;
  var DeleteInferenceProfileCommand;
  var NHr = __lazy(() => {
    ni();
    vi();
    xi();
    iYs = __toESM(_o(), 1);
    DeleteInferenceProfileCommand = class aEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [iYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "DeleteInferenceProfile", {}).n("BedrockClient", "DeleteInferenceProfileCommand").sc(SKs).build() {};
  });
  var aYs;
  var DeleteMarketplaceModelEndpointCommand;
  var LHr = __lazy(() => {
    ni();
    vi();
    xi();
    aYs = __toESM(_o(), 1);
    DeleteMarketplaceModelEndpointCommand = class lEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [aYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "DeleteMarketplaceModelEndpoint", {}).n("BedrockClient", "DeleteMarketplaceModelEndpointCommand").sc(TKs).build() {};
  });
  var lYs;
  var DeleteModelInvocationLoggingConfigurationCommand;
  var FHr = __lazy(() => {
    ni();
    vi();
    xi();
    lYs = __toESM(_o(), 1);
    DeleteModelInvocationLoggingConfigurationCommand = class cEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [lYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "DeleteModelInvocationLoggingConfiguration", {}).n("BedrockClient", "DeleteModelInvocationLoggingConfigurationCommand").sc(EKs).build() {};
  });
  var cYs;
  var DeletePromptRouterCommand;
  var UHr = __lazy(() => {
    ni();
    vi();
    xi();
    cYs = __toESM(_o(), 1);
    DeletePromptRouterCommand = class uEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [cYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "DeletePromptRouter", {}).n("BedrockClient", "DeletePromptRouterCommand").sc(vKs).build() {};
  });
  var uYs;
  var DeleteProvisionedModelThroughputCommand;
  var BHr = __lazy(() => {
    ni();
    vi();
    xi();
    uYs = __toESM(_o(), 1);
    DeleteProvisionedModelThroughputCommand = class dEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [uYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "DeleteProvisionedModelThroughput", {}).n("BedrockClient", "DeleteProvisionedModelThroughputCommand").sc(wKs).build() {};
  });
  var dYs;
  var DeregisterMarketplaceModelEndpointCommand;
  var $Hr = __lazy(() => {
    ni();
    vi();
    xi();
    dYs = __toESM(_o(), 1);
    DeregisterMarketplaceModelEndpointCommand = class pEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [dYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "DeregisterMarketplaceModelEndpoint", {}).n("BedrockClient", "DeregisterMarketplaceModelEndpointCommand").sc(CKs).build() {};
  });
  var pYs;
  var ExportAutomatedReasoningPolicyVersionCommand;
  var HHr = __lazy(() => {
    ni();
    vi();
    xi();
    pYs = __toESM(_o(), 1);
    ExportAutomatedReasoningPolicyVersionCommand = class mEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [pYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ExportAutomatedReasoningPolicyVersion", {}).n("BedrockClient", "ExportAutomatedReasoningPolicyVersionCommand").sc(RKs).build() {};
  });
  var mYs;
  var GetAutomatedReasoningPolicyAnnotationsCommand;
  var jHr = __lazy(() => {
    ni();
    vi();
    xi();
    mYs = __toESM(_o(), 1);
    GetAutomatedReasoningPolicyAnnotationsCommand = class fEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [mYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetAutomatedReasoningPolicyAnnotations", {}).n("BedrockClient", "GetAutomatedReasoningPolicyAnnotationsCommand").sc(kKs).build() {};
  });
  var fYs;
  var GetAutomatedReasoningPolicyBuildWorkflowCommand;
  var qHr = __lazy(() => {
    ni();
    vi();
    xi();
    fYs = __toESM(_o(), 1);
    GetAutomatedReasoningPolicyBuildWorkflowCommand = class hEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [fYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetAutomatedReasoningPolicyBuildWorkflow", {}).n("BedrockClient", "GetAutomatedReasoningPolicyBuildWorkflowCommand").sc(AKs).build() {};
  });
  var hYs;
  var GetAutomatedReasoningPolicyBuildWorkflowResultAssetsCommand;
  var WHr = __lazy(() => {
    ni();
    vi();
    xi();
    hYs = __toESM(_o(), 1);
    GetAutomatedReasoningPolicyBuildWorkflowResultAssetsCommand = class gEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [hYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetAutomatedReasoningPolicyBuildWorkflowResultAssets", {}).n("BedrockClient", "GetAutomatedReasoningPolicyBuildWorkflowResultAssetsCommand").sc(IKs).build() {};
  });
  var gYs;
  var GetAutomatedReasoningPolicyCommand;
  var GHr = __lazy(() => {
    ni();
    vi();
    xi();
    gYs = __toESM(_o(), 1);
    GetAutomatedReasoningPolicyCommand = class yEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [gYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetAutomatedReasoningPolicy", {}).n("BedrockClient", "GetAutomatedReasoningPolicyCommand").sc(xKs).build() {};
  });
  var yYs;
  var GetAutomatedReasoningPolicyNextScenarioCommand;
  var VHr = __lazy(() => {
    ni();
    vi();
    xi();
    yYs = __toESM(_o(), 1);
    GetAutomatedReasoningPolicyNextScenarioCommand = class _En extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [yYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetAutomatedReasoningPolicyNextScenario", {}).n("BedrockClient", "GetAutomatedReasoningPolicyNextScenarioCommand").sc(PKs).build() {};
  });
  var _Ys;
  var GetAutomatedReasoningPolicyTestCaseCommand;
  var zHr = __lazy(() => {
    ni();
    vi();
    xi();
    _Ys = __toESM(_o(), 1);
    GetAutomatedReasoningPolicyTestCaseCommand = class bEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [_Ys.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetAutomatedReasoningPolicyTestCase", {}).n("BedrockClient", "GetAutomatedReasoningPolicyTestCaseCommand").sc(OKs).build() {};
  });
  var bYs;
  var GetAutomatedReasoningPolicyTestResultCommand;
  var KHr = __lazy(() => {
    ni();
    vi();
    xi();
    bYs = __toESM(_o(), 1);
    GetAutomatedReasoningPolicyTestResultCommand = class SEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [bYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetAutomatedReasoningPolicyTestResult", {}).n("BedrockClient", "GetAutomatedReasoningPolicyTestResultCommand").sc(DKs).build() {};
  });
  var SYs;
  var GetCustomModelCommand;
  var YHr = __lazy(() => {
    ni();
    vi();
    xi();
    SYs = __toESM(_o(), 1);
    GetCustomModelCommand = class TEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [SYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetCustomModel", {}).n("BedrockClient", "GetCustomModelCommand").sc(MKs).build() {};
  });
  var TYs;
  var GetCustomModelDeploymentCommand;
  var JHr = __lazy(() => {
    ni();
    vi();
    xi();
    TYs = __toESM(_o(), 1);
    GetCustomModelDeploymentCommand = class EEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [TYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetCustomModelDeployment", {}).n("BedrockClient", "GetCustomModelDeploymentCommand").sc(NKs).build() {};
  });
  var EYs;
  var GetEvaluationJobCommand;
  var XHr = __lazy(() => {
    ni();
    vi();
    xi();
    EYs = __toESM(_o(), 1);
    GetEvaluationJobCommand = class vEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [EYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetEvaluationJob", {}).n("BedrockClient", "GetEvaluationJobCommand").sc(LKs).build() {};
  });
  var vYs;
  var GetFoundationModelAvailabilityCommand;
  var QHr = __lazy(() => {
    ni();
    vi();
    xi();
    vYs = __toESM(_o(), 1);
    GetFoundationModelAvailabilityCommand = class wEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [vYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetFoundationModelAvailability", {}).n("BedrockClient", "GetFoundationModelAvailabilityCommand").sc(UKs).build() {};
  });
  var wYs;
  var GetFoundationModelCommand;
  var ZHr = __lazy(() => {
    ni();
    vi();
    xi();
    wYs = __toESM(_o(), 1);
    GetFoundationModelCommand = class CEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [wYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetFoundationModel", {}).n("BedrockClient", "GetFoundationModelCommand").sc(FKs).build() {};
  });
  var CYs;
  var GetGuardrailCommand;
  var ejr = __lazy(() => {
    ni();
    vi();
    xi();
    CYs = __toESM(_o(), 1);
    GetGuardrailCommand = class REn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [CYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetGuardrail", {}).n("BedrockClient", "GetGuardrailCommand").sc(BKs).build() {};
  });
  var RYs;
  var GetImportedModelCommand;
  var tjr = __lazy(() => {
    ni();
    vi();
    xi();
    RYs = __toESM(_o(), 1);
    GetImportedModelCommand = class xEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [RYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetImportedModel", {}).n("BedrockClient", "GetImportedModelCommand").sc($Ks).build() {};
  });
  var xYs;
  var GetInferenceProfileCommand;
  var njr = __lazy(() => {
    ni();
    vi();
    xi();
    xYs = __toESM(_o(), 1);
    GetInferenceProfileCommand = class kEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [xYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetInferenceProfile", {}).n("BedrockClient", "GetInferenceProfileCommand").sc(HKs).build() {};
  });
  var kYs;
  var GetMarketplaceModelEndpointCommand;
  var rjr = __lazy(() => {
    ni();
    vi();
    xi();
    kYs = __toESM(_o(), 1);
    GetMarketplaceModelEndpointCommand = class AEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [kYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetMarketplaceModelEndpoint", {}).n("BedrockClient", "GetMarketplaceModelEndpointCommand").sc(jKs).build() {};
  });
  var AYs;
  var GetModelCopyJobCommand;
  var ojr = __lazy(() => {
    ni();
    vi();
    xi();
    AYs = __toESM(_o(), 1);
    GetModelCopyJobCommand = class IEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [AYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetModelCopyJob", {}).n("BedrockClient", "GetModelCopyJobCommand").sc(qKs).build() {};
  });
  var IYs;
  var GetModelCustomizationJobCommand;
  var sjr = __lazy(() => {
    ni();
    vi();
    xi();
    IYs = __toESM(_o(), 1);
    GetModelCustomizationJobCommand = class PEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [IYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetModelCustomizationJob", {}).n("BedrockClient", "GetModelCustomizationJobCommand").sc(WKs).build() {};
  });
  var PYs;
  var GetModelImportJobCommand;
  var ijr = __lazy(() => {
    ni();
    vi();
    xi();
    PYs = __toESM(_o(), 1);
    GetModelImportJobCommand = class OEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [PYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetModelImportJob", {}).n("BedrockClient", "GetModelImportJobCommand").sc(GKs).build() {};
  });
  var OYs;
  var GetModelInvocationJobCommand;
  var ajr = __lazy(() => {
    ni();
    vi();
    xi();
    OYs = __toESM(_o(), 1);
    GetModelInvocationJobCommand = class DEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [OYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetModelInvocationJob", {}).n("BedrockClient", "GetModelInvocationJobCommand").sc(VKs).build() {};
  });
  var DYs;
  var GetModelInvocationLoggingConfigurationCommand;
  var ljr = __lazy(() => {
    ni();
    vi();
    xi();
    DYs = __toESM(_o(), 1);
    GetModelInvocationLoggingConfigurationCommand = class MEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [DYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetModelInvocationLoggingConfiguration", {}).n("BedrockClient", "GetModelInvocationLoggingConfigurationCommand").sc(zKs).build() {};
  });
  var MYs;
  var GetPromptRouterCommand;
  var cjr = __lazy(() => {
    ni();
    vi();
    xi();
    MYs = __toESM(_o(), 1);
    GetPromptRouterCommand = class NEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [MYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetPromptRouter", {}).n("BedrockClient", "GetPromptRouterCommand").sc(KKs).build() {};
  });
  var NYs;
  var GetProvisionedModelThroughputCommand;
  var ujr = __lazy(() => {
    ni();
    vi();
    xi();
    NYs = __toESM(_o(), 1);
    GetProvisionedModelThroughputCommand = class LEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [NYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetProvisionedModelThroughput", {}).n("BedrockClient", "GetProvisionedModelThroughputCommand").sc(YKs).build() {};
  });
  var LYs;
  var GetUseCaseForModelAccessCommand;
  var djr = __lazy(() => {
    ni();
    vi();
    xi();
    LYs = __toESM(_o(), 1);
    GetUseCaseForModelAccessCommand = class FEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [LYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "GetUseCaseForModelAccess", {}).n("BedrockClient", "GetUseCaseForModelAccessCommand").sc(JKs).build() {};
  });
  var FYs;
  var ListAutomatedReasoningPoliciesCommand;
  var UEn = __lazy(() => {
    ni();
    vi();
    xi();
    FYs = __toESM(_o(), 1);
    ListAutomatedReasoningPoliciesCommand = class eot extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [FYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ListAutomatedReasoningPolicies", {}).n("BedrockClient", "ListAutomatedReasoningPoliciesCommand").sc(XKs).build() {};
  });
  var UYs;
  var ListAutomatedReasoningPolicyBuildWorkflowsCommand;
  var BEn = __lazy(() => {
    ni();
    vi();
    xi();
    UYs = __toESM(_o(), 1);
    ListAutomatedReasoningPolicyBuildWorkflowsCommand = class tot extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [UYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ListAutomatedReasoningPolicyBuildWorkflows", {}).n("BedrockClient", "ListAutomatedReasoningPolicyBuildWorkflowsCommand").sc(QKs).build() {};
  });
  var BYs;
  var ListAutomatedReasoningPolicyTestCasesCommand;
  var $En = __lazy(() => {
    ni();
    vi();
    xi();
    BYs = __toESM(_o(), 1);
    ListAutomatedReasoningPolicyTestCasesCommand = class not extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [BYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ListAutomatedReasoningPolicyTestCases", {}).n("BedrockClient", "ListAutomatedReasoningPolicyTestCasesCommand").sc(ZKs).build() {};
  });
  var $Ys;
  var ListAutomatedReasoningPolicyTestResultsCommand;
  var HEn = __lazy(() => {
    ni();
    vi();
    xi();
    $Ys = __toESM(_o(), 1);
    ListAutomatedReasoningPolicyTestResultsCommand = class rot extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [$Ys.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ListAutomatedReasoningPolicyTestResults", {}).n("BedrockClient", "ListAutomatedReasoningPolicyTestResultsCommand").sc(e7s).build() {};
  });
  var HYs;
  var ListCustomModelDeploymentsCommand;
  var jEn = __lazy(() => {
    ni();
    vi();
    xi();
    HYs = __toESM(_o(), 1);
    ListCustomModelDeploymentsCommand = class oot extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [HYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ListCustomModelDeployments", {}).n("BedrockClient", "ListCustomModelDeploymentsCommand").sc(t7s).build() {};
  });
  var jYs;
  var ListCustomModelsCommand;
  var qEn = __lazy(() => {
    ni();
    vi();
    xi();
    jYs = __toESM(_o(), 1);
    ListCustomModelsCommand = class sot extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [jYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ListCustomModels", {}).n("BedrockClient", "ListCustomModelsCommand").sc(n7s).build() {};
  });
  var qYs;
  var ListEvaluationJobsCommand;
  var WEn = __lazy(() => {
    ni();
    vi();
    xi();
    qYs = __toESM(_o(), 1);
    ListEvaluationJobsCommand = class iot extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [qYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ListEvaluationJobs", {}).n("BedrockClient", "ListEvaluationJobsCommand").sc(r7s).build() {};
  });
  var WYs;
  var ListFoundationModelAgreementOffersCommand;
  var pjr = __lazy(() => {
    ni();
    vi();
    xi();
    WYs = __toESM(_o(), 1);
    ListFoundationModelAgreementOffersCommand = class GEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [WYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ListFoundationModelAgreementOffers", {}).n("BedrockClient", "ListFoundationModelAgreementOffersCommand").sc(o7s).build() {};
  });
  var GYs;
  var ListFoundationModelsCommand;
  var mjr = __lazy(() => {
    ni();
    vi();
    xi();
    GYs = __toESM(_o(), 1);
    ListFoundationModelsCommand = class VEn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [GYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ListFoundationModels", {}).n("BedrockClient", "ListFoundationModelsCommand").sc(s7s).build() {};
  });
  var VYs;
  var ListGuardrailsCommand;
  var zEn = __lazy(() => {
    ni();
    vi();
    xi();
    VYs = __toESM(_o(), 1);
    ListGuardrailsCommand = class aot extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [VYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ListGuardrails", {}).n("BedrockClient", "ListGuardrailsCommand").sc(i7s).build() {};
  });
  var zYs;
  var ListImportedModelsCommand;
  var KEn = __lazy(() => {
    ni();
    vi();
    xi();
    zYs = __toESM(_o(), 1);
    ListImportedModelsCommand = class lot extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [zYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ListImportedModels", {}).n("BedrockClient", "ListImportedModelsCommand").sc(a7s).build() {};
  });
  var KYs;
  var ListInferenceProfilesCommand;
  var YEn = __lazy(() => {
    ni();
    vi();
    xi();
    KYs = __toESM(_o(), 1);
    ListInferenceProfilesCommand = class cot extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [KYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ListInferenceProfiles", {}).n("BedrockClient", "ListInferenceProfilesCommand").sc(l7s).build() {};
  });
  var YYs;
  var ListMarketplaceModelEndpointsCommand;
  var JEn = __lazy(() => {
    ni();
    vi();
    xi();
    YYs = __toESM(_o(), 1);
    ListMarketplaceModelEndpointsCommand = class uot extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [YYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ListMarketplaceModelEndpoints", {}).n("BedrockClient", "ListMarketplaceModelEndpointsCommand").sc(c7s).build() {};
  });
  var JYs;
  var ListModelCopyJobsCommand;
  var XEn = __lazy(() => {
    ni();
    vi();
    xi();
    JYs = __toESM(_o(), 1);
    ListModelCopyJobsCommand = class dot extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [JYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ListModelCopyJobs", {}).n("BedrockClient", "ListModelCopyJobsCommand").sc(u7s).build() {};
  });
  var XYs;
  var ListModelCustomizationJobsCommand;
  var QEn = __lazy(() => {
    ni();
    vi();
    xi();
    XYs = __toESM(_o(), 1);
    ListModelCustomizationJobsCommand = class pot extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [XYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ListModelCustomizationJobs", {}).n("BedrockClient", "ListModelCustomizationJobsCommand").sc(d7s).build() {};
  });
  var QYs;
  var ListModelImportJobsCommand;
  var ZEn = __lazy(() => {
    ni();
    vi();
    xi();
    QYs = __toESM(_o(), 1);
    ListModelImportJobsCommand = class mot extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [QYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ListModelImportJobs", {}).n("BedrockClient", "ListModelImportJobsCommand").sc(p7s).build() {};
  });
  var ZYs;
  var ListModelInvocationJobsCommand;
  var evn = __lazy(() => {
    ni();
    vi();
    xi();
    ZYs = __toESM(_o(), 1);
    ListModelInvocationJobsCommand = class fot extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [ZYs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ListModelInvocationJobs", {}).n("BedrockClient", "ListModelInvocationJobsCommand").sc(m7s).build() {};
  });
  var eJs;
  var ListPromptRoutersCommand;
  var tvn = __lazy(() => {
    ni();
    vi();
    xi();
    eJs = __toESM(_o(), 1);
    ListPromptRoutersCommand = class hot extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [eJs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ListPromptRouters", {}).n("BedrockClient", "ListPromptRoutersCommand").sc(f7s).build() {};
  });
  var tJs;
  var ListProvisionedModelThroughputsCommand;
  var nvn = __lazy(() => {
    ni();
    vi();
    xi();
    tJs = __toESM(_o(), 1);
    ListProvisionedModelThroughputsCommand = class got extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [tJs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ListProvisionedModelThroughputs", {}).n("BedrockClient", "ListProvisionedModelThroughputsCommand").sc(h7s).build() {};
  });
  var nJs;
  var ListTagsForResourceCommand;
  var fjr = __lazy(() => {
    ni();
    vi();
    xi();
    nJs = __toESM(_o(), 1);
    ListTagsForResourceCommand = class rvn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [nJs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "ListTagsForResource", {}).n("BedrockClient", "ListTagsForResourceCommand").sc(g7s).build() {};
  });
  var rJs;
  var PutModelInvocationLoggingConfigurationCommand;
  var hjr = __lazy(() => {
    ni();
    vi();
    xi();
    rJs = __toESM(_o(), 1);
    PutModelInvocationLoggingConfigurationCommand = class ovn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [rJs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "PutModelInvocationLoggingConfiguration", {}).n("BedrockClient", "PutModelInvocationLoggingConfigurationCommand").sc(y7s).build() {};
  });
  var oJs;
  var PutUseCaseForModelAccessCommand;
  var gjr = __lazy(() => {
    ni();
    vi();
    xi();
    oJs = __toESM(_o(), 1);
    PutUseCaseForModelAccessCommand = class svn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [oJs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "PutUseCaseForModelAccess", {}).n("BedrockClient", "PutUseCaseForModelAccessCommand").sc(_7s).build() {};
  });
  var sJs;
  var RegisterMarketplaceModelEndpointCommand;
  var yjr = __lazy(() => {
    ni();
    vi();
    xi();
    sJs = __toESM(_o(), 1);
    RegisterMarketplaceModelEndpointCommand = class ivn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [sJs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "RegisterMarketplaceModelEndpoint", {}).n("BedrockClient", "RegisterMarketplaceModelEndpointCommand").sc(b7s).build() {};
  });
  var iJs;
  var StartAutomatedReasoningPolicyBuildWorkflowCommand;
  var _jr = __lazy(() => {
    ni();
    vi();
    xi();
    iJs = __toESM(_o(), 1);
    StartAutomatedReasoningPolicyBuildWorkflowCommand = class avn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [iJs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "StartAutomatedReasoningPolicyBuildWorkflow", {}).n("BedrockClient", "StartAutomatedReasoningPolicyBuildWorkflowCommand").sc(S7s).build() {};
  });
  var aJs;
  var StartAutomatedReasoningPolicyTestWorkflowCommand;
  var bjr = __lazy(() => {
    ni();
    vi();
    xi();
    aJs = __toESM(_o(), 1);
    StartAutomatedReasoningPolicyTestWorkflowCommand = class lvn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [aJs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "StartAutomatedReasoningPolicyTestWorkflow", {}).n("BedrockClient", "StartAutomatedReasoningPolicyTestWorkflowCommand").sc(T7s).build() {};
  });
  var lJs;
  var StopEvaluationJobCommand;
  var Sjr = __lazy(() => {
    ni();
    vi();
    xi();
    lJs = __toESM(_o(), 1);
    StopEvaluationJobCommand = class cvn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [lJs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "StopEvaluationJob", {}).n("BedrockClient", "StopEvaluationJobCommand").sc(E7s).build() {};
  });
  var cJs;
  var StopModelCustomizationJobCommand;
  var Tjr = __lazy(() => {
    ni();
    vi();
    xi();
    cJs = __toESM(_o(), 1);
    StopModelCustomizationJobCommand = class uvn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [cJs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "StopModelCustomizationJob", {}).n("BedrockClient", "StopModelCustomizationJobCommand").sc(v7s).build() {};
  });
  var uJs;
  var StopModelInvocationJobCommand;
  var Ejr = __lazy(() => {
    ni();
    vi();
    xi();
    uJs = __toESM(_o(), 1);
    StopModelInvocationJobCommand = class dvn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [uJs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "StopModelInvocationJob", {}).n("BedrockClient", "StopModelInvocationJobCommand").sc(w7s).build() {};
  });
  var dJs;
  var TagResourceCommand;
  var vjr = __lazy(() => {
    ni();
    vi();
    xi();
    dJs = __toESM(_o(), 1);
    TagResourceCommand = class pvn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [dJs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "TagResource", {}).n("BedrockClient", "TagResourceCommand").sc(C7s).build() {};
  });
  var pJs;
  var UntagResourceCommand;
  var wjr = __lazy(() => {
    ni();
    vi();
    xi();
    pJs = __toESM(_o(), 1);
    UntagResourceCommand = class mvn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [pJs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "UntagResource", {}).n("BedrockClient", "UntagResourceCommand").sc(R7s).build() {};
  });
  var mJs;
  var UpdateAutomatedReasoningPolicyAnnotationsCommand;
  var Cjr = __lazy(() => {
    ni();
    vi();
    xi();
    mJs = __toESM(_o(), 1);
    UpdateAutomatedReasoningPolicyAnnotationsCommand = class fvn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [mJs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "UpdateAutomatedReasoningPolicyAnnotations", {}).n("BedrockClient", "UpdateAutomatedReasoningPolicyAnnotationsCommand").sc(k7s).build() {};
  });
  var fJs;
  var UpdateAutomatedReasoningPolicyCommand;
  var Rjr = __lazy(() => {
    ni();
    vi();
    xi();
    fJs = __toESM(_o(), 1);
    UpdateAutomatedReasoningPolicyCommand = class hvn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [fJs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "UpdateAutomatedReasoningPolicy", {}).n("BedrockClient", "UpdateAutomatedReasoningPolicyCommand").sc(x7s).build() {};
  });
  var hJs;
  var UpdateAutomatedReasoningPolicyTestCaseCommand;
  var xjr = __lazy(() => {
    ni();
    vi();
    xi();
    hJs = __toESM(_o(), 1);
    UpdateAutomatedReasoningPolicyTestCaseCommand = class gvn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [hJs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "UpdateAutomatedReasoningPolicyTestCase", {}).n("BedrockClient", "UpdateAutomatedReasoningPolicyTestCaseCommand").sc(A7s).build() {};
  });
  var gJs;
  var UpdateGuardrailCommand;
  var kjr = __lazy(() => {
    ni();
    vi();
    xi();
    gJs = __toESM(_o(), 1);
    UpdateGuardrailCommand = class yvn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [gJs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "UpdateGuardrail", {}).n("BedrockClient", "UpdateGuardrailCommand").sc(I7s).build() {};
  });
  var yJs;
  var UpdateMarketplaceModelEndpointCommand;
  var Ajr = __lazy(() => {
    ni();
    vi();
    xi();
    yJs = __toESM(_o(), 1);
    UpdateMarketplaceModelEndpointCommand = class _vn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [yJs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "UpdateMarketplaceModelEndpoint", {}).n("BedrockClient", "UpdateMarketplaceModelEndpointCommand").sc(P7s).build() {};
  });
  var _Js;
  var UpdateProvisionedModelThroughputCommand;
  var Ijr = __lazy(() => {
    ni();
    vi();
    xi();
    _Js = __toESM(_o(), 1);
    UpdateProvisionedModelThroughputCommand = class bvn extends Command_export2.classBuilder().ep(Mr).m(function (e, t, n, r) {
      return [_Js.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockControlPlaneService", "UpdateProvisionedModelThroughput", {}).n("BedrockClient", "UpdateProvisionedModelThroughputCommand").sc(O7s).build() {};
  });
  var Gmd;
  var Bedrock;
  var bJs = __lazy(() => {
    ni();
    $P();
    lHr();
    cHr();
    uHr();
    dHr();
    pHr();
    mHr();
    fHr();
    hHr();
    gHr();
    yHr();
    _Hr();
    bHr();
    SHr();
    THr();
    EHr();
    vHr();
    wHr();
    CHr();
    RHr();
    xHr();
    kHr();
    AHr();
    IHr();
    PHr();
    OHr();
    DHr();
    MHr();
    NHr();
    LHr();
    FHr();
    UHr();
    BHr();
    $Hr();
    HHr();
    jHr();
    qHr();
    WHr();
    GHr();
    VHr();
    zHr();
    KHr();
    YHr();
    JHr();
    XHr();
    QHr();
    ZHr();
    ejr();
    tjr();
    njr();
    rjr();
    ojr();
    sjr();
    ijr();
    ajr();
    ljr();
    cjr();
    ujr();
    djr();
    UEn();
    BEn();
    $En();
    HEn();
    jEn();
    qEn();
    WEn();
    pjr();
    mjr();
    zEn();
    KEn();
    YEn();
    JEn();
    XEn();
    QEn();
    ZEn();
    evn();
    tvn();
    nvn();
    fjr();
    hjr();
    gjr();
    yjr();
    _jr();
    bjr();
    Sjr();
    Tjr();
    Ejr();
    vjr();
    wjr();
    Cjr();
    Rjr();
    xjr();
    kjr();
    Ajr();
    Ijr();
    Gmd = {
      BatchDeleteEvaluationJobCommand: BatchDeleteEvaluationJobCommand,
      CancelAutomatedReasoningPolicyBuildWorkflowCommand: CancelAutomatedReasoningPolicyBuildWorkflowCommand,
      CreateAutomatedReasoningPolicyCommand: CreateAutomatedReasoningPolicyCommand,
      CreateAutomatedReasoningPolicyTestCaseCommand: CreateAutomatedReasoningPolicyTestCaseCommand,
      CreateAutomatedReasoningPolicyVersionCommand: CreateAutomatedReasoningPolicyVersionCommand,
      CreateCustomModelCommand: CreateCustomModelCommand,
      CreateCustomModelDeploymentCommand: CreateCustomModelDeploymentCommand,
      CreateEvaluationJobCommand: CreateEvaluationJobCommand,
      CreateFoundationModelAgreementCommand: CreateFoundationModelAgreementCommand,
      CreateGuardrailCommand: CreateGuardrailCommand,
      CreateGuardrailVersionCommand: CreateGuardrailVersionCommand,
      CreateInferenceProfileCommand: CreateInferenceProfileCommand,
      CreateMarketplaceModelEndpointCommand: CreateMarketplaceModelEndpointCommand,
      CreateModelCopyJobCommand: CreateModelCopyJobCommand,
      CreateModelCustomizationJobCommand: CreateModelCustomizationJobCommand,
      CreateModelImportJobCommand: CreateModelImportJobCommand,
      CreateModelInvocationJobCommand: CreateModelInvocationJobCommand,
      CreatePromptRouterCommand: CreatePromptRouterCommand,
      CreateProvisionedModelThroughputCommand: CreateProvisionedModelThroughputCommand,
      DeleteAutomatedReasoningPolicyCommand: DeleteAutomatedReasoningPolicyCommand,
      DeleteAutomatedReasoningPolicyBuildWorkflowCommand: DeleteAutomatedReasoningPolicyBuildWorkflowCommand,
      DeleteAutomatedReasoningPolicyTestCaseCommand: DeleteAutomatedReasoningPolicyTestCaseCommand,
      DeleteCustomModelCommand: DeleteCustomModelCommand,
      DeleteCustomModelDeploymentCommand: DeleteCustomModelDeploymentCommand,
      DeleteFoundationModelAgreementCommand: DeleteFoundationModelAgreementCommand,
      DeleteGuardrailCommand: DeleteGuardrailCommand,
      DeleteImportedModelCommand: DeleteImportedModelCommand,
      DeleteInferenceProfileCommand: DeleteInferenceProfileCommand,
      DeleteMarketplaceModelEndpointCommand: DeleteMarketplaceModelEndpointCommand,
      DeleteModelInvocationLoggingConfigurationCommand: DeleteModelInvocationLoggingConfigurationCommand,
      DeletePromptRouterCommand: DeletePromptRouterCommand,
      DeleteProvisionedModelThroughputCommand: DeleteProvisionedModelThroughputCommand,
      DeregisterMarketplaceModelEndpointCommand: DeregisterMarketplaceModelEndpointCommand,
      ExportAutomatedReasoningPolicyVersionCommand: ExportAutomatedReasoningPolicyVersionCommand,
      GetAutomatedReasoningPolicyCommand: GetAutomatedReasoningPolicyCommand,
      GetAutomatedReasoningPolicyAnnotationsCommand: GetAutomatedReasoningPolicyAnnotationsCommand,
      GetAutomatedReasoningPolicyBuildWorkflowCommand: GetAutomatedReasoningPolicyBuildWorkflowCommand,
      GetAutomatedReasoningPolicyBuildWorkflowResultAssetsCommand: GetAutomatedReasoningPolicyBuildWorkflowResultAssetsCommand,
      GetAutomatedReasoningPolicyNextScenarioCommand: GetAutomatedReasoningPolicyNextScenarioCommand,
      GetAutomatedReasoningPolicyTestCaseCommand: GetAutomatedReasoningPolicyTestCaseCommand,
      GetAutomatedReasoningPolicyTestResultCommand: GetAutomatedReasoningPolicyTestResultCommand,
      GetCustomModelCommand: GetCustomModelCommand,
      GetCustomModelDeploymentCommand: GetCustomModelDeploymentCommand,
      GetEvaluationJobCommand: GetEvaluationJobCommand,
      GetFoundationModelCommand: GetFoundationModelCommand,
      GetFoundationModelAvailabilityCommand: GetFoundationModelAvailabilityCommand,
      GetGuardrailCommand: GetGuardrailCommand,
      GetImportedModelCommand: GetImportedModelCommand,
      GetInferenceProfileCommand: GetInferenceProfileCommand,
      GetMarketplaceModelEndpointCommand: GetMarketplaceModelEndpointCommand,
      GetModelCopyJobCommand: GetModelCopyJobCommand,
      GetModelCustomizationJobCommand: GetModelCustomizationJobCommand,
      GetModelImportJobCommand: GetModelImportJobCommand,
      GetModelInvocationJobCommand: GetModelInvocationJobCommand,
      GetModelInvocationLoggingConfigurationCommand: GetModelInvocationLoggingConfigurationCommand,
      GetPromptRouterCommand: GetPromptRouterCommand,
      GetProvisionedModelThroughputCommand: GetProvisionedModelThroughputCommand,
      GetUseCaseForModelAccessCommand: GetUseCaseForModelAccessCommand,
      ListAutomatedReasoningPoliciesCommand: ListAutomatedReasoningPoliciesCommand,
      ListAutomatedReasoningPolicyBuildWorkflowsCommand: ListAutomatedReasoningPolicyBuildWorkflowsCommand,
      ListAutomatedReasoningPolicyTestCasesCommand: ListAutomatedReasoningPolicyTestCasesCommand,
      ListAutomatedReasoningPolicyTestResultsCommand: ListAutomatedReasoningPolicyTestResultsCommand,
      ListCustomModelDeploymentsCommand: ListCustomModelDeploymentsCommand,
      ListCustomModelsCommand: ListCustomModelsCommand,
      ListEvaluationJobsCommand: ListEvaluationJobsCommand,
      ListFoundationModelAgreementOffersCommand: ListFoundationModelAgreementOffersCommand,
      ListFoundationModelsCommand: ListFoundationModelsCommand,
      ListGuardrailsCommand: ListGuardrailsCommand,
      ListImportedModelsCommand: ListImportedModelsCommand,
      ListInferenceProfilesCommand: ListInferenceProfilesCommand,
      ListMarketplaceModelEndpointsCommand: ListMarketplaceModelEndpointsCommand,
      ListModelCopyJobsCommand: ListModelCopyJobsCommand,
      ListModelCustomizationJobsCommand: ListModelCustomizationJobsCommand,
      ListModelImportJobsCommand: ListModelImportJobsCommand,
      ListModelInvocationJobsCommand: ListModelInvocationJobsCommand,
      ListPromptRoutersCommand: ListPromptRoutersCommand,
      ListProvisionedModelThroughputsCommand: ListProvisionedModelThroughputsCommand,
      ListTagsForResourceCommand: ListTagsForResourceCommand,
      PutModelInvocationLoggingConfigurationCommand: PutModelInvocationLoggingConfigurationCommand,
      PutUseCaseForModelAccessCommand: PutUseCaseForModelAccessCommand,
      RegisterMarketplaceModelEndpointCommand: RegisterMarketplaceModelEndpointCommand,
      StartAutomatedReasoningPolicyBuildWorkflowCommand: StartAutomatedReasoningPolicyBuildWorkflowCommand,
      StartAutomatedReasoningPolicyTestWorkflowCommand: StartAutomatedReasoningPolicyTestWorkflowCommand,
      StopEvaluationJobCommand: StopEvaluationJobCommand,
      StopModelCustomizationJobCommand: StopModelCustomizationJobCommand,
      StopModelInvocationJobCommand: StopModelInvocationJobCommand,
      TagResourceCommand: TagResourceCommand,
      UntagResourceCommand: UntagResourceCommand,
      UpdateAutomatedReasoningPolicyCommand: UpdateAutomatedReasoningPolicyCommand,
      UpdateAutomatedReasoningPolicyAnnotationsCommand: UpdateAutomatedReasoningPolicyAnnotationsCommand,
      UpdateAutomatedReasoningPolicyTestCaseCommand: UpdateAutomatedReasoningPolicyTestCaseCommand,
      UpdateGuardrailCommand: UpdateGuardrailCommand,
      UpdateMarketplaceModelEndpointCommand: UpdateMarketplaceModelEndpointCommand,
      UpdateProvisionedModelThroughputCommand: UpdateProvisionedModelThroughputCommand
    };
    Bedrock = class Pjr extends BedrockClient {};
    createAggregatedClient_export2(Gmd, Bedrock);
  });
  var SJs = __lazy(() => {
    lHr();
    cHr();
    uHr();
    dHr();
    pHr();
    mHr();
    fHr();
    hHr();
    gHr();
    yHr();
    _Hr();
    bHr();
    SHr();
    THr();
    EHr();
    vHr();
    wHr();
    CHr();
    RHr();
    xHr();
    kHr();
    AHr();
    IHr();
    PHr();
    OHr();
    DHr();
    MHr();
    NHr();
    LHr();
    FHr();
    UHr();
    BHr();
    $Hr();
    HHr();
    jHr();
    qHr();
    WHr();
    GHr();
    VHr();
    zHr();
    KHr();
    YHr();
    JHr();
    XHr();
    QHr();
    ZHr();
    ejr();
    tjr();
    njr();
    rjr();
    ojr();
    sjr();
    ijr();
    ajr();
    ljr();
    cjr();
    ujr();
    djr();
    UEn();
    BEn();
    $En();
    HEn();
    jEn();
    qEn();
    WEn();
    pjr();
    mjr();
    zEn();
    KEn();
    YEn();
    JEn();
    XEn();
    QEn();
    ZEn();
    evn();
    tvn();
    nvn();
    fjr();
    hjr();
    gjr();
    yjr();
    _jr();
    bjr();
    Sjr();
    Tjr();
    Ejr();
    vjr();
    wjr();
    Cjr();
    Rjr();
    xjr();
    kjr();
    Ajr();
    Ijr();
  });
  var TJs = () => {};
  var EJs;
  var paginateListAutomatedReasoningPolicies;
  var vJs = __lazy(() => {
    $P();
    UEn();
    EJs = __toESM(Od(), 1);
    paginateListAutomatedReasoningPolicies = EJs.createPaginator(BedrockClient, ListAutomatedReasoningPoliciesCommand, "nextToken", "nextToken", "maxResults");
  });
  var wJs;
  var paginateListAutomatedReasoningPolicyBuildWorkflows;
  var CJs = __lazy(() => {
    $P();
    BEn();
    wJs = __toESM(Od(), 1);
    paginateListAutomatedReasoningPolicyBuildWorkflows = wJs.createPaginator(BedrockClient, ListAutomatedReasoningPolicyBuildWorkflowsCommand, "nextToken", "nextToken", "maxResults");
  });
  var RJs;
  var paginateListAutomatedReasoningPolicyTestCases;
  var xJs = __lazy(() => {
    $P();
    $En();
    RJs = __toESM(Od(), 1);
    paginateListAutomatedReasoningPolicyTestCases = RJs.createPaginator(BedrockClient, ListAutomatedReasoningPolicyTestCasesCommand, "nextToken", "nextToken", "maxResults");
  });
  var kJs;
  var paginateListAutomatedReasoningPolicyTestResults;
  var AJs = __lazy(() => {
    $P();
    HEn();
    kJs = __toESM(Od(), 1);
    paginateListAutomatedReasoningPolicyTestResults = kJs.createPaginator(BedrockClient, ListAutomatedReasoningPolicyTestResultsCommand, "nextToken", "nextToken", "maxResults");
  });
  var IJs;
  var paginateListCustomModelDeployments;
  var PJs = __lazy(() => {
    $P();
    jEn();
    IJs = __toESM(Od(), 1);
    paginateListCustomModelDeployments = IJs.createPaginator(BedrockClient, ListCustomModelDeploymentsCommand, "nextToken", "nextToken", "maxResults");
  });
  var OJs;
  var paginateListCustomModels;
  var DJs = __lazy(() => {
    $P();
    qEn();
    OJs = __toESM(Od(), 1);
    paginateListCustomModels = OJs.createPaginator(BedrockClient, ListCustomModelsCommand, "nextToken", "nextToken", "maxResults");
  });
  var MJs;
  var paginateListEvaluationJobs;
  var NJs = __lazy(() => {
    $P();
    WEn();
    MJs = __toESM(Od(), 1);
    paginateListEvaluationJobs = MJs.createPaginator(BedrockClient, ListEvaluationJobsCommand, "nextToken", "nextToken", "maxResults");
  });
  var LJs;
  var paginateListGuardrails;
  var FJs = __lazy(() => {
    $P();
    zEn();
    LJs = __toESM(Od(), 1);
    paginateListGuardrails = LJs.createPaginator(BedrockClient, ListGuardrailsCommand, "nextToken", "nextToken", "maxResults");
  });
  var UJs;
  var paginateListImportedModels;
  var BJs = __lazy(() => {
    $P();
    KEn();
    UJs = __toESM(Od(), 1);
    paginateListImportedModels = UJs.createPaginator(BedrockClient, ListImportedModelsCommand, "nextToken", "nextToken", "maxResults");
  });
  var $Js;
  var paginateListInferenceProfiles;
  var HJs = __lazy(() => {
    $P();
    YEn();
    $Js = __toESM(Od(), 1);
    paginateListInferenceProfiles = $Js.createPaginator(BedrockClient, ListInferenceProfilesCommand, "nextToken", "nextToken", "maxResults");
  });
  var jJs;
  var paginateListMarketplaceModelEndpoints;
  var qJs = __lazy(() => {
    $P();
    JEn();
    jJs = __toESM(Od(), 1);
    paginateListMarketplaceModelEndpoints = jJs.createPaginator(BedrockClient, ListMarketplaceModelEndpointsCommand, "nextToken", "nextToken", "maxResults");
  });
  var WJs;
  var paginateListModelCopyJobs;
  var GJs = __lazy(() => {
    $P();
    XEn();
    WJs = __toESM(Od(), 1);
    paginateListModelCopyJobs = WJs.createPaginator(BedrockClient, ListModelCopyJobsCommand, "nextToken", "nextToken", "maxResults");
  });
  var VJs;
  var paginateListModelCustomizationJobs;
  var zJs = __lazy(() => {
    $P();
    QEn();
    VJs = __toESM(Od(), 1);
    paginateListModelCustomizationJobs = VJs.createPaginator(BedrockClient, ListModelCustomizationJobsCommand, "nextToken", "nextToken", "maxResults");
  });
  var KJs;
  var paginateListModelImportJobs;
  var YJs = __lazy(() => {
    $P();
    ZEn();
    KJs = __toESM(Od(), 1);
    paginateListModelImportJobs = KJs.createPaginator(BedrockClient, ListModelImportJobsCommand, "nextToken", "nextToken", "maxResults");
  });
  var JJs;
  var paginateListModelInvocationJobs;
  var XJs = __lazy(() => {
    $P();
    evn();
    JJs = __toESM(Od(), 1);
    paginateListModelInvocationJobs = JJs.createPaginator(BedrockClient, ListModelInvocationJobsCommand, "nextToken", "nextToken", "maxResults");
  });
  var QJs;
  var paginateListPromptRouters;
  var ZJs = __lazy(() => {
    $P();
    tvn();
    QJs = __toESM(Od(), 1);
    paginateListPromptRouters = QJs.createPaginator(BedrockClient, ListPromptRoutersCommand, "nextToken", "nextToken", "maxResults");
  });
  var eXs;
  var paginateListProvisionedModelThroughputs;
  var tXs = __lazy(() => {
    $P();
    nvn();
    eXs = __toESM(Od(), 1);
    paginateListProvisionedModelThroughputs = eXs.createPaginator(BedrockClient, ListProvisionedModelThroughputsCommand, "nextToken", "nextToken", "maxResults");
  });
  var nXs = __lazy(() => {
    TJs();
    vJs();
    CJs();
    xJs();
    AJs();
    PJs();
    DJs();
    NJs();
    FJs();
    BJs();
    HJs();
    qJs();
    GJs();
    zJs();
    YJs();
    XJs();
    ZJs();
    tXs();
  });
  var AgreementStatus;
  var AutomatedReasoningCheckResult;
  var AutomatedReasoningPolicyBuildWorkflowType;
  var AutomatedReasoningPolicyBuildDocumentContentType;
  var AutomatedReasoningPolicyBuildWorkflowStatus;
  var AutomatedReasoningPolicyBuildResultAssetType;
  var AutomatedReasoningPolicyBuildMessageType;
  var AutomatedReasoningPolicyAnnotationStatus;
  var AutomatedReasoningCheckLogicWarningType;
  var AutomatedReasoningPolicyTestRunResult;
  var AutomatedReasoningPolicyTestRunStatus;
  var Status;
  var CustomModelDeploymentStatus;
  var SortModelsBy;
  var SortOrder;
  var CustomizationType;
  var ModelStatus;
  var EvaluationJobStatus;
  var ApplicationType;
  var EvaluationTaskType;
  var PerformanceConfigLatency;
  var ExternalSourceType;
  var QueryTransformationType;
  var AttributeType;
  var SearchType;
  var RerankingMetadataSelectionMode;
  var VectorSearchRerankingConfigurationType;
  var RetrieveAndGenerateType;
  var EvaluationJobType;
  var SortJobsBy;
  var GuardrailContentFilterAction;
  var GuardrailModality;
  var GuardrailFilterStrength;
  var GuardrailContentFilterType;
  var GuardrailContentFiltersTierName;
  var GuardrailContextualGroundingAction;
  var GuardrailContextualGroundingFilterType;
  var GuardrailSensitiveInformationAction;
  var GuardrailPiiEntityType;
  var GuardrailTopicsTierName;
  var GuardrailTopicAction;
  var GuardrailTopicType;
  var GuardrailWordAction;
  var GuardrailManagedWordsType;
  var GuardrailStatus;
  var InferenceProfileStatus;
  var InferenceProfileType;
  var ModelCopyJobStatus;
  var ModelImportJobStatus;
  var S3InputFormat;
  var ModelInvocationJobStatus;
  var ModelCustomization;
  var InferenceType;
  var ModelModality;
  var FoundationModelLifecycleStatus;
  var PromptRouterStatus;
  var PromptRouterType;
  var CommitmentDuration;
  var ProvisionedModelStatus;
  var SortByProvisionedModels;
  var AuthorizationStatus;
  var EntitlementAvailability;
  var RegionAvailability;
  var OfferType;
  var ModelCustomizationJobStatus;
  var JobStatusDetails;
  var FineTuningJobStatus;
  var rXs = __lazy(() => {
    AgreementStatus = {
      AVAILABLE: "AVAILABLE",
      ERROR: "ERROR",
      NOT_AVAILABLE: "NOT_AVAILABLE",
      PENDING: "PENDING"
    };
    AutomatedReasoningCheckResult = {
      IMPOSSIBLE: "IMPOSSIBLE",
      INVALID: "INVALID",
      NO_TRANSLATION: "NO_TRANSLATION",
      SATISFIABLE: "SATISFIABLE",
      TOO_COMPLEX: "TOO_COMPLEX",
      TRANSLATION_AMBIGUOUS: "TRANSLATION_AMBIGUOUS",
      VALID: "VALID"
    };
    AutomatedReasoningPolicyBuildWorkflowType = {
      IMPORT_POLICY: "IMPORT_POLICY",
      INGEST_CONTENT: "INGEST_CONTENT",
      REFINE_POLICY: "REFINE_POLICY"
    };
    AutomatedReasoningPolicyBuildDocumentContentType = {
      PDF: "pdf",
      TEXT: "txt"
    };
    AutomatedReasoningPolicyBuildWorkflowStatus = {
      BUILDING: "BUILDING",
      CANCELLED: "CANCELLED",
      CANCEL_REQUESTED: "CANCEL_REQUESTED",
      COMPLETED: "COMPLETED",
      FAILED: "FAILED",
      PREPROCESSING: "PREPROCESSING",
      SCHEDULED: "SCHEDULED",
      TESTING: "TESTING"
    };
    AutomatedReasoningPolicyBuildResultAssetType = {
      BUILD_LOG: "BUILD_LOG",
      GENERATED_TEST_CASES: "GENERATED_TEST_CASES",
      POLICY_DEFINITION: "POLICY_DEFINITION",
      QUALITY_REPORT: "QUALITY_REPORT"
    };
    AutomatedReasoningPolicyBuildMessageType = {
      ERROR: "ERROR",
      INFO: "INFO",
      WARNING: "WARNING"
    };
    AutomatedReasoningPolicyAnnotationStatus = {
      APPLIED: "APPLIED",
      FAILED: "FAILED"
    };
    AutomatedReasoningCheckLogicWarningType = {
      ALWAYS_FALSE: "ALWAYS_FALSE",
      ALWAYS_TRUE: "ALWAYS_TRUE"
    };
    AutomatedReasoningPolicyTestRunResult = {
      FAILED: "FAILED",
      PASSED: "PASSED"
    };
    AutomatedReasoningPolicyTestRunStatus = {
      COMPLETED: "COMPLETED",
      FAILED: "FAILED",
      IN_PROGRESS: "IN_PROGRESS",
      NOT_STARTED: "NOT_STARTED",
      SCHEDULED: "SCHEDULED"
    };
    Status = {
      INCOMPATIBLE_ENDPOINT: "INCOMPATIBLE_ENDPOINT",
      REGISTERED: "REGISTERED"
    };
    CustomModelDeploymentStatus = {
      ACTIVE: "Active",
      CREATING: "Creating",
      FAILED: "Failed"
    };
    SortModelsBy = {
      CREATION_TIME: "CreationTime"
    };
    SortOrder = {
      ASCENDING: "Ascending",
      DESCENDING: "Descending"
    };
    CustomizationType = {
      CONTINUED_PRE_TRAINING: "CONTINUED_PRE_TRAINING",
      DISTILLATION: "DISTILLATION",
      FINE_TUNING: "FINE_TUNING",
      IMPORTED: "IMPORTED"
    };
    ModelStatus = {
      ACTIVE: "Active",
      CREATING: "Creating",
      FAILED: "Failed"
    };
    EvaluationJobStatus = {
      COMPLETED: "Completed",
      DELETING: "Deleting",
      FAILED: "Failed",
      IN_PROGRESS: "InProgress",
      STOPPED: "Stopped",
      STOPPING: "Stopping"
    };
    ApplicationType = {
      MODEL_EVALUATION: "ModelEvaluation",
      RAG_EVALUATION: "RagEvaluation"
    };
    EvaluationTaskType = {
      CLASSIFICATION: "Classification",
      CUSTOM: "Custom",
      GENERATION: "Generation",
      QUESTION_AND_ANSWER: "QuestionAndAnswer",
      SUMMARIZATION: "Summarization"
    };
    PerformanceConfigLatency = {
      OPTIMIZED: "optimized",
      STANDARD: "standard"
    };
    ExternalSourceType = {
      BYTE_CONTENT: "BYTE_CONTENT",
      S3: "S3"
    };
    QueryTransformationType = {
      QUERY_DECOMPOSITION: "QUERY_DECOMPOSITION"
    };
    AttributeType = {
      BOOLEAN: "BOOLEAN",
      NUMBER: "NUMBER",
      STRING: "STRING",
      STRING_LIST: "STRING_LIST"
    };
    SearchType = {
      HYBRID: "HYBRID",
      SEMANTIC: "SEMANTIC"
    };
    RerankingMetadataSelectionMode = {
      ALL: "ALL",
      SELECTIVE: "SELECTIVE"
    };
    VectorSearchRerankingConfigurationType = {
      BEDROCK_RERANKING_MODEL: "BEDROCK_RERANKING_MODEL"
    };
    RetrieveAndGenerateType = {
      EXTERNAL_SOURCES: "EXTERNAL_SOURCES",
      KNOWLEDGE_BASE: "KNOWLEDGE_BASE"
    };
    EvaluationJobType = {
      AUTOMATED: "Automated",
      HUMAN: "Human"
    };
    SortJobsBy = {
      CREATION_TIME: "CreationTime"
    };
    GuardrailContentFilterAction = {
      BLOCK: "BLOCK",
      NONE: "NONE"
    };
    GuardrailModality = {
      IMAGE: "IMAGE",
      TEXT: "TEXT"
    };
    GuardrailFilterStrength = {
      HIGH: "HIGH",
      LOW: "LOW",
      MEDIUM: "MEDIUM",
      NONE: "NONE"
    };
    GuardrailContentFilterType = {
      HATE: "HATE",
      INSULTS: "INSULTS",
      MISCONDUCT: "MISCONDUCT",
      PROMPT_ATTACK: "PROMPT_ATTACK",
      SEXUAL: "SEXUAL",
      VIOLENCE: "VIOLENCE"
    };
    GuardrailContentFiltersTierName = {
      CLASSIC: "CLASSIC",
      STANDARD: "STANDARD"
    };
    GuardrailContextualGroundingAction = {
      BLOCK: "BLOCK",
      NONE: "NONE"
    };
    GuardrailContextualGroundingFilterType = {
      GROUNDING: "GROUNDING",
      RELEVANCE: "RELEVANCE"
    };
    GuardrailSensitiveInformationAction = {
      ANONYMIZE: "ANONYMIZE",
      BLOCK: "BLOCK",
      NONE: "NONE"
    };
    GuardrailPiiEntityType = {
      ADDRESS: "ADDRESS",
      AGE: "AGE",
      AWS_ACCESS_KEY: "AWS_ACCESS_KEY",
      AWS_SECRET_KEY: "AWS_SECRET_KEY",
      CA_HEALTH_NUMBER: "CA_HEALTH_NUMBER",
      CA_SOCIAL_INSURANCE_NUMBER: "CA_SOCIAL_INSURANCE_NUMBER",
      CREDIT_DEBIT_CARD_CVV: "CREDIT_DEBIT_CARD_CVV",
      CREDIT_DEBIT_CARD_EXPIRY: "CREDIT_DEBIT_CARD_EXPIRY",
      CREDIT_DEBIT_CARD_NUMBER: "CREDIT_DEBIT_CARD_NUMBER",
      DRIVER_ID: "DRIVER_ID",
      EMAIL: "EMAIL",
      INTERNATIONAL_BANK_ACCOUNT_NUMBER: "INTERNATIONAL_BANK_ACCOUNT_NUMBER",
      IP_ADDRESS: "IP_ADDRESS",
      LICENSE_PLATE: "LICENSE_PLATE",
      MAC_ADDRESS: "MAC_ADDRESS",
      NAME: "NAME",
      PASSWORD: "PASSWORD",
      PHONE: "PHONE",
      PIN: "PIN",
      SWIFT_CODE: "SWIFT_CODE",
      UK_NATIONAL_HEALTH_SERVICE_NUMBER: "UK_NATIONAL_HEALTH_SERVICE_NUMBER",
      UK_NATIONAL_INSURANCE_NUMBER: "UK_NATIONAL_INSURANCE_NUMBER",
      UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER: "UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER",
      URL: "URL",
      USERNAME: "USERNAME",
      US_BANK_ACCOUNT_NUMBER: "US_BANK_ACCOUNT_NUMBER",
      US_BANK_ROUTING_NUMBER: "US_BANK_ROUTING_NUMBER",
      US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER: "US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER",
      US_PASSPORT_NUMBER: "US_PASSPORT_NUMBER",
      US_SOCIAL_SECURITY_NUMBER: "US_SOCIAL_SECURITY_NUMBER",
      VEHICLE_IDENTIFICATION_NUMBER: "VEHICLE_IDENTIFICATION_NUMBER"
    };
    GuardrailTopicsTierName = {
      CLASSIC: "CLASSIC",
      STANDARD: "STANDARD"
    };
    GuardrailTopicAction = {
      BLOCK: "BLOCK",
      NONE: "NONE"
    };
    GuardrailTopicType = {
      DENY: "DENY"
    };
    GuardrailWordAction = {
      BLOCK: "BLOCK",
      NONE: "NONE"
    };
    GuardrailManagedWordsType = {
      PROFANITY: "PROFANITY"
    };
    GuardrailStatus = {
      CREATING: "CREATING",
      DELETING: "DELETING",
      FAILED: "FAILED",
      READY: "READY",
      UPDATING: "UPDATING",
      VERSIONING: "VERSIONING"
    };
    InferenceProfileStatus = {
      ACTIVE: "ACTIVE"
    };
    InferenceProfileType = {
      APPLICATION: "APPLICATION",
      SYSTEM_DEFINED: "SYSTEM_DEFINED"
    };
    ModelCopyJobStatus = {
      COMPLETED: "Completed",
      FAILED: "Failed",
      IN_PROGRESS: "InProgress"
    };
    ModelImportJobStatus = {
      COMPLETED: "Completed",
      FAILED: "Failed",
      IN_PROGRESS: "InProgress"
    };
    S3InputFormat = {
      JSONL: "JSONL"
    };
    ModelInvocationJobStatus = {
      COMPLETED: "Completed",
      EXPIRED: "Expired",
      FAILED: "Failed",
      IN_PROGRESS: "InProgress",
      PARTIALLY_COMPLETED: "PartiallyCompleted",
      SCHEDULED: "Scheduled",
      STOPPED: "Stopped",
      STOPPING: "Stopping",
      SUBMITTED: "Submitted",
      VALIDATING: "Validating"
    };
    ModelCustomization = {
      CONTINUED_PRE_TRAINING: "CONTINUED_PRE_TRAINING",
      DISTILLATION: "DISTILLATION",
      FINE_TUNING: "FINE_TUNING"
    };
    InferenceType = {
      ON_DEMAND: "ON_DEMAND",
      PROVISIONED: "PROVISIONED"
    };
    ModelModality = {
      EMBEDDING: "EMBEDDING",
      IMAGE: "IMAGE",
      TEXT: "TEXT"
    };
    FoundationModelLifecycleStatus = {
      ACTIVE: "ACTIVE",
      LEGACY: "LEGACY"
    };
    PromptRouterStatus = {
      AVAILABLE: "AVAILABLE"
    };
    PromptRouterType = {
      CUSTOM: "custom",
      DEFAULT: "default"
    };
    CommitmentDuration = {
      ONE_MONTH: "OneMonth",
      SIX_MONTHS: "SixMonths"
    };
    ProvisionedModelStatus = {
      CREATING: "Creating",
      FAILED: "Failed",
      IN_SERVICE: "InService",
      UPDATING: "Updating"
    };
    SortByProvisionedModels = {
      CREATION_TIME: "CreationTime"
    };
    AuthorizationStatus = {
      AUTHORIZED: "AUTHORIZED",
      NOT_AUTHORIZED: "NOT_AUTHORIZED"
    };
    EntitlementAvailability = {
      AVAILABLE: "AVAILABLE",
      NOT_AVAILABLE: "NOT_AVAILABLE"
    };
    RegionAvailability = {
      AVAILABLE: "AVAILABLE",
      NOT_AVAILABLE: "NOT_AVAILABLE"
    };
    OfferType = {
      ALL: "ALL",
      PUBLIC: "PUBLIC"
    };
    ModelCustomizationJobStatus = {
      COMPLETED: "Completed",
      FAILED: "Failed",
      IN_PROGRESS: "InProgress",
      STOPPED: "Stopped",
      STOPPING: "Stopping"
    };
    JobStatusDetails = {
      COMPLETED: "Completed",
      FAILED: "Failed",
      IN_PROGRESS: "InProgress",
      NOT_STARTED: "NotStarted",
      STOPPED: "Stopped",
      STOPPING: "Stopping"
    };
    FineTuningJobStatus = {
      COMPLETED: "Completed",
      FAILED: "Failed",
      IN_PROGRESS: "InProgress",
      STOPPED: "Stopped",
      STOPPING: "Stopping"
    };
  });
  var E1t = {};
  __export(E1t, {
    paginateListProvisionedModelThroughputs: () => paginateListProvisionedModelThroughputs,
    paginateListPromptRouters: () => paginateListPromptRouters,
    paginateListModelInvocationJobs: () => paginateListModelInvocationJobs,
    paginateListModelImportJobs: () => paginateListModelImportJobs,
    paginateListModelCustomizationJobs: () => paginateListModelCustomizationJobs,
    paginateListModelCopyJobs: () => paginateListModelCopyJobs,
    paginateListMarketplaceModelEndpoints: () => paginateListMarketplaceModelEndpoints,
    paginateListInferenceProfiles: () => paginateListInferenceProfiles,
    paginateListImportedModels: () => paginateListImportedModels,
    paginateListGuardrails: () => paginateListGuardrails,
    paginateListEvaluationJobs: () => paginateListEvaluationJobs,
    paginateListCustomModels: () => paginateListCustomModels,
    paginateListCustomModelDeployments: () => paginateListCustomModelDeployments,
    paginateListAutomatedReasoningPolicyTestResults: () => paginateListAutomatedReasoningPolicyTestResults,
    paginateListAutomatedReasoningPolicyTestCases: () => paginateListAutomatedReasoningPolicyTestCases,
    paginateListAutomatedReasoningPolicyBuildWorkflows: () => paginateListAutomatedReasoningPolicyBuildWorkflows,
    paginateListAutomatedReasoningPolicies: () => paginateListAutomatedReasoningPolicies,
    __Client: () => Client_export2,
    VectorSearchRerankingConfigurationType: () => VectorSearchRerankingConfigurationType,
    ValidationException: () => ValidationException,
    UpdateProvisionedModelThroughputCommand: () => UpdateProvisionedModelThroughputCommand,
    UpdateMarketplaceModelEndpointCommand: () => UpdateMarketplaceModelEndpointCommand,
    UpdateGuardrailCommand: () => UpdateGuardrailCommand,
    UpdateAutomatedReasoningPolicyTestCaseCommand: () => UpdateAutomatedReasoningPolicyTestCaseCommand,
    UpdateAutomatedReasoningPolicyCommand: () => UpdateAutomatedReasoningPolicyCommand,
    UpdateAutomatedReasoningPolicyAnnotationsCommand: () => UpdateAutomatedReasoningPolicyAnnotationsCommand,
    UntagResourceCommand: () => UntagResourceCommand,
    TooManyTagsException: () => TooManyTagsException,
    ThrottlingException: () => ThrottlingException,
    TagResourceCommand: () => TagResourceCommand,
    StopModelInvocationJobCommand: () => StopModelInvocationJobCommand,
    StopModelCustomizationJobCommand: () => StopModelCustomizationJobCommand,
    StopEvaluationJobCommand: () => StopEvaluationJobCommand,
    Status: () => Status,
    StartAutomatedReasoningPolicyTestWorkflowCommand: () => StartAutomatedReasoningPolicyTestWorkflowCommand,
    StartAutomatedReasoningPolicyBuildWorkflowCommand: () => StartAutomatedReasoningPolicyBuildWorkflowCommand,
    SortOrder: () => SortOrder,
    SortModelsBy: () => SortModelsBy,
    SortJobsBy: () => SortJobsBy,
    SortByProvisionedModels: () => SortByProvisionedModels,
    ServiceUnavailableException: () => ServiceUnavailableException,
    ServiceQuotaExceededException: () => ServiceQuotaExceededException,
    SearchType: () => SearchType,
    S3InputFormat: () => S3InputFormat,
    RetrieveAndGenerateType: () => RetrieveAndGenerateType,
    ResourceNotFoundException: () => ResourceNotFoundException,
    ResourceInUseException: () => ResourceInUseException,
    RerankingMetadataSelectionMode: () => RerankingMetadataSelectionMode,
    RegisterMarketplaceModelEndpointCommand: () => RegisterMarketplaceModelEndpointCommand,
    RegionAvailability: () => RegionAvailability,
    QueryTransformationType: () => QueryTransformationType,
    PutUseCaseForModelAccessCommand: () => PutUseCaseForModelAccessCommand,
    PutModelInvocationLoggingConfigurationCommand: () => PutModelInvocationLoggingConfigurationCommand,
    ProvisionedModelStatus: () => ProvisionedModelStatus,
    PromptRouterType: () => PromptRouterType,
    PromptRouterStatus: () => PromptRouterStatus,
    PerformanceConfigLatency: () => PerformanceConfigLatency,
    OfferType: () => OfferType,
    ModelStatus: () => ModelStatus,
    ModelModality: () => ModelModality,
    ModelInvocationJobStatus: () => ModelInvocationJobStatus,
    ModelImportJobStatus: () => ModelImportJobStatus,
    ModelCustomizationJobStatus: () => ModelCustomizationJobStatus,
    ModelCustomization: () => ModelCustomization,
    ModelCopyJobStatus: () => ModelCopyJobStatus,
    ListTagsForResourceCommand: () => ListTagsForResourceCommand,
    ListProvisionedModelThroughputsCommand: () => ListProvisionedModelThroughputsCommand,
    ListPromptRoutersCommand: () => ListPromptRoutersCommand,
    ListModelInvocationJobsCommand: () => ListModelInvocationJobsCommand,
    ListModelImportJobsCommand: () => ListModelImportJobsCommand,
    ListModelCustomizationJobsCommand: () => ListModelCustomizationJobsCommand,
    ListModelCopyJobsCommand: () => ListModelCopyJobsCommand,
    ListMarketplaceModelEndpointsCommand: () => ListMarketplaceModelEndpointsCommand,
    ListInferenceProfilesCommand: () => ListInferenceProfilesCommand,
    ListImportedModelsCommand: () => ListImportedModelsCommand,
    ListGuardrailsCommand: () => ListGuardrailsCommand,
    ListFoundationModelsCommand: () => ListFoundationModelsCommand,
    ListFoundationModelAgreementOffersCommand: () => ListFoundationModelAgreementOffersCommand,
    ListEvaluationJobsCommand: () => ListEvaluationJobsCommand,
    ListCustomModelsCommand: () => ListCustomModelsCommand,
    ListCustomModelDeploymentsCommand: () => ListCustomModelDeploymentsCommand,
    ListAutomatedReasoningPolicyTestResultsCommand: () => ListAutomatedReasoningPolicyTestResultsCommand,
    ListAutomatedReasoningPolicyTestCasesCommand: () => ListAutomatedReasoningPolicyTestCasesCommand,
    ListAutomatedReasoningPolicyBuildWorkflowsCommand: () => ListAutomatedReasoningPolicyBuildWorkflowsCommand,
    ListAutomatedReasoningPoliciesCommand: () => ListAutomatedReasoningPoliciesCommand,
    JobStatusDetails: () => JobStatusDetails,
    InternalServerException: () => InternalServerException,
    InferenceType: () => InferenceType,
    InferenceProfileType: () => InferenceProfileType,
    InferenceProfileStatus: () => InferenceProfileStatus,
    GuardrailWordAction: () => GuardrailWordAction,
    GuardrailTopicsTierName: () => GuardrailTopicsTierName,
    GuardrailTopicType: () => GuardrailTopicType,
    GuardrailTopicAction: () => GuardrailTopicAction,
    GuardrailStatus: () => GuardrailStatus,
    GuardrailSensitiveInformationAction: () => GuardrailSensitiveInformationAction,
    GuardrailPiiEntityType: () => GuardrailPiiEntityType,
    GuardrailModality: () => GuardrailModality,
    GuardrailManagedWordsType: () => GuardrailManagedWordsType,
    GuardrailFilterStrength: () => GuardrailFilterStrength,
    GuardrailContextualGroundingFilterType: () => GuardrailContextualGroundingFilterType,
    GuardrailContextualGroundingAction: () => GuardrailContextualGroundingAction,
    GuardrailContentFiltersTierName: () => GuardrailContentFiltersTierName,
    GuardrailContentFilterType: () => GuardrailContentFilterType,
    GuardrailContentFilterAction: () => GuardrailContentFilterAction,
    GetUseCaseForModelAccessCommand: () => GetUseCaseForModelAccessCommand,
    GetProvisionedModelThroughputCommand: () => GetProvisionedModelThroughputCommand,
    GetPromptRouterCommand: () => GetPromptRouterCommand,
    GetModelInvocationLoggingConfigurationCommand: () => GetModelInvocationLoggingConfigurationCommand,
    GetModelInvocationJobCommand: () => GetModelInvocationJobCommand,
    GetModelImportJobCommand: () => GetModelImportJobCommand,
    GetModelCustomizationJobCommand: () => GetModelCustomizationJobCommand,
    GetModelCopyJobCommand: () => GetModelCopyJobCommand,
    GetMarketplaceModelEndpointCommand: () => GetMarketplaceModelEndpointCommand,
    GetInferenceProfileCommand: () => GetInferenceProfileCommand,
    GetImportedModelCommand: () => GetImportedModelCommand,
    GetGuardrailCommand: () => GetGuardrailCommand,
    GetFoundationModelCommand: () => GetFoundationModelCommand,
    GetFoundationModelAvailabilityCommand: () => GetFoundationModelAvailabilityCommand,
    GetEvaluationJobCommand: () => GetEvaluationJobCommand,
    GetCustomModelDeploymentCommand: () => GetCustomModelDeploymentCommand,
    GetCustomModelCommand: () => GetCustomModelCommand,
    GetAutomatedReasoningPolicyTestResultCommand: () => GetAutomatedReasoningPolicyTestResultCommand,
    GetAutomatedReasoningPolicyTestCaseCommand: () => GetAutomatedReasoningPolicyTestCaseCommand,
    GetAutomatedReasoningPolicyNextScenarioCommand: () => GetAutomatedReasoningPolicyNextScenarioCommand,
    GetAutomatedReasoningPolicyCommand: () => GetAutomatedReasoningPolicyCommand,
    GetAutomatedReasoningPolicyBuildWorkflowResultAssetsCommand: () => GetAutomatedReasoningPolicyBuildWorkflowResultAssetsCommand,
    GetAutomatedReasoningPolicyBuildWorkflowCommand: () => GetAutomatedReasoningPolicyBuildWorkflowCommand,
    GetAutomatedReasoningPolicyAnnotationsCommand: () => GetAutomatedReasoningPolicyAnnotationsCommand,
    FoundationModelLifecycleStatus: () => FoundationModelLifecycleStatus,
    FineTuningJobStatus: () => FineTuningJobStatus,
    ExternalSourceType: () => ExternalSourceType,
    ExportAutomatedReasoningPolicyVersionCommand: () => ExportAutomatedReasoningPolicyVersionCommand,
    EvaluationTaskType: () => EvaluationTaskType,
    EvaluationJobType: () => EvaluationJobType,
    EvaluationJobStatus: () => EvaluationJobStatus,
    EntitlementAvailability: () => EntitlementAvailability,
    DeregisterMarketplaceModelEndpointCommand: () => DeregisterMarketplaceModelEndpointCommand,
    DeleteProvisionedModelThroughputCommand: () => DeleteProvisionedModelThroughputCommand,
    DeletePromptRouterCommand: () => DeletePromptRouterCommand,
    DeleteModelInvocationLoggingConfigurationCommand: () => DeleteModelInvocationLoggingConfigurationCommand,
    DeleteMarketplaceModelEndpointCommand: () => DeleteMarketplaceModelEndpointCommand,
    DeleteInferenceProfileCommand: () => DeleteInferenceProfileCommand,
    DeleteImportedModelCommand: () => DeleteImportedModelCommand,
    DeleteGuardrailCommand: () => DeleteGuardrailCommand,
    DeleteFoundationModelAgreementCommand: () => DeleteFoundationModelAgreementCommand,
    DeleteCustomModelDeploymentCommand: () => DeleteCustomModelDeploymentCommand,
    DeleteCustomModelCommand: () => DeleteCustomModelCommand,
    DeleteAutomatedReasoningPolicyTestCaseCommand: () => DeleteAutomatedReasoningPolicyTestCaseCommand,
    DeleteAutomatedReasoningPolicyCommand: () => DeleteAutomatedReasoningPolicyCommand,
    DeleteAutomatedReasoningPolicyBuildWorkflowCommand: () => DeleteAutomatedReasoningPolicyBuildWorkflowCommand,
    CustomizationType: () => CustomizationType,
    CustomModelDeploymentStatus: () => CustomModelDeploymentStatus,
    CreateProvisionedModelThroughputCommand: () => CreateProvisionedModelThroughputCommand,
    CreatePromptRouterCommand: () => CreatePromptRouterCommand,
    CreateModelInvocationJobCommand: () => CreateModelInvocationJobCommand,
    CreateModelImportJobCommand: () => CreateModelImportJobCommand,
    CreateModelCustomizationJobCommand: () => CreateModelCustomizationJobCommand,
    CreateModelCopyJobCommand: () => CreateModelCopyJobCommand,
    CreateMarketplaceModelEndpointCommand: () => CreateMarketplaceModelEndpointCommand,
    CreateInferenceProfileCommand: () => CreateInferenceProfileCommand,
    CreateGuardrailVersionCommand: () => CreateGuardrailVersionCommand,
    CreateGuardrailCommand: () => CreateGuardrailCommand,
    CreateFoundationModelAgreementCommand: () => CreateFoundationModelAgreementCommand,
    CreateEvaluationJobCommand: () => CreateEvaluationJobCommand,
    CreateCustomModelDeploymentCommand: () => CreateCustomModelDeploymentCommand,
    CreateCustomModelCommand: () => CreateCustomModelCommand,
    CreateAutomatedReasoningPolicyVersionCommand: () => CreateAutomatedReasoningPolicyVersionCommand,
    CreateAutomatedReasoningPolicyTestCaseCommand: () => CreateAutomatedReasoningPolicyTestCaseCommand,
    CreateAutomatedReasoningPolicyCommand: () => CreateAutomatedReasoningPolicyCommand,
    ConflictException: () => ConflictException,
    CommitmentDuration: () => CommitmentDuration,
    CancelAutomatedReasoningPolicyBuildWorkflowCommand: () => CancelAutomatedReasoningPolicyBuildWorkflowCommand,
    BedrockServiceException: () => BedrockServiceException,
    BedrockClient: () => BedrockClient,
    Bedrock: () => Bedrock,
    BatchDeleteEvaluationJobCommand: () => BatchDeleteEvaluationJobCommand,
    AutomatedReasoningPolicyTestRunStatus: () => AutomatedReasoningPolicyTestRunStatus,
    AutomatedReasoningPolicyTestRunResult: () => AutomatedReasoningPolicyTestRunResult,
    AutomatedReasoningPolicyBuildWorkflowType: () => AutomatedReasoningPolicyBuildWorkflowType,
    AutomatedReasoningPolicyBuildWorkflowStatus: () => AutomatedReasoningPolicyBuildWorkflowStatus,
    AutomatedReasoningPolicyBuildResultAssetType: () => AutomatedReasoningPolicyBuildResultAssetType,
    AutomatedReasoningPolicyBuildMessageType: () => AutomatedReasoningPolicyBuildMessageType,
    AutomatedReasoningPolicyBuildDocumentContentType: () => AutomatedReasoningPolicyBuildDocumentContentType,
    AutomatedReasoningPolicyAnnotationStatus: () => AutomatedReasoningPolicyAnnotationStatus,
    AutomatedReasoningCheckResult: () => AutomatedReasoningCheckResult,
    AutomatedReasoningCheckLogicWarningType: () => AutomatedReasoningCheckLogicWarningType,
    AuthorizationStatus: () => AuthorizationStatus,
    AttributeType: () => AttributeType,
    ApplicationType: () => ApplicationType,
    AgreementStatus: () => AgreementStatus,
    AccessDeniedException: () => AccessDeniedException,
    $Command: () => Command_export2
  });
  var v1t = __lazy(() => {
    _Tn();
    $P();
    bJs();
    SJs();
    nXs();
    rXs();
    q$r();
  });
  function oXs(e) {
    let {
      signer: t,
      signer: n
    } = e;
    let r = Object.assign(e, {
      eventSigner: t,
      messageSigner: n
    });
    let o = r.eventStreamPayloadHandlerProvider(r);
    return Object.assign(r, {
      eventStreamPayloadHandler: o
    });
  }
  var sXs = () => {};
  var iXs = () => {};
  var aXs = () => {};
  class tqe {
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
      let t = new tqe({
        ...e,
        headers: {
          ...e.headers
        }
      });
      if (t.query) {
        t.query = Ehd(t.query);
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
      return tqe.clone(this);
    }
  }
  function Ehd(e) {
    return Object.keys(e).reduce((t, n) => {
      let r = e[n];
      return {
        ...t,
        [n]: Array.isArray(r) ? [...r] : r
      };
    }, {});
  }
  var lXs = () => {};
  var Ojr = __lazy(() => {
    sXs();
    iXs();
    aXs();
    lXs();
  });
  var cXs = e => (t, n) => async r => {
    let {
      request: o
    } = r;
    if (!tqe.isInstance(o)) {
      return t(r);
    }
    return e.eventStreamPayloadHandler.handle(t, r, n);
  };
  var uXs;
  var Djr = __lazy(() => {
    Ojr();
    uXs = {
      tags: ["EVENT_STREAM", "SIGNATURE", "HANDLE"],
      name: "eventStreamHandlingMiddleware",
      relation: "after",
      toMiddleware: "awsAuthMiddleware",
      override: true
    };
  });
  var dXs = e => async t => {
    let {
      request: n
    } = t;
    if (!tqe.isInstance(n)) {
      return e(t);
    }
    n.headers = {
      ...n.headers,
      "content-type": "application/vnd.amazon.eventstream",
      "x-amz-content-sha256": "STREAMING-AWS4-HMAC-SHA256-EVENTS"
    };
    return e({
      ...t,
      request: n
    });
  };
  var pXs;
  var Mjr = __lazy(() => {
    Ojr();
    pXs = {
      step: "build",
      tags: ["EVENT_STREAM", "HEADER", "CONTENT_TYPE", "CONTENT_SHA256"],
      name: "eventStreamHeaderMiddleware",
      override: true
    };
  });
  var mXs = e => ({
    applyToStack: t => {
      t.addRelativeTo(cXs(e), uXs);
      t.add(dXs, pXs);
    }
  });
  var fXs = __lazy(() => {
    Djr();
    Mjr();
  });
  var Njr = __lazy(() => {
    Djr();
    Mjr();
    fXs();
  });
  var hXs;
  var eXh;
  var tXh;
  var nXh;
  var rXh;
  var oXh;
  var sXh;
  var iXh;
  var aXh;
  var lXh;
  var cXh;
  var gXs;
  var yXs;
  var uXh;
  var dXh;
  var _Xs;
  var pXh;
  var mXh;
  var fXh;
  var hXh;
  var nqe;
  var Ljr;
  var gXh;
  var bXs;
  var yXh;
  var _Xh;
  var bXh;
  var SXh;
  var TXh;
  var EXh;
  var vXh;
  var wXh;
  var CXh;
  var Svn = __lazy(() => {
    hXs = __toESM(ort(), 1);
    ({
      __extends: eXh,
      __assign: tXh,
      __rest: nXh,
      __decorate: rXh,
      __param: oXh,
      __esDecorate: sXh,
      __runInitializers: iXh,
      __propKey: aXh,
      __setFunctionName: lXh,
      __metadata: cXh,
      __awaiter: gXs,
      __generator: yXs,
      __exportStar: uXh,
      __createBinding: dXh,
      __values: _Xs,
      __read: pXh,
      __spread: mXh,
      __spreadArrays: fXh,
      __spreadArray: hXh,
      __await: nqe,
      __asyncGenerator: Ljr,
      __asyncDelegator: gXh,
      __asyncValues: bXs,
      __makeTemplateObject: yXh,
      __importStar: _Xh,
      __importDefault: bXh,
      __classPrivateFieldGet: SXh,
      __classPrivateFieldSet: TXh,
      __classPrivateFieldIn: EXh,
      __addDisposableResource: vXh,
      __disposeResources: wXh,
      __rewriteRelativeImportExtension: CXh
    } = hXs.default);
  });
  var SXs = e => typeof ArrayBuffer === "function" && e instanceof ArrayBuffer || Object.prototype.toString.call(e) === "[object ArrayBuffer]";
  var Tvn;
  var rqe = (e, t = 0, n = e.byteLength - t) => {
    if (!SXs(e)) {
      throw TypeError(`The "input" argument must be ArrayBuffer. Received type ${typeof e} (${e})`);
    }
    return Tvn.Buffer.from(e, t, n);
  };
  var VAe = (e, t) => {
    if (typeof e !== "string") {
      throw TypeError(`The "input" argument must be of type string. Received type ${typeof e} (${e})`);
    }
    return t ? Tvn.Buffer.from(e, t) : Tvn.Buffer.from(e);
  };
  var Ule = __lazy(() => {
    Tvn = require("buffer");
  });
  var Fjr = e => {
    let t = VAe(e, "utf8");
    return new Uint8Array(t.buffer, t.byteOffset, t.byteLength / Uint8Array.BYTES_PER_ELEMENT);
  };
  var Ujr = __lazy(() => {
    Ule();
  });
  var TXs = __lazy(() => {
    Ujr();
  });
  var EXs = __lazy(() => {
    Ule();
  });
  var vXs = __lazy(() => {
    Ujr();
    TXs();
    EXs();
  });
  function Bjr(e) {
    if (e instanceof Uint8Array) {
      return e;
    }
    if (typeof e === "string") {
      return vhd(e);
    }
    if (ArrayBuffer.isView(e)) {
      return new Uint8Array(e.buffer, e.byteOffset, e.byteLength / Uint8Array.BYTES_PER_ELEMENT);
    }
    return new Uint8Array(e);
  }
  var vhd;
  var wXs = __lazy(() => {
    vXs();
    vhd = typeof Buffer < "u" && Buffer.from ? function (e) {
      return Buffer.from(e, "utf8");
    } : Fjr;
  });
  function $jr(e) {
    if (typeof e === "string") {
      return e.length === 0;
    }
    return e.byteLength === 0;
  }
  function Hjr(e) {
    return new Uint8Array([(e & 4278190080) >> 24, (e & 16711680) >> 16, (e & 65280) >> 8, e & 255]);
  }
  function jjr(e) {
    if (!Uint32Array.from) {
      var t = new Uint32Array(e.length);
      var n = 0;
      while (n < e.length) {
        t[n] = e[n];
        n += 1;
      }
      return t;
    }
    return Uint32Array.from(e);
  }
  var qjr = __lazy(() => {
    wXs();
  });
  var whd;
  var CXs = __lazy(() => {
    Svn();
    qjr();
    Evn();
    whd = function () {
      function e() {
        this.crc32 = new oqe();
      }
      e.prototype.update = function (t) {
        if ($jr(t)) {
          return;
        }
        this.crc32.update(Bjr(t));
      };
      e.prototype.digest = function () {
        return gXs(this, undefined, undefined, function () {
          return yXs(this, function (t) {
            return [2, Hjr(this.crc32.digest())];
          });
        });
      };
      e.prototype.reset = function () {
        this.crc32 = new oqe();
      };
      return e;
    }();
  });
  var oqe;
  var Chd;
  var Rhd;
  var Evn = __lazy(() => {
    Svn();
    qjr();
    CXs();
    oqe = function () {
      function e() {
        this.checksum = 4294967295;
      }
      e.prototype.update = function (t) {
        var n;
        var r;
        try {
          for (var o = _Xs(t), s = o.next(); !s.done; s = o.next()) {
            var i = s.value;
            this.checksum = this.checksum >>> 8 ^ Rhd[(this.checksum ^ i) & 255];
          }
        } catch (a) {
          n = {
            error: a
          };
        } finally {
          try {
            if (s && !s.done && (r = o.return)) {
              r.call(o);
            }
          } finally {
            if (n) {
              throw n.error;
            }
          }
        }
        return this;
      };
      e.prototype.digest = function () {
        return (this.checksum ^ 4294967295) >>> 0;
      };
      return e;
    }();
    Chd = [0, 1996959894, 3993919788, 2567524794, 124634137, 1886057615, 3915621685, 2657392035, 249268274, 2044508324, 3772115230, 2547177864, 162941995, 2125561021, 3887607047, 2428444049, 498536548, 1789927666, 4089016648, 2227061214, 450548861, 1843258603, 4107580753, 2211677639, 325883990, 1684777152, 4251122042, 2321926636, 335633487, 1661365465, 4195302755, 2366115317, 997073096, 1281953886, 3579855332, 2724688242, 1006888145, 1258607687, 3524101629, 2768942443, 901097722, 1119000684, 3686517206, 2898065728, 853044451, 1172266101, 3705015759, 2882616665, 651767980, 1373503546, 3369554304, 3218104598, 565507253, 1454621731, 3485111705, 3099436303, 671266974, 1594198024, 3322730930, 2970347812, 795835527, 1483230225, 3244367275, 3060149565, 1994146192, 31158534, 2563907772, 4023717930, 1907459465, 112637215, 2680153253, 3904427059, 2013776290, 251722036, 2517215374, 3775830040, 2137656763, 141376813, 2439277719, 3865271297, 1802195444, 476864866, 2238001368, 4066508878, 1812370925, 453092731, 2181625025, 4111451223, 1706088902, 314042704, 2344532202, 4240017532, 1658658271, 366619977, 2362670323, 4224994405, 1303535960, 984961486, 2747007092, 3569037538, 1256170817, 1037604311, 2765210733, 3554079995, 1131014506, 879679996, 2909243462, 3663771856, 1141124467, 855842277, 2852801631, 3708648649, 1342533948, 654459306, 3188396048, 3373015174, 1466479909, 544179635, 3110523913, 3462522015, 1591671054, 702138776, 2966460450, 3352799412, 1504918807, 783551873, 3082640443, 3233442989, 3988292384, 2596254646, 62317068, 1957810842, 3939845945, 2647816111, 81470997, 1943803523, 3814918930, 2489596804, 225274430, 2053790376, 3826175755, 2466906013, 167816743, 2097651377, 4027552580, 2265490386, 503444072, 1762050814, 4150417245, 2154129355, 426522225, 1852507879, 4275313526, 2312317920, 282753626, 1742555852, 4189708143, 2394877945, 397917763, 1622183637, 3604390888, 2714866558, 953729732, 1340076626, 3518719985, 2797360999, 1068828381, 1219638859, 3624741850, 2936675148, 906185462, 1090812512, 3747672003, 2825379669, 829329135, 1181335161, 3412177804, 3160834842, 628085408, 1382605366, 3423369109, 3138078467, 570562233, 1426400815, 3317316542, 2998733608, 733239954, 1555261956, 3268935591, 3050360625, 752459403, 1541320221, 2607071920, 3965973030, 1969922972, 40735498, 2617837225, 3943577151, 1913087877, 83908371, 2512341634, 3803740692, 2075208622, 213261112, 2463272603, 3855990285, 2094854071, 198958881, 2262029012, 4057260610, 1759359992, 534414190, 2176718541, 4139329115, 1873836001, 414664567, 2282248934, 4279200368, 1711684554, 285281116, 2405801727, 4167216745, 1634467795, 376229701, 2685067896, 3608007406, 1308918612, 956543938, 2808555105, 3495958263, 1231636301, 1047427035, 2932959818, 3654703836, 1088359270, 936918000, 2847714899, 3736837829, 1202900863, 817233897, 3183342108, 3401237130, 1404277552, 615818150, 3134207493, 3453421203, 1423857449, 601450431, 3009837614, 3294710456, 1567103746, 711928724, 3020668471, 3272380065, 1510334235, 755167117];
    Rhd = jjr(Chd);
  });
  function xXs(e) {
    if (e.length % 2 !== 0) {
      throw Error("Hex encoded strings must have an even number length");
    }
    let t = new Uint8Array(e.length / 2);
    for (let n = 0; n < e.length; n += 2) {
      let r = e.slice(n, n + 2).toLowerCase();
      if (r in Wjr) {
        t[n / 2] = Wjr[r];
      } else {
        throw Error(`Cannot decode unrecognized sequence ${r} as hexadecimal`);
      }
    }
    return t;
  }
  function zAe(e) {
    let t = "";
    for (let n = 0; n < e.byteLength; n++) {
      t += RXs[e[n]];
    }
    return t;
  }
  var RXs;
  var Wjr;
  var Gjr = __lazy(() => {
    RXs = {};
    Wjr = {};
    for (let e = 0; e < 256; e++) {
      let t = e.toString(16).toLowerCase();
      if (t.length === 1) {
        t = `0${t}`;
      }
      RXs[e] = t;
      Wjr[t] = e;
    }
  });
  class yot {
    bytes;
    constructor(e) {
      if (this.bytes = e, e.byteLength !== 8) {
        throw Error("Int64 buffers must be exactly 8 bytes");
      }
    }
    static fromNumber(e) {
      if (e > 9223372036854776000 || e < -9223372036854776000) {
        throw Error(`${e} is too large (or, if negative, too small) to represent as an Int64`);
      }
      let t = new Uint8Array(8);
      for (let n = 7, r = Math.abs(Math.round(e)); n > -1 && r > 0; n--, r /= 256) {
        t[n] = r;
      }
      if (e < 0) {
        kXs(t);
      }
      return new yot(t);
    }
    valueOf() {
      let e = this.bytes.slice(0);
      let t = e[0] & 128;
      if (t) {
        kXs(e);
      }
      return parseInt(zAe(e), 16) * (t ? -1 : 1);
    }
    toString() {
      return String(this.valueOf());
    }
  }
  function kXs(e) {
    for (let t = 0; t < 8; t++) {
      e[t] ^= 255;
    }
    for (let t = 7; t > -1; t--) {
      if (e[t]++, e[t] !== 0) {
        break;
      }
    }
  }
  var Vjr = __lazy(() => {
    Gjr();
  });
  class zjr {
    toUtf8;
    fromUtf8;
    constructor(e, t) {
      this.toUtf8 = e;
      this.fromUtf8 = t;
    }
    format(e) {
      let t = [];
      for (let o of Object.keys(e)) {
        let s = this.fromUtf8(o);
        t.push(Uint8Array.from([s.byteLength]), s, this.formatHeaderValue(e[o]));
      }
      let n = new Uint8Array(t.reduce((o, s) => o + s.byteLength, 0));
      let r = 0;
      for (let o of t) {
        n.set(o, r);
        r += o.byteLength;
      }
      return n;
    }
    formatHeaderValue(e) {
      switch (e.type) {
        case "boolean":
          return Uint8Array.from([e.value ? 0 : 1]);
        case "byte":
          return Uint8Array.from([2, e.value]);
        case "short":
          let t = new DataView(new ArrayBuffer(3));
          t.setUint8(0, 3);
          t.setInt16(1, e.value, false);
          return new Uint8Array(t.buffer);
        case "integer":
          let n = new DataView(new ArrayBuffer(5));
          n.setUint8(0, 4);
          n.setInt32(1, e.value, false);
          return new Uint8Array(n.buffer);
        case "long":
          let r = new Uint8Array(9);
          r[0] = 5;
          r.set(e.value.bytes, 1);
          return r;
        case "binary":
          let o = new DataView(new ArrayBuffer(3 + e.value.byteLength));
          o.setUint8(0, 6);
          o.setUint16(1, e.value.byteLength, false);
          let s = new Uint8Array(o.buffer);
          s.set(e.value, 3);
          return s;
        case "string":
          let i = this.fromUtf8(e.value);
          let a = new DataView(new ArrayBuffer(3 + i.byteLength));
          a.setUint8(0, 7);
          a.setUint16(1, i.byteLength, false);
          let l = new Uint8Array(a.buffer);
          l.set(i, 3);
          return l;
        case "timestamp":
          let c = new Uint8Array(9);
          c[0] = 8;
          c.set(yot.fromNumber(e.value.valueOf()).bytes, 1);
          return c;
        case "uuid":
          if (!Nhd.test(e.value)) {
            throw Error(`Invalid UUID received: ${e.value}`);
          }
          let u = new Uint8Array(17);
          u[0] = 9;
          u.set(xXs(e.value.replace(/\-/g, "")), 1);
          return u;
      }
    }
    parse(e) {
      let t = {};
      let n = 0;
      while (n < e.byteLength) {
        let r = e.getUint8(n++);
        let o = this.toUtf8(new Uint8Array(e.buffer, e.byteOffset + n, r));
        switch (n += r, e.getUint8(n++)) {
          case 0:
            t[o] = {
              type: "boolean",
              value: true
            };
            break;
          case 1:
            t[o] = {
              type: "boolean",
              value: false
            };
            break;
          case 2:
            t[o] = {
              type: "byte",
              value: e.getInt8(n++)
            };
            break;
          case 3:
            t[o] = {
              type: "short",
              value: e.getInt16(n, false)
            };
            n += 2;
            break;
          case 4:
            t[o] = {
              type: "integer",
              value: e.getInt32(n, false)
            };
            n += 4;
            break;
          case 5:
            t[o] = {
              type: "long",
              value: new yot(new Uint8Array(e.buffer, e.byteOffset + n, 8))
            };
            n += 8;
            break;
          case 6:
            let s = e.getUint16(n, false);
            n += 2;
            t[o] = {
              type: "binary",
              value: new Uint8Array(e.buffer, e.byteOffset + n, s)
            };
            n += s;
            break;
          case 7:
            let i = e.getUint16(n, false);
            n += 2;
            t[o] = {
              type: "string",
              value: this.toUtf8(new Uint8Array(e.buffer, e.byteOffset + n, i))
            };
            n += i;
            break;
          case 8:
            t[o] = {
              type: "timestamp",
              value: new Date(new yot(new Uint8Array(e.buffer, e.byteOffset + n, 8)).valueOf())
            };
            n += 8;
            break;
          case 9:
            let a = new Uint8Array(e.buffer, e.byteOffset + n, 16);
            n += 16;
            t[o] = {
              type: "uuid",
              value: `${zAe(a.subarray(0, 4))}-${zAe(a.subarray(4, 6))}-${zAe(a.subarray(6, 8))}-${zAe(a.subarray(8, 10))}-${zAe(a.subarray(10))}`
            };
            break;
          default:
            throw Error("Unrecognized header type tag");
        }
      }
      return t;
    }
  }
  var AXs;
  var Nhd;
  var Kjr = __lazy(() => {
    Gjr();
    Vjr();
    (function (e) {
      e[e.boolTrue = 0] = "boolTrue";
      e[e.boolFalse = 1] = "boolFalse";
      e[e.byte = 2] = "byte";
      e[e.short = 3] = "short";
      e[e.integer = 4] = "integer";
      e[e.long = 5] = "long";
      e[e.byteArray = 6] = "byteArray";
      e[e.string = 7] = "string";
      e[e.timestamp = 8] = "timestamp";
      e[e.uuid = 9] = "uuid";
    })(AXs || (AXs = {}));
    Nhd = /^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$/;
  });
  function OXs({
    byteLength: e,
    byteOffset: t,
    buffer: n
  }) {
    if (e < Lhd) {
      throw Error("Provided message too short to accommodate event stream message overhead");
    }
    let r = new DataView(n, t, e);
    let o = r.getUint32(0, false);
    if (e !== o) {
      throw Error("Reported message length does not match received message length");
    }
    let s = r.getUint32(4, false);
    let i = r.getUint32(KAe, false);
    let a = r.getUint32(e - 4, false);
    let l = new oqe().update(new Uint8Array(n, t, KAe));
    if (i !== l.digest()) {
      throw Error(`The prelude checksum specified in the message (${i}) does not match the calculated CRC32 checksum (${l.digest()})`);
    }
    if (l.update(new Uint8Array(n, t + KAe, e - (KAe + 4))), a !== l.digest()) {
      throw Error(`The message checksum (${l.digest()}) did not match the expected value of ${a}`);
    }
    return {
      headers: new DataView(n, t + KAe + 4, s),
      body: new Uint8Array(n, t + KAe + 4 + s, o - s - (KAe + 4 + 4))
    };
  }
  var KAe;
  var Lhd;
  var DXs = __lazy(() => {
    Evn();
    KAe = 4 * 2;
    Lhd = KAe + 4 * 2;
  });
  class w1t {
    headerMarshaller;
    messageBuffer;
    isEndOfStream;
    constructor(e, t) {
      this.headerMarshaller = new zjr(e, t);
      this.messageBuffer = [];
      this.isEndOfStream = false;
    }
    feed(e) {
      this.messageBuffer.push(this.oC(e));
    }
    endOfStream() {
      this.isEndOfStream = true;
    }
    getMessage() {
      let e = this.messageBuffer.pop();
      let t = this.isEndOfStream;
      return {
        getMessage() {
          return e;
        },
        isEndOfStream() {
          return t;
        }
      };
    }
    getAvailableMessages() {
      let e = this.messageBuffer;
      this.messageBuffer = [];
      let t = this.isEndOfStream;
      return {
        getMessages() {
          return e;
        },
        isEndOfStream() {
          return t;
        }
      };
    }
    HS({
      headers: e,
      body: t
    }) {
      let n = this.headerMarshaller.format(e);
      let r = n.byteLength + t.byteLength + 16;
      let o = new Uint8Array(r);
      let s = new DataView(o.buffer, o.byteOffset, o.byteLength);
      let i = new oqe();
      s.setUint32(0, r, false);
      s.setUint32(4, n.byteLength, false);
      s.setUint32(8, i.update(o.subarray(0, 8)).digest(), false);
      o.set(n, 12);
      o.set(t, n.byteLength + 12);
      s.setUint32(r - 4, i.update(o.subarray(8, r - 4)).digest(), false);
      return o;
    }
    oC(e) {
      let {
        headers: t,
        body: n
      } = OXs(e);
      return {
        headers: this.headerMarshaller.parse(t),
        body: n
      };
    }
    formatHeaders(e) {
      return this.headerMarshaller.format(e);
    }
  }
  var MXs = __lazy(() => {
    Evn();
    Kjr();
    DXs();
  });
  var NXs = () => {};
  var Yjr;
  var LXs = __lazy(() => {
    Yjr = class Yjr {
      options;
      constructor(e) {
        this.options = e;
      }
      [Symbol.asyncIterator]() {
        return this.asyncIterator();
      }
      async *asyncIterator() {
        for await (let e of this.options.inputStream) {
          yield this.options.decoder.oC(e);
        }
      }
    };
  });
  var Jjr;
  var FXs = __lazy(() => {
    Jjr = class Jjr {
      options;
      constructor(e) {
        this.options = e;
      }
      [Symbol.asyncIterator]() {
        return this.asyncIterator();
      }
      async *asyncIterator() {
        for await (let e of this.options.messageStream) {
          yield this.options.encoder.HS(e);
        }
        if (this.options.includeEndFrame) {
          yield new Uint8Array(0);
        }
      }
    };
  });
  var Xjr;
  var UXs = __lazy(() => {
    Xjr = class Xjr {
      options;
      constructor(e) {
        this.options = e;
      }
      [Symbol.asyncIterator]() {
        return this.asyncIterator();
      }
      async *asyncIterator() {
        for await (let e of this.options.messageStream) {
          let t = await this.options.deserializer(e);
          if (t === undefined) {
            continue;
          }
          yield t;
        }
      }
    };
  });
  var Qjr;
  var BXs = __lazy(() => {
    Qjr = class Qjr {
      options;
      constructor(e) {
        this.options = e;
      }
      [Symbol.asyncIterator]() {
        return this.asyncIterator();
      }
      async *asyncIterator() {
        for await (let e of this.options.inputStream) {
          yield this.options.serializer(e);
        }
      }
    };
  });
  var Zjr = __lazy(() => {
    MXs();
    Kjr();
    Vjr();
    NXs();
    LXs();
    FXs();
    UXs();
    BXs();
  });
  var $Xs = () => {};
  var HXs = () => e => async t => {
    let n = {
      ...t.input
    };
    let r = await e(t);
    let o = r.output;
    if (n.SessionId && o.SessionId == null) {
      o.SessionId = n.SessionId;
    }
    return r;
  };
  var jXs;
  var qXs = __lazy(() => {
    jXs = {
      step: "initialize",
      name: "injectSessionIdMiddleware",
      tags: ["WEBSOCKET", "EVENT_STREAM"],
      override: true
    };
  });
  var WXs = () => {};
  var GXs = () => {};
  var VXs = () => {};
  class iqe {
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
      let t = new iqe({
        ...e,
        headers: {
          ...e.headers
        }
      });
      if (t.query) {
        t.query = Fhd(t.query);
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
      return iqe.clone(this);
    }
  }
  function Fhd(e) {
    return Object.keys(e).reduce((t, n) => {
      let r = e[n];
      return {
        ...t,
        [n]: Array.isArray(r) ? [...r] : r
      };
    }, {});
  }
  var zXs = () => {};
  var eqr = __lazy(() => {
    WXs();
    GXs();
    VXs();
    zXs();
  });
  var KXs = (e, t) => n => r => {
    let {
      request: o
    } = r;
    if (iqe.isInstance(o) && e.requestHandler.metadata?.handlerProtocol?.toLowerCase().includes("websocket")) {
      o.protocol = "wss:";
      o.method = "GET";
      o.path = `${o.path}-websocket`;
      let {
        headers: s
      } = o;
      delete s["content-type"];
      delete s["x-amz-content-sha256"];
      for (let i of Object.keys(s)) {
        if (i.indexOf(t.headerPrefix) === 0) {
          let a = i.replace(t.headerPrefix, "");
          o.query[a] = s[i];
        }
      }
      if (s["x-amz-user-agent"]) {
        o.query["user-agent"] = s["x-amz-user-agent"];
      }
      o.headers = {
        host: s.host ?? o.hostname
      };
    }
    return n(r);
  };
  var YXs;
  var JXs = __lazy(() => {
    eqr();
    YXs = {
      name: "websocketEndpointMiddleware",
      tags: ["WEBSOCKET", "EVENT_STREAM"],
      relation: "after",
      toMiddleware: "eventStreamHeaderMiddleware",
      override: true
    };
  });
  var XXs = (e, t) => ({
    applyToStack: n => {
      n.addRelativeTo(KXs(e, t), YXs);
      n.add(HXs(), jXs);
    }
  });
  var QXs = __lazy(() => {
    qXs();
    JXs();
  });
  var ZXs = e => e.protocol === "ws:" || e.protocol === "wss:";
  class tqr {
    signer;
    constructor(e) {
      this.signer = e.signer;
    }
    presign(e, t = {}) {
      return this.signer.presign(e, t);
    }
    async sign(e, t) {
      if (iqe.isInstance(e) && ZXs(e)) {
        return {
          ...(await this.signer.presign({
            ...e,
            body: ""
          }, {
            ...t,
            expiresIn: 60,
            unsignableHeaders: new Set(Object.keys(e.headers).filter(r => r !== "host"))
          })),
          body: e.body
        };
      } else {
        return this.signer.sign(e, t);
      }
    }
  }
  var eQs = __lazy(() => {
    eqr();
  });
  var tQs = e => {
    let {
      signer: t
    } = e;
    return Object.assign(e, {
      signer: async n => {
        let r = await t(n);
        if (Uhd(r)) {
          return new tqr({
            signer: r
          });
        }
        throw Error("Expected WebsocketSignatureV4 signer, please check the client constructor.");
      }
    });
  };
  var Uhd = e => !!e;
  var nQs = __lazy(() => {
    eQs();
  });
  var rQs = () => {};
  var nqr = __lazy(() => {
    $Xs();
    QXs();
    nQs();
    rQs();
  });
  var oQs = e => Object.assign(e, {
    eventStreamMarshaller: e.eventStreamSerdeProvider(e)
  });
  var sQs = () => {};
  class Client_export3 {
    config;
    middlewareStack = iQs.constructStack();
    initConfig;
    handlers;
    constructor(e) {
      this.config = e;
    }
    send(e, t, n) {
      let r = typeof t !== "function" ? t : undefined;
      let o = typeof t === "function" ? t : n;
      let s = r === undefined && this.config.cacheMiddleware === true;
      let i;
      if (s) {
        if (!this.handlers) {
          this.handlers = new WeakMap();
        }
        let a = this.handlers;
        if (a.vZc(e.constructor)) {
          i = a.get(e.constructor);
        } else {
          i = e.resolveMiddleware(this.middlewareStack, this.config, r);
          a.set(e.constructor, i);
        }
      } else {
        delete this.handlers;
        i = e.resolveMiddleware(this.middlewareStack, this.config, r);
      }
      if (o) {
        i(e).then(a => o(null, a.output), a => o(a)).catch(() => {});
      } else {
        return i(e).then(a => a.output);
      }
    }
    destroy() {
      this.config?.requestHandler?.destroy?.();
      delete this.handlers;
    }
  }
  var iQs;
  var aQs = __lazy(() => {
    iQs = __toESM(QB(), 1);
  });
  var lQs;
  var cQs = __lazy(() => {
    lQs = __toESM(tw(), 1);
  });
  var uQs = () => {};
  var dQs;
  var pQs = __lazy(() => {
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(dQs || (dQs = {}));
  });
  var mQs;
  var fQs = __lazy(() => {
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(mQs || (mQs = {}));
  });
  var hQs = () => {};
  var gQs = () => {};
  var yQs = () => {};
  var _Qs = () => {};
  var bQs = __lazy(() => {
    pQs();
    fQs();
    hQs();
    gQs();
    yQs();
    _Qs();
  });
  var SQs = () => {};
  var TQs = () => {};
  var EQs = () => {};
  var vQs = () => {};
  var wQs = () => {};
  var CQs = () => {};
  var RQs = () => {};
  var xQs = __lazy(() => {
    wQs();
    CQs();
    RQs();
  });
  var kQs = () => {};
  var AQs = () => {};
  var IQs;
  var PQs = __lazy(() => {
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(IQs || (IQs = {}));
  });
  var OQs = () => {};
  var DQs = () => {};
  var MQs = () => {};
  var NQs = () => {};
  var LQs = () => {};
  var FQs = __lazy(() => {
    OQs();
    DQs();
    MQs();
    NQs();
    LQs();
  });
  var UQs = () => {};
  var _ot;
  var BQs = __lazy(() => {
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(_ot || (_ot = {}));
  });
  var $Qs = () => {};
  var HQs = () => {};
  var jQs = __lazy(() => {
    BQs();
    $Qs();
    HQs();
  });
  var qQs = () => {};
  var WQs;
  var GQs = __lazy(() => {
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(WQs || (WQs = {}));
  });
  var VQs = () => {};
  var zQs = () => {};
  var KQs = () => {};
  var YQs = () => {};
  var JQs = () => {};
  var XQs = __lazy(() => {
    zQs();
    KQs();
    YQs();
    JQs();
  });
  var QQs = () => {};
  var eZs = () => {};
  var tZs;
  var nZs = __lazy(() => {
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(tZs || (tZs = {}));
  });
  var rZs = () => {};
  var oZs = () => {};
  var sZs = () => {};
  var iZs = () => {};
  var aZs = () => {};
  var lZs = () => {};
  var cZs = () => {};
  var uZs = () => {};
  var dZs = () => {};
  var pZs = () => {};
  var mZs = () => {};
  var fZs = () => {};
  var hZs = () => {};
  var gZs = () => {};
  var yZs;
  var _Zs = __lazy(() => {
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(yZs || (yZs = {}));
  });
  var bZs = () => {};
  var SZs = () => {};
  var TZs = () => {};
  var EZs = () => {};
  var vZs = () => {};
  var wZs = () => {};
  var CZs = () => {};
  var rqr = __lazy(() => {
    uQs();
    bQs();
    SQs();
    TQs();
    EQs();
    vQs();
    xQs();
    kQs();
    AQs();
    PQs();
    FQs();
    UQs();
    jQs();
    qQs();
    GQs();
    VQs();
    XQs();
    QQs();
    eZs();
    nZs();
    rZs();
    oZs();
    sZs();
    iZs();
    aZs();
    lZs();
    cZs();
    uZs();
    dZs();
    pZs();
    mZs();
    fZs();
    hZs();
    gZs();
    _Zs();
    bZs();
    SZs();
    TZs();
    EZs();
    vZs();
    wZs();
    CZs();
  });
  function vvn(e, t) {
    if (t == null) {
      return t;
    }
    let n = RZs.NormalizedSchema.of(e);
    if (n.getMergedTraits().sensitive) {
      return "***SensitiveInformation***";
    }
    if (n.isListSchema()) {
      if (!!n.getValueSchema().getMergedTraits().sensitive) {
        return "***SensitiveInformation***";
      }
    } else if (n.isMapSchema()) {
      if (!!n.getKeySchema().getMergedTraits().sensitive || !!n.getValueSchema().getMergedTraits().sensitive) {
        return "***SensitiveInformation***";
      }
    } else if (n.isStructSchema() && typeof t === "object") {
      let r = t;
      let o = {};
      for (let [s, i] of n.structIterator()) {
        if (r[s] != null) {
          o[s] = vvn(i, r[s]);
        }
      }
      return o;
    }
    return t;
  }
  var RZs;
  var xZs = __lazy(() => {
    RZs = __toESM(qT(), 1);
  });
  class Command_export3 {
    middlewareStack = kZs.constructStack();
    schema;
    static classBuilder() {
      return new AZs();
    }
    resolveMiddlewareWithContext(e, t, n, {
      middlewareFn: r,
      clientName: o,
      commandName: s,
      inputFilterSensitiveLog: i,
      outputFilterSensitiveLog: a,
      smithyContext: l,
      additionalContext: c,
      CommandCtor: u
    }) {
      for (let h of r.bind(this)(u, e, t, n)) {
        this.middlewareStack.use(h);
      }
      let d = e.concat(this.middlewareStack);
      let {
        logger: p
      } = t;
      let m = {
        logger: p,
        clientName: o,
        commandName: s,
        inputFilterSensitiveLog: i,
        outputFilterSensitiveLog: a,
        ["__smithy_context"]: {
          commandInstance: this,
          ...l
        },
        ...c
      };
      let {
        requestHandler: f
      } = t;
      return d.resolve(h => f.handle(h.request, n || {}), m);
    }
  }
  class AZs {
    _init = () => {};
    _ep = {};
    _middlewareFn = () => [];
    _commandName = "";
    _clientName = "";
    _additionalContext = {};
    _smithyContext = {};
    _inputFilterSensitiveLog = undefined;
    _outputFilterSensitiveLog = undefined;
    _serializer = null;
    _deserializer = null;
    _operationSchema;
    init(e) {
      this._init = e;
    }
    ep(e) {
      this._ep = e;
      return this;
    }
    m(e) {
      this._middlewareFn = e;
      return this;
    }
    s(e, t, n = {}) {
      this._smithyContext = {
        service: e,
        operation: t,
        ...n
      };
      return this;
    }
    c(e = {}) {
      this._additionalContext = e;
      return this;
    }
    n(e, t) {
      this._clientName = e;
      this._commandName = t;
      return this;
    }
    f(e = n => n, t = n => n) {
      this._inputFilterSensitiveLog = e;
      this._outputFilterSensitiveLog = t;
      return this;
    }
    ser(e) {
      this._serializer = e;
      return this;
    }
    de(e) {
      this._deserializer = e;
      return this;
    }
    sc(e) {
      this._operationSchema = e;
      this._smithyContext.operationSchema = e;
      return this;
    }
    build() {
      let e = this;
      let t;
      return t = class extends Command_export3 {
        input;
        static getEndpointParameterInstructions() {
          return e._ep;
        }
        constructor(...[n]) {
          super();
          this.input = n ?? {};
          e._init(this);
          this.schema = e._operationSchema;
        }
        resolveMiddleware(n, r, o) {
          let s = e._operationSchema;
          let i = s?.[4] ?? s?.input;
          let a = s?.[5] ?? s?.output;
          return this.resolveMiddlewareWithContext(n, r, o, {
            CommandCtor: t,
            middlewareFn: e._middlewareFn,
            clientName: e._clientName,
            commandName: e._commandName,
            inputFilterSensitiveLog: e._inputFilterSensitiveLog ?? (s ? vvn.bind(null, i) : l => l),
            outputFilterSensitiveLog: e._outputFilterSensitiveLog ?? (s ? vvn.bind(null, a) : l => l),
            smithyContext: e._smithyContext,
            additionalContext: e._additionalContext
          });
        }
        serialize = e._serializer;
        deserialize = e._deserializer;
      };
    }
  }
  var kZs;
  var IZs = __lazy(() => {
    rqr();
    xZs();
    kZs = __toESM(QB(), 1);
  });
  var createAggregatedClient_export3 = (e, t) => {
    for (let n of Object.keys(e)) {
      let r = e[n];
      let o = async function (i, a, l) {
        let c = new r(i);
        if (typeof a === "function") {
          this.send(c, a);
        } else if (typeof l === "function") {
          if (typeof a !== "object") {
            throw Error(`Expected http options but got ${typeof a}`);
          }
          this.send(c, a || {}, l);
        } else {
          return this.send(c, a);
        }
      };
      let s = (n[0].toLowerCase() + n.slice(1)).replace(/Command$/, "");
      t.prototype[s] = o;
    }
  };
  var ServiceException_export3;
  var decorateServiceException_export3 = (e, t = {}) => {
    Object.entries(t).filter(([, r]) => r !== undefined).forEach(([r, o]) => {
      if (e[r] == null || e[r] === "") {
        e[r] = o;
      }
    });
    let n = e.message || e.Message || "UnknownError";
    e.message = n;
    delete e.Message;
    return e;
  };
  var aqr = __lazy(() => {
    ServiceException_export3 = class YAe extends Error {
      $fault;
      $response;
      $retryable;
      $metadata;
      constructor(e) {
        super(e.message);
        Object.setPrototypeOf(this, Object.getPrototypeOf(this).constructor.prototype);
        this.name = e.name;
        this.$fault = e.$fault;
        this.$metadata = e.$metadata;
      }
      static isInstance(e) {
        if (!e) {
          return false;
        }
        let t = e;
        return YAe.prototype.isPrototypeOf(t) || Boolean(t.$fault) && Boolean(t.$metadata) && (t.$fault === "client" || t.$fault === "server");
      }
      static [Symbol.hasInstance](e) {
        if (!e) {
          return false;
        }
        let t = e;
        if (this === YAe) {
          return YAe.isInstance(e);
        }
        if (YAe.isInstance(e)) {
          if (t.name && this.name) {
            return this.prototype.isPrototypeOf(e) || t.name === this.name;
          }
          return this.prototype.isPrototypeOf(e);
        }
        return false;
      }
    };
  });
  var throwDefaultError_export3 = ({
    output: e,
    parsedBody: t,
    exceptionCtor: n,
    errorCode: r
  }) => {
    let o = Hhd(e);
    let s = o.httpStatusCode ? o.httpStatusCode + "" : undefined;
    let i = new n({
      name: t?.code || t?.Code || r || s || "UnknownError",
      $fault: "client",
      $metadata: o
    });
    throw decorateServiceException_export3(i, t);
  };
  var withBaseException_export3 = e => ({
    output: t,
    parsedBody: n,
    errorCode: r
  }) => {
    throwDefaultError_export3({
      output: t,
      parsedBody: n,
      exceptionCtor: e,
      errorCode: r
    });
  };
  var Hhd = e => ({
    httpStatusCode: e.statusCode,
    requestId: e.headers["x-amzn-requestid"] ?? e.headers["x-amzn-request-id"] ?? e.headers["x-amz-request-id"],
    extendedRequestId: e.headers["x-amz-id-2"],
    cfId: e.headers["x-amz-cf-id"]
  });
  var OZs = __lazy(() => {
    aqr();
  });
  var loadConfigsForDefaultMode_export3 = e => {
    switch (e) {
      case "standard":
        return {
          retryMode: "standard",
          connectionTimeout: 3100
        };
      case "in-region":
        return {
          retryMode: "standard",
          connectionTimeout: 1100
        };
      case "cross-region":
        return {
          retryMode: "standard",
          connectionTimeout: 3100
        };
      case "mobile":
        return {
          retryMode: "standard",
          connectionTimeout: 30000
        };
      default:
        return {};
    }
  };
  var DZs = false;
  var emitWarningIfUnsupportedVersion_export3 = e => {
    if (e && !DZs && parseInt(e.substring(1, e.indexOf("."))) < 16) {
      DZs = true;
    }
  };
  var MZs;
  var NZs = __lazy(() => {
    MZs = __toESM(tw(), 1);
  });
  var LZs = e => {
    let t = [];
    for (let n in _ot) {
      let r = _ot[n];
      if (e[r] === undefined) {
        continue;
      }
      t.push({
        algorithmId: () => r,
        checksumConstructor: () => e[r]
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
  var FZs = e => {
    let t = {};
    e.checksumAlgorithms().forEach(n => {
      t[n.algorithmId()] = n.checksumConstructor();
    });
    return t;
  };
  var UZs = __lazy(() => {
    rqr();
  });
  var BZs = e => ({
    setRetryStrategy(t) {
      e.retryStrategy = t;
    },
    retryStrategy() {
      return e.retryStrategy;
    }
  });
  var $Zs = e => {
    let t = {};
    t.retryStrategy = e.retryStrategy();
    return t;
  };
  var getDefaultExtensionConfiguration_export3 = e => Object.assign(LZs(e), BZs(e));
  var resolveDefaultRuntimeConfig_export3 = e => Object.assign(FZs(e), $Zs(e));
  var jZs = __lazy(() => {});
  var getArrayIfSingleItem_export3 = e => Array.isArray(e) ? e : [e];
  var getValueFromTextNode_export3 = e => {
    for (let n in e) {
      if (e.hasOwnProperty(n) && e[n]["#text"] !== undefined) {
        e[n] = e[n]["#text"];
      } else if (typeof e[n] === "object" && e[n] !== null) {
        e[n] = getValueFromTextNode_export3(e[n]);
      }
    }
    return e;
  };
  var isSerializableHeaderValue_export3 = e => e != null;
  class NoOpLogger_export3 {
    trace() {}
    debug() {}
    info() {}
    warn() {}
    error() {}
  }
  function map_export5(e, t, n) {
    let r;
    let o;
    let s;
    if (typeof t > "u" && typeof n > "u") {
      r = {};
      s = e;
    } else if (r = e, typeof t === "function") {
      o = t;
      s = n;
      return zhd(r, o, s);
    } else {
      s = t;
    }
    for (let i of Object.keys(s)) {
      if (!Array.isArray(s[i])) {
        r[i] = s[i];
        continue;
      }
      GZs(r, null, s, i);
    }
    return r;
  }
  var convertMap_export3 = e => {
    let t = {};
    for (let [n, r] of Object.entries(e || {})) {
      t[n] = [, r];
    }
    return t;
  };
  var take_export3 = (e, t) => {
    let n = {};
    for (let r in t) {
      GZs(n, e, t, r);
    }
    return n;
  };
  var zhd = (e, t, n) => map_export5(e, Object.entries(n).reduce((r, [o, s]) => {
    if (Array.isArray(s)) {
      r[o] = s;
    } else if (typeof s === "function") {
      r[o] = [t, s()];
    } else {
      r[o] = [t, s];
    }
    return r;
  }, {}));
  var GZs = (e, t, n, r) => {
    if (t !== null) {
      let i = n[r];
      if (typeof i === "function") {
        i = [, i];
      }
      let [a = Khd, l = Yhd, c = r] = i;
      if (typeof a === "function" && a(t[c]) || typeof a !== "function" && !!a) {
        e[r] = l(t[c]);
      }
      return;
    }
    let [o, s] = n[r];
    if (typeof s === "function") {
      let i;
      let a = o === undefined && (i = s()) != null;
      let l = typeof o === "function" && !!o(undefined) || typeof o !== "function" && !!o;
      if (a) {
        e[r] = i;
      } else if (l) {
        e[r] = s();
      }
    } else {
      let i = o === undefined && s != null;
      let a = typeof o === "function" && !!o(s) || typeof o !== "function" && !!o;
      if (i || a) {
        e[r] = s;
      }
    }
  };
  var Khd = e => e != null;
  var Yhd = e => e;
  var VZs;
  var zZs = __lazy(() => {
    VZs = __toESM(tw(), 1);
  });
  var serializeFloat_export3 = e => {
    if (e !== e) {
      return "NaN";
    }
    switch (e) {
      case 1 / 0:
        return "Infinity";
      case -1 / 0:
        return "-Infinity";
      default:
        return e;
    }
  };
  var serializeDateTime_export3 = e => e.toISOString().replace(".000Z", "Z");
  var _json_export3 = e => {
    if (e == null) {
      return {};
    }
    if (Array.isArray(e)) {
      return e.filter(t => t != null).map(_json_export3);
    }
    if (typeof e === "object") {
      let t = {};
      for (let n of Object.keys(e)) {
        if (e[n] == null) {
          continue;
        }
        t[n] = _json_export3(e[n]);
      }
      return t;
    }
    return e;
  };
  var bk = {};
  __export(bk, {
    withBaseException: () => withBaseException_export3,
    throwDefaultError: () => throwDefaultError_export3,
    take: () => take_export3,
    serializeFloat: () => serializeFloat_export3,
    serializeDateTime: () => serializeDateTime_export3,
    resolvedPath: () => VZs.resolvedPath,
    resolveDefaultRuntimeConfig: () => resolveDefaultRuntimeConfig_export3,
    map: () => map_export5,
    loadConfigsForDefaultMode: () => loadConfigsForDefaultMode_export3,
    isSerializableHeaderValue: () => isSerializableHeaderValue_export3,
    getValueFromTextNode: () => getValueFromTextNode_export3,
    getDefaultExtensionConfiguration: () => getDefaultExtensionConfiguration_export3,
    getDefaultExtensionConfiguration: () => getDefaultExtensionConfiguration_export3,
    getArrayIfSingleItem: () => getArrayIfSingleItem_export3,
    extendedEncodeURIComponent: () => MZs.extendedEncodeURIComponent,
    emitWarningIfUnsupportedVersion: () => emitWarningIfUnsupportedVersion_export3,
    decorateServiceException: () => decorateServiceException_export3,
    createAggregatedClient: () => createAggregatedClient_export3,
    convertMap: () => convertMap_export3,
    collectBody: () => lQs.collectBody,
    _json: () => _json_export3,
    ServiceException: () => ServiceException_export3,
    SENSITIVE_STRING: () => "***SensitiveInformation***",
    NoOpLogger: () => NoOpLogger_export3,
    Command: () => Command_export3,
    Client: () => Client_export3
  });
  var GN = __lazy(() => {
    aQs();
    cQs();
    IZs();
    OZs();
    aqr();
    NZs();
    jZs();
    zZs();
    __reExport(bk, __toESM(yW(), 1), module.exports);
  });
  function Qhd(e) {
    return {
      schemeId: "aws.auth#sigv4",
      signingProperties: {
        name: "bedrock",
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
  function Zhd(e) {
    return {
      schemeId: "smithy.api#httpBearerAuth",
      propertiesExtractor: ({
        profile: t,
        filepath: n,
        configFilepath: r,
        ignoreCache: o
      }, s) => ({
        identityProperties: {
          profile: t,
          filepath: n,
          configFilepath: r,
          ignoreCache: o
        }
      })
    };
  }
  var KZs;
  var bot;
  var R1t;
  var YZs = async (e, t, n) => ({
    operation: R1t.getSmithyContext(t).operation,
    region: (await R1t.normalizeProvider(e.region)()) || (() => {
      throw Error("expected `region` to be configured for `aws.auth#sigv4`");
    })()
  });
  var JZs = e => {
    let t = [];
    switch (e.operation) {
      default:
        t.push(Qhd(e));
        t.push(Zhd(e));
    }
    return t;
  };
  var XZs = e => {
    let t = bot.memoizeIdentityProvider(e.token, bot.isIdentityExpired, bot.doesIdentityRequireRefresh);
    let n = KZs.resolveAwsSdkSigV4Config(e);
    return Object.assign(n, {
      authSchemePreference: R1t.normalizeProvider(e.authSchemePreference ?? []),
      token: t
    });
  };
  var pqr = __lazy(() => {
    KZs = __toESM(nw(), 1);
    bot = __toESM(Od(), 1);
    R1t = __toESM(zB(), 1);
  });
  var QZs = e => Object.assign(e, {
    useDualstackEndpoint: e.useDualstackEndpoint ?? false,
    useFipsEndpoint: e.useFipsEndpoint ?? false,
    defaultSigningName: "bedrock"
  });
  var jP;
  var OY = __lazy(() => {
    jP = {
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
  var eei;
  var ZZs = __lazy(() => {
    eei = {
      name: "@aws-sdk/client-bedrock-runtime",
      description: "AWS SDK for JavaScript Bedrock Runtime Client for Node.js, Browser and React Native",
      version: "3.936.0",
      scripts: {
        build: "concurrently 'yarn:build:cjs' 'yarn:build:es' 'yarn:build:types'",
        "build:cjs": "node ../../scripts/compilation/inline client-bedrock-runtime",
        "build:es": "tsc -p tsconfig.es.json",
        "build:include:deps": "lerna run --scope $npm_package_name --include-dependencies build",
        "build:types": "tsc -p tsconfig.types.json",
        "build:types:downlevel": "downlevel-dts dist-types dist-types/ts3.4",
        clean: "rimraf ./dist-* && rimraf *.tsbuildinfo",
        "extract:docs": "api-extractor run --local",
        "generate:client": "node ../../scripts/generate-clients/single-service --solo bedrock-runtime"
      },
      main: "./dist-cjs/index.js",
      types: "./dist-types/index.d.ts",
      module: "./dist-es/index.js",
      sideEffects: false,
      dependencies: {
        "@aws-crypto/sha256-browser": "5.2.0",
        "@aws-crypto/sha256-js": "5.2.0",
        "@aws-sdk/core": "3.936.0",
        "@aws-sdk/credential-provider-node": "3.936.0",
        "@aws-sdk/eventstream-handler-node": "3.936.0",
        "@aws-sdk/middleware-eventstream": "3.936.0",
        "@aws-sdk/middleware-host-header": "3.936.0",
        "@aws-sdk/middleware-logger": "3.936.0",
        "@aws-sdk/middleware-recursion-detection": "3.936.0",
        "@aws-sdk/middleware-user-agent": "3.936.0",
        "@aws-sdk/middleware-websocket": "3.936.0",
        "@aws-sdk/region-config-resolver": "3.936.0",
        "@aws-sdk/token-providers": "3.936.0",
        "@aws-sdk/types": "3.936.0",
        "@aws-sdk/util-endpoints": "3.936.0",
        "@aws-sdk/util-user-agent-browser": "3.936.0",
        "@aws-sdk/util-user-agent-node": "3.936.0",
        "@smithy/config-resolver": "^4.4.3",
        "@smithy/core": "^3.18.5",
        "@smithy/eventstream-serde-browser": "^4.2.5",
        "@smithy/eventstream-serde-config-resolver": "^4.3.5",
        "@smithy/eventstream-serde-node": "^4.2.5",
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
        "@smithy/util-stream": "^4.5.6",
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
      homepage: "https://github.com/aws/aws-sdk-js-v3/tree/main/clients/client-bedrock-runtime",
      repository: {
        type: "git",
        url: "https://github.com/aws/aws-sdk-js-v3.git",
        directory: "clients/client-bedrock-runtime"
      }
    };
  });
  function tgd(e) {
    let t = Buffer.from(e, "hex");
    return new Uint8Array(t.buffer, t.byteOffset, t.byteLength / Uint8Array.BYTES_PER_ELEMENT);
  }
  var tei;
  var mqr;
  var nei = __lazy(() => {
    tei = require("stream");
    mqr = class mqr extends tei.Transform {
      priorSignature;
      messageSigner;
      eventStreamCodec;
      systemClockOffsetProvider;
      constructor(e) {
        super({
          autoDestroy: true,
          readableObjectMode: true,
          writableObjectMode: true,
          ...e
        });
        this.priorSignature = e.priorSignature;
        this.eventStreamCodec = e.eventStreamCodec;
        this.messageSigner = e.messageSigner;
        this.systemClockOffsetProvider = e.systemClockOffsetProvider;
      }
      async _transform(e, t, n) {
        try {
          let r = new Date(Date.now() + (await this.systemClockOffsetProvider()));
          let o = {
            ":date": {
              type: "timestamp",
              value: r
            }
          };
          let s = await this.messageSigner.sign({
            message: {
              body: e,
              headers: o
            },
            priorSignature: this.priorSignature
          }, {
            signingDate: r
          });
          this.priorSignature = s.signature;
          let i = this.eventStreamCodec.HS({
            headers: {
              ...o,
              ":chunk-signature": {
                type: "binary",
                value: tgd(s.signature)
              }
            },
            body: e
          });
          this.push(i);
          return n();
        } catch (r) {
          n(r);
        }
      }
    };
  });
  class fqr {
    messageSigner;
    eventStreamCodec;
    systemClockOffsetProvider;
    constructor(e) {
      this.messageSigner = e.messageSigner;
      this.eventStreamCodec = new w1t(e.utf8Encoder, e.utf8Decoder);
      this.systemClockOffsetProvider = async () => e.systemClockOffset ?? 0;
    }
    async handle(e, t, n = {}) {
      let r = t.request;
      let {
        body: o,
        query: s
      } = r;
      if (!(o instanceof Sot.Readable)) {
        throw Error("Eventstream payload must be a Readable stream.");
      }
      let i = o;
      r.body = new Sot.PassThrough({
        objectMode: true
      });
      let l = r.headers?.authorization?.match(/Signature=([\w]+)$/)?.[1] ?? s?.["X-Amz-Signature"] ?? "";
      let c = new mqr({
        priorSignature: l,
        eventStreamCodec: this.eventStreamCodec,
        messageSigner: await this.messageSigner(),
        systemClockOffsetProvider: this.systemClockOffsetProvider
      });
      Sot.pipeline(i, c, r.body, d => {
        if (d) {
          throw d;
        }
      });
      let u;
      try {
        u = await e(t);
      } catch (d) {
        throw r.body.end(), d;
      }
      return u;
    }
  }
  var Sot;
  var rei = __lazy(() => {
    Zjr();
    nei();
    Sot = require("stream");
  });
  var hqr = e => new fqr(e);
  var oei = __lazy(() => {
    rei();
  });
  var sei = __lazy(() => {
    oei();
  });
  function iei(e) {
    let t = 0;
    let n = 0;
    let r = null;
    let o = null;
    let s = a => {
      if (typeof a !== "number") {
        throw Error("Attempted to allocate an event message where size was not a number: " + a);
      }
      t = a;
      n = 4;
      r = new Uint8Array(a);
      new DataView(r.buffer).setUint32(0, a, false);
    };
    let i = async function* () {
      let a = e[Symbol.asyncIterator]();
      while (true) {
        let {
          value: l,
          done: c
        } = await a.next();
        if (c) {
          if (!t) {
            return;
          } else if (t === n) {
            yield r;
          } else {
            throw Error("Truncated event message received.");
          }
          return;
        }
        let u = l.length;
        let d = 0;
        while (d < u) {
          if (!r) {
            let m = u - d;
            if (!o) {
              o = new Uint8Array(4);
            }
            let f = Math.min(4 - n, m);
            if (o.set(l.slice(d, d + f), n), n += f, d += f, n < 4) {
              break;
            }
            s(new DataView(o.buffer).getUint32(0, false));
            o = null;
          }
          let p = Math.min(t - n, u - d);
          if (r.set(l.slice(d, d + p), n), n += p, d += p, t && t === n) {
            yield r;
            r = null;
            t = 0;
            n = 0;
          }
        }
      }
    };
    return {
      [Symbol.asyncIterator]: i
    };
  }
  function aei(e, t) {
    return async function (n) {
      let {
        value: r
      } = n.headers[":message-type"];
      if (r === "error") {
        let o = Error(n.headers[":error-message"].value || "UnknownError");
        throw o.name = n.headers[":error-code"].value, o;
      } else if (r === "exception") {
        let o = n.headers[":exception-type"].value;
        let s = {
          [o]: n
        };
        let i = await e(s);
        if (i.$unknown) {
          let a = Error(t(n.body));
          throw a.name = o, a;
        }
        throw i[o];
      } else if (r === "event") {
        let o = {
          [n.headers[":event-type"].value]: n
        };
        let s = await e(o);
        if (s.$unknown) {
          return;
        }
        return s;
      } else {
        throw Error(`Unrecognizable event type: ${n.headers[":event-type"].value}`);
      }
    };
  }
  class gqr {
    eventStreamCodec;
    utfEncoder;
    constructor({
      utf8Encoder: e,
      utf8Decoder: t
    }) {
      this.eventStreamCodec = new w1t(e, t);
      this.utfEncoder = e;
    }
    deserialize(e, t) {
      let n = iei(e);
      return new Xjr({
        messageStream: new Yjr({
          inputStream: n,
          decoder: this.eventStreamCodec
        }),
        deserializer: aei(t, this.utfEncoder)
      });
    }
    serialize(e, t) {
      return new Jjr({
        messageStream: new Qjr({
          inputStream: e,
          serializer: t
        }),
        encoder: this.eventStreamCodec,
        includeEndFrame: true
      });
    }
  }
  var lei = __lazy(() => {
    Zjr();
  });
  var cei = () => {};
  var uei = __lazy(() => {
    lei();
    cei();
  });
  async function* dei(e) {
    let t = false;
    let n = false;
    let r = [];
    e.on("error", o => {
      if (!t) {
        t = true;
      }
      if (o) {
        throw o;
      }
    });
    e.on("data", o => {
      r.push(o);
    });
    e.on("end", () => {
      t = true;
    });
    while (!n) {
      let o = await new Promise(s => setTimeout(() => s(r.shift()), 0));
      if (o) {
        yield o;
      }
      n = t && r.length === 0;
    }
  }
  class yqr {
    universalMarshaller;
    constructor({
      utf8Encoder: e,
      utf8Decoder: t
    }) {
      this.universalMarshaller = new gqr({
        utf8Decoder: t,
        utf8Encoder: e
      });
    }
    deserialize(e, t) {
      let n = typeof e[Symbol.asyncIterator] === "function" ? e : dei(e);
      return this.universalMarshaller.deserialize(n, t);
    }
    serialize(e, t) {
      return pei.Readable.from(this.universalMarshaller.serialize(e, t));
    }
  }
  var pei;
  var _qr = __lazy(() => {
    uei();
    pei = require("stream");
  });
  var mei = e => new yqr(e);
  var fei = __lazy(() => {
    _qr();
  });
  var hei = __lazy(() => {
    _qr();
    fei();
  });
  var gei = e => typeof ArrayBuffer === "function" && e instanceof ArrayBuffer || Object.prototype.toString.call(e) === "[object ArrayBuffer]";
  var Rvn;
  var yei = (e, t = 0, n = e.byteLength - t) => {
    if (!gei(e)) {
      throw TypeError(`The "input" argument must be ArrayBuffer. Received type ${typeof e} (${e})`);
    }
    return Rvn.Buffer.from(e, t, n);
  };
  var _ei = (e, t) => {
    if (typeof e !== "string") {
      throw TypeError(`The "input" argument must be of type string. Received type ${typeof e} (${e})`);
    }
    return t ? Rvn.Buffer.from(e, t) : Rvn.Buffer.from(e);
  };
  var bqr = __lazy(() => {
    Rvn = require("buffer");
  });
  var ngd;
  var bei = e => {
    if (e.length * 3 % 4 !== 0) {
      throw TypeError("Incorrect padding on base64 string.");
    }
    if (!ngd.exec(e)) {
      throw TypeError("Invalid base64 string.");
    }
    let t = _ei(e, "base64");
    return new Uint8Array(t.buffer, t.byteOffset, t.byteLength);
  };
  var Sei = __lazy(() => {
    bqr();
    ngd = /^[A-Za-z0-9+/]*={0,2}$/;
  });
  var Tei;
  var Eei = e => {
    let t;
    if (typeof e === "string") {
      t = Tei.fromUtf8(e);
    } else {
      t = e;
    }
    if (typeof t !== "object" || typeof t.byteOffset !== "number" || typeof t.byteLength !== "number") {
      throw Error("@smithy/util-base64: toBase64 encoder function only accepts string | Uint8Array.");
    }
    return yei(t.buffer, t.byteOffset, t.byteLength).toString("base64");
  };
  var vei = __lazy(() => {
    bqr();
    Tei = __toESM(jT(), 1);
  });
  var wei = __lazy(() => {
    Sei();
    vei();
  });
  var Cei;
  var Rei;
  var xei;
  var Dei;
  var Mei;
  var Ble;
  var kei;
  var Aei;
  var Iei;
  var Pei;
  var Oei;
  var rgd;
  var Fei;
  var Tot;
  var ogd;
  var Uei = (e, t = {}) => ogd.get(e, () => Tot.resolveEndpoint(rgd, {
    endpointParams: e,
    logger: t.logger
  }));
  var Bei = __lazy(() => {
    Fei = __toESM(Ale(), 1);
    Tot = __toESM(Lte(), 1);
    ogd = new Tot.EndpointCache({
      size: 50,
      params: ["Endpoint", "Region", "UseDualStack", "UseFIPS"]
    });
    Tot.customEndpointFunctions.aws = Fei.awsEndpointFunctions;
  });
  var $ei;
  var Hei;
  var jei;
  var qei;
  var xvn;
  var Wei = e => ({
    apiVersion: "2023-09-30",
    base64Decoder: e?.base64Decoder ?? bei,
    base64Encoder: e?.base64Encoder ?? Eei,
    disableHostPrefix: e?.disableHostPrefix ?? false,
    endpointProvider: e?.endpointProvider ?? Uei,
    extensions: e?.extensions ?? [],
    httpAuthSchemeProvider: e?.httpAuthSchemeProvider ?? JZs,
    httpAuthSchemes: e?.httpAuthSchemes ?? [{
      schemeId: "aws.auth#sigv4",
      identityProvider: t => t.getIdentityProvider("aws.auth#sigv4"),
      signer: new $ei.AwsSdkSigV4Signer()
    }, {
      schemeId: "smithy.api#httpBearerAuth",
      identityProvider: t => t.getIdentityProvider("smithy.api#httpBearerAuth"),
      signer: new jei.HttpBearerAuthSigner()
    }],
    logger: e?.logger ?? new NoOpLogger_export3(),
    protocol: e?.protocol ?? new Hei.AwsRestJsonProtocol({
      defaultNamespace: "com.amazonaws.bedrockruntime"
    }),
    serviceId: e?.serviceId ?? "Bedrock Runtime",
    urlParser: e?.urlParser ?? qei.parseUrl,
    utf8Decoder: e?.utf8Decoder ?? xvn.fromUtf8,
    utf8Encoder: e?.utf8Encoder ?? xvn.toUtf8
  });
  var Gei = __lazy(() => {
    GN();
    wei();
    pqr();
    Bei();
    $ei = __toESM(nw(), 1);
    Hei = __toESM(r_e(), 1);
    jei = __toESM(Od(), 1);
    qei = __toESM(bY(), 1);
    xvn = __toESM(jT(), 1);
  });
  var Eot;
  var kvn;
  var XAe;
  var Vei;
  var zei;
  var Avn;
  var JAe;
  var Ivn;
  var Kei;
  var Yei;
  var Jei;
  var Xei = e => {
    emitWarningIfUnsupportedVersion_export3(process.version);
    let t = Jei.resolveDefaultsModeConfig(e);
    let n = () => t().then(loadConfigsForDefaultMode_export3);
    let r = Wei(e);
    Eot.emitWarningIfUnsupportedVersion(process.version);
    let o = {
      profile: e?.profile,
      logger: r.logger,
      signingName: "bedrock"
    };
    return {
      ...r,
      ...e,
      runtime: "node",
      defaultsMode: t,
      authSchemePreference: e?.authSchemePreference ?? JAe.loadConfig(Eot.NODE_AUTH_SCHEME_PREFERENCE_OPTIONS, o),
      bodyLengthChecker: e?.bodyLengthChecker ?? Kei.calculateBodyLength,
      credentialDefaultProvider: e?.credentialDefaultProvider ?? defaultProvider,
      defaultUserAgentProvider: e?.defaultUserAgentProvider ?? kvn.createDefaultUserAgentProvider({
        serviceId: r.serviceId,
        clientVersion: eei.version
      }),
      eventStreamPayloadHandlerProvider: e?.eventStreamPayloadHandlerProvider ?? hqr,
      eventStreamSerdeProvider: e?.eventStreamSerdeProvider ?? mei,
      httpAuthSchemes: e?.httpAuthSchemes ?? [{
        schemeId: "aws.auth#sigv4",
        identityProvider: s => s.getIdentityProvider("aws.auth#sigv4"),
        signer: new Eot.AwsSdkSigV4Signer()
      }, {
        schemeId: "smithy.api#httpBearerAuth",
        identityProvider: s => s.getIdentityProvider("smithy.api#httpBearerAuth") || (async i => {
          try {
            return await ubn({
              signingName: "bedrock"
            })();
          } catch (a) {
            return await nSn(i)(i);
          }
        }),
        signer: new Vei.HttpBearerAuthSigner()
      }],
      maxAttempts: e?.maxAttempts ?? JAe.loadConfig(Avn.NODE_MAX_ATTEMPT_CONFIG_OPTIONS, e),
      region: e?.region ?? JAe.loadConfig(XAe.NODE_REGION_CONFIG_OPTIONS, {
        ...XAe.NODE_REGION_CONFIG_FILE_OPTIONS,
        ...o
      }),
      requestHandler: Ivn.NodeHttp2Handler.create(e?.requestHandler ?? (async () => ({
        ...(await n()),
        disableConcurrentStreams: true
      }))),
      retryMode: e?.retryMode ?? JAe.loadConfig({
        ...Avn.NODE_RETRY_MODE_CONFIG_OPTIONS,
        default: async () => (await n()).retryMode || Yei.DEFAULT_RETRY_MODE
      }, e),
      sha256: e?.sha256 ?? zei.Hash.bind(null, "sha256"),
      streamCollector: e?.streamCollector ?? Ivn.streamCollector,
      useDualstackEndpoint: e?.useDualstackEndpoint ?? JAe.loadConfig(XAe.NODE_USE_DUALSTACK_ENDPOINT_CONFIG_OPTIONS, o),
      useFipsEndpoint: e?.useFipsEndpoint ?? JAe.loadConfig(XAe.NODE_USE_FIPS_ENDPOINT_CONFIG_OPTIONS, o),
      userAgentAppId: e?.userAgentAppId ?? JAe.loadConfig(kvn.NODE_APP_ID_CONFIG_OPTIONS, o)
    };
  };
  var Qei = __lazy(() => {
    ZZs();
    Xje();
    sei();
    rSn();
    hei();
    Gei();
    GN();
    GN();
    Eot = __toESM(nw(), 1);
    kvn = __toESM(Zye(), 1);
    XAe = __toESM(HA(), 1);
    Vei = __toESM(Od(), 1);
    zei = __toESM(e_e(), 1);
    Avn = __toESM(yF(), 1);
    JAe = __toESM(VB(), 1);
    Ivn = __toESM(hW(), 1);
    Kei = __toESM(t_e(), 1);
    Yei = __toESM(Ole(), 1);
    Jei = __toESM(s_e(), 1);
  });
  var Zei = e => ({
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
  var eti = e => ({
    httpHandler: e.httpHandler()
  });
  var tti = () => {};
  var nti = () => {};
  var rti = () => {};
  var oti = () => {};
  var sti = __lazy(() => {
    tti();
    nti();
    rti();
    oti();
  });
  var iti = e => {
    let {
      httpAuthSchemes: t,
      httpAuthSchemeProvider: n,
      credentials: r,
      token: o
    } = e;
    return {
      setHttpAuthScheme(s) {
        let i = t.findIndex(a => a.schemeId === s.schemeId);
        if (i === -1) {
          t.push(s);
        } else {
          t.splice(i, 1, s);
        }
      },
      httpAuthSchemes() {
        return t;
      },
      setHttpAuthSchemeProvider(s) {
        n = s;
      },
      httpAuthSchemeProvider() {
        return n;
      },
      setCredentials(s) {
        r = s;
      },
      credentials() {
        return r;
      },
      setToken(s) {
        o = s;
      },
      token() {
        return o;
      }
    };
  };
  var ati = e => ({
    httpAuthSchemes: e.httpAuthSchemes(),
    httpAuthSchemeProvider: e.httpAuthSchemeProvider(),
    credentials: e.credentials(),
    token: e.token()
  });
  var Pvn;
  var lti = (e, t) => {
    let n = Object.assign(Pvn.getAwsRegionExtensionConfiguration(e), getDefaultExtensionConfiguration_export3(e), Zei(e), iti(e));
    t.forEach(r => r.configure(n));
    return Object.assign(e, Pvn.resolveAwsRegionExtensionConfiguration(n), resolveDefaultRuntimeConfig_export3(n), eti(n), ati(n));
  };
  var cti = __lazy(() => {
    sti();
    GN();
    Pvn = __toESM(Xte(), 1);
  });
  var Ovn;
  var uti;
  var dti;
  var Dvn;
  var pti;
  var vot;
  var mti;
  var fti;
  var hti;
  var Mvn;
  var BedrockRuntimeClient;
  var Nvn = __lazy(() => {
    Njr();
    nqr();
    sQs();
    GN();
    pqr();
    OY();
    Qei();
    cti();
    Ovn = __toESM(qye(), 1);
    uti = __toESM(Wye(), 1);
    dti = __toESM(Gye(), 1);
    Dvn = __toESM(Ple(), 1);
    pti = __toESM(HA(), 1);
    vot = __toESM(Od(), 1);
    mti = __toESM(qT(), 1);
    fti = __toESM(Xye(), 1);
    hti = __toESM(_o(), 1);
    Mvn = __toESM(yF(), 1);
    BedrockRuntimeClient = class wot extends Client_export3 {
      config;
      constructor(...[e]) {
        let t = Xei(e || {});
        super(t);
        this.initConfig = t;
        let n = QZs(t);
        let r = Dvn.resolveUserAgentConfig(n);
        let o = Mvn.resolveRetryConfig(r);
        let s = pti.resolveRegionConfig(o);
        let i = Ovn.resolveHostHeaderConfig(s);
        let a = hti.resolveEndpointConfig(i);
        let l = oQs(a);
        let c = XZs(l);
        let u = oXs(c);
        let d = tQs(u);
        let p = lti(d, e?.extensions || []);
        this.config = p;
        this.middlewareStack.use(mti.getSchemaSerdePlugin(this.config));
        this.middlewareStack.use(Dvn.getUserAgentPlugin(this.config));
        this.middlewareStack.use(Mvn.getRetryPlugin(this.config));
        this.middlewareStack.use(fti.getContentLengthPlugin(this.config));
        this.middlewareStack.use(Ovn.getHostHeaderPlugin(this.config));
        this.middlewareStack.use(uti.getLoggerPlugin(this.config));
        this.middlewareStack.use(dti.getRecursionDetectionPlugin(this.config));
        this.middlewareStack.use(vot.getHttpAuthSchemeEndpointRuleSetPlugin(this.config, {
          httpAuthSchemeParametersProvider: YZs,
          identityProviderConfigProvider: async m => new vot.DefaultIdentityProviderConfig({
            "aws.auth#sigv4": m.credentials,
            "smithy.api#httpBearerAuth": m.token
          })
        }));
        this.middlewareStack.use(vot.getHttpSigningPlugin(this.config));
      }
      destroy() {
        super.destroy();
      }
    };
  });
  var BedrockRuntimeServiceException;
  var Lvn = __lazy(() => {
    GN();
    BedrockRuntimeServiceException = class GD extends ServiceException_export3 {
      constructor(e) {
        super(e);
        Object.setPrototypeOf(this, GD.prototype);
      }
    };
  });
  var AccessDeniedException_export;
  var InternalServerException_export;
  var ThrottlingException_export;
  var ValidationException_export;
  var ConflictException_export;
  var ResourceNotFoundException_export;
  var ServiceQuotaExceededException_export;
  var ServiceUnavailableException_export;
  var ModelErrorException;
  var ModelNotReadyException;
  var ModelTimeoutException;
  var ModelStreamErrorException;
  var Sqr = __lazy(() => {
    Lvn();
    AccessDeniedException_export = class x1t extends BedrockRuntimeServiceException {
      name = "AccessDeniedException";
      $fault = "client";
      constructor(e) {
        super({
          name: "AccessDeniedException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, x1t.prototype);
      }
    };
    InternalServerException_export = class aqe extends BedrockRuntimeServiceException {
      name = "InternalServerException";
      $fault = "server";
      constructor(e) {
        super({
          name: "InternalServerException",
          $fault: "server",
          ...e
        });
        Object.setPrototypeOf(this, aqe.prototype);
      }
    };
    ThrottlingException_export = class lqe extends BedrockRuntimeServiceException {
      name = "ThrottlingException";
      $fault = "client";
      constructor(e) {
        super({
          name: "ThrottlingException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, lqe.prototype);
      }
    };
    ValidationException_export = class cqe extends BedrockRuntimeServiceException {
      name = "ValidationException";
      $fault = "client";
      constructor(e) {
        super({
          name: "ValidationException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, cqe.prototype);
      }
    };
    ConflictException_export = class k1t extends BedrockRuntimeServiceException {
      name = "ConflictException";
      $fault = "client";
      constructor(e) {
        super({
          name: "ConflictException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, k1t.prototype);
      }
    };
    ResourceNotFoundException_export = class A1t extends BedrockRuntimeServiceException {
      name = "ResourceNotFoundException";
      $fault = "client";
      constructor(e) {
        super({
          name: "ResourceNotFoundException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, A1t.prototype);
      }
    };
    ServiceQuotaExceededException_export = class I1t extends BedrockRuntimeServiceException {
      name = "ServiceQuotaExceededException";
      $fault = "client";
      constructor(e) {
        super({
          name: "ServiceQuotaExceededException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, I1t.prototype);
      }
    };
    ServiceUnavailableException_export = class P1t extends BedrockRuntimeServiceException {
      name = "ServiceUnavailableException";
      $fault = "server";
      constructor(e) {
        super({
          name: "ServiceUnavailableException",
          $fault: "server",
          ...e
        });
        Object.setPrototypeOf(this, P1t.prototype);
      }
    };
    ModelErrorException = class O1t extends BedrockRuntimeServiceException {
      name = "ModelErrorException";
      $fault = "client";
      originalStatusCode;
      resourceName;
      constructor(e) {
        super({
          name: "ModelErrorException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, O1t.prototype);
        this.originalStatusCode = e.originalStatusCode;
        this.resourceName = e.resourceName;
      }
    };
    ModelNotReadyException = class D1t extends BedrockRuntimeServiceException {
      name = "ModelNotReadyException";
      $fault = "client";
      $retryable = {};
      constructor(e) {
        super({
          name: "ModelNotReadyException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, D1t.prototype);
      }
    };
    ModelTimeoutException = class M1t extends BedrockRuntimeServiceException {
      name = "ModelTimeoutException";
      $fault = "client";
      constructor(e) {
        super({
          name: "ModelTimeoutException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, M1t.prototype);
      }
    };
    ModelStreamErrorException = class uqe extends BedrockRuntimeServiceException {
      name = "ModelStreamErrorException";
      $fault = "client";
      originalStatusCode;
      originalMessage;
      constructor(e) {
        super({
          name: "ModelStreamErrorException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, uqe.prototype);
        this.originalStatusCode = e.originalStatusCode;
        this.originalMessage = e.originalMessage;
      }
    };
  });
  var bW;
  var yti;
  var Uvn;
  var sgd;
  var _ti;
  var igd;
  var Tqr;
  var agd;
  var lgd;
  var cgd;
  var ugd;
  var dgd;
  var pgd;
  var mgd;
  var fgd;
  var hgd;
  var Eqr;
  var ggd;
  var bti;
  var ygd;
  var _gd;
  var bgd;
  var Sgd;
  var Tgd;
  var Egd;
  var vgd;
  var wgd;
  var Cgd;
  var Rgd;
  var xgd;
  var kgd;
  var Agd;
  var Igd;
  var Pgd;
  var Ogd;
  var Dgd;
  var Mgd;
  var Ngd;
  var Sti;
  var Lgd;
  var Fgd;
  var Ugd;
  var Bgd;
  var $gd;
  var Tti;
  var Hgd;
  var jgd;
  var qgd;
  var Bvn;
  var Wgd;
  var Ggd;
  var Vgd;
  var zgd;
  var Fvn;
  var Kgd;
  var Ygd;
  var L1t;
  var Jgd;
  var Xgd;
  var Qgd;
  var Zgd;
  var eyd;
  var tyd;
  var nyd;
  var ryd;
  var oyd;
  var syd;
  var Eti;
  var iyd;
  var ayd;
  var lyd;
  var cyd;
  var uyd;
  var dyd;
  var pyd;
  var myd;
  var fyd;
  var hyd;
  var gyd;
  var yyd;
  var _yd;
  var byd;
  var vti;
  var wti;
  var Syd;
  var Cti;
  var Rti;
  var $vn;
  var Tyd;
  var Eyd;
  var vyd;
  var wyd;
  var Cyd;
  var Ryd;
  var xyd;
  var kyd;
  var Ayd;
  var xti;
  var Iyd;
  var Pyd;
  var Oyd;
  var Dyd;
  var Hvn;
  var vqr;
  var Myd;
  var jvn;
  var kti;
  var Nyd;
  var Lyd;
  var wqr;
  var Ati;
  var Fyd;
  var Uyd;
  var Byd;
  var qvn;
  var Wvn;
  var $yd;
  var Hyd;
  var jyd;
  var qyd;
  var Wyd;
  var Gvn;
  var Iti;
  var Cqr;
  var Gyd;
  var Vyd;
  var zyd;
  var Kyd;
  var Yyd;
  var Jyd;
  var Vvn;
  var Pti;
  var Xyd;
  var Qyd;
  var Zyd;
  var e_d;
  var t_d;
  var n_d;
  var r_d;
  var o_d;
  var s_d;
  var Oti;
  var i_d;
  var a_d;
  var gti;
  var Rqr;
  var N1t;
  var l_d;
  var c_d;
  var u_d;
  var d_d;
  var p_d;
  var m_d;
  var f_d;
  var h_d;
  var g_d;
  var y_d;
  var __d;
  var xqr;
  var b_d;
  var kqr;
  var S_d;
  var T_d;
  var E_d;
  var v_d;
  var w_d;
  var C_d;
  var Dti;
  var Mti;
  var Aqr;
  var R_d;
  var Nti;
  var x_d;
  var k_d;
  var A_d;
  var I_d;
  var P_d;
  var O_d;
  var D_d;
  var M_d;
  var N_d;
  var L_d;
  var F_d;
  var Lti;
  var U_d;
  var B_d;
  var $_d;
  var H_d;
  var j_d;
  var q_d;
  var W_d;
  var G_d;
  var V_d;
  var z_d;
  var K_d;
  var Y_d;
  var J_d;
  var X_d;
  var Q_d;
  var Z_d;
  var Fti;
  var Uti;
  var Bti;
  var $ti;
  var Hti;
  var jti;
  var qti;
  var Wti;
  var Gti;
  var Vti;
  var one = __lazy(() => {
    Lvn();
    Sqr();
    bW = __toESM(qT(), 1);
    yti = [0, "com.amazonaws.bedrockruntime", "AsyncInvokeMessage", 8, 0];
    Uvn = [0, "com.amazonaws.bedrockruntime", "Body", 8, 21];
    sgd = [0, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningStatementLogicContent", 8, 0];
    _ti = [0, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningStatementNaturalLanguageContent", 8, 0];
    igd = [0, "com.amazonaws.bedrockruntime", "ModelInputPayload", 8, 15];
    Tqr = [0, "com.amazonaws.bedrockruntime", "PartBody", 8, 21];
    agd = [-3, "com.amazonaws.bedrockruntime", "AccessDeniedException", {
      error: "client",
      httpError: 403
    }, ["message"], [0]];
    bW.TypeRegistry.for("com.amazonaws.bedrockruntime").registerError(agd, AccessDeniedException_export);
    lgd = [3, "com.amazonaws.bedrockruntime", "AnyToolChoice", 0, [], []];
    cgd = [3, "com.amazonaws.bedrockruntime", "ApplyGuardrailRequest", 0, ["guardrailIdentifier", "guardrailVersion", "source", "content", "outputScope"], [[0, 1], [0, 1], 0, [() => u_d, 0], 0]];
    ugd = [3, "com.amazonaws.bedrockruntime", "ApplyGuardrailResponse", 0, ["usage", "action", "actionReason", "outputs", "assessments", "guardrailCoverage"], [() => wti, 0, 0, () => h_d, [() => Oti, 0], () => Eti]];
    dgd = [3, "com.amazonaws.bedrockruntime", "AsyncInvokeS3OutputDataConfig", 0, ["s3Uri", "kmsKeyId", "bucketOwner"], [0, 0, 0]];
    pgd = [3, "com.amazonaws.bedrockruntime", "AsyncInvokeSummary", 0, ["invocationArn", "modelArn", "clientRequestToken", "status", "failureMessage", "submitTime", "lastModifiedTime", "endTime", "outputDataConfig"], [0, 0, 0, 0, [() => yti, 0], 5, 5, 5, () => Aqr]];
    mgd = [3, "com.amazonaws.bedrockruntime", "AutoToolChoice", 0, [], []];
    fgd = [3, "com.amazonaws.bedrockruntime", "BidirectionalInputPayloadPart", 8, ["bytes"], [[() => Tqr, 0]]];
    hgd = [3, "com.amazonaws.bedrockruntime", "BidirectionalOutputPayloadPart", 8, ["bytes"], [[() => Tqr, 0]]];
    Eqr = [3, "com.amazonaws.bedrockruntime", "CachePointBlock", 0, ["type"], [0]];
    ggd = [3, "com.amazonaws.bedrockruntime", "Citation", 0, ["title", "source", "sourceContent", "location"], [0, 0, () => n_d, () => Nti]];
    bti = [3, "com.amazonaws.bedrockruntime", "CitationsConfig", 0, ["enabled"], [2]];
    ygd = [3, "com.amazonaws.bedrockruntime", "CitationsContentBlock", 0, ["content", "citations"], [() => e_d, () => t_d]];
    _gd = [3, "com.amazonaws.bedrockruntime", "CitationsDelta", 0, ["title", "source", "sourceContent", "location"], [0, 0, () => r_d, () => Nti]];
    bgd = [3, "com.amazonaws.bedrockruntime", "CitationSourceContentDelta", 0, ["text"], [0]];
    Sgd = [-3, "com.amazonaws.bedrockruntime", "ConflictException", {
      error: "client",
      httpError: 400
    }, ["message"], [0]];
    bW.TypeRegistry.for("com.amazonaws.bedrockruntime").registerError(Sgd, ConflictException_export);
    Tgd = [3, "com.amazonaws.bedrockruntime", "ContentBlockDeltaEvent", 0, ["delta", "contentBlockIndex"], [[() => A_d, 0], 1]];
    Egd = [3, "com.amazonaws.bedrockruntime", "ContentBlockStartEvent", 0, ["start", "contentBlockIndex"], [() => I_d, 1]];
    vgd = [3, "com.amazonaws.bedrockruntime", "ContentBlockStopEvent", 0, ["contentBlockIndex"], [1]];
    wgd = [3, "com.amazonaws.bedrockruntime", "ConverseMetrics", 0, ["latencyMs"], [1]];
    Cgd = [3, "com.amazonaws.bedrockruntime", "ConverseRequest", 0, ["modelId", "messages", "system", "inferenceConfig", "toolConfig", "guardrailConfig", "additionalModelRequestFields", "promptVariables", "additionalModelResponseFieldPaths", "requestMetadata", "performanceConfig", "serviceTier"], [[0, 1], [() => xqr, 0], [() => kqr, 0], () => Rti, () => Cqr, () => Zgd, 15, [() => Dti, 0], 64, [() => Mti, 0], () => jvn, () => qvn]];
    Rgd = [3, "com.amazonaws.bedrockruntime", "ConverseResponse", 0, ["output", "stopReason", "usage", "metrics", "additionalModelResponseFields", "trace", "performanceConfig", "serviceTier"], [[() => P_d, 0], 0, () => Iti, () => wgd, 15, [() => Dgd, 0], () => jvn, () => qvn]];
    xgd = [3, "com.amazonaws.bedrockruntime", "ConverseStreamMetadataEvent", 0, ["usage", "metrics", "trace", "performanceConfig", "serviceTier"], [() => Iti, () => kgd, [() => Pgd, 0], () => jvn, () => qvn]];
    kgd = [3, "com.amazonaws.bedrockruntime", "ConverseStreamMetrics", 0, ["latencyMs"], [1]];
    Agd = [3, "com.amazonaws.bedrockruntime", "ConverseStreamRequest", 0, ["modelId", "messages", "system", "inferenceConfig", "toolConfig", "guardrailConfig", "additionalModelRequestFields", "promptVariables", "additionalModelResponseFieldPaths", "requestMetadata", "performanceConfig", "serviceTier"], [[0, 1], [() => xqr, 0], [() => kqr, 0], () => Rti, () => Cqr, () => hyd, 15, [() => Dti, 0], 64, [() => Mti, 0], () => jvn, () => qvn]];
    Igd = [3, "com.amazonaws.bedrockruntime", "ConverseStreamResponse", 0, ["stream"], [[() => O_d, 16]]];
    Pgd = [3, "com.amazonaws.bedrockruntime", "ConverseStreamTrace", 0, ["guardrail", "promptRouter"], [[() => vti, 0], () => kti]];
    Ogd = [3, "com.amazonaws.bedrockruntime", "ConverseTokensRequest", 0, ["messages", "system", "toolConfig", "additionalModelRequestFields"], [[() => xqr, 0], [() => kqr, 0], () => Cqr, 15]];
    Dgd = [3, "com.amazonaws.bedrockruntime", "ConverseTrace", 0, ["guardrail", "promptRouter"], [[() => vti, 0], () => kti]];
    Mgd = [3, "com.amazonaws.bedrockruntime", "CountTokensRequest", 0, ["modelId", "input"], [[0, 1], [() => D_d, 0]]];
    Ngd = [3, "com.amazonaws.bedrockruntime", "CountTokensResponse", 0, ["inputTokens"], [1]];
    Sti = [3, "com.amazonaws.bedrockruntime", "DocumentBlock", 0, ["format", "name", "source", "context", "citations"], [0, 0, () => N_d, 0, () => bti]];
    Lgd = [3, "com.amazonaws.bedrockruntime", "DocumentCharLocation", 0, ["documentIndex", "start", "end"], [1, 1, 1]];
    Fgd = [3, "com.amazonaws.bedrockruntime", "DocumentChunkLocation", 0, ["documentIndex", "start", "end"], [1, 1, 1]];
    Ugd = [3, "com.amazonaws.bedrockruntime", "DocumentPageLocation", 0, ["documentIndex", "start", "end"], [1, 1, 1]];
    Bgd = [3, "com.amazonaws.bedrockruntime", "GetAsyncInvokeRequest", 0, ["invocationArn"], [[0, 1]]];
    $gd = [3, "com.amazonaws.bedrockruntime", "GetAsyncInvokeResponse", 0, ["invocationArn", "modelArn", "clientRequestToken", "status", "failureMessage", "submitTime", "lastModifiedTime", "endTime", "outputDataConfig"], [0, 0, 0, 0, [() => yti, 0], 5, 5, 5, () => Aqr]];
    Tti = [3, "com.amazonaws.bedrockruntime", "GuardrailAssessment", 0, ["topicPolicy", "contentPolicy", "wordPolicy", "sensitiveInformationPolicy", "contextualGroundingPolicy", "automatedReasoningPolicy", "invocationMetrics"], [() => byd, () => tyd, () => Syd, () => fyd, () => ryd, [() => Ggd, 0], () => cyd]];
    Hgd = [3, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningImpossibleFinding", 0, ["translation", "contradictingRules", "logicWarning"], [[() => L1t, 0], () => Rqr, [() => Bvn, 0]]];
    jgd = [3, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningInputTextReference", 0, ["text"], [[() => _ti, 0]]];
    qgd = [3, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningInvalidFinding", 0, ["translation", "contradictingRules", "logicWarning"], [[() => L1t, 0], () => Rqr, [() => Bvn, 0]]];
    Bvn = [3, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningLogicWarning", 0, ["type", "premises", "claims"], [0, [() => N1t, 0], [() => N1t, 0]]];
    Wgd = [3, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningNoTranslationsFinding", 0, [], []];
    Ggd = [3, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningPolicyAssessment", 0, ["findings"], [[() => a_d, 0]]];
    Vgd = [3, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningRule", 0, ["identifier", "policyVersionArn"], [0, 0]];
    zgd = [3, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningSatisfiableFinding", 0, ["translation", "claimsTrueScenario", "claimsFalseScenario", "logicWarning"], [[() => L1t, 0], [() => Fvn, 0], [() => Fvn, 0], [() => Bvn, 0]]];
    Fvn = [3, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningScenario", 0, ["statements"], [[() => N1t, 0]]];
    Kgd = [3, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningStatement", 0, ["logic", "naturalLanguage"], [[() => sgd, 0], [() => _ti, 0]]];
    Ygd = [3, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningTooComplexFinding", 0, [], []];
    L1t = [3, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningTranslation", 0, ["premises", "claims", "untranslatedPremises", "untranslatedClaims", "confidence"], [[() => N1t, 0], [() => N1t, 0], [() => gti, 0], [() => gti, 0], 1]];
    Jgd = [3, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningTranslationAmbiguousFinding", 0, ["options", "differenceScenarios"], [[() => c_d, 0], [() => i_d, 0]]];
    Xgd = [3, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningTranslationOption", 0, ["translations"], [[() => l_d, 0]]];
    Qgd = [3, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningValidFinding", 0, ["translation", "claimsTrueScenario", "supportingRules", "logicWarning"], [[() => L1t, 0], [() => Fvn, 0], () => Rqr, [() => Bvn, 0]]];
    Zgd = [3, "com.amazonaws.bedrockruntime", "GuardrailConfiguration", 0, ["guardrailIdentifier", "guardrailVersion", "trace"], [0, 0, 0]];
    eyd = [3, "com.amazonaws.bedrockruntime", "GuardrailContentFilter", 0, ["type", "confidence", "filterStrength", "action", "detected"], [0, 0, 0, 0, 2]];
    tyd = [3, "com.amazonaws.bedrockruntime", "GuardrailContentPolicyAssessment", 0, ["filters"], [() => d_d]];
    nyd = [3, "com.amazonaws.bedrockruntime", "GuardrailContextualGroundingFilter", 0, ["type", "threshold", "score", "action", "detected"], [0, 1, 1, 0, 2]];
    ryd = [3, "com.amazonaws.bedrockruntime", "GuardrailContextualGroundingPolicyAssessment", 0, ["filters"], [() => p_d]];
    oyd = [3, "com.amazonaws.bedrockruntime", "GuardrailConverseImageBlock", 8, ["format", "source"], [0, [() => U_d, 0]]];
    syd = [3, "com.amazonaws.bedrockruntime", "GuardrailConverseTextBlock", 0, ["text", "qualifiers"], [0, 64]];
    Eti = [3, "com.amazonaws.bedrockruntime", "GuardrailCoverage", 0, ["textCharacters", "images"], [() => yyd, () => lyd]];
    iyd = [3, "com.amazonaws.bedrockruntime", "GuardrailCustomWord", 0, ["match", "action", "detected"], [0, 0, 2]];
    ayd = [3, "com.amazonaws.bedrockruntime", "GuardrailImageBlock", 8, ["format", "source"], [0, [() => B_d, 0]]];
    lyd = [3, "com.amazonaws.bedrockruntime", "GuardrailImageCoverage", 0, ["guarded", "total"], [1, 1]];
    cyd = [3, "com.amazonaws.bedrockruntime", "GuardrailInvocationMetrics", 0, ["guardrailProcessingLatency", "usage", "guardrailCoverage"], [1, () => wti, () => Eti]];
    uyd = [3, "com.amazonaws.bedrockruntime", "GuardrailManagedWord", 0, ["match", "type", "action", "detected"], [0, 0, 0, 2]];
    dyd = [3, "com.amazonaws.bedrockruntime", "GuardrailOutputContent", 0, ["text"], [0]];
    pyd = [3, "com.amazonaws.bedrockruntime", "GuardrailPiiEntityFilter", 0, ["match", "type", "action", "detected"], [0, 0, 0, 2]];
    myd = [3, "com.amazonaws.bedrockruntime", "GuardrailRegexFilter", 0, ["name", "match", "regex", "action", "detected"], [0, 0, 0, 0, 2]];
    fyd = [3, "com.amazonaws.bedrockruntime", "GuardrailSensitiveInformationPolicyAssessment", 0, ["piiEntities", "regexes"], [() => g_d, () => y_d]];
    hyd = [3, "com.amazonaws.bedrockruntime", "GuardrailStreamConfiguration", 0, ["guardrailIdentifier", "guardrailVersion", "trace", "streamProcessingMode"], [0, 0, 0, 0]];
    gyd = [3, "com.amazonaws.bedrockruntime", "GuardrailTextBlock", 0, ["text", "qualifiers"], [0, 64]];
    yyd = [3, "com.amazonaws.bedrockruntime", "GuardrailTextCharactersCoverage", 0, ["guarded", "total"], [1, 1]];
    _yd = [3, "com.amazonaws.bedrockruntime", "GuardrailTopic", 0, ["name", "type", "action", "detected"], [0, 0, 0, 2]];
    byd = [3, "com.amazonaws.bedrockruntime", "GuardrailTopicPolicyAssessment", 0, ["topics"], [() => __d]];
    vti = [3, "com.amazonaws.bedrockruntime", "GuardrailTraceAssessment", 0, ["modelOutput", "inputAssessment", "outputAssessments", "actionReason"], [64, [() => C_d, 0], [() => w_d, 0], 0]];
    wti = [3, "com.amazonaws.bedrockruntime", "GuardrailUsage", 0, ["topicPolicyUnits", "contentPolicyUnits", "wordPolicyUnits", "sensitiveInformationPolicyUnits", "sensitiveInformationPolicyFreeUnits", "contextualGroundingPolicyUnits", "contentPolicyImageUnits", "automatedReasoningPolicyUnits", "automatedReasoningPolicies"], [1, 1, 1, 1, 1, 1, 1, 1, 1]];
    Syd = [3, "com.amazonaws.bedrockruntime", "GuardrailWordPolicyAssessment", 0, ["customWords", "managedWordLists"], [() => m_d, () => f_d]];
    Cti = [3, "com.amazonaws.bedrockruntime", "ImageBlock", 0, ["format", "source"], [0, () => $_d]];
    Rti = [3, "com.amazonaws.bedrockruntime", "InferenceConfiguration", 0, ["maxTokens", "temperature", "topP", "stopSequences"], [1, 1, 1, 64]];
    $vn = [-3, "com.amazonaws.bedrockruntime", "InternalServerException", {
      error: "server",
      httpError: 500
    }, ["message"], [0]];
    bW.TypeRegistry.for("com.amazonaws.bedrockruntime").registerError($vn, InternalServerException_export);
    Tyd = [3, "com.amazonaws.bedrockruntime", "InvokeModelRequest", 0, ["body", "contentType", "accept", "modelId", "trace", "guardrailIdentifier", "guardrailVersion", "performanceConfigLatency", "serviceTier"], [[() => Uvn, 16], [0, {
      httpHeader: "Content-Type"
    }], [0, {
      httpHeader: "Accept"
    }], [0, 1], [0, {
      httpHeader: "X-Amzn-Bedrock-Trace"
    }], [0, {
      httpHeader: "X-Amzn-Bedrock-GuardrailIdentifier"
    }], [0, {
      httpHeader: "X-Amzn-Bedrock-GuardrailVersion"
    }], [0, {
      httpHeader: "X-Amzn-Bedrock-PerformanceConfig-Latency"
    }], [0, {
      httpHeader: "X-Amzn-Bedrock-Service-Tier"
    }]]];
    Eyd = [3, "com.amazonaws.bedrockruntime", "InvokeModelResponse", 0, ["body", "contentType", "performanceConfigLatency", "serviceTier"], [[() => Uvn, 16], [0, {
      httpHeader: "Content-Type"
    }], [0, {
      httpHeader: "X-Amzn-Bedrock-PerformanceConfig-Latency"
    }], [0, {
      httpHeader: "X-Amzn-Bedrock-Service-Tier"
    }]]];
    vyd = [3, "com.amazonaws.bedrockruntime", "InvokeModelTokensRequest", 0, ["body"], [[() => Uvn, 0]]];
    wyd = [3, "com.amazonaws.bedrockruntime", "InvokeModelWithBidirectionalStreamRequest", 0, ["modelId", "body"], [[0, 1], [() => H_d, 16]]];
    Cyd = [3, "com.amazonaws.bedrockruntime", "InvokeModelWithBidirectionalStreamResponse", 0, ["body"], [[() => j_d, 16]]];
    Ryd = [3, "com.amazonaws.bedrockruntime", "InvokeModelWithResponseStreamRequest", 0, ["body", "contentType", "accept", "modelId", "trace", "guardrailIdentifier", "guardrailVersion", "performanceConfigLatency", "serviceTier"], [[() => Uvn, 16], [0, {
      httpHeader: "Content-Type"
    }], [0, {
      httpHeader: "X-Amzn-Bedrock-Accept"
    }], [0, 1], [0, {
      httpHeader: "X-Amzn-Bedrock-Trace"
    }], [0, {
      httpHeader: "X-Amzn-Bedrock-GuardrailIdentifier"
    }], [0, {
      httpHeader: "X-Amzn-Bedrock-GuardrailVersion"
    }], [0, {
      httpHeader: "X-Amzn-Bedrock-PerformanceConfig-Latency"
    }], [0, {
      httpHeader: "X-Amzn-Bedrock-Service-Tier"
    }]]];
    xyd = [3, "com.amazonaws.bedrockruntime", "InvokeModelWithResponseStreamResponse", 0, ["body", "contentType", "performanceConfigLatency", "serviceTier"], [[() => V_d, 16], [0, {
      httpHeader: "X-Amzn-Bedrock-Content-Type"
    }], [0, {
      httpHeader: "X-Amzn-Bedrock-PerformanceConfig-Latency"
    }], [0, {
      httpHeader: "X-Amzn-Bedrock-Service-Tier"
    }]]];
    kyd = [3, "com.amazonaws.bedrockruntime", "ListAsyncInvokesRequest", 0, ["submitTimeAfter", "submitTimeBefore", "statusEquals", "maxResults", "nextToken", "sortBy", "sortOrder"], [[5, {
      httpQuery: "submitTimeAfter"
    }], [5, {
      httpQuery: "submitTimeBefore"
    }], [0, {
      httpQuery: "statusEquals"
    }], [1, {
      httpQuery: "maxResults"
    }], [0, {
      httpQuery: "nextToken"
    }], [0, {
      httpQuery: "sortBy"
    }], [0, {
      httpQuery: "sortOrder"
    }]]];
    Ayd = [3, "com.amazonaws.bedrockruntime", "ListAsyncInvokesResponse", 0, ["nextToken", "asyncInvokeSummaries"], [0, [() => Zyd, 0]]];
    xti = [3, "com.amazonaws.bedrockruntime", "Message", 0, ["role", "content"], [0, [() => o_d, 0]]];
    Iyd = [3, "com.amazonaws.bedrockruntime", "MessageStartEvent", 0, ["role"], [0]];
    Pyd = [3, "com.amazonaws.bedrockruntime", "MessageStopEvent", 0, ["stopReason", "additionalModelResponseFields"], [0, 15]];
    Oyd = [-3, "com.amazonaws.bedrockruntime", "ModelErrorException", {
      error: "client",
      httpError: 424
    }, ["message", "originalStatusCode", "resourceName"], [0, 1, 0]];
    bW.TypeRegistry.for("com.amazonaws.bedrockruntime").registerError(Oyd, ModelErrorException);
    Dyd = [-3, "com.amazonaws.bedrockruntime", "ModelNotReadyException", {
      error: "client",
      httpError: 429
    }, ["message"], [0]];
    bW.TypeRegistry.for("com.amazonaws.bedrockruntime").registerError(Dyd, ModelNotReadyException);
    Hvn = [-3, "com.amazonaws.bedrockruntime", "ModelStreamErrorException", {
      error: "client",
      httpError: 424
    }, ["message", "originalStatusCode", "originalMessage"], [0, 1, 0]];
    bW.TypeRegistry.for("com.amazonaws.bedrockruntime").registerError(Hvn, ModelStreamErrorException);
    vqr = [-3, "com.amazonaws.bedrockruntime", "ModelTimeoutException", {
      error: "client",
      httpError: 408
    }, ["message"], [0]];
    bW.TypeRegistry.for("com.amazonaws.bedrockruntime").registerError(vqr, ModelTimeoutException);
    Myd = [3, "com.amazonaws.bedrockruntime", "PayloadPart", 8, ["bytes"], [[() => Tqr, 0]]];
    jvn = [3, "com.amazonaws.bedrockruntime", "PerformanceConfiguration", 0, ["latency"], [0]];
    kti = [3, "com.amazonaws.bedrockruntime", "PromptRouterTrace", 0, ["invokedModelId"], [0]];
    Nyd = [3, "com.amazonaws.bedrockruntime", "ReasoningTextBlock", 8, ["text", "signature"], [0, 0]];
    Lyd = [-3, "com.amazonaws.bedrockruntime", "ResourceNotFoundException", {
      error: "client",
      httpError: 404
    }, ["message"], [0]];
    bW.TypeRegistry.for("com.amazonaws.bedrockruntime").registerError(Lyd, ResourceNotFoundException_export);
    wqr = [3, "com.amazonaws.bedrockruntime", "S3Location", 0, ["uri", "bucketOwner"], [0, 0]];
    Ati = [3, "com.amazonaws.bedrockruntime", "SearchResultBlock", 0, ["source", "title", "content", "citations"], [0, 0, () => b_d, () => bti]];
    Fyd = [3, "com.amazonaws.bedrockruntime", "SearchResultContentBlock", 0, ["text"], [0]];
    Uyd = [3, "com.amazonaws.bedrockruntime", "SearchResultLocation", 0, ["searchResultIndex", "start", "end"], [1, 1, 1]];
    Byd = [-3, "com.amazonaws.bedrockruntime", "ServiceQuotaExceededException", {
      error: "client",
      httpError: 400
    }, ["message"], [0]];
    bW.TypeRegistry.for("com.amazonaws.bedrockruntime").registerError(Byd, ServiceQuotaExceededException_export);
    qvn = [3, "com.amazonaws.bedrockruntime", "ServiceTier", 0, ["type"], [0]];
    Wvn = [-3, "com.amazonaws.bedrockruntime", "ServiceUnavailableException", {
      error: "server",
      httpError: 503
    }, ["message"], [0]];
    bW.TypeRegistry.for("com.amazonaws.bedrockruntime").registerError(Wvn, ServiceUnavailableException_export);
    $yd = [3, "com.amazonaws.bedrockruntime", "SpecificToolChoice", 0, ["name"], [0]];
    Hyd = [3, "com.amazonaws.bedrockruntime", "StartAsyncInvokeRequest", 0, ["clientRequestToken", "modelId", "modelInput", "outputDataConfig", "tags"], [[0, 4], 0, [() => igd, 0], () => Aqr, () => S_d]];
    jyd = [3, "com.amazonaws.bedrockruntime", "StartAsyncInvokeResponse", 0, ["invocationArn"], [0]];
    qyd = [3, "com.amazonaws.bedrockruntime", "SystemTool", 0, ["name"], [0]];
    Wyd = [3, "com.amazonaws.bedrockruntime", "Tag", 0, ["key", "value"], [0, 0]];
    Gvn = [-3, "com.amazonaws.bedrockruntime", "ThrottlingException", {
      error: "client",
      httpError: 429
    }, ["message"], [0]];
    bW.TypeRegistry.for("com.amazonaws.bedrockruntime").registerError(Gvn, ThrottlingException_export);
    Iti = [3, "com.amazonaws.bedrockruntime", "TokenUsage", 0, ["inputTokens", "outputTokens", "totalTokens", "cacheReadInputTokens", "cacheWriteInputTokens"], [1, 1, 1, 1, 1]];
    Cqr = [3, "com.amazonaws.bedrockruntime", "ToolConfiguration", 0, ["tools", "toolChoice"], [() => v_d, () => Y_d]];
    Gyd = [3, "com.amazonaws.bedrockruntime", "ToolResultBlock", 0, ["toolUseId", "content", "status", "type"], [0, () => E_d, 0, 0]];
    Vyd = [3, "com.amazonaws.bedrockruntime", "ToolResultBlockStart", 0, ["toolUseId", "type", "status"], [0, 0, 0]];
    zyd = [3, "com.amazonaws.bedrockruntime", "ToolSpecification", 0, ["name", "description", "inputSchema"], [0, 0, () => J_d]];
    Kyd = [3, "com.amazonaws.bedrockruntime", "ToolUseBlock", 0, ["toolUseId", "name", "input", "type"], [0, 0, 15, 0]];
    Yyd = [3, "com.amazonaws.bedrockruntime", "ToolUseBlockDelta", 0, ["input"], [0]];
    Jyd = [3, "com.amazonaws.bedrockruntime", "ToolUseBlockStart", 0, ["toolUseId", "name", "type"], [0, 0, 0]];
    Vvn = [-3, "com.amazonaws.bedrockruntime", "ValidationException", {
      error: "client",
      httpError: 400
    }, ["message"], [0]];
    bW.TypeRegistry.for("com.amazonaws.bedrockruntime").registerError(Vvn, ValidationException_export);
    Pti = [3, "com.amazonaws.bedrockruntime", "VideoBlock", 0, ["format", "source"], [0, () => Z_d]];
    Xyd = [3, "com.amazonaws.bedrockruntime", "WebLocation", 0, ["url", "domain"], [0, 0]];
    Qyd = [-3, "smithy.ts.sdk.synthetic.com.amazonaws.bedrockruntime", "BedrockRuntimeServiceException", 0, [], []];
    bW.TypeRegistry.for("smithy.ts.sdk.synthetic.com.amazonaws.bedrockruntime").registerError(Qyd, BedrockRuntimeServiceException);
    Zyd = [1, "com.amazonaws.bedrockruntime", "AsyncInvokeSummaries", 0, [() => pgd, 0]];
    e_d = [1, "com.amazonaws.bedrockruntime", "CitationGeneratedContentList", 0, () => R_d];
    t_d = [1, "com.amazonaws.bedrockruntime", "Citations", 0, () => ggd];
    n_d = [1, "com.amazonaws.bedrockruntime", "CitationSourceContentList", 0, () => x_d];
    r_d = [1, "com.amazonaws.bedrockruntime", "CitationSourceContentListDelta", 0, () => bgd];
    o_d = [1, "com.amazonaws.bedrockruntime", "ContentBlocks", 0, [() => k_d, 0]];
    s_d = [1, "com.amazonaws.bedrockruntime", "DocumentContentBlocks", 0, () => M_d];
    Oti = [1, "com.amazonaws.bedrockruntime", "GuardrailAssessmentList", 0, [() => Tti, 0]];
    i_d = [1, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningDifferenceScenarioList", 0, [() => Fvn, 0]];
    a_d = [1, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningFindingList", 0, [() => L_d, 0]];
    gti = [1, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningInputTextReferenceList", 0, [() => jgd, 0]];
    Rqr = [1, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningRuleList", 0, () => Vgd];
    N1t = [1, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningStatementList", 0, [() => Kgd, 0]];
    l_d = [1, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningTranslationList", 0, [() => L1t, 0]];
    c_d = [1, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningTranslationOptionList", 0, [() => Xgd, 0]];
    u_d = [1, "com.amazonaws.bedrockruntime", "GuardrailContentBlockList", 0, [() => F_d, 0]];
    d_d = [1, "com.amazonaws.bedrockruntime", "GuardrailContentFilterList", 0, () => eyd];
    p_d = [1, "com.amazonaws.bedrockruntime", "GuardrailContextualGroundingFilters", 0, () => nyd];
    m_d = [1, "com.amazonaws.bedrockruntime", "GuardrailCustomWordList", 0, () => iyd];
    f_d = [1, "com.amazonaws.bedrockruntime", "GuardrailManagedWordList", 0, () => uyd];
    h_d = [1, "com.amazonaws.bedrockruntime", "GuardrailOutputContentList", 0, () => dyd];
    g_d = [1, "com.amazonaws.bedrockruntime", "GuardrailPiiEntityFilterList", 0, () => pyd];
    y_d = [1, "com.amazonaws.bedrockruntime", "GuardrailRegexFilterList", 0, () => myd];
    __d = [1, "com.amazonaws.bedrockruntime", "GuardrailTopicList", 0, () => _yd];
    xqr = [1, "com.amazonaws.bedrockruntime", "Messages", 0, [() => xti, 0]];
    b_d = [1, "com.amazonaws.bedrockruntime", "SearchResultContentBlocks", 0, () => Fyd];
    kqr = [1, "com.amazonaws.bedrockruntime", "SystemContentBlocks", 0, [() => z_d, 0]];
    S_d = [1, "com.amazonaws.bedrockruntime", "TagList", 0, () => Wyd];
    T_d = [1, "com.amazonaws.bedrockruntime", "ToolResultBlocksDelta", 0, () => X_d];
    E_d = [1, "com.amazonaws.bedrockruntime", "ToolResultContentBlocks", 0, () => Q_d];
    v_d = [1, "com.amazonaws.bedrockruntime", "Tools", 0, () => K_d];
    w_d = [2, "com.amazonaws.bedrockruntime", "GuardrailAssessmentListMap", 0, [0, 0], [() => Oti, 0]];
    C_d = [2, "com.amazonaws.bedrockruntime", "GuardrailAssessmentMap", 0, [0, 0], [() => Tti, 0]];
    Dti = [2, "com.amazonaws.bedrockruntime", "PromptVariableMap", 8, 0, () => q_d];
    Mti = [2, "com.amazonaws.bedrockruntime", "RequestMetadata", 8, 0, 0];
    Aqr = [3, "com.amazonaws.bedrockruntime", "AsyncInvokeOutputDataConfig", 0, ["s3OutputDataConfig"], [() => dgd]];
    R_d = [3, "com.amazonaws.bedrockruntime", "CitationGeneratedContent", 0, ["text"], [0]];
    Nti = [3, "com.amazonaws.bedrockruntime", "CitationLocation", 0, ["web", "documentChar", "documentPage", "documentChunk", "searchResultLocation"], [() => Xyd, () => Lgd, () => Ugd, () => Fgd, () => Uyd]];
    x_d = [3, "com.amazonaws.bedrockruntime", "CitationSourceContent", 0, ["text"], [0]];
    k_d = [3, "com.amazonaws.bedrockruntime", "ContentBlock", 0, ["text", "image", "document", "video", "toolUse", "toolResult", "guardContent", "cachePoint", "reasoningContent", "citationsContent", "searchResult"], [0, () => Cti, () => Sti, () => Pti, () => Kyd, () => Gyd, [() => Lti, 0], () => Eqr, [() => W_d, 0], () => ygd, () => Ati]];
    A_d = [3, "com.amazonaws.bedrockruntime", "ContentBlockDelta", 0, ["text", "toolUse", "toolResult", "reasoningContent", "citation"], [0, () => Yyd, () => T_d, [() => G_d, 0], () => _gd]];
    I_d = [3, "com.amazonaws.bedrockruntime", "ContentBlockStart", 0, ["toolUse", "toolResult"], [() => Jyd, () => Vyd]];
    P_d = [3, "com.amazonaws.bedrockruntime", "ConverseOutput", 0, ["message"], [[() => xti, 0]]];
    O_d = [3, "com.amazonaws.bedrockruntime", "ConverseStreamOutput", {
      streaming: 1
    }, ["messageStart", "contentBlockStart", "contentBlockDelta", "contentBlockStop", "messageStop", "metadata", "internalServerException", "modelStreamErrorException", "validationException", "throttlingException", "serviceUnavailableException"], [() => Iyd, () => Egd, [() => Tgd, 0], () => vgd, () => Pyd, [() => xgd, 0], [() => $vn, 0], [() => Hvn, 0], [() => Vvn, 0], [() => Gvn, 0], [() => Wvn, 0]]];
    D_d = [3, "com.amazonaws.bedrockruntime", "CountTokensInput", 0, ["invokeModel", "converse"], [[() => vyd, 0], [() => Ogd, 0]]];
    M_d = [3, "com.amazonaws.bedrockruntime", "DocumentContentBlock", 0, ["text"], [0]];
    N_d = [3, "com.amazonaws.bedrockruntime", "DocumentSource", 0, ["bytes", "s3Location", "text", "content"], [21, () => wqr, 0, () => s_d]];
    L_d = [3, "com.amazonaws.bedrockruntime", "GuardrailAutomatedReasoningFinding", 0, ["valid", "invalid", "satisfiable", "impossible", "translationAmbiguous", "tooComplex", "noTranslations"], [[() => Qgd, 0], [() => qgd, 0], [() => zgd, 0], [() => Hgd, 0], [() => Jgd, 0], () => Ygd, () => Wgd]];
    F_d = [3, "com.amazonaws.bedrockruntime", "GuardrailContentBlock", 0, ["text", "image"], [() => gyd, [() => ayd, 0]]];
    Lti = [3, "com.amazonaws.bedrockruntime", "GuardrailConverseContentBlock", 0, ["text", "image"], [() => syd, [() => oyd, 0]]];
    U_d = [3, "com.amazonaws.bedrockruntime", "GuardrailConverseImageSource", 8, ["bytes"], [21]];
    B_d = [3, "com.amazonaws.bedrockruntime", "GuardrailImageSource", 8, ["bytes"], [21]];
    $_d = [3, "com.amazonaws.bedrockruntime", "ImageSource", 0, ["bytes", "s3Location"], [21, () => wqr]];
    H_d = [3, "com.amazonaws.bedrockruntime", "InvokeModelWithBidirectionalStreamInput", {
      streaming: 1
    }, ["chunk"], [[() => fgd, 0]]];
    j_d = [3, "com.amazonaws.bedrockruntime", "InvokeModelWithBidirectionalStreamOutput", {
      streaming: 1
    }, ["chunk", "internalServerException", "modelStreamErrorException", "validationException", "throttlingException", "modelTimeoutException", "serviceUnavailableException"], [[() => hgd, 0], [() => $vn, 0], [() => Hvn, 0], [() => Vvn, 0], [() => Gvn, 0], [() => vqr, 0], [() => Wvn, 0]]];
    q_d = [3, "com.amazonaws.bedrockruntime", "PromptVariableValues", 0, ["text"], [0]];
    W_d = [3, "com.amazonaws.bedrockruntime", "ReasoningContentBlock", 8, ["reasoningText", "redactedContent"], [[() => Nyd, 0], 21]];
    G_d = [3, "com.amazonaws.bedrockruntime", "ReasoningContentBlockDelta", 8, ["text", "redactedContent", "signature"], [0, 21, 0]];
    V_d = [3, "com.amazonaws.bedrockruntime", "ResponseStream", {
      streaming: 1
    }, ["chunk", "internalServerException", "modelStreamErrorException", "validationException", "throttlingException", "modelTimeoutException", "serviceUnavailableException"], [[() => Myd, 0], [() => $vn, 0], [() => Hvn, 0], [() => Vvn, 0], [() => Gvn, 0], [() => vqr, 0], [() => Wvn, 0]]];
    z_d = [3, "com.amazonaws.bedrockruntime", "SystemContentBlock", 0, ["text", "guardContent", "cachePoint"], [0, [() => Lti, 0], () => Eqr]];
    K_d = [3, "com.amazonaws.bedrockruntime", "Tool", 0, ["toolSpec", "systemTool", "cachePoint"], [() => zyd, () => qyd, () => Eqr]];
    Y_d = [3, "com.amazonaws.bedrockruntime", "ToolChoice", 0, ["auto", "any", "tool"], [() => mgd, () => lgd, () => $yd]];
    J_d = [3, "com.amazonaws.bedrockruntime", "ToolInputSchema", 0, ["json"], [15]];
    X_d = [3, "com.amazonaws.bedrockruntime", "ToolResultBlockDelta", 0, ["text"], [0]];
    Q_d = [3, "com.amazonaws.bedrockruntime", "ToolResultContentBlock", 0, ["json", "text", "image", "document", "video", "searchResult"], [15, 0, () => Cti, () => Sti, () => Pti, () => Ati]];
    Z_d = [3, "com.amazonaws.bedrockruntime", "VideoSource", 0, ["bytes", "s3Location"], [21, () => wqr]];
    Fti = [9, "com.amazonaws.bedrockruntime", "ApplyGuardrail", {
      http: ["POST", "/guardrail/{guardrailIdentifier}/version/{guardrailVersion}/apply", 200]
    }, () => cgd, () => ugd];
    Uti = [9, "com.amazonaws.bedrockruntime", "Converse", {
      http: ["POST", "/model/{modelId}/converse", 200]
    }, () => Cgd, () => Rgd];
    Bti = [9, "com.amazonaws.bedrockruntime", "ConverseStream", {
      http: ["POST", "/model/{modelId}/converse-stream", 200]
    }, () => Agd, () => Igd];
    $ti = [9, "com.amazonaws.bedrockruntime", "CountTokens", {
      http: ["POST", "/model/{modelId}/count-tokens", 200]
    }, () => Mgd, () => Ngd];
    Hti = [9, "com.amazonaws.bedrockruntime", "GetAsyncInvoke", {
      http: ["GET", "/async-invoke/{invocationArn}", 200]
    }, () => Bgd, () => $gd];
    jti = [9, "com.amazonaws.bedrockruntime", "InvokeModel", {
      http: ["POST", "/model/{modelId}/invoke", 200]
    }, () => Tyd, () => Eyd];
    qti = [9, "com.amazonaws.bedrockruntime", "InvokeModelWithBidirectionalStream", {
      http: ["POST", "/model/{modelId}/invoke-with-bidirectional-stream", 200]
    }, () => wyd, () => Cyd];
    Wti = [9, "com.amazonaws.bedrockruntime", "InvokeModelWithResponseStream", {
      http: ["POST", "/model/{modelId}/invoke-with-response-stream", 200]
    }, () => Ryd, () => xyd];
    Gti = [9, "com.amazonaws.bedrockruntime", "ListAsyncInvokes", {
      http: ["GET", "/async-invoke", 200]
    }, () => kyd, () => Ayd];
    Vti = [9, "com.amazonaws.bedrockruntime", "StartAsyncInvoke", {
      http: ["POST", "/async-invoke", 200]
    }, () => Hyd, () => jyd];
  });
  var zti;
  var ApplyGuardrailCommand;
  var Iqr = __lazy(() => {
    GN();
    OY();
    one();
    zti = __toESM(_o(), 1);
    ApplyGuardrailCommand = class zvn extends Command_export3.classBuilder().ep(jP).m(function (e, t, n, r) {
      return [zti.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockFrontendService", "ApplyGuardrail", {}).n("BedrockRuntimeClient", "ApplyGuardrailCommand").sc(Fti).build() {};
  });
  var Kti;
  var ConverseCommand;
  var Pqr = __lazy(() => {
    GN();
    OY();
    one();
    Kti = __toESM(_o(), 1);
    ConverseCommand = class Kvn extends Command_export3.classBuilder().ep(jP).m(function (e, t, n, r) {
      return [Kti.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockFrontendService", "Converse", {}).n("BedrockRuntimeClient", "ConverseCommand").sc(Uti).build() {};
  });
  var Yti;
  var ConverseStreamCommand;
  var Oqr = __lazy(() => {
    GN();
    OY();
    one();
    Yti = __toESM(_o(), 1);
    ConverseStreamCommand = class Yvn extends Command_export3.classBuilder().ep(jP).m(function (e, t, n, r) {
      return [Yti.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockFrontendService", "ConverseStream", {
      eventStream: {
        output: true
      }
    }).n("BedrockRuntimeClient", "ConverseStreamCommand").sc(Bti).build() {};
  });
  var Jti;
  var CountTokensCommand;
  var Dqr = __lazy(() => {
    GN();
    OY();
    one();
    Jti = __toESM(_o(), 1);
    CountTokensCommand = class Jvn extends Command_export3.classBuilder().ep(jP).m(function (e, t, n, r) {
      return [Jti.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockFrontendService", "CountTokens", {}).n("BedrockRuntimeClient", "CountTokensCommand").sc($ti).build() {};
  });
  var Xti;
  var GetAsyncInvokeCommand;
  var Mqr = __lazy(() => {
    GN();
    OY();
    one();
    Xti = __toESM(_o(), 1);
    GetAsyncInvokeCommand = class Xvn extends Command_export3.classBuilder().ep(jP).m(function (e, t, n, r) {
      return [Xti.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockFrontendService", "GetAsyncInvoke", {}).n("BedrockRuntimeClient", "GetAsyncInvokeCommand").sc(Hti).build() {};
  });
  var Qti;
  var InvokeModelCommand;
  var Nqr = __lazy(() => {
    GN();
    OY();
    one();
    Qti = __toESM(_o(), 1);
    InvokeModelCommand = class Qvn extends Command_export3.classBuilder().ep(jP).m(function (e, t, n, r) {
      return [Qti.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockFrontendService", "InvokeModel", {}).n("BedrockRuntimeClient", "InvokeModelCommand").sc(jti).build() {};
  });
  var Zti;
  var InvokeModelWithBidirectionalStreamCommand;
  var Lqr = __lazy(() => {
    Njr();
    nqr();
    GN();
    OY();
    one();
    Zti = __toESM(_o(), 1);
    InvokeModelWithBidirectionalStreamCommand = class Zvn extends Command_export3.classBuilder().ep(jP).m(function (e, t, n, r) {
      return [Zti.getEndpointPlugin(n, e.getEndpointParameterInstructions()), mXs(n), XXs(n, {
        headerPrefix: "x-amz-bedrock-"
      })];
    }).s("AmazonBedrockFrontendService", "InvokeModelWithBidirectionalStream", {
      eventStream: {
        input: true,
        output: true
      }
    }).n("BedrockRuntimeClient", "InvokeModelWithBidirectionalStreamCommand").sc(qti).build() {};
  });
  var eni;
  var InvokeModelWithResponseStreamCommand;
  var Fqr = __lazy(() => {
    GN();
    OY();
    one();
    eni = __toESM(_o(), 1);
    InvokeModelWithResponseStreamCommand = class ewn extends Command_export3.classBuilder().ep(jP).m(function (e, t, n, r) {
      return [eni.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockFrontendService", "InvokeModelWithResponseStream", {
      eventStream: {
        output: true
      }
    }).n("BedrockRuntimeClient", "InvokeModelWithResponseStreamCommand").sc(Wti).build() {};
  });
  var tni;
  var ListAsyncInvokesCommand;
  var twn = __lazy(() => {
    GN();
    OY();
    one();
    tni = __toESM(_o(), 1);
    ListAsyncInvokesCommand = class Cot extends Command_export3.classBuilder().ep(jP).m(function (e, t, n, r) {
      return [tni.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockFrontendService", "ListAsyncInvokes", {}).n("BedrockRuntimeClient", "ListAsyncInvokesCommand").sc(Gti).build() {};
  });
  var nni;
  var StartAsyncInvokeCommand;
  var Uqr = __lazy(() => {
    GN();
    OY();
    one();
    nni = __toESM(_o(), 1);
    StartAsyncInvokeCommand = class nwn extends Command_export3.classBuilder().ep(jP).m(function (e, t, n, r) {
      return [nni.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AmazonBedrockFrontendService", "StartAsyncInvoke", {}).n("BedrockRuntimeClient", "StartAsyncInvokeCommand").sc(Vti).build() {};
  });
  var ebd;
  var BedrockRuntime;
  var rni = __lazy(() => {
    GN();
    Nvn();
    Iqr();
    Pqr();
    Oqr();
    Dqr();
    Mqr();
    Nqr();
    Lqr();
    Fqr();
    twn();
    Uqr();
    ebd = {
      ApplyGuardrailCommand: ApplyGuardrailCommand,
      ConverseCommand: ConverseCommand,
      ConverseStreamCommand: ConverseStreamCommand,
      CountTokensCommand: CountTokensCommand,
      GetAsyncInvokeCommand: GetAsyncInvokeCommand,
      InvokeModelCommand: InvokeModelCommand,
      InvokeModelWithBidirectionalStreamCommand: InvokeModelWithBidirectionalStreamCommand,
      InvokeModelWithResponseStreamCommand: InvokeModelWithResponseStreamCommand,
      ListAsyncInvokesCommand: ListAsyncInvokesCommand,
      StartAsyncInvokeCommand: StartAsyncInvokeCommand
    };
    BedrockRuntime = class Bqr extends BedrockRuntimeClient {};
    createAggregatedClient_export3(ebd, BedrockRuntime);
  });
  var oni = __lazy(() => {
    Iqr();
    Pqr();
    Oqr();
    Dqr();
    Mqr();
    Nqr();
    Lqr();
    Fqr();
    twn();
    Uqr();
  });
  var sni = () => {};
  var ini;
  var paginateListAsyncInvokes;
  var ani = __lazy(() => {
    Nvn();
    twn();
    ini = __toESM(Od(), 1);
    paginateListAsyncInvokes = ini.createPaginator(BedrockRuntimeClient, ListAsyncInvokesCommand, "nextToken", "nextToken", "maxResults");
  });
  var lni = __lazy(() => {
    sni();
    ani();
  });
  var AsyncInvokeStatus;
  var SortAsyncInvocationBy;
  var SortOrder_export;
  var GuardrailImageFormat;
  var GuardrailContentQualifier;
  var GuardrailOutputScope;
  var GuardrailContentSource;
  var GuardrailAction;
  var GuardrailAutomatedReasoningLogicWarningType;
  var GuardrailContentPolicyAction;
  var GuardrailContentFilterConfidence;
  var GuardrailContentFilterStrength;
  var GuardrailContentFilterType_export;
  var GuardrailContextualGroundingPolicyAction;
  var GuardrailContextualGroundingFilterType_export;
  var GuardrailSensitiveInformationPolicyAction;
  var GuardrailPiiEntityType_export;
  var GuardrailTopicPolicyAction;
  var GuardrailTopicType_export;
  var GuardrailWordPolicyAction;
  var GuardrailManagedWordType;
  var GuardrailTrace;
  var CachePointType;
  var DocumentFormat;
  var GuardrailConverseImageFormat;
  var GuardrailConverseContentQualifier;
  var ImageFormat;
  var VideoFormat;
  var ToolResultStatus;
  var ToolUseType;
  var ConversationRole;
  var PerformanceConfigLatency_export;
  var ServiceTierType;
  var StopReason;
  var GuardrailStreamProcessingMode;
  var Trace;
  var cni = __lazy(() => {
    AsyncInvokeStatus = {
      COMPLETED: "Completed",
      FAILED: "Failed",
      IN_PROGRESS: "InProgress"
    };
    SortAsyncInvocationBy = {
      SUBMISSION_TIME: "SubmissionTime"
    };
    SortOrder_export = {
      ASCENDING: "Ascending",
      DESCENDING: "Descending"
    };
    GuardrailImageFormat = {
      JPEG: "jpeg",
      PNG: "png"
    };
    GuardrailContentQualifier = {
      GROUNDING_SOURCE: "grounding_source",
      GUARD_CONTENT: "guard_content",
      QUERY: "query"
    };
    GuardrailOutputScope = {
      FULL: "FULL",
      INTERVENTIONS: "INTERVENTIONS"
    };
    GuardrailContentSource = {
      INPUT: "INPUT",
      OUTPUT: "OUTPUT"
    };
    GuardrailAction = {
      GUARDRAIL_INTERVENED: "GUARDRAIL_INTERVENED",
      NONE: "NONE"
    };
    GuardrailAutomatedReasoningLogicWarningType = {
      ALWAYS_FALSE: "ALWAYS_FALSE",
      ALWAYS_TRUE: "ALWAYS_TRUE"
    };
    GuardrailContentPolicyAction = {
      BLOCKED: "BLOCKED",
      NONE: "NONE"
    };
    GuardrailContentFilterConfidence = {
      HIGH: "HIGH",
      LOW: "LOW",
      MEDIUM: "MEDIUM",
      NONE: "NONE"
    };
    GuardrailContentFilterStrength = {
      HIGH: "HIGH",
      LOW: "LOW",
      MEDIUM: "MEDIUM",
      NONE: "NONE"
    };
    GuardrailContentFilterType_export = {
      HATE: "HATE",
      INSULTS: "INSULTS",
      MISCONDUCT: "MISCONDUCT",
      PROMPT_ATTACK: "PROMPT_ATTACK",
      SEXUAL: "SEXUAL",
      VIOLENCE: "VIOLENCE"
    };
    GuardrailContextualGroundingPolicyAction = {
      BLOCKED: "BLOCKED",
      NONE: "NONE"
    };
    GuardrailContextualGroundingFilterType_export = {
      GROUNDING: "GROUNDING",
      RELEVANCE: "RELEVANCE"
    };
    GuardrailSensitiveInformationPolicyAction = {
      ANONYMIZED: "ANONYMIZED",
      BLOCKED: "BLOCKED",
      NONE: "NONE"
    };
    GuardrailPiiEntityType_export = {
      ADDRESS: "ADDRESS",
      AGE: "AGE",
      AWS_ACCESS_KEY: "AWS_ACCESS_KEY",
      AWS_SECRET_KEY: "AWS_SECRET_KEY",
      CA_HEALTH_NUMBER: "CA_HEALTH_NUMBER",
      CA_SOCIAL_INSURANCE_NUMBER: "CA_SOCIAL_INSURANCE_NUMBER",
      CREDIT_DEBIT_CARD_CVV: "CREDIT_DEBIT_CARD_CVV",
      CREDIT_DEBIT_CARD_EXPIRY: "CREDIT_DEBIT_CARD_EXPIRY",
      CREDIT_DEBIT_CARD_NUMBER: "CREDIT_DEBIT_CARD_NUMBER",
      DRIVER_ID: "DRIVER_ID",
      EMAIL: "EMAIL",
      INTERNATIONAL_BANK_ACCOUNT_NUMBER: "INTERNATIONAL_BANK_ACCOUNT_NUMBER",
      IP_ADDRESS: "IP_ADDRESS",
      LICENSE_PLATE: "LICENSE_PLATE",
      MAC_ADDRESS: "MAC_ADDRESS",
      NAME: "NAME",
      PASSWORD: "PASSWORD",
      PHONE: "PHONE",
      PIN: "PIN",
      SWIFT_CODE: "SWIFT_CODE",
      UK_NATIONAL_HEALTH_SERVICE_NUMBER: "UK_NATIONAL_HEALTH_SERVICE_NUMBER",
      UK_NATIONAL_INSURANCE_NUMBER: "UK_NATIONAL_INSURANCE_NUMBER",
      UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER: "UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER",
      URL: "URL",
      USERNAME: "USERNAME",
      US_BANK_ACCOUNT_NUMBER: "US_BANK_ACCOUNT_NUMBER",
      US_BANK_ROUTING_NUMBER: "US_BANK_ROUTING_NUMBER",
      US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER: "US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER",
      US_PASSPORT_NUMBER: "US_PASSPORT_NUMBER",
      US_SOCIAL_SECURITY_NUMBER: "US_SOCIAL_SECURITY_NUMBER",
      VEHICLE_IDENTIFICATION_NUMBER: "VEHICLE_IDENTIFICATION_NUMBER"
    };
    GuardrailTopicPolicyAction = {
      BLOCKED: "BLOCKED",
      NONE: "NONE"
    };
    GuardrailTopicType_export = {
      DENY: "DENY"
    };
    GuardrailWordPolicyAction = {
      BLOCKED: "BLOCKED",
      NONE: "NONE"
    };
    GuardrailManagedWordType = {
      PROFANITY: "PROFANITY"
    };
    GuardrailTrace = {
      DISABLED: "disabled",
      ENABLED: "enabled",
      ENABLED_FULL: "enabled_full"
    };
    CachePointType = {
      DEFAULT: "default"
    };
    DocumentFormat = {
      CSV: "csv",
      DOC: "doc",
      DOCX: "docx",
      HTML: "html",
      MD: "md",
      PDF: "pdf",
      TXT: "txt",
      XLS: "xls",
      XLSX: "xlsx"
    };
    GuardrailConverseImageFormat = {
      JPEG: "jpeg",
      PNG: "png"
    };
    GuardrailConverseContentQualifier = {
      GROUNDING_SOURCE: "grounding_source",
      GUARD_CONTENT: "guard_content",
      QUERY: "query"
    };
    ImageFormat = {
      GIF: "gif",
      JPEG: "jpeg",
      PNG: "png",
      WEBP: "webp"
    };
    VideoFormat = {
      FLV: "flv",
      MKV: "mkv",
      MOV: "mov",
      MP4: "mp4",
      MPEG: "mpeg",
      MPG: "mpg",
      THREE_GP: "three_gp",
      WEBM: "webm",
      WMV: "wmv"
    };
    ToolResultStatus = {
      ERROR: "error",
      SUCCESS: "success"
    };
    ToolUseType = {
      SERVER_TOOL_USE: "server_tool_use"
    };
    ConversationRole = {
      ASSISTANT: "assistant",
      USER: "user"
    };
    PerformanceConfigLatency_export = {
      OPTIMIZED: "optimized",
      STANDARD: "standard"
    };
    ServiceTierType = {
      DEFAULT: "default",
      FLEX: "flex",
      PRIORITY: "priority"
    };
    StopReason = {
      CONTENT_FILTERED: "content_filtered",
      END_TURN: "end_turn",
      GUARDRAIL_INTERVENED: "guardrail_intervened",
      MAX_TOKENS: "max_tokens",
      MODEL_CONTEXT_WINDOW_EXCEEDED: "model_context_window_exceeded",
      STOP_SEQUENCE: "stop_sequence",
      TOOL_USE: "tool_use"
    };
    GuardrailStreamProcessingMode = {
      ASYNC: "async",
      SYNC: "sync"
    };
    Trace = {
      DISABLED: "DISABLED",
      ENABLED: "ENABLED",
      ENABLED_FULL: "ENABLED_FULL"
    };
  });
  var $qr = {};
  __export($qr, {
    paginateListAsyncInvokes: () => paginateListAsyncInvokes,
    __Client: () => Client_export3,
    VideoFormat: () => VideoFormat,
    ValidationException: () => ValidationException_export,
    Trace: () => Trace,
    ToolUseType: () => ToolUseType,
    ToolResultStatus: () => ToolResultStatus,
    ThrottlingException: () => ThrottlingException_export,
    StopReason: () => StopReason,
    StartAsyncInvokeCommand: () => StartAsyncInvokeCommand,
    SortOrder: () => SortOrder_export,
    SortAsyncInvocationBy: () => SortAsyncInvocationBy,
    ServiceUnavailableException: () => ServiceUnavailableException_export,
    ServiceTierType: () => ServiceTierType,
    ServiceQuotaExceededException: () => ServiceQuotaExceededException_export,
    ResourceNotFoundException: () => ResourceNotFoundException_export,
    PerformanceConfigLatency: () => PerformanceConfigLatency_export,
    ModelTimeoutException: () => ModelTimeoutException,
    ModelStreamErrorException: () => ModelStreamErrorException,
    ModelNotReadyException: () => ModelNotReadyException,
    ModelErrorException: () => ModelErrorException,
    ListAsyncInvokesCommand: () => ListAsyncInvokesCommand,
    InvokeModelWithResponseStreamCommand: () => InvokeModelWithResponseStreamCommand,
    InvokeModelWithBidirectionalStreamCommand: () => InvokeModelWithBidirectionalStreamCommand,
    InvokeModelCommand: () => InvokeModelCommand,
    InternalServerException: () => InternalServerException_export,
    ImageFormat: () => ImageFormat,
    GuardrailWordPolicyAction: () => GuardrailWordPolicyAction,
    GuardrailTrace: () => GuardrailTrace,
    GuardrailTopicType: () => GuardrailTopicType_export,
    GuardrailTopicPolicyAction: () => GuardrailTopicPolicyAction,
    GuardrailStreamProcessingMode: () => GuardrailStreamProcessingMode,
    GuardrailSensitiveInformationPolicyAction: () => GuardrailSensitiveInformationPolicyAction,
    GuardrailPiiEntityType: () => GuardrailPiiEntityType_export,
    GuardrailOutputScope: () => GuardrailOutputScope,
    GuardrailManagedWordType: () => GuardrailManagedWordType,
    GuardrailImageFormat: () => GuardrailImageFormat,
    GuardrailConverseImageFormat: () => GuardrailConverseImageFormat,
    GuardrailConverseContentQualifier: () => GuardrailConverseContentQualifier,
    GuardrailContextualGroundingPolicyAction: () => GuardrailContextualGroundingPolicyAction,
    GuardrailContextualGroundingFilterType: () => GuardrailContextualGroundingFilterType_export,
    GuardrailContentSource: () => GuardrailContentSource,
    GuardrailContentQualifier: () => GuardrailContentQualifier,
    GuardrailContentPolicyAction: () => GuardrailContentPolicyAction,
    GuardrailContentFilterType: () => GuardrailContentFilterType_export,
    GuardrailContentFilterStrength: () => GuardrailContentFilterStrength,
    GuardrailContentFilterConfidence: () => GuardrailContentFilterConfidence,
    GuardrailAutomatedReasoningLogicWarningType: () => GuardrailAutomatedReasoningLogicWarningType,
    GuardrailAction: () => GuardrailAction,
    GetAsyncInvokeCommand: () => GetAsyncInvokeCommand,
    DocumentFormat: () => DocumentFormat,
    CountTokensCommand: () => CountTokensCommand,
    ConverseStreamCommand: () => ConverseStreamCommand,
    ConverseCommand: () => ConverseCommand,
    ConversationRole: () => ConversationRole,
    ConflictException: () => ConflictException_export,
    CachePointType: () => CachePointType,
    BedrockRuntimeServiceException: () => BedrockRuntimeServiceException,
    BedrockRuntimeClient: () => BedrockRuntimeClient,
    BedrockRuntime: () => BedrockRuntime,
    AsyncInvokeStatus: () => AsyncInvokeStatus,
    ApplyGuardrailCommand: () => ApplyGuardrailCommand,
    AccessDeniedException: () => AccessDeniedException_export,
    $Command: () => Command_export3
  });
  var rwn = __lazy(() => {
    Lvn();
    Nvn();
    rni();
    oni();
    lni();
    cni();
    Sqr();
  });
  function pqe(e, t, n) {
    if (n) {
      let r = e.find(o => o.startsWith(`${n}.`) && o.includes(t));
      if (r) {
        return r;
      }
    }
    return e.find(r => r.includes(t)) ?? null;
  }
  async function dni() {
    let {
      BedrockClient: e
    } = await Promise.resolve().then(() => (v1t(), E1t));
    let t = await Ej();
    let n = st(process.env.CLAUDE_CODE_SKIP_BEDROCK_AUTH);
    let r = {
      region: t,
      ...(process.env.ANTHROPIC_BEDROCK_BASE_URL && {
        endpoint: process.env.ANTHROPIC_BEDROCK_BASE_URL
      }),
      ...(await getAWSClientProxyConfig({
        url: process.env.ANTHROPIC_BEDROCK_BASE_URL || `https://bedrock.${t}.amazonaws.com`
      })),
      ...(n && {
        requestHandler: new (await Promise.resolve().then(() => __toESM(hW(), 1))).NodeHttpHandler(),
        httpAuthSchemes: [{
          schemeId: "smithy.api#noAuth",
          identityProvider: () => async () => ({}),
          signer: new (await Promise.resolve().then(() => __toESM(Od(), 1))).NoAuthSigner()
        }],
        httpAuthSchemeProvider: () => [{
          schemeId: "smithy.api#noAuth"
        }]
      })
    };
    if (!n && !process.env.AWS_BEARER_TOKEN_BEDROCK) {
      let o = await refreshAndGetAwsCredentials();
      if (o) {
        r.credentials = {
          accessKeyId: o.accessKeyId,
          secretAccessKey: o.secretAccessKey,
          sessionToken: o.sessionToken
        };
      }
    }
    return new e(r);
  }
  async function pni() {
    let {
      BedrockRuntimeClient: e
    } = await Promise.resolve().then(() => (rwn(), $qr));
    let t = await Ej();
    let n = st(process.env.CLAUDE_CODE_SKIP_BEDROCK_AUTH);
    let r = {
      region: t,
      ...(process.env.ANTHROPIC_BEDROCK_BASE_URL && {
        endpoint: process.env.ANTHROPIC_BEDROCK_BASE_URL
      }),
      ...(await getAWSClientProxyConfig({
        url: process.env.ANTHROPIC_BEDROCK_BASE_URL || `https://bedrock-runtime.${t}.amazonaws.com`
      })),
      ...(n && {
        requestHandler: new (await Promise.resolve().then(() => __toESM(hW(), 1))).NodeHttpHandler(),
        httpAuthSchemes: [{
          schemeId: "smithy.api#noAuth",
          identityProvider: () => async () => ({}),
          signer: new (await Promise.resolve().then(() => __toESM(Od(), 1))).NoAuthSigner()
        }],
        httpAuthSchemeProvider: () => [{
          schemeId: "smithy.api#noAuth"
        }]
      })
    };
    if (!n && !process.env.AWS_BEARER_TOKEN_BEDROCK) {
      let o = await refreshAndGetAwsCredentials();
      if (o) {
        r.credentials = {
          accessKeyId: o.accessKeyId,
          secretAccessKey: o.secretAccessKey,
          sessionToken: o.sessionToken
        };
      }
    }
    return new e(r);
  }
  function Hqr(e) {
    return e.startsWith("anthropic.");
  }
  function Ubd(e) {
    if (!e.startsWith("arn:")) {
      return e;
    }
    let t = e.lastIndexOf("/");
    if (t === -1) {
      return e;
    }
    return e.substring(t + 1);
  }
  function own(e) {
    let t = Ubd(e);
    for (let n of Vrt) {
      if (t.startsWith(`${n}.anthropic.`)) {
        return n;
      }
    }
    return;
  }
  function ZAe(e, t) {
    let n = own(e);
    if (n) {
      return e.replace(`${n}.`, `${t}.`);
    }
    if (Hqr(e)) {
      return `${t}.${e}`;
    }
    return e;
  }
  function $le(e) {
    let t = e ?? "";
    if (t.startsWith("us-gov-")) {
      return "us-gov";
    }
    if (t.startsWith("us-")) {
      return "us";
    }
    if (t.startsWith("eu-")) {
      return "eu";
    }
    if (t.startsWith("ap-")) {
      return "apac";
    }
    return "global";
  }
  var uni = e => e.replace(/\[(1|2)m\]/gi, "");
  var dqe;
  var QAe;
  var Hle = __lazy(() => {
    at();
    no();
    JHe();
    je();
    gn();
    Fh();
    sTn();
    sTn();
    dqe = TEr(async function () {
      let [e, {
        ListInferenceProfilesCommand: t
      }] = await Promise.all([dni(), Promise.resolve().then(() => (v1t(), E1t))]);
      let n = [];
      let r;
      try {
        do {
          let o = new t({
            ...(r && {
              nextToken: r
            }),
            typeEquals: "SYSTEM_DEFINED"
          });
          let s = await e.send(o, {
            abortSignal: AbortSignal.timeout(8000)
          });
          if (s.inferenceProfileSummaries) {
            n.push(...s.inferenceProfileSummaries);
          }
          r = s.nextToken;
        } while (r);
        return n.filter(o => o.inferenceProfileId?.includes("anthropic")).map(o => o.inferenceProfileId).filter(Boolean);
      } catch (o) {
        throw logForDebugging(`Bedrock ListInferenceProfiles failed: ${o instanceof Error ? o.message : String(o)}`, {
          level: "error"
        }), o;
      }
    });
    QAe = TEr(async function (e) {
      let t = uni(e);
      let n = null;
      try {
        let [r, {
          GetInferenceProfileCommand: o
        }] = await Promise.all([dni(), Promise.resolve().then(() => (v1t(), E1t))]);
        let i = (await r.send(new o({
          inferenceProfileIdentifier: t
        }), {
          abortSignal: AbortSignal.timeout(8000)
        })).models?.[0]?.modelArn;
        if (i) {
          let a = i.lastIndexOf("/");
          n = a >= 0 ? i.substring(a + 1) : i;
        }
      } catch (r) {
        logForDebugging(`Failed to resolve Bedrock inference profile backing model for ${t}: ${r instanceof Error ? r.message : String(r)}`, {
          level: "error"
        });
      }
      setInferenceProfileBackingModel(t, n);
      return n;
    }, uni);
  });
  var fni;
  var mni = __lazy(() => {
    fni = {
      "//": "Hand-maintained baked-in model catalog \u2014 the source of truth for per-model provider IDs and metadata. On model launch add one entry to `models` below; `bun run generate:model-catalog` validates this file against the schema and formats it.",
      schema_version: 1,
      models: [{
        id: "claude-3-5-haiku",
        family: "haiku",
        display_name: "Haiku 3.5",
        provider_ids: {
          first_party: "claude-3-5-haiku-20241022",
          bedrock: "us.anthropic.claude-3-5-haiku-20241022-v1:0",
          vertex: "claude-3-5-haiku@20241022",
          foundry: "claude-3-5-haiku",
          anthropic_aws: "claude-3-5-haiku-20241022",
          mantle: null,
          gateway: "claude-3-5-haiku-20241022"
        },
        eager_input_streaming: {
          vertex: true
        },
        capabilities: []
      }, {
        id: "claude-haiku-4-5",
        family: "haiku",
        display_name: "Haiku 4.5",
        knowledge_cutoff: "February 2025",
        provider_ids: {
          first_party: "claude-haiku-4-5-20251001",
          bedrock: "us.anthropic.claude-haiku-4-5-20251001-v1:0",
          vertex: "claude-haiku-4-5@20251001",
          foundry: "claude-haiku-4-5",
          anthropic_aws: "claude-haiku-4-5-20251001",
          mantle: "anthropic.claude-haiku-4-5",
          gateway: "claude-haiku-4-5-20251001"
        },
        context: {
          window: 200000,
          supports_1m_suffix: true
        },
        capabilities: ["context_management"]
      }, {
        id: "claude-3-5-sonnet",
        family: "sonnet",
        display_name: "Sonnet 3.5",
        provider_ids: {
          first_party: "claude-3-5-sonnet-20241022",
          bedrock: "us.anthropic.claude-3-5-sonnet-20241022-v2:0",
          vertex: "claude-3-5-sonnet-v2@20241022",
          foundry: "claude-3-5-sonnet",
          anthropic_aws: "claude-3-5-sonnet-20241022",
          mantle: null,
          gateway: "claude-3-5-sonnet-20241022"
        },
        capabilities: []
      }, {
        id: "claude-3-7-sonnet",
        family: "sonnet",
        display_name: "Sonnet 3.7",
        provider_ids: {
          first_party: "claude-3-7-sonnet-20250219",
          bedrock: "us.anthropic.claude-3-7-sonnet-20250219-v1:0",
          vertex: "claude-3-7-sonnet@20250219",
          foundry: "claude-3-7-sonnet",
          anthropic_aws: "claude-3-7-sonnet-20250219",
          mantle: null,
          gateway: "claude-3-7-sonnet-20250219"
        },
        capabilities: []
      }, {
        id: "claude-sonnet-4-0",
        family: "sonnet",
        display_name: "Sonnet 4",
        knowledge_cutoff: "January 2025",
        provider_ids: {
          first_party: "claude-sonnet-4-20250514",
          bedrock: "us.anthropic.claude-sonnet-4-20250514-v1:0",
          vertex: "claude-sonnet-4@20250514",
          foundry: "claude-sonnet-4",
          anthropic_aws: "claude-sonnet-4-20250514",
          mantle: null,
          gateway: "claude-sonnet-4-20250514"
        },
        eager_input_streaming: {
          vertex: true
        },
        context: {
          window: 200000,
          supports_1m_beta: true,
          supports_1m_suffix: true
        },
        capabilities: ["context_management"]
      }, {
        id: "claude-sonnet-4-5",
        family: "sonnet",
        display_name: "Sonnet 4.5",
        knowledge_cutoff: "January 2025",
        provider_ids: {
          first_party: "claude-sonnet-4-5-20250929",
          bedrock: "us.anthropic.claude-sonnet-4-5-20250929-v1:0",
          vertex: "claude-sonnet-4-5@20250929",
          foundry: "claude-sonnet-4-5",
          anthropic_aws: "claude-sonnet-4-5-20250929",
          mantle: null,
          gateway: "claude-sonnet-4-5-20250929"
        },
        eager_input_streaming: {
          vertex: true
        },
        context: {
          window: 200000,
          supports_1m_beta: true,
          supports_1m_suffix: true
        },
        capabilities: ["context_management"]
      }, {
        id: "claude-sonnet-4-6",
        family: "sonnet",
        display_name: "Sonnet 4.6",
        knowledge_cutoff: "August 2025",
        provider_ids: {
          first_party: "claude-sonnet-4-6",
          bedrock: "us.anthropic.claude-sonnet-4-6",
          vertex: "claude-sonnet-4-6",
          foundry: "claude-sonnet-4-6",
          anthropic_aws: "claude-sonnet-4-6",
          mantle: null,
          gateway: "claude-sonnet-4-6"
        },
        eager_input_streaming: {
          bedrock: true,
          vertex: true
        },
        context: {
          window: 200000,
          supports_1m_beta: true,
          supports_1m_suffix: true
        },
        capabilities: ["effort", "max_effort", "adaptive_thinking", "context_management"]
      }, {
        id: "claude-sonnet-5",
        family: "sonnet",
        display_name: "Sonnet 5",
        knowledge_cutoff: "January 2026",
        provider_ids: {
          first_party: "claude-sonnet-5",
          bedrock: "us.anthropic.claude-sonnet-5",
          vertex: "claude-sonnet-5",
          foundry: "claude-sonnet-5",
          anthropic_aws: "claude-sonnet-5",
          mantle: "anthropic.claude-sonnet-5",
          gateway: "claude-sonnet-5"
        },
        eager_input_streaming: {
          bedrock: true,
          vertex: true
        },
        context: {
          window: 1e6,
          native_1m: true,
          native_1m_3p: {
            bedrock: true,
            vertex: true,
            foundry: true
          },
          supports_1m_beta: true
        },
        capabilities: ["effort", "max_effort", "xhigh_effort", "adaptive_thinking", "mid_conv_system", "context_management"],
        default_effort: "high",
        image_limits: {
          maxWidth: 2000,
          maxHeight: 2000
        }
      }, {
        id: "claude-opus-4-0",
        family: "opus",
        display_name: "Opus 4",
        knowledge_cutoff: "January 2025",
        provider_ids: {
          first_party: "claude-opus-4-20250514",
          bedrock: "us.anthropic.claude-opus-4-20250514-v1:0",
          vertex: "claude-opus-4@20250514",
          foundry: "claude-opus-4",
          anthropic_aws: "claude-opus-4-20250514",
          mantle: null,
          gateway: "claude-opus-4-20250514"
        },
        context: {
          window: 200000,
          supports_1m_suffix: true
        },
        capabilities: ["context_management"]
      }, {
        id: "claude-opus-4-1",
        family: "opus",
        display_name: "Opus 4.1",
        knowledge_cutoff: "January 2025",
        provider_ids: {
          first_party: "claude-opus-4-1-20250805",
          bedrock: "us.anthropic.claude-opus-4-1-20250805-v1:0",
          vertex: "claude-opus-4-1@20250805",
          foundry: "claude-opus-4-1",
          anthropic_aws: "claude-opus-4-1-20250805",
          mantle: null,
          gateway: "claude-opus-4-1-20250805"
        },
        context: {
          window: 200000,
          supports_1m_suffix: true
        },
        capabilities: ["context_management"]
      }, {
        id: "claude-opus-4-5",
        family: "opus",
        display_name: "Opus 4.5",
        knowledge_cutoff: "May 2025",
        provider_ids: {
          first_party: "claude-opus-4-5-20251101",
          bedrock: "us.anthropic.claude-opus-4-5-20251101-v1:0",
          vertex: "claude-opus-4-5@20251101",
          foundry: "claude-opus-4-5",
          anthropic_aws: "claude-opus-4-5-20251101",
          mantle: null,
          gateway: "claude-opus-4-5-20251101"
        },
        eager_input_streaming: {
          vertex: true
        },
        context: {
          window: 200000,
          supports_1m_suffix: true
        },
        capabilities: ["context_management"]
      }, {
        id: "claude-opus-4-6",
        family: "opus",
        display_name: "Opus 4.6",
        knowledge_cutoff: "May 2025",
        provider_ids: {
          first_party: "claude-opus-4-6",
          bedrock: "us.anthropic.claude-opus-4-6-v1",
          vertex: "claude-opus-4-6",
          foundry: "claude-opus-4-6",
          anthropic_aws: "claude-opus-4-6",
          mantle: null,
          gateway: "claude-opus-4-6"
        },
        eager_input_streaming: {
          vertex: true
        },
        context: {
          window: 200000,
          supports_1m_beta: true,
          supports_1m_suffix: true
        },
        capabilities: ["effort", "max_effort", "adaptive_thinking", "context_management"]
      }, {
        id: "claude-opus-4-7",
        family: "opus",
        display_name: "Opus 4.7",
        knowledge_cutoff: "January 2026",
        provider_ids: {
          first_party: "claude-opus-4-7",
          bedrock: "us.anthropic.claude-opus-4-7",
          vertex: "claude-opus-4-7",
          foundry: "claude-opus-4-7",
          anthropic_aws: "claude-opus-4-7",
          mantle: "anthropic.claude-opus-4-7",
          gateway: "claude-opus-4-7"
        },
        eager_input_streaming: {
          bedrock: true,
          vertex: true
        },
        context: {
          window: 1e6,
          native_1m: true,
          supports_1m_beta: true,
          supports_1m_suffix: true
        },
        capabilities: ["effort", "max_effort", "xhigh_effort", "adaptive_thinking", "context_management", "fast_mode"],
        default_effort: "xhigh",
        image_limits: {
          maxWidth: 2000,
          maxHeight: 2000
        }
      }, {
        id: "claude-opus-4-8",
        family: "opus",
        display_name: "Opus 4.8",
        knowledge_cutoff: "January 2026",
        provider_ids: {
          first_party: "claude-opus-4-8",
          bedrock: "us.anthropic.claude-opus-4-8",
          vertex: "claude-opus-4-8",
          foundry: "claude-opus-4-8",
          anthropic_aws: "claude-opus-4-8",
          mantle: "anthropic.claude-opus-4-8",
          gateway: "claude-opus-4-8"
        },
        eager_input_streaming: {
          bedrock: true,
          vertex: true
        },
        context: {
          window: 1e6,
          native_1m: true,
          supports_1m_beta: true,
          supports_1m_suffix: true
        },
        capabilities: ["effort", "max_effort", "xhigh_effort", "adaptive_thinking", "mid_conv_system", "context_management", "fast_mode", "lean_prompt"],
        default_effort: "high",
        image_limits: {
          maxWidth: 2000,
          maxHeight: 2000
        }
      }, {
        id: "claude-fable-5",
        family: "fable",
        display_name: "Fable 5",
        knowledge_cutoff: "January 2026",
        provider_ids: {
          first_party: "claude-fable-5",
          bedrock: "us.anthropic.claude-fable-5",
          vertex: "claude-fable-5",
          foundry: "claude-fable-5",
          anthropic_aws: "claude-fable-5",
          mantle: "anthropic.claude-fable-5",
          gateway: "claude-fable-5"
        },
        eager_input_streaming: {
          bedrock: true,
          vertex: true
        },
        context: {
          window: 1e6,
          native_1m: true,
          supports_1m_beta: true
        },
        capabilities: ["effort", "max_effort", "xhigh_effort", "adaptive_thinking", "rejects_disabled_thinking", "mid_conv_system", "context_management", "lean_prompt", "fable_5_mitigations"],
        default_effort: "high",
        image_limits: {
          maxWidth: 2000,
          maxHeight: 2000
        }
      }, {
        id: "claude-mythos-5",
        family: "mythos",
        display_name: "Mythos 5",
        knowledge_cutoff: "January 2026",
        provider_ids: {
          first_party: "claude-mythos-5",
          bedrock: null,
          vertex: null,
          foundry: null,
          anthropic_aws: null,
          mantle: null,
          gateway: null
        },
        context: {
          window: 1e6,
          native_1m: true,
          supports_1m_beta: true
        },
        capabilities: [],
        image_limits: {
          maxWidth: 2000,
          maxHeight: 2000
        }
      }],
      aliases: {
        opus: {
          default: "claude-opus-4-8",
          per_provider: {
            bedrock: "claude-opus-4-6",
            vertex: "claude-opus-4-6",
            foundry: "claude-opus-4-6",
            mantle: "claude-opus-4-7",
            anthropic_aws: "claude-opus-4-7",
            gateway: "claude-opus-4-7"
          }
        },
        sonnet: {
          default: "claude-sonnet-5",
          per_provider: {
            bedrock: "claude-sonnet-4-5",
            vertex: "claude-sonnet-4-5",
            foundry: "claude-sonnet-4-5",
            mantle: "claude-sonnet-4-5",
            anthropic_aws: "claude-sonnet-4-6",
            gateway: "claude-sonnet-4-6"
          }
        },
        haiku: {
          default: "claude-haiku-4-5"
        },
        fable: {
          default: "claude-fable-5"
        }
      },
      defaults: {},
      latest_per_family: {
        fable: "claude-fable-5",
        opus: "claude-opus-4-8",
        sonnet: "claude-sonnet-5",
        haiku: "claude-haiku-4-5"
      },
      alias_migration: {}
    };
  });
  function jqr(e) {
    return zbd().get(e.toLowerCase());
  }
  function VN(e) {
    return Vbd().get(e);
  }
  function o2(e, t) {
    return VN(e)?.capabilities.includes(t) ? true : undefined;
  }
  function hni(e, t) {
    let n = F1t().aliases;
    let r = Object.hasOwn(n, e) ? n[e] : undefined;
    if (!r) {
      return;
    }
    let o = r.per_provider;
    return (o && Object.hasOwn(o, t) ? o[t] : undefined) ?? r.default;
  }
  var $bd;
  var Hbd;
  var jbd;
  var qbd;
  var Wbd;
  var Gbd;
  var F1t;
  var Vbd;
  var zbd;
  var DY = __lazy(() => {
    ZL();
    mni();
    $bd = we(() => v.object({
      first_party: v.string(),
      bedrock: v.string().nullish(),
      vertex: v.string().nullish(),
      foundry: v.string().nullish(),
      anthropic_aws: v.string().nullish(),
      mantle: v.string().nullish(),
      gateway: v.string().nullish()
    }).loose());
    Hbd = we(() => v.object({
      input: v.number(),
      output: v.number(),
      cache_write_5m: v.number().optional(),
      cache_write_1h: v.number().optional(),
      cache_read: v.number().optional(),
      web_search: v.number().optional()
    }).loose());
    jbd = we(() => v.object({
      id: v.string(),
      family: v.string(),
      display_name: v.string(),
      slogan: v.string().optional(),
      knowledge_cutoff: v.string().optional(),
      provider_ids: $bd(),
      eager_input_streaming: v.object({
        bedrock: v.literal(true).optional(),
        vertex: v.literal(true).optional()
      }).loose().optional(),
      vertex_region_env_var: v.string().optional(),
      context: v.object({
        window: v.number(),
        native_1m: v.boolean().optional(),
        native_1m_3p: v.object({
          bedrock: v.literal(true).optional(),
          vertex: v.literal(true).optional(),
          foundry: v.literal(true).optional()
        }).loose().optional(),
        supports_1m_beta: v.boolean().optional(),
        supports_1m_suffix: v.boolean().optional()
      }).loose().optional(),
      max_output_tokens: v.object({
        default: v.number(),
        upper: v.number()
      }).loose().optional(),
      pricing: Hbd().optional(),
      capabilities: v.array(v.string()).default([]),
      default_effort: v.enum(["low", "medium", "high", "xhigh", "max"]).optional(),
      image_limits: v.object({
        maxWidth: v.number().optional(),
        maxHeight: v.number().optional(),
        maxBase64Size: v.number().optional()
      }).loose().optional(),
      advisor_rank: v.number().optional(),
      fallback_chain: v.array(v.string()).optional(),
      picker: v.object({
        section: v.enum(["main", "overflow", "deprecated"]).optional(),
        badge: v.string().optional(),
        disabled_reason: v.string().optional(),
        tiers: v.array(v.string()).optional()
      }).loose().optional(),
      deprecation: v.object({
        retirement_dates: v.record(v.string(), v.string()).optional(),
        remapped_to: v.string().optional()
      }).loose().optional(),
      min_cli_version: v.string().optional()
    }).loose());
    qbd = we(() => v.object({
      default: v.string(),
      per_provider: v.record(v.string(), v.string()).optional()
    }).loose());
    Wbd = we(() => v.object({
      schema_version: v.number(),
      models: v.array(jbd()),
      aliases: v.record(v.string(), qbd()).default({}),
      defaults: v.record(v.string(), v.string()).default({}),
      best: v.string().optional(),
      latest_per_family: v.record(v.string(), v.string()).default({}),
      alias_migration: v.record(v.string(), v.string()).default({})
    }).loose());
    Gbd = {
      schema_version: 0,
      models: [],
      aliases: {},
      defaults: {},
      latest_per_family: {},
      alias_migration: {}
    };
    F1t = TEr(() => {
      let e = Wbd().safeParse(fni);
      return e.success ? e.data : Gbd;
    });
    Vbd = TEr(() => {
      let e = new Map();
      for (let t of F1t().models) {
        e.set(t.id, t);
      }
      return e;
    });
    zbd = TEr(() => {
      let e = new Map();
      for (let t of F1t().models) {
        for (let n of Object.values(t.provider_ids)) {
          if (typeof n !== "string") {
            continue;
          }
          let r = n.toLowerCase();
          let o = e.get(r);
          if (o !== undefined && o !== t.id) {
            throw Error("model catalog: provider id collision across distinct entries");
          }
          e.set(r, t.id);
        }
      }
      return e;
    });
  });
  function Ybd(e) {
    let t = e.provider_ids;
    let n = {
      firstParty: t.first_party,
      bedrock: t.bedrock ?? null,
      vertex: t.vertex ?? null,
      foundry: t.foundry ?? null,
      anthropicAws: t.anthropic_aws ?? null,
      mantle: t.mantle ?? null,
      gateway: t.gateway ?? t.first_party
    };
    if (e.eager_input_streaming) {
      n.eagerInputStreaming = e.eager_input_streaming;
    }
    return n;
  }
  function Jbd() {
    let e = {};
    for (let [t, n] of Object.entries(Kbd)) {
      let r = VN(t);
      if (!r) {
        throw new Po(`model catalog missing entry for '${t}' (CATALOG_ID_TO_KEY key '${n}')`, "model catalog missing entry for CATALOG_ID_TO_KEY id");
      }
      e[n] = Ybd(r);
    }
    return e;
  }
  function Dj(e) {
    for (let t of ["bedrock", "vertex", "foundry", "anthropicAws"]) {
      if (e[t] === null) {
        throw new Po(`named CLAUDE_*_CONFIG export for '${e.firstParty}' has null ${t}`, "named model config export has null 3P provider id");
      }
    }
    return e;
  }
  function t8(e) {
    let t = e.toLowerCase();
    for (let n of Object.values(xa)) {
      for (let r of Object.values(n)) {
        if (typeof r === "string" && r.toLowerCase() === t) {
          return n;
        }
      }
    }
    return null;
  }
  var Kbd;
  var xa;
  var gni;
  var yni;
  var _ni;
  var bni;
  var Sni;
  var Tni;
  var Eni;
  var vni;
  var wni;
  var Cni;
  var Rni;
  var xni;
  var kni;
  var Ani;
  var mqe;
  var Ini;
  var qqr;
  var Pni;
  var Rot;
  var zN = __lazy(() => {
    dt();
    DY();
    Kbd = {
      "claude-3-5-haiku": "haiku35",
      "claude-haiku-4-5": "haiku45",
      "claude-3-5-sonnet": "sonnet35",
      "claude-3-7-sonnet": "sonnet37",
      "claude-sonnet-4-0": "sonnet40",
      "claude-sonnet-4-5": "sonnet45",
      "claude-sonnet-4-6": "sonnet46",
      "claude-sonnet-5": "sonnet5",
      "claude-opus-4-0": "opus40",
      "claude-opus-4-1": "opus41",
      "claude-opus-4-5": "opus45",
      "claude-opus-4-6": "opus46",
      "claude-opus-4-7": "opus47",
      "claude-opus-4-8": "opus48",
      "claude-fable-5": "fable5"
    };
    xa = Jbd();
    gni = Dj(xa.haiku35);
    yni = Dj(xa.haiku45);
    _ni = Dj(xa.sonnet35);
    bni = Dj(xa.sonnet37);
    Sni = Dj(xa.sonnet40);
    Tni = Dj(xa.sonnet45);
    Eni = Dj(xa.sonnet46);
    vni = Dj(xa.sonnet5);
    wni = Dj(xa.opus40);
    Cni = Dj(xa.opus41);
    Rni = Dj(xa.opus45);
    xni = Dj(xa.opus46);
    kni = Dj(xa.opus47);
    Ani = Dj(xa.opus48);
    mqe = Dj(xa.fable5);
    Ini = {
      firstParty: "claude-mythos-5",
      bedrock: "us.anthropic.claude-mythos-5",
      vertex: "claude-mythos-5",
      foundry: "claude-mythos-5",
      anthropicAws: "claude-mythos-5",
      mantle: "anthropic.claude-mythos-5",
      gateway: "claude-mythos-5",
      eagerInputStreaming: {
        bedrock: true,
        vertex: true
      }
    };
    qqr = ["opus48", "opus47", "opus46", "opus45"];
    Pni = Object.values(xa).map(e => e.firstParty);
    Rot = Object.fromEntries(Object.entries(xa).map(([e, t]) => [t.firstParty, e]));
  });
  function Sk(e) {
    return u_e.includes(e);
  }
  function ca(e) {
    return e.replace(/\[1m\]$/i, "");
  }
  function s2(e) {
    return Xbd.includes(e);
  }
  var u_e;
  var Xbd;
  var Tk = __lazy(() => {
    u_e = ["sonnet", "opus", "haiku", "fable", "best", "sonnet[1m]", "opus[1m]", "fable[1m]", "opusplan"];
    Xbd = ["sonnet", "opus", "haiku", "fable"];
  });
  var Oni = {};
  __export(Oni, {
    usesFirstPartyModelIds: () => usesFirstPartyModelIds,
    shouldPropagateTraceContext: () => shouldPropagateTraceContext,
    isFirstPartyProvider: () => isFirstPartyProvider,
    isFirstPartyApiBackend: () => isFirstPartyApiBackend,
    isFirstPartyAnthropicHost: () => isFirstPartyAnthropicHost,
    isFirstPartyAnthropicBaseUrl: () => isFirstPartyAnthropicBaseUrl,
    isActualFirstPartyAnthropicBaseUrl: () => isActualFirstPartyAnthropicBaseUrl,
    hasFirstPartyCapabilities: () => hasFirstPartyCapabilities,
    getSecondaryProvider: () => getSecondaryProvider,
    getProviderForModel: () => getProviderForModel,
    getAPIProviderForAnalytics: () => getAPIProviderForAnalytics,
    getAPIProvider: () => getAPIProvider,
    THIRD_PARTY_PROVIDER_LABELS: () => THIRD_PARTY_PROVIDER_LABELS
  });
  function getAPIProvider() {
    if (getGatewayAuth()) {
      return "gateway";
    }
    return st(process.env.CLAUDE_CODE_USE_BEDROCK) ? "bedrock" : st(process.env.CLAUDE_CODE_USE_FOUNDRY) ? "foundry" : st(process.env.CLAUDE_CODE_USE_ANTHROPIC_AWS) ? "anthropicAws" : st(process.env.CLAUDE_CODE_USE_MANTLE) ? "mantle" : st(process.env.CLAUDE_CODE_USE_VERTEX) ? "vertex" : "firstParty";
  }
  function getAPIProviderForAnalytics() {
    return getAPIProvider();
  }
  function isFirstPartyProvider() {
    return getAPIProvider() === "firstParty";
  }
  function getSecondaryProvider() {
    if (getAPIProvider() === "bedrock" && st(process.env.CLAUDE_CODE_USE_MANTLE)) {
      return "mantle";
    }
    return null;
  }
  function Qbd(e) {
    return e.startsWith("anthropic.") && !/-v\d+(:\d+)?$/.test(ca(e));
  }
  function getProviderForModel(e) {
    if (e) {
      let t = getSecondaryProvider();
      if (t) {
        if (t === "mantle" && Qbd(e)) {
          return t;
        }
        let n = getAPIProvider();
        let r = t8(e);
        if (r && r[n] === null && r[t] !== null) {
          return t;
        }
      }
    }
    return getAPIProvider();
  }
  function usesFirstPartyModelIds(e = getAPIProvider()) {
    return e === "firstParty" || e === "anthropicAws" || e === "gateway";
  }
  function hasFirstPartyCapabilities(e = getAPIProvider()) {
    return e === "firstParty" || e === "anthropicAws" || e === "foundry" || e === "mantle";
  }
  function isFirstPartyApiBackend() {
    return getAPIProvider() === "firstParty" && isFirstPartyAnthropicBaseUrl();
  }
  function isFirstPartyAnthropicBaseUrl() {
    if (Me._CLAUDE_CODE_ASSUME_FIRST_PARTY_BASE_URL) {
      return true;
    }
    return isActualFirstPartyAnthropicBaseUrl();
  }
  function isActualFirstPartyAnthropicBaseUrl() {
    let e = process.env.ANTHROPIC_BASE_URL;
    if (!e) {
      return true;
    }
    return isFirstPartyAnthropicHost(e);
  }
  function isFirstPartyAnthropicHost(e) {
    try {
      let t = new URL(e).host;
      return ["api.anthropic.com"].includes(t);
    } catch {
      return false;
    }
  }
  function shouldPropagateTraceContext() {
    return isFirstPartyAnthropicBaseUrl() || st(process.env.CLAUDE_CODE_PROPAGATE_TRACEPARENT);
  }
  var THIRD_PARTY_PROVIDER_LABELS;
  var Ds = __lazy(() => {
    at();
    d_();
    gn();
    Tk();
    zN();
    THIRD_PARTY_PROVIDER_LABELS = {
      bedrock: "Amazon Bedrock",
      vertex: "Google Vertex AI",
      foundry: "Microsoft Foundry",
      anthropicAws: "Claude Platform on AWS",
      mantle: "Amazon Bedrock (Mantle)",
      gateway: "Cloud gateway"
    };
  });
  function $1t(e, t) {
    let n = Wqr.find(s => xa[s][e] !== null);
    let r = e === "bedrock" ? $le(t ?? Wxs()) : undefined;
    let o = {};
    for (let s of Wqr) {
      let i = xa[s][e] ?? (n ? xa[n][e] : xa[s].firstParty);
      o[s] = r ? ZAe(i, r) : i;
    }
    return o;
  }
  async function Zbd() {
    let e = await Ej();
    let t = $1t("bedrock", e);
    let n;
    try {
      n = await dqe();
    } catch (s) {
      logForDebugging(`Failed to list Bedrock inference profiles, falling back to hardcoded models: ${s instanceof Error ? s.message : String(s)}`, {
        level: "error"
      });
      return t;
    }
    if (!n?.length) {
      return t;
    }
    let r = $le(e);
    let o = {};
    for (let s of Wqr) {
      let i = xa[s].firstParty;
      o[s] = pqe(n, i, r) || t[s];
    }
    return o;
  }
  function Dni(e) {
    let t = getInitialSettings().modelOverrides;
    if (!t) {
      return e;
    }
    let n = {
      ...e
    };
    for (let [r, o] of Object.entries(t)) {
      let s = Rot[r];
      if (s && o) {
        n[s] = o;
      }
    }
    return n;
  }
  function kot(e) {
    let t;
    try {
      t = getInitialSettings().modelOverrides;
    } catch {
      return e;
    }
    if (!t) {
      return e;
    }
    for (let [n, r] of Object.entries(t)) {
      if (r === e) {
        return n;
      }
    }
    return e;
  }
  function Nni() {
    if (getModelStrings() !== null) {
      return;
    }
    if (getAPIProvider() !== "bedrock") {
      setModelStrings($1t(getAPIProvider()));
      return;
    }
    Mni();
  }
  function rp() {
    let e = getModelStrings();
    if (e === null) {
      Nni();
      return Dni($1t(getAPIProvider()));
    }
    return Dni(e);
  }
  function e0e() {
    let e = getModelStrings();
    if (e === null) {
      Nni();
      return $1t(getAPIProvider());
    }
    return e;
  }
  async function iwn() {
    if (getModelStrings() !== null) {
      return;
    }
    if (getAPIProvider() !== "bedrock") {
      setModelStrings($1t(getAPIProvider()));
      return;
    }
    await Mni();
  }
  var Wqr;
  var Mni;
  var sne = __lazy(() => {
    at();
    JHe();
    je();
    Rn();
    Hle();
    zN();
    Ds();
    Wqr = Object.keys(xa);
    Mni = tnt(async () => {
      if (getModelStrings() !== null) {
        return;
      }
      try {
        let e = await Zbd();
        setModelStrings(e);
      } catch (e) {
        Oe(e);
      }
    });
  });
  function Gqr(e) {
    if (e < 60000) {
      return `${Math.round(e / 1000)}s`;
    }
    let t = Math.floor(e / 60000);
    let n = Math.round(e % 60000 / 1000);
    return n > 0 ? `${t}m ${n}s` : `${t}m`;
  }
  function Uni(e) {
    let n = (e.startsWith("sk-ant-si-") ? e.slice(10) : e).split(".");
    if (n.length !== 3 || !n[1]) {
      return null;
    }
    try {
      return qt(Buffer.from(n[1], "base64url").toString("utf8"));
    } catch {
      return null;
    }
  }
  function H1t(e) {
    let t = Uni(e);
    if (t !== null && typeof t === "object" && "exp" in t && typeof t.exp === "number") {
      return t.exp;
    }
    return null;
  }
  function awn({
    getAccessToken: e,
    onRefresh: t,
    label: n,
    refreshBufferMs: r = eSd
  }) {
    let o = new Map();
    let s = new Map();
    let i = new Map();
    function a(m) {
      let f = (i.get(m) ?? 0) + 1;
      i.set(m, f);
      return f;
    }
    function l(m, f) {
      let h = H1t(f);
      if (!h) {
        logForDebugging(`[${n}:token] Could not decode JWT expiry for sessionId=${m}, token prefix=${f.slice(0, 15)}\u2026, keeping existing timer`);
        return;
      }
      let g = o.get(m);
      if (g) {
        clearTimeout(g);
      }
      let y = a(m);
      let _ = new Date(h * 1000).toISOString();
      let b = h * 1000 - Date.now() - r;
      if (b <= 0) {
        logForDebugging(`[${n}:token] Token for sessionId=${m} expires=${_} (past or within buffer), refreshing immediately`);
        u(m, y);
        return;
      }
      logForDebugging(`[${n}:token] Scheduled token refresh for sessionId=${m} in ${Gqr(b)} (expires=${_}, buffer=${r / 1000}s)`);
      let S = setTimeout(u, b, m, y);
      o.set(m, S);
    }
    function c(m, f) {
      let h = o.get(m);
      if (h) {
        clearTimeout(h);
      }
      let g = a(m);
      let y = Math.max(f * 1000 - r, 30000);
      logForDebugging(`[${n}:token] Scheduled token refresh for sessionId=${m} in ${Gqr(y)} (expires_in=${f}s, buffer=${r / 1000}s)`);
      let _ = setTimeout(u, y, m, g);
      o.set(m, _);
    }
    async function u(m, f) {
      let h;
      try {
        h = await e();
      } catch (y) {
        logForDebugging(`[${n}:token] getAccessToken threw for sessionId=${m}: ${he(y)}`, {
          level: "error"
        });
      }
      if (i.get(m) !== f) {
        logForDebugging(`[${n}:token] doRefresh for sessionId=${m} stale (gen ${f} vs ${i.get(m)}), skipping`);
        return;
      }
      if (!h) {
        let y = (s.get(m) ?? 0) + 1;
        if (s.set(m, y), logForDebugging(`[${n}:token] No OAuth token available for refresh, sessionId=${m} (failure ${y}/${3})`, {
          level: "error"
        }), wn("error", "bridge_token_refresh_no_oauth"), y < 3) {
          let _ = setTimeout(u, 60000, m, f);
          o.set(m, _);
        }
        return;
      }
      s.delete(m);
      logForDebugging(`[${n}:token] Refreshing token for sessionId=${m}: new token prefix=${h.slice(0, 15)}\u2026`);
      logEvent("tengu_bridge_token_refreshed", {});
      t(m, h);
      let g = setTimeout(u, 1800000, m, f);
      o.set(m, g);
      logForDebugging(`[${n}:token] Scheduled follow-up refresh for sessionId=${m} in ${Gqr(1800000)}`);
    }
    function d(m) {
      a(m);
      let f = o.get(m);
      if (f) {
        clearTimeout(f);
        o.delete(m);
      }
      s.delete(m);
    }
    function p() {
      for (let m of i.keys()) {
        a(m);
      }
      for (let m of o.values()) {
        clearTimeout(m);
      }
      o.clear();
      s.clear();
    }
    return {
      schedule: l,
      scheduleFromExpiresIn: c,
      cancel: d,
      cancelAll: p
    };
  }
  var Aot = __lazy(() => {
    Ot();
    je();
    Zm();
    dt();
  });
  function lwn() {
    if (Me.DISABLE_COST_WARNINGS) {
      return false;
    }
    let e = isClaudeAISubscriber();
    if (e && i2()) {
      return true;
    }
    if (e) {
      return false;
    }
    let t = getAuthTokenSource();
    let n = hasAnthropicApiKey();
    if (!t.hasToken && !n) {
      return false;
    }
    let r = getGlobalConfig();
    let o = r.oauthAccount?.organizationRole;
    let s = r.oauthAccount?.workspaceRole;
    if (!o || !s) {
      return false;
    }
    return ["admin", "billing"].includes(o) || ["workspace_admin", "workspace_billing"].includes(s);
  }
  function av() {
    if (null !== null) {
      return null;
    }
    if (!isClaudeAISubscriber()) {
      return false;
    }
    let e = getSubscriptionType();
    if (e === "max" || e === "pro") {
      return true;
    }
    let n = getGlobalConfig().oauthAccount?.organizationRole;
    return !!n && ["admin", "billing", "owner", "primary_owner"].includes(n);
  }
  function i2() {
    return getOauthAccountInfo()?.billingType === "usage_based";
  }
  var vF = __lazy(() => {
    no();
    pr();
  });
  function Hni() {
    return null;
  }
  function jni(e) {
    let t = Hni();
    if (!t) {
      return e;
    }
    let n = new globalThis.Headers(e);
    Object.entries(t).forEach(([r, o]) => {
      if (o !== undefined) {
        n.set(r, o);
      }
    });
    return n;
  }
  function Pot() {
    return false;
  }
  function Vqr() {
    return null;
  }
  function zqr() {
    return null;
  }
  function Kqr() {
    return false && null !== null && false;
  }
  function vI() {
    return null;
  }
  function Yqr() {
    return null;
    switch (e) {
      case "not-started":
        return {
          endsAt: null
        };
      case "expired":
        return {
          endsAt: new Date(Date.now() - t).toISOString()
        };
      default:
        {
          let n = Number(e);
          return Number.isFinite(n) && n > 0 ? {
            endsAt: new Date(Date.now() + n * t).toISOString()
          } : null;
        }
    }
  }
  function qni(e) {
    return;
  }
  var nSd;
  var jle = __lazy(() => {
    vF();
    nSd = {};
  });
  function Wni(e) {
    let t = iSd().safeParse(e);
    if (!t.success) {
      Et("oauth_profile_fetch", "malformed_response_body");
      logForDebugging(`OAuth profile: response body failed shape validation \u2014 ${t.error.message}`, {
        level: "error"
      });
      return;
    }
    Pe("oauth_profile_fetch");
    return e;
  }
  async function Gni() {
    let t = getGlobalConfig().oauthAccount?.accountUuid;
    let n = getAnthropicApiKey();
    if (!t || !n) {
      return;
    }
    let r = `${getOauthConfig().BASE_API_URL}/api/claude_cli_profile`;
    try {
      let o = await NP.get(r, {
        headers: {
          "x-api-key": n,
          "anthropic-beta": "oauth-2025-04-20",
          "Cache-Control": "no-cache"
        },
        params: {
          account_uuid: t
        },
        timeout: 1e4
      });
      return Wni(o.data);
    } catch (o) {
      if (Et("oauth_profile_fetch", "oauth_profile_api_key_failed"), M_(o)) {
        logForDebugging(`Failed to fetch oauth profile from API key: ${o}`, {
          level: "error"
        });
      } else {
        Oe(o);
      }
    }
  }
  async function t0e(e) {
    let t = `${getOauthConfig().BASE_API_URL}/api/oauth/profile`;
    try {
      let n = await NP.get(t, {
        headers: {
          Authorization: `Bearer ${e}`,
          "Content-Type": "application/json",
          "Cache-Control": "no-cache"
        },
        timeout: 1e4
      });
      return Wni(n.data);
    } catch (n) {
      if (Et("oauth_profile_fetch", "oauth_profile_token_failed"), M_(n)) {
        logForDebugging(`Failed to fetch oauth profile from OAuth token: ${n}`, {
          level: "error"
        });
      } else {
        Oe(n);
      }
    }
  }
  async function uwn(e) {
    let t = `${getOauthConfig().BASE_API_URL}/api/oauth/validate`;
    try {
      let n = await NP.post(t, null, {
        headers: {
          Authorization: `Bearer ${e}`,
          "Content-Type": "application/json"
        },
        timeout: 1e4
      });
      Pe("oauth_token_validate");
      return n.data;
    } catch (n) {
      if (Et("oauth_token_validate", "oauth_validate_failed"), M_(n)) {
        logForDebugging(`Failed to validate OAuth token: ${n}`, {
          level: "error"
        });
      } else {
        Oe(n);
      }
    }
  }
  var iSd;
  var fqe = __lazy(() => {
    Dp();
    Uc();
    ln();
    no();
    je();
    dt();
    Rn();
    qg();
    iSd = we(() => Ke.object({
      account: Ke.object({
        uuid: Ke.string(),
        email: Ke.string()
      }).passthrough(),
      organization: Ke.object({
        uuid: Ke.string()
      }).passthrough()
    }).passthrough());
  });
  var Dot = {};