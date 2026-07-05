  __export(Rk, {
    withBaseException: () => withBaseException_export4,
    throwDefaultError: () => throwDefaultError_export4,
    take: () => take_export4,
    serializeFloat: () => serializeFloat_export4,
    serializeDateTime: () => serializeDateTime_export4,
    resolvedPath: () => Woi.resolvedPath,
    resolveDefaultRuntimeConfig: () => resolveDefaultRuntimeConfig_export4,
    map: () => map_export6,
    loadConfigsForDefaultMode: () => loadConfigsForDefaultMode_export4,
    isSerializableHeaderValue: () => isSerializableHeaderValue_export4,
    getValueFromTextNode: () => getValueFromTextNode_export4,
    getDefaultExtensionConfiguration: () => getDefaultExtensionConfiguration_export4,
    getDefaultExtensionConfiguration: () => getDefaultExtensionConfiguration_export4,
    getArrayIfSingleItem: () => getArrayIfSingleItem_export4,
    extendedEncodeURIComponent: () => Ooi.extendedEncodeURIComponent,
    emitWarningIfUnsupportedVersion: () => emitWarningIfUnsupportedVersion_export4,
    decorateServiceException: () => decorateServiceException_export4,
    createAggregatedClient: () => createAggregatedClient_export4,
    convertMap: () => convertMap_export4,
    collectBody: () => iri.collectBody,
    _json: () => _json_export4,
    ServiceException: () => ServiceException_export4,
    SENSITIVE_STRING: () => "***SensitiveInformation***",
    NoOpLogger: () => NoOpLogger_export4,
    Command: () => Command_export4,
    Client: () => Client_export4
  });
  var VD = __lazy(() => {
    sri();
    ari();
    koi();
    Ioi();
    p3r();
    Doi();
    $oi();
    Goi();
    __reExport(Rk, __toESM(yW(), 1), module.exports);
  });
  function ISd(e) {
    return {
      schemeId: "aws.auth#sigv4",
      signingProperties: {
        name: "sts",
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
  function Voi(e) {
    return {
      schemeId: "smithy.api#noAuth"
    };
  }
  var zoi;
  var K1t;
  var Koi = async (e, t, n) => ({
    operation: K1t.getSmithyContext(t).operation,
    region: (await K1t.normalizeProvider(e.region)()) || (() => {
      throw Error("expected `region` to be configured for `aws.auth#sigv4`");
    })()
  });
  var Yoi = e => {
    let t = [];
    switch (e.operation) {
      case "AssumeRoleWithSAML":
        {
          t.push(Voi(e));
          break;
        }
      case "AssumeRoleWithWebIdentity":
        {
          t.push(Voi(e));
          break;
        }
      default:
        t.push(ISd(e));
    }
    return t;
  };
  var PSd = e => Object.assign(e, {
    stsClientCtor: STSClient
  });
  var Joi = e => {
    let t = PSd(e);
    let n = zoi.resolveAwsSdkSigV4Config(t);
    return Object.assign(n, {
      authSchemePreference: K1t.normalizeProvider(e.authSchemePreference ?? [])
    });
  };
  var y3r = __lazy(() => {
    Y1t();
    zoi = __toESM(nw(), 1);
    K1t = __toESM(zB(), 1);
  });
  var Xoi = e => Object.assign(e, {
    useDualstackEndpoint: e.useDualstackEndpoint ?? false,
    useFipsEndpoint: e.useFipsEndpoint ?? false,
    useGlobalEndpoint: e.useGlobalEndpoint ?? false,
    defaultSigningName: "sts"
  });
  var VA;
  var s8 = __lazy(() => {
    VA = {
      UseGlobalEndpoint: {
        type: "builtInParams",
        name: "useGlobalEndpoint"
      },
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
  var Zoi;
  var Qoi = __lazy(() => {
    Zoi = {
      name: "@aws-sdk/client-sts",
      description: "AWS SDK for JavaScript Sts Client for Node.js, Browser and React Native",
      version: "3.936.0",
      scripts: {
        build: "concurrently 'yarn:build:cjs' 'yarn:build:es' 'yarn:build:types'",
        "build:cjs": "node ../../scripts/compilation/inline client-sts",
        "build:es": "tsc -p tsconfig.es.json",
        "build:include:deps": "lerna run --scope $npm_package_name --include-dependencies build",
        "build:types": "rimraf ./dist-types tsconfig.types.tsbuildinfo && tsc -p tsconfig.types.json",
        "build:types:downlevel": "downlevel-dts dist-types dist-types/ts3.4",
        clean: "rimraf ./dist-* && rimraf *.tsbuildinfo",
        "extract:docs": "api-extractor run --local",
        "generate:client": "node ../../scripts/generate-clients/single-service --solo sts",
        test: "yarn g:vitest run",
        "test:watch": "yarn g:vitest watch"
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
      homepage: "https://github.com/aws/aws-sdk-js-v3/tree/main/clients/client-sts",
      repository: {
        type: "git",
        url: "https://github.com/aws/aws-sdk-js-v3.git",
        directory: "clients/client-sts"
      }
    };
  });
  var esi = e => typeof ArrayBuffer === "function" && e instanceof ArrayBuffer || Object.prototype.toString.call(e) === "[object ArrayBuffer]";
  var Rwn;
  var tsi = (e, t = 0, n = e.byteLength - t) => {
    if (!esi(e)) {
      throw TypeError(`The "input" argument must be ArrayBuffer. Received type ${typeof e} (${e})`);
    }
    return Rwn.Buffer.from(e, t, n);
  };
  var nsi = (e, t) => {
    if (typeof e !== "string") {
      throw TypeError(`The "input" argument must be of type string. Received type ${typeof e} (${e})`);
    }
    return t ? Rwn.Buffer.from(e, t) : Rwn.Buffer.from(e);
  };
  var _3r = __lazy(() => {
    Rwn = require("buffer");
  });
  var DSd;
  var rsi = e => {
    if (e.length * 3 % 4 !== 0) {
      throw TypeError("Incorrect padding on base64 string.");
    }
    if (!DSd.exec(e)) {
      throw TypeError("Invalid base64 string.");
    }
    let t = nsi(e, "base64");
    return new Uint8Array(t.buffer, t.byteOffset, t.byteLength);
  };
  var osi = __lazy(() => {
    _3r();
    DSd = /^[A-Za-z0-9+/]*={0,2}$/;
  });
  var ssi;
  var isi = e => {
    let t;
    if (typeof e === "string") {
      t = ssi.fromUtf8(e);
    } else {
      t = e;
    }
    if (typeof t !== "object" || typeof t.byteOffset !== "number" || typeof t.byteLength !== "number") {
      throw Error("@smithy/util-base64: toBase64 encoder function only accepts string | Uint8Array.");
    }
    return tsi(t.buffer, t.byteOffset, t.byteLength).toString("base64");
  };
  var asi = __lazy(() => {
    _3r();
    ssi = __toESM(jT(), 1);
  });
  var lsi = __lazy(() => {
    osi();
    asi();
  });
  var csi;
  var b3r;
  var _si;
  var usi;
  var CF;
  var dsi;
  var bsi;
  var Ssi;
  var l2;
  var i8;
  var psi;
  var Tsi;
  var Esi;
  var msi;
  var vsi;
  var fsi;
  var hsi;
  var gsi;
  var ysi;
  var MSd;
  var Rsi;
  var Uot;
  var NSd;
  var xsi = (e, t = {}) => NSd.get(e, () => Uot.resolveEndpoint(MSd, {
    endpointParams: e,
    logger: t.logger
  }));
  var ksi = __lazy(() => {
    Rsi = __toESM(Ale(), 1);
    Uot = __toESM(Lte(), 1);
    NSd = new Uot.EndpointCache({
      size: 50,
      params: ["Endpoint", "Region", "UseDualStack", "UseFIPS", "UseGlobalEndpoint"]
    });
    Uot.customEndpointFunctions.aws = Rsi.awsEndpointFunctions;
  });
  var Asi;
  var Isi;
  var Psi;
  var Osi;
  var xwn;
  var Dsi = e => ({
    apiVersion: "2011-06-15",
    base64Decoder: e?.base64Decoder ?? rsi,
    base64Encoder: e?.base64Encoder ?? isi,
    disableHostPrefix: e?.disableHostPrefix ?? false,
    endpointProvider: e?.endpointProvider ?? xsi,
    extensions: e?.extensions ?? [],
    httpAuthSchemeProvider: e?.httpAuthSchemeProvider ?? Yoi,
    httpAuthSchemes: e?.httpAuthSchemes ?? [{
      schemeId: "aws.auth#sigv4",
      identityProvider: t => t.getIdentityProvider("aws.auth#sigv4"),
      signer: new Asi.AwsSdkSigV4Signer()
    }, {
      schemeId: "smithy.api#noAuth",
      identityProvider: t => t.getIdentityProvider("smithy.api#noAuth") || (async () => ({})),
      signer: new Psi.NoAuthSigner()
    }],
    logger: e?.logger ?? new NoOpLogger_export4(),
    protocol: e?.protocol ?? new Isi.AwsQueryProtocol({
      defaultNamespace: "com.amazonaws.sts",
      xmlNamespace: "https://sts.amazonaws.com/doc/2011-06-15/",
      version: "2011-06-15"
    }),
    serviceId: e?.serviceId ?? "STS",
    urlParser: e?.urlParser ?? Osi.parseUrl,
    utf8Decoder: e?.utf8Decoder ?? xwn.fromUtf8,
    utf8Encoder: e?.utf8Encoder ?? xwn.toUtf8
  });
  var Msi = __lazy(() => {
    VD();
    lsi();
    y3r();
    ksi();
    Asi = __toESM(nw(), 1);
    Isi = __toESM(r_e(), 1);
    Psi = __toESM(Od(), 1);
    Osi = __toESM(bY(), 1);
    xwn = __toESM(jT(), 1);
  });
  var Bot;
  var kwn;
  var s0e;
  var Nsi;
  var Lsi;
  var Awn;
  var o0e;
  var Iwn;
  var Fsi;
  var Usi;
  var Bsi;
  var $si = e => {
    emitWarningIfUnsupportedVersion_export4(process.version);
    let t = Bsi.resolveDefaultsModeConfig(e);
    let n = () => t().then(loadConfigsForDefaultMode_export4);
    let r = Dsi(e);
    Bot.emitWarningIfUnsupportedVersion(process.version);
    let o = {
      profile: e?.profile,
      logger: r.logger
    };
    return {
      ...r,
      ...e,
      runtime: "node",
      defaultsMode: t,
      authSchemePreference: e?.authSchemePreference ?? o0e.loadConfig(Bot.NODE_AUTH_SCHEME_PREFERENCE_OPTIONS, o),
      bodyLengthChecker: e?.bodyLengthChecker ?? Fsi.calculateBodyLength,
      credentialDefaultProvider: e?.credentialDefaultProvider ?? defaultProvider,
      defaultUserAgentProvider: e?.defaultUserAgentProvider ?? kwn.createDefaultUserAgentProvider({
        serviceId: r.serviceId,
        clientVersion: Zoi.version
      }),
      httpAuthSchemes: e?.httpAuthSchemes ?? [{
        schemeId: "aws.auth#sigv4",
        identityProvider: s => s.getIdentityProvider("aws.auth#sigv4") || (async i => await defaultProvider(i?.__config || {})()),
        signer: new Bot.AwsSdkSigV4Signer()
      }, {
        schemeId: "smithy.api#noAuth",
        identityProvider: s => s.getIdentityProvider("smithy.api#noAuth") || (async () => ({})),
        signer: new Nsi.NoAuthSigner()
      }],
      maxAttempts: e?.maxAttempts ?? o0e.loadConfig(Awn.NODE_MAX_ATTEMPT_CONFIG_OPTIONS, e),
      region: e?.region ?? o0e.loadConfig(s0e.NODE_REGION_CONFIG_OPTIONS, {
        ...s0e.NODE_REGION_CONFIG_FILE_OPTIONS,
        ...o
      }),
      requestHandler: Iwn.NodeHttpHandler.create(e?.requestHandler ?? n),
      retryMode: e?.retryMode ?? o0e.loadConfig({
        ...Awn.NODE_RETRY_MODE_CONFIG_OPTIONS,
        default: async () => (await n()).retryMode || Usi.DEFAULT_RETRY_MODE
      }, e),
      sha256: e?.sha256 ?? Lsi.Hash.bind(null, "sha256"),
      streamCollector: e?.streamCollector ?? Iwn.streamCollector,
      useDualstackEndpoint: e?.useDualstackEndpoint ?? o0e.loadConfig(s0e.NODE_USE_DUALSTACK_ENDPOINT_CONFIG_OPTIONS, o),
      useFipsEndpoint: e?.useFipsEndpoint ?? o0e.loadConfig(s0e.NODE_USE_FIPS_ENDPOINT_CONFIG_OPTIONS, o),
      userAgentAppId: e?.userAgentAppId ?? o0e.loadConfig(kwn.NODE_APP_ID_CONFIG_OPTIONS, o)
    };
  };
  var Hsi = __lazy(() => {
    Qoi();
    Xje();
    Msi();
    VD();
    VD();
    Bot = __toESM(nw(), 1);
    kwn = __toESM(Zye(), 1);
    s0e = __toESM(HA(), 1);
    Nsi = __toESM(Od(), 1);
    Lsi = __toESM(e_e(), 1);
    Awn = __toESM(yF(), 1);
    o0e = __toESM(VB(), 1);
    Iwn = __toESM(hW(), 1);
    Fsi = __toESM(t_e(), 1);
    Usi = __toESM(Ole(), 1);
    Bsi = __toESM(s_e(), 1);
  });
  var jsi = e => ({
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
  var qsi = e => ({
    httpHandler: e.httpHandler()
  });
  var Wsi = () => {};
  var Gsi = () => {};
  var Vsi = () => {};
  var zsi = () => {};
  var Ksi = __lazy(() => {
    Wsi();
    Gsi();
    Vsi();
    zsi();
  });
  var Ysi = e => {
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
  var Jsi = e => ({
    httpAuthSchemes: e.httpAuthSchemes(),
    httpAuthSchemeProvider: e.httpAuthSchemeProvider(),
    credentials: e.credentials()
  });
  var Pwn;
  var Xsi = (e, t) => {
    let n = Object.assign(Pwn.getAwsRegionExtensionConfiguration(e), getDefaultExtensionConfiguration_export4(e), jsi(e), Ysi(e));
    t.forEach(r => r.configure(n));
    return Object.assign(e, Pwn.resolveAwsRegionExtensionConfiguration(n), resolveDefaultRuntimeConfig_export4(n), qsi(n), Jsi(n));
  };
  var Qsi = __lazy(() => {
    Ksi();
    VD();
    Pwn = __toESM(Xte(), 1);
  });
  var Own;
  var Zsi;
  var eii;
  var Dwn;
  var tii;
  var $ot;
  var nii;
  var rii;
  var oii;
  var Mwn;
  var STSClient;
  var Y1t = __lazy(() => {
    VD();
    y3r();
    s8();
    Hsi();
    Qsi();
    Own = __toESM(qye(), 1);
    Zsi = __toESM(Wye(), 1);
    eii = __toESM(Gye(), 1);
    Dwn = __toESM(Ple(), 1);
    tii = __toESM(HA(), 1);
    $ot = __toESM(Od(), 1);
    nii = __toESM(qT(), 1);
    rii = __toESM(Xye(), 1);
    oii = __toESM(_o(), 1);
    Mwn = __toESM(yF(), 1);
    STSClient = class f_e extends Client_export4 {
      config;
      constructor(...[e]) {
        let t = $si(e || {});
        super(t);
        this.initConfig = t;
        let n = Xoi(t);
        let r = Dwn.resolveUserAgentConfig(n);
        let o = Mwn.resolveRetryConfig(r);
        let s = tii.resolveRegionConfig(o);
        let i = Own.resolveHostHeaderConfig(s);
        let a = oii.resolveEndpointConfig(i);
        let l = Joi(a);
        let c = Xsi(l, e?.extensions || []);
        this.config = c;
        this.middlewareStack.use(nii.getSchemaSerdePlugin(this.config));
        this.middlewareStack.use(Dwn.getUserAgentPlugin(this.config));
        this.middlewareStack.use(Mwn.getRetryPlugin(this.config));
        this.middlewareStack.use(rii.getContentLengthPlugin(this.config));
        this.middlewareStack.use(Own.getHostHeaderPlugin(this.config));
        this.middlewareStack.use(Zsi.getLoggerPlugin(this.config));
        this.middlewareStack.use(eii.getRecursionDetectionPlugin(this.config));
        this.middlewareStack.use($ot.getHttpAuthSchemeEndpointRuleSetPlugin(this.config, {
          httpAuthSchemeParametersProvider: Koi,
          identityProviderConfigProvider: async u => new $ot.DefaultIdentityProviderConfig({
            "aws.auth#sigv4": u.credentials
          })
        }));
        this.middlewareStack.use($ot.getHttpSigningPlugin(this.config));
      }
      destroy() {
        super.destroy();
      }
    };
  });
  var STSServiceException;
  var Nwn = __lazy(() => {
    VD();
    STSServiceException = class zD extends ServiceException_export4 {
      constructor(e) {
        super(e);
        Object.setPrototypeOf(this, zD.prototype);
      }
    };
  });
  var ExpiredTokenException;
  var MalformedPolicyDocumentException;
  var PackedPolicyTooLargeException;
  var RegionDisabledException;
  var IDPRejectedClaimException;
  var InvalidIdentityTokenException;
  var IDPCommunicationErrorException;
  var InvalidAuthorizationMessageException;
  var ExpiredTradeInTokenException;
  var JWTPayloadSizeExceededException;
  var OutboundWebIdentityFederationDisabledException;
  var SessionDurationEscalationException;
  var S3r = __lazy(() => {
    Nwn();
    ExpiredTokenException = class J1t extends STSServiceException {
      name = "ExpiredTokenException";
      $fault = "client";
      constructor(e) {
        super({
          name: "ExpiredTokenException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, J1t.prototype);
      }
    };
    MalformedPolicyDocumentException = class X1t extends STSServiceException {
      name = "MalformedPolicyDocumentException";
      $fault = "client";
      constructor(e) {
        super({
          name: "MalformedPolicyDocumentException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, X1t.prototype);
      }
    };
    PackedPolicyTooLargeException = class Q1t extends STSServiceException {
      name = "PackedPolicyTooLargeException";
      $fault = "client";
      constructor(e) {
        super({
          name: "PackedPolicyTooLargeException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, Q1t.prototype);
      }
    };
    RegionDisabledException = class Z1t extends STSServiceException {
      name = "RegionDisabledException";
      $fault = "client";
      constructor(e) {
        super({
          name: "RegionDisabledException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, Z1t.prototype);
      }
    };
    IDPRejectedClaimException = class eLt extends STSServiceException {
      name = "IDPRejectedClaimException";
      $fault = "client";
      constructor(e) {
        super({
          name: "IDPRejectedClaimException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, eLt.prototype);
      }
    };
    InvalidIdentityTokenException = class tLt extends STSServiceException {
      name = "InvalidIdentityTokenException";
      $fault = "client";
      constructor(e) {
        super({
          name: "InvalidIdentityTokenException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, tLt.prototype);
      }
    };
    IDPCommunicationErrorException = class nLt extends STSServiceException {
      name = "IDPCommunicationErrorException";
      $fault = "client";
      constructor(e) {
        super({
          name: "IDPCommunicationErrorException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, nLt.prototype);
      }
    };
    InvalidAuthorizationMessageException = class rLt extends STSServiceException {
      name = "InvalidAuthorizationMessageException";
      $fault = "client";
      constructor(e) {
        super({
          name: "InvalidAuthorizationMessageException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, rLt.prototype);
      }
    };
    ExpiredTradeInTokenException = class oLt extends STSServiceException {
      name = "ExpiredTradeInTokenException";
      $fault = "client";
      constructor(e) {
        super({
          name: "ExpiredTradeInTokenException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, oLt.prototype);
      }
    };
    JWTPayloadSizeExceededException = class sLt extends STSServiceException {
      name = "JWTPayloadSizeExceededException";
      $fault = "client";
      constructor(e) {
        super({
          name: "JWTPayloadSizeExceededException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, sLt.prototype);
      }
    };
    OutboundWebIdentityFederationDisabledException = class iLt extends STSServiceException {
      name = "OutboundWebIdentityFederationDisabledException";
      $fault = "client";
      constructor(e) {
        super({
          name: "OutboundWebIdentityFederationDisabledException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, iLt.prototype);
      }
    };
    SessionDurationEscalationException = class aLt extends STSServiceException {
      name = "SessionDurationEscalationException";
      $fault = "client";
      constructor(e) {
        super({
          name: "SessionDurationEscalationException",
          $fault: "client",
          ...e
        });
        Object.setPrototypeOf(this, aLt.prototype);
      }
    };
  });
  var EW;
  var LSd;
  var FSd;
  var USd;
  var BSd;
  var $Sd;
  var T3r;
  var HSd;
  var jSd;
  var qSd;
  var WSd;
  var GSd;
  var VSd;
  var zSd;
  var KSd;
  var yqe;
  var YSd;
  var JSd;
  var XSd;
  var QSd;
  var ZSd;
  var eTd;
  var tTd;
  var nTd;
  var rTd;
  var oTd;
  var sTd;
  var iTd;
  var aTd;
  var lTd;
  var cTd;
  var uTd;
  var dTd;
  var pTd;
  var mTd;
  var fTd;
  var hTd;
  var gTd;
  var yTd;
  var _Td;
  var bTd;
  var sii;
  var STd;
  var TTd;
  var ETd;
  var vTd;
  var wTd;
  var Lwn;
  var CTd;
  var E3r;
  var iii;
  var aii;
  var lii;
  var cii;
  var uii;
  var dii;
  var pii;
  var mii;
  var fii;
  var hii;
  var gii;
  var FY = __lazy(() => {
    S3r();
    Nwn();
    EW = __toESM(qT(), 1);
    LSd = [0, "com.amazonaws.sts", "accessKeySecretType", 8, 0];
    FSd = [0, "com.amazonaws.sts", "clientTokenType", 8, 0];
    USd = [0, "com.amazonaws.sts", "SAMLAssertionType", 8, 0];
    BSd = [0, "com.amazonaws.sts", "tradeInTokenType", 8, 0];
    $Sd = [0, "com.amazonaws.sts", "webIdentityTokenType", 8, 0];
    T3r = [3, "com.amazonaws.sts", "AssumedRoleUser", 0, ["AssumedRoleId", "Arn"], [0, 0]];
    HSd = [3, "com.amazonaws.sts", "AssumeRoleRequest", 0, ["RoleArn", "RoleSessionName", "PolicyArns", "Policy", "DurationSeconds", "Tags", "TransitiveTagKeys", "ExternalId", "SerialNumber", "TokenCode", "SourceIdentity", "ProvidedContexts"], [0, 0, () => Lwn, 0, 1, () => E3r, 64, 0, 0, 0, 0, () => CTd]];
    jSd = [3, "com.amazonaws.sts", "AssumeRoleResponse", 0, ["Credentials", "AssumedRoleUser", "PackedPolicySize", "SourceIdentity"], [[() => yqe, 0], () => T3r, 1, 0]];
    qSd = [3, "com.amazonaws.sts", "AssumeRoleWithSAMLRequest", 0, ["RoleArn", "PrincipalArn", "SAMLAssertion", "PolicyArns", "Policy", "DurationSeconds"], [0, 0, [() => USd, 0], () => Lwn, 0, 1]];
    WSd = [3, "com.amazonaws.sts", "AssumeRoleWithSAMLResponse", 0, ["Credentials", "AssumedRoleUser", "PackedPolicySize", "Subject", "SubjectType", "Issuer", "Audience", "NameQualifier", "SourceIdentity"], [[() => yqe, 0], () => T3r, 1, 0, 0, 0, 0, 0, 0]];
    GSd = [3, "com.amazonaws.sts", "AssumeRoleWithWebIdentityRequest", 0, ["RoleArn", "RoleSessionName", "WebIdentityToken", "ProviderId", "PolicyArns", "Policy", "DurationSeconds"], [0, 0, [() => FSd, 0], 0, () => Lwn, 0, 1]];
    VSd = [3, "com.amazonaws.sts", "AssumeRoleWithWebIdentityResponse", 0, ["Credentials", "SubjectFromWebIdentityToken", "AssumedRoleUser", "PackedPolicySize", "Provider", "Audience", "SourceIdentity"], [[() => yqe, 0], 0, () => T3r, 1, 0, 0, 0]];
    zSd = [3, "com.amazonaws.sts", "AssumeRootRequest", 0, ["TargetPrincipal", "TaskPolicyArn", "DurationSeconds"], [0, () => sii, 1]];
    KSd = [3, "com.amazonaws.sts", "AssumeRootResponse", 0, ["Credentials", "SourceIdentity"], [[() => yqe, 0], 0]];
    yqe = [3, "com.amazonaws.sts", "Credentials", 0, ["AccessKeyId", "SecretAccessKey", "SessionToken", "Expiration"], [0, [() => LSd, 0], 0, 4]];
    YSd = [3, "com.amazonaws.sts", "DecodeAuthorizationMessageRequest", 0, ["EncodedMessage"], [0]];
    JSd = [3, "com.amazonaws.sts", "DecodeAuthorizationMessageResponse", 0, ["DecodedMessage"], [0]];
    XSd = [-3, "com.amazonaws.sts", "ExpiredTokenException", {
      error: "client",
      httpError: 400,
      awsQueryError: ["ExpiredTokenException", 400]
    }, ["message"], [0]];
    EW.TypeRegistry.for("com.amazonaws.sts").registerError(XSd, ExpiredTokenException);
    QSd = [-3, "com.amazonaws.sts", "ExpiredTradeInTokenException", {
      error: "client",
      httpError: 400,
      awsQueryError: ["ExpiredTradeInTokenException", 400]
    }, ["message"], [0]];
    EW.TypeRegistry.for("com.amazonaws.sts").registerError(QSd, ExpiredTradeInTokenException);
    ZSd = [3, "com.amazonaws.sts", "FederatedUser", 0, ["FederatedUserId", "Arn"], [0, 0]];
    eTd = [3, "com.amazonaws.sts", "GetAccessKeyInfoRequest", 0, ["AccessKeyId"], [0]];
    tTd = [3, "com.amazonaws.sts", "GetAccessKeyInfoResponse", 0, ["Account"], [0]];
    nTd = [3, "com.amazonaws.sts", "GetCallerIdentityRequest", 0, [], []];
    rTd = [3, "com.amazonaws.sts", "GetCallerIdentityResponse", 0, ["UserId", "Account", "Arn"], [0, 0, 0]];
    oTd = [3, "com.amazonaws.sts", "GetDelegatedAccessTokenRequest", 0, ["TradeInToken"], [[() => BSd, 0]]];
    sTd = [3, "com.amazonaws.sts", "GetDelegatedAccessTokenResponse", 0, ["Credentials", "PackedPolicySize", "AssumedPrincipal"], [[() => yqe, 0], 1, 0]];
    iTd = [3, "com.amazonaws.sts", "GetFederationTokenRequest", 0, ["Name", "Policy", "PolicyArns", "DurationSeconds", "Tags"], [0, 0, () => Lwn, 1, () => E3r]];
    aTd = [3, "com.amazonaws.sts", "GetFederationTokenResponse", 0, ["Credentials", "FederatedUser", "PackedPolicySize"], [[() => yqe, 0], () => ZSd, 1]];
    lTd = [3, "com.amazonaws.sts", "GetSessionTokenRequest", 0, ["DurationSeconds", "SerialNumber", "TokenCode"], [1, 0, 0]];
    cTd = [3, "com.amazonaws.sts", "GetSessionTokenResponse", 0, ["Credentials"], [[() => yqe, 0]]];
    uTd = [3, "com.amazonaws.sts", "GetWebIdentityTokenRequest", 0, ["Audience", "DurationSeconds", "SigningAlgorithm", "Tags"], [64, 1, 0, () => E3r]];
    dTd = [3, "com.amazonaws.sts", "GetWebIdentityTokenResponse", 0, ["WebIdentityToken", "Expiration"], [[() => $Sd, 0], 4]];
    pTd = [-3, "com.amazonaws.sts", "IDPCommunicationErrorException", {
      error: "client",
      httpError: 400,
      awsQueryError: ["IDPCommunicationError", 400]
    }, ["message"], [0]];
    EW.TypeRegistry.for("com.amazonaws.sts").registerError(pTd, IDPCommunicationErrorException);
    mTd = [-3, "com.amazonaws.sts", "IDPRejectedClaimException", {
      error: "client",
      httpError: 403,
      awsQueryError: ["IDPRejectedClaim", 403]
    }, ["message"], [0]];
    EW.TypeRegistry.for("com.amazonaws.sts").registerError(mTd, IDPRejectedClaimException);
    fTd = [-3, "com.amazonaws.sts", "InvalidAuthorizationMessageException", {
      error: "client",
      httpError: 400,
      awsQueryError: ["InvalidAuthorizationMessageException", 400]
    }, ["message"], [0]];
    EW.TypeRegistry.for("com.amazonaws.sts").registerError(fTd, InvalidAuthorizationMessageException);
    hTd = [-3, "com.amazonaws.sts", "InvalidIdentityTokenException", {
      error: "client",
      httpError: 400,
      awsQueryError: ["InvalidIdentityToken", 400]
    }, ["message"], [0]];
    EW.TypeRegistry.for("com.amazonaws.sts").registerError(hTd, InvalidIdentityTokenException);
    gTd = [-3, "com.amazonaws.sts", "JWTPayloadSizeExceededException", {
      error: "client",
      httpError: 400,
      awsQueryError: ["JWTPayloadSizeExceededException", 400]
    }, ["message"], [0]];
    EW.TypeRegistry.for("com.amazonaws.sts").registerError(gTd, JWTPayloadSizeExceededException);
    yTd = [-3, "com.amazonaws.sts", "MalformedPolicyDocumentException", {
      error: "client",
      httpError: 400,
      awsQueryError: ["MalformedPolicyDocument", 400]
    }, ["message"], [0]];
    EW.TypeRegistry.for("com.amazonaws.sts").registerError(yTd, MalformedPolicyDocumentException);
    _Td = [-3, "com.amazonaws.sts", "OutboundWebIdentityFederationDisabledException", {
      error: "client",
      httpError: 403,
      awsQueryError: ["OutboundWebIdentityFederationDisabledException", 403]
    }, ["message"], [0]];
    EW.TypeRegistry.for("com.amazonaws.sts").registerError(_Td, OutboundWebIdentityFederationDisabledException);
    bTd = [-3, "com.amazonaws.sts", "PackedPolicyTooLargeException", {
      error: "client",
      httpError: 400,
      awsQueryError: ["PackedPolicyTooLarge", 400]
    }, ["message"], [0]];
    EW.TypeRegistry.for("com.amazonaws.sts").registerError(bTd, PackedPolicyTooLargeException);
    sii = [3, "com.amazonaws.sts", "PolicyDescriptorType", 0, ["arn"], [0]];
    STd = [3, "com.amazonaws.sts", "ProvidedContext", 0, ["ProviderArn", "ContextAssertion"], [0, 0]];
    TTd = [-3, "com.amazonaws.sts", "RegionDisabledException", {
      error: "client",
      httpError: 403,
      awsQueryError: ["RegionDisabledException", 403]
    }, ["message"], [0]];
    EW.TypeRegistry.for("com.amazonaws.sts").registerError(TTd, RegionDisabledException);
    ETd = [-3, "com.amazonaws.sts", "SessionDurationEscalationException", {
      error: "client",
      httpError: 403,
      awsQueryError: ["SessionDurationEscalationException", 403]
    }, ["message"], [0]];
    EW.TypeRegistry.for("com.amazonaws.sts").registerError(ETd, SessionDurationEscalationException);
    vTd = [3, "com.amazonaws.sts", "Tag", 0, ["Key", "Value"], [0, 0]];
    wTd = [-3, "smithy.ts.sdk.synthetic.com.amazonaws.sts", "STSServiceException", 0, [], []];
    EW.TypeRegistry.for("smithy.ts.sdk.synthetic.com.amazonaws.sts").registerError(wTd, STSServiceException);
    Lwn = [1, "com.amazonaws.sts", "policyDescriptorListType", 0, () => sii];
    CTd = [1, "com.amazonaws.sts", "ProvidedContextsListType", 0, () => STd];
    E3r = [1, "com.amazonaws.sts", "tagListType", 0, () => vTd];
    iii = [9, "com.amazonaws.sts", "AssumeRole", 0, () => HSd, () => jSd];
    aii = [9, "com.amazonaws.sts", "AssumeRoleWithSAML", 0, () => qSd, () => WSd];
    lii = [9, "com.amazonaws.sts", "AssumeRoleWithWebIdentity", 0, () => GSd, () => VSd];
    cii = [9, "com.amazonaws.sts", "AssumeRoot", 0, () => zSd, () => KSd];
    uii = [9, "com.amazonaws.sts", "DecodeAuthorizationMessage", 0, () => YSd, () => JSd];
    dii = [9, "com.amazonaws.sts", "GetAccessKeyInfo", 0, () => eTd, () => tTd];
    pii = [9, "com.amazonaws.sts", "GetCallerIdentity", 0, () => nTd, () => rTd];
    mii = [9, "com.amazonaws.sts", "GetDelegatedAccessToken", 0, () => oTd, () => sTd];
    fii = [9, "com.amazonaws.sts", "GetFederationToken", 0, () => iTd, () => aTd];
    hii = [9, "com.amazonaws.sts", "GetSessionToken", 0, () => lTd, () => cTd];
    gii = [9, "com.amazonaws.sts", "GetWebIdentityToken", 0, () => uTd, () => dTd];
  });
  var yii;
  var AssumeRoleCommand;
  var Fwn = __lazy(() => {
    VD();
    s8();
    FY();
    yii = __toESM(_o(), 1);
    AssumeRoleCommand = class Hot extends Command_export4.classBuilder().ep(VA).m(function (e, t, n, r) {
      return [yii.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSSecurityTokenServiceV20110615", "AssumeRole", {}).n("STSClient", "AssumeRoleCommand").sc(iii).build() {};
  });
  var _ii;
  var AssumeRoleWithSAMLCommand;
  var v3r = __lazy(() => {
    VD();
    s8();
    FY();
    _ii = __toESM(_o(), 1);
    AssumeRoleWithSAMLCommand = class Uwn extends Command_export4.classBuilder().ep(VA).m(function (e, t, n, r) {
      return [_ii.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSSecurityTokenServiceV20110615", "AssumeRoleWithSAML", {}).n("STSClient", "AssumeRoleWithSAMLCommand").sc(aii).build() {};
  });
  var bii;
  var AssumeRoleWithWebIdentityCommand;
  var Bwn = __lazy(() => {
    VD();
    s8();
    FY();
    bii = __toESM(_o(), 1);
    AssumeRoleWithWebIdentityCommand = class jot extends Command_export4.classBuilder().ep(VA).m(function (e, t, n, r) {
      return [bii.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSSecurityTokenServiceV20110615", "AssumeRoleWithWebIdentity", {}).n("STSClient", "AssumeRoleWithWebIdentityCommand").sc(lii).build() {};
  });
  var Sii;
  var AssumeRootCommand;
  var w3r = __lazy(() => {
    VD();
    s8();
    FY();
    Sii = __toESM(_o(), 1);
    AssumeRootCommand = class $wn extends Command_export4.classBuilder().ep(VA).m(function (e, t, n, r) {
      return [Sii.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSSecurityTokenServiceV20110615", "AssumeRoot", {}).n("STSClient", "AssumeRootCommand").sc(cii).build() {};
  });
  var Tii;
  var DecodeAuthorizationMessageCommand;
  var C3r = __lazy(() => {
    VD();
    s8();
    FY();
    Tii = __toESM(_o(), 1);
    DecodeAuthorizationMessageCommand = class Hwn extends Command_export4.classBuilder().ep(VA).m(function (e, t, n, r) {
      return [Tii.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSSecurityTokenServiceV20110615", "DecodeAuthorizationMessage", {}).n("STSClient", "DecodeAuthorizationMessageCommand").sc(uii).build() {};
  });
  var Eii;
  var GetAccessKeyInfoCommand;
  var R3r = __lazy(() => {
    VD();
    s8();
    FY();
    Eii = __toESM(_o(), 1);
    GetAccessKeyInfoCommand = class jwn extends Command_export4.classBuilder().ep(VA).m(function (e, t, n, r) {
      return [Eii.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSSecurityTokenServiceV20110615", "GetAccessKeyInfo", {}).n("STSClient", "GetAccessKeyInfoCommand").sc(dii).build() {};
  });
  var vii;
  var GetCallerIdentityCommand;
  var x3r = __lazy(() => {
    VD();
    s8();
    FY();
    vii = __toESM(_o(), 1);
    GetCallerIdentityCommand = class qwn extends Command_export4.classBuilder().ep(VA).m(function (e, t, n, r) {
      return [vii.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSSecurityTokenServiceV20110615", "GetCallerIdentity", {}).n("STSClient", "GetCallerIdentityCommand").sc(pii).build() {};
  });
  var wii;
  var GetDelegatedAccessTokenCommand;
  var k3r = __lazy(() => {
    VD();
    s8();
    FY();
    wii = __toESM(_o(), 1);
    GetDelegatedAccessTokenCommand = class Wwn extends Command_export4.classBuilder().ep(VA).m(function (e, t, n, r) {
      return [wii.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSSecurityTokenServiceV20110615", "GetDelegatedAccessToken", {}).n("STSClient", "GetDelegatedAccessTokenCommand").sc(mii).build() {};
  });
  var Cii;
  var GetFederationTokenCommand;
  var A3r = __lazy(() => {
    VD();
    s8();
    FY();
    Cii = __toESM(_o(), 1);
    GetFederationTokenCommand = class Gwn extends Command_export4.classBuilder().ep(VA).m(function (e, t, n, r) {
      return [Cii.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSSecurityTokenServiceV20110615", "GetFederationToken", {}).n("STSClient", "GetFederationTokenCommand").sc(fii).build() {};
  });
  var Rii;
  var GetSessionTokenCommand;
  var I3r = __lazy(() => {
    VD();
    s8();
    FY();
    Rii = __toESM(_o(), 1);
    GetSessionTokenCommand = class Vwn extends Command_export4.classBuilder().ep(VA).m(function (e, t, n, r) {
      return [Rii.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSSecurityTokenServiceV20110615", "GetSessionToken", {}).n("STSClient", "GetSessionTokenCommand").sc(hii).build() {};
  });
  var xii;
  var GetWebIdentityTokenCommand;
  var P3r = __lazy(() => {
    VD();
    s8();
    FY();
    xii = __toESM(_o(), 1);
    GetWebIdentityTokenCommand = class zwn extends Command_export4.classBuilder().ep(VA).m(function (e, t, n, r) {
      return [xii.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSSecurityTokenServiceV20110615", "GetWebIdentityToken", {}).n("STSClient", "GetWebIdentityTokenCommand").sc(gii).build() {};
  });
  var RTd;
  var STS;
  var kii = __lazy(() => {
    VD();
    Fwn();
    v3r();
    Bwn();
    w3r();
    C3r();
    R3r();
    x3r();
    k3r();
    A3r();
    I3r();
    P3r();
    Y1t();
    RTd = {
      AssumeRoleCommand: AssumeRoleCommand,
      AssumeRoleWithSAMLCommand: AssumeRoleWithSAMLCommand,
      AssumeRoleWithWebIdentityCommand: AssumeRoleWithWebIdentityCommand,
      AssumeRootCommand: AssumeRootCommand,
      DecodeAuthorizationMessageCommand: DecodeAuthorizationMessageCommand,
      GetAccessKeyInfoCommand: GetAccessKeyInfoCommand,
      GetCallerIdentityCommand: GetCallerIdentityCommand,
      GetDelegatedAccessTokenCommand: GetDelegatedAccessTokenCommand,
      GetFederationTokenCommand: GetFederationTokenCommand,
      GetSessionTokenCommand: GetSessionTokenCommand,
      GetWebIdentityTokenCommand: GetWebIdentityTokenCommand
    };
    STS = class O3r extends STSClient {};
    createAggregatedClient_export4(RTd, STS);
  });
  var Aii = __lazy(() => {
    Fwn();
    v3r();
    Bwn();
    w3r();
    C3r();
    R3r();
    x3r();
    k3r();
    A3r();
    I3r();
    P3r();
  });
  var Kwn;
  var Iii;
  var Pii = e => {
    if (typeof e?.Arn === "string") {
      let t = e.Arn.split(":");
      if (t.length > 4 && t[4] !== "") {
        return t[4];
      }
    }
    return;
  };
  var Oii = async (e, t, n, r = {}) => {
    let o = typeof e === "function" ? await e() : e;
    let s = typeof t === "function" ? await t() : t;
    let i = await Iii.stsRegionDefaultResolver(r)();
    n?.debug?.("@aws-sdk/client-sts::resolveRegion", "accepting first of:", `${o} (credential provider clientConfig)`, `${s} (contextual client)`, `${i} (STS default: AWS_REGION, profile region, or us-east-1)`);
    return o ?? s ?? i;
  };
  var Dii = (e, t) => {
    let n;
    let r;
    return async (o, s) => {
      if (r = o, !n) {
        let {
          logger: u = e?.parentClientConfig?.logger,
          profile: d = e?.parentClientConfig?.profile,
          region: p,
          requestHandler: m = e?.parentClientConfig?.requestHandler,
          credentialProviderLogger: f,
          userAgentAppId: h = e?.parentClientConfig?.userAgentAppId
        } = e;
        let g = await Oii(p, e?.parentClientConfig?.region, f, {
          logger: u,
          profile: d
        });
        let y = !Nii(m);
        n = new t({
          ...e,
          userAgentAppId: h,
          profile: d,
          credentialDefaultProvider: () => async () => r,
          region: g,
          requestHandler: y ? m : undefined,
          logger: u
        });
      }
      let {
        Credentials: i,
        AssumedRoleUser: a
      } = await n.send(new AssumeRoleCommand(s));
      if (!i || !i.AccessKeyId || !i.SecretAccessKey) {
        throw Error(`Invalid response from STS.assumeRole call with role ${s.RoleArn}`);
      }
      let l = Pii(a);
      let c = {
        accessKeyId: i.AccessKeyId,
        secretAccessKey: i.SecretAccessKey,
        sessionToken: i.SessionToken,
        expiration: i.Expiration,
        ...(i.CredentialScope && {
          credentialScope: i.CredentialScope
        }),
        ...(l && {
          accountId: l
        })
      };
      Kwn.setCredentialFeature(c, "CREDENTIALS_STS_ASSUME_ROLE", "i");
      return c;
    };
  };
  var Mii = (e, t) => {
    let n;
    return async r => {
      if (!n) {
        let {
          logger: l = e?.parentClientConfig?.logger,
          profile: c = e?.parentClientConfig?.profile,
          region: u,
          requestHandler: d = e?.parentClientConfig?.requestHandler,
          credentialProviderLogger: p,
          userAgentAppId: m = e?.parentClientConfig?.userAgentAppId
        } = e;
        let f = await Oii(u, e?.parentClientConfig?.region, p, {
          logger: l,
          profile: c
        });
        let h = !Nii(d);
        n = new t({
          ...e,
          userAgentAppId: m,
          profile: c,
          region: f,
          requestHandler: h ? d : undefined,
          logger: l
        });
      }
      let {
        Credentials: o,
        AssumedRoleUser: s
      } = await n.send(new AssumeRoleWithWebIdentityCommand(r));
      if (!o || !o.AccessKeyId || !o.SecretAccessKey) {
        throw Error(`Invalid response from STS.assumeRoleWithWebIdentity call with role ${r.RoleArn}`);
      }
      let i = Pii(s);
      let a = {
        accessKeyId: o.AccessKeyId,
        secretAccessKey: o.SecretAccessKey,
        sessionToken: o.SessionToken,
        expiration: o.Expiration,
        ...(o.CredentialScope && {
          credentialScope: o.CredentialScope
        }),
        ...(i && {
          accountId: i
        })
      };
      if (i) {
        Kwn.setCredentialFeature(a, "RESOLVED_ACCOUNT_ID", "T");
      }
      Kwn.setCredentialFeature(a, "CREDENTIALS_STS_ASSUME_ROLE_WEB_ID", "k");
      return a;
    };
  };
  var Nii = e => e?.metadata?.handlerProtocol === "h2";
  var Lii = __lazy(() => {
    Fwn();
    Bwn();
    Kwn = __toESM(UP(), 1);
    Iii = __toESM(Xte(), 1);
  });
  var Fii = (e, t) => {
    if (!t) {
      return e;
    } else {
      return class extends e {
        constructor(r) {
          super(r);
          for (let o of t) {
            this.middlewareStack.use(o);
          }
        }
      };
    }
  };
  var getDefaultRoleAssumer = (e = {}, t) => Dii(e, Fii(STSClient, t));
  var getDefaultRoleAssumerWithWebIdentity = (e = {}, t) => Mii(e, Fii(STSClient, t));
  var decorateDefaultCredentialProvider = e => t => e({
    roleAssumer: getDefaultRoleAssumer(t),
    roleAssumerWithWebIdentity: getDefaultRoleAssumerWithWebIdentity(t),
    ...t
  });
  var $ii = __lazy(() => {
    Lii();
    Y1t();
  });
  var D3r = {};