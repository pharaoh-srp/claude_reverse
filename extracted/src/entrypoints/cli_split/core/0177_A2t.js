  var _$i = __commonJS(uw => {
    Object.defineProperty(uw, "__esModule", {
      value: true
    });
    uw.addHrTimes = uw.isTimeInput = uw.isTimeInputHrTime = uw.hrTimeToMicroseconds = uw.hrTimeToMilliseconds = uw.hrTimeToNanoseconds = uw.hrTimeToTimeStamp = uw.hrTimeDuration = uw.timeInputToHrTime = uw.hrTime = uw.getTimeOrigin = uw.millisToHrTime = undefined;
    var SJr = bJr();
    var Nqd = Math.pow(10, 6);
    var FPn = Math.pow(10, 9);
    function A2t(e) {
      let t = e / 1000;
      let n = Math.trunc(t);
      let r = Math.round(e % 1000 * Nqd);
      return [n, r];
    }
    uw.millisToHrTime = A2t;
    function TJr() {
      let e = SJr.otperformance.timeOrigin;
      if (typeof e !== "number") {
        let t = SJr.otperformance;
        e = t.timing && t.timing.fetchStart;
      }
      return e;
    }
    uw.getTimeOrigin = TJr;
    function g$i(e) {
      let t = A2t(TJr());
      let n = A2t(typeof e === "number" ? e : SJr.otperformance.now());
      return y$i(t, n);
    }
    uw.hrTime = g$i;
    function Lqd(e) {
      if (EJr(e)) {
        return e;
      } else if (typeof e === "number") {
        if (e < TJr()) {
          return g$i(e);
        } else {
          return A2t(e);
        }
      } else if (e instanceof Date) {
        return A2t(e.getTime());
      } else {
        throw TypeError("Invalid input type");
      }
    }
    uw.timeInputToHrTime = Lqd;
    function Fqd(e, t) {
      let n = t[0] - e[0];
      let r = t[1] - e[1];
      if (r < 0) {
        n -= 1;
        r += FPn;
      }
      return [n, r];
    }
    uw.hrTimeDuration = Fqd;
    function Uqd(e) {
      let t = 9;
      let n = `${"0".repeat(t)}${e[1]}Z`;
      let r = n.substring(n.length - t - 1);
      return new Date(e[0] * 1000).toISOString().replace("000Z", r);
    }
    uw.hrTimeToTimeStamp = Uqd;
    function Bqd(e) {
      return e[0] * FPn + e[1];
    }
    uw.hrTimeToNanoseconds = Bqd;
    function $qd(e) {
      return e[0] * 1000 + e[1] / 1e6;
    }
    uw.hrTimeToMilliseconds = $qd;
    function Hqd(e) {
      return e[0] * 1e6 + e[1] / 1000;
    }
    uw.hrTimeToMicroseconds = Hqd;
    function EJr(e) {
      return Array.isArray(e) && e.length === 2 && typeof e[0] === "number" && typeof e[1] === "number";
    }
    uw.isTimeInputHrTime = EJr;
    function jqd(e) {
      return EJr(e) || typeof e === "number" || e instanceof Date;
    }
    uw.isTimeInput = jqd;
    function y$i(e, t) {
      let n = [e[0] + t[0], e[1] + t[1]];
      if (n[1] >= FPn) {
        n[1] -= FPn;
        n[0] += 1;
      }
      return n;
    }
    uw.addHrTimes = y$i;
  });
  var b$i = __commonJS(UPn => {
    Object.defineProperty(UPn, "__esModule", {
      value: true
    });
    UPn.unrefTimer = undefined;
    function qqd(e) {
      if (typeof e !== "number") {
        e.unref();
      }
    }
    UPn.unrefTimer = qqd;
  });
  var S$i = __commonJS(I2t => {
    Object.defineProperty(I2t, "__esModule", {
      value: true
    });
    I2t.ExportResultCode = undefined;
    var Wqd;
    (function (e) {
      e[e.SUCCESS = 0] = "SUCCESS";
      e[e.FAILED = 1] = "FAILED";
    })(Wqd = I2t.ExportResultCode || (I2t.ExportResultCode = {}));
  });
  var v$i = __commonJS(BPn => {
    Object.defineProperty(BPn, "__esModule", {
      value: true
    });
    BPn.CompositePropagator = undefined;
    var T$i = Ji();
    class E$i {
      _propagators;
      _fields;
      constructor(e = {}) {
        this._propagators = e.propagators ?? [];
        this._fields = Array.from(new Set(this._propagators.map(t => typeof t.fields === "function" ? t.fields() : []).reduce((t, n) => t.concat(n), [])));
      }
      inject(e, t, n) {
        for (let r of this._propagators) {
          try {
            r.inject(e, t, n);
          } catch (o) {
            T$i.diag.warn(`Failed to inject with ${r.constructor.name}. Err: ${o.message}`);
          }
        }
      }
      extract(e, t, n) {
        return this._propagators.reduce((r, o) => {
          try {
            return o.extract(r, t, n);
          } catch (s) {
            T$i.diag.warn(`Failed to extract with ${o.constructor.name}. Err: ${s.message}`);
          }
          return r;
        }, e);
      }
      fields() {
        return this._fields.slice();
      }
    }
    BPn.CompositePropagator = E$i;
  });
  var w$i = __commonJS(Rat => {
    Object.defineProperty(Rat, "__esModule", {
      value: true
    });
    Rat.validateValue = Rat.validateKey = undefined;
    var Gqd = `[a-z]${"[_0-9a-z-*/]"}{0,255}`;
    var Vqd = `[a-z0-9]${"[_0-9a-z-*/]"}{0,240}@[a-z]${"[_0-9a-z-*/]"}{0,13}`;
    var zqd = new RegExp(`^(?:${Gqd}|${Vqd})$`);
    function Jqd(e) {
      return zqd.test(e);
    }
    Rat.validateKey = Jqd;
    function Xqd(e) {
      return (/^[ -~]{0,255}[!-~]$/).test(e) && !(/,|=/).test(e);
    }
    Rat.validateValue = Xqd;
  });