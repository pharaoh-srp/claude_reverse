  var X2r;
  var Q2r;
  var l9s;
  var c9s = (e, {
    profile: t = "default",
    logger: n
  } = {}) => Boolean(e) && typeof e === "object" && typeof e.role_arn === "string" && ["undefined", "string"].indexOf(typeof e.role_session_name) > -1 && ["undefined", "string"].indexOf(typeof e.external_id) > -1 && ["undefined", "string"].indexOf(typeof e.mfa_serial) > -1 && (Rrd(e, {
    profile: t,
    logger: n
  }) || xrd(e, {
    profile: t,
    logger: n
  }));
  var Rrd = (e, {
    profile: t,
    logger: n
  }) => {
    let r = typeof e.source_profile === "string" && typeof e.credential_source > "u";
    if (r) {
      n?.debug?.(`    ${t} isAssumeRoleWithSourceProfile source_profile=${e.source_profile}`);
    }
    return r;
  };
  var xrd = (e, {
    profile: t,
    logger: n
  }) => {
    let r = typeof e.credential_source === "string" && typeof e.source_profile > "u";
    if (r) {
      n?.debug?.(`    ${t} isCredentialSourceProfile credential_source=${e.credential_source}`);
    }
    return r;
  };
  var u9s = async (e, t, n, r = {}, o) => {
    n.logger?.debug("@aws-sdk/credential-provider-ini - resolveAssumeRoleCredentials (STS)");
    let s = t[e];
    let {
      source_profile: i,
      region: a
    } = s;
    if (!n.roleAssumer) {
      let {
        getDefaultRoleAssumer: c
      } = await Promise.resolve().then(() => __toESM(LSn(), 1));
      n.roleAssumer = c({
        ...n.clientConfig,
        credentialProviderLogger: n.logger,
        parentClientConfig: {
          ...n?.parentClientConfig,
          region: a ?? n?.parentClientConfig?.region
        }
      }, n.clientPlugins);
    }
    if (i && i in r) {
      throw new Q2r.CredentialsProviderError(`Detected a cycle attempting to resolve credentials for profile ${l9s.getProfileName(n)}. Profiles visited: ` + Object.keys(r).join(", "), {
        logger: n.logger
      });
    }
    n.logger?.debug(`@aws-sdk/credential-provider-ini - finding credential resolver using ${i ? `source_profile=[${i}]` : `profile=[${e}]`}`);
    let l = i ? o(i, t, n, {
      ...r,
      [i]: true
    }, a9s(t[i] ?? {})) : (await VWs(s.credential_source, e, n.logger)(n))();
    if (a9s(s)) {
      return l.then(c => X2r.setCredentialFeature(c, "CREDENTIALS_PROFILE_SOURCE_PROFILE", "o"));
    } else {
      let c = {
        RoleArn: s.role_arn,
        RoleSessionName: s.role_session_name || `aws-sdk-js-${Date.now()}`,
        ExternalId: s.external_id,
        DurationSeconds: parseInt(s.duration_seconds || "3600", 10)
      };
      let {
        mfa_serial: u
      } = s;
      if (u) {
        if (!n.mfaCodeProvider) {
          throw new Q2r.CredentialsProviderError(`Profile ${e} requires multi-factor authentication, but no MFA code callback was provided.`, {
            logger: n.logger,
            tryNextLink: false
          });
        }
        c.SerialNumber = u;
        c.TokenCode = await n.mfaCodeProvider(u);
      }
      let d = await l;
      return n.roleAssumer(d, c).then(p => X2r.setCredentialFeature(p, "CREDENTIALS_PROFILE_SOURCE_PROFILE", "o"));
    }
  };
  var a9s = e => !e.role_arn && !!e.credential_source;
  var d9s = __lazy(() => {
    zWs();
    X2r = __toESM(UP(), 1);
    Q2r = __toESM(wy(), 1);
    l9s = __toESM(Sj(), 1);
  });
  var p9s = () => {};
  var m9s = () => {};
  var f9s = () => {};
  class e1t {
    method;
    protocol;
    hostname;
    port;
    path;
    query;
    headers;
    username;
    password;
    fragment;
    body;
    constructor(e) {
      this.method = e.method || "GET";
      this.hostname = e.hostname || "localhost";
      this.port = e.port;
      this.query = e.query || {};
      this.headers = e.headers || {};
      this.body = e.body;
      this.protocol = e.protocol ? e.protocol.slice(-1) !== ":" ? `${e.protocol}:` : e.protocol : "https:";
      this.path = e.path ? e.path.charAt(0) !== "/" ? `/${e.path}` : e.path : "/";
      this.username = e.username;
      this.password = e.password;
      this.fragment = e.fragment;
    }
    static clone(e) {
      let t = new e1t({
        ...e,
        headers: {
          ...e.headers
        }
      });
      if (t.query) {
        t.query = krd(t.query);
      }
      return t;
    }
    static isInstance(e) {
      if (!e) {
        return false;
      }
      let t = e;
      return "method" in t && "protocol" in t && "hostname" in t && "path" in t && typeof t.query === "object" && typeof t.headers === "object";
    }
    clone() {
      return e1t.clone(this);
    }
  }
  function krd(e) {
    return Object.keys(e).reduce((t, n) => {
      let r = e[n];
      return {
        ...t,
        [n]: Array.isArray(r) ? [...r] : r
      };
    }, {});
  }
  var h9s = () => {};
  var g9s = __lazy(() => {
    p9s();
    m9s();
    f9s();
    h9s();
  });
  var e$r = __commonJS(OAe => {
    Object.defineProperty(OAe, "__esModule", {
      value: true
    });
    OAe.resolveHttpAuthSchemeConfig = OAe.defaultSigninHttpAuthSchemeProvider = OAe.defaultSigninHttpAuthSchemeParametersProvider = undefined;
    var Ard = nw();
    var Z2r = zB();
    var Ird = async (e, t, n) => ({
      operation: (0, Z2r.getSmithyContext)(t).operation,
      region: (await (0, Z2r.normalizeProvider)(e.region)()) || (() => {
        throw Error("expected `region` to be configured for `aws.auth#sigv4`");
      })()
    });
    OAe.defaultSigninHttpAuthSchemeParametersProvider = Ird;
    function Prd(e) {
      return {
        schemeId: "aws.auth#sigv4",
        signingProperties: {
          name: "signin",
          region: e.region
        },
        propertiesExtractor: (t, n) => ({
          signingProperties: {
            config: t,
            context: n
          }
        })
      };
    }
    function Ord(e) {
      return {
        schemeId: "smithy.api#noAuth"
      };
    }
    var Drd = e => {
      let t = [];
      switch (e.operation) {
        case "CreateOAuth2Token":
          {
            t.push(Ord(e));
            break;
          }
        default:
          t.push(Prd(e));
      }
      return t;
    };
    OAe.defaultSigninHttpAuthSchemeProvider = Drd;
    var Mrd = e => {
      let t = (0, Ard.resolveAwsSdkSigV4Config)(e);
      return Object.assign(t, {
        authSchemePreference: (0, Z2r.normalizeProvider)(e.authSchemePreference ?? [])
      });
    };
    OAe.resolveHttpAuthSchemeConfig = Mrd;
  });