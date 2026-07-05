  var xrl = __commonJS(oKn => {
    Object.defineProperty(oKn, "__esModule", {
      value: true
    });
    oKn.convertLegacyOtlpGrpcOptions = undefined;
    var vim = Ji();
    var Rrl = Srl();
    var wim = qVt();
    var Cim = Crl();
    function Rim(e, t) {
      if (e.headers) {
        vim.diag.warn("Headers cannot be set when using grpc");
      }
      let n = e.credentials;
      return (0, Rrl.mergeOtlpGrpcConfigurationWithDefaults)({
        url: e.url,
        metadata: () => e.metadata ?? (0, wim.createEmptyMetadata)(),
        compression: e.compression,
        timeoutMillis: e.timeoutMillis,
        concurrencyLimit: e.concurrencyLimit,
        credentials: n != null ? () => n : undefined,
        userAgent: e.userAgent
      }, (0, Cim.getOtlpGrpcConfigurationFromEnv)(t), (0, Rrl.getOtlpGrpcDefaultConfiguration)());
    }
    oKn.convertLegacyOtlpGrpcOptions = Rim;
  });
  var krl = __commonJS(sKn => {
    Object.defineProperty(sKn, "__esModule", {
      value: true
    });
    sKn.createOtlpGrpcExportDelegate = undefined;
    var xim = qpe();
    var kim = qVt();
    function Aim(e, t, n, r) {
      return (0, xim.createOtlpNetworkExportDelegate)(e, t, (0, kim.createOtlpGrpcExporterTransport)({
        address: e.url,
        compression: e.compression,
        credentials: e.credentials,
        metadata: e.metadata,
        userAgent: e.userAgent,
        grpcName: n,
        grpcPath: r
      }));
    }
    sKn.createOtlpGrpcExportDelegate = Aim;
  });
  var iKn = __commonJS(Zyt => {
    Object.defineProperty(Zyt, "__esModule", {
      value: true
    });
    Zyt.createOtlpGrpcExportDelegate = Zyt.convertLegacyOtlpGrpcOptions = undefined;
    var Iim = xrl();
    Object.defineProperty(Zyt, "convertLegacyOtlpGrpcOptions", {
      enumerable: true,
      get: function () {
        return Iim.convertLegacyOtlpGrpcOptions;
      }
    });
    var Pim = krl();
    Object.defineProperty(Zyt, "createOtlpGrpcExportDelegate", {
      enumerable: true,
      get: function () {
        return Pim.createOtlpGrpcExportDelegate;
      }
    });
  });
  var Prl = __commonJS(aKn => {
    Object.defineProperty(aKn, "__esModule", {
      value: true
    });
    aKn.OTLPMetricExporter = undefined;
    var Oim = sVn();
    var Arl = iKn();
    var Dim = Kpe();
    class Irl extends Oim.OTLPMetricExporterBase {
      constructor(e) {
        super((0, Arl.createOtlpGrpcExportDelegate)((0, Arl.convertLegacyOtlpGrpcOptions)(e ?? {}, "METRICS"), Dim.ProtobufMetricsSerializer, "MetricsExportService", "/opentelemetry.proto.collector.metrics.v1.MetricsService/Export"), e);
      }
    }
    aKn.OTLPMetricExporter = Irl;
  });
  var Orl = __commonJS(lKn => {
    Object.defineProperty(lKn, "__esModule", {
      value: true
    });
    lKn.OTLPMetricExporter = undefined;
    var Mim = Prl();
    Object.defineProperty(lKn, "OTLPMetricExporter", {
      enumerable: true,
      get: function () {
        return Mim.OTLPMetricExporter;
      }
    });
  });