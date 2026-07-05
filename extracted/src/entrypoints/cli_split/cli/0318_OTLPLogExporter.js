  __export(jRo, {
    OTLPTraceExporter: () => OTLPTraceExporter
  });
  var qRo = __lazy(() => {
    EXa();
  });
  var vXa;
  var wXa;
  var eVn;
  var OTLPLogExporter;
  var CXa = __lazy(() => {
    vXa = __toESM(qpe(), 1);
    wXa = __toESM(Kpe(), 1);
    eVn = __toESM(zEe(), 1);
    OTLPLogExporter = class q8t extends vXa.OTLPExporterBase {
      constructor(e = {}) {
        super(eVn.createOtlpHttpExportDelegate(eVn.convertLegacyHttpOptions(e, "LOGS", "v1/logs", {
          "Content-Type": "application/json"
        }), wXa.JsonLogsSerializer));
      }
    };
  });
  var RXa = __lazy(() => {
    CXa();
  });
  var xXa = __lazy(() => {
    RXa();
  });
  var WRo = {};
  __export(WRo, {
    OTLPLogExporter: () => OTLPLogExporter
  });
  var GRo = __lazy(() => {
    xXa();
  });