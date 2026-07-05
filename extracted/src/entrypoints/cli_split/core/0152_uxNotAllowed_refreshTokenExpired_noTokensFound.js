  __export(Pkn, {
    createDiscoveredInstance: () => createDiscoveredInstance
  });
  async function createDiscoveredInstance(e, t, n, r, o, s, i) {
    i?.addQueueMeasurement(io.AuthorityFactoryCreateDiscoveredInstance, s);
    let a = eM.transformCIAMAuthority(Akn(e));
    let l = new eM(a, t, n, r, o, s, i);
    try {
      await yg(l.resolveEndpointsAsync.bind(l), io.AuthorityResolveEndpointsAsync, o, i, s)();
      return l;
    } catch (c) {
      throw rs("endpoints_resolution_error");
    }
  }
  var y8r = __lazy(() => {
    Ikn();
    YP();
    wne();
    z_e();
    RI(); /*! @azure/msal-common v15.13.1 2025-10-29 */
  });
  var ServerError;
  var uit = __lazy(() => {
    JY(); /*! @azure/msal-common v15.13.1 2025-10-29 */
    ServerError = class Wj extends AuthError {
      constructor(e, t, n, r, o) {
        super(e, t, n);
        this.name = "ServerError";
        this.errorNo = r;
        this.status = o;
        Object.setPrototypeOf(this, Wj.prototype);
      }
    };
  });
  function dit(e, t, n) {
    return {
      clientId: e,
      authority: t.authority,
      scopes: t.scopes,
      homeAccountIdentifier: n,
      claims: t.claims,
      authenticationScheme: t.authenticationScheme,
      resourceRequestMethod: t.resourceRequestMethod,
      resourceRequestUri: t.resourceRequestUri,
      shrClaims: t.shrClaims,
      sshKid: t.sshKid,
      embeddedClientId: t.embeddedClientId || t.tokenBodyParameters?.clientId
    };
  }
  var Okn = __lazy(() => {/*! @azure/msal-common v15.13.1 2025-10-29 */});
  class K_e {
    static generateThrottlingStorageKey(e) {
      return `${dce.THROTTLING_PREFIX}.${JSON.stringify(e)}`;
    }
    static preProcess(e, t, n) {
      let r = K_e.generateThrottlingStorageKey(t);
      let o = e.getThrottlingCache(r);
      if (o) {
        if (o.throttleTime < Date.now()) {
          e.removeItem(r, n);
          return;
        }
        throw new ServerError(o.errorCodes?.join(" ") || xo.EMPTY_STRING, o.errorMessage, o.subError);
      }
    }
    static postProcess(e, t, n, r) {
      if (K_e.checkResponseStatus(n) || K_e.checkResponseForRetryAfter(n)) {
        let o = {
          throttleTime: K_e.calculateThrottleTime(parseInt(n.headers[iw.RETRY_AFTER])),
          error: n.body.error,
          errorCodes: n.body.error_codes,
          errorMessage: n.body.error_description,
          subError: n.body.suberror
        };
        e.setThrottlingCache(K_e.generateThrottlingStorageKey(t), o, r);
      }
    }
    static checkResponseStatus(e) {
      return e.status === 429 || e.status >= 500 && e.status < 600;
    }
    static checkResponseForRetryAfter(e) {
      if (e.headers) {
        return e.headers.hasOwnProperty(iw.RETRY_AFTER) && (e.status < 200 || e.status >= 300);
      }
      return false;
    }
    static calculateThrottleTime(e) {
      let t = e <= 0 ? 0 : e;
      let n = Date.now() / 1000;
      return Math.floor(Math.min(n + (t || dce.DEFAULT_THROTTLE_TIME_SECONDS), n + dce.DEFAULT_MAX_THROTTLE_TIME_SECONDS) * 1000);
    }
    static removeThrottle(e, t, n, r) {
      let o = dit(t, n, r);
      let s = this.generateThrottlingStorageKey(o);
      e.removeItem(s, n.correlationId);
    }
  }
  var Tvi = __lazy(() => {
    aw();
    uit();
    Okn(); /*! @azure/msal-common v15.13.1 2025-10-29 */
  });
  var Dkn;
  var Evi = __lazy(() => {
    JY(); /*! @azure/msal-common v15.13.1 2025-10-29 */
    Dkn = class Dkn extends AuthError {
      constructor(e, t, n) {
        super(e.errorCode, e.errorMessage, e.subError);
        Object.setPrototypeOf(this, Dkn.prototype);
        this.name = "NetworkError";
        this.error = e;
        this.httpStatus = t;
        this.responseHeaders = n;
      }
    };
  });
  class _2 {
    constructor(e, t) {
      this.config = uvi(e);
      this.logger = new Logger(this.config.loggerOptions, "@azure/msal-common", "15.13.1");
      this.cryptoUtils = this.config.cryptoInterface;
      this.cacheManager = this.config.storageInterface;
      this.networkClient = this.config.networkInterface;
      this.serverTelemetryManager = this.config.serverTelemetryManager;
      this.authority = this.config.authOptions.authority;
      this.performanceClient = t;
    }
    createTokenRequestHeaders(e) {
      let t = {};
      if (t[iw.CONTENT_TYPE] = xo.URL_FORM_CONTENT_TYPE, !this.config.systemOptions.preventCorsPreflight && e) {
        switch (e.type) {
          case jj.HOME_ACCOUNT_ID:
            try {
              let n = mce(e.credential);
              t[iw.CCS_HEADER] = `Oid:${n.uid}@${n.utid}`;
            } catch (n) {
              this.logger.verbose("Could not parse home account ID for CCS Header: " + n);
            }
            break;
          case jj.UPN:
            t[iw.CCS_HEADER] = `UPN: ${e.credential}`;
            break;
        }
      }
      return t;
    }
    async executePostToTokenEndpoint(e, t, n, r, o, s) {
      if (s) {
        this.performanceClient?.addQueueMeasurement(s, o);
      }
      let i = await this.sendPostRequest(r, e, {
        body: t,
        headers: n
      }, o);
      if (this.config.serverTelemetryManager && i.status < 500 && i.status !== 429) {
        this.config.serverTelemetryManager.clearTelemetryCache();
      }
      return i;
    }
    async sendPostRequest(e, t, n, r) {
      K_e.preProcess(this.cacheManager, e, r);
      let o;
      try {
        o = await yg(this.networkClient.sendPostRequestAsync.bind(this.networkClient), io.NetworkClientSendPostRequestAsync, this.logger, this.performanceClient, r)(t, n);
        let s = o.headers || {};
        this.performanceClient?.addFields({
          refreshTokenSize: o.body.refresh_token?.length || 0,
          httpVerToken: s[iw.X_MS_HTTP_VERSION] || "",
          requestId: s[iw.X_MS_REQUEST_ID] || ""
        }, r);
      } catch (s) {
        if (s instanceof Dkn) {
          let i = s.responseHeaders;
          if (i) {
            this.performanceClient?.addFields({
              httpVerToken: i[iw.X_MS_HTTP_VERSION] || "",
              requestId: i[iw.X_MS_REQUEST_ID] || "",
              contentTypeHeader: i[iw.CONTENT_TYPE] || undefined,
              contentLengthHeader: i[iw.CONTENT_LENGTH] || undefined,
              httpStatus: s.httpStatus
            }, r);
          }
          throw s.error;
        }
        if (s instanceof AuthError) {
          throw s;
        } else {
          throw rs("network_error");
        }
      }
      K_e.postProcess(this.cacheManager, e, o, r);
      return o;
    }
    async updateAuthority(e, t) {
      this.performanceClient?.addQueueMeasurement(io.UpdateTokenEndpointAuthority, t);
      let n = `https://${e}/${this.authority.tenant}/`;
      let r = await createDiscoveredInstance(n, this.networkClient, this.cacheManager, this.authority.options, this.logger, t, this.performanceClient);
      this.authority = r;
    }
    createTokenQueryParameters(e) {
      let t = new Map();
      if (e.embeddedClientId) {
        addBrokerParameters(t, this.config.authOptions.clientId, this.config.authOptions.redirectUri);
      }
      if (e.tokenQueryParameters) {
        addExtraQueryParameters(t, e.tokenQueryParameters);
      }
      addCorrelationId(t, e.correlationId);
      instrumentBrokerParams(t, e.correlationId, this.performanceClient);
      return mapToQueryString(t);
    }
  }
  var AUt = __lazy(() => {
    _kn();
    ikn();
    aw();
    lkn();
    pUt();
    tit();
    ait();
    x3e();
    y8r();
    wne();
    Tvi();
    JY();
    YP();
    Evi();
    z_e();
    RI(); /*! @azure/msal-common v15.13.1 2025-10-29 */
  });
  var InteractionRequiredAuthErrorCodes = {};
  __export(InteractionRequiredAuthErrorCodes, {
    uxNotAllowed: () => "ux_not_allowed",
    refreshTokenExpired: () => "refresh_token_expired",
    noTokensFound: () => "no_tokens_found",
    nativeAccountUnavailable: () => "native_account_unavailable",
    loginRequired: () => "login_required",
    interactionRequired: () => "interaction_required",
    consentRequired: () => "consent_required",
    badToken: () => "bad_token"
  });
  var Lkn = __lazy(() => {/*! @azure/msal-common v15.13.1 2025-10-29 */});
  function Ukn(e, t, n) {
    let r = !!e && vvi.indexOf(e) > -1;
    let o = !!n && YAd.indexOf(n) > -1;
    let s = !!t && vvi.some(i => t.indexOf(i) > -1);
    return r || s || o;
  }
  function Bkn(e) {
    return new InteractionRequiredAuthError(e, Fkn[e]);
  }
  var vvi;
  var YAd;
  var Fkn;
  var InteractionRequiredAuthErrorMessage;
  var InteractionRequiredAuthError;
  var OUt = __lazy(() => {
    aw();
    JY();
    Lkn(); /*! @azure/msal-common v15.13.1 2025-10-29 */
    vvi = ["interaction_required", "consent_required", "login_required", "bad_token", "ux_not_allowed"];
    YAd = ["message_only", "additional_action", "basic_action", "user_password_expired", "consent_required", "bad_token"];
    Fkn = {
      ["no_tokens_found"]: "No refresh token found in the cache. Please sign-in.",
      ["native_account_unavailable"]: "The requested account is not available in the native broker. It may have been deleted or logged out. Please sign-in again using an interactive API.",
      ["refresh_token_expired"]: "Refresh token has expired.",
      ["bad_token"]: "Identity provider returned bad_token due to an expired or invalid refresh token. Please invoke an interactive API to resolve.",
      ["ux_not_allowed"]: "`canShowUI` flag in Edge was set to false. User interaction required on web page. Please invoke an interactive API to resolve."
    };
    InteractionRequiredAuthErrorMessage = {
      noTokensFoundError: {
        code: "no_tokens_found",
        desc: Fkn["no_tokens_found"]
      },
      native_account_unavailable: {
        code: "native_account_unavailable",
        desc: Fkn["native_account_unavailable"]
      },
      bad_token: {
        code: "bad_token",
        desc: Fkn["bad_token"]
      }
    };
    InteractionRequiredAuthError = class y8 extends AuthError {
      constructor(e, t, n, r, o, s, i, a) {
        super(e, t, n);
        Object.setPrototypeOf(this, y8.prototype);
        this.timestamp = r || xo.EMPTY_STRING;
        this.traceId = o || xo.EMPTY_STRING;
        this.correlationId = s || xo.EMPTY_STRING;
        this.claims = i || xo.EMPTY_STRING;
        this.name = "InteractionRequiredAuthError";
        this.errorNo = a;
      }
    };
  });
  class $kn {
    static setRequestState(e, t, n) {
      let r = $kn.generateLibraryState(e, n);
      return t ? `${r}${xo.RESOURCE_DELIM}${t}` : r;
    }
    static generateLibraryState(e, t) {
      if (!e) {
        throw rs("no_crypto_object");
      }
      let n = {
        id: e.createNewGuid()
      };
      if (t) {
        n.meta = t;
      }
      let r = JSON.stringify(n);
      return e.base64Encode(r);
    }
    static parseRequestState(e, t) {
      if (!e) {
        throw rs("no_crypto_object");
      }
      if (!t) {
        throw rs("invalid_state");
      }
      try {
        let n = t.split(xo.RESOURCE_DELIM);
        let r = n[0];
        let o = n.length > 1 ? n.slice(1).join(xo.RESOURCE_DELIM) : xo.EMPTY_STRING;
        let s = e.base64Decode(r);
        let i = JSON.parse(s);
        return {
          userRequestState: o || xo.EMPTY_STRING,
          libraryState: i
        };
      } catch (n) {
        throw rs("invalid_state");
      }
    }
  }
  var wvi = __lazy(() => {
    aw();
    YP();
    RI(); /*! @azure/msal-common v15.13.1 2025-10-29 */
  });
  class F3e {
    constructor(e, t) {
      this.cryptoUtils = e;
      this.performanceClient = t;
    }
    async generateCnf(e, t) {
      this.performanceClient?.addQueueMeasurement(io.PopTokenGenerateCnf, e.correlationId);
      let n = await yg(this.generateKid.bind(this), io.PopTokenGenerateCnf, t, this.performanceClient, e.correlationId)(e);
      let r = this.cryptoUtils.base64UrlEncode(JSON.stringify(n));
      return {
        kid: n.kid,
        reqCnfString: r
      };
    }
    async generateKid(e) {
      this.performanceClient?.addQueueMeasurement(io.PopTokenGenerateKid, e.correlationId);
      return {
        kid: await this.cryptoUtils.getPublicKeyThumbprint(e),
        xms_ksl: JAd.SW
      };
    }
    async signPopToken(e, t, n) {
      return this.signPayload(e, t, n);
    }
    async signPayload(e, t, n, r) {
      let {
        resourceRequestMethod: o,
        resourceRequestUri: s,
        shrClaims: i,
        shrNonce: a,
        shrOptions: l
      } = n;
      let u = (s ? new bm(s) : undefined)?.getUrlComponents();
      return this.cryptoUtils.signJwt({
        at: e,
        ts: nowSeconds(),
        m: o?.toUpperCase(),
        u: u?.HostNameAndPort,
        nonce: a || this.cryptoUtils.createNewGuid(),
        p: u?.AbsolutePath,
        q: u?.QueryString ? [[], u.QueryString] : undefined,
        client_claims: i || undefined,
        ...r
      }, t, l, n.correlationId);
    }
  }
  var JAd;
  var Hkn = __lazy(() => {
    G0e();
    q0e();
    wne();
    z_e(); /*! @azure/msal-common v15.13.1 2025-10-29 */
    JAd = {
      SW: "sw"
    };
  });
  class TokenCacheContext {
    constructor(e, t) {
      this.cache = e;
      this.hasChanged = t;
    }
    get cacheHasChanged() {
      return this.hasChanged;
    }
    get tokenCache() {
      return this.cache;
    }
  }
  var E8r = __lazy(() => {/*! @azure/msal-common v15.13.1 2025-10-29 */});
  class XA {
    constructor(e, t, n, r, o, s, i) {
      this.clientId = e;
      this.cacheStorage = t;
      this.cryptoObj = n;
      this.logger = r;
      this.serializableCache = o;
      this.persistencePlugin = s;
      this.performanceClient = i;
    }
    validateTokenResponse(e, t) {
      if (e.error || e.error_description || e.suberror) {
        let n = `Error(s): ${e.error_codes || xo.NOT_AVAILABLE} - Timestamp: ${e.timestamp || xo.NOT_AVAILABLE} - Description: ${e.error_description || xo.NOT_AVAILABLE} - Correlation ID: ${e.correlation_id || xo.NOT_AVAILABLE} - Trace ID: ${e.trace_id || xo.NOT_AVAILABLE}`;
        let r = e.error_codes?.length ? e.error_codes[0] : undefined;
        let o = new ServerError(e.error, n, e.suberror, r, e.status);
        if (t && e.status && e.status >= Wp.SERVER_ERROR_RANGE_START && e.status <= Wp.SERVER_ERROR_RANGE_END) {
          this.logger.warning(`executeTokenRequest:validateTokenResponse - AAD is currently unavailable and the access token is unable to be refreshed.
${o}`);
          return;
        } else if (t && e.status && e.status >= Wp.CLIENT_ERROR_RANGE_START && e.status <= Wp.CLIENT_ERROR_RANGE_END) {
          this.logger.warning(`executeTokenRequest:validateTokenResponse - AAD is currently available but is unable to refresh the access token.
${o}`);
          return;
        }
        if (Ukn(e.error, e.error_description, e.suberror)) {
          throw new InteractionRequiredAuthError(e.error, e.error_description, e.suberror, e.timestamp || xo.EMPTY_STRING, e.trace_id || xo.EMPTY_STRING, e.correlation_id || xo.EMPTY_STRING, e.claims || xo.EMPTY_STRING, r);
        }
        throw o;
      }
    }
    async handleServerTokenResponse(e, t, n, r, o, s, i, a, l) {
      this.performanceClient?.addQueueMeasurement(io.HandleServerTokenResponse, e.correlation_id);
      let c;
      if (e.id_token) {
        if (c = extractTokenClaims(e.id_token || xo.EMPTY_STRING, this.cryptoObj.base64Decode), o && o.nonce) {
          if (c.nonce !== o.nonce) {
            throw rs("nonce_mismatch");
          }
        }
        if (r.maxAge || r.maxAge === 0) {
          let m = c.auth_time;
          if (!m) {
            throw rs("auth_time_not_found");
          }
          checkMaxAge(m, r.maxAge);
        }
      }
      this.homeAccountIdentifier = JP.generateHomeAccountId(e.client_info || xo.EMPTY_STRING, t.authorityType, this.logger, this.cryptoObj, c);
      let u;
      if (!!o && !!o.state) {
        u = $kn.parseRequestState(this.cryptoObj, o.state);
      }
      e.key_id = e.key_id || r.sshKid || undefined;
      let d = this.generateCacheRecord(e, t, n, r, c, s, o);
      let p;
      try {
        if (this.persistencePlugin && this.serializableCache) {
          this.logger.verbose("Persistence enabled, calling beforeCacheAccess");
          p = new TokenCacheContext(this.serializableCache, true);
          await this.persistencePlugin.beforeCacheAccess(p);
        }
        if (i && !a && d.account) {
          let m = this.cacheStorage.generateAccountKey(JP.getAccountInfo(d.account));
          if (!this.cacheStorage.getAccount(m, r.correlationId)) {
            this.logger.warning("Account used to refresh tokens not in persistence, refreshed tokens will not be stored in the cache");
            return await XA.generateAuthenticationResult(this.cryptoObj, t, d, false, r, c, u, undefined, l);
          }
        }
        await this.cacheStorage.saveCacheRecord(d, r.correlationId, isKmsi(c || {}), r.storeInCache);
      } finally {
        if (this.persistencePlugin && this.serializableCache && p) {
          this.logger.verbose("Persistence enabled, calling afterCacheAccess");
          await this.persistencePlugin.afterCacheAccess(p);
        }
      }
      return XA.generateAuthenticationResult(this.cryptoObj, t, d, false, r, c, u, e, l);
    }
    generateCacheRecord(e, t, n, r, o, s, i) {
      let a = t.getPreferredCache();
      if (!a) {
        throw rs("invalid_cache_environment");
      }
      let l = pkn(o);
      let c;
      let u;
      if (e.id_token && !!o) {
        c = createIdTokenEntity(this.homeAccountIdentifier, a, e.id_token, this.clientId, l || "");
        u = Cvi(this.cacheStorage, t, this.homeAccountIdentifier, this.cryptoObj.base64Decode, r.correlationId, o, e.client_info, a, l, i, undefined, this.logger);
      }
      let d = null;
      if (e.access_token) {
        let f = e.scope ? JA.fromString(e.scope) : new JA(r.scopes || []);
        let h = (typeof e.expires_in === "string" ? parseInt(e.expires_in, 10) : e.expires_in) || 0;
        let g = (typeof e.ext_expires_in === "string" ? parseInt(e.ext_expires_in, 10) : e.ext_expires_in) || 0;
        let y = (typeof e.refresh_in === "string" ? parseInt(e.refresh_in, 10) : e.refresh_in) || undefined;
        let _ = n + h;
        let b = _ + g;
        let S = y && y > 0 ? n + y : undefined;
        d = createAccessTokenEntity(this.homeAccountIdentifier, a, e.access_token, this.clientId, l || t.tenant || "", f.printScopes(), _, b, this.cryptoObj.base64Decode, S, e.token_type, s, e.key_id, r.claims, r.requestedClaimsHash);
      }
      let p = null;
      if (e.refresh_token) {
        let f;
        if (e.refresh_token_expires_in) {
          let h = typeof e.refresh_token_expires_in === "string" ? parseInt(e.refresh_token_expires_in, 10) : e.refresh_token_expires_in;
          f = n + h;
        }
        p = createRefreshTokenEntity(this.homeAccountIdentifier, a, e.refresh_token, this.clientId, e.foci, s, f);
      }
      let m = null;
      if (e.foci) {
        m = {
          clientId: this.clientId,
          environment: a,
          familyId: e.foci
        };
      }
      return {
        account: u,
        idToken: c,
        accessToken: d,
        refreshToken: p,
        appMetadata: m
      };
    }
    static async generateAuthenticationResult(e, t, n, r, o, s, i, a, l) {
      let c = xo.EMPTY_STRING;
      let u = [];
      let d = null;
      let p;
      let m;
      let f = xo.EMPTY_STRING;
      if (n.accessToken) {
        if (n.accessToken.tokenType === Hh.POP && !o.popKid) {
          let _ = new F3e(e);
          let {
            secret: b,
            keyId: S
          } = n.accessToken;
          if (!S) {
            throw rs("key_id_missing");
          }
          c = await _.signPopToken(b, S, o);
        } else {
          c = n.accessToken.secret;
        }
        if (u = JA.fromString(n.accessToken.target).asArray(), d = toDateFromSeconds(n.accessToken.expiresOn), p = toDateFromSeconds(n.accessToken.extendedExpiresOn), n.accessToken.refreshOn) {
          m = toDateFromSeconds(n.accessToken.refreshOn);
        }
      }
      if (n.appMetadata) {
        f = n.appMetadata.familyId === "1" ? "1" : "";
      }
      let h = s?.oid || s?.sub || "";
      let g = s?.tid || "";
      if (a?.spa_accountid && !!n.account) {
        n.account.nativeAccountId = a?.spa_accountid;
      }
      let y = n.account ? ukn(JP.getAccountInfo(n.account), undefined, s, n.idToken?.secret) : null;
      return {
        authority: t.canonicalAuthority,
        uniqueId: h,
        tenantId: g,
        scopes: u,
        account: y,
        idToken: n?.idToken?.secret || "",
        idTokenClaims: s || {},
        accessToken: c,
        fromCache: r,
        expiresOn: d,
        extExpiresOn: p,
        refreshOn: m,
        correlationId: o.correlationId,
        requestId: l || xo.EMPTY_STRING,
        familyId: f,
        tokenType: n.accessToken?.tokenType || xo.EMPTY_STRING,
        state: i ? i.userRequestState : xo.EMPTY_STRING,
        cloudGraphHostName: n.account?.cloudGraphHostName || xo.EMPTY_STRING,
        msGraphHost: n.account?.msGraphHost || xo.EMPTY_STRING,
        code: a?.spa_code,
        fromNativeBroker: false
      };
    }
  }
  function Cvi(e, t, n, r, o, s, i, a, l, c, u, d) {
    d?.verbose("setCachedAccount called");
    let m = e.getAccountKeys().find(_ => _.startsWith(n));
    let f = null;
    if (m) {
      f = e.getAccount(m, o);
    }
    let h = f || JP.createAccount({
      homeAccountId: n,
      idTokenClaims: s,
      clientInfo: i,
      environment: a,
      cloudGraphHostName: c?.cloud_graph_host_name,
      msGraphHost: c?.msgraph_host,
      nativeAccountId: u
    }, t, r);
    let g = h.tenantProfiles || [];
    let y = l || h.realm;
    if (y && !g.find(_ => _.tenantId === y)) {
      let _ = aUt(n, h.localAccountId, y, s);
      g.push(_);
    }
    h.tenantProfiles = g;
    return h;
  }
  var DUt = __lazy(() => {
    YP();
    uit();
    iUt();
    mkn();
    OUt();
    wvi();
    aw();
    Hkn();
    E8r();
    wne();
    nit();
    s6r();
    dkn();
    kkn();
    G0e();
    RI(); /*! @azure/msal-common v15.13.1 2025-10-29 */
  });
  async function Gj(e, t, n) {
    if (typeof e === "string") {
      return e;
    } else {
      return e({
        clientId: t,
        tokenEndpoint: n
      });
    }
  }
  var jkn = __lazy(() => {/*! @azure/msal-common v15.13.1 2025-10-29 */});
  var qkn;
  var Rvi = __lazy(() => {
    AUt();
    ait();
    x3e();
    aw();
    sit();
    _kn();
    DUt();
    j0e();
    YP();
    q0e();
    Hkn();
    G0e();
    tit();
    pUt();
    H0e();
    wne();
    z_e();
    jkn();
    Okn();
    RI();
    j_e(); /*! @azure/msal-common v15.13.1 2025-10-29 */
    qkn = class qkn extends _2 {
      constructor(e, t) {
        super(e, t);
        this.includeRedirectUri = true;
        this.oidcDefaultScopes = this.config.authOptions.authority.options.OIDCOptions?.defaultScopes;
      }
      async acquireToken(e, t) {
        if (this.performanceClient?.addQueueMeasurement(io.AuthClientAcquireToken, e.correlationId), !e.code) {
          throw rs("request_cannot_be_made");
        }
        let n = nowSeconds();
        let r = await yg(this.executeTokenRequest.bind(this), io.AuthClientExecuteTokenRequest, this.logger, this.performanceClient, e.correlationId)(this.authority, e);
        let o = r.headers?.[iw.X_MS_REQUEST_ID];
        let s = new XA(this.config.authOptions.clientId, this.cacheManager, this.cryptoUtils, this.logger, this.config.serializableCache, this.config.persistencePlugin, this.performanceClient);
        s.validateTokenResponse(r.body);
        return yg(s.handleServerTokenResponse.bind(s), io.HandleServerTokenResponse, this.logger, this.performanceClient, e.correlationId)(r.body, this.authority, n, e, t, undefined, undefined, undefined, o);
      }
      getLogoutUri(e) {
        if (!e) {
          throw JT("logout_request_empty");
        }
        let t = this.createLogoutUrlQueryString(e);
        return bm.appendQueryString(this.authority.endSessionEndpoint, t);
      }
      async executeTokenRequest(e, t) {
        this.performanceClient?.addQueueMeasurement(io.AuthClientExecuteTokenRequest, t.correlationId);
        let n = this.createTokenQueryParameters(t);
        let r = bm.appendQueryString(e.tokenEndpoint, n);
        let o = await yg(this.createTokenRequestBody.bind(this), io.AuthClientCreateTokenRequestBody, this.logger, this.performanceClient, t.correlationId)(t);
        let s = undefined;
        if (t.clientInfo) {
          try {
            let l = eit(t.clientInfo, this.cryptoUtils.base64Decode);
            s = {
              credential: `${l.uid}${N_e.CLIENT_INFO_SEPARATOR}${l.utid}`,
              type: jj.HOME_ACCOUNT_ID
            };
          } catch (l) {
            this.logger.verbose("Could not parse client info for CCS Header: " + l);
          }
        }
        let i = this.createTokenRequestHeaders(s || t.ccsCredential);
        let a = dit(this.config.authOptions.clientId, t);
        return yg(this.executePostToTokenEndpoint.bind(this), io.AuthorizationCodeClientExecutePostToTokenEndpoint, this.logger, this.performanceClient, t.correlationId)(r, o, i, a, t.correlationId, io.AuthorizationCodeClientExecutePostToTokenEndpoint);
      }
      async createTokenRequestBody(e) {
        this.performanceClient?.addQueueMeasurement(io.AuthClientCreateTokenRequestBody, e.correlationId);
        let t = new Map();
        if (addClientId(t, e.embeddedClientId || e.tokenBodyParameters?.[CLIENT_ID] || this.config.authOptions.clientId), !this.includeRedirectUri) {
          if (!e.redirectUri) {
            throw JT("redirect_uri_empty");
          }
        } else {
          addRedirectUri(t, e.redirectUri);
        }
        if (addScopes(t, e.scopes, true, this.oidcDefaultScopes), addAuthorizationCode(t, e.code), addLibraryInfo(t, this.config.libraryInfo), addApplicationTelemetry(t, this.config.telemetry.application), addThrottling(t), this.serverTelemetryManager && !ykn(this.config)) {
          addServerTelemetry(t, this.serverTelemetryManager);
        }
        if (e.codeVerifier) {
          addCodeVerifier(t, e.codeVerifier);
        }
        if (this.config.clientCredentials.clientSecret) {
          addClientSecret(t, this.config.clientCredentials.clientSecret);
        }
        if (this.config.clientCredentials.clientAssertion) {
          let r = this.config.clientCredentials.clientAssertion;
          addClientAssertion(t, await Gj(r.assertion, this.config.authOptions.clientId, e.resourceRequestUri));
          addClientAssertionType(t, r.assertionType);
        }
        if (addGrantType(t, FW.AUTHORIZATION_CODE_GRANT), addClientInfo(t), e.authenticationScheme === Hh.POP) {
          let r = new F3e(this.cryptoUtils, this.performanceClient);
          let o;
          if (!e.popKid) {
            o = (await yg(r.generateCnf.bind(r), io.PopTokenGenerateCnf, this.logger, this.performanceClient, e.correlationId)(e, this.logger)).reqCnfString;
          } else {
            o = this.cryptoUtils.encodeKid(e.popKid);
          }
          addPopToken(t, o);
        } else if (e.authenticationScheme === Hh.SSH) {
          if (e.sshJwk) {
            addSshJwk(t, e.sshJwk);
          } else {
            throw JT("missing_ssh_jwk");
          }
        }
        if (!uv.isEmptyObj(e.claims) || this.config.authOptions.clientCapabilities && this.config.authOptions.clientCapabilities.length > 0) {
          addClaims(t, e.claims, this.config.authOptions.clientCapabilities);
        }
        let n = undefined;
        if (e.clientInfo) {
          try {
            let r = eit(e.clientInfo, this.cryptoUtils.base64Decode);
            n = {
              credential: `${r.uid}${N_e.CLIENT_INFO_SEPARATOR}${r.utid}`,
              type: jj.HOME_ACCOUNT_ID
            };
          } catch (r) {
            this.logger.verbose("Could not parse client info for CCS Header: " + r);
          }
        } else {
          n = e.ccsCredential;
        }
        if (this.config.systemOptions.preventCorsPreflight && n) {
          switch (n.type) {
            case jj.HOME_ACCOUNT_ID:
              try {
                let r = mce(n.credential);
                addCcsOid(t, r);
              } catch (r) {
                this.logger.verbose("Could not parse home account ID for CCS Header: " + r);
              }
              break;
            case jj.UPN:
              addCcsUpn(t, n.credential);
              break;
          }
        }
        if (e.embeddedClientId) {
          addBrokerParameters(t, this.config.authOptions.clientId, this.config.authOptions.redirectUri);
        }
        if (e.tokenBodyParameters) {
          addExtraQueryParameters(t, e.tokenBodyParameters);
        }
        if (e.enableSpaAuthorizationCode && (!e.tokenBodyParameters || !e.tokenBodyParameters["return_spa_code"])) {
          addExtraQueryParameters(t, {
            ["return_spa_code"]: "1"
          });
        }
        instrumentBrokerParams(t, e.correlationId, this.performanceClient);
        return mapToQueryString(t);
      }
      createLogoutUrlQueryString(e) {
        let t = new Map();
        if (e.postLogoutRedirectUri) {
          addPostLogoutRedirectUri(t, e.postLogoutRedirectUri);
        }
        if (e.correlationId) {
          addCorrelationId(t, e.correlationId);
        }
        if (e.idTokenHint) {
          addIdTokenHint(t, e.idTokenHint);
        }
        if (e.state) {
          addState(t, e.state);
        }
        if (e.logoutHint) {
          addLogoutHint(t, e.logoutHint);
        }
        if (e.extraQueryParameters) {
          addExtraQueryParameters(t, e.extraQueryParameters);
        }
        if (this.config.authOptions.instanceAware) {
          addInstanceAware(t);
        }
        return mapToQueryString(t, this.config.authOptions.encodeExtraQueryParams, e.extraQueryParameters);
      }
    };
  });
  var pit;
  var xvi = __lazy(() => {
    _kn();
    AUt();
    ait();
    x3e();
    aw();
    sit();
    DUt();
    Hkn();
    j0e();
    H0e();
    YP();
    uit();
    G0e();
    q0e();
    pUt();
    tit();
    OUt();
    wne();
    z_e();
    jkn();
    Okn();
    Lkn();
    j_e();
    RI(); /*! @azure/msal-common v15.13.1 2025-10-29 */
    pit = class pit extends _2 {
      constructor(e, t) {
        super(e, t);
      }
      async acquireToken(e) {
        this.performanceClient?.addQueueMeasurement(io.RefreshTokenClientAcquireToken, e.correlationId);
        let t = nowSeconds();
        let n = await yg(this.executeTokenRequest.bind(this), io.RefreshTokenClientExecuteTokenRequest, this.logger, this.performanceClient, e.correlationId)(e, this.authority);
        let r = n.headers?.[iw.X_MS_REQUEST_ID];
        let o = new XA(this.config.authOptions.clientId, this.cacheManager, this.cryptoUtils, this.logger, this.config.serializableCache, this.config.persistencePlugin);
        o.validateTokenResponse(n.body);
        return yg(o.handleServerTokenResponse.bind(o), io.HandleServerTokenResponse, this.logger, this.performanceClient, e.correlationId)(n.body, this.authority, t, e, undefined, undefined, true, e.forceCache, r);
      }
      async acquireTokenByRefreshToken(e) {
        if (!e) {
          throw JT("token_request_empty");
        }
        if (this.performanceClient?.addQueueMeasurement(io.RefreshTokenClientAcquireTokenByRefreshToken, e.correlationId), !e.account) {
          throw rs("no_account_in_silent_request");
        }
        if (this.cacheManager.isAppMetadataFOCI(e.account.environment)) {
          try {
            return await yg(this.acquireTokenWithCachedRefreshToken.bind(this), io.RefreshTokenClientAcquireTokenWithCachedRefreshToken, this.logger, this.performanceClient, e.correlationId)(e, true);
          } catch (n) {
            let r = n instanceof InteractionRequiredAuthError && n.errorCode === "no_tokens_found";
            let o = n instanceof ServerError && n.errorCode === PFt.INVALID_GRANT_ERROR && n.subError === PFt.CLIENT_MISMATCH_ERROR;
            if (r || o) {
              return yg(this.acquireTokenWithCachedRefreshToken.bind(this), io.RefreshTokenClientAcquireTokenWithCachedRefreshToken, this.logger, this.performanceClient, e.correlationId)(e, false);
            } else {
              throw n;
            }
          }
        }
        return yg(this.acquireTokenWithCachedRefreshToken.bind(this), io.RefreshTokenClientAcquireTokenWithCachedRefreshToken, this.logger, this.performanceClient, e.correlationId)(e, false);
      }
      async acquireTokenWithCachedRefreshToken(e, t) {
        this.performanceClient?.addQueueMeasurement(io.RefreshTokenClientAcquireTokenWithCachedRefreshToken, e.correlationId);
        let n = _vi(this.cacheManager.getRefreshToken.bind(this.cacheManager), io.CacheManagerGetRefreshToken, this.logger, this.performanceClient, e.correlationId)(e.account, t, e.correlationId, undefined, this.performanceClient);
        if (!n) {
          throw Bkn("no_tokens_found");
        }
        if (n.expiresOn && isTokenExpired(n.expiresOn, e.refreshTokenExpirationOffsetSeconds || 300)) {
          throw this.performanceClient?.addFields({
            rtExpiresOnMs: Number(n.expiresOn)
          }, e.correlationId), Bkn("refresh_token_expired");
        }
        let r = {
          ...e,
          refreshToken: n.secret,
          authenticationScheme: e.authenticationScheme || Hh.BEARER,
          ccsCredential: {
            credential: e.account.homeAccountId,
            type: jj.HOME_ACCOUNT_ID
          }
        };
        try {
          return await yg(this.acquireToken.bind(this), io.RefreshTokenClientAcquireToken, this.logger, this.performanceClient, e.correlationId)(r);
        } catch (o) {
          if (o instanceof InteractionRequiredAuthError) {
            if (this.performanceClient?.addFields({
              rtExpiresOnMs: Number(n.expiresOn)
            }, e.correlationId), o.subError === "bad_token") {
              this.logger.verbose("acquireTokenWithRefreshToken: bad refresh token, removing from cache");
              let s = this.cacheManager.generateCredentialKey(n);
              this.cacheManager.removeRefreshToken(s, e.correlationId);
            }
          }
          throw o;
        }
      }
      async executeTokenRequest(e, t) {
        this.performanceClient?.addQueueMeasurement(io.RefreshTokenClientExecuteTokenRequest, e.correlationId);
        let n = this.createTokenQueryParameters(e);
        let r = bm.appendQueryString(t.tokenEndpoint, n);
        let o = await yg(this.createTokenRequestBody.bind(this), io.RefreshTokenClientCreateTokenRequestBody, this.logger, this.performanceClient, e.correlationId)(e);
        let s = this.createTokenRequestHeaders(e.ccsCredential);
        let i = dit(this.config.authOptions.clientId, e);
        return yg(this.executePostToTokenEndpoint.bind(this), io.RefreshTokenClientExecutePostToTokenEndpoint, this.logger, this.performanceClient, e.correlationId)(r, o, s, i, e.correlationId, io.RefreshTokenClientExecutePostToTokenEndpoint);
      }
      async createTokenRequestBody(e) {
        this.performanceClient?.addQueueMeasurement(io.RefreshTokenClientCreateTokenRequestBody, e.correlationId);
        let t = new Map();
        if (addClientId(t, e.embeddedClientId || e.tokenBodyParameters?.[CLIENT_ID] || this.config.authOptions.clientId), e.redirectUri) {
          addRedirectUri(t, e.redirectUri);
        }
        if (addScopes(t, e.scopes, true, this.config.authOptions.authority.options.OIDCOptions?.defaultScopes), addGrantType(t, FW.REFRESH_TOKEN_GRANT), addClientInfo(t), addLibraryInfo(t, this.config.libraryInfo), addApplicationTelemetry(t, this.config.telemetry.application), addThrottling(t), this.serverTelemetryManager && !ykn(this.config)) {
          addServerTelemetry(t, this.serverTelemetryManager);
        }
        if (addRefreshToken(t, e.refreshToken), this.config.clientCredentials.clientSecret) {
          addClientSecret(t, this.config.clientCredentials.clientSecret);
        }
        if (this.config.clientCredentials.clientAssertion) {
          let n = this.config.clientCredentials.clientAssertion;
          addClientAssertion(t, await Gj(n.assertion, this.config.authOptions.clientId, e.resourceRequestUri));
          addClientAssertionType(t, n.assertionType);
        }
        if (e.authenticationScheme === Hh.POP) {
          let n = new F3e(this.cryptoUtils, this.performanceClient);
          let r;
          if (!e.popKid) {
            r = (await yg(n.generateCnf.bind(n), io.PopTokenGenerateCnf, this.logger, this.performanceClient, e.correlationId)(e, this.logger)).reqCnfString;
          } else {
            r = this.cryptoUtils.encodeKid(e.popKid);
          }
          addPopToken(t, r);
        } else if (e.authenticationScheme === Hh.SSH) {
          if (e.sshJwk) {
            addSshJwk(t, e.sshJwk);
          } else {
            throw JT("missing_ssh_jwk");
          }
        }
        if (!uv.isEmptyObj(e.claims) || this.config.authOptions.clientCapabilities && this.config.authOptions.clientCapabilities.length > 0) {
          addClaims(t, e.claims, this.config.authOptions.clientCapabilities);
        }
        if (this.config.systemOptions.preventCorsPreflight && e.ccsCredential) {
          switch (e.ccsCredential.type) {
            case jj.HOME_ACCOUNT_ID:
              try {
                let n = mce(e.ccsCredential.credential);
                addCcsOid(t, n);
              } catch (n) {
                this.logger.verbose("Could not parse home account ID for CCS Header: " + n);
              }
              break;
            case jj.UPN:
              addCcsUpn(t, e.ccsCredential.credential);
              break;
          }
        }
        if (e.embeddedClientId) {
          addBrokerParameters(t, this.config.authOptions.clientId, this.config.authOptions.redirectUri);
        }
        if (e.tokenBodyParameters) {
          addExtraQueryParameters(t, e.tokenBodyParameters);
        }
        instrumentBrokerParams(t, e.correlationId, this.performanceClient);
        return mapToQueryString(t);
      }
    };
  });
  var Wkn;
  var kvi = __lazy(() => {
    AUt();
    G0e();
    YP();
    DUt();
    aw();
    j0e();
    nit();
    wne();
    z_e();
    Ikn();
    RI(); /*! @azure/msal-common v15.13.1 2025-10-29 */
    Wkn = class Wkn extends _2 {
      constructor(e, t) {
        super(e, t);
      }
      async acquireCachedToken(e) {
        this.performanceClient?.addQueueMeasurement(io.SilentFlowClientAcquireCachedToken, e.correlationId);
        let t = cv.NOT_APPLICABLE;
        if (e.forceRefresh || !this.config.cacheOptions.claimsBasedCachingEnabled && !uv.isEmptyObj(e.claims)) {
          throw this.setCacheOutcome(cv.FORCE_REFRESH_OR_CLAIMS, e.correlationId), rs("token_refresh_required");
        }
        if (!e.account) {
          throw rs("no_account_in_silent_request");
        }
        let n = e.account.tenantId || Svi(e.authority);
        let r = this.cacheManager.getTokenKeys();
        let o = this.cacheManager.getAccessToken(e.account, e, r, n);
        if (!o) {
          throw this.setCacheOutcome(cv.NO_CACHED_ACCESS_TOKEN, e.correlationId), rs("token_refresh_required");
        } else if (wasClockTurnedBack(o.cachedAt) || isTokenExpired(o.expiresOn, this.config.systemOptions.tokenRenewalOffsetSeconds)) {
          throw this.setCacheOutcome(cv.CACHED_ACCESS_TOKEN_EXPIRED, e.correlationId), rs("token_refresh_required");
        } else if (o.refreshOn && isTokenExpired(o.refreshOn, 0)) {
          t = cv.PROACTIVELY_REFRESHED;
        }
        let s = e.authority || this.authority.getPreferredCache();
        let i = {
          account: this.cacheManager.getAccount(this.cacheManager.generateAccountKey(e.account), e.correlationId),
          accessToken: o,
          idToken: this.cacheManager.getIdToken(e.account, e.correlationId, r, n, this.performanceClient),
          refreshToken: null,
          appMetadata: this.cacheManager.readAppMetadataFromCache(s)
        };
        if (this.setCacheOutcome(t, e.correlationId), this.config.serverTelemetryManager) {
          this.config.serverTelemetryManager.incrementCacheHits();
        }
        return [await yg(this.generateResultFromCacheRecord.bind(this), io.SilentFlowClientGenerateResultFromCacheRecord, this.logger, this.performanceClient, e.correlationId)(i, e), t];
      }
      setCacheOutcome(e, t) {
        if (this.serverTelemetryManager?.setCacheOutcome(e), this.performanceClient?.addFields({
          cacheOutcome: e
        }, t), e !== cv.NOT_APPLICABLE) {
          this.logger.info(`Token refresh is required due to cache outcome: ${e}`);
        }
      }
      async generateResultFromCacheRecord(e, t) {
        this.performanceClient?.addQueueMeasurement(io.SilentFlowClientGenerateResultFromCacheRecord, t.correlationId);
        let n;
        if (e.idToken) {
          n = extractTokenClaims(e.idToken.secret, this.config.cryptoInterface.base64Decode);
        }
        if (t.maxAge || t.maxAge === 0) {
          let r = n?.auth_time;
          if (!r) {
            throw rs("auth_time_not_found");
          }
          checkMaxAge(r, t.maxAge);
        }
        return XA.generateAuthenticationResult(this.cryptoUtils, this.authority, e, true, t, n);
      }
    };
  });
  var MUt = {};