  var y6n = __commonJS(g8t => {
    Object.defineProperty(g8t, "__esModule", {
      value: true
    });
    g8t.AggregationTemporality = undefined;
    var RVp;
    (function (e) {
      e[e.DELTA = 0] = "DELTA";
      e[e.CUMULATIVE = 1] = "CUMULATIVE";
    })(RVp = g8t.AggregationTemporality || (g8t.AggregationTemporality = {}));
  });
  var t1e = __commonJS(e1e => {
    Object.defineProperty(e1e, "__esModule", {
      value: true
    });
    e1e.DataPointType = e1e.InstrumentType = undefined;
    var xVp;
    (function (e) {
      e.COUNTER = "COUNTER";
      e.GAUGE = "GAUGE";
      e.HISTOGRAM = "HISTOGRAM";
      e.UP_DOWN_COUNTER = "UP_DOWN_COUNTER";
      e.OBSERVABLE_COUNTER = "OBSERVABLE_COUNTER";
      e.OBSERVABLE_GAUGE = "OBSERVABLE_GAUGE";
      e.OBSERVABLE_UP_DOWN_COUNTER = "OBSERVABLE_UP_DOWN_COUNTER";
    })(xVp = e1e.InstrumentType || (e1e.InstrumentType = {}));
    var kVp;
    (function (e) {
      e[e.HISTOGRAM = 0] = "HISTOGRAM";
      e[e.EXPONENTIAL_HISTOGRAM = 1] = "EXPONENTIAL_HISTOGRAM";
      e[e.GAUGE = 2] = "GAUGE";
      e[e.SUM = 3] = "SUM";
    })(kVp = e1e.DataPointType || (e1e.DataPointType = {}));
  });
  var Zoe = __commonJS(Ix => {
    Object.defineProperty(Ix, "__esModule", {
      value: true
    });
    Ix.equalsCaseInsensitive = Ix.binarySearchUB = Ix.setEquals = Ix.FlatMap = Ix.isPromiseAllSettledRejectionResult = Ix.PromiseAllSettled = Ix.callWithTimeout = Ix.TimeoutError = Ix.instrumentationScopeId = Ix.hashAttributes = Ix.isNotNullish = undefined;
    function AVp(e) {
      return e !== undefined && e !== null;
    }
    Ix.isNotNullish = AVp;
    function IVp(e) {
      let t = Object.keys(e);
      if (t.length === 0) {
        return "";
      }
      t = t.sort();
      return JSON.stringify(t.map(n => [n, e[n]]));
    }
    Ix.hashAttributes = IVp;
    function PVp(e) {
      return `${e.name}:${e.version ?? ""}:${e.schemaUrl ?? ""}`;
    }
    Ix.instrumentationScopeId = PVp;
    class _6n extends Error {
      constructor(e) {
        super(e);
        Object.setPrototypeOf(this, _6n.prototype);
      }
    }
    Ix.TimeoutError = _6n;
    function OVp(e, t) {
      let n;
      let r = new Promise(function (s, i) {
        n = setTimeout(function () {
          i(new _6n("Operation timed out."));
        }, t);
      });
      return Promise.race([e, r]).then(o => (clearTimeout(n), o), o => {
        throw clearTimeout(n), o;
      });
    }
    Ix.callWithTimeout = OVp;
    async function DVp(e) {
      return Promise.all(e.map(async t => {
        try {
          return {
            status: "fulfilled",
            value: await t
          };
        } catch (n) {
          return {
            status: "rejected",
            reason: n
          };
        }
      }));
    }
    Ix.PromiseAllSettled = DVp;
    function MVp(e) {
      return e.status === "rejected";
    }
    Ix.isPromiseAllSettledRejectionResult = MVp;
    function NVp(e, t) {
      let n = [];
      e.forEach(r => {
        n.push(...t(r));
      });
      return n;
    }
    Ix.FlatMap = NVp;
    function LVp(e, t) {
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
    Ix.setEquals = LVp;
    function FVp(e, t) {
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
    Ix.binarySearchUB = FVp;
    function UVp(e, t) {
      return e.toLowerCase() === t.toLowerCase();
    }
    Ix.equalsCaseInsensitive = UVp;
  });
  var qgt = __commonJS(y8t => {
    Object.defineProperty(y8t, "__esModule", {
      value: true
    });
    y8t.AggregatorKind = undefined;
    var BVp;
    (function (e) {
      e[e.DROP = 0] = "DROP";
      e[e.SUM = 1] = "SUM";
      e[e.LAST_VALUE = 2] = "LAST_VALUE";
      e[e.HISTOGRAM = 3] = "HISTOGRAM";
      e[e.EXPONENTIAL_HISTOGRAM = 4] = "EXPONENTIAL_HISTOGRAM";
    })(BVp = y8t.AggregatorKind || (y8t.AggregatorKind = {}));
  });
  var Dza = __commonJS(b6n => {
    Object.defineProperty(b6n, "__esModule", {
      value: true
    });
    b6n.DropAggregator = undefined;
    var $Vp = qgt();
    class Oza {
      kind = $Vp.AggregatorKind.DROP;
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
    b6n.DropAggregator = Oza;
  });
  var Nza = __commonJS(Wgt => {
    Object.defineProperty(Wgt, "__esModule", {
      value: true
    });
    Wgt.HistogramAggregator = Wgt.HistogramAccumulation = undefined;
    var HVp = qgt();
    var _8t = t1e();
    var jVp = Zoe();
    function qVp(e) {
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
    class b8t {
      startTime;
      _boundaries;
      _recordMinMax;
      _current;
      constructor(e, t, n = true, r = qVp(t)) {
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
        let t = (0, jVp.binarySearchUB)(this._boundaries, e);
        this._current.buckets.counts[t] += 1;
      }
      setStartTime(e) {
        this.startTime = e;
      }
      toPointValue() {
        return this._current;
      }
    }
    Wgt.HistogramAccumulation = b8t;
    class Mza {
      _boundaries;
      _recordMinMax;
      kind = HVp.AggregatorKind.HISTOGRAM;
      constructor(e, t) {
        this._boundaries = e;
        this._recordMinMax = t;
      }
      createAccumulation(e) {
        return new b8t(e, this._boundaries, this._recordMinMax);
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
        return new b8t(e.startTime, n.buckets.boundaries, this._recordMinMax, {
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
        return new b8t(t.startTime, n.buckets.boundaries, this._recordMinMax, {
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
          dataPointType: _8t.DataPointType.HISTOGRAM,
          dataPoints: n.map(([o, s]) => {
            let i = s.toPointValue();
            let a = e.type === _8t.InstrumentType.GAUGE || e.type === _8t.InstrumentType.UP_DOWN_COUNTER || e.type === _8t.InstrumentType.OBSERVABLE_GAUGE || e.type === _8t.InstrumentType.OBSERVABLE_UP_DOWN_COUNTER;
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
    Wgt.HistogramAggregator = Mza;
  });
  var Lza = __commonJS(S6n => {
    Object.defineProperty(S6n, "__esModule", {
      value: true
    });
    S6n.Buckets = undefined;
    class ICo {
      backing;
      indexBase;
      indexStart;
      indexEnd;
      constructor(e = new PCo(), t = 0, n = 0, r = 0) {
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
        return new ICo(this.backing.clone(), this.indexBase, this.indexStart, this.indexEnd);
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
    S6n.Buckets = ICo;
    class PCo {
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
        return new PCo([...this._counts]);
      }
    }
  });
  var DCo = __commonJS(x9 => {
    Object.defineProperty(x9, "__esModule", {
      value: true
    });
    x9.getSignificand = x9.getNormalBase2 = x9.MIN_VALUE = x9.MAX_NORMAL_EXPONENT = x9.MIN_NORMAL_EXPONENT = x9.SIGNIFICAND_WIDTH = undefined;
    x9.SIGNIFICAND_WIDTH = 52;
    x9.MIN_NORMAL_EXPONENT = -1023 + 1;
    x9.MAX_NORMAL_EXPONENT = 1023;
    x9.MIN_VALUE = Math.pow(2, -1022);
    function VVp(e) {
      let t = new DataView(new ArrayBuffer(8));
      t.setFloat64(0, e);
      return ((t.getUint32(0) & 2146435072) >> 20) - 1023;
    }
    x9.getNormalBase2 = VVp;
    function zVp(e) {
      let t = new DataView(new ArrayBuffer(8));
      t.setFloat64(0, e);
      let n = t.getUint32(0);
      let r = t.getUint32(4);
      return (n & 1048575) * Math.pow(2, 32) + r;
    }
    x9.getSignificand = zVp;
  });
  var T6n = __commonJS(Ggt => {
    Object.defineProperty(Ggt, "__esModule", {
      value: true
    });
    Ggt.nextGreaterSquare = Ggt.ldexp = undefined;
    function KVp(e, t) {
      if (e === 0 || e === Number.POSITIVE_INFINITY || e === Number.NEGATIVE_INFINITY || Number.isNaN(e)) {
        return e;
      }
      return e * Math.pow(2, t);
    }
    Ggt.ldexp = KVp;
    function YVp(e) {
      e--;
      e |= e >> 1;
      e |= e >> 2;
      e |= e >> 4;
      e |= e >> 8;
      e |= e >> 16;
      e++;
      return e;
    }
    Ggt.nextGreaterSquare = YVp;
  });
  var v6n = __commonJS(E6n => {
    Object.defineProperty(E6n, "__esModule", {
      value: true
    });
    E6n.MappingError = undefined;
    class Fza extends Error {}
    E6n.MappingError = Fza;
  });