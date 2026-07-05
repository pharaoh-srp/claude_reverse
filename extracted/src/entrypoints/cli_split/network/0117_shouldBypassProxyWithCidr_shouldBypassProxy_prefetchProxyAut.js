  __export(BAe, {
    shouldBypassProxyWithCidr: () => shouldBypassProxyWithCidr,
    shouldBypassProxy: () => shouldBypassProxy,
    prefetchProxyAuthFromHelperIfSafe: () => prefetchProxyAuthFromHelperIfSafe,
    getWebSocketProxyUrl: () => getWebSocketProxyUrl,
    getProxyUrl: () => getProxyUrl,
    getProxyFetchOptions: () => getProxyFetchOptions,
    getProxyAuthFromHelperCached: () => getProxyAuthFromHelperCached,
    getProxyAuthFromHelper: () => getProxyAuthFromHelper,
    getProxyAgent: () => getProxyAgent,
    getNoProxy: () => getNoProxy,
    getConfiguredProxyAuthHelper: () => getConfiguredProxyAuthHelper,
    getAddressFamily: () => getAddressFamily,
    getAWSClientProxyConfig: () => getAWSClientProxyConfig,
    disableKeepAlive: () => disableKeepAlive,
    configureGlobalAgents: () => configureGlobalAgents,
    clearProxyCache: () => clearProxyCache,
    clearProxyAuthHelperCache: () => clearProxyAuthHelperCache,
    _setProxyAuthHelperConfig: () => _setProxyAuthHelperConfig,
    _resetProxyAuthHelperForTesting: () => _resetProxyAuthHelperForTesting,
    _resetKeepAliveForTesting: () => _resetKeepAliveForTesting
  });
  function disableKeepAlive() {
    C$r = true;
  }
  function _resetKeepAliveForTesting() {
    C$r = false;
  }
  function getAddressFamily(e) {
    switch (e.family) {
      case 0:
      case 4:
      case 6:
        return e.family;
      case "IPv6":
        return 6;
      case "IPv4":
      case undefined:
        return 4;
      default:
        throw Error(`Unsupported address family: ${e.family}`);
    }
  }
  function getProxyUrl(e = process.env) {
    return e.https_proxy || e.HTTPS_PROXY || e.http_proxy || e.HTTP_PROXY;
  }
  function getNoProxy(e = process.env) {
    return e.no_proxy || e.NO_PROXY;
  }
  function shouldBypassProxy(e, t = getNoProxy()) {
    if (!t) {
      return false;
    }
    if (t === "*") {
      return true;
    }
    try {
      let n = new URL(e);
      let r = n.hostname.toLowerCase();
      let o = n.port || (n.protocol === "https:" ? "443" : "80");
      let s = `${r}:${o}`;
      return t.split(/[,\s]+/).filter(Boolean).some(a => {
        if (a = a.toLowerCase().trim(), a.includes(":")) {
          return s === a;
        }
        if (a.startsWith(".")) {
          let l = a;
          return r === a.substring(1) || r.endsWith(l);
        }
        return r === a;
      });
    } catch {
      return false;
    }
  }
  function shouldBypassProxyWithCidr(e, t) {
    if (shouldBypassProxy(e, t)) {
      return true;
    }
    if (!t) {
      return false;
    }
    let n;
    try {
      n = new URL(e).hostname.replace(/^\[|\]$/g, "");
    } catch {
      return false;
    }
    if (v$r.isIP(n) === 0) {
      return false;
    }
    return t.split(/[,\s]+/).filter(Boolean).some(r => {
      if (r.includes("/")) {
        return Xnt(n, r);
      }
      let o = v$r.isIP(r);
      if (o === 0) {
        return false;
      }
      return Xnt(n, `${r}/${o === 4 ? 32 : 128}`);
    });
  }
  function r6s(e) {
    let t = getMTLSConfig();
    let n = getCACertificates();
    let r = {
      ...(t && {
        cert: t.cert,
        key: t.key,
        passphrase: t.passphrase
      }),
      ...(n && {
        ca: n
      })
    };
    let o = {
      ...r
    };
    if (st(process.env.CLAUDE_CODE_PROXY_RESOLVES_HOSTS)) {
      o.lookup = (i, a, l) => {
        l(null, i, getAddressFamily(a));
      };
    }
    let s = new t6s.HttpsProxyAgent(e, o);
    s.options = {
      ...s.options,
      ...r
    };
    return s;
  }
  function getWebSocketProxyUrl(e) {
    let t = getProxyUrl();
    if (!t) {
      return;
    }
    if (shouldBypassProxy(e)) {
      return;
    }
    return t;
  }
  function _setProxyAuthHelperConfig(e) {
    Wrt = e;
  }
  function getConfiguredProxyAuthHelper() {
    if (!st(process.env.CLAUDE_CODE_ENABLE_PROXY_AUTH_HELPER)) {
      return;
    }
    return Wrt.helper;
  }
  function o6s() {
    return getConfiguredProxyAuthHelper() !== undefined && Wrt.fromProjectOrLocal;
  }
  function Yod() {
    let e = process.env.CLAUDE_CODE_PROXY_AUTH_HELPER_TTL_MS;
    if (e) {
      let t = parseInt(e, 10);
      if (!Number.isNaN(t) && t >= 0) {
        return t;
      }
    }
    return 300000;
  }
  async function getProxyAuthFromHelper() {
    let e = getConfiguredProxyAuthHelper();
    if (!e) {
      return null;
    }
    if (o6s() && !getIsNonInteractiveSession() && !Wrt.trustAccepted()) {
      logForDebugging("proxyAuthHelper configured in project/local settings but workspace trust not yet accepted \u2014 skipping", {
        level: "warn"
      });
      return null;
    }
    let t = rTn;
    if (!t && UAe && Date.now() - UAe.timestamp < Yod()) {
      return UAe.value;
    }
    rTn = undefined;
    let n = getProxyUrl();
    let r;
    try {
      r = n ? new URL(n).hostname : undefined;
    } catch {
      r = undefined;
    }
    let o = await yI(e, {
      timeout: 30000,
      reject: false,
      env: {
        ...process.env,
        ...(n && {
          CLAUDE_CODE_PROXY_URL: n
        }),
        ...(r && {
          CLAUDE_CODE_PROXY_HOST: r
        }),
        ...(t && {
          CLAUDE_CODE_PROXY_AUTHENTICATE: t
        })
      }
    });
    if (o.failed || !o.stdout?.trim()) {
      let i = o.timedOut ? "timed out" : o.failed ? `exited ${o.exitCode}` : "did not return a value";
      let a = o.stderr?.trim();
      console.error(`proxyAuthHelper failed: ${a ? `${i}: ${a}` : i}`);
      return UAe?.value ?? null;
    }
    let s = o.stdout.trim();
    UAe = {
      value: s,
      timestamp: Date.now()
    };
    return s;
  }
  function getProxyAuthFromHelperCached() {
    return UAe?.value ?? null;
  }
  function clearProxyAuthHelperCache(e) {
    UAe = null;
    rTn = e;
  }
  function prefetchProxyAuthFromHelperIfSafe() {
    if (!getConfiguredProxyAuthHelper()) {
      return;
    }
    if (o6s() && !Wrt.trustAccepted()) {
      return;
    }
    getProxyAuthFromHelper();
  }
  function _resetProxyAuthHelperForTesting() {
    UAe = null;
    rTn = undefined;
    Wrt = {
      helper: undefined,
      fromProjectOrLocal: false,
      trustAccepted: () => false
    };
  }
  function getProxyFetchOptions(e) {
    let t = process.env.API_FORCE_IDLE_TIMEOUT;
    let n = e.forAnthropicAPI && !st(t) && (e.hasBodyIdleWatchdog || Pl(t));
    let r = {
      ...(C$r && {
        keepalive: false
      }),
      ...(n && {
        timeout: false
      })
    };
    if (e.forAnthropicAPI) {
      let s = process.env.ANTHROPIC_UNIX_SOCKET;
      if (s) {
        return {
          ...r,
          unix: s
        };
      }
    }
    let o = getProxyUrl();
    if (o) {
      if (e.url && shouldBypassProxy(e.url)) {
        return {
          ...r,
          ...getTLSFetchOptions()
        };
      }
      let s = getProxyAuthFromHelperCached();
      return {
        ...r,
        proxy: s ? {
          url: o,
          headers: {
            "Proxy-Authorization": s
          }
        } : o,
        ...getTLSFetchOptions()
      };
    }
    if (e.fallbackProxy) {
      if (e.url && (shouldBypassProxyWithCidr(e.url, e.fallbackProxy.noProxy) || shouldBypassProxyWithCidr(e.url, getNoProxy()))) {
        return {
          ...r,
          ...getTLSFetchOptions()
        };
      }
      let s = getTLSFetchOptions();
      return {
        ...r,
        proxy: e.fallbackProxy.url,
        ...(e.fallbackProxy.ca ? {
          Aeu: {
            ...s.Aeu,
            ca: e.fallbackProxy.ca
          }
        } : s)
      };
    }
    return {
      ...r,
      ...getTLSFetchOptions()
    };
  }
  function configureGlobalAgents() {
    let e = getProxyUrl();
    let t = getMTLSAgent();
    if (nTn !== undefined) {
      NP.interceptors.request.eject(nTn);
      nTn = undefined;
    }
    if (NP.defaults.proxy = undefined, NP.defaults.httpAgent = undefined, NP.defaults.httpsAgent = undefined, e) {
      NP.defaults.proxy = false;
      let n = r6s(e);
      nTn = NP.interceptors.request.use(r => {
        if (r.url && shouldBypassProxy(r.url)) {
          if (t) {
            r.httpsAgent = t;
            r.httpAgent = undefined;
          } else {
            delete r.httpsAgent;
            delete r.httpAgent;
          }
        } else {
          r.httpsAgent = n;
          r.httpAgent = n;
        }
        return r;
      });
      require("undici").setGlobalDispatcher(getProxyAgent(e));
    } else if (t) {
      NP.defaults.httpsAgent = t;
    }
  }
  async function getAWSClientProxyConfig(e) {
    let t = getProxyUrl();
    if (!t || e.url && shouldBypassProxy(e.url)) {
      return {};
    }
    let [{
      NodeHttpHandler: n
    }, {
      defaultProvider: r
    }] = await Promise.all([Promise.resolve().then(() => __toESM(hW(), 1)), Promise.resolve().then(() => (Xje(), e6s))]);
    let o = r6s(t);
    let s = new n({
      httpAgent: o,
      httpsAgent: o
    });
    return {
      requestHandler: s,
      credentials: r({
        clientConfig: {
          requestHandler: s
        }
      })
    };
  }
  function clearProxyCache() {
    getProxyAgent.cache.clear?.();
    logForDebugging("Cleared proxy agent cache");
  }
  var t6s;
  var v$r;
  var C$r = false;
  var getProxyAgent;
  var Wrt;
  var UAe = null;
  var rTn;
  var nTn;
  var Fh = __lazy(() => {
    Dp();
    at();
    Ije();
    sNt();
    je();
    gn();
    fW();
    oF();
    t6s = __toESM(oNt(), 1);
    v$r = require("net");
    getProxyAgent = TEr(e => {
      let t = require("undici");
      let n = getMTLSConfig();
      let r = getCACertificates();
      let o = {
        httpProxy: e,
        httpsProxy: e,
        noProxy: process.env.NO_PROXY || process.env.no_proxy
      };
      if (n || r) {
        let s = {
          ...(n && {
            cert: n.cert,
            key: n.key,
            passphrase: n.passphrase
          }),
          ...(r && {
            ca: r
          })
        };
        o.connect = s;
        o.requestTls = s;
      }
      return new t.EnvHttpProxyAgent(o);
    });
    Wrt = {
      helper: undefined,
      fromProjectOrLocal: false,
      trustAccepted: () => false
    };
  });
  var Vrt;
  var sTn = __lazy(() => {
    Vrt = ["us", "eu", "apac", "jp", "au", "us-gov", "global"];
  });
  class Client_export2 {
    config;
    middlewareStack = i6s.constructStack();
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
  var i6s;
  var a6s = __lazy(() => {
    i6s = __toESM(QB(), 1);
  });
  var l6s;
  var c6s = __lazy(() => {
    l6s = __toESM(tw(), 1);
  });
  var u6s = () => {};
  var d6s;
  var p6s = __lazy(() => {
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(d6s || (d6s = {}));
  });
  var m6s;
  var f6s = __lazy(() => {
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(m6s || (m6s = {}));
  });
  var h6s = () => {};
  var g6s = () => {};
  var y6s = () => {};
  var _6s = () => {};
  var b6s = __lazy(() => {
    p6s();
    f6s();
    h6s();
    g6s();
    y6s();
    _6s();
  });
  var S6s = () => {};
  var T6s = () => {};
  var E6s = () => {};
  var v6s = () => {};
  var w6s = () => {};
  var C6s = () => {};
  var R6s = () => {};
  var x6s = __lazy(() => {
    w6s();
    C6s();
    R6s();
  });
  var k6s = () => {};
  var A6s = () => {};
  var I6s;
  var P6s = __lazy(() => {
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(I6s || (I6s = {}));
  });
  var O6s = () => {};
  var D6s = () => {};
  var M6s = () => {};
  var N6s = () => {};
  var L6s = () => {};
  var F6s = __lazy(() => {
    O6s();
    D6s();
    M6s();
    N6s();
    L6s();
  });
  var U6s = () => {};
  var zrt;
  var B6s = __lazy(() => {
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(zrt || (zrt = {}));
  });
  var $6s = () => {};
  var H6s = () => {};
  var j6s = __lazy(() => {
    B6s();
    $6s();
    H6s();
  });
  var q6s = () => {};
  var W6s;
  var G6s = __lazy(() => {
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(W6s || (W6s = {}));
  });
  var V6s = () => {};
  var z6s = () => {};
  var K6s = () => {};
  var Y6s = () => {};
  var J6s = () => {};
  var X6s = __lazy(() => {
    z6s();
    K6s();
    Y6s();
    J6s();
  });
  var Q6s = () => {};
  var e8s = () => {};
  var t8s;
  var n8s = __lazy(() => {
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(t8s || (t8s = {}));
  });
  var r8s = () => {};
  var o8s = () => {};
  var s8s = () => {};
  var i8s = () => {};
  var a8s = () => {};
  var l8s = () => {};
  var c8s = () => {};
  var u8s = () => {};
  var d8s = () => {};
  var p8s = () => {};
  var m8s = () => {};
  var f8s = () => {};
  var h8s = () => {};
  var g8s = () => {};
  var y8s;
  var _8s = __lazy(() => {
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(y8s || (y8s = {}));
  });
  var b8s = () => {};
  var S8s = () => {};
  var T8s = () => {};
  var E8s = () => {};
  var v8s = () => {};
  var w8s = () => {};
  var C8s = () => {};
  var O$r = __lazy(() => {
    u6s();
    b6s();
    S6s();
    T6s();
    E6s();
    v6s();
    x6s();
    k6s();
    A6s();
    P6s();
    F6s();
    U6s();
    j6s();
    q6s();
    G6s();
    V6s();
    X6s();
    Q6s();
    e8s();
    n8s();
    r8s();
    o8s();
    s8s();
    i8s();
    a8s();
    l8s();
    c8s();
    u8s();
    d8s();
    p8s();
    m8s();
    f8s();
    h8s();
    g8s();
    _8s();
    b8s();
    S8s();
    T8s();
    E8s();
    v8s();
    w8s();
    C8s();
  });
  function iTn(e, t) {
    if (t == null) {
      return t;
    }
    let n = R8s.NormalizedSchema.of(e);
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
          o[s] = iTn(i, r[s]);
        }
      }
      return o;
    }
    return t;
  }
  var R8s;
  var x8s = __lazy(() => {
    R8s = __toESM(qT(), 1);
  });
  class Command_export2 {
    middlewareStack = k8s.constructStack();
    schema;
    static classBuilder() {
      return new A8s();
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
  class A8s {
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
      return t = class extends Command_export2 {
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
            inputFilterSensitiveLog: e._inputFilterSensitiveLog ?? (s ? iTn.bind(null, i) : l => l),
            outputFilterSensitiveLog: e._outputFilterSensitiveLog ?? (s ? iTn.bind(null, a) : l => l),
            smithyContext: e._smithyContext,
            additionalContext: e._additionalContext
          });
        }
        serialize = e._serializer;
        deserialize = e._deserializer;
      };
    }
  }
  var k8s;
  var I8s = __lazy(() => {
    O$r();
    x8s();
    k8s = __toESM(QB(), 1);
  });
  var createAggregatedClient_export2 = (e, t) => {
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
  var ServiceException_export2;
  var decorateServiceException_export2 = (e, t = {}) => {
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
  var L$r = __lazy(() => {
    ServiceException_export2 = class $Ae extends Error {
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
        return $Ae.prototype.isPrototypeOf(t) || Boolean(t.$fault) && Boolean(t.$metadata) && (t.$fault === "client" || t.$fault === "server");
      }
      static [Symbol.hasInstance](e) {
        if (!e) {
          return false;
        }
        let t = e;
        if (this === $Ae) {
          return $Ae.isInstance(e);
        }
        if ($Ae.isInstance(e)) {
          if (t.name && this.name) {
            return this.prototype.isPrototypeOf(e) || t.name === this.name;
          }
          return this.prototype.isPrototypeOf(e);
        }
        return false;
      }
    };
  });
  var throwDefaultError_export2 = ({
    output: e,
    parsedBody: t,
    exceptionCtor: n,
    errorCode: r
  }) => {
    let o = Zod(e);
    let s = o.httpStatusCode ? o.httpStatusCode + "" : undefined;
    let i = new n({
      name: t?.code || t?.Code || r || s || "UnknownError",
      $fault: "client",
      $metadata: o
    });
    throw decorateServiceException_export2(i, t);
  };
  var withBaseException_export2 = e => ({
    output: t,
    parsedBody: n,
    errorCode: r
  }) => {
    throwDefaultError_export2({
      output: t,
      parsedBody: n,
      exceptionCtor: e,
      errorCode: r
    });
  };
  var Zod = e => ({
    httpStatusCode: e.statusCode,
    requestId: e.headers["x-amzn-requestid"] ?? e.headers["x-amzn-request-id"] ?? e.headers["x-amz-request-id"],
    extendedRequestId: e.headers["x-amz-id-2"],
    cfId: e.headers["x-amz-cf-id"]
  });
  var O8s = __lazy(() => {
    L$r();
  });
  var loadConfigsForDefaultMode_export2 = e => {
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
  var D8s = false;
  var emitWarningIfUnsupportedVersion_export2 = e => {
    if (e && !D8s && parseInt(e.substring(1, e.indexOf("."))) < 16) {
      D8s = true;
    }
  };
  var M8s;
  var N8s = __lazy(() => {
    M8s = __toESM(tw(), 1);
  });
  var L8s = e => {
    let t = [];
    for (let n in zrt) {
      let r = zrt[n];
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
  var F8s = e => {
    let t = {};
    e.checksumAlgorithms().forEach(n => {
      t[n.algorithmId()] = n.checksumConstructor();
    });
    return t;
  };
  var U8s = __lazy(() => {
    O$r();
  });
  var B8s = e => ({
    setRetryStrategy(t) {
      e.retryStrategy = t;
    },
    retryStrategy() {
      return e.retryStrategy;
    }
  });
  var $8s = e => {
    let t = {};
    t.retryStrategy = e.retryStrategy();
    return t;
  };
  var getDefaultExtensionConfiguration_export2 = e => Object.assign(L8s(e), B8s(e));
  var resolveDefaultRuntimeConfig_export2 = e => Object.assign(F8s(e), $8s(e));
  var j8s = __lazy(() => {});
  var getArrayIfSingleItem_export2 = e => Array.isArray(e) ? e : [e];
  var getValueFromTextNode_export2 = e => {
    for (let n in e) {
      if (e.hasOwnProperty(n) && e[n]["#text"] !== undefined) {
        e[n] = e[n]["#text"];
      } else if (typeof e[n] === "object" && e[n] !== null) {
        e[n] = getValueFromTextNode_export2(e[n]);
      }
    }
    return e;
  };
  var isSerializableHeaderValue_export2 = e => e != null;
  class NoOpLogger_export2 {
    trace() {}
    debug() {}
    info() {}
    warn() {}
    error() {}
  }
  function map_export4(e, t, n) {
    let r;
    let o;
    let s;
    if (typeof t > "u" && typeof n > "u") {
      r = {};
      s = e;
    } else if (r = e, typeof t === "function") {
      o = t;
      s = n;
      return ssd(r, o, s);
    } else {
      s = t;
    }
    for (let i of Object.keys(s)) {
      if (!Array.isArray(s[i])) {
        r[i] = s[i];
        continue;
      }
      G8s(r, null, s, i);
    }
    return r;
  }
  var convertMap_export2 = e => {
    let t = {};
    for (let [n, r] of Object.entries(e || {})) {
      t[n] = [, r];
    }
    return t;
  };
  var take_export2 = (e, t) => {
    let n = {};
    for (let r in t) {
      G8s(n, e, t, r);
    }
    return n;
  };
  var ssd = (e, t, n) => map_export4(e, Object.entries(n).reduce((r, [o, s]) => {
    if (Array.isArray(s)) {
      r[o] = s;
    } else if (typeof s === "function") {
      r[o] = [t, s()];
    } else {
      r[o] = [t, s];
    }
    return r;
  }, {}));
  var G8s = (e, t, n, r) => {
    if (t !== null) {
      let i = n[r];
      if (typeof i === "function") {
        i = [, i];
      }
      let [a = isd, l = asd, c = r] = i;
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
  var isd = e => e != null;
  var asd = e => e;
  var V8s;
  var z8s = __lazy(() => {
    V8s = __toESM(tw(), 1);
  });
  var serializeFloat_export2 = e => {
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
  var serializeDateTime_export2 = e => e.toISOString().replace(".000Z", "Z");
  var _json_export2 = e => {
    if (e == null) {
      return {};
    }
    if (Array.isArray(e)) {
      return e.filter(t => t != null).map(_json_export2);
    }
    if (typeof e === "object") {
      let t = {};
      for (let n of Object.keys(e)) {
        if (e[n] == null) {
          continue;
        }
        t[n] = _json_export2(e[n]);
      }
      return t;
    }
    return e;
  };
  var _k = {};