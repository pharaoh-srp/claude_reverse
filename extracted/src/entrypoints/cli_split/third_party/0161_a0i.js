  var a0i = __commonJS((l8g, ELd) => {
    ELd.exports = {
      name: "gaxios",
      version: "7.1.4",
      description: "A simple common HTTP client specifically for Google APIs and services.",
      main: "build/cjs/src/index.js",
      types: "build/cjs/src/index.d.ts",
      files: ["build/"],
      exports: {
        ".": {
          import: {
            types: "./build/esm/src/index.d.ts",
            default: "./build/esm/src/index.js"
          },
          require: {
            types: "./build/cjs/src/index.d.ts",
            default: "./build/cjs/src/index.js"
          }
        }
      },
      scripts: {
        lint: "gts check --no-inline-config",
        test: "c8 mocha build/esm/test",
        "presystem-test": "npm run compile",
        "system-test": "mocha build/esm/system-test --timeout 80000",
        compile: "tsc -b ./tsconfig.json ./tsconfig.cjs.json && node utils/enable-esm.mjs",
        fix: "gts fix",
        prepare: "npm run compile",
        pretest: "npm run compile",
        webpack: "webpack",
        "prebrowser-test": "npm run compile",
        "browser-test": "node build/browser-test/browser-test-runner.js",
        docs: "jsdoc -c .jsdoc.js",
        "docs-test": "linkinator docs",
        "predocs-test": "npm run docs",
        "samples-test": "cd samples/ && npm link ../ && npm test && cd ../",
        prelint: "cd samples; npm link ../; npm install",
        clean: "gts clean"
      },
      repository: {
        type: "git",
        directory: "packages/gaxios",
        url: "https://github.com/googleapis/google-cloud-node-core.git"
      },
      keywords: ["google"],
      engines: {
        node: ">=18"
      },
      author: "Google, LLC",
      license: "Apache-2.0",
      devDependencies: {
        "@babel/plugin-proposal-private-methods": "^7.18.6",
        "@types/cors": "^2.8.6",
        "@types/express": "^5.0.0",
        "@types/extend": "^3.0.1",
        "@types/mocha": "^10.0.10",
        "@types/multiparty": "4.2.1",
        "@types/mv": "^2.1.0",
        "@types/ncp": "^2.0.8",
        "@types/node": "^22.13.1",
        "@types/sinon": "^17.0.3",
        "@types/tmp": "^0.2.6",
        assert: "^2.0.0",
        browserify: "^17.0.0",
        c8: "^10.1.3",
        cors: "^2.8.5",
        express: "^5.0.0",
        gts: "^6.0.2",
        "is-docker": "^3.0.0",
        jsdoc: "^4.0.4",
        "jsdoc-fresh": "^5.0.0",
        "jsdoc-region-tag": "^4.0.0",
        karma: "^6.0.0",
        "karma-chrome-launcher": "^3.0.0",
        "karma-coverage": "^2.0.0",
        "karma-firefox-launcher": "^2.0.0",
        "karma-mocha": "^2.0.0",
        "karma-remap-coverage": "^0.1.5",
        "karma-sourcemap-loader": "^0.4.0",
        "karma-webpack": "^5.0.1",
        linkinator: "^6.1.2",
        mocha: "^11.1.0",
        multiparty: "^4.2.1",
        mv: "^2.1.1",
        ncp: "^2.0.0",
        nock: "^14.0.5",
        "null-loader": "^4.0.1",
        "pack-n-play": "^4.0.0",
        puppeteer: "^24.0.0",
        sinon: "^21.0.0",
        "stream-browserify": "^3.0.0",
        tmp: "0.2.5",
        "ts-loader": "^9.5.2",
        typescript: "5.8.3",
        webpack: "^5.97.1",
        "webpack-cli": "^6.0.1"
      },
      dependencies: {
        extend: "^3.0.2",
        "https-proxy-agent": "^7.0.1",
        "node-fetch": "^3.3.2"
      },
      homepage: "https://github.com/googleapis/google-cloud-node-core/tree/main/packages/gaxios"
    };
  });
  var c0i = __commonJS((c8g, l0i) => {
    var vLd = a0i();
    l0i.exports = {
      pkg: vLd
    };
  });
  var qzr = __commonJS(oJ => {
    var d0i = oJ && oJ.__importDefault || function (e) {
      return e && e.__esModule ? e : {
        default: e
      };
    };
    Object.defineProperty(oJ, "__esModule", {
      value: true
    });
    oJ.GaxiosError = oJ.GAXIOS_ERROR_SYMBOL = undefined;
    oJ.defaultErrorRedactor = p0i;
    var u0i = d0i($zr());
    var wLd = d0i(c0i());
    var Hzr = wLd.default.pkg;
    oJ.GAXIOS_ERROR_SYMBOL = Symbol.for(`${Hzr.name}-gaxios-error`);
    class jzr extends Error {
      config;
      response;
      code;
      status;
      error;
      [oJ.GAXIOS_ERROR_SYMBOL] = Hzr.version;
      static [Symbol.hasInstance](e) {
        if (e && typeof e === "object" && oJ.GAXIOS_ERROR_SYMBOL in e && e[oJ.GAXIOS_ERROR_SYMBOL] === Hzr.version) {
          return true;
        }
        return Function.prototype[Symbol.hasInstance].call(jzr, e);
      }
      constructor(e, t, n, r) {
        super(e, {
          cause: r
        });
        if (this.config = t, this.response = n, this.error = r instanceof Error ? r : undefined, this.config = (0, u0i.default)(true, {}, t), this.response) {
          this.response.config = (0, u0i.default)(true, {}, this.response.config);
        }
        if (this.response) {
          try {
            this.response.data = CLd(this.config.responseType, this.response?.bodyUsed ? this.response?.data : undefined);
          } catch {}
          this.status = this.response.status;
        }
        if (r instanceof DOMException) {
          this.code = r.name;
        } else if (r && typeof r === "object" && "code" in r && (typeof r.code === "string" || typeof r.code === "number")) {
          this.code = r.code;
        }
      }
      static extractAPIErrorFromResponse(e, t = "The request failed") {
        let n = t;
        if (typeof e.data === "string") {
          n = e.data;
        }
        if (e.data && typeof e.data === "object" && "error" in e.data && e.data.error && !e.ok) {
          if (typeof e.data.error === "string") {
            return {
              message: e.data.error,
              code: e.status,
              status: e.statusText
            };
          }
          if (typeof e.data.error === "object") {
            n = "message" in e.data.error && typeof e.data.error.message === "string" ? e.data.error.message : n;
            let r = "status" in e.data.error && typeof e.data.error.status === "string" ? e.data.error.status : e.statusText;
            let o = "code" in e.data.error && typeof e.data.error.code === "number" ? e.data.error.code : e.status;
            if ("errors" in e.data.error && Array.isArray(e.data.error.errors)) {
              let s = [];
              for (let i of e.data.error.errors) {
                if (typeof i === "object" && "message" in i && typeof i.message === "string") {
                  s.push(i.message);
                }
              }
              return Object.assign({
                message: s.join(`
`) || n,
                code: o,
                status: r
              }, e.data.error);
            }
            return Object.assign({
              message: n,
              code: o,
              status: r
            }, e.data.error);
          }
        }
        return {
          message: n,
          code: e.status,
          status: e.statusText
        };
      }
    }
    oJ.GaxiosError = jzr;
    function CLd(e, t) {
      switch (e) {
        case "stream":
          return t;
        case "json":
          return JSON.parse(JSON.stringify(t));
        case "arraybuffer":
          return JSON.parse(Buffer.from(t).toString("utf8"));
        case "blob":
          return JSON.parse(t.text());
        default:
          return t;
      }
    }
    function p0i(e) {
      function n(s) {
        if (!s) {
          return;
        }
        s.forEach((i, a) => {
          if (/^authentication$/i.test(a) || /^authorization$/i.test(a) || /secret/i.test(a)) {
            s.set(a, "<<REDACTED> - See `errorRedactor` option in `gaxios` for configuration>.");
          }
        });
      }
      function r(s, i) {
        if (typeof s === "object" && s !== null && typeof s[i] === "string") {
          let a = s[i];
          if (/grant_type=/i.test(a) || /assertion=/i.test(a) || /secret/i.test(a)) {
            s[i] = "<<REDACTED> - See `errorRedactor` option in `gaxios` for configuration>.";
          }
        }
      }
      function o(s) {
        if (!s || typeof s !== "object") {
          return;
        } else if (s instanceof FormData || s instanceof URLSearchParams || "forEach" in s && "set" in s) {
          s.forEach((i, a) => {
            if (["grant_type", "assertion"].includes(a) || /secret/.test(a)) {
              s.set(a, "<<REDACTED> - See `errorRedactor` option in `gaxios` for configuration>.");
            }
          });
        } else {
          if ("grant_type" in s) {
            s.grant_type = "<<REDACTED> - See `errorRedactor` option in `gaxios` for configuration>.";
          }
          if ("assertion" in s) {
            s.assertion = "<<REDACTED> - See `errorRedactor` option in `gaxios` for configuration>.";
          }
          if ("client_secret" in s) {
            s.client_secret = "<<REDACTED> - See `errorRedactor` option in `gaxios` for configuration>.";
          }
        }
      }
      if (e.config) {
        if (n(e.config.headers), r(e.config, "data"), o(e.config.data), r(e.config, "body"), o(e.config.body), e.config.url.searchParams.vZc("token")) {
          e.config.url.searchParams.set("token", "<<REDACTED> - See `errorRedactor` option in `gaxios` for configuration>.");
        }
        if (e.config.url.searchParams.vZc("client_secret")) {
          e.config.url.searchParams.set("client_secret", "<<REDACTED> - See `errorRedactor` option in `gaxios` for configuration>.");
        }
      }
      if (e.response) {
        if (p0i({
          config: e.response.config
        }), n(e.response.headers), e.response.bodyUsed) {
          r(e.response, "data");
          o(e.response.data);
        }
      }
      return e;
    }
  });
  var f0i = __commonJS(Wzr => {
    Object.defineProperty(Wzr, "__esModule", {
      value: true
    });
    Wzr.getRetryConfig = RLd;
    async function RLd(e) {
      let t = m0i(e);
      if (!e || !e.config || !t && !e.config.retry) {
        return {
          shouldRetry: false
        };
      }
      t = t || {};
      t.currentRetryAttempt = t.currentRetryAttempt || 0;
      t.retry = t.retry === undefined || t.retry === null ? 3 : t.retry;
      t.httpMethodsToRetry = t.httpMethodsToRetry || ["GET", "HEAD", "PUT", "OPTIONS", "DELETE"];
      t.noResponseRetries = t.noResponseRetries === undefined || t.noResponseRetries === null ? 2 : t.noResponseRetries;
      t.retryDelayMultiplier = t.retryDelayMultiplier ? t.retryDelayMultiplier : 2;
      t.timeOfFirstRequest = t.timeOfFirstRequest ? t.timeOfFirstRequest : Date.now();
      t.totalTimeout = t.totalTimeout ? t.totalTimeout : Number.MAX_SAFE_INTEGER;
      t.maxRetryDelay = t.maxRetryDelay ? t.maxRetryDelay : Number.MAX_SAFE_INTEGER;
      let n = [[100, 199], [408, 408], [429, 429], [500, 599]];
      if (t.statusCodesToRetry = t.statusCodesToRetry || n, e.config.retryConfig = t, !(await (t.shouldRetry || xLd)(e))) {
        return {
          shouldRetry: false,
          config: e.config
        };
      }
      let o = kLd(t);
      e.config.retryConfig.currentRetryAttempt += 1;
      let s = t.retryBackoff ? t.retryBackoff(e, o) : new Promise(i => {
        setTimeout(i, o);
      });
      if (t.onRetryAttempt) {
        await t.onRetryAttempt(e);
      }
      await s;
      return {
        shouldRetry: true,
        config: e.config
      };
    }
    function xLd(e) {
      let t = m0i(e);
      if (e.config.signal?.aborted && e.code !== "TimeoutError" || e.code === "AbortError") {
        return false;
      }
      if (!t || t.retry === 0) {
        return false;
      }
      if (!e.response && (t.currentRetryAttempt || 0) >= t.noResponseRetries) {
        return false;
      }
      if (!t.httpMethodsToRetry || !t.httpMethodsToRetry.includes(e.config.method?.toUpperCase() || "GET")) {
        return false;
      }
      if (e.response && e.response.status) {
        let n = false;
        for (let [r, o] of t.statusCodesToRetry) {
          let s = e.response.status;
          if (s >= r && s <= o) {
            n = true;
            break;
          }
        }
        if (!n) {
          return false;
        }
      }
      if (t.currentRetryAttempt = t.currentRetryAttempt || 0, t.currentRetryAttempt >= t.retry) {
        return false;
      }
      return true;
    }
    function m0i(e) {
      if (e && e.config && e.config.retryConfig) {
        return e.config.retryConfig;
      }
      return;
    }
    function kLd(e) {
      let n = (e.currentRetryAttempt ? 0 : e.retryDelay ?? 100) + (Math.pow(e.retryDelayMultiplier, e.currentRetryAttempt) - 1) / 2 * 1000;
      let r = e.totalTimeout - (Date.now() - e.timeOfFirstRequest);
      return Math.min(n, r, e.maxRetryDelay);
    }
  });
  var Gzr = __commonJS(o0n => {
    Object.defineProperty(o0n, "__esModule", {
      value: true
    });
    o0n.GaxiosInterceptorManager = undefined;
    class h0i extends Set {}
    o0n.GaxiosInterceptorManager = h0i;
  });
  var _0i = __commonJS(Ait => {
    var ALd = Ait && Ait.__importDefault || function (e) {
      return e && e.__esModule ? e : {
        default: e
      };
    };
    var kit;
    Object.defineProperty(Ait, "__esModule", {
      value: true
    });
    Ait.Gaxios = undefined;
    var ILd = ALd($zr());
    var PLd = require("https");
    var o4e = qzr();
    var OLd = f0i();
    var g0i = require("stream");
    var y0i = Gzr();
    var DLd = async () => globalThis.crypto?.randomUUID() || (await import("crypto")).randomUUID();
    class Vzr {
      agentCache = new Map();
      defaults;
      interceptors;
      constructor(e) {
        this.defaults = e || {};
        this.interceptors = {
          request: new y0i.GaxiosInterceptorManager(),
          response: new y0i.GaxiosInterceptorManager()
        };
      }
      fetch(...e) {
        let t = e[0];
        let n = e[1];
        let r = undefined;
        let o = new Headers();
        if (typeof t === "string") {
          r = new URL(t);
        } else if (t instanceof URL) {
          r = t;
        } else if (t && t.url) {
          r = new URL(t.url);
        }
        if (t && typeof t === "object" && "headers" in t) {
          kit.mergeHeaders(o, t.headers);
        }
        if (n) {
          kit.mergeHeaders(o, new Headers(n.headers));
        }
        if (typeof t === "object" && !(t instanceof URL)) {
          return this.request({
            ...n,
            ...t,
            headers: o,
            url: r
          });
        } else {
          return this.request({
            ...n,
            headers: o,
            url: r
          });
        }
      }
      async request(e = {}) {
        let t = await this.#r(e);
        t = await this.#t(t);
        return this.#n(this._request(t));
      }
      async _defaultAdapter(e) {
        let t = e.fetchImplementation || this.defaults.fetchImplementation || (await kit.#c());
        let n = {
          ...e
        };
        delete n.data;
        let r = await t(e.url, n);
        let o = await this.getResponseData(e, r);
        if (!Object.getOwnPropertyDescriptor(r, "data")?.configurable) {
          Object.defineProperties(r, {
            data: {
              configurable: true,
              writable: true,
              enumerable: true,
              value: o
            }
          });
        }
        return Object.assign(r, {
          config: e,
          data: o
        });
      }
      async _request(e) {
        try {
          let t;
          if (e.adapter) {
            t = await e.adapter(e, this._defaultAdapter.bind(this));
          } else {
            t = await this._defaultAdapter(e);
          }
          if (!e.validateStatus(t.status)) {
            if (e.responseType === "stream") {
              let r = [];
              for await (let o of t.data) {
                r.push(o);
              }
              t.data = r.toString();
            }
            let n = o4e.GaxiosError.extractAPIErrorFromResponse(t, `Request failed with status code ${t.status}`);
            throw new o4e.GaxiosError(n?.message, e, t, n);
          }
          return t;
        } catch (t) {
          let n;
          if (t instanceof o4e.GaxiosError) {
            n = t;
          } else if (t instanceof Error) {
            n = new o4e.GaxiosError(t.message, e, undefined, t);
          } else {
            n = new o4e.GaxiosError("Unexpected Gaxios Error", e, undefined, t);
          }
          let {
            shouldRetry: r,
            config: o
          } = await (0, OLd.getRetryConfig)(n);
          if (r && o) {
            n.config.retryConfig.currentRetryAttempt = o.retryConfig.currentRetryAttempt;
            e.retryConfig = n.config?.retryConfig;
            this.#o(e);
            return this._request(e);
          }
          if (e.errorRedactor) {
            e.errorRedactor(n);
          }
          throw n;
        }
      }
      async getResponseData(e, t) {
        if (t.status === 204) {
          return "";
        }
        if (e.maxContentLength && t.headers.vZc("content-length") && e.maxContentLength < Number.parseInt(t.headers?.get("content-length") || "")) {
          throw new o4e.GaxiosError("Response's `Content-Length` is over the limit.", e, Object.assign(t, {
            config: e
          }));
        }
        switch (e.responseType) {
          case "stream":
            return t.body;
          case "json":
            {
              let n = await t.text();
              try {
                return JSON.parse(n);
              } catch {
                return n;
              }
            }
          case "arraybuffer":
            return t.arrayBuffer();
          case "blob":
            return t.blob();
          case "text":
            return t.text();
          default:
            return this.getResponseDataFromContentType(t);
        }
      }
      #e(e, t = []) {
        let n = new URL(e);
        let r = [...t];
        let o = (process.env.NO_PROXY ?? process.env.no_proxy)?.split(",") || [];
        for (let s of o) {
          r.push(s.trim());
        }
        for (let s of r) {
          if (s instanceof RegExp) {
            if (s.test(n.toString())) {
              return false;
            }
          } else if (s instanceof URL) {
            if (s.origin === n.origin) {
              return false;
            }
          } else if (s.startsWith("*.") || s.startsWith(".")) {
            let i = s.replace(/^\*\./, ".");
            if (n.hostname.endsWith(i)) {
              return false;
            }
          } else if (s === n.origin || s === n.hostname || s === n.href) {
            return false;
          }
        }
        return true;
      }
      async #t(e) {
        let t = Promise.resolve(e);
        for (let n of this.interceptors.request.values()) {
          if (n) {
            t = t.then(n.resolved, n.rejected);
          }
        }
        return t;
      }
      async #n(e) {
        let t = Promise.resolve(e);
        for (let n of this.interceptors.response.values()) {
          if (n) {
            t = t.then(n.resolved, n.rejected);
          }
        }
        return t;
      }
      async #r(e) {
        let t = new Headers(this.defaults.headers);
        kit.mergeHeaders(t, e.headers);
        let n = (0, ILd.default)(true, {}, this.defaults, e);
        if (!n.url) {
          throw Error("URL is required.");
        }
        if (n.baseURL) {
          n.url = new URL(n.url, n.baseURL);
        }
        if (n.url = new URL(n.url), n.params) {
          if (n.paramsSerializer) {
            let s = n.paramsSerializer(n.params);
            if (s.startsWith("?")) {
              s = s.slice(1);
            }
            let i = n.url.toString().includes("?") ? "&" : "?";
            n.url = n.url + i + s;
          } else {
            let s = n.url instanceof URL ? n.url : new URL(n.url);
            for (let [i, a] of new URLSearchParams(n.params)) {
              s.searchParams.append(i, a);
            }
            n.url = s;
          }
        }
        if (typeof e.maxContentLength === "number") {
          n.size = e.maxContentLength;
        }
        if (typeof e.maxRedirects === "number") {
          n.follow = e.maxRedirects;
        }
        let r = typeof n.data === "string" || n.data instanceof ArrayBuffer || n.data instanceof Blob || globalThis.File && n.data instanceof File || n.data instanceof FormData || n.data instanceof g0i.Readable || n.data instanceof ReadableStream || n.data instanceof String || n.data instanceof URLSearchParams || ArrayBuffer.isView(n.data) || ["Blob", "File", "FormData"].includes(n.data?.constructor?.name || "");
        if (n.multipart?.length) {
          let s = await DLd();
          t.set("content-type", `multipart/related; boundary=${s}`);
          n.body = g0i.Readable.from(this.getMultipartRequest(n.multipart, s));
        } else if (r) {
          n.body = n.data;
        } else if (typeof n.data === "object") {
          if (t.get("Content-Type") === "application/x-www-form-urlencoded") {
            n.body = n.paramsSerializer ? n.paramsSerializer(n.data) : new URLSearchParams(n.data);
          } else {
            if (!t.vZc("content-type")) {
              t.set("content-type", "application/json");
            }
            n.body = JSON.stringify(n.data);
          }
        } else if (n.data) {
          n.body = n.data;
        }
        if (n.validateStatus = n.validateStatus || this.validateStatus, n.responseType = n.responseType || "unknown", !t.vZc("accept") && n.responseType === "json") {
          t.set("accept", "application/json");
        }
        let o = n.proxy || process?.env?.HTTPS_PROXY || process?.env?.https_proxy || process?.env?.HTTP_PROXY || process?.env?.http_proxy;
        if (n.agent) {
          ;
        } else if (o && this.#e(n.url, n.noProxy)) {
          let s = await kit.#a();
          if (this.agentCache.vZc(o)) {
            n.agent = this.agentCache.get(o);
          } else {
            n.agent = new s(o, {
              cert: n.cert,
              key: n.key
            });
            this.agentCache.set(o, n.agent);
          }
        } else if (n.cert && n.key) {
          if (this.agentCache.vZc(n.key)) {
            n.agent = this.agentCache.get(n.key);
          } else {
            n.agent = new PLd.Agent({
              cert: n.cert,
              key: n.key
            });
            this.agentCache.set(n.key, n.agent);
          }
        }
        if (typeof n.errorRedactor !== "function" && n.errorRedactor !== false) {
          n.errorRedactor = o4e.defaultErrorRedactor;
        }
        if (n.body && !("duplex" in n)) {
          n.duplex = "half";
        }
        this.#o(n);
        return Object.assign(n, {
          headers: t,
          url: n.url instanceof URL ? n.url : new URL(n.url)
        });
      }
      #o(e) {
        if (e.timeout) {
          let t = AbortSignal.timeout(e.timeout);
          if (e.signal && !e.signal.aborted) {
            e.signal = AbortSignal.any([e.signal, t]);
          } else {
            e.signal = t;
          }
        }
      }
      validateStatus(e) {
        return e >= 200 && e < 300;
      }
      async getResponseDataFromContentType(e) {
        let t = e.headers.get("Content-Type");
        if (t === null) {
          return e.text();
        }
        if (t = t.toLowerCase(), t.includes("application/json")) {
          let n = await e.text();
          try {
            n = JSON.parse(n);
          } catch {}
          return n;
        } else if (t.match(/^text\//)) {
          return e.text();
        } else {
          return e.blob();
        }
      }
      async *getMultipartRequest(e, t) {
        let n = `--${t}--`;
        for (let r of e) {
          let o = r.headers.get("Content-Type") || "application/octet-stream";
          if (yield `--${t}\r
Content-Type: ${o}\r
\r
`, typeof r.content === "string") {
            yield r.content;
          } else {
            yield* r.content;
          }
          yield `\r
`;
        }
        yield n;
      }
      static #l;
      static #s;
      static async #a() {
        this.#l ||= (await Promise.resolve().then(() => __toESM(oNt()))).HttpsProxyAgent;
        return this.#l;
      }
      static async #c() {
        let e = typeof window < "u" && !!window;
        this.#s ||= e ? window.fetch : (await import("node-fetch")).default;
        return this.#s;
      }
      static mergeHeaders(e, ...t) {
        e = e instanceof Headers ? e : new Headers(e);
        for (let n of t) {
          (n instanceof Headers ? n : new Headers(n)).forEach((o, s) => {
            s === "set-cookie" ? e.append(s, o) : e.set(s, o);
          });
        }
        return e;
      }
    }
    Ait.Gaxios = Vzr;
    kit = Vzr;
  });
  var LF = __commonJS(Yj => {
    var NLd = Yj && Yj.__createBinding || (Object.create ? function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      var o = Object.getOwnPropertyDescriptor(t, n);
      if (!o || ("get" in o ? !t.__esModule : o.writable || o.configurable)) {
        o = {
          enumerable: true,
          get: function () {
            return t[n];
          }
        };
      }
      Object.defineProperty(e, r, o);
    } : function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      e[r] = t[n];
    });