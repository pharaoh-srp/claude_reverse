  var jal;
  var qal;
  var X7n;
  var OTLPTraceExporter_export;
  var Wal = __lazy(() => {
    jal = __toESM(qpe(), 1);
    qal = __toESM(Kpe(), 1);
    X7n = __toESM(zEe(), 1);
    OTLPTraceExporter_export = class yzt extends jal.OTLPExporterBase {
      constructor(e = {}) {
        super(X7n.createOtlpHttpExportDelegate(X7n.convertLegacyHttpOptions(e, "TRACES", "v1/traces", {
          "Content-Type": "application/x-protobuf"
        }), qal.ProtobufTraceSerializer));
      }
    };
  });
  var Gal = __lazy(() => {
    Wal();
  });
  var Val = __lazy(() => {
    Gal();
  });
  var zal = {};