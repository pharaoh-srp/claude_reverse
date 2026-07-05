  var HJa = __commonJS(L8n => {
    Object.defineProperty(L8n, "__esModule", {
      value: true
    });
    L8n.JsonLogsSerializer = undefined;
    var eYp = FRo();
    L8n.JsonLogsSerializer = {
      serializeRequest: e => {
        let t = (0, eYp.createExportLogsServiceRequest)(e, {
          useHex: true,
          useLongBits: false
        });
        return new TextEncoder().HS(JSON.stringify(t));
      },
      deserializeResponse: e => {
        if (e.length === 0) {
          return {};
        }
        return JSON.parse(new TextDecoder().oC(e));
      }
    };
  });
  var jJa = __commonJS(F8n => {
    Object.defineProperty(F8n, "__esModule", {
      value: true
    });
    F8n.JsonLogsSerializer = undefined;
    var tYp = HJa();
    Object.defineProperty(F8n, "JsonLogsSerializer", {
      enumerable: true,
      get: function () {
        return tYp.JsonLogsSerializer;
      }
    });
  });
  var qJa = __commonJS(U8n => {
    Object.defineProperty(U8n, "__esModule", {
      value: true
    });
    U8n.JsonMetricsSerializer = undefined;
    var nYp = URo();
    U8n.JsonMetricsSerializer = {
      serializeRequest: e => {
        let t = (0, nYp.createExportMetricsServiceRequest)([e], {
          useLongBits: false
        });
        return new TextEncoder().HS(JSON.stringify(t));
      },
      deserializeResponse: e => {
        if (e.length === 0) {
          return {};
        }
        return JSON.parse(new TextDecoder().oC(e));
      }
    };
  });
  var WJa = __commonJS(B8n => {
    Object.defineProperty(B8n, "__esModule", {
      value: true
    });
    B8n.JsonMetricsSerializer = undefined;
    var rYp = qJa();
    Object.defineProperty(B8n, "JsonMetricsSerializer", {
      enumerable: true,
      get: function () {
        return rYp.JsonMetricsSerializer;
      }
    });
  });
  var GJa = __commonJS($8n => {
    Object.defineProperty($8n, "__esModule", {
      value: true
    });
    $8n.JsonTraceSerializer = undefined;
    var oYp = BRo();
    $8n.JsonTraceSerializer = {
      serializeRequest: e => {
        let t = (0, oYp.createExportTraceServiceRequest)(e, {
          useHex: true,
          useLongBits: false
        });
        return new TextEncoder().HS(JSON.stringify(t));
      },
      deserializeResponse: e => {
        if (e.length === 0) {
          return {};
        }
        return JSON.parse(new TextDecoder().oC(e));
      }
    };
  });
  var VJa = __commonJS(H8n => {
    Object.defineProperty(H8n, "__esModule", {
      value: true
    });
    H8n.JsonTraceSerializer = undefined;
    var sYp = GJa();
    Object.defineProperty(H8n, "JsonTraceSerializer", {
      enumerable: true,
      get: function () {
        return sYp.JsonTraceSerializer;
      }
    });
  });
  var Kpe = __commonJS(D9 => {
    Object.defineProperty(D9, "__esModule", {
      value: true
    });
    D9.JsonTraceSerializer = D9.JsonMetricsSerializer = D9.JsonLogsSerializer = D9.ProtobufTraceSerializer = D9.ProtobufMetricsSerializer = D9.ProtobufLogsSerializer = undefined;
    var iYp = vJa();
    Object.defineProperty(D9, "ProtobufLogsSerializer", {
      enumerable: true,
      get: function () {
        return iYp.ProtobufLogsSerializer;
      }
    });
    var aYp = DJa();
    Object.defineProperty(D9, "ProtobufMetricsSerializer", {
      enumerable: true,
      get: function () {
        return aYp.ProtobufMetricsSerializer;
      }
    });
    var lYp = $Ja();
    Object.defineProperty(D9, "ProtobufTraceSerializer", {
      enumerable: true,
      get: function () {
        return lYp.ProtobufTraceSerializer;
      }
    });
    var cYp = jJa();
    Object.defineProperty(D9, "JsonLogsSerializer", {
      enumerable: true,
      get: function () {
        return cYp.JsonLogsSerializer;
      }
    });
    var uYp = WJa();
    Object.defineProperty(D9, "JsonMetricsSerializer", {
      enumerable: true,
      get: function () {
        return uYp.JsonMetricsSerializer;
      }
    });
    var dYp = VJa();
    Object.defineProperty(D9, "JsonTraceSerializer", {
      enumerable: true,
      get: function () {
        return dYp.JsonTraceSerializer;
      }
    });
  });
  var zJa = __commonJS(j8n => {
    Object.defineProperty(j8n, "__esModule", {
      value: true
    });
    j8n.validateAndNormalizeHeaders = undefined;
    var pYp = Ji();
    function mYp(e) {
      let t = {};
      Object.entries(e ?? {}).forEach(([n, r]) => {
        if (typeof r < "u") {
          t[n] = String(r);
        } else {
          pYp.diag.warn(`Header "${n}" has invalid value (${r}) and will be ignored`);
        }
      });
      return t;
    }
    j8n.validateAndNormalizeHeaders = mYp;
  });
  var YJa = __commonJS(pyt => {
    Object.defineProperty(pyt, "__esModule", {
      value: true
    });
    pyt.getHttpConfigurationDefaults = pyt.mergeOtlpHttpConfigurationWithDefaults = undefined;
    var KJa = D8t();
    var fYp = zJa();
    function hYp(e, t, n) {
      return async () => {
        let r = {
          ...(await n())
        };
        let o = {};
        if (t != null) {
          Object.assign(o, await t());
        }
        if (e != null) {
          Object.assign(o, (0, fYp.validateAndNormalizeHeaders)(await e()));
        }
        return Object.assign(o, r);
      };
    }
    function gYp(e) {
      if (e == null) {
        return;
      }
      try {
        let t = globalThis.location?.href;
        return new URL(e, t).href;
      } catch {
        throw Error(`Configuration: Could not parse user-provided export URL: '${e}'`);
      }
    }
    function yYp(e, t, n) {
      return {
        ...(0, KJa.mergeOtlpSharedConfigurationWithDefaults)(e, t, n),
        headers: hYp(e.headers, t.headers, n.headers),
        url: gYp(e.url) ?? t.url ?? n.url
      };
    }
    pyt.mergeOtlpHttpConfigurationWithDefaults = yYp;
    function _Yp(e, t) {
      return {
        ...(0, KJa.getSharedConfigurationDefaults)(),
        headers: async () => e,
        url: "http://localhost:4318/" + t
      };
    }
    pyt.getHttpConfigurationDefaults = _Yp;
  });
  var q8n = __commonJS(o1e => {
    Object.defineProperty(o1e, "__esModule", {
      value: true
    });
    o1e.getNodeHttpConfigurationDefaults = o1e.mergeOtlpNodeHttpConfigurationWithDefaults = o1e.httpAgentFactoryFromOptions = undefined;
    var JJa = YJa();
    function XJa(e) {
      return async t => {
        let n = t === "http:";
        let r = n ? import("http") : import("https");
        let {
          Agent: o
        } = await r;
        if (n) {
          let {
            ca: s,
            cert: i,
            key: a,
            ...l
          } = e;
          return new o(l);
        }
        return new o(e);
      };
    }
    o1e.httpAgentFactoryFromOptions = XJa;
    function bYp(e, t, n) {
      return {
        ...(0, JJa.mergeOtlpHttpConfigurationWithDefaults)(e, t, n),
        agentFactory: e.agentFactory ?? t.agentFactory ?? n.agentFactory,
        userAgent: e.userAgent
      };
    }
    o1e.mergeOtlpNodeHttpConfigurationWithDefaults = bYp;
    function SYp(e, t) {
      return {
        ...(0, JJa.getHttpConfigurationDefaults)(e, t),
        agentFactory: XJa({
          keepAlive: true
        })
      };
    }
    o1e.getNodeHttpConfigurationDefaults = SYp;
  });
  var QJa = __commonJS(myt => {
    Object.defineProperty(myt, "__esModule", {
      value: true
    });
    myt.parseRetryAfterToMills = myt.isExportRetryable = undefined;
    function TYp(e) {
      return [429, 502, 503, 504].includes(e);
    }
    myt.isExportRetryable = TYp;
    function EYp(e) {
      if (e == null) {
        return;
      }
      let t = Number.parseInt(e, 10);
      if (Number.isInteger(t)) {
        return t > 0 ? t * 1000 : -1;
      }
      let n = new Date(e).getTime() - Date.now();
      if (n >= 0) {
        return n;
      }
      return 0;
    }
    myt.parseRetryAfterToMills = EYp;
  });
  var ZJa = __commonJS(W8n => {
    Object.defineProperty(W8n, "__esModule", {
      value: true
    });
    W8n.VERSION = undefined;
    W8n.VERSION = "0.208.0";
  });
  var rXa = __commonJS(fyt => {
    Object.defineProperty(fyt, "__esModule", {
      value: true
    });
    fyt.compressAndSend = fyt.sendWithHttp = undefined;
    var vYp = require("zlib");
    var wYp = require("stream");
    var eXa = QJa();
    var CYp = f8n();
    var RYp = ZJa();
    var tXa = `OTel-OTLP-Exporter-JavaScript/${RYp.VERSION}`;
    function xYp(e, t, n, r, o, s, i, a, l) {
      let c = new URL(t);
      if (o) {
        n["User-Agent"] = `${o} ${tXa}`;
      } else {
        n["User-Agent"] = tXa;
      }
      let u = {
        hostname: c.hostname,
        port: c.port,
        path: c.pathname,
        method: "POST",
        headers: n,
        agent: s
      };
      let d = e(u, p => {
        let m = [];
        p.on("data", f => m.push(f));
        p.on("end", () => {
          if (p.statusCode && p.statusCode < 299) {
            a({
              status: "success",
              data: Buffer.concat(m)
            });
          } else if (p.statusCode && (0, eXa.isExportRetryable)(p.statusCode)) {
            a({
              status: "retryable",
              retryInMillis: (0, eXa.parseRetryAfterToMills)(p.headers["retry-after"])
            });
          } else {
            let f = new CYp.OTLPExporterError(p.statusMessage, p.statusCode, Buffer.concat(m).toString());
            a({
              status: "failure",
              error: f
            });
          }
        });
      });
      d.setTimeout(l, () => {
        d.destroy();
        a({
          status: "failure",
          error: Error("Request Timeout")
        });
      });
      d.on("error", p => {
        a({
          status: "failure",
          error: p
        });
      });
      nXa(d, r, i, p => {
        a({
          status: "failure",
          error: p
        });
      });
    }
    fyt.sendWithHttp = xYp;
    function nXa(e, t, n, r) {
      let o = kYp(n);
      if (t === "gzip") {
        e.setHeader("Content-Encoding", "gzip");
        o = o.on("error", r).pipe(vYp.createGzip()).on("error", r);
      }
      o.pipe(e).on("error", r);
    }
    fyt.compressAndSend = nXa;
    function kYp(e) {
      let t = new wYp.Readable();
      t.push(e);
      t.push(null);
      return t;
    }
  });
  var sXa = __commonJS(G8n => {
    Object.defineProperty(G8n, "__esModule", {
      value: true
    });
    G8n.createHttpExporterTransport = undefined;
    var AYp = rXa();
    class oXa {
      _parameters;
      _utils = null;
      constructor(e) {
        this._parameters = e;
      }
      async send(e, t) {
        let {
          agent: n,
          request: r
        } = await this._loadUtils();
        let o = await this._parameters.headers();
        return new Promise(s => {
          (0, AYp.sendWithHttp)(r, this._parameters.url, o, this._parameters.compression, this._parameters.userAgent, n, e, i => {
            s(i);
          }, t);
        });
      }
      shutdown() {}
      async _loadUtils() {
        let e = this._utils;
        if (e === null) {
          let t = new URL(this._parameters.url).protocol;
          let [n, r] = await Promise.all([this._parameters.agentFactory(t), IYp(t)]);
          e = this._utils = {
            agent: n,
            request: r
          };
        }
        return e;
      }
    }
    async function IYp(e) {
      let t = e === "http:" ? import("http") : import("https");
      let {
        request: n
      } = await t;
      return n;
    }
    function PYp(e) {
      return new oXa(e);
    }
    G8n.createHttpExporterTransport = PYp;
  });
  var lXa = __commonJS(V8n => {
    Object.defineProperty(V8n, "__esModule", {
      value: true
    });
    V8n.createRetryingTransport = undefined;
    function LYp() {
      return Math.random() * (2 * 0.2) - 0.2;
    }
    class aXa {
      _transport;
      constructor(e) {
        this._transport = e;
      }
      retry(e, t, n) {
        return new Promise((r, o) => {
          setTimeout(() => {
            this._transport.send(e, t).then(r, o);
          }, n);
        });
      }
      async send(e, t) {
        let n = Date.now() + t;
        let r = await this._transport.send(e, t);
        let o = 5;
        let s = 1000;
        while (r.status === "retryable" && o > 0) {
          o--;
          let i = Math.max(Math.min(s, 5000) + LYp(), 0);
          s = s * 1.5;
          let a = r.retryInMillis ?? i;
          let l = n - Date.now();
          if (a > l) {
            return r;
          }
          r = await this.retry(e, l, a);
        }
        return r;
      }
      shutdown() {
        return this._transport.shutdown();
      }
    }
    function FYp(e) {
      return new aXa(e.transport);
    }
    V8n.createRetryingTransport = FYp;
  });
  var cXa = __commonJS(z8n => {
    Object.defineProperty(z8n, "__esModule", {
      value: true
    });
    z8n.createOtlpHttpExportDelegate = undefined;
    var UYp = mRo();
    var BYp = sXa();
    var $Yp = pRo();
    var HYp = lXa();
    function jYp(e, t) {
      return (0, UYp.createOtlpExportDelegate)({
        transport: (0, HYp.createRetryingTransport)({
          transport: (0, BYp.createHttpExporterTransport)(e)
        }),
        serializer: t,
        promiseHandler: (0, $Yp.createBoundedQueueExportPromiseHandler)(e)
      }, {
        timeout: e.timeoutMillis
      });
    }
    z8n.createOtlpHttpExportDelegate = jYp;
  });