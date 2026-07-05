  var fXa = __commonJS(J8n => {
    Object.defineProperty(J8n, "__esModule", {
      value: true
    });
    J8n.getNodeHttpConfigurationFromEnvironment = undefined;
    var VYp = require("fs");
    var zYp = require("path");
    var Ype = Gg();
    var Y8n = Ji();
    var KYp = $Ro();
    var YYp = D8t();
    var JYp = q8n();
    function XYp(e) {
      let t = (0, Ype.getStringFromEnv)(`OTEL_EXPORTER_OTLP_${e}_HEADERS`);
      let n = (0, Ype.getStringFromEnv)("OTEL_EXPORTER_OTLP_HEADERS");
      let r = (0, Ype.parseKeyPairsIntoRecord)(t);
      let o = (0, Ype.parseKeyPairsIntoRecord)(n);
      if (Object.keys(r).length === 0 && Object.keys(o).length === 0) {
        return;
      }
      return Object.assign({}, (0, Ype.parseKeyPairsIntoRecord)(n), (0, Ype.parseKeyPairsIntoRecord)(t));
    }
    function QYp(e) {
      try {
        return new URL(e).toString();
      } catch {
        Y8n.diag.warn(`Configuration: Could not parse environment-provided export URL: '${e}', falling back to undefined`);
        return;
      }
    }
    function ZYp(e, t) {
      try {
        new URL(e);
      } catch {
        Y8n.diag.warn(`Configuration: Could not parse environment-provided export URL: '${e}', falling back to undefined`);
        return;
      }
      if (!e.endsWith("/")) {
        e = e + "/";
      }
      e += t;
      try {
        new URL(e);
      } catch {
        Y8n.diag.warn(`Configuration: Provided URL appended with '${t}' is not a valid URL, using 'undefined' instead of '${e}'`);
        return;
      }
      return e;
    }
    function eJp(e) {
      let t = (0, Ype.getStringFromEnv)("OTEL_EXPORTER_OTLP_ENDPOINT");
      if (t === undefined) {
        return;
      }
      return ZYp(t, e);
    }
    function tJp(e) {
      let t = (0, Ype.getStringFromEnv)(`OTEL_EXPORTER_OTLP_${e}_ENDPOINT`);
      if (t === undefined) {
        return;
      }
      return QYp(t);
    }
    function HRo(e, t, n) {
      let r = (0, Ype.getStringFromEnv)(e);
      let o = (0, Ype.getStringFromEnv)(t);
      let s = r ?? o;
      if (s != null) {
        try {
          return VYp.readFileSync(zYp.resolve(process.cwd(), s));
        } catch {
          Y8n.diag.warn(n);
          return;
        }
      } else {
        return;
      }
    }
    function nJp(e) {
      return HRo(`OTEL_EXPORTER_OTLP_${e}_CLIENT_CERTIFICATE`, "OTEL_EXPORTER_OTLP_CLIENT_CERTIFICATE", "Failed to read client certificate chain file");
    }
    function rJp(e) {
      return HRo(`OTEL_EXPORTER_OTLP_${e}_CLIENT_KEY`, "OTEL_EXPORTER_OTLP_CLIENT_KEY", "Failed to read client certificate private key file");
    }
    function oJp(e) {
      return HRo(`OTEL_EXPORTER_OTLP_${e}_CERTIFICATE`, "OTEL_EXPORTER_OTLP_CERTIFICATE", "Failed to read root certificate file");
    }
    function sJp(e, t) {
      return {
        ...(0, KYp.getSharedConfigurationFromEnvironment)(e),
        url: tJp(e) ?? eJp(t),
        headers: (0, YYp.wrapStaticHeadersInFunction)(XYp(e)),
        agentFactory: (0, JYp.httpAgentFactoryFromOptions)({
          keepAlive: true,
          ca: oJp(e),
          cert: nJp(e),
          key: rJp(e)
        })
      };
    }
    J8n.getNodeHttpConfigurationFromEnvironment = sJp;
  });
  var hXa = __commonJS(X8n => {
    Object.defineProperty(X8n, "__esModule", {
      value: true
    });
    X8n.convertLegacyHeaders = undefined;
    var iJp = D8t();
    function aJp(e) {
      if (typeof e.headers === "function") {
        return e.headers;
      }
      return (0, iJp.wrapStaticHeadersInFunction)(e.headers);
    }
    X8n.convertLegacyHeaders = aJp;
  });
  var yXa = __commonJS(Q8n => {
    Object.defineProperty(Q8n, "__esModule", {
      value: true
    });
    Q8n.convertLegacyHttpOptions = undefined;
    var lJp = Ji();
    var gXa = q8n();
    var cJp = zEe();
    var uJp = fXa();
    var dJp = hXa();
    function pJp(e) {
      if (typeof e.httpAgentOptions === "function") {
        return e.httpAgentOptions;
      }
      let t = e.httpAgentOptions;
      if (e.keepAlive != null) {
        t = {
          keepAlive: e.keepAlive,
          ...t
        };
      }
      if (t != null) {
        return (0, cJp.httpAgentFactoryFromOptions)(t);
      } else {
        return;
      }
    }
    function mJp(e, t, n, r) {
      if (e.metadata) {
        lJp.diag.warn("Metadata cannot be set when using http");
      }
      return (0, gXa.mergeOtlpNodeHttpConfigurationWithDefaults)({
        url: e.url,
        headers: (0, dJp.convertLegacyHeaders)(e),
        concurrencyLimit: e.concurrencyLimit,
        timeoutMillis: e.timeoutMillis,
        compression: e.compression,
        agentFactory: pJp(e),
        userAgent: e.userAgent
      }, (0, uJp.getNodeHttpConfigurationFromEnvironment)(t, n), (0, gXa.getNodeHttpConfigurationDefaults)(r, n));
    }
    Q8n.convertLegacyHttpOptions = mJp;
  });
  var zEe = __commonJS(Jpe => {
    Object.defineProperty(Jpe, "__esModule", {
      value: true
    });
    Jpe.convertLegacyHttpOptions = Jpe.getSharedConfigurationFromEnvironment = Jpe.createOtlpHttpExportDelegate = Jpe.httpAgentFactoryFromOptions = undefined;
    var fJp = q8n();
    Object.defineProperty(Jpe, "httpAgentFactoryFromOptions", {
      enumerable: true,
      get: function () {
        return fJp.httpAgentFactoryFromOptions;
      }
    });
    var hJp = cXa();
    Object.defineProperty(Jpe, "createOtlpHttpExportDelegate", {
      enumerable: true,
      get: function () {
        return hJp.createOtlpHttpExportDelegate;
      }
    });
    var gJp = $Ro();
    Object.defineProperty(Jpe, "getSharedConfigurationFromEnvironment", {
      enumerable: true,
      get: function () {
        return gJp.getSharedConfigurationFromEnvironment;
      }
    });
    var yJp = yXa();
    Object.defineProperty(Jpe, "convertLegacyHttpOptions", {
      enumerable: true,
      get: function () {
        return yJp.convertLegacyHttpOptions;
      }
    });
  });