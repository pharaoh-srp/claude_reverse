  var iAs = __commonJS((wCh, sAs) => {
    sAs.exports = oAs;
    oAs.sync = Yqu;
    var nAs = require("fs");
    function Kqu(e, t) {
      var n = t.pathExt !== undefined ? t.pathExt : process.env.PATHEXT;
      if (!n) {
        return true;
      }
      if (n = n.split(";"), n.indexOf("") !== -1) {
        return true;
      }
      for (var r = 0; r < n.length; r++) {
        var o = n[r].toLowerCase();
        if (o && e.substr(-o.length).toLowerCase() === o) {
          return true;
        }
      }
      return false;
    }
    function rAs(e, t, n) {
      if (!e.isSymbolicLink() && !e.isFile()) {
        return false;
      }
      return Kqu(t, n);
    }
    function oAs(e, t, n) {
      nAs.stat(e, function (r, o) {
        n(r, r ? false : rAs(o, e, t));
      });
    }
    function Yqu(e, t) {
      return rAs(nAs.statSync(e), e, t);
    }
  });
  var dAs = __commonJS((CCh, uAs) => {
    uAs.exports = lAs;
    lAs.sync = Jqu;
    var aAs = require("fs");
    function lAs(e, t, n) {
      aAs.stat(e, function (r, o) {
        n(r, r ? false : cAs(o, t));
      });
    }
    function Jqu(e, t) {
      return cAs(aAs.statSync(e), t);
    }
    function cAs(e, t) {
      return e.isFile() && Xqu(e, t);
    }
    function Xqu(e, t) {
      var {
        mode: n,
        uid: r,
        gid: o
      } = e;
      var s = t.uid !== undefined ? t.uid : process.getuid && process.getuid();
      var i = t.gid !== undefined ? t.gid : process.getgid && process.getgid();
      var a = parseInt("100", 8);
      var l = parseInt("010", 8);
      var c = parseInt("001", 8);
      var u = a | l;
      var d = n & c || n & l && o === i || n & a && r === s || n & u && s === 0;
      return d;
    }
  });
  var mAs = __commonJS((xCh, pAs) => {
    var RCh = require("fs");
    var pgn;
    if (global.TESTING_WINDOWS) {
      pgn = iAs();
    } else {
      pgn = dAs();
    }
    pAs.exports = qMr;
    qMr.sync = Qqu;
    function qMr(e, t, n) {
      if (typeof t === "function") {
        n = t;
        t = {};
      }
      if (!n) {
        if (typeof Promise !== "function") {
          throw TypeError("callback not provided");
        }
        return new Promise(function (r, o) {
          qMr(e, t || {}, function (s, i) {
            if (s) {
              o(s);
            } else {
              r(i);
            }
          });
        });
      }
      pgn(e, t || {}, function (r, o) {
        if (r) {
          if (r.code === "EACCES" || t && t.ignoreErrors) {
            r = null;
            o = false;
          }
        }
        n(r, o);
      });
    }
    function Qqu(e, t) {
      try {
        return pgn.sync(e, t || {});
      } catch (n) {
        if (t && t.ignoreErrors || n.code === "EACCES") {
          return false;
        } else {
          throw n;
        }
      }
    }
  });
  var SAs = __commonJS((kCh, bAs) => {
    var hnt = process.env.OSTYPE === "cygwin" || process.env.OSTYPE === "msys";
    var fAs = require("path");
    var Zqu = hnt ? ";" : ":";
    var hAs = mAs();
    var gAs = e => Object.assign(Error(`not found: ${e}`), {
      code: "ENOENT"
    });
    var yAs = (e, t) => {
      let n = t.colon || Zqu;
      let r = e.match(/\//) || hnt && e.match(/\\/) ? [""] : [...(hnt ? [process.cwd()] : []), ...(t.path || process.env.PATH || "").split(n)];
      let o = hnt ? t.pathExt || process.env.PATHEXT || ".EXE;.CMD;.BAT;.COM" : "";
      let s = hnt ? o.split(n) : [""];
      if (hnt) {
        if (e.indexOf(".") !== -1 && s[0] !== "") {
          s.unshift("");
        }
      }
      return {
        pathEnv: r,
        pathExt: s,
        pathExtExe: o
      };
    };
    var _As = (e, t, n) => {
      if (typeof t === "function") {
        n = t;
        t = {};
      }
      if (!t) {
        t = {};
      }
      let {
        pathEnv: r,
        pathExt: o,
        pathExtExe: s
      } = yAs(e, t);
      let i = [];
      let a = c => new Promise((u, d) => {
        if (c === r.length) {
          return t.all && i.length ? u(i) : d(gAs(e));
        }
        let p = r[c];
        let m = /^".*"$/.test(p) ? p.slice(1, -1) : p;
        let f = fAs.join(m, e);
        let h = !m && /^\.[\\\/]/.test(e) ? e.slice(0, 2) + f : f;
        u(l(h, c, 0));
      });
      let l = (c, u, d) => new Promise((p, m) => {
        if (d === o.length) {
          return p(a(u + 1));
        }
        let f = o[d];
        hAs(c + f, {
          pathExt: s
        }, (h, g) => {
          if (!h && g) {
            if (t.all) {
              i.push(c + f);
            } else {
              return p(c + f);
            }
          }
          return p(l(c, u, d + 1));
        });
      });
      return n ? a(0).then(c => n(null, c), n) : a(0);
    };
    var e3u = (e, t) => {
      t = t || {};
      let {
        pathEnv: n,
        pathExt: r,
        pathExtExe: o
      } = yAs(e, t);
      let s = [];
      for (let i = 0; i < n.length; i++) {
        let a = n[i];
        let l = /^".*"$/.test(a) ? a.slice(1, -1) : a;
        let c = fAs.join(l, e);
        let u = !l && /^\.[\\\/]/.test(e) ? e.slice(0, 2) + c : c;
        for (let d = 0; d < r.length; d++) {
          let p = u + r[d];
          try {
            if (hAs.sync(p, {
              pathExt: o
            })) {
              if (t.all) {
                s.push(p);
              } else {
                return p;
              }
            }
          } catch (m) {}
        }
      }
      if (t.all && s.length) {
        return s;
      }
      if (t.nothrow) {
        return null;
      }
      throw gAs(e);
    };
    bAs.exports = _As;
    _As.sync = e3u;
  });
  var EAs = __commonJS((ACh, WMr) => {
    var TAs = (e = {}) => {
      let t = e.env || process.env;
      if ((e.platform || "linux") !== "win32") {
        return "PATH";
      }
      return Object.keys(t).reverse().find(r => r.toUpperCase() === "PATH") || "Path";
    };
    WMr.exports = TAs;
    WMr.exports.default = TAs;
  });
  var RAs = __commonJS((ICh, CAs) => {
    var vAs = require("path");
    var t3u = SAs();
    var n3u = EAs();
    function wAs(e, t) {
      let n = e.options.env || process.env;
      let r = process.cwd();
      let o = e.options.cwd != null;
      let s = o && process.chdir !== undefined && !process.chdir.disabled;
      if (s) {
        try {
          process.chdir(e.options.cwd);
        } catch (a) {}
      }
      let i;
      try {
        i = t3u.sync(e.command, {
          path: n[n3u({
            env: n
          })],
          pathExt: t ? vAs.delimiter : undefined
        });
      } catch (a) {} finally {
        if (s) {
          process.chdir(r);
        }
      }
      if (i) {
        i = vAs.resolve(o ? e.options.cwd : "", i);
      }
      return i;
    }
    function r3u(e) {
      return wAs(e) || wAs(e, true);
    }
    CAs.exports = r3u;
  });
  var xAs = __commonJS((PCh, VMr) => {
    function o3u(e) {
      e = e.replace(/([()\][%!^"`<>&|;, *?])/g, "^$1");
      return e;
    }
    function s3u(e, t) {
      if (e = `${e}`, e = e.replace(/(?=(\\+?)?)\1"/g, "$1$1\\\""), e = e.replace(/(?=(\\+?)?)\1$/, "$1$1"), e = `"${e}"`, e = e.replace(/([()\][%!^"`<>&|;, *?])/g, "^$1"), t) {
        e = e.replace(/([()\][%!^"`<>&|;, *?])/g, "^$1");
      }
      return e;
    }
    VMr.exports.command = o3u;
    VMr.exports.argument = s3u;
  });
  var AAs = __commonJS((OCh, kAs) => {
    kAs.exports = /^#!(.*)/;
  });
  var PAs = __commonJS((DCh, IAs) => {
    var i3u = AAs();
    IAs.exports = (e = "") => {
      let t = e.match(i3u);
      if (!t) {
        return null;
      }
      let [n, r] = t[0].replace(/#! ?/, "").split(" ");
      let o = n.split("/").pop();
      if (o === "env") {
        return r;
      }
      return r ? `${o} ${r}` : o;
    };
  });
  var DAs = __commonJS((MCh, OAs) => {
    var zMr = require("fs");
    var a3u = PAs();
    function l3u(e) {
      let n = Buffer.alloc(150);
      let r;
      try {
        r = zMr.openSync(e, "r");
        zMr.readSync(r, n, 0, 150, 0);
        zMr.closeSync(r);
      } catch (o) {}
      return a3u(n.toString());
    }
    OAs.exports = l3u;
  });
  var FAs = __commonJS((NCh, LAs) => {
    var c3u = require("path");
    var MAs = RAs();
    var NAs = xAs();
    var u3u = DAs();
    function m3u(e) {
      e.file = MAs(e);
      let t = e.file && u3u(e.file);
      if (t) {
        e.args.unshift(e.file);
        e.command = t;
        return MAs(e);
      }
      return e.file;
    }
    function h3u(e, t, n) {
      if (t && !Array.isArray(t)) {
        n = t;
        t = null;
      }
      t = t ? t.slice(0) : [];
      n = Object.assign({}, n);
      let r = {
        command: e,
        args: t,
        options: n,
        file: undefined,
        original: {
          command: e,
          args: t
        }
      };
      return n.shell ? r : r;
    }
    LAs.exports = h3u;
  });