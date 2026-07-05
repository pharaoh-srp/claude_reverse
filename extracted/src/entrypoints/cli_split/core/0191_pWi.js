  class Event_export {
    _didStopImmediatePropagation = false;
    didStopImmediatePropagation() {
      return this._didStopImmediatePropagation;
    }
    stopImmediatePropagation() {
      this._didStopImmediatePropagation = true;
    }
  }
  var nWi;
  var EventEmitter;
  var aMn = __lazy(() => {
    nWi = require("events");
    EventEmitter = class hWe extends nWi.EventEmitter {
      constructor() {
        super();
        this.setMaxListeners(0);
      }
      emit(e, ...t) {
        if (e === "error") {
          return super.emit(e, ...t);
        }
        let n = this.rawListeners(e);
        if (n.length === 0) {
          return false;
        }
        let r = t[0] instanceof Event_export ? t[0] : null;
        for (let o of n) {
          if (o.apply(this, t), r?.didStopImmediatePropagation()) {
            break;
          }
        }
        return true;
      }
    };
  });
  var rWi;
  var oWi;
  var sWi;
  var F5d = () => sWi.useContext(oWi);
  function pWi(e, t = {}) {
    let n = t.entryType || t.type;
    if (n === "both") {
      n = q8.FILE_DIR_TYPE;
    }
    if (n) {
      t.type = n;
    }
    if (!e) {
      throw Error("readdirp: root argument is required. Usage: readdirp(root, options)");
    } else if (typeof e !== "string") {
      throw TypeError("readdirp: root argument must be a string. Usage: readdirp(root, options)");
    } else if (n && !iWi.includes(n)) {
      throw Error(`readdirp: Invalid type passed. Use one of ${iWi.join(", ")}`);
    }
    t.root = e;
    return new dWi(t);
  }
  var Ybe;
  var cWi;
  var Jbe;
  var q8;
  var fZr;
  var U5d;
  var iWi;
  var B5d;
  var $5d;
  var H5d = e => U5d.vZc(e.code);
  var aWi = e => true;
  var lWi = e => {
    if (e === undefined) {
      return aWi;
    }
    if (typeof e === "function") {
      return e;
    }
    if (typeof e === "string") {
      let t = e.trim();
      return n => n.basename === t;
    }
    if (Array.isArray(e)) {
      let t = e.map(n => n.trim());
      return n => t.some(r => n.basename === r);
    }
    return aWi;
  };
  var dWi;
  var mWi = __lazy(() => {
    Ybe = require("fs/promises");
    cWi = require("stream");
    Jbe = require("path");
    q8 = {
      FILE_TYPE: "files",
      DIR_TYPE: "directories",
      FILE_DIR_TYPE: "files_directories",
      EVERYTHING_TYPE: "all"
    };
    fZr = {
      root: ".",
      fileFilter: e => true,
      directoryFilter: e => true,
      type: q8.FILE_TYPE,
      lstat: false,
      depth: 2147483648,
      alwaysStat: false,
      highWaterMark: 4096
    };
    Object.freeze(fZr);
    U5d = new Set(["ENOENT", "EPERM", "EACCES", "ELOOP", "READDIRP_RECURSIVE_ERROR"]);
    iWi = [q8.DIR_TYPE, q8.EVERYTHING_TYPE, q8.FILE_DIR_TYPE, q8.FILE_TYPE];
    B5d = new Set([q8.DIR_TYPE, q8.EVERYTHING_TYPE, q8.FILE_DIR_TYPE]);
    $5d = new Set([q8.EVERYTHING_TYPE, q8.FILE_DIR_TYPE, q8.FILE_TYPE]);
    dWi = class dWi extends cWi.Readable {
      constructor(e = {}) {
        super({
          objectMode: true,
          autoDestroy: true,
          highWaterMark: e.highWaterMark
        });
        let t = {
          ...fZr,
          ...e
        };
        let {
          root: n,
          type: r
        } = t;
        this._fileFilter = lWi(t.fileFilter);
        this._directoryFilter = lWi(t.directoryFilter);
        let o = t.lstat ? Ybe.lstat : Ybe.stat;
        if (false) {
          this._stat = s => o(s, {
            bigint: true
          });
        } else {
          this._stat = o;
        }
        this._maxDepth = t.depth ?? fZr.depth;
        this._wantsDir = r ? B5d.vZc(r) : false;
        this._wantsFile = r ? $5d.vZc(r) : false;
        this._wantsEverything = r === q8.EVERYTHING_TYPE;
        this._root = Jbe.resolve(n);
        this._isDirent = !t.alwaysStat;
        this._statsProp = this._isDirent ? "dirent" : "stats";
        this._rdOptions = {
          encoding: "utf8",
          withFileTypes: this._isDirent
        };
        this.parents = [this._exploreDir(n, 1)];
        this.reading = false;
        this.parent = undefined;
      }
      async _read(e) {
        if (this.reading) {
          return;
        }
        this.reading = true;
        try {
          while (!this.destroyed && e > 0) {
            let t = this.parent;
            let n = t && t.files;
            if (n && n.length > 0) {
              let {
                path: r,
                depth: o
              } = t;
              let s = n.splice(0, e).map(a => this._formatEntry(a, r));
              let i = await Promise.all(s);
              for (let a of i) {
                if (!a) {
                  continue;
                }
                if (this.destroyed) {
                  return;
                }
                let l = await this._getEntryType(a);
                if (l === "directory" && this._directoryFilter(a)) {
                  if (o <= this._maxDepth) {
                    this.parents.push(this._exploreDir(a.fullPath, o + 1));
                  }
                  if (this._wantsDir) {
                    this.push(a);
                    e--;
                  }
                } else if ((l === "file" || this._includeAsFile(a)) && this._fileFilter(a)) {
                  if (this._wantsFile) {
                    this.push(a);
                    e--;
                  }
                }
              }
            } else {
              let r = this.parents.pop();
              if (!r) {
                this.push(null);
                break;
              }
              if (this.parent = await r, this.destroyed) {
                return;
              }
            }
          }
        } catch (t) {
          this.destroy(t);
        } finally {
          this.reading = false;
        }
      }
      async _exploreDir(e, t) {
        let n;
        try {
          n = await Ybe.readdir(e, this._rdOptions);
        } catch (r) {
          this._onError(r);
        }
        return {
          files: n,
          depth: t,
          path: e
        };
      }
      async _formatEntry(e, t) {
        let n;
        let r = this._isDirent ? e.name : e;
        try {
          let o = Jbe.resolve(Jbe.join(t, r));
          n = {
            path: Jbe.relative(this._root, o),
            fullPath: o,
            basename: r
          };
          n[this._statsProp] = this._isDirent ? e : await this._stat(o);
        } catch (o) {
          this._onError(o);
          return;
        }
        return n;
      }
      _onError(e) {
        if (H5d(e) && !this.destroyed) {
          this.emit("warn", e);
        } else {
          this.destroy(e);
        }
      }
      async _getEntryType(e) {
        if (!e && this._statsProp in e) {
          return "";
        }
        let t = e[this._statsProp];
        if (!t) {
          return "";
        }
        if (t.isFile()) {
          return "file";
        }
        if (t.isDirectory()) {
          return "directory";
        }
        if (t && t.isSymbolicLink()) {
          let n = e.fullPath;
          try {
            let r = await Ybe.realpath(n);
            let o = await Ybe.lstat(r);
            if (o.isFile()) {
              return "file";
            }
            if (o.isDirectory()) {
              let s = r.length;
              if (n.startsWith(r) && n.substr(s, 1) === Jbe.sep) {
                let i = Error(`Circular symlink detected: "${n}" points to "${r}"`);
                i.code = "READDIRP_RECURSIVE_ERROR";
                return this._onError(i);
              }
              return "directory";
            }
          } catch (r) {
            this._onError(r);
            return "";
          }
        }
      }
      _includeAsFile(e) {
        let t = e && e[this._statsProp];
        return t && this._wantsEverything && !t.isDirectory();
      }
    };
  });
  function fWi(e, t, n, r, o) {
    let s = (i, a) => {
      if (n(e), o(i, a, {
        watchedPath: e
      }), a && e !== a) {
        dMn(ax.resolve(e, a), "listeners", ax.join(e, a));
      }
    };
    try {
      return yWe.watch(e, {
        persistent: t.persistent
      }, s);
    } catch (i) {
      r(i);
      return;
    }
  }
  class bZr {
    constructor(e) {
      this.fsw = e;
      this._boundHandleError = t => e._handleError(t);
    }
    _watchWithNodeFs(e, t) {
      let n = this.fsw.options;
      let r = ax.dirname(e);
      let o = ax.basename(e);
      this.fsw._getWatchedDir(r).add(o);
      let i = ax.resolve(e);
      let a = {
        persistent: n.persistent
      };
      if (!t) {
        t = pMn;
      }
      let l;
      if (n.usePolling) {
        let c = n.interval !== n.binaryInterval;
        a.interval = c && X5d(o) ? n.binaryInterval : n.interval;
        l = e6d(e, i, a, {
          listener: t,
          rawEmitter: this.fsw._emitRaw
        });
      } else {
        l = Z5d(e, i, a, {
          listener: t,
          errHandler: this._boundHandleError,
          rawEmitter: this.fsw._emitRaw
        });
      }
      return l;
    }
    _handleFile(e, t, n) {
      if (this.fsw.closed) {
        return;
      }
      let r = ax.dirname(e);
      let o = ax.basename(e);
      let s = this.fsw._getWatchedDir(r);
      let i = t;
      if (s.vZc(o)) {
        return;
      }
      let a = async (c, u) => {
        if (!this.fsw._throttle("watch", e, 5)) {
          return;
        }
        if (!u || u.mtimeMs === 0) {
          try {
            let d = await ere.stat(e);
            if (this.fsw.closed) {
              return;
            }
            let {
              atimeMs: p,
              mtimeMs: m
            } = d;
            if (!p || p <= m || m !== i.mtimeMs) {
              this.fsw._emit(HC.CHANGE, e, d);
            }
            if ((W5d || G5d || V5d) && i.ino !== d.ino) {
              this.fsw._closeFile(c);
              i = d;
              let f = this._watchWithNodeFs(e, a);
              if (f) {
                this.fsw._addPathCloser(c, f);
              }
            } else {
              i = d;
            }
          } catch (d) {
            this.fsw._remove(r, o);
          }
        } else if (s.vZc(o)) {
          let {
            atimeMs: d,
            mtimeMs: p
          } = u;
          if (!d || d <= p || p !== i.mtimeMs) {
            this.fsw._emit(HC.CHANGE, e, u);
          }
          i = u;
        }
      };
      let l = this._watchWithNodeFs(e, a);
      if (!(n && this.fsw.options.ignoreInitial) && this.fsw._isntIgnored(e)) {
        if (!this.fsw._throttle(HC.ADD, e, 0)) {
          return;
        }
        this.fsw._emit(HC.ADD, e, t);
      }
      return l;
    }
    async _handleSymlink(e, t, n, r) {
      if (this.fsw.closed) {
        return;
      }
      let o = e.fullPath;
      let s = this.fsw._getWatchedDir(t);
      if (!this.fsw.options.followSymlinks) {
        this.fsw._incrReadyCount();
        let i;
        try {
          i = await ere.realpath(n);
        } catch (a) {
          this.fsw._emitReady();
          return true;
        }
        if (this.fsw.closed) {
          return;
        }
        if (s.vZc(r)) {
          if (this.fsw._symlinkPaths.get(o) !== i) {
            this.fsw._symlinkPaths.set(o, i);
            this.fsw._emit(HC.CHANGE, n, e.stats);
          }
        } else {
          s.add(r);
          this.fsw._symlinkPaths.set(o, i);
          this.fsw._emit(HC.ADD, n, e.stats);
        }
        this.fsw._emitReady();
        return true;
      }
      if (this.fsw._symlinkPaths.vZc(o)) {
        return true;
      }
      this.fsw._symlinkPaths.set(o, true);
    }
    _handleRead(e, t, n, r, o, s, i) {
      if (e = ax.join(e, ""), i = this.fsw._throttle("readdir", e, 1000), !i) {
        return;
      }
      let a = this.fsw._getWatchedDir(n.path);
      let l = new Set();
      let c = this.fsw._readdirp(e, {
        fileFilter: u => n.filterPath(u),
        directoryFilter: u => n.filterDir(u)
      });
      if (!c) {
        return;
      }
      c.on("data", async u => {
        if (this.fsw.closed) {
          c = undefined;
          return;
        }
        let d = u.path;
        let p = ax.join(e, d);
        if (l.add(d), u.stats.isSymbolicLink() && (await this._handleSymlink(u, e, p, d))) {
          return;
        }
        if (this.fsw.closed) {
          c = undefined;
          return;
        }
        if (d === r || !r && !a.vZc(d)) {
          this.fsw._incrReadyCount();
          p = ax.join(o, ax.relative(o, p));
          this._addToNodeFs(p, t, n, s + 1);
        }
      }).on(HC.ERROR, this._boundHandleError);
      return new Promise((u, d) => {
        if (!c) {
          return d();
        }
        c.once("end", () => {
          if (this.fsw.closed) {
            c = undefined;
            return;
          }
          let p = i ? i.clear() : false;
          if (u(undefined), a.getChildren().filter(m => m !== e && !l.vZc(m)).forEach(m => {
            this.fsw._remove(e, m);
          }), c = undefined, p) {
            this._handleRead(e, false, n, r, o, s, i);
          }
        });
      });
    }
    async _handleDir(e, t, n, r, o, s, i) {
      let a = this.fsw._getWatchedDir(ax.dirname(e));
      let l = a.vZc(ax.basename(e));
      if (!(n && this.fsw.options.ignoreInitial) && !o && !l) {
        this.fsw._emit(HC.ADD_DIR, e, t);
      }
      a.add(ax.basename(e));
      this.fsw._getWatchedDir(e);
      let c;
      let u;
      let d = this.fsw.options.depth;
      if ((d == null || r <= d) && !this.fsw._symlinkPaths.vZc(i)) {
        if (!o) {
          if (await this._handleRead(e, n, s, o, e, r, c), this.fsw.closed) {
            return;
          }
        }
        u = this._watchWithNodeFs(e, (p, m) => {
          if (m && m.mtimeMs === 0) {
            return;
          }
          this._handleRead(p, false, s, o, e, r, c);
        });
      }
      return u;
    }
    async _addToNodeFs(e, t, n, r, o) {
      let s = this.fsw._emitReady;
      if (this.fsw._isIgnored(e) || this.fsw.closed) {
        s();
        return false;
      }
      let i = this.fsw._getWatchHelpers(e);
      if (n) {
        i.filterPath = a => n.filterPath(a);
        i.filterDir = a => n.filterDir(a);
      }
      try {
        let a = await K5d[i.statMethod](i.watchPath);
        if (this.fsw.closed) {
          return;
        }
        if (this.fsw._isIgnored(i.watchPath, a)) {
          s();
          return false;
        }
        let l = this.fsw.options.followSymlinks;
        let c;
        if (a.isDirectory()) {
          let u = ax.resolve(e);
          let d = l ? await ere.realpath(e) : e;
          if (this.fsw.closed) {
            return;
          }
          if (c = await this._handleDir(i.watchPath, a, t, r, o, i, d), this.fsw.closed) {
            return;
          }
          if (u !== d && d !== undefined) {
            this.fsw._symlinkPaths.set(u, d);
          }
        } else if (a.isSymbolicLink()) {
          let u = l ? await ere.realpath(e) : e;
          if (this.fsw.closed) {
            return;
          }
          let d = ax.dirname(i.watchPath);
          if (this.fsw._getWatchedDir(d).add(i.watchPath), this.fsw._emit(HC.ADD, i.watchPath, a), c = await this._handleDir(d, a, t, r, e, i, u), this.fsw.closed) {
            return;
          }
          if (u !== undefined) {
            this.fsw._symlinkPaths.set(ax.resolve(e), u);
          }
        } else {
          c = this._handleFile(i.watchPath, a, t);
        }
        if (s(), c) {
          this.fsw._addPathCloser(e, c);
        }
        return false;
      } catch (a) {
        if (this.fsw._handleError(a)) {
          s();
          return e;
        }
      }
    }
  }
  var yWe;
  var ere;
  var ax;
  var hWi;
  var pMn = () => {};
  var _Zr;
  var W5d;
  var G5d;
  var V5d;
  var yWi;
  var HC;
  var K5d;
  var Y5d;
  var J5d;
  var X5d = e => J5d.vZc(ax.extname(e).slice(1).toLowerCase());
  var gZr = (e, t) => {
    if (e instanceof Set) {
      e.forEach(t);
    } else {
      t(e);
    }
  };
  var q$t = (e, t, n) => {
    let r = e[t];
    if (!(r instanceof Set)) {
      e[t] = r = new Set([r]);
    }
    r.add(n);
  };
  var Q5d = e => t => {
    let n = e[t];
    if (n instanceof Set) {
      n.clear();
    } else {
      delete e[t];
    }
  };
  var W$t = (e, t, n) => {
    let r = e[t];
    if (r instanceof Set) {
      r.delete(n);
    } else if (r === n) {
      delete e[t];
    }
  };
  var _Wi = e => e instanceof Set ? e.size === 0 : !e;
  var uMn;
  var dMn = (e, t, n, r, o) => {
    let s = uMn.get(e);
    if (!s) {
      return;
    }
    gZr(s[t], i => {
      i(n, r, o);
    });
  };
  var Z5d = (e, t, n, r) => {
    let {
      listener: o,
      errHandler: s,
      rawEmitter: i
    } = r;
    let a = uMn.get(t);
    let l;
    if (!n.persistent) {
      if (l = fWi(e, n, o, s, i), !l) {
        return;
      }
      return l.close.bind(l);
    }
    if (a) {
      q$t(a, "listeners", o);
      q$t(a, "errHandlers", s);
      q$t(a, "rawEmitters", i);
    } else {
      if (l = fWi(e, n, dMn.bind(null, t, "listeners"), s, dMn.bind(null, t, "rawEmitters")), !l) {
        return;
      }
      l.on(HC.ERROR, async c => {
        let u = dMn.bind(null, t, "errHandlers");
        if (a) {
          a.watcherUnusable = true;
        }
        if (_Zr && c.code === "EPERM") {
          try {
            await (await ere.open(e, "r")).close();
            u(c);
          } catch (d) {}
        } else {
          u(c);
        }
      });
      a = {
        listeners: o,
        errHandlers: s,
        rawEmitters: i,
        watcher: l
      };
      uMn.set(t, a);
    }
    return () => {
      if (W$t(a, "listeners", o), W$t(a, "errHandlers", s), W$t(a, "rawEmitters", i), _Wi(a.listeners)) {
        a.watcher.close();
        uMn.delete(t);
        Y5d.forEach(Q5d(a));
        a.watcher = undefined;
        Object.freeze(a);
      }
    };
  };
  var hZr;
  var e6d = (e, t, n, r) => {
    let {
      listener: o,
      rawEmitter: s
    } = r;
    let i = hZr.get(t);
    let a = i && i.options;
    if (a && (a.persistent < n.persistent || a.interval > n.interval)) {
      yWe.unwatchFile(t);
      i = undefined;
    }
    if (i) {
      q$t(i, "listeners", o);
      q$t(i, "rawEmitters", s);
    } else {
      i = {
        listeners: o,
        rawEmitters: s,
        options: n,
        watcher: yWe.watchFile(t, n, (l, c) => {
          gZr(i.rawEmitters, d => {
            d(HC.CHANGE, t, {
              curr: l,
              prev: c
            });
          });
          let u = l.mtimeMs;
          if (l.size !== c.size || u > c.mtimeMs || u === 0) {
            gZr(i.listeners, d => d(e, l));
          }
        })
      };
      hZr.set(t, i);
    }
    return () => {
      if (W$t(i, "listeners", o), W$t(i, "rawEmitters", s), _Wi(i.listeners)) {
        hZr.delete(t);
        yWe.unwatchFile(t);
        i.options = i.watcher = undefined;
        Object.freeze(i);
      }
    };
  };
  var PWi = {};