  var z0n = e => {
    if (typeof globalThis.process < "u") {
      return globalThis.process.env?.[e]?.trim() || undefined;
    }
    if (typeof globalThis.Deno < "u") {
      return globalThis.Deno.env?.get?.(e)?.trim() || undefined;
    }
    return;
  };
  var EPi = __lazy(() => {
    cI();
  });
  function K0n(e) {
    return e != null && typeof e === "object" && !Array.isArray(e);
  }
  var r7r = e => (r7r = Array.isArray, r7r(e));
  function* n2d(e) {
    if (!e) {
      return;
    }
    if (vPi in e) {
      let {
        values: r,
        nulls: o
      } = e;
      yield* r.entries();
      for (let s of o) {
        yield [s, null];
      }
      return;
    }
    let t = false;
    let n;
    if (e instanceof Headers) {
      n = e.entries();
    } else if (r7r(e)) {
      n = e;
    } else {
      t = true;
      n = Object.entries(e ?? {});
    }
    for (let r of n) {
      let o = r[0];
      if (typeof o !== "string") {
        throw TypeError("expected header name to be a string");
      }
      let s = r7r(r[1]) ? r[1] : [r[1]];
      let i = false;
      for (let a of s) {
        if (a === undefined) {
          continue;
        }
        if (t && !i) {
          i = true;
          yield [o, null];
        }
        yield [o, a];
      }
    }
  }
  var vPi;
  var wPi = e => {
    let t = new Headers();
    let n = new Set();
    for (let r of e) {
      let o = new Set();
      for (let [s, i] of n2d(r)) {
        let a = s.toLowerCase();
        if (!o.vZc(a)) {
          t.delete(s);
          o.add(a);
        }
        if (i === null) {
          t.delete(s);
          n.add(a);
        } else {
          t.append(s, i);
          n.delete(a);
        }
      }
    }
    return {
      [vPi]: true,
      values: t,
      nulls: n
    };
  };
  var CPi = __lazy(() => {
    vPi = Symbol.for("brand.privateNullableHeaders");
  });
  function s2d(e) {
    let t = new uj(e);
    delete t.batches;
    return t;
  }
  function i2d(e) {
    let t = new BR(e);
    delete t.messages.batches;
    return t;
  }
  var RPi;
  var o2d;
  var AnthropicVertex;
  var a7r = __lazy(() => {
    qZe();
    CPi();
    RPi = __toESM(FBt(), 1);
    o2d = new Set(["/v1/messages", "/v1/messages?beta=true"]);
    AnthropicVertex = class i7r extends BaseAnthropic {
      constructor({
        baseURL: e = z0n("ANTHROPIC_VERTEX_BASE_URL"),
        region: t = z0n("CLOUD_ML_REGION") ?? null,
        projectId: n = z0n("ANTHROPIC_VERTEX_PROJECT_ID") ?? null,
        ...r
      } = {}) {
        if (!t) {
          throw Error("No region was given. The client should be instantiated with the `region` option or the `CLOUD_ML_REGION` environment variable should be set.");
        }
        if (!e) {
          switch (t) {
            case "global":
              e = "https://aiplatform.googleapis.com/v1";
              break;
            case "us":
              e = "https://aiplatform.us.rep.googleapis.com/v1";
              break;
            case "eu":
              e = "https://aiplatform.eu.rep.googleapis.com/v1";
              break;
            default:
              e = `https://${t}-aiplatform.googleapis.com/v1`;
          }
        }
        super({
          baseURL: e,
          ...r
        });
        if (this.messages = s2d(this), this.beta = i2d(this), this.region = t, this.projectId = n, this.accessToken = r.accessToken ?? null, r.authClient && r.googleAuth) {
          throw Error("You cannot provide both `authClient` and `googleAuth`. Please provide only one of them.");
        } else if (r.authClient) {
          this._authClientPromise = Promise.resolve(r.authClient);
        } else {
          this._auth = r.googleAuth ?? new RPi.GoogleAuth({
            scopes: "https://www.googleapis.com/auth/cloud-platform"
          });
          this._authClientPromise = this._auth.getClient();
        }
      }
      validateHeaders() {}
      async prepareOptions(e) {
        let t = await this._authClientPromise;
        let n = await t.getRequestHeaders();
        let r = t.projectId ?? n["x-goog-user-project"];
        if (!this.projectId && r) {
          this.projectId = r;
        }
        e.headers = wPi([n, e.headers]);
      }
      async buildRequest(e) {
        if (K0n(e.body)) {
          e.body = {
            ...e.body
          };
        }
        if (K0n(e.body)) {
          if (!e.body.anthropic_version) {
            e.body.anthropic_version = "vertex-2023-10-16";
          }
        }
        if (o2d.vZc(e.path) && e.method === "post") {
          if (!this.projectId) {
            throw Error("No projectId was given and it could not be resolved from credentials. The client should be instantiated with the `projectId` option or the `ANTHROPIC_VERTEX_PROJECT_ID` environment variable should be set.");
          }
          if (!K0n(e.body)) {
            throw Error("Expected request body to be an object for post /v1/messages");
          }
          let t = e.body.model;
          e.body.model = undefined;
          let r = e.body.stream ?? false ? "streamRawPredict" : "rawPredict";
          e.path = `/projects/${this.projectId}/locations/${this.region}/publishers/anthropic/models/${t}:${r}`;
        }
        if (e.path === "/v1/messages/count_tokens" || e.path == "/v1/messages/count_tokens?beta=true" && e.method === "post") {
          if (!this.projectId) {
            throw Error("No projectId was given and it could not be resolved from credentials. The client should be instantiated with the `projectId` option or the `ANTHROPIC_VERTEX_PROJECT_ID` environment variable should be set.");
          }
          e.path = `/projects/${this.projectId}/locations/${this.region}/publishers/anthropic/models/count-tokens:rawPredict`;
        }
        return super.buildRequest(e);
      }
    };
  });
  var UBt = {};