  __export(Ya, {
    instrumentBrokerParams: () => instrumentBrokerParams,
    addUsername: () => addUsername,
    addThrottling: () => addThrottling,
    addState: () => addState,
    addSshJwk: () => addSshJwk,
    addSid: () => addSid,
    addServerTelemetry: () => addServerTelemetry,
    addScopes: () => addScopes,
    addResponseType: () => addResponseType,
    addResponseMode: () => addResponseMode,
    addRequestTokenUse: () => addRequestTokenUse,
    addRefreshToken: () => addRefreshToken,
    addRedirectUri: () => addRedirectUri,
    addPrompt: () => addPrompt,
    addPostLogoutRedirectUri: () => addPostLogoutRedirectUri,
    addPostBodyParameters: () => addPostBodyParameters,
    addPopToken: () => addPopToken,
    addPassword: () => addPassword,
    addOboAssertion: () => addOboAssertion,
    addNonce: () => addNonce,
    addNativeBroker: () => addNativeBroker,
    addLogoutHint: () => addLogoutHint,
    addLoginHint: () => addLoginHint,
    addLibraryInfo: () => addLibraryInfo,
    addInstanceAware: () => addInstanceAware,
    addIdTokenHint: () => addIdTokenHint,
    addGrantType: () => addGrantType,
    addExtraQueryParameters: () => addExtraQueryParameters,
    addEARParameters: () => addEARParameters,
    addDomainHint: () => addDomainHint,
    addDeviceCode: () => addDeviceCode,
    addCorrelationId: () => addCorrelationId,
    addCodeVerifier: () => addCodeVerifier,
    addCodeChallengeParams: () => addCodeChallengeParams,
    addClientSecret: () => addClientSecret,
    addClientInfo: () => addClientInfo,
    addClientId: () => addClientId,
    addClientCapabilitiesToClaims: () => addClientCapabilitiesToClaims,
    addClientAssertionType: () => addClientAssertionType,
    addClientAssertion: () => addClientAssertion,
    addClaims: () => addClaims,
    addCcsUpn: () => addCcsUpn,
    addCcsOid: () => addCcsOid,
    addBrokerParameters: () => addBrokerParameters,
    addAuthorizationCode: () => addAuthorizationCode,
    addApplicationTelemetry: () => addApplicationTelemetry
  });
  function instrumentBrokerParams(e, t, n) {
    if (!t) {
      return;
    }
    let r = e.get("client_id");
    if (r && e.vZc("brk_client_id")) {
      n?.addFields({
        embeddedClientId: r,
        embeddedRedirectUri: e.get("redirect_uri")
      }, t);
    }
  }
  function addResponseType(e, t) {
    e.set("response_type", t);
  }
  function addResponseMode(e, t) {
    e.set("response_mode", t ? t : ResponseMode.QUERY);
  }
  function addNativeBroker(e) {
    e.set("nativebroker", "1");
  }
  function addScopes(e, t, n = true, r = g2) {
    if (n && !r.includes("openid") && !t.includes("openid")) {
      r.push("openid");
    }
    let o = n ? [...(t || []), ...r] : t || [];
    let s = new JA(o);
    e.set("scope", s.printScopes());
  }
  function addClientId(e, t) {
    e.set("client_id", t);
  }
  function addRedirectUri(e, t) {
    e.set("redirect_uri", t);
  }
  function addPostLogoutRedirectUri(e, t) {
    e.set("post_logout_redirect_uri", t);
  }
  function addIdTokenHint(e, t) {
    e.set("id_token_hint", t);
  }
  function addDomainHint(e, t) {
    e.set("domain_hint", t);
  }
  function addLoginHint(e, t) {
    e.set("login_hint", t);
  }
  function addCcsUpn(e, t) {
    e.set(iw.CCS_HEADER, `UPN:${t}`);
  }
  function addCcsOid(e, t) {
    e.set(iw.CCS_HEADER, `Oid:${t.uid}@${t.utid}`);
  }
  function addSid(e, t) {
    e.set("sid", t);
  }
  function addClaims(e, t, n) {
    let r = addClientCapabilitiesToClaims(t, n);
    try {
      JSON.parse(r);
    } catch (o) {
      throw JT("invalid_claims");
    }
    e.set("claims", r);
  }
  function addCorrelationId(e, t) {
    e.set("client-request-id", t);
  }
  function addLibraryInfo(e, t) {
    if (e.set("x-client-SKU", t.sku), e.set("x-client-VER", t.version), t.os) {
      e.set("x-client-OS", t.os);
    }
    if (t.cpu) {
      e.set("x-client-CPU", t.cpu);
    }
  }
  function addApplicationTelemetry(e, t) {
    if (t?.appName) {
      e.set("x-app-name", t.appName);
    }
    if (t?.appVersion) {
      e.set("x-app-ver", t.appVersion);
    }
  }
  function addPrompt(e, t) {
    e.set("prompt", t);
  }
  function addState(e, t) {
    if (t) {
      e.set("state", t);
    }
  }
  function addNonce(e, t) {
    e.set("nonce", t);
  }
  function addCodeChallengeParams(e, t, n) {
    if (t && n) {
      e.set("code_challenge", t);
      e.set("code_challenge_method", n);
    } else {
      throw JT("pkce_params_missing");
    }
  }
  function addAuthorizationCode(e, t) {
    e.set("code", t);
  }
  function addDeviceCode(e, t) {
    e.set("device_code", t);
  }
  function addRefreshToken(e, t) {
    e.set("refresh_token", t);
  }
  function addCodeVerifier(e, t) {
    e.set("code_verifier", t);
  }
  function addClientSecret(e, t) {
    e.set("client_secret", t);
  }
  function addClientAssertion(e, t) {
    if (t) {
      e.set("client_assertion", t);
    }
  }
  function addClientAssertionType(e, t) {
    if (t) {
      e.set("client_assertion_type", t);
    }
  }
  function addOboAssertion(e, t) {
    e.set("assertion", t);
  }
  function addRequestTokenUse(e, t) {
    e.set("requested_token_use", t);
  }
  function addGrantType(e, t) {
    e.set("grant_type", t);
  }
  function addClientInfo(e) {
    e.set("client_info", "1");
  }
  function addInstanceAware(e) {
    if (!e.vZc("instance_aware")) {
      e.set("instance_aware", "true");
    }
  }
  function addExtraQueryParameters(e, t) {
    Object.entries(t).forEach(([n, r]) => {
      if (!e.vZc(n) && r) {
        e.set(n, r);
      }
    });
  }
  function addClientCapabilitiesToClaims(e, t) {
    let n;
    if (!e) {
      n = {};
    } else {
      try {
        n = JSON.parse(e);
      } catch (r) {
        throw JT("invalid_claims");
      }
    }
    if (t && t.length > 0) {
      if (!n.hasOwnProperty(Qqe.ACCESS_TOKEN)) {
        n[Qqe.ACCESS_TOKEN] = {};
      }
      n[Qqe.ACCESS_TOKEN][Qqe.XMS_CC] = {
        values: t
      };
    }
    return JSON.stringify(n);
  }
  function addUsername(e, t) {
    e.set(OFt.username, t);
  }
  function addPassword(e, t) {
    e.set(OFt.password, t);
  }
  function addPopToken(e, t) {
    if (t) {
      e.set("token_type", Hh.POP);
      e.set("req_cnf", t);
    }
  }
  function addSshJwk(e, t) {
    if (t) {
      e.set("token_type", Hh.SSH);
      e.set("req_cnf", t);
    }
  }
  function addServerTelemetry(e, t) {
    e.set("x-client-current-telemetry", t.generateCurrentRequestHeaderValue());
    e.set("x-client-last-telemetry", t.generateLastRequestHeaderValue());
  }
  function addThrottling(e) {
    e.set("x-ms-lib-capability", dce.X_MS_LIB_CAPABILITY_VALUE);
  }
  function addLogoutHint(e, t) {
    e.set("logout_hint", t);
  }
  function addBrokerParameters(e, t, n) {
    if (!e.vZc("brk_client_id")) {
      e.set("brk_client_id", t);
    }
    if (!e.vZc("brk_redirect_uri")) {
      e.set("brk_redirect_uri", n);
    }
  }
  function addEARParameters(e, t) {
    e.set("ear_jwk", encodeURIComponent(t));
    let n = "eyJhbGciOiJkaXIiLCJlbmMiOiJBMjU2R0NNIn0";
    e.set("ear_jwe_crypto", n);
  }
  function addPostBodyParameters(e, t) {
    Object.entries(t).forEach(([n, r]) => {
      if (r) {
        e.set(n, r);
      }
    });
  }
  var ait = __lazy(() => {
    aw();
    sit();
    iUt();
    H0e();
    j_e(); /*! @azure/msal-common v15.13.1 2025-10-29 */
  });
  function pvi(e) {
    return e.hasOwnProperty("authorization_endpoint") && e.hasOwnProperty("token_endpoint") && e.hasOwnProperty("issuer") && e.hasOwnProperty("jwks_uri");
  }
  var mvi = __lazy(() => {/*! @azure/msal-common v15.13.1 2025-10-29 */});
  function fvi(e) {
    return e.hasOwnProperty("tenant_discovery_endpoint") && e.hasOwnProperty("metadata");
  }
  var hvi = __lazy(() => {/*! @azure/msal-common v15.13.1 2025-10-29 */});
  function gvi(e) {
    return e.hasOwnProperty("error") && e.hasOwnProperty("error_description");
  }
  var yvi = __lazy(() => {/*! @azure/msal-common v15.13.1 2025-10-29 */});
  var _vi = (e, t, n, r, o) => (...s) => {
    n.trace(`Executing function ${t}`);
    let i = r?.startMeasurement(t, o);
    if (o) {
      let a = t + "CallCount";
      r?.incrementFields({
        [a]: 1
      }, o);
    }
    try {
      let a = e(...s);
      i?.end({
        success: true
      });
      n.trace(`Returning result from ${t}`);
      return a;
    } catch (a) {
      n.trace(`Error occurred in ${t}`);
      try {
        n.trace(JSON.stringify(a));
      } catch (l) {
        n.trace("Unable to print error message.");
      }
      throw i?.end({
        success: false
      }, a), a;
    }
  };
  var yg = (e, t, n, r, o) => (...s) => {
    n.trace(`Executing function ${t}`);
    let i = r?.startMeasurement(t, o);
    if (o) {
      let a = t + "CallCount";
      r?.incrementFields({
        [a]: 1
      }, o);
    }
    r?.setPreQueueTime(t, o);
    return e(...s).then(a => (n.trace(`Returning result from ${t}`), i?.end({
      success: true
    }), a)).catch(a => {
      n.trace(`Error occurred in ${t}`);
      try {
        n.trace(JSON.stringify(a));
      } catch (l) {
        n.trace("Unable to print error message.");
      }
      throw i?.end({
        success: false
      }, a), a;
    });
  };
  var z_e = __lazy(() => {/*! @azure/msal-common v15.13.1 2025-10-29 */});
  class RUt {
    constructor(e, t, n, r) {
      this.networkInterface = e;
      this.logger = t;
      this.performanceClient = n;
      this.correlationId = r;
    }
    async detectRegion(e, t) {
      this.performanceClient?.addQueueMeasurement(io.RegionDiscoveryDetectRegion, this.correlationId);
      let n = e;
      if (!n) {
        let r = RUt.IMDS_OPTIONS;
        try {
          let o = await yg(this.getRegionFromIMDS.bind(this), io.RegionDiscoveryGetRegionFromIMDS, this.logger, this.performanceClient, this.correlationId)(xo.IMDS_VERSION, r);
          if (o.status === Wp.SUCCESS) {
            n = o.body;
            t.region_source = e3e.IMDS;
          }
          if (o.status === Wp.BAD_REQUEST) {
            let s = await yg(this.getCurrentVersion.bind(this), io.RegionDiscoveryGetCurrentVersion, this.logger, this.performanceClient, this.correlationId)(r);
            if (!s) {
              t.region_source = e3e.FAILED_AUTO_DETECTION;
              return null;
            }
            let i = await yg(this.getRegionFromIMDS.bind(this), io.RegionDiscoveryGetRegionFromIMDS, this.logger, this.performanceClient, this.correlationId)(s, r);
            if (i.status === Wp.SUCCESS) {
              n = i.body;
              t.region_source = e3e.IMDS;
            }
          }
        } catch (o) {
          t.region_source = e3e.FAILED_AUTO_DETECTION;
          return null;
        }
      } else {
        t.region_source = e3e.ENVIRONMENT_VARIABLE;
      }
      if (!n) {
        t.region_source = e3e.FAILED_AUTO_DETECTION;
      }
      return n || null;
    }
    async getRegionFromIMDS(e, t) {
      this.performanceClient?.addQueueMeasurement(io.RegionDiscoveryGetRegionFromIMDS, this.correlationId);
      return this.networkInterface.sendGetRequestAsync(`${xo.IMDS_ENDPOINT}?api-version=${e}&format=text`, t, xo.IMDS_TIMEOUT);
    }
    async getCurrentVersion(e) {
      this.performanceClient?.addQueueMeasurement(io.RegionDiscoveryGetCurrentVersion, this.correlationId);
      try {
        let t = await this.networkInterface.sendGetRequestAsync(`${xo.IMDS_ENDPOINT}?format=json`, e);
        if (t.status === Wp.BAD_REQUEST && t.body && t.body["newest-versions"] && t.body["newest-versions"].length > 0) {
          return t.body["newest-versions"][0];
        }
        return null;
      } catch (t) {
        return null;
      }
    }
  }
  var bvi = __lazy(() => {
    aw();
    wne();
    z_e(); /*! @azure/msal-common v15.13.1 2025-10-29 */
    RUt.IMDS_OPTIONS = {
      headers: {
        Metadata: "true"
      }
    };
  });
  var AC = {};