  __export(L4r, {
    GetIdCommand: () => GetIdCommand,
    GetCredentialsForIdentityCommand: () => GetCredentialsForIdentityCommand,
    CognitoIdentityClient: () => CognitoIdentityClient
  });
  var F4r = __lazy(() => {
    Vui();
  });
  function xCn(e) {
    return async t => {
      e.logger?.debug("@aws-sdk/credential-provider-cognito-identity - fromCognitoIdentity");
      let {
        GetCredentialsForIdentityCommand: n,
        CognitoIdentityClient: r
      } = await Promise.resolve().then(() => (F4r(), L4r));
      let o = c => e.clientConfig?.[c] ?? e.parentClientConfig?.[c] ?? t?.callerClientConfig?.[c];
      let {
        Credentials: {
          AccessKeyId: s = rvd(e.logger),
          Expiration: i,
          SecretKey: a = svd(e.logger),
          SessionToken: l
        } = ovd(e.logger)
      } = await (e.client ?? new r(Object.assign({}, e.clientConfig ?? {}, {
        region: o("region"),
        profile: o("profile"),
        userAgentAppId: o("userAgentAppId")
      }))).send(new n({
        CustomRoleArn: e.customRoleArn,
        IdentityId: e.identityId,
        Logins: e.logins ? await Ywn(e.logins) : undefined
      }));
      return {
        identityId: e.identityId,
        accessKeyId: s,
        secretAccessKey: a,
        sessionToken: l,
        expiration: i
      };
    };
  }
  function rvd(e) {
    throw new RCn.CredentialsProviderError("Response from Amazon Cognito contained no access key ID", {
      logger: e
    });
  }
  function ovd(e) {
    throw new RCn.CredentialsProviderError("Response from Amazon Cognito contained no credentials", {
      logger: e
    });
  }
  function svd(e) {
    throw new RCn.CredentialsProviderError("Response from Amazon Cognito contained no secret key", {
      logger: e
    });
  }
  var RCn;
  var U4r = __lazy(() => {
    RCn = __toESM(wy(), 1);
  });
  class B4r {
    dbName;
    constructor(e = "aws:cognito-identity-ids") {
      this.dbName = e;
    }
    getItem(e) {
      return this.withObjectStore("readonly", t => {
        let n = t.get(e);
        return new Promise(r => {
          n.onerror = () => r(null);
          n.onsuccess = () => r(n.result ? n.result.value : null);
        });
      }).catch(() => null);
    }
    removeItem(e) {
      return this.withObjectStore("readwrite", t => {
        let n = t.delete(e);
        return new Promise((r, o) => {
          n.onerror = () => o(n.error);
          n.onsuccess = () => r();
        });
      });
    }
    setItem(e, t) {
      return this.withObjectStore("readwrite", n => {
        let r = n.put({
          id: e,
          value: t
        });
        return new Promise((o, s) => {
          r.onerror = () => s(r.error);
          r.onsuccess = () => o();
        });
      });
    }
    getDb() {
      let e = self.indexedDB.open(this.dbName, 1);
      return new Promise((t, n) => {
        e.onsuccess = () => {
          t(e.result);
        };
        e.onerror = () => {
          n(e.error);
        };
        e.onblocked = () => {
          n(Error("Unable to access DB"));
        };
        e.onupgradeneeded = () => {
          let r = e.result;
          r.onerror = () => {
            n(Error("Failed to create object store"));
          };
          r.createObjectStore("IdentityIds", {
            keyPath: "id"
          });
        };
      });
    }
    withObjectStore(e, t) {
      return this.getDb().then(n => {
        let r = n.transaction("IdentityIds", e);
        r.oncomplete = () => n.close();
        return new Promise((o, s) => {
          r.onerror = () => s(r.error);
          o(t(r.objectStore("IdentityIds")));
        }).catch(o => {
          throw n.close(), o;
        });
      });
    }
  }
  class $4r {
    store;
    constructor(e = {}) {
      this.store = e;
    }
    getItem(e) {
      if (e in this.store) {
        return this.store[e];
      }
      return null;
    }
    removeItem(e) {
      delete this.store[e];
    }
    setItem(e, t) {
      this.store[e] = t;
    }
  }
  function zui() {
    if (typeof self === "object" && self.indexedDB) {
      return new B4r();
    }
    if (typeof window === "object" && window.localStorage) {
      return window.localStorage;
    }
    return ivd;
  }
  var ivd;
  var Kui = __lazy(() => {
    ivd = new $4r();
  });
  function Jui({
    accountId: e,
    cache: t = zui(),
    client: n,
    clientConfig: r,
    customRoleArn: o,
    identityPoolId: s,
    logins: i,
    userIdentifier: a = !i || Object.keys(i).length === 0 ? "ANONYMOUS" : undefined,
    logger: l,
    parentClientConfig: c
  }) {
    l?.debug("@aws-sdk/credential-provider-cognito-identity - fromCognitoIdentity");
    let u = a ? `aws:cognito-identity-credentials:${s}:${a}` : undefined;
    let d = async p => {
      let {
        GetIdCommand: m,
        CognitoIdentityClient: f
      } = await Promise.resolve().then(() => (F4r(), L4r));
      let h = _ => r?.[_] ?? c?.[_] ?? p?.callerClientConfig?.[_];
      let g = n ?? new f(Object.assign({}, r ?? {}, {
        region: h("region"),
        profile: h("profile"),
        userAgentAppId: h("userAgentAppId")
      }));
      let y = u && (await t.getItem(u));
      if (!y) {
        let {
          IdentityId: _ = avd(l)
        } = await g.send(new m({
          AccountId: e,
          IdentityPoolId: s,
          Logins: i ? await Ywn(i) : undefined
        }));
        if (y = _, u) {
          Promise.resolve(t.setItem(u, y)).catch(() => {});
        }
      }
      d = xCn({
        client: g,
        customRoleArn: o,
        logins: i,
        identityId: y
      });
      return d(p);
    };
    return p => d(p).catch(async m => {
      if (u) {
        Promise.resolve(t.removeItem(u)).catch(() => {});
      }
      throw m;
    });
  }
  function avd(e) {
    throw new Yui.CredentialsProviderError("Response from Amazon Cognito contained no identity ID", {
      logger: e
    });
  }
  var Yui;
  var Xui = __lazy(() => {
    U4r();
    Kui();
    Yui = __toESM(wy(), 1);
  });
  var H4r = __lazy(() => {
    Wii();
    Gii();
    Vii();
    U4r();
    Xui();
  });
  var fromCognitoIdentity = e => xCn({
    ...e
  });
  var Qui = __lazy(() => {
    H4r();
  });
  var fromCognitoIdentityPool = e => Jui({
    ...e
  });
  var Zui = __lazy(() => {
    H4r();
  });
  var fromContainerMetadata_export = e => (e?.logger?.debug("@smithy/credential-provider-imds", "fromContainerMetadata"), fromContainerMetadata(e));
  var edi = __lazy(() => {
    Dje();
  });
  var fromEnv_export = e => fromEnv(e);
  var tdi = __lazy(() => {
    r_n();
  });
  var fromIni_export = (e = {}) => fromIni({
    ...e
  });
  var ndi = __lazy(() => {
    E$r();
  });
  var rdi;
  var fromInstanceMetadata_export = e => (e?.logger?.debug("@smithy/credential-provider-imds", "fromInstanceMetadata"), async () => fromInstanceMetadata(e)().then(t => rdi.setCredentialFeature(t, "CREDENTIALS_IMDS", "0")));
  var odi = __lazy(() => {
    Dje();
    rdi = __toESM(UP(), 1);
  });
  var fromLoginCredentials = e => JSn({
    ...e
  });
  var sdi = __lazy(() => {
    p$r();
  });
  var fromNodeProviderChain = (e = {}) => defaultProvider({
    ...e
  });
  var q4r = __lazy(() => {
    Xje();
  });
  var fromProcess_export = e => fromProcess(e);
  var idi = __lazy(() => {
    ZSn();
  });
  var fromSSO_export = (e = {}) => fromSSO({
    ...e
  });
  var adi = __lazy(() => {
    RSn();
  });
  var ldi = {};
  __export(ldi, {
    STSClient: () => kCn.STSClient,
    AssumeRoleCommand: () => kCn.AssumeRoleCommand
  });
  var kCn;
  var cdi = __lazy(() => {
    kCn = __toESM(LSn(), 1);
  });
  var ddi;
  var W4r;
  var pdi = (e, t, n) => {
    let r;
    return async (o = {}) => {
      let {
        callerClientConfig: s
      } = o;
      let i = e.clientConfig?.profile ?? s?.profile;
      let a = e.logger ?? s?.logger;
      a?.debug("@aws-sdk/credential-providers - fromTemporaryCredentials (STS)");
      let l = {
        ...e.params,
        RoleSessionName: e.params.RoleSessionName ?? "aws-sdk-js-" + Date.now()
      };
      if (l?.SerialNumber) {
        if (!e.mfaCodeProvider) {
          throw new W4r.CredentialsProviderError("Temporary credential requires multi-factor authentication, but no MFA code callback was provided.", {
            tryNextLink: false,
            logger: a
          });
        }
        l.TokenCode = await e.mfaCodeProvider(l?.SerialNumber);
      }
      let {
        AssumeRoleCommand: c,
        STSClient: u
      } = await Promise.resolve().then(() => (cdi(), ldi));
      if (!r) {
        let p = typeof t === "function" ? t() : undefined;
        let m = [e.masterCredentials, e.clientConfig?.credentials, void s?.credentials, s?.credentialDefaultProvider?.(), p];
        let f = "STS client default credentials";
        if (m[0]) {
          f = "options.masterCredentials";
        } else if (m[1]) {
          f = "options.clientConfig.credentials";
        } else if (m[2]) {
          throw f = "caller client's credentials", Error("fromTemporaryCredentials recursion in callerClientConfig.credentials");
        } else if (m[3]) {
          f = "caller client's credentialDefaultProvider";
        } else if (m[4]) {
          f = "AWS SDK default credentials";
        }
        let h = [e.clientConfig?.region, s?.region, await n?.({
          profile: i
        }), "us-east-1"];
        let g = "default partition's default region";
        if (h[0]) {
          g = "options.clientConfig.region";
        } else if (h[1]) {
          g = "caller client's region";
        } else if (h[2]) {
          g = "file or env region";
        }
        let y = [udi(e.clientConfig?.requestHandler), udi(s?.requestHandler)];
        let _ = "STS default requestHandler";
        if (y[0]) {
          _ = "options.clientConfig.requestHandler";
        } else if (y[1]) {
          _ = "caller client's requestHandler";
        }
        a?.debug?.(`@aws-sdk/credential-providers - fromTemporaryCredentials STS client init with ${g}=${await ddi.normalizeProvider(ACn(h))()}, ${f}, ${_}.`);
        r = new u({
          userAgentAppId: s?.userAgentAppId,
          ...e.clientConfig,
          credentials: ACn(m),
          logger: a,
          profile: i,
          region: ACn(h),
          requestHandler: ACn(y)
        });
      }
      if (e.clientPlugins) {
        for (let p of e.clientPlugins) {
          r.middlewareStack.use(p);
        }
      }
      let {
        Credentials: d
      } = await r.send(new c(l));
      if (!d || !d.AccessKeyId || !d.SecretAccessKey) {
        throw new W4r.CredentialsProviderError(`Invalid response from STS.assumeRole call with role ${l.RoleArn}`, {
          logger: a
        });
      }
      return {
        accessKeyId: d.AccessKeyId,
        secretAccessKey: d.SecretAccessKey,
        sessionToken: d.SessionToken,
        expiration: d.Expiration,
        credentialScope: d.CredentialScope
      };
    };
  };
  var udi = e => e?.metadata?.handlerProtocol === "h2" ? undefined : e;
  var ACn = e => {
    for (let t of e) {
      if (t !== undefined) {
        return t;
      }
    }
  };
  var mdi = __lazy(() => {
    ddi = __toESM(Od(), 1);
    W4r = __toESM(wy(), 1);
  });
  var fdi;
  var hdi;
  var fromTemporaryCredentials = e => pdi(e, fromNodeProviderChain, async ({
    profile: t = process.env.AWS_PROFILE
  }) => hdi.loadConfig({
    environmentVariableSelector: n => n.AWS_REGION,
    configFileSelector: n => n.region,
    default: () => {
      return;
    }
  }, {
    ...fdi.NODE_REGION_CONFIG_FILE_OPTIONS,
    profile: t
  })());
  var gdi = __lazy(() => {
    q4r();
    mdi();
    fdi = __toESM(HA(), 1);
    hdi = __toESM(VB(), 1);
  });
  var fromTokenFile_export = (e = {}) => fromTokenFile({
    ...e
  });
  var ydi = __lazy(() => {
    r1t();
  });
  var fromWebToken_export = e => fromWebToken({
    ...e
  });
  var _di = __lazy(() => {
    r1t();
  });
  var Vot = {};
  __export(Vot, {
    propertyProviderChain: () => propertyProviderChain,
    fromWebToken: () => fromWebToken_export,
    fromTokenFile: () => fromTokenFile_export,
    fromTemporaryCredentials: () => fromTemporaryCredentials,
    fromSSO: () => fromSSO_export,
    fromProcess: () => fromProcess_export,
    fromNodeProviderChain: () => fromNodeProviderChain,
    fromLoginCredentials: () => fromLoginCredentials,
    fromInstanceMetadata: () => fromInstanceMetadata_export,
    fromIni: () => fromIni_export,
    fromHttp: () => fromHttp,
    fromEnv: () => fromEnv_export,
    fromContainerMetadata: () => fromContainerMetadata_export,
    fromCognitoIdentityPool: () => fromCognitoIdentityPool,
    fromCognitoIdentity: () => fromCognitoIdentity,
    createCredentialChain: () => createCredentialChain
  });
  var zot = __lazy(() => {
    X_n();
    qii();
    Qui();
    Zui();
    edi();
    tdi();
    ndi();
    odi();
    sdi();
    q4r();
    idi();
    adi();
    gdi();
    ydi();
    _di();
  });
  function Sdi(e) {
    return e?.name === "CredentialsProviderError";
  }
  function bdi(e) {
    if (!e || typeof e !== "object") {
      return false;
    }
    let t = e;
    return typeof t.AccessKeyId === "string" && typeof t.SecretAccessKey === "string" && typeof t.SessionToken === "string" && t.AccessKeyId.length > 0 && t.SecretAccessKey.length > 0 && t.SessionToken.length > 0;
  }
  function Tdi(e) {
    if (!e || typeof e !== "object") {
      return null;
    }
    let t = e;
    if (bdi(t.Credentials)) {
      return t.Credentials;
    }
    if (bdi(t)) {
      return t;
    }
    return null;
  }
  async function Edi() {
    let {
      STSClient: e,
      GetCallerIdentityCommand: t
    } = await Promise.resolve().then(() => (M3r(), D3r));
    await new e().send(new t({}));
  }
  async function vdi() {
    try {
      logForDebugging("Clearing AWS credential provider cache");
      let {
        fromIni: e
      } = await Promise.resolve().then(() => (zot(), Vot));
      await e({
        ignoreCache: true
      })();
      logForDebugging("AWS credential provider cache refreshed");
    } catch (e) {
      logForDebugging("Failed to clear AWS credential cache (this is expected if no credentials are configured)");
    }
  }
  var G4r = __lazy(() => {
    je();
  });
  class KD {
    static instance = null;
    status = {
      isAuthenticating: false,
      output: []
    };
    changed = Si();
    dismissTimer = null;
    static getInstance() {
      if (!KD.instance) {
        KD.instance = new KD();
      }
      return KD.instance;
    }
    getStatus() {
      return {
        ...this.status,
        output: [...this.status.output]
      };
    }
    startAuthentication() {
      this.clearDismissTimer();
      this.status = {
        isAuthenticating: true,
        output: []
      };
      this.changed.emit(this.getStatus());
    }
    addOutput(e) {
      this.status.output.push(e);
      this.changed.emit(this.getStatus());
    }
    setError(e) {
      this.status.error = e;
      this.changed.emit(this.getStatus());
    }
    endAuthentication(e) {
      if (this.clearDismissTimer(), e) {
        this.status = {
          isAuthenticating: false,
          output: []
        };
      } else {
        this.status.isAuthenticating = false;
        this.dismissTimer = setTimeout(() => this.dismiss(), 15000);
        this.dismissTimer.unref?.();
      }
      this.changed.emit(this.getStatus());
    }
    dismiss() {
      this.clearDismissTimer();
      this.status = {
        isAuthenticating: false,
        output: []
      };
      this.changed.emit(this.getStatus());
    }
    subscribe = this.changed.subscribe;
    clearDismissTimer() {
      if (this.dismissTimer !== null) {
        clearTimeout(this.dismissTimer);
        this.dismissTimer = null;
      }
    }
    static reset() {
      if (KD.instance) {
        KD.instance.clearDismissTimer();
        KD.instance.changed.clear();
        KD.instance = null;
      }
    }
  }
  var ICn = __lazy(() => {
    ph();
  });
  function sT(e, t) {
    return Object.freeze({
      name: e,
      header: t
    });
  }
  function DCn(e) {
    return wdi.get(e);
  }
  function Z4r(e) {
    return wdi.get(e) ?? Object.freeze({
      name: e,
      header: e
    });
  }
  function kk(e) {
    return e.map(t => t.header);
  }
  var bqe;
  var c0e;
  var Kot;
  var UY;
  var Sqe;
  var ane;
  var fLt;
  var V4r;
  var hLt;
  var Yot;
  var PCn;
  var Jot;
  var h_e;
  var Tqe;
  var Xot;
  var gLt;
  var OCn;
  var yLt;
  var wI;
  var z4r;
  var g_e;
  var K4r;
  var Y4r;
  var J4r;
  var X4r;
  var Q4r;
  var BY;
  var RF;
  var xF;
  var Evd;
  var wdi;
  var eWr;
  var tWr;
  var KN = __lazy(() => {
    Uc();
    bqe = sT("claude_code", "claude-code-20250219");
    c0e = sT("oauth_auth", "oauth-2025-04-20");
    Kot = sT("interleaved_thinking", "interleaved-thinking-2025-05-14");
    UY = sT("long_context", "context-1m-2025-08-07");
    Sqe = sT("context_management", "context-management-2025-06-27");
    ane = sT("structured_outputs", "structured-outputs-2025-12-15");
    fLt = sT("web_search", "web-search-2025-03-05");
    V4r = sT("tool_search", "advanced-tool-use-2025-11-20");
    hLt = sT("tool_search", "tool-search-tool-2025-10-19");
    Yot = sT("effort", "effort-2025-11-24");
    PCn = sT("task_budgets", "task-budgets-2026-03-13");
    Jot = sT("prompt_caching_scope", "prompt-caching-scope-2026-01-05");
    h_e = sT("prompt_caching_evict", "prompt-caching-evict-2026-05-12");
    Tqe = sT("extended_cache_ttl", "extended-cache-ttl-2025-04-11");
    Xot = sT("speed", "fast-mode-2026-02-01");
    gLt = sT("redact_thinking", "redact-thinking-2026-02-12");
    OCn = sT("thinking_token_count", "thinking-token-count-2026-05-13");
    yLt = sT("narration_summaries", "summarize-connector-text-2026-03-13");
    wI = sT("afk_mode", "afk-mode-2026-01-31");
    z4r = sT("advisor_tool", "advisor-tool-2026-03-01");
    g_e = sT("cache_diagnosis", "cache-diagnosis-2026-04-07");
    K4r = sT("context_hint", "context-hint-2026-04-09");
    Y4r = sT("mcp_servers", "mcp-servers-2025-12-04");
    J4r = sT("files_api", "files-api-2025-04-14");
    X4r = sT("environments", "environments-2025-11-01");
    Q4r = sT("ccr_byoc", "ccr-byoc-2025-07-29");
    BY = sT("mid_conversation_system", "mid-conversation-system-2026-04-07");
    RF = sT("server_side_fallback", "server-side-fallback-2026-06-01");
    xF = sT("fallback_credit", "fallback-credit-2026-06-01");
    Evd = Object.freeze([bqe, c0e, Kot, UY, Sqe, ane, fLt, V4r, hLt, Yot, PCn, Jot, h_e, Tqe, Xot, gLt, OCn, yLt, wI, z4r, g_e, K4r, Y4r, J4r, X4r, Q4r, BY, RF, xF].filter(e => e !== null));
    wdi = new Map(Evd.map(e => [e.header, e]));
    eWr = new Set([Kot, UY, hLt]);
    tWr = new Set([bqe, Kot, Sqe, c0e]);
  });
  function Rdi(e) {
    if (e.length === Qot.length && e.every(t => Qot.includes(t))) {
      return;
    }
    Qot = e;
    Cdi.emit(Qot);
  }
  function l8(e) {
    return Qot.includes(e);
  }
  function Gle() {
    return Qot;
  }
  var Qot;
  var Cdi;
  var _Lt;
  var $Y = __lazy(() => {
    E7();
    Qot = [];
    Cdi = Si();
    _Lt = Cdi.subscribe;
  });
  function lc() {
    if (getAPIProvider() !== "firstParty") {
      return false;
    }
    return !st(process.env.CLAUDE_CODE_DISABLE_FAST_MODE);
  }
  function MCn() {
    return st(process.env.CLAUDE_CODE_SKIP_FAST_MODE_ORG_CHECK);
  }
  function zA() {
    if (!lc()) {
      return false;
    }
    return Vle() === null;
  }
  function vvd(e, t) {
    switch (e) {
      case "free":
        return t === "oauth" ? "Fast mode requires a paid subscription" : "Fast mode unavailable during evaluation. Please purchase credits.";
      case "preference":
        return "Fast mode has been disabled by your organization";
      case "extra_usage_disabled":
        return "Fast mode requires usage credits \xB7 /usage-credits to turn them on";
      case "network_error":
        return "Fast mode unavailable due to network connectivity issues";
      case "unknown":
        return "Fast mode is currently unavailable";
    }
  }
  function Vle() {
    if (!lc()) {
      return getAPIProvider() !== "firstParty" ? "Fast mode is only available when using the Anthropic API directly" : "Fast mode is not available";
    }
    let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_penguins_off", null);
    if (e !== null) {
      logForDebugging(`Fast mode unavailable: ${e}`);
      return e;
    }
    if (!isModelAllowed(Eqe())) {
      let n = getMainLoopModel();
      if (!(!c_() && yh(n) && isModelAllowed(n))) {
        let o = `${vW()} is not in your organization's allowed models`;
        logForDebugging(`Fast mode unavailable: ${o}`);
        return o;
      }
    }
    let t = getSettingsForSource("flagSettings")?.fastMode === true;
    if (getIsNonInteractiveSession() && preferThirdPartyAuthentication()) {
      if (!t) {
        logForDebugging("Fast mode unavailable: Fast mode is not available in the Agent SDK");
        return "Fast mode is not available in the Agent SDK";
      }
    }
    if (kF.status === "pending" && !MCn() && !t) {
      logForDebugging("Fast mode unavailable: Checking fast mode availability (org status pending)");
      return "Checking fast mode availability";
    }
    if (kF.status === "disabled" && !MCn()) {
      if (kF.reason === "network_error" || kF.reason === "unknown") {
        if (st(process.env.CLAUDE_CODE_SKIP_FAST_MODE_NETWORK_ERRORS) || t) {
          return null;
        }
      }
      let n = getClaudeAIOAuthTokens() !== null ? "oauth" : "api-key";
      let r = vvd(kF.reason, n);
      logForDebugging(`Fast mode unavailable: ${r}`);
      return r;
    }
    return null;
  }
  function vW() {
    return "Opus 4.8";
  }
  function Eqe() {
    return "opus" + (isOpus1mMergeEnabled() ? "[1m]" : "");
  }
  function rWr(e) {
    if (!lc()) {
      return false;
    }
    if (!zA()) {
      return false;
    }
    if (!yh(e)) {
      return false;
    }
    return oWr(getInitialSettings());
  }
  function oWr(e) {
    if (e.fastMode !== true) {
      return false;
    }
    if (!e.fastModePerSessionOptIn) {
      return true;
    }
    if (getSettingsForSource("policySettings")?.fastModePerSessionOptIn === true) {
      return false;
    }
    return getSettingsForSource("flagSettings")?.fastMode === true;
  }
  function yh(e) {
    if (!lc()) {
      return false;
    }
    let t = e ?? getDefaultMainLoopModelSetting();
    let n = parseUserSpecifiedModel(t);
    if (o2(getCanonicalName(n), "fast_mode")) {
      return true;
    }
    let r = n.toLowerCase();
    return r.includes("opus-4-7") || r.includes("opus-4-8");
  }
  function kdi() {
    if (getCanonicalName(getMainLoopModel()) !== "claude-opus-4-7") {
      return null;
    }
    let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_sunset_penguin_opus47", "2026-07-25");
    let t = Date.parse(e);
    if (Number.isNaN(t) || Date.now() >= t) {
      return null;
    }
    return new Date(t).toLocaleDateString("en-US", {
      month: "short",
      day: "numeric",
      timeZone: "UTC"
    });
  }
  function sWr() {
    if (Zot.status === "cooldown" && Date.now() >= Zot.resetAt) {
      if (lc() && !nWr) {
        logForDebugging("Fast mode cooldown expired, re-enabling fast mode");
        nWr = true;
        Idi.emit();
      }
      Zot = {
        status: "active"
      };
    }
    return Zot;
  }
  function Ddi(e, t) {
    if (!lc()) {
      return;
    }
    Zot = {
      status: "cooldown",
      resetAt: e,
      reason: t
    };
    nWr = false;
    let n = e - Date.now();
    logForDebugging(`Fast mode cooldown triggered (${t}), duration ${Math.round(n / 1000)}s`);
    logEvent("tengu_fast_mode_fallback_triggered", {
      cooldown_duration_ms: n,
      cooldown_reason: t
    });
    Adi.emit(e, t);
  }
  function u0e() {
    Zot = {
      status: "active"
    };
  }
  function Mdi() {
    if (kF.status === "disabled") {
      return;
    }
    kF = {
      status: "disabled",
      reason: "preference"
    };
    updateSettingsForSource("userSettings", {
      fastMode: undefined
    });
    saveGlobalConfig(e => ({
      ...e,
      penguinModeOrgEnabled: false
    }));
    iWr.emit(false);
  }
  function wvd(e) {
    switch (e) {
      case "out_of_credits":
        return "Fast mode disabled \xB7 usage credits exhausted";
      case "org_level_disabled":
      case "org_service_level_disabled":
        return "Fast mode disabled \xB7 usage credits turned off by your organization";
      case "org_level_disabled_until":
      case "org_spend_cap_reached":
        return "Fast mode disabled \xB7 usage credit limit reached";
      case "member_level_disabled":
        return "Fast mode disabled \xB7 usage credits turned off for your account";
      case "seat_tier_level_disabled":
      case "seat_tier_zero_credit_limit":
      case "member_zero_credit_limit":
        return "Fast mode disabled \xB7 usage credits not available for your plan";
      case "overage_not_provisioned":
      case "no_limits_configured":
        return "Fast mode requires usage credits \xB7 /usage-credits to turn them on";
      default:
        return "Fast mode disabled \xB7 usage credits not available";
    }
  }
  function SLt(e) {
    return e === "org_level_disabled_until" || e === "org_spend_cap_reached" || e === "out_of_credits";
  }
  function Fdi(e) {
    let t = wvd(e);
    if (logForDebugging(`Fast mode overage rejection: ${e ?? "unknown"} \u2014 ${t}`), logEvent("tengu_fast_mode_overage_rejected", {
      overage_disabled_reason: e ?? "unknown"
    }), !SLt(e)) {
      updateSettingsForSource("userSettings", {
        fastMode: undefined
      });
      saveGlobalConfig(n => ({
        ...n,
        penguinModeOrgEnabled: false
      }));
    }
    Ndi.emit(t);
  }
  function zle() {
    return sWr().status === "cooldown";
  }
  function u2(e, t) {
    let n = lc() && zA() && !!t && yh(e);
    if (n && zle()) {
      return "cooldown";
    }
    if (n) {
      return "on";
    }
    return "off";
  }
  async function Cvd(e) {
    let t = `${getOauthConfig().BASE_API_URL}/api/claude_code_penguin_mode`;
    let n = "accessToken" in e ? {
      Authorization: `Bearer ${e.accessToken}`,
      "anthropic-beta": "oauth-2025-04-20"
    } : {
      "x-api-key": e.apiKey
    };
    return (await NP.get(t, {
      headers: n
    })).data;
  }
  function aWr() {
    if (!lc()) {
      return;
    }
    if (kF.status !== "pending") {
      return;
    }
    if (MCn()) {
      kF = {
        status: "enabled"
      };
      return;
    }
    let e = false;
    let t = getGlobalConfig().penguinModeOrgEnabled === true;
    kF = e || t ? {
      status: "enabled"
    } : {
      status: "disabled",
      reason: "unknown"
    };
  }
  async function est() {
    if (aWr(), Vi()) {
      return;
    }
    if (!lc()) {
      return;
    }
    if (MCn()) {
      kF = {
        status: "enabled"
      };
      return;
    }
    if (bLt) {
      logForDebugging("Fast mode prefetch in progress, returning in-flight promise");
      return bLt;
    }
    let e = getAnthropicApiKeySafe();
    if (!(getClaudeAIOAuthTokens()?.accessToken && hasProfileScope()) && !e) {
      kF = getGlobalConfig().penguinModeOrgEnabled === true ? {
        status: "enabled"
      } : {
        status: "disabled",
        reason: "preference"
      };
      return;
    }
    let n = Date.now();
    if (n - xdi < 30000) {
      logForDebugging("Skipping fast mode prefetch, fetched recently");
      return;
    }
    xdi = n;
    let r = async () => {
      let s = getClaudeAIOAuthTokens();
      let i = s?.accessToken && hasProfileScope() ? {
        accessToken: s.accessToken
      } : e ? {
        apiKey: e
      } : null;
      if (!i) {
        throw Error("No auth available");
      }
      return Cvd(i);
    };
    async function o() {
      try {
        let s;
        try {
          s = await r();
        } catch (a) {
          if (NP.isAxiosError(a) && (a.response?.status === 401 || a.response?.status === 403 && typeof a.response?.data === "string" && a.response.data.includes("OAuth token has been revoked"))) {
            let c = getClaudeAIOAuthTokens()?.accessToken;
            if (c) {
              await handleOAuth401Error(c);
              s = await r();
            } else {
              throw a;
            }
          } else {
            throw a;
          }
        }
        let i = kF.status !== "pending" ? kF.status === "enabled" : getGlobalConfig().penguinModeOrgEnabled;
        if (kF = s.enabled ? {
          status: "enabled"
        } : {
          status: "disabled",
          reason: s.disabled_reason ?? "preference"
        }, i !== s.enabled) {
          if (!s.enabled) {
            updateSettingsForSource("userSettings", {
              fastMode: undefined
            });
          }
          saveGlobalConfig(a => ({
            ...a,
            penguinModeOrgEnabled: s.enabled
          }));
          iWr.emit(s.enabled);
        }
        logForDebugging(`Org fast mode: ${s.enabled ? "enabled" : `disabled (${s.disabled_reason ?? "preference"})`}`);
      } catch (s) {
        kF = getGlobalConfig().penguinModeOrgEnabled === true ? {
          status: "enabled"
        } : {
          status: "disabled",
          reason: "network_error"
        };
        logForDebugging(`Failed to fetch org fast mode status, defaulting to ${kF.status === "enabled" ? "enabled (cached)" : "disabled (network_error)"}: ${s}`, {
          level: "error"
        });
        logEvent("tengu_org_penguin_mode_fetch_failed", {});
      } finally {
        bLt = null;
      }
    }
    bLt = o();
    return bLt;
  }
  var Zot;
  var nWr = false;
  var Adi;
  var Idi;
  var Pdi;
  var Odi;
  var Ndi;
  var Ldi;
  var kF;
  var iWr;
  var Udi;
  var xdi = 0;
  var bLt = null;
  var GT = __lazy(() => {
    Dp();
    Uc();
    $n();
    at();
    ru();
    Ot();
    no();
    je();
    gn();
    DY();
    Eo();
    Ds();
    Wd();
    ph();
    Zot = {
      status: "active"
    };
    Adi = Si();
    Idi = Si();
    Pdi = Adi.subscribe;
    Odi = Idi.subscribe;
    Ndi = Si();
    Ldi = Ndi.subscribe;
    kF = {
      status: "pending"
    };
    iWr = Si();
    Udi = iWr.subscribe;
  });
  function tst(e, t) {
    if (lc() && e) {
      if (t === "claude-opus-4-8") {
        return NCn;
      }
      return Hdi;
    }
    return Kle;
  }
  function xvd(e, t) {
    let n = t.cache_creation_input_tokens ?? 0;
    let r = e.promptCacheWrite1hTokens;
    let o = Math.min(t.cache_creation?.ephemeral_1h_input_tokens ?? 0, n);
    if (r === undefined || o <= 0) {
      return n / 1e6 * e.promptCacheWriteTokens;
    }
    return o / 1e6 * r + (n - o) / 1e6 * e.promptCacheWriteTokens;
  }
  function dWr(e, t) {
    return t.input_tokens / 1e6 * e.inputTokens + t.output_tokens / 1e6 * e.outputTokens + (t.cache_read_input_tokens ?? 0) / 1e6 * e.promptCacheReadTokens + xvd(e, t) + (t.server_tool_use?.web_search_requests ?? 0) * e.webSearchRequests;
  }
  function pWr(e, t) {
    let n = getCanonicalName(e);
    if (t.speed === "fast") {
      if (n === "claude-opus-4-8") {
        return NCn;
      }
      if (n === "claude-opus-4-6" || n === "claude-opus-4-7") {
        return Hdi;
      }
    }
    let r = vqe[n];
    if (r) {
      return r;
    }
    let o = getGlobalConfig().additionalModelCostsCache;
    let s = o?.[e] ?? o?.[n];
    if (s) {
      return s;
    }
    kvd(e, n);
    return vqe[getCanonicalName(getDefaultMainLoopModelSetting())] ?? Kle;
  }
  function kvd(e, t) {
    logEvent("tengu_unknown_model_cost", {
      model: e,
      shortName: t
    });
    setHasUnknownModelCost();
  }
  function c8(e, t) {
    let n = pWr(e, t);
    return dWr(n, t);
  }
  function wqe(e, t, n) {
    let r = {
      input_tokens: t.inputTokens,
      output_tokens: t.outputTokens,
      cache_read_input_tokens: t.cacheReadInputTokens,
      cache_creation_input_tokens: t.cacheCreationInputTokens,
      ...(n?.speed !== undefined && {
        speed: n.speed
      }),
      ...(n?.serverToolUse !== undefined && {
        server_tool_use: n.serverToolUse
      })
    };
    return c8(e, r);
  }
  function $di(e) {
    if (Number.isInteger(e)) {
      return `$${e}`;
    }
    return `$${e.toFixed(2)}`;
  }
  function AF(e) {
    return `${$di(e.inputTokens)}/${$di(e.outputTokens)} per Mtok`;
  }
  function jdi(e) {
    let t = getCanonicalName(e);
    let n = vqe[t];
    if (!n) {
      return;
    }
    return AF(n);
  }
  var cne;
  var Bdi;
  var Kle;
  var Hdi;
  var NCn;
  var lWr;
  var cWr;
  var vqe;
  function Gdi() {
    if (!st(process.env.CLAUDE_CODE_ENABLE_GATEWAY_MODEL_DISCOVERY)) {
      return false;
    }
    if (getAPIProvider() !== "firstParty") {
      return false;
    }
    if (isFirstPartyAnthropicBaseUrl()) {
      return false;
    }
    if (!process.env.ANTHROPIC_BASE_URL) {
      return false;
    }
    return true;
  }
  function Vdi() {
    return fWr.join(er(), "cache");
  }
  function zdi() {
    return fWr.join(Vdi(), "gateway-models.json");
  }
  function FCn() {
    if (!Gdi()) {
      return [];
    }
    let e = mWr(zdi());
    if (!e || e.baseUrl !== process.env.ANTHROPIC_BASE_URL) {
      return [];
    }
    return e.models.map(t => ({
      value: t.id,
      label: t.display_name || t.id,
      description: "From gateway"
    }));
  }
  async function Kdi() {
    if (!Gdi()) {
      return;
    }
    if (Vi()) {
      return;
    }
    try {
      let e = process.env.ANTHROPIC_BASE_URL;
      if (!e) {
        return;
      }
      let t = process.env.ANTHROPIC_AUTH_TOKEN;
      let n = getAnthropicApiKey();
      if (!t && !n) {
        return;
      }
      let r = {};
      for (let d of (process.env.ANTHROPIC_CUSTOM_HEADERS ?? "").split(/\r?\n/)) {
        let p = d.indexOf(":");
        if (p <= 0) {
          continue;
        }
        let m = d.slice(0, p).trim();
        let f = d.slice(p + 1).trim();
        if (m && f) {
          r[m] = f;
        }
      }
      let o = `${e.replace(/\/+$/, "")}/v1/models?limit=1000`;
      let s = await fetch(o, {
        method: "GET",
        headers: {
          ...(t ? {
            Authorization: `Bearer ${t}`
          } : n ? {
            "x-api-key": n
          } : {}),
          "anthropic-version": "2023-06-01",
          "User-Agent": dg(),
          ...r
        },
        redirect: "error",
        signal: AbortSignal.timeout(3000),
        ...getProxyFetchOptions({
          url: o
        })
      });
      if (!s.ok) {
        logForDebugging(`[gatewayDiscovery] non-OK status ${s.status}`);
        return;
      }
      let i = await s.json();
      let a = v.object({
        data: v.array(Wdi())
      }).safeParse(i);
      if (!a.success) {
        logForDebugging("[gatewayDiscovery] response body failed validation");
        return;
      }
      let l = a.data.data.filter(d => /^(claude|anthropic)/i.test(d.id));
      if (l.length === 0) {
        logForDebugging("[gatewayDiscovery] 0 usable models after filter");
        return;
      }
      let c = zdi();
      let u = mWr(c);
      if (u && u.baseUrl === e && gbu(u.models, l)) {
        return;
      }
      await LCn.mkdir(Vdi(), {
        recursive: true
      });
      await LCn.writeFile(c, De({
        baseUrl: e,
        fetchedAt: Date.now(),
        models: l
      }), {
        encoding: "utf-8",
        mode: 384
      });
      mWr.cache.delete(c);
      logForDebugging(`[gatewayDiscovery] cached ${l.length} models`);
    } catch (e) {
      logForDebugging(`[gatewayDiscovery] fetch failed: ${e instanceof Error ? e.message : "unknown"}`);
    }
  }
  var qdi;
  var LCn;
  var fWr;
  var Wdi;
  var Ivd;
  var mWr;
  var UCn = __lazy(() => {
    no();
    je();
    gn();
    Gd();
    Wd();
    Fh();
    Ds();
    qdi = require("fs");
    LCn = require("fs/promises");
    fWr = require("path");
    Wdi = we(() => v.object({
      id: v.string(),
      display_name: v.string().optional()
    }).strip());
    Ivd = we(() => v.object({
      baseUrl: v.string(),
      fetchedAt: v.number(),
      models: v.array(Wdi())
    }));
    mWr = TEr(e => {
      try {
        let t = qdi.readFileSync(e, "utf-8");
        let n = Ivd().safeParse(Ba(t, false));
        return n.success ? n.data : null;
      } catch {
        return null;
      }
    }, e => e);
  });
  function TLt(e) {
    let t = getCanonicalName(ca(e));
    let n = getAPIProvider();
    let r = e.trim().toLowerCase();
    let o = hg(r) ? ca(r).trim() : r;
    let s = usesFirstPartyModelIds() && isLegacyOpusFirstParty(o) && isLegacyModelRemapEnabled();
    let i = Object.hasOwn(Ydi, t) ? Ydi[t] : undefined;
    if (i) {
      let a = i.retirementDates[n];
      if (a || s) {
        return {
          isDeprecated: true,
          modelName: i.modelName,
          retirementDate: a,
          remappedTo: s ? i.remappedTo ?? null : null
        };
      }
    }
    return {
      isDeprecated: false
    };
  }
  function Jdi(e) {
    return TLt(e).isDeprecated;
  }
  function BCn(e) {
    if (usesFirstPartyModelIds() && isLegacyOpusFirstParty(getCanonicalName(ca(e))) && isLegacyModelRemapEnabled()) {
      return true;
    }
    let t = TLt(e);
    if (!t.isDeprecated) {
      return false;
    }
    if (t.remappedTo) {
      return true;
    }
    if (t.retirementDate) {
      let n = new Date(t.retirementDate);
      return !Number.isNaN(n.getTime()) && n < new Date();
    }
    return false;
  }
  function Xdi(e) {
    if (!e) {
      return null;
    }
    let t = TLt(e);
    if (!t.isDeprecated) {
      return null;
    }
    if (t.remappedTo) {
      return {
        message: `${t.modelName} now runs as ${t.remappedTo}`,
        action: "/model to change"
      };
    }
    if (t.retirementDate) {
      let n = new Date(t.retirementDate);
      let r = !Number.isNaN(n.getTime()) && n < new Date();
      return {
        message: `${t.modelName} ${r ? "retired" : "retires"} ${t.retirementDate}`,
        action: "/model to switch"
      };
    }
    return null;
  }
  function $Cn(e) {
    if (!e) {
      return null;
    }
    let t = TLt(e);
    if (!t.isDeprecated || !t.remappedTo) {
      return hWr(e);
    }
    let n = getDefaultOpusModel();
    let r = getMarketingNameForModel(n) ?? n;
    return `\u26A0 ${t.modelName.replace(/^Claude /, "")} remaps to ${r}. CLAUDE_CODE_DISABLE_LEGACY_MODEL_REMAP=1 opts out`;
  }
  function hWr(e) {
    if (!e) {
      return null;
    }
    let t = TLt(e);
    if (!t.isDeprecated) {
      return null;
    }
    if (t.remappedTo) {
      let n = getDefaultOpusModel();
      let r = getMarketingNameForModel(n) ?? n;
      return `\u26A0 ${e.trim()} is automatically remapped to ${r} (${t.remappedTo}). Set CLAUDE_CODE_DISABLE_LEGACY_MODEL_REMAP=1 to keep the requested model.`;
    }
    if (t.retirementDate) {
      let n = new Date(t.retirementDate);
      let o = !Number.isNaN(n.getTime()) && n < new Date() ? "was retired on" : "will be retired on";
      return `\u26A0 ${t.modelName} ${o} ${t.retirementDate}. Consider switching to a newer model.`;
    }
    return null;
  }
  var Ydi;
  var nst = __lazy(() => {
    VT();
    Tk();
    Eo();
    Ds();
    Ydi = {
      "claude-opus-4-1": {
        modelName: "Claude Opus 4.1",
        retirementDates: {
          firstParty: null,
          bedrock: null,
          vertex: null,
          foundry: null,
          anthropicAws: null,
          mantle: null,
          gateway: null
        },
        remappedTo: "the latest Opus"
      },
      "claude-opus-4-0": {
        modelName: "Claude Opus 4",
        retirementDates: {
          firstParty: "June 15, 2026",
          bedrock: "May 31, 2026",
          vertex: "September 14, 2026",
          foundry: null,
          anthropicAws: null,
          mantle: null,
          gateway: null
        },
        remappedTo: "the latest Opus"
      },
      "claude-sonnet-4-0": {
        modelName: "Claude Sonnet 4",
        retirementDates: {
          firstParty: "June 15, 2026",
          bedrock: "October 14, 2026",
          vertex: "September 14, 2026",
          foundry: null,
          anthropicAws: null,
          mantle: null,
          gateway: null
        }
      },
      "claude-3-opus": {
        modelName: "Claude 3 Opus",
        retirementDates: {
          firstParty: "January 5, 2026",
          bedrock: "January 15, 2026",
          vertex: "January 5, 2026",
          foundry: "January 5, 2026",
          anthropicAws: null,
          mantle: null,
          gateway: null
        }
      },
      "claude-3-7-sonnet": {
        modelName: "Claude 3.7 Sonnet",
        retirementDates: {
          firstParty: "February 19, 2026",
          bedrock: "April 28, 2026",
          vertex: "May 11, 2026",
          foundry: "February 19, 2026",
          anthropicAws: null,
          mantle: null,
          gateway: null
        }
      },
      "claude-3-5-haiku": {
        modelName: "Claude 3.5 Haiku",
        retirementDates: {
          firstParty: "February 19, 2026",
          bedrock: null,
          vertex: null,
          foundry: null,
          anthropicAws: null,
          mantle: null,
          gateway: null
        }
      }
    };
  });
  function Pvd(e) {
    return getCanonicalName(ca(e.trim().toLowerCase()));
  }
  function Ovd(e) {
    let t = new Set();
    for (let n of e ?? []) {
      if (!n.entitled) {
        t.add(Pvd(n.apiName));
      }
    }
    return t;
  }
  function isModelDenied(e, t) {
    if (t.size === 0) {
      return false;
    }
    let n = ca(e.trim().toLowerCase());
    let r = Sk(n) ? parseUserSpecifiedModel(n) : n;
    return t.vZc(getCanonicalName(r));
  }
  function getModelEntitlementDenySet() {
    let e = getAPIProvider();
    if (e !== "firstParty" && e !== "gateway") {
      return new Set();
    }
    return Ovd(getModelAccessCache());
  }
  function Jle() {
    if (getAPIProvider() !== "firstParty") {
      return null;
    }
    return getOrgModelDefaultCache();
  }
  function jCn(e) {
    let t = Object.keys(xa);
    for (let n = t.length - 1; n >= 0; n--) {
      let r = xa[t[n]].firstParty;
      if (gWr(getCanonicalName(r), e) && isModelAllowed(r) && !BCn(r) && !Jdi(r)) {
        return r;
      }
    }
    return null;
  }
  function gWr(e, t) {
    for (let n = e.indexOf(t); n !== -1; n = e.indexOf(t, n + 1)) {
      let r = n === 0 || !/[a-z0-9]/i.test(e[n - 1]);
      let o = n + t.length;
      let s = o === e.length || !/[a-z0-9]/i.test(e[o]);
      if (r && s) {
        return true;
      }
    }
    return false;
  }
  function Dvd(e, t, n) {
    if (Sk(e)) {
      let r = n ? resolveModelAliasEnvFree(e) : parseUserSpecifiedModel(e).toLowerCase();
      return r !== null && gWr(r, t);
    }
    return gWr(e, t);
  }
  function Qdi(e, t) {
    if (!e.startsWith(t)) {
      return false;
    }
    return e.length === t.length || e[t.length] === "-";
  }
  function Mvd(e, t) {
    let n = Sk(e) ? parseUserSpecifiedModel(e).toLowerCase() : e;
    if (Qdi(n, t)) {
      return true;
    }
    if (!t.startsWith("claude-") && Qdi(n, `claude-${t}`)) {
      return true;
    }
    return false;
  }
  function Zdi(e, t) {
    for (let n of t) {
      if (s2(n)) {
        continue;
      }
      let r = n.indexOf(e);
      if (r === -1) {
        continue;
      }
      let o = r + e.length;
      if (o === n.length || n[o] === "-") {
        return true;
      }
    }
    return false;
  }
  function epi(e, t) {
    let n = ca(e).toLowerCase();
    for (let [r, o] of Object.entries(t)) {
      if (ca(o).toLowerCase() === n) {
        return r;
      }
    }
    return e;
  }
  function HCn(e, t) {
    let n = ca(parseUserSpecifiedModel(e).trim().toLowerCase());
    let r = resolveModelAliasEnvFree(e);
    if (r !== null && ca(r) === n) {
      return true;
    }
    if (Sk(n)) {
      return false;
    }
    return isModelAllowed(n, {
      ...t,
      envFreeAliasResolution: true
    });
  }
  function isModelAllowed(e, t) {
    if (t?.allowlist === undefined) {
      try {
        if (getFatalAdminPolicyLoadErrors().length > 0 && !hasSurvivingAdminPolicySource()) {
          return false;
        }
      } catch {
        return false;
      }
      if (isModelDenied(e, getModelEntitlementDenySet())) {
        return false;
      }
    }
    let n = getInitialSettings() || {};
    let r = t?.allowlist ?? n.availableModels;
    if (!r) {
      return true;
    }
    if (r.length === 0) {
      return false;
    }
    let o = r.map(l => ca(l.trim().toLowerCase()));
    let s = ca(e.trim().toLowerCase());
    if (o.includes(s) && !s2(s)) {
      if (t?.envFreeAliasResolution || !Sk(s) || HCn(s, t)) {
        return true;
      }
    }
    let i;
    if (t?.overridesMap !== undefined) {
      i = epi(e, t.overridesMap);
    } else if (t?.ignoreModelOverrides) {
      i = e;
    } else {
      let l;
      try {
        l = getSettingsForSource("policySettings");
      } catch {
        return false;
      }
      i = l?.availableModels !== undefined ? epi(e, l.modelOverrides ?? {}) : kot(e);
    }
    let a = ca(i.trim().toLowerCase());
    if (o.includes(a)) {
      if (!s2(a) || !Zdi(a, o)) {
        if (t?.envFreeAliasResolution || a !== s || !Sk(a) || HCn(a, t)) {
          return true;
        }
      }
    }
    for (let l of o) {
      if (s2(l) && !Zdi(l, o) && Dvd(a, l, t?.envFreeAliasResolution)) {
        return true;
      }
    }
    if (Sk(a)) {
      let l = parseUserSpecifiedModel(a).toLowerCase();
      if (o.includes(l)) {
        return true;
      }
    }
    for (let l of o) {
      if (!s2(l) && Sk(l)) {
        let c = t?.envFreeAliasResolution ? resolveModelAliasEnvFree(l) : parseUserSpecifiedModel(l).toLowerCase();
        if (c !== null && ca(c) === a) {
          return true;
        }
      }
    }
    for (let l of o) {
      if (!s2(l) && !Sk(l)) {
        if (Mvd(a, l)) {
          return true;
        }
      }
    }
    return false;
  }
  var YN = __lazy(() => {
    no();
    Tk();
    zN();
    nst();
    Eo();
    sne();
    Ds();
  });
  var JCn = {};