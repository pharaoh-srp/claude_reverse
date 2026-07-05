  class JCo {
    _spanContext;
    kind;
    parentSpanContext;
    attributes = {};
    links = [];
    events = [];
    startTime;
    resource;
    instrumentationScope;
    _droppedAttributesCount = 0;
    _droppedEventsCount = 0;
    _droppedLinksCount = 0;
    name;
    status = {
      code: A9.SpanStatusCode.UNSET
    };
    endTime = [0, 0];
    _ended = false;
    _duration = [-1, -1];
    _spanProcessor;
    _spanLimits;
    _attributeValueLengthLimit;
    _performanceStartTime;
    _performanceOffset;
    _startTimeProvided;
    constructor(e) {
      let t = Date.now();
      if (this._spanContext = e.spanContext, this._performanceStartTime = Bw.otperformance.now(), this._performanceOffset = t - (this._performanceStartTime + Bw.getTimeOrigin()), this._startTimeProvided = e.startTime != null, this._spanLimits = e.spanLimits, this._attributeValueLengthLimit = this._spanLimits.attributeValueLengthLimit || 0, this._spanProcessor = e.spanProcessor, this.name = e.name, this.parentSpanContext = e.parentSpanContext, this.kind = e.kind, this.links = e.links || [], this.startTime = this._getTime(e.startTime ?? t), this.resource = e.resource, this.instrumentationScope = e.scope, e.attributes != null) {
        this.setAttributes(e.attributes);
      }
      this._spanProcessor.onStart(this, e.context);
    }
    spanContext() {
      return this._spanContext;
    }
    setAttribute(e, t) {
      if (t == null || this._isSpanEnded()) {
        return this;
      }
      if (e.length === 0) {
        A9.diag.warn(`Invalid attribute key: ${e}`);
        return this;
      }
      if (!Bw.isAttributeValue(t)) {
        A9.diag.warn(`Invalid attribute value set for key: ${e}`);
        return this;
      }
      let {
        attributeCountLimit: n
      } = this._spanLimits;
      if (n !== undefined && Object.keys(this.attributes).length >= n && !Object.prototype.hasOwnProperty.call(this.attributes, e)) {
        this._droppedAttributesCount++;
        return this;
      }
      this.attributes[e] = this._truncateToSize(t);
      return this;
    }
    setAttributes(e) {
      for (let [t, n] of Object.entries(e)) {
        this.setAttribute(t, n);
      }
      return this;
    }
    addEvent(e, t, n) {
      if (this._isSpanEnded()) {
        return this;
      }
      let {
        eventCountLimit: r
      } = this._spanLimits;
      if (r === 0) {
        A9.diag.warn("No events allowed.");
        this._droppedEventsCount++;
        return this;
      }
      if (r !== undefined && this.events.length >= r) {
        if (this._droppedEventsCount === 0) {
          A9.diag.debug("Dropping extra events.");
        }
        this.events.shift();
        this._droppedEventsCount++;
      }
      if (Bw.isTimeInput(t)) {
        if (!Bw.isTimeInput(n)) {
          n = t;
        }
        t = undefined;
      }
      let o = Bw.sanitizeAttributes(t);
      this.events.push({
        name: e,
        attributes: o,
        time: this._getTime(n),
        droppedAttributesCount: 0
      });
      return this;
    }
    addLink(e) {
      this.links.push(e);
      return this;
    }
    addLinks(e) {
      this.links.push(...e);
      return this;
    }
    setStatus(e) {
      if (this._isSpanEnded()) {
        return this;
      }
      if (this.status = {
        ...e
      }, this.status.message != null && typeof e.message !== "string") {
        A9.diag.warn(`Dropping invalid status.message of type '${typeof e.message}', expected 'string'`);
        delete this.status.message;
      }
      return this;
    }
    updateName(e) {
      if (this._isSpanEnded()) {
        return this;
      }
      this.name = e;
      return this;
    }
    end(e) {
      if (this._isSpanEnded()) {
        A9.diag.error(`${this.name} ${this._spanContext.traceId}-${this._spanContext.spanId} - You can only call end() on a span once.`);
        return;
      }
      if (this._ended = true, this.endTime = this._getTime(e), this._duration = Bw.hrTimeDuration(this.startTime, this.endTime), this._duration[0] < 0) {
        A9.diag.warn("Inconsistent start and end time, startTime > endTime. Setting span duration to 0ms.", this.startTime, this.endTime);
        this.endTime = this.startTime.slice();
        this._duration = [0, 0];
      }
      if (this._droppedEventsCount > 0) {
        A9.diag.warn(`Dropped ${this._droppedEventsCount} events because eventCountLimit reached`);
      }
      this._spanProcessor.onEnd(this);
    }
    _getTime(e) {
      if (typeof e === "number" && e <= Bw.otperformance.now()) {
        return Bw.hrTime(e + this._performanceOffset);
      }
      if (typeof e === "number") {
        return Bw.millisToHrTime(e);
      }
      if (e instanceof Date) {
        return Bw.millisToHrTime(e.getTime());
      }
      if (Bw.isTimeInputHrTime(e)) {
        return e;
      }
      if (this._startTimeProvided) {
        return Bw.millisToHrTime(Date.now());
      }
      let t = Bw.otperformance.now() - this._performanceStartTime;
      return Bw.addHrTimes(this.startTime, Bw.millisToHrTime(t));
    }
    isRecording() {
      return this._ended === false;
    }
    recordException(e, t) {
      let n = {};
      if (typeof e === "string") {
        n[$pe.ATTR_EXCEPTION_MESSAGE] = e;
      } else if (e) {
        if (e.code) {
          n[$pe.ATTR_EXCEPTION_TYPE] = e.code.toString();
        } else if (e.name) {
          n[$pe.ATTR_EXCEPTION_TYPE] = e.name;
        }
        if (e.message) {
          n[$pe.ATTR_EXCEPTION_MESSAGE] = e.message;
        }
        if (e.stack) {
          n[$pe.ATTR_EXCEPTION_STACKTRACE] = e.stack;
        }
      }
      if (n[$pe.ATTR_EXCEPTION_TYPE] || n[$pe.ATTR_EXCEPTION_MESSAGE]) {
        this.addEvent("exception", n, t);
      } else {
        A9.diag.warn(`Failed to record an exception ${e}`);
      }
    }
    get duration() {
      return this._duration;
    }
    get ended() {
      return this._ended;
    }
    get droppedAttributesCount() {
      return this._droppedAttributesCount;
    }
    get droppedEventsCount() {
      return this._droppedEventsCount;
    }
    get droppedLinksCount() {
      return this._droppedLinksCount;
    }
    _isSpanEnded() {
      if (this._ended) {
        let e = Error(`Operation attempted on ended Span {traceId: ${this._spanContext.traceId}, spanId: ${this._spanContext.spanId}}`);
        A9.diag.warn(`Cannot execute the operation on ended Span {traceId: ${this._spanContext.traceId}, spanId: ${this._spanContext.spanId}}`, e);
      }
      return this._ended;
    }
    _truncateToLimitUtil(e, t) {
      if (e.length <= t) {
        return e;
      }
      return e.substring(0, t);
    }
    _truncateToSize(e) {
      let t = this._attributeValueLengthLimit;
      if (t <= 0) {
        A9.diag.warn(`Attribute value limit must be positive, got ${t}`);
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
  }
  var A9;
  var Bw;
  var $pe;
  var x7a = __lazy(() => {
    A9 = __toESM(Ji(), 1);
    Bw = __toESM(Gg(), 1);
    $pe = __toESM(Hne(), 1);
  });
  var WEe;
  var s8n = __lazy(() => {
    (function (e) {
      e[e.NOT_RECORD = 0] = "NOT_RECORD";
      e[e.RECORD = 1] = "RECORD";
      e[e.RECORD_AND_SAMPLED = 2] = "RECORD_AND_SAMPLED";
    })(WEe || (WEe = {}));
  });
  class nVe {
    shouldSample() {
      return {
        decision: WEe.NOT_RECORD
      };
    }
    toString() {
      return "AlwaysOffSampler";
    }
  }
  var XCo = __lazy(() => {
    s8n();
  });
  class GEe {
    shouldSample() {
      return {
        decision: WEe.RECORD_AND_SAMPLED
      };
    }
    toString() {
      return "AlwaysOnSampler";
    }
  }
  var QCo = __lazy(() => {
    s8n();
  });
  class iyt {
    _root;
    _remoteParentSampled;
    _remoteParentNotSampled;
    _localParentSampled;
    _localParentNotSampled;
    constructor(e) {
      if (this._root = e.root, !this._root) {
        k7a.globalErrorHandler(Error("ParentBasedSampler must have a root sampler configured"));
        this._root = new GEe();
      }
      this._remoteParentSampled = e.remoteParentSampled ?? new GEe();
      this._remoteParentNotSampled = e.remoteParentNotSampled ?? new nVe();
      this._localParentSampled = e.localParentSampled ?? new GEe();
      this._localParentNotSampled = e.localParentNotSampled ?? new nVe();
    }
    shouldSample(e, t, n, r, o, s) {
      let i = rVe.trace.getSpanContext(e);
      if (!i || !rVe.isSpanContextValid(i)) {
        return this._root.shouldSample(e, t, n, r, o, s);
      }
      if (i.isRemote) {
        if (i.traceFlags & rVe.TraceFlags.SAMPLED) {
          return this._remoteParentSampled.shouldSample(e, t, n, r, o, s);
        }
        return this._remoteParentNotSampled.shouldSample(e, t, n, r, o, s);
      }
      if (i.traceFlags & rVe.TraceFlags.SAMPLED) {
        return this._localParentSampled.shouldSample(e, t, n, r, o, s);
      }
      return this._localParentNotSampled.shouldSample(e, t, n, r, o, s);
    }
    toString() {
      return `ParentBased{root=${this._root.toString()}, remoteParentSampled=${this._remoteParentSampled.toString()}, remoteParentNotSampled=${this._remoteParentNotSampled.toString()}, localParentSampled=${this._localParentSampled.toString()}, localParentNotSampled=${this._localParentNotSampled.toString()}}`;
    }
  }
  var rVe;
  var k7a;
  var A7a = __lazy(() => {
    XCo();
    QCo();
    rVe = __toESM(Ji(), 1);
    k7a = __toESM(Gg(), 1);
  });
  class i8n {
    _ratio;
    _upperBound;
    constructor(e = 0) {
      this._ratio = e;
      this._ratio = this._normalize(e);
      this._upperBound = Math.floor(this._ratio * 4294967295);
    }
    shouldSample(e, t) {
      return {
        decision: I7a.isValidTraceId(t) && this._accumulate(t) < this._upperBound ? WEe.RECORD_AND_SAMPLED : WEe.NOT_RECORD
      };
    }
    toString() {
      return `TraceIdRatioBased{${this._ratio}}`;
    }
    _normalize(e) {
      if (typeof e !== "number" || isNaN(e)) {
        return 0;
      }
      return e >= 1 ? 1 : e <= 0 ? 0 : e;
    }
    _accumulate(e) {
      let t = 0;
      for (let n = 0; n < e.length / 8; n++) {
        let r = n * 8;
        let o = parseInt(e.slice(r, r + 8), 16);
        t = (t ^ o) >>> 0;
      }
      return t;
    }
  }
  var I7a;
  var P7a = __lazy(() => {
    s8n();
    I7a = __toESM(Ji(), 1);
  });
  function c8n() {
    return {
      sampler: ZCo(),
      forceFlushTimeoutMillis: 30000,
      generalLimits: {
        attributeValueLengthLimit: AQ.getNumberFromEnv("OTEL_ATTRIBUTE_VALUE_LENGTH_LIMIT") ?? 1 / 0,
        attributeCountLimit: AQ.getNumberFromEnv("OTEL_ATTRIBUTE_COUNT_LIMIT") ?? 128
      },
      spanLimits: {
        attributeValueLengthLimit: AQ.getNumberFromEnv("OTEL_SPAN_ATTRIBUTE_VALUE_LENGTH_LIMIT") ?? 1 / 0,
        attributeCountLimit: AQ.getNumberFromEnv("OTEL_SPAN_ATTRIBUTE_COUNT_LIMIT") ?? 128,
        linkCountLimit: AQ.getNumberFromEnv("OTEL_SPAN_LINK_COUNT_LIMIT") ?? 128,
        eventCountLimit: AQ.getNumberFromEnv("OTEL_SPAN_EVENT_COUNT_LIMIT") ?? 128,
        attributePerEventCountLimit: AQ.getNumberFromEnv("OTEL_SPAN_ATTRIBUTE_PER_EVENT_COUNT_LIMIT") ?? 128,
        attributePerLinkCountLimit: AQ.getNumberFromEnv("OTEL_SPAN_ATTRIBUTE_PER_LINK_COUNT_LIMIT") ?? 128
      }
    };
  }
  function ZCo() {
    let e = AQ.getStringFromEnv("OTEL_TRACES_SAMPLER") ?? Hpe.ParentBasedAlwaysOn;
    switch (e) {
      case Hpe.AlwaysOn:
        return new GEe();
      case Hpe.AlwaysOff:
        return new nVe();
      case Hpe.ParentBasedAlwaysOn:
        return new iyt({
          root: new GEe()
        });
      case Hpe.ParentBasedAlwaysOff:
        return new iyt({
          root: new nVe()
        });
      case Hpe.TraceIdRatio:
        return new i8n(O7a());
      case Hpe.ParentBasedTraceIdRatio:
        return new iyt({
          root: new i8n(O7a())
        });
      default:
        l8n.diag.error(`OTEL_TRACES_SAMPLER value "${e}" invalid, defaulting to "${Hpe.ParentBasedAlwaysOn}".`);
        return new iyt({
          root: new GEe()
        });
    }
  }
  function O7a() {
    let e = AQ.getNumberFromEnv("OTEL_TRACES_SAMPLER_ARG");
    if (e == null) {
      l8n.diag.error(`OTEL_TRACES_SAMPLER_ARG is blank, defaulting to ${1}.`);
      return 1;
    }
    if (e < 0 || e > 1) {
      l8n.diag.error(`OTEL_TRACES_SAMPLER_ARG=${e} was given, but it is out of range ([0..1]), defaulting to ${1}.`);
      return 1;
    }
    return e;
  }
  var l8n;
  var AQ;
  var Hpe;
  var eRo = __lazy(() => {
    XCo();
    QCo();
    A7a();
    P7a();
    l8n = __toESM(Ji(), 1);
    AQ = __toESM(Gg(), 1);
    (function (e) {
      e.AlwaysOff = "always_off";
      e.AlwaysOn = "always_on";
      e.ParentBasedAlwaysOff = "parentbased_always_off";
      e.ParentBasedAlwaysOn = "parentbased_always_on";
      e.ParentBasedTraceIdRatio = "parentbased_traceidratio";
      e.TraceIdRatio = "traceidratio";
    })(Hpe || (Hpe = {}));
  });
  function D7a(e) {
    let t = {
      sampler: ZCo()
    };
    let n = c8n();
    let r = Object.assign({}, n, t, e);
    r.generalLimits = Object.assign({}, n.generalLimits, e.generalLimits || {});
    r.spanLimits = Object.assign({}, n.spanLimits, e.spanLimits || {});
    return r;
  }
  function M7a(e) {
    let t = Object.assign({}, e.spanLimits);
    t.attributeCountLimit = e.spanLimits?.attributeCountLimit ?? e.generalLimits?.attributeCountLimit ?? I8t.getNumberFromEnv("OTEL_SPAN_ATTRIBUTE_COUNT_LIMIT") ?? I8t.getNumberFromEnv("OTEL_ATTRIBUTE_COUNT_LIMIT") ?? 128;
    t.attributeValueLengthLimit = e.spanLimits?.attributeValueLengthLimit ?? e.generalLimits?.attributeValueLengthLimit ?? I8t.getNumberFromEnv("OTEL_SPAN_ATTRIBUTE_VALUE_LENGTH_LIMIT") ?? I8t.getNumberFromEnv("OTEL_ATTRIBUTE_VALUE_LENGTH_LIMIT") ?? AKp;
    return Object.assign({}, e, {
      spanLimits: t
    });
  }
  var I8t;
  var AKp = 1 / 0;
  var tRo = __lazy(() => {
    eRo();
    I8t = __toESM(Gg(), 1);
  });
  class nRo {
    _exporter;
    _maxExportBatchSize;
    _maxQueueSize;
    _scheduledDelayMillis;
    _exportTimeoutMillis;
    _isExporting = false;
    _finishedSpans = [];
    _timer;
    _shutdownOnce;
    _droppedSpansCount = 0;
    constructor(e, t) {
      if (this._exporter = e, this._maxExportBatchSize = typeof t?.maxExportBatchSize === "number" ? t.maxExportBatchSize : I9.getNumberFromEnv("OTEL_BSP_MAX_EXPORT_BATCH_SIZE") ?? 512, this._maxQueueSize = typeof t?.maxQueueSize === "number" ? t.maxQueueSize : I9.getNumberFromEnv("OTEL_BSP_MAX_QUEUE_SIZE") ?? 2048, this._scheduledDelayMillis = typeof t?.scheduledDelayMillis === "number" ? t.scheduledDelayMillis : I9.getNumberFromEnv("OTEL_BSP_SCHEDULE_DELAY") ?? 5000, this._exportTimeoutMillis = typeof t?.exportTimeoutMillis === "number" ? t.exportTimeoutMillis : I9.getNumberFromEnv("OTEL_BSP_EXPORT_TIMEOUT") ?? 30000, this._shutdownOnce = new I9.BindOnceFuture(this._shutdown, this), this._maxExportBatchSize > this._maxQueueSize) {
        VEe.diag.warn("BatchSpanProcessor: maxExportBatchSize must be smaller or equal to maxQueueSize, setting maxExportBatchSize to match maxQueueSize");
        this._maxExportBatchSize = this._maxQueueSize;
      }
    }
    forceFlush() {
      if (this._shutdownOnce.isCalled) {
        return this._shutdownOnce.promise;
      }
      return this._flushAll();
    }
    onStart(e, t) {}
    onEnd(e) {
      if (this._shutdownOnce.isCalled) {
        return;
      }
      if ((e.spanContext().traceFlags & VEe.TraceFlags.SAMPLED) === 0) {
        return;
      }
      this._addToBuffer(e);
    }
    shutdown() {
      return this._shutdownOnce.call();
    }
    _shutdown() {
      return Promise.resolve().then(() => this.onShutdown()).then(() => this._flushAll()).then(() => this._exporter.shutdown());
    }
    _addToBuffer(e) {
      if (this._finishedSpans.length >= this._maxQueueSize) {
        if (this._droppedSpansCount === 0) {
          VEe.diag.debug("maxQueueSize reached, dropping spans");
        }
        this._droppedSpansCount++;
        return;
      }
      if (this._droppedSpansCount > 0) {
        VEe.diag.warn(`Dropped ${this._droppedSpansCount} spans because maxQueueSize reached`);
        this._droppedSpansCount = 0;
      }
      this._finishedSpans.push(e);
      this._maybeStartTimer();
    }
    _flushAll() {
      return new Promise((e, t) => {
        let n = [];
        let r = Math.ceil(this._finishedSpans.length / this._maxExportBatchSize);
        for (let o = 0, s = r; o < s; o++) {
          n.push(this._flushOneBatch());
        }
        Promise.all(n).then(() => {
          e();
        }).catch(t);
      });
    }
    _flushOneBatch() {
      if (this._clearTimer(), this._finishedSpans.length === 0) {
        return Promise.resolve();
      }
      return new Promise((e, t) => {
        let n = setTimeout(() => {
          t(Error("Timeout"));
        }, this._exportTimeoutMillis);
        VEe.context.with(I9.suppressTracing(VEe.context.active()), () => {
          let r;
          if (this._finishedSpans.length <= this._maxExportBatchSize) {
            r = this._finishedSpans;
            this._finishedSpans = [];
          } else {
            r = this._finishedSpans.splice(0, this._maxExportBatchSize);
          }
          let o = () => this._exporter.export(r, i => {
            if (clearTimeout(n), i.code === I9.ExportResultCode.SUCCESS) {
              e();
            } else {
              t(i.error ?? Error("BatchSpanProcessor: span export failed"));
            }
          });
          let s = null;
          for (let i = 0, a = r.length; i < a; i++) {
            let l = r[i];
            if (l.resource.asyncAttributesPending && l.resource.waitForAsyncAttributes) {
              s ??= [];
              s.push(l.resource.waitForAsyncAttributes());
            }
          }
          if (s === null) {
            o();
          } else {
            Promise.all(s).then(o, i => {
              I9.globalErrorHandler(i);
              t(i);
            });
          }
        });
      });
    }
    _maybeStartTimer() {
      if (this._isExporting) {
        return;
      }
      let e = () => {
        this._isExporting = true;
        this._flushOneBatch().finally(() => {
          if (this._isExporting = false, this._finishedSpans.length > 0) {
            this._clearTimer();
            this._maybeStartTimer();
          }
        }).catch(t => {
          this._isExporting = false;
          I9.globalErrorHandler(t);
        });
      };
      if (this._finishedSpans.length >= this._maxExportBatchSize) {
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
  }
  var VEe;
  var I9;
  var N7a = __lazy(() => {
    VEe = __toESM(Ji(), 1);
    I9 = __toESM(Gg(), 1);
  });
  var oVe;
  var L7a = __lazy(() => {
    N7a();
    oVe = class oVe extends nRo {
      onShutdown() {}
    };
  });
  class ayt {
    generateTraceId = F7a(16);
    generateSpanId = F7a(8);
  }
  function F7a(e) {
    return function () {
      for (let n = 0; n < e / 4; n++) {
        u8n.writeUInt32BE(Math.random() * 4294967296 >>> 0, n * 4);
      }
      for (let n = 0; n < e; n++) {
        if (u8n[n] > 0) {
          break;
        } else if (n === e - 1) {
          u8n[e - 1] = 1;
        }
      }
      return u8n.toString("hex", 0, e);
    };
  }
  var u8n;
  var U7a = __lazy(() => {
    u8n = Buffer.allocUnsafe(16);
  });
  var B7a = __lazy(() => {
    L7a();
    U7a();
  });
  var rRo = __lazy(() => {
    B7a();
  });
  class oRo {
    _sampler;
    _generalLimits;
    _spanLimits;
    _idGenerator;
    instrumentationScope;
    _resource;
    _spanProcessor;
    constructor(e, t, n, r) {
      let o = D7a(t);
      this._sampler = o.sampler;
      this._generalLimits = o.generalLimits;
      this._spanLimits = o.spanLimits;
      this._idGenerator = t.idGenerator || new ayt();
      this._resource = n;
      this._spanProcessor = r;
      this.instrumentationScope = e;
    }
    startSpan(e, t = {}, n = Px.context.active()) {
      if (t.root) {
        n = Px.trace.deleteSpan(n);
      }
      let r = Px.trace.getSpan(n);
      if (lyt.isTracingSuppressed(n)) {
        Px.diag.debug("Instrumentation suppressed, returning Noop Span");
        return Px.trace.wrapSpanContext(Px.INVALID_SPAN_CONTEXT);
      }
      let o = r?.spanContext();
      let s = this._idGenerator.generateSpanId();
      let i;
      let a;
      let l;
      if (!o || !Px.trace.isSpanContextValid(o)) {
        a = this._idGenerator.generateTraceId();
      } else {
        a = o.traceId;
        l = o.traceState;
        i = o;
      }
      let c = t.kind ?? Px.SpanKind.INTERNAL;
      let u = (t.links ?? []).map(y => ({
        context: y.context,
        attributes: lyt.sanitizeAttributes(y.attributes)
      }));
      let d = lyt.sanitizeAttributes(t.attributes);
      let p = this._sampler.shouldSample(n, a, e, c, d, u);
      l = p.traceState ?? l;
      let m = p.decision === Px.SamplingDecision.RECORD_AND_SAMPLED ? Px.TraceFlags.SAMPLED : Px.TraceFlags.NONE;
      let f = {
        traceId: a,
        spanId: s,
        traceFlags: m,
        traceState: l
      };
      if (p.decision === Px.SamplingDecision.NOT_RECORD) {
        Px.diag.debug("Recording is off, propagating context in a non-recording span");
        return Px.trace.wrapSpanContext(f);
      }
      let h = lyt.sanitizeAttributes(Object.assign(d, p.attributes));
      return new JCo({
        resource: this._resource,
        scope: this.instrumentationScope,
        context: n,
        spanContext: f,
        name: e,
        kind: c,
        links: u,
        parentSpanContext: i,
        attributes: h,
        startTime: t.startTime,
        spanProcessor: this._spanProcessor,
        spanLimits: this._spanLimits
      });
    }
    startActiveSpan(e, t, n, r) {
      let o;
      let s;
      let i;
      if (arguments.length < 2) {
        return;
      } else if (arguments.length === 2) {
        i = t;
      } else if (arguments.length === 3) {
        o = t;
        i = n;
      } else {
        o = t;
        s = n;
        i = r;
      }
      let a = s ?? Px.context.active();
      let l = this.startSpan(e, o, a);
      let c = Px.trace.setSpan(a, l);
      return Px.context.with(c, i, undefined, l);
    }
    getGeneralLimits() {
      return this._generalLimits;
    }
    getSpanLimits() {
      return this._spanLimits;
    }
  }
  var Px;
  var lyt;
  var $7a = __lazy(() => {
    x7a();
    tRo();
    rRo();
    Px = __toESM(Ji(), 1);
    lyt = __toESM(Gg(), 1);
  });
  class sRo {
    _spanProcessors;
    constructor(e) {
      this._spanProcessors = e;
    }
    forceFlush() {
      let e = [];
      for (let t of this._spanProcessors) {
        e.push(t.forceFlush());
      }
      return new Promise(t => {
        Promise.all(e).then(() => {
          t();
        }).catch(n => {
          H7a.globalErrorHandler(n || Error("MultiSpanProcessor: forceFlush failed"));
          t();
        });
      });
    }
    onStart(e, t) {
      for (let n of this._spanProcessors) {
        n.onStart(e, t);
      }
    }
    onEnd(e) {
      for (let t of this._spanProcessors) {
        t.onEnd(e);
      }
    }
    shutdown() {
      let e = [];
      for (let t of this._spanProcessors) {
        e.push(t.shutdown());
      }
      return new Promise((t, n) => {
        Promise.all(e).then(() => {
          t();
        }, n);
      });
    }
  }
  var H7a;
  var j7a = __lazy(() => {
    H7a = __toESM(Gg(), 1);
  });
  class P8t {
    _config;
    _tracers = new Map();
    _resource;
    _activeSpanProcessor;
    constructor(e = {}) {
      let t = q7a.merge({}, c8n(), M7a(e));
      this._resource = t.resource ?? W7a.defaultResource();
      this._config = Object.assign({}, t, {
        resource: this._resource
      });
      let n = [];
      if (e.spanProcessors?.length) {
        n.push(...e.spanProcessors);
      }
      this._activeSpanProcessor = new sRo(n);
    }
    getTracer(e, t, n) {
      let r = `${e}@${t || ""}:${n?.schemaUrl || ""}`;
      if (!this._tracers.vZc(r)) {
        this._tracers.set(r, new oRo({
          name: e,
          version: t,
          schemaUrl: n?.schemaUrl
        }, this._config, this._resource, this._activeSpanProcessor));
      }
      return this._tracers.get(r);
    }
    forceFlush() {
      let e = this._config.forceFlushTimeoutMillis;
      let t = this._activeSpanProcessor._spanProcessors.map(n => new Promise(r => {
        let o;
        let s = setTimeout(() => {
          r(Error(`Span processor did not completed within timeout period of ${e} ms`));
          o = sVe.timeout;
        }, e);
        n.forceFlush().then(() => {
          if (clearTimeout(s), o !== sVe.timeout) {
            o = sVe.resolved;
            r(o);
          }
        }).catch(i => {
          clearTimeout(s);
          o = sVe.error;
          r(i);
        });
      }));
      return new Promise((n, r) => {
        Promise.all(t).then(o => {
          let s = o.filter(i => i !== sVe.resolved);
          if (s.length > 0) {
            r(s);
          } else {
            n();
          }
        }).catch(o => r([o]));
      });
    }
    shutdown() {
      return this._activeSpanProcessor.shutdown();
    }
  }
  var q7a;
  var W7a;
  var sVe;
  var G7a = __lazy(() => {
    $7a();
    eRo();
    j7a();
    tRo();
    q7a = __toESM(Gg(), 1);
    W7a = __toESM(Oat(), 1);
    (function (e) {
      e[e.resolved = 0] = "resolved";
      e[e.timeout = 1] = "timeout";
      e[e.error = 2] = "error";
      e[e.unresolved = 3] = "unresolved";
    })(sVe || (sVe = {}));
  });
  class d8n {
    export(e, t) {
      return this._sendSpans(e, t);
    }
    shutdown() {
      this._sendSpans([]);
      return this.forceFlush();
    }
    forceFlush() {
      return Promise.resolve();
    }
    _exportInfo(e) {
      return {
        resource: {
          attributes: e.resource.attributes
        },
        instrumentationScope: e.instrumentationScope,
        traceId: e.spanContext().traceId,
        parentSpanContext: e.parentSpanContext,
        traceState: e.spanContext().traceState?.serialize(),
        name: e.name,
        id: e.spanContext().spanId,
        kind: e.kind,
        timestamp: O8t.hrTimeToMicroseconds(e.startTime),
        duration: O8t.hrTimeToMicroseconds(e.duration),
        attributes: e.attributes,
        status: e.status,
        events: e.events,
        links: e.links
      };
    }
    _sendSpans(e, t) {
      for (let n of e) {
        console.dir(this._exportInfo(n), {
          depth: 3
        });
      }
      if (t) {
        return t({
          code: O8t.ExportResultCode.SUCCESS
        });
      }
    }
  }
  var O8t;
  var V7a = __lazy(() => {
    O8t = __toESM(Gg(), 1);
  });
  var z7a = __lazy(() => {
    G7a();
    rRo();
    V7a();
  });
  async function BKp() {
    let e = await _s.get("/api/claude_code/organizations/metrics_enabled", {
      auth: "async",
      timeout: 5000,
      bypassEssentialTrafficOnly: true
    });
    if (!e.ok) {
      throw Error(e.reason === "no-auth" ? `Auth error: ${e.detail}` : `metrics_enabled unavailable: ${e.reason}`);
    }
    return e.data;
  }
  async function $Kp() {
    try {
      let e = await withOAuth401Retry(BKp, {
        also403Revoked: true
      });
      logForDebugging(`Metrics opt-out API response: enabled=${e.metrics_logging_enabled}`);
      Pe("api_metrics_opt_out_check");
      return {
        enabled: e.metrics_logging_enabled,
        hasError: false
      };
    } catch (e) {
      logForDebugging(`Failed to check metrics opt-out status: ${he(e)}`, {
        level: "error"
      });
      Ae("api_metrics_opt_out_check", "request_failed");
      return {
        enabled: false,
        hasError: true
      };
    }
  }
  async function K7a() {
    let e = await HKp();
    if (e.hasError) {
      return e;
    }
    let t = getGlobalConfig().metricsStatusCache;
    if (t !== undefined && t.enabled === e.enabled && Date.now() - t.timestamp < 86400000) {
      return e;
    }
    saveGlobalConfig(r => ({
      ...r,
      metricsStatusCache: {
        enabled: e.enabled,
        timestamp: Date.now()
      }
    }));
    return e;
  }
  async function J7a() {
    if (isClaudeAISubscriber() && !hasProfileScope()) {
      return {
        enabled: false,
        hasError: false
      };
    }
    let e = getGlobalConfig().metricsStatusCache;
    if (e) {
      if (Date.now() - e.timestamp > 86400000) {
        K7a().catch(Oe);
      }
      return {
        enabled: e.enabled,
        hasError: false
      };
    }
    return K7a();
  }
  var HKp;
  var X7a = __lazy(() => {
    no();
    je();
    dt();
    YA();
    Rn();
    nW();
    ln();
    bg();
    HKp = vye($Kp, 3600000);
  });
  class aRo {
    endpoint;
    timeout;
    pendingExports = [];
    isShutdown = false;
    constructor(e = {}) {
      let t = `${getOauthConfig().BASE_API_URL}/api/claude_code/metrics`;
      this.endpoint = t;
      this.timeout = e.timeout || 5000;
    }
    async export(e, t) {
      if (this.isShutdown) {
        t({
          code: iVe.ExportResultCode.FAILED,
          error: Error("Exporter has been shutdown")
        });
        return;
      }
      let n = this.doExport(e, t);
      this.pendingExports.push(n);
      n.finally(() => {
        let r = this.pendingExports.indexOf(n);
        if (r > -1) {
          this.pendingExports.splice(r, 1);
        }
      });
    }
    async doExport(e, t) {
      try {
        if (!(checkHasTrustDialogAccepted() || getIsNonInteractiveSession())) {
          logForDebugging("BigQuery metrics export: trust not established, skipping");
          t({
            code: iVe.ExportResultCode.SUCCESS
          });
          return;
        }
        if (!(await J7a()).enabled) {
          logForDebugging("Metrics export disabled by organization setting");
          t({
            code: iVe.ExportResultCode.SUCCESS
          });
          return;
        }
        let o = this.transformMetricsForInternal(e);
        let s = getAuthHeaders();
        if (s.error) {
          logForDebugging(`Metrics export failed: ${s.error}`);
          t({
            code: iVe.ExportResultCode.FAILED,
            error: Error(s.error)
          });
          return;
        }
        let i = {
          "Content-Type": "application/json",
          "User-Agent": dg(),
          ...s.headers
        };
        let a = await NP.post(this.endpoint, o, {
          timeout: this.timeout,
          headers: i
        });
        logForDebugging("BigQuery metrics exported successfully");
        logForDebugging(`BigQuery API Response: ${De(a.data, null, 2)}`);
        t({
          code: iVe.ExportResultCode.SUCCESS
        });
      } catch (n) {
        logForDebugging(`BigQuery metrics export failed: ${he(n)}`, {
          level: "error"
        });
        t({
          code: iVe.ExportResultCode.FAILED,
          error: sr(n)
        });
      }
    }
    transformMetricsForInternal(e) {
      let t = e.resource.attributes;
      let n = {
        "service.name": t["service.name"] || "claude-code",
        "service.version": t["service.version"] || "unknown",
        "os.type": t["os.type"] || "unknown",
        "os.version": t["os.version"] || "unknown",
        "host.arch": t["host.arch"] || "unknown",
        "aggregation.temporality": this.selectAggregationTemporality() === iRo.AggregationTemporality.DELTA ? "delta" : "cumulative"
      };
      if (t["wsl.version"]) {
        n["wsl.version"] = t["wsl.version"];
      }
      if (isClaudeAISubscriber()) {
        n["user.customer_type"] = "claude_ai";
        let o = getSubscriptionType();
        if (o) {
          n["user.subscription_type"] = o;
        }
      } else {
        n["user.customer_type"] = "api";
      }
      return {
        resource_attributes: n,
        metrics: e.scopeMetrics.flatMap(o => o.metrics.map(s => ({
          name: s.descriptor.name,
          description: s.descriptor.description,
          unit: s.descriptor.unit,
          data_points: this.extractDataPoints(s)
        })))
      };
    }
    extractDataPoints(e) {
      return (e.dataPoints || []).filter(n => typeof n.value === "number").map(n => ({
        attributes: this.convertAttributes(n.attributes),
        value: n.value,
        timestamp: this.hrTimeToISOString(n.endTime || n.startTime || [Date.now() / 1000, 0])
      }));
    }
    async shutdown() {
      this.isShutdown = true;
      await this.forceFlush();
      logForDebugging("BigQuery metrics exporter shutdown complete");
    }
    async forceFlush() {
      await Promise.all(this.pendingExports);
      logForDebugging("BigQuery metrics exporter flush complete");
    }
    convertAttributes(e) {
      let t = {};
      if (e) {
        for (let [n, r] of Object.entries(e)) {
          if (r !== undefined && r !== null) {
            t[n] = String(r);
          }
        }
      }
      return t;
    }
    hrTimeToISOString(e) {
      let [t, n] = e;
      return new Date(t * 1000 + n / 1e6).toISOString();
    }
    selectAggregationTemporality() {
      return iRo.AggregationTemporality.DELTA;
    }
  }
  var iVe;
  var iRo;
  var Q7a = __lazy(() => {
    Dp();
    Uc();
    X7a();
    at();
    no();
    je();
    dt();
    YA();
    iVe = __toESM(Gg(), 1);
    iRo = __toESM(A8t(), 1);
  });
  function tYa(e) {
    return {
      code: lRo.ExportResultCode.FAILED,
      error: Error(e)
    };
  }
  function nYa() {}
  class cRo {
    delegate;
    buffer = [];
    shutDown = false;
    setDelegate(e) {
      if (this.shutDown) {
        e.shutdown().catch(() => {});
        return;
      }
      this.delegate = e;
      let t = this.buffer;
      this.buffer = [];
      for (let n of t) {
        e.export(n, nYa);
      }
    }
    export(e, t) {
      if (this.shutDown) {
        t(tYa("Exporter has been shut down"));
        return;
      }
      if (this.delegate) {
        this.delegate.export(e, t);
        return;
      }
      if (this.buffer.length >= 64) {
        this.buffer.shift();
      }
      this.buffer.push(e);
      t(eYa);
    }
    async forceFlush() {
      if (this.delegate?.forceFlush) {
        await this.delegate.forceFlush();
      }
    }
    async shutdown() {
      if (this.shutDown = true, this.buffer = [], this.delegate) {
        await this.delegate.shutdown();
      }
    }
  }
  class uRo {
    delegate;
    buffer = [];
    shutDown = false;
    setDelegate(e) {
      if (this.shutDown) {
        e.shutdown().catch(() => {});
        return;
      }
      this.delegate = e;
      let t = this.buffer;
      this.buffer = [];
      for (let n of t) {
        e.export(n, nYa);
      }
    }
    export(e, t) {
      if (this.shutDown) {
        t(tYa("Exporter has been shut down"));
        return;
      }
      if (this.delegate) {
        this.delegate.export(e, t);
        return;
      }
      if (this.buffer.length >= 64) {
        this.buffer.shift();
      }
      this.buffer.push(e);
      t(eYa);
    }
    async shutdown() {
      if (this.shutDown = true, this.buffer = [], this.delegate) {
        await this.delegate.shutdown();
      }
    }
  }
  var lRo;
  var eYa;
  var rYa = __lazy(() => {
    lRo = __toESM(Gg(), 1);
    eYa = {
      code: lRo.ExportResultCode.SUCCESS
    };
  });
  class dRo {
    error(e, ...t) {
      if (Me.CLAUDE_CODE_OTEL_DIAG_STDERR) {
        process.stderr.write(`${"[3P telemetry] OTEL diag error:"} ${e}
`);
      }
      logForDebugging(`${"[3P telemetry] OTEL diag error:"} ${e}`, {
        level: "error"
      });
    }
    warn(e, ...t) {
      logForDebugging(`[3P telemetry] OTEL diag warn: ${e}`, {
        level: "warn"
      });
    }
    info(e, ...t) {
      return;
    }
    debug(e, ...t) {
      return;
    }
    verbose(e, ...t) {
      return;
    }
  }
  var sYa = __lazy(() => {
    je();
    pr();
  });