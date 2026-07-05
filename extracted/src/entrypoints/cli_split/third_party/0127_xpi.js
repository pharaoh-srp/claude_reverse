  var xpi = __commonJS((mTg, Rpi) => {
    var g0e = require("constants");
    var uwd = process.cwd;
    var hRn = null;
    var dwd = process.env.GRACEFUL_FS_PLATFORM || "linux";
    process.cwd = function () {
      if (!hRn) {
        hRn = uwd.call(process);
      }
      return hRn;
    };
    try {
      process.cwd();
    } catch (e) {}
    if (typeof process.chdir === "function") {
      if (gRn = process.chdir, process.chdir = function (e) {
        hRn = null;
        gRn.call(process, e);
      }, Object.setPrototypeOf) {
        Object.setPrototypeOf(process.chdir, gRn);
      }
    }
    var gRn;
    Rpi.exports = pwd;
    function pwd(e) {
      if (g0e.hasOwnProperty("O_SYMLINK") && process.version.match(/^v0\.6\.[0-2]|^v0\.5\./)) {
        t(e);
      }
      if (!e.lutimes) {
        n(e);
      }
      if (e.chown = s(e.chown), e.fchown = s(e.fchown), e.lchown = s(e.lchown), e.chmod = r(e.chmod), e.fchmod = r(e.fchmod), e.lchmod = r(e.lchmod), e.chownSync = i(e.chownSync), e.fchownSync = i(e.fchownSync), e.lchownSync = i(e.lchownSync), e.chmodSync = o(e.chmodSync), e.fchmodSync = o(e.fchmodSync), e.lchmodSync = o(e.lchmodSync), e.stat = a(e.stat), e.fstat = a(e.fstat), e.lstat = a(e.lstat), e.statSync = l(e.statSync), e.fstatSync = l(e.fstatSync), e.lstatSync = l(e.lstatSync), e.chmod && !e.lchmod) {
        e.lchmod = function (u, d, p) {
          if (p) {
            process.nextTick(p);
          }
        };
        e.lchmodSync = function () {};
      }
      if (e.chown && !e.lchown) {
        e.lchown = function (u, d, p, m) {
          if (m) {
            process.nextTick(m);
          }
        };
        e.lchownSync = function () {};
      }
      if (dwd === "win32") {
        e.rename = typeof e.rename !== "function" ? e.rename : function (u) {
          function d(p, m, f) {
            var h = Date.now();
            var g = 0;
            u(p, m, function y(_) {
              if (_ && (_.code === "EACCES" || _.code === "EPERM" || _.code === "EBUSY") && Date.now() - h < 60000) {
                if (setTimeout(function () {
                  e.stat(m, function (b, S) {
                    if (b && b.code === "ENOENT") {
                      u(p, m, y);
                    } else {
                      f(_);
                    }
                  });
                }, g), g < 100) {
                  g += 10;
                }
                return;
              }
              if (f) {
                f(_);
              }
            });
          }
          if (Object.setPrototypeOf) {
            Object.setPrototypeOf(d, u);
          }
          return d;
        }(e.rename);
      }
      e.read = typeof e.read !== "function" ? e.read : function (u) {
        function d(p, m, f, h, g, y) {
          var _;
          if (y && typeof y === "function") {
            var b = 0;
            _ = function (S, E, C) {
              if (S && S.code === "EAGAIN" && b < 10) {
                b++;
                return u.call(e, p, m, f, h, g, _);
              }
              y.apply(this, arguments);
            };
          }
          return u.call(e, p, m, f, h, g, _);
        }
        if (Object.setPrototypeOf) {
          Object.setPrototypeOf(d, u);
        }
        return d;
      }(e.read);
      e.readSync = typeof e.readSync !== "function" ? e.readSync : function (u) {
        return function (d, p, m, f, h) {
          var g = 0;
          while (true) {
            try {
              return u.call(e, d, p, m, f, h);
            } catch (y) {
              if (y.code === "EAGAIN" && g < 10) {
                g++;
                continue;
              }
              throw y;
            }
          }
        };
      }(e.readSync);
      function t(u) {
        u.lchmod = function (d, p, m) {
          u.open(d, g0e.O_WRONLY | g0e.O_SYMLINK, p, function (f, h) {
            if (f) {
              if (m) {
                m(f);
              }
              return;
            }
            u.fchmod(h, p, function (g) {
              u.close(h, function (y) {
                if (m) {
                  m(g || y);
                }
              });
            });
          });
        };
        u.lchmodSync = function (d, p) {
          var m = u.openSync(d, g0e.O_WRONLY | g0e.O_SYMLINK, p);
          var f = true;
          var h;
          try {
            h = u.fchmodSync(m, p);
            f = false;
          } finally {
            if (f) {
              try {
                u.closeSync(m);
              } catch (g) {}
            } else {
              u.closeSync(m);
            }
          }
          return h;
        };
      }
      function n(u) {
        if (g0e.hasOwnProperty("O_SYMLINK") && u.futimes) {
          u.lutimes = function (d, p, m, f) {
            u.open(d, g0e.O_SYMLINK, function (h, g) {
              if (h) {
                if (f) {
                  f(h);
                }
                return;
              }
              u.futimes(g, p, m, function (y) {
                u.close(g, function (_) {
                  if (f) {
                    f(y || _);
                  }
                });
              });
            });
          };
          u.lutimesSync = function (d, p, m) {
            var f = u.openSync(d, g0e.O_SYMLINK);
            var h;
            var g = true;
            try {
              h = u.futimesSync(f, p, m);
              g = false;
            } finally {
              if (g) {
                try {
                  u.closeSync(f);
                } catch (y) {}
              } else {
                u.closeSync(f);
              }
            }
            return h;
          };
        } else if (u.futimes) {
          u.lutimes = function (d, p, m, f) {
            if (f) {
              process.nextTick(f);
            }
          };
          u.lutimesSync = function () {};
        }
      }
      function r(u) {
        if (!u) {
          return u;
        }
        return function (d, p, m) {
          return u.call(e, d, p, function (f) {
            if (c(f)) {
              f = null;
            }
            if (m) {
              m.apply(this, arguments);
            }
          });
        };
      }
      function o(u) {
        if (!u) {
          return u;
        }
        return function (d, p) {
          try {
            return u.call(e, d, p);
          } catch (m) {
            if (!c(m)) {
              throw m;
            }
          }
        };
      }
      function s(u) {
        if (!u) {
          return u;
        }
        return function (d, p, m, f) {
          return u.call(e, d, p, m, function (h) {
            if (c(h)) {
              h = null;
            }
            if (f) {
              f.apply(this, arguments);
            }
          });
        };
      }
      function i(u) {
        if (!u) {
          return u;
        }
        return function (d, p, m) {
          try {
            return u.call(e, d, p, m);
          } catch (f) {
            if (!c(f)) {
              throw f;
            }
          }
        };
      }
      function a(u) {
        if (!u) {
          return u;
        }
        return function (d, p, m) {
          if (typeof p === "function") {
            m = p;
            p = null;
          }
          function f(h, g) {
            if (g) {
              if (g.uid < 0) {
                g.uid += 4294967296;
              }
              if (g.gid < 0) {
                g.gid += 4294967296;
              }
            }
            if (m) {
              m.apply(this, arguments);
            }
          }
          return p ? u.call(e, d, p, f) : u.call(e, d, f);
        };
      }
      function l(u) {
        if (!u) {
          return u;
        }
        return function (d, p) {
          var m = p ? u.call(e, d, p) : u.call(e, d);
          if (m) {
            if (m.uid < 0) {
              m.uid += 4294967296;
            }
            if (m.gid < 0) {
              m.gid += 4294967296;
            }
          }
          return m;
        };
      }
      function c(u) {
        if (!u) {
          return true;
        }
        if (u.code === "ENOSYS") {
          return true;
        }
        var d = !process.getuid || process.getuid() !== 0;
        if (d) {
          if (u.code === "EINVAL" || u.code === "EPERM") {
            return true;
          }
        }
        return false;
      }
    }
  });
  var Ipi = __commonJS((fTg, Api) => {
    var kpi = require("stream").Stream;
    Api.exports = mwd;
    function mwd(e) {
      return {
        ReadStream: t,
        WriteStream: n
      };
      function t(r, o) {
        if (!(this instanceof t)) {
          return new t(r, o);
        }
        kpi.call(this);
        var s = this;
        this.path = r;
        this.fd = null;
        this.readable = true;
        this.paused = false;
        this.flags = "r";
        this.mode = 438;
        this.bufferSize = 65536;
        o = o || {};
        var i = Object.keys(o);
        for (var a = 0, l = i.length; a < l; a++) {
          var c = i[a];
          this[c] = o[c];
        }
        if (this.encoding) {
          this.setEncoding(this.encoding);
        }
        if (this.start !== undefined) {
          if (typeof this.start !== "number") {
            throw TypeError("start must be a Number");
          }
          if (this.end === undefined) {
            this.end = 1 / 0;
          } else if (typeof this.end !== "number") {
            throw TypeError("end must be a Number");
          }
          if (this.start > this.end) {
            throw Error("start must be <= end");
          }
          this.pos = this.start;
        }
        if (this.fd !== null) {
          process.nextTick(function () {
            s._read();
          });
          return;
        }
        e.open(this.path, this.flags, this.mode, function (u, d) {
          if (u) {
            s.emit("error", u);
            s.readable = false;
            return;
          }
          s.fd = d;
          s.emit("open", d);
          s._read();
        });
      }
      function n(r, o) {
        if (!(this instanceof n)) {
          return new n(r, o);
        }
        kpi.call(this);
        this.path = r;
        this.fd = null;
        this.writable = true;
        this.flags = "w";
        this.encoding = "binary";
        this.mode = 438;
        this.bytesWritten = 0;
        o = o || {};
        var s = Object.keys(o);
        for (var i = 0, a = s.length; i < a; i++) {
          var l = s[i];
          this[l] = o[l];
        }
        if (this.start !== undefined) {
          if (typeof this.start !== "number") {
            throw TypeError("start must be a Number");
          }
          if (this.start < 0) {
            throw Error("start must be >= zero");
          }
          this.pos = this.start;
        }
        if (this.busy = false, this._queue = [], this.fd === null) {
          this._open = e.open;
          this._queue.push([this._open, this.path, this.flags, this.mode, undefined]);
          this.flush();
        }
      }
    }
  });
  var Opi = __commonJS((hTg, Ppi) => {
    Ppi.exports = hwd;
    var fwd = Object.getPrototypeOf || function (e) {
      return e.__proto__;
    };
    function hwd(e) {
      if (e === null || typeof e !== "object") {
        return e;
      }
      if (e instanceof Object) {
        var t = {
          __proto__: fwd(e)
        };
      } else {
        var t = Object.create(null);
      }
      Object.getOwnPropertyNames(e).forEach(function (n) {
        Object.defineProperty(t, n, Object.getOwnPropertyDescriptor(e, n));
      });
      return t;
    }
  });
  var iS = __commonJS((gTg, GWr) => {
    var Ik = require("fs");
    var gwd = xpi();
    var ywd = Ipi();
    var _wd = Opi();
    var yRn = require("util");
    var PF;
    var bRn;
    if (typeof Symbol === "function" && typeof Symbol.for === "function") {
      PF = Symbol.for("graceful-fs.queue");
      bRn = Symbol.for("graceful-fs.previous");
    } else {
      PF = "___graceful-fs.queue";
      bRn = "___graceful-fs.previous";
    }
    function bwd() {}
    function Mpi(e, t) {
      Object.defineProperty(e, PF, {
        get: function () {
          return t;
        }
      });
    }
    var Mqe = bwd;
    if (yRn.debuglog) {
      Mqe = yRn.debuglog("gfs4");
    } else if (/\bgfs4\b/i.test(process.env.NODE_DEBUG || "")) {
      Mqe = function () {
        var e = yRn.format.apply(yRn, arguments);
        e = "GFS4: " + e.split(/\n/).join(`
GFS4: `);
        console.error(e);
      };
    }
    if (!Ik[PF]) {
      if (jWr = global[PF] || [], Mpi(Ik, jWr), Ik.close = function (e) {
        function t(n, r) {
          return e.call(Ik, n, function (o) {
            if (!o) {
              Dpi();
            }
            if (typeof r === "function") {
              r.apply(this, arguments);
            }
          });
        }
        Object.defineProperty(t, bRn, {
          value: e
        });
        return t;
      }(Ik.close), Ik.closeSync = function (e) {
        function t(n) {
          e.apply(Ik, arguments);
          Dpi();
        }
        Object.defineProperty(t, bRn, {
          value: e
        });
        return t;
      }(Ik.closeSync), /\bgfs4\b/i.test(process.env.NODE_DEBUG || "")) {
        process.on("exit", function () {
          Mqe(Ik[PF]);
          require("assert").equal(Ik[PF].length, 0);
        });
      }
    }
    var jWr;
    if (!global[PF]) {
      Mpi(global, Ik[PF]);
    }
    GWr.exports = qWr(_wd(Ik));
    if (process.env.TEST_GRACEFUL_FS_GLOBAL_PATCH && !Ik.__patched) {
      GWr.exports = qWr(Ik);
      Ik.__patched = true;
    }
    function qWr(e) {
      gwd(e);
      e.gracefulify = qWr;
      e.createReadStream = E;
      e.createWriteStream = C;
      var t = e.readFile;
      e.readFile = n;
      function n(k, I, O) {
        if (typeof I === "function") {
          O = I;
          I = null;
        }
        return M(k, I, O);
        function M(L, P, F, H) {
          return t(L, P, function (U) {
            if (U && (U.code === "EMFILE" || U.code === "ENFILE")) {
              mst([M, [L, P, F], U, H || Date.now(), Date.now()]);
            } else if (typeof F === "function") {
              F.apply(this, arguments);
            }
          });
        }
      }
      var r = e.writeFile;
      e.writeFile = o;
      function o(k, I, O, M) {
        if (typeof O === "function") {
          M = O;
          O = null;
        }
        return L(k, I, O, M);
        function L(P, F, H, U, N) {
          return r(P, F, H, function (W) {
            if (W && (W.code === "EMFILE" || W.code === "ENFILE")) {
              mst([L, [P, F, H, U], W, N || Date.now(), Date.now()]);
            } else if (typeof U === "function") {
              U.apply(this, arguments);
            }
          });
        }
      }
      var s = e.appendFile;
      if (s) {
        e.appendFile = i;
      }
      function i(k, I, O, M) {
        if (typeof O === "function") {
          M = O;
          O = null;
        }
        return L(k, I, O, M);
        function L(P, F, H, U, N) {
          return s(P, F, H, function (W) {
            if (W && (W.code === "EMFILE" || W.code === "ENFILE")) {
              mst([L, [P, F, H, U], W, N || Date.now(), Date.now()]);
            } else if (typeof U === "function") {
              U.apply(this, arguments);
            }
          });
        }
      }
      var a = e.copyFile;
      if (a) {
        e.copyFile = l;
      }
      function l(k, I, O, M) {
        if (typeof O === "function") {
          M = O;
          O = 0;
        }
        return L(k, I, O, M);
        function L(P, F, H, U, N) {
          return a(P, F, H, function (W) {
            if (W && (W.code === "EMFILE" || W.code === "ENFILE")) {
              mst([L, [P, F, H, U], W, N || Date.now(), Date.now()]);
            } else if (typeof U === "function") {
              U.apply(this, arguments);
            }
          });
        }
      }
      var c = e.readdir;
      e.readdir = d;
      var u = /^v[0-5]\./;
      function d(k, I, O) {
        if (typeof I === "function") {
          O = I;
          I = null;
        }
        var M = u.test(process.version) ? function (F, H, U, N) {
          return c(F, L(F, H, U, N));
        } : function (F, H, U, N) {
          return c(F, H, L(F, H, U, N));
        };
        return M(k, I, O);
        function L(P, F, H, U) {
          return function (N, W) {
            if (N && (N.code === "EMFILE" || N.code === "ENFILE")) {
              mst([M, [P, F, H], N, U || Date.now(), Date.now()]);
            } else {
              if (W && W.sort) {
                W.sort();
              }
              if (typeof H === "function") {
                H.call(this, N, W);
              }
            }
          };
        }
      }
      if (process.version.substr(0, 4) === "v0.8") {
        var p = ywd(e);
        y = p.ReadStream;
        b = p.WriteStream;
      }
      var m = e.ReadStream;
      if (m) {
        y.prototype = Object.create(m.prototype);
        y.prototype.open = _;
      }
      var f = e.WriteStream;
      if (f) {
        b.prototype = Object.create(f.prototype);
        b.prototype.open = S;
      }
      Object.defineProperty(e, "ReadStream", {
        get: function () {
          return y;
        },
        set: function (k) {
          y = k;
        },
        enumerable: true,
        configurable: true
      });
      Object.defineProperty(e, "WriteStream", {
        get: function () {
          return b;
        },
        set: function (k) {
          b = k;
        },
        enumerable: true,
        configurable: true
      });
      var h = y;
      Object.defineProperty(e, "FileReadStream", {
        get: function () {
          return h;
        },
        set: function (k) {
          h = k;
        },
        enumerable: true,
        configurable: true
      });
      var g = b;
      Object.defineProperty(e, "FileWriteStream", {
        get: function () {
          return g;
        },
        set: function (k) {
          g = k;
        },
        enumerable: true,
        configurable: true
      });
      function y(k, I) {
        if (this instanceof y) {
          m.apply(this, arguments);
          return this;
        } else {
          return y.apply(Object.create(y.prototype), arguments);
        }
      }
      function _() {
        var k = this;
        A(k.path, k.flags, k.mode, function (I, O) {
          if (I) {
            if (k.autoClose) {
              k.destroy();
            }
            k.emit("error", I);
          } else {
            k.fd = O;
            k.emit("open", O);
            k.read();
          }
        });
      }
      function b(k, I) {
        if (this instanceof b) {
          f.apply(this, arguments);
          return this;
        } else {
          return b.apply(Object.create(b.prototype), arguments);
        }
      }
      function S() {
        var k = this;
        A(k.path, k.flags, k.mode, function (I, O) {
          if (I) {
            k.destroy();
            k.emit("error", I);
          } else {
            k.fd = O;
            k.emit("open", O);
          }
        });
      }
      function E(k, I) {
        return new e.ReadStream(k, I);
      }
      function C(k, I) {
        return new e.WriteStream(k, I);
      }
      var x = e.open;
      e.open = A;
      function A(k, I, O, M) {
        if (typeof O === "function") {
          M = O;
          O = null;
        }
        return L(k, I, O, M);
        function L(P, F, H, U, N) {
          return x(P, F, H, function (W, j) {
            if (W && (W.code === "EMFILE" || W.code === "ENFILE")) {
              mst([L, [P, F, H, U], W, N || Date.now(), Date.now()]);
            } else if (typeof U === "function") {
              U.apply(this, arguments);
            }
          });
        }
      }
      return e;
    }
    function mst(e) {
      Mqe("ENQUEUE", e[0].name, e[1]);
      Ik[PF].push(e);
      WWr();
    }
    var _Rn;
    function Dpi() {
      var e = Date.now();
      for (var t = 0; t < Ik[PF].length; ++t) {
        if (Ik[PF][t].length > 2) {
          Ik[PF][t][3] = e;
          Ik[PF][t][4] = e;
        }
      }
      WWr();
    }
    function WWr() {
      if (clearTimeout(_Rn), _Rn = undefined, Ik[PF].length === 0) {
        return;
      }
      var e = Ik[PF].shift();
      var t = e[0];
      var n = e[1];
      var r = e[2];
      var o = e[3];
      var s = e[4];
      if (o === undefined) {
        Mqe("RETRY", t.name, n);
        t.apply(null, n);
      } else if (Date.now() - o >= 60000) {
        Mqe("TIMEOUT", t.name, n);
        var i = n.pop();
        if (typeof i === "function") {
          i.call(null, r);
        }
      } else {
        var a = Date.now() - s;
        var l = Math.max(s - o, 1);
        var c = Math.min(l * 1.2, 100);
        if (a >= c) {
          Mqe("RETRY", t.name, n);
          t.apply(null, n.concat([o]));
        } else {
          Ik[PF].push(e);
        }
      }
      if (_Rn === undefined) {
        _Rn = setTimeout(WWr, 0);
      }
    }
  });
  var Lpi = __commonJS((yTg, Npi) => {
    function VY(e, t) {
      if (typeof t === "boolean") {
        t = {
          forever: t
        };
      }
      if (this._originalTimeouts = JSON.parse(JSON.stringify(e)), this._timeouts = e, this._options = t || {}, this._maxRetryTime = t && t.maxRetryTime || 1 / 0, this._fn = null, this._errors = [], this._attempts = 1, this._operationTimeout = null, this._operationTimeoutCb = null, this._timeout = null, this._operationStart = null, this._options.forever) {
        this._cachedTimeouts = this._timeouts.slice(0);
      }
    }
    Npi.exports = VY;
    VY.prototype.reset = function () {
      this._attempts = 1;
      this._timeouts = this._originalTimeouts;
    };
    VY.prototype.stop = function () {
      if (this._timeout) {
        clearTimeout(this._timeout);
      }
      this._timeouts = [];
      this._cachedTimeouts = null;
    };
    VY.prototype.retry = function (e) {
      if (this._timeout) {
        clearTimeout(this._timeout);
      }
      if (!e) {
        return false;
      }
      var t = new Date().getTime();
      if (e && t - this._operationStart >= this._maxRetryTime) {
        this._errors.unshift(Error("RetryOperation timeout occurred"));
        return false;
      }
      this._errors.push(e);
      var n = this._timeouts.shift();
      if (n === undefined) {
        if (this._cachedTimeouts) {
          this._errors.splice(this._errors.length - 1, this._errors.length);
          this._timeouts = this._cachedTimeouts.slice(0);
          n = this._timeouts.shift();
        } else {
          return false;
        }
      }
      var r = this;
      var o = setTimeout(function () {
        if (r._attempts++, r._operationTimeoutCb) {
          if (r._timeout = setTimeout(function () {
            r._operationTimeoutCb(r._attempts);
          }, r._operationTimeout), r._options.unref) {
            r._timeout.unref();
          }
        }
        r._fn(r._attempts);
      }, n);
      if (this._options.unref) {
        o.unref();
      }
      return true;
    };
    VY.prototype.attempt = function (e, t) {
      if (this._fn = e, t) {
        if (t.timeout) {
          this._operationTimeout = t.timeout;
        }
        if (t.cb) {
          this._operationTimeoutCb = t.cb;
        }
      }
      var n = this;
      if (this._operationTimeoutCb) {
        this._timeout = setTimeout(function () {
          n._operationTimeoutCb();
        }, n._operationTimeout);
      }
      this._operationStart = new Date().getTime();
      this._fn(this._attempts);
    };
    VY.prototype.try = function (e) {
      console.log("Using RetryOperation.try() is deprecated");
      this.attempt(e);
    };
    VY.prototype.start = function (e) {
      console.log("Using RetryOperation.start() is deprecated");
      this.attempt(e);
    };
    VY.prototype.start = VY.prototype.try;
    VY.prototype.errors = function () {
      return this._errors;
    };
    VY.prototype.attempts = function () {
      return this._attempts;
    };
    VY.prototype.mainError = function () {
      if (this._errors.length === 0) {
        return null;
      }
      var e = {};
      var t = null;
      var n = 0;
      for (var r = 0; r < this._errors.length; r++) {
        var o = this._errors[r];
        var s = o.message;
        var i = (e[s] || 0) + 1;
        if (e[s] = i, i >= n) {
          t = o;
          n = i;
        }
      }
      return t;
    };
  });
  var Fpi = __commonJS(Nqe => {
    var Swd = Lpi();
    Nqe.operation = function (e) {
      var t = Nqe.timeouts(e);
      return new Swd(t, {
        forever: e && e.forever,
        unref: e && e.unref,
        maxRetryTime: e && e.maxRetryTime
      });
    };
    Nqe.timeouts = function (e) {
      if (e instanceof Array) {
        return [].concat(e);
      }
      var t = {
        retries: 10,
        factor: 2,
        minTimeout: 1000,
        maxTimeout: 1 / 0,
        randomize: false
      };
      for (var n in e) {
        t[n] = e[n];
      }
      if (t.minTimeout > t.maxTimeout) {
        throw Error("minTimeout is greater than maxTimeout");
      }
      var r = [];
      for (var o = 0; o < t.retries; o++) {
        r.push(this.createTimeout(o, t));
      }
      if (e && e.forever && !r.length) {
        r.push(this.createTimeout(o, t));
      }
      r.sort(function (s, i) {
        return s - i;
      });
      return r;
    };
    Nqe.createTimeout = function (e, t) {
      var n = t.randomize ? Math.random() + 1 : 1;
      var r = Math.round(n * t.minTimeout * Math.pow(t.factor, e));
      r = Math.min(r, t.maxTimeout);
      return r;
    };
    Nqe.wrap = function (e, t, n) {
      if (t instanceof Array) {
        n = t;
        t = null;
      }
      if (!n) {
        n = [];
        for (var r in e) {
          if (typeof e[r] === "function") {
            n.push(r);
          }
        }
      }
      for (var o = 0; o < n.length; o++) {
        var s = n[o];
        var i = e[s];
        e[s] = function (l) {
          var c = Nqe.operation(t);
          var u = Array.prototype.slice.call(arguments, 1);
          var d = u.pop();
          u.push(function (p) {
            if (c.retry(p)) {
              return;
            }
            if (p) {
              arguments[0] = c.mainError();
            }
            d.apply(this, arguments);
          });
          c.attempt(function () {
            l.apply(e, u);
          });
        }.bind(e, i);
        e[s].options = t;
      }
    };
  });
  var Bpi = __commonJS((bTg, Upi) => {
    Upi.exports = Fpi();
  });