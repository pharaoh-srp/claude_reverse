  var OTi;
  var zxn;
  var DTi = __lazy(() => {
    OTi = __toESM(PTi(), 1);
    zxn = OTi.state;
  });
  function ckd() {
    return {
      end: () => {},
      isRecording: () => false,
      recordException: () => {},
      setAttribute: () => {},
      setStatus: () => {},
      addEvent: () => {}
    };
  }
  function ukd() {
    return {
      createRequestHeaders: () => ({}),
      parseTraceparentHeader: () => {
        return;
      },
      startSpan: (e, t) => ({
        span: ckd(),
        tracingContext: ITi({
          parentContext: t.tracingContext
        })
      }),
      withContext(e, t, ...n) {
        return t(...n);
      }
    };
  }
  function EFt() {
    if (!zxn.instrumenterImplementation) {
      zxn.instrumenterImplementation = ukd();
    }
    return zxn.instrumenterImplementation;
  }
  var MTi = __lazy(() => {
    U5r();
    DTi();
  });
  function vFt(e) {
    let {
      namespace: t,
      packageName: n,
      packageVersion: r
    } = e;
    function o(c, u, d) {
      var p;
      let m = EFt().startSpan(c, Object.assign(Object.assign({}, d), {
        packageName: n,
        packageVersion: r,
        tracingContext: (p = u === null || u === undefined ? undefined : u.tracingOptions) === null || p === undefined ? undefined : p.tracingContext
      }));
      let f = m.tracingContext;
      let h = m.span;
      if (!f.getValue(Wst.namespace)) {
        f = f.setValue(Wst.namespace, t);
      }
      h.setAttribute("az.namespace", f.getValue(Wst.namespace));
      let g = Object.assign({}, u, {
        tracingOptions: Object.assign(Object.assign({}, u === null || u === undefined ? undefined : u.tracingOptions), {
          tracingContext: f
        })
      });
      return {
        span: h,
        updatedOptions: g
      };
    }
    async function s(c, u, d, p) {
      let {
        span: m,
        updatedOptions: f
      } = o(c, u, p);
      try {
        let h = await i(f.tracingOptions.tracingContext, () => Promise.resolve(d(f, m)));
        m.setStatus({
          status: "success"
        });
        return h;
      } catch (h) {
        throw m.setStatus({
          status: "error",
          error: h
        }), h;
      } finally {
        m.end();
      }
    }
    function i(c, u, ...d) {
      return EFt().withContext(c, u, ...d);
    }
    function a(c) {
      return EFt().parseTraceparentHeader(c);
    }
    function l(c) {
      return EFt().createRequestHeaders(c);
    }
    return {
      startSpan: o,
      withSpan: s,
      withContext: i,
      parseTraceparentHeader: a,
      createRequestHeaders: l
    };
  }
  var NTi = __lazy(() => {
    MTi();
    U5r();
  });
  var B5r = __lazy(() => {
    NTi();
  });
  function wFt(e) {
    return r5r(e);
  }
  function LTi(e = {}) {
    let t = jxn(e.userAgentPrefix);
    let n = new sce({
      additionalAllowedQueryParameters: e.additionalAllowedQueryParameters
    });
    let r = mkd();
    return {
      name: "tracingPolicy",
      async sendRequest(o, s) {
        var i;
        if (!r) {
          return s(o);
        }
        let a = await t;
        let l = {
          "http.url": n.sanitizeUrl(o.url),
          "http.method": o.method,
          "http.user_agent": a,
          requestId: o.requestId
        };
        if (a) {
          l["http.user_agent"] = a;
        }
        let {
          span: c,
          tracingContext: u
        } = (i = fkd(r, o, l)) !== null && i !== undefined ? i : {};
        if (!c || !u) {
          return s(o);
        }
        try {
          let d = await r.withContext(u, s, o);
          gkd(c, d);
          return d;
        } catch (d) {
          throw hkd(c, d), d;
        }
      }
    };
  }
  function mkd() {
    try {
      return vFt({
        namespace: "",
        packageName: "@azure/core-rest-pipeline",
        packageVersion: "1.21.0"
      });
    } catch (e) {
      P_e.warning(`Error when creating the TracingClient: ${qst(e)}`);
      return;
    }
  }
  function fkd(e, t, n) {
    try {
      let {
        span: r,
        updatedOptions: o
      } = e.startSpan(`HTTP ${t.method}`, {
        tracingOptions: t.tracingOptions
      }, {
        spanKind: "client",
        spanAttributes: n
      });
      if (!r.isRecording()) {
        r.end();
        return;
      }
      let s = e.createRequestHeaders(o.tracingOptions.tracingContext);
      for (let [i, a] of Object.entries(s)) {
        t.headers.set(i, a);
      }
      return {
        span: r,
        tracingContext: o.tracingOptions.tracingContext
      };
    } catch (r) {
      P_e.warning(`Skipping creating a tracing span due to an error: ${qst(r)}`);
      return;
    }
  }
  function hkd(e, t) {
    try {
      if (e.setStatus({
        status: "error",
        error: Wxn(t) ? t : undefined
      }), wFt(t) && t.statusCode) {
        e.setAttribute("http.status_code", t.statusCode);
      }
      e.end();
    } catch (n) {
      P_e.warning(`Skipping tracing span processing due to an error: ${qst(n)}`);
    }
  }
  function gkd(e, t) {
    try {
      e.setAttribute("http.status_code", t.status);
      let n = t.headers.get("x-ms-request-id");
      if (n) {
        e.setAttribute("serviceRequestId", n);
      }
      if (t.status >= 400) {
        e.setStatus({
          status: "error"
        });
      }
      e.end();
    } catch (n) {
      P_e.warning(`Skipping tracing span processing due to an error: ${qst(n)}`);
    }
  }
  var FTi = __lazy(() => {
    B5r();
    D5r();
    Nxn();
    qxn();
  });
  function Yxn(e) {
    if (e instanceof AbortSignal) {
      return {
        abortSignal: e
      };
    }
    if (e.aborted) {
      return {
        abortSignal: AbortSignal.abort(e.reason)
      };
    }
    let t = new AbortController();
    let n = true;
    function r() {
      if (n) {
        e.removeEventListener("abort", o);
        n = false;
      }
    }
    function o() {
      t.abort(e.reason);
      r();
    }
    e.addEventListener("abort", o);
    return {
      abortSignal: t.signal,
      cleanup: r
    };
  }
  function UTi() {
    return {
      name: "wrapAbortSignalLikePolicy",
      sendRequest: async (e, t) => {
        if (!e.abortSignal) {
          return t(e);
        }
        let {
          abortSignal: n,
          cleanup: r
        } = Yxn(e.abortSignal);
        e.abortSignal = n;
        try {
          return await t(e);
        } finally {
          r === null || r === undefined || r();
        }
      }
    };
  }
  var BTi = () => {};
  function $5r(e) {
    var t;
    let n = gFt();
    if (Bst) {
      if (e.agent) {
        n.addPolicy(RTi(e.agent));
      }
      if (e.tlsOptions) {
        n.addPolicy(kTi(e.tlsOptions));
      }
      n.addPolicy(vTi(e.proxyOptions));
      n.addPolicy(yTi());
    }
    if (n.addPolicy(UTi()), n.addPolicy(TTi(), {
      beforePolicies: ["multipartPolicy"]
    }), n.addPolicy(oTi(e.userAgentOptions)), n.addPolicy(CTi((t = e.telemetryOptions) === null || t === undefined ? undefined : t.clientRequestIdHeaderName)), n.addPolicy(hTi(), {
      afterPhase: "Deserialize"
    }), n.addPolicy(bTi(e.retryOptions), {
      phase: "Retry"
    }), n.addPolicy(LTi(Object.assign(Object.assign({}, e.userAgentOptions), e.loggingOptions)), {
      afterPhase: "Retry"
    }), Bst) {
      n.addPolicy(JSi(e.redirectOptions), {
        afterPhase: "Retry"
      });
    }
    n.addPolicy(KSi(e.loggingOptions), {
      afterPhase: "Sign"
    });
    return n;
  }
  var $Ti = __lazy(() => {
    YSi();
    a5r();
    XSi();
    sTi();
    _Ti();
    STi();
    ETi();
    wTi();
    xTi();
    ATi();
    FTi();
    BTi();
  });
  function H5r() {
    let e = i5r();
    return {
      async sendRequest(t) {
        let {
          abortSignal: n,
          cleanup: r
        } = t.abortSignal ? Yxn(t.abortSignal) : {};
        try {
          t.abortSignal = n;
          return await e.sendRequest(t);
        } finally {
          r === null || r === undefined || r();
        }
      }
    };
  }
  var HTi = __lazy(() => {
    Ust();
  });
  function O_e(e) {
    return oce(e);
  }
  var jTi = __lazy(() => {
    Ust();
  });
  function h8(e) {
    return Z9r(e);
  }
  var qTi = __lazy(() => {
    Ust();
  });
  function j5r(e, t = {
    maxRetries: 3
  }) {
    return bFt(e, Object.assign({
      logger: _kd
    }, t));
  }
  var _kd;
  var WTi = __lazy(() => {
    Kqe();
    Ene();
    _kd = x0e("core-rest-pipeline retryPolicy");
  });
  async function Skd(e, t, n) {
    async function r() {
      if (Date.now() < n) {
        try {
          return await e();
        } catch (s) {
          return null;
        }
      } else {
        let s = await e();
        if (s === null) {
          throw Error("Failed to refresh access token.");
        }
        return s;
      }
    }
    let o = await r();
    while (o === null) {
      await N5r(t);
      o = await r();
    }
    return o;
  }
  function GTi(e, t) {
    let n = null;
    let r = null;
    let o;
    let s = Object.assign(Object.assign({}, bkd), t);
    let i = {
      get isRefreshing() {
        return n !== null;
      },
      get shouldRefresh() {
        var l;
        if (i.isRefreshing) {
          return false;
        }
        if ((r === null || r === undefined ? undefined : r.refreshAfterTimestamp) && r.refreshAfterTimestamp < Date.now()) {
          return true;
        }
        return ((l = r === null || r === undefined ? undefined : r.expiresOnTimestamp) !== null && l !== undefined ? l : 0) - s.refreshWindowInMs < Date.now();
      },
      get mustRefresh() {
        return r === null || r.expiresOnTimestamp - s.forcedRefreshWindowInMs < Date.now();
      }
    };
    function a(l, c) {
      var u;
      if (!i.isRefreshing) {
        n = Skd(() => e.getToken(l, c), s.retryIntervalInMs, (u = r === null || r === undefined ? undefined : r.expiresOnTimestamp) !== null && u !== undefined ? u : Date.now()).then(p => (n = null, r = p, o = c.tenantId, r)).catch(p => {
          throw n = null, r = null, o = undefined, p;
        });
      }
      return n;
    }
    return async (l, c) => {
      let u = Boolean(c.claims);
      let d = o !== c.tenantId;
      if (u) {
        r = null;
      }
      if (d || u || i.mustRefresh) {
        return a(l, c);
      }
      if (i.shouldRefresh) {
        a(l, c);
      }
      return r;
    };
  }
  var bkd;
  var VTi = __lazy(() => {
    bkd = {
      forcedRefreshWindowInMs: 1000,
      retryIntervalInMs: 3000,
      refreshWindowInMs: 120000
    };
  });
  async function Jxn(e, t) {
    try {
      return [await t(e), undefined];
    } catch (n) {
      if (wFt(n) && n.response) {
        return [n.response, n];
      } else {
        throw n;
      }
    }
  }
  async function Tkd(e) {
    let {
      scopes: t,
      getAccessToken: n,
      request: r
    } = e;
    let o = {
      abortSignal: r.abortSignal,
      tracingOptions: r.tracingOptions,
      enableCae: true
    };
    let s = await n(t, o);
    if (s) {
      e.request.headers.set("Authorization", `Bearer ${s.token}`);
    }
  }
  function zTi(e) {
    return e.status === 401 && e.headers.vZc("WWW-Authenticate");
  }
  async function KTi(e, t) {
    var n;
    let {
      scopes: r
    } = e;
    let o = await e.getAccessToken(r, {
      enableCae: true,
      claims: t
    });
    if (!o) {
      return false;
    }
    e.request.headers.set("Authorization", `${(n = o.tokenType) !== null && n !== undefined ? n : "Bearer"} ${o.token}`);
    return true;
  }
  function CFt(e) {
    var t;
    var n;
    var r;
    let {
      credential: o,
      scopes: s,
      challengeCallbacks: i
    } = e;
    let a = e.logger || P_e;
    let l = {
      authorizeRequest: (n = (t = i === null || i === undefined ? undefined : i.authorizeRequest) === null || t === undefined ? undefined : t.bind(i)) !== null && n !== undefined ? n : Tkd,
      authorizeRequestOnChallenge: (r = i === null || i === undefined ? undefined : i.authorizeRequestOnChallenge) === null || r === undefined ? undefined : r.bind(i)
    };
    let c = o ? GTi(o) : () => Promise.resolve(null);
    return {
      name: "bearerTokenAuthenticationPolicy",
      async sendRequest(u, d) {
        if (!u.url.toLowerCase().startsWith("https://")) {
          throw Error("Bearer token authentication is not permitted for non-TLS protected (non-https) URLs.");
        }
        await l.authorizeRequest({
          scopes: Array.isArray(s) ? s : [s],
          request: u,
          getAccessToken: c,
          logger: a
        });
        let p;
        let m;
        let f;
        if ([p, m] = await Jxn(u, d), zTi(p)) {
          let h = YTi(p.headers.get("WWW-Authenticate"));
          if (h) {
            let g;
            try {
              g = atob(h);
            } catch (y) {
              a.warning(`The WWW-Authenticate header contains "claims" that cannot be parsed. Unable to perform the Continuous Access Evaluation authentication flow. Unparsable claims: ${h}`);
              return p;
            }
            if (f = await KTi({
              scopes: Array.isArray(s) ? s : [s],
              response: p,
              request: u,
              getAccessToken: c,
              logger: a
            }, g), f) {
              [p, m] = await Jxn(u, d);
            }
          } else if (l.authorizeRequestOnChallenge) {
            if (f = await l.authorizeRequestOnChallenge({
              scopes: Array.isArray(s) ? s : [s],
              request: u,
              response: p,
              getAccessToken: c,
              logger: a
            }), f) {
              [p, m] = await Jxn(u, d);
            }
            if (zTi(p)) {
              if (h = YTi(p.headers.get("WWW-Authenticate")), h) {
                let g;
                try {
                  g = atob(h);
                } catch (y) {
                  a.warning(`The WWW-Authenticate header contains "claims" that cannot be parsed. Unable to perform the Continuous Access Evaluation authentication flow. Unparsable claims: ${h}`);
                  return p;
                }
                if (f = await KTi({
                  scopes: Array.isArray(s) ? s : [s],
                  response: p,
                  request: u,
                  getAccessToken: c,
                  logger: a
                }, g), f) {
                  [p, m] = await Jxn(u, d);
                }
              }
            }
          }
        }
        if (m) {
          throw m;
        } else {
          return p;
        }
      }
    };
  }
  function Ekd(e) {
    let t = /(\w+)\s+((?:\w+=(?:"[^"]*"|[^,]*),?\s*)+)/g;
    let n = /(\w+)="([^"]*)"/g;
    let r = [];
    let o;
    while ((o = t.exec(e)) !== null) {
      let s = o[1];
      let i = o[2];
      let a = {};
      let l;
      while ((l = n.exec(i)) !== null) {
        a[l[1]] = l[2];
      }
      r.push({
        scheme: s,
        params: a
      });
    }
    return r;
  }
  function YTi(e) {
    var t;
    if (!e) {
      return;
    }
    return (t = Ekd(e).find(r => r.scheme === "Bearer" && r.params.claims && r.params.error === "insufficient_claims")) === null || t === undefined ? undefined : t.params.claims;
  }
  var XTi = __lazy(() => {
    VTi();
    Nxn();
  });
  var ace = __lazy(() => {
    a5r();
    $Ti();
    HTi();
    jTi();
    qTi();
    WTi();
    XTi();
  });
  function wkd(e, t) {
    return t !== "Composite" && t !== "Dictionary" && (typeof e === "string" || typeof e === "number" || typeof e === "boolean" || (t === null || t === undefined ? undefined : t.match(/^(Date|DateTime|DateTimeRfc1123|UnixTime|ByteArray|Base64Url)$/i)) !== null || e === undefined || e === null);
  }
  function Ckd(e) {
    let t = Object.assign(Object.assign({}, e.headers), e.body);
    if (e.hasNullableType && Object.getOwnPropertyNames(t).length === 0) {
      return e.shouldWrapBody ? {
        body: null
      } : null;
    } else {
      return e.shouldWrapBody ? Object.assign(Object.assign({}, e.headers), {
        body: e.body
      }) : t;
    }
  }
  function G5r(e, t) {
    var n;
    var r;
    let o = e.parsedHeaders;
    if (e.request.method === "HEAD") {
      return Object.assign(Object.assign({}, o), {
        body: e.parsedBody
      });
    }
    let s = t && t.bodyMapper;
    let i = Boolean(s === null || s === undefined ? undefined : s.nullable);
    let a = s === null || s === undefined ? undefined : s.type.name;
    if (a === "Stream") {
      return Object.assign(Object.assign({}, o), {
        blobBody: e.blobBody,
        readableStreamBody: e.readableStreamBody
      });
    }
    let l = a === "Composite" && s.type.modelProperties || {};
    let c = Object.keys(l).some(u => l[u].serializedName === "");
    if (a === "Sequence" || c) {
      let u = (n = e.parsedBody) !== null && n !== undefined ? n : [];
      for (let d of Object.keys(l)) {
        if (l[d].serializedName) {
          u[d] = (r = e.parsedBody) === null || r === undefined ? undefined : r[d];
        }
      }
      if (o) {
        for (let d of Object.keys(o)) {
          u[d] = o[d];
        }
      }
      return i && !e.parsedBody && !o && Object.getOwnPropertyNames(l).length === 0 ? null : u;
    }
    return Ckd({
      body: e.parsedBody,
      headers: o,
      hasNullableType: i,
      shouldWrapBody: wkd(e.parsedBody, a)
    });
  }
  var fEi = () => {};
  var D_e;
  var Qxn = __lazy(() => {
    D_e = {
      Base64Url: "Base64Url",
      Boolean: "Boolean",
      ByteArray: "ByteArray",
      Composite: "Composite",
      Date: "Date",
      DateTime: "DateTime",
      DateTimeRfc1123: "DateTimeRfc1123",
      Dictionary: "Dictionary",
      Enum: "Enum",
      Number: "Number",
      Object: "Object",
      Sequence: "Sequence",
      String: "String",
      Stream: "Stream",
      TimeSpan: "TimeSpan",
      UnixTime: "UnixTime"
    };
  });