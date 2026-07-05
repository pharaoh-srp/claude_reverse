  var R9s = __commonJS($Sn => {
    Object.defineProperty($Sn, "__esModule", {
      value: true
    });
    $Sn.ruleSet = undefined;
    var b9s = {
      ["required"]: true,
      default: false,
      type: "boolean"
    };
    var S9s = {
      ["required"]: false,
      type: "string"
    };
    var T9s = {
      ["ref"]: "Endpoint"
    };
    var n$r = {
      ["fn"]: "booleanEquals",
      ["argv"]: [{
        ["ref"]: "UseFIPS"
      }, true]
    };
    var r$r = {
      ["fn"]: "booleanEquals",
      ["argv"]: [{
        ["ref"]: "UseDualStack"
      }, true]
    };
    var t2 = {};
    var o$r = {
      ["fn"]: "getAttr",
      ["argv"]: [{
        ["ref"]: "PartitionResult"
      }, "name"]
    };
    var FSn = {
      ["fn"]: "booleanEquals",
      ["argv"]: [{
        ["ref"]: "UseFIPS"
      }, false]
    };
    var USn = {
      ["fn"]: "booleanEquals",
      ["argv"]: [{
        ["ref"]: "UseDualStack"
      }, false]
    };
    var E9s = {
      ["fn"]: "getAttr",
      ["argv"]: [{
        ["ref"]: "PartitionResult"
      }, "supportsFIPS"]
    };
    var v9s = {
      ["fn"]: "booleanEquals",
      ["argv"]: [true, {
        ["fn"]: "getAttr",
        ["argv"]: [{
          ["ref"]: "PartitionResult"
        }, "supportsDualStack"]
      }]
    };
    var w9s = [{
      ["ref"]: "Region"
    }];
    var Nrd = {
      version: "1.0",
      parameters: {
        UseDualStack: b9s,
        UseFIPS: b9s,
        Endpoint: S9s,
        Region: S9s
      },
      rules: [{
        conditions: [{
          ["fn"]: "isSet",
          ["argv"]: [T9s]
        }],
        rules: [{
          conditions: [n$r],
          error: "Invalid Configuration: FIPS and custom endpoint are not supported",
          type: "error"
        }, {
          rules: [{
            conditions: [r$r],
            error: "Invalid Configuration: Dualstack and custom endpoint are not supported",
            type: "error"
          }, {
            endpoint: {
              url: T9s,
              properties: t2,
              headers: t2
            },
            type: "endpoint"
          }],
          type: "tree"
        }],
        type: "tree"
      }, {
        rules: [{
          conditions: [{
            ["fn"]: "isSet",
            ["argv"]: w9s
          }],
          rules: [{
            conditions: [{
              ["fn"]: "aws.partition",
              ["argv"]: w9s,
              assign: "PartitionResult"
            }],
            rules: [{
              conditions: [{
                ["fn"]: "stringEquals",
                ["argv"]: [o$r, "aws"]
              }, FSn, USn],
              endpoint: {
                url: "https://{Region}.signin.aws.amazon.com",
                properties: t2,
                headers: t2
              },
              type: "endpoint"
            }, {
              conditions: [{
                ["fn"]: "stringEquals",
                ["argv"]: [o$r, "aws-cn"]
              }, FSn, USn],
              endpoint: {
                url: "https://{Region}.signin.amazonaws.cn",
                properties: t2,
                headers: t2
              },
              type: "endpoint"
            }, {
              conditions: [{
                ["fn"]: "stringEquals",
                ["argv"]: [o$r, "aws-us-gov"]
              }, FSn, USn],
              endpoint: {
                url: "https://{Region}.signin.amazonaws-us-gov.com",
                properties: t2,
                headers: t2
              },
              type: "endpoint"
            }, {
              conditions: [n$r, r$r],
              rules: [{
                conditions: [{
                  ["fn"]: "booleanEquals",
                  ["argv"]: [true, E9s]
                }, v9s],
                rules: [{
                  endpoint: {
                    url: "https://signin-fips.{Region}.{PartitionResult#dualStackDnsSuffix}",
                    properties: t2,
                    headers: t2
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
              conditions: [n$r, USn],
              rules: [{
                conditions: [{
                  ["fn"]: "booleanEquals",
                  ["argv"]: [E9s, true]
                }],
                rules: [{
                  endpoint: {
                    url: "https://signin-fips.{Region}.{PartitionResult#dnsSuffix}",
                    properties: t2,
                    headers: t2
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
              conditions: [FSn, r$r],
              rules: [{
                conditions: [v9s],
                rules: [{
                  endpoint: {
                    url: "https://signin.{Region}.{PartitionResult#dualStackDnsSuffix}",
                    properties: t2,
                    headers: t2
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
                url: "https://signin.{Region}.{PartitionResult#dnsSuffix}",
                properties: t2,
                headers: t2
              },
              type: "endpoint"
            }],
            type: "tree"
          }],
          type: "tree"
        }, {
          error: "Invalid Configuration: Missing Region",
          type: "error"
        }],
        type: "tree"
      }]
    };
    $Sn.ruleSet = Nrd;
  });
  var x9s = __commonJS(HSn => {
    Object.defineProperty(HSn, "__esModule", {
      value: true
    });
    HSn.defaultEndpointResolver = undefined;
    var Lrd = Ale();
    var s$r = Lte();
    var Frd = R9s();
    var Urd = new s$r.EndpointCache({
      size: 50,
      params: ["Endpoint", "Region", "UseDualStack", "UseFIPS"]
    });
    var Brd = (e, t = {}) => Urd.get(e, () => (0, s$r.resolveEndpoint)(Frd.ruleSet, {
      endpointParams: e,
      logger: t.logger
    }));
    HSn.defaultEndpointResolver = Brd;
    s$r.customEndpointFunctions.aws = Lrd.awsEndpointFunctions;
  });
  var I9s = __commonJS(jSn => {
    Object.defineProperty(jSn, "__esModule", {
      value: true
    });
    jSn.getRuntimeConfig = undefined;
    var $rd = nw();
    var Hrd = r_e();
    var jrd = Od();
    var qrd = Pj();
    var Wrd = bY();
    var k9s = zbn();
    var A9s = jT();
    var Grd = e$r();
    var Vrd = x9s();
    var zrd = e => ({
      apiVersion: "2023-01-01",
      base64Decoder: e?.base64Decoder ?? k9s.fromBase64,
      base64Encoder: e?.base64Encoder ?? k9s.toBase64,
      disableHostPrefix: e?.disableHostPrefix ?? false,
      endpointProvider: e?.endpointProvider ?? Vrd.defaultEndpointResolver,
      extensions: e?.extensions ?? [],
      httpAuthSchemeProvider: e?.httpAuthSchemeProvider ?? Grd.defaultSigninHttpAuthSchemeProvider,
      httpAuthSchemes: e?.httpAuthSchemes ?? [{
        schemeId: "aws.auth#sigv4",
        identityProvider: t => t.getIdentityProvider("aws.auth#sigv4"),
        signer: new $rd.AwsSdkSigV4Signer()
      }, {
        schemeId: "smithy.api#noAuth",
        identityProvider: t => t.getIdentityProvider("smithy.api#noAuth") || (async () => ({})),
        signer: new jrd.NoAuthSigner()
      }],
      logger: e?.logger ?? new qrd.NoOpLogger(),
      protocol: e?.protocol ?? new Hrd.AwsRestJsonProtocol({
        defaultNamespace: "com.amazonaws.signin"
      }),
      serviceId: e?.serviceId ?? "Signin",
      urlParser: e?.urlParser ?? Wrd.parseUrl,
      utf8Decoder: e?.utf8Decoder ?? A9s.fromUtf8,
      utf8Encoder: e?.utf8Encoder ?? A9s.toUtf8
    });
    jSn.getRuntimeConfig = zrd;
  });
  var N9s = __commonJS(WSn => {
    Object.defineProperty(WSn, "__esModule", {
      value: true
    });
    WSn.getRuntimeConfig = undefined;
    var Krd = ort();
    var Yrd = Krd.__importDefault(Hbn());
    var P9s = nw();
    var O9s = Zye();
    var qSn = HA();
    var Jrd = e_e();
    var D9s = yF();
    var Jje = VB();
    var M9s = hW();
    var Xrd = t_e();
    var Qrd = Ole();
    var Zrd = I9s();
    var eod = Pj();
    var tod = s_e();
    var nod = Pj();
    var rod = e => {
      (0, nod.emitWarningIfUnsupportedVersion)(process.version);
      let t = (0, tod.resolveDefaultsModeConfig)(e);
      let n = () => t().then(eod.loadConfigsForDefaultMode);
      let r = (0, Zrd.getRuntimeConfig)(e);
      (0, P9s.emitWarningIfUnsupportedVersion)(process.version);
      let o = {
        profile: e?.profile,
        logger: r.logger
      };
      return {
        ...r,
        ...e,
        runtime: "node",
        defaultsMode: t,
        authSchemePreference: e?.authSchemePreference ?? (0, Jje.loadConfig)(P9s.NODE_AUTH_SCHEME_PREFERENCE_OPTIONS, o),
        bodyLengthChecker: e?.bodyLengthChecker ?? Xrd.calculateBodyLength,
        defaultUserAgentProvider: e?.defaultUserAgentProvider ?? (0, O9s.createDefaultUserAgentProvider)({
          serviceId: r.serviceId,
          clientVersion: Yrd.default.version
        }),
        maxAttempts: e?.maxAttempts ?? (0, Jje.loadConfig)(D9s.NODE_MAX_ATTEMPT_CONFIG_OPTIONS, e),
        region: e?.region ?? (0, Jje.loadConfig)(qSn.NODE_REGION_CONFIG_OPTIONS, {
          ...qSn.NODE_REGION_CONFIG_FILE_OPTIONS,
          ...o
        }),
        requestHandler: M9s.NodeHttpHandler.create(e?.requestHandler ?? n),
        retryMode: e?.retryMode ?? (0, Jje.loadConfig)({
          ...D9s.NODE_RETRY_MODE_CONFIG_OPTIONS,
          default: async () => (await n()).retryMode || Qrd.DEFAULT_RETRY_MODE
        }, e),
        sha256: e?.sha256 ?? Jrd.Hash.bind(null, "sha256"),
        streamCollector: e?.streamCollector ?? M9s.streamCollector,
        useDualstackEndpoint: e?.useDualstackEndpoint ?? (0, Jje.loadConfig)(qSn.NODE_USE_DUALSTACK_ENDPOINT_CONFIG_OPTIONS, o),
        useFipsEndpoint: e?.useFipsEndpoint ?? (0, Jje.loadConfig)(qSn.NODE_USE_FIPS_ENDPOINT_CONFIG_OPTIONS, o),
        userAgentAppId: e?.userAgentAppId ?? (0, Jje.loadConfig)(O9s.NODE_APP_ID_CONFIG_OPTIONS, o)
      };
    };
    WSn.getRuntimeConfig = rod;
  });
  var i5s = __commonJS(AY => {
    var L9s = qye();
    var ood = Wye();
    var sod = Gye();
    var F9s = Ple();
    var iod = HA();
    var i$r = Od();
    var jrt = qT();
    var aod = Xye();
    var Z9s = _o();
    var U9s = yF();
    var MAe = Pj();
    var B9s = e$r();
    var lod = N9s();
    var $9s = Xte();
    var H9s = eSn();
    var cod = e => Object.assign(e, {
      useDualstackEndpoint: e.useDualstackEndpoint ?? false,
      useFipsEndpoint: e.useFipsEndpoint ?? false,
      defaultSigningName: "signin"
    });
    var uod = {
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
    var dod = e => {
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
    var pod = e => ({
      httpAuthSchemes: e.httpAuthSchemes(),
      httpAuthSchemeProvider: e.httpAuthSchemeProvider(),
      credentials: e.credentials()
    });
    var fod = (e, t) => {
      let n = Object.assign($9s.getAwsRegionExtensionConfiguration(e), MAe.getDefaultExtensionConfiguration(e), H9s.getHttpHandlerExtensionConfiguration(e), dod(e));
      t.forEach(r => r.configure(n));
      return Object.assign(e, $9s.resolveAwsRegionExtensionConfiguration(n), MAe.resolveDefaultRuntimeConfig(n), H9s.resolveHttpHandlerRuntimeConfig(n), pod(n));
    };
    class a$r extends MAe.Client {
      config;
      constructor(...[e]) {
        let t = lod.getRuntimeConfig(e || {});
        super(t);
        this.initConfig = t;
        let n = cod(t);
        let r = F9s.resolveUserAgentConfig(n);
        let o = U9s.resolveRetryConfig(r);
        let s = iod.resolveRegionConfig(o);
        let i = L9s.resolveHostHeaderConfig(s);
        let a = Z9s.resolveEndpointConfig(i);
        let l = B9s.resolveHttpAuthSchemeConfig(a);
        let c = fod(l, e?.extensions || []);
        this.config = c;
        this.middlewareStack.use(jrt.getSchemaSerdePlugin(this.config));
        this.middlewareStack.use(F9s.getUserAgentPlugin(this.config));
        this.middlewareStack.use(U9s.getRetryPlugin(this.config));
        this.middlewareStack.use(aod.getContentLengthPlugin(this.config));
        this.middlewareStack.use(L9s.getHostHeaderPlugin(this.config));
        this.middlewareStack.use(ood.getLoggerPlugin(this.config));
        this.middlewareStack.use(sod.getRecursionDetectionPlugin(this.config));
        this.middlewareStack.use(i$r.getHttpAuthSchemeEndpointRuleSetPlugin(this.config, {
          httpAuthSchemeParametersProvider: B9s.defaultSigninHttpAuthSchemeParametersProvider,
          identityProviderConfigProvider: async u => new i$r.DefaultIdentityProviderConfig({
            "aws.auth#sigv4": u.credentials
          })
        }));
        this.middlewareStack.use(i$r.getHttpSigningPlugin(this.config));
      }
      destroy() {
        super.destroy();
      }
    }
    var qrt = class e extends MAe.ServiceException {
      constructor(t) {
        super(t);
        Object.setPrototypeOf(this, e.prototype);
      }
    };
    var e5s = class e extends qrt {
      name = "AccessDeniedException";
      $fault = "client";
      error;
      constructor(t) {
        super({
          name: "AccessDeniedException",
          $fault: "client",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
        this.error = t.error;
      }
    };
    var t5s = class e extends qrt {
      name = "InternalServerException";
      $fault = "server";
      error;
      constructor(t) {
        super({
          name: "InternalServerException",
          $fault: "server",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
        this.error = t.error;
      }
    };
    var n5s = class e extends qrt {
      name = "TooManyRequestsError";
      $fault = "client";
      error;
      constructor(t) {
        super({
          name: "TooManyRequestsError",
          $fault: "client",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
        this.error = t.error;
      }
    };
    var r5s = class e extends qrt {
      name = "ValidationException";
      $fault = "client";
      error;
      constructor(t) {
        super({
          name: "ValidationException",
          $fault: "client",
          ...t
        });
        Object.setPrototypeOf(this, e.prototype);
        this.error = t.error;
      }
    };
    var s5s = [0, "com.amazonaws.signin", "RefreshToken", 8, 0];
    var Pod = [-3, "com.amazonaws.signin", "AccessDeniedException", {
      ["error"]: "client"
    }, ["error", "message"], [0, 0]];
    jrt.TypeRegistry.for("com.amazonaws.signin").registerError(Pod, e5s);
    var Ood = [3, "com.amazonaws.signin", "AccessToken", 8, ["accessKeyId", "secretAccessKey", "sessionToken"], [[0, {
      ["jsonName"]: "accessKeyId"
    }], [0, {
      ["jsonName"]: "secretAccessKey"
    }], [0, {
      ["jsonName"]: "sessionToken"
    }]]];
    var Dod = [3, "com.amazonaws.signin", "CreateOAuth2TokenRequest", 0, ["tokenInput"], [[() => Mod, 16]]];
    var Mod = [3, "com.amazonaws.signin", "CreateOAuth2TokenRequestBody", 0, ["clientId", "grantType", "code", "redirectUri", "codeVerifier", "refreshToken"], [[0, {
      ["jsonName"]: "clientId"
    }], [0, {
      ["jsonName"]: "grantType"
    }], 0, [0, {
      ["jsonName"]: "redirectUri"
    }], [0, {
      ["jsonName"]: "codeVerifier"
    }], [() => s5s, {
      ["jsonName"]: "refreshToken"
    }]]];
    var Nod = [3, "com.amazonaws.signin", "CreateOAuth2TokenResponse", 0, ["tokenOutput"], [[() => Lod, 16]]];
    var Lod = [3, "com.amazonaws.signin", "CreateOAuth2TokenResponseBody", 0, ["accessToken", "tokenType", "expiresIn", "refreshToken", "idToken"], [[() => Ood, {
      ["jsonName"]: "accessToken"
    }], [0, {
      ["jsonName"]: "tokenType"
    }], [1, {
      ["jsonName"]: "expiresIn"
    }], [() => s5s, {
      ["jsonName"]: "refreshToken"
    }], [0, {
      ["jsonName"]: "idToken"
    }]]];
    var Fod = [-3, "com.amazonaws.signin", "InternalServerException", {
      ["error"]: "server",
      ["httpError"]: 500
    }, ["error", "message"], [0, 0]];
    jrt.TypeRegistry.for("com.amazonaws.signin").registerError(Fod, t5s);
    var Uod = [-3, "com.amazonaws.signin", "TooManyRequestsError", {
      ["error"]: "client",
      ["httpError"]: 429
    }, ["error", "message"], [0, 0]];
    jrt.TypeRegistry.for("com.amazonaws.signin").registerError(Uod, n5s);
    var Bod = [-3, "com.amazonaws.signin", "ValidationException", {
      ["error"]: "client",
      ["httpError"]: 400
    }, ["error", "message"], [0, 0]];
    jrt.TypeRegistry.for("com.amazonaws.signin").registerError(Bod, r5s);
    var $od = [-3, "smithy.ts.sdk.synthetic.com.amazonaws.signin", "SigninServiceException", 0, [], []];
    jrt.TypeRegistry.for("smithy.ts.sdk.synthetic.com.amazonaws.signin").registerError($od, qrt);
    var Hod = [9, "com.amazonaws.signin", "CreateOAuth2Token", {
      ["http"]: ["POST", "/v1/token", 200]
    }, () => Dod, () => Nod];
    class u$r extends MAe.Command.classBuilder().ep(uod).m(function (e, t, n, r) {
      return [Z9s.getEndpointPlugin(n, e.getEndpointParameterInstructions())];
    }).s("Signin", "CreateOAuth2Token", {}).n("SigninClient", "CreateOAuth2TokenCommand").sc(Hod).build() {}
    var jod = {
      CreateOAuth2TokenCommand: u$r
    };
    class d$r extends a$r {}
    MAe.createAggregatedClient(jod, d$r);
    var qod = {
      AUTHCODE_EXPIRED: "AUTHCODE_EXPIRED",
      INSUFFICIENT_PERMISSIONS: "INSUFFICIENT_PERMISSIONS",
      INVALID_REQUEST: "INVALID_REQUEST",
      SERVER_ERROR: "server_error",
      TOKEN_EXPIRED: "TOKEN_EXPIRED",
      USER_CREDENTIALS_CHANGED: "USER_CREDENTIALS_CHANGED"
    };
    Object.defineProperty(AY, "$Command", {
      enumerable: true,
      get: function () {
        return MAe.Command;
      }
    });
    Object.defineProperty(AY, "__Client", {
      enumerable: true,
      get: function () {
        return MAe.Client;
      }
    });
    AY.AccessDeniedException = e5s;
    AY.CreateOAuth2TokenCommand = u$r;
    AY.InternalServerException = t5s;
    AY.OAuth2ErrorCode = qod;
    AY.Signin = d$r;
    AY.SigninClient = a$r;
    AY.SigninServiceException = qrt;
    AY.TooManyRequestsError = n5s;
    AY.ValidationException = r5s;
  });