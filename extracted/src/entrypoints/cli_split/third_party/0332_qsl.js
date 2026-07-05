  var qsl = __commonJS(s7n => {
    Object.defineProperty(s7n, "__esModule", {
      value: true
    });
    s7n.envDetector = undefined;
    var ycm = Ji();
    var _cm = Hne();
    var Hsl = fse();
    class jsl {
      _MAX_LENGTH = 255;
      _COMMA_SEPARATOR = ",";
      _LABEL_KEY_VALUE_SPLITTER = "=";
      detect(e) {
        let t = {};
        let n = (0, Hsl.getStringFromEnv)("OTEL_RESOURCE_ATTRIBUTES");
        let r = (0, Hsl.getStringFromEnv)("OTEL_SERVICE_NAME");
        if (n) {
          try {
            let o = this._parseResourceAttributes(n);
            Object.assign(t, o);
          } catch (o) {
            ycm.diag.debug(`EnvDetector failed: ${o instanceof Error ? o.message : o}`);
          }
        }
        if (r) {
          t[_cm.ATTR_SERVICE_NAME] = r;
        }
        return {
          attributes: t
        };
      }
      _parseResourceAttributes(e) {
        if (!e) {
          return {};
        }
        let t = {};
        let n = e.split(this._COMMA_SEPARATOR).filter(r => r.trim() !== "");
        for (let r of n) {
          let o = r.split(this._LABEL_KEY_VALUE_SPLITTER);
          if (o.length !== 2) {
            throw Error(`Invalid format for OTEL_RESOURCE_ATTRIBUTES: "${r}". Expected format: key=value. The ',' and '=' characters must be percent-encoded in keys and values.`);
          }
          let [s, i] = o;
          let a = s.trim();
          let l = i.trim();
          if (a.length === 0) {
            throw Error(`Invalid OTEL_RESOURCE_ATTRIBUTES: empty attribute key in "${r}".`);
          }
          let c;
          let u;
          try {
            c = decodeURIComponent(a);
            u = decodeURIComponent(l);
          } catch (d) {
            throw Error(`Failed to percent-decode OTEL_RESOURCE_ATTRIBUTES entry "${r}": ${d instanceof Error ? d.message : d}`);
          }
          if (c.length > this._MAX_LENGTH) {
            throw Error(`Attribute key exceeds the maximum length of ${this._MAX_LENGTH} characters: "${c}".`);
          }
          if (u.length > this._MAX_LENGTH) {
            throw Error(`Attribute value exceeds the maximum length of ${this._MAX_LENGTH} characters for key "${c}".`);
          }
          t[c] = u;
        }
        return t;
      }
    }
    s7n.envDetector = new jsl();
  });
  var uzt = __commonJS(ml => {
    Object.defineProperty(ml, "__esModule", {
      value: true
    });
    ml.ATTR_WEBENGINE_VERSION = ml.ATTR_WEBENGINE_NAME = ml.ATTR_WEBENGINE_DESCRIPTION = ml.ATTR_SERVICE_NAMESPACE = ml.ATTR_SERVICE_INSTANCE_ID = ml.ATTR_PROCESS_RUNTIME_VERSION = ml.ATTR_PROCESS_RUNTIME_NAME = ml.ATTR_PROCESS_RUNTIME_DESCRIPTION = ml.ATTR_PROCESS_PID = ml.ATTR_PROCESS_OWNER = ml.ATTR_PROCESS_EXECUTABLE_PATH = ml.ATTR_PROCESS_EXECUTABLE_NAME = ml.ATTR_PROCESS_COMMAND_ARGS = ml.ATTR_PROCESS_COMMAND = ml.ATTR_OS_VERSION = ml.ATTR_OS_TYPE = ml.ATTR_K8S_POD_NAME = ml.ATTR_K8S_NAMESPACE_NAME = ml.ATTR_K8S_DEPLOYMENT_NAME = ml.ATTR_K8S_CLUSTER_NAME = ml.ATTR_HOST_TYPE = ml.ATTR_HOST_NAME = ml.ATTR_HOST_IMAGE_VERSION = ml.ATTR_HOST_IMAGE_NAME = ml.ATTR_HOST_IMAGE_ID = ml.ATTR_HOST_ID = ml.ATTR_HOST_ARCH = ml.ATTR_CONTAINER_NAME = ml.ATTR_CONTAINER_IMAGE_TAGS = ml.ATTR_CONTAINER_IMAGE_NAME = ml.ATTR_CONTAINER_ID = ml.ATTR_CLOUD_REGION = ml.ATTR_CLOUD_PROVIDER = ml.ATTR_CLOUD_AVAILABILITY_ZONE = ml.ATTR_CLOUD_ACCOUNT_ID = undefined;
    ml.ATTR_CLOUD_ACCOUNT_ID = "cloud.account.id";
    ml.ATTR_CLOUD_AVAILABILITY_ZONE = "cloud.availability_zone";
    ml.ATTR_CLOUD_PROVIDER = "cloud.provider";
    ml.ATTR_CLOUD_REGION = "cloud.region";
    ml.ATTR_CONTAINER_ID = "container.id";
    ml.ATTR_CONTAINER_IMAGE_NAME = "container.image.name";
    ml.ATTR_CONTAINER_IMAGE_TAGS = "container.image.tags";
    ml.ATTR_CONTAINER_NAME = "container.name";
    ml.ATTR_HOST_ARCH = "host.arch";
    ml.ATTR_HOST_ID = "host.id";
    ml.ATTR_HOST_IMAGE_ID = "host.image.id";
    ml.ATTR_HOST_IMAGE_NAME = "host.image.name";
    ml.ATTR_HOST_IMAGE_VERSION = "host.image.version";
    ml.ATTR_HOST_NAME = "host.name";
    ml.ATTR_HOST_TYPE = "host.type";
    ml.ATTR_K8S_CLUSTER_NAME = "k8s.cluster.name";
    ml.ATTR_K8S_DEPLOYMENT_NAME = "k8s.deployment.name";
    ml.ATTR_K8S_NAMESPACE_NAME = "k8s.namespace.name";
    ml.ATTR_K8S_POD_NAME = "k8s.pod.name";
    ml.ATTR_OS_TYPE = "os.type";
    ml.ATTR_OS_VERSION = "os.version";
    ml.ATTR_PROCESS_COMMAND = "process.command";
    ml.ATTR_PROCESS_COMMAND_ARGS = "process.command_args";
    ml.ATTR_PROCESS_EXECUTABLE_NAME = "process.executable.name";
    ml.ATTR_PROCESS_EXECUTABLE_PATH = "process.executable.path";
    ml.ATTR_PROCESS_OWNER = "process.owner";
    ml.ATTR_PROCESS_PID = "process.pid";
    ml.ATTR_PROCESS_RUNTIME_DESCRIPTION = "process.runtime.description";
    ml.ATTR_PROCESS_RUNTIME_NAME = "process.runtime.name";
    ml.ATTR_PROCESS_RUNTIME_VERSION = "process.runtime.version";
    ml.ATTR_SERVICE_INSTANCE_ID = "service.instance.id";
    ml.ATTR_SERVICE_NAMESPACE = "service.namespace";
    ml.ATTR_WEBENGINE_DESCRIPTION = "webengine.description";
    ml.ATTR_WEBENGINE_NAME = "webengine.name";
    ml.ATTR_WEBENGINE_VERSION = "webengine.version";
  });
  var a7n = __commonJS(i7n => {
    Object.defineProperty(i7n, "__esModule", {
      value: true
    });
    i7n.execAsync = undefined;
    var bcm = require("child_process");
    var Scm = require("util");
    i7n.execAsync = Scm.promisify(bcm.exec);
  });
  var Wsl = __commonJS(l7n => {
    Object.defineProperty(l7n, "__esModule", {
      value: true
    });
    l7n.getMachineId = undefined;
    var Tcm = a7n();
    var Ecm = Ji();
    async function vcm() {
      try {
        let t = (await (0, Tcm.execAsync)('ioreg -rd1 -c "IOPlatformExpertDevice"')).stdout.split(`
`).find(r => r.includes("IOPlatformUUID"));
        if (!t) {
          return;
        }
        let n = t.split('" = "');
        if (n.length === 2) {
          return n[1].slice(0, -1);
        }
      } catch (e) {
        Ecm.diag.debug(`error reading machine id: ${e}`);
      }
      return;
    }
    l7n.getMachineId = vcm;
  });
  var Gsl = __commonJS(c7n => {
    Object.defineProperty(c7n, "__esModule", {
      value: true
    });
    c7n.getMachineId = undefined;
    var wcm = require("fs");
    var Ccm = Ji();
    async function Rcm() {
      let e = ["/etc/machine-id", "/var/lib/dbus/machine-id"];
      for (let t of e) {
        try {
          return (await wcm.promises.readFile(t, {
            encoding: "utf8"
          })).trim();
        } catch (n) {
          Ccm.diag.debug(`error reading machine id: ${n}`);
        }
      }
      return;
    }
    c7n.getMachineId = Rcm;
  });
  var zsl = __commonJS(u7n => {
    Object.defineProperty(u7n, "__esModule", {
      value: true
    });
    u7n.getMachineId = undefined;
    var xcm = require("fs");
    var kcm = a7n();
    var Vsl = Ji();
    async function Acm() {
      try {
        return (await xcm.promises.readFile("/etc/hostid", {
          encoding: "utf8"
        })).trim();
      } catch (e) {
        Vsl.diag.debug(`error reading machine id: ${e}`);
      }
      try {
        return (await (0, kcm.execAsync)("kenv -q smbios.system.uuid")).stdout.trim();
      } catch (e) {
        Vsl.diag.debug(`error reading machine id: ${e}`);
      }
      return;
    }
    u7n.getMachineId = Acm;
  });
  var Ysl = __commonJS(d7n => {
    Object.defineProperty(d7n, "__esModule", {
      value: true
    });
    d7n.getMachineId = undefined;
    var Ksl = require("process");
    var Icm = a7n();
    var Pcm = Ji();
    async function Ocm() {
      let t = "%windir%\\System32\\REG.exe";
      if (Ksl.arch === "ia32" && "PROCESSOR_ARCHITEW6432" in Ksl.env) {
        t = "%windir%\\sysnative\\cmd.exe /c " + t;
      }
      try {
        let r = (await (0, Icm.execAsync)(`${t} QUERY HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Cryptography /v MachineGuid`)).stdout.split("REG_SZ");
        if (r.length === 2) {
          return r[1].trim();
        }
      } catch (n) {
        Pcm.diag.debug(`error reading machine id: ${n}`);
      }
      return;
    }
    d7n.getMachineId = Ocm;
  });
  var Jsl = __commonJS(p7n => {
    Object.defineProperty(p7n, "__esModule", {
      value: true
    });
    p7n.getMachineId = undefined;
    var Dcm = Ji();
    async function Mcm() {
      Dcm.diag.debug("could not read machine-id: unsupported platform");
      return;
    }
    p7n.getMachineId = Mcm;
  });
  var Xsl = __commonJS(m7n => {
    Object.defineProperty(m7n, "__esModule", {
      value: true
    });
    m7n.getMachineId = undefined;
    var Ncm = require("process");
    var $Ve;
    async function Lcm() {
      if (!$Ve) {
        switch (Ncm.platform) {
          case "darwin":
            $Ve = (await Promise.resolve().then(() => __toESM(Wsl()))).getMachineId;
            break;
          case "linux":
            $Ve = (await Promise.resolve().then(() => __toESM(Gsl()))).getMachineId;
            break;
          case "freebsd":
            $Ve = (await Promise.resolve().then(() => __toESM(zsl()))).getMachineId;
            break;
          case "win32":
            $Ve = (await Promise.resolve().then(() => __toESM(Ysl()))).getMachineId;
            break;
          default:
            $Ve = (await Promise.resolve().then(() => __toESM(Jsl()))).getMachineId;
            break;
        }
      }
      return $Ve();
    }
    m7n.getMachineId = Lcm;
  });
  var l0o = __commonJS(g_t => {
    Object.defineProperty(g_t, "__esModule", {
      value: true
    });
    g_t.normalizeType = g_t.normalizeArch = undefined;
    var Fcm = e => {
      switch (e) {
        case "arm":
          return "arm32";
        case "ppc":
          return "ppc32";
        case "x64":
          return "amd64";
        default:
          return e;
      }
    };
    g_t.normalizeArch = Fcm;
    var Ucm = e => {
      switch (e) {
        case "sunos":
          return "solaris";
        case "win32":
          return "windows";
        default:
          return e;
      }
    };
    g_t.normalizeType = Ucm;
  });
  var eil = __commonJS(f7n => {
    Object.defineProperty(f7n, "__esModule", {
      value: true
    });
    f7n.hostDetector = undefined;
    var c0o = uzt();
    var Qsl = require("os");
    var Bcm = Xsl();
    var $cm = l0o();
    class Zsl {
      detect(e) {
        return {
          attributes: {
            [c0o.ATTR_HOST_NAME]: (0, Qsl.hostname)(),
            [c0o.ATTR_HOST_ARCH]: (0, $cm.normalizeArch)((0, Qsl.arch)()),
            [c0o.ATTR_HOST_ID]: (0, Bcm.getMachineId)()
          }
        };
      }
    }
    f7n.hostDetector = new Zsl();
  });
  var oil = __commonJS(h7n => {
    Object.defineProperty(h7n, "__esModule", {
      value: true
    });
    h7n.osDetector = undefined;
    var til = uzt();
    var nil = require("os");
    var Hcm = l0o();
    class ril {
      detect(e) {
        return {
          attributes: {
            [til.ATTR_OS_TYPE]: (0, Hcm.normalizeType)((0, nil.platform)()),
            [til.ATTR_OS_VERSION]: (0, nil.release)()
          }
        };
      }
    }
    h7n.osDetector = new ril();
  });
  var iil = __commonJS(g7n => {
    Object.defineProperty(g7n, "__esModule", {
      value: true
    });
    g7n.processDetector = undefined;
    var jcm = Ji();
    var cve = uzt();
    var qcm = require("os");
    class sil {
      detect(e) {
        let t = {
          [cve.ATTR_PROCESS_PID]: process.pid,
          [cve.ATTR_PROCESS_EXECUTABLE_NAME]: process.title,
          [cve.ATTR_PROCESS_EXECUTABLE_PATH]: process.execPath,
          [cve.ATTR_PROCESS_COMMAND_ARGS]: [process.argv[0], ...process.execArgv, ...process.argv.slice(1)],
          [cve.ATTR_PROCESS_RUNTIME_VERSION]: process.versions.node,
          [cve.ATTR_PROCESS_RUNTIME_NAME]: "nodejs",
          [cve.ATTR_PROCESS_RUNTIME_DESCRIPTION]: "Node.js"
        };
        if (process.argv.length > 1) {
          t[cve.ATTR_PROCESS_COMMAND] = process.argv[1];
        }
        try {
          let n = qcm.userInfo();
          t[cve.ATTR_PROCESS_OWNER] = n.username;
        } catch (n) {
          jcm.diag.debug(`error obtaining process owner: ${n}`);
        }
        return {
          attributes: t
        };
      }
    }
    g7n.processDetector = new sil();
  });
  var lil = __commonJS(y7n => {
    Object.defineProperty(y7n, "__esModule", {
      value: true
    });
    y7n.serviceInstanceIdDetector = undefined;
    var Wcm = uzt();
    var Gcm = require("crypto");
    class ail {
      detect(e) {
        return {
          attributes: {
            [Wcm.ATTR_SERVICE_INSTANCE_ID]: (0, Gcm.randomUUID)()
          }
        };
      }
    }
    y7n.serviceInstanceIdDetector = new ail();
  });
  var cil = __commonJS(gme => {
    Object.defineProperty(gme, "__esModule", {
      value: true
    });
    gme.serviceInstanceIdDetector = gme.processDetector = gme.osDetector = gme.hostDetector = undefined;
    var Vcm = eil();
    Object.defineProperty(gme, "hostDetector", {
      enumerable: true,
      get: function () {
        return Vcm.hostDetector;
      }
    });
    var zcm = oil();
    Object.defineProperty(gme, "osDetector", {
      enumerable: true,
      get: function () {
        return zcm.osDetector;
      }
    });
    var Kcm = iil();
    Object.defineProperty(gme, "processDetector", {
      enumerable: true,
      get: function () {
        return Kcm.processDetector;
      }
    });
    var Ycm = lil();
    Object.defineProperty(gme, "serviceInstanceIdDetector", {
      enumerable: true,
      get: function () {
        return Ycm.serviceInstanceIdDetector;
      }
    });
  });
  var uil = __commonJS(yme => {
    Object.defineProperty(yme, "__esModule", {
      value: true
    });
    yme.serviceInstanceIdDetector = yme.processDetector = yme.osDetector = yme.hostDetector = undefined;
    var _7n = cil();
    Object.defineProperty(yme, "hostDetector", {
      enumerable: true,
      get: function () {
        return _7n.hostDetector;
      }
    });
    Object.defineProperty(yme, "osDetector", {
      enumerable: true,
      get: function () {
        return _7n.osDetector;
      }
    });
    Object.defineProperty(yme, "processDetector", {
      enumerable: true,
      get: function () {
        return _7n.processDetector;
      }
    });
    Object.defineProperty(yme, "serviceInstanceIdDetector", {
      enumerable: true,
      get: function () {
        return _7n.serviceInstanceIdDetector;
      }
    });
  });
  var dil = __commonJS(y_t => {
    Object.defineProperty(y_t, "__esModule", {
      value: true
    });
    y_t.noopDetector = y_t.NoopDetector = undefined;
    class u0o {
      detect() {
        return {
          attributes: {}
        };
      }
    }
    y_t.NoopDetector = u0o;
    y_t.noopDetector = new u0o();
  });
  var pil = __commonJS($9 => {
    Object.defineProperty($9, "__esModule", {
      value: true
    });
    $9.noopDetector = $9.serviceInstanceIdDetector = $9.processDetector = $9.osDetector = $9.hostDetector = $9.envDetector = undefined;
    var Jcm = qsl();
    Object.defineProperty($9, "envDetector", {
      enumerable: true,
      get: function () {
        return Jcm.envDetector;
      }
    });
    var b7n = uil();
    Object.defineProperty($9, "hostDetector", {
      enumerable: true,
      get: function () {
        return b7n.hostDetector;
      }
    });
    Object.defineProperty($9, "osDetector", {
      enumerable: true,
      get: function () {
        return b7n.osDetector;
      }
    });
    Object.defineProperty($9, "processDetector", {
      enumerable: true,
      get: function () {
        return b7n.processDetector;
      }
    });
    Object.defineProperty($9, "serviceInstanceIdDetector", {
      enumerable: true,
      get: function () {
        return b7n.serviceInstanceIdDetector;
      }
    });
    var Xcm = dil();
    Object.defineProperty($9, "noopDetector", {
      enumerable: true,
      get: function () {
        return Xcm.noopDetector;
      }
    });
  });
  var mil = __commonJS(w0 => {
    Object.defineProperty(w0, "__esModule", {
      value: true
    });
    w0.defaultServiceName = w0.emptyResource = w0.defaultResource = w0.resourceFromAttributes = w0.serviceInstanceIdDetector = w0.processDetector = w0.osDetector = w0.hostDetector = w0.envDetector = w0.detectResources = undefined;
    var Qcm = $sl();
    Object.defineProperty(w0, "detectResources", {
      enumerable: true,
      get: function () {
        return Qcm.detectResources;
      }
    });
    var dzt = pil();
    Object.defineProperty(w0, "envDetector", {
      enumerable: true,
      get: function () {
        return dzt.envDetector;
      }
    });
    Object.defineProperty(w0, "hostDetector", {
      enumerable: true,
      get: function () {
        return dzt.hostDetector;
      }
    });
    Object.defineProperty(w0, "osDetector", {
      enumerable: true,
      get: function () {
        return dzt.osDetector;
      }
    });
    Object.defineProperty(w0, "processDetector", {
      enumerable: true,
      get: function () {
        return dzt.processDetector;
      }
    });
    Object.defineProperty(w0, "serviceInstanceIdDetector", {
      enumerable: true,
      get: function () {
        return dzt.serviceInstanceIdDetector;
      }
    });
    var d0o = i0o();
    Object.defineProperty(w0, "resourceFromAttributes", {
      enumerable: true,
      get: function () {
        return d0o.resourceFromAttributes;
      }
    });
    Object.defineProperty(w0, "defaultResource", {
      enumerable: true,
      get: function () {
        return d0o.defaultResource;
      }
    });
    Object.defineProperty(w0, "emptyResource", {
      enumerable: true,
      get: function () {
        return d0o.emptyResource;
      }
    });
    var Zcm = r0o();
    Object.defineProperty(w0, "defaultServiceName", {
      enumerable: true,
      get: function () {
        return Zcm.defaultServiceName;
      }
    });
  });
  var hil = __commonJS(S7n => {
    Object.defineProperty(S7n, "__esModule", {
      value: true
    });
    S7n.ViewRegistry = undefined;
    class fil {
      _registeredViews = [];
      addView(e) {
        this._registeredViews.push(e);
      }
      findViews(e, t) {
        return this._registeredViews.filter(r => this._matchInstrument(r.instrumentSelector, e) && this._matchMeter(r.meterSelector, t));
      }
      _matchInstrument(e, t) {
        return (e.getType() === undefined || t.type === e.getType()) && e.getNameFilter().match(t.name) && e.getUnitFilter().match(t.unit);
      }
      _matchMeter(e, t) {
        return e.getNameFilter().match(t.name) && (t.version === undefined || e.getVersionFilter().match(t.version)) && (t.schemaUrl === undefined || e.getSchemaUrlFilter().match(t.schemaUrl));
      }
    }
    S7n.ViewRegistry = fil;
  });
  var pzt = __commonJS(_me => {
    Object.defineProperty(_me, "__esModule", {
      value: true
    });
    _me.isValidName = _me.isDescriptorCompatibleWith = _me.createInstrumentDescriptorWithView = _me.createInstrumentDescriptor = undefined;
    var gil = Ji();
    var eum = mme();
    function tum(e, t, n) {
      if (!yil(e)) {
        gil.diag.warn(`Invalid metric name: "${e}". The metric name should be a ASCII string with a length no greater than 255 characters.`);
      }
      return {
        name: e,
        type: t,
        description: n?.description ?? "",
        unit: n?.unit ?? "",
        valueType: n?.valueType ?? gil.ValueType.DOUBLE,
        advice: n?.advice ?? {}
      };
    }
    _me.createInstrumentDescriptor = tum;
    function num(e, t) {
      return {
        name: e.name ?? t.name,
        description: e.description ?? t.description,
        type: t.type,
        unit: t.unit,
        valueType: t.valueType,
        advice: t.advice
      };
    }
    _me.createInstrumentDescriptorWithView = num;
    function rum(e, t) {
      return (0, eum.equalsCaseInsensitive)(e.name, t.name) && e.unit === t.unit && e.type === t.type && e.valueType === t.valueType;
    }
    _me.isDescriptorCompatibleWith = rum;
    function yil(e) {
      return (/^[a-z][a-z0-9_.\-/]{0,254}$/i).test(e);
    }
    _me.isValidName = yil;
  });
  var T7n = __commonJS(C0 => {
    Object.defineProperty(C0, "__esModule", {
      value: true
    });
    C0.isObservableInstrument = C0.ObservableUpDownCounterInstrument = C0.ObservableGaugeInstrument = C0.ObservableCounterInstrument = C0.ObservableInstrument = C0.HistogramInstrument = C0.GaugeInstrument = C0.CounterInstrument = C0.UpDownCounterInstrument = C0.SyncInstrument = undefined;
    var __t = Ji();
    var sum = fse();
    class b_t {
      _writableMetricStorage;
      _descriptor;
      constructor(e, t) {
        this._writableMetricStorage = e;
        this._descriptor = t;
      }
      _record(e, t = {}, n = __t.context.active()) {
        if (typeof e !== "number") {
          __t.diag.warn(`non-number value provided to metric ${this._descriptor.name}: ${e}`);
          return;
        }
        if (this._descriptor.valueType === __t.ValueType.INT && !Number.isInteger(e)) {
          if (__t.diag.warn(`INT value type cannot accept a floating-point value for ${this._descriptor.name}, ignoring the fractional digits.`), e = Math.trunc(e), !Number.isInteger(e)) {
            return;
          }
        }
        this._writableMetricStorage.record(e, t, n, (0, sum.millisToHrTime)(Date.now()));
      }
    }
    C0.SyncInstrument = b_t;
    class _il extends b_t {
      add(e, t, n) {
        this._record(e, t, n);
      }
    }
    C0.UpDownCounterInstrument = _il;
    class bil extends b_t {
      add(e, t, n) {
        if (e < 0) {
          __t.diag.warn(`negative value provided to counter ${this._descriptor.name}: ${e}`);
          return;
        }
        this._record(e, t, n);
      }
    }
    C0.CounterInstrument = bil;
    class Sil extends b_t {
      record(e, t, n) {
        this._record(e, t, n);
      }
    }
    C0.GaugeInstrument = Sil;
    class Til extends b_t {
      record(e, t, n) {
        if (e < 0) {
          __t.diag.warn(`negative value provided to histogram ${this._descriptor.name}: ${e}`);
          return;
        }
        this._record(e, t, n);
      }
    }
    C0.HistogramInstrument = Til;
    class S_t {
      _metricStorages;
      _descriptor;
      _observableRegistry;
      constructor(e, t, n) {
        this._descriptor = e;
        this._metricStorages = t;
        this._observableRegistry = n;
      }
      addCallback(e) {
        this._observableRegistry.addCallback(e, this);
      }
      removeCallback(e) {
        this._observableRegistry.removeCallback(e, this);
      }
    }
    C0.ObservableInstrument = S_t;
    class Eil extends S_t {}
    C0.ObservableCounterInstrument = Eil;
    class vil extends S_t {}
    C0.ObservableGaugeInstrument = vil;
    class wil extends S_t {}
    C0.ObservableUpDownCounterInstrument = wil;
    function ium(e) {
      return e instanceof S_t;
    }
    C0.isObservableInstrument = ium;
  });
  var Ril = __commonJS(E7n => {
    Object.defineProperty(E7n, "__esModule", {
      value: true
    });
    E7n.Meter = undefined;
    var HVe = pzt();
    var jVe = T7n();
    var qVe = lve();
    class Cil {
      _meterSharedState;
      constructor(e) {
        this._meterSharedState = e;
      }
      createGauge(e, t) {
        let n = (0, HVe.createInstrumentDescriptor)(e, qVe.InstrumentType.GAUGE, t);
        let r = this._meterSharedState.registerMetricStorage(n);
        return new jVe.GaugeInstrument(r, n);
      }
      createHistogram(e, t) {
        let n = (0, HVe.createInstrumentDescriptor)(e, qVe.InstrumentType.HISTOGRAM, t);
        let r = this._meterSharedState.registerMetricStorage(n);
        return new jVe.HistogramInstrument(r, n);
      }
      createCounter(e, t) {
        let n = (0, HVe.createInstrumentDescriptor)(e, qVe.InstrumentType.COUNTER, t);
        let r = this._meterSharedState.registerMetricStorage(n);
        return new jVe.CounterInstrument(r, n);
      }
      createUpDownCounter(e, t) {
        let n = (0, HVe.createInstrumentDescriptor)(e, qVe.InstrumentType.UP_DOWN_COUNTER, t);
        let r = this._meterSharedState.registerMetricStorage(n);
        return new jVe.UpDownCounterInstrument(r, n);
      }
      createObservableGauge(e, t) {
        let n = (0, HVe.createInstrumentDescriptor)(e, qVe.InstrumentType.OBSERVABLE_GAUGE, t);
        let r = this._meterSharedState.registerAsyncMetricStorage(n);
        return new jVe.ObservableGaugeInstrument(n, r, this._meterSharedState.observableRegistry);
      }
      createObservableCounter(e, t) {
        let n = (0, HVe.createInstrumentDescriptor)(e, qVe.InstrumentType.OBSERVABLE_COUNTER, t);
        let r = this._meterSharedState.registerAsyncMetricStorage(n);
        return new jVe.ObservableCounterInstrument(n, r, this._meterSharedState.observableRegistry);
      }
      createObservableUpDownCounter(e, t) {
        let n = (0, HVe.createInstrumentDescriptor)(e, qVe.InstrumentType.OBSERVABLE_UP_DOWN_COUNTER, t);
        let r = this._meterSharedState.registerAsyncMetricStorage(n);
        return new jVe.ObservableUpDownCounterInstrument(n, r, this._meterSharedState.observableRegistry);
      }
      addBatchObservableCallback(e, t) {
        this._meterSharedState.observableRegistry.addBatchCallback(e, t);
      }
      removeBatchObservableCallback(e, t) {
        this._meterSharedState.observableRegistry.removeBatchCallback(e, t);
      }
    }
    E7n.Meter = Cil;
  });
  var p0o = __commonJS(v7n => {
    Object.defineProperty(v7n, "__esModule", {
      value: true
    });
    v7n.MetricStorage = undefined;
    var aum = pzt();
    class xil {
      _instrumentDescriptor;
      constructor(e) {
        this._instrumentDescriptor = e;
      }
      getInstrumentDescriptor() {
        return this._instrumentDescriptor;
      }
      updateDescription(e) {
        this._instrumentDescriptor = (0, aum.createInstrumentDescriptor)(this._instrumentDescriptor.name, this._instrumentDescriptor.type, {
          description: e,
          valueType: this._instrumentDescriptor.valueType,
          unit: this._instrumentDescriptor.unit,
          advice: this._instrumentDescriptor.advice
        });
      }
    }
    v7n.MetricStorage = xil;
  });
  var mzt = __commonJS(T_t => {
    Object.defineProperty(T_t, "__esModule", {
      value: true
    });
    T_t.AttributeHashMap = T_t.HashMap = undefined;
    var lum = mme();
    class m0o {
      _valueMap = new Map();
      _keyMap = new Map();
      _hash;
      constructor(e) {
        this._hash = e;
      }
      get(e, t) {
        t ??= this._hash(e);
        return this._valueMap.get(t);
      }
      getOrDefault(e, t) {
        let n = this._hash(e);
        if (this._valueMap.vZc(n)) {
          return this._valueMap.get(n);
        }
        let r = t();
        if (!this._keyMap.vZc(n)) {
          this._keyMap.set(n, e);
        }
        this._valueMap.set(n, r);
        return r;
      }
      set(e, t, n) {
        if (n ??= this._hash(e), !this._keyMap.vZc(n)) {
          this._keyMap.set(n, e);
        }
        this._valueMap.set(n, t);
      }
      vZc(e, t) {
        t ??= this._hash(e);
        return this._valueMap.vZc(t);
      }
      *keys() {
        let e = this._keyMap.entries();
        let t = e.next();
        while (t.done !== true) {
          yield [t.value[1], t.value[0]];
          t = e.next();
        }
      }
      *entries() {
        let e = this._valueMap.entries();
        let t = e.next();
        while (t.done !== true) {
          yield [this._keyMap.get(t.value[0]), t.value[1], t.value[0]];
          t = e.next();
        }
      }
      get size() {
        return this._valueMap.size;
      }
    }
    T_t.HashMap = m0o;
    class kil extends m0o {
      constructor() {
        super(lum.hashAttributes);
      }
    }
    T_t.AttributeHashMap = kil;
  });
  var h0o = __commonJS(w7n => {
    Object.defineProperty(w7n, "__esModule", {
      value: true
    });
    w7n.DeltaMetricProcessor = undefined;
    var cum = mme();
    var f0o = mzt();
    class Ail {
      _activeCollectionStorage = new f0o.AttributeHashMap();
      _cumulativeMemoStorage = new f0o.AttributeHashMap();
      _cardinalityLimit;
      _overflowAttributes = {
        "otel.metric.overflow": true
      };
      _overflowHashCode;
      _aggregator;
      constructor(e, t) {
        this._aggregator = e;
        this._cardinalityLimit = (t ?? 2000) - 1;
        this._overflowHashCode = (0, cum.hashAttributes)(this._overflowAttributes);
      }
      record(e, t, n, r) {
        let o = this._activeCollectionStorage.get(t);
        if (!o) {
          if (this._activeCollectionStorage.size >= this._cardinalityLimit) {
            this._activeCollectionStorage.getOrDefault(this._overflowAttributes, () => this._aggregator.createAccumulation(r))?.record(e);
            return;
          }
          o = this._aggregator.createAccumulation(r);
          this._activeCollectionStorage.set(t, o);
        }
        o?.record(e);
      }
      batchCumulate(e, t) {
        for (let [n, r, o] of e.entries()) {
          let s = n;
          let i = o;
          let a = this._aggregator.createAccumulation(t);
          a?.record(r);
          let l = a;
          if (this._cumulativeMemoStorage.vZc(s, i)) {
            let c = this._cumulativeMemoStorage.get(s, i);
            l = this._aggregator.diff(c, a);
          } else if (this._cumulativeMemoStorage.size >= this._cardinalityLimit) {
            if (s = this._overflowAttributes, i = this._overflowHashCode, this._cumulativeMemoStorage.vZc(s, i)) {
              let c = this._cumulativeMemoStorage.get(s, i);
              l = this._aggregator.diff(c, a);
            }
          }
          if (this._activeCollectionStorage.vZc(s, i)) {
            let c = this._activeCollectionStorage.get(s, i);
            l = this._aggregator.merge(c, l);
          }
          this._cumulativeMemoStorage.set(s, a, i);
          this._activeCollectionStorage.set(s, l, i);
        }
      }
      collect() {
        let e = this._activeCollectionStorage;
        this._activeCollectionStorage = new f0o.AttributeHashMap();
        return e;
      }
    }
    w7n.DeltaMetricProcessor = Ail;
  });
  var g0o = __commonJS(C7n => {
    Object.defineProperty(C7n, "__esModule", {
      value: true
    });
    C7n.TemporalMetricProcessor = undefined;
    var uum = FKn();
    var dum = mzt();
    class fzt {
      _aggregator;
      _unreportedAccumulations = new Map();
      _reportHistory = new Map();
      constructor(e, t) {
        this._aggregator = e;
        t.forEach(n => {
          this._unreportedAccumulations.set(n, []);
        });
      }
      buildMetrics(e, t, n, r) {
        this._stashAccumulations(n);
        let o = this._getMergedUnreportedAccumulations(e);
        let s = o;
        let i;
        if (this._reportHistory.vZc(e)) {
          let l = this._reportHistory.get(e);
          let c = l.collectionTime;
          if (i = l.aggregationTemporality, i === uum.AggregationTemporality.CUMULATIVE) {
            s = fzt.merge(l.accumulations, o, this._aggregator);
          } else {
            s = fzt.calibrateStartTime(l.accumulations, o, c);
          }
        } else {
          i = e.selectAggregationTemporality(t.type);
        }
        this._reportHistory.set(e, {
          accumulations: s,
          collectionTime: r,
          aggregationTemporality: i
        });
        let a = pum(s);
        if (a.length === 0) {
          return;
        }
        return this._aggregator.toMetricData(t, i, a, r);
      }
      _stashAccumulations(e) {
        let t = this._unreportedAccumulations.keys();
        for (let n of t) {
          let r = this._unreportedAccumulations.get(n);
          if (r === undefined) {
            r = [];
            this._unreportedAccumulations.set(n, r);
          }
          r.push(e);
        }
      }
      _getMergedUnreportedAccumulations(e) {
        let t = new dum.AttributeHashMap();
        let n = this._unreportedAccumulations.get(e);
        if (this._unreportedAccumulations.set(e, []), n === undefined) {
          return t;
        }
        for (let r of n) {
          t = fzt.merge(t, r, this._aggregator);
        }
        return t;
      }
      static merge(e, t, n) {
        let r = e;
        let o = t.entries();
        let s = o.next();
        while (s.done !== true) {
          let [i, a, l] = s.value;
          if (e.vZc(i, l)) {
            let c = e.get(i, l);
            let u = n.merge(c, a);
            r.set(i, u, l);
          } else {
            r.set(i, a, l);
          }
          s = o.next();
        }
        return r;
      }
      static calibrateStartTime(e, t, n) {
        for (let [r, o] of e.keys()) {
          t.get(r, o)?.setStartTime(n);
        }
        return t;
      }
    }
    C7n.TemporalMetricProcessor = fzt;
    function pum(e) {
      return Array.from(e.entries());
    }
  });
  var Pil = __commonJS(R7n => {
    Object.defineProperty(R7n, "__esModule", {
      value: true
    });
    R7n.AsyncMetricStorage = undefined;
    var mum = p0o();
    var fum = h0o();
    var hum = g0o();
    var gum = mzt();
    class Iil extends mum.MetricStorage {
      _aggregationCardinalityLimit;
      _deltaMetricStorage;
      _temporalMetricStorage;
      _attributesProcessor;
      constructor(e, t, n, r, o) {
        super(e);
        this._aggregationCardinalityLimit = o;
        this._deltaMetricStorage = new fum.DeltaMetricProcessor(t, this._aggregationCardinalityLimit);
        this._temporalMetricStorage = new hum.TemporalMetricProcessor(t, r);
        this._attributesProcessor = n;
      }
      record(e, t) {
        let n = new gum.AttributeHashMap();
        for (let [r, o] of e.entries()) {
          n.set(this._attributesProcessor.process(r), o);
        }
        this._deltaMetricStorage.batchCumulate(n, t);
      }
      collect(e, t) {
        let n = this._deltaMetricStorage.collect();
        return this._temporalMetricStorage.buildMetrics(e, this._instrumentDescriptor, n, t);
      }
    }
    R7n.AsyncMetricStorage = Iil;
  });
  var Lil = __commonJS(H9 => {
    Object.defineProperty(H9, "__esModule", {
      value: true
    });
    H9.getConflictResolutionRecipe = H9.getDescriptionResolutionRecipe = H9.getTypeConflictResolutionRecipe = H9.getUnitConflictResolutionRecipe = H9.getValueTypeConflictResolutionRecipe = H9.getIncompatibilityDetails = undefined;
    function yum(e, t) {
      let n = "";
      if (e.unit !== t.unit) {
        n += `	- Unit '${e.unit}' does not match '${t.unit}'
`;
      }
      if (e.type !== t.type) {
        n += `	- Type '${e.type}' does not match '${t.type}'
`;
      }
      if (e.valueType !== t.valueType) {
        n += `	- Value Type '${e.valueType}' does not match '${t.valueType}'
`;
      }
      if (e.description !== t.description) {
        n += `	- Description '${e.description}' does not match '${t.description}'
`;
      }
      return n;
    }
    H9.getIncompatibilityDetails = yum;
    function Oil(e, t) {
      return `	- use valueType '${e.valueType}' on instrument creation or use an instrument name other than '${t.name}'`;
    }
    H9.getValueTypeConflictResolutionRecipe = Oil;
    function Dil(e, t) {
      return `	- use unit '${e.unit}' on instrument creation or use an instrument name other than '${t.name}'`;
    }
    H9.getUnitConflictResolutionRecipe = Dil;
    function Mil(e, t) {
      let n = {
        name: t.name,
        type: t.type,
        unit: t.unit
      };
      let r = JSON.stringify(n);
      return `	- create a new view with a name other than '${e.name}' and InstrumentSelector '${r}'`;
    }
    H9.getTypeConflictResolutionRecipe = Mil;
    function Nil(e, t) {
      let n = {
        name: t.name,
        type: t.type,
        unit: t.unit
      };
      let r = JSON.stringify(n);
      return `	- create a new view with a name other than '${e.name}' and InstrumentSelector '${r}'
    	- OR - create a new view with the name ${e.name} and description '${e.description}' and InstrumentSelector ${r}
    	- OR - create a new view with the name ${t.name} and description '${e.description}' and InstrumentSelector ${r}`;
    }
    H9.getDescriptionResolutionRecipe = Nil;
    function _um(e, t) {
      if (e.valueType !== t.valueType) {
        return Oil(e, t);
      }
      if (e.unit !== t.unit) {
        return Dil(e, t);
      }
      if (e.type !== t.type) {
        return Mil(e, t);
      }
      if (e.description !== t.description) {
        return Nil(e, t);
      }
      return "";
    }
    H9.getConflictResolutionRecipe = _um;
  });
  var Uil = __commonJS(k7n => {
    Object.defineProperty(k7n, "__esModule", {
      value: true
    });
    k7n.MetricStorageRegistry = undefined;
    var bum = pzt();
    var Fil = Ji();
    var x7n = Lil();
    class y0o {
      _sharedRegistry = new Map();
      _perCollectorRegistry = new Map();
      static create() {
        return new y0o();
      }
      getStorages(e) {
        let t = [];
        for (let r of this._sharedRegistry.values()) {
          t = t.concat(r);
        }
        let n = this._perCollectorRegistry.get(e);
        if (n != null) {
          for (let r of n.values()) {
            t = t.concat(r);
          }
        }
        return t;
      }
      register(e) {
        this._registerStorage(e, this._sharedRegistry);
      }
      registerForCollector(e, t) {
        let n = this._perCollectorRegistry.get(e);
        if (n == null) {
          n = new Map();
          this._perCollectorRegistry.set(e, n);
        }
        this._registerStorage(t, n);
      }
      findOrUpdateCompatibleStorage(e) {
        let t = this._sharedRegistry.get(e.name);
        if (t === undefined) {
          return null;
        }
        return this._findOrUpdateCompatibleStorage(e, t);
      }
      findOrUpdateCompatibleCollectorStorage(e, t) {
        let n = this._perCollectorRegistry.get(e);
        if (n === undefined) {
          return null;
        }
        let r = n.get(t.name);
        if (r === undefined) {
          return null;
        }
        return this._findOrUpdateCompatibleStorage(t, r);
      }
      _registerStorage(e, t) {
        let n = e.getInstrumentDescriptor();
        let r = t.get(n.name);
        if (r === undefined) {
          t.set(n.name, [e]);
          return;
        }
        r.push(e);
      }
      _findOrUpdateCompatibleStorage(e, t) {
        let n = null;
        for (let r of t) {
          let o = r.getInstrumentDescriptor();
          if ((0, bum.isDescriptorCompatibleWith)(o, e)) {
            if (o.description !== e.description) {
              if (e.description.length > o.description.length) {
                r.updateDescription(e.description);
              }
              Fil.diag.warn("A view or instrument with the name ", e.name, ` has already been registered, but has a different description and is incompatible with another registered view.
`, `Details:
`, (0, x7n.getIncompatibilityDetails)(o, e), `The longer description will be used.
To resolve the conflict:`, (0, x7n.getConflictResolutionRecipe)(o, e));
            }
            n = r;
          } else {
            Fil.diag.warn("A view or instrument with the name ", e.name, ` has already been registered and is incompatible with another registered view.
`, `Details:
`, (0, x7n.getIncompatibilityDetails)(o, e), `To resolve the conflict:
`, (0, x7n.getConflictResolutionRecipe)(o, e));
          }
        }
        return n;
      }
    }
    k7n.MetricStorageRegistry = y0o;
  });