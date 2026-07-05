  __export(dDr, {
    origin: () => origin,
    navigator: () => navigator_export,
    hasStandardBrowserWebWorkerEnv: () => hasStandardBrowserWebWorkerEnv,
    hasStandardBrowserEnv: () => hasStandardBrowserEnv,
    hasBrowserEnv: () => hasBrowserEnv
  });
  var hasBrowserEnv;
  var navigator_export;
  var hasStandardBrowserEnv;
  var hasStandardBrowserWebWorkerEnv;
  var origin;
  var cws = __lazy(() => {
    hasBrowserEnv = typeof window < "u" && typeof document < "u";
    navigator_export = typeof navigator === "object" && navigator || undefined;
    hasStandardBrowserEnv = hasBrowserEnv && (!navigator_export || ["ReactNative", "NativeScript", "NS"].indexOf(navigator_export.product) < 0);
    hasStandardBrowserWebWorkerEnv = (() => typeof WorkerGlobalScope < "u" && self instanceof WorkerGlobalScope && typeof self.importScripts === "function")();
    origin = hasBrowserEnv && window.location.href || "http://localhost";
  });
  var L_;
  var Dte = __lazy(() => {
    lws();
    cws();
    L_ = {
      ...dDr,
      ...aws
    };
  });
  function pDr(e, t) {
    return d0u(e, new L_.classes.URLSearchParams(), {
      visitor: function (n, r, o, s) {
        if (L_.isNode && cr.isBuffer(n)) {
          this.append(r, n.toString("base64"));
          return false;
        }
        return s.defaultVisitor.apply(this, arguments);
      },
      ...t
    });
  }
  var uws = __lazy(() => {
    Qv();
    Dte();
  });
  function y0u(e) {
    return cr.matchAll(/\w+|\[(\w*)]/g, e).map(t => t[0] === "[]" ? "" : t[1] || t[0]);
  }
  function _0u(e) {
    let t = {};
    let n = Object.keys(e);
    let r;
    let o = n.length;
    let s;
    for (r = 0; r < o; r++) {
      s = n[r];
      t[s] = e[s];
    }
    return t;
  }
  function b0u(e) {
    function t(n, r, o, s) {
      let i = n[s++];
      if (i === "__proto__") {
        return true;
      }
      let a = Number.isFinite(+i);
      let l = s >= n.length;
      if (i = !i && cr.isArray(o) ? o.length : i, l) {
        if (cr.hasOwnProp(o, i)) {
          o[i] = cr.isArray(o[i]) ? o[i].concat(r) : [o[i], r];
        } else {
          o[i] = r;
        }
        return !a;
      }
      if (!o[i] || !cr.isObject(o[i])) {
        o[i] = [];
      }
      if (t(n, r, o[i], s) && cr.isArray(o[i])) {
        o[i] = _0u(o[i]);
      }
      return !a;
    }
    if (cr.isFormData(e) && cr.isFunction(e.entries)) {
      let n = {};
      cr.forEachEntry(e, (r, o) => {
        t(y0u(r), o, n, 0);
      });
      return n;
    }
    return null;
  }
  function S0u(e, t, n) {
    if (cr.isString(e)) {
      try {
        (t || JSON.parse)(e);
        return cr.trim(e);
      } catch (r) {
        if (r.name !== "SyntaxError") {
          throw r;
        }
      }
    }
    return (n || JSON.stringify)(e);
  }
  var Ntt = (e, t) => e != null && cr.hasOwnProp(e, t) ? e[t] : undefined;
  var fDr;
  var T0u;
  var dws = e => {
    let t = {};
    let n;
    let r;
    let o;
    e && e.split(`
`).forEach(function (i) {
      if (o = i.indexOf(":"), n = i.substring(0, o).trim().toLowerCase(), r = i.substring(o + 1).trim(), !n || t[n] && T0u[n]) {
        return;
      }
      if (n === "set-cookie") {
        if (t[n]) {
          t[n].push(r);
        } else {
          t[n] = [r];
        }
      } else {
        t[n] = t[n] ? t[n] + ", " + r : r;
      }
    });
    return t;
  };
  var pws = __lazy(() => {
    Qv();
    T0u = cr.toObjectSet(["age", "authorization", "content-length", "content-type", "etag", "expires", "from", "host", "if-modified-since", "if-unmodified-since", "last-modified", "location", "max-forwards", "proxy-authorization", "referer", "retry-after", "user-agent"]);
  });
  function v0u(e) {
    let t = 0;
    let n = e.length;
    while (t < n) {
      let r = e.charCodeAt(t);
      if (r !== 9 && r !== 32) {
        break;
      }
      t += 1;
    }
    while (n > t) {
      let r = e.charCodeAt(n - 1);
      if (r !== 9 && r !== 32) {
        break;
      }
      n -= 1;
    }
    return t === 0 && n === e.length ? e : e.slice(t, n);
  }
  function pDt(e) {
    return e && String(e).trim().toLowerCase();
  }
  function w0u(e) {
    return v0u(e.replace(E0u, ""));
  }
  function lhn(e) {
    if (e === false || e == null) {
      return e;
    }
    return cr.isArray(e) ? e.map(lhn) : w0u(String(e));
  }
  function C0u(e) {
    let t = Object.create(null);
    let n = /([^\s,;=]+)\s*(?:=\s*([^,;]+))?/g;
    let r;
    while (r = n.exec(e)) {
      t[r[1]] = r[2];
    }
    return t;
  }
  function hDr(e, t, n, r, o) {
    if (cr.isFunction(r)) {
      return r.call(this, t, n);
    }
    if (o) {
      t = n;
    }
    if (!cr.isString(t)) {
      return;
    }
    if (cr.isString(r)) {
      return t.indexOf(r) !== -1;
    }
    if (cr.isRegExp(r)) {
      return r.test(t);
    }
  }
  function x0u(e) {
    return e.trim().toLowerCase().replace(/([a-z\d])(\w*)/g, (t, n, r) => n.toUpperCase() + r);
  }
  function k0u(e, t) {
    let n = cr.toCamelCase(" " + t);
    ["get", "set", "has"].forEach(r => {
      Object.defineProperty(e, r + n, {
        value: function (o, s, i) {
          return this[r].call(this, t, o, s, i);
        },
        configurable: true
      });
    });
  }
  var mws;
  var E0u;
  var R0u = e => /^[-_a-zA-Z0-9^`|~,!#$%&'*+.]+$/.test(e.trim());
  var mDt;
  function fDt(e, t) {
    let n = this || fDr;
    let r = t || n;
    let o = mDt.from(r.headers);
    let s = r.data;
    cr.forEach(e, function (a) {
      s = a.call(n, s, o.normalize(), t ? t.status : undefined);
    });
    o.normalize();
    return s;
  }
  var fws = __lazy(() => {
    Qv();
  });
  function hDt(e) {
    return !!(e && e.__CANCEL__);
  }
  var hws;
  function ple(e, t, n) {
    let r = n.config.validateStatus;
    if (!n.status || !r || r(n.status)) {
      e(n);
    } else {
      t(new WB("Request failed with status code " + n.status, [WB.ERR_BAD_REQUEST, WB.ERR_BAD_RESPONSE][Math.floor(n.status / 100) - 4], n.config, n.request, n));
    }
  }
  var chn = __lazy(() => {});
  function gDr(e) {
    if (typeof e !== "string") {
      return false;
    }
    return /^([a-z][a-z\d+\-.]*:)?\/\//i.test(e);
  }
  function yDr(e, t) {
    return t ? e.replace(/\/?\/$/, "") + "/" + t.replace(/^\/+/, "") : e;
  }
  function UHe(e, t, n) {
    let r = !gDr(t);
    if (e && (r || n === false)) {
      return yDr(e, t);
    }
    return t;
  }
  var uhn = () => {};
  function I0u(e) {
    try {
      return new URL(e);
    } catch {
      return null;
    }
  }
  function gws(e) {
    var t = (typeof e === "string" ? I0u(e) : e) || {};
    var n = t.protocol;
    var r = t.host;
    var o = t.port;
    if (typeof r !== "string" || !r || typeof n !== "string") {
      return "";
    }
    if (n = n.split(":", 1)[0], r = r.replace(/:\d*$/, ""), o = parseInt(o) || A0u[n] || 0, !P0u(r, o)) {
      return "";
    }
    var s = _Dr(n + "_proxy") || _Dr("all_proxy");
    if (s && s.indexOf("://") === -1) {
      s = n + "://" + s;
    }
    return s;
  }
  function P0u(e, t) {
    var n = _Dr("no_proxy").toLowerCase();
    if (!n) {
      return true;
    }
    if (n === "*") {
      return false;
    }
    return n.split(/[,\s]/).every(function (r) {
      if (!r) {
        return true;
      }
      var o = r.match(/^(.+):(\d+)$/);
      var s = o ? o[1] : r;
      var i = o ? parseInt(o[2]) : 0;
      if (i && i !== t) {
        return true;
      }
      if (!/^[.*]/.test(s)) {
        return e !== s;
      }
      if (s.charAt(0) === "*") {
        s = s.slice(1);
      }
      return !e.endsWith(s);
    });
  }
  function _Dr(e) {
    return process.env[e.toLowerCase()] || process.env[e.toUpperCase()] || "";
  }
  var A0u;
  var yws = __lazy(() => {
    A0u = {
      ftp: 21,
      gopher: 70,
      http: 80,
      https: 443,
      ws: 80,
      wss: 443
    };
  });