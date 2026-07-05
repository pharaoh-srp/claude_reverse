  class ClientAssertion {
    static fromAssertion(e) {
      let t = new ClientAssertion();
      t.jwt = e;
      return t;
    }
    static fromCertificate(e, t, n) {
      let r = new ClientAssertion();
      if (r.privateKey = t, r.thumbprint = e, r.useSha256 = false, n) {
        r.publicCertificate = this.parseCertificate(n);
      }
      return r;
    }
    static fromCertificateWithSha256Thumbprint(e, t, n) {
      let r = new ClientAssertion();
      if (r.privateKey = t, r.thumbprint = e, r.useSha256 = true, n) {
        r.publicCertificate = this.parseCertificate(n);
      }
      return r;
    }
    getJwt(e, t, n) {
      if (this.privateKey && this.thumbprint) {
        if (this.jwt && !this.isExpired() && t === this.issuer && n === this.jwtAudience) {
          return this.jwt;
        }
        return this.createJwt(e, t, n);
      }
      if (this.jwt) {
        return this.jwt;
      }
      throw rs(ClientAuthErrorCodes.invalidAssertion);
    }
    createJwt(e, t, n) {
      this.issuer = t;
      this.jwtAudience = n;
      let r = AC.nowSeconds();
      this.expirationTime = r + 600;
      let s = {
        alg: this.useSha256 ? ZY.PSS_256 : ZY.RSA_256
      };
      let i = this.useSha256 ? ZY.X5T_256 : ZY.X5T;
      if (Object.assign(s, {
        [i]: $W.base64EncodeUrl(this.thumbprint, DF.HEX)
      }), this.publicCertificate) {
        Object.assign(s, {
          [ZY.X5C]: this.publicCertificate
        });
      }
      let a = {
        [ZY.AUDIENCE]: this.jwtAudience,
        [ZY.EXPIRATION_TIME]: this.expirationTime,
        [ZY.ISSUER]: this.issuer,
        [ZY.SUBJECT]: this.issuer,
        [ZY.NOT_BEFORE]: r,
        [ZY.JWT_ID]: e.createNewGuid()
      };
      this.jwt = Zxi.default.sign(a, this.privateKey, {
        header: s
      });
      return this.jwt;
    }
    isExpired() {
      return this.expirationTime < AC.nowSeconds();
    }
    static parseCertificate(e) {
      let t = /-----BEGIN CERTIFICATE-----\r*\n(.+?)\r*\n-----END CERTIFICATE-----/gs;
      let n = [];
      let r;
      while ((r = t.exec(e)) !== null) {
        n.push(r[1].replace(/\r*\n/g, xo.EMPTY_STRING));
      }
      return n;
    }
  }
  var Zxi;
  var UAn = __lazy(() => {
    lS();
    $Ut();
    PC();
    Zxi = __toESM(Qxi(), 1); /*! @azure/msal-node v3.8.1 2025-10-29 */
  });
  var Tit = __lazy(() => {/*! @azure/msal-node v3.8.1 2025-10-29 */});
  var UsernamePasswordClient;
  var AVr = __lazy(() => {
    lS(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    UsernamePasswordClient = class nBt extends _2 {
      constructor(e) {
        super(e);
      }
      async acquireToken(e) {
        this.logger.info("in acquireToken call in username-password client");
        let t = AC.nowSeconds();
        let n = await this.executeTokenRequest(this.authority, e);
        let r = new XA(this.config.authOptions.clientId, this.cacheManager, this.cryptoUtils, this.logger, this.config.serializableCache, this.config.persistencePlugin);
        r.validateTokenResponse(n.body);
        return r.handleServerTokenResponse(n.body, this.authority, t, e);
      }
      async executeTokenRequest(e, t) {
        let n = this.createTokenQueryParameters(t);
        let r = bm.appendQueryString(e.tokenEndpoint, n);
        let o = await this.createTokenRequestBody(t);
        let s = this.createTokenRequestHeaders({
          credential: t.username,
          type: jj.UPN
        });
        let i = {
          clientId: this.config.authOptions.clientId,
          authority: e.canonicalAuthority,
          scopes: t.scopes,
          claims: t.claims,
          authenticationScheme: t.authenticationScheme,
          resourceRequestMethod: t.resourceRequestMethod,
          resourceRequestUri: t.resourceRequestUri,
          shrClaims: t.shrClaims,
          sshKid: t.sshKid
        };
        return this.executePostToTokenEndpoint(r, o, s, i, t.correlationId);
      }
      async createTokenRequestBody(e) {
        let t = new Map();
        if (Ya.addClientId(t, this.config.authOptions.clientId), Ya.addUsername(t, e.username), Ya.addPassword(t, e.password), Ya.addScopes(t, e.scopes), Ya.addResponseType(t, Vst.IDTOKEN_TOKEN), Ya.addGrantType(t, FW.RESOURCE_OWNER_PASSWORD_GRANT), Ya.addClientInfo(t), Ya.addLibraryInfo(t, this.config.libraryInfo), Ya.addApplicationTelemetry(t, this.config.telemetry.application), Ya.addThrottling(t), this.serverTelemetryManager) {
          Ya.addServerTelemetry(t, this.serverTelemetryManager);
        }
        let n = e.correlationId || this.config.cryptoInterface.createNewGuid();
        if (Ya.addCorrelationId(t, n), this.config.clientCredentials.clientSecret) {
          Ya.addClientSecret(t, this.config.clientCredentials.clientSecret);
        }
        let r = this.config.clientCredentials.clientAssertion;
        if (r) {
          Ya.addClientAssertion(t, await Gj(r.assertion, this.config.authOptions.clientId, e.resourceRequestUri));
          Ya.addClientAssertionType(t, r.assertionType);
        }
        if (!uv.isEmptyObj(e.claims) || this.config.authOptions.clientCapabilities && this.config.authOptions.clientCapabilities.length > 0) {
          Ya.addClaims(t, e.claims, this.config.authOptions.clientCapabilities);
        }
        if (this.config.systemOptions.preventCorsPreflight && e.username) {
          Ya.addCcsUpn(t, e.username);
        }
        return MF.mapToQueryString(t);
      }
    };
  });
  function eki(e, t, n, r) {
    let o = MUt.getStandardAuthorizeRequestParameters({
      ...e.auth,
      authority: t,
      redirectUri: n.redirectUri || ""
    }, n, r);
    if (Ya.addLibraryInfo(o, {
      sku: Vj.MSAL_SKU,
      version: "3.8.1",
      cpu: "arm64",
      os: "linux"
    }), e.auth.protocolMode !== ProtocolMode.OIDC) {
      Ya.addApplicationTelemetry(o, e.telemetry.application);
    }
    if (Ya.addResponseType(o, Vst.CODE), n.codeChallenge && n.codeChallengeMethod) {
      Ya.addCodeChallengeParams(o, n.codeChallenge, n.codeChallengeMethod);
    }
    Ya.addExtraQueryParameters(o, n.extraQueryParameters || {});
    return MUt.getAuthorizeUrl(t, o, e.auth.encodeExtraQueryParams, n.extraQueryParameters);
  }
  var tki = __lazy(() => {
    lS();
    PC();
    Tit(); /*! @azure/msal-node v3.8.1 2025-10-29 */
  });
  class ClientApplication {
    constructor(e) {
      this.config = ewi(e);
      this.cryptoProvider = new CryptoProvider();
      this.logger = new Logger(this.config.system.loggerOptions, "@azure/msal-node", "3.8.1");
      this.storage = new H3e(this.logger, this.config.auth.clientId, this.cryptoProvider, h8r(this.config.auth));
      this.tokenCache = new TokenCache_export(this.storage, this.logger, this.config.cache.cachePlugin);
    }
    async getAuthCodeUrl(e) {
      this.logger.info("getAuthCodeUrl called", e.correlationId);
      let t = {
        ...e,
        ...(await this.initializeBaseRequest(e)),
        responseMode: e.responseMode || ResponseMode.QUERY,
        authenticationScheme: Hh.BEARER,
        state: e.state || "",
        nonce: e.nonce || ""
      };
      let n = await this.createAuthority(t.authority, t.correlationId, undefined, e.azureCloudOptions);
      return eki(this.config, n, t, this.logger);
    }
    async acquireTokenByCode(e, t) {
      if (this.logger.info("acquireTokenByCode called"), e.state && t) {
        this.logger.info("acquireTokenByCode - validating state");
        this.validateState(e.state, t.state || "");
        t = {
          ...t,
          state: ""
        };
      }
      let n = {
        ...e,
        ...(await this.initializeBaseRequest(e)),
        authenticationScheme: Hh.BEARER
      };
      let r = this.initializeServerTelemetryManager(Y_e.acquireTokenByCode, n.correlationId);
      try {
        let o = await this.createAuthority(n.authority, n.correlationId, undefined, e.azureCloudOptions);
        let s = await this.buildOauthClientConfiguration(o, n.correlationId, n.redirectUri, r);
        let i = new qkn(s);
        this.logger.verbose("Auth code client created", n.correlationId);
        return await i.acquireToken(n, t);
      } catch (o) {
        if (o instanceof AuthError) {
          o.setCorrelationId(n.correlationId);
        }
        throw r.cacheFailedRequest(o), o;
      }
    }
    async acquireTokenByRefreshToken(e) {
      this.logger.info("acquireTokenByRefreshToken called", e.correlationId);
      let t = {
        ...e,
        ...(await this.initializeBaseRequest(e)),
        authenticationScheme: Hh.BEARER
      };
      let n = this.initializeServerTelemetryManager(Y_e.acquireTokenByRefreshToken, t.correlationId);
      try {
        let r = await this.createAuthority(t.authority, t.correlationId, undefined, e.azureCloudOptions);
        let o = await this.buildOauthClientConfiguration(r, t.correlationId, t.redirectUri || "", n);
        let s = new pit(o);
        this.logger.verbose("Refresh token client created", t.correlationId);
        return await s.acquireToken(t);
      } catch (r) {
        if (r instanceof AuthError) {
          r.setCorrelationId(t.correlationId);
        }
        throw n.cacheFailedRequest(r), r;
      }
    }
    async acquireTokenSilent(e) {
      let t = {
        ...e,
        ...(await this.initializeBaseRequest(e)),
        forceRefresh: e.forceRefresh || false
      };
      let n = this.initializeServerTelemetryManager(Y_e.acquireTokenSilent, t.correlationId, t.forceRefresh);
      try {
        let r = await this.createAuthority(t.authority, t.correlationId, undefined, e.azureCloudOptions);
        let o = await this.buildOauthClientConfiguration(r, t.correlationId, t.redirectUri || "", n);
        let s = new Wkn(o);
        this.logger.verbose("Silent flow client created", t.correlationId);
        try {
          await this.tokenCache.overwriteCache();
          return await this.acquireCachedTokenSilent(t, s, o);
        } catch (i) {
          if (i instanceof ClientAuthError && i.errorCode === ClientAuthErrorCodes.tokenRefreshRequired) {
            return new pit(o).acquireTokenByRefreshToken(t);
          }
          throw i;
        }
      } catch (r) {
        if (r instanceof AuthError) {
          r.setCorrelationId(t.correlationId);
        }
        throw n.cacheFailedRequest(r), r;
      }
    }
    async acquireCachedTokenSilent(e, t, n) {
      let [r, o] = await t.acquireCachedToken({
        ...e,
        scopes: e.scopes?.length ? e.scopes : [...g2]
      });
      if (o === cv.PROACTIVELY_REFRESHED) {
        this.logger.info("ClientApplication:acquireCachedTokenSilent - Cached access token's refreshOn property has been exceeded'. It's not expired, but must be refreshed.");
        let s = new pit(n);
        try {
          await s.acquireTokenByRefreshToken(e);
        } catch {}
      }
      return r;
    }
    async acquireTokenByUsernamePassword(e) {
      this.logger.info("acquireTokenByUsernamePassword called", e.correlationId);
      let t = {
        ...e,
        ...(await this.initializeBaseRequest(e))
      };
      let n = this.initializeServerTelemetryManager(Y_e.acquireTokenByUsernamePassword, t.correlationId);
      try {
        let r = await this.createAuthority(t.authority, t.correlationId, undefined, e.azureCloudOptions);
        let o = await this.buildOauthClientConfiguration(r, t.correlationId, "", n);
        let s = new UsernamePasswordClient(o);
        this.logger.verbose("Username password client created", t.correlationId);
        return await s.acquireToken(t);
      } catch (r) {
        if (r instanceof AuthError) {
          r.setCorrelationId(t.correlationId);
        }
        throw n.cacheFailedRequest(r), r;
      }
    }
    getTokenCache() {
      this.logger.info("getTokenCache called");
      return this.tokenCache;
    }
    validateState(e, t) {
      if (!e) {
        throw nx.createStateNotFoundError();
      }
      if (e !== t) {
        throw rs(ClientAuthErrorCodes.stateMismatch);
      }
    }
    getLogger() {
      return this.logger;
    }
    setLogger(e) {
      this.logger = e;
    }
    async buildOauthClientConfiguration(e, t, n, r) {
      this.logger.verbose("buildOauthClientConfiguration called", t);
      this.logger.info(`Building oauth client configuration with the following authority: ${e.tokenEndpoint}.`, t);
      r?.updateRegionDiscoveryMetadata(e.regionDiscoveryMetadata);
      return {
        authOptions: {
          clientId: this.config.auth.clientId,
          authority: e,
          clientCapabilities: this.config.auth.clientCapabilities,
          redirectUri: n
        },
        loggerOptions: {
          logLevel: this.config.system.loggerOptions.logLevel,
          loggerCallback: this.config.system.loggerOptions.loggerCallback,
          piiLoggingEnabled: this.config.system.loggerOptions.piiLoggingEnabled,
          correlationId: t
        },
        cacheOptions: {
          claimsBasedCachingEnabled: this.config.cache.claimsBasedCachingEnabled
        },
        cryptoInterface: this.cryptoProvider,
        networkInterface: this.config.system.networkClient,
        storageInterface: this.storage,
        serverTelemetryManager: r,
        clientCredentials: {
          clientSecret: this.clientSecret,
          clientAssertion: await this.getClientAssertion(e)
        },
        libraryInfo: {
          sku: Vj.MSAL_SKU,
          version: "3.8.1",
          cpu: "arm64",
          os: "linux"
        },
        telemetry: this.config.telemetry,
        persistencePlugin: this.config.cache.cachePlugin,
        serializableCache: this.tokenCache
      };
    }
    async getClientAssertion(e) {
      if (this.developerProvidedClientAssertion) {
        this.clientAssertion = ClientAssertion.fromAssertion(await Gj(this.developerProvidedClientAssertion, this.config.auth.clientId, e.tokenEndpoint));
      }
      return this.clientAssertion && {
        assertion: this.clientAssertion.getJwt(this.cryptoProvider, this.config.auth.clientId, e.tokenEndpoint),
        assertionType: Vj.JWT_BEARER_ASSERTION_TYPE
      };
    }
    async initializeBaseRequest(e) {
      if (this.logger.verbose("initializeRequestScopes called", e.correlationId), e.authenticationScheme && e.authenticationScheme === Hh.POP) {
        this.logger.verbose("Authentication Scheme 'pop' is not supported yet, setting Authentication Scheme to 'Bearer' for request", e.correlationId);
      }
      if (e.authenticationScheme = Hh.BEARER, this.config.cache.claimsBasedCachingEnabled && e.claims && !uv.isEmptyObj(e.claims)) {
        e.requestedClaimsHash = await this.cryptoProvider.hashString(e.claims);
      }
      return {
        ...e,
        scopes: [...(e && e.scopes || []), ...g2],
        correlationId: e && e.correlationId || this.cryptoProvider.createNewGuid(),
        authority: e.authority || this.config.auth.authority
      };
    }
    initializeServerTelemetryManager(e, t, n) {
      let r = {
        clientId: this.config.auth.clientId,
        correlationId: t,
        apiId: e,
        forceRefresh: n || false
      };
      return new K0e(r, this.storage);
    }
    async createAuthority(e, t, n, r) {
      this.logger.verbose("createAuthority called", t);
      let o = eM.generateAuthority(e, r || this.config.auth.azureCloudOptions);
      let s = {
        protocolMode: this.config.auth.protocolMode,
        knownAuthorities: this.config.auth.knownAuthorities,
        cloudDiscoveryMetadata: this.config.auth.cloudDiscoveryMetadata,
        authorityMetadata: this.config.auth.authorityMetadata,
        azureRegionConfiguration: n,
        skipAuthorityMetadataCache: this.config.auth.skipAuthorityMetadataCache
      };
      return Pkn.createDiscoveredInstance(o, this.config.system.networkClient, this.storage, s, this.logger, t);
    }
    clearCache() {
      this.storage.clear();
    }
  }
  var $An = __lazy(() => {
    lS();
    P8r();
    HUt();
    cAn();
    PC();
    W8r();
    UAn();
    Tit();
    UUt();
    AVr();
    tki(); /*! @azure/msal-node v3.8.1 2025-10-29 */
  });
  class IVr {
    async listenForAuthCode(e, t) {
      if (this.server) {
        throw nx.createLoopbackServerAlreadyExistsError();
      }
      return new Promise((n, r) => {
        this.server = nki.default.createServer((o, s) => {
          let i = o.url;
          if (!i) {
            s.end(t || "Error occurred loading redirectUrl");
            r(nx.createUnableToLoadRedirectUrlError());
            return;
          } else if (i === xo.FORWARD_SLASH) {
            s.end(e || "Auth code was successfully acquired. You can close this window now.");
            return;
          }
          let a = this.getRedirectUri();
          let l = new URL(i, a);
          let c = MF.getDeserializedResponse(l.search) || {};
          if (c.code) {
            s.writeHead(Wp.REDIRECT, {
              location: a
            });
            s.end();
          }
          if (c.error) {
            s.end(t || `Error occurred: ${c.error}`);
          }
          n(c);
        });
        this.server.listen(0, "127.0.0.1");
      });
    }
    getRedirectUri() {
      if (!this.server || !this.server.listening) {
        throw nx.createNoLoopbackServerExistsError();
      }
      let e = this.server.address();
      if (!e || typeof e === "string" || !e.port) {
        throw this.closeServer(), nx.createInvalidLoopbackAddressTypeError();
      }
      let t = e && e.port;
      return `${Vj.HTTP_PROTOCOL}${Vj.LOCALHOST}:${t}`;
    }
    closeServer() {
      if (this.server) {
        if (this.server.close(), typeof this.server.closeAllConnections === "function") {
          this.server.closeAllConnections();
        }
        this.server.unref();
        this.server = undefined;
      }
    }
  }
  var nki;
  var rki = __lazy(() => {
    lS();
    UUt();
    PC();
    nki = __toESM(require("http")); /*! @azure/msal-node v3.8.1 2025-10-29 */
  });
  var DeviceCodeClient;
  var PVr = __lazy(() => {
    lS(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    DeviceCodeClient = class rBt extends _2 {
      constructor(e) {
        super(e);
      }
      async acquireToken(e) {
        let t = await this.getDeviceCode(e);
        e.deviceCodeCallback(t);
        let n = AC.nowSeconds();
        let r = await this.acquireTokenWithDeviceCode(e, t);
        let o = new XA(this.config.authOptions.clientId, this.cacheManager, this.cryptoUtils, this.logger, this.config.serializableCache, this.config.persistencePlugin);
        o.validateTokenResponse(r);
        return o.handleServerTokenResponse(r, this.authority, n, e);
      }
      async getDeviceCode(e) {
        let t = this.createExtraQueryParameters(e);
        let n = bm.appendQueryString(this.authority.deviceCodeEndpoint, t);
        let r = this.createQueryString(e);
        let o = this.createTokenRequestHeaders();
        let s = {
          clientId: this.config.authOptions.clientId,
          authority: e.authority,
          scopes: e.scopes,
          claims: e.claims,
          authenticationScheme: e.authenticationScheme,
          resourceRequestMethod: e.resourceRequestMethod,
          resourceRequestUri: e.resourceRequestUri,
          shrClaims: e.shrClaims,
          sshKid: e.sshKid
        };
        return this.executePostRequestToDeviceCodeEndpoint(n, r, o, s, e.correlationId);
      }
      createExtraQueryParameters(e) {
        let t = new Map();
        if (e.extraQueryParameters) {
          Ya.addExtraQueryParameters(t, e.extraQueryParameters);
        }
        return MF.mapToQueryString(t);
      }
      async executePostRequestToDeviceCodeEndpoint(e, t, n, r, o) {
        let {
          body: {
            user_code: s,
            device_code: i,
            verification_uri: a,
            expires_in: l,
            interval: c,
            message: u
          }
        } = await this.sendPostRequest(r, e, {
          body: t,
          headers: n
        }, o);
        return {
          userCode: s,
          deviceCode: i,
          verificationUri: a,
          expiresIn: l,
          interval: c,
          message: u
        };
      }
      createQueryString(e) {
        let t = new Map();
        if (Ya.addScopes(t, e.scopes), Ya.addClientId(t, this.config.authOptions.clientId), e.extraQueryParameters) {
          Ya.addExtraQueryParameters(t, e.extraQueryParameters);
        }
        if (e.claims || this.config.authOptions.clientCapabilities && this.config.authOptions.clientCapabilities.length > 0) {
          Ya.addClaims(t, e.claims, this.config.authOptions.clientCapabilities);
        }
        return MF.mapToQueryString(t);
      }
      continuePolling(e, t, n) {
        if (n) {
          throw this.logger.error("Token request cancelled by setting DeviceCodeRequest.cancel = true"), rs(ClientAuthErrorCodes.deviceCodePollingCancelled);
        } else if (t && t < e && AC.nowSeconds() > t) {
          throw this.logger.error(`User defined timeout for device code polling reached. The timeout was set for ${t}`), rs(ClientAuthErrorCodes.userTimeoutReached);
        } else if (AC.nowSeconds() > e) {
          if (t) {
            this.logger.verbose(`User specified timeout ignored as the device code has expired before the timeout elapsed. The user specified timeout was set for ${t}`);
          }
          throw this.logger.error(`Device code expired. Expiration time of device code was ${e}`), rs(ClientAuthErrorCodes.deviceCodeExpired);
        }
        return true;
      }
      async acquireTokenWithDeviceCode(e, t) {
        let n = this.createTokenQueryParameters(e);
        let r = bm.appendQueryString(this.authority.tokenEndpoint, n);
        let o = this.createTokenRequestBody(e, t);
        let s = this.createTokenRequestHeaders();
        let i = e.timeout ? AC.nowSeconds() + e.timeout : undefined;
        let a = AC.nowSeconds() + t.expiresIn;
        let l = t.interval * 1000;
        while (this.continuePolling(a, i, e.cancel)) {
          let c = {
            clientId: this.config.authOptions.clientId,
            authority: e.authority,
            scopes: e.scopes,
            claims: e.claims,
            authenticationScheme: e.authenticationScheme,
            resourceRequestMethod: e.resourceRequestMethod,
            resourceRequestUri: e.resourceRequestUri,
            shrClaims: e.shrClaims,
            sshKid: e.sshKid
          };
          let u = await this.executePostToTokenEndpoint(r, o, s, c, e.correlationId);
          if (u.body && u.body.error) {
            if (u.body.error === xo.AUTHORIZATION_PENDING) {
              this.logger.info("Authorization pending. Continue polling.");
              await AC.delay(l);
            } else {
              throw this.logger.info("Unexpected error in polling from the server"), e6r(AuthErrorCodes.postRequestFailed, u.body.error);
            }
          } else {
            this.logger.verbose("Authorization completed successfully. Polling stopped.");
            return u.body;
          }
        }
        throw this.logger.error("Polling stopped for unknown reasons."), rs(ClientAuthErrorCodes.deviceCodeUnknownError);
      }
      createTokenRequestBody(e, t) {
        let n = new Map();
        Ya.addScopes(n, e.scopes);
        Ya.addClientId(n, this.config.authOptions.clientId);
        Ya.addGrantType(n, FW.DEVICE_CODE_GRANT);
        Ya.addDeviceCode(n, t.deviceCode);
        let r = e.correlationId || this.config.cryptoInterface.createNewGuid();
        if (Ya.addCorrelationId(n, r), Ya.addClientInfo(n), Ya.addLibraryInfo(n, this.config.libraryInfo), Ya.addApplicationTelemetry(n, this.config.telemetry.application), Ya.addThrottling(n), this.serverTelemetryManager) {
          Ya.addServerTelemetry(n, this.serverTelemetryManager);
        }
        if (!uv.isEmptyObj(e.claims) || this.config.authOptions.clientCapabilities && this.config.authOptions.clientCapabilities.length > 0) {
          Ya.addClaims(n, e.claims, this.config.authOptions.clientCapabilities);
        }
        return MF.mapToQueryString(n);
      }
    };
  });
  var PublicClientApplication;
  var oki = __lazy(() => {
    PC();
    lS();
    $An();
    UUt();
    rki();
    PVr();
    Tit(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    PublicClientApplication = class oBt extends ClientApplication {
      constructor(e) {
        super(e);
        if (this.config.broker.nativeBrokerPlugin) {
          if (this.config.broker.nativeBrokerPlugin.isBrokerAvailable) {
            this.nativeBrokerPlugin = this.config.broker.nativeBrokerPlugin;
            this.nativeBrokerPlugin.setLogger(this.config.system.loggerOptions);
          } else {
            this.logger.warning("NativeBroker implementation was provided but the broker is unavailable.");
          }
        }
        this.skus = K0e.makeExtraSkuString({
          libraryName: Vj.MSAL_SKU,
          libraryVersion: "3.8.1"
        });
      }
      async acquireTokenByDeviceCode(e) {
        this.logger.info("acquireTokenByDeviceCode called", e.correlationId);
        let t = Object.assign(e, await this.initializeBaseRequest(e));
        let n = this.initializeServerTelemetryManager(Y_e.acquireTokenByDeviceCode, t.correlationId);
        try {
          let r = await this.createAuthority(t.authority, t.correlationId, undefined, e.azureCloudOptions);
          let o = await this.buildOauthClientConfiguration(r, t.correlationId, "", n);
          let s = new DeviceCodeClient(o);
          this.logger.verbose("Device code client created", t.correlationId);
          return await s.acquireToken(t);
        } catch (r) {
          if (r instanceof AuthError) {
            r.setCorrelationId(t.correlationId);
          }
          throw n.cacheFailedRequest(r), r;
        }
      }
      async acquireTokenInteractive(e) {
        let t = e.correlationId || this.cryptoProvider.createNewGuid();
        this.logger.trace("acquireTokenInteractive called", t);
        let {
          openBrowser: n,
          successTemplate: r,
          errorTemplate: o,
          windowHandle: s,
          loopbackClient: i,
          ...a
        } = e;
        if (this.nativeBrokerPlugin) {
          let m = {
            ...a,
            clientId: this.config.auth.clientId,
            scopes: e.scopes || g2,
            redirectUri: e.redirectUri || "",
            authority: e.authority || this.config.auth.authority,
            correlationId: t,
            extraParameters: {
              ...a.extraQueryParameters,
              ...a.tokenQueryParameters,
              [A3e.X_CLIENT_EXTRA_SKU]: this.skus
            },
            accountId: a.account?.nativeAccountId
          };
          return this.nativeBrokerPlugin.acquireTokenInteractive(m, s);
        }
        if (e.redirectUri) {
          if (!this.config.broker.nativeBrokerPlugin) {
            throw nx.createRedirectUriNotSupportedError();
          }
          e.redirectUri = "";
        }
        let {
          verifier: l,
          challenge: c
        } = await this.cryptoProvider.generatePkceCodes();
        let u = i || new IVr();
        let d = {};
        let p = null;
        try {
          let m = u.listenForAuthCode(r, o).then(b => {
            d = b;
          }).catch(b => {
            p = b;
          });
          let f = await this.waitForRedirectUri(u);
          let h = {
            ...a,
            correlationId: t,
            scopes: e.scopes || g2,
            redirectUri: f,
            responseMode: ResponseMode.QUERY,
            codeChallenge: c,
            codeChallengeMethod: rkn.S256
          };
          let g = await this.getAuthCodeUrl(h);
          if (await n(g), await m, p) {
            throw p;
          }
          if (d.error) {
            throw new ServerError(d.error, d.error_description, d.suberror);
          } else if (!d.code) {
            throw nx.createNoAuthCodeInResponseError();
          }
          let y = d.client_info;
          let _ = {
            code: d.code,
            codeVerifier: l,
            clientInfo: y || xo.EMPTY_STRING,
            ...h
          };
          return await this.acquireTokenByCode(_);
        } finally {
          u.closeServer();
        }
      }
      async acquireTokenSilent(e) {
        let t = e.correlationId || this.cryptoProvider.createNewGuid();
        if (this.logger.trace("acquireTokenSilent called", t), this.nativeBrokerPlugin) {
          let n = {
            ...e,
            clientId: this.config.auth.clientId,
            scopes: e.scopes || g2,
            redirectUri: e.redirectUri || "",
            authority: e.authority || this.config.auth.authority,
            correlationId: t,
            extraParameters: {
              ...e.tokenQueryParameters,
              [A3e.X_CLIENT_EXTRA_SKU]: this.skus
            },
            accountId: e.account.nativeAccountId,
            forceRefresh: e.forceRefresh || false
          };
          return this.nativeBrokerPlugin.acquireTokenSilent(n);
        }
        if (e.redirectUri) {
          if (!this.config.broker.nativeBrokerPlugin) {
            throw nx.createRedirectUriNotSupportedError();
          }
          e.redirectUri = "";
        }
        return super.acquireTokenSilent(e);
      }
      async signOut(e) {
        if (this.nativeBrokerPlugin && e.account.nativeAccountId) {
          let t = {
            clientId: this.config.auth.clientId,
            accountId: e.account.nativeAccountId,
            correlationId: e.correlationId || this.cryptoProvider.createNewGuid()
          };
          await this.nativeBrokerPlugin.signOut(t);
        }
        await this.getTokenCache().removeAccount(e.account, e.correlationId);
      }
      async getAllAccounts() {
        if (this.nativeBrokerPlugin) {
          let e = this.cryptoProvider.createNewGuid();
          return this.nativeBrokerPlugin.getAllAccounts(this.config.auth.clientId, e);
        }
        return this.getTokenCache().getAllAccounts();
      }
      async waitForRedirectUri(e) {
        return new Promise((t, n) => {
          let r = 0;
          let o = setInterval(() => {
            if (Kkn.TIMEOUT_MS / Kkn.INTERVAL_MS < r) {
              clearInterval(o);
              n(nx.createLoopbackServerTimeoutError());
              return;
            }
            try {
              let s = e.getRedirectUri();
              clearInterval(o);
              t(s);
              return;
            } catch (s) {
              if (s instanceof AuthError && s.errorCode === QP.noLoopbackServerExists.code) {
                r++;
                return;
              }
              clearInterval(o);
              n(s);
              return;
            }
          }, Kkn.INTERVAL_MS);
        });
      }
    };
  });
  var ClientCredentialClient;
  var HAn = __lazy(() => {
    lS(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    ClientCredentialClient = class G3e extends _2 {
      constructor(e, t) {
        super(e);
        this.appTokenProvider = t;
      }
      async acquireToken(e) {
        if (e.skipCache || e.claims) {
          return this.executeTokenRequest(e, this.authority);
        }
        let [t, n] = await this.getCachedAuthenticationResult(e, this.config, this.cryptoUtils, this.authority, this.cacheManager, this.serverTelemetryManager);
        if (t) {
          if (n === cv.PROACTIVELY_REFRESHED) {
            this.logger.info("ClientCredentialClient:getCachedAuthenticationResult - Cached access token's refreshOn property has been exceeded'. It's not expired, but must be refreshed.");
            let r = true;
            await this.executeTokenRequest(e, this.authority, r);
          }
          return t;
        } else {
          return this.executeTokenRequest(e, this.authority);
        }
      }
      async getCachedAuthenticationResult(e, t, n, r, o, s) {
        let i = t;
        let a = t;
        let l = cv.NOT_APPLICABLE;
        let c;
        if (i.serializableCache && i.persistencePlugin) {
          c = new TokenCacheContext(i.serializableCache, false);
          await i.persistencePlugin.beforeCacheAccess(c);
        }
        let u = this.readAccessTokenFromCache(r, a.managedIdentityId?.id || i.authOptions.clientId, new JA(e.scopes || []), o, e.correlationId);
        if (i.serializableCache && i.persistencePlugin && c) {
          await i.persistencePlugin.afterCacheAccess(c);
        }
        if (!u) {
          s?.setCacheOutcome(cv.NO_CACHED_ACCESS_TOKEN);
          return [null, cv.NO_CACHED_ACCESS_TOKEN];
        }
        if (AC.isTokenExpired(u.expiresOn, i.systemOptions?.tokenRenewalOffsetSeconds || 300)) {
          s?.setCacheOutcome(cv.CACHED_ACCESS_TOKEN_EXPIRED);
          return [null, cv.CACHED_ACCESS_TOKEN_EXPIRED];
        }
        if (u.refreshOn && AC.isTokenExpired(u.refreshOn.toString(), 0)) {
          l = cv.PROACTIVELY_REFRESHED;
          s?.setCacheOutcome(cv.PROACTIVELY_REFRESHED);
        }
        return [await XA.generateAuthenticationResult(n, r, {
          account: null,
          idToken: null,
          accessToken: u,
          refreshToken: null,
          appMetadata: null
        }, true, e), l];
      }
      readAccessTokenFromCache(e, t, n, r, o) {
        let s = {
          homeAccountId: xo.EMPTY_STRING,
          environment: e.canonicalAuthorityUrlComponents.HostNameAndPort,
          credentialType: aS.ACCESS_TOKEN,
          clientId: t,
          realm: e.tenant,
          target: JA.createSearchScopes(n.asArray())
        };
        let i = r.getAccessTokensByFilter(s, o);
        if (i.length < 1) {
          return null;
        } else if (i.length > 1) {
          throw rs(ClientAuthErrorCodes.multipleMatchingTokens);
        }
        return i[0];
      }
      async executeTokenRequest(e, t, n) {
        let r;
        let o;
        if (this.appTokenProvider) {
          this.logger.info("Using appTokenProvider extensibility.");
          let a = {
            correlationId: e.correlationId,
            tenantId: this.config.authOptions.authority.tenant,
            scopes: e.scopes,
            claims: e.claims
          };
          o = AC.nowSeconds();
          let l = await this.appTokenProvider(a);
          r = {
            access_token: l.accessToken,
            expires_in: l.expiresInSeconds,
            refresh_in: l.refreshInSeconds,
            token_type: Hh.BEARER
          };
        } else {
          let a = this.createTokenQueryParameters(e);
          let l = bm.appendQueryString(t.tokenEndpoint, a);
          let c = await this.createTokenRequestBody(e);
          let u = this.createTokenRequestHeaders();
          let d = {
            clientId: this.config.authOptions.clientId,
            authority: e.authority,
            scopes: e.scopes,
            claims: e.claims,
            authenticationScheme: e.authenticationScheme,
            resourceRequestMethod: e.resourceRequestMethod,
            resourceRequestUri: e.resourceRequestUri,
            shrClaims: e.shrClaims,
            sshKid: e.sshKid
          };
          this.logger.info("Sending token request to endpoint: " + t.tokenEndpoint);
          o = AC.nowSeconds();
          let p = await this.executePostToTokenEndpoint(l, c, u, d, e.correlationId);
          r = p.body;
          r.status = p.status;
        }
        let s = new XA(this.config.authOptions.clientId, this.cacheManager, this.cryptoUtils, this.logger, this.config.serializableCache, this.config.persistencePlugin);
        s.validateTokenResponse(r, n);
        return await s.handleServerTokenResponse(r, this.authority, o, e);
      }
      async createTokenRequestBody(e) {
        let t = new Map();
        if (Ya.addClientId(t, this.config.authOptions.clientId), Ya.addScopes(t, e.scopes, false), Ya.addGrantType(t, FW.CLIENT_CREDENTIALS_GRANT), Ya.addLibraryInfo(t, this.config.libraryInfo), Ya.addApplicationTelemetry(t, this.config.telemetry.application), Ya.addThrottling(t), this.serverTelemetryManager) {
          Ya.addServerTelemetry(t, this.serverTelemetryManager);
        }
        let n = e.correlationId || this.config.cryptoInterface.createNewGuid();
        if (Ya.addCorrelationId(t, n), this.config.clientCredentials.clientSecret) {
          Ya.addClientSecret(t, this.config.clientCredentials.clientSecret);
        }
        let r = e.clientAssertion || this.config.clientCredentials.clientAssertion;
        if (r) {
          Ya.addClientAssertion(t, await Gj(r.assertion, this.config.authOptions.clientId, e.resourceRequestUri));
          Ya.addClientAssertionType(t, r.assertionType);
        }
        if (!uv.isEmptyObj(e.claims) || this.config.authOptions.clientCapabilities && this.config.authOptions.clientCapabilities.length > 0) {
          Ya.addClaims(t, e.claims, this.config.authOptions.clientCapabilities);
        }
        return MF.mapToQueryString(t);
      }
    };
  });
  var OnBehalfOfClient;
  var OVr = __lazy(() => {
    lS();
    $Ut(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    OnBehalfOfClient = class sBt extends _2 {
      constructor(e) {
        super(e);
      }
      async acquireToken(e) {
        if (this.scopeSet = new JA(e.scopes || []), this.userAssertionHash = await this.cryptoUtils.hashString(e.oboAssertion), e.skipCache || e.claims) {
          return this.executeTokenRequest(e, this.authority, this.userAssertionHash);
        }
        try {
          return await this.getCachedAuthenticationResult(e);
        } catch (t) {
          return await this.executeTokenRequest(e, this.authority, this.userAssertionHash);
        }
      }
      async getCachedAuthenticationResult(e) {
        let t = this.readAccessTokenFromCacheForOBO(this.config.authOptions.clientId, e);
        if (!t) {
          throw this.serverTelemetryManager?.setCacheOutcome(cv.NO_CACHED_ACCESS_TOKEN), this.logger.info("SilentFlowClient:acquireCachedToken - No access token found in cache for the given properties."), rs(ClientAuthErrorCodes.tokenRefreshRequired);
        } else if (AC.isTokenExpired(t.expiresOn, this.config.systemOptions.tokenRenewalOffsetSeconds)) {
          throw this.serverTelemetryManager?.setCacheOutcome(cv.CACHED_ACCESS_TOKEN_EXPIRED), this.logger.info(`OnbehalfofFlow:getCachedAuthenticationResult - Cached access token is expired or will expire within ${this.config.systemOptions.tokenRenewalOffsetSeconds} seconds.`), rs(ClientAuthErrorCodes.tokenRefreshRequired);
        }
        let n = this.readIdTokenFromCacheForOBO(t.homeAccountId, e.correlationId);
        let r;
        let o = null;
        if (n) {
          r = fkn.extractTokenClaims(n.secret, $W.base64Decode);
          let s = r.oid || r.sub;
          let i = {
            homeAccountId: n.homeAccountId,
            environment: n.environment,
            tenantId: n.realm,
            username: xo.EMPTY_STRING,
            localAccountId: s || xo.EMPTY_STRING
          };
          o = this.cacheManager.getAccount(this.cacheManager.generateAccountKey(i), e.correlationId);
        }
        if (this.config.serverTelemetryManager) {
          this.config.serverTelemetryManager.incrementCacheHits();
        }
        return XA.generateAuthenticationResult(this.cryptoUtils, this.authority, {
          account: o,
          accessToken: t,
          idToken: n,
          refreshToken: null,
          appMetadata: null
        }, true, e, r);
      }
      readIdTokenFromCacheForOBO(e, t) {
        let n = {
          homeAccountId: e,
          environment: this.authority.canonicalAuthorityUrlComponents.HostNameAndPort,
          credentialType: aS.ID_TOKEN,
          clientId: this.config.authOptions.clientId,
          realm: this.authority.tenant
        };
        let r = this.cacheManager.getIdTokensByFilter(n, t);
        if (Object.values(r).length < 1) {
          return null;
        }
        return Object.values(r)[0];
      }
      readAccessTokenFromCacheForOBO(e, t) {
        let n = t.authenticationScheme || Hh.BEARER;
        let o = {
          credentialType: n && n.toLowerCase() !== Hh.BEARER.toLowerCase() ? aS.ACCESS_TOKEN_WITH_AUTH_SCHEME : aS.ACCESS_TOKEN,
          clientId: e,
          target: JA.createSearchScopes(this.scopeSet.asArray()),
          tokenType: n,
          keyId: t.sshKid,
          requestedClaimsHash: t.requestedClaimsHash,
          userAssertionHash: this.userAssertionHash
        };
        let s = this.cacheManager.getAccessTokensByFilter(o, t.correlationId);
        let i = s.length;
        if (i < 1) {
          return null;
        } else if (i > 1) {
          throw rs(ClientAuthErrorCodes.multipleMatchingTokens);
        }
        return s[0];
      }
      async executeTokenRequest(e, t, n) {
        let r = this.createTokenQueryParameters(e);
        let o = bm.appendQueryString(t.tokenEndpoint, r);
        let s = await this.createTokenRequestBody(e);
        let i = this.createTokenRequestHeaders();
        let a = {
          clientId: this.config.authOptions.clientId,
          authority: e.authority,
          scopes: e.scopes,
          claims: e.claims,
          authenticationScheme: e.authenticationScheme,
          resourceRequestMethod: e.resourceRequestMethod,
          resourceRequestUri: e.resourceRequestUri,
          shrClaims: e.shrClaims,
          sshKid: e.sshKid
        };
        let l = AC.nowSeconds();
        let c = await this.executePostToTokenEndpoint(o, s, i, a, e.correlationId);
        let u = new XA(this.config.authOptions.clientId, this.cacheManager, this.cryptoUtils, this.logger, this.config.serializableCache, this.config.persistencePlugin);
        u.validateTokenResponse(c.body);
        return await u.handleServerTokenResponse(c.body, this.authority, l, e, undefined, n);
      }
      async createTokenRequestBody(e) {
        let t = new Map();
        if (Ya.addClientId(t, this.config.authOptions.clientId), Ya.addScopes(t, e.scopes), Ya.addGrantType(t, FW.JWT_BEARER), Ya.addClientInfo(t), Ya.addLibraryInfo(t, this.config.libraryInfo), Ya.addApplicationTelemetry(t, this.config.telemetry.application), Ya.addThrottling(t), this.serverTelemetryManager) {
          Ya.addServerTelemetry(t, this.serverTelemetryManager);
        }
        let n = e.correlationId || this.config.cryptoInterface.createNewGuid();
        if (Ya.addCorrelationId(t, n), Ya.addRequestTokenUse(t, A3e.ON_BEHALF_OF), Ya.addOboAssertion(t, e.oboAssertion), this.config.clientCredentials.clientSecret) {
          Ya.addClientSecret(t, this.config.clientCredentials.clientSecret);
        }
        let r = this.config.clientCredentials.clientAssertion;
        if (r) {
          Ya.addClientAssertion(t, await Gj(r.assertion, this.config.authOptions.clientId, e.resourceRequestUri));
          Ya.addClientAssertionType(t, r.assertionType);
        }
        if (e.claims || this.config.authOptions.clientCapabilities && this.config.authOptions.clientCapabilities.length > 0) {
          Ya.addClaims(t, e.claims, this.config.authOptions.clientCapabilities);
        }
        return MF.mapToQueryString(t);
      }
    };
  });
  var ConfidentialClientApplication;
  var ski = __lazy(() => {
    $An();
    UAn();
    PC();
    lS();
    HAn();
    OVr(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    ConfidentialClientApplication = class iBt extends ClientApplication {
      constructor(e) {
        super(e);
        let t = !!this.config.auth.clientSecret;
        let n = !!this.config.auth.clientAssertion;
        let r = (!!this.config.auth.clientCertificate?.thumbprint || !!this.config.auth.clientCertificate?.thumbprintSha256) && !!this.config.auth.clientCertificate?.privateKey;
        if (this.appTokenProvider) {
          return;
        }
        if (t && n || n && r || t && r) {
          throw rs(ClientAuthErrorCodes.invalidClientCredential);
        }
        if (this.config.auth.clientSecret) {
          this.clientSecret = this.config.auth.clientSecret;
          return;
        }
        if (this.config.auth.clientAssertion) {
          this.developerProvidedClientAssertion = this.config.auth.clientAssertion;
          return;
        }
        if (!r) {
          throw rs(ClientAuthErrorCodes.invalidClientCredential);
        } else {
          this.clientAssertion = this.config.auth.clientCertificate.thumbprintSha256 ? ClientAssertion.fromCertificateWithSha256Thumbprint(this.config.auth.clientCertificate.thumbprintSha256, this.config.auth.clientCertificate.privateKey, this.config.auth.clientCertificate.x5c) : ClientAssertion.fromCertificate(this.config.auth.clientCertificate.thumbprint, this.config.auth.clientCertificate.privateKey, this.config.auth.clientCertificate.x5c);
        }
        this.appTokenProvider = undefined;
      }
      SetAppTokenProvider(e) {
        this.appTokenProvider = e;
      }
      async acquireTokenByClientCredential(e) {
        this.logger.info("acquireTokenByClientCredential called", e.correlationId);
        let t;
        if (e.clientAssertion) {
          t = {
            assertion: await Gj(e.clientAssertion, this.config.auth.clientId),
            assertionType: Vj.JWT_BEARER_ASSERTION_TYPE
          };
        }
        let n = await this.initializeBaseRequest(e);
        let r = {
          ...n,
          scopes: n.scopes.filter(d => !g2.includes(d))
        };
        let o = {
          ...e,
          ...r,
          clientAssertion: t
        };
        let i = new bm(o.authority).getUrlComponents().PathSegments[0];
        if (Object.values(LW).includes(i)) {
          throw rs(ClientAuthErrorCodes.missingTenantIdError);
        }
        let a = process.env["MSAL_FORCE_REGION"];
        let l;
        if (o.azureRegion !== "DisableMsalForceRegion") {
          if (!o.azureRegion && a) {
            l = a;
          } else {
            l = o.azureRegion;
          }
        }
        let c = {
          azureRegion: l,
          environmentRegion: process.env["REGION_NAME"]
        };
        let u = this.initializeServerTelemetryManager(Y_e.acquireTokenByClientCredential, o.correlationId, o.skipCache);
        try {
          let d = await this.createAuthority(o.authority, o.correlationId, c, e.azureCloudOptions);
          let p = await this.buildOauthClientConfiguration(d, o.correlationId, "", u);
          let m = new ClientCredentialClient(p, this.appTokenProvider);
          this.logger.verbose("Client credential client created", o.correlationId);
          return await m.acquireToken(o);
        } catch (d) {
          if (d instanceof AuthError) {
            d.setCorrelationId(o.correlationId);
          }
          throw u.cacheFailedRequest(d), d;
        }
      }
      async acquireTokenOnBehalfOf(e) {
        this.logger.info("acquireTokenOnBehalfOf called", e.correlationId);
        let t = {
          ...e,
          ...(await this.initializeBaseRequest(e))
        };
        try {
          let n = await this.createAuthority(t.authority, t.correlationId, undefined, e.azureCloudOptions);
          let r = await this.buildOauthClientConfiguration(n, t.correlationId, "", undefined);
          let o = new OnBehalfOfClient(r);
          this.logger.verbose("On behalf of client created", t.correlationId);
          return await o.acquireToken(t);
        } catch (n) {
          if (n instanceof AuthError) {
            n.setCorrelationId(t.correlationId);
          }
          throw n;
        }
      }
    };
  });
  function iki(e) {
    if (typeof e !== "string") {
      return false;
    }
    let t = new Date(e);
    return !isNaN(t.getTime()) && t.toISOString() === e;
  }
  var aki = __lazy(() => {/*! @azure/msal-node v3.8.1 2025-10-29 */});
  class DVr {
    constructor(e, t, n) {
      this.httpClientNoRetries = e;
      this.retryPolicy = t;
      this.logger = n;
    }
    async sendNetworkRequestAsyncHelper(e, t, n) {
      if (e === IC.GET) {
        return this.httpClientNoRetries.sendGetRequestAsync(t, n);
      } else {
        return this.httpClientNoRetries.sendPostRequestAsync(t, n);
      }
    }
    async sendNetworkRequestAsync(e, t, n) {
      let r = await this.sendNetworkRequestAsyncHelper(e, t, n);
      if ("isNewRequest" in this.retryPolicy) {
        this.retryPolicy.isNewRequest = true;
      }
      let o = 0;
      while (await this.retryPolicy.pauseForRetry(r.status, o, this.logger, r.headers[iw.RETRY_AFTER])) {
        r = await this.sendNetworkRequestAsyncHelper(e, t, n);
        o++;
      }
      return r;
    }
    async sendGetRequestAsync(e, t) {
      return this.sendNetworkRequestAsync(IC.GET, e, t);
    }
    async sendPostRequestAsync(e, t) {
      return this.sendNetworkRequestAsync(IC.POST, e, t);
    }
  }
  var lki = __lazy(() => {
    lS();
    PC(); /*! @azure/msal-node v3.8.1 2025-10-29 */
  });
  class jW {
    constructor(e, t, n, r, o) {
      this.logger = e;
      this.nodeStorage = t;
      this.networkClient = n;
      this.cryptoProvider = r;
      this.disableInternalRetries = o;
    }
    async getServerTokenResponseAsync(e, t, n, r) {
      return this.getServerTokenResponse(e);
    }
    getServerTokenResponse(e) {
      let t;
      let n;
      if (e.body.expires_on) {
        if (iki(e.body.expires_on)) {
          e.body.expires_on = new Date(e.body.expires_on).getTime() / 1000;
        }
        if (n = e.body.expires_on - AC.nowSeconds(), n > 7200) {
          t = n / 2;
        }
      }
      return {
        status: e.status,
        access_token: e.body.access_token,
        expires_in: n,
        scope: e.body.resource,
        token_type: e.body.token_type,
        refresh_in: t,
        correlation_id: e.body.correlation_id || e.body.correlationId,
        error: typeof e.body.error === "string" ? e.body.error : e.body.error?.code,
        error_description: e.body.message || (typeof e.body.error === "string" ? e.body.error_description : e.body.error?.message),
        error_codes: e.body.error_codes,
        timestamp: e.body.timestamp,
        trace_id: e.body.trace_id
      };
    }
    async acquireTokenWithManagedIdentity(e, t, n, r) {
      let o = this.createRequest(e.resource, t);
      if (e.revokedTokenSha256Hash) {
        this.logger.info(`[Managed Identity] The following claims are present in the request: ${e.claims}`);
        o.queryParameters[XP.SHA256_TOKEN_TO_REFRESH] = e.revokedTokenSha256Hash;
      }
      if (e.clientCapabilities?.length) {
        let p = e.clientCapabilities.toString();
        this.logger.info(`[Managed Identity] The following client capabilities are present in the request: ${p}`);
        o.queryParameters[XP.XMS_CC] = p;
      }
      let s = o.headers;
      s[iw.CONTENT_TYPE] = xo.URL_FORM_CONTENT_TYPE;
      let i = {
        headers: s
      };
      if (Object.keys(o.bodyParameters).length) {
        i.body = o.computeParametersBodyString();
      }
      let a = this.disableInternalRetries ? this.networkClient : new DVr(this.networkClient, o.retryPolicy, this.logger);
      let l = AC.nowSeconds();
      let c;
      try {
        if (o.httpMethod === IC.POST) {
          c = await a.sendPostRequestAsync(o.computeUri(), i);
        } else {
          c = await a.sendGetRequestAsync(o.computeUri(), i);
        }
      } catch (p) {
        if (p instanceof AuthError) {
          throw p;
        } else {
          throw rs(ClientAuthErrorCodes.networkError);
        }
      }
      let u = new XA(t.id, this.nodeStorage, this.cryptoProvider, this.logger, null, null);
      let d = await this.getServerTokenResponseAsync(c, a, o, i);
      u.validateTokenResponse(d, r);
      return u.handleServerTokenResponse(d, n, l, e);
    }
    getManagedIdentityUserAssignedIdQueryParameterKey(e, t, n) {
      switch (e) {
        case Ok.USER_ASSIGNED_CLIENT_ID:
          this.logger.info(`[Managed Identity] [API version ${n ? "2017+" : "2019+"}] Adding user assigned client id to the request.`);
          return n ? V3e.MANAGED_IDENTITY_CLIENT_ID_2017 : V3e.MANAGED_IDENTITY_CLIENT_ID;
        case Ok.USER_ASSIGNED_RESOURCE_ID:
          this.logger.info("[Managed Identity] Adding user assigned resource id to the request.");
          return t ? V3e.MANAGED_IDENTITY_RESOURCE_ID_IMDS : V3e.MANAGED_IDENTITY_RESOURCE_ID_NON_IMDS;
        case Ok.USER_ASSIGNED_OBJECT_ID:
          this.logger.info("[Managed Identity] Adding user assigned object id to the request.");
          return V3e.MANAGED_IDENTITY_OBJECT_ID;
        default:
          throw xI("invalid_managed_identity_id_type");
      }
    }
  }
  var V3e;
  var z3e = __lazy(() => {
    lS();
    PC();
    mit();
    aki();
    lki();
    B3e(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    V3e = {
      MANAGED_IDENTITY_CLIENT_ID_2017: "clientid",
      MANAGED_IDENTITY_CLIENT_ID: "client_id",
      MANAGED_IDENTITY_OBJECT_ID: "object_id",
      MANAGED_IDENTITY_RESOURCE_ID_IMDS: "msi_res_id",
      MANAGED_IDENTITY_RESOURCE_ID_NON_IMDS: "mi_res_id"
    };
    jW.getValidatedEnvVariableUrlString = (e, t, n, r) => {
      try {
        return new bm(t).urlString;
      } catch (o) {
        throw r.info(`[Managed Identity] ${n} managed identity is unavailable because the '${e}' environment variable is malformed.`), xI(U3e[e]);
      }
    };
  });
  class MVr {
    calculateDelay(e, t) {
      if (!e) {
        return t;
      }
      let n = Math.round(parseFloat(e) * 1000);
      if (isNaN(n)) {
        n = new Date(e).valueOf() - new Date().valueOf();
      }
      return Math.max(t, n);
    }
  }
  var cki = __lazy(() => {/*! @azure/msal-node v3.8.1 2025-10-29 */});
  class jAn {
    constructor() {
      this.linearRetryStrategy = new MVr();
    }
    static get DEFAULT_MANAGED_IDENTITY_RETRY_DELAY_MS() {
      return 1000;
    }
    async pauseForRetry(e, t, n, r) {
      if (m1d.includes(e) && t < 3) {
        let o = this.linearRetryStrategy.calculateDelay(r, jAn.DEFAULT_MANAGED_IDENTITY_RETRY_DELAY_MS);
        n.verbose(`Retrying request in ${o}ms (retry attempt: ${t + 1})`);
        await new Promise(s => setTimeout(s, o));
        return true;
      }
      return false;
    }
  }
  var m1d;
  var uki = __lazy(() => {
    lAn();
    cki(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    m1d = [Wp.NOT_FOUND, Wp.REQUEST_TIMEOUT, Wp.TOO_MANY_REQUESTS, Wp.SERVER_ERROR, Wp.SERVICE_UNAVAILABLE, Wp.GATEWAY_TIMEOUT];
  });
  class _8 {
    constructor(e, t, n) {
      this.httpMethod = e;
      this._baseEndpoint = t;
      this.headers = {};
      this.bodyParameters = {};
      this.queryParameters = {};
      this.retryPolicy = n || new jAn();
    }
    computeUri() {
      let e = new Map();
      if (this.queryParameters) {
        Ya.addExtraQueryParameters(e, this.queryParameters);
      }
      let t = MF.mapToQueryString(e);
      return bm.appendQueryString(this._baseEndpoint, t);
    }
    computeParametersBodyString() {
      let e = new Map();
      if (this.bodyParameters) {
        Ya.addExtraQueryParameters(e, this.bodyParameters);
      }
      return MF.mapToQueryString(e);
    }
  }
  var K3e = __lazy(() => {
    lS();
    uki(); /*! @azure/msal-node v3.8.1 2025-10-29 */
  });
  var Y3e;
  var dki = __lazy(() => {
    z3e();
    PC();
    K3e(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    Y3e = class Y3e extends jW {
      constructor(e, t, n, r, o, s, i) {
        super(e, t, n, r, o);
        this.identityEndpoint = s;
        this.identityHeader = i;
      }
      static getEnvironmentVariables() {
        let e = process.env[sp.IDENTITY_ENDPOINT];
        let t = process.env[sp.IDENTITY_HEADER];
        return [e, t];
      }
      static tryCreate(e, t, n, r, o) {
        let [s, i] = Y3e.getEnvironmentVariables();
        if (!s || !i) {
          e.info(`[Managed Identity] ${ManagedIdentitySourceNames.APP_SERVICE} managed identity is unavailable because one or both of the '${sp.IDENTITY_HEADER}' and '${sp.IDENTITY_ENDPOINT}' environment variables are not defined.`);
          return null;
        }
        let a = Y3e.getValidatedEnvVariableUrlString(sp.IDENTITY_ENDPOINT, s, ManagedIdentitySourceNames.APP_SERVICE, e);
        e.info(`[Managed Identity] Environment variables validation passed for ${ManagedIdentitySourceNames.APP_SERVICE} managed identity. Endpoint URI: ${a}. Creating ${ManagedIdentitySourceNames.APP_SERVICE} managed identity.`);
        return new Y3e(e, t, n, r, o, s, i);
      }
      createRequest(e, t) {
        let n = new _8(IC.GET, this.identityEndpoint);
        if (n.headers[BW.APP_SERVICE_SECRET_HEADER_NAME] = this.identityHeader, n.queryParameters[XP.API_VERSION] = "2019-08-01", n.queryParameters[XP.RESOURCE] = e, t.idType !== Ok.SYSTEM_ASSIGNED) {
          n.queryParameters[this.getManagedIdentityUserAssignedIdQueryParameterKey(t.idType)] = t.id;
        }
        return n;
      }
    };
  });
  var X_e;
  var hki;
  var fki;
  var g1d;
  var Z0e;
  var gki = __lazy(() => {
    lS();
    K3e();
    z3e();
    mit();
    PC();
    B3e();
    X_e = require("fs");
    hki = __toESM(require("path"));
    /*! @azure/msal-node v3.8.1 2025-10-29 */
    fki = {
      win32: `${process.env.ProgramData}\\AzureConnectedMachineAgent\\Tokens\\`,
      linux: "/var/opt/azcmagent/tokens/"
    };
    g1d = {
      win32: `${process.env.ProgramFiles}\\AzureConnectedMachineAgent\\himds.exe`,
      linux: "/opt/azcmagent/bin/himds"
    };
    Z0e = class Z0e extends jW {
      constructor(e, t, n, r, o, s) {
        super(e, t, n, r, o);
        this.identityEndpoint = s;
      }
      static getEnvironmentVariables() {
        let e = process.env[sp.IDENTITY_ENDPOINT];
        let t = process.env[sp.IMDS_ENDPOINT];
        if (!e || !t) {
          let n = g1d.linux;
          try {
            X_e.accessSync(n, X_e.constants.F_OK | X_e.constants.R_OK);
            e = "http://127.0.0.1:40342/metadata/identity/oauth2/token";
            t = "N/A: himds executable exists";
          } catch (r) {}
        }
        return [e, t];
      }
      static tryCreate(e, t, n, r, o, s) {
        let [i, a] = Z0e.getEnvironmentVariables();
        if (!i || !a) {
          e.info(`[Managed Identity] ${ManagedIdentitySourceNames.AZURE_ARC} managed identity is unavailable through environment variables because one or both of '${sp.IDENTITY_ENDPOINT}' and '${sp.IMDS_ENDPOINT}' are not defined. ${ManagedIdentitySourceNames.AZURE_ARC} managed identity is also unavailable through file detection.`);
          return null;
        }
        if (a === "N/A: himds executable exists") {
          e.info(`[Managed Identity] ${ManagedIdentitySourceNames.AZURE_ARC} managed identity is available through file detection. Defaulting to known ${ManagedIdentitySourceNames.AZURE_ARC} endpoint: ${"http://127.0.0.1:40342/metadata/identity/oauth2/token"}. Creating ${ManagedIdentitySourceNames.AZURE_ARC} managed identity.`);
        } else {
          let l = Z0e.getValidatedEnvVariableUrlString(sp.IDENTITY_ENDPOINT, i, ManagedIdentitySourceNames.AZURE_ARC, e);
          l.endsWith("/") && l.slice(0, -1);
          Z0e.getValidatedEnvVariableUrlString(sp.IMDS_ENDPOINT, a, ManagedIdentitySourceNames.AZURE_ARC, e);
          e.info(`[Managed Identity] Environment variables validation passed for ${ManagedIdentitySourceNames.AZURE_ARC} managed identity. Endpoint URI: ${l}. Creating ${ManagedIdentitySourceNames.AZURE_ARC} managed identity.`);
        }
        if (s.idType !== Ok.SYSTEM_ASSIGNED) {
          throw xI("unable_to_create_azure_arc");
        }
        return new Z0e(e, t, n, r, o, i);
      }
      createRequest(e) {
        let t = new _8(IC.GET, this.identityEndpoint.replace("localhost", "127.0.0.1"));
        t.headers[BW.METADATA_HEADER_NAME] = "true";
        t.queryParameters[XP.API_VERSION] = "2019-11-01";
        t.queryParameters[XP.RESOURCE] = e;
        return t;
      }
      async getServerTokenResponseAsync(e, t, n, r) {
        let o;
        if (e.status === Wp.UNAUTHORIZED) {
          let s = e.headers["www-authenticate"];
          if (!s) {
            throw xI("www_authenticate_header_missing");
          }
          if (!s.includes("Basic realm=")) {
            throw xI("www_authenticate_header_unsupported_format");
          }
          let i = s.split("Basic realm=")[1];
          if (!fki.hasOwnProperty("linux")) {
            throw xI("platform_not_supported");
          }
          let a = fki.linux;
          let l = hki.default.basename(i);
          if (!l.endsWith(".key")) {
            throw xI("invalid_file_extension");
          }
          if (a + l !== i) {
            throw xI("invalid_file_path");
          }
          let c;
          try {
            c = await X_e.statSync(i).size;
          } catch (p) {
            throw xI("unable_to_read_secret_file");
          }
          if (c > 4096) {
            throw xI("invalid_secret");
          }
          let u;
          try {
            u = X_e.readFileSync(i, DF.UTF8);
          } catch (p) {
            throw xI("unable_to_read_secret_file");
          }
          let d = `Basic ${u}`;
          this.logger.info("[Managed Identity] Adding authorization header to the request.");
          n.headers[BW.AUTHORIZATION_HEADER_NAME] = d;
          try {
            o = await t.sendGetRequestAsync(n.computeUri(), r);
          } catch (p) {
            if (p instanceof AuthError) {
              throw p;
            } else {
              throw rs(ClientAuthErrorCodes.networkError);
            }
          }
        }
        return this.getServerTokenResponse(o || e);
      }
    };
  });
  var J3e;
  var yki = __lazy(() => {
    K3e();
    z3e();
    PC();
    mit();
    B3e(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    J3e = class J3e extends jW {
      constructor(e, t, n, r, o, s) {
        super(e, t, n, r, o);
        this.msiEndpoint = s;
      }
      static getEnvironmentVariables() {
        return [process.env[sp.MSI_ENDPOINT]];
      }
      static tryCreate(e, t, n, r, o, s) {
        let [i] = J3e.getEnvironmentVariables();
        if (!i) {
          e.info(`[Managed Identity] ${ManagedIdentitySourceNames.CLOUD_SHELL} managed identity is unavailable because the '${sp.MSI_ENDPOINT} environment variable is not defined.`);
          return null;
        }
        let a = J3e.getValidatedEnvVariableUrlString(sp.MSI_ENDPOINT, i, ManagedIdentitySourceNames.CLOUD_SHELL, e);
        if (e.info(`[Managed Identity] Environment variable validation passed for ${ManagedIdentitySourceNames.CLOUD_SHELL} managed identity. Endpoint URI: ${a}. Creating ${ManagedIdentitySourceNames.CLOUD_SHELL} managed identity.`), s.idType !== Ok.SYSTEM_ASSIGNED) {
          throw xI("unable_to_create_cloud_shell");
        }
        return new J3e(e, t, n, r, o, i);
      }
      createRequest(e) {
        let t = new _8(IC.POST, this.msiEndpoint);
        t.headers[BW.METADATA_HEADER_NAME] = "true";
        t.bodyParameters[XP.RESOURCE] = e;
        return t;
      }
    };
  });
  class NVr {
    constructor(e, t, n) {
      this.minExponentialBackoff = e;
      this.maxExponentialBackoff = t;
      this.exponentialDeltaBackoff = n;
    }
    calculateDelay(e) {
      if (e === 0) {
        return this.minExponentialBackoff;
      }
      return Math.min(Math.pow(2, e - 1) * this.exponentialDeltaBackoff, this.maxExponentialBackoff);
    }
  }
  var _ki = __lazy(() => {/*! @azure/msal-node v3.8.1 2025-10-29 */});
  class X3e {
    constructor() {
      this.exponentialRetryStrategy = new NVr(X3e.MIN_EXPONENTIAL_BACKOFF_MS, X3e.MAX_EXPONENTIAL_BACKOFF_MS, X3e.EXPONENTIAL_DELTA_BACKOFF_MS);
    }
    static get MIN_EXPONENTIAL_BACKOFF_MS() {
      return 1000;
    }
    static get MAX_EXPONENTIAL_BACKOFF_MS() {
      return 4000;
    }
    static get EXPONENTIAL_DELTA_BACKOFF_MS() {
      return 2000;
    }
    static get HTTP_STATUS_GONE_RETRY_AFTER_MS() {
      return 1e4;
    }
    set isNewRequest(e) {
      this._isNewRequest = e;
    }
    async pauseForRetry(e, t, n) {
      if (this._isNewRequest) {
        this._isNewRequest = false;
        this.maxRetries = e === Wp.GONE ? 7 : 3;
      }
      if ((y1d.includes(e) || e >= Wp.SERVER_ERROR_RANGE_START && e <= Wp.SERVER_ERROR_RANGE_END && t < this.maxRetries) && t < this.maxRetries) {
        let r = e === Wp.GONE ? X3e.HTTP_STATUS_GONE_RETRY_AFTER_MS : this.exponentialRetryStrategy.calculateDelay(t);
        n.verbose(`Retrying request in ${r}ms (retry attempt: ${t + 1})`);
        await new Promise(o => setTimeout(o, r));
        return true;
      }
      return false;
    }
  }
  var y1d;
  var bki = __lazy(() => {
    lAn();
    _ki(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    y1d = [Wp.NOT_FOUND, Wp.REQUEST_TIMEOUT, Wp.GONE, Wp.TOO_MANY_REQUESTS];
  });
  var w1d;
  var aBt;
  var Tki = __lazy(() => {
    K3e();
    z3e();
    PC();
    bki(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    w1d = `http://169.254.169.254${"/metadata/identity/oauth2/token"}`;
    aBt = class aBt extends jW {
      constructor(e, t, n, r, o, s) {
        super(e, t, n, r, o);
        this.identityEndpoint = s;
      }
      static tryCreate(e, t, n, r, o) {
        let s;
        if (process.env[sp.AZURE_POD_IDENTITY_AUTHORITY_HOST]) {
          e.info(`[Managed Identity] Environment variable ${sp.AZURE_POD_IDENTITY_AUTHORITY_HOST} for ${ManagedIdentitySourceNames.IMDS} returned endpoint: ${process.env[sp.AZURE_POD_IDENTITY_AUTHORITY_HOST]}`);
          s = aBt.getValidatedEnvVariableUrlString(sp.AZURE_POD_IDENTITY_AUTHORITY_HOST, `${process.env[sp.AZURE_POD_IDENTITY_AUTHORITY_HOST]}${"/metadata/identity/oauth2/token"}`, ManagedIdentitySourceNames.IMDS, e);
        } else {
          e.info(`[Managed Identity] Unable to find ${sp.AZURE_POD_IDENTITY_AUTHORITY_HOST} environment variable for ${ManagedIdentitySourceNames.IMDS}, using the default endpoint.`);
          s = w1d;
        }
        return new aBt(e, t, n, r, o, s);
      }
      createRequest(e, t) {
        let n = new _8(IC.GET, this.identityEndpoint);
        if (n.headers[BW.METADATA_HEADER_NAME] = "true", n.queryParameters[XP.API_VERSION] = "2018-02-01", n.queryParameters[XP.RESOURCE] = e, t.idType !== Ok.SYSTEM_ASSIGNED) {
          n.queryParameters[this.getManagedIdentityUserAssignedIdQueryParameterKey(t.idType, true)] = t.id;
        }
        n.retryPolicy = new X3e();
        return n;
      }
    };
  });
  var Q3e;
  var Eki = __lazy(() => {
    K3e();
    z3e();
    PC(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    Q3e = class Q3e extends jW {
      constructor(e, t, n, r, o, s, i) {
        super(e, t, n, r, o);
        this.identityEndpoint = s;
        this.identityHeader = i;
      }
      static getEnvironmentVariables() {
        let e = process.env[sp.IDENTITY_ENDPOINT];
        let t = process.env[sp.IDENTITY_HEADER];
        let n = process.env[sp.IDENTITY_SERVER_THUMBPRINT];
        return [e, t, n];
      }
      static tryCreate(e, t, n, r, o, s) {
        let [i, a, l] = Q3e.getEnvironmentVariables();
        if (!i || !a || !l) {
          e.info(`[Managed Identity] ${ManagedIdentitySourceNames.SERVICE_FABRIC} managed identity is unavailable because one or all of the '${sp.IDENTITY_HEADER}', '${sp.IDENTITY_ENDPOINT}' or '${sp.IDENTITY_SERVER_THUMBPRINT}' environment variables are not defined.`);
          return null;
        }
        let c = Q3e.getValidatedEnvVariableUrlString(sp.IDENTITY_ENDPOINT, i, ManagedIdentitySourceNames.SERVICE_FABRIC, e);
        if (e.info(`[Managed Identity] Environment variables validation passed for ${ManagedIdentitySourceNames.SERVICE_FABRIC} managed identity. Endpoint URI: ${c}. Creating ${ManagedIdentitySourceNames.SERVICE_FABRIC} managed identity.`), s.idType !== Ok.SYSTEM_ASSIGNED) {
          e.warning(`[Managed Identity] ${ManagedIdentitySourceNames.SERVICE_FABRIC} user assigned managed identity is configured in the cluster, not during runtime. See also: https://learn.microsoft.com/en-us/azure/service-fabric/configure-existing-cluster-enable-managed-identity-token-service.`);
        }
        return new Q3e(e, t, n, r, o, i, a);
      }
      createRequest(e, t) {
        let n = new _8(IC.GET, this.identityEndpoint);
        if (n.headers[BW.ML_AND_SF_SECRET_HEADER_NAME] = this.identityHeader, n.queryParameters[XP.API_VERSION] = "2019-07-01-preview", n.queryParameters[XP.RESOURCE] = e, t.idType !== Ok.SYSTEM_ASSIGNED) {
          n.queryParameters[this.getManagedIdentityUserAssignedIdQueryParameterKey(t.idType)] = t.id;
        }
        return n;
      }
    };
  });
  var k1d;
  var Z3e;
  var vki = __lazy(() => {
    z3e();
    PC();
    K3e(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    k1d = `Only client id is supported for user-assigned managed identity in ${ManagedIdentitySourceNames.MACHINE_LEARNING}.`;
    Z3e = class Z3e extends jW {
      constructor(e, t, n, r, o, s, i) {
        super(e, t, n, r, o);
        this.msiEndpoint = s;
        this.secret = i;
      }
      static getEnvironmentVariables() {
        let e = process.env[sp.MSI_ENDPOINT];
        let t = process.env[sp.MSI_SECRET];
        return [e, t];
      }
      static tryCreate(e, t, n, r, o) {
        let [s, i] = Z3e.getEnvironmentVariables();
        if (!s || !i) {
          e.info(`[Managed Identity] ${ManagedIdentitySourceNames.MACHINE_LEARNING} managed identity is unavailable because one or both of the '${sp.MSI_ENDPOINT}' and '${sp.MSI_SECRET}' environment variables are not defined.`);
          return null;
        }
        let a = Z3e.getValidatedEnvVariableUrlString(sp.MSI_ENDPOINT, s, ManagedIdentitySourceNames.MACHINE_LEARNING, e);
        e.info(`[Managed Identity] Environment variables validation passed for ${ManagedIdentitySourceNames.MACHINE_LEARNING} managed identity. Endpoint URI: ${a}. Creating ${ManagedIdentitySourceNames.MACHINE_LEARNING} managed identity.`);
        return new Z3e(e, t, n, r, o, s, i);
      }
      createRequest(e, t) {
        let n = new _8(IC.GET, this.msiEndpoint);
        if (n.headers[BW.METADATA_HEADER_NAME] = "true", n.headers[BW.ML_AND_SF_SECRET_HEADER_NAME] = this.secret, n.queryParameters[XP.API_VERSION] = "2017-09-01", n.queryParameters[XP.RESOURCE] = e, t.idType === Ok.SYSTEM_ASSIGNED) {
          n.queryParameters[V3e.MANAGED_IDENTITY_CLIENT_ID_2017] = process.env[sp.DEFAULT_IDENTITY_CLIENT_ID];
        } else if (t.idType === Ok.USER_ASSIGNED_CLIENT_ID) {
          n.queryParameters[this.getManagedIdentityUserAssignedIdQueryParameterKey(t.idType, false, true)] = t.id;
        } else {
          throw Error(k1d);
        }
        return n;
      }
    };
  });
  class Q_e {
    constructor(e, t, n, r, o) {
      this.logger = e;
      this.nodeStorage = t;
      this.networkClient = n;
      this.cryptoProvider = r;
      this.disableInternalRetries = o;
    }
    async sendManagedIdentityTokenRequest(e, t, n, r) {
      if (!Q_e.identitySource) {
        Q_e.identitySource = this.selectManagedIdentitySource(this.logger, this.nodeStorage, this.networkClient, this.cryptoProvider, this.disableInternalRetries, t);
      }
      return Q_e.identitySource.acquireTokenWithManagedIdentity(e, t, n, r);
    }
    allEnvironmentVariablesAreDefined(e) {
      return Object.values(e).every(t => t !== undefined);
    }
    getManagedIdentitySource() {
      Q_e.sourceName = this.allEnvironmentVariablesAreDefined(Q3e.getEnvironmentVariables()) ? ManagedIdentitySourceNames.SERVICE_FABRIC : this.allEnvironmentVariablesAreDefined(Y3e.getEnvironmentVariables()) ? ManagedIdentitySourceNames.APP_SERVICE : this.allEnvironmentVariablesAreDefined(Z3e.getEnvironmentVariables()) ? ManagedIdentitySourceNames.MACHINE_LEARNING : this.allEnvironmentVariablesAreDefined(J3e.getEnvironmentVariables()) ? ManagedIdentitySourceNames.CLOUD_SHELL : this.allEnvironmentVariablesAreDefined(Z0e.getEnvironmentVariables()) ? ManagedIdentitySourceNames.AZURE_ARC : ManagedIdentitySourceNames.DEFAULT_TO_IMDS;
      return Q_e.sourceName;
    }
    selectManagedIdentitySource(e, t, n, r, o, s) {
      let i = Q3e.tryCreate(e, t, n, r, o, s) || Y3e.tryCreate(e, t, n, r, o) || Z3e.tryCreate(e, t, n, r, o) || J3e.tryCreate(e, t, n, r, o, s) || Z0e.tryCreate(e, t, n, r, o, s) || aBt.tryCreate(e, t, n, r, o);
      if (!i) {
        throw xI("unable_to_create_source");
      }
      return i;
    }
  }
  var wki = __lazy(() => {
    dki();
    gki();
    yki();
    Tki();
    Eki();
    mit();
    PC();
    vki();
    B3e(); /*! @azure/msal-node v3.8.1 2025-10-29 */
  });
  class ManagedIdentityApplication {
    constructor(e) {
      this.config = twi(e || {});
      this.logger = new Logger(this.config.system.loggerOptions, "@azure/msal-node", "3.8.1");
      let t = {
        canonicalAuthority: xo.DEFAULT_AUTHORITY
      };
      if (!ManagedIdentityApplication.nodeStorage) {
        ManagedIdentityApplication.nodeStorage = new H3e(this.logger, this.config.managedIdentityId.id, Jst, t);
      }
      this.networkClient = this.config.system.networkClient;
      this.cryptoProvider = new CryptoProvider();
      let n = {
        protocolMode: ProtocolMode.AAD,
        knownAuthorities: [C8r],
        cloudDiscoveryMetadata: "",
        authorityMetadata: ""
      };
      this.fakeAuthority = new eM(C8r, this.networkClient, ManagedIdentityApplication.nodeStorage, n, this.logger, this.cryptoProvider.createNewGuid(), undefined, true);
      this.fakeClientCredentialClient = new ClientCredentialClient({
        authOptions: {
          clientId: this.config.managedIdentityId.id,
          authority: this.fakeAuthority
        }
      });
      this.managedIdentityClient = new Q_e(this.logger, ManagedIdentityApplication.nodeStorage, this.networkClient, this.cryptoProvider, this.config.disableInternalRetries);
      this.hashUtils = new $3e();
    }
    async acquireToken(e) {
      if (!e.resource) {
        throw JT(ClientConfigurationErrorCodes.urlEmptyError);
      }
      let t = {
        forceRefresh: e.forceRefresh,
        resource: e.resource.replace("/.default", ""),
        scopes: [e.resource.replace("/.default", "")],
        authority: this.fakeAuthority.canonicalAuthority,
        correlationId: this.cryptoProvider.createNewGuid(),
        claims: e.claims,
        clientCapabilities: this.config.clientCapabilities
      };
      if (t.forceRefresh) {
        return this.acquireTokenFromManagedIdentity(t, this.config.managedIdentityId, this.fakeAuthority);
      }
      let [n, r] = await this.fakeClientCredentialClient.getCachedAuthenticationResult(t, this.config, this.cryptoProvider, this.fakeAuthority, ManagedIdentityApplication.nodeStorage);
      if (t.claims) {
        let o = this.managedIdentityClient.getManagedIdentitySource();
        if (n && A1d.includes(o)) {
          let s = this.hashUtils.sha256(n.accessToken).toString(DF.HEX);
          t.revokedTokenSha256Hash = s;
        }
        return this.acquireTokenFromManagedIdentity(t, this.config.managedIdentityId, this.fakeAuthority);
      }
      if (n) {
        if (r === cv.PROACTIVELY_REFRESHED) {
          this.logger.info("ClientCredentialClient:getCachedAuthenticationResult - Cached access token's refreshOn property has been exceeded'. It's not expired, but must be refreshed.");
          let o = true;
          await this.acquireTokenFromManagedIdentity(t, this.config.managedIdentityId, this.fakeAuthority, o);
        }
        return n;
      } else {
        return this.acquireTokenFromManagedIdentity(t, this.config.managedIdentityId, this.fakeAuthority);
      }
    }
    async acquireTokenFromManagedIdentity(e, t, n, r) {
      return this.managedIdentityClient.sendManagedIdentityTokenRequest(e, t, n, r);
    }
    getManagedIdentitySource() {
      return Q_e.sourceName || this.managedIdentityClient.getManagedIdentitySource();
    }
  }
  var A1d;
  var Cki = __lazy(() => {
    lS();
    P8r();
    Tit();
    HUt();
    HAn();
    wki();
    cAn();
    PC();
    aAn(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    A1d = [ManagedIdentitySourceNames.SERVICE_FABRIC];
  });
  class DistributedCachePlugin {
    constructor(e, t) {
      this.client = e;
      this.partitionManager = t;
    }
    async beforeCacheAccess(e) {
      let t = await this.partitionManager.getKey();
      let n = await this.client.get(t);
      e.tokenCache.deserialize(n);
    }
    async afterCacheAccess(e) {
      if (e.cacheHasChanged) {
        let t = e.tokenCache.getKVStore();
        let n = Object.values(t).filter(o => JP.isAccountEntity(o));
        let r;
        if (n.length > 0) {
          let o = n[0];
          r = await this.partitionManager.extractKey(o);
        } else {
          r = await this.partitionManager.getKey();
        }
        await this.client.set(r, e.tokenCache.serialize());
      }
    }
  }
  var Rki = __lazy(() => {
    lS(); /*! @azure/msal-node v3.8.1 2025-10-29 */
  });
  var b8 = {};