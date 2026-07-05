  var JDs;
  var XDs;
  var fromEnv = e => async () => {
    e?.logger?.debug("@aws-sdk/credential-provider-env - fromEnv");
    let t = process.env["AWS_ACCESS_KEY_ID"];
    let n = process.env["AWS_SECRET_ACCESS_KEY"];
    let r = process.env["AWS_SESSION_TOKEN"];
    let o = process.env["AWS_CREDENTIAL_EXPIRATION"];
    let s = process.env["AWS_CREDENTIAL_SCOPE"];
    let i = process.env["AWS_ACCOUNT_ID"];
    if (t && n) {
      let a = {
        accessKeyId: t,
        secretAccessKey: n,
        ...(r && {
          sessionToken: r
        }),
        ...(o && {
          expiration: new Date(o)
        }),
        ...(s && {
          credentialScope: s
        }),
        ...(i && {
          accountId: i
        })
      };
      JDs.setCredentialFeature(a, "CREDENTIALS_ENV_VARS", "g");
      return a;
    }
    throw new XDs.CredentialsProviderError("Unable to find environment variable credentials.", {
      logger: e?.logger
    });
  };
  var nMs = __lazy(() => {
    JDs = __toESM(UP(), 1);
    XDs = __toESM(wy(), 1);
  });
  var rMs = {};
  __export(rMs, {
    fromEnv: () => fromEnv,
    ENV_SESSION: () => "AWS_SESSION_TOKEN",
    ENV_SECRET: () => "AWS_SECRET_ACCESS_KEY",
    ENV_KEY: () => "AWS_ACCESS_KEY_ID",
    ENV_EXPIRATION: () => "AWS_CREDENTIAL_EXPIRATION",
    ENV_CREDENTIAL_SCOPE: () => "AWS_CREDENTIAL_SCOPE",
    ENV_ACCOUNT_ID: () => "AWS_ACCOUNT_ID"
  });
  var r_n = __lazy(() => {
    nMs();
  });
  function httpRequest(e) {
    return new Promise((t, n) => {
      let r = sMs.request({
        method: "GET",
        ...e,
        hostname: e.hostname?.replace(/^\[(.+)\]$/, "$1")
      });
      r.on("error", o => {
        n(Object.assign(new o_n.ProviderError("Unable to connect to instance metadata service"), o));
        r.destroy();
      });
      r.on("timeout", () => {
        n(new o_n.ProviderError("TimeoutError from instance metadata service"));
        r.destroy();
      });
      r.on("response", o => {
        let {
          statusCode: s = 400
        } = o;
        if (s < 200 || 300 <= s) {
          n(Object.assign(new o_n.ProviderError("Error response received from instance metadata service"), {
            statusCode: s
          }));
          r.destroy();
        }
        let i = [];
        o.on("data", a => {
          i.push(a);
        });
        o.on("end", () => {
          t(oMs.Buffer.concat(i));
          r.destroy();
        });
      });
      r.end();
    });
  }
  var o_n;
  var oMs;
  var sMs;
  var s_n = __lazy(() => {
    o_n = __toESM(wy(), 1);
    oMs = require("buffer");
    sMs = require("http");
  });
  var i_n = e => Boolean(e) && typeof e === "object" && typeof e.AccessKeyId === "string" && typeof e.SecretAccessKey === "string" && typeof e.Token === "string" && typeof e.Expiration === "string";
  var a_n = e => ({
    accessKeyId: e.AccessKeyId,
    secretAccessKey: e.SecretAccessKey,
    sessionToken: e.Token,
    expiration: new Date(e.Expiration),
    ...(e.AccountId && {
      accountId: e.AccountId
    })
  });
  var providerConfigFromInit = ({
    maxRetries: e = 0,
    timeout: t = 1000
  }) => ({
    maxRetries: e,
    timeout: t
  });
  var cNt = (e, t) => {
    let n = e();
    for (let r = 0; r < t; r++) {
      n = n.catch(e);
    }
    return n;
  };
  var uNt;
  var iMs;
  var fromContainerMetadata = (e = {}) => {
    let {
      timeout: t,
      maxRetries: n
    } = providerConfigFromInit(e);
    return () => cNt(async () => {
      let r = await f5u({
        logger: e.logger
      });
      let o = JSON.parse(await u5u(t, r));
      if (!i_n(o)) {
        throw new uNt.CredentialsProviderError("Invalid response received from instance metadata service.", {
          logger: e.logger
        });
      }
      return a_n(o);
    }, n);
  };
  var u5u = async (e, t) => {
    if (process.env["AWS_CONTAINER_AUTHORIZATION_TOKEN"]) {
      t.headers = {
        ...t.headers,
        Authorization: process.env["AWS_CONTAINER_AUTHORIZATION_TOKEN"]
      };
    }
    return (await httpRequest({
      ...t,
      timeout: e
    })).toString();
  };
  var p5u;
  var m5u;
  var f5u = async ({
    logger: e
  }) => {
    if (process.env["AWS_CONTAINER_CREDENTIALS_RELATIVE_URI"]) {
      return {
        hostname: "169.254.170.2",
        path: process.env["AWS_CONTAINER_CREDENTIALS_RELATIVE_URI"]
      };
    }
    if (process.env["AWS_CONTAINER_CREDENTIALS_FULL_URI"]) {
      let t = iMs.parse(process.env["AWS_CONTAINER_CREDENTIALS_FULL_URI"]);
      if (!t.hostname || !(t.hostname in p5u)) {
        throw new uNt.CredentialsProviderError(`${t.hostname} is not a valid container metadata service hostname`, {
          tryNextLink: false,
          logger: e
        });
      }
      if (!t.protocol || !(t.protocol in m5u)) {
        throw new uNt.CredentialsProviderError(`${t.protocol} is not a valid container metadata service protocol`, {
          tryNextLink: false,
          logger: e
        });
      }
      return {
        ...t,
        port: t.port ? parseInt(t.port, 10) : undefined
      };
    }
    throw new uNt.CredentialsProviderError(`The container metadata credential provider cannot be used unless the ${"AWS_CONTAINER_CREDENTIALS_RELATIVE_URI"} or ${"AWS_CONTAINER_CREDENTIALS_FULL_URI"} environment variable is set`, {
      tryNextLink: false,
      logger: e
    });
  };
  var aMs = __lazy(() => {
    s_n();
    uNt = __toESM(wy(), 1);
    iMs = require("url");
    p5u = {
      localhost: true,
      "127.0.0.1": true
    };
    m5u = {
      "http:": true,
      "https:": true
    };
  });
  var lMs;
  var u_n;
  var cMs = __lazy(() => {
    lMs = __toESM(wy(), 1);
    u_n = class u_n extends lMs.CredentialsProviderError {
      tryNextLink;
      name = "InstanceMetadataV1FallbackError";
      constructor(e, t = true) {
        super(e, t);
        this.tryNextLink = t;
        Object.setPrototypeOf(this, u_n.prototype);
      }
    };
  });