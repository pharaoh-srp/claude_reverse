  var $Ro = __commonJS(K8n => {
    Object.defineProperty(K8n, "__esModule", {
      value: true
    });
    K8n.getSharedConfigurationFromEnvironment = undefined;
    var pXa = Gg();
    var mXa = Ji();
    function uXa(e) {
      let t = (0, pXa.getNumberFromEnv)(e);
      if (t != null) {
        if (Number.isFinite(t) && t > 0) {
          return t;
        }
        mXa.diag.warn(`Configuration: ${e} is invalid, expected number greater than 0 (actual: ${t})`);
      }
      return;
    }
    function qYp(e) {
      let t = uXa(`OTEL_EXPORTER_OTLP_${e}_TIMEOUT`);
      let n = uXa("OTEL_EXPORTER_OTLP_TIMEOUT");
      return t ?? n;
    }
    function dXa(e) {
      let t = (0, pXa.getStringFromEnv)(e)?.trim();
      if (t == null || t === "none" || t === "gzip") {
        return t;
      }
      mXa.diag.warn(`Configuration: ${e} is invalid, expected 'none' or 'gzip' (actual: '${t}')`);
      return;
    }
    function WYp(e) {
      let t = dXa(`OTEL_EXPORTER_OTLP_${e}_COMPRESSION`);
      let n = dXa("OTEL_EXPORTER_OTLP_COMPRESSION");
      return t ?? n;
    }
    function GYp(e) {
      return {
        timeoutMillis: qYp(e),
        compression: WYp(e)
      };
    }
    K8n.getSharedConfigurationFromEnvironment = GYp;
  });