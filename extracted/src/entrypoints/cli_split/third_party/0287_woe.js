  var woe = __commonJS((A__, HFa) => {
    var mFp = kw().fromPromise;
    var {
      makeDir: fFp,
      makeDirSync: Tbo
    } = $Fa();
    var Ebo = mFp(fFp);
    HFa.exports = {
      mkdirs: Ebo,
      mkdirsSync: Tbo,
      mkdirp: Ebo,
      mkdirpSync: Tbo,
      ensureDir: Ebo,
      ensureDirSync: Tbo
    };
  });
  var GMe = __commonJS((I__, qFa) => {
    var hFp = kw().fromPromise;
    var jFa = S6e();
    function gFp(e) {
      return jFa.access(e).then(() => true).catch(() => false);
    }
    qFa.exports = {
      pathExists: hFp(gFp),
      pathExistsSync: jFa.existsSync
    };
  });
  var vbo = __commonJS((P__, WFa) => {
    var kft = iS();
    function yFp(e, t, n, r) {
      kft.open(e, "r+", (o, s) => {
        if (o) {
          return r(o);
        }
        kft.futimes(s, t, n, i => {
          kft.close(s, a => {
            if (r) {
              r(i || a);
            }
          });
        });
      });
    }
    function _Fp(e, t, n) {
      let r = kft.openSync(e, "r+");
      kft.futimesSync(r, t, n);
      return kft.closeSync(r);
    }
    WFa.exports = {
      utimesMillis: yFp,
      utimesMillisSync: _Fp
    };
  });
  var T6e = __commonJS((O__, zFa) => {
    var Aft = S6e();
    var j1 = require("path");
    var bFp = require("util");
    function SFp(e, t, n) {
      let r = n.dereference ? o => Aft.stat(o, {
        bigint: true
      }) : o => Aft.lstat(o, {
        bigint: true
      });
      return Promise.all([r(e), r(t).catch(o => {
        if (o.code === "ENOENT") {
          return null;
        }
        throw o;
      })]).then(([o, s]) => ({
        srcStat: o,
        destStat: s
      }));
    }
    function TFp(e, t, n) {
      let r;
      let o = n.dereference ? i => Aft.statSync(i, {
        bigint: true
      }) : i => Aft.lstatSync(i, {
        bigint: true
      });
      let s = o(e);
      try {
        r = o(t);
      } catch (i) {
        if (i.code === "ENOENT") {
          return {
            srcStat: s,
            destStat: null
          };
        }
        throw i;
      }
      return {
        srcStat: s,
        destStat: r
      };
    }
    function EFp(e, t, n, r, o) {
      bFp.callbackify(SFp)(e, t, r, (s, i) => {
        if (s) {
          return o(s);
        }
        let {
          srcStat: a,
          destStat: l
        } = i;
        if (l) {
          if (D9t(a, l)) {
            let c = j1.basename(e);
            let u = j1.basename(t);
            if (n === "move" && c !== u && c.toLowerCase() === u.toLowerCase()) {
              return o(null, {
                srcStat: a,
                destStat: l,
                isChangingCase: true
              });
            }
            return o(Error("Source and destination must not be the same."));
          }
          if (a.isDirectory() && !l.isDirectory()) {
            return o(Error(`Cannot overwrite non-directory '${t}' with directory '${e}'.`));
          }
          if (!a.isDirectory() && l.isDirectory()) {
            return o(Error(`Cannot overwrite directory '${t}' with non-directory '${e}'.`));
          }
        }
        if (a.isDirectory() && wbo(e, t)) {
          return o(Error(q4n(e, t, n)));
        }
        return o(null, {
          srcStat: a,
          destStat: l
        });
      });
    }
    function vFp(e, t, n, r) {
      let {
        srcStat: o,
        destStat: s
      } = TFp(e, t, r);
      if (s) {
        if (D9t(o, s)) {
          let i = j1.basename(e);
          let a = j1.basename(t);
          if (n === "move" && i !== a && i.toLowerCase() === a.toLowerCase()) {
            return {
              srcStat: o,
              destStat: s,
              isChangingCase: true
            };
          }
          throw Error("Source and destination must not be the same.");
        }
        if (o.isDirectory() && !s.isDirectory()) {
          throw Error(`Cannot overwrite non-directory '${t}' with directory '${e}'.`);
        }
        if (!o.isDirectory() && s.isDirectory()) {
          throw Error(`Cannot overwrite directory '${t}' with non-directory '${e}'.`);
        }
      }
      if (o.isDirectory() && wbo(e, t)) {
        throw Error(q4n(e, t, n));
      }
      return {
        srcStat: o,
        destStat: s
      };
    }
    function GFa(e, t, n, r, o) {
      let s = j1.resolve(j1.dirname(e));
      let i = j1.resolve(j1.dirname(n));
      if (i === s || i === j1.parse(i).root) {
        return o();
      }
      Aft.stat(i, {
        bigint: true
      }, (a, l) => {
        if (a) {
          if (a.code === "ENOENT") {
            return o();
          }
          return o(a);
        }
        if (D9t(t, l)) {
          return o(Error(q4n(e, n, r)));
        }
        return GFa(e, t, i, r, o);
      });
    }
    function VFa(e, t, n, r) {
      let o = j1.resolve(j1.dirname(e));
      let s = j1.resolve(j1.dirname(n));
      if (s === o || s === j1.parse(s).root) {
        return;
      }
      let i;
      try {
        i = Aft.statSync(s, {
          bigint: true
        });
      } catch (a) {
        if (a.code === "ENOENT") {
          return;
        }
        throw a;
      }
      if (D9t(t, i)) {
        throw Error(q4n(e, n, r));
      }
      return VFa(e, t, s, r);
    }
    function D9t(e, t) {
      return t.ino && t.dev && t.ino === e.ino && t.dev === e.dev;
    }
    function wbo(e, t) {
      let n = j1.resolve(e).split(j1.sep).filter(o => o);
      let r = j1.resolve(t).split(j1.sep).filter(o => o);
      return n.reduce((o, s, i) => o && r[i] === s, true);
    }
    function q4n(e, t, n) {
      return `Cannot ${n} '${e}' to a subdirectory of itself, '${t}'.`;
    }
    zFa.exports = {
      checkPaths: EFp,
      checkPathsSync: vFp,
      checkParentPaths: GFa,
      checkParentPathsSync: VFa,
      isSrcSubdir: wbo,
      areIdentical: D9t
    };
  });
  var tUa = __commonJS((D__, eUa) => {
    var r9 = iS();
    var M9t = require("path");
    var wFp = woe().mkdirs;
    var CFp = GMe().pathExists;
    var RFp = vbo().utimesMillis;
    var N9t = T6e();
    function xFp(e, t, n, r) {
      if (typeof n === "function" && !r) {
        r = n;
        n = {};
      } else if (typeof n === "function") {
        n = {
          filter: n
        };
      }
      r = r || function () {};
      n = n || {};
      n.clobber = "clobber" in n ? !!n.clobber : true;
      n.overwrite = "overwrite" in n ? !!n.overwrite : n.clobber;
      n.preserveTimestamps;
      N9t.checkPaths(e, t, "copy", n, (o, s) => {
        if (o) {
          return r(o);
        }
        let {
          srcStat: i,
          destStat: a
        } = s;
        N9t.checkParentPaths(e, i, t, "copy", l => {
          if (l) {
            return r(l);
          }
          if (n.filter) {
            return JFa(KFa, a, e, t, n, r);
          }
          return KFa(a, e, t, n, r);
        });
      });
    }
    function KFa(e, t, n, r, o) {
      let s = M9t.dirname(n);
      CFp(s, (i, a) => {
        if (i) {
          return o(i);
        }
        if (a) {
          return W4n(e, t, n, r, o);
        }
        wFp(s, l => {
          if (l) {
            return o(l);
          }
          return W4n(e, t, n, r, o);
        });
      });
    }
    function JFa(e, t, n, r, o, s) {
      Promise.resolve(o.filter(n, r)).then(i => {
        if (i) {
          return e(t, n, r, o, s);
        }
        return s();
      }, i => s(i));
    }
    function kFp(e, t, n, r, o) {
      if (r.filter) {
        return JFa(W4n, e, t, n, r, o);
      }
      return W4n(e, t, n, r, o);
    }
    function W4n(e, t, n, r, o) {
      (r.dereference ? r9.stat : r9.lstat)(t, (i, a) => {
        if (i) {
          return o(i);
        }
        if (a.isDirectory()) {
          return NFp(a, e, t, n, r, o);
        } else if (a.isFile() || a.isCharacterDevice() || a.isBlockDevice()) {
          return AFp(a, e, t, n, r, o);
        } else if (a.isSymbolicLink()) {
          return UFp(e, t, n, r, o);
        } else if (a.isSocket()) {
          return o(Error(`Cannot copy a socket file: ${t}`));
        } else if (a.isFIFO()) {
          return o(Error(`Cannot copy a FIFO pipe: ${t}`));
        }
        return o(Error(`Unknown file: ${t}`));
      });
    }
    function AFp(e, t, n, r, o, s) {
      if (!t) {
        return XFa(e, n, r, o, s);
      }
      return IFp(e, n, r, o, s);
    }
    function IFp(e, t, n, r, o) {
      if (r.overwrite) {
        r9.unlink(n, s => {
          if (s) {
            return o(s);
          }
          return XFa(e, t, n, r, o);
        });
      } else if (r.errorOnExist) {
        return o(Error(`'${n}' already exists`));
      } else {
        return o();
      }
    }
    function XFa(e, t, n, r, o) {
      r9.copyFile(t, n, s => {
        if (s) {
          return o(s);
        }
        if (r.preserveTimestamps) {
          return PFp(e.mode, t, n, o);
        }
        return G4n(n, e.mode, o);
      });
    }
    function PFp(e, t, n, r) {
      if (OFp(e)) {
        return DFp(n, e, o => {
          if (o) {
            return r(o);
          }
          return YFa(e, t, n, r);
        });
      }
      return YFa(e, t, n, r);
    }
    function OFp(e) {
      return (e & 128) === 0;
    }
    function DFp(e, t, n) {
      return G4n(e, t | 128, n);
    }
    function YFa(e, t, n, r) {
      MFp(t, n, o => {
        if (o) {
          return r(o);
        }
        return G4n(n, e, r);
      });
    }
    function G4n(e, t, n) {
      return r9.chmod(e, t, n);
    }
    function MFp(e, t, n) {
      r9.stat(e, (r, o) => {
        if (r) {
          return n(r);
        }
        return RFp(t, o.atime, o.mtime, n);
      });
    }
    function NFp(e, t, n, r, o, s) {
      if (!t) {
        return LFp(e.mode, n, r, o, s);
      }
      return QFa(n, r, o, s);
    }
    function LFp(e, t, n, r, o) {
      r9.mkdir(n, s => {
        if (s) {
          return o(s);
        }
        QFa(t, n, r, i => {
          if (i) {
            return o(i);
          }
          return G4n(n, e, o);
        });
      });
    }
    function QFa(e, t, n, r) {
      r9.readdir(e, (o, s) => {
        if (o) {
          return r(o);
        }
        return ZFa(s, e, t, n, r);
      });
    }
    function ZFa(e, t, n, r, o) {
      let s = e.pop();
      if (!s) {
        return o();
      }
      return FFp(e, s, t, n, r, o);
    }
    function FFp(e, t, n, r, o, s) {
      let i = M9t.join(n, t);
      let a = M9t.join(r, t);
      N9t.checkPaths(i, a, "copy", o, (l, c) => {
        if (l) {
          return s(l);
        }
        let {
          destStat: u
        } = c;
        kFp(u, i, a, o, d => {
          if (d) {
            return s(d);
          }
          return ZFa(e, n, r, o, s);
        });
      });
    }
    function UFp(e, t, n, r, o) {
      r9.readlink(t, (s, i) => {
        if (s) {
          return o(s);
        }
        if (r.dereference) {
          i = M9t.resolve(process.cwd(), i);
        }
        if (!e) {
          return r9.symlink(i, n, o);
        } else {
          r9.readlink(n, (a, l) => {
            if (a) {
              if (a.code === "EINVAL" || a.code === "UNKNOWN") {
                return r9.symlink(i, n, o);
              }
              return o(a);
            }
            if (r.dereference) {
              l = M9t.resolve(process.cwd(), l);
            }
            if (N9t.isSrcSubdir(i, l)) {
              return o(Error(`Cannot copy '${i}' to a subdirectory of itself, '${l}'.`));
            }
            if (e.isDirectory() && N9t.isSrcSubdir(l, i)) {
              return o(Error(`Cannot overwrite '${l}' with '${i}'.`));
            }
            return BFp(i, n, o);
          });
        }
      });
    }
    function BFp(e, t, n) {
      r9.unlink(t, r => {
        if (r) {
          return n(r);
        }
        return r9.symlink(e, t, n);
      });
    }
    eUa.exports = xFp;
  });
  var iUa = __commonJS((M__, sUa) => {
    var I$ = iS();
    var L9t = require("path");
    var $Fp = woe().mkdirsSync;
    var HFp = vbo().utimesMillisSync;
    var F9t = T6e();
    function jFp(e, t, n) {
      if (typeof n === "function") {
        n = {
          filter: n
        };
      }
      n = n || {};
      n.clobber = "clobber" in n ? !!n.clobber : true;
      n.overwrite = "overwrite" in n ? !!n.overwrite : n.clobber;
      n.preserveTimestamps;
      let {
        srcStat: r,
        destStat: o
      } = F9t.checkPathsSync(e, t, "copy", n);
      F9t.checkParentPathsSync(e, r, t, "copy");
      return qFp(o, e, t, n);
    }
    function qFp(e, t, n, r) {
      if (r.filter && !r.filter(t, n)) {
        return;
      }
      let o = L9t.dirname(n);
      if (!I$.existsSync(o)) {
        $Fp(o);
      }
      return nUa(e, t, n, r);
    }
    function WFp(e, t, n, r) {
      if (r.filter && !r.filter(t, n)) {
        return;
      }
      return nUa(e, t, n, r);
    }
    function nUa(e, t, n, r) {
      let s = (r.dereference ? I$.statSync : I$.lstatSync)(t);
      if (s.isDirectory()) {
        return XFp(s, e, t, n, r);
      } else if (s.isFile() || s.isCharacterDevice() || s.isBlockDevice()) {
        return GFp(s, e, t, n, r);
      } else if (s.isSymbolicLink()) {
        return eUp(e, t, n, r);
      } else if (s.isSocket()) {
        throw Error(`Cannot copy a socket file: ${t}`);
      } else if (s.isFIFO()) {
        throw Error(`Cannot copy a FIFO pipe: ${t}`);
      }
      throw Error(`Unknown file: ${t}`);
    }
    function GFp(e, t, n, r, o) {
      if (!t) {
        return rUa(e, n, r, o);
      }
      return VFp(e, n, r, o);
    }
    function VFp(e, t, n, r) {
      if (r.overwrite) {
        I$.unlinkSync(n);
        return rUa(e, t, n, r);
      } else if (r.errorOnExist) {
        throw Error(`'${n}' already exists`);
      }
    }
    function rUa(e, t, n, r) {
      if (I$.copyFileSync(t, n), r.preserveTimestamps) {
        zFp(e.mode, t, n);
      }
      return Cbo(n, e.mode);
    }
    function zFp(e, t, n) {
      if (KFp(e)) {
        YFp(n, e);
      }
      return JFp(t, n);
    }
    function KFp(e) {
      return (e & 128) === 0;
    }
    function YFp(e, t) {
      return Cbo(e, t | 128);
    }
    function Cbo(e, t) {
      return I$.chmodSync(e, t);
    }
    function JFp(e, t) {
      let n = I$.statSync(e);
      return HFp(t, n.atime, n.mtime);
    }
    function XFp(e, t, n, r, o) {
      if (!t) {
        return QFp(e.mode, n, r, o);
      }
      return oUa(n, r, o);
    }
    function QFp(e, t, n, r) {
      I$.mkdirSync(n);
      oUa(t, n, r);
      return Cbo(n, e);
    }
    function oUa(e, t, n) {
      I$.readdirSync(e).forEach(r => ZFp(r, e, t, n));
    }
    function ZFp(e, t, n, r) {
      let o = L9t.join(t, e);
      let s = L9t.join(n, e);
      let {
        destStat: i
      } = F9t.checkPathsSync(o, s, "copy", r);
      return WFp(i, o, s, r);
    }
    function eUp(e, t, n, r) {
      let o = I$.readlinkSync(t);
      if (r.dereference) {
        o = L9t.resolve(process.cwd(), o);
      }
      if (!e) {
        return I$.symlinkSync(o, n);
      } else {
        let s;
        try {
          s = I$.readlinkSync(n);
        } catch (i) {
          if (i.code === "EINVAL" || i.code === "UNKNOWN") {
            return I$.symlinkSync(o, n);
          }
          throw i;
        }
        if (r.dereference) {
          s = L9t.resolve(process.cwd(), s);
        }
        if (F9t.isSrcSubdir(o, s)) {
          throw Error(`Cannot copy '${o}' to a subdirectory of itself, '${s}'.`);
        }
        if (I$.statSync(n).isDirectory() && F9t.isSrcSubdir(s, o)) {
          throw Error(`Cannot overwrite '${s}' with '${o}'.`);
        }
        return tUp(o, n);
      }
    }
    function tUp(e, t) {
      I$.unlinkSync(t);
      return I$.symlinkSync(e, t);
    }
    sUa.exports = jFp;
  });
  var V4n = __commonJS((N__, aUa) => {
    var nUp = kw().fromCallback;
    aUa.exports = {
      copy: nUp(tUa()),
      copySync: iUa()
    };
  });
  var fUa = __commonJS((L__, mUa) => {
    var lUa = iS();
    var uUa = require("path");
    var y0 = require("assert");
    function dUa(e) {
      ["unlink", "chmod", "stat", "lstat", "rmdir", "readdir"].forEach(n => {
        e[n] = e[n] || lUa[n];
        n = n + "Sync";
        e[n] = e[n] || lUa[n];
      });
      e.maxBusyTries = e.maxBusyTries || 3;
    }
    function kbo(e, t, n) {
      let r = 0;
      if (typeof t === "function") {
        n = t;
        t = {};
      }
      y0(e, "rimraf: missing path");
      y0.strictEqual(typeof e, "string", "rimraf: path should be a string");
      y0.strictEqual(typeof n, "function", "rimraf: callback function required");
      y0(t, "rimraf: invalid options argument provided");
      y0.strictEqual(typeof t, "object", "rimraf: options should be object");
      dUa(t);
      cUa(e, t, function o(s) {
        if (s) {
          if ((s.code === "EBUSY" || s.code === "ENOTEMPTY" || s.code === "EPERM") && r < t.maxBusyTries) {
            r++;
            let i = r * 100;
            return setTimeout(() => cUa(e, t, o), i);
          }
          if (s.code === "ENOENT") {
            s = null;
          }
        }
        n(s);
      });
    }
    function cUa(e, t, n) {
      y0(e);
      y0(t);
      y0(typeof n === "function");
      t.lstat(e, (r, o) => {
        if (r && r.code === "ENOENT") {
          return n(null);
        }
        if (r && r.code, o && o.isDirectory()) {
          return Rbo(e, t, r, n);
        }
        t.unlink(e, s => {
          if (s) {
            if (s.code === "ENOENT") {
              return n(null);
            }
            if (s.code === "EPERM") {
              return Rbo(e, t, s, n);
            }
            if (s.code === "EISDIR") {
              return Rbo(e, t, s, n);
            }
          }
          return n(s);
        });
      });
    }
    function Rbo(e, t, n, r) {
      y0(e);
      y0(t);
      y0(typeof r === "function");
      t.rmdir(e, o => {
        if (o && (o.code === "ENOTEMPTY" || o.code === "EEXIST" || o.code === "EPERM")) {
          rUp(e, t, r);
        } else if (o && o.code === "ENOTDIR") {
          r(n);
        } else {
          r(o);
        }
      });
    }
    function rUp(e, t, n) {
      y0(e);
      y0(t);
      y0(typeof n === "function");
      t.readdir(e, (r, o) => {
        if (r) {
          return n(r);
        }
        let s = o.length;
        let i;
        if (s === 0) {
          return t.rmdir(e, n);
        }
        o.forEach(a => {
          kbo(uUa.join(e, a), t, l => {
            if (i) {
              return;
            }
            if (l) {
              return n(i = l);
            }
            if (--s === 0) {
              t.rmdir(e, n);
            }
          });
        });
      });
    }
    function pUa(e, t) {
      let n;
      t = t || {};
      dUa(t);
      y0(e, "rimraf: missing path");
      y0.strictEqual(typeof e, "string", "rimraf: path should be a string");
      y0(t, "rimraf: missing options");
      y0.strictEqual(typeof t, "object", "rimraf: options should be object");
      try {
        n = t.lstatSync(e);
      } catch (r) {
        if (r.code === "ENOENT") {
          return;
        }
        r.code;
      }
      try {
        if (n && n.isDirectory()) {
          xbo(e, t, null);
        } else {
          t.unlinkSync(e);
        }
      } catch (r) {
        if (r.code === "ENOENT") {
          return;
        } else if (r.code === "EPERM") {
          return xbo(e, t, r);
        } else if (r.code !== "EISDIR") {
          throw r;
        }
        xbo(e, t, r);
      }
    }
    function xbo(e, t, n) {
      y0(e);
      y0(t);
      try {
        t.rmdirSync(e);
      } catch (r) {
        if (r.code === "ENOTDIR") {
          throw n;
        } else if (r.code === "ENOTEMPTY" || r.code === "EEXIST" || r.code === "EPERM") {
          oUp(e, t);
        } else if (r.code !== "ENOENT") {
          throw r;
        }
      }
    }
    function oUp(e, t) {
      y0(e);
      y0(t);
      t.readdirSync(e).forEach(n => pUa(uUa.join(e, n), t));
      return t.rmdirSync(e, t);
    }
    mUa.exports = kbo;
    kbo.sync = pUa;
  });
  var U9t = __commonJS((F__, gUa) => {
    var z4n = iS();
    var sUp = kw().fromCallback;
    var hUa = fUa();
    function iUp(e, t) {
      if (z4n.rm) {
        return z4n.rm(e, {
          recursive: true,
          force: true
        }, t);
      }
      hUa(e, t);
    }
    function aUp(e) {
      if (z4n.rmSync) {
        return z4n.rmSync(e, {
          recursive: true,
          force: true
        });
      }
      hUa.sync(e);
    }
    gUa.exports = {
      remove: sUp(iUp),
      removeSync: aUp
    };
  });
  var wUa = __commonJS((U__, vUa) => {
    var lUp = kw().fromPromise;
    var bUa = S6e();
    var SUa = require("path");
    var TUa = woe();
    var EUa = U9t();
    var yUa = lUp(async function (t) {
      let n;
      try {
        n = await bUa.readdir(t);
      } catch {
        return TUa.mkdirs(t);
      }
      return Promise.all(n.map(r => EUa.remove(SUa.join(t, r))));
    });
    function _Ua(e) {
      let t;
      try {
        t = bUa.readdirSync(e);
      } catch {
        return TUa.mkdirsSync(e);
      }
      t.forEach(n => {
        n = SUa.join(e, n);
        EUa.removeSync(n);
      });
    }
    vUa.exports = {
      emptyDirSync: _Ua,
      emptydirSync: _Ua,
      emptyDir: yUa,
      emptydir: yUa
    };
  });
  var kUa = __commonJS((B__, xUa) => {
    var cUp = kw().fromCallback;
    var CUa = require("path");
    var VMe = iS();
    var RUa = woe();
    function uUp(e, t) {
      function n() {
        VMe.writeFile(e, "", r => {
          if (r) {
            return t(r);
          }
          t();
        });
      }
      VMe.stat(e, (r, o) => {
        if (!r && o.isFile()) {
          return t();
        }
        let s = CUa.dirname(e);
        VMe.stat(s, (i, a) => {
          if (i) {
            if (i.code === "ENOENT") {
              return RUa.mkdirs(s, l => {
                if (l) {
                  return t(l);
                }
                n();
              });
            }
            return t(i);
          }
          if (a.isDirectory()) {
            n();
          } else {
            VMe.readdir(s, l => {
              if (l) {
                return t(l);
              }
            });
          }
        });
      });
    }
    function dUp(e) {
      let t;
      try {
        t = VMe.statSync(e);
      } catch {}
      if (t && t.isFile()) {
        return;
      }
      let n = CUa.dirname(e);
      try {
        if (!VMe.statSync(n).isDirectory()) {
          VMe.readdirSync(n);
        }
      } catch (r) {
        if (r && r.code === "ENOENT") {
          RUa.mkdirsSync(n);
        } else {
          throw r;
        }
      }
      VMe.writeFileSync(e, "");
    }
    xUa.exports = {
      createFile: cUp(uUp),
      createFileSync: dUp
    };
  });
  var DUa = __commonJS(($__, OUa) => {
    var pUp = kw().fromCallback;
    var AUa = require("path");
    var zMe = iS();
    var IUa = woe();
    var mUp = GMe().pathExists;
    var {
      areIdentical: PUa
    } = T6e();
    function fUp(e, t, n) {
      function r(o, s) {
        zMe.link(o, s, i => {
          if (i) {
            return n(i);
          }
          n(null);
        });
      }
      zMe.lstat(t, (o, s) => {
        zMe.lstat(e, (i, a) => {
          if (i) {
            i.message = i.message.replace("lstat", "ensureLink");
            return n(i);
          }
          if (s && PUa(a, s)) {
            return n(null);
          }
          let l = AUa.dirname(t);
          mUp(l, (c, u) => {
            if (c) {
              return n(c);
            }
            if (u) {
              return r(e, t);
            }
            IUa.mkdirs(l, d => {
              if (d) {
                return n(d);
              }
              r(e, t);
            });
          });
        });
      });
    }
    function hUp(e, t) {
      let n;
      try {
        n = zMe.lstatSync(t);
      } catch {}
      try {
        let s = zMe.lstatSync(e);
        if (n && PUa(s, n)) {
          return;
        }
      } catch (s) {
        throw s.message = s.message.replace("lstat", "ensureLink"), s;
      }
      let r = AUa.dirname(t);
      if (zMe.existsSync(r)) {
        return zMe.linkSync(e, t);
      }
      IUa.mkdirsSync(r);
      return zMe.linkSync(e, t);
    }
    OUa.exports = {
      createLink: pUp(fUp),
      createLinkSync: hUp
    };
  });
  var NUa = __commonJS((H__, MUa) => {
    var KMe = require("path");
    var B9t = iS();
    var gUp = GMe().pathExists;
    function yUp(e, t, n) {
      if (KMe.isAbsolute(e)) {
        return B9t.lstat(e, r => {
          if (r) {
            r.message = r.message.replace("lstat", "ensureSymlink");
            return n(r);
          }
          return n(null, {
            toCwd: e,
            toDst: e
          });
        });
      } else {
        let r = KMe.dirname(t);
        let o = KMe.join(r, e);
        return gUp(o, (s, i) => {
          if (s) {
            return n(s);
          }
          if (i) {
            return n(null, {
              toCwd: o,
              toDst: e
            });
          } else {
            return B9t.lstat(e, a => {
              if (a) {
                a.message = a.message.replace("lstat", "ensureSymlink");
                return n(a);
              }
              return n(null, {
                toCwd: e,
                toDst: KMe.relative(r, e)
              });
            });
          }
        });
      }
    }
    function _Up(e, t) {
      let n;
      if (KMe.isAbsolute(e)) {
        if (n = B9t.existsSync(e), !n) {
          throw Error("absolute srcpath does not exist");
        }
        return {
          toCwd: e,
          toDst: e
        };
      } else {
        let r = KMe.dirname(t);
        let o = KMe.join(r, e);
        if (n = B9t.existsSync(o), n) {
          return {
            toCwd: o,
            toDst: e
          };
        } else {
          if (n = B9t.existsSync(e), !n) {
            throw Error("relative srcpath does not exist");
          }
          return {
            toCwd: e,
            toDst: KMe.relative(r, e)
          };
        }
      }
    }
    MUa.exports = {
      symlinkPaths: yUp,
      symlinkPathsSync: _Up
    };
  });
  var UUa = __commonJS((j__, FUa) => {
    var LUa = iS();
    function bUp(e, t, n) {
      if (n = typeof t === "function" ? t : n, t = typeof t === "function" ? false : t, t) {
        return n(null, t);
      }
      LUa.lstat(e, (r, o) => {
        if (r) {
          return n(null, "file");
        }
        t = o && o.isDirectory() ? "dir" : "file";
        n(null, t);
      });
    }
    function SUp(e, t) {
      let n;
      if (t) {
        return t;
      }
      try {
        n = LUa.lstatSync(e);
      } catch {
        return "file";
      }
      return n && n.isDirectory() ? "dir" : "file";
    }
    FUa.exports = {
      symlinkType: bUp,
      symlinkTypeSync: SUp
    };
  });
  var VUa = __commonJS((q__, GUa) => {
    var TUp = kw().fromCallback;
    var $Ua = require("path");
    var Coe = S6e();
    var HUa = woe();
    var EUp = HUa.mkdirs;
    var vUp = HUa.mkdirsSync;
    var jUa = NUa();
    var wUp = jUa.symlinkPaths;
    var CUp = jUa.symlinkPathsSync;
    var qUa = UUa();
    var RUp = qUa.symlinkType;
    var xUp = qUa.symlinkTypeSync;
    var kUp = GMe().pathExists;
    var {
      areIdentical: WUa
    } = T6e();
    function AUp(e, t, n, r) {
      r = typeof n === "function" ? n : r;
      n = typeof n === "function" ? false : n;
      Coe.lstat(t, (o, s) => {
        if (!o && s.isSymbolicLink()) {
          Promise.all([Coe.stat(e), Coe.stat(t)]).then(([i, a]) => {
            if (WUa(i, a)) {
              return r(null);
            }
            BUa(e, t, n, r);
          });
        } else {
          BUa(e, t, n, r);
        }
      });
    }
    function BUa(e, t, n, r) {
      wUp(e, t, (o, s) => {
        if (o) {
          return r(o);
        }
        e = s.toDst;
        RUp(s.toCwd, n, (i, a) => {
          if (i) {
            return r(i);
          }
          let l = $Ua.dirname(t);
          kUp(l, (c, u) => {
            if (c) {
              return r(c);
            }
            if (u) {
              return Coe.symlink(e, t, a, r);
            }
            EUp(l, d => {
              if (d) {
                return r(d);
              }
              Coe.symlink(e, t, a, r);
            });
          });
        });
      });
    }
    function IUp(e, t, n) {
      let r;
      try {
        r = Coe.lstatSync(t);
      } catch {}
      if (r && r.isSymbolicLink()) {
        let a = Coe.statSync(e);
        let l = Coe.statSync(t);
        if (WUa(a, l)) {
          return;
        }
      }
      let o = CUp(e, t);
      e = o.toDst;
      n = xUp(o.toCwd, n);
      let s = $Ua.dirname(t);
      if (Coe.existsSync(s)) {
        return Coe.symlinkSync(e, t, n);
      }
      vUp(s);
      return Coe.symlinkSync(e, t, n);
    }
    GUa.exports = {
      createSymlink: TUp(AUp),
      createSymlinkSync: IUp
    };
  });
  var eBa = __commonJS((W__, ZUa) => {
    var {
      createFile: zUa,
      createFileSync: KUa
    } = kUa();
    var {
      createLink: YUa,
      createLinkSync: JUa
    } = DUa();
    var {
      createSymlink: XUa,
      createSymlinkSync: QUa
    } = VUa();
    ZUa.exports = {
      createFile: zUa,
      createFileSync: KUa,
      ensureFile: zUa,
      ensureFileSync: KUa,
      createLink: YUa,
      createLinkSync: JUa,
      ensureLink: YUa,
      ensureLinkSync: JUa,
      createSymlink: XUa,
      createSymlinkSync: QUa,
      ensureSymlink: XUa,
      ensureSymlinkSync: QUa
    };
  });
  var Ift = __commonJS((G__, tBa) => {
    function PUp(e, {
      EOL: t = `
`,
      finalEOL: n = true,
      replacer: r = null,
      spaces: o
    } = {}) {
      let s = n ? t : "";
      return JSON.stringify(e, r, o).replace(/\n/g, t) + s;
    }
    function OUp(e) {
      if (Buffer.isBuffer(e)) {
        e = e.toString("utf8");
      }
      return e.replace(/^\uFEFF/, "");
    }
    tBa.exports = {
      stringify: PUp,
      stripBom: OUp
    };
  });
  var Abo = __commonJS((V__, oBa) => {
    var Pft;
    try {
      Pft = iS();
    } catch (e) {
      Pft = require("fs");
    }
    var K4n = kw();
    var {
      stringify: nBa,
      stripBom: rBa
    } = Ift();
    async function DUp(e, t = {}) {
      if (typeof t === "string") {
        t = {
          encoding: t
        };
      }
      let n = t.fs || Pft;
      let r = "throws" in t ? t.throws : true;
      let o = await K4n.fromCallback(n.readFile)(e, t);
      o = rBa(o);
      let s;
      try {
        s = JSON.parse(o, t ? t.reviver : null);
      } catch (i) {
        if (r) {
          throw i.message = `${e}: ${i.message}`, i;
        } else {
          return null;
        }
      }
      return s;
    }
    var MUp = K4n.fromPromise(DUp);
    function NUp(e, t = {}) {
      if (typeof t === "string") {
        t = {
          encoding: t
        };
      }
      let n = t.fs || Pft;
      let r = "throws" in t ? t.throws : true;
      try {
        let o = n.readFileSync(e, t);
        o = rBa(o);
        return JSON.parse(o, t.reviver);
      } catch (o) {
        if (r) {
          throw o.message = `${e}: ${o.message}`, o;
        } else {
          return null;
        }
      }
    }
    async function LUp(e, t, n = {}) {
      let r = n.fs || Pft;
      let o = nBa(t, n);
      await K4n.fromCallback(r.writeFile)(e, o, n);
    }
    var FUp = K4n.fromPromise(LUp);
    function UUp(e, t, n = {}) {
      let r = n.fs || Pft;
      let o = nBa(t, n);
      return r.writeFileSync(e, o, n);
    }
    var BUp = {
      readFile: MUp,
      readFileSync: NUp,
      writeFile: FUp,
      writeFileSync: UUp
    };
    oBa.exports = BUp;
  });
  var iBa = __commonJS((z__, sBa) => {
    var Y4n = Abo();
    sBa.exports = {
      readJson: Y4n.readFile,
      readJsonSync: Y4n.readFileSync,
      writeJson: Y4n.writeFile,
      writeJsonSync: Y4n.writeFileSync
    };
  });
  var J4n = __commonJS((K__, cBa) => {
    var $Up = kw().fromCallback;
    var $9t = iS();
    var aBa = require("path");
    var lBa = woe();
    var HUp = GMe().pathExists;
    function jUp(e, t, n, r) {
      if (typeof n === "function") {
        r = n;
        n = "utf8";
      }
      let o = aBa.dirname(e);
      HUp(o, (s, i) => {
        if (s) {
          return r(s);
        }
        if (i) {
          return $9t.writeFile(e, t, n, r);
        }
        lBa.mkdirs(o, a => {
          if (a) {
            return r(a);
          }
          $9t.writeFile(e, t, n, r);
        });
      });
    }
    function qUp(e, ...t) {
      let n = aBa.dirname(e);
      if ($9t.existsSync(n)) {
        return $9t.writeFileSync(e, ...t);
      }
      lBa.mkdirsSync(n);
      $9t.writeFileSync(e, ...t);
    }
    cBa.exports = {
      outputFile: $Up(jUp),
      outputFileSync: qUp
    };
  });
  var dBa = __commonJS((Y__, uBa) => {
    var {
      stringify: WUp
    } = Ift();
    var {
      outputFile: GUp
    } = J4n();
    async function VUp(e, t, n = {}) {
      let r = WUp(t, n);
      await GUp(e, r, n);
    }
    uBa.exports = VUp;
  });
  var mBa = __commonJS((J__, pBa) => {
    var {
      stringify: zUp
    } = Ift();
    var {
      outputFileSync: KUp
    } = J4n();
    function YUp(e, t, n) {
      let r = zUp(t, n);
      KUp(e, r, n);
    }
    pBa.exports = YUp;
  });
  var hBa = __commonJS((X__, fBa) => {
    var JUp = kw().fromPromise;
    var s3 = iBa();
    s3.outputJson = JUp(dBa());
    s3.outputJsonSync = mBa();
    s3.outputJSON = s3.outputJson;
    s3.outputJSONSync = s3.outputJsonSync;
    s3.writeJSON = s3.writeJson;
    s3.writeJSONSync = s3.writeJsonSync;
    s3.readJSON = s3.readJson;
    s3.readJSONSync = s3.readJsonSync;
    fBa.exports = s3;
  });
  var SBa = __commonJS((Q__, bBa) => {
    var XUp = iS();
    var Pbo = require("path");
    var QUp = V4n().copy;
    var _Ba = U9t().remove;
    var ZUp = woe().mkdirp;
    var eBp = GMe().pathExists;
    var gBa = T6e();
    function tBp(e, t, n, r) {
      if (typeof n === "function") {
        r = n;
        n = {};
      }
      n = n || {};
      let o = n.overwrite || n.clobber || false;
      gBa.checkPaths(e, t, "move", n, (s, i) => {
        if (s) {
          return r(s);
        }
        let {
          srcStat: a,
          isChangingCase: l = false
        } = i;
        gBa.checkParentPaths(e, a, t, "move", c => {
          if (c) {
            return r(c);
          }
          if (nBp(t)) {
            return yBa(e, t, o, l, r);
          }
          ZUp(Pbo.dirname(t), u => {
            if (u) {
              return r(u);
            }
            return yBa(e, t, o, l, r);
          });
        });
      });
    }
    function nBp(e) {
      let t = Pbo.dirname(e);
      return Pbo.parse(t).root === t;
    }
    function yBa(e, t, n, r, o) {
      if (r) {
        return Ibo(e, t, n, o);
      }
      if (n) {
        return _Ba(t, s => {
          if (s) {
            return o(s);
          }
          return Ibo(e, t, n, o);
        });
      }
      eBp(t, (s, i) => {
        if (s) {
          return o(s);
        }
        if (i) {
          return o(Error("dest already exists."));
        }
        return Ibo(e, t, n, o);
      });
    }
    function Ibo(e, t, n, r) {
      XUp.rename(e, t, o => {
        if (!o) {
          return r();
        }
        if (o.code !== "EXDEV") {
          return r(o);
        }
        return rBp(e, t, n, r);
      });
    }
    function rBp(e, t, n, r) {
      QUp(e, t, {
        overwrite: n,
        errorOnExist: true
      }, s => {
        if (s) {
          return r(s);
        }
        return _Ba(e, r);
      });
    }
    bBa.exports = tBp;
  });
  var CBa = __commonJS((Z__, wBa) => {
    var EBa = iS();
    var Dbo = require("path");
    var oBp = V4n().copySync;
    var vBa = U9t().removeSync;
    var sBp = woe().mkdirpSync;
    var TBa = T6e();
    function iBp(e, t, n) {
      n = n || {};
      let r = n.overwrite || n.clobber || false;
      let {
        srcStat: o,
        isChangingCase: s = false
      } = TBa.checkPathsSync(e, t, "move", n);
      if (TBa.checkParentPathsSync(e, o, t, "move"), !aBp(t)) {
        sBp(Dbo.dirname(t));
      }
      return lBp(e, t, r, s);
    }
    function aBp(e) {
      let t = Dbo.dirname(e);
      return Dbo.parse(t).root === t;
    }
    function lBp(e, t, n, r) {
      if (r) {
        return Obo(e, t, n);
      }
      if (n) {
        vBa(t);
        return Obo(e, t, n);
      }
      if (EBa.existsSync(t)) {
        throw Error("dest already exists.");
      }
      return Obo(e, t, n);
    }
    function Obo(e, t, n) {
      try {
        EBa.renameSync(e, t);
      } catch (r) {
        if (r.code !== "EXDEV") {
          throw r;
        }
        return cBp(e, t, n);
      }
    }
    function cBp(e, t, n) {
      oBp(e, t, {
        overwrite: n,
        errorOnExist: true
      });
      return vBa(e);
    }
    wBa.exports = iBp;
  });
  var xBa = __commonJS((eb_, RBa) => {
    var uBp = kw().fromCallback;
    RBa.exports = {
      move: uBp(SBa()),
      moveSync: CBa()
    };
  });
  var ABa = __commonJS((tb_, kBa) => {
    kBa.exports = {
      ...S6e(),
      ...V4n(),
      ...wUa(),
      ...eBa(),
      ...hBa(),
      ...woe(),
      ...xBa(),
      ...J4n(),
      ...GMe(),
      ...U9t()
    };
  });
  var E6e = __commonJS(YMe => {
    var IBa = kw().fromCallback;
    var o9 = iS();
    var dBp = ["access", "appendFile", "chmod", "chown", "close", "copyFile", "fchmod", "fchown", "fdatasync", "fstat", "fsync", "ftruncate", "futimes", "lchmod", "lchown", "link", "lstat", "mkdir", "mkdtemp", "open", "opendir", "readdir", "readFile", "readlink", "realpath", "rename", "rm", "rmdir", "stat", "symlink", "truncate", "unlink", "utimes", "writeFile"].filter(e => typeof o9[e] === "function");
    Object.assign(YMe, o9);
    dBp.forEach(e => {
      YMe[e] = IBa(o9[e]);
    });
    YMe.exists = function (e, t) {
      if (typeof t === "function") {
        return o9.exists(e, t);
      }
      return new Promise(n => o9.exists(e, n));
    };
    YMe.read = function (e, t, n, r, o, s) {
      if (typeof s === "function") {
        return o9.read(e, t, n, r, o, s);
      }
      return new Promise((i, a) => {
        o9.read(e, t, n, r, o, (l, c, u) => {
          if (l) {
            return a(l);
          }
          i({
            bytesRead: c,
            buffer: u
          });
        });
      });
    };
    YMe.write = function (e, t, ...n) {
      if (typeof n[n.length - 1] === "function") {
        return o9.write(e, t, ...n);
      }
      return new Promise((r, o) => {
        o9.write(e, t, ...n, (s, i, a) => {
          if (s) {
            return o(s);
          }
          r({
            bytesWritten: i,
            buffer: a
          });
        });
      });
    };
    if (typeof o9.writev === "function") {
      YMe.writev = function (e, t, ...n) {
        if (typeof n[n.length - 1] === "function") {
          return o9.writev(e, t, ...n);
        }
        return new Promise((r, o) => {
          o9.writev(e, t, ...n, (s, i, a) => {
            if (s) {
              return o(s);
            }
            r({
              bytesWritten: i,
              buffers: a
            });
          });
        });
      };
    }
    if (typeof o9.realpath.native === "function") {
      YMe.realpath.native = IBa(o9.realpath.native);
    } else {
      process.emitWarning("fs.realpath.native is not a function. Is fs being monkey-patched?", "Warning", "fs-extra-WARN0003");
    }
  });
  var OBa = __commonJS((ob_, PBa) => {
    var rb_ = require("path");
    PBa.exports.checkPath = function (t) {};
  });
  var LBa = __commonJS((sb_, Mbo) => {
    var DBa = E6e();
    var {
      checkPath: MBa
    } = OBa();
    var NBa = e => {
      let t = {
        mode: 511
      };
      if (typeof e === "number") {
        return e;
      }
      return {
        ...t,
        ...e
      }.mode;
    };
    Mbo.exports.makeDir = async (e, t) => (MBa(e), DBa.mkdir(e, {
      mode: NBa(t),
      recursive: true
    }));
    Mbo.exports.makeDirSync = (e, t) => (MBa(e), DBa.mkdirSync(e, {
      mode: NBa(t),
      recursive: true
    }));
  });
  var Roe = __commonJS((ib_, FBa) => {
    var pBp = kw().fromPromise;
    var {
      makeDir: mBp,
      makeDirSync: Nbo
    } = LBa();
    var Lbo = pBp(mBp);
    FBa.exports = {
      mkdirs: Lbo,
      mkdirsSync: Nbo,
      mkdirp: Lbo,
      mkdirpSync: Nbo,
      ensureDir: Lbo,
      ensureDirSync: Nbo
    };
  });
  var JMe = __commonJS((ab_, BBa) => {
    var fBp = kw().fromPromise;
    var UBa = E6e();
    function hBp(e) {
      return UBa.access(e).then(() => true).catch(() => false);
    }
    BBa.exports = {
      pathExists: fBp(hBp),
      pathExistsSync: UBa.existsSync
    };
  });
  var Fbo = __commonJS((lb_, $Ba) => {
    var Oft = iS();
    function gBp(e, t, n, r) {
      Oft.open(e, "r+", (o, s) => {
        if (o) {
          return r(o);
        }
        Oft.futimes(s, t, n, i => {
          Oft.close(s, a => {
            if (r) {
              r(i || a);
            }
          });
        });
      });
    }
    function yBp(e, t, n) {
      let r = Oft.openSync(e, "r+");
      Oft.futimesSync(r, t, n);
      return Oft.closeSync(r);
    }
    $Ba.exports = {
      utimesMillis: gBp,
      utimesMillisSync: yBp
    };
  });
  var v6e = __commonJS((cb_, qBa) => {
    var Dft = E6e();
    var q1 = require("path");
    var _Bp = require("util");
    function bBp(e, t, n) {
      let r = n.dereference ? o => Dft.stat(o, {
        bigint: true
      }) : o => Dft.lstat(o, {
        bigint: true
      });
      return Promise.all([r(e), r(t).catch(o => {
        if (o.code === "ENOENT") {
          return null;
        }
        throw o;
      })]).then(([o, s]) => ({
        srcStat: o,
        destStat: s
      }));
    }
    function SBp(e, t, n) {
      let r;
      let o = n.dereference ? i => Dft.statSync(i, {
        bigint: true
      }) : i => Dft.lstatSync(i, {
        bigint: true
      });
      let s = o(e);
      try {
        r = o(t);
      } catch (i) {
        if (i.code === "ENOENT") {
          return {
            srcStat: s,
            destStat: null
          };
        }
        throw i;
      }
      return {
        srcStat: s,
        destStat: r
      };
    }
    function TBp(e, t, n, r, o) {
      _Bp.callbackify(bBp)(e, t, r, (s, i) => {
        if (s) {
          return o(s);
        }
        let {
          srcStat: a,
          destStat: l
        } = i;
        if (l) {
          if (H9t(a, l)) {
            let c = q1.basename(e);
            let u = q1.basename(t);
            if (n === "move" && c !== u && c.toLowerCase() === u.toLowerCase()) {
              return o(null, {
                srcStat: a,
                destStat: l,
                isChangingCase: true
              });
            }
            return o(Error("Source and destination must not be the same."));
          }
          if (a.isDirectory() && !l.isDirectory()) {
            return o(Error(`Cannot overwrite non-directory '${t}' with directory '${e}'.`));
          }
          if (!a.isDirectory() && l.isDirectory()) {
            return o(Error(`Cannot overwrite directory '${t}' with non-directory '${e}'.`));
          }
        }
        if (a.isDirectory() && Ubo(e, t)) {
          return o(Error(X4n(e, t, n)));
        }
        return o(null, {
          srcStat: a,
          destStat: l
        });
      });
    }
    function EBp(e, t, n, r) {
      let {
        srcStat: o,
        destStat: s
      } = SBp(e, t, r);
      if (s) {
        if (H9t(o, s)) {
          let i = q1.basename(e);
          let a = q1.basename(t);
          if (n === "move" && i !== a && i.toLowerCase() === a.toLowerCase()) {
            return {
              srcStat: o,
              destStat: s,
              isChangingCase: true
            };
          }
          throw Error("Source and destination must not be the same.");
        }
        if (o.isDirectory() && !s.isDirectory()) {
          throw Error(`Cannot overwrite non-directory '${t}' with directory '${e}'.`);
        }
        if (!o.isDirectory() && s.isDirectory()) {
          throw Error(`Cannot overwrite directory '${t}' with non-directory '${e}'.`);
        }
      }
      if (o.isDirectory() && Ubo(e, t)) {
        throw Error(X4n(e, t, n));
      }
      return {
        srcStat: o,
        destStat: s
      };
    }
    function HBa(e, t, n, r, o) {
      let s = q1.resolve(q1.dirname(e));
      let i = q1.resolve(q1.dirname(n));
      if (i === s || i === q1.parse(i).root) {
        return o();
      }
      Dft.stat(i, {
        bigint: true
      }, (a, l) => {
        if (a) {
          if (a.code === "ENOENT") {
            return o();
          }
          return o(a);
        }
        if (H9t(t, l)) {
          return o(Error(X4n(e, n, r)));
        }
        return HBa(e, t, i, r, o);
      });
    }
    function jBa(e, t, n, r) {
      let o = q1.resolve(q1.dirname(e));
      let s = q1.resolve(q1.dirname(n));
      if (s === o || s === q1.parse(s).root) {
        return;
      }
      let i;
      try {
        i = Dft.statSync(s, {
          bigint: true
        });
      } catch (a) {
        if (a.code === "ENOENT") {
          return;
        }
        throw a;
      }
      if (H9t(t, i)) {
        throw Error(X4n(e, n, r));
      }
      return jBa(e, t, s, r);
    }
    function H9t(e, t) {
      return t.ino && t.dev && t.ino === e.ino && t.dev === e.dev;
    }
    function Ubo(e, t) {
      let n = q1.resolve(e).split(q1.sep).filter(o => o);
      let r = q1.resolve(t).split(q1.sep).filter(o => o);
      return n.reduce((o, s, i) => o && r[i] === s, true);
    }
    function X4n(e, t, n) {
      return `Cannot ${n} '${e}' to a subdirectory of itself, '${t}'.`;
    }
    qBa.exports = {
      checkPaths: TBp,
      checkPathsSync: EBp,
      checkParentPaths: HBa,
      checkParentPathsSync: jBa,
      isSrcSubdir: Ubo,
      areIdentical: H9t
    };
  });
  var XBa = __commonJS((ub_, JBa) => {
    var s9 = iS();
    var j9t = require("path");
    var vBp = Roe().mkdirs;
    var wBp = JMe().pathExists;
    var CBp = Fbo().utimesMillis;
    var q9t = v6e();
    function RBp(e, t, n, r) {
      if (typeof n === "function" && !r) {
        r = n;
        n = {};
      } else if (typeof n === "function") {
        n = {
          filter: n
        };
      }
      r = r || function () {};
      n = n || {};
      n.clobber = "clobber" in n ? !!n.clobber : true;
      n.overwrite = "overwrite" in n ? !!n.overwrite : n.clobber;
      n.preserveTimestamps;
      q9t.checkPaths(e, t, "copy", n, (o, s) => {
        if (o) {
          return r(o);
        }
        let {
          srcStat: i,
          destStat: a
        } = s;
        q9t.checkParentPaths(e, i, t, "copy", l => {
          if (l) {
            return r(l);
          }
          if (n.filter) {
            return VBa(WBa, a, e, t, n, r);
          }
          return WBa(a, e, t, n, r);
        });
      });
    }
    function WBa(e, t, n, r, o) {
      let s = j9t.dirname(n);
      wBp(s, (i, a) => {
        if (i) {
          return o(i);
        }
        if (a) {
          return Q4n(e, t, n, r, o);
        }
        vBp(s, l => {
          if (l) {
            return o(l);
          }
          return Q4n(e, t, n, r, o);
        });
      });
    }
    function VBa(e, t, n, r, o, s) {
      Promise.resolve(o.filter(n, r)).then(i => {
        if (i) {
          return e(t, n, r, o, s);
        }
        return s();
      }, i => s(i));
    }
    function xBp(e, t, n, r, o) {
      if (r.filter) {
        return VBa(Q4n, e, t, n, r, o);
      }
      return Q4n(e, t, n, r, o);
    }
    function Q4n(e, t, n, r, o) {
      (r.dereference ? s9.stat : s9.lstat)(t, (i, a) => {
        if (i) {
          return o(i);
        }
        if (a.isDirectory()) {
          return MBp(a, e, t, n, r, o);
        } else if (a.isFile() || a.isCharacterDevice() || a.isBlockDevice()) {
          return kBp(a, e, t, n, r, o);
        } else if (a.isSymbolicLink()) {
          return FBp(e, t, n, r, o);
        } else if (a.isSocket()) {
          return o(Error(`Cannot copy a socket file: ${t}`));
        } else if (a.isFIFO()) {
          return o(Error(`Cannot copy a FIFO pipe: ${t}`));
        }
        return o(Error(`Unknown file: ${t}`));
      });
    }
    function kBp(e, t, n, r, o, s) {
      if (!t) {
        return zBa(e, n, r, o, s);
      }
      return ABp(e, n, r, o, s);
    }
    function ABp(e, t, n, r, o) {
      if (r.overwrite) {
        s9.unlink(n, s => {
          if (s) {
            return o(s);
          }
          return zBa(e, t, n, r, o);
        });
      } else if (r.errorOnExist) {
        return o(Error(`'${n}' already exists`));
      } else {
        return o();
      }
    }
    function zBa(e, t, n, r, o) {
      s9.copyFile(t, n, s => {
        if (s) {
          return o(s);
        }
        if (r.preserveTimestamps) {
          return IBp(e.mode, t, n, o);
        }
        return Z4n(n, e.mode, o);
      });
    }
    function IBp(e, t, n, r) {
      if (PBp(e)) {
        return OBp(n, e, o => {
          if (o) {
            return r(o);
          }
          return GBa(e, t, n, r);
        });
      }
      return GBa(e, t, n, r);
    }
    function PBp(e) {
      return (e & 128) === 0;
    }
    function OBp(e, t, n) {
      return Z4n(e, t | 128, n);
    }
    function GBa(e, t, n, r) {
      DBp(t, n, o => {
        if (o) {
          return r(o);
        }
        return Z4n(n, e, r);
      });
    }
    function Z4n(e, t, n) {
      return s9.chmod(e, t, n);
    }
    function DBp(e, t, n) {
      s9.stat(e, (r, o) => {
        if (r) {
          return n(r);
        }
        return CBp(t, o.atime, o.mtime, n);
      });
    }
    function MBp(e, t, n, r, o, s) {
      if (!t) {
        return NBp(e.mode, n, r, o, s);
      }
      return KBa(n, r, o, s);
    }
    function NBp(e, t, n, r, o) {
      s9.mkdir(n, s => {
        if (s) {
          return o(s);
        }
        KBa(t, n, r, i => {
          if (i) {
            return o(i);
          }
          return Z4n(n, e, o);
        });
      });
    }
    function KBa(e, t, n, r) {
      s9.readdir(e, (o, s) => {
        if (o) {
          return r(o);
        }
        return YBa(s, e, t, n, r);
      });
    }
    function YBa(e, t, n, r, o) {
      let s = e.pop();
      if (!s) {
        return o();
      }
      return LBp(e, s, t, n, r, o);
    }
    function LBp(e, t, n, r, o, s) {
      let i = j9t.join(n, t);
      let a = j9t.join(r, t);
      q9t.checkPaths(i, a, "copy", o, (l, c) => {
        if (l) {
          return s(l);
        }
        let {
          destStat: u
        } = c;
        xBp(u, i, a, o, d => {
          if (d) {
            return s(d);
          }
          return YBa(e, n, r, o, s);
        });
      });
    }
    function FBp(e, t, n, r, o) {
      s9.readlink(t, (s, i) => {
        if (s) {
          return o(s);
        }
        if (r.dereference) {
          i = j9t.resolve(process.cwd(), i);
        }
        if (!e) {
          return s9.symlink(i, n, o);
        } else {
          s9.readlink(n, (a, l) => {
            if (a) {
              if (a.code === "EINVAL" || a.code === "UNKNOWN") {
                return s9.symlink(i, n, o);
              }
              return o(a);
            }
            if (r.dereference) {
              l = j9t.resolve(process.cwd(), l);
            }
            if (q9t.isSrcSubdir(i, l)) {
              return o(Error(`Cannot copy '${i}' to a subdirectory of itself, '${l}'.`));
            }
            if (e.isDirectory() && q9t.isSrcSubdir(l, i)) {
              return o(Error(`Cannot overwrite '${l}' with '${i}'.`));
            }
            return UBp(i, n, o);
          });
        }
      });
    }
    function UBp(e, t, n) {
      s9.unlink(t, r => {
        if (r) {
          return n(r);
        }
        return s9.symlink(e, t, n);
      });
    }
    JBa.exports = RBp;
  });
  var n2a = __commonJS((db_, t2a) => {
    var P$ = iS();
    var W9t = require("path");
    var BBp = Roe().mkdirsSync;
    var $Bp = Fbo().utimesMillisSync;
    var G9t = v6e();
    function HBp(e, t, n) {
      if (typeof n === "function") {
        n = {
          filter: n
        };
      }
      n = n || {};
      n.clobber = "clobber" in n ? !!n.clobber : true;
      n.overwrite = "overwrite" in n ? !!n.overwrite : n.clobber;
      n.preserveTimestamps;
      let {
        srcStat: r,
        destStat: o
      } = G9t.checkPathsSync(e, t, "copy", n);
      G9t.checkParentPathsSync(e, r, t, "copy");
      return jBp(o, e, t, n);
    }
    function jBp(e, t, n, r) {
      if (r.filter && !r.filter(t, n)) {
        return;
      }
      let o = W9t.dirname(n);
      if (!P$.existsSync(o)) {
        BBp(o);
      }
      return QBa(e, t, n, r);
    }
    function qBp(e, t, n, r) {
      if (r.filter && !r.filter(t, n)) {
        return;
      }
      return QBa(e, t, n, r);
    }
    function QBa(e, t, n, r) {
      let s = (r.dereference ? P$.statSync : P$.lstatSync)(t);
      if (s.isDirectory()) {
        return JBp(s, e, t, n, r);
      } else if (s.isFile() || s.isCharacterDevice() || s.isBlockDevice()) {
        return WBp(s, e, t, n, r);
      } else if (s.isSymbolicLink()) {
        return ZBp(e, t, n, r);
      } else if (s.isSocket()) {
        throw Error(`Cannot copy a socket file: ${t}`);
      } else if (s.isFIFO()) {
        throw Error(`Cannot copy a FIFO pipe: ${t}`);
      }
      throw Error(`Unknown file: ${t}`);
    }
    function WBp(e, t, n, r, o) {
      if (!t) {
        return ZBa(e, n, r, o);
      }
      return GBp(e, n, r, o);
    }
    function GBp(e, t, n, r) {
      if (r.overwrite) {
        P$.unlinkSync(n);
        return ZBa(e, t, n, r);
      } else if (r.errorOnExist) {
        throw Error(`'${n}' already exists`);
      }
    }
    function ZBa(e, t, n, r) {
      if (P$.copyFileSync(t, n), r.preserveTimestamps) {
        VBp(e.mode, t, n);
      }
      return Bbo(n, e.mode);
    }
    function VBp(e, t, n) {
      if (zBp(e)) {
        KBp(n, e);
      }
      return YBp(t, n);
    }
    function zBp(e) {
      return (e & 128) === 0;
    }
    function KBp(e, t) {
      return Bbo(e, t | 128);
    }
    function Bbo(e, t) {
      return P$.chmodSync(e, t);
    }
    function YBp(e, t) {
      let n = P$.statSync(e);
      return $Bp(t, n.atime, n.mtime);
    }
    function JBp(e, t, n, r, o) {
      if (!t) {
        return XBp(e.mode, n, r, o);
      }
      return e2a(n, r, o);
    }
    function XBp(e, t, n, r) {
      P$.mkdirSync(n);
      e2a(t, n, r);
      return Bbo(n, e);
    }
    function e2a(e, t, n) {
      P$.readdirSync(e).forEach(r => QBp(r, e, t, n));
    }
    function QBp(e, t, n, r) {
      let o = W9t.join(t, e);
      let s = W9t.join(n, e);
      let {
        destStat: i
      } = G9t.checkPathsSync(o, s, "copy", r);
      return qBp(i, o, s, r);
    }
    function ZBp(e, t, n, r) {
      let o = P$.readlinkSync(t);
      if (r.dereference) {
        o = W9t.resolve(process.cwd(), o);
      }
      if (!e) {
        return P$.symlinkSync(o, n);
      } else {
        let s;
        try {
          s = P$.readlinkSync(n);
        } catch (i) {
          if (i.code === "EINVAL" || i.code === "UNKNOWN") {
            return P$.symlinkSync(o, n);
          }
          throw i;
        }
        if (r.dereference) {
          s = W9t.resolve(process.cwd(), s);
        }
        if (G9t.isSrcSubdir(o, s)) {
          throw Error(`Cannot copy '${o}' to a subdirectory of itself, '${s}'.`);
        }
        if (P$.statSync(n).isDirectory() && G9t.isSrcSubdir(s, o)) {
          throw Error(`Cannot overwrite '${s}' with '${o}'.`);
        }
        return e2p(o, n);
      }
    }
    function e2p(e, t) {
      P$.unlinkSync(t);
      return P$.symlinkSync(e, t);
    }
    t2a.exports = HBp;
  });
  var eWn = __commonJS((pb_, r2a) => {
    var t2p = kw().fromCallback;
    r2a.exports = {
      copy: t2p(XBa()),
      copySync: n2a()
    };
  });
  var u2a = __commonJS((mb_, c2a) => {
    var o2a = iS();
    var i2a = require("path");
    var _0 = require("assert");
    function a2a(e) {
      ["unlink", "chmod", "stat", "lstat", "rmdir", "readdir"].forEach(n => {
        e[n] = e[n] || o2a[n];
        n = n + "Sync";
        e[n] = e[n] || o2a[n];
      });
      e.maxBusyTries = e.maxBusyTries || 3;
    }
    function jbo(e, t, n) {
      let r = 0;
      if (typeof t === "function") {
        n = t;
        t = {};
      }
      _0(e, "rimraf: missing path");
      _0.strictEqual(typeof e, "string", "rimraf: path should be a string");
      _0.strictEqual(typeof n, "function", "rimraf: callback function required");
      _0(t, "rimraf: invalid options argument provided");
      _0.strictEqual(typeof t, "object", "rimraf: options should be object");
      a2a(t);
      s2a(e, t, function o(s) {
        if (s) {
          if ((s.code === "EBUSY" || s.code === "ENOTEMPTY" || s.code === "EPERM") && r < t.maxBusyTries) {
            r++;
            let i = r * 100;
            return setTimeout(() => s2a(e, t, o), i);
          }
          if (s.code === "ENOENT") {
            s = null;
          }
        }
        n(s);
      });
    }
    function s2a(e, t, n) {
      _0(e);
      _0(t);
      _0(typeof n === "function");
      t.lstat(e, (r, o) => {
        if (r && r.code === "ENOENT") {
          return n(null);
        }
        if (r && r.code, o && o.isDirectory()) {
          return $bo(e, t, r, n);
        }
        t.unlink(e, s => {
          if (s) {
            if (s.code === "ENOENT") {
              return n(null);
            }
            if (s.code === "EPERM") {
              return $bo(e, t, s, n);
            }
            if (s.code === "EISDIR") {
              return $bo(e, t, s, n);
            }
          }
          return n(s);
        });
      });
    }
    function $bo(e, t, n, r) {
      _0(e);
      _0(t);
      _0(typeof r === "function");
      t.rmdir(e, o => {
        if (o && (o.code === "ENOTEMPTY" || o.code === "EEXIST" || o.code === "EPERM")) {
          n2p(e, t, r);
        } else if (o && o.code === "ENOTDIR") {
          r(n);
        } else {
          r(o);
        }
      });
    }
    function n2p(e, t, n) {
      _0(e);
      _0(t);
      _0(typeof n === "function");
      t.readdir(e, (r, o) => {
        if (r) {
          return n(r);
        }
        let s = o.length;
        let i;
        if (s === 0) {
          return t.rmdir(e, n);
        }
        o.forEach(a => {
          jbo(i2a.join(e, a), t, l => {
            if (i) {
              return;
            }
            if (l) {
              return n(i = l);
            }
            if (--s === 0) {
              t.rmdir(e, n);
            }
          });
        });
      });
    }
    function l2a(e, t) {
      let n;
      t = t || {};
      a2a(t);
      _0(e, "rimraf: missing path");
      _0.strictEqual(typeof e, "string", "rimraf: path should be a string");
      _0(t, "rimraf: missing options");
      _0.strictEqual(typeof t, "object", "rimraf: options should be object");
      try {
        n = t.lstatSync(e);
      } catch (r) {
        if (r.code === "ENOENT") {
          return;
        }
        r.code;
      }
      try {
        if (n && n.isDirectory()) {
          Hbo(e, t, null);
        } else {
          t.unlinkSync(e);
        }
      } catch (r) {
        if (r.code === "ENOENT") {
          return;
        } else if (r.code === "EPERM") {
          return Hbo(e, t, r);
        } else if (r.code !== "EISDIR") {
          throw r;
        }
        Hbo(e, t, r);
      }
    }
    function Hbo(e, t, n) {
      _0(e);
      _0(t);
      try {
        t.rmdirSync(e);
      } catch (r) {
        if (r.code === "ENOTDIR") {
          throw n;
        } else if (r.code === "ENOTEMPTY" || r.code === "EEXIST" || r.code === "EPERM") {
          r2p(e, t);
        } else if (r.code !== "ENOENT") {
          throw r;
        }
      }
    }
    function r2p(e, t) {
      _0(e);
      _0(t);
      t.readdirSync(e).forEach(n => l2a(i2a.join(e, n), t));
      return t.rmdirSync(e, t);
    }
    c2a.exports = jbo;
    jbo.sync = l2a;
  });
  var V9t = __commonJS((fb_, p2a) => {
    var tWn = iS();
    var o2p = kw().fromCallback;
    var d2a = u2a();
    function s2p(e, t) {
      if (tWn.rm) {
        return tWn.rm(e, {
          recursive: true,
          force: true
        }, t);
      }
      d2a(e, t);
    }
    function i2p(e) {
      if (tWn.rmSync) {
        return tWn.rmSync(e, {
          recursive: true,
          force: true
        });
      }
      d2a.sync(e);
    }
    p2a.exports = {
      remove: o2p(s2p),
      removeSync: i2p
    };
  });
  var S2a = __commonJS((hb_, b2a) => {
    var a2p = kw().fromPromise;
    var h2a = E6e();
    var g2a = require("path");
    var y2a = Roe();
    var _2a = V9t();
    var m2a = a2p(async function (t) {
      let n;
      try {
        n = await h2a.readdir(t);
      } catch {
        return y2a.mkdirs(t);
      }
      return Promise.all(n.map(r => _2a.remove(g2a.join(t, r))));
    });
    function f2a(e) {
      let t;
      try {
        t = h2a.readdirSync(e);
      } catch {
        return y2a.mkdirsSync(e);
      }
      t.forEach(n => {
        n = g2a.join(e, n);
        _2a.removeSync(n);
      });
    }
    b2a.exports = {
      emptyDirSync: f2a,
      emptydirSync: f2a,
      emptyDir: m2a,
      emptydir: m2a
    };
  });
  var w2a = __commonJS((gb_, v2a) => {
    var l2p = kw().fromCallback;
    var T2a = require("path");
    var XMe = iS();
    var E2a = Roe();
    function c2p(e, t) {
      function n() {
        XMe.writeFile(e, "", r => {
          if (r) {
            return t(r);
          }
          t();
        });
      }
      XMe.stat(e, (r, o) => {
        if (!r && o.isFile()) {
          return t();
        }
        let s = T2a.dirname(e);
        XMe.stat(s, (i, a) => {
          if (i) {
            if (i.code === "ENOENT") {
              return E2a.mkdirs(s, l => {
                if (l) {
                  return t(l);
                }
                n();
              });
            }
            return t(i);
          }
          if (a.isDirectory()) {
            n();
          } else {
            XMe.readdir(s, l => {
              if (l) {
                return t(l);
              }
            });
          }
        });
      });
    }
    function u2p(e) {
      let t;
      try {
        t = XMe.statSync(e);
      } catch {}
      if (t && t.isFile()) {
        return;
      }
      let n = T2a.dirname(e);
      try {
        if (!XMe.statSync(n).isDirectory()) {
          XMe.readdirSync(n);
        }
      } catch (r) {
        if (r && r.code === "ENOENT") {
          E2a.mkdirsSync(n);
        } else {
          throw r;
        }
      }
      XMe.writeFileSync(e, "");
    }
    v2a.exports = {
      createFile: l2p(c2p),
      createFileSync: u2p
    };
  });
  var A2a = __commonJS((yb_, k2a) => {
    var d2p = kw().fromCallback;
    var C2a = require("path");
    var QMe = iS();
    var R2a = Roe();
    var p2p = JMe().pathExists;
    var {
      areIdentical: x2a
    } = v6e();
    function m2p(e, t, n) {
      function r(o, s) {
        QMe.link(o, s, i => {
          if (i) {
            return n(i);
          }
          n(null);
        });
      }
      QMe.lstat(t, (o, s) => {
        QMe.lstat(e, (i, a) => {
          if (i) {
            i.message = i.message.replace("lstat", "ensureLink");
            return n(i);
          }
          if (s && x2a(a, s)) {
            return n(null);
          }
          let l = C2a.dirname(t);
          p2p(l, (c, u) => {
            if (c) {
              return n(c);
            }
            if (u) {
              return r(e, t);
            }
            R2a.mkdirs(l, d => {
              if (d) {
                return n(d);
              }
              r(e, t);
            });
          });
        });
      });
    }
    function f2p(e, t) {
      let n;
      try {
        n = QMe.lstatSync(t);
      } catch {}
      try {
        let s = QMe.lstatSync(e);
        if (n && x2a(s, n)) {
          return;
        }
      } catch (s) {
        throw s.message = s.message.replace("lstat", "ensureLink"), s;
      }
      let r = C2a.dirname(t);
      if (QMe.existsSync(r)) {
        return QMe.linkSync(e, t);
      }
      R2a.mkdirsSync(r);
      return QMe.linkSync(e, t);
    }
    k2a.exports = {
      createLink: d2p(m2p),
      createLinkSync: f2p
    };
  });
  var P2a = __commonJS((_b_, I2a) => {
    var ZMe = require("path");
    var z9t = iS();
    var h2p = JMe().pathExists;
    function g2p(e, t, n) {
      if (ZMe.isAbsolute(e)) {
        return z9t.lstat(e, r => {
          if (r) {
            r.message = r.message.replace("lstat", "ensureSymlink");
            return n(r);
          }
          return n(null, {
            toCwd: e,
            toDst: e
          });
        });
      } else {
        let r = ZMe.dirname(t);
        let o = ZMe.join(r, e);
        return h2p(o, (s, i) => {
          if (s) {
            return n(s);
          }
          if (i) {
            return n(null, {
              toCwd: o,
              toDst: e
            });
          } else {
            return z9t.lstat(e, a => {
              if (a) {
                a.message = a.message.replace("lstat", "ensureSymlink");
                return n(a);
              }
              return n(null, {
                toCwd: e,
                toDst: ZMe.relative(r, e)
              });
            });
          }
        });
      }
    }
    function y2p(e, t) {
      let n;
      if (ZMe.isAbsolute(e)) {
        if (n = z9t.existsSync(e), !n) {
          throw Error("absolute srcpath does not exist");
        }
        return {
          toCwd: e,
          toDst: e
        };
      } else {
        let r = ZMe.dirname(t);
        let o = ZMe.join(r, e);
        if (n = z9t.existsSync(o), n) {
          return {
            toCwd: o,
            toDst: e
          };
        } else {
          if (n = z9t.existsSync(e), !n) {
            throw Error("relative srcpath does not exist");
          }
          return {
            toCwd: e,
            toDst: ZMe.relative(r, e)
          };
        }
      }
    }
    I2a.exports = {
      symlinkPaths: g2p,
      symlinkPathsSync: y2p
    };
  });
  var M2a = __commonJS((bb_, D2a) => {
    var O2a = iS();
    function _2p(e, t, n) {
      if (n = typeof t === "function" ? t : n, t = typeof t === "function" ? false : t, t) {
        return n(null, t);
      }
      O2a.lstat(e, (r, o) => {
        if (r) {
          return n(null, "file");
        }
        t = o && o.isDirectory() ? "dir" : "file";
        n(null, t);
      });
    }
    function b2p(e, t) {
      let n;
      if (t) {
        return t;
      }
      try {
        n = O2a.lstatSync(e);
      } catch {
        return "file";
      }
      return n && n.isDirectory() ? "dir" : "file";
    }
    D2a.exports = {
      symlinkType: _2p,
      symlinkTypeSync: b2p
    };
  });
  var j2a = __commonJS((Sb_, H2a) => {
    var S2p = kw().fromCallback;
    var L2a = require("path");
    var xoe = E6e();
    var F2a = Roe();
    var T2p = F2a.mkdirs;
    var E2p = F2a.mkdirsSync;
    var U2a = P2a();
    var v2p = U2a.symlinkPaths;
    var w2p = U2a.symlinkPathsSync;
    var B2a = M2a();
    var C2p = B2a.symlinkType;
    var R2p = B2a.symlinkTypeSync;
    var x2p = JMe().pathExists;
    var {
      areIdentical: $2a
    } = v6e();
    function k2p(e, t, n, r) {
      r = typeof n === "function" ? n : r;
      n = typeof n === "function" ? false : n;
      xoe.lstat(t, (o, s) => {
        if (!o && s.isSymbolicLink()) {
          Promise.all([xoe.stat(e), xoe.stat(t)]).then(([i, a]) => {
            if ($2a(i, a)) {
              return r(null);
            }
            N2a(e, t, n, r);
          });
        } else {
          N2a(e, t, n, r);
        }
      });
    }
    function N2a(e, t, n, r) {
      v2p(e, t, (o, s) => {
        if (o) {
          return r(o);
        }
        e = s.toDst;
        C2p(s.toCwd, n, (i, a) => {
          if (i) {
            return r(i);
          }
          let l = L2a.dirname(t);
          x2p(l, (c, u) => {
            if (c) {
              return r(c);
            }
            if (u) {
              return xoe.symlink(e, t, a, r);
            }
            T2p(l, d => {
              if (d) {
                return r(d);
              }
              xoe.symlink(e, t, a, r);
            });
          });
        });
      });
    }
    function A2p(e, t, n) {
      let r;
      try {
        r = xoe.lstatSync(t);
      } catch {}
      if (r && r.isSymbolicLink()) {
        let a = xoe.statSync(e);
        let l = xoe.statSync(t);
        if ($2a(a, l)) {
          return;
        }
      }
      let o = w2p(e, t);
      e = o.toDst;
      n = R2p(o.toCwd, n);
      let s = L2a.dirname(t);
      if (xoe.existsSync(s)) {
        return xoe.symlinkSync(e, t, n);
      }
      E2p(s);
      return xoe.symlinkSync(e, t, n);
    }
    H2a.exports = {
      createSymlink: S2p(k2p),
      createSymlinkSync: A2p
    };
  });
  var J2a = __commonJS((Tb_, Y2a) => {
    var {
      createFile: q2a,
      createFileSync: W2a
    } = w2a();
    var {
      createLink: G2a,
      createLinkSync: V2a
    } = A2a();
    var {
      createSymlink: z2a,
      createSymlinkSync: K2a
    } = j2a();
    Y2a.exports = {
      createFile: q2a,
      createFileSync: W2a,
      ensureFile: q2a,
      ensureFileSync: W2a,
      createLink: G2a,
      createLinkSync: V2a,
      ensureLink: G2a,
      ensureLinkSync: V2a,
      createSymlink: z2a,
      createSymlinkSync: K2a,
      ensureSymlink: z2a,
      ensureSymlinkSync: K2a
    };
  });
  var Q2a = __commonJS((Eb_, X2a) => {
    var nWn = Abo();
    X2a.exports = {
      readJson: nWn.readFile,
      readJsonSync: nWn.readFileSync,
      writeJson: nWn.writeFile,
      writeJsonSync: nWn.writeFileSync
    };
  });
  var rWn = __commonJS((vb_, t$a) => {
    var I2p = kw().fromCallback;
    var K9t = iS();
    var Z2a = require("path");
    var e$a = Roe();
    var P2p = JMe().pathExists;
    function O2p(e, t, n, r) {
      if (typeof n === "function") {
        r = n;
        n = "utf8";
      }
      let o = Z2a.dirname(e);
      P2p(o, (s, i) => {
        if (s) {
          return r(s);
        }
        if (i) {
          return K9t.writeFile(e, t, n, r);
        }
        e$a.mkdirs(o, a => {
          if (a) {
            return r(a);
          }
          K9t.writeFile(e, t, n, r);
        });
      });
    }
    function D2p(e, ...t) {
      let n = Z2a.dirname(e);
      if (K9t.existsSync(n)) {
        return K9t.writeFileSync(e, ...t);
      }
      e$a.mkdirsSync(n);
      K9t.writeFileSync(e, ...t);
    }
    t$a.exports = {
      outputFile: I2p(O2p),
      outputFileSync: D2p
    };
  });