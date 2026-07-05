    rKn.getOtlpGrpcConfigurationFromEnv = undefined;
    var Trl = Gg();
    var GVt = qVt();
    var pim = zEe();
    var mim = require("fs");
    var fim = require("path");
    var vrl = Ji();
    function IAo(e, t) {
      if (e != null && e !== "") {
        return e;
      }
      if (t != null && t !== "") {
        return t;
      }
      return;
    }
    function him(e) {
      let t = process.env[`OTEL_EXPORTER_OTLP_${e}_HEADERS`]?.trim();
      let n = process.env.OTEL_EXPORTER_OTLP_HEADERS?.trim();
      let r = (0, Trl.parseKeyPairsIntoRecord)(t);
      let o = (0, Trl.parseKeyPairsIntoRecord)(n);
      if (Object.keys(r).length === 0 && Object.keys(o).length === 0) {
        return;
      }
      let s = Object.assign({}, o, r);
      let i = (0, GVt.createEmptyMetadata)();
      for (let [a, l] of Object.entries(s)) {
        i.set(a, l);
      }
      return i;
    }
    function gim(e) {
      let t = him(e);
      if (t == null) {
        return;
      }
      return () => t;
    }
    function yim(e) {
      let t = process.env[`OTEL_EXPORTER_OTLP_${e}_ENDPOINT`]?.trim();
      let n = process.env.OTEL_EXPORTER_OTLP_ENDPOINT?.trim();
      return IAo(t, n);
    }
    function _im(e) {
      let t = process.env[`OTEL_EXPORTER_OTLP_${e}_INSECURE`]?.toLowerCase().trim();
      let n = process.env.OTEL_EXPORTER_OTLP_INSECURE?.toLowerCase().trim();
      return IAo(t, n) === "true";
    }
    function PAo(e, t, n) {
      let r = process.env[e]?.trim();
      let o = process.env[t]?.trim();
      let s = IAo(r, o);
      if (s != null) {
        try {
          return mim.readFileSync(fim.resolve(process.cwd(), s));
        } catch {
          vrl.diag.warn(n);
          return;
        }
      } else {
        return;
      }
    }
    function bim(e) {
      return PAo(`OTEL_EXPORTER_OTLP_${e}_CLIENT_CERTIFICATE`, "OTEL_EXPORTER_OTLP_CLIENT_CERTIFICATE", "Failed to read client certificate chain file");
    }
    function Sim(e) {
      return PAo(`OTEL_EXPORTER_OTLP_${e}_CLIENT_KEY`, "OTEL_EXPORTER_OTLP_CLIENT_KEY", "Failed to read client certificate private key file");
    }
    function Erl(e) {
      return PAo(`OTEL_EXPORTER_OTLP_${e}_CERTIFICATE`, "OTEL_EXPORTER_OTLP_CERTIFICATE", "Failed to read root certificate file");
    }
    function wrl(e) {
      let t = Sim(e);
      let n = bim(e);
      let r = Erl(e);
      let o = t != null && n != null;
      if (r != null && !o) {
        vrl.diag.warn("Client key and certificate must both be provided, but one was missing - attempting to create credentials from just the root certificate");
        return (0, GVt.createSslCredentials)(Erl(e));
      }
      return (0, GVt.createSslCredentials)(r, t, n);
    }
    function Tim(e) {
      if (_im(e)) {
        return (0, GVt.createInsecureCredentials)();
      }
      return wrl(e);
    }
    function Eim(e) {
      return {
        ...(0, pim.getSharedConfigurationFromEnvironment)(e),
        metadata: gim(e),
        url: yim(e),
        credentials: t => {
          if (t.startsWith("http://")) {
            return () => (0, GVt.createInsecureCredentials)();
          } else if (t.startsWith("https://")) {
            return () => wrl(e);
          }
          return () => Tim(e);
        }
      };
    }
    rKn.getOtlpGrpcConfigurationFromEnv = Eim;
  });