  var kw = __commonJS(bbo => {
    bbo.fromCallback = function (e) {
      return Object.defineProperty(function (...t) {
        if (typeof t[t.length - 1] === "function") {
          e.apply(this, t);
        } else {
          return new Promise((n, r) => {
            t.push((o, s) => o != null ? r(o) : n(s));
            e.apply(this, t);
          });
        }
      }, "name", {
        value: e.name
      });
    };
    bbo.fromPromise = function (e) {
      return Object.defineProperty(function (...t) {
        let n = t[t.length - 1];
        if (typeof n !== "function") {
          return e.apply(this, t);
        } else {
          t.pop();
          e.apply(this, t).then(r => n(null, r), n);
        }
      }, "name", {
        value: e.name
      });
    };
  });
  var S6e = __commonJS(WMe => {
    var MFa = kw().fromCallback;
    var n9 = iS();
    var pFp = ["access", "appendFile", "chmod", "chown", "close", "copyFile", "fchmod", "fchown", "fdatasync", "fstat", "fsync", "ftruncate", "futimes", "lchmod", "lchown", "link", "lstat", "mkdir", "mkdtemp", "open", "opendir", "readdir", "readFile", "readlink", "realpath", "rename", "rm", "rmdir", "stat", "symlink", "truncate", "unlink", "utimes", "writeFile"].filter(e => typeof n9[e] === "function");
    Object.assign(WMe, n9);
    pFp.forEach(e => {
      WMe[e] = MFa(n9[e]);
    });
    WMe.exists = function (e, t) {
      if (typeof t === "function") {
        return n9.exists(e, t);
      }
      return new Promise(n => n9.exists(e, n));
    };
    WMe.read = function (e, t, n, r, o, s) {
      if (typeof s === "function") {
        return n9.read(e, t, n, r, o, s);
      }
      return new Promise((i, a) => {
        n9.read(e, t, n, r, o, (l, c, u) => {
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
    WMe.write = function (e, t, ...n) {
      if (typeof n[n.length - 1] === "function") {
        return n9.write(e, t, ...n);
      }
      return new Promise((r, o) => {
        n9.write(e, t, ...n, (s, i, a) => {
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
    if (typeof n9.writev === "function") {
      WMe.writev = function (e, t, ...n) {
        if (typeof n[n.length - 1] === "function") {
          return n9.writev(e, t, ...n);
        }
        return new Promise((r, o) => {
          n9.writev(e, t, ...n, (s, i, a) => {
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
    if (typeof n9.realpath.native === "function") {
      WMe.realpath.native = MFa(n9.realpath.native);
    } else {
      process.emitWarning("fs.realpath.native is not a function. Is fs being monkey-patched?", "Warning", "fs-extra-WARN0003");
    }
  });
  var LFa = __commonJS((x__, NFa) => {
    var R__ = require("path");
    NFa.exports.checkPath = function (t) {};
  });