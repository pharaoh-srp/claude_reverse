  var jvs = __commonJS((t_h, Hvs) => {
    Hvs.exports = function (e, t) {
      Object.keys(t).forEach(function (n) {
        e[n] = e[n] || t[n];
      });
      return e;
    };
  });
  var Gvs = __commonJS((n_h, Wvs) => {
    var rDr = XTs();
    var e0u = require("util");
    var eDr = require("path");
    var t0u = require("http");
    var n0u = require("https");
    var r0u = require("url").parse;
    var o0u = require("fs");
    var s0u = require("stream").Stream;
    var i0u = require("crypto");
    var tDr = ZTs();
    var a0u = gEs();
    var l0u = Uvs();
    var ake = $vs();
    var nDr = jvs();
    function qvs(e) {
      return String(e).replace(/\r/g, "%0D").replace(/\n/g, "%0A").replace(/"/g, "%22");
    }
    function vy(e) {
      if (!(this instanceof vy)) {
        return new vy(e);
      }
      this._overheadLength = 0;
      this._valueLength = 0;
      this._valuesToMeasure = [];
      rDr.call(this);
      e = e || {};
      for (var t in e) {
        this[t] = e[t];
      }
    }
    e0u.inherits(vy, rDr);
    vy.LINE_BREAK = `\r
`;
    vy.DEFAULT_CONTENT_TYPE = "application/octet-stream";
    vy.prototype.append = function (e, t, n) {
      if (n = n || {}, typeof n === "string") {
        n = {
          filename: n
        };
      }
      var r = rDr.prototype.append.bind(this);
      if (typeof t === "number" || t == null) {
        t = String(t);
      }
      if (Array.isArray(t)) {
        this._error(Error("Arrays are not supported."));
        return;
      }
      var o = this._multiPartHeader(e, t, n);
      var s = this._multiPartFooter();
      r(o);
      r(t);
      r(s);
      this._trackLength(o, t, n);
    };
    vy.prototype._trackLength = function (e, t, n) {
      var r = 0;
      if (n.knownLength != null) {
        r += Number(n.knownLength);
      } else if (Buffer.isBuffer(t)) {
        r = t.length;
      } else if (typeof t === "string") {
        r = Buffer.byteLength(t);
      }
      if (this._valueLength += r, this._overheadLength += Buffer.byteLength(e) + vy.LINE_BREAK.length, !t || !t.path && !(t.readable && ake(t, "httpVersion")) && !(t instanceof s0u)) {
        return;
      }
      if (!n.knownLength) {
        this._valuesToMeasure.push(t);
      }
    };
    vy.prototype._lengthRetriever = function (e, t) {
      if (ake(e, "fd")) {
        if (e.end != null && e.end != 1 / 0 && e.start != null) {
          t(null, e.end + 1 - (e.start ? e.start : 0));
        } else {
          o0u.stat(e.path, function (n, r) {
            if (n) {
              t(n);
              return;
            }
            var o = r.size - (e.start ? e.start : 0);
            t(null, o);
          });
        }
      } else if (ake(e, "httpVersion")) {
        t(null, Number(e.headers["content-length"]));
      } else if (ake(e, "httpModule")) {
        e.on("response", function (n) {
          e.pause();
          t(null, Number(n.headers["content-length"]));
        });
        e.resume();
      } else {
        t("Unknown stream");
      }
    };
    vy.prototype._multiPartHeader = function (e, t, n) {
      if (typeof n.header === "string") {
        return n.header;
      }
      var r = this._getContentDisposition(t, n);
      var o = this._getContentType(t, n);
      var s = "";
      var i = {
        "Content-Disposition": ["form-data", 'name="' + qvs(e) + '"'].concat(r || []),
        "Content-Type": [].concat(o || [])
      };
      if (typeof n.header === "object") {
        nDr(i, n.header);
      }
      var a;
      for (var l in i) {
        if (ake(i, l)) {
          if (a = i[l], a == null) {
            continue;
          }
          if (!Array.isArray(a)) {
            a = [a];
          }
          if (a.length) {
            s += l + ": " + a.join("; ") + vy.LINE_BREAK;
          }
        }
      }
      return "--" + this.getBoundary() + vy.LINE_BREAK + s + vy.LINE_BREAK;
    };
    vy.prototype._getContentDisposition = function (e, t) {
      var n;
      if (typeof t.filepath === "string") {
        n = eDr.normalize(t.filepath).replace(/\\/g, "/");
      } else if (t.filename || e && (e.name || e.path)) {
        n = eDr.basename(t.filename || e && (e.name || e.path));
      } else if (e && e.readable && ake(e, "httpVersion")) {
        n = eDr.basename(e.client._httpMessage.path || "");
      }
      if (n) {
        return 'filename="' + qvs(n) + '"';
      }
    };
    vy.prototype._getContentType = function (e, t) {
      var n = t.contentType;
      if (!n && e && e.name) {
        n = tDr.lookup(e.name);
      }
      if (!n && e && e.path) {
        n = tDr.lookup(e.path);
      }
      if (!n && e && e.readable && ake(e, "httpVersion")) {
        n = e.headers["content-type"];
      }
      if (!n && (t.filepath || t.filename)) {
        n = tDr.lookup(t.filepath || t.filename);
      }
      if (!n && e && typeof e === "object") {
        n = vy.DEFAULT_CONTENT_TYPE;
      }
      return n;
    };
    vy.prototype._multiPartFooter = function () {
      return function (e) {
        var t = vy.LINE_BREAK;
        var n = this._streams.length === 0;
        if (n) {
          t += this._lastBoundary();
        }
        e(t);
      }.bind(this);
    };
    vy.prototype._lastBoundary = function () {
      return "--" + this.getBoundary() + "--" + vy.LINE_BREAK;
    };
    vy.prototype.getHeaders = function (e) {
      var t;
      var n = {
        "content-type": "multipart/form-data; boundary=" + this.getBoundary()
      };
      for (t in e) {
        if (ake(e, t)) {
          n[t.toLowerCase()] = e[t];
        }
      }
      return n;
    };
    vy.prototype.setBoundary = function (e) {
      if (typeof e !== "string") {
        throw TypeError("FormData boundary must be a string");
      }
      this._boundary = e;
    };
    vy.prototype.getBoundary = function () {
      if (!this._boundary) {
        this._generateBoundary();
      }
      return this._boundary;
    };
    vy.prototype.getBuffer = function () {
      var e = new Buffer.alloc(0);
      var t = this.getBoundary();
      for (var n = 0, r = this._streams.length; n < r; n++) {
        if (typeof this._streams[n] !== "function") {
          if (Buffer.isBuffer(this._streams[n])) {
            e = Buffer.concat([e, this._streams[n]]);
          } else {
            e = Buffer.concat([e, Buffer.from(this._streams[n])]);
          }
          if (typeof this._streams[n] !== "string" || this._streams[n].substring(2, t.length + 2) !== t) {
            e = Buffer.concat([e, Buffer.from(vy.LINE_BREAK)]);
          }
        }
      }
      return Buffer.concat([e, Buffer.from(this._lastBoundary())]);
    };
    vy.prototype._generateBoundary = function () {
      this._boundary = "--------------------------" + i0u.randomBytes(12).toString("hex");
    };
    vy.prototype.getLengthSync = function () {
      var e = this._overheadLength + this._valueLength;
      if (this._streams.length) {
        e += this._lastBoundary().length;
      }
      if (!this.hasKnownLength()) {
        this._error(Error("Cannot calculate proper length in synchronous way."));
      }
      return e;
    };
    vy.prototype.hasKnownLength = function () {
      var e = true;
      if (this._valuesToMeasure.length) {
        e = false;
      }
      return e;
    };
    vy.prototype.getLength = function (e) {
      var t = this._overheadLength + this._valueLength;
      if (this._streams.length) {
        t += this._lastBoundary().length;
      }
      if (!this._valuesToMeasure.length) {
        process.nextTick(e.bind(this, null, t));
        return;
      }
      a0u.parallel(this._valuesToMeasure, this._lengthRetriever, function (n, r) {
        if (n) {
          e(n);
          return;
        }
        r.forEach(function (o) {
          t += o;
        });
        e(null, t);
      });
    };
    vy.prototype.submit = function (e, t) {
      var n;
      var r;
      var o = {
        method: "post"
      };
      if (typeof e === "string") {
        e = r0u(e);
        r = nDr({
          port: e.port,
          path: e.pathname,
          host: e.hostname,
          protocol: e.protocol
        }, o);
      } else if (r = nDr(e, o), !r.port) {
        r.port = r.protocol === "https:" ? 443 : 80;
      }
      if (r.headers = this.getHeaders(e.headers), r.protocol === "https:") {
        n = n0u.request(r);
      } else {
        n = t0u.request(r);
      }
      this.getLength(function (s, i) {
        if (s && s !== "Unknown stream") {
          this._error(s);
          return;
        }
        if (i) {
          n.setHeader("Content-Length", i);
        }
        if (this.pipe(n), t) {
          var a;
          var l = function (c, u) {
            n.removeListener("error", l);
            n.removeListener("response", a);
            return t.call(this, c, u);
          };
          a = l.bind(this, null);
          n.on("error", l);
          n.on("response", a);
        }
      }.bind(this));
      return n;
    };
    vy.prototype._error = function (e) {
      if (!this.error) {
        this.error = e;
        this.pause();
        this.emit("error", e);
      }
    };
    vy.prototype.toString = function () {
      return "[object FormData]";
    };
    l0u(vy.prototype, "FormData");
    Wvs.exports = vy;
  });