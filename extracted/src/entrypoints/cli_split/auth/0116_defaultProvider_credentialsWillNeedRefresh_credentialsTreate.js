  class KSn {
    profileData;
    init;
    callerClientConfig;
    static REFRESH_THRESHOLD = 300000;
    constructor(e, t, n) {
      this.profileData = e;
      this.init = t;
      this.callerClientConfig = n;
    }
    async loadCredentials() {
      let e = await this.loadToken();
      if (!e) {
        throw new LAe.CredentialsProviderError(`Failed to load a token for session ${this.loginSession}, please re-authenticate using aws login`, {
          tryNextLink: false,
          logger: this.logger
        });
      }
      let t = e.accessToken;
      let n = Date.now();
      if (new Date(t.expiresAt).getTime() - n <= KSn.REFRESH_THRESHOLD) {
        return this.refresh(e);
      }
      return {
        accessKeyId: t.accessKeyId,
        secretAccessKey: t.secretAccessKey,
        sessionToken: t.sessionToken,
        accountId: t.accountId,
        expiration: new Date(t.expiresAt)
      };
    }
    get logger() {
      return this.init?.logger;
    }
    get loginSession() {
      return this.profileData.login_session;
    }
    async refresh(e) {
      let {
        SigninClient: t,
        CreateOAuth2TokenCommand: n
      } = await Promise.resolve().then(() => __toESM(i5s(), 1));
      let {
        logger: r,
        userAgentAppId: o
      } = this.callerClientConfig ?? {};
      let i = (u => u?.metadata?.handlerProtocol === "h2")(this.callerClientConfig?.requestHandler) ? undefined : this.callerClientConfig?.requestHandler;
      let a = this.profileData.region ?? (await this.callerClientConfig?.region?.()) ?? process.env.AWS_REGION;
      let l = new t({
        credentials: {
          accessKeyId: "",
          secretAccessKey: ""
        },
        region: a,
        requestHandler: i,
        logger: r,
        userAgentAppId: o,
        ...this.init?.clientConfig
      });
      this.createDPoPInterceptor(l.middlewareStack);
      let c = {
        tokenInput: {
          clientId: e.clientId,
          refreshToken: e.refreshToken,
          grantType: "refresh_token"
        }
      };
      try {
        let u = await l.send(new n(c));
        let {
          accessKeyId: d,
          secretAccessKey: p,
          sessionToken: m
        } = u.tokenOutput?.accessToken ?? {};
        let {
          refreshToken: f,
          expiresIn: h
        } = u.tokenOutput ?? {};
        if (!d || !p || !m || !f) {
          throw new LAe.CredentialsProviderError("Token refresh response missing required fields", {
            logger: this.logger,
            tryNextLink: false
          });
        }
        let g = (h ?? 900) * 1000;
        let y = new Date(Date.now() + g);
        let _ = {
          ...e,
          accessToken: {
            ...e.accessToken,
            accessKeyId: d,
            secretAccessKey: p,
            sessionToken: m,
            expiresAt: y.toISOString()
          },
          refreshToken: f
        };
        await this.saveToken(_);
        let b = _.accessToken;
        return {
          accessKeyId: b.accessKeyId,
          secretAccessKey: b.secretAccessKey,
          sessionToken: b.sessionToken,
          accountId: b.accountId,
          expiration: y
        };
      } catch (u) {
        if (u.name === "AccessDeniedException") {
          let d = u.error;
          let p;
          switch (d) {
            case "TOKEN_EXPIRED":
              p = "Your session has expired. Please reauthenticate.";
              break;
            case "USER_CREDENTIALS_CHANGED":
              p = "Unable to refresh credentials because of a change in your password. Please reauthenticate with your new password.";
              break;
            case "INSUFFICIENT_PERMISSIONS":
              p = "Unable to refresh credentials due to insufficient permissions. You may be missing permission for the 'CreateOAuth2Token' action.";
              break;
            default:
              p = `Failed to refresh token: ${String(u)}. Please re-authenticate using \`aws login\``;
          }
          throw new LAe.CredentialsProviderError(p, {
            logger: this.logger,
            tryNextLink: false
          });
        }
        throw new LAe.CredentialsProviderError(`Failed to refresh token: ${String(u)}. Please re-authenticate using aws login`, {
          logger: this.logger
        });
      }
    }
    async loadToken() {
      let e = this.getTokenFilePath();
      try {
        let t;
        try {
          t = await a5s.readFile(e, {
            ignoreCache: this.init?.ignoreCache
          });
        } catch {
          t = await zSn.promises.readFile(e, "utf8");
        }
        let n = JSON.parse(t);
        let r = ["accessToken", "clientId", "refreshToken", "dpopKey"].filter(o => !n[o]);
        if (!n.accessToken?.accountId) {
          r.push("accountId");
        }
        if (r.length > 0) {
          throw new LAe.CredentialsProviderError(`Token validation failed, missing fields: ${r.join(", ")}`, {
            logger: this.logger,
            tryNextLink: false
          });
        }
        return n;
      } catch (t) {
        throw new LAe.CredentialsProviderError(`Failed to load token from ${e}: ${String(t)}`, {
          logger: this.logger,
          tryNextLink: false
        });
      }
    }
    async saveToken(e) {
      let t = this.getTokenFilePath();
      let n = t1t.dirname(t);
      try {
        await zSn.promises.mkdir(n, {
          recursive: true
        });
      } catch (r) {}
      await zSn.promises.writeFile(t, JSON.stringify(e, null, 2), "utf8");
    }
    getTokenFilePath() {
      let e = process.env.AWS_LOGIN_CACHE_DIRECTORY ?? t1t.join(l5s.homedir(), ".aws", "login", "cache");
      let t = Buffer.from(this.loginSession, "utf8");
      let n = FAe.createHash("sha256").update(t).digest("hex");
      return t1t.join(e, `${n}.json`);
    }
    derToRawSignature(e) {
      let t = 2;
      if (e[t] !== 2) {
        throw Error("Invalid DER signature");
      }
      t++;
      let n = e[t++];
      let r = e.subarray(t, t + n);
      if (t += n, e[t] !== 2) {
        throw Error("Invalid DER signature");
      }
      t++;
      let o = e[t++];
      let s = e.subarray(t, t + o);
      r = r[0] === 0 ? r.subarray(1) : r;
      s = s[0] === 0 ? s.subarray(1) : s;
      let i = Buffer.concat([Buffer.alloc(32 - r.length), r]);
      let a = Buffer.concat([Buffer.alloc(32 - s.length), s]);
      return Buffer.concat([i, a]);
    }
    createDPoPInterceptor(e) {
      e.add(t => async n => {
        if (e1t.isInstance(n.request)) {
          let r = n.request;
          let o = `${r.protocol}//${r.hostname}${r.port ? `:${r.port}` : ""}${r.path}`;
          let s = await this.generateDpop(r.method, o);
          r.headers = {
            ...r.headers,
            DPoP: s
          };
        }
        return t(n);
      }, {
        step: "finalizeRequest",
        name: "dpopInterceptor",
        override: true
      });
    }
    async generateDpop(e = "POST", t) {
      let n = await this.loadToken();
      try {
        let r = FAe.createPrivateKey({
          key: n.dpopKey,
          format: "pem",
          type: "sec1"
        });
        let s = FAe.createPublicKey(r).export({
          format: "der",
          type: "spki"
        });
        let i = -1;
        for (let y = 0; y < s.length; y++) {
          if (s[y] === 4) {
            i = y;
            break;
          }
        }
        let a = s.slice(i + 1, i + 33);
        let l = s.slice(i + 33, i + 65);
        let c = {
          alg: "ES256",
          typ: "dpop+jwt",
          jwk: {
            kty: "EC",
            crv: "P-256",
            x: a.toString("base64url"),
            y: l.toString("base64url")
          }
        };
        let u = {
          jti: crypto.randomUUID(),
          htm: e,
          htu: t,
          iat: Math.floor(Date.now() / 1000)
        };
        let d = Buffer.from(JSON.stringify(c)).toString("base64url");
        let p = Buffer.from(JSON.stringify(u)).toString("base64url");
        let m = `${d}.${p}`;
        let f = FAe.sign("sha256", Buffer.from(m), r);
        let g = this.derToRawSignature(f).toString("base64url");
        return `${m}.${g}`;
      } catch (r) {
        throw new LAe.CredentialsProviderError(`Failed to generate Dpop proof: ${r instanceof Error ? r.message : String(r)}`, {
          logger: this.logger,
          tryNextLink: false
        });
      }
    }
  }
  var LAe;
  var a5s;
  var FAe;
  var zSn;
  var l5s;
  var t1t;
  var c5s = __lazy(() => {
    g9s();
    LAe = __toESM(wy(), 1);
    a5s = __toESM(Sj(), 1);
    FAe = require("crypto");
    zSn = require("fs");
    l5s = require("os");
    t1t = require("path");
  });
  var u5s;
  var d5s;
  var YSn;
  var JSn = e => async ({
    callerClientConfig: t
  } = {}) => {
    e?.logger?.debug?.("@aws-sdk/credential-providers - fromLoginCredentials");
    let n = await YSn.parseKnownFiles(e || {});
    let r = YSn.getProfileName({
      profile: e?.profile ?? t?.profile
    });
    let o = n[r];
    if (!o?.login_session) {
      throw new d5s.CredentialsProviderError(`Profile ${r} does not contain login_session.`, {
        tryNextLink: true,
        logger: e?.logger
      });
    }
    let i = await new KSn(o, e, t).loadCredentials();
    return u5s.setCredentialFeature(i, "CREDENTIALS_LOGIN", "AD");
  };
  var p5s = __lazy(() => {
    c5s();
    u5s = __toESM(UP(), 1);
    d5s = __toESM(wy(), 1);
    YSn = __toESM(Sj(), 1);
  });
  var m5s = () => {};
  var p$r = __lazy(() => {
    p5s();
    m5s();
  });
  var f5s;
  var h5s = e => Boolean(e && e.login_session);
  var g5s = async (e, t) => {
    let n = await JSn({
      ...t,
      profile: e
    })();
    return f5s.setCredentialFeature(n, "CREDENTIALS_PROFILE_LOGIN", "AC");
  };
  var y5s = __lazy(() => {
    p$r();
    f5s = __toESM(UP(), 1);
  });
  var _5s;
  var b5s = (e, t, n) => {
    if (t.Version !== 1) {
      throw Error(`Profile ${e} credential_process did not return Version 1.`);
    }
    if (t.AccessKeyId === undefined || t.SecretAccessKey === undefined) {
      throw Error(`Profile ${e} credential_process returned invalid credentials.`);
    }
    if (t.Expiration) {
      let s = new Date();
      if (new Date(t.Expiration) < s) {
        throw Error(`Profile ${e} credential_process returned expired credentials.`);
      }
    }
    let r = t.AccountId;
    if (!r && n?.[e]?.aws_account_id) {
      r = n[e].aws_account_id;
    }
    let o = {
      accessKeyId: t.AccessKeyId,
      secretAccessKey: t.SecretAccessKey,
      ...(t.SessionToken && {
        sessionToken: t.SessionToken
      }),
      ...(t.Expiration && {
        expiration: new Date(t.Expiration)
      }),
      ...(t.CredentialScope && {
        credentialScope: t.CredentialScope
      }),
      ...(r && {
        accountId: r
      })
    };
    _5s.setCredentialFeature(o, "CREDENTIALS_PROCESS", "w");
    return o;
  };
  var S5s = __lazy(() => {
    _5s = __toESM(UP(), 1);
  });
  var XSn;
  var T5s;
  var E5s;
  var v5s;
  var w5s = async (e, t, n) => {
    let r = t[e];
    if (t[e]) {
      let o = r.credential_process;
      if (o !== undefined) {
        let s = v5s.promisify(T5s.externalDataInterceptor?.getTokenRecord?.().exec ?? E5s.exec);
        try {
          let {
            stdout: i
          } = await s(o);
          let a;
          try {
            a = JSON.parse(i.trim());
          } catch {
            throw Error(`Profile ${e} credential_process returned invalid JSON.`);
          }
          return b5s(e, a, t);
        } catch (i) {
          throw new XSn.CredentialsProviderError(i.message, {
            logger: n
          });
        }
      } else {
        throw new XSn.CredentialsProviderError(`Profile ${e} did not contain credential_process.`, {
          logger: n
        });
      }
    } else {
      throw new XSn.CredentialsProviderError(`Profile ${e} could not be found in shared credentials file.`, {
        logger: n
      });
    }
  };
  var C5s = __lazy(() => {
    S5s();
    XSn = __toESM(wy(), 1);
    T5s = __toESM(Sj(), 1);
    E5s = require("child_process");
    v5s = require("util");
  });
  var QSn;
  var fromProcess = (e = {}) => async ({
    callerClientConfig: t
  } = {}) => {
    e.logger?.debug("@aws-sdk/credential-provider-process - fromProcess");
    let n = await QSn.parseKnownFiles(e);
    return w5s(QSn.getProfileName({
      profile: e.profile ?? t?.profile
    }), n, e.logger);
  };
  var R5s = __lazy(() => {
    C5s();
    QSn = __toESM(Sj(), 1);
  });
  var f$r = {};
  __export(f$r, {
    fromProcess: () => fromProcess
  });
  var ZSn = __lazy(() => {
    R5s();
  });
  var x5s;
  var k5s = e => Boolean(e) && typeof e === "object" && typeof e.credential_process === "string";
  var A5s = async (e, t) => Promise.resolve().then(() => (ZSn(), f$r)).then(({
    fromProcess: n
  }) => n({
    ...e,
    profile: t
  })().then(r => x5s.setCredentialFeature(r, "CREDENTIALS_PROFILE_PROCESS", "v")));
  var I5s = __lazy(() => {
    x5s = __toESM(UP(), 1);
  });
  var h$r;
  var P5s = async (e, t, n = {}) => {
    let {
      fromSSO: r
    } = await Promise.resolve().then(() => (RSn(), M2r));
    return r({
      profile: e,
      logger: n.logger,
      parentClientConfig: n.parentClientConfig,
      clientConfig: n.clientConfig
    })().then(o => {
      if (t.sso_session) {
        return h$r.setCredentialFeature(o, "CREDENTIALS_PROFILE_SSO", "r");
      } else {
        return h$r.setCredentialFeature(o, "CREDENTIALS_PROFILE_SSO_LEGACY", "t");
      }
    });
  };
  var O5s = e => e && (typeof e.sso_start_url === "string" || typeof e.sso_account_id === "string" || typeof e.sso_session === "string" || typeof e.sso_region === "string" || typeof e.sso_role_name === "string");
  var D5s = __lazy(() => {
    h$r = __toESM(UP(), 1);
  });
  var M5s;
  var g$r = e => Boolean(e) && typeof e === "object" && typeof e.aws_access_key_id === "string" && typeof e.aws_secret_access_key === "string" && ["undefined", "string"].indexOf(typeof e.aws_session_token) > -1 && ["undefined", "string"].indexOf(typeof e.aws_account_id) > -1;
  var y$r = async (e, t) => {
    t?.logger?.debug("@aws-sdk/credential-provider-ini - resolveStaticCredentials");
    let n = {
      accessKeyId: e.aws_access_key_id,
      secretAccessKey: e.aws_secret_access_key,
      sessionToken: e.aws_session_token,
      ...(e.aws_credential_scope && {
        credentialScope: e.aws_credential_scope
      }),
      ...(e.aws_account_id && {
        accountId: e.aws_account_id
      })
    };
    return M5s.setCredentialFeature(n, "CREDENTIALS_PROFILE", "n");
  };
  var N5s = __lazy(() => {
    M5s = __toESM(UP(), 1);
  });
  var fromWebToken = e => async t => {
    e.logger?.debug("@aws-sdk/credential-provider-web-identity - fromWebToken");
    let {
      roleArn: n,
      roleSessionName: r,
      webIdentityToken: o,
      providerId: s,
      policyArns: i,
      policy: a,
      durationSeconds: l
    } = e;
    let {
      roleAssumerWithWebIdentity: c
    } = e;
    if (!c) {
      let {
        getDefaultRoleAssumerWithWebIdentity: u
      } = await Promise.resolve().then(() => __toESM(LSn(), 1));
      c = u({
        ...e.clientConfig,
        credentialProviderLogger: e.logger,
        parentClientConfig: {
          ...t?.callerClientConfig,
          ...e.parentClientConfig
        }
      }, e.clientPlugins);
    }
    return c({
      RoleArn: n,
      RoleSessionName: r ?? `aws-sdk-js-session-${Date.now()}`,
      WebIdentityToken: o,
      ProviderId: s,
      PolicyArns: i,
      Policy: a,
      DurationSeconds: l
    });
  };
  var F5s;
  var U5s;
  var B5s;
  var $5s;
  var fromTokenFile = (e = {}) => async t => {
    e.logger?.debug("@aws-sdk/credential-provider-web-identity - fromTokenFile");
    let n = e?.webIdentityTokenFile ?? process.env["AWS_WEB_IDENTITY_TOKEN_FILE"];
    let r = e?.roleArn ?? process.env["AWS_ROLE_ARN"];
    let o = e?.roleSessionName ?? process.env["AWS_ROLE_SESSION_NAME"];
    if (!n || !r) {
      throw new U5s.CredentialsProviderError("Web identity configuration not specified", {
        logger: e.logger
      });
    }
    let s = await fromWebToken({
      ...e,
      webIdentityToken: B5s.externalDataInterceptor?.getTokenRecord?.()[n] ?? $5s.readFileSync(n, {
        encoding: "ascii"
      }),
      roleArn: r,
      roleSessionName: o
    })(t);
    if (n === process.env["AWS_WEB_IDENTITY_TOKEN_FILE"]) {
      F5s.setCredentialFeature(s, "CREDENTIALS_ENV_VARS_STS_WEB_ID_TOKEN", "h");
    }
    return s;
  };
  var H5s = __lazy(() => {
    F5s = __toESM(UP(), 1);
    U5s = __toESM(wy(), 1);
    B5s = __toESM(Sj(), 1);
    $5s = require("fs");
  });
  var b$r = {};
  __export(b$r, {
    fromWebToken: () => fromWebToken,
    fromTokenFile: () => fromTokenFile
  });
  var r1t = __lazy(() => {
    H5s();
  });
  var j5s;
  var q5s = e => Boolean(e) && typeof e === "object" && typeof e.web_identity_token_file === "string" && typeof e.role_arn === "string" && ["undefined", "string"].indexOf(typeof e.role_session_name) > -1;
  var W5s = async (e, t) => Promise.resolve().then(() => (r1t(), b$r)).then(({
    fromTokenFile: n
  }) => n({
    webIdentityTokenFile: e.web_identity_token_file,
    roleArn: e.role_arn,
    roleSessionName: e.role_session_name,
    roleAssumerWithWebIdentity: t.roleAssumerWithWebIdentity,
    logger: t.logger,
    parentClientConfig: t.parentClientConfig
  })().then(r => j5s.setCredentialFeature(r, "CREDENTIALS_PROFILE_STS_WEB_ID_TOKEN", "q")));
  var G5s = __lazy(() => {
    j5s = __toESM(UP(), 1);
  });
  var V5s;
  var S$r = async (e, t, n, r = {}, o = false) => {
    let s = t[e];
    if (Object.keys(r).length > 0 && g$r(s)) {
      return y$r(s, n);
    }
    if (o || c9s(s, {
      profile: e,
      logger: n.logger
    })) {
      return u9s(e, t, n, r, S$r);
    }
    if (g$r(s)) {
      return y$r(s, n);
    }
    if (q5s(s)) {
      return W5s(s, n);
    }
    if (k5s(s)) {
      return A5s(n, e);
    }
    if (O5s(s)) {
      return await P5s(e, s, n);
    }
    if (h5s(s)) {
      return g5s(e, n);
    }
    throw new V5s.CredentialsProviderError(`Could not resolve credentials using profile: [${e}] in configuration/credentials file(s).`, {
      logger: n.logger
    });
  };
  var z5s = __lazy(() => {
    d9s();
    y5s();
    I5s();
    D5s();
    N5s();
    G5s();
    V5s = __toESM(wy(), 1);
  });
  var eTn;
  var fromIni = (e = {}) => async ({
    callerClientConfig: t
  } = {}) => {
    let n = {
      ...e,
      parentClientConfig: {
        ...t,
        ...e.parentClientConfig
      }
    };
    n.logger?.debug("@aws-sdk/credential-provider-ini - fromIni");
    let r = await eTn.parseKnownFiles(n);
    return S$r(eTn.getProfileName({
      profile: e.profile ?? t?.profile
    }), r, n);
  };
  var K5s = __lazy(() => {
    z5s();
    eTn = __toESM(Sj(), 1);
  });
  var Y5s = {};
  __export(Y5s, {
    fromIni: () => fromIni
  });
  var E$r = __lazy(() => {
    K5s();
  });
  var tTn;
  var X5s;
  var J5s = false;
  var defaultProvider = (e = {}) => sUs([async () => {
    if (e.profile ?? process.env[X5s.ENV_PROFILE]) {
      if (process.env["AWS_ACCESS_KEY_ID"] && process.env["AWS_SECRET_ACCESS_KEY"]) {
        if (!J5s) {
          (e.logger?.warn && e.logger?.constructor?.name !== "NoOpLogger" ? e.logger.warn.bind(e.logger) : console.warn)(`@aws-sdk/credential-provider-node - defaultProvider::fromEnv WARNING:
    Multiple credential sources detected: 
    Both AWS_PROFILE and the pair AWS_ACCESS_KEY_ID/AWS_SECRET_ACCESS_KEY static credentials are set.
    This SDK will proceed with the AWS_PROFILE value.
    
    However, a future version may change this behavior to prefer the ENV static credentials.
    Please ensure that your environment only sets either the AWS_PROFILE or the
    AWS_ACCESS_KEY_ID/AWS_SECRET_ACCESS_KEY pair.
`);
          J5s = true;
        }
      }
      throw new tTn.CredentialsProviderError("AWS_PROFILE is set, skipping fromEnv provider.", {
        logger: e.logger,
        tryNextLink: true
      });
    }
    e.logger?.debug("@aws-sdk/credential-provider-node - defaultProvider::fromEnv");
    return fromEnv(e)();
  }, async t => {
    e.logger?.debug("@aws-sdk/credential-provider-node - defaultProvider::fromSSO");
    let {
      ssoStartUrl: n,
      ssoAccountId: r,
      ssoRegion: o,
      ssoRoleName: s,
      ssoSession: i
    } = e;
    if (!n && !r && !o && !s && !i) {
      throw new tTn.CredentialsProviderError("Skipping SSO provider in default chain (inputs do not include SSO fields).", {
        logger: e.logger
      });
    }
    let {
      fromSSO: a
    } = await Promise.resolve().then(() => (RSn(), M2r));
    return a(e)(t);
  }, async t => {
    e.logger?.debug("@aws-sdk/credential-provider-node - defaultProvider::fromIni");
    let {
      fromIni: n
    } = await Promise.resolve().then(() => (E$r(), Y5s));
    return n(e)(t);
  }, async t => {
    e.logger?.debug("@aws-sdk/credential-provider-node - defaultProvider::fromProcess");
    let {
      fromProcess: n
    } = await Promise.resolve().then(() => (ZSn(), f$r));
    return n(e)(t);
  }, async t => {
    e.logger?.debug("@aws-sdk/credential-provider-node - defaultProvider::fromTokenFile");
    let {
      fromTokenFile: n
    } = await Promise.resolve().then(() => (r1t(), b$r));
    return n(e)(t);
  }, async () => (e.logger?.debug("@aws-sdk/credential-provider-node - defaultProvider::remoteProvider"), (await rUs(e))()), async () => {
    throw new tTn.CredentialsProviderError("Could not load credentials from any providers", {
      tryNextLink: false,
      logger: e.logger
    });
  }], credentialsTreatedAsExpired);
  var credentialsWillNeedRefresh = e => e?.expiration !== undefined;
  var credentialsTreatedAsExpired = e => e?.expiration !== undefined && e.expiration.getTime() - Date.now() < 300000;
  var Z5s = __lazy(() => {
    r_n();
    oUs();
    tTn = __toESM(wy(), 1);
    X5s = __toESM(Sj(), 1);
  });
  var e6s = {};
  __export(e6s, {
    defaultProvider: () => defaultProvider,
    credentialsWillNeedRefresh: () => credentialsWillNeedRefresh,
    credentialsTreatedAsExpired: () => credentialsTreatedAsExpired
  });
  var Xje = __lazy(() => {
    Z5s();
  });
  var BAe = {};