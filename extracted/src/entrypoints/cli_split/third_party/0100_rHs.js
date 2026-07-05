  var rHs = __commonJS(nT => {
    var z$s = QB();
    var kBr = tw();
    var CBr = vBr();
    var HJu = qT();
    var G$s = yW();
    class K$s {
      config;
      middlewareStack = z$s.constructStack();
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
    function RBr(e, t) {
      if (t == null) {
        return t;
      }
      let n = HJu.NormalizedSchema.of(e);
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
            o[s] = RBr(i, r[s]);
          }
        }
        return o;
      }
      return t;
    }
    class ABr {
      middlewareStack = z$s.constructStack();
      schema;
      static classBuilder() {
        return new Y$s();
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
          [CBr.SMITHY_CONTEXT_KEY]: {
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
    class Y$s {
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
        return t = class extends ABr {
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
              inputFilterSensitiveLog: e._inputFilterSensitiveLog ?? (s ? RBr.bind(null, i) : l => l),
              outputFilterSensitiveLog: e._outputFilterSensitiveLog ?? (s ? RBr.bind(null, a) : l => l),
              smithyContext: e._smithyContext,
              additionalContext: e._additionalContext
            });
          }
          serialize = e._serializer;
          deserialize = e._deserializer;
        };
      }
    }
    var qJu = (e, t) => {
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
    class brt extends Error {
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
        return brt.prototype.isPrototypeOf(t) || Boolean(t.$fault) && Boolean(t.$metadata) && (t.$fault === "client" || t.$fault === "server");
      }
      static [Symbol.hasInstance](e) {
        if (!e) {
          return false;
        }
        let t = e;
        if (this === brt) {
          return brt.isInstance(e);
        }
        if (brt.isInstance(e)) {
          if (t.name && this.name) {
            return this.prototype.isPrototypeOf(e) || t.name === this.name;
          }
          return this.prototype.isPrototypeOf(e);
        }
        return false;
      }
    }
    var J$s = (e, t = {}) => {
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
    var X$s = ({
      output: e,
      parsedBody: t,
      exceptionCtor: n,
      errorCode: r
    }) => {
      let o = GJu(e);
      let s = o.httpStatusCode ? o.httpStatusCode + "" : undefined;
      let i = new n({
        name: t?.code || t?.Code || r || s || "UnknownError",
        $fault: "client",
        $metadata: o
      });
      throw J$s(i, t);
    };
    var WJu = e => ({
      output: t,
      parsedBody: n,
      errorCode: r
    }) => {
      X$s({
        output: t,
        parsedBody: n,
        exceptionCtor: e,
        errorCode: r
      });
    };
    var GJu = e => ({
      httpStatusCode: e.statusCode,
      requestId: e.headers["x-amzn-requestid"] ?? e.headers["x-amzn-request-id"] ?? e.headers["x-amz-request-id"],
      extendedRequestId: e.headers["x-amz-id-2"],
      cfId: e.headers["x-amz-cf-id"]
    });
    var VJu = e => {
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
    var V$s = false;
    var zJu = e => {
      if (e && !V$s && parseInt(e.substring(1, e.indexOf("."))) < 16) {
        V$s = true;
      }
    };
    var KJu = e => {
      let t = [];
      for (let n in CBr.AlgorithmId) {
        let r = CBr.AlgorithmId[n];
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
    var YJu = e => {
      let t = {};
      e.checksumAlgorithms().forEach(n => {
        t[n.algorithmId()] = n.checksumConstructor();
      });
      return t;
    };
    var JJu = e => ({
      setRetryStrategy(t) {
        e.retryStrategy = t;
      },
      retryStrategy() {
        return e.retryStrategy;
      }
    });
    var XJu = e => {
      let t = {};
      t.retryStrategy = e.retryStrategy();
      return t;
    };
    var Q$s = e => Object.assign(KJu(e), JJu(e));
    var QJu = Q$s;
    var ZJu = e => Object.assign(YJu(e), XJu(e));
    var eXu = e => Array.isArray(e) ? e : [e];
    var Z$s = e => {
      for (let n in e) {
        if (e.hasOwnProperty(n) && e[n]["#text"] !== undefined) {
          e[n] = e[n]["#text"];
        } else if (typeof e[n] === "object" && e[n] !== null) {
          e[n] = Z$s(e[n]);
        }
      }
      return e;
    };
    var tXu = e => e != null;
    class eHs {
      trace() {}
      debug() {}
      info() {}
      warn() {}
      error() {}
    }
    function tHs(e, t, n) {
      let r;
      let o;
      let s;
      if (typeof t > "u" && typeof n > "u") {
        r = {};
        s = e;
      } else if (r = e, typeof t === "function") {
        o = t;
        s = n;
        return oXu(r, o, s);
      } else {
        s = t;
      }
      for (let i of Object.keys(s)) {
        if (!Array.isArray(s[i])) {
          r[i] = s[i];
          continue;
        }
        nHs(r, null, s, i);
      }
      return r;
    }
    var nXu = e => {
      let t = {};
      for (let [n, r] of Object.entries(e || {})) {
        t[n] = [, r];
      }
      return t;
    };
    var rXu = (e, t) => {
      let n = {};
      for (let r in t) {
        nHs(n, e, t, r);
      }
      return n;
    };
    var oXu = (e, t, n) => tHs(e, Object.entries(n).reduce((r, [o, s]) => {
      if (Array.isArray(s)) {
        r[o] = s;
      } else if (typeof s === "function") {
        r[o] = [t, s()];
      } else {
        r[o] = [t, s];
      }
      return r;
    }, {}));
    var nHs = (e, t, n, r) => {
      if (t !== null) {
        let i = n[r];
        if (typeof i === "function") {
          i = [, i];
        }
        let [a = sXu, l = iXu, c = r] = i;
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
    var sXu = e => e != null;
    var iXu = e => e;
    var aXu = e => {
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
    var lXu = e => e.toISOString().replace(".000Z", "Z");
    var xBr = e => {
      if (e == null) {
        return {};
      }
      if (Array.isArray(e)) {
        return e.filter(t => t != null).map(xBr);
      }
      if (typeof e === "object") {
        let t = {};
        for (let n of Object.keys(e)) {
          if (e[n] == null) {
            continue;
          }
          t[n] = xBr(e[n]);
        }
        return t;
      }
      return e;
    };
    Object.defineProperty(nT, "collectBody", {
      enumerable: true,
      get: function () {
        return kBr.collectBody;
      }
    });
    Object.defineProperty(nT, "extendedEncodeURIComponent", {
      enumerable: true,
      get: function () {
        return kBr.extendedEncodeURIComponent;
      }
    });
    Object.defineProperty(nT, "resolvedPath", {
      enumerable: true,
      get: function () {
        return kBr.resolvedPath;
      }
    });
    nT.Client = K$s;
    nT.Command = ABr;
    nT.NoOpLogger = eHs;
    nT.SENSITIVE_STRING = "***SensitiveInformation***";
    nT.ServiceException = brt;
    nT._json = xBr;
    nT.convertMap = nXu;
    nT.createAggregatedClient = qJu;
    nT.decorateServiceException = J$s;
    nT.emitWarningIfUnsupportedVersion = zJu;
    nT.getArrayIfSingleItem = eXu;
    nT.getDefaultExtensionConfiguration = QJu;
    nT.getDefaultExtensionConfiguration = Q$s;
    nT.getValueFromTextNode = Z$s;
    nT.isSerializableHeaderValue = tXu;
    nT.loadConfigsForDefaultMode = VJu;
    nT.map = tHs;
    nT.resolveDefaultRuntimeConfig = ZJu;
    nT.serializeDateTime = lXu;
    nT.serializeFloat = aXu;
    nT.take = rXu;
    nT.throwDefaultError = X$s;
    nT.withBaseException = WJu;
    Object.keys(G$s).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(nT, e)) {
        Object.defineProperty(nT, e, {
          enumerable: true,
          get: function () {
            return G$s[e];
          }
        });
      }
    });
  });
  var oHs = __commonJS($bn => {
    Object.defineProperty($bn, "__esModule", {
      value: true
    });
    $bn.isStreamingPayload = undefined;
    var cXu = require("stream");
    var uXu = e => e?.body instanceof cXu.Readable || typeof ReadableStream < "u" && e?.body instanceof ReadableStream;
    $bn.isStreamingPayload = uXu;
  });
  var yF = __commonJS(qD => {
    var gk = Ole();
    var Srt = W$s();
    var _Ae = bBr();
    var iHs = xFr();
    var sHs = zB();
    var dXu = rHs();
    var pXu = oHs();
    var mXu = (e, t) => {
      let n = e;
      let r = gk.NO_RETRY_INCREMENT;
      let o = gk.RETRY_COST;
      let s = gk.TIMEOUT_RETRY_COST;
      let i = e;
      let a = d => d.name === "TimeoutError" ? s : o;
      let l = d => a(d) <= i;
      return Object.freeze({
        hasRetryTokens: l,
        retrieveRetryTokens: d => {
          if (!l(d)) {
            throw Error("No retry token available");
          }
          let p = a(d);
          i -= p;
          return p;
        },
        releaseRetryTokens: d => {
          i += d ?? r;
          i = Math.min(i, n);
        }
      });
    };
    var aHs = (e, t) => Math.floor(Math.min(gk.MAXIMUM_RETRY_DELAY, Math.random() * 2 ** t * e));
    var lHs = e => {
      if (!e) {
        return false;
      }
      return _Ae.isRetryableByTrait(e) || _Ae.isClockSkewError(e) || _Ae.isThrottlingError(e) || _Ae.isTransientError(e);
    };
    var cHs = e => {
      if (e instanceof Error) {
        return e;
      }
      if (e instanceof Object) {
        return Object.assign(Error(), e);
      }
      if (typeof e === "string") {
        return Error(e);
      }
      return Error(`AWS SDK error wrapper for ${e}`);
    };
    class OBr {
      maxAttemptsProvider;
      retryDecider;
      delayDecider;
      retryQuota;
      mode = gk.RETRY_MODES.STANDARD;
      constructor(e, t) {
        this.maxAttemptsProvider = e;
        this.retryDecider = t?.retryDecider ?? lHs;
        this.delayDecider = t?.delayDecider ?? aHs;
        this.retryQuota = t?.retryQuota ?? mXu(gk.INITIAL_RETRY_TOKENS);
      }
      shouldRetry(e, t, n) {
        return t < n && this.retryDecider(e) && this.retryQuota.hasRetryTokens(e);
      }
      async getMaxAttempts() {
        let e;
        try {
          e = await this.maxAttemptsProvider();
        } catch (t) {
          e = gk.DEFAULT_MAX_ATTEMPTS;
        }
        return e;
      }
      async retry(e, t, n) {
        let r;
        let o = 0;
        let s = 0;
        let i = await this.getMaxAttempts();
        let {
          request: a
        } = t;
        if (Srt.HttpRequest.isInstance(a)) {
          a.headers[gk.INVOCATION_ID_HEADER] = iHs.v4();
        }
        while (true) {
          try {
            if (Srt.HttpRequest.isInstance(a)) {
              a.headers[gk.REQUEST_HEADER] = `attempt=${o + 1}; max=${i}`;
            }
            if (n?.beforeRequest) {
              await n.beforeRequest();
            }
            let {
              response: l,
              output: c
            } = await e(t);
            if (n?.afterRequest) {
              n.afterRequest(l);
            }
            this.retryQuota.releaseRetryTokens(r);
            c.$metadata.attempts = o + 1;
            c.$metadata.totalRetryDelay = s;
            return {
              response: l,
              output: c
            };
          } catch (l) {
            let c = cHs(l);
            if (o++, this.shouldRetry(c, o, i)) {
              r = this.retryQuota.retrieveRetryTokens(c);
              let u = this.delayDecider(_Ae.isThrottlingError(c) ? gk.THROTTLING_RETRY_DELAY_BASE : gk.DEFAULT_RETRY_DELAY_BASE, o);
              let d = fXu(c.$response);
              let p = Math.max(d || 0, u);
              s += p;
              await new Promise(m => setTimeout(m, p));
              continue;
            }
            if (!c.$metadata) {
              c.$metadata = {};
            }
            throw c.$metadata.attempts = o, c.$metadata.totalRetryDelay = s, c;
          }
        }
      }
    }
    var fXu = e => {
      if (!Srt.HttpResponse.isInstance(e)) {
        return;
      }
      let t = Object.keys(e.headers).find(s => s.toLowerCase() === "retry-after");
      if (!t) {
        return;
      }
      let n = e.headers[t];
      let r = Number(n);
      if (!Number.isNaN(r)) {
        return r * 1000;
      }
      return new Date(n).getTime() - Date.now();
    };
    class uHs extends OBr {
      rateLimiter;
      constructor(e, t) {
        let {
          rateLimiter: n,
          ...r
        } = t ?? {};
        super(e, r);
        this.rateLimiter = n ?? new gk.DefaultRateLimiter();
        this.mode = gk.RETRY_MODES.ADAPTIVE;
      }
      async retry(e, t) {
        return super.retry(e, t, {
          beforeRequest: async () => this.rateLimiter.getSendToken(),
          afterRequest: n => {
            this.rateLimiter.updateClientSendingRate(n);
          }
        });
      }
    }
    var hXu = {
      environmentVariableSelector: e => {
        let t = e["AWS_MAX_ATTEMPTS"];
        if (!t) {
          return;
        }
        let n = parseInt(t);
        if (Number.isNaN(n)) {
          throw Error(`Environment variable ${"AWS_MAX_ATTEMPTS"} mast be a number, got "${t}"`);
        }
        return n;
      },
      configFileSelector: e => {
        let t = e["max_attempts"];
        if (!t) {
          return;
        }
        let n = parseInt(t);
        if (Number.isNaN(n)) {
          throw Error(`Shared config file entry ${"max_attempts"} mast be a number, got "${t}"`);
        }
        return n;
      },
      default: gk.DEFAULT_MAX_ATTEMPTS
    };
    var gXu = e => {
      let {
        retryStrategy: t,
        retryMode: n,
        maxAttempts: r
      } = e;
      let o = sHs.normalizeProvider(r ?? gk.DEFAULT_MAX_ATTEMPTS);
      return Object.assign(e, {
        maxAttempts: o,
        retryStrategy: async () => {
          if (t) {
            return t;
          }
          if ((await sHs.normalizeProvider(n)()) === gk.RETRY_MODES.ADAPTIVE) {
            return new gk.AdaptiveRetryStrategy(o);
          }
          return new gk.StandardRetryStrategy(o);
        }
      });
    };
    var yXu = {
      environmentVariableSelector: e => e["AWS_RETRY_MODE"],
      configFileSelector: e => e["retry_mode"],
      default: gk.DEFAULT_RETRY_MODE
    };
    var mHs = () => e => async t => {
      let {
        request: n
      } = t;
      if (Srt.HttpRequest.isInstance(n)) {
        delete n.headers[gk.INVOCATION_ID_HEADER];
        delete n.headers[gk.REQUEST_HEADER];
      }
      return e(t);
    };
    var fHs = {
      name: "omitRetryHeadersMiddleware",
      tags: ["RETRY", "HEADERS", "OMIT_RETRY_HEADERS"],
      relation: "before",
      toMiddleware: "awsAuthMiddleware",
      override: true
    };
    var _Xu = e => ({
      applyToStack: t => {
        t.addRelativeTo(mHs(), fHs);
      }
    });
    var hHs = e => (t, n) => async r => {
      let o = await e.retryStrategy();
      let s = await e.maxAttempts();
      if (bXu(o)) {
        o = o;
        let i = await o.acquireInitialRetryToken(n.partition_id);
        let a = Error();
        let l = 0;
        let c = 0;
        let {
          request: u
        } = r;
        let d = Srt.HttpRequest.isInstance(u);
        if (d) {
          u.headers[gk.INVOCATION_ID_HEADER] = iHs.v4();
        }
        while (true) {
          try {
            if (d) {
              u.headers[gk.REQUEST_HEADER] = `attempt=${l + 1}; max=${s}`;
            }
            let {
              response: p,
              output: m
            } = await t(r);
            o.recordSuccess(i);
            m.$metadata.attempts = l + 1;
            m.$metadata.totalRetryDelay = c;
            return {
              response: p,
              output: m
            };
          } catch (p) {
            let m = SXu(p);
            if (a = cHs(p), d && pXu.isStreamingPayload(u)) {
              throw (n.logger instanceof dXu.NoOpLogger ? console : n.logger)?.warn("An error was encountered in a non-retryable streaming request."), a;
            }
            try {
              i = await o.refreshRetryTokenForRetry(i, m);
            } catch (h) {
              if (!a.$metadata) {
                a.$metadata = {};
              }
              throw a.$metadata.attempts = l + 1, a.$metadata.totalRetryDelay = c, a;
            }
            l = i.getRetryCount();
            let f = i.getRetryDelay();
            c += f;
            await new Promise(h => setTimeout(h, f));
          }
        }
      } else {
        if (o = o, o?.mode) {
          n.userAgent = [...(n.userAgent || []), ["cfg/retry-mode", o.mode]];
        }
        return o.retry(t, r);
      }
    };
    var bXu = e => typeof e.acquireInitialRetryToken < "u" && typeof e.refreshRetryTokenForRetry < "u" && typeof e.recordSuccess < "u";
    var SXu = e => {
      let t = {
        error: e,
        errorType: TXu(e)
      };
      let n = yHs(e.$response);
      if (n) {
        t.retryAfterHint = n;
      }
      return t;
    };
    var TXu = e => {
      if (_Ae.isThrottlingError(e)) {
        return "THROTTLING";
      }
      if (_Ae.isTransientError(e)) {
        return "TRANSIENT";
      }
      if (_Ae.isServerError(e)) {
        return "SERVER_ERROR";
      }
      return "CLIENT_ERROR";
    };
    var gHs = {
      name: "retryMiddleware",
      tags: ["RETRY"],
      step: "finalizeRequest",
      priority: "high",
      override: true
    };
    var EXu = e => ({
      applyToStack: t => {
        t.add(hHs(e), gHs);
      }
    });
    var yHs = e => {
      if (!Srt.HttpResponse.isInstance(e)) {
        return;
      }
      let t = Object.keys(e.headers).find(s => s.toLowerCase() === "retry-after");
      if (!t) {
        return;
      }
      let n = e.headers[t];
      let r = Number(n);
      if (!Number.isNaN(r)) {
        return new Date(r * 1000);
      }
      return new Date(n);
    };
    qD.AdaptiveRetryStrategy = uHs;
    qD.CONFIG_MAX_ATTEMPTS = "max_attempts";
    qD.CONFIG_RETRY_MODE = "retry_mode";
    qD.ENV_MAX_ATTEMPTS = "AWS_MAX_ATTEMPTS";
    qD.ENV_RETRY_MODE = "AWS_RETRY_MODE";
    qD.NODE_MAX_ATTEMPT_CONFIG_OPTIONS = hXu;
    qD.NODE_RETRY_MODE_CONFIG_OPTIONS = yXu;
    qD.StandardRetryStrategy = OBr;
    qD.defaultDelayDecider = aHs;
    qD.defaultRetryDecider = lHs;
    qD.getOmitRetryHeadersPlugin = _Xu;
    qD.getRetryAfterHint = yHs;
    qD.getRetryPlugin = EXu;
    qD.omitRetryHeadersMiddleware = mHs;
    qD.omitRetryHeadersMiddlewareOptions = fHs;
    qD.resolveRetryConfig = gXu;
    qD.retryMiddleware = hHs;
    qD.retryMiddlewareOptions = gHs;
  });
  var DBr = __commonJS(iv => {
    iv.HttpAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(iv.HttpAuthLocation || (iv.HttpAuthLocation = {}));
    iv.HttpApiKeyAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(iv.HttpApiKeyAuthLocation || (iv.HttpApiKeyAuthLocation = {}));
    iv.EndpointURLScheme = undefined;
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(iv.EndpointURLScheme || (iv.EndpointURLScheme = {}));
    iv.AlgorithmId = undefined;
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(iv.AlgorithmId || (iv.AlgorithmId = {}));
    var vXu = e => {
      let t = [];
      if (e.sha256 !== undefined) {
        t.push({
          algorithmId: () => iv.AlgorithmId.SHA256,
          checksumConstructor: () => e.sha256
        });
      }
      if (e.md5 != null) {
        t.push({
          algorithmId: () => iv.AlgorithmId.MD5,
          checksumConstructor: () => e.md5
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
    var wXu = e => {
      let t = {};
      e.checksumAlgorithms().forEach(n => {
        t[n.algorithmId()] = n.checksumConstructor();
      });
      return t;
    };
    var CXu = e => vXu(e);
    var RXu = e => wXu(e);
    iv.FieldPosition = undefined;
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(iv.FieldPosition || (iv.FieldPosition = {}));
    iv.IniSectionType = undefined;
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(iv.IniSectionType || (iv.IniSectionType = {}));
    iv.RequestHandlerProtocol = undefined;
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(iv.RequestHandlerProtocol || (iv.RequestHandlerProtocol = {}));
    iv.SMITHY_CONTEXT_KEY = "__smithy_context";
    iv.getDefaultExtensionConfiguration = CXu;
    iv.resolveDefaultRuntimeConfig = RXu;
  });
  var Pj = __commonJS(rT => {
    var SHs = QB();
    var UBr = tw();
    var NBr = DBr();
    var kXu = qT();
    var _Hs = yW();
    class THs {
      config;
      middlewareStack = SHs.constructStack();
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
    function LBr(e, t) {
      if (t == null) {
        return t;
      }
      let n = kXu.NormalizedSchema.of(e);
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
            o[s] = LBr(i, r[s]);
          }
        }
        return o;
      }
      return t;
    }
    class BBr {
      middlewareStack = SHs.constructStack();
      schema;
      static classBuilder() {
        return new EHs();
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
          [NBr.SMITHY_CONTEXT_KEY]: {
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
    class EHs {
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
        return t = class extends BBr {
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
              inputFilterSensitiveLog: e._inputFilterSensitiveLog ?? (s ? LBr.bind(null, i) : l => l),
              outputFilterSensitiveLog: e._outputFilterSensitiveLog ?? (s ? LBr.bind(null, a) : l => l),
              smithyContext: e._smithyContext,
              additionalContext: e._additionalContext
            });
          }
          serialize = e._serializer;
          deserialize = e._deserializer;
        };
      }
    }
    var IXu = (e, t) => {
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
    class Trt extends Error {
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
        return Trt.prototype.isPrototypeOf(t) || Boolean(t.$fault) && Boolean(t.$metadata) && (t.$fault === "client" || t.$fault === "server");
      }
      static [Symbol.hasInstance](e) {
        if (!e) {
          return false;
        }
        let t = e;
        if (this === Trt) {
          return Trt.isInstance(e);
        }
        if (Trt.isInstance(e)) {
          if (t.name && this.name) {
            return this.prototype.isPrototypeOf(e) || t.name === this.name;
          }
          return this.prototype.isPrototypeOf(e);
        }
        return false;
      }
    }
    var vHs = (e, t = {}) => {
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
    var wHs = ({
      output: e,
      parsedBody: t,
      exceptionCtor: n,
      errorCode: r
    }) => {
      let o = OXu(e);
      let s = o.httpStatusCode ? o.httpStatusCode + "" : undefined;
      let i = new n({
        name: t?.code || t?.Code || r || s || "UnknownError",
        $fault: "client",
        $metadata: o
      });
      throw vHs(i, t);
    };
    var PXu = e => ({
      output: t,
      parsedBody: n,
      errorCode: r
    }) => {
      wHs({
        output: t,
        parsedBody: n,
        exceptionCtor: e,
        errorCode: r
      });
    };
    var OXu = e => ({
      httpStatusCode: e.statusCode,
      requestId: e.headers["x-amzn-requestid"] ?? e.headers["x-amzn-request-id"] ?? e.headers["x-amz-request-id"],
      extendedRequestId: e.headers["x-amz-id-2"],
      cfId: e.headers["x-amz-cf-id"]
    });
    var DXu = e => {
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
    var bHs = false;
    var MXu = e => {
      if (e && !bHs && parseInt(e.substring(1, e.indexOf("."))) < 16) {
        bHs = true;
      }
    };
    var NXu = e => {
      let t = [];
      for (let n in NBr.AlgorithmId) {
        let r = NBr.AlgorithmId[n];
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
    var LXu = e => {
      let t = {};
      e.checksumAlgorithms().forEach(n => {
        t[n.algorithmId()] = n.checksumConstructor();
      });
      return t;
    };
    var FXu = e => ({
      setRetryStrategy(t) {
        e.retryStrategy = t;
      },
      retryStrategy() {
        return e.retryStrategy;
      }
    });
    var UXu = e => {
      let t = {};
      t.retryStrategy = e.retryStrategy();
      return t;
    };
    var CHs = e => Object.assign(NXu(e), FXu(e));
    var BXu = CHs;
    var $Xu = e => Object.assign(LXu(e), UXu(e));
    var HXu = e => Array.isArray(e) ? e : [e];
    var RHs = e => {
      for (let n in e) {
        if (e.hasOwnProperty(n) && e[n]["#text"] !== undefined) {
          e[n] = e[n]["#text"];
        } else if (typeof e[n] === "object" && e[n] !== null) {
          e[n] = RHs(e[n]);
        }
      }
      return e;
    };
    var jXu = e => e != null;
    class xHs {
      trace() {}
      debug() {}
      info() {}
      warn() {}
      error() {}
    }
    function kHs(e, t, n) {
      let r;
      let o;
      let s;
      if (typeof t > "u" && typeof n > "u") {
        r = {};
        s = e;
      } else if (r = e, typeof t === "function") {
        o = t;
        s = n;
        return GXu(r, o, s);
      } else {
        s = t;
      }
      for (let i of Object.keys(s)) {
        if (!Array.isArray(s[i])) {
          r[i] = s[i];
          continue;
        }
        AHs(r, null, s, i);
      }
      return r;
    }
    var qXu = e => {
      let t = {};
      for (let [n, r] of Object.entries(e || {})) {
        t[n] = [, r];
      }
      return t;
    };
    var WXu = (e, t) => {
      let n = {};
      for (let r in t) {
        AHs(n, e, t, r);
      }
      return n;
    };
    var GXu = (e, t, n) => kHs(e, Object.entries(n).reduce((r, [o, s]) => {
      if (Array.isArray(s)) {
        r[o] = s;
      } else if (typeof s === "function") {
        r[o] = [t, s()];
      } else {
        r[o] = [t, s];
      }
      return r;
    }, {}));
    var AHs = (e, t, n, r) => {
      if (t !== null) {
        let i = n[r];
        if (typeof i === "function") {
          i = [, i];
        }
        let [a = VXu, l = zXu, c = r] = i;
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
    var VXu = e => e != null;
    var zXu = e => e;
    var KXu = e => {
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
    var YXu = e => e.toISOString().replace(".000Z", "Z");
    var FBr = e => {
      if (e == null) {
        return {};
      }
      if (Array.isArray(e)) {
        return e.filter(t => t != null).map(FBr);
      }
      if (typeof e === "object") {
        let t = {};
        for (let n of Object.keys(e)) {
          if (e[n] == null) {
            continue;
          }
          t[n] = FBr(e[n]);
        }
        return t;
      }
      return e;
    };
    Object.defineProperty(rT, "collectBody", {
      enumerable: true,
      get: function () {
        return UBr.collectBody;
      }
    });
    Object.defineProperty(rT, "extendedEncodeURIComponent", {
      enumerable: true,
      get: function () {
        return UBr.extendedEncodeURIComponent;
      }
    });
    Object.defineProperty(rT, "resolvedPath", {
      enumerable: true,
      get: function () {
        return UBr.resolvedPath;
      }
    });
    rT.Client = THs;
    rT.Command = BBr;
    rT.NoOpLogger = xHs;
    rT.SENSITIVE_STRING = "***SensitiveInformation***";
    rT.ServiceException = Trt;
    rT._json = FBr;
    rT.convertMap = qXu;
    rT.createAggregatedClient = IXu;
    rT.decorateServiceException = vHs;
    rT.emitWarningIfUnsupportedVersion = MXu;
    rT.getArrayIfSingleItem = HXu;
    rT.getDefaultExtensionConfiguration = BXu;
    rT.getDefaultExtensionConfiguration = CHs;
    rT.getValueFromTextNode = RHs;
    rT.isSerializableHeaderValue = jXu;
    rT.loadConfigsForDefaultMode = DXu;
    rT.map = kHs;
    rT.resolveDefaultRuntimeConfig = $Xu;
    rT.serializeDateTime = YXu;
    rT.serializeFloat = KXu;
    rT.take = WXu;
    rT.throwDefaultError = wHs;
    rT.withBaseException = PXu;
    Object.keys(_Hs).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(rT, e)) {
        Object.defineProperty(rT, e, {
          enumerable: true,
          get: function () {
            return _Hs[e];
          }
        });
      }
    });
  });
  var HBr = __commonJS(bAe => {
    Object.defineProperty(bAe, "__esModule", {
      value: true
    });
    bAe.resolveHttpAuthSchemeConfig = bAe.defaultSSOOIDCHttpAuthSchemeProvider = bAe.defaultSSOOIDCHttpAuthSchemeParametersProvider = undefined;
    var JXu = nw();
    var $Br = zB();
    var XXu = async (e, t, n) => ({
      operation: (0, $Br.getSmithyContext)(t).operation,
      region: (await (0, $Br.normalizeProvider)(e.region)()) || (() => {
        throw Error("expected `region` to be configured for `aws.auth#sigv4`");
      })()
    });
    bAe.defaultSSOOIDCHttpAuthSchemeParametersProvider = XXu;
    function QXu(e) {
      return {
        schemeId: "aws.auth#sigv4",
        signingProperties: {
          name: "sso-oauth",
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
    function ZXu(e) {
      return {
        schemeId: "smithy.api#noAuth"
      };
    }
    var eQu = e => {
      let t = [];
      switch (e.operation) {
        case "CreateToken":
          {
            t.push(ZXu(e));
            break;
          }
        default:
          t.push(QXu(e));
      }
      return t;
    };
    bAe.defaultSSOOIDCHttpAuthSchemeProvider = eQu;
    var tQu = e => {
      let t = (0, JXu.resolveAwsSdkSigV4Config)(e);
      return Object.assign(t, {
        authSchemePreference: (0, $Br.normalizeProvider)(e.authSchemePreference ?? [])
      });
    };
    bAe.resolveHttpAuthSchemeConfig = tQu;
  });