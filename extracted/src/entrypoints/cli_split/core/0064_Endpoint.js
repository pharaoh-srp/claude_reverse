  var Endpoint;
  var zLr = __lazy(() => {
    (function (e) {
      e.IPv4 = "http://169.254.169.254";
      e.IPv6 = "http://[fd00:ec2::254]";
    })(Endpoint || (Endpoint = {}));
  });
  var fMs;
  var hMs = __lazy(() => {
    fMs = {
      environmentVariableSelector: e => e.AWS_EC2_METADATA_SERVICE_ENDPOINT,
      configFileSelector: e => e.ec2_metadata_service_endpoint,
      default: undefined
    };
  });
  var Zke;
  var KLr = __lazy(() => {
    (function (e) {
      e.IPv4 = "IPv4";
      e.IPv6 = "IPv6";
    })(Zke || (Zke = {}));
  });
  var gMs;
  var yMs = __lazy(() => {
    KLr();
    gMs = {
      environmentVariableSelector: e => e["AWS_EC2_METADATA_SERVICE_ENDPOINT_MODE"],
      configFileSelector: e => e["ec2_metadata_service_endpoint_mode"],
      default: Zke.IPv4
    };
  });
  var YLr;
  var _Ms;
  var getInstanceMetadataEndpoint = async () => _Ms.parseUrl((await b5u()) || (await S5u()));
  var b5u = async () => YLr.loadConfig(fMs)();
  var S5u = async () => {
    let e = await YLr.loadConfig(gMs)();
    switch (e) {
      case Zke.IPv4:
        return Endpoint.IPv4;
      case Zke.IPv6:
        return Endpoint.IPv6;
      default:
        throw Error(`Unsupported endpoint mode: ${e}. Select from ${Object.values(Zke)}`);
    }
  };
  var JLr = __lazy(() => {
    zLr();
    hMs();
    KLr();
    yMs();
    YLr = __toESM(VB(), 1);
    _Ms = __toESM(bY(), 1);
  });
  var XLr = (e, t) => {
    let n = 300 + Math.floor(Math.random() * 300);
    let r = new Date(Date.now() + n * 1000);
    t.warn(`Attempting credential expiration extension due to a credential service availability issue. A refresh of these credentials will be attempted after ${new Date(r)}.
For more information, please visit: https://docs.aws.amazon.com/sdkref/latest/guide/feature-static-credentials.html`);
    let o = e.originalExpiration ?? e.expiration;
    return {
      ...e,
      ...(o ? {
        originalExpiration: o
      } : {}),
      expiration: r
    };
  };
  var bMs = (e, t = {}) => {
    let n = t?.logger || console;
    let r;
    return async () => {
      let o;
      try {
        if (o = await e(), o.expiration && o.expiration.getTime() < Date.now()) {
          o = XLr(o, n);
        }
      } catch (s) {
        if (r) {
          n.warn("Credential renew failed: ", s);
          o = XLr(r, n);
        } else {
          throw s;
        }
      }
      r = o;
      return o;
    };
  };
  var SMs = () => {};
  var vMs;
  var ZLr;
  var fromInstanceMetadata = (e = {}) => bMs(E5u(e), {
    logger: e.logger
  });
  var E5u = (e = {}) => {
    let t = false;
    let {
      logger: n,
      profile: r
    } = e;
    let {
      timeout: o,
      maxRetries: s
    } = providerConfigFromInit(e);
    let i = async (a, l) => {
      if (t || l.headers?.[EMs] == null) {
        let d = false;
        let p = false;
        let m = await vMs.loadConfig({
          environmentVariableSelector: f => {
            let h = f["AWS_EC2_METADATA_V1_DISABLED"];
            if (p = !!h && h !== "false", h === undefined) {
              throw new ZLr.CredentialsProviderError(`${"AWS_EC2_METADATA_V1_DISABLED"} not set in env, checking config file next.`, {
                logger: e.logger
              });
            }
            return p;
          },
          configFileSelector: f => {
            let h = f["ec2_metadata_v1_disabled"];
            d = !!h && h !== "false";
            return d;
          },
          default: false
        }, {
          profile: r
        })();
        if (e.ec2MetadataV1Disabled || m) {
          let f = [];
          if (e.ec2MetadataV1Disabled) {
            f.push("credential provider initialization (runtime option ec2MetadataV1Disabled)");
          }
          if (d) {
            f.push(`config file profile (${"ec2_metadata_v1_disabled"})`);
          }
          if (p) {
            f.push(`process environment variable (${"AWS_EC2_METADATA_V1_DISABLED"})`);
          }
          throw new u_n(`AWS EC2 Metadata v1 fallback has been blocked by AWS SDK configuration in the following: [${f.join(", ")}].`);
        }
      }
      let u = (await cNt(async () => {
        let d;
        try {
          d = await w5u(l);
        } catch (p) {
          if (p.statusCode === 401) {
            t = false;
          }
          throw p;
        }
        return d;
      }, a)).trim();
      return cNt(async () => {
        let d;
        try {
          d = await C5u(u, l, e);
        } catch (p) {
          if (p.statusCode === 401) {
            t = false;
          }
          throw p;
        }
        return d;
      }, a);
    };
    return async () => {
      let a = await getInstanceMetadataEndpoint();
      if (t) {
        n?.debug("AWS SDK Instance Metadata", "using v1 fallback (no token fetch)");
        return i(s, {
          ...a,
          timeout: o
        });
      } else {
        let l;
        try {
          l = (await v5u({
            ...a,
            timeout: o
          })).toString();
        } catch (c) {
          if (c?.statusCode === 400) {
            throw Object.assign(c, {
              message: "EC2 Metadata token request returned error"
            });
          } else if (c.message === "TimeoutError" || [403, 404, 405].includes(c.statusCode)) {
            t = true;
          }
          n?.debug("AWS SDK Instance Metadata", "using v1 fallback (initial)");
          return i(s, {
            ...a,
            timeout: o
          });
        }
        return i(s, {
          ...a,
          headers: {
            ["x-aws-ec2-metadata-token"]: l
          },
          timeout: o
        });
      }
    };
  };
  var v5u = async e => httpRequest({
    ...e,
    path: "/latest/api/token",
    method: "PUT",
    headers: {
      "x-aws-ec2-metadata-token-ttl-seconds": "21600"
    }
  });
  var w5u = async e => (await httpRequest({
    ...e,
    path: "/latest/meta-data/iam/security-credentials/"
  })).toString();
  var C5u = async (e, t, n) => {
    let r = JSON.parse((await httpRequest({
      ...t,
      path: "/latest/meta-data/iam/security-credentials/" + e
    })).toString());
    if (!i_n(r)) {
      throw new ZLr.CredentialsProviderError("Invalid response received from instance metadata service.", {
        logger: n.logger
      });
    }
    return a_n(r);
  };
  var CMs = __lazy(() => {
    cMs();
    s_n();
    JLr();
    SMs();
    vMs = __toESM(VB(), 1);
    ZLr = __toESM(wy(), 1);
  });
  var RMs = () => {};
  var dNt = {};