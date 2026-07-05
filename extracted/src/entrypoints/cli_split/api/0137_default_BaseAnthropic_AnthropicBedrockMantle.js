  __export(Gqe, {
    default: () => AnthropicBedrock,
    BaseAnthropic: () => BaseAnthropic,
    AnthropicBedrockMantle: () => AnthropicBedrockMantle,
    AnthropicBedrock: () => AnthropicBedrock
  });
  var Vqe = __lazy(() => {
    O9r();
    mbi();
    O9r();
  });
  var _xn = __lazy(() => {
    cI();
  });
  var M9r = e => (M9r = Array.isArray, M9r(e));
  function* GRd(e) {
    if (!e) {
      return;
    }
    if (fbi in e) {
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
    } else if (M9r(e)) {
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
      let s = M9r(r[1]) ? r[1] : [r[1]];
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
  var fbi;
  var L9r = e => {
    let t = new Headers();
    let n = new Set();
    for (let r of e) {
      let o = new Set();
      for (let [s, i] of GRd(r)) {
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
      [fbi]: true,
      values: t,
      nulls: n
    };
  };
  var hbi = __lazy(() => {
    fbi = Symbol.for("brand.privateNullableHeaders");
  });
  var gbi = __lazy(() => {
    _xn();
  });
  var Sxn = e => {
    if (typeof globalThis.process < "u") {
      return globalThis.process.env?.[e]?.trim() ?? undefined;
    }
    if (typeof globalThis.Deno < "u") {
      return globalThis.Deno.env?.get?.(e)?.trim();
    }
    return;
  };
  var ybi = __lazy(() => {});
  var _bi = __lazy(() => {
    gbi();
    ybi();
  });
  function VRd(e) {
    let t = new uj(e);
    delete t.batches;
    return t;
  }
  function zRd(e) {
    let t = new BR(e);
    delete t.messages.batches;
    return t;
  }
  var AnthropicFoundry;
  var U9r = __lazy(() => {
    hbi();
    _xn();
    _bi();
    qZe();
    AnthropicFoundry = class F9r extends dj {
      constructor({
        baseURL: e = Sxn("ANTHROPIC_FOUNDRY_BASE_URL"),
        apiKey: t = Sxn("ANTHROPIC_FOUNDRY_API_KEY"),
        resource: n = Sxn("ANTHROPIC_FOUNDRY_RESOURCE"),
        azureADTokenProvider: r,
        dangerouslyAllowBrowser: o,
        ...s
      } = {}) {
        if (typeof r === "function") {
          o = true;
        }
        if (!r && !t) {
          throw new mi("Missing credentials. Please pass one of `apiKey` and `azureTokenProvider`, or set the `ANTHROPIC_FOUNDRY_API_KEY` environment variable.");
        }
        if (r && t) {
          throw new mi("The `apiKey` and `azureADTokenProvider` arguments are mutually exclusive; only one can be passed at a time.");
        }
        if (!e) {
          if (!n) {
            throw new mi("Must provide one of the `baseURL` or `resource` arguments, or the `ANTHROPIC_FOUNDRY_RESOURCE` environment variable");
          }
          e = `https://${n}.services.ai.azure.com/anthropic/`;
        } else if (n) {
          throw new mi("baseURL and resource are mutually exclusive");
        }
        super({
          apiKey: r ?? t,
          baseURL: e,
          ...s,
          ...(o !== undefined ? {
            dangerouslyAllowBrowser: o
          } : {})
        });
        this.resource = null;
        this.messages = VRd(this);
        this.beta = zRd(this);
        this.models = undefined;
      }
      async authHeaders() {
        if (typeof this._options.apiKey === "function") {
          let e;
          try {
            e = await this._options.apiKey();
          } catch (t) {
            if (t instanceof mi) {
              throw t;
            }
            throw new mi(`Failed to get token from azureADTokenProvider: ${t.message}`, {
              cause: t
            });
          }
          if (typeof e !== "string" || !e) {
            throw new mi(`Expected azureADTokenProvider function argument to return a string but it returned ${e}`);
          }
          return L9r([{
            Authorization: `Bearer ${e}`
          }]);
        }
        if (typeof this._options.apiKey === "string") {
          return L9r([{
            "x-api-key": this.apiKey
          }]);
        }
        return;
      }
      validateHeaders() {
        return;
      }
    };
  });
  var B9r = {};