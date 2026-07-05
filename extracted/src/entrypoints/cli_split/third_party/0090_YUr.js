  var YUr = __commonJS(eT => {
    var y2s = QB();
    var zUr = tw();
    var WUr = nUr();
    var k7u = qT();
    var h2s = yW();
    class _2s {
      config;
      middlewareStack = y2s.constructStack();
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
    function GUr(e, t) {
      if (t == null) {
        return t;
      }
      let n = k7u.NormalizedSchema.of(e);
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
            o[s] = GUr(i, r[s]);
          }
        }
        return o;
      }
      return t;
    }
    class KUr {
      middlewareStack = y2s.constructStack();
      schema;
      static classBuilder() {
        return new b2s();
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
          [WUr.SMITHY_CONTEXT_KEY]: {
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
    class b2s {
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
        return t = class extends KUr {
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
              inputFilterSensitiveLog: e._inputFilterSensitiveLog ?? (s ? GUr.bind(null, i) : l => l),
              outputFilterSensitiveLog: e._outputFilterSensitiveLog ?? (s ? GUr.bind(null, a) : l => l),
              smithyContext: e._smithyContext,
              additionalContext: e._additionalContext
            });
          }
          serialize = e._serializer;
          deserialize = e._deserializer;
        };
      }
    }
    var I7u = (e, t) => {
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
    class grt extends Error {
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
        return grt.prototype.isPrototypeOf(t) || Boolean(t.$fault) && Boolean(t.$metadata) && (t.$fault === "client" || t.$fault === "server");
      }
      static [Symbol.hasInstance](e) {
        if (!e) {
          return false;
        }
        let t = e;
        if (this === grt) {
          return grt.isInstance(e);
        }
        if (grt.isInstance(e)) {
          if (t.name && this.name) {
            return this.prototype.isPrototypeOf(e) || t.name === this.name;
          }
          return this.prototype.isPrototypeOf(e);
        }
        return false;
      }
    }
    var S2s = (e, t = {}) => {
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
    var T2s = ({
      output: e,
      parsedBody: t,
      exceptionCtor: n,
      errorCode: r
    }) => {
      let o = O7u(e);
      let s = o.httpStatusCode ? o.httpStatusCode + "" : undefined;
      let i = new n({
        name: t?.code || t?.Code || r || s || "UnknownError",
        $fault: "client",
        $metadata: o
      });
      throw S2s(i, t);
    };
    var P7u = e => ({
      output: t,
      parsedBody: n,
      errorCode: r
    }) => {
      T2s({
        output: t,
        parsedBody: n,
        exceptionCtor: e,
        errorCode: r
      });
    };
    var O7u = e => ({
      httpStatusCode: e.statusCode,
      requestId: e.headers["x-amzn-requestid"] ?? e.headers["x-amzn-request-id"] ?? e.headers["x-amz-request-id"],
      extendedRequestId: e.headers["x-amz-id-2"],
      cfId: e.headers["x-amz-cf-id"]
    });
    var D7u = e => {
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
    var g2s = false;
    var M7u = e => {
      if (e && !g2s && parseInt(e.substring(1, e.indexOf("."))) < 16) {
        g2s = true;
      }
    };
    var N7u = e => {
      let t = [];
      for (let n in WUr.AlgorithmId) {
        let r = WUr.AlgorithmId[n];
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
    var L7u = e => {
      let t = {};
      e.checksumAlgorithms().forEach(n => {
        t[n.algorithmId()] = n.checksumConstructor();
      });
      return t;
    };
    var F7u = e => ({
      setRetryStrategy(t) {
        e.retryStrategy = t;
      },
      retryStrategy() {
        return e.retryStrategy;
      }
    });
    var U7u = e => {
      let t = {};
      t.retryStrategy = e.retryStrategy();
      return t;
    };
    var E2s = e => Object.assign(N7u(e), F7u(e));
    var B7u = E2s;
    var $7u = e => Object.assign(L7u(e), U7u(e));
    var H7u = e => Array.isArray(e) ? e : [e];
    var v2s = e => {
      for (let n in e) {
        if (e.hasOwnProperty(n) && e[n]["#text"] !== undefined) {
          e[n] = e[n]["#text"];
        } else if (typeof e[n] === "object" && e[n] !== null) {
          e[n] = v2s(e[n]);
        }
      }
      return e;
    };
    var j7u = e => e != null;
    class w2s {
      trace() {}
      debug() {}
      info() {}
      warn() {}
      error() {}
    }
    function C2s(e, t, n) {
      let r;
      let o;
      let s;
      if (typeof t > "u" && typeof n > "u") {
        r = {};
        s = e;
      } else if (r = e, typeof t === "function") {
        o = t;
        s = n;
        return G7u(r, o, s);
      } else {
        s = t;
      }
      for (let i of Object.keys(s)) {
        if (!Array.isArray(s[i])) {
          r[i] = s[i];
          continue;
        }
        R2s(r, null, s, i);
      }
      return r;
    }
    var q7u = e => {
      let t = {};
      for (let [n, r] of Object.entries(e || {})) {
        t[n] = [, r];
      }
      return t;
    };
    var W7u = (e, t) => {
      let n = {};
      for (let r in t) {
        R2s(n, e, t, r);
      }
      return n;
    };
    var G7u = (e, t, n) => C2s(e, Object.entries(n).reduce((r, [o, s]) => {
      if (Array.isArray(s)) {
        r[o] = s;
      } else if (typeof s === "function") {
        r[o] = [t, s()];
      } else {
        r[o] = [t, s];
      }
      return r;
    }, {}));
    var R2s = (e, t, n, r) => {
      if (t !== null) {
        let i = n[r];
        if (typeof i === "function") {
          i = [, i];
        }
        let [a = V7u, l = z7u, c = r] = i;
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
    var V7u = e => e != null;
    var z7u = e => e;
    var K7u = e => {
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
    var Y7u = e => e.toISOString().replace(".000Z", "Z");
    var VUr = e => {
      if (e == null) {
        return {};
      }
      if (Array.isArray(e)) {
        return e.filter(t => t != null).map(VUr);
      }
      if (typeof e === "object") {
        let t = {};
        for (let n of Object.keys(e)) {
          if (e[n] == null) {
            continue;
          }
          t[n] = VUr(e[n]);
        }
        return t;
      }
      return e;
    };
    Object.defineProperty(eT, "collectBody", {
      enumerable: true,
      get: function () {
        return zUr.collectBody;
      }
    });
    Object.defineProperty(eT, "extendedEncodeURIComponent", {
      enumerable: true,
      get: function () {
        return zUr.extendedEncodeURIComponent;
      }
    });
    Object.defineProperty(eT, "resolvedPath", {
      enumerable: true,
      get: function () {
        return zUr.resolvedPath;
      }
    });
    eT.Client = _2s;
    eT.Command = KUr;
    eT.NoOpLogger = w2s;
    eT.SENSITIVE_STRING = "***SensitiveInformation***";
    eT.ServiceException = grt;
    eT._json = VUr;
    eT.convertMap = q7u;
    eT.createAggregatedClient = I7u;
    eT.decorateServiceException = S2s;
    eT.emitWarningIfUnsupportedVersion = M7u;
    eT.getArrayIfSingleItem = H7u;
    eT.getDefaultExtensionConfiguration = B7u;
    eT.getDefaultExtensionConfiguration = E2s;
    eT.getValueFromTextNode = v2s;
    eT.isSerializableHeaderValue = j7u;
    eT.loadConfigsForDefaultMode = D7u;
    eT.map = C2s;
    eT.resolveDefaultRuntimeConfig = $7u;
    eT.serializeDateTime = Y7u;
    eT.serializeFloat = K7u;
    eT.take = W7u;
    eT.throwDefaultError = T2s;
    eT.withBaseException = P7u;
    Object.keys(h2s).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(eT, e)) {
        Object.defineProperty(eT, e, {
          enumerable: true,
          get: function () {
            return h2s[e];
          }
        });
      }
    });
  });
  var k2s = __commonJS(x2s => {
    var J7u = e => typeof ArrayBuffer === "function" && e instanceof ArrayBuffer || Object.prototype.toString.call(e) === "[object ArrayBuffer]";
    x2s.isArrayBuffer = J7u;
  });
  var QUr = __commonJS(XUr => {
    var X7u = k2s();
    var JUr = require("buffer");
    var Q7u = (e, t = 0, n = e.byteLength - t) => {
      if (!X7u.isArrayBuffer(e)) {
        throw TypeError(`The "input" argument must be ArrayBuffer. Received type ${typeof e} (${e})`);
      }
      return JUr.Buffer.from(e, t, n);
    };
    var Z7u = (e, t) => {
      if (typeof e !== "string") {
        throw TypeError(`The "input" argument must be of type string. Received type ${typeof e} (${e})`);
      }
      return t ? JUr.Buffer.from(e, t) : JUr.Buffer.from(e);
    };
    XUr.fromArrayBuffer = Q7u;
    XUr.fromString = Z7u;
  });
  var A2s = __commonJS(wbn => {
    Object.defineProperty(wbn, "__esModule", {
      value: true
    });
    wbn.fromBase64 = undefined;
    var eYu = QUr();
    var nYu = e => {
      if (e.length * 3 % 4 !== 0) {
        throw TypeError("Incorrect padding on base64 string.");
      }
      if (!(/^[A-Za-z0-9+/]*={0,2}$/).exec(e)) {
        throw TypeError("Invalid base64 string.");
      }
      let t = (0, eYu.fromString)(e, "base64");
      return new Uint8Array(t.buffer, t.byteOffset, t.byteLength);
    };
    wbn.fromBase64 = nYu;
  });