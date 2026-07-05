  var zVt = __commonJS(w1e => {
    Object.defineProperty(w1e, "__esModule", {
      value: true
    });
    w1e.isTracingSuppressed = w1e.unsuppressTracing = w1e.suppressTracing = undefined;
    var Nim = Ji();
    var OAo = (0, Nim.createContextKey)("OpenTelemetry SDK Context Key SUPPRESS_TRACING");
    function Lim(e) {
      return e.setValue(OAo, true);
    }
    w1e.suppressTracing = Lim;
    function Fim(e) {
      return e.deleteValue(OAo);
    }
    w1e.unsuppressTracing = Fim;
    function Uim(e) {
      return e.getValue(OAo) === true;
    }
    w1e.isTracingSuppressed = Uim;
  });
  var DAo = __commonJS(G$ => {
    Object.defineProperty(G$, "__esModule", {
      value: true
    });
    G$.BAGGAGE_MAX_TOTAL_LENGTH = G$.BAGGAGE_MAX_PER_NAME_VALUE_PAIRS = G$.BAGGAGE_MAX_NAME_VALUE_PAIRS = G$.BAGGAGE_HEADER = G$.BAGGAGE_ITEMS_SEPARATOR = G$.BAGGAGE_PROPERTIES_SEPARATOR = G$.BAGGAGE_KEY_PAIR_SEPARATOR = undefined;
    G$.BAGGAGE_KEY_PAIR_SEPARATOR = "=";
    G$.BAGGAGE_PROPERTIES_SEPARATOR = ";";
    G$.BAGGAGE_ITEMS_SEPARATOR = ",";
    G$.BAGGAGE_HEADER = "baggage";
    G$.BAGGAGE_MAX_NAME_VALUE_PAIRS = 180;
    G$.BAGGAGE_MAX_PER_NAME_VALUE_PAIRS = 4096;
    G$.BAGGAGE_MAX_TOTAL_LENGTH = 8192;
  });
  var MAo = __commonJS(dme => {
    Object.defineProperty(dme, "__esModule", {
      value: true
    });
    dme.parseKeyPairsIntoRecord = dme.parsePairKeyValue = dme.getKeyPairs = dme.serializeKeyPairs = undefined;
    var Bim = Ji();
    var e_t = DAo();
    function $im(e) {
      return e.reduce((t, n) => {
        let r = `${t}${t !== "" ? e_t.BAGGAGE_ITEMS_SEPARATOR : ""}${n}`;
        return r.length > e_t.BAGGAGE_MAX_TOTAL_LENGTH ? t : r;
      }, "");
    }
    dme.serializeKeyPairs = $im;
    function Him(e) {
      return e.getAllEntries().map(([t, n]) => {
        let r = `${encodeURIComponent(t)}=${encodeURIComponent(n.value)}`;
        if (n.metadata !== undefined) {
          r += e_t.BAGGAGE_PROPERTIES_SEPARATOR + n.metadata.toString();
        }
        return r;
      });
    }
    dme.getKeyPairs = Him;
    function $rl(e) {
      if (!e) {
        return;
      }
      let t = e.indexOf(e_t.BAGGAGE_PROPERTIES_SEPARATOR);
      let n = t === -1 ? e : e.substring(0, t);
      let r = n.indexOf(e_t.BAGGAGE_KEY_PAIR_SEPARATOR);
      if (r <= 0) {
        return;
      }
      let o = n.substring(0, r).trim();
      let s = n.substring(r + 1).trim();
      if (!o || !s) {
        return;
      }
      let i;
      let a;
      try {
        i = decodeURIComponent(o);
        a = decodeURIComponent(s);
      } catch {
        return;
      }
      let l;
      if (t !== -1 && t < e.length - 1) {
        let c = e.substring(t + 1);
        l = (0, Bim.baggageEntryMetadataFromString)(c);
      }
      return {
        key: i,
        value: a,
        metadata: l
      };
    }
    dme.parsePairKeyValue = $rl;
    function jim(e) {
      let t = {};
      if (typeof e === "string" && e.length > 0) {
        e.split(e_t.BAGGAGE_ITEMS_SEPARATOR).forEach(n => {
          let r = $rl(n);
          if (r !== undefined && r.value.length > 0) {
            t[r.key] = r.value;
          }
        });
      }
      return t;
    }
    dme.parseKeyPairsIntoRecord = jim;
  });
  var jrl = __commonJS(uKn => {
    Object.defineProperty(uKn, "__esModule", {
      value: true
    });
    uKn.W3CBaggagePropagator = undefined;
    var NAo = Ji();
    var qim = zVt();
    var AVe = DAo();
    var LAo = MAo();
    class Hrl {
      inject(e, t, n) {
        let r = NAo.propagation.getBaggage(e);
        if (!r || (0, qim.isTracingSuppressed)(e)) {
          return;
        }
        let o = (0, LAo.getKeyPairs)(r).filter(i => i.length <= AVe.BAGGAGE_MAX_PER_NAME_VALUE_PAIRS).slice(0, AVe.BAGGAGE_MAX_NAME_VALUE_PAIRS);
        let s = (0, LAo.serializeKeyPairs)(o);
        if (s.length > 0) {
          n.set(t, AVe.BAGGAGE_HEADER, s);
        }
      }
      extract(e, t, n) {
        let r = n.get(t, AVe.BAGGAGE_HEADER);
        let o = Array.isArray(r) ? r.join(AVe.BAGGAGE_ITEMS_SEPARATOR) : r;
        if (!o) {
          return e;
        }
        let s = {};
        if (o.length === 0) {
          return e;
        }
        if (o.split(AVe.BAGGAGE_ITEMS_SEPARATOR).forEach(a => {
          let l = (0, LAo.parsePairKeyValue)(a);
          if (l) {
            let c = {
              value: l.value
            };
            if (l.metadata) {
              c.metadata = l.metadata;
            }
            s[l.key] = c;
          }
        }), Object.entries(s).length === 0) {
          return e;
        }
        return NAo.propagation.setBaggage(e, NAo.propagation.createBaggage(s));
      }
      fields() {
        return [AVe.BAGGAGE_HEADER];
      }
    }
    uKn.W3CBaggagePropagator = Hrl;
  });
  var Wrl = __commonJS(dKn => {
    Object.defineProperty(dKn, "__esModule", {
      value: true
    });
    dKn.AnchoredClock = undefined;
    class qrl {
      _monotonicClock;
      _epochMillis;
      _performanceMillis;
      constructor(e, t) {
        this._monotonicClock = t;
        this._epochMillis = e.now();
        this._performanceMillis = t.now();
      }
      now() {
        let e = this._monotonicClock.now() - this._performanceMillis;
        return this._epochMillis + e;
      }
    }
    dKn.AnchoredClock = qrl;
  });
  var Yrl = __commonJS(C1e => {
    Object.defineProperty(C1e, "__esModule", {
      value: true
    });
    C1e.isAttributeValue = C1e.isAttributeKey = C1e.sanitizeAttributes = undefined;
    var Grl = Ji();
    function Wim(e) {
      let t = {};
      if (typeof e !== "object" || e == null) {
        return t;
      }
      for (let n in e) {
        if (!Object.prototype.hasOwnProperty.call(e, n)) {
          continue;
        }
        if (!Vrl(n)) {
          Grl.diag.warn(`Invalid attribute key: ${n}`);
          continue;
        }
        let r = e[n];
        if (!zrl(r)) {
          Grl.diag.warn(`Invalid attribute value set for key: ${n}`);
          continue;
        }
        if (Array.isArray(r)) {
          t[n] = r.slice();
        } else {
          t[n] = r;
        }
      }
      return t;
    }
    C1e.sanitizeAttributes = Wim;
    function Vrl(e) {
      return typeof e === "string" && e !== "";
    }
    C1e.isAttributeKey = Vrl;
    function zrl(e) {
      if (e == null) {
        return true;
      }
      if (Array.isArray(e)) {
        return Gim(e);
      }
      return Krl(typeof e);
    }
    C1e.isAttributeValue = zrl;
    function Gim(e) {
      let t;
      for (let n of e) {
        if (n == null) {
          continue;
        }
        let r = typeof n;
        if (r === t) {
          continue;
        }
        if (!t) {
          if (Krl(r)) {
            t = r;
            continue;
          }
          return false;
        }
        return false;
      }
      return true;
    }
    function Krl(e) {
      switch (e) {
        case "number":
        case "boolean":
        case "string":
          return true;
      }
      return false;
    }
  });
  var FAo = __commonJS(pKn => {
    Object.defineProperty(pKn, "__esModule", {
      value: true
    });
    pKn.loggingErrorHandler = undefined;
    var Vim = Ji();
    function zim() {
      return e => {
        Vim.diag.error(Kim(e));
      };
    }
    pKn.loggingErrorHandler = zim;
    function Kim(e) {
      if (typeof e === "string") {
        return e;
      } else {
        return JSON.stringify(Yim(e));
      }
    }
    function Yim(e) {
      let t = {};
      let n = e;
      while (n !== null) {
        Object.getOwnPropertyNames(n).forEach(r => {
          if (t[r]) {
            return;
          }
          let o = n[r];
          if (o) {
            t[r] = String(o);
          }
        });
        n = Object.getPrototypeOf(n);
      }
      return t;
    }
  });
  var Xrl = __commonJS(t_t => {
    Object.defineProperty(t_t, "__esModule", {
      value: true
    });
    t_t.globalErrorHandler = t_t.setGlobalErrorHandler = undefined;
    var Jim = FAo();
    var Jrl = (0, Jim.loggingErrorHandler)();
    function Xim(e) {
      Jrl = e;
    }
    t_t.setGlobalErrorHandler = Xim;
    function Qim(e) {
      try {
        Jrl(e);
      } catch {}
    }
    t_t.globalErrorHandler = Qim;
  });
  var tol = __commonJS(pme => {
    Object.defineProperty(pme, "__esModule", {
      value: true
    });
    pme.getStringListFromEnv = pme.getBooleanFromEnv = pme.getStringFromEnv = pme.getNumberFromEnv = undefined;
    var Qrl = Ji();
    var Zrl = require("util");
    function Zim(e) {
      let t = process.env[e];
      if (t == null || t.trim() === "") {
        return;
      }
      let n = Number(t);
      if (isNaN(n)) {
        Qrl.diag.warn(`Unknown value ${(0, Zrl.inspect)(t)} for ${e}, expected a number, using defaults`);
        return;
      }
      return n;
    }
    pme.getNumberFromEnv = Zim;
    function eol(e) {
      let t = process.env[e];
      if (t == null || t.trim() === "") {
        return;
      }
      return t;
    }
    pme.getStringFromEnv = eol;
    function eam(e) {
      let t = process.env[e]?.trim().toLowerCase();
      if (t == null || t === "") {
        return false;
      }
      if (t === "true") {
        return true;
      } else if (t === "false") {
        return false;
      } else {
        Qrl.diag.warn(`Unknown value ${(0, Zrl.inspect)(t)} for ${e}, expected 'true' or 'false', falling back to 'false' (default)`);
        return false;
      }
    }
    pme.getBooleanFromEnv = eam;
    function tam(e) {
      return eol(e)?.split(",").map(t => t.trim()).filter(t => t !== "");
    }
    pme.getStringListFromEnv = tam;
  });
  var nol = __commonJS(mKn => {
    Object.defineProperty(mKn, "__esModule", {
      value: true
    });
    mKn._globalThis = undefined;
    mKn._globalThis = globalThis;
  });
  var rol = __commonJS(fKn => {
    Object.defineProperty(fKn, "__esModule", {
      value: true
    });
    fKn.VERSION = undefined;
    fKn.VERSION = "2.7.1";
  });
  var ool = __commonJS(hKn => {
    Object.defineProperty(hKn, "__esModule", {
      value: true
    });
    hKn.ATTR_PROCESS_RUNTIME_NAME = undefined;
    hKn.ATTR_PROCESS_RUNTIME_NAME = "process.runtime.name";
  });
  var sol = __commonJS(yKn => {
    Object.defineProperty(yKn, "__esModule", {
      value: true
    });
    yKn.SDK_INFO = undefined;
    var nam = rol();
    var gKn = Hne();
    var ram = ool();
    yKn.SDK_INFO = {
      [gKn.ATTR_TELEMETRY_SDK_NAME]: "opentelemetry",
      [ram.ATTR_PROCESS_RUNTIME_NAME]: "node",
      [gKn.ATTR_TELEMETRY_SDK_LANGUAGE]: gKn.TELEMETRY_SDK_LANGUAGE_VALUE_NODEJS,
      [gKn.ATTR_TELEMETRY_SDK_VERSION]: nam.VERSION
    };
  });
  var iol = __commonJS(V$ => {
    Object.defineProperty(V$, "__esModule", {
      value: true
    });
    V$.otperformance = V$.SDK_INFO = V$._globalThis = V$.getStringListFromEnv = V$.getNumberFromEnv = V$.getBooleanFromEnv = V$.getStringFromEnv = undefined;
    var _Kn = tol();
    Object.defineProperty(V$, "getStringFromEnv", {
      enumerable: true,
      get: function () {
        return _Kn.getStringFromEnv;
      }
    });
    Object.defineProperty(V$, "getBooleanFromEnv", {
      enumerable: true,
      get: function () {
        return _Kn.getBooleanFromEnv;
      }
    });
    Object.defineProperty(V$, "getNumberFromEnv", {
      enumerable: true,
      get: function () {
        return _Kn.getNumberFromEnv;
      }
    });
    Object.defineProperty(V$, "getStringListFromEnv", {
      enumerable: true,
      get: function () {
        return _Kn.getStringListFromEnv;
      }
    });
    var oam = nol();
    Object.defineProperty(V$, "_globalThis", {
      enumerable: true,
      get: function () {
        return oam._globalThis;
      }
    });
    var sam = sol();
    Object.defineProperty(V$, "SDK_INFO", {
      enumerable: true,
      get: function () {
        return sam.SDK_INFO;
      }
    });
    V$.otperformance = performance;
  });
  var UAo = __commonJS(z$ => {
    Object.defineProperty(z$, "__esModule", {
      value: true
    });
    z$.getStringListFromEnv = z$.getNumberFromEnv = z$.getStringFromEnv = z$.getBooleanFromEnv = z$.otperformance = z$._globalThis = z$.SDK_INFO = undefined;
    var IVe = iol();
    Object.defineProperty(z$, "SDK_INFO", {
      enumerable: true,
      get: function () {
        return IVe.SDK_INFO;
      }
    });
    Object.defineProperty(z$, "_globalThis", {
      enumerable: true,
      get: function () {
        return IVe._globalThis;
      }
    });
    Object.defineProperty(z$, "otperformance", {
      enumerable: true,
      get: function () {
        return IVe.otperformance;
      }
    });
    Object.defineProperty(z$, "getBooleanFromEnv", {
      enumerable: true,
      get: function () {
        return IVe.getBooleanFromEnv;
      }
    });
    Object.defineProperty(z$, "getStringFromEnv", {
      enumerable: true,
      get: function () {
        return IVe.getStringFromEnv;
      }
    });
    Object.defineProperty(z$, "getNumberFromEnv", {
      enumerable: true,
      get: function () {
        return IVe.getNumberFromEnv;
      }
    });
    Object.defineProperty(z$, "getStringListFromEnv", {
      enumerable: true,
      get: function () {
        return IVe.getStringListFromEnv;
      }
    });
  });
  var uol = __commonJS(Hw => {
    Object.defineProperty(Hw, "__esModule", {
      value: true
    });
    Hw.addHrTimes = Hw.isTimeInput = Hw.isTimeInputHrTime = Hw.hrTimeToMicroseconds = Hw.hrTimeToMilliseconds = Hw.hrTimeToNanoseconds = Hw.hrTimeToTimeStamp = Hw.hrTimeDuration = Hw.timeInputToHrTime = Hw.hrTime = Hw.getTimeOrigin = Hw.millisToHrTime = undefined;
    var bKn = UAo();
    var aam = Math.pow(10, 6);
    var SKn = Math.pow(10, 9);
    function KVt(e) {
      let t = e / 1000;
      let n = Math.trunc(t);
      let r = Math.round(e % 1000 * aam);
      return [n, r];
    }
    Hw.millisToHrTime = KVt;
    function lam() {
      return bKn.otperformance.timeOrigin;
    }
    Hw.getTimeOrigin = lam;
    function lol(e) {
      let t = KVt(bKn.otperformance.timeOrigin);
      let n = KVt(typeof e === "number" ? e : bKn.otperformance.now());
      return col(t, n);
    }
    Hw.hrTime = lol;
    function cam(e) {
      if (BAo(e)) {
        return e;
      } else if (typeof e === "number") {
        if (e < bKn.otperformance.timeOrigin) {
          return lol(e);
        } else {
          return KVt(e);
        }
      } else if (e instanceof Date) {
        return KVt(e.getTime());
      } else {
        throw TypeError("Invalid input type");
      }
    }
    Hw.timeInputToHrTime = cam;
    function uam(e, t) {
      let n = t[0] - e[0];
      let r = t[1] - e[1];
      if (r < 0) {
        n -= 1;
        r += SKn;
      }
      return [n, r];
    }
    Hw.hrTimeDuration = uam;
    function dam(e) {
      let t = 9;
      let n = `${"0".repeat(t)}${e[1]}Z`;
      let r = n.substring(n.length - t - 1);
      return new Date(e[0] * 1000).toISOString().replace("000Z", r);
    }
    Hw.hrTimeToTimeStamp = dam;
    function pam(e) {
      return e[0] * SKn + e[1];
    }
    Hw.hrTimeToNanoseconds = pam;
    function mam(e) {
      return e[0] * 1000 + e[1] / 1e6;
    }
    Hw.hrTimeToMilliseconds = mam;
    function fam(e) {
      return e[0] * 1e6 + e[1] / 1000;
    }
    Hw.hrTimeToMicroseconds = fam;
    function BAo(e) {
      return Array.isArray(e) && e.length === 2 && typeof e[0] === "number" && typeof e[1] === "number";
    }
    Hw.isTimeInputHrTime = BAo;
    function ham(e) {
      return BAo(e) || typeof e === "number" || e instanceof Date;
    }
    Hw.isTimeInput = ham;
    function col(e, t) {
      let n = [e[0] + t[0], e[1] + t[1]];
      if (n[1] >= SKn) {
        n[1] -= SKn;
        n[0] += 1;
      }
      return n;
    }
    Hw.addHrTimes = col;
  });
  var dol = __commonJS(TKn => {
    Object.defineProperty(TKn, "__esModule", {
      value: true
    });
    TKn.unrefTimer = undefined;
    function gam(e) {
      if (typeof e !== "number") {
        e.unref();
      }
    }
    TKn.unrefTimer = gam;
  });
  var pol = __commonJS(YVt => {
    Object.defineProperty(YVt, "__esModule", {
      value: true
    });
    YVt.ExportResultCode = undefined;
    var yam;
    (function (e) {
      e[e.SUCCESS = 0] = "SUCCESS";
      e[e.FAILED = 1] = "FAILED";
    })(yam = YVt.ExportResultCode || (YVt.ExportResultCode = {}));
  });
  var hol = __commonJS(EKn => {
    Object.defineProperty(EKn, "__esModule", {
      value: true
    });
    EKn.CompositePropagator = undefined;
    var mol = Ji();
    class fol {
      _propagators;
      _fields;
      constructor(e = {}) {
        this._propagators = e.propagators ?? [];
        let t = new Set();
        for (let n of this._propagators) {
          let r = typeof n.fields === "function" ? n.fields() : [];
          for (let o of r) {
            t.add(o);
          }
        }
        this._fields = Array.from(t);
      }
      inject(e, t, n) {
        for (let r of this._propagators) {
          try {
            r.inject(e, t, n);
          } catch (o) {
            mol.diag.warn(`Failed to inject with ${r.constructor.name}. Err: ${o.message}`);
          }
        }
      }
      extract(e, t, n) {
        return this._propagators.reduce((r, o) => {
          try {
            return o.extract(r, t, n);
          } catch (s) {
            mol.diag.warn(`Failed to extract with ${o.constructor.name}. Err: ${s.message}`);
          }
          return r;
        }, e);
      }
      fields() {
        return this._fields.slice();
      }
    }
    EKn.CompositePropagator = fol;
  });
  var gol = __commonJS(n_t => {
    Object.defineProperty(n_t, "__esModule", {
      value: true
    });
    n_t.validateValue = n_t.validateKey = undefined;
    var _am = `[a-z]${"[_0-9a-z-*/]"}{0,255}`;
    var bam = `[a-z0-9]${"[_0-9a-z-*/]"}{0,240}@[a-z]${"[_0-9a-z-*/]"}{0,13}`;
    var Sam = new RegExp(`^(?:${_am}|${bam})$`);
    function vam(e) {
      return Sam.test(e);
    }
    n_t.validateKey = vam;
    function wam(e) {
      return (/^[ -~]{0,255}[!-~]$/).test(e) && !(/,|=/).test(e);
    }
    n_t.validateValue = wam;
  });
  var jAo = __commonJS(wKn => {
    Object.defineProperty(wKn, "__esModule", {
      value: true
    });
    wKn.TraceState = undefined;
    var vKn = gol();
    class HAo {
      _length;
      _rawTraceState;
      _internalState;
      constructor(e) {
        this._rawTraceState = typeof e === "string" ? e : "";
        this._length = this._rawTraceState.length;
      }
      set(e, t) {
        if (!(0, vKn.validateKey)(e) || !(0, vKn.validateValue)(t)) {
          return this;
        }
        let n = this._getState();
        let r = n.get(e);
        let o = this._length;
        if (typeof r === "string") {
          o += t.length - r.length;
        } else {
          o += e.length + t.length + (n.size > 0 ? 2 : 1);
        }
        if (o > 512) {
          return this;
        }
        let s = new Map(n);
        s.delete(e);
        s.set(e, t);
        return this._fromState(s, o);
      }
      unset(e) {
        let t = this._getState();
        let n = t.get(e);
        if (typeof n !== "string") {
          return this;
        }
        let r = this._length - (e.length + n.length + 1);
        if (t.size > 1) {
          r = r - 1;
        }
        let o = new Map(t);
        o.delete(e);
        return this._fromState(o, r);
      }
      get(e) {
        return this._getState().get(e);
      }
      serialize() {
        let e = "";
        let t = 0;
        for (let n of this._getState()) {
          if (t > 0) {
            e = "," + e;
          }
          e = `${n[0]}${"="}${n[1]}` + e;
          t++;
        }
        return e;
      }
      _getState() {
        if (this._internalState) {
          return this._internalState;
        }
        let e = this._rawTraceState.split(",");
        let t = new Map();
        let n = 0;
        for (let r of e) {
          let o = r.trim();
          let s = o.indexOf("=");
          if (s === -1) {
            continue;
          }
          let i = o.slice(0, s);
          let a = o.slice(s + 1);
          if (!(0, vKn.validateKey)(i) || !(0, vKn.validateValue)(a)) {
            continue;
          }
          let l = n + o.length + (t.size > 0 ? 1 : 0);
          if (l > 512) {
            continue;
          }
          if (t.set(i, a), n = l, t.size >= 32) {
            break;
          }
        }
        this._length = n;
        this._internalState = new Map(Array.from(t.entries()).reverse());
        return this._internalState;
      }
      _fromState(e, t) {
        let n = Object.create(HAo.prototype);
        n._internalState = e;
        n._length = t;
        return n;
      }
    }
    wKn.TraceState = HAo;
  });
  var Eol = __commonJS(K$ => {
    Object.defineProperty(K$, "__esModule", {
      value: true
    });
    K$.W3CTraceContextPropagator = K$.parseTraceParent = K$.TRACE_STATE_HEADER = K$.TRACE_PARENT_HEADER = undefined;
    var CKn = Ji();
    var Ram = zVt();
    var xam = jAo();
    K$.TRACE_PARENT_HEADER = "traceparent";
    K$.TRACE_STATE_HEADER = "tracestate";
    var Dam = new RegExp(`^\\s?(${"(?!ff)[\\da-f]{2}"})-(${"(?![0]{32})[\\da-f]{32}"})-(${"(?![0]{16})[\\da-f]{16}"})-(${"[\\da-f]{2}"})(-.*)?\\s?$`);
    function Sol(e) {
      let t = Dam.exec(e);
      if (!t) {
        return null;
      }
      if (t[1] === "00" && t[5]) {
        return null;
      }
      return {
        traceId: t[2],
        spanId: t[3],
        traceFlags: parseInt(t[4], 16)
      };
    }
    K$.parseTraceParent = Sol;
    class Tol {
      inject(e, t, n) {
        let r = CKn.trace.getSpanContext(e);
        if (!r || (0, Ram.isTracingSuppressed)(e) || !(0, CKn.isSpanContextValid)(r)) {
          return;
        }
        let o = `${"00"}-${r.traceId}-${r.spanId}-0${Number(r.traceFlags || CKn.TraceFlags.NONE).toString(16)}`;
        if (n.set(t, K$.TRACE_PARENT_HEADER, o), r.traceState) {
          n.set(t, K$.TRACE_STATE_HEADER, r.traceState.serialize());
        }
      }
      extract(e, t, n) {
        let r = n.get(t, K$.TRACE_PARENT_HEADER);
        if (!r) {
          return e;
        }
        let o = Array.isArray(r) ? r[0] : r;
        if (typeof o !== "string") {
          return e;
        }
        let s = Sol(o);
        if (!s) {
          return e;
        }
        s.isRemote = true;
        let i = n.get(t, K$.TRACE_STATE_HEADER);
        if (i) {
          let a = Array.isArray(i) ? i.join(",") : i;
          s.traceState = new xam.TraceState(typeof a === "string" ? a : undefined);
        }
        return CKn.trace.setSpanContext(e, s);
      }
      fields() {
        return [K$.TRACE_PARENT_HEADER, K$.TRACE_STATE_HEADER];
      }
    }
    K$.W3CTraceContextPropagator = Tol;
  });
  var vol = __commonJS(mse => {
    Object.defineProperty(mse, "__esModule", {
      value: true
    });
    mse.getRPCMetadata = mse.deleteRPCMetadata = mse.setRPCMetadata = mse.RPCType = undefined;
    var Mam = Ji();
    var qAo = (0, Mam.createContextKey)("OpenTelemetry SDK Context Key RPC_METADATA");
    var Nam;
    (function (e) {
      e.HTTP = "http";
    })(Nam = mse.RPCType || (mse.RPCType = {}));
    function Lam(e, t) {
      return e.setValue(qAo, t);
    }
    mse.setRPCMetadata = Lam;
    function Fam(e) {
      return e.deleteValue(qAo);
    }
    mse.deleteRPCMetadata = Fam;
    function Uam(e) {
      return e.getValue(qAo);
    }
    mse.getRPCMetadata = Uam;
  });
  var kol = __commonJS(RKn => {
    Object.defineProperty(RKn, "__esModule", {
      value: true
    });
    RKn.isPlainObject = undefined;
    var jam = Function.prototype;
    var wol = jam.toString;
    var qam = wol.call(Object);
    var Wam = Object.getPrototypeOf;
    var Col = Object.prototype;
    var Rol = Col.hasOwnProperty;
    var PVe = Symbol ? Symbol.toStringTag : undefined;
    var xol = Col.toString;
    function Gam(e) {
      if (!Vam(e) || zam(e) !== "[object Object]") {
        return false;
      }
      let t = Wam(e);
      if (t === null) {
        return true;
      }
      let n = Rol.call(t, "constructor") && t.constructor;
      return typeof n == "function" && n instanceof n && wol.call(n) === qam;
    }
    RKn.isPlainObject = Gam;
    function Vam(e) {
      return e != null && typeof e == "object";
    }
    function zam(e) {
      if (e == null) {
        return e === undefined ? "[object Undefined]" : "[object Null]";
      }
      return PVe && PVe in Object(e) ? Kam(e) : Yam(e);
    }
    function Kam(e) {
      let t = Rol.call(e, PVe);
      let n = e[PVe];
      let r = false;
      try {
        e[PVe] = undefined;
        r = true;
      } catch {}
      let o = xol.call(e);
      if (r) {
        if (t) {
          e[PVe] = n;
        } else {
          delete e[PVe];
        }
      }
      return o;
    }
    function Yam(e) {
      return xol.call(e);
    }
  });
  var Dol = __commonJS(AKn => {
    Object.defineProperty(AKn, "__esModule", {
      value: true
    });
    AKn.merge = undefined;
    var Aol = kol();
    function Xam(...e) {
      let t = e.shift();
      let n = new WeakMap();
      while (e.length > 0) {
        t = Pol(t, e.shift(), 0, n);
      }
      return t;
    }
    AKn.merge = Xam;
    function WAo(e) {
      if (kKn(e)) {
        return e.slice();
      }
      return e;
    }
    function Pol(e, t, n = 0, r) {
      let o;
      if (n > 20) {
        return;
      }
      if (n++, xKn(e) || xKn(t) || Ool(t)) {
        o = WAo(t);
      } else if (kKn(e)) {
        if (o = e.slice(), kKn(t)) {
          for (let s = 0, i = t.length; s < i; s++) {
            o.push(WAo(t[s]));
          }
        } else if (JVt(t)) {
          let s = Object.keys(t);
          for (let i = 0, a = s.length; i < a; i++) {
            let l = s[i];
            if (l === "__proto__" || l === "constructor" || l === "prototype") {
              continue;
            }
            o[l] = WAo(t[l]);
          }
        }
      } else if (JVt(e)) {
        if (JVt(t)) {
          if (!Qam(e, t)) {
            return t;
          }
          o = Object.assign({}, e);
          let s = Object.keys(t);
          for (let i = 0, a = s.length; i < a; i++) {
            let l = s[i];
            if (l === "__proto__" || l === "constructor" || l === "prototype") {
              continue;
            }
            let c = t[l];
            if (xKn(c)) {
              if (typeof c > "u") {
                delete o[l];
              } else {
                o[l] = c;
              }
            } else {
              let u = o[l];
              let d = c;
              if (Iol(e, l, r) || Iol(t, l, r)) {
                delete o[l];
              } else {
                if (JVt(u) && JVt(d)) {
                  let p = r.get(u) || [];
                  let m = r.get(d) || [];
                  p.push({
                    obj: e,
                    key: l
                  });
                  m.push({
                    obj: t,
                    key: l
                  });
                  r.set(u, p);
                  r.set(d, m);
                }
                o[l] = Pol(o[l], c, n, r);
              }
            }
          }
        } else {
          o = t;
        }
      }
      return o;
    }
    function Iol(e, t, n) {
      let r = n.get(e[t]) || [];
      for (let o = 0, s = r.length; o < s; o++) {
        let i = r[o];
        if (i.key === t && i.obj === e) {
          return true;
        }
      }
      return false;
    }
    function kKn(e) {
      return Array.isArray(e);
    }
    function Ool(e) {
      return typeof e === "function";
    }
    function JVt(e) {
      return !xKn(e) && !kKn(e) && !Ool(e) && typeof e === "object";
    }
    function xKn(e) {
      return typeof e === "string" || typeof e === "number" || typeof e === "boolean" || typeof e > "u" || e instanceof Date || e instanceof RegExp || e === null;
    }
    function Qam(e, t) {
      if (!(0, Aol.isPlainObject)(e) || !(0, Aol.isPlainObject)(t)) {
        return false;
      }
      return true;
    }
  });
  var Mol = __commonJS(r_t => {
    Object.defineProperty(r_t, "__esModule", {
      value: true
    });
    r_t.callWithTimeout = r_t.TimeoutError = undefined;
    class IKn extends Error {
      constructor(e) {
        super(e);
        Object.setPrototypeOf(this, IKn.prototype);
      }
    }
    r_t.TimeoutError = IKn;
    function Zam(e, t) {
      let n;
      let r = new Promise(function (s, i) {
        n = setTimeout(function () {
          i(new IKn("Operation timed out."));
        }, t);
      });
      return Promise.race([e, r]).then(o => (clearTimeout(n), o), o => {
        throw clearTimeout(n), o;
      });
    }
    r_t.callWithTimeout = Zam;
  });
  var Lol = __commonJS(o_t => {
    Object.defineProperty(o_t, "__esModule", {
      value: true
    });
    o_t.isUrlIgnored = o_t.urlMatches = undefined;
    function Nol(e, t) {
      if (typeof t === "string") {
        return e === t;
      } else {
        return !!e.match(t);
      }
    }
    o_t.urlMatches = Nol;
    function elm(e, t) {
      if (!t) {
        return false;
      }
      for (let n of t) {
        if (Nol(e, n)) {
          return true;
        }
      }
      return false;
    }
    o_t.isUrlIgnored = elm;
  });
  var Uol = __commonJS(PKn => {
    Object.defineProperty(PKn, "__esModule", {
      value: true
    });
    PKn.Deferred = undefined;
    class Fol {
      _promise;
      _resolve;
      _reject;
      constructor() {
        this._promise = new Promise((e, t) => {
          this._resolve = e;
          this._reject = t;
        });
      }
      get promise() {
        return this._promise;
      }
      resolve(e) {
        this._resolve(e);
      }
      reject(e) {
        this._reject(e);
      }
    }
    PKn.Deferred = Fol;
  });