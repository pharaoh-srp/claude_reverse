  __export(xk, {
    withBaseException: () => withBaseException_export5,
    throwDefaultError: () => throwDefaultError_export5,
    take: () => take_export5,
    serializeFloat: () => serializeFloat_export5,
    serializeDateTime: () => serializeDateTime_export5,
    resolvedPath: () => Dli.resolvedPath,
    resolveDefaultRuntimeConfig: () => resolveDefaultRuntimeConfig_export5,
    map: () => map_export7,
    loadConfigsForDefaultMode: () => loadConfigsForDefaultMode_export5,
    isSerializableHeaderValue: () => isSerializableHeaderValue_export5,
    getValueFromTextNode: () => getValueFromTextNode_export5,
    getDefaultExtensionConfiguration: () => getDefaultExtensionConfiguration_export5,
    getDefaultExtensionConfiguration: () => getDefaultExtensionConfiguration_export5,
    getArrayIfSingleItem: () => getArrayIfSingleItem_export5,
    extendedEncodeURIComponent: () => Tli.extendedEncodeURIComponent,
    emitWarningIfUnsupportedVersion: () => emitWarningIfUnsupportedVersion_export5,
    decorateServiceException: () => decorateServiceException_export5,
    createAggregatedClient: () => createAggregatedClient_export5,
    convertMap: () => convertMap_export5,
    collectBody: () => Yii.collectBody,
    _json: () => _json_export5,
    ServiceException: () => ServiceException_export5,
    SENSITIVE_STRING: () => "***SensitiveInformation***",
    NoOpLogger: () => NoOpLogger_export5,
    Command: () => Command_export5,
    Client: () => Client_export5
  });
  var bb = __lazy(() => {
    Kii();
    Jii();
    yli();
    bli();
    B3r();
    Eli();
    Ali();
    Mli();
    __reExport(xk, __toESM(yW(), 1), module.exports);
  });
  function jTd(e) {
    return {
      schemeId: "aws.auth#sigv4",
      signingProperties: {
        name: "cognito-identity",
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
  function eCn(e) {
    return {
      schemeId: "smithy.api#noAuth"
    };
  }
  var Nli;
  var lLt;
  var Lli = async (e, t, n) => ({
    operation: lLt.getSmithyContext(t).operation,
    region: (await lLt.normalizeProvider(e.region)()) || (() => {
      throw Error("expected `region` to be configured for `aws.auth#sigv4`");
    })()
  });
  var Fli = e => {
    let t = [];
    switch (e.operation) {
      case "GetCredentialsForIdentity":
        {
          t.push(eCn(e));
          break;
        }
      case "GetId":
        {
          t.push(eCn(e));
          break;
        }
      case "GetOpenIdToken":
        {
          t.push(eCn(e));
          break;
        }
      case "UnlinkIdentity":
        {
          t.push(eCn(e));
          break;
        }
      default:
        t.push(jTd(e));
    }
    return t;
  };
  var Uli = e => {
    let t = Nli.resolveAwsSdkSigV4Config(e);
    return Object.assign(t, {
      authSchemePreference: lLt.normalizeProvider(e.authSchemePreference ?? [])
    });
  };
  var W3r = __lazy(() => {
    Nli = __toESM(nw(), 1);
    lLt = __toESM(zB(), 1);
  });
  var Bli = e => Object.assign(e, {
    useDualstackEndpoint: e.useDualstackEndpoint ?? false,
    useFipsEndpoint: e.useFipsEndpoint ?? false,
    defaultSigningName: "cognito-identity"
  });
  var Np;
  var RC = __lazy(() => {
    Np = {
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
  var Hli;
  var $li = __lazy(() => {
    Hli = {
      name: "@aws-sdk/client-cognito-identity",
      description: "AWS SDK for JavaScript Cognito Identity Client for Node.js, Browser and React Native",
      version: "3.936.0",
      scripts: {
        build: "concurrently 'yarn:build:cjs' 'yarn:build:es' 'yarn:build:types'",
        "build:cjs": "node ../../scripts/compilation/inline client-cognito-identity",
        "build:es": "tsc -p tsconfig.es.json",
        "build:include:deps": "lerna run --scope $npm_package_name --include-dependencies build",
        "build:types": "tsc -p tsconfig.types.json",
        "build:types:downlevel": "downlevel-dts dist-types dist-types/ts3.4",
        clean: "rimraf ./dist-* && rimraf *.tsbuildinfo",
        "extract:docs": "api-extractor run --local",
        "generate:client": "node ../../scripts/generate-clients/single-service --solo cognito-identity",
        "test:e2e": "yarn g:vitest run -c vitest.config.e2e.mts --mode development",
        "test:e2e:watch": "yarn g:vitest watch -c vitest.config.e2e.mts"
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
        "@aws-sdk/client-iam": "3.936.0",
        "@tsconfig/node18": "18.2.4",
        "@types/chai": "^4.2.11",
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
      homepage: "https://github.com/aws/aws-sdk-js-v3/tree/main/clients/client-cognito-identity",
      repository: {
        type: "git",
        url: "https://github.com/aws/aws-sdk-js-v3.git",
        directory: "clients/client-cognito-identity"
      }
    };
  });
  var jli = e => typeof ArrayBuffer === "function" && e instanceof ArrayBuffer || Object.prototype.toString.call(e) === "[object ArrayBuffer]";
  var tCn;
  var qli = (e, t = 0, n = e.byteLength - t) => {
    if (!jli(e)) {
      throw TypeError(`The "input" argument must be ArrayBuffer. Received type ${typeof e} (${e})`);
    }
    return tCn.Buffer.from(e, t, n);
  };
  var Wli = (e, t) => {
    if (typeof e !== "string") {
      throw TypeError(`The "input" argument must be of type string. Received type ${typeof e} (${e})`);
    }
    return t ? tCn.Buffer.from(e, t) : tCn.Buffer.from(e);
  };
  var G3r = __lazy(() => {
    tCn = require("buffer");
  });
  var WTd;
  var Gli = e => {
    if (e.length * 3 % 4 !== 0) {
      throw TypeError("Incorrect padding on base64 string.");
    }
    if (!WTd.exec(e)) {
      throw TypeError("Invalid base64 string.");
    }
    let t = Wli(e, "base64");
    return new Uint8Array(t.buffer, t.byteOffset, t.byteLength);
  };
  var Vli = __lazy(() => {
    G3r();
    WTd = /^[A-Za-z0-9+/]*={0,2}$/;
  });
  var zli;
  var Kli = e => {
    let t;
    if (typeof e === "string") {
      t = zli.fromUtf8(e);
    } else {
      t = e;
    }
    if (typeof t !== "object" || typeof t.byteOffset !== "number" || typeof t.byteLength !== "number") {
      throw Error("@smithy/util-base64: toBase64 encoder function only accepts string | Uint8Array.");
    }
    return qli(t.buffer, t.byteOffset, t.byteLength).toString("base64");
  };
  var Yli = __lazy(() => {
    G3r();
    zli = __toESM(jT(), 1);
  });
  var Jli = __lazy(() => {
    Vli();
    Yli();
  });
  var Xli;
  var Qli;
  var Zli;
  var sci;
  var ici;
  var WP;
  var cLt;
  var eci;
  var aci;
  var tci;
  var nci;
  var rci;
  var oci;
  var GTd;
  var uci;
  var Wot;
  var VTd;
  var dci = (e, t = {}) => VTd.get(e, () => Wot.resolveEndpoint(GTd, {
    endpointParams: e,
    logger: t.logger
  }));
  var pci = __lazy(() => {
    uci = __toESM(Ale(), 1);
    Wot = __toESM(Lte(), 1);
    VTd = new Wot.EndpointCache({
      size: 50,
      params: ["Endpoint", "Region", "UseDualStack", "UseFIPS"]
    });
    Wot.customEndpointFunctions.aws = uci.awsEndpointFunctions;
  });
  var mci;
  var fci;
  var hci;
  var gci;
  var nCn;
  var yci = e => ({
    apiVersion: "2014-06-30",
    base64Decoder: e?.base64Decoder ?? Gli,
    base64Encoder: e?.base64Encoder ?? Kli,
    disableHostPrefix: e?.disableHostPrefix ?? false,
    endpointProvider: e?.endpointProvider ?? dci,
    extensions: e?.extensions ?? [],
    httpAuthSchemeProvider: e?.httpAuthSchemeProvider ?? Fli,
    httpAuthSchemes: e?.httpAuthSchemes ?? [{
      schemeId: "aws.auth#sigv4",
      identityProvider: t => t.getIdentityProvider("aws.auth#sigv4"),
      signer: new mci.AwsSdkSigV4Signer()
    }, {
      schemeId: "smithy.api#noAuth",
      identityProvider: t => t.getIdentityProvider("smithy.api#noAuth") || (async () => ({})),
      signer: new hci.NoAuthSigner()
    }],
    logger: e?.logger ?? new NoOpLogger_export5(),
    protocol: e?.protocol ?? new fci.AwsJson1_1Protocol({
      defaultNamespace: "com.amazonaws.cognitoidentity",
      serviceTarget: "AWSCognitoIdentityService",
      awsQueryCompatible: false
    }),
    serviceId: e?.serviceId ?? "Cognito Identity",
    urlParser: e?.urlParser ?? gci.parseUrl,
    utf8Decoder: e?.utf8Decoder ?? nCn.fromUtf8,
    utf8Encoder: e?.utf8Encoder ?? nCn.toUtf8
  });
  var _ci = __lazy(() => {
    bb();
    Jli();
    W3r();
    pci();
    mci = __toESM(nw(), 1);
    fci = __toESM(r_e(), 1);
    hci = __toESM(Od(), 1);
    gci = __toESM(bY(), 1);
    nCn = __toESM(jT(), 1);
  });
  var rCn;
  var oCn;
  var l0e;
  var bci;
  var sCn;
  var a0e;
  var iCn;
  var Sci;
  var Tci;
  var Eci;
  var vci = e => {
    emitWarningIfUnsupportedVersion_export5(process.version);
    let t = Eci.resolveDefaultsModeConfig(e);
    let n = () => t().then(loadConfigsForDefaultMode_export5);
    let r = yci(e);
    rCn.emitWarningIfUnsupportedVersion(process.version);
    let o = {
      profile: e?.profile,
      logger: r.logger
    };
    return {
      ...r,
      ...e,
      runtime: "node",
      defaultsMode: t,
      authSchemePreference: e?.authSchemePreference ?? a0e.loadConfig(rCn.NODE_AUTH_SCHEME_PREFERENCE_OPTIONS, o),
      bodyLengthChecker: e?.bodyLengthChecker ?? Sci.calculateBodyLength,
      credentialDefaultProvider: e?.credentialDefaultProvider ?? defaultProvider,
      defaultUserAgentProvider: e?.defaultUserAgentProvider ?? oCn.createDefaultUserAgentProvider({
        serviceId: r.serviceId,
        clientVersion: Hli.version
      }),
      maxAttempts: e?.maxAttempts ?? a0e.loadConfig(sCn.NODE_MAX_ATTEMPT_CONFIG_OPTIONS, e),
      region: e?.region ?? a0e.loadConfig(l0e.NODE_REGION_CONFIG_OPTIONS, {
        ...l0e.NODE_REGION_CONFIG_FILE_OPTIONS,
        ...o
      }),
      requestHandler: iCn.NodeHttpHandler.create(e?.requestHandler ?? n),
      retryMode: e?.retryMode ?? a0e.loadConfig({
        ...sCn.NODE_RETRY_MODE_CONFIG_OPTIONS,
        default: async () => (await n()).retryMode || Tci.DEFAULT_RETRY_MODE
      }, e),
      sha256: e?.sha256 ?? bci.Hash.bind(null, "sha256"),
      streamCollector: e?.streamCollector ?? iCn.streamCollector,
      useDualstackEndpoint: e?.useDualstackEndpoint ?? a0e.loadConfig(l0e.NODE_USE_DUALSTACK_ENDPOINT_CONFIG_OPTIONS, o),
      useFipsEndpoint: e?.useFipsEndpoint ?? a0e.loadConfig(l0e.NODE_USE_FIPS_ENDPOINT_CONFIG_OPTIONS, o),
      userAgentAppId: e?.userAgentAppId ?? a0e.loadConfig(oCn.NODE_APP_ID_CONFIG_OPTIONS, o)
    };
  };
  var wci = __lazy(() => {
    $li();
    Xje();
    _ci();
    bb();
    bb();
    rCn = __toESM(nw(), 1);
    oCn = __toESM(Zye(), 1);
    l0e = __toESM(HA(), 1);
    bci = __toESM(e_e(), 1);
    sCn = __toESM(yF(), 1);
    a0e = __toESM(VB(), 1);
    iCn = __toESM(hW(), 1);
    Sci = __toESM(t_e(), 1);
    Tci = __toESM(Ole(), 1);
    Eci = __toESM(s_e(), 1);
  });
  var Cci = e => ({
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
  var Rci = e => ({
    httpHandler: e.httpHandler()
  });
  var xci = () => {};
  var kci = () => {};
  var Aci = () => {};
  var Ici = () => {};
  var Pci = __lazy(() => {
    xci();
    kci();
    Aci();
    Ici();
  });
  var Oci = e => {
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
  var Dci = e => ({
    httpAuthSchemes: e.httpAuthSchemes(),
    httpAuthSchemeProvider: e.httpAuthSchemeProvider(),
    credentials: e.credentials()
  });
  var aCn;
  var Mci = (e, t) => {
    let n = Object.assign(aCn.getAwsRegionExtensionConfiguration(e), getDefaultExtensionConfiguration_export5(e), Cci(e), Oci(e));
    t.forEach(r => r.configure(n));
    return Object.assign(e, aCn.resolveAwsRegionExtensionConfiguration(n), resolveDefaultRuntimeConfig_export5(n), Rci(n), Dci(n));
  };
  var Nci = __lazy(() => {
    Pci();
    bb();
    aCn = __toESM(Xte(), 1);
  });
  var lCn;
  var Lci;
  var Fci;
  var cCn;
  var Uci;
  var Got;
  var Bci;
  var $ci;
  var Hci;
  var uCn;
  var CognitoIdentityClient;
  var dCn = __lazy(() => {
    bb();
    W3r();
    RC();
    wci();
    Nci();
    lCn = __toESM(qye(), 1);
    Lci = __toESM(Wye(), 1);
    Fci = __toESM(Gye(), 1);
    cCn = __toESM(Ple(), 1);
    Uci = __toESM(HA(), 1);
    Got = __toESM(Od(), 1);
    Bci = __toESM(qT(), 1);
    $ci = __toESM(Xye(), 1);
    Hci = __toESM(_o(), 1);
    uCn = __toESM(yF(), 1);
    CognitoIdentityClient = class _qe extends Client_export5 {
      config;
      constructor(...[e]) {
        let t = vci(e || {});
        super(t);
        this.initConfig = t;
        let n = Bli(t);
        let r = cCn.resolveUserAgentConfig(n);
        let o = uCn.resolveRetryConfig(r);
        let s = Uci.resolveRegionConfig(o);
        let i = lCn.resolveHostHeaderConfig(s);
        let a = Hci.resolveEndpointConfig(i);
        let l = Uli(a);
        let c = Mci(l, e?.extensions || []);
        this.config = c;
        this.middlewareStack.use(Bci.getSchemaSerdePlugin(this.config));
        this.middlewareStack.use(cCn.getUserAgentPlugin(this.config));
        this.middlewareStack.use(uCn.getRetryPlugin(this.config));
        this.middlewareStack.use($ci.getContentLengthPlugin(this.config));
        this.middlewareStack.use(lCn.getHostHeaderPlugin(this.config));
        this.middlewareStack.use(Lci.getLoggerPlugin(this.config));
        this.middlewareStack.use(Fci.getRecursionDetectionPlugin(this.config));
        this.middlewareStack.use(Got.getHttpAuthSchemeEndpointRuleSetPlugin(this.config, {
          httpAuthSchemeParametersProvider: Lli,
          identityProviderConfigProvider: async u => new Got.DefaultIdentityProviderConfig({
            "aws.auth#sigv4": u.credentials
          })
        }));
        this.middlewareStack.use(Got.getHttpSigningPlugin(this.config));
      }
      destroy() {
        super.destroy();
      }
    };
  });
  var c2;
  var V3r = __lazy(() => {
    bb();
    c2 = class c2 extends ServiceException_export5 {
      constructor(e) {
        super(e);
        Object.setPrototypeOf(this, c2.prototype);
      }
    };
  });
  var pCn;
  var mCn;
  var fCn;
  var hCn;
  var gCn;
  var yCn;
  var _Cn;
  var bCn;
  var SCn;
  var TCn;
  var ECn;
  var z3r = __lazy(() => {
    V3r();
    pCn = class pCn extends c2 {
      name = "InternalErrorException";
      $fault = "server";
      constructor(e) {
        super({
          name: "InternalErrorException",
          $fault: "server",
          ...e
        });
        Object.setPrototypeOf(this, pCn.prototype);
      }
    };
    mCn = class mCn extends c2 {
      name = "InvalidParameterException";
      $fault = "client";
      constructor(e) {
        super({
          name: "InvalidParameterException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, mCn.prototype);
      }
    };
    fCn = class fCn extends c2 {
      name = "LimitExceededException";
      $fault = "client";
      constructor(e) {
        super({
          name: "LimitExceededException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, fCn.prototype);
      }
    };
    hCn = class hCn extends c2 {
      name = "NotAuthorizedException";
      $fault = "client";
      constructor(e) {
        super({
          name: "NotAuthorizedException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, hCn.prototype);
      }
    };
    gCn = class gCn extends c2 {
      name = "ResourceConflictException";
      $fault = "client";
      constructor(e) {
        super({
          name: "ResourceConflictException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, gCn.prototype);
      }
    };
    yCn = class yCn extends c2 {
      name = "TooManyRequestsException";
      $fault = "client";
      constructor(e) {
        super({
          name: "TooManyRequestsException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, yCn.prototype);
      }
    };
    _Cn = class _Cn extends c2 {
      name = "ResourceNotFoundException";
      $fault = "client";
      constructor(e) {
        super({
          name: "ResourceNotFoundException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, _Cn.prototype);
      }
    };
    bCn = class bCn extends c2 {
      name = "ExternalServiceException";
      $fault = "client";
      constructor(e) {
        super({
          name: "ExternalServiceException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, bCn.prototype);
      }
    };
    SCn = class SCn extends c2 {
      name = "InvalidIdentityPoolConfigurationException";
      $fault = "client";
      constructor(e) {
        super({
          name: "InvalidIdentityPoolConfigurationException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, SCn.prototype);
      }
    };
    TCn = class TCn extends c2 {
      name = "DeveloperUserAlreadyRegisteredException";
      $fault = "client";
      constructor(e) {
        super({
          name: "DeveloperUserAlreadyRegisteredException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, TCn.prototype);
      }
    };
    ECn = class ECn extends c2 {
      name = "ConcurrentModificationException";
      $fault = "client";
      constructor(e) {
        super({
          name: "ConcurrentModificationException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, ECn.prototype);
      }
    };
  });
  var a8;
  var zTd;
  var jci;
  var KTd;
  var YTd;
  var JTd;
  var XTd;
  var QTd;
  var ZTd;
  var eEd;
  var tEd;
  var nEd;
  var rEd;
  var oEd;
  var sEd;
  var iEd;
  var aEd;
  var lEd;
  var cEd;
  var uEd;
  var dEd;
  var pEd;
  var mEd;
  var fEd;
  var hEd;
  var gEd;
  var yEd;
  var qci;
  var vCn;
  var _Ed;
  var bEd;
  var SEd;
  var TEd;
  var EEd;
  var vEd;
  var wEd;
  var CEd;
  var REd;
  var xEd;
  var kEd;
  var AEd;
  var IEd;
  var PEd;
  var OEd;
  var DEd;
  var MEd;
  var NEd;
  var LEd;
  var FEd;
  var UEd;
  var BEd;
  var $Ed;
  var HEd;
  var jEd;
  var qEd;
  var WEd;
  var GEd;
  var VEd;
  var zEd;
  var KEd;
  var YEd;
  var JEd;
  var Wci;
  var XEd;
  var QEd;
  var ZEd;
  var evd;
  var uLt;
  var Gci;
  var Vci;
  var zci;
  var Kci;
  var Yci;
  var Jci;
  var Xci;
  var Qci;
  var Zci;
  var eui;
  var tui;
  var nui;
  var rui;
  var oui;
  var sui;
  var iui;
  var aui;
  var lui;
  var cui;
  var uui;
  var dui;
  var pui;
  var mui;
  var fui;
  var JR = __lazy(() => {
    V3r();
    z3r();
    a8 = __toESM(qT(), 1);
    zTd = [0, "com.amazonaws.cognitoidentity", "IdentityProviderToken", 8, 0];
    jci = [0, "com.amazonaws.cognitoidentity", "OIDCToken", 8, 0];
    KTd = [0, "com.amazonaws.cognitoidentity", "SecretKeyString", 8, 0];
    YTd = [3, "com.amazonaws.cognitoidentity", "CognitoIdentityProvider", 0, ["ProviderName", "ClientId", "ServerSideTokenCheck"], [0, 0, 2]];
    JTd = [-3, "com.amazonaws.cognitoidentity", "ConcurrentModificationException", {
      error: "client",
      httpError: 400
    }, ["message"], [0]];
    a8.TypeRegistry.for("com.amazonaws.cognitoidentity").registerError(JTd, ECn);
    XTd = [3, "com.amazonaws.cognitoidentity", "CreateIdentityPoolInput", 0, ["IdentityPoolName", "AllowUnauthenticatedIdentities", "AllowClassicFlow", "SupportedLoginProviders", "DeveloperProviderName", "OpenIdConnectProviderARNs", "CognitoIdentityProviders", "SamlProviderARNs", "IdentityPoolTags"], [0, 2, 2, 128, 0, 64, () => Wci, 64, 128]];
    QTd = [3, "com.amazonaws.cognitoidentity", "Credentials", 0, ["AccessKeyId", "SecretKey", "SessionToken", "Expiration"], [0, [() => KTd, 0], 0, 4]];
    ZTd = [3, "com.amazonaws.cognitoidentity", "DeleteIdentitiesInput", 0, ["IdentityIdsToDelete"], [64]];
    eEd = [3, "com.amazonaws.cognitoidentity", "DeleteIdentitiesResponse", 0, ["UnprocessedIdentityIds"], [() => evd]];
    tEd = [3, "com.amazonaws.cognitoidentity", "DeleteIdentityPoolInput", 0, ["IdentityPoolId"], [0]];
    nEd = [3, "com.amazonaws.cognitoidentity", "DescribeIdentityInput", 0, ["IdentityId"], [0]];
    rEd = [3, "com.amazonaws.cognitoidentity", "DescribeIdentityPoolInput", 0, ["IdentityPoolId"], [0]];
    oEd = [-3, "com.amazonaws.cognitoidentity", "DeveloperUserAlreadyRegisteredException", {
      error: "client",
      httpError: 400
    }, ["message"], [0]];
    a8.TypeRegistry.for("com.amazonaws.cognitoidentity").registerError(oEd, TCn);
    sEd = [-3, "com.amazonaws.cognitoidentity", "ExternalServiceException", {
      error: "client",
      httpError: 400
    }, ["message"], [0]];
    a8.TypeRegistry.for("com.amazonaws.cognitoidentity").registerError(sEd, bCn);
    iEd = [3, "com.amazonaws.cognitoidentity", "GetCredentialsForIdentityInput", 0, ["IdentityId", "Logins", "CustomRoleArn"], [0, [() => uLt, 0], 0]];
    aEd = [3, "com.amazonaws.cognitoidentity", "GetCredentialsForIdentityResponse", 0, ["IdentityId", "Credentials"], [0, [() => QTd, 0]]];
    lEd = [3, "com.amazonaws.cognitoidentity", "GetIdentityPoolRolesInput", 0, ["IdentityPoolId"], [0]];
    cEd = [3, "com.amazonaws.cognitoidentity", "GetIdentityPoolRolesResponse", 0, ["IdentityPoolId", "Roles", "RoleMappings"], [0, 128, () => Gci]];
    uEd = [3, "com.amazonaws.cognitoidentity", "GetIdInput", 0, ["AccountId", "IdentityPoolId", "Logins"], [0, 0, [() => uLt, 0]]];
    dEd = [3, "com.amazonaws.cognitoidentity", "GetIdResponse", 0, ["IdentityId"], [0]];
    pEd = [3, "com.amazonaws.cognitoidentity", "GetOpenIdTokenForDeveloperIdentityInput", 0, ["IdentityPoolId", "IdentityId", "Logins", "PrincipalTags", "TokenDuration"], [0, 0, [() => uLt, 0], 128, 1]];
    mEd = [3, "com.amazonaws.cognitoidentity", "GetOpenIdTokenForDeveloperIdentityResponse", 0, ["IdentityId", "Token"], [0, [() => jci, 0]]];
    fEd = [3, "com.amazonaws.cognitoidentity", "GetOpenIdTokenInput", 0, ["IdentityId", "Logins"], [0, [() => uLt, 0]]];
    hEd = [3, "com.amazonaws.cognitoidentity", "GetOpenIdTokenResponse", 0, ["IdentityId", "Token"], [0, [() => jci, 0]]];
    gEd = [3, "com.amazonaws.cognitoidentity", "GetPrincipalTagAttributeMapInput", 0, ["IdentityPoolId", "IdentityProviderName"], [0, 0]];
    yEd = [3, "com.amazonaws.cognitoidentity", "GetPrincipalTagAttributeMapResponse", 0, ["IdentityPoolId", "IdentityProviderName", "UseDefaults", "PrincipalTags"], [0, 0, 2, 128]];
    qci = [3, "com.amazonaws.cognitoidentity", "IdentityDescription", 0, ["IdentityId", "Logins", "CreationDate", "LastModifiedDate"], [0, 64, 4, 4]];
    vCn = [3, "com.amazonaws.cognitoidentity", "IdentityPool", 0, ["IdentityPoolId", "IdentityPoolName", "AllowUnauthenticatedIdentities", "AllowClassicFlow", "SupportedLoginProviders", "DeveloperProviderName", "OpenIdConnectProviderARNs", "CognitoIdentityProviders", "SamlProviderARNs", "IdentityPoolTags"], [0, 0, 2, 2, 128, 0, 64, () => Wci, 64, 128]];
    _Ed = [3, "com.amazonaws.cognitoidentity", "IdentityPoolShortDescription", 0, ["IdentityPoolId", "IdentityPoolName"], [0, 0]];
    bEd = [-3, "com.amazonaws.cognitoidentity", "InternalErrorException", {
      error: "server"
    }, ["message"], [0]];
    a8.TypeRegistry.for("com.amazonaws.cognitoidentity").registerError(bEd, pCn);
    SEd = [-3, "com.amazonaws.cognitoidentity", "InvalidIdentityPoolConfigurationException", {
      error: "client",
      httpError: 400
    }, ["message"], [0]];
    a8.TypeRegistry.for("com.amazonaws.cognitoidentity").registerError(SEd, SCn);
    TEd = [-3, "com.amazonaws.cognitoidentity", "InvalidParameterException", {
      error: "client",
      httpError: 400
    }, ["message"], [0]];
    a8.TypeRegistry.for("com.amazonaws.cognitoidentity").registerError(TEd, mCn);
    EEd = [-3, "com.amazonaws.cognitoidentity", "LimitExceededException", {
      error: "client",
      httpError: 400
    }, ["message"], [0]];
    a8.TypeRegistry.for("com.amazonaws.cognitoidentity").registerError(EEd, fCn);
    vEd = [3, "com.amazonaws.cognitoidentity", "ListIdentitiesInput", 0, ["IdentityPoolId", "MaxResults", "NextToken", "HideDisabled"], [0, 1, 0, 2]];
    wEd = [3, "com.amazonaws.cognitoidentity", "ListIdentitiesResponse", 0, ["IdentityPoolId", "Identities", "NextToken"], [0, () => XEd, 0]];
    CEd = [3, "com.amazonaws.cognitoidentity", "ListIdentityPoolsInput", 0, ["MaxResults", "NextToken"], [1, 0]];
    REd = [3, "com.amazonaws.cognitoidentity", "ListIdentityPoolsResponse", 0, ["IdentityPools", "NextToken"], [() => QEd, 0]];
    xEd = [3, "com.amazonaws.cognitoidentity", "ListTagsForResourceInput", 0, ["ResourceArn"], [0]];
    kEd = [3, "com.amazonaws.cognitoidentity", "ListTagsForResourceResponse", 0, ["Tags"], [128]];
    AEd = [3, "com.amazonaws.cognitoidentity", "LookupDeveloperIdentityInput", 0, ["IdentityPoolId", "IdentityId", "DeveloperUserIdentifier", "MaxResults", "NextToken"], [0, 0, 0, 1, 0]];
    IEd = [3, "com.amazonaws.cognitoidentity", "LookupDeveloperIdentityResponse", 0, ["IdentityId", "DeveloperUserIdentifierList", "NextToken"], [0, 64, 0]];
    PEd = [3, "com.amazonaws.cognitoidentity", "MappingRule", 0, ["Claim", "MatchType", "Value", "RoleARN"], [0, 0, 0, 0]];
    OEd = [3, "com.amazonaws.cognitoidentity", "MergeDeveloperIdentitiesInput", 0, ["SourceUserIdentifier", "DestinationUserIdentifier", "DeveloperProviderName", "IdentityPoolId"], [0, 0, 0, 0]];
    DEd = [3, "com.amazonaws.cognitoidentity", "MergeDeveloperIdentitiesResponse", 0, ["IdentityId"], [0]];
    MEd = [-3, "com.amazonaws.cognitoidentity", "NotAuthorizedException", {
      error: "client",
      httpError: 403
    }, ["message"], [0]];
    a8.TypeRegistry.for("com.amazonaws.cognitoidentity").registerError(MEd, hCn);
    NEd = [-3, "com.amazonaws.cognitoidentity", "ResourceConflictException", {
      error: "client",
      httpError: 409
    }, ["message"], [0]];
    a8.TypeRegistry.for("com.amazonaws.cognitoidentity").registerError(NEd, gCn);
    LEd = [-3, "com.amazonaws.cognitoidentity", "ResourceNotFoundException", {
      error: "client",
      httpError: 404
    }, ["message"], [0]];
    a8.TypeRegistry.for("com.amazonaws.cognitoidentity").registerError(LEd, _Cn);
    FEd = [3, "com.amazonaws.cognitoidentity", "RoleMapping", 0, ["Type", "AmbiguousRoleResolution", "RulesConfiguration"], [0, 0, () => UEd]];
    UEd = [3, "com.amazonaws.cognitoidentity", "RulesConfigurationType", 0, ["Rules"], [() => ZEd]];
    BEd = [3, "com.amazonaws.cognitoidentity", "SetIdentityPoolRolesInput", 0, ["IdentityPoolId", "Roles", "RoleMappings"], [0, 128, () => Gci]];
    $Ed = [3, "com.amazonaws.cognitoidentity", "SetPrincipalTagAttributeMapInput", 0, ["IdentityPoolId", "IdentityProviderName", "UseDefaults", "PrincipalTags"], [0, 0, 2, 128]];
    HEd = [3, "com.amazonaws.cognitoidentity", "SetPrincipalTagAttributeMapResponse", 0, ["IdentityPoolId", "IdentityProviderName", "UseDefaults", "PrincipalTags"], [0, 0, 2, 128]];
    jEd = [3, "com.amazonaws.cognitoidentity", "TagResourceInput", 0, ["ResourceArn", "Tags"], [0, 128]];
    qEd = [3, "com.amazonaws.cognitoidentity", "TagResourceResponse", 0, [], []];
    WEd = [-3, "com.amazonaws.cognitoidentity", "TooManyRequestsException", {
      error: "client",
      httpError: 429
    }, ["message"], [0]];
    a8.TypeRegistry.for("com.amazonaws.cognitoidentity").registerError(WEd, yCn);
    GEd = [3, "com.amazonaws.cognitoidentity", "UnlinkDeveloperIdentityInput", 0, ["IdentityId", "IdentityPoolId", "DeveloperProviderName", "DeveloperUserIdentifier"], [0, 0, 0, 0]];
    VEd = [3, "com.amazonaws.cognitoidentity", "UnlinkIdentityInput", 0, ["IdentityId", "Logins", "LoginsToRemove"], [0, [() => uLt, 0], 64]];
    zEd = [3, "com.amazonaws.cognitoidentity", "UnprocessedIdentityId", 0, ["IdentityId", "ErrorCode"], [0, 0]];
    KEd = [3, "com.amazonaws.cognitoidentity", "UntagResourceInput", 0, ["ResourceArn", "TagKeys"], [0, 64]];
    YEd = [3, "com.amazonaws.cognitoidentity", "UntagResourceResponse", 0, [], []];
    JEd = [-3, "smithy.ts.sdk.synthetic.com.amazonaws.cognitoidentity", "CognitoIdentityServiceException", 0, [], []];
    a8.TypeRegistry.for("smithy.ts.sdk.synthetic.com.amazonaws.cognitoidentity").registerError(JEd, c2);
    Wci = [1, "com.amazonaws.cognitoidentity", "CognitoIdentityProviderList", 0, () => YTd];
    XEd = [1, "com.amazonaws.cognitoidentity", "IdentitiesList", 0, () => qci];
    QEd = [1, "com.amazonaws.cognitoidentity", "IdentityPoolsList", 0, () => _Ed];
    ZEd = [1, "com.amazonaws.cognitoidentity", "MappingRulesList", 0, () => PEd];
    evd = [1, "com.amazonaws.cognitoidentity", "UnprocessedIdentityIdList", 0, () => zEd];
    uLt = [2, "com.amazonaws.cognitoidentity", "LoginsMap", 0, [0, 0], [() => zTd, 0]];
    Gci = [2, "com.amazonaws.cognitoidentity", "RoleMappingMap", 0, 0, () => FEd];
    Vci = [9, "com.amazonaws.cognitoidentity", "CreateIdentityPool", 0, () => XTd, () => vCn];
    zci = [9, "com.amazonaws.cognitoidentity", "DeleteIdentities", 0, () => ZTd, () => eEd];
    Kci = [9, "com.amazonaws.cognitoidentity", "DeleteIdentityPool", 0, () => tEd, () => "unit"];
    Yci = [9, "com.amazonaws.cognitoidentity", "DescribeIdentity", 0, () => nEd, () => qci];
    Jci = [9, "com.amazonaws.cognitoidentity", "DescribeIdentityPool", 0, () => rEd, () => vCn];
    Xci = [9, "com.amazonaws.cognitoidentity", "GetCredentialsForIdentity", 0, () => iEd, () => aEd];
    Qci = [9, "com.amazonaws.cognitoidentity", "GetId", 0, () => uEd, () => dEd];
    Zci = [9, "com.amazonaws.cognitoidentity", "GetIdentityPoolRoles", 0, () => lEd, () => cEd];
    eui = [9, "com.amazonaws.cognitoidentity", "GetOpenIdToken", 0, () => fEd, () => hEd];
    tui = [9, "com.amazonaws.cognitoidentity", "GetOpenIdTokenForDeveloperIdentity", 0, () => pEd, () => mEd];
    nui = [9, "com.amazonaws.cognitoidentity", "GetPrincipalTagAttributeMap", 0, () => gEd, () => yEd];
    rui = [9, "com.amazonaws.cognitoidentity", "ListIdentities", 0, () => vEd, () => wEd];
    oui = [9, "com.amazonaws.cognitoidentity", "ListIdentityPools", 0, () => CEd, () => REd];
    sui = [9, "com.amazonaws.cognitoidentity", "ListTagsForResource", 0, () => xEd, () => kEd];
    iui = [9, "com.amazonaws.cognitoidentity", "LookupDeveloperIdentity", 0, () => AEd, () => IEd];
    aui = [9, "com.amazonaws.cognitoidentity", "MergeDeveloperIdentities", 0, () => OEd, () => DEd];
    lui = [9, "com.amazonaws.cognitoidentity", "SetIdentityPoolRoles", 0, () => BEd, () => "unit"];
    cui = [9, "com.amazonaws.cognitoidentity", "SetPrincipalTagAttributeMap", 0, () => $Ed, () => HEd];
    uui = [9, "com.amazonaws.cognitoidentity", "TagResource", 0, () => jEd, () => qEd];
    dui = [9, "com.amazonaws.cognitoidentity", "UnlinkDeveloperIdentity", 0, () => GEd, () => "unit"];
    pui = [9, "com.amazonaws.cognitoidentity", "UnlinkIdentity", 0, () => VEd, () => "unit"];
    mui = [9, "com.amazonaws.cognitoidentity", "UntagResource", 0, () => KEd, () => YEd];
    fui = [9, "com.amazonaws.cognitoidentity", "UpdateIdentityPool", 0, () => vCn, () => vCn];
  });
  var hui;
  var K3r;
  var Y3r = __lazy(() => {
    bb();
    RC();
    JR();
    hui = __toESM(_o(), 1);
    K3r = class K3r extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [hui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "CreateIdentityPool", {}).n("CognitoIdentityClient", "CreateIdentityPoolCommand").sc(Vci).build() {};
  });
  var gui;
  var J3r;
  var X3r = __lazy(() => {
    bb();
    RC();
    JR();
    gui = __toESM(_o(), 1);
    J3r = class J3r extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [gui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "DeleteIdentities", {}).n("CognitoIdentityClient", "DeleteIdentitiesCommand").sc(zci).build() {};
  });
  var yui;
  var Q3r;
  var Z3r = __lazy(() => {
    bb();
    RC();
    JR();
    yui = __toESM(_o(), 1);
    Q3r = class Q3r extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [yui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "DeleteIdentityPool", {}).n("CognitoIdentityClient", "DeleteIdentityPoolCommand").sc(Kci).build() {};
  });
  var _ui;
  var e4r;
  var t4r = __lazy(() => {
    bb();
    RC();
    JR();
    _ui = __toESM(_o(), 1);
    e4r = class e4r extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [_ui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "DescribeIdentity", {}).n("CognitoIdentityClient", "DescribeIdentityCommand").sc(Yci).build() {};
  });
  var bui;
  var n4r;
  var r4r = __lazy(() => {
    bb();
    RC();
    JR();
    bui = __toESM(_o(), 1);
    n4r = class n4r extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [bui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "DescribeIdentityPool", {}).n("CognitoIdentityClient", "DescribeIdentityPoolCommand").sc(Jci).build() {};
  });
  var Sui;
  var GetCredentialsForIdentityCommand;
  var o4r = __lazy(() => {
    bb();
    RC();
    JR();
    Sui = __toESM(_o(), 1);
    GetCredentialsForIdentityCommand = class dLt extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [Sui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "GetCredentialsForIdentity", {}).n("CognitoIdentityClient", "GetCredentialsForIdentityCommand").sc(Xci).build() {};
  });
  var Tui;
  var GetIdCommand;
  var s4r = __lazy(() => {
    bb();
    RC();
    JR();
    Tui = __toESM(_o(), 1);
    GetIdCommand = class pLt extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [Tui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "GetId", {}).n("CognitoIdentityClient", "GetIdCommand").sc(Qci).build() {};
  });
  var Eui;
  var i4r;
  var a4r = __lazy(() => {
    bb();
    RC();
    JR();
    Eui = __toESM(_o(), 1);
    i4r = class i4r extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [Eui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "GetIdentityPoolRoles", {}).n("CognitoIdentityClient", "GetIdentityPoolRolesCommand").sc(Zci).build() {};
  });
  var vui;
  var l4r;
  var c4r = __lazy(() => {
    bb();
    RC();
    JR();
    vui = __toESM(_o(), 1);
    l4r = class l4r extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [vui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "GetOpenIdToken", {}).n("CognitoIdentityClient", "GetOpenIdTokenCommand").sc(eui).build() {};
  });
  var wui;
  var u4r;
  var d4r = __lazy(() => {
    bb();
    RC();
    JR();
    wui = __toESM(_o(), 1);
    u4r = class u4r extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [wui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "GetOpenIdTokenForDeveloperIdentity", {}).n("CognitoIdentityClient", "GetOpenIdTokenForDeveloperIdentityCommand").sc(tui).build() {};
  });
  var Cui;
  var p4r;
  var m4r = __lazy(() => {
    bb();
    RC();
    JR();
    Cui = __toESM(_o(), 1);
    p4r = class p4r extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [Cui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "GetPrincipalTagAttributeMap", {}).n("CognitoIdentityClient", "GetPrincipalTagAttributeMapCommand").sc(nui).build() {};
  });
  var Rui;
  var f4r;
  var h4r = __lazy(() => {
    bb();
    RC();
    JR();
    Rui = __toESM(_o(), 1);
    f4r = class f4r extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [Rui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "ListIdentities", {}).n("CognitoIdentityClient", "ListIdentitiesCommand").sc(rui).build() {};
  });
  var xui;
  var mLt;
  var CCn = __lazy(() => {
    bb();
    RC();
    JR();
    xui = __toESM(_o(), 1);
    mLt = class mLt extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [xui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "ListIdentityPools", {}).n("CognitoIdentityClient", "ListIdentityPoolsCommand").sc(oui).build() {};
  });
  var kui;
  var g4r;
  var y4r = __lazy(() => {
    bb();
    RC();
    JR();
    kui = __toESM(_o(), 1);
    g4r = class g4r extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [kui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "ListTagsForResource", {}).n("CognitoIdentityClient", "ListTagsForResourceCommand").sc(sui).build() {};
  });
  var Aui;
  var _4r;
  var b4r = __lazy(() => {
    bb();
    RC();
    JR();
    Aui = __toESM(_o(), 1);
    _4r = class _4r extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [Aui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "LookupDeveloperIdentity", {}).n("CognitoIdentityClient", "LookupDeveloperIdentityCommand").sc(iui).build() {};
  });
  var Iui;
  var S4r;
  var T4r = __lazy(() => {
    bb();
    RC();
    JR();
    Iui = __toESM(_o(), 1);
    S4r = class S4r extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [Iui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "MergeDeveloperIdentities", {}).n("CognitoIdentityClient", "MergeDeveloperIdentitiesCommand").sc(aui).build() {};
  });
  var Pui;
  var E4r;
  var v4r = __lazy(() => {
    bb();
    RC();
    JR();
    Pui = __toESM(_o(), 1);
    E4r = class E4r extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [Pui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "SetIdentityPoolRoles", {}).n("CognitoIdentityClient", "SetIdentityPoolRolesCommand").sc(lui).build() {};
  });
  var Oui;
  var w4r;
  var C4r = __lazy(() => {
    bb();
    RC();
    JR();
    Oui = __toESM(_o(), 1);
    w4r = class w4r extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [Oui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "SetPrincipalTagAttributeMap", {}).n("CognitoIdentityClient", "SetPrincipalTagAttributeMapCommand").sc(cui).build() {};
  });
  var Dui;
  var R4r;
  var x4r = __lazy(() => {
    bb();
    RC();
    JR();
    Dui = __toESM(_o(), 1);
    R4r = class R4r extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [Dui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "TagResource", {}).n("CognitoIdentityClient", "TagResourceCommand").sc(uui).build() {};
  });
  var Mui;
  var k4r;
  var A4r = __lazy(() => {
    bb();
    RC();
    JR();
    Mui = __toESM(_o(), 1);
    k4r = class k4r extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [Mui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "UnlinkDeveloperIdentity", {}).n("CognitoIdentityClient", "UnlinkDeveloperIdentityCommand").sc(dui).build() {};
  });
  var Nui;
  var I4r;
  var P4r = __lazy(() => {
    bb();
    RC();
    JR();
    Nui = __toESM(_o(), 1);
    I4r = class I4r extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [Nui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "UnlinkIdentity", {}).n("CognitoIdentityClient", "UnlinkIdentityCommand").sc(pui).build() {};
  });
  var Lui;
  var O4r;
  var D4r = __lazy(() => {
    bb();
    RC();
    JR();
    Lui = __toESM(_o(), 1);
    O4r = class O4r extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [Lui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "UntagResource", {}).n("CognitoIdentityClient", "UntagResourceCommand").sc(mui).build() {};
  });
  var Fui;
  var M4r;
  var N4r = __lazy(() => {
    bb();
    RC();
    JR();
    Fui = __toESM(_o(), 1);
    M4r = class M4r extends Command_export5.classBuilder().ep(Np).m(function (e, t, n, r) {
      return [Fui.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSCognitoIdentityService", "UpdateIdentityPool", {}).n("CognitoIdentityClient", "UpdateIdentityPoolCommand").sc(fui).build() {};
  });
  var tvd;
  var Uui;
  var Bui = __lazy(() => {
    bb();
    dCn();
    Y3r();
    X3r();
    Z3r();
    t4r();
    r4r();
    o4r();
    s4r();
    a4r();
    c4r();
    d4r();
    m4r();
    h4r();
    CCn();
    y4r();
    b4r();
    T4r();
    v4r();
    C4r();
    x4r();
    A4r();
    P4r();
    D4r();
    N4r();
    tvd = {
      CreateIdentityPoolCommand: K3r,
      DeleteIdentitiesCommand: J3r,
      DeleteIdentityPoolCommand: Q3r,
      DescribeIdentityCommand: e4r,
      DescribeIdentityPoolCommand: n4r,
      GetCredentialsForIdentityCommand: GetCredentialsForIdentityCommand,
      GetIdCommand: GetIdCommand,
      GetIdentityPoolRolesCommand: i4r,
      GetOpenIdTokenCommand: l4r,
      GetOpenIdTokenForDeveloperIdentityCommand: u4r,
      GetPrincipalTagAttributeMapCommand: p4r,
      ListIdentitiesCommand: f4r,
      ListIdentityPoolsCommand: mLt,
      ListTagsForResourceCommand: g4r,
      LookupDeveloperIdentityCommand: _4r,
      MergeDeveloperIdentitiesCommand: S4r,
      SetIdentityPoolRolesCommand: E4r,
      SetPrincipalTagAttributeMapCommand: w4r,
      TagResourceCommand: R4r,
      UnlinkDeveloperIdentityCommand: k4r,
      UnlinkIdentityCommand: I4r,
      UntagResourceCommand: O4r,
      UpdateIdentityPoolCommand: M4r
    };
    Uui = class Uui extends CognitoIdentityClient {};
    createAggregatedClient_export5(tvd, Uui);
  });
  var $ui = __lazy(() => {
    Y3r();
    X3r();
    Z3r();
    t4r();
    r4r();
    o4r();
    s4r();
    a4r();
    c4r();
    d4r();
    m4r();
    h4r();
    CCn();
    y4r();
    b4r();
    T4r();
    v4r();
    C4r();
    x4r();
    A4r();
    P4r();
    D4r();
    N4r();
  });
  var Hui = () => {};
  var jui;
  var Iyg;
  var qui = __lazy(() => {
    dCn();
    CCn();
    jui = __toESM(Od(), 1);
    Iyg = jui.createPaginator(CognitoIdentityClient, mLt, "NextToken", "NextToken", "MaxResults");
  });
  var Wui = __lazy(() => {
    Hui();
    qui();
  });
  var Gui = () => {};
  var Vui = __lazy(() => {
    dCn();
    Bui();
    $ui();
    Wui();
    Gui();
    z3r();
  });
  var L4r = {};