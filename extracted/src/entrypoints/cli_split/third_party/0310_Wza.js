  var Wza = __commonJS(C6n => {
    Object.defineProperty(C6n, "__esModule", {
      value: true
    });
    C6n.LogarithmMapping = undefined;
    var zgt = DCo();
    var Hza = T6n();
    var jza = v6n();
    class qza {
      _scale;
      _scaleFactor;
      _inverseFactor;
      constructor(e) {
        this._scale = e;
        this._scaleFactor = Hza.ldexp(Math.LOG2E, e);
        this._inverseFactor = Hza.ldexp(Math.LN2, -e);
      }
      mapToIndex(e) {
        if (e <= zgt.MIN_VALUE) {
          return this._minNormalLowerBoundaryIndex() - 1;
        }
        if (zgt.getSignificand(e) === 0) {
          return (zgt.getNormalBase2(e) << this._scale) - 1;
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
          throw new jza.MappingError(`overflow: ${e} is > maximum lower boundary: ${t}`);
        }
        let n = this._minNormalLowerBoundaryIndex();
        if (e <= n) {
          if (e === n) {
            return zgt.MIN_VALUE;
          } else if (e === n - 1) {
            return Math.exp((e + (1 << this._scale)) / this._scaleFactor) / 2;
          }
          throw new jza.MappingError(`overflow: ${e} is < minimum lower boundary: ${n}`);
        }
        return Math.exp(e * this._inverseFactor);
      }
      get scale() {
        return this._scale;
      }
      _minNormalLowerBoundaryIndex() {
        return zgt.MIN_NORMAL_EXPONENT << this._scale;
      }
      _maxNormalLowerBoundaryIndex() {
        return (zgt.MAX_NORMAL_EXPONENT + 1 << this._scale) - 1;
      }
    }
    C6n.LogarithmMapping = qza;
  });
  var zza = __commonJS(R6n => {
    Object.defineProperty(R6n, "__esModule", {
      value: true
    });
    R6n.getMapping = undefined;
    var XVp = $za();
    var QVp = Wza();
    var ZVp = v6n();
    var Gza = -10;
    var ezp = Array.from({
      length: 31
    }, (e, t) => {
      if (t > 10) {
        return new QVp.LogarithmMapping(t - 10);
      }
      return new XVp.ExponentMapping(t - 10);
    });
    function tzp(e) {
      if (e > 20 || e < Gza) {
        throw new ZVp.MappingError(`expected scale >= ${Gza} && <= ${20}, got: ${e}`);
      }
      return ezp[e + 10];
    }
    R6n.getMapping = tzp;
  });
  var Xza = __commonJS(Ygt => {
    Object.defineProperty(Ygt, "__esModule", {
      value: true
    });
    Ygt.ExponentialHistogramAggregator = Ygt.ExponentialHistogramAccumulation = undefined;
    var nzp = qgt();
    var S8t = t1e();
    var rzp = Ji();
    var Kza = Lza();
    var Yza = zza();
    var ozp = T6n();
    class Kgt {
      low;
      high;
      static combine(e, t) {
        return new Kgt(Math.min(e.low, t.low), Math.max(e.high, t.high));
      }
      constructor(e, t) {
        this.low = e;
        this.high = t;
      }
    }
    class x6n {
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
      constructor(e, t = 160, n = true, r = 0, o = 0, s = 0, i = Number.POSITIVE_INFINITY, a = Number.NEGATIVE_INFINITY, l = new Kza.Buckets(), c = new Kza.Buckets(), u = (0, Yza.getMapping)(20)) {
        if (this.startTime = e, this._maxSize = t, this._recordMinMax = n, this._sum = r, this._count = o, this._zeroCount = s, this._min = i, this._max = a, this._positive = l, this._negative = c, this._mapping = u, this._maxSize < 2) {
          rzp.diag.warn(`Exponential Histogram Max Size set to ${this._maxSize},                 changing to the minimum size of: ${2}`);
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
        return new x6n(this.startTime, this._maxSize, this._recordMinMax, this._sum, this._count, this._zeroCount, this._min, this._max, this.positive.clone(), this.negative.clone(), this._mapping);
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
        let s = (0, ozp.nextGreaterSquare)(t);
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
        this._mapping = (0, Yza.getMapping)(t);
      }
      _minScale(e) {
        let t = Math.min(this.scale, e.scale);
        let n = Kgt.combine(this._highLowAtScale(this.positive, this.scale, t), this._highLowAtScale(e.positive, e.scale, t));
        let r = Kgt.combine(this._highLowAtScale(this.negative, this.scale, t), this._highLowAtScale(e.negative, e.scale, t));
        return Math.min(t - this._changeScale(n.high, n.low), t - this._changeScale(r.high, r.low));
      }
      _highLowAtScale(e, t, n) {
        if (e.length === 0) {
          return new Kgt(0, -1);
        }
        let r = t - n;
        return new Kgt(e.indexStart >> r, e.indexEnd >> r);
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
    Ygt.ExponentialHistogramAccumulation = x6n;
    class Jza {
      _maxSize;
      _recordMinMax;
      kind = nzp.AggregatorKind.EXPONENTIAL_HISTOGRAM;
      constructor(e, t) {
        this._maxSize = e;
        this._recordMinMax = t;
      }
      createAccumulation(e) {
        return new x6n(e, this._maxSize, this._recordMinMax);
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
          dataPointType: S8t.DataPointType.EXPONENTIAL_HISTOGRAM,
          dataPoints: n.map(([o, s]) => {
            let i = s.toPointValue();
            let a = e.type === S8t.InstrumentType.GAUGE || e.type === S8t.InstrumentType.UP_DOWN_COUNTER || e.type === S8t.InstrumentType.OBSERVABLE_GAUGE || e.type === S8t.InstrumentType.OBSERVABLE_UP_DOWN_COUNTER;
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
    Ygt.ExponentialHistogramAggregator = Jza;
  });
  var Zza = __commonJS(Jgt => {
    Object.defineProperty(Jgt, "__esModule", {
      value: true
    });
    Jgt.LastValueAggregator = Jgt.LastValueAccumulation = undefined;
    var azp = qgt();
    var T8t = Gg();
    var lzp = t1e();
    class E8t {
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
        this.sampleTime = (0, T8t.millisToHrTime)(Date.now());
      }
      setStartTime(e) {
        this.startTime = e;
      }
      toPointValue() {
        return this._current;
      }
    }
    Jgt.LastValueAccumulation = E8t;
    class Qza {
      kind = azp.AggregatorKind.LAST_VALUE;
      createAccumulation(e) {
        return new E8t(e);
      }
      merge(e, t) {
        let n = (0, T8t.hrTimeToMicroseconds)(t.sampleTime) >= (0, T8t.hrTimeToMicroseconds)(e.sampleTime) ? t : e;
        return new E8t(e.startTime, n.toPointValue(), n.sampleTime);
      }
      diff(e, t) {
        let n = (0, T8t.hrTimeToMicroseconds)(t.sampleTime) >= (0, T8t.hrTimeToMicroseconds)(e.sampleTime) ? t : e;
        return new E8t(t.startTime, n.toPointValue(), n.sampleTime);
      }
      toMetricData(e, t, n, r) {
        return {
          descriptor: e,
          aggregationTemporality: t,
          dataPointType: lzp.DataPointType.GAUGE,
          dataPoints: n.map(([o, s]) => ({
            attributes: o,
            startTime: s.startTime,
            endTime: r,
            value: s.toPointValue()
          }))
        };
      }
    }
    Jgt.LastValueAggregator = Qza;
  });
  var tKa = __commonJS(Xgt => {
    Object.defineProperty(Xgt, "__esModule", {
      value: true
    });
    Xgt.SumAggregator = Xgt.SumAccumulation = undefined;
    var czp = qgt();
    var uzp = t1e();
    class K8e {
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
    Xgt.SumAccumulation = K8e;
    class eKa {
      monotonic;
      kind = czp.AggregatorKind.SUM;
      constructor(e) {
        this.monotonic = e;
      }
      createAccumulation(e) {
        return new K8e(e, this.monotonic);
      }
      merge(e, t) {
        let n = e.toPointValue();
        let r = t.toPointValue();
        if (t.reset) {
          return new K8e(t.startTime, this.monotonic, r, t.reset);
        }
        return new K8e(e.startTime, this.monotonic, n + r);
      }
      diff(e, t) {
        let n = e.toPointValue();
        let r = t.toPointValue();
        if (this.monotonic && n > r) {
          return new K8e(t.startTime, this.monotonic, r, true);
        }
        return new K8e(t.startTime, this.monotonic, r - n);
      }
      toMetricData(e, t, n, r) {
        return {
          descriptor: e,
          aggregationTemporality: t,
          dataPointType: uzp.DataPointType.SUM,
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
    Xgt.SumAggregator = eKa;
  });
  var iKa = __commonJS(LO => {
    Object.defineProperty(LO, "__esModule", {
      value: true
    });
    LO.SumAggregator = LO.SumAccumulation = LO.LastValueAggregator = LO.LastValueAccumulation = LO.ExponentialHistogramAggregator = LO.ExponentialHistogramAccumulation = LO.HistogramAggregator = LO.HistogramAccumulation = LO.DropAggregator = undefined;
    var dzp = Dza();
    Object.defineProperty(LO, "DropAggregator", {
      enumerable: true,
      get: function () {
        return dzp.DropAggregator;
      }
    });
    var nKa = Nza();
    Object.defineProperty(LO, "HistogramAccumulation", {
      enumerable: true,
      get: function () {
        return nKa.HistogramAccumulation;
      }
    });
    Object.defineProperty(LO, "HistogramAggregator", {
      enumerable: true,
      get: function () {
        return nKa.HistogramAggregator;
      }
    });
    var rKa = Xza();
    Object.defineProperty(LO, "ExponentialHistogramAccumulation", {
      enumerable: true,
      get: function () {
        return rKa.ExponentialHistogramAccumulation;
      }
    });
    Object.defineProperty(LO, "ExponentialHistogramAggregator", {
      enumerable: true,
      get: function () {
        return rKa.ExponentialHistogramAggregator;
      }
    });
    var oKa = Zza();
    Object.defineProperty(LO, "LastValueAccumulation", {
      enumerable: true,
      get: function () {
        return oKa.LastValueAccumulation;
      }
    });
    Object.defineProperty(LO, "LastValueAggregator", {
      enumerable: true,
      get: function () {
        return oKa.LastValueAggregator;
      }
    });
    var sKa = tKa();
    Object.defineProperty(LO, "SumAccumulation", {
      enumerable: true,
      get: function () {
        return sKa.SumAccumulation;
      }
    });
    Object.defineProperty(LO, "SumAggregator", {
      enumerable: true,
      get: function () {
        return sKa.SumAggregator;
      }
    });
  });
  var aKa = __commonJS(J_ => {
    Object.defineProperty(J_, "__esModule", {
      value: true
    });
    J_.DEFAULT_AGGREGATION = J_.EXPONENTIAL_HISTOGRAM_AGGREGATION = J_.HISTOGRAM_AGGREGATION = J_.LAST_VALUE_AGGREGATION = J_.SUM_AGGREGATION = J_.DROP_AGGREGATION = J_.DefaultAggregation = J_.ExponentialHistogramAggregation = J_.ExplicitBucketHistogramAggregation = J_.HistogramAggregation = J_.LastValueAggregation = J_.SumAggregation = J_.DropAggregation = undefined;
    var pzp = Ji();
    var Y8e = iKa();
    var Fpe = t1e();
    class k6n {
      static DEFAULT_INSTANCE = new Y8e.DropAggregator();
      createAggregator(e) {
        return k6n.DEFAULT_INSTANCE;
      }
    }
    J_.DropAggregation = k6n;
    class v8t {
      static MONOTONIC_INSTANCE = new Y8e.SumAggregator(true);
      static NON_MONOTONIC_INSTANCE = new Y8e.SumAggregator(false);
      createAggregator(e) {
        switch (e.type) {
          case Fpe.InstrumentType.COUNTER:
          case Fpe.InstrumentType.OBSERVABLE_COUNTER:
          case Fpe.InstrumentType.HISTOGRAM:
            return v8t.MONOTONIC_INSTANCE;
          default:
            return v8t.NON_MONOTONIC_INSTANCE;
        }
      }
    }
    J_.SumAggregation = v8t;
    class A6n {
      static DEFAULT_INSTANCE = new Y8e.LastValueAggregator();
      createAggregator(e) {
        return A6n.DEFAULT_INSTANCE;
      }
    }
    J_.LastValueAggregation = A6n;
    class I6n {
      static DEFAULT_INSTANCE = new Y8e.HistogramAggregator([0, 5, 10, 25, 50, 75, 100, 250, 500, 750, 1000, 2500, 5000, 7500, 1e4], true);
      createAggregator(e) {
        return I6n.DEFAULT_INSTANCE;
      }
    }
    J_.HistogramAggregation = I6n;
    class NCo {
      _recordMinMax;
      _boundaries;
      constructor(e, t = true) {
        if (this._recordMinMax = t, e == null) {
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
      }
      createAggregator(e) {
        return new Y8e.HistogramAggregator(this._boundaries, this._recordMinMax);
      }
    }
    J_.ExplicitBucketHistogramAggregation = NCo;
    class LCo {
      _maxSize;
      _recordMinMax;
      constructor(e = 160, t = true) {
        this._maxSize = e;
        this._recordMinMax = t;
      }
      createAggregator(e) {
        return new Y8e.ExponentialHistogramAggregator(this._maxSize, this._recordMinMax);
      }
    }
    J_.ExponentialHistogramAggregation = LCo;
    class FCo {
      _resolve(e) {
        switch (e.type) {
          case Fpe.InstrumentType.COUNTER:
          case Fpe.InstrumentType.UP_DOWN_COUNTER:
          case Fpe.InstrumentType.OBSERVABLE_COUNTER:
          case Fpe.InstrumentType.OBSERVABLE_UP_DOWN_COUNTER:
            return J_.SUM_AGGREGATION;
          case Fpe.InstrumentType.GAUGE:
          case Fpe.InstrumentType.OBSERVABLE_GAUGE:
            return J_.LAST_VALUE_AGGREGATION;
          case Fpe.InstrumentType.HISTOGRAM:
            {
              if (e.advice.explicitBucketBoundaries) {
                return new NCo(e.advice.explicitBucketBoundaries);
              }
              return J_.HISTOGRAM_AGGREGATION;
            }
        }
        pzp.diag.warn(`Unable to recognize instrument type: ${e.type}`);
        return J_.DROP_AGGREGATION;
      }
      createAggregator(e) {
        return this._resolve(e).createAggregator(e);
      }
    }
    J_.DefaultAggregation = FCo;
    J_.DROP_AGGREGATION = new k6n();
    J_.SUM_AGGREGATION = new v8t();
    J_.LAST_VALUE_AGGREGATION = new A6n();
    J_.HISTOGRAM_AGGREGATION = new I6n();
    J_.EXPONENTIAL_HISTOGRAM_AGGREGATION = new LCo();
    J_.DEFAULT_AGGREGATION = new FCo();
  });
  var w8t = __commonJS(Q8e => {
    Object.defineProperty(Q8e, "__esModule", {
      value: true
    });
    Q8e.toAggregation = Q8e.AggregationType = undefined;
    var J8e = aKa();
    var X8e;
    (function (e) {
      e[e.DEFAULT = 0] = "DEFAULT";
      e[e.DROP = 1] = "DROP";
      e[e.SUM = 2] = "SUM";
      e[e.LAST_VALUE = 3] = "LAST_VALUE";
      e[e.EXPLICIT_BUCKET_HISTOGRAM = 4] = "EXPLICIT_BUCKET_HISTOGRAM";
      e[e.EXPONENTIAL_HISTOGRAM = 5] = "EXPONENTIAL_HISTOGRAM";
    })(X8e = Q8e.AggregationType || (Q8e.AggregationType = {}));
    function mzp(e) {
      switch (e.type) {
        case X8e.DEFAULT:
          return J8e.DEFAULT_AGGREGATION;
        case X8e.DROP:
          return J8e.DROP_AGGREGATION;
        case X8e.SUM:
          return J8e.SUM_AGGREGATION;
        case X8e.LAST_VALUE:
          return J8e.LAST_VALUE_AGGREGATION;
        case X8e.EXPONENTIAL_HISTOGRAM:
          {
            let t = e;
            return new J8e.ExponentialHistogramAggregation(t.options?.maxSize, t.options?.recordMinMax);
          }
        case X8e.EXPLICIT_BUCKET_HISTOGRAM:
          {
            let t = e;
            if (t.options == null) {
              return J8e.HISTOGRAM_AGGREGATION;
            } else {
              return new J8e.ExplicitBucketHistogramAggregation(t.options?.boundaries, t.options?.recordMinMax);
            }
          }
        default:
          throw Error("Unsupported Aggregation");
      }
    }
    Q8e.toAggregation = mzp;
  });
  var UCo = __commonJS(Qgt => {
    Object.defineProperty(Qgt, "__esModule", {
      value: true
    });
    Qgt.DEFAULT_AGGREGATION_TEMPORALITY_SELECTOR = Qgt.DEFAULT_AGGREGATION_SELECTOR = undefined;
    var fzp = y6n();
    var hzp = w8t();
    var gzp = e => ({
      type: hzp.AggregationType.DEFAULT
    });
    Qgt.DEFAULT_AGGREGATION_SELECTOR = gzp;
    var yzp = e => fzp.AggregationTemporality.CUMULATIVE;
    Qgt.DEFAULT_AGGREGATION_TEMPORALITY_SELECTOR = yzp;
  });
  var BCo = __commonJS(O6n => {
    Object.defineProperty(O6n, "__esModule", {
      value: true
    });
    O6n.MetricReader = undefined;
    var lKa = Ji();
    var P6n = Zoe();
    var cKa = UCo();
    class uKa {
      _shutdown = false;
      _metricProducers;
      _sdkMetricProducer;
      _aggregationTemporalitySelector;
      _aggregationSelector;
      _cardinalitySelector;
      constructor(e) {
        this._aggregationSelector = e?.aggregationSelector ?? cKa.DEFAULT_AGGREGATION_SELECTOR;
        this._aggregationTemporalitySelector = e?.aggregationTemporalitySelector ?? cKa.DEFAULT_AGGREGATION_TEMPORALITY_SELECTOR;
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
        let r = t.errors.concat((0, P6n.FlatMap)(n, i => i.errors));
        let o = t.resourceMetrics.resource;
        let s = t.resourceMetrics.scopeMetrics.concat((0, P6n.FlatMap)(n, i => i.resourceMetrics.scopeMetrics));
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
          lKa.diag.error("Cannot call shutdown twice.");
          return;
        }
        if (e?.timeoutMillis == null) {
          await this.onShutdown();
        } else {
          await (0, P6n.callWithTimeout)(this.onShutdown(), e.timeoutMillis);
        }
        this._shutdown = true;
      }
      async forceFlush(e) {
        if (this._shutdown) {
          lKa.diag.warn("Cannot forceFlush on already shutdown MetricReader.");
          return;
        }
        if (e?.timeoutMillis == null) {
          await this.onForceFlush();
          return;
        }
        await (0, P6n.callWithTimeout)(this.onForceFlush(), e.timeoutMillis);
      }
    }
    O6n.MetricReader = uKa;
  });
  var mKa = __commonJS(M6n => {
    Object.defineProperty(M6n, "__esModule", {
      value: true
    });
    M6n.PeriodicExportingMetricReader = undefined;
    var $Co = Ji();
    var D6n = Gg();
    var _zp = BCo();
    var dKa = Zoe();
    class pKa extends _zp.MetricReader {
      _interval;
      _exporter;
      _exportInterval;
      _exportTimeout;
      constructor(e) {
        super({
          aggregationSelector: e.exporter.selectAggregation?.bind(e.exporter),
          aggregationTemporalitySelector: e.exporter.selectAggregationTemporality?.bind(e.exporter),
          metricProducers: e.metricProducers
        });
        if (e.exportIntervalMillis !== undefined && e.exportIntervalMillis <= 0) {
          throw Error("exportIntervalMillis must be greater than 0");
        }
        if (e.exportTimeoutMillis !== undefined && e.exportTimeoutMillis <= 0) {
          throw Error("exportTimeoutMillis must be greater than 0");
        }
        if (e.exportTimeoutMillis !== undefined && e.exportIntervalMillis !== undefined && e.exportIntervalMillis < e.exportTimeoutMillis) {
          throw Error("exportIntervalMillis must be greater than or equal to exportTimeoutMillis");
        }
        this._exportInterval = e.exportIntervalMillis ?? 60000;
        this._exportTimeout = e.exportTimeoutMillis ?? 30000;
        this._exporter = e.exporter;
      }
      async _runOnce() {
        try {
          await (0, dKa.callWithTimeout)(this._doRun(), this._exportTimeout);
        } catch (e) {
          if (e instanceof dKa.TimeoutError) {
            $Co.diag.error("Export took longer than %s milliseconds and timed out.", this._exportTimeout);
            return;
          }
          (0, D6n.globalErrorHandler)(e);
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
          $Co.diag.error("PeriodicExportingMetricReader: metrics collection errors", ...t);
        }
        if (e.resource.asyncAttributesPending) {
          try {
            await e.resource.waitForAsyncAttributes?.();
          } catch (r) {
            $Co.diag.debug("Error while resolving async portion of resource: ", r);
            (0, D6n.globalErrorHandler)(r);
          }
        }
        if (e.scopeMetrics.length === 0) {
          return;
        }
        let n = await D6n.internal._export(this._exporter, e);
        if (n.code !== D6n.ExportResultCode.SUCCESS) {
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
    M6n.PeriodicExportingMetricReader = pKa;
  });
  var gKa = __commonJS(N6n => {
    Object.defineProperty(N6n, "__esModule", {
      value: true
    });
    N6n.InMemoryMetricExporter = undefined;
    var fKa = Gg();
    class hKa {
      _shutdown = false;
      _aggregationTemporality;
      _metrics = [];
      constructor(e) {
        this._aggregationTemporality = e;
      }
      export(e, t) {
        if (this._shutdown) {
          setTimeout(() => t({
            code: fKa.ExportResultCode.FAILED
          }), 0);
          return;
        }
        this._metrics.push(e);
        setTimeout(() => t({
          code: fKa.ExportResultCode.SUCCESS
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
    N6n.InMemoryMetricExporter = hKa;
  });
  var _Ka = __commonJS(L6n => {
    Object.defineProperty(L6n, "__esModule", {
      value: true
    });
    L6n.ConsoleMetricExporter = undefined;
    var yKa = Gg();
    var bzp = UCo();
    class HCo {
      _shutdown = false;
      _temporalitySelector;
      constructor(e) {
        this._temporalitySelector = e?.temporalitySelector ?? bzp.DEFAULT_AGGREGATION_TEMPORALITY_SELECTOR;
      }
      export(e, t) {
        if (this._shutdown) {
          setImmediate(t, {
            code: yKa.ExportResultCode.FAILED
          });
          return;
        }
        return HCo._sendMetrics(e, t);
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
          code: yKa.ExportResultCode.SUCCESS
        });
      }
    }
    L6n.ConsoleMetricExporter = HCo;
  });
  var SKa = __commonJS(F6n => {
    Object.defineProperty(F6n, "__esModule", {
      value: true
    });
    F6n.ViewRegistry = undefined;
    class bKa {
      _registeredViews = [];
      addView(e) {
        this._registeredViews.push(e);
      }
      findViews(e, t) {
        return this._registeredViews.filter(r => this._matchInstrument(r.instrumentSelector, e) && this._matchMeter(r.meterSelector, t));
      }
      _matchInstrument(e, t) {
        return (e.getType() === undefined || t.type === e.getType()) && e.getNameFilter().match(t.name) && e.getUnitFilter().match(t.unit);
      }
      _matchMeter(e, t) {
        return e.getNameFilter().match(t.name) && (t.version === undefined || e.getVersionFilter().match(t.version)) && (t.schemaUrl === undefined || e.getSchemaUrlFilter().match(t.schemaUrl));
      }
    }
    F6n.ViewRegistry = bKa;
  });
  var C8t = __commonJS(Upe => {
    Object.defineProperty(Upe, "__esModule", {
      value: true
    });
    Upe.isValidName = Upe.isDescriptorCompatibleWith = Upe.createInstrumentDescriptorWithView = Upe.createInstrumentDescriptor = undefined;
    var TKa = Ji();
    var Szp = Zoe();
    function Tzp(e, t, n) {
      if (!EKa(e)) {
        TKa.diag.warn(`Invalid metric name: "${e}". The metric name should be a ASCII string with a length no greater than 255 characters.`);
      }
      return {
        name: e,
        type: t,
        description: n?.description ?? "",
        unit: n?.unit ?? "",
        valueType: n?.valueType ?? TKa.ValueType.DOUBLE,
        advice: n?.advice ?? {}
      };
    }
    Upe.createInstrumentDescriptor = Tzp;
    function Ezp(e, t) {
      return {
        name: e.name ?? t.name,
        description: e.description ?? t.description,
        type: t.type,
        unit: t.unit,
        valueType: t.valueType,
        advice: t.advice
      };
    }
    Upe.createInstrumentDescriptorWithView = Ezp;
    function vzp(e, t) {
      return (0, Szp.equalsCaseInsensitive)(e.name, t.name) && e.unit === t.unit && e.type === t.type && e.valueType === t.valueType;
    }
    Upe.isDescriptorCompatibleWith = vzp;
    function EKa(e) {
      return e.match(/^[a-z][a-z0-9_.\-/]{0,254}$/i) != null;
    }
    Upe.isValidName = EKa;
  });
  var U6n = __commonJS(v0 => {
    Object.defineProperty(v0, "__esModule", {
      value: true
    });
    v0.isObservableInstrument = v0.ObservableUpDownCounterInstrument = v0.ObservableGaugeInstrument = v0.ObservableCounterInstrument = v0.ObservableInstrument = v0.HistogramInstrument = v0.GaugeInstrument = v0.CounterInstrument = v0.UpDownCounterInstrument = v0.SyncInstrument = undefined;
    var Zgt = Ji();
    var Czp = Gg();
    class eyt {
      _writableMetricStorage;
      _descriptor;
      constructor(e, t) {
        this._writableMetricStorage = e;
        this._descriptor = t;
      }
      _record(e, t = {}, n = Zgt.context.active()) {
        if (typeof e !== "number") {
          Zgt.diag.warn(`non-number value provided to metric ${this._descriptor.name}: ${e}`);
          return;
        }
        if (this._descriptor.valueType === Zgt.ValueType.INT && !Number.isInteger(e)) {
          if (Zgt.diag.warn(`INT value type cannot accept a floating-point value for ${this._descriptor.name}, ignoring the fractional digits.`), e = Math.trunc(e), !Number.isInteger(e)) {
            return;
          }
        }
        this._writableMetricStorage.record(e, t, n, (0, Czp.millisToHrTime)(Date.now()));
      }
    }
    v0.SyncInstrument = eyt;
    class vKa extends eyt {
      add(e, t, n) {
        this._record(e, t, n);
      }
    }
    v0.UpDownCounterInstrument = vKa;
    class wKa extends eyt {
      add(e, t, n) {
        if (e < 0) {
          Zgt.diag.warn(`negative value provided to counter ${this._descriptor.name}: ${e}`);
          return;
        }
        this._record(e, t, n);
      }
    }
    v0.CounterInstrument = wKa;
    class CKa extends eyt {
      record(e, t, n) {
        this._record(e, t, n);
      }
    }
    v0.GaugeInstrument = CKa;
    class RKa extends eyt {
      record(e, t, n) {
        if (e < 0) {
          Zgt.diag.warn(`negative value provided to histogram ${this._descriptor.name}: ${e}`);
          return;
        }
        this._record(e, t, n);
      }
    }
    v0.HistogramInstrument = RKa;
    class tyt {
      _observableRegistry;
      _metricStorages;
      _descriptor;
      constructor(e, t, n) {
        this._observableRegistry = n;
        this._descriptor = e;
        this._metricStorages = t;
      }
      addCallback(e) {
        this._observableRegistry.addCallback(e, this);
      }
      removeCallback(e) {
        this._observableRegistry.removeCallback(e, this);
      }
    }
    v0.ObservableInstrument = tyt;
    class xKa extends tyt {}
    v0.ObservableCounterInstrument = xKa;
    class kKa extends tyt {}
    v0.ObservableGaugeInstrument = kKa;
    class AKa extends tyt {}
    v0.ObservableUpDownCounterInstrument = AKa;
    function Rzp(e) {
      return e instanceof tyt;
    }
    v0.isObservableInstrument = Rzp;
  });
  var PKa = __commonJS(B6n => {
    Object.defineProperty(B6n, "__esModule", {
      value: true
    });
    B6n.Meter = undefined;
    var Z8e = C8t();
    var eVe = U6n();
    var tVe = t1e();
    class IKa {
      _meterSharedState;
      constructor(e) {
        this._meterSharedState = e;
      }
      createGauge(e, t) {
        let n = (0, Z8e.createInstrumentDescriptor)(e, tVe.InstrumentType.GAUGE, t);
        let r = this._meterSharedState.registerMetricStorage(n);
        return new eVe.GaugeInstrument(r, n);
      }
      createHistogram(e, t) {
        let n = (0, Z8e.createInstrumentDescriptor)(e, tVe.InstrumentType.HISTOGRAM, t);
        let r = this._meterSharedState.registerMetricStorage(n);
        return new eVe.HistogramInstrument(r, n);
      }
      createCounter(e, t) {
        let n = (0, Z8e.createInstrumentDescriptor)(e, tVe.InstrumentType.COUNTER, t);
        let r = this._meterSharedState.registerMetricStorage(n);
        return new eVe.CounterInstrument(r, n);
      }
      createUpDownCounter(e, t) {
        let n = (0, Z8e.createInstrumentDescriptor)(e, tVe.InstrumentType.UP_DOWN_COUNTER, t);
        let r = this._meterSharedState.registerMetricStorage(n);
        return new eVe.UpDownCounterInstrument(r, n);
      }
      createObservableGauge(e, t) {
        let n = (0, Z8e.createInstrumentDescriptor)(e, tVe.InstrumentType.OBSERVABLE_GAUGE, t);
        let r = this._meterSharedState.registerAsyncMetricStorage(n);
        return new eVe.ObservableGaugeInstrument(n, r, this._meterSharedState.observableRegistry);
      }
      createObservableCounter(e, t) {
        let n = (0, Z8e.createInstrumentDescriptor)(e, tVe.InstrumentType.OBSERVABLE_COUNTER, t);
        let r = this._meterSharedState.registerAsyncMetricStorage(n);
        return new eVe.ObservableCounterInstrument(n, r, this._meterSharedState.observableRegistry);
      }
      createObservableUpDownCounter(e, t) {
        let n = (0, Z8e.createInstrumentDescriptor)(e, tVe.InstrumentType.OBSERVABLE_UP_DOWN_COUNTER, t);
        let r = this._meterSharedState.registerAsyncMetricStorage(n);
        return new eVe.ObservableUpDownCounterInstrument(n, r, this._meterSharedState.observableRegistry);
      }
      addBatchObservableCallback(e, t) {
        this._meterSharedState.observableRegistry.addBatchCallback(e, t);
      }
      removeBatchObservableCallback(e, t) {
        this._meterSharedState.observableRegistry.removeBatchCallback(e, t);
      }
    }
    B6n.Meter = IKa;
  });
  var jCo = __commonJS($6n => {
    Object.defineProperty($6n, "__esModule", {
      value: true
    });
    $6n.MetricStorage = undefined;
    var xzp = C8t();
    class OKa {
      _instrumentDescriptor;
      constructor(e) {
        this._instrumentDescriptor = e;
      }
      getInstrumentDescriptor() {
        return this._instrumentDescriptor;
      }
      updateDescription(e) {
        this._instrumentDescriptor = (0, xzp.createInstrumentDescriptor)(this._instrumentDescriptor.name, this._instrumentDescriptor.type, {
          description: e,
          valueType: this._instrumentDescriptor.valueType,
          unit: this._instrumentDescriptor.unit,
          advice: this._instrumentDescriptor.advice
        });
      }
    }
    $6n.MetricStorage = OKa;
  });
  var R8t = __commonJS(nyt => {
    Object.defineProperty(nyt, "__esModule", {
      value: true
    });
    nyt.AttributeHashMap = nyt.HashMap = undefined;
    var kzp = Zoe();
    class qCo {
      _hash;
      _valueMap = new Map();
      _keyMap = new Map();
      constructor(e) {
        this._hash = e;
      }
      get(e, t) {
        t ??= this._hash(e);
        return this._valueMap.get(t);
      }
      getOrDefault(e, t) {
        let n = this._hash(e);
        if (this._valueMap.vZc(n)) {
          return this._valueMap.get(n);
        }
        let r = t();
        if (!this._keyMap.vZc(n)) {
          this._keyMap.set(n, e);
        }
        this._valueMap.set(n, r);
        return r;
      }
      set(e, t, n) {
        if (n ??= this._hash(e), !this._keyMap.vZc(n)) {
          this._keyMap.set(n, e);
        }
        this._valueMap.set(n, t);
      }
      vZc(e, t) {
        t ??= this._hash(e);
        return this._valueMap.vZc(t);
      }
      *keys() {
        let e = this._keyMap.entries();
        let t = e.next();
        while (t.done !== true) {
          yield [t.value[1], t.value[0]];
          t = e.next();
        }
      }
      *entries() {
        let e = this._valueMap.entries();
        let t = e.next();
        while (t.done !== true) {
          yield [this._keyMap.get(t.value[0]), t.value[1], t.value[0]];
          t = e.next();
        }
      }
      get size() {
        return this._valueMap.size;
      }
    }
    nyt.HashMap = qCo;
    class DKa extends qCo {
      constructor() {
        super(kzp.hashAttributes);
      }
    }
    nyt.AttributeHashMap = DKa;
  });
  var GCo = __commonJS(H6n => {
    Object.defineProperty(H6n, "__esModule", {
      value: true
    });
    H6n.DeltaMetricProcessor = undefined;
    var Azp = Zoe();
    var WCo = R8t();
    class MKa {
      _aggregator;
      _activeCollectionStorage = new WCo.AttributeHashMap();
      _cumulativeMemoStorage = new WCo.AttributeHashMap();
      _cardinalityLimit;
      _overflowAttributes = {
        "otel.metric.overflow": true
      };
      _overflowHashCode;
      constructor(e, t) {
        this._aggregator = e;
        this._cardinalityLimit = (t ?? 2000) - 1;
        this._overflowHashCode = (0, Azp.hashAttributes)(this._overflowAttributes);
      }
      record(e, t, n, r) {
        let o = this._activeCollectionStorage.get(t);
        if (!o) {
          if (this._activeCollectionStorage.size >= this._cardinalityLimit) {
            this._activeCollectionStorage.getOrDefault(this._overflowAttributes, () => this._aggregator.createAccumulation(r))?.record(e);
            return;
          }
          o = this._aggregator.createAccumulation(r);
          this._activeCollectionStorage.set(t, o);
        }
        o?.record(e);
      }
      batchCumulate(e, t) {
        Array.from(e.entries()).forEach(([n, r, o]) => {
          let s = this._aggregator.createAccumulation(t);
          s?.record(r);
          let i = s;
          if (this._cumulativeMemoStorage.vZc(n, o)) {
            let a = this._cumulativeMemoStorage.get(n, o);
            i = this._aggregator.diff(a, s);
          } else if (this._cumulativeMemoStorage.size >= this._cardinalityLimit) {
            if (n = this._overflowAttributes, o = this._overflowHashCode, this._cumulativeMemoStorage.vZc(n, o)) {
              let a = this._cumulativeMemoStorage.get(n, o);
              i = this._aggregator.diff(a, s);
            }
          }
          if (this._activeCollectionStorage.vZc(n, o)) {
            let a = this._activeCollectionStorage.get(n, o);
            i = this._aggregator.merge(a, i);
          }
          this._cumulativeMemoStorage.set(n, s, o);
          this._activeCollectionStorage.set(n, i, o);
        });
      }
      collect() {
        let e = this._activeCollectionStorage;
        this._activeCollectionStorage = new WCo.AttributeHashMap();
        return e;
      }
    }
    H6n.DeltaMetricProcessor = MKa;
  });
  var VCo = __commonJS(j6n => {
    Object.defineProperty(j6n, "__esModule", {
      value: true
    });
    j6n.TemporalMetricProcessor = undefined;
    var Izp = y6n();
    var Pzp = R8t();
    class x8t {
      _aggregator;
      _unreportedAccumulations = new Map();
      _reportHistory = new Map();
      constructor(e, t) {
        this._aggregator = e;
        t.forEach(n => {
          this._unreportedAccumulations.set(n, []);
        });
      }
      buildMetrics(e, t, n, r) {
        this._stashAccumulations(n);
        let o = this._getMergedUnreportedAccumulations(e);
        let s = o;
        let i;
        if (this._reportHistory.vZc(e)) {
          let l = this._reportHistory.get(e);
          let c = l.collectionTime;
          if (i = l.aggregationTemporality, i === Izp.AggregationTemporality.CUMULATIVE) {
            s = x8t.merge(l.accumulations, o, this._aggregator);
          } else {
            s = x8t.calibrateStartTime(l.accumulations, o, c);
          }
        } else {
          i = e.selectAggregationTemporality(t.type);
        }
        this._reportHistory.set(e, {
          accumulations: s,
          collectionTime: r,
          aggregationTemporality: i
        });
        let a = Ozp(s);
        if (a.length === 0) {
          return;
        }
        return this._aggregator.toMetricData(t, i, a, r);
      }
      _stashAccumulations(e) {
        let t = this._unreportedAccumulations.keys();
        for (let n of t) {
          let r = this._unreportedAccumulations.get(n);
          if (r === undefined) {
            r = [];
            this._unreportedAccumulations.set(n, r);
          }
          r.push(e);
        }
      }
      _getMergedUnreportedAccumulations(e) {
        let t = new Pzp.AttributeHashMap();
        let n = this._unreportedAccumulations.get(e);
        if (this._unreportedAccumulations.set(e, []), n === undefined) {
          return t;
        }
        for (let r of n) {
          t = x8t.merge(t, r, this._aggregator);
        }
        return t;
      }
      static merge(e, t, n) {
        let r = e;
        let o = t.entries();
        let s = o.next();
        while (s.done !== true) {
          let [i, a, l] = s.value;
          if (e.vZc(i, l)) {
            let c = e.get(i, l);
            let u = n.merge(c, a);
            r.set(i, u, l);
          } else {
            r.set(i, a, l);
          }
          s = o.next();
        }
        return r;
      }
      static calibrateStartTime(e, t, n) {
        for (let [r, o] of e.keys()) {
          t.get(r, o)?.setStartTime(n);
        }
        return t;
      }
    }
    j6n.TemporalMetricProcessor = x8t;
    function Ozp(e) {
      return Array.from(e.entries());
    }
  });
  var LKa = __commonJS(q6n => {
    Object.defineProperty(q6n, "__esModule", {
      value: true
    });
    q6n.AsyncMetricStorage = undefined;
    var Dzp = jCo();
    var Mzp = GCo();
    var Nzp = VCo();
    var Lzp = R8t();
    class NKa extends Dzp.MetricStorage {
      _attributesProcessor;
      _aggregationCardinalityLimit;
      _deltaMetricStorage;
      _temporalMetricStorage;
      constructor(e, t, n, r, o) {
        super(e);
        this._attributesProcessor = n;
        this._aggregationCardinalityLimit = o;
        this._deltaMetricStorage = new Mzp.DeltaMetricProcessor(t, this._aggregationCardinalityLimit);
        this._temporalMetricStorage = new Nzp.TemporalMetricProcessor(t, r);
      }
      record(e, t) {
        let n = new Lzp.AttributeHashMap();
        Array.from(e.entries()).forEach(([r, o]) => {
          n.set(this._attributesProcessor.process(r), o);
        });
        this._deltaMetricStorage.batchCumulate(n, t);
      }
      collect(e, t) {
        let n = this._deltaMetricStorage.collect();
        return this._temporalMetricStorage.buildMetrics(e, this._instrumentDescriptor, n, t);
      }
    }
    q6n.AsyncMetricStorage = NKa;
  });
  var HKa = __commonJS(k9 => {
    Object.defineProperty(k9, "__esModule", {
      value: true
    });
    k9.getConflictResolutionRecipe = k9.getDescriptionResolutionRecipe = k9.getTypeConflictResolutionRecipe = k9.getUnitConflictResolutionRecipe = k9.getValueTypeConflictResolutionRecipe = k9.getIncompatibilityDetails = undefined;
    function Fzp(e, t) {
      let n = "";
      if (e.unit !== t.unit) {
        n += `	- Unit '${e.unit}' does not match '${t.unit}'
`;
      }
      if (e.type !== t.type) {
        n += `	- Type '${e.type}' does not match '${t.type}'
`;
      }
      if (e.valueType !== t.valueType) {
        n += `	- Value Type '${e.valueType}' does not match '${t.valueType}'
`;
      }
      if (e.description !== t.description) {
        n += `	- Description '${e.description}' does not match '${t.description}'
`;
      }
      return n;
    }
    k9.getIncompatibilityDetails = Fzp;
    function FKa(e, t) {
      return `	- use valueType '${e.valueType}' on instrument creation or use an instrument name other than '${t.name}'`;
    }
    k9.getValueTypeConflictResolutionRecipe = FKa;
    function UKa(e, t) {
      return `	- use unit '${e.unit}' on instrument creation or use an instrument name other than '${t.name}'`;
    }
    k9.getUnitConflictResolutionRecipe = UKa;
    function BKa(e, t) {
      let n = {
        name: t.name,
        type: t.type,
        unit: t.unit
      };
      let r = JSON.stringify(n);
      return `	- create a new view with a name other than '${e.name}' and InstrumentSelector '${r}'`;
    }
    k9.getTypeConflictResolutionRecipe = BKa;
    function $Ka(e, t) {
      let n = {
        name: t.name,
        type: t.type,
        unit: t.unit
      };
      let r = JSON.stringify(n);
      return `	- create a new view with a name other than '${e.name}' and InstrumentSelector '${r}'
    	- OR - create a new view with the name ${e.name} and description '${e.description}' and InstrumentSelector ${r}
    	- OR - create a new view with the name ${t.name} and description '${e.description}' and InstrumentSelector ${r}`;
    }
    k9.getDescriptionResolutionRecipe = $Ka;
    function Uzp(e, t) {
      if (e.valueType !== t.valueType) {
        return FKa(e, t);
      }
      if (e.unit !== t.unit) {
        return UKa(e, t);
      }
      if (e.type !== t.type) {
        return BKa(e, t);
      }
      if (e.description !== t.description) {
        return $Ka(e, t);
      }
      return "";
    }
    k9.getConflictResolutionRecipe = Uzp;
  });
  var qKa = __commonJS(G6n => {
    Object.defineProperty(G6n, "__esModule", {
      value: true
    });
    G6n.MetricStorageRegistry = undefined;
    var Bzp = C8t();
    var jKa = Ji();
    var W6n = HKa();
    class zCo {
      _sharedRegistry = new Map();
      _perCollectorRegistry = new Map();
      static create() {
        return new zCo();
      }
      getStorages(e) {
        let t = [];
        for (let r of this._sharedRegistry.values()) {
          t = t.concat(r);
        }
        let n = this._perCollectorRegistry.get(e);
        if (n != null) {
          for (let r of n.values()) {
            t = t.concat(r);
          }
        }
        return t;
      }
      register(e) {
        this._registerStorage(e, this._sharedRegistry);
      }
      registerForCollector(e, t) {
        let n = this._perCollectorRegistry.get(e);
        if (n == null) {
          n = new Map();
          this._perCollectorRegistry.set(e, n);
        }
        this._registerStorage(t, n);
      }
      findOrUpdateCompatibleStorage(e) {
        let t = this._sharedRegistry.get(e.name);
        if (t === undefined) {
          return null;
        }
        return this._findOrUpdateCompatibleStorage(e, t);
      }
      findOrUpdateCompatibleCollectorStorage(e, t) {
        let n = this._perCollectorRegistry.get(e);
        if (n === undefined) {
          return null;
        }
        let r = n.get(t.name);
        if (r === undefined) {
          return null;
        }
        return this._findOrUpdateCompatibleStorage(t, r);
      }
      _registerStorage(e, t) {
        let n = e.getInstrumentDescriptor();
        let r = t.get(n.name);
        if (r === undefined) {
          t.set(n.name, [e]);
          return;
        }
        r.push(e);
      }
      _findOrUpdateCompatibleStorage(e, t) {
        let n = null;
        for (let r of t) {
          let o = r.getInstrumentDescriptor();
          if ((0, Bzp.isDescriptorCompatibleWith)(o, e)) {
            if (o.description !== e.description) {
              if (e.description.length > o.description.length) {
                r.updateDescription(e.description);
              }
              jKa.diag.warn("A view or instrument with the name ", e.name, ` has already been registered, but has a different description and is incompatible with another registered view.
`, `Details:
`, (0, W6n.getIncompatibilityDetails)(o, e), `The longer description will be used.
To resolve the conflict:`, (0, W6n.getConflictResolutionRecipe)(o, e));
            }
            n = r;
          } else {
            jKa.diag.warn("A view or instrument with the name ", e.name, ` has already been registered and is incompatible with another registered view.
`, `Details:
`, (0, W6n.getIncompatibilityDetails)(o, e), `To resolve the conflict:
`, (0, W6n.getConflictResolutionRecipe)(o, e));
          }
        }
        return n;
      }
    }
    G6n.MetricStorageRegistry = zCo;
  });
  var GKa = __commonJS(V6n => {
    Object.defineProperty(V6n, "__esModule", {
      value: true
    });
    V6n.MultiMetricStorage = undefined;
    class WKa {
      _backingStorages;
      constructor(e) {
        this._backingStorages = e;
      }
      record(e, t, n, r) {
        this._backingStorages.forEach(o => {
          o.record(e, t, n, r);
        });
      }
    }
    V6n.MultiMetricStorage = WKa;
  });
  var YKa = __commonJS(oyt => {
    Object.defineProperty(oyt, "__esModule", {
      value: true
    });
    oyt.BatchObservableResultImpl = oyt.ObservableResultImpl = undefined;
    var ryt = Ji();
    var VKa = R8t();
    var $zp = U6n();
    class zKa {
      _instrumentName;
      _valueType;
      _buffer = new VKa.AttributeHashMap();
      constructor(e, t) {
        this._instrumentName = e;
        this._valueType = t;
      }
      observe(e, t = {}) {
        if (typeof e !== "number") {
          ryt.diag.warn(`non-number value provided to metric ${this._instrumentName}: ${e}`);
          return;
        }
        if (this._valueType === ryt.ValueType.INT && !Number.isInteger(e)) {
          if (ryt.diag.warn(`INT value type cannot accept a floating-point value for ${this._instrumentName}, ignoring the fractional digits.`), e = Math.trunc(e), !Number.isInteger(e)) {
            return;
          }
        }
        this._buffer.set(t, e);
      }
    }
    oyt.ObservableResultImpl = zKa;
    class KKa {
      _buffer = new Map();
      observe(e, t, n = {}) {
        if (!(0, $zp.isObservableInstrument)(e)) {
          return;
        }
        let r = this._buffer.get(e);
        if (r == null) {
          r = new VKa.AttributeHashMap();
          this._buffer.set(e, r);
        }
        if (typeof t !== "number") {
          ryt.diag.warn(`non-number value provided to metric ${e._descriptor.name}: ${t}`);
          return;
        }
        if (e._descriptor.valueType === ryt.ValueType.INT && !Number.isInteger(t)) {
          if (ryt.diag.warn(`INT value type cannot accept a floating-point value for ${e._descriptor.name}, ignoring the fractional digits.`), t = Math.trunc(t), !Number.isInteger(t)) {
            return;
          }
        }
        r.set(n, t);
      }
    }
    oyt.BatchObservableResultImpl = KKa;
  });
  var ZKa = __commonJS(z6n => {
    Object.defineProperty(z6n, "__esModule", {
      value: true
    });
    z6n.ObservableRegistry = undefined;
    var Hzp = Ji();
    var JKa = U6n();
    var XKa = YKa();
    var k8t = Zoe();
    class QKa {
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
        let n = new Set(t.filter(JKa.isObservableInstrument));
        if (n.size === 0) {
          Hzp.diag.error("BatchObservableCallback is not associated with valid instruments", t);
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
        let n = new Set(t.filter(JKa.isObservableInstrument));
        let r = this._findBatchCallback(e, n);
        if (r < 0) {
          return;
        }
        this._batchCallbacks.splice(r, 1);
      }
      async observe(e, t) {
        let n = this._observeCallbacks(e, t);
        let r = this._observeBatchCallbacks(e, t);
        return (await (0, k8t.PromiseAllSettled)([...n, ...r])).filter(k8t.isPromiseAllSettledRejectionResult).map(i => i.reason);
      }
      _observeCallbacks(e, t) {
        return this._callbacks.map(async ({
          callback: n,
          instrument: r
        }) => {
          let o = new XKa.ObservableResultImpl(r._descriptor.name, r._descriptor.valueType);
          let s = Promise.resolve(n(o));
          if (t != null) {
            s = (0, k8t.callWithTimeout)(s, t);
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
          let o = new XKa.BatchObservableResultImpl();
          let s = Promise.resolve(n(o));
          if (t != null) {
            s = (0, k8t.callWithTimeout)(s, t);
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
        return this._batchCallbacks.findIndex(n => n.callback === e && (0, k8t.setEquals)(n.instruments, t));
      }
    }
    z6n.ObservableRegistry = QKa;
  });
  var t7a = __commonJS(K6n => {
    Object.defineProperty(K6n, "__esModule", {
      value: true
    });
    K6n.SyncMetricStorage = undefined;
    var jzp = jCo();
    var qzp = GCo();
    var Wzp = VCo();
    class e7a extends jzp.MetricStorage {
      _attributesProcessor;
      _aggregationCardinalityLimit;
      _deltaMetricStorage;
      _temporalMetricStorage;
      constructor(e, t, n, r, o) {
        super(e);
        this._attributesProcessor = n;
        this._aggregationCardinalityLimit = o;
        this._deltaMetricStorage = new qzp.DeltaMetricProcessor(t, this._aggregationCardinalityLimit);
        this._temporalMetricStorage = new Wzp.TemporalMetricProcessor(t, r);
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
    K6n.SyncMetricStorage = e7a;
  });
  var Y6n = __commonJS(Bpe => {
    Object.defineProperty(Bpe, "__esModule", {
      value: true
    });
    Bpe.createDenyListAttributesProcessor = Bpe.createAllowListAttributesProcessor = Bpe.createMultiAttributesProcessor = Bpe.createNoopAttributesProcessor = undefined;
    class n7a {
      process(e, t) {
        return e;
      }
    }
    class r7a {
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
    class o7a {
      _allowedAttributeNames;
      constructor(e) {
        this._allowedAttributeNames = e;
      }
      process(e, t) {
        let n = {};
        Object.keys(e).filter(r => this._allowedAttributeNames.includes(r)).forEach(r => n[r] = e[r]);
        return n;
      }
    }
    class s7a {
      _deniedAttributeNames;
      constructor(e) {
        this._deniedAttributeNames = e;
      }
      process(e, t) {
        let n = {};
        Object.keys(e).filter(r => !this._deniedAttributeNames.includes(r)).forEach(r => n[r] = e[r]);
        return n;
      }
    }
    function Gzp() {
      return Yzp;
    }
    Bpe.createNoopAttributesProcessor = Gzp;
    function Vzp(e) {
      return new r7a(e);
    }
    Bpe.createMultiAttributesProcessor = Vzp;
    function zzp(e) {
      return new o7a(e);
    }
    Bpe.createAllowListAttributesProcessor = zzp;
    function Kzp(e) {
      return new s7a(e);
    }
    Bpe.createDenyListAttributesProcessor = Kzp;
    var Yzp = new n7a();
  });
  var a7a = __commonJS(J6n => {
    Object.defineProperty(J6n, "__esModule", {
      value: true
    });
    J6n.MeterSharedState = undefined;
    var Jzp = C8t();
    var Xzp = PKa();
    var Qzp = Zoe();
    var Zzp = LKa();
    var eKp = qKa();
    var tKp = GKa();
    var nKp = ZKa();
    var rKp = t7a();
    var oKp = Y6n();
    class i7a {
      _meterProviderSharedState;
      _instrumentationScope;
      metricStorageRegistry = new eKp.MetricStorageRegistry();
      observableRegistry = new nKp.ObservableRegistry();
      meter;
      constructor(e, t) {
        this._meterProviderSharedState = e;
        this._instrumentationScope = t;
        this.meter = new Xzp.Meter(this);
      }
      registerMetricStorage(e) {
        let t = this._registerMetricStorage(e, rKp.SyncMetricStorage);
        if (t.length === 1) {
          return t[0];
        }
        return new tKp.MultiMetricStorage(t);
      }
      registerAsyncMetricStorage(e) {
        return this._registerMetricStorage(e, Zzp.AsyncMetricStorage);
      }
      async collect(e, t, n) {
        let r = await this.observableRegistry.observe(t, n?.timeoutMillis);
        let o = this.metricStorageRegistry.getStorages(e);
        if (o.length === 0) {
          return null;
        }
        let s = o.map(i => i.collect(e, t)).filter(Qzp.isNotNullish);
        if (s.length === 0) {
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
          let s = (0, Jzp.createInstrumentDescriptorWithView)(o, e);
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
            let d = new t(e, c, (0, oKp.createNoopAttributesProcessor)(), [i], u);
            this.metricStorageRegistry.registerForCollector(i, d);
            return d;
          });
          r = r.concat(s);
        }
        return r;
      }
    }
    J6n.MeterSharedState = i7a;
  });
  var c7a = __commonJS(X6n => {
    Object.defineProperty(X6n, "__esModule", {
      value: true
    });
    X6n.MeterProviderSharedState = undefined;
    var sKp = Zoe();
    var iKp = SKa();
    var aKp = a7a();
    var lKp = w8t();
    class l7a {
      resource;
      viewRegistry = new iKp.ViewRegistry();
      metricCollectors = [];
      meterSharedStates = new Map();
      constructor(e) {
        this.resource = e;
      }
      getMeterSharedState(e) {
        let t = (0, sKp.instrumentationScopeId)(e);
        let n = this.meterSharedStates.get(t);
        if (n == null) {
          n = new aKp.MeterSharedState(this, e);
          this.meterSharedStates.set(t, n);
        }
        return n;
      }
      selectAggregations(e) {
        let t = [];
        for (let n of this.metricCollectors) {
          t.push([n, (0, lKp.toAggregation)(n.selectAggregation(e))]);
        }
        return t;
      }
    }
    X6n.MeterProviderSharedState = l7a;
  });
  var d7a = __commonJS(Q6n => {
    Object.defineProperty(Q6n, "__esModule", {
      value: true
    });
    Q6n.MetricCollector = undefined;
    var cKp = Gg();
    class u7a {
      _sharedState;
      _metricReader;
      constructor(e, t) {
        this._sharedState = e;
        this._metricReader = t;
      }
      async collect(e) {
        let t = (0, cKp.millisToHrTime)(Date.now());
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
    Q6n.MetricCollector = u7a;
  });
  var Z6n = __commonJS(syt => {
    Object.defineProperty(syt, "__esModule", {
      value: true
    });
    syt.ExactPredicate = syt.PatternPredicate = undefined;
    class KCo {
      _matchAll;
      _regexp;
      constructor(e) {
        if (e === "*") {
          this._matchAll = true;
          this._regexp = /.*/;
        } else {
          this._matchAll = false;
          this._regexp = new RegExp(KCo.escapePattern(e));
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
    syt.PatternPredicate = KCo;
    class p7a {
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
    syt.ExactPredicate = p7a;
  });
  var h7a = __commonJS(e8n => {
    Object.defineProperty(e8n, "__esModule", {
      value: true
    });
    e8n.InstrumentSelector = undefined;
    var m7a = Z6n();
    class f7a {
      _nameFilter;
      _type;
      _unitFilter;
      constructor(e) {
        this._nameFilter = new m7a.PatternPredicate(e?.name ?? "*");
        this._type = e?.type;
        this._unitFilter = new m7a.ExactPredicate(e?.unit);
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
    e8n.InstrumentSelector = f7a;
  });
  var y7a = __commonJS(t8n => {
    Object.defineProperty(t8n, "__esModule", {
      value: true
    });
    t8n.MeterSelector = undefined;
    var YCo = Z6n();
    class g7a {
      _nameFilter;
      _versionFilter;
      _schemaUrlFilter;
      constructor(e) {
        this._nameFilter = new YCo.ExactPredicate(e?.name);
        this._versionFilter = new YCo.ExactPredicate(e?.version);
        this._schemaUrlFilter = new YCo.ExactPredicate(e?.schemaUrl);
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
    t8n.MeterSelector = g7a;
  });
  var T7a = __commonJS(n8n => {
    Object.defineProperty(n8n, "__esModule", {
      value: true
    });
    n8n.View = undefined;
    var dKp = Z6n();
    var _7a = Y6n();
    var pKp = h7a();
    var mKp = y7a();
    var b7a = w8t();
    function fKp(e) {
      return e.instrumentName == null && e.instrumentType == null && e.instrumentUnit == null && e.meterName == null && e.meterVersion == null && e.meterSchemaUrl == null;
    }
    function hKp(e) {
      if (fKp(e)) {
        throw Error("Cannot create view with no selector arguments supplied");
      }
      if (e.name != null && (e?.instrumentName == null || dKp.PatternPredicate.hasWildcard(e.instrumentName))) {
        throw Error("Views with a specified name must be declared with an instrument selector that selects at most one instrument per meter.");
      }
    }
    class S7a {
      name;
      description;
      aggregation;
      attributesProcessor;
      instrumentSelector;
      meterSelector;
      aggregationCardinalityLimit;
      constructor(e) {
        if (hKp(e), e.attributesProcessors != null) {
          this.attributesProcessor = (0, _7a.createMultiAttributesProcessor)(e.attributesProcessors);
        } else {
          this.attributesProcessor = (0, _7a.createNoopAttributesProcessor)();
        }
        this.name = e.name;
        this.description = e.description;
        this.aggregation = (0, b7a.toAggregation)(e.aggregation ?? {
          type: b7a.AggregationType.DEFAULT
        });
        this.instrumentSelector = new pKp.InstrumentSelector({
          name: e.instrumentName,
          type: e.instrumentType,
          unit: e.instrumentUnit
        });
        this.meterSelector = new mKp.MeterSelector({
          name: e.meterName,
          version: e.meterVersion,
          schemaUrl: e.meterSchemaUrl
        });
        this.aggregationCardinalityLimit = e.aggregationCardinalityLimit;
      }
    }
    n8n.View = S7a;
  });
  var v7a = __commonJS(o8n => {
    Object.defineProperty(o8n, "__esModule", {
      value: true
    });
    o8n.MeterProvider = undefined;
    var r8n = Ji();
    var gKp = Oat();
    var yKp = c7a();
    var _Kp = d7a();
    var bKp = T7a();
    class E7a {
      _sharedState;
      _shutdown = false;
      constructor(e) {
        if (this._sharedState = new yKp.MeterProviderSharedState(e?.resource ?? (0, gKp.defaultResource)()), e?.views != null && e.views.length > 0) {
          for (let t of e.views) {
            this._sharedState.viewRegistry.addView(new bKp.View(t));
          }
        }
        if (e?.readers != null && e.readers.length > 0) {
          for (let t of e.readers) {
            let n = new _Kp.MetricCollector(this._sharedState, t);
            t.setMetricProducer(n);
            this._sharedState.metricCollectors.push(n);
          }
        }
      }
      getMeter(e, t = "", n = {}) {
        if (this._shutdown) {
          r8n.diag.warn("A shutdown MeterProvider cannot provide a Meter");
          return (0, r8n.createNoopMeter)();
        }
        return this._sharedState.getMeterSharedState({
          name: e,
          version: t,
          schemaUrl: n.schemaUrl
        }).meter;
      }
      async shutdown(e) {
        if (this._shutdown) {
          r8n.diag.warn("shutdown may only be called once per MeterProvider");
          return;
        }
        this._shutdown = true;
        await Promise.all(this._sharedState.metricCollectors.map(t => t.shutdown(e)));
      }
      async forceFlush(e) {
        if (this._shutdown) {
          r8n.diag.warn("invalid attempt to force flush after MeterProvider shutdown");
          return;
        }
        await Promise.all(this._sharedState.metricCollectors.map(t => t.forceFlush(e)));
      }
    }
    o8n.MeterProvider = E7a;
  });
  var A8t = __commonJS(Uw => {
    Object.defineProperty(Uw, "__esModule", {
      value: true
    });
    Uw.TimeoutError = Uw.createDenyListAttributesProcessor = Uw.createAllowListAttributesProcessor = Uw.AggregationType = Uw.MeterProvider = Uw.ConsoleMetricExporter = Uw.InMemoryMetricExporter = Uw.PeriodicExportingMetricReader = Uw.MetricReader = Uw.InstrumentType = Uw.DataPointType = Uw.AggregationTemporality = undefined;
    var SKp = y6n();
    Object.defineProperty(Uw, "AggregationTemporality", {
      enumerable: true,
      get: function () {
        return SKp.AggregationTemporality;
      }
    });
    var w7a = t1e();
    Object.defineProperty(Uw, "DataPointType", {
      enumerable: true,
      get: function () {
        return w7a.DataPointType;
      }
    });
    Object.defineProperty(Uw, "InstrumentType", {
      enumerable: true,
      get: function () {
        return w7a.InstrumentType;
      }
    });
    var TKp = BCo();
    Object.defineProperty(Uw, "MetricReader", {
      enumerable: true,
      get: function () {
        return TKp.MetricReader;
      }
    });
    var EKp = mKa();
    Object.defineProperty(Uw, "PeriodicExportingMetricReader", {
      enumerable: true,
      get: function () {
        return EKp.PeriodicExportingMetricReader;
      }
    });
    var vKp = gKa();
    Object.defineProperty(Uw, "InMemoryMetricExporter", {
      enumerable: true,
      get: function () {
        return vKp.InMemoryMetricExporter;
      }
    });
    var wKp = _Ka();
    Object.defineProperty(Uw, "ConsoleMetricExporter", {
      enumerable: true,
      get: function () {
        return wKp.ConsoleMetricExporter;
      }
    });
    var CKp = v7a();
    Object.defineProperty(Uw, "MeterProvider", {
      enumerable: true,
      get: function () {
        return CKp.MeterProvider;
      }
    });
    var RKp = w8t();
    Object.defineProperty(Uw, "AggregationType", {
      enumerable: true,
      get: function () {
        return RKp.AggregationType;
      }
    });
    var C7a = Y6n();
    Object.defineProperty(Uw, "createAllowListAttributesProcessor", {
      enumerable: true,
      get: function () {
        return C7a.createAllowListAttributesProcessor;
      }
    });
    Object.defineProperty(Uw, "createDenyListAttributesProcessor", {
      enumerable: true,
      get: function () {
        return C7a.createDenyListAttributesProcessor;
      }
    });
    var xKp = Zoe();
    Object.defineProperty(Uw, "TimeoutError", {
      enumerable: true,
      get: function () {
        return xKp.TimeoutError;
      }
    });
  });