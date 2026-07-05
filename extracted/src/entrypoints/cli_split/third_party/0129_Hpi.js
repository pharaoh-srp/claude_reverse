  var Hpi = __commonJS((TTg, hst) => {
    var ZR = global.process;
    var Lqe = function (e) {
      return e && typeof e === "object" && typeof e.removeListener === "function" && typeof e.emit === "function" && typeof e.reallyExit === "function" && typeof e.listeners === "function" && typeof e.kill === "function" && typeof e.pid === "number" && typeof e.on === "function";
    };
    if (!Lqe(ZR)) {
      hst.exports = function () {
        return function () {};
      };
    } else {
      if (VWr = require("assert"), Fqe = $pi(), zWr = /^win/i.test(ZR.platform), fst = require("events"), typeof fst !== "function") {
        fst = fst.EventEmitter;
      }
      if (ZR.__signal_exit_emitter__) {
        JD = ZR.__signal_exit_emitter__;
      } else {
        JD = ZR.__signal_exit_emitter__ = new fst();
        JD.count = 0;
        JD.emitted = {};
      }
      if (!JD.infinite) {
        JD.setMaxListeners(1 / 0);
        JD.infinite = true;
      }
      hst.exports = function (e, t) {
        if (!Lqe(global.process)) {
          return function () {};
        }
        if (VWr.equal(typeof e, "function", "a callback must be provided for exit handler"), Uqe === false) {
          TRn();
        }
        var n = "exit";
        if (t && t.alwaysLast) {
          n = "afterexit";
        }
        var r = function () {
          if (JD.removeListener(n, e), JD.listeners("exit").length === 0 && JD.listeners("afterexit").length === 0) {
            VLt();
          }
        };
        JD.on(n, e);
        return r;
      };
      VLt = function () {
        if (!Uqe || !Lqe(global.process)) {
          return;
        }
        Uqe = false;
        Fqe.forEach(function (t) {
          try {
            ZR.removeListener(t, zLt[t]);
          } catch (n) {}
        });
        ZR.emit = KLt;
        ZR.reallyExit = ERn;
        JD.count -= 1;
      };
      hst.exports.unload = VLt;
      y0e = function (t, n, r) {
        if (JD.emitted[t]) {
          return;
        }
        JD.emitted[t] = true;
        JD.emit(t, n, r);
      };
      zLt = {};
      Fqe.forEach(function (e) {
        zLt[e] = function () {
          if (!Lqe(global.process)) {
            return;
          }
          var n = ZR.listeners(e);
          if (n.length === JD.count) {
            if (VLt(), y0e("exit", null, e), y0e("afterexit", null, e), zWr && e === "SIGHUP") {
              e = "SIGINT";
            }
            ZR.kill(ZR.pid, e);
          }
        };
      });
      hst.exports.signals = function () {
        return Fqe;
      };
      Uqe = false;
      TRn = function () {
        if (Uqe || !Lqe(global.process)) {
          return;
        }
        Uqe = true;
        JD.count += 1;
        Fqe = Fqe.filter(function (t) {
          try {
            ZR.on(t, zLt[t]);
            return true;
          } catch (n) {
            return false;
          }
        });
        ZR.emit = YWr;
        ZR.reallyExit = KWr;
      };
      hst.exports.load = TRn;
      ERn = ZR.reallyExit;
      KWr = function (t) {
        if (!Lqe(global.process)) {
          return;
        }
        ZR.exitCode = t || 0;
        y0e("exit", ZR.exitCode, null);
        y0e("afterexit", ZR.exitCode, null);
        ERn.call(ZR, ZR.exitCode);
      };
      KLt = ZR.emit;
      YWr = function (t, n) {
        if (t === "exit" && Lqe(global.process)) {
          if (n !== undefined) {
            ZR.exitCode = n;
          }
          var r = KLt.apply(this, arguments);
          y0e("exit", ZR.exitCode, null);
          y0e("afterexit", ZR.exitCode, null);
          return r;
        } else {
          return KLt.apply(this, arguments);
        }
      };
    }
    var VWr;
    var Fqe;
    var zWr;
    var fst;
    var JD;
    var VLt;
    var y0e;
    var zLt;
    var Uqe;
    var TRn;
    var ERn;
    var KWr;
    var KLt;
    var YWr;
  });
  var qpi = __commonJS((ETg, JWr) => {
    var jpi = Symbol();
    function Twd(e, t, n) {
      let r = t[jpi];
      if (r) {
        return t.stat(e, (s, i) => {
          if (s) {
            return n(s);
          }
          n(null, i.mtime, r);
        });
      }
      let o = new Date(Math.ceil(Date.now() / 1000) * 1000 + 5);
      t.utimes(e, o, o, s => {
        if (s) {
          return n(s);
        }
        t.stat(e, (i, a) => {
          if (i) {
            return n(i);
          }
          let l = a.mtime.getTime() % 1000 === 0 ? "s" : "ms";
          Object.defineProperty(t, jpi, {
            value: l
          });
          n(null, a.mtime, l);
        });
      });
    }
    function Ewd(e) {
      let t = Date.now();
      if (e === "s") {
        t = Math.ceil(t / 1000) * 1000;
      }
      return new Date(t);
    }
    JWr.exports.probe = Twd;
    JWr.exports.getMtime = Ewd;
  });
  var Kpi = __commonJS((vTg, JLt) => {
    var vwd = require("path");
    var ZWr = iS();
    var wwd = Bpi();
    var Cwd = Hpi();
    var Wpi = qpi();
    var k_e = {};
    function YLt(e, t) {
      return t.lockfilePath || `${e}.lock`;
    }
    function eGr(e, t, n) {
      if (!t.realpath) {
        return n(null, vwd.resolve(e));
      }
      t.fs.realpath(e, n);
    }
    function QWr(e, t, n) {
      let r = YLt(e, t);
      t.fs.mkdir(r, o => {
        if (!o) {
          return Wpi.probe(r, t.fs, (s, i, a) => {
            if (s) {
              t.fs.rmdir(r, () => {});
              return n(s);
            }
            n(null, i, a);
          });
        }
        if (o.code !== "EEXIST") {
          return n(o);
        }
        if (t.stale <= 0) {
          return n(Object.assign(Error("Lock file is already being held"), {
            code: "ELOCKED",
            file: e
          }));
        }
        t.fs.stat(r, (s, i) => {
          if (s) {
            if (s.code === "ENOENT") {
              return QWr(e, {
                ...t,
                stale: 0
              }, n);
            }
            return n(s);
          }
          if (!Gpi(i, t)) {
            return n(Object.assign(Error("Lock file is already being held"), {
              code: "ELOCKED",
              file: e
            }));
          }
          Vpi(e, t, a => {
            if (a) {
              return n(a);
            }
            QWr(e, {
              ...t,
              stale: 0
            }, n);
          });
        });
      });
    }
    function Gpi(e, t) {
      return e.mtime.getTime() < Date.now() - t.stale;
    }
    function Vpi(e, t, n) {
      t.fs.rmdir(YLt(e, t), r => {
        if (r && r.code !== "ENOENT") {
          return n(r);
        }
        n();
      });
    }
    function vRn(e, t) {
      let n = k_e[e];
      if (n.updateTimeout) {
        return;
      }
      if (n.updateDelay = n.updateDelay || t.update, n.updateTimeout = setTimeout(() => {
        n.updateTimeout = null;
        t.fs.stat(n.lockfilePath, (r, o) => {
          let s = n.lastUpdate + t.stale < Date.now();
          if (r) {
            if (r.code === "ENOENT" || s) {
              return XWr(e, n, Object.assign(r, {
                code: "ECOMPROMISED"
              }));
            }
            n.updateDelay = 1000;
            return vRn(e, t);
          }
          if (n.mtime.getTime() !== o.mtime.getTime()) {
            return XWr(e, n, Object.assign(Error("Unable to update lock within the stale threshold"), {
              code: "ECOMPROMISED"
            }));
          }
          let a = Wpi.getMtime(n.mtimePrecision);
          t.fs.utimes(n.lockfilePath, a, a, l => {
            let c = n.lastUpdate + t.stale < Date.now();
            if (n.released) {
              return;
            }
            if (l) {
              if (l.code === "ENOENT" || c) {
                return XWr(e, n, Object.assign(l, {
                  code: "ECOMPROMISED"
                }));
              }
              n.updateDelay = 1000;
              return vRn(e, t);
            }
            n.mtime = a;
            n.lastUpdate = Date.now();
            n.updateDelay = null;
            vRn(e, t);
          });
        });
      }, n.updateDelay), n.updateTimeout.unref) {
        n.updateTimeout.unref();
      }
    }
    function XWr(e, t, n) {
      if (t.released = true, t.updateTimeout) {
        clearTimeout(t.updateTimeout);
      }
      if (k_e[e] === t) {
        delete k_e[e];
      }
      t.options.onCompromised(n);
    }
    function Rwd(e, t, n) {
      t = {
        stale: 1e4,
        update: null,
        realpath: true,
        retries: 0,
        fs: ZWr,
        onCompromised: r => {
          throw r;
        },
        ...t
      };
      t.retries = t.retries || 0;
      t.retries = typeof t.retries === "number" ? {
        retries: t.retries
      } : t.retries;
      t.stale = Math.max(t.stale || 0, 2000);
      t.update = t.update == null ? t.stale / 2 : t.update || 0;
      t.update = Math.max(Math.min(t.update, t.stale / 2), 1000);
      eGr(e, t, (r, o) => {
        if (r) {
          return n(r);
        }
        let s = wwd.operation(t.retries);
        s.attempt(() => {
          QWr(o, t, (i, a, l) => {
            if (s.retry(i)) {
              return;
            }
            if (i) {
              return n(s.mainError());
            }
            let c = k_e[o] = {
              lockfilePath: YLt(o, t),
              mtime: a,
              mtimePrecision: l,
              options: t,
              lastUpdate: Date.now()
            };
            vRn(o, t);
            n(null, u => {
              if (c.released) {
                return u && u(Object.assign(Error("Lock is already released"), {
                  code: "ERELEASED"
                }));
              }
              zpi(o, {
                ...t,
                realpath: false
              }, u);
            });
          });
        });
      });
    }
    function zpi(e, t, n) {
      t = {
        fs: ZWr,
        realpath: true,
        ...t
      };
      eGr(e, t, (r, o) => {
        if (r) {
          return n(r);
        }
        let s = k_e[o];
        if (!s) {
          return n(Object.assign(Error("Lock is not acquired/owned by you"), {
            code: "ENOTACQUIRED"
          }));
        }
        s.updateTimeout && clearTimeout(s.updateTimeout);
        s.released = true;
        delete k_e[o];
        Vpi(o, t, n);
      });
    }
    function xwd(e, t, n) {
      t = {
        stale: 1e4,
        realpath: true,
        fs: ZWr,
        ...t
      };
      t.stale = Math.max(t.stale || 0, 2000);
      eGr(e, t, (r, o) => {
        if (r) {
          return n(r);
        }
        t.fs.stat(YLt(o, t), (s, i) => {
          if (s) {
            return s.code === "ENOENT" ? n(null, false) : n(s);
          }
          return n(null, !Gpi(i, t));
        });
      });
    }
    function kwd() {
      return k_e;
    }
    Cwd(() => {
      for (let e in k_e) {
        let t = k_e[e].options;
        try {
          t.fs.rmdirSync(YLt(e, t));
        } catch (n) {}
      }
    });
    JLt.exports.lock = Rwd;
    JLt.exports.unlock = zpi;
    JLt.exports.check = xwd;
    JLt.exports.getLocks = kwd;
  });
  var Jpi = __commonJS((wTg, Ypi) => {
    var Awd = iS();
    function Iwd(e) {
      let t = ["mkdir", "realpath", "stat", "rmdir", "utimes"];
      let n = {
        ...e
      };
      t.forEach(r => {
        n[r] = (...o) => {
          let s = o.pop();
          let i;
          try {
            i = e[`${r}Sync`](...o);
          } catch (a) {
            return s(a);
          }
          s(null, i);
        };
      });
      return n;
    }
    function Pwd(e) {
      return (...t) => new Promise((n, r) => {
        t.push((o, s) => {
          if (o) {
            r(o);
          } else {
            n(s);
          }
        });
        e(...t);
      });
    }
    function Owd(e) {
      return (...t) => {
        let n;
        let r;
        if (t.push((o, s) => {
          n = o;
          r = s;
        }), e(...t), n) {
          throw n;
        }
        return r;
      };
    }
    function Dwd(e) {
      if (e = {
        ...e
      }, e.fs = Iwd(e.fs || Awd), typeof e.retries === "number" && e.retries > 0 || e.retries && typeof e.retries.retries === "number" && e.retries.retries > 0) {
        throw Object.assign(Error("Cannot use retries with the sync api"), {
          code: "ESYNC"
        });
      }
      return e;
    }
    Ypi.exports = {
      toPromise: Pwd,
      toSync: Owd,
      toSyncOptions: Dwd
    };
  });
  var Qpi = __commonJS((CTg, _0e) => {
    var gst = Kpi();
    var {
      toPromise: wRn,
      toSync: CRn,
      toSyncOptions: tGr
    } = Jpi();
    async function Xpi(e, t) {
      let n = await wRn(gst.lock)(e, t);
      return wRn(n);
    }
    function Mwd(e, t) {
      let n = CRn(gst.lock)(e, tGr(t));
      return CRn(n);
    }
    function Nwd(e, t) {
      return wRn(gst.unlock)(e, t);
    }
    function Lwd(e, t) {
      return CRn(gst.unlock)(e, tGr(t));
    }
    function Fwd(e, t) {
      return wRn(gst.check)(e, t);
    }
    function Uwd(e, t) {
      return CRn(gst.check)(e, tGr(t));
    }
    _0e.exports = Xpi;
    _0e.exports.lock = Xpi;
    _0e.exports.unlock = Nwd;
    _0e.exports.lockSync = Mwd;
    _0e.exports.unlockSync = Lwd;
    _0e.exports.check = Fwd;
    _0e.exports.checkSync = Uwd;
  });