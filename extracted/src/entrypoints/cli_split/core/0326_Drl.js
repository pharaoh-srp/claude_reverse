  var Drl;
  var Mrl;
  var cKn;
  var OTLPMetricExporter;
  var Nrl = __lazy(() => {
    Drl = __toESM(sVn(), 1);
    Mrl = __toESM(Kpe(), 1);
    cKn = __toESM(zEe(), 1);
    OTLPMetricExporter = class VVt extends Drl.OTLPMetricExporterBase {
      constructor(e) {
        super(cKn.createOtlpHttpExportDelegate(cKn.convertLegacyHttpOptions(e ?? {}, "METRICS", "v1/metrics", {
          "Content-Type": "application/x-protobuf"
        }), Mrl.ProtobufMetricsSerializer), e);
      }
    };
  });
  var Lrl = __lazy(() => {
    Nrl();
  });
  var Frl = __lazy(() => {
    Lrl();
  });
  var Url = {};