  __export(MUt, {
    validateAuthorizationResponse: () => validateAuthorizationResponse,
    getStandardAuthorizeRequestParameters: () => getStandardAuthorizeRequestParameters,
    getAuthorizeUrl: () => getAuthorizeUrl,
    getAuthorizationCodePayload: () => getAuthorizationCodePayload
  });
  function getStandardAuthorizeRequestParameters(e, t, n, r) {
    let o = t.correlationId;
    let s = new Map();
    addClientId(s, t.embeddedClientId || t.extraQueryParameters?.[CLIENT_ID] || e.clientId);
    let i = [...(t.scopes || []), ...(t.extraScopesToConsent || [])];
    if (addScopes(s, i, true, e.authority.options.OIDCOptions?.defaultScopes), addRedirectUri(s, t.redirectUri), addCorrelationId(s, o), addResponseMode(s, t.responseMode), addClientInfo(s), t.prompt) {
      addPrompt(s, t.prompt);
      r?.addFields({
        prompt: t.prompt
      }, o);
    }
    if (t.domainHint) {
      addDomainHint(s, t.domainHint);
      r?.addFields({
        domainHintFromRequest: true
      }, o);
    }
    if (t.prompt !== PromptValue.SELECT_ACCOUNT) {
      if (t.sid && t.prompt === PromptValue.NONE) {
        n.verbose("createAuthCodeUrlQueryString: Prompt is none, adding sid from request");
        addSid(s, t.sid);
        r?.addFields({
          sidFromRequest: true
        }, o);
      } else if (t.account) {
        let a = n0d(t.account);
        let l = r0d(t.account);
        if (l && t.domainHint) {
          n.warning('AuthorizationCodeClient.createAuthCodeUrlQueryString: "domainHint" param is set, skipping opaque "login_hint" claim. Please consider not passing domainHint');
          l = null;
        }
        if (l) {
          n.verbose("createAuthCodeUrlQueryString: login_hint claim present on account");
          addLoginHint(s, l);
          r?.addFields({
            loginHintFromClaim: true
          }, o);
          try {
            let c = mce(t.account.homeAccountId);
            addCcsOid(s, c);
          } catch (c) {
            n.verbose("createAuthCodeUrlQueryString: Could not parse home account ID for CCS Header");
          }
        } else if (a && t.prompt === PromptValue.NONE) {
          n.verbose("createAuthCodeUrlQueryString: Prompt is none, adding sid from account");
          addSid(s, a);
          r?.addFields({
            sidFromClaim: true
          }, o);
          try {
            let c = mce(t.account.homeAccountId);
            addCcsOid(s, c);
          } catch (c) {
            n.verbose("createAuthCodeUrlQueryString: Could not parse home account ID for CCS Header");
          }
        } else if (t.loginHint) {
          n.verbose("createAuthCodeUrlQueryString: Adding login_hint from request");
          addLoginHint(s, t.loginHint);
          addCcsUpn(s, t.loginHint);
          r?.addFields({
            loginHintFromRequest: true
          }, o);
        } else if (t.account.username) {
          n.verbose("createAuthCodeUrlQueryString: Adding login_hint from account");
          addLoginHint(s, t.account.username);
          r?.addFields({
            loginHintFromUpn: true
          }, o);
          try {
            let c = mce(t.account.homeAccountId);
            addCcsOid(s, c);
          } catch (c) {
            n.verbose("createAuthCodeUrlQueryString: Could not parse home account ID for CCS Header");
          }
        }
      } else if (t.loginHint) {
        n.verbose("createAuthCodeUrlQueryString: No account, adding login_hint from request");
        addLoginHint(s, t.loginHint);
        addCcsUpn(s, t.loginHint);
        r?.addFields({
          loginHintFromRequest: true
        }, o);
      }
    } else {
      n.verbose("createAuthCodeUrlQueryString: Prompt is select_account, ignoring account hints");
    }
    if (t.nonce) {
      addNonce(s, t.nonce);
    }
    if (t.state) {
      addState(s, t.state);
    }
    if (t.claims || e.clientCapabilities && e.clientCapabilities.length > 0) {
      addClaims(s, t.claims, e.clientCapabilities);
    }
    if (t.embeddedClientId) {
      addBrokerParameters(s, e.clientId, e.redirectUri);
    }
    if (e.instanceAware && (!t.extraQueryParameters || !Object.keys(t.extraQueryParameters).includes("instance_aware"))) {
      addInstanceAware(s);
    }
    return s;
  }
  function getAuthorizeUrl(e, t, n, r) {
    let o = mapToQueryString(t, n, r);
    return bm.appendQueryString(e.authorizationEndpoint, o);
  }
  function getAuthorizationCodePayload(e, t) {
    if (validateAuthorizationResponse(e, t), !e.code) {
      throw rs("authorization_code_missing_from_server_response");
    }
    return e;
  }
  function validateAuthorizationResponse(e, t) {
    if (!e.state || !t) {
      throw e.state ? rs("state_not_found", "Cached State") : rs("state_not_found", "Server State");
    }
    let n;
    let r;
    try {
      n = decodeURIComponent(e.state);
    } catch (o) {
      throw rs("invalid_state", e.state);
    }
    try {
      r = decodeURIComponent(t);
    } catch (o) {
      throw rs("invalid_state", e.state);
    }
    if (n !== r) {
      throw rs("state_mismatch");
    }
    if (e.error || e.error_description || e.suberror) {
      let o = t0d(e);
      if (Ukn(e.error, e.error_description, e.suberror)) {
        throw new InteractionRequiredAuthError(e.error || "", e.error_description, e.suberror, e.timestamp || "", e.trace_id || "", e.correlation_id || "", e.claims || "", o);
      }
      throw new ServerError(e.error || "", e.error_description, e.suberror, o);
    }
  }
  function t0d(e) {
    let n = e.error_uri?.lastIndexOf("code=");
    return n && n >= 0 ? e.error_uri?.substring(n + 5) : undefined;
  }
  function n0d(e) {
    return e.idTokenClaims?.sid || null;
  }
  function r0d(e) {
    return e.loginHint || e.idTokenClaims?.login_hint || null;
  }
  var Ivi = __lazy(() => {
    ait();
    sit();
    aw();
    tit();
    x3e();
    q0e();
    YP();
    OUt();
    uit();
    RI(); /*! @azure/msal-common v15.13.1 2025-10-29 */
  });
  function o0d(e) {
    let {
      skus: t,
      libraryName: n,
      libraryVersion: r,
      extensionName: o,
      extensionVersion: s
    } = e;
    let i = new Map([[0, [n, r]], [2, [o, s]]]);
    let a = [];
    if (t?.length) {
      if (a = t.split(","), a.length < 4) {
        return t;
      }
    } else {
      a = Array.from({
        length: 4
      }, () => "|");
    }
    i.forEach((l, c) => {
      if (l.length === 2 && l[0]?.length && l[1]?.length) {
        s0d({
          skuArr: a,
          index: c,
          skuName: l[0],
          skuVersion: l[1]
        });
      }
    });
    return a.join(",");
  }
  function s0d(e) {
    let {
      skuArr: t,
      index: n,
      skuName: r,
      skuVersion: o
    } = e;
    if (n >= t.length) {
      return;
    }
    t[n] = [r, o].join("|");
  }
  class K0e {
    constructor(e, t) {
      this.cacheOutcome = cv.NOT_APPLICABLE;
      this.cacheManager = t;
      this.apiId = e.apiId;
      this.correlationId = e.correlationId;
      this.wrapperSKU = e.wrapperSKU || xo.EMPTY_STRING;
      this.wrapperVer = e.wrapperVer || xo.EMPTY_STRING;
      this.telemetryCacheKey = ZD.CACHE_KEY + N_e.CACHE_KEY_SEPARATOR + e.clientId;
    }
    generateCurrentRequestHeaderValue() {
      let e = `${this.apiId}${ZD.VALUE_SEPARATOR}${this.cacheOutcome}`;
      let t = [this.wrapperSKU, this.wrapperVer];
      let n = this.getNativeBrokerErrorCode();
      if (n?.length) {
        t.push(`broker_error=${n}`);
      }
      let r = t.join(ZD.VALUE_SEPARATOR);
      let o = this.getRegionDiscoveryFields();
      let s = [e, o].join(ZD.VALUE_SEPARATOR);
      return [ZD.SCHEMA_VERSION, s, r].join(ZD.CATEGORY_SEPARATOR);
    }
    generateLastRequestHeaderValue() {
      let e = this.getLastRequests();
      let t = K0e.maxErrorsToSend(e);
      let n = e.failedRequests.slice(0, 2 * t).join(ZD.VALUE_SEPARATOR);
      let r = e.errors.slice(0, t).join(ZD.VALUE_SEPARATOR);
      let o = e.errors.length;
      let s = t < o ? ZD.OVERFLOW_TRUE : ZD.OVERFLOW_FALSE;
      let i = [o, s].join(ZD.VALUE_SEPARATOR);
      return [ZD.SCHEMA_VERSION, e.cacheHits, n, r, i].join(ZD.CATEGORY_SEPARATOR);
    }
    cacheFailedRequest(e) {
      let t = this.getLastRequests();
      if (t.errors.length >= ZD.MAX_CACHED_ERRORS) {
        t.failedRequests.shift();
        t.failedRequests.shift();
        t.errors.shift();
      }
      if (t.failedRequests.push(this.apiId, this.correlationId), e instanceof Error && !!e && e.toString()) {
        if (e instanceof AuthError) {
          if (e.subError) {
            t.errors.push(e.subError);
          } else if (e.errorCode) {
            t.errors.push(e.errorCode);
          } else {
            t.errors.push(e.toString());
          }
        } else {
          t.errors.push(e.toString());
        }
      } else {
        t.errors.push(ZD.UNKNOWN_ERROR);
      }
      this.cacheManager.setServerTelemetry(this.telemetryCacheKey, t, this.correlationId);
      return;
    }
    incrementCacheHits() {
      let e = this.getLastRequests();
      e.cacheHits += 1;
      this.cacheManager.setServerTelemetry(this.telemetryCacheKey, e, this.correlationId);
      return e.cacheHits;
    }
    getLastRequests() {
      let e = {
        failedRequests: [],
        errors: [],
        cacheHits: 0
      };
      return this.cacheManager.getServerTelemetry(this.telemetryCacheKey) || e;
    }
    clearTelemetryCache() {
      let e = this.getLastRequests();
      let t = K0e.maxErrorsToSend(e);
      let n = e.errors.length;
      if (t === n) {
        this.cacheManager.removeItem(this.telemetryCacheKey, this.correlationId);
      } else {
        let r = {
          failedRequests: e.failedRequests.slice(t * 2),
          errors: e.errors.slice(t),
          cacheHits: 0
        };
        this.cacheManager.setServerTelemetry(this.telemetryCacheKey, r, this.correlationId);
      }
    }
    static maxErrorsToSend(e) {
      let t;
      let n = 0;
      let r = 0;
      let o = e.errors.length;
      for (t = 0; t < o; t++) {
        let s = e.failedRequests[2 * t] || xo.EMPTY_STRING;
        let i = e.failedRequests[2 * t + 1] || xo.EMPTY_STRING;
        let a = e.errors[t] || xo.EMPTY_STRING;
        if (r += s.toString().length + i.toString().length + a.length + 3, r < ZD.MAX_LAST_HEADER_BYTES) {
          n += 1;
        } else {
          break;
        }
      }
      return n;
    }
    getRegionDiscoveryFields() {
      let e = [];
      e.push(this.regionUsed || xo.EMPTY_STRING);
      e.push(this.regionSource || xo.EMPTY_STRING);
      e.push(this.regionOutcome || xo.EMPTY_STRING);
      return e.join(",");
    }
    updateRegionDiscoveryMetadata(e) {
      this.regionUsed = e.region_used;
      this.regionSource = e.region_source;
      this.regionOutcome = e.region_outcome;
    }
    setCacheOutcome(e) {
      this.cacheOutcome = e;
    }
    setNativeBrokerErrorCode(e) {
      let t = this.getLastRequests();
      t.nativeBrokerErrorCode = e;
      this.cacheManager.setServerTelemetry(this.telemetryCacheKey, t, this.correlationId);
    }
    getNativeBrokerErrorCode() {
      return this.getLastRequests().nativeBrokerErrorCode;
    }
    clearNativeBrokerErrorCode() {
      let e = this.getLastRequests();
      delete e.nativeBrokerErrorCode;
      this.cacheManager.setServerTelemetry(this.telemetryCacheKey, e, this.correlationId);
    }
    static makeExtraSkuString(e) {
      return o0d(e);
    }
  }
  var Dvi = __lazy(() => {
    aw();
    JY(); /*! @azure/msal-common v15.13.1 2025-10-29 */
  });
  var lS = __lazy(() => {
    Rvi();
    xvi();
    kvi();
    AUt();
    pUt();
    Ikn();
    ckn();
    lUt();
    f6r();
    mkn();
    q0e();
    n6r();
    Ivi();
    ait();
    DUt();
    iUt();
    ikn();
    OUt();
    Lkn();
    JY();
    Q5r();
    uit();
    YP();
    RI();
    H0e();
    j_e();
    aw();
    j0e();
    Dvi();
    nit();
    y8r();
    kkn();
    G0e();
    x3e();
    sit();
    E8r();
    jkn(); /*! @azure/msal-common v15.13.1 2025-10-29 */
  });
  class Deserializer {
    static deserializeJSONBlob(e) {
      return !e ? {} : JSON.parse(e);
    }
    static deserializeAccounts(e) {
      let t = {};
      if (e) {
        Object.keys(e).map(function (n) {
          let r = e[n];
          let o = {
            homeAccountId: r.home_account_id,
            environment: r.environment,
            realm: r.realm,
            localAccountId: r.local_account_id,
            username: r.username,
            authorityType: r.authority_type,
            name: r.name,
            clientInfo: r.client_info,
            lastModificationTime: r.last_modification_time,
            lastModificationApp: r.last_modification_app,
            tenantProfiles: r.tenantProfiles?.map(i => JSON.parse(i)),
            lastUpdatedAt: Date.now().toString()
          };
          let s = new JP();
          k3e.toObject(s, o);
          t[n] = s;
        });
      }
      return t;
    }
    static deserializeIdTokens(e) {
      let t = {};
      if (e) {
        Object.keys(e).map(function (n) {
          let r = e[n];
          let o = {
            homeAccountId: r.home_account_id,
            environment: r.environment,
            credentialType: r.credential_type,
            clientId: r.client_id,
            secret: r.secret,
            realm: r.realm,
            lastUpdatedAt: Date.now().toString()
          };
          t[n] = o;
        });
      }
      return t;
    }
    static deserializeAccessTokens(e) {
      let t = {};
      if (e) {
        Object.keys(e).map(function (n) {
          let r = e[n];
          let o = {
            homeAccountId: r.home_account_id,
            environment: r.environment,
            credentialType: r.credential_type,
            clientId: r.client_id,
            secret: r.secret,
            realm: r.realm,
            target: r.target,
            cachedAt: r.cached_at,
            expiresOn: r.expires_on,
            extendedExpiresOn: r.extended_expires_on,
            refreshOn: r.refresh_on,
            keyId: r.key_id,
            tokenType: r.token_type,
            requestedClaims: r.requestedClaims,
            requestedClaimsHash: r.requestedClaimsHash,
            userAssertionHash: r.userAssertionHash,
            lastUpdatedAt: Date.now().toString()
          };
          t[n] = o;
        });
      }
      return t;
    }
    static deserializeRefreshTokens(e) {
      let t = {};
      if (e) {
        Object.keys(e).map(function (n) {
          let r = e[n];
          let o = {
            homeAccountId: r.home_account_id,
            environment: r.environment,
            credentialType: r.credential_type,
            clientId: r.client_id,
            secret: r.secret,
            familyId: r.family_id,
            target: r.target,
            realm: r.realm,
            lastUpdatedAt: Date.now().toString()
          };
          t[n] = o;
        });
      }
      return t;
    }
    static deserializeAppMetadata(e) {
      let t = {};
      if (e) {
        Object.keys(e).map(function (n) {
          let r = e[n];
          t[n] = {
            clientId: r.client_id,
            environment: r.environment,
            familyId: r.family_id
          };
        });
      }
      return t;
    }
    static deserializeAllCache(e) {
      return {
        accounts: e.Account ? this.deserializeAccounts(e.Account) : {},
        idTokens: e.IdToken ? this.deserializeIdTokens(e.IdToken) : {},
        accessTokens: e.AccessToken ? this.deserializeAccessTokens(e.AccessToken) : {},
        refreshTokens: e.RefreshToken ? this.deserializeRefreshTokens(e.RefreshToken) : {},
        appMetadata: e.AppMetadata ? this.deserializeAppMetadata(e.AppMetadata) : {}
      };
    }
  }
  var Gkn = __lazy(() => {
    lS(); /*! @azure/msal-node v3.8.1 2025-10-29 */
  });
  var internals = {};