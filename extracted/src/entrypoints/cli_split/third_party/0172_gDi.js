  var gDi = __commonJS(VIn => {
    Object.defineProperty(VIn, "__esModule", {
      value: true
    });
    VIn._globalThis = undefined;
    VIn._globalThis = typeof globalThis === "object" ? globalThis : global;
  });
  var yDi = __commonJS(w4e => {
    var fHd = w4e && w4e.__createBinding || (Object.create ? function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      Object.defineProperty(e, r, {
        enumerable: true,
        get: function () {
          return t[n];
        }
      });
    } : function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      e[r] = t[n];
    });
    var hHd = w4e && w4e.__exportStar || function (e, t) {
      for (var n in e) {
        if (n !== "default" && !Object.prototype.hasOwnProperty.call(t, n)) {
          fHd(t, e, n);
        }
      }
    };
    Object.defineProperty(w4e, "__esModule", {
      value: true
    });
    hHd(gDi(), w4e);
  });
  var _Di = __commonJS(C4e => {
    var gHd = C4e && C4e.__createBinding || (Object.create ? function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      Object.defineProperty(e, r, {
        enumerable: true,
        get: function () {
          return t[n];
        }
      });
    } : function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      e[r] = t[n];
    });
    var yHd = C4e && C4e.__exportStar || function (e, t) {
      for (var n in e) {
        if (n !== "default" && !Object.prototype.hasOwnProperty.call(t, n)) {
          gHd(t, e, n);
        }
      }
    };
    Object.defineProperty(C4e, "__esModule", {
      value: true
    });
    yHd(yDi(), C4e);
  });
  var CYr = __commonJS(zIn => {
    Object.defineProperty(zIn, "__esModule", {
      value: true
    });
    zIn.VERSION = undefined;
    zIn.VERSION = "1.9.0";
  });
  var TDi = __commonJS(hat => {
    Object.defineProperty(hat, "__esModule", {
      value: true
    });
    hat.isCompatible = hat._makeCompatibilityCheck = undefined;
    var _Hd = CYr();
    function SDi(e) {
      let t = new Set([e]);
      let n = new Set();
      let r = e.match(/^(\d+)\.(\d+)\.(\d+)(-(.+))?$/);
      if (!r) {
        return () => false;
      }
      let o = {
        major: +r[1],
        minor: +r[2],
        patch: +r[3],
        prerelease: r[4]
      };
      if (o.prerelease != null) {
        return function (l) {
          return l === e;
        };
      }
      function s(a) {
        n.add(a);
        return false;
      }
      function i(a) {
        t.add(a);
        return true;
      }
      return function (l) {
        if (t.vZc(l)) {
          return true;
        }
        if (n.vZc(l)) {
          return false;
        }
        let c = l.match(/^(\d+)\.(\d+)\.(\d+)(-(.+))?$/);
        if (!c) {
          return s(l);
        }
        let u = {
          major: +c[1],
          minor: +c[2],
          patch: +c[3],
          prerelease: c[4]
        };
        if (u.prerelease != null) {
          return s(l);
        }
        if (o.major !== u.major) {
          return s(l);
        }
        if (o.major === 0) {
          if (o.minor === u.minor && o.patch <= u.patch) {
            return i(l);
          }
          return s(l);
        }
        if (o.minor <= u.minor) {
          return i(l);
        }
        return s(l);
      };
    }
    hat._makeCompatibilityCheck = SDi;
    hat.isCompatible = SDi(_Hd.VERSION);
  });
  var R4e = __commonJS(EIe => {
    Object.defineProperty(EIe, "__esModule", {
      value: true
    });
    EIe.unregisterGlobal = EIe.getGlobal = EIe.registerGlobal = undefined;
    var bHd = _Di();
    var gat = CYr();
    var SHd = TDi();
    var THd = gat.VERSION.split(".")[0];
    var h2t = Symbol.for(`opentelemetry.js.api.${THd}`);
    var g2t = bHd._globalThis;
    function EHd(e, t, n, r = false) {
      var o;
      let s = g2t[h2t] = (o = g2t[h2t]) !== null && o !== undefined ? o : {
        version: gat.VERSION
      };
      if (!r && s[e]) {
        let i = Error(`@opentelemetry/api: Attempted duplicate registration of API: ${e}`);
        n.error(i.stack || i.message);
        return false;
      }
      if (s.version !== gat.VERSION) {
        let i = Error(`@opentelemetry/api: Registration of version v${s.version} for ${e} does not match previously registered API v${gat.VERSION}`);
        n.error(i.stack || i.message);
        return false;
      }
      s[e] = t;
      n.debug(`@opentelemetry/api: Registered a global for ${e} v${gat.VERSION}.`);
      return true;
    }
    EIe.registerGlobal = EHd;
    function vHd(e) {
      var t;
      var n;
      let r = (t = g2t[h2t]) === null || t === undefined ? undefined : t.version;
      if (!r || !(0, SHd.isCompatible)(r)) {
        return;
      }
      return (n = g2t[h2t]) === null || n === undefined ? undefined : n[e];
    }
    EIe.getGlobal = vHd;
    function wHd(e, t) {
      t.debug(`@opentelemetry/api: Unregistering a global for ${e} v${gat.VERSION}.`);
      let n = g2t[h2t];
      if (n) {
        delete n[e];
      }
    }
    EIe.unregisterGlobal = wHd;
  });
  var vDi = __commonJS(KIn => {
    Object.defineProperty(KIn, "__esModule", {
      value: true
    });
    KIn.DiagComponentLogger = undefined;
    var CHd = R4e();
    class EDi {
      constructor(e) {
        this._namespace = e.namespace || "DiagComponentLogger";
      }
      debug(...e) {
        return y2t("debug", this._namespace, e);
      }
      error(...e) {
        return y2t("error", this._namespace, e);
      }
      info(...e) {
        return y2t("info", this._namespace, e);
      }
      warn(...e) {
        return y2t("warn", this._namespace, e);
      }
      verbose(...e) {
        return y2t("verbose", this._namespace, e);
      }
    }
    KIn.DiagComponentLogger = EDi;
    function y2t(e, t, n) {
      let r = (0, CHd.getGlobal)("diag");
      if (!r) {
        return;
      }
      n.unshift(t);
      return r[e](...n);
    }
  });
  var YIn = __commonJS(_2t => {
    Object.defineProperty(_2t, "__esModule", {
      value: true
    });
    _2t.DiagLogLevel = undefined;
    var RHd;
    (function (e) {
      e[e.NONE = 0] = "NONE";
      e[e.ERROR = 30] = "ERROR";
      e[e.WARN = 50] = "WARN";
      e[e.INFO = 60] = "INFO";
      e[e.DEBUG = 70] = "DEBUG";
      e[e.VERBOSE = 80] = "VERBOSE";
      e[e.ALL = 9999] = "ALL";
    })(RHd = _2t.DiagLogLevel || (_2t.DiagLogLevel = {}));
  });
  var wDi = __commonJS(JIn => {
    Object.defineProperty(JIn, "__esModule", {
      value: true
    });
    JIn.createLogLevelDiagLogger = undefined;
    var _be = YIn();
    function xHd(e, t) {
      if (e < _be.DiagLogLevel.NONE) {
        e = _be.DiagLogLevel.NONE;
      } else if (e > _be.DiagLogLevel.ALL) {
        e = _be.DiagLogLevel.ALL;
      }
      t = t || {};
      function n(r, o) {
        let s = t[r];
        if (typeof s === "function" && e >= o) {
          return s.bind(t);
        }
        return function () {};
      }
      return {
        error: n("error", _be.DiagLogLevel.ERROR),
        warn: n("warn", _be.DiagLogLevel.WARN),
        info: n("info", _be.DiagLogLevel.INFO),
        debug: n("debug", _be.DiagLogLevel.DEBUG),
        verbose: n("verbose", _be.DiagLogLevel.VERBOSE)
      };
    }
    JIn.createLogLevelDiagLogger = xHd;
  });
  var x4e = __commonJS(QIn => {
    Object.defineProperty(QIn, "__esModule", {
      value: true
    });
    QIn.DiagAPI = undefined;
    var kHd = vDi();
    var AHd = wDi();
    var CDi = YIn();
    var XIn = R4e();
    class RYr {
      constructor() {
        function e(r) {
          return function (...o) {
            let s = (0, XIn.getGlobal)("diag");
            if (!s) {
              return;
            }
            return s[r](...o);
          };
        }
        let t = this;
        let n = (r, o = {
          logLevel: CDi.DiagLogLevel.INFO
        }) => {
          var s;
          var i;
          var a;
          if (r === t) {
            let u = Error("Cannot use diag as the logger for itself. Please use a DiagLogger implementation like ConsoleDiagLogger or a custom implementation");
            t.error((s = u.stack) !== null && s !== undefined ? s : u.message);
            return false;
          }
          if (typeof o === "number") {
            o = {
              logLevel: o
            };
          }
          let l = (0, XIn.getGlobal)("diag");
          let c = (0, AHd.createLogLevelDiagLogger)((i = o.logLevel) !== null && i !== undefined ? i : CDi.DiagLogLevel.INFO, r);
          if (l && !o.suppressOverrideMessage) {
            let u = (a = Error().stack) !== null && a !== undefined ? a : "<failed to generate stacktrace>";
            l.warn(`Current logger will be overwritten from ${u}`);
            c.warn(`Current logger will overwrite one already registered from ${u}`);
          }
          return (0, XIn.registerGlobal)("diag", c, t, true);
        };
        t.setLogger = n;
        t.disable = () => {
          (0, XIn.unregisterGlobal)("diag", t);
        };
        t.createComponentLogger = r => new kHd.DiagComponentLogger(r);
        t.verbose = e("verbose");
        t.debug = e("debug");
        t.info = e("info");
        t.warn = e("warn");
        t.error = e("error");
      }
      static instance() {
        if (!this._instance) {
          this._instance = new RYr();
        }
        return this._instance;
      }
    }
    QIn.DiagAPI = RYr;
  });
  var RDi = __commonJS(ZIn => {
    Object.defineProperty(ZIn, "__esModule", {
      value: true
    });
    ZIn.BaggageImpl = undefined;
    class yat {
      constructor(e) {
        this._entries = e ? new Map(e) : new Map();
      }
      getEntry(e) {
        let t = this._entries.get(e);
        if (!t) {
          return;
        }
        return Object.assign({}, t);
      }
      getAllEntries() {
        return Array.from(this._entries.entries()).map(([e, t]) => [e, t]);
      }
      setEntry(e, t) {
        let n = new yat(this._entries);
        n._entries.set(e, t);
        return n;
      }
      removeEntry(e) {
        let t = new yat(this._entries);
        t._entries.delete(e);
        return t;
      }
      removeEntries(...e) {
        let t = new yat(this._entries);
        for (let n of e) {
          t._entries.delete(n);
        }
        return t;
      }
      clear() {
        return new yat();
      }
    }
    ZIn.BaggageImpl = yat;
  });
  var xDi = __commonJS(ePn => {
    Object.defineProperty(ePn, "__esModule", {
      value: true
    });
    ePn.baggageEntryMetadataSymbol = undefined;
    ePn.baggageEntryMetadataSymbol = Symbol("BaggageEntryMetadata");
  });
  var xYr = __commonJS(_at => {
    Object.defineProperty(_at, "__esModule", {
      value: true
    });
    _at.baggageEntryMetadataFromString = _at.createBaggage = undefined;
    var PHd = x4e();
    var OHd = RDi();
    var DHd = xDi();
    var MHd = PHd.DiagAPI.instance();
    function NHd(e = {}) {
      return new OHd.BaggageImpl(new Map(Object.entries(e)));
    }
    _at.createBaggage = NHd;
    function LHd(e) {
      if (typeof e !== "string") {
        MHd.error(`Cannot create baggage metadata from unknown type: ${typeof e}`);
        e = "";
      }
      return {
        __TYPE__: DHd.baggageEntryMetadataSymbol,
        toString() {
          return e;
        }
      };
    }
    _at.baggageEntryMetadataFromString = LHd;
  });
  var b2t = __commonJS(bat => {
    Object.defineProperty(bat, "__esModule", {
      value: true
    });
    bat.ROOT_CONTEXT = bat.createContextKey = undefined;
    function FHd(e) {
      return Symbol.for(e);
    }
    bat.createContextKey = FHd;
    class tPn {
      constructor(e) {
        let t = this;
        t._currentContext = e ? new Map(e) : new Map();
        t.getValue = n => t._currentContext.get(n);
        t.setValue = (n, r) => {
          let o = new tPn(t._currentContext);
          o._currentContext.set(n, r);
          return o;
        };
        t.deleteValue = n => {
          let r = new tPn(t._currentContext);
          r._currentContext.delete(n);
          return r;
        };
      }
    }
    bat.ROOT_CONTEXT = new tPn();
  });
  var ADi = __commonJS(nPn => {
    Object.defineProperty(nPn, "__esModule", {
      value: true
    });
    nPn.DiagConsoleLogger = undefined;
    var kYr = [{
      n: "error",
      c: "error"
    }, {
      n: "warn",
      c: "warn"
    }, {
      n: "info",
      c: "info"
    }, {
      n: "debug",
      c: "debug"
    }, {
      n: "verbose",
      c: "trace"
    }];
    class kDi {
      constructor() {
        function e(t) {
          return function (...n) {
            if (console) {
              let r = console[t];
              if (typeof r !== "function") {
                r = console.log;
              }
              if (typeof r === "function") {
                return r.apply(console, n);
              }
            }
          };
        }
        for (let t = 0; t < kYr.length; t++) {
          this[kYr[t].n] = e(kYr[t].c);
        }
      }
    }
    nPn.DiagConsoleLogger = kDi;
  });
  var FYr = __commonJS(bp => {
    Object.defineProperty(bp, "__esModule", {
      value: true
    });
    bp.createNoopMeter = bp.NOOP_OBSERVABLE_UP_DOWN_COUNTER_METRIC = bp.NOOP_OBSERVABLE_GAUGE_METRIC = bp.NOOP_OBSERVABLE_COUNTER_METRIC = bp.NOOP_UP_DOWN_COUNTER_METRIC = bp.NOOP_HISTOGRAM_METRIC = bp.NOOP_GAUGE_METRIC = bp.NOOP_COUNTER_METRIC = bp.NOOP_METER = bp.NoopObservableUpDownCounterMetric = bp.NoopObservableGaugeMetric = bp.NoopObservableCounterMetric = bp.NoopObservableMetric = bp.NoopHistogramMetric = bp.NoopGaugeMetric = bp.NoopUpDownCounterMetric = bp.NoopCounterMetric = bp.NoopMetric = bp.NoopMeter = undefined;
    class AYr {
      constructor() {}
      createGauge(e, t) {
        return bp.NOOP_GAUGE_METRIC;
      }
      createHistogram(e, t) {
        return bp.NOOP_HISTOGRAM_METRIC;
      }
      createCounter(e, t) {
        return bp.NOOP_COUNTER_METRIC;
      }
      createUpDownCounter(e, t) {
        return bp.NOOP_UP_DOWN_COUNTER_METRIC;
      }
      createObservableGauge(e, t) {
        return bp.NOOP_OBSERVABLE_GAUGE_METRIC;
      }
      createObservableCounter(e, t) {
        return bp.NOOP_OBSERVABLE_COUNTER_METRIC;
      }
      createObservableUpDownCounter(e, t) {
        return bp.NOOP_OBSERVABLE_UP_DOWN_COUNTER_METRIC;
      }
      addBatchObservableCallback(e, t) {}
      removeBatchObservableCallback(e) {}
    }
    bp.NoopMeter = AYr;
    class Sat {}
    bp.NoopMetric = Sat;
    class IYr extends Sat {
      add(e, t) {}
    }
    bp.NoopCounterMetric = IYr;
    class PYr extends Sat {
      add(e, t) {}
    }
    bp.NoopUpDownCounterMetric = PYr;
    class OYr extends Sat {
      record(e, t) {}
    }
    bp.NoopGaugeMetric = OYr;
    class DYr extends Sat {
      record(e, t) {}
    }
    bp.NoopHistogramMetric = DYr;
    class S2t {
      addCallback(e) {}
      removeCallback(e) {}
    }
    bp.NoopObservableMetric = S2t;
    class MYr extends S2t {}
    bp.NoopObservableCounterMetric = MYr;
    class NYr extends S2t {}
    bp.NoopObservableGaugeMetric = NYr;
    class LYr extends S2t {}
    bp.NoopObservableUpDownCounterMetric = LYr;
    bp.NOOP_METER = new AYr();
    bp.NOOP_COUNTER_METRIC = new IYr();
    bp.NOOP_GAUGE_METRIC = new OYr();
    bp.NOOP_HISTOGRAM_METRIC = new DYr();
    bp.NOOP_UP_DOWN_COUNTER_METRIC = new PYr();
    bp.NOOP_OBSERVABLE_COUNTER_METRIC = new MYr();
    bp.NOOP_OBSERVABLE_GAUGE_METRIC = new NYr();
    bp.NOOP_OBSERVABLE_UP_DOWN_COUNTER_METRIC = new LYr();
    function UHd() {
      return bp.NOOP_METER;
    }
    bp.createNoopMeter = UHd;
  });
  var IDi = __commonJS(T2t => {
    Object.defineProperty(T2t, "__esModule", {
      value: true
    });
    T2t.ValueType = undefined;
    var BHd;
    (function (e) {
      e[e.INT = 0] = "INT";
      e[e.DOUBLE = 1] = "DOUBLE";
    })(BHd = T2t.ValueType || (T2t.ValueType = {}));
  });
  var UYr = __commonJS(Tat => {
    Object.defineProperty(Tat, "__esModule", {
      value: true
    });
    Tat.defaultTextMapSetter = Tat.defaultTextMapGetter = undefined;
    Tat.defaultTextMapGetter = {
      get(e, t) {
        if (e == null) {
          return;
        }
        return e[t];
      },
      keys(e) {
        if (e == null) {
          return [];
        }
        return Object.keys(e);
      }
    };
    Tat.defaultTextMapSetter = {
      set(e, t, n) {
        if (e == null) {
          return;
        }
        e[t] = n;
      }
    };
  });
  var ODi = __commonJS(rPn => {
    Object.defineProperty(rPn, "__esModule", {
      value: true
    });
    rPn.NoopContextManager = undefined;
    var $Hd = b2t();
    class PDi {
      active() {
        return $Hd.ROOT_CONTEXT;
      }
      with(e, t, n, ...r) {
        return t.call(n, ...r);
      }
      bind(e, t) {
        return t;
      }
      enable() {
        return this;
      }
      disable() {
        return this;
      }
    }
    rPn.NoopContextManager = PDi;
  });
  var E2t = __commonJS(oPn => {
    Object.defineProperty(oPn, "__esModule", {
      value: true
    });
    oPn.ContextAPI = undefined;
    var HHd = ODi();
    var BYr = R4e();
    var DDi = x4e();
    var jHd = new HHd.NoopContextManager();
    class HYr {
      constructor() {}
      static getInstance() {
        if (!this._instance) {
          this._instance = new HYr();
        }
        return this._instance;
      }
      setGlobalContextManager(e) {
        return (0, BYr.registerGlobal)("context", e, DDi.DiagAPI.instance());
      }
      active() {
        return this._getContextManager().active();
      }
      with(e, t, n, ...r) {
        return this._getContextManager().with(e, t, n, ...r);
      }
      bind(e, t) {
        return this._getContextManager().bind(e, t);
      }
      _getContextManager() {
        return (0, BYr.getGlobal)("context") || jHd;
      }
      disable() {
        this._getContextManager().disable();
        (0, BYr.unregisterGlobal)("context", DDi.DiagAPI.instance());
      }
    }
    oPn.ContextAPI = HYr;
  });
  var jYr = __commonJS(v2t => {
    Object.defineProperty(v2t, "__esModule", {
      value: true
    });
    v2t.TraceFlags = undefined;
    var qHd;
    (function (e) {
      e[e.NONE = 0] = "NONE";
      e[e.SAMPLED = 1] = "SAMPLED";
    })(qHd = v2t.TraceFlags || (v2t.TraceFlags = {}));
  });
  var sPn = __commonJS(Dce => {
    Object.defineProperty(Dce, "__esModule", {
      value: true
    });
    Dce.INVALID_SPAN_CONTEXT = Dce.INVALID_TRACEID = Dce.INVALID_SPANID = undefined;
    var WHd = jYr();
    Dce.INVALID_SPANID = "0000000000000000";
    Dce.INVALID_TRACEID = "00000000000000000000000000000000";
    Dce.INVALID_SPAN_CONTEXT = {
      traceId: Dce.INVALID_TRACEID,
      spanId: Dce.INVALID_SPANID,
      traceFlags: WHd.TraceFlags.NONE
    };
  });
  var aPn = __commonJS(iPn => {
    Object.defineProperty(iPn, "__esModule", {
      value: true
    });
    iPn.NonRecordingSpan = undefined;
    var GHd = sPn();
    class MDi {
      constructor(e = GHd.INVALID_SPAN_CONTEXT) {
        this._spanContext = e;
      }
      spanContext() {
        return this._spanContext;
      }
      setAttribute(e, t) {
        return this;
      }
      setAttributes(e) {
        return this;
      }
      addEvent(e, t) {
        return this;
      }
      addLink(e) {
        return this;
      }
      addLinks(e) {
        return this;
      }
      setStatus(e) {
        return this;
      }
      updateName(e) {
        return this;
      }
      end(e) {}
      isRecording() {
        return false;
      }
      recordException(e, t) {}
    }
    iPn.NonRecordingSpan = MDi;
  });
  var GYr = __commonJS(VW => {
    Object.defineProperty(VW, "__esModule", {
      value: true
    });
    VW.getSpanContext = VW.setSpanContext = VW.deleteSpan = VW.setSpan = VW.getActiveSpan = VW.getSpan = undefined;
    var VHd = b2t();
    var zHd = aPn();
    var KHd = E2t();
    var qYr = (0, VHd.createContextKey)("OpenTelemetry Context Key SPAN");
    function WYr(e) {
      return e.getValue(qYr) || undefined;
    }
    VW.getSpan = WYr;
    function YHd() {
      return WYr(KHd.ContextAPI.getInstance().active());
    }
    VW.getActiveSpan = YHd;
    function NDi(e, t) {
      return e.setValue(qYr, t);
    }
    VW.setSpan = NDi;
    function JHd(e) {
      return e.deleteValue(qYr);
    }
    VW.deleteSpan = JHd;
    function XHd(e, t) {
      return NDi(e, new zHd.NonRecordingSpan(t));
    }
    VW.setSpanContext = XHd;
    function QHd(e) {
      var t;
      return (t = WYr(e)) === null || t === undefined ? undefined : t.spanContext();
    }
    VW.getSpanContext = QHd;
  });
  var lPn = __commonJS(Mce => {
    Object.defineProperty(Mce, "__esModule", {
      value: true
    });
    Mce.wrapSpanContext = Mce.isSpanContextValid = Mce.isValidSpanId = Mce.isValidTraceId = undefined;
    var LDi = sPn();
    var ZHd = aPn();
    function FDi(e) {
      return (/^([0-9a-f]{32})$/i).test(e) && e !== LDi.INVALID_TRACEID;
    }
    Mce.isValidTraceId = FDi;
    function UDi(e) {
      return (/^[0-9a-f]{16}$/i).test(e) && e !== LDi.INVALID_SPANID;
    }
    Mce.isValidSpanId = UDi;
    function njd(e) {
      return FDi(e.traceId) && UDi(e.spanId);
    }
    Mce.isSpanContextValid = njd;
    function rjd(e) {
      return new ZHd.NonRecordingSpan(e);
    }
    Mce.wrapSpanContext = rjd;
  });
  var KYr = __commonJS(cPn => {
    Object.defineProperty(cPn, "__esModule", {
      value: true
    });
    cPn.NoopTracer = undefined;
    var ojd = E2t();
    var BDi = GYr();
    var VYr = aPn();
    var sjd = lPn();
    var zYr = ojd.ContextAPI.getInstance();
    class $Di {
      startSpan(e, t, n = zYr.active()) {
        if (Boolean(t === null || t === undefined ? undefined : t.root)) {
          return new VYr.NonRecordingSpan();
        }
        let o = n && (0, BDi.getSpanContext)(n);
        if (ijd(o) && (0, sjd.isSpanContextValid)(o)) {
          return new VYr.NonRecordingSpan(o);
        } else {
          return new VYr.NonRecordingSpan();
        }
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
        let a = s !== null && s !== undefined ? s : zYr.active();
        let l = this.startSpan(e, o, a);
        let c = (0, BDi.setSpan)(a, l);
        return zYr.with(c, i, undefined, l);
      }
    }
    cPn.NoopTracer = $Di;
    function ijd(e) {
      return typeof e === "object" && typeof e.spanId === "string" && typeof e.traceId === "string" && typeof e.traceFlags === "number";
    }
  });
  var YYr = __commonJS(uPn => {
    Object.defineProperty(uPn, "__esModule", {
      value: true
    });
    uPn.ProxyTracer = undefined;
    var ajd = KYr();
    var ljd = new ajd.NoopTracer();
    class HDi {
      constructor(e, t, n, r) {
        this._provider = e;
        this.name = t;
        this.version = n;
        this.options = r;
      }
      startSpan(e, t, n) {
        return this._getTracer().startSpan(e, t, n);
      }
      startActiveSpan(e, t, n, r) {
        let o = this._getTracer();
        return Reflect.apply(o.startActiveSpan, o, arguments);
      }
      _getTracer() {
        if (this._delegate) {
          return this._delegate;
        }
        let e = this._provider.getDelegateTracer(this.name, this.version, this.options);
        if (!e) {
          return ljd;
        }
        this._delegate = e;
        return this._delegate;
      }
    }
    uPn.ProxyTracer = HDi;
  });
  var qDi = __commonJS(dPn => {
    Object.defineProperty(dPn, "__esModule", {
      value: true
    });
    dPn.NoopTracerProvider = undefined;
    var cjd = KYr();
    class jDi {
      getTracer(e, t, n) {
        return new cjd.NoopTracer();
      }
    }
    dPn.NoopTracerProvider = jDi;
  });
  var JYr = __commonJS(pPn => {
    Object.defineProperty(pPn, "__esModule", {
      value: true
    });
    pPn.ProxyTracerProvider = undefined;
    var ujd = YYr();
    var djd = qDi();
    var pjd = new djd.NoopTracerProvider();
    class WDi {
      getTracer(e, t, n) {
        var r;
        return (r = this.getDelegateTracer(e, t, n)) !== null && r !== undefined ? r : new ujd.ProxyTracer(this, e, t, n);
      }
      getDelegate() {
        var e;
        return (e = this._delegate) !== null && e !== undefined ? e : pjd;
      }
      setDelegate(e) {
        this._delegate = e;
      }
      getDelegateTracer(e, t, n) {
        var r;
        return (r = this._delegate) === null || r === undefined ? undefined : r.getTracer(e, t, n);
      }
    }
    pPn.ProxyTracerProvider = WDi;
  });
  var GDi = __commonJS(w2t => {
    Object.defineProperty(w2t, "__esModule", {
      value: true
    });
    w2t.SamplingDecision = undefined;
    var mjd;
    (function (e) {
      e[e.NOT_RECORD = 0] = "NOT_RECORD";
      e[e.RECORD = 1] = "RECORD";
      e[e.RECORD_AND_SAMPLED = 2] = "RECORD_AND_SAMPLED";
    })(mjd = w2t.SamplingDecision || (w2t.SamplingDecision = {}));
  });
  var VDi = __commonJS(C2t => {
    Object.defineProperty(C2t, "__esModule", {
      value: true
    });
    C2t.SpanKind = undefined;
    var fjd;
    (function (e) {
      e[e.INTERNAL = 0] = "INTERNAL";
      e[e.SERVER = 1] = "SERVER";
      e[e.CLIENT = 2] = "CLIENT";
      e[e.PRODUCER = 3] = "PRODUCER";
      e[e.CONSUMER = 4] = "CONSUMER";
    })(fjd = C2t.SpanKind || (C2t.SpanKind = {}));
  });
  var zDi = __commonJS(R2t => {
    Object.defineProperty(R2t, "__esModule", {
      value: true
    });
    R2t.SpanStatusCode = undefined;
    var hjd;
    (function (e) {
      e[e.UNSET = 0] = "UNSET";
      e[e.OK = 1] = "OK";
      e[e.ERROR = 2] = "ERROR";
    })(hjd = R2t.SpanStatusCode || (R2t.SpanStatusCode = {}));
  });
  var KDi = __commonJS(Eat => {
    Object.defineProperty(Eat, "__esModule", {
      value: true
    });
    Eat.validateValue = Eat.validateKey = undefined;
    var gjd = `[a-z]${"[_0-9a-z-*/]"}{0,255}`;
    var yjd = `[a-z0-9]${"[_0-9a-z-*/]"}{0,240}@[a-z]${"[_0-9a-z-*/]"}{0,13}`;
    var _jd = new RegExp(`^(?:${gjd}|${yjd})$`);
    function Tjd(e) {
      return _jd.test(e);
    }
    Eat.validateKey = Tjd;
    function Ejd(e) {
      return (/^[ -~]{0,255}[!-~]$/).test(e) && !(/,|=/).test(e);
    }
    Eat.validateValue = Ejd;
  });
  var ZDi = __commonJS(mPn => {
    Object.defineProperty(mPn, "__esModule", {
      value: true
    });
    mPn.TraceStateImpl = undefined;
    var YDi = KDi();
    class QYr {
      constructor(e) {
        if (this._internalState = new Map(), e) {
          this._parse(e);
        }
      }
      set(e, t) {
        let n = this._clone();
        if (n._internalState.vZc(e)) {
          n._internalState.delete(e);
        }
        n._internalState.set(e, t);
        return n;
      }
      unset(e) {
        let t = this._clone();
        t._internalState.delete(e);
        return t;
      }
      get(e) {
        return this._internalState.get(e);
      }
      serialize() {
        return this._keys().reduce((e, t) => (e.push(t + "=" + this.get(t)), e), []).join(",");
      }
      _parse(e) {
        if (e.length > 512) {
          return;
        }
        if (this._internalState = e.split(",").reverse().reduce((t, n) => {
          let r = n.trim();
          let o = r.indexOf("=");
          if (o !== -1) {
            let s = r.slice(0, o);
            let i = r.slice(o + 1, n.length);
            if ((0, YDi.validateKey)(s) && (0, YDi.validateValue)(i)) {
              t.set(s, i);
            }
          }
          return t;
        }, new Map()), this._internalState.size > 32) {
          this._internalState = new Map(Array.from(this._internalState.entries()).reverse().slice(0, 32));
        }
      }
      _keys() {
        return Array.from(this._internalState.keys()).reverse();
      }
      _clone() {
        let e = new QYr();
        e._internalState = new Map(this._internalState);
        return e;
      }
    }
    mPn.TraceStateImpl = QYr;
  });
  var eMi = __commonJS(fPn => {
    Object.defineProperty(fPn, "__esModule", {
      value: true
    });
    fPn.createTraceState = undefined;
    var wjd = ZDi();
    function Cjd(e) {
      return new wjd.TraceStateImpl(e);
    }
    fPn.createTraceState = Cjd;
  });
  var tMi = __commonJS(hPn => {
    Object.defineProperty(hPn, "__esModule", {
      value: true
    });
    hPn.context = undefined;
    var Rjd = E2t();
    hPn.context = Rjd.ContextAPI.getInstance();
  });
  var nMi = __commonJS(gPn => {
    Object.defineProperty(gPn, "__esModule", {
      value: true
    });
    gPn.diag = undefined;
    var xjd = x4e();
    gPn.diag = xjd.DiagAPI.instance();
  });
  var rMi = __commonJS(vat => {
    Object.defineProperty(vat, "__esModule", {
      value: true
    });
    vat.NOOP_METER_PROVIDER = vat.NoopMeterProvider = undefined;
    var kjd = FYr();
    class ZYr {
      getMeter(e, t, n) {
        return kjd.NOOP_METER;
      }
    }
    vat.NoopMeterProvider = ZYr;
    vat.NOOP_METER_PROVIDER = new ZYr();
  });
  var sMi = __commonJS(yPn => {
    Object.defineProperty(yPn, "__esModule", {
      value: true
    });
    yPn.MetricsAPI = undefined;
    var Ajd = rMi();
    var eJr = R4e();
    var oMi = x4e();
    class nJr {
      constructor() {}
      static getInstance() {
        if (!this._instance) {
          this._instance = new nJr();
        }
        return this._instance;
      }
      setGlobalMeterProvider(e) {
        return (0, eJr.registerGlobal)("metrics", e, oMi.DiagAPI.instance());
      }
      getMeterProvider() {
        return (0, eJr.getGlobal)("metrics") || Ajd.NOOP_METER_PROVIDER;
      }
      getMeter(e, t, n) {
        return this.getMeterProvider().getMeter(e, t, n);
      }
      disable() {
        (0, eJr.unregisterGlobal)("metrics", oMi.DiagAPI.instance());
      }
    }
    yPn.MetricsAPI = nJr;
  });
  var iMi = __commonJS(_Pn => {
    Object.defineProperty(_Pn, "__esModule", {
      value: true
    });
    _Pn.metrics = undefined;
    var Ijd = sMi();
    _Pn.metrics = Ijd.MetricsAPI.getInstance();
  });
  var lMi = __commonJS(bPn => {
    Object.defineProperty(bPn, "__esModule", {
      value: true
    });
    bPn.NoopTextMapPropagator = undefined;
    class aMi {
      inject(e, t) {}
      extract(e, t) {
        return e;
      }
      fields() {
        return [];
      }
    }
    bPn.NoopTextMapPropagator = aMi;
  });
  var uMi = __commonJS(Nce => {
    Object.defineProperty(Nce, "__esModule", {
      value: true
    });
    Nce.deleteBaggage = Nce.setBaggage = Nce.getActiveBaggage = Nce.getBaggage = undefined;
    var Pjd = E2t();
    var Ojd = b2t();
    var rJr = (0, Ojd.createContextKey)("OpenTelemetry Baggage Key");
    function cMi(e) {
      return e.getValue(rJr) || undefined;
    }
    Nce.getBaggage = cMi;
    function Djd() {
      return cMi(Pjd.ContextAPI.getInstance().active());
    }
    Nce.getActiveBaggage = Djd;
    function Mjd(e, t) {
      return e.setValue(rJr, t);
    }
    Nce.setBaggage = Mjd;
    function Njd(e) {
      return e.deleteValue(rJr);
    }
    Nce.deleteBaggage = Njd;
  });
  var mMi = __commonJS(TPn => {
    Object.defineProperty(TPn, "__esModule", {
      value: true
    });
    TPn.PropagationAPI = undefined;
    var oJr = R4e();
    var Ljd = lMi();
    var dMi = UYr();
    var SPn = uMi();
    var Fjd = xYr();
    var pMi = x4e();
    var Ujd = new Ljd.NoopTextMapPropagator();
    class iJr {
      constructor() {
        this.createBaggage = Fjd.createBaggage;
        this.getBaggage = SPn.getBaggage;
        this.getActiveBaggage = SPn.getActiveBaggage;
        this.setBaggage = SPn.setBaggage;
        this.deleteBaggage = SPn.deleteBaggage;
      }
      static getInstance() {
        if (!this._instance) {
          this._instance = new iJr();
        }
        return this._instance;
      }
      setGlobalPropagator(e) {
        return (0, oJr.registerGlobal)("propagation", e, pMi.DiagAPI.instance());
      }
      inject(e, t, n = dMi.defaultTextMapSetter) {
        return this._getGlobalPropagator().inject(e, t, n);
      }
      extract(e, t, n = dMi.defaultTextMapGetter) {
        return this._getGlobalPropagator().extract(e, t, n);
      }
      fields() {
        return this._getGlobalPropagator().fields();
      }
      disable() {
        (0, oJr.unregisterGlobal)("propagation", pMi.DiagAPI.instance());
      }
      _getGlobalPropagator() {
        return (0, oJr.getGlobal)("propagation") || Ujd;
      }
    }
    TPn.PropagationAPI = iJr;
  });
  var fMi = __commonJS(EPn => {
    Object.defineProperty(EPn, "__esModule", {
      value: true
    });
    EPn.propagation = undefined;
    var Bjd = mMi();
    EPn.propagation = Bjd.PropagationAPI.getInstance();
  });
  var _Mi = __commonJS(vPn => {
    Object.defineProperty(vPn, "__esModule", {
      value: true
    });
    vPn.TraceAPI = undefined;
    var aJr = R4e();
    var hMi = JYr();
    var gMi = lPn();
    var wat = GYr();
    var yMi = x4e();
    class cJr {
      constructor() {
        this._proxyTracerProvider = new hMi.ProxyTracerProvider();
        this.wrapSpanContext = gMi.wrapSpanContext;
        this.isSpanContextValid = gMi.isSpanContextValid;
        this.deleteSpan = wat.deleteSpan;
        this.getSpan = wat.getSpan;
        this.getActiveSpan = wat.getActiveSpan;
        this.getSpanContext = wat.getSpanContext;
        this.setSpan = wat.setSpan;
        this.setSpanContext = wat.setSpanContext;
      }
      static getInstance() {
        if (!this._instance) {
          this._instance = new cJr();
        }
        return this._instance;
      }
      setGlobalTracerProvider(e) {
        let t = (0, aJr.registerGlobal)("trace", this._proxyTracerProvider, yMi.DiagAPI.instance());
        if (t) {
          this._proxyTracerProvider.setDelegate(e);
        }
        return t;
      }
      getTracerProvider() {
        return (0, aJr.getGlobal)("trace") || this._proxyTracerProvider;
      }
      getTracer(e, t) {
        return this.getTracerProvider().getTracer(e, t);
      }
      disable() {
        (0, aJr.unregisterGlobal)("trace", yMi.DiagAPI.instance());
        this._proxyTracerProvider = new hMi.ProxyTracerProvider();
      }
    }
    vPn.TraceAPI = cJr;
  });
  var bMi = __commonJS(wPn => {
    Object.defineProperty(wPn, "__esModule", {
      value: true
    });
    wPn.trace = undefined;
    var $jd = _Mi();
    wPn.trace = $jd.TraceAPI.getInstance();
  });
  var Ji = __commonJS(Au => {
    Object.defineProperty(Au, "__esModule", {
      value: true
    });
    Au.trace = Au.propagation = Au.metrics = Au.diag = Au.context = Au.INVALID_SPAN_CONTEXT = Au.INVALID_TRACEID = Au.INVALID_SPANID = Au.isValidSpanId = Au.isValidTraceId = Au.isSpanContextValid = Au.createTraceState = Au.TraceFlags = Au.SpanStatusCode = Au.SpanKind = Au.SamplingDecision = Au.ProxyTracerProvider = Au.ProxyTracer = Au.defaultTextMapSetter = Au.defaultTextMapGetter = Au.ValueType = Au.createNoopMeter = Au.DiagLogLevel = Au.DiagConsoleLogger = Au.ROOT_CONTEXT = Au.createContextKey = Au.baggageEntryMetadataFromString = undefined;
    var Hjd = xYr();
    Object.defineProperty(Au, "baggageEntryMetadataFromString", {
      enumerable: true,
      get: function () {
        return Hjd.baggageEntryMetadataFromString;
      }
    });
    var SMi = b2t();
    Object.defineProperty(Au, "createContextKey", {
      enumerable: true,
      get: function () {
        return SMi.createContextKey;
      }
    });
    Object.defineProperty(Au, "ROOT_CONTEXT", {
      enumerable: true,
      get: function () {
        return SMi.ROOT_CONTEXT;
      }
    });
    var jjd = ADi();
    Object.defineProperty(Au, "DiagConsoleLogger", {
      enumerable: true,
      get: function () {
        return jjd.DiagConsoleLogger;
      }
    });
    var qjd = YIn();
    Object.defineProperty(Au, "DiagLogLevel", {
      enumerable: true,
      get: function () {
        return qjd.DiagLogLevel;
      }
    });
    var Wjd = FYr();
    Object.defineProperty(Au, "createNoopMeter", {
      enumerable: true,
      get: function () {
        return Wjd.createNoopMeter;
      }
    });
    var Gjd = IDi();
    Object.defineProperty(Au, "ValueType", {
      enumerable: true,
      get: function () {
        return Gjd.ValueType;
      }
    });
    var TMi = UYr();
    Object.defineProperty(Au, "defaultTextMapGetter", {
      enumerable: true,
      get: function () {
        return TMi.defaultTextMapGetter;
      }
    });
    Object.defineProperty(Au, "defaultTextMapSetter", {
      enumerable: true,
      get: function () {
        return TMi.defaultTextMapSetter;
      }
    });
    var Vjd = YYr();
    Object.defineProperty(Au, "ProxyTracer", {
      enumerable: true,
      get: function () {
        return Vjd.ProxyTracer;
      }
    });
    var zjd = JYr();
    Object.defineProperty(Au, "ProxyTracerProvider", {
      enumerable: true,
      get: function () {
        return zjd.ProxyTracerProvider;
      }
    });
    var Kjd = GDi();
    Object.defineProperty(Au, "SamplingDecision", {
      enumerable: true,
      get: function () {
        return Kjd.SamplingDecision;
      }
    });
    var Yjd = VDi();
    Object.defineProperty(Au, "SpanKind", {
      enumerable: true,
      get: function () {
        return Yjd.SpanKind;
      }
    });
    var Jjd = zDi();
    Object.defineProperty(Au, "SpanStatusCode", {
      enumerable: true,
      get: function () {
        return Jjd.SpanStatusCode;
      }
    });
    var Xjd = jYr();
    Object.defineProperty(Au, "TraceFlags", {
      enumerable: true,
      get: function () {
        return Xjd.TraceFlags;
      }
    });
    var Qjd = eMi();
    Object.defineProperty(Au, "createTraceState", {
      enumerable: true,
      get: function () {
        return Qjd.createTraceState;
      }
    });
    var uJr = lPn();
    Object.defineProperty(Au, "isSpanContextValid", {
      enumerable: true,
      get: function () {
        return uJr.isSpanContextValid;
      }
    });
    Object.defineProperty(Au, "isValidTraceId", {
      enumerable: true,
      get: function () {
        return uJr.isValidTraceId;
      }
    });
    Object.defineProperty(Au, "isValidSpanId", {
      enumerable: true,
      get: function () {
        return uJr.isValidSpanId;
      }
    });
    var dJr = sPn();
    Object.defineProperty(Au, "INVALID_SPANID", {
      enumerable: true,
      get: function () {
        return dJr.INVALID_SPANID;
      }
    });
    Object.defineProperty(Au, "INVALID_TRACEID", {
      enumerable: true,
      get: function () {
        return dJr.INVALID_TRACEID;
      }
    });
    Object.defineProperty(Au, "INVALID_SPAN_CONTEXT", {
      enumerable: true,
      get: function () {
        return dJr.INVALID_SPAN_CONTEXT;
      }
    });
    var EMi = tMi();
    Object.defineProperty(Au, "context", {
      enumerable: true,
      get: function () {
        return EMi.context;
      }
    });
    var vMi = nMi();
    Object.defineProperty(Au, "diag", {
      enumerable: true,
      get: function () {
        return vMi.diag;
      }
    });
    var wMi = iMi();
    Object.defineProperty(Au, "metrics", {
      enumerable: true,
      get: function () {
        return wMi.metrics;
      }
    });
    var CMi = fMi();
    Object.defineProperty(Au, "propagation", {
      enumerable: true,
      get: function () {
        return CMi.propagation;
      }
    });
    var RMi = bMi();
    Object.defineProperty(Au, "trace", {
      enumerable: true,
      get: function () {
        return RMi.trace;
      }
    });
    Au.default = {
      context: EMi.context,
      diag: vMi.diag,
      metrics: wMi.metrics,
      propagation: CMi.propagation,
      trace: RMi.trace
    };
  });
  var x2t = __commonJS(vIe => {
    Object.defineProperty(vIe, "__esModule", {
      value: true
    });
    vIe.isTracingSuppressed = vIe.unsuppressTracing = vIe.suppressTracing = undefined;
    var Zjd = Ji();
    var pJr = (0, Zjd.createContextKey)("OpenTelemetry SDK Context Key SUPPRESS_TRACING");
    function eqd(e) {
      return e.setValue(pJr, true);
    }
    vIe.suppressTracing = eqd;
    function tqd(e) {
      return e.deleteValue(pJr);
    }
    vIe.unsuppressTracing = tqd;
    function nqd(e) {
      return e.getValue(pJr) === true;
    }
    vIe.isTracingSuppressed = nqd;
  });
  var mJr = __commonJS(w2 => {
    Object.defineProperty(w2, "__esModule", {
      value: true
    });
    w2.BAGGAGE_MAX_TOTAL_LENGTH = w2.BAGGAGE_MAX_PER_NAME_VALUE_PAIRS = w2.BAGGAGE_MAX_NAME_VALUE_PAIRS = w2.BAGGAGE_HEADER = w2.BAGGAGE_ITEMS_SEPARATOR = w2.BAGGAGE_PROPERTIES_SEPARATOR = w2.BAGGAGE_KEY_PAIR_SEPARATOR = undefined;
    w2.BAGGAGE_KEY_PAIR_SEPARATOR = "=";
    w2.BAGGAGE_PROPERTIES_SEPARATOR = ";";
    w2.BAGGAGE_ITEMS_SEPARATOR = ",";
    w2.BAGGAGE_HEADER = "baggage";
    w2.BAGGAGE_MAX_NAME_VALUE_PAIRS = 180;
    w2.BAGGAGE_MAX_PER_NAME_VALUE_PAIRS = 4096;
    w2.BAGGAGE_MAX_TOTAL_LENGTH = 8192;
  });
  var fJr = __commonJS(Lce => {
    Object.defineProperty(Lce, "__esModule", {
      value: true
    });
    Lce.parseKeyPairsIntoRecord = Lce.parsePairKeyValue = Lce.getKeyPairs = Lce.serializeKeyPairs = undefined;
    var rqd = Ji();
    var k4e = mJr();
    function oqd(e) {
      return e.reduce((t, n) => {
        let r = `${t}${t !== "" ? k4e.BAGGAGE_ITEMS_SEPARATOR : ""}${n}`;
        return r.length > k4e.BAGGAGE_MAX_TOTAL_LENGTH ? t : r;
      }, "");
    }
    Lce.serializeKeyPairs = oqd;
    function sqd(e) {
      return e.getAllEntries().map(([t, n]) => {
        let r = `${encodeURIComponent(t)}=${encodeURIComponent(n.value)}`;
        if (n.metadata !== undefined) {
          r += k4e.BAGGAGE_PROPERTIES_SEPARATOR + n.metadata.toString();
        }
        return r;
      });
    }
    Lce.getKeyPairs = sqd;
    function xMi(e) {
      let t = e.split(k4e.BAGGAGE_PROPERTIES_SEPARATOR);
      if (t.length <= 0) {
        return;
      }
      let n = t.shift();
      if (!n) {
        return;
      }
      let r = n.indexOf(k4e.BAGGAGE_KEY_PAIR_SEPARATOR);
      if (r <= 0) {
        return;
      }
      let o = decodeURIComponent(n.substring(0, r).trim());
      let s = decodeURIComponent(n.substring(r + 1).trim());
      let i;
      if (t.length > 0) {
        i = (0, rqd.baggageEntryMetadataFromString)(t.join(k4e.BAGGAGE_PROPERTIES_SEPARATOR));
      }
      return {
        key: o,
        value: s,
        metadata: i
      };
    }
    Lce.parsePairKeyValue = xMi;
    function iqd(e) {
      let t = {};
      if (typeof e === "string" && e.length > 0) {
        e.split(k4e.BAGGAGE_ITEMS_SEPARATOR).forEach(n => {
          let r = xMi(n);
          if (r !== undefined && r.value.length > 0) {
            t[r.key] = r.value;
          }
        });
      }
      return t;
    }
    Lce.parseKeyPairsIntoRecord = iqd;
  });
  var AMi = __commonJS(CPn => {
    Object.defineProperty(CPn, "__esModule", {
      value: true
    });
    CPn.W3CBaggagePropagator = undefined;
    var hJr = Ji();
    var aqd = x2t();
    var A4e = mJr();
    var gJr = fJr();
    class kMi {
      inject(e, t, n) {
        let r = hJr.propagation.getBaggage(e);
        if (!r || (0, aqd.isTracingSuppressed)(e)) {
          return;
        }
        let o = (0, gJr.getKeyPairs)(r).filter(i => i.length <= A4e.BAGGAGE_MAX_PER_NAME_VALUE_PAIRS).slice(0, A4e.BAGGAGE_MAX_NAME_VALUE_PAIRS);
        let s = (0, gJr.serializeKeyPairs)(o);
        if (s.length > 0) {
          n.set(t, A4e.BAGGAGE_HEADER, s);
        }
      }
      extract(e, t, n) {
        let r = n.get(t, A4e.BAGGAGE_HEADER);
        let o = Array.isArray(r) ? r.join(A4e.BAGGAGE_ITEMS_SEPARATOR) : r;
        if (!o) {
          return e;
        }
        let s = {};
        if (o.length === 0) {
          return e;
        }
        if (o.split(A4e.BAGGAGE_ITEMS_SEPARATOR).forEach(a => {
          let l = (0, gJr.parsePairKeyValue)(a);
          if (l) {
            let c = {
              value: l.value
            };
            if (l.metadata) {
              c.metadata = l.metadata;
            }
            s[l.key] = c;
          }
        }), Object.entries(s).length === 0) {
          return e;
        }
        return hJr.propagation.setBaggage(e, hJr.propagation.createBaggage(s));
      }
      fields() {
        return [A4e.BAGGAGE_HEADER];
      }
    }
    CPn.W3CBaggagePropagator = kMi;
  });
  var PMi = __commonJS(RPn => {
    Object.defineProperty(RPn, "__esModule", {
      value: true
    });
    RPn.AnchoredClock = undefined;
    class IMi {
      _monotonicClock;
      _epochMillis;
      _performanceMillis;
      constructor(e, t) {
        this._monotonicClock = t;
        this._epochMillis = e.now();
        this._performanceMillis = t.now();
      }
      now() {
        let e = this._monotonicClock.now() - this._performanceMillis;
        return this._epochMillis + e;
      }
    }
    RPn.AnchoredClock = IMi;
  });
  var LMi = __commonJS(wIe => {
    Object.defineProperty(wIe, "__esModule", {
      value: true
    });
    wIe.isAttributeValue = wIe.isAttributeKey = wIe.sanitizeAttributes = undefined;
    var OMi = Ji();
    function lqd(e) {
      let t = {};
      if (typeof e !== "object" || e == null) {
        return t;
      }
      for (let n in e) {
        if (!Object.prototype.hasOwnProperty.call(e, n)) {
          continue;
        }
        if (!DMi(n)) {
          OMi.diag.warn(`Invalid attribute key: ${n}`);
          continue;
        }
        let r = e[n];
        if (!MMi(r)) {
          OMi.diag.warn(`Invalid attribute value set for key: ${n}`);
          continue;
        }
        if (Array.isArray(r)) {
          t[n] = r.slice();
        } else {
          t[n] = r;
        }
      }
      return t;
    }
    wIe.sanitizeAttributes = lqd;
    function DMi(e) {
      return typeof e === "string" && e !== "";
    }
    wIe.isAttributeKey = DMi;
    function MMi(e) {
      if (e == null) {
        return true;
      }
      if (Array.isArray(e)) {
        return cqd(e);
      }
      return NMi(typeof e);
    }
    wIe.isAttributeValue = MMi;
    function cqd(e) {
      let t;
      for (let n of e) {
        if (n == null) {
          continue;
        }
        let r = typeof n;
        if (r === t) {
          continue;
        }
        if (!t) {
          if (NMi(r)) {
            t = r;
            continue;
          }
          return false;
        }
        return false;
      }
      return true;
    }
    function NMi(e) {
      switch (e) {
        case "number":
        case "boolean":
        case "string":
          return true;
      }
      return false;
    }
  });
  var yJr = __commonJS(xPn => {
    Object.defineProperty(xPn, "__esModule", {
      value: true
    });
    xPn.loggingErrorHandler = undefined;
    var uqd = Ji();
    function dqd() {
      return e => {
        uqd.diag.error(pqd(e));
      };
    }
    xPn.loggingErrorHandler = dqd;
    function pqd(e) {
      if (typeof e === "string") {
        return e;
      } else {
        return JSON.stringify(mqd(e));
      }
    }
    function mqd(e) {
      let t = {};
      let n = e;
      while (n !== null) {
        Object.getOwnPropertyNames(n).forEach(r => {
          if (t[r]) {
            return;
          }
          let o = n[r];
          if (o) {
            t[r] = String(o);
          }
        });
        n = Object.getPrototypeOf(n);
      }
      return t;
    }
  });
  var UMi = __commonJS(Cat => {
    Object.defineProperty(Cat, "__esModule", {
      value: true
    });
    Cat.globalErrorHandler = Cat.setGlobalErrorHandler = undefined;
    var fqd = yJr();
    var FMi = (0, fqd.loggingErrorHandler)();
    function hqd(e) {
      FMi = e;
    }
    Cat.setGlobalErrorHandler = hqd;
    function gqd(e) {
      try {
        FMi(e);
      } catch {}
    }
    Cat.globalErrorHandler = gqd;
  });
  var jMi = __commonJS(Fce => {
    Object.defineProperty(Fce, "__esModule", {
      value: true
    });
    Fce.getStringListFromEnv = Fce.getBooleanFromEnv = Fce.getStringFromEnv = Fce.getNumberFromEnv = undefined;
    var BMi = Ji();
    var $Mi = require("util");
    function yqd(e) {
      let t = process.env[e];
      if (t == null || t.trim() === "") {
        return;
      }
      let n = Number(t);
      if (isNaN(n)) {
        BMi.diag.warn(`Unknown value ${(0, $Mi.inspect)(t)} for ${e}, expected a number, using defaults`);
        return;
      }
      return n;
    }
    Fce.getNumberFromEnv = yqd;
    function HMi(e) {
      let t = process.env[e];
      if (t == null || t.trim() === "") {
        return;
      }
      return t;
    }
    Fce.getStringFromEnv = HMi;
    function _qd(e) {
      let t = process.env[e]?.trim().toLowerCase();
      if (t == null || t === "") {
        return false;
      }
      if (t === "true") {
        return true;
      } else if (t === "false") {
        return false;
      } else {
        BMi.diag.warn(`Unknown value ${(0, $Mi.inspect)(t)} for ${e}, expected 'true' or 'false', falling back to 'false' (default)`);
        return false;
      }
    }
    Fce.getBooleanFromEnv = _qd;
    function bqd(e) {
      return HMi(e)?.split(",").map(t => t.trim()).filter(t => t !== "");
    }
    Fce.getStringListFromEnv = bqd;
  });
  var qMi = __commonJS(kPn => {
    Object.defineProperty(kPn, "__esModule", {
      value: true
    });
    kPn._globalThis = undefined;
    kPn._globalThis = typeof globalThis === "object" ? globalThis : global;
  });
  var WMi = __commonJS(APn => {
    Object.defineProperty(APn, "__esModule", {
      value: true
    });
    APn.otperformance = undefined;
    var Sqd = require("perf_hooks");
    APn.otperformance = Sqd.performance;
  });
  var GMi = __commonJS(IPn => {
    Object.defineProperty(IPn, "__esModule", {
      value: true
    });
    IPn.VERSION = undefined;
    IPn.VERSION = "2.2.0";
  });
  var _Jr = __commonJS(PPn => {
    Object.defineProperty(PPn, "__esModule", {
      value: true
    });
    PPn.createConstMap = undefined;
    function Tqd(e) {
      let t = {};
      let n = e.length;
      for (let r = 0; r < n; r++) {
        let o = e[r];
        if (o) {
          t[String(o).toUpperCase().replace(/[-.]/g, "_")] = o;
        }
      }
      return t;
    }
    PPn.createConstMap = Tqd;
  });
  var NUi = __commonJS(tt => {
    Object.defineProperty(tt, "__esModule", {
      value: true
    });
    tt.SEMATTRS_NET_HOST_CARRIER_ICC = tt.SEMATTRS_NET_HOST_CARRIER_MNC = tt.SEMATTRS_NET_HOST_CARRIER_MCC = tt.SEMATTRS_NET_HOST_CARRIER_NAME = tt.SEMATTRS_NET_HOST_CONNECTION_SUBTYPE = tt.SEMATTRS_NET_HOST_CONNECTION_TYPE = tt.SEMATTRS_NET_HOST_NAME = tt.SEMATTRS_NET_HOST_PORT = tt.SEMATTRS_NET_HOST_IP = tt.SEMATTRS_NET_PEER_NAME = tt.SEMATTRS_NET_PEER_PORT = tt.SEMATTRS_NET_PEER_IP = tt.SEMATTRS_NET_TRANSPORT = tt.SEMATTRS_FAAS_INVOKED_REGION = tt.SEMATTRS_FAAS_INVOKED_PROVIDER = tt.SEMATTRS_FAAS_INVOKED_NAME = tt.SEMATTRS_FAAS_COLDSTART = tt.SEMATTRS_FAAS_CRON = tt.SEMATTRS_FAAS_TIME = tt.SEMATTRS_FAAS_DOCUMENT_NAME = tt.SEMATTRS_FAAS_DOCUMENT_TIME = tt.SEMATTRS_FAAS_DOCUMENT_OPERATION = tt.SEMATTRS_FAAS_DOCUMENT_COLLECTION = tt.SEMATTRS_FAAS_EXECUTION = tt.SEMATTRS_FAAS_TRIGGER = tt.SEMATTRS_EXCEPTION_ESCAPED = tt.SEMATTRS_EXCEPTION_STACKTRACE = tt.SEMATTRS_EXCEPTION_MESSAGE = tt.SEMATTRS_EXCEPTION_TYPE = tt.SEMATTRS_DB_SQL_TABLE = tt.SEMATTRS_DB_MONGODB_COLLECTION = tt.SEMATTRS_DB_REDIS_DATABASE_INDEX = tt.SEMATTRS_DB_HBASE_NAMESPACE = tt.SEMATTRS_DB_CASSANDRA_COORDINATOR_DC = tt.SEMATTRS_DB_CASSANDRA_COORDINATOR_ID = tt.SEMATTRS_DB_CASSANDRA_SPECULATIVE_EXECUTION_COUNT = tt.SEMATTRS_DB_CASSANDRA_IDEMPOTENCE = tt.SEMATTRS_DB_CASSANDRA_TABLE = tt.SEMATTRS_DB_CASSANDRA_CONSISTENCY_LEVEL = tt.SEMATTRS_DB_CASSANDRA_PAGE_SIZE = tt.SEMATTRS_DB_CASSANDRA_KEYSPACE = tt.SEMATTRS_DB_MSSQL_INSTANCE_NAME = tt.SEMATTRS_DB_OPERATION = tt.SEMATTRS_DB_STATEMENT = tt.SEMATTRS_DB_NAME = tt.SEMATTRS_DB_JDBC_DRIVER_CLASSNAME = tt.SEMATTRS_DB_USER = tt.SEMATTRS_DB_CONNECTION_STRING = tt.SEMATTRS_DB_SYSTEM = tt.SEMATTRS_AWS_LAMBDA_INVOKED_ARN = undefined;
    tt.SEMATTRS_MESSAGING_DESTINATION_KIND = tt.SEMATTRS_MESSAGING_DESTINATION = tt.SEMATTRS_MESSAGING_SYSTEM = tt.SEMATTRS_AWS_DYNAMODB_GLOBAL_SECONDARY_INDEX_UPDATES = tt.SEMATTRS_AWS_DYNAMODB_ATTRIBUTE_DEFINITIONS = tt.SEMATTRS_AWS_DYNAMODB_SCANNED_COUNT = tt.SEMATTRS_AWS_DYNAMODB_COUNT = tt.SEMATTRS_AWS_DYNAMODB_TOTAL_SEGMENTS = tt.SEMATTRS_AWS_DYNAMODB_SEGMENT = tt.SEMATTRS_AWS_DYNAMODB_SCAN_FORWARD = tt.SEMATTRS_AWS_DYNAMODB_TABLE_COUNT = tt.SEMATTRS_AWS_DYNAMODB_EXCLUSIVE_START_TABLE = tt.SEMATTRS_AWS_DYNAMODB_LOCAL_SECONDARY_INDEXES = tt.SEMATTRS_AWS_DYNAMODB_GLOBAL_SECONDARY_INDEXES = tt.SEMATTRS_AWS_DYNAMODB_SELECT = tt.SEMATTRS_AWS_DYNAMODB_INDEX_NAME = tt.SEMATTRS_AWS_DYNAMODB_ATTRIBUTES_TO_GET = tt.SEMATTRS_AWS_DYNAMODB_LIMIT = tt.SEMATTRS_AWS_DYNAMODB_PROJECTION = tt.SEMATTRS_AWS_DYNAMODB_CONSISTENT_READ = tt.SEMATTRS_AWS_DYNAMODB_PROVISIONED_WRITE_CAPACITY = tt.SEMATTRS_AWS_DYNAMODB_PROVISIONED_READ_CAPACITY = tt.SEMATTRS_AWS_DYNAMODB_ITEM_COLLECTION_METRICS = tt.SEMATTRS_AWS_DYNAMODB_CONSUMED_CAPACITY = tt.SEMATTRS_AWS_DYNAMODB_TABLE_NAMES = tt.SEMATTRS_HTTP_CLIENT_IP = tt.SEMATTRS_HTTP_ROUTE = tt.SEMATTRS_HTTP_SERVER_NAME = tt.SEMATTRS_HTTP_RESPONSE_CONTENT_LENGTH_UNCOMPRESSED = tt.SEMATTRS_HTTP_RESPONSE_CONTENT_LENGTH = tt.SEMATTRS_HTTP_REQUEST_CONTENT_LENGTH_UNCOMPRESSED = tt.SEMATTRS_HTTP_REQUEST_CONTENT_LENGTH = tt.SEMATTRS_HTTP_USER_AGENT = tt.SEMATTRS_HTTP_FLAVOR = tt.SEMATTRS_HTTP_STATUS_CODE = tt.SEMATTRS_HTTP_SCHEME = tt.SEMATTRS_HTTP_HOST = tt.SEMATTRS_HTTP_TARGET = tt.SEMATTRS_HTTP_URL = tt.SEMATTRS_HTTP_METHOD = tt.SEMATTRS_CODE_LINENO = tt.SEMATTRS_CODE_FILEPATH = tt.SEMATTRS_CODE_NAMESPACE = tt.SEMATTRS_CODE_FUNCTION = tt.SEMATTRS_THREAD_NAME = tt.SEMATTRS_THREAD_ID = tt.SEMATTRS_ENDUSER_SCOPE = tt.SEMATTRS_ENDUSER_ROLE = tt.SEMATTRS_ENDUSER_ID = tt.SEMATTRS_PEER_SERVICE = undefined;
    tt.DBSYSTEMVALUES_FILEMAKER = tt.DBSYSTEMVALUES_DERBY = tt.DBSYSTEMVALUES_FIREBIRD = tt.DBSYSTEMVALUES_ADABAS = tt.DBSYSTEMVALUES_CACHE = tt.DBSYSTEMVALUES_EDB = tt.DBSYSTEMVALUES_FIRSTSQL = tt.DBSYSTEMVALUES_INGRES = tt.DBSYSTEMVALUES_HANADB = tt.DBSYSTEMVALUES_MAXDB = tt.DBSYSTEMVALUES_PROGRESS = tt.DBSYSTEMVALUES_HSQLDB = tt.DBSYSTEMVALUES_CLOUDSCAPE = tt.DBSYSTEMVALUES_HIVE = tt.DBSYSTEMVALUES_REDSHIFT = tt.DBSYSTEMVALUES_POSTGRESQL = tt.DBSYSTEMVALUES_DB2 = tt.DBSYSTEMVALUES_ORACLE = tt.DBSYSTEMVALUES_MYSQL = tt.DBSYSTEMVALUES_MSSQL = tt.DBSYSTEMVALUES_OTHER_SQL = tt.SemanticAttributes = tt.SEMATTRS_MESSAGE_UNCOMPRESSED_SIZE = tt.SEMATTRS_MESSAGE_COMPRESSED_SIZE = tt.SEMATTRS_MESSAGE_ID = tt.SEMATTRS_MESSAGE_TYPE = tt.SEMATTRS_RPC_JSONRPC_ERROR_MESSAGE = tt.SEMATTRS_RPC_JSONRPC_ERROR_CODE = tt.SEMATTRS_RPC_JSONRPC_REQUEST_ID = tt.SEMATTRS_RPC_JSONRPC_VERSION = tt.SEMATTRS_RPC_GRPC_STATUS_CODE = tt.SEMATTRS_RPC_METHOD = tt.SEMATTRS_RPC_SERVICE = tt.SEMATTRS_RPC_SYSTEM = tt.SEMATTRS_MESSAGING_KAFKA_TOMBSTONE = tt.SEMATTRS_MESSAGING_KAFKA_PARTITION = tt.SEMATTRS_MESSAGING_KAFKA_CLIENT_ID = tt.SEMATTRS_MESSAGING_KAFKA_CONSUMER_GROUP = tt.SEMATTRS_MESSAGING_KAFKA_MESSAGE_KEY = tt.SEMATTRS_MESSAGING_RABBITMQ_ROUTING_KEY = tt.SEMATTRS_MESSAGING_CONSUMER_ID = tt.SEMATTRS_MESSAGING_OPERATION = tt.SEMATTRS_MESSAGING_MESSAGE_PAYLOAD_COMPRESSED_SIZE_BYTES = tt.SEMATTRS_MESSAGING_MESSAGE_PAYLOAD_SIZE_BYTES = tt.SEMATTRS_MESSAGING_CONVERSATION_ID = tt.SEMATTRS_MESSAGING_MESSAGE_ID = tt.SEMATTRS_MESSAGING_URL = tt.SEMATTRS_MESSAGING_PROTOCOL_VERSION = tt.SEMATTRS_MESSAGING_PROTOCOL = tt.SEMATTRS_MESSAGING_TEMP_DESTINATION = undefined;
    tt.FAASINVOKEDPROVIDERVALUES_ALIBABA_CLOUD = tt.FaasDocumentOperationValues = tt.FAASDOCUMENTOPERATIONVALUES_DELETE = tt.FAASDOCUMENTOPERATIONVALUES_EDIT = tt.FAASDOCUMENTOPERATIONVALUES_INSERT = tt.FaasTriggerValues = tt.FAASTRIGGERVALUES_OTHER = tt.FAASTRIGGERVALUES_TIMER = tt.FAASTRIGGERVALUES_PUBSUB = tt.FAASTRIGGERVALUES_HTTP = tt.FAASTRIGGERVALUES_DATASOURCE = tt.DbCassandraConsistencyLevelValues = tt.DBCASSANDRACONSISTENCYLEVELVALUES_LOCAL_SERIAL = tt.DBCASSANDRACONSISTENCYLEVELVALUES_SERIAL = tt.DBCASSANDRACONSISTENCYLEVELVALUES_ANY = tt.DBCASSANDRACONSISTENCYLEVELVALUES_LOCAL_ONE = tt.DBCASSANDRACONSISTENCYLEVELVALUES_THREE = tt.DBCASSANDRACONSISTENCYLEVELVALUES_TWO = tt.DBCASSANDRACONSISTENCYLEVELVALUES_ONE = tt.DBCASSANDRACONSISTENCYLEVELVALUES_LOCAL_QUORUM = tt.DBCASSANDRACONSISTENCYLEVELVALUES_QUORUM = tt.DBCASSANDRACONSISTENCYLEVELVALUES_EACH_QUORUM = tt.DBCASSANDRACONSISTENCYLEVELVALUES_ALL = tt.DbSystemValues = tt.DBSYSTEMVALUES_COCKROACHDB = tt.DBSYSTEMVALUES_MEMCACHED = tt.DBSYSTEMVALUES_ELASTICSEARCH = tt.DBSYSTEMVALUES_GEODE = tt.DBSYSTEMVALUES_NEO4J = tt.DBSYSTEMVALUES_DYNAMODB = tt.DBSYSTEMVALUES_COSMOSDB = tt.DBSYSTEMVALUES_COUCHDB = tt.DBSYSTEMVALUES_COUCHBASE = tt.DBSYSTEMVALUES_REDIS = tt.DBSYSTEMVALUES_MONGODB = tt.DBSYSTEMVALUES_HBASE = tt.DBSYSTEMVALUES_CASSANDRA = tt.DBSYSTEMVALUES_COLDFUSION = tt.DBSYSTEMVALUES_H2 = tt.DBSYSTEMVALUES_VERTICA = tt.DBSYSTEMVALUES_TERADATA = tt.DBSYSTEMVALUES_SYBASE = tt.DBSYSTEMVALUES_SQLITE = tt.DBSYSTEMVALUES_POINTBASE = tt.DBSYSTEMVALUES_PERVASIVE = tt.DBSYSTEMVALUES_NETEZZA = tt.DBSYSTEMVALUES_MARIADB = tt.DBSYSTEMVALUES_INTERBASE = tt.DBSYSTEMVALUES_INSTANTDB = tt.DBSYSTEMVALUES_INFORMIX = undefined;
    tt.MESSAGINGOPERATIONVALUES_RECEIVE = tt.MessagingDestinationKindValues = tt.MESSAGINGDESTINATIONKINDVALUES_TOPIC = tt.MESSAGINGDESTINATIONKINDVALUES_QUEUE = tt.HttpFlavorValues = tt.HTTPFLAVORVALUES_QUIC = tt.HTTPFLAVORVALUES_SPDY = tt.HTTPFLAVORVALUES_HTTP_2_0 = tt.HTTPFLAVORVALUES_HTTP_1_1 = tt.HTTPFLAVORVALUES_HTTP_1_0 = tt.NetHostConnectionSubtypeValues = tt.NETHOSTCONNECTIONSUBTYPEVALUES_LTE_CA = tt.NETHOSTCONNECTIONSUBTYPEVALUES_NRNSA = tt.NETHOSTCONNECTIONSUBTYPEVALUES_NR = tt.NETHOSTCONNECTIONSUBTYPEVALUES_IWLAN = tt.NETHOSTCONNECTIONSUBTYPEVALUES_TD_SCDMA = tt.NETHOSTCONNECTIONSUBTYPEVALUES_GSM = tt.NETHOSTCONNECTIONSUBTYPEVALUES_HSPAP = tt.NETHOSTCONNECTIONSUBTYPEVALUES_EHRPD = tt.NETHOSTCONNECTIONSUBTYPEVALUES_LTE = tt.NETHOSTCONNECTIONSUBTYPEVALUES_EVDO_B = tt.NETHOSTCONNECTIONSUBTYPEVALUES_IDEN = tt.NETHOSTCONNECTIONSUBTYPEVALUES_HSPA = tt.NETHOSTCONNECTIONSUBTYPEVALUES_HSUPA = tt.NETHOSTCONNECTIONSUBTYPEVALUES_HSDPA = tt.NETHOSTCONNECTIONSUBTYPEVALUES_CDMA2000_1XRTT = tt.NETHOSTCONNECTIONSUBTYPEVALUES_EVDO_A = tt.NETHOSTCONNECTIONSUBTYPEVALUES_EVDO_0 = tt.NETHOSTCONNECTIONSUBTYPEVALUES_CDMA = tt.NETHOSTCONNECTIONSUBTYPEVALUES_UMTS = tt.NETHOSTCONNECTIONSUBTYPEVALUES_EDGE = tt.NETHOSTCONNECTIONSUBTYPEVALUES_GPRS = tt.NetHostConnectionTypeValues = tt.NETHOSTCONNECTIONTYPEVALUES_UNKNOWN = tt.NETHOSTCONNECTIONTYPEVALUES_UNAVAILABLE = tt.NETHOSTCONNECTIONTYPEVALUES_CELL = tt.NETHOSTCONNECTIONTYPEVALUES_WIRED = tt.NETHOSTCONNECTIONTYPEVALUES_WIFI = tt.NetTransportValues = tt.NETTRANSPORTVALUES_OTHER = tt.NETTRANSPORTVALUES_INPROC = tt.NETTRANSPORTVALUES_PIPE = tt.NETTRANSPORTVALUES_UNIX = tt.NETTRANSPORTVALUES_IP = tt.NETTRANSPORTVALUES_IP_UDP = tt.NETTRANSPORTVALUES_IP_TCP = tt.FaasInvokedProviderValues = tt.FAASINVOKEDPROVIDERVALUES_GCP = tt.FAASINVOKEDPROVIDERVALUES_AZURE = tt.FAASINVOKEDPROVIDERVALUES_AWS = undefined;
    tt.MessageTypeValues = tt.MESSAGETYPEVALUES_RECEIVED = tt.MESSAGETYPEVALUES_SENT = tt.RpcGrpcStatusCodeValues = tt.RPCGRPCSTATUSCODEVALUES_UNAUTHENTICATED = tt.RPCGRPCSTATUSCODEVALUES_DATA_LOSS = tt.RPCGRPCSTATUSCODEVALUES_UNAVAILABLE = tt.RPCGRPCSTATUSCODEVALUES_INTERNAL = tt.RPCGRPCSTATUSCODEVALUES_UNIMPLEMENTED = tt.RPCGRPCSTATUSCODEVALUES_OUT_OF_RANGE = tt.RPCGRPCSTATUSCODEVALUES_ABORTED = tt.RPCGRPCSTATUSCODEVALUES_FAILED_PRECONDITION = tt.RPCGRPCSTATUSCODEVALUES_RESOURCE_EXHAUSTED = tt.RPCGRPCSTATUSCODEVALUES_PERMISSION_DENIED = tt.RPCGRPCSTATUSCODEVALUES_ALREADY_EXISTS = tt.RPCGRPCSTATUSCODEVALUES_NOT_FOUND = tt.RPCGRPCSTATUSCODEVALUES_DEADLINE_EXCEEDED = tt.RPCGRPCSTATUSCODEVALUES_INVALID_ARGUMENT = tt.RPCGRPCSTATUSCODEVALUES_UNKNOWN = tt.RPCGRPCSTATUSCODEVALUES_CANCELLED = tt.RPCGRPCSTATUSCODEVALUES_OK = tt.MessagingOperationValues = tt.MESSAGINGOPERATIONVALUES_PROCESS = undefined;
    var fJ = _Jr();
    tt.SEMATTRS_AWS_LAMBDA_INVOKED_ARN = "aws.lambda.invoked_arn";
    tt.SEMATTRS_DB_SYSTEM = "db.system";
    tt.SEMATTRS_DB_CONNECTION_STRING = "db.connection_string";
    tt.SEMATTRS_DB_USER = "db.user";
    tt.SEMATTRS_DB_JDBC_DRIVER_CLASSNAME = "db.jdbc.driver_classname";
    tt.SEMATTRS_DB_NAME = "db.name";
    tt.SEMATTRS_DB_STATEMENT = "db.statement";
    tt.SEMATTRS_DB_OPERATION = "db.operation";
    tt.SEMATTRS_DB_MSSQL_INSTANCE_NAME = "db.mssql.instance_name";
    tt.SEMATTRS_DB_CASSANDRA_KEYSPACE = "db.cassandra.keyspace";
    tt.SEMATTRS_DB_CASSANDRA_PAGE_SIZE = "db.cassandra.page_size";
    tt.SEMATTRS_DB_CASSANDRA_CONSISTENCY_LEVEL = "db.cassandra.consistency_level";
    tt.SEMATTRS_DB_CASSANDRA_TABLE = "db.cassandra.table";
    tt.SEMATTRS_DB_CASSANDRA_IDEMPOTENCE = "db.cassandra.idempotence";
    tt.SEMATTRS_DB_CASSANDRA_SPECULATIVE_EXECUTION_COUNT = "db.cassandra.speculative_execution_count";
    tt.SEMATTRS_DB_CASSANDRA_COORDINATOR_ID = "db.cassandra.coordinator.id";
    tt.SEMATTRS_DB_CASSANDRA_COORDINATOR_DC = "db.cassandra.coordinator.dc";
    tt.SEMATTRS_DB_HBASE_NAMESPACE = "db.hbase.namespace";
    tt.SEMATTRS_DB_REDIS_DATABASE_INDEX = "db.redis.database_index";
    tt.SEMATTRS_DB_MONGODB_COLLECTION = "db.mongodb.collection";
    tt.SEMATTRS_DB_SQL_TABLE = "db.sql.table";
    tt.SEMATTRS_EXCEPTION_TYPE = "exception.type";
    tt.SEMATTRS_EXCEPTION_MESSAGE = "exception.message";
    tt.SEMATTRS_EXCEPTION_STACKTRACE = "exception.stacktrace";
    tt.SEMATTRS_EXCEPTION_ESCAPED = "exception.escaped";
    tt.SEMATTRS_FAAS_TRIGGER = "faas.trigger";
    tt.SEMATTRS_FAAS_EXECUTION = "faas.execution";
    tt.SEMATTRS_FAAS_DOCUMENT_COLLECTION = "faas.document.collection";
    tt.SEMATTRS_FAAS_DOCUMENT_OPERATION = "faas.document.operation";
    tt.SEMATTRS_FAAS_DOCUMENT_TIME = "faas.document.time";
    tt.SEMATTRS_FAAS_DOCUMENT_NAME = "faas.document.name";
    tt.SEMATTRS_FAAS_TIME = "faas.time";
    tt.SEMATTRS_FAAS_CRON = "faas.cron";
    tt.SEMATTRS_FAAS_COLDSTART = "faas.coldstart";
    tt.SEMATTRS_FAAS_INVOKED_NAME = "faas.invoked_name";
    tt.SEMATTRS_FAAS_INVOKED_PROVIDER = "faas.invoked_provider";
    tt.SEMATTRS_FAAS_INVOKED_REGION = "faas.invoked_region";
    tt.SEMATTRS_NET_TRANSPORT = "net.transport";
    tt.SEMATTRS_NET_PEER_IP = "net.peer.ip";
    tt.SEMATTRS_NET_PEER_PORT = "net.peer.port";
    tt.SEMATTRS_NET_PEER_NAME = "net.peer.name";
    tt.SEMATTRS_NET_HOST_IP = "net.host.ip";
    tt.SEMATTRS_NET_HOST_PORT = "net.host.port";
    tt.SEMATTRS_NET_HOST_NAME = "net.host.name";
    tt.SEMATTRS_NET_HOST_CONNECTION_TYPE = "net.host.connection.type";
    tt.SEMATTRS_NET_HOST_CONNECTION_SUBTYPE = "net.host.connection.subtype";
    tt.SEMATTRS_NET_HOST_CARRIER_NAME = "net.host.carrier.name";
    tt.SEMATTRS_NET_HOST_CARRIER_MCC = "net.host.carrier.mcc";
    tt.SEMATTRS_NET_HOST_CARRIER_MNC = "net.host.carrier.mnc";
    tt.SEMATTRS_NET_HOST_CARRIER_ICC = "net.host.carrier.icc";
    tt.SEMATTRS_PEER_SERVICE = "peer.service";
    tt.SEMATTRS_ENDUSER_ID = "enduser.id";
    tt.SEMATTRS_ENDUSER_ROLE = "enduser.role";
    tt.SEMATTRS_ENDUSER_SCOPE = "enduser.scope";
    tt.SEMATTRS_THREAD_ID = "thread.id";
    tt.SEMATTRS_THREAD_NAME = "thread.name";
    tt.SEMATTRS_CODE_FUNCTION = "code.function";
    tt.SEMATTRS_CODE_NAMESPACE = "code.namespace";
    tt.SEMATTRS_CODE_FILEPATH = "code.filepath";
    tt.SEMATTRS_CODE_LINENO = "code.lineno";
    tt.SEMATTRS_HTTP_METHOD = "http.method";
    tt.SEMATTRS_HTTP_URL = "http.url";
    tt.SEMATTRS_HTTP_TARGET = "http.target";
    tt.SEMATTRS_HTTP_HOST = "http.host";
    tt.SEMATTRS_HTTP_SCHEME = "http.scheme";
    tt.SEMATTRS_HTTP_STATUS_CODE = "http.status_code";
    tt.SEMATTRS_HTTP_FLAVOR = "http.flavor";
    tt.SEMATTRS_HTTP_USER_AGENT = "http.user_agent";
    tt.SEMATTRS_HTTP_REQUEST_CONTENT_LENGTH = "http.request_content_length";
    tt.SEMATTRS_HTTP_REQUEST_CONTENT_LENGTH_UNCOMPRESSED = "http.request_content_length_uncompressed";
    tt.SEMATTRS_HTTP_RESPONSE_CONTENT_LENGTH = "http.response_content_length";
    tt.SEMATTRS_HTTP_RESPONSE_CONTENT_LENGTH_UNCOMPRESSED = "http.response_content_length_uncompressed";
    tt.SEMATTRS_HTTP_SERVER_NAME = "http.server_name";
    tt.SEMATTRS_HTTP_ROUTE = "http.route";
    tt.SEMATTRS_HTTP_CLIENT_IP = "http.client_ip";
    tt.SEMATTRS_AWS_DYNAMODB_TABLE_NAMES = "aws.dynamodb.table_names";
    tt.SEMATTRS_AWS_DYNAMODB_CONSUMED_CAPACITY = "aws.dynamodb.consumed_capacity";
    tt.SEMATTRS_AWS_DYNAMODB_ITEM_COLLECTION_METRICS = "aws.dynamodb.item_collection_metrics";
    tt.SEMATTRS_AWS_DYNAMODB_PROVISIONED_READ_CAPACITY = "aws.dynamodb.provisioned_read_capacity";
    tt.SEMATTRS_AWS_DYNAMODB_PROVISIONED_WRITE_CAPACITY = "aws.dynamodb.provisioned_write_capacity";
    tt.SEMATTRS_AWS_DYNAMODB_CONSISTENT_READ = "aws.dynamodb.consistent_read";
    tt.SEMATTRS_AWS_DYNAMODB_PROJECTION = "aws.dynamodb.projection";
    tt.SEMATTRS_AWS_DYNAMODB_LIMIT = "aws.dynamodb.limit";
    tt.SEMATTRS_AWS_DYNAMODB_ATTRIBUTES_TO_GET = "aws.dynamodb.attributes_to_get";
    tt.SEMATTRS_AWS_DYNAMODB_INDEX_NAME = "aws.dynamodb.index_name";
    tt.SEMATTRS_AWS_DYNAMODB_SELECT = "aws.dynamodb.select";
    tt.SEMATTRS_AWS_DYNAMODB_GLOBAL_SECONDARY_INDEXES = "aws.dynamodb.global_secondary_indexes";
    tt.SEMATTRS_AWS_DYNAMODB_LOCAL_SECONDARY_INDEXES = "aws.dynamodb.local_secondary_indexes";
    tt.SEMATTRS_AWS_DYNAMODB_EXCLUSIVE_START_TABLE = "aws.dynamodb.exclusive_start_table";
    tt.SEMATTRS_AWS_DYNAMODB_TABLE_COUNT = "aws.dynamodb.table_count";
    tt.SEMATTRS_AWS_DYNAMODB_SCAN_FORWARD = "aws.dynamodb.scan_forward";
    tt.SEMATTRS_AWS_DYNAMODB_SEGMENT = "aws.dynamodb.segment";
    tt.SEMATTRS_AWS_DYNAMODB_TOTAL_SEGMENTS = "aws.dynamodb.total_segments";
    tt.SEMATTRS_AWS_DYNAMODB_COUNT = "aws.dynamodb.count";
    tt.SEMATTRS_AWS_DYNAMODB_SCANNED_COUNT = "aws.dynamodb.scanned_count";
    tt.SEMATTRS_AWS_DYNAMODB_ATTRIBUTE_DEFINITIONS = "aws.dynamodb.attribute_definitions";
    tt.SEMATTRS_AWS_DYNAMODB_GLOBAL_SECONDARY_INDEX_UPDATES = "aws.dynamodb.global_secondary_index_updates";
    tt.SEMATTRS_MESSAGING_SYSTEM = "messaging.system";
    tt.SEMATTRS_MESSAGING_DESTINATION = "messaging.destination";
    tt.SEMATTRS_MESSAGING_DESTINATION_KIND = "messaging.destination_kind";
    tt.SEMATTRS_MESSAGING_TEMP_DESTINATION = "messaging.temp_destination";
    tt.SEMATTRS_MESSAGING_PROTOCOL = "messaging.protocol";
    tt.SEMATTRS_MESSAGING_PROTOCOL_VERSION = "messaging.protocol_version";
    tt.SEMATTRS_MESSAGING_URL = "messaging.url";
    tt.SEMATTRS_MESSAGING_MESSAGE_ID = "messaging.message_id";
    tt.SEMATTRS_MESSAGING_CONVERSATION_ID = "messaging.conversation_id";
    tt.SEMATTRS_MESSAGING_MESSAGE_PAYLOAD_SIZE_BYTES = "messaging.message_payload_size_bytes";
    tt.SEMATTRS_MESSAGING_MESSAGE_PAYLOAD_COMPRESSED_SIZE_BYTES = "messaging.message_payload_compressed_size_bytes";
    tt.SEMATTRS_MESSAGING_OPERATION = "messaging.operation";
    tt.SEMATTRS_MESSAGING_CONSUMER_ID = "messaging.consumer_id";
    tt.SEMATTRS_MESSAGING_RABBITMQ_ROUTING_KEY = "messaging.rabbitmq.routing_key";
    tt.SEMATTRS_MESSAGING_KAFKA_MESSAGE_KEY = "messaging.kafka.message_key";
    tt.SEMATTRS_MESSAGING_KAFKA_CONSUMER_GROUP = "messaging.kafka.consumer_group";
    tt.SEMATTRS_MESSAGING_KAFKA_CLIENT_ID = "messaging.kafka.client_id";
    tt.SEMATTRS_MESSAGING_KAFKA_PARTITION = "messaging.kafka.partition";
    tt.SEMATTRS_MESSAGING_KAFKA_TOMBSTONE = "messaging.kafka.tombstone";
    tt.SEMATTRS_RPC_SYSTEM = "rpc.system";
    tt.SEMATTRS_RPC_SERVICE = "rpc.service";
    tt.SEMATTRS_RPC_METHOD = "rpc.method";
    tt.SEMATTRS_RPC_GRPC_STATUS_CODE = "rpc.grpc.status_code";
    tt.SEMATTRS_RPC_JSONRPC_VERSION = "rpc.jsonrpc.version";
    tt.SEMATTRS_RPC_JSONRPC_REQUEST_ID = "rpc.jsonrpc.request_id";
    tt.SEMATTRS_RPC_JSONRPC_ERROR_CODE = "rpc.jsonrpc.error_code";
    tt.SEMATTRS_RPC_JSONRPC_ERROR_MESSAGE = "rpc.jsonrpc.error_message";
    tt.SEMATTRS_MESSAGE_TYPE = "message.type";
    tt.SEMATTRS_MESSAGE_ID = "message.id";
    tt.SEMATTRS_MESSAGE_COMPRESSED_SIZE = "message.compressed_size";
    tt.SEMATTRS_MESSAGE_UNCOMPRESSED_SIZE = "message.uncompressed_size";
    tt.SemanticAttributes = (0, fJ.createConstMap)(["aws.lambda.invoked_arn", "db.system", "db.connection_string", "db.user", "db.jdbc.driver_classname", "db.name", "db.statement", "db.operation", "db.mssql.instance_name", "db.cassandra.keyspace", "db.cassandra.page_size", "db.cassandra.consistency_level", "db.cassandra.table", "db.cassandra.idempotence", "db.cassandra.speculative_execution_count", "db.cassandra.coordinator.id", "db.cassandra.coordinator.dc", "db.hbase.namespace", "db.redis.database_index", "db.mongodb.collection", "db.sql.table", "exception.type", "exception.message", "exception.stacktrace", "exception.escaped", "faas.trigger", "faas.execution", "faas.document.collection", "faas.document.operation", "faas.document.time", "faas.document.name", "faas.time", "faas.cron", "faas.coldstart", "faas.invoked_name", "faas.invoked_provider", "faas.invoked_region", "net.transport", "net.peer.ip", "net.peer.port", "net.peer.name", "net.host.ip", "net.host.port", "net.host.name", "net.host.connection.type", "net.host.connection.subtype", "net.host.carrier.name", "net.host.carrier.mcc", "net.host.carrier.mnc", "net.host.carrier.icc", "peer.service", "enduser.id", "enduser.role", "enduser.scope", "thread.id", "thread.name", "code.function", "code.namespace", "code.filepath", "code.lineno", "http.method", "http.url", "http.target", "http.host", "http.scheme", "http.status_code", "http.flavor", "http.user_agent", "http.request_content_length", "http.request_content_length_uncompressed", "http.response_content_length", "http.response_content_length_uncompressed", "http.server_name", "http.route", "http.client_ip", "aws.dynamodb.table_names", "aws.dynamodb.consumed_capacity", "aws.dynamodb.item_collection_metrics", "aws.dynamodb.provisioned_read_capacity", "aws.dynamodb.provisioned_write_capacity", "aws.dynamodb.consistent_read", "aws.dynamodb.projection", "aws.dynamodb.limit", "aws.dynamodb.attributes_to_get", "aws.dynamodb.index_name", "aws.dynamodb.select", "aws.dynamodb.global_secondary_indexes", "aws.dynamodb.local_secondary_indexes", "aws.dynamodb.exclusive_start_table", "aws.dynamodb.table_count", "aws.dynamodb.scan_forward", "aws.dynamodb.segment", "aws.dynamodb.total_segments", "aws.dynamodb.count", "aws.dynamodb.scanned_count", "aws.dynamodb.attribute_definitions", "aws.dynamodb.global_secondary_index_updates", "messaging.system", "messaging.destination", "messaging.destination_kind", "messaging.temp_destination", "messaging.protocol", "messaging.protocol_version", "messaging.url", "messaging.message_id", "messaging.conversation_id", "messaging.message_payload_size_bytes", "messaging.message_payload_compressed_size_bytes", "messaging.operation", "messaging.consumer_id", "messaging.rabbitmq.routing_key", "messaging.kafka.message_key", "messaging.kafka.consumer_group", "messaging.kafka.client_id", "messaging.kafka.partition", "messaging.kafka.tombstone", "rpc.system", "rpc.service", "rpc.method", "rpc.grpc.status_code", "rpc.jsonrpc.version", "rpc.jsonrpc.request_id", "rpc.jsonrpc.error_code", "rpc.jsonrpc.error_message", "message.type", "message.id", "message.compressed_size", "message.uncompressed_size"]);
    tt.DBSYSTEMVALUES_OTHER_SQL = "other_sql";
    tt.DBSYSTEMVALUES_MSSQL = "mssql";
    tt.DBSYSTEMVALUES_MYSQL = "mysql";
    tt.DBSYSTEMVALUES_ORACLE = "oracle";
    tt.DBSYSTEMVALUES_DB2 = "db2";
    tt.DBSYSTEMVALUES_POSTGRESQL = "postgresql";
    tt.DBSYSTEMVALUES_REDSHIFT = "redshift";
    tt.DBSYSTEMVALUES_HIVE = "hive";
    tt.DBSYSTEMVALUES_CLOUDSCAPE = "cloudscape";
    tt.DBSYSTEMVALUES_HSQLDB = "hsqldb";
    tt.DBSYSTEMVALUES_PROGRESS = "progress";
    tt.DBSYSTEMVALUES_MAXDB = "maxdb";
    tt.DBSYSTEMVALUES_HANADB = "hanadb";
    tt.DBSYSTEMVALUES_INGRES = "ingres";
    tt.DBSYSTEMVALUES_FIRSTSQL = "firstsql";
    tt.DBSYSTEMVALUES_EDB = "edb";
    tt.DBSYSTEMVALUES_CACHE = "cache";
    tt.DBSYSTEMVALUES_ADABAS = "adabas";
    tt.DBSYSTEMVALUES_FIREBIRD = "firebird";
    tt.DBSYSTEMVALUES_DERBY = "derby";
    tt.DBSYSTEMVALUES_FILEMAKER = "filemaker";
    tt.DBSYSTEMVALUES_INFORMIX = "informix";
    tt.DBSYSTEMVALUES_INSTANTDB = "instantdb";
    tt.DBSYSTEMVALUES_INTERBASE = "interbase";
    tt.DBSYSTEMVALUES_MARIADB = "mariadb";
    tt.DBSYSTEMVALUES_NETEZZA = "netezza";
    tt.DBSYSTEMVALUES_PERVASIVE = "pervasive";
    tt.DBSYSTEMVALUES_POINTBASE = "pointbase";
    tt.DBSYSTEMVALUES_SQLITE = "sqlite";
    tt.DBSYSTEMVALUES_SYBASE = "sybase";
    tt.DBSYSTEMVALUES_TERADATA = "teradata";
    tt.DBSYSTEMVALUES_VERTICA = "vertica";
    tt.DBSYSTEMVALUES_H2 = "h2";
    tt.DBSYSTEMVALUES_COLDFUSION = "coldfusion";
    tt.DBSYSTEMVALUES_CASSANDRA = "cassandra";
    tt.DBSYSTEMVALUES_HBASE = "hbase";
    tt.DBSYSTEMVALUES_MONGODB = "mongodb";
    tt.DBSYSTEMVALUES_REDIS = "redis";
    tt.DBSYSTEMVALUES_COUCHBASE = "couchbase";
    tt.DBSYSTEMVALUES_COUCHDB = "couchdb";
    tt.DBSYSTEMVALUES_COSMOSDB = "cosmosdb";
    tt.DBSYSTEMVALUES_DYNAMODB = "dynamodb";
    tt.DBSYSTEMVALUES_NEO4J = "neo4j";
    tt.DBSYSTEMVALUES_GEODE = "geode";
    tt.DBSYSTEMVALUES_ELASTICSEARCH = "elasticsearch";
    tt.DBSYSTEMVALUES_MEMCACHED = "memcached";
    tt.DBSYSTEMVALUES_COCKROACHDB = "cockroachdb";
    tt.DbSystemValues = (0, fJ.createConstMap)(["other_sql", "mssql", "mysql", "oracle", "db2", "postgresql", "redshift", "hive", "cloudscape", "hsqldb", "progress", "maxdb", "hanadb", "ingres", "firstsql", "edb", "cache", "adabas", "firebird", "derby", "filemaker", "informix", "instantdb", "interbase", "mariadb", "netezza", "pervasive", "pointbase", "sqlite", "sybase", "teradata", "vertica", "h2", "coldfusion", "cassandra", "hbase", "mongodb", "redis", "couchbase", "couchdb", "cosmosdb", "dynamodb", "neo4j", "geode", "elasticsearch", "memcached", "cockroachdb"]);
    tt.DBCASSANDRACONSISTENCYLEVELVALUES_ALL = "all";
    tt.DBCASSANDRACONSISTENCYLEVELVALUES_EACH_QUORUM = "each_quorum";
    tt.DBCASSANDRACONSISTENCYLEVELVALUES_QUORUM = "quorum";
    tt.DBCASSANDRACONSISTENCYLEVELVALUES_LOCAL_QUORUM = "local_quorum";
    tt.DBCASSANDRACONSISTENCYLEVELVALUES_ONE = "one";
    tt.DBCASSANDRACONSISTENCYLEVELVALUES_TWO = "two";
    tt.DBCASSANDRACONSISTENCYLEVELVALUES_THREE = "three";
    tt.DBCASSANDRACONSISTENCYLEVELVALUES_LOCAL_ONE = "local_one";
    tt.DBCASSANDRACONSISTENCYLEVELVALUES_ANY = "any";
    tt.DBCASSANDRACONSISTENCYLEVELVALUES_SERIAL = "serial";
    tt.DBCASSANDRACONSISTENCYLEVELVALUES_LOCAL_SERIAL = "local_serial";
    tt.DbCassandraConsistencyLevelValues = (0, fJ.createConstMap)(["all", "each_quorum", "quorum", "local_quorum", "one", "two", "three", "local_one", "any", "serial", "local_serial"]);
    tt.FAASTRIGGERVALUES_DATASOURCE = "datasource";
    tt.FAASTRIGGERVALUES_HTTP = "http";
    tt.FAASTRIGGERVALUES_PUBSUB = "pubsub";
    tt.FAASTRIGGERVALUES_TIMER = "timer";
    tt.FAASTRIGGERVALUES_OTHER = "other";
    tt.FaasTriggerValues = (0, fJ.createConstMap)(["datasource", "http", "pubsub", "timer", "other"]);
    tt.FAASDOCUMENTOPERATIONVALUES_INSERT = "insert";
    tt.FAASDOCUMENTOPERATIONVALUES_EDIT = "edit";
    tt.FAASDOCUMENTOPERATIONVALUES_DELETE = "delete";
    tt.FaasDocumentOperationValues = (0, fJ.createConstMap)(["insert", "edit", "delete"]);
    tt.FAASINVOKEDPROVIDERVALUES_ALIBABA_CLOUD = "alibaba_cloud";
    tt.FAASINVOKEDPROVIDERVALUES_AWS = "aws";
    tt.FAASINVOKEDPROVIDERVALUES_AZURE = "azure";
    tt.FAASINVOKEDPROVIDERVALUES_GCP = "gcp";
    tt.FaasInvokedProviderValues = (0, fJ.createConstMap)(["alibaba_cloud", "aws", "azure", "gcp"]);
    tt.NETTRANSPORTVALUES_IP_TCP = "ip_tcp";
    tt.NETTRANSPORTVALUES_IP_UDP = "ip_udp";
    tt.NETTRANSPORTVALUES_IP = "ip";
    tt.NETTRANSPORTVALUES_UNIX = "unix";
    tt.NETTRANSPORTVALUES_PIPE = "pipe";
    tt.NETTRANSPORTVALUES_INPROC = "inproc";
    tt.NETTRANSPORTVALUES_OTHER = "other";
    tt.NetTransportValues = (0, fJ.createConstMap)(["ip_tcp", "ip_udp", "ip", "unix", "pipe", "inproc", "other"]);
    tt.NETHOSTCONNECTIONTYPEVALUES_WIFI = "wifi";
    tt.NETHOSTCONNECTIONTYPEVALUES_WIRED = "wired";
    tt.NETHOSTCONNECTIONTYPEVALUES_CELL = "cell";
    tt.NETHOSTCONNECTIONTYPEVALUES_UNAVAILABLE = "unavailable";
    tt.NETHOSTCONNECTIONTYPEVALUES_UNKNOWN = "unknown";
    tt.NetHostConnectionTypeValues = (0, fJ.createConstMap)(["wifi", "wired", "cell", "unavailable", "unknown"]);
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_GPRS = "gprs";
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_EDGE = "edge";
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_UMTS = "umts";
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_CDMA = "cdma";
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_EVDO_0 = "evdo_0";
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_EVDO_A = "evdo_a";
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_CDMA2000_1XRTT = "cdma2000_1xrtt";
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_HSDPA = "hsdpa";
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_HSUPA = "hsupa";
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_HSPA = "hspa";
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_IDEN = "iden";
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_EVDO_B = "evdo_b";
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_LTE = "lte";
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_EHRPD = "ehrpd";
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_HSPAP = "hspap";
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_GSM = "gsm";
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_TD_SCDMA = "td_scdma";
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_IWLAN = "iwlan";
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_NR = "nr";
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_NRNSA = "nrnsa";
    tt.NETHOSTCONNECTIONSUBTYPEVALUES_LTE_CA = "lte_ca";
    tt.NetHostConnectionSubtypeValues = (0, fJ.createConstMap)(["gprs", "edge", "umts", "cdma", "evdo_0", "evdo_a", "cdma2000_1xrtt", "hsdpa", "hsupa", "hspa", "iden", "evdo_b", "lte", "ehrpd", "hspap", "gsm", "td_scdma", "iwlan", "nr", "nrnsa", "lte_ca"]);
    tt.HTTPFLAVORVALUES_HTTP_1_0 = "1.0";
    tt.HTTPFLAVORVALUES_HTTP_1_1 = "1.1";
    tt.HTTPFLAVORVALUES_HTTP_2_0 = "2.0";
    tt.HTTPFLAVORVALUES_SPDY = "SPDY";
    tt.HTTPFLAVORVALUES_QUIC = "QUIC";
    tt.HttpFlavorValues = {
      HTTP_1_0: "1.0",
      HTTP_1_1: "1.1",
      HTTP_2_0: "2.0",
      SPDY: "SPDY",
      QUIC: "QUIC"
    };
    tt.MESSAGINGDESTINATIONKINDVALUES_QUEUE = "queue";
    tt.MESSAGINGDESTINATIONKINDVALUES_TOPIC = "topic";
    tt.MessagingDestinationKindValues = (0, fJ.createConstMap)(["queue", "topic"]);
    tt.MESSAGINGOPERATIONVALUES_RECEIVE = "receive";
    tt.MESSAGINGOPERATIONVALUES_PROCESS = "process";
    tt.MessagingOperationValues = (0, fJ.createConstMap)(["receive", "process"]);
    tt.RPCGRPCSTATUSCODEVALUES_OK = 0;
    tt.RPCGRPCSTATUSCODEVALUES_CANCELLED = 1;
    tt.RPCGRPCSTATUSCODEVALUES_UNKNOWN = 2;
    tt.RPCGRPCSTATUSCODEVALUES_INVALID_ARGUMENT = 3;
    tt.RPCGRPCSTATUSCODEVALUES_DEADLINE_EXCEEDED = 4;
    tt.RPCGRPCSTATUSCODEVALUES_NOT_FOUND = 5;
    tt.RPCGRPCSTATUSCODEVALUES_ALREADY_EXISTS = 6;
    tt.RPCGRPCSTATUSCODEVALUES_PERMISSION_DENIED = 7;
    tt.RPCGRPCSTATUSCODEVALUES_RESOURCE_EXHAUSTED = 8;
    tt.RPCGRPCSTATUSCODEVALUES_FAILED_PRECONDITION = 9;
    tt.RPCGRPCSTATUSCODEVALUES_ABORTED = 10;
    tt.RPCGRPCSTATUSCODEVALUES_OUT_OF_RANGE = 11;
    tt.RPCGRPCSTATUSCODEVALUES_UNIMPLEMENTED = 12;
    tt.RPCGRPCSTATUSCODEVALUES_INTERNAL = 13;
    tt.RPCGRPCSTATUSCODEVALUES_UNAVAILABLE = 14;
    tt.RPCGRPCSTATUSCODEVALUES_DATA_LOSS = 15;
    tt.RPCGRPCSTATUSCODEVALUES_UNAUTHENTICATED = 16;
    tt.RpcGrpcStatusCodeValues = {
      OK: 0,
      CANCELLED: 1,
      UNKNOWN: 2,
      INVALID_ARGUMENT: 3,
      DEADLINE_EXCEEDED: 4,
      NOT_FOUND: 5,
      ALREADY_EXISTS: 6,
      PERMISSION_DENIED: 7,
      RESOURCE_EXHAUSTED: 8,
      FAILED_PRECONDITION: 9,
      ABORTED: 10,
      OUT_OF_RANGE: 11,
      UNIMPLEMENTED: 12,
      INTERNAL: 13,
      UNAVAILABLE: 14,
      DATA_LOSS: 15,
      UNAUTHENTICATED: 16
    };
    tt.MESSAGETYPEVALUES_SENT = "SENT";
    tt.MESSAGETYPEVALUES_RECEIVED = "RECEIVED";
    tt.MessageTypeValues = (0, fJ.createConstMap)(["SENT", "RECEIVED"]);
  });
  var LUi = __commonJS(I4e => {
    var Eqd = I4e && I4e.__createBinding || (Object.create ? function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      var o = Object.getOwnPropertyDescriptor(t, n);
      if (!o || ("get" in o ? !t.__esModule : o.writable || o.configurable)) {
        o = {
          enumerable: true,
          get: function () {
            return t[n];
          }
        };
      }
      Object.defineProperty(e, r, o);
    } : function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      e[r] = t[n];
    });
    var vqd = I4e && I4e.__exportStar || function (e, t) {
      for (var n in e) {
        if (n !== "default" && !Object.prototype.hasOwnProperty.call(t, n)) {
          Eqd(t, e, n);
        }
      }
    };
    Object.defineProperty(I4e, "__esModule", {
      value: true
    });
    vqd(NUi(), I4e);
  });