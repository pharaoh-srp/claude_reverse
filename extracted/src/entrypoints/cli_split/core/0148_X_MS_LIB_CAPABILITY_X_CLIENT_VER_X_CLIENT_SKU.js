  __export(MF, {
    stripLeadingHashOrQuery: () => stripLeadingHashOrQuery,
    normalizeUrlForComparison: () => normalizeUrlForComparison,
    mapToQueryString: () => mapToQueryString,
    getDeserializedResponse: () => getDeserializedResponse
  });
  function evi(e) {
    if (!e) {
      return e;
    }
    let t = e.toLowerCase();
    if (uv.endsWith(t, "?")) {
      t = t.slice(0, -1);
    } else if (uv.endsWith(t, "?/")) {
      t = t.slice(0, -2);
    }
    if (!uv.endsWith(t, "/")) {
      t += "/";
    }
    return t;
  }
  function stripLeadingHashOrQuery(e) {
    if (e.startsWith("#/")) {
      return e.substring(2);
    } else if (e.startsWith("#") || e.startsWith("?")) {
      return e.substring(1);
    }
    return e;
  }
  function getDeserializedResponse(e) {
    if (!e || e.indexOf("=") < 0) {
      return null;
    }
    try {
      let t = stripLeadingHashOrQuery(e);
      let n = Object.fromEntries(new URLSearchParams(t));
      if (n.code || n.ear_jwe || n.error || n.error_description || n.state) {
        return n;
      }
    } catch (t) {
      throw rs("hash_not_deserialized");
    }
    return null;
  }
  function mapToQueryString(e, t = true, n) {
    let r = [];
    e.forEach((o, s) => {
      if (!t && n && s in n) {
        r.push(`${s}=${o}`);
      } else {
        r.push(`${s}=${encodeURIComponent(o)}`);
      }
    });
    return r.join("&");
  }
  function normalizeUrlForComparison(e) {
    if (!e) {
      return e;
    }
    let t = e.split("#")[0];
    try {
      let n = new URL(t);
      let r = n.origin + n.pathname + n.search;
      return evi(r);
    } catch (n) {
      return evi(t);
    }
  }
  var x3e = __lazy(() => {
    YP();
    j0e();
    RI(); /*! @azure/msal-common v15.13.1 2025-10-29 */
  });
  class bm {
    get urlString() {
      return this._urlString;
    }
    constructor(e) {
      if (this._urlString = e, !this._urlString) {
        throw JT("empty_url_error");
      }
      if (!e.includes("#")) {
        this._urlString = bm.canonicalizeUri(e);
      }
    }
    static canonicalizeUri(e) {
      if (e) {
        let t = e.toLowerCase();
        if (uv.endsWith(t, "?")) {
          t = t.slice(0, -1);
        } else if (uv.endsWith(t, "?/")) {
          t = t.slice(0, -2);
        }
        if (!uv.endsWith(t, "/")) {
          t += "/";
        }
        return t;
      }
      return e;
    }
    validateAsUri() {
      let e;
      try {
        e = this.getUrlComponents();
      } catch (t) {
        throw JT("url_parse_error");
      }
      if (!e.HostNameAndPort || !e.PathSegments) {
        throw JT("url_parse_error");
      }
      if (!e.Protocol || e.Protocol.toLowerCase() !== "https:") {
        throw JT("authority_uri_insecure");
      }
    }
    static appendQueryString(e, t) {
      if (!t) {
        return e;
      }
      return e.indexOf("?") < 0 ? `${e}?${t}` : `${e}&${t}`;
    }
    static removeHashFromUrl(e) {
      return bm.canonicalizeUri(e.split("#")[0]);
    }
    replaceTenantPath(e) {
      let t = this.getUrlComponents();
      let n = t.PathSegments;
      if (e && n.length !== 0 && (n[0] === LW.COMMON || n[0] === LW.ORGANIZATIONS)) {
        n[0] = e;
      }
      return bm.constructAuthorityUriFromObject(t);
    }
    getUrlComponents() {
      let e = RegExp("^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?");
      let t = this.urlString.match(e);
      if (!t) {
        throw JT("url_parse_error");
      }
      let n = {
        Protocol: t[1],
        HostNameAndPort: t[4],
        AbsolutePath: t[5],
        QueryString: t[7]
      };
      let r = n.AbsolutePath.split("/");
      if (r = r.filter(o => o && o.length > 0), n.PathSegments = r, n.QueryString && n.QueryString.endsWith("/")) {
        n.QueryString = n.QueryString.substring(0, n.QueryString.length - 1);
      }
      return n;
    }
    static getDomainFromUrl(e) {
      let t = RegExp("^([^:/?#]+://)?([^/?#]*)");
      let n = e.match(t);
      if (!n) {
        throw JT("url_parse_error");
      }
      return n[2];
    }
    static getAbsoluteUrl(e, t) {
      if (e[0] === xo.FORWARD_SLASH) {
        let r = new bm(t).getUrlComponents();
        return r.Protocol + "//" + r.HostNameAndPort + e;
      }
      return e;
    }
    static constructAuthorityUriFromObject(e) {
      return new bm(e.Protocol + "//" + e.HostNameAndPort + "/" + e.PathSegments.join("/"));
    }
    static hashContainsKnownProperties(e) {
      return !!getDeserializedResponse(e);
    }
  }
  var q0e = __lazy(() => {
    H0e();
    j0e();
    aw();
    x3e();
    j_e(); /*! @azure/msal-common v15.13.1 2025-10-29 */
  });
  function ovi(e, t) {
    let n;
    let r = e.canonicalAuthority;
    if (r) {
      let o = new bm(r).getUrlComponents().HostNameAndPort;
      n = nvi(o, e.cloudDiscoveryMetadata?.metadata, $j.CONFIG, t) || nvi(o, c6r.metadata, $j.HARDCODED_VALUES, t) || e.knownAuthorities;
    }
    return n || [];
  }
  function nvi(e, t, n, r) {
    if (r?.trace(`getAliasesFromMetadata called with source: ${n}`), e && t) {
      let o = uUt(t, e);
      if (o) {
        r?.trace(`getAliasesFromMetadata: found cloud discovery metadata in ${n}, returning aliases`);
        return o.aliases;
      } else {
        r?.trace(`getAliasesFromMetadata: did not find cloud discovery metadata in ${n}`);
      }
    }
    return null;
  }
  function svi(e) {
    return uUt(c6r.metadata, e);
  }
  function uUt(e, t) {
    for (let n = 0; n < e.length; n++) {
      let r = e[n];
      if (r.aliases.includes(t)) {
        return r;
      }
    }
    return null;
  }
  var rvi;
  var l6r;
  var c6r;
  var u6r;
  var d6r = __lazy(() => {
    q0e();
    aw(); /*! @azure/msal-common v15.13.1 2025-10-29 */
    rvi = {
      endpointMetadata: {
        "login.microsoftonline.com": {
          token_endpoint: "https://login.microsoftonline.com/{tenantid}/oauth2/v2.0/token",
          jwks_uri: "https://login.microsoftonline.com/{tenantid}/discovery/v2.0/keys",
          issuer: "https://login.microsoftonline.com/{tenantid}/v2.0",
          authorization_endpoint: "https://login.microsoftonline.com/{tenantid}/oauth2/v2.0/authorize",
          end_session_endpoint: "https://login.microsoftonline.com/{tenantid}/oauth2/v2.0/logout"
        },
        "login.chinacloudapi.cn": {
          token_endpoint: "https://login.chinacloudapi.cn/{tenantid}/oauth2/v2.0/token",
          jwks_uri: "https://login.chinacloudapi.cn/{tenantid}/discovery/v2.0/keys",
          issuer: "https://login.partner.microsoftonline.cn/{tenantid}/v2.0",
          authorization_endpoint: "https://login.chinacloudapi.cn/{tenantid}/oauth2/v2.0/authorize",
          end_session_endpoint: "https://login.chinacloudapi.cn/{tenantid}/oauth2/v2.0/logout"
        },
        "login.microsoftonline.us": {
          token_endpoint: "https://login.microsoftonline.us/{tenantid}/oauth2/v2.0/token",
          jwks_uri: "https://login.microsoftonline.us/{tenantid}/discovery/v2.0/keys",
          issuer: "https://login.microsoftonline.us/{tenantid}/v2.0",
          authorization_endpoint: "https://login.microsoftonline.us/{tenantid}/oauth2/v2.0/authorize",
          end_session_endpoint: "https://login.microsoftonline.us/{tenantid}/oauth2/v2.0/logout"
        }
      },
      instanceDiscoveryMetadata: {
        metadata: [{
          preferred_network: "login.microsoftonline.com",
          preferred_cache: "login.windows.net",
          aliases: ["login.microsoftonline.com", "login.windows.net", "login.microsoft.com", "sts.windows.net"]
        }, {
          preferred_network: "login.partner.microsoftonline.cn",
          preferred_cache: "login.partner.microsoftonline.cn",
          aliases: ["login.partner.microsoftonline.cn", "login.chinacloudapi.cn"]
        }, {
          preferred_network: "login.microsoftonline.de",
          preferred_cache: "login.microsoftonline.de",
          aliases: ["login.microsoftonline.de"]
        }, {
          preferred_network: "login.microsoftonline.us",
          preferred_cache: "login.microsoftonline.us",
          aliases: ["login.microsoftonline.us", "login.usgovcloudapi.net"]
        }, {
          preferred_network: "login-us.microsoftonline.com",
          preferred_cache: "login-us.microsoftonline.com",
          aliases: ["login-us.microsoftonline.com"]
        }]
      }
    };
    l6r = rvi.endpointMetadata;
    c6r = rvi.instanceDiscoveryMetadata;
    u6r = new Set();
    c6r.metadata.forEach(e => {
      e.aliases.forEach(t => {
        u6r.add(t);
      });
    });
  });
  var ivi = __lazy(() => {/*! @azure/msal-common v15.13.1 2025-10-29 */});
  function avi(e) {
    if (!(e instanceof Error)) {
      return new dUt("cache_error_unknown");
    }
    if (e.name === "QuotaExceededError" || e.name === "NS_ERROR_DOM_QUOTA_REACHED" || e.message.includes("exceeded the quota")) {
      return new dUt("cache_quota_exceeded");
    } else {
      return new dUt(e.name, e.message);
    }
  }
  var m6r;
  var dUt;
  var lvi = __lazy(() => {
    JY();
    ivi(); /*! @azure/msal-common v15.13.1 2025-10-29 */
    m6r = {
      ["cache_quota_exceeded"]: "Exceeded cache storage capacity.",
      ["cache_error_unknown"]: "Unexpected error occurred when using cache storage."
    };
    dUt = class dUt extends AuthError {
      constructor(e, t) {
        let n = t || (m6r[e] ? m6r[e] : m6r["cache_error_unknown"]);
        super(`${e}: ${n}`);
        Object.setPrototypeOf(this, dUt.prototype);
        this.name = "CacheError";
        this.errorCode = e;
        this.errorMessage = n;
      }
    };
  });
  class k3e {
    constructor(e, t, n, r, o) {
      this.clientId = e;
      this.cryptoImpl = t;
      this.commonLogger = n.clone("@azure/msal-common", "15.13.1");
      this.staticAuthorityOptions = o;
      this.performanceClient = r;
    }
    getAllAccounts(e, t) {
      return this.buildTenantProfiles(this.getAccountsFilteredBy(e, t), t, e);
    }
    getAccountInfoFilteredBy(e, t) {
      if (Object.keys(e).length === 0 || Object.values(e).every(r => !r)) {
        this.commonLogger.warning("getAccountInfoFilteredBy: Account filter is empty or invalid, returning null");
        return null;
      }
      let n = this.getAllAccounts(e, t);
      if (n.length > 1) {
        return n.sort(o => o.idTokenClaims ? -1 : 1)[0];
      } else if (n.length === 1) {
        return n[0];
      } else {
        return null;
      }
    }
    getBaseAccountInfo(e, t) {
      let n = this.getAccountsFilteredBy(e, t);
      if (n.length > 0) {
        return JP.getAccountInfo(n[0]);
      } else {
        return null;
      }
    }
    buildTenantProfiles(e, t, n) {
      return e.flatMap(r => this.getTenantProfilesFromAccountEntity(r, t, n?.tenantId, n));
    }
    getTenantedAccountInfoByFilter(e, t, n, r, o) {
      let s = null;
      let i;
      if (o) {
        if (!this.tenantProfileMatchesFilter(n, o)) {
          return null;
        }
      }
      let a = this.getIdToken(e, r, t, n.tenantId);
      if (a) {
        if (i = extractTokenClaims(a.secret, this.cryptoImpl.base64Decode), !this.idTokenClaimsMatchTenantProfileFilter(i, o)) {
          return null;
        }
      }
      s = ukn(e, n, i, a?.secret);
      return s;
    }
    getTenantProfilesFromAccountEntity(e, t, n, r) {
      let o = JP.getAccountInfo(e);
      let s = o.tenantProfiles || new Map();
      let i = this.getTokenKeys();
      if (n) {
        let l = s.get(n);
        if (l) {
          s = new Map([[n, l]]);
        } else {
          return [];
        }
      }
      let a = [];
      s.forEach(l => {
        let c = this.getTenantedAccountInfoByFilter(o, i, l, t, r);
        if (c) {
          a.push(c);
        }
      });
      return a;
    }
    tenantProfileMatchesFilter(e, t) {
      if (!!t.localAccountId && !this.matchLocalAccountIdFromTenantProfile(e, t.localAccountId)) {
        return false;
      }
      if (!!t.name && e.name !== t.name) {
        return false;
      }
      if (t.isHomeTenant !== undefined && e.isHomeTenant !== t.isHomeTenant) {
        return false;
      }
      return true;
    }
    idTokenClaimsMatchTenantProfileFilter(e, t) {
      if (t) {
        if (!!t.localAccountId && !this.matchLocalAccountIdFromTokenClaims(e, t.localAccountId)) {
          return false;
        }
        if (!!t.loginHint && !this.matchLoginHintFromTokenClaims(e, t.loginHint)) {
          return false;
        }
        if (!!t.username && !this.matchUsername(e.preferred_username, t.username)) {
          return false;
        }
        if (!!t.name && !this.matchName(e, t.name)) {
          return false;
        }
        if (!!t.sid && !this.matchSid(e, t.sid)) {
          return false;
        }
      }
      return true;
    }
    async saveCacheRecord(e, t, n, r) {
      if (!e) {
        throw rs("invalid_cache_record");
      }
      try {
        if (e.account) {
          await this.setAccount(e.account, t, n);
        }
        if (!!e.idToken && r?.idToken !== false) {
          await this.setIdTokenCredential(e.idToken, t, n);
        }
        if (!!e.accessToken && r?.accessToken !== false) {
          await this.saveAccessToken(e.accessToken, t, n);
        }
        if (!!e.refreshToken && r?.refreshToken !== false) {
          await this.setRefreshTokenCredential(e.refreshToken, t, n);
        }
        if (e.appMetadata) {
          this.setAppMetadata(e.appMetadata, t);
        }
      } catch (o) {
        if (this.commonLogger?.error("CacheManager.saveCacheRecord: failed"), o instanceof AuthError) {
          throw o;
        } else {
          throw avi(o);
        }
      }
    }
    async saveAccessToken(e, t, n) {
      let r = {
        clientId: e.clientId,
        credentialType: e.credentialType,
        environment: e.environment,
        homeAccountId: e.homeAccountId,
        realm: e.realm,
        tokenType: e.tokenType,
        requestedClaimsHash: e.requestedClaimsHash
      };
      let o = this.getTokenKeys();
      let s = JA.fromString(e.target);
      o.accessToken.forEach(i => {
        if (!this.accessTokenKeyMatchesFilter(i, r, false)) {
          return;
        }
        let a = this.getAccessTokenCredential(i, t);
        if (a && this.credentialMatchesFilter(a, r)) {
          if (JA.fromString(a.target).intersectingScopeSets(s)) {
            this.removeAccessToken(i, t);
          }
        }
      });
      await this.setAccessTokenCredential(e, t, n);
    }
    getAccountsFilteredBy(e, t) {
      let n = this.getAccountKeys();
      let r = [];
      n.forEach(o => {
        let s = this.getAccount(o, t);
        if (!s) {
          return;
        }
        if (!!e.homeAccountId && !this.matchHomeAccountId(s, e.homeAccountId)) {
          return;
        }
        if (!!e.username && !this.matchUsername(s.username, e.username)) {
          return;
        }
        if (!!e.environment && !this.matchEnvironment(s, e.environment)) {
          return;
        }
        if (!!e.realm && !this.matchRealm(s, e.realm)) {
          return;
        }
        if (!!e.nativeAccountId && !this.matchNativeAccountId(s, e.nativeAccountId)) {
          return;
        }
        if (!!e.authorityType && !this.matchAuthorityType(s, e.authorityType)) {
          return;
        }
        let i = {
          localAccountId: e?.localAccountId,
          name: e?.name
        };
        let a = s.tenantProfiles?.filter(l => this.tenantProfileMatchesFilter(l, i));
        if (a && a.length === 0) {
          return;
        }
        r.push(s);
      });
      return r;
    }
    credentialMatchesFilter(e, t) {
      if (!!t.clientId && !this.matchClientId(e, t.clientId)) {
        return false;
      }
      if (!!t.userAssertionHash && !this.matchUserAssertionHash(e, t.userAssertionHash)) {
        return false;
      }
      if (typeof t.homeAccountId === "string" && !this.matchHomeAccountId(e, t.homeAccountId)) {
        return false;
      }
      if (!!t.environment && !this.matchEnvironment(e, t.environment)) {
        return false;
      }
      if (!!t.realm && !this.matchRealm(e, t.realm)) {
        return false;
      }
      if (!!t.credentialType && !this.matchCredentialType(e, t.credentialType)) {
        return false;
      }
      if (!!t.familyId && !this.matchFamilyId(e, t.familyId)) {
        return false;
      }
      if (!!t.target && !this.matchTarget(e, t.target)) {
        return false;
      }
      if (t.requestedClaimsHash || e.requestedClaimsHash) {
        if (e.requestedClaimsHash !== t.requestedClaimsHash) {
          return false;
        }
      }
      if (e.credentialType === aS.ACCESS_TOKEN_WITH_AUTH_SCHEME) {
        if (!!t.tokenType && !this.matchTokenType(e, t.tokenType)) {
          return false;
        }
        if (t.tokenType === Hh.SSH) {
          if (t.keyId && !this.matchKeyId(e, t.keyId)) {
            return false;
          }
        }
      }
      return true;
    }
    getAppMetadataFilteredBy(e) {
      let t = this.getKeys();
      let n = {};
      t.forEach(r => {
        if (!this.isAppMetadata(r)) {
          return;
        }
        let o = this.getAppMetadata(r);
        if (!o) {
          return;
        }
        if (!!e.environment && !this.matchEnvironment(o, e.environment)) {
          return;
        }
        if (!!e.clientId && !this.matchClientId(o, e.clientId)) {
          return;
        }
        n[r] = o;
      });
      return n;
    }
    getAuthorityMetadataByAlias(e) {
      let t = this.getAuthorityMetadataKeys();
      let n = null;
      t.forEach(r => {
        if (!this.isAuthorityMetadata(r) || r.indexOf(this.clientId) === -1) {
          return;
        }
        let o = this.getAuthorityMetadata(r);
        if (!o) {
          return;
        }
        if (o.aliases.indexOf(e) === -1) {
          return;
        }
        n = o;
      });
      return n;
    }
    removeAllAccounts(e) {
      this.getAllAccounts({}, e).forEach(n => {
        this.removeAccount(n, e);
      });
    }
    removeAccount(e, t) {
      this.removeAccountContext(e, t);
      let n = this.getAccountKeys();
      let r = o => o.includes(e.homeAccountId) && o.includes(e.environment);
      n.filter(r).forEach(o => {
        this.removeItem(o, t);
        this.performanceClient.incrementFields({
          accountsRemoved: 1
        }, t);
      });
    }
    removeAccountContext(e, t) {
      let n = this.getTokenKeys();
      let r = o => o.includes(e.homeAccountId) && o.includes(e.environment);
      n.idToken.filter(r).forEach(o => {
        this.removeIdToken(o, t);
      });
      n.accessToken.filter(r).forEach(o => {
        this.removeAccessToken(o, t);
      });
      n.refreshToken.filter(r).forEach(o => {
        this.removeRefreshToken(o, t);
      });
    }
    removeAccessToken(e, t) {
      let n = this.getAccessTokenCredential(e, t);
      if (this.removeItem(e, t), this.performanceClient.incrementFields({
        accessTokensRemoved: 1
      }, t), !n || n.credentialType.toLowerCase() !== aS.ACCESS_TOKEN_WITH_AUTH_SCHEME.toLowerCase() || n.tokenType !== Hh.POP) {
        return;
      }
      let r = n.keyId;
      if (r) {
        this.cryptoImpl.removeTokenBindingKey(r).catch(() => {
          this.commonLogger.error(`Failed to remove token binding key ${r}`, t);
          this.performanceClient?.incrementFields({
            removeTokenBindingKeyFailure: 1
          }, t);
        });
      }
    }
    removeAppMetadata(e) {
      this.getKeys().forEach(n => {
        if (this.isAppMetadata(n)) {
          this.removeItem(n, e);
        }
      });
      return true;
    }
    getIdToken(e, t, n, r, o) {
      this.commonLogger.trace("CacheManager - getIdToken called");
      let s = {
        homeAccountId: e.homeAccountId,
        environment: e.environment,
        credentialType: aS.ID_TOKEN,
        clientId: this.clientId,
        realm: r
      };
      let i = this.getIdTokensByFilter(s, t, n);
      let a = i.size;
      if (a < 1) {
        this.commonLogger.info("CacheManager:getIdToken - No token found");
        return null;
      } else if (a > 1) {
        let l = i;
        if (!r) {
          let c = new Map();
          i.forEach((d, p) => {
            if (d.realm === e.tenantId) {
              c.set(p, d);
            }
          });
          let u = c.size;
          if (u < 1) {
            this.commonLogger.info("CacheManager:getIdToken - Multiple ID tokens found for account but none match account entity tenant id, returning first result");
            return i.values().next().value;
          } else if (u === 1) {
            this.commonLogger.info("CacheManager:getIdToken - Multiple ID tokens found for account, defaulting to home tenant profile");
            return c.values().next().value;
          } else {
            l = c;
          }
        }
        if (this.commonLogger.info("CacheManager:getIdToken - Multiple matching ID tokens found, clearing them"), l.forEach((c, u) => {
          this.removeIdToken(u, t);
        }), o && t) {
          o.addFields({
            multiMatchedID: i.size
          }, t);
        }
        return null;
      }
      this.commonLogger.info("CacheManager:getIdToken - Returning ID token");
      return i.values().next().value;
    }
    getIdTokensByFilter(e, t, n) {
      let r = n && n.idToken || this.getTokenKeys().idToken;
      let o = new Map();
      r.forEach(s => {
        if (!this.idTokenKeyMatchesFilter(s, {
          clientId: this.clientId,
          ...e
        })) {
          return;
        }
        let i = this.getIdTokenCredential(s, t);
        if (i && this.credentialMatchesFilter(i, e)) {
          o.set(s, i);
        }
      });
      return o;
    }
    idTokenKeyMatchesFilter(e, t) {
      let n = e.toLowerCase();
      if (t.clientId && n.indexOf(t.clientId.toLowerCase()) === -1) {
        return false;
      }
      if (t.homeAccountId && n.indexOf(t.homeAccountId.toLowerCase()) === -1) {
        return false;
      }
      return true;
    }
    removeIdToken(e, t) {
      this.removeItem(e, t);
    }
    removeRefreshToken(e, t) {
      this.removeItem(e, t);
    }
    getAccessToken(e, t, n, r) {
      let o = t.correlationId;
      this.commonLogger.trace("CacheManager - getAccessToken called", o);
      let s = JA.createSearchScopes(t.scopes);
      let i = t.authenticationScheme || Hh.BEARER;
      let a = i && i.toLowerCase() !== Hh.BEARER.toLowerCase() ? aS.ACCESS_TOKEN_WITH_AUTH_SCHEME : aS.ACCESS_TOKEN;
      let l = {
        homeAccountId: e.homeAccountId,
        environment: e.environment,
        credentialType: a,
        clientId: this.clientId,
        realm: r || e.tenantId,
        target: s,
        tokenType: i,
        keyId: t.sshKid,
        requestedClaimsHash: t.requestedClaimsHash
      };
      let c = n && n.accessToken || this.getTokenKeys().accessToken;
      let u = [];
      c.forEach(p => {
        if (this.accessTokenKeyMatchesFilter(p, l, true)) {
          let m = this.getAccessTokenCredential(p, o);
          if (m && this.credentialMatchesFilter(m, l)) {
            u.push(m);
          }
        }
      });
      let d = u.length;
      if (d < 1) {
        this.commonLogger.info("CacheManager:getAccessToken - No token found", o);
        return null;
      } else if (d > 1) {
        this.commonLogger.info("CacheManager:getAccessToken - Multiple access tokens found, clearing them", o);
        u.forEach(p => {
          this.removeAccessToken(this.generateCredentialKey(p), o);
        });
        this.performanceClient.addFields({
          multiMatchedAT: u.length
        }, o);
        return null;
      }
      this.commonLogger.info("CacheManager:getAccessToken - Returning access token", o);
      return u[0];
    }
    accessTokenKeyMatchesFilter(e, t, n) {
      let r = e.toLowerCase();
      if (t.clientId && r.indexOf(t.clientId.toLowerCase()) === -1) {
        return false;
      }
      if (t.homeAccountId && r.indexOf(t.homeAccountId.toLowerCase()) === -1) {
        return false;
      }
      if (t.realm && r.indexOf(t.realm.toLowerCase()) === -1) {
        return false;
      }
      if (t.requestedClaimsHash && r.indexOf(t.requestedClaimsHash.toLowerCase()) === -1) {
        return false;
      }
      if (t.target) {
        let o = t.target.asArray();
        for (let s = 0; s < o.length; s++) {
          if (n && !r.includes(o[s].toLowerCase())) {
            return false;
          } else if (!n && r.includes(o[s].toLowerCase())) {
            return true;
          }
        }
      }
      return true;
    }
    getAccessTokensByFilter(e, t) {
      let n = this.getTokenKeys();
      let r = [];
      n.accessToken.forEach(o => {
        if (!this.accessTokenKeyMatchesFilter(o, e, true)) {
          return;
        }
        let s = this.getAccessTokenCredential(o, t);
        if (s && this.credentialMatchesFilter(s, e)) {
          r.push(s);
        }
      });
      return r;
    }
    getRefreshToken(e, t, n, r, o) {
      this.commonLogger.trace("CacheManager - getRefreshToken called");
      let s = t ? "1" : undefined;
      let i = {
        homeAccountId: e.homeAccountId,
        environment: e.environment,
        credentialType: aS.REFRESH_TOKEN,
        clientId: this.clientId,
        familyId: s
      };
      let a = r && r.refreshToken || this.getTokenKeys().refreshToken;
      let l = [];
      a.forEach(u => {
        if (this.refreshTokenKeyMatchesFilter(u, i)) {
          let d = this.getRefreshTokenCredential(u, n);
          if (d && this.credentialMatchesFilter(d, i)) {
            l.push(d);
          }
        }
      });
      let c = l.length;
      if (c < 1) {
        this.commonLogger.info("CacheManager:getRefreshToken - No refresh token found.");
        return null;
      }
      if (c > 1 && o && n) {
        o.addFields({
          multiMatchedRT: c
        }, n);
      }
      this.commonLogger.info("CacheManager:getRefreshToken - returning refresh token");
      return l[0];
    }
    refreshTokenKeyMatchesFilter(e, t) {
      let n = e.toLowerCase();
      if (t.familyId && n.indexOf(t.familyId.toLowerCase()) === -1) {
        return false;
      }
      if (!t.familyId && t.clientId && n.indexOf(t.clientId.toLowerCase()) === -1) {
        return false;
      }
      if (t.homeAccountId && n.indexOf(t.homeAccountId.toLowerCase()) === -1) {
        return false;
      }
      return true;
    }
    readAppMetadataFromCache(e) {
      let t = {
        environment: e,
        clientId: this.clientId
      };
      let n = this.getAppMetadataFilteredBy(t);
      let r = Object.keys(n).map(s => n[s]);
      let o = r.length;
      if (o < 1) {
        return null;
      } else if (o > 1) {
        throw rs("multiple_matching_appMetadata");
      }
      return r[0];
    }
    isAppMetadataFOCI(e) {
      let t = this.readAppMetadataFromCache(e);
      return !!(t && t.familyId === "1");
    }
    matchHomeAccountId(e, t) {
      return typeof e.homeAccountId === "string" && t === e.homeAccountId;
    }
    matchLocalAccountIdFromTokenClaims(e, t) {
      let n = e.oid || e.sub;
      return t === n;
    }
    matchLocalAccountIdFromTenantProfile(e, t) {
      return e.localAccountId === t;
    }
    matchName(e, t) {
      return t.toLowerCase() === e.name?.toLowerCase();
    }
    matchUsername(e, t) {
      return !!(e && typeof e === "string" && t?.toLowerCase() === e.toLowerCase());
    }
    matchUserAssertionHash(e, t) {
      return !!(e.userAssertionHash && t === e.userAssertionHash);
    }
    matchEnvironment(e, t) {
      if (this.staticAuthorityOptions) {
        let r = ovi(this.staticAuthorityOptions, this.commonLogger);
        if (r.includes(t) && r.includes(e.environment)) {
          return true;
        }
      }
      let n = this.getAuthorityMetadataByAlias(t);
      if (n && n.aliases.indexOf(e.environment) > -1) {
        return true;
      }
      return false;
    }
    matchCredentialType(e, t) {
      return e.credentialType && t.toLowerCase() === e.credentialType.toLowerCase();
    }
    matchClientId(e, t) {
      return !!(e.clientId && t === e.clientId);
    }
    matchFamilyId(e, t) {
      return !!(e.familyId && t === e.familyId);
    }
    matchRealm(e, t) {
      return e.realm?.toLowerCase() === t.toLowerCase();
    }
    matchNativeAccountId(e, t) {
      return !!(e.nativeAccountId && t === e.nativeAccountId);
    }
    matchLoginHintFromTokenClaims(e, t) {
      if (e.login_hint === t) {
        return true;
      }
      if (e.preferred_username === t) {
        return true;
      }
      if (e.upn === t) {
        return true;
      }
      return false;
    }
    matchSid(e, t) {
      return e.sid === t;
    }
    matchAuthorityType(e, t) {
      return !!(e.authorityType && t.toLowerCase() === e.authorityType.toLowerCase());
    }
    matchTarget(e, t) {
      if (e.credentialType !== aS.ACCESS_TOKEN && e.credentialType !== aS.ACCESS_TOKEN_WITH_AUTH_SCHEME || !e.target) {
        return false;
      }
      return JA.fromString(e.target).containsScopeSet(t);
    }
    matchTokenType(e, t) {
      return !!(e.tokenType && e.tokenType === t);
    }
    matchKeyId(e, t) {
      return !!(e.keyId && e.keyId === t);
    }
    isAppMetadata(e) {
      return e.indexOf("appmetadata") !== -1;
    }
    isAuthorityMetadata(e) {
      return e.indexOf(zst.CACHE_KEY) !== -1;
    }
    generateAuthorityMetadataCacheKey(e) {
      return `${zst.CACHE_KEY}-${this.clientId}-${e}`;
    }
    static toObject(e, t) {
      for (let n in t) {
        e[n] = t[n];
      }
      return e;
    }
  }
  var gkn;
  var f6r = __lazy(() => {
    aw();
    iUt();
    mkn();
    YP();
    dkn();
    nit();
    lkn();
    d6r();
    lvi();
    JY();
    RI(); /*! @azure/msal-common v15.13.1 2025-10-29 */
    gkn = class gkn extends k3e {
      async setAccount() {
        throw rs("method_not_implemented");
      }
      getAccount() {
        throw rs("method_not_implemented");
      }
      async setIdTokenCredential() {
        throw rs("method_not_implemented");
      }
      getIdTokenCredential() {
        throw rs("method_not_implemented");
      }
      async setAccessTokenCredential() {
        throw rs("method_not_implemented");
      }
      getAccessTokenCredential() {
        throw rs("method_not_implemented");
      }
      async setRefreshTokenCredential() {
        throw rs("method_not_implemented");
      }
      getRefreshTokenCredential() {
        throw rs("method_not_implemented");
      }
      setAppMetadata() {
        throw rs("method_not_implemented");
      }
      getAppMetadata() {
        throw rs("method_not_implemented");
      }
      setServerTelemetry() {
        throw rs("method_not_implemented");
      }
      getServerTelemetry() {
        throw rs("method_not_implemented");
      }
      setAuthorityMetadata() {
        throw rs("method_not_implemented");
      }
      getAuthorityMetadata() {
        throw rs("method_not_implemented");
      }
      getAuthorityMetadataKeys() {
        throw rs("method_not_implemented");
      }
      setThrottlingCache() {
        throw rs("method_not_implemented");
      }
      getThrottlingCache() {
        throw rs("method_not_implemented");
      }
      removeItem() {
        throw rs("method_not_implemented");
      }
      getKeys() {
        throw rs("method_not_implemented");
      }
      getAccountKeys() {
        throw rs("method_not_implemented");
      }
      getTokenKeys() {
        throw rs("method_not_implemented");
      }
      generateCredentialKey() {
        throw rs("method_not_implemented");
      }
      generateAccountKey() {
        throw rs("method_not_implemented");
      }
    };
  });
  var io;
  var uUg;
  var cvi;
  var wne = __lazy(() => {
    /*! @azure/msal-common v15.13.1 2025-10-29 */
    io = {
      AcquireTokenByCode: "acquireTokenByCode",
      AcquireTokenByRefreshToken: "acquireTokenByRefreshToken",
      AcquireTokenSilent: "acquireTokenSilent",
      AcquireTokenSilentAsync: "acquireTokenSilentAsync",
      AcquireTokenPopup: "acquireTokenPopup",
      AcquireTokenPreRedirect: "acquireTokenPreRedirect",
      AcquireTokenRedirect: "acquireTokenRedirect",
      CryptoOptsGetPublicKeyThumbprint: "cryptoOptsGetPublicKeyThumbprint",
      CryptoOptsSignJwt: "cryptoOptsSignJwt",
      SilentCacheClientAcquireToken: "silentCacheClientAcquireToken",
      SilentIframeClientAcquireToken: "silentIframeClientAcquireToken",
      AwaitConcurrentIframe: "awaitConcurrentIframe",
      SilentRefreshClientAcquireToken: "silentRefreshClientAcquireToken",
      SsoSilent: "ssoSilent",
      StandardInteractionClientGetDiscoveredAuthority: "standardInteractionClientGetDiscoveredAuthority",
      FetchAccountIdWithNativeBroker: "fetchAccountIdWithNativeBroker",
      NativeInteractionClientAcquireToken: "nativeInteractionClientAcquireToken",
      BaseClientCreateTokenRequestHeaders: "baseClientCreateTokenRequestHeaders",
      NetworkClientSendPostRequestAsync: "networkClientSendPostRequestAsync",
      RefreshTokenClientExecutePostToTokenEndpoint: "refreshTokenClientExecutePostToTokenEndpoint",
      AuthorizationCodeClientExecutePostToTokenEndpoint: "authorizationCodeClientExecutePostToTokenEndpoint",
      BrokerHandhshake: "brokerHandshake",
      AcquireTokenByRefreshTokenInBroker: "acquireTokenByRefreshTokenInBroker",
      AcquireTokenByBroker: "acquireTokenByBroker",
      RefreshTokenClientExecuteTokenRequest: "refreshTokenClientExecuteTokenRequest",
      RefreshTokenClientAcquireToken: "refreshTokenClientAcquireToken",
      RefreshTokenClientAcquireTokenWithCachedRefreshToken: "refreshTokenClientAcquireTokenWithCachedRefreshToken",
      RefreshTokenClientAcquireTokenByRefreshToken: "refreshTokenClientAcquireTokenByRefreshToken",
      RefreshTokenClientCreateTokenRequestBody: "refreshTokenClientCreateTokenRequestBody",
      AcquireTokenFromCache: "acquireTokenFromCache",
      SilentFlowClientAcquireCachedToken: "silentFlowClientAcquireCachedToken",
      SilentFlowClientGenerateResultFromCacheRecord: "silentFlowClientGenerateResultFromCacheRecord",
      AcquireTokenBySilentIframe: "acquireTokenBySilentIframe",
      InitializeBaseRequest: "initializeBaseRequest",
      InitializeSilentRequest: "initializeSilentRequest",
      InitializeClientApplication: "initializeClientApplication",
      InitializeCache: "initializeCache",
      SilentIframeClientTokenHelper: "silentIframeClientTokenHelper",
      SilentHandlerInitiateAuthRequest: "silentHandlerInitiateAuthRequest",
      SilentHandlerMonitorIframeForHash: "silentHandlerMonitorIframeForHash",
      SilentHandlerLoadFrame: "silentHandlerLoadFrame",
      SilentHandlerLoadFrameSync: "silentHandlerLoadFrameSync",
      StandardInteractionClientCreateAuthCodeClient: "standardInteractionClientCreateAuthCodeClient",
      StandardInteractionClientGetClientConfiguration: "standardInteractionClientGetClientConfiguration",
      StandardInteractionClientInitializeAuthorizationRequest: "standardInteractionClientInitializeAuthorizationRequest",
      GetAuthCodeUrl: "getAuthCodeUrl",
      GetStandardParams: "getStandardParams",
      HandleCodeResponseFromServer: "handleCodeResponseFromServer",
      HandleCodeResponse: "handleCodeResponse",
      HandleResponseEar: "handleResponseEar",
      HandleResponsePlatformBroker: "handleResponsePlatformBroker",
      HandleResponseCode: "handleResponseCode",
      UpdateTokenEndpointAuthority: "updateTokenEndpointAuthority",
      AuthClientAcquireToken: "authClientAcquireToken",
      AuthClientExecuteTokenRequest: "authClientExecuteTokenRequest",
      AuthClientCreateTokenRequestBody: "authClientCreateTokenRequestBody",
      PopTokenGenerateCnf: "popTokenGenerateCnf",
      PopTokenGenerateKid: "popTokenGenerateKid",
      HandleServerTokenResponse: "handleServerTokenResponse",
      DeserializeResponse: "deserializeResponse",
      AuthorityFactoryCreateDiscoveredInstance: "authorityFactoryCreateDiscoveredInstance",
      AuthorityResolveEndpointsAsync: "authorityResolveEndpointsAsync",
      AuthorityResolveEndpointsFromLocalSources: "authorityResolveEndpointsFromLocalSources",
      AuthorityGetCloudDiscoveryMetadataFromNetwork: "authorityGetCloudDiscoveryMetadataFromNetwork",
      AuthorityUpdateCloudDiscoveryMetadata: "authorityUpdateCloudDiscoveryMetadata",
      AuthorityGetEndpointMetadataFromNetwork: "authorityGetEndpointMetadataFromNetwork",
      AuthorityUpdateEndpointMetadata: "authorityUpdateEndpointMetadata",
      AuthorityUpdateMetadataWithRegionalInformation: "authorityUpdateMetadataWithRegionalInformation",
      RegionDiscoveryDetectRegion: "regionDiscoveryDetectRegion",
      RegionDiscoveryGetRegionFromIMDS: "regionDiscoveryGetRegionFromIMDS",
      RegionDiscoveryGetCurrentVersion: "regionDiscoveryGetCurrentVersion",
      AcquireTokenByCodeAsync: "acquireTokenByCodeAsync",
      GetEndpointMetadataFromNetwork: "getEndpointMetadataFromNetwork",
      GetCloudDiscoveryMetadataFromNetworkMeasurement: "getCloudDiscoveryMetadataFromNetworkMeasurement",
      HandleRedirectPromiseMeasurement: "handleRedirectPromise",
      HandleNativeRedirectPromiseMeasurement: "handleNativeRedirectPromise",
      UpdateCloudDiscoveryMetadataMeasurement: "updateCloudDiscoveryMetadataMeasurement",
      UsernamePasswordClientAcquireToken: "usernamePasswordClientAcquireToken",
      NativeMessageHandlerHandshake: "nativeMessageHandlerHandshake",
      NativeGenerateAuthResult: "nativeGenerateAuthResult",
      RemoveHiddenIframe: "removeHiddenIframe",
      ClearTokensAndKeysWithClaims: "clearTokensAndKeysWithClaims",
      CacheManagerGetRefreshToken: "cacheManagerGetRefreshToken",
      ImportExistingCache: "importExistingCache",
      SetUserData: "setUserData",
      LocalStorageUpdated: "localStorageUpdated",
      GeneratePkceCodes: "generatePkceCodes",
      GenerateCodeVerifier: "generateCodeVerifier",
      GenerateCodeChallengeFromVerifier: "generateCodeChallengeFromVerifier",
      Sha256Digest: "sha256Digest",
      GetRandomValues: "getRandomValues",
      GenerateHKDF: "generateHKDF",
      GenerateBaseKey: "generateBaseKey",
      Base64Decode: "base64Decode",
      UrlEncodeArr: "urlEncodeArr",
      Encrypt: "encrypt",
      Decrypt: "decrypt",
      GenerateEarKey: "generateEarKey",
      DecryptEarResponse: "decryptEarResponse"
    };
    uUg = new Map([[io.AcquireTokenByCode, "ATByCode"], [io.AcquireTokenByRefreshToken, "ATByRT"], [io.AcquireTokenSilent, "ATS"], [io.AcquireTokenSilentAsync, "ATSAsync"], [io.AcquireTokenPopup, "ATPopup"], [io.AcquireTokenRedirect, "ATRedirect"], [io.CryptoOptsGetPublicKeyThumbprint, "CryptoGetPKThumb"], [io.CryptoOptsSignJwt, "CryptoSignJwt"], [io.SilentCacheClientAcquireToken, "SltCacheClientAT"], [io.SilentIframeClientAcquireToken, "SltIframeClientAT"], [io.SilentRefreshClientAcquireToken, "SltRClientAT"], [io.SsoSilent, "SsoSlt"], [io.StandardInteractionClientGetDiscoveredAuthority, "StdIntClientGetDiscAuth"], [io.FetchAccountIdWithNativeBroker, "FetchAccIdWithNtvBroker"], [io.NativeInteractionClientAcquireToken, "NtvIntClientAT"], [io.BaseClientCreateTokenRequestHeaders, "BaseClientCreateTReqHead"], [io.NetworkClientSendPostRequestAsync, "NetClientSendPost"], [io.RefreshTokenClientExecutePostToTokenEndpoint, "RTClientExecPost"], [io.AuthorizationCodeClientExecutePostToTokenEndpoint, "AuthCodeClientExecPost"], [io.BrokerHandhshake, "BrokerHandshake"], [io.AcquireTokenByRefreshTokenInBroker, "ATByRTInBroker"], [io.AcquireTokenByBroker, "ATByBroker"], [io.RefreshTokenClientExecuteTokenRequest, "RTClientExecTReq"], [io.RefreshTokenClientAcquireToken, "RTClientAT"], [io.RefreshTokenClientAcquireTokenWithCachedRefreshToken, "RTClientATWithCachedRT"], [io.RefreshTokenClientAcquireTokenByRefreshToken, "RTClientATByRT"], [io.RefreshTokenClientCreateTokenRequestBody, "RTClientCreateTReqBody"], [io.AcquireTokenFromCache, "ATFromCache"], [io.SilentFlowClientAcquireCachedToken, "SltFlowClientATCached"], [io.SilentFlowClientGenerateResultFromCacheRecord, "SltFlowClientGenResFromCache"], [io.AcquireTokenBySilentIframe, "ATBySltIframe"], [io.InitializeBaseRequest, "InitBaseReq"], [io.InitializeSilentRequest, "InitSltReq"], [io.InitializeClientApplication, "InitClientApplication"], [io.InitializeCache, "InitCache"], [io.ImportExistingCache, "importCache"], [io.SetUserData, "setUserData"], [io.LocalStorageUpdated, "localStorageUpdated"], [io.SilentIframeClientTokenHelper, "SIClientTHelper"], [io.SilentHandlerInitiateAuthRequest, "SHandlerInitAuthReq"], [io.SilentHandlerMonitorIframeForHash, "SltHandlerMonitorIframeForHash"], [io.SilentHandlerLoadFrame, "SHandlerLoadFrame"], [io.SilentHandlerLoadFrameSync, "SHandlerLoadFrameSync"], [io.StandardInteractionClientCreateAuthCodeClient, "StdIntClientCreateAuthCodeClient"], [io.StandardInteractionClientGetClientConfiguration, "StdIntClientGetClientConf"], [io.StandardInteractionClientInitializeAuthorizationRequest, "StdIntClientInitAuthReq"], [io.GetAuthCodeUrl, "GetAuthCodeUrl"], [io.HandleCodeResponseFromServer, "HandleCodeResFromServer"], [io.HandleCodeResponse, "HandleCodeResp"], [io.HandleResponseEar, "HandleRespEar"], [io.HandleResponseCode, "HandleRespCode"], [io.HandleResponsePlatformBroker, "HandleRespPlatBroker"], [io.UpdateTokenEndpointAuthority, "UpdTEndpointAuth"], [io.AuthClientAcquireToken, "AuthClientAT"], [io.AuthClientExecuteTokenRequest, "AuthClientExecTReq"], [io.AuthClientCreateTokenRequestBody, "AuthClientCreateTReqBody"], [io.PopTokenGenerateCnf, "PopTGenCnf"], [io.PopTokenGenerateKid, "PopTGenKid"], [io.HandleServerTokenResponse, "HandleServerTRes"], [io.DeserializeResponse, "DeserializeRes"], [io.AuthorityFactoryCreateDiscoveredInstance, "AuthFactCreateDiscInst"], [io.AuthorityResolveEndpointsAsync, "AuthResolveEndpointsAsync"], [io.AuthorityResolveEndpointsFromLocalSources, "AuthResolveEndpointsFromLocal"], [io.AuthorityGetCloudDiscoveryMetadataFromNetwork, "AuthGetCDMetaFromNet"], [io.AuthorityUpdateCloudDiscoveryMetadata, "AuthUpdCDMeta"], [io.AuthorityGetEndpointMetadataFromNetwork, "AuthUpdCDMetaFromNet"], [io.AuthorityUpdateEndpointMetadata, "AuthUpdEndpointMeta"], [io.AuthorityUpdateMetadataWithRegionalInformation, "AuthUpdMetaWithRegInfo"], [io.RegionDiscoveryDetectRegion, "RegDiscDetectReg"], [io.RegionDiscoveryGetRegionFromIMDS, "RegDiscGetRegFromIMDS"], [io.RegionDiscoveryGetCurrentVersion, "RegDiscGetCurrentVer"], [io.AcquireTokenByCodeAsync, "ATByCodeAsync"], [io.GetEndpointMetadataFromNetwork, "GetEndpointMetaFromNet"], [io.GetCloudDiscoveryMetadataFromNetworkMeasurement, "GetCDMetaFromNet"], [io.HandleRedirectPromiseMeasurement, "HandleRedirectPromise"], [io.HandleNativeRedirectPromiseMeasurement, "HandleNtvRedirectPromise"], [io.UpdateCloudDiscoveryMetadataMeasurement, "UpdateCDMeta"], [io.UsernamePasswordClientAcquireToken, "UserPassClientAT"], [io.NativeMessageHandlerHandshake, "NtvMsgHandlerHandshake"], [io.NativeGenerateAuthResult, "NtvGenAuthRes"], [io.RemoveHiddenIframe, "RemoveHiddenIframe"], [io.ClearTokensAndKeysWithClaims, "ClearTAndKeysWithClaims"], [io.CacheManagerGetRefreshToken, "CacheManagerGetRT"], [io.GeneratePkceCodes, "GenPkceCodes"], [io.GenerateCodeVerifier, "GenCodeVerifier"], [io.GenerateCodeChallengeFromVerifier, "GenCodeChallengeFromVerifier"], [io.Sha256Digest, "Sha256Digest"], [io.GetRandomValues, "GetRandomValues"], [io.GenerateHKDF, "genHKDF"], [io.GenerateBaseKey, "genBaseKey"], [io.Base64Decode, "b64Decode"], [io.UrlEncodeArr, "urlEncArr"], [io.Encrypt, "encrypt"], [io.Decrypt, "decrypt"], [io.GenerateEarKey, "genEarKey"], [io.DecryptEarResponse, "decryptEarResp"]]);
    cvi = {
      NotStarted: 0,
      InProgress: 1,
      Completed: 2
    };
  });
  class h6r {
    startMeasurement() {
      return;
    }
    endMeasurement() {
      return;
    }
    flushMeasurement() {
      return null;
    }
  }
  class rit {
    generateId() {
      return "callback-id";
    }
    startMeasurement(e, t) {
      return {
        end: () => null,
        discard: () => {},
        add: () => {},
        increment: () => {},
        event: {
          eventId: this.generateId(),
          status: cvi.InProgress,
          authority: "",
          libraryName: "",
          libraryVersion: "",
          clientId: "",
          name: e,
          startTimeMs: Date.now(),
          correlationId: t || ""
        },
        measurement: new h6r()
      };
    }
    startPerformanceMeasurement() {
      return new h6r();
    }
    calculateQueuedTime() {
      return 0;
    }
    addQueueMeasurement() {
      return;
    }
    setPreQueueTime() {
      return;
    }
    endMeasurement() {
      return null;
    }
    discardMeasurements() {
      return;
    }
    removePerformanceCallback() {
      return true;
    }
    addPerformanceCallback() {
      return "";
    }
    emitEvents() {
      return;
    }
    addFields() {
      return;
    }
    incrementFields() {
      return;
    }
    cacheEventByCorrelationId() {
      return;
    }
  }
  var g6r = __lazy(() => {
    wne(); /*! @azure/msal-common v15.13.1 2025-10-29 */
  });
  function uvi({
    authOptions: e,
    systemOptions: t,
    loggerOptions: n,
    cacheOptions: r,
    storageInterface: o,
    networkInterface: s,
    cryptoInterface: i,
    clientCredentials: a,
    libraryInfo: l,
    telemetry: c,
    serverTelemetryManager: u,
    persistencePlugin: d,
    serializableCache: p
  }) {
    let m = {
      ...lAd,
      ...n
    };
    return {
      authOptions: hAd(e),
      systemOptions: {
        ...aAd,
        ...t
      },
      loggerOptions: m,
      cacheOptions: {
        ...cAd,
        ...r
      },
      storageInterface: o || new gkn(e.clientId, Jst, new Logger(m), new rit()),
      networkInterface: s || uAd,
      cryptoInterface: i || Jst,
      clientCredentials: a || pAd,
      libraryInfo: {
        ...dAd,
        ...l
      },
      telemetry: {
        ...fAd,
        ...c
      },
      serverTelemetryManager: u || null,
      persistencePlugin: d || null,
      serializableCache: p || null
    };
  }
  function hAd(e) {
    return {
      clientCapabilities: [],
      azureCloudOptions: mAd,
      skipAuthorityMetadataCache: false,
      instanceAware: false,
      encodeExtraQueryParams: false,
      ...e
    };
  }
  function ykn(e) {
    return e.authOptions.authority.options.protocolMode === ProtocolMode.OIDC;
  }
  var aAd;
  var lAd;
  var cAd;
  var uAd;
  var dAd;
  var pAd;
  var mAd;
  var fAd;
  var _kn = __lazy(() => {
    n6r();
    ikn();
    aw();
    lkn();
    ckn();
    f6r();
    lUt();
    YP();
    g6r();
    RI(); /*! @azure/msal-common v15.13.1 2025-10-29 */
    aAd = {
      tokenRenewalOffsetSeconds: 300,
      preventCorsPreflight: false
    };
    lAd = {
      loggerCallback: () => {},
      piiLoggingEnabled: false,
      logLevel: LogLevel.Info,
      correlationId: xo.EMPTY_STRING
    };
    cAd = {
      claimsBasedCachingEnabled: false
    };
    uAd = {
      async sendGetRequestAsync() {
        throw rs("method_not_implemented");
      },
      async sendPostRequestAsync() {
        throw rs("method_not_implemented");
      }
    };
    dAd = {
      sku: xo.SKU,
      version: "15.13.1",
      cpu: xo.EMPTY_STRING,
      os: xo.EMPTY_STRING
    };
    pAd = {
      clientSecret: xo.EMPTY_STRING,
      clientAssertion: undefined
    };
    mAd = {
      azureCloudInstance: AzureCloudInstance.None,
      tenant: `${xo.DEFAULT_COMMON_TENANT}`
    };
    fAd = {
      application: {
        appName: "",
        appVersion: ""
      }
    };
  });
  var jj;
  var pUt = __lazy(() => {
    /*! @azure/msal-common v15.13.1 2025-10-29 */jj = {
      HOME_ACCOUNT_ID: "home_account_id",
      UPN: "UPN"
    };
  });
  var A3e = {};
  __export(A3e, {
    X_MS_LIB_CAPABILITY: () => "x-ms-lib-capability",
    X_CLIENT_VER: () => "x-client-VER",
    X_CLIENT_SKU: () => "x-client-SKU",
    X_CLIENT_OS: () => "x-client-OS",
    X_CLIENT_LAST_TELEM: () => "x-client-last-telemetry",
    X_CLIENT_EXTRA_SKU: () => "x-client-xtra-sku",
    X_CLIENT_CURR_TELEM: () => "x-client-current-telemetry",
    X_CLIENT_CPU: () => "x-client-CPU",
    X_APP_VER: () => "x-app-ver",
    X_APP_NAME: () => "x-app-name",
    TOKEN_TYPE: () => "token_type",
    STATE: () => "state",
    SID: () => "sid",
    SESSION_STATE: () => "session_state",
    SCOPE: () => "scope",
    RETURN_SPA_CODE: () => "return_spa_code",
    RESPONSE_TYPE: () => "response_type",
    RESPONSE_MODE: () => "response_mode",
    REQ_CNF: () => "req_cnf",
    REQUESTED_TOKEN_USE: () => "requested_token_use",
    REFRESH_TOKEN_EXPIRES_IN: () => "refresh_token_expires_in",
    REFRESH_TOKEN: () => "refresh_token",
    REDIRECT_URI: () => "redirect_uri",
    PROMPT: () => "prompt",
    POST_LOGOUT_URI: () => "post_logout_redirect_uri",
    ON_BEHALF_OF: () => "on_behalf_of",
    OBO_ASSERTION: () => "assertion",
    NONCE: () => "nonce",
    NATIVE_BROKER: () => "nativebroker",
    LOGOUT_HINT: () => "logout_hint",
    LOGIN_HINT: () => "login_hint",
    INSTANCE_AWARE: () => "instance_aware",
    ID_TOKEN_HINT: () => "id_token_hint",
    ID_TOKEN: () => "id_token",
    GRANT_TYPE: () => "grant_type",
    FOCI: () => "foci",
    EXPIRES_IN: () => "expires_in",
    ERROR_DESCRIPTION: () => "error_description",
    ERROR: () => "error",
    EAR_JWK: () => "ear_jwk",
    EAR_JWE_CRYPTO: () => "ear_jwe_crypto",
    DOMAIN_HINT: () => "domain_hint",
    DEVICE_CODE: () => "device_code",
    CODE_VERIFIER: () => "code_verifier",
    CODE_CHALLENGE_METHOD: () => "code_challenge_method",
    CODE_CHALLENGE: () => "code_challenge",
    CODE: () => "code",
    CLIENT_SECRET: () => "client_secret",
    CLIENT_REQUEST_ID: () => "client-request-id",
    CLIENT_INFO: () => "client_info",
    CLIENT_ID: () => "client_id",
    CLIENT_ASSERTION_TYPE: () => "client_assertion_type",
    CLIENT_ASSERTION: () => "client_assertion",
    CLAIMS: () => "claims",
    CCS_HEADER: () => "X-AnchorMailbox",
    BROKER_REDIRECT_URI: () => "brk_redirect_uri",
    BROKER_CLIENT_ID: () => "brk_client_id",
    ACCESS_TOKEN: () => "access_token"
  });
  var sit = __lazy(() => {/*! @azure/msal-common v15.13.1 2025-10-29 */});
  var Ya = {};