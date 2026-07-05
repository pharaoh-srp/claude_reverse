  function rGr() {
    if (!nGr) {
      nGr = Qpi();
    }
    return nGr;
  }
  async function Ry(e, t) {
    let n = await rGr().lock(e, t);
    return Object.assign(n, {
      [Symbol.asyncDispose]: n
    });
  }
  function Zpi(e, t) {
    let n = rGr().lockSync(e, t);
    return Object.assign(n, {
      [Symbol.dispose]: n
    });
  }
  function emi(e, t) {
    return rGr().check(e, t);
  }
  var nGr;
  async function Bwd(e) {
    if (tmi.getStore()) {
      return e();
    }
    let t = nmi;
    let n = Promise.withResolvers();
    nmi = n.promise;
    try {
      await t;
      let r = LY();
      await Ys().mkdir(r);
      let o = await Ry(omi.join(r, ".storage-write"), {
        realpath: false,
        retries: {
          retries: 10,
          minTimeout: 100,
          maxTimeout: 1000
        },
        stale: 15000,
        onCompromised: s => logForDebugging(`[secureStorage] write lock compromised: ${he(s)}`, {
          level: "warn"
        })
      });
      try {
        return await tmi.run(true, e);
      } finally {
        await o().catch(s => logForDebugging(`[secureStorage] write lock release failed: ${he(s)}`, {
          level: "warn"
        }));
      }
    } finally {
      n.resolve();
    }
  }
  function XLt(e, t) {
    return Bwd(async () => {
      e.invalidateCache?.();
      let n = await (e.readAsyncStrict?.() ?? e.readAsync());
      if (n === mRn) {
        return {
          success: false,
          transient: true
        };
      }
      let r = n ?? {};
      let o = t(r);
      return o === r ? {
        success: true
      } : await e.update(o);
    });
  }
  var rmi;
  var omi;
  var tmi;
  var nmi;
  var QLt = __lazy(() => {
    _b();
    je();
    dt();
    o8();
    fRn();
    rmi = require("async_hooks");
    omi = require("path");
    tmi = new rmi.AsyncLocalStorage();
    nmi = Promise.resolve();
  });
  var smi = __lazy(() => {
    ln();
    fRn();
    QLt();
  });
  function imi() {
    if (yst !== undefined) {
      return yst;
    }
    yst = Promise.resolve(false);
    return yst;
  }
  var yst;
  var oGr = __lazy(() => {
    je();
    ji();
    wNr();
    oF();
    o8();
    fRn();
    QLt();
  });
  function RRn() {
    let e = LY();
    let t = ".credentials.json";
    return {
      storageDir: e,
      storagePath: lmi.join(e, ".credentials.json")
    };
  }
  var ami;
  var lmi;
  var sGr;
  var cmi = __lazy(() => {
    BT();
    dt();
    o8();
    QLt();
    ami = require("fs/promises");
    lmi = require("path");
    sGr = {
      name: "plaintext",
      read() {
        let {
          storagePath: e
        } = RRn();
        try {
          let t = zt().readFileSync(e, {
            encoding: "utf8"
          });
          return qt(t);
        } catch {
          return null;
        }
      },
      async readAsync() {
        let {
          storagePath: e
        } = RRn();
        try {
          let t = await zt().readFile(e, {
            encoding: "utf8"
          });
          return qt(t);
        } catch {
          return null;
        }
      },
      mutate(e) {
        return XLt(sGr, e);
      },
      async update(e) {
        try {
          let {
            storageDir: t,
            storagePath: n
          } = RRn();
          await zt().mkdir(t);
          await Fm(n, De(e), 384);
          await ami.chmod(n, 384);
          return {
            success: true,
            warning: "Warning: Storing credentials in plaintext."
          };
        } catch {
          return {
            success: false
          };
        }
      },
      async delete() {
        let {
          storagePath: e
        } = RRn();
        try {
          await zt().unlink(e);
          return true;
        } catch (t) {
          if (en(t) === "ENOENT") {
            return true;
          }
          return false;
        }
      }
    };
  });
  var ymi = {};