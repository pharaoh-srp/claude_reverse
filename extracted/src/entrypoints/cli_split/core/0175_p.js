  var p$i = __commonJS(DPn => {
    Object.defineProperty(DPn, "__esModule", {
      value: true
    });
    DPn.ATTR_PROCESS_RUNTIME_NAME = undefined;
    DPn.ATTR_PROCESS_RUNTIME_NAME = "process.runtime.name";
  });
  var m$i = __commonJS(NPn => {
    Object.defineProperty(NPn, "__esModule", {
      value: true
    });
    NPn.SDK_INFO = undefined;
    var Aqd = GMi();
    var MPn = Hne();
    var Iqd = p$i();
    NPn.SDK_INFO = {
      [MPn.ATTR_TELEMETRY_SDK_NAME]: "opentelemetry",
      [Iqd.ATTR_PROCESS_RUNTIME_NAME]: "node",
      [MPn.ATTR_TELEMETRY_SDK_LANGUAGE]: MPn.TELEMETRY_SDK_LANGUAGE_VALUE_NODEJS,
      [MPn.ATTR_TELEMETRY_SDK_VERSION]: Aqd.VERSION
    };
  });
  var f$i = __commonJS(C2 => {
    Object.defineProperty(C2, "__esModule", {
      value: true
    });
    C2.SDK_INFO = C2.otperformance = C2._globalThis = C2.getStringListFromEnv = C2.getNumberFromEnv = C2.getBooleanFromEnv = C2.getStringFromEnv = undefined;
    var LPn = jMi();
    Object.defineProperty(C2, "getStringFromEnv", {
      enumerable: true,
      get: function () {
        return LPn.getStringFromEnv;
      }
    });
    Object.defineProperty(C2, "getBooleanFromEnv", {
      enumerable: true,
      get: function () {
        return LPn.getBooleanFromEnv;
      }
    });
    Object.defineProperty(C2, "getNumberFromEnv", {
      enumerable: true,
      get: function () {
        return LPn.getNumberFromEnv;
      }
    });
    Object.defineProperty(C2, "getStringListFromEnv", {
      enumerable: true,
      get: function () {
        return LPn.getStringListFromEnv;
      }
    });
    var Pqd = qMi();
    Object.defineProperty(C2, "_globalThis", {
      enumerable: true,
      get: function () {
        return Pqd._globalThis;
      }
    });
    var Oqd = WMi();
    Object.defineProperty(C2, "otperformance", {
      enumerable: true,
      get: function () {
        return Oqd.otperformance;
      }
    });
    var Dqd = m$i();
    Object.defineProperty(C2, "SDK_INFO", {
      enumerable: true,
      get: function () {
        return Dqd.SDK_INFO;
      }
    });
  });