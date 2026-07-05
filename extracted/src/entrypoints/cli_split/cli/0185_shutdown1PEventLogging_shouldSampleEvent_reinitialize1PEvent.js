  __export(z4e, {
    shutdown1PEventLogging: () => shutdown1PEventLogging,
    shouldSampleEvent: () => shouldSampleEvent,
    reinitialize1PEventLoggingIfConfigChanged: () => reinitialize1PEventLoggingIfConfigChanged,
    logGrowthBookExperimentTo1P: () => logGrowthBookExperimentTo1P,
    logEventTo1PAwaitable: () => logEventTo1PAwaitable,
    logEventTo1PAsync: () => logEventTo1PAsync,
    logEventTo1P: () => logEventTo1P,
    is1PEventLoggingEnabled: () => is1PEventLoggingEnabled,
    initialize1PEventLogging: () => initialize1PEventLogging,
    getEventSamplingConfig: () => getEventSamplingConfig,
    _reset1PStateForTesting: () => _reset1PStateForTesting,
    _getPreInitQueueForTesting: () => _getPreInitQueueForTesting
  });
  function getEventSamplingConfig() {
    return getDynamicConfig_CACHED_MAY_BE_STALE("tengu_event_sampling_config", {});
  }
  function shouldSampleEvent(e) {
    let n = getEventSamplingConfig()[e];
    if (!n) {
      return null;
    }
    let r = n.sample_rate;
    if (typeof r !== "number" || r < 0 || r > 1) {
      return null;
    }
    if (r >= 1) {
      return null;
    }
    if (r <= 0) {
      return 0;
    }
    return Math.random() < r ? r : 0;
  }
  function aqi() {
    return getDynamicConfig_CACHED_MAY_BE_STALE("tengu_1p_event_batch_config", {});
  }
  function _getPreInitQueueForTesting() {
    return bJ;
  }
  function _reset1PStateForTesting() {
    Gne = null;
    kbe = null;
    OXr = null;
    bJ = [];
  }
  async function shutdown1PEventLogging() {
    if (!kbe) {
      return;
    }
    try {
      await kbe.shutdown();
    } catch {}
  }
  function is1PEventLoggingEnabled() {
    return !Jj();
  }
  async function logEventTo1PAsync(e, t, n = {}) {
    try {
      let r = await QOn({
        model: n.model,
        betas: n.betas
      });
      let o = {
        event_name: t,
        event_id: PXr.randomUUID(),
        core_metadata: r,
        user_metadata: sat(true),
        event_metadata: n
      };
      let s = getOrCreateUserID();
      if (s) {
        o.user_id = s;
      }
      let i = new Date();
      e.emit({
        timestamp: i,
        observedTimestamp: i,
        body: t,
        attributes: o
      });
    } catch (r) {}
  }
  function logEventTo1P(e, t = {}) {
    if (!is1PEventLoggingEnabled()) {
      return;
    }
    if (!Gne) {
      if (bJ !== null && bJ.length < 1024) {
        bJ.push({
          eventName: e,
          metadata: t
        });
      }
      return;
    }
    if (V4e("firstParty")) {
      return;
    }
    logEventTo1PAsync(Gne, e, t);
  }
  async function logEventTo1PAwaitable(e, t = {}) {
    if (!is1PEventLoggingEnabled()) {
      return;
    }
    if (!Gne) {
      if (bJ !== null && bJ.length < 1024) {
        bJ.push({
          eventName: e,
          metadata: t
        });
      }
      return;
    }
    if (V4e("firstParty")) {
      return;
    }
    return logEventTo1PAsync(Gne, e, t);
  }
  function zWd() {
    return "production";
  }
  function logGrowthBookExperimentTo1P(e) {
    if (!is1PEventLoggingEnabled()) {
      return;
    }
    if (!Gne || V4e("firstParty")) {
      return;
    }
    let t = getOrCreateUserID();
    let {
      accountUuid: n,
      organizationUuid: r
    } = sat(true);
    let o = {
      event_type: "GrowthbookExperimentEvent",
      event_id: PXr.randomUUID(),
      experiment_id: e.experimentId,
      variation_id: e.variationId,
      ...(t && {
        device_id: t
      }),
      ...(n && {
        account_uuid: n
      }),
      ...(r && {
        organization_uuid: r
      }),
      ...(e.userAttributes && {
        session_id: e.userAttributes.sessionId,
        user_attributes: De({
          appVersion: e.userAttributes.appVersion
        })
      }),
      ...(e.experimentMetadata && {
        experiment_metadata: De(e.experimentMetadata)
      }),
      environment: zWd()
    };
    let s = new Date();
    Gne.emit({
      timestamp: s,
      observedTimestamp: s,
      body: "growthbook_experiment",
      attributes: o
    });
  }
  function initialize1PEventLogging() {
    if (profileCheckpoint("1p_event_logging_start"), !is1PEventLoggingEnabled()) {
      bJ = null;
      return;
    }
    let t = aqi();
    OXr = t;
    profileCheckpoint("1p_event_after_growthbook_config");
    let n = t.scheduledDelayMillis || R7(process.env.OTEL_LOGS_EXPORT_INTERVAL, 1e4);
    let r = t.maxExportBatchSize || 200;
    let o = t.maxQueueSize || 8192;
    let s = Wt();
    let i = {
      [eDn.ATTR_SERVICE_NAME]: "claude-code",
      [eDn.ATTR_SERVICE_VERSION]: {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION
    };
    if (s === "wsl") {
      let c = DHe();
      if (c) {
        i["wsl.version"] = c;
      }
    }
    let a = sqi.resourceFromAttributes(i);
    let l = new AXr({
      maxBatchSize: r,
      skipAuth: t.skipAuth,
      maxAttempts: t.maxAttempts,
      path: t.path,
      baseUrl: t.baseUrl,
      isKilled: () => V4e("firstParty")
    });
    if (kbe = new B4e({
      resource: a,
      processors: [new Tbe(l, {
        scheduledDelayMillis: n,
        maxExportBatchSize: r,
        maxQueueSize: o
      })]
    }), Gne = kbe.getLogger("com.anthropic.claude_code.events", {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION), bJ !== null) {
      let c = bJ;
      bJ = null;
      for (let {
        eventName: u,
        metadata: d
      } of c) {
        logEventTo1P(u, d);
      }
    }
  }
  async function reinitialize1PEventLoggingIfConfigChanged() {
    if (!is1PEventLoggingEnabled() || !kbe) {
      return;
    }
    let e = aqi();
    if (gbu(e, OXr)) {
      return;
    }
    let t = kbe;
    let n = Gne;
    Gne = null;
    try {
      await t.forceFlush();
    } catch {}
    kbe = null;
    try {
      initialize1PEventLogging();
    } catch (r) {
      kbe = t;
      Gne = n;
      Oe(r);
      return;
    }
    t.shutdown().catch(() => {});
  }
  var sqi;
  var eDn;
  var PXr;
  var Gne = null;
  var kbe = null;
  var OXr = null;
  var bJ;
  var BF = __lazy(() => {
    KJr();
    ZL();
    je();
    gn();
    Rn();
    Cs();
    H4();
    Bne();
    KW();
    oqi();
    $n();
    Gu();
    IXr();
    sqi = __toESM(Oat(), 1);
    eDn = __toESM(Hne(), 1);
    PXr = require("crypto");
    bJ = [];
  });
  var aDn = {};