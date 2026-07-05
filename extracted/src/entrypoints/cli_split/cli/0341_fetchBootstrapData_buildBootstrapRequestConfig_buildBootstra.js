  __export(O0o, {
    fetchBootstrapData: () => fetchBootstrapData,
    buildBootstrapRequestConfig: () => buildBootstrapRequestConfig,
    buildBootstrapInputs: () => buildBootstrapInputs
  });
  function buildBootstrapInputs() {
    return {
      entrypoint: NN(),
      model: normalizeModelStringForAPI(getMainLoopModel()),
      ccVersion: {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION,
      organizationUuid: getGlobalConfig().oauthAccount?.organizationUuid ?? null
    };
  }
  function buildBootstrapRequestConfig(e) {
    return {
      params: {
        entrypoint: e.entrypoint,
        model: e.model
      },
      userAgent: `claude-code/${e.ccVersion}`
    };
  }
  function ull(e, t) {
    if (!e || !t) {
      return e;
    }
    if (t.account_uuid != null && t.account_uuid !== e.accountUuid) {
      return e;
    }
    let n = {
      organizationType: t.organization_type ?? null,
      organizationRateLimitTier: t.organization_rate_limit_tier ?? null,
      userRateLimitTier: t.user_rate_limit_tier ?? null,
      seatTier: t.seat_tier ?? null
    };
    if (t.account_email != null) {
      n.emailAddress = t.account_email;
    }
    if (t.organization_uuid != null) {
      n.organizationUuid = t.organization_uuid;
    }
    if (t.organization_name != null) {
      n.organizationName = t.organization_name;
    }
    return {
      ...e,
      ...n
    };
  }
  async function Udm(e) {
    if (getAPIProvider() === "gateway") {
      if (!Me.CLAUDE_CODE_ENABLE_GATEWAY_MODEL_DISCOVERY) {
        logForDebugging("[Bootstrap] Skipped gateway /v1/models (CLAUDE_CODE_ENABLE_GATEWAY_MODEL_DISCOVERY not set)");
        return {
          additional_model_options: []
        };
      }
      return $dm();
    }
    if (Vi()) {
      logForDebugging("[Bootstrap] Skipped: Nonessential traffic disabled");
      return null;
    }
    if (getAPIProvider() !== "firstParty") {
      logForDebugging("[Bootstrap] Skipped: 3P provider");
      return null;
    }
    let {
      params: t,
      userAgent: n
    } = buildBootstrapRequestConfig(e);
    let r = async (i, a) => {
      logForDebugging("[Bootstrap] Fetching");
      let l = await NP.get(`${i}/api/claude_cli/bootstrap`, {
        headers: {
          "Content-Type": "application/json",
          "User-Agent": n,
          ...l7r(),
          ...a
        },
        params: t,
        timeout: 5000
      });
      let c = Fdm().safeParse(l.data);
      if (!c.success) {
        logForDebugging(`[Bootstrap] Response failed validation: ${c.error.message}`);
        Et("api_bootstrap_fetch", "parse_failed");
        return null;
      }
      logForDebugging("[Bootstrap] Fetch ok");
      return c.data;
    };
    let o = getAnthropicApiKeySafe();
    if (!o && shouldUseWIFAuth()) {
      try {
        let [i, a] = await Promise.all([getWIFTokenCache(), getWIFCredentials()]);
        if (i !== null) {
          return await r(Me.ANTHROPIC_BASE_URL || a?.baseURL || getOauthConfig().BASE_API_URL, {
            ...a?.extraHeaders,
            Authorization: `Bearer ${await i.getToken()}`,
            "anthropic-beta": "oauth-2025-04-20"
          });
        }
      } catch (i) {
        logForDebugging(`[Bootstrap] WIF fetch failed: ${NP.isAxiosError(i) ? i.response?.status ?? i.code : i instanceof Error ? i.constructor.name : "unknown"}`);
        Et("api_bootstrap_fetch", "wif_unavailable");
        return null;
      }
    }
    if (!(getClaudeAIOAuthTokens()?.accessToken && hasProfileScope()) && !o) {
      logForDebugging("[Bootstrap] Skipped: no usable OAuth, WIF, or API key");
      return null;
    }
    try {
      return await withOAuth401Retry(async () => {
        let i = getClaudeAIOAuthTokens()?.accessToken;
        let a;
        if (i && hasProfileScope()) {
          a = {
            Authorization: `Bearer ${i}`,
            "anthropic-beta": "oauth-2025-04-20"
          };
        } else if (o) {
          a = {
            "x-api-key": o
          };
        } else {
          logForDebugging("[Bootstrap] No auth available on retry, aborting");
          return null;
        }
        return r(getOauthConfig().BASE_API_URL, a);
      });
    } catch (i) {
      throw logForDebugging(`[Bootstrap] Fetch failed: ${NP.isAxiosError(i) ? i.response?.status ?? i.code : "unknown"}`), Ae("api_bootstrap_fetch", "request_failed"), i;
    }
  }
  async function fetchBootstrapData() {
    try {
      let e = buildBootstrapInputs();
      let t = await Udm(e);
      if (!t) {
        return;
      }
      Pe("api_bootstrap_fetch");
      let n = t.client_data ?? null;
      let r = t.additional_model_options ?? [];
      let o = t.additional_model_costs ?? {};
      let s = t.model_access ?? [];
      let i = t.auto_compact_windows ?? null;
      let a = getGlobalConfig();
      let l = ull(a.oauthAccount, t.oauth_account);
      let c = t.org_model_default ? {
        ...t.org_model_default,
        ...(l?.organizationUuid && {
          orgUuid: l.organizationUuid
        })
      } : null;
      let u = mDn({
        ...e,
        organizationUuid: l?.organizationUuid ?? e.organizationUuid
      });
      let d = a.clientDataCacheSlots?.[u];
      let p = d !== undefined && "data" in d && typeof d.at === "number";
      let m = gbu(l, a.oauthAccount);
      let f = p && Date.now() - d.at > 86400000;
      let h = !p || !gbu(d.data ?? null, n);
      if (logEvent("tengu_client_data_cache_key", {
        slot_hit: p,
        slot_changed: h,
        legacy_fallback: !p && a.clientDataCache != null,
        slot_stale: f
      }), p && gbu(d.data ?? null, n) && !f && gbu(a.additionalModelOptionsCache, r) && gbu(a.additionalModelCostsCache, o) && gbu(a.modelAccessCache ?? [], s) && gbu(a.orgModelDefaultCache ?? null, c) && gbu(a.autoCompactWindowsCache ?? null, i) && m) {
        logForDebugging("[Bootstrap] Cache unchanged, skipping write");
        return;
      }
      if (logForDebugging("[Bootstrap] Cache updated, persisting to disk"), saveGlobalConfig(g => {
        let y = ull(g.oauthAccount, t.oauth_account);
        let _ = mDn({
          ...e,
          organizationUuid: y?.organizationUuid ?? null
        });
        return {
          ...g,
          clientDataCacheSlots: wqi(g.clientDataCacheSlots, _, {
            data: n,
            at: Date.now()
          }),
          additionalModelOptionsCache: r,
          additionalModelCostsCache: o,
          modelAccessCache: s,
          orgModelDefaultCache: c,
          autoCompactWindowsCache: i,
          oauthAccount: y
        };
      }), h) {
        I8();
        Une();
      }
    } catch (e) {
      if (M_(e)) {
        logForDebugging(`[Bootstrap] fetchBootstrapData failed: ${e}`, {
          level: "error"
        });
      } else {
        Oe(e);
      }
    }
  }
  async function $dm() {
    await b0e();
    let e = getGatewayAuth();
    if (!e) {
      return null;
    }
    try {
      let t = await NP.get(`${e.url}/v1/models`, {
        headers: {
          Authorization: `Bearer ${e.jwt}`,
          "anthropic-version": "2023-06-01",
          "User-Agent": dg()
        },
        params: {
          limit: 1000
        },
        timeout: 5000
      });
      let n = Bdm().safeParse(t.data);
      if (!n.success) {
        logForDebugging(`[Bootstrap] Gateway /v1/models failed validation: ${n.error.message}`);
        return null;
      }
      let r = n.data.data.filter(o => /^(claude|anthropic)/i.test(o.id)).filter(o => {
        let s = t8(o.id);
        return s === null || s === mqe;
      }).map(o => ({
        value: o.id,
        label: o.display_name ?? o.id,
        description: o.description ?? ""
      }));
      logForDebugging(`[Bootstrap] Gateway /v1/models \u2192 ${r.length} custom options`);
      return {
        additional_model_options: r
      };
    } catch (t) {
      logForDebugging(`[Bootstrap] Gateway /v1/models fetch failed: ${NP.isAxiosError(t) ? t.response?.status ?? t.code : "unknown"}`);
      return null;
    }
  }
  var Fdm;
  var Bdm;
  var x_t = __lazy(() => {
    Dp();
    no();
    qg();
    at();
    Uc();
    DC();
    je();
    $A();
    pr();
    dt();
    bst();
    YA();
    Rn();
    zN();
    PV();
    Eo();
    Ds();
    Wd();
    Xit();
    ln();
    Ot();
    Hqe();
    WXr();
    uIe();
    Fdm = we(() => Ke.object({
      client_data: Ke.record(Ke.unknown()).nullish(),
      additional_model_options: Ke.array(Ke.object({
        model: Ke.string(),
        name: Ke.string(),
        description: Ke.string(),
        disabled_reason: Ke.string().nullish()
      }).transform(({
        model: e,
        name: t,
        description: n,
        disabled_reason: r
      }) => {
        let o = t8(normalizeModelStringForAPI(e));
        let s = o ? getMarketingNameForModel(e) : null;
        let i = n;
        if (o && s && r == null) {
          let a = n ? n.startsWith(s) ? n : `${s} \xB7 ${n}` : s;
          let l = jdi(e);
          if (i = l && !isClaudeAISubscriber() && !a.includes("per Mtok") ? `${a} \xB7 ${l}` : a, o === mqe && isClaudeAISubscriber() && !m$() && xde()) {
            i = `${i} \xB7 Requires usage credits`;
          }
        }
        return {
          value: e,
          label: r != null ? `${t} (disabled)` : t,
          description: r ? i ? `${i} \xB7 ${r}` : r : i,
          ...(r != null && {
            disabled: true
          })
        };
      })).nullish(),
      additional_model_costs: Ke.record(Ke.object({
        input_tokens: Ke.number(),
        output_tokens: Ke.number(),
        prompt_cache_write_tokens: Ke.number(),
        prompt_cache_write_1h_tokens: Ke.number().nullish(),
        prompt_cache_read_tokens: Ke.number(),
        web_search_requests: Ke.number().nullish()
      }).transform(e => ({
        inputTokens: e.input_tokens,
        outputTokens: e.output_tokens,
        promptCacheWriteTokens: e.prompt_cache_write_tokens,
        ...(e.prompt_cache_write_1h_tokens != null && {
          promptCacheWrite1hTokens: e.prompt_cache_write_1h_tokens
        }),
        promptCacheReadTokens: e.prompt_cache_read_tokens,
        webSearchRequests: e.web_search_requests ?? 0.01
      }))).nullish(),
      model_access: Ke.array(Ke.object({
        api_name: Ke.string(),
        entitled: Ke.boolean(),
        max_effort_level: Ke.string().nullish()
      }).transform(({
        api_name: e,
        entitled: t,
        max_effort_level: n
      }) => ({
        apiName: e,
        entitled: t,
        ...(n != null && {
          maxEffortLevel: n
        })
      }))).nullish(),
      org_model_default: Ke.object({
        name: Ke.string(),
        updated_at: Ke.string(),
        data_source: Ke.string(),
        override_user_selection: Ke.boolean()
      }).nullish(),
      oauth_account: Ke.object({
        account_uuid: Ke.string().nullish(),
        account_email: Ke.string().nullish(),
        organization_uuid: Ke.string().nullish(),
        organization_name: Ke.string().nullish(),
        organization_type: Ke.string().nullish(),
        organization_rate_limit_tier: Ke.string().nullish(),
        user_rate_limit_tier: Ke.string().nullish(),
        seat_tier: Ke.string().nullish()
      }).passthrough().nullish(),
      auto_compact_windows: Ke.record(Ke.string(), Ke.unknown()).nullish()
    }));
    setClientDataCacheKeyGetter(() => mDn(buildBootstrapInputs()));
    Bdm = we(() => Ke.object({
      data: Ke.array(Ke.object({
        id: Ke.string(),
        display_name: Ke.string().nullish(),
        description: Ke.string().nullish()
      }))
    }));
  });
  async function pll() {
    try {
      if (getGlobalConfig().claudeCodeFirstTokenDate !== undefined) {
        Pe("api_first_token_date_fetch");
        return;
      }
      let t = await _s.get("/api/organization/claude_code_first_token_date", {
        auth: "async",
        timeout: 1e4
      });
      if (!t.ok) {
        if (t.reason === "no-auth") {
          logForDebugging(`Failed to get auth headers for first-token-date fetch: ${t.detail}`, {
            level: "error"
          });
          Ae("api_first_token_date_fetch", "request_failed");
        }
        return;
      }
      let n = t.data?.first_token_date ?? null;
      if (n !== null) {
        let r = new Date(n).getTime();
        if (isNaN(r)) {
          Oe(Error(`Received invalid first_token_date from API: ${n}`));
          Ae("api_first_token_date_fetch", "invalid_date");
          return;
        }
      }
      saveGlobalConfig(r => ({
        ...r,
        claudeCodeFirstTokenDate: n
      }));
      Pe("api_first_token_date_fetch");
    } catch (e) {
      if (M_(e)) {
        logForDebugging(`Failed to fetch first token date: ${he(e)}`, {
          level: "error"
        });
      } else {
        Oe(e);
      }
      Ae("api_first_token_date_fetch", "request_failed");
    }
  }
  var mll = __lazy(() => {
    je();
    dt();
    Rn();
    ln();
    bg();
  });
  var fll;
  var M0o;
  var hll = __lazy(() => {
    ln();
    Ot();
    Uc();
    Rn();
    qP();
    fll = require("http");
    M0o = class M0o {
      localServer;
      port = 0;
      promiseResolver = null;
      promiseRejecter = null;
      expectedState = null;
      pendingResponse = null;
      callbackPath;
      constructor(e = "/callback") {
        this.localServer = fll.createServer();
        this.callbackPath = e;
      }
      async start(e) {
        return new Promise((t, n) => {
          this.localServer.once("error", r => {
            Ae("oauth_callback_listener", "oauth_callback_server_start_failed");
            n(Error(`Failed to start OAuth callback server: ${r.message}`));
          });
          this.localServer.listen(e ?? 0, "127.0.0.1", () => {
            let r = this.localServer.address();
            this.port = r.port;
            t(this.port);
          });
        });
      }
      getPort() {
        return this.port;
      }
      hasPendingResponse() {
        return this.pendingResponse !== null;
      }
      async waitForAuthorization(e, t) {
        return new Promise((n, r) => {
          this.promiseResolver = n;
          this.promiseRejecter = r;
          this.expectedState = e;
          this.startLocalListener(t);
        });
      }
      handleSuccessRedirect(e, t) {
        if (!this.pendingResponse) {
          return;
        }
        if (t) {
          t(this.pendingResponse, e);
          this.pendingResponse = null;
          logEvent("tengu_oauth_automatic_redirect", {
            custom_handler: true
          });
          return;
        }
        let n = shouldUseClaudeAIAuth(e) ? getOauthConfig().CLAUDEAI_SUCCESS_URL : getOauthConfig().CONSOLE_SUCCESS_URL;
        this.pendingResponse.writeHead(302, {
          Location: n
        });
        this.pendingResponse.end();
        this.pendingResponse = null;
        logEvent("tengu_oauth_automatic_redirect", {});
      }
      handleErrorRedirect() {
        if (!this.pendingResponse) {
          return;
        }
        let e = getOauthConfig().CLAUDEAI_SUCCESS_URL;
        this.pendingResponse.writeHead(302, {
          Location: e
        });
        this.pendingResponse.end();
        this.pendingResponse = null;
        logEvent("tengu_oauth_automatic_redirect_error", {});
      }
      startLocalListener(e) {
        this.localServer.on("request", this.handleRedirect.bind(this));
        this.localServer.on("error", this.handleError.bind(this));
        e();
      }
      handleRedirect(e, t) {
        let n = new URL(e.url || "", `http://${e.headers.host || "localhost"}`);
        if (n.pathname !== this.callbackPath) {
          t.writeHead(404);
          t.end();
          return;
        }
        let r = n.searchParams.get("code") ?? undefined;
        let o = n.searchParams.get("state") ?? undefined;
        this.validateAndRespond(r, o, t);
      }
      validateAndRespond(e, t, n) {
        if (!e) {
          Ae("oauth_callback_listener", "oauth_callback_no_code");
          n.writeHead(400);
          n.end("Authorization code not found");
          this.reject(Error("No authorization code received"));
          return;
        }
        if (t !== this.expectedState) {
          Ae("oauth_callback_listener", "oauth_callback_state_mismatch");
          n.writeHead(400);
          n.end("Invalid state parameter");
          this.reject(Error("Invalid state parameter"));
          return;
        }
        this.pendingResponse = n;
        Pe("oauth_callback_listener");
        this.resolve(e);
      }
      handleError(e) {
        Ae("oauth_callback_listener", "oauth_callback_server_error");
        Oe(e);
        this.close();
        this.reject(e);
      }
      resolve(e) {
        if (this.promiseResolver) {
          this.promiseResolver(e);
          this.promiseResolver = null;
          this.promiseRejecter = null;
        }
      }
      reject(e) {
        if (this.promiseRejecter) {
          this.promiseRejecter(e);
          this.promiseResolver = null;
          this.promiseRejecter = null;
        }
      }
      close() {
        if (this.pendingResponse) {
          this.handleErrorRedirect();
        }
        if (this.localServer) {
          this.localServer.removeAllListeners();
          this.localServer.close();
        }
      }
      [Symbol.dispose]() {
        this.close();
      }
    };
  });
  function N0o(e) {
    return e.toString("base64").replaceAll("+", "-").replaceAll("/", "_").replaceAll("=", "");
  }
  function gll() {
    return N0o(bzt.randomBytes(32));
  }
  function yll(e) {
    let t = bzt.createHash("sha256");
    t.update(e);
    return N0o(t.digest());
  }
  function _ll() {
    return N0o(bzt.randomBytes(32));
  }
  var bzt;
  var bll = __lazy(() => {
    bzt = require("crypto");
  });
  class Rz {
    codeVerifier;
    authCodeListener = null;
    port = null;
    manualAuthCodeResolver = null;
    constructor() {
      this.codeVerifier = gll();
    }
    async startOAuthFlow(e, t) {
      this.authCodeListener = new M0o();
      this.port = await this.authCodeListener.start();
      let n = yll(this.codeVerifier);
      let r = _ll();
      let o = {
        codeChallenge: n,
        state: r,
        port: this.port,
        loginWithClaudeAi: t?.loginWithClaudeAi,
        inferenceOnly: t?.inferenceOnly,
        orgUUID: t?.orgUUID,
        loginHint: t?.loginHint,
        loginMethod: t?.loginMethod,
        oauthClient: t?.oauthClient
      };
      let s = buildAuthUrl({
        ...o,
        isManual: true
      });
      let i = buildAuthUrl({
        ...o,
        isManual: false
      });
      let a = await this.waitForAuthorizationCode(r, async () => {
        if (t?.skipBrowserOpen) {
          await e(s, i);
        } else {
          await e(s);
          await Ac(i);
        }
      });
      let l = this.authCodeListener?.hasPendingResponse() ?? false;
      logEvent("tengu_oauth_auth_code_received", {
        automatic: l
      });
      try {
        let c = await exchangeCodeForTokens(a, r, this.codeVerifier, this.port, !l, t?.expiresIn, t?.oauthClient?.clientId);
        let u = t?.skipProfileFetch ? null : await fetchProfileInfo(c.access_token);
        if (l) {
          let d = parseScopes(c.scope);
          let p = t?.successRedirectUrl;
          if (p) {
            this.authCodeListener?.handleSuccessRedirect(d, m => {
              m.writeHead(302, {
                Location: p
              });
              m.end();
            });
          } else {
            this.authCodeListener?.handleSuccessRedirect(d);
          }
        }
        Pe("oauth_login");
        return this.formatTokens(c, u?.subscriptionType ?? null, u?.rateLimitTier ?? null, u?.rawProfile, t?.oauthClient?.clientId);
      } catch (c) {
        if (Ae("oauth_login", "oauth_login_failed"), l) {
          this.authCodeListener?.handleErrorRedirect();
        }
        if (!t?.inferenceOnly && !t?.oauthClient) {
          xGe({
            action: "login",
            success: false,
            authMethod: "oauth",
            error: c
          });
        }
        throw c;
      } finally {
        this.authCodeListener?.close();
      }
    }
    async waitForAuthorizationCode(e, t) {
      return new Promise((n, r) => {
        this.manualAuthCodeResolver = n;
        this.authCodeListener?.waitForAuthorization(e, t).then(o => {
          this.manualAuthCodeResolver = null;
          n(o);
        }).catch(o => {
          this.manualAuthCodeResolver = null;
          r(o);
        });
      });
    }
    handleManualAuthCodeInput(e) {
      if (this.manualAuthCodeResolver) {
        this.manualAuthCodeResolver(e.authorizationCode);
        this.manualAuthCodeResolver = null;
        this.authCodeListener?.close();
      }
    }
    formatTokens(e, t, n, r, o) {
      return {
        accessToken: e.access_token,
        refreshToken: e.refresh_token,
        expiresAt: Date.now() + e.expires_in * 1000,
        scopes: parseScopes(e.scope),
        subscriptionType: t,
        rateLimitTier: n,
        profile: r,
        clientId: o,
        tokenAccount: e.account ? {
          uuid: e.account.uuid,
          emailAddress: e.account.email_address,
          organizationUuid: e.organization?.uuid
        } : undefined
      };
    }
    cleanup() {
      this.authCodeListener?.close();
      this.manualAuthCodeResolver = null;
    }
  }
  var GVe = __lazy(() => {
    Ot();
    ky();
    yS();
    ln();
    hll();
    qP();
    bll();
  });
  function jdm() {}
  function Q_(e) {
    let t = Sll.c(5);
    let {
      children: n
    } = e;
    let {
      exit: r
    } = MXd();
    let o;
    let s;
    if (t[0] !== r) {
      o = () => {
        let a = setTimeout(r, 0);
        return () => clearTimeout(a);
      };
      s = [r];
      t[0] = r;
      t[1] = o;
      t[2] = s;
    } else {
      o = t[1];
      s = t[2];
    }
    Tll.useLayoutEffect(o, s);
    let i;
    if (t[3] !== n) {
      i = k_t.jsx(k_t.Fragment, {
        children: n
      });
      t[3] = n;
      t[4] = i;
    } else {
      i = t[4];
    }
    return i;
  }
  async function A_t(e, t) {
    let n = "";
    let r = false;
    let o = new Ell.PassThrough();
    if (t !== undefined) {
      o.columns = t;
    }
    o.on("data", i => {
      if (r) {
        return;
      }
      r = true;
      n = i.toString();
    });
    await (await render(k_t.jsx(Q_, {
      children: k_t.jsx(l1n, {
        value: jdm,
        children: e
      })
    }), {
      stdout: o,
      patchConsole: false
    })).waitUntilExit();
    return n;
  }
  async function L0o(e, t) {
    let n = await A_t(e, t);
    return Li(n);
  }
  var Sll;
  var Tll;
  var Ell;
  var k_t;
  var I1e = __lazy(() => {
    uq();
    et();
    Sll = __toESM(pt(), 1);
    Tll = __toESM(ot(), 1);
    Ell = require("stream");
    k_t = __toESM(ie(), 1);
  });
  async function tYn(e, t) {
    let n;
    for (let r = 1; r <= t.attempts; r++) {
      try {
        return await e(AbortSignal.timeout(t.timeoutMs));
      } catch (o) {
        if (n = o, r >= t.attempts) {
          break;
        }
        t.onRetry?.(r, o);
        let s = 500 * 3 ** (r - 1);
        await sleep(s * (0.75 + Math.random() * 0.5));
      }
    }
    throw n;
  }
  var F0o = () => {};
  function nYn() {
    return I_t.join(er(), "local");
  }
  function wll() {
    return I_t.join(nYn(), "claude");
  }
  function Cll() {
    return (process.argv[1] || "").includes("/.claude/local/node_modules/");
  }
  async function vll(e, t, n) {
    try {
      await P_t.writeFile(e, t, {
        encoding: "utf8",
        flag: "wx",
        mode: n
      });
      return true;
    } catch (r) {
      if (en(r) === "EEXIST") {
        return false;
      }
      throw r;
    }
  }
  async function qdm() {
    try {
      let e = nYn();
      await zt().mkdir(e);
      await vll(I_t.join(e, "package.json"), De({
        name: "claude-local",
        version: "0.0.1",
        private: true
      }, null, 2));
      let t = I_t.join(e, "claude");
      if (await vll(t, `#!/bin/sh
exec "${e}/node_modules/.bin/claude" "$@"`, 493)) {
        await P_t.chmod(t, 493);
      }
      return true;
    } catch (e) {
      logForDebugging(`Failed to set up local package environment: ${e}`, {
        level: "error"
      });
      return false;
    }
  }
  async function Szt(e, t) {
    try {
      if (!(await qdm())) {
        Ae("update_apply", "update_apply_env_setup_failed");
        return "install_failed";
      }
      let n = t ? t : e === "stable" ? "stable" : "latest";
      let r = await execFileNoThrowWithCwd("npm", ["install", `${{
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.PACKAGE_URL}@${n}`], {
        cwd: nYn(),
        maxBuffer: 1e6
      });
      if (r.code !== 0) {
        Ae("update_apply", "update_apply_local_npm_failed");
        logForDebugging(`Failed to install Claude CLI package: ${r.stderr}`, {
          level: "error"
        });
        return r.code === 190 ? "in_progress" : "install_failed";
      }
      saveGlobalConfig(o => ({
        ...o,
        installMethod: "local"
      }));
      Pe("update_apply");
      return "success";
    } catch (n) {
      Ae("update_apply", "update_apply_local_exception");
      Oe(n);
      return "install_failed";
    }
  }
  async function VVe() {
    try {
      await P_t.access(I_t.join(nYn(), "node_modules", ".bin", "claude"));
      return true;
    } catch {
      return false;
    }
  }
  function O_t() {
    let e = process.env.SHELL || "";
    if (e.includes("zsh")) {
      return "zsh";
    }
    if (e.includes("bash")) {
      return "bash";
    }
    if (e.includes("fish")) {
      return "fish";
    }
    return "unknown";
  }
  var P_t;
  var I_t;
  var zVe = __lazy(() => {
    ln();
    je();
    gn();
    dt();
    ji();
    Rn();
    P_t = require("fs/promises");
    I_t = require("path");
  });
  function P1e(e) {
    let t = e?.homedir ?? U0o.homedir();
    let n = e?.env ?? process.env;
    let r = e?.platform ?? "linux";
    let o = e?.fileExists ?? Rll.existsSync;
    let s = n.ZDOTDIR || t;
    let i = r === "darwin" ? [".bash_profile", ".bash_login", ".profile"].find(a => o(D_t.join(t, a))) ?? ".bash_profile" : ".bashrc";
    return {
      zsh: D_t.join(s, ".zshrc"),
      bash: D_t.join(t, i),
      ...(r === "darwin" && {
        bashrc: D_t.join(t, ".bashrc")
      }),
      fish: D_t.join(t, ".config/fish/config.fish")
    };
  }
  function rYn(e) {
    let t = false;
    return {
      filtered: e.filter(r => {
        if (xll.test(r)) {
          let o = r.match(/alias\s+claude\s*=\s*["']([^"']+)["']/);
          if (!o) {
            o = r.match(/alias\s+claude\s*=\s*([^#\n]+)/);
          }
          if (o && o[1]) {
            if (o[1].trim() === wll()) {
              t = true;
              return false;
            }
          }
        }
        return true;
      }),
      hadAlias: t
    };
  }
  async function Tzt(e) {
    try {
      return (await M_t.readFile(e, {
        encoding: "utf8"
      })).split(`
`);
    } catch (t) {
      if (Io(t)) {
        return null;
      }
      throw t;
    }
  }
  async function oYn(e, t) {
    let n = await M_t.open(e, "w");
    try {
      await n.writeFile(t.join(`
`), {
        encoding: "utf8"
      });
      await n.datasync();
    } finally {
      await n.close();
    }
  }
  async function B0o(e) {
    let t = P1e(e);
    for (let n of Object.values(t)) {
      let r = await Tzt(n);
      if (!r) {
        continue;
      }
      for (let o of r) {
        if (xll.test(o)) {
          let s = o.match(/alias\s+claude=["']?([^"'\s]+)/);
          if (s && s[1]) {
            return s[1];
          }
        }
      }
    }
    return null;
  }
  async function kll(e) {
    let t = await B0o(e);
    if (!t) {
      return null;
    }
    let n = e?.homedir ?? U0o.homedir();
    let r = t.startsWith("~") ? t.replace("~", n) : t;
    try {
      let o = await M_t.stat(r);
      if (o.isFile() || o.isSymbolicLink()) {
        return t;
      }
    } catch {}
    return null;
  }
  var Rll;
  var M_t;
  var U0o;
  var D_t;
  var xll;
  var sYn = __lazy(() => {
    dt();
    zVe();
    Rll = require("fs");
    M_t = require("fs/promises");
    U0o = require("os");
    D_t = require("path");
    xll = /^\s*alias\s+claude\s*=/;
  });
  async function Mll() {
    try {
      let e = await getDynamicConfig_BLOCKS_ON_INIT("tengu_version_config", {
        minVersion: "0.0.0"
      });
      if (e.minVersion && Vne({
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION, e.minVersion)) {
        console.error(`
It looks like your version of Claude Code (${{
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION}) needs an update.
A newer version (${e.minVersion} or higher) is required to continue.

To update, please run:
    claude update

This will ensure you have access to the latest features and improvements.
`);
        gracefulShutdownSync(1);
      }
    } catch (e) {
      Oe(e);
    }
  }
  function L_t() {
    let e = Date.now();
    if (e - $0o < 300000) {
      logForDebugging(`auto-update check throttled (last check ${Math.round((e - $0o) / 1000)}s ago)`);
      return true;
    }
    $0o = e;
    return false;
  }
  async function iYn() {
    return (await JVe()).maxVersion;
  }
  async function JVe() {
    let e = await Lll();
    let t = false;
    let n = e.external || undefined;
    let r = n ? YVe.parse(n)?.version ?? undefined : undefined;
    if (n && !r) {
      logForDebugging(`tengu_max_version_config has invalid version '${n}' \u2014 ignoring`, {
        level: "error"
      });
      logEvent("tengu_max_version_config_invalid", {
        raw_value: uS(n)
      });
    }
    return {
      maxVersion: r,
      forceDowngradeEnabled: e.external_force_downgrade === true
    };
  }
  function F_t(e, t, n) {
    let r = n === "native_update" ? "Native installer" : "AutoUpdater";
    let o = YVe.parse(e);
    if (o && o.compare(t) > 0) {
      logForDebugging(`${r}: force-downgrade active \u2014 moving from ${e} to ${t}`);
      return true;
    }
    logForDebugging(`${r}: force-downgrade flag set but current ${e} is not above ${t} \u2014 taking normal upgrade path`);
    return false;
  }
  async function Nll() {
    return (await Lll()).external_message || undefined;
  }
  async function Lll() {
    try {
      return await getDynamicConfig_BLOCKS_ON_INIT("tengu_max_version_config", {});
    } catch (e) {
      Oe(e);
      return {};
    }
  }
  function aYn(e) {
    let t = getInitialSettings()?.minimumVersion;
    if (t && !iO(e, t)) {
      return `below your minimumVersion setting (${t})`;
    }
    let n = getSettingsForSource("policySettings")?.requiredMaximumVersion;
    if (n) {
      let r = YVe.parse(n)?.version;
      if (!r) {
        logForDebugging(`requiredMaximumVersion '${n}' is not a valid semver version \u2014 ignoring`, {
          level: "error"
        });
      } else if (!Yat(e, r)) {
        return `above your organization's requiredMaximumVersion (${n})`;
      }
    }
    return null;
  }
  function U_t(e) {
    let t = aYn(e);
    if (t) {
      logForDebugging(`Skipping update to ${e}: ${t}`);
    }
    return t !== null;
  }
  function Fll() {
    return xz.join(er(), ".update.lock");
  }
  async function Vdm() {
    let e = zt();
    let t = Fll();
    try {
      let n = await e.stat(t);
      if (Date.now() - n.mtimeMs < 300000) {
        return false;
      }
      try {
        let o = await e.stat(t);
        if (Date.now() - o.mtimeMs < 300000) {
          return false;
        }
        await e.unlink(t);
      } catch (o) {
        if (!fn(o)) {
          Oe(o);
          return false;
        }
      }
    } catch (n) {
      if (!fn(n)) {
        Oe(n);
        return false;
      }
    }
    try {
      await R0.writeFile(t, `${process.pid}`, {
        encoding: "utf8",
        flag: "wx"
      });
      return true;
    } catch (n) {
      let r = en(n);
      if (r === "EEXIST") {
        return false;
      }
      if (r === "ENOENT") {
        try {
          await e.mkdir(er());
          await R0.writeFile(t, `${process.pid}`, {
            encoding: "utf8",
            flag: "wx"
          });
          return true;
        } catch (o) {
          if (en(o) === "EEXIST") {
            return false;
          }
          logForDebugging(`Failed to create config dir or update lock file: ${o}`, {
            level: "error"
          });
          return false;
        }
      }
      logForDebugging(`AutoUpdater: failed to create update lock file ${t}: ${n}`, {
        level: "error"
      });
      return false;
    }
  }
  async function zdm() {
    let e = zt();
    let t = Fll();
    try {
      if ((await e.readFile(t, {
        encoding: "utf8"
      })) === `${process.pid}`) {
        await e.unlink(t);
      }
    } catch (n) {
      if (fn(n)) {
        return;
      }
      logForDebugging(`AutoUpdater: failed to release update lock file ${t}: ${n}`, {
        level: "error"
      });
    }
  }
  function H0o() {
    let e = process.execPath.replace(/\\/g, "/");
    let t = (process.env.BUN_INSTALL ?? "").replace(/\\/g, "/").replace(/\/+$/, "");
    if (e.includes("/.bun/install/global/") || t && e.startsWith(t + "/install/global/")) {
      return "bun";
    }
    return Me.isRunningWithBun() && !rm() ? "bun" : "npm";
  }
  async function Ull() {
    let e = H0o() === "bun";
    let t = null;
    if (e) {
      t = await execFileNoThrowWithCwd("bun", ["pm", "bin", "-g"], {
        cwd: KVe.homedir()
      });
    } else {
      t = await execFileNoThrowWithCwd("npm", ["-g", "config", "get", "prefix"], {
        cwd: KVe.homedir()
      });
    }
    if (t.code !== 0) {
      logForDebugging(`Failed to check ${e ? "bun" : "npm"} permissions (exit ${t.code}): ${t.stderr.trim()}`, {
        level: "error"
      });
      return null;
    }
    return t.stdout.trim() || null;
  }
  async function Kdm() {
    let e = await Ull();
    if (!e) {
      return [];
    }
    if (H0o() === "bun") {
      return [xz.join(e, "claude")];
    }
    if (Wt() === "windows") {
      return [xz.join(e, "claude.cmd"), xz.join(e, "claude.exe")];
    }
    return [xz.join(e, "bin", "claude")];
  }
  async function Bll() {
    try {
      let e = await Ull();
      if (!e) {
        return {
          hasPermissions: false,
          npmPrefix: null
        };
      }
      try {
        await R0.access(e, Oll.constants.W_OK);
        return {
          hasPermissions: true,
          npmPrefix: e
        };
      } catch {
        logForDebugging("Insufficient permissions for global npm install.", {
          level: "error"
        });
        return {
          hasPermissions: false,
          npmPrefix: e
        };
      }
    } catch (e) {
      Oe(e);
      return {
        hasPermissions: false,
        npmPrefix: null
      };
    }
  }
  async function B_t(e) {
    let t = e === "stable" ? "stable" : "latest";
    let n = await execFileNoThrowWithCwd("npm", ["view", `${{
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.PACKAGE_URL}@${t}`, "version", "--prefer-online"], {
      abortSignal: AbortSignal.timeout(5000),
      cwd: KVe.homedir()
    });
    if (n.code !== 0) {
      let r = n.stdout.trim();
      if (r && YVe.parse(r)) {
        if (Et("update_check", "update_check_npm_view_stderr_warning"), logForDebugging(`npm view exited ${n.code} but printed a valid version (${r}) \u2014 treating stderr as a warning`), n.stderr) {
          logForDebugging(`npm stderr: ${n.stderr.trim()}`);
        }
        return r;
      }
      if (Ae("update_check", "update_check_npm_view_failed"), logForDebugging(`npm view failed with code ${n.code}`), n.stderr) {
        logForDebugging(`npm stderr: ${n.stderr.trim()}`);
      } else {
        logForDebugging("npm stderr: (empty)");
      }
      if (n.stdout) {
        logForDebugging(`npm stdout: ${n.stdout.trim()}`);
      }
      return null;
    }
    Pe("update_check");
    return n.stdout.trim() || null;
  }
  async function $ll() {
    let e = await execFileNoThrowWithCwd("npm", ["view", {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.PACKAGE_URL, "dist-tags", "--json", "--prefer-online"], {
      abortSignal: AbortSignal.timeout(5000),
      cwd: KVe.homedir()
    });
    if (e.code !== 0) {
      logForDebugging(`npm view dist-tags failed with code ${e.code}`);
      return {
        latest: null,
        stable: null
      };
    }
    try {
      let t = qt(e.stdout.trim());
      return {
        latest: typeof t.latest === "string" ? t.latest : null,
        stable: typeof t.stable === "string" ? t.stable : null
      };
    } catch (t) {
      logForDebugging(`Failed to parse dist-tags: ${t}`);
      return {
        latest: null,
        stable: null
      };
    }
  }
  async function Ezt(e) {
    if (Vi()) {
      return null;
    }
    let t = 0;
    try {
      let n = await tYn(r => (t++, aEe.get(`${"https://downloads.claude.ai/claude-code-releases"}/${e}`, {
        timeout: 5000,
        responseType: "text",
        signal: r
      })), {
        attempts: 3,
        timeoutMs: 5000,
        onRetry: (r, o) => {
          logForDebugging(`Failed to fetch ${e} from GCS on attempt ${r}/${3}, retrying: ${o}`);
        }
      });
      if (t > 1) {
        Et("update_check", "update_check_gcs_retry");
      } else {
        Pe("update_check");
      }
      return n.data.trim();
    } catch (n) {
      Ae("update_check", "update_check_gcs_failed");
      logForDebugging(`Failed to fetch ${e} from GCS after ${t} attempt(s): ${n}`);
      return null;
    }
  }
  async function Ydm(e) {
    if (Vi()) {
      return null;
    }
    try {
      let n = (await externalHttp.get(`https://formulae.brew.sh/api/cask/${e}.json`, {
        timeout: 5000,
        responseType: "json"
      })).data?.version;
      Pe("update_check");
      return typeof n === "string" ? n : null;
    } catch (t) {
      Ae("update_check", "update_check_homebrew_failed");
      logForDebugging(`Failed to fetch ${e} from formulae.brew.sh: ${t}`);
      return null;
    }
  }
  async function lYn(e, t) {
    let [n, r] = await Promise.all([Ydm(e), Ezt(t)]);
    return n ?? r;
  }
  async function Hll() {
    let [e, t] = await Promise.all([Ezt("latest"), Ezt("stable")]);
    return {
      latest: e,
      stable: t
    };
  }
  function $_t() {
    return N_t;
  }
  async function vzt(e) {
    if (!(await Vdm())) {
      Et("update_apply", "update_apply_lock_contention");
      logForDebugging("Another process is currently installing an update", {
        level: "error"
      });
      logEvent("tengu_auto_updater_lock_contention", {
        pid: process.pid,
        currentVersion: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION
      });
      return {
        status: "in_progress"
      };
    }
    try {
      await Jdm();
      let t = H0o();
      if (t === "npm" && Me.isNpmFromWindowsPath()) {
        Ae("update_apply", "update_apply_wsl_windows_npm");
        logForDebugging("Windows NPM detected in WSL environment", {
          level: "error"
        });
        logEvent("tengu_auto_updater_windows_npm_in_wsl", {
          currentVersion: {
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.VERSION
        });
        console.error(`
Error: Windows NPM detected in WSL

You're running Claude Code in WSL but using the Windows NPM installation from /mnt/c/.
This configuration is not supported for updates.

To fix this issue:
  1. Install Node.js within your Linux distribution: e.g. sudo apt install nodejs npm
  2. Make sure Linux NPM is in your PATH before the Windows version
  3. Try updating again with 'claude update'
`);
        return {
          status: "install_failed"
        };
      }
      let n = e ? `${{
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.PACKAGE_URL}@${e}` : {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.PACKAGE_URL;
      let r = Wt() === "windows" && rm() && process.execPath.replace(/\\/g, "/").includes("/node_modules/@anthropic-ai/");
      let o = [];
      if (r) {
        let a = xz.join(xz.dirname(process.execPath), "..", "..");
        let l = xz.join(a, "..");
        for (let p of [l, a]) {
          for (let m of await R0.readdir(p, {
            withFileTypes: true
          }).catch(() => [])) {
            if (!m.isDirectory() || !m.name.startsWith(".")) {
              continue;
            }
            let f = xz.join(p, m.name);
            if (await Promise.all([R0.readdir(f).catch(() => []), R0.readdir(xz.join(f, "bin")).catch(() => [])]).then(([g, y]) => [...g, ...y].some(_ => /\.exe\.old\.\d+$/.test(_)))) {
              await R0.rm(f, {
                recursive: true,
                force: true
              }).catch(g => logForDebugging(`retired-dir cleanup failed: ${g}`));
            }
          }
        }
        let c = Date.now();
        let u = await R0.stat(process.execPath, {
          bigint: true
        }).then(p => p.ino).catch(() => 0n);
        let d = [process.execPath];
        for (let p of await R0.readdir(a).catch(() => [])) {
          for (let m of ["claude.exe", "cli.exe"]) {
            let f = xz.join(a, p, m);
            if (f === process.execPath) {
              continue;
            }
            let h = await R0.stat(f, {
              bigint: true
            }).then(g => g.ino).catch(() => -1n);
            if (u && h === u) {
              d.push(f);
            }
          }
        }
        for (let p of d) {
          let m = `${p}.old.${c}`;
          await R0.rename(p, m).then(() => o.push([p, m]), () => {});
        }
      }
      let s = await execFileNoThrowWithCwd(t, ["install", "-g", n], {
        cwd: KVe.homedir()
      });
      let i = 0;
      if (o.length && s.code !== 0) {
        N_t = null;
        for (let [a, l] of o) {
          try {
            await R0.rename(l, a);
          } catch (c) {
            try {
              await R0.copyFile(l, a);
              logForDebugging(`Restored ${a} by copy after rename failed: ${c}`);
              await R0.unlink(l).catch(u => logForDebugging(`Failed to remove ${l} after copy-restore: ${u}`));
            } catch (u) {
              if (i++, !N_t) {
                N_t = {
                  originalPath: a,
                  preservedPath: l
                };
                Ae("update_apply", "update_apply_restore_failed");
              }
              Oe(new Dll(`Failed to restore ${a} after install failure: rename: ${c}; copy: ${u}`));
            }
          }
        }
      }
      if (s.code !== 0) {
        let a = `${s.stdout} ${s.stderr}`;
        let l = Xdm(a);
        let c = o.length === 0 ? "not_attempted" : i === 0 ? "restored" : "partial";
        if (l === "warning_only") {
          let d = await Kdm();
          let p = e ? YVe.parse(e)?.version : undefined;
          let m;
          let f = false;
          for (let h of d) {
            let g = await execFileNoThrowWithCwd(h, ["--version"], {
              abortSignal: AbortSignal.timeout(45000),
              cwd: KVe.homedir()
            });
            if (m = YVe.parse(g.stdout.trim().split(/\s+/)[0])?.version, f = g.code === 0 && m != null && (p != null ? m === p : mv(m, {
              ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
              PACKAGE_URL: "@anthropic-ai/claude-code",
              README_URL: "https://code.claude.com/docs/en/overview",
              VERSION: "2.1.198",
              FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
              BUILD_TIME: "2026-07-01T06:09:31Z",
              GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
            }.VERSION)), f) {
              break;
            }
          }
          if (f) {
            saveGlobalConfig(h => ({
              ...h,
              installMethod: "global"
            }));
            N_t = null;
            Et("update_apply", "update_apply_npm_install_stderr_warning");
            logForDebugging(`npm/bun exited ${s.code} with only warnings on stderr but the install-prefix re-probe confirms the install landed (now ${m}): ${a}`);
            return {
              status: "success"
            };
          }
        }
        if (logEvent("tengu_auto_updater_npm_failure", {
          npm_exit_code: s.code,
          package_manager: t,
          is_bundled_mode: rm(),
          platform: L8(Wt()),
          windows_self_rename: c,
          stderr_signature: l,
          npm_error_code: Qdm(a) ?? "none"
        }), Wt() === "windows" && /\b(?:claude|cli)\.exe\b/i.test(a) && (/\bEBUSY\b|resource busy or locked/i.test(a) || /\bEPERM\b|operation not permitted/i.test(a) && (o.length > 0 || /\b(?:rename|copyfile|unlink)\b[^\r\n]*\b(?:claude|cli)\.exe\b/i.test(a)))) {
          Ae("update_apply", "update_apply_exe_locked");
          logForDebugging(`Failed to install new version of claude (running executable is locked): ${a}`, {
            level: "error"
          });
          return {
            status: "install_failed",
            failureHint: "windows_running_exe_lock"
          };
        }
        if (/\b(EACCES|EPERM|permission denied)\b/i.test(a)) {
          Ae("update_apply", "update_apply_no_permissions");
          logForDebugging("Insufficient permissions for global npm install.", {
            level: "error"
          });
          return {
            status: "no_permissions"
          };
        }
        if (l === "warning_only") {
          Ae("update_apply", "update_apply_npm_install_stderr_warning");
          logForDebugging(`npm/bun exited ${s.code} with only warnings on stderr but the re-probe did not confirm an advance: ${a}`, {
            level: "error"
          });
          return {
            status: "install_failed"
          };
        }
        Ae("update_apply", "update_apply_npm_install_failed");
        logForDebugging(`Failed to install new version of claude: ${a}`, {
          level: "error"
        });
        return {
          status: "install_failed"
        };
      }
      saveGlobalConfig(a => ({
        ...a,
        installMethod: "global"
      }));
      N_t = null;
      Pe("update_apply");
      return {
        status: "success"
      };
    } finally {
      await zdm();
    }
  }
  async function Jdm() {
    let e = P1e();
    for (let [, t] of Object.entries(e)) {
      try {
        let n = await Tzt(t);
        if (!n) {
          continue;
        }
        let {
          filtered: r,
          hadAlias: o
        } = rYn(n);
        if (o) {
          await oYn(t, r);
          logForDebugging(`Removed claude alias from ${t}`);
        }
      } catch (n) {
        logForDebugging(`Failed to remove alias from ${t}: ${n}`, {
          level: "error"
        });
      }
    }
  }
  function Xdm(e) {
    if (/\b(EACCES|EPERM|permission denied)\b/i.test(e)) {
      return "eacces_eperm";
    }
    if (/\bENOTEMPTY\b/i.test(e)) {
      return "enotempty";
    }
    if (/\bETARGET\b/i.test(e)) {
      return "etarget";
    }
    if (/\bE403\b/i.test(e) || /\b403 forbidden\b/i.test(e)) {
      return "e403_forbidden";
    }
    if (/\bENOENT\b/i.test(e)) {
      return "enoent";
    }
    if (/\bE5\d\d\b/i.test(e) || /\b5\d\d\s+(internal server error|bad gateway|service unavailable|gateway time-?out)\b/i.test(e)) {
      return "registry_5xx";
    }
    if (/\b(ETIMEDOUT|ESOCKETTIMEDOUT)\b/i.test(e) || /\btimed[\s-]?out\b/i.test(e) || /\btimeout\b/i.test(e)) {
      return "network_timeout";
    }
    if (/\bENOSPC\b/i.test(e)) {
      return "disk_full";
    }
    if (/\bEBUSY\b/i.test(e) || /\bresource busy or locked\b/i.test(e)) {
      return "ebusy";
    }
    let t = /npm warn/i.test(e) || /unknown user config/i.test(e) || /npm notice/i.test(e);
    let n = /npm err/i.test(e) || /\b(EACCES|EPERM|ETARGET)\b/i.test(e) || /code E/i.test(e);
    if (t && !n) {
      return "warning_only";
    }
    return "unknown";
  }
  function Qdm(e) {
    let t = /\bnpm (?:ERR!|error) code\s+([A-Z][A-Z0-9_]{1,29})(?![A-Za-z0-9_])/.exec(e)?.[1];
    return t === undefined ? undefined : t;
  }
  var Oll;
  var R0;
  var KVe;
  var xz;
  var YVe;
  var Dll;
  var $0o = 0;
  var N_t = null;
  var uve = __lazy(() => {
    ln();
    $n();
    Ot();
    Gu();
    h9t();
    pk();
    je();
    pr();
    gn();
    dt();
    ji();
    lm();
    Rn();
    F0o();
    Cs();
    Wd();
    sYn();
    Oll = require("fs");
    R0 = require("fs/promises");
    KVe = require("os");
    xz = require("path");
    YVe = __toESM(lq(), 1);
    Dll = class Dll extends gIt {};
  });
  function qll() {
    return jll.join(er(), ".last-update-result.json");
  }
  async function XVe(e) {
    try {
      await Ys().atomicWrite(qll(), De(e));
    } catch (t) {
      logForDebugging(`Failed to record update result: ${t}`, {
        level: "error"
      });
    }
  }
  async function cYn() {
    let e;
    try {
      e = await Ys().read(qll());
    } catch (t) {
      if (!fn(t)) {
        logForDebugging(`Failed to read update result: ${t}`, {
          level: "error"
        });
      }
      return null;
    }
    try {
      let t = Zdm().safeParse(qt(e));
      return t.success ? t.data : null;
    } catch {
      return null;
    }
  }
  var jll;
  var Zdm;
  var H_t = __lazy(() => {
    qg();
    _b();
    je();
    gn();
    dt();
    jll = require("path");
    Zdm = we(() => Ke.object({
      timestamp: Ke.string(),
      path: Ke.enum(["npm-global", "npm-local", "native"]),
      outcome: Ke.enum(["success", "failed"]),
      status: Ke.string(),
      version_from: Ke.string(),
      version_to: Ke.string().nullable(),
      error_code: Ke.string().nullable()
    }));
  });
  function dYn(e, t) {
    return t.includes(e.id) || e.idLike.some(n => t.includes(n));
  }
  function j0o() {
    let e = process.execPath || process.argv[0] || "";
    if (/[/\\]mise[/\\]installs[/\\]/i.test(e)) {
      logForDebugging(`Detected mise installation: ${e}`);
      return true;
    }
    return false;
  }
  function q0o() {
    let e = process.execPath || process.argv[0] || "";
    if (/[/\\]\.?asdf[/\\]installs[/\\]/i.test(e)) {
      logForDebugging(`Detected asdf installation: ${e}`);
      return true;
    }
    return false;
  }
  function j_t() {
    let e = Wt();
    if (e !== "macos" && e !== "linux" && e !== "wsl") {
      return false;
    }
    let t = process.execPath || process.argv[0] || "";
    if (t.includes("/Caskroom/")) {
      logForDebugging(`Detected Homebrew cask installation: ${t}`);
      return true;
    }
    return false;
  }
  function wzt() {
    return (process.execPath || process.argv[0] || "").match(/\/Caskroom\/([^/]+)\//)?.[1] ?? null;
  }
  function W0o() {
    if (Wt() !== "windows") {
      return false;
    }
    let t = process.execPath || process.argv[0] || "";
    let n = [/Microsoft[/\\]WinGet[/\\]Packages/i, /Microsoft[/\\]WinGet[/\\]Links/i];
    for (let r of n) {
      if (r.test(t)) {
        logForDebugging(`Detected winget installation: ${t}`);
        return true;
      }
    }
    return false;
  }
  var Wll;
  var uYn;
  var G0o;
  var V0o;
  var z0o;
  var K0o;
  var QVe;
  var pYn = __lazy(() => {
    je();
    ji();
    Cs();
    Wll = require("fs/promises");
    uYn = TEr(async () => {
      try {
        let e = await Wll.readFile("/etc/os-release", "utf8");
        let t = e.match(/^ID=["']?(\S+?)["']?\s*$/m);
        let n = e.match(/^ID_LIKE=["']?(.+?)["']?\s*$/m);
        return {
          id: t?.[1] ?? "",
          idLike: n?.[1]?.split(" ") ?? []
        };
      } catch {
        return null;
      }
    });
    G0o = TEr(async () => {
      if (Wt() !== "linux") {
        return false;
      }
      let t = await uYn();
      if (t && !dYn(t, ["arch"])) {
        return false;
      }
      let n = process.execPath || process.argv[0] || "";
      let r = await execFileNoThrow("pacman", ["-Qo", n], {
        timeout: 5000,
        useCwd: false
      });
      if (r.code === 0 && r.stdout) {
        logForDebugging(`Detected pacman installation: ${r.stdout.trim()}`);
        return true;
      }
      return false;
    });
    V0o = TEr(async () => {
      if (Wt() !== "linux") {
        return false;
      }
      let t = await uYn();
      if (t && !dYn(t, ["debian"])) {
        return false;
      }
      let n = process.execPath || process.argv[0] || "";
      let r = await execFileNoThrow("dpkg", ["-S", n], {
        timeout: 5000,
        useCwd: false
      });
      if (r.code === 0 && r.stdout) {
        logForDebugging(`Detected deb installation: ${r.stdout.trim()}`);
        return true;
      }
      return false;
    });
    z0o = TEr(async () => {
      if (Wt() !== "linux") {
        return false;
      }
      let t = await uYn();
      if (t && !dYn(t, ["fedora", "rhel", "suse"])) {
        return false;
      }
      let n = process.execPath || process.argv[0] || "";
      let r = await execFileNoThrow("rpm", ["-qf", n], {
        timeout: 5000,
        useCwd: false
      });
      if (r.code === 0 && r.stdout) {
        logForDebugging(`Detected rpm installation: ${r.stdout.trim()}`);
        return true;
      }
      return false;
    });
    K0o = TEr(async () => {
      if (Wt() !== "linux") {
        return false;
      }
      let t = await uYn();
      if (t && !dYn(t, ["alpine"])) {
        return false;
      }
      let n = process.execPath || process.argv[0] || "";
      let r = await execFileNoThrow("apk", ["info", "--who-owns", n], {
        timeout: 5000,
        useCwd: false
      });
      if (r.code === 0 && r.stdout) {
        logForDebugging(`Detected apk installation: ${r.stdout.trim()}`);
        return true;
      }
      return false;
    });
    QVe = TEr(async () => {
      if (j_t()) {
        return "homebrew";
      }
      if (W0o()) {
        return "winget";
      }
      if (j0o()) {
        return "mise";
      }
      if (q0o()) {
        return "asdf";
      }
      if (await G0o()) {
        return "pacman";
      }
      if (await K0o()) {
        return "apk";
      }
      if (await V0o()) {
        return "deb";
      }
      if (await z0o()) {
        return "rpm";
      }
      return "unknown";
    });
  });
  function epm() {
    let e = process.argv[1] || "";
    let t = process.execPath || process.argv[0] || "";
    if (Wt() === "windows") {
      e = e.split(yE.win32.sep).join(yE.posix.sep);
      t = t.split(yE.win32.sep).join(yE.posix.sep);
    }
    return [e, t];
  }
  async function pve() {
    let [e, t] = epm();
    if (rm()) {
      let s = er().replace(/\\/g, "/").replace(/\/+$/, "") + "/local/node_modules/";
      if (t.startsWith(s)) {
        return "npm-local";
      }
      if (t.includes("/node_modules/@anthropic-ai/")) {
        return "npm-global";
      }
      if (j_t() || W0o() || j0o() || q0o() || (await G0o()) || (await V0o()) || (await z0o()) || (await K0o())) {
        return "package-manager";
      }
      return "native";
    }
    if (Cll()) {
      return "npm-local";
    }
    if (["/usr/local/lib/node_modules", "/usr/lib/node_modules", "/opt/homebrew/lib/node_modules", "/opt/homebrew/bin", "/usr/local/bin", "/.nvm/versions/node/"].some(s => e.includes(s))) {
      return "npm-global";
    }
    if (e.includes("/npm/") || e.includes("/nvm/")) {
      return "npm-global";
    }
    let r = await yI("npm config get prefix", {
      reject: false
    });
    let o = r.exitCode === 0 ? r.stdout.trim() : null;
    if (o && e.startsWith(o)) {
      return "npm-global";
    }
    return "unknown";
  }
  async function tpm() {
    if (rm()) {
      try {
        return await Czt.realpath(process.execPath);
      } catch {}
      try {
        let e = await Qm("claude");
        if (e) {
          return e;
        }
      } catch {}
      try {
        await zt().stat(yE.join(O1e.homedir(), ".local/bin/claude"));
        return yE.join(O1e.homedir(), ".local/bin/claude");
      } catch {}
      return "native";
    }
    try {
      return process.argv[0] || "unknown";
    } catch {
      return "unknown";
    }
  }
  function npm() {
    try {
      if (rm()) {
        return process.execPath || "unknown";
      }
      return process.argv[1] || "unknown";
    } catch {
      return "unknown";
    }
  }
  async function rpm() {
    let e = zt();
    let t = [];
    let n = yE.join(O1e.homedir(), ".claude", "local");
    if (await VVe()) {
      t.push({
        type: "npm-local",
        path: n
      });
    }
    let r = ["@anthropic-ai/claude-code"];
    if ({
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.PACKAGE_URL && {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.PACKAGE_URL !== "@anthropic-ai/claude-code") {
      r.push({
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.PACKAGE_URL);
    }
    let o = await execFileNoThrow("npm", ["-g", "config", "get", "prefix"]);
    if (o.code === 0 && o.stdout) {
      let a = o.stdout.trim();
      let l = Wt() === "windows";
      let c = l ? yE.join(a, "claude") : yE.join(a, "bin", "claude");
      let u = false;
      try {
        await e.stat(c);
        u = true;
      } catch {}
      if (u) {
        let d = false;
        try {
          if ((await Czt.realpath(c)).includes("/Caskroom/")) {
            d = j_t();
          }
        } catch {}
        if (!d) {
          let p = false;
          for (let m of r) {
            let f = l ? yE.join(a, "node_modules", m) : yE.join(a, "lib", "node_modules", m);
            try {
              await e.stat(f);
              p = true;
              break;
            } catch {}
          }
          if (p) {
            t.push({
              type: "npm-global",
              path: c
            });
          }
        }
      } else {
        for (let d of r) {
          let p = l ? yE.join(a, "node_modules", d) : yE.join(a, "lib", "node_modules", d);
          try {
            await e.stat(p);
            t.push({
              type: "npm-global-orphan",
              path: p
            });
          } catch {}
        }
      }
    }
    let s = yE.join(O1e.homedir(), ".local", "bin", "claude");
    try {
      await e.stat(s);
      t.push({
        type: "native",
        path: s
      });
    } catch {}
    if (getGlobalConfig().installMethod === "native") {
      let a = yE.join(O1e.homedir(), ".local", "share", "claude");
      try {
        if (await e.stat(a), !t.some(l => l.type === "native")) {
          t.push({
            type: "native",
            path: a
          });
        }
      } catch {}
    }
    return t;
  }
  function opm(e, t) {
    let n = Wt() === "windows";
    let r = t;
    if (n) {
      r = t.split(yE.win32.sep).join(yE.posix.sep).toLowerCase();
    }
    return e.some(o => {
      let s = o;
      if (n) {
        s = o.split(yE.win32.sep).join(yE.posix.sep).toLowerCase();
      }
      let i = s.replace(/\/+$/, "");
      let a = o.replace(/[/\\]+$/, "");
      return i === r || a === "~/.local/bin" || a === "$HOME/.local/bin";
    });
  }
  async function spm(e) {
    let t = [];
    let n = [SI()];
    if (Wt() === "wsl" && Gte()) {
      n.unshift("/mnt/c/Program Files/ClaudeCode");
    }
    for (let a of n) {
      try {
        let l = await Czt.readFile(yE.join(a, "managed-settings.json"), "utf-8");
        let c = qt(l);
        let u = c && typeof c === "object" ? c.strictPluginOnlyCustomization : undefined;
        if (u !== undefined && typeof u !== "boolean") {
          if (!Array.isArray(u)) {
            t.push({
              issue: `managed-settings.json: strictPluginOnlyCustomization has an invalid value (expected true or an array, got ${typeof u})`,
              fix: `The field is silently ignored (schema .catch rescues it). Set it to true, or an array of: ${Hke.join(", ")}.`
            });
          } else {
            let m = u.filter(f => typeof f === "string" && !Hke.includes(f));
            if (m.length > 0) {
              t.push({
                issue: `managed-settings.json: strictPluginOnlyCustomization has ${m.length} value(s) this client doesn't recognize: ${m.map(String).join(", ")}`,
                fix: `These are silently ignored (forwards-compat). Known surfaces for this version: ${Hke.join(", ")}. Either remove them, or this client is older than the managed-settings intended.`
              });
            }
          }
        }
        let {
          wslInheritsWindowsSettings: d,
          ...p
        } = c && typeof c === "object" ? c : {};
        if (Object.keys(p).length > 0) {
          break;
        }
      } catch {}
    }
    let r = getOtelHeadersHelperLastFailure();
    if (r) {
      t.push({
        issue: `otelHeadersHelper is configured but its last invocation failed: ${r}`,
        fix: "Run the configured helper manually and confirm it prints a JSON object of string header values. If the value is a file path, confirm the file exists and is executable."
      });
    }
    let o = getGlobalConfig();
    if (e === "development") {
      return t;
    }
    if (e === "native") {
      let a = (process.env.PATH || "").split(yE.delimiter);
      let l = O1e.homedir();
      let c = yE.join(l, ".local", "bin");
      if (!opm(a, c)) {
        if (Wt() === "windows") {
          let d = c.split(yE.posix.sep).join(yE.win32.sep);
          t.push({
            issue: `Native installation exists but ${d} is not in your PATH`,
            fix: "Add it by opening: System Properties \u2192 Environment Variables \u2192 Edit User PATH \u2192 New \u2192 Add the path above. Then restart your terminal."
          });
        } else {
          let d = O_t();
          let m = P1e()[d];
          let f = m ? m.replace(O1e.homedir(), "~") : "your shell config file";
          t.push({
            issue: "Native installation exists but ~/.local/bin is not in your PATH",
            fix: `Run: echo 'export PATH="$HOME/.local/bin:$PATH"' >> ${f} then open a new terminal or run: source ${f}`
          });
        }
      }
    }
    if (!Me.DISABLE_INSTALLATION_CHECKS) {
      if (e === "npm-local" && o.installMethod !== "local") {
        t.push({
          issue: `Running from local installation but config install method is '${o.installMethod ?? "not set"}'`,
          fix: "Consider using native installation: `claude install`"
        });
      }
      if (e === "native" && o.installMethod !== "native") {
        t.push({
          issue: `Running native installation but config install method is '${o.installMethod ?? "not set"}'`,
          fix: "Run `claude install` to update configuration"
        });
      }
    }
    if (e === "npm-global" && (await VVe())) {
      t.push({
        issue: "Local installation exists but not being used",
        fix: "Consider using native installation: `claude install`"
      });
    }
    let s = await B0o();
    let i = await kll();
    if (e === "npm-local") {
      if (!(await Qm("claude")) && !i) {
        if (s) {
          t.push({
            issue: "Local installation not accessible",
            fix: `Alias exists but points to invalid target: ${s}. Update alias: alias claude="~/.claude/local/claude"`
          });
        } else {
          t.push({
            issue: "Local installation not accessible",
            fix: 'Create alias: alias claude="~/.claude/local/claude"'
          });
        }
      }
    }
    return t;
  }
  async function ipm() {
    return null;
  }
  function apm() {
    if (Wt() !== "linux") {
      return [];
    }
    let e = [];
    let t = SandboxManager.getLinuxGlobPatternWarnings();
    if (t.length > 0) {
      let n = t.slice(0, 3).join(", ");
      let r = t.length - 3;
      let o = r > 0 ? `${n} (${r} more)` : n;
      e.push({
        issue: "Glob patterns in sandbox permission rules are not fully supported on Linux",
        fix: `Found ${t.length} pattern(s): ${o}. On Linux, glob patterns in Edit/Read rules will be ignored.`
      });
    }
    return e;
  }
  async function ZVe({
    probeKeychain: e = false
  } = {}) {
    let t = await pve();
    let n = {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION ? `${{
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION}${ej()}` : "unknown";
    let r = await tpm();
    let o = npm();
    let s = await rpm();
    let i = await spm(t);
    if (i.push(...apm()), e) {
      let h = await ipm();
      if (h) {
        i.push(h);
      }
    }
    if (t === "native") {
      let h = s.filter(y => y.type === "npm-global" || y.type === "npm-global-orphan" || y.type === "npm-local");
      let g = Wt() === "windows";
      for (let y of h) {
        if (y.type === "npm-global") {
          let _ = "npm -g uninstall @anthropic-ai/claude-code";
          if ({
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.PACKAGE_URL && {
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.PACKAGE_URL !== "@anthropic-ai/claude-code") {
            _ += ` && npm -g uninstall ${{
              ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
              PACKAGE_URL: "@anthropic-ai/claude-code",
              README_URL: "https://code.claude.com/docs/en/overview",
              VERSION: "2.1.198",
              FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
              BUILD_TIME: "2026-07-01T06:09:31Z",
              GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
            }.PACKAGE_URL}`;
          }
          i.push({
            issue: `Leftover npm global installation at ${y.path}`,
            fix: `Run: ${_}`
          });
        } else if (y.type === "npm-global-orphan") {
          i.push({
            issue: `Orphaned npm global package at ${y.path}`,
            fix: g ? `Run: rmdir /s /q "${y.path}"` : `Run: rm -rf ${y.path}`
          });
        } else if (y.type === "npm-local") {
          i.push({
            issue: `Leftover npm local installation at ${y.path}`,
            fix: g ? `Run: rmdir /s /q "${y.path}"` : `Run: rm -rf ${y.path}`
          });
        }
      }
    }
    let l = getGlobalConfig().installMethod || "not set";
    let c = null;
    if (t === "npm-global") {
      if (c = (await Bll()).hasPermissions, !c && !getAutoUpdaterDisabledReason()) {
        i.push({
          issue: "Can't auto-update: npm global folder isn't writable",
          fix: "Run `claude install` to switch to the native installer (no sudo)\nOr reinstall with a sudo-free npm (e.g. via nvm)\nOr `npm config set prefix ~/.npm-global`, add ~/.npm-global/bin to PATH, then reinstall"
        });
      }
    }
    let u = iua();
    let d = {
      working: u.working ?? true,
      mode: u.mode,
      systemPath: u.mode === "system" ? u.path : null
    };
    let p = t === "package-manager" ? await QVe() : undefined;
    let m = await cYn();
    return {
      installationType: t,
      version: n,
      installationPath: r,
      invokedBinary: o,
      configInstallMethod: l,
      autoUpdates: (() => {
        let h = getAutoUpdaterDisabledReason();
        return h ? `disabled (${formatAutoUpdaterDisabledReason(h)})` : "enabled";
      })(),
      hasUpdatePermissions: c,
      lastUpdateResult: m,
      multipleInstallations: s,
      warnings: i,
      packageManager: p,
      ripgrepStatus: d
    };
  }
  var Czt;
  var O1e;
  var yE;
  var D1e = __lazy(() => {
    no();
    uve();
    vo();
    pr();
    gn();
    ji();
    H_t();
    zVe();
    pYn();
    Cs();
    eoe();
    oF();
    Th();
    o8();
    Bte();
    Ike();
    Kke();
    Rj();
    sYn();
    Czt = require("fs/promises");
    O1e = require("os");
    yE = require("path");
  });
  var Gll = () => {};
  function Q0o(e, t) {
    return WHe(e) ? aEe.get(e, t) : externalHttp.get(e, t);
  }
  async function cpm(e = "latest", t, n) {
    let r = Date.now();
    let o = 0;
    try {
      let s = await tYn(a => (o++, Q0o(`${t}/${e}`, {
        timeout: 30000,
        responseType: "text",
        signal: a,
        ...n
      })), {
        attempts: 3,
        timeoutMs: 30000,
        onRetry: (a, l) => {
          logForDebugging(`Version check failed on attempt ${a}/${3}, retrying: ${l instanceof Error ? l.message : String(l)}`);
        }
      });
      let i = Date.now() - r;
      if (logEvent("tengu_version_check_success", {
        latency_ms: i,
        attempt: o
      }), o > 1) {
        Et("update_check", "update_check_binary_repo_retry");
      } else {
        Pe("update_check");
      }
      return s.data.trim();
    } catch (s) {
      let i = Date.now() - r;
      let a = s instanceof Error ? s.message : String(s);
      let l = J0o(s);
      Ae("update_check", "update_check_binary_repo_failed");
      logEvent("tengu_version_check_failure", {
        latency_ms: i,
        http_status: l,
        is_timeout: X0o(s),
        attempt: o,
        platform: L8(gpm()),
        channel: e
      });
      let c = Error(`Failed to fetch version from ${t}/${e} after ${o} attempt(s): ${a}`);
      throw logForDebugging(`Failed to fetch version from ${t}/${e} after ${o} attempt(s): ${a}`, {
        level: "error"
      }), c;
    }
  }
  async function Rzt(e) {
    if (/^v?\d+\.\d+\.\d+(-\S+)?$/.test(e)) {
      let n = e.startsWith("v") ? e.slice(1) : e;
      if (/^99\.99\./.test(n)) {
        throw Error(`Version ${n} is not available for installation. Use 'stable' or 'latest'.`);
      }
      return n;
    }
    let t = e;
    if (t !== "stable" && t !== "latest" && t !== "rc") {
      throw Error(`Invalid channel: ${e}. Use 'latest' or 'stable'`);
    }
    if (t === "rc") {
      throw Error(`Invalid channel: ${e}. Use 'stable' or 'latest'`);
    }
    return cpm(t, "https://downloads.claude.ai/claude-code-releases");
  }
  function ppm() {
    return Number(process.env.CLAUDE_CODE_STALL_TIMEOUT_MS_FOR_TESTING) || 120000;
  }
  async function mpm(e, t, n, r = {}) {
    let o;
    let s = false;
    for (let i = 1; i <= 3; i++) {
      let a = new AbortController();
      let l;
      let c = () => {
        if (l) {
          clearTimeout(l);
          l = undefined;
        }
      };
      let u = () => {
        c();
        l = setTimeout(d => d.abort(), ppm(), a);
      };
      try {
        u();
        let d = await Q0o(e, {
          timeout: 600000,
          responseType: "arraybuffer",
          signal: a.signal,
          onDownloadProgress: () => {
            u();
          },
          ...r
        });
        c();
        let p = Buffer.isBuffer(d.data) ? d.data : Buffer.from(d.data);
        let m = Kll.createHash("sha256");
        m.update(p);
        let f = m.digest("hex");
        if (f !== t) {
          throw Error(`Checksum mismatch: expected ${t}, got ${f}`);
        }
        await mYn.writeFile(n, p);
        await mYn.chmod(n, 493);
        return s;
      } catch (d) {
        c();
        let p = isCancel(d);
        let m = d instanceof Error && d.message.includes("Checksum mismatch");
        let f = p ? new fYn() : sr(d);
        if (o = f, (p || m) && i < 3) {
          if (m) {
            s = true;
          }
          logForDebugging(`Download ${m ? "checksum mismatch" : "stalled"} on attempt ${i}/${3}, retrying...`);
          await sleep(1000);
          continue;
        }
        throw Object.assign(f, {
          attempt: i
        });
      }
    }
    throw o ?? Error("Download failed after all retries");
  }
  async function fpm(e, t, n, r) {
    let o = zt();
    await o.rm(t, {
      recursive: true,
      force: true
    });
    let s = gse();
    let i = Date.now();
    logEvent("tengu_binary_download_attempt", {});
    let a;
    try {
      a = (await Q0o(`${n}/${e}/manifest.json`, {
        timeout: 1e4,
        responseType: "json",
        ...r
      })).data;
    } catch (m) {
      let f = Date.now() - i;
      let h = m instanceof Error ? m.message : String(m);
      throw Ae("update_download", "update_download_manifest_failed"), logEvent("tengu_binary_manifest_fetch_failure", {
        latency_ms: f,
        http_status: J0o(m),
        is_timeout: X0o(m),
        platform: L8(s)
      }), logForDebugging(`Failed to fetch manifest from ${n}/${e}/manifest.json: ${h}`, {
        level: "error"
      }), m;
    }
    let l = a.platforms[s];
    if (!l) {
      throw Ae("update_download", "update_download_platform_not_found"), logEvent("tengu_binary_platform_not_found", {}), Error(`Native binaries for ${s} are not available on this release channel (version ${e} ships: ${Object.keys(a.platforms).sort().join(", ")}).`);
    }
    let c = l.checksum;
    let u = hYn(s);
    let d = `${n}/${e}/${s}/${u}`;
    await o.mkdir(t);
    let p = Yll.join(t, u);
    try {
      let m = await mpm(d, c, p, r || {});
      let f = Date.now() - i;
      if (m) {
        Et("update_download", "update_download_checksum_retry");
      } else {
        Pe("update_download");
      }
      logEvent("tengu_binary_download_success", {
        latency_ms: f
      });
    } catch (m) {
      let f = Date.now() - i;
      let h = m instanceof Error ? m.message : String(m);
      let g = h.includes("Checksum mismatch");
      if (g) {
        Ae("update_download", "update_download_checksum_mismatch");
      } else if (m instanceof fYn) {
        Ae("update_download", "update_download_stall_timeout");
      } else {
        Ae("update_download", "update_download_binary_failed");
      }
      throw logEvent("tengu_binary_download_failure", {
        latency_ms: f,
        http_status: J0o(m),
        is_timeout: X0o(m),
        is_checksum_mismatch: g,
        attempt: hpm(m),
        platform: L8(s)
      }), logForDebugging(`Failed to download binary from ${d}: ${h}`, {
        level: "error"
      }), m;
    }
  }
  async function Xll(e, t) {
    await fpm(e, t, "https://downloads.claude.ai/claude-code-releases");
    return "binary";
  }
  function J0o(e) {
    if (isAxiosError(e) && e.response) {
      return e.response.status;
    }
    return;
  }
  function X0o(e) {
    if (e instanceof fYn) {
      return true;
    }
    if (isCancel(e)) {
      return true;
    }
    if (isAxiosError(e) && (e.code === "ECONNABORTED" || e.code === "ETIMEDOUT")) {
      return true;
    }
    if (e !== null && typeof e === "object" && "code" in e && e.code === "ETIMEDOUT") {
      return true;
    }
    let t = (e instanceof Error ? e.message : String(e)).toLowerCase();
    return t.includes("timeout") || t.includes("timed out");
  }
  function hpm(e) {
    if (e !== null && typeof e === "object" && "attempt" in e && typeof e.attempt === "number") {
      return e.attempt;
    }
    return;
  }
  function gpm() {
    try {
      return gse();
    } catch {
      return "unknown";
    }
  }
  var Kll;
  var mYn;
  var Yll;
  var fYn;
  var Z0o = __lazy(() => {
    ln();
    Ot();
    Gu();
    h9t();
    pk();
    qtt();
    je();
    dt();
    ji();
    Gll();
    eIo();
    F0o();
    Kll = require("crypto");
    mYn = require("fs/promises");
    Yll = require("path");
    fYn = class fYn extends Error {
      constructor() {
        super("Download stalled: no data received for 120 seconds");
        this.name = "StallTimeoutError";
      }
    };
  });
  function M1e() {
    return !Pl(undefined);
  }
  function gYn(e) {
    if (e <= 1) {
      return false;
    }
    try {
      process.kill(e, 0);
      return true;
    } catch {
      return false;
    }
  }
  function _pm(e, t) {
    if (!gYn(e)) {
      return false;
    }
    if (e === process.pid) {
      return true;
    }
    try {
      let n = getProcessCommand(e);
      if (!n) {
        return true;
      }
      let r = n.toLowerCase();
      let o = t.toLowerCase();
      return r.includes("claude") || r.includes(o);
    } catch {
      return true;
    }
  }
  function eze(e) {
    let t = zt();
    try {
      let n = t.readFileSync(e, {
        encoding: "utf8"
      });
      if (!n || n.trim() === "") {
        return null;
      }
      let r = qt(n);
      if (typeof r.pid !== "number" || !r.version || !r.execPath) {
        return null;
      }
      return r;
    } catch {
      return null;
    }
  }
  function kzt(e) {
    let t = eze(e);
    if (!t) {
      return false;
    }
    let {
      pid: n,
      execPath: r
    } = t;
    if (!gYn(n)) {
      return false;
    }
    if (!_pm(n, r)) {
      logForDebugging(`Lock PID ${n} is running but does not appear to be Claude - treating as stale`);
      return false;
    }
    let o = zt();
    try {
      let s = o.statSync(e);
      if (Date.now() - s.mtimeMs > 7200000) {
        if (!gYn(n)) {
          return false;
        }
      }
    } catch {}
    return true;
  }
  function bpm(e, t) {
    vj(e, De(t, null, 2));
  }
  async function Qll(e, t) {
    let n = zt();
    let r = xzt.basename(e);
    if (kzt(t)) {
      let s = eze(t);
      logForDebugging(`Cannot acquire lock for ${r} - held by PID ${s?.pid}`);
      return null;
    }
    let o = {
      pid: process.pid,
      version: r,
      execPath: process.execPath,
      acquiredAt: Date.now()
    };
    try {
      if (bpm(t, o), eze(t)?.pid !== process.pid) {
        return null;
      }
      logForDebugging(`Acquired PID lock for ${r} (PID ${process.pid})`);
      return () => {
        try {
          if (eze(t)?.pid === process.pid) {
            n.unlinkSync(t);
            logForDebugging(`Released PID lock for ${r}`);
          }
        } catch (i) {
          logForDebugging(`Failed to release lock for ${r}: ${i}`);
        }
      };
    } catch (s) {
      logForDebugging(`Failed to acquire lock for ${r}: ${s}`);
      return null;
    }
  }
  async function Zll(e, t) {
    let n = await Qll(e, t);
    if (!n) {
      return false;
    }
    let r = () => {
      try {
        n();
      } catch {}
    };
    process.on("exit", r);
    process.on("SIGINT", r);
    process.on("SIGTERM", r);
    return true;
  }
  async function ecl(e, t, n) {
    let r = await Qll(e, t);
    if (!r) {
      return false;
    }
    try {
      await n();
      return true;
    } finally {
      r();
    }
  }
  function tcl(e) {
    let t = zt();
    let n = [];
    try {
      let r = t.readdirStringSync(e).filter(o => o.endsWith(".lock"));
      for (let o of r) {
        let s = xzt.join(e, o);
        let i = eze(s);
        if (i) {
          n.push({
            version: i.version,
            pid: i.pid,
            isProcessRunning: gYn(i.pid),
            execPath: i.execPath,
            acquiredAt: new Date(i.acquiredAt),
            lockFilePath: s
          });
        }
      }
    } catch (r) {
      if (fn(r)) {
        return n;
      }
      Oe(sr(r));
    }
    return n;
  }
  async function _Yn(e) {
    let t = zt();
    let n = 0;
    let r;
    try {
      r = (await yYn.readdir(e)).filter(o => o.endsWith(".lock"));
    } catch (o) {
      if (fn(o)) {
        return 0;
      }
      logForDebugging(`Failed to readdir locks directory: ${sr(o).message}`, {
        level: "error"
      });
      return 0;
    }
    for (let o of r) {
      let s = xzt.join(e, o);
      try {
        if ((await yYn.lstat(s)).isDirectory()) {
          t.rmSync(s, {
            recursive: true,
            force: true
          });
          n++;
          logForDebugging(`Cleaned up legacy directory lock: ${o}`);
        } else if (!kzt(s)) {
          t.unlinkSync(s);
          n++;
          logForDebugging(`Cleaned up stale lock: ${o}`);
        }
      } catch {}
      await new Promise(i => setImmediate(i));
    }
    return n;
  }
  var yYn;
  var xzt;
  var tIo = __lazy(() => {
    BT();
    je();
    gn();
    dt();
    Tb();
    Rn();
    yYn = require("fs/promises");
    xzt = require("path");
  });
  function gse() {
    let e = Me.platform;
    let t = "arm64";
    if (!t) {
      let n = Error("Unsupported architecture: arm64");
      throw logForDebugging("Native installer does not support architecture: arm64", {
        level: "error"
      }), n;
    }
    if (false) {
      t = "arm64";
    }
    if (e === "linux") {
      if (nM.isAndroidEnvironment()) {
        return `linux-${t}-android`;
      }
      if (nM.isMuslEnvironment()) {
        return `linux-${t}-musl`;
      }
    }
    return `${e}-${t}`;
  }
  function hYn(e) {
    return e.startsWith("win32") ? "claude.exe" : "claude";
  }
  function Tme() {
    let e = gse();
    let t = hYn(e);
    return {
      versions: Wm.join(boe(), "claude", "versions"),
      staging: Wm.join(tIa(), "claude", "staging"),
      locks: Wm.join(uqn(), "claude", "locks"),
      executable: Wm.join(zde(), t)
    };
  }
  async function tze(e) {
    try {
      let t = await Oc.stat(e);
      if (!t.isFile() || t.size === 0) {
        return false;
      }
      return (t.mode & scl.constants.S_IXUSR) !== 0;
    } catch {
      return false;
    }
  }
  async function sIo(e) {
    let t = Tme();
    let n = [t.versions, t.staging, t.locks];
    await Promise.all(n.map(s => Oc.mkdir(s, {
      recursive: true
    })));
    let r = Wm.dirname(t.executable);
    if (await Oc.mkdir(r, {
      recursive: true
    }), !/^[a-zA-Z0-9._+-]+$/.test(e) || e.includes("..") || e === ".") {
      throw Error(`Invalid version string "${e}": contains path-unsafe characters`);
    }
    let o = Wm.join(t.versions, e);
    try {
      await Oc.writeFile(o, "", {
        encoding: "utf8",
        flag: "wx"
      });
    } catch (s) {
      if (en(s) !== "EEXIST") {
        throw s;
      }
    }
    return {
      stagingPath: Wm.join(t.staging, e),
      installPath: o
    };
  }
  async function acl(e, t, n = 0) {
    let r = Tme();
    let o = Azt(r, e);
    if (await Oc.mkdir(r.locks, {
      recursive: true
    }), M1e()) {
      let i = 0;
      let a = n + 1;
      let l = n > 0 ? 1000 : 100;
      let c = n > 0 ? 5000 : 500;
      while (i < a) {
        if (await ecl(e, o, async () => {
          try {
            await t();
          } catch (d) {
            throw logForDebugging(`Native installer version-lock callback failed: ${d}`, {
              level: "error"
            }), d;
          }
        })) {
          logEvent("tengu_version_lock_acquired", {
            is_pid_based: true,
            is_lifetime_lock: false,
            attempts: i + 1
          });
          return true;
        }
        if (i++, i < a) {
          let d = Math.min(l * Math.pow(2, i - 1), c);
          await sleep(d);
        }
      }
      logEvent("tengu_version_lock_failed", {
        is_pid_based: true,
        is_lifetime_lock: false,
        attempts: a
      });
      SYn(e, Error("Lock held by another process"));
      return false;
    }
    let s = null;
    try {
      try {
        s = await Ry(e, {
          stale: 604800000,
          retries: {
            retries: n,
            minTimeout: n > 0 ? 1000 : 100,
            maxTimeout: n > 0 ? 5000 : 500
          },
          lockfilePath: o,
          onCompromised: i => {
            logForDebugging(`NON-FATAL: Version lock was compromised during operation: ${i.message}`, {
              level: "info"
            });
          }
        });
      } catch (i) {
        logEvent("tengu_version_lock_failed", {
          is_pid_based: false,
          is_lifetime_lock: false
        });
        SYn(e, i);
        return false;
      }
      try {
        await t();
        logEvent("tengu_version_lock_acquired", {
          is_pid_based: false,
          is_lifetime_lock: false
        });
        return true;
      } catch (i) {
        throw logForDebugging(`tryWithVersionLock: callback failed under version lock: ${he(i)}`, {
          level: "error"
        }), i;
      }
    } finally {
      if (s) {
        await s();
      }
    }
  }
  async function lcl(e, t) {
    await Oc.mkdir(Wm.dirname(t), {
      recursive: true
    });
    let n = `${t}.tmp.${process.pid}.${Date.now()}`;
    try {
      await Oc.copyFile(e, n);
      await Oc.chmod(n, 493);
      await Oc.rename(n, t);
      logForDebugging(`Atomically installed binary to ${t}`);
    } catch (r) {
      try {
        await Oc.unlink(n);
      } catch {}
      throw r;
    }
  }
  async function Tpm(e, t) {
    try {
      let n = Wm.join(e, "node_modules", "@anthropic-ai");
      let o = (await Oc.readdir(n)).find(i => i.startsWith("claude-cli-native-"));
      if (!o) {
        throw logEvent("tengu_native_install_package_failure", {
          stage_find_package: true,
          error_package_not_found: true
        }), Error("Could not find platform-specific native package");
      }
      let s = Wm.join(n, o, "cli");
      try {
        await Oc.stat(s);
      } catch {
        throw logEvent("tengu_native_install_package_failure", {
          stage_binary_exists: true,
          error_binary_not_found: true
        }), Error("Native binary not found in staged package");
      }
      await lcl(s, t);
      await Oc.rm(e, {
        recursive: true,
        force: true
      });
      logEvent("tengu_native_install_package_success", {});
    } catch (n) {
      let r = he(n);
      if (!(r.includes("Could not find platform-specific") || r.includes("Native binary not found"))) {
        if (logEvent("tengu_native_install_package_failure", {
          stage_atomic_move: true,
          error_move_failed: true
        }), Zd(n)) {
          logForDebugging(`installVersionFromPackage: atomic move failed: ${r}`, {
            level: "error"
          });
        } else {
          Oe(sr(n));
        }
      } else {
        logForDebugging(`installVersionFromPackage: ${r}`, {
          level: "error"
        });
      }
      throw n;
    }
  }
  async function Epm(e, t) {
    try {
      let n = gse();
      let r = hYn(n);
      let o = Wm.join(e, r);
      try {
        await Oc.stat(o);
      } catch {
        throw logEvent("tengu_native_install_binary_failure", {
          stage_binary_exists: true,
          error_binary_not_found: true
        }), Error("Staged binary not found");
      }
      await lcl(o, t);
      await Oc.rm(e, {
        recursive: true,
        force: true
      });
      logEvent("tengu_native_install_binary_success", {});
    } catch (n) {
      if (!he(n).includes("Staged binary not found")) {
        logEvent("tengu_native_install_binary_failure", {
          stage_atomic_move: true,
          error_move_failed: true
        });
      }
      if (Zd(n)) {
        logForDebugging(`installVersionFromBinary: atomic move failed: ${he(n)}`, {
          level: "error"
        });
      } else {
        Oe(sr(n));
      }
      throw n;
    }
  }
  async function vpm(e, t, n) {
    if (n === "npm") {
      await Tpm(e, t);
    } else {
      await Epm(e, t);
    }
  }
  async function ncl(e, t) {
    let {
      stagingPath: n,
      installPath: r
    } = await sIo(e);
    let {
      executable: o
    } = Tme();
    let s = st("true") ? `${n}.${process.pid}.${Date.now()}` : n;
    let i = !(await ccl(e)) || t;
    if (i) {
      logForDebugging(t ? `Force reinstalling native installer version ${e}` : `Downloading native installer version ${e}`);
      let l = await Xll(e, s);
      await vpm(s, r, l);
    } else {
      logForDebugging(`Version ${e} already installed, updating symlink`);
    }
    if (await Rpm(o), !(await xpm(o, r)) && !(await tze(o))) {
      let l = false;
      try {
        await Oc.stat(r);
        l = true;
      } catch {}
      throw Error(`Failed to create executable at ${o}. Source file exists: ${l}. Check write permissions to ${o}.`);
    }
    return i;
  }
  async function ccl(e) {
    let {
      installPath: t
    } = await sIo(e);
    return tze(t);
  }
  function wpm() {
    try {
      let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_canary", {});
      return typeof e.external === "string" && icl.valid(e.external) || null;
    } catch (e) {
      logForDebugging(`getCanaryVersion: GB read failed, falling through: ${he(e)}`);
      return null;
    }
  }
  async function Cpm(e, t = false) {
    let n = Date.now();
    let {
      executable: r
    } = Tme();
    let o = !/^v?\d+\.\d+\.\d+(-\S+)?$/.test(e);
    let {
      maxVersion: s,
      forceDowngradeEnabled: i
    } = await JVe();
    let a = i && !t && o && !!s && F_t({
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION, s, "native_update");
    let l = a ? s : await Rzt(e);
    if (logForDebugging(`Checking for native installer update to version ${l}`), e === "latest" && !a) {
      let d = wpm();
      let p = d && s && mv(d, s);
      if (d && mv(d, l) && !p) {
        logForDebugging(`Native installer: canary ${d} active, overriding ${l}`);
        l = d;
      } else if (p) {
        logForDebugging(`Native installer: canary ${d} exceeds maxVersion ${s}, not applying`);
      }
    }
    if (!a && !t && s && mv(l, s)) {
      if (logForDebugging(`Native installer: maxVersion ${s} is set, capping update from ${l} to ${s}`), iO({
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION, s)) {
        logForDebugging(`Native installer: current version ${{
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION} is already at or above maxVersion ${s}, skipping update`);
        logEvent("tengu_native_update_skipped_max_version", {
          latency_ms: Date.now() - n,
          max_version: uS(s),
          available_version: uS(l)
        });
        return {
          success: true,
          wasSkipped: true,
          latestVersion: l
        };
      }
      l = s;
    }
    if (!t && l === {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION && (await ccl(l)) && (await tze(r))) {
      logForDebugging(`Found ${l} at ${r}, skipping install`);
      logEvent("tengu_native_update_complete", {
        latency_ms: Date.now() - n,
        was_new_install: false,
        was_force_reinstall: false,
        was_already_running: true
      });
      return {
        success: true,
        wasSkipped: true,
        latestVersion: l
      };
    }
    if (!t && U_t(l)) {
      logEvent("tengu_native_update_skipped_minimum_version", {
        latency_ms: Date.now() - n,
        target_version: uS(l)
      });
      return {
        success: true,
        wasSkipped: true,
        latestVersion: l
      };
    }
    if (a) {
      logEvent("tengu_native_update_forced_downgrade", {
        from_version: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION,
        to_version: uS(l)
      });
    }
    let c = false;
    let u;
    if (st("true")) {
      c = await ncl(l, t);
      u = Date.now() - n;
    } else {
      let {
        installPath: d
      } = await sIo(l);
      if (t) {
        await Apm(d);
      }
      let p = await acl(d, async () => {
        c = await ncl(l, t);
      }, 3);
      if (u = Date.now() - n, !p) {
        let m = Tme();
        let f;
        if (M1e()) {
          let h = Azt(m, d);
          if (kzt(h)) {
            f = eze(h)?.pid;
          }
        }
        Et("update_apply", "update_apply_native_lock_failed");
        logEvent("tengu_native_update_lock_failed", {
          latency_ms: u,
          lock_holder_pid: f
        });
        return {
          success: false,
          latestVersion: l,
          lockFailed: true,
          lockHolderPid: f
        };
      }
    }
    Pe("update_apply");
    logEvent("tengu_native_update_complete", {
      latency_ms: u,
      was_new_install: c,
      was_force_reinstall: t
    });
    logForDebugging(`Successfully updated to version ${l}`);
    return {
      success: true,
      latestVersion: l
    };
  }
  async function Rpm(e) {
    try {
      await Oc.rmdir(e);
      logForDebugging(`Removed empty directory at ${e}`);
    } catch (t) {
      let n = en(t);
      if (n !== "ENOTDIR" && n !== "ENOENT" && n !== "ENOTEMPTY") {
        logForDebugging(`Could not remove directory at ${e}: ${t}`);
      }
    }
  }
  async function xpm(e, t) {
    if (gse().startsWith("win32")) {
      try {
        let i = Wm.dirname(e);
        await Oc.mkdir(i, {
          recursive: true
        });
        let a;
        try {
          a = await Oc.stat(e);
        } catch {}
        if (a) {
          try {
            let c = await Oc.stat(t);
            if (a.size === c.size) {
              return false;
            }
          } catch {}
          let l = `${e}.old.${Date.now()}`;
          await Oc.rename(e, l);
          try {
            await Oc.copyFile(t, e);
            try {
              await Oc.unlink(l);
            } catch {}
          } catch (c) {
            try {
              await Oc.rename(l, e);
            } catch (u) {
              let d = Error(`Failed to restore old executable: ${u}`, {
                cause: c
              });
              throw Oe(d), d;
            }
            throw c;
          }
        } else {
          try {
            await Oc.copyFile(t, e);
          } catch (l) {
            if (fn(l)) {
              throw Error(`Source file does not exist: ${t}`);
            }
            throw l;
          }
        }
        return true;
      } catch (i) {
        logForDebugging(`Failed to copy executable from ${t} to ${e}: ${i}`, {
          level: "error"
        });
        return false;
      }
    }
    let o = Wm.dirname(e);
    try {
      await Oc.mkdir(o, {
        recursive: true
      });
      logForDebugging(`Created directory ${o} for symlink`);
    } catch (i) {
      logForDebugging(`Failed to create directory ${o}: ${i}`, {
        level: "error"
      });
      return false;
    }
    let s = `${e}.tmp.${process.pid}.${Date.now()}`;
    try {
      await Oc.symlink(t, s);
      await Oc.rename(s, e);
      logForDebugging(`Atomically updated symlink ${e} -> ${t}`);
      return true;
    } catch (i) {
      try {
        await Oc.unlink(s);
      } catch {}
      logForDebugging(`Failed to create symlink from ${e} to ${t}: ${i}`, {
        level: "error"
      });
      return false;
    }
  }
  async function nze(e = false) {
    if (st(process.env.DISABLE_INSTALLATION_CHECKS)) {
      return [];
    }
    let t = await pve();
    if (t === "development") {
      return [];
    }
    let n = getGlobalConfig();
    if (!(e || t === "native" || n.installMethod === "native")) {
      return [];
    }
    let o = Tme();
    let s = [];
    let i = [];
    let a = Wm.dirname(o.executable);
    let l = Wm.resolve(a);
    let u = gse().startsWith("win32");
    try {
      await Oc.access(a);
    } catch {
      s.push({
        message: `claude command at ${o.executable} missing or broken (${a} does not exist)`,
        userActionRequired: true,
        type: "error"
      });
      i.push("bin_dir_missing");
    }
    if (u) {
      if (!(await tze(o.executable))) {
        s.push({
          message: `claude command at ${o.executable} missing or broken`,
          userActionRequired: true,
          type: "error"
        });
        i.push("executable_missing");
      }
    } else {
      try {
        let p = await Oc.readlink(o.executable);
        let m = Wm.resolve(Wm.dirname(o.executable), p);
        if (!(await tze(m))) {
          s.push({
            message: `claude command at ${o.executable} missing or broken (symlink points to ${p})`,
            userActionRequired: true,
            type: "error"
          });
          i.push("executable_invalid");
        }
      } catch (p) {
        if (fn(p)) {
          s.push({
            message: `claude command at ${o.executable} missing or broken`,
            userActionRequired: true,
            type: "error"
          });
          i.push("executable_missing");
        } else if (!(await tze(o.executable))) {
          s.push({
            message: `claude command at ${o.executable} missing or broken (not a valid Claude binary)`,
            userActionRequired: true,
            type: "error"
          });
          i.push("executable_invalid");
        }
      }
    }
    if (!(process.env.PATH || "").split(Wm.delimiter).some(p => {
      try {
        let m = Wm.resolve(p);
        if (u) {
          return m.toLowerCase() === l.toLowerCase();
        }
        return m === l;
      } catch {
        return false;
      }
    })) {
      if (i.push("not_in_path"), u) {
        let p = a.replaceAll("/", "\\");
        s.push({
          message: `Native installation exists but ${p} is not in your PATH. Add it by opening: System Properties \u2192 Environment Variables \u2192 Edit User PATH \u2192 New \u2192 Add the path above. Then restart your terminal.`,
          userActionRequired: true,
          type: "path"
        });
      } else {
        let p = O_t();
        let f = P1e()[p];
        let h = f ? f.replace(rIo.homedir(), "~") : "your shell config file";
        s.push({
          message: `Native installation exists but ~/.local/bin is not in your PATH. Run:

echo 'export PATH="$HOME/.local/bin:$PATH"' >> ${h} && source ${h}`,
          userActionRequired: true,
          type: "path"
        });
      }
    }
    if (i.length === 0) {
      Pe("native_check_install");
    } else {
      Et("native_check_install", i[0]);
    }
    return s;
  }
  function rze(e, t = false) {
    if (t) {
      return rcl(e, t);
    }
    if (bYn) {
      logForDebugging("installLatest: joining in-flight call");
      return bYn;
    }
    let n = rcl(e, t);
    bYn = n;
    let r = () => {
      bYn = null;
    };
    n.then(r, r);
    return n;
  }
  async function rcl(e, t = false) {
    let n = await Cpm(e, t);
    if (!n.success) {
      return {
        latestVersion: null,
        wasUpdated: false,
        lockFailed: n.lockFailed,
        lockHolderPid: n.lockHolderPid
      };
    }
    if (getGlobalConfig().installMethod !== "native") {
      saveGlobalConfig(o => ({
        ...o,
        installMethod: "native",
        autoUpdates: false,
        autoUpdatesProtectedForNative: true
      }));
      logForDebugging('Native installer: Set installMethod to "native" and disabled legacy auto-updater for protection');
    }
    Izt();
    return {
      latestVersion: n.latestVersion,
      wasUpdated: n.success && !n.wasSkipped,
      wasSkipped: n.wasSkipped,
      lockFailed: false
    };
  }
  async function kpm(e) {
    try {
      let t = await Oc.readlink(e);
      let n = Wm.resolve(Wm.dirname(e), t);
      if (await tze(n)) {
        return n;
      }
    } catch {}
    return null;
  }
  function Azt(e, t) {
    let n = Wm.basename(t);
    return Wm.join(e.locks, `${n}.lock`);
  }
  async function oze() {
    let e = Tme();
    if (!process.execPath.includes(e.versions)) {
      return;
    }
    let t = Wm.resolve(process.execPath);
    try {
      let n = Azt(e, t);
      if (await Oc.mkdir(e.locks, {
        recursive: true
      }), M1e()) {
        if (!(await Zll(t, n))) {
          logEvent("tengu_version_lock_failed", {
            is_pid_based: true,
            is_lifetime_lock: true
          });
          SYn(t, Error("Lock already held by another process"));
          return;
        }
        logEvent("tengu_version_lock_acquired", {
          is_pid_based: true,
          is_lifetime_lock: true
        });
        logForDebugging(`Acquired PID lock on running version: ${t}`);
      } else {
        let r;
        try {
          r = await Ry(t, {
            stale: 604800000,
            retries: 0,
            lockfilePath: n,
            onCompromised: o => {
              logForDebugging(`NON-FATAL: Lock on running version was compromised: ${o.message}`, {
                level: "info"
              });
            }
          });
          logEvent("tengu_version_lock_acquired", {
            is_pid_based: false,
            is_lifetime_lock: true
          });
          logForDebugging(`Acquired mtime-based lock on running version: ${t}`);
          Ti(async () => {
            try {
              await r?.();
            } catch {}
          });
        } catch (o) {
          if (fn(o)) {
            logForDebugging(`Cannot lock current version - file does not exist: ${t}`, {
              level: "info"
            });
            return;
          }
          logEvent("tengu_version_lock_failed", {
            is_pid_based: false,
            is_lifetime_lock: true
          });
          SYn(t, o);
          return;
        }
      }
    } catch (n) {
      if (fn(n)) {
        logForDebugging(`Cannot lock current version - file does not exist: ${t}`, {
          level: "info"
        });
        return;
      }
      logForDebugging(`NON-FATAL: Failed to lock current version during execution ${he(n)}`, {
        level: "info"
      });
    }
  }
  function SYn(e, t) {
    logForDebugging(`NON-FATAL: Lock acquisition failed for ${e} (expected in multi-process scenarios): ${he(t)}`, {
      level: "error"
    });
  }
  async function Apm(e) {
    let t = Tme();
    let n = Azt(t, e);
    try {
      await Oc.unlink(n);
      logForDebugging(`Force-removed lock file at ${n}`);
    } catch (r) {
      logForDebugging(`Failed to force-remove lock file: ${he(r)}`);
    }
  }
  async function Izt() {
    await Promise.resolve();
    let e = Tme();
    let t = Date.now() - 3600000;
    if (gse().startsWith("win32")) {
      let s = Wm.dirname(e.executable);
      try {
        let i = await Oc.readdir(s);
        let a = 0;
        for (let l of i) {
          if (!/^claude\.exe\.old\.\d+$/.test(l)) {
            continue;
          }
          try {
            await Oc.unlink(Wm.join(s, l));
            a++;
          } catch {}
        }
        if (a > 0) {
          logForDebugging(`Cleaned up ${a} old Windows executables on startup`);
        }
      } catch (i) {
        if (!fn(i)) {
          logForDebugging(`Failed to clean up old Windows executables: ${i}`);
        }
      }
    }
    try {
      let s = await Oc.readdir(e.staging);
      let i = 0;
      for (let a of s) {
        let l = Wm.join(e.staging, a);
        try {
          if ((await Oc.stat(l)).mtime.getTime() < t) {
            await Oc.rm(l, {
              recursive: true,
              force: true
            });
            i++;
            logForDebugging(`Cleaned up old staging directory: ${a}`);
          }
        } catch {}
      }
      if (i > 0) {
        logForDebugging(`Cleaned up ${i} orphaned staging directories`);
        logEvent("tengu_native_staging_cleanup", {
          cleaned_count: i
        });
      }
    } catch (s) {
      if (!fn(s)) {
        logForDebugging(`Failed to clean up staging directories: ${s}`);
      }
    }
    if (M1e()) {
      let s = await _Yn(e.locks);
      if (s > 0) {
        logForDebugging(`Cleaned up ${s} stale version locks`);
        logEvent("tengu_native_stale_locks_cleanup", {
          cleaned_count: s
        });
      }
    }
    let n;
    try {
      n = await Oc.readdir(e.versions);
    } catch (s) {
      if (!fn(s)) {
        logForDebugging(`Failed to readdir versions directory: ${s}`);
        Et("native_cleanup_versions", "readdir_failed");
      } else {
        Pe("native_cleanup_versions");
      }
      return;
    }
    let r = [];
    let o = 0;
    for (let s of n) {
      let i = Wm.join(e.versions, s);
      if (/\.tmp\.\d+\.\d+$/.test(s)) {
        try {
          if ((await Oc.stat(i)).mtime.getTime() < t) {
            await Oc.unlink(i);
            o++;
            logForDebugging(`Cleaned up orphaned temp install file: ${s}`);
          }
        } catch {}
        continue;
      }
      try {
        let a = await Oc.stat(i);
        if (!a.isFile()) {
          continue;
        }
        if (a.size > 0 && (a.mode & 73) === 0) {
          continue;
        }
        r.push({
          name: s,
          path: i,
          resolvedPath: Wm.resolve(i),
          mtime: a.mtime,
          size: a.size
        });
      } catch {}
    }
    if (o > 0) {
      logForDebugging(`Cleaned up ${o} orphaned temp install files`);
      logEvent("tengu_native_temp_files_cleanup", {
        cleaned_count: o
      });
    }
    if (r.length === 0) {
      Pe("native_cleanup_versions");
      return;
    }
    try {
      let s = process.execPath;
      let i = new Set();
      if (s && s.includes(e.versions)) {
        i.add(Wm.resolve(s));
      }
      let a = await kpm(e.executable);
      if (a) {
        i.add(a);
      } else if (gse().startsWith("win32")) {
        try {
          let m = await Oc.stat(e.executable);
          for (let f of r) {
            if (f.size === m.size) {
              i.add(f.resolvedPath);
            }
          }
        } catch {}
      }
      for (let m of r) {
        if (i.vZc(m.resolvedPath)) {
          continue;
        }
        let f = Azt(e, m.resolvedPath);
        let h = false;
        if (M1e()) {
          h = kzt(f);
        } else {
          try {
            h = await emi(m.resolvedPath, {
              stale: 604800000,
              lockfilePath: f
            });
          } catch {
            h = false;
          }
        }
        if (h) {
          i.add(m.resolvedPath);
          logForDebugging(`Protecting locked version from cleanup: ${m.name}`);
        }
        await new Promise(g => setImmediate(g));
      }
      let c = r.filter(m => !i.vZc(m.resolvedPath)).sort((m, f) => f.mtime.getTime() - m.mtime.getTime()).slice(2);
      if (c.length === 0) {
        logEvent("tengu_native_version_cleanup", {
          total_count: r.length,
          deleted_count: 0,
          protected_count: i.size,
          retained_count: 2,
          lock_failed_count: 0,
          error_count: 0
        });
        Pe("native_cleanup_versions");
        return;
      }
      let u = 0;
      let d = 0;
      let p = 0;
      if (await Promise.all(c.map(async m => {
        try {
          if (await acl(m.path, async () => {
            await Oc.unlink(m.path);
          })) {
            u++;
          } else {
            d++;
            logForDebugging(`Skipping deletion of ${m.name} - locked by another process`);
          }
        } catch (f) {
          p++;
          logForDebugging(`Failed to delete version ${m.name}: ${f}`, {
            level: "error"
          });
        }
      })), logEvent("tengu_native_version_cleanup", {
        total_count: r.length,
        deleted_count: u,
        protected_count: i.size,
        retained_count: 2,
        lock_failed_count: d,
        error_count: p
      }), p > 0) {
        Et("native_cleanup_versions", "delete_errors");
      } else if (d > 0) {
        Et("native_cleanup_versions", "lock_failed");
      } else {
        Pe("native_cleanup_versions");
      }
    } catch (s) {
      if (!fn(s)) {
        Oe(Error(`Version cleanup failed: ${s}`));
        Et("native_cleanup_versions", "unexpected_error");
      } else {
        Pe("native_cleanup_versions");
      }
    }
  }
  async function Ipm(e) {
    let t = await Oc.realpath(e);
    return t.endsWith(".js") || t.includes("node_modules");
  }
  async function Pzt() {
    let e = Tme();
    try {
      if (await Ipm(e.executable)) {
        logForDebugging(`Skipping removal of ${e.executable} - appears to be npm-managed`);
        Pe("native_remove_symlink");
        return;
      }
      await Oc.unlink(e.executable);
      logForDebugging(`Removed claude symlink at ${e.executable}`);
      Pe("native_remove_symlink");
    } catch (t) {
      if (fn(t)) {
        Pe("native_remove_symlink");
        return;
      }
      logForDebugging(`Failed to remove claude symlink: ${t}`, {
        level: "error"
      });
      Ae("native_remove_symlink", "unlink_failed");
    }
  }
  async function iIo() {
    let e = [];
    let t = P1e();
    let n = false;
    for (let [r, o] of Object.entries(t)) {
      try {
        let s = await Tzt(o);
        if (!s) {
          continue;
        }
        let {
          filtered: i,
          hadAlias: a
        } = rYn(s);
        if (a) {
          await oYn(o, i);
          e.push({
            message: `Removed claude alias from ${o}. Run: unalias claude`,
            userActionRequired: true,
            type: "alias"
          });
          logForDebugging(`Cleaned up claude alias from ${r} config`);
        }
      } catch (s) {
        n = true;
        logForDebugging(`Failed to clean up claude alias from ${o}: ${s}`, {
          level: "error"
        });
        e.push({
          message: `Failed to clean up ${o}: ${s}`,
          userActionRequired: false,
          type: "error"
        });
      }
    }
    if (n) {
      Et("native_cleanup_aliases", "config_write_failed");
    } else {
      Pe("native_cleanup_aliases");
    }
    return e;
  }
  async function Ppm(e) {
    try {
      let t = await execFileNoThrowWithCwd("npm", ["config", "get", "prefix"]);
      if (t.code !== 0 || !t.stdout) {
        return {
          success: false,
          error: "Failed to get npm global prefix"
        };
      }
      let n = t.stdout.trim();
      let r = false;
      async function o(s, i) {
        try {
          await Oc.unlink(s);
          logForDebugging(`Manually removed ${i}: ${s}`);
          return true;
        } catch {
          return false;
        }
      }
      if (gse().startsWith("win32")) {
        let s = Wm.join(n, "claude.cmd");
        let i = Wm.join(n, "claude.ps1");
        let a = Wm.join(n, "claude");
        if (await o(s, "bin script")) {
          r = true;
        }
        if (await o(i, "PowerShell script")) {
          r = true;
        }
        if (await o(a, "bin executable")) {
          r = true;
        }
      } else {
        let s = Wm.join(n, "bin", "claude");
        if (await o(s, "bin symlink")) {
          r = true;
        }
      }
      if (r) {
        logForDebugging(`Successfully removed ${e} manually`);
        let s = gse().startsWith("win32") ? Wm.join(n, "node_modules", e) : Wm.join(n, "lib", "node_modules", e);
        return {
          success: true,
          warning: `${e} executables removed, but node_modules directory was left intact for safety. You may manually delete it later at: ${s}`
        };
      } else {
        return {
          success: false
        };
      }
    } catch (t) {
      logForDebugging(`Manual removal failed: ${t}`, {
        level: "error"
      });
      return {
        success: false,
        error: `Manual removal failed: ${t}`
      };
    }
  }
  async function ocl(e) {
    let {
      code: t,
      stderr: n
    } = await execFileNoThrowWithCwd("npm", ["uninstall", "-g", e], {
      cwd: process.cwd()
    });
    if (t === 0) {
      logForDebugging(`Removed global npm installation of ${e}`);
      return {
        success: true
      };
    } else if (n && !n.includes("npm ERR! code E404")) {
      if (n.includes("npm error code ENOTEMPTY")) {
        logForDebugging(`Failed to uninstall global npm package ${e}: ${n}`, {
          level: "error"
        });
        logForDebugging("Attempting manual removal due to ENOTEMPTY error");
        let r = await Ppm(e);
        if (r.success) {
          return {
            success: true,
            warning: r.warning
          };
        } else if (r.error) {
          return {
            success: false,
            error: `Failed to remove global npm installation of ${e}: ${n}. Manual removal also failed: ${r.error}`
          };
        }
      }
      logForDebugging(`Failed to uninstall global npm package ${e}: ${n}`, {
        level: "error"
      });
      return {
        success: false,
        error: `Failed to remove global npm installation of ${e}: ${n}`
      };
    }
    return {
      success: false
    };
  }
  async function aIo() {
    let e = [];
    let t = [];
    let n = 0;
    let r = false;
    let o = false;
    let s = await ocl("@anthropic-ai/claude-code");
    if (s.success) {
      if (n++, s.warning) {
        t.push(s.warning);
      }
    } else if (s.error) {
      e.push(s.error);
      r = true;
    }
    if ({
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.PACKAGE_URL && {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.PACKAGE_URL !== "@anthropic-ai/claude-code") {
      let a = await ocl({
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.PACKAGE_URL);
      if (a.success) {
        if (n++, a.warning) {
          t.push(a.warning);
        }
      } else if (a.error) {
        e.push(a.error);
        r = true;
      }
    }
    let i = Wm.join(rIo.homedir(), ".claude", "local");
    try {
      await Oc.rm(i, {
        recursive: true
      });
      n++;
      logForDebugging(`Removed local installation at ${i}`);
    } catch (a) {
      if (!fn(a)) {
        e.push(`Failed to remove ${i}: ${a}`);
        logForDebugging(`Failed to remove local installation: ${a}`, {
          level: "error"
        });
        o = true;
      }
    }
    if (e.length === 0) {
      Pe("native_cleanup_npm");
    } else if (n > 0) {
      Et("native_cleanup_npm", "partial_errors");
    } else if (r && !o) {
      Ae("native_cleanup_npm", "npm_uninstall_failed");
    } else if (o && !r) {
      Ae("native_cleanup_npm", "local_install_remove_failed");
    } else {
      Ae("native_cleanup_npm", "npm_uninstall_failed");
    }
    return {
      removed: n,
      errors: e,
      warnings: t
    };
  }
  var scl;
  var Oc;
  var rIo;
  var Wm;
  var icl;
  var bYn = null;
  var eIo = __lazy(() => {
    $n();
    Ot();
    ln();
    Gu();
    uve();
    hd();
    je();
    D1e();
    pr();
    YW();
    gn();
    dt();
    ji();
    zVe();
    Rn();
    sYn();
    zTe();
    Z0o();
    tIo();
    scl = require("fs");
    Oc = require("fs/promises");
    rIo = require("os");
    Wm = require("path");
    icl = __toESM(lq(), 1);
  });
  var qQ = __lazy(() => {
    eIo();
  });
  function N1e() {
    let e = getSettingsWithErrors();
    let n = ["user", "project", "local"].flatMap(r => getMcpConfigsByScope(r).errors);
    return {
      settings: e.settings,
      errors: [...e.errors, ...n]
    };
  }
  function TYn() {
    let e = getSettingsFilePathForSource("localSettings");
    return [...N1e().errors.filter(n => !n.mcpErrorMetadata && n.severity !== "warning" && n.file !== e), ...getLocalSettingsValidationErrors()];
  }
  var W_t = __lazy(() => {
    Iw();
  });
  function EYn(e) {
    let t = e.map(n => n.filter(r => !r.antOnly));
    t.push(e.flatMap(n => n.filter(r => r.antOnly)));
    return t;
  }
  function dcl() {
    return [];
  }
  function pcl(e, t = null, n) {
    let r = e?.find(o => o.name === "ide");
    if (t) {
      let o = S0(t.ideType);
      let s = Foe(t.ideType) ? "plugin" : "extension";
      if (t.error) {
        return [{
          label: "IDE",
          value: bcl.jsxs(Text, {
            children: [color("error", n)(vGd.cross), " Error installing ", o, " ", s, ": ", t.error, `
`, "Please restart your IDE and try again."]
          })
        }];
      }
      if (t.installed) {
        if (r && r.type === "connected") {
          if (t.installedVersion !== r.serverInfo?.version) {
            return [{
              label: "IDE",
              value: `Connected to ${o} ${s} version ${t.installedVersion} (server version: ${r.serverInfo?.version})`
            }];
          } else {
            return [{
              label: "IDE",
              value: `Connected to ${o} ${s} version ${t.installedVersion}`
            }];
          }
        } else {
          return [{
            label: "IDE",
            value: `Installed ${o} ${s}`
          }];
        }
      }
    } else if (r) {
      let o = eTo(r) ?? "IDE";
      if (r.type === "connected") {
        return [{
          label: "IDE",
          value: `Connected to ${o} extension`
        }];
      } else {
        return [{
          label: "IDE",
          value: `${color("error", n)(vGd.cross)} Not connected to ${o}`
        }];
      }
    }
    return [];
  }
  function mcl(e = [], t) {
    let n = e.filter(s => s.name !== "ide");
    if (!n.length) {
      return [];
    }
    let r = {
      connected: 0,
      pending: 0,
      needsAuth: 0,
      disabled: 0,
      failed: 0
    };
    for (let s of n) {
      switch (s.type) {
        case "connected":
          r.connected++;
          break;
        case "pending":
          r.pending++;
          break;
        case "needs-auth":
          r.needsAuth++;
          break;
        case "disabled":
          r.disabled++;
          break;
        case "failed":
          r.failed++;
          break;
      }
    }
    let o = [];
    if (r.connected) {
      o.push(color("success", t)(`${r.connected} connected`));
    }
    if (r.needsAuth) {
      o.push(color("warning", t)(`${r.needsAuth} need auth`));
    }
    if (r.pending) {
      o.push(color("inactive", t)(`${r.pending} pending`));
    }
    if (r.disabled) {
      o.push(color("inactive", t)(`${r.disabled} disabled`));
    }
    if (r.failed) {
      o.push(color("error", t)(`${r.failed} failed`));
    }
    return [{
      label: "MCP servers",
      value: `${o.join(", ")} ${color("inactive", t)("\xB7 /mcp")}`
    }];
  }
  async function fcl() {
    if (Qce()) {
      return [];
    }
    let e = await getMemoryFiles();
    let t = getLargeMemoryFiles(e);
    let n = [];
    let r = getMaxMemoryCharacterCount();
    t.forEach(o => {
      let s = Pd(o.path);
      n.push(`Large ${s} will impact performance (${formatNumber(o.content.length)} chars > ${formatNumber(r)})`);
    });
    return n;
  }
  function hcl() {
    return [{
      label: "Setting sources",
      value: ew().filter(r => {
        if (r === "policySettings" && Rle()) {
          return true;
        }
        let o = getSettingsForSource(r);
        return o !== null && Object.keys(o).length > 0;
      }).map(r => {
        if (r === "policySettings") {
          if (Rle()) {
            return "Enterprise managed settings (helper)";
          }
          let o = getPolicySettingsOrigin();
          if (o === null) {
            return null;
          }
          switch (o) {
            case "remote":
              return "Enterprise managed settings (remote)";
            case "plist":
              return "Enterprise managed settings (plist)";
            case "hklm":
              return "Enterprise managed settings (HKLM)";
            case "file":
              {
                let {
                  hasBase: s,
                  hasDropIns: i
                } = getManagedFileSettingsPresence();
                if (s && i) {
                  return "Enterprise managed settings (file + drop-ins)";
                }
                if (i) {
                  return "Enterprise managed settings (drop-ins)";
                }
                return "Enterprise managed settings (file)";
              }
            case "parent":
              return "Enterprise managed settings (parent process)";
            case "hkcu":
              return "Enterprise managed settings (HKCU)";
          }
        }
        return aPs(r);
      }).filter(r => r !== null)
    }];
  }
  async function gcl() {
    return (await nze()).map(t => t.message);
  }
  async function ycl() {
    let e = await ZVe();
    let t = [];
    let {
      errors: n
    } = N1e();
    if (n.length > 0) {
      let o = Ro(n.map(s => s.file)).join(", ");
      t.push(`Found invalid entries in: ${o}.`);
    }
    if (e.warnings.forEach(r => {
      t.push(r.issue);
    }), e.hasUpdatePermissions === false) {
      t.push("No write permissions for auto-updates");
    }
    return t;
  }
  function vYn() {
    let e = getAccountInformation();
    if (!e) {
      return [];
    }
    let t = [];
    if (e.subscription) {
      t.push({
        label: "Login method",
        value: `${e.subscription} account`
      });
    }
    if (e.tokenSource) {
      t.push({
        label: "Auth token",
        value: e.tokenSource
      });
    }
    if (e.apiKeySource) {
      t.push({
        label: "API key",
        value: e.apiKeySource
      });
    }
    if (shouldUseWIFAuth()) {
      t.push({
        label: "Profile",
        value: getWIFStatusLine()
      });
    }
    if (e.organization && !process.env.IS_DEMO) {
      t.push({
        label: "Organization",
        value: e.organization
      });
    }
    if (e.email && !process.env.IS_DEMO) {
      t.push({
        label: "Email",
        value: e.email
      });
    }
    return t;
  }
  function wYn() {
    let e = getAPIProvider();
    let t = [];
    if (e !== "firstParty") {
      let o = getSecondaryProvider();
      let s = o ? `${THIRD_PARTY_PROVIDER_LABELS[e]} + ${THIRD_PARTY_PROVIDER_LABELS[o]}` : THIRD_PARTY_PROVIDER_LABELS[e];
      t.push({
        label: "API provider",
        value: s
      });
    }
    if (e === "firstParty") {
      let o = process.env.ANTHROPIC_BASE_URL;
      if (o) {
        t.push({
          label: "Anthropic base URL",
          value: o
        });
      }
    } else if (e === "bedrock") {
      let o = process.env.ANTHROPIC_BEDROCK_BASE_URL;
      if (o) {
        t.push({
          label: "Bedrock base URL",
          value: o
        });
      }
      t.push({
        label: "AWS region",
        value: ucl()
      });
      let s = process.env.ANTHROPIC_BEDROCK_SERVICE_TIER;
      if (s) {
        t.push({
          label: "Bedrock service tier",
          value: s
        });
      }
      if (st(process.env.CLAUDE_CODE_SKIP_BEDROCK_AUTH)) {
        t.push({
          value: "AWS auth skipped"
        });
      }
    } else if (e === "vertex") {
      let o = process.env.ANTHROPIC_VERTEX_BASE_URL;
      if (o) {
        t.push({
          label: "Vertex base URL",
          value: o
        });
      }
      let s = process.env.ANTHROPIC_VERTEX_PROJECT_ID;
      if (s) {
        t.push({
          label: "GCP project",
          value: s
        });
      }
      if (t.push({
        label: "Default region",
        value: Xln()
      }), st(process.env.CLAUDE_CODE_SKIP_VERTEX_AUTH)) {
        t.push({
          value: "GCP auth skipped"
        });
      }
    } else if (e === "foundry") {
      let o = process.env.ANTHROPIC_FOUNDRY_BASE_URL;
      if (o) {
        t.push({
          label: "Microsoft Foundry base URL",
          value: o
        });
      }
      let s = process.env.ANTHROPIC_FOUNDRY_RESOURCE;
      if (s) {
        t.push({
          label: "Microsoft Foundry resource",
          value: s
        });
      }
      if (st(process.env.CLAUDE_CODE_SKIP_FOUNDRY_AUTH)) {
        t.push({
          value: "Microsoft Foundry auth skipped"
        });
      }
    } else if (e === "anthropicAws") {
      let o = process.env.ANTHROPIC_AWS_BASE_URL;
      if (o) {
        t.push({
          label: "Claude Platform on AWS base URL",
          value: o
        });
      }
      let s = process.env.ANTHROPIC_AWS_WORKSPACE_ID;
      if (s) {
        t.push({
          label: "Workspace ID",
          value: s
        });
      }
      if (t.push({
        label: "AWS region",
        value: YHe()
      }), st(process.env.CLAUDE_CODE_SKIP_ANTHROPIC_AWS_AUTH)) {
        t.push({
          value: "Claude Platform on AWS auth skipped"
        });
      }
    } else if (e === "gateway") {
      let o = getGatewayAuth();
      if (o) {
        t.push({
          label: "Gateway URL",
          value: o.url
        });
      }
    }
    if (e === "mantle" || getSecondaryProvider() === "mantle") {
      let o = process.env.ANTHROPIC_BEDROCK_MANTLE_BASE_URL;
      if (o) {
        t.push({
          label: "Amazon Bedrock (Mantle) base URL",
          value: o
        });
      }
      if (e === "mantle") {
        t.push({
          label: "AWS region",
          value: ucl()
        });
      }
      if (st(process.env.CLAUDE_CODE_SKIP_MANTLE_AUTH)) {
        t.push({
          value: "Amazon Bedrock (Mantle) auth skipped"
        });
      }
    }
    let n = getProxyUrl();
    if (n) {
      t.push({
        label: "Proxy",
        value: n
      });
    }
    let r = getMTLSConfig();
    if (process.env.NODE_EXTRA_CA_CERTS) {
      t.push({
        label: "Additional CA cert(s)",
        value: process.env.NODE_EXTRA_CA_CERTS
      });
    }
    if (r) {
      if (r.cert && process.env.CLAUDE_CODE_CLIENT_CERT) {
        t.push({
          label: "mTLS client cert",
          value: process.env.CLAUDE_CODE_CLIENT_CERT
        });
      }
      if (r.key && process.env.CLAUDE_CODE_CLIENT_KEY) {
        t.push({
          label: "mTLS client key",
          value: process.env.CLAUDE_CODE_CLIENT_KEY
        });
      }
    }
    return t;
  }
  function ucl() {
    let {
      region: e,
      source: t
    } = xMr();
    switch (t) {
      case "env":
        return e;
      case "shared-config":
        return `${e} (from AWS config)`;
      case "default":
        Ej();
        return `${e} (default \u2014 set AWS_REGION or add a region to your AWS config)`;
    }
  }
  function _cl(e) {
    return modelDisplayString(e);
  }
  var bcl;
  var lIo = __lazy(() => {
    at();
    et();
    Mot();
    no();
    JHe();
    bx();
    wb();
    D1e();
    gn();
    Zl();
    cs();
    bT();
    Eo();
    Ds();
    fW();
    qQ();
    Fh();
    Th();
    W_t();
    nf();
    xje();
    bcl = __toESM(ie(), 1);
  });
  var CYn = {};