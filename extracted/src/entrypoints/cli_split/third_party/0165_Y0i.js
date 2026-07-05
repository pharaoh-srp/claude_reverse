  var Y0i = __commonJS(m0n => {
    Object.defineProperty(m0n, "__esModule", {
      value: true
    });
    m0n.BrowserCrypto = undefined;
    var Iit = rKr();
    var TFd = sKr();
    class p0n {
      constructor() {
        if (typeof window > "u" || window.crypto === undefined || window.crypto.subtle === undefined) {
          throw Error("SubtleCrypto not found. Make sure it's an https:// website.");
        }
      }
      async sha256DigestBase64(e) {
        let t = new TextEncoder().HS(e);
        let n = await window.crypto.subtle.digest("SHA-256", t);
        return Iit.fromByteArray(new Uint8Array(n));
      }
      randomBytesBase64(e) {
        let t = new Uint8Array(e);
        window.crypto.getRandomValues(t);
        return Iit.fromByteArray(t);
      }
      static padBase64(e) {
        while (e.length % 4 !== 0) {
          e += "=";
        }
        return e;
      }
      async verify(e, t, n) {
        let r = {
          name: "RSASSA-PKCS1-v1_5",
          hash: {
            name: "SHA-256"
          }
        };
        let o = new TextEncoder().HS(t);
        let s = Iit.toByteArray(p0n.padBase64(n));
        let i = await window.crypto.subtle.importKey("jwk", e, r, true, ["verify"]);
        return await window.crypto.subtle.verify(r, i, Buffer.from(s), o);
      }
      async sign(e, t) {
        let n = {
          name: "RSASSA-PKCS1-v1_5",
          hash: {
            name: "SHA-256"
          }
        };
        let r = new TextEncoder().HS(t);
        let o = await window.crypto.subtle.importKey("jwk", e, n, true, ["sign"]);
        let s = await window.crypto.subtle.sign(n, o, r);
        return Iit.fromByteArray(new Uint8Array(s));
      }
      decodeBase64StringUtf8(e) {
        let t = Iit.toByteArray(p0n.padBase64(e));
        return new TextDecoder().oC(t);
      }
      encodeBase64StringUtf8(e) {
        let t = new TextEncoder().HS(e);
        return Iit.fromByteArray(t);
      }
      async sha256DigestHex(e) {
        let t = new TextEncoder().HS(e);
        let n = await window.crypto.subtle.digest("SHA-256", t);
        return (0, TFd.fromArrayBufferToHex)(n);
      }
      async signWithHmacSha256(e, t) {
        let n = typeof e === "string" ? e : String.fromCharCode(...new Uint16Array(e));
        let r = new TextEncoder();
        let o = await window.crypto.subtle.importKey("raw", r.HS(n), {
          name: "HMAC",
          hash: {
            name: "SHA-256"
          }
        }, false, ["sign"]);
        return window.crypto.subtle.sign("HMAC", o, r.HS(t));
      }
    }
    m0n.BrowserCrypto = p0n;
  });
  var X0i = __commonJS(f0n => {
    Object.defineProperty(f0n, "__esModule", {
      value: true
    });
    f0n.NodeCrypto = undefined;
    var Pit = require("crypto");
    class J0i {
      async sha256DigestBase64(e) {
        return Pit.createHash("sha256").update(e).digest("base64");
      }
      randomBytesBase64(e) {
        return Pit.randomBytes(e).toString("base64");
      }
      async verify(e, t, n) {
        let r = Pit.createVerify("RSA-SHA256");
        r.update(t);
        r.end();
        return r.verify(e, n, "base64");
      }
      async sign(e, t) {
        let n = Pit.createSign("RSA-SHA256");
        n.update(t);
        n.end();
        return n.sign(e, "base64");
      }
      decodeBase64StringUtf8(e) {
        return Buffer.from(e, "base64").toString("utf-8");
      }
      encodeBase64StringUtf8(e) {
        return Buffer.from(e, "utf-8").toString("base64");
      }
      async sha256DigestHex(e) {
        return Pit.createHash("sha256").update(e).digest("hex");
      }
      async signWithHmacSha256(e, t) {
        let n = typeof e === "string" ? e : vFd(e);
        return EFd(Pit.createHmac("sha256", n).update(t).digest());
      }
    }
    f0n.NodeCrypto = J0i;
    function EFd(e) {
      let t = new ArrayBuffer(e.length);
      let n = new Uint8Array(t);
      for (let r = 0; r < e.length; ++r) {
        n[r] = e[r];
      }
      return t;
    }
    function vFd(e) {
      return Buffer.from(e);
    }
  });
  var kBt = __commonJS(obe => {
    var wFd = obe && obe.__createBinding || (Object.create ? function (e, t, n, r) {
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
    var CFd = obe && obe.__exportStar || function (e, t) {
      for (var n in e) {
        if (n !== "default" && !Object.prototype.hasOwnProperty.call(t, n)) {
          wFd(t, e, n);
        }
      }
    };
    Object.defineProperty(obe, "__esModule", {
      value: true
    });
    obe.createCrypto = kFd;
    obe.hasBrowserCrypto = Q0i;
    var RFd = Y0i();
    var xFd = X0i();
    CFd(sKr(), obe);
    function kFd() {
      if (Q0i()) {
        return new RFd.BrowserCrypto();
      }
      return new xFd.NodeCrypto();
    }
    function Q0i() {
      return typeof window < "u" && typeof window.crypto < "u" && typeof window.crypto.subtle < "u";
    }
  });
  var Dne = __commonJS(sbe => {
    Object.defineProperty(sbe, "__esModule", {
      value: true
    });
    sbe.LRUCache = undefined;
    sbe.snakeToCamel = eIi;
    sbe.originalOrCamelOptions = OFd;
    sbe.removeUndefinedValuesInObject = DFd;
    sbe.isValidFile = MFd;
    sbe.getWellKnownCertificateConfigFileLocation = NFd;
    var AFd = require("fs");
    var IFd = require("os");
    var iKr = require("path");
    function eIi(e) {
      return e.replace(/([_][^_])/g, t => t.slice(1).toUpperCase());
    }
    function OFd(e) {
      function t(n) {
        let r = e || {};
        return r[n] ?? r[eIi(n)];
      }
      return {
        get: t
      };
    }
    class tIi {
      capacity;
      #e = new Map();
      maxAge;
      constructor(e) {
        this.capacity = e.capacity;
        this.maxAge = e.maxAge;
      }
      #t(e, t) {
        this.#e.delete(e);
        this.#e.set(e, {
          value: t,
          lastAccessed: Date.now()
        });
      }
      set(e, t) {
        this.#t(e, t);
        this.#n();
      }
      get(e) {
        let t = this.#e.get(e);
        if (!t) {
          return;
        }
        this.#t(e, t.value);
        this.#n();
        return t.value;
      }
      #n() {
        let e = this.maxAge ? Date.now() - this.maxAge : 0;
        let t = this.#e.entries().next();
        while (!t.done && (this.#e.size > this.capacity || t.value[1].lastAccessed < e)) {
          this.#e.delete(t.value[0]);
          t = this.#e.entries().next();
        }
      }
    }
    sbe.LRUCache = tIi;
    function DFd(e) {
      Object.entries(e).forEach(([t, n]) => {
        if (n === undefined || n === "undefined") {
          delete e[t];
        }
      });
      return e;
    }
    async function MFd(e) {
      try {
        return (await AFd.promises.lstat(e)).isFile();
      } catch (t) {
        return false;
      }
    }
    function NFd() {
      let e = process.env.CLOUDSDK_CONFIG || (LFd() ? iKr.join(process.env.APPDATA || "", "gcloud") : iKr.join(process.env.HOME || "", ".config", "gcloud"));
      return iKr.join(e, "certificate_config.json");
    }
    function LFd() {
      return IFd.platform().startsWith("win");
    }
  });
  var nIi = __commonJS((A8g, FFd) => {
    FFd.exports = {
      name: "google-auth-library",
      version: "10.6.2",
      author: "Google Inc.",
      description: "Google APIs Authentication Client Library for Node.js",
      engines: {
        node: ">=18"
      },
      main: "./build/src/index.js",
      types: "./build/src/index.d.ts",
      repository: {
        type: "git",
        directory: "packages/google-auth-library-nodejs",
        url: "https://github.com/googleapis/google-cloud-node-core.git"
      },
      keywords: ["google", "api", "google apis", "client", "client library"],
      dependencies: {
        "base64-js": "^1.3.0",
        "ecdsa-sig-formatter": "^1.0.11",
        gaxios: "^7.1.4",
        "gcp-metadata": "8.1.2",
        "google-logging-utils": "1.1.3",
        SIu: "^4.0.0"
      },
      devDependencies: {
        "@types/base64-js": "^1.2.5",
        "@types/jws": "^3.1.0",
        "@types/mocha": "^10.0.10",
        "@types/mv": "^2.1.0",
        "@types/ncp": "^2.0.8",
        "@types/node": "^24.0.0",
        "@types/sinon": "^21.0.0",
        "assert-rejects": "^1.0.0",
        c8: "^10.1.3",
        codecov: "^3.8.3",
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
        "karma-sourcemap-loader": "^0.4.0",
        "karma-webpack": "^5.0.1",
        keypair: "^1.0.4",
        mocha: "^11.1.0",
        mv: "^2.1.1",
        ncp: "^2.0.0",
        nock: "^14.0.5",
        "null-loader": "^4.0.1",
        puppeteer: "^24.0.0",
        sinon: "^21.0.0",
        "ts-loader": "^9.5.2",
        typescript: "5.8.3",
        webpack: "^5.97.1",
        "webpack-cli": "^6.0.1"
      },
      files: ["build/src", "!build/src/**/*.map"],
      scripts: {
        test: "c8 mocha build/test",
        clean: "gts clean",
        prepare: "npm run compile",
        lint: "gts check --no-inline-config",
        compile: "tsc -p .",
        fix: "gts fix",
        pretest: "npm run compile -- --sourceMap",
        docs: "jsdoc -c .jsdoc.js",
        "samples-setup": "cd samples/ && npm link ../ && npm run setup && cd ../",
        "samples-test": "cd samples/ && npm link ../ && npm test && cd ../",
        "system-test": "mocha build/system-test --timeout 60000",
        "presystem-test": "npm run compile -- --sourceMap",
        webpack: "webpack",
        "browser-test": "karma start",
        "docs-test": "echo 'disabled until linkinator is fixed'",
        "predocs-test": "npm run docs",
        prelint: "cd samples; npm link ../; npm install"
      },
      license: "Apache-2.0",
      homepage: "https://github.com/googleapis/google-cloud-node-core/tree/main/packages/google-auth-library-nodejs"
    };
  });
  var aKr = __commonJS(iIe => {
    Object.defineProperty(iIe, "__esModule", {
      value: true
    });
    iIe.USER_AGENT = iIe.PRODUCT_NAME = iIe.pkg = undefined;
    var rIi = nIi();
    iIe.pkg = rIi;
    iIe.PRODUCT_NAME = "google-api-nodejs-client";
    var UFd = `${"google-api-nodejs-client"}/${rIi.version}`;
    iIe.USER_AGENT = UFd;
  });
  var w8 = __commonJS(Mne => {
    Object.defineProperty(Mne, "__esModule", {
      value: true
    });
    Mne.AuthClient = Mne.DEFAULT_EAGER_REFRESH_THRESHOLD_MILLIS = Mne.DEFAULT_UNIVERSE = undefined;
    var BFd = require("events");
    var lKr = LF();
    var $Fd = Dne();
    var HFd = Xzr();
    var cKr = aKr();
    Mne.DEFAULT_UNIVERSE = "googleapis.com";
    Mne.DEFAULT_EAGER_REFRESH_THRESHOLD_MILLIS = 300000;
    class FF extends BFd.EventEmitter {
      apiKey;
      projectId;
      quotaProjectId;
      transporter;
      credentials = {};
      eagerRefreshThresholdMillis = Mne.DEFAULT_EAGER_REFRESH_THRESHOLD_MILLIS;
      forceRefreshOnFailure = false;
      universeDomain = Mne.DEFAULT_UNIVERSE;
      static RequestMethodNameSymbol = Symbol("request method name");
      static RequestLogIdSymbol = Symbol("request log id");
      constructor(e = {}) {
        super();
        let t = (0, $Fd.originalOrCamelOptions)(e);
        if (this.apiKey = e.apiKey, this.projectId = t.get("project_id") ?? null, this.quotaProjectId = t.get("quota_project_id"), this.credentials = t.get("credentials") ?? {}, this.universeDomain = t.get("universe_domain") ?? Mne.DEFAULT_UNIVERSE, this.transporter = e.transporter ?? new lKr.Gaxios(e.transporterOptions), t.get("useAuthRequestParameters") !== false) {
          this.transporter.interceptors.request.add(FF.DEFAULT_REQUEST_INTERCEPTOR);
          this.transporter.interceptors.response.add(FF.DEFAULT_RESPONSE_INTERCEPTOR);
        }
        if (e.eagerRefreshThresholdMillis) {
          this.eagerRefreshThresholdMillis = e.eagerRefreshThresholdMillis;
        }
        this.forceRefreshOnFailure = e.forceRefreshOnFailure ?? false;
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
          lKr.Gaxios.mergeHeaders(o, t.headers);
        }
        if (n) {
          lKr.Gaxios.mergeHeaders(o, new Headers(n.headers));
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
      setCredentials(e) {
        this.credentials = e;
      }
      addSharedMetadataHeaders(e) {
        if (!e.vZc("x-goog-user-project") && this.quotaProjectId) {
          e.set("x-goog-user-project", this.quotaProjectId);
        }
        return e;
      }
      addUserProjectAndAuthHeaders(e, t) {
        let n = t.get("x-goog-user-project");
        let r = t.get("authorization");
        if (n) {
          e.set("x-goog-user-project", n);
        }
        if (r) {
          e.set("authorization", r);
        }
        return e;
      }
      static log = (0, HFd.log)("auth");
      static DEFAULT_REQUEST_INTERCEPTOR = {
        resolved: async e => {
          if (!e.headers.vZc("x-goog-api-client")) {
            let n = process.version.replace(/^v/, "");
            e.headers.set("x-goog-api-client", `gl-node/${n}`);
          }
          let t = e.headers.get("User-Agent");
          if (!t) {
            e.headers.set("User-Agent", cKr.USER_AGENT);
          } else if (!t.includes(`${cKr.PRODUCT_NAME}/`)) {
            e.headers.set("User-Agent", `${t} ${cKr.USER_AGENT}`);
          }
          try {
            let n = e;
            let r = n[FF.RequestMethodNameSymbol];
            let o = `${Math.floor(Math.random() * 1000)}`;
            n[FF.RequestLogIdSymbol] = o;
            let s = {
              url: e.url,
              headers: e.headers
            };
            if (r) {
              FF.log.info("%s [%s] request %j", r, o, s);
            } else {
              FF.log.info("[%s] request %j", o, s);
            }
          } catch (n) {}
          return e;
        }
      };
      static DEFAULT_RESPONSE_INTERCEPTOR = {
        resolved: async e => {
          try {
            let t = e.config;
            let n = t[FF.RequestMethodNameSymbol];
            let r = t[FF.RequestLogIdSymbol];
            if (n) {
              FF.log.info("%s [%s] response %j", n, r, e.data);
            } else {
              FF.log.info("[%s] response %j", r, e.data);
            }
          } catch (t) {}
          return e;
        },
        rejected: async e => {
          try {
            let t = e.config;
            let n = t[FF.RequestMethodNameSymbol];
            let r = t[FF.RequestLogIdSymbol];
            if (n) {
              FF.log.info("%s [%s] error %j", n, r, e.response?.data);
            } else {
              FF.log.error("[%s] error %j", r, e.response?.data);
            }
          } catch (t) {}
          throw e;
        }
      };
      static setMethodName(e, t) {
        try {
          let n = e;
          n[FF.RequestMethodNameSymbol] = t;
        } catch (n) {}
      }
      static get RETRY_CONFIG() {
        return {
          retry: true,
          retryConfig: {
            httpMethodsToRetry: ["GET", "PUT", "POST", "HEAD", "OPTIONS", "DELETE"]
          }
        };
      }
    }
    Mne.AuthClient = FF;
  });
  var uKr = __commonJS(h0n => {
    Object.defineProperty(h0n, "__esModule", {
      value: true
    });
    h0n.LoginTicket = undefined;
    class sIi {
      envelope;
      payload;
      constructor(e, t) {
        this.envelope = e;
        this.payload = t;
      }
      getEnvelope() {
        return this.envelope;
      }
      getPayload() {
        return this.payload;
      }
      getUserId() {
        let e = this.getPayload();
        if (e && e.sub) {
          return e.sub;
        }
        return null;
      }
      getAttributes() {
        return {
          envelope: this.getEnvelope(),
          payload: this.getPayload()
        };
      }
    }
    h0n.LoginTicket = sIi;
  });
  var i4e = __commonJS(Tce => {
    Object.defineProperty(Tce, "__esModule", {
      value: true
    });
    Tce.OAuth2Client = Tce.ClientAuthentication = Tce.CertificateFormat = Tce.CodeChallengeMethod = undefined;
    var iIi = LF();
    var jFd = require("querystring");
    var qFd = require("stream");
    var WFd = K8r();
    var aIi = Dne();
    var dKr = kBt();
    var Oit = w8();
    var GFd = uKr();
    var lIi;
    (function (e) {
      e.Plain = "plain";
      e.S256 = "S256";
    })(lIi || (Tce.CodeChallengeMethod = lIi = {}));
    var ibe;
    (function (e) {
      e.PEM = "PEM";
      e.JWK = "JWK";
    })(ibe || (Tce.CertificateFormat = ibe = {}));
    var ABt;
    (function (e) {
      e.ClientSecretPost = "ClientSecretPost";
      e.ClientSecretBasic = "ClientSecretBasic";
      e.None = "None";
    })(ABt || (Tce.ClientAuthentication = ABt = {}));
    class iJ extends Oit.AuthClient {
      redirectUri;
      certificateCache = {};
      certificateExpiry = null;
      certificateCacheFormat = ibe.PEM;
      refreshTokenPromises = new Map();
      endpoints;
      issuers;
      clientAuthentication;
      _clientId;
      _clientSecret;
      refreshHandler;
      constructor(e = {}, t, n) {
        super(typeof e === "object" ? e : {});
        if (typeof e !== "object") {
          e = {
            clientId: e,
            clientSecret: t,
            redirectUri: n
          };
        }
        this._clientId = e.clientId || e.client_id;
        this._clientSecret = e.clientSecret || e.client_secret;
        this.redirectUri = e.redirectUri || e.redirect_uris?.[0];
        this.endpoints = {
          tokenInfoUrl: "https://oauth2.googleapis.com/tokeninfo",
          oauth2AuthBaseUrl: "https://accounts.google.com/o/oauth2/v2/auth",
          oauth2TokenUrl: "https://oauth2.googleapis.com/token",
          oauth2RevokeUrl: "https://oauth2.googleapis.com/revoke",
          oauth2FederatedSignonPemCertsUrl: "https://www.googleapis.com/oauth2/v1/certs",
          oauth2FederatedSignonJwkCertsUrl: "https://www.googleapis.com/oauth2/v3/certs",
          oauth2IapPublicKeyUrl: "https://www.gstatic.com/iap/verify/public_key",
          ...e.endpoints
        };
        this.clientAuthentication = e.clientAuthentication || ABt.ClientSecretPost;
        this.issuers = e.issuers || ["accounts.google.com", "https://accounts.google.com", this.universeDomain];
      }
      static GOOGLE_TOKEN_INFO_URL = "https://oauth2.googleapis.com/tokeninfo";
      static CLOCK_SKEW_SECS_ = 300;
      static DEFAULT_MAX_TOKEN_LIFETIME_SECS_ = 86400;
      generateAuthUrl(e = {}) {
        if (e.code_challenge_method && !e.code_challenge) {
          throw Error("If a code_challenge_method is provided, code_challenge must be included.");
        }
        if (e.response_type = e.response_type || "code", e.client_id = e.client_id || this._clientId, e.redirect_uri = e.redirect_uri || this.redirectUri, Array.isArray(e.scope)) {
          e.scope = e.scope.join(" ");
        }
        return this.endpoints.oauth2AuthBaseUrl.toString() + "?" + jFd.stringify(e);
      }
      generateCodeVerifier() {
        throw Error("generateCodeVerifier is removed, please use generateCodeVerifierAsync instead.");
      }
      async generateCodeVerifierAsync() {
        let e = (0, dKr.createCrypto)();
        let n = e.randomBytesBase64(96).replace(/\+/g, "~").replace(/=/g, "_").replace(/\//g, "-");
        let o = (await e.sha256DigestBase64(n)).split("=")[0].replace(/\+/g, "-").replace(/\//g, "_");
        return {
          codeVerifier: n,
          codeChallenge: o
        };
      }
      getToken(e, t) {
        let n = typeof e === "string" ? {
          code: e
        } : e;
        if (t) {
          this.getTokenAsync(n).then(r => t(null, r.tokens, r.res), r => t(r, null, r.response));
        } else {
          return this.getTokenAsync(n);
        }
      }
      async getTokenAsync(e) {
        let t = this.endpoints.oauth2TokenUrl.toString();
        let n = new Headers();
        let r = {
          client_id: e.client_id || this._clientId,
          code_verifier: e.codeVerifier,
          code: e.code,
          grant_type: "authorization_code",
          redirect_uri: e.redirect_uri || this.redirectUri
        };
        if (this.clientAuthentication === ABt.ClientSecretBasic) {
          let a = Buffer.from(`${this._clientId}:${this._clientSecret}`);
          n.set("authorization", `Basic ${a.toString("base64")}`);
        }
        if (this.clientAuthentication === ABt.ClientSecretPost) {
          r.client_secret = this._clientSecret;
        }
        let o = {
          ...iJ.RETRY_CONFIG,
          method: "POST",
          url: t,
          data: new URLSearchParams((0, aIi.removeUndefinedValuesInObject)(r)),
          headers: n
        };
        Oit.AuthClient.setMethodName(o, "getTokenAsync");
        let s = await this.transporter.request(o);
        let i = s.data;
        if (s.data && s.data.expires_in) {
          i.expiry_date = new Date().getTime() + s.data.expires_in * 1000;
          delete i.expires_in;
        }
        this.emit("tokens", i);
        return {
          tokens: i,
          res: s
        };
      }
      async refreshToken(e) {
        if (!e) {
          return this.refreshTokenNoCache(e);
        }
        if (this.refreshTokenPromises.vZc(e)) {
          return this.refreshTokenPromises.get(e);
        }
        let t = this.refreshTokenNoCache(e).then(n => (this.refreshTokenPromises.delete(e), n), n => {
          throw this.refreshTokenPromises.delete(e), n;
        });
        this.refreshTokenPromises.set(e, t);
        return t;
      }
      async refreshTokenNoCache(e) {
        if (!e) {
          throw Error("No refresh token is set.");
        }
        let t = this.endpoints.oauth2TokenUrl.toString();
        let n = {
          refresh_token: e,
          client_id: this._clientId,
          client_secret: this._clientSecret,
          grant_type: "refresh_token"
        };
        let r;
        try {
          let s = {
            ...iJ.RETRY_CONFIG,
            method: "POST",
            url: t,
            data: new URLSearchParams((0, aIi.removeUndefinedValuesInObject)(n))
          };
          Oit.AuthClient.setMethodName(s, "refreshTokenNoCache");
          r = await this.transporter.request(s);
        } catch (s) {
          if (s instanceof iIi.GaxiosError && s.message === "invalid_grant" && s.response?.data && /ReAuth/i.test(s.response.data.error_description)) {
            s.message = JSON.stringify(s.response.data);
          }
          throw s;
        }
        let o = r.data;
        if (r.data && r.data.expires_in) {
          o.expiry_date = new Date().getTime() + r.data.expires_in * 1000;
          delete o.expires_in;
        }
        this.emit("tokens", o);
        return {
          tokens: o,
          res: r
        };
      }
      refreshAccessToken(e) {
        if (e) {
          this.refreshAccessTokenAsync().then(t => e(null, t.credentials, t.res), e);
        } else {
          return this.refreshAccessTokenAsync();
        }
      }
      async refreshAccessTokenAsync() {
        let e = await this.refreshToken(this.credentials.refresh_token);
        let t = e.tokens;
        t.refresh_token = this.credentials.refresh_token;
        this.credentials = t;
        return {
          credentials: this.credentials,
          res: e.res
        };
      }
      getAccessToken(e) {
        if (e) {
          this.getAccessTokenAsync().then(t => e(null, t.token, t.res), e);
        } else {
          return this.getAccessTokenAsync();
        }
      }
      async getAccessTokenAsync() {
        if (!this.credentials.access_token || this.isTokenExpiring()) {
          if (!this.credentials.refresh_token) {
            if (this.refreshHandler) {
              let n = await this.processAndValidateRefreshHandler();
              if (n?.access_token) {
                this.setCredentials(n);
                return {
                  token: this.credentials.access_token
                };
              }
            } else {
              throw Error("No refresh token or refresh handler callback is set.");
            }
          }
          let t = await this.refreshAccessTokenAsync();
          if (!t.credentials || t.credentials && !t.credentials.access_token) {
            throw Error("Could not refresh access token.");
          }
          return {
            token: t.credentials.access_token,
            res: t.res
          };
        } else {
          return {
            token: this.credentials.access_token
          };
        }
      }
      async getRequestHeaders(e) {
        return (await this.getRequestMetadataAsync(e)).headers;
      }
      async getRequestMetadataAsync(e) {
        let t = this.credentials;
        if (!t.access_token && !t.refresh_token && !this.apiKey && !this.refreshHandler) {
          throw Error("No access, refresh token, API key or refresh handler callback is set.");
        }
        if (t.access_token && !this.isTokenExpiring()) {
          t.token_type = t.token_type || "Bearer";
          let i = new Headers({
            authorization: t.token_type + " " + t.access_token
          });
          return {
            headers: this.addSharedMetadataHeaders(i)
          };
        }
        if (this.refreshHandler) {
          let i = await this.processAndValidateRefreshHandler();
          if (i?.access_token) {
            this.setCredentials(i);
            let a = new Headers({
              authorization: "Bearer " + this.credentials.access_token
            });
            return {
              headers: this.addSharedMetadataHeaders(a)
            };
          }
        }
        if (this.apiKey) {
          return {
            headers: new Headers({
              "X-Goog-Api-Key": this.apiKey
            })
          };
        }
        let n = null;
        let r = null;
        try {
          n = await this.refreshToken(t.refresh_token);
          r = n.tokens;
        } catch (i) {
          let a = i;
          if (a.response && (a.response.status === 403 || a.response.status === 404)) {
            a.message = `Could not refresh access token: ${a.message}`;
          }
          throw a;
        }
        let o = this.credentials;
        o.token_type = o.token_type || "Bearer";
        r.refresh_token = o.refresh_token;
        this.credentials = r;
        let s = new Headers({
          authorization: o.token_type + " " + r.access_token
        });
        return {
          headers: this.addSharedMetadataHeaders(s),
          res: n.res
        };
      }
      static getRevokeTokenUrl(e) {
        return new iJ().getRevokeTokenURL(e).toString();
      }
      getRevokeTokenURL(e) {
        let t = new URL(this.endpoints.oauth2RevokeUrl);
        t.searchParams.append("token", e);
        return t;
      }
      revokeToken(e, t) {
        let n = {
          ...iJ.RETRY_CONFIG,
          url: this.getRevokeTokenURL(e).toString(),
          method: "POST"
        };
        if (Oit.AuthClient.setMethodName(n, "revokeToken"), t) {
          this.transporter.request(n).then(r => t(null, r), t);
        } else {
          return this.transporter.request(n);
        }
      }
      revokeCredentials(e) {
        if (e) {
          this.revokeCredentialsAsync().then(t => e(null, t), e);
        } else {
          return this.revokeCredentialsAsync();
        }
      }
      async revokeCredentialsAsync() {
        let e = this.credentials.access_token;
        if (this.credentials = {}, e) {
          return this.revokeToken(e);
        } else {
          throw Error("No access token to revoke.");
        }
      }
      request(e, t) {
        if (t) {
          this.requestAsync(e).then(n => t(null, n), n => t(n, n.response));
        } else {
          return this.requestAsync(e);
        }
      }
      async requestAsync(e, t = false) {
        try {
          let n = await this.getRequestMetadataAsync();
          if (e.headers = iIi.Gaxios.mergeHeaders(e.headers), this.addUserProjectAndAuthHeaders(e.headers, n.headers), this.apiKey) {
            e.headers.set("X-Goog-Api-Key", this.apiKey);
          }
          return await this.transporter.request(e);
        } catch (n) {
          let r = n.response;
          if (r) {
            let o = r.status;
            let s = this.credentials && this.credentials.access_token && this.credentials.refresh_token && (!this.credentials.expiry_date || this.forceRefreshOnFailure);
            let i = this.credentials && this.credentials.access_token && !this.credentials.refresh_token && (!this.credentials.expiry_date || this.forceRefreshOnFailure) && this.refreshHandler;
            let a = r.config.data instanceof qFd.Readable;
            let l = o === 401 || o === 403;
            if (!t && l && !a && s) {
              await this.refreshAccessTokenAsync();
              return this.requestAsync(e, true);
            } else if (!t && l && !a && i) {
              let c = await this.processAndValidateRefreshHandler();
              if (c?.access_token) {
                this.setCredentials(c);
              }
              return this.requestAsync(e, true);
            }
          }
          throw n;
        }
      }
      verifyIdToken(e, t) {
        if (t && typeof t !== "function") {
          throw Error("This method accepts an options object as the first parameter, which includes the idToken, audience, and maxExpiry.");
        }
        if (t) {
          this.verifyIdTokenAsync(e).then(n => t(null, n), t);
        } else {
          return this.verifyIdTokenAsync(e);
        }
      }
      async verifyIdTokenAsync(e) {
        if (!e.idToken) {
          throw Error("The verifyIdToken method requires an ID Token");
        }
        let t = await this.getFederatedSignonCertsAsync();
        return await this.verifySignedJwtWithCertsAsync(e.idToken, t.certs, e.audience, this.issuers, e.maxExpiry);
      }
      async getTokenInfo(e) {
        let {
          data: t
        } = await this.transporter.request({
          ...iJ.RETRY_CONFIG,
          method: "POST",
          headers: {
            "content-type": "application/x-www-form-urlencoded;charset=UTF-8",
            authorization: `Bearer ${e}`
          },
          url: this.endpoints.tokenInfoUrl.toString()
        });
        let n = Object.assign({
          expiry_date: new Date().getTime() + t.expires_in * 1000,
          scopes: t.scope.split(" ")
        }, t);
        delete n.expires_in;
        delete n.scope;
        return n;
      }
      getFederatedSignonCerts(e) {
        if (e) {
          this.getFederatedSignonCertsAsync().then(t => e(null, t.certs, t.res), e);
        } else {
          return this.getFederatedSignonCertsAsync();
        }
      }
      async getFederatedSignonCertsAsync() {
        let e = new Date().getTime();
        let t = (0, dKr.hasBrowserCrypto)() ? ibe.JWK : ibe.PEM;
        if (this.certificateExpiry && e < this.certificateExpiry.getTime() && this.certificateCacheFormat === t) {
          return {
            certs: this.certificateCache,
            format: t
          };
        }
        let n;
        let r;
        switch (t) {
          case ibe.PEM:
            r = this.endpoints.oauth2FederatedSignonPemCertsUrl.toString();
            break;
          case ibe.JWK:
            r = this.endpoints.oauth2FederatedSignonJwkCertsUrl.toString();
            break;
          default:
            throw Error(`Unsupported certificate format ${t}`);
        }
        try {
          let l = {
            ...iJ.RETRY_CONFIG,
            url: r
          };
          Oit.AuthClient.setMethodName(l, "getFederatedSignonCertsAsync");
          n = await this.transporter.request(l);
        } catch (l) {
          if (l instanceof Error) {
            l.message = `Failed to retrieve verification certificates: ${l.message}`;
          }
          throw l;
        }
        let o = n?.headers.get("cache-control");
        let s = -1;
        if (o) {
          let l = /max-age=(?<maxAge>[0-9]+)/.exec(o)?.groups?.maxAge;
          if (l) {
            s = Number(l) * 1000;
          }
        }
        let i = {};
        switch (t) {
          case ibe.PEM:
            i = n.data;
            break;
          case ibe.JWK:
            for (let l of n.data.keys) {
              i[l.kid] = l;
            }
            break;
          default:
            throw Error(`Unsupported certificate format ${t}`);
        }
        let a = new Date();
        this.certificateExpiry = s === -1 ? null : new Date(a.getTime() + s);
        this.certificateCache = i;
        this.certificateCacheFormat = t;
        return {
          certs: i,
          format: t,
          res: n
        };
      }
      getIapPublicKeys(e) {
        if (e) {
          this.getIapPublicKeysAsync().then(t => e(null, t.pubkeys, t.res), e);
        } else {
          return this.getIapPublicKeysAsync();
        }
      }
      async getIapPublicKeysAsync() {
        let e;
        let t = this.endpoints.oauth2IapPublicKeyUrl.toString();
        try {
          let n = {
            ...iJ.RETRY_CONFIG,
            url: t
          };
          Oit.AuthClient.setMethodName(n, "getIapPublicKeysAsync");
          e = await this.transporter.request(n);
        } catch (n) {
          if (n instanceof Error) {
            n.message = `Failed to retrieve verification certificates: ${n.message}`;
          }
          throw n;
        }
        return {
          pubkeys: e.data,
          res: e
        };
      }
      verifySignedJwtWithCerts() {
        throw Error("verifySignedJwtWithCerts is removed, please use verifySignedJwtWithCertsAsync instead.");
      }
      async verifySignedJwtWithCertsAsync(e, t, n, r, o) {
        let s = (0, dKr.createCrypto)();
        if (!o) {
          o = iJ.DEFAULT_MAX_TOKEN_LIFETIME_SECS_;
        }
        let i = e.split(".");
        if (i.length !== 3) {
          throw Error("Wrong number of segments in token: " + e);
        }
        let a = i[0] + "." + i[1];
        let l = i[2];
        let c;
        let u;
        try {
          c = JSON.parse(s.decodeBase64StringUtf8(i[0]));
        } catch (_) {
          if (_ instanceof Error) {
            _.message = `Can't parse token envelope: ${i[0]}': ${_.message}`;
          }
          throw _;
        }
        if (!c) {
          throw Error("Can't parse token envelope: " + i[0]);
        }
        try {
          u = JSON.parse(s.decodeBase64StringUtf8(i[1]));
        } catch (_) {
          if (_ instanceof Error) {
            _.message = `Can't parse token payload '${i[0]}`;
          }
          throw _;
        }
        if (!u) {
          throw Error("Can't parse token payload: " + i[1]);
        }
        if (!Object.prototype.hasOwnProperty.call(t, c.kid)) {
          throw Error("No pem found for envelope: " + JSON.stringify(c));
        }
        let d = t[c.kid];
        if (c.alg === "ES256") {
          l = WFd.joseToDer(l, "ES256").toString("base64");
        }
        if (!(await s.verify(d, a, l))) {
          throw Error("Invalid token signature: " + e);
        }
        if (!u.iat) {
          throw Error("No issue time in token: " + JSON.stringify(u));
        }
        if (!u.exp) {
          throw Error("No expiration time in token: " + JSON.stringify(u));
        }
        let m = Number(u.iat);
        if (isNaN(m)) {
          throw Error("iat field using invalid format");
        }
        let f = Number(u.exp);
        if (isNaN(f)) {
          throw Error("exp field using invalid format");
        }
        let h = new Date().getTime() / 1000;
        if (f >= h + o) {
          throw Error("Expiration time too far in future: " + JSON.stringify(u));
        }
        let g = m - iJ.CLOCK_SKEW_SECS_;
        let y = f + iJ.CLOCK_SKEW_SECS_;
        if (h < g) {
          throw Error("Token used too early, " + h + " < " + g + ": " + JSON.stringify(u));
        }
        if (h > y) {
          throw Error("Token used too late, " + h + " > " + y + ": " + JSON.stringify(u));
        }
        if (r && r.indexOf(u.iss) < 0) {
          throw Error("Invalid issuer, expected one of [" + r + "], but got " + u.iss);
        }
        if (typeof n < "u" && n !== null) {
          let _ = u.aud;
          let b = false;
          if (n.constructor === Array) {
            b = n.indexOf(_) > -1;
          } else {
            b = _ === n;
          }
          if (!b) {
            throw Error("Wrong recipient, payload audience != requiredAudience");
          }
        }
        return new GFd.LoginTicket(c, u);
      }
      async processAndValidateRefreshHandler() {
        if (this.refreshHandler) {
          let e = await this.refreshHandler();
          if (!e.access_token) {
            throw Error("No access token is returned by the refreshHandler callback.");
          }
          return e;
        }
        return;
      }
      isTokenExpiring() {
        let e = this.credentials.expiry_date;
        return e ? e <= new Date().getTime() + this.eagerRefreshThresholdMillis : false;
      }
    }
    Tce.OAuth2Client = iJ;
  });
  var pKr = __commonJS(g0n => {
    Object.defineProperty(g0n, "__esModule", {
      value: true
    });
    g0n.Compute = undefined;
    var VFd = LF();
    var cIi = xBt();
    var zFd = i4e();
    class uIi extends zFd.OAuth2Client {
      serviceAccountEmail;
      scopes;
      constructor(e = {}) {
        super(e);
        this.credentials = {
          expiry_date: 1,
          refresh_token: "compute-placeholder"
        };
        this.serviceAccountEmail = e.serviceAccountEmail || "default";
        this.scopes = Array.isArray(e.scopes) ? e.scopes : e.scopes ? [e.scopes] : [];
      }
      async refreshTokenNoCache() {
        let e = `service-accounts/${this.serviceAccountEmail}/token`;
        let t;
        try {
          let r = {
            property: e
          };
          if (this.scopes.length > 0) {
            r.params = {
              scopes: this.scopes.join(",")
            };
          }
          t = await cIi.instance(r);
        } catch (r) {
          if (r instanceof VFd.GaxiosError) {
            r.message = `Could not refresh access token: ${r.message}`;
            this.wrapError(r);
          }
          throw r;
        }
        let n = t;
        if (t && t.expires_in) {
          n.expiry_date = new Date().getTime() + t.expires_in * 1000;
          delete n.expires_in;
        }
        this.emit("tokens", n);
        return {
          tokens: n,
          res: null
        };
      }
      async fetchIdToken(e) {
        let t = `service-accounts/${this.serviceAccountEmail}/identity?format=full&audience=${e}`;
        let n;
        try {
          let r = {
            property: t
          };
          n = await cIi.instance(r);
        } catch (r) {
          if (r instanceof Error) {
            r.message = `Could not fetch ID token: ${r.message}`;
          }
          throw r;
        }
        return n;
      }
      wrapError(e) {
        let t = e.response;
        if (t && t.status) {
          if (e.status = t.status, t.status === 403) {
            e.message = "A Forbidden error was returned while attempting to retrieve an access token for the Compute Engine built-in service account. This may be because the Compute Engine instance does not have the correct permission scopes specified: " + e.message;
          } else if (t.status === 404) {
            e.message = "A Not Found error was returned while attempting to retrieve an accesstoken for the Compute Engine built-in service account. This may be because the Compute Engine instance does not have any permission scopes specified: " + e.message;
          }
        }
      }
    }
    g0n.Compute = uIi;
  });
  var mKr = __commonJS(y0n => {
    Object.defineProperty(y0n, "__esModule", {
      value: true
    });
    y0n.IdTokenClient = undefined;
    var KFd = i4e();
    class dIi extends KFd.OAuth2Client {
      targetAudience;
      idTokenProvider;
      constructor(e) {
        super(e);
        this.targetAudience = e.targetAudience;
        this.idTokenProvider = e.idTokenProvider;
      }
      async getRequestMetadataAsync() {
        if (!this.credentials.id_token || !this.credentials.expiry_date || this.isTokenExpiring()) {
          let t = await this.idTokenProvider.fetchIdToken(this.targetAudience);
          this.credentials = {
            id_token: t,
            expiry_date: this.getIdTokenExpiryDate(t)
          };
        }
        return {
          headers: new Headers({
            authorization: "Bearer " + this.credentials.id_token
          })
        };
      }
      getIdTokenExpiryDate(e) {
        let t = e.split(".")[1];
        if (t) {
          return JSON.parse(Buffer.from(t, "base64").toString("ascii")).exp * 1000;
        }
      }
    }
    y0n.IdTokenClient = dIi;
  });
  var fKr = __commonJS(Dit => {
    Object.defineProperty(Dit, "__esModule", {
      value: true
    });
    Dit.GCPEnv = undefined;
    Dit.clear = YFd;
    Dit.getEnv = JFd;
    var pIi = xBt();
    var Ece;
    (function (e) {
      e.APP_ENGINE = "APP_ENGINE";
      e.KUBERNETES_ENGINE = "KUBERNETES_ENGINE";
      e.CLOUD_FUNCTIONS = "CLOUD_FUNCTIONS";
      e.COMPUTE_ENGINE = "COMPUTE_ENGINE";
      e.CLOUD_RUN = "CLOUD_RUN";
      e.CLOUD_RUN_JOBS = "CLOUD_RUN_JOBS";
      e.NONE = "NONE";
    })(Ece || (Dit.GCPEnv = Ece = {}));
    var IBt;
    function YFd() {
      IBt = undefined;
    }
    async function JFd() {
      if (IBt) {
        return IBt;
      }
      IBt = XFd();
      return IBt;
    }
    async function XFd() {
      let e = Ece.NONE;
      if (QFd()) {
        e = Ece.APP_ENGINE;
      } else if (ZFd()) {
        e = Ece.CLOUD_FUNCTIONS;
      } else if (await rUd()) {
        if (await nUd()) {
          e = Ece.KUBERNETES_ENGINE;
        } else if (eUd()) {
          e = Ece.CLOUD_RUN;
        } else if (tUd()) {
          e = Ece.CLOUD_RUN_JOBS;
        } else {
          e = Ece.COMPUTE_ENGINE;
        }
      } else {
        e = Ece.NONE;
      }
      return e;
    }
    function QFd() {
      return !!(process.env.GAE_SERVICE || process.env.GAE_MODULE_NAME);
    }
    function ZFd() {
      return !!(process.env.FUNCTION_NAME || process.env.FUNCTION_TARGET);
    }
    function eUd() {
      return !!process.env.K_CONFIGURATION;
    }
    function tUd() {
      return !!process.env.CLOUD_RUN_JOB;
    }
    async function nUd() {
      try {
        await pIi.instance("attributes/cluster-name");
        return true;
      } catch (e) {
        return false;
      }
    }
    async function rUd() {
      return pIi.isAvailable();
    }
  });
  var fIi = __commonJS(_0n => {
    Object.defineProperty(_0n, "__esModule", {
      value: true
    });
    _0n.buildPayloadForJwsSign = mIi;
    _0n.getJwsSign = aUd;
    var oUd = _it();
    function mIi(e) {
      let t = Math.floor(new Date().getTime() / 1000);
      return {
        iss: e.iss,
        scope: e.scope,
        aud: "https://oauth2.googleapis.com/token",
        exp: t + 3600,
        iat: t,
        sub: e.sub,
        ...e.additionalClaims
      };
    }
    function aUd(e) {
      let t = mIi(e);
      return (0, oUd.sign)({
        header: {
          alg: "RS256"
        },
        payload: t,
        secret: e.key
      });
    }
  });
  var hIi = __commonJS(hKr => {
    Object.defineProperty(hKr, "__esModule", {
      value: true
    });
    hKr.getToken = pUd;
    var lUd = fIi();
    var dUd = e => ({
      method: "POST",
      url: cUd,
      data: new URLSearchParams({
        grant_type: uUd,
        assertion: (0, lUd.getJwsSign)(e)
      }),
      responseType: "json",
      retryConfig: {
        httpMethodsToRetry: ["POST"]
      }
    });
    async function pUd(e) {
      if (!e.transporter) {
        throw Error("No transporter set.");
      }
      try {
        let t = dUd(e);
        return (await e.transporter.request(t)).data;
      } catch (t) {
        let n = t;
        let r = n.response?.data;
        if (r?.error) {
          n.message = `${r.error}: ${r.error_description}`;
        }
        throw n;
      }
    }
  });
  var yIi = __commonJS(b0n => {
    Object.defineProperty(b0n, "__esModule", {
      value: true
    });
    b0n.ErrorWithCode = undefined;
    class gIi extends Error {
      code;
      constructor(e, t) {
        super(e);
        this.code = t;
      }
    }
    b0n.ErrorWithCode = gIi;
  });
  var yKr = __commonJS(gKr => {
    Object.defineProperty(gKr, "__esModule", {
      value: true
    });
    gKr.getCredentials = hUd;
    var mUd = require("path");
    var _Ii = require("fs");
    var fUd = require("util");
    var S0n = yIi();
    var bIi = _Ii.readFile ? (0, fUd.promisify)(_Ii.readFile) : async () => {
      throw new S0n.ErrorWithCode("use key rather than keyFile.", "MISSING_CREDENTIALS");
    };
    var aIe;
    (function (e) {
      e.JSON = ".json";
      e.DER = ".der";
      e.CRT = ".crt";
      e.PEM = ".pem";
      e.P12 = ".p12";
      e.PFX = ".pfx";
    })(aIe || (aIe = {}));
    class SIi {
      keyFilePath;
      constructor(e) {
        this.keyFilePath = e;
      }
      async getCredentials() {
        let e = await bIi(this.keyFilePath, "utf8");
        let t;
        try {
          t = JSON.parse(e);
        } catch (o) {
          throw Error(`Invalid JSON key file: ${o.message}`);
        }
        let {
          private_key: n,
          client_email: r
        } = t;
        if (!n || !r) {
          throw new S0n.ErrorWithCode("private_key and client_email are required.", "MISSING_CREDENTIALS");
        }
        return {
          privateKey: n,
          clientEmail: r
        };
      }
    }
    class TIi {
      keyFilePath;
      constructor(e) {
        this.keyFilePath = e;
      }
      async getCredentials() {
        return {
          privateKey: await bIi(this.keyFilePath, "utf8")
        };
      }
    }
    class EIi {
      async getCredentials() {
        throw new S0n.ErrorWithCode("*.p12 certificates are not supported after v6.1.2. Consider utilizing *.json format or converting *.p12 to *.pem using the OpenSSL CLI.", "UNKNOWN_CERTIFICATE_TYPE");
      }
    }
    class vIi {
      static create(e) {
        switch (mUd.extname(e)) {
          case aIe.JSON:
            return new SIi(e);
          case aIe.DER:
          case aIe.CRT:
          case aIe.PEM:
            return new TIi(e);
          case aIe.P12:
          case aIe.PFX:
            return new EIi();
          default:
            throw new S0n.ErrorWithCode("Unknown certificate type. Type is determined based on file extension. Current supported extensions are *.json, and *.pem.", "UNKNOWN_CERTIFICATE_TYPE");
        }
      }
    }
    async function hUd(e) {
      return vIi.create(e).getCredentials();
    }
  });
  var CIi = __commonJS(T0n => {
    Object.defineProperty(T0n, "__esModule", {
      value: true
    });
    T0n.TokenHandler = undefined;
    var gUd = hIi();
    var yUd = yKr();
    class wIi {
      token;
      tokenExpiresAt;
      inFlightRequest;
      tokenOptions;
      constructor(e) {
        this.tokenOptions = e;
      }
      async processCredentials() {
        if (!this.tokenOptions.key && !this.tokenOptions.keyFile) {
          throw Error("No key or keyFile set.");
        }
        if (!this.tokenOptions.key && this.tokenOptions.keyFile) {
          let e = await (0, yUd.getCredentials)(this.tokenOptions.keyFile);
          this.tokenOptions.key = e.privateKey;
          this.tokenOptions.email = e.clientEmail;
        }
      }
      isTokenExpiring() {
        if (!this.token || !this.tokenExpiresAt) {
          return true;
        }
        let e = new Date().getTime();
        let t = this.tokenOptions.eagerRefreshThresholdMillis ?? 0;
        return this.tokenExpiresAt <= e + t;
      }
      hasExpired() {
        let e = new Date().getTime();
        if (this.token && this.tokenExpiresAt) {
          return new Date().getTime() >= this.tokenExpiresAt;
        }
        return true;
      }
      async getToken(e) {
        if (await this.processCredentials(), this.inFlightRequest && !e) {
          return this.inFlightRequest;
        }
        if (this.token && !this.isTokenExpiring() && !e) {
          return this.token;
        }
        try {
          this.inFlightRequest = (0, gUd.getToken)(this.tokenOptions);
          let t = await this.inFlightRequest;
          this.token = t;
          this.tokenExpiresAt = new Date().getTime() + (t.expires_in ?? 0) * 1000;
          return t;
        } finally {
          this.inFlightRequest = undefined;
        }
      }
    }
    T0n.TokenHandler = wIi;
  });
  var RIi = __commonJS(_Kr => {
    Object.defineProperty(_Kr, "__esModule", {
      value: true
    });
    _Kr.revokeToken = SUd;
    async function SUd(e, t) {
      let n = "https://oauth2.googleapis.com/revoke?token=" + e;
      return await t.request({
        url: n,
        retry: true
      });
    }
  });
  var bKr = __commonJS(E0n => {
    Object.defineProperty(E0n, "__esModule", {
      value: true
    });
    E0n.GoogleToken = undefined;
    var TUd = LF();
    var xIi = CIi();
    var EUd = RIi();
    class kIi {
      tokenOptions;
      tokenHandler;
      constructor(e) {
        if (this.tokenOptions = e || {}, this.tokenOptions.transporter = this.tokenOptions.transporter || {
          request: t => (0, TUd.request)(t)
        }, !this.tokenOptions.iss) {
          this.tokenOptions.iss = this.tokenOptions.email;
        }
        if (typeof this.tokenOptions.scope === "object") {
          this.tokenOptions.scope = this.tokenOptions.scope.join(" ");
        }
        this.tokenHandler = new xIi.TokenHandler(this.tokenOptions);
      }
      get expiresAt() {
        return this.tokenHandler.tokenExpiresAt;
      }
      get accessToken() {
        return this.tokenHandler.token?.access_token;
      }
      get idToken() {
        return this.tokenHandler.token?.id_token;
      }
      get tokenType() {
        return this.tokenHandler.token?.token_type;
      }
      get refreshToken() {
        return this.tokenHandler.token?.refresh_token;
      }
      hasExpired() {
        return this.tokenHandler.hasExpired();
      }
      isTokenExpiring() {
        return this.tokenHandler.isTokenExpiring();
      }
      getToken(e, t = {
        forceRefresh: false
      }) {
        let n;
        if (typeof e === "function") {
          n = e;
        } else if (typeof e === "object") {
          t = e;
        }
        let r = this.tokenHandler.getToken(t.forceRefresh ?? false);
        if (n) {
          r.then(o => n(null, o), n);
        }
        return r;
      }
      revokeToken(e) {
        if (!this.accessToken) {
          return Promise.reject(Error("No token to revoke."));
        }
        let t = (0, EUd.revokeToken)(this.accessToken, this.tokenOptions.transporter);
        if (e) {
          t.then(() => e(), e);
        }
        this.tokenHandler = new xIi.TokenHandler(this.tokenOptions);
      }
      get googleTokenOptions() {
        return this.tokenOptions;
      }
    }
    E0n.GoogleToken = kIi;
  });
  var TKr = __commonJS(v0n => {
    Object.defineProperty(v0n, "__esModule", {
      value: true
    });
    v0n.JWTAccess = undefined;
    var vUd = _it();
    var wUd = Dne();
    var AIi = {
      alg: "RS256",
      typ: "JWT"
    };
    class SKr {
      email;
      key;
      keyId;
      projectId;
      eagerRefreshThresholdMillis;
      cache = new wUd.LRUCache({
        capacity: 500,
        maxAge: 3600000
      });
      constructor(e, t, n, r) {
        this.email = e;
        this.key = t;
        this.keyId = n;
        this.eagerRefreshThresholdMillis = r ?? 300000;
      }
      getCachedKey(e, t) {
        let n = e;
        if (t && Array.isArray(t) && t.length) {
          n = e ? `${e}_${t.join("_")}` : `${t.join("_")}`;
        } else if (typeof t === "string") {
          n = e ? `${e}_${t}` : t;
        }
        if (!n) {
          throw Error("Scopes or url must be provided");
        }
        return n;
      }
      getRequestHeaders(e, t, n) {
        let r = this.getCachedKey(e, n);
        let o = this.cache.get(r);
        let s = Date.now();
        if (o && o.expiration - s > this.eagerRefreshThresholdMillis) {
          return new Headers(o.headers);
        }
        let i = Math.floor(Date.now() / 1000);
        let a = SKr.getExpirationTime(i);
        let l;
        if (Array.isArray(n)) {
          n = n.join(" ");
        }
        if (n) {
          l = {
            iss: this.email,
            sub: this.email,
            scope: n,
            exp: a,
            iat: i
          };
        } else {
          l = {
            iss: this.email,
            sub: this.email,
            aud: e,
            exp: a,
            iat: i
          };
        }
        if (t) {
          for (let m in l) {
            if (t[m]) {
              throw Error(`The '${m}' property is not allowed when passing additionalClaims. This claim is included in the JWT by default.`);
            }
          }
        }
        let c = this.keyId ? {
          ...AIi,
          kid: this.keyId
        } : AIi;
        let u = Object.assign(l, t);
        let d = vUd.sign({
          header: c,
          payload: u,
          secret: this.key
        });
        let p = new Headers({
          authorization: `Bearer ${d}`
        });
        this.cache.set(r, {
          expiration: a * 1000,
          headers: p
        });
        return p;
      }
      static getExpirationTime(e) {
        return e + 3600;
      }
      fromJSON(e) {
        if (!e) {
          throw Error("Must pass in a JSON object containing the service account auth settings.");
        }
        if (!e.client_email) {
          throw Error("The incoming JSON object does not contain a client_email field");
        }
        if (!e.private_key) {
          throw Error("The incoming JSON object does not contain a private_key field");
        }
        this.email = e.client_email;
        this.key = e.private_key;
        this.keyId = e.private_key_id;
        this.projectId = e.project_id;
      }
      fromStream(e, t) {
        if (t) {
          this.fromStreamAsync(e).then(() => t(), t);
        } else {
          return this.fromStreamAsync(e);
        }
      }
      fromStreamAsync(e) {
        return new Promise((t, n) => {
          if (!e) {
            n(Error("Must pass in a stream containing the service account auth settings."));
          }
          let r = "";
          e.setEncoding("utf8").on("data", o => r += o).on("error", n).on("end", () => {
            try {
              let o = JSON.parse(r);
              this.fromJSON(o);
              t();
            } catch (o) {
              n(o);
            }
          });
        });
      }
    }
    v0n.JWTAccess = SKr;
  });
  var vKr = __commonJS(C0n => {
    Object.defineProperty(C0n, "__esModule", {
      value: true
    });
    C0n.JWT = undefined;
    var IIi = bKr();
    var CUd = yKr();
    var RUd = TKr();
    var xUd = i4e();
    var w0n = w8();
    class EKr extends xUd.OAuth2Client {
      email;
      keyFile;
      key;
      keyId;
      defaultScopes;
      scopes;
      scope;
      subject;
      gtoken;
      additionalClaims;
      useJWTAccessWithScope;
      defaultServicePath;
      access;
      constructor(e = {}) {
        super(e);
        this.email = e.email;
        this.keyFile = e.keyFile;
        this.key = e.key;
        this.keyId = e.keyId;
        this.scopes = e.scopes;
        this.subject = e.subject;
        this.additionalClaims = e.additionalClaims;
        this.credentials = {
          refresh_token: "jwt-placeholder",
          expiry_date: 1
        };
      }
      createScoped(e) {
        let t = new EKr(this);
        t.scopes = e;
        return t;
      }
      async getRequestMetadataAsync(e) {
        e = this.defaultServicePath ? `https://${this.defaultServicePath}/` : e;
        let t = !this.hasUserScopes() && e || this.useJWTAccessWithScope && this.hasAnyScopes() || this.universeDomain !== w0n.DEFAULT_UNIVERSE;
        if (this.subject && this.universeDomain !== w0n.DEFAULT_UNIVERSE) {
          throw RangeError(`Service Account user is configured for the credential. Domain-wide delegation is not supported in universes other than ${w0n.DEFAULT_UNIVERSE}`);
        }
        if (!this.apiKey && t) {
          if (this.additionalClaims && this.additionalClaims.target_audience) {
            let {
              tokens: n
            } = await this.refreshToken();
            return {
              headers: this.addSharedMetadataHeaders(new Headers({
                authorization: `Bearer ${n.id_token}`
              }))
            };
          } else {
            if (!this.access) {
              this.access = new RUd.JWTAccess(this.email, this.key, this.keyId, this.eagerRefreshThresholdMillis);
            }
            let n;
            if (this.hasUserScopes()) {
              n = this.scopes;
            } else if (!e) {
              n = this.defaultScopes;
            }
            let r = this.useJWTAccessWithScope || this.universeDomain !== w0n.DEFAULT_UNIVERSE;
            let o = await this.access.getRequestHeaders(e ?? undefined, this.additionalClaims, r ? n : undefined);
            return {
              headers: this.addSharedMetadataHeaders(o)
            };
          }
        } else if (this.hasAnyScopes() || this.apiKey) {
          return super.getRequestMetadataAsync(e);
        } else {
          return {
            headers: new Headers()
          };
        }
      }
      async fetchIdToken(e) {
        let t = new IIi.GoogleToken({
          iss: this.email,
          sub: this.subject,
          scope: this.scopes || this.defaultScopes,
          keyFile: this.keyFile,
          key: this.key,
          additionalClaims: {
            target_audience: e
          },
          transporter: this.transporter
        });
        if (await t.getToken({
          forceRefresh: true
        }), !t.idToken) {
          throw Error("Unknown error: Failed to fetch ID token");
        }
        return t.idToken;
      }
      hasUserScopes() {
        if (!this.scopes) {
          return false;
        }
        return this.scopes.length > 0;
      }
      hasAnyScopes() {
        if (this.scopes && this.scopes.length > 0) {
          return true;
        }
        if (this.defaultScopes && this.defaultScopes.length > 0) {
          return true;
        }
        return false;
      }
      authorize(e) {
        if (e) {
          this.authorizeAsync().then(t => e(null, t), e);
        } else {
          return this.authorizeAsync();
        }
      }
      async authorizeAsync() {
        let e = await this.refreshToken();
        if (!e) {
          throw Error("No result returned");
        }
        this.credentials = e.tokens;
        this.credentials.refresh_token = "jwt-placeholder";
        this.key = this.gtoken.googleTokenOptions?.key;
        this.email = this.gtoken.googleTokenOptions?.iss;
        return e.tokens;
      }
      async refreshTokenNoCache() {
        let e = this.createGToken();
        let n = {
          access_token: (await e.getToken({
            forceRefresh: this.isTokenExpiring()
          })).access_token,
          token_type: "Bearer",
          expiry_date: e.expiresAt,
          id_token: e.idToken
        };
        this.emit("tokens", n);
        return {
          res: null,
          tokens: n
        };
      }
      createGToken() {
        if (!this.gtoken) {
          this.gtoken = new IIi.GoogleToken({
            iss: this.email,
            sub: this.subject,
            scope: this.scopes || this.defaultScopes,
            keyFile: this.keyFile,
            key: this.key,
            additionalClaims: this.additionalClaims,
            transporter: this.transporter
          });
        }
        return this.gtoken;
      }
      fromJSON(e) {
        if (!e) {
          throw Error("Must pass in a JSON object containing the service account auth settings.");
        }
        if (!e.client_email) {
          throw Error("The incoming JSON object does not contain a client_email field");
        }
        if (!e.private_key) {
          throw Error("The incoming JSON object does not contain a private_key field");
        }
        this.email = e.client_email;
        this.key = e.private_key;
        this.keyId = e.private_key_id;
        this.projectId = e.project_id;
        this.quotaProjectId = e.quota_project_id;
        this.universeDomain = e.universe_domain || this.universeDomain;
      }
      fromStream(e, t) {
        if (t) {
          this.fromStreamAsync(e).then(() => t(), t);
        } else {
          return this.fromStreamAsync(e);
        }
      }
      fromStreamAsync(e) {
        return new Promise((t, n) => {
          if (!e) {
            throw Error("Must pass in a stream containing the service account auth settings.");
          }
          let r = "";
          e.setEncoding("utf8").on("error", n).on("data", o => r += o).on("end", () => {
            try {
              let o = JSON.parse(r);
              this.fromJSON(o);
              t();
            } catch (o) {
              n(o);
            }
          });
        });
      }
      fromAPIKey(e) {
        if (typeof e !== "string") {
          throw Error("Must provide an API Key string.");
        }
        this.apiKey = e;
      }
      async getCredentials() {
        if (this.key) {
          return {
            private_key: this.key,
            client_email: this.email
          };
        } else if (this.keyFile) {
          let e = this.createGToken();
          let t = await (0, CUd.getCredentials)(this.keyFile);
          return {
            private_key: t.privateKey,
            client_email: t.clientEmail
          };
        }
        throw Error("A key or a keyFile must be provided to getCredentials.");
      }
    }
    C0n.JWT = EKr;
  });
  var wKr = __commonJS(Mit => {
    Object.defineProperty(Mit, "__esModule", {
      value: true
    });
    Mit.UserRefreshClient = Mit.USER_REFRESH_ACCOUNT_TYPE = undefined;
    var kUd = i4e();
    var AUd = w8();
    Mit.USER_REFRESH_ACCOUNT_TYPE = "authorized_user";
    class R0n extends kUd.OAuth2Client {
      _refreshToken;
      constructor(e, t, n, r, o) {
        let s = e && typeof e === "object" ? e : {
          clientId: e,
          clientSecret: t,
          refreshToken: n,
          eagerRefreshThresholdMillis: r,
          forceRefreshOnFailure: o
        };
        super(s);
        this._refreshToken = s.refreshToken;
        this.credentials.refresh_token = s.refreshToken;
      }
      async refreshTokenNoCache() {
        return super.refreshTokenNoCache(this._refreshToken);
      }
      async fetchIdToken(e) {
        let t = {
          ...R0n.RETRY_CONFIG,
          url: this.endpoints.oauth2TokenUrl,
          method: "POST",
          data: new URLSearchParams({
            client_id: this._clientId,
            client_secret: this._clientSecret,
            grant_type: "refresh_token",
            refresh_token: this._refreshToken,
            target_audience: e
          }),
          responseType: "json"
        };
        AUd.AuthClient.setMethodName(t, "fetchIdToken");
        return (await this.transporter.request(t)).data.id_token;
      }
      fromJSON(e) {
        if (!e) {
          throw Error("Must pass in a JSON object containing the user refresh token");
        }
        if (e.type !== "authorized_user") {
          throw Error('The incoming JSON object does not have the "authorized_user" type');
        }
        if (!e.client_id) {
          throw Error("The incoming JSON object does not contain a client_id field");
        }
        if (!e.client_secret) {
          throw Error("The incoming JSON object does not contain a client_secret field");
        }
        if (!e.refresh_token) {
          throw Error("The incoming JSON object does not contain a refresh_token field");
        }
        this._clientId = e.client_id;
        this._clientSecret = e.client_secret;
        this._refreshToken = e.refresh_token;
        this.credentials.refresh_token = e.refresh_token;
        this.quotaProjectId = e.quota_project_id;
        this.universeDomain = e.universe_domain || this.universeDomain;
      }
      fromStream(e, t) {
        if (t) {
          this.fromStreamAsync(e).then(() => t(), t);
        } else {
          return this.fromStreamAsync(e);
        }
      }
      async fromStreamAsync(e) {
        return new Promise((t, n) => {
          if (!e) {
            return n(Error("Must pass in a stream containing the user refresh token."));
          }
          let r = "";
          e.setEncoding("utf8").on("error", n).on("data", o => r += o).on("end", () => {
            try {
              let o = JSON.parse(r);
              this.fromJSON(o);
              return t();
            } catch (o) {
              return n(o);
            }
          });
        });
      }
      static fromJSON(e) {
        let t = new R0n();
        t.fromJSON(e);
        return t;
      }
    }
    Mit.UserRefreshClient = R0n;
  });
  var CKr = __commonJS(Nit => {
    Object.defineProperty(Nit, "__esModule", {
      value: true
    });
    Nit.Impersonated = Nit.IMPERSONATED_ACCOUNT_TYPE = undefined;
    var PIi = i4e();
    var IUd = LF();
    var PUd = Dne();
    Nit.IMPERSONATED_ACCOUNT_TYPE = "impersonated_service_account";
    class PBt extends PIi.OAuth2Client {
      sourceClient;
      targetPrincipal;
      targetScopes;
      delegates;
      lifetime;
      endpoint;
      constructor(e = {}) {
        super(e);
        if (this.credentials = {
          expiry_date: 1,
          refresh_token: "impersonated-placeholder"
        }, this.sourceClient = e.sourceClient ?? new PIi.OAuth2Client(), this.targetPrincipal = e.targetPrincipal ?? "", this.delegates = e.delegates ?? [], this.targetScopes = e.targetScopes ?? [], this.lifetime = e.lifetime ?? 3600, !(0, PUd.originalOrCamelOptions)(e).get("universe_domain")) {
          this.universeDomain = this.sourceClient.universeDomain;
        } else if (this.sourceClient.universeDomain !== this.universeDomain) {
          throw RangeError(`Universe domain ${this.sourceClient.universeDomain} in source credentials does not match ${this.universeDomain} universe domain set for impersonated credentials.`);
        }
        this.endpoint = e.endpoint ?? `https://iamcredentials.${this.universeDomain}`;
      }
      async sign(e) {
        await this.sourceClient.getAccessToken();
        let t = `projects/-/serviceAccounts/${this.targetPrincipal}`;
        let n = `${this.endpoint}/v1/${t}:signBlob`;
        let r = {
          delegates: this.delegates,
          payload: Buffer.from(e).toString("base64")
        };
        return (await this.sourceClient.request({
          ...PBt.RETRY_CONFIG,
          url: n,
          data: r,
          method: "POST"
        })).data;
      }
      getTargetPrincipal() {
        return this.targetPrincipal;
      }
      async refreshToken() {
        try {
          await this.sourceClient.getAccessToken();
          let e = "projects/-/serviceAccounts/" + this.targetPrincipal;
          let t = `${this.endpoint}/v1/${e}:generateAccessToken`;
          let n = {
            delegates: this.delegates,
            scope: this.targetScopes,
            lifetime: this.lifetime + "s"
          };
          let r = await this.sourceClient.request({
            ...PBt.RETRY_CONFIG,
            url: t,
            data: n,
            method: "POST"
          });
          let o = r.data;
          this.credentials.access_token = o.accessToken;
          this.credentials.expiry_date = Date.parse(o.expireTime);
          return {
            tokens: this.credentials,
            res: r
          };
        } catch (e) {
          if (!(e instanceof Error)) {
            throw e;
          }
          let t = 0;
          let n = "";
          if (e instanceof IUd.GaxiosError) {
            t = e?.response?.data?.error?.status;
            n = e?.response?.data?.error?.message;
          }
          if (t && n) {
            throw e.message = `${t}: unable to impersonate: ${n}`, e;
          } else {
            throw e.message = `unable to impersonate: ${e}`, e;
          }
        }
      }
      async fetchIdToken(e, t) {
        await this.sourceClient.getAccessToken();
        let n = `projects/-/serviceAccounts/${this.targetPrincipal}`;
        let r = `${this.endpoint}/v1/${n}:generateIdToken`;
        let o = {
          delegates: this.delegates,
          audience: e,
          includeEmail: t?.includeEmail ?? true,
          useEmailAzp: t?.includeEmail ?? true
        };
        return (await this.sourceClient.request({
          ...PBt.RETRY_CONFIG,
          url: r,
          data: o,
          method: "POST"
        })).data.token;
      }
    }
    Nit.Impersonated = PBt;
  });
  var RKr = __commonJS(OBt => {
    Object.defineProperty(OBt, "__esModule", {
      value: true
    });
    OBt.OAuthClientAuthHandler = undefined;
    OBt.getErrorFromOAuthErrorResponse = MUd;
    var Lit = LF();
    var OUd = kBt();
    var DUd = ["PUT", "POST", "PATCH"];
    class OIi {
      #e = (0, OUd.createCrypto)();
      #t;
      transporter;
      constructor(e) {
        if (e && "clientId" in e) {
          this.#t = e;
          this.transporter = new Lit.Gaxios();
        } else {
          this.#t = e?.clientAuthentication;
          this.transporter = e?.transporter || new Lit.Gaxios();
        }
      }
      applyClientAuthenticationOptions(e, t) {
        if (e.headers = Lit.Gaxios.mergeHeaders(e.headers), this.injectAuthenticatedHeaders(e, t), !t) {
          this.injectAuthenticatedRequestBody(e);
        }
      }
      injectAuthenticatedHeaders(e, t) {
        if (t) {
          e.headers = Lit.Gaxios.mergeHeaders(e.headers, {
            authorization: `Bearer ${t}`
          });
        } else if (this.#t?.confidentialClientType === "basic") {
          e.headers = Lit.Gaxios.mergeHeaders(e.headers);
          let n = this.#t.clientId;
          let r = this.#t.clientSecret || "";
          let o = this.#e.encodeBase64StringUtf8(`${n}:${r}`);
          Lit.Gaxios.mergeHeaders(e.headers, {
            authorization: `Basic ${o}`
          });
        }
      }
      injectAuthenticatedRequestBody(e) {
        if (this.#t?.confidentialClientType === "request-body") {
          let t = (e.method || "GET").toUpperCase();
          if (!DUd.includes(t)) {
            throw Error(`${t} HTTP method does not support ${this.#t.confidentialClientType} client authentication`);
          }
          let r = new Headers(e.headers).get("content-type");
          if (r?.startsWith("application/x-www-form-urlencoded") || e.data instanceof URLSearchParams) {
            let o = new URLSearchParams(e.data ?? "");
            o.append("client_id", this.#t.clientId);
            o.append("client_secret", this.#t.clientSecret || "");
            e.data = o;
          } else if (r?.startsWith("application/json")) {
            e.data = e.data || {};
            Object.assign(e.data, {
              client_id: this.#t.clientId,
              client_secret: this.#t.clientSecret || ""
            });
          } else {
            throw Error(`${r} content-types are not supported with ${this.#t.confidentialClientType} client authentication`);
          }
        }
      }
      static get RETRY_CONFIG() {
        return {
          retry: true,
          retryConfig: {
            httpMethodsToRetry: ["GET", "PUT", "POST", "HEAD", "OPTIONS", "DELETE"]
          }
        };
      }
    }
    OBt.OAuthClientAuthHandler = OIi;
    function MUd(e, t) {
      let {
        error: n,
        error_description: r,
        error_uri: o
      } = e;
      let s = `Error code ${n}`;
      if (typeof r < "u") {
        s += `: ${r}`;
      }
      if (typeof o < "u") {
        s += ` - ${o}`;
      }
      let i = Error(s);
      if (t) {
        let a = Object.keys(t);
        if (t.stack) {
          a.push("stack");
        }
        a.forEach(l => {
          if (l !== "message") {
            Object.defineProperty(i, l, {
              value: t[l],
              writable: false,
              enumerable: true
            });
          }
        });
      }
      return i;
    }
  });
  var k0n = __commonJS(x0n => {
    Object.defineProperty(x0n, "__esModule", {
      value: true
    });
    x0n.StsCredentials = undefined;
    var NUd = LF();
    var LUd = w8();
    var DIi = RKr();
    var FUd = Dne();
    class xKr extends DIi.OAuthClientAuthHandler {
      #e;
      constructor(e = {
        tokenExchangeEndpoint: ""
      }, t) {
        if (typeof e !== "object" || e instanceof URL) {
          e = {
            tokenExchangeEndpoint: e,
            clientAuthentication: t
          };
        }
        super(e);
        this.#e = e.tokenExchangeEndpoint;
      }
      async exchangeToken(e, t, n) {
        let r = {
          grant_type: e.grantType,
          resource: e.resource,
          audience: e.audience,
          scope: e.scope?.join(" "),
          requested_token_type: e.requestedTokenType,
          subject_token: e.subjectToken,
          subject_token_type: e.subjectTokenType,
          actor_token: e.actingParty?.actorToken,
          actor_token_type: e.actingParty?.actorTokenType,
          options: n && JSON.stringify(n)
        };
        let o = {
          ...xKr.RETRY_CONFIG,
          url: this.#e.toString(),
          method: "POST",
          headers: t,
          data: new URLSearchParams((0, FUd.removeUndefinedValuesInObject)(r)),
          responseType: "json"
        };
        LUd.AuthClient.setMethodName(o, "exchangeToken");
        this.applyClientAuthenticationOptions(o);
        try {
          let s = await this.transporter.request(o);
          let i = s.data;
          i.res = s;
          return i;
        } catch (s) {
          if (s instanceof NUd.GaxiosError && s.response) {
            throw (0, DIi.getErrorFromOAuthErrorResponse)(s.response.data, s);
          }
          throw s;
        }
      }
    }
    x0n.StsCredentials = xKr;
  });
  var lIe = __commonJS(aJ => {
    Object.defineProperty(aJ, "__esModule", {
      value: true
    });
    aJ.BaseExternalAccountClient = aJ.CLOUD_RESOURCE_MANAGER = aJ.EXTERNAL_ACCOUNT_TYPE = aJ.EXPIRATION_TIME_OFFSET = undefined;
    var UUd = LF();
    var BUd = require("stream");
    var kKr = w8();
    var $Ud = k0n();
    var MIi = Dne();
    var HUd = aKr();
    aJ.EXPIRATION_TIME_OFFSET = 300000;
    aJ.EXTERNAL_ACCOUNT_TYPE = "external_account";
    aJ.CLOUD_RESOURCE_MANAGER = "https://cloudresourcemanager.googleapis.com/v1/projects/";
    class A0n extends kKr.AuthClient {
      scopes;
      projectNumber;
      audience;
      subjectTokenType;
      stsCredential;
      clientAuth;
      credentialSourceType;
      cachedAccessToken;
      serviceAccountImpersonationUrl;
      serviceAccountImpersonationLifetime;
      workforcePoolUserProject;
      configLifetimeRequested;
      tokenUrl;
      cloudResourceManagerURL;
      supplierContext;
      #e = null;
      constructor(e) {
        super(e);
        let t = (0, MIi.originalOrCamelOptions)(e);
        let n = t.get("type");
        if (n && n !== aJ.EXTERNAL_ACCOUNT_TYPE) {
          throw Error(`Expected "${aJ.EXTERNAL_ACCOUNT_TYPE}" type but received "${e.type}"`);
        }
        let r = t.get("client_id");
        let o = t.get("client_secret");
        this.tokenUrl = t.get("token_url") ?? ("https://sts.{universeDomain}/v1/token").replace("{universeDomain}", this.universeDomain);
        let s = t.get("subject_token_type");
        let i = t.get("workforce_pool_user_project");
        let a = t.get("service_account_impersonation_url");
        let l = t.get("service_account_impersonation");
        let c = (0, MIi.originalOrCamelOptions)(l).get("token_lifetime_seconds");
        if (this.cloudResourceManagerURL = new URL(t.get("cloud_resource_manager_url") || `https://cloudresourcemanager.${this.universeDomain}/v1/projects/`), r) {
          this.clientAuth = {
            confidentialClientType: "basic",
            clientId: r,
            clientSecret: o
          };
        }
        this.stsCredential = new $Ud.StsCredentials({
          tokenExchangeEndpoint: this.tokenUrl,
          clientAuthentication: this.clientAuth
        });
        this.scopes = t.get("scopes") || ["https://www.googleapis.com/auth/cloud-platform"];
        this.cachedAccessToken = null;
        this.audience = t.get("audience");
        this.subjectTokenType = s;
        this.workforcePoolUserProject = i;
        let u = new RegExp("//iam\\.googleapis\\.com/locations/[^/]+/workforcePools/[^/]+/providers/.+");
        if (this.workforcePoolUserProject && !this.audience.match(u)) {
          throw Error("workforcePoolUserProject should not be set for non-workforce pool credentials.");
        }
        if (this.serviceAccountImpersonationUrl = a, this.serviceAccountImpersonationLifetime = c, this.serviceAccountImpersonationLifetime) {
          this.configLifetimeRequested = true;
        } else {
          this.configLifetimeRequested = false;
          this.serviceAccountImpersonationLifetime = 3600;
        }
        this.projectNumber = this.getProjectNumber(this.audience);
        this.supplierContext = {
          audience: this.audience,
          subjectTokenType: this.subjectTokenType,
          transporter: this.transporter
        };
      }
      getServiceAccountEmail() {
        if (this.serviceAccountImpersonationUrl) {
          if (this.serviceAccountImpersonationUrl.length > 256) {
            throw RangeError(`URL is too long: ${this.serviceAccountImpersonationUrl}`);
          }
          return /serviceAccounts\/(?<email>[^:]+):generateAccessToken$/.exec(this.serviceAccountImpersonationUrl)?.groups?.email || null;
        }
        return null;
      }
      setCredentials(e) {
        super.setCredentials(e);
        this.cachedAccessToken = e;
      }
      async getAccessToken() {
        if (!this.cachedAccessToken || this.isExpired(this.cachedAccessToken)) {
          await this.refreshAccessTokenAsync();
        }
        return {
          token: this.cachedAccessToken.access_token,
          res: this.cachedAccessToken.res
        };
      }
      async getRequestHeaders() {
        let e = await this.getAccessToken();
        let t = new Headers({
          authorization: `Bearer ${e.token}`
        });
        return this.addSharedMetadataHeaders(t);
      }
      request(e, t) {
        if (t) {
          this.requestAsync(e).then(n => t(null, n), n => t(n, n.response));
        } else {
          return this.requestAsync(e);
        }
      }
      async getProjectId() {
        let e = this.projectNumber || this.workforcePoolUserProject;
        if (this.projectId) {
          return this.projectId;
        } else if (e) {
          let t = await this.getRequestHeaders();
          let n = {
            ...A0n.RETRY_CONFIG,
            headers: t,
            url: `${this.cloudResourceManagerURL.toString()}${e}`,
            responseType: "json"
          };
          kKr.AuthClient.setMethodName(n, "getProjectId");
          let r = await this.transporter.request(n);
          this.projectId = r.data.projectId;
          return this.projectId;
        }
        return null;
      }
      async requestAsync(e, t = false) {
        let n;
        try {
          let r = await this.getRequestHeaders();
          e.headers = UUd.Gaxios.mergeHeaders(e.headers);
          this.addUserProjectAndAuthHeaders(e.headers, r);
          n = await this.transporter.request(e);
        } catch (r) {
          let o = r.response;
          if (o) {
            let s = o.status;
            let i = o.config.data instanceof BUd.Readable;
            if (!t && (s === 401 || s === 403) && !i && this.forceRefreshOnFailure) {
              await this.refreshAccessTokenAsync();
              return await this.requestAsync(e, true);
            }
          }
          throw r;
        }
        return n;
      }
      async refreshAccessTokenAsync() {
        this.#e = this.#e || this.#t();
        try {
          return await this.#e;
        } finally {
          this.#e = null;
        }
      }
      async #t() {
        let e = await this.retrieveSubjectToken();
        let t = {
          grantType: "urn:ietf:params:oauth:grant-type:token-exchange",
          audience: this.audience,
          requestedTokenType: "urn:ietf:params:oauth:token-type:access_token",
          subjectToken: e,
          subjectTokenType: this.subjectTokenType,
          scope: this.serviceAccountImpersonationUrl ? ["https://www.googleapis.com/auth/cloud-platform"] : this.getScopesArray()
        };
        let n = !this.clientAuth && this.workforcePoolUserProject ? {
          userProject: this.workforcePoolUserProject
        } : undefined;
        let r = new Headers({
          "x-goog-api-client": this.getMetricsHeaderValue()
        });
        let o = await this.stsCredential.exchangeToken(t, r, n);
        if (this.serviceAccountImpersonationUrl) {
          this.cachedAccessToken = await this.getImpersonatedAccessToken(o.access_token);
        } else if (o.expires_in) {
          this.cachedAccessToken = {
            access_token: o.access_token,
            expiry_date: new Date().getTime() + o.expires_in * 1000,
            res: o.res
          };
        } else {
          this.cachedAccessToken = {
            access_token: o.access_token,
            res: o.res
          };
        }
        this.credentials = {};
        Object.assign(this.credentials, this.cachedAccessToken);
        delete this.credentials.res;
        this.emit("tokens", {
          refresh_token: null,
          expiry_date: this.cachedAccessToken.expiry_date,
          access_token: this.cachedAccessToken.access_token,
          token_type: "Bearer",
          id_token: null
        });
        return this.cachedAccessToken;
      }
      getProjectNumber(e) {
        let t = e.match(/\/projects\/([^/]+)/);
        if (!t) {
          return null;
        }
        return t[1];
      }
      async getImpersonatedAccessToken(e) {
        let t = {
          ...A0n.RETRY_CONFIG,
          url: this.serviceAccountImpersonationUrl,
          method: "POST",
          headers: {
            "content-type": "application/json",
            authorization: `Bearer ${e}`
          },
          data: {
            scope: this.getScopesArray(),
            lifetime: this.serviceAccountImpersonationLifetime + "s"
          },
          responseType: "json"
        };
        kKr.AuthClient.setMethodName(t, "getImpersonatedAccessToken");
        let n = await this.transporter.request(t);
        let r = n.data;
        return {
          access_token: r.accessToken,
          expiry_date: new Date(r.expireTime).getTime(),
          res: n
        };
      }
      isExpired(e) {
        let t = new Date().getTime();
        return e.expiry_date ? t >= e.expiry_date - this.eagerRefreshThresholdMillis : false;
      }
      getScopesArray() {
        if (typeof this.scopes === "string") {
          return [this.scopes];
        }
        return this.scopes || ["https://www.googleapis.com/auth/cloud-platform"];
      }
      getMetricsHeaderValue() {
        let e = process.version.replace(/^v/, "");
        let t = this.serviceAccountImpersonationUrl !== undefined;
        let n = this.credentialSourceType ? this.credentialSourceType : "unknown";
        return `gl-node/${e} auth/${HUd.pkg.version} google-byoid-sdk source/${n} sa-impersonation/${t} config-lifetime/${this.configLifetimeRequested}`;
      }
      getTokenUrl() {
        return this.tokenUrl;
      }
    }
    aJ.BaseExternalAccountClient = A0n;
  });
  var LIi = __commonJS(I0n => {
    Object.defineProperty(I0n, "__esModule", {
      value: true
    });
    I0n.FileSubjectTokenSupplier = undefined;
    var IKr = require("util");
    var PKr = require("fs");
    var zUd = (0, IKr.promisify)(PKr.readFile ?? (() => {}));
    var KUd = (0, IKr.promisify)(PKr.realpath ?? (() => {}));
    var YUd = (0, IKr.promisify)(PKr.lstat ?? (() => {}));
    class NIi {
      filePath;
      formatType;
      subjectTokenFieldName;
      constructor(e) {
        this.filePath = e.filePath;
        this.formatType = e.formatType;
        this.subjectTokenFieldName = e.subjectTokenFieldName;
      }
      async getSubjectToken() {
        let e = this.filePath;
        try {
          if (e = await KUd(e), !(await YUd(e)).isFile()) {
            throw Error();
          }
        } catch (r) {
          if (r instanceof Error) {
            r.message = `The file at ${e} does not exist, or it is not a file. ${r.message}`;
          }
          throw r;
        }
        let t;
        let n = await zUd(e, {
          encoding: "utf8"
        });
        if (this.formatType === "text") {
          t = n;
        } else if (this.formatType === "json" && this.subjectTokenFieldName) {
          t = JSON.parse(n)[this.subjectTokenFieldName];
        }
        if (!t) {
          throw Error("Unable to parse the subject_token from the credential_source file");
        }
        return t;
      }
    }
    I0n.FileSubjectTokenSupplier = NIi;
  });
  var UIi = __commonJS(P0n => {
    Object.defineProperty(P0n, "__esModule", {
      value: true
    });
    P0n.UrlSubjectTokenSupplier = undefined;
    var JUd = w8();
    class FIi {
      url;
      headers;
      formatType;
      subjectTokenFieldName;
      additionalGaxiosOptions;
      constructor(e) {
        this.url = e.url;
        this.formatType = e.formatType;
        this.subjectTokenFieldName = e.subjectTokenFieldName;
        this.headers = e.headers;
        this.additionalGaxiosOptions = e.additionalGaxiosOptions;
      }
      async getSubjectToken(e) {
        let t = {
          ...this.additionalGaxiosOptions,
          url: this.url,
          method: "GET",
          headers: this.headers,
          responseType: this.formatType
        };
        JUd.AuthClient.setMethodName(t, "getSubjectToken");
        let n;
        if (this.formatType === "text") {
          n = (await e.transporter.request(t)).data;
        } else if (this.formatType === "json" && this.subjectTokenFieldName) {
          n = (await e.transporter.request(t)).data[this.subjectTokenFieldName];
        }
        if (!n) {
          throw Error("Unable to parse the subject_token from the credential_source URL");
        }
        return n;
      }
    }
    P0n.UrlSubjectTokenSupplier = FIi;
  });