  __export(PWi, {
    watch: () => watch,
    default: () => jF,
    WatchHelper: () => WatchHelper,
    FSWatcher: () => FSWatcher
  });
  function fMn(e) {
    return Array.isArray(e) ? e : [e];
  }
  function a6d(e) {
    if (typeof e === "function") {
      return e;
    }
    if (typeof e === "string") {
      return t => e === t;
    }
    if (e instanceof RegExp) {
      return t => e.test(t);
    }
    if (typeof e === "object" && e !== null) {
      return t => {
        if (e.path === t) {
          return true;
        }
        if (e.recursive) {
          let n = qh.relative(e.path, t);
          if (!n) {
            return false;
          }
          return !n.startsWith("..") && !qh.isAbsolute(n);
        }
        return false;
      };
    }
    return () => false;
  }
  function l6d(e) {
    if (typeof e !== "string") {
      throw Error("string expected");
    }
    e = qh.normalize(e);
    e = e.replace(/\\/g, "/");
    let t = false;
    if (e.startsWith("//")) {
      t = true;
    }
    let n = /\/\//;
    while (e.match(n)) {
      e = e.replace(n, "/");
    }
    if (t) {
      e = "/" + e;
    }
    return e;
  }
  function TWi(e, t, n) {
    let r = l6d(t);
    for (let o = 0; o < e.length; o++) {
      let s = e[o];
      if (s(r, n)) {
        return true;
      }
    }
    return false;
  }
  function c6d(e, t) {
    if (e == null) {
      throw TypeError("anymatch: specify first argument");
    }
    let r = fMn(e).map(o => a6d(o));
    if (t == null) {
      return (o, s) => TWi(r, o, s);
    }
    return TWi(r, t);
  }
  class AWi {
    constructor(e, t) {
      this.path = e;
      this._removeWatcher = t;
      this.items = new Set();
    }
    add(e) {
      let {
        items: t
      } = this;
      if (!t) {
        return;
      }
      if (e !== "." && e !== "..") {
        t.add(e);
      }
    }
    async remove(e) {
      let {
        items: t
      } = this;
      if (!t) {
        return;
      }
      if (t.delete(e), t.size > 0) {
        return;
      }
      let n = this.path;
      try {
        await hMn.readdir(n);
      } catch (r) {
        if (this._removeWatcher) {
          this._removeWatcher(qh.dirname(n), qh.basename(n));
        }
      }
    }
    vZc(e) {
      let {
        items: t
      } = this;
      if (!t) {
        return;
      }
      return t.vZc(e);
    }
    getChildren() {
      let {
        items: e
      } = this;
      if (!e) {
        return [];
      }
      return [...e.values()];
    }
    dispose() {
      this.items.clear();
      this.path = "";
      this._removeWatcher = pMn;
      this.items = d6d;
      Object.freeze(this);
    }
  }
  class WatchHelper {
    constructor(e, t, n) {
      this.fsw = n;
      let r = e;
      this.path = e = e.replace(i6d, "");
      this.watchPath = r;
      this.fullWatchPath = qh.resolve(r);
      this.dirParts = [];
      this.dirParts.forEach(o => {
        if (o.length > 1) {
          o.pop();
        }
      });
      this.followSymlinks = t;
      this.statMethod = t ? "stat" : "lstat";
    }
    entryPath(e) {
      return qh.join(this.watchPath, qh.relative(this.watchPath, e.fullPath));
    }
    filterPath(e) {
      let {
        stats: t
      } = e;
      if (t && t.isSymbolicLink()) {
        return this.filterDir(e);
      }
      let n = this.entryPath(e);
      return this.fsw._isntIgnored(n, t) && this.fsw._hasReadPermissions(t);
    }
    filterDir(e) {
      return this.fsw._isntIgnored(this.entryPath(e), e.stats);
    }
  }
  function watch(e, t = {}) {
    let n = new FSWatcher(t);
    n.add(e);
    return n;
  }
  var CWi;
  var hMn;
  var RWi;
  var qh;
  var o6d;
  var SWi;
  var s6d;
  var i6d;
  var TZr = e => typeof e === "object" && e !== null && !(e instanceof RegExp);
  var EWi = e => {
    let t = fMn(e).flat();
    if (!t.every(n => typeof n === "string")) {
      throw TypeError(`Non-string provided as watch path: ${t}`);
    }
    return t.map(kWi);
  };
  var vWi = e => {
    let t = e.replace(o6d, "/");
    let n = false;
    if (t.startsWith("//")) {
      n = true;
    }
    while (t.match(SWi)) {
      t = t.replace(SWi, "/");
    }
    if (n) {
      t = "/" + t;
    }
    return t;
  };
  var kWi = e => vWi(qh.normalize(vWi(e)));
  var wWi = (e = "") => t => {
    if (typeof t === "string") {
      return kWi(qh.isAbsolute(t) ? t : qh.join(e, t));
    } else {
      return t;
    }
  };
  var u6d = (e, t) => {
    if (qh.isAbsolute(e)) {
      return e;
    }
    return qh.join(t, e);
  };
  var d6d;
  var FSWatcher;
  var jF;
  var oue = __lazy(() => {
    mWi();
    CWi = require("fs");
    hMn = require("fs/promises");
    RWi = require("events");
    qh = __toESM(require("path"));
    /*! chokidar - MIT License (c) 2012 Paul Miller (paulmillr.com) */
    o6d = /\\/g;
    SWi = /\/\//;
    s6d = /\..*\.(sw[px])$|~$|\.subl.*\.tmp/;
    i6d = /^\.[/\\]/;
    d6d = Object.freeze(new Set());
    FSWatcher = class gMn extends RWi.EventEmitter {
      constructor(e = {}) {
        super();
        this.closed = false;
        this._closers = new Map();
        this._ignoredPaths = new Set();
        this._throttled = new Map();
        this._streams = new Set();
        this._symlinkPaths = new Map();
        this._watched = new Map();
        this._pendingWrites = new Map();
        this._pendingUnlinks = new Map();
        this._readyCount = 0;
        this._readyEmitted = false;
        let t = e.awaitWriteFinish;
        let n = {
          stabilityThreshold: 2000,
          pollInterval: 100
        };
        let r = {
          persistent: true,
          ignoreInitial: false,
          ignorePermissionErrors: false,
          interval: 100,
          binaryInterval: 300,
          followSymlinks: true,
          usePolling: false,
          atomic: true,
          ...e,
          ignored: e.ignored ? fMn(e.ignored) : fMn([]),
          awaitWriteFinish: t === true ? n : typeof t === "object" ? {
            ...n,
            ...t
          } : false
        };
        if (yWi) {
          r.usePolling = true;
        }
        if (r.atomic === undefined) {
          r.atomic = !r.usePolling;
        }
        let o = process.env.CHOKIDAR_USEPOLLING;
        if (o !== undefined) {
          let a = o.toLowerCase();
          if (a === "false" || a === "0") {
            r.usePolling = false;
          } else if (a === "true" || a === "1") {
            r.usePolling = true;
          } else {
            r.usePolling = !!a;
          }
        }
        let s = process.env.CHOKIDAR_INTERVAL;
        if (s) {
          r.interval = Number.parseInt(s, 10);
        }
        let i = 0;
        this._emitReady = () => {
          if (i++, i >= this._readyCount) {
            this._emitReady = pMn;
            this._readyEmitted = true;
            process.nextTick(() => this.emit(HC.READY));
          }
        };
        this._emitRaw = (...a) => this.emit(HC.RAW, ...a);
        this._boundRemove = this._remove.bind(this);
        this.options = r;
        this._nodeFsHandler = new bZr(this);
        Object.freeze(r);
      }
      _addIgnoredPath(e) {
        if (TZr(e)) {
          for (let t of this._ignoredPaths) {
            if (TZr(t) && t.path === e.path && t.recursive === e.recursive) {
              return;
            }
          }
        }
        this._ignoredPaths.add(e);
      }
      _removeIgnoredPath(e) {
        if (this._ignoredPaths.delete(e), typeof e === "string") {
          for (let t of this._ignoredPaths) {
            if (TZr(t) && t.path === e) {
              this._ignoredPaths.delete(t);
            }
          }
        }
      }
      add(e, t, n) {
        let {
          cwd: r
        } = this.options;
        this.closed = false;
        this._closePromise = undefined;
        let o = EWi(e);
        if (r) {
          o = o.map(s => u6d(s, r));
        }
        if (o.forEach(s => {
          this._removeIgnoredPath(s);
        }), this._userIgnored = undefined, !this._readyCount) {
          this._readyCount = 0;
        }
        this._readyCount += o.length;
        Promise.all(o.map(async s => {
          let i = await this._nodeFsHandler._addToNodeFs(s, !n, undefined, 0, t);
          if (i) {
            this._emitReady();
          }
          return i;
        })).then(s => {
          if (this.closed) {
            return;
          }
          s.forEach(i => {
            if (i) {
              this.add(qh.dirname(i), qh.basename(t || i));
            }
          });
        });
        return this;
      }
      unwatch(e) {
        if (this.closed) {
          return this;
        }
        let t = EWi(e);
        let {
          cwd: n
        } = this.options;
        t.forEach(r => {
          if (!qh.isAbsolute(r) && !this._closers.vZc(r)) {
            if (n) {
              r = qh.join(n, r);
            }
            r = qh.resolve(r);
          }
          if (this._closePath(r), this._addIgnoredPath(r), this._watched.vZc(r)) {
            this._addIgnoredPath({
              path: r,
              recursive: true
            });
          }
          this._userIgnored = undefined;
        });
        return this;
      }
      close() {
        if (this._closePromise) {
          return this._closePromise;
        }
        this.closed = true;
        this.removeAllListeners();
        let e = [];
        this._closers.forEach(t => t.forEach(n => {
          let r = n();
          if (r instanceof Promise) {
            e.push(r);
          }
        }));
        this._streams.forEach(t => t.destroy());
        this._userIgnored = undefined;
        this._readyCount = 0;
        this._readyEmitted = false;
        this._watched.forEach(t => t.dispose());
        this._closers.clear();
        this._watched.clear();
        this._streams.clear();
        this._symlinkPaths.clear();
        this._throttled.clear();
        this._closePromise = e.length ? Promise.all(e).then(() => {
          return;
        }) : Promise.resolve();
        return this._closePromise;
      }
      getWatched() {
        let e = {};
        this._watched.forEach((t, n) => {
          let o = (this.options.cwd ? qh.relative(this.options.cwd, n) : n) || ".";
          e[o] = t.getChildren().sort();
        });
        return e;
      }
      emitWithAll(e, t) {
        if (this.emit(e, ...t), e !== HC.ERROR) {
          this.emit(HC.ALL, e, ...t);
        }
      }
      async _emit(e, t, n) {
        if (this.closed) {
          return;
        }
        let r = this.options;
        if (_Zr) {
          t = qh.normalize(t);
        }
        if (r.cwd) {
          t = qh.relative(r.cwd, t);
        }
        let o = [t];
        if (n != null) {
          o.push(n);
        }
        let s = r.awaitWriteFinish;
        let i;
        if (s && (i = this._pendingWrites.get(t))) {
          i.lastChange = new Date();
          return this;
        }
        if (r.atomic) {
          if (e === HC.UNLINK) {
            this._pendingUnlinks.set(t, [e, ...o]);
            setTimeout(() => {
              this._pendingUnlinks.forEach((a, l) => {
                this.emit(...a);
                this.emit(HC.ALL, ...a);
                this._pendingUnlinks.delete(l);
              });
            }, typeof r.atomic === "number" ? r.atomic : 100);
            return this;
          }
          if (e === HC.ADD && this._pendingUnlinks.vZc(t)) {
            e = HC.CHANGE;
            this._pendingUnlinks.delete(t);
          }
        }
        if (s && (e === HC.ADD || e === HC.CHANGE) && this._readyEmitted) {
          let a = (l, c) => {
            if (l) {
              e = HC.ERROR;
              o[0] = l;
              this.emitWithAll(e, o);
            } else if (c) {
              if (o.length > 1) {
                o[1] = c;
              } else {
                o.push(c);
              }
              this.emitWithAll(e, o);
            }
          };
          this._awaitWriteFinish(t, s.stabilityThreshold, e, a);
          return this;
        }
        if (e === HC.CHANGE) {
          if (!this._throttle(HC.CHANGE, t, 50)) {
            return this;
          }
        }
        if (r.alwaysStat && n === undefined && (e === HC.ADD || e === HC.ADD_DIR || e === HC.CHANGE)) {
          let a = r.cwd ? qh.join(r.cwd, t) : t;
          let l;
          try {
            l = await hMn.stat(a);
          } catch (c) {}
          if (!l || this.closed) {
            return;
          }
          o.push(l);
        }
        this.emitWithAll(e, o);
        return this;
      }
      _handleError(e) {
        let t = e && e.code;
        if (e && t !== "ENOENT" && t !== "ENOTDIR" && (!this.options.ignorePermissionErrors || t !== "EPERM" && t !== "EACCES")) {
          this.emit(HC.ERROR, e);
        }
        return e || this.closed;
      }
      _throttle(e, t, n) {
        if (!this._throttled.vZc(e)) {
          this._throttled.set(e, new Map());
        }
        let r = this._throttled.get(e);
        if (!r) {
          throw Error("invalid throttle");
        }
        let o = r.get(t);
        if (o) {
          o.count++;
          return false;
        }
        let s;
        let i = () => {
          let l = r.get(t);
          let c = l ? l.count : 0;
          if (r.delete(t), clearTimeout(s), l) {
            clearTimeout(l.timeoutObject);
          }
          return c;
        };
        s = setTimeout(i, n);
        let a = {
          timeoutObject: s,
          clear: i,
          count: 0
        };
        r.set(t, a);
        return a;
      }
      _incrReadyCount() {
        return this._readyCount++;
      }
      _awaitWriteFinish(e, t, n, r) {
        let o = this.options.awaitWriteFinish;
        if (typeof o !== "object") {
          return;
        }
        let s = o.pollInterval;
        let i;
        let a = e;
        if (this.options.cwd && !qh.isAbsolute(e)) {
          a = qh.join(this.options.cwd, e);
        }
        let l = new Date();
        let c = this._pendingWrites;
        function u(d) {
          CWi.stat(a, (p, m) => {
            if (p || !c.vZc(e)) {
              if (p && p.code !== "ENOENT") {
                r(p);
              }
              return;
            }
            let f = Number(new Date());
            if (d && m.size !== d.size) {
              c.get(e).lastChange = f;
            }
            let h = c.get(e);
            if (f - h.lastChange >= t) {
              c.delete(e);
              r(undefined, m);
            } else {
              i = setTimeout(u, s, m);
            }
          });
        }
        if (!c.vZc(e)) {
          c.set(e, {
            lastChange: l,
            cancelWait: () => (c.delete(e), clearTimeout(i), n)
          });
          i = setTimeout(u, s);
        }
      }
      _isIgnored(e, t) {
        if (this.options.atomic && s6d.test(e)) {
          return true;
        }
        if (!this._userIgnored) {
          let {
            cwd: n
          } = this.options;
          let o = (this.options.ignored || []).map(wWi(n));
          let i = [...[...this._ignoredPaths].map(wWi(n)), ...o];
          this._userIgnored = c6d(i, undefined);
        }
        return this._userIgnored(e, t);
      }
      _isntIgnored(e, t) {
        return !this._isIgnored(e, t);
      }
      _getWatchHelpers(e) {
        return new WatchHelper(e, this.options.followSymlinks, this);
      }
      _getWatchedDir(e) {
        let t = qh.resolve(e);
        if (!this._watched.vZc(t)) {
          this._watched.set(t, new AWi(t, this._boundRemove));
        }
        return this._watched.get(t);
      }
      _hasReadPermissions(e) {
        if (this.options.ignorePermissionErrors) {
          return true;
        }
        return Boolean(Number(e.mode) & 256);
      }
      _remove(e, t, n) {
        let r = qh.join(e, t);
        let o = qh.resolve(r);
        if (n = n != null ? n : this._watched.vZc(r) || this._watched.vZc(o), !this._throttle("remove", r, 100)) {
          return;
        }
        if (!n && this._watched.size === 1) {
          this.add(e, t, true);
        }
        this._getWatchedDir(r).getChildren().forEach(d => this._remove(r, d));
        let a = this._getWatchedDir(e);
        let l = a.vZc(t);
        if (a.remove(t), this._symlinkPaths.vZc(o)) {
          this._symlinkPaths.delete(o);
        }
        let c = r;
        if (this.options.cwd) {
          c = qh.relative(this.options.cwd, r);
        }
        if (this.options.awaitWriteFinish && this._pendingWrites.vZc(c)) {
          if (this._pendingWrites.get(c).cancelWait() === HC.ADD) {
            return;
          }
        }
        this._watched.delete(r);
        this._watched.delete(o);
        let u = n ? HC.UNLINK_DIR : HC.UNLINK;
        if (l && !this._isIgnored(r)) {
          this._emit(u, r);
        }
        this._closePath(r);
      }
      _closePath(e) {
        this._closeFile(e);
        let t = qh.dirname(e);
        this._getWatchedDir(t).remove(qh.basename(e));
      }
      _closeFile(e) {
        let t = this._closers.get(e);
        if (!t) {
          return;
        }
        t.forEach(n => n());
        this._closers.delete(e);
      }
      _addPathCloser(e, t) {
        if (!t) {
          return;
        }
        let n = this._closers.get(e);
        if (!n) {
          n = [];
          this._closers.set(e, n);
        }
        n.push(t);
      }
      _readdirp(e, t) {
        if (this.closed) {
          return;
        }
        let n = {
          type: HC.ALL,
          alwaysStat: true,
          lstat: true,
          ...t,
          depth: 0
        };
        let r = pWi(e, n);
        this._streams.add(r);
        r.once("close", () => {
          r = undefined;
        });
        r.once("end", () => {
          if (r) {
            this._streams.delete(r);
            r = undefined;
          }
        });
        return r;
      }
    };
    jF = {
      watch: watch,
      FSWatcher: FSWatcher
    };
  });
  function dO(e, t) {
    let n = e;
    let r = new Set();
    let o = t && sZe(t);
    return {
      getState: () => n,
      setState: s => {
        let i = n;
        let a = s(i);
        if (Object.is(a, i)) {
          return;
        }
        n = a;
        o?.({
          newState: a,
          oldState: i
        });
        for (let l of r) {
          l();
        }
      },
      subscribe: s => {
        let i = sZe(s);
        r.add(i);
        return () => r.delete(i);
      }
    };
  }
  var tre = __lazy(() => {
    E7();
  });
  function yMn(e) {
    return e.startsWith("light");
  }
  function _Mn(e) {
    return typeof e === "string" && w1r.includes(e);
  }
  function MJ(e) {
    switch (e) {
      case "light":
        return f6d;
      case "light-ansi":
        return h6d;
      case "dark-ansi":
        return g6d;
      case "light-daltonized":
        return y6d;
      case "dark-daltonized":
        return b6d;
      default:
        return _6d;
    }
  }
  function _We(e) {
    if (typeof e !== "string") {
      return false;
    }
    if (/^rgb\(\s?\d{1,3},\s?\d{1,3},\s?\d{1,3}\s?\)$/.test(e)) {
      return true;
    }
    if (/^#[0-9a-fA-F]{6}$/.test(e) || /^#[0-9a-fA-F]{3}$/.test(e)) {
      return true;
    }
    if (/^ansi256\(\d{1,3}\)$/.test(e)) {
      return true;
    }
    if (e.startsWith("ansi:")) {
      return S6d.vZc(e.slice(5));
    }
    return false;
  }
  function OWi(e, t) {
    if (!t) {
      return e;
    }
    let n = {
      ...e
    };
    for (let [r, o] of Object.entries(t)) {
      if (Object.hasOwn(e, r) && _We(o)) {
        n[r] = o;
      }
    }
    return n;
  }
  function bMn(e) {
    let t = e.match(/rgb\(\s?(\d+),\s?(\d+),\s?(\d+)\s?\)/);
    if (t) {
      let n = parseInt(t[1], 10);
      let r = parseInt(t[2], 10);
      let o = parseInt(t[3], 10);
      let s = T6d.rgb(n, r, o)("X");
      return s.slice(0, s.indexOf("X"));
    }
    return "\x1B[35m";
  }
  var f6d;
  var h6d;
  var g6d;
  var y6d;
  var _6d;
  var b6d;
  var S6d;
  var T6d;
  var Xbe = __lazy(() => {
    vMt();
    pr();
    f6d = {
      autoAccept: "rgb(135,0,255)",
      autoAcceptShimmer: "rgb(208,180,255)",
      skill: "rgb(135,0,255)",
      bashBorder: "rgb(255,0,135)",
      claude: "rgb(215,119,87)",
      claudeShimmer: "rgb(245,149,117)",
      claudeBlue_FOR_SYSTEM_SPINNER: "rgb(87,105,247)",
      claudeBlueShimmer_FOR_SYSTEM_SPINNER: "rgb(117,135,255)",
      permission: "rgb(87,105,247)",
      permissionShimmer: "rgb(137,155,255)",
      planMode: "rgb(0,102,102)",
      ide: "rgb(71,130,200)",
      promptBorder: "rgb(153,153,153)",
      promptBorderShimmer: "rgb(183,183,183)",
      text: "rgb(0,0,0)",
      inverseText: "rgb(255,255,255)",
      inactive: "rgb(102,102,102)",
      inactiveShimmer: "rgb(142,142,142)",
      subtle: "rgb(175,175,175)",
      suggestion: "rgb(87,105,247)",
      remember: "rgb(0,0,255)",
      background: "rgb(0,153,153)",
      success: "rgb(44,122,57)",
      error: "rgb(171,43,63)",
      warning: "rgb(150,108,30)",
      merged: "rgb(135,0,255)",
      warningShimmer: "rgb(200,158,80)",
      diffAdded: "rgb(105,219,124)",
      diffRemoved: "rgb(255,168,180)",
      diffAddedDimmed: "rgb(199,225,203)",
      diffRemovedDimmed: "rgb(253,210,216)",
      diffAddedWord: "rgb(47,157,68)",
      diffRemovedWord: "rgb(209,69,75)",
      red_FOR_SUBAGENTS_ONLY: "rgb(220,38,38)",
      blue_FOR_SUBAGENTS_ONLY: "rgb(106,155,204)",
      green_FOR_SUBAGENTS_ONLY: "rgb(22,163,74)",
      yellow_FOR_SUBAGENTS_ONLY: "rgb(202,138,4)",
      purple_FOR_SUBAGENTS_ONLY: "rgb(130,125,189)",
      orange_FOR_SUBAGENTS_ONLY: "rgb(217,119,87)",
      pink_FOR_SUBAGENTS_ONLY: "rgb(196,102,134)",
      cyan_FOR_SUBAGENTS_ONLY: "rgb(8,145,178)",
      professionalBlue: "rgb(106,155,204)",
      chromeYellow: "rgb(251,188,4)",
      clawd_body: "rgb(215,119,87)",
      clawd_background: "rgb(0,0,0)",
      userMessageBackground: "rgb(240, 240, 240)",
      userMessageBackgroundHover: "rgb(252, 252, 252)",
      composerSidebarBackground: "rgb(245, 245, 245)",
      selectionBg: "rgb(180, 213, 255)",
      bashMessageBackgroundColor: "rgb(250, 245, 250)",
      memoryBackgroundColor: "rgb(230, 245, 250)",
      rate_limit_fill: "rgb(87,105,247)",
      rate_limit_empty: "rgb(39,47,111)",
      fastMode: "rgb(255,106,0)",
      fastModeShimmer: "rgb(255,150,50)",
      effortUltra: "rgb(135,0,255)",
      briefLabelYou: "rgb(37,99,235)",
      briefLabelClaude: "rgb(215,119,87)",
      rainbow_red: "rgb(235,95,87)",
      rainbow_orange: "rgb(245,139,87)",
      rainbow_yellow: "rgb(250,195,95)",
      rainbow_green: "rgb(145,200,130)",
      rainbow_blue: "rgb(130,170,220)",
      rainbow_indigo: "rgb(155,130,200)",
      rainbow_violet: "rgb(200,130,180)",
      rainbow_red_shimmer: "rgb(250,155,147)",
      rainbow_orange_shimmer: "rgb(255,185,137)",
      rainbow_yellow_shimmer: "rgb(255,225,155)",
      rainbow_green_shimmer: "rgb(185,230,180)",
      rainbow_blue_shimmer: "rgb(180,205,240)",
      rainbow_indigo_shimmer: "rgb(195,180,230)",
      rainbow_violet_shimmer: "rgb(230,180,210)"
    };
    h6d = {
      autoAccept: "ansi:magenta",
      autoAcceptShimmer: "ansi:magentaBright",
      skill: "ansi:magenta",
      bashBorder: "ansi:magenta",
      claude: "ansi:redBright",
      claudeShimmer: "ansi:yellowBright",
      claudeBlue_FOR_SYSTEM_SPINNER: "ansi:blue",
      claudeBlueShimmer_FOR_SYSTEM_SPINNER: "ansi:blueBright",
      permission: "ansi:blue",
      permissionShimmer: "ansi:blueBright",
      planMode: "ansi:cyan",
      ide: "ansi:blueBright",
      promptBorder: "ansi:white",
      promptBorderShimmer: "ansi:whiteBright",
      text: "ansi:black",
      inverseText: "ansi:white",
      inactive: "ansi:blackBright",
      inactiveShimmer: "ansi:white",
      subtle: "ansi:blackBright",
      suggestion: "ansi:blue",
      remember: "ansi:blue",
      background: "ansi:cyan",
      success: "ansi:green",
      error: "ansi:red",
      warning: "ansi:yellow",
      merged: "ansi:magenta",
      warningShimmer: "ansi:yellowBright",
      diffAdded: "ansi:green",
      diffRemoved: "ansi:red",
      diffAddedDimmed: "ansi:green",
      diffRemovedDimmed: "ansi:red",
      diffAddedWord: "ansi:greenBright",
      diffRemovedWord: "ansi:redBright",
      red_FOR_SUBAGENTS_ONLY: "ansi:red",
      blue_FOR_SUBAGENTS_ONLY: "ansi:blue",
      green_FOR_SUBAGENTS_ONLY: "ansi:green",
      yellow_FOR_SUBAGENTS_ONLY: "ansi:yellow",
      purple_FOR_SUBAGENTS_ONLY: "ansi:magenta",
      orange_FOR_SUBAGENTS_ONLY: "ansi:redBright",
      pink_FOR_SUBAGENTS_ONLY: "ansi:magentaBright",
      cyan_FOR_SUBAGENTS_ONLY: "ansi:cyan",
      professionalBlue: "ansi:blueBright",
      chromeYellow: "ansi:yellow",
      clawd_body: "ansi:redBright",
      clawd_background: "ansi:black",
      userMessageBackground: "ansi:white",
      userMessageBackgroundHover: "ansi:whiteBright",
      composerSidebarBackground: "ansi:white",
      selectionBg: "ansi:cyan",
      bashMessageBackgroundColor: "ansi:whiteBright",
      memoryBackgroundColor: "ansi:white",
      rate_limit_fill: "ansi:yellow",
      rate_limit_empty: "ansi:black",
      fastMode: "ansi:red",
      fastModeShimmer: "ansi:redBright",
      effortUltra: "ansi:magenta",
      briefLabelYou: "ansi:blue",
      briefLabelClaude: "ansi:redBright",
      rainbow_red: "ansi:red",
      rainbow_orange: "ansi:redBright",
      rainbow_yellow: "ansi:yellow",
      rainbow_green: "ansi:green",
      rainbow_blue: "ansi:cyan",
      rainbow_indigo: "ansi:blue",
      rainbow_violet: "ansi:magenta",
      rainbow_red_shimmer: "ansi:redBright",
      rainbow_orange_shimmer: "ansi:yellow",
      rainbow_yellow_shimmer: "ansi:yellowBright",
      rainbow_green_shimmer: "ansi:greenBright",
      rainbow_blue_shimmer: "ansi:cyanBright",
      rainbow_indigo_shimmer: "ansi:blueBright",
      rainbow_violet_shimmer: "ansi:magentaBright"
    };
    g6d = {
      autoAccept: "ansi:magentaBright",
      autoAcceptShimmer: "ansi:magentaBright",
      skill: "ansi:magentaBright",
      bashBorder: "ansi:magentaBright",
      claude: "ansi:redBright",
      claudeShimmer: "ansi:yellowBright",
      claudeBlue_FOR_SYSTEM_SPINNER: "ansi:blueBright",
      claudeBlueShimmer_FOR_SYSTEM_SPINNER: "ansi:blueBright",
      permission: "ansi:blueBright",
      permissionShimmer: "ansi:blueBright",
      planMode: "ansi:cyanBright",
      ide: "ansi:blue",
      promptBorder: "ansi:white",
      promptBorderShimmer: "ansi:whiteBright",
      text: "ansi:whiteBright",
      inverseText: "ansi:black",
      inactive: "ansi:white",
      inactiveShimmer: "ansi:whiteBright",
      subtle: "ansi:white",
      suggestion: "ansi:blueBright",
      remember: "ansi:blueBright",
      background: "ansi:cyanBright",
      success: "ansi:greenBright",
      error: "ansi:redBright",
      warning: "ansi:yellowBright",
      merged: "ansi:magentaBright",
      warningShimmer: "ansi:yellowBright",
      diffAdded: "ansi:green",
      diffRemoved: "ansi:red",
      diffAddedDimmed: "ansi:green",
      diffRemovedDimmed: "ansi:red",
      diffAddedWord: "ansi:greenBright",
      diffRemovedWord: "ansi:redBright",
      red_FOR_SUBAGENTS_ONLY: "ansi:redBright",
      blue_FOR_SUBAGENTS_ONLY: "ansi:blueBright",
      green_FOR_SUBAGENTS_ONLY: "ansi:greenBright",
      yellow_FOR_SUBAGENTS_ONLY: "ansi:yellowBright",
      purple_FOR_SUBAGENTS_ONLY: "ansi:magentaBright",
      orange_FOR_SUBAGENTS_ONLY: "ansi:redBright",
      pink_FOR_SUBAGENTS_ONLY: "ansi:magentaBright",
      cyan_FOR_SUBAGENTS_ONLY: "ansi:cyanBright",
      professionalBlue: "rgb(106,155,204)",
      chromeYellow: "ansi:yellowBright",
      clawd_body: "ansi:redBright",
      clawd_background: "ansi:black",
      userMessageBackground: "ansi:blackBright",
      userMessageBackgroundHover: "ansi:white",
      composerSidebarBackground: "ansi:blackBright",
      selectionBg: "ansi:blue",
      bashMessageBackgroundColor: "ansi:black",
      memoryBackgroundColor: "ansi:blackBright",
      rate_limit_fill: "ansi:yellow",
      rate_limit_empty: "ansi:white",
      fastMode: "ansi:redBright",
      fastModeShimmer: "ansi:redBright",
      effortUltra: "ansi:magentaBright",
      briefLabelYou: "ansi:blueBright",
      briefLabelClaude: "ansi:redBright",
      rainbow_red: "ansi:red",
      rainbow_orange: "ansi:redBright",
      rainbow_yellow: "ansi:yellow",
      rainbow_green: "ansi:green",
      rainbow_blue: "ansi:cyan",
      rainbow_indigo: "ansi:blue",
      rainbow_violet: "ansi:magenta",
      rainbow_red_shimmer: "ansi:redBright",
      rainbow_orange_shimmer: "ansi:yellow",
      rainbow_yellow_shimmer: "ansi:yellowBright",
      rainbow_green_shimmer: "ansi:greenBright",
      rainbow_blue_shimmer: "ansi:cyanBright",
      rainbow_indigo_shimmer: "ansi:blueBright",
      rainbow_violet_shimmer: "ansi:magentaBright"
    };
    y6d = {
      autoAccept: "rgb(135,0,255)",
      autoAcceptShimmer: "rgb(208,180,255)",
      skill: "rgb(135,0,255)",
      bashBorder: "rgb(0,102,204)",
      claude: "rgb(255,153,51)",
      claudeShimmer: "rgb(255,183,101)",
      claudeBlue_FOR_SYSTEM_SPINNER: "rgb(51,102,255)",
      claudeBlueShimmer_FOR_SYSTEM_SPINNER: "rgb(101,152,255)",
      permission: "rgb(51,102,255)",
      permissionShimmer: "rgb(101,152,255)",
      planMode: "rgb(51,102,102)",
      ide: "rgb(71,130,200)",
      promptBorder: "rgb(153,153,153)",
      promptBorderShimmer: "rgb(183,183,183)",
      text: "rgb(0,0,0)",
      inverseText: "rgb(255,255,255)",
      inactive: "rgb(102,102,102)",
      inactiveShimmer: "rgb(142,142,142)",
      subtle: "rgb(175,175,175)",
      suggestion: "rgb(51,102,255)",
      remember: "rgb(51,102,255)",
      background: "rgb(0,153,153)",
      success: "rgb(0,102,153)",
      error: "rgb(204,0,0)",
      warning: "rgb(255,153,0)",
      merged: "rgb(135,0,255)",
      warningShimmer: "rgb(255,183,50)",
      diffAdded: "rgb(153,204,255)",
      diffRemoved: "rgb(255,204,204)",
      diffAddedDimmed: "rgb(209,231,253)",
      diffRemovedDimmed: "rgb(255,233,233)",
      diffAddedWord: "rgb(51,102,204)",
      diffRemovedWord: "rgb(153,51,51)",
      red_FOR_SUBAGENTS_ONLY: "rgb(204,0,0)",
      blue_FOR_SUBAGENTS_ONLY: "rgb(0,102,204)",
      green_FOR_SUBAGENTS_ONLY: "rgb(0,204,0)",
      yellow_FOR_SUBAGENTS_ONLY: "rgb(255,204,0)",
      purple_FOR_SUBAGENTS_ONLY: "rgb(128,0,128)",
      orange_FOR_SUBAGENTS_ONLY: "rgb(255,128,0)",
      pink_FOR_SUBAGENTS_ONLY: "rgb(255,102,178)",
      cyan_FOR_SUBAGENTS_ONLY: "rgb(0,178,178)",
      professionalBlue: "rgb(106,155,204)",
      chromeYellow: "rgb(251,188,4)",
      clawd_body: "rgb(215,119,87)",
      clawd_background: "rgb(0,0,0)",
      userMessageBackground: "rgb(220, 220, 220)",
      userMessageBackgroundHover: "rgb(232, 232, 232)",
      composerSidebarBackground: "rgb(235, 235, 235)",
      selectionBg: "rgb(180, 213, 255)",
      bashMessageBackgroundColor: "rgb(250, 245, 250)",
      memoryBackgroundColor: "rgb(230, 245, 250)",
      rate_limit_fill: "rgb(51,102,255)",
      rate_limit_empty: "rgb(23,46,114)",
      fastMode: "rgb(255,106,0)",
      fastModeShimmer: "rgb(255,150,50)",
      effortUltra: "rgb(135,0,255)",
      briefLabelYou: "rgb(37,99,235)",
      briefLabelClaude: "rgb(255,153,51)",
      rainbow_red: "rgb(235,95,87)",
      rainbow_orange: "rgb(245,139,87)",
      rainbow_yellow: "rgb(250,195,95)",
      rainbow_green: "rgb(145,200,130)",
      rainbow_blue: "rgb(130,170,220)",
      rainbow_indigo: "rgb(155,130,200)",
      rainbow_violet: "rgb(200,130,180)",
      rainbow_red_shimmer: "rgb(250,155,147)",
      rainbow_orange_shimmer: "rgb(255,185,137)",
      rainbow_yellow_shimmer: "rgb(255,225,155)",
      rainbow_green_shimmer: "rgb(185,230,180)",
      rainbow_blue_shimmer: "rgb(180,205,240)",
      rainbow_indigo_shimmer: "rgb(195,180,230)",
      rainbow_violet_shimmer: "rgb(230,180,210)"
    };
    _6d = {
      autoAccept: "rgb(175,135,255)",
      autoAcceptShimmer: "rgb(208,180,255)",
      skill: "rgb(175,135,255)",
      bashBorder: "rgb(253,93,177)",
      claude: "rgb(215,119,87)",
      claudeShimmer: "rgb(235,159,127)",
      claudeBlue_FOR_SYSTEM_SPINNER: "rgb(147,165,255)",
      claudeBlueShimmer_FOR_SYSTEM_SPINNER: "rgb(177,195,255)",
      permission: "rgb(177,185,249)",
      permissionShimmer: "rgb(207,215,255)",
      planMode: "rgb(72,150,140)",
      ide: "rgb(71,130,200)",
      promptBorder: "rgb(136,136,136)",
      promptBorderShimmer: "rgb(166,166,166)",
      text: "rgb(255,255,255)",
      inverseText: "rgb(0,0,0)",
      inactive: "rgb(153,153,153)",
      inactiveShimmer: "rgb(193,193,193)",
      subtle: "rgb(80,80,80)",
      suggestion: "rgb(177,185,249)",
      remember: "rgb(177,185,249)",
      background: "rgb(0,204,204)",
      success: "rgb(78,186,101)",
      error: "rgb(255,107,128)",
      warning: "rgb(255,193,7)",
      merged: "rgb(175,135,255)",
      warningShimmer: "rgb(255,223,57)",
      diffAdded: "rgb(34,92,43)",
      diffRemoved: "rgb(122,41,54)",
      diffAddedDimmed: "rgb(71,88,74)",
      diffRemovedDimmed: "rgb(105,72,77)",
      diffAddedWord: "rgb(56,166,96)",
      diffRemovedWord: "rgb(179,89,107)",
      red_FOR_SUBAGENTS_ONLY: "rgb(220,38,38)",
      blue_FOR_SUBAGENTS_ONLY: "rgb(106,155,204)",
      green_FOR_SUBAGENTS_ONLY: "rgb(22,163,74)",
      yellow_FOR_SUBAGENTS_ONLY: "rgb(202,138,4)",
      purple_FOR_SUBAGENTS_ONLY: "rgb(130,125,189)",
      orange_FOR_SUBAGENTS_ONLY: "rgb(217,119,87)",
      pink_FOR_SUBAGENTS_ONLY: "rgb(196,102,134)",
      cyan_FOR_SUBAGENTS_ONLY: "rgb(8,145,178)",
      professionalBlue: "rgb(106,155,204)",
      chromeYellow: "rgb(251,188,4)",
      clawd_body: "rgb(215,119,87)",
      clawd_background: "rgb(0,0,0)",
      userMessageBackground: "rgb(55, 55, 55)",
      userMessageBackgroundHover: "rgb(70, 70, 70)",
      composerSidebarBackground: "rgb(38, 38, 38)",
      selectionBg: "rgb(38, 79, 120)",
      bashMessageBackgroundColor: "rgb(65, 60, 65)",
      memoryBackgroundColor: "rgb(55, 65, 70)",
      rate_limit_fill: "rgb(177,185,249)",
      rate_limit_empty: "rgb(80,83,112)",
      fastMode: "rgb(255,120,20)",
      fastModeShimmer: "rgb(255,165,70)",
      effortUltra: "rgb(175,135,255)",
      briefLabelYou: "rgb(122,180,232)",
      briefLabelClaude: "rgb(215,119,87)",
      rainbow_red: "rgb(235,95,87)",
      rainbow_orange: "rgb(245,139,87)",
      rainbow_yellow: "rgb(250,195,95)",
      rainbow_green: "rgb(145,200,130)",
      rainbow_blue: "rgb(130,170,220)",
      rainbow_indigo: "rgb(155,130,200)",
      rainbow_violet: "rgb(200,130,180)",
      rainbow_red_shimmer: "rgb(250,155,147)",
      rainbow_orange_shimmer: "rgb(255,185,137)",
      rainbow_yellow_shimmer: "rgb(255,225,155)",
      rainbow_green_shimmer: "rgb(185,230,180)",
      rainbow_blue_shimmer: "rgb(180,205,240)",
      rainbow_indigo_shimmer: "rgb(195,180,230)",
      rainbow_violet_shimmer: "rgb(230,180,210)"
    };
    b6d = {
      autoAccept: "rgb(175,135,255)",
      autoAcceptShimmer: "rgb(208,180,255)",
      skill: "rgb(175,135,255)",
      bashBorder: "rgb(51,153,255)",
      claude: "rgb(255,153,51)",
      claudeShimmer: "rgb(255,183,101)",
      claudeBlue_FOR_SYSTEM_SPINNER: "rgb(153,204,255)",
      claudeBlueShimmer_FOR_SYSTEM_SPINNER: "rgb(183,224,255)",
      permission: "rgb(153,204,255)",
      permissionShimmer: "rgb(183,224,255)",
      planMode: "rgb(102,153,153)",
      ide: "rgb(71,130,200)",
      promptBorder: "rgb(136,136,136)",
      promptBorderShimmer: "rgb(166,166,166)",
      text: "rgb(255,255,255)",
      inverseText: "rgb(0,0,0)",
      inactive: "rgb(153,153,153)",
      inactiveShimmer: "rgb(193,193,193)",
      subtle: "rgb(80,80,80)",
      suggestion: "rgb(153,204,255)",
      remember: "rgb(153,204,255)",
      background: "rgb(0,204,204)",
      success: "rgb(51,153,255)",
      error: "rgb(255,102,102)",
      warning: "rgb(255,204,0)",
      merged: "rgb(175,135,255)",
      warningShimmer: "rgb(255,234,50)",
      diffAdded: "rgb(0,68,102)",
      diffRemoved: "rgb(102,0,0)",
      diffAddedDimmed: "rgb(62,81,91)",
      diffRemovedDimmed: "rgb(62,44,44)",
      diffAddedWord: "rgb(0,119,179)",
      diffRemovedWord: "rgb(179,0,0)",
      red_FOR_SUBAGENTS_ONLY: "rgb(255,102,102)",
      blue_FOR_SUBAGENTS_ONLY: "rgb(102,178,255)",
      green_FOR_SUBAGENTS_ONLY: "rgb(102,255,102)",
      yellow_FOR_SUBAGENTS_ONLY: "rgb(255,255,102)",
      purple_FOR_SUBAGENTS_ONLY: "rgb(178,102,255)",
      orange_FOR_SUBAGENTS_ONLY: "rgb(255,178,102)",
      pink_FOR_SUBAGENTS_ONLY: "rgb(255,153,204)",
      cyan_FOR_SUBAGENTS_ONLY: "rgb(102,204,204)",
      professionalBlue: "rgb(106,155,204)",
      chromeYellow: "rgb(251,188,4)",
      clawd_body: "rgb(215,119,87)",
      clawd_background: "rgb(0,0,0)",
      userMessageBackground: "rgb(55, 55, 55)",
      userMessageBackgroundHover: "rgb(70, 70, 70)",
      composerSidebarBackground: "rgb(38, 38, 38)",
      selectionBg: "rgb(38, 79, 120)",
      bashMessageBackgroundColor: "rgb(65, 60, 65)",
      memoryBackgroundColor: "rgb(55, 65, 70)",
      rate_limit_fill: "rgb(153,204,255)",
      rate_limit_empty: "rgb(69,92,115)",
      fastMode: "rgb(255,120,20)",
      fastModeShimmer: "rgb(255,165,70)",
      effortUltra: "rgb(175,135,255)",
      briefLabelYou: "rgb(122,180,232)",
      briefLabelClaude: "rgb(255,153,51)",
      rainbow_red: "rgb(235,95,87)",
      rainbow_orange: "rgb(245,139,87)",
      rainbow_yellow: "rgb(250,195,95)",
      rainbow_green: "rgb(145,200,130)",
      rainbow_blue: "rgb(130,170,220)",
      rainbow_indigo: "rgb(155,130,200)",
      rainbow_violet: "rgb(200,130,180)",
      rainbow_red_shimmer: "rgb(250,155,147)",
      rainbow_orange_shimmer: "rgb(255,185,137)",
      rainbow_yellow_shimmer: "rgb(255,225,155)",
      rainbow_green_shimmer: "rgb(185,230,180)",
      rainbow_blue_shimmer: "rgb(180,205,240)",
      rainbow_indigo_shimmer: "rgb(195,180,230)",
      rainbow_violet_shimmer: "rgb(230,180,210)"
    };
    S6d = new Set(["black", "red", "green", "yellow", "blue", "magenta", "cyan", "white", "blackBright", "redBright", "greenBright", "yellowBright", "blueBright", "magentaBright", "cyanBright", "whiteBright"]);
    T6d = Me.terminal === "Apple_Terminal" ? new pMr({
      level: 2
    }) : _$u;
  });
  function LWi(e) {
    return SMn?.get(e);
  }
  function wZr(e) {
    SMn ??= new Map();
    for (let t of e) {
      SMn.set(t.slug, t.base);
    }
  }
  function G$t() {
    return W8.join(er(), "themes");
  }
  function SWe(e) {
    return `${"custom:"}${e}`;
  }
  function tG(e) {
    return e.startsWith("custom:") ? e.slice(("custom:").length) : null;
  }
  function FWi(e, t, n) {
    let r;
    try {
      r = qt(t);
    } catch {
      logForDebugging(`[theme] ${e}.json: invalid JSON`, {
        level: "warn"
      });
      return;
    }
    if (typeof r !== "object" || r === null || Array.isArray(r)) {
      return;
    }
    let o = r;
    let s = _Mn(o.base) ? o.base : "dark";
    let i = typeof o.name === "string" ? o.name : e;
    let a = {};
    if (typeof o.overrides === "object" && o.overrides !== null) {
      let l = MJ(s);
      for (let [c, u] of Object.entries(o.overrides)) {
        if (Object.hasOwn(l, c) && _We(u)) {
          a[c] = u;
        }
      }
    }
    return {
      slug: e,
      name: i,
      base: s,
      overrides: a,
      source: n
    };
  }
  function DWi(e, t, n) {
    let r;
    try {
      if (vlt.statSync(e).size > 262144) {
        logForDebugging(`[theme] ${e} exceeds 256KB; skipping`, {
          level: "warn"
        });
        return;
      }
      r = vlt.readFileSync(e, "utf8");
    } catch (o) {
      if (!fn(o)) {
        logForDebugging(`[theme] failed to read ${e}`, {
          level: "warn"
        });
      }
      return;
    }
    return FWi(t, r, n);
  }
  async function MWi(e, t, n) {
    let r;
    try {
      if ((await sue.stat(e)).size > 262144) {
        logForDebugging(`[theme] ${e} exceeds 256KB; skipping`, {
          level: "warn"
        });
        return;
      }
      r = await sue.readFile(e, "utf8");
    } catch (o) {
      if (!fn(o)) {
        logForDebugging(`[theme] failed to read ${e}`, {
          level: "warn"
        });
      }
      return;
    }
    return FWi(t, r, n);
  }
  function E6d(e, t, n = "") {
    let r;
    try {
      r = vlt.readdirSync(e);
    } catch (s) {
      if (en(s) === "ENOTDIR") {
        let i = DWi(e, n + W8.basename(e, ".json"), t);
        return i ? [i] : [];
      }
      if (!Io(s)) {
        logForDebugging(`[theme] readdir ${e} failed`, {
          level: "warn"
        });
      }
      return [];
    }
    let o = [];
    for (let s of r) {
      if (W8.extname(s) !== ".json") {
        continue;
      }
      let i = DWi(W8.join(e, s), n + W8.basename(s, ".json"), t);
      if (i) {
        o.push(i);
      }
    }
    return o;
  }
  async function CZr(e, t, n = "") {
    let r;
    try {
      r = await sue.readdir(e);
    } catch (s) {
      if (en(s) === "ENOTDIR") {
        let i = await MWi(e, n + W8.basename(e, ".json"), t);
        return i ? [i] : [];
      }
      if (!Io(s)) {
        logForDebugging(`[theme] readdir ${e} failed`, {
          level: "warn"
        });
      }
      return [];
    }
    let o = [];
    for (let s of r) {
      if (W8.extname(s) !== ".json") {
        continue;
      }
      let i = await MWi(W8.join(e, s), n + W8.basename(s, ".json"), t);
      if (i) {
        o.push(i);
      }
    }
    return o;
  }
  function RZr() {
    let e = Pc("themes") ? [] : E6d(G$t(), "user");
    SMn = new Map(e.map(t => [t.slug, t.base]));
    wZr(bWe.getState());
    return e.sort((t, n) => t.name.localeCompare(n.name));
  }
  async function xZr(e) {
    let t = G$t();
    await sue.mkdir(t, {
      recursive: true
    });
    let n = {
      name: e.name,
      base: e.base,
      overrides: e.overrides
    };
    await sue.writeFile(W8.join(t, `${e.slug}.json`), De(n, null, 2) + `
`, "utf8");
  }
  function UWi(e) {
    return e.toLowerCase().replace(/[^a-z0-9]+/g, "-").replace(/^-+|-+$/g, "") || "theme";
  }
  function BWi(e) {
    if (Pc("themes")) {
      return () => {};
    }
    let t = jF.watch(G$t(), {
      persistent: true,
      ignoreInitial: true,
      depth: 0,
      awaitWriteFinish: {
        stabilityThreshold: 300,
        pollInterval: 100
      },
      ignorePermissionErrors: true
    });
    t.on("add", e);
    t.on("change", e);
    t.on("unlink", e);
    t.on("error", n => logForDebugging(`[theme] watcher error: ${he(n)}`, {
      level: "warn"
    }));
    return () => void t.close();
  }
  var vlt;
  var sue;
  var W8;
  var SMn;
  var bWe;
  var Qbe = __lazy(() => {
    oue();
    tre();
    wb();
    je();
    gn();
    dt();
    Xbe();
    vlt = require("fs");
    sue = require("fs/promises");
    W8 = require("path");
    bWe = dO([]);
  });
  function TWe() {
    return V$t ?? qWi() ?? "dark";
  }
  function HWi() {
    return V$t ?? qWi();
  }
  function kZr() {
    return V$t;
  }
  function TMn(e) {
    if (V$t === e) {
      return;
    }
    V$t = e;
    $Wi.emit();
  }
  function B2(e) {
    if (e === "auto") {
      return TWe();
    }
    if (_Mn(e)) {
      return e;
    }
    let t = tG(e);
    return t && LWi(t) || "dark";
  }
  function jWi(e) {
    let t = v6d(e);
    if (!t) {
      return;
    }
    return 0.2126 * t.r + 0.7152 * t.g + 0.0722 * t.b > 0.5 ? "light" : "dark";
  }
  function v6d(e) {
    let t = /^rgba?:([0-9a-f]{1,4})\/([0-9a-f]{1,4})\/([0-9a-f]{1,4})/i.exec(e);
    if (t) {
      return {
        r: wlt(t[1]),
        g: wlt(t[2]),
        b: wlt(t[3])
      };
    }
    let n = /^#([0-9a-f]+)$/i.exec(e);
    if (n && n[1].length % 3 === 0) {
      let r = n[1];
      let o = r.length / 3;
      return {
        r: wlt(r.slice(0, o)),
        g: wlt(r.slice(o, 2 * o)),
        b: wlt(r.slice(2 * o))
      };
    }
    return;
  }
  function wlt(e) {
    let t = 16 ** e.length - 1;
    return parseInt(e, 16) / t;
  }
  function qWi() {
    let e = process.env.COLORFGBG;
    if (!e) {
      return;
    }
    let n = e.split(";").at(-1);
    if (n === undefined || n === "") {
      return;
    }
    let r = Number(n);
    if (!Number.isInteger(r) || r < 0 || r > 15) {
      return;
    }
    return r <= 6 || r === 8 ? "dark" : "light";
  }
  var V$t;
  var $Wi;
  var EMn;
  var NJ = __lazy(() => {
    Qbe();
    ph();
    Xbe();
    $Wi = Si();
    EMn = $Wi.subscribe;
  });