  var kws = __commonJS((lbh, xws) => {
    var gDt;
    xws.exports = function () {
      if (!gDt) {
        try {
          gDt = $tt()("follow-redirects");
        } catch (e) {}
        if (typeof gDt !== "function") {
          gDt = function () {};
        }
      }
      gDt.apply(null, arguments);
    };
  });
  var Dws = __commonJS((cbh, MDr) => {
    var _Dt = require("url");
    var yDt = _Dt.URL;
    var tIu = require("http");
    var nIu = require("https");
    var xDr = require("stream").Writable;
    var kDr = require("assert");
    var Aws = kws();
    (function () {
      var t = typeof process < "u";
      var n = typeof window < "u" && typeof document < "u";
      var r = HHe(Error.captureStackTrace);
      if (!t && (n || !r)) {
        console.warn("The follow-redirects package should be excluded from browser builds.");
      }
    })();
    var ADr = false;
    try {
      kDr(new yDt(""));
    } catch (e) {
      ADr = e.code === "ERR_INVALID_URL";
    }
    var rIu = ["Authorization", "Proxy-Authorization", "Cookie"];
    var oIu = ["auth", "host", "hostname", "href", "path", "pathname", "port", "protocol", "query", "search", "hash"];
    var IDr = ["abort", "aborted", "connect", "error", "socket", "timeout"];
    var PDr = Object.create(null);
    IDr.forEach(function (e) {
      PDr[e] = function (t, n, r) {
        this._redirectable.emit(e, t, n, r);
      };
    });
    var wDr = bDt("ERR_INVALID_URL", "Invalid URL", TypeError);
    var CDr = bDt("ERR_FR_REDIRECTION_FAILURE", "Redirected request failed");
    var sIu = bDt("ERR_FR_TOO_MANY_REDIRECTS", "Maximum number of redirects exceeded", CDr);
    var iIu = bDt("ERR_FR_MAX_BODY_LENGTH_EXCEEDED", "Request body larger than maxBodyLength limit");
    var aIu = bDt("ERR_STREAM_WRITE_AFTER_END", "write after end");
    var lIu = xDr.prototype.destroy || Pws;
    function eW(e, t) {
      if (xDr.call(this), this._sanitizeOptions(e), this._options = e, this._ended = false, this._ending = false, this._redirectCount = 0, this._redirects = [], this._requestBodyLength = 0, this._requestBodyBuffers = [], t) {
        this.on("response", t);
      }
      var n = this;
      this._onNativeResponse = function (r) {
        try {
          n._processResponse(r);
        } catch (o) {
          n.emit("error", o instanceof CDr ? o : new CDr({
            cause: o
          }));
        }
      };
      this._headerFilter = new RegExp("^(?:" + rIu.concat(e.sensitiveHeaders).map(fIu).join("|") + ")$", "i");
      this._performRequest();
    }
    eW.prototype = Object.create(xDr.prototype);
    eW.prototype.abort = function () {
      DDr(this._currentRequest);
      this._currentRequest.abort();
      this.emit("abort");
    };
    eW.prototype.destroy = function (e) {
      DDr(this._currentRequest, e);
      lIu.call(this, e);
      return this;
    };
    eW.prototype.write = function (e, t, n) {
      if (this._ending) {
        throw new aIu();
      }
      if (!$He(e) && !pIu(e)) {
        throw TypeError("data should be a string, Buffer or Uint8Array");
      }
      if (HHe(t)) {
        n = t;
        t = null;
      }
      if (e.length === 0) {
        if (n) {
          n();
        }
        return;
      }
      if (this._requestBodyLength + e.length <= this._options.maxBodyLength) {
        this._requestBodyLength += e.length;
        this._requestBodyBuffers.push({
          data: e,
          encoding: t
        });
        this._currentRequest.write(e, t, n);
      } else {
        this.emit("error", new iIu());
        this.abort();
      }
    };
    eW.prototype.end = function (e, t, n) {
      if (HHe(e)) {
        n = e;
        e = t = null;
      } else if (HHe(t)) {
        n = t;
        t = null;
      }
      if (!e) {
        this._ended = this._ending = true;
        this._currentRequest.end(null, null, n);
      } else {
        var r = this;
        var o = this._currentRequest;
        this.write(e, t, function () {
          r._ended = true;
          o.end(null, null, n);
        });
        this._ending = true;
      }
    };
    eW.prototype.setHeader = function (e, t) {
      this._options.headers[e] = t;
      this._currentRequest.setHeader(e, t);
    };
    eW.prototype.removeHeader = function (e) {
      delete this._options.headers[e];
      this._currentRequest.removeHeader(e);
    };
    eW.prototype.setTimeout = function (e, t) {
      var n = this;
      function r(i) {
        i.setTimeout(e);
        i.removeListener("timeout", i.destroy);
        i.addListener("timeout", i.destroy);
      }
      function o(i) {
        if (n._timeout) {
          clearTimeout(n._timeout);
        }
        n._timeout = setTimeout(function () {
          n.emit("timeout");
          s();
        }, e);
        r(i);
      }
      function s() {
        if (n._timeout) {
          clearTimeout(n._timeout);
          n._timeout = null;
        }
        if (n.removeListener("abort", s), n.removeListener("error", s), n.removeListener("response", s), n.removeListener("close", s), t) {
          n.removeListener("timeout", t);
        }
        if (!n.socket) {
          n._currentRequest.removeListener("socket", o);
        }
      }
      if (t) {
        this.on("timeout", t);
      }
      if (this.socket) {
        o(this.socket);
      } else {
        this._currentRequest.once("socket", o);
      }
      this.on("socket", r);
      this.on("abort", s);
      this.on("error", s);
      this.on("response", s);
      this.on("close", s);
      return this;
    };
    ["flushHeaders", "getHeader", "setNoDelay", "setSocketKeepAlive"].forEach(function (e) {
      eW.prototype[e] = function (t, n) {
        return this._currentRequest[e](t, n);
      };
    });
    ["aborted", "connection", "socket"].forEach(function (e) {
      Object.defineProperty(eW.prototype, e, {
        get: function () {
          return this._currentRequest[e];
        }
      });
    });
    eW.prototype._sanitizeOptions = function (e) {
      if (!e.headers) {
        e.headers = {};
      }
      if (!dIu(e.sensitiveHeaders)) {
        e.sensitiveHeaders = [];
      }
      if (e.host) {
        if (!e.hostname) {
          e.hostname = e.host;
        }
        delete e.host;
      }
      if (!e.pathname && e.path) {
        var t = e.path.indexOf("?");
        if (t < 0) {
          e.pathname = e.path;
        } else {
          e.pathname = e.path.substring(0, t);
          e.search = e.path.substring(t);
        }
      }
    };
    eW.prototype._performRequest = function () {
      var e = this._options.protocol;
      var t = this._options.nativeProtocols[e];
      if (!t) {
        throw TypeError("Unsupported protocol " + e);
      }
      if (this._options.agents) {
        var n = e.slice(0, -1);
        this._options.agent = this._options.agents[n];
      }
      var r = this._currentRequest = t.request(this._options, this._onNativeResponse);
      r._redirectable = this;
      for (var o of IDr) {
        r.on(o, PDr[o]);
      }
      if (this._currentUrl = /^\//.test(this._options.path) ? _Dt.format(this._options) : this._options.path, this._isRedirect) {
        var s = 0;
        var i = this;
        var a = this._requestBodyBuffers;
        (function l(c) {
          if (r === i._currentRequest) {
            if (c) {
              i.emit("error", c);
            } else if (s < a.length) {
              var u = a[s++];
              if (!r.finished) {
                r.write(u.data, u.encoding, l);
              }
            } else if (i._ended) {
              r.end();
            }
          }
        })();
      }
    };
    eW.prototype._processResponse = function (e) {
      var t = e.statusCode;
      if (this._options.trackRedirects) {
        this._redirects.push({
          url: this._currentUrl,
          headers: e.headers,
          statusCode: t
        });
      }
      var n = e.headers.location;
      if (!n || this._options.followRedirects === false || t < 300 || t >= 400) {
        e.responseUrl = this._currentUrl;
        e.redirects = this._redirects;
        this.emit("response", e);
        this._requestBodyBuffers = [];
        return;
      }
      if (DDr(this._currentRequest), e.destroy(), ++this._redirectCount > this._options.maxRedirects) {
        throw new sIu();
      }
      var r;
      var o = this._options.beforeRedirect;
      if (o) {
        r = Object.assign({
          Host: e.req.getHeader("host")
        }, this._options.headers);
      }
      var s = this._options.method;
      if ((t === 301 || t === 302) && this._options.method === "POST" || t === 303 && !/^(?:GET|HEAD)$/.test(this._options.method)) {
        this._options.method = "GET";
        this._requestBodyBuffers = [];
        vDr(/^content-/i, this._options.headers);
      }
      var i = vDr(/^host$/i, this._options.headers);
      var a = ODr(this._currentUrl);
      var l = i || a.host;
      var c = /^\w+:/.test(n) ? this._currentUrl : _Dt.format(Object.assign(a, {
        host: l
      }));
      var u = cIu(n, c);
      if (Aws("redirecting to", u.href), this._isRedirect = true, RDr(u, this._options), u.protocol !== a.protocol && u.protocol !== "https:" || u.host !== l && !uIu(u.host, l)) {
        vDr(this._headerFilter, this._options.headers);
      }
      if (HHe(o)) {
        var d = {
          headers: e.headers,
          statusCode: t
        };
        var p = {
          url: c,
          method: s,
          headers: r
        };
        o(this._options, d, p);
        this._sanitizeOptions(this._options);
      }
      this._performRequest();
    };
    function Iws(e) {
      var t = {
        maxRedirects: 21,
        maxBodyLength: 10485760
      };
      var n = {};
      Object.keys(e).forEach(function (r) {
        var o = r + ":";
        var s = n[o] = e[r];
        var i = t[r] = Object.create(s);
        function a(c, u, d) {
          if (mIu(c)) {
            c = RDr(c);
          } else if ($He(c)) {
            c = RDr(ODr(c));
          } else {
            d = u;
            u = Ows(c);
            c = {
              protocol: o
            };
          }
          if (HHe(u)) {
            d = u;
            u = null;
          }
          if (u = Object.assign({
            maxRedirects: t.maxRedirects,
            maxBodyLength: t.maxBodyLength
          }, c, u), u.nativeProtocols = n, !$He(u.host) && !$He(u.hostname)) {
            u.hostname = "::1";
          }
          kDr.equal(u.protocol, o, "protocol mismatch");
          Aws("options", u);
          return new eW(u, d);
        }
        function l(c, u, d) {
          var p = i.request(c, u, d);
          p.end();
          return p;
        }
        Object.defineProperties(i, {
          request: {
            value: a,
            configurable: true,
            enumerable: true,
            writable: true
          },
          get: {
            value: l,
            configurable: true,
            enumerable: true,
            writable: true
          }
        });
      });
      return t;
    }
    function Pws() {}
    function ODr(e) {
      var t;
      if (ADr) {
        t = new yDt(e);
      } else if (t = Ows(_Dt.parse(e)), !$He(t.protocol)) {
        throw new wDr({
          input: e
        });
      }
      return t;
    }
    function cIu(e, t) {
      return ADr ? new yDt(e, t) : ODr(_Dt.resolve(t, e));
    }
    function Ows(e) {
      if (/^\[/.test(e.hostname) && !/^\[[:0-9a-f]+\]$/i.test(e.hostname)) {
        throw new wDr({
          input: e.href || e
        });
      }
      if (/^\[/.test(e.host) && !/^\[[:0-9a-f]+\](:\d+)?$/i.test(e.host)) {
        throw new wDr({
          input: e.href || e
        });
      }
      return e;
    }
    function RDr(e, t) {
      var n = t || {};
      for (var r of oIu) {
        n[r] = e[r];
      }
      if (n.hostname.startsWith("[")) {
        n.hostname = n.hostname.slice(1, -1);
      }
      if (n.port !== "") {
        n.port = Number(n.port);
      }
      n.path = n.search ? n.pathname + n.search : n.pathname;
      return n;
    }
    function vDr(e, t) {
      var n;
      for (var r in t) {
        if (e.test(r)) {
          n = t[r];
          delete t[r];
        }
      }
      return n === null || typeof n > "u" ? undefined : String(n).trim();
    }
    function bDt(e, t, n) {
      function r(o) {
        if (HHe(Error.captureStackTrace)) {
          Error.captureStackTrace(this, this.constructor);
        }
        Object.assign(this, o || {});
        this.code = e;
        this.message = this.cause ? t + ": " + this.cause.message : t;
      }
      r.prototype = Object.create((n || Error).prototype);
      Object.defineProperties(r.prototype, {
        constructor: {
          value: r,
          enumerable: false
        },
        name: {
          value: "Error [" + e + "]",
          enumerable: false
        }
      });
      return r;
    }
    function DDr(e, t) {
      for (var n of IDr) {
        e.removeListener(n, PDr[n]);
      }
      e.on("error", Pws);
      e.destroy(t);
    }
    function uIu(e, t) {
      kDr($He(e) && $He(t));
      var n = e.length - t.length - 1;
      return n > 0 && e[n] === "." && e.endsWith(t);
    }
    function dIu(e) {
      return e instanceof Array;
    }
    function $He(e) {
      return typeof e === "string" || e instanceof String;
    }
    function HHe(e) {
      return typeof e === "function";
    }
    function pIu(e) {
      return typeof e === "object" && "length" in e;
    }
    function mIu(e) {
      return yDt && e instanceof yDt;
    }
    function fIu(e) {
      return e.replace(/[\]\\/()*+?.$]/g, "\\$&");
    }
    MDr.exports = Iws({
      http: tIu,
      https: nIu
    });