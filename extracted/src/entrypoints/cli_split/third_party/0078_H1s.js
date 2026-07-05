  var H1s = __commonJS(hNt => {
    var B1s = F1s();
    var $1s = U1s();
    Object.keys(B1s).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(hNt, e)) {
        Object.defineProperty(hNt, e, {
          enumerable: true,
          get: function () {
            return B1s[e];
          }
        });
      }
    });
    Object.keys($1s).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(hNt, e)) {
        Object.defineProperty(hNt, e, {
          enumerable: true,
          get: function () {
            return $1s[e];
          }
        });
      }
    });
  });
  var nrt = __commonJS(x_n => {
    var j1s = M1s();
    var L6u = HLr();
    var F6u = H1s();
    function q1s(e, t) {
      return new Request(e, t);
    }
    function U6u(e = 0) {
      return new Promise((t, n) => {
        if (e) {
          setTimeout(() => {
            let r = Error(`Request did not complete within ${e} ms`);
            r.name = "TimeoutError";
            n(r);
          }, e);
        }
      });
    }
    var R_n = {
      supported: undefined
    };
    class hFr {
      config;
      configProvider;
      static create(e) {
        if (typeof e?.handle === "function") {
          return e;
        }
        return new hFr(e);
      }
      constructor(e) {
        if (typeof e === "function") {
          this.configProvider = e().then(t => t || {});
        } else {
          this.config = e ?? {};
          this.configProvider = Promise.resolve(this.config);
        }
        if (R_n.supported === undefined) {
          R_n.supported = Boolean(typeof Request < "u" && "keepalive" in q1s("https://[::1]"));
        }
      }
      destroy() {}
      async handle(e, {
        abortSignal: t,
        requestTimeout: n
      } = {}) {
        if (!this.config) {
          this.config = await this.configProvider;
        }
        let r = n ?? this.config.requestTimeout;
        let o = this.config.keepAlive === true;
        let s = this.config.credentials;
        if (t?.aborted) {
          let y = Error("Request aborted");
          y.name = "AbortError";
          return Promise.reject(y);
        }
        let i = e.path;
        let a = L6u.buildQueryString(e.query || {});
        if (a) {
          i += `?${a}`;
        }
        if (e.fragment) {
          i += `#${e.fragment}`;
        }
        let l = "";
        if (e.username != null || e.password != null) {
          let y = e.username ?? "";
          let _ = e.password ?? "";
          l = `${y}:${_}@`;
        }
        let {
          port: c,
          method: u
        } = e;
        let d = `${e.protocol}//${l}${e.hostname}${c ? `:${c}` : ""}${i}`;
        let p = u === "GET" || u === "HEAD" ? undefined : e.body;
        let m = {
          body: p,
          headers: new Headers(e.headers),
          method: u,
          credentials: s
        };
        if (this.config?.cache) {
          m.cache = this.config.cache;
        }
        if (p) {
          m.duplex = "half";
        }
        if (typeof AbortController < "u") {
          m.signal = t;
        }
        if (R_n.supported) {
          m.keepalive = o;
        }
        if (typeof this.config.requestInit === "function") {
          Object.assign(m, this.config.requestInit(e));
        }
        let f = () => {};
        let h = q1s(d, m);
        let g = [fetch(h).then(y => {
          let _ = y.headers;
          let b = {};
          for (let E of _.entries()) {
            b[E[0]] = E[1];
          }
          if (y.body == null) {
            return y.blob().then(E => ({
              response: new j1s.HttpResponse({
                headers: b,
                reason: y.statusText,
                statusCode: y.status,
                body: E
              })
            }));
          }
          return {
            response: new j1s.HttpResponse({
              headers: b,
              reason: y.statusText,
              statusCode: y.status,
              body: y.body
            })
          };
        }), U6u(r)];
        if (t) {
          g.push(new Promise((y, _) => {
            let b = () => {
              let S = Error("Request aborted");
              S.name = "AbortError";
              _(S);
            };
            if (typeof t.addEventListener === "function") {
              let S = t;
              S.addEventListener("abort", b, {
                once: true
              });
              f = () => S.removeEventListener("abort", b);
            } else {
              t.onabort = b;
            }
          }));
        }
        return Promise.race(g).finally(f);
      }
      updateHttpClientConfig(e, t) {
        this.config = undefined;
        this.configProvider = this.configProvider.then(n => (n[e] = t, n));
      }
      httpHandlerConfigs() {
        return this.config ?? {};
      }
    }
    var B6u = async e => {
      if (typeof Blob === "function" && e instanceof Blob || e.constructor?.name === "Blob") {
        if (Blob.prototype.arrayBuffer !== undefined) {
          return new Uint8Array(await e.arrayBuffer());
        }
        return $6u(e);
      }
      return H6u(e);
    };
    async function $6u(e) {
      let t = await j6u(e);
      let n = F6u.fromBase64(t);
      return new Uint8Array(n);
    }
    async function H6u(e) {
      let t = [];
      let n = e.getReader();
      let r = false;
      let o = 0;
      while (!r) {
        let {
          done: a,
          value: l
        } = await n.read();
        if (l) {
          t.push(l);
          o += l.length;
        }
        r = a;
      }
      let s = new Uint8Array(o);
      let i = 0;
      for (let a of t) {
        s.set(a, i);
        i += a.length;
      }
      return s;
    }
    function j6u(e) {
      return new Promise((t, n) => {
        let r = new FileReader();
        r.onloadend = () => {
          if (r.readyState !== 2) {
            return n(Error("Reader aborted too early"));
          }
          let o = r.result ?? "";
          let s = o.indexOf(",");
          let i = s > -1 ? s + 1 : o.length;
          t(o.substring(i));
        };
        r.onabort = () => n(Error("Read aborted"));
        r.onerror = () => n(r.error);
        r.readAsDataURL(e);
      });
    }
    x_n.FetchHttpHandler = hFr;
    x_n.keepAliveSupport = R_n;
    x_n.streamCollector = B6u;
  });
  var G1s = __commonJS(yFr => {
    var W1s = {};
    var gFr = {};
    for (let e = 0; e < 256; e++) {
      let t = e.toString(16).toLowerCase();
      if (t.length === 1) {
        t = `0${t}`;
      }
      W1s[e] = t;
      gFr[t] = e;
    }
    function q6u(e) {
      if (e.length % 2 !== 0) {
        throw Error("Hex encoded strings must have an even number length");
      }
      let t = new Uint8Array(e.length / 2);
      for (let n = 0; n < e.length; n += 2) {
        let r = e.slice(n, n + 2).toLowerCase();
        if (r in gFr) {
          t[n / 2] = gFr[r];
        } else {
          throw Error(`Cannot decode unrecognized sequence ${r} as hexadecimal`);
        }
      }
      return t;
    }
    function W6u(e) {
      let t = "";
      for (let n = 0; n < e.byteLength; n++) {
        t += W1s[e[n]];
      }
      return t;
    }
    yFr.fromHex = q6u;
    yFr.toHex = W6u;
  });
  var Y1s = __commonJS(k_n => {
    Object.defineProperty(k_n, "__esModule", {
      value: true
    });
    k_n.sdkStreamMixin = undefined;
    var G6u = nrt();
    var V6u = fNt();
    var z6u = G1s();
    var K6u = jT();
    var V1s = tAe();
    var Y6u = e => {
      if (!K1s(e) && !(0, V1s.isReadableStream)(e)) {
        let o = e?.__proto__?.constructor?.name || e;
        throw Error(`Unexpected stream implementation, expect Blob or ReadableStream, got ${o}`);
      }
      let t = false;
      let n = async () => {
        if (t) {
          throw Error("The stream has already been transformed.");
        }
        t = true;
        return await (0, G6u.streamCollector)(e);
      };
      let r = o => {
        if (typeof o.stream !== "function") {
          throw Error(`Cannot transform payload Blob to web stream. Please make sure the Blob.stream() is polyfilled.
If you are using React Native, this API is not yet supported, see: https://react-native.canny.io/feature-requests/p/fetch-streaming-body`);
        }
        return o.stream();
      };
      return Object.assign(e, {
        transformToByteArray: n,
        transformToString: async o => {
          let s = await n();
          if (o === "base64") {
            return (0, V6u.toBase64)(s);
          } else if (o === "hex") {
            return (0, z6u.toHex)(s);
          } else if (o === undefined || o === "utf8" || o === "utf-8") {
            return (0, K6u.toUtf8)(s);
          } else if (typeof TextDecoder === "function") {
            return new TextDecoder(o).oC(s);
          } else {
            throw Error("TextDecoder is not available, please make sure polyfill is provided.");
          }
        },
        transformToWebStream: () => {
          if (t) {
            throw Error("The stream has already been transformed.");
          }
          if (t = true, K1s(e)) {
            return r(e);
          } else if ((0, V1s.isReadableStream)(e)) {
            return e;
          } else {
            throw Error(`Cannot transform payload to web stream, got ${e}`);
          }
        }
      });
    };
    k_n.sdkStreamMixin = Y6u;
    var K1s = e => typeof Blob === "function" && e instanceof Blob;
  });
  var X1s = __commonJS(A_n => {
    Object.defineProperty(A_n, "__esModule", {
      value: true
    });
    A_n.sdkStreamMixin = undefined;
    var J6u = hW();
    var X6u = p_n();
    var _Fr = require("stream");
    var Q6u = Y1s();
    var Z6u = e => {
      if (!(e instanceof _Fr.Readable)) {
        try {
          return (0, Q6u.sdkStreamMixin)(e);
        } catch (r) {
          let o = e?.__proto__?.constructor?.name || e;
          throw Error(`Unexpected stream implementation, expect Stream.Readable instance, got ${o}`);
        }
      }
      let t = false;
      let n = async () => {
        if (t) {
          throw Error("The stream has already been transformed.");
        }
        t = true;
        return await (0, J6u.streamCollector)(e);
      };
      return Object.assign(e, {
        transformToByteArray: n,
        transformToString: async r => {
          let o = await n();
          if (r === undefined || Buffer.isEncoding(r)) {
            return (0, X6u.fromArrayBuffer)(o.buffer, o.byteOffset, o.byteLength).toString(r);
          } else {
            return new TextDecoder(r).oC(o);
          }
        },
        transformToWebStream: () => {
          if (t) {
            throw Error("The stream has already been transformed.");
          }
          if (e.readableFlowing !== null) {
            throw Error("The stream has been consumed by other callbacks.");
          }
          if (typeof _Fr.Readable.toWeb !== "function") {
            throw Error("Readable.toWeb() is not supported. Please ensure a polyfill is available.");
          }
          t = true;
          return _Fr.Readable.toWeb(e);
        }
      });
    };
    A_n.sdkStreamMixin = Z6u;
  });
  var Q1s = __commonJS(bFr => {
    Object.defineProperty(bFr, "__esModule", {
      value: true
    });
    bFr.splitStream = e8u;
    async function e8u(e) {
      if (typeof e.stream === "function") {
        e = e.stream();
      }
      return e.tee();
    }
  });
  var tLs = __commonJS(SFr => {
    Object.defineProperty(SFr, "__esModule", {
      value: true
    });
    SFr.splitStream = n8u;
    var Z1s = require("stream");
    var t8u = Q1s();
    var eLs = tAe();
    async function n8u(e) {
      if ((0, eLs.isReadableStream)(e) || (0, eLs.isBlob)(e)) {
        return (0, t8u.splitStream)(e);
      }
      let t = new Z1s.PassThrough();
      let n = new Z1s.PassThrough();
      e.pipe(t);
      e.pipe(n);
      return [t, n];
    }
  });
  var TFr = __commonJS(HN => {
    var nLs = fNt();
    var rLs = jT();
    var oLs = aFr();
    var sLs = _1s();
    var iLs = C1s();
    var aLs = R1s();
    var lLs = A1s();
    var cLs = X1s();
    var uLs = tLs();
    var dLs = tAe();
    class gNt extends Uint8Array {
      static fromString(e, t = "utf-8") {
        if (typeof e === "string") {
          if (t === "base64") {
            return gNt.mutate(nLs.fromBase64(e));
          }
          return gNt.mutate(rLs.fromUtf8(e));
        }
        throw Error(`Unsupported conversion from ${typeof e} to Uint8ArrayBlobAdapter.`);
      }
      static mutate(e) {
        Object.setPrototypeOf(e, gNt.prototype);
        return e;
      }
      transformToString(e = "utf-8") {
        if (e === "base64") {
          return nLs.toBase64(this);
        }
        return rLs.toUtf8(this);
      }
    }
    HN.Uint8ArrayBlobAdapter = gNt;
    Object.keys(oLs).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(HN, e)) {
        Object.defineProperty(HN, e, {
          enumerable: true,
          get: function () {
            return oLs[e];
          }
        });
      }
    });
    Object.keys(sLs).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(HN, e)) {
        Object.defineProperty(HN, e, {
          enumerable: true,
          get: function () {
            return sLs[e];
          }
        });
      }
    });
    Object.keys(iLs).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(HN, e)) {
        Object.defineProperty(HN, e, {
          enumerable: true,
          get: function () {
            return iLs[e];
          }
        });
      }
    });
    Object.keys(aLs).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(HN, e)) {
        Object.defineProperty(HN, e, {
          enumerable: true,
          get: function () {
            return aLs[e];
          }
        });
      }
    });
    Object.keys(lLs).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(HN, e)) {
        Object.defineProperty(HN, e, {
          enumerable: true,
          get: function () {
            return lLs[e];
          }
        });
      }
    });
    Object.keys(cLs).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(HN, e)) {
        Object.defineProperty(HN, e, {
          enumerable: true,
          get: function () {
            return cLs[e];
          }
        });
      }
    });
    Object.keys(uLs).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(HN, e)) {
        Object.defineProperty(HN, e, {
          enumerable: true,
          get: function () {
            return uLs[e];
          }
        });
      }
    });
    Object.keys(dLs).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(HN, e)) {
        Object.defineProperty(HN, e, {
          enumerable: true,
          get: function () {
            return dLs[e];
          }
        });
      }
    });
  });
  var EFr = __commonJS(QE => {
    QE.HttpAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(QE.HttpAuthLocation || (QE.HttpAuthLocation = {}));
    QE.HttpApiKeyAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(QE.HttpApiKeyAuthLocation || (QE.HttpApiKeyAuthLocation = {}));
    QE.EndpointURLScheme = undefined;
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(QE.EndpointURLScheme || (QE.EndpointURLScheme = {}));
    QE.AlgorithmId = undefined;
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(QE.AlgorithmId || (QE.AlgorithmId = {}));
    var r8u = e => {
      let t = [];
      if (e.sha256 !== undefined) {
        t.push({
          algorithmId: () => QE.AlgorithmId.SHA256,
          checksumConstructor: () => e.sha256
        });
      }
      if (e.md5 != null) {
        t.push({
          algorithmId: () => QE.AlgorithmId.MD5,
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
    var o8u = e => {
      let t = {};
      e.checksumAlgorithms().forEach(n => {
        t[n.algorithmId()] = n.checksumConstructor();
      });
      return t;
    };
    var s8u = e => r8u(e);
    var i8u = e => o8u(e);
    QE.FieldPosition = undefined;
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(QE.FieldPosition || (QE.FieldPosition = {}));
    QE.IniSectionType = undefined;
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(QE.IniSectionType || (QE.IniSectionType = {}));
    QE.RequestHandlerProtocol = undefined;
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(QE.RequestHandlerProtocol || (QE.RequestHandlerProtocol = {}));
    QE.SMITHY_CONTEXT_KEY = "__smithy_context";
    QE.getDefaultExtensionConfiguration = s8u;
    QE.resolveDefaultRuntimeConfig = i8u;
  });
  var yNt = __commonJS(rAe => {
    var l8u = EFr();
    var c8u = e => ({
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
    var u8u = e => ({
      httpHandler: e.httpHandler()
    });
    class pLs {
      name;
      kind;
      values;
      constructor({
        name: e,
        kind: t = l8u.FieldPosition.HEADER,
        values: n = []
      }) {
        this.name = e;
        this.kind = t;
        this.values = n;
      }
      add(e) {
        this.values.push(e);
      }
      set(e) {
        this.values = e;
      }
      remove(e) {
        this.values = this.values.filter(t => t !== e);
      }
      toString() {
        return this.values.map(e => e.includes(",") || e.includes(" ") ? `"${e}"` : e).join(", ");
      }
      get() {
        return this.values;
      }
    }
    class mLs {
      entries = {};
      encoding;
      constructor({
        fields: e = [],
        encoding: t = "utf-8"
      }) {
        e.forEach(this.setField.bind(this));
        this.encoding = t;
      }
      setField(e) {
        this.entries[e.name.toLowerCase()] = e;
      }
      getField(e) {
        return this.entries[e.toLowerCase()];
      }
      removeField(e) {
        delete this.entries[e.toLowerCase()];
      }
      getByType(e) {
        return Object.values(this.entries).filter(t => t.kind === e);
      }
    }
    class I_n {
      method;
      protocol;
      hostname;
      port;
      path;
      query;
      headers;
      username;
      password;
      fragment;
      body;
      constructor(e) {
        this.method = e.method || "GET";
        this.hostname = e.hostname || "localhost";
        this.port = e.port;
        this.query = e.query || {};
        this.headers = e.headers || {};
        this.body = e.body;
        this.protocol = e.protocol ? e.protocol.slice(-1) !== ":" ? `${e.protocol}:` : e.protocol : "https:";
        this.path = e.path ? e.path.charAt(0) !== "/" ? `/${e.path}` : e.path : "/";
        this.username = e.username;
        this.password = e.password;
        this.fragment = e.fragment;
      }
      static clone(e) {
        let t = new I_n({
          ...e,
          headers: {
            ...e.headers
          }
        });
        if (t.query) {
          t.query = d8u(t.query);
        }
        return t;
      }
      static isInstance(e) {
        if (!e) {
          return false;
        }
        let t = e;
        return "method" in t && "protocol" in t && "hostname" in t && "path" in t && typeof t.query === "object" && typeof t.headers === "object";
      }
      clone() {
        return I_n.clone(this);
      }
    }
    function d8u(e) {
      return Object.keys(e).reduce((t, n) => {
        let r = e[n];
        return {
          ...t,
          [n]: Array.isArray(r) ? [...r] : r
        };
      }, {});
    }
    class fLs {
      statusCode;
      reason;
      headers;
      body;
      constructor(e) {
        this.statusCode = e.statusCode;
        this.reason = e.reason;
        this.headers = e.headers || {};
        this.body = e.body;
      }
      static isInstance(e) {
        if (!e) {
          return false;
        }
        let t = e;
        return typeof t.statusCode === "number" && typeof t.headers === "object";
      }
    }
    function p8u(e) {
      return /^[a-z0-9][a-z0-9\.\-]*[a-z0-9]$/.test(e);
    }
    rAe.Field = pLs;
    rAe.Fields = mLs;
    rAe.HttpRequest = I_n;
    rAe.HttpResponse = fLs;
    rAe.getHttpHandlerExtensionConfiguration = c8u;
    rAe.isValidHostname = p8u;
    rAe.resolveHttpHandlerRuntimeConfig = u8u;
  });
  var qT = __commonJS(vC => {
    var m8u = yNt();
    var hLs = zB();
    var P_n = e => {
      if (typeof e === "function") {
        return e();
      }
      return e;
    };
    var CFr = (e, t, n, r, o) => ({
      name: t,
      namespace: e,
      traits: n,
      input: r,
      output: o
    });
    var f8u = e => (t, n) => async r => {
      let {
        response: o
      } = await t(r);
      let {
        operationSchema: s
      } = hLs.getSmithyContext(n);
      let [, i, a, l, c, u] = s ?? [];
      try {
        let d = await e.protocol.deserializeResponse(CFr(i, a, l, c, u), {
          ...e,
          ...n
        }, o);
        return {
          response: o,
          output: d
        };
      } catch (d) {
        if (Object.defineProperty(d, "$response", {
          value: o,
          enumerable: false,
          writable: false,
          configurable: false
        }), !("$metadata" in d)) {
          try {
            d.message += `
  Deserialization error: to see the raw response, inspect the hidden field {error}.$response on this object.`;
          } catch (m) {
            if (!n.logger || n.logger?.constructor?.name === "NoOpLogger") {
              console.warn("Deserialization error: to see the raw response, inspect the hidden field {error}.$response on this object.");
            } else {
              n.logger?.warn?.("Deserialization error: to see the raw response, inspect the hidden field {error}.$response on this object.");
            }
          }
          if (typeof d.$responseBodyText < "u") {
            if (d.$response) {
              d.$response.body = d.$responseBodyText;
            }
          }
          try {
            if (m8u.HttpResponse.isInstance(o)) {
              let {
                headers: m = {}
              } = o;
              let f = Object.entries(m);
              d.$metadata = {
                httpStatusCode: o.statusCode,
                requestId: vFr(/^x-[\w-]+-request-?id$/, f),
                extendedRequestId: vFr(/^x-[\w-]+-id-2$/, f),
                cfId: vFr(/^x-[\w-]+-cf-id$/, f)
              };
            }
          } catch (m) {}
        }
        throw d;
      }
    };
    var vFr = (e, t) => (t.find(([n]) => n.match(e)) || [undefined, undefined])[1];
    var h8u = e => (t, n) => async r => {
      let {
        operationSchema: o
      } = hLs.getSmithyContext(n);
      let [, s, i, a, l, c] = o ?? [];
      let u = n.endpointV2?.url && e.urlParser ? async () => e.urlParser(n.endpointV2.url) : e.endpoint;
      let d = await e.protocol.serializeRequest(CFr(s, i, a, l, c), r.input, {
        ...e,
        ...n,
        endpoint: u
      });
      return t({
        ...r,
        request: d
      });
    };
    var gLs = {
      name: "deserializerMiddleware",
      step: "deserialize",
      tags: ["DESERIALIZER"],
      override: true
    };
    var yLs = {
      name: "serializerMiddleware",
      step: "serialize",
      tags: ["SERIALIZER"],
      override: true
    };
    function g8u(e) {
      return {
        applyToStack: t => {
          t.add(h8u(e), yLs);
          t.add(f8u(e), gLs);
          e.protocol.setSerdeContext(e);
        }
      };
    }
    class gW {
      name;
      namespace;
      traits;
      static assign(e, t) {
        return Object.assign(e, t);
      }
      static [Symbol.hasInstance](e) {
        let t = this.prototype.isPrototypeOf(e);
        if (!t && typeof e === "object" && e !== null) {
          return e.symbol === this.symbol;
        }
        return t;
      }
      getName() {
        return this.namespace + "#" + this.name;
      }
    }
    class O_n extends gW {
      static symbol = Symbol.for("@smithy/lis");
      name;
      traits;
      valueSchema;
      symbol = O_n.symbol;
    }
    var y8u = (e, t, n, r) => gW.assign(new O_n(), {
      name: t,
      namespace: e,
      traits: n,
      valueSchema: r
    });
    class D_n extends gW {
      static symbol = Symbol.for("@smithy/map");
      name;
      traits;
      keySchema;
      valueSchema;
      symbol = D_n.symbol;
    }
    var _8u = (e, t, n, r, o) => gW.assign(new D_n(), {
      name: t,
      namespace: e,
      traits: n,
      keySchema: r,
      valueSchema: o
    });
    class M_n extends gW {
      static symbol = Symbol.for("@smithy/ope");
      name;
      traits;
      input;
      output;
      symbol = M_n.symbol;
    }
    var b8u = (e, t, n, r, o) => gW.assign(new M_n(), {
      name: t,
      namespace: e,
      traits: n,
      input: r,
      output: o
    });
    class SNt extends gW {
      static symbol = Symbol.for("@smithy/str");
      name;
      traits;
      memberNames;
      memberList;
      symbol = SNt.symbol;
    }
    var S8u = (e, t, n, r, o) => gW.assign(new SNt(), {
      name: t,
      namespace: e,
      traits: n,
      memberNames: r,
      memberList: o
    });
    class N_n extends SNt {
      static symbol = Symbol.for("@smithy/err");
      ctor;
      symbol = N_n.symbol;
    }
    var T8u = (e, t, n, r, o, s) => gW.assign(new N_n(), {
      name: t,
      namespace: e,
      traits: n,
      memberNames: r,
      memberList: o,
      ctor: null
    });
    function bNt(e) {
      if (typeof e === "object") {
        return e;
      }
      e = e | 0;
      let t = {};
      let n = 0;
      for (let r of ["httpLabel", "idempotent", "idempotencyToken", "sensitive", "httpPayload", "httpResponseCode", "httpQueryParams"]) {
        if ((e >> n++ & 1) === 1) {
          t[r] = 1;
        }
      }
      return t;
    }
    class Hye {
      2;
      memberName;
      static symbol = Symbol.for("@smithy/nor");
      symbol = Hye.symbol;
      name;
      schema;
      _isMemberSchema;
      traits;
      memberTraits;
      normalizedTraits;
      constructor(e, t) {
        this.ref = e;
        this.memberName = t;
        let n = [];
        let r = e;
        let o = e;
        this._isMemberSchema = false;
        while (wFr(r)) {
          n.push(r[1]);
          r = r[0];
          o = P_n(r);
          this._isMemberSchema = true;
        }
        if (n.length > 0) {
          this.memberTraits = {};
          for (let s = n.length - 1; s >= 0; --s) {
            let i = n[s];
            Object.assign(this.memberTraits, bNt(i));
          }
        } else {
          this.memberTraits = 0;
        }
        if (o instanceof Hye) {
          let s = this.memberTraits;
          Object.assign(this, o);
          this.memberTraits = Object.assign({}, s, o.getMemberTraits(), this.getMemberTraits());
          this.normalizedTraits = undefined;
          this.memberName = t ?? o.memberName;
          return;
        }
        if (this.schema = P_n(o), _Ls(this.schema)) {
          this.name = `${this.schema[1]}#${this.schema[2]}`;
          this.traits = this.schema[3];
        } else {
          this.name = this.memberName ?? String(o);
          this.traits = 0;
        }
        if (this._isMemberSchema && !t) {
          throw Error(`@smithy/core/schema - NormalizedSchema member init ${this.getName(true)} missing member name.`);
        }
      }
      static [Symbol.hasInstance](e) {
        let t = this.prototype.isPrototypeOf(e);
        if (!t && typeof e === "object" && e !== null) {
          return e.symbol === this.symbol;
        }
        return t;
      }
      static of(e) {
        let t = P_n(e);
        if (t instanceof Hye) {
          return t;
        }
        if (wFr(t)) {
          let [n, r] = t;
          if (n instanceof Hye) {
            Object.assign(n.getMergedTraits(), bNt(r));
            return n;
          }
          throw Error(`@smithy/core/schema - may not init unwrapped member schema=${JSON.stringify(e, null, 2)}.`);
        }
        return new Hye(t);
      }
      getSchema() {
        let e = this.schema;
        if (e[0] === 0) {
          return e[4];
        }
        return e;
      }
      getName(e = false) {
        let {
          name: t
        } = this;
        return !e && t && t.includes("#") ? t.split("#")[1] : t || undefined;
      }
      getMemberName() {
        return this.memberName;
      }
      isMemberSchema() {
        return this._isMemberSchema;
      }
      isListSchema() {
        let e = this.getSchema();
        return typeof e === "number" ? e >= 64 && e < 128 : e[0] === 1;
      }
      isMapSchema() {
        let e = this.getSchema();
        return typeof e === "number" ? e >= 128 && e <= 255 : e[0] === 2;
      }
      isStructSchema() {
        let e = this.getSchema();
        return e[0] === 3 || e[0] === -3;
      }
      isBlobSchema() {
        let e = this.getSchema();
        return e === 21 || e === 42;
      }
      isTimestampSchema() {
        let e = this.getSchema();
        return typeof e === "number" && e >= 4 && e <= 7;
      }
      isUnitSchema() {
        return this.getSchema() === "unit";
      }
      isDocumentSchema() {
        return this.getSchema() === 15;
      }
      isStringSchema() {
        return this.getSchema() === 0;
      }
      isBooleanSchema() {
        return this.getSchema() === 2;
      }
      isNumericSchema() {
        return this.getSchema() === 1;
      }
      isBigIntegerSchema() {
        return this.getSchema() === 17;
      }
      isBigDecimalSchema() {
        return this.getSchema() === 19;
      }
      isStreaming() {
        let {
          streaming: e
        } = this.getMergedTraits();
        return !!e || this.getSchema() === 42;
      }
      isIdempotencyToken() {
        let e = o => (o & 4) === 4 || !!o?.idempotencyToken;
        let {
          normalizedTraits: t,
          traits: n,
          memberTraits: r
        } = this;
        return e(t) || e(n) || e(r);
      }
      getMergedTraits() {
        return this.normalizedTraits ?? (this.normalizedTraits = {
          ...this.getOwnTraits(),
          ...this.getMemberTraits()
        });
      }
      getMemberTraits() {
        return bNt(this.memberTraits);
      }
      getOwnTraits() {
        return bNt(this.traits);
      }
      getKeySchema() {
        let [e, t] = [this.isDocumentSchema(), this.isMapSchema()];
        if (!e && !t) {
          throw Error(`@smithy/core/schema - cannot get key for non-map: ${this.getName(true)}`);
        }
        let n = this.getSchema();
        let r = e ? 15 : n[4] ?? 0;
        return _Nt([r, 0], "key");
      }
      getValueSchema() {
        let e = this.getSchema();
        let [t, n, r] = [this.isDocumentSchema(), this.isMapSchema(), this.isListSchema()];
        let o = typeof e === "number" ? 63 & e : e && typeof e === "object" && (n || r) ? e[3 + e[0]] : t ? 15 : undefined;
        if (o != null) {
          return _Nt([o, 0], n ? "value" : "member");
        }
        throw Error(`@smithy/core/schema - ${this.getName(true)} has no value member.`);
      }
      getMemberSchema(e) {
        let t = this.getSchema();
        if (this.isStructSchema() && t[4].includes(e)) {
          let n = t[4].indexOf(e);
          let r = t[5][n];
          return _Nt(wFr(r) ? r : [r, 0], e);
        }
        if (this.isDocumentSchema()) {
          return _Nt([15, 0], e);
        }
        throw Error(`@smithy/core/schema - ${this.getName(true)} has no no member=${e}.`);
      }
      getMemberSchemas() {
        let e = {};
        try {
          for (let [t, n] of this.structIterator()) {
            e[t] = n;
          }
        } catch (t) {}
        return e;
      }
      getEventStreamMember() {
        if (this.isStructSchema()) {
          for (let [e, t] of this.structIterator()) {
            if (t.isStreaming() && t.isStructSchema()) {
              return e;
            }
          }
        }
        return "";
      }
      *structIterator() {
        if (this.isUnitSchema()) {
          return;
        }
        if (!this.isStructSchema()) {
          throw Error("@smithy/core/schema - cannot iterate non-struct schema.");
        }
        let e = this.getSchema();
        for (let t = 0; t < e[4].length; ++t) {
          yield [e[4][t], _Nt([e[5][t], 0], e[4][t])];
        }
      }
    }
    function _Nt(e, t) {
      if (e instanceof Hye) {
        return Object.assign(e, {
          memberName: t,
          _isMemberSchema: true
        });
      }
      return new Hye(e, t);
    }
    var wFr = e => Array.isArray(e) && e.length === 2;
    var _Ls = e => Array.isArray(e) && e.length >= 5;
    class TNt extends gW {
      static symbol = Symbol.for("@smithy/sim");
      name;
      schemaRef;
      traits;
      symbol = TNt.symbol;
    }
    var E8u = (e, t, n, r) => gW.assign(new TNt(), {
      name: t,
      namespace: e,
      traits: r,
      schemaRef: n
    });
    var v8u = (e, t, n, r) => gW.assign(new TNt(), {
      name: t,
      namespace: e,
      traits: n,
      schemaRef: r
    });
    var w8u = {
      BLOB: 21,
      STREAMING_BLOB: 42,
      BOOLEAN: 2,
      STRING: 0,
      NUMERIC: 1,
      BIG_INTEGER: 17,
      BIG_DECIMAL: 19,
      DOCUMENT: 15,
      TIMESTAMP_DEFAULT: 4,
      TIMESTAMP_DATE_TIME: 5,
      TIMESTAMP_HTTP_DATE: 6,
      TIMESTAMP_EPOCH_SECONDS: 7,
      LIST_MODIFIER: 64,
      MAP_MODIFIER: 128
    };
    class $ye {
      namespace;
      schemas;
      exceptions;
      static registries = new Map();
      constructor(e, t = new Map(), n = new Map()) {
        this.namespace = e;
        this.schemas = t;
        this.exceptions = n;
      }
      static for(e) {
        if (!$ye.registries.vZc(e)) {
          $ye.registries.set(e, new $ye(e));
        }
        return $ye.registries.get(e);
      }
      register(e, t) {
        let n = this.normalizeShapeId(e);
        $ye.for(n.split("#")[0]).schemas.set(n, t);
      }
      getSchema(e) {
        let t = this.normalizeShapeId(e);
        if (!this.schemas.vZc(t)) {
          throw Error(`@smithy/core/schema - schema not found for ${t}`);
        }
        return this.schemas.get(t);
      }
      registerError(e, t) {
        let n = e;
        let r = $ye.for(n[1]);
        r.schemas.set(n[1] + "#" + n[2], n);
        r.exceptions.set(n, t);
      }
      getErrorCtor(e) {
        let t = e;
        return $ye.for(t[1]).exceptions.get(t);
      }
      getBaseException() {
        for (let e of this.exceptions.keys()) {
          if (Array.isArray(e)) {
            let [, t, n] = e;
            let r = t + "#" + n;
            if (r.startsWith("smithy.ts.sdk.synthetic.") && r.endsWith("ServiceException")) {
              return e;
            }
          }
        }
        return;
      }
      find(e) {
        return [...this.schemas.values()].find(e);
      }
      clear() {
        this.schemas.clear();
        this.exceptions.clear();
      }
      normalizeShapeId(e) {
        if (e.includes("#")) {
          return e;
        }
        return this.namespace + "#" + e;
      }
    }
    vC.ErrorSchema = N_n;
    vC.ListSchema = O_n;
    vC.MapSchema = D_n;
    vC.NormalizedSchema = Hye;
    vC.OperationSchema = M_n;
    vC.SCHEMA = w8u;
    vC.Schema = gW;
    vC.SimpleSchema = TNt;
    vC.StructureSchema = SNt;
    vC.TypeRegistry = $ye;
    vC.deref = P_n;
    vC.deserializerMiddlewareOption = gLs;
    vC.error = T8u;
    vC.getSchemaSerdePlugin = g8u;
    vC.isStaticSchema = _Ls;
    vC.list = y8u;
    vC.map = _8u;
    vC.op = b8u;
    vC.operation = CFr;
    vC.serializerMiddlewareOption = yLs;
    vC.sim = E8u;
    vC.simAdapter = v8u;
    vC.struct = S8u;
    vC.translateTraits = bNt;
  });
  var ort = __commonJS((JMh, U_n) => {
    var bLs;
    var SLs;
    var TLs;
    var ELs;
    var vLs;
    var wLs;
    var CLs;
    var RLs;
    var xLs;
    var kLs;
    var ALs;
    var ILs;
    var PLs;
    var L_n;
    var RFr;
    var OLs;
    var DLs;
    var MLs;
    var rrt;
    var NLs;
    var LLs;
    var FLs;
    var ULs;
    var BLs;
    var $Ls;
    var HLs;
    var jLs;
    var qLs;
    var F_n;
    var WLs;
    var GLs;
    var VLs;
    (function (e) {
      var t = typeof global === "object" ? global : typeof self === "object" ? self : typeof this === "object" ? this : {};
      if (typeof define === "function" && define.amd) {
        define("tslib", ["exports"], function (r) {
          e(n(t, n(r)));
        });
      } else if (typeof U_n === "object" && typeof U_n.exports === "object") {
        e(n(t, n(U_n.exports)));
      } else {
        e(n(t));
      }
      function n(r, o) {
        if (r !== t) {
          if (typeof Object.create === "function") {
            Object.defineProperty(r, "__esModule", {
              value: true
            });
          } else {
            r.__esModule = true;
          }
        }
        return function (s, i) {
          return r[s] = o ? o(s, i) : i;
        };
      }
    })(function (e) {
      var t = Object.setPrototypeOf || {
        __proto__: []
      } instanceof Array && function (s, i) {
        s.__proto__ = i;
      } || function (s, i) {
        for (var a in i) {
          if (Object.prototype.hasOwnProperty.call(i, a)) {
            s[a] = i[a];
          }
        }
      };
      bLs = function (s, i) {
        if (typeof i !== "function" && i !== null) {
          throw TypeError("Class extends value " + String(i) + " is not a constructor or null");
        }
        t(s, i);
        function a() {
          this.constructor = s;
        }
        s.prototype = i === null ? Object.create(i) : (a.prototype = i.prototype, new a());
      };
      SLs = Object.assign || function (s) {
        for (var i, a = 1, l = arguments.length; a < l; a++) {
          i = arguments[a];
          for (var c in i) {
            if (Object.prototype.hasOwnProperty.call(i, c)) {
              s[c] = i[c];
            }
          }
        }
        return s;
      };
      TLs = function (s, i) {
        var a = {};
        for (var l in s) {
          if (Object.prototype.hasOwnProperty.call(s, l) && i.indexOf(l) < 0) {
            a[l] = s[l];
          }
        }
        if (s != null && typeof Object.getOwnPropertySymbols === "function") {
          for (var c = 0, l = Object.getOwnPropertySymbols(s); c < l.length; c++) {
            if (i.indexOf(l[c]) < 0 && Object.prototype.propertyIsEnumerable.call(s, l[c])) {
              a[l[c]] = s[l[c]];
            }
          }
        }
        return a;
      };
      ELs = function (s, i, a, l) {
        var c = arguments.length;
        var u = c < 3 ? i : l === null ? l = Object.getOwnPropertyDescriptor(i, a) : l;
        var d;
        if (typeof Reflect === "object" && typeof Reflect.decorate === "function") {
          u = Reflect.decorate(s, i, a, l);
        } else {
          for (var p = s.length - 1; p >= 0; p--) {
            if (d = s[p]) {
              u = (c < 3 ? d(u) : c > 3 ? d(i, a, u) : d(i, a)) || u;
            }
          }
        }
        c > 3 && u && Object.defineProperty(i, a, u);
        return u;
      };
      vLs = function (s, i) {
        return function (a, l) {
          i(a, l, s);
        };
      };
      wLs = function (s, i, a, l, c, u) {
        function d(C) {
          if (C !== undefined && typeof C !== "function") {
            throw TypeError("Function expected");
          }
          return C;
        }
        var p = l.kind;
        var m = p === "getter" ? "get" : p === "setter" ? "set" : "value";
        var f = !i && s ? l.static ? s : s.prototype : null;
        var h = i || (f ? Object.getOwnPropertyDescriptor(f, l.name) : {});
        var g;
        var y = false;
        for (var _ = a.length - 1; _ >= 0; _--) {
          var b = {};
          for (var S in l) {
            b[S] = S === "access" ? {} : l[S];
          }
          for (var S in l.access) {
            b.access[S] = l.access[S];
          }
          b.addInitializer = function (C) {
            if (y) {
              throw TypeError("Cannot add initializers after decoration has completed");
            }
            u.push(d(C || null));
          };
          var E = (0, a[_])(p === "accessor" ? {
            get: h.get,
            set: h.set
          } : h[m], b);
          if (p === "accessor") {
            if (E === undefined) {
              continue;
            }
            if (E === null || typeof E !== "object") {
              throw TypeError("Object expected");
            }
            if (g = d(E.get)) {
              h.get = g;
            }
            if (g = d(E.set)) {
              h.set = g;
            }
            if (g = d(E.init)) {
              c.unshift(g);
            }
          } else if (g = d(E)) {
            if (p === "field") {
              c.unshift(g);
            } else {
              h[m] = g;
            }
          }
        }
        if (f) {
          Object.defineProperty(f, l.name, h);
        }
        y = true;
      };
      CLs = function (s, i, a) {
        var l = arguments.length > 2;
        for (var c = 0; c < i.length; c++) {
          a = l ? i[c].call(s, a) : i[c].call(s);
        }
        return l ? a : undefined;
      };
      RLs = function (s) {
        return typeof s === "symbol" ? s : "".concat(s);
      };
      xLs = function (s, i, a) {
        if (typeof i === "symbol") {
          i = i.description ? "[".concat(i.description, "]") : "";
        }
        return Object.defineProperty(s, "name", {
          configurable: true,
          value: a ? "".concat(a, " ", i) : i
        });
      };
      kLs = function (s, i) {
        if (typeof Reflect === "object" && typeof Reflect.metadata === "function") {
          return Reflect.metadata(s, i);
        }
      };
      ALs = function (s, i, a, l) {
        function c(u) {
          return u instanceof a ? u : new a(function (d) {
            d(u);
          });
        }
        return new (a || (a = Promise))(function (u, d) {
          function p(h) {
            try {
              f(l.next(h));
            } catch (g) {
              d(g);
            }
          }
          function m(h) {
            try {
              f(l.throw(h));
            } catch (g) {
              d(g);
            }
          }
          function f(h) {
            h.done ? u(h.value) : c(h.value).then(p, m);
          }
          f((l = l.apply(s, i || [])).next());
        });
      };
      ILs = function (s, i) {
        var a = {
          label: 0,
          sent: function () {
            if (u[0] & 1) {
              throw u[1];
            }
            return u[1];
          },
          trys: [],
          ops: []
        };
        var l;
        var c;
        var u;
        var d = Object.create((typeof Iterator === "function" ? Iterator : Object).prototype);
        d.next = p(0);
        d.throw = p(1);
        d.return = p(2);
        typeof Symbol === "function" && (d[Symbol.iterator] = function () {
          return this;
        });
        return d;
        function p(f) {
          return function (h) {
            return m([f, h]);
          };
        }
        function m(f) {
          if (l) {
            throw TypeError("Generator is already executing.");
          }
          while (d && (d = 0, f[0] && (a = 0)), a) {
            try {
              if (l = 1, c && (u = f[0] & 2 ? c.return : f[0] ? c.throw || ((u = c.return) && u.call(c), 0) : c.next) && !(u = u.call(c, f[1])).done) {
                return u;
              }
              if (c = 0, u) {
                f = [f[0] & 2, u.value];
              }
              switch (f[0]) {
                case 0:
                case 1:
                  u = f;
                  break;
                case 4:
                  a.label++;
                  return {
                    value: f[1],
                    done: false
                  };
                case 5:
                  a.label++;
                  c = f[1];
                  f = [0];
                  continue;
                case 7:
                  f = a.ops.pop();
                  a.trys.pop();
                  continue;
                default:
                  if ((u = a.trys, !(u = u.length > 0 && u[u.length - 1])) && (f[0] === 6 || f[0] === 2)) {
                    a = 0;
                    continue;
                  }
                  if (f[0] === 3 && (!u || f[1] > u[0] && f[1] < u[3])) {
                    a.label = f[1];
                    break;
                  }
                  if (f[0] === 6 && a.label < u[1]) {
                    a.label = u[1];
                    u = f;
                    break;
                  }
                  if (u && a.label < u[2]) {
                    a.label = u[2];
                    a.ops.push(f);
                    break;
                  }
                  if (u[2]) {
                    a.ops.pop();
                  }
                  a.trys.pop();
                  continue;
              }
              f = i.call(s, a);
            } catch (h) {
              f = [6, h];
              c = 0;
            } finally {
              l = u = 0;
            }
          }
          if (f[0] & 5) {
            throw f[1];
          }
          return {
            value: f[0] ? f[1] : undefined,
            done: true
          };
        }
      };
      PLs = function (s, i) {
        for (var a in s) {
          if (a !== "default" && !Object.prototype.hasOwnProperty.call(i, a)) {
            F_n(i, s, a);
          }
        }
      };
      F_n = Object.create ? function (s, i, a, l) {
        if (l === undefined) {
          l = a;
        }
        var c = Object.getOwnPropertyDescriptor(i, a);
        if (!c || ("get" in c ? !i.__esModule : c.writable || c.configurable)) {
          c = {
            enumerable: true,
            get: function () {
              return i[a];
            }
          };
        }
        Object.defineProperty(s, l, c);
      } : function (s, i, a, l) {
        if (l === undefined) {
          l = a;
        }
        s[l] = i[a];
      };
      L_n = function (s) {
        var i = typeof Symbol === "function" && Symbol.iterator;
        var a = i && s[i];
        var l = 0;
        if (a) {
          return a.call(s);
        }
        if (s && typeof s.length === "number") {
          return {
            next: function () {
              if (s && l >= s.length) {
                s = undefined;
              }
              return {
                value: s && s[l++],
                done: !s
              };
            }
          };
        }
        throw TypeError(i ? "Object is not iterable." : "Symbol.iterator is not defined.");
      };
      RFr = function (s, i) {
        var a = typeof Symbol === "function" && s[Symbol.iterator];
        if (!a) {
          return s;
        }
        var l = a.call(s);
        var c;
        var u = [];
        var d;
        try {
          while ((i === undefined || i-- > 0) && !(c = l.next()).done) {
            u.push(c.value);
          }
        } catch (p) {
          d = {
            error: p
          };
        } finally {
          try {
            if (c && !c.done && (a = l.return)) {
              a.call(l);
            }
          } finally {
            if (d) {
              throw d.error;
            }
          }
        }
        return u;
      };
      OLs = function () {
        for (var s = [], i = 0; i < arguments.length; i++) {
          s = s.concat(RFr(arguments[i]));
        }
        return s;
      };
      DLs = function () {
        for (var s = 0, i = 0, a = arguments.length; i < a; i++) {
          s += arguments[i].length;
        }
        for (var l = Array(s), c = 0, i = 0; i < a; i++) {
          for (var u = arguments[i], d = 0, p = u.length; d < p; d++, c++) {
            l[c] = u[d];
          }
        }
        return l;
      };
      MLs = function (s, i, a) {
        if (a || arguments.length === 2) {
          for (var l = 0, c = i.length, u; l < c; l++) {
            if (u || !(l in i)) {
              if (!u) {
                u = Array.prototype.slice.call(i, 0, l);
              }
              u[l] = i[l];
            }
          }
        }
        return s.concat(u || Array.prototype.slice.call(i));
      };
      rrt = function (s) {
        return this instanceof rrt ? (this.v = s, this) : new rrt(s);
      };
      NLs = function (s, i, a) {
        if (!Symbol.asyncIterator) {
          throw TypeError("Symbol.asyncIterator is not defined.");
        }
        var l = a.apply(s, i || []);
        var c;
        var u = [];
        c = Object.create((typeof AsyncIterator === "function" ? AsyncIterator : Object).prototype);
        p("next");
        p("throw");
        p("return", d);
        c[Symbol.asyncIterator] = function () {
          return this;
        };
        return c;
        function d(_) {
          return function (b) {
            return Promise.resolve(b).then(_, g);
          };
        }
        function p(_, b) {
          if (l[_]) {
            if (c[_] = function (S) {
              return new Promise(function (E, C) {
                u.push([_, S, E, C]) > 1 || m(_, S);
              });
            }, b) {
              c[_] = b(c[_]);
            }
          }
        }
        function m(_, b) {
          try {
            f(l[_](b));
          } catch (S) {
            y(u[0][3], S);
          }
        }
        function f(_) {
          _.value instanceof rrt ? Promise.resolve(_.value.v).then(h, g) : y(u[0][2], _);
        }
        function h(_) {
          m("next", _);
        }
        function g(_) {
          m("throw", _);
        }
        function y(_, b) {
          if (_(b), u.shift(), u.length) {
            m(u[0][0], u[0][1]);
          }
        }
      };
      LLs = function (s) {
        var i;
        var a;
        i = {};
        l("next");
        l("throw", function (c) {
          throw c;
        });
        l("return");
        i[Symbol.iterator] = function () {
          return this;
        };
        return i;
        function l(c, u) {
          i[c] = s[c] ? function (d) {
            return (a = !a) ? {
              value: rrt(s[c](d)),
              done: false
            } : u ? u(d) : d;
          } : u;
        }
      };
      FLs = function (s) {
        if (!Symbol.asyncIterator) {
          throw TypeError("Symbol.asyncIterator is not defined.");
        }
        var i = s[Symbol.asyncIterator];
        var a;
        return i ? i.call(s) : (s = typeof L_n === "function" ? L_n(s) : s[Symbol.iterator](), a = {}, l("next"), l("throw"), l("return"), a[Symbol.asyncIterator] = function () {
          return this;
        }, a);
        function l(u) {
          a[u] = s[u] && function (d) {
            return new Promise(function (p, m) {
              d = s[u](d);
              c(p, m, d.done, d.value);
            });
          };
        }
        function c(u, d, p, m) {
          Promise.resolve(m).then(function (f) {
            u({
              value: f,
              done: p
            });
          }, d);
        }
      };
      ULs = function (s, i) {
        if (Object.defineProperty) {
          Object.defineProperty(s, "raw", {
            value: i
          });
        } else {
          s.raw = i;
        }
        return s;
      };
      var n = Object.create ? function (s, i) {
        Object.defineProperty(s, "default", {
          enumerable: true,
          value: i
        });
      } : function (s, i) {
        s.default = i;
      };
      var r = function (s) {
        r = Object.getOwnPropertyNames || function (i) {
          var a = [];
          for (var l in i) {
            if (Object.prototype.hasOwnProperty.call(i, l)) {
              a[a.length] = l;
            }
          }
          return a;
        };
        return r(s);
      };
      BLs = function (s) {
        if (s && s.__esModule) {
          return s;
        }
        var i = {};
        if (s != null) {
          for (var a = r(s), l = 0; l < a.length; l++) {
            if (a[l] !== "default") {
              F_n(i, s, a[l]);
            }
          }
        }
        n(i, s);
        return i;
      };
      $Ls = function (s) {
        return s && s.__esModule ? s : {
          default: s
        };
      };
      HLs = function (s, i, a, l) {
        if (a === "a" && !l) {
          throw TypeError("Private accessor was defined without a getter");
        }
        if (typeof i === "function" ? s !== i || !l : !i.vZc(s)) {
          throw TypeError("Cannot read private member from an object whose class did not declare it");
        }
        return a === "m" ? l : a === "a" ? l.call(s) : l ? l.value : i.get(s);
      };
      jLs = function (s, i, a, l, c) {
        if (l === "m") {
          throw TypeError("Private method is not writable");
        }
        if (l === "a" && !c) {
          throw TypeError("Private accessor was defined without a setter");
        }
        if (typeof i === "function" ? s !== i || !c : !i.vZc(s)) {
          throw TypeError("Cannot write private member to an object whose class did not declare it");
        }
        l === "a" ? c.call(s, a) : c ? c.value = a : i.set(s, a);
        return a;
      };
      qLs = function (s, i) {
        if (i === null || typeof i !== "object" && typeof i !== "function") {
          throw TypeError("Cannot use 'in' operator on non-object");
        }
        return typeof s === "function" ? i === s : s.vZc(i);
      };
      WLs = function (s, i, a) {
        if (i !== null && i !== undefined) {
          if (typeof i !== "object" && typeof i !== "function") {
            throw TypeError("Object expected.");
          }
          var l;
          var c;
          if (a) {
            if (!Symbol.asyncDispose) {
              throw TypeError("Symbol.asyncDispose is not defined.");
            }
            l = i[Symbol.asyncDispose];
          }
          if (l === undefined) {
            if (!Symbol.dispose) {
              throw TypeError("Symbol.dispose is not defined.");
            }
            if (l = i[Symbol.dispose], a) {
              c = l;
            }
          }
          if (typeof l !== "function") {
            throw TypeError("Object not disposable.");
          }
          if (c) {
            l = function () {
              try {
                c.call(this);
              } catch (u) {
                return Promise.reject(u);
              }
            };
          }
          s.stack.push({
            value: i,
            dispose: l,
            async: a
          });
        } else if (a) {
          s.stack.push({
            async: true
          });
        }
        return i;
      };
      var o = typeof SuppressedError === "function" ? SuppressedError : function (s, i, a) {
        var l = Error(a);
        l.name = "SuppressedError";
        l.error = s;
        l.suppressed = i;
        return l;
      };
      GLs = function (s) {
        function i(u) {
          s.error = s.hasError ? new o(u, s.error, "An error was suppressed during disposal.") : u;
          s.hasError = true;
        }
        var a;
        var l = 0;
        function c() {
          while (a = s.stack.pop()) {
            try {
              if (!a.async && l === 1) {
                l = 0;
                s.stack.push(a);
                return Promise.resolve().then(c);
              }
              if (a.dispose) {
                var u = a.dispose.call(a.value);
                if (a.async) {
                  l |= 2;
                  return Promise.resolve(u).then(c, function (d) {
                    i(d);
                    return c();
                  });
                }
              } else {
                l |= 1;
              }
            } catch (d) {
              i(d);
            }
          }
          if (l === 1) {
            return s.hasError ? Promise.reject(s.error) : Promise.resolve();
          }
          if (s.hasError) {
            throw s.error;
          }
        }
        return c();
      };
      VLs = function (s, i) {
        if (typeof s === "string" && /^\.\.?\//.test(s)) {
          return s.replace(/\.(tsx)$|((?:\.d)?)((?:\.[^./]+?)?)\.([cm]?)ts$/i, function (a, l, c, u, d) {
            return l ? i ? ".jsx" : ".js" : c && (!u || !d) ? a : c + u + "." + d.toLowerCase() + "js";
          });
        }
        return s;
      };
      e("__extends", bLs);
      e("__assign", SLs);
      e("__rest", TLs);
      e("__decorate", ELs);
      e("__param", vLs);
      e("__esDecorate", wLs);
      e("__runInitializers", CLs);
      e("__propKey", RLs);
      e("__setFunctionName", xLs);
      e("__metadata", kLs);
      e("__awaiter", ALs);
      e("__generator", ILs);
      e("__exportStar", PLs);
      e("__createBinding", F_n);
      e("__values", L_n);
      e("__read", RFr);
      e("__spread", OLs);
      e("__spreadArrays", DLs);
      e("__spreadArray", MLs);
      e("__await", rrt);
      e("__asyncGenerator", NLs);
      e("__asyncDelegator", LLs);
      e("__asyncValues", FLs);
      e("__makeTemplateObject", ULs);
      e("__importStar", BLs);
      e("__importDefault", $Ls);
      e("__classPrivateFieldGet", HLs);
      e("__classPrivateFieldSet", jLs);
      e("__classPrivateFieldIn", qLs);
      e("__addDisposableResource", WLs);
      e("__disposeResources", GLs);
      e("__rewriteRelativeImportExtension", VLs);
    });