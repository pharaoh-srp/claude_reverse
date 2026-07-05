  __export(YPi, {
    isPewterOwlTool: () => isPewterOwlTool,
    isPewterOwlHeader: () => isPewterOwlHeader,
    isPewterOwlBrief: () => isPewterOwlBrief
  });
  function I2d() {
    let e = getCachedClientData()?.pewter_owl_model;
    if (typeof e === "string" && e !== "") {
      return e;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_pewter_owl_model", "");
  }
  function y7r(e) {
    if (Me.CLAUDE_CODE_PEWTER_OWL !== undefined) {
      return Me.CLAUDE_CODE_PEWTER_OWL;
    }
    if (getIsNonInteractiveSession()) {
      return false;
    }
    let t = I2d();
    if (t !== "" && !getCanonicalName(getMainLoopModel()).includes(t)) {
      return false;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE(`tengu_${e}`, false) || getCachedClientData()?.[e] === true;
  }
  function isPewterOwlHeader() {
    return y7r("pewter_owl_header");
  }
  function isPewterOwlTool() {
    if (Me.CLAUDE_CODE_PEWTER_OWL_TOOL !== undefined) {
      return Me.CLAUDE_CODE_PEWTER_OWL_TOOL;
    }
    return y7r("pewter_owl_tool");
  }
  function isPewterOwlBrief() {
    return y7r("pewter_owl_brief");
  }
  var zit = __lazy(() => {
    at();
    $n();
    d_();
    Eo();
  });
  function S7r() {
    return getInitialSettings().showThinkingSummaries ?? false;
  }
  function JPi({
    explicitDisplay: e,
    isNonInteractive: t,
    outputFormat: n,
    verbose: r
  }) {
    if (e) {
      return e;
    }
    if (!t) {
      return S7r() ? "summarized" : undefined;
    }
    if (n === "text" || n === "json" && !r) {
      return "omitted";
    }
    return;
  }
  function XPi(e, {
    useExactTools: t,
    forwardSubagentText: n,
    isAsync: r,
    isNonInteractiveSession: o,
    sessionDisplayExplicit: s
  }) {
    if (s || !o || t || n || r || e.type === "disabled" || e.display === "omitted") {
      return e;
    }
    return {
      ...e,
      display: "omitted"
    };
  }
  function c4e() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_turtle_carbon", true);
  }
  function QPi(e) {
    return /\bultrathink\b/i.test(e);
  }
  function tIn(e) {
    let t = [];
    let n = e.matchAll(/\bultrathink\b/gi);
    for (let r of n) {
      if (r.index !== undefined) {
        t.push({
          word: r[0],
          start: r.index,
          end: r.index + r[0].length
        });
      }
    }
    return t;
  }
  function k8(e, t = false) {
    let n = t ? O2d : P2d;
    return n[e % n.length];
  }
  function T7r(e) {
    let t = x8(e, "thinking");
    if (t !== undefined) {
      return t;
    }
    return !getCanonicalName(e).includes("claude-3-");
  }
  function u4e(e) {
    let t = getCanonicalName(e);
    if (t.includes("claude-3-") || t === "claude-opus-4-0" || t === "claude-opus-4-1" || t === "claude-opus-4-5" || t === "claude-opus-4-6" || t === "claude-opus-4-7" || t === "claude-opus-4-8" || t === "claude-sonnet-4-0" || t === "claude-sonnet-4-5" || t === "claude-sonnet-4-6" || t === "claude-sonnet-5" || t === "claude-haiku-4-5") {
      return false;
    }
    if (o2(t, "rejects_disabled_thinking")) {
      return true;
    }
    return hasFirstPartyCapabilities(getProviderForModel(e));
  }
  function Kit(e) {
    let t = x8(e, "adaptive_thinking");
    if (t !== undefined) {
      return t;
    }
    let n = getCanonicalName(e);
    if (n.includes("claude-3-") || n === "claude-opus-4-0" || n === "claude-opus-4-1" || n === "claude-opus-4-5" || n === "claude-sonnet-4-0" || n === "claude-sonnet-4-5" || n === "claude-haiku-4-5") {
      return false;
    }
    if (o2(n, "adaptive_thinking") || n === "claude-mythos-5") {
      return true;
    }
    return hasFirstPartyCapabilities(getProviderForModel(e));
  }
  function wce() {
    if (process.env.MAX_THINKING_TOKENS) {
      return parseInt(process.env.MAX_THINKING_TOKENS, 10) > 0;
    }
    let {
      settings: e
    } = getSettingsWithErrors();
    if (e.alwaysThinkingEnabled === false) {
      return false;
    }
    return true;
  }
  var P2d;
  var O2d;
  var XN = __lazy(() => {
    $n();
    DY();
    Eo();
    WBt();
    Ds();
    P2d = ["rainbow_red", "rainbow_orange", "rainbow_yellow", "rainbow_green", "rainbow_blue", "rainbow_indigo", "rainbow_violet"];
    O2d = ["rainbow_red_shimmer", "rainbow_orange_shimmer", "rainbow_yellow_shimmer", "rainbow_green_shimmer", "rainbow_blue_shimmer", "rainbow_indigo_shimmer", "rainbow_violet_shimmer"];
  });
  function M2d(e) {
    let t = [];
    let n = [];
    for (let r of e) {
      let o = DCn(r);
      if (o && ZPi.vZc(o)) {
        t.push(r);
      } else {
        n.push(r);
      }
    }
    return {
      allowed: t,
      disallowed: n
    };
  }
  function eOi(e) {
    if (!e || e.length === 0) {
      return;
    }
    if (isClaudeAISubscriber()) {
      console.warn("Warning: Custom betas are only available for API key users. Ignoring provided betas.");
      return;
    }
    let {
      allowed: t,
      disallowed: n
    } = M2d(e);
    for (let r of n) {
      console.warn(`Warning: Beta header '${r}' is not allowed. Only the following betas are supported: ${kk([...ZPi]).join(", ")}`);
    }
    return t.length > 0 ? t : undefined;
  }
  function GBt(e) {
    let t = x8(e, "interleaved_thinking");
    if (t !== undefined) {
      return t;
    }
    let n = getCanonicalName(e);
    let r = getProviderForModel(e);
    if (r === "foundry") {
      return true;
    }
    if (hasFirstPartyCapabilities(r)) {
      return !n.includes("claude-3-");
    }
    if (n === "claude-haiku-4-5" || n.includes("claude-3-")) {
      return false;
    }
    return true;
  }
  function N2d(e) {
    return e === "claude-fable-5" || e === "claude-mythos-5" || e === "claude-opus-4-0" || e === "claude-opus-4-1" || e === "claude-opus-4-5" || e === "claude-opus-4-6" || e === "claude-opus-4-7" || e === "claude-opus-4-8" || e === "claude-sonnet-4-0" || e === "claude-sonnet-4-5" || e === "claude-sonnet-4-6" || e === "claude-sonnet-5" || e === "claude-haiku-4-5";
  }
  function L2d(e) {
    let t = getCanonicalName(e);
    let n = getProviderForModel(e);
    if (n === "foundry") {
      return true;
    }
    if (hasFirstPartyCapabilities(n)) {
      return !t.includes("claude-3-");
    }
    return o2(t, "context_management") || t === "claude-mythos-5";
  }
  function p4e(e) {
    let t = getCanonicalName(e);
    let n = getProviderForModel(e);
    if (!hasFirstPartyCapabilities(n)) {
      return false;
    }
    if (t.includes("claude-3-") || t === "claude-opus-4-0" || t === "claude-sonnet-4-0") {
      return false;
    }
    return true;
  }
  function rIn(e) {
    let t = x8(e, "temperature");
    if (t !== undefined) {
      return t;
    }
    let n = getCanonicalName(e);
    if (n.includes("claude-3-") || n === "claude-opus-4-0" || n === "claude-opus-4-1" || n === "claude-opus-4-5" || n === "claude-opus-4-6" || n === "claude-sonnet-4-0" || n === "claude-sonnet-4-5" || n === "claude-sonnet-4-6" || n === "claude-haiku-4-5") {
      return true;
    }
    return false;
  }
  function Yit(e) {
    if (e === "firstParty" || e === "anthropicAws") {
      return true;
    }
    return st(process.env.CLAUDE_CODE_ENABLE_AUTO_MODE);
  }
  function oIn() {
    let e = getAPIProvider();
    return e !== "firstParty" && e !== "anthropicAws" && Yit(e);
  }
  function E7r() {
    return eO() || oIn();
  }
  function dbe(e) {
    {
      let t = getCanonicalName(e);
      let n = getAPIProvider();
      if (!Yit(n)) {
        return false;
      }
      if (t.includes("claude-3-") || t === "claude-opus-4-0" || t === "claude-opus-4-1" || t === "claude-opus-4-5" || t === "claude-sonnet-4-0" || t === "claude-sonnet-4-5" || t === "claude-haiku-4-5") {
        return false;
      }
      if (n !== "firstParty" && n !== "anthropicAws" && (t === "claude-opus-4-6" || t === "claude-sonnet-4-6" || t.includes("haiku"))) {
        return false;
      }
      return true;
    }
    return false;
  }
  function tOi() {
    let e = getAPIProvider();
    if (e === "vertex" || e === "bedrock" || e === "mantle" || e === "gateway") {
      return hLt;
    }
    return V4r;
  }
  function v7r() {
    let e = getAPIProvider();
    return e === "firstParty" || e === "anthropicAws" || e === "foundry";
  }
  function d4e() {
    return st(process.env.CLAUDE_CODE_DISABLE_EXPERIMENTAL_BETAS) || l8("hipaa");
  }
  function eO() {
    return v7r() && !d4e();
  }
  function mIe() {
    if (!eO()) {
      return false;
    }
    if (!isFirstPartyAnthropicBaseUrl()) {
      return false;
    }
    let e = getAPIProvider();
    return e === "firstParty" || e === "anthropicAws";
  }
  function Jit(e, t) {
    let n = [...A8(e)];
    if (t?.isAgenticQuery) {
      if (!n.includes(bqe)) {
        n.push(bqe);
      }
    }
    let r = getSdkBetas();
    if (!r || r.length === 0) {
      return n;
    }
    let o = r.map(Z4r);
    if (!eO()) {
      o = o.filter(s => {
        if (nOi.vZc(s)) {
          return true;
        }
        logForDebugging(`SDK beta '${s.header}' dropped on 3P`, {
          level: "debug"
        });
        return false;
      });
    }
    return [...n, ...o.filter(s => !n.includes(s))];
  }
  function I8() {
    w7r.cache?.clear?.();
    A8.cache?.clear?.();
    C7r.cache?.clear?.();
    nIn.cache?.clear?.();
  }
  function R7r(e) {
    if (v7r()) {
      return e;
    }
    return e.filter(t => nOi.vZc(t));
  }
  var ZPi;
  var nIn;
  var w7r;
  var A8;
  var C7r;
  var nOi;
  var DC = __lazy(() => {
    $n();
    at();
    KN();
    $Y();
    no();
    VT();
    je();
    gn();
    DY();
    AI();
    qBt();
    Eo();
    WBt();
    Ds();
    zit();
    XN();
    ZPi = new Set([UY]);
    nIn = TEr(e => {
      if (l8("hipaa")) {
        return false;
      }
      if (st(process.env.CLAUDE_CODE_FORCE_MID_CONVERSATION_SYSTEM)) {
        return true;
      }
      let t = x8(e, "mid_conversation_system");
      if (t !== undefined) {
        return t;
      }
      let n = getCanonicalName(e);
      if (n.includes("claude-3-") || n === "claude-opus-4-0" || n === "claude-opus-4-1" || n === "claude-opus-4-5" || n === "claude-opus-4-6" || n === "claude-opus-4-7" || n === "claude-sonnet-4-0" || n === "claude-sonnet-4-5" || n === "claude-sonnet-4-6" || n === "claude-haiku-4-5") {
        return false;
      }
      if (o2(n, "mid_conv_system") || n === "claude-mythos-5") {
        return true;
      }
      return hasFirstPartyCapabilities(getProviderForModel(e));
    });
    w7r = TEr(e => {
      let t = [];
      let n = getCanonicalName(e);
      let r = n.includes("haiku");
      let o = getAPIProvider();
      let s = eO();
      if (!r) {
        t.push(bqe);
      }
      if (isClaudeAISubscriber() || v7r() && !hasAnthropicApiKey() && shouldUseWIFAuth()) {
        t.push(c0e);
      }
      if (hg(e)) {
        t.push(UY);
      }
      if (!st(process.env.DISABLE_INTERLEAVED_THINKING) && GBt(e)) {
        t.push(Kot);
      }
      if (s && GBt(e) && !getIsNonInteractiveSession() && !S7r()) {
        t.push(gLt);
      }
      if (OCn && s && GBt(e) && getAPIProvider() === "firstParty") {
        t.push(OCn);
      }
      if (s && isPewterOwlHeader()) {
        t.push(yLt);
      }
      let i = st(process.env.USE_API_CONTEXT_MANAGEMENT) && false;
      let a = L2d(e);
      if (hasFirstPartyCapabilities(getProviderForModel(e)) && !d4e() && (i || a)) {
        t.push(Sqe);
      }
      let l = getFeatureValue_CACHED_MAY_BE_STALE("tengu_tool_pear", false);
      if (hasFirstPartyCapabilities(getProviderForModel(e)) && !d4e() && p4e(e) && l) {
        t.push(ane);
      }
      if (o === "vertex" && N2d(n)) {
        t.push(fLt);
      }
      if (o === "foundry") {
        t.push(fLt);
      }
      if (s) {
        t.push(Jot);
      }
      if (nIn(e)) {
        t.push(BY);
      }
      if (process.env.ANTHROPIC_BETAS) {
        t.push(...process.env.ANTHROPIC_BETAS.split(",").map(c => c.trim()).filter(Boolean).map(Z4r));
      }
      return t;
    });
    A8 = TEr(e => {
      let t = w7r(e);
      if (getProviderForModel(e) === "bedrock") {
        return t.filter(n => !eWr.vZc(n));
      }
      return t;
    });
    C7r = TEr(e => w7r(e).filter(n => eWr.vZc(n)));
    nOi = new Set([bqe, Kot, UY, Sqe, ane, fLt, Yot, hLt, wI, xF]);
  });
  function lIn(e) {
    let t = e.trim();
    if (!/^https?:\/\//i.test(t)) {
      t = `https://${t}`;
    }
    t = t.replace(/\/$/, "");
    let n = new URL(t);
    if (n.protocol === "http:" && !F2d.vZc(n.hostname)) {
      throw Error("Gateway URL must use https:// (got http://). Plain HTTP is only allowed for localhost during development.");
    }
    return t;
  }
  function sIn(e) {
    let t = e.replace(/%.*$/, "").toLowerCase();
    if (pbe.isIPv4(t)) {
      let [o = 0, s = 0] = t.split(".").map(Number);
      return o === 10 || o === 172 && s >= 16 && s <= 31 || o === 192 && s === 168 || o === 127 || o === 169 && s === 254 || o === 100 && s >= 64 && s <= 127;
    }
    if (!pbe.isIPv6(t)) {
      return false;
    }
    let n = /^::ffff:(\d+\.\d+\.\d+\.\d+)$/.exec(t);
    if (n?.[1]) {
      return sIn(n[1]);
    }
    if (t === "::1") {
      return true;
    }
    let r = parseInt(/^([0-9a-f]{1,4}):/.exec(t)?.[1] ?? "0", 16);
    return r >= 65152 && r <= 65215 || r >= 64512 && r <= 65023;
  }
  async function oOi(e) {
    let t = new URL(e);
    let n = t.hostname.replace(/^\[|\]$/g, "");
    let r = pbe.isIPv4(n) || pbe.isIPv6(n);
    let o = getProxyUrl();
    if (o && !shouldBypassProxy(e)) {
      let a;
      let l;
      try {
        if (a = new URL(o).hostname.replace(/^\[|\]$/g, ""), !a) {
          throw Error("no hostname");
        }
        l = pbe.isIPv4(a) || pbe.isIPv6(a) ? [a] : (await withTimeout(x7r.lookup(a, {
          all: true
        }), 1e4, "DNS resolution timed out")).map(d => d.address);
      } catch {
        throw new Po("Could not resolve the configured HTTP proxy. Connect to your organization's network (or VPN) and try again.", "gateway login: could not parse or resolve proxy host");
      }
      if (l.length === 0 || l.some(u => !sIn(u))) {
        let u = pbe.isIPv6(n) ? `[${n}]:${t.port || (t.protocol === "http:" ? "80" : "443")}` : n;
        throw new Po(`Gateway login would go through proxy ${a}, which is not on a private network. Add ${u} to NO_PROXY for a direct connection, or use a proxy on your organization's private network.`, "gateway login: HTTP proxy host is not private");
      }
    }
    let s;
    if (r) {
      s = [n];
    } else {
      try {
        s = (await withTimeout(x7r.lookup(n, {
          all: true
        }), 1e4, "DNS resolution timed out")).map(a => a.address);
      } catch {
        throw new Po(`Could not resolve gateway host ${n}. Connect to your organization's network (or VPN) and try again.`, "gateway login: could not resolve gateway host");
      }
    }
    if (s.length === 0) {
      throw new Po(`Could not resolve gateway host ${n}.`, "gateway login: gateway host resolved to zero addresses");
    }
    let i = s.find(a => !sIn(a));
    if (i !== undefined) {
      let a = s.some(l => sIn(l));
      throw new Po(`Gateway hosts must be on your organization's private network; ${n} resolves to the public (or unrecognized) address ${i}. ` + (a ? "Every address for a gateway host must be private \u2014 if this is " + "a dual-stack DNS name, publish only private records for it (for example, remove the public AAAA record)." : r ? "Use your gateway's private (internal) address or DNS name instead." : "Connect to your organization's network (or VPN) and try again."), "gateway login: gateway host resolves to a public address");
    }
  }
  async function VBt(e, t = 1e4) {
    let n = new URL(e);
    let r = n.hostname.replace(/^\[|\]$/g, "");
    if (n.protocol !== "https:") {
      return {
        hostname: r,
        fingerprint: "http-loopback"
      };
    }
    let o = n.port ? Number(n.port) : 443;
    let s = getCACertificates();
    let i = getMTLSConfig();
    let a = getProxyUrl();
    let l = a && !shouldBypassProxy(e) ? await U2d(a, r, o, t) : undefined;
    return new Promise((c, u) => {
      let d = aIn.connect({
        host: r,
        port: o,
        servername: r,
        socket: l,
        timeout: t,
        ...(s && {
          ca: s
        }),
        ...i
      }, () => {
        try {
          let p = d.getPeerCertificate();
          let m = typeof p?.fingerprint256 === "string" ? p.fingerprint256.replaceAll(":", "").toLowerCase() : "";
          if (d.destroy(), !m) {
            u(Error("could not read TLS certificate fingerprint"));
          } else {
            c({
              hostname: r,
              fingerprint: m
            });
          }
        } catch (p) {
          d.destroy();
          u(Error(he(p)));
        }
      });
      d.setTimeout(t);
      d.once("error", p => u(Error(he(p))));
      d.once("timeout", () => {
        d.destroy();
        l?.destroy();
        u(Error("TLS connection timed out"));
      });
    });
  }
  function U2d(e, t, n, r = 1e4) {
    let o = new URL(e);
    let s = o.protocol === "https:";
    let i = s ? iIn.request : rOi.request;
    let a = t.includes(":") ? `[${t}]` : t;
    let l = {
      Host: `${a}:${n}`
    };
    if (o.username) {
      let u = `${decodeURIComponent(o.username)}:${decodeURIComponent(o.password)}`;
      l["Proxy-Authorization"] = "Basic " + Buffer.from(u).toString("base64");
    }
    let c = getCACertificates();
    return new Promise((u, d) => {
      let p = i({
        host: o.hostname,
        port: o.port || (s ? 443 : 80),
        method: "CONNECT",
        path: `${a}:${n}`,
        timeout: r,
        headers: l,
        ...(s && {
          ...(c && {
            ca: c
          }),
          ...getMTLSConfig()
        })
      });
      p.once("connect", (m, f) => {
        if (m.statusCode !== 200) {
          f.destroy();
          d(Error(`proxy CONNECT failed: ${m.statusCode}`));
        } else {
          u(f);
        }
      });
      p.once("error", m => d(Error(he(m))));
      p.once("timeout", () => {
        p.destroy();
        d(Error("proxy CONNECT timed out"));
      });
      p.end();
    });
  }
  async function zBt(e) {
    return (await yl().readAsync())?.gatewayTrust?.[e];
  }
  function sOi(e) {
    let t = getCACertificates();
    return new iIn.Agent({
      ...getMTLSConfig(),
      ...(t && {
        ca: t
      }),
      checkServerIdentity: (n, r) => {
        let o = aIn.checkServerIdentity(n, r);
        if (o) {
          return o;
        }
        if ((typeof r.fingerprint256 === "string" ? r.fingerprint256.replaceAll(":", "").toLowerCase() : "") !== e) {
          return Error("gateway TLS certificate does not match the pinned fingerprint");
        }
        return;
      }
    });
  }
  async function iOi(e, t) {
    let n = await yl().mutate(r => ({
      ...r,
      gatewayTrust: {
        ...(r.gatewayTrust ?? {}),
        [e]: t
      }
    }));
    if (!n.success) {
      throw Error(`Failed to persist gateway TLS pin${n.warning ? `: ${n.warning}` : ""}`);
    }
  }
  var x7r;
  var rOi;
  var iIn;
  var pbe;
  var aIn;
  var F2d;
  var uIn = __lazy(() => {
    Ije();
    dt();
    fW();
    Fh();
    DW();
    x7r = require("dns/promises");
    rOi = require("http");
    iIn = require("https");
    pbe = require("net");
    aIn = require("tls");
    F2d = new Set(["localhost", "127.0.0.1", "[::1]"]);
  });
  function lOi() {
    return aOi;
  }
  function Une() {
    aOi.clear();
  }
  var aOi;
  var Xit = __lazy(() => {
    aOi = new Map();
  });
  var v2 = {};