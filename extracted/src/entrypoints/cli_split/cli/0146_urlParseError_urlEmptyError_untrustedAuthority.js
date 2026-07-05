  __export(ClientConfigurationErrorCodes, {
    urlParseError: () => "url_parse_error",
    urlEmptyError: () => "empty_url_error",
    untrustedAuthority: () => "untrusted_authority",
    tokenRequestEmpty: () => "token_request_empty",
    redirectUriEmpty: () => "redirect_uri_empty",
    pkceParamsMissing: () => "pkce_params_missing",
    missingSshKid: () => "missing_ssh_kid",
    missingSshJwk: () => "missing_ssh_jwk",
    missingNonceAuthenticationHeader: () => "missing_nonce_authentication_header",
    logoutRequestEmpty: () => "logout_request_empty",
    invalidRequestMethodForEAR: () => "invalid_request_method_for_EAR",
    invalidCodeChallengeMethod: () => "invalid_code_challenge_method",
    invalidCloudDiscoveryMetadata: () => "invalid_cloud_discovery_metadata",
    invalidClaims: () => "invalid_claims",
    invalidAuthorizePostBodyParameters: () => "invalid_authorize_post_body_parameters",
    invalidAuthorityMetadata: () => "invalid_authority_metadata",
    invalidAuthenticationHeader: () => "invalid_authentication_header",
    emptyInputScopesError: () => "empty_input_scopes_error",
    claimsRequestParsingError: () => "claims_request_parsing_error",
    cannotSetOIDCOptions: () => "cannot_set_OIDCOptions",
    cannotAllowPlatformBroker: () => "cannot_allow_platform_broker",
    authorityUriInsecure: () => "authority_uri_insecure",
    authorityMismatch: () => "authority_mismatch"
  });
  var j_e = __lazy(() => {/*! @azure/msal-common v15.13.1 2025-10-29 */});
  function JT(e) {
    return new ClientConfigurationError(e);
  }
  var tx;
  var ClientConfigurationErrorMessage;
  var ClientConfigurationError;
  var H0e = __lazy(() => {
    JY();
    j_e(); /*! @azure/msal-common v15.13.1 2025-10-29 */
    tx = {
      ["redirect_uri_empty"]: "A redirect URI is required for all calls, and none has been set.",
      ["claims_request_parsing_error"]: "Could not parse the given claims request object.",
      ["authority_uri_insecure"]: "Authority URIs must use https.  Please see here for valid authority configuration options: https://docs.microsoft.com/en-us/azure/active-directory/develop/msal-js-initializing-client-applications#configuration-options",
      ["url_parse_error"]: "URL could not be parsed into appropriate segments.",
      ["empty_url_error"]: "URL was empty or null.",
      ["empty_input_scopes_error"]: "Scopes cannot be passed as null, undefined or empty array because they are required to obtain an access token.",
      ["invalid_claims"]: "Given claims parameter must be a stringified JSON object.",
      ["token_request_empty"]: "Token request was empty and not found in cache.",
      ["logout_request_empty"]: "The logout request was null or undefined.",
      ["invalid_code_challenge_method"]: 'code_challenge_method passed is invalid. Valid values are "plain" and "S256".',
      ["pkce_params_missing"]: "Both params: code_challenge and code_challenge_method are to be passed if to be sent in the request",
      ["invalid_cloud_discovery_metadata"]: "Invalid cloudDiscoveryMetadata provided. Must be a stringified JSON object containing tenant_discovery_endpoint and metadata fields",
      ["invalid_authority_metadata"]: "Invalid authorityMetadata provided. Must by a stringified JSON object containing authorization_endpoint, token_endpoint, issuer fields.",
      ["untrusted_authority"]: "The provided authority is not a trusted authority. Please include this authority in the knownAuthorities config parameter.",
      ["missing_ssh_jwk"]: "Missing sshJwk in SSH certificate request. A stringified JSON Web Key is required when using the SSH authentication scheme.",
      ["missing_ssh_kid"]: "Missing sshKid in SSH certificate request. A string that uniquely identifies the public SSH key is required when using the SSH authentication scheme.",
      ["missing_nonce_authentication_header"]: "Unable to find an authentication header containing server nonce. Either the Authentication-Info or WWW-Authenticate headers must be present in order to obtain a server nonce.",
      ["invalid_authentication_header"]: "Invalid authentication header provided",
      ["cannot_set_OIDCOptions"]: "Cannot set OIDCOptions parameter. Please change the protocol mode to OIDC or use a non-Microsoft authority.",
      ["cannot_allow_platform_broker"]: "Cannot set allowPlatformBroker parameter to true when not in AAD protocol mode.",
      ["authority_mismatch"]: "Authority mismatch error. Authority provided in login request or PublicClientApplication config does not match the environment of the provided account. Please use a matching account or make an interactive request to login to this authority.",
      ["invalid_authorize_post_body_parameters"]: "Invalid authorize post body parameters provided. If you are using authorizePostBodyParameters, the request method must be POST. Please check the request method and parameters.",
      ["invalid_request_method_for_EAR"]: "Invalid request method for EAR protocol mode. The request method cannot be GET when using EAR protocol mode. Please change the request method to POST."
    };
    ClientConfigurationErrorMessage = {
      redirectUriNotSet: {
        code: "redirect_uri_empty",
        desc: tx["redirect_uri_empty"]
      },
      claimsRequestParsingError: {
        code: "claims_request_parsing_error",
        desc: tx["claims_request_parsing_error"]
      },
      authorityUriInsecure: {
        code: "authority_uri_insecure",
        desc: tx["authority_uri_insecure"]
      },
      urlParseError: {
        code: "url_parse_error",
        desc: tx["url_parse_error"]
      },
      urlEmptyError: {
        code: "empty_url_error",
        desc: tx["empty_url_error"]
      },
      emptyScopesError: {
        code: "empty_input_scopes_error",
        desc: tx["empty_input_scopes_error"]
      },
      invalidClaimsRequest: {
        code: "invalid_claims",
        desc: tx["invalid_claims"]
      },
      tokenRequestEmptyError: {
        code: "token_request_empty",
        desc: tx["token_request_empty"]
      },
      logoutRequestEmptyError: {
        code: "logout_request_empty",
        desc: tx["logout_request_empty"]
      },
      invalidCodeChallengeMethod: {
        code: "invalid_code_challenge_method",
        desc: tx["invalid_code_challenge_method"]
      },
      invalidCodeChallengeParams: {
        code: "pkce_params_missing",
        desc: tx["pkce_params_missing"]
      },
      invalidCloudDiscoveryMetadata: {
        code: "invalid_cloud_discovery_metadata",
        desc: tx["invalid_cloud_discovery_metadata"]
      },
      invalidAuthorityMetadata: {
        code: "invalid_authority_metadata",
        desc: tx["invalid_authority_metadata"]
      },
      untrustedAuthority: {
        code: "untrusted_authority",
        desc: tx["untrusted_authority"]
      },
      missingSshJwk: {
        code: "missing_ssh_jwk",
        desc: tx["missing_ssh_jwk"]
      },
      missingSshKid: {
        code: "missing_ssh_kid",
        desc: tx["missing_ssh_kid"]
      },
      missingNonceAuthenticationHeader: {
        code: "missing_nonce_authentication_header",
        desc: tx["missing_nonce_authentication_header"]
      },
      invalidAuthenticationHeader: {
        code: "invalid_authentication_header",
        desc: tx["invalid_authentication_header"]
      },
      cannotSetOIDCOptions: {
        code: "cannot_set_OIDCOptions",
        desc: tx["cannot_set_OIDCOptions"]
      },
      cannotAllowPlatformBroker: {
        code: "cannot_allow_platform_broker",
        desc: tx["cannot_allow_platform_broker"]
      },
      authorityMismatch: {
        code: "authority_mismatch",
        desc: tx["authority_mismatch"]
      },
      invalidAuthorizePostBodyParameters: {
        code: "invalid_authorize_post_body_parameters",
        desc: tx["invalid_authorize_post_body_parameters"]
      },
      invalidRequestMethodForEAR: {
        code: "invalid_request_method_for_EAR",
        desc: tx["invalid_request_method_for_EAR"]
      }
    };
    ClientConfigurationError = class Zst extends AuthError {
      constructor(e) {
        super(e, tx[e]);
        this.name = "ClientConfigurationError";
        Object.setPrototypeOf(this, Zst.prototype);
      }
    };
  });
  class uv {
    static isEmptyObj(e) {
      if (e) {
        try {
          let t = JSON.parse(e);
          return Object.keys(t).length === 0;
        } catch (t) {}
      }
      return true;
    }
    static startsWith(e, t) {
      return e.indexOf(t) === 0;
    }
    static endsWith(e, t) {
      return e.length >= t.length && e.lastIndexOf(t) === e.length - t.length;
    }
    static queryStringToObject(e) {
      let t = {};
      let n = e.split("&");
      let r = o => decodeURIComponent(o.replace(/\+/g, " "));
      n.forEach(o => {
        if (o.trim()) {
          let [s, i] = o.split(/=(.+)/g, 2);
          if (s && i) {
            t[r(s)] = r(i);
          }
        }
      });
      return t;
    }
    static trimArrayEntries(e) {
      return e.map(t => t.trim());
    }
    static removeEmptyStringsFromArray(e) {
      return e.filter(t => !!t);
    }
    static jsonParseHelper(e) {
      try {
        return JSON.parse(e);
      } catch (t) {
        return null;
      }
    }
    static matchPattern(e, t) {
      return new RegExp(e.replace(/\\/g, "\\\\").replace(/\*/g, "[^ ]*").replace(/\?/g, "\\?")).test(t);
    }
  }
  var j0e = __lazy(() => {/*! @azure/msal-common v15.13.1 2025-10-29 */});
  class JA {
    constructor(e) {
      let t = e ? uv.trimArrayEntries([...e]) : [];
      let n = t ? uv.removeEmptyStringsFromArray(t) : [];
      if (!n || !n.length) {
        throw JT("empty_input_scopes_error");
      }
      this.scopes = new Set();
      n.forEach(r => this.scopes.add(r));
    }
    static fromString(e) {
      let n = (e || xo.EMPTY_STRING).split(" ");
      return new JA(n);
    }
    static createSearchScopes(e) {
      let t = e && e.length > 0 ? e : [...g2];
      let n = new JA(t);
      if (!n.containsOnlyOIDCScopes()) {
        n.removeOIDCScopes();
      } else {
        n.removeScope(xo.OFFLINE_ACCESS_SCOPE);
      }
      return n;
    }
    containsScope(e) {
      let t = this.printScopesLowerCase().split(" ");
      let n = new JA(t);
      return e ? n.scopes.vZc(e.toLowerCase()) : false;
    }
    containsScopeSet(e) {
      if (!e || e.scopes.size <= 0) {
        return false;
      }
      return this.scopes.size >= e.scopes.size && e.asArray().every(t => this.containsScope(t));
    }
    containsOnlyOIDCScopes() {
      let e = 0;
      X5r.forEach(t => {
        if (this.containsScope(t)) {
          e += 1;
        }
      });
      return this.scopes.size === e;
    }
    appendScope(e) {
      if (e) {
        this.scopes.add(e.trim());
      }
    }
    appendScopes(e) {
      try {
        e.forEach(t => this.appendScope(t));
      } catch (t) {
        throw rs("cannot_append_scopeset");
      }
    }
    removeScope(e) {
      if (!e) {
        throw rs("cannot_remove_empty_scope");
      }
      this.scopes.delete(e.trim());
    }
    removeOIDCScopes() {
      X5r.forEach(e => {
        this.scopes.delete(e);
      });
    }
    unionScopeSets(e) {
      if (!e) {
        throw rs("empty_input_scopeset");
      }
      let t = new Set();
      e.scopes.forEach(n => t.add(n.toLowerCase()));
      this.scopes.forEach(n => t.add(n.toLowerCase()));
      return t;
    }
    intersectingScopeSets(e) {
      if (!e) {
        throw rs("empty_input_scopeset");
      }
      if (!e.containsOnlyOIDCScopes()) {
        e.removeOIDCScopes();
      }
      let t = this.unionScopeSets(e);
      let n = e.getScopeCount();
      let r = this.getScopeCount();
      return t.size < r + n;
    }
    getScopeCount() {
      return this.scopes.size;
    }
    asArray() {
      let e = [];
      this.scopes.forEach(t => e.push(t));
      return e;
    }
    printScopes() {
      if (this.scopes) {
        return this.asArray().join(" ");
      }
      return xo.EMPTY_STRING;
    }
    printScopesLowerCase() {
      return this.printScopes().toLowerCase();
    }
  }
  var iUt = __lazy(() => {
    H0e();
    j0e();
    YP();
    aw();
    j_e();
    RI(); /*! @azure/msal-common v15.13.1 2025-10-29 */
  });
  function eit(e, t) {
    if (!e) {
      throw rs("client_info_empty_error");
    }
    try {
      let n = t(e);
      return JSON.parse(n);
    } catch (n) {
      throw rs("client_info_decoding_error");
    }
  }
  function mce(e) {
    if (!e) {
      throw rs("client_info_decoding_error");
    }
    let t = e.split(N_e.CLIENT_INFO_SEPARATOR, 2);
    return {
      uid: t[0],
      utid: t.length < 2 ? xo.EMPTY_STRING : t[1]
    };
  }
  var tit = __lazy(() => {
    YP();
    aw();
    RI(); /*! @azure/msal-common v15.13.1 2025-10-29 */
  });
  function QEi(e, t) {
    return !!e && !!t && e === t.split(".")[1];
  }
  function aUt(e, t, n, r) {
    if (r) {
      let {
        oid: o,
        sub: s,
        tid: i,
        name: a,
        tfp: l,
        acr: c,
        preferred_username: u,
        upn: d,
        login_hint: p
      } = r;
      let m = i || l || c || "";
      return {
        tenantId: m,
        localAccountId: o || s || "",
        name: a,
        username: u || d || "",
        loginHint: p,
        isHomeTenant: QEi(m, e)
      };
    } else {
      return {
        tenantId: n,
        localAccountId: t,
        username: "",
        isHomeTenant: QEi(n, e)
      };
    }
  }
  function ukn(e, t, n, r) {
    let o = e;
    if (t) {
      let {
        isHomeTenant: s,
        ...i
      } = t;
      o = {
        ...e,
        ...i
      };
    }
    if (n) {
      let {
        isHomeTenant: s,
        ...i
      } = aUt(e.homeAccountId, e.localAccountId, e.tenantId, n);
      o = {
        ...o,
        ...i,
        idTokenClaims: n,
        idToken: r
      };
      return o;
    }
    return o;
  }
  var dkn = __lazy(() => {/*! @azure/msal-common v15.13.1 2025-10-29 */});
  var XY;
  var o6r = __lazy(() => {
    /*! @azure/msal-common v15.13.1 2025-10-29 */XY = {
      Default: 0,
      Adfs: 1,
      Dsts: 2,
      Ciam: 3
    };
  });
  function pkn(e) {
    if (e) {
      return e.tid || e.tfp || e.acr || null;
    }
    return null;
  }
  var s6r = __lazy(() => {/*! @azure/msal-common v15.13.1 2025-10-29 */});
  var ProtocolMode;
  var lUt = __lazy(() => {
    /*! @azure/msal-common v15.13.1 2025-10-29 */ProtocolMode = {
      AAD: "AAD",
      OIDC: "OIDC",
      EAR: "EAR"
    };
  });
  class JP {
    static getAccountInfo(e) {
      return {
        homeAccountId: e.homeAccountId,
        environment: e.environment,
        tenantId: e.realm,
        username: e.username,
        localAccountId: e.localAccountId,
        loginHint: e.loginHint,
        name: e.name,
        nativeAccountId: e.nativeAccountId,
        authorityType: e.authorityType,
        tenantProfiles: new Map((e.tenantProfiles || []).map(t => [t.tenantId, t])),
        dataBoundary: e.dataBoundary
      };
    }
    isSingleTenant() {
      return !this.tenantProfiles;
    }
    static createAccount(e, t, n) {
      let r = new JP();
      if (t.authorityType === XY.Adfs) {
        r.authorityType = Zqe.ADFS_ACCOUNT_TYPE;
      } else if (t.protocolMode === ProtocolMode.OIDC) {
        r.authorityType = Zqe.GENERIC_ACCOUNT_TYPE;
      } else {
        r.authorityType = Zqe.MSSTS_ACCOUNT_TYPE;
      }
      let o;
      if (e.clientInfo && n) {
        if (o = eit(e.clientInfo, n), o.xms_tdbr) {
          r.dataBoundary = o.xms_tdbr === "EU" ? "EU" : "None";
        }
      }
      r.clientInfo = e.clientInfo;
      r.homeAccountId = e.homeAccountId;
      r.nativeAccountId = e.nativeAccountId;
      let s = e.environment || t && t.getPreferredCache();
      if (!s) {
        throw rs("invalid_cache_environment");
      }
      r.environment = s;
      r.realm = o?.utid || pkn(e.idTokenClaims) || "";
      r.localAccountId = o?.uid || e.idTokenClaims?.oid || e.idTokenClaims?.sub || "";
      let i = e.idTokenClaims?.preferred_username || e.idTokenClaims?.upn;
      let a = e.idTokenClaims?.emails ? e.idTokenClaims.emails[0] : null;
      if (r.username = i || a || "", r.loginHint = e.idTokenClaims?.login_hint, r.name = e.idTokenClaims?.name || "", r.cloudGraphHostName = e.cloudGraphHostName, r.msGraphHost = e.msGraphHost, e.tenantProfiles) {
        r.tenantProfiles = e.tenantProfiles;
      } else {
        let l = aUt(e.homeAccountId, r.localAccountId, r.realm, e.idTokenClaims);
        r.tenantProfiles = [l];
      }
      return r;
    }
    static createFromAccountInfo(e, t, n) {
      let r = new JP();
      r.authorityType = e.authorityType || Zqe.GENERIC_ACCOUNT_TYPE;
      r.homeAccountId = e.homeAccountId;
      r.localAccountId = e.localAccountId;
      r.nativeAccountId = e.nativeAccountId;
      r.realm = e.tenantId;
      r.environment = e.environment;
      r.username = e.username;
      r.name = e.name;
      r.loginHint = e.loginHint;
      r.cloudGraphHostName = t;
      r.msGraphHost = n;
      r.tenantProfiles = Array.from(e.tenantProfiles?.values() || []);
      r.dataBoundary = e.dataBoundary;
      return r;
    }
    static generateHomeAccountId(e, t, n, r, o) {
      if (!(t === XY.Adfs || t === XY.Dsts)) {
        if (e) {
          try {
            let s = eit(e, r.base64Decode);
            if (s.uid && s.utid) {
              return `${s.uid}.${s.utid}`;
            }
          } catch (s) {}
        }
        n.warning("No client info in response");
      }
      return o?.sub || "";
    }
    static isAccountEntity(e) {
      if (!e) {
        return false;
      }
      return e.hasOwnProperty("homeAccountId") && e.hasOwnProperty("environment") && e.hasOwnProperty("realm") && e.hasOwnProperty("localAccountId") && e.hasOwnProperty("username") && e.hasOwnProperty("authorityType");
    }
    static accountInfoIsEqual(e, t, n) {
      if (!e || !t) {
        return false;
      }
      let r = true;
      if (n) {
        let o = e.idTokenClaims || {};
        let s = t.idTokenClaims || {};
        r = o.iat === s.iat && o.nonce === s.nonce;
      }
      return e.homeAccountId === t.homeAccountId && e.localAccountId === t.localAccountId && e.username === t.username && e.tenantId === t.tenantId && e.loginHint === t.loginHint && e.environment === t.environment && e.nativeAccountId === t.nativeAccountId && r;
    }
  }
  var mkn = __lazy(() => {
    aw();
    tit();
    dkn();
    YP();
    o6r();
    s6r();
    lUt();
    RI(); /*! @azure/msal-common v15.13.1 2025-10-29 */
  });
  var fkn = {};