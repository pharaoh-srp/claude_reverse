  var jol = __commonJS(DKn => {
    Object.defineProperty(DKn, "__esModule", {
      value: true
    });
    DKn.diagLogLevelFromString = undefined;
    var ave = Ji();
    var Hol = {
      ALL: ave.DiagLogLevel.ALL,
      VERBOSE: ave.DiagLogLevel.VERBOSE,
      DEBUG: ave.DiagLogLevel.DEBUG,
      INFO: ave.DiagLogLevel.INFO,
      WARN: ave.DiagLogLevel.WARN,
      ERROR: ave.DiagLogLevel.ERROR,
      NONE: ave.DiagLogLevel.NONE
    };
    function nlm(e) {
      if (e == null) {
        return;
      }
      let t = Hol[e.toUpperCase()];
      if (t == null) {
        ave.diag.warn(`Unknown log level "${e}", expected one of ${Object.keys(Hol)}, using default`);
        return ave.DiagLogLevel.INFO;
      }
      return t;
    }
    DKn.diagLogLevelFromString = nlm;
  });
  var Wol = __commonJS(MKn => {
    Object.defineProperty(MKn, "__esModule", {
      value: true
    });
    MKn._export = undefined;
    var qol = Ji();
    var rlm = zVt();
    function olm(e, t) {
      return new Promise(n => {
        qol.context.with((0, rlm.suppressTracing)(qol.context.active()), () => {
          e.export(t, n);
        });
      });
    }
    MKn._export = olm;
  });
  var fse = __commonJS(oi => {
    Object.defineProperty(oi, "__esModule", {
      value: true
    });
    oi.internal = oi.diagLogLevelFromString = oi.BindOnceFuture = oi.urlMatches = oi.isUrlIgnored = oi.callWithTimeout = oi.TimeoutError = oi.merge = oi.TraceState = oi.unsuppressTracing = oi.suppressTracing = oi.isTracingSuppressed = oi.setRPCMetadata = oi.getRPCMetadata = oi.deleteRPCMetadata = oi.RPCType = oi.parseTraceParent = oi.W3CTraceContextPropagator = oi.TRACE_STATE_HEADER = oi.TRACE_PARENT_HEADER = oi.CompositePropagator = oi.otperformance = oi.getStringListFromEnv = oi.getNumberFromEnv = oi.getBooleanFromEnv = oi.getStringFromEnv = oi._globalThis = oi.SDK_INFO = oi.parseKeyPairsIntoRecord = oi.ExportResultCode = oi.unrefTimer = oi.timeInputToHrTime = oi.millisToHrTime = oi.isTimeInputHrTime = oi.isTimeInput = oi.hrTimeToTimeStamp = oi.hrTimeToNanoseconds = oi.hrTimeToMilliseconds = oi.hrTimeToMicroseconds = oi.hrTimeDuration = oi.hrTime = oi.getTimeOrigin = oi.addHrTimes = oi.loggingErrorHandler = oi.setGlobalErrorHandler = oi.globalErrorHandler = oi.sanitizeAttributes = oi.isAttributeValue = oi.AnchoredClock = oi.W3CBaggagePropagator = undefined;
    var slm = jrl();
    Object.defineProperty(oi, "W3CBaggagePropagator", {
      enumerable: true,
      get: function () {
        return slm.W3CBaggagePropagator;
      }
    });
    var ilm = Wrl();
    Object.defineProperty(oi, "AnchoredClock", {
      enumerable: true,
      get: function () {
        return ilm.AnchoredClock;
      }
    });
    var Gol = Yrl();
    Object.defineProperty(oi, "isAttributeValue", {
      enumerable: true,
      get: function () {
        return Gol.isAttributeValue;
      }
    });
    Object.defineProperty(oi, "sanitizeAttributes", {
      enumerable: true,
      get: function () {
        return Gol.sanitizeAttributes;
      }
    });
    var Vol = Xrl();
    Object.defineProperty(oi, "globalErrorHandler", {
      enumerable: true,
      get: function () {
        return Vol.globalErrorHandler;
      }
    });
    Object.defineProperty(oi, "setGlobalErrorHandler", {
      enumerable: true,
      get: function () {
        return Vol.setGlobalErrorHandler;
      }
    });
    var alm = FAo();
    Object.defineProperty(oi, "loggingErrorHandler", {
      enumerable: true,
      get: function () {
        return alm.loggingErrorHandler;
      }
    });
    var HQ = uol();
    Object.defineProperty(oi, "addHrTimes", {
      enumerable: true,
      get: function () {
        return HQ.addHrTimes;
      }
    });
    Object.defineProperty(oi, "getTimeOrigin", {
      enumerable: true,
      get: function () {
        return HQ.getTimeOrigin;
      }
    });
    Object.defineProperty(oi, "hrTime", {
      enumerable: true,
      get: function () {
        return HQ.hrTime;
      }
    });
    Object.defineProperty(oi, "hrTimeDuration", {
      enumerable: true,
      get: function () {
        return HQ.hrTimeDuration;
      }
    });
    Object.defineProperty(oi, "hrTimeToMicroseconds", {
      enumerable: true,
      get: function () {
        return HQ.hrTimeToMicroseconds;
      }
    });
    Object.defineProperty(oi, "hrTimeToMilliseconds", {
      enumerable: true,
      get: function () {
        return HQ.hrTimeToMilliseconds;
      }
    });
    Object.defineProperty(oi, "hrTimeToNanoseconds", {
      enumerable: true,
      get: function () {
        return HQ.hrTimeToNanoseconds;
      }
    });
    Object.defineProperty(oi, "hrTimeToTimeStamp", {
      enumerable: true,
      get: function () {
        return HQ.hrTimeToTimeStamp;
      }
    });
    Object.defineProperty(oi, "isTimeInput", {
      enumerable: true,
      get: function () {
        return HQ.isTimeInput;
      }
    });
    Object.defineProperty(oi, "isTimeInputHrTime", {
      enumerable: true,
      get: function () {
        return HQ.isTimeInputHrTime;
      }
    });
    Object.defineProperty(oi, "millisToHrTime", {
      enumerable: true,
      get: function () {
        return HQ.millisToHrTime;
      }
    });
    Object.defineProperty(oi, "timeInputToHrTime", {
      enumerable: true,
      get: function () {
        return HQ.timeInputToHrTime;
      }
    });
    var llm = dol();
    Object.defineProperty(oi, "unrefTimer", {
      enumerable: true,
      get: function () {
        return llm.unrefTimer;
      }
    });
    var clm = pol();
    Object.defineProperty(oi, "ExportResultCode", {
      enumerable: true,
      get: function () {
        return clm.ExportResultCode;
      }
    });
    var ulm = MAo();
    Object.defineProperty(oi, "parseKeyPairsIntoRecord", {
      enumerable: true,
      get: function () {
        return ulm.parseKeyPairsIntoRecord;
      }
    });
    var OVe = UAo();
    Object.defineProperty(oi, "SDK_INFO", {
      enumerable: true,
      get: function () {
        return OVe.SDK_INFO;
      }
    });
    Object.defineProperty(oi, "_globalThis", {
      enumerable: true,
      get: function () {
        return OVe._globalThis;
      }
    });
    Object.defineProperty(oi, "getStringFromEnv", {
      enumerable: true,
      get: function () {
        return OVe.getStringFromEnv;
      }
    });
    Object.defineProperty(oi, "getBooleanFromEnv", {
      enumerable: true,
      get: function () {
        return OVe.getBooleanFromEnv;
      }
    });
    Object.defineProperty(oi, "getNumberFromEnv", {
      enumerable: true,
      get: function () {
        return OVe.getNumberFromEnv;
      }
    });
    Object.defineProperty(oi, "getStringListFromEnv", {
      enumerable: true,
      get: function () {
        return OVe.getStringListFromEnv;
      }
    });
    Object.defineProperty(oi, "otperformance", {
      enumerable: true,
      get: function () {
        return OVe.otperformance;
      }
    });
    var dlm = hol();
    Object.defineProperty(oi, "CompositePropagator", {
      enumerable: true,
      get: function () {
        return dlm.CompositePropagator;
      }
    });
    var NKn = Eol();
    Object.defineProperty(oi, "TRACE_PARENT_HEADER", {
      enumerable: true,
      get: function () {
        return NKn.TRACE_PARENT_HEADER;
      }
    });
    Object.defineProperty(oi, "TRACE_STATE_HEADER", {
      enumerable: true,
      get: function () {
        return NKn.TRACE_STATE_HEADER;
      }
    });
    Object.defineProperty(oi, "W3CTraceContextPropagator", {
      enumerable: true,
      get: function () {
        return NKn.W3CTraceContextPropagator;
      }
    });
    Object.defineProperty(oi, "parseTraceParent", {
      enumerable: true,
      get: function () {
        return NKn.parseTraceParent;
      }
    });
    var LKn = vol();
    Object.defineProperty(oi, "RPCType", {
      enumerable: true,
      get: function () {
        return LKn.RPCType;
      }
    });
    Object.defineProperty(oi, "deleteRPCMetadata", {
      enumerable: true,
      get: function () {
        return LKn.deleteRPCMetadata;
      }
    });
    Object.defineProperty(oi, "getRPCMetadata", {
      enumerable: true,
      get: function () {
        return LKn.getRPCMetadata;
      }
    });
    Object.defineProperty(oi, "setRPCMetadata", {
      enumerable: true,
      get: function () {
        return LKn.setRPCMetadata;
      }
    });
    var GAo = zVt();
    Object.defineProperty(oi, "isTracingSuppressed", {
      enumerable: true,
      get: function () {
        return GAo.isTracingSuppressed;
      }
    });
    Object.defineProperty(oi, "suppressTracing", {
      enumerable: true,
      get: function () {
        return GAo.suppressTracing;
      }
    });
    Object.defineProperty(oi, "unsuppressTracing", {
      enumerable: true,
      get: function () {
        return GAo.unsuppressTracing;
      }
    });
    var plm = jAo();
    Object.defineProperty(oi, "TraceState", {
      enumerable: true,
      get: function () {
        return plm.TraceState;
      }
    });
    var mlm = Dol();
    Object.defineProperty(oi, "merge", {
      enumerable: true,
      get: function () {
        return mlm.merge;
      }
    });
    var zol = Mol();
    Object.defineProperty(oi, "TimeoutError", {
      enumerable: true,
      get: function () {
        return zol.TimeoutError;
      }
    });
    Object.defineProperty(oi, "callWithTimeout", {
      enumerable: true,
      get: function () {
        return zol.callWithTimeout;
      }
    });
    var Kol = Lol();
    Object.defineProperty(oi, "isUrlIgnored", {
      enumerable: true,
      get: function () {
        return Kol.isUrlIgnored;
      }
    });
    Object.defineProperty(oi, "urlMatches", {
      enumerable: true,
      get: function () {
        return Kol.urlMatches;
      }
    });
    var flm = $ol();
    Object.defineProperty(oi, "BindOnceFuture", {
      enumerable: true,
      get: function () {
        return flm.BindOnceFuture;
      }
    });
    var hlm = jol();
    Object.defineProperty(oi, "diagLogLevelFromString", {
      enumerable: true,
      get: function () {
        return hlm.diagLogLevelFromString;
      }
    });
    var glm = Wol();
    oi.internal = {
      _export: glm._export
    };
  });
  var FKn = __commonJS(XVt => {
    Object.defineProperty(XVt, "__esModule", {
      value: true
    });
    XVt.AggregationTemporality = undefined;
    var ylm;
    (function (e) {
      e[e.DELTA = 0] = "DELTA";
      e[e.CUMULATIVE = 1] = "CUMULATIVE";
    })(ylm = XVt.AggregationTemporality || (XVt.AggregationTemporality = {}));
  });
  var lve = __commonJS(R1e => {
    Object.defineProperty(R1e, "__esModule", {
      value: true
    });
    R1e.DataPointType = R1e.InstrumentType = undefined;
    var _lm;
    (function (e) {
      e.COUNTER = "COUNTER";
      e.GAUGE = "GAUGE";
      e.HISTOGRAM = "HISTOGRAM";
      e.UP_DOWN_COUNTER = "UP_DOWN_COUNTER";
      e.OBSERVABLE_COUNTER = "OBSERVABLE_COUNTER";
      e.OBSERVABLE_GAUGE = "OBSERVABLE_GAUGE";
      e.OBSERVABLE_UP_DOWN_COUNTER = "OBSERVABLE_UP_DOWN_COUNTER";
    })(_lm = R1e.InstrumentType || (R1e.InstrumentType = {}));
    var blm;
    (function (e) {
      e[e.HISTOGRAM = 0] = "HISTOGRAM";
      e[e.EXPONENTIAL_HISTOGRAM = 1] = "EXPONENTIAL_HISTOGRAM";
      e[e.GAUGE = 2] = "GAUGE";
      e[e.SUM = 3] = "SUM";
    })(blm = R1e.DataPointType || (R1e.DataPointType = {}));
  });
  var mme = __commonJS(Y$ => {
    Object.defineProperty(Y$, "__esModule", {
      value: true
    });
    Y$.equalsCaseInsensitive = Y$.binarySearchUB = Y$.setEquals = Y$.callWithTimeout = Y$.TimeoutError = Y$.instrumentationScopeId = Y$.hashAttributes = undefined;
    function Slm(e) {
      let t = Object.keys(e);
      if (t.length === 0) {
        return "";
      }
      t = t.sort();
      return JSON.stringify(t.map(n => [n, e[n]]));
    }
    Y$.hashAttributes = Slm;
    function Tlm(e) {
      return `${e.name}:${e.version ?? ""}:${e.schemaUrl ?? ""}`;
    }
    Y$.instrumentationScopeId = Tlm;
    class UKn extends Error {
      constructor(e) {
        super(e);
        Object.setPrototypeOf(this, UKn.prototype);
      }
    }
    Y$.TimeoutError = UKn;
    function Elm(e, t) {
      let n;
      let r = new Promise(function (s, i) {
        n = setTimeout(function () {
          i(new UKn("Operation timed out."));
        }, t);
      });
      return Promise.race([e, r]).then(o => (clearTimeout(n), o), o => {
        throw clearTimeout(n), o;
      });
    }
    Y$.callWithTimeout = Elm;
    function vlm(e, t) {
      if (e.size !== t.size) {
        return false;
      }
      for (let n of e) {
        if (!t.vZc(n)) {
          return false;
        }
      }
      return true;
    }
    Y$.setEquals = vlm;
    function wlm(e, t) {
      let n = 0;
      let r = e.length - 1;
      let o = e.length;
      while (r >= n) {
        let s = n + Math.trunc((r - n) / 2);
        if (e[s] < t) {
          n = s + 1;
        } else {
          o = s;
          r = s - 1;
        }
      }
      return o;
    }
    Y$.binarySearchUB = wlm;
    function Clm(e, t) {
      return e.toLowerCase() === t.toLowerCase();
    }
    Y$.equalsCaseInsensitive = Clm;
  });
  var s_t = __commonJS(QVt => {
    Object.defineProperty(QVt, "__esModule", {
      value: true
    });
    QVt.AggregatorKind = undefined;
    var Rlm;
    (function (e) {
      e[e.DROP = 0] = "DROP";
      e[e.SUM = 1] = "SUM";
      e[e.LAST_VALUE = 2] = "LAST_VALUE";
      e[e.HISTOGRAM = 3] = "HISTOGRAM";
      e[e.EXPONENTIAL_HISTOGRAM = 4] = "EXPONENTIAL_HISTOGRAM";
    })(Rlm = QVt.AggregatorKind || (QVt.AggregatorKind = {}));
  });
  var Jol = __commonJS(BKn => {
    Object.defineProperty(BKn, "__esModule", {
      value: true
    });
    BKn.DropAggregator = undefined;
    var xlm = s_t();
    class Yol {
      kind = xlm.AggregatorKind.DROP;
      createAccumulation() {
        return;
      }
      merge(e, t) {
        return;
      }
      diff(e, t) {
        return;
      }
      toMetricData(e, t, n, r) {
        return;
      }
    }
    BKn.DropAggregator = Yol;
  });
  var Qol = __commonJS(i_t => {
    Object.defineProperty(i_t, "__esModule", {
      value: true
    });
    i_t.HistogramAggregator = i_t.HistogramAccumulation = undefined;
    var klm = s_t();
    var ZVt = lve();
    var Alm = mme();
    function Ilm(e) {
      let t = e.map(() => 0);
      t.push(0);
      return {
        buckets: {
          boundaries: e,
          counts: t
        },
        sum: 0,
        count: 0,
        hasMinMax: false,
        min: 1 / 0,
        max: -1 / 0
      };
    }
    class ezt {
      startTime;
      _boundaries;
      _recordMinMax;
      _current;
      constructor(e, t, n = true, r = Ilm(t)) {
        this.startTime = e;
        this._boundaries = t;
        this._recordMinMax = n;
        this._current = r;
      }
      record(e) {
        if (Number.isNaN(e)) {
          return;
        }
        if (this._current.count += 1, this._current.sum += e, this._recordMinMax) {
          this._current.min = Math.min(e, this._current.min);
          this._current.max = Math.max(e, this._current.max);
          this._current.hasMinMax = true;
        }
        let t = (0, Alm.binarySearchUB)(this._boundaries, e);
        this._current.buckets.counts[t] += 1;
      }
      setStartTime(e) {
        this.startTime = e;
      }
      toPointValue() {
        return this._current;
      }
    }
    i_t.HistogramAccumulation = ezt;
    class Xol {
      kind = klm.AggregatorKind.HISTOGRAM;
      _boundaries;
      _recordMinMax;
      constructor(e, t) {
        this._boundaries = e;
        this._recordMinMax = t;
      }
      createAccumulation(e) {
        return new ezt(e, this._boundaries, this._recordMinMax);
      }
      merge(e, t) {
        let n = e.toPointValue();
        let r = t.toPointValue();
        let o = n.buckets.counts;
        let s = r.buckets.counts;
        let i = Array(o.length);
        for (let c = 0; c < o.length; c++) {
          i[c] = o[c] + s[c];
        }
        let a = 1 / 0;
        let l = -1 / 0;
        if (this._recordMinMax) {
          if (n.hasMinMax && r.hasMinMax) {
            a = Math.min(n.min, r.min);
            l = Math.max(n.max, r.max);
          } else if (n.hasMinMax) {
            a = n.min;
            l = n.max;
          } else if (r.hasMinMax) {
            a = r.min;
            l = r.max;
          }
        }
        return new ezt(e.startTime, n.buckets.boundaries, this._recordMinMax, {
          buckets: {
            boundaries: n.buckets.boundaries,
            counts: i
          },
          count: n.count + r.count,
          sum: n.sum + r.sum,
          hasMinMax: this._recordMinMax && (n.hasMinMax || r.hasMinMax),
          min: a,
          max: l
        });
      }
      diff(e, t) {
        let n = e.toPointValue();
        let r = t.toPointValue();
        let o = n.buckets.counts;
        let s = r.buckets.counts;
        let i = Array(o.length);
        for (let a = 0; a < o.length; a++) {
          i[a] = s[a] - o[a];
        }
        return new ezt(t.startTime, n.buckets.boundaries, this._recordMinMax, {
          buckets: {
            boundaries: n.buckets.boundaries,
            counts: i
          },
          count: r.count - n.count,
          sum: r.sum - n.sum,
          hasMinMax: false,
          min: 1 / 0,
          max: -1 / 0
        });
      }
      toMetricData(e, t, n, r) {
        return {
          descriptor: e,
          aggregationTemporality: t,
          dataPointType: ZVt.DataPointType.HISTOGRAM,
          dataPoints: n.map(([o, s]) => {
            let i = s.toPointValue();
            let a = e.type === ZVt.InstrumentType.GAUGE || e.type === ZVt.InstrumentType.UP_DOWN_COUNTER || e.type === ZVt.InstrumentType.OBSERVABLE_GAUGE || e.type === ZVt.InstrumentType.OBSERVABLE_UP_DOWN_COUNTER;
            return {
              attributes: o,
              startTime: s.startTime,
              endTime: r,
              value: {
                min: i.hasMinMax ? i.min : undefined,
                max: i.hasMinMax ? i.max : undefined,
                sum: !a ? i.sum : undefined,
                buckets: i.buckets,
                count: i.count
              }
            };
          })
        };
      }
    }
    i_t.HistogramAggregator = Xol;
  });
  var Zol = __commonJS($Kn => {
    Object.defineProperty($Kn, "__esModule", {
      value: true
    });
    $Kn.Buckets = undefined;
    class VAo {
      backing;
      indexBase;
      indexStart;
      indexEnd;
      constructor(e = new zAo(), t = 0, n = 0, r = 0) {
        this.backing = e;
        this.indexBase = t;
        this.indexStart = n;
        this.indexEnd = r;
      }
      get offset() {
        return this.indexStart;
      }
      get length() {
        if (this.backing.length === 0) {
          return 0;
        }
        if (this.indexEnd === this.indexStart && this.at(0) === 0) {
          return 0;
        }
        return this.indexEnd - this.indexStart + 1;
      }
      counts() {
        return Array.from({
          length: this.length
        }, (e, t) => this.at(t));
      }
      at(e) {
        let t = this.indexBase - this.indexStart;
        if (e < t) {
          e += this.backing.length;
        }
        e -= t;
        return this.backing.countAt(e);
      }
      incrementBucket(e, t) {
        this.backing.increment(e, t);
      }
      decrementBucket(e, t) {
        this.backing.decrement(e, t);
      }
      trim() {
        for (let e = 0; e < this.length; e++) {
          if (this.at(e) !== 0) {
            this.indexStart += e;
            break;
          } else if (e === this.length - 1) {
            this.indexStart = this.indexEnd = this.indexBase = 0;
            return;
          }
        }
        for (let e = this.length - 1; e >= 0; e--) {
          if (this.at(e) !== 0) {
            this.indexEnd -= this.length - e - 1;
            break;
          }
        }
        this._rotate();
      }
      downscale(e) {
        this._rotate();
        let t = 1 + this.indexEnd - this.indexStart;
        let n = 1 << e;
        let r = 0;
        let o = 0;
        for (let s = this.indexStart; s <= this.indexEnd;) {
          let i = s % n;
          if (i < 0) {
            i += n;
          }
          for (let a = i; a < n && r < t; a++) {
            this._relocateBucket(o, r);
            r++;
            s++;
          }
          o++;
        }
        this.indexStart >>= e;
        this.indexEnd >>= e;
        this.indexBase = this.indexStart;
      }
      clone() {
        return new VAo(this.backing.clone(), this.indexBase, this.indexStart, this.indexEnd);
      }
      _rotate() {
        let e = this.indexBase - this.indexStart;
        if (e === 0) {
          return;
        } else if (e > 0) {
          this.backing.reverse(0, this.backing.length);
          this.backing.reverse(0, e);
          this.backing.reverse(e, this.backing.length);
        } else {
          this.backing.reverse(0, this.backing.length);
          this.backing.reverse(0, this.backing.length + e);
        }
        this.indexBase = this.indexStart;
      }
      _relocateBucket(e, t) {
        if (e === t) {
          return;
        }
        this.incrementBucket(e, this.backing.emptyBucket(t));
      }
    }
    $Kn.Buckets = VAo;
    class zAo {
      _counts;
      constructor(e = [0]) {
        this._counts = e;
      }
      get length() {
        return this._counts.length;
      }
      countAt(e) {
        return this._counts[e];
      }
      growTo(e, t, n) {
        let r = Array(e).fill(0);
        r.splice(n, this._counts.length - t, ...this._counts.slice(t));
        r.splice(0, t, ...this._counts.slice(0, t));
        this._counts = r;
      }
      reverse(e, t) {
        let n = Math.floor((e + t) / 2) - e;
        for (let r = 0; r < n; r++) {
          let o = this._counts[e + r];
          this._counts[e + r] = this._counts[t - r - 1];
          this._counts[t - r - 1] = o;
        }
      }
      emptyBucket(e) {
        let t = this._counts[e];
        this._counts[e] = 0;
        return t;
      }
      increment(e, t) {
        this._counts[e] += t;
      }
      decrement(e, t) {
        if (this._counts[e] >= t) {
          this._counts[e] -= t;
        } else {
          this._counts[e] = 0;
        }
      }
      clone() {
        return new zAo([...this._counts]);
      }
    }
  });
  var YAo = __commonJS(B9 => {
    Object.defineProperty(B9, "__esModule", {
      value: true
    });
    B9.getSignificand = B9.getNormalBase2 = B9.MIN_VALUE = B9.MAX_NORMAL_EXPONENT = B9.MIN_NORMAL_EXPONENT = B9.SIGNIFICAND_WIDTH = undefined;
    B9.SIGNIFICAND_WIDTH = 52;
    B9.MIN_NORMAL_EXPONENT = -1023 + 1;
    B9.MAX_NORMAL_EXPONENT = 1023;
    B9.MIN_VALUE = Math.pow(2, -1022);
    function Dlm(e) {
      let t = new DataView(new ArrayBuffer(8));
      t.setFloat64(0, e);
      return ((t.getUint32(0) & 2146435072) >> 20) - 1023;
    }
    B9.getNormalBase2 = Dlm;
    function Mlm(e) {
      let t = new DataView(new ArrayBuffer(8));
      t.setFloat64(0, e);
      let n = t.getUint32(0);
      let r = t.getUint32(4);
      return (n & 1048575) * Math.pow(2, 32) + r;
    }
    B9.getSignificand = Mlm;
  });
  var HKn = __commonJS(a_t => {
    Object.defineProperty(a_t, "__esModule", {
      value: true
    });
    a_t.nextGreaterSquare = a_t.ldexp = undefined;
    function Nlm(e, t) {
      if (e === 0 || e === Number.POSITIVE_INFINITY || e === Number.NEGATIVE_INFINITY || Number.isNaN(e)) {
        return e;
      }
      return e * Math.pow(2, t);
    }
    a_t.ldexp = Nlm;
    function Llm(e) {
      e--;
      e |= e >> 1;
      e |= e >> 2;
      e |= e >> 4;
      e |= e >> 8;
      e |= e >> 16;
      e++;
      return e;
    }
    a_t.nextGreaterSquare = Llm;
  });
  var qKn = __commonJS(jKn => {
    Object.defineProperty(jKn, "__esModule", {
      value: true
    });
    jKn.MappingError = undefined;
    class esl extends Error {}
    jKn.MappingError = esl;
  });
  var rsl = __commonJS(WKn => {
    Object.defineProperty(WKn, "__esModule", {
      value: true
    });
    WKn.ExponentMapping = undefined;
    var l_t = YAo();
    var Flm = HKn();
    var tsl = qKn();
    class nsl {
      _shift;
      constructor(e) {
        this._shift = -e;
      }
      mapToIndex(e) {
        if (e < l_t.MIN_VALUE) {
          return this._minNormalLowerBoundaryIndex();
        }
        let t = l_t.getNormalBase2(e);
        let n = this._rightShift(l_t.getSignificand(e) - 1, l_t.SIGNIFICAND_WIDTH);
        return t + n >> this._shift;
      }
      lowerBoundary(e) {
        let t = this._minNormalLowerBoundaryIndex();
        if (e < t) {
          throw new tsl.MappingError(`underflow: ${e} is < minimum lower boundary: ${t}`);
        }
        let n = this._maxNormalLowerBoundaryIndex();
        if (e > n) {
          throw new tsl.MappingError(`overflow: ${e} is > maximum lower boundary: ${n}`);
        }
        return Flm.ldexp(1, e << this._shift);
      }
      get scale() {
        if (this._shift === 0) {
          return 0;
        }
        return -this._shift;
      }
      _minNormalLowerBoundaryIndex() {
        let e = l_t.MIN_NORMAL_EXPONENT >> this._shift;
        if (this._shift < 2) {
          e--;
        }
        return e;
      }
      _maxNormalLowerBoundaryIndex() {
        return l_t.MAX_NORMAL_EXPONENT >> this._shift;
      }
      _rightShift(e, t) {
        return Math.floor(e * Math.pow(2, -t));
      }
    }
    WKn.ExponentMapping = nsl;
  });
  var asl = __commonJS(GKn => {
    Object.defineProperty(GKn, "__esModule", {
      value: true
    });
    GKn.LogarithmMapping = undefined;
    var c_t = YAo();
    var osl = HKn();
    var ssl = qKn();
    class isl {
      _scale;
      _scaleFactor;
      _inverseFactor;
      constructor(e) {
        this._scale = e;
        this._scaleFactor = osl.ldexp(Math.LOG2E, e);
        this._inverseFactor = osl.ldexp(Math.LN2, -e);
      }
      mapToIndex(e) {
        if (e <= c_t.MIN_VALUE) {
          return this._minNormalLowerBoundaryIndex() - 1;
        }
        if (c_t.getSignificand(e) === 0) {
          return (c_t.getNormalBase2(e) << this._scale) - 1;
        }
        let t = Math.floor(Math.log(e) * this._scaleFactor);
        let n = this._maxNormalLowerBoundaryIndex();
        if (t >= n) {
          return n;
        }
        return t;
      }
      lowerBoundary(e) {
        let t = this._maxNormalLowerBoundaryIndex();
        if (e >= t) {
          if (e === t) {
            return 2 * Math.exp((e - (1 << this._scale)) / this._scaleFactor);
          }
          throw new ssl.MappingError(`overflow: ${e} is > maximum lower boundary: ${t}`);
        }
        let n = this._minNormalLowerBoundaryIndex();
        if (e <= n) {
          if (e === n) {
            return c_t.MIN_VALUE;
          } else if (e === n - 1) {
            return Math.exp((e + (1 << this._scale)) / this._scaleFactor) / 2;
          }
          throw new ssl.MappingError(`overflow: ${e} is < minimum lower boundary: ${n}`);
        }
        return Math.exp(e * this._inverseFactor);
      }
      get scale() {
        return this._scale;
      }
      _minNormalLowerBoundaryIndex() {
        return c_t.MIN_NORMAL_EXPONENT << this._scale;
      }
      _maxNormalLowerBoundaryIndex() {
        return (c_t.MAX_NORMAL_EXPONENT + 1 << this._scale) - 1;
      }
    }
    GKn.LogarithmMapping = isl;
  });
  var usl = __commonJS(VKn => {
    Object.defineProperty(VKn, "__esModule", {
      value: true
    });
    VKn.getMapping = undefined;
    var Ulm = rsl();
    var Blm = asl();
    var $lm = qKn();
    var lsl = -10;
    var Hlm = Array.from({
      length: 31
    }, (e, t) => {
      if (t > 10) {
        return new Blm.LogarithmMapping(t - 10);
      }
      return new Ulm.ExponentMapping(t - 10);
    });
    function jlm(e) {
      if (e > 20 || e < lsl) {
        throw new $lm.MappingError(`expected scale >= ${lsl} && <= ${20}, got: ${e}`);
      }
      return Hlm[e + 10];
    }
    VKn.getMapping = jlm;
  });
  var fsl = __commonJS(d_t => {
    Object.defineProperty(d_t, "__esModule", {
      value: true
    });
    d_t.ExponentialHistogramAggregator = d_t.ExponentialHistogramAccumulation = undefined;
    var qlm = s_t();
    var tzt = lve();
    var Wlm = Ji();
    var dsl = Zol();
    var psl = usl();
    var Glm = HKn();
    class u_t {
      static combine(e, t) {
        return new u_t(Math.min(e.low, t.low), Math.max(e.high, t.high));
      }
      low;
      high;
      constructor(e, t) {
        this.low = e;
        this.high = t;
      }
    }
    class zKn {
      startTime;
      _maxSize;
      _recordMinMax;
      _sum;
      _count;
      _zeroCount;
      _min;
      _max;
      _positive;
      _negative;
      _mapping;
      constructor(e, t = 160, n = true, r = 0, o = 0, s = 0, i = Number.POSITIVE_INFINITY, a = Number.NEGATIVE_INFINITY, l = new dsl.Buckets(), c = new dsl.Buckets(), u = (0, psl.getMapping)(20)) {
        if (this.startTime = e, this._maxSize = t, this._recordMinMax = n, this._sum = r, this._count = o, this._zeroCount = s, this._min = i, this._max = a, this._positive = l, this._negative = c, this._mapping = u, this._maxSize < 2) {
          Wlm.diag.warn(`Exponential Histogram Max Size set to ${this._maxSize},                 changing to the minimum size of: ${2}`);
          this._maxSize = 2;
        }
      }
      record(e) {
        this.updateByIncrement(e, 1);
      }
      setStartTime(e) {
        this.startTime = e;
      }
      toPointValue() {
        return {
          hasMinMax: this._recordMinMax,
          min: this.min,
          max: this.max,
          sum: this.sum,
          positive: {
            offset: this.positive.offset,
            bucketCounts: this.positive.counts()
          },
          negative: {
            offset: this.negative.offset,
            bucketCounts: this.negative.counts()
          },
          count: this.count,
          scale: this.scale,
          zeroCount: this.zeroCount
        };
      }
      get sum() {
        return this._sum;
      }
      get min() {
        return this._min;
      }
      get max() {
        return this._max;
      }
      get count() {
        return this._count;
      }
      get zeroCount() {
        return this._zeroCount;
      }
      get scale() {
        if (this._count === this._zeroCount) {
          return 0;
        }
        return this._mapping.scale;
      }
      get positive() {
        return this._positive;
      }
      get negative() {
        return this._negative;
      }
      updateByIncrement(e, t) {
        if (Number.isNaN(e)) {
          return;
        }
        if (e > this._max) {
          this._max = e;
        }
        if (e < this._min) {
          this._min = e;
        }
        if (this._count += t, e === 0) {
          this._zeroCount += t;
          return;
        }
        if (this._sum += e * t, e > 0) {
          this._updateBuckets(this._positive, e, t);
        } else {
          this._updateBuckets(this._negative, -e, t);
        }
      }
      merge(e) {
        if (this._count === 0) {
          this._min = e.min;
          this._max = e.max;
        } else if (e.count !== 0) {
          if (e.min < this.min) {
            this._min = e.min;
          }
          if (e.max > this.max) {
            this._max = e.max;
          }
        }
        this.startTime = e.startTime;
        this._sum += e.sum;
        this._count += e.count;
        this._zeroCount += e.zeroCount;
        let t = this._minScale(e);
        this._downscale(this.scale - t);
        this._mergeBuckets(this.positive, e, e.positive, t);
        this._mergeBuckets(this.negative, e, e.negative, t);
      }
      diff(e) {
        this._min = 1 / 0;
        this._max = -1 / 0;
        this._sum -= e.sum;
        this._count -= e.count;
        this._zeroCount -= e.zeroCount;
        let t = this._minScale(e);
        this._downscale(this.scale - t);
        this._diffBuckets(this.positive, e, e.positive, t);
        this._diffBuckets(this.negative, e, e.negative, t);
      }
      clone() {
        return new zKn(this.startTime, this._maxSize, this._recordMinMax, this._sum, this._count, this._zeroCount, this._min, this._max, this.positive.clone(), this.negative.clone(), this._mapping);
      }
      _updateBuckets(e, t, n) {
        let r = this._mapping.mapToIndex(t);
        let o = false;
        let s = 0;
        let i = 0;
        if (e.length === 0) {
          e.indexStart = r;
          e.indexEnd = e.indexStart;
          e.indexBase = e.indexStart;
        } else if (r < e.indexStart && e.indexEnd - r >= this._maxSize) {
          o = true;
          i = r;
          s = e.indexEnd;
        } else if (r > e.indexEnd && r - e.indexStart >= this._maxSize) {
          o = true;
          i = e.indexStart;
          s = r;
        }
        if (o) {
          let a = this._changeScale(s, i);
          this._downscale(a);
          r = this._mapping.mapToIndex(t);
        }
        this._incrementIndexBy(e, r, n);
      }
      _incrementIndexBy(e, t, n) {
        if (n === 0) {
          return;
        }
        if (e.length === 0) {
          e.indexStart = e.indexEnd = e.indexBase = t;
        }
        if (t < e.indexStart) {
          let o = e.indexEnd - t;
          if (o >= e.backing.length) {
            this._grow(e, o + 1);
          }
          e.indexStart = t;
        } else if (t > e.indexEnd) {
          let o = t - e.indexStart;
          if (o >= e.backing.length) {
            this._grow(e, o + 1);
          }
          e.indexEnd = t;
        }
        let r = t - e.indexBase;
        if (r < 0) {
          r += e.backing.length;
        }
        e.incrementBucket(r, n);
      }
      _grow(e, t) {
        let n = e.backing.length;
        let r = e.indexBase - e.indexStart;
        let o = n - r;
        let s = (0, Glm.nextGreaterSquare)(t);
        if (s > this._maxSize) {
          s = this._maxSize;
        }
        let i = s - r;
        e.backing.growTo(s, o, i);
      }
      _changeScale(e, t) {
        let n = 0;
        while (e - t >= this._maxSize) {
          e >>= 1;
          t >>= 1;
          n++;
        }
        return n;
      }
      _downscale(e) {
        if (e === 0) {
          return;
        }
        if (e < 0) {
          throw Error(`impossible change of scale: ${this.scale}`);
        }
        let t = this._mapping.scale - e;
        this._positive.downscale(e);
        this._negative.downscale(e);
        this._mapping = (0, psl.getMapping)(t);
      }
      _minScale(e) {
        let t = Math.min(this.scale, e.scale);
        let n = u_t.combine(this._highLowAtScale(this.positive, this.scale, t), this._highLowAtScale(e.positive, e.scale, t));
        let r = u_t.combine(this._highLowAtScale(this.negative, this.scale, t), this._highLowAtScale(e.negative, e.scale, t));
        return Math.min(t - this._changeScale(n.high, n.low), t - this._changeScale(r.high, r.low));
      }
      _highLowAtScale(e, t, n) {
        if (e.length === 0) {
          return new u_t(0, -1);
        }
        let r = t - n;
        return new u_t(e.indexStart >> r, e.indexEnd >> r);
      }
      _mergeBuckets(e, t, n, r) {
        let o = n.offset;
        let s = t.scale - r;
        for (let i = 0; i < n.length; i++) {
          this._incrementIndexBy(e, o + i >> s, n.at(i));
        }
      }
      _diffBuckets(e, t, n, r) {
        let o = n.offset;
        let s = t.scale - r;
        for (let i = 0; i < n.length; i++) {
          let l = (o + i >> s) - e.indexBase;
          if (l < 0) {
            l += e.backing.length;
          }
          e.decrementBucket(l, n.at(i));
        }
        e.trim();
      }
    }
    d_t.ExponentialHistogramAccumulation = zKn;
    class msl {
      kind = qlm.AggregatorKind.EXPONENTIAL_HISTOGRAM;
      _maxSize;
      _recordMinMax;
      constructor(e, t) {
        this._maxSize = e;
        this._recordMinMax = t;
      }
      createAccumulation(e) {
        return new zKn(e, this._maxSize, this._recordMinMax);
      }
      merge(e, t) {
        let n = t.clone();
        n.merge(e);
        return n;
      }
      diff(e, t) {
        let n = t.clone();
        n.diff(e);
        return n;
      }
      toMetricData(e, t, n, r) {
        return {
          descriptor: e,
          aggregationTemporality: t,
          dataPointType: tzt.DataPointType.EXPONENTIAL_HISTOGRAM,
          dataPoints: n.map(([o, s]) => {
            let i = s.toPointValue();
            let a = e.type === tzt.InstrumentType.GAUGE || e.type === tzt.InstrumentType.UP_DOWN_COUNTER || e.type === tzt.InstrumentType.OBSERVABLE_GAUGE || e.type === tzt.InstrumentType.OBSERVABLE_UP_DOWN_COUNTER;
            return {
              attributes: o,
              startTime: s.startTime,
              endTime: r,
              value: {
                min: i.hasMinMax ? i.min : undefined,
                max: i.hasMinMax ? i.max : undefined,
                sum: !a ? i.sum : undefined,
                positive: {
                  offset: i.positive.offset,
                  bucketCounts: i.positive.bucketCounts
                },
                negative: {
                  offset: i.negative.offset,
                  bucketCounts: i.negative.bucketCounts
                },
                count: i.count,
                scale: i.scale,
                zeroCount: i.zeroCount
              }
            };
          })
        };
      }
    }
    d_t.ExponentialHistogramAggregator = msl;
  });
  var gsl = __commonJS(p_t => {
    Object.defineProperty(p_t, "__esModule", {
      value: true
    });
    p_t.LastValueAggregator = p_t.LastValueAccumulation = undefined;
    var Klm = s_t();
    var nzt = fse();
    var Ylm = lve();
    class rzt {
      startTime;
      _current;
      sampleTime;
      constructor(e, t = 0, n = [0, 0]) {
        this.startTime = e;
        this._current = t;
        this.sampleTime = n;
      }
      record(e) {
        this._current = e;
        this.sampleTime = (0, nzt.millisToHrTime)(Date.now());
      }
      setStartTime(e) {
        this.startTime = e;
      }
      toPointValue() {
        return this._current;
      }
    }
    p_t.LastValueAccumulation = rzt;
    class hsl {
      kind = Klm.AggregatorKind.LAST_VALUE;
      createAccumulation(e) {
        return new rzt(e);
      }
      merge(e, t) {
        let n = (0, nzt.hrTimeToMicroseconds)(t.sampleTime) >= (0, nzt.hrTimeToMicroseconds)(e.sampleTime) ? t : e;
        return new rzt(e.startTime, n.toPointValue(), n.sampleTime);
      }
      diff(e, t) {
        let n = (0, nzt.hrTimeToMicroseconds)(t.sampleTime) >= (0, nzt.hrTimeToMicroseconds)(e.sampleTime) ? t : e;
        return new rzt(t.startTime, n.toPointValue(), n.sampleTime);
      }
      toMetricData(e, t, n, r) {
        return {
          descriptor: e,
          aggregationTemporality: t,
          dataPointType: Ylm.DataPointType.GAUGE,
          dataPoints: n.map(([o, s]) => ({
            attributes: o,
            startTime: s.startTime,
            endTime: r,
            value: s.toPointValue()
          }))
        };
      }
    }
    p_t.LastValueAggregator = hsl;
  });
  var _sl = __commonJS(m_t => {
    Object.defineProperty(m_t, "__esModule", {
      value: true
    });
    m_t.SumAggregator = m_t.SumAccumulation = undefined;
    var Jlm = s_t();
    var Xlm = lve();
    class DVe {
      startTime;
      monotonic;
      _current;
      reset;
      constructor(e, t, n = 0, r = false) {
        this.startTime = e;
        this.monotonic = t;
        this._current = n;
        this.reset = r;
      }
      record(e) {
        if (this.monotonic && e < 0) {
          return;
        }
        this._current += e;
      }
      setStartTime(e) {
        this.startTime = e;
      }
      toPointValue() {
        return this._current;
      }
    }
    m_t.SumAccumulation = DVe;
    class ysl {
      kind = Jlm.AggregatorKind.SUM;
      monotonic;
      constructor(e) {
        this.monotonic = e;
      }
      createAccumulation(e) {
        return new DVe(e, this.monotonic);
      }
      merge(e, t) {
        let n = e.toPointValue();
        let r = t.toPointValue();
        if (t.reset) {
          return new DVe(t.startTime, this.monotonic, r, t.reset);
        }
        return new DVe(e.startTime, this.monotonic, n + r);
      }
      diff(e, t) {
        let n = e.toPointValue();
        let r = t.toPointValue();
        if (this.monotonic && n > r) {
          return new DVe(t.startTime, this.monotonic, r, true);
        }
        return new DVe(t.startTime, this.monotonic, r - n);
      }
      toMetricData(e, t, n, r) {
        return {
          descriptor: e,
          aggregationTemporality: t,
          dataPointType: Xlm.DataPointType.SUM,
          dataPoints: n.map(([o, s]) => ({
            attributes: o,
            startTime: s.startTime,
            endTime: r,
            value: s.toPointValue()
          })),
          isMonotonic: this.monotonic
        };
      }
    }
    m_t.SumAggregator = ysl;
  });
  var vsl = __commonJS(BO => {
    Object.defineProperty(BO, "__esModule", {
      value: true
    });
    BO.SumAggregator = BO.SumAccumulation = BO.LastValueAggregator = BO.LastValueAccumulation = BO.ExponentialHistogramAggregator = BO.ExponentialHistogramAccumulation = BO.HistogramAggregator = BO.HistogramAccumulation = BO.DropAggregator = undefined;
    var Qlm = Jol();
    Object.defineProperty(BO, "DropAggregator", {
      enumerable: true,
      get: function () {
        return Qlm.DropAggregator;
      }
    });
    var bsl = Qol();
    Object.defineProperty(BO, "HistogramAccumulation", {
      enumerable: true,
      get: function () {
        return bsl.HistogramAccumulation;
      }
    });
    Object.defineProperty(BO, "HistogramAggregator", {
      enumerable: true,
      get: function () {
        return bsl.HistogramAggregator;
      }
    });
    var Ssl = fsl();
    Object.defineProperty(BO, "ExponentialHistogramAccumulation", {
      enumerable: true,
      get: function () {
        return Ssl.ExponentialHistogramAccumulation;
      }
    });
    Object.defineProperty(BO, "ExponentialHistogramAggregator", {
      enumerable: true,
      get: function () {
        return Ssl.ExponentialHistogramAggregator;
      }
    });
    var Tsl = gsl();
    Object.defineProperty(BO, "LastValueAccumulation", {
      enumerable: true,
      get: function () {
        return Tsl.LastValueAccumulation;
      }
    });
    Object.defineProperty(BO, "LastValueAggregator", {
      enumerable: true,
      get: function () {
        return Tsl.LastValueAggregator;
      }
    });
    var Esl = _sl();
    Object.defineProperty(BO, "SumAccumulation", {
      enumerable: true,
      get: function () {
        return Esl.SumAccumulation;
      }
    });
    Object.defineProperty(BO, "SumAggregator", {
      enumerable: true,
      get: function () {
        return Esl.SumAggregator;
      }
    });
  });
  var wsl = __commonJS(X_ => {
    Object.defineProperty(X_, "__esModule", {
      value: true
    });
    X_.DEFAULT_AGGREGATION = X_.EXPONENTIAL_HISTOGRAM_AGGREGATION = X_.HISTOGRAM_AGGREGATION = X_.LAST_VALUE_AGGREGATION = X_.SUM_AGGREGATION = X_.DROP_AGGREGATION = X_.DefaultAggregation = X_.ExponentialHistogramAggregation = X_.ExplicitBucketHistogramAggregation = X_.HistogramAggregation = X_.LastValueAggregation = X_.SumAggregation = X_.DropAggregation = undefined;
    var Zlm = Ji();
    var MVe = vsl();
    var fme = lve();
    class KKn {
      static DEFAULT_INSTANCE = new MVe.DropAggregator();
      createAggregator(e) {
        return KKn.DEFAULT_INSTANCE;
      }
    }
    X_.DropAggregation = KKn;
    class ozt {
      static MONOTONIC_INSTANCE = new MVe.SumAggregator(true);
      static NON_MONOTONIC_INSTANCE = new MVe.SumAggregator(false);
      createAggregator(e) {
        switch (e.type) {
          case fme.InstrumentType.COUNTER:
          case fme.InstrumentType.OBSERVABLE_COUNTER:
          case fme.InstrumentType.HISTOGRAM:
            return ozt.MONOTONIC_INSTANCE;
          default:
            return ozt.NON_MONOTONIC_INSTANCE;
        }
      }
    }
    X_.SumAggregation = ozt;
    class YKn {
      static DEFAULT_INSTANCE = new MVe.LastValueAggregator();
      createAggregator(e) {
        return YKn.DEFAULT_INSTANCE;
      }
    }
    X_.LastValueAggregation = YKn;
    class JKn {
      static DEFAULT_INSTANCE = new MVe.HistogramAggregator([0, 5, 10, 25, 50, 75, 100, 250, 500, 750, 1000, 2500, 5000, 7500, 1e4], true);
      createAggregator(e) {
        return JKn.DEFAULT_INSTANCE;
      }
    }
    X_.HistogramAggregation = JKn;
    class XAo {
      _boundaries;
      _recordMinMax;
      constructor(e, t = true) {
        if (e == null) {
          throw Error("ExplicitBucketHistogramAggregation should be created with explicit boundaries, if a single bucket histogram is required, please pass an empty array");
        }
        e = e.concat();
        e = e.sort((o, s) => o - s);
        let n = e.lastIndexOf(-1 / 0);
        let r = e.indexOf(1 / 0);
        if (r === -1) {
          r = undefined;
        }
        this._boundaries = e.slice(n + 1, r);
        this._recordMinMax = t;
      }
      createAggregator(e) {
        return new MVe.HistogramAggregator(this._boundaries, this._recordMinMax);
      }
    }
    X_.ExplicitBucketHistogramAggregation = XAo;
    class QAo {
      _maxSize;
      _recordMinMax;
      constructor(e = 160, t = true) {
        this._maxSize = e;
        this._recordMinMax = t;
      }
      createAggregator(e) {
        return new MVe.ExponentialHistogramAggregator(this._maxSize, this._recordMinMax);
      }
    }
    X_.ExponentialHistogramAggregation = QAo;
    class ZAo {
      _resolve(e) {
        switch (e.type) {
          case fme.InstrumentType.COUNTER:
          case fme.InstrumentType.UP_DOWN_COUNTER:
          case fme.InstrumentType.OBSERVABLE_COUNTER:
          case fme.InstrumentType.OBSERVABLE_UP_DOWN_COUNTER:
            return X_.SUM_AGGREGATION;
          case fme.InstrumentType.GAUGE:
          case fme.InstrumentType.OBSERVABLE_GAUGE:
            return X_.LAST_VALUE_AGGREGATION;
          case fme.InstrumentType.HISTOGRAM:
            {
              if (e.advice.explicitBucketBoundaries) {
                return new XAo(e.advice.explicitBucketBoundaries);
              }
              return X_.HISTOGRAM_AGGREGATION;
            }
        }
        Zlm.diag.warn(`Unable to recognize instrument type: ${e.type}`);
        return X_.DROP_AGGREGATION;
      }
      createAggregator(e) {
        return this._resolve(e).createAggregator(e);
      }
    }
    X_.DefaultAggregation = ZAo;
    X_.DROP_AGGREGATION = new KKn();
    X_.SUM_AGGREGATION = new ozt();
    X_.LAST_VALUE_AGGREGATION = new YKn();
    X_.HISTOGRAM_AGGREGATION = new JKn();
    X_.EXPONENTIAL_HISTOGRAM_AGGREGATION = new QAo();
    X_.DEFAULT_AGGREGATION = new ZAo();
  });
  var szt = __commonJS(FVe => {
    Object.defineProperty(FVe, "__esModule", {
      value: true
    });
    FVe.toAggregation = FVe.AggregationType = undefined;
    var NVe = wsl();
    var LVe;
    (function (e) {
      e[e.DEFAULT = 0] = "DEFAULT";
      e[e.DROP = 1] = "DROP";
      e[e.SUM = 2] = "SUM";
      e[e.LAST_VALUE = 3] = "LAST_VALUE";
      e[e.EXPLICIT_BUCKET_HISTOGRAM = 4] = "EXPLICIT_BUCKET_HISTOGRAM";
      e[e.EXPONENTIAL_HISTOGRAM = 5] = "EXPONENTIAL_HISTOGRAM";
    })(LVe = FVe.AggregationType || (FVe.AggregationType = {}));
    function ecm(e) {
      switch (e.type) {
        case LVe.DEFAULT:
          return NVe.DEFAULT_AGGREGATION;
        case LVe.DROP:
          return NVe.DROP_AGGREGATION;
        case LVe.SUM:
          return NVe.SUM_AGGREGATION;
        case LVe.LAST_VALUE:
          return NVe.LAST_VALUE_AGGREGATION;
        case LVe.EXPONENTIAL_HISTOGRAM:
          {
            let t = e;
            return new NVe.ExponentialHistogramAggregation(t.options?.maxSize, t.options?.recordMinMax);
          }
        case LVe.EXPLICIT_BUCKET_HISTOGRAM:
          {
            let t = e;
            if (t.options == null) {
              return NVe.HISTOGRAM_AGGREGATION;
            } else {
              return new NVe.ExplicitBucketHistogramAggregation(t.options?.boundaries, t.options?.recordMinMax);
            }
          }
        default:
          throw Error("Unsupported Aggregation");
      }
    }
    FVe.toAggregation = ecm;
  });
  var e0o = __commonJS(f_t => {
    Object.defineProperty(f_t, "__esModule", {
      value: true
    });
    f_t.DEFAULT_AGGREGATION_TEMPORALITY_SELECTOR = f_t.DEFAULT_AGGREGATION_SELECTOR = undefined;
    var tcm = FKn();
    var ncm = szt();
    var rcm = e => ({
      type: ncm.AggregationType.DEFAULT
    });
    f_t.DEFAULT_AGGREGATION_SELECTOR = rcm;
    var ocm = e => tcm.AggregationTemporality.CUMULATIVE;
    f_t.DEFAULT_AGGREGATION_TEMPORALITY_SELECTOR = ocm;
  });
  var t0o = __commonJS(XKn => {
    Object.defineProperty(XKn, "__esModule", {
      value: true
    });
    XKn.MetricReader = undefined;
    var Csl = Ji();
    var Rsl = mme();
    var xsl = e0o();
    class ksl {
      _shutdown = false;
      _metricProducers;
      _sdkMetricProducer;
      _aggregationTemporalitySelector;
      _aggregationSelector;
      _cardinalitySelector;
      constructor(e) {
        this._aggregationSelector = e?.aggregationSelector ?? xsl.DEFAULT_AGGREGATION_SELECTOR;
        this._aggregationTemporalitySelector = e?.aggregationTemporalitySelector ?? xsl.DEFAULT_AGGREGATION_TEMPORALITY_SELECTOR;
        this._metricProducers = e?.metricProducers ?? [];
        this._cardinalitySelector = e?.cardinalitySelector;
      }
      setMetricProducer(e) {
        if (this._sdkMetricProducer) {
          throw Error("MetricReader can not be bound to a MeterProvider again.");
        }
        this._sdkMetricProducer = e;
        this.onInitialized();
      }
      selectAggregation(e) {
        return this._aggregationSelector(e);
      }
      selectAggregationTemporality(e) {
        return this._aggregationTemporalitySelector(e);
      }
      selectCardinalityLimit(e) {
        return this._cardinalitySelector ? this._cardinalitySelector(e) : 2000;
      }
      onInitialized() {}
      async collect(e) {
        if (this._sdkMetricProducer === undefined) {
          throw Error("MetricReader is not bound to a MetricProducer");
        }
        if (this._shutdown) {
          throw Error("MetricReader is shutdown");
        }
        let [t, ...n] = await Promise.all([this._sdkMetricProducer.collect({
          timeoutMillis: e?.timeoutMillis
        }), ...this._metricProducers.map(i => i.collect({
          timeoutMillis: e?.timeoutMillis
        }))]);
        let r = t.errors.concat(n.flatMap(i => i.errors));
        let o = t.resourceMetrics.resource;
        let s = t.resourceMetrics.scopeMetrics.concat(n.flatMap(i => i.resourceMetrics.scopeMetrics));
        return {
          resourceMetrics: {
            resource: o,
            scopeMetrics: s
          },
          errors: r
        };
      }
      async shutdown(e) {
        if (this._shutdown) {
          Csl.diag.error("Cannot call shutdown twice.");
          return;
        }
        if (e?.timeoutMillis == null) {
          await this.onShutdown();
        } else {
          await (0, Rsl.callWithTimeout)(this.onShutdown(), e.timeoutMillis);
        }
        this._shutdown = true;
      }
      async forceFlush(e) {
        if (this._shutdown) {
          Csl.diag.warn("Cannot forceFlush on already shutdown MetricReader.");
          return;
        }
        if (e?.timeoutMillis == null) {
          await this.onForceFlush();
          return;
        }
        await (0, Rsl.callWithTimeout)(this.onForceFlush(), e.timeoutMillis);
      }
    }
    XKn.MetricReader = ksl;
  });
  var Psl = __commonJS(e7n => {
    Object.defineProperty(e7n, "__esModule", {
      value: true
    });
    e7n.PeriodicExportingMetricReader = undefined;
    var QKn = Ji();
    var ZKn = fse();
    var scm = t0o();
    var Asl = mme();
    var UVe = lve();
    class Isl extends scm.MetricReader {
      _interval;
      _exporter;
      _exportInterval;
      _exportTimeout;
      constructor(e) {
        let {
          exporter: t,
          exportIntervalMillis: n = 60000,
          metricProducers: r,
          cardinalityLimits: o
        } = e;
        let {
          exportTimeoutMillis: s = 30000
        } = e;
        super({
          aggregationSelector: t.selectAggregation?.bind(t),
          aggregationTemporalitySelector: t.selectAggregationTemporality?.bind(t),
          metricProducers: r,
          cardinalitySelector: i => {
            let a = {
              default: 2000,
              ...o
            };
            switch (i) {
              case UVe.InstrumentType.COUNTER:
                return a.counter ?? a.default;
              case UVe.InstrumentType.GAUGE:
                return a.gauge ?? a.default;
              case UVe.InstrumentType.HISTOGRAM:
                return a.histogram ?? a.default;
              case UVe.InstrumentType.OBSERVABLE_COUNTER:
                return a.observableCounter ?? a.default;
              case UVe.InstrumentType.OBSERVABLE_UP_DOWN_COUNTER:
                return a.observableUpDownCounter ?? a.default;
              case UVe.InstrumentType.OBSERVABLE_GAUGE:
                return a.observableGauge ?? a.default;
              case UVe.InstrumentType.UP_DOWN_COUNTER:
                return a.upDownCounter ?? a.default;
              default:
                return a.default;
            }
          }
        });
        if (n <= 0) {
          throw Error("exportIntervalMillis must be greater than 0");
        }
        if (s <= 0) {
          throw Error("exportTimeoutMillis must be greater than 0");
        }
        if (n < s) {
          if ("exportIntervalMillis" in e && "exportTimeoutMillis" in e) {
            throw Error("exportIntervalMillis must be greater than or equal to exportTimeoutMillis");
          } else {
            QKn.diag.info(`Timeout of ${s} exceeds the interval of ${n}. Clamping timeout to interval duration.`);
            s = n;
          }
        }
        this._exportInterval = n;
        this._exportTimeout = s;
        this._exporter = t;
      }
      async _runOnce() {
        try {
          await (0, Asl.callWithTimeout)(this._doRun(), this._exportTimeout);
        } catch (e) {
          if (e instanceof Asl.TimeoutError) {
            QKn.diag.error("Export took longer than %s milliseconds and timed out.", this._exportTimeout);
            return;
          }
          (0, ZKn.globalErrorHandler)(e);
        }
      }
      async _doRun() {
        let {
          resourceMetrics: e,
          errors: t
        } = await this.collect({
          timeoutMillis: this._exportTimeout
        });
        if (t.length > 0) {
          QKn.diag.error("PeriodicExportingMetricReader: metrics collection errors", ...t);
        }
        if (e.resource.asyncAttributesPending) {
          try {
            await e.resource.waitForAsyncAttributes?.();
          } catch (r) {
            QKn.diag.debug("Error while resolving async portion of resource: ", r);
            (0, ZKn.globalErrorHandler)(r);
          }
        }
        if (e.scopeMetrics.length === 0) {
          return;
        }
        let n = await ZKn.internal._export(this._exporter, e);
        if (n.code !== ZKn.ExportResultCode.SUCCESS) {
          throw Error(`PeriodicExportingMetricReader: metrics export failed (error ${n.error})`);
        }
      }
      onInitialized() {
        if (this._interval = setInterval(() => {
          this._runOnce();
        }, this._exportInterval), typeof this._interval !== "number") {
          this._interval.unref();
        }
      }
      async onForceFlush() {
        await this._runOnce();
        await this._exporter.forceFlush();
      }
      async onShutdown() {
        if (this._interval) {
          clearInterval(this._interval);
        }
        await this.onForceFlush();
        await this._exporter.shutdown();
      }
    }
    e7n.PeriodicExportingMetricReader = Isl;
  });
  var Msl = __commonJS(t7n => {
    Object.defineProperty(t7n, "__esModule", {
      value: true
    });
    t7n.InMemoryMetricExporter = undefined;
    var Osl = fse();
    class Dsl {
      _shutdown = false;
      _aggregationTemporality;
      _metrics = [];
      constructor(e) {
        this._aggregationTemporality = e;
      }
      export(e, t) {
        if (this._shutdown) {
          setTimeout(() => t({
            code: Osl.ExportResultCode.FAILED
          }), 0);
          return;
        }
        this._metrics.push(e);
        setTimeout(() => t({
          code: Osl.ExportResultCode.SUCCESS
        }), 0);
      }
      getMetrics() {
        return this._metrics;
      }
      forceFlush() {
        return Promise.resolve();
      }
      reset() {
        this._metrics = [];
      }
      selectAggregationTemporality(e) {
        return this._aggregationTemporality;
      }
      shutdown() {
        this._shutdown = true;
        return Promise.resolve();
      }
    }
    t7n.InMemoryMetricExporter = Dsl;
  });
  var Lsl = __commonJS(n7n => {
    Object.defineProperty(n7n, "__esModule", {
      value: true
    });
    n7n.ConsoleMetricExporter = undefined;
    var Nsl = fse();
    var icm = e0o();
    class n0o {
      _shutdown = false;
      _temporalitySelector;
      constructor(e) {
        this._temporalitySelector = e?.temporalitySelector ?? icm.DEFAULT_AGGREGATION_TEMPORALITY_SELECTOR;
      }
      export(e, t) {
        if (this._shutdown) {
          t({
            code: Nsl.ExportResultCode.FAILED
          });
          return;
        }
        return n0o._sendMetrics(e, t);
      }
      forceFlush() {
        return Promise.resolve();
      }
      selectAggregationTemporality(e) {
        return this._temporalitySelector(e);
      }
      shutdown() {
        this._shutdown = true;
        return Promise.resolve();
      }
      static _sendMetrics(e, t) {
        for (let n of e.scopeMetrics) {
          for (let r of n.metrics) {
            console.dir({
              descriptor: r.descriptor,
              dataPointType: r.dataPointType,
              dataPoints: r.dataPoints
            }, {
              depth: null
            });
          }
        }
        t({
          code: Nsl.ExportResultCode.SUCCESS
        });
      }
    }
    n7n.ConsoleMetricExporter = n0o;
  });
  var r0o = __commonJS(h_t => {
    Object.defineProperty(h_t, "__esModule", {
      value: true
    });
    h_t._clearDefaultServiceNameCache = h_t.defaultServiceName = undefined;
    var izt;
    function acm() {
      if (izt === undefined) {
        try {
          let e = globalThis.process.argv0;
          izt = e ? `unknown_service:${e}` : "unknown_service";
        } catch {
          izt = "unknown_service";
        }
      }
      return izt;
    }
    h_t.defaultServiceName = acm;
    function lcm() {
      izt = undefined;
    }
    h_t._clearDefaultServiceNameCache = lcm;
  });
  var Fsl = __commonJS(r7n => {
    Object.defineProperty(r7n, "__esModule", {
      value: true
    });
    r7n.isPromiseLike = undefined;
    var ccm = e => e !== null && typeof e === "object" && typeof e.then === "function";
    r7n.isPromiseLike = ccm;
  });
  var i0o = __commonJS(hme => {
    Object.defineProperty(hme, "__esModule", {
      value: true
    });
    hme.defaultResource = hme.emptyResource = hme.resourceFromDetectedResource = hme.resourceFromAttributes = undefined;
    var lzt = Ji();
    var o0o = fse();
    var BVe = Hne();
    var ucm = r0o();
    var azt = Fsl();
    class czt {
      _rawAttributes;
      _asyncAttributesPending = false;
      _schemaUrl;
      _memoizedAttributes;
      static FromAttributeList(e, t) {
        let n = new czt({}, t);
        n._rawAttributes = Usl(e);
        n._asyncAttributesPending = e.filter(([r, o]) => (0, azt.isPromiseLike)(o)).length > 0;
        return n;
      }
      constructor(e, t) {
        let n = e.attributes ?? {};
        this._rawAttributes = Object.entries(n).map(([r, o]) => {
          if ((0, azt.isPromiseLike)(o)) {
            this._asyncAttributesPending = true;
          }
          return [r, o];
        });
        this._rawAttributes = Usl(this._rawAttributes);
        this._schemaUrl = fcm(t?.schemaUrl);
      }
      get asyncAttributesPending() {
        return this._asyncAttributesPending;
      }
      async waitForAsyncAttributes() {
        if (!this.asyncAttributesPending) {
          return;
        }
        for (let e = 0; e < this._rawAttributes.length; e++) {
          let [t, n] = this._rawAttributes[e];
          this._rawAttributes[e] = [t, (0, azt.isPromiseLike)(n) ? await n : n];
        }
        this._asyncAttributesPending = false;
      }
      get attributes() {
        if (this.asyncAttributesPending) {
          lzt.diag.error("Accessing resource attributes before async attributes settled");
        }
        if (this._memoizedAttributes) {
          return this._memoizedAttributes;
        }
        let e = {};
        for (let [t, n] of this._rawAttributes) {
          if ((0, azt.isPromiseLike)(n)) {
            lzt.diag.debug(`Unsettled resource attribute ${t} skipped`);
            continue;
          }
          if (n != null) {
            e[t] ??= n;
          }
        }
        if (!this._asyncAttributesPending) {
          this._memoizedAttributes = e;
        }
        return e;
      }
      getRawAttributes() {
        return this._rawAttributes;
      }
      get schemaUrl() {
        return this._schemaUrl;
      }
      merge(e) {
        if (e == null) {
          return this;
        }
        let t = hcm(this, e);
        let n = t ? {
          schemaUrl: t
        } : undefined;
        return czt.FromAttributeList([...e.getRawAttributes(), ...this.getRawAttributes()], n);
      }
    }
    function s0o(e, t) {
      return czt.FromAttributeList(Object.entries(e), t);
    }
    hme.resourceFromAttributes = s0o;
    function dcm(e, t) {
      return new czt(e, t);
    }
    hme.resourceFromDetectedResource = dcm;
    function pcm() {
      return s0o({});
    }
    hme.emptyResource = pcm;
    function mcm() {
      return s0o({
        [BVe.ATTR_SERVICE_NAME]: (0, ucm.defaultServiceName)(),
        [BVe.ATTR_TELEMETRY_SDK_LANGUAGE]: o0o.SDK_INFO[BVe.ATTR_TELEMETRY_SDK_LANGUAGE],
        [BVe.ATTR_TELEMETRY_SDK_NAME]: o0o.SDK_INFO[BVe.ATTR_TELEMETRY_SDK_NAME],
        [BVe.ATTR_TELEMETRY_SDK_VERSION]: o0o.SDK_INFO[BVe.ATTR_TELEMETRY_SDK_VERSION]
      });
    }
    hme.defaultResource = mcm;
    function Usl(e) {
      return e.map(([t, n]) => {
        if ((0, azt.isPromiseLike)(n)) {
          return [t, n.catch(r => {
            lzt.diag.debug("promise rejection for resource attribute: %s - %s", t, r);
            return;
          })];
        }
        return [t, n];
      });
    }
    function fcm(e) {
      if (typeof e === "string" || e === undefined) {
        return e;
      }
      lzt.diag.warn("Schema URL must be string or undefined, got %s. Schema URL will be ignored.", e);
      return;
    }
    function hcm(e, t) {
      let n = e?.schemaUrl;
      let r = t?.schemaUrl;
      let o = n === undefined || n === "";
      let s = r === undefined || r === "";
      if (o) {
        return r;
      }
      if (s) {
        return n;
      }
      if (n === r) {
        return n;
      }
      lzt.diag.warn('Schema URL merge conflict: old resource has "%s", updating resource has "%s". Resulting resource will have undefined Schema URL.', n, r);
      return;
    }
  });