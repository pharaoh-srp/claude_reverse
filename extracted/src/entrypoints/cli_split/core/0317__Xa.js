  var _Xa;
  var bXa;
  var Z8n;
  var OTLPTraceExporter;
  var SXa = __lazy(() => {
    _Xa = __toESM(qpe(), 1);
    bXa = __toESM(Kpe(), 1);
    Z8n = __toESM(zEe(), 1);
    OTLPTraceExporter = class j8t extends _Xa.OTLPExporterBase {
      constructor(e = {}) {
        super(Z8n.createOtlpHttpExportDelegate(Z8n.convertLegacyHttpOptions(e, "TRACES", "v1/traces", {
          "Content-Type": "application/json"
        }), bXa.JsonTraceSerializer));
      }
    };
  });
  var TXa = __lazy(() => {
    SXa();
  });
  var EXa = __lazy(() => {
    TXa();
  });
  var jRo = {};