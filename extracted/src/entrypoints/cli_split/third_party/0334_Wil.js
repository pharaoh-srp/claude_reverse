  var Wil = __commonJS(v_t => {
    Object.defineProperty(v_t, "__esModule", {
      value: true
    });
    v_t.BatchObservableResultImpl = v_t.ObservableResultImpl = undefined;
    var E_t = Ji();
    var Hil = mzt();
    var Sum = T7n();
    class jil {
      _buffer = new Hil.AttributeHashMap();
      _instrumentName;
      _valueType;
      constructor(e, t) {
        this._instrumentName = e;
        this._valueType = t;
      }
      observe(e, t = {}) {
        if (typeof e !== "number") {
          E_t.diag.warn(`non-number value provided to metric ${this._instrumentName}: ${e}`);
          return;
        }
        if (this._valueType === E_t.ValueType.INT && !Number.isInteger(e)) {
          if (E_t.diag.warn(`INT value type cannot accept a floating-point value for ${this._instrumentName}, ignoring the fractional digits.`), e = Math.trunc(e), !Number.isInteger(e)) {
            return;
          }
        }
        this._buffer.set(t, e);
      }
    }
    v_t.ObservableResultImpl = jil;
    class qil {
      _buffer = new Map();
      observe(e, t, n = {}) {
        if (!(0, Sum.isObservableInstrument)(e)) {
          return;
        }
        let r = this._buffer.get(e);
        if (r == null) {
          r = new Hil.AttributeHashMap();
          this._buffer.set(e, r);
        }
        if (typeof t !== "number") {
          E_t.diag.warn(`non-number value provided to metric ${e._descriptor.name}: ${t}`);
          return;
        }
        if (e._descriptor.valueType === E_t.ValueType.INT && !Number.isInteger(t)) {
          if (E_t.diag.warn(`INT value type cannot accept a floating-point value for ${e._descriptor.name}, ignoring the fractional digits.`), t = Math.trunc(t), !Number.isInteger(t)) {
            return;
          }
        }
        r.set(n, t);
      }
    }
    v_t.BatchObservableResultImpl = qil;
  });
  var Kil = __commonJS(I7n => {
    Object.defineProperty(I7n, "__esModule", {
      value: true
    });
    I7n.ObservableRegistry = undefined;
    var Tum = Ji();
    var Gil = T7n();
    var Vil = Wil();
    var _0o = mme();
    class zil {
      _callbacks = [];
      _batchCallbacks = [];
      addCallback(e, t) {
        if (this._findCallback(e, t) >= 0) {
          return;
        }
        this._callbacks.push({
          callback: e,
          instrument: t
        });
      }
      removeCallback(e, t) {
        let n = this._findCallback(e, t);
        if (n < 0) {
          return;
        }
        this._callbacks.splice(n, 1);
      }
      addBatchCallback(e, t) {
        let n = new Set(t.filter(Gil.isObservableInstrument));
        if (n.size === 0) {
          Tum.diag.error("BatchObservableCallback is not associated with valid instruments", t);
          return;
        }
        if (this._findBatchCallback(e, n) >= 0) {
          return;
        }
        this._batchCallbacks.push({
          callback: e,
          instruments: n
        });
      }
      removeBatchCallback(e, t) {
        let n = new Set(t.filter(Gil.isObservableInstrument));
        let r = this._findBatchCallback(e, n);
        if (r < 0) {
          return;
        }
        this._batchCallbacks.splice(r, 1);
      }
      async observe(e, t) {
        let n = this._observeCallbacks(e, t);
        let r = this._observeBatchCallbacks(e, t);
        return (await Promise.allSettled([...n, ...r])).filter(i => i.status === "rejected").map(i => i.reason);
      }
      _observeCallbacks(e, t) {
        return this._callbacks.map(async ({
          callback: n,
          instrument: r
        }) => {
          let o = new Vil.ObservableResultImpl(r._descriptor.name, r._descriptor.valueType);
          let s = Promise.resolve(n(o));
          if (t != null) {
            s = (0, _0o.callWithTimeout)(s, t);
          }
          await s;
          r._metricStorages.forEach(i => {
            i.record(o._buffer, e);
          });
        });
      }
      _observeBatchCallbacks(e, t) {
        return this._batchCallbacks.map(async ({
          callback: n,
          instruments: r
        }) => {
          let o = new Vil.BatchObservableResultImpl();
          let s = Promise.resolve(n(o));
          if (t != null) {
            s = (0, _0o.callWithTimeout)(s, t);
          }
          await s;
          r.forEach(i => {
            let a = o._buffer.get(i);
            if (a == null) {
              return;
            }
            i._metricStorages.forEach(l => {
              l.record(a, e);
            });
          });
        });
      }
      _findCallback(e, t) {
        return this._callbacks.findIndex(n => n.callback === e && n.instrument === t);
      }
      _findBatchCallback(e, t) {
        return this._batchCallbacks.findIndex(n => n.callback === e && (0, _0o.setEquals)(n.instruments, t));
      }
    }
    I7n.ObservableRegistry = zil;
  });
  var Jil = __commonJS(P7n => {
    Object.defineProperty(P7n, "__esModule", {
      value: true
    });
    P7n.SyncMetricStorage = undefined;
    var Eum = p0o();
    var vum = h0o();
    var wum = g0o();
    class Yil extends Eum.MetricStorage {
      _aggregationCardinalityLimit;
      _deltaMetricStorage;
      _temporalMetricStorage;
      _attributesProcessor;
      constructor(e, t, n, r, o) {
        super(e);
        this._aggregationCardinalityLimit = o;
        this._deltaMetricStorage = new vum.DeltaMetricProcessor(t, this._aggregationCardinalityLimit);
        this._temporalMetricStorage = new wum.TemporalMetricProcessor(t, r);
        this._attributesProcessor = n;
      }
      record(e, t, n, r) {
        t = this._attributesProcessor.process(t, n);
        this._deltaMetricStorage.record(e, t, n, r);
      }
      collect(e, t) {
        let n = this._deltaMetricStorage.collect();
        return this._temporalMetricStorage.buildMetrics(e, this._instrumentDescriptor, n, t);
      }
    }
    P7n.SyncMetricStorage = Yil;
  });
  var O7n = __commonJS(bme => {
    Object.defineProperty(bme, "__esModule", {
      value: true
    });
    bme.createDenyListAttributesProcessor = bme.createAllowListAttributesProcessor = bme.createMultiAttributesProcessor = bme.createNoopAttributesProcessor = undefined;
    class Xil {
      process(e, t) {
        return e;
      }
    }
    class Qil {
      _processors;
      constructor(e) {
        this._processors = e;
      }
      process(e, t) {
        let n = e;
        for (let r of this._processors) {
          n = r.process(n, t);
        }
        return n;
      }
    }
    class Zil {
      _allowedAttributeNames;
      constructor(e) {
        this._allowedAttributeNames = new Set(e);
      }
      process(e, t) {
        let n = {};
        for (let r in e) {
          if (Object.prototype.hasOwnProperty.call(e, r) && this._allowedAttributeNames.vZc(r)) {
            n[r] = e[r];
          }
        }
        return n;
      }
    }
    class eal {
      _deniedAttributeNames;
      constructor(e) {
        this._deniedAttributeNames = new Set(e);
      }
      process(e, t) {
        let n = {};
        for (let r in e) {
          if (Object.prototype.hasOwnProperty.call(e, r) && !this._deniedAttributeNames.vZc(r)) {
            n[r] = e[r];
          }
        }
        return n;
      }
    }
    function Cum() {
      return Aum;
    }
    bme.createNoopAttributesProcessor = Cum;
    function Rum(e) {
      return new Qil(e);
    }
    bme.createMultiAttributesProcessor = Rum;
    function xum(e) {
      return new Zil(e);
    }
    bme.createAllowListAttributesProcessor = xum;
    function kum(e) {
      return new eal(e);
    }
    bme.createDenyListAttributesProcessor = kum;
    var Aum = new Xil();
  });
  var nal = __commonJS(D7n => {
    Object.defineProperty(D7n, "__esModule", {
      value: true
    });
    D7n.MeterSharedState = undefined;
    var Ium = pzt();
    var Pum = Ril();
    var Oum = Pil();
    var Dum = Uil();
    var Mum = $il();
    var Num = Kil();
    var Lum = Jil();
    var Fum = O7n();
    class tal {
      metricStorageRegistry = new Dum.MetricStorageRegistry();
      observableRegistry = new Num.ObservableRegistry();
      meter;
      _meterProviderSharedState;
      _instrumentationScope;
      constructor(e, t) {
        this.meter = new Pum.Meter(this);
        this._meterProviderSharedState = e;
        this._instrumentationScope = t;
      }
      registerMetricStorage(e) {
        let t = this._registerMetricStorage(e, Lum.SyncMetricStorage);
        if (t.length === 1) {
          return t[0];
        }
        return new Mum.MultiMetricStorage(t);
      }
      registerAsyncMetricStorage(e) {
        return this._registerMetricStorage(e, Oum.AsyncMetricStorage);
      }
      async collect(e, t, n) {
        let r = await this.observableRegistry.observe(t, n?.timeoutMillis);
        let o = this.metricStorageRegistry.getStorages(e);
        if (o.length === 0) {
          return null;
        }
        let s = [];
        if (o.forEach(i => {
          let a = i.collect(e, t);
          if (a != null) {
            s.push(a);
          }
        }), s.length === 0) {
          return {
            errors: r
          };
        }
        return {
          scopeMetrics: {
            scope: this._instrumentationScope,
            metrics: s
          },
          errors: r
        };
      }
      _registerMetricStorage(e, t) {
        let r = this._meterProviderSharedState.viewRegistry.findViews(e, this._instrumentationScope).map(o => {
          let s = (0, Ium.createInstrumentDescriptorWithView)(o, e);
          let i = this.metricStorageRegistry.findOrUpdateCompatibleStorage(s);
          if (i != null) {
            return i;
          }
          let a = o.aggregation.createAggregator(s);
          let l = new t(s, a, o.attributesProcessor, this._meterProviderSharedState.metricCollectors, o.aggregationCardinalityLimit);
          this.metricStorageRegistry.register(l);
          return l;
        });
        if (r.length === 0) {
          let s = this._meterProviderSharedState.selectAggregations(e.type).map(([i, a]) => {
            let l = this.metricStorageRegistry.findOrUpdateCompatibleCollectorStorage(i, e);
            if (l != null) {
              return l;
            }
            let c = a.createAggregator(e);
            let u = i.selectCardinalityLimit(e.type);
            let d = new t(e, c, (0, Fum.createNoopAttributesProcessor)(), [i], u);
            this.metricStorageRegistry.registerForCollector(i, d);
            return d;
          });
          r = r.concat(s);
        }
        return r;
      }
    }
    D7n.MeterSharedState = tal;
  });
  var oal = __commonJS(M7n => {
    Object.defineProperty(M7n, "__esModule", {
      value: true
    });
    M7n.MeterProviderSharedState = undefined;
    var Uum = mme();
    var Bum = hil();
    var $um = nal();
    var Hum = szt();
    class ral {
      viewRegistry = new Bum.ViewRegistry();
      metricCollectors = [];
      meterSharedStates = new Map();
      resource;
      constructor(e) {
        this.resource = e;
      }
      getMeterSharedState(e) {
        let t = (0, Uum.instrumentationScopeId)(e);
        let n = this.meterSharedStates.get(t);
        if (n == null) {
          n = new $um.MeterSharedState(this, e);
          this.meterSharedStates.set(t, n);
        }
        return n;
      }
      selectAggregations(e) {
        let t = [];
        for (let n of this.metricCollectors) {
          t.push([n, (0, Hum.toAggregation)(n.selectAggregation(e))]);
        }
        return t;
      }
    }
    M7n.MeterProviderSharedState = ral;
  });
  var ial = __commonJS(N7n => {
    Object.defineProperty(N7n, "__esModule", {
      value: true
    });
    N7n.MetricCollector = undefined;
    var jum = fse();
    class sal {
      _sharedState;
      _metricReader;
      constructor(e, t) {
        this._sharedState = e;
        this._metricReader = t;
      }
      async collect(e) {
        let t = (0, jum.millisToHrTime)(Date.now());
        let n = [];
        let r = [];
        let o = Array.from(this._sharedState.meterSharedStates.values()).map(async s => {
          let i = await s.collect(this, t, e);
          if (i?.scopeMetrics != null) {
            n.push(i.scopeMetrics);
          }
          if (i?.errors != null) {
            r.push(...i.errors);
          }
        });
        await Promise.all(o);
        return {
          resourceMetrics: {
            resource: this._sharedState.resource,
            scopeMetrics: n
          },
          errors: r
        };
      }
      async forceFlush(e) {
        await this._metricReader.forceFlush(e);
      }
      async shutdown(e) {
        await this._metricReader.shutdown(e);
      }
      selectAggregationTemporality(e) {
        return this._metricReader.selectAggregationTemporality(e);
      }
      selectAggregation(e) {
        return this._metricReader.selectAggregation(e);
      }
      selectCardinalityLimit(e) {
        return this._metricReader.selectCardinalityLimit?.(e) ?? 2000;
      }
    }
    N7n.MetricCollector = sal;
  });
  var L7n = __commonJS(w_t => {
    Object.defineProperty(w_t, "__esModule", {
      value: true
    });
    w_t.ExactPredicate = w_t.PatternPredicate = undefined;
    class b0o {
      _matchAll;
      _regexp;
      constructor(e) {
        if (e === "*") {
          this._matchAll = true;
          this._regexp = /.*/;
        } else {
          this._matchAll = false;
          this._regexp = new RegExp(b0o.escapePattern(e));
        }
      }
      match(e) {
        if (this._matchAll) {
          return true;
        }
        return this._regexp.test(e);
      }
      static escapePattern(e) {
        return `^${e.replace(/[\^$\\.+?()[\]{}|]/g, "\\$&").replace("*", ".*")}$`;
      }
      static hasWildcard(e) {
        return e.includes("*");
      }
    }
    w_t.PatternPredicate = b0o;
    class aal {
      _matchAll;
      _pattern;
      constructor(e) {
        this._matchAll = e === undefined;
        this._pattern = e;
      }
      match(e) {
        if (this._matchAll) {
          return true;
        }
        if (e === this._pattern) {
          return true;
        }
        return false;
      }
    }
    w_t.ExactPredicate = aal;
  });
  var ual = __commonJS(F7n => {
    Object.defineProperty(F7n, "__esModule", {
      value: true
    });
    F7n.InstrumentSelector = undefined;
    var lal = L7n();
    class cal {
      _nameFilter;
      _type;
      _unitFilter;
      constructor(e) {
        this._nameFilter = new lal.PatternPredicate(e?.name ?? "*");
        this._type = e?.type;
        this._unitFilter = new lal.ExactPredicate(e?.unit);
      }
      getType() {
        return this._type;
      }
      getNameFilter() {
        return this._nameFilter;
      }
      getUnitFilter() {
        return this._unitFilter;
      }
    }
    F7n.InstrumentSelector = cal;
  });
  var pal = __commonJS(U7n => {
    Object.defineProperty(U7n, "__esModule", {
      value: true
    });
    U7n.MeterSelector = undefined;
    var S0o = L7n();
    class dal {
      _nameFilter;
      _versionFilter;
      _schemaUrlFilter;
      constructor(e) {
        this._nameFilter = new S0o.ExactPredicate(e?.name);
        this._versionFilter = new S0o.ExactPredicate(e?.version);
        this._schemaUrlFilter = new S0o.ExactPredicate(e?.schemaUrl);
      }
      getNameFilter() {
        return this._nameFilter;
      }
      getVersionFilter() {
        return this._versionFilter;
      }
      getSchemaUrlFilter() {
        return this._schemaUrlFilter;
      }
    }
    U7n.MeterSelector = dal;
  });
  var gal = __commonJS(B7n => {
    Object.defineProperty(B7n, "__esModule", {
      value: true
    });
    B7n.View = undefined;
    var Wum = L7n();
    var mal = O7n();
    var Gum = ual();
    var Vum = pal();
    var fal = szt();
    function zum(e) {
      return e.instrumentName == null && e.instrumentType == null && e.instrumentUnit == null && e.meterName == null && e.meterVersion == null && e.meterSchemaUrl == null;
    }
    function Kum(e) {
      if (zum(e)) {
        throw Error("Cannot create view with no selector arguments supplied");
      }
      if (e.name != null && (e?.instrumentName == null || Wum.PatternPredicate.hasWildcard(e.instrumentName))) {
        throw Error("Views with a specified name must be declared with an instrument selector that selects at most one instrument per meter.");
      }
    }
    class hal {
      name;
      description;
      aggregation;
      attributesProcessor;
      instrumentSelector;
      meterSelector;
      aggregationCardinalityLimit;
      constructor(e) {
        if (Kum(e), e.attributesProcessors != null) {
          this.attributesProcessor = (0, mal.createMultiAttributesProcessor)(e.attributesProcessors);
        } else {
          this.attributesProcessor = (0, mal.createNoopAttributesProcessor)();
        }
        this.name = e.name;
        this.description = e.description;
        this.aggregation = (0, fal.toAggregation)(e.aggregation ?? {
          type: fal.AggregationType.DEFAULT
        });
        this.instrumentSelector = new Gum.InstrumentSelector({
          name: e.instrumentName,
          type: e.instrumentType,
          unit: e.instrumentUnit
        });
        this.meterSelector = new Vum.MeterSelector({
          name: e.meterName,
          version: e.meterVersion,
          schemaUrl: e.meterSchemaUrl
        });
        this.aggregationCardinalityLimit = e.aggregationCardinalityLimit;
      }
    }
    B7n.View = hal;
  });
  var _al = __commonJS(H7n => {
    Object.defineProperty(H7n, "__esModule", {
      value: true
    });
    H7n.MeterProvider = undefined;
    var $7n = Ji();
    var Yum = mil();
    var Jum = oal();
    var Xum = ial();
    var Qum = gal();
    class yal {
      _sharedState;
      _shutdown = false;
      constructor(e) {
        if (this._sharedState = new Jum.MeterProviderSharedState(e?.resource ?? (0, Yum.defaultResource)()), e?.views != null && e.views.length > 0) {
          for (let t of e.views) {
            this._sharedState.viewRegistry.addView(new Qum.View(t));
          }
        }
        if (e?.readers != null && e.readers.length > 0) {
          for (let t of e.readers) {
            let n = new Xum.MetricCollector(this._sharedState, t);
            t.setMetricProducer(n);
            this._sharedState.metricCollectors.push(n);
          }
        }
      }
      getMeter(e, t = "", n = {}) {
        if (this._shutdown) {
          $7n.diag.warn("A shutdown MeterProvider cannot provide a Meter");
          return (0, $7n.createNoopMeter)();
        }
        return this._sharedState.getMeterSharedState({
          name: e,
          version: t,
          schemaUrl: n.schemaUrl
        }).meter;
      }
      async shutdown(e) {
        if (this._shutdown) {
          $7n.diag.warn("shutdown may only be called once per MeterProvider");
          return;
        }
        this._shutdown = true;
        await Promise.all(this._sharedState.metricCollectors.map(t => t.shutdown(e)));
      }
      async forceFlush(e) {
        if (this._shutdown) {
          $7n.diag.warn("invalid attempt to force flush after MeterProvider shutdown");
          return;
        }
        await Promise.all(this._sharedState.metricCollectors.map(t => t.forceFlush(e)));
      }
    }
    H7n.MeterProvider = yal;
  });
  var T0o = __commonJS(jw => {
    Object.defineProperty(jw, "__esModule", {
      value: true
    });
    jw.TimeoutError = jw.createDenyListAttributesProcessor = jw.createAllowListAttributesProcessor = jw.AggregationType = jw.MeterProvider = jw.ConsoleMetricExporter = jw.InMemoryMetricExporter = jw.PeriodicExportingMetricReader = jw.MetricReader = jw.InstrumentType = jw.DataPointType = jw.AggregationTemporality = undefined;
    var Zum = FKn();
    Object.defineProperty(jw, "AggregationTemporality", {
      enumerable: true,
      get: function () {
        return Zum.AggregationTemporality;
      }
    });
    var bal = lve();
    Object.defineProperty(jw, "DataPointType", {
      enumerable: true,
      get: function () {
        return bal.DataPointType;
      }
    });
    Object.defineProperty(jw, "InstrumentType", {
      enumerable: true,
      get: function () {
        return bal.InstrumentType;
      }
    });
    var edm = t0o();
    Object.defineProperty(jw, "MetricReader", {
      enumerable: true,
      get: function () {
        return edm.MetricReader;
      }
    });
    var tdm = Psl();
    Object.defineProperty(jw, "PeriodicExportingMetricReader", {
      enumerable: true,
      get: function () {
        return tdm.PeriodicExportingMetricReader;
      }
    });
    var ndm = Msl();
    Object.defineProperty(jw, "InMemoryMetricExporter", {
      enumerable: true,
      get: function () {
        return ndm.InMemoryMetricExporter;
      }
    });
    var rdm = Lsl();
    Object.defineProperty(jw, "ConsoleMetricExporter", {
      enumerable: true,
      get: function () {
        return rdm.ConsoleMetricExporter;
      }
    });
    var odm = _al();
    Object.defineProperty(jw, "MeterProvider", {
      enumerable: true,
      get: function () {
        return odm.MeterProvider;
      }
    });
    var sdm = szt();
    Object.defineProperty(jw, "AggregationType", {
      enumerable: true,
      get: function () {
        return sdm.AggregationType;
      }
    });
    var Sal = O7n();
    Object.defineProperty(jw, "createAllowListAttributesProcessor", {
      enumerable: true,
      get: function () {
        return Sal.createAllowListAttributesProcessor;
      }
    });
    Object.defineProperty(jw, "createDenyListAttributesProcessor", {
      enumerable: true,
      get: function () {
        return Sal.createDenyListAttributesProcessor;
      }
    });
    var idm = mme();
    Object.defineProperty(jw, "TimeoutError", {
      enumerable: true,
      get: function () {
        return idm.TimeoutError;
      }
    });
  });
  var v0o = __commonJS(W7n => {
    Object.defineProperty(W7n, "__esModule", {
      value: true
    });
    W7n.PrometheusSerializer = undefined;
    var adm = Ji();
    var WVe = T0o();
    var Tal = fse();
    var Eal = Hne();
    function q7n(e) {
      return e.replace(/\\/g, "\\\\").replace(/\n/g, "\\n");
    }
    function val(e = "") {
      if (typeof e !== "string") {
        e = JSON.stringify(e);
      }
      return q7n(e).replace(/"/g, "\\\"");
    }
    function E0o(e) {
      return e.replace(/[^a-z0-9_]/gi, "_").replace(/_{2,}/g, "_");
    }
    function ddm(e, t) {
      if (!e.endsWith("_total") && t.dataPointType === WVe.DataPointType.SUM && t.isMonotonic) {
        e = e + "_total";
      }
      return e;
    }
    function pdm(e) {
      if (e === 1 / 0) {
        return "+Inf";
      } else if (e === -1 / 0) {
        return "-Inf";
      } else {
        return `${e}`;
      }
    }
    function mdm(e) {
      switch (e.dataPointType) {
        case WVe.DataPointType.SUM:
          if (e.isMonotonic) {
            return "counter";
          }
          return "gauge";
        case WVe.DataPointType.GAUGE:
          return "gauge";
        case WVe.DataPointType.HISTOGRAM:
          return "histogram";
        default:
          return "untyped";
      }
    }
    function j7n(e, t, n, r, o) {
      let s = false;
      let i = "";
      for (let [a, l] of Object.entries(t)) {
        let c = E0o(a);
        s = true;
        i += `${i.length > 0 ? "," : ""}${c}="${val(l)}"`;
      }
      if (o) {
        for (let [a, l] of Object.entries(o)) {
          let c = E0o(a);
          s = true;
          i += `${i.length > 0 ? "," : ""}${c}="${val(l)}"`;
        }
      }
      if (s) {
        e += `{${i}}`;
      }
      return `${e} ${pdm(n)}${r !== undefined ? " " + String(r) : ""}
`;
    }
    class wal {
      _prefix;
      _appendTimestamp;
      _additionalAttributes;
      _withResourceConstantLabels;
      _withoutScopeInfo;
      _withoutTargetInfo;
      constructor(e, t = false, n, r, o) {
        if (e) {
          this._prefix = e + "_";
        }
        this._appendTimestamp = t;
        this._withResourceConstantLabels = n;
        this._withoutScopeInfo = !!o;
        this._withoutTargetInfo = !!r;
      }
      serialize(e) {
        let t = "";
        this._additionalAttributes = this._filterResourceConstantLabels(e.resource.attributes, this._withResourceConstantLabels);
        for (let n of e.scopeMetrics) {
          t += this._serializeScopeMetrics(n);
        }
        if (t === "") {
          t += "# no registered metrics";
        }
        return this._serializeResource(e.resource) + t;
      }
      _filterResourceConstantLabels(e, t) {
        if (t) {
          let n = {};
          for (let [r, o] of Object.entries(e)) {
            if (r.match(t)) {
              n[r] = o;
            }
          }
          return n;
        }
        return;
      }
      _serializeScopeMetrics(e) {
        let t = "";
        for (let n of e.metrics) {
          t += this._serializeMetricData(n, e.scope) + `
`;
        }
        return t;
      }
      _serializeMetricData(e, t) {
        let n = E0o(q7n(e.descriptor.name));
        if (this._prefix) {
          n = `${this._prefix}${n}`;
        }
        let r = e.dataPointType;
        n = ddm(n, e);
        let o = `# HELP ${n} ${q7n(e.descriptor.description || "description missing")}`;
        let s = e.descriptor.unit ? `
# UNIT ${n} ${q7n(e.descriptor.unit)}` : "";
        let i = `# TYPE ${n} ${mdm(e)}`;
        let a;
        if (this._withoutScopeInfo) {
          a = this._additionalAttributes;
        } else {
          let c = {
            [Eal.ATTR_OTEL_SCOPE_NAME]: t.name
          };
          if (t.schemaUrl) {
            c["otel.scope.schema_url"] = t.schemaUrl;
          }
          if (t.version) {
            c[Eal.ATTR_OTEL_SCOPE_VERSION] = t.version;
          }
          a = Object.assign(c, this._additionalAttributes);
        }
        let l = "";
        switch (r) {
          case WVe.DataPointType.SUM:
          case WVe.DataPointType.GAUGE:
            {
              l = e.dataPoints.map(c => this._serializeSingularDataPoint(n, e, c, a)).join("");
              break;
            }
          case WVe.DataPointType.HISTOGRAM:
            {
              l = e.dataPoints.map(c => this._serializeHistogramDataPoint(n, e, c, a)).join("");
              break;
            }
          default:
            adm.diag.error(`Unrecognizable DataPointType: ${r} for metric "${n}"`);
        }
        return `${o}${s}
${i}
${l}`.trim();
      }
      _serializeSingularDataPoint(e, t, n, r) {
        let o = "";
        let {
          value: s,
          attributes: i
        } = n;
        let a = (0, Tal.hrTimeToMilliseconds)(n.endTime);
        o += j7n(e, i, s, this._appendTimestamp ? a : undefined, r);
        return o;
      }
      _serializeHistogramDataPoint(e, t, n, r) {
        let o = "";
        let s = n.attributes;
        let i = n.value;
        let a = (0, Tal.hrTimeToMilliseconds)(n.endTime);
        for (let d of ["count", "sum"]) {
          let p = i[d];
          if (p != null) {
            o += j7n(e + "_" + d, s, p, this._appendTimestamp ? a : undefined, r);
          }
        }
        let l = 0;
        let c = i.buckets.counts.entries();
        let u = false;
        for (let [d, p] of c) {
          l += p;
          let m = i.buckets.boundaries[d];
          if (m === undefined && u) {
            break;
          }
          if (m === 1 / 0) {
            u = true;
          }
          o += j7n(e + "_bucket", s, l, this._appendTimestamp ? a : undefined, Object.assign({}, r, {
            le: m === undefined || m === 1 / 0 ? "+Inf" : String(m)
          }));
        }
        return o;
      }
      _serializeResource(e) {
        if (this._withoutTargetInfo === true) {
          return "";
        }
        let t = "target_info";
        let n = `# HELP ${t} Target metadata`;
        let r = `# TYPE ${t} gauge`;
        let o = j7n(t, e.attributes, 1).trim();
        return `${n}
${r}
${o}
`;
      }
    }
    W7n.PrometheusSerializer = wal;
  });
  var Cal = __commonJS(G7n => {
    Object.defineProperty(G7n, "__esModule", {
      value: true
    });
    G7n.PrometheusExporter = undefined;
    var hzt = Ji();
    var hdm = fse();
    var w0o = T0o();
    var gdm = require("http");
    var ydm = v0o();
    var _dm = require("url");
    class Sme extends w0o.MetricReader {
      static DEFAULT_OPTIONS = {
        host: undefined,
        port: 9464,
        endpoint: "/metrics",
        prefix: "",
        appendTimestamp: false,
        withResourceConstantLabels: undefined,
        withoutScopeInfo: false,
        withoutTargetInfo: false
      };
      _host;
      _port;
      _baseUrl;
      _endpoint;
      _server;
      _prefix;
      _appendTimestamp;
      _serializer;
      _startServerPromise;
      constructor(e = {}, t = () => {}) {
        super({
          aggregationSelector: s => ({
            type: w0o.AggregationType.DEFAULT
          }),
          aggregationTemporalitySelector: s => w0o.AggregationTemporality.CUMULATIVE,
          metricProducers: e.metricProducers
        });
        this._host = e.host || process.env.OTEL_EXPORTER_PROMETHEUS_HOST || Sme.DEFAULT_OPTIONS.host;
        this._port = e.port || Number(process.env.OTEL_EXPORTER_PROMETHEUS_PORT) || Sme.DEFAULT_OPTIONS.port;
        this._prefix = e.prefix || Sme.DEFAULT_OPTIONS.prefix;
        this._appendTimestamp = typeof e.appendTimestamp === "boolean" ? e.appendTimestamp : Sme.DEFAULT_OPTIONS.appendTimestamp;
        let n = e.withResourceConstantLabels || Sme.DEFAULT_OPTIONS.withResourceConstantLabels;
        let r = e.withoutScopeInfo || Sme.DEFAULT_OPTIONS.withoutScopeInfo;
        let o = e.withoutTargetInfo || Sme.DEFAULT_OPTIONS.withoutTargetInfo;
        if (this._server = (0, gdm.createServer)(this._requestHandler).unref(), this._serializer = new ydm.PrometheusSerializer(this._prefix, this._appendTimestamp, n, o, r), this._baseUrl = `http://${this._host}:${this._port}/`, this._endpoint = (e.endpoint || Sme.DEFAULT_OPTIONS.endpoint).replace(/^([^/])/, "/$1"), e.preventServerStart !== true) {
          this.startServer().then(t, s => {
            hzt.diag.error(s);
            t(s);
          });
        } else if (t) {
          queueMicrotask(t);
        }
      }
      async onForceFlush() {}
      onShutdown() {
        return this.stopServer();
      }
      stopServer() {
        if (!this._server) {
          hzt.diag.debug("Prometheus stopServer() was called but server was never started.");
          return Promise.resolve();
        } else {
          return new Promise(e => {
            this._server.close(t => {
              if (!t) {
                hzt.diag.debug("Prometheus exporter was stopped");
              } else if (t.code !== "ERR_SERVER_NOT_RUNNING") {
                (0, hdm.globalErrorHandler)(t);
              }
              e();
            });
          });
        }
      }
      startServer() {
        this._startServerPromise ??= new Promise((e, t) => {
          this._server.once("error", t);
          this._server.listen({
            port: this._port,
            host: this._host
          }, () => {
            hzt.diag.debug(`Prometheus exporter server started: ${this._host}:${this._port}/${this._endpoint}`);
            e();
          });
        });
        return this._startServerPromise;
      }
      getMetricsRequestHandler(e, t) {
        this._exportMetrics(t);
      }
      _requestHandler = (e, t) => {
        let n;
        try {
          if (e.url != null) {
            n = new _dm.URL(e.url, this._baseUrl).pathname;
          }
        } catch {
          t.statusCode = 400;
          t.end("Bad Request");
          return;
        }
        if (n === this._endpoint) {
          this._exportMetrics(t);
        } else {
          this._notFound(t);
        }
      };
      _exportMetrics = e => {
        e.statusCode = 200;
        e.setHeader("content-type", "text/plain");
        this.collect().then(t => {
          let {
            resourceMetrics: n,
            errors: r
          } = t;
          if (r.length) {
            hzt.diag.error("PrometheusExporter: metrics collection errors", ...r);
          }
          e.end(this._serializer.serialize(n));
        }, t => {
          e.end(`# failed to export metrics: ${t}`);
        });
      };
      _notFound = e => {
        e.statusCode = 404;
        e.end();
      };
    }
    G7n.PrometheusExporter = Sme;
  });
  var Ral = __commonJS(C_t => {
    Object.defineProperty(C_t, "__esModule", {
      value: true
    });
    C_t.PrometheusSerializer = C_t.PrometheusExporter = undefined;
    var bdm = Cal();
    Object.defineProperty(C_t, "PrometheusExporter", {
      enumerable: true,
      get: function () {
        return bdm.PrometheusExporter;
      }
    });
    var Sdm = v0o();
    Object.defineProperty(C_t, "PrometheusSerializer", {
      enumerable: true,
      get: function () {
        return Sdm.PrometheusSerializer;
      }
    });
  });
  var Aal = __commonJS(V7n => {
    Object.defineProperty(V7n, "__esModule", {
      value: true
    });
    V7n.OTLPLogExporter = undefined;
    var xal = iKn();
    var Tdm = Kpe();
    var Edm = qpe();
    class kal extends Edm.OTLPExporterBase {
      constructor(e = {}) {
        super((0, xal.createOtlpGrpcExportDelegate)((0, xal.convertLegacyOtlpGrpcOptions)(e, "LOGS"), Tdm.ProtobufLogsSerializer, "LogsExportService", "/opentelemetry.proto.collector.logs.v1.LogsService/Export"));
      }
    }
    V7n.OTLPLogExporter = kal;
  });
  var Ial = __commonJS(z7n => {
    Object.defineProperty(z7n, "__esModule", {
      value: true
    });
    z7n.OTLPLogExporter = undefined;
    var vdm = Aal();
    Object.defineProperty(z7n, "OTLPLogExporter", {
      enumerable: true,
      get: function () {
        return vdm.OTLPLogExporter;
      }
    });
  });