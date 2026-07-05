  var r$a = __commonJS((wb_, n$a) => {
    var {
      stringify: M2p
    } = Ift();
    var {
      outputFile: N2p
    } = rWn();
    async function L2p(e, t, n = {}) {
      let r = M2p(t, n);
      await N2p(e, r, n);
    }
    n$a.exports = L2p;
  });
  var s$a = __commonJS((Cb_, o$a) => {
    var {
      stringify: F2p
    } = Ift();
    var {
      outputFileSync: U2p
    } = rWn();
    function B2p(e, t, n) {
      let r = F2p(t, n);
      U2p(e, r, n);
    }
    o$a.exports = B2p;
  });
  var a$a = __commonJS((Rb_, i$a) => {
    var $2p = kw().fromPromise;
    var i3 = Q2a();
    i3.outputJson = $2p(r$a());
    i3.outputJsonSync = s$a();
    i3.outputJSON = i3.outputJson;
    i3.outputJSONSync = i3.outputJsonSync;
    i3.writeJSON = i3.writeJson;
    i3.writeJSONSync = i3.writeJsonSync;
    i3.readJSON = i3.readJson;
    i3.readJSONSync = i3.readJsonSync;
    i$a.exports = i3;
  });
  var p$a = __commonJS((xb_, d$a) => {
    var H2p = iS();
    var Wbo = require("path");
    var j2p = eWn().copy;
    var u$a = V9t().remove;
    var q2p = Roe().mkdirp;
    var W2p = JMe().pathExists;
    var l$a = v6e();
    function G2p(e, t, n, r) {
      if (typeof n === "function") {
        r = n;
        n = {};
      }
      n = n || {};
      let o = n.overwrite || n.clobber || false;
      l$a.checkPaths(e, t, "move", n, (s, i) => {
        if (s) {
          return r(s);
        }
        let {
          srcStat: a,
          isChangingCase: l = false
        } = i;
        l$a.checkParentPaths(e, a, t, "move", c => {
          if (c) {
            return r(c);
          }
          if (V2p(t)) {
            return c$a(e, t, o, l, r);
          }
          q2p(Wbo.dirname(t), u => {
            if (u) {
              return r(u);
            }
            return c$a(e, t, o, l, r);
          });
        });
      });
    }
    function V2p(e) {
      let t = Wbo.dirname(e);
      return Wbo.parse(t).root === t;
    }
    function c$a(e, t, n, r, o) {
      if (r) {
        return qbo(e, t, n, o);
      }
      if (n) {
        return u$a(t, s => {
          if (s) {
            return o(s);
          }
          return qbo(e, t, n, o);
        });
      }
      W2p(t, (s, i) => {
        if (s) {
          return o(s);
        }
        if (i) {
          return o(Error("dest already exists."));
        }
        return qbo(e, t, n, o);
      });
    }
    function qbo(e, t, n, r) {
      H2p.rename(e, t, o => {
        if (!o) {
          return r();
        }
        if (o.code !== "EXDEV") {
          return r(o);
        }
        return z2p(e, t, n, r);
      });
    }
    function z2p(e, t, n, r) {
      j2p(e, t, {
        overwrite: n,
        errorOnExist: true
      }, s => {
        if (s) {
          return r(s);
        }
        return u$a(e, r);
      });
    }
    d$a.exports = G2p;
  });
  var y$a = __commonJS((kb_, g$a) => {
    var f$a = iS();
    var Vbo = require("path");
    var K2p = eWn().copySync;
    var h$a = V9t().removeSync;
    var Y2p = Roe().mkdirpSync;
    var m$a = v6e();
    function J2p(e, t, n) {
      n = n || {};
      let r = n.overwrite || n.clobber || false;
      let {
        srcStat: o,
        isChangingCase: s = false
      } = m$a.checkPathsSync(e, t, "move", n);
      if (m$a.checkParentPathsSync(e, o, t, "move"), !X2p(t)) {
        Y2p(Vbo.dirname(t));
      }
      return Q2p(e, t, r, s);
    }
    function X2p(e) {
      let t = Vbo.dirname(e);
      return Vbo.parse(t).root === t;
    }
    function Q2p(e, t, n, r) {
      if (r) {
        return Gbo(e, t, n);
      }
      if (n) {
        h$a(t);
        return Gbo(e, t, n);
      }
      if (f$a.existsSync(t)) {
        throw Error("dest already exists.");
      }
      return Gbo(e, t, n);
    }
    function Gbo(e, t, n) {
      try {
        f$a.renameSync(e, t);
      } catch (r) {
        if (r.code !== "EXDEV") {
          throw r;
        }
        return Z2p(e, t, n);
      }
    }
    function Z2p(e, t, n) {
      K2p(e, t, {
        overwrite: n,
        errorOnExist: true
      });
      return h$a(e);
    }
    g$a.exports = J2p;
  });
  var b$a = __commonJS((Ab_, _$a) => {
    var e$p = kw().fromCallback;
    _$a.exports = {
      move: e$p(p$a()),
      moveSync: y$a()
    };
  });
  var T$a = __commonJS((Ib_, S$a) => {
    S$a.exports = {
      ...E6e(),
      ...eWn(),
      ...S2a(),
      ...J2a(),
      ...a$a(),
      ...Roe(),
      ...b$a(),
      ...rWn(),
      ...JMe(),
      ...V9t()
    };
  });