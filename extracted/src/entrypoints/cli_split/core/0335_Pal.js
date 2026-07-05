  var Pal;
  var Oal;
  var K7n;
  var OTLPLogExporter_export;
  var Dal = __lazy(() => {
    Pal = __toESM(qpe(), 1);
    Oal = __toESM(Kpe(), 1);
    K7n = __toESM(zEe(), 1);
    OTLPLogExporter_export = class gzt extends Pal.OTLPExporterBase {
      constructor(e = {}) {
        super(K7n.createOtlpHttpExportDelegate(K7n.convertLegacyHttpOptions(e, "LOGS", "v1/logs", {
          "Content-Type": "application/x-protobuf"
        }), Oal.ProtobufLogsSerializer));
      }
    };
  });
  var Mal = __lazy(() => {
    Dal();
  });
  var Nal = __lazy(() => {
    Mal();
  });
  var Lal = {};