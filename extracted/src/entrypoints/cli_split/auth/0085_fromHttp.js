  __export(eUr, {
    fromHttp: () => fromHttp
  });
  var X_n = __lazy(() => {
    tUs();
  });
  var Q_n;
  var rUs = async e => {
    let {
      ENV_CMDS_FULL_URI: t,
      ENV_CMDS_RELATIVE_URI: n,
      fromContainerMetadata: r,
      fromInstanceMetadata: o
    } = await Promise.resolve().then(() => (Dje(), dNt));
    if (process.env[n] || process.env[t]) {
      e.logger?.debug("@aws-sdk/credential-provider-node - remoteProvider::fromHttp/fromContainerMetadata");
      let {
        fromHttp: s
      } = await Promise.resolve().then(() => (X_n(), eUr));
      return Q_n.chain(s(e), r(e));
    }
    if (process.env["AWS_EC2_METADATA_DISABLED"] && process.env["AWS_EC2_METADATA_DISABLED"] !== "false") {
      return async () => {
        throw new Q_n.CredentialsProviderError("EC2 Instance Metadata Service access disabled", {
          logger: e.logger
        });
      };
    }
    e.logger?.debug("@aws-sdk/credential-provider-node - remoteProvider::fromInstanceMetadata");
    return o(e);
  };
  var oUs = __lazy(() => {
    Q_n = __toESM(wy(), 1);
  });
  function sUs(e, t) {
    let n = ezu(e);
    let r;
    let o;
    let s;
    let i = async a => {
      if (a?.forceRefresh) {
        return await n(a);
      }
      if (s?.expiration) {
        if (s?.expiration?.getTime() < Date.now()) {
          s = undefined;
        }
      }
      if (r) {
        await r;
      } else if (!s || t?.(s)) {
        if (s) {
          if (!o) {
            o = n(a).then(l => {
              s = l;
              o = undefined;
            });
          }
        } else {
          r = n(a).then(l => {
            s = l;
            r = undefined;
          });
          return i(a);
        }
      }
      return s;
    };
    return i;
  }
  var ezu = e => async t => {
    let n;
    for (let r of e) {
      try {
        return await r(t);
      } catch (o) {
        if (n = o, o?.tryNextLink) {
          continue;
        }
        throw o;
      }
    }
    throw n;
  };
  var isSsoProfile = e => e && (typeof e.sso_start_url === "string" || typeof e.sso_account_id === "string" || typeof e.sso_session === "string" || typeof e.sso_region === "string" || typeof e.sso_role_name === "string");