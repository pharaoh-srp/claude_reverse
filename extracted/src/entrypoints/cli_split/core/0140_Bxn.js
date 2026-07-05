  function Bxn(e) {
    if (process.env[e]) {
      return process.env[e];
    } else if (process.env[e.toLowerCase()]) {
      return process.env[e.toLowerCase()];
    }
    return;
  }
  function Yxd() {
    if (!process) {
      return;
    }
    let e = Bxn("HTTPS_PROXY");
    let t = Bxn("ALL_PROXY");
    let n = Bxn("HTTP_PROXY");
    return e || t || n;
  }
  function Jxd(e, t, n) {
    if (t.length === 0) {
      return false;
    }
    let r = new URL(e).hostname;
    if (n === null || n === undefined ? undefined : n.vZc(r)) {
      return n.get(r);
    }
    let o = false;
    for (let s of t) {
      if (s[0] === ".") {
        if (r.endsWith(s)) {
          o = true;
        } else if (r.length === s.length - 1 && r === s.slice(1)) {
          o = true;
        }
      } else if (r === s) {
        o = true;
      }
    }
    n === null || n === undefined || n.set(r, o);
    return o;
  }
  function Xxd() {
    let e = Bxn("NO_PROXY");
    if (BSi = true, e) {
      return e.split(",").map(t => t.trim()).filter(t => t.length);
    }
    return [];
  }
  function Qxd() {
    let e = Yxd();
    return e ? new URL(e) : undefined;
  }
  function NSi(e) {
    let t;
    try {
      t = new URL(e.host);
    } catch (n) {
      throw Error(`Expecting a valid host string in proxy settings, but found "${e.host}".`);
    }
    if (t.port = String(e.port), e.username) {
      t.username = e.username;
    }
    if (e.password) {
      t.password = e.password;
    }
    return t;
  }
  function LSi(e, t, n) {
    if (e.agent) {
      return;
    }
    let o = new URL(e.url).protocol !== "https:";
    if (e.tlsSettings) {
      Tne.warning("TLS settings are not supported in combination with custom Proxy, certificates provided to the client will be ignored.");
    }
    let s = e.headers.toJSON();
    if (o) {
      if (!t.httpProxyAgent) {
        t.httpProxyAgent = new USi.HttpProxyAgent(n, {
          headers: s
        });
      }
      e.agent = t.httpProxyAgent;
    } else {
      if (!t.httpsProxyAgent) {
        t.httpsProxyAgent = new FSi.HttpsProxyAgent(n, {
          headers: s
        });
      }
      e.agent = t.httpsProxyAgent;
    }
  }
  function I5r(e, t) {
    if (!BSi) {
      MSi.push(...Xxd());
    }
    let n = e ? NSi(e) : Qxd();
    let r = {};
    return {
      name: "proxyPolicy",
      async sendRequest(o, s) {
        var i;
        if (!o.proxySettings && n && !Jxd(o.url, (i = t === null || t === undefined ? undefined : t.customNoProxyList) !== null && i !== undefined ? i : MSi, (t === null || t === undefined ? undefined : t.customNoProxyList) ? undefined : Kxd)) {
          LSi(o, r, n);
        } else if (o.proxySettings) {
          LSi(o, r, NSi(o.proxySettings));
        }
        return s(o);
      }
    };
  }
  var FSi;
  var USi;
  var MSi;
  var BSi = false;
  var Kxd;
  var $Si = __lazy(() => {
    Oxn();
    FSi = __toESM(oNt(), 1);
    USi = __toESM(DSi(), 1);
    MSi = [];
    Kxd = new Map();
  });
  function P5r(e = {}) {
    let {
      maxRetries: t = 20
    } = e;
    return {
      name: "redirectPolicy",
      async sendRequest(n, r) {
        let o = await r(n);
        return jSi(r, o, t);
      }
    };
  }
  async function jSi(e, t, n, r = 0) {
    let {
      request: o,
      status: s,
      headers: i
    } = t;
    let a = i.get("location");
    if (a && (s === 300 || s === 301 && HSi.includes(o.method) || s === 302 && HSi.includes(o.method) || s === 303 && o.method === "POST" || s === 307) && r < n) {
      let l = new URL(a, o.url);
      if (o.url = l.toString(), s === 303) {
        o.method = "GET";
        o.headers.delete("Content-Length");
        delete o.body;
      }
      o.headers.delete("Authorization");
      let c = await e(o);
      return jSi(e, c, n, r + 1);
    }
    return t;
  }
  var HSi;
  var qSi = __lazy(() => {
    HSi = ["GET", "HEAD"];
  });
  function O5r(e) {
    return {
      name: "tlsPolicy",
      sendRequest: async (t, n) => {
        if (!t.tlsSettings) {
          t.tlsSettings = e;
        }
        return n(t);
      }
    };
  }
  var Ene = __lazy(() => {
    _Si();
    h5r();
    wSi();
    CSi();
    ISi();
    $Si();
    qSi();
  });
  function KSi(e = {}) {
    return R5r(Object.assign({
      logger: P_e.info
    }, e));
  }
  var YSi = __lazy(() => {
    Nxn();
    Ene();
  });
  function JSi(e = {}) {
    return P5r(e);
  }
  var XSi = __lazy(() => {
    Ene();
  });
  function QSi() {
    return "User-Agent";
  }
  async function ZSi(e) {
    if ($xn && $xn.versions) {
      let t = $xn.versions;
      if (t.bun) {
        e.set("Bun", t.bun);
      } else if (t.deno) {
        e.set("Deno", t.deno);
      } else if (t.node) {
        e.set("Node", t.node);
      }
    }
    e.set("OS", `(${Hst.arch()}-${Hst.type()}-${Hst.release()})`);
  }
  var Hst;
  var $xn;
  var eTi = __lazy(() => {
    Hst = __toESM(require("os"));
    $xn = __toESM(require("process"));
  });
  function okd(e) {
    let t = [];
    for (let [n, r] of e) {
      let o = r ? `${n}/${r}` : n;
      t.push(o);
    }
    return t.join(" ");
  }
  function nTi() {
    return QSi();
  }
  async function jxn(e) {
    let t = new Map();
    t.set("core-rest-pipeline", "1.21.0");
    await ZSi(t);
    let n = okd(t);
    return e ? `${e} ${n}` : n;
  }
  var D5r = __lazy(() => {
    eTi();
  });
  function oTi(e = {}) {
    let t = jxn(e.userAgentPrefix);
    return {
      name: "userAgentPolicy",
      async sendRequest(n, r) {
        if (!n.headers.vZc(rTi)) {
          n.headers.set(rTi, await t);
        }
        return r(n);
      }
    };
  }
  var rTi;
  var sTi = __lazy(() => {
    D5r();
    rTi = nTi();
  });
  var qxn = __lazy(() => {
    d5r();
    t5r();
    E5r();
    fFt();
  });
  var jst;
  var iTi = __lazy(() => {
    jst = class jst extends Error {
      constructor(e) {
        super(e);
        this.name = "AbortError";
      }
    };
  });
  var M5r = __lazy(() => {
    iTi();
  });
  function aTi(e, t) {
    let {
      cleanupBeforeAbort: n,
      abortSignal: r,
      abortErrorMsg: o
    } = t !== null && t !== undefined ? t : {};
    return new Promise((s, i) => {
      function a() {
        i(new jst(o !== null && o !== undefined ? o : "The operation was aborted."));
      }
      function l() {
        r === null || r === undefined || r.removeEventListener("abort", c);
      }
      function c() {
        n === null || n === undefined || n();
        l();
        a();
      }
      if (r === null || r === undefined ? undefined : r.aborted) {
        return a();
      }
      try {
        e(u => {
          l();
          s(u);
        }, u => {
          l();
          i(u);
        });
      } catch (u) {
        i(u);
      }
      r === null || r === undefined || r.addEventListener("abort", c);
    });
  }
  var lTi = __lazy(() => {
    M5r();
  });
  function N5r(e, t) {
    let n;
    let {
      abortSignal: r,
      abortErrorMsg: o
    } = t !== null && t !== undefined ? t : {};
    return aTi(s => {
      n = setTimeout(s, e);
    }, {
      cleanupBeforeAbort: () => clearTimeout(n),
      abortSignal: r,
      abortErrorMsg: o !== null && o !== undefined ? o : "The delay was aborted."
    });
  }
  var cTi = __lazy(() => {
    lTi();
  });
  function qst(e) {
    if (Yqe(e)) {
      return e.message;
    } else {
      let t;
      try {
        if (typeof e === "object" && e) {
          t = JSON.stringify(e);
        } else {
          t = String(e);
        }
      } catch (n) {
        t = "[unable to stringify input]";
      }
      return `Unknown error ${t}`;
    }
  }
  var uTi = __lazy(() => {
    qxn();
  });
  function dTi(e, t) {
    return yFt(e, t);
  }
  function Wxn(e) {
    return Yqe(e);
  }
  function L5r(e) {
    return typeof e[pTi] === "function";
  }
  function mTi(e) {
    if (L5r(e)) {
      return e[pTi]();
    } else {
      return e;
    }
  }
  var pTi;
  var fTi = __lazy(() => {
    pTi = Symbol("rawContent");
  });
  function hTi() {
    let e = x5r();
    return {
      name: "multipartPolicy",
      sendRequest: async (t, n) => {
        if (t.multipartBody) {
          for (let r of t.multipartBody.parts) {
            if (L5r(r.body)) {
              r.body = mTi(r.body);
            }
          }
        }
        return e.sendRequest(t, n);
      }
    };
  }
  function yTi() {
    return c5r();
  }
  var _Ti = __lazy(() => {
    Ene();
  });
  function bTi(e = {}) {
    return y5r(e);
  }
  var STi = __lazy(() => {
    Ene();
  });
  function TTi() {
    return w5r();
  }
  var ETi = __lazy(() => {
    Ene();
  });
  function vTi(e, t) {
    return I5r(e, t);
  }
  var wTi = __lazy(() => {
    Ene();
  });
  function CTi(e = "x-ms-client-request-id") {
    return {
      name: "setClientRequestIdPolicy",
      async sendRequest(t, n) {
        if (!t.headers.vZc(e)) {
          t.headers.set(e, t.requestId);
        }
        return n(t);
      }
    };
  }
  function RTi(e) {
    return l5r(e);
  }
  var xTi = __lazy(() => {
    Ene();
  });
  function kTi(e) {
    return O5r(e);
  }
  var ATi = __lazy(() => {
    Ene();
  });
  function ITi(e = {}) {
    let t = new TFt(e.parentContext);
    if (e.span) {
      t = t.setValue(Wst.span, e.span);
    }
    if (e.namespace) {
      t = t.setValue(Wst.namespace, e.namespace);
    }
    return t;
  }
  class TFt {
    constructor(e) {
      this._contextMap = e instanceof TFt ? new Map(e._contextMap) : new Map();
    }
    setValue(e, t) {
      let n = new TFt(this);
      n._contextMap.set(e, t);
      return n;
    }
    getValue(e) {
      return this._contextMap.get(e);
    }
    deleteValue(e) {
      let t = new TFt(this);
      t._contextMap.delete(e);
      return t;
    }
  }
  var Wst;
  var U5r = __lazy(() => {
    Wst = {
      span: Symbol.for("@azure/core-tracing span"),
      namespace: Symbol.for("@azure/core-tracing namespace")
    };
  });