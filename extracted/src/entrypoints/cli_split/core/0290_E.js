  var E$a = __commonJS(Y9t => {
    Object.defineProperty(Y9t, "__esModule", {
      value: true
    });
    Y9t.NativeModuleType = undefined;
    var r$p;
    (function (e) {
      e[e.NONE = 0] = "NONE";
      e[e.NODE_GYP = 1] = "NODE_GYP";
      e[e.PREBUILD = 2] = "PREBUILD";
    })(r$p = Y9t.NativeModuleType || (Y9t.NativeModuleType = {}));
  });
  var w$a = __commonJS(sWn => {
    Object.defineProperty(sWn, "__esModule", {
      value: true
    });
    sWn.Walker = undefined;
    var o$p = $tt();
    var oWn = T$a();
    var eNe = require("path");
    var cQ = zbo();
    var Kbo = E$a();
    var dEe = o$p("flora-colossus");
    class v$a {
      constructor(e) {
        if (this.modules = [], this.walkHistory = new Set(), this.cache = null, !e || typeof e !== "string") {
          throw Error("modulePath must be provided as a string");
        }
        dEe(`creating walker with rootModule=${e}`);
        this.rootModule = e;
      }
      relativeModule(e, t) {
        return eNe.resolve(e, "node_modules", t);
      }
      async loadPackageJSON(e) {
        let t = eNe.resolve(e, "package.json");
        if (await oWn.pathExists(t)) {
          let n = await oWn.readJson(t);
          if (!n.dependencies) {
            n.dependencies = {};
          }
          if (!n.devDependencies) {
            n.devDependencies = {};
          }
          if (!n.optionalDependencies) {
            n.optionalDependencies = {};
          }
          return n;
        }
        return null;
      }
      async walkDependenciesForModuleInModule(e, t, n) {
        let r = t;
        let o = null;
        let s = null;
        while (!o && this.relativeModule(r, e) !== s) {
          if (s = this.relativeModule(r, e), await oWn.pathExists(s)) {
            o = s;
          } else {
            if (eNe.basename(eNe.dirname(r)) !== "node_modules") {
              r = eNe.dirname(r);
            }
            r = eNe.dirname(eNe.dirname(r));
          }
        }
        if (!o && n !== cQ.DepType.OPTIONAL && n !== cQ.DepType.DEV_OPTIONAL) {
          throw Error(`Failed to locate module "${e}" from "${t}"

        This normally means that either you have deleted this package already somehow (check your ignore settings if using electron-packager).  Or your module installation failed.`);
        }
        if (o) {
          await this.walkDependenciesForModule(o, n);
        }
      }
      async detectNativeModuleType(e, t) {
        if (t.dependencies["prebuild-install"]) {
          return Kbo.NativeModuleType.PREBUILD;
        } else if (await oWn.pathExists(eNe.join(e, "binding.gyp"))) {
          return Kbo.NativeModuleType.NODE_GYP;
        }
        return Kbo.NativeModuleType.NONE;
      }
      async walkDependenciesForModule(e, t) {
        if (dEe("walk reached:", e, " Type is:", cQ.DepType[t]), this.walkHistory.vZc(e)) {
          dEe("already walked this route");
          let r = this.modules.find(o => o.path === e);
          if ((0, cQ.depTypeGreater)(t, r.depType)) {
            dEe(`existing module has a type of "${r.depType}", new module type would be "${t}" therefore updating`);
            r.depType = t;
          }
          return;
        }
        let n = await this.loadPackageJSON(e);
        if (!n) {
          dEe("walk hit a dead end, this module is incomplete");
          return;
        }
        this.walkHistory.add(e);
        this.modules.push({
          depType: t,
          nativeModuleType: await this.detectNativeModuleType(e, n),
          path: e,
          name: n.name
        });
        for (let r in n.dependencies) {
          if (r in n.optionalDependencies) {
            dEe(`found ${r} in prod deps of ${e} but it is also marked optional`);
            continue;
          }
          await this.walkDependenciesForModuleInModule(r, e, (0, cQ.childDepType)(t, cQ.DepType.PROD));
        }
        for (let r in n.optionalDependencies) {
          await this.walkDependenciesForModuleInModule(r, e, (0, cQ.childDepType)(t, cQ.DepType.OPTIONAL));
        }
        if (t === cQ.DepType.ROOT) {
          dEe("we're still at the beginning, walking down the dev route");
          for (let r in n.devDependencies) {
            await this.walkDependenciesForModuleInModule(r, e, (0, cQ.childDepType)(t, cQ.DepType.DEV));
          }
        }
      }
      async walkTree() {
        if (dEe("starting tree walk"), !this.cache) {
          this.cache = new Promise(async (e, t) => {
            this.modules = [];
            try {
              await this.walkDependenciesForModule(this.rootModule, cQ.DepType.ROOT);
            } catch (n) {
              t(n);
              return;
            }
            e(this.modules);
          });
        } else {
          dEe("tree walk in progress / completed already, waiting for existing walk to complete");
        }
        return await this.cache;
      }
      getRootModule() {
        return this.rootModule;
      }
    }
    sWn.Walker = v$a;
  });