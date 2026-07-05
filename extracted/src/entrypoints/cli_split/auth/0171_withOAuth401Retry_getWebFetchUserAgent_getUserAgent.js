  __export(v2, {
    withOAuthRefreshLock: () => withOAuthRefreshLock,
    waitForRotatedEnvToken: () => waitForRotatedEnvToken,
    validateForceLoginOrg: () => validateForceLoginOrg,
    toAccountInfo: () => toAccountInfo,
    shouldUseWIFAuth: () => shouldUseWIFAuth,
    saveOAuthTokensIfNeeded: () => saveOAuthTokensIfNeeded,
    saveApiKey: () => saveApiKey,
    restoreGatewayAuth: () => restoreGatewayAuth,
    resetEnvDerivedAuthCaches: () => resetEnvDerivedAuthCaches,
    resetAwsAuthRefreshCooldown: () => resetAwsAuthRefreshCooldown,
    resetAuthFailureTracking: () => resetAuthFailureTracking,
    removeApiKey: () => removeApiKey,
    refreshGcpCredentialsIfNeeded: () => refreshGcpCredentialsIfNeeded,
    refreshGcpAuth: () => refreshGcpAuth,
    refreshAwsAuth: () => refreshAwsAuth,
    refreshAndGetAwsCredentials: () => refreshAndGetAwsCredentials,
    readFreshOAuthAccessToken: () => readFreshOAuthAccessToken,
    prefetchGcpCredentialsIfSafe: () => prefetchGcpCredentialsIfSafe,
    prefetchAwsCredentialsAndBedRockInfoIfSafe: () => prefetchAwsCredentialsAndBedRockInfoIfSafe,
    prefetchApiKeyFromApiKeyHelperIfSafe: () => prefetchApiKeyFromApiKeyHelperIfSafe,
    oauthRefreshLockOptions: () => oauthRefreshLockOptions,
    noteAuthRecoveryOutcome: () => noteAuthRecoveryOutcome,
    isWIFDispatchAuth: () => isWIFDispatchAuth,
    isUsing3PServices: () => isUsing3PServices,
    isTeamSubscriberAsync: () => isTeamSubscriberAsync,
    isTeamSubscriber: () => isTeamSubscriber,
    isTeamPremiumSubscriberAsync: () => isTeamPremiumSubscriberAsync,
    isTeamPremiumSubscriber: () => isTeamPremiumSubscriber,
    isProSubscriberAsync: () => isProSubscriberAsync,
    isProSubscriber: () => isProSubscriber,
    isOverageProvisioningAllowedAsync: () => isOverageProvisioningAllowedAsync,
    isOverageProvisioningAllowed: () => isOverageProvisioningAllowed,
    isOtelHeadersHelperFromProjectOrLocalSettings: () => isOtelHeadersHelperFromProjectOrLocalSettings,
    isOAuthRefreshKnownDead: () => isOAuthRefreshKnownDead,
    isMaxSubscriberAsync: () => isMaxSubscriberAsync,
    isMaxSubscriber: () => isMaxSubscriber,
    isHostManagedProviderAuth: () => isHostManagedProviderAuth,
    isGcpAuthRefreshFromProjectSettings: () => isGcpAuthRefreshFromProjectSettings,
    isFirstPartyManagedOAuthContext: () => isFirstPartyManagedOAuthContext,
    isExpectedOAuthRefreshError: () => isExpectedOAuthRefreshError,
    isEnterpriseSubscriberAsync: () => isEnterpriseSubscriberAsync,
    isEnterpriseSubscriber: () => isEnterpriseSubscriber,
    isEnterprisePAYGSubscriberAsync: () => isEnterprisePAYGSubscriberAsync,
    isEnterprisePAYGSubscriber: () => isEnterprisePAYGSubscriber,
    isCustomApiKeyApproved: () => isCustomApiKeyApproved,
    isConsumerSubscriberAsync: () => isConsumerSubscriberAsync,
    isConsumerSubscriber: () => isConsumerSubscriber,
    isClaudeAISubscriberAsync: () => isClaudeAISubscriberAsync,
    isClaudeAISubscriber: () => isClaudeAISubscriber,
    isAwsCredentialExportFromProjectSettings: () => isAwsCredentialExportFromProjectSettings,
    isAwsAuthRefreshFromProjectSettings: () => isAwsAuthRefreshFromProjectSettings,
    isAnthropicAuthEnabledAsync: () => isAnthropicAuthEnabledAsync,
    isAnthropicAuthEnabled: () => isAnthropicAuthEnabled,
    is1PApiCustomerAsync: () => is1PApiCustomerAsync,
    is1PApiCustomer: () => is1PApiCustomer,
    hasStoredOAuthToken: () => hasStoredOAuthToken,
    hasStoredOAuthRefreshToken: () => hasStoredOAuthRefreshToken,
    hasProfileScopeAsync: () => hasProfileScopeAsync,
    hasProfileScope: () => hasProfileScope,
    hasOpusAccessAsync: () => hasOpusAccessAsync,
    hasOpusAccess: () => hasOpusAccess,
    hasOAuthScope: () => hasOAuthScope,
    hasAnthropicDirectApiKey: () => hasAnthropicDirectApiKey,
    hasAnthropicApiKeyAuthAsync: () => hasAnthropicApiKeyAuthAsync,
    hasAnthropicApiKeyAuth: () => hasAnthropicApiKeyAuth,
    hasAnthropicApiKey: () => hasAnthropicApiKey,
    handleOAuth401Error: () => handleOAuth401Error,
    getSubscriptionTypeAsync: () => getSubscriptionTypeAsync,
    getSubscriptionType: () => getSubscriptionType,
    getSubscriptionNameAsync: () => getSubscriptionNameAsync,
    getSubscriptionName: () => getSubscriptionName,
    getStoredOAuthTokenExpiresAt: () => getStoredOAuthTokenExpiresAt,
    getStoredOAuthSubscriptionType: () => getStoredOAuthSubscriptionType,
    getSeatTierAsync: () => getSeatTierAsync,
    getSeatTier: () => getSeatTier,
    getRateLimitTierAsync: () => getRateLimitTierAsync,
    getRateLimitTier: () => getRateLimitTier,
    getOtelHeadersHelperLastFailure: () => getOtelHeadersHelperLastFailure,
    getOtelHeadersFromHelper: () => getOtelHeadersFromHelper,
    getOrgModelDefaultCache: () => getOrgModelDefaultCache,
    getOauthAccountInfoAsync: () => getOauthAccountInfoAsync,
    getOauthAccountInfo: () => getOauthAccountInfo,
    getModelAccessCache: () => getModelAccessCache,
    getConfiguredAwsAuthRefresh: () => getConfiguredAwsAuthRefresh,
    getConfiguredApiKeyHelper: () => getConfiguredApiKeyHelper,
    getClaudeAIOAuthTokensAsync: () => getClaudeAIOAuthTokensAsync,
    getClaudeAIOAuthTokens: () => getClaudeAIOAuthTokens,
    getAuthTokenSourceAsync: () => getAuthTokenSourceAsync,
    getAuthTokenSource: () => getAuthTokenSource,
    getApiKeySourceSafe: () => getApiKeySourceSafe,
    getApiKeyHelperElapsedMs: () => getApiKeyHelperElapsedMs,
    getApiKeyFromConfigOrMacOSKeychainAsync: () => getApiKeyFromConfigOrMacOSKeychainAsync,
    getApiKeyFromConfigOrMacOSKeychain: () => getApiKeyFromConfigOrMacOSKeychain,
    getApiKeyFromApiKeyHelperCached: () => getApiKeyFromApiKeyHelperCached,
    getApiKeyFromApiKeyHelper: () => getApiKeyFromApiKeyHelper,
    getAnthropicApiKeyWithSourceSafe: () => getAnthropicApiKeyWithSourceSafe,
    getAnthropicApiKeyWithSourceAsyncSafe: () => getAnthropicApiKeyWithSourceAsyncSafe,
    getAnthropicApiKeyWithSourceAsync: () => getAnthropicApiKeyWithSourceAsync,
    getAnthropicApiKeyWithSource: () => getAnthropicApiKeyWithSource,
    getAnthropicApiKeySafe: () => getAnthropicApiKeySafe,
    getAnthropicApiKeyAsync: () => getAnthropicApiKeyAsync,
    getAnthropicApiKey: () => getAnthropicApiKey,
    getAdditionalModelOptionsCache: () => getAdditionalModelOptionsCache,
    getAccountInformationAsync: () => getAccountInformationAsync,
    getAccountInformation: () => getAccountInformation,
    describeHowToDisableAuthTokenSource: () => describeHowToDisableAuthTokenSource,
    clearWIFAuthDebugOnceCacheForTesting: () => clearWIFAuthDebugOnceCacheForTesting,
    clearOtelHeadersCache: () => clearOtelHeadersCache,
    clearOAuthTokenCache: () => clearOAuthTokenCache,
    clearGcpCredentialsCache: () => clearGcpCredentialsCache,
    clearAwsCredentialsCache: () => clearAwsCredentialsCache,
    clearApiKeyHelperCache: () => clearApiKeyHelperCache,
    checkGcpCredentialsValid: () => checkGcpCredentialsValid,
    checkAndRefreshOAuthTokenIfNeededWithOutcome: () => checkAndRefreshOAuthTokenIfNeededWithOutcome,
    checkAndRefreshOAuthTokenIfNeeded: () => checkAndRefreshOAuthTokenIfNeeded,
    calculateApiKeyHelperTTL: () => calculateApiKeyHelperTTL,
    acquireOAuthRefreshLock: () => acquireOAuthRefreshLock,
    __resetKnownDeadRefreshTokensForTest: () => __resetKnownDeadRefreshTokensForTest,
    SDK_OAUTH_REFRESH_ENTRYPOINTS: () => SDK_OAUTH_REFRESH_ENTRYPOINTS
  });
  function tat() {
    return st(process.env.CLAUDE_CODE_REMOTE) || L6();
  }
  function isHostManagedProviderAuth() {
    return Me.CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST;
  }
  function isFirstPartyManagedOAuthContext() {
    return tat() && !process.env.CLAUDE_CODE_HOST_AUTH_ENV_VAR && process.env.CLAUDE_CODE_ENTRYPOINT !== "claude-desktop-3p";
  }
  function clearWIFAuthDebugOnceCacheForTesting() {
    fOi.cache.clear?.();
    hOi.cache.clear?.();
  }
  function shouldUseWIFAuth() {
    if (!isWIFActive()) {
      return false;
    }
    if (kd() || process.env.ANTHROPIC_UNIX_SOCKET || tat() || isHostManagedProviderAuth() || process.env.ANTHROPIC_AUTH_TOKEN || process.env.CLAUDE_CODE_OAUTH_TOKEN || r8() || getConfiguredApiKeyHelper() || st(process.env.CLAUDE_CODE_USE_BEDROCK) || st(process.env.CLAUDE_CODE_USE_VERTEX) || st(process.env.CLAUDE_CODE_USE_FOUNDRY) || st(process.env.CLAUDE_CODE_USE_ANTHROPIC_AWS) || st(process.env.CLAUDE_CODE_USE_MANTLE)) {
      return false;
    }
    if (getWIFPrecedenceSource() === "profile-implicit") {
      let e = getClaudeAIOAuthTokens();
      if (shouldUseClaudeAIAuth(e?.scopes) && e?.accessToken && getWIFAuthType() === "user_oauth") {
        fOi();
        return false;
      }
    }
    hOi();
    return true;
  }
  function isWIFDispatchAuth() {
    return getAnthropicApiKey() === null && shouldUseWIFAuth();
  }
  async function restoreGatewayAuth() {
    if (st(process.env.CLAUDE_CODE_USE_GATEWAY)) {
      let e = process.env.ANTHROPIC_BASE_URL;
      let t = process.env.ANTHROPIC_AUTH_TOKEN;
      if (e && t) {
        let n;
        try {
          n = lIn(e);
        } catch (o) {
          throw Error(`CLAUDE_CODE_USE_GATEWAY is set but ANTHROPIC_BASE_URL is invalid: ${he(o)}`);
        }
        let r = H1t(t);
        setGatewayAuth({
          url: n,
          jwt: t,
          expiresAt: r !== null ? r * 1000 : Number.MAX_SAFE_INTEGER,
          unpinned: true
        });
        return;
      }
      logForDebugging("CLAUDE_CODE_USE_GATEWAY is set but ANTHROPIC_BASE_URL or ANTHROPIC_AUTH_TOKEN is missing; ignoring", {
        level: "warn"
      });
    }
    try {
      let e = await yl().readAsync();
      let t = e?.enterpriseGateway;
      if (!t) {
        return;
      }
      let n = new URL(t.url).hostname.replace(/^\[|\]$/g, "");
      let r = e?.gatewayTrust?.[n];
      if (!r) {
        if (!getIsNonInteractiveSession()) {
          process.stderr.write(`Cloud gateway ${n} is not trusted on this machine \u2014 run /login to reconnect.
`);
        }
        return;
      }
      if (t.expiresAt <= Date.now() && !t.idpRefreshToken) {
        if (!getIsNonInteractiveSession()) {
          process.stderr.write(`Cloud gateway session expired \u2014 run /login to reconnect.
`);
        }
        return;
      }
      try {
        let o = await VBt(t.url, 3000);
        if (o.fingerprint !== r) {
          if (!getIsNonInteractiveSession()) {
            process.stderr.write(`Cloud gateway ${n} TLS certificate changed since you connected \u2014 run /login to verify and reconnect.
`);
          }
          logForDebugging(`[gateway] TLS fingerprint mismatch on restore for ${n}: pinned ${r}, live ${o.fingerprint}`, {
            level: "warn"
          });
          return;
        }
      } catch (o) {
        logForDebugging(`[gateway] TLS fingerprint probe failed on restore for ${n} (${he(o)}); proceeding without re-verify`);
      }
      setGatewayAuth(t);
    } catch (e) {
      Oe(e);
    }
  }
  function isAnthropicAuthEnabled() {
    if (kd()) {
      return false;
    }
    if (process.env.ANTHROPIC_UNIX_SOCKET) {
      return !!process.env.CLAUDE_CODE_OAUTH_TOKEN;
    }
    if (shouldUseWIFAuth()) {
      return false;
    }
    let e = !isFirstPartyProvider();
    let n = (getInitialSettings() || {}).apiKeyHelper;
    let r = cC() ? undefined : process.env.ANTHROPIC_AUTH_TOKEN;
    let o;
    try {
      o = getAnthropicApiKeyWithSource({
        skipRetrievingKeyFromApiKeyHelper: true
      }).source;
    } catch {
      return false;
    }
    let s = o === "ANTHROPIC_API_KEY" || o === "apiKeyHelper";
    let i = process.env.CLAUDE_CODE_API_KEY_FILE_DESCRIPTOR;
    let a = (r || s) && !isFirstPartyManagedOAuthContext() || (n || i) && !tat();
    return !(e || a);
  }
  function describeHowToDisableAuthTokenSource(e) {
    switch (e) {
      case "claude.ai":
        return "claude /logout to sign out of claude.ai.";
      case "profile":
        return "Run `ant auth logout`, or remove the active profile under ~/.config/anthropic/configs/.";
      case "apiKeyHelper":
        return "Unset the apiKeyHelper setting.";
      case "CCR_OAUTH_TOKEN_FILE":
        return "This token is injected by the CCR host; check the host session.";
      case "none":
        return "";
      default:
        return `Unset the ${e} environment variable.`;
    }
  }
  function getAuthTokenSource() {
    if (kd()) {
      if (getConfiguredApiKeyHelper()) {
        return {
          source: "apiKeyHelper",
          hasToken: true
        };
      }
      return {
        source: "none",
        hasToken: false
      };
    }
    if (process.env.ANTHROPIC_AUTH_TOKEN && !isFirstPartyManagedOAuthContext() && !cC()) {
      return {
        source: "ANTHROPIC_AUTH_TOKEN",
        hasToken: true
      };
    }
    if (process.env.CLAUDE_CODE_OAUTH_TOKEN) {
      return {
        source: "CLAUDE_CODE_OAUTH_TOKEN",
        hasToken: true
      };
    }
    if (r8()) {
      if (process.env.CLAUDE_CODE_OAUTH_TOKEN_FILE_DESCRIPTOR) {
        return {
          source: "CLAUDE_CODE_OAUTH_TOKEN_FILE_DESCRIPTOR",
          hasToken: true
        };
      }
      return {
        source: "CCR_OAUTH_TOKEN_FILE",
        hasToken: true
      };
    }
    if (getConfiguredApiKeyHelper() && !tat()) {
      return {
        source: "apiKeyHelper",
        hasToken: true
      };
    }
    if (shouldUseWIFAuth()) {
      return {
        source: "profile",
        hasToken: true
      };
    }
    let n = getClaudeAIOAuthTokens();
    if (shouldUseClaudeAIAuth(n?.scopes) && n?.accessToken) {
      return {
        source: "claude.ai",
        hasToken: true
      };
    }
    return {
      source: "none",
      hasToken: false
    };
  }
  function getAnthropicApiKey() {
    let {
      key: e
    } = getAnthropicApiKeyWithSource();
    return e;
  }
  function getAnthropicApiKeySafe() {
    try {
      return getAnthropicApiKey();
    } catch {
      return null;
    }
  }
  function getApiKeySourceSafe() {
    return getAnthropicApiKeyWithSourceSafe().source;
  }
  function getAnthropicApiKeyWithSourceSafe(e = {}) {
    try {
      return getAnthropicApiKeyWithSource(e);
    } catch {
      return {
        key: null,
        source: "none"
      };
    }
  }
  function getAdditionalModelOptionsCache() {
    let e = getGlobalConfig().additionalModelOptionsCache;
    return (Array.isArray(e) ? e : []).filter(t => t != null && typeof t === "object" && (typeof t.value === "string" || t.value === null) && typeof t.label === "string" && typeof t.description === "string");
  }
  function getModelAccessCache() {
    let e = getGlobalConfig().modelAccessCache;
    return (Array.isArray(e) ? e : []).filter(t => t != null && typeof t === "object" && typeof t.apiName === "string" && typeof t.entitled === "boolean");
  }
  function getOrgModelDefaultCache() {
    let e = getGlobalConfig();
    let t = e.orgModelDefaultCache;
    if (t == null || typeof t !== "object" || typeof t.name !== "string" || typeof t.updated_at !== "string" || typeof t.data_source !== "string" || typeof t.override_user_selection !== "boolean") {
      return null;
    }
    let n = e.oauthAccount?.organizationUuid;
    if (t.orgUuid != null && n != null && t.orgUuid !== n) {
      return null;
    }
    let r = t.name.replace(/[\x00-\x1f\x7f-\x9f]/g, "");
    return r === t.name ? t : {
      ...t,
      name: r
    };
  }
  function hasAnthropicDirectApiKey() {
    if (process.env.ANTHROPIC_AUTH_TOKEN) {
      return false;
    }
    try {
      let {
        key: e,
        source: t
      } = getAnthropicApiKeyWithSource();
      if (!e || t === "/login managed key") {
        return false;
      }
      return e.startsWith("sk-ant-") && e.slice(7, 10) === "api";
    } catch {
      return false;
    }
  }
  function hasAnthropicApiKeyAuth() {
    try {
      let {
        key: e,
        source: t
      } = getAnthropicApiKeyWithSource({
        skipRetrievingKeyFromApiKeyHelper: true
      });
      return e !== null && t !== "none";
    } catch {
      return false;
    }
  }
  function hasAnthropicApiKey() {
    return getAnthropicApiKeySafe() != null;
  }
  function getAnthropicApiKeyWithSource(e = {}) {
    if (kd()) {
      if (process.env.ANTHROPIC_API_KEY) {
        return {
          key: process.env.ANTHROPIC_API_KEY,
          source: "ANTHROPIC_API_KEY"
        };
      }
      if (getConfiguredApiKeyHelper()) {
        return {
          key: e.skipRetrievingKeyFromApiKeyHelper ? null : getApiKeyFromApiKeyHelperCached(),
          source: "apiKeyHelper"
        };
      }
      return {
        key: null,
        source: "none"
      };
    }
    let t = cC() ? undefined : process.env.ANTHROPIC_API_KEY;
    if (preferThirdPartyAuthentication() && t) {
      return {
        key: t,
        source: "ANTHROPIC_API_KEY"
      };
    }
    if (st(false)) {
      let s = V1t();
      if (s) {
        return {
          key: s,
          source: "ANTHROPIC_API_KEY"
        };
      }
      if (!t && !process.env.CLAUDE_CODE_OAUTH_TOKEN && !process.env.CLAUDE_CODE_OAUTH_TOKEN_FILE_DESCRIPTOR && !process.env.ANTHROPIC_AUTH_TOKEN && !shouldUseWIFAuth() && isFirstPartyProvider()) {
        throw Error("ANTHROPIC_API_KEY, ANTHROPIC_AUTH_TOKEN, CLAUDE_CODE_OAUTH_TOKEN, or WIF env vars (ANTHROPIC_FEDERATION_RULE_ID + ANTHROPIC_ORGANIZATION_ID) required");
      }
      if (t) {
        return {
          key: t,
          source: "ANTHROPIC_API_KEY"
        };
      }
      return {
        key: null,
        source: "none"
      };
    }
    if (t && getGlobalConfig().customApiKeyResponses?.approved?.includes(a2(t))) {
      return {
        key: t,
        source: "ANTHROPIC_API_KEY"
      };
    }
    let n = V1t();
    if (n) {
      return {
        key: n,
        source: "ANTHROPIC_API_KEY"
      };
    }
    if (getConfiguredApiKeyHelper()) {
      if (e.skipRetrievingKeyFromApiKeyHelper) {
        return {
          key: null,
          source: "apiKeyHelper"
        };
      }
      return {
        key: getApiKeyFromApiKeyHelperCached(),
        source: "apiKeyHelper"
      };
    }
    let o = getApiKeyFromConfigOrMacOSKeychain();
    if (o) {
      return o;
    }
    return {
      key: null,
      source: "none"
    };
  }
  function getConfiguredApiKeyHelper() {
    if (kd()) {
      return getSettingsForSource("flagSettings")?.apiKeyHelper;
    }
    if (isHostManagedProviderAuth()) {
      return;
    }
    return (getInitialSettings() || {}).apiKeyHelper;
  }
  function gOi() {
    let e = getConfiguredApiKeyHelper();
    if (!e) {
      return false;
    }
    let t = getSettingsForSource("projectSettings");
    let n = getSettingsForSource("localSettings");
    return t?.apiKeyHelper === e || n?.apiKeyHelper === e;
  }
  function getConfiguredAwsAuthRefresh() {
    if (isHostManagedProviderAuth()) {
      return;
    }
    return (getInitialSettings() || {}).awsAuthRefresh;
  }
  function isAwsAuthRefreshFromProjectSettings() {
    let e = getConfiguredAwsAuthRefresh();
    if (!e) {
      return false;
    }
    let t = getSettingsForSource("projectSettings");
    let n = getSettingsForSource("localSettings");
    return t?.awsAuthRefresh === e || n?.awsAuthRefresh === e;
  }
  function B7r() {
    if (isHostManagedProviderAuth()) {
      return;
    }
    return (getInitialSettings() || {}).awsCredentialExport;
  }
  function isAwsCredentialExportFromProjectSettings() {
    let e = B7r();
    if (!e) {
      return false;
    }
    let t = getSettingsForSource("projectSettings");
    let n = getSettingsForSource("localSettings");
    return t?.awsCredentialExport === e || n?.awsCredentialExport === e;
  }
  function calculateApiKeyHelperTTL() {
    let e = process.env.CLAUDE_CODE_API_KEY_HELPER_TTL_MS;
    if (e) {
      let t = parseInt(e, 10);
      if (!Number.isNaN(t) && t >= 0) {
        return t;
      }
      logForDebugging(`Found CLAUDE_CODE_API_KEY_HELPER_TTL_MS env var, but it was not a valid number. Got ${e}`, {
        level: "error"
      });
    }
    return 300000;
  }
  function getApiKeyHelperElapsedMs() {
    let e = mbe?.startedAt;
    return e ? Date.now() - e : 0;
  }
  async function getApiKeyFromApiKeyHelper(e) {
    if (!getConfiguredApiKeyHelper()) {
      return null;
    }
    let t = calculateApiKeyHelperTTL();
    if (P8) {
      if (Date.now() - P8.timestamp < t) {
        return P8.value;
      }
      if (!mbe) {
        mbe = {
          promise: cOi(e, false, eat),
          startedAt: null
        };
      }
      return P8.value;
    }
    if (mbe) {
      return mbe.promise;
    }
    mbe = {
      promise: cOi(e, true, eat),
      startedAt: Date.now()
    };
    return mbe.promise;
  }
  async function cOi(e, t, n) {
    try {
      let r = await j2d(e);
      if (n !== eat) {
        return r;
      }
      if (r !== null) {
        P8 = {
          value: r,
          timestamp: Date.now()
        };
      }
      return r;
    } catch (r) {
      if (n !== eat) {
        return " ";
      }
      let o = r instanceof Error ? r.message : String(r);
      if (console.error(_$u.red(`apiKeyHelper failed: ${o}`)), logForDebugging(`Error getting API key from apiKeyHelper: ${o}`, {
        level: "error"
      }), !t && P8 && P8.value !== " ") {
        P8 = {
          ...P8,
          timestamp: Date.now()
        };
        return P8.value;
      }
      P8 = {
        value: " ",
        timestamp: Date.now()
      };
      return " ";
    } finally {
      if (n === eat) {
        mbe = null;
      }
    }
  }
  async function j2d(e) {
    let t = getConfiguredApiKeyHelper();
    if (!t) {
      return null;
    }
    if (gOi()) {
      if (!checkHasTrustDialogAccepted() && !e) {
        let s = Error(`Security: apiKeyHelper executed before workspace trust is confirmed. If you see this message, post in ${{
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.FEEDBACK_CHANNEL}.`);
        logAntError("apiKeyHelper invoked before trust check", s);
        logEvent("tengu_apiKeyHelper_missing_trust11", {});
        return null;
      }
    }
    let n = await yI(t, {
      timeout: 600000,
      reject: false
    });
    if (n.failed) {
      let o = n.timedOut ? "timed out" : `exited ${n.exitCode}`;
      let s = n.stderr?.trim();
      throw Error(s ? `${o}: ${s}` : o);
    }
    let r = n.stdout?.trim();
    if (!r) {
      throw Error("did not return a value");
    }
    return r;
  }
  function getApiKeyFromApiKeyHelperCached() {
    return P8?.value ?? null;
  }
  function clearApiKeyHelperCache() {
    eat++;
    P8 = null;
    mbe = null;
  }
  function prefetchApiKeyFromApiKeyHelperIfSafe(e) {
    if (gOi() && !checkHasTrustDialogAccepted()) {
      return;
    }
    getApiKeyFromApiKeyHelper(e);
  }
  async function V2d() {
    let e = getConfiguredAwsAuthRefresh();
    let t = A7r;
    if (!e) {
      return false;
    }
    if (isAwsAuthRefreshFromProjectSettings()) {
      if (!checkHasTrustDialogAccepted() && !getIsNonInteractiveSession()) {
        let r = Error(`Security: awsAuthRefresh executed before workspace trust is confirmed. If you see this message, post in ${{
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.FEEDBACK_CHANNEL}.`);
        logAntError("awsAuthRefresh invoked before trust check", r);
        logEvent("tengu_awsAuthRefresh_missing_trust", {});
        return false;
      }
    }
    if (m4e) {
      return m4e;
    }
    try {
      logForDebugging("Fetching AWS caller identity for AWS auth refresh command");
      await Edi();
      logForDebugging("Fetched AWS caller identity, skipping AWS auth refresh command");
      return false;
    } catch {
      if (m4e) {
        return m4e;
      }
      if (dIn !== null && Date.now() - dIn < 30000) {
        return false;
      }
      m4e = (async () => {
        try {
          return await refreshAwsAuth(e);
        } finally {
          if (t === A7r) {
            dIn = Date.now();
          }
          m4e = null;
        }
      })();
      return m4e;
    }
  }
  function refreshAwsAuth(e, t) {
    logForDebugging("Running AWS auth refresh command");
    let n = KD.getInstance();
    n.startAuthentication();
    return new Promise(r => {
      let o = D7r.exec(e, {
        timeout: 180000,
        signal: t,
        windowsHide: true
      });
      o.stdout.on("data", s => {
        let i = s.toString().trim();
        if (i) {
          n.addOutput(i);
          logForDebugging(i, {
            level: "debug"
          });
        }
      });
      o.stderr.on("data", s => {
        let i = s.toString().trim();
        if (i) {
          n.setError(i);
          logForDebugging(i, {
            level: "error"
          });
        }
      });
      o.on("close", (s, i) => {
        if (s === 0) {
          logForDebugging("AWS auth refresh completed successfully");
          n.endAuthentication(true);
          r(true);
        } else {
          let a = t?.aborted === true;
          let c = a ? null : !a && i === "SIGTERM" ? _$u.red("AWS auth refresh timed out after 3 minutes. Run your auth command manually in a separate terminal.") : _$u.red("Error running awsAuthRefresh (in settings or ~/.claude.json):");
          if (c) {
            console.error(c);
          }
          n.endAuthentication(false);
          r(false);
        }
      });
    });
  }
  async function K2d() {
    let e = B7r();
    if (!e) {
      return null;
    }
    if (isAwsCredentialExportFromProjectSettings()) {
      if (!checkHasTrustDialogAccepted() && !getIsNonInteractiveSession()) {
        let n = Error(`Security: awsCredentialExport executed before workspace trust is confirmed. If you see this message, post in ${{
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.FEEDBACK_CHANNEL}.`);
        logAntError("awsCredentialExport invoked before trust check", n);
        logEvent("tengu_awsCredentialExport_missing_trust", {});
        return null;
      }
    }
    try {
      logForDebugging("Running AWS credential export command");
      let t = await yI(e, {
        reject: false
      });
      if (t.exitCode !== 0 || !t.stdout) {
        throw Error("awsCredentialExport did not return a valid value");
      }
      let n = qt(t.stdout.trim());
      let r = Tdi(n);
      if (!r) {
        throw Error("awsCredentialExport did not return valid AWS STS output structure");
      }
      logForDebugging("AWS credentials retrieved from awsCredentialExport");
      let o = r.Expiration;
      let s = typeof o === "string" ? Date.parse(o) : NaN;
      return {
        accessKeyId: r.AccessKeyId,
        secretAccessKey: r.SecretAccessKey,
        sessionToken: r.SessionToken,
        expiration: Number.isFinite(s) ? s : undefined
      };
    } catch (t) {
      let n = _$u.red("Error getting AWS credentials from awsCredentialExport (in settings or ~/.claude.json):");
      if (t instanceof Error) {
        console.error(n, t.message);
      } else {
        console.error(n, t);
      }
      return null;
    }
  }
  function clearAwsCredentialsCache() {
    refreshAndGetAwsCredentials.cache.clear();
  }
  function resetAwsAuthRefreshCooldown() {
    dIn = null;
    A7r++;
  }
  function q7r() {
    if (isHostManagedProviderAuth()) {
      return;
    }
    return (getInitialSettings() || {}).gcpAuthRefresh;
  }
  function isGcpAuthRefreshFromProjectSettings() {
    let e = q7r();
    if (!e) {
      return false;
    }
    let t = getSettingsForSource("projectSettings");
    let n = getSettingsForSource("localSettings");
    return t?.gcpAuthRefresh === e || n?.gcpAuthRefresh === e;
  }
  async function checkGcpCredentialsValid() {
    try {
      let {
        GoogleAuth: e
      } = await Promise.resolve().then(() => __toESM(FBt(), 1));
      let t = new e({
        scopes: ["https://www.googleapis.com/auth/cloud-platform"]
      });
      let n = (async () => {
        await (await t.getClient()).getAccessToken();
      })();
      let r = sleep(5000).then(() => {
        throw new OOi("GCP credentials check timed out");
      });
      await Promise.race([n, r]);
      return true;
    } catch {
      return false;
    }
  }
  async function X2d() {
    let e = q7r();
    if (!e) {
      return false;
    }
    if (isGcpAuthRefreshFromProjectSettings()) {
      if (!checkHasTrustDialogAccepted() && !getIsNonInteractiveSession()) {
        let n = Error(`Security: gcpAuthRefresh executed before workspace trust is confirmed. If you see this message, post in ${{
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.FEEDBACK_CHANNEL}.`);
        logAntError("gcpAuthRefresh invoked before trust check", n);
        logEvent("tengu_gcpAuthRefresh_missing_trust", {});
        return false;
      }
    }
    try {
      if (logForDebugging("Checking GCP credentials validity for auth refresh"), await checkGcpCredentialsValid()) {
        logForDebugging("GCP credentials are valid, skipping auth refresh command");
        return false;
      }
    } catch {}
    return refreshGcpAuth(e);
  }
  function refreshGcpAuth(e) {
    logForDebugging("Running GCP auth refresh command");
    let t = KD.getInstance();
    t.startAuthentication();
    return new Promise(n => {
      let r = D7r.exec(e, {
        timeout: 180000,
        windowsHide: true
      });
      r.stdout.on("data", o => {
        let s = o.toString().trim();
        if (s) {
          t.addOutput(s);
          logForDebugging(s, {
            level: "debug"
          });
        }
      });
      r.stderr.on("data", o => {
        let s = o.toString().trim();
        if (s) {
          t.setError(s);
          logForDebugging(s, {
            level: "error"
          });
        }
      });
      r.on("close", (o, s) => {
        if (o === 0) {
          logForDebugging("GCP auth refresh completed successfully");
          t.endAuthentication(true);
          n(true);
        } else {
          let a = s === "SIGTERM" ? _$u.red("GCP auth refresh timed out after 3 minutes. Run your auth command manually in a separate terminal.") : _$u.red("Error running gcpAuthRefresh (in settings or ~/.claude.json):");
          console.error(a);
          t.endAuthentication(false);
          n(false);
        }
      });
    });
  }
  function clearGcpCredentialsCache() {
    refreshGcpCredentialsIfNeeded.cache.clear();
  }
  function prefetchGcpCredentialsIfSafe() {
    if (!q7r()) {
      return;
    }
    if (isGcpAuthRefreshFromProjectSettings()) {
      if (!checkHasTrustDialogAccepted() && !getIsNonInteractiveSession()) {
        return;
      }
    }
    refreshGcpCredentialsIfNeeded();
  }
  function prefetchAwsCredentialsAndBedRockInfoIfSafe() {
    let e = getConfiguredAwsAuthRefresh();
    let t = B7r();
    if (!e && !t) {
      return;
    }
    if (isAwsAuthRefreshFromProjectSettings() || isAwsCredentialExportFromProjectSettings()) {
      if (!checkHasTrustDialogAccepted() && !getIsNonInteractiveSession()) {
        return;
      }
    }
    refreshAndGetAwsCredentials();
    rp();
  }
  function Z2d(e) {
    return /^[a-zA-Z0-9-_]+$/.test(e);
  }
  async function saveApiKey(e) {
    if (!Z2d(e)) {
      throw Error("Invalid API key format. API key must contain only alphanumeric characters, dashes, and underscores.");
    }
    await SOi();
    let t = false;
    if (t) {
      let r = p_e();
      let o = Wle();
      let s = Buffer.from(e, "utf-8").toString("hex");
      let i = `add-generic-password -U -a "${o}" -s "${r}" -X "${s}"
`;
      let a = await _C("security", ["-i"], {
        input: i,
        reject: false,
        timeout: 5000
      });
      if (a.exitCode !== 0) {
        let l = (a.stderr || a.stdout || "").trim().replace(/\s*\n\s*/g, "; ");
        throw logEvent("tengu_api_key_keychain_error", {
          error: l
        }), Error(`Failed to save API key to macOS Keychain${l ? ` (${l})` : ""}. Run \`claude doctor\` to diagnose keychain access.`);
      }
      logEvent("tengu_api_key_saved_to_keychain", {});
    } else {
      logEvent("tengu_api_key_saved_to_config", {});
    }
    let n = a2(e);
    saveGlobalConfig(r => {
      let o = r.customApiKeyResponses?.approved ?? [];
      return {
        ...r,
        primaryApiKey: t ? r.primaryApiKey : e,
        customApiKeyResponses: {
          ...r.customApiKeyResponses,
          approved: o.includes(n) ? o : [...o, n],
          rejected: r.customApiKeyResponses?.rejected ?? []
        }
      };
    });
    getApiKeyFromConfigOrMacOSKeychain.cache.clear?.();
    clearLegacyApiKeyPrefetch();
    getApiKeyFromConfigOrMacOSKeychainAsync.cache?.clear?.();
  }
  function isCustomApiKeyApproved(e) {
    let t = getGlobalConfig();
    let n = a2(e);
    return t.customApiKeyResponses?.approved?.includes(n) ?? false;
  }
  async function removeApiKey() {
    await SOi();
    saveGlobalConfig(e => ({
      ...e,
      primaryApiKey: undefined
    }));
    getApiKeyFromConfigOrMacOSKeychain.cache.clear?.();
    clearLegacyApiKeyPrefetch();
    getApiKeyFromConfigOrMacOSKeychainAsync.cache?.clear?.();
  }
  async function SOi() {
    try {
      await rri();
    } catch (e) {
      logForDebugging(`Failed to remove API key from macOS keychain: ${he(e)}`, {
        level: "error"
      });
    }
  }
  async function saveOAuthTokensIfNeeded(e) {
    if (!shouldUseClaudeAIAuth(e.scopes)) {
      logEvent("tengu_oauth_tokens_not_claude_ai", {});
      return {
        success: true
      };
    }
    if (!e.refreshToken || !e.expiresAt) {
      logEvent("tengu_oauth_tokens_inference_only", {});
      return {
        success: true
      };
    }
    let {
      accessToken: t,
      refreshToken: n,
      expiresAt: r,
      scopes: o,
      clientId: s
    } = e;
    let i = yl();
    let a = i.name;
    try {
      let l = await i.mutate(c => {
        let u = c.claudeAiOauth;
        return {
          ...c,
          claudeAiOauth: {
            accessToken: t,
            refreshToken: n,
            expiresAt: r,
            scopes: o,
            subscriptionType: e.subscriptionType ?? u?.subscriptionType ?? null,
            rateLimitTier: e.rateLimitTier ?? u?.rateLimitTier ?? null,
            clientId: s
          }
        };
      });
      if (l.success) {
        logEvent("tengu_oauth_tokens_saved", {
          storageBackend: a
        });
      } else {
        logEvent("tengu_oauth_tokens_save_failed", {
          storageBackend: a
        });
      }
      getClaudeAIOAuthTokens.cache?.clear?.();
      getClaudeAIOAuthTokensAsync.cache?.clear?.();
      I8();
      Une();
      return l;
    } catch (l) {
      logForDebugging(`Failed to save OAuth tokens: ${he(l)}`, {
        level: "error"
      });
      logEvent("tengu_oauth_tokens_save_exception", {
        storageBackend: a,
        error: he(l)
      });
      return {
        success: false,
        warning: "Failed to save OAuth tokens"
      };
    }
  }
  function __resetKnownDeadRefreshTokensForTest() {
    pIn.clear();
  }
  function isOAuthRefreshKnownDead() {
    let e = getClaudeAIOAuthTokens();
    if (e) {
      let t = e.refreshToken;
      return t === "" || !!t && pIn.vZc(t);
    }
    try {
      return yl().read()?.claudeAiOauth?.refreshToken === "";
    } catch {
      return false;
    }
  }
  function dOi() {
    let e = process.env.CLAUDE_CODE_OAUTH_SCOPES?.split(/\s+/).filter(Boolean);
    return e?.length ? e : ["user:inference"];
  }
  function clearOAuthTokenCache() {
    getClaudeAIOAuthTokens.cache?.clear?.();
    getClaudeAIOAuthTokensAsync.cache?.clear?.();
    m_e();
    I8();
    Une();
  }
  function resetEnvDerivedAuthCaches() {
    getClaudeAIOAuthTokens.cache?.clear?.();
    getClaudeAIOAuthTokensAsync.cache?.clear?.();
    getApiKeyFromConfigOrMacOSKeychain.cache?.clear?.();
    getApiKeyFromConfigOrMacOSKeychainAsync.cache?.clear?.();
    clearApiKeyHelperCache();
    clearAwsCredentialsCache();
    resetAwsAuthRefreshCooldown();
    clearGcpCredentialsCache();
    I8();
    Une();
  }
  async function n$d() {
    try {
      let {
        mtimeMs: e
      } = await e2t.stat(M7r.join(LY(), ".credentials.json"));
      if (e !== pOi) {
        pOi = e;
        clearOAuthTokenCache();
      }
    } catch {
      getClaudeAIOAuthTokens.cache?.clear?.();
      getClaudeAIOAuthTokensAsync.cache?.clear?.();
      let t = (await getClaudeAIOAuthTokensAsync())?.accessToken ?? null;
      if (t !== mOi) {
        mOi = t;
        I8();
        Une();
      }
    }
  }
  function handleOAuth401Error(e) {
    let t = k7r.get(e);
    if (t) {
      return t;
    }
    let n = o$d(e).finally(() => {
      k7r.delete(e);
    });
    k7r.set(e, n);
    return n;
  }
  async function waitForRotatedEnvToken(e) {
    let t = e.pollMs ?? 2000;
    let n = e.readToken ?? (() => Me.CLAUDE_CODE_OAUTH_TOKEN ?? r8() ?? undefined);
    let r = e.sleeper ?? (i => sleep(i));
    let o = Date.now() + e.timeoutMs;
    while (Date.now() < o) {
      let i = n();
      if (i && i !== e.failedAccessToken) {
        return true;
      }
      await r(Math.min(t, Math.max(1, o - Date.now())));
    }
    let s = n();
    return Boolean(s && s !== e.failedAccessToken);
  }
  function r$d() {
    let e = Me.CLAUDE_CODE_OAUTH_401_WAIT_MS;
    if (e !== undefined) {
      return e;
    }
    return Me.CLAUDE_CODE_REMOTE_SESSION_ID ? 60000 : 0;
  }
  function noteAuthRecoveryOutcome(e) {
    let t = e.nowMs ?? Date.now();
    if (e.recovered) {
      YBt = null;
      return "continue";
    }
    if (!(e.isRemoteChild ?? Boolean(Me.CLAUDE_CODE_REMOTE_SESSION_ID))) {
      return "continue";
    }
    let r = e.thresholdMs ?? Me.CLAUDE_CODE_AUTH_FAIL_EXIT_MS ?? 600000;
    if (r <= 0) {
      return "continue";
    }
    if (YBt === null) {
      YBt = t;
      return "continue";
    }
    if (t - YBt >= r) {
      return "exit";
    }
    return "continue";
  }
  function resetAuthFailureTracking() {
    YBt = null;
  }
  async function o$d(e) {
    clearOAuthTokenCache();
    let t = await getClaudeAIOAuthTokensAsync();
    if (!t?.refreshToken) {
      let n = getSdkOAuthTokenRefreshCallback();
      if (n) {
        try {
          let o = await n();
          if (o && o !== e) {
            process.env.CLAUDE_CODE_OAUTH_TOKEN = o;
            clearOAuthTokenCache();
            logEvent("tengu_oauth_401_sdk_callback_refreshed", {});
            Pe("oauth_401_recovery");
            noteAuthRecoveryOutcome({
              recovered: true
            });
            return true;
          }
          logForDebugging(o === null ? "SDK getOAuthToken callback returned null (no token available)" : "SDK getOAuthToken callback returned the same expired token; treating as no refresh", {
            level: o === null ? "debug" : "error"
          });
        } catch (o) {
          Ae("oauth_401_recovery", "oauth_401_sdk_callback_failed");
          logForDebugging(`SDK getOAuthToken callback failed: ${o instanceof Error ? o.message : String(o)}`, {
            level: "error"
          });
        }
      }
      if (process.env.CLAUDE_CODE_OAUTH_TOKEN || r8()) {
        try {
          let o = (await yl().readAsync())?.claudeAiOauth;
          if (o?.accessToken && o.accessToken !== e) {
            if (process.env.CLAUDE_CODE_OAUTH_TOKEN) {
              process.env.CLAUDE_CODE_OAUTH_TOKEN = o.accessToken;
            }
            if (r8()) {
              setOauthTokenFromFd(o.accessToken);
              setOauthScopesFromFd(o.scopes);
            }
            clearOAuthTokenCache();
            logEvent("tengu_oauth_401_recovered_from_disk", {});
            Pe("oauth_401_recovery");
            noteAuthRecoveryOutcome({
              recovered: true
            });
            return true;
          }
        } catch (o) {
          Ae("oauth_401_recovery", "oauth_401_disk_read_failed");
          Oe(o);
        }
      }
      let r = Boolean(process.env.CLAUDE_CODE_OAUTH_TOKEN) || Boolean(r8());
      if (r) {
        let o = r$d();
        if (o > 0) {
          if (logForDebugging(`OAuth 401 recovery: waiting up to ${o}ms for a rotated env token`), await waitForRotatedEnvToken({
            failedAccessToken: e,
            timeoutMs: o
          })) {
            if (r8()) {
              let s = Me.CLAUDE_CODE_OAUTH_TOKEN;
              if (s) {
                setOauthTokenFromFd(s);
              }
            }
            clearOAuthTokenCache();
            logEvent("tengu_oauth_401_recovered_from_rotation", {});
            Pe("oauth_401_recovery");
            noteAuthRecoveryOutcome({
              recovered: true
            });
            return true;
          }
        }
      }
      if (Ae("oauth_401_recovery", r ? "oauth_401_no_refresh_token_bg_worker" : "oauth_401_no_refresh_token_interactive"), noteAuthRecoveryOutcome({
        recovered: false
      }) === "exit") {
        logEvent("tengu_oauth_401_zombie_exit", {});
        logForDebugging("OAuth 401 unrecovered past CLAUDE_CODE_AUTH_FAIL_EXIT_MS \u2014 exiting so the runner recycles this session with fresh credentials", {
          level: "error"
        });
        setTimeout(() => process.exit(1), 2000);
      }
      return false;
    }
    if (t.accessToken !== e) {
      logEvent("tengu_oauth_401_recovered_from_keychain", {});
      Pe("oauth_401_recovery");
      noteAuthRecoveryOutcome({
        recovered: true
      });
      return true;
    }
    return checkAndRefreshOAuthTokenIfNeeded(0, true, e);
  }
  async function readFreshOAuthAccessToken() {
    clearOAuthTokenCache();
    return (await getClaudeAIOAuthTokensAsync())?.accessToken;
  }
  function oauthRefreshLockOptions(e) {
    return {
      lockfilePath: M7r.join(e, ".oauth_refresh.lock"),
      realpath: false,
      stale: 1e4,
      onCompromised: t => logForDebugging(`OAuth refresh lock compromised: ${t.message}`, {
        level: "error"
      })
    };
  }
  async function acquireOAuthRefreshLock(e) {
    let t = await Ry(e, oauthRefreshLockOptions(e));
    let r = `${await e2t.realpath(e).catch(() => e)}.lock`;
    let o = null;
    try {
      o = await Ry(r, {
        ...oauthRefreshLockOptions(e),
        lockfilePath: r
      });
    } catch (s) {
      if (s.code === "ELOCKED") {
        throw logEvent("tengu_oauth_refresh_legacy_lock_contended", {}), await t().catch(i => Io(i) ? logForDebugging(`OAuth refresh new-lock release failed: ${i}`) : Oe(i)), s;
      }
      if (Io(s)) {
        logForDebugging(`OAuth refresh legacy-lock acquire failed: ${s}`);
      } else {
        Oe(s);
      }
    }
    return async () => {
      if (o) {
        await o().catch(s => Io(s) ? logForDebugging(`OAuth refresh legacy-lock release failed: ${s}`) : Oe(s));
      }
      await t();
    };
  }
  async function withOAuthRefreshLock(e) {
    let t = LY();
    await Ys().mkdir(t);
    let n;
    let r = 0;
    while (!n) {
      r++;
      try {
        n = await acquireOAuthRefreshLock(t);
      } catch (o) {
        if (o.code === "ELOCKED") {
          if (r < 5) {
            await sleep(1000 + Math.random() * 1000);
            continue;
          }
          throw Error(`Lock acquisition failed after ${r} attempts: another process is refreshing`);
        }
        throw o;
      }
    }
    try {
      clearOAuthTokenCache();
      let o = await getClaudeAIOAuthTokensAsync();
      return await e({
        lockedTokens: o,
        lockAttempts: r
      });
    } finally {
      try {
        await n();
      } catch (o) {
        if (Io(o)) {
          logForDebugging(`OAuth refresh lock release failed: ${o}`);
        } else {
          Oe(o);
        }
      }
    }
  }
  function checkAndRefreshOAuthTokenIfNeeded(e = 0, t = false, n) {
    return checkAndRefreshOAuthTokenIfNeededWithOutcome(e, t, n).then(r => r === "refreshed");
  }
  function checkAndRefreshOAuthTokenIfNeededWithOutcome(e = 0, t = false, n) {
    if (e === 0 && !t) {
      if (KBt) {
        return KBt;
      }
      KBt = P7r(e, t).finally(() => {
        KBt = null;
      });
      return KBt;
    }
    return P7r(e, t, n);
  }
  function isExpectedOAuthRefreshError(e, {
    isDefaultFirstPartyClient: t
  }) {
    return isInvalidGrantError(e) || !t && isExpectedOAuthTokenError(e) || M_(e);
  }
  async function P7r(e, t, n) {
    await n$d();
    let o = await getClaudeAIOAuthTokensAsync();
    if (!t) {
      if (o && !isOAuthTokenExpired(o.expiresAt)) {
        return "not_needed";
      }
      if (!o?.refreshToken) {
        return "no_refresh_token";
      }
    }
    if (!o?.refreshToken) {
      return "no_refresh_token";
    }
    if (pIn.vZc(o.refreshToken)) {
      return "known_dead_refresh_token";
    }
    if (!shouldUseClaudeAIAuth(o.scopes) && !o.subscriptionType) {
      return "not_refreshable";
    }
    let s = n ?? o.accessToken;
    clearOAuthTokenCache();
    let i = await getClaudeAIOAuthTokensAsync();
    if (!i?.refreshToken) {
      return "no_refresh_token";
    }
    if (i.accessToken !== s) {
      logEvent("tengu_oauth_token_refresh_race_resolved", {});
      return "refreshed";
    }
    if (!t && !isOAuthTokenExpired(i.expiresAt)) {
      return "not_needed";
    }
    let a = LY();
    await Ys().mkdir(a);
    let l;
    try {
      logEvent("tengu_oauth_token_refresh_lock_acquiring", {});
      l = await acquireOAuthRefreshLock(a);
      logEvent("tengu_oauth_token_refresh_lock_acquired", {});
    } catch (d) {
      if (d.code === "ELOCKED") {
        if (e < 5) {
          logEvent("tengu_oauth_token_refresh_lock_retry", {
            retryCount: e + 1
          });
          await sleep(1000 + Math.random() * 1000);
          return P7r(e + 1, t, s);
        }
        logEvent("tengu_oauth_token_refresh_lock_retry_limit_reached", {
          maxRetries: 5
        });
        Et("oauth_token_refresh", "oauth_refresh_lock_timeout");
        return "lock_timeout";
      }
      Oe(d);
      logEvent("tengu_oauth_token_refresh_lock_error", {
        error: he(d)
      });
      Ae("oauth_token_refresh", "oauth_refresh_lock_error");
      return "lock_error";
    }
    let c = null;
    let u = true;
    try {
      clearOAuthTokenCache();
      let d = await getClaudeAIOAuthTokensAsync();
      if (!d?.refreshToken) {
        return "no_refresh_token";
      }
      if (c = d.refreshToken, d.accessToken !== s) {
        logEvent("tengu_oauth_token_refresh_race_resolved", {});
        return "refreshed";
      }
      if (!t && !isOAuthTokenExpired(d.expiresAt)) {
        return "not_needed";
      }
      logEvent("tengu_oauth_token_refresh_starting", {});
      u = Boolean((shouldUseClaudeAIAuth(d.scopes) || d.subscriptionType) && !d.clientId);
      let p = u ? Ro([...CLAUDE_AI_OAUTH_SCOPES, ...preservableScopesFrom(d.scopes)]) : d.scopes;
      let m = await refreshOAuthToken(d.refreshToken, {
        scopes: p,
        clientId: d.clientId
      });
      await saveOAuthTokensIfNeeded(m);
      clearOAuthTokenCache();
      return "refreshed";
    } catch (d) {
      if (isExpectedOAuthRefreshError(d, {
        isDefaultFirstPartyClient: u
      })) {
        logForDebugging(`OAuth refresh failed (expected): ${he(d)}`, {
          level: "error"
        });
      } else {
        Oe(d);
      }
      clearOAuthTokenCache();
      let p = await getClaudeAIOAuthTokensAsync();
      if (p && p.accessToken !== s) {
        logEvent("tengu_oauth_token_refresh_race_recovered", {});
        return "refreshed";
      }
      if (isInvalidGrantError(d) && c) {
        pIn.add(c);
        logEvent("tengu_oauth_refresh_token_marked_dead_invalid_grant", {});
        try {
          let m = false;
          let f = await yl().mutate(h => {
            let g = h.claudeAiOauth;
            if (!g || g.refreshToken !== c) {
              return h;
            }
            m = true;
            return {
              ...h,
              claudeAiOauth: {
                ...g,
                refreshToken: "",
                accessToken: "",
                expiresAt: 0
              }
            };
          });
          if (m && f.success) {
            logEvent("tengu_oauth_refresh_token_cleared_on_disk", {});
          } else if (m) {
            logForDebugging("OAuth dead-token disk clear: backend write failed", {
              level: "error"
            });
          }
        } catch (m) {
          logForDebugging(`OAuth dead-token disk clear failed: ${he(m)}`, {
            level: "error"
          });
        }
      }
      return isInvalidGrantError(d) ? "known_dead_refresh_token" : "refresh_failed";
    } finally {
      logEvent("tengu_oauth_token_refresh_lock_releasing", {});
      try {
        await l();
        logEvent("tengu_oauth_token_refresh_lock_released", {});
      } catch (d) {
        logForDebugging(`OAuth refresh lock release failed: ${d}`, {
          level: "error"
        });
        logEvent("tengu_oauth_token_refresh_lock_release_error", {});
      }
    }
  }
  function isClaudeAISubscriber() {
    if (!isAnthropicAuthEnabled()) {
      return false;
    }
    return shouldUseClaudeAIAuth(getClaudeAIOAuthTokens()?.scopes);
  }
  function hasProfileScope() {
    let e = getClaudeAIOAuthTokens()?.scopes;
    return Array.isArray(e) && e.includes("user:profile");
  }
  function hasStoredOAuthToken() {
    return getClaudeAIOAuthTokens()?.accessToken != null;
  }
  function hasOAuthScope(e) {
    let t = getClaudeAIOAuthTokens()?.scopes;
    return Array.isArray(t) && t.includes(e);
  }
  function getStoredOAuthTokenExpiresAt() {
    return getClaudeAIOAuthTokens()?.expiresAt ?? null;
  }
  function getStoredOAuthSubscriptionType() {
    return getClaudeAIOAuthTokens()?.subscriptionType ?? null;
  }
  function hasStoredOAuthRefreshToken() {
    return getClaudeAIOAuthTokens()?.refreshToken != null;
  }
  function is1PApiCustomer() {
    if (!isFirstPartyProvider()) {
      return false;
    }
    if (isClaudeAISubscriber()) {
      return false;
    }
    return true;
  }
  function getOauthAccountInfo() {
    return isAnthropicAuthEnabled() ? getGlobalConfig().oauthAccount : undefined;
  }
  function isOverageProvisioningAllowed() {
    let t = getOauthAccountInfo()?.billingType;
    if (!isClaudeAISubscriber() || !t) {
      return false;
    }
    if (t !== "stripe_subscription" && t !== "stripe_subscription_contracted" && t !== "apple_subscription" && t !== "google_play_subscription") {
      return false;
    }
    return true;
  }
  function hasOpusAccess() {
    let e = getSubscriptionType();
    return e === "max" || e === "enterprise" || e === "team" || e === "pro" || e === null;
  }
  function getSubscriptionType() {
    if (Kqr()) {
      return zqr();
    }
    if (!isAnthropicAuthEnabled()) {
      return null;
    }
    let e = getClaudeAIOAuthTokens();
    if (!e) {
      return null;
    }
    return e.subscriptionType ?? null;
  }
  function isMaxSubscriber() {
    return getSubscriptionType() === "max";
  }
  function isTeamSubscriber() {
    return getSubscriptionType() === "team";
  }
  function isTeamPremiumSubscriber() {
    return getSubscriptionType() === "team" && getRateLimitTier() === "default_claude_max_5x";
  }
  function isEnterpriseSubscriber() {
    return getSubscriptionType() === "enterprise";
  }
  function isEnterprisePAYGSubscriber() {
    return getSubscriptionType() === "enterprise" && getSeatTier() === "enterprise_usage_based";
  }
  function isProSubscriber() {
    return getSubscriptionType() === "pro";
  }
  function getRateLimitTier() {
    let e = Vqr();
    if (e !== null) {
      return e;
    }
    if (!isAnthropicAuthEnabled()) {
      return null;
    }
    let t = getClaudeAIOAuthTokens();
    if (!t) {
      return null;
    }
    return t.rateLimitTier ?? null;
  }
  function getSeatTier() {
    return getOauthAccountInfo()?.seatTier ?? null;
  }
  function getSubscriptionName() {
    switch (getSubscriptionType()) {
      case "enterprise":
        return "Claude Enterprise";
      case "team":
        return "Claude Team";
      case "max":
        return "Claude Max";
      case "pro":
        return "Claude Pro";
      default:
        return "Claude API";
    }
  }
  function isUsing3PServices() {
    return !isFirstPartyProvider();
  }
  function Q7r() {
    if (Ql()) {
      return getSettingsForSource("policySettings")?.otelHeadersHelper;
    }
    return (getInitialSettings() || {}).otelHeadersHelper;
  }
  function isOtelHeadersHelperFromProjectOrLocalSettings() {
    let e = Q7r();
    if (!e) {
      return false;
    }
    let t = getSettingsForSource("projectSettings");
    let n = getSettingsForSource("localSettings");
    return t?.otelHeadersHelper === e || n?.otelHeadersHelper === e;
  }
  function getOtelHeadersHelperLastFailure() {
    if (!Q7r()) {
      return null;
    }
    return XBt;
  }
  function clearOtelHeadersCache() {
    JBt = null;
    O7r = 0;
    Zit = null;
    XBt = null;
  }
  async function getOtelHeadersFromHelper() {
    let e = Q7r();
    if (!e) {
      return {};
    }
    let t = parseInt(process.env.CLAUDE_CODE_OTEL_HEADERS_HELPER_DEBOUNCE_MS || (1740000).toString());
    if (JBt && Date.now() - O7r < t) {
      return JBt;
    }
    if (Zit) {
      return Zit;
    }
    if (isOtelHeadersHelperFromProjectOrLocalSettings()) {
      if (!checkHasTrustDialogAccepted()) {
        return {};
      }
    }
    Zit = (async () => {
      try {
        let n = e.trim();
        let r = false;
        try {
          r = (await e2t.stat(n)).isFile();
        } catch {}
        let o = null;
        if (r) {
          try {
            let a = await _C(n, [], {
              timeout: 30000,
              reject: false
            });
            if (!(a.failed && !a.timedOut && typeof a.exitCode !== "number" && !a.signal)) {
              o = a;
            }
          } catch {}
        }
        if (!o) {
          o = await yI(e, {
            timeout: 30000,
            reject: false
          });
        }
        if (o.failed) {
          let a;
          if (o.timedOut) {
            a = "timed out";
          } else if (typeof o.exitCode === "number") {
            a = `exited ${o.exitCode}`;
          } else if (o.signal) {
            a = `was killed by ${o.signal}`;
          } else {
            a = "could not be started";
          }
          let l = o.stderr?.trim();
          throw Error(l ? `${a}: ${l}` : a);
        }
        let s = o.stdout?.toString().trim();
        if (!s) {
          throw Error("otelHeadersHelper did not return a valid value");
        }
        let i = qt(s);
        if (typeof i !== "object" || i === null || Array.isArray(i)) {
          throw Error("otelHeadersHelper must return a JSON object with string key-value pairs");
        }
        for (let [a, l] of Object.entries(i)) {
          if (typeof l !== "string") {
            throw Error(`otelHeadersHelper returned non-string value for key "${a}": ${typeof l}`);
          }
        }
        JBt = i;
        O7r = Date.now();
        XBt = null;
        return JBt;
      } catch (n) {
        let r = he(n);
        if (XBt === null && getIsNonInteractiveSession()) {
          process.stderr.write(_$u.red(`otelHeadersHelper failed (OpenTelemetry export headers unavailable): ${r}`) + `
`);
        }
        throw XBt = r, logForDebugging(`Error getting OpenTelemetry headers from otelHeadersHelper (in settings): ${r}`, {
          level: "error"
        }), n;
      } finally {
        Zit = null;
      }
    })();
    return Zit;
  }
  function COi(e) {
    return e === "max" || e === "pro";
  }
  function isConsumerSubscriber() {
    let e = getSubscriptionType();
    return isClaudeAISubscriber() && e !== null && COi(e);
  }
  function getAccountInformation() {
    if (getAPIProvider() !== "firstParty") {
      return;
    }
    let {
      source: t
    } = getAuthTokenSource();
    let n = {};
    if (t === "CLAUDE_CODE_OAUTH_TOKEN" || t === "CLAUDE_CODE_OAUTH_TOKEN_FILE_DESCRIPTOR") {
      n.tokenSource = t;
    } else if (isClaudeAISubscriber()) {
      n.subscription = getSubscriptionName();
    } else if (t !== "profile") {
      n.tokenSource = t;
    }
    let {
      key: r,
      source: o
    } = getAnthropicApiKeyWithSourceSafe();
    if (r) {
      n.apiKeySource = o;
    }
    if (t === "claude.ai" || o === "/login managed key") {
      let i = getOauthAccountInfo()?.organizationName;
      if (i) {
        n.organization = i;
      }
    }
    let s = getOauthAccountInfo()?.emailAddress;
    if ((t === "claude.ai" || o === "/login managed key") && s) {
      n.email = s;
    }
    return n;
  }
  function toAccountInfo() {
    let e = getAccountInformation();
    return {
      email: e?.email,
      organization: e?.organization,
      subscriptionType: e?.subscription,
      tokenSource: e?.tokenSource,
      apiKeySource: e?.apiKeySource,
      apiProvider: getAPIProvider()
    };
  }
  async function getAnthropicApiKeyWithSourceAsync(e = {}) {
    if (kd()) {
      if (process.env.ANTHROPIC_API_KEY) {
        return {
          key: process.env.ANTHROPIC_API_KEY,
          source: "ANTHROPIC_API_KEY"
        };
      }
      if (getConfiguredApiKeyHelper()) {
        return {
          key: e.skipRetrievingKeyFromApiKeyHelper ? null : getApiKeyFromApiKeyHelperCached(),
          source: "apiKeyHelper"
        };
      }
      return {
        key: null,
        source: "none"
      };
    }
    let t = cC() ? undefined : process.env.ANTHROPIC_API_KEY;
    if (preferThirdPartyAuthentication() && t) {
      return {
        key: t,
        source: "ANTHROPIC_API_KEY"
      };
    }
    if (st(false)) {
      let s = V1t();
      if (s) {
        return {
          key: s,
          source: "ANTHROPIC_API_KEY"
        };
      }
      if (!t && !process.env.CLAUDE_CODE_OAUTH_TOKEN && !process.env.CLAUDE_CODE_OAUTH_TOKEN_FILE_DESCRIPTOR && !process.env.ANTHROPIC_AUTH_TOKEN && !shouldUseWIFAuth() && isFirstPartyProvider()) {
        throw Error("ANTHROPIC_API_KEY, ANTHROPIC_AUTH_TOKEN, CLAUDE_CODE_OAUTH_TOKEN, or WIF env vars (ANTHROPIC_FEDERATION_RULE_ID + ANTHROPIC_ORGANIZATION_ID) required");
      }
      if (t) {
        return {
          key: t,
          source: "ANTHROPIC_API_KEY"
        };
      }
      return {
        key: null,
        source: "none"
      };
    }
    if (t && getGlobalConfig().customApiKeyResponses?.approved?.includes(a2(t))) {
      return {
        key: t,
        source: "ANTHROPIC_API_KEY"
      };
    }
    let n = V1t();
    if (n) {
      return {
        key: n,
        source: "ANTHROPIC_API_KEY"
      };
    }
    if (getConfiguredApiKeyHelper()) {
      if (e.skipRetrievingKeyFromApiKeyHelper) {
        return {
          key: null,
          source: "apiKeyHelper"
        };
      }
      return {
        key: getApiKeyFromApiKeyHelperCached(),
        source: "apiKeyHelper"
      };
    }
    let o = await getApiKeyFromConfigOrMacOSKeychainAsync();
    if (o) {
      return o;
    }
    return {
      key: null,
      source: "none"
    };
  }
  async function getAnthropicApiKeyAsync() {
    let {
      key: e
    } = await getAnthropicApiKeyWithSourceAsync();
    return e;
  }
  async function getAnthropicApiKeyWithSourceAsyncSafe(e = {}) {
    try {
      return await getAnthropicApiKeyWithSourceAsync(e);
    } catch {
      return {
        key: null,
        source: "none"
      };
    }
  }
  async function hasAnthropicApiKeyAuthAsync() {
    try {
      let {
        key: e,
        source: t
      } = await getAnthropicApiKeyWithSourceAsync({
        skipRetrievingKeyFromApiKeyHelper: true
      });
      return e !== null && t !== "none";
    } catch {
      return false;
    }
  }
  async function isAnthropicAuthEnabledAsync() {
    if (kd()) {
      return false;
    }
    if (process.env.ANTHROPIC_UNIX_SOCKET) {
      return !!process.env.CLAUDE_CODE_OAUTH_TOKEN;
    }
    if (shouldUseWIFAuth()) {
      return false;
    }
    let e = !isFirstPartyProvider();
    let n = (getInitialSettings() || {}).apiKeyHelper;
    let r = cC() ? undefined : process.env.ANTHROPIC_AUTH_TOKEN;
    let o;
    try {
      o = (await getAnthropicApiKeyWithSourceAsync({
        skipRetrievingKeyFromApiKeyHelper: true
      })).source;
    } catch {
      return false;
    }
    let s = o === "ANTHROPIC_API_KEY" || o === "apiKeyHelper";
    let i = process.env.CLAUDE_CODE_API_KEY_FILE_DESCRIPTOR;
    let a = (r || s) && !isFirstPartyManagedOAuthContext() || (n || i) && !tat();
    return !(e || a);
  }
  async function getAuthTokenSourceAsync() {
    if (kd()) {
      if (getConfiguredApiKeyHelper()) {
        return {
          source: "apiKeyHelper",
          hasToken: true
        };
      }
      return {
        source: "none",
        hasToken: false
      };
    }
    if (process.env.ANTHROPIC_AUTH_TOKEN && !isFirstPartyManagedOAuthContext() && !cC()) {
      return {
        source: "ANTHROPIC_AUTH_TOKEN",
        hasToken: true
      };
    }
    if (process.env.CLAUDE_CODE_OAUTH_TOKEN) {
      return {
        source: "CLAUDE_CODE_OAUTH_TOKEN",
        hasToken: true
      };
    }
    if (r8()) {
      if (process.env.CLAUDE_CODE_OAUTH_TOKEN_FILE_DESCRIPTOR) {
        return {
          source: "CLAUDE_CODE_OAUTH_TOKEN_FILE_DESCRIPTOR",
          hasToken: true
        };
      }
      return {
        source: "CCR_OAUTH_TOKEN_FILE",
        hasToken: true
      };
    }
    if (getConfiguredApiKeyHelper() && !tat()) {
      return {
        source: "apiKeyHelper",
        hasToken: true
      };
    }
    if (shouldUseWIFAuth()) {
      return {
        source: "profile",
        hasToken: true
      };
    }
    let n = await getClaudeAIOAuthTokensAsync();
    if (shouldUseClaudeAIAuth(n?.scopes) && n?.accessToken) {
      return {
        source: "claude.ai",
        hasToken: true
      };
    }
    return {
      source: "none",
      hasToken: false
    };
  }
  async function isClaudeAISubscriberAsync() {
    if (!(await isAnthropicAuthEnabledAsync())) {
      return false;
    }
    return shouldUseClaudeAIAuth((await getClaudeAIOAuthTokensAsync())?.scopes);
  }
  async function hasProfileScopeAsync() {
    let e = (await getClaudeAIOAuthTokensAsync())?.scopes;
    return Array.isArray(e) && e.includes("user:profile");
  }
  async function is1PApiCustomerAsync() {
    if (!isFirstPartyProvider()) {
      return false;
    }
    if (await isClaudeAISubscriberAsync()) {
      return false;
    }
    return true;
  }
  async function getOauthAccountInfoAsync() {
    return (await isAnthropicAuthEnabledAsync()) ? getGlobalConfig().oauthAccount : undefined;
  }
  async function isOverageProvisioningAllowedAsync() {
    let t = (await getOauthAccountInfoAsync())?.billingType;
    if (!(await isClaudeAISubscriberAsync()) || !t) {
      return false;
    }
    if (t !== "stripe_subscription" && t !== "stripe_subscription_contracted" && t !== "apple_subscription" && t !== "google_play_subscription") {
      return false;
    }
    return true;
  }
  async function getSubscriptionTypeAsync() {
    if (Kqr()) {
      return zqr();
    }
    if (!(await isAnthropicAuthEnabledAsync())) {
      return null;
    }
    let e = await getClaudeAIOAuthTokensAsync();
    if (!e) {
      return null;
    }
    return e.subscriptionType ?? null;
  }
  async function hasOpusAccessAsync() {
    let e = await getSubscriptionTypeAsync();
    return e === "max" || e === "enterprise" || e === "team" || e === "pro" || e === null;
  }
  async function getRateLimitTierAsync() {
    let e = Vqr();
    if (e !== null) {
      return e;
    }
    if (!(await isAnthropicAuthEnabledAsync())) {
      return null;
    }
    let t = await getClaudeAIOAuthTokensAsync();
    if (!t) {
      return null;
    }
    return t.rateLimitTier ?? null;
  }
  async function getSeatTierAsync() {
    return (await getOauthAccountInfoAsync())?.seatTier ?? null;
  }
  async function isMaxSubscriberAsync() {
    return (await getSubscriptionTypeAsync()) === "max";
  }
  async function isTeamSubscriberAsync() {
    return (await getSubscriptionTypeAsync()) === "team";
  }
  async function isTeamPremiumSubscriberAsync() {
    return (await getSubscriptionTypeAsync()) === "team" && (await getRateLimitTierAsync()) === "default_claude_max_5x";
  }
  async function isEnterpriseSubscriberAsync() {
    return (await getSubscriptionTypeAsync()) === "enterprise";
  }
  async function isEnterprisePAYGSubscriberAsync() {
    return (await getSubscriptionTypeAsync()) === "enterprise" && (await getSeatTierAsync()) === "enterprise_usage_based";
  }
  async function isProSubscriberAsync() {
    return (await getSubscriptionTypeAsync()) === "pro";
  }
  async function getSubscriptionNameAsync() {
    switch (await getSubscriptionTypeAsync()) {
      case "enterprise":
        return "Claude Enterprise";
      case "team":
        return "Claude Team";
      case "max":
        return "Claude Max";
      case "pro":
        return "Claude Pro";
      default:
        return "Claude API";
    }
  }
  async function isConsumerSubscriberAsync() {
    let e = await getSubscriptionTypeAsync();
    return (await isClaudeAISubscriberAsync()) && e !== null && COi(e);
  }
  async function getAccountInformationAsync() {
    if (getAPIProvider() !== "firstParty") {
      return;
    }
    let {
      source: t
    } = await getAuthTokenSourceAsync();
    let n = {};
    if (t === "CLAUDE_CODE_OAUTH_TOKEN" || t === "CLAUDE_CODE_OAUTH_TOKEN_FILE_DESCRIPTOR") {
      n.tokenSource = t;
    } else if (await isClaudeAISubscriberAsync()) {
      n.subscription = await getSubscriptionNameAsync();
    } else if (t !== "profile") {
      n.tokenSource = t;
    }
    let {
      key: r,
      source: o
    } = await getAnthropicApiKeyWithSourceAsyncSafe();
    if (r) {
      n.apiKeySource = o;
    }
    if (t === "claude.ai" || o === "/login managed key") {
      let i = (await getOauthAccountInfoAsync())?.organizationName;
      if (i) {
        n.organization = i;
      }
    }
    let s = (await getOauthAccountInfoAsync())?.emailAddress;
    if ((t === "claude.ai" || o === "/login managed key") && s) {
      n.email = s;
    }
    return n;
  }
  function C$d() {
    if (hasAnthropicApiKeyAuth() || !!Me.ANTHROPIC_AUTH_TOKEN || !!Me.CLAUDE_CODE_API_KEY_FILE_DESCRIPTOR || !!getConfiguredApiKeyHelper()) {
      return true;
    }
    return getAPIProvider() === "firstParty" && !shouldUseWIFAuth() && !isAnthropicAuthEnabled();
  }
  async function validateForceLoginOrg() {
    let e = getSettingsForSource("policySettings");
    let t = e?.forceLoginOrgUUID;
    let n = t !== undefined || e?.forceLoginMethod !== undefined;
    if (Me.CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST) {
      if (n) {
        Et("auth_force_login_org", "managed_by_host_under_pin");
      }
      return {
        valid: true
      };
    }
    if (process.env.ANTHROPIC_UNIX_SOCKET) {
      let u = {
        api_provider: getAPIProvider(),
        auth_token_source: getAuthTokenSource().source
      };
      if (!isAnthropicAuthEnabled() && n) {
        Et("auth_force_login_org", "unix_socket_3p_under_pin", u);
      } else if (isAnthropicAuthEnabled() && t !== undefined) {
        Et("auth_force_login_org", "unix_socket_ssh_under_pin", u);
      } else if (e === null && getPolicySettingsLoadErrors().length > 0) {
        Et("auth_force_login_org", "unix_socket_unreadable_policy", u);
      } else {
        Pe("auth_force_login_org");
      }
      return {
        valid: true
      };
    }
    if (!isAnthropicAuthEnabled()) {
      if (n && C$d()) {
        return {
          valid: false,
          message: `This machine's managed settings require a first-party login, but an
Anthropic-issued credential (ANTHROPIC_API_KEY, ANTHROPIC_AUTH_TOKEN,
or apiKeyHelper) is configured. A non-OAuth Anthropic credential
cannot satisfy the org pin.

Remove the credential and run: claude auth login

If this is a third-party desktop session: forceLoginOrgUUID targets first-party OAuth and should be removed from managed-settings.json.`
        };
      }
      return {
        valid: true
      };
    }
    if (t === undefined) {
      if (e === null) {
        let d = getPolicySettingsLoadErrors()[0];
        if (d) {
          let p = d.message.includes("could not be read");
          let m = d.message.match(R$d);
          let f = POi.find(y => y === m?.[1]);
          let h = p ? (f == null ? undefined : f) ?? "other" : "malformed";
          await ou("auth_force_login_org", "policy_unreadable_fail_close", {
            errno: h
          });
          return {
            valid: false,
            message: `Unable to read managed policy settings.
This machine may require organization login enforcement, but the policy file failed to load.
Contact your administrator.

Detail: ${d.file ? `${d.file}: ${d.message}` : d.message}`
          };
        }
      }
      return {
        valid: true
      };
    }
    let r = typeof t === "string" ? [t] : t;
    if (r.length === 0) {
      return {
        valid: false,
        message: `forceLoginOrgUUID in managed settings is set to an empty array.
No organizations are permitted. This is almost certainly a misconfiguration.
Contact your administrator.`
      };
    }
    let o = r.length === 1 ? `organization ${r[0]}` : `one of these organizations: ${r.join(", ")}`;
    await checkAndRefreshOAuthTokenIfNeeded();
    let s = getClaudeAIOAuthTokens();
    if (!s) {
      return {
        valid: true
      };
    }
    let {
      source: i
    } = getAuthTokenSource();
    let a = i === "CLAUDE_CODE_OAUTH_TOKEN" || i === "CLAUDE_CODE_OAUTH_TOKEN_FILE_DESCRIPTOR";
    let l = await uwn(s.accessToken);
    if (!l) {
      return {
        valid: false,
        message: `Unable to verify organization for the current authentication token.
This machine requires ${o} but the token could not be validated.
This may be a network error, or the token may have been revoked.
Try again, or run: claude auth login`
      };
    }
    let c = l.organization_uuid;
    if (r.includes(c)) {
      return {
        valid: true
      };
    }
    if (a) {
      return {
        valid: false,
        message: `The ${i === "CLAUDE_CODE_OAUTH_TOKEN" ? "CLAUDE_CODE_OAUTH_TOKEN" : "CLAUDE_CODE_OAUTH_TOKEN_FILE_DESCRIPTOR"} environment variable provides a token for a
different organization than required by this machine's managed settings.

Required: ${o}
Token organization: ${c}

Remove the environment variable or obtain a token for a permitted organization.`
      };
    }
    return {
      valid: false,
      message: `Your authentication token belongs to organization ${c},
but this machine requires ${o}.

Please log in with a permitted organization: claude auth login`
    };
  }
  var D7r;
  var e2t;
  var M7r;
  var fOi;
  var hOi;
  var SDK_OAUTH_REFRESH_ENTRYPOINTS;
  var P8 = null;
  var mbe = null;
  var eat = 0;
  var dIn = null;
  var m4e = null;
  var A7r = 0;
  var refreshAndGetAwsCredentials;
  var refreshGcpCredentialsIfNeeded;
  var getApiKeyFromConfigOrMacOSKeychain;
  var pIn;
  var getClaudeAIOAuthTokens;
  var pOi = 0;
  var mOi = null;
  var k7r;
  var YBt = null;
  var getClaudeAIOAuthTokensAsync;
  var KBt = null;
  var JBt = null;
  var O7r = 0;
  var Zit = null;
  var XBt = null;
  var getApiKeyFromConfigOrMacOSKeychainAsync;
  var POi;
  var R$d;
  var OOi;
  var no = __lazy(() => {
    Uc();
    ln();
    Ot();
    sne();
    Ds();
    at();
    Aot();
    jle();
    qP();
    fqe();
    Mot();
    _b();
    Twn();
    Lot();
    G4r();
    ICn();
    DC();
    je();
    $A();
    pr();
    gn();
    dt();
    ji();
    uIn();
    Rn();
    nW();
    oF();
    DW();
    _st();
    o8();
    Xit();
    D7r = require("child_process");
    e2t = require("fs/promises");
    M7r = require("path");
    fOi = TEr(() => {
      logForDebugging(`An Anthropic profile (~/.config/anthropic) is configured, but a claude.ai login exists \u2014 using the claude.ai login. Set ANTHROPIC_PROFILE=<name> to use the profile instead.${""}`, {
        level: "warn"
      });
      queueMicrotask(() => logEvent("tengu_wif_implicit_profile_skipped_stored_login", {}));
    });
    hOi = TEr(() => {
      let e = getWIFPrecedenceSource() ?? "profile";
      let t = e === "profile-implicit" && getWIFAuthType() === "user_oauth";
      logForDebugging(`Using Anthropic profile auth (${e}); ${t ? "a claude.ai login (/login) would take precedence over it" : "this takes precedence over any stored claude.ai login"}`, {
        level: "info"
      });
    });
    SDK_OAUTH_REFRESH_ENTRYPOINTS = new Set(["claude-desktop", "local-agent", "claude-vscode"]);
    refreshAndGetAwsCredentials = vye(async () => {
      let e = performance.now();
      logForDebugging("[API:auth] AWS credential resolve start");
      let t = await V2d();
      let n = await K2d();
      if (t || n) {
        await vdi();
      }
      logForDebugging(`[API:auth] AWS credential resolve done in ${Math.round(performance.now() - e)}ms`);
      return n;
    }, e => {
      let t = e?.expiration;
      let n = t === undefined ? undefined : t - Date.now();
      if (n === undefined || n <= 300000 + 60000) {
        return 3600000;
      }
      return n - 300000;
    });
    refreshGcpCredentialsIfNeeded = vye(async () => await X2d(), 3600000);
    getApiKeyFromConfigOrMacOSKeychain = TEr(() => {
      if (kd() || isHostManagedProviderAuth()) {
        return null;
      }
      let e = getGlobalConfig();
      if (!e.primaryApiKey) {
        return null;
      }
      return {
        key: e.primaryApiKey,
        source: "/login managed key"
      };
    });
    pIn = new Set();
    getClaudeAIOAuthTokens = TEr(() => {
      if (kd()) {
        return null;
      }
      if (process.env.CLAUDE_CODE_OAUTH_TOKEN) {
        return {
          accessToken: process.env.CLAUDE_CODE_OAUTH_TOKEN,
          refreshToken: null,
          expiresAt: null,
          scopes: dOi(),
          subscriptionType: process.env.CLAUDE_CODE_SUBSCRIPTION_TYPE || null,
          rateLimitTier: process.env.CLAUDE_CODE_RATE_LIMIT_TIER || null
        };
      }
      let e = r8();
      if (e) {
        return {
          accessToken: e,
          refreshToken: null,
          expiresAt: null,
          scopes: getOauthScopesFromFd() ?? dOi(),
          subscriptionType: process.env.CLAUDE_CODE_SUBSCRIPTION_TYPE || null,
          rateLimitTier: process.env.CLAUDE_CODE_RATE_LIMIT_TIER || null
        };
      }
      if (isHostManagedProviderAuth()) {
        return null;
      }
      try {
        let r = yl().read()?.claudeAiOauth;
        if (!r?.accessToken) {
          return null;
        }
        return r;
      } catch (t) {
        Oe(t);
        return null;
      }
    });
    k7r = new Map();
    getClaudeAIOAuthTokensAsync = FDt(async () => {
      if (kd()) {
        return null;
      }
      if (process.env.CLAUDE_CODE_OAUTH_TOKEN || r8()) {
        return getClaudeAIOAuthTokens();
      }
      if (isHostManagedProviderAuth()) {
        return null;
      }
      try {
        let n = (await yl().readAsync())?.claudeAiOauth;
        if (!n?.accessToken) {
          return null;
        }
        return n;
      } catch (e) {
        Oe(e);
        return null;
      }
    });
    getApiKeyFromConfigOrMacOSKeychainAsync = FDt(async () => {
      if (kd() || isHostManagedProviderAuth()) {
        return null;
      }
      let e = getGlobalConfig();
      if (!e.primaryApiKey) {
        return null;
      }
      return {
        key: e.primaryApiKey,
        source: "/login managed key"
      };
    });
    POi = ["EACCES", "EPERM", "EBUSY", "EIO", "EISDIR", "ELOOP"];
    R$d = new RegExp(`\\b(${POi.join("|")})\\b`);
    OOi = class OOi extends Error {};
  });
  var vmi = {};
  __export(vmi, {
    withOAuth401Retry: () => withOAuth401Retry,
    getWebFetchUserAgent: () => getWebFetchUserAgent,
    getUserAgent: () => getUserAgent,
    getMCPUserAgent: () => getMCPUserAgent,
    getClientPlatform: () => getClientPlatform,
    getAuthHeadersAsync: () => getAuthHeadersAsync,
    getAuthHeaders: () => getAuthHeaders
  });
  function getUserAgent() {
    let e = process.env.CLAUDE_AGENT_SDK_VERSION ? `, agent-sdk/${process.env.CLAUDE_AGENT_SDK_VERSION}` : "";
    let t = process.env.CLAUDE_AGENT_SDK_CLIENT_APP ? `, client-app/${process.env.CLAUDE_AGENT_SDK_CLIENT_APP}` : "";
    let n = QCn();
    let r = n ? `, workload/${n}` : "";
    return `claude-cli/${{
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION} (external, ${process.env.CLAUDE_CODE_ENTRYPOINT ?? "cli"}${e}${t}${r})`;
  }
  function getMCPUserAgent() {
    let e = [];
    if (process.env.CLAUDE_CODE_ENTRYPOINT) {
      e.push(process.env.CLAUDE_CODE_ENTRYPOINT);
    }
    if (process.env.CLAUDE_AGENT_SDK_VERSION) {
      e.push(`agent-sdk/${process.env.CLAUDE_AGENT_SDK_VERSION}`);
    }
    if (process.env.CLAUDE_AGENT_SDK_CLIENT_APP) {
      e.push(`client-app/${process.env.CLAUDE_AGENT_SDK_CLIENT_APP}`);
    }
    let t = e.length > 0 ? ` (${e.join(", ")})` : "";
    return `claude-code/${{
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION}${t}`;
  }
  function getWebFetchUserAgent() {
    return `Claude-User (${dg()}; +https://support.anthropic.com/)`;
  }
  async function getAuthHeadersAsync() {
    if (!getAnthropicApiKeySafe() && shouldUseWIFAuth()) {
      try {
        let {
          getWIFCredentials: e,
          getWIFTokenCache: t
        } = await Promise.resolve().then(() => (Hqe(), hGr));
        let [n, r] = await Promise.all([t(), e()]);
        if (n !== null) {
          return {
            headers: {
              ...r?.extraHeaders,
              Authorization: `Bearer ${await n.getToken()}`,
              "anthropic-beta": "oauth-2025-04-20"
            }
          };
        }
      } catch (e) {
        logForDebugging(`WIF auth header resolution failed: ${e instanceof Error ? e.message : String(e)}`, {
          level: "error"
        });
        return {
          headers: {},
          error: e instanceof Error ? e.message : String(e),
          reasonCode: "wif_error"
        };
      }
    }
    return getAuthHeaders();
  }
  function getAuthHeaders() {
    if (isUsing3PServices()) {
      return {
        headers: {},
        error: "Anthropic auth not used on third-party providers",
        reasonCode: "third_party"
      };
    }
    if (isClaudeAISubscriber()) {
      let t = getClaudeAIOAuthTokens();
      if (!t?.accessToken) {
        return {
          headers: {},
          error: "No OAuth token available",
          reasonCode: "no_oauth_token"
        };
      }
      return {
        headers: {
          Authorization: `Bearer ${t.accessToken}`,
          "anthropic-beta": "oauth-2025-04-20"
        }
      };
    }
    if (getAPIProvider() === "gateway") {
      return {
        headers: {},
        error: "Not available when using a Cloud gateway",
        reasonCode: "gateway"
      };
    }
    let e = getAnthropicApiKeySafe();
    if (!e) {
      return {
        headers: {},
        error: "No API key available",
        reasonCode: "no_api_key"
      };
    }
    return {
      headers: {
        "x-api-key": e
      }
    };
  }
  async function withOAuth401Retry(e, t) {
    try {
      return await e();
    } catch (n) {
      if (!NP.isAxiosError(n)) {
        throw n;
      }
      let r = n.response?.status;
      if (!(r === 401 || t?.also403Revoked && r === 403 && typeof n.response?.data === "string" && n.response.data.includes("OAuth token has been revoked"))) {
        throw n;
      }
      let s = getClaudeAIOAuthTokens()?.accessToken;
      if (!s) {
        throw n;
      }
      await handleOAuth401Error(s);
      return await e();
    }
  }
  var YA = __lazy(() => {
    Dp();
    Uc();
    no();
    je();
    Ds();
    xqe();
  });
  function bIn(e, t = process.argv) {
    let n;
    for (let r = 0; r < t.length; r++) {
      let o = t[r];
      if (o === "--") {
        break;
      }
      if (o?.startsWith(`${e}=`)) {
        n = o.slice(e.length + 1);
        continue;
      }
      if (o === e && r + 1 < t.length) {
        n = t[++r];
        continue;
      }
      if (o !== undefined && DOi.vZc(o)) {
        r++;
      }
    }
    return n;
  }
  function MOi(e, t = process.argv) {
    for (let n = 0; n < t.length; n++) {
      let r = t[n];
      if (r === "--") {
        break;
      }
      if (r === e) {
        return true;
      }
      if (r !== undefined && DOi.vZc(r)) {
        n++;
      }
    }
    return false;
  }
  var DOi;
  var nYr = __lazy(() => {
    DOi = new Set(["--prefill", "--prefill-b64", "--deep-link-repo", "--deep-link-last-fetch", "--deep-link-cwd-b64", "--handle-uri", "--settings", "--managed-settings", "--setting-sources", "--team-name", "--agent-id", "--agent-name", "--agent-color", "--parent-session-id", "--agent-type", "--model", "--agent", "--routine", "--effort", "--permission-mode", "--session-id"]);
  });
  function NOi(e) {
    let t = rYr;
    rYr = e;
    return t;
  }
  class LOi {
    #e;
    isEnabled() {
      if (this.#e !== undefined) {
        return this.#e;
      }
      let e;
      if (MOi("--ax-screen-reader")) {
        e = true;
      } else {
        let t = Me.CLAUDE_AX_SCREEN_READER;
        e = t !== undefined ? t : getInitialSettings().axScreenReader === true;
      }
      if (!e) {
        return this.#e = false;
      }
      return this.#e = rYr?.("tengu_ax_screen_reader", true) ?? true;
    }
    reset() {
      this.#e = undefined;
    }
  }
  function tM() {
    return FOi.isEnabled();
  }
  function yIe() {
    if (FOi.isEnabled()) {
      return {
        CLAUDE_AX_SCREEN_READER: "1"
      };
    }
    return {};
  }
  var rYr = null;
  var FOi;
  var D8 = __lazy(() => {
    nYr();
    pr();
    FOi = new LOi();
  });
  async function BOi() {
    if (d2t === null && !u2t) {
      u2t = I$d();
      d2t = await u2t;
      u2t = null;
      sat.cache.clear?.();
    }
  }
  function _Ie() {
    d2t = null;
    u2t = null;
    sat.cache.clear?.();
    kce.cache.clear?.();
  }
  function $Oi() {
    return sat(true);
  }
  function A$d() {
    return;
  }
  async function I$d() {
    return;
  }
  function UOi(e) {
    return typeof e === "string" && e.length >= 8 ? e : undefined;
  }
  var d2t = null;
  var u2t = null;
  var sat;
  var kce;
  var HOi;
  var Bne = __lazy(() => {
    at();
    no();
    vo();
    pr();
    gn();
    oF();
    sat = TEr(e => {
      let t = getOrCreateUserID();
      let n = getGlobalConfig();
      let r;
      let o;
      let s;
      if (e) {
        if (r = getSubscriptionType() ?? undefined, o = getRateLimitTier() ?? undefined, r && n.claudeCodeFirstTokenDate) {
          let c = new Date(n.claudeCodeFirstTokenDate).getTime();
          if (!isNaN(c)) {
            s = c;
          }
        }
      }
      let i = getOauthAccountInfo();
      let a = UOi(i?.organizationUuid);
      let l = UOi(i?.accountUuid);
      return {
        deviceId: t,
        sessionId: getSessionId(),
        email: A$d(),
        appVersion: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION,
        platform: RDt(),
        organizationUuid: a,
        accountUuid: l,
        userType: "external",
        subscriptionType: r,
        rateLimitTier: o,
        firstTokenTime: s,
        ...(st(process.env.GITHUB_ACTIONS) && {
          githubActionsMetadata: {
            actor: process.env.GITHUB_ACTOR,
            actorId: process.env.GITHUB_ACTOR_ID,
            repository: process.env.GITHUB_REPOSITORY,
            repositoryId: process.env.GITHUB_REPOSITORY_ID,
            repositoryOwner: process.env.GITHUB_REPOSITORY_OWNER,
            repositoryOwnerId: process.env.GITHUB_REPOSITORY_OWNER_ID
          }
        })
      };
    });
    kce = TEr(async () => {
      let e = await yI("git config --get user.email", {
        reject: false,
        cwd: Nt()
      });
      return e.exitCode === 0 && e.stdout ? e.stdout.trim() : undefined;
    });
    HOi = TEr(async () => {
      let e = await yI("git config --get user.name", {
        reject: false,
        cwd: Nt()
      });
      return e.exitCode === 0 && e.stdout ? e.stdout.trim() : undefined;
    });
  });
  async function O$d(e) {
    return (await oYr).getRandomValues(new Uint8Array(e));
  }
  async function D$d(e) {
    let n = "";
    let r = await O$d(e);
    for (let o = 0; o < e; o++) {
      let s = r[o] % 66;
      n += "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~"[s];
    }
    return n;
  }
  async function M$d(e) {
    return await D$d(e);
  }
  async function N$d(e) {
    let t = await (await oYr).subtle.digest("SHA-256", new TextEncoder().HS(e));
    return btoa(String.fromCharCode(...new Uint8Array(t))).replace(/\//g, "_").replace(/\+/g, "-").replace(/=/g, "");
  }
  async function sYr(e) {
    if (!e) {
      e = 43;
    }
    if (e < 43 || e > 128) {
      throw `Expected a length between 43 and 128. Received ${e}.`;
    }
    let t = await M$d(e);
    let n = await N$d(t);
    return {
      code_verifier: t,
      code_challenge: n
    };
  }
  var oYr;
  var jOi = __lazy(() => {
    oYr = globalThis.crypto?.webcrypto ?? globalThis.crypto ?? import("crypto").then(e => e.webcrypto);
  });
  var UF;
  var WOi;
  var p2t;
  var L$d;
  var SIn;
  var TIn;
  var EIn;
  var qOi;
  var F$d;
  var U$d;
  var GOi;
  var j7g;
  var q7g;
  var m2t = __lazy(() => {
    UF = url_export().superRefine((e, t) => {
      if (!URL.canParse(e)) {
        t.addIssue({
          code: ZodIssueCode_export.custom,
          message: "URL must be parseable",
          fatal: true
        });
        return NEVER_export;
      }
    }).refine(e => {
      let t = new URL(e);
      return t.protocol !== "javascript:" && t.protocol !== "data:" && t.protocol !== "vbscript:";
    }, {
      message: "URL cannot use javascript:, data:, or vbscript: scheme"
    });
    WOi = looseObject({
      resource: string_export3().url(),
      authorization_servers: array_export(UF).optional(),
      jwks_uri: string_export3().url().optional(),
      scopes_supported: array_export(string_export3()).optional(),
      bearer_methods_supported: array_export(string_export3()).optional(),
      resource_signing_alg_values_supported: array_export(string_export3()).optional(),
      resource_name: string_export3().optional(),
      resource_documentation: string_export3().optional(),
      resource_policy_uri: string_export3().url().optional(),
      resource_tos_uri: string_export3().url().optional(),
      tls_client_certificate_bound_access_tokens: boolean_export3().optional(),
      authorization_details_types_supported: array_export(string_export3()).optional(),
      dpop_signing_alg_values_supported: array_export(string_export3()).optional(),
      dpop_bound_access_tokens_required: boolean_export3().optional()
    });
    p2t = looseObject({
      issuer: string_export3(),
      authorization_endpoint: UF,
      token_endpoint: UF,
      registration_endpoint: UF.optional(),
      scopes_supported: array_export(string_export3()).optional(),
      response_types_supported: array_export(string_export3()),
      response_modes_supported: array_export(string_export3()).optional(),
      grant_types_supported: array_export(string_export3()).optional(),
      token_endpoint_auth_methods_supported: array_export(string_export3()).optional(),
      token_endpoint_auth_signing_alg_values_supported: array_export(string_export3()).optional(),
      service_documentation: UF.optional(),
      revocation_endpoint: UF.optional(),
      revocation_endpoint_auth_methods_supported: array_export(string_export3()).optional(),
      revocation_endpoint_auth_signing_alg_values_supported: array_export(string_export3()).optional(),
      introspection_endpoint: string_export3().optional(),
      introspection_endpoint_auth_methods_supported: array_export(string_export3()).optional(),
      introspection_endpoint_auth_signing_alg_values_supported: array_export(string_export3()).optional(),
      code_challenge_methods_supported: array_export(string_export3()).optional(),
      client_id_metadata_document_supported: boolean_export3().optional()
    });
    L$d = looseObject({
      issuer: string_export3(),
      authorization_endpoint: UF,
      token_endpoint: UF,
      userinfo_endpoint: UF.optional(),
      jwks_uri: UF,
      registration_endpoint: UF.optional(),
      scopes_supported: array_export(string_export3()).optional(),
      response_types_supported: array_export(string_export3()),
      response_modes_supported: array_export(string_export3()).optional(),
      grant_types_supported: array_export(string_export3()).optional(),
      acr_values_supported: array_export(string_export3()).optional(),
      subject_types_supported: array_export(string_export3()),
      id_token_signing_alg_values_supported: array_export(string_export3()),
      id_token_encryption_alg_values_supported: array_export(string_export3()).optional(),
      id_token_encryption_enc_values_supported: array_export(string_export3()).optional(),
      userinfo_signing_alg_values_supported: array_export(string_export3()).optional(),
      userinfo_encryption_alg_values_supported: array_export(string_export3()).optional(),
      userinfo_encryption_enc_values_supported: array_export(string_export3()).optional(),
      request_object_signing_alg_values_supported: array_export(string_export3()).optional(),
      request_object_encryption_alg_values_supported: array_export(string_export3()).optional(),
      request_object_encryption_enc_values_supported: array_export(string_export3()).optional(),
      token_endpoint_auth_methods_supported: array_export(string_export3()).optional(),
      token_endpoint_auth_signing_alg_values_supported: array_export(string_export3()).optional(),
      display_values_supported: array_export(string_export3()).optional(),
      claim_types_supported: array_export(string_export3()).optional(),
      claims_supported: array_export(string_export3()).optional(),
      service_documentation: string_export3().optional(),
      claims_locales_supported: array_export(string_export3()).optional(),
      ui_locales_supported: array_export(string_export3()).optional(),
      claims_parameter_supported: boolean_export3().optional(),
      request_parameter_supported: boolean_export3().optional(),
      request_uri_parameter_supported: boolean_export3().optional(),
      require_request_uri_registration: boolean_export3().optional(),
      op_policy_uri: UF.optional(),
      op_tos_uri: UF.optional(),
      client_id_metadata_document_supported: boolean_export3().optional()
    });
    SIn = object_export({
      ...L$d.shape,
      ...p2t.pick({
        code_challenge_methods_supported: true
      }).shape
    });
    TIn = object_export({
      access_token: string_export3(),
      id_token: string_export3().optional(),
      token_type: string_export3(),
      expires_in: coerce_export.number().optional(),
      scope: string_export3().optional(),
      refresh_token: string_export3().optional()
    }).strip();
    EIn = object_export({
      error: string_export3(),
      error_description: string_export3().optional(),
      error_uri: string_export3().optional()
    });
    qOi = UF.optional().or(literal_export("").transform(() => {
      return;
    }));
    F$d = object_export({
      redirect_uris: array_export(UF),
      token_endpoint_auth_method: string_export3().optional(),
      grant_types: array_export(string_export3()).optional(),
      response_types: array_export(string_export3()).optional(),
      client_name: string_export3().optional(),
      client_uri: UF.optional(),
      logo_uri: qOi,
      scope: string_export3().optional(),
      contacts: array_export(string_export3()).optional(),
      tos_uri: qOi,
      policy_uri: string_export3().optional(),
      jwks_uri: UF.optional(),
      jwks: any_export().optional(),
      software_id: string_export3().optional(),
      software_version: string_export3().optional(),
      software_statement: string_export3().optional()
    }).strip();
    U$d = object_export({
      client_id: string_export3(),
      client_secret: string_export3().optional(),
      client_id_issued_at: number_export3().optional(),
      client_secret_expires_at: number_export3().optional()
    }).strip();
    GOi = F$d.merge(U$d);
    j7g = object_export({
      error: string_export3(),
      error_description: string_export3().optional()
    }).strip();
    q7g = object_export({
      token: string_export3(),
      token_type_hint: string_export3().optional()
    }).strip();
  });
  function VOi(e) {
    let t = typeof e === "string" ? new URL(e) : new URL(e.href);
    t.hash = "";
    return t;
  }
  function zOi({
    requestedResource: e,
    configuredResource: t
  }) {
    let n = typeof e === "string" ? new URL(e) : new URL(e.href);
    let r = typeof t === "string" ? new URL(t) : new URL(t.href);
    if (n.origin !== r.origin) {
      return false;
    }
    if (n.pathname.length < r.pathname.length) {
      return false;
    }
    let o = n.pathname.endsWith("/") ? n.pathname : n.pathname + "/";
    let s = r.pathname.endsWith("/") ? r.pathname : r.pathname + "/";
    return o.startsWith(s);
  }
  var cw;
  var vIn;
  var iat;
  var bIe;
  var aat;
  var wIn;
  var CIn;
  var RIn;
  var Ace;
  var lat;
  var xIn;
  var kIn;
  var AIn;
  var IIn;
  var cat;
  var uat;
  var PIn;
  var OIn;
  var KOi;
  var iYr = __lazy(() => {
    cw = class cw extends Error {
      constructor(e, t) {
        super(e);
        this.errorUri = t;
        this.name = this.constructor.name;
      }
      toResponseObject() {
        let e = {
          error: this.errorCode,
          error_description: this.message
        };
        if (this.errorUri) {
          e.error_uri = this.errorUri;
        }
        return e;
      }
      get errorCode() {
        return this.constructor.errorCode;
      }
    };
    vIn = class vIn extends cw {};
    vIn.errorCode = "invalid_request";
    iat = class iat extends cw {};
    iat.errorCode = "invalid_client";
    bIe = class bIe extends cw {};
    bIe.errorCode = "invalid_grant";
    aat = class aat extends cw {};
    aat.errorCode = "unauthorized_client";
    wIn = class wIn extends cw {};
    wIn.errorCode = "unsupported_grant_type";
    CIn = class CIn extends cw {};
    CIn.errorCode = "invalid_scope";
    RIn = class RIn extends cw {};
    RIn.errorCode = "access_denied";
    Ace = class Ace extends cw {};
    Ace.errorCode = "server_error";
    lat = class lat extends cw {};
    lat.errorCode = "temporarily_unavailable";
    xIn = class xIn extends cw {};
    xIn.errorCode = "unsupported_response_type";
    kIn = class kIn extends cw {};
    kIn.errorCode = "unsupported_token_type";
    AIn = class AIn extends cw {};
    AIn.errorCode = "invalid_token";
    IIn = class IIn extends cw {};
    IIn.errorCode = "method_not_allowed";
    cat = class cat extends cw {};
    cat.errorCode = "too_many_requests";
    uat = class uat extends cw {};
    uat.errorCode = "invalid_client_metadata";
    PIn = class PIn extends cw {};
    PIn.errorCode = "insufficient_scope";
    OIn = class OIn extends cw {};
    OIn.errorCode = "invalid_target";
    KOi = {
      [vIn.errorCode]: vIn,
      [iat.errorCode]: iat,
      [bIe.errorCode]: bIe,
      [aat.errorCode]: aat,
      [wIn.errorCode]: wIn,
      [CIn.errorCode]: CIn,
      [RIn.errorCode]: RIn,
      [Ace.errorCode]: Ace,
      [lat.errorCode]: lat,
      [xIn.errorCode]: xIn,
      [kIn.errorCode]: kIn,
      [AIn.errorCode]: AIn,
      [IIn.errorCode]: IIn,
      [cat.errorCode]: cat,
      [uat.errorCode]: uat,
      [PIn.errorCode]: PIn,
      [OIn.errorCode]: OIn
    };
  });
  function B$d(e) {
    return ["client_secret_basic", "client_secret_post", "none"].includes(e);
  }
  function $$d(e, t) {
    let n = e.client_secret !== undefined;
    if ("token_endpoint_auth_method" in e && e.token_endpoint_auth_method && B$d(e.token_endpoint_auth_method) && (t.length === 0 || t.includes(e.token_endpoint_auth_method))) {
      return e.token_endpoint_auth_method;
    }
    if (t.length === 0) {
      return n ? "client_secret_basic" : "none";
    }
    if (n && t.includes("client_secret_basic")) {
      return "client_secret_basic";
    }
    if (n && t.includes("client_secret_post")) {
      return "client_secret_post";
    }
    if (t.includes("none")) {
      return "none";
    }
    return n ? "client_secret_post" : "none";
  }
  function H$d(e, t, n, r) {
    let {
      client_id: o,
      client_secret: s
    } = t;
    switch (e) {
      case "client_secret_basic":
        j$d(o, s, n);
        return;
      case "client_secret_post":
        q$d(o, s, r);
        return;
      case "none":
        W$d(o, r);
        return;
      default:
        throw Error(`Unsupported client authentication method: ${e}`);
    }
  }
  function j$d(e, t, n) {
    if (!t) {
      throw Error("client_secret_basic authentication requires a client_secret");
    }
    let r = btoa(`${e}:${t}`);
    n.set("Authorization", `Basic ${r}`);
  }
  function q$d(e, t, n) {
    if (n.set("client_id", e), t) {
      n.set("client_secret", t);
    }
  }
  function W$d(e, t) {
    t.set("client_id", e);
  }
  async function JOi(e) {
    let t = e instanceof Response ? e.status : undefined;
    let n = e instanceof Response ? await e.text() : e;
    try {
      let r = EIn.parse(JSON.parse(n));
      let {
        error: o,
        error_description: s,
        error_uri: i
      } = r;
      return new (KOi[o] || Ace)(s || "", i);
    } catch (r) {
      let o = `${t ? `HTTP ${t}: ` : ""}Invalid OAuth error response: ${r}. Raw body: ${n}`;
      return new Ace(o);
    }
  }
  async function pJ(e, t) {
    try {
      return await cYr(e, t);
    } catch (n) {
      if (n instanceof iat || n instanceof aat) {
        await e.invalidateCredentials?.("all");
        return await cYr(e, t);
      } else if (n instanceof bIe) {
        await e.invalidateCredentials?.("tokens");
        return await cYr(e, t);
      }
      throw n;
    }
  }
  async function cYr(e, {
    serverUrl: t,
    authorizationCode: n,
    scope: r,
    resourceMetadataUrl: o,
    fetchFn: s
  }) {
    let i = await e.discoveryState?.();
    let a;
    let l;
    let c;
    let u = o;
    if (!u && i?.resourceMetadataUrl) {
      u = new URL(i.resourceMetadataUrl);
    }
    if (i?.authorizationServerUrl) {
      if (l = i.authorizationServerUrl, a = i.resourceMetadata, c = i.authorizationServerMetadata ?? (await S4e(l, {
        fetchFn: s
      })), !a) {
        try {
          a = await DIn(t, {
            resourceMetadataUrl: u
          }, s);
        } catch {}
      }
      if (c !== i.authorizationServerMetadata || a !== i.resourceMetadata) {
        await e.saveDiscoveryState?.({
          authorizationServerUrl: String(l),
          resourceMetadataUrl: u?.toString(),
          resourceMetadata: a,
          authorizationServerMetadata: c
        });
      }
    } else {
      let b = await pYr(t, {
        resourceMetadataUrl: u,
        fetchFn: s
      });
      l = b.authorizationServerUrl;
      c = b.authorizationServerMetadata;
      a = b.resourceMetadata;
      await e.saveDiscoveryState?.({
        authorizationServerUrl: String(l),
        resourceMetadataUrl: u?.toString(),
        resourceMetadata: a,
        authorizationServerMetadata: c
      });
    }
    let d = await V$d(t, e, a);
    let p = r || a?.scopes_supported?.join(" ") || e.clientMetadata.scope;
    let m = await Promise.resolve(e.clientInformation());
    if (!m) {
      if (n !== undefined) {
        throw Error("Existing OAuth client information is required when exchanging an authorization code");
      }
      let b = c?.client_id_metadata_document_supported === true;
      let S = e.clientMetadataUrl;
      if (S && !G$d(S)) {
        throw new uat(`clientMetadataUrl must be a valid HTTPS URL with a non-root pathname, got: ${S}`);
      }
      if (b && S) {
        m = {
          client_id: S
        };
        await e.saveClientInformation?.(m);
      } else {
        if (!e.saveClientInformation) {
          throw Error("OAuth client information must be saveable for dynamic registration");
        }
        let C = await Q$d(l, {
          metadata: c,
          clientMetadata: e.clientMetadata,
          scope: p,
          fetchFn: s
        });
        await e.saveClientInformation(C);
        m = C;
      }
    }
    let f = !e.redirectUrl;
    if (n !== undefined || f) {
      let b = await X$d(e, l, {
        metadata: c,
        resource: d,
        authorizationCode: n,
        fetchFn: s
      });
      await e.saveTokens(b);
      return "AUTHORIZED";
    }
    let h = await e.tokens();
    if (h?.refresh_token) {
      try {
        let b = await hYr(l, {
          metadata: c,
          clientInformation: m,
          refreshToken: h.refresh_token,
          resource: d,
          addClientAuthentication: e.addClientAuthentication,
          fetchFn: s
        });
        await e.saveTokens(b);
        return "AUTHORIZED";
      } catch (b) {
        if (!(b instanceof cw) || b instanceof Ace) {
          ;
        } else {
          throw b;
        }
      }
    }
    let g = e.state ? await e.state() : undefined;
    let {
      authorizationUrl: y,
      codeVerifier: _
    } = await mYr(l, {
      metadata: c,
      clientInformation: m,
      state: g,
      redirectUrl: e.redirectUrl,
      scope: p,
      resource: d
    });
    await e.saveCodeVerifier(_);
    await e.redirectToAuthorization(y);
    return "REDIRECT";
  }
  function G$d(e) {
    if (!e) {
      return false;
    }
    try {
      let t = new URL(e);
      return t.protocol === "https:" && t.pathname !== "/";
    } catch {
      return false;
    }
  }
  async function V$d(e, t, n) {
    let r = VOi(e);
    if (t.validateResourceURL) {
      return await t.validateResourceURL(r, n?.resource);
    }
    if (!n) {
      return;
    }
    if (!zOi({
      requestedResource: r,
      configuredResource: n.resource
    })) {
      throw Error(`Protected resource ${n.resource} does not match expected ${r} (or origin)`);
    }
    return new URL(n.resource);
  }
  function dat(e) {
    let t = e.headers.get("WWW-Authenticate");
    if (!t) {
      return {};
    }
    let [n, r] = t.split(" ");
    if (n.toLowerCase() !== "bearer" || !r) {
      return {};
    }
    let o = uYr(e, "resource_metadata") || undefined;
    let s;
    if (o) {
      try {
        s = new URL(o);
      } catch {}
    }
    let i = uYr(e, "scope") || undefined;
    let a = uYr(e, "error") || undefined;
    return {
      resourceMetadataUrl: s,
      scope: i,
      error: a
    };
  }
  function uYr(e, t) {
    let n = e.headers.get("WWW-Authenticate");
    if (!n) {
      return null;
    }
    let r = new RegExp(`${t}=(?:"([^"]+)"|([^\\s,]+))`);
    let o = n.match(r);
    if (o) {
      return o[1] || o[2];
    }
    return null;
  }
  async function DIn(e, t, n = fetch) {
    let r = await Y$d(e, "oauth-protected-resource", n, {
      protocolVersion: t?.protocolVersion,
      metadataUrl: t?.resourceMetadataUrl
    });
    if (!r || r.status === 404) {
      throw await r?.body?.cancel(), Error("Resource server does not implement OAuth 2.0 Protected Resource Metadata.");
    }
    if (!r.ok) {
      throw await r.body?.cancel(), Error(`HTTP ${r.status} trying to load well-known OAuth protected resource metadata.`);
    }
    return WOi.parse(await r.json());
  }
  async function dYr(e, t, n = fetch) {
    try {
      return await n(e, {
        headers: t
      });
    } catch (r) {
      if (r instanceof TypeError) {
        if (t) {
          return dYr(e, undefined, n);
        } else {
          return;
        }
      }
      throw r;
    }
  }
  function z$d(e, t = "", n = {}) {
    if (t.endsWith("/")) {
      t = t.slice(0, -1);
    }
    return n.prependPathname ? `${t}/.well-known/${e}` : `/.well-known/${e}${t}`;
  }
  async function YOi(e, t, n = fetch) {
    return await dYr(e, {
      "MCP-Protocol-Version": t
    }, n);
  }
  function K$d(e, t) {
    return !e || e.status >= 400 && e.status < 500 && t !== "/";
  }
  async function Y$d(e, t, n, r) {
    let o = new URL(e);
    let s = r?.protocolVersion ?? "2025-11-25";
    let i;
    if (r?.metadataUrl) {
      i = new URL(r.metadataUrl);
    } else {
      let l = z$d(t, o.pathname);
      i = new URL(l, r?.metadataServerUrl ?? o);
      i.search = o.search;
    }
    let a = await YOi(i, s, n);
    if (!r?.metadataUrl && K$d(a, o.pathname)) {
      let l = new URL(`/.well-known/${t}`, o);
      a = await YOi(l, s, n);
    }
    return a;
  }
  function J$d(e) {
    let t = typeof e === "string" ? new URL(e) : e;
    let n = t.pathname !== "/";
    let r = [];
    if (!n) {
      r.push({
        url: new URL("/.well-known/oauth-authorization-server", t.origin),
        type: "oauth"
      });
      r.push({
        url: new URL("/.well-known/openid-configuration", t.origin),
        type: "oidc"
      });
      return r;
    }
    let o = t.pathname;
    if (o.endsWith("/")) {
      o = o.slice(0, -1);
    }
    r.push({
      url: new URL(`/.well-known/oauth-authorization-server${o}`, t.origin),
      type: "oauth"
    });
    r.push({
      url: new URL(`/.well-known/openid-configuration${o}`, t.origin),
      type: "oidc"
    });
    r.push({
      url: new URL(`${o}/.well-known/openid-configuration`, t.origin),
      type: "oidc"
    });
    return r;
  }
  async function S4e(e, {
    fetchFn: t = fetch,
    protocolVersion: n = Yae
  } = {}) {
    let r = {
      "MCP-Protocol-Version": n,
      Accept: "application/json"
    };
    let o = J$d(e);
    for (let {
      url: s,
      type: i
    } of o) {
      let a = await dYr(s, r, t);
      if (!a) {
        continue;
      }
      if (!a.ok) {
        if (await a.body?.cancel(), a.status >= 400 && a.status < 500) {
          continue;
        }
        throw Error(`HTTP ${a.status} trying to load ${i === "oauth" ? "OAuth" : "OpenID provider"} metadata from ${s}`);
      }
      if (i === "oauth") {
        return p2t.parse(await a.json());
      } else {
        return SIn.parse(await a.json());
      }
    }
    return;
  }
  async function pYr(e, t) {
    let n;
    let r;
    try {
      if (n = await DIn(e, {
        resourceMetadataUrl: t?.resourceMetadataUrl
      }, t?.fetchFn), n.authorization_servers && n.authorization_servers.length > 0) {
        r = n.authorization_servers[0];
      }
    } catch {}
    if (!r) {
      r = String(new URL("/", e));
    }
    let o = await S4e(r, {
      fetchFn: t?.fetchFn
    });
    return {
      authorizationServerUrl: r,
      authorizationServerMetadata: o,
      resourceMetadata: n
    };
  }
  async function mYr(e, {
    metadata: t,
    clientInformation: n,
    redirectUrl: r,
    scope: o,
    state: s,
    resource: i
  }) {
    let a;
    if (t) {
      if (a = new URL(t.authorization_endpoint), !t.response_types_supported.includes("code")) {
        throw Error(`Incompatible auth server: does not support response type ${"code"}`);
      }
      if (t.code_challenge_methods_supported && !t.code_challenge_methods_supported.includes("S256")) {
        throw Error(`Incompatible auth server: does not support code challenge method ${"S256"}`);
      }
    } else {
      a = new URL("/authorize", e);
    }
    let l = await sYr();
    let c = l.code_verifier;
    let u = l.code_challenge;
    if (a.searchParams.set("response_type", "code"), a.searchParams.set("client_id", n.client_id), a.searchParams.set("code_challenge", u), a.searchParams.set("code_challenge_method", "S256"), a.searchParams.set("redirect_uri", String(r)), s) {
      a.searchParams.set("state", s);
    }
    if (o) {
      a.searchParams.set("scope", o);
    }
    if (o?.includes("offline_access")) {
      a.searchParams.append("prompt", "consent");
    }
    if (i) {
      a.searchParams.set("resource", i.href);
    }
    return {
      authorizationUrl: a,
      codeVerifier: c
    };
  }
  function XOi(e, t, n) {
    return new URLSearchParams({
      grant_type: "authorization_code",
      code: e,
      code_verifier: t,
      redirect_uri: String(n)
    });
  }
  async function fYr(e, {
    metadata: t,
    tokenRequestParams: n,
    clientInformation: r,
    addClientAuthentication: o,
    resource: s,
    fetchFn: i
  }) {
    let a = t?.token_endpoint ? new URL(t.token_endpoint) : new URL("/token", e);
    let l = new Headers({
      "Content-Type": "application/x-www-form-urlencoded",
      Accept: "application/json"
    });
    if (s) {
      n.set("resource", s.href);
    }
    if (o) {
      await o(l, n, a, t);
    } else if (r) {
      let u = t?.token_endpoint_auth_methods_supported ?? [];
      let d = $$d(r, u);
      H$d(d, r, l, n);
    }
    let c = await (i ?? fetch)(a, {
      method: "POST",
      headers: l,
      body: n
    });
    if (!c.ok) {
      throw await JOi(c);
    }
    return TIn.parse(await c.json());
  }
  async function QOi(e, {
    metadata: t,
    clientInformation: n,
    authorizationCode: r,
    codeVerifier: o,
    redirectUri: s,
    resource: i,
    addClientAuthentication: a,
    fetchFn: l
  }) {
    let c = XOi(r, o, s);
    return fYr(e, {
      metadata: t,
      tokenRequestParams: c,
      clientInformation: n,
      addClientAuthentication: a,
      resource: i,
      fetchFn: l
    });
  }
  async function hYr(e, {
    metadata: t,
    clientInformation: n,
    refreshToken: r,
    resource: o,
    addClientAuthentication: s,
    fetchFn: i
  }) {
    let a = new URLSearchParams({
      grant_type: "refresh_token",
      refresh_token: r
    });
    let l = await fYr(e, {
      metadata: t,
      tokenRequestParams: a,
      clientInformation: n,
      addClientAuthentication: s,
      resource: o,
      fetchFn: i
    });
    return {
      refresh_token: r,
      ...l
    };
  }
  async function X$d(e, t, {
    metadata: n,
    resource: r,
    authorizationCode: o,
    fetchFn: s
  } = {}) {
    let i = e.clientMetadata.scope;
    let a;
    if (e.prepareTokenRequest) {
      a = await e.prepareTokenRequest(i);
    }
    if (!a) {
      if (!o) {
        throw Error("Either provider.prepareTokenRequest() or authorizationCode is required");
      }
      if (!e.redirectUrl) {
        throw Error("redirectUrl is required for authorization_code flow");
      }
      let c = await e.codeVerifier();
      a = XOi(o, c, e.redirectUrl);
    }
    let l = await e.clientInformation();
    return fYr(t, {
      metadata: n,
      tokenRequestParams: a,
      clientInformation: l ?? undefined,
      addClientAuthentication: e.addClientAuthentication,
      resource: r,
      fetchFn: s
    });
  }
  async function Q$d(e, {
    metadata: t,
    clientMetadata: n,
    scope: r,
    fetchFn: o
  }) {
    let s;
    if (t) {
      if (!t.registration_endpoint) {
        throw Error("Incompatible auth server: does not support dynamic client registration");
      }
      s = new URL(t.registration_endpoint);
    } else {
      s = new URL("/register", e);
    }
    let i = await (o ?? fetch)(s, {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify({
        ...n,
        ...(r !== undefined ? {
          scope: r
        } : {})
      })
    });
    if (!i.ok) {
      throw await JOi(i);
    }
    return GOi.parse(await i.json());
  }
  var oO;
  var SIe = __lazy(() => {
    jOi();
    m2t();
    m2t();
    iYr();
    oO = class oO extends Error {
      constructor(e) {
        super(e ?? "Unauthorized");
      }
    };
  });
  function Z$d(e) {
    let t;
    try {
      t = new URL(e);
    } catch (n) {
      throw Error(`Invalid URL format: ${e}`);
    }
    if (t.protocol !== "http:" && t.protocol !== "https:") {
      throw Error(`Invalid URL protocol: must use http:// or https://, got ${t.protocol}`);
    }
  }
  async function NIn(e) {
    try {
      let n = "xdg-open";
      let {
        code: r
      } = await execFileNoThrow(n, [e]);
      return r === 0;
    } catch (t) {
      return false;
    }
  }
  async function eHd(e) {
    try {
      let {
        code: n
      } = await execFileNoThrow("dbus-send", ["--session", "--print-reply", "--dest=org.freedesktop.FileManager1", "--type=method_call", "/org/freedesktop/FileManager1", "org.freedesktop.FileManager1.ShowItems", `array:string:${MIn.pathToFileURL(e).href.replaceAll(",", "%2C")}`, "string:"]);
      return n === 0;
    } catch (t) {
      return false;
    }
  }
  async function LIn(e) {
    let t;
    try {
      t = new URL(e);
    } catch {
      return false;
    }
    let n = t.protocol;
    if (n === "file:") {
      if (t.host !== "") {
        return false;
      }
      try {
        return await eHd(MIn.fileURLToPath(e));
      } catch {
        return false;
      }
    }
    if (!gYr.vZc(n)) {
      logForDebugging(`[hyperlink] refusing to dispatch clicked link with non-allowlisted scheme ${n}`, {
        level: "warn"
      });
      return false;
    }
    return (await tDi(e)).ok;
  }
  function ZOi() {
    if (!process.stdout.isTTY) {
      return true;
    }
    if (Me.BROWSER && Me.BROWSER !== "true") {
      return false;
    }
    if (Me.SSH_CONNECTION) {
      return true;
    }
    return eDi();
  }
  function eDi() {
    return Wt() === "linux" && !Me.DISPLAY && !Me.WAYLAND_DISPLAY;
  }
  async function yYr(e) {
    try {
      Z$d(e);
    } catch (t) {
      return {
        ok: false,
        reason: "invalid_url",
        detail: t instanceof Error ? t.message : String(t)
      };
    }
    return tDi(e);
  }
  async function Ac(e) {
    return (await yYr(e)).ok;
  }
  async function tDi(e) {
    try {
      let t = getAttacherCaps()?.browser;
      let n = t !== undefined ? t ?? undefined : process.env.BROWSER;
      let r = "linux";
      if (!n && eDi()) {
        return {
          ok: false,
          reason: "no_display"
        };
      }
      return tHd(await execFileNoThrow(n || "xdg-open", [e]));
    } catch (t) {
      return {
        ok: false,
        reason: "unknown",
        detail: t instanceof Error ? t.message : String(t)
      };
    }
  }
  function tHd(e) {
    if (e.code === 0) {
      return {
        ok: true
      };
    }
    let t = e.error ?? "";
    let n = e.stderr || t || `exit ${e.code}`;
    if (e.code === 127 || t.includes("ENOENT")) {
      return {
        ok: false,
        reason: "opener_missing",
        detail: n
      };
    }
    if (t.includes("ETIMEDOUT") || t.includes("timed out")) {
      return {
        ok: false,
        reason: "timeout",
        detail: n
      };
    }
    if (t.includes("EACCES") || t.includes("EPERM")) {
      return {
        ok: false,
        reason: "spawn_error",
        detail: n
      };
    }
    if (e.code > 0) {
      return {
        ok: false,
        reason: "nonzero_exit",
        detail: n
      };
    }
    return {
      ok: false,
      reason: "unknown",
      detail: n
    };
  }
  var MIn;
  var gYr;
  var ky = __lazy(() => {
    at();
    je();
    d_();
    ji();
    Cs();
    MIn = require("url");
    gYr = new Set(["https:", "http:", "vscode:", "vscode-insiders:", "cursor:", "windsurf:", "zed:", "jetbrains:", "idea:", "slack:", "linear:", "notion:", "figma:"]);
  });
  function _Yr(e) {
    return e.replace(/[&<>"']/g, t => nHd[t] ?? t);
  }
  function Ice(e) {
    let {
      ok: t,
      heading: n,
      message: r,
      detail: o
    } = e;
    let s = t ? '<span class="status">Connected</span>' : '<span class="status err">Error</span>';
    let i = o ? `<div class="detail">${_Yr(o)}</div>` : "";
    let a = t ? "<script>setTimeout(function(){try{window.close()}catch(e){}},1500)</script>" : "";
    return `<!DOCTYPE html><html lang="en"><head><meta charset="utf-8"><meta name="viewport" content="width=device-width,initial-scale=1"><title>Claude Code</title><style>${rHd}</style></head><body><main>${s}<h1>${_Yr(n)}</h1><p class="sub">${_Yr(r)}</p>${i}</main>${a}</body></html>`;
  }
  var nHd;
  var rHd = `*,*::before,*::after{box-sizing:border-box}
html,body{margin:0;padding:0}
body{min-height:100vh;background:#FAF9F5;color:#141413;font:15px/1.5 ui-sans-serif,-apple-system,BlinkMacSystemFont,"Segoe UI",Helvetica,Arial,sans-serif;-webkit-font-smoothing:antialiased;display:flex;align-items:center;justify-content:center;padding:48px 24px}
main{width:100%;max-width:560px}
.status{display:inline-flex;align-items:center;gap:8px;padding:4px 10px 4px 8px;border-radius:999px;background:rgba(85,138,66,.10);color:#345C28;font-size:12.5px;font-weight:500;letter-spacing:-.005em;margin-bottom:20px}
.status::before{content:"";width:6px;height:6px;border-radius:50%;background:#558A42;box-shadow:0 0 0 3px rgba(85,138,66,.18)}
.status.err{background:rgba(166,50,68,.08);color:#671D28}
.status.err::before{background:#A63244;box-shadow:0 0 0 3px rgba(166,50,68,.15)}
h1{font-family:ui-serif,Charter,"Iowan Old Style",Georgia,serif;font-weight:400;font-size:32px;line-height:1.15;letter-spacing:-.02em;margin:0 0 10px;text-wrap:balance}
.sub{margin:0;color:#4D4C48;font-size:15px;line-height:1.55;max-width:52ch}
.detail{margin-top:20px;background:#FFF;border:.5px solid rgba(31,30,29,.15);border-left:3px solid #A63244;border-radius:10px;padding:14px 16px;font-size:14px;line-height:1.5;color:#3D3D3A;word-break:break-word}
@media (max-width:520px){h1{font-size:26px}body{padding:32px 18px}}`;
  var bYr = __lazy(() => {
    nHd = {
      "&": "&amp;",
      "<": "&lt;",
      ">": "&gt;",
      '"': "&quot;",
      "'": "&#39;"
    };
  });
  function f2t(e = 3118) {
    return `http://localhost:${e}/callback`;
  }
  function sHd() {
    let e = parseInt(process.env.MCP_OAUTH_CALLBACK_PORT || "", 10);
    return e > 0 ? e : undefined;
  }
  async function FIn(e) {
    let t = sHd();
    if (t) {
      return t;
    }
    if (e && (await SYr(e))) {
      return e;
    }
    let {
      min: n,
      max: r
    } = oHd;
    let o = r - n + 1;
    let s = Math.min(o, 100);
    for (let i = 0; i < s; i++) {
      let a = n + Math.floor(Math.random() * o);
      if (await SYr(a)) {
        return a;
      }
    }
    if (await SYr(3118)) {
      return 3118;
    }
    throw Error("No available ports for OAuth redirect");
  }
  async function SYr(e) {
    try {
      await new Promise((t, n) => {
        let r = nDi.createServer();
        r.once("error", n);
        r.listen(e, "127.0.0.1", () => {
          r.close(() => t());
        });
      });
      return true;
    } catch {
      return false;
    }
  }
  var nDi;
  var oHd;
  var EYr = __lazy(() => {
    Cs();
    nDi = require("http");
    oHd = Wt() === "windows" ? {
      min: 39152,
      max: 49151
    } : {
      min: 49152,
      max: 65535
    };
  });
  function mJ() {
    return st(process.env.CLAUDE_CODE_ENABLE_XAA);
  }
  function Pce() {
    return getInitialSettings().xaaIdp;
  }
  function ybe(e) {
    try {
      let t = new URL(e);
      t.pathname = t.pathname.replace(/\/+$/, "");
      t.host = t.host.toLowerCase();
      return t.toString();
    } catch {
      return e.replace(/\/+$/, "");
    }
  }
  async function T4e(e) {
    let r = (await yl().readAsync())?.mcpXaaIdp?.[ybe(e)];
    if (!r) {
      return;
    }
    if (r.expiresAt - Date.now() <= 60 * 1000) {
      return;
    }
    return r.idToken;
  }
  async function aDi(e, t, n) {
    await yl().mutate(r => ({
      ...r,
      mcpXaaIdp: {
        ...r.mcpXaaIdp,
        [ybe(e)]: {
          idToken: t,
          expiresAt: n
        }
      }
    }));
  }
  async function lDi(e, t) {
    let n = uDi(t);
    let r = n ? n * 1000 : Date.now() + 3600000;
    await aDi(e, t, r);
    return r;
  }
  async function TIe(e) {
    let t = ybe(e);
    try {
      await yl().mutate(n => {
        if (!n.mcpXaaIdp?.[t]) {
          return n;
        }
        let r = {
          ...n.mcpXaaIdp
        };
        delete r[t];
        return {
          ...n,
          mcpXaaIdp: r
        };
      });
    } catch (n) {
      dn("xaa", `clearIdpIdToken(${t}) failed: ${he(n)}`);
    }
  }
  async function cDi(e, t) {
    try {
      return await yl().mutate(n => ({
        ...n,
        mcpXaaIdpConfig: {
          ...n.mcpXaaIdpConfig,
          [ybe(e)]: {
            clientSecret: t
          }
        }
      }));
    } catch (n) {
      return {
        success: false,
        warning: he(n)
      };
    }
  }
  async function pat(e) {
    return (await yl().readAsync())?.mcpXaaIdpConfig?.[ybe(e)]?.clientSecret;
  }
  async function UIn(e) {
    let t = ybe(e);
    try {
      await yl().mutate(n => {
        if (!n.mcpXaaIdpConfig?.[t]) {
          return n;
        }
        let r = {
          ...n.mcpXaaIdpConfig
        };
        delete r[t];
        return {
          ...n,
          mcpXaaIdpConfig: r
        };
      });
    } catch (n) {
      dn("xaa", `clearIdpClientSecret(${t}) failed: ${he(n)}`);
    }
  }
  async function BIn(e) {
    let t = e.endsWith("/") ? e : e + "/";
    let n = new URL(".well-known/openid-configuration", t);
    let r = await fetch(n, {
      ...getProxyFetchOptions({
        url: String(n)
      }),
      headers: {
        Accept: "application/json"
      },
      signal: AbortSignal.timeout(30000)
    });
    if (!r.ok) {
      throw Error(`XAA IdP: OIDC discovery failed: HTTP ${r.status} at ${n}`);
    }
    let o;
    try {
      o = await r.json();
    } catch {
      throw Error(`XAA IdP: OIDC discovery returned non-JSON at ${n} (captive portal or proxy?)`);
    }
    let s = SIn.safeParse(o);
    if (!s.success) {
      throw Error(`XAA IdP: invalid OIDC metadata: ${s.error.message}`);
    }
    if (new URL(s.data.token_endpoint).protocol !== "https:") {
      throw Error(`XAA IdP: refusing non-HTTPS token endpoint: ${s.data.token_endpoint}`);
    }
    return s.data;
  }
  function uDi(e) {
    let t = e.split(".");
    if (t.length !== 3) {
      return;
    }
    try {
      let n = qt(Buffer.from(t[1], "base64url").toString("utf-8"));
      return typeof n.exp === "number" ? n.exp : undefined;
    } catch {
      return;
    }
  }
  function lHd(e, t, n, r) {
    let o = null;
    let s = null;
    let i = null;
    let a = () => {
      if (o?.removeAllListeners(), o?.on("error", () => {}), o?.close(), o = null, s) {
        clearTimeout(s);
        s = null;
      }
      if (n && i) {
        n.removeEventListener("abort", i);
        i = null;
      }
    };
    return new Promise((l, c) => {
      let u = false;
      let d = m => {
        if (u) {
          return;
        }
        u = true;
        a();
        l(m);
      };
      let p = m => {
        if (u) {
          return;
        }
        u = true;
        a();
        c(m);
      };
      if (n) {
        if (i = () => p(Error("XAA IdP: login cancelled")), n.aborted) {
          i();
          return;
        }
        n.addEventListener("abort", i, {
          once: true
        });
      }
      o = oDi.createServer((m, f) => {
        let h = sDi.parse(m.url || "", true);
        if (h.pathname !== "/callback") {
          f.writeHead(404);
          f.end();
          return;
        }
        let g = h.query.code;
        let y = h.query.state;
        let _ = h.query.error;
        if (_) {
          let b = h.query.error_description;
          f.writeHead(400, {
            "Content-Type": "text/html"
          });
          f.end(Ice({
            ok: false,
            heading: "Sign-in failed",
            message: "Close this tab and try again from Claude Code.",
            detail: `${_}: ${b ?? ""}`
          }));
          p(Error(`XAA IdP: ${_}${b ? ` \u2014 ${b}` : ""}`));
          return;
        }
        if (y !== t) {
          f.writeHead(400, {
            "Content-Type": "text/html"
          });
          f.end(Ice({
            ok: false,
            heading: "Sign-in failed",
            message: "State mismatch. Close this tab and try again."
          }));
          p(Error("XAA IdP: state mismatch (possible CSRF)"));
          return;
        }
        if (!g) {
          f.writeHead(400, {
            "Content-Type": "text/html"
          });
          f.end(Ice({
            ok: false,
            heading: "Sign-in failed",
            message: "No authorization code received. Close this tab and try again."
          }));
          p(Error("XAA IdP: callback missing code"));
          return;
        }
        f.writeHead(200, {
          "Content-Type": "text/html"
        });
        f.end(Ice({
          ok: true,
          heading: "Sign-in complete",
          message: "You can close this tab and return to Claude Code."
        }));
        d(g);
      });
      o.on("error", m => {
        if (m.code === "EADDRINUSE") {
          let f = Wt() === "windows" ? `netstat -ano | findstr :${e}` : `lsof -ti:${e} -sTCP:LISTEN`;
          p(Error(`XAA IdP: callback port ${e} is already in use. Run \`${f}\` to find the holder.`));
        } else {
          p(Error(`XAA IdP: callback server failed: ${m.message}`));
        }
      });
      o.listen(e, "127.0.0.1", () => {
        try {
          r();
        } catch (m) {
          p(sr(m));
        }
      });
      o.unref();
      s = setTimeout(m => m(Error("XAA IdP: login timed out")), 300000, p);
      s.unref();
    });
  }
  async function $In(e) {
    return vl("mcp_xaa_idp_login", async () => {
      let {
        idpIssuer: t,
        idpClientId: n
      } = e;
      let r = await T4e(t);
      if (r) {
        dn("xaa", `Using cached id_token for ${t}`);
        return r;
      }
      dn("xaa", `No cached id_token for ${t}; starting OIDC login`);
      let o = await BIn(t);
      let s = e.callbackPort ?? (await FIn());
      let i = f2t(s);
      let a = rDi.randomBytes(32).toString("base64url");
      let l = {
        client_id: n,
        ...(e.idpClientSecret && {
          client_secret: e.idpClientSecret
        })
      };
      let {
        authorizationUrl: c,
        codeVerifier: u
      } = await mYr(t, {
        metadata: o,
        clientInformation: l,
        redirectUrl: i,
        scope: "openid",
        state: a
      });
      let d = await lHd(s, a, e.abortSignal, () => {
        if (e.onAuthorizationUrl(c.toString()), !e.skipBrowserOpen) {
          dn("xaa", "Opening browser to IdP authorization endpoint");
          Ac(c.toString());
        }
      });
      let p = await QOi(t, {
        metadata: o,
        clientInformation: l,
        authorizationCode: d,
        codeVerifier: u,
        redirectUri: i,
        fetchFn: (h, g) => fetch(h, {
          ...g,
          ...getProxyFetchOptions({
            url: String(h)
          }),
          signal: AbortSignal.timeout(30000)
        })
      });
      if (!p.id_token) {
        throw Error("XAA IdP: token response missing id_token (check scope=openid)");
      }
      let m = uDi(p.id_token);
      let f = m ? m * 1000 : Date.now() + (p.expires_in ?? 3600) * 1000;
      try {
        await aDi(t, p.id_token, f);
        dn("xaa", `Cached id_token for ${t} (expires ${new Date(f).toISOString()})`);
      } catch (h) {
        dn("xaa", `id_token cache write failed: ${he(h)}`);
      }
      return p.id_token;
    });
  }
  var rDi;
  var oDi;
  var sDi;
  var E4e = __lazy(() => {
    SIe();
    m2t();
    ky();
    gn();
    dt();
    Rn();
    Cs();
    Fh();
    DW();
    ln();
    bYr();
    EYr();
    rDi = require("crypto");
    oDi = require("http");
    sDi = require("url");
  });
  async function HIn() {
    return (await yl().readAsync())?.mcpOAuth;
  }
  function MC(e, t) {
    let n = De({
      type: t.type,
      url: t.url,
      headers: t.headers || {}
    });
    let r = dDi.createHash("sha256").update(n).digest("hex").substring(0, 16);
    return `${e}|${r}`;
  }
  function v4e(e) {
    return Object.keys(e.headers ?? {}).some(t => t.toLowerCase() === "authorization");
  }
  function M8(e) {
    try {
      let t = new URL(e);
      return t.protocol === "https:" && isFirstPartyAnthropicHost(t.href) && cHd.some(n => t.pathname.startsWith(n));
    } catch {
      return false;
    }
  }
  function jIn(e) {
    if (mJ() && e.oauth?.xaa) {
      return true;
    }
    if (e.headersHelper || e.headers && Object.keys(e.headers).length > 0) {
      return true;
    }
    if (M8(e.url)) {
      return true;
    }
    return false;
  }
  function qIn(e, t) {
    return v4e(e) || M8(e.url) && isFirstPartyProvider() && t;
  }
  function WIn(e, t, n) {
    if (jIn(t)) {
      return false;
    }
    let r = n?.[MC(e, t)];
    return r !== undefined && !r.accessToken && !r.refreshToken && r.discoveryState?.oauthMetadataFound === true;
  }
  function pDi(e, t, n) {
    if (jIn(t)) {
      return false;
    }
    let r = n?.[MC(e, t)];
    return r !== undefined && !!r.accessToken && !r.refreshToken && r.expiresAt !== undefined && r.expiresAt < Date.now();
  }
  var dDi;
  var cHd;
  var Oce = __lazy(() => {
    Ds();
    DW();
    E4e();
    dDi = require("crypto");
    cHd = ["/v1/design/"];
  });
  function dHd() {
    return "https://api.anthropic.com/v1/design/mcp";
  }
  function fDi(e) {
    return e.type === "http" && pHd.vZc(e.url);
  }
  function hDi(e) {
    let t = vYr;
    vYr = e;
    return t;
  }
  function wYr() {
    let e = Me.CLAUDE_CODE_ENABLE_DESIGN_MCP;
    if (e !== undefined) {
      return e;
    }
    return vYr?.("tengu_omelette_whisk", false) ?? false;
  }
  function GIn() {
    if (!isFirstPartyProvider()) {
      return {};
    }
    let e = {};
    if (wYr()) {
      e["claude_design"] = {
        type: "http",
        url: dHd(),
        scope: "dynamic"
      };
    }
    for (let t of Object.values(e)) {
      if ("url" in t && !M8(t.url)) {
        throw Error("A built-in first-party MCP server URL is not on the first-party allowlist (FIRST_PARTY_MCP_PATH_PREFIXES / isFirstPartyAnthropicHost) \u2014 login-OAT auto-attach and bare-name rendering would not fire. Update firstPartyBuiltins.ts or authState.ts so they agree.");
      }
    }
    return e;
  }
  var pHd;
  var vYr = null;
  var fat = __lazy(() => {
    pr();
    Ds();
    Oce();
    pHd = new Set(["https://api.anthropic.com/v1/design/mcp", "https://api-staging.anthropic.com/v1/design/mcp"]);
  });