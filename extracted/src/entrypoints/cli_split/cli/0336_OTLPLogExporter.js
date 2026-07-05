  __export(Lal, {
    OTLPLogExporter: () => OTLPLogExporter_export
  });
  var Fal = __lazy(() => {
    Nal();
  });
  var $al = __commonJS(Y7n => {
    Object.defineProperty(Y7n, "__esModule", {
      value: true
    });
    Y7n.OTLPTraceExporter = undefined;
    var Ual = iKn();
    var wdm = Kpe();
    var Cdm = qpe();
    class Bal extends Cdm.OTLPExporterBase {
      constructor(e = {}) {
        super((0, Ual.createOtlpGrpcExportDelegate)((0, Ual.convertLegacyOtlpGrpcOptions)(e, "TRACES"), wdm.ProtobufTraceSerializer, "TraceExportService", "/opentelemetry.proto.collector.trace.v1.TraceService/Export"));
      }
    }
    Y7n.OTLPTraceExporter = Bal;
  });