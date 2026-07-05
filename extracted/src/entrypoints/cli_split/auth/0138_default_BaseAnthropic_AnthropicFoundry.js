  __export(B9r, {
    default: () => AnthropicFoundry,
    BaseAnthropic: () => BaseAnthropic,
    AnthropicFoundry: () => AnthropicFoundry
  });
  var $9r = __lazy(() => {
    U9r();
    U9r();
  });
  var AzureAuthorityHosts;
  var lFt;
  var Tbi;
  var rce = __lazy(() => {
    (function (e) {
      e.AzureChina = "https://login.chinacloudapi.cn";
      e.AzureGermany = "https://login.microsoftonline.de";
      e.AzureGovernment = "https://login.microsoftonline.us";
      e.AzurePublicCloud = "https://login.microsoftonline.com";
    })(AzureAuthorityHosts || (AzureAuthorityHosts = {}));
    lFt = AzureAuthorityHosts.AzurePublicCloud;
    Tbi = ["*"];
  });
  function KRd(e) {
    var t;
    var n;
    var r;
    var o;
    var s;
    var i;
    var a;
    let l = {
      cache: {},
      broker: {
        isEnabled: (n = (t = e.brokerOptions) === null || t === undefined ? undefined : t.enabled) !== null && n !== undefined ? n : false,
        enableMsaPassthrough: (o = (r = e.brokerOptions) === null || r === undefined ? undefined : r.legacyEnableMsaPassthrough) !== null && o !== undefined ? o : false,
        parentWindowHandle: (s = e.brokerOptions) === null || s === undefined ? undefined : s.parentWindowHandle
      }
    };
    if ((i = e.tokenCachePersistenceOptions) === null || i === undefined ? undefined : i.enabled) {
      if (Exn === undefined) {
        throw Error(["Persistent token caching was requested, but no persistence provider was configured.", "You must install the identity-cache-persistence plugin package (`npm install --save @azure/identity-cache-persistence`)", "and enable it by importing `useIdentityPlugin` from `@azure/identity` and calling", "`useIdentityPlugin(cachePersistencePlugin)` before using `tokenCachePersistenceOptions`."].join(" "));
      }
      let c = e.tokenCachePersistenceOptions.name || "msal.cache";
      l.cache.cachePlugin = Exn(Object.assign({
        name: `${c}.${"nocae"}`
      }, e.tokenCachePersistenceOptions));
      l.cache.cachePluginCae = Exn(Object.assign({
        name: `${c}.${"cae"}`
      }, e.tokenCachePersistenceOptions));
    }
    if ((a = e.brokerOptions) === null || a === undefined ? undefined : a.enabled) {
      if (H9r === undefined) {
        throw Error(["Broker for WAM was requested to be enabled, but no native broker was configured.", "You must install the identity-broker plugin package (`npm install --save @azure/identity-broker`)", "and enable it by importing `useIdentityPlugin` from `@azure/identity` and calling", "`useIdentityPlugin(createNativeBrokerPlugin())` before using `enableBroker`."].join(" "));
      }
      l.broker.nativeBrokerPlugin = H9r.broker;
    }
    return l;
  }
  var Exn = undefined;
  var Cbi;
  var H9r = undefined;
  var Rbi;
  var xbi;
  var j9r = __lazy(() => {
    rce();
    Cbi = {
      setPersistence(e) {
        Exn = e;
      }
    };
    Rbi = {
      setNativeBroker(e) {
        H9r = {
          broker: e
        };
      }
    };
    xbi = {
      generatePluginConfiguration: KRd
    };
  });
  function Pbi(e, ...t) {
    Ibi.stderr.write(`${Abi.default.format(e, ...t)}${kbi.EOL}`);
  }
  var kbi;
  var Abi;
  var Ibi;
  var Obi = __lazy(() => {
    kbi = require("os");
    Abi = __toESM(require("util"));
    Ibi = __toESM(require("process"));
  });
  function G9r(e) {
    Mbi = e;
    q9r = [];
    W9r = [];
    let t = /\*/g;
    let n = e.split(",").map(r => r.trim().replace(t, ".*?"));
    for (let r of n) {
      if (r.startsWith("-")) {
        W9r.push(new RegExp(`^${r.substr(1)}$`));
      } else {
        q9r.push(new RegExp(`^${r}$`));
      }
    }
    for (let r of vxn) {
      r.enabled = V9r(r.namespace);
    }
  }
  function V9r(e) {
    if (e.endsWith("*")) {
      return true;
    }
    for (let t of W9r) {
      if (t.test(e)) {
        return false;
      }
    }
    for (let t of q9r) {
      if (t.test(e)) {
        return true;
      }
    }
    return false;
  }
  function YRd() {
    let e = Mbi || "";
    G9r("");
    return e;
  }
  function Lbi(e) {
    let t = Object.assign(n, {
      enabled: V9r(e),
      destroy: JRd,
      log: Nbi.log,
      namespace: e,
      extend: XRd
    });
    function n(...r) {
      if (!t.enabled) {
        return;
      }
      if (r.length > 0) {
        r[0] = `${e} ${r[0]}`;
      }
      t.log(...r);
    }
    vxn.push(t);
    return t;
  }
  function JRd() {
    let e = vxn.indexOf(this);
    if (e >= 0) {
      vxn.splice(e, 1);
      return true;
    }
    return false;
  }
  function XRd(e) {
    let t = Lbi(`${this.namespace}:${e}`);
    t.log = this.log;
    return t;
  }
  var Dbi;
  var Mbi;
  var q9r;
  var W9r;
  var vxn;
  var Nbi;
  function Bbi(e, t) {
    t.log = (...n) => {
      e.log(...n);
    };
  }
  function $bi(e) {
    return z9r.includes(e);
  }
  function wxn(e) {
    let t = new Set();
    let n = typeof process < "u" && process.env && process.env[e.logLevelEnvVarName] || undefined;
    let r;
    let o = Nbi(e.namespace);
    o.log = (...u) => {
      Nbi.log(...u);
    };
    function s(u) {
      if (u && !$bi(u)) {
        throw Error(`Unknown log level '${u}'. Acceptable values: ${z9r.join(",")}`);
      }
      r = u;
      let d = [];
      for (let p of t) {
        if (i(p)) {
          d.push(p.namespace);
        }
      }
      Nbi.enable(d.join(","));
    }
    if (n) {
      if ($bi(n)) {
        s(n);
      } else {
        console.error(`${e.logLevelEnvVarName} set to unknown log level '${n}'; logging is not enabled. Acceptable values: ${z9r.join(", ")}.`);
      }
    }
    function i(u) {
      return Boolean(r && Ubi[u.level] <= Ubi[r]);
    }
    function a(u, d) {
      let p = Object.assign(u.extend(d), {
        level: d
      });
      if (Bbi(u, p), i(p)) {
        let m = Nbi.disable();
        Nbi.enable(m + "," + p.namespace);
      }
      t.add(p);
      return p;
    }
    function l() {
      return r;
    }
    function c(u) {
      let d = o.extend(u);
      Bbi(o, d);
      return {
        error: a(d, "error"),
        warning: a(d, "warning"),
        info: a(d, "info"),
        verbose: a(d, "verbose")
      };
    }
    return {
      setLogLevel: s,
      getLogLevel: l,
      createClientLogger: c,
      logger: o
    };
  }
  function Cxn(e) {
    return Hbi.createClientLogger(e);
  }
  var z9r;
  var Ubi;
  var Hbi;
  var vOg;
  var Rxn = __lazy(() => {
    z9r = ["verbose", "info", "warning", "error"];
    Ubi = {
      verbose: 400,
      info: 300,
      warning: 200,
      error: 100
    };
    Hbi = wxn({
      logLevelEnvVarName: "TYPESPEC_RUNTIME_LOG_LEVEL",
      namespace: "typeSpecRuntime"
    });
    vOg = Hbi.logger;
  });
  var jbi = __lazy(() => {
    Rxn();
  });
  function xxn() {
    return K9r.getLogLevel();
  }
  function x0e(e) {
    return K9r.createClientLogger(e);
  }
  var K9r;
  var kOg;
  var Kqe = __lazy(() => {
    jbi();
    K9r = wxn({
      logLevelEnvVarName: "AZURE_LOG_LEVEL",
      namespace: "azure"
    });
    kOg = K9r.logger;
  });
  function kxn(e) {
    return e.reduce((t, n) => {
      if (process.env[n]) {
        t.assigned.push(n);
      } else {
        t.missing.push(n);
      }
      return t;
    }, {
      missing: [],
      assigned: []
    });
  }
  function zP(e) {
    return `SUCCESS. Scopes: ${Array.isArray(e) ? e.join(", ") : e}.`;
  }
  function gg(e, t) {
    let n = "ERROR.";
    if (e === null || e === undefined ? undefined : e.length) {
      n += ` Scopes: ${Array.isArray(e) ? e.join(", ") : e}.`;
    }
    return `${n} Error message: ${typeof t === "string" ? t : t.message}.`;
  }
  function qbi(e, t, n = logger) {
    let r = t ? `${t.fullTitle} ${e}` : e;
    function o(l) {
      n.info(`${r} =>`, l);
    }
    function s(l) {
      n.warning(`${r} =>`, l);
    }
    function i(l) {
      n.verbose(`${r} =>`, l);
    }
    function a(l) {
      n.error(`${r} =>`, l);
    }
    return {
      title: e,
      fullTitle: r,
      info: o,
      warning: s,
      verbose: i,
      error: a
    };
  }
  function om(e, t = logger) {
    let n = qbi(e, undefined, t);
    return Object.assign(Object.assign({}, n), {
      parent: t,
      getToken: qbi("=> getToken()", n, t)
    });
  }
  var logger;
  var KT = __lazy(() => {
    Kqe();
    logger = x0e("identity");
  });
  function QRd(e) {
    return e && typeof e.error === "string" && typeof e.error_description === "string";
  }
  function Wbi(e) {
    return {
      error: e.error,
      errorDescription: e.error_description,
      correlationId: e.correlation_id,
      errorCodes: e.error_codes,
      timestamp: e.timestamp,
      traceId: e.trace_id
    };
  }
  var CredentialUnavailableError;
  var AuthenticationError;
  var AggregateAuthenticationError;
  var AuthenticationRequiredError;
  var XD = __lazy(() => {
    CredentialUnavailableError = class _l extends Error {
      constructor(e, t) {
        super(e, t);
        this.name = "CredentialUnavailableError";
      }
    };
    AuthenticationError = class bne extends Error {
      constructor(e, t, n) {
        let r = {
          error: "unknown",
          errorDescription: "An unknown error occurred and no additional details are available."
        };
        if (QRd(t)) {
          r = Wbi(t);
        } else if (typeof t === "string") {
          try {
            let o = JSON.parse(t);
            r = Wbi(o);
          } catch (o) {
            if (e === 400) {
              r = {
                error: "invalid_request",
                errorDescription: `The service indicated that the request was invalid.

${t}`
              };
            } else {
              r = {
                error: "unknown_error",
                errorDescription: `An unknown error has occurred. Response body:

${t}`
              };
            }
          }
        } else {
          r = {
            error: "unknown_error",
            errorDescription: "An unknown error occurred and no additional details are available."
          };
        }
        super(`${r.error} Status code: ${e}
More details:
${r.errorDescription},`, n);
        this.statusCode = e;
        this.errorResponse = r;
        this.name = "AuthenticationError";
      }
    };
    AggregateAuthenticationError = class uFt extends Error {
      constructor(e, t) {
        let n = e.join(`
`);
        super(`${t}
${n}`);
        this.errors = e;
        this.name = "AggregateAuthenticationError";
      }
    };
    AuthenticationRequiredError = class Sne extends Error {
      constructor(e) {
        super(e.message, e.cause ? {
          cause: e.cause
        } : undefined);
        this.scopes = e.scopes;
        this.getTokenOptions = e.getTokenOptions;
        this.name = "AuthenticationRequiredError";
      }
    };
  });
  function ZRd(e) {
    return `The current credential is not configured to acquire tokens for tenant ${e}. To enable acquiring tokens for this tenant add it to the AdditionallyAllowedTenants on the credential options, or add "*" to AdditionallyAllowedTenants to allow acquiring tokens for any tenant.`;
  }
  function kC(e, t, n = [], r) {
    var o;
    let s;
    if (process.env.AZURE_IDENTITY_DISABLE_MULTITENANTAUTH) {
      s = e;
    } else if (e === "adfs") {
      s = e;
    } else {
      s = (o = t === null || t === undefined ? undefined : t.tenantId) !== null && o !== undefined ? o : e;
    }
    if (e && s !== e && !n.includes("*") && !n.some(i => i.localeCompare(s) === 0)) {
      let i = ZRd(s);
      throw r === null || r === undefined || r.info(i), new CredentialUnavailableError(i);
    }
    return s;
  }
  var Gbi = __lazy(() => {
    XD();
  });
  function KP(e, t) {
    if (!t.match(/^[0-9a-zA-Z-.]+$/)) {
      let n = Error("Invalid tenant id provided. You can locate your tenant id by following the instructions listed here: https://learn.microsoft.com/partner-center/find-ids-and-domain-names.");
      throw e.info(gg("", n)), n;
    }
  }
  function Nst(e, t, n) {
    if (t) {
      KP(e, t);
      return t;
    }
    if (!n) {
      n = "04b07795-8ddb-461a-bbee-02f9e1bf7b46";
    }
    if (n !== "04b07795-8ddb-461a-bbee-02f9e1bf7b46") {
      return "common";
    }
    return "organizations";
  }
  function ex(e) {
    if (!e || e.length === 0) {
      return [];
    }
    if (e.includes("*")) {
      return Tbi;
    }
    return e;
  }
  var QD = __lazy(() => {
    rce();
    KT();
    Gbi();
  });
  function Axn(e) {
    return e.toLowerCase();
  }
  function* exd(e) {
    for (let t of e.values()) {
      yield [t.name, t.value];
    }
  }
  function oce(e) {
    return new Vbi(e);
  }
  var Vbi;
  var dFt = __lazy(() => {
    Vbi = class Vbi {
      constructor(e) {
        if (this._headersMap = new Map(), e) {
          for (let t of Object.keys(e)) {
            this.set(t, e[t]);
          }
        }
      }
      set(e, t) {
        this._headersMap.set(Axn(e), {
          name: e,
          value: String(t).trim()
        });
      }
      get(e) {
        var t;
        return (t = this._headersMap.get(Axn(e))) === null || t === undefined ? undefined : t.value;
      }
      vZc(e) {
        return this._headersMap.vZc(Axn(e));
      }
      delete(e) {
        this._headersMap.delete(Axn(e));
      }
      toJSON(e = {}) {
        let t = {};
        if (e.preserveCase) {
          for (let n of this._headersMap.values()) {
            t[n.name] = n.value;
          }
        } else {
          for (let [n, r] of this._headersMap) {
            t[n] = r.value;
          }
        }
        return t;
      }
      toString() {
        return JSON.stringify(this.toJSON({
          preserveCase: true
        }));
      }
      [Symbol.iterator]() {
        return exd(this._headersMap);
      }
    };
  });
  var zbi = () => {};
  var Kbi = () => {};
  function pFt() {
    return txd();
  }
  var Ybi;
  var X9r;
  var txd;
  var Q9r = __lazy(() => {
    Ybi = require("crypto");
    txd = typeof ((X9r = globalThis === null || globalThis === undefined ? undefined : globalThis.crypto) === null || X9r === undefined ? undefined : X9r.randomUUID) === "function" ? globalThis.crypto.randomUUID.bind(globalThis.crypto) : Ybi.randomUUID;
  });
  class Jbi {
    constructor(e) {
      var t;
      var n;
      var r;
      var o;
      var s;
      var i;
      var a;
      this.url = e.url;
      this.body = e.body;
      this.headers = (t = e.headers) !== null && t !== undefined ? t : oce();
      this.method = (n = e.method) !== null && n !== undefined ? n : "GET";
      this.timeout = (r = e.timeout) !== null && r !== undefined ? r : 0;
      this.multipartBody = e.multipartBody;
      this.formData = e.formData;
      this.disableKeepAlive = (o = e.disableKeepAlive) !== null && o !== undefined ? o : false;
      this.proxySettings = e.proxySettings;
      this.streamResponseStatusCodes = e.streamResponseStatusCodes;
      this.withCredentials = (s = e.withCredentials) !== null && s !== undefined ? s : false;
      this.abortSignal = e.abortSignal;
      this.onUploadProgress = e.onUploadProgress;
      this.onDownloadProgress = e.onDownloadProgress;
      this.requestId = e.requestId || pFt();
      this.allowInsecureConnection = (i = e.allowInsecureConnection) !== null && i !== undefined ? i : false;
      this.enableBrowserStreams = (a = e.enableBrowserStreams) !== null && a !== undefined ? a : false;
      this.requestOverrides = e.requestOverrides;
      this.authSchemes = e.authSchemes;
    }
  }
  function Z9r(e) {
    return new Jbi(e);
  }
  var Xbi = __lazy(() => {
    dFt();
    Q9r();
  });
  class Ixn {
    constructor(e) {
      var t;
      this._policies = [];
      this._policies = (t = e === null || e === undefined ? undefined : e.slice(0)) !== null && t !== undefined ? t : [];
      this._orderedPolicies = undefined;
    }
    addPolicy(e, t = {}) {
      if (t.phase && t.afterPhase) {
        throw Error("Policies inside a phase cannot specify afterPhase.");
      }
      if (t.phase && !Qbi.vZc(t.phase)) {
        throw Error(`Invalid phase name: ${t.phase}`);
      }
      if (t.afterPhase && !Qbi.vZc(t.afterPhase)) {
        throw Error(`Invalid afterPhase name: ${t.afterPhase}`);
      }
      this._policies.push({
        policy: e,
        options: t
      });
      this._orderedPolicies = undefined;
    }
    removePolicy(e) {
      let t = [];
      this._policies = this._policies.filter(n => {
        if (e.name && n.policy.name === e.name || e.phase && n.options.phase === e.phase) {
          t.push(n.policy);
          return false;
        } else {
          return true;
        }
      });
      this._orderedPolicies = undefined;
      return t;
    }
    sendRequest(e, t) {
      return this.getOrderedPolicies().reduceRight((o, s) => i => s.sendRequest(i, o), o => e.sendRequest(o))(t);
    }
    getOrderedPolicies() {
      if (!this._orderedPolicies) {
        this._orderedPolicies = this.orderPolicies();
      }
      return this._orderedPolicies;
    }
    clone() {
      return new Ixn(this._policies);
    }
    static create() {
      return new Ixn();
    }
    orderPolicies() {
      let e = [];
      let t = new Map();
      function n(m) {
        return {
          name: m,
          policies: new Set(),
          hasRun: false,
          hasAfterPolicies: false
        };
      }
      let r = n("Serialize");
      let o = n("None");
      let s = n("Deserialize");
      let i = n("Retry");
      let a = n("Sign");
      let l = [r, o, s, i, a];
      function c(m) {
        if (m === "Retry") {
          return i;
        } else if (m === "Serialize") {
          return r;
        } else if (m === "Deserialize") {
          return s;
        } else if (m === "Sign") {
          return a;
        } else {
          return o;
        }
      }
      for (let m of this._policies) {
        let {
          policy: f,
          options: h
        } = m;
        let g = f.name;
        if (t.vZc(g)) {
          throw Error("Duplicate policy names not allowed in pipeline");
        }
        let y = {
          policy: f,
          dependsOn: new Set(),
          dependants: new Set()
        };
        if (h.afterPhase) {
          y.afterPhase = c(h.afterPhase);
          y.afterPhase.hasAfterPolicies = true;
        }
        t.set(g, y);
        c(h.phase).policies.add(y);
      }
      for (let m of this._policies) {
        let {
          policy: f,
          options: h
        } = m;
        let g = f.name;
        let y = t.get(g);
        if (!y) {
          throw Error(`Missing node for policy ${g}`);
        }
        if (h.afterPolicies) {
          for (let _ of h.afterPolicies) {
            let b = t.get(_);
            if (b) {
              y.dependsOn.add(b);
              b.dependants.add(y);
            }
          }
        }
        if (h.beforePolicies) {
          for (let _ of h.beforePolicies) {
            let b = t.get(_);
            if (b) {
              b.dependsOn.add(y);
              y.dependants.add(b);
            }
          }
        }
      }
      function u(m) {
        m.hasRun = true;
        for (let f of m.policies) {
          if (f.afterPhase && (!f.afterPhase.hasRun || f.afterPhase.policies.size)) {
            continue;
          }
          if (f.dependsOn.size === 0) {
            e.push(f.policy);
            for (let h of f.dependants) {
              h.dependsOn.delete(f);
            }
            t.delete(f.policy.name);
            m.policies.delete(f);
          }
        }
      }
      function d() {
        for (let m of l) {
          if (u(m), m.policies.size > 0 && m !== o) {
            if (!o.hasRun) {
              u(o);
            }
            return;
          }
          if (m.hasAfterPolicies) {
            u(o);
          }
        }
      }
      let p = 0;
      while (t.size > 0) {
        p++;
        let m = e.length;
        if (d(), e.length <= m && p > 1) {
          throw Error("Cannot satisfy policy dependencies due to requirements cycle.");
        }
      }
      return e;
    }
  }
  function e5r() {
    return Ixn.create();
  }
  var Qbi;
  var Zbi = __lazy(() => {
    Qbi = new Set(["Deserialize", "Serialize", "Retry", "Sign"]);
  });
  function mFt(e) {
    return typeof e === "object" && e !== null && !Array.isArray(e) && !(e instanceof RegExp) && !(e instanceof Date);
  }
  function Yqe(e) {
    if (mFt(e)) {
      let t = typeof e.name === "string";
      let n = typeof e.message === "string";
      return t && n;
    }
    return false;
  }
  var t5r = () => {};
  var eSi;
  var tSi;
  var nSi = __lazy(() => {
    eSi = require("util");
    tSi = eSi.inspect.custom;
  });
  class sce {
    constructor({
      additionalAllowedHeaderNames: e = [],
      additionalAllowedQueryParameters: t = []
    } = {}) {
      e = nxd.concat(e);
      t = rxd.concat(t);
      this.allowedHeaderNames = new Set(e.map(n => n.toLowerCase()));
      this.allowedQueryParameters = new Set(t.map(n => n.toLowerCase()));
    }
    sanitize(e) {
      let t = new Set();
      return JSON.stringify(e, (n, r) => {
        if (r instanceof Error) {
          return Object.assign(Object.assign({}, r), {
            name: r.name,
            message: r.message
          });
        }
        if (n === "headers") {
          return this.sanitizeHeaders(r);
        } else if (n === "url") {
          return this.sanitizeUrl(r);
        } else if (n === "query") {
          return this.sanitizeQuery(r);
        } else if (n === "body") {
          return;
        } else if (n === "response") {
          return;
        } else if (n === "operationSpec") {
          return;
        } else if (Array.isArray(r) || mFt(r)) {
          if (t.vZc(r)) {
            return "[Circular]";
          }
          t.add(r);
        }
        return r;
      }, 2);
    }
    sanitizeUrl(e) {
      if (typeof e !== "string" || e === null || e === "") {
        return e;
      }
      let t = new URL(e);
      if (!t.search) {
        return e;
      }
      for (let [n] of t.searchParams) {
        if (!this.allowedQueryParameters.vZc(n.toLowerCase())) {
          t.searchParams.set(n, "REDACTED");
        }
      }
      return t.toString();
    }
    sanitizeHeaders(e) {
      let t = {};
      for (let n of Object.keys(e)) {
        if (this.allowedHeaderNames.vZc(n.toLowerCase())) {
          t[n] = e[n];
        } else {
          t[n] = "REDACTED";
        }
      }
      return t;
    }
    sanitizeQuery(e) {
      if (typeof e !== "object" || e === null) {
        return e;
      }
      let t = {};
      for (let n of Object.keys(e)) {
        if (this.allowedQueryParameters.vZc(n.toLowerCase())) {
          t[n] = e[n];
        } else {
          t[n] = "REDACTED";
        }
      }
      return t;
    }
  }
  var nxd;
  var rxd;
  var fFt = __lazy(() => {
    nxd = ["x-ms-client-request-id", "x-ms-return-client-request-id", "x-ms-useragent", "x-ms-correlation-request-id", "x-ms-request-id", "client-request-id", "ms-cv", "return-client-request-id", "traceparent", "Access-Control-Allow-Credentials", "Access-Control-Allow-Headers", "Access-Control-Allow-Methods", "Access-Control-Allow-Origin", "Access-Control-Expose-Headers", "Access-Control-Max-Age", "Access-Control-Request-Headers", "Access-Control-Request-Method", "Origin", "Accept", "Accept-Encoding", "Cache-Control", "Connection", "Content-Length", "Content-Type", "Date", "ETag", "Expires", "If-Match", "If-Modified-Since", "If-None-Match", "If-Unmodified-Since", "Last-Modified", "Pragma", "Request-Id", "Retry-After", "Server", "Transfer-Encoding", "User-Agent", "WWW-Authenticate"];
    rxd = ["api-version"];
  });
  function r5r(e) {
    if (e instanceof NW) {
      return true;
    }
    return Yqe(e) && e.name === "RestError";
  }
  var oxd;
  var NW;
  var o5r = __lazy(() => {
    t5r();
    nSi();
    fFt();
    oxd = new sce();
    NW = class NW extends Error {
      constructor(e, t = {}) {
        super(e);
        this.name = "RestError";
        this.code = t.code;
        this.statusCode = t.statusCode;
        Object.defineProperty(this, "request", {
          value: t.request,
          enumerable: false
        });
        Object.defineProperty(this, "response", {
          value: t.response,
          enumerable: false
        });
        Object.defineProperty(this, tSi, {
          value: () => `RestError: ${this.message} 
 ${oxd.sanitize(Object.assign(Object.assign({}, this), {
            request: this.request,
            response: this.response
          }))}`,
          enumerable: false
        });
        Object.setPrototypeOf(this, NW.prototype);
      }
    };
    NW.REQUEST_SEND_ERROR = "REQUEST_SEND_ERROR";
    NW.PARSE_ERROR = "PARSE_ERROR";
  });
  var k0e;
  var Pxn = __lazy(() => {
    k0e = class k0e extends Error {
      constructor(e) {
        super(e);
        this.name = "AbortError";
      }
    };
  });
  var Tne;
  var Oxn = __lazy(() => {
    Rxn();
    Tne = Cxn("ts-http-runtime");
  });
  function hFt(e) {
    return e && typeof e.pipe === "function";
  }
  function rSi(e) {
    if (e.readable === false) {
      return Promise.resolve();
    }
    return new Promise(t => {
      let n = () => {
        t();
        e.removeListener("close", n);
        e.removeListener("end", n);
        e.removeListener("error", n);
      };
      e.on("close", n);
      e.on("end", n);
      e.on("error", n);
    });
  }
  function sSi(e) {
    return e && typeof e.byteLength === "number";
  }
  class iSi {
    constructor() {
      this.cachedHttpsAgents = new WeakMap();
    }
    async sendRequest(e) {
      var t;
      var n;
      var r;
      let o = new AbortController();
      let s;
      if (e.abortSignal) {
        if (e.abortSignal.aborted) {
          throw new k0e("The operation was aborted. Request has already been canceled.");
        }
        s = d => {
          if (d.type === "abort") {
            o.abort();
          }
        };
        e.abortSignal.addEventListener("abort", s);
      }
      let i;
      if (e.timeout > 0) {
        i = setTimeout(() => {
          let d = new sce();
          Tne.info(`request to '${d.sanitizeUrl(e.url)}' timed out. canceling...`);
          o.abort();
        }, e.timeout);
      }
      let a = e.headers.get("Accept-Encoding");
      let l = (a === null || a === undefined ? undefined : a.includes("gzip")) || (a === null || a === undefined ? undefined : a.includes("deflate"));
      let c = typeof e.body === "function" ? e.body() : e.body;
      if (c && !e.headers.vZc("Content-Length")) {
        let d = cxd(c);
        if (d !== null) {
          e.headers.set("Content-Length", d);
        }
      }
      let u;
      try {
        if (c && e.onUploadProgress) {
          let g = e.onUploadProgress;
          let y = new s5r(g);
          if (y.on("error", _ => {
            Tne.error("Error in upload progress", _);
          }), hFt(c)) {
            c.pipe(y);
          } else {
            y.end(c);
          }
          c = y;
        }
        let d = await this.makeRequest(e, o, c);
        if (i !== undefined) {
          clearTimeout(i);
        }
        let p = ixd(d);
        let f = {
          status: (t = d.statusCode) !== null && t !== undefined ? t : 0,
          headers: p,
          request: e
        };
        if (e.method === "HEAD") {
          d.resume();
          return f;
        }
        u = l ? axd(d, p) : d;
        let h = e.onDownloadProgress;
        if (h) {
          let g = new s5r(h);
          g.on("error", y => {
            Tne.error("Error in download progress", y);
          });
          u.pipe(g);
          u = g;
        }
        if (((n = e.streamResponseStatusCodes) === null || n === undefined ? undefined : n.vZc(Number.POSITIVE_INFINITY)) || ((r = e.streamResponseStatusCodes) === null || r === undefined ? undefined : r.vZc(f.status))) {
          f.readableStreamBody = u;
        } else {
          f.bodyAsText = await lxd(u);
        }
        return f;
      } finally {
        if (e.abortSignal && s) {
          let d = Promise.resolve();
          if (hFt(c)) {
            d = rSi(c);
          }
          let p = Promise.resolve();
          if (hFt(u)) {
            p = rSi(u);
          }
          Promise.all([d, p]).then(() => {
            var m;
            if (s) {
              (m = e.abortSignal) === null || m === undefined || m.removeEventListener("abort", s);
            }
          }).catch(m => {
            Tne.warning("Error when cleaning up abortListener on httpRequest", m);
          });
        }
      }
    }
    makeRequest(e, t, n) {
      var r;
      let o = new URL(e.url);
      let s = o.protocol !== "https:";
      if (s && !e.allowInsecureConnection) {
        throw Error(`Cannot connect to ${e.url} while allowInsecureConnection is false.`);
      }
      let i = (r = e.agent) !== null && r !== undefined ? r : this.getOrCreateAgent(e, s);
      let a = Object.assign({
        agent: i,
        hostname: o.hostname,
        path: `${o.pathname}${o.search}`,
        port: o.port,
        method: e.method,
        headers: e.headers.toJSON({
          preserveCase: true
        })
      }, e.requestOverrides);
      return new Promise((l, c) => {
        let u = s ? Lst.request(a, l) : Fst.request(a, l);
        if (u.once("error", d => {
          var p;
          c(new NW(d.message, {
            code: (p = d.code) !== null && p !== undefined ? p : NW.REQUEST_SEND_ERROR,
            request: e
          }));
        }), t.signal.addEventListener("abort", () => {
          let d = new k0e("The operation was aborted. Rejecting from abort signal callback while making request.");
          u.destroy(d);
          c(d);
        }), n && hFt(n)) {
          n.pipe(u);
        } else if (n) {
          if (typeof n === "string" || Buffer.isBuffer(n)) {
            u.end(n);
          } else if (sSi(n)) {
            u.end(ArrayBuffer.isView(n) ? Buffer.from(n.buffer) : Buffer.from(n));
          } else {
            Tne.error("Unrecognized body type", n);
            c(new NW("Unrecognized body type"));
          }
        } else {
          u.end();
        }
      });
    }
    getOrCreateAgent(e, t) {
      var n;
      let r = e.disableKeepAlive;
      if (t) {
        if (r) {
          return Lst.globalAgent;
        }
        if (!this.cachedHttpAgent) {
          this.cachedHttpAgent = new Lst.Agent({
            keepAlive: true
          });
        }
        return this.cachedHttpAgent;
      } else {
        if (r && !e.tlsSettings) {
          return Fst.globalAgent;
        }
        let o = (n = e.tlsSettings) !== null && n !== undefined ? n : sxd;
        let s = this.cachedHttpsAgents.get(o);
        if (s && s.options.keepAlive === !r) {
          return s;
        }
        Tne.info("No cached TLS Agent exist, creating a new Agent");
        s = new Fst.Agent(Object.assign({
          keepAlive: !r
        }, o));
        this.cachedHttpsAgents.set(o, s);
        return s;
      }
    }
  }
  function ixd(e) {
    let t = oce();
    for (let n of Object.keys(e.headers)) {
      let r = e.headers[n];
      if (Array.isArray(r)) {
        if (r.length > 0) {
          t.set(n, r[0]);
        }
      } else if (r) {
        t.set(n, r);
      }
    }
    return t;
  }
  function axd(e, t) {
    let n = t.get("Content-Encoding");
    if (n === "gzip") {
      let r = Dxn.createGunzip();
      e.pipe(r);
      return r;
    } else if (n === "deflate") {
      let r = Dxn.createInflate();
      e.pipe(r);
      return r;
    }
    return e;
  }
  function lxd(e) {
    return new Promise((t, n) => {
      let r = [];
      e.on("data", o => {
        if (Buffer.isBuffer(o)) {
          r.push(o);
        } else {
          r.push(Buffer.from(o));
        }
      });
      e.on("end", () => {
        t(Buffer.concat(r).toString("utf8"));
      });
      e.on("error", o => {
        if (o && (o === null || o === undefined ? undefined : o.name) === "AbortError") {
          n(o);
        } else {
          n(new NW(`Error reading response as text: ${o.message}`, {
            code: NW.PARSE_ERROR
          }));
        }
      });
    });
  }
  function cxd(e) {
    if (!e) {
      return 0;
    } else if (Buffer.isBuffer(e)) {
      return e.length;
    } else if (hFt(e)) {
      return null;
    } else if (sSi(e)) {
      return e.byteLength;
    } else if (typeof e === "string") {
      return Buffer.from(e).length;
    } else {
      return null;
    }
  }
  function aSi() {
    return new iSi();
  }
  var Lst;
  var Fst;
  var Dxn;
  var oSi;
  var sxd;
  var s5r;
  var lSi = __lazy(() => {
    Pxn();
    dFt();
    o5r();
    Oxn();
    fFt();
    Lst = __toESM(require("http"));
    Fst = __toESM(require("https"));
    Dxn = __toESM(require("zlib"));
    oSi = require("stream");
    sxd = {};
    s5r = class s5r extends oSi.Transform {
      _transform(e, t, n) {
        this.push(e);
        this.loadedBytes += e.length;
        try {
          this.progressCallback({
            loadedBytes: this.loadedBytes
          });
          n();
        } catch (r) {
          n(r);
        }
      }
      constructor(e) {
        super();
        this.loadedBytes = 0;
        this.progressCallback = e;
      }
    };
  });
  function i5r() {
    return aSi();
  }
  var cSi = __lazy(() => {
    lSi();
  });
  var Ust = __lazy(() => {
    dFt();
    Xbi();
    Zbi();
    o5r();
    cSi();
    zbi();
    Kbi();
  });
  function gFt() {
    return e5r();
  }
  var a5r = __lazy(() => {
    Ust();
  });
  var P_e;
  var Nxn = __lazy(() => {
    Kqe();
    P_e = x0e("core-rest-pipeline");
  });
  function l5r(e) {
    return {
      name: "agentPolicy",
      sendRequest: async (t, n) => {
        if (!t.agent) {
          t.agent = e;
        }
        return n(t);
      }
    };
  }
  function c5r() {
    return {
      name: "decompressResponsePolicy",
      async sendRequest(e, t) {
        if (e.method !== "HEAD") {
          e.headers.set("Accept-Encoding", "gzip,deflate");
        }
        return t(e);
      }
    };
  }
  function u5r(e, t) {
    e = Math.ceil(e);
    t = Math.floor(t);
    return Math.floor(Math.random() * (t - e + 1)) + e;
  }
  function yFt(e, t) {
    let n = t.retryDelayInMs * Math.pow(2, e);
    let r = Math.min(t.maxRetryDelayInMs, n);
    return {
      retryAfterInMs: r / 2 + u5r(0, r / 2)
    };
  }
  var d5r = () => {};
  function dSi(e, t, n) {
    return new Promise((r, o) => {
      let s = undefined;
      let i = undefined;
      let a = () => o(new k0e((n === null || n === undefined ? undefined : n.abortErrorMsg) ? n === null || n === undefined ? undefined : n.abortErrorMsg : "The operation was aborted."));
      let l = () => {
        if ((n === null || n === undefined ? undefined : n.abortSignal) && i) {
          n.abortSignal.removeEventListener("abort", i);
        }
      };
      if (i = () => {
        if (s) {
          clearTimeout(s);
        }
        l();
        return a();
      }, (n === null || n === undefined ? undefined : n.abortSignal) && n.abortSignal.aborted) {
        return a();
      }
      if (s = setTimeout(() => {
        l();
        r(t);
      }, e), n === null || n === undefined ? undefined : n.abortSignal) {
        n.abortSignal.addEventListener("abort", i);
      }
    });
  }
  function pSi(e, t) {
    let n = e.headers.get(t);
    if (!n) {
      return;
    }
    let r = Number(n);
    if (Number.isNaN(r)) {
      return;
    }
    return r;
  }
  var p5r = __lazy(() => {
    Pxn();
  });
  function mSi(e) {
    if (!(e && [429, 503].includes(e.status))) {
      return;
    }
    try {
      for (let o of hxd) {
        let s = pSi(e, o);
        if (s === 0 || s) {
          return s * (o === "Retry-After" ? 1000 : 1);
        }
      }
      let t = e.headers.get("Retry-After");
      if (!t) {
        return;
      }
      let r = Date.parse(t) - Date.now();
      return Number.isFinite(r) ? Math.max(0, r) : undefined;
    } catch (t) {
      return;
    }
  }
  function fSi(e) {
    return Number.isFinite(mSi(e));
  }
  function hSi() {
    return {
      name: "throttlingRetryStrategy",
      retry({
        response: e
      }) {
        let t = mSi(e);
        if (!Number.isFinite(t)) {
          return {
            skipStrategy: true
          };
        }
        return {
          retryAfterInMs: t
        };
      }
    };
  }
  var hxd;
  var f5r = __lazy(() => {
    p5r();
    hxd = ["retry-after-ms", "x-ms-retry-after-ms", "Retry-After"];
  });
  function gSi(e = {}) {
    var t;
    var n;
    let r = (t = e.retryDelayInMs) !== null && t !== undefined ? t : 1000;
    let o = (n = e.maxRetryDelayInMs) !== null && n !== undefined ? n : 64000;
    return {
      name: "exponentialRetryStrategy",
      retry({
        retryCount: s,
        response: i,
        responseError: a
      }) {
        let l = bxd(a);
        let c = l && e.ignoreSystemErrors;
        let u = _xd(i);
        let d = u && e.ignoreHttpStatusCodes;
        if (i && (fSi(i) || !u) || d || c) {
          return {
            skipStrategy: true
          };
        }
        if (a && !l && !u) {
          return {
            errorToThrow: a
          };
        }
        return yFt(s, {
          retryDelayInMs: r,
          maxRetryDelayInMs: o
        });
      }
    };
  }
  function _xd(e) {
    return Boolean(e && e.status !== undefined && (e.status >= 500 || e.status === 408) && e.status !== 501 && e.status !== 505);
  }
  function bxd(e) {
    if (!e) {
      return false;
    }
    return e.code === "ETIMEDOUT" || e.code === "ESOCKETTIMEDOUT" || e.code === "ECONNREFUSED" || e.code === "ECONNRESET" || e.code === "ENOENT" || e.code === "ENOTFOUND";
  }
  var ySi = __lazy(() => {
    d5r();
    f5r();
  });
  function bFt(e, t = {
    maxRetries: 3
  }) {
    let n = t.logger || Sxd;
    return {
      name: "retryPolicy",
      async sendRequest(r, o) {
        var s;
        var i;
        let a;
        let l;
        let c = -1;
        e: while (true) {
          c += 1;
          a = undefined;
          l = undefined;
          try {
            n.info(`Retry ${c}: Attempting to send request`, r.requestId);
            a = await o(r);
            n.info(`Retry ${c}: Received a response from request`, r.requestId);
          } catch (u) {
            if (n.error(`Retry ${c}: Received an error from request`, r.requestId), l = u, !u || l.name !== "RestError") {
              throw u;
            }
            a = l.response;
          }
          if ((s = r.abortSignal) === null || s === undefined ? undefined : s.aborted) {
            throw n.error(`Retry ${c}: Request aborted.`), new k0e();
          }
          if (c >= ((i = t.maxRetries) !== null && i !== undefined ? i : 3)) {
            if (n.info(`Retry ${c}: Maximum retries reached. Returning the last received response, or throwing the last received error.`), l) {
              throw l;
            } else if (a) {
              return a;
            } else {
              throw Error("Maximum retries reached with no response or error to throw");
            }
          }
          n.info(`Retry ${c}: Processing ${e.length} retry strategies.`);
          t: for (let u of e) {
            let d = u.logger || n;
            d.info(`Retry ${c}: Processing retry strategy ${u.name}.`);
            let p = u.retry({
              retryCount: c,
              response: a,
              responseError: l
            });
            if (p.skipStrategy) {
              d.info(`Retry ${c}: Skipped.`);
              continue t;
            }
            let {
              errorToThrow: m,
              retryAfterInMs: f,
              redirectTo: h
            } = p;
            if (m) {
              throw d.error(`Retry ${c}: Retry strategy ${u.name} throws error:`, m), m;
            }
            if (f || f === 0) {
              d.info(`Retry ${c}: Retry strategy ${u.name} retries after ${f}`);
              await dSi(f, undefined, {
                abortSignal: r.abortSignal
              });
              continue e;
            }
            if (h) {
              d.info(`Retry ${c}: Retry strategy ${u.name} redirects to ${h}`);
              r.url = h;
              continue e;
            }
          }
          if (l) {
            throw n.info("None of the retry strategies could work with the received error. Throwing it."), l;
          }
          if (a) {
            n.info("None of the retry strategies could work with the received response. Returning it.");
            return a;
          }
        }
      }
    };
  }
  var Sxd;
  var h5r = __lazy(() => {
    p5r();
    Pxn();
    Rxn();
    Sxd = Cxn("ts-http-runtime retryPolicy");
  });
  function y5r(e = {}) {
    var t;
    return {
      name: "defaultRetryPolicy",
      sendRequest: bFt([hSi(), gSi(e)], {
        maxRetries: (t = e.maxRetries) !== null && t !== undefined ? t : 3
      }).sendRequest
    };
  }
  var _Si = __lazy(() => {
    ySi();
    f5r();
    h5r();
  });
  function ice(e, t) {
    return Buffer.from(e, t);
  }
  var _5r;
  var b5r;
  var S5r;
  var T5r;
  var bSi;
  var SSi;
  var TSi;
  var ESi;
  var Bst;
  var vSi;
  var E5r = __lazy(() => {
    bSi = typeof window < "u" && typeof window.document < "u";
    SSi = typeof self === "object" && typeof (self === null || self === undefined ? undefined : self.importScripts) === "function" && (((_5r = self.constructor) === null || _5r === undefined ? undefined : _5r.name) === "DedicatedWorkerGlobalScope" || ((b5r = self.constructor) === null || b5r === undefined ? undefined : b5r.name) === "ServiceWorkerGlobalScope" || ((S5r = self.constructor) === null || S5r === undefined ? undefined : S5r.name) === "SharedWorkerGlobalScope");
    TSi = typeof Deno < "u" && typeof Deno.version < "u" && typeof Deno.version.deno < "u";
    ESi = typeof Bun < "u" && typeof Bun.version < "u";
    Bst = typeof globalThis.process < "u" && Boolean(globalThis.process.version) && Boolean((T5r = globalThis.process.versions) === null || T5r === undefined ? undefined : T5r.node);
    vSi = typeof navigator < "u" && (navigator === null || navigator === undefined ? undefined : navigator.product) === "ReactNative";
  });
  function Exd(e) {
    var t;
    let n = {};
    for (let [r, o] of e.entries()) {
      (t = n[r]) !== null && t !== undefined || (n[r] = []);
      n[r].push(o);
    }
    return n;
  }
  function w5r() {
    return {
      name: "formDataPolicy",
      async sendRequest(e, t) {
        if (Bst && typeof FormData < "u" && e.body instanceof FormData) {
          e.formData = Exd(e.body);
          e.body = undefined;
        }
        if (e.formData) {
          let n = e.headers.get("Content-Type");
          if (n && n.indexOf("application/x-www-form-urlencoded") !== -1) {
            e.body = vxd(e.formData);
          } else {
            await wxd(e.formData, e);
          }
          e.formData = undefined;
        }
        return t(e);
      }
    };
  }
  function vxd(e) {
    let t = new URLSearchParams();
    for (let [n, r] of Object.entries(e)) {
      if (Array.isArray(r)) {
        for (let o of r) {
          t.append(n, o.toString());
        }
      } else {
        t.append(n, r.toString());
      }
    }
    return t.toString();
  }
  async function wxd(e, t) {
    let n = t.headers.get("Content-Type");
    if (n && !n.startsWith("multipart/form-data")) {
      return;
    }
    t.headers.set("Content-Type", n !== null && n !== undefined ? n : "multipart/form-data");
    let r = [];
    for (let [o, s] of Object.entries(e)) {
      for (let i of Array.isArray(s) ? s : [s]) {
        if (typeof i === "string") {
          r.push({
            headers: oce({
              "Content-Disposition": `form-data; name="${o}"`
            }),
            body: ice(i, "utf-8")
          });
        } else if (i === undefined || i === null || typeof i !== "object") {
          throw Error(`Unexpected value for key ${o}: ${i}. Value should be serialized to string first.`);
        } else {
          let a = i.name || "blob";
          let l = oce();
          l.set("Content-Disposition", `form-data; name="${o}"; filename="${a}"`);
          l.set("Content-Type", i.type || "application/octet-stream");
          r.push({
            headers: l,
            body: i
          });
        }
      }
    }
    t.multipartBody = {
      parts: r
    };
  }
  var wSi = __lazy(() => {
    E5r();
    dFt();
  });
  function R5r(e = {}) {
    var t;
    let n = (t = e.logger) !== null && t !== undefined ? t : Tne.info;
    let r = new sce({
      additionalAllowedHeaderNames: e.additionalAllowedHeaderNames,
      additionalAllowedQueryParameters: e.additionalAllowedQueryParameters
    });
    return {
      name: "logPolicy",
      async sendRequest(o, s) {
        if (!n.enabled) {
          return s(o);
        }
        n(`Request: ${r.sanitize(o)}`);
        let i = await s(o);
        n(`Response status code: ${i.status}`);
        n(`Headers: ${r.sanitize(i.headers)}`);
        return i;
      }
    };
  }
  var CSi = __lazy(() => {
    Oxn();
    fFt();
  });
  function Lxn(e) {
    return typeof e.stream === "function";
  }
  function RSi() {
    return Ljr(this, arguments, function* () {
      let t = this.getReader();
      try {
        while (true) {
          let {
            done: n,
            value: r
          } = yield nqe(t.read());
          if (n) {
            return yield nqe(undefined);
          }
          yield yield nqe(r);
        }
      } finally {
        t.releaseLock();
      }
    });
  }
  function Cxd(e) {
    if (!e[Symbol.asyncIterator]) {
      e[Symbol.asyncIterator] = RSi.bind(e);
    }
    if (!e.values) {
      e.values = RSi.bind(e);
    }
  }
  function xSi(e) {
    if (e instanceof ReadableStream) {
      Cxd(e);
      return Fxn.Readable.fromWeb(e);
    } else {
      return e;
    }
  }
  function Rxd(e) {
    if (e instanceof Uint8Array) {
      return Fxn.Readable.from(Buffer.from(e));
    } else if (Lxn(e)) {
      return xSi(e.stream());
    } else {
      return xSi(e);
    }
  }
  async function kSi(e) {
    return function () {
      let t = e.map(n => typeof n === "function" ? n() : n).map(Rxd);
      return Fxn.Readable.from(function () {
        return Ljr(this, arguments, function* () {
          var n;
          var r;
          var o;
          var s;
          for (let c of t) {
            try {
              for (var i = true, a = (r = undefined, bXs(c)), l; l = yield nqe(a.next()), n = l.done, !n; i = true) {
                s = l.value;
                i = false;
                yield yield nqe(s);
              }
            } catch (u) {
              r = {
                error: u
              };
            } finally {
              try {
                if (!i && !n && (o = a.return)) {
                  yield nqe(o.call(a));
                }
              } finally {
                if (r) {
                  throw r.error;
                }
              }
            }
          }
        });
      }());
    };
  }
  var Fxn;
  var ASi = __lazy(() => {
    Svn();
    Fxn = require("stream");
  });
  function xxd() {
    return `----AzSDKFormBoundary${pFt()}`;
  }
  function kxd(e) {
    let t = "";
    for (let [n, r] of e) {
      t += `${n}: ${r}\r
`;
    }
    return t;
  }
  function Axd(e) {
    if (e instanceof Uint8Array) {
      return e.byteLength;
    } else if (Lxn(e)) {
      return e.size === -1 ? undefined : e.size;
    } else {
      return;
    }
  }
  function Ixd(e) {
    let t = 0;
    for (let n of e) {
      let r = Axd(n);
      if (r === undefined) {
        return;
      } else {
        t += r;
      }
    }
    return t;
  }
  async function Pxd(e, t, n) {
    let r = [ice(`--${n}`, "utf-8"), ...t.flatMap(s => [ice(`\r
`, "utf-8"), ice(kxd(s.headers), "utf-8"), ice(`\r
`, "utf-8"), s.body, ice(`\r
--${n}`, "utf-8")]), ice(`--\r
\r
`, "utf-8")];
    let o = Ixd(r);
    if (o) {
      e.headers.set("Content-Length", o);
    }
    e.body = await kSi(r);
  }
  function Mxd(e) {
    if (e.length > 70) {
      throw Error(`Multipart boundary "${e}" exceeds maximum length of 70 characters`);
    }
    if (Array.from(e).some(t => !Dxd.vZc(t))) {
      throw Error(`Multipart boundary "${e}" contains invalid characters`);
    }
  }
  function x5r() {
    return {
      name: "multipartPolicy",
      async sendRequest(e, t) {
        var n;
        if (!e.multipartBody) {
          return t(e);
        }
        if (e.body) {
          throw Error("multipartBody and regular body cannot be set at the same time");
        }
        let r = e.multipartBody.boundary;
        let o = (n = e.headers.get("Content-Type")) !== null && n !== undefined ? n : "multipart/mixed";
        let s = o.match(/^(multipart\/[^ ;]+)(?:; *boundary=(.+))?$/);
        if (!s) {
          throw Error(`Got multipart request body, but content-type header was not multipart: ${o}`);
        }
        let [, i, a] = s;
        if (a && r && a !== r) {
          throw Error(`Multipart boundary was specified as ${a} in the header, but got ${r} in the request body`);
        }
        if (r !== null && r !== undefined || (r = a), r) {
          Mxd(r);
        } else {
          r = xxd();
        }
        e.headers.set("Content-Type", `${i}; boundary=${r}`);
        await Pxd(e, e.multipartBody.parts, r);
        e.multipartBody = undefined;
        return t(e);
      }
    };
  }
  var Dxd;
  var ISi = __lazy(() => {
    Q9r();
    ASi();
    Dxd = new Set("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789'()+,-./:=?");
  });