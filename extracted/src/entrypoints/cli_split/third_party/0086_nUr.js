  var nUr = __commonJS(ZE => {
    ZE.HttpAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(ZE.HttpAuthLocation || (ZE.HttpAuthLocation = {}));
    ZE.HttpApiKeyAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(ZE.HttpApiKeyAuthLocation || (ZE.HttpApiKeyAuthLocation = {}));
    ZE.EndpointURLScheme = undefined;
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(ZE.EndpointURLScheme || (ZE.EndpointURLScheme = {}));
    ZE.AlgorithmId = undefined;
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(ZE.AlgorithmId || (ZE.AlgorithmId = {}));
    var tzu = e => {
      let t = [];
      if (e.sha256 !== undefined) {
        t.push({
          algorithmId: () => ZE.AlgorithmId.SHA256,
          checksumConstructor: () => e.sha256
        });
      }
      if (e.md5 != null) {
        t.push({
          algorithmId: () => ZE.AlgorithmId.MD5,
          checksumConstructor: () => e.md5
        });
      }
      return {
        addChecksumAlgorithm(n) {
          t.push(n);
        },
        checksumAlgorithms() {
          return t;
        }
      };
    };
    var nzu = e => {
      let t = {};
      e.checksumAlgorithms().forEach(n => {
        t[n.algorithmId()] = n.checksumConstructor();
      });
      return t;
    };
    var rzu = e => tzu(e);
    var ozu = e => nzu(e);
    ZE.FieldPosition = undefined;
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(ZE.FieldPosition || (ZE.FieldPosition = {}));
    ZE.IniSectionType = undefined;
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(ZE.IniSectionType || (ZE.IniSectionType = {}));
    ZE.RequestHandlerProtocol = undefined;
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(ZE.RequestHandlerProtocol || (ZE.RequestHandlerProtocol = {}));
    ZE.SMITHY_CONTEXT_KEY = "__smithy_context";
    ZE.getDefaultExtensionConfiguration = rzu;
    ZE.resolveDefaultRuntimeConfig = ozu;
  });
  var ebn = __commonJS(oAe => {
    var izu = nUr();
    var azu = e => ({
      setHttpHandler(t) {
        e.httpHandler = t;
      },
      httpHandler() {
        return e.httpHandler;
      },
      updateHttpClientConfig(t, n) {
        e.httpHandler?.updateHttpClientConfig(t, n);
      },
      httpHandlerConfigs() {
        return e.httpHandler.httpHandlerConfigs();
      }
    });
    var lzu = e => ({
      httpHandler: e.httpHandler()
    });
    class iUs {
      name;
      kind;
      values;
      constructor({
        name: e,
        kind: t = izu.FieldPosition.HEADER,
        values: n = []
      }) {
        this.name = e;
        this.kind = t;
        this.values = n;
      }
      add(e) {
        this.values.push(e);
      }
      set(e) {
        this.values = e;
      }
      remove(e) {
        this.values = this.values.filter(t => t !== e);
      }
      toString() {
        return this.values.map(e => e.includes(",") || e.includes(" ") ? `"${e}"` : e).join(", ");
      }
      get() {
        return this.values;
      }
    }
    class aUs {
      entries = {};
      encoding;
      constructor({
        fields: e = [],
        encoding: t = "utf-8"
      }) {
        e.forEach(this.setField.bind(this));
        this.encoding = t;
      }
      setField(e) {
        this.entries[e.name.toLowerCase()] = e;
      }
      getField(e) {
        return this.entries[e.toLowerCase()];
      }
      removeField(e) {
        delete this.entries[e.toLowerCase()];
      }
      getByType(e) {
        return Object.values(this.entries).filter(t => t.kind === e);
      }
    }
    class Z_n {
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
        let t = new Z_n({
          ...e,
          headers: {
            ...e.headers
          }
        });
        if (t.query) {
          t.query = czu(t.query);
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
        return Z_n.clone(this);
      }
    }
    function czu(e) {
      return Object.keys(e).reduce((t, n) => {
        let r = e[n];
        return {
          ...t,
          [n]: Array.isArray(r) ? [...r] : r
        };
      }, {});
    }
    class lUs {
      statusCode;
      reason;
      headers;
      body;
      constructor(e) {
        this.statusCode = e.statusCode;
        this.reason = e.reason;
        this.headers = e.headers || {};
        this.body = e.body;
      }
      static isInstance(e) {
        if (!e) {
          return false;
        }
        let t = e;
        return typeof t.statusCode === "number" && typeof t.headers === "object";
      }
    }
    function uzu(e) {
      return /^[a-z0-9][a-z0-9\.\-]*[a-z0-9]$/.test(e);
    }
    oAe.Field = iUs;
    oAe.Fields = aUs;
    oAe.HttpRequest = Z_n;
    oAe.HttpResponse = lUs;
    oAe.getHttpHandlerExtensionConfiguration = azu;
    oAe.isValidHostname = uzu;
    oAe.resolveHttpHandlerRuntimeConfig = lzu;
  });
  var cUs = __commonJS(ev => {
    ev.HttpAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(ev.HttpAuthLocation || (ev.HttpAuthLocation = {}));
    ev.HttpApiKeyAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(ev.HttpApiKeyAuthLocation || (ev.HttpApiKeyAuthLocation = {}));
    ev.EndpointURLScheme = undefined;
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(ev.EndpointURLScheme || (ev.EndpointURLScheme = {}));
    ev.AlgorithmId = undefined;
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(ev.AlgorithmId || (ev.AlgorithmId = {}));
    var dzu = e => {
      let t = [];
      if (e.sha256 !== undefined) {
        t.push({
          algorithmId: () => ev.AlgorithmId.SHA256,
          checksumConstructor: () => e.sha256
        });
      }
      if (e.md5 != null) {
        t.push({
          algorithmId: () => ev.AlgorithmId.MD5,
          checksumConstructor: () => e.md5
        });
      }
      return {
        addChecksumAlgorithm(n) {
          t.push(n);
        },
        checksumAlgorithms() {
          return t;
        }
      };
    };
    var pzu = e => {
      let t = {};
      e.checksumAlgorithms().forEach(n => {
        t[n.algorithmId()] = n.checksumConstructor();
      });
      return t;
    };
    var mzu = e => dzu(e);
    var fzu = e => pzu(e);
    ev.FieldPosition = undefined;
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(ev.FieldPosition || (ev.FieldPosition = {}));
    ev.IniSectionType = undefined;
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(ev.IniSectionType || (ev.IniSectionType = {}));
    ev.RequestHandlerProtocol = undefined;
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(ev.RequestHandlerProtocol || (ev.RequestHandlerProtocol = {}));
    ev.SMITHY_CONTEXT_KEY = "__smithy_context";
    ev.getDefaultExtensionConfiguration = mzu;
    ev.resolveDefaultRuntimeConfig = fzu;
  });
  var mUs = __commonJS(sAe => {
    var gzu = cUs();
    var yzu = e => ({
      setHttpHandler(t) {
        e.httpHandler = t;
      },
      httpHandler() {
        return e.httpHandler;
      },
      updateHttpClientConfig(t, n) {
        e.httpHandler?.updateHttpClientConfig(t, n);
      },
      httpHandlerConfigs() {
        return e.httpHandler.httpHandlerConfigs();
      }
    });
    var _zu = e => ({
      httpHandler: e.httpHandler()
    });
    class uUs {
      name;
      kind;
      values;
      constructor({
        name: e,
        kind: t = gzu.FieldPosition.HEADER,
        values: n = []
      }) {
        this.name = e;
        this.kind = t;
        this.values = n;
      }
      add(e) {
        this.values.push(e);
      }
      set(e) {
        this.values = e;
      }
      remove(e) {
        this.values = this.values.filter(t => t !== e);
      }
      toString() {
        return this.values.map(e => e.includes(",") || e.includes(" ") ? `"${e}"` : e).join(", ");
      }
      get() {
        return this.values;
      }
    }
    class dUs {
      entries = {};
      encoding;
      constructor({
        fields: e = [],
        encoding: t = "utf-8"
      }) {
        e.forEach(this.setField.bind(this));
        this.encoding = t;
      }
      setField(e) {
        this.entries[e.name.toLowerCase()] = e;
      }
      getField(e) {
        return this.entries[e.toLowerCase()];
      }
      removeField(e) {
        delete this.entries[e.toLowerCase()];
      }
      getByType(e) {
        return Object.values(this.entries).filter(t => t.kind === e);
      }
    }
    class tbn {
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
        let t = new tbn({
          ...e,
          headers: {
            ...e.headers
          }
        });
        if (t.query) {
          t.query = bzu(t.query);
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
        return tbn.clone(this);
      }
    }
    function bzu(e) {
      return Object.keys(e).reduce((t, n) => {
        let r = e[n];
        return {
          ...t,
          [n]: Array.isArray(r) ? [...r] : r
        };
      }, {});
    }
    class pUs {
      statusCode;
      reason;
      headers;
      body;
      constructor(e) {
        this.statusCode = e.statusCode;
        this.reason = e.reason;
        this.headers = e.headers || {};
        this.body = e.body;
      }
      static isInstance(e) {
        if (!e) {
          return false;
        }
        let t = e;
        return typeof t.statusCode === "number" && typeof t.headers === "object";
      }
    }
    function Szu(e) {
      return /^[a-z0-9][a-z0-9\.\-]*[a-z0-9]$/.test(e);
    }
    sAe.Field = uUs;
    sAe.Fields = dUs;
    sAe.HttpRequest = tbn;
    sAe.HttpResponse = pUs;
    sAe.getHttpHandlerExtensionConfiguration = yzu;
    sAe.isValidHostname = Szu;
    sAe.resolveHttpHandlerRuntimeConfig = _zu;
  });
  var oUr = __commonJS(urt => {
    var Tzu = mUs();
    var fUs = (e, t) => (n, r) => async o => {
      let {
        response: s
      } = await n(o);
      try {
        let i = await t(s, e);
        return {
          response: s,
          output: i
        };
      } catch (i) {
        if (Object.defineProperty(i, "$response", {
          value: s,
          enumerable: false,
          writable: false,
          configurable: false
        }), !("$metadata" in i)) {
          try {
            i.message += `
  Deserialization error: to see the raw response, inspect the hidden field {error}.$response on this object.`;
          } catch (l) {
            if (!r.logger || r.logger?.constructor?.name === "NoOpLogger") {
              console.warn("Deserialization error: to see the raw response, inspect the hidden field {error}.$response on this object.");
            } else {
              r.logger?.warn?.("Deserialization error: to see the raw response, inspect the hidden field {error}.$response on this object.");
            }
          }
          if (typeof i.$responseBodyText < "u") {
            if (i.$response) {
              i.$response.body = i.$responseBodyText;
            }
          }
          try {
            if (Tzu.HttpResponse.isInstance(s)) {
              let {
                headers: l = {}
              } = s;
              let c = Object.entries(l);
              i.$metadata = {
                httpStatusCode: s.statusCode,
                requestId: rUr(/^x-[\w-]+-request-?id$/, c),
                extendedRequestId: rUr(/^x-[\w-]+-id-2$/, c),
                cfId: rUr(/^x-[\w-]+-cf-id$/, c)
              };
            }
          } catch (l) {}
        }
        throw i;
      }
    };
    var rUr = (e, t) => (t.find(([n]) => n.match(e)) || [undefined, undefined])[1];
    var hUs = (e, t) => (n, r) => async o => {
      let s = e;
      let i = r.endpointV2?.url && s.urlParser ? async () => s.urlParser(r.endpointV2.url) : s.endpoint;
      if (!i) {
        throw Error("No valid endpoint provider available.");
      }
      let a = await t(o.input, {
        ...e,
        endpoint: i
      });
      return n({
        ...o,
        request: a
      });
    };
    var gUs = {
      name: "deserializerMiddleware",
      step: "deserialize",
      tags: ["DESERIALIZER"],
      override: true
    };
    var yUs = {
      name: "serializerMiddleware",
      step: "serialize",
      tags: ["SERIALIZER"],
      override: true
    };
    function Ezu(e, t, n) {
      return {
        applyToStack: r => {
          r.add(fUs(e, n), gUs);
          r.add(hUs(e, t), yUs);
        }
      };
    }
    urt.deserializerMiddleware = fUs;
    urt.deserializerMiddlewareOption = gUs;
    urt.getSerdePlugin = Ezu;
    urt.serializerMiddleware = hUs;
    urt.serializerMiddlewareOption = yUs;
  });
  var Od = __commonJS(hk => {
    var nbn = EFr();
    var _Us = zB();
    var vzu = oUr();
    var sUr = yNt();
    var wzu = tw();
    var Czu = e => e[nbn.SMITHY_CONTEXT_KEY] || (e[nbn.SMITHY_CONTEXT_KEY] = {});
    var Rzu = (e, t) => {
      if (!t || t.length === 0) {
        return e;
      }
      let n = [];
      for (let r of t) {
        for (let o of e) {
          if (o.schemeId.split("#")[1] === r) {
            n.push(o);
          }
        }
      }
      for (let r of e) {
        if (!n.find(({
          schemeId: o
        }) => o === r.schemeId)) {
          n.push(r);
        }
      }
      return n;
    };
    function xzu(e) {
      let t = new Map();
      for (let n of e) {
        t.set(n.schemeId, n);
      }
      return t;
    }
    var iUr = (e, t) => (n, r) => async o => {
      let s = e.httpAuthSchemeProvider(await t.httpAuthSchemeParametersProvider(e, r, o.input));
      let i = e.authSchemePreference ? await e.authSchemePreference() : [];
      let a = Rzu(s, i);
      let l = xzu(e.httpAuthSchemes);
      let c = _Us.getSmithyContext(r);
      let u = [];
      for (let d of a) {
        let p = l.get(d.schemeId);
        if (!p) {
          u.push(`HttpAuthScheme \`${d.schemeId}\` was not enabled for this service.`);
          continue;
        }
        let m = p.identityProvider(await t.identityProviderConfigProvider(e));
        if (!m) {
          u.push(`HttpAuthScheme \`${d.schemeId}\` did not have an IdentityProvider configured.`);
          continue;
        }
        let {
          identityProperties: f = {},
          signingProperties: h = {}
        } = d.propertiesExtractor?.(e, r) || {};
        d.identityProperties = Object.assign(d.identityProperties || {}, f);
        d.signingProperties = Object.assign(d.signingProperties || {}, h);
        c.selectedHttpAuthScheme = {
          httpAuthOption: d,
          identity: await m(d.identityProperties),
          signer: p.signer
        };
        break;
      }
      if (!c.selectedHttpAuthScheme) {
        throw Error(u.join(`
`));
      }
      return n(o);
    };
    var bUs = {
      step: "serialize",
      tags: ["HTTP_AUTH_SCHEME"],
      name: "httpAuthSchemeMiddleware",
      override: true,
      relation: "before",
      toMiddleware: "endpointV2Middleware"
    };
    var kzu = (e, {
      httpAuthSchemeParametersProvider: t,
      identityProviderConfigProvider: n
    }) => ({
      applyToStack: r => {
        r.addRelativeTo(iUr(e, {
          httpAuthSchemeParametersProvider: t,
          identityProviderConfigProvider: n
        }), bUs);
      }
    });
    var SUs = {
      step: "serialize",
      tags: ["HTTP_AUTH_SCHEME"],
      name: "httpAuthSchemeMiddleware",
      override: true,
      relation: "before",
      toMiddleware: vzu.serializerMiddlewareOption.name
    };
    var Azu = (e, {
      httpAuthSchemeParametersProvider: t,
      identityProviderConfigProvider: n
    }) => ({
      applyToStack: r => {
        r.addRelativeTo(iUr(e, {
          httpAuthSchemeParametersProvider: t,
          identityProviderConfigProvider: n
        }), SUs);
      }
    });
    var Izu = e => t => {
      throw t;
    };
    var Pzu = (e, t) => {};
    var TUs = e => (t, n) => async r => {
      if (!sUr.HttpRequest.isInstance(r.request)) {
        return t(r);
      }
      let s = _Us.getSmithyContext(n).selectedHttpAuthScheme;
      if (!s) {
        throw Error("No HttpAuthScheme was selected: unable to sign request");
      }
      let {
        httpAuthOption: {
          signingProperties: i = {}
        },
        identity: a,
        signer: l
      } = s;
      let c = await t({
        ...r,
        request: await l.sign(r.request, a, i)
      }).catch((l.errorHandler || Izu)(i));
      (l.successHandler || Pzu)(c.response, i);
      return c;
    };
    var EUs = {
      step: "finalizeRequest",
      tags: ["HTTP_SIGNING"],
      name: "httpSigningMiddleware",
      aliases: ["apiKeyMiddleware", "tokenMiddleware", "awsAuthMiddleware"],
      override: true,
      relation: "after",
      toMiddleware: "retryMiddleware"
    };
    var Ozu = e => ({
      applyToStack: t => {
        t.addRelativeTo(TUs(), EUs);
      }
    });
    var Dzu = e => {
      if (typeof e === "function") {
        return e;
      }
      let t = Promise.resolve(e);
      return () => t;
    };
    var Mzu = async (e, t, n, r = s => s, ...o) => {
      let s = new e(n);
      s = r(s) ?? s;
      return await t.send(s, ...o);
    };
    function Nzu(e, t, n, r, o) {
      return async function* (i, a, ...l) {
        let c = a;
        let u = i.startingToken ?? c[n];
        let d = true;
        let p;
        while (d) {
          if (c[n] = u, o) {
            c[o] = c[o] ?? i.pageSize;
          }
          if (i.client instanceof e) {
            p = await Mzu(t, i.client, a, i.withCommand, ...l);
          } else {
            throw Error(`Invalid client, expected instance of ${e.name}`);
          }
          yield p;
          let m = u;
          u = Lzu(p, r);
          d = !!(u && (!i.stopOnSameToken || u !== m));
        }
        return;
      };
    }
    var Lzu = (e, t) => {
      let n = e;
      let r = t.split(".");
      for (let o of r) {
        if (!n || typeof n !== "object") {
          return;
        }
        n = n[o];
      }
      return n;
    };
    function Fzu(e, t, n) {
      if (!e.__smithy_context) {
        e.__smithy_context = {
          features: {}
        };
      } else if (!e.__smithy_context.features) {
        e.__smithy_context.features = {};
      }
      e.__smithy_context.features[t] = n;
    }
    class vUs {
      authSchemes = new Map();
      constructor(e) {
        for (let [t, n] of Object.entries(e)) {
          if (n !== undefined) {
            this.authSchemes.set(t, n);
          }
        }
      }
      getIdentityProvider(e) {
        return this.authSchemes.get(e);
      }
    }
    class wUs {
      async sign(e, t, n) {
        if (!n) {
          throw Error("request could not be signed with `apiKey` since the `name` and `in` signer properties are missing");
        }
        if (!n.name) {
          throw Error("request could not be signed with `apiKey` since the `name` signer property is missing");
        }
        if (!n.in) {
          throw Error("request could not be signed with `apiKey` since the `in` signer property is missing");
        }
        if (!t.apiKey) {
          throw Error("request could not be signed with `apiKey` since the `apiKey` is not defined");
        }
        let r = sUr.HttpRequest.clone(e);
        if (n.in === nbn.HttpApiKeyAuthLocation.QUERY) {
          r.query[n.name] = t.apiKey;
        } else if (n.in === nbn.HttpApiKeyAuthLocation.HEADER) {
          r.headers[n.name] = n.scheme ? `${n.scheme} ${t.apiKey}` : t.apiKey;
        } else {
          throw Error("request can only be signed with `apiKey` locations `query` or `header`, but found: `" + n.in + "`");
        }
        return r;
      }
    }
    class CUs {
      async sign(e, t, n) {
        let r = sUr.HttpRequest.clone(e);
        if (!t.token) {
          throw Error("request could not be signed with `token` since the `token` is not defined");
        }
        r.headers.Authorization = `Bearer ${t.token}`;
        return r;
      }
    }
    class RUs {
      async sign(e, t, n) {
        return e;
      }
    }
    var xUs = e => function (n) {
      return AUs(n) && n.expiration.getTime() - Date.now() < e;
    };
    var Uzu = xUs(300000);
    var AUs = e => e.expiration !== undefined;
    var Bzu = (e, t, n) => {
      if (e === undefined) {
        return;
      }
      let r = typeof e !== "function" ? async () => Promise.resolve(e) : e;
      let o;
      let s;
      let i;
      let a = false;
      let l = async c => {
        if (!s) {
          s = r(c);
        }
        try {
          o = await s;
          i = true;
          a = false;
        } finally {
          s = undefined;
        }
        return o;
      };
      if (t === undefined) {
        return async c => {
          if (!i || c?.forceRefresh) {
            o = await l(c);
          }
          return o;
        };
      }
      return async c => {
        if (!i || c?.forceRefresh) {
          o = await l(c);
        }
        if (a) {
          return o;
        }
        if (!n(o)) {
          a = true;
          return o;
        }
        if (t(o)) {
          await l(c);
          return o;
        }
        return o;
      };
    };
    Object.defineProperty(hk, "requestBuilder", {
      enumerable: true,
      get: function () {
        return wzu.requestBuilder;
      }
    });
    hk.DefaultIdentityProviderConfig = vUs;
    hk.EXPIRATION_MS = 300000;
    hk.HttpApiKeyAuthSigner = wUs;
    hk.HttpBearerAuthSigner = CUs;
    hk.NoAuthSigner = RUs;
    hk.createIsIdentityExpiredFunction = xUs;
    hk.createPaginator = Nzu;
    hk.doesIdentityRequireRefresh = AUs;
    hk.getHttpAuthSchemeEndpointRuleSetPlugin = kzu;
    hk.getHttpAuthSchemePlugin = Azu;
    hk.getHttpSigningPlugin = Ozu;
    hk.getSmithyContext = Czu;
    hk.httpAuthSchemeEndpointRuleSetMiddlewareOptions = bUs;
    hk.httpAuthSchemeMiddleware = iUr;
    hk.httpAuthSchemeMiddlewareOptions = SUs;
    hk.httpSigningMiddleware = TUs;
    hk.httpSigningMiddlewareOptions = EUs;
    hk.isIdentityExpired = Uzu;
    hk.memoizeIdentityProvider = Bzu;
    hk.normalizeProvider = Dzu;
    hk.setFeature = Fzu;
  });
  var PUs = __commonJS(lUr => {
    var IUs = {};
    var aUr = {};
    for (let e = 0; e < 256; e++) {
      let t = e.toString(16).toLowerCase();
      if (t.length === 1) {
        t = `0${t}`;
      }
      IUs[e] = t;
      aUr[t] = e;
    }
    function $zu(e) {
      if (e.length % 2 !== 0) {
        throw Error("Hex encoded strings must have an even number length");
      }
      let t = new Uint8Array(e.length / 2);
      for (let n = 0; n < e.length; n += 2) {
        let r = e.slice(n, n + 2).toLowerCase();
        if (r in aUr) {
          t[n / 2] = aUr[r];
        } else {
          throw Error(`Cannot decode unrecognized sequence ${r} as hexadecimal`);
        }
      }
      return t;
    }
    function Hzu(e) {
      let t = "";
      for (let n = 0; n < e.byteLength; n++) {
        t += IUs[e[n]];
      }
      return t;
    }
    lUr.fromHex = $zu;
    lUr.toHex = Hzu;
  });
  var DUs = __commonJS(OUs => {
    var jzu = e => typeof ArrayBuffer === "function" && e instanceof ArrayBuffer || Object.prototype.toString.call(e) === "[object ArrayBuffer]";
    OUs.isArrayBuffer = jzu;
  });
  var NUs = __commonJS(cUr => {
    var MUs = e => encodeURIComponent(e).replace(/[!'()*]/g, qzu);
    var qzu = e => `%${e.charCodeAt(0).toString(16).toUpperCase()}`;
    var Wzu = e => e.split("/").map(MUs).join("/");
    cUr.escapeUri = MUs;
    cUr.escapeUriPath = Wzu;
  });
  var SUr = __commonJS(Tf => {
    var iAe = PUs();
    var Fje = jT();
    var Gzu = DUs();
    var BUs = ebn();
    var LUs = zB();
    var rbn = NUs();
    var gUr = ("X-Amz-Date").toLowerCase();
    var GUs = ["authorization", gUr, "date"];
    var VUs = ("X-Amz-Signature").toLowerCase();
    var zUs = ("X-Amz-Security-Token").toLowerCase();
    var KUs = {
      authorization: true,
      "cache-control": true,
      connection: true,
      expect: true,
      from: true,
      "keep-alive": true,
      "max-forwards": true,
      pragma: true,
      referer: true,
      te: true,
      trailer: true,
      "transfer-encoding": true,
      upgrade: true,
      "user-agent": true,
      "x-amzn-trace-id": true
    };
    var Kzu = [/^proxy-/i, /^sec-/i];
    var drt = {};
    var sbn = [];
    var ibn = (e, t, n) => `${e}/${t}/${n}/${"aws4_request"}`;
    var tBs = async (e, t, n, r, o) => {
      let s = await FUs(e, t.secretAccessKey, t.accessKeyId);
      let i = `${n}:${r}:${o}:${iAe.toHex(s)}:${t.sessionToken}`;
      if (i in drt) {
        return drt[i];
      }
      sbn.push(i);
      while (sbn.length > 50) {
        delete drt[sbn.shift()];
      }
      let a = `AWS4${t.secretAccessKey}`;
      for (let l of [n, r, o, "aws4_request"]) {
        a = await FUs(e, a, l);
      }
      return drt[i] = a;
    };
    var Jzu = () => {
      sbn.length = 0;
      Object.keys(drt).forEach(e => {
        delete drt[e];
      });
    };
    var FUs = (e, t, n) => {
      let r = new e(t);
      r.update(Fje.toUint8Array(n));
      return r.digest();
    };
    var uUr = ({
      headers: e
    }, t, n) => {
      let r = {};
      for (let o of Object.keys(e).sort()) {
        if (e[o] == null) {
          continue;
        }
        let s = o.toLowerCase();
        if (s in KUs || t?.vZc(s) || (/^proxy-/).test(s) || (/^sec-/).test(s)) {
          if (!n || n && !n.vZc(s)) {
            continue;
          }
        }
        r[s] = e[o].trim().replace(/\s+/g, " ");
      }
      return r;
    };
    var abn = async ({
      headers: e,
      body: t
    }, n) => {
      for (let r of Object.keys(e)) {
        if (r.toLowerCase() === "x-amz-content-sha256") {
          return e[r];
        }
      }
      if (t == null) {
        return "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
      } else if (typeof t === "string" || ArrayBuffer.isView(t) || Gzu.isArrayBuffer(t)) {
        let r = new n();
        r.update(Fje.toUint8Array(t));
        return iAe.toHex(await r.digest());
      }
      return "UNSIGNED-PAYLOAD";
    };
    class nBs {
      format(e) {
        let t = [];
        for (let o of Object.keys(e)) {
          let s = Fje.fromUtf8(o);
          t.push(Uint8Array.from([s.byteLength]), s, this.formatHeaderValue(e[o]));
        }
        let n = new Uint8Array(t.reduce((o, s) => o + s.byteLength, 0));
        let r = 0;
        for (let o of t) {
          n.set(o, r);
          r += o.byteLength;
        }
        return n;
      }
      formatHeaderValue(e) {
        switch (e.type) {
          case "boolean":
            return Uint8Array.from([e.value ? 0 : 1]);
          case "byte":
            return Uint8Array.from([2, e.value]);
          case "short":
            let t = new DataView(new ArrayBuffer(3));
            t.setUint8(0, 3);
            t.setInt16(1, e.value, false);
            return new Uint8Array(t.buffer);
          case "integer":
            let n = new DataView(new ArrayBuffer(5));
            n.setUint8(0, 4);
            n.setInt32(1, e.value, false);
            return new Uint8Array(n.buffer);
          case "long":
            let r = new Uint8Array(9);
            r[0] = 5;
            r.set(e.value.bytes, 1);
            return r;
          case "binary":
            let o = new DataView(new ArrayBuffer(3 + e.value.byteLength));
            o.setUint8(0, 6);
            o.setUint16(1, e.value.byteLength, false);
            let s = new Uint8Array(o.buffer);
            s.set(e.value, 3);
            return s;
          case "string":
            let i = Fje.fromUtf8(e.value);
            let a = new DataView(new ArrayBuffer(3 + i.byteLength));
            a.setUint8(0, 7);
            a.setUint16(1, i.byteLength, false);
            let l = new Uint8Array(a.buffer);
            l.set(i, 3);
            return l;
          case "timestamp":
            let c = new Uint8Array(9);
            c[0] = 8;
            c.set(_Ur.fromNumber(e.value.valueOf()).bytes, 1);
            return c;
          case "uuid":
            if (!(/^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$/).test(e.value)) {
              throw Error(`Invalid UUID received: ${e.value}`);
            }
            let u = new Uint8Array(17);
            u[0] = 9;
            u.set(iAe.fromHex(e.value.replace(/\-/g, "")), 1);
            return u;
        }
      }
    }
    class _Ur {
      bytes;
      constructor(e) {
        if (this.bytes = e, e.byteLength !== 8) {
          throw Error("Int64 buffers must be exactly 8 bytes");
        }
      }
      static fromNumber(e) {
        if (e > 9223372036854776000 || e < -9223372036854776000) {
          throw Error(`${e} is too large (or, if negative, too small) to represent as an Int64`);
        }
        let t = new Uint8Array(8);
        for (let n = 7, r = Math.abs(Math.round(e)); n > -1 && r > 0; n--, r /= 256) {
          t[n] = r;
        }
        if (e < 0) {
          UUs(t);
        }
        return new _Ur(t);
      }
      valueOf() {
        let e = this.bytes.slice(0);
        let t = e[0] & 128;
        if (t) {
          UUs(e);
        }
        return parseInt(iAe.toHex(e), 16) * (t ? -1 : 1);
      }
      toString() {
        return String(this.valueOf());
      }
    }
    function UUs(e) {
      for (let t = 0; t < 8; t++) {
        e[t] ^= 255;
      }
      for (let t = 7; t > -1; t--) {
        if (e[t]++, e[t] !== 0) {
          break;
        }
      }
    }
    var rBs = (e, t) => {
      e = e.toLowerCase();
      for (let n of Object.keys(t)) {
        if (e === n.toLowerCase()) {
          return true;
        }
      }
      return false;
    };
    var oBs = (e, t = {}) => {
      let {
        headers: n,
        query: r = {}
      } = BUs.HttpRequest.clone(e);
      for (let o of Object.keys(n)) {
        let s = o.toLowerCase();
        if (s.slice(0, 6) === "x-amz-" && !t.unhoistableHeaders?.vZc(s) || t.hoistableHeaders?.vZc(s)) {
          r[o] = n[o];
          delete n[o];
        }
      }
      return {
        ...e,
        headers: n,
        query: r
      };
    };
    var dUr = e => {
      e = BUs.HttpRequest.clone(e);
      for (let t of Object.keys(e.headers)) {
        if (GUs.indexOf(t.toLowerCase()) > -1) {
          delete e.headers[t];
        }
      }
      return e;
    };
    var sBs = ({
      query: e = {}
    }) => {
      let t = [];
      let n = {};
      for (let r of Object.keys(e)) {
        if (r.toLowerCase() === VUs) {
          continue;
        }
        let o = rbn.escapeUri(r);
        t.push(o);
        let s = e[r];
        if (typeof s === "string") {
          n[o] = `${o}=${rbn.escapeUri(s)}`;
        } else if (Array.isArray(s)) {
          n[o] = s.slice(0).reduce((i, a) => i.concat([`${o}=${rbn.escapeUri(a)}`]), []).sort().join("&");
        }
      }
      return t.sort().map(r => n[r]).filter(r => r).join("&");
    };
    var Qzu = e => Zzu(e).toISOString().replace(/\.\d{3}Z$/, "Z");
    var Zzu = e => {
      if (typeof e === "number") {
        return new Date(e * 1000);
      }
      if (typeof e === "string") {
        if (Number(e)) {
          return new Date(Number(e) * 1000);
        }
        return new Date(e);
      }
      return e;
    };
    class bUr {
      service;
      regionProvider;
      credentialProvider;
      sha256;
      uriEscapePath;
      applyChecksum;
      constructor({
        applyChecksum: e,
        credentials: t,
        region: n,
        service: r,
        sha256: o,
        uriEscapePath: s = true
      }) {
        this.service = r;
        this.sha256 = o;
        this.uriEscapePath = s;
        this.applyChecksum = typeof e === "boolean" ? e : true;
        this.regionProvider = LUs.normalizeProvider(n);
        this.credentialProvider = LUs.normalizeProvider(t);
      }
      createCanonicalRequest(e, t, n) {
        let r = Object.keys(t).sort();
        return `${e.method}
${this.getCanonicalPath(e)}
${sBs(e)}
${r.map(o => `${o}:${t[o]}`).join(`
`)}

${r.join(";")}
${n}`;
      }
      async createStringToSign(e, t, n, r) {
        let o = new this.sha256();
        o.update(Fje.toUint8Array(n));
        let s = await o.digest();
        return `${r}
${e}
${t}
${iAe.toHex(s)}`;
      }
      getCanonicalPath({
        path: e
      }) {
        if (this.uriEscapePath) {
          let t = [];
          for (let o of e.split("/")) {
            if (o?.length === 0) {
              continue;
            }
            if (o === ".") {
              continue;
            }
            if (o === "..") {
              t.pop();
            } else {
              t.push(o);
            }
          }
          let n = `${e?.startsWith("/") ? "/" : ""}${t.join("/")}${t.length > 0 && e?.endsWith("/") ? "/" : ""}`;
          return rbn.escapeUri(n).replace(/%2F/g, "/");
        }
        return e;
      }
      validateResolvedCredentials(e) {
        if (typeof e !== "object" || typeof e.accessKeyId !== "string" || typeof e.secretAccessKey !== "string") {
          throw Error("Resolved credential object is not valid");
        }
      }
      formatDate(e) {
        let t = Qzu(e).replace(/[\-:]/g, "");
        return {
          longDate: t,
          shortDate: t.slice(0, 8)
        };
      }
      getCanonicalHeaderList(e) {
        return Object.keys(e).sort().join(";");
      }
    }
    class iBs extends bUr {
      headerFormatter = new nBs();
      constructor({
        applyChecksum: e,
        credentials: t,
        region: n,
        service: r,
        sha256: o,
        uriEscapePath: s = true
      }) {
        super({
          applyChecksum: e,
          credentials: t,
          region: n,
          service: r,
          sha256: o,
          uriEscapePath: s
        });
      }
      async presign(e, t = {}) {
        let {
          signingDate: n = new Date(),
          expiresIn: r = 3600,
          unsignableHeaders: o,
          unhoistableHeaders: s,
          signableHeaders: i,
          hoistableHeaders: a,
          signingRegion: l,
          signingService: c
        } = t;
        let u = await this.credentialProvider();
        this.validateResolvedCredentials(u);
        let d = l ?? (await this.regionProvider());
        let {
          longDate: p,
          shortDate: m
        } = this.formatDate(n);
        if (r > 604800) {
          return Promise.reject("Signature version 4 presigned URLs must have an expiration date less than one week in the future");
        }
        let f = ibn(m, d, c ?? this.service);
        let h = oBs(dUr(e), {
          unhoistableHeaders: s,
          hoistableHeaders: a
        });
        if (u.sessionToken) {
          h.query["X-Amz-Security-Token"] = u.sessionToken;
        }
        h.query["X-Amz-Algorithm"] = "AWS4-HMAC-SHA256";
        h.query["X-Amz-Credential"] = `${u.accessKeyId}/${f}`;
        h.query["X-Amz-Date"] = p;
        h.query["X-Amz-Expires"] = r.toString(10);
        let g = uUr(h, o, i);
        h.query["X-Amz-SignedHeaders"] = this.getCanonicalHeaderList(g);
        h.query["X-Amz-Signature"] = await this.getSignature(p, f, this.getSigningKey(u, d, m, c), this.createCanonicalRequest(h, g, await abn(e, this.sha256)));
        return h;
      }
      async sign(e, t) {
        if (typeof e === "string") {
          return this.signString(e, t);
        } else if (e.headers && e.payload) {
          return this.signEvent(e, t);
        } else if (e.message) {
          return this.signMessage(e, t);
        } else {
          return this.signRequest(e, t);
        }
      }
      async signEvent({
        headers: e,
        payload: t
      }, {
        signingDate: n = new Date(),
        priorSignature: r,
        signingRegion: o,
        signingService: s
      }) {
        let i = o ?? (await this.regionProvider());
        let {
          shortDate: a,
          longDate: l
        } = this.formatDate(n);
        let c = ibn(a, i, s ?? this.service);
        let u = await abn({
          headers: {},
          body: t
        }, this.sha256);
        let d = new this.sha256();
        d.update(e);
        let p = iAe.toHex(await d.digest());
        let m = ["AWS4-HMAC-SHA256-PAYLOAD", l, c, r, p, u].join(`
`);
        return this.signString(m, {
          signingDate: n,
          signingRegion: i,
          signingService: s
        });
      }
      async signMessage(e, {
        signingDate: t = new Date(),
        signingRegion: n,
        signingService: r
      }) {
        return this.signEvent({
          headers: this.headerFormatter.format(e.message.headers),
          payload: e.message.body
        }, {
          signingDate: t,
          signingRegion: n,
          signingService: r,
          priorSignature: e.priorSignature
        }).then(s => ({
          message: e.message,
          signature: s
        }));
      }
      async signString(e, {
        signingDate: t = new Date(),
        signingRegion: n,
        signingService: r
      } = {}) {
        let o = await this.credentialProvider();
        this.validateResolvedCredentials(o);
        let s = n ?? (await this.regionProvider());
        let {
          shortDate: i
        } = this.formatDate(t);
        let a = new this.sha256(await this.getSigningKey(o, s, i, r));
        a.update(Fje.toUint8Array(e));
        return iAe.toHex(await a.digest());
      }
      async signRequest(e, {
        signingDate: t = new Date(),
        signableHeaders: n,
        unsignableHeaders: r,
        signingRegion: o,
        signingService: s
      } = {}) {
        let i = await this.credentialProvider();
        this.validateResolvedCredentials(i);
        let a = o ?? (await this.regionProvider());
        let l = dUr(e);
        let {
          longDate: c,
          shortDate: u
        } = this.formatDate(t);
        let d = ibn(u, a, s ?? this.service);
        if (l.headers[gUr] = c, i.sessionToken) {
          l.headers[zUs] = i.sessionToken;
        }
        let p = await abn(l, this.sha256);
        if (!rBs("x-amz-content-sha256", l.headers) && this.applyChecksum) {
          l.headers["x-amz-content-sha256"] = p;
        }
        let m = uUr(l, r, n);
        let f = await this.getSignature(c, d, this.getSigningKey(i, a, u, s), this.createCanonicalRequest(l, m, p));
        l.headers["authorization"] = `${"AWS4-HMAC-SHA256"} Credential=${i.accessKeyId}/${d}, SignedHeaders=${this.getCanonicalHeaderList(m)}, Signature=${f}`;
        return l;
      }
      async getSignature(e, t, n, r) {
        let o = await this.createStringToSign(e, t, r, "AWS4-HMAC-SHA256");
        let s = new this.sha256(await n);
        s.update(Fje.toUint8Array(o));
        return iAe.toHex(await s.digest());
      }
      getSigningKey(e, t, n, r) {
        return tBs(this.sha256, e, n, t, r || this.service);
      }
    }
    var eKu = {
      SignatureV4a: null
    };
    Tf.ALGORITHM_IDENTIFIER = "AWS4-HMAC-SHA256";
    Tf.ALGORITHM_IDENTIFIER_V4A = "AWS4-ECDSA-P256-SHA256";
    Tf.ALGORITHM_QUERY_PARAM = "X-Amz-Algorithm";
    Tf.ALWAYS_UNSIGNABLE_HEADERS = KUs;
    Tf.AMZ_DATE_HEADER = gUr;
    Tf.AMZ_DATE_QUERY_PARAM = "X-Amz-Date";
    Tf.AUTH_HEADER = "authorization";
    Tf.CREDENTIAL_QUERY_PARAM = "X-Amz-Credential";
    Tf.DATE_HEADER = "date";
    Tf.EVENT_ALGORITHM_IDENTIFIER = "AWS4-HMAC-SHA256-PAYLOAD";
    Tf.EXPIRES_QUERY_PARAM = "X-Amz-Expires";
    Tf.GENERATED_HEADERS = GUs;
    Tf.HOST_HEADER = "host";
    Tf.KEY_TYPE_IDENTIFIER = "aws4_request";
    Tf.MAX_CACHE_SIZE = 50;
    Tf.MAX_PRESIGNED_TTL = 604800;
    Tf.PROXY_HEADER_PATTERN = /^proxy-/;
    Tf.REGION_SET_PARAM = "X-Amz-Region-Set";
    Tf.SEC_HEADER_PATTERN = /^sec-/;
    Tf.SHA256_HEADER = "x-amz-content-sha256";
    Tf.SIGNATURE_HEADER = VUs;
    Tf.SIGNATURE_QUERY_PARAM = "X-Amz-Signature";
    Tf.SIGNED_HEADERS_QUERY_PARAM = "X-Amz-SignedHeaders";
    Tf.SignatureV4 = iBs;
    Tf.SignatureV4Base = bUr;
    Tf.TOKEN_HEADER = zUs;
    Tf.TOKEN_QUERY_PARAM = "X-Amz-Security-Token";
    Tf.UNSIGNABLE_PATTERNS = Kzu;
    Tf.UNSIGNED_PAYLOAD = "UNSIGNED-PAYLOAD";
    Tf.clearCredentialCache = Jzu;
    Tf.createScope = ibn;
    Tf.getCanonicalHeaders = uUr;
    Tf.getCanonicalQuery = sBs;
    Tf.getPayloadHash = abn;
    Tf.getSigningKey = tBs;
    Tf.hasHeader = rBs;
    Tf.moveHeadersToQuery = oBs;
    Tf.prepareRequest = dUr;
    Tf.signatureV4aContainer = eKu;
  });
  var yBs = __commonJS(Yte => {
    var TUr = ebn();
    var aAe = Od();
    var aBs = wy();
    var tKu = UP();
    var lBs = SUr();
    var cBs = e => TUr.HttpResponse.isInstance(e) ? e.headers?.date ?? e.headers?.Date : undefined;
    var EUr = e => new Date(Date.now() + e);
    var nKu = (e, t) => Math.abs(EUr(t).getTime() - e) >= 300000;
    var uBs = (e, t) => {
      let n = Date.parse(e);
      if (nKu(n, t)) {
        return n - Date.now();
      }
      return t;
    };
    var ANt = (e, t) => {
      if (!t) {
        throw Error(`Property \`${e}\` is not resolved for AWS SDK SigV4Auth`);
      }
      return t;
    };
    var vUr = async e => {
      let t = ANt("context", e.context);
      let n = ANt("config", e.config);
      let r = t.endpointV2?.properties?.authSchemes?.[0];
      let s = await ANt("signer", n.signer)(r);
      let i = e?.signingRegion;
      let a = e?.signingRegionSet;
      let l = e?.signingName;
      return {
        config: n,
        signer: s,
        signingRegion: i,
        signingRegionSet: a,
        signingName: l
      };
    };
    class cbn {
      async sign(e, t, n) {
        if (!TUr.HttpRequest.isInstance(e)) {
          throw Error("The request is not an instance of `HttpRequest` and cannot be signed");
        }
        let r = await vUr(n);
        let {
          config: o,
          signer: s
        } = r;
        let {
          signingRegion: i,
          signingName: a
        } = r;
        let l = n.context;
        if (l?.authSchemes?.length ?? false) {
          let [u, d] = l.authSchemes;
          if (u?.name === "sigv4a" && d?.name === "sigv4") {
            i = d?.signingRegion ?? i;
            a = d?.signingName ?? a;
          }
        }
        return await s.sign(e, {
          signingDate: EUr(o.systemClockOffset),
          signingRegion: i,
          signingService: a
        });
      }
      errorHandler(e) {
        return t => {
          let n = t.ServerTime ?? cBs(t.$response);
          if (n) {
            let r = ANt("config", e.config);
            let o = r.systemClockOffset;
            if (r.systemClockOffset = uBs(n, r.systemClockOffset), r.systemClockOffset !== o && t.$metadata) {
              t.$metadata.clockSkewCorrected = true;
            }
          }
          throw t;
        };
      }
      successHandler(e, t) {
        let n = cBs(e);
        if (n) {
          let r = ANt("config", t.config);
          r.systemClockOffset = uBs(n, r.systemClockOffset);
        }
      }
    }
    var rKu = cbn;
    class fBs extends cbn {
      async sign(e, t, n) {
        if (!TUr.HttpRequest.isInstance(e)) {
          throw Error("The request is not an instance of `HttpRequest` and cannot be signed");
        }
        let {
          config: r,
          signer: o,
          signingRegion: s,
          signingRegionSet: i,
          signingName: a
        } = await vUr(n);
        let c = ((await r.sigv4aSigningRegionSet?.()) ?? i ?? [s]).join(",");
        return await o.sign(e, {
          signingDate: EUr(r.systemClockOffset),
          signingRegion: c,
          signingService: a
        });
      }
    }
    var dBs = e => typeof e === "string" && e.length > 0 ? e.split(",").map(t => t.trim()) : [];
    var hBs = e => `AWS_BEARER_TOKEN_${e.replace(/[\s-]/g, "_").toUpperCase()}`;
    var oKu = {
      environmentVariableSelector: (e, t) => {
        if (t?.signingName) {
          if (hBs(t.signingName) in e) {
            return ["httpBearerAuth"];
          }
        }
        if (!("AWS_AUTH_SCHEME_PREFERENCE" in e)) {
          return;
        }
        return dBs(e["AWS_AUTH_SCHEME_PREFERENCE"]);
      },
      configFileSelector: e => {
        if (!("auth_scheme_preference" in e)) {
          return;
        }
        return dBs(e["auth_scheme_preference"]);
      },
      default: []
    };
    var sKu = e => (e.sigv4aSigningRegionSet = aAe.normalizeProvider(e.sigv4aSigningRegionSet), e);
    var iKu = {
      environmentVariableSelector(e) {
        if (e.AWS_SIGV4A_SIGNING_REGION_SET) {
          return e.AWS_SIGV4A_SIGNING_REGION_SET.split(",").map(t => t.trim());
        }
        throw new aBs.ProviderError("AWS_SIGV4A_SIGNING_REGION_SET not set in env.", {
          tryNextLink: true
        });
      },
      configFileSelector(e) {
        if (e.sigv4a_signing_region_set) {
          return (e.sigv4a_signing_region_set ?? "").split(",").map(t => t.trim());
        }
        throw new aBs.ProviderError("sigv4a_signing_region_set not set in profile.", {
          tryNextLink: true
        });
      },
      default: undefined
    };
    var gBs = e => {
      let t = e.credentials;
      let n = !!e.credentials;
      let r = undefined;
      Object.defineProperty(e, "credentials", {
        set(c) {
          if (c && c !== t && c !== r) {
            n = true;
          }
          t = c;
          let u = lKu(e, {
            credentials: t,
            credentialDefaultProvider: e.credentialDefaultProvider
          });
          let d = cKu(e, u);
          if (n && !d.attributed) {
            r = async p => d(p).then(m => tKu.setCredentialFeature(m, "CREDENTIALS_CODE", "e"));
            r.memoized = d.memoized;
            r.configBound = d.configBound;
            r.attributed = true;
          } else {
            r = d;
          }
        },
        get() {
          return r;
        },
        enumerable: true,
        configurable: true
      });
      e.credentials = t;
      let {
        signingEscapePath: o = true,
        systemClockOffset: s = e.systemClockOffset || 0,
        sha256: i
      } = e;
      let a;
      if (e.signer) {
        a = aAe.normalizeProvider(e.signer);
      } else if (e.regionInfoProvider) {
        a = () => aAe.normalizeProvider(e.region)().then(async c => [(await e.regionInfoProvider(c, {
          useFipsEndpoint: await e.useFipsEndpoint(),
          useDualstackEndpoint: await e.useDualstackEndpoint()
        })) || {}, c]).then(([c, u]) => {
          let {
            signingRegion: d,
            signingService: p
          } = c;
          e.signingRegion = e.signingRegion || d || u;
          e.signingName = e.signingName || p || e.serviceId;
          let m = {
            ...e,
            credentials: e.credentials,
            region: e.signingRegion,
            service: e.signingName,
            sha256: i,
            uriEscapePath: o
          };
          return new (e.signerConstructor || lBs.SignatureV4)(m);
        });
      } else {
        a = async c => {
          c = Object.assign({}, {
            name: "sigv4",
            signingName: e.signingName || e.defaultSigningName,
            signingRegion: await aAe.normalizeProvider(e.region)(),
            properties: {}
          }, c);
          let {
            signingRegion: u,
            signingName: d
          } = c;
          e.signingRegion = e.signingRegion || u;
          e.signingName = e.signingName || d || e.serviceId;
          let p = {
            ...e,
            credentials: e.credentials,
            region: e.signingRegion,
            service: e.signingName,
            sha256: i,
            uriEscapePath: o
          };
          return new (e.signerConstructor || lBs.SignatureV4)(p);
        };
      }
      return Object.assign(e, {
        systemClockOffset: s,
        signingEscapePath: o,
        signer: a
      });
    };
    var aKu = gBs;
    function lKu(e, {
      credentials: t,
      credentialDefaultProvider: n
    }) {
      let r;
      if (t) {
        if (!t?.memoized) {
          r = aAe.memoizeIdentityProvider(t, aAe.isIdentityExpired, aAe.doesIdentityRequireRefresh);
        } else {
          r = t;
        }
      } else if (n) {
        r = aAe.normalizeProvider(n(Object.assign({}, e, {
          parentClientConfig: e
        })));
      } else {
        r = async () => {
          throw Error("@aws-sdk/core::resolveAwsSdkSigV4Config - `credentials` not provided and no credentialDefaultProvider was configured.");
        };
      }
      r.memoized = true;
      return r;
    }
    function cKu(e, t) {
      if (t.configBound) {
        return t;
      }
      let n = async r => t({
        ...r,
        callerClientConfig: e
      });
      n.memoized = t.memoized;
      n.configBound = true;
      return n;
    }
    Yte.AWSSDKSigV4Signer = rKu;
    Yte.AwsSdkSigV4ASigner = fBs;
    Yte.AwsSdkSigV4Signer = cbn;
    Yte.NODE_AUTH_SCHEME_PREFERENCE_OPTIONS = oKu;
    Yte.NODE_SIGV4A_CONFIG_OPTIONS = iKu;
    Yte.getBearerTokenEnvKey = hBs;
    Yte.resolveAWSSDKSigV4Config = aKu;
    Yte.resolveAwsSdkSigV4AConfig = sKu;
    Yte.resolveAwsSdkSigV4Config = gBs;
    Yte.validateSigningProperties = vUr;
  });