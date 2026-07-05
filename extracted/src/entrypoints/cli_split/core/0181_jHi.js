  class F2t {
    emit(e) {}
  }
  var U2t;
  var _On = __lazy(() => {
    U2t = new F2t();
  });
  class LHi {
    getLogger(e, t, n) {
      return new F2t();
    }
  }
  var bOn;
  var UJr = __lazy(() => {
    _On();
    bOn = new LHi();
  });
  class BJr {
    constructor(e, t, n, r) {
      this._provider = e;
      this.name = t;
      this.version = n;
      this.options = r;
    }
    emit(e) {
      this._getLogger().emit(e);
    }
    _getLogger() {
      if (this._delegate) {
        return this._delegate;
      }
      let e = this._provider._getDelegateLogger(this.name, this.version, this.options);
      if (!e) {
        return U2t;
      }
      this._delegate = e;
      return this._delegate;
    }
  }
  var FHi = __lazy(() => {
    _On();
  });
  class SOn {
    getLogger(e, t, n) {
      var r;
      return (r = this._getDelegateLogger(e, t, n)) !== null && r !== undefined ? r : new BJr(this, e, t, n);
    }
    _getDelegate() {
      var e;
      return (e = this._delegate) !== null && e !== undefined ? e : bOn;
    }
    _setDelegate(e) {
      this._delegate = e;
    }
    _getDelegateLogger(e, t, n) {
      var r;
      return (r = this._delegate) === null || r === undefined ? undefined : r.getLogger(e, t, n);
    }
  }
  var UHi = __lazy(() => {
    UJr();
    FHi();
  });
  var TOn;
  var BHi = __lazy(() => {
    TOn = typeof globalThis === "object" ? globalThis : global;
  });
  var $Hi = __lazy(() => {
    BHi();
  });
  var HHi = __lazy(() => {
    $Hi();
  });
  function jHi(e, t, n) {
    return r => r === e ? t : n;
  }
  var B2t;
  class EOn {
    constructor() {
      this._proxyLoggerProvider = new SOn();
    }
    static getInstance() {
      if (!this._instance) {
        this._instance = new EOn();
      }
      return this._instance;
    }
    setGlobalLoggerProvider(e) {
      if (TOn[B2t]) {
        return this.getLoggerProvider();
      }
      TOn[B2t] = jHi(1, e, bOn);
      this._proxyLoggerProvider._setDelegate(e);
      return e;
    }
    getLoggerProvider() {
      var e;
      var t;
      return (t = (e = TOn[B2t]) === null || e === undefined ? undefined : e.call(TOn, 1)) !== null && t !== undefined ? t : this._proxyLoggerProvider;
    }
    getLogger(e, t, n) {
      return this.getLoggerProvider().getLogger(e, t, n);
    }
    disable() {
      delete TOn[B2t];
      this._proxyLoggerProvider = new SOn();
    }
  }
  var WHi = __lazy(() => {
    UJr();
    UHi();
  });
  var $2t;
  var HJr = __lazy(() => {
    _On();
    WHi();
    $2t = EOn.getInstance();
  });
  class jJr {
    hrTime;
    hrTimeObserved;
    spanContext;
    resource;
    instrumentationScope;
    attributes = {};
    _severityText;
    _severityNumber;
    _body;
    _eventName;
    totalAttributesCount = 0;
    _isReadonly = false;
    _logRecordLimits;
    set severityText(e) {
      if (this._isLogRecordReadonly()) {
        return;
      }
      this._severityText = e;
    }
    get severityText() {
      return this._severityText;
    }
    set severityNumber(e) {
      if (this._isLogRecordReadonly()) {
        return;
      }
      this._severityNumber = e;
    }
    get severityNumber() {
      return this._severityNumber;
    }
    set body(e) {
      if (this._isLogRecordReadonly()) {
        return;
      }
      this._body = e;
    }
    get body() {
      return this._body;
    }
    get eventName() {
      return this._eventName;
    }
    set eventName(e) {
      if (this._isLogRecordReadonly()) {
        return;
      }
      this._eventName = e;
    }
    get droppedAttributesCount() {
      return this.totalAttributesCount - Object.keys(this.attributes).length;
    }
    constructor(e, t, n) {
      let {
        timestamp: r,
        observedTimestamp: o,
        eventName: s,
        severityNumber: i,
        severityText: a,
        body: l,
        attributes: c = {},
        context: u
      } = n;
      let d = Date.now();
      if (this.hrTime = Mat.timeInputToHrTime(r ?? d), this.hrTimeObserved = Mat.timeInputToHrTime(o ?? d), u) {
        let p = Hce.trace.getSpanContext(u);
        if (p && Hce.isSpanContextValid(p)) {
          this.spanContext = p;
        }
      }
      this.severityNumber = i;
      this.severityText = a;
      this.body = l;
      this.resource = e.resource;
      this.instrumentationScope = t;
      this._logRecordLimits = e.logRecordLimits;
      this._eventName = s;
      this.setAttributes(c);
    }
    setAttribute(e, t) {
      if (this._isLogRecordReadonly()) {
        return this;
      }
      if (t === null) {
        return this;
      }
      if (e.length === 0) {
        Hce.diag.warn(`Invalid attribute key: ${e}`);
        return this;
      }
      if (!Mat.isAttributeValue(t) && !(typeof t === "object" && !Array.isArray(t) && Object.keys(t).length > 0)) {
        Hce.diag.warn(`Invalid attribute value set for key: ${e}`);
        return this;
      }
      if (this.totalAttributesCount += 1, Object.keys(this.attributes).length >= this._logRecordLimits.attributeCountLimit && !Object.prototype.hasOwnProperty.call(this.attributes, e)) {
        if (this.droppedAttributesCount === 1) {
          Hce.diag.warn("Dropping extra attributes.");
        }
        return this;
      }
      if (Mat.isAttributeValue(t)) {
        this.attributes[e] = this._truncateToSize(t);
      } else {
        this.attributes[e] = t;
      }
      return this;
    }
    setAttributes(e) {
      for (let [t, n] of Object.entries(e)) {
        this.setAttribute(t, n);
      }
      return this;
    }
    setBody(e) {
      this.body = e;
      return this;
    }
    setEventName(e) {
      this.eventName = e;
      return this;
    }
    setSeverityNumber(e) {
      this.severityNumber = e;
      return this;
    }
    setSeverityText(e) {
      this.severityText = e;
      return this;
    }
    _makeReadonly() {
      this._isReadonly = true;
    }
    _truncateToSize(e) {
      let t = this._logRecordLimits.attributeValueLengthLimit;
      if (t <= 0) {
        Hce.diag.warn(`Attribute value limit must be positive, got ${t}`);
        return e;
      }
      if (typeof e === "string") {
        return this._truncateToLimitUtil(e, t);
      }
      if (Array.isArray(e)) {
        return e.map(n => typeof n === "string" ? this._truncateToLimitUtil(n, t) : n);
      }
      return e;
    }
    _truncateToLimitUtil(e, t) {
      if (e.length <= t) {
        return e;
      }
      return e.substring(0, t);
    }
    _isLogRecordReadonly() {
      if (this._isReadonly) {
        Hce.diag.warn("Can not execute the operation on emitted log record");
      }
      return this._isReadonly;
    }
  }
  var Hce;
  var Mat;
  var GHi = __lazy(() => {
    Hce = __toESM(Ji(), 1);
    Mat = __toESM(Gg(), 1);
  });
  class qJr {
    instrumentationScope;
    _sharedState;
    constructor(e, t) {
      this.instrumentationScope = e;
      this._sharedState = t;
    }
    emit(e) {
      let t = e.context || VHi.context.active();
      let n = new jJr(this._sharedState, this.instrumentationScope, {
        context: t,
        ...e
      });
      this._sharedState.activeProcessor.onEmit(n, t);
      n._makeReadonly();
    }
  }
  var VHi;
  var zHi = __lazy(() => {
    GHi();
    VHi = __toESM(Ji(), 1);
  });
  function KHi() {
    return {
      forceFlushTimeoutMillis: 30000,
      logRecordLimits: {
        attributeValueLengthLimit: U4e.getNumberFromEnv("OTEL_LOGRECORD_ATTRIBUTE_VALUE_LENGTH_LIMIT") ?? 1 / 0,
        attributeCountLimit: U4e.getNumberFromEnv("OTEL_LOGRECORD_ATTRIBUTE_COUNT_LIMIT") ?? 128
      },
      includeTraceContext: true
    };
  }
  function YHi(e) {
    return {
      attributeCountLimit: e.attributeCountLimit ?? U4e.getNumberFromEnv("OTEL_LOGRECORD_ATTRIBUTE_COUNT_LIMIT") ?? U4e.getNumberFromEnv("OTEL_ATTRIBUTE_COUNT_LIMIT") ?? 128,
      attributeValueLengthLimit: e.attributeValueLengthLimit ?? U4e.getNumberFromEnv("OTEL_LOGRECORD_ATTRIBUTE_VALUE_LENGTH_LIMIT") ?? U4e.getNumberFromEnv("OTEL_ATTRIBUTE_VALUE_LENGTH_LIMIT") ?? 1 / 0
    };
  }
  var U4e;
  var JHi = __lazy(() => {
    U4e = __toESM(Gg(), 1);
  });
  class WJr {
    forceFlush() {
      return Promise.resolve();
    }
    onEmit(e, t) {}
    shutdown() {
      return Promise.resolve();
    }
  }
  class GJr {
    processors;
    forceFlushTimeoutMillis;
    constructor(e, t) {
      this.processors = e;
      this.forceFlushTimeoutMillis = t;
    }
    async forceFlush() {
      let e = this.forceFlushTimeoutMillis;
      await Promise.all(this.processors.map(t => XHi.callWithTimeout(t.forceFlush(), e)));
    }
    onEmit(e, t) {
      this.processors.forEach(n => n.onEmit(e, t));
    }
    async shutdown() {
      await Promise.all(this.processors.map(e => e.shutdown()));
    }
  }
  var XHi;
  var QHi = __lazy(() => {
    XHi = __toESM(Gg(), 1);
  });
  class VJr {
    resource;
    forceFlushTimeoutMillis;
    logRecordLimits;
    processors;
    loggers = new Map();
    activeProcessor;
    registeredLogRecordProcessors = [];
    constructor(e, t, n, r) {
      if (this.resource = e, this.forceFlushTimeoutMillis = t, this.logRecordLimits = n, this.processors = r, r.length > 0) {
        this.registeredLogRecordProcessors = r;
        this.activeProcessor = new GJr(this.registeredLogRecordProcessors, this.forceFlushTimeoutMillis);
      } else {
        this.activeProcessor = new WJr();
      }
    }
  }
  var ZHi = __lazy(() => {
    QHi();
  });
  class B4e {
    _shutdownOnce;
    _sharedState;
    constructor(e = {}) {
      let t = vOn.merge({}, KHi(), e);
      let n = e.resource ?? eji.defaultResource();
      this._sharedState = new VJr(n, t.forceFlushTimeoutMillis, YHi(t.logRecordLimits), e?.processors ?? []);
      this._shutdownOnce = new vOn.BindOnceFuture(this._shutdown, this);
    }
    getLogger(e, t, n) {
      if (this._shutdownOnce.isCalled) {
        H2t.diag.warn("A shutdown LoggerProvider cannot provide a Logger");
        return U2t;
      }
      if (!e) {
        H2t.diag.warn("Logger requested without instrumentation scope name.");
      }
      let r = e || "unknown";
      let o = `${r}@${t || ""}:${n?.schemaUrl || ""}`;
      if (!this._sharedState.loggers.vZc(o)) {
        this._sharedState.loggers.set(o, new qJr({
          name: r,
          version: t,
          schemaUrl: n?.schemaUrl
        }, this._sharedState));
      }
      return this._sharedState.loggers.get(o);
    }
    forceFlush() {
      if (this._shutdownOnce.isCalled) {
        H2t.diag.warn("invalid attempt to force flush after LoggerProvider shutdown");
        return this._shutdownOnce.promise;
      }
      return this._sharedState.activeProcessor.forceFlush();
    }
    shutdown() {
      if (this._shutdownOnce.isCalled) {
        H2t.diag.warn("shutdown may only be called once per LoggerProvider");
        return this._shutdownOnce.promise;
      }
      return this._shutdownOnce.call();
    }
    _shutdown() {
      return this._sharedState.activeProcessor.shutdown();
    }
  }
  var H2t;
  var eji;
  var vOn;
  var tji = __lazy(() => {
    HJr();
    zHi();
    JHi();
    ZHi();
    H2t = __toESM(Ji(), 1);
    eji = __toESM(Oat(), 1);
    vOn = __toESM(Gg(), 1);
  });
  class COn {
    export(e, t) {
      this._sendLogRecords(e, t);
    }
    shutdown() {
      return Promise.resolve();
    }
    _exportInfo(e) {
      return {
        resource: {
          attributes: e.resource.attributes
        },
        instrumentationScope: e.instrumentationScope,
        timestamp: wOn.hrTimeToMicroseconds(e.hrTime),
        traceId: e.spanContext?.traceId,
        spanId: e.spanContext?.spanId,
        traceFlags: e.spanContext?.traceFlags,
        severityText: e.severityText,
        severityNumber: e.severityNumber,
        body: e.body,
        attributes: e.attributes
      };
    }
    _sendLogRecords(e, t) {
      for (let n of e) {
        console.dir(this._exportInfo(n), {
          depth: 3
        });
      }
      t?.({
        code: wOn.ExportResultCode.SUCCESS
      });
    }
  }
  var wOn;
  var nji = __lazy(() => {
    wOn = __toESM(Gg(), 1);
  });
  class zJr {
    _exporter;
    _maxExportBatchSize;
    _maxQueueSize;
    _scheduledDelayMillis;
    _exportTimeoutMillis;
    _isExporting = false;
    _finishedLogRecords = [];
    _timer;
    _shutdownOnce;
    constructor(e, t) {
      if (this._exporter = e, this._maxExportBatchSize = t?.maxExportBatchSize ?? QN.getNumberFromEnv("OTEL_BLRP_MAX_EXPORT_BATCH_SIZE") ?? 512, this._maxQueueSize = t?.maxQueueSize ?? QN.getNumberFromEnv("OTEL_BLRP_MAX_QUEUE_SIZE") ?? 2048, this._scheduledDelayMillis = t?.scheduledDelayMillis ?? QN.getNumberFromEnv("OTEL_BLRP_SCHEDULE_DELAY") ?? 5000, this._exportTimeoutMillis = t?.exportTimeoutMillis ?? QN.getNumberFromEnv("OTEL_BLRP_EXPORT_TIMEOUT") ?? 30000, this._shutdownOnce = new QN.BindOnceFuture(this._shutdown, this), this._maxExportBatchSize > this._maxQueueSize) {
        rji.diag.warn("BatchLogRecordProcessor: maxExportBatchSize must be smaller or equal to maxQueueSize, setting maxExportBatchSize to match maxQueueSize");
        this._maxExportBatchSize = this._maxQueueSize;
      }
    }
    onEmit(e) {
      if (this._shutdownOnce.isCalled) {
        return;
      }
      this._addToBuffer(e);
    }
    forceFlush() {
      if (this._shutdownOnce.isCalled) {
        return this._shutdownOnce.promise;
      }
      return this._flushAll();
    }
    shutdown() {
      return this._shutdownOnce.call();
    }
    async _shutdown() {
      this.onShutdown();
      await this._flushAll();
      await this._exporter.shutdown();
    }
    _addToBuffer(e) {
      if (this._finishedLogRecords.length >= this._maxQueueSize) {
        return;
      }
      this._finishedLogRecords.push(e);
      this._maybeStartTimer();
    }
    _flushAll() {
      return new Promise((e, t) => {
        let n = [];
        let r = Math.ceil(this._finishedLogRecords.length / this._maxExportBatchSize);
        for (let o = 0; o < r; o++) {
          n.push(this._flushOneBatch());
        }
        Promise.all(n).then(() => {
          e();
        }).catch(t);
      });
    }
    _flushOneBatch() {
      if (this._clearTimer(), this._finishedLogRecords.length === 0) {
        return Promise.resolve();
      }
      return new Promise((e, t) => {
        QN.callWithTimeout(this._export(this._finishedLogRecords.splice(0, this._maxExportBatchSize)), this._exportTimeoutMillis).then(() => e()).catch(t);
      });
    }
    _maybeStartTimer() {
      if (this._isExporting) {
        return;
      }
      let e = () => {
        this._isExporting = true;
        this._flushOneBatch().then(() => {
          if (this._isExporting = false, this._finishedLogRecords.length > 0) {
            this._clearTimer();
            this._maybeStartTimer();
          }
        }).catch(t => {
          this._isExporting = false;
          QN.globalErrorHandler(t);
        });
      };
      if (this._finishedLogRecords.length >= this._maxExportBatchSize) {
        return e();
      }
      if (this._timer !== undefined) {
        return;
      }
      if (this._timer = setTimeout(() => e(), this._scheduledDelayMillis), typeof this._timer !== "number") {
        this._timer.unref();
      }
    }
    _clearTimer() {
      if (this._timer !== undefined) {
        clearTimeout(this._timer);
        this._timer = undefined;
      }
    }
    _export(e) {
      let t = () => QN.internal._export(this._exporter, e).then(r => {
        if (r.code !== QN.ExportResultCode.SUCCESS) {
          QN.globalErrorHandler(r.error ?? Error(`BatchLogRecordProcessor: log record export failed (status ${r})`));
        }
      }).catch(QN.globalErrorHandler);
      let n = e.map(r => r.resource).filter(r => r.asyncAttributesPending);
      if (n.length === 0) {
        return t();
      } else {
        return Promise.all(n.map(r => r.waitForAsyncAttributes?.())).then(t, QN.globalErrorHandler);
      }
    }
  }
  var rji;
  var QN;
  var oji = __lazy(() => {
    rji = __toESM(Ji(), 1);
    QN = __toESM(Gg(), 1);
  });
  var Tbe;
  var sji = __lazy(() => {
    oji();
    Tbe = class Tbe extends zJr {
      onShutdown() {}
    };
  });
  var iji = __lazy(() => {
    sji();
  });
  var aji = __lazy(() => {
    iji();
  });
  var KJr = __lazy(() => {
    tji();
    nji();
    aji();
  });
  function j4d() {
    if (st(process.env.CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST)) {
      return false;
    }
    return !isFirstPartyProvider();
  }
  function lji() {
    return process.env.CLAUDE_CODE_ENVIRONMENT_KIND === "byoc" && !st(process.env.CLAUDE_CODE_BYOC_ENABLE_DATADOG);
  }
  function Jj() {
    return j4d() || getGatewayAuth() !== null || yye();
  }
  function Ebe() {
    return st(process.env.CLAUDE_CODE_ENABLE_FEEDBACK_SURVEY_FOR_OTEL);
  }
  function qne() {
    if (Ebe()) {
      return false;
    }
    return yye();
  }
  var KW = __lazy(() => {
    at();
    gn();
    Ds();
    Wd();
  });
  function q4d() {
    return {
      seconds: 0,
      nanos: 0
    };
  }
  function cji(e) {
    return e !== null && e !== undefined;
  }
  var j2t;
  var YJr = __lazy(() => {
    j2t = {
      fromJSON(e) {
        return {
          seconds: cji(e.seconds) ? globalThis.Number(e.seconds) : 0,
          nanos: cji(e.nanos) ? globalThis.Number(e.nanos) : 0
        };
      },
      toJSON(e) {
        let t = {};
        if (e.seconds !== undefined) {
          t.seconds = Math.round(e.seconds);
        }
        if (e.nanos !== undefined) {
          t.nanos = Math.round(e.nanos);
        }
        return t;
      },
      create(e) {
        return j2t.fromPartial(e ?? {});
      },
      fromPartial(e) {
        let t = q4d();
        t.seconds = e.seconds ?? 0;
        t.nanos = e.nanos ?? 0;
        return t;
      }
    };
  });
  function W4d() {
    return {
      account_id: 0,
      organization_uuid: "",
      account_uuid: ""
    };
  }
  function JJr(e) {
    return e !== null && e !== undefined;
  }
  var vbe;
  var XJr = __lazy(() => {
    vbe = {
      fromJSON(e) {
        return {
          account_id: JJr(e.account_id) ? globalThis.Number(e.account_id) : 0,
          organization_uuid: JJr(e.organization_uuid) ? globalThis.String(e.organization_uuid) : "",
          account_uuid: JJr(e.account_uuid) ? globalThis.String(e.account_uuid) : ""
        };
      },
      toJSON(e) {
        let t = {};
        if (e.account_id !== undefined) {
          t.account_id = Math.round(e.account_id);
        }
        if (e.organization_uuid !== undefined) {
          t.organization_uuid = e.organization_uuid;
        }
        if (e.account_uuid !== undefined) {
          t.account_uuid = e.account_uuid;
        }
        return t;
      },
      create(e) {
        return vbe.fromPartial(e ?? {});
      },
      fromPartial(e) {
        let t = W4d();
        t.account_id = e.account_id ?? 0;
        t.organization_uuid = e.organization_uuid ?? "";
        t.account_uuid = e.account_uuid ?? "";
        return t;
      }
    };
  });
  function G4d() {
    return {
      actor_id: "",
      repository_id: "",
      repository_owner_id: ""
    };
  }
  function V4d() {
    return {
      platform: "",
      node_version: "",
      terminal: "",
      package_managers: "",
      runtimes: "",
      is_running_with_bun: false,
      is_ci: false,
      is_claubbit: false,
      is_github_action: false,
      is_claude_code_action: false,
      is_claude_ai_auth: false,
      version: "",
      github_event_name: "",
      github_actions_runner_environment: "",
      github_actions_runner_os: "",
      github_action_ref: "",
      wsl_version: "",
      github_actions_metadata: undefined,
      arch: "",
      is_claude_code_remote: false,
      remote_environment_type: "",
      claude_code_container_id: "",
      claude_code_remote_session_id: "",
      tags: [],
      deployment_environment: "",
      is_conductor: false,
      version_base: "",
      coworker_type: "",
      build_time: "",
      is_local_agent_mode: false,
      linux_distro_id: "",
      linux_distro_version: "",
      linux_kernel: "",
      vcs: "",
      platform_raw: "",
      shell: ""
    };
  }
  function z4d() {
    return {
      slack_team_id: "",
      is_enterprise_install: false,
      trigger: "",
      creation_method: ""
    };
  }
  function K4d() {
    return {
      event_name: "",
      client_timestamp: undefined,
      model: "",
      session_id: "",
      user_type: "",
      betas: "",
      env: undefined,
      entrypoint: "",
      agent_sdk_version: "",
      is_interactive: false,
      client_type: "",
      process: "",
      additional_metadata: "",
      auth: undefined,
      server_timestamp: undefined,
      event_id: "",
      device_id: "",
      swe_bench_run_id: "",
      swe_bench_instance_id: "",
      swe_bench_task_id: "",
      email: "",
      agent_id: "",
      parent_session_id: "",
      agent_type: "",
      slack: undefined,
      team_name: "",
      skill_name: "",
      plugin_name: "",
      marketplace_name: "",
      repl_code: "",
      head_sha: ""
    };
  }
  function Y4d(e) {
    let t = (e.seconds || 0) * 1000;
    t += (e.nanos || 0) / 1e6;
    return new globalThis.Date(t);
  }
  function uji(e) {
    if (e instanceof globalThis.Date) {
      return e;
    } else if (typeof e === "string") {
      return new globalThis.Date(e);
    } else {
      return Y4d(j2t.fromJSON(e));
    }
  }
  function ol(e) {
    return e !== null && e !== undefined;
  }
  var ROn;
  var xOn;
  var kOn;
  var AOn;
  var dji = __lazy(() => {
    YJr();
    XJr();
    ROn = {
      fromJSON(e) {
        return {
          actor_id: ol(e.actor_id) ? globalThis.String(e.actor_id) : "",
          repository_id: ol(e.repository_id) ? globalThis.String(e.repository_id) : "",
          repository_owner_id: ol(e.repository_owner_id) ? globalThis.String(e.repository_owner_id) : ""
        };
      },
      toJSON(e) {
        let t = {};
        if (e.actor_id !== undefined) {
          t.actor_id = e.actor_id;
        }
        if (e.repository_id !== undefined) {
          t.repository_id = e.repository_id;
        }
        if (e.repository_owner_id !== undefined) {
          t.repository_owner_id = e.repository_owner_id;
        }
        return t;
      },
      create(e) {
        return ROn.fromPartial(e ?? {});
      },
      fromPartial(e) {
        let t = G4d();
        t.actor_id = e.actor_id ?? "";
        t.repository_id = e.repository_id ?? "";
        t.repository_owner_id = e.repository_owner_id ?? "";
        return t;
      }
    };
    xOn = {
      fromJSON(e) {
        return {
          platform: ol(e.platform) ? globalThis.String(e.platform) : "",
          node_version: ol(e.node_version) ? globalThis.String(e.node_version) : "",
          terminal: ol(e.terminal) ? globalThis.String(e.terminal) : "",
          package_managers: ol(e.package_managers) ? globalThis.String(e.package_managers) : "",
          runtimes: ol(e.runtimes) ? globalThis.String(e.runtimes) : "",
          is_running_with_bun: ol(e.is_running_with_bun) ? globalThis.Boolean(e.is_running_with_bun) : false,
          is_ci: ol(e.is_ci) ? globalThis.Boolean(e.is_ci) : false,
          is_claubbit: ol(e.is_claubbit) ? globalThis.Boolean(e.is_claubbit) : false,
          is_github_action: ol(e.is_github_action) ? globalThis.Boolean(e.is_github_action) : false,
          is_claude_code_action: ol(e.is_claude_code_action) ? globalThis.Boolean(e.is_claude_code_action) : false,
          is_claude_ai_auth: ol(e.is_claude_ai_auth) ? globalThis.Boolean(e.is_claude_ai_auth) : false,
          version: ol(e.version) ? globalThis.String(e.version) : "",
          github_event_name: ol(e.github_event_name) ? globalThis.String(e.github_event_name) : "",
          github_actions_runner_environment: ol(e.github_actions_runner_environment) ? globalThis.String(e.github_actions_runner_environment) : "",
          github_actions_runner_os: ol(e.github_actions_runner_os) ? globalThis.String(e.github_actions_runner_os) : "",
          github_action_ref: ol(e.github_action_ref) ? globalThis.String(e.github_action_ref) : "",
          wsl_version: ol(e.wsl_version) ? globalThis.String(e.wsl_version) : "",
          github_actions_metadata: ol(e.github_actions_metadata) ? ROn.fromJSON(e.github_actions_metadata) : undefined,
          arch: ol(e.arch) ? globalThis.String(e.arch) : "",
          is_claude_code_remote: ol(e.is_claude_code_remote) ? globalThis.Boolean(e.is_claude_code_remote) : false,
          remote_environment_type: ol(e.remote_environment_type) ? globalThis.String(e.remote_environment_type) : "",
          claude_code_container_id: ol(e.claude_code_container_id) ? globalThis.String(e.claude_code_container_id) : "",
          claude_code_remote_session_id: ol(e.claude_code_remote_session_id) ? globalThis.String(e.claude_code_remote_session_id) : "",
          tags: globalThis.Array.isArray(e?.tags) ? e.tags.map(t => globalThis.String(t)) : [],
          deployment_environment: ol(e.deployment_environment) ? globalThis.String(e.deployment_environment) : "",
          is_conductor: ol(e.is_conductor) ? globalThis.Boolean(e.is_conductor) : false,
          version_base: ol(e.version_base) ? globalThis.String(e.version_base) : "",
          coworker_type: ol(e.coworker_type) ? globalThis.String(e.coworker_type) : "",
          build_time: ol(e.build_time) ? globalThis.String(e.build_time) : "",
          is_local_agent_mode: ol(e.is_local_agent_mode) ? globalThis.Boolean(e.is_local_agent_mode) : false,
          linux_distro_id: ol(e.linux_distro_id) ? globalThis.String(e.linux_distro_id) : "",
          linux_distro_version: ol(e.linux_distro_version) ? globalThis.String(e.linux_distro_version) : "",
          linux_kernel: ol(e.linux_kernel) ? globalThis.String(e.linux_kernel) : "",
          vcs: ol(e.vcs) ? globalThis.String(e.vcs) : "",
          platform_raw: ol(e.platform_raw) ? globalThis.String(e.platform_raw) : "",
          shell: ol(e.shell) ? globalThis.String(e.shell) : ""
        };
      },
      toJSON(e) {
        let t = {};
        if (e.platform !== undefined) {
          t.platform = e.platform;
        }
        if (e.node_version !== undefined) {
          t.node_version = e.node_version;
        }
        if (e.terminal !== undefined) {
          t.terminal = e.terminal;
        }
        if (e.package_managers !== undefined) {
          t.package_managers = e.package_managers;
        }
        if (e.runtimes !== undefined) {
          t.runtimes = e.runtimes;
        }
        if (e.is_running_with_bun !== undefined) {
          t.is_running_with_bun = e.is_running_with_bun;
        }
        if (e.is_ci !== undefined) {
          t.is_ci = e.is_ci;
        }
        if (e.is_claubbit !== undefined) {
          t.is_claubbit = e.is_claubbit;
        }
        if (e.is_github_action !== undefined) {
          t.is_github_action = e.is_github_action;
        }
        if (e.is_claude_code_action !== undefined) {
          t.is_claude_code_action = e.is_claude_code_action;
        }
        if (e.is_claude_ai_auth !== undefined) {
          t.is_claude_ai_auth = e.is_claude_ai_auth;
        }
        if (e.version !== undefined) {
          t.version = e.version;
        }
        if (e.github_event_name !== undefined) {
          t.github_event_name = e.github_event_name;
        }
        if (e.github_actions_runner_environment !== undefined) {
          t.github_actions_runner_environment = e.github_actions_runner_environment;
        }
        if (e.github_actions_runner_os !== undefined) {
          t.github_actions_runner_os = e.github_actions_runner_os;
        }
        if (e.github_action_ref !== undefined) {
          t.github_action_ref = e.github_action_ref;
        }
        if (e.wsl_version !== undefined) {
          t.wsl_version = e.wsl_version;
        }
        if (e.github_actions_metadata !== undefined) {
          t.github_actions_metadata = ROn.toJSON(e.github_actions_metadata);
        }
        if (e.arch !== undefined) {
          t.arch = e.arch;
        }
        if (e.is_claude_code_remote !== undefined) {
          t.is_claude_code_remote = e.is_claude_code_remote;
        }
        if (e.remote_environment_type !== undefined) {
          t.remote_environment_type = e.remote_environment_type;
        }
        if (e.claude_code_container_id !== undefined) {
          t.claude_code_container_id = e.claude_code_container_id;
        }
        if (e.claude_code_remote_session_id !== undefined) {
          t.claude_code_remote_session_id = e.claude_code_remote_session_id;
        }
        if (e.tags?.length) {
          t.tags = e.tags;
        }
        if (e.deployment_environment !== undefined) {
          t.deployment_environment = e.deployment_environment;
        }
        if (e.is_conductor !== undefined) {
          t.is_conductor = e.is_conductor;
        }
        if (e.version_base !== undefined) {
          t.version_base = e.version_base;
        }
        if (e.coworker_type !== undefined) {
          t.coworker_type = e.coworker_type;
        }
        if (e.build_time !== undefined) {
          t.build_time = e.build_time;
        }
        if (e.is_local_agent_mode !== undefined) {
          t.is_local_agent_mode = e.is_local_agent_mode;
        }
        if (e.linux_distro_id !== undefined) {
          t.linux_distro_id = e.linux_distro_id;
        }
        if (e.linux_distro_version !== undefined) {
          t.linux_distro_version = e.linux_distro_version;
        }
        if (e.linux_kernel !== undefined) {
          t.linux_kernel = e.linux_kernel;
        }
        if (e.vcs !== undefined) {
          t.vcs = e.vcs;
        }
        if (e.platform_raw !== undefined) {
          t.platform_raw = e.platform_raw;
        }
        if (e.shell !== undefined) {
          t.shell = e.shell;
        }
        return t;
      },
      create(e) {
        return xOn.fromPartial(e ?? {});
      },
      fromPartial(e) {
        let t = V4d();
        t.platform = e.platform ?? "";
        t.node_version = e.node_version ?? "";
        t.terminal = e.terminal ?? "";
        t.package_managers = e.package_managers ?? "";
        t.runtimes = e.runtimes ?? "";
        t.is_running_with_bun = e.is_running_with_bun ?? false;
        t.is_ci = e.is_ci ?? false;
        t.is_claubbit = e.is_claubbit ?? false;
        t.is_github_action = e.is_github_action ?? false;
        t.is_claude_code_action = e.is_claude_code_action ?? false;
        t.is_claude_ai_auth = e.is_claude_ai_auth ?? false;
        t.version = e.version ?? "";
        t.github_event_name = e.github_event_name ?? "";
        t.github_actions_runner_environment = e.github_actions_runner_environment ?? "";
        t.github_actions_runner_os = e.github_actions_runner_os ?? "";
        t.github_action_ref = e.github_action_ref ?? "";
        t.wsl_version = e.wsl_version ?? "";
        t.github_actions_metadata = e.github_actions_metadata !== undefined && e.github_actions_metadata !== null ? ROn.fromPartial(e.github_actions_metadata) : undefined;
        t.arch = e.arch ?? "";
        t.is_claude_code_remote = e.is_claude_code_remote ?? false;
        t.remote_environment_type = e.remote_environment_type ?? "";
        t.claude_code_container_id = e.claude_code_container_id ?? "";
        t.claude_code_remote_session_id = e.claude_code_remote_session_id ?? "";
        t.tags = e.tags?.map(n => n) || [];
        t.deployment_environment = e.deployment_environment ?? "";
        t.is_conductor = e.is_conductor ?? false;
        t.version_base = e.version_base ?? "";
        t.coworker_type = e.coworker_type ?? "";
        t.build_time = e.build_time ?? "";
        t.is_local_agent_mode = e.is_local_agent_mode ?? false;
        t.linux_distro_id = e.linux_distro_id ?? "";
        t.linux_distro_version = e.linux_distro_version ?? "";
        t.linux_kernel = e.linux_kernel ?? "";
        t.vcs = e.vcs ?? "";
        t.platform_raw = e.platform_raw ?? "";
        t.shell = e.shell ?? "";
        return t;
      }
    };
    kOn = {
      fromJSON(e) {
        return {
          slack_team_id: ol(e.slack_team_id) ? globalThis.String(e.slack_team_id) : "",
          is_enterprise_install: ol(e.is_enterprise_install) ? globalThis.Boolean(e.is_enterprise_install) : false,
          trigger: ol(e.trigger) ? globalThis.String(e.trigger) : "",
          creation_method: ol(e.creation_method) ? globalThis.String(e.creation_method) : ""
        };
      },
      toJSON(e) {
        let t = {};
        if (e.slack_team_id !== undefined) {
          t.slack_team_id = e.slack_team_id;
        }
        if (e.is_enterprise_install !== undefined) {
          t.is_enterprise_install = e.is_enterprise_install;
        }
        if (e.trigger !== undefined) {
          t.trigger = e.trigger;
        }
        if (e.creation_method !== undefined) {
          t.creation_method = e.creation_method;
        }
        return t;
      },
      create(e) {
        return kOn.fromPartial(e ?? {});
      },
      fromPartial(e) {
        let t = z4d();
        t.slack_team_id = e.slack_team_id ?? "";
        t.is_enterprise_install = e.is_enterprise_install ?? false;
        t.trigger = e.trigger ?? "";
        t.creation_method = e.creation_method ?? "";
        return t;
      }
    };
    AOn = {
      fromJSON(e) {
        return {
          event_name: ol(e.event_name) ? globalThis.String(e.event_name) : "",
          client_timestamp: ol(e.client_timestamp) ? uji(e.client_timestamp) : undefined,
          model: ol(e.model) ? globalThis.String(e.model) : "",
          session_id: ol(e.session_id) ? globalThis.String(e.session_id) : "",
          user_type: ol(e.user_type) ? globalThis.String(e.user_type) : "",
          betas: ol(e.betas) ? globalThis.String(e.betas) : "",
          env: ol(e.env) ? xOn.fromJSON(e.env) : undefined,
          entrypoint: ol(e.entrypoint) ? globalThis.String(e.entrypoint) : "",
          agent_sdk_version: ol(e.agent_sdk_version) ? globalThis.String(e.agent_sdk_version) : "",
          is_interactive: ol(e.is_interactive) ? globalThis.Boolean(e.is_interactive) : false,
          client_type: ol(e.client_type) ? globalThis.String(e.client_type) : "",
          process: ol(e.process) ? globalThis.String(e.process) : "",
          additional_metadata: ol(e.additional_metadata) ? globalThis.String(e.additional_metadata) : "",
          auth: ol(e.auth) ? vbe.fromJSON(e.auth) : undefined,
          server_timestamp: ol(e.server_timestamp) ? uji(e.server_timestamp) : undefined,
          event_id: ol(e.event_id) ? globalThis.String(e.event_id) : "",
          device_id: ol(e.device_id) ? globalThis.String(e.device_id) : "",
          swe_bench_run_id: ol(e.swe_bench_run_id) ? globalThis.String(e.swe_bench_run_id) : "",
          swe_bench_instance_id: ol(e.swe_bench_instance_id) ? globalThis.String(e.swe_bench_instance_id) : "",
          swe_bench_task_id: ol(e.swe_bench_task_id) ? globalThis.String(e.swe_bench_task_id) : "",
          email: ol(e.email) ? globalThis.String(e.email) : "",
          agent_id: ol(e.agent_id) ? globalThis.String(e.agent_id) : "",
          parent_session_id: ol(e.parent_session_id) ? globalThis.String(e.parent_session_id) : "",
          agent_type: ol(e.agent_type) ? globalThis.String(e.agent_type) : "",
          slack: ol(e.slack) ? kOn.fromJSON(e.slack) : undefined,
          team_name: ol(e.team_name) ? globalThis.String(e.team_name) : "",
          skill_name: ol(e.skill_name) ? globalThis.String(e.skill_name) : "",
          plugin_name: ol(e.plugin_name) ? globalThis.String(e.plugin_name) : "",
          marketplace_name: ol(e.marketplace_name) ? globalThis.String(e.marketplace_name) : "",
          repl_code: ol(e.repl_code) ? globalThis.String(e.repl_code) : "",
          head_sha: ol(e.head_sha) ? globalThis.String(e.head_sha) : ""
        };
      },
      toJSON(e) {
        let t = {};
        if (e.event_name !== undefined) {
          t.event_name = e.event_name;
        }
        if (e.client_timestamp !== undefined) {
          t.client_timestamp = e.client_timestamp.toISOString();
        }
        if (e.model !== undefined) {
          t.model = e.model;
        }
        if (e.session_id !== undefined) {
          t.session_id = e.session_id;
        }
        if (e.user_type !== undefined) {
          t.user_type = e.user_type;
        }
        if (e.betas !== undefined) {
          t.betas = e.betas;
        }
        if (e.env !== undefined) {
          t.env = xOn.toJSON(e.env);
        }
        if (e.entrypoint !== undefined) {
          t.entrypoint = e.entrypoint;
        }
        if (e.agent_sdk_version !== undefined) {
          t.agent_sdk_version = e.agent_sdk_version;
        }
        if (e.is_interactive !== undefined) {
          t.is_interactive = e.is_interactive;
        }
        if (e.client_type !== undefined) {
          t.client_type = e.client_type;
        }
        if (e.process !== undefined) {
          t.process = e.process;
        }
        if (e.additional_metadata !== undefined) {
          t.additional_metadata = e.additional_metadata;
        }
        if (e.auth !== undefined) {
          t.auth = vbe.toJSON(e.auth);
        }
        if (e.server_timestamp !== undefined) {
          t.server_timestamp = e.server_timestamp.toISOString();
        }
        if (e.event_id !== undefined) {
          t.event_id = e.event_id;
        }
        if (e.device_id !== undefined) {
          t.device_id = e.device_id;
        }
        if (e.swe_bench_run_id !== undefined) {
          t.swe_bench_run_id = e.swe_bench_run_id;
        }
        if (e.swe_bench_instance_id !== undefined) {
          t.swe_bench_instance_id = e.swe_bench_instance_id;
        }
        if (e.swe_bench_task_id !== undefined) {
          t.swe_bench_task_id = e.swe_bench_task_id;
        }
        if (e.email !== undefined) {
          t.email = e.email;
        }
        if (e.agent_id !== undefined) {
          t.agent_id = e.agent_id;
        }
        if (e.parent_session_id !== undefined) {
          t.parent_session_id = e.parent_session_id;
        }
        if (e.agent_type !== undefined) {
          t.agent_type = e.agent_type;
        }
        if (e.slack !== undefined) {
          t.slack = kOn.toJSON(e.slack);
        }
        if (e.team_name !== undefined) {
          t.team_name = e.team_name;
        }
        if (e.skill_name !== undefined) {
          t.skill_name = e.skill_name;
        }
        if (e.plugin_name !== undefined) {
          t.plugin_name = e.plugin_name;
        }
        if (e.marketplace_name !== undefined) {
          t.marketplace_name = e.marketplace_name;
        }
        if (e.repl_code !== undefined) {
          t.repl_code = e.repl_code;
        }
        if (e.head_sha !== undefined) {
          t.head_sha = e.head_sha;
        }
        return t;
      },
      create(e) {
        return AOn.fromPartial(e ?? {});
      },
      fromPartial(e) {
        let t = K4d();
        t.event_name = e.event_name ?? "";
        t.client_timestamp = e.client_timestamp ?? undefined;
        t.model = e.model ?? "";
        t.session_id = e.session_id ?? "";
        t.user_type = e.user_type ?? "";
        t.betas = e.betas ?? "";
        t.env = e.env !== undefined && e.env !== null ? xOn.fromPartial(e.env) : undefined;
        t.entrypoint = e.entrypoint ?? "";
        t.agent_sdk_version = e.agent_sdk_version ?? "";
        t.is_interactive = e.is_interactive ?? false;
        t.client_type = e.client_type ?? "";
        t.process = e.process ?? "";
        t.additional_metadata = e.additional_metadata ?? "";
        t.auth = e.auth !== undefined && e.auth !== null ? vbe.fromPartial(e.auth) : undefined;
        t.server_timestamp = e.server_timestamp ?? undefined;
        t.event_id = e.event_id ?? "";
        t.device_id = e.device_id ?? "";
        t.swe_bench_run_id = e.swe_bench_run_id ?? "";
        t.swe_bench_instance_id = e.swe_bench_instance_id ?? "";
        t.swe_bench_task_id = e.swe_bench_task_id ?? "";
        t.email = e.email ?? "";
        t.agent_id = e.agent_id ?? "";
        t.parent_session_id = e.parent_session_id ?? "";
        t.agent_type = e.agent_type ?? "";
        t.slack = e.slack !== undefined && e.slack !== null ? kOn.fromPartial(e.slack) : undefined;
        t.team_name = e.team_name ?? "";
        t.skill_name = e.skill_name ?? "";
        t.plugin_name = e.plugin_name ?? "";
        t.marketplace_name = e.marketplace_name ?? "";
        t.repl_code = e.repl_code ?? "";
        t.head_sha = e.head_sha ?? "";
        return t;
      }
    };
  });
  function J4d() {
    return {
      event_id: "",
      timestamp: undefined,
      experiment_id: "",
      variation_id: 0,
      environment: "",
      user_attributes: "",
      experiment_metadata: "",
      device_id: "",
      auth: undefined,
      session_id: "",
      anonymous_id: "",
      event_metadata_vars: "",
      server_timestamp: undefined
    };
  }
  function X4d(e) {
    let t = (e.seconds || 0) * 1000;
    t += (e.nanos || 0) / 1e6;
    return new globalThis.Date(t);
  }
  function pji(e) {
    if (e instanceof globalThis.Date) {
      return e;
    } else if (typeof e === "string") {
      return new globalThis.Date(e);
    } else {
      return X4d(j2t.fromJSON(e));
    }
  }
  function N8(e) {
    return e !== null && e !== undefined;
  }
  var QJr;
  var mji = __lazy(() => {
    YJr();
    XJr();
    QJr = {
      fromJSON(e) {
        return {
          event_id: N8(e.event_id) ? globalThis.String(e.event_id) : "",
          timestamp: N8(e.timestamp) ? pji(e.timestamp) : undefined,
          experiment_id: N8(e.experiment_id) ? globalThis.String(e.experiment_id) : "",
          variation_id: N8(e.variation_id) ? globalThis.Number(e.variation_id) : 0,
          environment: N8(e.environment) ? globalThis.String(e.environment) : "",
          user_attributes: N8(e.user_attributes) ? globalThis.String(e.user_attributes) : "",
          experiment_metadata: N8(e.experiment_metadata) ? globalThis.String(e.experiment_metadata) : "",
          device_id: N8(e.device_id) ? globalThis.String(e.device_id) : "",
          auth: N8(e.auth) ? vbe.fromJSON(e.auth) : undefined,
          session_id: N8(e.session_id) ? globalThis.String(e.session_id) : "",
          anonymous_id: N8(e.anonymous_id) ? globalThis.String(e.anonymous_id) : "",
          event_metadata_vars: N8(e.event_metadata_vars) ? globalThis.String(e.event_metadata_vars) : "",
          server_timestamp: N8(e.server_timestamp) ? pji(e.server_timestamp) : undefined
        };
      },
      toJSON(e) {
        let t = {};
        if (e.event_id !== undefined) {
          t.event_id = e.event_id;
        }
        if (e.timestamp !== undefined) {
          t.timestamp = e.timestamp.toISOString();
        }
        if (e.experiment_id !== undefined) {
          t.experiment_id = e.experiment_id;
        }
        if (e.variation_id !== undefined) {
          t.variation_id = Math.round(e.variation_id);
        }
        if (e.environment !== undefined) {
          t.environment = e.environment;
        }
        if (e.user_attributes !== undefined) {
          t.user_attributes = e.user_attributes;
        }
        if (e.experiment_metadata !== undefined) {
          t.experiment_metadata = e.experiment_metadata;
        }
        if (e.device_id !== undefined) {
          t.device_id = e.device_id;
        }
        if (e.auth !== undefined) {
          t.auth = vbe.toJSON(e.auth);
        }
        if (e.session_id !== undefined) {
          t.session_id = e.session_id;
        }
        if (e.anonymous_id !== undefined) {
          t.anonymous_id = e.anonymous_id;
        }
        if (e.event_metadata_vars !== undefined) {
          t.event_metadata_vars = e.event_metadata_vars;
        }
        if (e.server_timestamp !== undefined) {
          t.server_timestamp = e.server_timestamp.toISOString();
        }
        return t;
      },
      create(e) {
        return QJr.fromPartial(e ?? {});
      },
      fromPartial(e) {
        let t = J4d();
        t.event_id = e.event_id ?? "";
        t.timestamp = e.timestamp ?? undefined;
        t.experiment_id = e.experiment_id ?? "";
        t.variation_id = e.variation_id ?? 0;
        t.environment = e.environment ?? "";
        t.user_attributes = e.user_attributes ?? "";
        t.experiment_metadata = e.experiment_metadata ?? "";
        t.device_id = e.device_id ?? "";
        t.auth = e.auth !== undefined && e.auth !== null ? vbe.fromPartial(e.auth) : undefined;
        t.session_id = e.session_id ?? "";
        t.anonymous_id = e.anonymous_id ?? "";
        t.event_metadata_vars = e.event_metadata_vars ?? "";
        t.server_timestamp = e.server_timestamp ?? undefined;
        return t;
      }
    };
  });
  function gji() {
    return Me.CLAUDE_CODE_BUBBLEWRAP;
  }
  function Q4d() {
    return IOn ?? false;
  }
  function _ji() {
    return typeof process.getuid === "function" && process.getuid() === 0 && process.env.IS_SANDBOX !== "1" && !Me.CLAUDE_CODE_BUBBLEWRAP;
  }
  function eWd() {
    return POn ?? false;
  }
  function tWd() {
    return false;
  }
  function nWd() {
    return false;
  }
  async function bji() {
    if (Nat !== undefined) {
      return Nat;
    }
    try {
      let e = await getAncestorCommandsAsync(process.pid, 10);
      for (let t of e) {
        let n = t.toLowerCase();
        for (let r of N6) {
          if (n.includes(r)) {
            Nat = r;
            return r;
          }
        }
      }
    } catch {}
    Nat = null;
    return null;
  }
  async function rWd() {
    if (process.env.TERMINAL_EMULATOR === "JetBrains-JediTerm") {
      if (Me.platform !== "darwin") {
        return (await bji()) || "pycharm";
      }
    }
    return Me.terminal;
  }
  function oWd() {
    if (process.env.TERMINAL_EMULATOR === "JetBrains-JediTerm") {
      if (Me.platform !== "darwin") {
        if (Nat !== undefined) {
          return Nat || "pycharm";
        }
        return "pycharm";
      }
    }
    return Me.terminal;
  }
  async function tXr() {
    if (process.env.TERMINAL_EMULATOR === "JetBrains-JediTerm") {
      await bji();
    }
  }
  var fji;
  var hji;
  var IOn;
  var yji;
  var POn;
  var Z4d;
  var eXr = null;
  var Nat;
  var nM;
  var YW = __lazy(() => {
    pr();
    ji();
    Tb();
    fji = require("fs/promises");
    hji = TEr(async () => {
      let {
        code: e
      } = await execFileNoThrow("test", ["-f", "/.dockerenv"]);
      return e === 0;
    });
    yji = TEr(async () => {
      if (!((await hji()) || gji() || process.env.IS_SANDBOX === "1")) {
        IOn = false;
        return false;
      }
      IOn = !(await Me.hasInternetAccess());
      return IOn;
    });
    Z4d = TEr(async () => {
      if (!(await yji())) {
        POn = false;
        return false;
      }
      POn = (await Me.probeInternalNetworkAccess()) === null && !_ji();
      return POn;
    });
    fji.stat("/lib/libc.musl-aarch64.so.1").then(() => {
      eXr = true;
    }, () => {
      eXr = false;
    });
    nM = {
      ...Me,
      terminal: oWd(),
      getIsDocker: hji,
      getIsBubblewrapSandbox: gji,
      getIsContainedNoInternet: yji,
      getIsContainedNoInternetCached: Q4d,
      passesAntDspEnvGate: Z4d,
      passesAntDspEnvGateCached: eWd,
      isRootOutsideDeliberateSandbox: _ji,
      isMuslEnvironment: tWd,
      isAndroidEnvironment: nWd,
      getTerminalWithJetBrainsDetectionAsync: rWd,
      initJetBrainsDetection: tXr
    };
  });
  function ZN(e) {
    if (e === undefined) {
      return;
    }
    if (e.startsWith("repl_main_thread") || e === "sdk") {
      return "main";
    }
    if (e.startsWith("agent:") || e === "hook_agent") {
      return "subagent";
    }
    return "auxiliary";
  }
  function $4e(e) {
    return e === undefined || ZN(e) === "main";
  }
  function nXr(e) {
    let t = e.indexOf(":");
    return t > 0 ? e.slice(0, t) : undefined;
  }
  function Vg(e) {
    if (e?.startsWith("agent:custom:")) {
      return "agent:custom";
    }
    return e;
  }
  function oXr(e, t) {
    Eji.set(e, t);
  }
  function OOn(e, t) {
    if (!Ktt() || kd()) {
      return;
    }
    if (!Number.isFinite(t) || t <= 0) {
      return;
    }
    let n = Lat.get(t);
    if (n && !n.dead) {
      return;
    }
    vji++;
    Lat.set(t, {
      kind: e,
      peakRssBytes: Cji(t) ?? 0,
      dead: false
    });
  }
  function wji(e) {
    let t = Lat.get(e);
    if (t) {
      t.dead = true;
    }
  }
  function sXr() {
    if (Lat.size === 0) {
      return;
    }
    for (let [e, t] of Lat) {
      if (t.dead) {
        continue;
      }
      let n = Cji(e);
      if (n === undefined) {
        t.dead = true;
      } else if (n > t.peakRssBytes) {
        t.peakRssBytes = n;
      }
    }
  }
  function Cji(e) {
    try {
      let t = rXr.readFileSync(`/proc/${e}/statm`, "utf8");
      let n = Number(t.split(" ")[1]);
      return Number.isFinite(n) ? n * iWd() : undefined;
    } catch {
      return;
    }
  }
  function iWd() {
    if (q2t !== undefined) {
      return q2t;
    }
    try {
      let e = rXr.readFileSync("/proc/self/statm", "utf8");
      let t = Number(e.split(" ")[1]);
      q2t = t > 0 ? Math.round(process.memoryUsage().rss / t) : 4096;
    } catch {
      q2t = 4096;
    }
    return q2t;
  }
  function aWd(e) {
    let t = process.memoryUsage();
    let n = {
      uptime_s: Math.round(process.uptime()),
      final_rss_bytes: t.rss,
      final_heap_used_bytes: t.heapUsed,
      final_external_bytes: t.external,
      final_array_buffers_bytes: t.arrayBuffers,
      peak_rss_bytes: Math.max(e.rss, t.rss),
      peak_heap_used_bytes: Math.max(e.heapUsed, t.heapUsed),
      peak_external_bytes: Math.max(e.external, t.external),
      constrained_memory_bytes: process.constrainedMemory?.() || undefined
    };
    for (let [s, i] of Eji) {
      try {
        let a = i();
        if (n[`attr_${s}_entries`] = a.entries, a.bytes !== undefined) {
          n[`attr_${s}_bytes`] = a.bytes;
        }
      } catch {}
    }
    sXr();
    let r = 0;
    let o = {};
    for (let s of Lat.values()) {
      r += s.peakRssBytes;
      o[s.kind] = (o[s.kind] ?? 0) + s.peakRssBytes;
    }
    n.child_count = vji;
    n.child_rss_bytes_total = r;
    for (let s of sWd) {
      if (o[s] !== undefined) {
        n[`child_${s}_rss_bytes`] = o[s];
      }
    }
    return n;
  }
  function cWd(e) {
    if (Tji) {
      return;
    }
    Tji = true;
    try {
      logEvent("tengu_sdk_memory_summary", aWd(e()));
    } catch {}
  }
  function Rji(e) {
    if (Sji) {
      return;
    }
    Sji = true;
    lWd = Ti(() => cWd(e));
  }
  var rXr;
  var Eji;
  var sWd;
  var Lat;
  var vji = 0;
  var q2t;
  var Sji = false;
  var Tji = false;
  var lWd;
  var Fat = __lazy(() => {
    Ot();
    hd();
    $A();
    gn();
    rXr = require("fs");
    Eji = new Map();
    sWd = ["bash_shell", "mcp_stdio", "lsp", "other"];
    Lat = new Map();
  });
  function uWd() {
    let e = getSessionIngressToken();
    if (e !== undefined) {
      return e;
    }
    let t = process.env.CLAUDE_CODE_WEBSOCKET_AUTH_FILE_DESCRIPTOR;
    if (!t) {
      let r = process.env.CLAUDE_SESSION_INGRESS_TOKEN_FILE ?? Swn;
      let o = G1t(r, "session ingress token");
      setSessionIngressToken(o);
      return o;
    }
    let n = parseInt(t, 10);
    if (Number.isNaN(n)) {
      logForDebugging(`CLAUDE_CODE_WEBSOCKET_AUTH_FILE_DESCRIPTOR must be a valid file descriptor number, got: ${t}`, {
        level: "error"
      });
      setSessionIngressToken(null);
      return null;
    }
    try {
      let r = `/proc/self/fd/${n}`;
      let o = pnt(r, {
        maxBytes: 65536
      }).trim();
      if (!o) {
        logForDebugging("File descriptor contained empty token", {
          level: "error"
        });
        setSessionIngressToken(null);
        return null;
      }
      logForDebugging(`Successfully read token from file descriptor ${n}`);
      setSessionIngressToken(o);
      a3r(Swn, o, "session ingress token");
      return o;
    } catch (r) {
      logForDebugging(`Failed to read token from file descriptor ${n}: ${he(r)}`, {
        level: "error"
      });
      let o = process.env.CLAUDE_SESSION_INGRESS_TOKEN_FILE ?? Swn;
      let s = G1t(o, "session ingress token");
      setSessionIngressToken(s);
      return s;
    }
  }
  function cT() {
    let e = process.env.CLAUDE_CODE_SESSION_ACCESS_TOKEN;
    if (e) {
      return e;
    }
    return uWd();
  }
  function CIe() {
    let e = cT();
    if (!e) {
      return {};
    }
    if (e.startsWith("sk-ant-sid")) {
      let t = {
        Cookie: `sessionKey=${e}`
      };
      let n = process.env.CLAUDE_CODE_ORGANIZATION_UUID;
      if (n) {
        t["X-Organization-Uuid"] = n;
      }
      return t;
    }
    return {
      Authorization: `Bearer ${e}`
    };
  }
  function xji(e) {
    process.env.CLAUDE_CODE_SESSION_ACCESS_TOKEN = e;
  }
  var e1 = __lazy(() => {
    at();
    Twn();
    je();
    dt();
    Zl();
  });
  var jce = {};