  __export(zal, {
    OTLPTraceExporter: () => OTLPTraceExporter_export
  });
  var Kal = __lazy(() => {
    Val();
  });
  var x0o = {};
  __export(x0o, {
    parseOtelHeadersEnvVar: () => parseOtelHeadersEnvVar,
    parseExporterTypes: () => parseExporterTypes,
    isTelemetryEnabled: () => isTelemetryEnabled,
    isBigQueryMetricsEnabled: () => isBigQueryMetricsEnabled,
    initializeTelemetry: () => initializeTelemetry,
    getOtlpLogExporters: () => getOtlpLogExporters,
    getOTLPExporterConfig: () => getOTLPExporterConfig,
    flushTelemetry: () => flushTelemetry,
    bootstrapTelemetry: () => bootstrapTelemetry
  });
  function C0o(e, t) {
    return new Promise((n, r) => {
      setTimeout((o, s) => o(new R0o(s)), e, r, t).unref();
    });
  }
  function bootstrapTelemetry() {
    if (hse.context.setGlobalContextManager(WTe), !process.env.OTEL_EXPORTER_OTLP_METRICS_TEMPORALITY_PREFERENCE) {
      process.env.OTEL_EXPORTER_OTLP_METRICS_TEMPORALITY_PREFERENCE = "delta";
    }
    if (Tx() && !getTracerProvider()) {
      oll();
    }
  }
  function rll() {
    let e = getCachedTelemetryResource();
    if (e) {
      return e;
    }
    let t = Wt();
    let n = {
      [x1e.ATTR_SERVICE_NAME]: "claude-code",
      [x1e.ATTR_SERVICE_VERSION]: {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION
    };
    if (t === "wsl") {
      let m = DHe();
      if (m) {
        n["wsl.version"] = m;
      }
    }
    let r = jQ.resourceFromAttributes(n);
    let o = jQ.resourceFromAttributes(jQ.osDetector.detect().attributes || {});
    let s = jQ.hostDetector.detect();
    let i = s.attributes?.[x1e.SEMRESATTRS_HOST_ARCH] ? {
      [x1e.SEMRESATTRS_HOST_ARCH]: s.attributes[x1e.SEMRESATTRS_HOST_ARCH]
    } : {};
    let a = jQ.resourceFromAttributes(i);
    let l = RFn();
    let c = Object.keys(l).length > 0;
    let u = jQ.envDetector.detect().attributes || {};
    let d = jQ.resourceFromAttributes(c ? vbu(u, (m, f) => f.startsWith("user.") || f.startsWith("identity.")) : u);
    let p = r.merge(o).merge(a).merge(d).merge(jQ.resourceFromAttributes(l));
    setCachedTelemetryResource(p);
    return p;
  }
  function oll() {
    let e = rll();
    let t = new cRo();
    let n = new oVe(t, {
      scheduledDelayMillis: 5000
    });
    let r = new P8t({
      resource: e,
      spanProcessors: [n]
    });
    hse.trace.setGlobalTracerProvider(r);
    setTracerProvider(r);
    let o = new uRo();
    let s = new B4e({
      resource: e,
      processors: [new Tbe(o, {
        scheduledDelayMillis: 5000
      })]
    });
    $2t.setGlobalLoggerProvider(s);
    setLoggerProvider(s);
    let i = $2t.getLogger("com.anthropic.claude_code.events", {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION);
    setEventLogger(i);
    process.on("beforeExit", async () => {
      await s.forceFlush().catch(() => {});
      await r.forceFlush().catch(() => {});
    });
    process.on("exit", () => {
      s.forceFlush().catch(() => {});
      r.forceFlush().catch(() => {});
    });
    kdm(t, o).catch(a => logForDebugging(`Beta tracing exporter wiring failed: ${a}`, {
      level: "error"
    }));
  }
  async function kdm(e, t) {
    let n = process.env.BETA_TRACING_ENDPOINT;
    if (!n) {
      return;
    }
    let [{
      OTLPTraceExporter: r
    }, {
      OTLPLogExporter: o
    }] = await Promise.all([Promise.resolve().then(() => (qRo(), jRo)), Promise.resolve().then(() => (GRo(), WRo))]);
    e.setDelegate(new r({
      url: `${n}/v1/traces`
    }));
    t.setDelegate(new o({
      url: `${n}/v1/logs`
    }));
  }
  function parseExporterTypes(e) {
    return (e || "").trim().split(",").filter(Boolean).map(t => t.trim()).filter(t => t !== "none");
  }
  async function Adm() {
    let e = parseExporterTypes(process.env.OTEL_METRICS_EXPORTER);
    let t = R7(process.env.OTEL_METRIC_EXPORT_INTERVAL, 60000);
    logForDebugging(`[3P telemetry] getOtlpReaders: types=${De(e)}, interval=${t}, protocol=${process.env.OTEL_EXPORTER_OTLP_PROTOCOL}, endpoint=${process.env.OTEL_EXPORTER_OTLP_ENDPOINT}`);
    let n = [];
    for (let r of e) {
      if (r === "console") {
        let o = new k1e.ConsoleMetricExporter();
        let s = o.export.bind(o);
        o.export = (i, a) => {
          if (i.resource && i.resource.attributes) {
            logForDebugging(`
=== Resource Attributes ===`);
            logForDebugging(De(i.resource.attributes));
            logForDebugging(`===========================
`);
          }
          return s(i, a);
        };
        n.push(o);
      } else if (r === "otlp") {
        let o = process.env.OTEL_EXPORTER_OTLP_METRICS_PROTOCOL?.trim() || process.env.OTEL_EXPORTER_OTLP_PROTOCOL?.trim();
        let s = getOTLPExporterConfig("metrics");
        switch (o) {
          case "grpc":
            {
              let {
                OTLPMetricExporter: i
              } = await Promise.resolve().then(() => __toESM(Orl(), 1));
              n.push(new i());
              break;
            }
          case "http/json":
            {
              let {
                OTLPMetricExporter: i
              } = await Promise.resolve().then(() => __toESM(sVn(), 1));
              n.push(new i(s));
              break;
            }
          case "http/protobuf":
            {
              let {
                OTLPMetricExporter: i
              } = await Promise.resolve().then(() => (Brl(), Url));
              n.push(new i(s));
              break;
            }
          default:
            throw Error(`Unknown protocol set in OTEL_EXPORTER_OTLP_METRICS_PROTOCOL or OTEL_EXPORTER_OTLP_PROTOCOL env var: ${o}`);
        }
      } else if (r === "prometheus") {
        let {
          PrometheusExporter: o
        } = await Promise.resolve().then(() => __toESM(Ral(), 1));
        n.push(new o());
      } else {
        throw Error(`Unknown exporter type set in OTEL_EXPORTER_OTLP_METRICS_PROTOCOL or OTEL_EXPORTER_OTLP_PROTOCOL env var: ${r}`);
      }
    }
    return n.map(r => {
      if ("export" in r) {
        return new k1e.PeriodicExportingMetricReader({
          exporter: r,
          exportIntervalMillis: t
        });
      }
      return r;
    });
  }
  async function getOtlpLogExporters() {
    let e = parseExporterTypes(process.env.OTEL_LOGS_EXPORTER);
    let t = process.env.OTEL_EXPORTER_OTLP_LOGS_PROTOCOL?.trim() || process.env.OTEL_EXPORTER_OTLP_PROTOCOL?.trim();
    let n = process.env.OTEL_EXPORTER_OTLP_ENDPOINT;
    logForDebugging(`[3P telemetry] getOtlpLogExporters: types=${De(e)}, protocol=${t}, endpoint=${n}`);
    let r = [];
    for (let o of e) {
      if (o === "console") {
        r.push(new COn());
      } else if (o === "otlp") {
        let s = getOTLPExporterConfig("logs");
        switch (t) {
          case "grpc":
            {
              let {
                OTLPLogExporter: i
              } = await Promise.resolve().then(() => __toESM(Ial(), 1));
              r.push(new i());
              break;
            }
          case "http/json":
            {
              let {
                OTLPLogExporter: i
              } = await Promise.resolve().then(() => (GRo(), WRo));
              r.push(new i(s));
              break;
            }
          case "http/protobuf":
            {
              let {
                OTLPLogExporter: i
              } = await Promise.resolve().then(() => (Fal(), Lal));
              r.push(new i(s));
              break;
            }
          default:
            throw Error(`Unknown protocol set in OTEL_EXPORTER_OTLP_LOGS_PROTOCOL or OTEL_EXPORTER_OTLP_PROTOCOL env var: ${t}`);
        }
      } else {
        throw Error(`Unknown exporter type set in OTEL_LOGS_EXPORTER env var: ${o}`);
      }
    }
    return r;
  }
  async function Idm() {
    let e = parseExporterTypes(process.env.OTEL_TRACES_EXPORTER);
    let t = [];
    for (let n of e) {
      if (n === "console") {
        t.push(new d8n());
      } else if (n === "otlp") {
        let r = process.env.OTEL_EXPORTER_OTLP_TRACES_PROTOCOL?.trim() || process.env.OTEL_EXPORTER_OTLP_PROTOCOL?.trim();
        let o = getOTLPExporterConfig("traces");
        switch (r) {
          case "grpc":
            {
              let {
                OTLPTraceExporter: s
              } = await Promise.resolve().then(() => __toESM(Hal(), 1));
              t.push(new s());
              break;
            }
          case "http/json":
            {
              let {
                OTLPTraceExporter: s
              } = await Promise.resolve().then(() => (qRo(), jRo));
              t.push(new s(o));
              break;
            }
          case "http/protobuf":
            {
              let {
                OTLPTraceExporter: s
              } = await Promise.resolve().then(() => (Kal(), zal));
              t.push(new s(o));
              break;
            }
          default:
            throw Error(`Unknown protocol set in OTEL_EXPORTER_OTLP_TRACES_PROTOCOL or OTEL_EXPORTER_OTLP_PROTOCOL env var: ${r}`);
        }
      } else {
        throw Error(`Unknown exporter type set in OTEL_TRACES_EXPORTER env var: ${n}`);
      }
    }
    return t;
  }
  function isTelemetryEnabled() {
    return st(process.env.CLAUDE_CODE_ENABLE_TELEMETRY);
  }
  function Pdm() {
    let e = new aRo();
    return new k1e.PeriodicExportingMetricReader({
      exporter: e,
      exportIntervalMillis: 300000
    });
  }
  function isBigQueryMetricsEnabled() {
    if (yye()) {
      return false;
    }
    let e = getSubscriptionType();
    let t = isClaudeAISubscriber() && (e === "enterprise" || e === "team");
    return is1PApiCustomer() || t;
  }
  async function initializeTelemetry() {
    if (profileCheckpoint("telemetry_init_start"), bootstrapTelemetry(), hse.propagation.setGlobalPropagator(new Jal.W3CTraceContextPropagator()), getHasFormattedOutput()) {
      for (let s of ["OTEL_METRICS_EXPORTER", "OTEL_LOGS_EXPORTER", "OTEL_TRACES_EXPORTER"]) {
        let i = process.env[s];
        if (i?.includes("console")) {
          process.env[s] = i.split(",").map(a => a.trim()).filter(a => a !== "console").join(",");
        }
      }
    }
    hse.diag.setLogger(new dRo(), hse.DiagLogLevel.ERROR);
    x0a();
    let e = [];
    let t = isTelemetryEnabled();
    if (logForDebugging(`[3P telemetry] isTelemetryEnabled=${t} (CLAUDE_CODE_ENABLE_TELEMETRY=${process.env.CLAUDE_CODE_ENABLE_TELEMETRY})`), t) {
      e.push(...(await Adm()));
    }
    if (isBigQueryMetricsEnabled()) {
      e.push(Pdm());
    }
    let n = rll();
    if (Tx()) {
      if (!getTracerProvider()) {
        oll();
      }
      let s = new k1e.MeterProvider({
        resource: n,
        views: [],
        readers: e
      });
      setMeterProvider(s);
      Ti(async () => {
        let a = R7(process.env.CLAUDE_CODE_OTEL_SHUTDOWN_TIMEOUT_MS, 2000);
        try {
          Vde();
          let l = getLoggerProvider();
          let c = getTracerProvider();
          let u = [s.shutdown()];
          if (l) {
            u.push(l.forceFlush().then(() => l.shutdown()));
          }
          if (c) {
            u.push(c.forceFlush().then(() => c.shutdown()));
          }
          await Promise.race([Promise.all(u), C0o(a, "OpenTelemetry shutdown timeout")]);
        } catch {}
      });
      return s.getMeter("com.anthropic.claude_code", {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION);
    }
    let r = new k1e.MeterProvider({
      resource: n,
      views: [],
      readers: e
    });
    if (setMeterProvider(r), t) {
      let s = await getOtlpLogExporters();
      if (logForDebugging(`[3P telemetry] Created ${s.length} log exporter(s)`), s.length > 0) {
        let i = new B4e({
          resource: n,
          processors: s.map(l => new Tbe(l, {
            scheduledDelayMillis: R7(process.env.OTEL_LOGS_EXPORT_INTERVAL, 5000)
          }))
        });
        $2t.setGlobalLoggerProvider(i);
        setLoggerProvider(i);
        let a = $2t.getLogger("com.anthropic.claude_code.events", {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION);
        setEventLogger(a);
        logForDebugging("[3P telemetry] Event logger set successfully");
        process.on("beforeExit", async () => {
          await i?.forceFlush();
          await getTracerProvider()?.forceFlush();
        });
        process.on("exit", () => {
          i?.forceFlush();
          getTracerProvider()?.forceFlush();
        });
      }
    }
    if (t && Aho()) {
      let s = await Idm();
      if (s.length > 0) {
        let i = s.map(l => new oVe(l, {
          scheduledDelayMillis: R7(process.env.OTEL_TRACES_EXPORT_INTERVAL, 5000)
        }));
        let a = new P8t({
          resource: n,
          spanProcessors: i
        });
        hse.trace.setGlobalTracerProvider(a);
        setTracerProvider(a);
        process.on("beforeExit", async () => {
          await a.forceFlush();
        });
      }
    }
    Ti(async () => {
      let s = R7(process.env.CLAUDE_CODE_OTEL_SHUTDOWN_TIMEOUT_MS, 2000);
      try {
        Vde();
        let i = [r.shutdown()];
        let a = getLoggerProvider();
        if (a) {
          i.push(a.shutdown());
        }
        let l = getTracerProvider();
        if (l) {
          i.push(l.shutdown());
        }
        await Promise.race([Promise.all(i), C0o(s, "OpenTelemetry shutdown timeout")]);
      } catch (i) {
        if (i instanceof Error && i.message.includes("timeout")) {
          logForDebugging(`
OpenTelemetry telemetry flush timed out after ${s}ms

To resolve this issue, you can:
1. Increase the timeout by setting CLAUDE_CODE_OTEL_SHUTDOWN_TIMEOUT_MS env var (e.g., 5000 for 5 seconds)
2. Check if your OpenTelemetry backend is experiencing scalability issues
3. Disable OpenTelemetry by unsetting CLAUDE_CODE_ENABLE_TELEMETRY env var

Current timeout: ${s}ms
`, {
            level: "error"
          });
        }
        throw i;
      }
    });
    return r.getMeter("com.anthropic.claude_code", {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION);
  }
  async function flushTelemetry() {
    let e = getMeterProvider();
    if (!e) {
      return;
    }
    let t = R7(process.env.CLAUDE_CODE_OTEL_FLUSH_TIMEOUT_MS, 5000);
    try {
      let n = [e.forceFlush()];
      let r = getLoggerProvider();
      if (r) {
        n.push(r.forceFlush());
      }
      let o = getTracerProvider();
      if (o) {
        n.push(o.forceFlush());
      }
      await Promise.race([Promise.all(n), C0o(t, "OpenTelemetry flush timeout")]);
      logForDebugging("Telemetry flushed successfully");
    } catch (n) {
      if (n instanceof R0o) {
        logForDebugging(`Telemetry flush timed out after ${t}ms. Some metrics may not be exported.`, {
          level: "warn"
        });
      } else {
        logForDebugging(`Telemetry flush failed: ${he(n)}`, {
          level: "error"
        });
      }
    }
  }
  function parseOtelHeadersEnvVar() {
    let e = {};
    let t = process.env.OTEL_EXPORTER_OTLP_HEADERS;
    if (t) {
      for (let n of t.split(",")) {
        let [r, ...o] = n.split("=");
        if (r && o.length > 0) {
          e[r.trim()] = o.join("=").trim();
        }
      }
    }
    return e;
  }
  function getOTLPExporterConfig(e) {
    let t = getInitialSettings();
    let n = {};
    let r = getGatewayAuth();
    if (isGatewayAuthPinned(r)) {
      let s = r.url;
      n.url = `${s}/v1/${e}`;
      n.headers = async () => {
        await b0e();
        let i = getGatewayAuth();
        if (!i || i.url !== s) {
          return {};
        }
        return {
          Authorization: `Bearer ${i.jwt}`
        };
      };
      n.httpAgentOptions = Yal(s);
      return n;
    }
    let o = parseOtelHeadersEnvVar();
    if (t?.otelHeadersHelper) {
      n.headers = async () => {
        let s = await getOtelHeadersFromHelper();
        return {
          ...o,
          ...s
        };
      };
    } else if (Object.keys(o).length > 0) {
      n.headers = async () => o;
    }
    n.httpAgentOptions = Yal(process.env[`OTEL_EXPORTER_OTLP_${e.toUpperCase()}_ENDPOINT`] ?? process.env.OTEL_EXPORTER_OTLP_ENDPOINT);
    return n;
  }
  function Mdm(e) {
    if (!e) {
      return false;
    }
    try {
      let t = new URL(e).hostname.toLowerCase();
      return t === "localhost" || t === "::1" || t === "[::1]" || /^127(\.\d{1,3}){3}$/.test(t);
    } catch {
      return false;
    }
  }
  function Yal(e) {
    let t = getProxyUrl();
    let n = !!(t && !Mdm(e) && !(e && shouldBypassProxy(e)));
    let r = getCachedOtlpHttpAgentFactory(n);
    if (r) {
      return r;
    }
    let o = getMTLSConfig();
    let s = getCACertificates();
    let i = {
      ...o,
      ...(s && {
        ca: s
      })
    };
    let a;
    let l;
    let c;
    let u = d => {
      if (n) {
        if (!c) {
          c = new Zal.HttpsProxyAgent(t, {
            ...i,
            keepAlive: true,
            maxSockets: 1
          });
          c.options = {
            ...c.options,
            ...i
          };
        }
        return c;
      }
      if (d === "http:") {
        if (!a) {
          a = new Xal.default.Agent({
            keepAlive: true,
            maxSockets: 1
          });
        }
        return a;
      }
      if (!l) {
        l = new Qal.default.Agent({
          ...i,
          keepAlive: true,
          maxSockets: 1
        });
      }
      return l;
    };
    setCachedOtlpHttpAgentFactory(n, u);
    return u;
  }
  var hse;
  var Jal;
  var jQ;
  var k1e;
  var x1e;
  var Xal;
  var Qal;
  var Zal;
  var R0o;
  var k0o = __lazy(() => {
    HJr();
    KJr();
    z7a();
    at();
    no();
    Cs();
    Ije();
    hd();
    je();
    gn();
    dt();
    bst();
    fW();
    Wd();
    Fh();
    H4();
    kTe();
    Q7a();
    who();
    rYa();
    sYa();
    Smt();
    GG();
    hse = __toESM(Ji(), 1);
    Jal = __toESM(Gg(), 1);
    jQ = __toESM(Oat(), 1);
    k1e = __toESM(A8t(), 1);
    x1e = __toESM(Hne(), 1);
    Xal = __toESM(require("http"));
    Qal = __toESM(require("https"));
    Zal = __toESM(oNt(), 1);
    R0o = class R0o extends Error {};
  });
  var A0o = {};