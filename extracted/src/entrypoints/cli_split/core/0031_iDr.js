  var Vvs;
  var ohn;
  var oDr = __lazy(() => {
    Vvs = __toESM(Gvs(), 1);
    ohn = Vvs.default;
  });
  function iDr(e) {
    return cr.isPlainObject(e) || cr.isArray(e);
  }
  function zvs(e) {
    return cr.endsWith(e, "[]") ? e.slice(0, -2) : e;
  }
  function sDr(e, t, n) {
    if (!e) {
      return t;
    }
    return e.concat(t).map(function (o, s) {
      o = zvs(o);
      return !n && s ? "[" + o + "]" : o;
    }).join(n ? "." : "");
  }
  function c0u(e) {
    return cr.isArray(e) && !e.some(iDr);
  }
  function d0u(e, t, n) {
    if (!cr.isObject(e)) {
      throw TypeError("target must be an object");
    }
    t = t || new (ohn || FormData)();
    n = cr.toFlatObject(n, {
      metaTokens: true,
      dots: false,
      indexes: false
    }, false, function (g, y) {
      return !cr.isUndefined(y[g]);
    });
    let r = n.metaTokens;
    let o = n.visitor || d;
    let s = n.dots;
    let i = n.indexes;
    let a = n.Blob || typeof Blob < "u" && Blob;
    let l = n.maxDepth === undefined ? 100 : n.maxDepth;
    let c = a && cr.isSpecCompliantForm(t);
    if (!cr.isFunction(o)) {
      throw TypeError("visitor must be a function");
    }
    function u(h) {
      if (h === null) {
        return "";
      }
      if (cr.isDate(h)) {
        return h.toISOString();
      }
      if (cr.isBoolean(h)) {
        return h.toString();
      }
      if (!c && cr.isBlob(h)) {
        throw new WB("Blob is not supported. Use a Buffer instead.");
      }
      if (cr.isArrayBuffer(h) || cr.isTypedArray(h)) {
        return c && typeof Blob === "function" ? new Blob([h]) : Buffer.from(h);
      }
      return h;
    }
    function d(h, g, y) {
      let _ = h;
      if (cr.isReactNative(t) && cr.isReactNativeBlob(h)) {
        t.append(sDr(y, g, s), u(h));
        return false;
      }
      if (h && !y && typeof h === "object") {
        if (cr.endsWith(g, "{}")) {
          g = r ? g : g.slice(0, -2);
          h = JSON.stringify(h);
        } else if (cr.isArray(h) && c0u(h) || (cr.isFileList(h) || cr.endsWith(g, "[]")) && (_ = cr.toArray(h))) {
          g = zvs(g);
          _.forEach(function (S, E) {
            !(cr.isUndefined(S) || S === null) && t.append(i === true ? sDr([g], E, s) : i === null ? g : g + "[]", u(S));
          });
          return false;
        }
      }
      if (iDr(h)) {
        return true;
      }
      t.append(sDr(y, g, s), u(h));
      return false;
    }
    let p = [];
    let m = Object.assign(u0u, {
      defaultVisitor: d,
      convertValue: u,
      isVisitable: iDr
    });
    function f(h, g, y = 0) {
      if (cr.isUndefined(h)) {
        return;
      }
      if (y > l) {
        throw new WB("Object is too deeply nested (" + y + " levels). Max depth: " + l, WB.ERR_FORM_DATA_DEPTH_EXCEEDED);
      }
      if (p.indexOf(h) !== -1) {
        throw Error("Circular reference detected in " + g.join("."));
      }
      p.push(h);
      cr.forEach(h, function (b, S) {
        if ((!(cr.isUndefined(b) || b === null) && o.call(t, b, cr.isString(S) ? S.trim() : S, g, m)) === true) {
          f(b, g ? g.concat(S) : [S], y + 1);
        }
      });
      p.pop();
    }
    if (!cr.isObject(e)) {
      throw TypeError("data must be an object");
    }
    f(e);
    return t;
  }
  var u0u;
  function Kvs(e) {
    let t = {
      "!": "%21",
      "'": "%27",
      "(": "%28",
      ")": "%29",
      "~": "%7E",
      "%20": "+"
    };
    return encodeURIComponent(e).replace(/[!'()~]|%20/g, function (r) {
      return t[r];
    });
  }
  function Yvs(e, t) {
    this._pairs = [];
    e && d0u(e, this, t);
  }
  var Jvs;
  function p0u(e) {
    return encodeURIComponent(e).replace(/%3A/gi, ":").replace(/%24/g, "$").replace(/%2C/gi, ",").replace(/%20/g, "+");
  }
  function LHe(e, t, n) {
    if (!t) {
      return e;
    }
    let r = n && n.HS || p0u;
    let o = cr.isFunction(n) ? {
      serialize: n
    } : n;
    let s = o && o.serialize;
    let i;
    if (s) {
      i = s(t, o);
    } else {
      i = cr.isURLSearchParams(t) ? t.toString() : new Yvs(t, o).toString(r);
    }
    if (i) {
      let a = e.indexOf("#");
      if (a !== -1) {
        e = e.slice(0, a);
      }
      e += (e.indexOf("?") === -1 ? "?" : "&") + i;
    }
    return e;
  }
  var shn = __lazy(() => {
    Qv();
  });
  class Zvs {
    constructor() {
      this.handlers = [];
    }
    use(e, t, n) {
      this.handlers.push({
        fulfilled: e,
        rejected: t,
        synchronous: n ? n.synchronous : false,
        runWhen: n ? n.runWhen : null
      });
      return this.handlers.length - 1;
    }
    eject(e) {
      if (this.handlers[e]) {
        this.handlers[e] = null;
      }
    }
    clear() {
      if (this.handlers) {
        this.handlers = [];
      }
    }
    forEach(e) {
      cr.forEach(this.handlers, function (n) {
        if (n !== null) {
          e(n);
        }
      });
    }
  }
  var cke;
  var dDt = __lazy(() => {
    cke = {
      silentJSONParsing: true,
      forcedJSONParsing: true,
      clarifyTimeoutError: false,
      legacyInterceptorReqResOrdering: true
    };
  });
  var tws;
  var nws;
  var rws = __lazy(() => {
    tws = __toESM(require("url"));
    nws = tws.default.URLSearchParams;
  });
  var sws;
  var iws;
  var m0u = (e = 16, t = iws.ALPHA_DIGIT) => {
    let n = "";
    let {
      length: r
    } = t;
    let o = new Uint32Array(e);
    sws.default.randomFillSync(o);
    for (let s = 0; s < e; s++) {
      n += t[o[s] % r];
    }
    return n;
  };
  var aws;
  var lws = __lazy(() => {
    rws();
    oDr();
    sws = __toESM(require("crypto"));
    iws = {
      DIGIT: "0123456789",
      ALPHA: "abcdefghijklmnopqrstuvwxyz",
      ALPHA_DIGIT: "abcdefghijklmnopqrstuvwxyz" + ("abcdefghijklmnopqrstuvwxyz").toUpperCase() + "0123456789"
    };
    aws = {
      isNode: true,
      classes: {
        URLSearchParams: nws,
        FormData: ohn,
        Blob: typeof Blob < "u" && Blob || null
      },
      ALPHABET: iws,
      generateString: m0u,
      protocols: ["http", "https", "file", "data"]
    };
  });
  var dDr = {};