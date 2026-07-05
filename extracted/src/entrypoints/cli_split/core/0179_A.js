  var P$i = __commonJS(x2 => {
    Object.defineProperty(x2, "__esModule", {
      value: true
    });
    x2.W3CTraceContextPropagator = x2.parseTraceParent = x2.TRACE_STATE_HEADER = x2.TRACE_PARENT_HEADER = undefined;
    var HPn = Ji();
    var Zqd = x2t();
    var e3d = CJr();
    x2.TRACE_PARENT_HEADER = "traceparent";
    x2.TRACE_STATE_HEADER = "tracestate";
    var i3d = new RegExp(`^\\s?(${"(?!ff)[\\da-f]{2}"})-(${"(?![0]{32})[\\da-f]{32}"})-(${"(?![0]{16})[\\da-f]{16}"})-(${"[\\da-f]{2}"})(-.*)?\\s?$`);
    function A$i(e) {
      let t = i3d.exec(e);
      if (!t) {
        return null;
      }
      if (t[1] === "00" && t[5]) {
        return null;
      }
      return {
        traceId: t[2],
        spanId: t[3],
        traceFlags: parseInt(t[4], 16)
      };
    }
    x2.parseTraceParent = A$i;
    class I$i {
      inject(e, t, n) {
        let r = HPn.trace.getSpanContext(e);
        if (!r || (0, Zqd.isTracingSuppressed)(e) || !(0, HPn.isSpanContextValid)(r)) {
          return;
        }
        let o = `${"00"}-${r.traceId}-${r.spanId}-0${Number(r.traceFlags || HPn.TraceFlags.NONE).toString(16)}`;
        if (n.set(t, x2.TRACE_PARENT_HEADER, o), r.traceState) {
          n.set(t, x2.TRACE_STATE_HEADER, r.traceState.serialize());
        }
      }
      extract(e, t, n) {
        let r = n.get(t, x2.TRACE_PARENT_HEADER);
        if (!r) {
          return e;
        }
        let o = Array.isArray(r) ? r[0] : r;
        if (typeof o !== "string") {
          return e;
        }
        let s = A$i(o);
        if (!s) {
          return e;
        }
        s.isRemote = true;
        let i = n.get(t, x2.TRACE_STATE_HEADER);
        if (i) {
          let a = Array.isArray(i) ? i.join(",") : i;
          s.traceState = new e3d.TraceState(typeof a === "string" ? a : undefined);
        }
        return HPn.trace.setSpanContext(e, s);
      }
      fields() {
        return [x2.TRACE_PARENT_HEADER, x2.TRACE_STATE_HEADER];
      }
    }
    x2.W3CTraceContextPropagator = I$i;
  });
  var O$i = __commonJS(jne => {
    Object.defineProperty(jne, "__esModule", {
      value: true
    });
    jne.getRPCMetadata = jne.deleteRPCMetadata = jne.setRPCMetadata = jne.RPCType = undefined;
    var a3d = Ji();
    var RJr = (0, a3d.createContextKey)("OpenTelemetry SDK Context Key RPC_METADATA");
    var l3d;
    (function (e) {
      e.HTTP = "http";
    })(l3d = jne.RPCType || (jne.RPCType = {}));
    function c3d(e, t) {
      return e.setValue(RJr, t);
    }
    jne.setRPCMetadata = c3d;
    function u3d(e) {
      return e.deleteValue(RJr);
    }
    jne.deleteRPCMetadata = u3d;
    function d3d(e) {
      return e.getValue(RJr);
    }
    jne.getRPCMetadata = d3d;
  });
  var F$i = __commonJS(jPn => {
    Object.defineProperty(jPn, "__esModule", {
      value: true
    });
    jPn.isPlainObject = undefined;
    var h3d = Function.prototype;
    var D$i = h3d.toString;
    var g3d = D$i.call(Object);
    var y3d = Object.getPrototypeOf;
    var M$i = Object.prototype;
    var N$i = M$i.hasOwnProperty;
    var M4e = Symbol ? Symbol.toStringTag : undefined;
    var L$i = M$i.toString;
    function _3d(e) {
      if (!b3d(e) || S3d(e) !== "[object Object]") {
        return false;
      }
      let t = y3d(e);
      if (t === null) {
        return true;
      }
      let n = N$i.call(t, "constructor") && t.constructor;
      return typeof n == "function" && n instanceof n && D$i.call(n) === g3d;
    }
    jPn.isPlainObject = _3d;
    function b3d(e) {
      return e != null && typeof e == "object";
    }
    function S3d(e) {
      if (e == null) {
        return e === undefined ? "[object Undefined]" : "[object Null]";
      }
      return M4e && M4e in Object(e) ? T3d(e) : E3d(e);
    }
    function T3d(e) {
      let t = N$i.call(e, M4e);
      let n = e[M4e];
      let r = false;
      try {
        e[M4e] = undefined;
        r = true;
      } catch {}
      let o = L$i.call(e);
      if (r) {
        if (t) {
          e[M4e] = n;
        } else {
          delete e[M4e];
        }
      }
      return o;
    }
    function E3d(e) {
      return L$i.call(e);
    }
  });
  var j$i = __commonJS(GPn => {
    Object.defineProperty(GPn, "__esModule", {
      value: true
    });
    GPn.merge = undefined;
    var U$i = F$i();
    function w3d(...e) {
      let t = e.shift();
      let n = new WeakMap();
      while (e.length > 0) {
        t = $$i(t, e.shift(), 0, n);
      }
      return t;
    }
    GPn.merge = w3d;
    function xJr(e) {
      if (WPn(e)) {
        return e.slice();
      }
      return e;
    }
    function $$i(e, t, n = 0, r) {
      let o;
      if (n > 20) {
        return;
      }
      if (n++, qPn(e) || qPn(t) || H$i(t)) {
        o = xJr(t);
      } else if (WPn(e)) {
        if (o = e.slice(), WPn(t)) {
          for (let s = 0, i = t.length; s < i; s++) {
            o.push(xJr(t[s]));
          }
        } else if (P2t(t)) {
          let s = Object.keys(t);
          for (let i = 0, a = s.length; i < a; i++) {
            let l = s[i];
            o[l] = xJr(t[l]);
          }
        }
      } else if (P2t(e)) {
        if (P2t(t)) {
          if (!C3d(e, t)) {
            return t;
          }
          o = Object.assign({}, e);
          let s = Object.keys(t);
          for (let i = 0, a = s.length; i < a; i++) {
            let l = s[i];
            let c = t[l];
            if (qPn(c)) {
              if (typeof c > "u") {
                delete o[l];
              } else {
                o[l] = c;
              }
            } else {
              let u = o[l];
              let d = c;
              if (B$i(e, l, r) || B$i(t, l, r)) {
                delete o[l];
              } else {
                if (P2t(u) && P2t(d)) {
                  let p = r.get(u) || [];
                  let m = r.get(d) || [];
                  p.push({
                    obj: e,
                    key: l
                  });
                  m.push({
                    obj: t,
                    key: l
                  });
                  r.set(u, p);
                  r.set(d, m);
                }
                o[l] = $$i(o[l], c, n, r);
              }
            }
          }
        } else {
          o = t;
        }
      }
      return o;
    }
    function B$i(e, t, n) {
      let r = n.get(e[t]) || [];
      for (let o = 0, s = r.length; o < s; o++) {
        let i = r[o];
        if (i.key === t && i.obj === e) {
          return true;
        }
      }
      return false;
    }
    function WPn(e) {
      return Array.isArray(e);
    }
    function H$i(e) {
      return typeof e === "function";
    }
    function P2t(e) {
      return !qPn(e) && !WPn(e) && !H$i(e) && typeof e === "object";
    }
    function qPn(e) {
      return typeof e === "string" || typeof e === "number" || typeof e === "boolean" || typeof e > "u" || e instanceof Date || e instanceof RegExp || e === null;
    }
    function C3d(e, t) {
      if (!(0, U$i.isPlainObject)(e) || !(0, U$i.isPlainObject)(t)) {
        return false;
      }
      return true;
    }
  });
  var q$i = __commonJS(xat => {
    Object.defineProperty(xat, "__esModule", {
      value: true
    });
    xat.callWithTimeout = xat.TimeoutError = undefined;
    class VPn extends Error {
      constructor(e) {
        super(e);
        Object.setPrototypeOf(this, VPn.prototype);
      }
    }
    xat.TimeoutError = VPn;
    function R3d(e, t) {
      let n;
      let r = new Promise(function (s, i) {
        n = setTimeout(function () {
          i(new VPn("Operation timed out."));
        }, t);
      });
      return Promise.race([e, r]).then(o => (clearTimeout(n), o), o => {
        throw clearTimeout(n), o;
      });
    }
    xat.callWithTimeout = R3d;
  });
  var G$i = __commonJS(kat => {
    Object.defineProperty(kat, "__esModule", {
      value: true
    });
    kat.isUrlIgnored = kat.urlMatches = undefined;
    function W$i(e, t) {
      if (typeof t === "string") {
        return e === t;
      } else {
        return !!e.match(t);
      }
    }
    kat.urlMatches = W$i;
    function x3d(e, t) {
      if (!t) {
        return false;
      }
      for (let n of t) {
        if (W$i(e, n)) {
          return true;
        }
      }
      return false;
    }
    kat.isUrlIgnored = x3d;
  });
  var z$i = __commonJS(zPn => {
    Object.defineProperty(zPn, "__esModule", {
      value: true
    });
    zPn.Deferred = undefined;
    class V$i {
      _promise;
      _resolve;
      _reject;
      constructor() {
        this._promise = new Promise((e, t) => {
          this._resolve = e;
          this._reject = t;
        });
      }
      get promise() {
        return this._promise;
      }
      resolve(e) {
        this._resolve(e);
      }
      reject(e) {
        this._reject(e);
      }
    }
    zPn.Deferred = V$i;
  });
  var Y$i = __commonJS(KPn => {
    Object.defineProperty(KPn, "__esModule", {
      value: true
    });
    KPn.BindOnceFuture = undefined;
    var k3d = z$i();
    class K$i {
      _callback;
      _that;
      _isCalled = false;
      _deferred = new k3d.Deferred();
      constructor(e, t) {
        this._callback = e;
        this._that = t;
      }
      get isCalled() {
        return this._isCalled;
      }
      get promise() {
        return this._deferred.promise;
      }
      call(...e) {
        if (!this._isCalled) {
          this._isCalled = true;
          try {
            Promise.resolve(this._callback.call(this._that, ...e)).then(t => this._deferred.resolve(t), t => this._deferred.reject(t));
          } catch (t) {
            this._deferred.reject(t);
          }
        }
        return this._deferred.promise;
      }
    }
    KPn.BindOnceFuture = K$i;
  });
  var X$i = __commonJS(YPn => {
    Object.defineProperty(YPn, "__esModule", {
      value: true
    });
    YPn.diagLogLevelFromString = undefined;
    var bbe = Ji();
    var J$i = {
      ALL: bbe.DiagLogLevel.ALL,
      VERBOSE: bbe.DiagLogLevel.VERBOSE,
      DEBUG: bbe.DiagLogLevel.DEBUG,
      INFO: bbe.DiagLogLevel.INFO,
      WARN: bbe.DiagLogLevel.WARN,
      ERROR: bbe.DiagLogLevel.ERROR,
      NONE: bbe.DiagLogLevel.NONE
    };
    function A3d(e) {
      if (e == null) {
        return;
      }
      let t = J$i[e.toUpperCase()];
      if (t == null) {
        bbe.diag.warn(`Unknown log level "${e}", expected one of ${Object.keys(J$i)}, using default`);
        return bbe.DiagLogLevel.INFO;
      }
      return t;
    }
    YPn.diagLogLevelFromString = A3d;
  });
  var Z$i = __commonJS(JPn => {
    Object.defineProperty(JPn, "__esModule", {
      value: true
    });
    JPn._export = undefined;
    var Q$i = Ji();
    var I3d = x2t();
    function P3d(e, t) {
      return new Promise(n => {
        Q$i.context.with((0, I3d.suppressTracing)(Q$i.context.active()), () => {
          e.export(t, r => {
            n(r);
          });
        });
      });
    }
    JPn._export = P3d;
  });