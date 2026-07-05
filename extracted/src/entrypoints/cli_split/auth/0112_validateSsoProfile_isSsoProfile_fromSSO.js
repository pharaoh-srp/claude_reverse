  __export(UWs, {
    SSOClient: () => SSOClient,
    GetRoleCredentialsCommand: () => GetRoleCredentialsCommand
  });
  var BWs = __lazy(() => {
    FWs();
  });
  var A2r;
  var Mrt;
  var $Ws;
  var I2r = async ({
    ssoStartUrl: e,
    ssoSession: t,
    ssoAccountId: n,
    ssoRegion: r,
    ssoRoleName: o,
    ssoClient: s,
    clientConfig: i,
    parentClientConfig: a,
    profile: l,
    filepath: c,
    configFilepath: u,
    ignoreCache: d,
    logger: p
  }) => {
    let m;
    let f = "To refresh this SSO session run aws sso login with the corresponding profile.";
    if (t) {
      try {
        let O = await tSn({
          profile: l,
          filepath: c,
          configFilepath: u,
          ignoreCache: d
        })();
        m = {
          accessToken: O.token,
          expiresAt: new Date(O.expiration).toISOString()
        };
      } catch (O) {
        throw new Mrt.CredentialsProviderError(O.message, {
          tryNextLink: false,
          logger: p
        });
      }
    } else {
      try {
        m = await $Ws.getSSOTokenFromFile(e);
      } catch (O) {
        throw new Mrt.CredentialsProviderError("The SSO session associated with this profile is invalid. To refresh this SSO session run aws sso login with the corresponding profile.", {
          tryNextLink: false,
          logger: p
        });
      }
    }
    if (new Date(m.expiresAt).getTime() - Date.now() <= 0) {
      throw new Mrt.CredentialsProviderError("The SSO session associated with this profile has expired. To refresh this SSO session run aws sso login with the corresponding profile.", {
        tryNextLink: false,
        logger: p
      });
    }
    let {
      accessToken: h
    } = m;
    let {
      SSOClient: g,
      GetRoleCredentialsCommand: y
    } = await Promise.resolve().then(() => (BWs(), UWs));
    let _ = s || new g(Object.assign({}, i ?? {}, {
      logger: i?.logger ?? a?.logger,
      region: i?.region ?? r,
      userAgentAppId: i?.userAgentAppId ?? a?.userAgentAppId
    }));
    let b;
    try {
      b = await _.send(new y({
        accountId: n,
        roleName: o,
        accessToken: h
      }));
    } catch (O) {
      throw new Mrt.CredentialsProviderError(O, {
        tryNextLink: false,
        logger: p
      });
    }
    let {
      roleCredentials: {
        accessKeyId: S,
        secretAccessKey: E,
        sessionToken: C,
        expiration: x,
        credentialScope: A,
        accountId: k
      } = {}
    } = b;
    if (!S || !E || !C || !x) {
      throw new Mrt.CredentialsProviderError("SSO returns an invalid temporary credential.", {
        tryNextLink: false,
        logger: p
      });
    }
    let I = {
      accessKeyId: S,
      secretAccessKey: E,
      sessionToken: C,
      expiration: new Date(x),
      ...(A && {
        credentialScope: A
      }),
      ...(k && {
        accountId: k
      })
    };
    if (t) {
      A2r.setCredentialFeature(I, "CREDENTIALS_SSO", "s");
    } else {
      A2r.setCredentialFeature(I, "CREDENTIALS_SSO_LEGACY", "u");
    }
    return I;
  };
  var HWs = __lazy(() => {
    rSn();
    A2r = __toESM(UP(), 1);
    Mrt = __toESM(wy(), 1);
    $Ws = __toESM(Sj(), 1);
  });
  var jWs;
  var validateSsoProfile = (e, t) => {
    let {
      sso_start_url: n,
      sso_account_id: r,
      sso_region: o,
      sso_role_name: s
    } = e;
    if (!n || !r || !o || !s) {
      throw new jWs.CredentialsProviderError(`Profile is configured with invalid SSO credentials. Required parameters "sso_account_id", "sso_region", "sso_role_name", "sso_start_url". Got ${Object.keys(e).join(", ")}
Reference: https://docs.aws.amazon.com/cli/latest/userguide/cli-configure-sso.html`, {
        tryNextLink: false,
        logger: t
      });
    }
    return e;
  };
  var O2r = __lazy(() => {
    jWs = __toESM(wy(), 1);
  });
  var Nrt;
  var Lrt;
  var fromSSO = (e = {}) => async ({
    callerClientConfig: t
  } = {}) => {
    e.logger?.debug("@aws-sdk/credential-provider-sso - fromSSO");
    let {
      ssoStartUrl: n,
      ssoAccountId: r,
      ssoRegion: o,
      ssoRoleName: s,
      ssoSession: i
    } = e;
    let {
      ssoClient: a
    } = e;
    let l = Lrt.getProfileName({
      profile: e.profile ?? t?.profile
    });
    if (!n && !r && !o && !s && !i) {
      let u = (await Lrt.parseKnownFiles(e))[l];
      if (!u) {
        throw new Nrt.CredentialsProviderError(`Profile ${l} was not found.`, {
          logger: e.logger
        });
      }
      if (!isSsoProfile(u)) {
        throw new Nrt.CredentialsProviderError(`Profile ${l} is not configured with SSO credentials.`, {
          logger: e.logger
        });
      }
      if (u?.sso_session) {
        let y = (await Lrt.loadSsoSessionData(e))[u.sso_session];
        let _ = ` configurations in profile ${l} and sso-session ${u.sso_session}`;
        if (o && o !== y.sso_region) {
          throw new Nrt.CredentialsProviderError("Conflicting SSO region" + _, {
            tryNextLink: false,
            logger: e.logger
          });
        }
        if (n && n !== y.sso_start_url) {
          throw new Nrt.CredentialsProviderError("Conflicting SSO start_url" + _, {
            tryNextLink: false,
            logger: e.logger
          });
        }
        u.sso_region = y.sso_region;
        u.sso_start_url = y.sso_start_url;
      }
      let {
        sso_start_url: d,
        sso_account_id: p,
        sso_region: m,
        sso_role_name: f,
        sso_session: h
      } = validateSsoProfile(u, e.logger);
      return I2r({
        ssoStartUrl: d,
        ssoSession: h,
        ssoAccountId: p,
        ssoRegion: m,
        ssoRoleName: f,
        ssoClient: a,
        clientConfig: e.clientConfig,
        parentClientConfig: e.parentClientConfig,
        profile: l,
        filepath: e.filepath,
        configFilepath: e.configFilepath,
        ignoreCache: e.ignoreCache,
        logger: e.logger
      });
    } else if (!n || !r || !o || !s) {
      throw new Nrt.CredentialsProviderError('Incomplete configuration. The fromSSO() argument hash must include "ssoStartUrl", "ssoAccountId", "ssoRegion", "ssoRoleName"', {
        tryNextLink: false,
        logger: e.logger
      });
    } else {
      return I2r({
        ssoStartUrl: n,
        ssoSession: i,
        ssoAccountId: r,
        ssoRegion: o,
        ssoRoleName: s,
        ssoClient: a,
        clientConfig: e.clientConfig,
        parentClientConfig: e.parentClientConfig,
        profile: l,
        filepath: e.filepath,
        configFilepath: e.configFilepath,
        ignoreCache: e.ignoreCache,
        logger: e.logger
      });
    }
  };
  var qWs = __lazy(() => {
    HWs();
    O2r();
    Nrt = __toESM(wy(), 1);
    Lrt = __toESM(Sj(), 1);
  });
  var WWs = () => {};
  var M2r = {};
  __export(M2r, {
    validateSsoProfile: () => validateSsoProfile,
    isSsoProfile: () => isSsoProfile,
    fromSSO: () => fromSSO
  });
  var RSn = __lazy(() => {
    qWs();
    WWs();
    O2r();
  });
  var GWs;
  var xSn;
  var VWs = (e, t, n) => {
    let r = {
      EcsContainer: async o => {
        let {
          fromHttp: s
        } = await Promise.resolve().then(() => (X_n(), eUr));
        let {
          fromContainerMetadata: i
        } = await Promise.resolve().then(() => (Dje(), dNt));
        n?.debug("@aws-sdk/credential-provider-ini - credential_source is EcsContainer");
        return async () => xSn.chain(s(o ?? {}), i(o))().then(N2r);
      },
      Ec2InstanceMetadata: async o => {
        n?.debug("@aws-sdk/credential-provider-ini - credential_source is Ec2InstanceMetadata");
        let {
          fromInstanceMetadata: s
        } = await Promise.resolve().then(() => (Dje(), dNt));
        return async () => s(o)().then(N2r);
      },
      Environment: async o => {
        n?.debug("@aws-sdk/credential-provider-ini - credential_source is Environment");
        let {
          fromEnv: s
        } = await Promise.resolve().then(() => (r_n(), rMs));
        return async () => s(o)().then(N2r);
      }
    };
    if (e in r) {
      return r[e];
    } else {
      throw new xSn.CredentialsProviderError(`Unsupported credential source in profile ${t}. Got ${e}, expected EcsContainer or Ec2InstanceMetadata or Environment.`, {
        logger: n
      });
    }
  };
  var N2r = e => GWs.setCredentialFeature(e, "CREDENTIALS_PROFILE_NAMED_PROVIDER", "p");
  var zWs = __lazy(() => {
    GWs = __toESM(UP(), 1);
    xSn = __toESM(wy(), 1);
  });