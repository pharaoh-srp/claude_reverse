  var zTs = __commonJS((syh, VTs) => {
    var GTs = require("stream").Stream;
    var Aku = require("util");
    VTs.exports = Ote;
    function Ote() {
      this.source = null;
      this.dataSize = 0;
      this.maxDataSize = 1048576;
      this.pauseStream = true;
      this._maxDataSizeExceeded = false;
      this._released = false;
      this._bufferedEvents = [];
    }
    Aku.inherits(Ote, GTs);
    Ote.create = function (e, t) {
      var n = new this();
      t = t || {};
      for (var r in t) {
        n[r] = t[r];
      }
      n.source = e;
      var o = e.emit;
      if (e.emit = function () {
        n._handleEmit(arguments);
        return o.apply(e, arguments);
      }, e.on("error", function () {}), n.pauseStream) {
        e.pause();
      }
      return n;
    };
    Object.defineProperty(Ote.prototype, "readable", {
      configurable: true,
      enumerable: true,
      get: function () {
        return this.source.readable;
      }
    });
    Ote.prototype.setEncoding = function () {
      return this.source.setEncoding.apply(this.source, arguments);
    };
    Ote.prototype.resume = function () {
      if (!this._released) {
        this.release();
      }
      this.source.resume();
    };
    Ote.prototype.pause = function () {
      this.source.pause();
    };
    Ote.prototype.release = function () {
      this._released = true;
      this._bufferedEvents.forEach(function (e) {
        this.emit.apply(this, e);
      }.bind(this));
      this._bufferedEvents = [];
    };
    Ote.prototype.pipe = function () {
      var e = GTs.prototype.pipe.apply(this, arguments);
      this.resume();
      return e;
    };
    Ote.prototype._handleEmit = function (e) {
      if (this._released) {
        this.emit.apply(this, e);
        return;
      }
      if (e[0] === "data") {
        this.dataSize += e[1].length;
        this._checkIfMaxDataSizeExceeded();
      }
      this._bufferedEvents.push(e);
    };
    Ote.prototype._checkIfMaxDataSizeExceeded = function () {
      if (this._maxDataSizeExceeded) {
        return;
      }
      if (this.dataSize <= this.maxDataSize) {
        return;
      }
      this._maxDataSizeExceeded = true;
      var e = "DelayedStream#maxDataSize of " + this.maxDataSize + " bytes exceeded.";
      this.emit("error", Error(e));
    };
  });
  var XTs = __commonJS((iyh, JTs) => {
    var Iku = require("util");
    var YTs = require("stream").Stream;
    var KTs = zTs();
    JTs.exports = BA;
    function BA() {
      this.writable = false;
      this.readable = true;
      this.dataSize = 0;
      this.maxDataSize = 2097152;
      this.pauseStreams = true;
      this._released = false;
      this._streams = [];
      this._currentStream = null;
      this._insideLoop = false;
      this._pendingNext = false;
    }
    Iku.inherits(BA, YTs);
    BA.create = function (e) {
      var t = new this();
      e = e || {};
      for (var n in e) {
        t[n] = e[n];
      }
      return t;
    };
    BA.isStreamLike = function (e) {
      return typeof e !== "function" && typeof e !== "string" && typeof e !== "boolean" && typeof e !== "number" && !Buffer.isBuffer(e);
    };
    BA.prototype.append = function (e) {
      var t = BA.isStreamLike(e);
      if (t) {
        if (!(e instanceof KTs)) {
          var n = KTs.create(e, {
            maxDataSize: 1 / 0,
            pauseStream: this.pauseStreams
          });
          e.on("data", this._checkDataSize.bind(this));
          e = n;
        }
        if (this._handleErrors(e), this.pauseStreams) {
          e.pause();
        }
      }
      this._streams.push(e);
      return this;
    };
    BA.prototype.pipe = function (e, t) {
      YTs.prototype.pipe.call(this, e, t);
      this.resume();
      return e;
    };
    BA.prototype._getNext = function () {
      if (this._currentStream = null, this._insideLoop) {
        this._pendingNext = true;
        return;
      }
      this._insideLoop = true;
      try {
        do {
          this._pendingNext = false;
          this._realGetNext();
        } while (this._pendingNext);
      } finally {
        this._insideLoop = false;
      }
    };
    BA.prototype._realGetNext = function () {
      var e = this._streams.shift();
      if (typeof e > "u") {
        this.end();
        return;
      }
      if (typeof e !== "function") {
        this._pipeNext(e);
        return;
      }
      var t = e;
      t(function (n) {
        var r = BA.isStreamLike(n);
        if (r) {
          n.on("data", this._checkDataSize.bind(this));
          this._handleErrors(n);
        }
        this._pipeNext(n);
      }.bind(this));
    };
    BA.prototype._pipeNext = function (e) {
      this._currentStream = e;
      var t = BA.isStreamLike(e);
      if (t) {
        e.on("end", this._getNext.bind(this));
        e.pipe(this, {
          end: false
        });
        return;
      }
      var n = e;
      this.write(n);
      this._getNext();
    };
    BA.prototype._handleErrors = function (e) {
      var t = this;
      e.on("error", function (n) {
        t._emitError(n);
      });
    };
    BA.prototype.write = function (e) {
      this.emit("data", e);
    };
    BA.prototype.pause = function () {
      if (!this.pauseStreams) {
        return;
      }
      if (this.pauseStreams && this._currentStream && typeof this._currentStream.pause == "function") {
        this._currentStream.pause();
      }
      this.emit("pause");
    };
    BA.prototype.resume = function () {
      if (!this._released) {
        this._released = true;
        this.writable = true;
        this._getNext();
      }
      if (this.pauseStreams && this._currentStream && typeof this._currentStream.resume == "function") {
        this._currentStream.resume();
      }
      this.emit("resume");
    };
    BA.prototype.end = function () {
      this._reset();
      this.emit("end");
    };
    BA.prototype.destroy = function () {
      this._reset();
      this.emit("close");
    };
    BA.prototype._reset = function () {
      this.writable = false;
      this._streams = [];
      this._currentStream = null;
    };
    BA.prototype._checkDataSize = function () {
      if (this._updateDataSize(), this.dataSize <= this.maxDataSize) {
        return;
      }
      var e = "DelayedStream#maxDataSize of " + this.maxDataSize + " bytes exceeded.";
      this._emitError(Error(e));
    };
    BA.prototype._updateDataSize = function () {
      this.dataSize = 0;
      var e = this;
      if (this._streams.forEach(function (t) {
        if (!t.dataSize) {
          return;
        }
        e.dataSize += t.dataSize;
      }), this._currentStream && this._currentStream.dataSize) {
        this.dataSize += this._currentStream.dataSize;
      }
    };
    BA.prototype._emitError = function (e) {
      this._reset();
      this.emit("error", e);
    };
  });
  var ZTs = __commonJS((ayh, QTs) => {
    var iDt = e => () => {
      throw Error("mime-types." + e + "() is stubbed in this build. Do not rely on axios auto-multipart serialization (plain object + Content-Type: multipart/form-data). Use native FormData or hand-roll the multipart body instead. See scripts/build-with-plugins.ts stubMimeTypes plugin.");
    };
    QTs.exports = {
      lookup: iDt("lookup"),
      contentType: iDt("contentType"),
      extension: iDt("extension"),
      charset: iDt("charset"),
      extensions: Object.create(null),
      types: Object.create(null),
      charsets: {
        lookup: iDt("charsets.lookup")
      }
    };
  });
  var tEs = __commonJS((lyh, eEs) => {
    eEs.exports = Pku;
    function Pku(e) {
      var t = typeof setImmediate == "function" ? setImmediate : typeof process == "object" && typeof process.nextTick == "function" ? process.nextTick : null;
      if (t) {
        t(e);
      } else {
        setTimeout(e, 0);
      }
    }
  });
  var FOr = __commonJS((cyh, rEs) => {
    var nEs = tEs();
    rEs.exports = Oku;
    function Oku(e) {
      var t = false;
      nEs(function () {
        t = true;
      });
      return function (r, o) {
        if (t) {
          e(r, o);
        } else {
          nEs(function () {
            e(r, o);
          });
        }
      };
    }
  });
  var UOr = __commonJS((uyh, oEs) => {
    oEs.exports = Dku;
    function Dku(e) {
      Object.keys(e.jobs).forEach(Mku.bind(e));
      e.jobs = {};
    }
    function Mku(e) {
      if (typeof this.jobs[e] == "function") {
        this.jobs[e]();
      }
    }
  });
  var BOr = __commonJS((dyh, iEs) => {
    var sEs = FOr();
    var Nku = UOr();
    iEs.exports = Lku;
    function Lku(e, t, n, r) {
      var o = n.keyedList ? n.keyedList[n.index] : n.index;
      n.jobs[o] = Fku(t, o, e[o], function (s, i) {
        if (!(o in n.jobs)) {
          return;
        }
        if (delete n.jobs[o], s) {
          Nku(n);
        } else {
          n.results[o] = i;
        }
        r(s, n.results);
      });
    }
    function Fku(e, t, n, r) {
      var o;
      if (e.length == 2) {
        o = e(n, sEs(r));
      } else {
        o = e(n, t, sEs(r));
      }
      return o;
    }
  });