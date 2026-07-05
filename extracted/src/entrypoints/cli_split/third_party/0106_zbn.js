  var zbn = __commonJS(jNt => {
    var ajs = sjs();
    var ljs = ijs();
    Object.keys(ajs).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(jNt, e)) {
        Object.defineProperty(jNt, e, {
          enumerable: true,
          get: function () {
            return ajs[e];
          }
        });
      }
    });
    Object.keys(ljs).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(jNt, e)) {
        Object.defineProperty(jNt, e, {
          enumerable: true,
          get: function () {
            return ljs[e];
          }
        });
      }
    });
  });
  var vjs = __commonJS(Kbn => {
    Object.defineProperty(Kbn, "__esModule", {
      value: true
    });
    Kbn.ruleSet = undefined;
    var djs = {
      ["required"]: false,
      type: "string"
    };
    var pjs = {
      ["required"]: true,
      default: false,
      type: "boolean"
    };
    var mjs = {
      ["ref"]: "Endpoint"
    };
    var Sjs = {
      ["fn"]: "booleanEquals",
      ["argv"]: [{
        ["ref"]: "UseFIPS"
      }, true]
    };
    var Tjs = {
      ["fn"]: "booleanEquals",
      ["argv"]: [{
        ["ref"]: "UseDualStack"
      }, true]
    };
    var wY = {};
    var fjs = {
      ["fn"]: "getAttr",
      ["argv"]: [{
        ["ref"]: "PartitionResult"
      }, "supportsFIPS"]
    };
    var Ejs = {
      ["ref"]: "PartitionResult"
    };
    var hjs = {
      ["fn"]: "booleanEquals",
      ["argv"]: [true, {
        ["fn"]: "getAttr",
        ["argv"]: [Ejs, "supportsDualStack"]
      }]
    };
    var gjs = [Sjs];
    var yjs = [Tjs];
    var _js = [{
      ["ref"]: "Region"
    }];
    var OQu = {
      version: "1.0",
      parameters: {
        Region: djs,
        UseDualStack: pjs,
        UseFIPS: pjs,
        Endpoint: djs
      },
      rules: [{
        conditions: [{
          ["fn"]: "isSet",
          ["argv"]: [mjs]
        }],
        rules: [{
          conditions: gjs,
          error: "Invalid Configuration: FIPS and custom endpoint are not supported",
          type: "error"
        }, {
          conditions: yjs,
          error: "Invalid Configuration: Dualstack and custom endpoint are not supported",
          type: "error"
        }, {
          endpoint: {
            url: mjs,
            properties: wY,
            headers: wY
          },
          type: "endpoint"
        }],
        type: "tree"
      }, {
        conditions: [{
          ["fn"]: "isSet",
          ["argv"]: _js
        }],
        rules: [{
          conditions: [{
            ["fn"]: "aws.partition",
            ["argv"]: _js,
            assign: "PartitionResult"
          }],
          rules: [{
            conditions: [Sjs, Tjs],
            rules: [{
              conditions: [{
                ["fn"]: "booleanEquals",
                ["argv"]: [true, fjs]
              }, hjs],
              rules: [{
                endpoint: {
                  url: "https://oidc-fips.{Region}.{PartitionResult#dualStackDnsSuffix}",
                  properties: wY,
                  headers: wY
                },
                type: "endpoint"
              }],
              type: "tree"
            }, {
              error: "FIPS and DualStack are enabled, but this partition does not support one or both",
              type: "error"
            }],
            type: "tree"
          }, {
            conditions: gjs,
            rules: [{
              conditions: [{
                ["fn"]: "booleanEquals",
                ["argv"]: [fjs, true]
              }],
              rules: [{
                conditions: [{
                  ["fn"]: "stringEquals",
                  ["argv"]: [{
                    ["fn"]: "getAttr",
                    ["argv"]: [Ejs, "name"]
                  }, "aws-us-gov"]
                }],
                endpoint: {
                  url: "https://oidc.{Region}.amazonaws.com",
                  properties: wY,
                  headers: wY
                },
                type: "endpoint"
              }, {
                endpoint: {
                  url: "https://oidc-fips.{Region}.{PartitionResult#dnsSuffix}",
                  properties: wY,
                  headers: wY
                },
                type: "endpoint"
              }],
              type: "tree"
            }, {
              error: "FIPS is enabled but this partition does not support FIPS",
              type: "error"
            }],
            type: "tree"
          }, {
            conditions: yjs,
            rules: [{
              conditions: [hjs],
              rules: [{
                endpoint: {
                  url: "https://oidc.{Region}.{PartitionResult#dualStackDnsSuffix}",
                  properties: wY,
                  headers: wY
                },
                type: "endpoint"
              }],
              type: "tree"
            }, {
              error: "DualStack is enabled but this partition does not support DualStack",
              type: "error"
            }],
            type: "tree"
          }, {
            endpoint: {
              url: "https://oidc.{Region}.{PartitionResult#dnsSuffix}",
              properties: wY,
              headers: wY
            },
            type: "endpoint"
          }],
          type: "tree"
        }],
        type: "tree"
      }, {
        error: "Invalid Configuration: Missing Region",
        type: "error"
      }]
    };
    Kbn.ruleSet = OQu;
  });
  var wjs = __commonJS(Ybn => {
    Object.defineProperty(Ybn, "__esModule", {
      value: true
    });
    Ybn.defaultEndpointResolver = undefined;
    var DQu = Ale();
    var s2r = Lte();
    var MQu = vjs();
    var NQu = new s2r.EndpointCache({
      size: 50,
      params: ["Endpoint", "Region", "UseDualStack", "UseFIPS"]
    });
    var LQu = (e, t = {}) => NQu.get(e, () => (0, s2r.resolveEndpoint)(MQu.ruleSet, {
      endpointParams: e,
      logger: t.logger
    }));
    Ybn.defaultEndpointResolver = LQu;
    s2r.customEndpointFunctions.aws = DQu.awsEndpointFunctions;
  });
  var xjs = __commonJS(Jbn => {
    Object.defineProperty(Jbn, "__esModule", {
      value: true
    });
    Jbn.getRuntimeConfig = undefined;
    var FQu = nw();
    var UQu = r_e();
    var BQu = Od();
    var $Qu = Pj();
    var HQu = bY();
    var Cjs = zbn();
    var Rjs = jT();
    var jQu = HBr();
    var qQu = wjs();
    var WQu = e => ({
      apiVersion: "2019-06-10",
      base64Decoder: e?.base64Decoder ?? Cjs.fromBase64,
      base64Encoder: e?.base64Encoder ?? Cjs.toBase64,
      disableHostPrefix: e?.disableHostPrefix ?? false,
      endpointProvider: e?.endpointProvider ?? qQu.defaultEndpointResolver,
      extensions: e?.extensions ?? [],
      httpAuthSchemeProvider: e?.httpAuthSchemeProvider ?? jQu.defaultSSOOIDCHttpAuthSchemeProvider,
      httpAuthSchemes: e?.httpAuthSchemes ?? [{
        schemeId: "aws.auth#sigv4",
        identityProvider: t => t.getIdentityProvider("aws.auth#sigv4"),
        signer: new FQu.AwsSdkSigV4Signer()
      }, {
        schemeId: "smithy.api#noAuth",
        identityProvider: t => t.getIdentityProvider("smithy.api#noAuth") || (async () => ({})),
        signer: new BQu.NoAuthSigner()
      }],
      logger: e?.logger ?? new $Qu.NoOpLogger(),
      protocol: e?.protocol ?? new UQu.AwsRestJsonProtocol({
        defaultNamespace: "com.amazonaws.ssooidc"
      }),
      serviceId: e?.serviceId ?? "SSO OIDC",
      urlParser: e?.urlParser ?? HQu.parseUrl,
      utf8Decoder: e?.utf8Decoder ?? Rjs.fromUtf8,
      utf8Encoder: e?.utf8Encoder ?? Rjs.toUtf8
    });
    Jbn.getRuntimeConfig = WQu;
  });
  var s_e = __commonJS(Pjs => {
    var GQu = HA();
    var kjs = VB();
    var VQu = wy();
    var YQu = ["in-region", "cross-region", "mobile", "standard", "legacy"];
    var ZQu = {
      environmentVariableSelector: e => e["AWS_DEFAULTS_MODE"],
      configFileSelector: e => e["defaults_mode"],
      default: "legacy"
    };
    var eZu = ({
      region: e = kjs.loadConfig(GQu.NODE_REGION_CONFIG_OPTIONS),
      defaultsMode: t = kjs.loadConfig(ZQu)
    } = {}) => VQu.memoize(async () => {
      let n = typeof t === "function" ? await t() : t;
      switch (n?.toLowerCase()) {
        case "auto":
          return tZu(e);
        case "in-region":
        case "cross-region":
        case "mobile":
        case "standard":
        case "legacy":
          return Promise.resolve(n?.toLocaleLowerCase());
        case undefined:
          return Promise.resolve("legacy");
        default:
          throw Error(`Invalid parameter for "defaultsMode", expect ${YQu.join(", ")}, got ${n}`);
      }
    });
    var tZu = async e => {
      if (e) {
        let t = typeof e === "function" ? await e() : e;
        let n = await nZu();
        if (!n) {
          return "standard";
        }
        if (t === n) {
          return "in-region";
        } else {
          return "cross-region";
        }
      }
      return "standard";
    };
    var nZu = async () => {
      if (process.env["AWS_EXECUTION_ENV"] && (process.env["AWS_REGION"] || process.env["AWS_DEFAULT_REGION"])) {
        return process.env["AWS_REGION"] ?? process.env["AWS_DEFAULT_REGION"];
      }
      if (!process.env["AWS_EC2_METADATA_DISABLED"]) {
        try {
          let {
            getInstanceMetadataEndpoint: e,
            httpRequest: t
          } = await Promise.resolve().then(() => (Dje(), dNt));
          let n = await e();
          return (await t({
            ...n,
            path: "/latest/meta-data/placement/region"
          })).toString();
        } catch (e) {}
      }
    };
    Pjs.resolveDefaultsModeConfig = eZu;
  });
  var Ljs = __commonJS(Qbn => {
    Object.defineProperty(Qbn, "__esModule", {
      value: true
    });
    Qbn.getRuntimeConfig = undefined;
    var rZu = ort();
    var oZu = rZu.__importDefault(Hbn());
    var Ojs = nw();
    var Djs = Zye();
    var Xbn = HA();
    var sZu = e_e();
    var Mjs = yF();
    var jje = VB();
    var Njs = hW();
    var iZu = t_e();
    var aZu = Ole();
    var lZu = xjs();
    var cZu = Pj();
    var uZu = s_e();
    var dZu = Pj();
    var pZu = e => {
      (0, dZu.emitWarningIfUnsupportedVersion)(process.version);
      let t = (0, uZu.resolveDefaultsModeConfig)(e);
      let n = () => t().then(cZu.loadConfigsForDefaultMode);
      let r = (0, lZu.getRuntimeConfig)(e);
      (0, Ojs.emitWarningIfUnsupportedVersion)(process.version);
      let o = {
        profile: e?.profile,
        logger: r.logger
      };
      return {
        ...r,
        ...e,
        runtime: "node",
        defaultsMode: t,
        authSchemePreference: e?.authSchemePreference ?? (0, jje.loadConfig)(Ojs.NODE_AUTH_SCHEME_PREFERENCE_OPTIONS, o),
        bodyLengthChecker: e?.bodyLengthChecker ?? iZu.calculateBodyLength,
        defaultUserAgentProvider: e?.defaultUserAgentProvider ?? (0, Djs.createDefaultUserAgentProvider)({
          serviceId: r.serviceId,
          clientVersion: oZu.default.version
        }),
        maxAttempts: e?.maxAttempts ?? (0, jje.loadConfig)(Mjs.NODE_MAX_ATTEMPT_CONFIG_OPTIONS, e),
        region: e?.region ?? (0, jje.loadConfig)(Xbn.NODE_REGION_CONFIG_OPTIONS, {
          ...Xbn.NODE_REGION_CONFIG_FILE_OPTIONS,
          ...o
        }),
        requestHandler: Njs.NodeHttpHandler.create(e?.requestHandler ?? n),
        retryMode: e?.retryMode ?? (0, jje.loadConfig)({
          ...Mjs.NODE_RETRY_MODE_CONFIG_OPTIONS,
          default: async () => (await n()).retryMode || aZu.DEFAULT_RETRY_MODE
        }, e),
        sha256: e?.sha256 ?? sZu.Hash.bind(null, "sha256"),
        streamCollector: e?.streamCollector ?? Njs.streamCollector,
        useDualstackEndpoint: e?.useDualstackEndpoint ?? (0, jje.loadConfig)(Xbn.NODE_USE_DUALSTACK_ENDPOINT_CONFIG_OPTIONS, o),
        useFipsEndpoint: e?.useFipsEndpoint ?? (0, jje.loadConfig)(Xbn.NODE_USE_FIPS_ENDPOINT_CONFIG_OPTIONS, o),
        userAgentAppId: e?.userAgentAppId ?? (0, jje.loadConfig)(Djs.NODE_APP_ID_CONFIG_OPTIONS, o)
      };
    };
    Qbn.getRuntimeConfig = pZu;
  });