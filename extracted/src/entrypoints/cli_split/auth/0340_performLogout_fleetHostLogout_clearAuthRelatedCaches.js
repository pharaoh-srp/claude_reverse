  __export(A0o, {
    performLogout: () => performLogout,
    fleetHostLogout: () => fleetHostLogout,
    clearAuthRelatedCaches: () => clearAuthRelatedCaches,
    call: () => call_export
  });
  async function performLogout({
    clearOnboarding: e = false,
    preserveInProcessTokens: t = false,
    preserveNonAnthropicAuth: n = false
  }) {
    let {
      flushTelemetry: r
    } = await Promise.resolve().then(() => (k0o(), x0o));
    if (await r(), li()) {
      await clearAuthRelatedCaches();
      return;
    }
    if (!t && getAPIProvider() === "firstParty") {
      let s = yl();
      s.invalidateCache?.();
      let i = await s.readAsync();
      let a = i?.claudeAiOauth;
      if (a?.refreshToken) {
        await revokeOAuthToken(a.refreshToken, a.clientId);
      }
      let l = i?.designOauth;
      if (l?.refreshToken) {
        await revokeOAuthToken(l.refreshToken, l.clientId);
      }
    }
    if (!t) {
      delete process.env.CLAUDE_CODE_OAUTH_TOKEN;
      setOauthTokenFromFd(null);
    }
    await removeApiKey();
    let o = yl();
    if (n) {
      if (getAPIProvider() === "firstParty") {
        o.invalidateCache?.();
        let s = (await o.readAsync())?.designOauth;
        if (s?.refreshToken) {
          await revokeOAuthToken(s.refreshToken, s.clientId);
        }
      }
      await o.mutate(s => {
        let i = {
          ...s
        };
        delete i.claudeAiOauth;
        delete i.organizationUuid;
        delete i.trustedDeviceToken;
        delete i.enterpriseGateway;
        delete i.designOauth;
        return i;
      }).catch(s => {
        Oe(s);
      });
    } else {
      await o.delete();
    }
    setGatewayAuth(null);
    await clearAuthRelatedCaches();
    saveGlobalConfig(s => {
      let i = {
        ...s
      };
      if (e) {
        if (i.hasCompletedOnboarding = false, i.subscriptionNoticeCount = 0, i.hasAvailableSubscription = false, i.customApiKeyResponses?.approved) {
          i.customApiKeyResponses = {
            ...i.customApiKeyResponses,
            approved: []
          };
        }
        let a = "subscription-switch";
        if (i.seenNotifications?.[a] !== undefined) {
          let {
            [a]: l,
            ...c
          } = i.seenNotifications;
          i.seenNotifications = c;
        }
      }
      i.oauthAccount = undefined;
      i.additionalModelOptionsCache = undefined;
      i.additionalModelCostsCache = undefined;
      i.modelAccessCache = undefined;
      i.orgModelDefaultCache = undefined;
      i.lastSeenOrgDefaultUpdatedAt = undefined;
      i.clientDataCache = undefined;
      i.clientDataCacheSlots = undefined;
      i.autoCompactWindowsCache = undefined;
      return i;
    });
    setResolvedOrgDefault(undefined);
    Pe("oauth_logout");
  }
  async function clearAuthRelatedCaches() {
    getClaudeAIOAuthTokens.cache?.clear?.();
    getClaudeAIOAuthTokensAsync.cache?.clear?.();
    clearTrustedDeviceTokenCache();
    I8();
    Une();
    _Ie();
    iE.cache.clear?.();
    refreshGrowthBookAfterAuthChange();
    HNe.cache?.clear?.();
    Yoe.cache?.clear?.();
    await kza();
    await clearPolicyLimitsCache();
  }
  async function call_export(e) {
    let t = li();
    if (!t) {
      xGe({
        action: "logout",
        success: true,
        authMethod: "oauth"
      });
    }
    if (await performLogout({
      clearOnboarding: true
    }), t) {
      e("This background session shares credentials with other sessions; /logout here has no effect. Run /logout from your main terminal to sign out.", {
        display: "system"
      });
      return null;
    }
    let n = cll.jsx(Text, {
      children: "Successfully logged out from your Anthropic account."
    });
    setTimeout(() => {
      gracefulShutdownSync(0, "logout");
    }, 200);
    return n;
  }
  async function fleetHostLogout({
    exit: e,
    setError: t,
    setInfo: n
  }) {
    n("Signing out\u2026");
    xGe({
      action: "logout",
      success: true,
      authMethod: "oauth"
    });
    try {
      await performLogout({
        clearOnboarding: true
      });
      e();
    } catch (r) {
      Oe(r);
      t(`Couldn't sign out \u2014 ${r instanceof Error ? r.message : String(r)}`);
    }
  }
  var cll;
  var eYn = __lazy(() => {
    at();
    CQ();
    A5n();
    LG();
    et();
    ln();
    $n();
    Rgt();
    qP();
    q$();
    z8e();
    no();
    DC();
    yd();
    lm();
    Rn();
    Ds();
    DW();
    yS();
    Xit();
    Bne();
    cll = __toESM(ie(), 1);
  });
  var O0o = {};