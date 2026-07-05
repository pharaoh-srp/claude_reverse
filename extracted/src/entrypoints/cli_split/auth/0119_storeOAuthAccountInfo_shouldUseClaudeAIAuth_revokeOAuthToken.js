  __export(Dot, {
    storeOAuthAccountInfo: () => storeOAuthAccountInfo,
    shouldUseClaudeAIAuth: () => shouldUseClaudeAIAuth,
    revokeOAuthToken: () => revokeOAuthToken,
    refreshOAuthToken: () => refreshOAuthToken,
    populateOAuthAccountInfoIfNeeded: () => populateOAuthAccountInfoIfNeeded,
    parseScopes: () => parseScopes,
    isOAuthTokenExpired: () => isOAuthTokenExpired,
    isInvalidGrantError: () => isInvalidGrantError,
    isExpectedOAuthTokenError: () => isExpectedOAuthTokenError,
    getOrganizationUUID: () => getOrganizationUUID,
    fetchProfileInfo: () => fetchProfileInfo,
    fetchAndStoreUserRoles: () => fetchAndStoreUserRoles,
    extractOAuthErrorFields: () => extractOAuthErrorFields,
    exchangeCodeForTokens: () => exchangeCodeForTokens,
    createAndStoreApiKey: () => createAndStoreApiKey,
    buildAuthUrl: () => buildAuthUrl
  });
  function shouldUseClaudeAIAuth(e) {
    return Array.isArray(e) && e.includes("user:inference");
  }
  function parseScopes(e) {
    if (typeof e !== "string") {
      return [];
    }
    return e.split(" ").filter(Boolean);
  }
  function buildAuthUrl({
    codeChallenge: e,
    state: t,
    port: n,
    isManual: r,
    loginWithClaudeAi: o,
    inferenceOnly: s,
    orgUUID: i,
    loginHint: a,
    loginMethod: l,
    oauthClient: c
  }) {
    let u = o ? getOauthConfig().CLAUDE_AI_AUTHORIZE_URL : getOauthConfig().CONSOLE_AUTHORIZE_URL;
    let d = new URL(u);
    d.searchParams.append("code", "true");
    d.searchParams.append("client_id", c?.clientId ?? getOauthConfig().CLIENT_ID);
    d.searchParams.append("response_type", "code");
    d.searchParams.append("redirect_uri", r ? getOauthConfig().MANUAL_REDIRECT_URL : `http://localhost:${n}/callback`);
    let p = c ? c.scopes : s ? ["user:inference"] : ALL_OAUTH_SCOPES;
    if (d.searchParams.append("scope", p.join(" ")), d.searchParams.append("code_challenge", e), d.searchParams.append("code_challenge_method", "S256"), d.searchParams.append("state", t), i) {
      d.searchParams.append("orgUUID", i);
    }
    if (a) {
      d.searchParams.append("login_hint", a);
    }
    if (l) {
      d.searchParams.append("login_method", l);
    }
    return d.toString();
  }
  async function exchangeCodeForTokens(e, t, n, r, o = false, s, i) {
    let a = {
      grant_type: "authorization_code",
      code: e,
      redirect_uri: o ? getOauthConfig().MANUAL_REDIRECT_URL : `http://localhost:${r}/callback`,
      client_id: i ?? getOauthConfig().CLIENT_ID,
      code_verifier: n,
      state: t
    };
    if (s !== undefined) {
      a.expires_in = s;
    }
    let l = await NP.post(getOauthConfig().TOKEN_URL, a, {
      headers: {
        "Content-Type": "application/json"
      },
      timeout: 30000
    });
    if (l.status !== 200) {
      throw Ae("oauth_token_exchange", l.status === 401 ? "oauth_exchange_invalid_code" : "oauth_exchange_http_error"), Error(l.status === 401 ? "Authentication failed: Invalid authorization code" : `Token exchange failed (${l.status}): ${l.statusText}`);
    }
    logEvent("tengu_oauth_token_exchange_success", {});
    Pe("oauth_token_exchange");
    return l.data;
  }
  async function refreshOAuthToken(e, {
    scopes: t,
    expiresIn: n,
    clientId: r,
    skipProfileFetch: o
  } = {}) {
    let s = {
      grant_type: "refresh_token",
      refresh_token: e,
      client_id: r ?? getOauthConfig().CLIENT_ID,
      scope: (Array.isArray(t) && t.length ? t : CLAUDE_AI_OAUTH_SCOPES).join(" ")
    };
    if (n !== undefined) {
      s.expires_in = n;
    }
    try {
      let i = await NP.post(getOauthConfig().TOKEN_URL, s, {
        headers: {
          "Content-Type": "application/json"
        },
        timeout: 30000
      });
      if (i.status !== 200) {
        throw Error(`Token refresh failed: ${i.statusText}`);
      }
      let a = i.data;
      let {
        access_token: l,
        refresh_token: c = e,
        expires_in: u
      } = a;
      let d = Date.now() + u * 1000;
      let p = parseScopes(a.scope);
      logEvent("tengu_oauth_token_refresh_success", {});
      Pe("oauth_token_refresh");
      let m = getGlobalConfig();
      let f = o ? null : getClaudeAIOAuthTokens();
      let h = m.oauthAccount?.billingType !== undefined && m.oauthAccount?.accountCreatedAt !== undefined && m.oauthAccount?.subscriptionCreatedAt !== undefined && m.oauthAccount?.ccOnboardingFlags !== undefined && f?.subscriptionType != null && f?.rateLimitTier != null;
      let g = o || h ? null : await fetchProfileInfo(l);
      if (g && m.oauthAccount) {
        let y = {};
        if (g.displayName !== undefined) {
          y.displayName = g.displayName;
        }
        if (typeof g.hasExtraUsageEnabled === "boolean") {
          y.hasExtraUsageEnabled = g.hasExtraUsageEnabled;
        }
        if (g.billingType !== null) {
          y.billingType = g.billingType;
        }
        if (g.accountCreatedAt !== undefined) {
          y.accountCreatedAt = g.accountCreatedAt;
        }
        if (g.subscriptionCreatedAt !== undefined) {
          y.subscriptionCreatedAt = g.subscriptionCreatedAt;
        }
        if (g.rawProfile) {
          y.ccOnboardingFlags = g.ccOnboardingFlags;
          y.claudeCodeTrialEndsAt = g.claudeCodeTrialEndsAt;
          y.claudeCodeTrialDurationDays = g.claudeCodeTrialDurationDays;
          y.seatTier = g.seatTier;
          y.profileFetchedAt = Date.now();
        }
        if (Object.keys(y).length > 0) {
          saveGlobalConfig(_ => ({
            ..._,
            oauthAccount: _.oauthAccount ? {
              ..._.oauthAccount,
              ...y
            } : _.oauthAccount
          }));
        }
      }
      return {
        accessToken: l,
        refreshToken: c,
        expiresAt: d,
        scopes: p,
        clientId: r,
        subscriptionType: g?.subscriptionType ?? f?.subscriptionType ?? null,
        rateLimitTier: g?.rateLimitTier ?? f?.rateLimitTier ?? null,
        profile: g?.rawProfile,
        tokenAccount: a.account ? {
          uuid: a.account.uuid,
          emailAddress: a.account.email_address,
          organizationUuid: a.organization?.uuid
        } : undefined
      };
    } catch (i) {
      if (logEvent("tengu_oauth_token_refresh_failure", {
        error: he(i),
        ...extractOAuthErrorFields(i)
      }), isInvalidGrantError(i)) {
        Ae("oauth_token_refresh", "oauth_refresh_invalid_grant");
      } else {
        Et("oauth_token_refresh", "oauth_refresh_request_failed");
      }
      throw i;
    }
  }
  async function revokeOAuthToken(e, t) {
    try {
      await NP.post(`${getOauthConfig().TOKEN_URL}/revoke`, {
        token: e,
        token_type_hint: "refresh_token",
        client_id: t ?? getOauthConfig().CLIENT_ID
      }, {
        headers: {
          "Content-Type": "application/json"
        },
        timeout: 5000
      });
      Pe("oauth_token_revoke");
    } catch (n) {
      let r = NP.isAxiosError(n) ? n.response?.status : undefined;
      logForDebugging(`OAuth token revoke failed (status=${r ?? "network"}); continuing with local logout.`);
      Et("oauth_token_revoke", `http_${r ?? "network"}`);
    }
  }
  async function fetchAndStoreUserRoles(e) {
    let t = await NP.get(getOauthConfig().ROLES_URL, {
      headers: {
        Authorization: `Bearer ${e}`
      }
    });
    if (t.status !== 200) {
      throw Ae("oauth_fetch_roles", "oauth_roles_http_error"), Error(`Failed to fetch user roles: ${t.statusText}`);
    }
    let n = t.data;
    if (!getGlobalConfig().oauthAccount) {
      throw Ae("oauth_fetch_roles", "oauth_roles_no_account"), Error("OAuth account information not found in config");
    }
    saveGlobalConfig(o => ({
      ...o,
      oauthAccount: o.oauthAccount ? {
        ...o.oauthAccount,
        organizationRole: n.organization_role,
        workspaceRole: n.workspace_role,
        organizationName: n.organization_name
      } : o.oauthAccount
    }));
    logEvent("tengu_oauth_roles_stored", {
      org_role: n.organization_role
    });
    Pe("oauth_fetch_roles");
  }
  async function createAndStoreApiKey(e) {
    try {
      let t = await NP.post(getOauthConfig().API_KEY_URL, null, {
        headers: {
          Authorization: `Bearer ${e}`
        }
      });
      let n = t.data?.raw_key;
      if (n) {
        await saveApiKey(n);
        logEvent("tengu_oauth_api_key", {
          status: "success",
          statusCode: t.status
        });
        Pe("oauth_create_api_key");
        return n;
      }
      Ae("oauth_create_api_key", "oauth_api_key_empty_response");
      return null;
    } catch (t) {
      throw logEvent("tengu_oauth_api_key", {
        status: "failure",
        error: t instanceof Error ? t.message : String(t)
      }), Ae("oauth_create_api_key", "oauth_api_key_request_failed"), t;
    }
  }
  function isOAuthTokenExpired(e) {
    if (e === null) {
      return false;
    }
    let t = 300000;
    return Date.now() + t >= e;
  }
  async function fetchProfileInfo(e) {
    let t = await t0e(e);
    let n = t?.organization?.organization_type;
    let r = null;
    switch (n) {
      case "claude_max":
        r = "max";
        break;
      case "claude_pro":
        r = "pro";
        break;
      case "claude_enterprise":
        r = "enterprise";
        break;
      case "claude_team":
        r = "team";
        break;
      default:
        r = null;
        break;
    }
    let o = {
      subscriptionType: r,
      rateLimitTier: t?.organization?.rate_limit_tier ?? null,
      seatTier: t?.organization?.seat_tier ?? null,
      hasExtraUsageEnabled: t?.organization?.has_extra_usage_enabled ?? null,
      billingType: t?.organization?.billing_type ?? null,
      ccOnboardingFlags: t?.organization?.cc_onboarding_flags ?? {},
      claudeCodeTrialEndsAt: t?.organization?.claude_code_trial_ends_at ?? null,
      claudeCodeTrialDurationDays: t?.organization?.claude_code_trial_duration_days ?? null
    };
    if (t?.account?.display_name) {
      o.displayName = t.account.display_name;
    }
    if (t?.account?.created_at) {
      o.accountCreatedAt = t.account.created_at;
    }
    if (t?.organization?.subscription_created_at) {
      o.subscriptionCreatedAt = t.organization.subscription_created_at;
    }
    logEvent("tengu_oauth_profile_fetch_success", {});
    return {
      ...o,
      rawProfile: t
    };
  }
  async function getOrganizationUUID() {
    let e = process.env.CLAUDE_CODE_ORGANIZATION_UUID;
    if (e) {
      return e;
    }
    let n = getGlobalConfig().oauthAccount?.organizationUuid;
    if (n) {
      return n;
    }
    let r = getClaudeAIOAuthTokens()?.accessToken;
    if (r === undefined || !hasProfileScope()) {
      return null;
    }
    let s = (await t0e(r))?.organization?.uuid;
    if (!s) {
      return null;
    }
    return s;
  }
  async function populateOAuthAccountInfoIfNeeded() {
    let e = process.env.CLAUDE_CODE_ACCOUNT_UUID;
    let t = process.env.CLAUDE_CODE_USER_EMAIL;
    let n = process.env.CLAUDE_CODE_ORGANIZATION_UUID;
    let r = Boolean(e && t && n);
    if (e && t && n) {
      if (!getGlobalConfig().oauthAccount) {
        storeOAuthAccountInfo({
          accountUuid: e,
          emailAddress: t,
          organizationUuid: n
        });
      }
    }
    await checkAndRefreshOAuthTokenIfNeeded();
    let o = getGlobalConfig();
    let s = o.oauthAccount?.profileFetchedAt;
    let i = s !== undefined && Date.now() - s < 86400000;
    if (o.oauthAccount && o.oauthAccount.billingType !== undefined && o.oauthAccount.accountCreatedAt !== undefined && o.oauthAccount.subscriptionCreatedAt !== undefined && o.oauthAccount.ccOnboardingFlags !== undefined && i || !isClaudeAISubscriber() || !hasProfileScope()) {
      return false;
    }
    let a = getClaudeAIOAuthTokens();
    if (a?.accessToken) {
      let l = await t0e(a.accessToken);
      if (l?.account && l.organization) {
        if (r) {
          logForDebugging("OAuth profile fetch succeeded, overriding env var account info", {
            level: "info"
          });
        }
        storeOAuthAccountInfo({
          accountUuid: l.account.uuid,
          emailAddress: l.account.email,
          organizationUuid: l.organization.uuid,
          displayName: l.account.display_name || undefined,
          hasExtraUsageEnabled: l.organization.has_extra_usage_enabled ?? false,
          billingType: l.organization.billing_type ?? undefined,
          accountCreatedAt: l.account.created_at,
          subscriptionCreatedAt: l.organization.subscription_created_at ?? undefined,
          ccOnboardingFlags: l.organization.cc_onboarding_flags ?? {},
          claudeCodeTrialEndsAt: l.organization.claude_code_trial_ends_at ?? null,
          claudeCodeTrialDurationDays: l.organization.claude_code_trial_duration_days ?? null,
          seatTier: l.organization.seat_tier ?? null,
          profileFetchedAt: Date.now()
        });
        return true;
      }
    }
    return false;
  }
  function storeOAuthAccountInfo({
    accountUuid: e,
    emailAddress: t,
    organizationUuid: n,
    displayName: r,
    hasExtraUsageEnabled: o,
    billingType: s,
    accountCreatedAt: i,
    subscriptionCreatedAt: a,
    ccOnboardingFlags: l,
    claudeCodeTrialEndsAt: c,
    claudeCodeTrialDurationDays: u,
    seatTier: d,
    profileFetchedAt: p
  }) {
    let m = {
      accountUuid: e,
      emailAddress: t,
      organizationUuid: n,
      hasExtraUsageEnabled: o,
      billingType: s,
      accountCreatedAt: i,
      subscriptionCreatedAt: a,
      ccOnboardingFlags: l,
      claudeCodeTrialEndsAt: c,
      claudeCodeTrialDurationDays: u,
      seatTier: d
    };
    if (r) {
      m.displayName = r;
    }
    if (p !== undefined) {
      m.profileFetchedAt = p;
    }
    saveGlobalConfig(f => {
      if (p === undefined && f.oauthAccount?.accountUuid === m.accountUuid && f.oauthAccount?.emailAddress === m.emailAddress && f.oauthAccount?.organizationUuid === m.organizationUuid && f.oauthAccount?.displayName === m.displayName && f.oauthAccount?.hasExtraUsageEnabled === m.hasExtraUsageEnabled && f.oauthAccount?.billingType === m.billingType && f.oauthAccount?.accountCreatedAt === m.accountCreatedAt && f.oauthAccount?.subscriptionCreatedAt === m.subscriptionCreatedAt && f.oauthAccount?.claudeCodeTrialEndsAt === m.claudeCodeTrialEndsAt && f.oauthAccount?.claudeCodeTrialDurationDays === m.claudeCodeTrialDurationDays && f.oauthAccount?.seatTier === m.seatTier && JSON.stringify(f.oauthAccount?.ccOnboardingFlags) === JSON.stringify(m.ccOnboardingFlags)) {
        return f;
      }
      return {
        ...f,
        oauthAccount: {
          ...f.oauthAccount,
          ...m
        }
      };
    });
  }
  function e3r(e) {
    if (!e || typeof e !== "object") {
      return {
        code: undefined,
        description: undefined
      };
    }
    let t = e;
    let n = t.error;
    return {
      code: typeof n === "string" ? n : n && typeof n === "object" ? n.type : undefined,
      description: t.error_description
    };
  }
  function isInvalidGrantError(e) {
    if (!NP.isAxiosError(e) || !e.response) {
      return false;
    }
    let t = e.response.status;
    if (t !== 400 && t !== 401) {
      return false;
    }
    return e3r(e.response.data).code === "invalid_grant";
  }
  function isExpectedOAuthTokenError(e) {
    if (!NP.isAxiosError(e) || e.response?.status !== 400) {
      return false;
    }
    let {
      code: t
    } = e3r(e.response.data);
    return typeof t === "string" && lSd.vZc(t);
  }
  function extractOAuthErrorFields(e) {
    if (!NP.isAxiosError(e) || !e.response) {
      return {};
    }
    let {
      code: t,
      description: n
    } = e3r(e.response.data);
    return {
      oauth_error_status: String(e.response.status),
      oauth_error_type: Ads(t),
      oauth_error_description: cSd.find(r => r === n) == null ? undefined : cSd.find(r => r === n)
    };
  }
  var lSd;
  var cSd;
  var qP = __lazy(() => {
    Dp();
    ln();
    Ot();
    Uc();
    no();
    je();
    dt();
    fqe();
    lSd = new Set(["invalid_client", "invalid_scope", "unauthorized_client"]);
    cSd = ["Refresh token expired", "Refresh token not found or invalid", "No organization associated with this token", "No account associated with this token"];
  });
  function mwn() {
    getWIFPrecedenceSource.cache.clear?.();
    getWIFAuthType.cache.clear?.();
    dSd.cache.clear?.();
  }
  function isWIFActive() {
    return getWIFPrecedenceSource() !== null;
  }
  function getWIFStatusLine() {
    let e = getWIFPrecedenceSource();
    if (e === "env-quad") {
      let t = process.env.ANTHROPIC_WORKSPACE_ID?.trim();
      return `env-quad \xB7 org ${r3r(process.env.ANTHROPIC_ORGANIZATION_ID ?? "")} \xB7 rule ${r3r(process.env.ANTHROPIC_FEDERATION_RULE_ID ?? "")}${t ? ` \xB7 ws ${t.startsWith("wrkspc_") ? r3r(t) : t}` : ""}`;
    }
    if (e === "profile-explicit" || e === "profile-implicit") {
      let t = ywn();
      let n = t === null ? "default" : e === "profile-explicit" ? process.env.ANTHROPIC_PROFILE?.trim() ?? "default" : gwn(t);
      return `credentials-file \xB7 ${getWIFAuthType() ?? "unknown"} \xB7 profile ${n}`;
    }
    return "inactive";
  }
  function r3r(e) {
    return e.length <= 6 ? e : `\u2026${e.slice(-6)}`;
  }
  function gwn(e) {
    return W1t(hqe.join(e, "active_config"))?.trim() || "default";
  }
  function o3r(e, t) {
    let n = W1t(hqe.join(e, "configs", `${t}.json`));
    if (n === null) {
      return null;
    }
    let r;
    try {
      r = JSON.parse(n);
    } catch {
      return null;
    }
    let o = r?.authentication?.type ?? null;
    if (o === "user_oauth") {
      if (W1t(Kni(e, t, r)) === null) {
        return null;
      }
    }
    return o;
  }
  function Kni(e, t, n) {
    if (n === undefined) {
      let r = W1t(hqe.join(e, "configs", `${t}.json`));
      if (r !== null) {
        try {
          n = JSON.parse(r);
        } catch {}
      }
    }
    return n?.authentication?.credentials_path ?? hqe.join(e, "credentials", `${t}.json`);
  }
  function ywn() {
    let e = process.env.ANTHROPIC_CONFIG_DIR?.trim();
    if (e) {
      return e;
    }
    let t = process.env.XDG_CONFIG_HOME?.trim();
    if (t) {
      return hqe.join(t, "anthropic");
    }
    let n = process.env.HOME?.trim();
    return n ? hqe.join(n, ".config", "anthropic") : null;
  }
  function W1t(e) {
    try {
      return zni.readFileSync(e, "utf-8");
    } catch (t) {
      if (Io(t)) {
        return null;
      }
      throw t;
    }
  }
  var zni;
  var hqe;
  var uSd;
  var getWIFPrecedenceSource;
  var getWIFAuthType;
  var dSd;
  var Mot = __lazy(() => {
    dt();
    zni = require("fs");
    hqe = require("path");
    uSd = ["ANTHROPIC_FEDERATION_RULE_ID", "ANTHROPIC_ORGANIZATION_ID"];
    getWIFPrecedenceSource = TEr(() => {
      let e = ywn();
      let t = process.env.ANTHROPIC_PROFILE?.trim();
      if (t) {
        if (e === null) {
          return null;
        }
        let n = o3r(e, t);
        return n === "oidc_federation" || n === "user_oauth" ? "profile-explicit" : null;
      }
      if (uSd.every(n => process.env[n]?.trim())) {
        return "env-quad";
      }
      if (e !== null) {
        let n = o3r(e, gwn(e));
        if (n === "oidc_federation" || n === "user_oauth") {
          return "profile-implicit";
        }
      }
      return null;
    });
    getWIFAuthType = TEr(() => {
      let e = getWIFPrecedenceSource();
      if (e === null) {
        return null;
      }
      if (e === "env-quad") {
        return "oidc_federation";
      }
      let t = ywn();
      if (t === null) {
        return null;
      }
      let n = e === "profile-explicit" ? process.env.ANTHROPIC_PROFILE?.trim() ?? "default" : gwn(t);
      let r = o3r(t, n);
      return r === "oidc_federation" || r === "user_oauth" ? r : null;
    });
    dSd = TEr(() => {
      let e = getWIFPrecedenceSource();
      if (e === null || e === "env-quad") {
        return;
      }
      let t = ywn();
      if (t === null) {
        return;
      }
      let n = e === "profile-explicit" ? process.env.ANTHROPIC_PROFILE?.trim() ?? "default" : gwn(t);
      let r = W1t(Kni(t, n));
      if (r === null) {
        return;
      }
      try {
        let o = JSON.parse(r);
        return {
          organizationUuid: o.organization_uuid,
          organizationName: o.organization_name,
          accountEmail: o.account_email,
          workspaceName: o.workspace_name
        };
      } catch {
        return;
      }
    });
  });
  class Xni {
    read(e) {
      return Ck.readFile(e, "utf8");
    }
    readBytes(e) {
      return Ck.readFile(e);
    }
    write(e, t, n) {
      return Ck.writeFile(e, t, {
        encoding: "utf8",
        mode: n
      });
    }
    async mkdir(e) {
      try {
        await Ck.mkdir(e, {
          recursive: true
        });
      } catch (t) {
        if (en(t) !== "EEXIST") {
          throw t;
        }
      }
    }
    atomicWrite(e, t, n) {
      return Fm(e, t, n);
    }
    delete(e) {
      return Ck.unlink(e);
    }
    list(e) {
      return Ck.readdir(e);
    }
    append(e, t, n) {
      return Ck.appendFile(e, t, {
        encoding: "utf8",
        mode: n
      });
    }
    writeExclusive(e, t, n) {
      return Ck.writeFile(e, t, {
        encoding: "utf8",
        flag: "wx",
        mode: n
      });
    }
    writeBytes(e, t) {
      return Ck.writeFile(e, t);
    }
    copy(e, t) {
      return Ck.copyFile(e, t);
    }
    async stat(e) {
      return {
        mtimeMs: (await Ck.stat(e)).mtimeMs
      };
    }
    async listEntries(e) {
      return (await Ck.readdir(e, {
        withFileTypes: true
      })).map(n => ({
        name: n.name,
        isDirectory: n.isDirectory(),
        isFile: n.isFile()
      }));
    }
    async readRange(e, t, n) {
      s3r("readRange", "offset", t);
      s3r("readRange", "length", n);
      let r = await Ck.open(e, "r");
      try {
        return await Yni(r, t, n);
      } finally {
        await r.close();
      }
    }
    async readTail(e, t) {
      s3r("readTail", "maxBytes", t);
      let n = await Ck.open(e, "r");
      try {
        let {
          size: r
        } = await n.stat();
        let o = Math.min(t, r);
        return await Yni(n, r - o, o);
      } finally {
        await n.close();
      }
    }
  }
  function s3r(e, t, n) {
    if (!Number.isInteger(n) || n < 0) {
      throw RangeError(`${e}: ${t} must be a non-negative integer, got ${n}`);
    }
  }
  async function Yni(e, t, n) {
    if (n === 0) {
      return Buffer.alloc(0);
    }
    let r = Buffer.alloc(n);
    let o = 0;
    while (o < n) {
      let {
        bytesRead: s
      } = await e.read(r, o, n - o, t + o);
      if (s === 0) {
        break;
      }
      o += s;
    }
    return o === n ? r : Buffer.from(r.subarray(0, o));
  }
  function Ys() {
    return pSd.getStore() ?? new Xni();
  }
  var Jni;
  var Ck;
  var pSd;
  var _b = __lazy(() => {
    BT();
    dt();
    Jni = require("async_hooks");
    Ck = require("fs/promises");
    pSd = new Jni.AsyncLocalStorage();
  });
  function a3r(e, t, n) {
    if (!st(process.env.CLAUDE_CODE_REMOTE)) {
      return;
    }
    try {
      _wn.mkdirSync("/home/claude/.claude/remote", {
        recursive: true,
        mode: 448
      });
      _wn.writeFileSync(e, t, {
        encoding: "utf8",
        mode: 384
      });
      logForDebugging(`Persisted ${n} to ${e} for subprocess access`);
    } catch (r) {
      logForDebugging(`Failed to persist ${n} to disk (non-fatal): ${he(r)}`, {
        level: "error"
      });
    }
  }
  function G1t(e, t) {
    try {
      let r = zt().readFileSync(e, {
        encoding: "utf8"
      }).trim();
      if (!r) {
        return null;
      }
      logForDebugging(`Read ${t} from well-known file ${e}`);
      return r;
    } catch (n) {
      if (!fn(n)) {
        logForDebugging(`Failed to read ${t} from ${e}: ${he(n)}`, {
          level: "debug"
        });
      }
      return null;
    }
  }
  function Zni({
    envVar: e,
    wellKnownPath: t,
    label: n,
    getCached: r,
    setCached: o
  }) {
    let s = r();
    if (s !== undefined) {
      return s;
    }
    let i = process.env[e];
    if (!i) {
      let l = G1t(t, n);
      o(l);
      return l;
    }
    let a = parseInt(i, 10);
    if (Number.isNaN(a)) {
      logForDebugging(`${e} must be a valid file descriptor number, got: ${i}`, {
        level: "error"
      });
      o(null);
      return null;
    }
    try {
      let l = `/proc/self/fd/${a}`;
      let c = pnt(l, {
        maxBytes: 65536
      }).trim();
      if (!c) {
        logForDebugging(`File descriptor contained empty ${n}`, {
          level: "error"
        });
        o(null);
        return null;
      }
      logForDebugging(`Successfully read ${n} from file descriptor ${a}`);
      o(c);
      a3r(t, c, n);
      return c;
    } catch (l) {
      logForDebugging(`Failed to read ${n} from file descriptor ${a}: ${he(l)}`, {
        level: "error"
      });
      let c = G1t(t, n);
      o(c);
      return c;
    }
  }
  function hSd() {
    let e = process.env.CLAUDE_BG_AUTH_SNAPSHOT_PATH;
    if (!e) {
      return;
    }
    delete process.env.CLAUDE_BG_AUTH_SNAPSHOT_PATH;
    try {
      let n = zt().readFileSync(e, {
        encoding: "utf8"
      });
      Qni.unlink(e).catch(() => {});
      let r = JSON.parse(n);
      if (typeof r?.accessToken !== "string" || !r.accessToken) {
        logForDebugging("bg auth snapshot missing accessToken", {
          level: "warn"
        });
        return;
      }
      if (setOauthTokenFromFd(r.accessToken), Array.isArray(r.scopes)) {
        setOauthScopesFromFd(r.scopes);
      }
      if (r.subscriptionType) {
        process.env.CLAUDE_CODE_SUBSCRIPTION_TYPE = r.subscriptionType;
      }
      if (r.rateLimitTier) {
        process.env.CLAUDE_CODE_RATE_LIMIT_TIER = r.rateLimitTier;
      }
      logForDebugging("Consumed bg auth snapshot from sockDir");
    } catch (t) {
      if (!fn(t)) {
        logForDebugging(`Failed to consume bg auth snapshot: ${he(t)}`, {
          level: "warn"
        });
      }
    }
  }
  function r8() {
    hSd();
    return Zni({
      envVar: "CLAUDE_CODE_OAUTH_TOKEN_FILE_DESCRIPTOR",
      wellKnownPath: mSd,
      label: "OAuth token",
      getCached: getOauthTokenFromFd,
      setCached: setOauthTokenFromFd
    });
  }
  function V1t() {
    return Zni({
      envVar: "CLAUDE_CODE_API_KEY_FILE_DESCRIPTOR",
      wellKnownPath: fSd,
      label: "API key",
      getCached: getApiKeyFromFd,
      setCached: setApiKeyFromFd
    });
  }
  var _wn;
  var Qni;
  var mSd;
  var fSd;
  var Swn;
  var Twn = __lazy(() => {
    at();
    je();
    gn();
    dt();
    Zl();
    _wn = require("fs");
    Qni = require("fs/promises");
    mSd = `${"/home/claude/.claude/remote"}/.oauth_token`;
    fSd = `${"/home/claude/.claude/remote"}/.api_key`;
    Swn = `${"/home/claude/.claude/remote"}/.session_ingress_token`;
  });
  function LY() {
    let e = process.env.CLAUDE_SECURESTORAGE_CONFIG_DIR;
    if (e !== undefined) {
      return (e || tri.join(Ewn.homedir(), ".claude")).normalize("NFC");
    }
    return er();
  }
  function p_e(e = "") {
    let t = process.env.CLAUDE_SECURESTORAGE_CONFIG_DIR;
    let n = t !== undefined ? !t : !process.env.CLAUDE_CONFIG_DIR;
    let r = t !== undefined ? t.normalize("NFC") : er();
    let o = n ? "" : `-${eri.createHash("sha256").update(r).digest("hex").substring(0, 8)}`;
    return `Claude Code${getOauthConfig().OAUTH_FILE_SUFFIX}${e}${o}`;
  }
  function Wle() {
    let e;
    try {
      e = process.env.USER || Ewn.userInfo().username;
    } catch {
      e = "claude-code-user";
    }
    if (!gSd.test(e)) {
      return "claude-code-user";
    }
    return e;
  }
  function m_e() {
    qle.cache = {
      data: null,
      cachedAt: 0
    };
    qle.generation++;
    qle.readInFlight = null;
  }
  function nri(e, t) {
    if (qle.cache.cachedAt !== 0 || qle.generation !== t) {
      return;
    }
    let n = null;
    if (e) {
      try {
        n = JSON.parse(e);
      } catch {
        return;
      }
    }
    qle.cache = {
      data: n,
      cachedAt: Date.now()
    };
  }
  var eri;
  var Ewn;
  var tri;
  var gSd;
  var qle;
  var o8 = __lazy(() => {
    Uc();
    gn();
    eri = require("crypto");
    Ewn = require("os");
    tri = require("path");
    gSd = /^[a-zA-Z0-9._-]+$/;
    qle = {
      cache: {
        data: null,
        cachedAt: 0
      },
      generation: 0,
      readInFlight: null
    };
  });
  async function rri() {}
  function a2(e) {
    return e.slice(-20);
  }
  var Lot = __lazy(() => {
    o8();
    oF();
  });
  class Client_export4 {
    config;
    middlewareStack = ori.constructStack();
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
  var ori;
  var sri = __lazy(() => {
    ori = __toESM(QB(), 1);
  });
  var iri;
  var ari = __lazy(() => {
    iri = __toESM(tw(), 1);
  });
  var lri = () => {};
  var cri;
  var uri = __lazy(() => {
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(cri || (cri = {}));
  });
  var dri;
  var pri = __lazy(() => {
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(dri || (dri = {}));
  });
  var mri = () => {};
  var fri = () => {};
  var hri = () => {};
  var gri = () => {};
  var yri = __lazy(() => {
    uri();
    pri();
    mri();
    fri();
    hri();
    gri();
  });
  var _ri = () => {};
  var bri = () => {};
  var Sri = () => {};
  var Tri = () => {};
  var Eri = () => {};
  var vri = () => {};
  var wri = () => {};
  var Cri = __lazy(() => {
    Eri();
    vri();
    wri();
  });
  var Rri = () => {};
  var xri = () => {};
  var kri;
  var Ari = __lazy(() => {
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(kri || (kri = {}));
  });
  var Iri = () => {};
  var Pri = () => {};
  var Ori = () => {};
  var Dri = () => {};
  var Mri = () => {};
  var Nri = __lazy(() => {
    Iri();
    Pri();
    Ori();
    Dri();
    Mri();
  });
  var Lri = () => {};
  var Fot;
  var Fri = __lazy(() => {
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(Fot || (Fot = {}));
  });
  var Uri = () => {};
  var Bri = () => {};
  var $ri = __lazy(() => {
    Fri();
    Uri();
    Bri();
  });
  var Hri = () => {};
  var jri;
  var qri = __lazy(() => {
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(jri || (jri = {}));
  });
  var Wri = () => {};
  var Gri = () => {};
  var Vri = () => {};
  var zri = () => {};
  var Kri = () => {};
  var Yri = __lazy(() => {
    Gri();
    Vri();
    zri();
    Kri();
  });
  var Jri = () => {};
  var Qri = () => {};
  var Zri;
  var eoi = __lazy(() => {
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(Zri || (Zri = {}));
  });
  var toi = () => {};
  var noi = () => {};
  var roi = () => {};
  var ooi = () => {};
  var soi = () => {};
  var ioi = () => {};
  var aoi = () => {};
  var loi = () => {};
  var coi = () => {};
  var uoi = () => {};
  var doi = () => {};
  var poi = () => {};
  var moi = () => {};
  var foi = () => {};
  var hoi;
  var goi = __lazy(() => {
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(hoi || (hoi = {}));
  });
  var yoi = () => {};
  var _oi = () => {};
  var boi = () => {};
  var Soi = () => {};
  var Toi = () => {};
  var Eoi = () => {};
  var voi = () => {};
  var l3r = __lazy(() => {
    lri();
    yri();
    _ri();
    bri();
    Sri();
    Tri();
    Cri();
    Rri();
    xri();
    Ari();
    Nri();
    Lri();
    $ri();
    Hri();
    qri();
    Wri();
    Yri();
    Jri();
    Qri();
    eoi();
    toi();
    noi();
    roi();
    ooi();
    soi();
    ioi();
    aoi();
    loi();
    coi();
    uoi();
    doi();
    poi();
    moi();
    foi();
    goi();
    yoi();
    _oi();
    boi();
    Soi();
    Toi();
    Eoi();
    voi();
  });
  function vwn(e, t) {
    if (t == null) {
      return t;
    }
    let n = woi.NormalizedSchema.of(e);
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
          o[s] = vwn(i, r[s]);
        }
      }
      return o;
    }
    return t;
  }
  var woi;
  var Coi = __lazy(() => {
    woi = __toESM(qT(), 1);
  });
  class Command_export4 {
    middlewareStack = Roi.constructStack();
    schema;
    static classBuilder() {
      return new xoi();
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
  class xoi {
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
      return t = class extends Command_export4 {
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
            inputFilterSensitiveLog: e._inputFilterSensitiveLog ?? (s ? vwn.bind(null, i) : l => l),
            outputFilterSensitiveLog: e._outputFilterSensitiveLog ?? (s ? vwn.bind(null, a) : l => l),
            smithyContext: e._smithyContext,
            additionalContext: e._additionalContext
          });
        }
        serialize = e._serializer;
        deserialize = e._deserializer;
      };
    }
  }
  var Roi;
  var koi = __lazy(() => {
    l3r();
    Coi();
    Roi = __toESM(QB(), 1);
  });
  var createAggregatedClient_export4 = (e, t) => {
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
  var ServiceException_export4;
  var decorateServiceException_export4 = (e, t = {}) => {
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
  var p3r = __lazy(() => {
    ServiceException_export4 = class r0e extends Error {
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
        return r0e.prototype.isPrototypeOf(t) || Boolean(t.$fault) && Boolean(t.$metadata) && (t.$fault === "client" || t.$fault === "server");
      }
      static [Symbol.hasInstance](e) {
        if (!e) {
          return false;
        }
        let t = e;
        if (this === r0e) {
          return r0e.isInstance(e);
        }
        if (r0e.isInstance(e)) {
          if (t.name && this.name) {
            return this.prototype.isPrototypeOf(e) || t.name === this.name;
          }
          return this.prototype.isPrototypeOf(e);
        }
        return false;
      }
    };
  });
  var throwDefaultError_export4 = ({
    output: e,
    parsedBody: t,
    exceptionCtor: n,
    errorCode: r
  }) => {
    let o = bSd(e);
    let s = o.httpStatusCode ? o.httpStatusCode + "" : undefined;
    let i = new n({
      name: t?.code || t?.Code || r || s || "UnknownError",
      $fault: "client",
      $metadata: o
    });
    throw decorateServiceException_export4(i, t);
  };
  var withBaseException_export4 = e => ({
    output: t,
    parsedBody: n,
    errorCode: r
  }) => {
    throwDefaultError_export4({
      output: t,
      parsedBody: n,
      exceptionCtor: e,
      errorCode: r
    });
  };
  var bSd = e => ({
    httpStatusCode: e.statusCode,
    requestId: e.headers["x-amzn-requestid"] ?? e.headers["x-amzn-request-id"] ?? e.headers["x-amz-request-id"],
    extendedRequestId: e.headers["x-amz-id-2"],
    cfId: e.headers["x-amz-cf-id"]
  });
  var Ioi = __lazy(() => {
    p3r();
  });
  var loadConfigsForDefaultMode_export4 = e => {
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
  var Poi = false;
  var emitWarningIfUnsupportedVersion_export4 = e => {
    if (e && !Poi && parseInt(e.substring(1, e.indexOf("."))) < 16) {
      Poi = true;
    }
  };
  var Ooi;
  var Doi = __lazy(() => {
    Ooi = __toESM(tw(), 1);
  });
  var Moi = e => {
    let t = [];
    for (let n in Fot) {
      let r = Fot[n];
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
  var Noi = e => {
    let t = {};
    e.checksumAlgorithms().forEach(n => {
      t[n.algorithmId()] = n.checksumConstructor();
    });
    return t;
  };
  var Loi = __lazy(() => {
    l3r();
  });
  var Foi = e => ({
    setRetryStrategy(t) {
      e.retryStrategy = t;
    },
    retryStrategy() {
      return e.retryStrategy;
    }
  });
  var Uoi = e => {
    let t = {};
    t.retryStrategy = e.retryStrategy();
    return t;
  };
  var getDefaultExtensionConfiguration_export4 = e => Object.assign(Moi(e), Foi(e));
  var resolveDefaultRuntimeConfig_export4 = e => Object.assign(Noi(e), Uoi(e));
  var $oi = __lazy(() => {});
  var getArrayIfSingleItem_export4 = e => Array.isArray(e) ? e : [e];
  var getValueFromTextNode_export4 = e => {
    for (let n in e) {
      if (e.hasOwnProperty(n) && e[n]["#text"] !== undefined) {
        e[n] = e[n]["#text"];
      } else if (typeof e[n] === "object" && e[n] !== null) {
        e[n] = getValueFromTextNode_export4(e[n]);
      }
    }
    return e;
  };
  var isSerializableHeaderValue_export4 = e => e != null;
  class NoOpLogger_export4 {
    trace() {}
    debug() {}
    info() {}
    warn() {}
    error() {}
  }
  function map_export6(e, t, n) {
    let r;
    let o;
    let s;
    if (typeof t > "u" && typeof n > "u") {
      r = {};
      s = e;
    } else if (r = e, typeof t === "function") {
      o = t;
      s = n;
      return CSd(r, o, s);
    } else {
      s = t;
    }
    for (let i of Object.keys(s)) {
      if (!Array.isArray(s[i])) {
        r[i] = s[i];
        continue;
      }
      qoi(r, null, s, i);
    }
    return r;
  }
  var convertMap_export4 = e => {
    let t = {};
    for (let [n, r] of Object.entries(e || {})) {
      t[n] = [, r];
    }
    return t;
  };
  var take_export4 = (e, t) => {
    let n = {};
    for (let r in t) {
      qoi(n, e, t, r);
    }
    return n;
  };
  var CSd = (e, t, n) => map_export6(e, Object.entries(n).reduce((r, [o, s]) => {
    if (Array.isArray(s)) {
      r[o] = s;
    } else if (typeof s === "function") {
      r[o] = [t, s()];
    } else {
      r[o] = [t, s];
    }
    return r;
  }, {}));
  var qoi = (e, t, n, r) => {
    if (t !== null) {
      let i = n[r];
      if (typeof i === "function") {
        i = [, i];
      }
      let [a = RSd, l = xSd, c = r] = i;
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
  var RSd = e => e != null;
  var xSd = e => e;
  var Woi;
  var Goi = __lazy(() => {
    Woi = __toESM(tw(), 1);
  });
  var serializeFloat_export4 = e => {
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
  var serializeDateTime_export4 = e => e.toISOString().replace(".000Z", "Z");
  var _json_export4 = e => {
    if (e == null) {
      return {};
    }
    if (Array.isArray(e)) {
      return e.filter(t => t != null).map(_json_export4);
    }
    if (typeof e === "object") {
      let t = {};
      for (let n of Object.keys(e)) {
        if (e[n] == null) {
          continue;
        }
        t[n] = _json_export4(e[n]);
      }
      return t;
    }
    return e;
  };
  var Rk = {};