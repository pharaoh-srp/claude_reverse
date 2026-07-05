      };
      let {
        STSClient: o,
        GetCallerIdentityCommand: s
      } = await Promise.resolve().then(() => (M3r(), D3r));
      let i = await new o(r).send(new s({}));
      let a = i.Arn ?? i.UserId ?? "(unknown)";
      let {
        BedrockClient: l,
        ListInferenceProfilesCommand: c
      } = await Promise.resolve().then(() => (v1t(), E1t));
      let u = new l(r);
      let d = [];
      let p;
      do {
        let m = await u.send(new c({
          ...(p && {
            nextToken: p
          }),
          typeEquals: "SYSTEM_DEFINED"
        }));
        for (let f of m.inferenceProfileSummaries ?? []) {
          if (f.inferenceProfileId?.includes("anthropic")) {
            d.push(f.inferenceProfileId);
          }
        }
        p = m.nextToken;
      } while (p);
      return {
        status: "ok",
        identity: a,
        profiles: d
      };
    } catch (t) {
      return {
        status: "error",
        ...Egm(t, e)
      };
    }
  }
  async function fze(e, t) {
    let n;
    try {
      n = await bgm(e);
    } catch {
      return {
        ok: false,
        reason: "auth"
      };
    }
    try {
      await n.messages.create({
        model: ca(t),
        max_tokens: 1,
        messages: [{
          role: "user",
          content: "."
        }]
      });
      return {
        ok: true
      };
    } catch (r) {
      let o = r?.status;
      if (o === 401) {
        return {
          ok: false,
          reason: "auth"
        };
      }
      if (o === 403) {
        return {
          ok: false,
          reason: "permission"
        };
      }
      if (o === 400 || o === 404) {
        return {
          ok: false,
          reason: "model"
        };
      }
      if (o === 429) {
        return {
          ok: true
        };
      }
      if (o === undefined) {
        return {
          ok: false,
          reason: "network"
        };
      }
      return {
        ok: false,
        reason: "other"
      };
    }
  }
  async function bgm(e) {
    let [{
      AnthropicBedrock: t
    }, {
      getProxyFetchOptions: n
    }] = await Promise.all([Promise.resolve().then(() => (Vqe(), Gqe)), Promise.resolve().then(() => (Fh(), BAe))]);
    let r = {
      awsRegion: e.region,
      maxRetries: 0,
      fetchOptions: n({
        url: process.env.ANTHROPIC_BEDROCK_BASE_URL || `https://bedrock-runtime.${e.region}.amazonaws.com`
      })
    };
    let o = await Sgm(e);
    switch (o.kind) {
      case "bearer":
        return new t({
          ...r,
          apiKey: o.token
        });
      case "sigv4":
        return new t({
          ...r,
          awsAccessKey: o.accessKeyId,
          awsSecretKey: o.secretAccessKey,
          awsSessionToken: o.sessionToken
        });
      case "default":
        return new t(r);
    }
  }
  async function Sgm(e) {
    if (e.authMethod === "bearer") {
      return {
        kind: "bearer",
        token: e.bearerToken
      };
    }
    let t = await Bml(e);
    if (!t) {
      return {
        kind: "default"
      };
    }
    let n = await t();
    return {
      kind: "sigv4",
      accessKeyId: n.accessKeyId,
      secretAccessKey: n.secretAccessKey,
      sessionToken: n.sessionToken
    };
  }
  async function Tgm(e) {
    let t = fPo(e.region).haiku.fallback;
    let n = await fze(e, t);
    if (n.ok) {
      return {
        status: "ok",
        identity: "Bedrock API key",
        profiles: [],
        note: `Test request to ${t} succeeded.`
      };
    }
    switch (n.reason) {
      case "auth":
        return {
          status: "error",
          error: "Invalid Bedrock API key. Check the key and try again."
        };
      case "permission":
        return {
          status: "error",
          error: "API key was rejected. Your IAM policy may be missing bedrock:CallWithBearerToken or bedrock:InvokeModel."
        };
      case "model":
        return {
          status: "ok",
          identity: "Bedrock API key",
          profiles: [],
          note: `The key works, but ${t} is not enabled in your account. Pin a model you have access to on the next step.`
        };
      case "network":
        return {
          status: "error",
          error: `Could not reach Bedrock in region "${e.region}". Check the region name and your network.`
        };
      case "other":
        return {
          status: "error",
          error: "The test request failed. Check the key and region."
        };
    }
  }
  async function Bml(e) {
    switch (e.authMethod) {
      case "profile":
        {
          let {
            fromNodeProviderChain: t
          } = await Promise.resolve().then(() => (zot(), Vot));
          return t({
            profile: e.awsProfile,
            ignoreCache: true
          });
        }
      case "accessKey":
        return async () => ({
          accessKeyId: e.accessKeyId,
          secretAccessKey: e.secretAccessKey,
          ...(e.sessionToken && {
            sessionToken: e.sessionToken
          })
        });
      case "environment":
        return;
      default:
        return;
    }
  }
  function Egm(e, t) {
    let n = e;
    let r = n?.name ?? "Error";
    let o = n?.message ?? String(e);
    let s = t.authMethod === "profile" ? `aws sso login --profile ${t.awsProfile}` : undefined;
    switch (r) {
      case "CredentialsProviderError":
        return t.authMethod === "profile" ? {
          error: `Could not load credentials for profile "${t.awsProfile}". If this is an SSO profile, run:`,
          command: s
        } : {
          error: `No AWS credentials found. ${o}`
        };
      case "ExpiredTokenException":
      case "TokenRefreshRequired":
        return t.authMethod === "profile" ? {
          error: "SSO session expired. Run:",
          command: s
        } : {
          error: `Credentials expired. ${o}`
        };
      case "ForbiddenException":
        return t.authMethod === "profile" ? {
          error: `SSO portal denied access to the role for profile "${t.awsProfile}". The permission set may have been revoked \u2014 check your AWS access portal.`
        } : {
          error: `Forbidden. ${o}`
        };
      case "AccessDeniedException":
        return {
          error: `Access denied. Your IAM role needs bedrock:ListInferenceProfiles permission. ${o}`
        };
      case "UnrecognizedClientException":
      case "InvalidSignatureException":
        return {
          error: `Invalid credentials. ${o}`
        };
      case "UnknownEndpoint":
      case "ENOTFOUND":
        return {
          error: `Cannot reach AWS in region "${t.region}". Check the region name and your network.`
        };
      default:
        return {
          error: `${r}: ${o}`
        };
    }
  }
  var hPo = __lazy(() => {
    Tk();
    Hle();
    zN();
    Eo();
    Fh();
  });