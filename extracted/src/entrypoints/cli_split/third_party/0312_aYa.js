  var aYa = __commonJS(p8n => {
    Object.defineProperty(p8n, "__esModule", {
      value: true
    });
    p8n.OTLPExporterBase = undefined;
    class iYa {
      _delegate;
      constructor(e) {
        this._delegate = e;
      }
      export(e, t) {
        this._delegate.export(e, t);
      }
      forceFlush() {
        return this._delegate.forceFlush();
      }
      shutdown() {
        return this._delegate.shutdown();
      }
    }
    p8n.OTLPExporterBase = iYa;
  });
  var f8n = __commonJS(m8n => {
    Object.defineProperty(m8n, "__esModule", {
      value: true
    });
    m8n.OTLPExporterError = undefined;
    class lYa extends Error {
      code;
      name = "OTLPExporterError";
      data;
      constructor(e, t, n) {
        super(e);
        this.data = n;
        this.code = t;
      }
    }
    m8n.OTLPExporterError = lYa;
  });
  var D8t = __commonJS(jpe => {
    Object.defineProperty(jpe, "__esModule", {
      value: true
    });
    jpe.getSharedConfigurationDefaults = jpe.mergeOtlpSharedConfigurationWithDefaults = jpe.wrapStaticHeadersInFunction = jpe.validateTimeoutMillis = undefined;
    function cYa(e) {
      if (Number.isFinite(e) && e > 0) {
        return e;
      }
      throw Error(`Configuration: timeoutMillis is invalid, expected number greater than 0 (actual: '${e}')`);
    }
    jpe.validateTimeoutMillis = cYa;
    function jKp(e) {
      if (e == null) {
        return;
      }
      return async () => e;
    }
    jpe.wrapStaticHeadersInFunction = jKp;
    function qKp(e, t, n) {
      return {
        timeoutMillis: cYa(e.timeoutMillis ?? t.timeoutMillis ?? n.timeoutMillis),
        concurrencyLimit: e.concurrencyLimit ?? t.concurrencyLimit ?? n.concurrencyLimit,
        compression: e.compression ?? t.compression ?? n.compression
      };
    }
    jpe.mergeOtlpSharedConfigurationWithDefaults = qKp;
    function WKp() {
      return {
        timeoutMillis: 1e4,
        concurrencyLimit: 30,
        compression: "none"
      };
    }
    jpe.getSharedConfigurationDefaults = WKp;
  });
  var uYa = __commonJS(M8t => {
    Object.defineProperty(M8t, "__esModule", {
      value: true
    });
    M8t.CompressionAlgorithm = undefined;
    var GKp;
    (function (e) {
      e.NONE = "none";
      e.GZIP = "gzip";
    })(GKp = M8t.CompressionAlgorithm || (M8t.CompressionAlgorithm = {}));
  });
  var pRo = __commonJS(h8n => {
    Object.defineProperty(h8n, "__esModule", {
      value: true
    });
    h8n.createBoundedQueueExportPromiseHandler = undefined;
    class dYa {
      _concurrencyLimit;
      _sendingPromises = [];
      constructor(e) {
        this._concurrencyLimit = e;
      }
      pushPromise(e) {
        if (this.hasReachedLimit()) {
          throw Error("Concurrency Limit reached");
        }
        this._sendingPromises.push(e);
        let t = () => {
          let n = this._sendingPromises.indexOf(e);
          this._sendingPromises.splice(n, 1);
        };
        e.then(t, t);
      }
      hasReachedLimit() {
        return this._sendingPromises.length >= this._concurrencyLimit;
      }
      async awaitAll() {
        await Promise.all(this._sendingPromises);
      }
    }
    function VKp(e) {
      return new dYa(e.concurrencyLimit);
    }
    h8n.createBoundedQueueExportPromiseHandler = VKp;
  });
  var pYa = __commonJS(g8n => {
    Object.defineProperty(g8n, "__esModule", {
      value: true
    });
    g8n.createLoggingPartialSuccessResponseHandler = undefined;
    var zKp = Ji();
    function KKp(e) {
      return Object.prototype.hasOwnProperty.call(e, "partialSuccess");
    }
    function YKp() {
      return {
        handleResponse(e) {
          if (e == null || !KKp(e) || e.partialSuccess == null || Object.keys(e.partialSuccess).length === 0) {
            return;
          }
          zKp.diag.warn("Received Partial Success response:", JSON.stringify(e.partialSuccess));
        }
      };
    }
    g8n.createLoggingPartialSuccessResponseHandler = YKp;
  });
  var mRo = __commonJS(y8n => {
    Object.defineProperty(y8n, "__esModule", {
      value: true
    });
    y8n.createOtlpExportDelegate = undefined;
    var aVe = Gg();
    var mYa = f8n();
    var JKp = pYa();
    var XKp = Ji();
    class fYa {
      _transport;
      _serializer;
      _responseHandler;
      _promiseQueue;
      _timeout;
      _diagLogger;
      constructor(e, t, n, r, o) {
        this._transport = e;
        this._serializer = t;
        this._responseHandler = n;
        this._promiseQueue = r;
        this._timeout = o;
        this._diagLogger = XKp.diag.createComponentLogger({
          namespace: "OTLPExportDelegate"
        });
      }
      export(e, t) {
        if (this._diagLogger.debug("items to be sent", e), this._promiseQueue.hasReachedLimit()) {
          t({
            code: aVe.ExportResultCode.FAILED,
            error: Error("Concurrent export limit reached")
          });
          return;
        }
        let n = this._serializer.serializeRequest(e);
        if (n == null) {
          t({
            code: aVe.ExportResultCode.FAILED,
            error: Error("Nothing to send")
          });
          return;
        }
        this._promiseQueue.pushPromise(this._transport.send(n, this._timeout).then(r => {
          if (r.status === "success") {
            if (r.data != null) {
              try {
                this._responseHandler.handleResponse(this._serializer.deserializeResponse(r.data));
              } catch (o) {
                this._diagLogger.warn("Export succeeded but could not deserialize response - is the response specification compliant?", o, r.data);
              }
            }
            t({
              code: aVe.ExportResultCode.SUCCESS
            });
            return;
          } else if (r.status === "failure" && r.error) {
            t({
              code: aVe.ExportResultCode.FAILED,
              error: r.error
            });
            return;
          } else if (r.status === "retryable") {
            t({
              code: aVe.ExportResultCode.FAILED,
              error: new mYa.OTLPExporterError("Export failed with retryable status")
            });
          } else {
            t({
              code: aVe.ExportResultCode.FAILED,
              error: new mYa.OTLPExporterError("Export failed with unknown error")
            });
          }
        }, r => t({
          code: aVe.ExportResultCode.FAILED,
          error: r
        })));
      }
      forceFlush() {
        return this._promiseQueue.awaitAll();
      }
      async shutdown() {
        this._diagLogger.debug("shutdown started");
        await this.forceFlush();
        this._transport.shutdown();
      }
    }
    function QKp(e, t) {
      return new fYa(e.transport, e.serializer, (0, JKp.createLoggingPartialSuccessResponseHandler)(), e.promiseHandler, t.timeout);
    }
    y8n.createOtlpExportDelegate = QKp;
  });
  var hYa = __commonJS(_8n => {
    Object.defineProperty(_8n, "__esModule", {
      value: true
    });
    _8n.createOtlpNetworkExportDelegate = undefined;
    var ZKp = pRo();
    var e7p = mRo();
    function t7p(e, t, n) {
      return (0, e7p.createOtlpExportDelegate)({
        transport: n,
        serializer: t,
        promiseHandler: (0, ZKp.createBoundedQueueExportPromiseHandler)(e)
      }, {
        timeout: e.timeoutMillis
      });
    }
    _8n.createOtlpNetworkExportDelegate = t7p;
  });
  var qpe = __commonJS(P9 => {
    Object.defineProperty(P9, "__esModule", {
      value: true
    });
    P9.createOtlpNetworkExportDelegate = P9.CompressionAlgorithm = P9.getSharedConfigurationDefaults = P9.mergeOtlpSharedConfigurationWithDefaults = P9.OTLPExporterError = P9.OTLPExporterBase = undefined;
    var n7p = aYa();
    Object.defineProperty(P9, "OTLPExporterBase", {
      enumerable: true,
      get: function () {
        return n7p.OTLPExporterBase;
      }
    });
    var r7p = f8n();
    Object.defineProperty(P9, "OTLPExporterError", {
      enumerable: true,
      get: function () {
        return r7p.OTLPExporterError;
      }
    });
    var gYa = D8t();
    Object.defineProperty(P9, "mergeOtlpSharedConfigurationWithDefaults", {
      enumerable: true,
      get: function () {
        return gYa.mergeOtlpSharedConfigurationWithDefaults;
      }
    });
    Object.defineProperty(P9, "getSharedConfigurationDefaults", {
      enumerable: true,
      get: function () {
        return gYa.getSharedConfigurationDefaults;
      }
    });
    var o7p = uYa();
    Object.defineProperty(P9, "CompressionAlgorithm", {
      enumerable: true,
      get: function () {
        return o7p.CompressionAlgorithm;
      }
    });
    var s7p = hYa();
    Object.defineProperty(P9, "createOtlpNetworkExportDelegate", {
      enumerable: true,
      get: function () {
        return s7p.createOtlpNetworkExportDelegate;
      }
    });
  });
  var fRo = __commonJS((v7_, yYa) => {
    yYa.exports = i7p;
    function i7p(e, t) {
      var n = Array(arguments.length - 1);
      var r = 0;
      var o = 2;
      var s = true;
      while (o < arguments.length) {
        n[r++] = arguments[o++];
      }
      return new Promise(function (a, l) {
        n[r] = function (u) {
          if (s) {
            if (s = false, u) {
              l(u);
            } else {
              var d = Array(arguments.length - 1);
              var p = 0;
              while (p < d.length) {
                d[p++] = arguments[p];
              }
              a.apply(null, d);
            }
          }
        };
        try {
          e.apply(t || null, n);
        } catch (c) {
          if (s) {
            s = false;
            l(c);
          }
        }
      });
    }
  });
  var TYa = __commonJS(SYa => {
    var b8n = SYa;
    b8n.length = function (t) {
      var n = t.length;
      if (!n) {
        return 0;
      }
      var r = 0;
      while (--n % 4 > 1 && t.charAt(n) === "=") {
        ++r;
      }
      return Math.ceil(t.length * 3) / 4 - r;
    };
    var cyt = Array(64);
    var bYa = Array(123);
    for (IQ = 0; IQ < 64;) {
      bYa[cyt[IQ] = IQ < 26 ? IQ + 65 : IQ < 52 ? IQ + 71 : IQ < 62 ? IQ - 4 : IQ - 59 | 43] = IQ++;
    }
    var IQ;
    b8n.HS = function (t, n, r) {
      var o = null;
      var s = [];
      var i = 0;
      var a = 0;
      var l;
      while (n < r) {
        var c = t[n++];
        switch (a) {
          case 0:
            s[i++] = cyt[c >> 2];
            l = (c & 3) << 4;
            a = 1;
            break;
          case 1:
            s[i++] = cyt[l | c >> 4];
            l = (c & 15) << 2;
            a = 2;
            break;
          case 2:
            s[i++] = cyt[l | c >> 6];
            s[i++] = cyt[c & 63];
            a = 0;
            break;
        }
        if (i > 8191) {
          (o || (o = [])).push(String.fromCharCode.apply(String, s));
          i = 0;
        }
      }
      if (a) {
        if (s[i++] = cyt[l], s[i++] = 61, a === 1) {
          s[i++] = 61;
        }
      }
      if (o) {
        if (i) {
          o.push(String.fromCharCode.apply(String, s.slice(0, i)));
        }
        return o.join("");
      }
      return String.fromCharCode.apply(String, s.slice(0, i));
    };
    b8n.oC = function (t, n, r) {
      var o = r;
      var s = 0;
      var i;
      for (var a = 0; a < t.length;) {
        var l = t.charCodeAt(a++);
        if (l === 61 && s > 1) {
          break;
        }
        if ((l = bYa[l]) === undefined) {
          throw Error("invalid encoding");
        }
        switch (s) {
          case 0:
            i = l;
            s = 1;
            break;
          case 1:
            n[r++] = i << 2 | (l & 48) >> 4;
            i = l;
            s = 2;
            break;
          case 2:
            n[r++] = (i & 15) << 4 | (l & 60) >> 2;
            i = l;
            s = 3;
            break;
          case 3:
            n[r++] = (i & 3) << 6 | l;
            s = 0;
            break;
        }
      }
      if (s === 1) {
        throw Error("invalid encoding");
      }
      return r - o;
    };
    b8n.test = function (t) {
      return /^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$/.test(t);
    };
  });
  var vYa = __commonJS((C7_, EYa) => {
    EYa.exports = S8n;
    function S8n() {
      this._listeners = {};
    }
    S8n.prototype.on = function (t, n, r) {
      (this._listeners[t] || (this._listeners[t] = [])).push({
        fn: n,
        ctx: r || this
      });
      return this;
    };
    S8n.prototype.off = function (t, n) {
      if (t === undefined) {
        this._listeners = {};
      } else if (n === undefined) {
        this._listeners[t] = [];
      } else {
        var r = this._listeners[t];
        for (var o = 0; o < r.length;) {
          if (r[o].fn === n) {
            r.splice(o, 1);
          } else {
            ++o;
          }
        }
      }
      return this;
    };
    S8n.prototype.emit = function (t) {
      var n = this._listeners[t];
      if (n) {
        var r = [];
        var o = 1;
        for (; o < arguments.length;) {
          r.push(arguments[o++]);
        }
        for (o = 0; o < n.length;) {
          n[o].fn.apply(n[o++].ctx, r);
        }
      }
      return this;
    };
  });
  var IYa = __commonJS((R7_, AYa) => {
    AYa.exports = wYa(wYa);
    function wYa(e) {
      if (typeof Float32Array < "u") {
        (function () {
          var t = new Float32Array([-0]);
          var n = new Uint8Array(t.buffer);
          var r = n[3] === 128;
          function o(l, c, u) {
            t[0] = l;
            c[u] = n[0];
            c[u + 1] = n[1];
            c[u + 2] = n[2];
            c[u + 3] = n[3];
          }
          function s(l, c, u) {
            t[0] = l;
            c[u] = n[3];
            c[u + 1] = n[2];
            c[u + 2] = n[1];
            c[u + 3] = n[0];
          }
          e.writeFloatLE = r ? o : s;
          e.writeFloatBE = r ? s : o;
          function i(l, c) {
            n[0] = l[c];
            n[1] = l[c + 1];
            n[2] = l[c + 2];
            n[3] = l[c + 3];
            return t[0];
          }
          function a(l, c) {
            n[3] = l[c];
            n[2] = l[c + 1];
            n[1] = l[c + 2];
            n[0] = l[c + 3];
            return t[0];
          }
          e.readFloatLE = r ? i : a;
          e.readFloatBE = r ? a : i;
        })();
      } else {
        (function () {
          function t(r, o, s, i) {
            var a = o < 0 ? 1 : 0;
            if (a) {
              o = -o;
            }
            if (o === 0) {
              r(1 / o > 0 ? 0 : 2147483648, s, i);
            } else if (isNaN(o)) {
              r(2143289344, s, i);
            } else if (o > 340282346638528860000000000000000000000) {
              r((a << 31 | 2139095040) >>> 0, s, i);
            } else if (o < 0.000000000000000000000000000000000000011754943508222875) {
              r((a << 31 | Math.round(o / 0.000000000000000000000000000000000000000000001401298464324817)) >>> 0, s, i);
            } else {
              var l = Math.floor(Math.log(o) / Math.LN2);
              var c = Math.round(o * Math.pow(2, -l) * 8388608) & 8388607;
              r((a << 31 | l + 127 << 23 | c) >>> 0, s, i);
            }
          }
          e.writeFloatLE = t.bind(null, CYa);
          e.writeFloatBE = t.bind(null, RYa);
          function n(r, o, s) {
            var i = r(o, s);
            var a = (i >> 31) * 2 + 1;
            var l = i >>> 23 & 255;
            var c = i & 8388607;
            return l === 255 ? c ? NaN : a * (1 / 0) : l === 0 ? a * 0.000000000000000000000000000000000000000000001401298464324817 * c : a * Math.pow(2, l - 150) * (c + 8388608);
          }
          e.readFloatLE = n.bind(null, xYa);
          e.readFloatBE = n.bind(null, kYa);
        })();
      }
      if (typeof Float64Array < "u") {
        (function () {
          var t = new Float64Array([-0]);
          var n = new Uint8Array(t.buffer);
          var r = n[7] === 128;
          function o(l, c, u) {
            t[0] = l;
            c[u] = n[0];
            c[u + 1] = n[1];
            c[u + 2] = n[2];
            c[u + 3] = n[3];
            c[u + 4] = n[4];
            c[u + 5] = n[5];
            c[u + 6] = n[6];
            c[u + 7] = n[7];
          }
          function s(l, c, u) {
            t[0] = l;
            c[u] = n[7];
            c[u + 1] = n[6];
            c[u + 2] = n[5];
            c[u + 3] = n[4];
            c[u + 4] = n[3];
            c[u + 5] = n[2];
            c[u + 6] = n[1];
            c[u + 7] = n[0];
          }
          e.writeDoubleLE = r ? o : s;
          e.writeDoubleBE = r ? s : o;
          function i(l, c) {
            n[0] = l[c];
            n[1] = l[c + 1];
            n[2] = l[c + 2];
            n[3] = l[c + 3];
            n[4] = l[c + 4];
            n[5] = l[c + 5];
            n[6] = l[c + 6];
            n[7] = l[c + 7];
            return t[0];
          }
          function a(l, c) {
            n[7] = l[c];
            n[6] = l[c + 1];
            n[5] = l[c + 2];
            n[4] = l[c + 3];
            n[3] = l[c + 4];
            n[2] = l[c + 5];
            n[1] = l[c + 6];
            n[0] = l[c + 7];
            return t[0];
          }
          e.readDoubleLE = r ? i : a;
          e.readDoubleBE = r ? a : i;
        })();
      } else {
        (function () {
          function t(r, o, s, i, a, l) {
            var c = i < 0 ? 1 : 0;
            if (c) {
              i = -i;
            }
            if (i === 0) {
              r(0, a, l + o);
              r(1 / i > 0 ? 0 : 2147483648, a, l + s);
            } else if (isNaN(i)) {
              r(0, a, l + o);
              r(2146959360, a, l + s);
            } else if (i > 179769313486231570000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000) {
              r(0, a, l + o);
              r((c << 31 | 2146435072) >>> 0, a, l + s);
            } else {
              var u;
              if (i < 0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000022250738585072014) {
                u = i / 0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000005;
                r(u >>> 0, a, l + o);
                r((c << 31 | u / 4294967296) >>> 0, a, l + s);
              } else {
                var d = Math.floor(Math.log(i) / Math.LN2);
                if (d === 1024) {
                  d = 1023;
                }
                u = i * Math.pow(2, -d);
                r(u * 4503599627370496 >>> 0, a, l + o);
                r((c << 31 | d + 1023 << 20 | u * 1048576 & 1048575) >>> 0, a, l + s);
              }
            }
          }
          e.writeDoubleLE = t.bind(null, CYa, 0, 4);
          e.writeDoubleBE = t.bind(null, RYa, 4, 0);
          function n(r, o, s, i, a) {
            var l = r(i, a + o);
            var c = r(i, a + s);
            var u = (c >> 31) * 2 + 1;
            var d = c >>> 20 & 2047;
            var p = 4294967296 * (c & 1048575) + l;
            return d === 2047 ? p ? NaN : u * (1 / 0) : d === 0 ? u * 0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000005 * p : u * Math.pow(2, d - 1075) * (p + 4503599627370496);
          }
          e.readDoubleLE = n.bind(null, xYa, 0, 4);
          e.readDoubleBE = n.bind(null, kYa, 4, 0);
        })();
      }
      return e;
    }
    function CYa(e, t, n) {
      t[n] = e & 255;
      t[n + 1] = e >>> 8 & 255;
      t[n + 2] = e >>> 16 & 255;
      t[n + 3] = e >>> 24;
    }
    function RYa(e, t, n) {
      t[n] = e >>> 24;
      t[n + 1] = e >>> 16 & 255;
      t[n + 2] = e >>> 8 & 255;
      t[n + 3] = e & 255;
    }
    function xYa(e, t) {
      return (e[t] | e[t + 1] << 8 | e[t + 2] << 16 | e[t + 3] << 24) >>> 0;
    }
    function kYa(e, t) {
      return (e[t] << 24 | e[t + 1] << 16 | e[t + 2] << 8 | e[t + 3]) >>> 0;
    }
  });
  var gRo = __commonJS((N8t, hRo) => {
    (function (e, t) {
      function n(r) {
        return r.default || r;
      }
      if (typeof define === "function" && define.amd) {
        define([], function () {
          var r = {};
          t(r);
          return n(r);
        });
      } else if (typeof N8t === "object") {
        if (t(N8t), typeof hRo === "object") {
          hRo.exports = n(N8t);
        }
      } else {
        (function () {
          var r = {};
          t(r);
          e.Long = n(r);
        })();
      }
    })(typeof globalThis < "u" ? globalThis : typeof self < "u" ? self : N8t, function (e) {
      Object.defineProperty(e, "__esModule", {
        value: true
      });
      e.default = undefined;
      var t = null;
      try {
        t = new WebAssembly.Instance(new WebAssembly.Module(new Uint8Array([0, 97, 115, 109, 1, 0, 0, 0, 1, 13, 2, 96, 0, 1, 127, 96, 4, 127, 127, 127, 127, 1, 127, 3, 7, 6, 0, 1, 1, 1, 1, 1, 6, 6, 1, 127, 1, 65, 0, 11, 7, 50, 6, 3, 109, 117, 108, 0, 1, 5, 100, 105, 118, 95, 115, 0, 2, 5, 100, 105, 118, 95, 117, 0, 3, 5, 114, 101, 109, 95, 115, 0, 4, 5, 114, 101, 109, 95, 117, 0, 5, 8, 103, 101, 116, 95, 104, 105, 103, 104, 0, 0, 10, 191, 1, 6, 4, 0, 35, 0, 11, 36, 1, 1, 126, 32, 0, 173, 32, 1, 173, 66, 32, 134, 132, 32, 2, 173, 32, 3, 173, 66, 32, 134, 132, 126, 34, 4, 66, 32, 135, 167, 36, 0, 32, 4, 167, 11, 36, 1, 1, 126, 32, 0, 173, 32, 1, 173, 66, 32, 134, 132, 32, 2, 173, 32, 3, 173, 66, 32, 134, 132, 127, 34, 4, 66, 32, 135, 167, 36, 0, 32, 4, 167, 11, 36, 1, 1, 126, 32, 0, 173, 32, 1, 173, 66, 32, 134, 132, 32, 2, 173, 32, 3, 173, 66, 32, 134, 132, 128, 34, 4, 66, 32, 135, 167, 36, 0, 32, 4, 167, 11, 36, 1, 1, 126, 32, 0, 173, 32, 1, 173, 66, 32, 134, 132, 32, 2, 173, 32, 3, 173, 66, 32, 134, 132, 129, 34, 4, 66, 32, 135, 167, 36, 0, 32, 4, 167, 11, 36, 1, 1, 126, 32, 0, 173, 32, 1, 173, 66, 32, 134, 132, 32, 2, 173, 32, 3, 173, 66, 32, 134, 132, 130, 34, 4, 66, 32, 135, 167, 36, 0, 32, 4, 167, 11])), {}).exports;
      } catch {}
      function n(L, P, F) {
        this.low = L | 0;
        this.high = P | 0;
        this.unsigned = !!F;
      }
      n.prototype.__isLong__;
      Object.defineProperty(n.prototype, "__isLong__", {
        value: true
      });
      function r(L) {
        return (L && L.__isLong__) === true;
      }
      function o(L) {
        var P = Math.clz32(L & -L);
        return L ? 31 - P : P;
      }
      n.isLong = r;
      var s = {};
      var i = {};
      function a(L, P) {
        var F;
        var H;
        var U;
        if (P) {
          if (L >>>= 0, U = 0 <= L && L < 256) {
            if (H = i[L], H) {
              return H;
            }
          }
          if (F = c(L, 0, true), U) {
            i[L] = F;
          }
          return F;
        } else {
          if (L |= 0, U = -128 <= L && L < 128) {
            if (H = s[L], H) {
              return H;
            }
          }
          if (F = c(L, L < 0 ? -1 : 0, false), U) {
            s[L] = F;
          }
          return F;
        }
      }
      n.fromInt = a;
      function l(L, P) {
        if (isNaN(L)) {
          return P ? S : b;
        }
        if (P) {
          if (L < 0) {
            return S;
          }
          if (L >= g) {
            return k;
          }
        } else {
          if (L <= -y) {
            return I;
          }
          if (L + 1 >= y) {
            return A;
          }
        }
        if (L < 0) {
          return l(-L, P).neg();
        }
        return c(L % h | 0, L / h | 0, P);
      }
      n.fromNumber = l;
      function c(L, P, F) {
        return new n(L, P, F);
      }
      n.fromBits = c;
      var u = Math.pow;
      function d(L, P, F) {
        if (L.length === 0) {
          throw Error("empty string");
        }
        if (typeof P === "number") {
          F = P;
          P = false;
        } else {
          P = !!P;
        }
        if (L === "NaN" || L === "Infinity" || L === "+Infinity" || L === "-Infinity") {
          return P ? S : b;
        }
        if (F = F || 10, F < 2 || 36 < F) {
          throw RangeError("radix");
        }
        var H;
        if ((H = L.indexOf("-")) > 0) {
          throw Error("interior hyphen");
        } else if (H === 0) {
          return d(L.substring(1), P, F).neg();
        }
        var U = l(u(F, 8));
        var N = b;
        for (var W = 0; W < L.length; W += 8) {
          var j = Math.min(8, L.length - W);
          var z = parseInt(L.substring(W, W + j), F);
          if (j < 8) {
            var V = l(u(F, j));
            N = N.mul(V).add(l(z));
          } else {
            N = N.mul(U);
            N = N.add(l(z));
          }
        }
        N.unsigned = P;
        return N;
      }
      n.fromString = d;
      function p(L, P) {
        if (typeof L === "number") {
          return l(L, P);
        }
        if (typeof L === "string") {
          return d(L, P);
        }
        return c(L.low, L.high, typeof P === "boolean" ? P : L.unsigned);
      }
      n.fromValue = p;
      var m = 65536;
      var f = 16777216;
      var h = m * m;
      var g = h * h;
      var y = g / 2;
      var _ = a(f);
      var b = a(0);
      n.ZERO = b;
      var S = a(0, true);
      n.UZERO = S;
      var E = a(1);
      n.ONE = E;
      var C = a(1, true);
      n.UONE = C;
      var x = a(-1);
      n.NEG_ONE = x;
      var A = c(-1, 2147483647, false);
      n.MAX_VALUE = A;
      var k = c(-1, -1, true);
      n.MAX_UNSIGNED_VALUE = k;
      var I = c(0, -2147483648, false);
      n.MIN_VALUE = I;
      var O = n.prototype;
      if (O.toInt = function () {
        return this.unsigned ? this.low >>> 0 : this.low;
      }, O.toNumber = function () {
        if (this.unsigned) {
          return (this.high >>> 0) * h + (this.low >>> 0);
        }
        return this.high * h + (this.low >>> 0);
      }, O.toString = function (P) {
        if (P = P || 10, P < 2 || 36 < P) {
          throw RangeError("radix");
        }
        if (this.isZero()) {
          return "0";
        }
        if (this.isNegative()) {
          if (this.eq(I)) {
            var F = l(P);
            var H = this.div(F);
            var U = H.mul(F).sub(this);
            return H.toString(P) + U.toInt().toString(P);
          } else {
            return "-" + this.neg().toString(P);
          }
        }
        var N = l(u(P, 6), this.unsigned);
        var W = this;
        var j = "";
        while (true) {
          var z = W.div(N);
          var V = W.sub(z.mul(N)).toInt() >>> 0;
          var K = V.toString(P);
          if (W = z, W.isZero()) {
            return K + j;
          } else {
            while (K.length < 6) {
              K = "0" + K;
            }
            j = "" + K + j;
          }
        }
      }, O.getHighBits = function () {
        return this.high;
      }, O.getHighBitsUnsigned = function () {
        return this.high >>> 0;
      }, O.getLowBits = function () {
        return this.low;
      }, O.getLowBitsUnsigned = function () {
        return this.low >>> 0;
      }, O.getNumBitsAbs = function () {
        if (this.isNegative()) {
          return this.eq(I) ? 64 : this.neg().getNumBitsAbs();
        }
        var P = this.high != 0 ? this.high : this.low;
        for (var F = 31; F > 0; F--) {
          if ((P & 1 << F) != 0) {
            break;
          }
        }
        return this.high != 0 ? F + 33 : F + 1;
      }, O.isSafeInteger = function () {
        var P = this.high >> 21;
        if (!P) {
          return true;
        }
        if (this.unsigned) {
          return false;
        }
        return P === -1 && !(this.low === 0 && this.high === -2097152);
      }, O.isZero = function () {
        return this.high === 0 && this.low === 0;
      }, O.eqz = O.isZero, O.isNegative = function () {
        return !this.unsigned && this.high < 0;
      }, O.isPositive = function () {
        return this.unsigned || this.high >= 0;
      }, O.isOdd = function () {
        return (this.low & 1) === 1;
      }, O.isEven = function () {
        return (this.low & 1) === 0;
      }, O.equals = function (P) {
        if (!r(P)) {
          P = p(P);
        }
        if (this.unsigned !== P.unsigned && this.high >>> 31 === 1 && P.high >>> 31 === 1) {
          return false;
        }
        return this.high === P.high && this.low === P.low;
      }, O.eq = O.equals, O.notEquals = function (P) {
        return !this.eq(P);
      }, O.neq = O.notEquals, O.ne = O.notEquals, O.lessThan = function (P) {
        return this.comp(P) < 0;
      }, O.lt = O.lessThan, O.lessThanOrEqual = function (P) {
        return this.comp(P) <= 0;
      }, O.lte = O.lessThanOrEqual, O.le = O.lessThanOrEqual, O.greaterThan = function (P) {
        return this.comp(P) > 0;
      }, O.gt = O.greaterThan, O.greaterThanOrEqual = function (P) {
        return this.comp(P) >= 0;
      }, O.gte = O.greaterThanOrEqual, O.ge = O.greaterThanOrEqual, O.compare = function (P) {
        if (!r(P)) {
          P = p(P);
        }
        if (this.eq(P)) {
          return 0;
        }
        var F = this.isNegative();
        var H = P.isNegative();
        if (F && !H) {
          return -1;
        }
        if (!F && H) {
          return 1;
        }
        if (!this.unsigned) {
          return this.sub(P).isNegative() ? -1 : 1;
        }
        return P.high >>> 0 > this.high >>> 0 || P.high === this.high && P.low >>> 0 > this.low >>> 0 ? -1 : 1;
      }, O.comp = O.compare, O.negate = function () {
        if (!this.unsigned && this.eq(I)) {
          return I;
        }
        return this.not().add(E);
      }, O.neg = O.negate, O.add = function (P) {
        if (!r(P)) {
          P = p(P);
        }
        var F = this.high >>> 16;
        var H = this.high & 65535;
        var U = this.low >>> 16;
        var N = this.low & 65535;
        var W = P.high >>> 16;
        var j = P.high & 65535;
        var z = P.low >>> 16;
        var V = P.low & 65535;
        var K = 0;
        var J = 0;
        var Q = 0;
        var Z = 0;
        Z += N + V;
        Q += Z >>> 16;
        Z &= 65535;
        Q += U + z;
        J += Q >>> 16;
        Q &= 65535;
        J += H + j;
        K += J >>> 16;
        J &= 65535;
        K += F + W;
        K &= 65535;
        return c(Q << 16 | Z, K << 16 | J, this.unsigned);
      }, O.subtract = function (P) {
        if (!r(P)) {
          P = p(P);
        }
        return this.add(P.neg());
      }, O.sub = O.subtract, O.multiply = function (P) {
        if (this.isZero()) {
          return this;
        }
        if (!r(P)) {
          P = p(P);
        }
        if (t) {
          var F = t.mul(this.low, this.high, P.low, P.high);
          return c(F, t.get_high(), this.unsigned);
        }
        if (P.isZero()) {
          return this.unsigned ? S : b;
        }
        if (this.eq(I)) {
          return P.isOdd() ? I : b;
        }
        if (P.eq(I)) {
          return this.isOdd() ? I : b;
        }
        if (this.isNegative()) {
          if (P.isNegative()) {
            return this.neg().mul(P.neg());
          } else {
            return this.neg().mul(P).neg();
          }
        } else if (P.isNegative()) {
          return this.mul(P.neg()).neg();
        }
        if (this.lt(_) && P.lt(_)) {
          return l(this.toNumber() * P.toNumber(), this.unsigned);
        }
        var H = this.high >>> 16;
        var U = this.high & 65535;
        var N = this.low >>> 16;
        var W = this.low & 65535;
        var j = P.high >>> 16;
        var z = P.high & 65535;
        var V = P.low >>> 16;
        var K = P.low & 65535;
        var J = 0;
        var Q = 0;
        var Z = 0;
        var ne = 0;
        ne += W * K;
        Z += ne >>> 16;
        ne &= 65535;
        Z += N * K;
        Q += Z >>> 16;
        Z &= 65535;
        Z += W * V;
        Q += Z >>> 16;
        Z &= 65535;
        Q += U * K;
        J += Q >>> 16;
        Q &= 65535;
        Q += N * V;
        J += Q >>> 16;
        Q &= 65535;
        Q += W * z;
        J += Q >>> 16;
        Q &= 65535;
        J += H * K + U * V + N * z + W * j;
        J &= 65535;
        return c(Z << 16 | ne, J << 16 | Q, this.unsigned);
      }, O.mul = O.multiply, O.divide = function (P) {
        if (!r(P)) {
          P = p(P);
        }
        if (P.isZero()) {
          throw Error("division by zero");
        }
        if (t) {
          if (!this.unsigned && this.high === -2147483648 && P.low === -1 && P.high === -1) {
            return this;
          }
          var F = (this.unsigned ? t.div_u : t.div_s)(this.low, this.high, P.low, P.high);
          return c(F, t.get_high(), this.unsigned);
        }
        if (this.isZero()) {
          return this.unsigned ? S : b;
        }
        var H;
        var U;
        var N;
        if (!this.unsigned) {
          if (this.eq(I)) {
            if (P.eq(E) || P.eq(x)) {
              return I;
            } else if (P.eq(I)) {
              return E;
            } else {
              var W = this.shr(1);
              if (H = W.div(P).shl(1), H.eq(b)) {
                return P.isNegative() ? E : x;
              } else {
                U = this.sub(P.mul(H));
                N = H.add(U.div(P));
                return N;
              }
            }
          } else if (P.eq(I)) {
            return this.unsigned ? S : b;
          }
          if (this.isNegative()) {
            if (P.isNegative()) {
              return this.neg().div(P.neg());
            }
            return this.neg().div(P).neg();
          } else if (P.isNegative()) {
            return this.div(P.neg()).neg();
          }
          N = b;
        } else {
          if (!P.unsigned) {
            P = P.toUnsigned();
          }
          if (P.gt(this)) {
            return S;
          }
          if (P.gt(this.shru(1))) {
            return C;
          }
          N = S;
        }
        U = this;
        while (U.gte(P)) {
          H = Math.max(1, Math.floor(U.toNumber() / P.toNumber()));
          var j = Math.ceil(Math.log(H) / Math.LN2);
          var z = j <= 48 ? 1 : u(2, j - 48);
          var V = l(H);
          var K = V.mul(P);
          while (K.isNegative() || K.gt(U)) {
            H -= z;
            V = l(H, this.unsigned);
            K = V.mul(P);
          }
          if (V.isZero()) {
            V = E;
          }
          N = N.add(V);
          U = U.sub(K);
        }
        return N;
      }, O.div = O.divide, O.modulo = function (P) {
        if (!r(P)) {
          P = p(P);
        }
        if (t) {
          var F = (this.unsigned ? t.rem_u : t.rem_s)(this.low, this.high, P.low, P.high);
          return c(F, t.get_high(), this.unsigned);
        }
        return this.sub(this.div(P).mul(P));
      }, O.mod = O.modulo, O.rem = O.modulo, O.not = function () {
        return c(~this.low, ~this.high, this.unsigned);
      }, O.countLeadingZeros = function () {
        return this.high ? Math.clz32(this.high) : Math.clz32(this.low) + 32;
      }, O.clz = O.countLeadingZeros, O.countTrailingZeros = function () {
        return this.low ? o(this.low) : o(this.high) + 32;
      }, O.ctz = O.countTrailingZeros, O.and = function (P) {
        if (!r(P)) {
          P = p(P);
        }
        return c(this.low & P.low, this.high & P.high, this.unsigned);
      }, O.or = function (P) {
        if (!r(P)) {
          P = p(P);
        }
        return c(this.low | P.low, this.high | P.high, this.unsigned);
      }, O.xor = function (P) {
        if (!r(P)) {
          P = p(P);
        }
        return c(this.low ^ P.low, this.high ^ P.high, this.unsigned);
      }, O.shiftLeft = function (P) {
        if (r(P)) {
          P = P.toInt();
        }
        if ((P &= 63) === 0) {
          return this;
        } else if (P < 32) {
          return c(this.low << P, this.high << P | this.low >>> 32 - P, this.unsigned);
        } else {
          return c(0, this.low << P - 32, this.unsigned);
        }
      }, O.shl = O.shiftLeft, O.shiftRight = function (P) {
        if (r(P)) {
          P = P.toInt();
        }
        if ((P &= 63) === 0) {
          return this;
        } else if (P < 32) {
          return c(this.low >>> P | this.high << 32 - P, this.high >> P, this.unsigned);
        } else {
          return c(this.high >> P - 32, this.high >= 0 ? 0 : -1, this.unsigned);
        }
      }, O.shr = O.shiftRight, O.shiftRightUnsigned = function (P) {
        if (r(P)) {
          P = P.toInt();
        }
        if ((P &= 63) === 0) {
          return this;
        }
        if (P < 32) {
          return c(this.low >>> P | this.high << 32 - P, this.high >>> P, this.unsigned);
        }
        if (P === 32) {
          return c(this.high, 0, this.unsigned);
        }
        return c(this.high >>> P - 32, 0, this.unsigned);
      }, O.shru = O.shiftRightUnsigned, O.shr_u = O.shiftRightUnsigned, O.rotateLeft = function (P) {
        var F;
        if (r(P)) {
          P = P.toInt();
        }
        if ((P &= 63) === 0) {
          return this;
        }
        if (P === 32) {
          return c(this.high, this.low, this.unsigned);
        }
        if (P < 32) {
          F = 32 - P;
          return c(this.low << P | this.high >>> F, this.high << P | this.low >>> F, this.unsigned);
        }
        P -= 32;
        F = 32 - P;
        return c(this.high << P | this.low >>> F, this.low << P | this.high >>> F, this.unsigned);
      }, O.rotl = O.rotateLeft, O.rotateRight = function (P) {
        var F;
        if (r(P)) {
          P = P.toInt();
        }
        if ((P &= 63) === 0) {
          return this;
        }
        if (P === 32) {
          return c(this.high, this.low, this.unsigned);
        }
        if (P < 32) {
          F = 32 - P;
          return c(this.high << F | this.low >>> P, this.low << F | this.high >>> P, this.unsigned);
        }
        P -= 32;
        F = 32 - P;
        return c(this.low << F | this.high >>> P, this.high << F | this.low >>> P, this.unsigned);
      }, O.rotr = O.rotateRight, O.toSigned = function () {
        if (!this.unsigned) {
          return this;
        }
        return c(this.low, this.high, false);
      }, O.toUnsigned = function () {
        if (this.unsigned) {
          return this;
        }
        return c(this.low, this.high, true);
      }, O.toBytes = function (P) {
        return P ? this.toBytesLE() : this.toBytesBE();
      }, O.toBytesLE = function () {
        var P = this.high;
        var F = this.low;
        return [F & 255, F >>> 8 & 255, F >>> 16 & 255, F >>> 24, P & 255, P >>> 8 & 255, P >>> 16 & 255, P >>> 24];
      }, O.toBytesBE = function () {
        var P = this.high;
        var F = this.low;
        return [P >>> 24, P >>> 16 & 255, P >>> 8 & 255, P & 255, F >>> 24, F >>> 16 & 255, F >>> 8 & 255, F & 255];
      }, n.fromBytes = function (P, F, H) {
        return H ? n.fromBytesLE(P, F) : n.fromBytesBE(P, F);
      }, n.fromBytesLE = function (P, F) {
        return new n(P[0] | P[1] << 8 | P[2] << 16 | P[3] << 24, P[4] | P[5] << 8 | P[6] << 16 | P[7] << 24, F);
      }, n.fromBytesBE = function (P, F) {
        return new n(P[4] << 24 | P[5] << 16 | P[6] << 8 | P[7], P[0] << 24 | P[1] << 16 | P[2] << 8 | P[3], F);
      }, typeof BigInt === "function") {
        n.fromBigInt = function (P, F) {
          var H = Number(BigInt.asIntN(32, P));
          var U = Number(BigInt.asIntN(32, P >> BigInt(32)));
          return c(H, U, F);
        };
        n.fromValue = function (P, F) {
          if (typeof P === "bigint") {
            return n.fromBigInt(P, F);
          }
          return p(P, F);
        };
        O.toBigInt = function () {
          var P = BigInt(this.low >>> 0);
          var F = BigInt(this.unsigned ? this.high >>> 0 : this.high);
          return F << BigInt(32) | P;
        };
      }
      var M = e.default = n;
    });
  });
  var OYa = __commonJS((x7_, PYa) => {
    PYa.exports = a7p;
    function a7p(e) {
      try {
        var t = e === "long" ? gRo() : e === "buffer" ? require("buffer") : e === "fs" ? require("fs") : require(e);
        if (t && (t.length || Object.keys(t).length)) {
          return t;
        }
        return null;
      } catch (n) {
        return null;
      }
    }
  });
  var MYa = __commonJS(DYa => {
    var _Ro = DYa;
    _Ro.length = function (t) {
      var n = 0;
      var r = 0;
      for (var o = 0; o < t.length; ++o) {
        if (r = t.charCodeAt(o), r < 128) {
          n += 1;
        } else if (r < 2048) {
          n += 2;
        } else if ((r & 64512) === 55296 && (t.charCodeAt(o + 1) & 64512) === 56320) {
          ++o;
          n += 4;
        } else {
          n += 3;
        }
      }
      return n;
    };
    _Ro.read = function (t, n, r) {
      if (r - n < 1) {
        return "";
      }
      var o = "";
      for (var s = n; s < r;) {
        var i = t[s++];
        if (i <= 127) {
          o += String.fromCharCode(i);
        } else if (i >= 192 && i < 224) {
          var a = (i & 31) << 6 | t[s++] & 63;
          o += a >= 128 ? String.fromCharCode(a) : "\uFFFD";
        } else if (i >= 224 && i < 240) {
          var l = (i & 15) << 12 | (t[s++] & 63) << 6 | t[s++] & 63;
          o += l >= 2048 ? String.fromCharCode(l) : "\uFFFD";
        } else if (i >= 240) {
          var c = (i & 7) << 18 | (t[s++] & 63) << 12 | (t[s++] & 63) << 6 | t[s++] & 63;
          if (c < 65536 || c > 1114111) {
            o += "\uFFFD";
          } else {
            c -= 65536;
            o += String.fromCharCode(55296 + (c >> 10));
            o += String.fromCharCode(56320 + (c & 1023));
          }
        }
      }
      return o;
    };
    _Ro.write = function (t, n, r) {
      var o = r;
      var s;
      var i;
      for (var a = 0; a < t.length; ++a) {
        if (s = t.charCodeAt(a), s < 128) {
          n[r++] = s;
        } else if (s < 2048) {
          n[r++] = s >> 6 | 192;
          n[r++] = s & 63 | 128;
        } else if ((s & 64512) === 55296 && ((i = t.charCodeAt(a + 1)) & 64512) === 56320) {
          s = 65536 + ((s & 1023) << 10) + (i & 1023);
          ++a;
          n[r++] = s >> 18 | 240;
          n[r++] = s >> 12 & 63 | 128;
          n[r++] = s >> 6 & 63 | 128;
          n[r++] = s & 63 | 128;
        } else {
          n[r++] = s >> 12 | 224;
          n[r++] = s >> 6 & 63 | 128;
          n[r++] = s & 63 | 128;
        }
      }
      return r - o;
    };
  });
  var LYa = __commonJS((A7_, NYa) => {
    NYa.exports = l7p;
    function l7p(e, t, n) {
      var r = n || 8192;
      var o = r >>> 1;
      var s = null;
      var i = r;
      return function (l) {
        if (l < 1 || l > o) {
          return e(l);
        }
        if (i + l > r) {
          s = e(r);
          i = 0;
        }
        var c = t.call(s, i, i += l);
        if (i & 7) {
          i = (i | 7) + 1;
        }
        return c;
      };
    }
  });
  var UYa = __commonJS((I7_, FYa) => {
    FYa.exports = z1;
    var L8t = Wpe();
    function z1(e, t) {
      this.lo = e >>> 0;
      this.hi = t >>> 0;
    }
    var lVe = z1.zero = new z1(0, 0);
    lVe.toNumber = function () {
      return 0;
    };
    lVe.zzEncode = lVe.zzDecode = function () {
      return this;
    };
    lVe.length = function () {
      return 1;
    };
    var c7p = z1.zeroHash = "\x00\x00\x00\x00\x00\x00\x00\x00";
    z1.fromNumber = function (t) {
      if (t === 0) {
        return lVe;
      }
      var n = t < 0;
      if (n) {
        t = -t;
      }
      var r = t >>> 0;
      var o = (t - r) / 4294967296 >>> 0;
      if (n) {
        if (o = ~o >>> 0, r = ~r >>> 0, ++r > 4294967295) {
          if (r = 0, ++o > 4294967295) {
            o = 0;
          }
        }
      }
      return new z1(r, o);
    };
    z1.from = function (t) {
      if (typeof t === "number") {
        return z1.fromNumber(t);
      }
      if (L8t.isString(t)) {
        if (L8t.Long) {
          t = L8t.Long.fromString(t);
        } else {
          return z1.fromNumber(parseInt(t, 10));
        }
      }
      return t.low || t.high ? new z1(t.low >>> 0, t.high >>> 0) : lVe;
    };
    z1.prototype.toNumber = function (t) {
      if (!t && this.hi >>> 31) {
        var n = ~this.lo + 1 >>> 0;
        var r = ~this.hi >>> 0;
        if (!n) {
          r = r + 1 >>> 0;
        }
        return -(n + r * 4294967296);
      }
      return this.lo + this.hi * 4294967296;
    };
    z1.prototype.toLong = function (t) {
      return L8t.Long ? new L8t.Long(this.lo | 0, this.hi | 0, Boolean(t)) : {
        low: this.lo | 0,
        high: this.hi | 0,
        unsigned: Boolean(t)
      };
    };
    var n1e = String.prototype.charCodeAt;
    z1.fromHash = function (t) {
      if (t === c7p) {
        return lVe;
      }
      return new z1((n1e.call(t, 0) | n1e.call(t, 1) << 8 | n1e.call(t, 2) << 16 | n1e.call(t, 3) << 24) >>> 0, (n1e.call(t, 4) | n1e.call(t, 5) << 8 | n1e.call(t, 6) << 16 | n1e.call(t, 7) << 24) >>> 0);
    };
    z1.prototype.toHash = function () {
      return String.fromCharCode(this.lo & 255, this.lo >>> 8 & 255, this.lo >>> 16 & 255, this.lo >>> 24, this.hi & 255, this.hi >>> 8 & 255, this.hi >>> 16 & 255, this.hi >>> 24);
    };
    z1.prototype.zzEncode = function () {
      var t = this.hi >> 31;
      this.hi = ((this.hi << 1 | this.lo >>> 31) ^ t) >>> 0;
      this.lo = (this.lo << 1 ^ t) >>> 0;
      return this;
    };
    z1.prototype.zzDecode = function () {
      var t = -(this.lo & 1);
      this.lo = ((this.lo >>> 1 | this.hi << 31) ^ t) >>> 0;
      this.hi = (this.hi >>> 1 ^ t) >>> 0;
      return this;
    };
    z1.prototype.length = function () {
      var t = this.lo;
      var n = (this.lo >>> 28 | this.hi << 4) >>> 0;
      var r = this.hi >>> 24;
      return r === 0 ? n === 0 ? t < 16384 ? t < 128 ? 1 : 2 : t < 2097152 ? 3 : 4 : n < 16384 ? n < 128 ? 5 : 6 : n < 2097152 ? 7 : 8 : r < 128 ? 9 : 10;
    };
  });
  var Wpe = __commonJS(bRo => {
    var iu = bRo;
    iu.asPromise = fRo();
    iu.base64 = TYa();
    iu.EventEmitter = vYa();
    iu.float = IYa();
    iu.inquire = OYa();
    iu.utf8 = MYa();
    iu.pool = LYa();
    iu.LongBits = UYa();
    iu.isNode = Boolean(typeof global < "u" && global && global.process && global.process.versions && global.process.versions.node);
    iu.global = iu.isNode && global || typeof window < "u" && window || typeof self < "u" && self || bRo;
    iu.emptyArray = Object.freeze ? Object.freeze([]) : [];
    iu.emptyObject = Object.freeze ? Object.freeze({}) : {};
    iu.isInteger = Number.isInteger || function (t) {
      return typeof t === "number" && isFinite(t) && Math.floor(t) === t;
    };
    iu.isString = function (t) {
      return typeof t === "string" || t instanceof String;
    };
    iu.isObject = function (t) {
      return t && typeof t === "object";
    };
    iu.isset = iu.isSet = function (t, n) {
      var r = t[n];
      if (r != null && t.hasOwnProperty(n)) {
        return typeof r !== "object" || (Array.isArray(r) ? r.length : Object.keys(r).length) > 0;
      }
      return false;
    };
    iu.Buffer = function () {
      try {
        var e = iu.inquire("buffer").Buffer;
        return e.prototype.utf8Write ? e : null;
      } catch (t) {
        return null;
      }
    }();
    iu._Buffer_from = null;
    iu._Buffer_allocUnsafe = null;
    iu.newBuffer = function (t) {
      return typeof t === "number" ? iu.Buffer ? iu._Buffer_allocUnsafe(t) : new iu.Array(t) : iu.Buffer ? iu._Buffer_from(t) : typeof Uint8Array > "u" ? t : new Uint8Array(t);
    };
    iu.Array = typeof Uint8Array < "u" ? Uint8Array : Array;
    iu.Long = iu.global.dcodeIO && iu.global.dcodeIO.Long || iu.global.Long || iu.inquire("long");
    iu.key2Re = /^true|false|0|1$/;
    iu.key32Re = /^-?(?:0|[1-9][0-9]*)$/;
    iu.key64Re = /^(?:[\\x00-\\xff]{8}|-?(?:0|[1-9][0-9]*))$/;
    iu.longToHash = function (t) {
      return t ? iu.LongBits.from(t).toHash() : iu.LongBits.zeroHash;
    };
    iu.longFromHash = function (t, n) {
      var r = iu.LongBits.fromHash(t);
      if (iu.Long) {
        return iu.Long.fromBits(r.lo, r.hi, n);
      }
      return r.toNumber(Boolean(n));
    };
    function BYa(e, t, n) {
      for (var r = Object.keys(t), o = 0; o < r.length; ++o) {
        if (e[r[o]] === undefined || !n) {
          if (r[o] !== "__proto__") {
            e[r[o]] = t[r[o]];
          }
        }
      }
      return e;
    }
    iu.merge = BYa;
    iu.recursionLimit = 100;
    iu.makeProp = function (t, n) {
      Object.defineProperty(t, n, {
        enumerable: true,
        configurable: true,
        writable: true
      });
    };
    iu.lcFirst = function (t) {
      return t.charAt(0).toLowerCase() + t.substring(1);
    };
    function $Ya(e) {
      function t(n, r) {
        if (!(this instanceof t)) {
          return new t(n, r);
        }
        if (Object.defineProperty(this, "message", {
          get: function () {
            return n;
          }
        }), Error.captureStackTrace) {
          Error.captureStackTrace(this, t);
        } else {
          Object.defineProperty(this, "stack", {
            value: Error().stack || ""
          });
        }
        if (r) {
          BYa(this, r);
        }
      }
      t.prototype = Object.create(Error.prototype, {
        constructor: {
          value: t,
          writable: true,
          enumerable: false,
          configurable: true
        },
        name: {
          get: function () {
            return e;
          },
          set: undefined,
          enumerable: false,
          configurable: true
        },
        toString: {
          value: function () {
            return this.name + ": " + this.message;
          },
          writable: true,
          enumerable: false,
          configurable: true
        }
      });
      return t;
    }
    iu.newError = $Ya;
    iu.ProtocolError = $Ya("ProtocolError");
    iu.oneOfGetter = function (t) {
      var n = {};
      for (var r = 0; r < t.length; ++r) {
        n[t[r]] = 1;
      }
      return function () {
        for (var o = Object.keys(this), s = o.length - 1; s > -1; --s) {
          if (n[o[s]] === 1 && this[o[s]] !== undefined && this[o[s]] !== null) {
            return o[s];
          }
        }
      };
    };
    iu.oneOfSetter = function (t) {
      return function (n) {
        for (var r = 0; r < t.length; ++r) {
          if (t[r] !== n) {
            delete this[t[r]];
          }
        }
      };
    };
    iu.toJSONOptions = {
      longs: String,
      enums: String,
      bytes: String,
      json: true
    };
    iu._configure = function () {
      var e = iu.Buffer;
      if (!e) {
        iu._Buffer_from = iu._Buffer_allocUnsafe = null;
        return;
      }
      iu._Buffer_from = e.from !== Uint8Array.from && e.from || function (n, r) {
        return new e(n, r);
      };
      iu._Buffer_allocUnsafe = e.allocUnsafe || function (n) {
        return new e(n);
      };
    };
  });
  var E8n = __commonJS((O7_, WYa) => {
    WYa.exports = T_;
    var PQ = Wpe();
    var SRo;
    var T8n = PQ.LongBits;
    var HYa = PQ.base64;
    var jYa = PQ.utf8;
    function F8t(e, t, n) {
      this.fn = e;
      this.len = t;
      this.next = undefined;
      this.val = n;
    }
    function ERo() {}
    function u7p(e) {
      this.head = e.head;
      this.tail = e.tail;
      this.len = e.len;
      this.next = e.states;
    }
    function T_() {
      this.len = 0;
      this.head = new F8t(ERo, 0, 0);
      this.tail = this.head;
      this.states = null;
    }
    var qYa = function () {
      return PQ.Buffer ? function () {
        return (T_.create = function () {
          return new SRo();
        })();
      } : function () {
        return new T_();
      };
    };
    T_.create = qYa();
    T_.alloc = function (t) {
      return new PQ.Array(t);
    };
    if (PQ.Array !== Array) {
      T_.alloc = PQ.pool(T_.alloc, PQ.Array.prototype.subarray);
    }
    T_.prototype._push = function (t, n, r) {
      this.tail = this.tail.next = new F8t(t, n, r);
      this.len += n;
      return this;
    };
    function vRo(e, t, n) {
      t[n] = e & 255;
    }
    function d7p(e, t, n) {
      while (e > 127) {
        t[n++] = e & 127 | 128;
        e >>>= 7;
      }
      t[n] = e;
    }
    function wRo(e, t) {
      this.len = e;
      this.next = undefined;
      this.val = t;
    }
    wRo.prototype = Object.create(F8t.prototype);
    wRo.prototype.fn = d7p;
    T_.prototype.uint32 = function (t) {
      this.len += (this.tail = this.tail.next = new wRo((t = t >>> 0) < 128 ? 1 : t < 16384 ? 2 : t < 2097152 ? 3 : t < 268435456 ? 4 : 5, t)).len;
      return this;
    };
    T_.prototype.int32 = function (t) {
      return t < 0 ? this._push(CRo, 10, T8n.fromNumber(t)) : this.uint32(t);
    };
    T_.prototype.sint32 = function (t) {
      return this.uint32((t << 1 ^ t >> 31) >>> 0);
    };
    function CRo(e, t, n) {
      while (e.hi) {
        t[n++] = e.lo & 127 | 128;
        e.lo = (e.lo >>> 7 | e.hi << 25) >>> 0;
        e.hi >>>= 7;
      }
      while (e.lo > 127) {
        t[n++] = e.lo & 127 | 128;
        e.lo = e.lo >>> 7;
      }
      t[n++] = e.lo;
    }
    T_.prototype.uint64 = function (t) {
      var n = T8n.from(t);
      return this._push(CRo, n.length(), n);
    };
    T_.prototype.int64 = T_.prototype.uint64;
    T_.prototype.sint64 = function (t) {
      var n = T8n.from(t).zzEncode();
      return this._push(CRo, n.length(), n);
    };
    T_.prototype.bool = function (t) {
      return this._push(vRo, 1, t ? 1 : 0);
    };
    function TRo(e, t, n) {
      t[n] = e & 255;
      t[n + 1] = e >>> 8 & 255;
      t[n + 2] = e >>> 16 & 255;
      t[n + 3] = e >>> 24;
    }
    T_.prototype.fixed32 = function (t) {
      return this._push(TRo, 4, t >>> 0);
    };
    T_.prototype.sfixed32 = T_.prototype.fixed32;
    T_.prototype.fixed64 = function (t) {
      var n = T8n.from(t);
      return this._push(TRo, 4, n.lo)._push(TRo, 4, n.hi);
    };
    T_.prototype.sfixed64 = T_.prototype.fixed64;
    T_.prototype.float = function (t) {
      return this._push(PQ.float.writeFloatLE, 4, t);
    };
    T_.prototype.double = function (t) {
      return this._push(PQ.float.writeDoubleLE, 8, t);
    };
    var p7p = PQ.Array.prototype.set ? function (t, n, r) {
      n.set(t, r);
    } : function (t, n, r) {
      for (var o = 0; o < t.length; ++o) {
        n[r + o] = t[o];
      }
    };
    T_.prototype.bytes = function (t) {
      var n = t.length >>> 0;
      if (!n) {
        return this._push(vRo, 1, 0);
      }
      if (PQ.isString(t)) {
        var r = T_.alloc(n = HYa.length(t));
        HYa.oC(t, r, 0);
        t = r;
      }
      return this.uint32(n)._push(p7p, n, t);
    };
    T_.prototype.string = function (t) {
      var n = jYa.length(t);
      return n ? this.uint32(n)._push(jYa.write, n, t) : this._push(vRo, 1, 0);
    };
    T_.prototype.fork = function () {
      this.states = new u7p(this);
      this.head = this.tail = new F8t(ERo, 0, 0);
      this.len = 0;
      return this;
    };
    T_.prototype.reset = function () {
      if (this.states) {
        this.head = this.states.head;
        this.tail = this.states.tail;
        this.len = this.states.len;
        this.states = this.states.next;
      } else {
        this.head = this.tail = new F8t(ERo, 0, 0);
        this.len = 0;
      }
      return this;
    };
    T_.prototype.ldelim = function () {
      var t = this.head;
      var n = this.tail;
      var r = this.len;
      if (this.reset().uint32(r), r) {
        this.tail.next = t.next;
        this.tail = n;
        this.len += r;
      }
      return this;
    };
    T_.prototype.finish = function () {
      var t = this.head.next;
      var n = this.constructor.alloc(this.len);
      var r = 0;
      while (t) {
        t.fn(t.val, n, r);
        r += t.len;
        t = t.next;
      }
      return n;
    };
    T_._configure = function (e) {
      SRo = e;
      T_.create = qYa();
      SRo._configure();
    };
  });
  var zYa = __commonJS((D7_, VYa) => {
    VYa.exports = Gpe;
    var GYa = E8n();
    (Gpe.prototype = Object.create(GYa.prototype)).constructor = Gpe;
    var r1e = Wpe();
    function Gpe() {
      GYa.call(this);
    }
    Gpe._configure = function () {
      Gpe.alloc = r1e._Buffer_allocUnsafe;
      Gpe.writeBytesBuffer = r1e.Buffer && r1e.Buffer.prototype instanceof Uint8Array && r1e.Buffer.prototype.set.name === "set" ? function (t, n, r) {
        n.set(t, r);
      } : function (t, n, r) {
        if (t.copy) {
          t.copy(n, r, 0, t.length);
        } else {
          for (var o = 0; o < t.length;) {
            n[r++] = t[o++];
          }
        }
      };
    };
    Gpe.prototype.bytes = function (t) {
      if (r1e.isString(t)) {
        t = r1e._Buffer_from(t, "base64");
      }
      var n = t.length >>> 0;
      if (this.uint32(n), n) {
        this._push(Gpe.writeBytesBuffer, n, t);
      }
      return this;
    };
    function m7p(e, t, n) {
      if (e.length < 40) {
        r1e.utf8.write(e, t, n);
      } else if (t.utf8Write) {
        t.utf8Write(e, n);
      } else {
        t.write(e, n);
      }
    }
    Gpe.prototype.string = function (t) {
      var n = r1e.Buffer.byteLength(t);
      if (this.uint32(n), n) {
        this._push(m7p, n, t);
      }
      return this;
    };
    Gpe._configure();
  });
  var w8n = __commonJS((M7_, QYa) => {
    QYa.exports = aA;
    var OQ = Wpe();
    var xRo;
    var JYa = OQ.LongBits;
    var f7p = OQ.utf8;
    function ese(e, t) {
      return RangeError("index out of range: " + e.pos + " + " + (t || 1) + " > " + e.len);
    }
    function aA(e) {
      this.buf = e;
      this.pos = 0;
      this.len = e.length;
    }
    var KYa = typeof Uint8Array < "u" ? function (t) {
      if (t instanceof Uint8Array || Array.isArray(t)) {
        return new aA(t);
      }
      throw Error("illegal buffer");
    } : function (t) {
      if (Array.isArray(t)) {
        return new aA(t);
      }
      throw Error("illegal buffer");
    };
    var XYa = function () {
      return OQ.Buffer ? function (n) {
        return (aA.create = function (o) {
          return OQ.Buffer.isBuffer(o) ? new xRo(o) : KYa(o);
        })(n);
      } : KYa;
    };
    aA.create = XYa();
    aA.prototype._slice = OQ.Array.prototype.subarray || OQ.Array.prototype.slice;
    aA.prototype.uint32 = function () {
      var t = 4294967295;
      return function () {
        if (t = (this.buf[this.pos] & 127) >>> 0, this.buf[this.pos++] < 128) {
          return t;
        }
        if (t = (t | (this.buf[this.pos] & 127) << 7) >>> 0, this.buf[this.pos++] < 128) {
          return t;
        }
        if (t = (t | (this.buf[this.pos] & 127) << 14) >>> 0, this.buf[this.pos++] < 128) {
          return t;
        }
        if (t = (t | (this.buf[this.pos] & 127) << 21) >>> 0, this.buf[this.pos++] < 128) {
          return t;
        }
        if (t = (t | (this.buf[this.pos] & 15) << 28) >>> 0, this.buf[this.pos++] < 128) {
          return t;
        }
        if ((this.pos += 5) > this.len) {
          throw this.pos = this.len, ese(this, 10);
        }
        return t;
      };
    }();
    aA.prototype.int32 = function () {
      return this.uint32() | 0;
    };
    aA.prototype.sint32 = function () {
      var t = this.uint32();
      return t >>> 1 ^ -(t & 1) | 0;
    };
    function RRo() {
      var e = new JYa(0, 0);
      var t = 0;
      if (this.len - this.pos > 4) {
        for (; t < 4; ++t) {
          if (e.lo = (e.lo | (this.buf[this.pos] & 127) << t * 7) >>> 0, this.buf[this.pos++] < 128) {
            return e;
          }
        }
        if (e.lo = (e.lo | (this.buf[this.pos] & 127) << 28) >>> 0, e.hi = (e.hi | (this.buf[this.pos] & 127) >> 4) >>> 0, this.buf[this.pos++] < 128) {
          return e;
        }
        t = 0;
      } else {
        for (; t < 3; ++t) {
          if (this.pos >= this.len) {
            throw ese(this);
          }
          if (e.lo = (e.lo | (this.buf[this.pos] & 127) << t * 7) >>> 0, this.buf[this.pos++] < 128) {
            return e;
          }
        }
        e.lo = (e.lo | (this.buf[this.pos++] & 127) << t * 7) >>> 0;
        return e;
      }
      if (this.len - this.pos > 4) {
        for (; t < 5; ++t) {
          if (e.hi = (e.hi | (this.buf[this.pos] & 127) << t * 7 + 3) >>> 0, this.buf[this.pos++] < 128) {
            return e;
          }
        }
      } else {
        for (; t < 5; ++t) {
          if (this.pos >= this.len) {
            throw ese(this);
          }
          if (e.hi = (e.hi | (this.buf[this.pos] & 127) << t * 7 + 3) >>> 0, this.buf[this.pos++] < 128) {
            return e;
          }
        }
      }
      throw Error("invalid varint encoding");
    }
    aA.prototype.bool = function () {
      return this.uint32() !== 0;
    };
    function v8n(e, t) {
      return (e[t - 4] | e[t - 3] << 8 | e[t - 2] << 16 | e[t - 1] << 24) >>> 0;
    }
    aA.prototype.fixed32 = function () {
      if (this.pos + 4 > this.len) {
        throw ese(this, 4);
      }
      return v8n(this.buf, this.pos += 4);
    };
    aA.prototype.sfixed32 = function () {
      if (this.pos + 4 > this.len) {
        throw ese(this, 4);
      }
      return v8n(this.buf, this.pos += 4) | 0;
    };
    function YYa() {
      if (this.pos + 8 > this.len) {
        throw ese(this, 8);
      }
      return new JYa(v8n(this.buf, this.pos += 4), v8n(this.buf, this.pos += 4));
    }
    aA.prototype.float = function () {
      if (this.pos + 4 > this.len) {
        throw ese(this, 4);
      }
      var t = OQ.float.readFloatLE(this.buf, this.pos);
      this.pos += 4;
      return t;
    };
    aA.prototype.double = function () {
      if (this.pos + 8 > this.len) {
        throw ese(this, 4);
      }
      var t = OQ.float.readDoubleLE(this.buf, this.pos);
      this.pos += 8;
      return t;
    };
    aA.prototype.bytes = function () {
      var t = this.uint32();
      var n = this.pos;
      var r = this.pos + t;
      if (r > this.len) {
        throw ese(this, t);
      }
      if (this.pos += t, Array.isArray(this.buf)) {
        return this.buf.slice(n, r);
      }
      if (n === r) {
        var o = OQ.Buffer;
        return o ? o.alloc(0) : new this.buf.constructor(0);
      }
      return this._slice.call(this.buf, n, r);
    };
    aA.prototype.string = function () {
      var t = this.bytes();
      return f7p.read(t, 0, t.length);
    };
    aA.prototype.skip = function (t) {
      if (typeof t === "number") {
        if (this.pos + t > this.len) {
          throw ese(this, t);
        }
        this.pos += t;
      } else {
        do {
          if (this.pos >= this.len) {
            throw ese(this);
          }
        } while (this.buf[this.pos++] & 128);
      }
      return this;
    };
    aA.recursionLimit = OQ.recursionLimit;
    aA.prototype.skipType = function (e, t) {
      if (t === undefined) {
        t = 0;
      }
      if (t > aA.recursionLimit) {
        throw Error("maximum nesting depth exceeded");
      }
      switch (e) {
        case 0:
          this.skip();
          break;
        case 1:
          this.skip(8);
          break;
        case 2:
          this.skip(this.uint32());
          break;
        case 3:
          while ((e = this.uint32() & 7) !== 4) {
            this.skipType(e, t + 1);
          }
          break;
        case 5:
          this.skip(4);
          break;
        default:
          throw Error("invalid wire type " + e + " at offset " + this.pos);
      }
      return this;
    };
    aA._configure = function (e) {
      xRo = e;
      aA.create = XYa();
      xRo._configure();
      var t = OQ.Long ? "toLong" : "toNumber";
      OQ.merge(aA.prototype, {
        int64: function () {
          return RRo.call(this)[t](false);
        },
        uint64: function () {
          return RRo.call(this)[t](true);
        },
        sint64: function () {
          return RRo.call(this).zzDecode()[t](false);
        },
        fixed64: function () {
          return YYa.call(this)[t](true);
        },
        sfixed64: function () {
          return YYa.call(this)[t](false);
        }
      });
    };
  });
  var nJa = __commonJS((N7_, tJa) => {
    tJa.exports = cVe;
    var eJa = w8n();
    (cVe.prototype = Object.create(eJa.prototype)).constructor = cVe;
    var ZYa = Wpe();
    function cVe(e) {
      eJa.call(this, e);
    }
    cVe._configure = function () {
      if (ZYa.Buffer) {
        cVe.prototype._slice = ZYa.Buffer.prototype.slice;
      }
    };
    cVe.prototype.string = function () {
      var t = this.uint32();
      return this.buf.utf8Slice ? this.buf.utf8Slice(this.pos, this.pos = Math.min(this.pos + t, this.len)) : this.buf.toString("utf-8", this.pos, this.pos = Math.min(this.pos + t, this.len));
    };
    cVe._configure();
  });
  var oJa = __commonJS((L7_, rJa) => {
    rJa.exports = U8t;
    var kRo = Wpe();
    (U8t.prototype = Object.create(kRo.EventEmitter.prototype)).constructor = U8t;
    function U8t(e, t, n) {
      if (typeof e !== "function") {
        throw TypeError("rpcImpl must be a function");
      }
      kRo.EventEmitter.call(this);
      this.rpcImpl = e;
      this.requestDelimited = Boolean(t);
      this.responseDelimited = Boolean(n);
    }
    U8t.prototype.rpcCall = function e(t, n, r, o, s) {
      if (!o) {
        throw TypeError("request must be specified");
      }
      var i = this;
      if (!s) {
        return kRo.asPromise(e, i, t, n, r, o);
      }
      if (!i.rpcImpl) {
        setTimeout(function () {
          s(Error("already ended"));
        }, 0);
        return;
      }
      try {
        return i.rpcImpl(t, n[i.requestDelimited ? "encodeDelimited" : "encode"](o).finish(), function (l, c) {
          if (l) {
            i.emit("error", l, t);
            return s(l);
          }
          if (c === null) {
            i.end(true);
            return;
          }
          if (!(c instanceof r)) {
            try {
              c = r[i.responseDelimited ? "decodeDelimited" : "decode"](c);
            } catch (u) {
              i.emit("error", u, t);
              return s(u);
            }
          }
          i.emit("data", c, t);
          return s(null, c);
        });
      } catch (a) {
        i.emit("error", a, t);
        setTimeout(function () {
          s(a);
        }, 0);
        return;
      }
    };
    U8t.prototype.end = function (t) {
      if (this.rpcImpl) {
        if (!t) {
          this.rpcImpl(null, null, null);
        }
        this.rpcImpl = null;
        this.emit("end").off();
      }
      return this;
    };
  });
  var ARo = __commonJS(sJa => {
    var h7p = sJa;
    h7p.Service = oJa();
  });
  var IRo = __commonJS((U7_, iJa) => {
    iJa.exports = {};
  });
  var PRo = __commonJS(lJa => {
    var O9 = lJa;
    O9.build = "minimal";
    O9.Writer = E8n();
    O9.BufferWriter = zYa();
    O9.Reader = w8n();
    O9.BufferReader = nJa();
    O9.util = Wpe();
    O9.rpc = ARo();
    O9.roots = IRo();
    O9.configure = aJa;
    function aJa() {
      O9.util._configure();
      O9.Writer._configure(O9.BufferWriter);
      O9.Reader._configure(O9.BufferReader);
    }
    aJa();
  });
  var uJa = __commonJS(($7_, cJa) => {
    cJa.exports = PRo();
  });
  var C8n = __commonJS((dJa, pJa) => {
    Object.defineProperty(dJa, "__esModule", {
      value: true
    });
    var rd = uJa();
    var Jr = rd.Reader;
    var Im = rd.Writer;
    var Lt = rd.util;
    var At = rd.roots.default || (rd.roots.default = {});
    At.opentelemetry = function () {
      var e = {};
      e.proto = function () {
        var t = {};
        t.common = function () {
          var n = {};
          n.v1 = function () {
            var r = {};
            r.AnyValue = function () {
              function o(i) {
                if (i) {
                  for (var a = Object.keys(i), l = 0; l < a.length; ++l) {
                    if (i[a[l]] != null) {
                      this[a[l]] = i[a[l]];
                    }
                  }
                }
              }
              o.prototype.stringValue = null;
              o.prototype.boolValue = null;
              o.prototype.intValue = null;
              o.prototype.doubleValue = null;
              o.prototype.arrayValue = null;
              o.prototype.kvlistValue = null;
              o.prototype.bytesValue = null;
              var s;
              Object.defineProperty(o.prototype, "value", {
                get: Lt.oneOfGetter(s = ["stringValue", "boolValue", "intValue", "doubleValue", "arrayValue", "kvlistValue", "bytesValue"]),
                set: Lt.oneOfSetter(s)
              });
              o.create = function (a) {
                return new o(a);
              };
              o.HS = function (a, l) {
                if (!l) {
                  l = Im.create();
                }
                if (a.stringValue != null && Object.hasOwnProperty.call(a, "stringValue")) {
                  l.uint32(10).string(a.stringValue);
                }
                if (a.boolValue != null && Object.hasOwnProperty.call(a, "boolValue")) {
                  l.uint32(16).bool(a.boolValue);
                }
                if (a.intValue != null && Object.hasOwnProperty.call(a, "intValue")) {
                  l.uint32(24).int64(a.intValue);
                }
                if (a.doubleValue != null && Object.hasOwnProperty.call(a, "doubleValue")) {
                  l.uint32(33).double(a.doubleValue);
                }
                if (a.arrayValue != null && Object.hasOwnProperty.call(a, "arrayValue")) {
                  At.opentelemetry.proto.common.v1.ArrayValue.HS(a.arrayValue, l.uint32(42).fork()).ldelim();
                }
                if (a.kvlistValue != null && Object.hasOwnProperty.call(a, "kvlistValue")) {
                  At.opentelemetry.proto.common.v1.KeyValueList.HS(a.kvlistValue, l.uint32(50).fork()).ldelim();
                }
                if (a.bytesValue != null && Object.hasOwnProperty.call(a, "bytesValue")) {
                  l.uint32(58).bytes(a.bytesValue);
                }
                return l;
              };
              o.encodeDelimited = function (a, l) {
                return this.HS(a, l).ldelim();
              };
              o.oC = function (a, l, c) {
                if (!(a instanceof Jr)) {
                  a = Jr.create(a);
                }
                var u = l === undefined ? a.len : a.pos + l;
                var d = new At.opentelemetry.proto.common.v1.AnyValue();
                while (a.pos < u) {
                  var p = a.uint32();
                  if (p === c) {
                    break;
                  }
                  switch (p >>> 3) {
                    case 1:
                      {
                        d.stringValue = a.string();
                        break;
                      }
                    case 2:
                      {
                        d.boolValue = a.bool();
                        break;
                      }
                    case 3:
                      {
                        d.intValue = a.int64();
                        break;
                      }
                    case 4:
                      {
                        d.doubleValue = a.double();
                        break;
                      }
                    case 5:
                      {
                        d.arrayValue = At.opentelemetry.proto.common.v1.ArrayValue.oC(a, a.uint32());
                        break;
                      }
                    case 6:
                      {
                        d.kvlistValue = At.opentelemetry.proto.common.v1.KeyValueList.oC(a, a.uint32());
                        break;
                      }
                    case 7:
                      {
                        d.bytesValue = a.bytes();
                        break;
                      }
                    default:
                      a.skipType(p & 7);
                      break;
                  }
                }
                return d;
              };
              o.decodeDelimited = function (a) {
                if (!(a instanceof Jr)) {
                  a = new Jr(a);
                }
                return this.oC(a, a.uint32());
              };
              o.verify = function (a) {
                if (typeof a !== "object" || a === null) {
                  return "object expected";
                }
                var l = {};
                if (a.stringValue != null && a.hasOwnProperty("stringValue")) {
                  if (l.value = 1, !Lt.isString(a.stringValue)) {
                    return "stringValue: string expected";
                  }
                }
                if (a.boolValue != null && a.hasOwnProperty("boolValue")) {
                  if (l.value === 1) {
                    return "value: multiple values";
                  }
                  if (l.value = 1, typeof a.boolValue !== "boolean") {
                    return "boolValue: boolean expected";
                  }
                }
                if (a.intValue != null && a.hasOwnProperty("intValue")) {
                  if (l.value === 1) {
                    return "value: multiple values";
                  }
                  if (l.value = 1, !Lt.isInteger(a.intValue) && !(a.intValue && Lt.isInteger(a.intValue.low) && Lt.isInteger(a.intValue.high))) {
                    return "intValue: integer|Long expected";
                  }
                }
                if (a.doubleValue != null && a.hasOwnProperty("doubleValue")) {
                  if (l.value === 1) {
                    return "value: multiple values";
                  }
                  if (l.value = 1, typeof a.doubleValue !== "number") {
                    return "doubleValue: number expected";
                  }
                }
                if (a.arrayValue != null && a.hasOwnProperty("arrayValue")) {
                  if (l.value === 1) {
                    return "value: multiple values";
                  }
                  l.value = 1;
                  {
                    var c = At.opentelemetry.proto.common.v1.ArrayValue.verify(a.arrayValue);
                    if (c) {
                      return "arrayValue." + c;
                    }
                  }
                }
                if (a.kvlistValue != null && a.hasOwnProperty("kvlistValue")) {
                  if (l.value === 1) {
                    return "value: multiple values";
                  }
                  l.value = 1;
                  {
                    var c = At.opentelemetry.proto.common.v1.KeyValueList.verify(a.kvlistValue);
                    if (c) {
                      return "kvlistValue." + c;
                    }
                  }
                }
                if (a.bytesValue != null && a.hasOwnProperty("bytesValue")) {
                  if (l.value === 1) {
                    return "value: multiple values";
                  }
                  if (l.value = 1, !(a.bytesValue && typeof a.bytesValue.length === "number" || Lt.isString(a.bytesValue))) {
                    return "bytesValue: buffer expected";
                  }
                }
                return null;
              };
              o.fromObject = function (a) {
                if (a instanceof At.opentelemetry.proto.common.v1.AnyValue) {
                  return a;
                }
                var l = new At.opentelemetry.proto.common.v1.AnyValue();
                if (a.stringValue != null) {
                  l.stringValue = String(a.stringValue);
                }
                if (a.boolValue != null) {
                  l.boolValue = Boolean(a.boolValue);
                }
                if (a.intValue != null) {
                  if (Lt.Long) {
                    (l.intValue = Lt.Long.fromValue(a.intValue)).unsigned = false;
                  } else if (typeof a.intValue === "string") {
                    l.intValue = parseInt(a.intValue, 10);
                  } else if (typeof a.intValue === "number") {
                    l.intValue = a.intValue;
                  } else if (typeof a.intValue === "object") {
                    l.intValue = new Lt.LongBits(a.intValue.low >>> 0, a.intValue.high >>> 0).toNumber();
                  }
                }
                if (a.doubleValue != null) {
                  l.doubleValue = Number(a.doubleValue);
                }
                if (a.arrayValue != null) {
                  if (typeof a.arrayValue !== "object") {
                    throw TypeError(".opentelemetry.proto.common.v1.AnyValue.arrayValue: object expected");
                  }
                  l.arrayValue = At.opentelemetry.proto.common.v1.ArrayValue.fromObject(a.arrayValue);
                }
                if (a.kvlistValue != null) {
                  if (typeof a.kvlistValue !== "object") {
                    throw TypeError(".opentelemetry.proto.common.v1.AnyValue.kvlistValue: object expected");
                  }
                  l.kvlistValue = At.opentelemetry.proto.common.v1.KeyValueList.fromObject(a.kvlistValue);
                }
                if (a.bytesValue != null) {
                  if (typeof a.bytesValue === "string") {
                    Lt.base64.oC(a.bytesValue, l.bytesValue = Lt.newBuffer(Lt.base64.length(a.bytesValue)), 0);
                  } else if (a.bytesValue.length >= 0) {
                    l.bytesValue = a.bytesValue;
                  }
                }
                return l;
              };
              o.toObject = function (a, l) {
                if (!l) {
                  l = {};
                }
                var c = {};
                if (a.stringValue != null && a.hasOwnProperty("stringValue")) {
                  if (c.stringValue = a.stringValue, l.oneofs) {
                    c.value = "stringValue";
                  }
                }
                if (a.boolValue != null && a.hasOwnProperty("boolValue")) {
                  if (c.boolValue = a.boolValue, l.oneofs) {
                    c.value = "boolValue";
                  }
                }
                if (a.intValue != null && a.hasOwnProperty("intValue")) {
                  if (typeof a.intValue === "number") {
                    c.intValue = l.longs === String ? String(a.intValue) : a.intValue;
                  } else {
                    c.intValue = l.longs === String ? Lt.Long.prototype.toString.call(a.intValue) : l.longs === Number ? new Lt.LongBits(a.intValue.low >>> 0, a.intValue.high >>> 0).toNumber() : a.intValue;
                  }
                  if (l.oneofs) {
                    c.value = "intValue";
                  }
                }
                if (a.doubleValue != null && a.hasOwnProperty("doubleValue")) {
                  if (c.doubleValue = l.json && !isFinite(a.doubleValue) ? String(a.doubleValue) : a.doubleValue, l.oneofs) {
                    c.value = "doubleValue";
                  }
                }
                if (a.arrayValue != null && a.hasOwnProperty("arrayValue")) {
                  if (c.arrayValue = At.opentelemetry.proto.common.v1.ArrayValue.toObject(a.arrayValue, l), l.oneofs) {
                    c.value = "arrayValue";
                  }
                }
                if (a.kvlistValue != null && a.hasOwnProperty("kvlistValue")) {
                  if (c.kvlistValue = At.opentelemetry.proto.common.v1.KeyValueList.toObject(a.kvlistValue, l), l.oneofs) {
                    c.value = "kvlistValue";
                  }
                }
                if (a.bytesValue != null && a.hasOwnProperty("bytesValue")) {
                  if (c.bytesValue = l.bytes === String ? Lt.base64.HS(a.bytesValue, 0, a.bytesValue.length) : l.bytes === Array ? Array.prototype.slice.call(a.bytesValue) : a.bytesValue, l.oneofs) {
                    c.value = "bytesValue";
                  }
                }
                return c;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (a) {
                if (a === undefined) {
                  a = "type.googleapis.com";
                }
                return a + "/opentelemetry.proto.common.v1.AnyValue";
              };
              return o;
            }();
            r.ArrayValue = function () {
              function o(s) {
                if (this.values = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.values = Lt.emptyArray;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.values != null && i.values.length) {
                  for (var l = 0; l < i.values.length; ++l) {
                    At.opentelemetry.proto.common.v1.AnyValue.HS(i.values[l], a.uint32(10).fork()).ldelim();
                  }
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.common.v1.ArrayValue();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        if (!(u.values && u.values.length)) {
                          u.values = [];
                        }
                        u.values.push(At.opentelemetry.proto.common.v1.AnyValue.oC(i, i.uint32()));
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.values != null && i.hasOwnProperty("values")) {
                  if (!Array.isArray(i.values)) {
                    return "values: array expected";
                  }
                  for (var a = 0; a < i.values.length; ++a) {
                    var l = At.opentelemetry.proto.common.v1.AnyValue.verify(i.values[a]);
                    if (l) {
                      return "values." + l;
                    }
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.common.v1.ArrayValue) {
                  return i;
                }
                var a = new At.opentelemetry.proto.common.v1.ArrayValue();
                if (i.values) {
                  if (!Array.isArray(i.values)) {
                    throw TypeError(".opentelemetry.proto.common.v1.ArrayValue.values: array expected");
                  }
                  a.values = [];
                  for (var l = 0; l < i.values.length; ++l) {
                    if (typeof i.values[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.common.v1.ArrayValue.values: object expected");
                    }
                    a.values[l] = At.opentelemetry.proto.common.v1.AnyValue.fromObject(i.values[l]);
                  }
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.values = [];
                }
                if (i.values && i.values.length) {
                  l.values = [];
                  for (var c = 0; c < i.values.length; ++c) {
                    l.values[c] = At.opentelemetry.proto.common.v1.AnyValue.toObject(i.values[c], a);
                  }
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.common.v1.ArrayValue";
              };
              return o;
            }();
            r.KeyValueList = function () {
              function o(s) {
                if (this.values = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.values = Lt.emptyArray;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.values != null && i.values.length) {
                  for (var l = 0; l < i.values.length; ++l) {
                    At.opentelemetry.proto.common.v1.KeyValue.HS(i.values[l], a.uint32(10).fork()).ldelim();
                  }
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.common.v1.KeyValueList();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        if (!(u.values && u.values.length)) {
                          u.values = [];
                        }
                        u.values.push(At.opentelemetry.proto.common.v1.KeyValue.oC(i, i.uint32()));
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.values != null && i.hasOwnProperty("values")) {
                  if (!Array.isArray(i.values)) {
                    return "values: array expected";
                  }
                  for (var a = 0; a < i.values.length; ++a) {
                    var l = At.opentelemetry.proto.common.v1.KeyValue.verify(i.values[a]);
                    if (l) {
                      return "values." + l;
                    }
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.common.v1.KeyValueList) {
                  return i;
                }
                var a = new At.opentelemetry.proto.common.v1.KeyValueList();
                if (i.values) {
                  if (!Array.isArray(i.values)) {
                    throw TypeError(".opentelemetry.proto.common.v1.KeyValueList.values: array expected");
                  }
                  a.values = [];
                  for (var l = 0; l < i.values.length; ++l) {
                    if (typeof i.values[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.common.v1.KeyValueList.values: object expected");
                    }
                    a.values[l] = At.opentelemetry.proto.common.v1.KeyValue.fromObject(i.values[l]);
                  }
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.values = [];
                }
                if (i.values && i.values.length) {
                  l.values = [];
                  for (var c = 0; c < i.values.length; ++c) {
                    l.values[c] = At.opentelemetry.proto.common.v1.KeyValue.toObject(i.values[c], a);
                  }
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.common.v1.KeyValueList";
              };
              return o;
            }();
            r.KeyValue = function () {
              function o(s) {
                if (s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.key = null;
              o.prototype.value = null;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.key != null && Object.hasOwnProperty.call(i, "key")) {
                  a.uint32(10).string(i.key);
                }
                if (i.value != null && Object.hasOwnProperty.call(i, "value")) {
                  At.opentelemetry.proto.common.v1.AnyValue.HS(i.value, a.uint32(18).fork()).ldelim();
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.common.v1.KeyValue();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        u.key = i.string();
                        break;
                      }
                    case 2:
                      {
                        u.value = At.opentelemetry.proto.common.v1.AnyValue.oC(i, i.uint32());
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.key != null && i.hasOwnProperty("key")) {
                  if (!Lt.isString(i.key)) {
                    return "key: string expected";
                  }
                }
                if (i.value != null && i.hasOwnProperty("value")) {
                  var a = At.opentelemetry.proto.common.v1.AnyValue.verify(i.value);
                  if (a) {
                    return "value." + a;
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.common.v1.KeyValue) {
                  return i;
                }
                var a = new At.opentelemetry.proto.common.v1.KeyValue();
                if (i.key != null) {
                  a.key = String(i.key);
                }
                if (i.value != null) {
                  if (typeof i.value !== "object") {
                    throw TypeError(".opentelemetry.proto.common.v1.KeyValue.value: object expected");
                  }
                  a.value = At.opentelemetry.proto.common.v1.AnyValue.fromObject(i.value);
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.defaults) {
                  l.key = "";
                  l.value = null;
                }
                if (i.key != null && i.hasOwnProperty("key")) {
                  l.key = i.key;
                }
                if (i.value != null && i.hasOwnProperty("value")) {
                  l.value = At.opentelemetry.proto.common.v1.AnyValue.toObject(i.value, a);
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.common.v1.KeyValue";
              };
              return o;
            }();
            r.InstrumentationScope = function () {
              function o(s) {
                if (this.attributes = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.name = null;
              o.prototype.version = null;
              o.prototype.attributes = Lt.emptyArray;
              o.prototype.droppedAttributesCount = null;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.name != null && Object.hasOwnProperty.call(i, "name")) {
                  a.uint32(10).string(i.name);
                }
                if (i.version != null && Object.hasOwnProperty.call(i, "version")) {
                  a.uint32(18).string(i.version);
                }
                if (i.attributes != null && i.attributes.length) {
                  for (var l = 0; l < i.attributes.length; ++l) {
                    At.opentelemetry.proto.common.v1.KeyValue.HS(i.attributes[l], a.uint32(26).fork()).ldelim();
                  }
                }
                if (i.droppedAttributesCount != null && Object.hasOwnProperty.call(i, "droppedAttributesCount")) {
                  a.uint32(32).uint32(i.droppedAttributesCount);
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.common.v1.InstrumentationScope();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        u.name = i.string();
                        break;
                      }
                    case 2:
                      {
                        u.version = i.string();
                        break;
                      }
                    case 3:
                      {
                        if (!(u.attributes && u.attributes.length)) {
                          u.attributes = [];
                        }
                        u.attributes.push(At.opentelemetry.proto.common.v1.KeyValue.oC(i, i.uint32()));
                        break;
                      }
                    case 4:
                      {
                        u.droppedAttributesCount = i.uint32();
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.name != null && i.hasOwnProperty("name")) {
                  if (!Lt.isString(i.name)) {
                    return "name: string expected";
                  }
                }
                if (i.version != null && i.hasOwnProperty("version")) {
                  if (!Lt.isString(i.version)) {
                    return "version: string expected";
                  }
                }
                if (i.attributes != null && i.hasOwnProperty("attributes")) {
                  if (!Array.isArray(i.attributes)) {
                    return "attributes: array expected";
                  }
                  for (var a = 0; a < i.attributes.length; ++a) {
                    var l = At.opentelemetry.proto.common.v1.KeyValue.verify(i.attributes[a]);
                    if (l) {
                      return "attributes." + l;
                    }
                  }
                }
                if (i.droppedAttributesCount != null && i.hasOwnProperty("droppedAttributesCount")) {
                  if (!Lt.isInteger(i.droppedAttributesCount)) {
                    return "droppedAttributesCount: integer expected";
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.common.v1.InstrumentationScope) {
                  return i;
                }
                var a = new At.opentelemetry.proto.common.v1.InstrumentationScope();
                if (i.name != null) {
                  a.name = String(i.name);
                }
                if (i.version != null) {
                  a.version = String(i.version);
                }
                if (i.attributes) {
                  if (!Array.isArray(i.attributes)) {
                    throw TypeError(".opentelemetry.proto.common.v1.InstrumentationScope.attributes: array expected");
                  }
                  a.attributes = [];
                  for (var l = 0; l < i.attributes.length; ++l) {
                    if (typeof i.attributes[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.common.v1.InstrumentationScope.attributes: object expected");
                    }
                    a.attributes[l] = At.opentelemetry.proto.common.v1.KeyValue.fromObject(i.attributes[l]);
                  }
                }
                if (i.droppedAttributesCount != null) {
                  a.droppedAttributesCount = i.droppedAttributesCount >>> 0;
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.attributes = [];
                }
                if (a.defaults) {
                  l.name = "";
                  l.version = "";
                  l.droppedAttributesCount = 0;
                }
                if (i.name != null && i.hasOwnProperty("name")) {
                  l.name = i.name;
                }
                if (i.version != null && i.hasOwnProperty("version")) {
                  l.version = i.version;
                }
                if (i.attributes && i.attributes.length) {
                  l.attributes = [];
                  for (var c = 0; c < i.attributes.length; ++c) {
                    l.attributes[c] = At.opentelemetry.proto.common.v1.KeyValue.toObject(i.attributes[c], a);
                  }
                }
                if (i.droppedAttributesCount != null && i.hasOwnProperty("droppedAttributesCount")) {
                  l.droppedAttributesCount = i.droppedAttributesCount;
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.common.v1.InstrumentationScope";
              };
              return o;
            }();
            r.EntityRef = function () {
              function o(s) {
                if (this.idKeys = [], this.descriptionKeys = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.schemaUrl = null;
              o.prototype.type = null;
              o.prototype.idKeys = Lt.emptyArray;
              o.prototype.descriptionKeys = Lt.emptyArray;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.schemaUrl != null && Object.hasOwnProperty.call(i, "schemaUrl")) {
                  a.uint32(10).string(i.schemaUrl);
                }
                if (i.type != null && Object.hasOwnProperty.call(i, "type")) {
                  a.uint32(18).string(i.type);
                }
                if (i.idKeys != null && i.idKeys.length) {
                  for (var l = 0; l < i.idKeys.length; ++l) {
                    a.uint32(26).string(i.idKeys[l]);
                  }
                }
                if (i.descriptionKeys != null && i.descriptionKeys.length) {
                  for (var l = 0; l < i.descriptionKeys.length; ++l) {
                    a.uint32(34).string(i.descriptionKeys[l]);
                  }
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.common.v1.EntityRef();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        u.schemaUrl = i.string();
                        break;
                      }
                    case 2:
                      {
                        u.type = i.string();
                        break;
                      }
                    case 3:
                      {
                        if (!(u.idKeys && u.idKeys.length)) {
                          u.idKeys = [];
                        }
                        u.idKeys.push(i.string());
                        break;
                      }
                    case 4:
                      {
                        if (!(u.descriptionKeys && u.descriptionKeys.length)) {
                          u.descriptionKeys = [];
                        }
                        u.descriptionKeys.push(i.string());
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.schemaUrl != null && i.hasOwnProperty("schemaUrl")) {
                  if (!Lt.isString(i.schemaUrl)) {
                    return "schemaUrl: string expected";
                  }
                }
                if (i.type != null && i.hasOwnProperty("type")) {
                  if (!Lt.isString(i.type)) {
                    return "type: string expected";
                  }
                }
                if (i.idKeys != null && i.hasOwnProperty("idKeys")) {
                  if (!Array.isArray(i.idKeys)) {
                    return "idKeys: array expected";
                  }
                  for (var a = 0; a < i.idKeys.length; ++a) {
                    if (!Lt.isString(i.idKeys[a])) {
                      return "idKeys: string[] expected";
                    }
                  }
                }
                if (i.descriptionKeys != null && i.hasOwnProperty("descriptionKeys")) {
                  if (!Array.isArray(i.descriptionKeys)) {
                    return "descriptionKeys: array expected";
                  }
                  for (var a = 0; a < i.descriptionKeys.length; ++a) {
                    if (!Lt.isString(i.descriptionKeys[a])) {
                      return "descriptionKeys: string[] expected";
                    }
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.common.v1.EntityRef) {
                  return i;
                }
                var a = new At.opentelemetry.proto.common.v1.EntityRef();
                if (i.schemaUrl != null) {
                  a.schemaUrl = String(i.schemaUrl);
                }
                if (i.type != null) {
                  a.type = String(i.type);
                }
                if (i.idKeys) {
                  if (!Array.isArray(i.idKeys)) {
                    throw TypeError(".opentelemetry.proto.common.v1.EntityRef.idKeys: array expected");
                  }
                  a.idKeys = [];
                  for (var l = 0; l < i.idKeys.length; ++l) {
                    a.idKeys[l] = String(i.idKeys[l]);
                  }
                }
                if (i.descriptionKeys) {
                  if (!Array.isArray(i.descriptionKeys)) {
                    throw TypeError(".opentelemetry.proto.common.v1.EntityRef.descriptionKeys: array expected");
                  }
                  a.descriptionKeys = [];
                  for (var l = 0; l < i.descriptionKeys.length; ++l) {
                    a.descriptionKeys[l] = String(i.descriptionKeys[l]);
                  }
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.idKeys = [];
                  l.descriptionKeys = [];
                }
                if (a.defaults) {
                  l.schemaUrl = "";
                  l.type = "";
                }
                if (i.schemaUrl != null && i.hasOwnProperty("schemaUrl")) {
                  l.schemaUrl = i.schemaUrl;
                }
                if (i.type != null && i.hasOwnProperty("type")) {
                  l.type = i.type;
                }
                if (i.idKeys && i.idKeys.length) {
                  l.idKeys = [];
                  for (var c = 0; c < i.idKeys.length; ++c) {
                    l.idKeys[c] = i.idKeys[c];
                  }
                }
                if (i.descriptionKeys && i.descriptionKeys.length) {
                  l.descriptionKeys = [];
                  for (var c = 0; c < i.descriptionKeys.length; ++c) {
                    l.descriptionKeys[c] = i.descriptionKeys[c];
                  }
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.common.v1.EntityRef";
              };
              return o;
            }();
            return r;
          }();
          return n;
        }();
        t.resource = function () {
          var n = {};
          n.v1 = function () {
            var r = {};
            r.Resource = function () {
              function o(s) {
                if (this.attributes = [], this.entityRefs = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.attributes = Lt.emptyArray;
              o.prototype.droppedAttributesCount = null;
              o.prototype.entityRefs = Lt.emptyArray;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.attributes != null && i.attributes.length) {
                  for (var l = 0; l < i.attributes.length; ++l) {
                    At.opentelemetry.proto.common.v1.KeyValue.HS(i.attributes[l], a.uint32(10).fork()).ldelim();
                  }
                }
                if (i.droppedAttributesCount != null && Object.hasOwnProperty.call(i, "droppedAttributesCount")) {
                  a.uint32(16).uint32(i.droppedAttributesCount);
                }
                if (i.entityRefs != null && i.entityRefs.length) {
                  for (var l = 0; l < i.entityRefs.length; ++l) {
                    At.opentelemetry.proto.common.v1.EntityRef.HS(i.entityRefs[l], a.uint32(26).fork()).ldelim();
                  }
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.resource.v1.Resource();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        if (!(u.attributes && u.attributes.length)) {
                          u.attributes = [];
                        }
                        u.attributes.push(At.opentelemetry.proto.common.v1.KeyValue.oC(i, i.uint32()));
                        break;
                      }
                    case 2:
                      {
                        u.droppedAttributesCount = i.uint32();
                        break;
                      }
                    case 3:
                      {
                        if (!(u.entityRefs && u.entityRefs.length)) {
                          u.entityRefs = [];
                        }
                        u.entityRefs.push(At.opentelemetry.proto.common.v1.EntityRef.oC(i, i.uint32()));
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.attributes != null && i.hasOwnProperty("attributes")) {
                  if (!Array.isArray(i.attributes)) {
                    return "attributes: array expected";
                  }
                  for (var a = 0; a < i.attributes.length; ++a) {
                    var l = At.opentelemetry.proto.common.v1.KeyValue.verify(i.attributes[a]);
                    if (l) {
                      return "attributes." + l;
                    }
                  }
                }
                if (i.droppedAttributesCount != null && i.hasOwnProperty("droppedAttributesCount")) {
                  if (!Lt.isInteger(i.droppedAttributesCount)) {
                    return "droppedAttributesCount: integer expected";
                  }
                }
                if (i.entityRefs != null && i.hasOwnProperty("entityRefs")) {
                  if (!Array.isArray(i.entityRefs)) {
                    return "entityRefs: array expected";
                  }
                  for (var a = 0; a < i.entityRefs.length; ++a) {
                    var l = At.opentelemetry.proto.common.v1.EntityRef.verify(i.entityRefs[a]);
                    if (l) {
                      return "entityRefs." + l;
                    }
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.resource.v1.Resource) {
                  return i;
                }
                var a = new At.opentelemetry.proto.resource.v1.Resource();
                if (i.attributes) {
                  if (!Array.isArray(i.attributes)) {
                    throw TypeError(".opentelemetry.proto.resource.v1.Resource.attributes: array expected");
                  }
                  a.attributes = [];
                  for (var l = 0; l < i.attributes.length; ++l) {
                    if (typeof i.attributes[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.resource.v1.Resource.attributes: object expected");
                    }
                    a.attributes[l] = At.opentelemetry.proto.common.v1.KeyValue.fromObject(i.attributes[l]);
                  }
                }
                if (i.droppedAttributesCount != null) {
                  a.droppedAttributesCount = i.droppedAttributesCount >>> 0;
                }
                if (i.entityRefs) {
                  if (!Array.isArray(i.entityRefs)) {
                    throw TypeError(".opentelemetry.proto.resource.v1.Resource.entityRefs: array expected");
                  }
                  a.entityRefs = [];
                  for (var l = 0; l < i.entityRefs.length; ++l) {
                    if (typeof i.entityRefs[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.resource.v1.Resource.entityRefs: object expected");
                    }
                    a.entityRefs[l] = At.opentelemetry.proto.common.v1.EntityRef.fromObject(i.entityRefs[l]);
                  }
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.attributes = [];
                  l.entityRefs = [];
                }
                if (a.defaults) {
                  l.droppedAttributesCount = 0;
                }
                if (i.attributes && i.attributes.length) {
                  l.attributes = [];
                  for (var c = 0; c < i.attributes.length; ++c) {
                    l.attributes[c] = At.opentelemetry.proto.common.v1.KeyValue.toObject(i.attributes[c], a);
                  }
                }
                if (i.droppedAttributesCount != null && i.hasOwnProperty("droppedAttributesCount")) {
                  l.droppedAttributesCount = i.droppedAttributesCount;
                }
                if (i.entityRefs && i.entityRefs.length) {
                  l.entityRefs = [];
                  for (var c = 0; c < i.entityRefs.length; ++c) {
                    l.entityRefs[c] = At.opentelemetry.proto.common.v1.EntityRef.toObject(i.entityRefs[c], a);
                  }
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.resource.v1.Resource";
              };
              return o;
            }();
            return r;
          }();
          return n;
        }();
        t.trace = function () {
          var n = {};
          n.v1 = function () {
            var r = {};
            r.TracesData = function () {
              function o(s) {
                if (this.resourceSpans = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.resourceSpans = Lt.emptyArray;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.resourceSpans != null && i.resourceSpans.length) {
                  for (var l = 0; l < i.resourceSpans.length; ++l) {
                    At.opentelemetry.proto.trace.v1.ResourceSpans.HS(i.resourceSpans[l], a.uint32(10).fork()).ldelim();
                  }
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.trace.v1.TracesData();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        if (!(u.resourceSpans && u.resourceSpans.length)) {
                          u.resourceSpans = [];
                        }
                        u.resourceSpans.push(At.opentelemetry.proto.trace.v1.ResourceSpans.oC(i, i.uint32()));
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.resourceSpans != null && i.hasOwnProperty("resourceSpans")) {
                  if (!Array.isArray(i.resourceSpans)) {
                    return "resourceSpans: array expected";
                  }
                  for (var a = 0; a < i.resourceSpans.length; ++a) {
                    var l = At.opentelemetry.proto.trace.v1.ResourceSpans.verify(i.resourceSpans[a]);
                    if (l) {
                      return "resourceSpans." + l;
                    }
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.trace.v1.TracesData) {
                  return i;
                }
                var a = new At.opentelemetry.proto.trace.v1.TracesData();
                if (i.resourceSpans) {
                  if (!Array.isArray(i.resourceSpans)) {
                    throw TypeError(".opentelemetry.proto.trace.v1.TracesData.resourceSpans: array expected");
                  }
                  a.resourceSpans = [];
                  for (var l = 0; l < i.resourceSpans.length; ++l) {
                    if (typeof i.resourceSpans[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.trace.v1.TracesData.resourceSpans: object expected");
                    }
                    a.resourceSpans[l] = At.opentelemetry.proto.trace.v1.ResourceSpans.fromObject(i.resourceSpans[l]);
                  }
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.resourceSpans = [];
                }
                if (i.resourceSpans && i.resourceSpans.length) {
                  l.resourceSpans = [];
                  for (var c = 0; c < i.resourceSpans.length; ++c) {
                    l.resourceSpans[c] = At.opentelemetry.proto.trace.v1.ResourceSpans.toObject(i.resourceSpans[c], a);
                  }
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.trace.v1.TracesData";
              };
              return o;
            }();
            r.ResourceSpans = function () {
              function o(s) {
                if (this.scopeSpans = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.resource = null;
              o.prototype.scopeSpans = Lt.emptyArray;
              o.prototype.schemaUrl = null;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.resource != null && Object.hasOwnProperty.call(i, "resource")) {
                  At.opentelemetry.proto.resource.v1.Resource.HS(i.resource, a.uint32(10).fork()).ldelim();
                }
                if (i.scopeSpans != null && i.scopeSpans.length) {
                  for (var l = 0; l < i.scopeSpans.length; ++l) {
                    At.opentelemetry.proto.trace.v1.ScopeSpans.HS(i.scopeSpans[l], a.uint32(18).fork()).ldelim();
                  }
                }
                if (i.schemaUrl != null && Object.hasOwnProperty.call(i, "schemaUrl")) {
                  a.uint32(26).string(i.schemaUrl);
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.trace.v1.ResourceSpans();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        u.resource = At.opentelemetry.proto.resource.v1.Resource.oC(i, i.uint32());
                        break;
                      }
                    case 2:
                      {
                        if (!(u.scopeSpans && u.scopeSpans.length)) {
                          u.scopeSpans = [];
                        }
                        u.scopeSpans.push(At.opentelemetry.proto.trace.v1.ScopeSpans.oC(i, i.uint32()));
                        break;
                      }
                    case 3:
                      {
                        u.schemaUrl = i.string();
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.resource != null && i.hasOwnProperty("resource")) {
                  var a = At.opentelemetry.proto.resource.v1.Resource.verify(i.resource);
                  if (a) {
                    return "resource." + a;
                  }
                }
                if (i.scopeSpans != null && i.hasOwnProperty("scopeSpans")) {
                  if (!Array.isArray(i.scopeSpans)) {
                    return "scopeSpans: array expected";
                  }
                  for (var l = 0; l < i.scopeSpans.length; ++l) {
                    var a = At.opentelemetry.proto.trace.v1.ScopeSpans.verify(i.scopeSpans[l]);
                    if (a) {
                      return "scopeSpans." + a;
                    }
                  }
                }
                if (i.schemaUrl != null && i.hasOwnProperty("schemaUrl")) {
                  if (!Lt.isString(i.schemaUrl)) {
                    return "schemaUrl: string expected";
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.trace.v1.ResourceSpans) {
                  return i;
                }
                var a = new At.opentelemetry.proto.trace.v1.ResourceSpans();
                if (i.resource != null) {
                  if (typeof i.resource !== "object") {
                    throw TypeError(".opentelemetry.proto.trace.v1.ResourceSpans.resource: object expected");
                  }
                  a.resource = At.opentelemetry.proto.resource.v1.Resource.fromObject(i.resource);
                }
                if (i.scopeSpans) {
                  if (!Array.isArray(i.scopeSpans)) {
                    throw TypeError(".opentelemetry.proto.trace.v1.ResourceSpans.scopeSpans: array expected");
                  }
                  a.scopeSpans = [];
                  for (var l = 0; l < i.scopeSpans.length; ++l) {
                    if (typeof i.scopeSpans[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.trace.v1.ResourceSpans.scopeSpans: object expected");
                    }
                    a.scopeSpans[l] = At.opentelemetry.proto.trace.v1.ScopeSpans.fromObject(i.scopeSpans[l]);
                  }
                }
                if (i.schemaUrl != null) {
                  a.schemaUrl = String(i.schemaUrl);
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.scopeSpans = [];
                }
                if (a.defaults) {
                  l.resource = null;
                  l.schemaUrl = "";
                }
                if (i.resource != null && i.hasOwnProperty("resource")) {
                  l.resource = At.opentelemetry.proto.resource.v1.Resource.toObject(i.resource, a);
                }
                if (i.scopeSpans && i.scopeSpans.length) {
                  l.scopeSpans = [];
                  for (var c = 0; c < i.scopeSpans.length; ++c) {
                    l.scopeSpans[c] = At.opentelemetry.proto.trace.v1.ScopeSpans.toObject(i.scopeSpans[c], a);
                  }
                }
                if (i.schemaUrl != null && i.hasOwnProperty("schemaUrl")) {
                  l.schemaUrl = i.schemaUrl;
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.trace.v1.ResourceSpans";
              };
              return o;
            }();
            r.ScopeSpans = function () {
              function o(s) {
                if (this.spans = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.scope = null;
              o.prototype.spans = Lt.emptyArray;
              o.prototype.schemaUrl = null;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.scope != null && Object.hasOwnProperty.call(i, "scope")) {
                  At.opentelemetry.proto.common.v1.InstrumentationScope.HS(i.scope, a.uint32(10).fork()).ldelim();
                }
                if (i.spans != null && i.spans.length) {
                  for (var l = 0; l < i.spans.length; ++l) {
                    At.opentelemetry.proto.trace.v1.Span.HS(i.spans[l], a.uint32(18).fork()).ldelim();
                  }
                }
                if (i.schemaUrl != null && Object.hasOwnProperty.call(i, "schemaUrl")) {
                  a.uint32(26).string(i.schemaUrl);
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.trace.v1.ScopeSpans();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        u.scope = At.opentelemetry.proto.common.v1.InstrumentationScope.oC(i, i.uint32());
                        break;
                      }
                    case 2:
                      {
                        if (!(u.spans && u.spans.length)) {
                          u.spans = [];
                        }
                        u.spans.push(At.opentelemetry.proto.trace.v1.Span.oC(i, i.uint32()));
                        break;
                      }
                    case 3:
                      {
                        u.schemaUrl = i.string();
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.scope != null && i.hasOwnProperty("scope")) {
                  var a = At.opentelemetry.proto.common.v1.InstrumentationScope.verify(i.scope);
                  if (a) {
                    return "scope." + a;
                  }
                }
                if (i.spans != null && i.hasOwnProperty("spans")) {
                  if (!Array.isArray(i.spans)) {
                    return "spans: array expected";
                  }
                  for (var l = 0; l < i.spans.length; ++l) {
                    var a = At.opentelemetry.proto.trace.v1.Span.verify(i.spans[l]);
                    if (a) {
                      return "spans." + a;
                    }
                  }
                }
                if (i.schemaUrl != null && i.hasOwnProperty("schemaUrl")) {
                  if (!Lt.isString(i.schemaUrl)) {
                    return "schemaUrl: string expected";
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.trace.v1.ScopeSpans) {
                  return i;
                }
                var a = new At.opentelemetry.proto.trace.v1.ScopeSpans();
                if (i.scope != null) {
                  if (typeof i.scope !== "object") {
                    throw TypeError(".opentelemetry.proto.trace.v1.ScopeSpans.scope: object expected");
                  }
                  a.scope = At.opentelemetry.proto.common.v1.InstrumentationScope.fromObject(i.scope);
                }
                if (i.spans) {
                  if (!Array.isArray(i.spans)) {
                    throw TypeError(".opentelemetry.proto.trace.v1.ScopeSpans.spans: array expected");
                  }
                  a.spans = [];
                  for (var l = 0; l < i.spans.length; ++l) {
                    if (typeof i.spans[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.trace.v1.ScopeSpans.spans: object expected");
                    }
                    a.spans[l] = At.opentelemetry.proto.trace.v1.Span.fromObject(i.spans[l]);
                  }
                }
                if (i.schemaUrl != null) {
                  a.schemaUrl = String(i.schemaUrl);
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.spans = [];
                }
                if (a.defaults) {
                  l.scope = null;
                  l.schemaUrl = "";
                }
                if (i.scope != null && i.hasOwnProperty("scope")) {
                  l.scope = At.opentelemetry.proto.common.v1.InstrumentationScope.toObject(i.scope, a);
                }
                if (i.spans && i.spans.length) {
                  l.spans = [];
                  for (var c = 0; c < i.spans.length; ++c) {
                    l.spans[c] = At.opentelemetry.proto.trace.v1.Span.toObject(i.spans[c], a);
                  }
                }
                if (i.schemaUrl != null && i.hasOwnProperty("schemaUrl")) {
                  l.schemaUrl = i.schemaUrl;
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.trace.v1.ScopeSpans";
              };
              return o;
            }();
            r.Span = function () {
              function o(s) {
                if (this.attributes = [], this.events = [], this.links = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.traceId = null;
              o.prototype.spanId = null;
              o.prototype.traceState = null;
              o.prototype.parentSpanId = null;
              o.prototype.flags = null;
              o.prototype.name = null;
              o.prototype.kind = null;
              o.prototype.startTimeUnixNano = null;
              o.prototype.endTimeUnixNano = null;
              o.prototype.attributes = Lt.emptyArray;
              o.prototype.droppedAttributesCount = null;
              o.prototype.events = Lt.emptyArray;
              o.prototype.droppedEventsCount = null;
              o.prototype.links = Lt.emptyArray;
              o.prototype.droppedLinksCount = null;
              o.prototype.status = null;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.traceId != null && Object.hasOwnProperty.call(i, "traceId")) {
                  a.uint32(10).bytes(i.traceId);
                }
                if (i.spanId != null && Object.hasOwnProperty.call(i, "spanId")) {
                  a.uint32(18).bytes(i.spanId);
                }
                if (i.traceState != null && Object.hasOwnProperty.call(i, "traceState")) {
                  a.uint32(26).string(i.traceState);
                }
                if (i.parentSpanId != null && Object.hasOwnProperty.call(i, "parentSpanId")) {
                  a.uint32(34).bytes(i.parentSpanId);
                }
                if (i.name != null && Object.hasOwnProperty.call(i, "name")) {
                  a.uint32(42).string(i.name);
                }
                if (i.kind != null && Object.hasOwnProperty.call(i, "kind")) {
                  a.uint32(48).int32(i.kind);
                }
                if (i.startTimeUnixNano != null && Object.hasOwnProperty.call(i, "startTimeUnixNano")) {
                  a.uint32(57).fixed64(i.startTimeUnixNano);
                }
                if (i.endTimeUnixNano != null && Object.hasOwnProperty.call(i, "endTimeUnixNano")) {
                  a.uint32(65).fixed64(i.endTimeUnixNano);
                }
                if (i.attributes != null && i.attributes.length) {
                  for (var l = 0; l < i.attributes.length; ++l) {
                    At.opentelemetry.proto.common.v1.KeyValue.HS(i.attributes[l], a.uint32(74).fork()).ldelim();
                  }
                }
                if (i.droppedAttributesCount != null && Object.hasOwnProperty.call(i, "droppedAttributesCount")) {
                  a.uint32(80).uint32(i.droppedAttributesCount);
                }
                if (i.events != null && i.events.length) {
                  for (var l = 0; l < i.events.length; ++l) {
                    At.opentelemetry.proto.trace.v1.Span.Event.HS(i.events[l], a.uint32(90).fork()).ldelim();
                  }
                }
                if (i.droppedEventsCount != null && Object.hasOwnProperty.call(i, "droppedEventsCount")) {
                  a.uint32(96).uint32(i.droppedEventsCount);
                }
                if (i.links != null && i.links.length) {
                  for (var l = 0; l < i.links.length; ++l) {
                    At.opentelemetry.proto.trace.v1.Span.Link.HS(i.links[l], a.uint32(106).fork()).ldelim();
                  }
                }
                if (i.droppedLinksCount != null && Object.hasOwnProperty.call(i, "droppedLinksCount")) {
                  a.uint32(112).uint32(i.droppedLinksCount);
                }
                if (i.status != null && Object.hasOwnProperty.call(i, "status")) {
                  At.opentelemetry.proto.trace.v1.Status.HS(i.status, a.uint32(122).fork()).ldelim();
                }
                if (i.flags != null && Object.hasOwnProperty.call(i, "flags")) {
                  a.uint32(133).fixed32(i.flags);
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.trace.v1.Span();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        u.traceId = i.bytes();
                        break;
                      }
                    case 2:
                      {
                        u.spanId = i.bytes();
                        break;
                      }
                    case 3:
                      {
                        u.traceState = i.string();
                        break;
                      }
                    case 4:
                      {
                        u.parentSpanId = i.bytes();
                        break;
                      }
                    case 16:
                      {
                        u.flags = i.fixed32();
                        break;
                      }
                    case 5:
                      {
                        u.name = i.string();
                        break;
                      }
                    case 6:
                      {
                        u.kind = i.int32();
                        break;
                      }
                    case 7:
                      {
                        u.startTimeUnixNano = i.fixed64();
                        break;
                      }
                    case 8:
                      {
                        u.endTimeUnixNano = i.fixed64();
                        break;
                      }
                    case 9:
                      {
                        if (!(u.attributes && u.attributes.length)) {
                          u.attributes = [];
                        }
                        u.attributes.push(At.opentelemetry.proto.common.v1.KeyValue.oC(i, i.uint32()));
                        break;
                      }
                    case 10:
                      {
                        u.droppedAttributesCount = i.uint32();
                        break;
                      }
                    case 11:
                      {
                        if (!(u.events && u.events.length)) {
                          u.events = [];
                        }
                        u.events.push(At.opentelemetry.proto.trace.v1.Span.Event.oC(i, i.uint32()));
                        break;
                      }
                    case 12:
                      {
                        u.droppedEventsCount = i.uint32();
                        break;
                      }
                    case 13:
                      {
                        if (!(u.links && u.links.length)) {
                          u.links = [];
                        }
                        u.links.push(At.opentelemetry.proto.trace.v1.Span.Link.oC(i, i.uint32()));
                        break;
                      }
                    case 14:
                      {
                        u.droppedLinksCount = i.uint32();
                        break;
                      }
                    case 15:
                      {
                        u.status = At.opentelemetry.proto.trace.v1.Status.oC(i, i.uint32());
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.traceId != null && i.hasOwnProperty("traceId")) {
                  if (!(i.traceId && typeof i.traceId.length === "number" || Lt.isString(i.traceId))) {
                    return "traceId: buffer expected";
                  }
                }
                if (i.spanId != null && i.hasOwnProperty("spanId")) {
                  if (!(i.spanId && typeof i.spanId.length === "number" || Lt.isString(i.spanId))) {
                    return "spanId: buffer expected";
                  }
                }
                if (i.traceState != null && i.hasOwnProperty("traceState")) {
                  if (!Lt.isString(i.traceState)) {
                    return "traceState: string expected";
                  }
                }
                if (i.parentSpanId != null && i.hasOwnProperty("parentSpanId")) {
                  if (!(i.parentSpanId && typeof i.parentSpanId.length === "number" || Lt.isString(i.parentSpanId))) {
                    return "parentSpanId: buffer expected";
                  }
                }
                if (i.flags != null && i.hasOwnProperty("flags")) {
                  if (!Lt.isInteger(i.flags)) {
                    return "flags: integer expected";
                  }
                }
                if (i.name != null && i.hasOwnProperty("name")) {
                  if (!Lt.isString(i.name)) {
                    return "name: string expected";
                  }
                }
                if (i.kind != null && i.hasOwnProperty("kind")) {
                  switch (i.kind) {
                    default:
                      return "kind: enum value expected";
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                      break;
                  }
                }
                if (i.startTimeUnixNano != null && i.hasOwnProperty("startTimeUnixNano")) {
                  if (!Lt.isInteger(i.startTimeUnixNano) && !(i.startTimeUnixNano && Lt.isInteger(i.startTimeUnixNano.low) && Lt.isInteger(i.startTimeUnixNano.high))) {
                    return "startTimeUnixNano: integer|Long expected";
                  }
                }
                if (i.endTimeUnixNano != null && i.hasOwnProperty("endTimeUnixNano")) {
                  if (!Lt.isInteger(i.endTimeUnixNano) && !(i.endTimeUnixNano && Lt.isInteger(i.endTimeUnixNano.low) && Lt.isInteger(i.endTimeUnixNano.high))) {
                    return "endTimeUnixNano: integer|Long expected";
                  }
                }
                if (i.attributes != null && i.hasOwnProperty("attributes")) {
                  if (!Array.isArray(i.attributes)) {
                    return "attributes: array expected";
                  }
                  for (var a = 0; a < i.attributes.length; ++a) {
                    var l = At.opentelemetry.proto.common.v1.KeyValue.verify(i.attributes[a]);
                    if (l) {
                      return "attributes." + l;
                    }
                  }
                }
                if (i.droppedAttributesCount != null && i.hasOwnProperty("droppedAttributesCount")) {
                  if (!Lt.isInteger(i.droppedAttributesCount)) {
                    return "droppedAttributesCount: integer expected";
                  }
                }
                if (i.events != null && i.hasOwnProperty("events")) {
                  if (!Array.isArray(i.events)) {
                    return "events: array expected";
                  }
                  for (var a = 0; a < i.events.length; ++a) {
                    var l = At.opentelemetry.proto.trace.v1.Span.Event.verify(i.events[a]);
                    if (l) {
                      return "events." + l;
                    }
                  }
                }
                if (i.droppedEventsCount != null && i.hasOwnProperty("droppedEventsCount")) {
                  if (!Lt.isInteger(i.droppedEventsCount)) {
                    return "droppedEventsCount: integer expected";
                  }
                }
                if (i.links != null && i.hasOwnProperty("links")) {
                  if (!Array.isArray(i.links)) {
                    return "links: array expected";
                  }
                  for (var a = 0; a < i.links.length; ++a) {
                    var l = At.opentelemetry.proto.trace.v1.Span.Link.verify(i.links[a]);
                    if (l) {
                      return "links." + l;
                    }
                  }
                }
                if (i.droppedLinksCount != null && i.hasOwnProperty("droppedLinksCount")) {
                  if (!Lt.isInteger(i.droppedLinksCount)) {
                    return "droppedLinksCount: integer expected";
                  }
                }
                if (i.status != null && i.hasOwnProperty("status")) {
                  var l = At.opentelemetry.proto.trace.v1.Status.verify(i.status);
                  if (l) {
                    return "status." + l;
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.trace.v1.Span) {
                  return i;
                }
                var a = new At.opentelemetry.proto.trace.v1.Span();
                if (i.traceId != null) {
                  if (typeof i.traceId === "string") {
                    Lt.base64.oC(i.traceId, a.traceId = Lt.newBuffer(Lt.base64.length(i.traceId)), 0);
                  } else if (i.traceId.length >= 0) {
                    a.traceId = i.traceId;
                  }
                }
                if (i.spanId != null) {
                  if (typeof i.spanId === "string") {
                    Lt.base64.oC(i.spanId, a.spanId = Lt.newBuffer(Lt.base64.length(i.spanId)), 0);
                  } else if (i.spanId.length >= 0) {
                    a.spanId = i.spanId;
                  }
                }
                if (i.traceState != null) {
                  a.traceState = String(i.traceState);
                }
                if (i.parentSpanId != null) {
                  if (typeof i.parentSpanId === "string") {
                    Lt.base64.oC(i.parentSpanId, a.parentSpanId = Lt.newBuffer(Lt.base64.length(i.parentSpanId)), 0);
                  } else if (i.parentSpanId.length >= 0) {
                    a.parentSpanId = i.parentSpanId;
                  }
                }
                if (i.flags != null) {
                  a.flags = i.flags >>> 0;
                }
                if (i.name != null) {
                  a.name = String(i.name);
                }
                switch (i.kind) {
                  default:
                    if (typeof i.kind === "number") {
                      a.kind = i.kind;
                      break;
                    }
                    break;
                  case "SPAN_KIND_UNSPECIFIED":
                  case 0:
                    a.kind = 0;
                    break;
                  case "SPAN_KIND_INTERNAL":
                  case 1:
                    a.kind = 1;
                    break;
                  case "SPAN_KIND_SERVER":
                  case 2:
                    a.kind = 2;
                    break;
                  case "SPAN_KIND_CLIENT":
                  case 3:
                    a.kind = 3;
                    break;
                  case "SPAN_KIND_PRODUCER":
                  case 4:
                    a.kind = 4;
                    break;
                  case "SPAN_KIND_CONSUMER":
                  case 5:
                    a.kind = 5;
                    break;
                }
                if (i.startTimeUnixNano != null) {
                  if (Lt.Long) {
                    (a.startTimeUnixNano = Lt.Long.fromValue(i.startTimeUnixNano)).unsigned = false;
                  } else if (typeof i.startTimeUnixNano === "string") {
                    a.startTimeUnixNano = parseInt(i.startTimeUnixNano, 10);
                  } else if (typeof i.startTimeUnixNano === "number") {
                    a.startTimeUnixNano = i.startTimeUnixNano;
                  } else if (typeof i.startTimeUnixNano === "object") {
                    a.startTimeUnixNano = new Lt.LongBits(i.startTimeUnixNano.low >>> 0, i.startTimeUnixNano.high >>> 0).toNumber();
                  }
                }
                if (i.endTimeUnixNano != null) {
                  if (Lt.Long) {
                    (a.endTimeUnixNano = Lt.Long.fromValue(i.endTimeUnixNano)).unsigned = false;
                  } else if (typeof i.endTimeUnixNano === "string") {
                    a.endTimeUnixNano = parseInt(i.endTimeUnixNano, 10);
                  } else if (typeof i.endTimeUnixNano === "number") {
                    a.endTimeUnixNano = i.endTimeUnixNano;
                  } else if (typeof i.endTimeUnixNano === "object") {
                    a.endTimeUnixNano = new Lt.LongBits(i.endTimeUnixNano.low >>> 0, i.endTimeUnixNano.high >>> 0).toNumber();
                  }
                }
                if (i.attributes) {
                  if (!Array.isArray(i.attributes)) {
                    throw TypeError(".opentelemetry.proto.trace.v1.Span.attributes: array expected");
                  }
                  a.attributes = [];
                  for (var l = 0; l < i.attributes.length; ++l) {
                    if (typeof i.attributes[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.trace.v1.Span.attributes: object expected");
                    }
                    a.attributes[l] = At.opentelemetry.proto.common.v1.KeyValue.fromObject(i.attributes[l]);
                  }
                }
                if (i.droppedAttributesCount != null) {
                  a.droppedAttributesCount = i.droppedAttributesCount >>> 0;
                }
                if (i.events) {
                  if (!Array.isArray(i.events)) {
                    throw TypeError(".opentelemetry.proto.trace.v1.Span.events: array expected");
                  }
                  a.events = [];
                  for (var l = 0; l < i.events.length; ++l) {
                    if (typeof i.events[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.trace.v1.Span.events: object expected");
                    }
                    a.events[l] = At.opentelemetry.proto.trace.v1.Span.Event.fromObject(i.events[l]);
                  }
                }
                if (i.droppedEventsCount != null) {
                  a.droppedEventsCount = i.droppedEventsCount >>> 0;
                }
                if (i.links) {
                  if (!Array.isArray(i.links)) {
                    throw TypeError(".opentelemetry.proto.trace.v1.Span.links: array expected");
                  }
                  a.links = [];
                  for (var l = 0; l < i.links.length; ++l) {
                    if (typeof i.links[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.trace.v1.Span.links: object expected");
                    }
                    a.links[l] = At.opentelemetry.proto.trace.v1.Span.Link.fromObject(i.links[l]);
                  }
                }
                if (i.droppedLinksCount != null) {
                  a.droppedLinksCount = i.droppedLinksCount >>> 0;
                }
                if (i.status != null) {
                  if (typeof i.status !== "object") {
                    throw TypeError(".opentelemetry.proto.trace.v1.Span.status: object expected");
                  }
                  a.status = At.opentelemetry.proto.trace.v1.Status.fromObject(i.status);
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.attributes = [];
                  l.events = [];
                  l.links = [];
                }
                if (a.defaults) {
                  if (a.bytes === String) {
                    l.traceId = "";
                  } else if (l.traceId = [], a.bytes !== Array) {
                    l.traceId = Lt.newBuffer(l.traceId);
                  }
                  if (a.bytes === String) {
                    l.spanId = "";
                  } else if (l.spanId = [], a.bytes !== Array) {
                    l.spanId = Lt.newBuffer(l.spanId);
                  }
                  if (l.traceState = "", a.bytes === String) {
                    l.parentSpanId = "";
                  } else if (l.parentSpanId = [], a.bytes !== Array) {
                    l.parentSpanId = Lt.newBuffer(l.parentSpanId);
                  }
                  if (l.name = "", l.kind = a.enums === String ? "SPAN_KIND_UNSPECIFIED" : 0, Lt.Long) {
                    var c = new Lt.Long(0, 0, false);
                    l.startTimeUnixNano = a.longs === String ? c.toString() : a.longs === Number ? c.toNumber() : c;
                  } else {
                    l.startTimeUnixNano = a.longs === String ? "0" : 0;
                  }
                  if (Lt.Long) {
                    var c = new Lt.Long(0, 0, false);
                    l.endTimeUnixNano = a.longs === String ? c.toString() : a.longs === Number ? c.toNumber() : c;
                  } else {
                    l.endTimeUnixNano = a.longs === String ? "0" : 0;
                  }
                  l.droppedAttributesCount = 0;
                  l.droppedEventsCount = 0;
                  l.droppedLinksCount = 0;
                  l.status = null;
                  l.flags = 0;
                }
                if (i.traceId != null && i.hasOwnProperty("traceId")) {
                  l.traceId = a.bytes === String ? Lt.base64.HS(i.traceId, 0, i.traceId.length) : a.bytes === Array ? Array.prototype.slice.call(i.traceId) : i.traceId;
                }
                if (i.spanId != null && i.hasOwnProperty("spanId")) {
                  l.spanId = a.bytes === String ? Lt.base64.HS(i.spanId, 0, i.spanId.length) : a.bytes === Array ? Array.prototype.slice.call(i.spanId) : i.spanId;
                }
                if (i.traceState != null && i.hasOwnProperty("traceState")) {
                  l.traceState = i.traceState;
                }
                if (i.parentSpanId != null && i.hasOwnProperty("parentSpanId")) {
                  l.parentSpanId = a.bytes === String ? Lt.base64.HS(i.parentSpanId, 0, i.parentSpanId.length) : a.bytes === Array ? Array.prototype.slice.call(i.parentSpanId) : i.parentSpanId;
                }
                if (i.name != null && i.hasOwnProperty("name")) {
                  l.name = i.name;
                }
                if (i.kind != null && i.hasOwnProperty("kind")) {
                  l.kind = a.enums === String ? At.opentelemetry.proto.trace.v1.Span.SpanKind[i.kind] === undefined ? i.kind : At.opentelemetry.proto.trace.v1.Span.SpanKind[i.kind] : i.kind;
                }
                if (i.startTimeUnixNano != null && i.hasOwnProperty("startTimeUnixNano")) {
                  if (typeof i.startTimeUnixNano === "number") {
                    l.startTimeUnixNano = a.longs === String ? String(i.startTimeUnixNano) : i.startTimeUnixNano;
                  } else {
                    l.startTimeUnixNano = a.longs === String ? Lt.Long.prototype.toString.call(i.startTimeUnixNano) : a.longs === Number ? new Lt.LongBits(i.startTimeUnixNano.low >>> 0, i.startTimeUnixNano.high >>> 0).toNumber() : i.startTimeUnixNano;
                  }
                }
                if (i.endTimeUnixNano != null && i.hasOwnProperty("endTimeUnixNano")) {
                  if (typeof i.endTimeUnixNano === "number") {
                    l.endTimeUnixNano = a.longs === String ? String(i.endTimeUnixNano) : i.endTimeUnixNano;
                  } else {
                    l.endTimeUnixNano = a.longs === String ? Lt.Long.prototype.toString.call(i.endTimeUnixNano) : a.longs === Number ? new Lt.LongBits(i.endTimeUnixNano.low >>> 0, i.endTimeUnixNano.high >>> 0).toNumber() : i.endTimeUnixNano;
                  }
                }
                if (i.attributes && i.attributes.length) {
                  l.attributes = [];
                  for (var u = 0; u < i.attributes.length; ++u) {
                    l.attributes[u] = At.opentelemetry.proto.common.v1.KeyValue.toObject(i.attributes[u], a);
                  }
                }
                if (i.droppedAttributesCount != null && i.hasOwnProperty("droppedAttributesCount")) {
                  l.droppedAttributesCount = i.droppedAttributesCount;
                }
                if (i.events && i.events.length) {
                  l.events = [];
                  for (var u = 0; u < i.events.length; ++u) {
                    l.events[u] = At.opentelemetry.proto.trace.v1.Span.Event.toObject(i.events[u], a);
                  }
                }
                if (i.droppedEventsCount != null && i.hasOwnProperty("droppedEventsCount")) {
                  l.droppedEventsCount = i.droppedEventsCount;
                }
                if (i.links && i.links.length) {
                  l.links = [];
                  for (var u = 0; u < i.links.length; ++u) {
                    l.links[u] = At.opentelemetry.proto.trace.v1.Span.Link.toObject(i.links[u], a);
                  }
                }
                if (i.droppedLinksCount != null && i.hasOwnProperty("droppedLinksCount")) {
                  l.droppedLinksCount = i.droppedLinksCount;
                }
                if (i.status != null && i.hasOwnProperty("status")) {
                  l.status = At.opentelemetry.proto.trace.v1.Status.toObject(i.status, a);
                }
                if (i.flags != null && i.hasOwnProperty("flags")) {
                  l.flags = i.flags;
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.trace.v1.Span";
              };
              o.SpanKind = function () {
                var s = {};
                var i = Object.create(s);
                i[s[0] = "SPAN_KIND_UNSPECIFIED"] = 0;
                i[s[1] = "SPAN_KIND_INTERNAL"] = 1;
                i[s[2] = "SPAN_KIND_SERVER"] = 2;
                i[s[3] = "SPAN_KIND_CLIENT"] = 3;
                i[s[4] = "SPAN_KIND_PRODUCER"] = 4;
                i[s[5] = "SPAN_KIND_CONSUMER"] = 5;
                return i;
              }();
              o.Event = function () {
                function s(i) {
                  if (this.attributes = [], i) {
                    for (var a = Object.keys(i), l = 0; l < a.length; ++l) {
                      if (i[a[l]] != null) {
                        this[a[l]] = i[a[l]];
                      }
                    }
                  }
                }
                s.prototype.timeUnixNano = null;
                s.prototype.name = null;
                s.prototype.attributes = Lt.emptyArray;
                s.prototype.droppedAttributesCount = null;
                s.create = function (a) {
                  return new s(a);
                };
                s.HS = function (a, l) {
                  if (!l) {
                    l = Im.create();
                  }
                  if (a.timeUnixNano != null && Object.hasOwnProperty.call(a, "timeUnixNano")) {
                    l.uint32(9).fixed64(a.timeUnixNano);
                  }
                  if (a.name != null && Object.hasOwnProperty.call(a, "name")) {
                    l.uint32(18).string(a.name);
                  }
                  if (a.attributes != null && a.attributes.length) {
                    for (var c = 0; c < a.attributes.length; ++c) {
                      At.opentelemetry.proto.common.v1.KeyValue.HS(a.attributes[c], l.uint32(26).fork()).ldelim();
                    }
                  }
                  if (a.droppedAttributesCount != null && Object.hasOwnProperty.call(a, "droppedAttributesCount")) {
                    l.uint32(32).uint32(a.droppedAttributesCount);
                  }
                  return l;
                };
                s.encodeDelimited = function (a, l) {
                  return this.HS(a, l).ldelim();
                };
                s.oC = function (a, l, c) {
                  if (!(a instanceof Jr)) {
                    a = Jr.create(a);
                  }
                  var u = l === undefined ? a.len : a.pos + l;
                  var d = new At.opentelemetry.proto.trace.v1.Span.Event();
                  while (a.pos < u) {
                    var p = a.uint32();
                    if (p === c) {
                      break;
                    }
                    switch (p >>> 3) {
                      case 1:
                        {
                          d.timeUnixNano = a.fixed64();
                          break;
                        }
                      case 2:
                        {
                          d.name = a.string();
                          break;
                        }
                      case 3:
                        {
                          if (!(d.attributes && d.attributes.length)) {
                            d.attributes = [];
                          }
                          d.attributes.push(At.opentelemetry.proto.common.v1.KeyValue.oC(a, a.uint32()));
                          break;
                        }
                      case 4:
                        {
                          d.droppedAttributesCount = a.uint32();
                          break;
                        }
                      default:
                        a.skipType(p & 7);
                        break;
                    }
                  }
                  return d;
                };
                s.decodeDelimited = function (a) {
                  if (!(a instanceof Jr)) {
                    a = new Jr(a);
                  }
                  return this.oC(a, a.uint32());
                };
                s.verify = function (a) {
                  if (typeof a !== "object" || a === null) {
                    return "object expected";
                  }
                  if (a.timeUnixNano != null && a.hasOwnProperty("timeUnixNano")) {
                    if (!Lt.isInteger(a.timeUnixNano) && !(a.timeUnixNano && Lt.isInteger(a.timeUnixNano.low) && Lt.isInteger(a.timeUnixNano.high))) {
                      return "timeUnixNano: integer|Long expected";
                    }
                  }
                  if (a.name != null && a.hasOwnProperty("name")) {
                    if (!Lt.isString(a.name)) {
                      return "name: string expected";
                    }
                  }
                  if (a.attributes != null && a.hasOwnProperty("attributes")) {
                    if (!Array.isArray(a.attributes)) {
                      return "attributes: array expected";
                    }
                    for (var l = 0; l < a.attributes.length; ++l) {
                      var c = At.opentelemetry.proto.common.v1.KeyValue.verify(a.attributes[l]);
                      if (c) {
                        return "attributes." + c;
                      }
                    }
                  }
                  if (a.droppedAttributesCount != null && a.hasOwnProperty("droppedAttributesCount")) {
                    if (!Lt.isInteger(a.droppedAttributesCount)) {
                      return "droppedAttributesCount: integer expected";
                    }
                  }
                  return null;
                };
                s.fromObject = function (a) {
                  if (a instanceof At.opentelemetry.proto.trace.v1.Span.Event) {
                    return a;
                  }
                  var l = new At.opentelemetry.proto.trace.v1.Span.Event();
                  if (a.timeUnixNano != null) {
                    if (Lt.Long) {
                      (l.timeUnixNano = Lt.Long.fromValue(a.timeUnixNano)).unsigned = false;
                    } else if (typeof a.timeUnixNano === "string") {
                      l.timeUnixNano = parseInt(a.timeUnixNano, 10);
                    } else if (typeof a.timeUnixNano === "number") {
                      l.timeUnixNano = a.timeUnixNano;
                    } else if (typeof a.timeUnixNano === "object") {
                      l.timeUnixNano = new Lt.LongBits(a.timeUnixNano.low >>> 0, a.timeUnixNano.high >>> 0).toNumber();
                    }
                  }
                  if (a.name != null) {
                    l.name = String(a.name);
                  }
                  if (a.attributes) {
                    if (!Array.isArray(a.attributes)) {
                      throw TypeError(".opentelemetry.proto.trace.v1.Span.Event.attributes: array expected");
                    }
                    l.attributes = [];
                    for (var c = 0; c < a.attributes.length; ++c) {
                      if (typeof a.attributes[c] !== "object") {
                        throw TypeError(".opentelemetry.proto.trace.v1.Span.Event.attributes: object expected");
                      }
                      l.attributes[c] = At.opentelemetry.proto.common.v1.KeyValue.fromObject(a.attributes[c]);
                    }
                  }
                  if (a.droppedAttributesCount != null) {
                    l.droppedAttributesCount = a.droppedAttributesCount >>> 0;
                  }
                  return l;
                };
                s.toObject = function (a, l) {
                  if (!l) {
                    l = {};
                  }
                  var c = {};
                  if (l.arrays || l.defaults) {
                    c.attributes = [];
                  }
                  if (l.defaults) {
                    if (Lt.Long) {
                      var u = new Lt.Long(0, 0, false);
                      c.timeUnixNano = l.longs === String ? u.toString() : l.longs === Number ? u.toNumber() : u;
                    } else {
                      c.timeUnixNano = l.longs === String ? "0" : 0;
                    }
                    c.name = "";
                    c.droppedAttributesCount = 0;
                  }
                  if (a.timeUnixNano != null && a.hasOwnProperty("timeUnixNano")) {
                    if (typeof a.timeUnixNano === "number") {
                      c.timeUnixNano = l.longs === String ? String(a.timeUnixNano) : a.timeUnixNano;
                    } else {
                      c.timeUnixNano = l.longs === String ? Lt.Long.prototype.toString.call(a.timeUnixNano) : l.longs === Number ? new Lt.LongBits(a.timeUnixNano.low >>> 0, a.timeUnixNano.high >>> 0).toNumber() : a.timeUnixNano;
                    }
                  }
                  if (a.name != null && a.hasOwnProperty("name")) {
                    c.name = a.name;
                  }
                  if (a.attributes && a.attributes.length) {
                    c.attributes = [];
                    for (var d = 0; d < a.attributes.length; ++d) {
                      c.attributes[d] = At.opentelemetry.proto.common.v1.KeyValue.toObject(a.attributes[d], l);
                    }
                  }
                  if (a.droppedAttributesCount != null && a.hasOwnProperty("droppedAttributesCount")) {
                    c.droppedAttributesCount = a.droppedAttributesCount;
                  }
                  return c;
                };
                s.prototype.toJSON = function () {
                  return this.constructor.toObject(this, rd.util.toJSONOptions);
                };
                s.getTypeUrl = function (a) {
                  if (a === undefined) {
                    a = "type.googleapis.com";
                  }
                  return a + "/opentelemetry.proto.trace.v1.Span.Event";
                };
                return s;
              }();
              o.Link = function () {
                function s(i) {
                  if (this.attributes = [], i) {
                    for (var a = Object.keys(i), l = 0; l < a.length; ++l) {
                      if (i[a[l]] != null) {
                        this[a[l]] = i[a[l]];
                      }
                    }
                  }
                }
                s.prototype.traceId = null;
                s.prototype.spanId = null;
                s.prototype.traceState = null;
                s.prototype.attributes = Lt.emptyArray;
                s.prototype.droppedAttributesCount = null;
                s.prototype.flags = null;
                s.create = function (a) {
                  return new s(a);
                };
                s.HS = function (a, l) {
                  if (!l) {
                    l = Im.create();
                  }
                  if (a.traceId != null && Object.hasOwnProperty.call(a, "traceId")) {
                    l.uint32(10).bytes(a.traceId);
                  }
                  if (a.spanId != null && Object.hasOwnProperty.call(a, "spanId")) {
                    l.uint32(18).bytes(a.spanId);
                  }
                  if (a.traceState != null && Object.hasOwnProperty.call(a, "traceState")) {
                    l.uint32(26).string(a.traceState);
                  }
                  if (a.attributes != null && a.attributes.length) {
                    for (var c = 0; c < a.attributes.length; ++c) {
                      At.opentelemetry.proto.common.v1.KeyValue.HS(a.attributes[c], l.uint32(34).fork()).ldelim();
                    }
                  }
                  if (a.droppedAttributesCount != null && Object.hasOwnProperty.call(a, "droppedAttributesCount")) {
                    l.uint32(40).uint32(a.droppedAttributesCount);
                  }
                  if (a.flags != null && Object.hasOwnProperty.call(a, "flags")) {
                    l.uint32(53).fixed32(a.flags);
                  }
                  return l;
                };
                s.encodeDelimited = function (a, l) {
                  return this.HS(a, l).ldelim();
                };
                s.oC = function (a, l, c) {
                  if (!(a instanceof Jr)) {
                    a = Jr.create(a);
                  }
                  var u = l === undefined ? a.len : a.pos + l;
                  var d = new At.opentelemetry.proto.trace.v1.Span.Link();
                  while (a.pos < u) {
                    var p = a.uint32();
                    if (p === c) {
                      break;
                    }
                    switch (p >>> 3) {
                      case 1:
                        {
                          d.traceId = a.bytes();
                          break;
                        }
                      case 2:
                        {
                          d.spanId = a.bytes();
                          break;
                        }
                      case 3:
                        {
                          d.traceState = a.string();
                          break;
                        }
                      case 4:
                        {
                          if (!(d.attributes && d.attributes.length)) {
                            d.attributes = [];
                          }
                          d.attributes.push(At.opentelemetry.proto.common.v1.KeyValue.oC(a, a.uint32()));
                          break;
                        }
                      case 5:
                        {
                          d.droppedAttributesCount = a.uint32();
                          break;
                        }
                      case 6:
                        {
                          d.flags = a.fixed32();
                          break;
                        }
                      default:
                        a.skipType(p & 7);
                        break;
                    }
                  }
                  return d;
                };
                s.decodeDelimited = function (a) {
                  if (!(a instanceof Jr)) {
                    a = new Jr(a);
                  }
                  return this.oC(a, a.uint32());
                };
                s.verify = function (a) {
                  if (typeof a !== "object" || a === null) {
                    return "object expected";
                  }
                  if (a.traceId != null && a.hasOwnProperty("traceId")) {
                    if (!(a.traceId && typeof a.traceId.length === "number" || Lt.isString(a.traceId))) {
                      return "traceId: buffer expected";
                    }
                  }
                  if (a.spanId != null && a.hasOwnProperty("spanId")) {
                    if (!(a.spanId && typeof a.spanId.length === "number" || Lt.isString(a.spanId))) {
                      return "spanId: buffer expected";
                    }
                  }
                  if (a.traceState != null && a.hasOwnProperty("traceState")) {
                    if (!Lt.isString(a.traceState)) {
                      return "traceState: string expected";
                    }
                  }
                  if (a.attributes != null && a.hasOwnProperty("attributes")) {
                    if (!Array.isArray(a.attributes)) {
                      return "attributes: array expected";
                    }
                    for (var l = 0; l < a.attributes.length; ++l) {
                      var c = At.opentelemetry.proto.common.v1.KeyValue.verify(a.attributes[l]);
                      if (c) {
                        return "attributes." + c;
                      }
                    }
                  }
                  if (a.droppedAttributesCount != null && a.hasOwnProperty("droppedAttributesCount")) {
                    if (!Lt.isInteger(a.droppedAttributesCount)) {
                      return "droppedAttributesCount: integer expected";
                    }
                  }
                  if (a.flags != null && a.hasOwnProperty("flags")) {
                    if (!Lt.isInteger(a.flags)) {
                      return "flags: integer expected";
                    }
                  }
                  return null;
                };
                s.fromObject = function (a) {
                  if (a instanceof At.opentelemetry.proto.trace.v1.Span.Link) {
                    return a;
                  }
                  var l = new At.opentelemetry.proto.trace.v1.Span.Link();
                  if (a.traceId != null) {
                    if (typeof a.traceId === "string") {
                      Lt.base64.oC(a.traceId, l.traceId = Lt.newBuffer(Lt.base64.length(a.traceId)), 0);
                    } else if (a.traceId.length >= 0) {
                      l.traceId = a.traceId;
                    }
                  }
                  if (a.spanId != null) {
                    if (typeof a.spanId === "string") {
                      Lt.base64.oC(a.spanId, l.spanId = Lt.newBuffer(Lt.base64.length(a.spanId)), 0);
                    } else if (a.spanId.length >= 0) {
                      l.spanId = a.spanId;
                    }
                  }
                  if (a.traceState != null) {
                    l.traceState = String(a.traceState);
                  }
                  if (a.attributes) {
                    if (!Array.isArray(a.attributes)) {
                      throw TypeError(".opentelemetry.proto.trace.v1.Span.Link.attributes: array expected");
                    }
                    l.attributes = [];
                    for (var c = 0; c < a.attributes.length; ++c) {
                      if (typeof a.attributes[c] !== "object") {
                        throw TypeError(".opentelemetry.proto.trace.v1.Span.Link.attributes: object expected");
                      }
                      l.attributes[c] = At.opentelemetry.proto.common.v1.KeyValue.fromObject(a.attributes[c]);
                    }
                  }
                  if (a.droppedAttributesCount != null) {
                    l.droppedAttributesCount = a.droppedAttributesCount >>> 0;
                  }
                  if (a.flags != null) {
                    l.flags = a.flags >>> 0;
                  }
                  return l;
                };
                s.toObject = function (a, l) {
                  if (!l) {
                    l = {};
                  }
                  var c = {};
                  if (l.arrays || l.defaults) {
                    c.attributes = [];
                  }
                  if (l.defaults) {
                    if (l.bytes === String) {
                      c.traceId = "";
                    } else if (c.traceId = [], l.bytes !== Array) {
                      c.traceId = Lt.newBuffer(c.traceId);
                    }
                    if (l.bytes === String) {
                      c.spanId = "";
                    } else if (c.spanId = [], l.bytes !== Array) {
                      c.spanId = Lt.newBuffer(c.spanId);
                    }
                    c.traceState = "";
                    c.droppedAttributesCount = 0;
                    c.flags = 0;
                  }
                  if (a.traceId != null && a.hasOwnProperty("traceId")) {
                    c.traceId = l.bytes === String ? Lt.base64.HS(a.traceId, 0, a.traceId.length) : l.bytes === Array ? Array.prototype.slice.call(a.traceId) : a.traceId;
                  }
                  if (a.spanId != null && a.hasOwnProperty("spanId")) {
                    c.spanId = l.bytes === String ? Lt.base64.HS(a.spanId, 0, a.spanId.length) : l.bytes === Array ? Array.prototype.slice.call(a.spanId) : a.spanId;
                  }
                  if (a.traceState != null && a.hasOwnProperty("traceState")) {
                    c.traceState = a.traceState;
                  }
                  if (a.attributes && a.attributes.length) {
                    c.attributes = [];
                    for (var u = 0; u < a.attributes.length; ++u) {
                      c.attributes[u] = At.opentelemetry.proto.common.v1.KeyValue.toObject(a.attributes[u], l);
                    }
                  }
                  if (a.droppedAttributesCount != null && a.hasOwnProperty("droppedAttributesCount")) {
                    c.droppedAttributesCount = a.droppedAttributesCount;
                  }
                  if (a.flags != null && a.hasOwnProperty("flags")) {
                    c.flags = a.flags;
                  }
                  return c;
                };
                s.prototype.toJSON = function () {
                  return this.constructor.toObject(this, rd.util.toJSONOptions);
                };
                s.getTypeUrl = function (a) {
                  if (a === undefined) {
                    a = "type.googleapis.com";
                  }
                  return a + "/opentelemetry.proto.trace.v1.Span.Link";
                };
                return s;
              }();
              return o;
            }();
            r.Status = function () {
              function o(s) {
                if (s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.message = null;
              o.prototype.code = null;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.message != null && Object.hasOwnProperty.call(i, "message")) {
                  a.uint32(18).string(i.message);
                }
                if (i.code != null && Object.hasOwnProperty.call(i, "code")) {
                  a.uint32(24).int32(i.code);
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.trace.v1.Status();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 2:
                      {
                        u.message = i.string();
                        break;
                      }
                    case 3:
                      {
                        u.code = i.int32();
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.message != null && i.hasOwnProperty("message")) {
                  if (!Lt.isString(i.message)) {
                    return "message: string expected";
                  }
                }
                if (i.code != null && i.hasOwnProperty("code")) {
                  switch (i.code) {
                    default:
                      return "code: enum value expected";
                    case 0:
                    case 1:
                    case 2:
                      break;
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.trace.v1.Status) {
                  return i;
                }
                var a = new At.opentelemetry.proto.trace.v1.Status();
                if (i.message != null) {
                  a.message = String(i.message);
                }
                switch (i.code) {
                  default:
                    if (typeof i.code === "number") {
                      a.code = i.code;
                      break;
                    }
                    break;
                  case "STATUS_CODE_UNSET":
                  case 0:
                    a.code = 0;
                    break;
                  case "STATUS_CODE_OK":
                  case 1:
                    a.code = 1;
                    break;
                  case "STATUS_CODE_ERROR":
                  case 2:
                    a.code = 2;
                    break;
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.defaults) {
                  l.message = "";
                  l.code = a.enums === String ? "STATUS_CODE_UNSET" : 0;
                }
                if (i.message != null && i.hasOwnProperty("message")) {
                  l.message = i.message;
                }
                if (i.code != null && i.hasOwnProperty("code")) {
                  l.code = a.enums === String ? At.opentelemetry.proto.trace.v1.Status.StatusCode[i.code] === undefined ? i.code : At.opentelemetry.proto.trace.v1.Status.StatusCode[i.code] : i.code;
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.trace.v1.Status";
              };
              o.StatusCode = function () {
                var s = {};
                var i = Object.create(s);
                i[s[0] = "STATUS_CODE_UNSET"] = 0;
                i[s[1] = "STATUS_CODE_OK"] = 1;
                i[s[2] = "STATUS_CODE_ERROR"] = 2;
                return i;
              }();
              return o;
            }();
            r.SpanFlags = function () {
              var o = {};
              var s = Object.create(o);
              s[o[0] = "SPAN_FLAGS_DO_NOT_USE"] = 0;
              s[o[255] = "SPAN_FLAGS_TRACE_FLAGS_MASK"] = 255;
              s[o[256] = "SPAN_FLAGS_CONTEXT_HAS_IS_REMOTE_MASK"] = 256;
              s[o[512] = "SPAN_FLAGS_CONTEXT_IS_REMOTE_MASK"] = 512;
              return s;
            }();
            return r;
          }();
          return n;
        }();
        t.collector = function () {
          var n = {};
          n.trace = function () {
            var r = {};
            r.v1 = function () {
              var o = {};
              o.TraceService = function () {
                function s(i, a, l) {
                  rd.rpc.Service.call(this, i, a, l);
                }
                (s.prototype = Object.create(rd.rpc.Service.prototype)).constructor = s;
                s.create = function (a, l, c) {
                  return new this(a, l, c);
                };
                Object.defineProperty(s.prototype.export = function i(a, l) {
                  return this.rpcCall(i, At.opentelemetry.proto.collector.trace.v1.ExportTraceServiceRequest, At.opentelemetry.proto.collector.trace.v1.ExportTraceServiceResponse, a, l);
                }, "name", {
                  value: "Export"
                });
                return s;
              }();
              o.ExportTraceServiceRequest = function () {
                function s(i) {
                  if (this.resourceSpans = [], i) {
                    for (var a = Object.keys(i), l = 0; l < a.length; ++l) {
                      if (i[a[l]] != null) {
                        this[a[l]] = i[a[l]];
                      }
                    }
                  }
                }
                s.prototype.resourceSpans = Lt.emptyArray;
                s.create = function (a) {
                  return new s(a);
                };
                s.HS = function (a, l) {
                  if (!l) {
                    l = Im.create();
                  }
                  if (a.resourceSpans != null && a.resourceSpans.length) {
                    for (var c = 0; c < a.resourceSpans.length; ++c) {
                      At.opentelemetry.proto.trace.v1.ResourceSpans.HS(a.resourceSpans[c], l.uint32(10).fork()).ldelim();
                    }
                  }
                  return l;
                };
                s.encodeDelimited = function (a, l) {
                  return this.HS(a, l).ldelim();
                };
                s.oC = function (a, l, c) {
                  if (!(a instanceof Jr)) {
                    a = Jr.create(a);
                  }
                  var u = l === undefined ? a.len : a.pos + l;
                  var d = new At.opentelemetry.proto.collector.trace.v1.ExportTraceServiceRequest();
                  while (a.pos < u) {
                    var p = a.uint32();
                    if (p === c) {
                      break;
                    }
                    switch (p >>> 3) {
                      case 1:
                        {
                          if (!(d.resourceSpans && d.resourceSpans.length)) {
                            d.resourceSpans = [];
                          }
                          d.resourceSpans.push(At.opentelemetry.proto.trace.v1.ResourceSpans.oC(a, a.uint32()));
                          break;
                        }
                      default:
                        a.skipType(p & 7);
                        break;
                    }
                  }
                  return d;
                };
                s.decodeDelimited = function (a) {
                  if (!(a instanceof Jr)) {
                    a = new Jr(a);
                  }
                  return this.oC(a, a.uint32());
                };
                s.verify = function (a) {
                  if (typeof a !== "object" || a === null) {
                    return "object expected";
                  }
                  if (a.resourceSpans != null && a.hasOwnProperty("resourceSpans")) {
                    if (!Array.isArray(a.resourceSpans)) {
                      return "resourceSpans: array expected";
                    }
                    for (var l = 0; l < a.resourceSpans.length; ++l) {
                      var c = At.opentelemetry.proto.trace.v1.ResourceSpans.verify(a.resourceSpans[l]);
                      if (c) {
                        return "resourceSpans." + c;
                      }
                    }
                  }
                  return null;
                };
                s.fromObject = function (a) {
                  if (a instanceof At.opentelemetry.proto.collector.trace.v1.ExportTraceServiceRequest) {
                    return a;
                  }
                  var l = new At.opentelemetry.proto.collector.trace.v1.ExportTraceServiceRequest();
                  if (a.resourceSpans) {
                    if (!Array.isArray(a.resourceSpans)) {
                      throw TypeError(".opentelemetry.proto.collector.trace.v1.ExportTraceServiceRequest.resourceSpans: array expected");
                    }
                    l.resourceSpans = [];
                    for (var c = 0; c < a.resourceSpans.length; ++c) {
                      if (typeof a.resourceSpans[c] !== "object") {
                        throw TypeError(".opentelemetry.proto.collector.trace.v1.ExportTraceServiceRequest.resourceSpans: object expected");
                      }
                      l.resourceSpans[c] = At.opentelemetry.proto.trace.v1.ResourceSpans.fromObject(a.resourceSpans[c]);
                    }
                  }
                  return l;
                };
                s.toObject = function (a, l) {
                  if (!l) {
                    l = {};
                  }
                  var c = {};
                  if (l.arrays || l.defaults) {
                    c.resourceSpans = [];
                  }
                  if (a.resourceSpans && a.resourceSpans.length) {
                    c.resourceSpans = [];
                    for (var u = 0; u < a.resourceSpans.length; ++u) {
                      c.resourceSpans[u] = At.opentelemetry.proto.trace.v1.ResourceSpans.toObject(a.resourceSpans[u], l);
                    }
                  }
                  return c;
                };
                s.prototype.toJSON = function () {
                  return this.constructor.toObject(this, rd.util.toJSONOptions);
                };
                s.getTypeUrl = function (a) {
                  if (a === undefined) {
                    a = "type.googleapis.com";
                  }
                  return a + "/opentelemetry.proto.collector.trace.v1.ExportTraceServiceRequest";
                };
                return s;
              }();
              o.ExportTraceServiceResponse = function () {
                function s(i) {
                  if (i) {
                    for (var a = Object.keys(i), l = 0; l < a.length; ++l) {
                      if (i[a[l]] != null) {
                        this[a[l]] = i[a[l]];
                      }
                    }
                  }
                }
                s.prototype.partialSuccess = null;
                s.create = function (a) {
                  return new s(a);
                };
                s.HS = function (a, l) {
                  if (!l) {
                    l = Im.create();
                  }
                  if (a.partialSuccess != null && Object.hasOwnProperty.call(a, "partialSuccess")) {
                    At.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess.HS(a.partialSuccess, l.uint32(10).fork()).ldelim();
                  }
                  return l;
                };
                s.encodeDelimited = function (a, l) {
                  return this.HS(a, l).ldelim();
                };
                s.oC = function (a, l, c) {
                  if (!(a instanceof Jr)) {
                    a = Jr.create(a);
                  }
                  var u = l === undefined ? a.len : a.pos + l;
                  var d = new At.opentelemetry.proto.collector.trace.v1.ExportTraceServiceResponse();
                  while (a.pos < u) {
                    var p = a.uint32();
                    if (p === c) {
                      break;
                    }
                    switch (p >>> 3) {
                      case 1:
                        {
                          d.partialSuccess = At.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess.oC(a, a.uint32());
                          break;
                        }
                      default:
                        a.skipType(p & 7);
                        break;
                    }
                  }
                  return d;
                };
                s.decodeDelimited = function (a) {
                  if (!(a instanceof Jr)) {
                    a = new Jr(a);
                  }
                  return this.oC(a, a.uint32());
                };
                s.verify = function (a) {
                  if (typeof a !== "object" || a === null) {
                    return "object expected";
                  }
                  if (a.partialSuccess != null && a.hasOwnProperty("partialSuccess")) {
                    var l = At.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess.verify(a.partialSuccess);
                    if (l) {
                      return "partialSuccess." + l;
                    }
                  }
                  return null;
                };
                s.fromObject = function (a) {
                  if (a instanceof At.opentelemetry.proto.collector.trace.v1.ExportTraceServiceResponse) {
                    return a;
                  }
                  var l = new At.opentelemetry.proto.collector.trace.v1.ExportTraceServiceResponse();
                  if (a.partialSuccess != null) {
                    if (typeof a.partialSuccess !== "object") {
                      throw TypeError(".opentelemetry.proto.collector.trace.v1.ExportTraceServiceResponse.partialSuccess: object expected");
                    }
                    l.partialSuccess = At.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess.fromObject(a.partialSuccess);
                  }
                  return l;
                };
                s.toObject = function (a, l) {
                  if (!l) {
                    l = {};
                  }
                  var c = {};
                  if (l.defaults) {
                    c.partialSuccess = null;
                  }
                  if (a.partialSuccess != null && a.hasOwnProperty("partialSuccess")) {
                    c.partialSuccess = At.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess.toObject(a.partialSuccess, l);
                  }
                  return c;
                };
                s.prototype.toJSON = function () {
                  return this.constructor.toObject(this, rd.util.toJSONOptions);
                };
                s.getTypeUrl = function (a) {
                  if (a === undefined) {
                    a = "type.googleapis.com";
                  }
                  return a + "/opentelemetry.proto.collector.trace.v1.ExportTraceServiceResponse";
                };
                return s;
              }();
              o.ExportTracePartialSuccess = function () {
                function s(i) {
                  if (i) {
                    for (var a = Object.keys(i), l = 0; l < a.length; ++l) {
                      if (i[a[l]] != null) {
                        this[a[l]] = i[a[l]];
                      }
                    }
                  }
                }
                s.prototype.rejectedSpans = null;
                s.prototype.errorMessage = null;
                s.create = function (a) {
                  return new s(a);
                };
                s.HS = function (a, l) {
                  if (!l) {
                    l = Im.create();
                  }
                  if (a.rejectedSpans != null && Object.hasOwnProperty.call(a, "rejectedSpans")) {
                    l.uint32(8).int64(a.rejectedSpans);
                  }
                  if (a.errorMessage != null && Object.hasOwnProperty.call(a, "errorMessage")) {
                    l.uint32(18).string(a.errorMessage);
                  }
                  return l;
                };
                s.encodeDelimited = function (a, l) {
                  return this.HS(a, l).ldelim();
                };
                s.oC = function (a, l, c) {
                  if (!(a instanceof Jr)) {
                    a = Jr.create(a);
                  }
                  var u = l === undefined ? a.len : a.pos + l;
                  var d = new At.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess();
                  while (a.pos < u) {
                    var p = a.uint32();
                    if (p === c) {
                      break;
                    }
                    switch (p >>> 3) {
                      case 1:
                        {
                          d.rejectedSpans = a.int64();
                          break;
                        }
                      case 2:
                        {
                          d.errorMessage = a.string();
                          break;
                        }
                      default:
                        a.skipType(p & 7);
                        break;
                    }
                  }
                  return d;
                };
                s.decodeDelimited = function (a) {
                  if (!(a instanceof Jr)) {
                    a = new Jr(a);
                  }
                  return this.oC(a, a.uint32());
                };
                s.verify = function (a) {
                  if (typeof a !== "object" || a === null) {
                    return "object expected";
                  }
                  if (a.rejectedSpans != null && a.hasOwnProperty("rejectedSpans")) {
                    if (!Lt.isInteger(a.rejectedSpans) && !(a.rejectedSpans && Lt.isInteger(a.rejectedSpans.low) && Lt.isInteger(a.rejectedSpans.high))) {
                      return "rejectedSpans: integer|Long expected";
                    }
                  }
                  if (a.errorMessage != null && a.hasOwnProperty("errorMessage")) {
                    if (!Lt.isString(a.errorMessage)) {
                      return "errorMessage: string expected";
                    }
                  }
                  return null;
                };
                s.fromObject = function (a) {
                  if (a instanceof At.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess) {
                    return a;
                  }
                  var l = new At.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess();
                  if (a.rejectedSpans != null) {
                    if (Lt.Long) {
                      (l.rejectedSpans = Lt.Long.fromValue(a.rejectedSpans)).unsigned = false;
                    } else if (typeof a.rejectedSpans === "string") {
                      l.rejectedSpans = parseInt(a.rejectedSpans, 10);
                    } else if (typeof a.rejectedSpans === "number") {
                      l.rejectedSpans = a.rejectedSpans;
                    } else if (typeof a.rejectedSpans === "object") {
                      l.rejectedSpans = new Lt.LongBits(a.rejectedSpans.low >>> 0, a.rejectedSpans.high >>> 0).toNumber();
                    }
                  }
                  if (a.errorMessage != null) {
                    l.errorMessage = String(a.errorMessage);
                  }
                  return l;
                };
                s.toObject = function (a, l) {
                  if (!l) {
                    l = {};
                  }
                  var c = {};
                  if (l.defaults) {
                    if (Lt.Long) {
                      var u = new Lt.Long(0, 0, false);
                      c.rejectedSpans = l.longs === String ? u.toString() : l.longs === Number ? u.toNumber() : u;
                    } else {
                      c.rejectedSpans = l.longs === String ? "0" : 0;
                    }
                    c.errorMessage = "";
                  }
                  if (a.rejectedSpans != null && a.hasOwnProperty("rejectedSpans")) {
                    if (typeof a.rejectedSpans === "number") {
                      c.rejectedSpans = l.longs === String ? String(a.rejectedSpans) : a.rejectedSpans;
                    } else {
                      c.rejectedSpans = l.longs === String ? Lt.Long.prototype.toString.call(a.rejectedSpans) : l.longs === Number ? new Lt.LongBits(a.rejectedSpans.low >>> 0, a.rejectedSpans.high >>> 0).toNumber() : a.rejectedSpans;
                    }
                  }
                  if (a.errorMessage != null && a.hasOwnProperty("errorMessage")) {
                    c.errorMessage = a.errorMessage;
                  }
                  return c;
                };
                s.prototype.toJSON = function () {
                  return this.constructor.toObject(this, rd.util.toJSONOptions);
                };
                s.getTypeUrl = function (a) {
                  if (a === undefined) {
                    a = "type.googleapis.com";
                  }
                  return a + "/opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess";
                };
                return s;
              }();
              return o;
            }();
            return r;
          }();
          n.metrics = function () {
            var r = {};
            r.v1 = function () {
              var o = {};
              o.MetricsService = function () {
                function s(i, a, l) {
                  rd.rpc.Service.call(this, i, a, l);
                }
                (s.prototype = Object.create(rd.rpc.Service.prototype)).constructor = s;
                s.create = function (a, l, c) {
                  return new this(a, l, c);
                };
                Object.defineProperty(s.prototype.export = function i(a, l) {
                  return this.rpcCall(i, At.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceRequest, At.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse, a, l);
                }, "name", {
                  value: "Export"
                });
                return s;
              }();
              o.ExportMetricsServiceRequest = function () {
                function s(i) {
                  if (this.resourceMetrics = [], i) {
                    for (var a = Object.keys(i), l = 0; l < a.length; ++l) {
                      if (i[a[l]] != null) {
                        this[a[l]] = i[a[l]];
                      }
                    }
                  }
                }
                s.prototype.resourceMetrics = Lt.emptyArray;
                s.create = function (a) {
                  return new s(a);
                };
                s.HS = function (a, l) {
                  if (!l) {
                    l = Im.create();
                  }
                  if (a.resourceMetrics != null && a.resourceMetrics.length) {
                    for (var c = 0; c < a.resourceMetrics.length; ++c) {
                      At.opentelemetry.proto.metrics.v1.ResourceMetrics.HS(a.resourceMetrics[c], l.uint32(10).fork()).ldelim();
                    }
                  }
                  return l;
                };
                s.encodeDelimited = function (a, l) {
                  return this.HS(a, l).ldelim();
                };
                s.oC = function (a, l, c) {
                  if (!(a instanceof Jr)) {
                    a = Jr.create(a);
                  }
                  var u = l === undefined ? a.len : a.pos + l;
                  var d = new At.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceRequest();
                  while (a.pos < u) {
                    var p = a.uint32();
                    if (p === c) {
                      break;
                    }
                    switch (p >>> 3) {
                      case 1:
                        {
                          if (!(d.resourceMetrics && d.resourceMetrics.length)) {
                            d.resourceMetrics = [];
                          }
                          d.resourceMetrics.push(At.opentelemetry.proto.metrics.v1.ResourceMetrics.oC(a, a.uint32()));
                          break;
                        }
                      default:
                        a.skipType(p & 7);
                        break;
                    }
                  }
                  return d;
                };
                s.decodeDelimited = function (a) {
                  if (!(a instanceof Jr)) {
                    a = new Jr(a);
                  }
                  return this.oC(a, a.uint32());
                };
                s.verify = function (a) {
                  if (typeof a !== "object" || a === null) {
                    return "object expected";
                  }
                  if (a.resourceMetrics != null && a.hasOwnProperty("resourceMetrics")) {
                    if (!Array.isArray(a.resourceMetrics)) {
                      return "resourceMetrics: array expected";
                    }
                    for (var l = 0; l < a.resourceMetrics.length; ++l) {
                      var c = At.opentelemetry.proto.metrics.v1.ResourceMetrics.verify(a.resourceMetrics[l]);
                      if (c) {
                        return "resourceMetrics." + c;
                      }
                    }
                  }
                  return null;
                };
                s.fromObject = function (a) {
                  if (a instanceof At.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceRequest) {
                    return a;
                  }
                  var l = new At.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceRequest();
                  if (a.resourceMetrics) {
                    if (!Array.isArray(a.resourceMetrics)) {
                      throw TypeError(".opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceRequest.resourceMetrics: array expected");
                    }
                    l.resourceMetrics = [];
                    for (var c = 0; c < a.resourceMetrics.length; ++c) {
                      if (typeof a.resourceMetrics[c] !== "object") {
                        throw TypeError(".opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceRequest.resourceMetrics: object expected");
                      }
                      l.resourceMetrics[c] = At.opentelemetry.proto.metrics.v1.ResourceMetrics.fromObject(a.resourceMetrics[c]);
                    }
                  }
                  return l;
                };
                s.toObject = function (a, l) {
                  if (!l) {
                    l = {};
                  }
                  var c = {};
                  if (l.arrays || l.defaults) {
                    c.resourceMetrics = [];
                  }
                  if (a.resourceMetrics && a.resourceMetrics.length) {
                    c.resourceMetrics = [];
                    for (var u = 0; u < a.resourceMetrics.length; ++u) {
                      c.resourceMetrics[u] = At.opentelemetry.proto.metrics.v1.ResourceMetrics.toObject(a.resourceMetrics[u], l);
                    }
                  }
                  return c;
                };
                s.prototype.toJSON = function () {
                  return this.constructor.toObject(this, rd.util.toJSONOptions);
                };
                s.getTypeUrl = function (a) {
                  if (a === undefined) {
                    a = "type.googleapis.com";
                  }
                  return a + "/opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceRequest";
                };
                return s;
              }();
              o.ExportMetricsServiceResponse = function () {
                function s(i) {
                  if (i) {
                    for (var a = Object.keys(i), l = 0; l < a.length; ++l) {
                      if (i[a[l]] != null) {
                        this[a[l]] = i[a[l]];
                      }
                    }
                  }
                }
                s.prototype.partialSuccess = null;
                s.create = function (a) {
                  return new s(a);
                };
                s.HS = function (a, l) {
                  if (!l) {
                    l = Im.create();
                  }
                  if (a.partialSuccess != null && Object.hasOwnProperty.call(a, "partialSuccess")) {
                    At.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess.HS(a.partialSuccess, l.uint32(10).fork()).ldelim();
                  }
                  return l;
                };
                s.encodeDelimited = function (a, l) {
                  return this.HS(a, l).ldelim();
                };
                s.oC = function (a, l, c) {
                  if (!(a instanceof Jr)) {
                    a = Jr.create(a);
                  }
                  var u = l === undefined ? a.len : a.pos + l;
                  var d = new At.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse();
                  while (a.pos < u) {
                    var p = a.uint32();
                    if (p === c) {
                      break;
                    }
                    switch (p >>> 3) {
                      case 1:
                        {
                          d.partialSuccess = At.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess.oC(a, a.uint32());
                          break;
                        }
                      default:
                        a.skipType(p & 7);
                        break;
                    }
                  }
                  return d;
                };
                s.decodeDelimited = function (a) {
                  if (!(a instanceof Jr)) {
                    a = new Jr(a);
                  }
                  return this.oC(a, a.uint32());
                };
                s.verify = function (a) {
                  if (typeof a !== "object" || a === null) {
                    return "object expected";
                  }
                  if (a.partialSuccess != null && a.hasOwnProperty("partialSuccess")) {
                    var l = At.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess.verify(a.partialSuccess);
                    if (l) {
                      return "partialSuccess." + l;
                    }
                  }
                  return null;
                };
                s.fromObject = function (a) {
                  if (a instanceof At.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse) {
                    return a;
                  }
                  var l = new At.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse();
                  if (a.partialSuccess != null) {
                    if (typeof a.partialSuccess !== "object") {
                      throw TypeError(".opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse.partialSuccess: object expected");
                    }
                    l.partialSuccess = At.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess.fromObject(a.partialSuccess);
                  }
                  return l;
                };
                s.toObject = function (a, l) {
                  if (!l) {
                    l = {};
                  }
                  var c = {};
                  if (l.defaults) {
                    c.partialSuccess = null;
                  }
                  if (a.partialSuccess != null && a.hasOwnProperty("partialSuccess")) {
                    c.partialSuccess = At.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess.toObject(a.partialSuccess, l);
                  }
                  return c;
                };
                s.prototype.toJSON = function () {
                  return this.constructor.toObject(this, rd.util.toJSONOptions);
                };
                s.getTypeUrl = function (a) {
                  if (a === undefined) {
                    a = "type.googleapis.com";
                  }
                  return a + "/opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse";
                };
                return s;
              }();
              o.ExportMetricsPartialSuccess = function () {
                function s(i) {
                  if (i) {
                    for (var a = Object.keys(i), l = 0; l < a.length; ++l) {
                      if (i[a[l]] != null) {
                        this[a[l]] = i[a[l]];
                      }
                    }
                  }
                }
                s.prototype.rejectedDataPoints = null;
                s.prototype.errorMessage = null;
                s.create = function (a) {
                  return new s(a);
                };
                s.HS = function (a, l) {
                  if (!l) {
                    l = Im.create();
                  }
                  if (a.rejectedDataPoints != null && Object.hasOwnProperty.call(a, "rejectedDataPoints")) {
                    l.uint32(8).int64(a.rejectedDataPoints);
                  }
                  if (a.errorMessage != null && Object.hasOwnProperty.call(a, "errorMessage")) {
                    l.uint32(18).string(a.errorMessage);
                  }
                  return l;
                };
                s.encodeDelimited = function (a, l) {
                  return this.HS(a, l).ldelim();
                };
                s.oC = function (a, l, c) {
                  if (!(a instanceof Jr)) {
                    a = Jr.create(a);
                  }
                  var u = l === undefined ? a.len : a.pos + l;
                  var d = new At.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess();
                  while (a.pos < u) {
                    var p = a.uint32();
                    if (p === c) {
                      break;
                    }
                    switch (p >>> 3) {
                      case 1:
                        {
                          d.rejectedDataPoints = a.int64();
                          break;
                        }
                      case 2:
                        {
                          d.errorMessage = a.string();
                          break;
                        }
                      default:
                        a.skipType(p & 7);
                        break;
                    }
                  }
                  return d;
                };
                s.decodeDelimited = function (a) {
                  if (!(a instanceof Jr)) {
                    a = new Jr(a);
                  }
                  return this.oC(a, a.uint32());
                };
                s.verify = function (a) {
                  if (typeof a !== "object" || a === null) {
                    return "object expected";
                  }
                  if (a.rejectedDataPoints != null && a.hasOwnProperty("rejectedDataPoints")) {
                    if (!Lt.isInteger(a.rejectedDataPoints) && !(a.rejectedDataPoints && Lt.isInteger(a.rejectedDataPoints.low) && Lt.isInteger(a.rejectedDataPoints.high))) {
                      return "rejectedDataPoints: integer|Long expected";
                    }
                  }
                  if (a.errorMessage != null && a.hasOwnProperty("errorMessage")) {
                    if (!Lt.isString(a.errorMessage)) {
                      return "errorMessage: string expected";
                    }
                  }
                  return null;
                };
                s.fromObject = function (a) {
                  if (a instanceof At.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess) {
                    return a;
                  }
                  var l = new At.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess();
                  if (a.rejectedDataPoints != null) {
                    if (Lt.Long) {
                      (l.rejectedDataPoints = Lt.Long.fromValue(a.rejectedDataPoints)).unsigned = false;
                    } else if (typeof a.rejectedDataPoints === "string") {
                      l.rejectedDataPoints = parseInt(a.rejectedDataPoints, 10);
                    } else if (typeof a.rejectedDataPoints === "number") {
                      l.rejectedDataPoints = a.rejectedDataPoints;
                    } else if (typeof a.rejectedDataPoints === "object") {
                      l.rejectedDataPoints = new Lt.LongBits(a.rejectedDataPoints.low >>> 0, a.rejectedDataPoints.high >>> 0).toNumber();
                    }
                  }
                  if (a.errorMessage != null) {
                    l.errorMessage = String(a.errorMessage);
                  }
                  return l;
                };
                s.toObject = function (a, l) {
                  if (!l) {
                    l = {};
                  }
                  var c = {};
                  if (l.defaults) {
                    if (Lt.Long) {
                      var u = new Lt.Long(0, 0, false);
                      c.rejectedDataPoints = l.longs === String ? u.toString() : l.longs === Number ? u.toNumber() : u;
                    } else {
                      c.rejectedDataPoints = l.longs === String ? "0" : 0;
                    }
                    c.errorMessage = "";
                  }
                  if (a.rejectedDataPoints != null && a.hasOwnProperty("rejectedDataPoints")) {
                    if (typeof a.rejectedDataPoints === "number") {
                      c.rejectedDataPoints = l.longs === String ? String(a.rejectedDataPoints) : a.rejectedDataPoints;
                    } else {
                      c.rejectedDataPoints = l.longs === String ? Lt.Long.prototype.toString.call(a.rejectedDataPoints) : l.longs === Number ? new Lt.LongBits(a.rejectedDataPoints.low >>> 0, a.rejectedDataPoints.high >>> 0).toNumber() : a.rejectedDataPoints;
                    }
                  }
                  if (a.errorMessage != null && a.hasOwnProperty("errorMessage")) {
                    c.errorMessage = a.errorMessage;
                  }
                  return c;
                };
                s.prototype.toJSON = function () {
                  return this.constructor.toObject(this, rd.util.toJSONOptions);
                };
                s.getTypeUrl = function (a) {
                  if (a === undefined) {
                    a = "type.googleapis.com";
                  }
                  return a + "/opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess";
                };
                return s;
              }();
              return o;
            }();
            return r;
          }();
          n.logs = function () {
            var r = {};
            r.v1 = function () {
              var o = {};
              o.LogsService = function () {
                function s(i, a, l) {
                  rd.rpc.Service.call(this, i, a, l);
                }
                (s.prototype = Object.create(rd.rpc.Service.prototype)).constructor = s;
                s.create = function (a, l, c) {
                  return new this(a, l, c);
                };
                Object.defineProperty(s.prototype.export = function i(a, l) {
                  return this.rpcCall(i, At.opentelemetry.proto.collector.logs.v1.ExportLogsServiceRequest, At.opentelemetry.proto.collector.logs.v1.ExportLogsServiceResponse, a, l);
                }, "name", {
                  value: "Export"
                });
                return s;
              }();
              o.ExportLogsServiceRequest = function () {
                function s(i) {
                  if (this.resourceLogs = [], i) {
                    for (var a = Object.keys(i), l = 0; l < a.length; ++l) {
                      if (i[a[l]] != null) {
                        this[a[l]] = i[a[l]];
                      }
                    }
                  }
                }
                s.prototype.resourceLogs = Lt.emptyArray;
                s.create = function (a) {
                  return new s(a);
                };
                s.HS = function (a, l) {
                  if (!l) {
                    l = Im.create();
                  }
                  if (a.resourceLogs != null && a.resourceLogs.length) {
                    for (var c = 0; c < a.resourceLogs.length; ++c) {
                      At.opentelemetry.proto.logs.v1.ResourceLogs.HS(a.resourceLogs[c], l.uint32(10).fork()).ldelim();
                    }
                  }
                  return l;
                };
                s.encodeDelimited = function (a, l) {
                  return this.HS(a, l).ldelim();
                };
                s.oC = function (a, l, c) {
                  if (!(a instanceof Jr)) {
                    a = Jr.create(a);
                  }
                  var u = l === undefined ? a.len : a.pos + l;
                  var d = new At.opentelemetry.proto.collector.logs.v1.ExportLogsServiceRequest();
                  while (a.pos < u) {
                    var p = a.uint32();
                    if (p === c) {
                      break;
                    }
                    switch (p >>> 3) {
                      case 1:
                        {
                          if (!(d.resourceLogs && d.resourceLogs.length)) {
                            d.resourceLogs = [];
                          }
                          d.resourceLogs.push(At.opentelemetry.proto.logs.v1.ResourceLogs.oC(a, a.uint32()));
                          break;
                        }
                      default:
                        a.skipType(p & 7);
                        break;
                    }
                  }
                  return d;
                };
                s.decodeDelimited = function (a) {
                  if (!(a instanceof Jr)) {
                    a = new Jr(a);
                  }
                  return this.oC(a, a.uint32());
                };
                s.verify = function (a) {
                  if (typeof a !== "object" || a === null) {
                    return "object expected";
                  }
                  if (a.resourceLogs != null && a.hasOwnProperty("resourceLogs")) {
                    if (!Array.isArray(a.resourceLogs)) {
                      return "resourceLogs: array expected";
                    }
                    for (var l = 0; l < a.resourceLogs.length; ++l) {
                      var c = At.opentelemetry.proto.logs.v1.ResourceLogs.verify(a.resourceLogs[l]);
                      if (c) {
                        return "resourceLogs." + c;
                      }
                    }
                  }
                  return null;
                };
                s.fromObject = function (a) {
                  if (a instanceof At.opentelemetry.proto.collector.logs.v1.ExportLogsServiceRequest) {
                    return a;
                  }
                  var l = new At.opentelemetry.proto.collector.logs.v1.ExportLogsServiceRequest();
                  if (a.resourceLogs) {
                    if (!Array.isArray(a.resourceLogs)) {
                      throw TypeError(".opentelemetry.proto.collector.logs.v1.ExportLogsServiceRequest.resourceLogs: array expected");
                    }
                    l.resourceLogs = [];
                    for (var c = 0; c < a.resourceLogs.length; ++c) {
                      if (typeof a.resourceLogs[c] !== "object") {
                        throw TypeError(".opentelemetry.proto.collector.logs.v1.ExportLogsServiceRequest.resourceLogs: object expected");
                      }
                      l.resourceLogs[c] = At.opentelemetry.proto.logs.v1.ResourceLogs.fromObject(a.resourceLogs[c]);
                    }
                  }
                  return l;
                };
                s.toObject = function (a, l) {
                  if (!l) {
                    l = {};
                  }
                  var c = {};
                  if (l.arrays || l.defaults) {
                    c.resourceLogs = [];
                  }
                  if (a.resourceLogs && a.resourceLogs.length) {
                    c.resourceLogs = [];
                    for (var u = 0; u < a.resourceLogs.length; ++u) {
                      c.resourceLogs[u] = At.opentelemetry.proto.logs.v1.ResourceLogs.toObject(a.resourceLogs[u], l);
                    }
                  }
                  return c;
                };
                s.prototype.toJSON = function () {
                  return this.constructor.toObject(this, rd.util.toJSONOptions);
                };
                s.getTypeUrl = function (a) {
                  if (a === undefined) {
                    a = "type.googleapis.com";
                  }
                  return a + "/opentelemetry.proto.collector.logs.v1.ExportLogsServiceRequest";
                };
                return s;
              }();
              o.ExportLogsServiceResponse = function () {
                function s(i) {
                  if (i) {
                    for (var a = Object.keys(i), l = 0; l < a.length; ++l) {
                      if (i[a[l]] != null) {
                        this[a[l]] = i[a[l]];
                      }
                    }
                  }
                }
                s.prototype.partialSuccess = null;
                s.create = function (a) {
                  return new s(a);
                };
                s.HS = function (a, l) {
                  if (!l) {
                    l = Im.create();
                  }
                  if (a.partialSuccess != null && Object.hasOwnProperty.call(a, "partialSuccess")) {
                    At.opentelemetry.proto.collector.logs.v1.ExportLogsPartialSuccess.HS(a.partialSuccess, l.uint32(10).fork()).ldelim();
                  }
                  return l;
                };
                s.encodeDelimited = function (a, l) {
                  return this.HS(a, l).ldelim();
                };
                s.oC = function (a, l, c) {
                  if (!(a instanceof Jr)) {
                    a = Jr.create(a);
                  }
                  var u = l === undefined ? a.len : a.pos + l;
                  var d = new At.opentelemetry.proto.collector.logs.v1.ExportLogsServiceResponse();
                  while (a.pos < u) {
                    var p = a.uint32();
                    if (p === c) {
                      break;
                    }
                    switch (p >>> 3) {
                      case 1:
                        {
                          d.partialSuccess = At.opentelemetry.proto.collector.logs.v1.ExportLogsPartialSuccess.oC(a, a.uint32());
                          break;
                        }
                      default:
                        a.skipType(p & 7);
                        break;
                    }
                  }
                  return d;
                };
                s.decodeDelimited = function (a) {
                  if (!(a instanceof Jr)) {
                    a = new Jr(a);
                  }
                  return this.oC(a, a.uint32());
                };
                s.verify = function (a) {
                  if (typeof a !== "object" || a === null) {
                    return "object expected";
                  }
                  if (a.partialSuccess != null && a.hasOwnProperty("partialSuccess")) {
                    var l = At.opentelemetry.proto.collector.logs.v1.ExportLogsPartialSuccess.verify(a.partialSuccess);
                    if (l) {
                      return "partialSuccess." + l;
                    }
                  }
                  return null;
                };
                s.fromObject = function (a) {
                  if (a instanceof At.opentelemetry.proto.collector.logs.v1.ExportLogsServiceResponse) {
                    return a;
                  }
                  var l = new At.opentelemetry.proto.collector.logs.v1.ExportLogsServiceResponse();
                  if (a.partialSuccess != null) {
                    if (typeof a.partialSuccess !== "object") {
                      throw TypeError(".opentelemetry.proto.collector.logs.v1.ExportLogsServiceResponse.partialSuccess: object expected");
                    }
                    l.partialSuccess = At.opentelemetry.proto.collector.logs.v1.ExportLogsPartialSuccess.fromObject(a.partialSuccess);
                  }
                  return l;
                };
                s.toObject = function (a, l) {
                  if (!l) {
                    l = {};
                  }
                  var c = {};
                  if (l.defaults) {
                    c.partialSuccess = null;
                  }
                  if (a.partialSuccess != null && a.hasOwnProperty("partialSuccess")) {
                    c.partialSuccess = At.opentelemetry.proto.collector.logs.v1.ExportLogsPartialSuccess.toObject(a.partialSuccess, l);
                  }
                  return c;
                };
                s.prototype.toJSON = function () {
                  return this.constructor.toObject(this, rd.util.toJSONOptions);
                };
                s.getTypeUrl = function (a) {
                  if (a === undefined) {
                    a = "type.googleapis.com";
                  }
                  return a + "/opentelemetry.proto.collector.logs.v1.ExportLogsServiceResponse";
                };
                return s;
              }();
              o.ExportLogsPartialSuccess = function () {
                function s(i) {
                  if (i) {
                    for (var a = Object.keys(i), l = 0; l < a.length; ++l) {
                      if (i[a[l]] != null) {
                        this[a[l]] = i[a[l]];
                      }
                    }
                  }
                }
                s.prototype.rejectedLogRecords = null;
                s.prototype.errorMessage = null;
                s.create = function (a) {
                  return new s(a);
                };
                s.HS = function (a, l) {
                  if (!l) {
                    l = Im.create();
                  }
                  if (a.rejectedLogRecords != null && Object.hasOwnProperty.call(a, "rejectedLogRecords")) {
                    l.uint32(8).int64(a.rejectedLogRecords);
                  }
                  if (a.errorMessage != null && Object.hasOwnProperty.call(a, "errorMessage")) {
                    l.uint32(18).string(a.errorMessage);
                  }
                  return l;
                };
                s.encodeDelimited = function (a, l) {
                  return this.HS(a, l).ldelim();
                };
                s.oC = function (a, l, c) {
                  if (!(a instanceof Jr)) {
                    a = Jr.create(a);
                  }
                  var u = l === undefined ? a.len : a.pos + l;
                  var d = new At.opentelemetry.proto.collector.logs.v1.ExportLogsPartialSuccess();
                  while (a.pos < u) {
                    var p = a.uint32();
                    if (p === c) {
                      break;
                    }
                    switch (p >>> 3) {
                      case 1:
                        {
                          d.rejectedLogRecords = a.int64();
                          break;
                        }
                      case 2:
                        {
                          d.errorMessage = a.string();
                          break;
                        }
                      default:
                        a.skipType(p & 7);
                        break;
                    }
                  }
                  return d;
                };
                s.decodeDelimited = function (a) {
                  if (!(a instanceof Jr)) {
                    a = new Jr(a);
                  }
                  return this.oC(a, a.uint32());
                };
                s.verify = function (a) {
                  if (typeof a !== "object" || a === null) {
                    return "object expected";
                  }
                  if (a.rejectedLogRecords != null && a.hasOwnProperty("rejectedLogRecords")) {
                    if (!Lt.isInteger(a.rejectedLogRecords) && !(a.rejectedLogRecords && Lt.isInteger(a.rejectedLogRecords.low) && Lt.isInteger(a.rejectedLogRecords.high))) {
                      return "rejectedLogRecords: integer|Long expected";
                    }
                  }
                  if (a.errorMessage != null && a.hasOwnProperty("errorMessage")) {
                    if (!Lt.isString(a.errorMessage)) {
                      return "errorMessage: string expected";
                    }
                  }
                  return null;
                };
                s.fromObject = function (a) {
                  if (a instanceof At.opentelemetry.proto.collector.logs.v1.ExportLogsPartialSuccess) {
                    return a;
                  }
                  var l = new At.opentelemetry.proto.collector.logs.v1.ExportLogsPartialSuccess();
                  if (a.rejectedLogRecords != null) {
                    if (Lt.Long) {
                      (l.rejectedLogRecords = Lt.Long.fromValue(a.rejectedLogRecords)).unsigned = false;
                    } else if (typeof a.rejectedLogRecords === "string") {
                      l.rejectedLogRecords = parseInt(a.rejectedLogRecords, 10);
                    } else if (typeof a.rejectedLogRecords === "number") {
                      l.rejectedLogRecords = a.rejectedLogRecords;
                    } else if (typeof a.rejectedLogRecords === "object") {
                      l.rejectedLogRecords = new Lt.LongBits(a.rejectedLogRecords.low >>> 0, a.rejectedLogRecords.high >>> 0).toNumber();
                    }
                  }
                  if (a.errorMessage != null) {
                    l.errorMessage = String(a.errorMessage);
                  }
                  return l;
                };
                s.toObject = function (a, l) {
                  if (!l) {
                    l = {};
                  }
                  var c = {};
                  if (l.defaults) {
                    if (Lt.Long) {
                      var u = new Lt.Long(0, 0, false);
                      c.rejectedLogRecords = l.longs === String ? u.toString() : l.longs === Number ? u.toNumber() : u;
                    } else {
                      c.rejectedLogRecords = l.longs === String ? "0" : 0;
                    }
                    c.errorMessage = "";
                  }
                  if (a.rejectedLogRecords != null && a.hasOwnProperty("rejectedLogRecords")) {
                    if (typeof a.rejectedLogRecords === "number") {
                      c.rejectedLogRecords = l.longs === String ? String(a.rejectedLogRecords) : a.rejectedLogRecords;
                    } else {
                      c.rejectedLogRecords = l.longs === String ? Lt.Long.prototype.toString.call(a.rejectedLogRecords) : l.longs === Number ? new Lt.LongBits(a.rejectedLogRecords.low >>> 0, a.rejectedLogRecords.high >>> 0).toNumber() : a.rejectedLogRecords;
                    }
                  }
                  if (a.errorMessage != null && a.hasOwnProperty("errorMessage")) {
                    c.errorMessage = a.errorMessage;
                  }
                  return c;
                };
                s.prototype.toJSON = function () {
                  return this.constructor.toObject(this, rd.util.toJSONOptions);
                };
                s.getTypeUrl = function (a) {
                  if (a === undefined) {
                    a = "type.googleapis.com";
                  }
                  return a + "/opentelemetry.proto.collector.logs.v1.ExportLogsPartialSuccess";
                };
                return s;
              }();
              return o;
            }();
            return r;
          }();
          return n;
        }();
        t.metrics = function () {
          var n = {};
          n.v1 = function () {
            var r = {};
            r.MetricsData = function () {
              function o(s) {
                if (this.resourceMetrics = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.resourceMetrics = Lt.emptyArray;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.resourceMetrics != null && i.resourceMetrics.length) {
                  for (var l = 0; l < i.resourceMetrics.length; ++l) {
                    At.opentelemetry.proto.metrics.v1.ResourceMetrics.HS(i.resourceMetrics[l], a.uint32(10).fork()).ldelim();
                  }
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.metrics.v1.MetricsData();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        if (!(u.resourceMetrics && u.resourceMetrics.length)) {
                          u.resourceMetrics = [];
                        }
                        u.resourceMetrics.push(At.opentelemetry.proto.metrics.v1.ResourceMetrics.oC(i, i.uint32()));
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.resourceMetrics != null && i.hasOwnProperty("resourceMetrics")) {
                  if (!Array.isArray(i.resourceMetrics)) {
                    return "resourceMetrics: array expected";
                  }
                  for (var a = 0; a < i.resourceMetrics.length; ++a) {
                    var l = At.opentelemetry.proto.metrics.v1.ResourceMetrics.verify(i.resourceMetrics[a]);
                    if (l) {
                      return "resourceMetrics." + l;
                    }
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.metrics.v1.MetricsData) {
                  return i;
                }
                var a = new At.opentelemetry.proto.metrics.v1.MetricsData();
                if (i.resourceMetrics) {
                  if (!Array.isArray(i.resourceMetrics)) {
                    throw TypeError(".opentelemetry.proto.metrics.v1.MetricsData.resourceMetrics: array expected");
                  }
                  a.resourceMetrics = [];
                  for (var l = 0; l < i.resourceMetrics.length; ++l) {
                    if (typeof i.resourceMetrics[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.metrics.v1.MetricsData.resourceMetrics: object expected");
                    }
                    a.resourceMetrics[l] = At.opentelemetry.proto.metrics.v1.ResourceMetrics.fromObject(i.resourceMetrics[l]);
                  }
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.resourceMetrics = [];
                }
                if (i.resourceMetrics && i.resourceMetrics.length) {
                  l.resourceMetrics = [];
                  for (var c = 0; c < i.resourceMetrics.length; ++c) {
                    l.resourceMetrics[c] = At.opentelemetry.proto.metrics.v1.ResourceMetrics.toObject(i.resourceMetrics[c], a);
                  }
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.metrics.v1.MetricsData";
              };
              return o;
            }();
            r.ResourceMetrics = function () {
              function o(s) {
                if (this.scopeMetrics = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.resource = null;
              o.prototype.scopeMetrics = Lt.emptyArray;
              o.prototype.schemaUrl = null;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.resource != null && Object.hasOwnProperty.call(i, "resource")) {
                  At.opentelemetry.proto.resource.v1.Resource.HS(i.resource, a.uint32(10).fork()).ldelim();
                }
                if (i.scopeMetrics != null && i.scopeMetrics.length) {
                  for (var l = 0; l < i.scopeMetrics.length; ++l) {
                    At.opentelemetry.proto.metrics.v1.ScopeMetrics.HS(i.scopeMetrics[l], a.uint32(18).fork()).ldelim();
                  }
                }
                if (i.schemaUrl != null && Object.hasOwnProperty.call(i, "schemaUrl")) {
                  a.uint32(26).string(i.schemaUrl);
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.metrics.v1.ResourceMetrics();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        u.resource = At.opentelemetry.proto.resource.v1.Resource.oC(i, i.uint32());
                        break;
                      }
                    case 2:
                      {
                        if (!(u.scopeMetrics && u.scopeMetrics.length)) {
                          u.scopeMetrics = [];
                        }
                        u.scopeMetrics.push(At.opentelemetry.proto.metrics.v1.ScopeMetrics.oC(i, i.uint32()));
                        break;
                      }
                    case 3:
                      {
                        u.schemaUrl = i.string();
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.resource != null && i.hasOwnProperty("resource")) {
                  var a = At.opentelemetry.proto.resource.v1.Resource.verify(i.resource);
                  if (a) {
                    return "resource." + a;
                  }
                }
                if (i.scopeMetrics != null && i.hasOwnProperty("scopeMetrics")) {
                  if (!Array.isArray(i.scopeMetrics)) {
                    return "scopeMetrics: array expected";
                  }
                  for (var l = 0; l < i.scopeMetrics.length; ++l) {
                    var a = At.opentelemetry.proto.metrics.v1.ScopeMetrics.verify(i.scopeMetrics[l]);
                    if (a) {
                      return "scopeMetrics." + a;
                    }
                  }
                }
                if (i.schemaUrl != null && i.hasOwnProperty("schemaUrl")) {
                  if (!Lt.isString(i.schemaUrl)) {
                    return "schemaUrl: string expected";
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.metrics.v1.ResourceMetrics) {
                  return i;
                }
                var a = new At.opentelemetry.proto.metrics.v1.ResourceMetrics();
                if (i.resource != null) {
                  if (typeof i.resource !== "object") {
                    throw TypeError(".opentelemetry.proto.metrics.v1.ResourceMetrics.resource: object expected");
                  }
                  a.resource = At.opentelemetry.proto.resource.v1.Resource.fromObject(i.resource);
                }
                if (i.scopeMetrics) {
                  if (!Array.isArray(i.scopeMetrics)) {
                    throw TypeError(".opentelemetry.proto.metrics.v1.ResourceMetrics.scopeMetrics: array expected");
                  }
                  a.scopeMetrics = [];
                  for (var l = 0; l < i.scopeMetrics.length; ++l) {
                    if (typeof i.scopeMetrics[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.metrics.v1.ResourceMetrics.scopeMetrics: object expected");
                    }
                    a.scopeMetrics[l] = At.opentelemetry.proto.metrics.v1.ScopeMetrics.fromObject(i.scopeMetrics[l]);
                  }
                }
                if (i.schemaUrl != null) {
                  a.schemaUrl = String(i.schemaUrl);
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.scopeMetrics = [];
                }
                if (a.defaults) {
                  l.resource = null;
                  l.schemaUrl = "";
                }
                if (i.resource != null && i.hasOwnProperty("resource")) {
                  l.resource = At.opentelemetry.proto.resource.v1.Resource.toObject(i.resource, a);
                }
                if (i.scopeMetrics && i.scopeMetrics.length) {
                  l.scopeMetrics = [];
                  for (var c = 0; c < i.scopeMetrics.length; ++c) {
                    l.scopeMetrics[c] = At.opentelemetry.proto.metrics.v1.ScopeMetrics.toObject(i.scopeMetrics[c], a);
                  }
                }
                if (i.schemaUrl != null && i.hasOwnProperty("schemaUrl")) {
                  l.schemaUrl = i.schemaUrl;
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.metrics.v1.ResourceMetrics";
              };
              return o;
            }();
            r.ScopeMetrics = function () {
              function o(s) {
                if (this.metrics = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.scope = null;
              o.prototype.metrics = Lt.emptyArray;
              o.prototype.schemaUrl = null;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.scope != null && Object.hasOwnProperty.call(i, "scope")) {
                  At.opentelemetry.proto.common.v1.InstrumentationScope.HS(i.scope, a.uint32(10).fork()).ldelim();
                }
                if (i.metrics != null && i.metrics.length) {
                  for (var l = 0; l < i.metrics.length; ++l) {
                    At.opentelemetry.proto.metrics.v1.Metric.HS(i.metrics[l], a.uint32(18).fork()).ldelim();
                  }
                }
                if (i.schemaUrl != null && Object.hasOwnProperty.call(i, "schemaUrl")) {
                  a.uint32(26).string(i.schemaUrl);
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.metrics.v1.ScopeMetrics();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        u.scope = At.opentelemetry.proto.common.v1.InstrumentationScope.oC(i, i.uint32());
                        break;
                      }
                    case 2:
                      {
                        if (!(u.metrics && u.metrics.length)) {
                          u.metrics = [];
                        }
                        u.metrics.push(At.opentelemetry.proto.metrics.v1.Metric.oC(i, i.uint32()));
                        break;
                      }
                    case 3:
                      {
                        u.schemaUrl = i.string();
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.scope != null && i.hasOwnProperty("scope")) {
                  var a = At.opentelemetry.proto.common.v1.InstrumentationScope.verify(i.scope);
                  if (a) {
                    return "scope." + a;
                  }
                }
                if (i.metrics != null && i.hasOwnProperty("metrics")) {
                  if (!Array.isArray(i.metrics)) {
                    return "metrics: array expected";
                  }
                  for (var l = 0; l < i.metrics.length; ++l) {
                    var a = At.opentelemetry.proto.metrics.v1.Metric.verify(i.metrics[l]);
                    if (a) {
                      return "metrics." + a;
                    }
                  }
                }
                if (i.schemaUrl != null && i.hasOwnProperty("schemaUrl")) {
                  if (!Lt.isString(i.schemaUrl)) {
                    return "schemaUrl: string expected";
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.metrics.v1.ScopeMetrics) {
                  return i;
                }
                var a = new At.opentelemetry.proto.metrics.v1.ScopeMetrics();
                if (i.scope != null) {
                  if (typeof i.scope !== "object") {
                    throw TypeError(".opentelemetry.proto.metrics.v1.ScopeMetrics.scope: object expected");
                  }
                  a.scope = At.opentelemetry.proto.common.v1.InstrumentationScope.fromObject(i.scope);
                }
                if (i.metrics) {
                  if (!Array.isArray(i.metrics)) {
                    throw TypeError(".opentelemetry.proto.metrics.v1.ScopeMetrics.metrics: array expected");
                  }
                  a.metrics = [];
                  for (var l = 0; l < i.metrics.length; ++l) {
                    if (typeof i.metrics[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.metrics.v1.ScopeMetrics.metrics: object expected");
                    }
                    a.metrics[l] = At.opentelemetry.proto.metrics.v1.Metric.fromObject(i.metrics[l]);
                  }
                }
                if (i.schemaUrl != null) {
                  a.schemaUrl = String(i.schemaUrl);
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.metrics = [];
                }
                if (a.defaults) {
                  l.scope = null;
                  l.schemaUrl = "";
                }
                if (i.scope != null && i.hasOwnProperty("scope")) {
                  l.scope = At.opentelemetry.proto.common.v1.InstrumentationScope.toObject(i.scope, a);
                }
                if (i.metrics && i.metrics.length) {
                  l.metrics = [];
                  for (var c = 0; c < i.metrics.length; ++c) {
                    l.metrics[c] = At.opentelemetry.proto.metrics.v1.Metric.toObject(i.metrics[c], a);
                  }
                }
                if (i.schemaUrl != null && i.hasOwnProperty("schemaUrl")) {
                  l.schemaUrl = i.schemaUrl;
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.metrics.v1.ScopeMetrics";
              };
              return o;
            }();
            r.Metric = function () {
              function o(i) {
                if (this.metadata = [], i) {
                  for (var a = Object.keys(i), l = 0; l < a.length; ++l) {
                    if (i[a[l]] != null) {
                      this[a[l]] = i[a[l]];
                    }
                  }
                }
              }
              o.prototype.name = null;
              o.prototype.description = null;
              o.prototype.unit = null;
              o.prototype.gauge = null;
              o.prototype.sum = null;
              o.prototype.histogram = null;
              o.prototype.exponentialHistogram = null;
              o.prototype.summary = null;
              o.prototype.metadata = Lt.emptyArray;
              var s;
              Object.defineProperty(o.prototype, "data", {
                get: Lt.oneOfGetter(s = ["gauge", "sum", "histogram", "exponentialHistogram", "summary"]),
                set: Lt.oneOfSetter(s)
              });
              o.create = function (a) {
                return new o(a);
              };
              o.HS = function (a, l) {
                if (!l) {
                  l = Im.create();
                }
                if (a.name != null && Object.hasOwnProperty.call(a, "name")) {
                  l.uint32(10).string(a.name);
                }
                if (a.description != null && Object.hasOwnProperty.call(a, "description")) {
                  l.uint32(18).string(a.description);
                }
                if (a.unit != null && Object.hasOwnProperty.call(a, "unit")) {
                  l.uint32(26).string(a.unit);
                }
                if (a.gauge != null && Object.hasOwnProperty.call(a, "gauge")) {
                  At.opentelemetry.proto.metrics.v1.Gauge.HS(a.gauge, l.uint32(42).fork()).ldelim();
                }
                if (a.sum != null && Object.hasOwnProperty.call(a, "sum")) {
                  At.opentelemetry.proto.metrics.v1.Sum.HS(a.sum, l.uint32(58).fork()).ldelim();
                }
                if (a.histogram != null && Object.hasOwnProperty.call(a, "histogram")) {
                  At.opentelemetry.proto.metrics.v1.Histogram.HS(a.histogram, l.uint32(74).fork()).ldelim();
                }
                if (a.exponentialHistogram != null && Object.hasOwnProperty.call(a, "exponentialHistogram")) {
                  At.opentelemetry.proto.metrics.v1.ExponentialHistogram.HS(a.exponentialHistogram, l.uint32(82).fork()).ldelim();
                }
                if (a.summary != null && Object.hasOwnProperty.call(a, "summary")) {
                  At.opentelemetry.proto.metrics.v1.Summary.HS(a.summary, l.uint32(90).fork()).ldelim();
                }
                if (a.metadata != null && a.metadata.length) {
                  for (var c = 0; c < a.metadata.length; ++c) {
                    At.opentelemetry.proto.common.v1.KeyValue.HS(a.metadata[c], l.uint32(98).fork()).ldelim();
                  }
                }
                return l;
              };
              o.encodeDelimited = function (a, l) {
                return this.HS(a, l).ldelim();
              };
              o.oC = function (a, l, c) {
                if (!(a instanceof Jr)) {
                  a = Jr.create(a);
                }
                var u = l === undefined ? a.len : a.pos + l;
                var d = new At.opentelemetry.proto.metrics.v1.Metric();
                while (a.pos < u) {
                  var p = a.uint32();
                  if (p === c) {
                    break;
                  }
                  switch (p >>> 3) {
                    case 1:
                      {
                        d.name = a.string();
                        break;
                      }
                    case 2:
                      {
                        d.description = a.string();
                        break;
                      }
                    case 3:
                      {
                        d.unit = a.string();
                        break;
                      }
                    case 5:
                      {
                        d.gauge = At.opentelemetry.proto.metrics.v1.Gauge.oC(a, a.uint32());
                        break;
                      }
                    case 7:
                      {
                        d.sum = At.opentelemetry.proto.metrics.v1.Sum.oC(a, a.uint32());
                        break;
                      }
                    case 9:
                      {
                        d.histogram = At.opentelemetry.proto.metrics.v1.Histogram.oC(a, a.uint32());
                        break;
                      }
                    case 10:
                      {
                        d.exponentialHistogram = At.opentelemetry.proto.metrics.v1.ExponentialHistogram.oC(a, a.uint32());
                        break;
                      }
                    case 11:
                      {
                        d.summary = At.opentelemetry.proto.metrics.v1.Summary.oC(a, a.uint32());
                        break;
                      }
                    case 12:
                      {
                        if (!(d.metadata && d.metadata.length)) {
                          d.metadata = [];
                        }
                        d.metadata.push(At.opentelemetry.proto.common.v1.KeyValue.oC(a, a.uint32()));
                        break;
                      }
                    default:
                      a.skipType(p & 7);
                      break;
                  }
                }
                return d;
              };
              o.decodeDelimited = function (a) {
                if (!(a instanceof Jr)) {
                  a = new Jr(a);
                }
                return this.oC(a, a.uint32());
              };
              o.verify = function (a) {
                if (typeof a !== "object" || a === null) {
                  return "object expected";
                }
                var l = {};
                if (a.name != null && a.hasOwnProperty("name")) {
                  if (!Lt.isString(a.name)) {
                    return "name: string expected";
                  }
                }
                if (a.description != null && a.hasOwnProperty("description")) {
                  if (!Lt.isString(a.description)) {
                    return "description: string expected";
                  }
                }
                if (a.unit != null && a.hasOwnProperty("unit")) {
                  if (!Lt.isString(a.unit)) {
                    return "unit: string expected";
                  }
                }
                if (a.gauge != null && a.hasOwnProperty("gauge")) {
                  l.data = 1;
                  {
                    var c = At.opentelemetry.proto.metrics.v1.Gauge.verify(a.gauge);
                    if (c) {
                      return "gauge." + c;
                    }
                  }
                }
                if (a.sum != null && a.hasOwnProperty("sum")) {
                  if (l.data === 1) {
                    return "data: multiple values";
                  }
                  l.data = 1;
                  {
                    var c = At.opentelemetry.proto.metrics.v1.Sum.verify(a.sum);
                    if (c) {
                      return "sum." + c;
                    }
                  }
                }
                if (a.histogram != null && a.hasOwnProperty("histogram")) {
                  if (l.data === 1) {
                    return "data: multiple values";
                  }
                  l.data = 1;
                  {
                    var c = At.opentelemetry.proto.metrics.v1.Histogram.verify(a.histogram);
                    if (c) {
                      return "histogram." + c;
                    }
                  }
                }
                if (a.exponentialHistogram != null && a.hasOwnProperty("exponentialHistogram")) {
                  if (l.data === 1) {
                    return "data: multiple values";
                  }
                  l.data = 1;
                  {
                    var c = At.opentelemetry.proto.metrics.v1.ExponentialHistogram.verify(a.exponentialHistogram);
                    if (c) {
                      return "exponentialHistogram." + c;
                    }
                  }
                }
                if (a.summary != null && a.hasOwnProperty("summary")) {
                  if (l.data === 1) {
                    return "data: multiple values";
                  }
                  l.data = 1;
                  {
                    var c = At.opentelemetry.proto.metrics.v1.Summary.verify(a.summary);
                    if (c) {
                      return "summary." + c;
                    }
                  }
                }
                if (a.metadata != null && a.hasOwnProperty("metadata")) {
                  if (!Array.isArray(a.metadata)) {
                    return "metadata: array expected";
                  }
                  for (var u = 0; u < a.metadata.length; ++u) {
                    var c = At.opentelemetry.proto.common.v1.KeyValue.verify(a.metadata[u]);
                    if (c) {
                      return "metadata." + c;
                    }
                  }
                }
                return null;
              };
              o.fromObject = function (a) {
                if (a instanceof At.opentelemetry.proto.metrics.v1.Metric) {
                  return a;
                }
                var l = new At.opentelemetry.proto.metrics.v1.Metric();
                if (a.name != null) {
                  l.name = String(a.name);
                }
                if (a.description != null) {
                  l.description = String(a.description);
                }
                if (a.unit != null) {
                  l.unit = String(a.unit);
                }
                if (a.gauge != null) {
                  if (typeof a.gauge !== "object") {
                    throw TypeError(".opentelemetry.proto.metrics.v1.Metric.gauge: object expected");
                  }
                  l.gauge = At.opentelemetry.proto.metrics.v1.Gauge.fromObject(a.gauge);
                }
                if (a.sum != null) {
                  if (typeof a.sum !== "object") {
                    throw TypeError(".opentelemetry.proto.metrics.v1.Metric.sum: object expected");
                  }
                  l.sum = At.opentelemetry.proto.metrics.v1.Sum.fromObject(a.sum);
                }
                if (a.histogram != null) {
                  if (typeof a.histogram !== "object") {
                    throw TypeError(".opentelemetry.proto.metrics.v1.Metric.histogram: object expected");
                  }
                  l.histogram = At.opentelemetry.proto.metrics.v1.Histogram.fromObject(a.histogram);
                }
                if (a.exponentialHistogram != null) {
                  if (typeof a.exponentialHistogram !== "object") {
                    throw TypeError(".opentelemetry.proto.metrics.v1.Metric.exponentialHistogram: object expected");
                  }
                  l.exponentialHistogram = At.opentelemetry.proto.metrics.v1.ExponentialHistogram.fromObject(a.exponentialHistogram);
                }
                if (a.summary != null) {
                  if (typeof a.summary !== "object") {
                    throw TypeError(".opentelemetry.proto.metrics.v1.Metric.summary: object expected");
                  }
                  l.summary = At.opentelemetry.proto.metrics.v1.Summary.fromObject(a.summary);
                }
                if (a.metadata) {
                  if (!Array.isArray(a.metadata)) {
                    throw TypeError(".opentelemetry.proto.metrics.v1.Metric.metadata: array expected");
                  }
                  l.metadata = [];
                  for (var c = 0; c < a.metadata.length; ++c) {
                    if (typeof a.metadata[c] !== "object") {
                      throw TypeError(".opentelemetry.proto.metrics.v1.Metric.metadata: object expected");
                    }
                    l.metadata[c] = At.opentelemetry.proto.common.v1.KeyValue.fromObject(a.metadata[c]);
                  }
                }
                return l;
              };
              o.toObject = function (a, l) {
                if (!l) {
                  l = {};
                }
                var c = {};
                if (l.arrays || l.defaults) {
                  c.metadata = [];
                }
                if (l.defaults) {
                  c.name = "";
                  c.description = "";
                  c.unit = "";
                }
                if (a.name != null && a.hasOwnProperty("name")) {
                  c.name = a.name;
                }
                if (a.description != null && a.hasOwnProperty("description")) {
                  c.description = a.description;
                }
                if (a.unit != null && a.hasOwnProperty("unit")) {
                  c.unit = a.unit;
                }
                if (a.gauge != null && a.hasOwnProperty("gauge")) {
                  if (c.gauge = At.opentelemetry.proto.metrics.v1.Gauge.toObject(a.gauge, l), l.oneofs) {
                    c.data = "gauge";
                  }
                }
                if (a.sum != null && a.hasOwnProperty("sum")) {
                  if (c.sum = At.opentelemetry.proto.metrics.v1.Sum.toObject(a.sum, l), l.oneofs) {
                    c.data = "sum";
                  }
                }
                if (a.histogram != null && a.hasOwnProperty("histogram")) {
                  if (c.histogram = At.opentelemetry.proto.metrics.v1.Histogram.toObject(a.histogram, l), l.oneofs) {
                    c.data = "histogram";
                  }
                }
                if (a.exponentialHistogram != null && a.hasOwnProperty("exponentialHistogram")) {
                  if (c.exponentialHistogram = At.opentelemetry.proto.metrics.v1.ExponentialHistogram.toObject(a.exponentialHistogram, l), l.oneofs) {
                    c.data = "exponentialHistogram";
                  }
                }
                if (a.summary != null && a.hasOwnProperty("summary")) {
                  if (c.summary = At.opentelemetry.proto.metrics.v1.Summary.toObject(a.summary, l), l.oneofs) {
                    c.data = "summary";
                  }
                }
                if (a.metadata && a.metadata.length) {
                  c.metadata = [];
                  for (var u = 0; u < a.metadata.length; ++u) {
                    c.metadata[u] = At.opentelemetry.proto.common.v1.KeyValue.toObject(a.metadata[u], l);
                  }
                }
                return c;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (a) {
                if (a === undefined) {
                  a = "type.googleapis.com";
                }
                return a + "/opentelemetry.proto.metrics.v1.Metric";
              };
              return o;
            }();
            r.Gauge = function () {
              function o(s) {
                if (this.dataPoints = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.dataPoints = Lt.emptyArray;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.dataPoints != null && i.dataPoints.length) {
                  for (var l = 0; l < i.dataPoints.length; ++l) {
                    At.opentelemetry.proto.metrics.v1.NumberDataPoint.HS(i.dataPoints[l], a.uint32(10).fork()).ldelim();
                  }
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.metrics.v1.Gauge();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        if (!(u.dataPoints && u.dataPoints.length)) {
                          u.dataPoints = [];
                        }
                        u.dataPoints.push(At.opentelemetry.proto.metrics.v1.NumberDataPoint.oC(i, i.uint32()));
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.dataPoints != null && i.hasOwnProperty("dataPoints")) {
                  if (!Array.isArray(i.dataPoints)) {
                    return "dataPoints: array expected";
                  }
                  for (var a = 0; a < i.dataPoints.length; ++a) {
                    var l = At.opentelemetry.proto.metrics.v1.NumberDataPoint.verify(i.dataPoints[a]);
                    if (l) {
                      return "dataPoints." + l;
                    }
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.metrics.v1.Gauge) {
                  return i;
                }
                var a = new At.opentelemetry.proto.metrics.v1.Gauge();
                if (i.dataPoints) {
                  if (!Array.isArray(i.dataPoints)) {
                    throw TypeError(".opentelemetry.proto.metrics.v1.Gauge.dataPoints: array expected");
                  }
                  a.dataPoints = [];
                  for (var l = 0; l < i.dataPoints.length; ++l) {
                    if (typeof i.dataPoints[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.metrics.v1.Gauge.dataPoints: object expected");
                    }
                    a.dataPoints[l] = At.opentelemetry.proto.metrics.v1.NumberDataPoint.fromObject(i.dataPoints[l]);
                  }
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.dataPoints = [];
                }
                if (i.dataPoints && i.dataPoints.length) {
                  l.dataPoints = [];
                  for (var c = 0; c < i.dataPoints.length; ++c) {
                    l.dataPoints[c] = At.opentelemetry.proto.metrics.v1.NumberDataPoint.toObject(i.dataPoints[c], a);
                  }
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.metrics.v1.Gauge";
              };
              return o;
            }();
            r.Sum = function () {
              function o(s) {
                if (this.dataPoints = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.dataPoints = Lt.emptyArray;
              o.prototype.aggregationTemporality = null;
              o.prototype.isMonotonic = null;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.dataPoints != null && i.dataPoints.length) {
                  for (var l = 0; l < i.dataPoints.length; ++l) {
                    At.opentelemetry.proto.metrics.v1.NumberDataPoint.HS(i.dataPoints[l], a.uint32(10).fork()).ldelim();
                  }
                }
                if (i.aggregationTemporality != null && Object.hasOwnProperty.call(i, "aggregationTemporality")) {
                  a.uint32(16).int32(i.aggregationTemporality);
                }
                if (i.isMonotonic != null && Object.hasOwnProperty.call(i, "isMonotonic")) {
                  a.uint32(24).bool(i.isMonotonic);
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.metrics.v1.Sum();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        if (!(u.dataPoints && u.dataPoints.length)) {
                          u.dataPoints = [];
                        }
                        u.dataPoints.push(At.opentelemetry.proto.metrics.v1.NumberDataPoint.oC(i, i.uint32()));
                        break;
                      }
                    case 2:
                      {
                        u.aggregationTemporality = i.int32();
                        break;
                      }
                    case 3:
                      {
                        u.isMonotonic = i.bool();
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.dataPoints != null && i.hasOwnProperty("dataPoints")) {
                  if (!Array.isArray(i.dataPoints)) {
                    return "dataPoints: array expected";
                  }
                  for (var a = 0; a < i.dataPoints.length; ++a) {
                    var l = At.opentelemetry.proto.metrics.v1.NumberDataPoint.verify(i.dataPoints[a]);
                    if (l) {
                      return "dataPoints." + l;
                    }
                  }
                }
                if (i.aggregationTemporality != null && i.hasOwnProperty("aggregationTemporality")) {
                  switch (i.aggregationTemporality) {
                    default:
                      return "aggregationTemporality: enum value expected";
                    case 0:
                    case 1:
                    case 2:
                      break;
                  }
                }
                if (i.isMonotonic != null && i.hasOwnProperty("isMonotonic")) {
                  if (typeof i.isMonotonic !== "boolean") {
                    return "isMonotonic: boolean expected";
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.metrics.v1.Sum) {
                  return i;
                }
                var a = new At.opentelemetry.proto.metrics.v1.Sum();
                if (i.dataPoints) {
                  if (!Array.isArray(i.dataPoints)) {
                    throw TypeError(".opentelemetry.proto.metrics.v1.Sum.dataPoints: array expected");
                  }
                  a.dataPoints = [];
                  for (var l = 0; l < i.dataPoints.length; ++l) {
                    if (typeof i.dataPoints[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.metrics.v1.Sum.dataPoints: object expected");
                    }
                    a.dataPoints[l] = At.opentelemetry.proto.metrics.v1.NumberDataPoint.fromObject(i.dataPoints[l]);
                  }
                }
                switch (i.aggregationTemporality) {
                  default:
                    if (typeof i.aggregationTemporality === "number") {
                      a.aggregationTemporality = i.aggregationTemporality;
                      break;
                    }
                    break;
                  case "AGGREGATION_TEMPORALITY_UNSPECIFIED":
                  case 0:
                    a.aggregationTemporality = 0;
                    break;
                  case "AGGREGATION_TEMPORALITY_DELTA":
                  case 1:
                    a.aggregationTemporality = 1;
                    break;
                  case "AGGREGATION_TEMPORALITY_CUMULATIVE":
                  case 2:
                    a.aggregationTemporality = 2;
                    break;
                }
                if (i.isMonotonic != null) {
                  a.isMonotonic = Boolean(i.isMonotonic);
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.dataPoints = [];
                }
                if (a.defaults) {
                  l.aggregationTemporality = a.enums === String ? "AGGREGATION_TEMPORALITY_UNSPECIFIED" : 0;
                  l.isMonotonic = false;
                }
                if (i.dataPoints && i.dataPoints.length) {
                  l.dataPoints = [];
                  for (var c = 0; c < i.dataPoints.length; ++c) {
                    l.dataPoints[c] = At.opentelemetry.proto.metrics.v1.NumberDataPoint.toObject(i.dataPoints[c], a);
                  }
                }
                if (i.aggregationTemporality != null && i.hasOwnProperty("aggregationTemporality")) {
                  l.aggregationTemporality = a.enums === String ? At.opentelemetry.proto.metrics.v1.AggregationTemporality[i.aggregationTemporality] === undefined ? i.aggregationTemporality : At.opentelemetry.proto.metrics.v1.AggregationTemporality[i.aggregationTemporality] : i.aggregationTemporality;
                }
                if (i.isMonotonic != null && i.hasOwnProperty("isMonotonic")) {
                  l.isMonotonic = i.isMonotonic;
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.metrics.v1.Sum";
              };
              return o;
            }();
            r.Histogram = function () {
              function o(s) {
                if (this.dataPoints = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.dataPoints = Lt.emptyArray;
              o.prototype.aggregationTemporality = null;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.dataPoints != null && i.dataPoints.length) {
                  for (var l = 0; l < i.dataPoints.length; ++l) {
                    At.opentelemetry.proto.metrics.v1.HistogramDataPoint.HS(i.dataPoints[l], a.uint32(10).fork()).ldelim();
                  }
                }
                if (i.aggregationTemporality != null && Object.hasOwnProperty.call(i, "aggregationTemporality")) {
                  a.uint32(16).int32(i.aggregationTemporality);
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.metrics.v1.Histogram();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        if (!(u.dataPoints && u.dataPoints.length)) {
                          u.dataPoints = [];
                        }
                        u.dataPoints.push(At.opentelemetry.proto.metrics.v1.HistogramDataPoint.oC(i, i.uint32()));
                        break;
                      }
                    case 2:
                      {
                        u.aggregationTemporality = i.int32();
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.dataPoints != null && i.hasOwnProperty("dataPoints")) {
                  if (!Array.isArray(i.dataPoints)) {
                    return "dataPoints: array expected";
                  }
                  for (var a = 0; a < i.dataPoints.length; ++a) {
                    var l = At.opentelemetry.proto.metrics.v1.HistogramDataPoint.verify(i.dataPoints[a]);
                    if (l) {
                      return "dataPoints." + l;
                    }
                  }
                }
                if (i.aggregationTemporality != null && i.hasOwnProperty("aggregationTemporality")) {
                  switch (i.aggregationTemporality) {
                    default:
                      return "aggregationTemporality: enum value expected";
                    case 0:
                    case 1:
                    case 2:
                      break;
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.metrics.v1.Histogram) {
                  return i;
                }
                var a = new At.opentelemetry.proto.metrics.v1.Histogram();
                if (i.dataPoints) {
                  if (!Array.isArray(i.dataPoints)) {
                    throw TypeError(".opentelemetry.proto.metrics.v1.Histogram.dataPoints: array expected");
                  }
                  a.dataPoints = [];
                  for (var l = 0; l < i.dataPoints.length; ++l) {
                    if (typeof i.dataPoints[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.metrics.v1.Histogram.dataPoints: object expected");
                    }
                    a.dataPoints[l] = At.opentelemetry.proto.metrics.v1.HistogramDataPoint.fromObject(i.dataPoints[l]);
                  }
                }
                switch (i.aggregationTemporality) {
                  default:
                    if (typeof i.aggregationTemporality === "number") {
                      a.aggregationTemporality = i.aggregationTemporality;
                      break;
                    }
                    break;
                  case "AGGREGATION_TEMPORALITY_UNSPECIFIED":
                  case 0:
                    a.aggregationTemporality = 0;
                    break;
                  case "AGGREGATION_TEMPORALITY_DELTA":
                  case 1:
                    a.aggregationTemporality = 1;
                    break;
                  case "AGGREGATION_TEMPORALITY_CUMULATIVE":
                  case 2:
                    a.aggregationTemporality = 2;
                    break;
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.dataPoints = [];
                }
                if (a.defaults) {
                  l.aggregationTemporality = a.enums === String ? "AGGREGATION_TEMPORALITY_UNSPECIFIED" : 0;
                }
                if (i.dataPoints && i.dataPoints.length) {
                  l.dataPoints = [];
                  for (var c = 0; c < i.dataPoints.length; ++c) {
                    l.dataPoints[c] = At.opentelemetry.proto.metrics.v1.HistogramDataPoint.toObject(i.dataPoints[c], a);
                  }
                }
                if (i.aggregationTemporality != null && i.hasOwnProperty("aggregationTemporality")) {
                  l.aggregationTemporality = a.enums === String ? At.opentelemetry.proto.metrics.v1.AggregationTemporality[i.aggregationTemporality] === undefined ? i.aggregationTemporality : At.opentelemetry.proto.metrics.v1.AggregationTemporality[i.aggregationTemporality] : i.aggregationTemporality;
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.metrics.v1.Histogram";
              };
              return o;
            }();
            r.ExponentialHistogram = function () {
              function o(s) {
                if (this.dataPoints = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.dataPoints = Lt.emptyArray;
              o.prototype.aggregationTemporality = null;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.dataPoints != null && i.dataPoints.length) {
                  for (var l = 0; l < i.dataPoints.length; ++l) {
                    At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.HS(i.dataPoints[l], a.uint32(10).fork()).ldelim();
                  }
                }
                if (i.aggregationTemporality != null && Object.hasOwnProperty.call(i, "aggregationTemporality")) {
                  a.uint32(16).int32(i.aggregationTemporality);
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.metrics.v1.ExponentialHistogram();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        if (!(u.dataPoints && u.dataPoints.length)) {
                          u.dataPoints = [];
                        }
                        u.dataPoints.push(At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.oC(i, i.uint32()));
                        break;
                      }
                    case 2:
                      {
                        u.aggregationTemporality = i.int32();
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.dataPoints != null && i.hasOwnProperty("dataPoints")) {
                  if (!Array.isArray(i.dataPoints)) {
                    return "dataPoints: array expected";
                  }
                  for (var a = 0; a < i.dataPoints.length; ++a) {
                    var l = At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.verify(i.dataPoints[a]);
                    if (l) {
                      return "dataPoints." + l;
                    }
                  }
                }
                if (i.aggregationTemporality != null && i.hasOwnProperty("aggregationTemporality")) {
                  switch (i.aggregationTemporality) {
                    default:
                      return "aggregationTemporality: enum value expected";
                    case 0:
                    case 1:
                    case 2:
                      break;
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.metrics.v1.ExponentialHistogram) {
                  return i;
                }
                var a = new At.opentelemetry.proto.metrics.v1.ExponentialHistogram();
                if (i.dataPoints) {
                  if (!Array.isArray(i.dataPoints)) {
                    throw TypeError(".opentelemetry.proto.metrics.v1.ExponentialHistogram.dataPoints: array expected");
                  }
                  a.dataPoints = [];
                  for (var l = 0; l < i.dataPoints.length; ++l) {
                    if (typeof i.dataPoints[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.metrics.v1.ExponentialHistogram.dataPoints: object expected");
                    }
                    a.dataPoints[l] = At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.fromObject(i.dataPoints[l]);
                  }
                }
                switch (i.aggregationTemporality) {
                  default:
                    if (typeof i.aggregationTemporality === "number") {
                      a.aggregationTemporality = i.aggregationTemporality;
                      break;
                    }
                    break;
                  case "AGGREGATION_TEMPORALITY_UNSPECIFIED":
                  case 0:
                    a.aggregationTemporality = 0;
                    break;
                  case "AGGREGATION_TEMPORALITY_DELTA":
                  case 1:
                    a.aggregationTemporality = 1;
                    break;
                  case "AGGREGATION_TEMPORALITY_CUMULATIVE":
                  case 2:
                    a.aggregationTemporality = 2;
                    break;
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.dataPoints = [];
                }
                if (a.defaults) {
                  l.aggregationTemporality = a.enums === String ? "AGGREGATION_TEMPORALITY_UNSPECIFIED" : 0;
                }
                if (i.dataPoints && i.dataPoints.length) {
                  l.dataPoints = [];
                  for (var c = 0; c < i.dataPoints.length; ++c) {
                    l.dataPoints[c] = At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.toObject(i.dataPoints[c], a);
                  }
                }
                if (i.aggregationTemporality != null && i.hasOwnProperty("aggregationTemporality")) {
                  l.aggregationTemporality = a.enums === String ? At.opentelemetry.proto.metrics.v1.AggregationTemporality[i.aggregationTemporality] === undefined ? i.aggregationTemporality : At.opentelemetry.proto.metrics.v1.AggregationTemporality[i.aggregationTemporality] : i.aggregationTemporality;
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.metrics.v1.ExponentialHistogram";
              };
              return o;
            }();
            r.Summary = function () {
              function o(s) {
                if (this.dataPoints = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.dataPoints = Lt.emptyArray;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.dataPoints != null && i.dataPoints.length) {
                  for (var l = 0; l < i.dataPoints.length; ++l) {
                    At.opentelemetry.proto.metrics.v1.SummaryDataPoint.HS(i.dataPoints[l], a.uint32(10).fork()).ldelim();
                  }
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.metrics.v1.Summary();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        if (!(u.dataPoints && u.dataPoints.length)) {
                          u.dataPoints = [];
                        }
                        u.dataPoints.push(At.opentelemetry.proto.metrics.v1.SummaryDataPoint.oC(i, i.uint32()));
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.dataPoints != null && i.hasOwnProperty("dataPoints")) {
                  if (!Array.isArray(i.dataPoints)) {
                    return "dataPoints: array expected";
                  }
                  for (var a = 0; a < i.dataPoints.length; ++a) {
                    var l = At.opentelemetry.proto.metrics.v1.SummaryDataPoint.verify(i.dataPoints[a]);
                    if (l) {
                      return "dataPoints." + l;
                    }
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.metrics.v1.Summary) {
                  return i;
                }
                var a = new At.opentelemetry.proto.metrics.v1.Summary();
                if (i.dataPoints) {
                  if (!Array.isArray(i.dataPoints)) {
                    throw TypeError(".opentelemetry.proto.metrics.v1.Summary.dataPoints: array expected");
                  }
                  a.dataPoints = [];
                  for (var l = 0; l < i.dataPoints.length; ++l) {
                    if (typeof i.dataPoints[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.metrics.v1.Summary.dataPoints: object expected");
                    }
                    a.dataPoints[l] = At.opentelemetry.proto.metrics.v1.SummaryDataPoint.fromObject(i.dataPoints[l]);
                  }
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.dataPoints = [];
                }
                if (i.dataPoints && i.dataPoints.length) {
                  l.dataPoints = [];
                  for (var c = 0; c < i.dataPoints.length; ++c) {
                    l.dataPoints[c] = At.opentelemetry.proto.metrics.v1.SummaryDataPoint.toObject(i.dataPoints[c], a);
                  }
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.metrics.v1.Summary";
              };
              return o;
            }();
            r.AggregationTemporality = function () {
              var o = {};
              var s = Object.create(o);
              s[o[0] = "AGGREGATION_TEMPORALITY_UNSPECIFIED"] = 0;
              s[o[1] = "AGGREGATION_TEMPORALITY_DELTA"] = 1;
              s[o[2] = "AGGREGATION_TEMPORALITY_CUMULATIVE"] = 2;
              return s;
            }();
            r.DataPointFlags = function () {
              var o = {};
              var s = Object.create(o);
              s[o[0] = "DATA_POINT_FLAGS_DO_NOT_USE"] = 0;
              s[o[1] = "DATA_POINT_FLAGS_NO_RECORDED_VALUE_MASK"] = 1;
              return s;
            }();
            r.NumberDataPoint = function () {
              function o(i) {
                if (this.attributes = [], this.exemplars = [], i) {
                  for (var a = Object.keys(i), l = 0; l < a.length; ++l) {
                    if (i[a[l]] != null) {
                      this[a[l]] = i[a[l]];
                    }
                  }
                }
              }
              o.prototype.attributes = Lt.emptyArray;
              o.prototype.startTimeUnixNano = null;
              o.prototype.timeUnixNano = null;
              o.prototype.asDouble = null;
              o.prototype.asInt = null;
              o.prototype.exemplars = Lt.emptyArray;
              o.prototype.flags = null;
              var s;
              Object.defineProperty(o.prototype, "value", {
                get: Lt.oneOfGetter(s = ["asDouble", "asInt"]),
                set: Lt.oneOfSetter(s)
              });
              o.create = function (a) {
                return new o(a);
              };
              o.HS = function (a, l) {
                if (!l) {
                  l = Im.create();
                }
                if (a.startTimeUnixNano != null && Object.hasOwnProperty.call(a, "startTimeUnixNano")) {
                  l.uint32(17).fixed64(a.startTimeUnixNano);
                }
                if (a.timeUnixNano != null && Object.hasOwnProperty.call(a, "timeUnixNano")) {
                  l.uint32(25).fixed64(a.timeUnixNano);
                }
                if (a.asDouble != null && Object.hasOwnProperty.call(a, "asDouble")) {
                  l.uint32(33).double(a.asDouble);
                }
                if (a.exemplars != null && a.exemplars.length) {
                  for (var c = 0; c < a.exemplars.length; ++c) {
                    At.opentelemetry.proto.metrics.v1.Exemplar.HS(a.exemplars[c], l.uint32(42).fork()).ldelim();
                  }
                }
                if (a.asInt != null && Object.hasOwnProperty.call(a, "asInt")) {
                  l.uint32(49).sfixed64(a.asInt);
                }
                if (a.attributes != null && a.attributes.length) {
                  for (var c = 0; c < a.attributes.length; ++c) {
                    At.opentelemetry.proto.common.v1.KeyValue.HS(a.attributes[c], l.uint32(58).fork()).ldelim();
                  }
                }
                if (a.flags != null && Object.hasOwnProperty.call(a, "flags")) {
                  l.uint32(64).uint32(a.flags);
                }
                return l;
              };
              o.encodeDelimited = function (a, l) {
                return this.HS(a, l).ldelim();
              };
              o.oC = function (a, l, c) {
                if (!(a instanceof Jr)) {
                  a = Jr.create(a);
                }
                var u = l === undefined ? a.len : a.pos + l;
                var d = new At.opentelemetry.proto.metrics.v1.NumberDataPoint();
                while (a.pos < u) {
                  var p = a.uint32();
                  if (p === c) {
                    break;
                  }
                  switch (p >>> 3) {
                    case 7:
                      {
                        if (!(d.attributes && d.attributes.length)) {
                          d.attributes = [];
                        }
                        d.attributes.push(At.opentelemetry.proto.common.v1.KeyValue.oC(a, a.uint32()));
                        break;
                      }
                    case 2:
                      {
                        d.startTimeUnixNano = a.fixed64();
                        break;
                      }
                    case 3:
                      {
                        d.timeUnixNano = a.fixed64();
                        break;
                      }
                    case 4:
                      {
                        d.asDouble = a.double();
                        break;
                      }
                    case 6:
                      {
                        d.asInt = a.sfixed64();
                        break;
                      }
                    case 5:
                      {
                        if (!(d.exemplars && d.exemplars.length)) {
                          d.exemplars = [];
                        }
                        d.exemplars.push(At.opentelemetry.proto.metrics.v1.Exemplar.oC(a, a.uint32()));
                        break;
                      }
                    case 8:
                      {
                        d.flags = a.uint32();
                        break;
                      }
                    default:
                      a.skipType(p & 7);
                      break;
                  }
                }
                return d;
              };
              o.decodeDelimited = function (a) {
                if (!(a instanceof Jr)) {
                  a = new Jr(a);
                }
                return this.oC(a, a.uint32());
              };
              o.verify = function (a) {
                if (typeof a !== "object" || a === null) {
                  return "object expected";
                }
                var l = {};
                if (a.attributes != null && a.hasOwnProperty("attributes")) {
                  if (!Array.isArray(a.attributes)) {
                    return "attributes: array expected";
                  }
                  for (var c = 0; c < a.attributes.length; ++c) {
                    var u = At.opentelemetry.proto.common.v1.KeyValue.verify(a.attributes[c]);
                    if (u) {
                      return "attributes." + u;
                    }
                  }
                }
                if (a.startTimeUnixNano != null && a.hasOwnProperty("startTimeUnixNano")) {
                  if (!Lt.isInteger(a.startTimeUnixNano) && !(a.startTimeUnixNano && Lt.isInteger(a.startTimeUnixNano.low) && Lt.isInteger(a.startTimeUnixNano.high))) {
                    return "startTimeUnixNano: integer|Long expected";
                  }
                }
                if (a.timeUnixNano != null && a.hasOwnProperty("timeUnixNano")) {
                  if (!Lt.isInteger(a.timeUnixNano) && !(a.timeUnixNano && Lt.isInteger(a.timeUnixNano.low) && Lt.isInteger(a.timeUnixNano.high))) {
                    return "timeUnixNano: integer|Long expected";
                  }
                }
                if (a.asDouble != null && a.hasOwnProperty("asDouble")) {
                  if (l.value = 1, typeof a.asDouble !== "number") {
                    return "asDouble: number expected";
                  }
                }
                if (a.asInt != null && a.hasOwnProperty("asInt")) {
                  if (l.value === 1) {
                    return "value: multiple values";
                  }
                  if (l.value = 1, !Lt.isInteger(a.asInt) && !(a.asInt && Lt.isInteger(a.asInt.low) && Lt.isInteger(a.asInt.high))) {
                    return "asInt: integer|Long expected";
                  }
                }
                if (a.exemplars != null && a.hasOwnProperty("exemplars")) {
                  if (!Array.isArray(a.exemplars)) {
                    return "exemplars: array expected";
                  }
                  for (var c = 0; c < a.exemplars.length; ++c) {
                    var u = At.opentelemetry.proto.metrics.v1.Exemplar.verify(a.exemplars[c]);
                    if (u) {
                      return "exemplars." + u;
                    }
                  }
                }
                if (a.flags != null && a.hasOwnProperty("flags")) {
                  if (!Lt.isInteger(a.flags)) {
                    return "flags: integer expected";
                  }
                }
                return null;
              };
              o.fromObject = function (a) {
                if (a instanceof At.opentelemetry.proto.metrics.v1.NumberDataPoint) {
                  return a;
                }
                var l = new At.opentelemetry.proto.metrics.v1.NumberDataPoint();
                if (a.attributes) {
                  if (!Array.isArray(a.attributes)) {
                    throw TypeError(".opentelemetry.proto.metrics.v1.NumberDataPoint.attributes: array expected");
                  }
                  l.attributes = [];
                  for (var c = 0; c < a.attributes.length; ++c) {
                    if (typeof a.attributes[c] !== "object") {
                      throw TypeError(".opentelemetry.proto.metrics.v1.NumberDataPoint.attributes: object expected");
                    }
                    l.attributes[c] = At.opentelemetry.proto.common.v1.KeyValue.fromObject(a.attributes[c]);
                  }
                }
                if (a.startTimeUnixNano != null) {
                  if (Lt.Long) {
                    (l.startTimeUnixNano = Lt.Long.fromValue(a.startTimeUnixNano)).unsigned = false;
                  } else if (typeof a.startTimeUnixNano === "string") {
                    l.startTimeUnixNano = parseInt(a.startTimeUnixNano, 10);
                  } else if (typeof a.startTimeUnixNano === "number") {
                    l.startTimeUnixNano = a.startTimeUnixNano;
                  } else if (typeof a.startTimeUnixNano === "object") {
                    l.startTimeUnixNano = new Lt.LongBits(a.startTimeUnixNano.low >>> 0, a.startTimeUnixNano.high >>> 0).toNumber();
                  }
                }
                if (a.timeUnixNano != null) {
                  if (Lt.Long) {
                    (l.timeUnixNano = Lt.Long.fromValue(a.timeUnixNano)).unsigned = false;
                  } else if (typeof a.timeUnixNano === "string") {
                    l.timeUnixNano = parseInt(a.timeUnixNano, 10);
                  } else if (typeof a.timeUnixNano === "number") {
                    l.timeUnixNano = a.timeUnixNano;
                  } else if (typeof a.timeUnixNano === "object") {
                    l.timeUnixNano = new Lt.LongBits(a.timeUnixNano.low >>> 0, a.timeUnixNano.high >>> 0).toNumber();
                  }
                }
                if (a.asDouble != null) {
                  l.asDouble = Number(a.asDouble);
                }
                if (a.asInt != null) {
                  if (Lt.Long) {
                    (l.asInt = Lt.Long.fromValue(a.asInt)).unsigned = false;
                  } else if (typeof a.asInt === "string") {
                    l.asInt = parseInt(a.asInt, 10);
                  } else if (typeof a.asInt === "number") {
                    l.asInt = a.asInt;
                  } else if (typeof a.asInt === "object") {
                    l.asInt = new Lt.LongBits(a.asInt.low >>> 0, a.asInt.high >>> 0).toNumber();
                  }
                }
                if (a.exemplars) {
                  if (!Array.isArray(a.exemplars)) {
                    throw TypeError(".opentelemetry.proto.metrics.v1.NumberDataPoint.exemplars: array expected");
                  }
                  l.exemplars = [];
                  for (var c = 0; c < a.exemplars.length; ++c) {
                    if (typeof a.exemplars[c] !== "object") {
                      throw TypeError(".opentelemetry.proto.metrics.v1.NumberDataPoint.exemplars: object expected");
                    }
                    l.exemplars[c] = At.opentelemetry.proto.metrics.v1.Exemplar.fromObject(a.exemplars[c]);
                  }
                }
                if (a.flags != null) {
                  l.flags = a.flags >>> 0;
                }
                return l;
              };
              o.toObject = function (a, l) {
                if (!l) {
                  l = {};
                }
                var c = {};
                if (l.arrays || l.defaults) {
                  c.exemplars = [];
                  c.attributes = [];
                }
                if (l.defaults) {
                  if (Lt.Long) {
                    var u = new Lt.Long(0, 0, false);
                    c.startTimeUnixNano = l.longs === String ? u.toString() : l.longs === Number ? u.toNumber() : u;
                  } else {
                    c.startTimeUnixNano = l.longs === String ? "0" : 0;
                  }
                  if (Lt.Long) {
                    var u = new Lt.Long(0, 0, false);
                    c.timeUnixNano = l.longs === String ? u.toString() : l.longs === Number ? u.toNumber() : u;
                  } else {
                    c.timeUnixNano = l.longs === String ? "0" : 0;
                  }
                  c.flags = 0;
                }
                if (a.startTimeUnixNano != null && a.hasOwnProperty("startTimeUnixNano")) {
                  if (typeof a.startTimeUnixNano === "number") {
                    c.startTimeUnixNano = l.longs === String ? String(a.startTimeUnixNano) : a.startTimeUnixNano;
                  } else {
                    c.startTimeUnixNano = l.longs === String ? Lt.Long.prototype.toString.call(a.startTimeUnixNano) : l.longs === Number ? new Lt.LongBits(a.startTimeUnixNano.low >>> 0, a.startTimeUnixNano.high >>> 0).toNumber() : a.startTimeUnixNano;
                  }
                }
                if (a.timeUnixNano != null && a.hasOwnProperty("timeUnixNano")) {
                  if (typeof a.timeUnixNano === "number") {
                    c.timeUnixNano = l.longs === String ? String(a.timeUnixNano) : a.timeUnixNano;
                  } else {
                    c.timeUnixNano = l.longs === String ? Lt.Long.prototype.toString.call(a.timeUnixNano) : l.longs === Number ? new Lt.LongBits(a.timeUnixNano.low >>> 0, a.timeUnixNano.high >>> 0).toNumber() : a.timeUnixNano;
                  }
                }
                if (a.asDouble != null && a.hasOwnProperty("asDouble")) {
                  if (c.asDouble = l.json && !isFinite(a.asDouble) ? String(a.asDouble) : a.asDouble, l.oneofs) {
                    c.value = "asDouble";
                  }
                }
                if (a.exemplars && a.exemplars.length) {
                  c.exemplars = [];
                  for (var d = 0; d < a.exemplars.length; ++d) {
                    c.exemplars[d] = At.opentelemetry.proto.metrics.v1.Exemplar.toObject(a.exemplars[d], l);
                  }
                }
                if (a.asInt != null && a.hasOwnProperty("asInt")) {
                  if (typeof a.asInt === "number") {
                    c.asInt = l.longs === String ? String(a.asInt) : a.asInt;
                  } else {
                    c.asInt = l.longs === String ? Lt.Long.prototype.toString.call(a.asInt) : l.longs === Number ? new Lt.LongBits(a.asInt.low >>> 0, a.asInt.high >>> 0).toNumber() : a.asInt;
                  }
                  if (l.oneofs) {
                    c.value = "asInt";
                  }
                }
                if (a.attributes && a.attributes.length) {
                  c.attributes = [];
                  for (var d = 0; d < a.attributes.length; ++d) {
                    c.attributes[d] = At.opentelemetry.proto.common.v1.KeyValue.toObject(a.attributes[d], l);
                  }
                }
                if (a.flags != null && a.hasOwnProperty("flags")) {
                  c.flags = a.flags;
                }
                return c;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (a) {
                if (a === undefined) {
                  a = "type.googleapis.com";
                }
                return a + "/opentelemetry.proto.metrics.v1.NumberDataPoint";
              };
              return o;
            }();
            r.HistogramDataPoint = function () {
              function o(i) {
                if (this.attributes = [], this.bucketCounts = [], this.explicitBounds = [], this.exemplars = [], i) {
                  for (var a = Object.keys(i), l = 0; l < a.length; ++l) {
                    if (i[a[l]] != null) {
                      this[a[l]] = i[a[l]];
                    }
                  }
                }
              }
              o.prototype.attributes = Lt.emptyArray;
              o.prototype.startTimeUnixNano = null;
              o.prototype.timeUnixNano = null;
              o.prototype.count = null;
              o.prototype.sum = null;
              o.prototype.bucketCounts = Lt.emptyArray;
              o.prototype.explicitBounds = Lt.emptyArray;
              o.prototype.exemplars = Lt.emptyArray;
              o.prototype.flags = null;
              o.prototype.min = null;
              o.prototype.max = null;
              var s;
              Object.defineProperty(o.prototype, "_sum", {
                get: Lt.oneOfGetter(s = ["sum"]),
                set: Lt.oneOfSetter(s)
              });
              Object.defineProperty(o.prototype, "_min", {
                get: Lt.oneOfGetter(s = ["min"]),
                set: Lt.oneOfSetter(s)
              });
              Object.defineProperty(o.prototype, "_max", {
                get: Lt.oneOfGetter(s = ["max"]),
                set: Lt.oneOfSetter(s)
              });
              o.create = function (a) {
                return new o(a);
              };
              o.HS = function (a, l) {
                if (!l) {
                  l = Im.create();
                }
                if (a.startTimeUnixNano != null && Object.hasOwnProperty.call(a, "startTimeUnixNano")) {
                  l.uint32(17).fixed64(a.startTimeUnixNano);
                }
                if (a.timeUnixNano != null && Object.hasOwnProperty.call(a, "timeUnixNano")) {
                  l.uint32(25).fixed64(a.timeUnixNano);
                }
                if (a.count != null && Object.hasOwnProperty.call(a, "count")) {
                  l.uint32(33).fixed64(a.count);
                }
                if (a.sum != null && Object.hasOwnProperty.call(a, "sum")) {
                  l.uint32(41).double(a.sum);
                }
                if (a.bucketCounts != null && a.bucketCounts.length) {
                  l.uint32(50).fork();
                  for (var c = 0; c < a.bucketCounts.length; ++c) {
                    l.fixed64(a.bucketCounts[c]);
                  }
                  l.ldelim();
                }
                if (a.explicitBounds != null && a.explicitBounds.length) {
                  l.uint32(58).fork();
                  for (var c = 0; c < a.explicitBounds.length; ++c) {
                    l.double(a.explicitBounds[c]);
                  }
                  l.ldelim();
                }
                if (a.exemplars != null && a.exemplars.length) {
                  for (var c = 0; c < a.exemplars.length; ++c) {
                    At.opentelemetry.proto.metrics.v1.Exemplar.HS(a.exemplars[c], l.uint32(66).fork()).ldelim();
                  }
                }
                if (a.attributes != null && a.attributes.length) {
                  for (var c = 0; c < a.attributes.length; ++c) {
                    At.opentelemetry.proto.common.v1.KeyValue.HS(a.attributes[c], l.uint32(74).fork()).ldelim();
                  }
                }
                if (a.flags != null && Object.hasOwnProperty.call(a, "flags")) {
                  l.uint32(80).uint32(a.flags);
                }
                if (a.min != null && Object.hasOwnProperty.call(a, "min")) {
                  l.uint32(89).double(a.min);
                }
                if (a.max != null && Object.hasOwnProperty.call(a, "max")) {
                  l.uint32(97).double(a.max);
                }
                return l;
              };
              o.encodeDelimited = function (a, l) {
                return this.HS(a, l).ldelim();
              };
              o.oC = function (a, l, c) {
                if (!(a instanceof Jr)) {
                  a = Jr.create(a);
                }
                var u = l === undefined ? a.len : a.pos + l;
                var d = new At.opentelemetry.proto.metrics.v1.HistogramDataPoint();
                while (a.pos < u) {
                  var p = a.uint32();
                  if (p === c) {
                    break;
                  }
                  switch (p >>> 3) {
                    case 9:
                      {
                        if (!(d.attributes && d.attributes.length)) {
                          d.attributes = [];
                        }
                        d.attributes.push(At.opentelemetry.proto.common.v1.KeyValue.oC(a, a.uint32()));
                        break;
                      }
                    case 2:
                      {
                        d.startTimeUnixNano = a.fixed64();
                        break;
                      }
                    case 3:
                      {
                        d.timeUnixNano = a.fixed64();
                        break;
                      }
                    case 4:
                      {
                        d.count = a.fixed64();
                        break;
                      }
                    case 5:
                      {
                        d.sum = a.double();
                        break;
                      }
                    case 6:
                      {
                        if (!(d.bucketCounts && d.bucketCounts.length)) {
                          d.bucketCounts = [];
                        }
                        if ((p & 7) === 2) {
                          var m = a.uint32() + a.pos;
                          while (a.pos < m) {
                            d.bucketCounts.push(a.fixed64());
                          }
                        } else {
                          d.bucketCounts.push(a.fixed64());
                        }
                        break;
                      }
                    case 7:
                      {
                        if (!(d.explicitBounds && d.explicitBounds.length)) {
                          d.explicitBounds = [];
                        }
                        if ((p & 7) === 2) {
                          var m = a.uint32() + a.pos;
                          while (a.pos < m) {
                            d.explicitBounds.push(a.double());
                          }
                        } else {
                          d.explicitBounds.push(a.double());
                        }
                        break;
                      }
                    case 8:
                      {
                        if (!(d.exemplars && d.exemplars.length)) {
                          d.exemplars = [];
                        }
                        d.exemplars.push(At.opentelemetry.proto.metrics.v1.Exemplar.oC(a, a.uint32()));
                        break;
                      }
                    case 10:
                      {
                        d.flags = a.uint32();
                        break;
                      }
                    case 11:
                      {
                        d.min = a.double();
                        break;
                      }
                    case 12:
                      {
                        d.max = a.double();
                        break;
                      }
                    default:
                      a.skipType(p & 7);
                      break;
                  }
                }
                return d;
              };
              o.decodeDelimited = function (a) {
                if (!(a instanceof Jr)) {
                  a = new Jr(a);
                }
                return this.oC(a, a.uint32());
              };
              o.verify = function (a) {
                if (typeof a !== "object" || a === null) {
                  return "object expected";
                }
                var l = {};
                if (a.attributes != null && a.hasOwnProperty("attributes")) {
                  if (!Array.isArray(a.attributes)) {
                    return "attributes: array expected";
                  }
                  for (var c = 0; c < a.attributes.length; ++c) {
                    var u = At.opentelemetry.proto.common.v1.KeyValue.verify(a.attributes[c]);
                    if (u) {
                      return "attributes." + u;
                    }
                  }
                }
                if (a.startTimeUnixNano != null && a.hasOwnProperty("startTimeUnixNano")) {
                  if (!Lt.isInteger(a.startTimeUnixNano) && !(a.startTimeUnixNano && Lt.isInteger(a.startTimeUnixNano.low) && Lt.isInteger(a.startTimeUnixNano.high))) {
                    return "startTimeUnixNano: integer|Long expected";
                  }
                }
                if (a.timeUnixNano != null && a.hasOwnProperty("timeUnixNano")) {
                  if (!Lt.isInteger(a.timeUnixNano) && !(a.timeUnixNano && Lt.isInteger(a.timeUnixNano.low) && Lt.isInteger(a.timeUnixNano.high))) {
                    return "timeUnixNano: integer|Long expected";
                  }
                }
                if (a.count != null && a.hasOwnProperty("count")) {
                  if (!Lt.isInteger(a.count) && !(a.count && Lt.isInteger(a.count.low) && Lt.isInteger(a.count.high))) {
                    return "count: integer|Long expected";
                  }
                }
                if (a.sum != null && a.hasOwnProperty("sum")) {
                  if (l._sum = 1, typeof a.sum !== "number") {
                    return "sum: number expected";
                  }
                }
                if (a.bucketCounts != null && a.hasOwnProperty("bucketCounts")) {
                  if (!Array.isArray(a.bucketCounts)) {
                    return "bucketCounts: array expected";
                  }
                  for (var c = 0; c < a.bucketCounts.length; ++c) {
                    if (!Lt.isInteger(a.bucketCounts[c]) && !(a.bucketCounts[c] && Lt.isInteger(a.bucketCounts[c].low) && Lt.isInteger(a.bucketCounts[c].high))) {
                      return "bucketCounts: integer|Long[] expected";
                    }
                  }
                }
                if (a.explicitBounds != null && a.hasOwnProperty("explicitBounds")) {
                  if (!Array.isArray(a.explicitBounds)) {
                    return "explicitBounds: array expected";
                  }
                  for (var c = 0; c < a.explicitBounds.length; ++c) {
                    if (typeof a.explicitBounds[c] !== "number") {
                      return "explicitBounds: number[] expected";
                    }
                  }
                }
                if (a.exemplars != null && a.hasOwnProperty("exemplars")) {
                  if (!Array.isArray(a.exemplars)) {
                    return "exemplars: array expected";
                  }
                  for (var c = 0; c < a.exemplars.length; ++c) {
                    var u = At.opentelemetry.proto.metrics.v1.Exemplar.verify(a.exemplars[c]);
                    if (u) {
                      return "exemplars." + u;
                    }
                  }
                }
                if (a.flags != null && a.hasOwnProperty("flags")) {
                  if (!Lt.isInteger(a.flags)) {
                    return "flags: integer expected";
                  }
                }
                if (a.min != null && a.hasOwnProperty("min")) {
                  if (l._min = 1, typeof a.min !== "number") {
                    return "min: number expected";
                  }
                }
                if (a.max != null && a.hasOwnProperty("max")) {
                  if (l._max = 1, typeof a.max !== "number") {
                    return "max: number expected";
                  }
                }
                return null;
              };
              o.fromObject = function (a) {
                if (a instanceof At.opentelemetry.proto.metrics.v1.HistogramDataPoint) {
                  return a;
                }
                var l = new At.opentelemetry.proto.metrics.v1.HistogramDataPoint();
                if (a.attributes) {
                  if (!Array.isArray(a.attributes)) {
                    throw TypeError(".opentelemetry.proto.metrics.v1.HistogramDataPoint.attributes: array expected");
                  }
                  l.attributes = [];
                  for (var c = 0; c < a.attributes.length; ++c) {
                    if (typeof a.attributes[c] !== "object") {
                      throw TypeError(".opentelemetry.proto.metrics.v1.HistogramDataPoint.attributes: object expected");
                    }
                    l.attributes[c] = At.opentelemetry.proto.common.v1.KeyValue.fromObject(a.attributes[c]);
                  }
                }
                if (a.startTimeUnixNano != null) {
                  if (Lt.Long) {
                    (l.startTimeUnixNano = Lt.Long.fromValue(a.startTimeUnixNano)).unsigned = false;
                  } else if (typeof a.startTimeUnixNano === "string") {
                    l.startTimeUnixNano = parseInt(a.startTimeUnixNano, 10);
                  } else if (typeof a.startTimeUnixNano === "number") {
                    l.startTimeUnixNano = a.startTimeUnixNano;
                  } else if (typeof a.startTimeUnixNano === "object") {
                    l.startTimeUnixNano = new Lt.LongBits(a.startTimeUnixNano.low >>> 0, a.startTimeUnixNano.high >>> 0).toNumber();
                  }
                }
                if (a.timeUnixNano != null) {
                  if (Lt.Long) {
                    (l.timeUnixNano = Lt.Long.fromValue(a.timeUnixNano)).unsigned = false;
                  } else if (typeof a.timeUnixNano === "string") {
                    l.timeUnixNano = parseInt(a.timeUnixNano, 10);
                  } else if (typeof a.timeUnixNano === "number") {
                    l.timeUnixNano = a.timeUnixNano;
                  } else if (typeof a.timeUnixNano === "object") {
                    l.timeUnixNano = new Lt.LongBits(a.timeUnixNano.low >>> 0, a.timeUnixNano.high >>> 0).toNumber();
                  }
                }
                if (a.count != null) {
                  if (Lt.Long) {
                    (l.count = Lt.Long.fromValue(a.count)).unsigned = false;
                  } else if (typeof a.count === "string") {
                    l.count = parseInt(a.count, 10);
                  } else if (typeof a.count === "number") {
                    l.count = a.count;
                  } else if (typeof a.count === "object") {
                    l.count = new Lt.LongBits(a.count.low >>> 0, a.count.high >>> 0).toNumber();
                  }
                }
                if (a.sum != null) {
                  l.sum = Number(a.sum);
                }
                if (a.bucketCounts) {
                  if (!Array.isArray(a.bucketCounts)) {
                    throw TypeError(".opentelemetry.proto.metrics.v1.HistogramDataPoint.bucketCounts: array expected");
                  }
                  l.bucketCounts = [];
                  for (var c = 0; c < a.bucketCounts.length; ++c) {
                    if (Lt.Long) {
                      (l.bucketCounts[c] = Lt.Long.fromValue(a.bucketCounts[c])).unsigned = false;
                    } else if (typeof a.bucketCounts[c] === "string") {
                      l.bucketCounts[c] = parseInt(a.bucketCounts[c], 10);
                    } else if (typeof a.bucketCounts[c] === "number") {
                      l.bucketCounts[c] = a.bucketCounts[c];
                    } else if (typeof a.bucketCounts[c] === "object") {
                      l.bucketCounts[c] = new Lt.LongBits(a.bucketCounts[c].low >>> 0, a.bucketCounts[c].high >>> 0).toNumber();
                    }
                  }
                }
                if (a.explicitBounds) {
                  if (!Array.isArray(a.explicitBounds)) {
                    throw TypeError(".opentelemetry.proto.metrics.v1.HistogramDataPoint.explicitBounds: array expected");
                  }
                  l.explicitBounds = [];
                  for (var c = 0; c < a.explicitBounds.length; ++c) {
                    l.explicitBounds[c] = Number(a.explicitBounds[c]);
                  }
                }
                if (a.exemplars) {
                  if (!Array.isArray(a.exemplars)) {
                    throw TypeError(".opentelemetry.proto.metrics.v1.HistogramDataPoint.exemplars: array expected");
                  }
                  l.exemplars = [];
                  for (var c = 0; c < a.exemplars.length; ++c) {
                    if (typeof a.exemplars[c] !== "object") {
                      throw TypeError(".opentelemetry.proto.metrics.v1.HistogramDataPoint.exemplars: object expected");
                    }
                    l.exemplars[c] = At.opentelemetry.proto.metrics.v1.Exemplar.fromObject(a.exemplars[c]);
                  }
                }
                if (a.flags != null) {
                  l.flags = a.flags >>> 0;
                }
                if (a.min != null) {
                  l.min = Number(a.min);
                }
                if (a.max != null) {
                  l.max = Number(a.max);
                }
                return l;
              };
              o.toObject = function (a, l) {
                if (!l) {
                  l = {};
                }
                var c = {};
                if (l.arrays || l.defaults) {
                  c.bucketCounts = [];
                  c.explicitBounds = [];
                  c.exemplars = [];
                  c.attributes = [];
                }
                if (l.defaults) {
                  if (Lt.Long) {
                    var u = new Lt.Long(0, 0, false);
                    c.startTimeUnixNano = l.longs === String ? u.toString() : l.longs === Number ? u.toNumber() : u;
                  } else {
                    c.startTimeUnixNano = l.longs === String ? "0" : 0;
                  }
                  if (Lt.Long) {
                    var u = new Lt.Long(0, 0, false);
                    c.timeUnixNano = l.longs === String ? u.toString() : l.longs === Number ? u.toNumber() : u;
                  } else {
                    c.timeUnixNano = l.longs === String ? "0" : 0;
                  }
                  if (Lt.Long) {
                    var u = new Lt.Long(0, 0, false);
                    c.count = l.longs === String ? u.toString() : l.longs === Number ? u.toNumber() : u;
                  } else {
                    c.count = l.longs === String ? "0" : 0;
                  }
                  c.flags = 0;
                }
                if (a.startTimeUnixNano != null && a.hasOwnProperty("startTimeUnixNano")) {
                  if (typeof a.startTimeUnixNano === "number") {
                    c.startTimeUnixNano = l.longs === String ? String(a.startTimeUnixNano) : a.startTimeUnixNano;
                  } else {
                    c.startTimeUnixNano = l.longs === String ? Lt.Long.prototype.toString.call(a.startTimeUnixNano) : l.longs === Number ? new Lt.LongBits(a.startTimeUnixNano.low >>> 0, a.startTimeUnixNano.high >>> 0).toNumber() : a.startTimeUnixNano;
                  }
                }
                if (a.timeUnixNano != null && a.hasOwnProperty("timeUnixNano")) {
                  if (typeof a.timeUnixNano === "number") {
                    c.timeUnixNano = l.longs === String ? String(a.timeUnixNano) : a.timeUnixNano;
                  } else {
                    c.timeUnixNano = l.longs === String ? Lt.Long.prototype.toString.call(a.timeUnixNano) : l.longs === Number ? new Lt.LongBits(a.timeUnixNano.low >>> 0, a.timeUnixNano.high >>> 0).toNumber() : a.timeUnixNano;
                  }
                }
                if (a.count != null && a.hasOwnProperty("count")) {
                  if (typeof a.count === "number") {
                    c.count = l.longs === String ? String(a.count) : a.count;
                  } else {
                    c.count = l.longs === String ? Lt.Long.prototype.toString.call(a.count) : l.longs === Number ? new Lt.LongBits(a.count.low >>> 0, a.count.high >>> 0).toNumber() : a.count;
                  }
                }
                if (a.sum != null && a.hasOwnProperty("sum")) {
                  if (c.sum = l.json && !isFinite(a.sum) ? String(a.sum) : a.sum, l.oneofs) {
                    c._sum = "sum";
                  }
                }
                if (a.bucketCounts && a.bucketCounts.length) {
                  c.bucketCounts = [];
                  for (var d = 0; d < a.bucketCounts.length; ++d) {
                    if (typeof a.bucketCounts[d] === "number") {
                      c.bucketCounts[d] = l.longs === String ? String(a.bucketCounts[d]) : a.bucketCounts[d];
                    } else {
                      c.bucketCounts[d] = l.longs === String ? Lt.Long.prototype.toString.call(a.bucketCounts[d]) : l.longs === Number ? new Lt.LongBits(a.bucketCounts[d].low >>> 0, a.bucketCounts[d].high >>> 0).toNumber() : a.bucketCounts[d];
                    }
                  }
                }
                if (a.explicitBounds && a.explicitBounds.length) {
                  c.explicitBounds = [];
                  for (var d = 0; d < a.explicitBounds.length; ++d) {
                    c.explicitBounds[d] = l.json && !isFinite(a.explicitBounds[d]) ? String(a.explicitBounds[d]) : a.explicitBounds[d];
                  }
                }
                if (a.exemplars && a.exemplars.length) {
                  c.exemplars = [];
                  for (var d = 0; d < a.exemplars.length; ++d) {
                    c.exemplars[d] = At.opentelemetry.proto.metrics.v1.Exemplar.toObject(a.exemplars[d], l);
                  }
                }
                if (a.attributes && a.attributes.length) {
                  c.attributes = [];
                  for (var d = 0; d < a.attributes.length; ++d) {
                    c.attributes[d] = At.opentelemetry.proto.common.v1.KeyValue.toObject(a.attributes[d], l);
                  }
                }
                if (a.flags != null && a.hasOwnProperty("flags")) {
                  c.flags = a.flags;
                }
                if (a.min != null && a.hasOwnProperty("min")) {
                  if (c.min = l.json && !isFinite(a.min) ? String(a.min) : a.min, l.oneofs) {
                    c._min = "min";
                  }
                }
                if (a.max != null && a.hasOwnProperty("max")) {
                  if (c.max = l.json && !isFinite(a.max) ? String(a.max) : a.max, l.oneofs) {
                    c._max = "max";
                  }
                }
                return c;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (a) {
                if (a === undefined) {
                  a = "type.googleapis.com";
                }
                return a + "/opentelemetry.proto.metrics.v1.HistogramDataPoint";
              };
              return o;
            }();
            r.ExponentialHistogramDataPoint = function () {
              function o(i) {
                if (this.attributes = [], this.exemplars = [], i) {
                  for (var a = Object.keys(i), l = 0; l < a.length; ++l) {
                    if (i[a[l]] != null) {
                      this[a[l]] = i[a[l]];
                    }
                  }
                }
              }
              o.prototype.attributes = Lt.emptyArray;
              o.prototype.startTimeUnixNano = null;
              o.prototype.timeUnixNano = null;
              o.prototype.count = null;
              o.prototype.sum = null;
              o.prototype.scale = null;
              o.prototype.zeroCount = null;
              o.prototype.positive = null;
              o.prototype.negative = null;
              o.prototype.flags = null;
              o.prototype.exemplars = Lt.emptyArray;
              o.prototype.min = null;
              o.prototype.max = null;
              o.prototype.zeroThreshold = null;
              var s;
              Object.defineProperty(o.prototype, "_sum", {
                get: Lt.oneOfGetter(s = ["sum"]),
                set: Lt.oneOfSetter(s)
              });
              Object.defineProperty(o.prototype, "_min", {
                get: Lt.oneOfGetter(s = ["min"]),
                set: Lt.oneOfSetter(s)
              });
              Object.defineProperty(o.prototype, "_max", {
                get: Lt.oneOfGetter(s = ["max"]),
                set: Lt.oneOfSetter(s)
              });
              o.create = function (a) {
                return new o(a);
              };
              o.HS = function (a, l) {
                if (!l) {
                  l = Im.create();
                }
                if (a.attributes != null && a.attributes.length) {
                  for (var c = 0; c < a.attributes.length; ++c) {
                    At.opentelemetry.proto.common.v1.KeyValue.HS(a.attributes[c], l.uint32(10).fork()).ldelim();
                  }
                }
                if (a.startTimeUnixNano != null && Object.hasOwnProperty.call(a, "startTimeUnixNano")) {
                  l.uint32(17).fixed64(a.startTimeUnixNano);
                }
                if (a.timeUnixNano != null && Object.hasOwnProperty.call(a, "timeUnixNano")) {
                  l.uint32(25).fixed64(a.timeUnixNano);
                }
                if (a.count != null && Object.hasOwnProperty.call(a, "count")) {
                  l.uint32(33).fixed64(a.count);
                }
                if (a.sum != null && Object.hasOwnProperty.call(a, "sum")) {
                  l.uint32(41).double(a.sum);
                }
                if (a.scale != null && Object.hasOwnProperty.call(a, "scale")) {
                  l.uint32(48).sint32(a.scale);
                }
                if (a.zeroCount != null && Object.hasOwnProperty.call(a, "zeroCount")) {
                  l.uint32(57).fixed64(a.zeroCount);
                }
                if (a.positive != null && Object.hasOwnProperty.call(a, "positive")) {
                  At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.Buckets.HS(a.positive, l.uint32(66).fork()).ldelim();
                }
                if (a.negative != null && Object.hasOwnProperty.call(a, "negative")) {
                  At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.Buckets.HS(a.negative, l.uint32(74).fork()).ldelim();
                }
                if (a.flags != null && Object.hasOwnProperty.call(a, "flags")) {
                  l.uint32(80).uint32(a.flags);
                }
                if (a.exemplars != null && a.exemplars.length) {
                  for (var c = 0; c < a.exemplars.length; ++c) {
                    At.opentelemetry.proto.metrics.v1.Exemplar.HS(a.exemplars[c], l.uint32(90).fork()).ldelim();
                  }
                }
                if (a.min != null && Object.hasOwnProperty.call(a, "min")) {
                  l.uint32(97).double(a.min);
                }
                if (a.max != null && Object.hasOwnProperty.call(a, "max")) {
                  l.uint32(105).double(a.max);
                }
                if (a.zeroThreshold != null && Object.hasOwnProperty.call(a, "zeroThreshold")) {
                  l.uint32(113).double(a.zeroThreshold);
                }
                return l;
              };
              o.encodeDelimited = function (a, l) {
                return this.HS(a, l).ldelim();
              };
              o.oC = function (a, l, c) {
                if (!(a instanceof Jr)) {
                  a = Jr.create(a);
                }
                var u = l === undefined ? a.len : a.pos + l;
                var d = new At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint();
                while (a.pos < u) {
                  var p = a.uint32();
                  if (p === c) {
                    break;
                  }
                  switch (p >>> 3) {
                    case 1:
                      {
                        if (!(d.attributes && d.attributes.length)) {
                          d.attributes = [];
                        }
                        d.attributes.push(At.opentelemetry.proto.common.v1.KeyValue.oC(a, a.uint32()));
                        break;
                      }
                    case 2:
                      {
                        d.startTimeUnixNano = a.fixed64();
                        break;
                      }
                    case 3:
                      {
                        d.timeUnixNano = a.fixed64();
                        break;
                      }
                    case 4:
                      {
                        d.count = a.fixed64();
                        break;
                      }
                    case 5:
                      {
                        d.sum = a.double();
                        break;
                      }
                    case 6:
                      {
                        d.scale = a.sint32();
                        break;
                      }
                    case 7:
                      {
                        d.zeroCount = a.fixed64();
                        break;
                      }
                    case 8:
                      {
                        d.positive = At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.Buckets.oC(a, a.uint32());
                        break;
                      }
                    case 9:
                      {
                        d.negative = At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.Buckets.oC(a, a.uint32());
                        break;
                      }
                    case 10:
                      {
                        d.flags = a.uint32();
                        break;
                      }
                    case 11:
                      {
                        if (!(d.exemplars && d.exemplars.length)) {
                          d.exemplars = [];
                        }
                        d.exemplars.push(At.opentelemetry.proto.metrics.v1.Exemplar.oC(a, a.uint32()));
                        break;
                      }
                    case 12:
                      {
                        d.min = a.double();
                        break;
                      }
                    case 13:
                      {
                        d.max = a.double();
                        break;
                      }
                    case 14:
                      {
                        d.zeroThreshold = a.double();
                        break;
                      }
                    default:
                      a.skipType(p & 7);
                      break;
                  }
                }
                return d;
              };
              o.decodeDelimited = function (a) {
                if (!(a instanceof Jr)) {
                  a = new Jr(a);
                }
                return this.oC(a, a.uint32());
              };
              o.verify = function (a) {
                if (typeof a !== "object" || a === null) {
                  return "object expected";
                }
                var l = {};
                if (a.attributes != null && a.hasOwnProperty("attributes")) {
                  if (!Array.isArray(a.attributes)) {
                    return "attributes: array expected";
                  }
                  for (var c = 0; c < a.attributes.length; ++c) {
                    var u = At.opentelemetry.proto.common.v1.KeyValue.verify(a.attributes[c]);
                    if (u) {
                      return "attributes." + u;
                    }
                  }
                }
                if (a.startTimeUnixNano != null && a.hasOwnProperty("startTimeUnixNano")) {
                  if (!Lt.isInteger(a.startTimeUnixNano) && !(a.startTimeUnixNano && Lt.isInteger(a.startTimeUnixNano.low) && Lt.isInteger(a.startTimeUnixNano.high))) {
                    return "startTimeUnixNano: integer|Long expected";
                  }
                }
                if (a.timeUnixNano != null && a.hasOwnProperty("timeUnixNano")) {
                  if (!Lt.isInteger(a.timeUnixNano) && !(a.timeUnixNano && Lt.isInteger(a.timeUnixNano.low) && Lt.isInteger(a.timeUnixNano.high))) {
                    return "timeUnixNano: integer|Long expected";
                  }
                }
                if (a.count != null && a.hasOwnProperty("count")) {
                  if (!Lt.isInteger(a.count) && !(a.count && Lt.isInteger(a.count.low) && Lt.isInteger(a.count.high))) {
                    return "count: integer|Long expected";
                  }
                }
                if (a.sum != null && a.hasOwnProperty("sum")) {
                  if (l._sum = 1, typeof a.sum !== "number") {
                    return "sum: number expected";
                  }
                }
                if (a.scale != null && a.hasOwnProperty("scale")) {
                  if (!Lt.isInteger(a.scale)) {
                    return "scale: integer expected";
                  }
                }
                if (a.zeroCount != null && a.hasOwnProperty("zeroCount")) {
                  if (!Lt.isInteger(a.zeroCount) && !(a.zeroCount && Lt.isInteger(a.zeroCount.low) && Lt.isInteger(a.zeroCount.high))) {
                    return "zeroCount: integer|Long expected";
                  }
                }
                if (a.positive != null && a.hasOwnProperty("positive")) {
                  var u = At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.Buckets.verify(a.positive);
                  if (u) {
                    return "positive." + u;
                  }
                }
                if (a.negative != null && a.hasOwnProperty("negative")) {
                  var u = At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.Buckets.verify(a.negative);
                  if (u) {
                    return "negative." + u;
                  }
                }
                if (a.flags != null && a.hasOwnProperty("flags")) {
                  if (!Lt.isInteger(a.flags)) {
                    return "flags: integer expected";
                  }
                }
                if (a.exemplars != null && a.hasOwnProperty("exemplars")) {
                  if (!Array.isArray(a.exemplars)) {
                    return "exemplars: array expected";
                  }
                  for (var c = 0; c < a.exemplars.length; ++c) {
                    var u = At.opentelemetry.proto.metrics.v1.Exemplar.verify(a.exemplars[c]);
                    if (u) {
                      return "exemplars." + u;
                    }
                  }
                }
                if (a.min != null && a.hasOwnProperty("min")) {
                  if (l._min = 1, typeof a.min !== "number") {
                    return "min: number expected";
                  }
                }
                if (a.max != null && a.hasOwnProperty("max")) {
                  if (l._max = 1, typeof a.max !== "number") {
                    return "max: number expected";
                  }
                }
                if (a.zeroThreshold != null && a.hasOwnProperty("zeroThreshold")) {
                  if (typeof a.zeroThreshold !== "number") {
                    return "zeroThreshold: number expected";
                  }
                }
                return null;
              };
              o.fromObject = function (a) {
                if (a instanceof At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint) {
                  return a;
                }
                var l = new At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint();
                if (a.attributes) {
                  if (!Array.isArray(a.attributes)) {
                    throw TypeError(".opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.attributes: array expected");
                  }
                  l.attributes = [];
                  for (var c = 0; c < a.attributes.length; ++c) {
                    if (typeof a.attributes[c] !== "object") {
                      throw TypeError(".opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.attributes: object expected");
                    }
                    l.attributes[c] = At.opentelemetry.proto.common.v1.KeyValue.fromObject(a.attributes[c]);
                  }
                }
                if (a.startTimeUnixNano != null) {
                  if (Lt.Long) {
                    (l.startTimeUnixNano = Lt.Long.fromValue(a.startTimeUnixNano)).unsigned = false;
                  } else if (typeof a.startTimeUnixNano === "string") {
                    l.startTimeUnixNano = parseInt(a.startTimeUnixNano, 10);
                  } else if (typeof a.startTimeUnixNano === "number") {
                    l.startTimeUnixNano = a.startTimeUnixNano;
                  } else if (typeof a.startTimeUnixNano === "object") {
                    l.startTimeUnixNano = new Lt.LongBits(a.startTimeUnixNano.low >>> 0, a.startTimeUnixNano.high >>> 0).toNumber();
                  }
                }
                if (a.timeUnixNano != null) {
                  if (Lt.Long) {
                    (l.timeUnixNano = Lt.Long.fromValue(a.timeUnixNano)).unsigned = false;
                  } else if (typeof a.timeUnixNano === "string") {
                    l.timeUnixNano = parseInt(a.timeUnixNano, 10);
                  } else if (typeof a.timeUnixNano === "number") {
                    l.timeUnixNano = a.timeUnixNano;
                  } else if (typeof a.timeUnixNano === "object") {
                    l.timeUnixNano = new Lt.LongBits(a.timeUnixNano.low >>> 0, a.timeUnixNano.high >>> 0).toNumber();
                  }
                }
                if (a.count != null) {
                  if (Lt.Long) {
                    (l.count = Lt.Long.fromValue(a.count)).unsigned = false;
                  } else if (typeof a.count === "string") {
                    l.count = parseInt(a.count, 10);
                  } else if (typeof a.count === "number") {
                    l.count = a.count;
                  } else if (typeof a.count === "object") {
                    l.count = new Lt.LongBits(a.count.low >>> 0, a.count.high >>> 0).toNumber();
                  }
                }
                if (a.sum != null) {
                  l.sum = Number(a.sum);
                }
                if (a.scale != null) {
                  l.scale = a.scale | 0;
                }
                if (a.zeroCount != null) {
                  if (Lt.Long) {
                    (l.zeroCount = Lt.Long.fromValue(a.zeroCount)).unsigned = false;
                  } else if (typeof a.zeroCount === "string") {
                    l.zeroCount = parseInt(a.zeroCount, 10);
                  } else if (typeof a.zeroCount === "number") {
                    l.zeroCount = a.zeroCount;
                  } else if (typeof a.zeroCount === "object") {
                    l.zeroCount = new Lt.LongBits(a.zeroCount.low >>> 0, a.zeroCount.high >>> 0).toNumber();
                  }
                }
                if (a.positive != null) {
                  if (typeof a.positive !== "object") {
                    throw TypeError(".opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.positive: object expected");
                  }
                  l.positive = At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.Buckets.fromObject(a.positive);
                }
                if (a.negative != null) {
                  if (typeof a.negative !== "object") {
                    throw TypeError(".opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.negative: object expected");
                  }
                  l.negative = At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.Buckets.fromObject(a.negative);
                }
                if (a.flags != null) {
                  l.flags = a.flags >>> 0;
                }
                if (a.exemplars) {
                  if (!Array.isArray(a.exemplars)) {
                    throw TypeError(".opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.exemplars: array expected");
                  }
                  l.exemplars = [];
                  for (var c = 0; c < a.exemplars.length; ++c) {
                    if (typeof a.exemplars[c] !== "object") {
                      throw TypeError(".opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.exemplars: object expected");
                    }
                    l.exemplars[c] = At.opentelemetry.proto.metrics.v1.Exemplar.fromObject(a.exemplars[c]);
                  }
                }
                if (a.min != null) {
                  l.min = Number(a.min);
                }
                if (a.max != null) {
                  l.max = Number(a.max);
                }
                if (a.zeroThreshold != null) {
                  l.zeroThreshold = Number(a.zeroThreshold);
                }
                return l;
              };
              o.toObject = function (a, l) {
                if (!l) {
                  l = {};
                }
                var c = {};
                if (l.arrays || l.defaults) {
                  c.attributes = [];
                  c.exemplars = [];
                }
                if (l.defaults) {
                  if (Lt.Long) {
                    var u = new Lt.Long(0, 0, false);
                    c.startTimeUnixNano = l.longs === String ? u.toString() : l.longs === Number ? u.toNumber() : u;
                  } else {
                    c.startTimeUnixNano = l.longs === String ? "0" : 0;
                  }
                  if (Lt.Long) {
                    var u = new Lt.Long(0, 0, false);
                    c.timeUnixNano = l.longs === String ? u.toString() : l.longs === Number ? u.toNumber() : u;
                  } else {
                    c.timeUnixNano = l.longs === String ? "0" : 0;
                  }
                  if (Lt.Long) {
                    var u = new Lt.Long(0, 0, false);
                    c.count = l.longs === String ? u.toString() : l.longs === Number ? u.toNumber() : u;
                  } else {
                    c.count = l.longs === String ? "0" : 0;
                  }
                  if (c.scale = 0, Lt.Long) {
                    var u = new Lt.Long(0, 0, false);
                    c.zeroCount = l.longs === String ? u.toString() : l.longs === Number ? u.toNumber() : u;
                  } else {
                    c.zeroCount = l.longs === String ? "0" : 0;
                  }
                  c.positive = null;
                  c.negative = null;
                  c.flags = 0;
                  c.zeroThreshold = 0;
                }
                if (a.attributes && a.attributes.length) {
                  c.attributes = [];
                  for (var d = 0; d < a.attributes.length; ++d) {
                    c.attributes[d] = At.opentelemetry.proto.common.v1.KeyValue.toObject(a.attributes[d], l);
                  }
                }
                if (a.startTimeUnixNano != null && a.hasOwnProperty("startTimeUnixNano")) {
                  if (typeof a.startTimeUnixNano === "number") {
                    c.startTimeUnixNano = l.longs === String ? String(a.startTimeUnixNano) : a.startTimeUnixNano;
                  } else {
                    c.startTimeUnixNano = l.longs === String ? Lt.Long.prototype.toString.call(a.startTimeUnixNano) : l.longs === Number ? new Lt.LongBits(a.startTimeUnixNano.low >>> 0, a.startTimeUnixNano.high >>> 0).toNumber() : a.startTimeUnixNano;
                  }
                }
                if (a.timeUnixNano != null && a.hasOwnProperty("timeUnixNano")) {
                  if (typeof a.timeUnixNano === "number") {
                    c.timeUnixNano = l.longs === String ? String(a.timeUnixNano) : a.timeUnixNano;
                  } else {
                    c.timeUnixNano = l.longs === String ? Lt.Long.prototype.toString.call(a.timeUnixNano) : l.longs === Number ? new Lt.LongBits(a.timeUnixNano.low >>> 0, a.timeUnixNano.high >>> 0).toNumber() : a.timeUnixNano;
                  }
                }
                if (a.count != null && a.hasOwnProperty("count")) {
                  if (typeof a.count === "number") {
                    c.count = l.longs === String ? String(a.count) : a.count;
                  } else {
                    c.count = l.longs === String ? Lt.Long.prototype.toString.call(a.count) : l.longs === Number ? new Lt.LongBits(a.count.low >>> 0, a.count.high >>> 0).toNumber() : a.count;
                  }
                }
                if (a.sum != null && a.hasOwnProperty("sum")) {
                  if (c.sum = l.json && !isFinite(a.sum) ? String(a.sum) : a.sum, l.oneofs) {
                    c._sum = "sum";
                  }
                }
                if (a.scale != null && a.hasOwnProperty("scale")) {
                  c.scale = a.scale;
                }
                if (a.zeroCount != null && a.hasOwnProperty("zeroCount")) {
                  if (typeof a.zeroCount === "number") {
                    c.zeroCount = l.longs === String ? String(a.zeroCount) : a.zeroCount;
                  } else {
                    c.zeroCount = l.longs === String ? Lt.Long.prototype.toString.call(a.zeroCount) : l.longs === Number ? new Lt.LongBits(a.zeroCount.low >>> 0, a.zeroCount.high >>> 0).toNumber() : a.zeroCount;
                  }
                }
                if (a.positive != null && a.hasOwnProperty("positive")) {
                  c.positive = At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.Buckets.toObject(a.positive, l);
                }
                if (a.negative != null && a.hasOwnProperty("negative")) {
                  c.negative = At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.Buckets.toObject(a.negative, l);
                }
                if (a.flags != null && a.hasOwnProperty("flags")) {
                  c.flags = a.flags;
                }
                if (a.exemplars && a.exemplars.length) {
                  c.exemplars = [];
                  for (var d = 0; d < a.exemplars.length; ++d) {
                    c.exemplars[d] = At.opentelemetry.proto.metrics.v1.Exemplar.toObject(a.exemplars[d], l);
                  }
                }
                if (a.min != null && a.hasOwnProperty("min")) {
                  if (c.min = l.json && !isFinite(a.min) ? String(a.min) : a.min, l.oneofs) {
                    c._min = "min";
                  }
                }
                if (a.max != null && a.hasOwnProperty("max")) {
                  if (c.max = l.json && !isFinite(a.max) ? String(a.max) : a.max, l.oneofs) {
                    c._max = "max";
                  }
                }
                if (a.zeroThreshold != null && a.hasOwnProperty("zeroThreshold")) {
                  c.zeroThreshold = l.json && !isFinite(a.zeroThreshold) ? String(a.zeroThreshold) : a.zeroThreshold;
                }
                return c;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (a) {
                if (a === undefined) {
                  a = "type.googleapis.com";
                }
                return a + "/opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint";
              };
              o.Buckets = function () {
                function i(a) {
                  if (this.bucketCounts = [], a) {
                    for (var l = Object.keys(a), c = 0; c < l.length; ++c) {
                      if (a[l[c]] != null) {
                        this[l[c]] = a[l[c]];
                      }
                    }
                  }
                }
                i.prototype.offset = null;
                i.prototype.bucketCounts = Lt.emptyArray;
                i.create = function (l) {
                  return new i(l);
                };
                i.HS = function (l, c) {
                  if (!c) {
                    c = Im.create();
                  }
                  if (l.offset != null && Object.hasOwnProperty.call(l, "offset")) {
                    c.uint32(8).sint32(l.offset);
                  }
                  if (l.bucketCounts != null && l.bucketCounts.length) {
                    c.uint32(18).fork();
                    for (var u = 0; u < l.bucketCounts.length; ++u) {
                      c.uint64(l.bucketCounts[u]);
                    }
                    c.ldelim();
                  }
                  return c;
                };
                i.encodeDelimited = function (l, c) {
                  return this.HS(l, c).ldelim();
                };
                i.oC = function (l, c, u) {
                  if (!(l instanceof Jr)) {
                    l = Jr.create(l);
                  }
                  var d = c === undefined ? l.len : l.pos + c;
                  var p = new At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.Buckets();
                  while (l.pos < d) {
                    var m = l.uint32();
                    if (m === u) {
                      break;
                    }
                    switch (m >>> 3) {
                      case 1:
                        {
                          p.offset = l.sint32();
                          break;
                        }
                      case 2:
                        {
                          if (!(p.bucketCounts && p.bucketCounts.length)) {
                            p.bucketCounts = [];
                          }
                          if ((m & 7) === 2) {
                            var f = l.uint32() + l.pos;
                            while (l.pos < f) {
                              p.bucketCounts.push(l.uint64());
                            }
                          } else {
                            p.bucketCounts.push(l.uint64());
                          }
                          break;
                        }
                      default:
                        l.skipType(m & 7);
                        break;
                    }
                  }
                  return p;
                };
                i.decodeDelimited = function (l) {
                  if (!(l instanceof Jr)) {
                    l = new Jr(l);
                  }
                  return this.oC(l, l.uint32());
                };
                i.verify = function (l) {
                  if (typeof l !== "object" || l === null) {
                    return "object expected";
                  }
                  if (l.offset != null && l.hasOwnProperty("offset")) {
                    if (!Lt.isInteger(l.offset)) {
                      return "offset: integer expected";
                    }
                  }
                  if (l.bucketCounts != null && l.hasOwnProperty("bucketCounts")) {
                    if (!Array.isArray(l.bucketCounts)) {
                      return "bucketCounts: array expected";
                    }
                    for (var c = 0; c < l.bucketCounts.length; ++c) {
                      if (!Lt.isInteger(l.bucketCounts[c]) && !(l.bucketCounts[c] && Lt.isInteger(l.bucketCounts[c].low) && Lt.isInteger(l.bucketCounts[c].high))) {
                        return "bucketCounts: integer|Long[] expected";
                      }
                    }
                  }
                  return null;
                };
                i.fromObject = function (l) {
                  if (l instanceof At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.Buckets) {
                    return l;
                  }
                  var c = new At.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.Buckets();
                  if (l.offset != null) {
                    c.offset = l.offset | 0;
                  }
                  if (l.bucketCounts) {
                    if (!Array.isArray(l.bucketCounts)) {
                      throw TypeError(".opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.Buckets.bucketCounts: array expected");
                    }
                    c.bucketCounts = [];
                    for (var u = 0; u < l.bucketCounts.length; ++u) {
                      if (Lt.Long) {
                        (c.bucketCounts[u] = Lt.Long.fromValue(l.bucketCounts[u])).unsigned = true;
                      } else if (typeof l.bucketCounts[u] === "string") {
                        c.bucketCounts[u] = parseInt(l.bucketCounts[u], 10);
                      } else if (typeof l.bucketCounts[u] === "number") {
                        c.bucketCounts[u] = l.bucketCounts[u];
                      } else if (typeof l.bucketCounts[u] === "object") {
                        c.bucketCounts[u] = new Lt.LongBits(l.bucketCounts[u].low >>> 0, l.bucketCounts[u].high >>> 0).toNumber(true);
                      }
                    }
                  }
                  return c;
                };
                i.toObject = function (l, c) {
                  if (!c) {
                    c = {};
                  }
                  var u = {};
                  if (c.arrays || c.defaults) {
                    u.bucketCounts = [];
                  }
                  if (c.defaults) {
                    u.offset = 0;
                  }
                  if (l.offset != null && l.hasOwnProperty("offset")) {
                    u.offset = l.offset;
                  }
                  if (l.bucketCounts && l.bucketCounts.length) {
                    u.bucketCounts = [];
                    for (var d = 0; d < l.bucketCounts.length; ++d) {
                      if (typeof l.bucketCounts[d] === "number") {
                        u.bucketCounts[d] = c.longs === String ? String(l.bucketCounts[d]) : l.bucketCounts[d];
                      } else {
                        u.bucketCounts[d] = c.longs === String ? Lt.Long.prototype.toString.call(l.bucketCounts[d]) : c.longs === Number ? new Lt.LongBits(l.bucketCounts[d].low >>> 0, l.bucketCounts[d].high >>> 0).toNumber(true) : l.bucketCounts[d];
                      }
                    }
                  }
                  return u;
                };
                i.prototype.toJSON = function () {
                  return this.constructor.toObject(this, rd.util.toJSONOptions);
                };
                i.getTypeUrl = function (l) {
                  if (l === undefined) {
                    l = "type.googleapis.com";
                  }
                  return l + "/opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.Buckets";
                };
                return i;
              }();
              return o;
            }();
            r.SummaryDataPoint = function () {
              function o(s) {
                if (this.attributes = [], this.quantileValues = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.attributes = Lt.emptyArray;
              o.prototype.startTimeUnixNano = null;
              o.prototype.timeUnixNano = null;
              o.prototype.count = null;
              o.prototype.sum = null;
              o.prototype.quantileValues = Lt.emptyArray;
              o.prototype.flags = null;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.startTimeUnixNano != null && Object.hasOwnProperty.call(i, "startTimeUnixNano")) {
                  a.uint32(17).fixed64(i.startTimeUnixNano);
                }
                if (i.timeUnixNano != null && Object.hasOwnProperty.call(i, "timeUnixNano")) {
                  a.uint32(25).fixed64(i.timeUnixNano);
                }
                if (i.count != null && Object.hasOwnProperty.call(i, "count")) {
                  a.uint32(33).fixed64(i.count);
                }
                if (i.sum != null && Object.hasOwnProperty.call(i, "sum")) {
                  a.uint32(41).double(i.sum);
                }
                if (i.quantileValues != null && i.quantileValues.length) {
                  for (var l = 0; l < i.quantileValues.length; ++l) {
                    At.opentelemetry.proto.metrics.v1.SummaryDataPoint.ValueAtQuantile.HS(i.quantileValues[l], a.uint32(50).fork()).ldelim();
                  }
                }
                if (i.attributes != null && i.attributes.length) {
                  for (var l = 0; l < i.attributes.length; ++l) {
                    At.opentelemetry.proto.common.v1.KeyValue.HS(i.attributes[l], a.uint32(58).fork()).ldelim();
                  }
                }
                if (i.flags != null && Object.hasOwnProperty.call(i, "flags")) {
                  a.uint32(64).uint32(i.flags);
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.metrics.v1.SummaryDataPoint();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 7:
                      {
                        if (!(u.attributes && u.attributes.length)) {
                          u.attributes = [];
                        }
                        u.attributes.push(At.opentelemetry.proto.common.v1.KeyValue.oC(i, i.uint32()));
                        break;
                      }
                    case 2:
                      {
                        u.startTimeUnixNano = i.fixed64();
                        break;
                      }
                    case 3:
                      {
                        u.timeUnixNano = i.fixed64();
                        break;
                      }
                    case 4:
                      {
                        u.count = i.fixed64();
                        break;
                      }
                    case 5:
                      {
                        u.sum = i.double();
                        break;
                      }
                    case 6:
                      {
                        if (!(u.quantileValues && u.quantileValues.length)) {
                          u.quantileValues = [];
                        }
                        u.quantileValues.push(At.opentelemetry.proto.metrics.v1.SummaryDataPoint.ValueAtQuantile.oC(i, i.uint32()));
                        break;
                      }
                    case 8:
                      {
                        u.flags = i.uint32();
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.attributes != null && i.hasOwnProperty("attributes")) {
                  if (!Array.isArray(i.attributes)) {
                    return "attributes: array expected";
                  }
                  for (var a = 0; a < i.attributes.length; ++a) {
                    var l = At.opentelemetry.proto.common.v1.KeyValue.verify(i.attributes[a]);
                    if (l) {
                      return "attributes." + l;
                    }
                  }
                }
                if (i.startTimeUnixNano != null && i.hasOwnProperty("startTimeUnixNano")) {
                  if (!Lt.isInteger(i.startTimeUnixNano) && !(i.startTimeUnixNano && Lt.isInteger(i.startTimeUnixNano.low) && Lt.isInteger(i.startTimeUnixNano.high))) {
                    return "startTimeUnixNano: integer|Long expected";
                  }
                }
                if (i.timeUnixNano != null && i.hasOwnProperty("timeUnixNano")) {
                  if (!Lt.isInteger(i.timeUnixNano) && !(i.timeUnixNano && Lt.isInteger(i.timeUnixNano.low) && Lt.isInteger(i.timeUnixNano.high))) {
                    return "timeUnixNano: integer|Long expected";
                  }
                }
                if (i.count != null && i.hasOwnProperty("count")) {
                  if (!Lt.isInteger(i.count) && !(i.count && Lt.isInteger(i.count.low) && Lt.isInteger(i.count.high))) {
                    return "count: integer|Long expected";
                  }
                }
                if (i.sum != null && i.hasOwnProperty("sum")) {
                  if (typeof i.sum !== "number") {
                    return "sum: number expected";
                  }
                }
                if (i.quantileValues != null && i.hasOwnProperty("quantileValues")) {
                  if (!Array.isArray(i.quantileValues)) {
                    return "quantileValues: array expected";
                  }
                  for (var a = 0; a < i.quantileValues.length; ++a) {
                    var l = At.opentelemetry.proto.metrics.v1.SummaryDataPoint.ValueAtQuantile.verify(i.quantileValues[a]);
                    if (l) {
                      return "quantileValues." + l;
                    }
                  }
                }
                if (i.flags != null && i.hasOwnProperty("flags")) {
                  if (!Lt.isInteger(i.flags)) {
                    return "flags: integer expected";
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.metrics.v1.SummaryDataPoint) {
                  return i;
                }
                var a = new At.opentelemetry.proto.metrics.v1.SummaryDataPoint();
                if (i.attributes) {
                  if (!Array.isArray(i.attributes)) {
                    throw TypeError(".opentelemetry.proto.metrics.v1.SummaryDataPoint.attributes: array expected");
                  }
                  a.attributes = [];
                  for (var l = 0; l < i.attributes.length; ++l) {
                    if (typeof i.attributes[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.metrics.v1.SummaryDataPoint.attributes: object expected");
                    }
                    a.attributes[l] = At.opentelemetry.proto.common.v1.KeyValue.fromObject(i.attributes[l]);
                  }
                }
                if (i.startTimeUnixNano != null) {
                  if (Lt.Long) {
                    (a.startTimeUnixNano = Lt.Long.fromValue(i.startTimeUnixNano)).unsigned = false;
                  } else if (typeof i.startTimeUnixNano === "string") {
                    a.startTimeUnixNano = parseInt(i.startTimeUnixNano, 10);
                  } else if (typeof i.startTimeUnixNano === "number") {
                    a.startTimeUnixNano = i.startTimeUnixNano;
                  } else if (typeof i.startTimeUnixNano === "object") {
                    a.startTimeUnixNano = new Lt.LongBits(i.startTimeUnixNano.low >>> 0, i.startTimeUnixNano.high >>> 0).toNumber();
                  }
                }
                if (i.timeUnixNano != null) {
                  if (Lt.Long) {
                    (a.timeUnixNano = Lt.Long.fromValue(i.timeUnixNano)).unsigned = false;
                  } else if (typeof i.timeUnixNano === "string") {
                    a.timeUnixNano = parseInt(i.timeUnixNano, 10);
                  } else if (typeof i.timeUnixNano === "number") {
                    a.timeUnixNano = i.timeUnixNano;
                  } else if (typeof i.timeUnixNano === "object") {
                    a.timeUnixNano = new Lt.LongBits(i.timeUnixNano.low >>> 0, i.timeUnixNano.high >>> 0).toNumber();
                  }
                }
                if (i.count != null) {
                  if (Lt.Long) {
                    (a.count = Lt.Long.fromValue(i.count)).unsigned = false;
                  } else if (typeof i.count === "string") {
                    a.count = parseInt(i.count, 10);
                  } else if (typeof i.count === "number") {
                    a.count = i.count;
                  } else if (typeof i.count === "object") {
                    a.count = new Lt.LongBits(i.count.low >>> 0, i.count.high >>> 0).toNumber();
                  }
                }
                if (i.sum != null) {
                  a.sum = Number(i.sum);
                }
                if (i.quantileValues) {
                  if (!Array.isArray(i.quantileValues)) {
                    throw TypeError(".opentelemetry.proto.metrics.v1.SummaryDataPoint.quantileValues: array expected");
                  }
                  a.quantileValues = [];
                  for (var l = 0; l < i.quantileValues.length; ++l) {
                    if (typeof i.quantileValues[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.metrics.v1.SummaryDataPoint.quantileValues: object expected");
                    }
                    a.quantileValues[l] = At.opentelemetry.proto.metrics.v1.SummaryDataPoint.ValueAtQuantile.fromObject(i.quantileValues[l]);
                  }
                }
                if (i.flags != null) {
                  a.flags = i.flags >>> 0;
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.quantileValues = [];
                  l.attributes = [];
                }
                if (a.defaults) {
                  if (Lt.Long) {
                    var c = new Lt.Long(0, 0, false);
                    l.startTimeUnixNano = a.longs === String ? c.toString() : a.longs === Number ? c.toNumber() : c;
                  } else {
                    l.startTimeUnixNano = a.longs === String ? "0" : 0;
                  }
                  if (Lt.Long) {
                    var c = new Lt.Long(0, 0, false);
                    l.timeUnixNano = a.longs === String ? c.toString() : a.longs === Number ? c.toNumber() : c;
                  } else {
                    l.timeUnixNano = a.longs === String ? "0" : 0;
                  }
                  if (Lt.Long) {
                    var c = new Lt.Long(0, 0, false);
                    l.count = a.longs === String ? c.toString() : a.longs === Number ? c.toNumber() : c;
                  } else {
                    l.count = a.longs === String ? "0" : 0;
                  }
                  l.sum = 0;
                  l.flags = 0;
                }
                if (i.startTimeUnixNano != null && i.hasOwnProperty("startTimeUnixNano")) {
                  if (typeof i.startTimeUnixNano === "number") {
                    l.startTimeUnixNano = a.longs === String ? String(i.startTimeUnixNano) : i.startTimeUnixNano;
                  } else {
                    l.startTimeUnixNano = a.longs === String ? Lt.Long.prototype.toString.call(i.startTimeUnixNano) : a.longs === Number ? new Lt.LongBits(i.startTimeUnixNano.low >>> 0, i.startTimeUnixNano.high >>> 0).toNumber() : i.startTimeUnixNano;
                  }
                }
                if (i.timeUnixNano != null && i.hasOwnProperty("timeUnixNano")) {
                  if (typeof i.timeUnixNano === "number") {
                    l.timeUnixNano = a.longs === String ? String(i.timeUnixNano) : i.timeUnixNano;
                  } else {
                    l.timeUnixNano = a.longs === String ? Lt.Long.prototype.toString.call(i.timeUnixNano) : a.longs === Number ? new Lt.LongBits(i.timeUnixNano.low >>> 0, i.timeUnixNano.high >>> 0).toNumber() : i.timeUnixNano;
                  }
                }
                if (i.count != null && i.hasOwnProperty("count")) {
                  if (typeof i.count === "number") {
                    l.count = a.longs === String ? String(i.count) : i.count;
                  } else {
                    l.count = a.longs === String ? Lt.Long.prototype.toString.call(i.count) : a.longs === Number ? new Lt.LongBits(i.count.low >>> 0, i.count.high >>> 0).toNumber() : i.count;
                  }
                }
                if (i.sum != null && i.hasOwnProperty("sum")) {
                  l.sum = a.json && !isFinite(i.sum) ? String(i.sum) : i.sum;
                }
                if (i.quantileValues && i.quantileValues.length) {
                  l.quantileValues = [];
                  for (var u = 0; u < i.quantileValues.length; ++u) {
                    l.quantileValues[u] = At.opentelemetry.proto.metrics.v1.SummaryDataPoint.ValueAtQuantile.toObject(i.quantileValues[u], a);
                  }
                }
                if (i.attributes && i.attributes.length) {
                  l.attributes = [];
                  for (var u = 0; u < i.attributes.length; ++u) {
                    l.attributes[u] = At.opentelemetry.proto.common.v1.KeyValue.toObject(i.attributes[u], a);
                  }
                }
                if (i.flags != null && i.hasOwnProperty("flags")) {
                  l.flags = i.flags;
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.metrics.v1.SummaryDataPoint";
              };
              o.ValueAtQuantile = function () {
                function s(i) {
                  if (i) {
                    for (var a = Object.keys(i), l = 0; l < a.length; ++l) {
                      if (i[a[l]] != null) {
                        this[a[l]] = i[a[l]];
                      }
                    }
                  }
                }
                s.prototype.quantile = null;
                s.prototype.value = null;
                s.create = function (a) {
                  return new s(a);
                };
                s.HS = function (a, l) {
                  if (!l) {
                    l = Im.create();
                  }
                  if (a.quantile != null && Object.hasOwnProperty.call(a, "quantile")) {
                    l.uint32(9).double(a.quantile);
                  }
                  if (a.value != null && Object.hasOwnProperty.call(a, "value")) {
                    l.uint32(17).double(a.value);
                  }
                  return l;
                };
                s.encodeDelimited = function (a, l) {
                  return this.HS(a, l).ldelim();
                };
                s.oC = function (a, l, c) {
                  if (!(a instanceof Jr)) {
                    a = Jr.create(a);
                  }
                  var u = l === undefined ? a.len : a.pos + l;
                  var d = new At.opentelemetry.proto.metrics.v1.SummaryDataPoint.ValueAtQuantile();
                  while (a.pos < u) {
                    var p = a.uint32();
                    if (p === c) {
                      break;
                    }
                    switch (p >>> 3) {
                      case 1:
                        {
                          d.quantile = a.double();
                          break;
                        }
                      case 2:
                        {
                          d.value = a.double();
                          break;
                        }
                      default:
                        a.skipType(p & 7);
                        break;
                    }
                  }
                  return d;
                };
                s.decodeDelimited = function (a) {
                  if (!(a instanceof Jr)) {
                    a = new Jr(a);
                  }
                  return this.oC(a, a.uint32());
                };
                s.verify = function (a) {
                  if (typeof a !== "object" || a === null) {
                    return "object expected";
                  }
                  if (a.quantile != null && a.hasOwnProperty("quantile")) {
                    if (typeof a.quantile !== "number") {
                      return "quantile: number expected";
                    }
                  }
                  if (a.value != null && a.hasOwnProperty("value")) {
                    if (typeof a.value !== "number") {
                      return "value: number expected";
                    }
                  }
                  return null;
                };
                s.fromObject = function (a) {
                  if (a instanceof At.opentelemetry.proto.metrics.v1.SummaryDataPoint.ValueAtQuantile) {
                    return a;
                  }
                  var l = new At.opentelemetry.proto.metrics.v1.SummaryDataPoint.ValueAtQuantile();
                  if (a.quantile != null) {
                    l.quantile = Number(a.quantile);
                  }
                  if (a.value != null) {
                    l.value = Number(a.value);
                  }
                  return l;
                };
                s.toObject = function (a, l) {
                  if (!l) {
                    l = {};
                  }
                  var c = {};
                  if (l.defaults) {
                    c.quantile = 0;
                    c.value = 0;
                  }
                  if (a.quantile != null && a.hasOwnProperty("quantile")) {
                    c.quantile = l.json && !isFinite(a.quantile) ? String(a.quantile) : a.quantile;
                  }
                  if (a.value != null && a.hasOwnProperty("value")) {
                    c.value = l.json && !isFinite(a.value) ? String(a.value) : a.value;
                  }
                  return c;
                };
                s.prototype.toJSON = function () {
                  return this.constructor.toObject(this, rd.util.toJSONOptions);
                };
                s.getTypeUrl = function (a) {
                  if (a === undefined) {
                    a = "type.googleapis.com";
                  }
                  return a + "/opentelemetry.proto.metrics.v1.SummaryDataPoint.ValueAtQuantile";
                };
                return s;
              }();
              return o;
            }();
            r.Exemplar = function () {
              function o(i) {
                if (this.filteredAttributes = [], i) {
                  for (var a = Object.keys(i), l = 0; l < a.length; ++l) {
                    if (i[a[l]] != null) {
                      this[a[l]] = i[a[l]];
                    }
                  }
                }
              }
              o.prototype.filteredAttributes = Lt.emptyArray;
              o.prototype.timeUnixNano = null;
              o.prototype.asDouble = null;
              o.prototype.asInt = null;
              o.prototype.spanId = null;
              o.prototype.traceId = null;
              var s;
              Object.defineProperty(o.prototype, "value", {
                get: Lt.oneOfGetter(s = ["asDouble", "asInt"]),
                set: Lt.oneOfSetter(s)
              });
              o.create = function (a) {
                return new o(a);
              };
              o.HS = function (a, l) {
                if (!l) {
                  l = Im.create();
                }
                if (a.timeUnixNano != null && Object.hasOwnProperty.call(a, "timeUnixNano")) {
                  l.uint32(17).fixed64(a.timeUnixNano);
                }
                if (a.asDouble != null && Object.hasOwnProperty.call(a, "asDouble")) {
                  l.uint32(25).double(a.asDouble);
                }
                if (a.spanId != null && Object.hasOwnProperty.call(a, "spanId")) {
                  l.uint32(34).bytes(a.spanId);
                }
                if (a.traceId != null && Object.hasOwnProperty.call(a, "traceId")) {
                  l.uint32(42).bytes(a.traceId);
                }
                if (a.asInt != null && Object.hasOwnProperty.call(a, "asInt")) {
                  l.uint32(49).sfixed64(a.asInt);
                }
                if (a.filteredAttributes != null && a.filteredAttributes.length) {
                  for (var c = 0; c < a.filteredAttributes.length; ++c) {
                    At.opentelemetry.proto.common.v1.KeyValue.HS(a.filteredAttributes[c], l.uint32(58).fork()).ldelim();
                  }
                }
                return l;
              };
              o.encodeDelimited = function (a, l) {
                return this.HS(a, l).ldelim();
              };
              o.oC = function (a, l, c) {
                if (!(a instanceof Jr)) {
                  a = Jr.create(a);
                }
                var u = l === undefined ? a.len : a.pos + l;
                var d = new At.opentelemetry.proto.metrics.v1.Exemplar();
                while (a.pos < u) {
                  var p = a.uint32();
                  if (p === c) {
                    break;
                  }
                  switch (p >>> 3) {
                    case 7:
                      {
                        if (!(d.filteredAttributes && d.filteredAttributes.length)) {
                          d.filteredAttributes = [];
                        }
                        d.filteredAttributes.push(At.opentelemetry.proto.common.v1.KeyValue.oC(a, a.uint32()));
                        break;
                      }
                    case 2:
                      {
                        d.timeUnixNano = a.fixed64();
                        break;
                      }
                    case 3:
                      {
                        d.asDouble = a.double();
                        break;
                      }
                    case 6:
                      {
                        d.asInt = a.sfixed64();
                        break;
                      }
                    case 4:
                      {
                        d.spanId = a.bytes();
                        break;
                      }
                    case 5:
                      {
                        d.traceId = a.bytes();
                        break;
                      }
                    default:
                      a.skipType(p & 7);
                      break;
                  }
                }
                return d;
              };
              o.decodeDelimited = function (a) {
                if (!(a instanceof Jr)) {
                  a = new Jr(a);
                }
                return this.oC(a, a.uint32());
              };
              o.verify = function (a) {
                if (typeof a !== "object" || a === null) {
                  return "object expected";
                }
                var l = {};
                if (a.filteredAttributes != null && a.hasOwnProperty("filteredAttributes")) {
                  if (!Array.isArray(a.filteredAttributes)) {
                    return "filteredAttributes: array expected";
                  }
                  for (var c = 0; c < a.filteredAttributes.length; ++c) {
                    var u = At.opentelemetry.proto.common.v1.KeyValue.verify(a.filteredAttributes[c]);
                    if (u) {
                      return "filteredAttributes." + u;
                    }
                  }
                }
                if (a.timeUnixNano != null && a.hasOwnProperty("timeUnixNano")) {
                  if (!Lt.isInteger(a.timeUnixNano) && !(a.timeUnixNano && Lt.isInteger(a.timeUnixNano.low) && Lt.isInteger(a.timeUnixNano.high))) {
                    return "timeUnixNano: integer|Long expected";
                  }
                }
                if (a.asDouble != null && a.hasOwnProperty("asDouble")) {
                  if (l.value = 1, typeof a.asDouble !== "number") {
                    return "asDouble: number expected";
                  }
                }
                if (a.asInt != null && a.hasOwnProperty("asInt")) {
                  if (l.value === 1) {
                    return "value: multiple values";
                  }
                  if (l.value = 1, !Lt.isInteger(a.asInt) && !(a.asInt && Lt.isInteger(a.asInt.low) && Lt.isInteger(a.asInt.high))) {
                    return "asInt: integer|Long expected";
                  }
                }
                if (a.spanId != null && a.hasOwnProperty("spanId")) {
                  if (!(a.spanId && typeof a.spanId.length === "number" || Lt.isString(a.spanId))) {
                    return "spanId: buffer expected";
                  }
                }
                if (a.traceId != null && a.hasOwnProperty("traceId")) {
                  if (!(a.traceId && typeof a.traceId.length === "number" || Lt.isString(a.traceId))) {
                    return "traceId: buffer expected";
                  }
                }
                return null;
              };
              o.fromObject = function (a) {
                if (a instanceof At.opentelemetry.proto.metrics.v1.Exemplar) {
                  return a;
                }
                var l = new At.opentelemetry.proto.metrics.v1.Exemplar();
                if (a.filteredAttributes) {
                  if (!Array.isArray(a.filteredAttributes)) {
                    throw TypeError(".opentelemetry.proto.metrics.v1.Exemplar.filteredAttributes: array expected");
                  }
                  l.filteredAttributes = [];
                  for (var c = 0; c < a.filteredAttributes.length; ++c) {
                    if (typeof a.filteredAttributes[c] !== "object") {
                      throw TypeError(".opentelemetry.proto.metrics.v1.Exemplar.filteredAttributes: object expected");
                    }
                    l.filteredAttributes[c] = At.opentelemetry.proto.common.v1.KeyValue.fromObject(a.filteredAttributes[c]);
                  }
                }
                if (a.timeUnixNano != null) {
                  if (Lt.Long) {
                    (l.timeUnixNano = Lt.Long.fromValue(a.timeUnixNano)).unsigned = false;
                  } else if (typeof a.timeUnixNano === "string") {
                    l.timeUnixNano = parseInt(a.timeUnixNano, 10);
                  } else if (typeof a.timeUnixNano === "number") {
                    l.timeUnixNano = a.timeUnixNano;
                  } else if (typeof a.timeUnixNano === "object") {
                    l.timeUnixNano = new Lt.LongBits(a.timeUnixNano.low >>> 0, a.timeUnixNano.high >>> 0).toNumber();
                  }
                }
                if (a.asDouble != null) {
                  l.asDouble = Number(a.asDouble);
                }
                if (a.asInt != null) {
                  if (Lt.Long) {
                    (l.asInt = Lt.Long.fromValue(a.asInt)).unsigned = false;
                  } else if (typeof a.asInt === "string") {
                    l.asInt = parseInt(a.asInt, 10);
                  } else if (typeof a.asInt === "number") {
                    l.asInt = a.asInt;
                  } else if (typeof a.asInt === "object") {
                    l.asInt = new Lt.LongBits(a.asInt.low >>> 0, a.asInt.high >>> 0).toNumber();
                  }
                }
                if (a.spanId != null) {
                  if (typeof a.spanId === "string") {
                    Lt.base64.oC(a.spanId, l.spanId = Lt.newBuffer(Lt.base64.length(a.spanId)), 0);
                  } else if (a.spanId.length >= 0) {
                    l.spanId = a.spanId;
                  }
                }
                if (a.traceId != null) {
                  if (typeof a.traceId === "string") {
                    Lt.base64.oC(a.traceId, l.traceId = Lt.newBuffer(Lt.base64.length(a.traceId)), 0);
                  } else if (a.traceId.length >= 0) {
                    l.traceId = a.traceId;
                  }
                }
                return l;
              };
              o.toObject = function (a, l) {
                if (!l) {
                  l = {};
                }
                var c = {};
                if (l.arrays || l.defaults) {
                  c.filteredAttributes = [];
                }
                if (l.defaults) {
                  if (Lt.Long) {
                    var u = new Lt.Long(0, 0, false);
                    c.timeUnixNano = l.longs === String ? u.toString() : l.longs === Number ? u.toNumber() : u;
                  } else {
                    c.timeUnixNano = l.longs === String ? "0" : 0;
                  }
                  if (l.bytes === String) {
                    c.spanId = "";
                  } else if (c.spanId = [], l.bytes !== Array) {
                    c.spanId = Lt.newBuffer(c.spanId);
                  }
                  if (l.bytes === String) {
                    c.traceId = "";
                  } else if (c.traceId = [], l.bytes !== Array) {
                    c.traceId = Lt.newBuffer(c.traceId);
                  }
                }
                if (a.timeUnixNano != null && a.hasOwnProperty("timeUnixNano")) {
                  if (typeof a.timeUnixNano === "number") {
                    c.timeUnixNano = l.longs === String ? String(a.timeUnixNano) : a.timeUnixNano;
                  } else {
                    c.timeUnixNano = l.longs === String ? Lt.Long.prototype.toString.call(a.timeUnixNano) : l.longs === Number ? new Lt.LongBits(a.timeUnixNano.low >>> 0, a.timeUnixNano.high >>> 0).toNumber() : a.timeUnixNano;
                  }
                }
                if (a.asDouble != null && a.hasOwnProperty("asDouble")) {
                  if (c.asDouble = l.json && !isFinite(a.asDouble) ? String(a.asDouble) : a.asDouble, l.oneofs) {
                    c.value = "asDouble";
                  }
                }
                if (a.spanId != null && a.hasOwnProperty("spanId")) {
                  c.spanId = l.bytes === String ? Lt.base64.HS(a.spanId, 0, a.spanId.length) : l.bytes === Array ? Array.prototype.slice.call(a.spanId) : a.spanId;
                }
                if (a.traceId != null && a.hasOwnProperty("traceId")) {
                  c.traceId = l.bytes === String ? Lt.base64.HS(a.traceId, 0, a.traceId.length) : l.bytes === Array ? Array.prototype.slice.call(a.traceId) : a.traceId;
                }
                if (a.asInt != null && a.hasOwnProperty("asInt")) {
                  if (typeof a.asInt === "number") {
                    c.asInt = l.longs === String ? String(a.asInt) : a.asInt;
                  } else {
                    c.asInt = l.longs === String ? Lt.Long.prototype.toString.call(a.asInt) : l.longs === Number ? new Lt.LongBits(a.asInt.low >>> 0, a.asInt.high >>> 0).toNumber() : a.asInt;
                  }
                  if (l.oneofs) {
                    c.value = "asInt";
                  }
                }
                if (a.filteredAttributes && a.filteredAttributes.length) {
                  c.filteredAttributes = [];
                  for (var d = 0; d < a.filteredAttributes.length; ++d) {
                    c.filteredAttributes[d] = At.opentelemetry.proto.common.v1.KeyValue.toObject(a.filteredAttributes[d], l);
                  }
                }
                return c;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (a) {
                if (a === undefined) {
                  a = "type.googleapis.com";
                }
                return a + "/opentelemetry.proto.metrics.v1.Exemplar";
              };
              return o;
            }();
            return r;
          }();
          return n;
        }();
        t.logs = function () {
          var n = {};
          n.v1 = function () {
            var r = {};
            r.LogsData = function () {
              function o(s) {
                if (this.resourceLogs = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.resourceLogs = Lt.emptyArray;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.resourceLogs != null && i.resourceLogs.length) {
                  for (var l = 0; l < i.resourceLogs.length; ++l) {
                    At.opentelemetry.proto.logs.v1.ResourceLogs.HS(i.resourceLogs[l], a.uint32(10).fork()).ldelim();
                  }
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.logs.v1.LogsData();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        if (!(u.resourceLogs && u.resourceLogs.length)) {
                          u.resourceLogs = [];
                        }
                        u.resourceLogs.push(At.opentelemetry.proto.logs.v1.ResourceLogs.oC(i, i.uint32()));
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.resourceLogs != null && i.hasOwnProperty("resourceLogs")) {
                  if (!Array.isArray(i.resourceLogs)) {
                    return "resourceLogs: array expected";
                  }
                  for (var a = 0; a < i.resourceLogs.length; ++a) {
                    var l = At.opentelemetry.proto.logs.v1.ResourceLogs.verify(i.resourceLogs[a]);
                    if (l) {
                      return "resourceLogs." + l;
                    }
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.logs.v1.LogsData) {
                  return i;
                }
                var a = new At.opentelemetry.proto.logs.v1.LogsData();
                if (i.resourceLogs) {
                  if (!Array.isArray(i.resourceLogs)) {
                    throw TypeError(".opentelemetry.proto.logs.v1.LogsData.resourceLogs: array expected");
                  }
                  a.resourceLogs = [];
                  for (var l = 0; l < i.resourceLogs.length; ++l) {
                    if (typeof i.resourceLogs[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.logs.v1.LogsData.resourceLogs: object expected");
                    }
                    a.resourceLogs[l] = At.opentelemetry.proto.logs.v1.ResourceLogs.fromObject(i.resourceLogs[l]);
                  }
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.resourceLogs = [];
                }
                if (i.resourceLogs && i.resourceLogs.length) {
                  l.resourceLogs = [];
                  for (var c = 0; c < i.resourceLogs.length; ++c) {
                    l.resourceLogs[c] = At.opentelemetry.proto.logs.v1.ResourceLogs.toObject(i.resourceLogs[c], a);
                  }
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.logs.v1.LogsData";
              };
              return o;
            }();
            r.ResourceLogs = function () {
              function o(s) {
                if (this.scopeLogs = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.resource = null;
              o.prototype.scopeLogs = Lt.emptyArray;
              o.prototype.schemaUrl = null;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.resource != null && Object.hasOwnProperty.call(i, "resource")) {
                  At.opentelemetry.proto.resource.v1.Resource.HS(i.resource, a.uint32(10).fork()).ldelim();
                }
                if (i.scopeLogs != null && i.scopeLogs.length) {
                  for (var l = 0; l < i.scopeLogs.length; ++l) {
                    At.opentelemetry.proto.logs.v1.ScopeLogs.HS(i.scopeLogs[l], a.uint32(18).fork()).ldelim();
                  }
                }
                if (i.schemaUrl != null && Object.hasOwnProperty.call(i, "schemaUrl")) {
                  a.uint32(26).string(i.schemaUrl);
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.logs.v1.ResourceLogs();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        u.resource = At.opentelemetry.proto.resource.v1.Resource.oC(i, i.uint32());
                        break;
                      }
                    case 2:
                      {
                        if (!(u.scopeLogs && u.scopeLogs.length)) {
                          u.scopeLogs = [];
                        }
                        u.scopeLogs.push(At.opentelemetry.proto.logs.v1.ScopeLogs.oC(i, i.uint32()));
                        break;
                      }
                    case 3:
                      {
                        u.schemaUrl = i.string();
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.resource != null && i.hasOwnProperty("resource")) {
                  var a = At.opentelemetry.proto.resource.v1.Resource.verify(i.resource);
                  if (a) {
                    return "resource." + a;
                  }
                }
                if (i.scopeLogs != null && i.hasOwnProperty("scopeLogs")) {
                  if (!Array.isArray(i.scopeLogs)) {
                    return "scopeLogs: array expected";
                  }
                  for (var l = 0; l < i.scopeLogs.length; ++l) {
                    var a = At.opentelemetry.proto.logs.v1.ScopeLogs.verify(i.scopeLogs[l]);
                    if (a) {
                      return "scopeLogs." + a;
                    }
                  }
                }
                if (i.schemaUrl != null && i.hasOwnProperty("schemaUrl")) {
                  if (!Lt.isString(i.schemaUrl)) {
                    return "schemaUrl: string expected";
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.logs.v1.ResourceLogs) {
                  return i;
                }
                var a = new At.opentelemetry.proto.logs.v1.ResourceLogs();
                if (i.resource != null) {
                  if (typeof i.resource !== "object") {
                    throw TypeError(".opentelemetry.proto.logs.v1.ResourceLogs.resource: object expected");
                  }
                  a.resource = At.opentelemetry.proto.resource.v1.Resource.fromObject(i.resource);
                }
                if (i.scopeLogs) {
                  if (!Array.isArray(i.scopeLogs)) {
                    throw TypeError(".opentelemetry.proto.logs.v1.ResourceLogs.scopeLogs: array expected");
                  }
                  a.scopeLogs = [];
                  for (var l = 0; l < i.scopeLogs.length; ++l) {
                    if (typeof i.scopeLogs[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.logs.v1.ResourceLogs.scopeLogs: object expected");
                    }
                    a.scopeLogs[l] = At.opentelemetry.proto.logs.v1.ScopeLogs.fromObject(i.scopeLogs[l]);
                  }
                }
                if (i.schemaUrl != null) {
                  a.schemaUrl = String(i.schemaUrl);
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.scopeLogs = [];
                }
                if (a.defaults) {
                  l.resource = null;
                  l.schemaUrl = "";
                }
                if (i.resource != null && i.hasOwnProperty("resource")) {
                  l.resource = At.opentelemetry.proto.resource.v1.Resource.toObject(i.resource, a);
                }
                if (i.scopeLogs && i.scopeLogs.length) {
                  l.scopeLogs = [];
                  for (var c = 0; c < i.scopeLogs.length; ++c) {
                    l.scopeLogs[c] = At.opentelemetry.proto.logs.v1.ScopeLogs.toObject(i.scopeLogs[c], a);
                  }
                }
                if (i.schemaUrl != null && i.hasOwnProperty("schemaUrl")) {
                  l.schemaUrl = i.schemaUrl;
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.logs.v1.ResourceLogs";
              };
              return o;
            }();
            r.ScopeLogs = function () {
              function o(s) {
                if (this.logRecords = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.scope = null;
              o.prototype.logRecords = Lt.emptyArray;
              o.prototype.schemaUrl = null;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.scope != null && Object.hasOwnProperty.call(i, "scope")) {
                  At.opentelemetry.proto.common.v1.InstrumentationScope.HS(i.scope, a.uint32(10).fork()).ldelim();
                }
                if (i.logRecords != null && i.logRecords.length) {
                  for (var l = 0; l < i.logRecords.length; ++l) {
                    At.opentelemetry.proto.logs.v1.LogRecord.HS(i.logRecords[l], a.uint32(18).fork()).ldelim();
                  }
                }
                if (i.schemaUrl != null && Object.hasOwnProperty.call(i, "schemaUrl")) {
                  a.uint32(26).string(i.schemaUrl);
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.logs.v1.ScopeLogs();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        u.scope = At.opentelemetry.proto.common.v1.InstrumentationScope.oC(i, i.uint32());
                        break;
                      }
                    case 2:
                      {
                        if (!(u.logRecords && u.logRecords.length)) {
                          u.logRecords = [];
                        }
                        u.logRecords.push(At.opentelemetry.proto.logs.v1.LogRecord.oC(i, i.uint32()));
                        break;
                      }
                    case 3:
                      {
                        u.schemaUrl = i.string();
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.scope != null && i.hasOwnProperty("scope")) {
                  var a = At.opentelemetry.proto.common.v1.InstrumentationScope.verify(i.scope);
                  if (a) {
                    return "scope." + a;
                  }
                }
                if (i.logRecords != null && i.hasOwnProperty("logRecords")) {
                  if (!Array.isArray(i.logRecords)) {
                    return "logRecords: array expected";
                  }
                  for (var l = 0; l < i.logRecords.length; ++l) {
                    var a = At.opentelemetry.proto.logs.v1.LogRecord.verify(i.logRecords[l]);
                    if (a) {
                      return "logRecords." + a;
                    }
                  }
                }
                if (i.schemaUrl != null && i.hasOwnProperty("schemaUrl")) {
                  if (!Lt.isString(i.schemaUrl)) {
                    return "schemaUrl: string expected";
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.logs.v1.ScopeLogs) {
                  return i;
                }
                var a = new At.opentelemetry.proto.logs.v1.ScopeLogs();
                if (i.scope != null) {
                  if (typeof i.scope !== "object") {
                    throw TypeError(".opentelemetry.proto.logs.v1.ScopeLogs.scope: object expected");
                  }
                  a.scope = At.opentelemetry.proto.common.v1.InstrumentationScope.fromObject(i.scope);
                }
                if (i.logRecords) {
                  if (!Array.isArray(i.logRecords)) {
                    throw TypeError(".opentelemetry.proto.logs.v1.ScopeLogs.logRecords: array expected");
                  }
                  a.logRecords = [];
                  for (var l = 0; l < i.logRecords.length; ++l) {
                    if (typeof i.logRecords[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.logs.v1.ScopeLogs.logRecords: object expected");
                    }
                    a.logRecords[l] = At.opentelemetry.proto.logs.v1.LogRecord.fromObject(i.logRecords[l]);
                  }
                }
                if (i.schemaUrl != null) {
                  a.schemaUrl = String(i.schemaUrl);
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.logRecords = [];
                }
                if (a.defaults) {
                  l.scope = null;
                  l.schemaUrl = "";
                }
                if (i.scope != null && i.hasOwnProperty("scope")) {
                  l.scope = At.opentelemetry.proto.common.v1.InstrumentationScope.toObject(i.scope, a);
                }
                if (i.logRecords && i.logRecords.length) {
                  l.logRecords = [];
                  for (var c = 0; c < i.logRecords.length; ++c) {
                    l.logRecords[c] = At.opentelemetry.proto.logs.v1.LogRecord.toObject(i.logRecords[c], a);
                  }
                }
                if (i.schemaUrl != null && i.hasOwnProperty("schemaUrl")) {
                  l.schemaUrl = i.schemaUrl;
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.logs.v1.ScopeLogs";
              };
              return o;
            }();
            r.SeverityNumber = function () {
              var o = {};
              var s = Object.create(o);
              s[o[0] = "SEVERITY_NUMBER_UNSPECIFIED"] = 0;
              s[o[1] = "SEVERITY_NUMBER_TRACE"] = 1;
              s[o[2] = "SEVERITY_NUMBER_TRACE2"] = 2;
              s[o[3] = "SEVERITY_NUMBER_TRACE3"] = 3;
              s[o[4] = "SEVERITY_NUMBER_TRACE4"] = 4;
              s[o[5] = "SEVERITY_NUMBER_DEBUG"] = 5;
              s[o[6] = "SEVERITY_NUMBER_DEBUG2"] = 6;
              s[o[7] = "SEVERITY_NUMBER_DEBUG3"] = 7;
              s[o[8] = "SEVERITY_NUMBER_DEBUG4"] = 8;
              s[o[9] = "SEVERITY_NUMBER_INFO"] = 9;
              s[o[10] = "SEVERITY_NUMBER_INFO2"] = 10;
              s[o[11] = "SEVERITY_NUMBER_INFO3"] = 11;
              s[o[12] = "SEVERITY_NUMBER_INFO4"] = 12;
              s[o[13] = "SEVERITY_NUMBER_WARN"] = 13;
              s[o[14] = "SEVERITY_NUMBER_WARN2"] = 14;
              s[o[15] = "SEVERITY_NUMBER_WARN3"] = 15;
              s[o[16] = "SEVERITY_NUMBER_WARN4"] = 16;
              s[o[17] = "SEVERITY_NUMBER_ERROR"] = 17;
              s[o[18] = "SEVERITY_NUMBER_ERROR2"] = 18;
              s[o[19] = "SEVERITY_NUMBER_ERROR3"] = 19;
              s[o[20] = "SEVERITY_NUMBER_ERROR4"] = 20;
              s[o[21] = "SEVERITY_NUMBER_FATAL"] = 21;
              s[o[22] = "SEVERITY_NUMBER_FATAL2"] = 22;
              s[o[23] = "SEVERITY_NUMBER_FATAL3"] = 23;
              s[o[24] = "SEVERITY_NUMBER_FATAL4"] = 24;
              return s;
            }();
            r.LogRecordFlags = function () {
              var o = {};
              var s = Object.create(o);
              s[o[0] = "LOG_RECORD_FLAGS_DO_NOT_USE"] = 0;
              s[o[255] = "LOG_RECORD_FLAGS_TRACE_FLAGS_MASK"] = 255;
              return s;
            }();
            r.LogRecord = function () {
              function o(s) {
                if (this.attributes = [], s) {
                  for (var i = Object.keys(s), a = 0; a < i.length; ++a) {
                    if (s[i[a]] != null) {
                      this[i[a]] = s[i[a]];
                    }
                  }
                }
              }
              o.prototype.timeUnixNano = null;
              o.prototype.observedTimeUnixNano = null;
              o.prototype.severityNumber = null;
              o.prototype.severityText = null;
              o.prototype.body = null;
              o.prototype.attributes = Lt.emptyArray;
              o.prototype.droppedAttributesCount = null;
              o.prototype.flags = null;
              o.prototype.traceId = null;
              o.prototype.spanId = null;
              o.prototype.eventName = null;
              o.create = function (i) {
                return new o(i);
              };
              o.HS = function (i, a) {
                if (!a) {
                  a = Im.create();
                }
                if (i.timeUnixNano != null && Object.hasOwnProperty.call(i, "timeUnixNano")) {
                  a.uint32(9).fixed64(i.timeUnixNano);
                }
                if (i.severityNumber != null && Object.hasOwnProperty.call(i, "severityNumber")) {
                  a.uint32(16).int32(i.severityNumber);
                }
                if (i.severityText != null && Object.hasOwnProperty.call(i, "severityText")) {
                  a.uint32(26).string(i.severityText);
                }
                if (i.body != null && Object.hasOwnProperty.call(i, "body")) {
                  At.opentelemetry.proto.common.v1.AnyValue.HS(i.body, a.uint32(42).fork()).ldelim();
                }
                if (i.attributes != null && i.attributes.length) {
                  for (var l = 0; l < i.attributes.length; ++l) {
                    At.opentelemetry.proto.common.v1.KeyValue.HS(i.attributes[l], a.uint32(50).fork()).ldelim();
                  }
                }
                if (i.droppedAttributesCount != null && Object.hasOwnProperty.call(i, "droppedAttributesCount")) {
                  a.uint32(56).uint32(i.droppedAttributesCount);
                }
                if (i.flags != null && Object.hasOwnProperty.call(i, "flags")) {
                  a.uint32(69).fixed32(i.flags);
                }
                if (i.traceId != null && Object.hasOwnProperty.call(i, "traceId")) {
                  a.uint32(74).bytes(i.traceId);
                }
                if (i.spanId != null && Object.hasOwnProperty.call(i, "spanId")) {
                  a.uint32(82).bytes(i.spanId);
                }
                if (i.observedTimeUnixNano != null && Object.hasOwnProperty.call(i, "observedTimeUnixNano")) {
                  a.uint32(89).fixed64(i.observedTimeUnixNano);
                }
                if (i.eventName != null && Object.hasOwnProperty.call(i, "eventName")) {
                  a.uint32(98).string(i.eventName);
                }
                return a;
              };
              o.encodeDelimited = function (i, a) {
                return this.HS(i, a).ldelim();
              };
              o.oC = function (i, a, l) {
                if (!(i instanceof Jr)) {
                  i = Jr.create(i);
                }
                var c = a === undefined ? i.len : i.pos + a;
                var u = new At.opentelemetry.proto.logs.v1.LogRecord();
                while (i.pos < c) {
                  var d = i.uint32();
                  if (d === l) {
                    break;
                  }
                  switch (d >>> 3) {
                    case 1:
                      {
                        u.timeUnixNano = i.fixed64();
                        break;
                      }
                    case 11:
                      {
                        u.observedTimeUnixNano = i.fixed64();
                        break;
                      }
                    case 2:
                      {
                        u.severityNumber = i.int32();
                        break;
                      }
                    case 3:
                      {
                        u.severityText = i.string();
                        break;
                      }
                    case 5:
                      {
                        u.body = At.opentelemetry.proto.common.v1.AnyValue.oC(i, i.uint32());
                        break;
                      }
                    case 6:
                      {
                        if (!(u.attributes && u.attributes.length)) {
                          u.attributes = [];
                        }
                        u.attributes.push(At.opentelemetry.proto.common.v1.KeyValue.oC(i, i.uint32()));
                        break;
                      }
                    case 7:
                      {
                        u.droppedAttributesCount = i.uint32();
                        break;
                      }
                    case 8:
                      {
                        u.flags = i.fixed32();
                        break;
                      }
                    case 9:
                      {
                        u.traceId = i.bytes();
                        break;
                      }
                    case 10:
                      {
                        u.spanId = i.bytes();
                        break;
                      }
                    case 12:
                      {
                        u.eventName = i.string();
                        break;
                      }
                    default:
                      i.skipType(d & 7);
                      break;
                  }
                }
                return u;
              };
              o.decodeDelimited = function (i) {
                if (!(i instanceof Jr)) {
                  i = new Jr(i);
                }
                return this.oC(i, i.uint32());
              };
              o.verify = function (i) {
                if (typeof i !== "object" || i === null) {
                  return "object expected";
                }
                if (i.timeUnixNano != null && i.hasOwnProperty("timeUnixNano")) {
                  if (!Lt.isInteger(i.timeUnixNano) && !(i.timeUnixNano && Lt.isInteger(i.timeUnixNano.low) && Lt.isInteger(i.timeUnixNano.high))) {
                    return "timeUnixNano: integer|Long expected";
                  }
                }
                if (i.observedTimeUnixNano != null && i.hasOwnProperty("observedTimeUnixNano")) {
                  if (!Lt.isInteger(i.observedTimeUnixNano) && !(i.observedTimeUnixNano && Lt.isInteger(i.observedTimeUnixNano.low) && Lt.isInteger(i.observedTimeUnixNano.high))) {
                    return "observedTimeUnixNano: integer|Long expected";
                  }
                }
                if (i.severityNumber != null && i.hasOwnProperty("severityNumber")) {
                  switch (i.severityNumber) {
                    default:
                      return "severityNumber: enum value expected";
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                      break;
                  }
                }
                if (i.severityText != null && i.hasOwnProperty("severityText")) {
                  if (!Lt.isString(i.severityText)) {
                    return "severityText: string expected";
                  }
                }
                if (i.body != null && i.hasOwnProperty("body")) {
                  var a = At.opentelemetry.proto.common.v1.AnyValue.verify(i.body);
                  if (a) {
                    return "body." + a;
                  }
                }
                if (i.attributes != null && i.hasOwnProperty("attributes")) {
                  if (!Array.isArray(i.attributes)) {
                    return "attributes: array expected";
                  }
                  for (var l = 0; l < i.attributes.length; ++l) {
                    var a = At.opentelemetry.proto.common.v1.KeyValue.verify(i.attributes[l]);
                    if (a) {
                      return "attributes." + a;
                    }
                  }
                }
                if (i.droppedAttributesCount != null && i.hasOwnProperty("droppedAttributesCount")) {
                  if (!Lt.isInteger(i.droppedAttributesCount)) {
                    return "droppedAttributesCount: integer expected";
                  }
                }
                if (i.flags != null && i.hasOwnProperty("flags")) {
                  if (!Lt.isInteger(i.flags)) {
                    return "flags: integer expected";
                  }
                }
                if (i.traceId != null && i.hasOwnProperty("traceId")) {
                  if (!(i.traceId && typeof i.traceId.length === "number" || Lt.isString(i.traceId))) {
                    return "traceId: buffer expected";
                  }
                }
                if (i.spanId != null && i.hasOwnProperty("spanId")) {
                  if (!(i.spanId && typeof i.spanId.length === "number" || Lt.isString(i.spanId))) {
                    return "spanId: buffer expected";
                  }
                }
                if (i.eventName != null && i.hasOwnProperty("eventName")) {
                  if (!Lt.isString(i.eventName)) {
                    return "eventName: string expected";
                  }
                }
                return null;
              };
              o.fromObject = function (i) {
                if (i instanceof At.opentelemetry.proto.logs.v1.LogRecord) {
                  return i;
                }
                var a = new At.opentelemetry.proto.logs.v1.LogRecord();
                if (i.timeUnixNano != null) {
                  if (Lt.Long) {
                    (a.timeUnixNano = Lt.Long.fromValue(i.timeUnixNano)).unsigned = false;
                  } else if (typeof i.timeUnixNano === "string") {
                    a.timeUnixNano = parseInt(i.timeUnixNano, 10);
                  } else if (typeof i.timeUnixNano === "number") {
                    a.timeUnixNano = i.timeUnixNano;
                  } else if (typeof i.timeUnixNano === "object") {
                    a.timeUnixNano = new Lt.LongBits(i.timeUnixNano.low >>> 0, i.timeUnixNano.high >>> 0).toNumber();
                  }
                }
                if (i.observedTimeUnixNano != null) {
                  if (Lt.Long) {
                    (a.observedTimeUnixNano = Lt.Long.fromValue(i.observedTimeUnixNano)).unsigned = false;
                  } else if (typeof i.observedTimeUnixNano === "string") {
                    a.observedTimeUnixNano = parseInt(i.observedTimeUnixNano, 10);
                  } else if (typeof i.observedTimeUnixNano === "number") {
                    a.observedTimeUnixNano = i.observedTimeUnixNano;
                  } else if (typeof i.observedTimeUnixNano === "object") {
                    a.observedTimeUnixNano = new Lt.LongBits(i.observedTimeUnixNano.low >>> 0, i.observedTimeUnixNano.high >>> 0).toNumber();
                  }
                }
                switch (i.severityNumber) {
                  default:
                    if (typeof i.severityNumber === "number") {
                      a.severityNumber = i.severityNumber;
                      break;
                    }
                    break;
                  case "SEVERITY_NUMBER_UNSPECIFIED":
                  case 0:
                    a.severityNumber = 0;
                    break;
                  case "SEVERITY_NUMBER_TRACE":
                  case 1:
                    a.severityNumber = 1;
                    break;
                  case "SEVERITY_NUMBER_TRACE2":
                  case 2:
                    a.severityNumber = 2;
                    break;
                  case "SEVERITY_NUMBER_TRACE3":
                  case 3:
                    a.severityNumber = 3;
                    break;
                  case "SEVERITY_NUMBER_TRACE4":
                  case 4:
                    a.severityNumber = 4;
                    break;
                  case "SEVERITY_NUMBER_DEBUG":
                  case 5:
                    a.severityNumber = 5;
                    break;
                  case "SEVERITY_NUMBER_DEBUG2":
                  case 6:
                    a.severityNumber = 6;
                    break;
                  case "SEVERITY_NUMBER_DEBUG3":
                  case 7:
                    a.severityNumber = 7;
                    break;
                  case "SEVERITY_NUMBER_DEBUG4":
                  case 8:
                    a.severityNumber = 8;
                    break;
                  case "SEVERITY_NUMBER_INFO":
                  case 9:
                    a.severityNumber = 9;
                    break;
                  case "SEVERITY_NUMBER_INFO2":
                  case 10:
                    a.severityNumber = 10;
                    break;
                  case "SEVERITY_NUMBER_INFO3":
                  case 11:
                    a.severityNumber = 11;
                    break;
                  case "SEVERITY_NUMBER_INFO4":
                  case 12:
                    a.severityNumber = 12;
                    break;
                  case "SEVERITY_NUMBER_WARN":
                  case 13:
                    a.severityNumber = 13;
                    break;
                  case "SEVERITY_NUMBER_WARN2":
                  case 14:
                    a.severityNumber = 14;
                    break;
                  case "SEVERITY_NUMBER_WARN3":
                  case 15:
                    a.severityNumber = 15;
                    break;
                  case "SEVERITY_NUMBER_WARN4":
                  case 16:
                    a.severityNumber = 16;
                    break;
                  case "SEVERITY_NUMBER_ERROR":
                  case 17:
                    a.severityNumber = 17;
                    break;
                  case "SEVERITY_NUMBER_ERROR2":
                  case 18:
                    a.severityNumber = 18;
                    break;
                  case "SEVERITY_NUMBER_ERROR3":
                  case 19:
                    a.severityNumber = 19;
                    break;
                  case "SEVERITY_NUMBER_ERROR4":
                  case 20:
                    a.severityNumber = 20;
                    break;
                  case "SEVERITY_NUMBER_FATAL":
                  case 21:
                    a.severityNumber = 21;
                    break;
                  case "SEVERITY_NUMBER_FATAL2":
                  case 22:
                    a.severityNumber = 22;
                    break;
                  case "SEVERITY_NUMBER_FATAL3":
                  case 23:
                    a.severityNumber = 23;
                    break;
                  case "SEVERITY_NUMBER_FATAL4":
                  case 24:
                    a.severityNumber = 24;
                    break;
                }
                if (i.severityText != null) {
                  a.severityText = String(i.severityText);
                }
                if (i.body != null) {
                  if (typeof i.body !== "object") {
                    throw TypeError(".opentelemetry.proto.logs.v1.LogRecord.body: object expected");
                  }
                  a.body = At.opentelemetry.proto.common.v1.AnyValue.fromObject(i.body);
                }
                if (i.attributes) {
                  if (!Array.isArray(i.attributes)) {
                    throw TypeError(".opentelemetry.proto.logs.v1.LogRecord.attributes: array expected");
                  }
                  a.attributes = [];
                  for (var l = 0; l < i.attributes.length; ++l) {
                    if (typeof i.attributes[l] !== "object") {
                      throw TypeError(".opentelemetry.proto.logs.v1.LogRecord.attributes: object expected");
                    }
                    a.attributes[l] = At.opentelemetry.proto.common.v1.KeyValue.fromObject(i.attributes[l]);
                  }
                }
                if (i.droppedAttributesCount != null) {
                  a.droppedAttributesCount = i.droppedAttributesCount >>> 0;
                }
                if (i.flags != null) {
                  a.flags = i.flags >>> 0;
                }
                if (i.traceId != null) {
                  if (typeof i.traceId === "string") {
                    Lt.base64.oC(i.traceId, a.traceId = Lt.newBuffer(Lt.base64.length(i.traceId)), 0);
                  } else if (i.traceId.length >= 0) {
                    a.traceId = i.traceId;
                  }
                }
                if (i.spanId != null) {
                  if (typeof i.spanId === "string") {
                    Lt.base64.oC(i.spanId, a.spanId = Lt.newBuffer(Lt.base64.length(i.spanId)), 0);
                  } else if (i.spanId.length >= 0) {
                    a.spanId = i.spanId;
                  }
                }
                if (i.eventName != null) {
                  a.eventName = String(i.eventName);
                }
                return a;
              };
              o.toObject = function (i, a) {
                if (!a) {
                  a = {};
                }
                var l = {};
                if (a.arrays || a.defaults) {
                  l.attributes = [];
                }
                if (a.defaults) {
                  if (Lt.Long) {
                    var c = new Lt.Long(0, 0, false);
                    l.timeUnixNano = a.longs === String ? c.toString() : a.longs === Number ? c.toNumber() : c;
                  } else {
                    l.timeUnixNano = a.longs === String ? "0" : 0;
                  }
                  if (l.severityNumber = a.enums === String ? "SEVERITY_NUMBER_UNSPECIFIED" : 0, l.severityText = "", l.body = null, l.droppedAttributesCount = 0, l.flags = 0, a.bytes === String) {
                    l.traceId = "";
                  } else if (l.traceId = [], a.bytes !== Array) {
                    l.traceId = Lt.newBuffer(l.traceId);
                  }
                  if (a.bytes === String) {
                    l.spanId = "";
                  } else if (l.spanId = [], a.bytes !== Array) {
                    l.spanId = Lt.newBuffer(l.spanId);
                  }
                  if (Lt.Long) {
                    var c = new Lt.Long(0, 0, false);
                    l.observedTimeUnixNano = a.longs === String ? c.toString() : a.longs === Number ? c.toNumber() : c;
                  } else {
                    l.observedTimeUnixNano = a.longs === String ? "0" : 0;
                  }
                  l.eventName = "";
                }
                if (i.timeUnixNano != null && i.hasOwnProperty("timeUnixNano")) {
                  if (typeof i.timeUnixNano === "number") {
                    l.timeUnixNano = a.longs === String ? String(i.timeUnixNano) : i.timeUnixNano;
                  } else {
                    l.timeUnixNano = a.longs === String ? Lt.Long.prototype.toString.call(i.timeUnixNano) : a.longs === Number ? new Lt.LongBits(i.timeUnixNano.low >>> 0, i.timeUnixNano.high >>> 0).toNumber() : i.timeUnixNano;
                  }
                }
                if (i.severityNumber != null && i.hasOwnProperty("severityNumber")) {
                  l.severityNumber = a.enums === String ? At.opentelemetry.proto.logs.v1.SeverityNumber[i.severityNumber] === undefined ? i.severityNumber : At.opentelemetry.proto.logs.v1.SeverityNumber[i.severityNumber] : i.severityNumber;
                }
                if (i.severityText != null && i.hasOwnProperty("severityText")) {
                  l.severityText = i.severityText;
                }
                if (i.body != null && i.hasOwnProperty("body")) {
                  l.body = At.opentelemetry.proto.common.v1.AnyValue.toObject(i.body, a);
                }
                if (i.attributes && i.attributes.length) {
                  l.attributes = [];
                  for (var u = 0; u < i.attributes.length; ++u) {
                    l.attributes[u] = At.opentelemetry.proto.common.v1.KeyValue.toObject(i.attributes[u], a);
                  }
                }
                if (i.droppedAttributesCount != null && i.hasOwnProperty("droppedAttributesCount")) {
                  l.droppedAttributesCount = i.droppedAttributesCount;
                }
                if (i.flags != null && i.hasOwnProperty("flags")) {
                  l.flags = i.flags;
                }
                if (i.traceId != null && i.hasOwnProperty("traceId")) {
                  l.traceId = a.bytes === String ? Lt.base64.HS(i.traceId, 0, i.traceId.length) : a.bytes === Array ? Array.prototype.slice.call(i.traceId) : i.traceId;
                }
                if (i.spanId != null && i.hasOwnProperty("spanId")) {
                  l.spanId = a.bytes === String ? Lt.base64.HS(i.spanId, 0, i.spanId.length) : a.bytes === Array ? Array.prototype.slice.call(i.spanId) : i.spanId;
                }
                if (i.observedTimeUnixNano != null && i.hasOwnProperty("observedTimeUnixNano")) {
                  if (typeof i.observedTimeUnixNano === "number") {
                    l.observedTimeUnixNano = a.longs === String ? String(i.observedTimeUnixNano) : i.observedTimeUnixNano;
                  } else {
                    l.observedTimeUnixNano = a.longs === String ? Lt.Long.prototype.toString.call(i.observedTimeUnixNano) : a.longs === Number ? new Lt.LongBits(i.observedTimeUnixNano.low >>> 0, i.observedTimeUnixNano.high >>> 0).toNumber() : i.observedTimeUnixNano;
                  }
                }
                if (i.eventName != null && i.hasOwnProperty("eventName")) {
                  l.eventName = i.eventName;
                }
                return l;
              };
              o.prototype.toJSON = function () {
                return this.constructor.toObject(this, rd.util.toJSONOptions);
              };
              o.getTypeUrl = function (i) {
                if (i === undefined) {
                  i = "type.googleapis.com";
                }
                return i + "/opentelemetry.proto.logs.v1.LogRecord";
              };
              return o;
            }();
            return r;
          }();
          return n;
        }();
        return t;
      }();
      return e;
    }();
    pJa.exports = At;
  });
  var fJa = __commonJS(R8n => {
    Object.defineProperty(R8n, "__esModule", {
      value: true
    });
    R8n.hexToBinary = undefined;
    function mJa(e) {
      if (e >= 48 && e <= 57) {
        return e - 48;
      }
      if (e >= 97 && e <= 102) {
        return e - 87;
      }
      return e - 55;
    }
    function g7p(e) {
      let t = new Uint8Array(e.length / 2);
      let n = 0;
      for (let r = 0; r < e.length; r += 2) {
        let o = mJa(e.charCodeAt(r));
        let s = mJa(e.charCodeAt(r + 1));
        t[n++] = o << 4 | s;
      }
      return t;
    }
    R8n.hexToBinary = g7p;
  });
  var x8n = __commonJS(DQ => {
    Object.defineProperty(DQ, "__esModule", {
      value: true
    });
    DQ.getOtlpEncoder = DQ.encodeAsString = DQ.encodeAsLongBits = DQ.toLongBits = DQ.hrTimeToNanos = undefined;
    var y7p = Gg();
    var ORo = fJa();
    function DRo(e) {
      let t = BigInt(1e9);
      return BigInt(Math.trunc(e[0])) * t + BigInt(Math.trunc(e[1]));
    }
    DQ.hrTimeToNanos = DRo;
    function gJa(e) {
      let t = Number(BigInt.asUintN(32, e));
      let n = Number(BigInt.asUintN(32, e >> BigInt(32)));
      return {
        low: t,
        high: n
      };
    }
    DQ.toLongBits = gJa;
    function MRo(e) {
      let t = DRo(e);
      return gJa(t);
    }
    DQ.encodeAsLongBits = MRo;
    function yJa(e) {
      return DRo(e).toString();
    }
    DQ.encodeAsString = yJa;
    var _7p = typeof BigInt < "u" ? yJa : y7p.hrTimeToNanoseconds;
    function hJa(e) {
      return e;
    }
    function _Ja(e) {
      if (e === undefined) {
        return;
      }
      return (0, ORo.hexToBinary)(e);
    }
    var b7p = {
      encodeHrTime: MRo,
      encodeSpanContext: ORo.hexToBinary,
      encodeOptionalSpanContext: _Ja
    };
    function S7p(e) {
      if (e === undefined) {
        return b7p;
      }
      let t = e.useLongBits ?? true;
      let n = e.useHex ?? false;
      return {
        encodeHrTime: t ? MRo : _7p,
        encodeSpanContext: n ? hJa : ORo.hexToBinary,
        encodeOptionalSpanContext: n ? hJa : _Ja
      };
    }
    DQ.getOtlpEncoder = S7p;
  });
  var k8n = __commonJS(MQ => {
    Object.defineProperty(MQ, "__esModule", {
      value: true
    });
    MQ.toAnyValue = MQ.toKeyValue = MQ.toAttributes = MQ.createInstrumentationScope = MQ.createResource = undefined;
    function T7p(e) {
      let t = {
        attributes: bJa(e.attributes),
        droppedAttributesCount: 0
      };
      let n = e.schemaUrl;
      if (n && n !== "") {
        t.schemaUrl = n;
      }
      return t;
    }
    MQ.createResource = T7p;
    function E7p(e) {
      return {
        name: e.name,
        version: e.version
      };
    }
    MQ.createInstrumentationScope = E7p;
    function bJa(e) {
      return Object.keys(e).map(t => NRo(t, e[t]));
    }
    MQ.toAttributes = bJa;
    function NRo(e, t) {
      return {
        key: e,
        value: LRo(t)
      };
    }
    MQ.toKeyValue = NRo;
    function LRo(e) {
      let t = typeof e;
      if (t === "string") {
        return {
          stringValue: e
        };
      }
      if (t === "number") {
        if (!Number.isInteger(e)) {
          return {
            doubleValue: e
          };
        }
        return {
          intValue: e
        };
      }
      if (t === "boolean") {
        return {
          boolValue: e
        };
      }
      if (e instanceof Uint8Array) {
        return {
          bytesValue: e
        };
      }
      if (Array.isArray(e)) {
        return {
          arrayValue: {
            values: e.map(LRo)
          }
        };
      }
      if (t === "object" && e != null) {
        return {
          kvlistValue: {
            values: Object.entries(e).map(([n, r]) => NRo(n, r))
          }
        };
      }
      return {};
    }
    MQ.toAnyValue = LRo;
  });
  var FRo = __commonJS(uyt => {
    Object.defineProperty(uyt, "__esModule", {
      value: true
    });
    uyt.toLogAttributes = uyt.createExportLogsServiceRequest = undefined;
    var v7p = x8n();
    var A8n = k8n();
    function w7p(e, t) {
      let n = (0, v7p.getOtlpEncoder)(t);
      return {
        resourceLogs: R7p(e, n)
      };
    }
    uyt.createExportLogsServiceRequest = w7p;
    function C7p(e) {
      let t = new Map();
      for (let n of e) {
        let {
          resource: r,
          instrumentationScope: {
            name: o,
            version: s = "",
            schemaUrl: i = ""
          }
        } = n;
        let a = t.get(r);
        if (!a) {
          a = new Map();
          t.set(r, a);
        }
        let l = `${o}@${s}:${i}`;
        let c = a.get(l);
        if (!c) {
          c = [];
          a.set(l, c);
        }
        c.push(n);
      }
      return t;
    }
    function R7p(e, t) {
      let n = C7p(e);
      return Array.from(n, ([r, o]) => {
        let s = (0, A8n.createResource)(r);
        return {
          resource: s,
          scopeLogs: Array.from(o, ([, i]) => ({
            scope: (0, A8n.createInstrumentationScope)(i[0].instrumentationScope),
            logRecords: i.map(a => x7p(a, t)),
            schemaUrl: i[0].instrumentationScope.schemaUrl
          })),
          schemaUrl: s.schemaUrl
        };
      });
    }
    function x7p(e, t) {
      return {
        timeUnixNano: t.encodeHrTime(e.hrTime),
        observedTimeUnixNano: t.encodeHrTime(e.hrTimeObserved),
        severityNumber: e.severityNumber,
        severityText: e.severityText,
        body: (0, A8n.toAnyValue)(e.body),
        eventName: e.eventName,
        attributes: SJa(e.attributes),
        droppedAttributesCount: e.droppedAttributesCount,
        flags: e.spanContext?.traceFlags,
        traceId: t.encodeOptionalSpanContext(e.spanContext?.traceId),
        spanId: t.encodeOptionalSpanContext(e.spanContext?.spanId)
      };
    }
    function SJa(e) {
      return Object.keys(e).map(t => (0, A8n.toKeyValue)(t, e[t]));
    }
    uyt.toLogAttributes = SJa;
  });
  var EJa = __commonJS(I8n => {
    Object.defineProperty(I8n, "__esModule", {
      value: true
    });
    I8n.ProtobufLogsSerializer = undefined;
    var TJa = C8n();
    var A7p = FRo();
    var I7p = TJa.opentelemetry.proto.collector.logs.v1.ExportLogsServiceResponse;
    var P7p = TJa.opentelemetry.proto.collector.logs.v1.ExportLogsServiceRequest;
    I8n.ProtobufLogsSerializer = {
      serializeRequest: e => {
        let t = (0, A7p.createExportLogsServiceRequest)(e);
        return P7p.HS(t).finish();
      },
      deserializeResponse: e => I7p.oC(e)
    };
  });
  var vJa = __commonJS(P8n => {
    Object.defineProperty(P8n, "__esModule", {
      value: true
    });
    P8n.ProtobufLogsSerializer = undefined;
    var O7p = EJa();
    Object.defineProperty(P8n, "ProtobufLogsSerializer", {
      enumerable: true,
      get: function () {
        return O7p.ProtobufLogsSerializer;
      }
    });
  });
  var wJa = __commonJS(B8t => {
    Object.defineProperty(B8t, "__esModule", {
      value: true
    });
    B8t.EAggregationTemporality = undefined;
    var D7p;
    (function (e) {
      e[e.AGGREGATION_TEMPORALITY_UNSPECIFIED = 0] = "AGGREGATION_TEMPORALITY_UNSPECIFIED";
      e[e.AGGREGATION_TEMPORALITY_DELTA = 1] = "AGGREGATION_TEMPORALITY_DELTA";
      e[e.AGGREGATION_TEMPORALITY_CUMULATIVE = 2] = "AGGREGATION_TEMPORALITY_CUMULATIVE";
    })(D7p = B8t.EAggregationTemporality || (B8t.EAggregationTemporality = {}));
  });
  var URo = __commonJS(Vpe => {
    Object.defineProperty(Vpe, "__esModule", {
      value: true
    });
    Vpe.createExportMetricsServiceRequest = Vpe.toMetric = Vpe.toScopeMetrics = Vpe.toResourceMetrics = undefined;
    var CJa = Ji();
    var dyt = A8t();
    var RJa = wJa();
    var M7p = x8n();
    var $8t = k8n();
    function kJa(e, t) {
      let n = (0, M7p.getOtlpEncoder)(t);
      let r = (0, $8t.createResource)(e.resource);
      return {
        resource: r,
        schemaUrl: r.schemaUrl,
        scopeMetrics: AJa(e.scopeMetrics, n)
      };
    }
    Vpe.toResourceMetrics = kJa;
    function AJa(e, t) {
      return Array.from(e.map(n => ({
        scope: (0, $8t.createInstrumentationScope)(n.scope),
        metrics: n.metrics.map(r => IJa(r, t)),
        schemaUrl: n.scope.schemaUrl
      })));
    }
    Vpe.toScopeMetrics = AJa;
    function IJa(e, t) {
      let n = {
        name: e.descriptor.name,
        description: e.descriptor.description,
        unit: e.descriptor.unit
      };
      let r = U7p(e.aggregationTemporality);
      switch (e.dataPointType) {
        case dyt.DataPointType.SUM:
          n.sum = {
            aggregationTemporality: r,
            isMonotonic: e.isMonotonic,
            dataPoints: xJa(e, t)
          };
          break;
        case dyt.DataPointType.GAUGE:
          n.gauge = {
            dataPoints: xJa(e, t)
          };
          break;
        case dyt.DataPointType.HISTOGRAM:
          n.histogram = {
            aggregationTemporality: r,
            dataPoints: L7p(e, t)
          };
          break;
        case dyt.DataPointType.EXPONENTIAL_HISTOGRAM:
          n.exponentialHistogram = {
            aggregationTemporality: r,
            dataPoints: F7p(e, t)
          };
          break;
      }
      return n;
    }
    Vpe.toMetric = IJa;
    function N7p(e, t, n) {
      let r = {
        attributes: (0, $8t.toAttributes)(e.attributes),
        startTimeUnixNano: n.encodeHrTime(e.startTime),
        timeUnixNano: n.encodeHrTime(e.endTime)
      };
      switch (t) {
        case CJa.ValueType.INT:
          r.asInt = e.value;
          break;
        case CJa.ValueType.DOUBLE:
          r.asDouble = e.value;
          break;
      }
      return r;
    }
    function xJa(e, t) {
      return e.dataPoints.map(n => N7p(n, e.descriptor.valueType, t));
    }
    function L7p(e, t) {
      return e.dataPoints.map(n => {
        let r = n.value;
        return {
          attributes: (0, $8t.toAttributes)(n.attributes),
          bucketCounts: r.buckets.counts,
          explicitBounds: r.buckets.boundaries,
          count: r.count,
          sum: r.sum,
          min: r.min,
          max: r.max,
          startTimeUnixNano: t.encodeHrTime(n.startTime),
          timeUnixNano: t.encodeHrTime(n.endTime)
        };
      });
    }
    function F7p(e, t) {
      return e.dataPoints.map(n => {
        let r = n.value;
        return {
          attributes: (0, $8t.toAttributes)(n.attributes),
          count: r.count,
          min: r.min,
          max: r.max,
          sum: r.sum,
          positive: {
            offset: r.positive.offset,
            bucketCounts: r.positive.bucketCounts
          },
          negative: {
            offset: r.negative.offset,
            bucketCounts: r.negative.bucketCounts
          },
          scale: r.scale,
          zeroCount: r.zeroCount,
          startTimeUnixNano: t.encodeHrTime(n.startTime),
          timeUnixNano: t.encodeHrTime(n.endTime)
        };
      });
    }
    function U7p(e) {
      switch (e) {
        case dyt.AggregationTemporality.DELTA:
          return RJa.EAggregationTemporality.AGGREGATION_TEMPORALITY_DELTA;
        case dyt.AggregationTemporality.CUMULATIVE:
          return RJa.EAggregationTemporality.AGGREGATION_TEMPORALITY_CUMULATIVE;
      }
    }
    function B7p(e, t) {
      return {
        resourceMetrics: e.map(n => kJa(n, t))
      };
    }
    Vpe.createExportMetricsServiceRequest = B7p;
  });
  var OJa = __commonJS(O8n => {
    Object.defineProperty(O8n, "__esModule", {
      value: true
    });
    O8n.ProtobufMetricsSerializer = undefined;
    var PJa = C8n();
    var $7p = URo();
    var H7p = PJa.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse;
    var j7p = PJa.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceRequest;
    O8n.ProtobufMetricsSerializer = {
      serializeRequest: e => {
        let t = (0, $7p.createExportMetricsServiceRequest)([e]);
        return j7p.HS(t).finish();
      },
      deserializeResponse: e => H7p.oC(e)
    };
  });
  var DJa = __commonJS(D8n => {
    Object.defineProperty(D8n, "__esModule", {
      value: true
    });
    D8n.ProtobufMetricsSerializer = undefined;
    var q7p = OJa();
    Object.defineProperty(D8n, "ProtobufMetricsSerializer", {
      enumerable: true,
      get: function () {
        return q7p.ProtobufMetricsSerializer;
      }
    });
  });
  var BRo = __commonJS(zpe => {
    Object.defineProperty(zpe, "__esModule", {
      value: true
    });
    zpe.createExportTraceServiceRequest = zpe.toOtlpSpanEvent = zpe.toOtlpLink = zpe.sdkSpanToOtlpSpan = undefined;
    var H8t = k8n();
    var W7p = x8n();
    function MJa(e, t) {
      let n = e & 255 | 256;
      if (t) {
        n |= 512;
      }
      return n;
    }
    function NJa(e, t) {
      let n = e.spanContext();
      let r = e.status;
      let o = e.parentSpanContext?.spanId ? t.encodeSpanContext(e.parentSpanContext?.spanId) : undefined;
      return {
        traceId: t.encodeSpanContext(n.traceId),
        spanId: t.encodeSpanContext(n.spanId),
        parentSpanId: o,
        traceState: n.traceState?.serialize(),
        name: e.name,
        kind: e.kind == null ? 0 : e.kind + 1,
        startTimeUnixNano: t.encodeHrTime(e.startTime),
        endTimeUnixNano: t.encodeHrTime(e.endTime),
        attributes: (0, H8t.toAttributes)(e.attributes),
        droppedAttributesCount: e.droppedAttributesCount,
        events: e.events.map(s => FJa(s, t)),
        droppedEventsCount: e.droppedEventsCount,
        status: {
          code: r.code,
          message: r.message
        },
        links: e.links.map(s => LJa(s, t)),
        droppedLinksCount: e.droppedLinksCount,
        flags: MJa(n.traceFlags, e.parentSpanContext?.isRemote)
      };
    }
    zpe.sdkSpanToOtlpSpan = NJa;
    function LJa(e, t) {
      return {
        attributes: e.attributes ? (0, H8t.toAttributes)(e.attributes) : [],
        spanId: t.encodeSpanContext(e.context.spanId),
        traceId: t.encodeSpanContext(e.context.traceId),
        traceState: e.context.traceState?.serialize(),
        droppedAttributesCount: e.droppedAttributesCount || 0,
        flags: MJa(e.context.traceFlags, e.context.isRemote)
      };
    }
    zpe.toOtlpLink = LJa;
    function FJa(e, t) {
      return {
        attributes: e.attributes ? (0, H8t.toAttributes)(e.attributes) : [],
        name: e.name,
        timeUnixNano: t.encodeHrTime(e.time),
        droppedAttributesCount: e.droppedAttributesCount || 0
      };
    }
    zpe.toOtlpSpanEvent = FJa;
    function z7p(e, t) {
      let n = (0, W7p.getOtlpEncoder)(t);
      return {
        resourceSpans: Y7p(e, n)
      };
    }
    zpe.createExportTraceServiceRequest = z7p;
    function K7p(e) {
      let t = new Map();
      for (let n of e) {
        let r = t.get(n.resource);
        if (!r) {
          r = new Map();
          t.set(n.resource, r);
        }
        let o = `${n.instrumentationScope.name}@${n.instrumentationScope.version || ""}:${n.instrumentationScope.schemaUrl || ""}`;
        let s = r.get(o);
        if (!s) {
          s = [];
          r.set(o, s);
        }
        s.push(n);
      }
      return t;
    }
    function Y7p(e, t) {
      let n = K7p(e);
      let r = [];
      let o = n.entries();
      let s = o.next();
      while (!s.done) {
        let [i, a] = s.value;
        let l = [];
        let c = a.values();
        let u = c.next();
        while (!u.done) {
          let m = u.value;
          if (m.length > 0) {
            let f = m.map(h => NJa(h, t));
            l.push({
              scope: (0, H8t.createInstrumentationScope)(m[0].instrumentationScope),
              spans: f,
              schemaUrl: m[0].instrumentationScope.schemaUrl
            });
          }
          u = c.next();
        }
        let d = (0, H8t.createResource)(i);
        let p = {
          resource: d,
          scopeSpans: l,
          schemaUrl: d.schemaUrl
        };
        r.push(p);
        s = o.next();
      }
      return r;
    }
  });
  var BJa = __commonJS(M8n => {
    Object.defineProperty(M8n, "__esModule", {
      value: true
    });
    M8n.ProtobufTraceSerializer = undefined;
    var UJa = C8n();
    var J7p = BRo();
    var X7p = UJa.opentelemetry.proto.collector.trace.v1.ExportTraceServiceResponse;
    var Q7p = UJa.opentelemetry.proto.collector.trace.v1.ExportTraceServiceRequest;
    M8n.ProtobufTraceSerializer = {
      serializeRequest: e => {
        let t = (0, J7p.createExportTraceServiceRequest)(e);
        return Q7p.HS(t).finish();
      },
      deserializeResponse: e => X7p.oC(e)
    };
  });