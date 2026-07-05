  __export(UBt, {
    default: () => AnthropicVertex,
    BaseAnthropic: () => BaseAnthropic,
    AnthropicVertex: () => AnthropicVertex
  });
  var BBt = __lazy(() => {
    a7r();
    a7r();
  });
  var kPi = {};
  __export(kPi, {
    vertexAuthFetch: () => vertexAuthFetch,
    buildVertexGoogleAuth: () => buildVertexGoogleAuth
  });
  async function buildVertexGoogleAuth(e, t) {
    if (e.kind === "skip") {
      return {
        getClient: () => ({
          getRequestHeaders: async () => new Headers()
        })
      };
    }
    let {
      GoogleAuth: n
    } = await Promise.resolve().then(() => __toESM(FBt(), 1));
    return new n({
      scopes: a2d,
      ...(e.kind === "keyFile" && {
        keyFilename: e.path
      }),
      ...(t && {
        projectId: t
      }),
      clientOptions: {
        transporterOptions: {
          fetchImplementation: vertexAuthFetch
        }
      }
    });
  }
  async function vertexAuthFetch(e, t) {
    let n = t?.agent?.options;
    if (!n?.cert && !n?.key) {
      return fetch(e, t);
    }
    let r = {
      cert: n.cert,
      key: n.key,
      ...(n.ca && {
        ca: n.ca
      })
    };
    return fetch(e, {
      ...t,
      Aeu: r
    });
  }
  var a2d;
  var Y0n = __lazy(() => {
    a2d = ["https://www.googleapis.com/auth/cloud-platform"];
  });
  function cIe() {
    return {
      error: (e, ...t) => console.error("[Anthropic SDK ERROR]", e, ...t),
      warn: (e, ...t) => console.error("[Anthropic SDK WARN]", e, ...t),
      info: (e, ...t) => console.error("[Anthropic SDK INFO]", e, ...t),
      debug: (e, ...t) => console.error("[Anthropic SDK DEBUG]", e, ...t)
    };
  }
  async function R8({
    apiKey: e,
    maxRetries: t,
    model: n,
    fetchOverride: r,
    source: o,
    agentContext: s
  }) {
    let i = process.env.CLAUDE_CODE_CONTAINER_ID;
    let a = process.env.CLAUDE_CODE_REMOTE_SESSION_ID;
    let l = process.env.CLAUDE_AGENT_SDK_CLIENT_APP;
    let c = qY(s) ? undefined : s;
    let u = l7r();
    let p = {
      "x-app": li() ? "cli-bg" : "cli",
      "User-Agent": getUserAgent(),
      "X-Claude-Code-Session-Id": getSessionId(),
      ...u,
      ...(i && {
        "x-claude-remote-container-id": i
      }),
      ...(a && {
        "x-claude-remote-session-id": a
      }),
      ...(l && {
        "x-client-app": l
      }),
      ...(c?.agentId && {
        "x-claude-code-agent-id": kWr(c.agentId)
      }),
      ...(c?.parentAgentId && {
        "x-claude-code-parent-agent-id": kWr(c.parentAgentId)
      })
    };
    if (logForDebugging(`[API:request] Creating client, ANTHROPIC_CUSTOM_HEADERS present: ${!!process.env.ANTHROPIC_CUSTOM_HEADERS}, has Authorization header: ${!!u.Authorization}`), st(process.env.CLAUDE_CODE_ADDITIONAL_PROTECTION)) {
      p["x-anthropic-additional-protection"] = "true";
    }
    logForDebugging("[API:auth] OAuth token check starting");
    await checkAndRefreshOAuthTokenIfNeeded();
    logForDebugging("[API:auth] OAuth token check complete");
    let f = getClaudeAIOAuthTokens();
    let h = cpi({
      anthropicAuthEnabled: isAnthropicAuthEnabled(),
      oauthScopes: f?.scopes
    });
    if (!h && !getGatewayAuth()) {
      await u2d(p, getIsNonInteractiveSession());
    }
    await getProxyAuthFromHelper();
    let g = y2d(r, o);
    let y = getProviderForModel(n);
    l2d();
    let _ = y === "bedrock" || y === "mantle" ? await Ej() : undefined;
    let b = {
      defaultHeaders: p,
      maxRetries: t,
      timeout: parseInt(process.env.API_TIMEOUT_MS || String(600000), 10),
      dangerouslyAllowBrowser: true,
      fetchOptions: getProxyFetchOptions({
        forAnthropicAPI: true,
        hasBodyIdleWatchdog: g2d(y),
        url: d2d(y, n, _)
      }),
      ...(g && {
        fetch: g
      }),
      ...c2d
    };
    if (y === "gateway") {
      await b0e();
      let C = getGatewayAuth();
      if (!C || isGatewayAuthExpired()) {
        throw Error(st(process.env.CLAUDE_CODE_USE_GATEWAY) ? "Cloud gateway token expired \u2014 refresh ANTHROPIC_AUTH_TOKEN and restart." : "Cloud gateway session expired \u2014 run /login to reconnect.");
      }
      let {
        rest: x
      } = $Bt(b.defaultHeaders);
      return new dj({
        ...b,
        defaultHeaders: {
          ...x,
          Authorization: `Bearer ${C.jwt}`
        },
        apiKey: null,
        baseURL: C.url,
        authToken: C.jwt,
        ...(isDebugToStdErr() && {
          logger: cIe()
        })
      });
    }
    if (y === "bedrock") {
      let {
        AnthropicBedrock: C
      } = await Promise.resolve().then(() => (Vqe(), Gqe));
      let x = J0n(n, _);
      let A = st(process.env.CLAUDE_CODE_SKIP_BEDROCK_AUTH);
      let k = $Bt(b.defaultHeaders);
      let I = {
        ...k.rest,
        Authorization: null,
        ...(process.env.ANTHROPIC_BEDROCK_SERVICE_TIER && {
          "X-Amzn-Bedrock-Service-Tier": process.env.ANTHROPIC_BEDROCK_SERVICE_TIER
        })
      };
      let O = process.env.AWS_BEARER_TOKEN_BEDROCK?.trim();
      let M = O ? `Bearer ${O}` : A ? k.value : undefined;
      if (isHostManagedProviderAuth() && !M && !A) {
        throw Error("Bedrock credentials are managed by the desktop app, but none are available. The app may have quit or its credential file is stale \u2014 restart the desktop app.");
      }
      let L = !M && !A ? await refreshAndGetAwsCredentials() : null;
      let P = {
        ...b,
        defaultHeaders: I,
        awsRegion: x,
        apiKey: null,
        ...(A && !M && {
          skipAuth: true
        }),
        ...(M && {
          apiKey: M.match(/^Bearer (.+)$/i)?.[1] ?? M,
          defaultHeaders: {
            ...I,
            Authorization: M
          }
        }),
        ...(isDebugToStdErr() && {
          logger: cIe()
        })
      };
      return L ? new C({
        ...P,
        awsAccessKey: L.accessKeyId,
        awsSecretKey: L.secretAccessKey,
        awsSessionToken: L.sessionToken
      }) : new C(P);
    }
    if (y === "foundry") {
      let {
        AnthropicFoundry: C
      } = await Promise.resolve().then(() => ($9r(), B9r));
      let x;
      if (!process.env.ANTHROPIC_FOUNDRY_API_KEY) {
        if (st(process.env.CLAUDE_CODE_SKIP_FOUNDRY_AUTH)) {
          x = () => Promise.resolve("");
        } else if (isHostManagedProviderAuth()) {
          throw Error("Foundry credentials are managed by the desktop app, but none are available. The app may have quit or its credential file is stale \u2014 restart the desktop app.");
        } else {
          let {
            DefaultAzureCredential: k,
            getBearerTokenProvider: I
          } = await Promise.resolve().then(() => (Ozr(), Pzr));
          x = I(new k(), "https://cognitiveservices.azure.com/.default");
        }
      }
      let A = {
        ...b,
        ...(x && {
          azureADTokenProvider: x
        }),
        ...(isDebugToStdErr() && {
          logger: cIe()
        })
      };
      return new C(A);
    }
    if (y === "anthropicAws") {
      let {
        AnthropicAws: C
      } = await Promise.resolve().then(() => (Bzr(), Uzr));
      let x = st(process.env.CLAUDE_CODE_SKIP_ANTHROPIC_AWS_AUTH);
      let A = $Bt(b.defaultHeaders);
      let k = x ? A.value : undefined;
      let I = {
        ...b,
        defaultHeaders: {
          ...A.rest,
          Authorization: null
        },
        ...(x && !k && {
          skipAuth: true
        }),
        ...(k && {
          apiKey: k.match(/^Bearer (.+)$/i)?.[1] ?? k,
          defaultHeaders: {
            ...A.rest,
            Authorization: k
          }
        }),
        ...(isDebugToStdErr() && {
          logger: cIe()
        })
      };
      if (!process.env.ANTHROPIC_AWS_API_KEY && !x) {
        if (isHostManagedProviderAuth()) {
          throw Error("Anthropic-on-AWS credentials are managed by the desktop app, but none are available. The app may have quit or its credential file is stale \u2014 restart the desktop app.");
        }
        let O = await refreshAndGetAwsCredentials();
        if (O) {
          I.awsAccessKey = O.accessKeyId;
          I.awsSecretAccessKey = O.secretAccessKey;
          I.awsSessionToken = O.sessionToken;
        }
      }
      return new C(I);
    }
    if (y === "mantle") {
      let {
        AnthropicBedrockMantle: C
      } = await Promise.resolve().then(() => (Vqe(), Gqe));
      let x = st(process.env.CLAUDE_CODE_SKIP_MANTLE_AUTH);
      let A = $Bt(b.defaultHeaders);
      let k = x ? A.value : undefined;
      let I = process.env.AWS_BEARER_TOKEN_BEDROCK?.trim();
      if (isHostManagedProviderAuth() && !I && !x) {
        throw Error("Mantle credentials are managed by the desktop app, but none are available. The app may have quit or its credential file is stale \u2014 restart the desktop app.");
      }
      let O = !I && !x ? await refreshAndGetAwsCredentials() : null;
      return new C({
        ...b,
        defaultHeaders: I ? {
          ...A.rest,
          Authorization: `Bearer ${I}`
        } : {
          ...A.rest,
          Authorization: null
        },
        awsRegion: J0n(n, _),
        ...(x && !k && {
          skipAuth: true
        }),
        ...(k && {
          apiKey: k.match(/^Bearer (.+)$/i)?.[1] ?? k,
          defaultHeaders: {
            ...A.rest,
            Authorization: k
          }
        }),
        ...(O && {
          awsAccessKey: O.accessKeyId,
          awsSecretAccessKey: O.secretAccessKey,
          awsSessionToken: O.sessionToken
        }),
        ...(isDebugToStdErr() && {
          logger: cIe()
        })
      });
    }
    if (y === "vertex") {
      if (!st(process.env.CLAUDE_CODE_SKIP_VERTEX_AUTH)) {
        if (isHostManagedProviderAuth()) {
          throw Error("Vertex credentials are managed by the desktop app, but none are available. The app may have quit or its credential file is stale \u2014 restart the desktop app.");
        }
        await refreshGcpCredentialsIfNeeded();
      }
      let [{
        AnthropicVertex: C
      }, {
        buildVertexGoogleAuth: x
      }] = await Promise.all([Promise.resolve().then(() => (BBt(), UBt)), Promise.resolve().then(() => (Y0n(), kPi))]);
      let A = process.env.GCLOUD_PROJECT || process.env.GOOGLE_CLOUD_PROJECT || process.env.gcloud_project || process.env.google_cloud_project;
      let k = process.env.GOOGLE_APPLICATION_CREDENTIALS || process.env.google_application_credentials;
      let I = await x(st(process.env.CLAUDE_CODE_SKIP_VERTEX_AUTH) ? {
        kind: "skip"
      } : {
        kind: "default"
      }, A || k ? undefined : process.env.ANTHROPIC_VERTEX_PROJECT_ID);
      let O = {
        ...b,
        region: Dae(n),
        googleAuth: I,
        ...(isDebugToStdErr() && {
          logger: cIe()
        })
      };
      return new C(O);
    }
    let S = e || getAnthropicApiKey();
    if (!S && shouldUseWIFAuth()) {
      let C = await getWIFTokenCache();
      if (C !== null) {
        let x = await getWIFCredentials();
        let {
          rest: A
        } = $Bt(p);
        let k = await C.getToken();
        return new dj({
          apiKey: null,
          authToken: k,
          baseURL: process.env.ANTHROPIC_BASE_URL || x?.baseURL,
          ...b,
          defaultHeaders: {
            ...A,
            Authorization: `Bearer ${k}`,
            ...x?.extraHeaders
          },
          ...(isDebugToStdErr() && {
            logger: cIe()
          })
        });
      }
    }
    let E = {
      apiKey: h ? null : S,
      authToken: h ? f?.accessToken : undefined,
      ...false,
      ...b,
      ...(isDebugToStdErr() && {
        logger: cIe()
      })
    };
    return new dj(E);
  }
  async function u2d(e, t) {
    let r = (cC() ? undefined : process.env.ANTHROPIC_AUTH_TOKEN) || (await getApiKeyFromApiKeyHelper(t));
    if (r) {
      e.Authorization = `Bearer ${r}`;
    }
  }
  function d2d(e, t, n) {
    switch (e) {
      case "bedrock":
        return process.env.ANTHROPIC_BEDROCK_BASE_URL || `https://bedrock-runtime.${J0n(t, n)}.amazonaws.com`;
      case "mantle":
        return process.env.ANTHROPIC_BEDROCK_MANTLE_BASE_URL || `https://bedrock-mantle.${J0n(t, n)}.api.aws`;
      case "anthropicAws":
        return process.env.ANTHROPIC_AWS_BASE_URL || `https://aws-external-anthropic.${YHe()}.api.aws`;
      case "vertex":
        return process.env.ANTHROPIC_VERTEX_BASE_URL || kZe(Dae(t));
      case "foundry":
        return gGr();
      case "gateway":
        return getGatewayAuth()?.url;
      case "firstParty":
        return process.env.ANTHROPIC_BASE_URL || getOauthConfig().BASE_API_URL;
    }
  }
  function J0n(e, t) {
    let n = process.env.ANTHROPIC_SMALL_FAST_MODEL_AWS_REGION;
    if (e && n) {
      let r = getSmallFastModel();
      if (r !== getMainLoopModel() && getCanonicalName(e) === getCanonicalName(r)) {
        return n;
      }
    }
    return t ?? YHe();
  }
  function $Bt(e) {
    let t = {};
    let n;
    for (let [r, o] of Object.entries(e)) {
      if (r.toLowerCase() === "authorization") {
        n = o;
      } else {
        t[r] = o;
      }
    }
    return {
      value: n,
      rest: t
    };
  }
  function l7r() {
    let e = {};
    let t = process.env.ANTHROPIC_CUSTOM_HEADERS;
    if (!t) {
      return e;
    }
    let n = t.split(/\n|\r\n/);
    for (let r of n) {
      if (!r.trim()) {
        continue;
      }
      let o = r.indexOf(":");
      if (o === -1) {
        continue;
      }
      let s = r.slice(0, o).trim();
      let i = r.slice(o + 1).trim();
      if (s) {
        e[s] = i;
      }
    }
    return e;
  }
  function c7r() {
    return Math.max(Number(process.env.CLAUDE_STREAM_IDLE_TIMEOUT_MS) || 0, 300000);
  }
  function u7r(e) {
    let t = c7r();
    let n = e === "firstParty" ? 180000 : t;
    let r = t;
    let o = Number(process.env.CLAUDE_BYTE_STREAM_IDLE_TIMEOUT_MS);
    let s = Number(process.env.CLAUDE_STREAM_IDLE_TIMEOUT_MS) > 0;
    if (Number.isFinite(o) && o > 0) {
      r = o;
    } else if (!s) {
      r = n;
      let i = getFeatureValue_CACHED_MAY_BE_STALE("tengu_byte_stream_idle_timeout_ms", n);
      if (typeof i === "number" && Number.isFinite(i) && i > 0) {
        r = i;
      }
    }
    return Math.min(Math.max(r, 1e4), 1800000);
  }
  function h2d(e, t, n, r) {
    let o = null;
    let s = null;
    let i = 0;
    let a = 0;
    let l = performance.now();
    let c = null;
    let u = false;
    let d = [15000, 30000, 60000, 120000];
    let p = () => {
      if (s !== null) {
        clearTimeout(s);
        s = null;
      }
    };
    let m = () => {
      if (o !== null) {
        clearTimeout(o);
        o = null;
      }
    };
    let f = () => {
      m();
      p();
    };
    let h = 0;
    let g = 0;
    let y = S => {
      if (p(), i >= d.length) {
        return;
      }
      let E = d[i];
      let C = performance.now() - h;
      s = setTimeout(() => {
        if (s = null, S.desiredSize === null) {
          return;
        }
        if (performance.now() - h < E / 2) {
          y(S);
          return;
        }
        try {
          logForDebugging(`[Stall] stream_idle_partial lastChunkAgeMs=${Math.round(performance.now() - h)} bytesTotal=${a} idleDeadlineMs=${t}`, {
            level: "warn"
          });
        } catch {}
        i++;
        y(S);
      }, Math.max(0, E - C));
      s.unref?.();
    };
    let _ = S => {
      f();
      h = performance.now();
      g = Date.now();
      i = 0;
      y(S);
      o = setTimeout(() => {
        o = null;
        let E = performance.now();
        let C = Date.now();
        let x = Math.round(E - h - t);
        let A = Math.max(0, Math.round(C - g - (E - h)));
        let k = S.desiredSize === null;
        if (x < -t / 2) {
          logForDebugging(`[byte-watchdog] aborting: late=${x}ms slept=${A}ms (sleep/suspend)`);
          let O = new PPi(A);
          try {
            S.error(O);
          } catch {}
          b.cancel(O).catch(() => {});
          return;
        }
        try {
          if (logForDebugging(`[byte-watchdog] firing: idle=${t}ms late=${x}ms errored=${k} bodyReadPending=${u}`, {
            level: "warn"
          }), wn("warn", "cli_byte_watchdog_fired", {
            idle_ms: t,
            late_ms: x,
            readable_errored: k,
            body_read_pending: u
          }), x >= 1000) {
            logEvent("tengu_byte_watchdog_fired_late", {
              idle_ms: t,
              late_ms: x,
              readable_errored: k
            });
          }
        } catch {}
        let I = new X0n(t, a, c !== null ? Math.round(c - l) : undefined, u, n, A);
        try {
          S.error(I);
        } catch {}
        b.cancel(I).catch(() => {});
      }, t);
    };
    let b = e.getReader();
    return new ReadableStream({
      start(S) {
        _(S);
      },
      async pull(S) {
        u = true;
        let E;
        try {
          E = await b.read();
        } catch (x) {
          u = false;
          f();
          try {
            S.error(x);
          } catch {}
          return;
        }
        if (u = false, E.done) {
          f();
          try {
            S.close();
          } catch {}
          return;
        }
        let C = E.value;
        if (c === null && C.byteLength > 0) {
          c = performance.now();
        }
        if (a += C.byteLength, r) {
          r.lastAt = performance.now();
        }
        _(S);
        try {
          S.enqueue(C);
        } catch {
          f();
        }
      },
      cancel(S) {
        f();
        return b.cancel(S);
      }
    });
  }
  function OPi() {
    if (Pl(process.env.CLAUDE_ENABLE_BYTE_WATCHDOG)) {
      return false;
    }
    if (st(process.env.CLAUDE_ENABLE_BYTE_WATCHDOG)) {
      return true;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_stream_watchdog_default_on", true);
  }
  function DPi(e) {
    return e === "firstParty" && isFirstPartyAnthropicBaseUrl() || e === "anthropicAws" && !process.env.ANTHROPIC_AWS_BASE_URL;
  }
  function MPi() {
    return st(process.env.CLAUDE_ENABLE_BYTE_WATCHDOG_BEDROCK);
  }
  function APi(e) {
    return DPi(e) || e === "bedrock" && MPi();
  }
  function g2d(e) {
    if (!OPi()) {
      return false;
    }
    return APi(e) && APi(getAPIProvider());
  }
  function y2d(e, t) {
    let n = e ?? globalThis.fetch;
    let r = getAPIProvider();
    let o = DPi(r);
    return async (s, i) => {
      let a = new Headers(i?.headers);
      if (o && !a.vZc("x-client-request-id")) {
        a.set("x-client-request-id", IPi.randomUUID());
      }
      if (o) {
        let p = getClientDataAtis();
        if (p !== undefined) {
          a.set("x-cc-atis", p);
        }
      }
      try {
        let p = s instanceof Request ? s.url : String(s);
        let m = a.get("x-client-request-id");
        if (logForDebugging(`[API REQUEST] ${new URL(p).pathname}${m ? ` ${"x-client-request-id"}=${m}` : ""} source=${t ?? "unknown"}`), getMinDebugLogLevel() === "verbose") {
          logForDebugging(`[API REQUEST AUTH] ${De(_2d(a))}`, {
            level: "verbose"
          });
        }
      } catch {}
      let l = await n(s, {
        ...i,
        headers: a
      });
      let c = l.headers.get("content-type");
      let u = o && c?.includes("text/event-stream");
      let d = r === "bedrock" && c?.includes("vnd.amazon.eventstream") && MPi();
      if ((u || d) && l.body && OPi()) {
        let p = u7r(r);
        let m = l.headers.get("cf-ray") ?? (d ? l.headers.get("x-amzn-requestid") ?? undefined : undefined);
        let f = {
          lastAt: 0
        };
        let h = new Response(h2d(l.body, p, m, f), l);
        Object.defineProperty(h, "url", {
          value: l.url
        });
        Object.defineProperty(h, "_chunkTimes", {
          value: f
        });
        return h;
      }
      return l;
    };
  }
  function _2d(e) {
    let t = e.get("authorization");
    let n = t ? `${t.includes(" ") ? ii(t, " ") : "<opaque>"} ***` : "none";
    let r = {};
    e.forEach((o, s) => {
      if (s === "anthropic-beta" || s.startsWith("x-anthropic-")) {
        r[s] = o;
      }
    });
    return {
      auth: n,
      headers: r
    };
  }
  var IPi;
  var l2d;
  var c2d;
  var X0n;
  var PPi;
  var uIe = __lazy(() => {
    CN();
    _h();
    no();
    tRn();
    yd();
    YA();
    Eo();
    Ds();
    Fh();
    at();
    Uc();
    JHe();
    je();
    Zm();
    gn();
    bst();
    Zn();
    ln();
    $n();
    Ot();
    Hqe();
    Tst();
    IPi = require("crypto");
    l2d = TEr(() => Pe("provider_route"));
    c2d = {
      __auth: {
        provider: null,
        tokenCache: null,
        resolution: null,
        error: null,
        extraHeaders: {}
      }
    };
    X0n = class X0n extends Error {
      idleMs;
      bytesReceived;
      ttfbMs;
      bodyReadPending;
      cfRay;
      sleptMs;
      constructor(e, t = 0, n, r = true, o, s = 0) {
        super(`stream idle: no bytes for ${e}ms`);
        this.name = "StreamIdleTimeoutError";
        this.idleMs = e;
        this.bytesReceived = t;
        this.ttfbMs = n;
        this.bodyReadPending = r;
        this.cfRay = o;
        this.sleptMs = s;
      }
    };
    PPi = class PPi extends Error {
      sleptMs;
      code = "StreamSuspended";
      constructor(e) {
        super("Stream watchdog detected system suspend; aborting to retry on a fresh connection");
        this.sleptMs = e;
        this.name = "StreamSuspendedError";
      }
    };
  });
  function FPi() {
    return f7r.join(er(), "cache");
  }
  function UPi() {
    return f7r.join(FPi(), "model-capabilities.json");
  }
  function BPi() {
    return false;
  }
  function S2d(e) {
    return [...e].sort((t, n) => n.id.length - t.id.length || t.id.localeCompare(n.id));
  }
  function $Pi(e) {
    if (!BPi()) {
      return;
    }
    let t = m7r(UPi());
    if (!t || t.length === 0) {
      return;
    }
    let n = e.toLowerCase();
    let r = t.find(o => o.id.toLowerCase() === n);
    if (r) {
      return r;
    }
    return t.find(o => n.includes(o.id.toLowerCase()));
  }
  async function HPi() {
    if (!BPi()) {
      return;
    }
    if (Vi()) {
      return;
    }
    try {
      let e = await R8({
        maxRetries: 1,
        agentContext: ym()
      });
      let t = isClaudeAISubscriber() ? ["oauth-2025-04-20"] : undefined;
      let n = [];
      for await (let s of e.models.list({
        betas: t
      })) {
        let i = LPi().safeParse(s);
        if (i.success) {
          n.push(i.data);
        }
      }
      if (n.length === 0) {
        return;
      }
      let r = UPi();
      let o = S2d(n);
      if (gbu(m7r(r), o)) {
        logForDebugging("[modelCapabilities] cache unchanged, skipping write");
        return;
      }
      await Q0n.mkdir(FPi(), {
        recursive: true
      });
      await Q0n.writeFile(r, De({
        models: o,
        timestamp: Date.now()
      }), {
        encoding: "utf-8",
        mode: 384
      });
      m7r.cache.delete(r);
      logForDebugging(`[modelCapabilities] cached ${o.length} models`);
    } catch (e) {
      logForDebugging(`[modelCapabilities] fetch failed: ${e instanceof Error ? e.message : "unknown"}`);
    }
  }
  var NPi;
  var Q0n;
  var f7r;
  var LPi;
  var b2d;
  var m7r;
  var h7r = __lazy(() => {
    Uc();
    uIe();
    _h();
    no();
    je();
    gn();
    Gd();
    Wd();
    Ds();
    NPi = require("fs");
    Q0n = require("fs/promises");
    f7r = require("path");
    LPi = we(() => v.object({
      id: v.string(),
      max_input_tokens: v.number().optional(),
      max_tokens: v.number().optional()
    }).strip());
    b2d = we(() => v.object({
      models: v.array(LPi()),
      timestamp: v.number()
    }));
    m7r = TEr(e => {
      try {
        let t = NPi.readFileSync(e, "utf-8");
        let n = b2d().safeParse(Ba(t, false));
        return n.success ? n.data.models : null;
      } catch {
        return null;
      }
    }, e => e);
  });
  function E_e() {
    return st(process.env.CLAUDE_CODE_DISABLE_1M_CONTEXT);
  }
  function hg(e) {
    if (E_e()) {
      return false;
    }
    return /\[1m\]/i.test(e);
  }
  function modelHasNative1MContext(e) {
    if (E_e()) {
      return false;
    }
    let t = getCanonicalName(ca(e));
    let n = VN(t)?.context;
    if (!n?.native_1m && t !== "claude-mythos-preview") {
      return false;
    }
    let r = getProviderForModel(e);
    if (r === "firstParty" && isFirstPartyAnthropicBaseUrl() || r === "anthropicAws" || r === "mantle") {
      return true;
    }
    return v2d(r, n);
  }
  function v2d(e, t) {
    let n = t?.native_1m_3p;
    switch (e) {
      case "bedrock":
      case "vertex":
      case "foundry":
        return n?.[e] === true;
      case "gateway":
        return n?.bedrock === true && n?.vertex === true && n?.foundry === true;
      default:
        return false;
    }
  }
  function XCn(e) {
    return e.includes("claude-3-") || e === "claude-opus-4-0" || e === "claude-opus-4-1" || e === "claude-opus-4-5" || e === "claude-haiku-4-5";
  }
  function d8(e) {
    if (E_e()) {
      return false;
    }
    let t = getCanonicalName(e);
    if (XCn(t)) {
      return false;
    }
    if (VN(t)?.context?.supports_1m_beta) {
      return true;
    }
    return hasFirstPartyCapabilities(getProviderForModel(e));
  }
  function iT(e, t) {
    let n = jPi();
    if (n !== undefined) {
      return n;
    }
    if (g7r(e, t)) {
      return 200000;
    }
    return qPi(e, t);
  }
  function jPi() {
    if (Me.DISABLE_COMPACT && process.env.CLAUDE_CODE_MAX_CONTEXT_TOKENS) {
      let e = parseInt(process.env.CLAUDE_CODE_MAX_CONTEXT_TOKENS, 10);
      if (!isNaN(e) && e > 0) {
        return e;
      }
    }
    return;
  }
  function g7r(e, t) {
    return isLongContext1mCreditsBlocked() && jPi() === undefined && qPi(e, t) > 200000;
  }
  function qPi(e, t) {
    if (hg(e)) {
      return 1e6;
    }
    if (t?.includes(UY.header) && d8(e)) {
      return 1e6;
    }
    if (modelHasNative1MContext(e)) {
      return 1e6;
    }
    let n = Z0n(e);
    if (n !== null) {
      return n;
    }
    let r = Me.CLAUDE_CODE_MAX_CONTEXT_TOKENS;
    if (r !== undefined && r > 0 && !getCanonicalName(parseUserSpecifiedModel(e)).startsWith("claude-")) {
      return r;
    }
    return 200000;
  }
  function WPi() {
    return getCachedClientData();
  }
  function GPi() {
    return getGlobalConfig().autoCompactWindowsCache ?? null;
  }
  function Z0n(e) {
    if (E_e()) {
      return null;
    }
    if (hg(e)) {
      return null;
    }
    if (getCanonicalName(e) !== "claude-sonnet-4-6") {
      return null;
    }
    let t = getCachedClientData()?.kelp_forest_sonnet;
    if (typeof t !== "string") {
      return null;
    }
    let n = parseInt(t, 10);
    if (!Number.isFinite(n) || n <= 0) {
      return null;
    }
    return n;
  }
  function eIn(e, t) {
    if (!e) {
      return {
        used: null,
        remaining: null
      };
    }
    let n = e.input_tokens + e.cache_creation_input_tokens + e.cache_read_input_tokens;
    let r = Math.round(n / t * 100);
    let o = Math.min(100, Math.max(0, r));
    return {
      used: o,
      remaining: 100 - o
    };
  }
  function w2d(e) {
    let t = getCachedClientData()?.heather_vale;
    if (typeof t !== "object" || t === null || Array.isArray(t)) {
      return null;
    }
    let n = t[e];
    if (typeof n !== "number" || !Number.isInteger(n) || n <= 0) {
      return null;
    }
    return n;
  }
  function dIe(e) {
    let t;
    let n;
    let r = getCanonicalName(e);
    if (r === "claude-fable-5" || r === "claude-mythos-5") {
      t = 64000;
      n = 128000;
    } else if (r === "claude-sonnet-5") {
      t = 64000;
      n = 128000;
    } else if (r === "claude-opus-4-8") {
      t = 64000;
      n = 128000;
    } else if (r === "claude-opus-4-7") {
      t = 64000;
      n = 128000;
    } else if (r === "claude-sonnet-4-6") {
      t = 32000;
      n = 128000;
    } else if (r === "claude-opus-4-6") {
      t = 64000;
      n = 128000;
    } else if (r === "claude-opus-4-5" || r === "claude-sonnet-4-0" || r === "claude-sonnet-4-5" || r === "claude-haiku-4-5") {
      t = 32000;
      n = 64000;
    } else if (r === "claude-opus-4-1" || r === "claude-opus-4-0") {
      t = 32000;
      n = 32000;
    } else if (r === "claude-3-opus") {
      t = 4096;
      n = 4096;
    } else if (r === "claude-3-sonnet") {
      t = 8192;
      n = 8192;
    } else if (r === "claude-3-haiku") {
      t = 4096;
      n = 4096;
    } else if (r === "claude-3-5-sonnet" || r === "claude-3-5-haiku") {
      t = 8192;
      n = 8192;
    } else if (r === "claude-3-7-sonnet") {
      t = 32000;
      n = 64000;
    } else {
      t = 32000;
      n = 128000;
    }
    let o = w2d(r);
    if (o !== null) {
      t = Math.min(o, n);
    }
    let s = $Pi(e);
    if (s?.max_tokens && s.max_tokens >= 4096) {
      n = s.max_tokens;
      t = Math.min(t, n);
    }
    return {
      default: t,
      upperLimit: n
    };
  }
  function VPi(e) {
    return dIe(e).upperLimit - 1;
  }
  var VT = __lazy(() => {
    at();
    KN();
    pr();
    gn();
    Tk();
    DY();
    Eo();
    h7r();
    Ds();
  });
  function sm(e) {
    if (e == null) {
      return;
    }
    return C2d.test(e) || R2d.test(e) ? e : "nonconforming";
  }
  function Git(e) {
    let t = e.replace(/\[1m\]$/i, "").replace(/^claude-/, "").replaceAll("-", "_");
    return /^[a-z0-9_]{1,40}$/.test(t) ? t : "nonconforming";
  }
  var C2d;
  var R2d;
  var cJ = __lazy(() => {
    C2d = /^[A-Za-z0-9._:[\]-]{1,100}$/;
    R2d = /^[A-Za-z0-9._:[\]-]{1,91}@\d{8}$/;
  });
  function Vit(e, t) {
    return `${e}_${Git(t)}`;
  }
  function cbe(e) {
    return /-eap($|\[)/i.test(e);
  }
  function x2d(e) {
    let t = getCanonicalName(e);
    let n = getCachedClientData()?.simple_system_prompt;
    if (typeof n === "object" && n !== null && Object.entries(n).some(([o, s]) => s === true && t.includes(o))) {
      return true;
    }
    let r = getFeatureValue_CACHED_MAY_BE_STALE("tengu_velvet_cascade", null);
    if (typeof r !== "object" || r === null || !("models" in r) || !Array.isArray(r.models)) {
      return false;
    }
    return r.models.some(o => typeof o === "string" && t.includes(o));
  }
  function k2d(e) {
    if (cbe(e)) {
      return false;
    }
    let t = getCanonicalName(e);
    if (o2(t, "lean_prompt") || t === "claude-mythos-5") {
      return false;
    }
    if (t.includes("claude-3-") || t.includes("haiku") || t.includes("sonnet") || t === "claude-opus-4-0" || t === "claude-opus-4-1" || t === "claude-opus-4-5" || t === "claude-opus-4-6" || t === "claude-opus-4-7") {
      return true;
    }
    return !usesFirstPartyModelIds();
  }
  var _g;
  var AI = __lazy(() => {
    ZL();
    $n();
    cJ();
    gn();
    DY();
    Eo();
    Ds();
    _g = TEr(e => {
      if (!e) {
        return false;
      }
      if (st(process.env.CLAUDE_CODE_SIMPLE_SYSTEM_PROMPT)) {
        return true;
      }
      if (Pl(process.env.CLAUDE_CODE_SIMPLE_SYSTEM_PROMPT)) {
        return false;
      }
      return !k2d(e) || x2d(e);
    });
  });
  function ube(e) {
    if (o2(e, "fable_5_mitigations") || e === "claude-mythos-5") {
      return true;
    }
    return false;
  }
  function jBt(e) {
    return e.startsWith("claude-fable-");
  }
  function zPi(e) {
    return e.startsWith("claude-mythos-");
  }
  function KPi(e) {
    return false;
  }
  var qBt = __lazy(() => {
    DY();
  });
  var A2d;
  var x8;
  var WBt = __lazy(() => {
    Ds();
    A2d = [{
      modelEnvVar: "ANTHROPIC_DEFAULT_FABLE_MODEL",
      capabilitiesEnvVar: "ANTHROPIC_DEFAULT_FABLE_MODEL_SUPPORTED_CAPABILITIES"
    }, {
      modelEnvVar: "ANTHROPIC_DEFAULT_OPUS_MODEL",
      capabilitiesEnvVar: "ANTHROPIC_DEFAULT_OPUS_MODEL_SUPPORTED_CAPABILITIES"
    }, {
      modelEnvVar: "ANTHROPIC_DEFAULT_SONNET_MODEL",
      capabilitiesEnvVar: "ANTHROPIC_DEFAULT_SONNET_MODEL_SUPPORTED_CAPABILITIES"
    }, {
      modelEnvVar: "ANTHROPIC_DEFAULT_HAIKU_MODEL",
      capabilitiesEnvVar: "ANTHROPIC_DEFAULT_HAIKU_MODEL_SUPPORTED_CAPABILITIES"
    }, {
      modelEnvVar: "ANTHROPIC_CUSTOM_MODEL_OPTION",
      capabilitiesEnvVar: "ANTHROPIC_CUSTOM_MODEL_OPTION_SUPPORTED_CAPABILITIES"
    }];
    x8 = TEr((e, t) => {
      if (usesFirstPartyModelIds()) {
        return;
      }
      let n = e.toLowerCase();
      for (let r of A2d) {
        let o = process.env[r.modelEnvVar];
        let s = process.env[r.capabilitiesEnvVar];
        if (!o || s === undefined) {
          continue;
        }
        if (n !== o.toLowerCase()) {
          continue;
        }
        return s.toLowerCase().split(",").map(i => i.trim()).includes(t);
      }
      return;
    }, (e, t) => `${e.toLowerCase()}:${t}`);
  });
  var YPi = {};