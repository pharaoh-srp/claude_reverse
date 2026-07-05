  __export(CYn, {
    installOAuthTokens: () => installOAuthTokens,
    authStatus: () => authStatus,
    authLogout: () => authLogout,
    authLogin: () => authLogin
  });
  async function Scl(e) {
    process.stderr.write(e + `
`);
    try {
      await ou("cli_auth_login", "cli_auth_login_org_not_allowed");
      await flushAnalyticsSinks();
    } catch {}
    process.exit(1);
  }
  async function installOAuthTokens(e) {
    await performLogout({
      clearOnboarding: false,
      preserveInProcessTokens: true,
      preserveNonAnthropicAuth: true
    });
    let t = e.profile ?? (await t0e(e.accessToken));
    if (t?.account && t.organization) {
      storeOAuthAccountInfo({
        accountUuid: t.account.uuid,
        emailAddress: t.account.email,
        organizationUuid: t.organization.uuid,
        displayName: t.account.display_name || undefined,
        hasExtraUsageEnabled: t.organization.has_extra_usage_enabled ?? undefined,
        billingType: t.organization.billing_type ?? undefined,
        subscriptionCreatedAt: t.organization.subscription_created_at ?? undefined,
        accountCreatedAt: t.account.created_at,
        ccOnboardingFlags: t.organization.cc_onboarding_flags ?? {},
        claudeCodeTrialEndsAt: t.organization.claude_code_trial_ends_at ?? null,
        claudeCodeTrialDurationDays: t.organization.claude_code_trial_duration_days ?? null,
        seatTier: t.organization.seat_tier ?? null,
        profileFetchedAt: Date.now()
      });
    } else if (e.tokenAccount) {
      storeOAuthAccountInfo({
        accountUuid: e.tokenAccount.uuid,
        emailAddress: e.tokenAccount.emailAddress,
        organizationUuid: e.tokenAccount.organizationUuid
      });
    }
    xGe({
      action: "login",
      success: true,
      authMethod: "oauth"
    });
    let n = await saveOAuthTokensIfNeeded(e);
    if (clearOAuthTokenCache(), process.env.CLAUDE_CODE_OAUTH_TOKEN) {
      if (n.success) {
        delete process.env.CLAUDE_CODE_OAUTH_TOKEN;
      } else {
        process.env.CLAUDE_CODE_OAUTH_TOKEN = e.accessToken;
      }
    }
    if (getOauthTokenFromFd()) {
      setOauthTokenFromFd(n.success ? null : e.accessToken);
    }
    if (n.warning) {
      logEvent("tengu_oauth_storage_warning", {
        warning: n.warning
      });
    }
    if (await fetchAndStoreUserRoles(e.accessToken).catch(r => logForDebugging(String(r), {
      level: "error"
    })), shouldUseClaudeAIAuth(e.scopes)) {
      await pll().catch(r => logForDebugging(String(r), {
        level: "error"
      }));
    } else if (!(await createAndStoreApiKey(e.accessToken))) {
      throw Error("Unable to create API key. The server accepted the request but did not return a key.");
    }
    await clearAuthRelatedCaches();
    await fetchBootstrapData();
  }
  async function authLogin({
    email: e,
    sso: t,
    console: n,
    claudeai: r
  }) {
    if (n && r) {
      process.stderr.write(`Error: --console and --claudeai cannot be used together.
`);
      process.exit(1);
    }
    let o = getInitialSettings();
    let s = getSettingsForSource("policySettings");
    if (isAdminPolicyOrigin(getPolicySettingsOrigin()) && s?.forceLoginMethod === "gateway") {
      process.stderr.write(`forceLoginMethod is 'gateway' in managed settings; run interactive /login to authenticate.
`);
      process.exit(1);
    }
    let i = o.forceLoginMethod === "gateway" ? undefined : o.forceLoginMethod;
    let a = i ? i === "claudeai" : !n;
    let l = o.forceLoginMethod !== undefined && a !== (o.forceLoginMethod === "claudeai");
    let c = typeof o.forceLoginOrgUUID === "string" && !l ? o.forceLoginOrgUUID : undefined;
    let u = process.env.CLAUDE_CODE_OAUTH_REFRESH_TOKEN;
    if (u) {
      let f = process.env.CLAUDE_CODE_OAUTH_SCOPES;
      if (!f) {
        process.stderr.write(`CLAUDE_CODE_OAUTH_SCOPES is required when using CLAUDE_CODE_OAUTH_REFRESH_TOKEN.
Set it to the space-separated scopes the refresh token was issued with
(e.g. "user:inference" or "user:profile user:inference user:sessions:claude_code user:mcp_servers").
`);
        process.exit(1);
      }
      let h = f.split(/\s+/).filter(Boolean);
      try {
        logEvent("tengu_login_from_refresh_token", {});
        let g = await refreshOAuthToken(u, {
          scopes: h,
          expiresIn: 31536000,
          clientId: process.env.CLAUDE_CODE_OAUTH_CLIENT_ID || undefined
        });
        await installOAuthTokens(g);
        let y = await validateForceLoginOrg();
        if (!y.valid) {
          await Scl(y.message);
        }
        saveGlobalConfig(_ => {
          if (_.hasCompletedOnboarding) {
            return _;
          }
          return {
            ..._,
            hasCompletedOnboarding: true
          };
        });
        logEvent("tengu_oauth_success", {
          loginWithClaudeAi: shouldUseClaudeAIAuth(g.scopes)
        });
        Pe("cli_auth_login");
        process.stdout.write(`Login successful.
`);
        process.exit(0);
      } catch (g) {
        if (Ae("cli_auth_login", "cli_auth_login_refresh_token_failed"), M_(g)) {
          logForDebugging(`Login from refresh token failed: ${he(g)}`, {
            level: "error"
          });
        } else {
          Oe(g);
        }
        let y = RDe(g);
        process.stderr.write(`Login failed: ${he(g)}
${y ? y + `
` : ""}`);
        process.exit(1);
      }
    }
    let d = t ? "sso" : undefined;
    let p = new Rz();
    let m = Tcl.createInterface({
      input: process.stdin
    });
    m.on("line", f => {
      let [h, g] = f.trim().split("#");
      if (!h || !g) {
        process.stderr.write(`Invalid code. Please make sure the full code was copied.
`);
        return;
      }
      logEvent("tengu_oauth_manual_entry", {});
      p.handleManualAuthCodeInput({
        authorizationCode: h,
        state: g
      });
    });
    try {
      logEvent("tengu_oauth_flow_start", {
        loginWithClaudeAi: a
      });
      let f = await p.startOAuthFlow(async g => {
        process.stdout.write(`Opening browser to sign in\u2026
`);
        process.stdout.write(`If the browser didn't open, visit: ${TM(g)}
`);
        process.stdout.write("Paste code here if prompted > ");
      }, {
        loginWithClaudeAi: a,
        loginHint: e,
        loginMethod: d,
        orgUUID: c
      });
      await installOAuthTokens(f);
      let h = await validateForceLoginOrg();
      if (!h.valid) {
        await Scl(h.message);
      }
      logEvent("tengu_oauth_success", {
        loginWithClaudeAi: a
      });
      Pe("cli_auth_login");
      process.stdout.write(`Login successful.
`);
      process.exit(0);
    } catch (f) {
      if (Ae("cli_auth_login", "cli_auth_login_oauth_flow_failed"), M_(f)) {
        logForDebugging(`OAuth login failed: ${he(f)}`, {
          level: "error"
        });
      } else {
        Oe(f);
      }
      let h = RDe(f);
      process.stderr.write(`Login failed: ${he(f)}
${h ? h + `
` : ""}`);
      process.exit(1);
    } finally {
      m.close();
      p.cleanup();
    }
  }
  async function authStatus(e, t) {
    let {
      source: n,
      hasToken: r
    } = getAuthTokenSource();
    let {
      source: o
    } = getAnthropicApiKeyWithSourceSafe();
    let s = !!process.env.ANTHROPIC_API_KEY && !cC();
    let i = getOauthAccountInfo();
    let a = getSubscriptionType();
    let l = isUsing3PServices();
    let c = r || o !== "none" || s || l;
    let u = "none";
    if (l) {
      u = "third_party";
    } else if (n === "claude.ai") {
      u = "claude.ai";
    } else if (n === "apiKeyHelper") {
      u = "api_key_helper";
    } else if (n !== "none") {
      u = "oauth_token";
    } else if (o === "ANTHROPIC_API_KEY" || s) {
      u = "api_key";
    } else if (o === "/login managed key") {
      u = "claude.ai";
    }
    let d;
    if (t.text) {
      let p = EYn([[...vYn(), ...wYn()]]).flat();
      let m = [];
      for (let f of p) {
        let h = typeof f.value === "string" ? f.value : Array.isArray(f.value) ? f.value.join(", ") : null;
        if (h === null || h === "none") {
          continue;
        }
        m.push(f.label ? `${f.label}: ${h}` : h);
      }
      if (m.length === 0 && s) {
        m.push("API key: ANTHROPIC_API_KEY");
      }
      if (!c) {
        m.push("Not logged in. Run claude auth login to authenticate.");
      }
      d = G_t.jsx(Text, {
        children: m.join(`
`)
      });
    } else {
      let p = getAPIProvider();
      let m = o !== "none" ? o : s ? "ANTHROPIC_API_KEY" : null;
      let f = {
        loggedIn: c,
        authMethod: u,
        apiProvider: p
      };
      if (m) {
        f.apiKeySource = m;
      }
      if (u === "claude.ai") {
        f.email = i?.emailAddress ?? null;
        f.orgId = i?.organizationUuid ?? null;
        f.orgName = i?.organizationName ?? null;
        f.subscriptionType = a ?? null;
      }
      d = G_t.jsx(Text, {
        children: De(f, null, 2)
      });
    }
    Pe("cli_auth_status");
    e.render(G_t.jsx(Q_, {
      children: d
    }));
    await e.waitUntilExit();
    process.exit(c ? 0 : 1);
  }
  async function authLogout(e) {
    try {
      await performLogout({
        clearOnboarding: false
      });
    } catch (t) {
      Ae("cli_auth_logout", "cli_auth_logout_failed");
      Oe(t);
      process.stderr.write(`Logout failed: ${he(t)}
`);
      process.exit(1);
    }
    Pe("cli_auth_logout");
    e.render(G_t.jsx(Q_, {
      children: G_t.jsx(Text, {
        children: "Successfully logged out from your Anthropic account."
      })
    }));
    await e.waitUntilExit();
  }
  var Tcl;
  var G_t;
  var V_t = __lazy(() => {
    at();
    eYn();
    Uc();
    et();
    ln();
    Gqn();
    Ot();
    x_t();
    vTe();
    mll();
    qP();
    fqe();
    GVe();
    no();
    je();
    gn();
    dt();
    EMe();
    Rn();
    Ds();
    I1e();
    lIo();
    yS();
    Tcl = require("readline");
    G_t = __toESM(ie(), 1);
  });