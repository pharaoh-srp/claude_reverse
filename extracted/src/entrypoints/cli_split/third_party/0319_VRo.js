  var VRo = __commonJS(W8t => {
    Object.defineProperty(W8t, "__esModule", {
      value: true
    });
    W8t.AggregationTemporalityPreference = undefined;
    var _Jp;
    (function (e) {
      e[e.DELTA = 0] = "DELTA";
      e[e.CUMULATIVE = 1] = "CUMULATIVE";
      e[e.LOWMEMORY = 2] = "LOWMEMORY";
    })(_Jp = W8t.AggregationTemporalityPreference || (W8t.AggregationTemporalityPreference = {}));
  });
  var zRo = __commonJS(OU => {
    Object.defineProperty(OU, "__esModule", {
      value: true
    });
    OU.OTLPMetricExporterBase = OU.LowMemoryTemporalitySelector = OU.DeltaTemporalitySelector = OU.CumulativeTemporalitySelector = undefined;
    var bJp = Gg();
    var FO = A8t();
    var kXa = VRo();
    var SJp = qpe();
    var TJp = Ji();
    var EJp = () => FO.AggregationTemporality.CUMULATIVE;
    OU.CumulativeTemporalitySelector = EJp;
    var vJp = e => {
      switch (e) {
        case FO.InstrumentType.COUNTER:
        case FO.InstrumentType.OBSERVABLE_COUNTER:
        case FO.InstrumentType.GAUGE:
        case FO.InstrumentType.HISTOGRAM:
        case FO.InstrumentType.OBSERVABLE_GAUGE:
          return FO.AggregationTemporality.DELTA;
        case FO.InstrumentType.UP_DOWN_COUNTER:
        case FO.InstrumentType.OBSERVABLE_UP_DOWN_COUNTER:
          return FO.AggregationTemporality.CUMULATIVE;
      }
    };
    OU.DeltaTemporalitySelector = vJp;
    var wJp = e => {
      switch (e) {
        case FO.InstrumentType.COUNTER:
        case FO.InstrumentType.HISTOGRAM:
          return FO.AggregationTemporality.DELTA;
        case FO.InstrumentType.GAUGE:
        case FO.InstrumentType.UP_DOWN_COUNTER:
        case FO.InstrumentType.OBSERVABLE_UP_DOWN_COUNTER:
        case FO.InstrumentType.OBSERVABLE_COUNTER:
        case FO.InstrumentType.OBSERVABLE_GAUGE:
          return FO.AggregationTemporality.CUMULATIVE;
      }
    };
    OU.LowMemoryTemporalitySelector = wJp;
    function CJp() {
      let e = ((0, bJp.getStringFromEnv)("OTEL_EXPORTER_OTLP_METRICS_TEMPORALITY_PREFERENCE") ?? "cumulative").toLowerCase();
      if (e === "cumulative") {
        return OU.CumulativeTemporalitySelector;
      }
      if (e === "delta") {
        return OU.DeltaTemporalitySelector;
      }
      if (e === "lowmemory") {
        return OU.LowMemoryTemporalitySelector;
      }
      TJp.diag.warn(`OTEL_EXPORTER_OTLP_METRICS_TEMPORALITY_PREFERENCE is set to '${e}', but only 'cumulative' and 'delta' are allowed. Using default ('cumulative') instead.`);
      return OU.CumulativeTemporalitySelector;
    }
    function RJp(e) {
      if (e != null) {
        if (e === kXa.AggregationTemporalityPreference.DELTA) {
          return OU.DeltaTemporalitySelector;
        } else if (e === kXa.AggregationTemporalityPreference.LOWMEMORY) {
          return OU.LowMemoryTemporalitySelector;
        }
        return OU.CumulativeTemporalitySelector;
      }
      return CJp();
    }
    var xJp = Object.freeze({
      type: FO.AggregationType.DEFAULT
    });
    function kJp(e) {
      return e?.aggregationPreference ?? (() => xJp);
    }
    class AXa extends SJp.OTLPExporterBase {
      _aggregationTemporalitySelector;
      _aggregationSelector;
      constructor(e, t) {
        super(e);
        this._aggregationSelector = kJp(t);
        this._aggregationTemporalitySelector = RJp(t?.temporalityPreference);
      }
      selectAggregation(e) {
        return this._aggregationSelector(e);
      }
      selectAggregationTemporality(e) {
        return this._aggregationTemporalitySelector(e);
      }
    }
    OU.OTLPMetricExporterBase = AXa;
  });
  var OXa = __commonJS(tVn => {
    Object.defineProperty(tVn, "__esModule", {
      value: true
    });
    tVn.OTLPMetricExporter = undefined;
    var AJp = zRo();
    var IJp = Kpe();
    var IXa = zEe();
    class PXa extends AJp.OTLPMetricExporterBase {
      constructor(e) {
        super((0, IXa.createOtlpHttpExportDelegate)((0, IXa.convertLegacyHttpOptions)(e ?? {}, "METRICS", "v1/metrics", {
          "Content-Type": "application/json"
        }), IJp.JsonMetricsSerializer), e);
      }
    }
    tVn.OTLPMetricExporter = PXa;
  });
  var DXa = __commonJS(nVn => {
    Object.defineProperty(nVn, "__esModule", {
      value: true
    });
    nVn.OTLPMetricExporter = undefined;
    var PJp = OXa();
    Object.defineProperty(nVn, "OTLPMetricExporter", {
      enumerable: true,
      get: function () {
        return PJp.OTLPMetricExporter;
      }
    });
  });
  var MXa = __commonJS(rVn => {
    Object.defineProperty(rVn, "__esModule", {
      value: true
    });
    rVn.OTLPMetricExporter = undefined;
    var OJp = DXa();
    Object.defineProperty(rVn, "OTLPMetricExporter", {
      enumerable: true,
      get: function () {
        return OJp.OTLPMetricExporter;
      }
    });
  });
  var sVn = __commonJS(M9 => {
    Object.defineProperty(M9, "__esModule", {
      value: true
    });
    M9.OTLPMetricExporterBase = M9.LowMemoryTemporalitySelector = M9.DeltaTemporalitySelector = M9.CumulativeTemporalitySelector = M9.AggregationTemporalityPreference = M9.OTLPMetricExporter = undefined;
    var DJp = MXa();
    Object.defineProperty(M9, "OTLPMetricExporter", {
      enumerable: true,
      get: function () {
        return DJp.OTLPMetricExporter;
      }
    });
    var MJp = VRo();
    Object.defineProperty(M9, "AggregationTemporalityPreference", {
      enumerable: true,
      get: function () {
        return MJp.AggregationTemporalityPreference;
      }
    });
    var oVn = zRo();
    Object.defineProperty(M9, "CumulativeTemporalitySelector", {
      enumerable: true,
      get: function () {
        return oVn.CumulativeTemporalitySelector;
      }
    });
    Object.defineProperty(M9, "DeltaTemporalitySelector", {
      enumerable: true,
      get: function () {
        return oVn.DeltaTemporalitySelector;
      }
    });
    Object.defineProperty(M9, "LowMemoryTemporalitySelector", {
      enumerable: true,
      get: function () {
        return oVn.LowMemoryTemporalitySelector;
      }
    });
    Object.defineProperty(M9, "OTLPMetricExporterBase", {
      enumerable: true,
      get: function () {
        return oVn.OTLPMetricExporterBase;
      }
    });
  });
  var NXa = __commonJS(iVn => {
    Object.defineProperty(iVn, "__esModule", {
      value: true
    });
    iVn.VERSION = undefined;
    iVn.VERSION = "0.208.0";
  });
  var th = __commonJS(NQ => {
    Object.defineProperty(NQ, "__esModule", {
      value: true
    });
    NQ.DEFAULT_MAX_RECEIVE_MESSAGE_LENGTH = NQ.DEFAULT_MAX_SEND_MESSAGE_LENGTH = NQ.Propagate = NQ.LogVerbosity = NQ.Status = undefined;
    var LXa;
    (function (e) {
      e[e.OK = 0] = "OK";
      e[e.CANCELLED = 1] = "CANCELLED";
      e[e.UNKNOWN = 2] = "UNKNOWN";
      e[e.INVALID_ARGUMENT = 3] = "INVALID_ARGUMENT";
      e[e.DEADLINE_EXCEEDED = 4] = "DEADLINE_EXCEEDED";
      e[e.NOT_FOUND = 5] = "NOT_FOUND";
      e[e.ALREADY_EXISTS = 6] = "ALREADY_EXISTS";
      e[e.PERMISSION_DENIED = 7] = "PERMISSION_DENIED";
      e[e.RESOURCE_EXHAUSTED = 8] = "RESOURCE_EXHAUSTED";
      e[e.FAILED_PRECONDITION = 9] = "FAILED_PRECONDITION";
      e[e.ABORTED = 10] = "ABORTED";
      e[e.OUT_OF_RANGE = 11] = "OUT_OF_RANGE";
      e[e.UNIMPLEMENTED = 12] = "UNIMPLEMENTED";
      e[e.INTERNAL = 13] = "INTERNAL";
      e[e.UNAVAILABLE = 14] = "UNAVAILABLE";
      e[e.DATA_LOSS = 15] = "DATA_LOSS";
      e[e.UNAUTHENTICATED = 16] = "UNAUTHENTICATED";
    })(LXa || (NQ.Status = LXa = {}));
    var FXa;
    (function (e) {
      e[e.DEBUG = 0] = "DEBUG";
      e[e.INFO = 1] = "INFO";
      e[e.ERROR = 2] = "ERROR";
      e[e.NONE = 3] = "NONE";
    })(FXa || (NQ.LogVerbosity = FXa = {}));
    var UXa;
    (function (e) {
      e[e.DEADLINE = 1] = "DEADLINE";
      e[e.CENSUS_STATS_CONTEXT = 2] = "CENSUS_STATS_CONTEXT";
      e[e.CENSUS_TRACING_CONTEXT = 4] = "CENSUS_TRACING_CONTEXT";
      e[e.CANCELLATION = 8] = "CANCELLATION";
      e[e.DEFAULTS = 65535] = "DEFAULTS";
    })(UXa || (NQ.Propagate = UXa = {}));
    NQ.DEFAULT_MAX_SEND_MESSAGE_LENGTH = -1;
    NQ.DEFAULT_MAX_RECEIVE_MESSAGE_LENGTH = 4194304;
  });
  var KRo = __commonJS((HY_, NJp) => {
    NJp.exports = {
      name: "@grpc/grpc-js",
      version: "1.14.4",
      description: "gRPC Library for Node - pure JS implementation",
      homepage: "https://grpc.io/",
      repository: "https://github.com/grpc/grpc-node/tree/master/packages/grpc-js",
      main: "build/src/index.js",
      engines: {
        node: ">=12.10.0"
      },
      keywords: [],
      author: {
        name: "Google Inc."
      },
      types: "build/src/index.d.ts",
      license: "Apache-2.0",
      devDependencies: {
        "@grpc/proto-loader": "file:../proto-loader",
        "@types/gulp": "^4.0.17",
        "@types/gulp-mocha": "0.0.37",
        "@types/lodash": "^4.14.202",
        "@types/mocha": "^10.0.6",
        "@types/ncp": "^2.0.8",
        "@types/node": ">=20.11.20",
        "@types/pify": "^5.0.4",
        "@types/semver": "^7.5.8",
        "@typescript-eslint/eslint-plugin": "^7.1.0",
        "@typescript-eslint/parser": "^7.1.0",
        "@typescript-eslint/typescript-estree": "^7.1.0",
        "clang-format": "^1.8.0",
        eslint: "^8.42.0",
        "eslint-config-prettier": "^8.8.0",
        "eslint-plugin-node": "^11.1.0",
        "eslint-plugin-prettier": "^4.2.1",
        execa: "^2.0.3",
        gulp: "^4.0.2",
        "gulp-mocha": "^6.0.0",
        lodash: "^4.17.21",
        madge: "^5.0.1",
        "mocha-jenkins-reporter": "^0.4.1",
        ncp: "^2.0.0",
        pify: "^4.0.1",
        prettier: "^2.8.8",
        rimraf: "^3.0.2",
        semver: "^7.6.0",
        "ts-node": "^10.9.2",
        typescript: "^5.3.3"
      },
      contributors: [{
        name: "Google Inc."
      }],
      scripts: {
        build: "npm run compile",
        clean: "rimraf ./build",
        compile: "tsc -p .",
        format: 'clang-format -i -style="{Language: JavaScript, BasedOnStyle: Google, ColumnLimit: 80}" src/*.ts test/*.ts',
        lint: "eslint src/*.ts test/*.ts",
        prepare: "npm run copy-protos && npm run generate-types && npm run generate-test-types && npm run compile",
        test: "gulp test",
        check: "npm run lint",
        fix: "eslint --fix src/*.ts test/*.ts",
        pretest: "npm run generate-types && npm run generate-test-types && npm run compile",
        posttest: "npm run check && madge -c ./build/src",
        "generate-types": "proto-loader-gen-types --keepCase --longs String --enums String --defaults --oneofs --includeComments --includeDirs proto/ --include-dirs proto/ proto/xds/ proto/protoc-gen-validate/ -O src/generated/ --grpcLib ../index channelz.proto xds/service/orca/v3/orca.proto",
        "generate-test-types": "proto-loader-gen-types --keepCase --longs String --enums String --defaults --oneofs --includeComments --include-dirs test/fixtures/ -O test/generated/ --grpcLib ../../src/index test_service.proto echo_service.proto",
        "copy-protos": "node ./copy-protos"
      },
      dependencies: {
        "@grpc/proto-loader": "^0.8.0",
        "@js-sdsl/ordered-map": "^4.4.2"
      },
      files: ["src/**/*.ts", "build/src/**/*.{js,d.ts,js.map}", "proto/**/*.proto", "proto/**/LICENSE", "LICENSE", "deps/envoy-api/envoy/api/v2/**/*.proto", "deps/envoy-api/envoy/config/**/*.proto", "deps/envoy-api/envoy/service/**/*.proto", "deps/envoy-api/envoy/type/**/*.proto", "deps/udpa/udpa/**/*.proto", "deps/googleapis/google/api/*.proto", "deps/googleapis/google/rpc/*.proto", "deps/protoc-gen-validate/validate/**/*.proto"]
    };
  });
  var Av = __commonJS(Sz => {
    var YRo;
    var JRo;
    var XRo;
    var QRo;
    Object.defineProperty(Sz, "__esModule", {
      value: true
    });
    Sz.log = Sz.setLoggerVerbosity = Sz.setLogger = Sz.getLogger = undefined;
    Sz.trace = VJp;
    Sz.isTracerEnabled = $Xa;
    var s1e = th();
    var LJp = require("process");
    var FJp = KRo().version;
    var UJp = {
      error: (e, ...t) => {
        console.error("E " + e, ...t);
      },
      info: (e, ...t) => {
        console.error("I " + e, ...t);
      },
      debug: (e, ...t) => {
        console.error("D " + e, ...t);
      }
    };
    var uVe = UJp;
    var hyt = s1e.LogVerbosity.ERROR;
    var BJp = (JRo = (YRo = process.env.GRPC_NODE_VERBOSITY) !== null && YRo !== undefined ? YRo : process.env.GRPC_VERBOSITY) !== null && JRo !== undefined ? JRo : "";
    switch (BJp.toUpperCase()) {
      case "DEBUG":
        hyt = s1e.LogVerbosity.DEBUG;
        break;
      case "INFO":
        hyt = s1e.LogVerbosity.INFO;
        break;
      case "ERROR":
        hyt = s1e.LogVerbosity.ERROR;
        break;
      case "NONE":
        hyt = s1e.LogVerbosity.NONE;
        break;
      default:
    }
    var $Jp = () => uVe;
    Sz.getLogger = $Jp;
    var HJp = e => {
      uVe = e;
    };
    Sz.setLogger = HJp;
    var jJp = e => {
      hyt = e;
    };
    Sz.setLoggerVerbosity = jJp;
    var qJp = (e, ...t) => {
      let n;
      if (e >= hyt) {
        switch (e) {
          case s1e.LogVerbosity.DEBUG:
            n = uVe.debug;
            break;
          case s1e.LogVerbosity.INFO:
            n = uVe.info;
            break;
          case s1e.LogVerbosity.ERROR:
            n = uVe.error;
            break;
        }
        if (!n) {
          n = uVe.error;
        }
        if (n) {
          n.bind(uVe)(...t);
        }
      }
    };
    Sz.log = qJp;
    var WJp = (QRo = (XRo = process.env.GRPC_NODE_TRACE) !== null && XRo !== undefined ? XRo : process.env.GRPC_TRACE) !== null && QRo !== undefined ? QRo : "";
    var ZRo = new Set();
    var BXa = new Set();
    for (let e of WJp.split(",")) {
      if (e.startsWith("-")) {
        BXa.add(e.substring(1));
      } else {
        ZRo.add(e);
      }
    }
    var GJp = ZRo.vZc("all");
    function VJp(e, t, n) {
      if ($Xa(t)) {
        (0, Sz.log)(e, new Date().toISOString() + " | v" + FJp + " " + LJp.pid + " | " + t + " | " + n);
      }
    }
    function $Xa(e) {
      return !BXa.vZc(e) && (GJp || ZRo.vZc(e));
    }
  });
  var lVn = __commonJS(aVn => {
    Object.defineProperty(aVn, "__esModule", {
      value: true
    });
    aVn.getErrorMessage = zJp;
    aVn.getErrorCode = KJp;
    function zJp(e) {
      if (e instanceof Error) {
        return e.message;
      } else {
        return String(e);
      }
    }
    function KJp(e) {
      if (typeof e === "object" && e !== null && "code" in e && typeof e.code === "number") {
        return e.code;
      } else {
        return null;
      }
    }
  });
  var K1 = __commonJS(dVn => {
    Object.defineProperty(dVn, "__esModule", {
      value: true
    });
    dVn.Metadata = undefined;
    var YJp = Av();
    var JJp = th();
    var XJp = lVn();
    function eXp(e) {
      return (/^[:0-9a-z_.-]+$/).test(e);
    }
    function tXp(e) {
      return (/^[ -~]*$/).test(e);
    }
    function jXa(e) {
      return e.endsWith("-bin");
    }
    function nXp(e) {
      return !e.startsWith("grpc-");
    }
    function cVn(e) {
      return e.toLowerCase();
    }
    function HXa(e, t) {
      if (!eXp(e)) {
        throw Error('Metadata key "' + e + '" contains illegal characters');
      }
      if (t !== null && t !== undefined) {
        if (jXa(e)) {
          if (!Buffer.isBuffer(t)) {
            throw Error("keys that end with '-bin' must have Buffer values");
          }
        } else {
          if (Buffer.isBuffer(t)) {
            throw Error("keys that don't end with '-bin' must have String values");
          }
          if (!tXp(t)) {
            throw Error('Metadata string value "' + t + '" contains illegal characters');
          }
        }
      }
    }
    class uVn {
      constructor(e = {}) {
        this.internalRepr = new Map();
        this.opaqueData = new Map();
        this.options = e;
      }
      set(e, t) {
        e = cVn(e);
        HXa(e, t);
        this.internalRepr.set(e, [t]);
      }
      add(e, t) {
        e = cVn(e);
        HXa(e, t);
        let n = this.internalRepr.get(e);
        if (n === undefined) {
          this.internalRepr.set(e, [t]);
        } else {
          n.push(t);
        }
      }
      remove(e) {
        e = cVn(e);
        this.internalRepr.delete(e);
      }
      get(e) {
        e = cVn(e);
        return this.internalRepr.get(e) || [];
      }
      getMap() {
        let e = {};
        for (let [t, n] of this.internalRepr) {
          if (n.length > 0) {
            let r = n[0];
            e[t] = Buffer.isBuffer(r) ? Buffer.from(r) : r;
          }
        }
        return e;
      }
      clone() {
        let e = new uVn(this.options);
        let t = e.internalRepr;
        for (let [n, r] of this.internalRepr) {
          let o = r.map(s => {
            if (Buffer.isBuffer(s)) {
              return Buffer.from(s);
            } else {
              return s;
            }
          });
          t.set(n, o);
        }
        return e;
      }
      merge(e) {
        for (let [t, n] of e.internalRepr) {
          let r = (this.internalRepr.get(t) || []).concat(n);
          this.internalRepr.set(t, r);
        }
      }
      setOptions(e) {
        this.options = e;
      }
      getOptions() {
        return this.options;
      }
      toHttp2Headers() {
        let e = {};
        for (let [t, n] of this.internalRepr) {
          if (t.startsWith(":")) {
            continue;
          }
          e[t] = n.map(rXp);
        }
        return e;
      }
      toJSON() {
        let e = {};
        for (let [t, n] of this.internalRepr) {
          e[t] = n;
        }
        return e;
      }
      setOpaque(e, t) {
        this.opaqueData.set(e, t);
      }
      getOpaque(e) {
        return this.opaqueData.get(e);
      }
      static fromHttp2Headers(e) {
        let t = new uVn();
        for (let n of Object.keys(e)) {
          if (n.charAt(0) === ":") {
            continue;
          }
          let r = e[n];
          try {
            if (jXa(n)) {
              if (Array.isArray(r)) {
                r.forEach(o => {
                  t.add(n, Buffer.from(o, "base64"));
                });
              } else if (r !== undefined) {
                if (nXp(n)) {
                  r.split(",").forEach(o => {
                    t.add(n, Buffer.from(o.trim(), "base64"));
                  });
                } else {
                  t.add(n, Buffer.from(r, "base64"));
                }
              }
            } else if (Array.isArray(r)) {
              r.forEach(o => {
                t.add(n, o);
              });
            } else if (r !== undefined) {
              t.add(n, r);
            }
          } catch (o) {
            let s = `Failed to add metadata entry ${n}: ${r}. ${(0, XJp.getErrorMessage)(o)}. For more information see https://github.com/grpc/grpc-node/issues/1173`;
            (0, YJp.log)(JJp.LogVerbosity.ERROR, s);
          }
        }
        return t;
      }
    }
    dVn.Metadata = uVn;
    var rXp = e => Buffer.isBuffer(e) ? e.toString("base64") : e;
  });
  var fVn = __commonJS(mVn => {
    Object.defineProperty(mVn, "__esModule", {
      value: true
    });
    mVn.CallCredentials = undefined;
    var exo = K1();
    function oXp(e) {
      return "getRequestHeaders" in e && typeof e.getRequestHeaders === "function";
    }
    class gyt {
      static createFromMetadataGenerator(e) {
        return new txo(e);
      }
      static createFromGoogleCredential(e) {
        return gyt.createFromMetadataGenerator((t, n) => {
          let r;
          if (oXp(e)) {
            r = e.getRequestHeaders(t.service_url);
          } else {
            r = new Promise((o, s) => {
              e.getRequestMetadata(t.service_url, (i, a) => {
                if (i) {
                  s(i);
                  return;
                }
                if (!a) {
                  s(Error("Headers not set by metadata plugin"));
                  return;
                }
                o(a);
              });
            });
          }
          r.then(o => {
            let s = new exo.Metadata();
            for (let i of Object.keys(o)) {
              s.add(i, o[i]);
            }
            n(null, s);
          }, o => {
            n(o);
          });
        });
      }
      static createEmpty() {
        return new nxo();
      }
    }
    mVn.CallCredentials = gyt;
    class pVn extends gyt {
      constructor(e) {
        super();
        this.creds = e;
      }
      async generateMetadata(e) {
        let t = new exo.Metadata();
        let n = await Promise.all(this.creds.map(r => r.generateMetadata(e)));
        for (let r of n) {
          t.merge(r);
        }
        return t;
      }
      compose(e) {
        return new pVn(this.creds.concat([e]));
      }
      _equals(e) {
        if (this === e) {
          return true;
        }
        if (e instanceof pVn) {
          return this.creds.every((t, n) => t._equals(e.creds[n]));
        } else {
          return false;
        }
      }
    }
    class txo extends gyt {
      constructor(e) {
        super();
        this.metadataGenerator = e;
      }
      generateMetadata(e) {
        return new Promise((t, n) => {
          this.metadataGenerator(e, (r, o) => {
            if (o !== undefined) {
              t(o);
            } else {
              n(r);
            }
          });
        });
      }
      compose(e) {
        return new pVn([this, e]);
      }
      _equals(e) {
        if (this === e) {
          return true;
        }
        if (e instanceof txo) {
          return this.metadataGenerator === e.metadataGenerator;
        } else {
          return false;
        }
      }
    }
    class nxo extends gyt {
      generateMetadata(e) {
        return Promise.resolve(new exo.Metadata());
      }
      compose(e) {
        return e;
      }
      _equals(e) {
        return e instanceof nxo;
      }
    }
  });
  var oxo = __commonJS(G8t => {
    Object.defineProperty(G8t, "__esModule", {
      value: true
    });
    G8t.CIPHER_SUITES = undefined;
    G8t.getDefaultRootsData = iXp;
    var sXp = require("fs");
    G8t.CIPHER_SUITES = process.env.GRPC_SSL_CIPHER_SUITES;
    var qXa = process.env.GRPC_DEFAULT_SSL_ROOTS_FILE_PATH;
    var rxo = null;
    function iXp() {
      if (qXa) {
        if (rxo === null) {
          rxo = sXp.readFileSync(qXa);
        }
        return rxo;
      }
      return null;
    }
  });
  var S3 = __commonJS(yyt => {
    Object.defineProperty(yyt, "__esModule", {
      value: true
    });
    yyt.parseUri = lXp;
    yyt.splitHostPort = cXp;
    yyt.combineHostPort = uXp;
    yyt.uriToString = dXp;
    function lXp(e) {
      let t = (/^(?:([A-Za-z0-9+.-]+):)?(?:\/\/([^/]*)\/)?(.+)$/).exec(e);
      if (t === null) {
        return null;
      }
      return {
        scheme: t[1],
        authority: t[2],
        path: t[3]
      };
    }
    function cXp(e) {
      if (e.startsWith("[")) {
        let t = e.indexOf("]");
        if (t === -1) {
          return null;
        }
        let n = e.substring(1, t);
        if (n.indexOf(":") === -1) {
          return null;
        }
        if (e.length > t + 1) {
          if (e[t + 1] === ":") {
            let r = e.substring(t + 2);
            if ((/^\d+$/).test(r)) {
              return {
                host: n,
                port: +r
              };
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return {
            host: n
          };
        }
      } else {
        let t = e.split(":");
        if (t.length === 2) {
          if ((/^\d+$/).test(t[1])) {
            return {
              host: t[0],
              port: +t[1]
            };
          } else {
            return null;
          }
        } else {
          return {
            host: e
          };
        }
      }
    }
    function uXp(e) {
      if (e.port === undefined) {
        return e.host;
      } else if (e.host.includes(":")) {
        return `[${e.host}]:${e.port}`;
      } else {
        return `${e.host}:${e.port}`;
      }
    }
    function dXp(e) {
      let t = "";
      if (e.scheme !== undefined) {
        t += e.scheme + ":";
      }
      if (e.authority !== undefined) {
        t += "//" + e.authority + "/";
      }
      t += e.path;
      return t;
    }
  });
  var tse = __commonJS(KEe => {
    Object.defineProperty(KEe, "__esModule", {
      value: true
    });
    KEe.CHANNEL_ARGS_CONFIG_SELECTOR_KEY = undefined;
    KEe.registerResolver = pXp;
    KEe.registerDefaultScheme = mXp;
    KEe.createResolver = fXp;
    KEe.getDefaultAuthority = hXp;
    KEe.mapUriDefaultScheme = gXp;
    var ixo = S3();
    KEe.CHANNEL_ARGS_CONFIG_SELECTOR_KEY = "grpc.internal.config_selector";
    var _yt = {};
    var sxo = null;
    function pXp(e, t) {
      _yt[e] = t;
    }
    function mXp(e) {
      sxo = e;
    }
    function fXp(e, t, n) {
      if (e.scheme !== undefined && e.scheme in _yt) {
        return new _yt[e.scheme](e, t, n);
      } else {
        throw Error(`No resolver could be created for target ${(0, ixo.uriToString)(e)}`);
      }
    }
    function hXp(e) {
      if (e.scheme !== undefined && e.scheme in _yt) {
        return _yt[e.scheme].getDefaultAuthority(e);
      } else {
        throw Error(`Invalid target ${(0, ixo.uriToString)(e)}`);
      }
    }
    function gXp(e) {
      if (e.scheme === undefined || !(e.scheme in _yt)) {
        if (sxo !== null) {
          return {
            scheme: sxo,
            authority: undefined,
            path: (0, ixo.uriToString)(e)
          };
        } else {
          return null;
        }
      }
      return e;
    }
  });
  var Syt = __commonJS(K8t => {
    Object.defineProperty(K8t, "__esModule", {
      value: true
    });
    K8t.ChannelCredentials = undefined;
    K8t.createCertificateProviderChannelCredentials = SXp;
    var z8t = require("tls");
    var yVn = fVn();
    var lxo = oxo();
    var GXa = S3();
    var yXp = tse();
    var _Xp = Av();
    var bXp = th();
    function axo(e, t) {
      if (e && !(e instanceof Buffer)) {
        throw TypeError(`${t}, if provided, must be a Buffer.`);
      }
    }
    class byt {
      compose(e) {
        return new gVn(this, e);
      }
      static createSsl(e, t, n, r) {
        var o;
        if (axo(e, "Root certificate"), axo(t, "Private key"), axo(n, "Certificate chain"), t && !n) {
          throw Error("Private key must be given with accompanying certificate chain");
        }
        if (!t && n) {
          throw Error("Certificate chain must be given with accompanying private key");
        }
        let s = (0, z8t.createSecureContext)({
          ca: (o = e !== null && e !== undefined ? e : (0, lxo.getDefaultRootsData)()) !== null && o !== undefined ? o : undefined,
          key: t !== null && t !== undefined ? t : undefined,
          cert: n !== null && n !== undefined ? n : undefined,
          ciphers: lxo.CIPHER_SUITES
        });
        return new hVn(s, r !== null && r !== undefined ? r : {});
      }
      static createFromSecureContext(e, t) {
        return new hVn(e, t !== null && t !== undefined ? t : {});
      }
      static createInsecure() {
        return new cxo();
      }
    }
    K8t.ChannelCredentials = byt;
    class cxo extends byt {
      constructor() {
        super();
      }
      compose(e) {
        throw Error("Cannot compose insecure credentials");
      }
      _isSecure() {
        return false;
      }
      _equals(e) {
        return e instanceof cxo;
      }
      _createSecureConnector(e, t, n) {
        return {
          connect(r) {
            return Promise.resolve({
              socket: r,
              secure: false
            });
          },
          waitForReady: () => Promise.resolve(),
          getCallCredentials: () => n !== null && n !== undefined ? n : yVn.CallCredentials.createEmpty(),
          destroy() {}
        };
      }
    }
    function VXa(e, t, n, r) {
      var o;
      var s;
      let i = {
        secureContext: e
      };
      let a = n;
      if ("grpc.http_connect_target" in r) {
        let d = (0, GXa.parseUri)(r["grpc.http_connect_target"]);
        if (d) {
          a = d;
        }
      }
      let l = (0, yXp.getDefaultAuthority)(a);
      let c = (0, GXa.splitHostPort)(l);
      let u = (o = c === null || c === undefined ? undefined : c.host) !== null && o !== undefined ? o : l;
      if (i.host = u, t.checkServerIdentity) {
        i.checkServerIdentity = t.checkServerIdentity;
      }
      if (t.rejectUnauthorized !== undefined) {
        i.rejectUnauthorized = t.rejectUnauthorized;
      }
      if (i.ALPNProtocols = ["h2"], r["grpc.ssl_target_name_override"]) {
        let d = r["grpc.ssl_target_name_override"];
        let p = (s = i.checkServerIdentity) !== null && s !== undefined ? s : z8t.checkServerIdentity;
        i.checkServerIdentity = (m, f) => p(d, f);
        i.servername = d;
      } else {
        i.servername = u;
      }
      if (r["grpc-node.tls_enable_trace"]) {
        i.enableTrace = true;
      }
      return i;
    }
    class zXa {
      constructor(e, t) {
        this.connectionOptions = e;
        this.callCredentials = t;
      }
      connect(e) {
        let t = Object.assign({
          socket: e
        }, this.connectionOptions);
        return new Promise((n, r) => {
          let o = (0, z8t.connect)(t, () => {
            var s;
            if (((s = this.connectionOptions.rejectUnauthorized) !== null && s !== undefined ? s : true) && !o.authorized) {
              r(o.authorizationError);
              return;
            }
            n({
              socket: o,
              secure: true
            });
          });
          o.on("error", s => {
            r(s);
          });
        });
      }
      waitForReady() {
        return Promise.resolve();
      }
      getCallCredentials() {
        return this.callCredentials;
      }
      destroy() {}
    }
    class hVn extends byt {
      constructor(e, t) {
        super();
        this.secureContext = e;
        this.verifyOptions = t;
      }
      _isSecure() {
        return true;
      }
      _equals(e) {
        if (this === e) {
          return true;
        }
        if (e instanceof hVn) {
          return this.secureContext === e.secureContext && this.verifyOptions.checkServerIdentity === e.verifyOptions.checkServerIdentity;
        } else {
          return false;
        }
      }
      _createSecureConnector(e, t, n) {
        let r = VXa(this.secureContext, this.verifyOptions, e, t);
        return new zXa(r, n !== null && n !== undefined ? n : yVn.CallCredentials.createEmpty());
      }
    }
    class V8t extends byt {
      constructor(e, t, n) {
        super();
        this.caCertificateProvider = e;
        this.identityCertificateProvider = t;
        this.verifyOptions = n;
        this.refcount = 0;
        this.latestCaUpdate = undefined;
        this.latestIdentityUpdate = undefined;
        this.caCertificateUpdateListener = this.handleCaCertificateUpdate.bind(this);
        this.identityCertificateUpdateListener = this.handleIdentityCertitificateUpdate.bind(this);
        this.secureContextWatchers = [];
      }
      _isSecure() {
        return true;
      }
      _equals(e) {
        var t;
        var n;
        if (this === e) {
          return true;
        }
        if (e instanceof V8t) {
          return this.caCertificateProvider === e.caCertificateProvider && this.identityCertificateProvider === e.identityCertificateProvider && ((t = this.verifyOptions) === null || t === undefined ? undefined : t.checkServerIdentity) === ((n = e.verifyOptions) === null || n === undefined ? undefined : n.checkServerIdentity);
        } else {
          return false;
        }
      }
      ref() {
        var e;
        if (this.refcount === 0) {
          this.caCertificateProvider.addCaCertificateListener(this.caCertificateUpdateListener);
          (e = this.identityCertificateProvider) === null || e === undefined || e.addIdentityCertificateListener(this.identityCertificateUpdateListener);
        }
        this.refcount += 1;
      }
      unref() {
        var e;
        if (this.refcount -= 1, this.refcount === 0) {
          this.caCertificateProvider.removeCaCertificateListener(this.caCertificateUpdateListener);
          (e = this.identityCertificateProvider) === null || e === undefined || e.removeIdentityCertificateListener(this.identityCertificateUpdateListener);
        }
      }
      _createSecureConnector(e, t, n) {
        this.ref();
        return new V8t.SecureConnectorImpl(this, e, t, n !== null && n !== undefined ? n : yVn.CallCredentials.createEmpty());
      }
      maybeUpdateWatchers() {
        if (this.hasReceivedUpdates()) {
          for (let e of this.secureContextWatchers) {
            e(this.getLatestSecureContext());
          }
          this.secureContextWatchers = [];
        }
      }
      handleCaCertificateUpdate(e) {
        this.latestCaUpdate = e;
        this.maybeUpdateWatchers();
      }
      handleIdentityCertitificateUpdate(e) {
        this.latestIdentityUpdate = e;
        this.maybeUpdateWatchers();
      }
      hasReceivedUpdates() {
        if (this.latestCaUpdate === undefined) {
          return false;
        }
        if (this.identityCertificateProvider && this.latestIdentityUpdate === undefined) {
          return false;
        }
        return true;
      }
      getSecureContext() {
        if (this.hasReceivedUpdates()) {
          return Promise.resolve(this.getLatestSecureContext());
        } else {
          return new Promise(e => {
            this.secureContextWatchers.push(e);
          });
        }
      }
      getLatestSecureContext() {
        var e;
        var t;
        if (!this.latestCaUpdate) {
          return null;
        }
        if (this.identityCertificateProvider !== null && !this.latestIdentityUpdate) {
          return null;
        }
        try {
          return (0, z8t.createSecureContext)({
            ca: this.latestCaUpdate.caCertificate,
            key: (e = this.latestIdentityUpdate) === null || e === undefined ? undefined : e.privateKey,
            cert: (t = this.latestIdentityUpdate) === null || t === undefined ? undefined : t.certificate,
            ciphers: lxo.CIPHER_SUITES
          });
        } catch (n) {
          (0, _Xp.log)(bXp.LogVerbosity.ERROR, "Failed to createSecureContext with error " + n.message);
          return null;
        }
      }
    }
    V8t.SecureConnectorImpl = class {
      constructor(e, t, n, r) {
        this.parent = e;
        this.channelTarget = t;
        this.options = n;
        this.callCredentials = r;
      }
      connect(e) {
        return new Promise((t, n) => {
          let r = this.parent.getLatestSecureContext();
          if (!r) {
            n(Error("Failed to load credentials"));
            return;
          }
          if (e.closed) {
            n(Error("Socket closed while loading credentials"));
          }
          let o = VXa(r, this.parent.verifyOptions, this.channelTarget, this.options);
          let s = Object.assign({
            socket: e
          }, o);
          let i = () => {
            n(Error("Socket closed"));
          };
          let a = c => {
            n(c);
          };
          let l = (0, z8t.connect)(s, () => {
            var c;
            if (l.removeListener("close", i), l.removeListener("error", a), ((c = this.parent.verifyOptions.rejectUnauthorized) !== null && c !== undefined ? c : true) && !l.authorized) {
              n(l.authorizationError);
              return;
            }
            t({
              socket: l,
              secure: true
            });
          });
          l.once("close", i);
          l.once("error", a);
        });
      }
      async waitForReady() {
        await this.parent.getSecureContext();
      }
      getCallCredentials() {
        return this.callCredentials;
      }
      destroy() {
        this.parent.unref();
      }
    };
    function SXp(e, t, n) {
      return new V8t(e, t, n !== null && n !== undefined ? n : {});
    }
    class gVn extends byt {
      constructor(e, t) {
        super();
        if (this.channelCredentials = e, this.callCredentials = t, !e._isSecure()) {
          throw Error("Cannot compose insecure credentials");
        }
      }
      compose(e) {
        let t = this.callCredentials.compose(e);
        return new gVn(this.channelCredentials, t);
      }
      _isSecure() {
        return true;
      }
      _equals(e) {
        if (this === e) {
          return true;
        }
        if (e instanceof gVn) {
          return this.channelCredentials._equals(e.channelCredentials) && this.callCredentials._equals(e.callCredentials);
        } else {
          return false;
        }
      }
      _createSecureConnector(e, t, n) {
        let r = this.callCredentials.compose(n !== null && n !== undefined ? n : yVn.CallCredentials.createEmpty());
        return this.channelCredentials._createSecureConnector(e, t, r);
      }
    }
  });
  var a1e = __commonJS(Xpe => {
    Object.defineProperty(Xpe, "__esModule", {
      value: true
    });
    Xpe.createChildChannelControlHelper = vXp;
    Xpe.registerLoadBalancerType = wXp;
    Xpe.registerDefaultLoadBalancerType = CXp;
    Xpe.createLoadBalancer = RXp;
    Xpe.isLoadBalancerNameRegistered = xXp;
    Xpe.parseLoadBalancingConfig = KXa;
    Xpe.getDefaultConfig = kXp;
    Xpe.selectLbConfigFromList = AXp;
    var TXp = Av();
    var EXp = th();
    function vXp(e, t) {
      var n;
      var r;
      var o;
      var s;
      var i;
      var a;
      var l;
      var c;
      var u;
      var d;
      return {
        createSubchannel: (r = (n = t.createSubchannel) === null || n === undefined ? undefined : n.bind(t)) !== null && r !== undefined ? r : e.createSubchannel.bind(e),
        updateState: (s = (o = t.updateState) === null || o === undefined ? undefined : o.bind(t)) !== null && s !== undefined ? s : e.updateState.bind(e),
        requestReresolution: (a = (i = t.requestReresolution) === null || i === undefined ? undefined : i.bind(t)) !== null && a !== undefined ? a : e.requestReresolution.bind(e),
        addChannelzChild: (c = (l = t.addChannelzChild) === null || l === undefined ? undefined : l.bind(t)) !== null && c !== undefined ? c : e.addChannelzChild.bind(e),
        removeChannelzChild: (d = (u = t.removeChannelzChild) === null || u === undefined ? undefined : u.bind(t)) !== null && d !== undefined ? d : e.removeChannelzChild.bind(e)
      };
    }
    var i1e = {};
    var Y8t = null;
    function wXp(e, t, n) {
      i1e[e] = {
        LoadBalancer: t,
        LoadBalancingConfig: n
      };
    }
    function CXp(e) {
      Y8t = e;
    }
    function RXp(e, t) {
      let n = e.getLoadBalancerName();
      if (n in i1e) {
        return new i1e[n].LoadBalancer(t);
      } else {
        return null;
      }
    }
    function xXp(e) {
      return e in i1e;
    }
    function KXa(e) {
      let t = Object.keys(e);
      if (t.length !== 1) {
        throw Error("Provided load balancing config has multiple conflicting entries");
      }
      let n = t[0];
      if (n in i1e) {
        try {
          return i1e[n].LoadBalancingConfig.createFromJson(e[n]);
        } catch (r) {
          throw Error(`${n}: ${r.message}`);
        }
      } else {
        throw Error(`Unrecognized load balancing config name ${n}`);
      }
    }
    function kXp() {
      if (!Y8t) {
        throw Error("No default load balancer type registered");
      }
      return new i1e[Y8t].LoadBalancingConfig();
    }
    function AXp(e, t = false) {
      for (let n of e) {
        try {
          return KXa(n);
        } catch (r) {
          (0, TXp.log)(EXp.LogVerbosity.DEBUG, "Config parsing failed with error", r.message);
          continue;
        }
      }
      if (t) {
        if (Y8t) {
          return new i1e[Y8t].LoadBalancingConfig();
        } else {
          return null;
        }
      } else {
        return null;
      }
    }
  });
  var uxo = __commonJS(J8t => {
    Object.defineProperty(J8t, "__esModule", {
      value: true
    });
    J8t.validateRetryThrottling = YXa;
    J8t.validateServiceConfig = JXa;
    J8t.extractAndSelectServiceConfig = BXp;
    var IXp = require("os");
    var _Vn = th();
    function OXp(e) {
      if ("service" in e && e.service !== "") {
        if (typeof e.service !== "string") {
          throw Error(`Invalid method config name: invalid service: expected type string, got ${typeof e.service}`);
        }
        if ("method" in e && e.method !== "") {
          if (typeof e.method !== "string") {
            throw Error(`Invalid method config name: invalid method: expected type string, got ${typeof e.service}`);
          }
          return {
            service: e.service,
            method: e.method
          };
        } else {
          return {
            service: e.service
          };
        }
      } else {
        if ("method" in e && e.method !== undefined) {
          throw Error("Invalid method config name: method set with empty or unset service");
        }
        return {};
      }
    }
    function DXp(e) {
      if (!("maxAttempts" in e) || !Number.isInteger(e.maxAttempts) || e.maxAttempts < 2) {
        throw Error("Invalid method config retry policy: maxAttempts must be an integer at least 2");
      }
      if (!("initialBackoff" in e) || typeof e.initialBackoff !== "string" || !(/^\d+(\.\d{1,9})?s$/).test(e.initialBackoff)) {
        throw Error("Invalid method config retry policy: initialBackoff must be a string consisting of a positive integer or decimal followed by s");
      }
      if (!("maxBackoff" in e) || typeof e.maxBackoff !== "string" || !(/^\d+(\.\d{1,9})?s$/).test(e.maxBackoff)) {
        throw Error("Invalid method config retry policy: maxBackoff must be a string consisting of a positive integer or decimal followed by s");
      }
      if (!("backoffMultiplier" in e) || typeof e.backoffMultiplier !== "number" || e.backoffMultiplier <= 0) {
        throw Error("Invalid method config retry policy: backoffMultiplier must be a number greater than 0");
      }
      if (!("retryableStatusCodes" in e && Array.isArray(e.retryableStatusCodes))) {
        throw Error("Invalid method config retry policy: retryableStatusCodes is required");
      }
      if (e.retryableStatusCodes.length === 0) {
        throw Error("Invalid method config retry policy: retryableStatusCodes must be non-empty");
      }
      for (let t of e.retryableStatusCodes) {
        if (typeof t === "number") {
          if (!Object.values(_Vn.Status).includes(t)) {
            throw Error("Invalid method config retry policy: retryableStatusCodes value not in status code range");
          }
        } else if (typeof t === "string") {
          if (!Object.values(_Vn.Status).includes(t.toUpperCase())) {
            throw Error("Invalid method config retry policy: retryableStatusCodes value not a status code name");
          }
        } else {
          throw Error("Invalid method config retry policy: retryableStatusCodes value must be a string or number");
        }
      }
      return {
        maxAttempts: e.maxAttempts,
        initialBackoff: e.initialBackoff,
        maxBackoff: e.maxBackoff,
        backoffMultiplier: e.backoffMultiplier,
        retryableStatusCodes: e.retryableStatusCodes
      };
    }
    function MXp(e) {
      if (!("maxAttempts" in e) || !Number.isInteger(e.maxAttempts) || e.maxAttempts < 2) {
        throw Error("Invalid method config hedging policy: maxAttempts must be an integer at least 2");
      }
      if ("hedgingDelay" in e && (typeof e.hedgingDelay !== "string" || !(/^\d+(\.\d{1,9})?s$/).test(e.hedgingDelay))) {
        throw Error("Invalid method config hedging policy: hedgingDelay must be a string consisting of a positive integer followed by s");
      }
      if ("nonFatalStatusCodes" in e && Array.isArray(e.nonFatalStatusCodes)) {
        for (let n of e.nonFatalStatusCodes) {
          if (typeof n === "number") {
            if (!Object.values(_Vn.Status).includes(n)) {
              throw Error("Invalid method config hedging policy: nonFatalStatusCodes value not in status code range");
            }
          } else if (typeof n === "string") {
            if (!Object.values(_Vn.Status).includes(n.toUpperCase())) {
              throw Error("Invalid method config hedging policy: nonFatalStatusCodes value not a status code name");
            }
          } else {
            throw Error("Invalid method config hedging policy: nonFatalStatusCodes value must be a string or number");
          }
        }
      }
      let t = {
        maxAttempts: e.maxAttempts
      };
      if (e.hedgingDelay) {
        t.hedgingDelay = e.hedgingDelay;
      }
      if (e.nonFatalStatusCodes) {
        t.nonFatalStatusCodes = e.nonFatalStatusCodes;
      }
      return t;
    }
    function NXp(e) {
      var t;
      let n = {
        name: []
      };
      if (!("name" in e) || !Array.isArray(e.name)) {
        throw Error("Invalid method config: invalid name array");
      }
      for (let r of e.name) {
        n.name.push(OXp(r));
      }
      if ("waitForReady" in e) {
        if (typeof e.waitForReady !== "boolean") {
          throw Error("Invalid method config: invalid waitForReady");
        }
        n.waitForReady = e.waitForReady;
      }
      if ("timeout" in e) {
        if (typeof e.timeout === "object") {
          if (!("seconds" in e.timeout) || typeof e.timeout.seconds !== "number") {
            throw Error("Invalid method config: invalid timeout.seconds");
          }
          if (!("nanos" in e.timeout) || typeof e.timeout.nanos !== "number") {
            throw Error("Invalid method config: invalid timeout.nanos");
          }
          n.timeout = e.timeout;
        } else if (typeof e.timeout === "string" && (/^\d+(\.\d{1,9})?s$/).test(e.timeout)) {
          let r = e.timeout.substring(0, e.timeout.length - 1).split(".");
          n.timeout = {
            seconds: r[0] | 0,
            nanos: ((t = r[1]) !== null && t !== undefined ? t : 0) | 0
          };
        } else {
          throw Error("Invalid method config: invalid timeout");
        }
      }
      if ("maxRequestBytes" in e) {
        if (typeof e.maxRequestBytes !== "number") {
          throw Error("Invalid method config: invalid maxRequestBytes");
        }
        n.maxRequestBytes = e.maxRequestBytes;
      }
      if ("maxResponseBytes" in e) {
        if (typeof e.maxResponseBytes !== "number") {
          throw Error("Invalid method config: invalid maxRequestBytes");
        }
        n.maxResponseBytes = e.maxResponseBytes;
      }
      if ("retryPolicy" in e) {
        if ("hedgingPolicy" in e) {
          throw Error("Invalid method config: retryPolicy and hedgingPolicy cannot both be specified");
        } else {
          n.retryPolicy = DXp(e.retryPolicy);
        }
      } else if ("hedgingPolicy" in e) {
        n.hedgingPolicy = MXp(e.hedgingPolicy);
      }
      return n;
    }
    function YXa(e) {
      if (!("maxTokens" in e) || typeof e.maxTokens !== "number" || e.maxTokens <= 0 || e.maxTokens > 1000) {
        throw Error("Invalid retryThrottling: maxTokens must be a number in (0, 1000]");
      }
      if (!("tokenRatio" in e) || typeof e.tokenRatio !== "number" || e.tokenRatio <= 0) {
        throw Error("Invalid retryThrottling: tokenRatio must be a number greater than 0");
      }
      return {
        maxTokens: +e.maxTokens.toFixed(3),
        tokenRatio: +e.tokenRatio.toFixed(3)
      };
    }
    function LXp(e) {
      if (!(typeof e === "object" && e !== null)) {
        throw Error(`Invalid loadBalancingConfig: unexpected type ${typeof e}`);
      }
      let t = Object.keys(e);
      if (t.length > 1) {
        throw Error(`Invalid loadBalancingConfig: unexpected multiple keys ${t}`);
      }
      if (t.length === 0) {
        throw Error("Invalid loadBalancingConfig: load balancing policy name required");
      }
      return {
        [t[0]]: e[t[0]]
      };
    }
    function JXa(e) {
      let t = {
        loadBalancingConfig: [],
        methodConfig: []
      };
      if ("loadBalancingPolicy" in e) {
        if (typeof e.loadBalancingPolicy === "string") {
          t.loadBalancingPolicy = e.loadBalancingPolicy;
        } else {
          throw Error("Invalid service config: invalid loadBalancingPolicy");
        }
      }
      if ("loadBalancingConfig" in e) {
        if (Array.isArray(e.loadBalancingConfig)) {
          for (let r of e.loadBalancingConfig) {
            t.loadBalancingConfig.push(LXp(r));
          }
        } else {
          throw Error("Invalid service config: invalid loadBalancingConfig");
        }
      }
      if ("methodConfig" in e) {
        if (Array.isArray(e.methodConfig)) {
          for (let r of e.methodConfig) {
            t.methodConfig.push(NXp(r));
          }
        }
      }
      if ("retryThrottling" in e) {
        t.retryThrottling = YXa(e.retryThrottling);
      }
      let n = [];
      for (let r of t.methodConfig) {
        for (let o of r.name) {
          for (let s of n) {
            if (o.service === s.service && o.method === s.method) {
              throw Error(`Invalid service config: duplicate name ${o.service}/${o.method}`);
            }
          }
          n.push(o);
        }
      }
      return t;
    }
    function FXp(e) {
      if (!("serviceConfig" in e)) {
        throw Error("Invalid service config choice: missing service config");
      }
      let t = {
        serviceConfig: JXa(e.serviceConfig)
      };
      if ("clientLanguage" in e) {
        if (Array.isArray(e.clientLanguage)) {
          t.clientLanguage = [];
          for (let r of e.clientLanguage) {
            if (typeof r === "string") {
              t.clientLanguage.push(r);
            } else {
              throw Error("Invalid service config choice: invalid clientLanguage");
            }
          }
        } else {
          throw Error("Invalid service config choice: invalid clientLanguage");
        }
      }
      if ("clientHostname" in e) {
        if (Array.isArray(e.clientHostname)) {
          t.clientHostname = [];
          for (let r of e.clientHostname) {
            if (typeof r === "string") {
              t.clientHostname.push(r);
            } else {
              throw Error("Invalid service config choice: invalid clientHostname");
            }
          }
        } else {
          throw Error("Invalid service config choice: invalid clientHostname");
        }
      }
      if ("percentage" in e) {
        if (typeof e.percentage === "number" && 0 <= e.percentage && e.percentage <= 100) {
          t.percentage = e.percentage;
        } else {
          throw Error("Invalid service config choice: invalid percentage");
        }
      }
      let n = ["clientLanguage", "percentage", "clientHostname", "serviceConfig"];
      for (let r in e) {
        if (!n.includes(r)) {
          throw Error(`Invalid service config choice: unexpected field ${r}`);
        }
      }
      return t;
    }
    function UXp(e, t) {
      if (!Array.isArray(e)) {
        throw Error("Invalid service config list");
      }
      for (let n of e) {
        let r = FXp(n);
        if (typeof r.percentage === "number" && t > r.percentage) {
          continue;
        }
        if (Array.isArray(r.clientHostname)) {
          let o = false;
          for (let s of r.clientHostname) {
            if (s === IXp.hostname()) {
              o = true;
            }
          }
          if (!o) {
            continue;
          }
        }
        if (Array.isArray(r.clientLanguage)) {
          let o = false;
          for (let s of r.clientLanguage) {
            if (s === "node") {
              o = true;
            }
          }
          if (!o) {
            continue;
          }
        }
        return r.serviceConfig;
      }
      throw Error("No matching service config found");
    }
    function BXp(e, t) {
      for (let n of e) {
        if (n.length > 0 && n[0].startsWith("grpc_config=")) {
          let r = n.join("").substring(12);
          let o = JSON.parse(r);
          return UXp(o, t);
        }
      }
      return null;
    }
  });
  var T3 = __commonJS(SVn => {
    Object.defineProperty(SVn, "__esModule", {
      value: true
    });
    SVn.ConnectivityState = undefined;
    var XXa;
    (function (e) {
      e[e.IDLE = 0] = "IDLE";
      e[e.CONNECTING = 1] = "CONNECTING";
      e[e.READY = 2] = "READY";
      e[e.TRANSIENT_FAILURE = 3] = "TRANSIENT_FAILURE";
      e[e.SHUTDOWN = 4] = "SHUTDOWN";
    })(XXa || (SVn.ConnectivityState = XXa = {}));
  });
  var YEe = __commonJS(l1e => {
    Object.defineProperty(l1e, "__esModule", {
      value: true
    });
    l1e.QueuePicker = l1e.UnavailablePicker = l1e.PickResultType = undefined;
    var $Xp = K1();
    var HXp = th();
    var TVn;
    (function (e) {
      e[e.COMPLETE = 0] = "COMPLETE";
      e[e.QUEUE = 1] = "QUEUE";
      e[e.TRANSIENT_FAILURE = 2] = "TRANSIENT_FAILURE";
      e[e.DROP = 3] = "DROP";
    })(TVn || (l1e.PickResultType = TVn = {}));
    class QXa {
      constructor(e) {
        this.status = Object.assign({
          code: HXp.Status.UNAVAILABLE,
          details: "No connection established",
          metadata: new $Xp.Metadata()
        }, e);
      }
      pick(e) {
        return {
          pickResultType: TVn.TRANSIENT_FAILURE,
          subchannel: null,
          status: this.status,
          onCallStarted: null,
          onCallEnded: null
        };
      }
    }
    l1e.UnavailablePicker = QXa;
    class ZXa {
      constructor(e, t) {
        this.loadBalancer = e;
        this.childPicker = t;
        this.calledExitIdle = false;
      }
      pick(e) {
        if (!this.calledExitIdle) {
          process.nextTick(() => {
            this.loadBalancer.exitIdle();
          });
          this.calledExitIdle = true;
        }
        if (this.childPicker) {
          return this.childPicker.pick(e);
        } else {
          return {
            pickResultType: TVn.QUEUE,
            subchannel: null,
            status: null,
            onCallStarted: null,
            onCallEnded: null
          };
        }
      }
    }
    l1e.QueuePicker = ZXa;
  });
  var Tyt = __commonJS(vVn => {
    Object.defineProperty(vVn, "__esModule", {
      value: true
    });
    vVn.BackoffTimeout = undefined;
    var jXp = th();
    var qXp = Av();
    function YXp(e, t) {
      return Math.random() * (t - e) + e;
    }
    class EVn {
      constructor(e, t) {
        if (this.callback = e, this.initialDelay = 1000, this.multiplier = 1.6, this.maxDelay = 120000, this.jitter = 0.2, this.running = false, this.hasRef = true, this.startTime = new Date(), this.endTime = new Date(), this.id = EVn.getNextId(), t) {
          if (t.initialDelay) {
            this.initialDelay = t.initialDelay;
          }
          if (t.multiplier) {
            this.multiplier = t.multiplier;
          }
          if (t.jitter) {
            this.jitter = t.jitter;
          }
          if (t.maxDelay) {
            this.maxDelay = t.maxDelay;
          }
        }
        this.trace("constructed initialDelay=" + this.initialDelay + " multiplier=" + this.multiplier + " jitter=" + this.jitter + " maxDelay=" + this.maxDelay);
        this.nextDelay = this.initialDelay;
        this.timerId = setTimeout(() => {}, 0);
        clearTimeout(this.timerId);
      }
      static getNextId() {
        return this.nextId++;
      }
      trace(e) {
        qXp.trace(jXp.LogVerbosity.DEBUG, "backoff", "{" + this.id + "} " + e);
      }
      runTimer(e) {
        var t;
        var n;
        if (this.trace("runTimer(delay=" + e + ")"), this.endTime = this.startTime, this.endTime.setMilliseconds(this.endTime.getMilliseconds() + e), clearTimeout(this.timerId), this.timerId = setTimeout(() => {
          this.trace("timer fired");
          this.running = false;
          this.callback();
        }, e), !this.hasRef) {
          (n = (t = this.timerId).unref) === null || n === undefined || n.call(t);
        }
      }
      runOnce() {
        this.trace("runOnce()");
        this.running = true;
        this.startTime = new Date();
        this.runTimer(this.nextDelay);
        let e = Math.min(this.nextDelay * this.multiplier, this.maxDelay);
        let t = e * this.jitter;
        this.nextDelay = e + YXp(-t, t);
      }
      stop() {
        this.trace("stop()");
        clearTimeout(this.timerId);
        this.running = false;
      }
      reset() {
        if (this.trace("reset() running=" + this.running), this.nextDelay = this.initialDelay, this.running) {
          let e = new Date();
          let t = this.startTime;
          if (t.setMilliseconds(t.getMilliseconds() + this.nextDelay), clearTimeout(this.timerId), e < t) {
            this.runTimer(t.getTime() - e.getTime());
          } else {
            this.running = false;
          }
        }
      }
      isRunning() {
        return this.running;
      }
      ref() {
        var e;
        var t;
        this.hasRef = true;
        (t = (e = this.timerId).ref) === null || t === undefined || t.call(e);
      }
      unref() {
        var e;
        var t;
        this.hasRef = false;
        (t = (e = this.timerId).unref) === null || t === undefined || t.call(e);
      }
      getEndTime() {
        return this.endTime;
      }
    }
    vVn.BackoffTimeout = EVn;
    EVn.nextId = 0;
  });
  var CVn = __commonJS(wVn => {
    Object.defineProperty(wVn, "__esModule", {
      value: true
    });
    wVn.ChildLoadBalancerHandler = undefined;
    var JXp = a1e();
    var XXp = T3();
    class eQa {
      constructor(e) {
        this.channelControlHelper = e;
        this.currentChild = null;
        this.pendingChild = null;
        this.latestConfig = null;
        this.ChildPolicyHelper = class {
          constructor(t) {
            this.parent = t;
            this.child = null;
          }
          createSubchannel(t, n) {
            return this.parent.channelControlHelper.createSubchannel(t, n);
          }
          updateState(t, n, r) {
            var o;
            if (this.calledByPendingChild()) {
              if (t === XXp.ConnectivityState.CONNECTING) {
                return;
              }
              (o = this.parent.currentChild) === null || o === undefined || o.destroy();
              this.parent.currentChild = this.parent.pendingChild;
              this.parent.pendingChild = null;
            } else if (!this.calledByCurrentChild()) {
              return;
            }
            this.parent.channelControlHelper.updateState(t, n, r);
          }
          requestReresolution() {
            var t;
            let n = (t = this.parent.pendingChild) !== null && t !== undefined ? t : this.parent.currentChild;
            if (this.child === n) {
              this.parent.channelControlHelper.requestReresolution();
            }
          }
          setChild(t) {
            this.child = t;
          }
          addChannelzChild(t) {
            this.parent.channelControlHelper.addChannelzChild(t);
          }
          removeChannelzChild(t) {
            this.parent.channelControlHelper.removeChannelzChild(t);
          }
          calledByPendingChild() {
            return this.child === this.parent.pendingChild;
          }
          calledByCurrentChild() {
            return this.child === this.parent.currentChild;
          }
        };
      }
      configUpdateRequiresNewPolicyInstance(e, t) {
        return e.getLoadBalancerName() !== t.getLoadBalancerName();
      }
      updateAddressList(e, t, n, r) {
        let o;
        if (this.currentChild === null || this.latestConfig === null || this.configUpdateRequiresNewPolicyInstance(this.latestConfig, t)) {
          let s = new this.ChildPolicyHelper(this);
          let i = (0, JXp.createLoadBalancer)(t, s);
          if (s.setChild(i), this.currentChild === null) {
            this.currentChild = i;
            o = this.currentChild;
          } else {
            if (this.pendingChild) {
              this.pendingChild.destroy();
            }
            this.pendingChild = i;
            o = this.pendingChild;
          }
        } else if (this.pendingChild === null) {
          o = this.currentChild;
        } else {
          o = this.pendingChild;
        }
        this.latestConfig = t;
        return o.updateAddressList(e, t, n, r);
      }
      exitIdle() {
        if (this.currentChild) {
          if (this.currentChild.exitIdle(), this.pendingChild) {
            this.pendingChild.exitIdle();
          }
        }
      }
      resetBackoff() {
        if (this.currentChild) {
          if (this.currentChild.resetBackoff(), this.pendingChild) {
            this.pendingChild.resetBackoff();
          }
        }
      }
      destroy() {
        if (this.currentChild) {
          this.currentChild.destroy();
          this.currentChild = null;
        }
        if (this.pendingChild) {
          this.pendingChild.destroy();
          this.pendingChild = null;
        }
      }
      getTypeName() {
        return "child_load_balancer_helper";
      }
    }
    wVn.ChildLoadBalancerHandler = eQa;
  });
  var oQa = __commonJS(RVn => {
    Object.defineProperty(RVn, "__esModule", {
      value: true
    });
    RVn.ResolvingLoadBalancer = undefined;
    var ZXp = a1e();
    var eQp = uxo();
    var N9 = T3();
    var tQa = tse();
    var X8t = YEe();
    var tQp = Tyt();
    var dxo = th();
    var nQp = K1();
    var rQp = Av();
    var oQp = th();
    var sQp = S3();
    var iQp = CVn();
    function nQa(e) {
      rQp.trace(oQp.LogVerbosity.DEBUG, "resolving_load_balancer", e);
    }
    var lQp = ["SERVICE_AND_METHOD", "SERVICE", "EMPTY"];
    function cQp(e, t, n, r) {
      for (let o of n.name) {
        switch (r) {
          case "EMPTY":
            if (!o.service && !o.method) {
              return true;
            }
            break;
          case "SERVICE":
            if (o.service === e && !o.method) {
              return true;
            }
            break;
          case "SERVICE_AND_METHOD":
            if (o.service === e && o.method === t) {
              return true;
            }
        }
      }
      return false;
    }
    function uQp(e, t, n, r) {
      for (let o of n) {
        if (cQp(e, t, o, r)) {
          return o;
        }
      }
      return null;
    }
    function dQp(e) {
      return {
        invoke(t, n) {
          var r;
          var o;
          let s = t.split("/").filter(l => l.length > 0);
          let i = (r = s[0]) !== null && r !== undefined ? r : "";
          let a = (o = s[1]) !== null && o !== undefined ? o : "";
          if (e && e.methodConfig) {
            for (let l of lQp) {
              let c = uQp(i, a, e.methodConfig, l);
              if (c) {
                return {
                  methodConfig: c,
                  pickInformation: {},
                  status: dxo.Status.OK,
                  dynamicFilterFactories: []
                };
              }
            }
          }
          return {
            methodConfig: {
              name: []
            },
            pickInformation: {},
            status: dxo.Status.OK,
            dynamicFilterFactories: []
          };
        },
        unref() {}
      };
    }
    class rQa {
      constructor(e, t, n, r, o) {
        if (this.target = e, this.channelControlHelper = t, this.channelOptions = n, this.onSuccessfulResolution = r, this.onFailedResolution = o, this.latestChildState = N9.ConnectivityState.IDLE, this.latestChildPicker = new X8t.QueuePicker(this), this.latestChildErrorMessage = null, this.currentState = N9.ConnectivityState.IDLE, this.previousServiceConfig = null, this.continueResolving = false, n["grpc.service_config"]) {
          this.defaultServiceConfig = (0, eQp.validateServiceConfig)(JSON.parse(n["grpc.service_config"]));
        } else {
          this.defaultServiceConfig = {
            loadBalancingConfig: [],
            methodConfig: []
          };
        }
        this.updateState(N9.ConnectivityState.IDLE, new X8t.QueuePicker(this), null);
        this.childLoadBalancer = new iQp.ChildLoadBalancerHandler({
          createSubchannel: t.createSubchannel.bind(t),
          requestReresolution: () => {
            if (this.backoffTimeout.isRunning()) {
              nQa("requestReresolution delayed by backoff timer until " + this.backoffTimeout.getEndTime().toISOString());
              this.continueResolving = true;
            } else {
              this.updateResolution();
            }
          },
          updateState: (i, a, l) => {
            this.latestChildState = i;
            this.latestChildPicker = a;
            this.latestChildErrorMessage = l;
            this.updateState(i, a, l);
          },
          addChannelzChild: t.addChannelzChild.bind(t),
          removeChannelzChild: t.removeChannelzChild.bind(t)
        });
        this.innerResolver = (0, tQa.createResolver)(e, this.handleResolverResult.bind(this), n);
        let s = {
          initialDelay: n["grpc.initial_reconnect_backoff_ms"],
          maxDelay: n["grpc.max_reconnect_backoff_ms"]
        };
        this.backoffTimeout = new tQp.BackoffTimeout(() => {
          if (this.continueResolving) {
            this.updateResolution();
            this.continueResolving = false;
          } else {
            this.updateState(this.latestChildState, this.latestChildPicker, this.latestChildErrorMessage);
          }
        }, s);
        this.backoffTimeout.unref();
      }
      handleResolverResult(e, t, n, r) {
        var o;
        var s;
        this.backoffTimeout.stop();
        this.backoffTimeout.reset();
        let i = true;
        let a = null;
        if (n === null) {
          a = this.defaultServiceConfig;
        } else if (n.ok) {
          a = n.value;
        } else if (this.previousServiceConfig !== null) {
          a = this.previousServiceConfig;
        } else {
          i = false;
          this.handleResolutionFailure(n.error);
        }
        if (a !== null) {
          let l = (o = a === null || a === undefined ? undefined : a.loadBalancingConfig) !== null && o !== undefined ? o : [];
          let c = (0, ZXp.selectLbConfigFromList)(l, true);
          if (c === null) {
            i = false;
            this.handleResolutionFailure({
              code: dxo.Status.UNAVAILABLE,
              details: "All load balancer options in service config are not compatible",
              metadata: new nQp.Metadata()
            });
          } else {
            i = this.childLoadBalancer.updateAddressList(e, c, Object.assign(Object.assign({}, this.channelOptions), t), r);
          }
        }
        if (i) {
          this.onSuccessfulResolution(a, (s = t[tQa.CHANNEL_ARGS_CONFIG_SELECTOR_KEY]) !== null && s !== undefined ? s : dQp(a));
        }
        return i;
      }
      updateResolution() {
        if (this.innerResolver.updateResolution(), this.currentState === N9.ConnectivityState.IDLE) {
          this.updateState(N9.ConnectivityState.CONNECTING, this.latestChildPicker, this.latestChildErrorMessage);
        }
        this.backoffTimeout.runOnce();
      }
      updateState(e, t, n) {
        if (nQa((0, sQp.uriToString)(this.target) + " " + N9.ConnectivityState[this.currentState] + " -> " + N9.ConnectivityState[e]), e === N9.ConnectivityState.IDLE) {
          t = new X8t.QueuePicker(this, t);
        }
        this.currentState = e;
        this.channelControlHelper.updateState(e, t, n);
      }
      handleResolutionFailure(e) {
        if (this.latestChildState === N9.ConnectivityState.IDLE) {
          this.updateState(N9.ConnectivityState.TRANSIENT_FAILURE, new X8t.UnavailablePicker(e), e.details);
          this.onFailedResolution(e);
        }
      }
      exitIdle() {
        if (this.currentState === N9.ConnectivityState.IDLE || this.currentState === N9.ConnectivityState.TRANSIENT_FAILURE) {
          if (this.backoffTimeout.isRunning()) {
            this.continueResolving = true;
          } else {
            this.updateResolution();
          }
        }
        this.childLoadBalancer.exitIdle();
      }
      updateAddressList(e, t) {
        throw Error("updateAddressList not supported on ResolvingLoadBalancer");
      }
      resetBackoff() {
        this.backoffTimeout.reset();
        this.childLoadBalancer.resetBackoff();
      }
      destroy() {
        this.childLoadBalancer.destroy();
        this.innerResolver.destroy();
        this.backoffTimeout.reset();
        this.backoffTimeout.stop();
        this.latestChildState = N9.ConnectivityState.IDLE;
        this.latestChildPicker = new X8t.QueuePicker(this);
        this.currentState = N9.ConnectivityState.IDLE;
        this.previousServiceConfig = null;
        this.continueResolving = false;
      }
      getTypeName() {
        return "resolving_load_balancer";
      }
    }
    RVn.ResolvingLoadBalancer = rQa;
  });
  var sQa = __commonJS(Q8t => {
    Object.defineProperty(Q8t, "__esModule", {
      value: true
    });
    Q8t.recognizedOptions = undefined;
    Q8t.channelOptionsEqual = pQp;
    Q8t.recognizedOptions = {
      "grpc.ssl_target_name_override": true,
      "grpc.primary_user_agent": true,
      "grpc.secondary_user_agent": true,
      "grpc.default_authority": true,
      "grpc.keepalive_time_ms": true,
      "grpc.keepalive_timeout_ms": true,
      "grpc.keepalive_permit_without_calls": true,
      "grpc.service_config": true,
      "grpc.max_concurrent_streams": true,
      "grpc.initial_reconnect_backoff_ms": true,
      "grpc.max_reconnect_backoff_ms": true,
      "grpc.use_local_subchannel_pool": true,
      "grpc.max_send_message_length": true,
      "grpc.max_receive_message_length": true,
      "grpc.enable_http_proxy": true,
      "grpc.enable_channelz": true,
      "grpc.dns_min_time_between_resolutions_ms": true,
      "grpc.enable_retries": true,
      "grpc.per_rpc_retry_buffer_size": true,
      "grpc.retry_buffer_size": true,
      "grpc.max_connection_age_ms": true,
      "grpc.max_connection_age_grace_ms": true,
      "grpc-node.max_session_memory": true,
      "grpc.service_config_disable_resolution": true,
      "grpc.client_idle_timeout_ms": true,
      "grpc-node.tls_enable_trace": true,
      "grpc.lb.ring_hash.ring_size_cap": true,
      "grpc-node.retry_max_attempts_limit": true,
      "grpc-node.flow_control_window": true,
      "grpc.server_call_metric_recording": true
    };
    function pQp(e, t) {
      let n = Object.keys(e).sort();
      let r = Object.keys(t).sort();
      if (n.length !== r.length) {
        return false;
      }
      for (let o = 0; o < n.length; o += 1) {
        if (n[o] !== r[o]) {
          return false;
        }
        if (e[n[o]] !== t[r[o]]) {
          return false;
        }
      }
      return true;
    }
  });
  var L9 = __commonJS(nse => {
    Object.defineProperty(nse, "__esModule", {
      value: true
    });
    nse.EndpointMap = undefined;
    nse.isTcpSubchannelAddress = eVt;
    nse.subchannelAddressEqual = xVn;
    nse.subchannelAddressToString = aQa;
    nse.stringToSubchannelAddress = fQp;
    nse.endpointEqual = hQp;
    nse.endpointToString = gQp;
    nse.endpointHasAddress = lQa;
    var iQa = require("net");
    function eVt(e) {
      return "port" in e;
    }
    function xVn(e, t) {
      if (!e && !t) {
        return true;
      }
      if (!e || !t) {
        return false;
      }
      if (eVt(e)) {
        return eVt(t) && e.host === t.host && e.port === t.port;
      } else {
        return !eVt(t) && e.path === t.path;
      }
    }
    function aQa(e) {
      if (eVt(e)) {
        if ((0, iQa.isIPv6)(e.host)) {
          return "[" + e.host + "]:" + e.port;
        } else {
          return e.host + ":" + e.port;
        }
      } else {
        return e.path;
      }
    }
    function fQp(e, t) {
      if ((0, iQa.isIP)(e)) {
        return {
          host: e,
          port: t !== null && t !== undefined ? t : 443
        };
      } else {
        return {
          path: e
        };
      }
    }
    function hQp(e, t) {
      if (e.addresses.length !== t.addresses.length) {
        return false;
      }
      for (let n = 0; n < e.addresses.length; n++) {
        if (!xVn(e.addresses[n], t.addresses[n])) {
          return false;
        }
      }
      return true;
    }
    function gQp(e) {
      return "[" + e.addresses.map(aQa).join(", ") + "]";
    }
    function lQa(e, t) {
      for (let n of e.addresses) {
        if (xVn(n, t)) {
          return true;
        }
      }
      return false;
    }
    function Z8t(e, t) {
      if (e.addresses.length !== t.addresses.length) {
        return false;
      }
      for (let n of e.addresses) {
        let r = false;
        for (let o of t.addresses) {
          if (xVn(n, o)) {
            r = true;
            break;
          }
        }
        if (!r) {
          return false;
        }
      }
      return true;
    }
    class cQa {
      constructor() {
        this.map = new Set();
      }
      get size() {
        return this.map.size;
      }
      getForSubchannelAddress(e) {
        for (let t of this.map) {
          if (lQa(t.key, e)) {
            return t.value;
          }
        }
        return;
      }
      deleteMissing(e) {
        let t = [];
        for (let n of this.map) {
          let r = false;
          for (let o of e) {
            if (Z8t(o, n.key)) {
              r = true;
            }
          }
          if (!r) {
            t.push(n.value);
            this.map.delete(n);
          }
        }
        return t;
      }
      get(e) {
        for (let t of this.map) {
          if (Z8t(e, t.key)) {
            return t.value;
          }
        }
        return;
      }
      set(e, t) {
        for (let n of this.map) {
          if (Z8t(e, n.key)) {
            n.value = t;
            return;
          }
        }
        this.map.add({
          key: e,
          value: t
        });
      }
      delete(e) {
        for (let t of this.map) {
          if (Z8t(e, t.key)) {
            this.map.delete(t);
            return;
          }
        }
      }
      vZc(e) {
        for (let t of this.map) {
          if (Z8t(e, t.key)) {
            return true;
          }
        }
        return false;
      }
      clear() {
        this.map.clear();
      }
      *keys() {
        for (let e of this.map) {
          yield e.key;
        }
      }
      *values() {
        for (let e of this.map) {
          yield e.value;
        }
      }
      *entries() {
        for (let e of this.map) {
          yield [e.key, e.value];
        }
      }
    }
    nse.EndpointMap = cQa;
  });
  var yQa = __commonJS(mxo => {
    Object.defineProperty(mxo, "t", {
      value: true
    });
    class pxo {
      constructor(e, t, n = 1) {
        this.i = undefined;
        this.h = undefined;
        this.o = undefined;
        this.u = e;
        this.l = t;
        this.p = n;
      }
      I() {
        let e = this;
        let t = e.o.o === e;
        if (t && e.p === 1) {
          e = e.h;
        } else if (e.i) {
          e = e.i;
          while (e.h) {
            e = e.h;
          }
        } else {
          if (t) {
            return e.o;
          }
          let n = e.o;
          while (n.i === e) {
            e = n;
            n = e.o;
          }
          e = n;
        }
        return e;
      }
      B() {
        let e = this;
        if (e.h) {
          e = e.h;
          while (e.i) {
            e = e.i;
          }
          return e;
        } else {
          let t = e.o;
          while (t.h === e) {
            e = t;
            t = e.o;
          }
          if (e.h !== t) {
            return t;
          } else {
            return e;
          }
        }
      }
      _() {
        let e = this.o;
        let t = this.h;
        let n = t.i;
        if (e.o === this) {
          e.o = t;
        } else if (e.i === this) {
          e.i = t;
        } else {
          e.h = t;
        }
        if (t.o = e, t.i = this, this.o = t, this.h = n, n) {
          n.o = this;
        }
        return t;
      }
      g() {
        let e = this.o;
        let t = this.i;
        let n = t.h;
        if (e.o === this) {
          e.o = t;
        } else if (e.i === this) {
          e.i = t;
        } else {
          e.h = t;
        }
        if (t.o = e, t.h = this, this.o = t, this.i = n, n) {
          n.o = this;
        }
        return t;
      }
    }
    class uQa extends pxo {
      constructor() {
        super(...arguments);
        this.M = 1;
      }
      _() {
        let e = super._();
        this.O();
        e.O();
        return e;
      }
      g() {
        let e = super.g();
        this.O();
        e.O();
        return e;
      }
      O() {
        if (this.M = 1, this.i) {
          this.M += this.i.M;
        }
        if (this.h) {
          this.M += this.h.M;
        }
      }
    }
    class dQa {
      constructor(e = 0) {
        this.iteratorType = e;
      }
      equals(e) {
        return this.T === e.T;
      }
    }
    class pQa {
      constructor() {
        this.m = 0;
      }
      get length() {
        return this.m;
      }
      size() {
        return this.m;
      }
      empty() {
        return this.m === 0;
      }
    }
    class mQa extends pQa {}
    function dVe() {
      throw RangeError("Iterator access denied!");
    }
    class fQa extends mQa {
      constructor(e = function (n, r) {
        if (n < r) {
          return -1;
        }
        if (n > r) {
          return 1;
        }
        return 0;
      }, t = false) {
        super();
        this.v = undefined;
        this.A = e;
        this.enableIndex = t;
        this.N = t ? uQa : pxo;
        this.C = new this.N();
      }
      R(e, t) {
        let n = this.C;
        while (e) {
          let r = this.A(e.u, t);
          if (r < 0) {
            e = e.h;
          } else if (r > 0) {
            n = e;
            e = e.i;
          } else {
            return e;
          }
        }
        return n;
      }
      K(e, t) {
        let n = this.C;
        while (e) {
          if (this.A(e.u, t) <= 0) {
            e = e.h;
          } else {
            n = e;
            e = e.i;
          }
        }
        return n;
      }
      L(e, t) {
        let n = this.C;
        while (e) {
          let r = this.A(e.u, t);
          if (r < 0) {
            n = e;
            e = e.h;
          } else if (r > 0) {
            e = e.i;
          } else {
            return e;
          }
        }
        return n;
      }
      k(e, t) {
        let n = this.C;
        while (e) {
          if (this.A(e.u, t) < 0) {
            n = e;
            e = e.h;
          } else {
            e = e.i;
          }
        }
        return n;
      }
      P(e) {
        while (true) {
          let t = e.o;
          if (t === this.C) {
            return;
          }
          if (e.p === 1) {
            e.p = 0;
            return;
          }
          if (e === t.i) {
            let n = t.h;
            if (n.p === 1) {
              if (n.p = 0, t.p = 1, t === this.v) {
                this.v = t._();
              } else {
                t._();
              }
            } else if (n.h && n.h.p === 1) {
              if (n.p = t.p, t.p = 0, n.h.p = 0, t === this.v) {
                this.v = t._();
              } else {
                t._();
              }
              return;
            } else if (n.i && n.i.p === 1) {
              n.p = 1;
              n.i.p = 0;
              n.g();
            } else {
              n.p = 1;
              e = t;
            }
          } else {
            let n = t.i;
            if (n.p === 1) {
              if (n.p = 0, t.p = 1, t === this.v) {
                this.v = t.g();
              } else {
                t.g();
              }
            } else if (n.i && n.i.p === 1) {
              if (n.p = t.p, t.p = 0, n.i.p = 0, t === this.v) {
                this.v = t.g();
              } else {
                t.g();
              }
              return;
            } else if (n.h && n.h.p === 1) {
              n.p = 1;
              n.h.p = 0;
              n._();
            } else {
              n.p = 1;
              e = t;
            }
          }
        }
      }
      S(e) {
        if (this.m === 1) {
          this.clear();
          return;
        }
        let t = e;
        while (t.i || t.h) {
          if (t.h) {
            t = t.h;
            while (t.i) {
              t = t.i;
            }
          } else {
            t = t.i;
          }
          let r = e.u;
          e.u = t.u;
          t.u = r;
          let o = e.l;
          e.l = t.l;
          t.l = o;
          e = t;
        }
        if (this.C.i === t) {
          this.C.i = t.o;
        } else if (this.C.h === t) {
          this.C.h = t.o;
        }
        this.P(t);
        let n = t.o;
        if (t === n.i) {
          n.i = undefined;
        } else {
          n.h = undefined;
        }
        if (this.m -= 1, this.v.p = 0, this.enableIndex) {
          while (n !== this.C) {
            n.M -= 1;
            n = n.o;
          }
        }
      }
      U(e) {
        let t = typeof e === "number" ? e : undefined;
        let n = typeof e === "function" ? e : undefined;
        let r = typeof e > "u" ? [] : undefined;
        let o = 0;
        let s = this.v;
        let i = [];
        while (i.length || s) {
          if (s) {
            i.push(s);
            s = s.i;
          } else {
            if (s = i.pop(), o === t) {
              return s;
            }
            r && r.push(s);
            n && n(s, o, this);
            o += 1;
            s = s.h;
          }
        }
        return r;
      }
      j(e) {
        while (true) {
          let t = e.o;
          if (t.p === 0) {
            return;
          }
          let n = t.o;
          if (t === n.i) {
            let r = n.h;
            if (r && r.p === 1) {
              if (r.p = t.p = 0, n === this.v) {
                return;
              }
              n.p = 1;
              e = n;
              continue;
            } else if (e === t.h) {
              if (e.p = 0, e.i) {
                e.i.o = t;
              }
              if (e.h) {
                e.h.o = n;
              }
              if (t.h = e.i, n.i = e.h, e.i = t, e.h = n, n === this.v) {
                this.v = e;
                this.C.o = e;
              } else {
                let o = n.o;
                if (o.i === n) {
                  o.i = e;
                } else {
                  o.h = e;
                }
              }
              e.o = n.o;
              t.o = e;
              n.o = e;
              n.p = 1;
            } else {
              if (t.p = 0, n === this.v) {
                this.v = n.g();
              } else {
                n.g();
              }
              n.p = 1;
              return;
            }
          } else {
            let r = n.i;
            if (r && r.p === 1) {
              if (r.p = t.p = 0, n === this.v) {
                return;
              }
              n.p = 1;
              e = n;
              continue;
            } else if (e === t.i) {
              if (e.p = 0, e.i) {
                e.i.o = n;
              }
              if (e.h) {
                e.h.o = t;
              }
              if (n.h = e.i, t.i = e.h, e.i = n, e.h = t, n === this.v) {
                this.v = e;
                this.C.o = e;
              } else {
                let o = n.o;
                if (o.i === n) {
                  o.i = e;
                } else {
                  o.h = e;
                }
              }
              e.o = n.o;
              t.o = e;
              n.o = e;
              n.p = 1;
            } else {
              if (t.p = 0, n === this.v) {
                this.v = n._();
              } else {
                n._();
              }
              n.p = 1;
              return;
            }
          }
          if (this.enableIndex) {
            t.O();
            n.O();
            e.O();
          }
          return;
        }
      }
      q(e, t, n) {
        if (this.v === undefined) {
          this.m += 1;
          this.v = new this.N(e, t, 0);
          this.v.o = this.C;
          this.C.o = this.C.i = this.C.h = this.v;
          return this.m;
        }
        let r;
        let o = this.C.i;
        let s = this.A(o.u, e);
        if (s === 0) {
          o.l = t;
          return this.m;
        } else if (s > 0) {
          o.i = new this.N(e, t);
          o.i.o = o;
          r = o.i;
          this.C.i = r;
        } else {
          let i = this.C.h;
          let a = this.A(i.u, e);
          if (a === 0) {
            i.l = t;
            return this.m;
          } else if (a < 0) {
            i.h = new this.N(e, t);
            i.h.o = i;
            r = i.h;
            this.C.h = r;
          } else {
            if (n !== undefined) {
              let l = n.T;
              if (l !== this.C) {
                let c = this.A(l.u, e);
                if (c === 0) {
                  l.l = t;
                  return this.m;
                } else if (c > 0) {
                  let u = l.I();
                  let d = this.A(u.u, e);
                  if (d === 0) {
                    u.l = t;
                    return this.m;
                  } else if (d < 0) {
                    if (r = new this.N(e, t), u.h === undefined) {
                      u.h = r;
                      r.o = u;
                    } else {
                      l.i = r;
                      r.o = l;
                    }
                  }
                }
              }
            }
            if (r === undefined) {
              r = this.v;
              while (true) {
                let l = this.A(r.u, e);
                if (l > 0) {
                  if (r.i === undefined) {
                    r.i = new this.N(e, t);
                    r.i.o = r;
                    r = r.i;
                    break;
                  }
                  r = r.i;
                } else if (l < 0) {
                  if (r.h === undefined) {
                    r.h = new this.N(e, t);
                    r.h.o = r;
                    r = r.h;
                    break;
                  }
                  r = r.h;
                } else {
                  r.l = t;
                  return this.m;
                }
              }
            }
          }
        }
        if (this.enableIndex) {
          let i = r.o;
          while (i !== this.C) {
            i.M += 1;
            i = i.o;
          }
        }
        this.j(r);
        this.m += 1;
        return this.m;
      }
      H(e, t) {
        while (e) {
          let n = this.A(e.u, t);
          if (n < 0) {
            e = e.h;
          } else if (n > 0) {
            e = e.i;
          } else {
            return e;
          }
        }
        return e || this.C;
      }
      clear() {
        this.m = 0;
        this.v = undefined;
        this.C.o = undefined;
        this.C.i = this.C.h = undefined;
      }
      updateKeyByIterator(e, t) {
        let n = e.T;
        if (n === this.C) {
          dVe();
        }
        if (this.m === 1) {
          n.u = t;
          return true;
        }
        let r = n.B().u;
        if (n === this.C.i) {
          if (this.A(r, t) > 0) {
            n.u = t;
            return true;
          }
          return false;
        }
        let o = n.I().u;
        if (n === this.C.h) {
          if (this.A(o, t) < 0) {
            n.u = t;
            return true;
          }
          return false;
        }
        if (this.A(o, t) >= 0 || this.A(r, t) <= 0) {
          return false;
        }
        n.u = t;
        return true;
      }
      eraseElementByPos(e) {
        if (e < 0 || e > this.m - 1) {
          throw RangeError();
        }
        let t = this.U(e);
        this.S(t);
        return this.m;
      }
      eraseElementByKey(e) {
        if (this.m === 0) {
          return false;
        }
        let t = this.H(this.v, e);
        if (t === this.C) {
          return false;
        }
        this.S(t);
        return true;
      }
      eraseElementByIterator(e) {
        let t = e.T;
        if (t === this.C) {
          dVe();
        }
        let n = t.h === undefined;
        if (e.iteratorType === 0) {
          if (n) {
            e.next();
          }
        } else if (!n || t.i === undefined) {
          e.next();
        }
        this.S(t);
        return e;
      }
      getHeight() {
        if (this.m === 0) {
          return 0;
        }
        function e(t) {
          if (!t) {
            return 0;
          }
          return Math.max(e(t.i), e(t.h)) + 1;
        }
        return e(this.v);
      }
    }
    class hQa extends dQa {
      constructor(e, t, n) {
        super(n);
        if (this.T = e, this.C = t, this.iteratorType === 0) {
          this.pre = function () {
            if (this.T === this.C.i) {
              dVe();
            }
            this.T = this.T.I();
            return this;
          };
          this.next = function () {
            if (this.T === this.C) {
              dVe();
            }
            this.T = this.T.B();
            return this;
          };
        } else {
          this.pre = function () {
            if (this.T === this.C.h) {
              dVe();
            }
            this.T = this.T.B();
            return this;
          };
          this.next = function () {
            if (this.T === this.C) {
              dVe();
            }
            this.T = this.T.I();
            return this;
          };
        }
      }
      get index() {
        let e = this.T;
        let t = this.C.o;
        if (e === this.C) {
          if (t) {
            return t.M - 1;
          }
          return 0;
        }
        let n = 0;
        if (e.i) {
          n += e.i.M;
        }
        while (e !== t) {
          let r = e.o;
          if (e === r.h) {
            if (n += 1, r.i) {
              n += r.i.M;
            }
          }
          e = r;
        }
        return n;
      }
      isAccessible() {
        return this.T !== this.C;
      }
    }
    class rse extends hQa {
      constructor(e, t, n, r) {
        super(e, t, r);
        this.container = n;
      }
      get pointer() {
        if (this.T === this.C) {
          dVe();
        }
        let e = this;
        return new Proxy([], {
          get(t, n) {
            if (n === "0") {
              return e.T.u;
            } else if (n === "1") {
              return e.T.l;
            }
            t[0] = e.T.u;
            t[1] = e.T.l;
            return t[n];
          },
          set(t, n, r) {
            if (n !== "1") {
              throw TypeError("prop must be 1");
            }
            e.T.l = r;
            return true;
          }
        });
      }
      copy() {
        return new rse(this.T, this.C, this.container, this.iteratorType);
      }
    }
    class gQa extends fQa {
      constructor(e = [], t, n) {
        super(t, n);
        let r = this;
        e.forEach(function (o) {
          r.setElement(o[0], o[1]);
        });
      }
      begin() {
        return new rse(this.C.i || this.C, this.C, this);
      }
      end() {
        return new rse(this.C, this.C, this);
      }
      rBegin() {
        return new rse(this.C.h || this.C, this.C, this, 1);
      }
      rEnd() {
        return new rse(this.C, this.C, this, 1);
      }
      front() {
        if (this.m === 0) {
          return;
        }
        let e = this.C.i;
        return [e.u, e.l];
      }
      back() {
        if (this.m === 0) {
          return;
        }
        let e = this.C.h;
        return [e.u, e.l];
      }
      lowerBound(e) {
        let t = this.R(this.v, e);
        return new rse(t, this.C, this);
      }
      upperBound(e) {
        let t = this.K(this.v, e);
        return new rse(t, this.C, this);
      }
      reverseLowerBound(e) {
        let t = this.L(this.v, e);
        return new rse(t, this.C, this);
      }
      reverseUpperBound(e) {
        let t = this.k(this.v, e);
        return new rse(t, this.C, this);
      }
      forEach(e) {
        this.U(function (t, n, r) {
          e([t.u, t.l], n, r);
        });
      }
      setElement(e, t, n) {
        return this.q(e, t, n);
      }
      getElementByPos(e) {
        if (e < 0 || e > this.m - 1) {
          throw RangeError();
        }
        let t = this.U(e);
        return [t.u, t.l];
      }
      find(e) {
        let t = this.H(this.v, e);
        return new rse(t, this.C, this);
      }
      getElementByKey(e) {
        return this.H(this.v, e).l;
      }
      union(e) {
        let t = this;
        e.forEach(function (n) {
          t.setElement(n[0], n[1]);
        });
        return this.m;
      }
      *[Symbol.iterator]() {
        let e = this.m;
        let t = this.U();
        for (let n = 0; n < e; ++n) {
          let r = t[n];
          yield [r.u, r.l];
        }
      }
    }
    mxo.OrderedMap = gQa;
  });
  var AVn = __commonJS(kVn => {
    Object.defineProperty(kVn, "__esModule", {
      value: true
    });
    kVn.registerAdminService = yQp;
    kVn.addAdminServicesToServer = _Qp;
    var _Qa = [];
    function yQp(e, t) {
      _Qa.push({
        getServiceDefinition: e,
        getHandlers: t
      });
    }
    function _Qp(e) {
      for (let {
        getServiceDefinition: t,
        getHandlers: n
      } of _Qa) {
        e.addService(t(), n());
      }
    }
  });
  var vQa = __commonJS(ose => {
    Object.defineProperty(ose, "__esModule", {
      value: true
    });
    ose.ClientDuplexStreamImpl = ose.ClientWritableStreamImpl = ose.ClientReadableStreamImpl = ose.ClientUnaryCallImpl = undefined;
    ose.callErrorFromStatus = SQp;
    var bQp = require("events");
    var fxo = require("stream");
    var tVt = th();
    function SQp(e, t) {
      let n = `${e.code} ${tVt.Status[e.code]}: ${e.details}`;
      let o = `${Error(n).stack}
for call at
${t}`;
      return Object.assign(Error(n), e, {
        stack: o
      });
    }
    class bQa extends bQp.EventEmitter {
      constructor() {
        super();
      }
      cancel() {
        var e;
        (e = this.call) === null || e === undefined || e.cancelWithStatus(tVt.Status.CANCELLED, "Cancelled on client");
      }
      getPeer() {
        var e;
        var t;
        return (t = (e = this.call) === null || e === undefined ? undefined : e.getPeer()) !== null && t !== undefined ? t : "unknown";
      }
      getAuthContext() {
        var e;
        var t;
        return (t = (e = this.call) === null || e === undefined ? undefined : e.getAuthContext()) !== null && t !== undefined ? t : null;
      }
    }
    ose.ClientUnaryCallImpl = bQa;
    class SQa extends fxo.Readable {
      constructor(e) {
        super({
          objectMode: true
        });
        this.deserialize = e;
      }
      cancel() {
        var e;
        (e = this.call) === null || e === undefined || e.cancelWithStatus(tVt.Status.CANCELLED, "Cancelled on client");
      }
      getPeer() {
        var e;
        var t;
        return (t = (e = this.call) === null || e === undefined ? undefined : e.getPeer()) !== null && t !== undefined ? t : "unknown";
      }
      getAuthContext() {
        var e;
        var t;
        return (t = (e = this.call) === null || e === undefined ? undefined : e.getAuthContext()) !== null && t !== undefined ? t : null;
      }
      _read(e) {
        var t;
        (t = this.call) === null || t === undefined || t.startRead();
      }
    }
    ose.ClientReadableStreamImpl = SQa;
    class TQa extends fxo.Writable {
      constructor(e) {
        super({
          objectMode: true
        });
        this.serialize = e;
      }
      cancel() {
        var e;
        (e = this.call) === null || e === undefined || e.cancelWithStatus(tVt.Status.CANCELLED, "Cancelled on client");
      }
      getPeer() {
        var e;
        var t;
        return (t = (e = this.call) === null || e === undefined ? undefined : e.getPeer()) !== null && t !== undefined ? t : "unknown";
      }
      getAuthContext() {
        var e;
        var t;
        return (t = (e = this.call) === null || e === undefined ? undefined : e.getAuthContext()) !== null && t !== undefined ? t : null;
      }
      _write(e, t, n) {
        var r;
        let o = {
          callback: n
        };
        let s = Number(t);
        if (!Number.isNaN(s)) {
          o.flags = s;
        }
        (r = this.call) === null || r === undefined || r.sendMessageWithContext(o, e);
      }
      _final(e) {
        var t;
        (t = this.call) === null || t === undefined || t.halfClose();
        e();
      }
    }
    ose.ClientWritableStreamImpl = TQa;
    class EQa extends fxo.Duplex {
      constructor(e, t) {
        super({
          objectMode: true
        });
        this.serialize = e;
        this.deserialize = t;
      }
      cancel() {
        var e;
        (e = this.call) === null || e === undefined || e.cancelWithStatus(tVt.Status.CANCELLED, "Cancelled on client");
      }
      getPeer() {
        var e;
        var t;
        return (t = (e = this.call) === null || e === undefined ? undefined : e.getPeer()) !== null && t !== undefined ? t : "unknown";
      }
      getAuthContext() {
        var e;
        var t;
        return (t = (e = this.call) === null || e === undefined ? undefined : e.getAuthContext()) !== null && t !== undefined ? t : null;
      }
      _read(e) {
        var t;
        (t = this.call) === null || t === undefined || t.startRead();
      }
      _write(e, t, n) {
        var r;
        let o = {
          callback: n
        };
        let s = Number(t);
        if (!Number.isNaN(s)) {
          o.flags = s;
        }
        (r = this.call) === null || r === undefined || r.sendMessageWithContext(o, e);
      }
      _final(e) {
        var t;
        (t = this.call) === null || t === undefined || t.halfClose();
        e();
      }
    }
    ose.ClientDuplexStreamImpl = EQa;
  });
  var mVe = __commonJS(pVe => {
    Object.defineProperty(pVe, "__esModule", {
      value: true
    });
    pVe.InterceptingListenerImpl = undefined;
    pVe.statusOrFromValue = EQp;
    pVe.statusOrFromError = vQp;
    pVe.isInterceptingListener = wQp;
    var TQp = K1();
    function EQp(e) {
      return {
        ok: true,
        value: e
      };
    }
    function vQp(e) {
      var t;
      return {
        ok: false,
        error: Object.assign(Object.assign({}, e), {
          metadata: (t = e.metadata) !== null && t !== undefined ? t : new TQp.Metadata()
        })
      };
    }
    function wQp(e) {
      return e.onReceiveMetadata !== undefined && e.onReceiveMetadata.length === 1;
    }
    class wQa {
      constructor(e, t) {
        this.listener = e;
        this.nextListener = t;
        this.processingMetadata = false;
        this.hasPendingMessage = false;
        this.processingMessage = false;
        this.pendingStatus = null;
      }
      processPendingMessage() {
        if (this.hasPendingMessage) {
          this.nextListener.onReceiveMessage(this.pendingMessage);
          this.pendingMessage = null;
          this.hasPendingMessage = false;
        }
      }
      processPendingStatus() {
        if (this.pendingStatus) {
          this.nextListener.onReceiveStatus(this.pendingStatus);
        }
      }
      onReceiveMetadata(e) {
        this.processingMetadata = true;
        this.listener.onReceiveMetadata(e, t => {
          this.processingMetadata = false;
          this.nextListener.onReceiveMetadata(t);
          this.processPendingMessage();
          this.processPendingStatus();
        });
      }
      onReceiveMessage(e) {
        this.processingMessage = true;
        this.listener.onReceiveMessage(e, t => {
          if (this.processingMessage = false, this.processingMetadata) {
            this.pendingMessage = t;
            this.hasPendingMessage = true;
          } else {
            this.nextListener.onReceiveMessage(t);
            this.processPendingStatus();
          }
        });
      }
      onReceiveStatus(e) {
        this.listener.onReceiveStatus(e, t => {
          if (this.processingMetadata || this.processingMessage) {
            this.pendingStatus = t;
          } else {
            this.nextListener.onReceiveStatus(t);
          }
        });
      }
    }
    pVe.InterceptingListenerImpl = wQa;
  });
  var yxo = __commonJS(sse => {
    Object.defineProperty(sse, "__esModule", {
      value: true
    });
    sse.InterceptingCall = sse.RequesterBuilder = sse.ListenerBuilder = sse.InterceptorConfigurationError = undefined;
    sse.getInterceptingCall = kQp;
    var CQp = K1();
    var CQa = mVe();
    var RQa = th();
    var xQa = lVn();
    class rVt extends Error {
      constructor(e) {
        super(e);
        this.name = "InterceptorConfigurationError";
        Error.captureStackTrace(this, rVt);
      }
    }
    sse.InterceptorConfigurationError = rVt;
    class kQa {
      constructor() {
        this.metadata = undefined;
        this.message = undefined;
        this.status = undefined;
      }
      withOnReceiveMetadata(e) {
        this.metadata = e;
        return this;
      }
      withOnReceiveMessage(e) {
        this.message = e;
        return this;
      }
      withOnReceiveStatus(e) {
        this.status = e;
        return this;
      }
      build() {
        return {
          onReceiveMetadata: this.metadata,
          onReceiveMessage: this.message,
          onReceiveStatus: this.status
        };
      }
    }
    sse.ListenerBuilder = kQa;
    class AQa {
      constructor() {
        this.start = undefined;
        this.message = undefined;
        this.halfClose = undefined;
        this.cancel = undefined;
      }
      withStart(e) {
        this.start = e;
        return this;
      }
      withSendMessage(e) {
        this.message = e;
        return this;
      }
      withHalfClose(e) {
        this.halfClose = e;
        return this;
      }
      withCancel(e) {
        this.cancel = e;
        return this;
      }
      build() {
        return {
          start: this.start,
          sendMessage: this.message,
          halfClose: this.halfClose,
          cancel: this.cancel
        };
      }
    }
    sse.RequesterBuilder = AQa;
    var hxo = {
      onReceiveMetadata: (e, t) => {
        t(e);
      },
      onReceiveMessage: (e, t) => {
        t(e);
      },
      onReceiveStatus: (e, t) => {
        t(e);
      }
    };
    var nVt = {
      start: (e, t, n) => {
        n(e, t);
      },
      sendMessage: (e, t) => {
        t(e);
      },
      halfClose: e => {
        e();
      },
      cancel: e => {
        e();
      }
    };
    class IQa {
      constructor(e, t) {
        var n;
        var r;
        var o;
        var s;
        if (this.nextCall = e, this.processingMetadata = false, this.pendingMessageContext = null, this.processingMessage = false, this.pendingHalfClose = false, t) {
          this.requester = {
            start: (n = t.start) !== null && n !== undefined ? n : nVt.start,
            sendMessage: (r = t.sendMessage) !== null && r !== undefined ? r : nVt.sendMessage,
            halfClose: (o = t.halfClose) !== null && o !== undefined ? o : nVt.halfClose,
            cancel: (s = t.cancel) !== null && s !== undefined ? s : nVt.cancel
          };
        } else {
          this.requester = nVt;
        }
      }
      cancelWithStatus(e, t) {
        this.requester.cancel(() => {
          this.nextCall.cancelWithStatus(e, t);
        });
      }
      getPeer() {
        return this.nextCall.getPeer();
      }
      processPendingMessage() {
        if (this.pendingMessageContext) {
          this.nextCall.sendMessageWithContext(this.pendingMessageContext, this.pendingMessage);
          this.pendingMessageContext = null;
          this.pendingMessage = null;
        }
      }
      processPendingHalfClose() {
        if (this.pendingHalfClose) {
          this.nextCall.halfClose();
        }
      }
      start(e, t) {
        var n;
        var r;
        var o;
        var s;
        var i;
        var a;
        let l = {
          onReceiveMetadata: (r = (n = t === null || t === undefined ? undefined : t.onReceiveMetadata) === null || n === undefined ? undefined : n.bind(t)) !== null && r !== undefined ? r : c => {},
          onReceiveMessage: (s = (o = t === null || t === undefined ? undefined : t.onReceiveMessage) === null || o === undefined ? undefined : o.bind(t)) !== null && s !== undefined ? s : c => {},
          onReceiveStatus: (a = (i = t === null || t === undefined ? undefined : t.onReceiveStatus) === null || i === undefined ? undefined : i.bind(t)) !== null && a !== undefined ? a : c => {}
        };
        this.processingMetadata = true;
        this.requester.start(e, l, (c, u) => {
          var d;
          var p;
          var m;
          this.processingMetadata = false;
          let f;
          if ((0, CQa.isInterceptingListener)(u)) {
            f = u;
          } else {
            let h = {
              onReceiveMetadata: (d = u.onReceiveMetadata) !== null && d !== undefined ? d : hxo.onReceiveMetadata,
              onReceiveMessage: (p = u.onReceiveMessage) !== null && p !== undefined ? p : hxo.onReceiveMessage,
              onReceiveStatus: (m = u.onReceiveStatus) !== null && m !== undefined ? m : hxo.onReceiveStatus
            };
            f = new CQa.InterceptingListenerImpl(h, l);
          }
          this.nextCall.start(c, f);
          this.processPendingMessage();
          this.processPendingHalfClose();
        });
      }
      sendMessageWithContext(e, t) {
        this.processingMessage = true;
        this.requester.sendMessage(t, n => {
          if (this.processingMessage = false, this.processingMetadata) {
            this.pendingMessageContext = e;
            this.pendingMessage = t;
          } else {
            this.nextCall.sendMessageWithContext(e, n);
            this.processPendingHalfClose();
          }
        });
      }
      sendMessage(e) {
        this.sendMessageWithContext({}, e);
      }
      startRead() {
        this.nextCall.startRead();
      }
      halfClose() {
        this.requester.halfClose(() => {
          if (this.processingMetadata || this.processingMessage) {
            this.pendingHalfClose = true;
          } else {
            this.nextCall.halfClose();
          }
        });
      }
      getAuthContext() {
        return this.nextCall.getAuthContext();
      }
    }
    sse.InterceptingCall = IQa;
    function RQp(e, t, n) {
      var r;
      var o;
      let s = (r = n.deadline) !== null && r !== undefined ? r : 1 / 0;
      let i = n.host;
      let a = (o = n.parent) !== null && o !== undefined ? o : null;
      let l = n.propagate_flags;
      let c = n.credentials;
      let u = e.createCall(t, s, i, a, l);
      if (c) {
        u.setCredentials(c);
      }
      return u;
    }
    class gxo {
      constructor(e, t) {
        this.call = e;
        this.methodDefinition = t;
      }
      cancelWithStatus(e, t) {
        this.call.cancelWithStatus(e, t);
      }
      getPeer() {
        return this.call.getPeer();
      }
      sendMessageWithContext(e, t) {
        let n;
        try {
          n = this.methodDefinition.requestSerialize(t);
        } catch (r) {
          this.call.cancelWithStatus(RQa.Status.INTERNAL, `Request message serialization failure: ${(0, xQa.getErrorMessage)(r)}`);
          return;
        }
        this.call.sendMessageWithContext(e, n);
      }
      sendMessage(e) {
        this.sendMessageWithContext({}, e);
      }
      start(e, t) {
        let n = null;
        this.call.start(e, {
          onReceiveMetadata: r => {
            var o;
            (o = t === null || t === undefined ? undefined : t.onReceiveMetadata) === null || o === undefined || o.call(t, r);
          },
          onReceiveMessage: r => {
            var o;
            let s;
            try {
              s = this.methodDefinition.responseDeserialize(r);
            } catch (i) {
              n = {
                code: RQa.Status.INTERNAL,
                details: `Response message parsing error: ${(0, xQa.getErrorMessage)(i)}`,
                metadata: new CQp.Metadata()
              };
              this.call.cancelWithStatus(n.code, n.details);
              return;
            }
            (o = t === null || t === undefined ? undefined : t.onReceiveMessage) === null || o === undefined || o.call(t, s);
          },
          onReceiveStatus: r => {
            var o;
            var s;
            if (n) {
              (o = t === null || t === undefined ? undefined : t.onReceiveStatus) === null || o === undefined || o.call(t, n);
            } else {
              (s = t === null || t === undefined ? undefined : t.onReceiveStatus) === null || s === undefined || s.call(t, r);
            }
          }
        });
      }
      startRead() {
        this.call.startRead();
      }
      halfClose() {
        this.call.halfClose();
      }
      getAuthContext() {
        return this.call.getAuthContext();
      }
    }
    class PQa extends gxo {
      constructor(e, t) {
        super(e, t);
      }
      start(e, t) {
        var n;
        var r;
        let o = false;
        let s = {
          onReceiveMetadata: (r = (n = t === null || t === undefined ? undefined : t.onReceiveMetadata) === null || n === undefined ? undefined : n.bind(t)) !== null && r !== undefined ? r : i => {},
          onReceiveMessage: i => {
            var a;
            o = true;
            (a = t === null || t === undefined ? undefined : t.onReceiveMessage) === null || a === undefined || a.call(t, i);
          },
          onReceiveStatus: i => {
            var a;
            var l;
            if (!o) {
              (a = t === null || t === undefined ? undefined : t.onReceiveMessage) === null || a === undefined || a.call(t, null);
            }
            (l = t === null || t === undefined ? undefined : t.onReceiveStatus) === null || l === undefined || l.call(t, i);
          }
        };
        super.start(e, s);
        this.call.startRead();
      }
    }
    class OQa extends gxo {}
    function xQp(e, t, n) {
      let r = RQp(e, n.path, t);
      if (n.responseStream) {
        return new OQa(r, n);
      } else {
        return new PQa(r, n);
      }
    }
    function kQp(e, t, n, r) {
      if (e.clientInterceptors.length > 0 && e.clientInterceptorProviders.length > 0) {
        throw new rVt("Both interceptors and interceptor_providers were passed as options to the client constructor. Only one of these is allowed.");
      }
      if (e.callInterceptors.length > 0 && e.callInterceptorProviders.length > 0) {
        throw new rVt("Both interceptors and interceptor_providers were passed as call options. Only one of these is allowed.");
      }
      let o = [];
      if (e.callInterceptors.length > 0 || e.callInterceptorProviders.length > 0) {
        o = [].concat(e.callInterceptors, e.callInterceptorProviders.map(a => a(t))).filter(a => a);
      } else {
        o = [].concat(e.clientInterceptors, e.clientInterceptorProviders.map(a => a(t))).filter(a => a);
      }
      let s = Object.assign({}, n, {
        method_definition: t
      });
      return o.reduceRight((a, l) => c => l(c, a), a => xQp(r, a, t))(s);
    }
  });
  var bxo = __commonJS(PVn => {
    Object.defineProperty(PVn, "__esModule", {
      value: true
    });
    PVn.Client = undefined;
    var Qpe = vQa();
    var AQp = Sxo();
    var IQp = T3();
    var c1e = th();
    var Eyt = K1();
    var IVn = yxo();
    var ise = Symbol();
    var vyt = Symbol();
    var wyt = Symbol();
    var JEe = Symbol();
    function _xo(e) {
      return typeof e === "function";
    }
    function Cyt(e) {
      var t;
      return ((t = e.stack) === null || t === undefined ? undefined : t.split(`
`).slice(1).join(`
`)) || "no stack trace available";
    }
    class DQa {
      constructor(e, t, n = {}) {
        var r;
        var o;
        if (n = Object.assign({}, n), this[vyt] = (r = n.interceptors) !== null && r !== undefined ? r : [], delete n.interceptors, this[wyt] = (o = n.interceptor_providers) !== null && o !== undefined ? o : [], delete n.interceptor_providers, this[vyt].length > 0 && this[wyt].length > 0) {
          throw Error("Both interceptors and interceptor_providers were passed as options to the client constructor. Only one of these is allowed.");
        }
        if (this[JEe] = n.callInvocationTransformer, delete n.callInvocationTransformer, n.channelOverride) {
          this[ise] = n.channelOverride;
        } else if (n.channelFactoryOverride) {
          let s = n.channelFactoryOverride;
          delete n.channelFactoryOverride;
          this[ise] = s(e, t, n);
        } else {
          this[ise] = new AQp.ChannelImplementation(e, t, n);
        }
      }
      close() {
        this[ise].close();
      }
      getChannel() {
        return this[ise];
      }
      waitForReady(e, t) {
        let n = r => {
          if (r) {
            t(Error("Failed to connect before the deadline"));
            return;
          }
          let o;
          try {
            o = this[ise].getConnectivityState(true);
          } catch (s) {
            t(Error("The channel has been closed"));
            return;
          }
          if (o === IQp.ConnectivityState.READY) {
            t();
          } else {
            try {
              this[ise].watchConnectivityState(o, e, n);
            } catch (s) {
              t(Error("The channel has been closed"));
            }
          }
        };
        setImmediate(n);
      }
      checkOptionalUnaryResponseArguments(e, t, n) {
        if (_xo(e)) {
          return {
            metadata: new Eyt.Metadata(),
            options: {},
            callback: e
          };
        } else if (_xo(t)) {
          if (e instanceof Eyt.Metadata) {
            return {
              metadata: e,
              options: {},
              callback: t
            };
          } else {
            return {
              metadata: new Eyt.Metadata(),
              options: e,
              callback: t
            };
          }
        } else {
          if (!(e instanceof Eyt.Metadata && t instanceof Object && _xo(n))) {
            throw Error("Incorrect arguments passed");
          }
          return {
            metadata: e,
            options: t,
            callback: n
          };
        }
      }
      makeUnaryRequest(e, t, n, r, o, s, i) {
        var a;
        var l;
        let c = this.checkOptionalUnaryResponseArguments(o, s, i);
        let u = {
          path: e,
          requestStream: false,
          responseStream: false,
          requestSerialize: t,
          responseDeserialize: n
        };
        let d = {
          argument: r,
          metadata: c.metadata,
          call: new Qpe.ClientUnaryCallImpl(),
          channel: this[ise],
          methodDefinition: u,
          callOptions: c.options,
          callback: c.callback
        };
        if (this[JEe]) {
          d = this[JEe](d);
        }
        let p = d.call;
        let m = {
          clientInterceptors: this[vyt],
          clientInterceptorProviders: this[wyt],
          callInterceptors: (a = d.callOptions.interceptors) !== null && a !== undefined ? a : [],
          callInterceptorProviders: (l = d.callOptions.interceptor_providers) !== null && l !== undefined ? l : []
        };
        let f = (0, IVn.getInterceptingCall)(m, d.methodDefinition, d.callOptions, d.channel);
        p.call = f;
        let h = null;
        let g = false;
        let y = Error();
        f.start(d.metadata, {
          onReceiveMetadata: _ => {
            p.emit("metadata", _);
          },
          onReceiveMessage(_) {
            if (h !== null) {
              f.cancelWithStatus(c1e.Status.UNIMPLEMENTED, "Too many responses received");
            }
            h = _;
          },
          onReceiveStatus(_) {
            if (g) {
              return;
            }
            if (g = true, _.code === c1e.Status.OK) {
              if (h === null) {
                let b = Cyt(y);
                d.callback((0, Qpe.callErrorFromStatus)({
                  code: c1e.Status.UNIMPLEMENTED,
                  details: "No message received",
                  metadata: _.metadata
                }, b));
              } else {
                d.callback(null, h);
              }
            } else {
              let b = Cyt(y);
              d.callback((0, Qpe.callErrorFromStatus)(_, b));
            }
            y = null;
            p.emit("status", _);
          }
        });
        f.sendMessage(r);
        f.halfClose();
        return p;
      }
      makeClientStreamRequest(e, t, n, r, o, s) {
        var i;
        var a;
        let l = this.checkOptionalUnaryResponseArguments(r, o, s);
        let c = {
          path: e,
          requestStream: true,
          responseStream: false,
          requestSerialize: t,
          responseDeserialize: n
        };
        let u = {
          metadata: l.metadata,
          call: new Qpe.ClientWritableStreamImpl(t),
          channel: this[ise],
          methodDefinition: c,
          callOptions: l.options,
          callback: l.callback
        };
        if (this[JEe]) {
          u = this[JEe](u);
        }
        let d = u.call;
        let p = {
          clientInterceptors: this[vyt],
          clientInterceptorProviders: this[wyt],
          callInterceptors: (i = u.callOptions.interceptors) !== null && i !== undefined ? i : [],
          callInterceptorProviders: (a = u.callOptions.interceptor_providers) !== null && a !== undefined ? a : []
        };
        let m = (0, IVn.getInterceptingCall)(p, u.methodDefinition, u.callOptions, u.channel);
        d.call = m;
        let f = null;
        let h = false;
        let g = Error();
        m.start(u.metadata, {
          onReceiveMetadata: y => {
            d.emit("metadata", y);
          },
          onReceiveMessage(y) {
            if (f !== null) {
              m.cancelWithStatus(c1e.Status.UNIMPLEMENTED, "Too many responses received");
            }
            f = y;
            m.startRead();
          },
          onReceiveStatus(y) {
            if (h) {
              return;
            }
            if (h = true, y.code === c1e.Status.OK) {
              if (f === null) {
                let _ = Cyt(g);
                u.callback((0, Qpe.callErrorFromStatus)({
                  code: c1e.Status.UNIMPLEMENTED,
                  details: "No message received",
                  metadata: y.metadata
                }, _));
              } else {
                u.callback(null, f);
              }
            } else {
              let _ = Cyt(g);
              u.callback((0, Qpe.callErrorFromStatus)(y, _));
            }
            g = null;
            d.emit("status", y);
          }
        });
        return d;
      }
      checkMetadataAndOptions(e, t) {
        let n;
        let r;
        if (e instanceof Eyt.Metadata) {
          if (n = e, t) {
            r = t;
          } else {
            r = {};
          }
        } else {
          if (e) {
            r = e;
          } else {
            r = {};
          }
          n = new Eyt.Metadata();
        }
        return {
          metadata: n,
          options: r
        };
      }
      makeServerStreamRequest(e, t, n, r, o, s) {
        var i;
        var a;
        let l = this.checkMetadataAndOptions(o, s);
        let c = {
          path: e,
          requestStream: false,
          responseStream: true,
          requestSerialize: t,
          responseDeserialize: n
        };
        let u = {
          argument: r,
          metadata: l.metadata,
          call: new Qpe.ClientReadableStreamImpl(n),
          channel: this[ise],
          methodDefinition: c,
          callOptions: l.options
        };
        if (this[JEe]) {
          u = this[JEe](u);
        }
        let d = u.call;
        let p = {
          clientInterceptors: this[vyt],
          clientInterceptorProviders: this[wyt],
          callInterceptors: (i = u.callOptions.interceptors) !== null && i !== undefined ? i : [],
          callInterceptorProviders: (a = u.callOptions.interceptor_providers) !== null && a !== undefined ? a : []
        };
        let m = (0, IVn.getInterceptingCall)(p, u.methodDefinition, u.callOptions, u.channel);
        d.call = m;
        let f = false;
        let h = Error();
        m.start(u.metadata, {
          onReceiveMetadata(g) {
            d.emit("metadata", g);
          },
          onReceiveMessage(g) {
            d.push(g);
          },
          onReceiveStatus(g) {
            if (f) {
              return;
            }
            if (f = true, d.push(null), g.code !== c1e.Status.OK) {
              let y = Cyt(h);
              d.emit("error", (0, Qpe.callErrorFromStatus)(g, y));
            }
            h = null;
            d.emit("status", g);
          }
        });
        m.sendMessage(r);
        m.halfClose();
        return d;
      }
      makeBidiStreamRequest(e, t, n, r, o) {
        var s;
        var i;
        let a = this.checkMetadataAndOptions(r, o);
        let l = {
          path: e,
          requestStream: true,
          responseStream: true,
          requestSerialize: t,
          responseDeserialize: n
        };
        let c = {
          metadata: a.metadata,
          call: new Qpe.ClientDuplexStreamImpl(t, n),
          channel: this[ise],
          methodDefinition: l,
          callOptions: a.options
        };
        if (this[JEe]) {
          c = this[JEe](c);
        }
        let u = c.call;
        let d = {
          clientInterceptors: this[vyt],
          clientInterceptorProviders: this[wyt],
          callInterceptors: (s = c.callOptions.interceptors) !== null && s !== undefined ? s : [],
          callInterceptorProviders: (i = c.callOptions.interceptor_providers) !== null && i !== undefined ? i : []
        };
        let p = (0, IVn.getInterceptingCall)(d, c.methodDefinition, c.callOptions, c.channel);
        u.call = p;
        let m = false;
        let f = Error();
        p.start(c.metadata, {
          onReceiveMetadata(h) {
            u.emit("metadata", h);
          },
          onReceiveMessage(h) {
            u.push(h);
          },
          onReceiveStatus(h) {
            if (m) {
              return;
            }
            if (m = true, u.push(null), h.code !== c1e.Status.OK) {
              let g = Cyt(f);
              u.emit("error", (0, Qpe.callErrorFromStatus)(h, g));
            }
            f = null;
            u.emit("status", h);
          }
        });
        return u;
      }
    }
    PVn.Client = DQa;
  });
  var DVn = __commonJS(OVn => {
    Object.defineProperty(OVn, "__esModule", {
      value: true
    });
    OVn.makeClientConstructor = MQa;
    OVn.loadPackageDefinition = MQp;
    var oVt = bxo();
    var PQp = {
      unary: oVt.Client.prototype.makeUnaryRequest,
      server_stream: oVt.Client.prototype.makeServerStreamRequest,
      client_stream: oVt.Client.prototype.makeClientStreamRequest,
      bidi: oVt.Client.prototype.makeBidiStreamRequest
    };
    function Txo(e) {
      return ["__proto__", "prototype", "constructor"].includes(e);
    }
    function MQa(e, t, n) {
      if (!n) {
        n = {};
      }
      class r extends oVt.Client {}
      Object.keys(e).forEach(o => {
        if (Txo(o)) {
          return;
        }
        let s = e[o];
        let i;
        if (typeof o === "string" && o.charAt(0) === "$") {
          throw Error("Method names cannot start with $");
        }
        if (s.requestStream) {
          if (s.responseStream) {
            i = "bidi";
          } else {
            i = "client_stream";
          }
        } else if (s.responseStream) {
          i = "server_stream";
        } else {
          i = "unary";
        }
        let {
          requestSerialize: a,
          responseDeserialize: l
        } = s;
        let c = OQp(PQp[i], s.path, a, l);
        if (r.prototype[o] = c, Object.assign(r.prototype[o], s), s.originalName && !Txo(s.originalName)) {
          r.prototype[s.originalName] = r.prototype[o];
        }
      });
      r.service = e;
      r.serviceName = t;
      return r;
    }
    function OQp(e, t, n, r) {
      return function (...o) {
        return e.call(this, t, n, r, ...o);
      };
    }
    function DQp(e) {
      return "format" in e;
    }
    function MQp(e) {
      let t = {};
      for (let n in e) {
        if (Object.prototype.hasOwnProperty.call(e, n)) {
          let r = e[n];
          let o = n.split(".");
          if (o.some(a => Txo(a))) {
            continue;
          }
          let s = o[o.length - 1];
          let i = t;
          for (let a of o.slice(0, -1)) {
            if (!i[a]) {
              i[a] = {};
            }
            i = i[a];
          }
          if (DQp(r)) {
            i[s] = r;
          } else {
            i[s] = MQa(r, s, {});
          }
        }
      }
      return t;
    }
  });
  var sZa = __commonJS((fJ_, oZa) => {
    var NQp = 1 / 0;
    var KQa = "\\xac\\xb1\\xd7\\xf7" + "\\x00-\\x2f\\x3a-\\x40\\x5b-\\x60\\x7b-\\xbf" + "\\u2000-\\u206f" + " \\t\\x0b\\f\\xa0\\ufeff\\n\\r\\u2028\\u2029\\u1680\\u180e\\u2000\\u2001\\u2002\\u2003\\u2004\\u2005\\u2006\\u2007\\u2008\\u2009\\u200a\\u202f\\u205f\\u3000";
    var qQp = "[" + "\\ud800-\\udfff" + "]";
    var NQa = "[" + KQa + "]";
    var MVn = "[" + "\\u0300-\\u036f\\ufe20-\\ufe23" + "\\u20d0-\\u20f0" + "]";
    var WQp = "[" + "\\u2700-\\u27bf" + "]";
    var JQa = "[" + "a-z\\xdf-\\xf6\\xf8-\\xff" + "]";
    var XQa = "[^" + "\\ud800-\\udfff" + KQa + "\\d+" + "\\u2700-\\u27bf" + "a-z\\xdf-\\xf6\\xf8-\\xff" + "A-Z\\xc0-\\xd6\\xd8-\\xde" + "]";
    var GQp = "(?:" + MVn + "|" + "\\ud83c[\\udffb-\\udfff]" + ")";
    var QQa = "[^" + "\\ud800-\\udfff" + "]";
    var Ryt = "[" + "A-Z\\xc0-\\xd6\\xd8-\\xde" + "]";
    var LQa = "(?:" + JQa + "|" + XQa + ")";
    var VQp = "(?:" + Ryt + "|" + XQa + ")";
    var FQa = "(?:" + "['\u2019]" + "(?:d|ll|m|re|s|t|ve))?";
    var UQa = "(?:" + "['\u2019]" + "(?:D|LL|M|RE|S|T|VE))?";
    var eZa = GQp + "?";
    var tZa = "[" + "\\ufe0e\\ufe0f" + "]?";
    var zQp = "(?:" + "\\u200d" + "(?:" + [QQa, "(?:\\ud83c[\\udde6-\\uddff]){2}", "[\\ud800-\\udbff][\\udc00-\\udfff]"].join("|") + ")" + tZa + eZa + ")*";
    var nZa = tZa + eZa + zQp;
    var KQp = "(?:" + [WQp, "(?:\\ud83c[\\udde6-\\uddff]){2}", "[\\ud800-\\udbff][\\udc00-\\udfff]"].join("|") + ")" + nZa;
    var YQp = "(?:" + [QQa + MVn + "?", MVn, "(?:\\ud83c[\\udde6-\\uddff]){2}", "[\\ud800-\\udbff][\\udc00-\\udfff]", qQp].join("|") + ")";
    var JQp = RegExp("['\u2019]", "g");
    var XQp = RegExp(MVn, "g");
    var QQp = RegExp("\\ud83c[\\udffb-\\udfff]" + "(?=" + "\\ud83c[\\udffb-\\udfff]" + ")|" + YQp + nZa, "g");
    var ZQp = RegExp([Ryt + "?" + JQa + "+" + FQa + "(?=" + [NQa, Ryt, "$"].join("|") + ")", VQp + "+" + UQa + "(?=" + [NQa, Ryt + LQa, "$"].join("|") + ")", Ryt + "?" + LQa + "+" + FQa, Ryt + "+" + UQa, "\\d+", KQp].join("|"), "g");
    var eZp = RegExp("[" + "\\u200d" + "\\ud800-\\udfff" + "\\u0300-\\u036f\\ufe20-\\ufe23" + "\\u20d0-\\u20f0" + "\\ufe0e\\ufe0f" + "]");
    var nZp = {
      "\xC0": "A",
      "\xC1": "A",
      "\xC2": "A",
      "\xC3": "A",
      "\xC4": "A",
      "\xC5": "A",
      "\xE0": "a",
      "\xE1": "a",
      "\xE2": "a",
      "\xE3": "a",
      "\xE4": "a",
      "\xE5": "a",
      "\xC7": "C",
      "\xE7": "c",
      "\xD0": "D",
      "\xF0": "d",
      "\xC8": "E",
      "\xC9": "E",
      "\xCA": "E",
      "\xCB": "E",
      "\xE8": "e",
      "\xE9": "e",
      "\xEA": "e",
      "\xEB": "e",
      "\xCC": "I",
      "\xCD": "I",
      "\xCE": "I",
      "\xCF": "I",
      "\xEC": "i",
      "\xED": "i",
      "\xEE": "i",
      "\xEF": "i",
      "\xD1": "N",
      "\xF1": "n",
      "\xD2": "O",
      "\xD3": "O",
      "\xD4": "O",
      "\xD5": "O",
      "\xD6": "O",
      "\xD8": "O",
      "\xF2": "o",
      "\xF3": "o",
      "\xF4": "o",
      "\xF5": "o",
      "\xF6": "o",
      "\xF8": "o",
      "\xD9": "U",
      "\xDA": "U",
      "\xDB": "U",
      "\xDC": "U",
      "\xF9": "u",
      "\xFA": "u",
      "\xFB": "u",
      "\xFC": "u",
      "\xDD": "Y",
      "\xFD": "y",
      "\xFF": "y",
      "\xC6": "Ae",
      "\xE6": "ae",
      "\xDE": "Th",
      "\xFE": "th",
      "\xDF": "ss",
      "\u0100": "A",
      "\u0102": "A",
      "\u0104": "A",
      "\u0101": "a",
      "\u0103": "a",
      "\u0105": "a",
      "\u0106": "C",
      "\u0108": "C",
      "\u010A": "C",
      "\u010C": "C",
      "\u0107": "c",
      "\u0109": "c",
      "\u010B": "c",
      "\u010D": "c",
      "\u010E": "D",
      "\u0110": "D",
      "\u010F": "d",
      "\u0111": "d",
      "\u0112": "E",
      "\u0114": "E",
      "\u0116": "E",
      "\u0118": "E",
      "\u011A": "E",
      "\u0113": "e",
      "\u0115": "e",
      "\u0117": "e",
      "\u0119": "e",
      "\u011B": "e",
      "\u011C": "G",
      "\u011E": "G",
      "\u0120": "G",
      "\u0122": "G",
      "\u011D": "g",
      "\u011F": "g",
      "\u0121": "g",
      "\u0123": "g",
      "\u0124": "H",
      "\u0126": "H",
      "\u0125": "h",
      "\u0127": "h",
      "\u0128": "I",
      "\u012A": "I",
      "\u012C": "I",
      "\u012E": "I",
      "\u0130": "I",
      "\u0129": "i",
      "\u012B": "i",
      "\u012D": "i",
      "\u012F": "i",
      "\u0131": "i",
      "\u0134": "J",
      "\u0135": "j",
      "\u0136": "K",
      "\u0137": "k",
      "\u0138": "k",
      "\u0139": "L",
      "\u013B": "L",
      "\u013D": "L",
      "\u013F": "L",
      "\u0141": "L",
      "\u013A": "l",
      "\u013C": "l",
      "\u013E": "l",
      "\u0140": "l",
      "\u0142": "l",
      "\u0143": "N",
      "\u0145": "N",
      "\u0147": "N",
      "\u014A": "N",
      "\u0144": "n",
      "\u0146": "n",
      "\u0148": "n",
      "\u014B": "n",
      "\u014C": "O",
      "\u014E": "O",
      "\u0150": "O",
      "\u014D": "o",
      "\u014F": "o",
      "\u0151": "o",
      "\u0154": "R",
      "\u0156": "R",
      "\u0158": "R",
      "\u0155": "r",
      "\u0157": "r",
      "\u0159": "r",
      "\u015A": "S",
      "\u015C": "S",
      "\u015E": "S",
      "\u0160": "S",
      "\u015B": "s",
      "\u015D": "s",
      "\u015F": "s",
      "\u0161": "s",
      "\u0162": "T",
      "\u0164": "T",
      "\u0166": "T",
      "\u0163": "t",
      "\u0165": "t",
      "\u0167": "t",
      "\u0168": "U",
      "\u016A": "U",
      "\u016C": "U",
      "\u016E": "U",
      "\u0170": "U",
      "\u0172": "U",
      "\u0169": "u",
      "\u016B": "u",
      "\u016D": "u",
      "\u016F": "u",
      "\u0171": "u",
      "\u0173": "u",
      "\u0174": "W",
      "\u0175": "w",
      "\u0176": "Y",
      "\u0177": "y",
      "\u0178": "Y",
      "\u0179": "Z",
      "\u017B": "Z",
      "\u017D": "Z",
      "\u017A": "z",
      "\u017C": "z",
      "\u017E": "z",
      "\u0132": "IJ",
      "\u0133": "ij",
      "\u0152": "Oe",
      "\u0153": "oe",
      "\u0149": "'n",
      "\u017F": "ss"
    };
    var rZp = typeof global == "object" && global && global.Object === Object && global;
    var oZp = typeof self == "object" && self && self.Object === Object && self;
    var sZp = rZp || oZp || Function("return this")();
    function iZp(e, t, n, r) {
      var o = -1;
      var s = e ? e.length : 0;
      if (r && s) {
        n = e[++o];
      }
      while (++o < s) {
        n = t(n, e[o], o, e);
      }
      return n;
    }
    function aZp(e) {
      return e.split("");
    }
    function lZp(e) {
      return e.match(/[^\x00-\x2f\x3a-\x40\x5b-\x60\x7b-\x7f]+/g) || [];
    }
    function cZp(e) {
      return function (t) {
        return e == null ? undefined : e[t];
      };
    }
    var uZp = cZp(nZp);
    function rZa(e) {
      return eZp.test(e);
    }
    function dZp(e) {
      return (/[a-z][A-Z]|[A-Z]{2,}[a-z]|[0-9][a-zA-Z]|[a-zA-Z][0-9]|[^a-zA-Z0-9 ]/).test(e);
    }
    function pZp(e) {
      return rZa(e) ? mZp(e) : aZp(e);
    }
    function mZp(e) {
      return e.match(QQp) || [];
    }
    function fZp(e) {
      return e.match(ZQp) || [];
    }
    var hZp = Object.prototype;
    var gZp = hZp.toString;
    var BQa = sZp.Symbol;
    var $Qa = BQa ? BQa.prototype : undefined;
    var HQa = $Qa ? $Qa.toString : undefined;
    function yZp(e, t, n) {
      var r = -1;
      var o = e.length;
      if (t < 0) {
        t = -t > o ? 0 : o + t;
      }
      if (n = n > o ? o : n, n < 0) {
        n += o;
      }
      o = t > n ? 0 : n - t >>> 0;
      t >>>= 0;
      var s = Array(o);
      while (++r < o) {
        s[r] = e[r + t];
      }
      return s;
    }
    function _Zp(e) {
      if (typeof e == "string") {
        return e;
      }
      if (vZp(e)) {
        return HQa ? HQa.call(e) : "";
      }
      var t = e + "";
      return t == "0" && 1 / e == -NQp ? "-0" : t;
    }
    function bZp(e, t, n) {
      var r = e.length;
      n = n === undefined ? r : n;
      return !t && n >= r ? e : yZp(e, t, n);
    }
    function SZp(e) {
      return function (t) {
        t = LVn(t);
        var n = rZa(t) ? pZp(t) : undefined;
        var r = n ? n[0] : t.charAt(0);
        var o = n ? bZp(n, 1).join("") : t.slice(1);
        return r[e]() + o;
      };
    }
    function TZp(e) {
      return function (t) {
        return iZp(kZp(RZp(t).replace(JQp, "")), e, "");
      };
    }
    function EZp(e) {
      return !!e && typeof e == "object";
    }
    function vZp(e) {
      return typeof e == "symbol" || EZp(e) && gZp.call(e) == "[object Symbol]";
    }
    function LVn(e) {
      return e == null ? "" : _Zp(e);
    }
    var wZp = TZp(function (e, t, n) {
      t = t.toLowerCase();
      return e + (n ? CZp(t) : t);
    });
    function CZp(e) {
      return xZp(LVn(e).toLowerCase());
    }
    function RZp(e) {
      e = LVn(e);
      return e && e.replace(/[\xc0-\xd6\xd8-\xf6\xf8-\xff\u0100-\u017f]/g, uZp).replace(XQp, "");
    }
    var xZp = SZp("toUpperCase");
    function kZp(e, t, n) {
      if (e = LVn(e), t = n ? undefined : t, t === undefined) {
        return dZp(e) ? fZp(e) : lZp(e);
      }
      return e.match(t) || [];
    }
    oZa.exports = wZp;
  });
  var aZa = __commonJS((hJ_, iZa) => {
    iZa.exports = Rxo;
    function Rxo(e, t) {
      if (typeof e === "string") {
        t = e;
        e = undefined;
      }
      var n = [];
      function r(s) {
        if (typeof s !== "string") {
          var i = o();
          if (Rxo.verbose) {
            console.log("codegen: " + i);
          }
          if (i = "return " + i, s) {
            var a = Object.keys(s);
            var l = Array(a.length + 1);
            var c = Array(a.length);
            var u = 0;
            while (u < a.length) {
              l[u] = a[u];
              c[u] = s[a[u++]];
            }
            l[u] = i;
            return Function.apply(null, l).apply(null, c);
          }
          return Function(i)();
        }
        var d = Array(arguments.length - 1);
        var p = 0;
        while (p < d.length) {
          d[p] = arguments[++p];
        }
        if (p = 0, s = s.replace(/%([%dfijs])/g, function (f, h) {
          var g = d[p++];
          switch (h) {
            case "d":
            case "f":
              return String(Number(g));
            case "i":
              return String(Math.floor(g));
            case "j":
              return JSON.stringify(g);
            case "s":
              return String(g);
          }
          return "%";
        }), p !== d.length) {
          throw Error("parameter count mismatch");
        }
        n.push(s);
        return r;
      }
      function o(s) {
        return "function " + IZp(s || t) + "(" + (e && e.join(",") || "") + `){
  ` + n.join(`
  `) + `
}`;
      }
      r.toString = o;
      return r;
    }
    Rxo.verbose = false;
    function IZp(e) {
      if (!e) {
        return "";
      }
      if (e = String(e).replace(/[^\w$]/g, ""), !e) {
        return "";
      }
      if (/^\d/.test(e)) {
        e = "_" + e;
      }
      return (/^(?:do|if|in|for|let|new|try|var|case|else|enum|eval|false|null|this|true|void|with|break|catch|class|const|super|throw|while|yield|delete|export|import|public|return|static|switch|typeof|default|extends|finally|package|private|continue|debugger|function|arguments|interface|protected|implements|instanceof)$/).test(e) ? e + "_" : e;
    }
  });
  var cZa = __commonJS((lZa, xxo) => {
    xxo.exports = PZp;
    function PZp(moduleName) {
      try {
        var mod = moduleName === "long" ? gRo() : moduleName === "buffer" ? require("buffer") : moduleName === "fs" ? require("fs") : eval("quire".replace(/^/, "re"))(moduleName);
        if (mod && (mod.length || Object.keys(mod).length)) {
          return mod;
        }
      } catch (e) {}
      return null;
    }
  });
  var dZa = __commonJS((gJ_, uZa) => {
    uZa.exports = sVt;
    var OZp = fRo();
    var DZp = cZa();
    var kxo = DZp("fs");
    function sVt(e, t, n) {
      if (typeof t === "function") {
        n = t;
        t = {};
      } else if (!t) {
        t = {};
      }
      if (!n) {
        return OZp(sVt, this, e, t);
      }
      if (!t.xhr && kxo && kxo.readFile) {
        return kxo.readFile(e, function (o, s) {
          return o && typeof XMLHttpRequest < "u" ? sVt.xhr(e, t, n) : o ? n(o) : n(null, t.binary ? s : s.toString("utf8"));
        });
      }
      return sVt.xhr(e, t, n);
    }
    sVt.xhr = function (t, n, r) {
      var o = new XMLHttpRequest();
      if (o.onreadystatechange = function () {
        if (o.readyState !== 4) {
          return;
        }
        if (o.status !== 0 && o.status !== 200) {
          return r(Error("status " + o.status));
        }
        if (n.binary) {
          var i = o.response;
          if (!i) {
            i = [];
            for (var a = 0; a < o.responseText.length; ++a) {
              i.push(o.responseText.charCodeAt(a) & 255);
            }
          }
          return r(null, typeof Uint8Array < "u" ? new Uint8Array(i) : i);
        }
        return r(null, o.responseText);
      }, n.binary) {
        if ("overrideMimeType" in o) {
          o.overrideMimeType("text/plain; charset=x-user-defined");
        }
        o.responseType = "arraybuffer";
      }
      o.open("GET", t);
      o.send();
    };
  });
  var fZa = __commonJS(mZa => {
    var Ixo = mZa;
    var pZa = Ixo.isAbsolute = function (t) {
      return /^(?:\/|\w+:)/.test(t);
    };
    var Axo = Ixo.normalize = function (t) {
      t = t.replace(/\\/g, "/").replace(/\/{2,}/g, "/");
      var n = t.split("/");
      var r = pZa(t);
      var o = "";
      if (r) {
        o = n.shift() + "/";
      }
      for (var s = 0; s < n.length;) {
        if (n[s] === "..") {
          if (s > 0 && n[s - 1] !== "..") {
            n.splice(--s, 2);
          } else if (r) {
            n.splice(s, 1);
          } else {
            ++s;
          }
        } else if (n[s] === ".") {
          n.splice(s, 1);
        } else {
          ++s;
        }
      }
      return o + n.join("/");
    };
    Ixo.resolve = function (t, n, r) {
      if (!r) {
        n = Axo(n);
      }
      if (pZa(n)) {
        return n;
      }
      if (!r) {
        t = Axo(t);
      }
      return (t = t.replace(/(?:\/|^)[^/]+$/, "")).length ? Axo(t + "/" + n) : n;
    };
  });
  var gZa = __commonJS(hZa => {
    var FVn = hZa;
    FVn.numberRe = /^(?![eE])[0-9]*(?:\.[0-9]*)?(?:[eE][+-]?[0-9]+)?$/;
    FVn.typeRefRe = /^(?:\.?[a-zA-Z_][a-zA-Z_0-9]*)(?:\.[a-zA-Z_][a-zA-Z_0-9]*)*$/;
    FVn.reservedRe = /^(?:do|if|in|for|let|new|try|var|case|else|enum|eval|false|null|this|true|void|with|break|catch|class|const|super|throw|while|yield|delete|export|import|public|return|static|switch|typeof|default|extends|finally|package|private|continue|debugger|function|arguments|interface|protected|implements|instanceof)$/;
    FVn.unsafePropertyRe = /^(?:__proto__|prototype|constructor)$/;
  });
  var Ayt = __commonJS((bJ_, bZa) => {
    bZa.exports = Wy;
    var UVn = d1e();
    ((Wy.prototype = Object.create(UVn.prototype)).constructor = Wy).className = "Namespace";
    var Pxo = u1e();
    var kyt = Y1();
    var MZp = gVe();
    var fVe;
    var xyt;
    var hVe;
    Wy.fromJSON = function (t, n, r) {
      r = kyt.checkDepth(r);
      return new Wy(t, n.options).addJSON(n.nested, r);
    };
    function yZa(e, t) {
      if (!(e && e.length)) {
        return;
      }
      var n = {};
      for (var r = 0; r < e.length; ++r) {
        n[e[r].name] = e[r].toJSON(t);
      }
      return n;
    }
    Wy.arrayToJSON = yZa;
    Wy.isReservedId = function (t, n) {
      if (t) {
        for (var r = 0; r < t.length; ++r) {
          if (typeof t[r] !== "string" && t[r][0] <= n && t[r][1] > n) {
            return true;
          }
        }
      }
      return false;
    };
    Wy.isReservedName = function (t, n) {
      if (t) {
        for (var r = 0; r < t.length; ++r) {
          if (t[r] === n) {
            return true;
          }
        }
      }
      return false;
    };
    function Wy(e, t) {
      UVn.call(this, e, t);
      this.nested = undefined;
      this._nestedArray = null;
      this._lookupCache = Object.create(null);
      this._needsRecursiveFeatureResolution = true;
      this._needsRecursiveResolve = true;
    }
    function _Za(e) {
      e._nestedArray = null;
      e._lookupCache = Object.create(null);
      var t = e;
      while (t = t.parent) {
        t._lookupCache = Object.create(null);
      }
      return e;
    }
    Object.defineProperty(Wy.prototype, "nestedArray", {
      get: function () {
        return this._nestedArray || (this._nestedArray = kyt.toArray(this.nested));
      }
    });
    Wy.prototype.toJSON = function (t) {
      return kyt.toObject(["options", this.options, "nested", yZa(this.nestedArray, t)]);
    };
    Wy.prototype.addJSON = function (t, n) {
      n = kyt.checkDepth(n);
      var r = this;
      if (t) {
        for (var o = Object.keys(t), s = 0, i; s < o.length; ++s) {
          i = t[o[s]];
          r.add((i.fields !== undefined ? fVe.fromJSON : i.values !== undefined ? hVe.fromJSON : i.methods !== undefined ? xyt.fromJSON : i.id !== undefined ? Pxo.fromJSON : Wy.fromJSON)(o[s], i, n + 1));
        }
      }
      return this;
    };
    Wy.prototype.get = function (t) {
      return this.nested && Object.prototype.hasOwnProperty.call(this.nested, t) ? this.nested[t] : null;
    };
    Wy.prototype.getEnum = function (t) {
      if (this.nested && Object.prototype.hasOwnProperty.call(this.nested, t) && this.nested[t] instanceof hVe) {
        return this.nested[t].values;
      }
      throw Error("no such enum: " + t);
    };
    Wy.prototype.add = function (t) {
      if (!(t instanceof Pxo && t.extend !== undefined || t instanceof fVe || t instanceof MZp || t instanceof hVe || t instanceof xyt || t instanceof Wy)) {
        throw TypeError("object must be a valid nested object");
      }
      if (t.name === "__proto__") {
        return this;
      }
      if (!this.nested) {
        this.nested = {};
      } else {
        var n = this.get(t.name);
        if (n) {
          if (n instanceof Wy && t instanceof Wy && !(n instanceof fVe || n instanceof xyt)) {
            var r = n.nestedArray;
            for (var o = 0; o < r.length; ++o) {
              t.add(r[o]);
            }
            if (this.remove(n), !this.nested) {
              this.nested = {};
            }
            t.setOptions(n.options, true);
          } else {
            throw Error("duplicate name '" + t.name + "' in " + this);
          }
        }
      }
      if (this.nested[t.name] = t, !(this instanceof fVe || this instanceof xyt || this instanceof hVe || this instanceof Pxo)) {
        if (!t._edition) {
          t._edition = t._defaultEdition;
        }
      }
      this._needsRecursiveFeatureResolution = true;
      this._needsRecursiveResolve = true;
      var s = this;
      while (s = s.parent) {
        s._needsRecursiveFeatureResolution = true;
        s._needsRecursiveResolve = true;
      }
      t.onAdd(this);
      return _Za(this);
    };
    Wy.prototype.remove = function (t) {
      if (!(t instanceof UVn)) {
        throw TypeError("object must be a ReflectionObject");
      }
      if (t.parent !== this) {
        throw Error(t + " is not a member of " + this);
      }
      if (delete this.nested[t.name], !Object.keys(this.nested).length) {
        this.nested = undefined;
      }
      t.onRemove(this);
      return _Za(this);
    };
    Wy.prototype.define = function (t, n) {
      if (kyt.isString(t)) {
        t = t.split(".");
      } else if (!Array.isArray(t)) {
        throw TypeError("illegal path");
      }
      if (t && t.length && t[0] === "") {
        throw Error("path must be relative");
      }
      var r = this;
      while (t.length > 0) {
        var o = t.shift();
        if (r.nested && r.nested[o]) {
          if (r = r.nested[o], !(r instanceof Wy)) {
            throw Error("path conflicts with non-namespace objects");
          }
        } else {
          r.add(r = new Wy(o));
        }
      }
      if (n) {
        r.addJSON(n);
      }
      return r;
    };
    Wy.prototype.resolveAll = function () {
      if (!this._needsRecursiveResolve) {
        return this;
      }
      this._resolveFeaturesRecursive(this._edition);
      var t = this.nestedArray;
      var n = 0;
      this.resolve();
      while (n < t.length) {
        if (t[n] instanceof Wy) {
          t[n++].resolveAll();
        } else {
          t[n++].resolve();
        }
      }
      this._needsRecursiveResolve = false;
      return this;
    };
    Wy.prototype._resolveFeaturesRecursive = function (t) {
      if (!this._needsRecursiveFeatureResolution) {
        return this;
      }
      this._needsRecursiveFeatureResolution = false;
      t = this._edition || t;
      UVn.prototype._resolveFeaturesRecursive.call(this, t);
      this.nestedArray.forEach(n => {
        n._resolveFeaturesRecursive(t);
      });
      return this;
    };
    Wy.prototype.lookup = function (t, n, r) {
      if (typeof n === "boolean") {
        r = n;
        n = undefined;
      } else if (n && !Array.isArray(n)) {
        n = [n];
      }
      if (kyt.isString(t) && t.length) {
        if (t === ".") {
          return this.root;
        }
        t = t.split(".");
      } else if (!t.length) {
        return this;
      }
      var o = t.join(".");
      if (t[0] === "") {
        return this.root.lookup(t.slice(1), n);
      }
      var s = this.root._fullyQualifiedObjects && this.root._fullyQualifiedObjects["." + o];
      if (s && (!n || n.indexOf(s.constructor) > -1)) {
        return s;
      }
      if (s = this._lookupImpl(t, o), s && (!n || n.indexOf(s.constructor) > -1)) {
        return s;
      }
      if (r) {
        return null;
      }
      var i = this;
      while (i.parent) {
        if (s = i.parent._lookupImpl(t, o), s && (!n || n.indexOf(s.constructor) > -1)) {
          return s;
        }
        i = i.parent;
      }
      return null;
    };
    Wy.prototype._lookupImpl = function (t, n) {
      if (Object.prototype.hasOwnProperty.call(this._lookupCache, n)) {
        return this._lookupCache[n];
      }
      var r = this.get(t[0]);
      var o = null;
      if (r) {
        if (t.length === 1) {
          o = r;
        } else if (r instanceof Wy) {
          t = t.slice(1);
          o = r._lookupImpl(t, t.join("."));
        }
      } else {
        for (var s = 0; s < this.nestedArray.length; ++s) {
          if (this._nestedArray[s] instanceof Wy && (r = this._nestedArray[s]._lookupImpl(t, n))) {
            o = r;
            break;
          }
        }
      }
      this._lookupCache[n] = o;
      return o;
    };
    Wy.prototype.lookupType = function (t) {
      var n = this.lookup(t, [fVe]);
      if (!n) {
        throw Error("no such type: " + t);
      }
      return n;
    };
    Wy.prototype.lookupEnum = function (t) {
      var n = this.lookup(t, [hVe]);
      if (!n) {
        throw Error("no such Enum '" + t + "' in " + this);
      }
      return n;
    };
    Wy.prototype.lookupTypeOrEnum = function (t) {
      var n = this.lookup(t, [fVe, hVe]);
      if (!n) {
        throw Error("no such Type or Enum '" + t + "' in " + this);
      }
      return n;
    };
    Wy.prototype.lookupService = function (t) {
      var n = this.lookup(t, [xyt]);
      if (!n) {
        throw Error("no such Service '" + t + "' in " + this);
      }
      return n;
    };
    Wy._configure = function (e, t, n) {
      fVe = e;
      xyt = t;
      hVe = n;
    };
  });
  var BVn = __commonJS((SJ_, SZa) => {
    SZa.exports = XEe;
    var Oxo = u1e();
    ((XEe.prototype = Object.create(Oxo.prototype)).constructor = XEe).className = "MapField";
    var NZp = yVe();
    var iVt = Y1();
    function XEe(e, t, n, r, o, s) {
      if (Oxo.call(this, e, t, r, undefined, undefined, o, s), !iVt.isString(n)) {
        throw TypeError("keyType must be a string");
      }
      this.keyType = n;
      this.resolvedKeyType = null;
      this.map = true;
    }
    XEe.fromJSON = function (t, n) {
      return new XEe(t, n.id, n.keyType, n.type, n.options, n.comment);
    };
    XEe.prototype.toJSON = function (t) {
      var n = t ? Boolean(t.keepComments) : false;
      return iVt.toObject(["keyType", this.keyType, "type", this.type, "id", this.id, "extend", this.extend, "options", this.options, "comment", n ? this.comment : undefined]);
    };
    XEe.prototype.resolve = function () {
      if (this.resolved) {
        return this;
      }
      if (NZp.mapKey[this.keyType] === undefined) {
        throw Error("invalid key type: " + this.keyType);
      }
      return Oxo.prototype.resolve.call(this);
    };
    XEe.d = function (t, n, r) {
      if (typeof r === "function") {
        r = iVt.decorateType(r).name;
      } else if (r && typeof r === "object") {
        r = iVt.decorateEnum(r).name;
      }
      return function (s, i) {
        iVt.decorateType(s.constructor).add(new XEe(i, t, n, r));
      };
    };
  });