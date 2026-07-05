  var F2r = __commonJS(tne => {
    Object.defineProperty(tne, "__esModule", {
      value: true
    });
    tne.resolveHttpAuthSchemeConfig = tne.resolveStsAuthConfig = tne.defaultSTSHttpAuthSchemeProvider = tne.defaultSTSHttpAuthSchemeParametersProvider = undefined;
    var Std = nw();
    var L2r = zB();
    var Ttd = U2r();
    var Etd = async (e, t, n) => ({
      operation: (0, L2r.getSmithyContext)(t).operation,
      region: (await (0, L2r.normalizeProvider)(e.region)()) || (() => {
        throw Error("expected `region` to be configured for `aws.auth#sigv4`");
      })()
    });
    tne.defaultSTSHttpAuthSchemeParametersProvider = Etd;
    function vtd(e) {
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
    function wtd(e) {
      return {
        schemeId: "smithy.api#noAuth"
      };
    }
    var Ctd = e => {
      let t = [];
      switch (e.operation) {
        case "AssumeRoleWithWebIdentity":
          {
            t.push(wtd(e));
            break;
          }
        default:
          t.push(vtd(e));
      }
      return t;
    };
    tne.defaultSTSHttpAuthSchemeProvider = Ctd;
    var Rtd = e => Object.assign(e, {
      stsClientCtor: Ttd.STSClient
    });
    tne.resolveStsAuthConfig = Rtd;
    var xtd = e => {
      let t = (0, tne.resolveStsAuthConfig)(e);
      let n = (0, Std.resolveAwsSdkSigV4Config)(t);
      return Object.assign(n, {
        authSchemePreference: (0, L2r.normalizeProvider)(e.authSchemePreference ?? [])
      });
    };
    tne.resolveHttpAuthSchemeConfig = xtd;
  });
  var B2r = __commonJS(Frt => {
    Object.defineProperty(Frt, "__esModule", {
      value: true
    });
    Frt.commonParams = Frt.resolveClientEndpointParameters = undefined;
    var ktd = e => Object.assign(e, {
      useDualstackEndpoint: e.useDualstackEndpoint ?? false,
      useFipsEndpoint: e.useFipsEndpoint ?? false,
      useGlobalEndpoint: e.useGlobalEndpoint ?? false,
      defaultSigningName: "sts"
    });
    Frt.resolveClientEndpointParameters = ktd;
    Frt.commonParams = {
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
  var hGs = __commonJS(kSn => {
    Object.defineProperty(kSn, "__esModule", {
      value: true
    });
    kSn.ruleSet = undefined;
    var JWs = {
      ["required"]: false,
      ["type"]: "string"
    };
    var H2r = {
      ["required"]: true,
      default: false,
      ["type"]: "boolean"
    };
    var cGs = {
      ["ref"]: "Endpoint"
    };
    var XWs = {
      ["fn"]: "isSet",
      ["argv"]: [{
        ["ref"]: "Region"
      }]
    };
    var SF = {
      ["ref"]: "Region"
    };
    var QWs = {
      ["fn"]: "aws.partition",
      ["argv"]: [SF],
      assign: "PartitionResult"
    };
    var uGs = {
      ["ref"]: "UseFIPS"
    };
    var dGs = {
      ["ref"]: "UseDualStack"
    };
    var e2 = {
      url: "https://sts.amazonaws.com",
      properties: {
        authSchemes: [{
          name: "sigv4",
          signingName: "sts",
          signingRegion: "us-east-1"
        }]
      },
      headers: {}
    };
    var X6 = {};
    var ZWs = {
      conditions: [{
        ["fn"]: "stringEquals",
        ["argv"]: [SF, "aws-global"]
      }],
      ["endpoint"]: e2,
      ["type"]: "endpoint"
    };
    var pGs = {
      ["fn"]: "booleanEquals",
      ["argv"]: [uGs, true]
    };
    var mGs = {
      ["fn"]: "booleanEquals",
      ["argv"]: [dGs, true]
    };
    var eGs = {
      ["fn"]: "getAttr",
      ["argv"]: [{
        ["ref"]: "PartitionResult"
      }, "supportsFIPS"]
    };
    var fGs = {
      ["ref"]: "PartitionResult"
    };
    var tGs = {
      ["fn"]: "booleanEquals",
      ["argv"]: [true, {
        ["fn"]: "getAttr",
        ["argv"]: [fGs, "supportsDualStack"]
      }]
    };
    var nGs = [{
      ["fn"]: "isSet",
      ["argv"]: [cGs]
    }];
    var rGs = [pGs];
    var oGs = [mGs];
    var Atd = {
      version: "1.0",
      parameters: {
        Region: JWs,
        UseDualStack: H2r,
        UseFIPS: H2r,
        Endpoint: JWs,
        UseGlobalEndpoint: H2r
      },
      rules: [{
        conditions: [{
          ["fn"]: "booleanEquals",
          ["argv"]: [{
            ["ref"]: "UseGlobalEndpoint"
          }, true]
        }, {
          ["fn"]: "not",
          ["argv"]: nGs
        }, XWs, QWs, {
          ["fn"]: "booleanEquals",
          ["argv"]: [uGs, false]
        }, {
          ["fn"]: "booleanEquals",
          ["argv"]: [dGs, false]
        }],
        rules: [{
          conditions: [{
            ["fn"]: "stringEquals",
            ["argv"]: [SF, "ap-northeast-1"]
          }],
          endpoint: e2,
          ["type"]: "endpoint"
        }, {
          conditions: [{
            ["fn"]: "stringEquals",
            ["argv"]: [SF, "ap-south-1"]
          }],
          endpoint: e2,
          ["type"]: "endpoint"
        }, {
          conditions: [{
            ["fn"]: "stringEquals",
            ["argv"]: [SF, "ap-southeast-1"]
          }],
          endpoint: e2,
          ["type"]: "endpoint"
        }, {
          conditions: [{
            ["fn"]: "stringEquals",
            ["argv"]: [SF, "ap-southeast-2"]
          }],
          endpoint: e2,
          ["type"]: "endpoint"
        }, ZWs, {
          conditions: [{
            ["fn"]: "stringEquals",
            ["argv"]: [SF, "ca-central-1"]
          }],
          endpoint: e2,
          ["type"]: "endpoint"
        }, {
          conditions: [{
            ["fn"]: "stringEquals",
            ["argv"]: [SF, "eu-central-1"]
          }],
          endpoint: e2,
          ["type"]: "endpoint"
        }, {
          conditions: [{
            ["fn"]: "stringEquals",
            ["argv"]: [SF, "eu-north-1"]
          }],
          endpoint: e2,
          ["type"]: "endpoint"
        }, {
          conditions: [{
            ["fn"]: "stringEquals",
            ["argv"]: [SF, "eu-west-1"]
          }],
          endpoint: e2,
          ["type"]: "endpoint"
        }, {
          conditions: [{
            ["fn"]: "stringEquals",
            ["argv"]: [SF, "eu-west-2"]
          }],
          endpoint: e2,
          ["type"]: "endpoint"
        }, {
          conditions: [{
            ["fn"]: "stringEquals",
            ["argv"]: [SF, "eu-west-3"]
          }],
          endpoint: e2,
          ["type"]: "endpoint"
        }, {
          conditions: [{
            ["fn"]: "stringEquals",
            ["argv"]: [SF, "sa-east-1"]
          }],
          endpoint: e2,
          ["type"]: "endpoint"
        }, {
          conditions: [{
            ["fn"]: "stringEquals",
            ["argv"]: [SF, "us-east-1"]
          }],
          endpoint: e2,
          ["type"]: "endpoint"
        }, {
          conditions: [{
            ["fn"]: "stringEquals",
            ["argv"]: [SF, "us-east-2"]
          }],
          endpoint: e2,
          ["type"]: "endpoint"
        }, {
          conditions: [{
            ["fn"]: "stringEquals",
            ["argv"]: [SF, "us-west-1"]
          }],
          endpoint: e2,
          ["type"]: "endpoint"
        }, {
          conditions: [{
            ["fn"]: "stringEquals",
            ["argv"]: [SF, "us-west-2"]
          }],
          endpoint: e2,
          ["type"]: "endpoint"
        }, {
          endpoint: {
            url: "https://sts.{Region}.{PartitionResult#dnsSuffix}",
            properties: {
              authSchemes: [{
                name: "sigv4",
                signingName: "sts",
                signingRegion: "{Region}"
              }]
            },
            headers: X6
          },
          ["type"]: "endpoint"
        }],
        ["type"]: "tree"
      }, {
        conditions: nGs,
        rules: [{
          conditions: rGs,
          error: "Invalid Configuration: FIPS and custom endpoint are not supported",
          ["type"]: "error"
        }, {
          conditions: oGs,
          error: "Invalid Configuration: Dualstack and custom endpoint are not supported",
          ["type"]: "error"
        }, {
          endpoint: {
            url: cGs,
            properties: X6,
            headers: X6
          },
          ["type"]: "endpoint"
        }],
        ["type"]: "tree"
      }, {
        conditions: [XWs],
        rules: [{
          conditions: [QWs],
          rules: [{
            conditions: [pGs, mGs],
            rules: [{
              conditions: [{
                ["fn"]: "booleanEquals",
                ["argv"]: [true, eGs]
              }, tGs],
              rules: [{
                endpoint: {
                  url: "https://sts-fips.{Region}.{PartitionResult#dualStackDnsSuffix}",
                  properties: X6,
                  headers: X6
                },
                ["type"]: "endpoint"
              }],
              ["type"]: "tree"
            }, {
              error: "FIPS and DualStack are enabled, but this partition does not support one or both",
              ["type"]: "error"
            }],
            ["type"]: "tree"
          }, {
            conditions: rGs,
            rules: [{
              conditions: [{
                ["fn"]: "booleanEquals",
                ["argv"]: [eGs, true]
              }],
              rules: [{
                conditions: [{
                  ["fn"]: "stringEquals",
                  ["argv"]: [{
                    ["fn"]: "getAttr",
                    ["argv"]: [fGs, "name"]
                  }, "aws-us-gov"]
                }],
                endpoint: {
                  url: "https://sts.{Region}.amazonaws.com",
                  properties: X6,
                  headers: X6
                },
                ["type"]: "endpoint"
              }, {
                endpoint: {
                  url: "https://sts-fips.{Region}.{PartitionResult#dnsSuffix}",
                  properties: X6,
                  headers: X6
                },
                ["type"]: "endpoint"
              }],
              ["type"]: "tree"
            }, {
              error: "FIPS is enabled but this partition does not support FIPS",
              ["type"]: "error"
            }],
            ["type"]: "tree"
          }, {
            conditions: oGs,
            rules: [{
              conditions: [tGs],
              rules: [{
                endpoint: {
                  url: "https://sts.{Region}.{PartitionResult#dualStackDnsSuffix}",
                  properties: X6,
                  headers: X6
                },
                ["type"]: "endpoint"
              }],
              ["type"]: "tree"
            }, {
              error: "DualStack is enabled but this partition does not support DualStack",
              ["type"]: "error"
            }],
            ["type"]: "tree"
          }, ZWs, {
            endpoint: {
              url: "https://sts.{Region}.{PartitionResult#dnsSuffix}",
              properties: X6,
              headers: X6
            },
            ["type"]: "endpoint"
          }],
          ["type"]: "tree"
        }],
        ["type"]: "tree"
      }, {
        error: "Invalid Configuration: Missing Region",
        ["type"]: "error"
      }]
    };
    kSn.ruleSet = Atd;
  });
  var gGs = __commonJS(ASn => {
    Object.defineProperty(ASn, "__esModule", {
      value: true
    });
    ASn.defaultEndpointResolver = undefined;
    var Itd = Ale();
    var q2r = Lte();
    var Ptd = hGs();
    var Otd = new q2r.EndpointCache({
      size: 50,
      params: ["Endpoint", "Region", "UseDualStack", "UseFIPS", "UseGlobalEndpoint"]
    });
    var Dtd = (e, t = {}) => Otd.get(e, () => (0, q2r.resolveEndpoint)(Ptd.ruleSet, {
      endpointParams: e,
      logger: t.logger
    }));
    ASn.defaultEndpointResolver = Dtd;
    q2r.customEndpointFunctions.aws = Itd.awsEndpointFunctions;
  });
  var bGs = __commonJS(ISn => {
    Object.defineProperty(ISn, "__esModule", {
      value: true
    });
    ISn.getRuntimeConfig = undefined;
    var Mtd = nw();
    var Ntd = r_e();
    var Ltd = Od();
    var Ftd = Pj();
    var Utd = bY();
    var yGs = zbn();
    var _Gs = jT();
    var Btd = F2r();
    var $td = gGs();
    var Htd = e => ({
      apiVersion: "2011-06-15",
      base64Decoder: e?.base64Decoder ?? yGs.fromBase64,
      base64Encoder: e?.base64Encoder ?? yGs.toBase64,
      disableHostPrefix: e?.disableHostPrefix ?? false,
      endpointProvider: e?.endpointProvider ?? $td.defaultEndpointResolver,
      extensions: e?.extensions ?? [],
      httpAuthSchemeProvider: e?.httpAuthSchemeProvider ?? Btd.defaultSTSHttpAuthSchemeProvider,
      httpAuthSchemes: e?.httpAuthSchemes ?? [{
        schemeId: "aws.auth#sigv4",
        identityProvider: t => t.getIdentityProvider("aws.auth#sigv4"),
        signer: new Mtd.AwsSdkSigV4Signer()
      }, {
        schemeId: "smithy.api#noAuth",
        identityProvider: t => t.getIdentityProvider("smithy.api#noAuth") || (async () => ({})),
        signer: new Ltd.NoAuthSigner()
      }],
      logger: e?.logger ?? new Ftd.NoOpLogger(),
      protocol: e?.protocol ?? new Ntd.AwsQueryProtocol({
        defaultNamespace: "com.amazonaws.sts",
        xmlNamespace: "https://sts.amazonaws.com/doc/2011-06-15/",
        version: "2011-06-15"
      }),
      serviceId: e?.serviceId ?? "STS",
      urlParser: e?.urlParser ?? Utd.parseUrl,
      utf8Decoder: e?.utf8Decoder ?? _Gs.fromUtf8,
      utf8Encoder: e?.utf8Encoder ?? _Gs.toUtf8
    });
    ISn.getRuntimeConfig = Htd;
  });
  var vGs = __commonJS(OSn => {
    Object.defineProperty(OSn, "__esModule", {
      value: true
    });
    OSn.getRuntimeConfig = undefined;
    var jtd = ort();
    var qtd = jtd.__importDefault(Hbn());
    var W2r = nw();
    var SGs = Zye();
    var PSn = HA();
    var Wtd = Od();
    var Gtd = e_e();
    var TGs = yF();
    var qje = VB();
    var EGs = hW();
    var Vtd = t_e();
    var ztd = Ole();
    var Ktd = bGs();
    var Ytd = Pj();
    var Jtd = s_e();
    var Xtd = Pj();
    var Qtd = e => {
      (0, Xtd.emitWarningIfUnsupportedVersion)(process.version);
      let t = (0, Jtd.resolveDefaultsModeConfig)(e);
      let n = () => t().then(Ytd.loadConfigsForDefaultMode);
      let r = (0, Ktd.getRuntimeConfig)(e);
      (0, W2r.emitWarningIfUnsupportedVersion)(process.version);
      let o = {
        profile: e?.profile,
        logger: r.logger
      };
      return {
        ...r,
        ...e,
        runtime: "node",
        defaultsMode: t,
        authSchemePreference: e?.authSchemePreference ?? (0, qje.loadConfig)(W2r.NODE_AUTH_SCHEME_PREFERENCE_OPTIONS, o),
        bodyLengthChecker: e?.bodyLengthChecker ?? Vtd.calculateBodyLength,
        defaultUserAgentProvider: e?.defaultUserAgentProvider ?? (0, SGs.createDefaultUserAgentProvider)({
          serviceId: r.serviceId,
          clientVersion: qtd.default.version
        }),
        httpAuthSchemes: e?.httpAuthSchemes ?? [{
          schemeId: "aws.auth#sigv4",
          identityProvider: s => s.getIdentityProvider("aws.auth#sigv4") || (async i => await e.credentialDefaultProvider(i?.__config || {})()),
          signer: new W2r.AwsSdkSigV4Signer()
        }, {
          schemeId: "smithy.api#noAuth",
          identityProvider: s => s.getIdentityProvider("smithy.api#noAuth") || (async () => ({})),
          signer: new Wtd.NoAuthSigner()
        }],
        maxAttempts: e?.maxAttempts ?? (0, qje.loadConfig)(TGs.NODE_MAX_ATTEMPT_CONFIG_OPTIONS, e),
        region: e?.region ?? (0, qje.loadConfig)(PSn.NODE_REGION_CONFIG_OPTIONS, {
          ...PSn.NODE_REGION_CONFIG_FILE_OPTIONS,
          ...o
        }),
        requestHandler: EGs.NodeHttpHandler.create(e?.requestHandler ?? n),
        retryMode: e?.retryMode ?? (0, qje.loadConfig)({
          ...TGs.NODE_RETRY_MODE_CONFIG_OPTIONS,
          default: async () => (await n()).retryMode || ztd.DEFAULT_RETRY_MODE
        }, e),
        sha256: e?.sha256 ?? Gtd.Hash.bind(null, "sha256"),
        streamCollector: e?.streamCollector ?? EGs.streamCollector,
        useDualstackEndpoint: e?.useDualstackEndpoint ?? (0, qje.loadConfig)(PSn.NODE_USE_DUALSTACK_ENDPOINT_CONFIG_OPTIONS, o),
        useFipsEndpoint: e?.useFipsEndpoint ?? (0, qje.loadConfig)(PSn.NODE_USE_FIPS_ENDPOINT_CONFIG_OPTIONS, o),
        userAgentAppId: e?.userAgentAppId ?? (0, qje.loadConfig)(SGs.NODE_APP_ID_CONFIG_OPTIONS, o)
      };
    };
    OSn.getRuntimeConfig = Qtd;
  });
  var wGs = __commonJS(Brt => {
    Object.defineProperty(Brt, "__esModule", {
      value: true
    });
    Brt.resolveHttpAuthRuntimeConfig = Brt.getHttpAuthExtensionConfiguration = undefined;
    var Ztd = e => {
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
    Brt.getHttpAuthExtensionConfiguration = Ztd;
    var end = e => ({
      httpAuthSchemes: e.httpAuthSchemes(),
      httpAuthSchemeProvider: e.httpAuthSchemeProvider(),
      credentials: e.credentials()
    });
    Brt.resolveHttpAuthRuntimeConfig = end;
  });
  var AGs = __commonJS(DSn => {
    Object.defineProperty(DSn, "__esModule", {
      value: true
    });
    DSn.resolveRuntimeExtensions = undefined;
    var CGs = Xte();
    var RGs = eSn();
    var xGs = Pj();
    var kGs = wGs();
    var tnd = (e, t) => {
      let n = Object.assign((0, CGs.getAwsRegionExtensionConfiguration)(e), (0, xGs.getDefaultExtensionConfiguration)(e), (0, RGs.getHttpHandlerExtensionConfiguration)(e), (0, kGs.getHttpAuthExtensionConfiguration)(e));
      t.forEach(r => r.configure(n));
      return Object.assign(e, (0, CGs.resolveAwsRegionExtensionConfiguration)(n), (0, xGs.resolveDefaultRuntimeConfig)(n), (0, RGs.resolveHttpHandlerRuntimeConfig)(n), (0, kGs.resolveHttpAuthRuntimeConfig)(n));
    };
    DSn.resolveRuntimeExtensions = tnd;
  });
  var U2r = __commonJS($rt => {
    Object.defineProperty($rt, "__esModule", {
      value: true
    });
    $rt.STSClient = $rt.__Client = undefined;
    var IGs = qye();
    var nnd = Wye();
    var rnd = Gye();
    var PGs = Ple();
    var ond = HA();
    var G2r = Od();
    var snd = qT();
    var ind = Xye();
    var and = _o();
    var OGs = yF();
    var MGs = Pj();
    Object.defineProperty($rt, "__Client", {
      enumerable: true,
      get: function () {
        return MGs.Client;
      }
    });
    var DGs = F2r();
    var lnd = B2r();
    var cnd = vGs();
    var und = AGs();
    class NGs extends MGs.Client {
      config;
      constructor(...[e]) {
        let t = (0, cnd.getRuntimeConfig)(e || {});
        super(t);
        this.initConfig = t;
        let n = (0, lnd.resolveClientEndpointParameters)(t);
        let r = (0, PGs.resolveUserAgentConfig)(n);
        let o = (0, OGs.resolveRetryConfig)(r);
        let s = (0, ond.resolveRegionConfig)(o);
        let i = (0, IGs.resolveHostHeaderConfig)(s);
        let a = (0, and.resolveEndpointConfig)(i);
        let l = (0, DGs.resolveHttpAuthSchemeConfig)(a);
        let c = (0, und.resolveRuntimeExtensions)(l, e?.extensions || []);
        this.config = c;
        this.middlewareStack.use((0, snd.getSchemaSerdePlugin)(this.config));
        this.middlewareStack.use((0, PGs.getUserAgentPlugin)(this.config));
        this.middlewareStack.use((0, OGs.getRetryPlugin)(this.config));
        this.middlewareStack.use((0, ind.getContentLengthPlugin)(this.config));
        this.middlewareStack.use((0, IGs.getHostHeaderPlugin)(this.config));
        this.middlewareStack.use((0, nnd.getLoggerPlugin)(this.config));
        this.middlewareStack.use((0, rnd.getRecursionDetectionPlugin)(this.config));
        this.middlewareStack.use((0, G2r.getHttpAuthSchemeEndpointRuleSetPlugin)(this.config, {
          httpAuthSchemeParametersProvider: DGs.defaultSTSHttpAuthSchemeParametersProvider,
          identityProviderConfigProvider: async u => new G2r.DefaultIdentityProviderConfig({
            "aws.auth#sigv4": u.credentials
          })
        }));
        this.middlewareStack.use((0, G2r.getHttpSigningPlugin)(this.config));
      }
      destroy() {
        super.destroy();
      }
    }
    $rt.STSClient = NGs;
  });
  var LSn = __commonJS(WN => {
    var QNt = U2r();
    var ZNt = Pj();
    var LGs = _o();
    var FGs = B2r();
    var PAe = qT();
    var V2r = UP();
    var dnd = Xte();
    var l_e = class e extends ZNt.ServiceException {
      constructor(t) {
        super(t);
        Object.setPrototypeOf(this, e.prototype);
      }
    };
    var UGs = class e extends l_e {
      name = "ExpiredTokenException";
      $fault = "client";
      constructor(t) {
        super({
          name: "ExpiredTokenException",
          $fault: "client",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
      }
    };
    var BGs = class e extends l_e {
      name = "MalformedPolicyDocumentException";
      $fault = "client";
      constructor(t) {
        super({
          name: "MalformedPolicyDocumentException",
          $fault: "client",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
      }
    };
    var $Gs = class e extends l_e {
      name = "PackedPolicyTooLargeException";
      $fault = "client";
      constructor(t) {
        super({
          name: "PackedPolicyTooLargeException",
          $fault: "client",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
      }
    };
    var HGs = class e extends l_e {
      name = "RegionDisabledException";
      $fault = "client";
      constructor(t) {
        super({
          name: "RegionDisabledException",
          $fault: "client",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
      }
    };
    var jGs = class e extends l_e {
      name = "IDPRejectedClaimException";
      $fault = "client";
      constructor(t) {
        super({
          name: "IDPRejectedClaimException",
          $fault: "client",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
      }
    };
    var qGs = class e extends l_e {
      name = "InvalidIdentityTokenException";
      $fault = "client";
      constructor(t) {
        super({
          name: "InvalidIdentityTokenException",
          $fault: "client",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
      }
    };
    var WGs = class e extends l_e {
      name = "IDPCommunicationErrorException";
      $fault = "client";
      constructor(t) {
        super({
          name: "IDPCommunicationErrorException",
          $fault: "client",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
      }
    };
    var trd = [0, "com.amazonaws.sts", "accessKeySecretType", 8, 0];
    var nrd = [0, "com.amazonaws.sts", "clientTokenType", 8, 0];
    var QGs = [3, "com.amazonaws.sts", "AssumedRoleUser", 0, ["AssumedRoleId", "Arn"], [0, 0]];
    var rrd = [3, "com.amazonaws.sts", "AssumeRoleRequest", 0, ["RoleArn", "RoleSessionName", "PolicyArns", "Policy", "DurationSeconds", "Tags", "TransitiveTagKeys", "ExternalId", "SerialNumber", "TokenCode", "SourceIdentity", "ProvidedContexts"], [0, 0, () => e9s, 0, 1, () => brd, 64, 0, 0, 0, 0, () => _rd]];
    var ord = [3, "com.amazonaws.sts", "AssumeRoleResponse", 0, ["Credentials", "AssumedRoleUser", "PackedPolicySize", "SourceIdentity"], [[() => ZGs, 0], () => QGs, 1, 0]];
    var srd = [3, "com.amazonaws.sts", "AssumeRoleWithWebIdentityRequest", 0, ["RoleArn", "RoleSessionName", "WebIdentityToken", "ProviderId", "PolicyArns", "Policy", "DurationSeconds"], [0, 0, [() => nrd, 0], 0, () => e9s, 0, 1]];
    var ird = [3, "com.amazonaws.sts", "AssumeRoleWithWebIdentityResponse", 0, ["Credentials", "SubjectFromWebIdentityToken", "AssumedRoleUser", "PackedPolicySize", "Provider", "Audience", "SourceIdentity"], [[() => ZGs, 0], 0, () => QGs, 1, 0, 0, 0]];
    var ZGs = [3, "com.amazonaws.sts", "Credentials", 0, ["AccessKeyId", "SecretAccessKey", "SessionToken", "Expiration"], [0, [() => trd, 0], 0, 4]];
    var ard = [-3, "com.amazonaws.sts", "ExpiredTokenException", {
      ["error"]: "client",
      ["httpError"]: 400,
      ["awsQueryError"]: ["ExpiredTokenException", 400]
    }, ["message"], [0]];
    PAe.TypeRegistry.for("com.amazonaws.sts").registerError(ard, UGs);
    var lrd = [-3, "com.amazonaws.sts", "IDPCommunicationErrorException", {
      ["error"]: "client",
      ["httpError"]: 400,
      ["awsQueryError"]: ["IDPCommunicationError", 400]
    }, ["message"], [0]];
    PAe.TypeRegistry.for("com.amazonaws.sts").registerError(lrd, WGs);
    var crd = [-3, "com.amazonaws.sts", "IDPRejectedClaimException", {
      ["error"]: "client",
      ["httpError"]: 403,
      ["awsQueryError"]: ["IDPRejectedClaim", 403]
    }, ["message"], [0]];
    PAe.TypeRegistry.for("com.amazonaws.sts").registerError(crd, jGs);
    var urd = [-3, "com.amazonaws.sts", "InvalidIdentityTokenException", {
      ["error"]: "client",
      ["httpError"]: 400,
      ["awsQueryError"]: ["InvalidIdentityToken", 400]
    }, ["message"], [0]];
    PAe.TypeRegistry.for("com.amazonaws.sts").registerError(urd, qGs);
    var drd = [-3, "com.amazonaws.sts", "MalformedPolicyDocumentException", {
      ["error"]: "client",
      ["httpError"]: 400,
      ["awsQueryError"]: ["MalformedPolicyDocument", 400]
    }, ["message"], [0]];
    PAe.TypeRegistry.for("com.amazonaws.sts").registerError(drd, BGs);
    var prd = [-3, "com.amazonaws.sts", "PackedPolicyTooLargeException", {
      ["error"]: "client",
      ["httpError"]: 400,
      ["awsQueryError"]: ["PackedPolicyTooLarge", 400]
    }, ["message"], [0]];
    PAe.TypeRegistry.for("com.amazonaws.sts").registerError(prd, $Gs);
    var mrd = [3, "com.amazonaws.sts", "PolicyDescriptorType", 0, ["arn"], [0]];
    var frd = [3, "com.amazonaws.sts", "ProvidedContext", 0, ["ProviderArn", "ContextAssertion"], [0, 0]];
    var hrd = [-3, "com.amazonaws.sts", "RegionDisabledException", {
      ["error"]: "client",
      ["httpError"]: 403,
      ["awsQueryError"]: ["RegionDisabledException", 403]
    }, ["message"], [0]];
    PAe.TypeRegistry.for("com.amazonaws.sts").registerError(hrd, HGs);
    var grd = [3, "com.amazonaws.sts", "Tag", 0, ["Key", "Value"], [0, 0]];
    var yrd = [-3, "smithy.ts.sdk.synthetic.com.amazonaws.sts", "STSServiceException", 0, [], []];
    PAe.TypeRegistry.for("smithy.ts.sdk.synthetic.com.amazonaws.sts").registerError(yrd, l_e);
    var e9s = [1, "com.amazonaws.sts", "policyDescriptorListType", 0, () => mrd];
    var _rd = [1, "com.amazonaws.sts", "ProvidedContextsListType", 0, () => frd];
    var brd = [1, "com.amazonaws.sts", "tagListType", 0, () => grd];
    var Srd = [9, "com.amazonaws.sts", "AssumeRole", 0, () => rrd, () => ord];
    var Trd = [9, "com.amazonaws.sts", "AssumeRoleWithWebIdentity", 0, () => srd, () => ird];
    class MSn extends ZNt.Command.classBuilder().ep(FGs.commonParams).m(function (e, t, n, r) {
      return [LGs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSSecurityTokenServiceV20110615", "AssumeRole", {}).n("STSClient", "AssumeRoleCommand").sc(Srd).build() {}
    class NSn extends ZNt.Command.classBuilder().ep(FGs.commonParams).m(function (e, t, n, r) {
      return [LGs.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("AWSSecurityTokenServiceV20110615", "AssumeRoleWithWebIdentity", {}).n("STSClient", "AssumeRoleWithWebIdentityCommand").sc(Trd).build() {}
    var Erd = {
      AssumeRoleCommand: MSn,
      AssumeRoleWithWebIdentityCommand: NSn
    };
    class J2r extends QNt.STSClient {}
    ZNt.createAggregatedClient(Erd, J2r);
    var t9s = e => {
      if (typeof e?.Arn === "string") {
        let t = e.Arn.split(":");
        if (t.length > 4 && t[4] !== "") {
          return t[4];
        }
      }
      return;
    };
    var n9s = async (e, t, n, r = {}) => {
      let o = typeof e === "function" ? await e() : e;
      let s = typeof t === "function" ? await t() : t;
      let i = await dnd.stsRegionDefaultResolver(r)();
      n?.debug?.("@aws-sdk/client-sts::resolveRegion", "accepting first of:", `${o} (credential provider clientConfig)`, `${s} (contextual client)`, `${i} (STS default: AWS_REGION, profile region, or us-east-1)`);
      return o ?? s ?? i;
    };
    var vrd = (e, t) => {
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
          let g = await n9s(p, e?.parentClientConfig?.region, f, {
            logger: u,
            profile: d
          });
          let y = !r9s(m);
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
        } = await n.send(new MSn(s));
        if (!i || !i.AccessKeyId || !i.SecretAccessKey) {
          throw Error(`Invalid response from STS.assumeRole call with role ${s.RoleArn}`);
        }
        let l = t9s(a);
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
        V2r.setCredentialFeature(c, "CREDENTIALS_STS_ASSUME_ROLE", "i");
        return c;
      };
    };
    var wrd = (e, t) => {
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
          let f = await n9s(u, e?.parentClientConfig?.region, p, {
            logger: l,
            profile: c
          });
          let h = !r9s(d);
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
        } = await n.send(new NSn(r));
        if (!o || !o.AccessKeyId || !o.SecretAccessKey) {
          throw Error(`Invalid response from STS.assumeRoleWithWebIdentity call with role ${r.RoleArn}`);
        }
        let i = t9s(s);
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
          V2r.setCredentialFeature(a, "RESOLVED_ACCOUNT_ID", "T");
        }
        V2r.setCredentialFeature(a, "CREDENTIALS_STS_ASSUME_ROLE_WEB_ID", "k");
        return a;
      };
    };
    var r9s = e => e?.metadata?.handlerProtocol === "h2";
    var o9s = (e, t) => {
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
    var s9s = (e = {}, t) => vrd(e, o9s(QNt.STSClient, t));
    var i9s = (e = {}, t) => wrd(e, o9s(QNt.STSClient, t));
    var Crd = e => t => e({
      roleAssumer: s9s(t),
      roleAssumerWithWebIdentity: i9s(t),
      ...t
    });
    Object.defineProperty(WN, "$Command", {
      enumerable: true,
      get: function () {
        return ZNt.Command;
      }
    });
    WN.AssumeRoleCommand = MSn;
    WN.AssumeRoleWithWebIdentityCommand = NSn;
    WN.ExpiredTokenException = UGs;
    WN.IDPCommunicationErrorException = WGs;
    WN.IDPRejectedClaimException = jGs;
    WN.InvalidIdentityTokenException = qGs;
    WN.MalformedPolicyDocumentException = BGs;
    WN.PackedPolicyTooLargeException = $Gs;
    WN.RegionDisabledException = HGs;
    WN.STS = J2r;
    WN.STSServiceException = l_e;
    WN.decorateDefaultCredentialProvider = Crd;
    WN.getDefaultRoleAssumer = s9s;
    WN.getDefaultRoleAssumerWithWebIdentity = i9s;
    Object.keys(QNt).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(WN, e)) {
        Object.defineProperty(WN, e, {
          enumerable: true,
          get: function () {
            return QNt[e];
          }
        });
      }
    });
  });