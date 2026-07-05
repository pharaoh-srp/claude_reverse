  var dqs = async (e, t = {}) => {
    let {
      SSOOIDCClient: n
    } = await Promise.resolve().then(() => __toESM(u2r(), 1));
    let r = s => t.clientConfig?.[s] ?? t.parentClientConfig?.[s];
    return new n(Object.assign({}, t.clientConfig ?? {}, {
      region: e ?? t.clientConfig?.region,
      logger: r("logger"),
      userAgentAppId: r("userAgentAppId")
    }));
  };
  var pqs = async (e, t, n = {}) => {
    let {
      CreateTokenCommand: r
    } = await Promise.resolve().then(() => __toESM(u2r(), 1));
    return (await dqs(t, n)).send(new r({
      clientId: e.clientId,
      clientSecret: e.clientSecret,
      refreshToken: e.refreshToken,
      grantType: "refresh_token"
    }));
  };
  var mqs = () => {};
  var fqs;
  var d2r = e => {
    if (e.expiration && e.expiration.getTime() < Date.now()) {
      throw new fqs.TokenProviderError(`Token is expired. ${"To refresh this SSO session run 'aws sso login' with the corresponding profile."}`, false);
    }
  };
  var hqs = __lazy(() => {
    fqs = __toESM(wy(), 1);
  });
  var gqs;
  var vAe = (e, t, n = false) => {
    if (typeof t > "u") {
      throw new gqs.TokenProviderError(`Value not present for '${e}' in SSO Token${n ? ". Cannot refresh" : ""}. ${"To refresh this SSO session run 'aws sso login' with the corresponding profile."}`, false);
    }
  };
  var yqs = __lazy(() => {
    gqs = __toESM(wy(), 1);
  });
  var _qs;
  var bqs;
  var Ded;
  var Sqs = (e, t) => {
    let n = _qs.getSSOTokenFilepath(e);
    let r = JSON.stringify(t, null, 2);
    return Ded(n, r);
  };
  var Tqs = __lazy(() => {
    _qs = __toESM(Sj(), 1);
    bqs = require("fs");
    ({
      writeFile: Ded
    } = bqs.promises);
  });
  var xrt;
  var wAe;
  var Eqs;
  var tSn = (e = {}) => async ({
    callerClientConfig: t
  } = {}) => {
    let n = {
      ...e,
      parentClientConfig: {
        ...t,
        ...e.parentClientConfig
      }
    };
    n.logger?.debug("@aws-sdk/token-providers - fromSso");
    let r = await wAe.parseKnownFiles(n);
    let o = wAe.getProfileName({
      profile: n.profile ?? t?.profile
    });
    let s = r[o];
    if (!s) {
      throw new xrt.TokenProviderError(`Profile '${o}' could not be found in shared credentials file.`, false);
    } else if (!s.sso_session) {
      throw new xrt.TokenProviderError(`Profile '${o}' is missing required property 'sso_session'.`);
    }
    let i = s.sso_session;
    let l = (await wAe.loadSsoSessionData(n))[i];
    if (!l) {
      throw new xrt.TokenProviderError(`Sso session '${i}' could not be found in shared credentials file.`, false);
    }
    for (let h of ["sso_start_url", "sso_region"]) {
      if (!l[h]) {
        throw new xrt.TokenProviderError(`Sso session '${i}' is missing required property '${h}'.`, false);
      }
    }
    let {
      sso_start_url: c,
      sso_region: u
    } = l;
    let d;
    try {
      d = await wAe.getSSOTokenFromFile(i);
    } catch (h) {
      throw new xrt.TokenProviderError(`The SSO session token associated with profile=${o} was not found or is invalid. ${"To refresh this SSO session run 'aws sso login' with the corresponding profile."}`, false);
    }
    vAe("accessToken", d.accessToken);
    vAe("expiresAt", d.expiresAt);
    let {
      accessToken: p,
      expiresAt: m
    } = d;
    let f = {
      token: p,
      expiration: new Date(m)
    };
    if (f.expiration.getTime() - Date.now() > 300000) {
      return f;
    }
    if (Date.now() - Eqs.getTime() < 30000) {
      d2r(f);
      return f;
    }
    vAe("clientId", d.clientId, true);
    vAe("clientSecret", d.clientSecret, true);
    vAe("refreshToken", d.refreshToken, true);
    try {
      Eqs.setTime(Date.now());
      let h = await pqs(d, u, n);
      vAe("accessToken", h.accessToken);
      vAe("expiresIn", h.expiresIn);
      let g = new Date(Date.now() + h.expiresIn * 1000);
      try {
        await Sqs(i, {
          ...d,
          accessToken: h.accessToken,
          expiresAt: g.toISOString(),
          refreshToken: h.refreshToken
        });
      } catch (y) {}
      return {
        token: h.accessToken,
        expiration: g
      };
    } catch (h) {
      d2r(f);
      return f;
    }
  };
  var p2r = __lazy(() => {
    mqs();
    hqs();
    yqs();
    Tqs();
    xrt = __toESM(wy(), 1);
    wAe = __toESM(Sj(), 1);
    Eqs = new Date(0);
  });
  var vqs = () => {};
  var krt;
  var nSn = (e = {}) => krt.memoize(krt.chain(tSn(e), async () => {
    throw new krt.TokenProviderError("Could not load token from any providers", false);
  }), t => t.expiration !== undefined && t.expiration.getTime() - Date.now() < 300000, t => t.expiration !== undefined);
  var wqs = __lazy(() => {
    p2r();
    krt = __toESM(wy(), 1);
  });
  var rSn = __lazy(() => {
    SBs();
    p2r();
    vqs();
    wqs();
  });
  class Client_export {
    config;
    middlewareStack = Cqs.constructStack();
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
  var Cqs;
  var Rqs = __lazy(() => {
    Cqs = __toESM(QB(), 1);
  });
  var xqs;
  var kqs = __lazy(() => {
    xqs = __toESM(tw(), 1);
  });
  var Aqs = () => {};
  var Iqs;
  var Pqs = __lazy(() => {
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(Iqs || (Iqs = {}));
  });
  var Oqs;
  var Dqs = __lazy(() => {
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(Oqs || (Oqs = {}));
  });
  var Mqs = () => {};
  var Nqs = () => {};
  var Lqs = () => {};
  var Fqs = () => {};
  var Uqs = __lazy(() => {
    Pqs();
    Dqs();
    Mqs();
    Nqs();
    Lqs();
    Fqs();
  });
  var Bqs = () => {};
  var $qs = () => {};
  var Hqs = () => {};
  var jqs = () => {};
  var qqs = () => {};
  var Wqs = () => {};
  var Gqs = () => {};
  var Vqs = __lazy(() => {
    qqs();
    Wqs();
    Gqs();
  });
  var zqs = () => {};
  var Kqs = () => {};
  var Yqs;
  var Jqs = __lazy(() => {
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(Yqs || (Yqs = {}));
  });
  var Xqs = () => {};
  var Qqs = () => {};
  var Zqs = () => {};
  var e3s = () => {};
  var t3s = () => {};
  var n3s = __lazy(() => {
    Xqs();
    Qqs();
    Zqs();
    e3s();
    t3s();
  });
  var r3s = () => {};
  var Art;
  var o3s = __lazy(() => {
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(Art || (Art = {}));
  });
  var s3s = () => {};
  var i3s = () => {};
  var a3s = __lazy(() => {
    o3s();
    s3s();
    i3s();
  });
  var l3s = () => {};
  var c3s;
  var u3s = __lazy(() => {
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(c3s || (c3s = {}));
  });
  var d3s = () => {};
  var p3s = () => {};
  var m3s = () => {};
  var f3s = () => {};
  var h3s = () => {};
  var g3s = __lazy(() => {
    p3s();
    m3s();
    f3s();
    h3s();
  });
  var y3s = () => {};
  var b3s = () => {};
  var S3s;
  var T3s = __lazy(() => {
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(S3s || (S3s = {}));
  });
  var E3s = () => {};
  var v3s = () => {};
  var w3s = () => {};
  var C3s = () => {};
  var R3s = () => {};
  var x3s = () => {};
  var k3s = () => {};
  var A3s = () => {};
  var I3s = () => {};
  var P3s = () => {};
  var O3s = () => {};
  var D3s = () => {};
  var M3s = () => {};
  var N3s = () => {};
  var L3s;
  var F3s = __lazy(() => {
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(L3s || (L3s = {}));
  });
  var U3s = () => {};
  var B3s = () => {};
  var $3s = () => {};
  var H3s = () => {};
  var j3s = () => {};
  var q3s = () => {};
  var W3s = () => {};
  var m2r = __lazy(() => {
    Aqs();
    Uqs();
    Bqs();
    $qs();
    Hqs();
    jqs();
    Vqs();
    zqs();
    Kqs();
    Jqs();
    n3s();
    r3s();
    a3s();
    l3s();
    u3s();
    d3s();
    g3s();
    y3s();
    b3s();
    T3s();
    E3s();
    v3s();
    w3s();
    C3s();
    R3s();
    x3s();
    k3s();
    A3s();
    I3s();
    P3s();
    O3s();
    D3s();
    M3s();
    N3s();
    F3s();
    U3s();
    B3s();
    $3s();
    H3s();
    j3s();
    q3s();
    W3s();
  });
  function sSn(e, t) {
    if (t == null) {
      return t;
    }
    let n = G3s.NormalizedSchema.of(e);
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
          o[s] = sSn(i, r[s]);
        }
      }
      return o;
    }
    return t;
  }
  var G3s;
  var V3s = __lazy(() => {
    G3s = __toESM(qT(), 1);
  });
  class Command_export {
    middlewareStack = z3s.constructStack();
    schema;
    static classBuilder() {
      return new K3s();
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
  class K3s {
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
      return t = class extends Command_export {
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
            inputFilterSensitiveLog: e._inputFilterSensitiveLog ?? (s ? sSn.bind(null, i) : l => l),
            outputFilterSensitiveLog: e._outputFilterSensitiveLog ?? (s ? sSn.bind(null, a) : l => l),
            smithyContext: e._smithyContext,
            additionalContext: e._additionalContext
          });
        }
        serialize = e._serializer;
        deserialize = e._deserializer;
      };
    }
  }
  var z3s;
  var Y3s = __lazy(() => {
    m2r();
    V3s();
    z3s = __toESM(QB(), 1);
  });
  var createAggregatedClient_export = (e, t) => {
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
  var ServiceException_export;
  var decorateServiceException_export = (e, t = {}) => {
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
  var y2r = __lazy(() => {
    ServiceException_export = class CAe extends Error {
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
        return CAe.prototype.isPrototypeOf(t) || Boolean(t.$fault) && Boolean(t.$metadata) && (t.$fault === "client" || t.$fault === "server");
      }
      static [Symbol.hasInstance](e) {
        if (!e) {
          return false;
        }
        let t = e;
        if (this === CAe) {
          return CAe.isInstance(e);
        }
        if (CAe.isInstance(e)) {
          if (t.name && this.name) {
            return this.prototype.isPrototypeOf(e) || t.name === this.name;
          }
          return this.prototype.isPrototypeOf(e);
        }
        return false;
      }
    };
  });
  var throwDefaultError_export = ({
    output: e,
    parsedBody: t,
    exceptionCtor: n,
    errorCode: r
  }) => {
    let o = Led(e);
    let s = o.httpStatusCode ? o.httpStatusCode + "" : undefined;
    let i = new n({
      name: t?.code || t?.Code || r || s || "UnknownError",
      $fault: "client",
      $metadata: o
    });
    throw decorateServiceException_export(i, t);
  };
  var withBaseException_export = e => ({
    output: t,
    parsedBody: n,
    errorCode: r
  }) => {
    throwDefaultError_export({
      output: t,
      parsedBody: n,
      exceptionCtor: e,
      errorCode: r
    });
  };
  var Led = e => ({
    httpStatusCode: e.statusCode,
    requestId: e.headers["x-amzn-requestid"] ?? e.headers["x-amzn-request-id"] ?? e.headers["x-amz-request-id"],
    extendedRequestId: e.headers["x-amz-id-2"],
    cfId: e.headers["x-amz-cf-id"]
  });
  var X3s = __lazy(() => {
    y2r();
  });
  var loadConfigsForDefaultMode_export = e => {
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
  var Q3s = false;
  var emitWarningIfUnsupportedVersion_export = e => {
    if (e && !Q3s && parseInt(e.substring(1, e.indexOf("."))) < 16) {
      Q3s = true;
    }
  };
  var Z3s;
  var e4s = __lazy(() => {
    Z3s = __toESM(tw(), 1);
  });
  var t4s = e => {
    let t = [];
    for (let n in Art) {
      let r = Art[n];
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
  var n4s = e => {
    let t = {};
    e.checksumAlgorithms().forEach(n => {
      t[n.algorithmId()] = n.checksumConstructor();
    });
    return t;
  };
  var r4s = __lazy(() => {
    m2r();
  });
  var o4s = e => ({
    setRetryStrategy(t) {
      e.retryStrategy = t;
    },
    retryStrategy() {
      return e.retryStrategy;
    }
  });
  var s4s = e => {
    let t = {};
    t.retryStrategy = e.retryStrategy();
    return t;
  };
  var getDefaultExtensionConfiguration_export = e => Object.assign(t4s(e), o4s(e));
  var resolveDefaultRuntimeConfig_export = e => Object.assign(n4s(e), s4s(e));
  var a4s = __lazy(() => {});
  var getArrayIfSingleItem_export = e => Array.isArray(e) ? e : [e];
  var getValueFromTextNode_export = e => {
    for (let n in e) {
      if (e.hasOwnProperty(n) && e[n]["#text"] !== undefined) {
        e[n] = e[n]["#text"];
      } else if (typeof e[n] === "object" && e[n] !== null) {
        e[n] = getValueFromTextNode_export(e[n]);
      }
    }
    return e;
  };
  var isSerializableHeaderValue_export = e => e != null;
  class NoOpLogger_export {
    trace() {}
    debug() {}
    info() {}
    warn() {}
    error() {}
  }
  function map_export3(e, t, n) {
    let r;
    let o;
    let s;
    if (typeof t > "u" && typeof n > "u") {
      r = {};
      s = e;
    } else if (r = e, typeof t === "function") {
      o = t;
      s = n;
      return jed(r, o, s);
    } else {
      s = t;
    }
    for (let i of Object.keys(s)) {
      if (!Array.isArray(s[i])) {
        r[i] = s[i];
        continue;
      }
      u4s(r, null, s, i);
    }
    return r;
  }
  var convertMap_export = e => {
    let t = {};
    for (let [n, r] of Object.entries(e || {})) {
      t[n] = [, r];
    }
    return t;
  };
  var take_export = (e, t) => {
    let n = {};
    for (let r in t) {
      u4s(n, e, t, r);
    }
    return n;
  };
  var jed = (e, t, n) => map_export3(e, Object.entries(n).reduce((r, [o, s]) => {
    if (Array.isArray(s)) {
      r[o] = s;
    } else if (typeof s === "function") {
      r[o] = [t, s()];
    } else {
      r[o] = [t, s];
    }
    return r;
  }, {}));
  var u4s = (e, t, n, r) => {
    if (t !== null) {
      let i = n[r];
      if (typeof i === "function") {
        i = [, i];
      }
      let [a = qed, l = Wed, c = r] = i;
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
  var qed = e => e != null;
  var Wed = e => e;
  var d4s;
  var p4s = __lazy(() => {
    d4s = __toESM(tw(), 1);
  });
  var serializeFloat_export = e => {
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
  var serializeDateTime_export = e => e.toISOString().replace(".000Z", "Z");
  var _json_export = e => {
    if (e == null) {
      return {};
    }
    if (Array.isArray(e)) {
      return e.filter(t => t != null).map(_json_export);
    }
    if (typeof e === "object") {
      let t = {};
      for (let n of Object.keys(e)) {
        if (e[n] == null) {
          continue;
        }
        t[n] = _json_export(e[n]);
      }
      return t;
    }
    return e;
  };
  var yk = {};