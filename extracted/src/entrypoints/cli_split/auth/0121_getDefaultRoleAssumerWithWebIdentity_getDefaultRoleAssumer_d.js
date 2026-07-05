  __export(D3r, {
    getDefaultRoleAssumerWithWebIdentity: () => getDefaultRoleAssumerWithWebIdentity,
    getDefaultRoleAssumer: () => getDefaultRoleAssumer,
    decorateDefaultCredentialProvider: () => decorateDefaultCredentialProvider,
    __Client: () => Client_export4,
    SessionDurationEscalationException: () => SessionDurationEscalationException,
    STSServiceException: () => STSServiceException,
    STSClient: () => STSClient,
    STS: () => STS,
    RegionDisabledException: () => RegionDisabledException,
    PackedPolicyTooLargeException: () => PackedPolicyTooLargeException,
    OutboundWebIdentityFederationDisabledException: () => OutboundWebIdentityFederationDisabledException,
    MalformedPolicyDocumentException: () => MalformedPolicyDocumentException,
    JWTPayloadSizeExceededException: () => JWTPayloadSizeExceededException,
    InvalidIdentityTokenException: () => InvalidIdentityTokenException,
    InvalidAuthorizationMessageException: () => InvalidAuthorizationMessageException,
    IDPRejectedClaimException: () => IDPRejectedClaimException,
    IDPCommunicationErrorException: () => IDPCommunicationErrorException,
    GetWebIdentityTokenCommand: () => GetWebIdentityTokenCommand,
    GetSessionTokenCommand: () => GetSessionTokenCommand,
    GetFederationTokenCommand: () => GetFederationTokenCommand,
    GetDelegatedAccessTokenCommand: () => GetDelegatedAccessTokenCommand,
    GetCallerIdentityCommand: () => GetCallerIdentityCommand,
    GetAccessKeyInfoCommand: () => GetAccessKeyInfoCommand,
    ExpiredTradeInTokenException: () => ExpiredTradeInTokenException,
    ExpiredTokenException: () => ExpiredTokenException,
    DecodeAuthorizationMessageCommand: () => DecodeAuthorizationMessageCommand,
    AssumeRootCommand: () => AssumeRootCommand,
    AssumeRoleWithWebIdentityCommand: () => AssumeRoleWithWebIdentityCommand,
    AssumeRoleWithSAMLCommand: () => AssumeRoleWithSAMLCommand,
    AssumeRoleCommand: () => AssumeRoleCommand,
    $Command: () => Command_export4
  });
  var M3r = __lazy(() => {
    Nwn();
    Y1t();
    kii();
    Aii();
    S3r();
    $ii();
  });
  var Hii;
  var createCredentialChain = (...e) => {
    let t = -1;
    let r = Object.assign(async o => {
      let s = await propertyProviderChain(...e)(o);
      if (!s.expiration && t !== -1) {
        s.expiration = new Date(Date.now() + t);
      }
      return s;
    }, {
      expireAfter(o) {
        if (o < 300000) {
          throw Error("@aws-sdk/credential-providers - createCredentialChain(...).expireAfter(ms) may not be called with a duration lower than five minutes.");
        }
        t = o;
        return r;
      }
    });
    return r;
  };
  var propertyProviderChain = (...e) => async t => {
    if (e.length === 0) {
      throw new Hii.ProviderError("No providers in chain", {
        tryNextLink: false
      });
    }
    let n;
    for (let r of e) {
      try {
        return await r(t);
      } catch (o) {
        if (n = o, o?.tryNextLink) {
          continue;
        }
        throw o;
      }
    }
    throw n;
  };
  var qii = __lazy(() => {
    Hii = __toESM(wy(), 1);
  });
  var Wii = () => {};
  var Gii = () => {};
  var Vii = () => {};
  function Ywn(e) {
    return Promise.all(Object.keys(e).reduce((t, n) => {
      let r = e[n];
      if (typeof r === "string") {
        t.push([n, r]);
      } else {
        t.push(r().then(o => [n, o]));
      }
      return t;
    }, [])).then(t => t.reduce((n, [r, o]) => (n[r] = o, n), {}));
  }
  class Client_export5 {
    config;
    middlewareStack = zii.constructStack();
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
  var zii;
  var Kii = __lazy(() => {
    zii = __toESM(QB(), 1);
  });
  var Yii;
  var Jii = __lazy(() => {
    Yii = __toESM(tw(), 1);
  });
  var Xii = () => {};
  var Qii;
  var Zii = __lazy(() => {
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(Qii || (Qii = {}));
  });
  var eai;
  var tai = __lazy(() => {
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(eai || (eai = {}));
  });
  var nai = () => {};
  var rai = () => {};
  var oai = () => {};
  var sai = () => {};
  var iai = __lazy(() => {
    Zii();
    tai();
    nai();
    rai();
    oai();
    sai();
  });
  var aai = () => {};
  var lai = () => {};
  var cai = () => {};
  var uai = () => {};
  var dai = () => {};
  var pai = () => {};
  var mai = () => {};
  var fai = __lazy(() => {
    dai();
    pai();
    mai();
  });
  var hai = () => {};
  var gai = () => {};
  var yai;
  var _ai = __lazy(() => {
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(yai || (yai = {}));
  });
  var bai = () => {};
  var Sai = () => {};
  var Tai = () => {};
  var Eai = () => {};
  var vai = () => {};
  var wai = __lazy(() => {
    bai();
    Sai();
    Tai();
    Eai();
    vai();
  });
  var Cai = () => {};
  var qot;
  var Rai = __lazy(() => {
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(qot || (qot = {}));
  });
  var xai = () => {};
  var kai = () => {};
  var Aai = __lazy(() => {
    Rai();
    xai();
    kai();
  });
  var Iai = () => {};
  var Pai;
  var Oai = __lazy(() => {
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(Pai || (Pai = {}));
  });
  var Dai = () => {};
  var Mai = () => {};
  var Nai = () => {};
  var Lai = () => {};
  var Fai = () => {};
  var Uai = __lazy(() => {
    Mai();
    Nai();
    Lai();
    Fai();
  });
  var Bai = () => {};
  var Hai = () => {};
  var jai;
  var qai = __lazy(() => {
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(jai || (jai = {}));
  });
  var Wai = () => {};
  var Gai = () => {};
  var Vai = () => {};
  var zai = () => {};
  var Kai = () => {};
  var Yai = () => {};
  var Jai = () => {};
  var Xai = () => {};
  var Qai = () => {};
  var Zai = () => {};
  var eli = () => {};
  var tli = () => {};
  var nli = () => {};
  var rli = () => {};
  var oli;
  var sli = __lazy(() => {
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(oli || (oli = {}));
  });
  var ili = () => {};
  var ali = () => {};
  var lli = () => {};
  var cli = () => {};
  var uli = () => {};
  var dli = () => {};
  var pli = () => {};
  var N3r = __lazy(() => {
    Xii();
    iai();
    aai();
    lai();
    cai();
    uai();
    fai();
    hai();
    gai();
    _ai();
    wai();
    Cai();
    Aai();
    Iai();
    Oai();
    Dai();
    Uai();
    Bai();
    Hai();
    qai();
    Wai();
    Gai();
    Vai();
    zai();
    Kai();
    Yai();
    Jai();
    Xai();
    Qai();
    Zai();
    eli();
    tli();
    nli();
    rli();
    sli();
    ili();
    ali();
    lli();
    cli();
    uli();
    dli();
    pli();
  });
  function Xwn(e, t) {
    if (t == null) {
      return t;
    }
    let n = mli.NormalizedSchema.of(e);
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
          o[s] = Xwn(i, r[s]);
        }
      }
      return o;
    }
    return t;
  }
  var mli;
  var fli = __lazy(() => {
    mli = __toESM(qT(), 1);
  });
  class Command_export5 {
    middlewareStack = hli.constructStack();
    schema;
    static classBuilder() {
      return new gli();
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
  class gli {
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
      return t = class extends Command_export5 {
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
            inputFilterSensitiveLog: e._inputFilterSensitiveLog ?? (s ? Xwn.bind(null, i) : l => l),
            outputFilterSensitiveLog: e._outputFilterSensitiveLog ?? (s ? Xwn.bind(null, a) : l => l),
            smithyContext: e._smithyContext,
            additionalContext: e._additionalContext
          });
        }
        serialize = e._serializer;
        deserialize = e._deserializer;
      };
    }
  }
  var hli;
  var yli = __lazy(() => {
    N3r();
    fli();
    hli = __toESM(QB(), 1);
  });
  var createAggregatedClient_export5 = (e, t) => {
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
  var ServiceException_export5;
  var decorateServiceException_export5 = (e, t = {}) => {
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
  var B3r = __lazy(() => {
    ServiceException_export5 = class i0e extends Error {
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
        return i0e.prototype.isPrototypeOf(t) || Boolean(t.$fault) && Boolean(t.$metadata) && (t.$fault === "client" || t.$fault === "server");
      }
      static [Symbol.hasInstance](e) {
        if (!e) {
          return false;
        }
        let t = e;
        if (this === i0e) {
          return i0e.isInstance(e);
        }
        if (i0e.isInstance(e)) {
          if (t.name && this.name) {
            return this.prototype.isPrototypeOf(e) || t.name === this.name;
          }
          return this.prototype.isPrototypeOf(e);
        }
        return false;
      }
    };
  });
  var throwDefaultError_export5 = ({
    output: e,
    parsedBody: t,
    exceptionCtor: n,
    errorCode: r
  }) => {
    let o = PTd(e);
    let s = o.httpStatusCode ? o.httpStatusCode + "" : undefined;
    let i = new n({
      name: t?.code || t?.Code || r || s || "UnknownError",
      $fault: "client",
      $metadata: o
    });
    throw decorateServiceException_export5(i, t);
  };
  var withBaseException_export5 = e => ({
    output: t,
    parsedBody: n,
    errorCode: r
  }) => {
    throwDefaultError_export5({
      output: t,
      parsedBody: n,
      exceptionCtor: e,
      errorCode: r
    });
  };
  var PTd = e => ({
    httpStatusCode: e.statusCode,
    requestId: e.headers["x-amzn-requestid"] ?? e.headers["x-amzn-request-id"] ?? e.headers["x-amz-request-id"],
    extendedRequestId: e.headers["x-amz-id-2"],
    cfId: e.headers["x-amz-cf-id"]
  });
  var bli = __lazy(() => {
    B3r();
  });
  var loadConfigsForDefaultMode_export5 = e => {
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
  var Sli = false;
  var emitWarningIfUnsupportedVersion_export5 = e => {
    if (e && !Sli && parseInt(e.substring(1, e.indexOf("."))) < 16) {
      Sli = true;
    }
  };
  var Tli;
  var Eli = __lazy(() => {
    Tli = __toESM(tw(), 1);
  });
  var vli = e => {
    let t = [];
    for (let n in qot) {
      let r = qot[n];
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
  var wli = e => {
    let t = {};
    e.checksumAlgorithms().forEach(n => {
      t[n.algorithmId()] = n.checksumConstructor();
    });
    return t;
  };
  var Cli = __lazy(() => {
    N3r();
  });
  var Rli = e => ({
    setRetryStrategy(t) {
      e.retryStrategy = t;
    },
    retryStrategy() {
      return e.retryStrategy;
    }
  });
  var xli = e => {
    let t = {};
    t.retryStrategy = e.retryStrategy();
    return t;
  };
  var getDefaultExtensionConfiguration_export5 = e => Object.assign(vli(e), Rli(e));
  var resolveDefaultRuntimeConfig_export5 = e => Object.assign(wli(e), xli(e));
  var Ali = __lazy(() => {});
  var getArrayIfSingleItem_export5 = e => Array.isArray(e) ? e : [e];
  var getValueFromTextNode_export5 = e => {
    for (let n in e) {
      if (e.hasOwnProperty(n) && e[n]["#text"] !== undefined) {
        e[n] = e[n]["#text"];
      } else if (typeof e[n] === "object" && e[n] !== null) {
        e[n] = getValueFromTextNode_export5(e[n]);
      }
    }
    return e;
  };
  var isSerializableHeaderValue_export5 = e => e != null;
  class NoOpLogger_export5 {
    trace() {}
    debug() {}
    info() {}
    warn() {}
    error() {}
  }
  function map_export7(e, t, n) {
    let r;
    let o;
    let s;
    if (typeof t > "u" && typeof n > "u") {
      r = {};
      s = e;
    } else if (r = e, typeof t === "function") {
      o = t;
      s = n;
      return FTd(r, o, s);
    } else {
      s = t;
    }
    for (let i of Object.keys(s)) {
      if (!Array.isArray(s[i])) {
        r[i] = s[i];
        continue;
      }
      Oli(r, null, s, i);
    }
    return r;
  }
  var convertMap_export5 = e => {
    let t = {};
    for (let [n, r] of Object.entries(e || {})) {
      t[n] = [, r];
    }
    return t;
  };
  var take_export5 = (e, t) => {
    let n = {};
    for (let r in t) {
      Oli(n, e, t, r);
    }
    return n;
  };
  var FTd = (e, t, n) => map_export7(e, Object.entries(n).reduce((r, [o, s]) => {
    if (Array.isArray(s)) {
      r[o] = s;
    } else if (typeof s === "function") {
      r[o] = [t, s()];
    } else {
      r[o] = [t, s];
    }
    return r;
  }, {}));
  var Oli = (e, t, n, r) => {
    if (t !== null) {
      let i = n[r];
      if (typeof i === "function") {
        i = [, i];
      }
      let [a = UTd, l = BTd, c = r] = i;
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
  var UTd = e => e != null;
  var BTd = e => e;
  var Dli;
  var Mli = __lazy(() => {
    Dli = __toESM(tw(), 1);
  });
  var serializeFloat_export5 = e => {
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
  var serializeDateTime_export5 = e => e.toISOString().replace(".000Z", "Z");
  var _json_export5 = e => {
    if (e == null) {
      return {};
    }
    if (Array.isArray(e)) {
      return e.filter(t => t != null).map(_json_export5);
    }
    if (typeof e === "object") {
      let t = {};
      for (let n of Object.keys(e)) {
        if (e[n] == null) {
          continue;
        }
        t[n] = _json_export5(e[n]);
      }
      return t;
    }
    return e;
  };
  var xk = {};