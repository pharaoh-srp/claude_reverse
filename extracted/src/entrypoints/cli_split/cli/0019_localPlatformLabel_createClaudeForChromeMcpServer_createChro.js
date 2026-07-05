  __export(sSs, {
    localPlatformLabel: () => localPlatformLabel,
    createClaudeForChromeMcpServer: () => createClaudeForChromeMcpServer,
    createChromeSocketClient: () => createChromeSocketClient,
    createBridgeClient: () => createBridgeClient,
    clearBrowserResolution: () => clearBrowserResolution,
    WAIT_MAX_DURATION_S: () => 10,
    ToolCallTimeoutError: () => ToolCallTimeoutError,
    SocketConnectionError: () => SocketConnectionError,
    PEER_WAIT_TIMEOUT_MS: () => 1e4,
    NoExtensionConnectedError: () => NoExtensionConnectedError,
    ExtensionDisconnectedMidCallError: () => ExtensionDisconnectedMidCallError,
    DISCOVERY_TIMEOUT_MS: () => 5000,
    DEFAULT_TOOL_CALL_TIMEOUT_MS: () => 60000,
    BridgeClient: () => BridgeClient,
    BROWSER_TOOLS: () => BROWSER_TOOLS
  });
  var XPr = __lazy(() => {
    txr();
    aet();
    oSs();
    Qmn();
    set();
  });
  class HOt {
    append(e) {
      this._buffer = this._buffer ? Buffer.concat([this._buffer, e]) : e;
    }
    readMessage() {
      if (!this._buffer) {
        return null;
      }
      let e = this._buffer.indexOf(`
`);
      if (e === -1) {
        return null;
      }
      let t = this._buffer.toString("utf8", 0, e).replace(/\r$/, "");
      this._buffer = this._buffer.subarray(e + 1);
      return QPr(t);
    }
    clear() {
      this._buffer = undefined;
    }
  }
  function QPr(e) {
    return Xae.parse(JSON.parse(e));
  }
  function efn(e) {
    return JSON.stringify(e) + `
`;
  }
  var tfn = __lazy(() => {});
  class SHe {
    constructor(e = ZPr.default.stdin, t = ZPr.default.stdout) {
      this._stdin = e;
      this._stdout = t;
      this._readBuffer = new HOt();
      this._started = false;
      this._ondata = n => {
        this._readBuffer.append(n);
        this.processReadBuffer();
      };
      this._onerror = n => {
        this.onerror?.(n);
      };
    }
    async start() {
      if (this._started) {
        throw Error("StdioServerTransport already started! If using Server class, note that connect() calls start() automatically.");
      }
      this._started = true;
      this._stdin.on("data", this._ondata);
      this._stdin.on("error", this._onerror);
    }
    processReadBuffer() {
      while (true) {
        try {
          let e = this._readBuffer.readMessage();
          if (e === null) {
            break;
          }
          this.onmessage?.(e);
        } catch (e) {
          this.onerror?.(e);
        }
      }
    }
    async close() {
      if (this._stdin.off("data", this._ondata), this._stdin.off("error", this._onerror), this._stdin.listenerCount("data") === 0) {
        this._stdin.pause();
      }
      this._readBuffer.clear();
      this.onclose?.();
    }
    send(e) {
      return new Promise(t => {
        let n = efn(e);
        if (this._stdout.write(n)) {
          t();
        } else {
          this._stdout.once("drain", t);
        }
      });
    }
  }
  var ZPr;
  var nfn = __lazy(() => {
    tfn();
    ZPr = __toESM(require("process"));
  });
  function c_u(e, t, n, r) {
    if (!gZc(e)) {
      return e;
    }
    t = Rnu(t, e);
    var o = -1;
    var s = t.length;
    var i = s - 1;
    var a = e;
    while (a != null && ++o < s) {
      var l = knu(t[o]);
      var c = n;
      if (l === "__proto__" || l === "constructor" || l === "prototype") {
        return e;
      }
      if (o != i) {
        var u = a[l];
        if (c = r ? r(u, l, a) : undefined, c === undefined) {
          c = gZc(u) ? u : Xeu(t[o + 1]) ? [] : {};
        }
      }
      Rou(a, l, c);
      a = a[l];
    }
    return e;
  }
  function u_u(e, t, n) {
    var r = -1;
    var o = t.length;
    var s = {};
    while (++r < o) {
      var i = t[r];
      var a = Anu(e, i);
      if (n(a, i)) {
        c_u(s, Rnu(i, e), a);
      }
    }
    return s;
  }
  function d_u(e, t) {
    if (e == null) {
      return {};
    }
    var n = vnu(qou(e), function (r) {
      return [r];
    });
    t = Hnu(t);
    return u_u(e, n, function (r, o) {
      return t(r, o[0]);
    });
  }
  var lSs;
  var cSs = __lazy(() => {
    lSs = {
      ccr: {
        controlChannel: true,
        modelCatalog: true,
        setPermissionMode: true,
        fanout: true,
        presence: true,
        catchupReplay: true,
        bashExec: true,
        fileRead: true
      },
      ssh: {
        controlChannel: true,
        modelCatalog: true,
        setPermissionMode: true,
        fanout: false,
        presence: false,
        catchupReplay: false,
        bashExec: false,
        fileRead: true
      },
      direct: {
        controlChannel: false,
        modelCatalog: false,
        setPermissionMode: false,
        fanout: false,
        presence: false,
        catchupReplay: false,
        bashExec: false,
        fileRead: false
      }
    };
  });
  function Ul() {
    return getCaps().remote;
  }
  function va() {
    return getIsRemoteMode() || Ul() !== null;
  }
  function c_() {
    let e = Ul();
    return e?.caps?.controlChannel === true && !e.viewerOnly;
  }
  function LD(e) {
    return Ul()?.caps?.[e] === true;
  }
  function p_u(e) {
    return Promise.reject(Error(`sendControlRequest not yet wired for ${e} transport`));
  }
  function ofn(e, t, n, r) {
    if (!t.isRemoteMode) {
      return tOr;
    }
    return {
      kind: e,
      isRemoteMode: true,
      viewerOnly: n,
      caps: lSs[e],
      sessionId: r,
      sendMessage: t.sendMessage,
      cancelRequest: t.cancelRequest,
      disconnect: t.disconnect,
      sendControlRequest: t.sendControlRequest ?? (() => p_u(e))
    };
  }
  var tOr;
  var ru = __lazy(() => {
    at();
    cSs();
    tOr = {
      isRemoteMode: false
    };
  });
  function f_u(e) {
    return e === "html" ? {
      childList: true,
      subtree: true,
      attributes: true,
      characterData: true
    } : {
      childList: false,
      subtree: false,
      attributes: true,
      attributeFilter: [e]
    };
  }
  function cfn(e) {
    var t = lfn.get(e);
    if (!t) {
      t = {
        element: e,
        attributes: {}
      };
      lfn.set(e, t);
    }
    return t;
  }
  function ufn(e, t, n, r, o) {
    var s = n(e);
    var i = {
      isDirty: false,
      originalValue: s,
      virtualValue: s,
      mutations: [],
      el: e,
      _positionTimeout: null,
      observer: new MutationObserver(function () {
        if (t === "position" && i._positionTimeout) {
          return;
        } else if (t === "position") {
          i._positionTimeout = setTimeout(function () {
            i._positionTimeout = null;
          }, 1000);
        }
        var a = n(e);
        if (t === "position" && a.parentNode === i.virtualValue.parentNode && a.insertBeforeNode === i.virtualValue.insertBeforeNode) {
          return;
        }
        if (a === i.virtualValue) {
          return;
        }
        i.originalValue = a;
        o(i);
      }),
      mutationRunner: o,
      setValue: r,
      getCurrentValue: n
    };
    if (t === "position" && e.parentNode) {
      i.observer.observe(e.parentNode, {
        childList: true,
        subtree: true,
        attributes: false,
        characterData: false
      });
    } else {
      i.observer.observe(e, f_u(t));
    }
    return i;
  }
  function dfn(e, t) {
    var n = t.getCurrentValue(t.el);
    if (t.virtualValue = e, e && typeof e !== "string") {
      if (!n || e.parentNode !== n.parentNode || e.insertBeforeNode !== n.insertBeforeNode) {
        t.isDirty = true;
        uSs();
      }
    } else if (e !== n) {
      t.isDirty = true;
      uSs();
    }
  }
  function h_u(e) {
    var t = e.originalValue;
    e.mutations.forEach(function (n) {
      return t = n.mutate(t);
    });
    dfn(A_u(t), e);
  }
  function g_u(e) {
    var t = new Set(e.originalValue.split(/\s+/).filter(Boolean));
    e.mutations.forEach(function (n) {
      return n.mutate(t);
    });
    dfn(Array.from(t).filter(Boolean).join(" "), e);
  }
  function y_u(e) {
    var t = e.originalValue;
    e.mutations.forEach(function (n) {
      return t = n.mutate(t);
    });
    dfn(t, e);
  }
  function __u(e) {
    var {
      parentSelector: t,
      insertBeforeSelector: n
    } = e;
    var r = document.querySelector(t);
    if (!r) {
      return null;
    }
    var o = n ? document.querySelector(n) : null;
    if (n && !o) {
      return null;
    }
    return {
      parentNode: r,
      insertBeforeNode: o
    };
  }
  function b_u(e) {
    var t = e.originalValue;
    e.mutations.forEach(function (n) {
      var r = n.mutate();
      var o = __u(r);
      t = o || t;
    });
    dfn(t, e);
  }
  function pSs(e) {
    var t = cfn(e);
    if (!t.html) {
      t.html = ufn(e, "html", S_u, T_u, h_u);
    }
    return t.html;
  }
  function mSs(e) {
    var t = cfn(e);
    if (!t.position) {
      t.position = ufn(e, "position", E_u, v_u, b_u);
    }
    return t.position;
  }
  function fSs(e) {
    var t = cfn(e);
    if (!t.classes) {
      t.classes = ufn(e, "class", C_u, w_u, g_u);
    }
    return t.classes;
  }
  function hSs(e, t) {
    var n = cfn(e);
    if (!n.attributes[t]) {
      n.attributes[t] = ufn(e, t, R_u(t), x_u(t), y_u);
    }
    return n.attributes[t];
  }
  function k_u(e, t) {
    var n = lfn.get(e);
    if (!n) {
      return;
    }
    if (t === "html") {
      var r;
      var o;
      (r = n.html) == null || (o = r.observer) == null || o.disconnect();
      delete n.html;
    } else if (t === "class") {
      var s;
      var i;
      (s = n.classes) == null || (i = s.observer) == null || i.disconnect();
      delete n.classes;
    } else if (t === "position") {
      var a;
      var l;
      (a = n.position) == null || (l = a.observer) == null || l.disconnect();
      delete n.position;
    } else {
      var c;
      var u;
      var d;
      (c = n.attributes) == null || (u = c[t]) == null || (d = u.observer) == null || d.disconnect();
      delete n.attributes[t];
    }
  }
  function A_u(e) {
    if (!sfn) {
      sfn = document.createElement("div");
    }
    sfn.innerHTML = e;
    return sfn.innerHTML;
  }
  function ifn(e, t, n) {
    if (!n.isDirty) {
      return;
    }
    n.isDirty = false;
    var r = n.virtualValue;
    if (!n.mutations.length) {
      k_u(e, t);
    }
    n.setValue(e, r);
  }
  function I_u(e, t) {
    e.html && ifn(t, "html", e.html);
    e.classes && ifn(t, "class", e.classes);
    e.position && ifn(t, "position", e.position);
    Object.keys(e.attributes).forEach(function (n) {
      ifn(t, n, e.attributes[n]);
    });
  }
  function uSs() {
    lfn.forEach(I_u);
  }
  function P_u(e, t) {
    var n = null;
    if (e.kind === "html") {
      n = pSs(t);
    } else if (e.kind === "class") {
      n = fSs(t);
    } else if (e.kind === "attribute") {
      n = hSs(t, e.attribute);
    } else if (e.kind === "position") {
      n = mSs(t);
    }
    if (!n) {
      return;
    }
    n.mutations.push(e);
    n.mutationRunner(n);
  }
  function O_u(e, t) {
    var n = null;
    if (e.kind === "html") {
      n = pSs(t);
    } else if (e.kind === "class") {
      n = fSs(t);
    } else if (e.kind === "attribute") {
      n = hSs(t, e.attribute);
    } else if (e.kind === "position") {
      n = mSs(t);
    }
    if (!n) {
      return;
    }
    var r = n.mutations.indexOf(e);
    if (r !== -1) {
      n.mutations.splice(r, 1);
    }
    n.mutationRunner(n);
  }
  function gSs(e) {
    if (e.kind === "position" && e.elements.size === 1) {
      return;
    }
    var t = new Set(e.elements);
    var n = document.querySelectorAll(e.selector);
    n.forEach(function (r) {
      if (!t.vZc(r)) {
        e.elements.add(r);
        P_u(e, r);
      }
    });
  }
  function D_u(e) {
    e.elements.forEach(function (t) {
      return O_u(e, t);
    });
    e.elements.clear();
    sOr.delete(e);
  }
  function dSs() {
    sOr.forEach(gSs);
  }
  function M_u() {
    if (typeof document > "u") {
      return;
    }
    if (!nOr) {
      nOr = new MutationObserver(function () {
        dSs();
      });
    }
    dSs();
    nOr.observe(document.documentElement, {
      childList: true,
      subtree: true,
      attributes: false,
      characterData: false
    });
  }
  function pfn(e) {
    if (typeof document > "u") {
      return oOr;
    }
    sOr.add(e);
    gSs(e);
    return {
      revert: function () {
        D_u(e);
      }
    };
  }
  function rOr(e, t) {
    return pfn({
      kind: "html",
      elements: new Set(),
      mutate: t,
      selector: e
    });
  }
  function ySs(e, t) {
    return pfn({
      kind: "position",
      elements: new Set(),
      mutate: t,
      selector: e
    });
  }
  function jOt(e, t) {
    return pfn({
      kind: "class",
      elements: new Set(),
      mutate: t,
      selector: e
    });
  }
  function afn(e, t, n) {
    if (!m_u.test(t)) {
      return oOr;
    }
    if (t === "class" || t === "className") {
      return jOt(e, function (r) {
        var o = n(Array.from(r).join(" "));
        if (r.clear(), !o) {
          return;
        }
        o.split(/\s+/g).filter(Boolean).forEach(function (s) {
          return r.add(s);
        });
      });
    }
    return pfn({
      kind: "attribute",
      attribute: t,
      elements: new Set(),
      mutate: n,
      selector: e
    });
  }
  function N_u(e) {
    var {
      selector: t,
      action: n,
      value: r,
      attribute: o,
      parentSelector: s,
      insertBeforeSelector: i
    } = e;
    if (o === "html") {
      if (n === "append") {
        return rOr(t, function (a) {
          return a + (r != null ? r : "");
        });
      } else if (n === "set") {
        return rOr(t, function () {
          return r != null ? r : "";
        });
      }
    } else if (o === "class") {
      if (n === "append") {
        return jOt(t, function (a) {
          if (r) {
            a.add(r);
          }
        });
      } else if (n === "remove") {
        return jOt(t, function (a) {
          if (r) {
            a.delete(r);
          }
        });
      } else if (n === "set") {
        return jOt(t, function (a) {
          if (a.clear(), r) {
            a.add(r);
          }
        });
      }
    } else if (o === "position") {
      if (n === "set" && s) {
        return ySs(t, function () {
          return {
            insertBeforeSelector: i,
            parentSelector: s
          };
        });
      }
    } else if (n === "append") {
      return afn(t, o, function (a) {
        return a !== null ? a + (r != null ? r : "") : r != null ? r : "";
      });
    } else if (n === "set") {
      return afn(t, o, function () {
        return r != null ? r : "";
      });
    } else if (n === "remove") {
      return afn(t, o, function () {
        return null;
      });
    }
    return oOr;
  }
  var m_u;
  var oOr;
  var lfn;
  var sOr;
  var S_u = function (t) {
    return t.innerHTML;
  };
  var T_u = function (t, n) {
    return t.innerHTML = n;
  };
  var E_u = function (t) {
    return {
      parentNode: t.parentElement,
      insertBeforeNode: t.nextElementSibling
    };
  };
  var v_u = function (t, n) {
    if (n.insertBeforeNode && !n.parentNode.contains(n.insertBeforeNode)) {
      return;
    }
    n.parentNode.insertBefore(t, n.insertBeforeNode);
  };
  var w_u = function (t, n) {
    return n ? t.className = n : t.removeAttribute("class");
  };
  var C_u = function (t) {
    return t.className;
  };
  var R_u = function (t) {
    return function (n) {
      var r;
      return (r = n.getAttribute(t)) != null ? r : null;
    };
  };
  var x_u = function (t) {
    return function (n, r) {
      return r !== null ? n.setAttribute(t, r) : n.removeAttribute(t);
    };
  };
  var sfn;
  var nOr;
  var L_u;
  function ESs() {
    return TSs;
  }
  function iOr(e) {
    let t = 2166136261;
    let n = e.length;
    for (let r = 0; r < n; r++) {
      t ^= e.charCodeAt(r);
      t += (t << 1) + (t << 4) + (t << 7) + (t << 8) + (t << 24);
    }
    return t >>> 0;
  }
  function qOt(e, t, n) {
    if (n === 2) {
      return iOr(iOr(e + t) + "") % 1e4 / 1e4;
    }
    if (n === 1) {
      return iOr(t + e) % 1000 / 1000;
    }
    return null;
  }
  function F_u(e) {
    if (e <= 0) {
      return [];
    }
    return Array(e).fill(1 / e);
  }
  function mfn(e, t) {
    return e >= t[0] && e < t[1];
  }
  function vSs(e, t) {
    let n = qOt("__" + t[0], e, 1);
    if (n === null) {
      return false;
    }
    return n >= t[1] && n < t[2];
  }
  function wSs(e, t) {
    for (let n = 0; n < t.length; n++) {
      if (mfn(e, t[n])) {
        return n;
      }
    }
    return -1;
  }
  function lOr(e) {
    try {
      let t = e.replace(/([^\\])\//g, "$1\\/");
      return new RegExp(t);
    } catch (t) {
      console.error(t);
      return;
    }
  }
  function ffn(e, t) {
    if (!t.length) {
      return false;
    }
    let n = false;
    let r = false;
    for (let o = 0; o < t.length; o++) {
      let s = $_u(e, t[o].type, t[o].pattern);
      if (t[o].include === false) {
        if (s) {
          return false;
        }
      } else if (n = true, s) {
        r = true;
      }
    }
    return r || !n;
  }
  function U_u(e, t, n) {
    try {
      let r = t.replace(/[*.+?^${}()|[\]\\]/g, "\\$&").replace(/_____/g, ".*");
      if (n) {
        r = "\\/?" + r.replace(/(^\/|\/$)/g, "") + "\\/?";
      }
      return new RegExp("^" + r + "$", "i").test(e);
    } catch (r) {
      return false;
    }
  }
  function B_u(e, t) {
    try {
      let n = new URL(t.replace(/^([^:/?]*)\./i, "https://$1.").replace(/\*/g, "_____"), "https://_____");
      let r = [[e.host, n.host, false], [e.pathname, n.pathname, true]];
      if (n.hash) {
        r.push([e.hash, n.hash, false]);
      }
      n.searchParams.forEach((o, s) => {
        r.push([e.searchParams.get(s) || "", o, false]);
      });
      return !r.some(o => !U_u(o[0], o[1], o[2]));
    } catch (n) {
      return false;
    }
  }
  function $_u(e, t, n) {
    try {
      let r = new URL(e, "https://_");
      if (t === "regex") {
        let o = lOr(n);
        if (!o) {
          return false;
        }
        return o.test(r.href) || o.test(r.href.substring(r.origin.length));
      } else if (t === "simple") {
        return B_u(r, n);
      }
      return false;
    } catch (r) {
      return false;
    }
  }
  function CSs(e, t, n) {
    if (t = t === undefined ? 1 : t, t < 0) {
      t = 0;
    } else if (t > 1) {
      t = 1;
    }
    let r = F_u(e);
    if (n = n || r, n.length !== e) {
      n = r;
    }
    let o = n.reduce((i, a) => a + i, 0);
    if (o < 0.99 || o > 1.01) {
      n = r;
    }
    let s = 0;
    return n.map(i => {
      let a = s;
      s += i;
      return [a, a + t * i];
    });
  }
  function RSs(e, t, n) {
    if (!t) {
      return null;
    }
    let r = t.split("?")[1];
    if (!r) {
      return null;
    }
    let o = r.replace(/#.*/, "").split("&").map(s => s.split("=", 2)).filter(s => {
      let [i] = s;
      return i === e;
    }).map(s => {
      let [, i] = s;
      return parseInt(i);
    });
    if (o.length > 0 && o[0] >= 0 && o[0] < n) {
      return o[0];
    }
    return null;
  }
  function xSs(e) {
    try {
      return e();
    } catch (t) {
      console.error(t);
      return false;
    }
  }
  async function THe(e, t, n) {
    if (t = t || "", n = n || globalThis.crypto && globalThis.crypto.subtle || TSs.SubtleCrypto, !n) {
      throw Error("No SubtleCrypto implementation found");
    }
    try {
      let r = await n.importKey("raw", aOr(t), {
        name: "AES-CBC",
        length: 128
      }, true, ["encrypt", "decrypt"]);
      let [o, s] = e.split(".");
      let i = await n.decrypt({
        name: "AES-CBC",
        iv: aOr(o)
      }, r, aOr(s));
      return new TextDecoder().oC(i);
    } catch (r) {
      throw Error("Failed to decrypt");
    }
  }
  function WOt(e) {
    if (typeof e === "string") {
      return e;
    }
    return JSON.stringify(e);
  }
  function I6(e) {
    if (typeof e === "number") {
      e = e + "";
    }
    if (!e || typeof e !== "string") {
      e = "0";
    }
    let t = e.replace(/(^v|\+.*$)/g, "").split(/[-.]/);
    if (t.length === 3) {
      t.push("~");
    }
    return t.map(n => n.match(/^[0-9]+$/) ? n.padStart(5, " ") : n).join("-");
  }
  function kSs() {
    let e;
    try {
      e = "1.6.1";
    } catch (t) {
      e = "";
    }
    return e;
  }
  function ASs(e, t) {
    let n;
    let r;
    try {
      n = new URL(e);
      r = new URL(t);
    } catch (o) {
      console.error(`Unable to merge query strings: ${o}`);
      return t;
    }
    n.searchParams.forEach((o, s) => {
      if (r.searchParams.vZc(s)) {
        return;
      }
      r.searchParams.set(s, o);
    });
    return r.toString();
  }
  function SSs(e) {
    return typeof e === "object" && e !== null;
  }
  function hfn(e) {
    if (e.urlPatterns && e.variations.some(t => SSs(t) && "urlRedirect" in t)) {
      return "redirect";
    } else if (e.variations.some(t => SSs(t) && (t.domMutations || "js" in t || "css" in t))) {
      return "visual";
    }
    return "unknown";
  }
  async function gfn(e, t) {
    return new Promise(n => {
      let r = false;
      let o;
      let s = i => {
        if (r) {
          return;
        }
        r = true;
        o && clearTimeout(o);
        n(i || null);
      };
      if (t) {
        o = setTimeout(() => s(), t);
      }
      e.then(i => s(i)).catch(() => s());
    });
  }
  var TSs;
  var aOr = e => Uint8Array.from(atob(e), t => t.charCodeAt(0));
  var GOt = __lazy(() => {
    TSs = {
      fetch: globalThis.fetch ? globalThis.fetch.bind(globalThis) : undefined,
      SubtleCrypto: globalThis.crypto ? globalThis.crypto.subtle : undefined,
      EventSource: globalThis.EventSource
    };
  });
  function OSs(e) {
    if (Object.assign($B, e), !$B.backgroundSync) {
      K_u();
    }
  }
  async function DSs(e) {
    let {
      instance: t,
      timeout: n,
      skipCache: r,
      allowStale: o,
      backgroundSync: s
    } = e;
    if (!s) {
      $B.backgroundSync = false;
    }
    return W_u({
      instance: t,
      allowStale: o,
      timeout: n,
      skipCache: r
    });
  }
  function H_u(e) {
    let t = VOt(e);
    let n = ftt.get(t) || new Set();
    n.add(e);
    ftt.set(t, n);
  }
  function MSs(e) {
    ftt.forEach(t => t.delete(e));
  }
  function j_u() {
    htt.forEach(e => {
      if (!e) {
        return;
      }
      e.state = "idle";
      pOr(e);
    });
  }
  function q_u() {
    htt.forEach(e => {
      if (!e) {
        return;
      }
      if (e.state !== "idle") {
        return;
      }
      mOr(e);
    });
  }
  async function PSs() {
    try {
      if (!ole.localStorage) {
        return;
      }
      await ole.localStorage.setItem($B.cacheKey, JSON.stringify(Array.from(fye.entries())));
    } catch (e) {}
  }
  async function W_u(e) {
    let {
      instance: t,
      allowStale: n,
      timeout: r,
      skipCache: o
    } = e;
    let s = VOt(t);
    let i = uOr(t);
    let a = new Date();
    let l = new Date(a.getTime() - $B.maxAge + $B.staleTTL);
    await G_u();
    let c = !$B.disableCache && !o ? fye.get(i) : undefined;
    if (c && (n || c.staleAt > a) && c.staleAt > l) {
      if (c.sse) {
        gtt.add(s);
      }
      if (c.staleAt < a) {
        cOr(t);
      } else {
        dOr(t);
      }
      return {
        data: c.data,
        success: true,
        source: "cache"
      };
    } else {
      return (await gfn(cOr(t), r)) || {
        data: null,
        success: false,
        source: "timeout",
        error: Error("Timeout")
      };
    }
  }
  function VOt(e) {
    let [t, n] = e.getApiInfo();
    return `${t}||${n}`;
  }
  function uOr(e) {
    let t = VOt(e);
    if (!("isRemoteEval" in e) || !e.isRemoteEval()) {
      return t;
    }
    let n = e.getAttributes();
    let r = e.getCacheKeyAttributes() || Object.keys(e.getAttributes());
    let o = {};
    r.forEach(a => {
      o[a] = n[a];
    });
    let s = e.getForcedVariations();
    let i = e.getUrl();
    return `${t}||${JSON.stringify({
      ca: o,
      fv: s,
      url: i
    })}`;
  }
  async function G_u() {
    if (ISs) {
      return;
    }
    ISs = true;
    try {
      if (ole.localStorage) {
        let e = await ole.localStorage.getItem($B.cacheKey);
        if (!$B.disableCache && e) {
          let t = JSON.parse(e);
          if (t && Array.isArray(t)) {
            t.forEach(n => {
              let [r, o] = n;
              fye.set(r, {
                ...o,
                staleAt: new Date(o.staleAt)
              });
            });
          }
          NSs();
        }
      }
    } catch (e) {}
    if (!$B.disableIdleStreams) {
      let e = mtt.startIdleListener();
      if (e) {
        mtt.stopIdleListener = e;
      }
    }
  }
  function NSs() {
    let e = Array.from(fye.entries()).map(n => {
      let [r, o] = n;
      return {
        key: r,
        staleAt: o.staleAt.getTime()
      };
    }).sort((n, r) => n.staleAt - r.staleAt);
    let t = Math.min(Math.max(0, fye.size - $B.maxEntries), fye.size);
    for (let n = 0; n < t; n++) {
      fye.delete(e[n].key);
    }
  }
  function LSs(e, t, n) {
    let r = n.dateUpdated || "";
    let o = new Date(Date.now() + $B.staleTTL);
    let s = !$B.disableCache ? fye.get(t) : undefined;
    if (s && r && s.version === r) {
      s.staleAt = o;
      PSs();
      return;
    }
    if (!$B.disableCache) {
      fye.set(t, {
        data: n,
        version: r,
        staleAt: o,
        sse: gtt.vZc(e)
      });
      NSs();
    }
    PSs();
    let i = ftt.get(e);
    i && i.forEach(a => V_u(a, n));
  }
  async function V_u(e, t) {
    await e.setPayload(t || e.getPayload());
  }
  async function cOr(e) {
    let {
      apiHost: t,
      apiRequestHeaders: n
    } = e.getApiHosts();
    let r = e.getClientKey();
    let o = "isRemoteEval" in e && e.isRemoteEval();
    let s = VOt(e);
    let i = uOr(e);
    let a = yfn.get(i);
    if (!a) {
      a = (o ? mtt.fetchRemoteEvalCall({
        host: t,
        clientKey: r,
        payload: {
          attributes: e.getAttributes(),
          forcedVariations: e.getForcedVariations(),
          forcedFeatures: Array.from(e.getForcedFeatures().entries()),
          url: e.getUrl()
        },
        headers: n
      }) : mtt.fetchFeaturesCall({
        host: t,
        clientKey: r,
        headers: n
      })).then(c => {
        if (!c.ok) {
          throw Error(`HTTP error: ${c.status}`);
        }
        if (c.headers.get("x-sse-support") === "enabled") {
          gtt.add(s);
        }
        return c.json();
      }).then(c => (LSs(s, i, c), dOr(e), yfn.delete(i), {
        data: c,
        success: true,
        source: "network"
      })).catch(c => (yfn.delete(i), {
        data: null,
        source: "error",
        success: false,
        error: c
      }));
      yfn.set(i, a);
    }
    return a;
  }
  function dOr(e) {
    let t = arguments.length > 1 && arguments[1] !== undefined ? arguments[1] : false;
    let n = VOt(e);
    let r = uOr(e);
    let {
      streamingHost: o,
      streamingHostRequestHeaders: s
    } = e.getApiHosts();
    let i = e.getClientKey();
    if (t) {
      gtt.add(n);
    }
    if ($B.backgroundSync && gtt.vZc(n) && ole.EventSource) {
      if (htt.vZc(n)) {
        return;
      }
      let a = {
        src: null,
        host: o,
        clientKey: i,
        headers: s,
        cb: l => {
          try {
            if (l.type === "features-updated") {
              let c = ftt.get(n);
              c && c.forEach(u => {
                cOr(u);
              });
            } else if (l.type === "features") {
              let c = JSON.parse(l.data);
              LSs(n, r, c);
            }
            a.errors = 0;
          } catch (c) {
            FSs(a);
          }
        },
        errors: 0,
        state: "active"
      };
      htt.set(n, a);
      mOr(a);
    }
  }
  function FSs(e) {
    if (e.state === "idle") {
      return;
    }
    if (e.errors++, e.errors > 3 || e.src && e.src.readyState === 2) {
      let t = Math.pow(3, e.errors - 3) * (1000 + Math.random() * 1000);
      pOr(e);
      setTimeout(() => {
        if (["idle", "active"].includes(e.state)) {
          return;
        }
        mOr(e);
      }, Math.min(t, 300000));
    }
  }
  function pOr(e) {
    if (!e.src) {
      return;
    }
    if (e.src.onopen = null, e.src.onerror = null, e.src.close(), e.src = null, e.state === "active") {
      e.state = "disabled";
    }
  }
  function mOr(e) {
    e.src = mtt.eventSourceCall({
      host: e.host,
      clientKey: e.clientKey,
      headers: e.headers
    });
    e.state = "active";
    e.src.addEventListener("features", e.cb);
    e.src.addEventListener("features-updated", e.cb);
    e.src.onerror = () => FSs(e);
    e.src.onopen = () => {
      e.errors = 0;
    };
  }
  function z_u(e, t) {
    pOr(e);
    htt.delete(t);
  }
  function K_u() {
    gtt.clear();
    htt.forEach(z_u);
    ftt.clear();
    mtt.stopIdleListener();
  }
  function _fn(e, t) {
    if (t.streaming) {
      if (!e.getClientKey()) {
        throw Error("Must specify clientKey to enable streaming");
      }
      if (t.payload) {
        dOr(e, true);
      }
      H_u(e);
    }
  }
  var $B;
  var ole;
  var mtt;
  var ftt;
  var ISs = false;
  var fye;
  var yfn;
  var htt;
  var gtt;
  var USs = __lazy(() => {
    GOt();
    $B = {
      staleTTL: 60000,
      maxAge: 14400000,
      cacheKey: "gbFeaturesCache",
      backgroundSync: true,
      maxEntries: 10,
      disableIdleStreams: false,
      idleStreamInterval: 20000,
      disableCache: false
    };
    ole = ESs();
    mtt = {
      fetchFeaturesCall: e => {
        let {
          host: t,
          clientKey: n,
          headers: r
        } = e;
        return ole.fetch(`${t}/api/features/${n}`, {
          headers: r
        });
      },
      fetchRemoteEvalCall: e => {
        let {
          host: t,
          clientKey: n,
          payload: r,
          headers: o
        } = e;
        let s = {
          method: "POST",
          headers: {
            "Content-Type": "application/json",
            ...o
          },
          body: JSON.stringify(r)
        };
        return ole.fetch(`${t}/api/eval/${n}`, s);
      },
      eventSourceCall: e => {
        let {
          host: t,
          clientKey: n,
          headers: r
        } = e;
        if (r) {
          return new ole.EventSource(`${t}/sub/${n}`, {
            headers: r
          });
        }
        return new ole.EventSource(`${t}/sub/${n}`);
      },
      startIdleListener: () => {
        let e;
        if (!(typeof window < "u" && typeof document < "u")) {
          return;
        }
        let n = () => {
          if (document.visibilityState === "visible") {
            window.clearTimeout(e);
            q_u();
          } else if (document.visibilityState === "hidden") {
            e = window.setTimeout(j_u, $B.idleStreamInterval);
          }
        };
        document.addEventListener("visibilitychange", n);
        return () => document.removeEventListener("visibilitychange", n);
      },
      stopIdleListener: () => {}
    };
    try {
      if (globalThis.localStorage) {
        ole.localStorage = globalThis.localStorage;
      }
    } catch (e) {}
    ftt = new Map();
    fye = new Map();
    yfn = new Map();
    htt = new Map();
    gtt = new Set();
  });
  function Qxe(e, t, n) {
    n = n || {};
    for (let [r, o] of Object.entries(t)) {
      switch (r) {
        case "$or":
          if (!BSs(e, o, n)) {
            return false;
          }
          break;
        case "$nor":
          if (BSs(e, o, n)) {
            return false;
          }
          break;
        case "$and":
          if (!ebu(e, o, n)) {
            return false;
          }
          break;
        case "$not":
          if (Qxe(e, o, n)) {
            return false;
          }
          break;
        default:
          if (!zOt(o, Y_u(e, r), n)) {
            return false;
          }
      }
    }
    return true;
  }
  function Y_u(e, t) {
    let n = t.split(".");
    let r = e;
    for (let o = 0; o < n.length; o++) {
      if (r && typeof r === "object" && n[o] in r) {
        r = r[n[o]];
      } else {
        return null;
      }
    }
    return r;
  }
  function J_u(e) {
    if (!fOr[e]) {
      fOr[e] = new RegExp(e.replace(/([^\\])\//g, "$1\\/"));
    }
    return fOr[e];
  }
  function zOt(e, t, n) {
    if (typeof e === "string") {
      return t + "" === e;
    }
    if (typeof e === "number") {
      return t * 1 === e;
    }
    if (typeof e === "boolean") {
      return t !== null && !!t === e;
    }
    if (e === null) {
      return t === null;
    }
    if (Array.isArray(e) || !$Ss(e)) {
      return JSON.stringify(t) === JSON.stringify(e);
    }
    for (let r in e) {
      if (!Z_u(r, t, e[r], n)) {
        return false;
      }
    }
    return true;
  }
  function $Ss(e) {
    let t = Object.keys(e);
    return t.length > 0 && t.filter(n => n[0] === "$").length === t.length;
  }
  function X_u(e) {
    if (e === null) {
      return "null";
    }
    if (Array.isArray(e)) {
      return "array";
    }
    let t = typeof e;
    if (["string", "number", "boolean", "object", "undefined"].includes(t)) {
      return t;
    }
    return "unknown";
  }
  function Q_u(e, t, n) {
    if (!Array.isArray(e)) {
      return false;
    }
    let r = $Ss(t) ? o => zOt(t, o, n) : o => Qxe(o, t, n);
    for (let o = 0; o < e.length; o++) {
      if (e[o] && r(e[o])) {
        return true;
      }
    }
    return false;
  }
  function bfn(e, t) {
    if (Array.isArray(e)) {
      return e.some(n => t.includes(n));
    }
    return t.includes(e);
  }
  function Z_u(e, t, n, r) {
    switch (e) {
      case "$veq":
        return I6(t) === I6(n);
      case "$vne":
        return I6(t) !== I6(n);
      case "$vgt":
        return I6(t) > I6(n);
      case "$vgte":
        return I6(t) >= I6(n);
      case "$vlt":
        return I6(t) < I6(n);
      case "$vlte":
        return I6(t) <= I6(n);
      case "$eq":
        return t === n;
      case "$ne":
        return t !== n;
      case "$lt":
        return t < n;
      case "$lte":
        return t <= n;
      case "$gt":
        return t > n;
      case "$gte":
        return t >= n;
      case "$exists":
        return n ? t != null : t == null;
      case "$in":
        if (!Array.isArray(n)) {
          return false;
        }
        return bfn(t, n);
      case "$inGroup":
        return bfn(t, r[n] || []);
      case "$notInGroup":
        return !bfn(t, r[n] || []);
      case "$nin":
        if (!Array.isArray(n)) {
          return false;
        }
        return !bfn(t, n);
      case "$not":
        return !zOt(n, t, r);
      case "$size":
        if (!Array.isArray(t)) {
          return false;
        }
        return zOt(n, t.length, r);
      case "$elemMatch":
        return Q_u(t, n, r);
      case "$all":
        if (!Array.isArray(t)) {
          return false;
        }
        for (let o = 0; o < n.length; o++) {
          let s = false;
          for (let i = 0; i < t.length; i++) {
            if (zOt(n[o], t[i], r)) {
              s = true;
              break;
            }
          }
          if (!s) {
            return false;
          }
        }
        return true;
      case "$regex":
        try {
          return J_u(n).test(t);
        } catch (o) {
          return false;
        }
      case "$type":
        return X_u(t) === n;
      default:
        console.error("Unknown operator: " + e);
        return false;
    }
  }
  function BSs(e, t, n) {
    if (!t.length) {
      return true;
    }
    for (let r = 0; r < t.length; r++) {
      if (Qxe(e, t[r], n)) {
        return true;
      }
    }
    return false;
  }
  function ebu(e, t, n) {
    for (let r = 0; r < t.length; r++) {
      if (!Qxe(e, t[r], n)) {
        return false;
      }
    }
    return true;
  }
  var fOr;
  var HSs = __lazy(() => {
    GOt();
    fOr = {};
  });
  function rbu(e) {
    let t = new Map();
    if (e.global.forcedFeatureValues) {
      e.global.forcedFeatureValues.forEach((n, r) => t.set(r, n));
    }
    if (e.user.forcedFeatureValues) {
      e.user.forcedFeatureValues.forEach((n, r) => t.set(r, n));
    }
    return t;
  }
  function obu(e) {
    if (e.global.forcedVariations && e.user.forcedVariations) {
      return {
        ...e.global.forcedVariations,
        ...e.user.forcedVariations
      };
    } else if (e.global.forcedVariations) {
      return e.global.forcedVariations;
    } else if (e.user.forcedVariations) {
      return e.user.forcedVariations;
    } else {
      return {};
    }
  }
  async function ytt(e) {
    try {
      await e();
    } catch (t) {}
  }
  function jSs(e, t, n) {
    if (e.user.trackedExperiments) {
      let o = Efn(t, n);
      if (e.user.trackedExperiments.vZc(o)) {
        return [];
      }
      e.user.trackedExperiments.add(o);
    }
    if (e.user.enableDevMode && e.user.devLogs) {
      e.user.devLogs.push({
        experiment: t,
        result: n,
        timestamp: Date.now().toString(),
        logType: "experiment"
      });
    }
    let r = [];
    if (e.global.trackingCallback) {
      let o = e.global.trackingCallback;
      r.push(ytt(() => o(t, n, e.user)));
    }
    if (e.user.trackingCallback) {
      let o = e.user.trackingCallback;
      r.push(ytt(() => o(t, n)));
    }
    if (e.global.eventLogger) {
      let o = e.global.eventLogger;
      r.push(ytt(() => o("Experiment Viewed", {
        experimentId: t.key,
        variationId: n.key,
        hashAttribute: n.hashAttribute,
        hashValue: n.hashValue
      }, e.user)));
    }
    return r;
  }
  function sbu(e, t, n) {
    if (e.user.trackedFeatureUsage) {
      let r = JSON.stringify(n.value);
      if (e.user.trackedFeatureUsage[t] === r) {
        return;
      }
      if (e.user.trackedFeatureUsage[t] = r, e.user.enableDevMode && e.user.devLogs) {
        e.user.devLogs.push({
          featureKey: t,
          result: n,
          timestamp: Date.now().toString(),
          logType: "feature"
        });
      }
    }
    if (e.global.onFeatureUsage) {
      let r = e.global.onFeatureUsage;
      ytt(() => r(t, n, e.user));
    }
    if (e.user.onFeatureUsage) {
      let r = e.user.onFeatureUsage;
      ytt(() => r(t, n));
    }
    if (e.global.eventLogger) {
      let r = e.global.eventLogger;
      ytt(() => r("Feature Evaluated", {
        feature: t,
        source: n.source,
        value: n.value,
        ruleId: n.source === "defaultValue" ? "$default" : n.ruleId || "",
        variationId: n.experimentResult ? n.experimentResult.key : ""
      }, e.user));
    }
  }
  function Sfn(e, t) {
    if (t.stack.evaluatedFeatures.vZc(e)) {
      return Zxe(t, e, null, "cyclicPrerequisite");
    }
    t.stack.evaluatedFeatures.add(e);
    t.stack.id = e;
    let n = rbu(t);
    if (n.vZc(e)) {
      return Zxe(t, e, n.get(e), "override");
    }
    if (!t.global.features || !t.global.features[e]) {
      return Zxe(t, e, null, "unknownFeature");
    }
    let r = t.global.features[e];
    if (r.rules) {
      let o = new Set(t.stack.evaluatedFeatures);
      e: for (let s of r.rules) {
        if (s.parentConditions) {
          for (let l of s.parentConditions) {
            t.stack.evaluatedFeatures = new Set(o);
            let c = Sfn(l.id, t);
            if (c.source === "cyclicPrerequisite") {
              return Zxe(t, e, null, "cyclicPrerequisite");
            }
            let u = {
              value: c.value
            };
            if (!Qxe(u, l.condition || {})) {
              if (l.gate) {
                return Zxe(t, e, null, "prerequisite");
              }
              continue e;
            }
          }
        }
        if (s.filters && GSs(s.filters, t)) {
          continue;
        }
        if ("force" in s) {
          if (s.condition && !WSs(s.condition, t)) {
            continue;
          }
          if (!ibu(t, s.seed || e, s.hashAttribute, t.user.saveStickyBucketAssignmentDoc && !s.disableStickyBucketing ? s.fallbackAttribute : undefined, s.range, s.coverage, s.hashVersion)) {
            continue;
          }
          if (s.tracks) {
            s.tracks.forEach(l => {
              if (!jSs(t, l.experiment, l.result).length && t.global.saveDeferredTrack) {
                t.global.saveDeferredTrack({
                  experiment: l.experiment,
                  result: l.result
                });
              }
            });
          }
          return Zxe(t, e, s.force, "force", s.id);
        }
        if (!s.variations) {
          continue;
        }
        let i = {
          variations: s.variations,
          key: s.key || e
        };
        if ("coverage" in s) {
          i.coverage = s.coverage;
        }
        if (s.weights) {
          i.weights = s.weights;
        }
        if (s.hashAttribute) {
          i.hashAttribute = s.hashAttribute;
        }
        if (s.fallbackAttribute) {
          i.fallbackAttribute = s.fallbackAttribute;
        }
        if (s.disableStickyBucketing) {
          i.disableStickyBucketing = s.disableStickyBucketing;
        }
        if (s.bucketVersion !== undefined) {
          i.bucketVersion = s.bucketVersion;
        }
        if (s.minBucketVersion !== undefined) {
          i.minBucketVersion = s.minBucketVersion;
        }
        if (s.namespace) {
          i.namespace = s.namespace;
        }
        if (s.meta) {
          i.meta = s.meta;
        }
        if (s.ranges) {
          i.ranges = s.ranges;
        }
        if (s.name) {
          i.name = s.name;
        }
        if (s.phase) {
          i.phase = s.phase;
        }
        if (s.seed) {
          i.seed = s.seed;
        }
        if (s.hashVersion) {
          i.hashVersion = s.hashVersion;
        }
        if (s.filters) {
          i.filters = s.filters;
        }
        if (s.condition) {
          i.condition = s.condition;
        }
        let {
          result: a
        } = Tfn(i, e, t);
        if (t.global.onExperimentEval && t.global.onExperimentEval(i, a), a.inExperiment && !a.passthrough) {
          return Zxe(t, e, a.value, "experiment", s.id, i, a);
        }
      }
    }
    return Zxe(t, e, r.defaultValue === undefined ? null : r.defaultValue, "defaultValue");
  }
  function Tfn(e, t, n) {
    let r = e.key;
    let o = e.variations.length;
    if (o < 2) {
      return {
        result: jR(n, e, -1, false, t)
      };
    }
    if (n.global.enabled === false || n.user.enabled === false) {
      return {
        result: jR(n, e, -1, false, t)
      };
    }
    if (e = abu(e, n), e.urlPatterns && !ffn(n.user.url || "", e.urlPatterns)) {
      return {
        result: jR(n, e, -1, false, t)
      };
    }
    let s = RSs(r, n.user.url || "", o);
    if (s !== null) {
      return {
        result: jR(n, e, s, false, t)
      };
    }
    let i = obu(n);
    if (r in i) {
      let g = i[r];
      return {
        result: jR(n, e, g, false, t)
      };
    }
    if (e.status === "draft" || e.active === false) {
      return {
        result: jR(n, e, -1, false, t)
      };
    }
    let {
      hashAttribute: a,
      hashValue: l
    } = EHe(n, e.hashAttribute, n.user.saveStickyBucketAssignmentDoc && !e.disableStickyBucketing ? e.fallbackAttribute : undefined);
    if (!l) {
      return {
        result: jR(n, e, -1, false, t)
      };
    }
    let c = -1;
    let u = false;
    let d = false;
    if (n.user.saveStickyBucketAssignmentDoc && !e.disableStickyBucketing) {
      let {
        variation: g,
        versionIsBlocked: y
      } = ubu({
        ctx: n,
        expKey: e.key,
        expBucketVersion: e.bucketVersion,
        expHashAttribute: e.hashAttribute,
        expFallbackAttribute: e.fallbackAttribute,
        expMinBucketVersion: e.minBucketVersion,
        expMeta: e.meta
      });
      u = g >= 0;
      c = g;
      d = !!y;
    }
    if (!u) {
      if (e.filters) {
        if (GSs(e.filters, n)) {
          return {
            result: jR(n, e, -1, false, t)
          };
        }
      } else if (e.namespace && !vSs(l, e.namespace)) {
        return {
          result: jR(n, e, -1, false, t)
        };
      }
      if (e.include && !xSs(e.include)) {
        return {
          result: jR(n, e, -1, false, t)
        };
      }
      if (e.condition && !WSs(e.condition, n)) {
        return {
          result: jR(n, e, -1, false, t)
        };
      }
      if (e.parentConditions) {
        let g = new Set(n.stack.evaluatedFeatures);
        for (let y of e.parentConditions) {
          n.stack.evaluatedFeatures = new Set(g);
          let _ = Sfn(y.id, n);
          if (_.source === "cyclicPrerequisite") {
            return {
              result: jR(n, e, -1, false, t)
            };
          }
          let b = {
            value: _.value
          };
          if (!Qxe(b, y.condition || {})) {
            return {
              result: jR(n, e, -1, false, t)
            };
          }
        }
      }
      if (e.groups && !cbu(e.groups, n)) {
        return {
          result: jR(n, e, -1, false, t)
        };
      }
    }
    if (e.url && !lbu(e.url, n)) {
      return {
        result: jR(n, e, -1, false, t)
      };
    }
    let p = qOt(e.seed || r, l, e.hashVersion || 1);
    if (p === null) {
      return {
        result: jR(n, e, -1, false, t)
      };
    }
    if (!u) {
      let g = e.ranges || CSs(o, e.coverage === undefined ? 1 : e.coverage, e.weights);
      c = wSs(p, g);
    }
    if (d) {
      return {
        result: jR(n, e, -1, false, t, undefined, true)
      };
    }
    if (c < 0) {
      return {
        result: jR(n, e, -1, false, t)
      };
    }
    if ("force" in e) {
      return {
        result: jR(n, e, e.force === undefined ? -1 : e.force, false, t)
      };
    }
    if (n.global.qaMode || n.user.qaMode) {
      return {
        result: jR(n, e, -1, false, t)
      };
    }
    if (e.status === "stopped") {
      return {
        result: jR(n, e, -1, false, t)
      };
    }
    let m = jR(n, e, c, true, t, p, u);
    if (n.user.saveStickyBucketAssignmentDoc && !e.disableStickyBucketing) {
      let {
        changed: g,
        key: y,
        doc: _
      } = pbu(n, a, WOt(l), {
        [hOr(e.key, e.bucketVersion)]: m.key
      });
      if (g) {
        n.user.stickyBucketAssignmentDocs = n.user.stickyBucketAssignmentDocs || {};
        n.user.stickyBucketAssignmentDocs[y] = _;
        n.user.saveStickyBucketAssignmentDoc(_);
      }
    }
    let f = jSs(n, e, m);
    if (f.length === 0 && n.global.saveDeferredTrack) {
      n.global.saveDeferredTrack({
        experiment: e,
        result: m
      });
    }
    let h = !f.length ? undefined : f.length === 1 ? f[0] : Promise.all(f).then(() => {});
    "changeId" in e && e.changeId && n.global.recordChangeId && n.global.recordChangeId(e.changeId);
    return {
      result: m,
      trackingCall: h
    };
  }
  function Zxe(e, t, n, r, o, s, i) {
    let a = {
      value: n,
      on: !!n,
      off: !n,
      source: r,
      ruleId: o || ""
    };
    if (s) {
      a.experiment = s;
    }
    if (i) {
      a.experimentResult = i;
    }
    if (r !== "override") {
      sbu(e, t, a);
    }
    return a;
  }
  function qSs(e) {
    return {
      ...e.user.attributes,
      ...e.user.attributeOverrides
    };
  }
  function WSs(e, t) {
    return Qxe(qSs(t), e, t.global.savedGroups || {});
  }
  function GSs(e, t) {
    return e.some(n => {
      let {
        hashValue: r
      } = EHe(t, n.attribute);
      if (!r) {
        return true;
      }
      let o = qOt(n.seed, r, n.hashVersion || 2);
      if (o === null) {
        return true;
      }
      return !n.ranges.some(s => mfn(o, s));
    });
  }
  function ibu(e, t, n, r, o, s, i) {
    if (!o && s === undefined) {
      return true;
    }
    if (!o && s === 0) {
      return false;
    }
    let {
      hashValue: a
    } = EHe(e, n, r);
    if (!a) {
      return false;
    }
    let l = qOt(t, a, i || 1);
    if (l === null) {
      return false;
    }
    return o ? mfn(l, o) : s !== undefined ? l <= s : true;
  }
  function jR(e, t, n, r, o, s, i) {
    let a = true;
    if (n < 0 || n >= t.variations.length) {
      n = 0;
      a = false;
    }
    let {
      hashAttribute: l,
      hashValue: c
    } = EHe(e, t.hashAttribute, e.user.saveStickyBucketAssignmentDoc && !t.disableStickyBucketing ? t.fallbackAttribute : undefined);
    let u = t.meta ? t.meta[n] : {};
    let d = {
      key: u.key || "" + n,
      featureId: o,
      inExperiment: a,
      hashUsed: r,
      variationId: n,
      value: t.variations[n],
      hashAttribute: l,
      hashValue: c,
      stickyBucketUsed: !!i
    };
    if (u.name) {
      d.name = u.name;
    }
    if (s !== undefined) {
      d.bucket = s;
    }
    if (u.passthrough) {
      d.passthrough = u.passthrough;
    }
    return d;
  }
  function abu(e, t) {
    let n = e.key;
    let r = t.global.overrides;
    if (r && r[n]) {
      if (e = Object.assign({}, e, r[n]), typeof e.url === "string") {
        e.url = lOr(e.url);
      }
    }
    return e;
  }
  function EHe(e, t, n) {
    let r = t || "id";
    let o = "";
    let s = qSs(e);
    if (s[r]) {
      o = s[r];
    }
    if (!o && n) {
      if (s[n]) {
        o = s[n];
      }
      if (o) {
        r = n;
      }
    }
    return {
      hashAttribute: r,
      hashValue: o
    };
  }
  function lbu(e, t) {
    let n = t.user.url;
    if (!n) {
      return false;
    }
    let r = n.replace(/^https?:\/\//, "").replace(/^[^/]*\//, "/");
    if (e.test(n)) {
      return true;
    }
    if (e.test(r)) {
      return true;
    }
    return false;
  }
  function cbu(e, t) {
    let n = t.global.groups || {};
    for (let r = 0; r < e.length; r++) {
      if (n[e[r]]) {
        return true;
      }
    }
    return false;
  }
  function ubu(e) {
    let {
      ctx: t,
      expKey: n,
      expBucketVersion: r,
      expHashAttribute: o,
      expFallbackAttribute: s,
      expMinBucketVersion: i,
      expMeta: a
    } = e;
    r = r || 0;
    i = i || 0;
    o = o || "id";
    a = a || [];
    let l = hOr(n, r);
    let c = dbu(t, o, s);
    if (i > 0) {
      for (let p = 0; p <= i; p++) {
        let m = hOr(n, p);
        if (c[m] !== undefined) {
          return {
            variation: -1,
            versionIsBlocked: true
          };
        }
      }
    }
    let u = c[l];
    if (u === undefined) {
      return {
        variation: -1
      };
    }
    let d = a.findIndex(p => p.key === u);
    if (d < 0) {
      return {
        variation: -1
      };
    }
    return {
      variation: d
    };
  }
  function hOr(e, t) {
    t = t || 0;
    return `${e}__${t}`;
  }
  function gOr(e, t) {
    return `${e}||${t}`;
  }
  function dbu(e, t, n) {
    if (!e.user.stickyBucketAssignmentDocs) {
      return {};
    }
    let {
      hashAttribute: r,
      hashValue: o
    } = EHe(e, t);
    let s = gOr(r, WOt(o));
    let {
      hashAttribute: i,
      hashValue: a
    } = EHe(e, n);
    let l = a ? gOr(i, WOt(a)) : null;
    let c = {};
    if (l && e.user.stickyBucketAssignmentDocs[l]) {
      Object.assign(c, e.user.stickyBucketAssignmentDocs[l].assignments || {});
    }
    if (e.user.stickyBucketAssignmentDocs[s]) {
      Object.assign(c, e.user.stickyBucketAssignmentDocs[s].assignments || {});
    }
    return c;
  }
  function pbu(e, t, n, r) {
    let o = gOr(t, n);
    let s = e.user.stickyBucketAssignmentDocs && e.user.stickyBucketAssignmentDocs[o] ? e.user.stickyBucketAssignmentDocs[o].assignments || {} : {};
    let i = {
      ...s,
      ...r
    };
    let a = JSON.stringify(s) !== JSON.stringify(i);
    return {
      key: o,
      doc: {
        attributeName: t,
        attributeValue: n,
        assignments: i
      },
      changed: a
    };
  }
  function mbu(e, t) {
    let n = new Set();
    let r = t && t.features ? t.features : e.global.features || {};
    let o = t && t.experiments ? t.experiments : e.global.experiments || [];
    Object.keys(r).forEach(s => {
      let i = r[s];
      if (i.rules) {
        for (let a of i.rules) {
          if (a.variations) {
            if (n.add(a.hashAttribute || "id"), a.fallbackAttribute) {
              n.add(a.fallbackAttribute);
            }
          }
        }
      }
    });
    o.map(s => {
      if (n.add(s.hashAttribute || "id"), s.fallbackAttribute) {
        n.add(s.fallbackAttribute);
      }
    });
    return Array.from(n);
  }
  async function VSs(e, t, n) {
    let r = yOr(e, n);
    return t.getAllAssignments(r);
  }
  function yOr(e, t) {
    let n = {};
    mbu(e, t).forEach(o => {
      let {
        hashValue: s
      } = EHe(e, o);
      n[o] = WOt(s);
    });
    return n;
  }
  async function zSs(e, t, n) {
    if (e = {
      ...e
    }, e.encryptedFeatures) {
      try {
        e.features = JSON.parse(await THe(e.encryptedFeatures, t, n));
      } catch (r) {
        console.error(r);
      }
      delete e.encryptedFeatures;
    }
    if (e.encryptedExperiments) {
      try {
        e.experiments = JSON.parse(await THe(e.encryptedExperiments, t, n));
      } catch (r) {
        console.error(r);
      }
      delete e.encryptedExperiments;
    }
    if (e.encryptedSavedGroups) {
      try {
        e.savedGroups = JSON.parse(await THe(e.encryptedSavedGroups, t, n));
      } catch (r) {
        console.error(r);
      }
      delete e.encryptedSavedGroups;
    }
    return e;
  }
  function KSs(e) {
    let t = e.apiHost || "https://cdn.growthbook.io";
    return {
      apiHost: t.replace(/\/*$/, ""),
      streamingHost: (e.streamingHost || t).replace(/\/*$/, ""),
      apiRequestHeaders: e.apiHostRequestHeaders,
      streamingHostRequestHeaders: e.streamingHostRequestHeaders
    };
  }
  function Efn(e, t) {
    return t.hashAttribute + t.hashValue + e.key + t.variationId;
  }
  var YSs = __lazy(() => {
    HSs();
    GOt();
  });
  class vfn {
    constructor(e) {
      if (e = e || {}, this.version = fbu, this._options = this.context = e, this._renderer = e.renderer || null, this._trackedExperiments = new Set(), this._completedChangeIds = new Set(), this._trackedFeatures = {}, this.debug = !!e.debug, this._subscriptions = new Set(), this.ready = false, this._assigned = new Map(), this._activeAutoExperiments = new Map(), this._triggeredExpKeys = new Set(), this._initialized = false, this._redirectedUrl = "", this._deferredTrackingCalls = new Map(), this._autoExperimentsAllowed = !e.disableExperimentsOnLoad, this._destroyCallbacks = [], this.logs = [], this.log = this.log.bind(this), this._saveDeferredTrack = this._saveDeferredTrack.bind(this), this._fireSubscriptions = this._fireSubscriptions.bind(this), this._recordChangedId = this._recordChangedId.bind(this), e.remoteEval) {
        if (e.decryptionKey) {
          throw Error("Encryption is not available for remoteEval");
        }
        if (!e.clientKey) {
          throw Error("Missing clientKey");
        }
        let t = false;
        try {
          t = !!new URL(e.apiHost || "").hostname.match(/growthbook\.io$/i);
        } catch (n) {}
        if (t) {
          throw Error("Cannot use remoteEval on GrowthBook Cloud");
        }
      } else if (e.cacheKeyAttributes) {
        throw Error("cacheKeyAttributes are only used for remoteEval");
      }
      if (e.stickyBucketService) {
        let t = e.stickyBucketService;
        this._saveStickyBucketAssignmentDoc = n => t.saveAssignments(n);
      }
      if (e.plugins) {
        for (let t of e.plugins) {
          t(this);
        }
      }
      if (e.features) {
        this.ready = true;
      }
      if (_tt && e.enableDevMode) {
        window._growthbook = this;
        document.dispatchEvent(new Event("gbloaded"));
      }
      if (e.experiments) {
        this.ready = true;
        this._updateAllAutoExperiments();
      }
      if (this._options.stickyBucketService && this._options.stickyBucketAssignmentDocs) {
        for (let t in this._options.stickyBucketAssignmentDocs) {
          let n = this._options.stickyBucketAssignmentDocs[t];
          if (n) {
            this._options.stickyBucketService.saveAssignments(n).catch(() => {});
          }
        }
      }
      if (this.ready) {
        this.refreshStickyBuckets(this.getPayload());
      }
    }
    async setPayload(e) {
      this._payload = e;
      let t = await zSs(e, this._options.decryptionKey);
      if (this._decryptedPayload = t, await this.refreshStickyBuckets(t), t.features) {
        this._options.features = t.features;
      }
      if (t.savedGroups) {
        this._options.savedGroups = t.savedGroups;
      }
      if (t.experiments) {
        this._options.experiments = t.experiments;
        this._updateAllAutoExperiments();
      }
      this.ready = true;
      this._render();
    }
    initSync(e) {
      this._initialized = true;
      let t = e.payload;
      if (t.encryptedExperiments || t.encryptedFeatures) {
        throw Error("initSync does not support encrypted payloads");
      }
      if (this._options.stickyBucketService && !this._options.stickyBucketAssignmentDocs) {
        this._options.stickyBucketAssignmentDocs = this.generateStickyBucketAssignmentDocsSync(this._options.stickyBucketService, t);
      }
      if (this._payload = t, this._decryptedPayload = t, t.features) {
        this._options.features = t.features;
      }
      if (t.experiments) {
        this._options.experiments = t.experiments;
        this._updateAllAutoExperiments();
      }
      this.ready = true;
      _fn(this, e);
      return this;
    }
    async init(e) {
      if (this._initialized = true, e = e || {}, e.cacheSettings) {
        OSs(e.cacheSettings);
      }
      if (e.payload) {
        await this.setPayload(e.payload);
        _fn(this, e);
        return {
          success: true,
          source: "init"
        };
      } else {
        let {
          data: t,
          ...n
        } = await this._refresh({
          ...e,
          allowStale: true
        });
        _fn(this, e);
        await this.setPayload(t || {});
        return n;
      }
    }
    async loadFeatures(e) {
      e = e || {};
      await this.init({
        skipCache: e.skipCache,
        timeout: e.timeout,
        streaming: (this._options.backgroundSync ?? true) && (e.autoRefresh || this._options.subscribeToChanges)
      });
    }
    async refreshFeatures(e) {
      let t = await this._refresh({
        ...(e || {}),
        allowStale: false
      });
      if (t.data) {
        await this.setPayload(t.data);
      }
    }
    getApiInfo() {
      return [this.getApiHosts().apiHost, this.getClientKey()];
    }
    getApiHosts() {
      return KSs(this._options);
    }
    getClientKey() {
      return this._options.clientKey || "";
    }
    getPayload() {
      return this._payload || {
        features: this.getFeatures(),
        experiments: this.getExperiments()
      };
    }
    getDecryptedPayload() {
      return this._decryptedPayload || this.getPayload();
    }
    isRemoteEval() {
      return this._options.remoteEval || false;
    }
    getCacheKeyAttributes() {
      return this._options.cacheKeyAttributes;
    }
    async _refresh(e) {
      let {
        timeout: t,
        skipCache: n,
        allowStale: r,
        streaming: o
      } = e;
      if (!this._options.clientKey) {
        throw Error("Missing clientKey");
      }
      return DSs({
        instance: this,
        timeout: t,
        skipCache: n || this._options.disableCache,
        allowStale: r,
        backgroundSync: o ?? this._options.backgroundSync ?? true
      });
    }
    _render() {
      if (this._renderer) {
        try {
          this._renderer();
        } catch (e) {
          console.error("Failed to render", e);
        }
      }
    }
    setFeatures(e) {
      this._options.features = e;
      this.ready = true;
      this._render();
    }
    async setEncryptedFeatures(e, t, n) {
      let r = await THe(e, t || this._options.decryptionKey, n);
      this.setFeatures(JSON.parse(r));
    }
    setExperiments(e) {
      this._options.experiments = e;
      this.ready = true;
      this._updateAllAutoExperiments();
    }
    async setEncryptedExperiments(e, t, n) {
      let r = await THe(e, t || this._options.decryptionKey, n);
      this.setExperiments(JSON.parse(r));
    }
    async setAttributes(e) {
      if (this._options.attributes = e, this._options.stickyBucketService) {
        await this.refreshStickyBuckets();
      }
      if (this._options.remoteEval) {
        await this._refreshForRemoteEval();
        return;
      }
      this._render();
      this._updateAllAutoExperiments();
    }
    async updateAttributes(e) {
      return this.setAttributes({
        ...this._options.attributes,
        ...e
      });
    }
    async setAttributeOverrides(e) {
      if (this._options.attributeOverrides = e, this._options.stickyBucketService) {
        await this.refreshStickyBuckets();
      }
      if (this._options.remoteEval) {
        await this._refreshForRemoteEval();
        return;
      }
      this._render();
      this._updateAllAutoExperiments();
    }
    async setForcedVariations(e) {
      if (this._options.forcedVariations = e || {}, this._options.remoteEval) {
        await this._refreshForRemoteEval();
        return;
      }
      this._render();
      this._updateAllAutoExperiments();
    }
    setForcedFeatures(e) {
      this._options.forcedFeatureValues = e;
      this._render();
    }
    async setURL(e) {
      if (e === this._options.url) {
        return;
      }
      if (this._options.url = e, this._redirectedUrl = "", this._options.remoteEval) {
        await this._refreshForRemoteEval();
        this._updateAllAutoExperiments(true);
        return;
      }
      this._updateAllAutoExperiments(true);
    }
    getAttributes() {
      return {
        ...this._options.attributes,
        ...this._options.attributeOverrides
      };
    }
    getForcedVariations() {
      return this._options.forcedVariations || {};
    }
    getForcedFeatures() {
      return this._options.forcedFeatureValues || new Map();
    }
    getStickyBucketAssignmentDocs() {
      return this._options.stickyBucketAssignmentDocs || {};
    }
    getUrl() {
      return this._options.url || "";
    }
    getFeatures() {
      return this._options.features || {};
    }
    getExperiments() {
      return this._options.experiments || [];
    }
    getCompletedChangeIds() {
      return Array.from(this._completedChangeIds);
    }
    subscribe(e) {
      this._subscriptions.add(e);
      return () => {
        this._subscriptions.delete(e);
      };
    }
    async _refreshForRemoteEval() {
      if (!this._options.remoteEval) {
        return;
      }
      if (!this._initialized) {
        return;
      }
      let e = await this._refresh({
        allowStale: false
      });
      if (e.data) {
        await this.setPayload(e.data);
      }
    }
    getAllResults() {
      return new Map(this._assigned);
    }
    onDestroy(e) {
      this._destroyCallbacks.push(e);
    }
    isDestroyed() {
      return !!this._destroyed;
    }
    destroy() {
      if (this._destroyed = true, this._destroyCallbacks.forEach(e => {
        try {
          e();
        } catch (t) {
          console.error(t);
        }
      }), this._subscriptions.clear(), this._assigned.clear(), this._trackedExperiments.clear(), this._completedChangeIds.clear(), this._deferredTrackingCalls.clear(), this._trackedFeatures = {}, this._destroyCallbacks = [], this._payload = undefined, this._saveStickyBucketAssignmentDoc = undefined, MSs(this), this.logs = [], _tt && window._growthbook === this) {
        delete window._growthbook;
      }
      this._activeAutoExperiments.forEach(e => {
        e.undo();
      });
      this._activeAutoExperiments.clear();
      this._triggeredExpKeys.clear();
    }
    setRenderer(e) {
      this._renderer = e;
    }
    forceVariation(e, t) {
      if (this._options.forcedVariations = this._options.forcedVariations || {}, this._options.forcedVariations[e] = t, this._options.remoteEval) {
        this._refreshForRemoteEval();
        return;
      }
      this._updateAllAutoExperiments();
      this._render();
    }
    run(e) {
      let {
        result: t
      } = Tfn(e, null, this._getEvalContext());
      this._fireSubscriptions(e, t);
      return t;
    }
    triggerExperiment(e) {
      if (this._triggeredExpKeys.add(e), !this._options.experiments) {
        return null;
      }
      return this._options.experiments.filter(n => n.key === e).map(n => this._runAutoExperiment(n)).filter(n => n !== null);
    }
    triggerAutoExperiments() {
      this._autoExperimentsAllowed = true;
      this._updateAllAutoExperiments(true);
    }
    _getEvalContext() {
      return {
        user: this._getUserContext(),
        global: this._getGlobalContext(),
        stack: {
          evaluatedFeatures: new Set()
        }
      };
    }
    _getUserContext() {
      return {
        attributes: this._options.user ? {
          ...this._options.user,
          ...this._options.attributes
        } : this._options.attributes,
        enableDevMode: this._options.enableDevMode,
        blockedChangeIds: this._options.blockedChangeIds,
        stickyBucketAssignmentDocs: this._options.stickyBucketAssignmentDocs,
        url: this._getContextUrl(),
        forcedVariations: this._options.forcedVariations,
        forcedFeatureValues: this._options.forcedFeatureValues,
        attributeOverrides: this._options.attributeOverrides,
        saveStickyBucketAssignmentDoc: this._saveStickyBucketAssignmentDoc,
        trackingCallback: this._options.trackingCallback,
        onFeatureUsage: this._options.onFeatureUsage,
        devLogs: this.logs,
        trackedExperiments: this._trackedExperiments,
        trackedFeatureUsage: this._trackedFeatures
      };
    }
    _getGlobalContext() {
      return {
        features: this._options.features,
        experiments: this._options.experiments,
        log: this.log,
        enabled: this._options.enabled,
        qaMode: this._options.qaMode,
        savedGroups: this._options.savedGroups,
        groups: this._options.groups,
        overrides: this._options.overrides,
        onExperimentEval: this._subscriptions.size > 0 ? this._fireSubscriptions : undefined,
        recordChangeId: this._recordChangedId,
        saveDeferredTrack: this._saveDeferredTrack,
        eventLogger: this._options.eventLogger
      };
    }
    _runAutoExperiment(e, t) {
      let n = this._activeAutoExperiments.get(e);
      if (e.manual && !this._triggeredExpKeys.vZc(e.key) && !n) {
        return null;
      }
      let r = this._isAutoExperimentBlockedByContext(e);
      let o;
      let s;
      if (r) {
        o = jR(this._getEvalContext(), e, -1, false, "");
      } else {
        ({
          result: o,
          trackingCall: s
        } = Tfn(e, null, this._getEvalContext()));
        this._fireSubscriptions(e, o);
      }
      let i = JSON.stringify(o.value);
      if (!t && o.inExperiment && n && n.valueHash === i) {
        return o;
      }
      if (n) {
        this._undoActiveAutoExperiment(e);
      }
      if (o.inExperiment) {
        let a = hfn(e);
        if (a === "redirect" && o.value.urlRedirect && e.urlPatterns) {
          let l = e.persistQueryString ? ASs(this._getContextUrl(), o.value.urlRedirect) : o.value.urlRedirect;
          if (ffn(l, e.urlPatterns)) {
            this.log("Skipping redirect because original URL matches redirect URL", {
              id: e.key
            });
            return o;
          }
          this._redirectedUrl = l;
          let {
            navigate: c,
            delay: u
          } = this._getNavigateFunction();
          if (c) {
            if (_tt) {
              Promise.all([...(s ? [gfn(s, this._options.maxNavigateDelay ?? 1000)] : []), new Promise(d => window.setTimeout(d, this._options.navigateDelay ?? u))]).then(() => {
                try {
                  c(l);
                } catch (d) {
                  console.error(d);
                }
              });
            } else {
              try {
                c(l);
              } catch (d) {
                console.error(d);
              }
            }
          }
        } else if (a === "visual") {
          let l = this._options.applyDomChangesCallback ? this._options.applyDomChangesCallback(o.value) : this._applyDOMChanges(o.value);
          if (l) {
            this._activeAutoExperiments.set(e, {
              undo: l,
              valueHash: i
            });
          }
        }
      }
      return o;
    }
    _undoActiveAutoExperiment(e) {
      let t = this._activeAutoExperiments.get(e);
      if (t) {
        t.undo();
        this._activeAutoExperiments.delete(e);
      }
    }
    _updateAllAutoExperiments(e) {
      if (!this._autoExperimentsAllowed) {
        return;
      }
      let t = this._options.experiments || [];
      let n = new Set(t);
      this._activeAutoExperiments.forEach((r, o) => {
        if (!n.vZc(o)) {
          r.undo();
          this._activeAutoExperiments.delete(o);
        }
      });
      for (let r of t) {
        let o = this._runAutoExperiment(r, e);
        if (o !== null && o !== undefined && o.inExperiment && hfn(r) === "redirect") {
          break;
        }
      }
    }
    _fireSubscriptions(e, t) {
      let n = e.key;
      let r = this._assigned.get(n);
      if (!r || r.result.inExperiment !== t.inExperiment || r.result.variationId !== t.variationId) {
        this._assigned.set(n, {
          experiment: e,
          result: t
        });
        this._subscriptions.forEach(o => {
          try {
            o(e, t);
          } catch (s) {
            console.error(s);
          }
        });
      }
    }
    _recordChangedId(e) {
      this._completedChangeIds.add(e);
    }
    isOn(e) {
      return this.evalFeature(e).on;
    }
    isOff(e) {
      return this.evalFeature(e).off;
    }
    getFeatureValue(e, t) {
      let n = this.evalFeature(e).value;
      return n === null ? t : n;
    }
    feature(e) {
      return this.evalFeature(e);
    }
    evalFeature(e) {
      return Sfn(e, this._getEvalContext());
    }
    log(e, t) {
      if (!this.debug) {
        return;
      }
      if (this._options.log) {
        this._options.log(e, t);
      } else {
        console.log(e, t);
      }
    }
    getDeferredTrackingCalls() {
      return Array.from(this._deferredTrackingCalls.values());
    }
    setDeferredTrackingCalls(e) {
      this._deferredTrackingCalls = new Map(e.filter(t => t && t.experiment && t.result).map(t => [Efn(t.experiment, t.result), t]));
    }
    async fireDeferredTrackingCalls() {
      if (!this._options.trackingCallback) {
        return;
      }
      let e = [];
      this._deferredTrackingCalls.forEach(t => {
        if (!t || !t.experiment || !t.result) {
          console.error("Invalid deferred tracking call", {
            call: t
          });
        } else {
          e.push(this._options.trackingCallback(t.experiment, t.result));
        }
      });
      this._deferredTrackingCalls.clear();
      await Promise.all(e);
    }
    setTrackingCallback(e) {
      this._options.trackingCallback = e;
      this.fireDeferredTrackingCalls();
    }
    setEventLogger(e) {
      this._options.eventLogger = e;
    }
    async logEvent(e, t) {
      if (this._destroyed) {
        console.error("Cannot log event to destroyed GrowthBook instance");
        return;
      }
      if (this._options.enableDevMode) {
        this.logs.push({
          eventName: e,
          properties: t,
          timestamp: Date.now().toString(),
          logType: "event"
        });
      }
      if (this._options.eventLogger) {
        try {
          await this._options.eventLogger(e, t || {}, this._getUserContext());
        } catch (n) {
          console.error(n);
        }
      } else {
        console.error("No event logger configured");
      }
    }
    _saveDeferredTrack(e) {
      this._deferredTrackingCalls.set(Efn(e.experiment, e.result), e);
    }
    _getContextUrl() {
      return this._options.url || (_tt ? window.location.href : "");
    }
    _isAutoExperimentBlockedByContext(e) {
      let t = hfn(e);
      if (t === "visual") {
        if (this._options.disableVisualExperiments) {
          return true;
        }
        if (this._options.disableJsInjection) {
          if (e.variations.some(n => n.js)) {
            return true;
          }
        }
      } else if (t === "redirect") {
        if (this._options.disableUrlRedirectExperiments) {
          return true;
        }
        try {
          let n = new URL(this._getContextUrl());
          for (let r of e.variations) {
            if (!r || !r.urlRedirect) {
              continue;
            }
            let o = new URL(r.urlRedirect);
            if (this._options.disableCrossOriginUrlRedirectExperiments) {
              if (o.protocol !== n.protocol) {
                return true;
              }
              if (o.host !== n.host) {
                return true;
              }
            }
          }
        } catch (n) {
          this.log("Error parsing current or redirect URL", {
            id: e.key,
            error: n
          });
          return true;
        }
      } else {
        return true;
      }
      if (e.changeId && (this._options.blockedChangeIds || []).includes(e.changeId)) {
        return true;
      }
      return false;
    }
    getRedirectUrl() {
      return this._redirectedUrl;
    }
    _getNavigateFunction() {
      if (this._options.navigate) {
        return {
          navigate: this._options.navigate,
          delay: 0
        };
      } else if (_tt) {
        return {
          navigate: e => {
            window.location.replace(e);
          },
          delay: 100
        };
      }
      return {
        navigate: null,
        delay: 0
      };
    }
    _applyDOMChanges(e) {
      if (!_tt) {
        return;
      }
      let t = [];
      if (e.css) {
        let n = document.createElement("style");
        n.innerHTML = e.css;
        document.head.appendChild(n);
        t.push(() => n.remove());
      }
      if (e.js) {
        let n = document.createElement("script");
        if (n.innerHTML = e.js, this._options.jsInjectionNonce) {
          n.nonce = this._options.jsInjectionNonce;
        }
        document.head.appendChild(n);
        t.push(() => n.remove());
      }
      if (e.domMutations) {
        e.domMutations.forEach(n => {
          t.push(L_u.declarative(n).revert);
        });
      }
      return () => {
        t.forEach(n => n());
      };
    }
    async refreshStickyBuckets(e) {
      if (this._options.stickyBucketService) {
        let t = this._getEvalContext();
        let n = await VSs(t, this._options.stickyBucketService, e);
        this._options.stickyBucketAssignmentDocs = n;
      }
    }
    generateStickyBucketAssignmentDocsSync(e, t) {
      if (!("getAllAssignmentsSync" in e)) {
        console.error("generating StickyBucketAssignmentDocs docs requires StickyBucketServiceSync");
        return;
      }
      let n = this._getEvalContext();
      let r = yOr(n, t);
      return e.getAllAssignmentsSync(r);
    }
    inDevMode() {
      return !!this._options.enableDevMode;
    }
  }
  var _tt;
  var fbu;
  var JSs = __lazy(() => {
    GOt();
    USs();
    YSs();
    _tt = typeof window < "u" && typeof document < "u";
    fbu = kSs();
  });
  var QSs = __lazy(() => {
    JSs();
  });
  function gbu(e, t) {
    return Lls(e, t);
  }
  function ybu(e) {
    return function (t, n, r) {
      var o = -1;
      var s = Object(t);
      var i = r(t);
      var a = i.length;
      while (a--) {
        var l = i[e ? a : ++o];
        if (n(s[l], l, s) === false) {
          break;
        }
      }
      return t;
    };
  }
  var _bu;
  function bbu(e, t) {
    return e && _bu(e, t, $tu);
  }
  function Sbu(e, t) {
    var n = {};
    t = Hnu(t, 3);
    bbu(e, function (r, o, s) {
      vou(n, o, t(r, o, s));
    });
    return n;
  }
  function Ebu(e) {
    if (typeof e != "function") {
      throw TypeError("Expected a function");
    }
    return function () {
      var t = arguments;
      switch (t.length) {
        case 0:
          return !e.call(this);
        case 1:
          return !e.call(this, t[0]);
        case 2:
          return !e.call(this, t[0], t[1]);
        case 3:
          return !e.call(this, t[0], t[1], t[2]);
      }
      return !e.apply(this, t);
    };
  }
  function vbu(e, t) {
    return d_u(e, Ebu(Hnu(t)));
  }
  function wbu(e, t, n, r) {
    var o = -1;
    var s = e == null ? 0 : e.length;
    while (++o < s) {
      var i = e[o];
      t(r, i, n(i), e);
    }
    return r;
  }
  function Cbu(e, t) {
    return function (n, r) {
      if (n == null) {
        return n;
      }
      if (!Btu(n)) {
        return e(n, r);
      }
      var o = n.length;
      var s = t ? o : -1;
      var i = Object(n);
      while (t ? s-- : ++s < o) {
        if (r(i[s], s, i) === false) {
          break;
        }
      }
      return n;
    };
  }
  var Rbu;
  function xbu(e, t, n, r) {
    Rbu(e, function (o, s, i) {
      t(r, o, n(o), i);
    });
    return r;
  }
  function kbu(e, t) {
    return function (n, r) {
      var o = Peu(n) ? wbu : xbu;
      var s = t ? t() : {};
      return o(n, e, Hnu(r, 2), s);
    };
  }
  var Abu;
  var ZL = __lazy(() => {});
  function cTs() {
    return "sdk-zAZezfDKGoZuXXKe";
  }
  var qg = __lazy(() => {
    wun();
    wun();
  });
  function we(e) {
    let t;
    return () => t ??= e();
  }
  function ECu(e) {
    let t = e?.trim();
    return t ? t : undefined;
  }
  function KOt(e) {
    return e === undefined ? undefined : String(e);
  }
  function dTs(e) {
    if (typeof e === "boolean") {
      return e ? "1" : "0";
    }
    return String(e);
  }
  function pTs(e) {
    return Ke.preprocess(KOt, Ke.string().optional().transform(t => {
      if (t === undefined) {
        return;
      }
      let n = parseInt(t.trim(), 10);
      if (Number.isNaN(n)) {
        return;
      }
      if (e?.min !== undefined && n < e.min) {
        return;
      }
      if (e?.max !== undefined && n > e.max) {
        return;
      }
      return n;
    }));
  }
  var vCu;
  var wCu;
  var CCu;
  var RCu;
  var $e;
  var ile = __lazy(() => {
    qg();
    gn();
    vCu = we(() => Ke.preprocess(KOt, Ke.string().optional().transform(ECu)));
    wCu = we(() => Ke.preprocess(KOt, Ke.string().optional().transform(e => st(e))));
    CCu = we(() => Ke.preprocess(KOt, Ke.string().optional().transform(e => {
      if (st(e)) {
        return true;
      }
      if (Pl(e)) {
        return false;
      }
      return;
    })));
    RCu = we(() => pTs());
    $e = {
      str: () => vCu(),
      bool: () => wCu(),
      triBool: () => CCu(),
      int: e => e ? pTs(e) : RCu(),
      enum: e => Ke.preprocess(KOt, Ke.string().optional().transform(t => t !== undefined && e.includes(t.trim()) ? t.trim() : undefined))
    };
  });
  var vOr = {};