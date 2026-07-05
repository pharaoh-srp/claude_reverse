  function ISr() {
    return st(process.env.CLAUDE_GATEWAY_ALLOW_LOOPBACK);
  }
  function kss(e) {
    let t;
    try {
      t = OSr.parse(e.replace(/^\[|\]$/g, ""));
    } catch {
      return false;
    }
    if (t.kind() === "ipv6") {
      let o = t;
      if (o.isIPv4MappedAddress()) {
        t = o.toIPv4Address();
      } else {
        let s = o.range();
        if (s === "linkLocal") {
          return true;
        }
        if (s === "loopback" || s === "unspecified") {
          return !ISr();
        }
        if (o.toNormalizedString() === "fd00:ec2:0:0:0:0:0:254") {
          return true;
        }
        return false;
      }
    }
    let n = t.toString();
    let r = t.range();
    if (r === "linkLocal") {
      return true;
    }
    if (r === "unspecified") {
      return !ISr();
    }
    if (r === "loopback") {
      return !ISr();
    }
    if (n === "100.100.100.200") {
      return true;
    }
    return false;
  }
  function e7(e) {
    try {
      let t = new URL(e);
      if (t.protocol !== "https:" && t.protocol !== "http:") {
        return false;
      }
      let n = t.hostname.toLowerCase().replace(/^\[|\]$/g, "").replace(/\.$/, "");
      if (w5f.vZc(n)) {
        return false;
      }
      return !kss(n);
    } catch {
      return false;
    }
  }
  async function Mkt(e, t) {
    if (!e7(e)) {
      throw Error(`${"ECONNREFUSED_SSRF: blocked (cloud metadata / link-local)"}: ${e}`);
    }
    let n = new URL(e);
    let r = n.hostname.replace(/^\[|\]$/g, "").replace(/\.$/, "");
    let o = {
      ...t,
      redirect: "manual"
    };
    if (OSr.isValid(r)) {
      return fetch(n, o);
    }
    let s = await PSr.promises.lookup(r, {
      all: true
    });
    if (s.length === 0) {
      throw Object.assign(Error(`getaddrinfo ENOTFOUND ${r}`), {
        code: "ENOTFOUND"
      });
    }
    for (let {
      address: c
    } of s) {
      if (kss(c)) {
        throw Error(`${"ECONNREFUSED_SSRF: blocked (cloud metadata / link-local)"}: ${r} \u2192 ${c}`);
      }
    }
    let i = s.find(c => c.family === 4) ?? s[0];
    let a = n.host;
    n.hostname = i.family === 6 ? `[${i.address}]` : i.address;
    let l = new Headers(o.headers);
    l.set("host", a);
    return fetch(n, {
      ...o,
      headers: l,
      ...(n.protocol === "https:" && {
        Aeu: {
          ...o.Aeu,
          serverName: r,
          checkServerIdentity: (c, u) => $Yc.checkServerIdentity(r, u)
        }
      })
    });
  }
  async function jYc() {
    if (ISr()) {
      return;
    }
    try {
      await fetch("http://169.254.169.254/", {
        signal: AbortSignal.timeout(200),
        redirect: "manual"
      });
      vu("warn", "pod can reach cloud metadata endpoint (169.254.169.254); apply egress NetworkPolicy (see src/gateway/docs/docker/network-policy.yaml)");
    } catch {}
  }
  var PSr;
  var OSr;
  var $Yc;
  var w5f;
  var HYc = (e, t, n) => {
    let r = typeof t === "function" ? {} : t;
    let o = typeof t === "function" ? t : n;
    PSr.lookup(e, {
      ...r,
      all: true
    }, (s, i) => {
      if (s) {
        return o(s);
      }
      if (i.length === 0) {
        return o(Object.assign(Error(`getaddrinfo ENOTFOUND ${e}`), {
          code: "ENOTFOUND"
        }));
      }
      for (let {
        address: l
      } of i) {
        if (kss(l)) {
          return o(Error(`${"ECONNREFUSED_SSRF: blocked (cloud metadata / link-local)"}: ${e} \u2192 ${l}`));
        }
      }
      let a = i.find(l => l.family === 4) ?? i[0];
      if (r.all) {
        return o(null, [a]);
      }
      return o(null, a.address, a.family);
    });
  };
  var Nkt = __lazy(() => {
    gn();
    Fee();
    PSr = require("dns");
    OSr = __toESM(Rss(), 1);
    $Yc = require("tls");
    w5f = new Set(["metadata.google.internal", "metadata.goog", "metadata"]);
  });
  function C5f(e) {
    for (let t of [e.jwks_uri, e.token_endpoint, e.userinfo_endpoint]) {
      if (t && !e7(t)) {
        throw Error(`OIDC discovery returned a blocked endpoint: ${t}`);
      }
    }
  }
  async function qYc(e) {
    let t = e.ca_cert_pem ? Buffer.from(e.ca_cert_pem) : undefined;
    let n = (i, a) => ({
      ...a,
      lookup: HYc,
      ...(t && {
        ca: t
      })
    });
    qos[pSr.http_options] = n;
    let r = await qos.discover(e.discovery_url ?? e.issuer);
    C5f(r.metadata);
    let o = r.metadata.token_endpoint_auth_methods_supported;
    let s = new r.Client({
      client_id: e.client_id,
      client_secret: e.client_secret,
      response_types: ["code"],
      token_endpoint_auth_method: e.token_endpoint_auth_method ?? (o && !o.includes("client_secret_post") ? "client_secret_basic" : "client_secret_post"),
      ...(e.id_token_signed_response_alg && {
        id_token_signed_response_alg: e.id_token_signed_response_alg
      })
    }, undefined, e.additional_authorized_parties ? {
      additionalAuthorizedParties: e.additional_authorized_parties
    } : undefined);
    if (s[pSr.http_options] = n, e.clock_skew_seconds !== undefined) {
      s[pSr.clock_tolerance] = e.clock_skew_seconds;
    }
    return s;
  }
  function WYc(e, t) {
    let n = e.email_verified;
    if (n !== undefined && n !== true && n !== "true") {
      throw Error("id_token email is not verified");
    }
    if (!t?.length) {
      return;
    }
    let r = e.email;
    if (typeof r !== "string" || !r.includes("@")) {
      throw Error("id_token missing email claim \u2014 configure your IdP to include `email` " + "in the id_token, or set oidc.email_claim if it uses a different claim name");
    }
    let o = r.slice(r.lastIndexOf("@") + 1).toLowerCase();
    if (!t.includes(o)) {
      throw Error("email domain not allowed");
    }
  }
  function GYc(e, t) {
    if (!t?.length) {
      return;
    }
    let n = new Set(t);
    if (!e?.some(r => n.vZc(r))) {
      throw Error("user is not a member of an allowed group");
    }
  }
  function DSr(e, t) {
    if (!t.startsWith("/")) {
      return e[t];
    }
    let n = e;
    for (let r of t.slice(1).split("/")) {
      if (n === null || typeof n !== "object") {
        return;
      }
      let o = r.replace(/~1/g, "/").replace(/~0/g, "~");
      n = n[o];
    }
    return n;
  }
  function MSr(e, t) {
    let n = Array.isArray(t) ? t : [t];
    for (let r of n) {
      let o = DSr(e, r);
      if (o !== undefined && o !== null) {
        return o;
      }
    }
    return;
  }
  var VYc = __lazy(() => {
    mSr();
    Nkt();
  });
  function oQe(e) {
    return e.replace(/[&<>"']/g, t => R5f[t] ?? t);
  }
  function NSr(e, t) {
    let n = t?.script ? zYc.randomBytes(16).toString("base64url") : undefined;
    let r = t?.formAction ? `'self' ${t.formAction}` : "'self'";
    return new Response(`<!doctype html><html lang="en"><meta charset=utf-8><meta name="viewport" content="width=device-width,initial-scale=1"><title>Claude Code</title><style>${x5f}</style><main>${e}</main>${t?.script ? `<script nonce="${n}">${t.script}</script>` : ""}`, {
      headers: {
        "Content-Type": "text/html; charset=utf-8",
        "Content-Security-Policy": `default-src 'none'; style-src 'unsafe-inline'; ${n ? `script-src 'nonce-${n}'; ` : ""}frame-ancestors 'none'; form-action ${r}; base-uri 'none'`,
        "Cache-Control": "no-store",
        Pragma: "no-cache"
      }
    });
  }
  function KYc(e, t, n) {
    let r = oQe(e);
    let o = oQe(new URL(t).hostname);
    return new Response(`<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Claude gateway for Amazon Bedrock, Google Cloud, and Microsoft Foundry</title>
</head>
<body style="font-family: monospace; margin: 1em;">
<pre style="line-height: 1; margin: 0 0 1em 0;">${k5f}</pre>
<pre style="margin: 0;">
<b>Claude gateway for Amazon Bedrock, Google Cloud, and Microsoft Foundry</b>

Running at ${r}

To connect from Claude Code:
  Your admin provisions this gateway URL via managed settings
  (forceLoginGatewayUrl) \u2014 then /login connects here directly.

Identity provider   ${o}
Discovery           <a href="/.well-known/oauth-authorization-server">/.well-known/oauth-authorization-server</a>
Version             ${oQe(n)}
</pre>
</body>
</html>`, {
      headers: {
        "Content-Type": "text/html; charset=utf-8",
        "Content-Security-Policy": "default-src 'none'; style-src 'unsafe-inline'; frame-ancestors 'none'; form-action 'none'; base-uri 'none'",
        "Cache-Control": "no-store"
      }
    });
  }
  function Tin(e) {
    let {
      prefill: t,
      error: n,
      idpOrigin: r
    } = e;
    let o = n ? `<div class="error-card" style="margin-top:20px"><span class="bang" aria-hidden="true">!</span><span class="msg">${oQe(n)}</span></div>` : "";
    if (t) {
      return NSr(`<span class="status warn">Confirm device</span>
<h1>Approve sign-in?</h1>
<p class="sub">A device is requesting access to Claude Code. <strong>Only continue if this code matches the one shown on your device.</strong> If you didn't start this, close this tab.</p>
<form method="post" action="/device">
  <div class="code-display">${oQe(t)}</div>
  <input type="hidden" name="user_code" value="${oQe(t)}">
  <button class="go" type="submit">This matches my device \u2014 continue</button>
</form>
${o}`, {
        formAction: r
      });
    }
    return NSr(`<span class="status warn">Connect device</span>
<h1>Enter the code from your device.</h1>
<p class="sub">Claude Code shows a short code when you sign in. Enter it here to connect \u2014 then you'll sign in with your company identity provider.</p>
<form method="post" action="/device">
  <input class="code-input" name="user_code" inputmode="latin" autocomplete="off" autocapitalize="characters" autocorrect="off" spellcheck="false" placeholder="XXXX-XXXX" maxlength="9" autofocus required>
  <button class="go" type="submit">Continue</button>
</form>
${o}`, {
      formAction: r
    });
  }
  function sQe(e) {
    if (e) {
      return NSr(`<span class="status err">Sign-in failed</span>
<h1>We couldn&rsquo;t finish signing you in.</h1>
<p class="sub">Close this tab and try signing in again. If the error persists, share the message below with your IT administrator.</p>
<div class="error-card"><span class="bang" aria-hidden="true">!</span><span class="msg">${oQe(e)}</span></div>`);
    }
    return NSr(`<span class="status">Connected</span>
<h1>You&rsquo;re signed in.</h1>
<p class="sub">Return to your device \u2014 it should connect within a few seconds. You can close this tab.</p>`, {
      script: "setTimeout(function(){try{window.close()}catch(e){}}, 1500)"
    });
  }
  var zYc;
  var R5f;
  var x5f = `
*,*::before,*::after{box-sizing:border-box}
html,body{margin:0;padding:0}
body{min-height:100vh;background:#FAF9F5;color:#141413;font:15px/1.5 ui-sans-serif,-apple-system,BlinkMacSystemFont,"Segoe UI",Helvetica,Arial,sans-serif;-webkit-font-smoothing:antialiased;display:flex;flex-direction:column;align-items:center;justify-content:center;padding:48px 24px}
main{width:100%;max-width:560px}
.status{display:inline-flex;align-items:center;gap:8px;padding:4px 10px 4px 8px;border-radius:999px;background:rgba(85,138,66,.10);color:#345C28;font-size:12.5px;font-weight:500;letter-spacing:-.005em;margin-bottom:20px}
.status::before{content:"";width:6px;height:6px;border-radius:50%;background:#558A42;box-shadow:0 0 0 3px rgba(85,138,66,.18)}
.status.err{background:rgba(166,50,68,.08);color:#671D28}
.status.err::before{background:#A63244;box-shadow:0 0 0 3px rgba(166,50,68,.15)}
.status.warn{background:rgba(31,30,29,.06);color:#4D4C48}
.status.warn::before{background:#73726C;box-shadow:0 0 0 3px rgba(31,30,29,.12)}
h1{font-family:ui-serif,Charter,"Iowan Old Style",Georgia,serif;font-weight:400;font-size:32px;line-height:1.15;letter-spacing:-.02em;margin:0 0 10px;text-wrap:balance}
.sub{margin:0 0 28px;color:#4D4C48;font-size:15px;line-height:1.55;max-width:52ch}
.sub strong{color:#141413;font-weight:600}
.code-input{width:100%;font:24px/1 ui-monospace,"SF Mono",SFMono-Regular,Menlo,Consolas,monospace;letter-spacing:.25em;text-align:center;text-transform:uppercase;padding:18px 16px;border:.5px solid rgba(31,30,29,.25);border-radius:12px;background:#FFF;color:#141413;outline:none;margin-bottom:16px}
.code-input:focus{border-color:#2A78D6;box-shadow:0 0 0 3px rgba(42,120,214,.18)}
.code-display{font:28px/1 ui-monospace,"SF Mono",SFMono-Regular,Menlo,Consolas,monospace;letter-spacing:.3em;text-align:center;padding:22px 16px;border:.5px solid rgba(31,30,29,.15);border-radius:12px;background:#FFF;margin-bottom:8px}
button.go{appearance:none;border:none;width:100%;background:#141413;color:#FAF9F5;font:inherit;font-size:15px;font-weight:500;padding:14px 20px;border-radius:10px;cursor:pointer}
button.go:hover{background:#2A2926}
button.go:focus-visible{outline:2px solid #2A78D6;outline-offset:2px}
.error-card{background:#FFF;border:.5px solid rgba(31,30,29,.15);border-left:3px solid #A63244;border-radius:10px;padding:14px 16px;font-size:14px;line-height:1.5;display:flex;align-items:flex-start;gap:10px}
.error-card .bang{flex:none;width:18px;height:18px;border-radius:50%;background:#A63244;color:#FFF;font-size:12px;font-weight:700;display:inline-flex;align-items:center;justify-content:center;line-height:1;margin-top:1px}
.error-card .msg{color:#3D3D3A}
@media (max-width:520px){h1{font-size:26px}body{padding:32px 18px}.code-display,.code-input{font-size:22px}}
`;
  var k5f = ` \u2590\u259B\u2588\u2588\u2588\u259C\u258C
\u259D\u259C\u2588\u2588\u2588\u2588\u2588\u259B\u2598
  \u2598\u2598 \u259D\u259D`;
  var YYc = __lazy(() => {
    zYc = require("crypto");
    R5f = {
      "&": "&amp;",
      "<": "&lt;",
      ">": "&gt;",
      '"': "&quot;",
      "'": "&#39;"
    };
  });
  function Pss(e) {
    if (e.includes("/")) {
      let [n, r] = n6.parseCIDR(e);
      if (n instanceof n6.IPv6 && n.isIPv4MappedAddress() && r >= 96) {
        return [n.toIPv4Address(), r - 96];
      }
      return [n, r];
    }
    let t = n6.parse(e);
    if (t instanceof n6.IPv6 && t.isIPv4MappedAddress()) {
      return [t.toIPv4Address(), 32];
    }
    return [t, t.kind() === "ipv6" ? 128 : 32];
  }
  function LSr(e) {
    return e.map(Pss);
  }
  function Ass(e) {
    try {
      let t = n6.parse(e);
      if (t instanceof n6.IPv6 && t.isIPv4MappedAddress()) {
        return t.toIPv4Address();
      }
      return t;
    } catch {
      return null;
    }
  }
  function Iss(e, t) {
    for (let [n, r] of t) {
      if (e instanceof n6.IPv4 && n instanceof n6.IPv4 && e.match(n, r)) {
        return true;
      }
      if (e instanceof n6.IPv6 && n instanceof n6.IPv6 && e.match(n, r)) {
        return true;
      }
    }
    return false;
  }
  function JYc(e, t, n) {
    if (!e || n.length === 0) {
      return e;
    }
    let r = Ass(e);
    if (!r || !Iss(r, n)) {
      return e;
    }
    if (!t) {
      return e;
    }
    let o = t.split(",").map(s => s.trim()).filter(Boolean);
    for (let s = o.length - 1; s >= 0; s--) {
      let i = Ass(o[s]);
      if (!i) {
        return e;
      }
      if (!Iss(i, n)) {
        return i.toString();
      }
    }
    return e;
  }
  function Oss(e, t) {
    if (!e || t.length === 0) {
      return false;
    }
    let n = Ass(e);
    return n !== null && Iss(n, t);
  }
  var n6;
  var Dss = __lazy(() => {
    n6 = __toESM(Rss(), 1);
  });
  function A5f(e) {
    return eJc.vZc(e);
  }
  function P5f(e) {
    try {
      let t = new URL(e);
      if (t.protocol === "https:") {
        return true;
      }
      if (t.protocol === "http:" && eJc.vZc(t.hostname)) {
        return true;
      }
      return false;
    } catch {
      return false;
    }
  }
  async function Mss(e) {
    if (typeof e === "string") {
      let t = e.match(/^\$\{file:(.+)\}$/);
      if (t) {
        let n = t[1];
        if (!ZYc.isAbsolute(n)) {
          throw Error(`\${file:} path must be absolute: ${n}`);
        }
        return (await FSr.readFile(n, "utf8")).trim();
      }
      return e.replace(/\$\{(\w+)\}/g, (n, r) => {
        let o = process.env[r];
        if (o === undefined) {
          throw Error(`undefined env var in config: ${r}`);
        }
        return o;
      });
    }
    if (Array.isArray(e)) {
      return Promise.all(e.map(Mss));
    }
    if (e && typeof e === "object") {
      let t = {};
      for (let [n, r] of Object.entries(e)) {
        t[n] = await Mss(r);
      }
      return t;
    }
    return e;
  }
  async function tJc(e) {
    let t = await FSr.readFile(e, "utf8");
    let n = Zj(t);
    let r = await Mss(n);
    if (typeof r === "object" && r !== null && "dev" in r) {
      throw Error("`dev:` was removed \u2014 the gateway is Postgres-only. Set store.postgres_url " + "(local: docker run --rm -p 5432:5432 -e POSTGRES_HOST_AUTH_METHOD=trust postgres)");
    }
    return O5f().parse(r);
  }
  function D5f(e) {
    let t = e.availableModels;
    return Array.isArray(t) && t.every(n => typeof n === "string") ? t : undefined;
  }
  async function nJc(e) {
    let t = $5f(e);
    let n = e.managed;
    let r;
    if (n?.policies) {
      r = n.policies.map((o, s) => (QYc(o.cli, `managed.policies[${s}].cli`), {
        match: o.match,
        cli: o.cli,
        desktop: o.desktop
      }));
      r = N5f(r);
    } else if (n?.settings) {
      let o = await H5f(n.settings);
      QYc(o, "managed settings");
      r = [{
        match: {},
        cli: o
      }];
    } else if (t) {
      r = [{
        match: {},
        cli: {}
      }];
    } else {
      return null;
    }
    return r.map(({
      match: o,
      cli: s,
      desktop: i
    }) => {
      let a = t ? {
        ...s,
        env: {
          ...t,
          ...(Ein(s.env) ? s.env : {})
        }
      } : s;
      let l = P5n(a);
      return {
        match: o,
        payload: {
          uuid: l,
          checksum: l,
          settings: a
        },
        availableModels: D5f(a),
        desktop: i
      };
    });
  }
  function Ein(e) {
    return typeof e === "object" && e !== null && !Array.isArray(e);
  }
  function M5f(e) {
    return e.groups === undefined && e.email_domain === undefined;
  }
  function N5f(e) {
    let t = e.findIndex(r => M5f(r.match));
    if (t === -1) {
      return e;
    }
    if (t !== e.length - 1) {
      vu("warn", `managed.policies[${t}] is a catch-all (match: {}) but is not the ` + "last entry \u2014 policies after it will never match. Move it to the end.");
    }
    let n = e[t];
    return e.map((r, o) => {
      if (o === t) {
        return r;
      }
      let s = L5f(n.cli, r.cli);
      let i = Object.keys(s).filter(a => De(s[a]) !== De(r.cli[a]));
      if (i.length > 0) {
        vu("info", `managed.policies[${o}] after merge with catch-all base \u2014 changed keys: ${i.join(", ")}`);
      }
      return {
        ...r,
        cli: s,
        desktop: n.desktop || r.desktop ? {
          ...n.desktop,
          ...r.desktop
        } : undefined
      };
    });
  }
  function L5f(e, t) {
    let n = {
      ...e,
      ...t
    };
    for (let r of F5f) {
      let o = e[r];
      let s = t[r];
      if (Ein(o) && Ein(s)) {
        n[r] = {
          ...o,
          ...s
        };
      }
    }
    for (let r of U5f) {
      n[r] = oJc(e[r], t[r]);
    }
    n.permissions = XYc(e.permissions, t.permissions, B5f);
    n.hooks = XYc(e.hooks, t.hooks);
    return rJc(n);
  }
  function XYc(e, t, n) {
    let r = Ein(e) ? e : undefined;
    let o = Ein(t) ? t : undefined;
    if (!r && !o) {
      return;
    }
    let s = {
      ...(r ?? {}),
      ...(o ?? {})
    };
    for (let i of n ?? Object.keys(s)) {
      s[i] = oJc(r?.[i], o?.[i]);
    }
    return rJc(s);
  }
  function rJc(e) {
    for (let t of Object.keys(e)) {
      if (e[t] === undefined) {
        delete e[t];
      }
    }
    return e;
  }
  function oJc(e, t) {
    let n = Array.isArray(e) ? e : [];
    let r = Array.isArray(t) ? t : [];
    if (n.length === 0 && r.length === 0) {
      return Array.isArray(e) || Array.isArray(t) ? [] : undefined;
    }
    let o = new Set();
    let s = [];
    for (let i of [...n, ...r]) {
      let a = De(i);
      if (!o.vZc(a)) {
        o.add(a);
        s.push(i);
      }
    }
    return s;
  }
  function $5f(e) {
    if (e.telemetry.forward_to.length === 0) {
      return null;
    }
    let t = e.listen.public_url;
    if (!t) {
      vu("warn", "telemetry.forward_to is configured but listen.public_url is not \u2014 " + "clients will not be told to export OTLP. Set listen.public_url so /managed/settings can push OTEL_EXPORTER_OTLP_ENDPOINT.");
      return null;
    }
    return {
      CLAUDE_CODE_ENABLE_TELEMETRY: "1",
      OTEL_METRICS_EXPORTER: "otlp",
      OTEL_LOGS_EXPORTER: "otlp",
      OTEL_TRACES_EXPORTER: "otlp",
      OTEL_EXPORTER_OTLP_ENDPOINT: t,
      OTEL_EXPORTER_OTLP_PROTOCOL: "http/protobuf"
    };
  }
  function USr(e, t) {
    let n = t.groups ?? [];
    let r = t.email?.includes("@") ? t.email.slice(t.email.lastIndexOf("@") + 1).toLowerCase() : undefined;
    for (let [o, s] of e.entries()) {
      let {
        groups: i,
        email_domain: a
      } = s.match;
      if (i && !i.some(l => n.includes(l))) {
        continue;
      }
      if (a && r !== a) {
        continue;
      }
      return {
        index: o,
        policy: s
      };
    }
    return null;
  }
  function QYc(e, t) {
    let n = $N();
    let r = n.safeParse(e);
    let o = [];
    if (!r.success) {
      o.push(...r.error.issues.map(s => `  ${s.path.join(".")}: ${s.message}`));
    }
    if (e !== null && typeof e === "object") {
      let s = new Set(Object.keys(n.shape));
      for (let [i, a] of Object.entries(e)) {
        if (i === "mcpServers") {
          if (a !== undefined) {
            o.push("  mcpServers: not supported via gateway managed settings yet \u2014 remove it from the document");
          }
        } else if (!s.vZc(i)) {
          o.push(`  ${i}: unknown settings key \u2014 fix the typo, upgrade the gateway if this key was added in a newer CLI, or set the gateway's matching env/build gate if the key is gated (e.g. CLAUDE_CODE_ENABLE_XAA for xaaIdp)`);
        }
      }
    }
    if (o.length > 0) {
      throw Error(`${t} invalid:
${o.join(`
`)}`);
    }
  }
  async function H5f(e) {
    if (!e) {
      return {};
    }
    let t;
    try {
      t = await FSr.readFile(e, "utf8");
    } catch (r) {
      if (fn(r)) {
        return {};
      }
      throw r;
    }
    let n = qt(t);
    if (typeof n !== "object" || n === null || Array.isArray(n)) {
      throw Error(`Managed settings file ${e}: expected a JSON object, got ${Array.isArray(n) ? "array" : typeof n}`);
    }
    return n;
  }
  var FSr;
  var ZYc;
  var eJc;
  var I5f;
  var O5f;
  var F5f;
  var U5f;
  var B5f;
  var sJc = __lazy(() => {
    qg();
    dt();
    Rj();
    Owo();
    Dss();
    Fee();
    Nkt();
    FSr = require("fs/promises");
    ZYc = require("path");
    eJc = new Set(["localhost", "127.0.0.1", "::1", "[::1]"]);
    I5f = we(() => Ke.object({
      modelDiscoveryEnabled: Ke.boolean(),
      coworkTabEnabled: Ke.boolean(),
      isClaudeCodeForDesktopEnabled: Ke.boolean(),
      isDesktopExtensionEnabled: Ke.boolean(),
      isDesktopExtensionSignatureRequired: Ke.boolean(),
      isLocalDevMcpEnabled: Ke.boolean(),
      disableAutoUpdates: Ke.boolean(),
      autoUpdaterEnforcementHours: Ke.coerce.number().int().gt(0).lte(72),
      banner: Ke.object({
        enabled: Ke.boolean().optional(),
        text: Ke.string().optional(),
        backgroundColor: Ke.string().optional(),
        textColor: Ke.string().optional(),
        linkUrl: Ke.string().optional()
      }).strict()
    }).partial().strict());
    O5f = we(() => {
      let e = Ke.string().optional();
      let t = Ke.discriminatedUnion("provider", [Ke.strictObject({
        name: e,
        provider: Ke.literal("anthropic"),
        base_url: Ke.string().default("https://api.anthropic.com").refine(e7, {
          message: "base_url targets a metadata endpoint"
        }),
        auth: Ke.union([Ke.object({
          api_key: Ke.string().min(1)
        }).strict(), Ke.object({
          oauth_token: Ke.string().min(1)
        }).strict(), Ke.object({
          federation_rule_id: Ke.string().min(1),
          organization_id: Ke.string().min(1),
          identity_token_file: Ke.string().min(1),
          service_account_id: Ke.string().optional(),
          workspace_id: Ke.string().optional()
        }).strict()])
      }), Ke.strictObject({
        name: e,
        provider: Ke.literal("bedrock"),
        region: Ke.string().min(1),
        base_url: Ke.string().optional().refine(r => r === undefined || e7(r), {
          message: "base_url targets a metadata endpoint"
        }),
        auth: Ke.strictObject({
          aws_access_key_id: Ke.string().optional(),
          aws_secret_access_key: Ke.string().optional(),
          aws_session_token: Ke.string().optional(),
          aws_bearer_token: Ke.string().optional()
        }).default({})
      }), Ke.strictObject({
        name: e,
        provider: Ke.literal("anthropicAws"),
        region: Ke.string().regex(/^[a-z0-9-]+$/, "must be an AWS region (lowercase alnum + hyphens)"),
        workspace_id: Ke.string().min(1).regex(/^[\x21-\x7e]+$/, "must be a valid header value"),
        base_url: Ke.string().optional().refine(r => r === undefined || e7(r), {
          message: "base_url targets a metadata endpoint"
        }),
        auth: Ke.strictObject({
          api_key: Ke.string().min(1).optional(),
          aws_access_key_id: Ke.string().optional(),
          aws_secret_access_key: Ke.string().optional(),
          aws_session_token: Ke.string().optional()
        }).default({})
      }), Ke.strictObject({
        name: e,
        provider: Ke.literal("vertex"),
        region: Ke.string().min(1),
        project_id: Ke.string().min(1),
        base_url: Ke.string().optional().refine(r => r === undefined || e7(r), {
          message: "base_url targets a metadata endpoint"
        }),
        auth: Ke.strictObject({
          service_account_json: Ke.string().optional(),
          access_token: Ke.string().optional()
        }).default({})
      }), Ke.strictObject({
        name: e,
        provider: Ke.literal("foundry"),
        resource: Ke.string().regex(/^[a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?$/i, "must be a valid DNS label"),
        base_url: Ke.string().optional().refine(r => r === undefined || e7(r), {
          message: "base_url targets a metadata endpoint"
        }),
        auth: Ke.union([Ke.strictObject({
          api_key: Ke.string().min(1)
        }), Ke.strictObject({
          use_azure_ad: Ke.literal(true)
        })])
      })]);
      let n = Ke.string().refine(r => {
        try {
          Pss(r);
          return true;
        } catch {
          return false;
        }
      }, {
        message: "must be a valid IP or CIDR"
      });
      return Ke.strictObject({
        $schema: Ke.string().optional(),
        listen: Ke.strictObject({
          host: Ke.string().default("0.0.0.0"),
          port: Ke.coerce.number().default(8080),
          Aeu: Ke.strictObject({
            cert: Ke.string(),
            key: Ke.string()
          }).optional(),
          public_url: Ke.string().url().transform(r => r.replace(/\/$/, "")).optional(),
          trusted_proxies: Ke.array(n).default([])
        }).refine(r => r.public_url !== undefined || A5f(r.host), {
          path: ["public_url"],
          message: "listen.public_url is required when listen.host is not a " + "loopback address \u2014 set it to the externally-visible origin " + "(e.g. https://claude-gateway.corp.example.com). Without it the IdP redirect_uri and token issuer would be derived from the client-controlled Host header."
        }),
        access_control: Ke.strictObject({
          allow_cidrs: Ke.array(n).default([]),
          deny_cidrs: Ke.array(n).default([])
        }).default({}),
        limits: Ke.strictObject({
          max_request_bytes: Ke.coerce.number().int().positive().default(33554432),
          max_request_header_bytes: Ke.coerce.number().int().positive().optional(),
          max_url_length: Ke.coerce.number().int().positive().optional()
        }).default({}),
        rate_limits: Ke.strictObject({
          device_authorization: Ke.strictObject({
            max: Ke.coerce.number().int().positive().default(30),
            window_seconds: Ke.coerce.number().int().positive().default(600)
          }).default({}),
          device_verify: Ke.strictObject({
            max: Ke.coerce.number().int().positive().default(10),
            window_seconds: Ke.coerce.number().int().positive().default(600)
          }).default({})
        }).default({}),
        timeouts: Ke.strictObject({
          upstream_ttfb_ms: Ke.coerce.number().int().positive().default(120000)
        }).default({}),
        upstreams: Ke.array(t).min(1).transform(r => r.map(o => ({
          ...o,
          name: o.name ?? o.provider
        }))).superRefine((r, o) => {
          let s = new Set();
          for (let i of r) {
            if (s.vZc(i.name)) {
              o.addIssue({
                code: Ke.ZodIssueCode.custom,
                message: `duplicate upstream name '${i.name}' \u2014 set distinct 'name:' on each`
              });
            }
            s.add(i.name);
          }
        }),
        auto_include_builtin_models: Ke.boolean().default(true),
        models: Ke.array(Ke.strictObject({
          id: Ke.string().min(1),
          label: Ke.string().optional(),
          description: Ke.string().optional(),
          upstream_model: Ke.record(Ke.string()).refine(r => Object.keys(r).length > 0, {
            message: "upstream_model must set at least one upstream"
          })
        })).default([]),
        oidc: Ke.strictObject({
          issuer: Ke.string().refine(e7, {
            message: "oidc.issuer must be an http(s) URL and not target a cloud metadata endpoint"
          }),
          client_id: Ke.string().min(1),
          client_secret: Ke.string().min(1),
          ca_cert_pem: Ke.string().optional(),
          groups_claim: Ke.string().min(1).default("groups"),
          email_claim: Ke.union([Ke.string().min(1), Ke.array(Ke.string().min(1)).min(1)]).default("email"),
          userinfo_fallback: Ke.boolean().default(false),
          use_pkce: Ke.boolean().default(true),
          clock_skew_seconds: Ke.coerce.number().int().nonnegative().optional(),
          token_endpoint_auth_method: Ke.enum(["client_secret_basic", "client_secret_post"]).optional(),
          id_token_signed_response_alg: Ke.enum(["RS256", "RS384", "RS512", "PS256", "PS384", "PS512", "ES256", "ES384", "ES512", "EdDSA"]).optional(),
          additional_authorized_parties: Ke.array(Ke.string()).optional(),
          discovery_url: Ke.string().url().refine(e7, {
            message: "oidc.discovery_url must be an http(s) URL and not target a cloud metadata endpoint"
          }).refine(r => {
            try {
              return new URL(r).pathname.includes("/.well-known/");
            } catch {
              return false;
            }
          }, {
            message: "oidc.discovery_url must point at the discovery document itself (path containing /.well-known/) \u2014 openid-client appends /.well-known/openid-configuration to any other path"
          }).optional(),
          scopes: Ke.array(Ke.string().trim().min(1).refine(r => !/\s/.test(r), {
            message: "must be a single OAuth scope token (no whitespace)"
          })).optional().refine(r => r === undefined || r.includes("openid"), {
            message: "oidc.scopes must include 'openid' \u2014 without it the IdP will not return an id_token"
          }),
          extra_auth_params: Ke.record(Ke.string().min(1), Ke.string()).default({}).refine(r => !Object.keys(r).some(o => ["redirect_uri", "state", "nonce", "code_challenge", "code_challenge_method", "scope", "response_type", "response_mode", "client_id"].includes(o)), {
            message: "oidc.extra_auth_params must not override protocol parameters the gateway manages (redirect_uri, state, nonce, code_challenge*, scope, response_type, response_mode, client_id) \u2014 use oidc.scopes for scope; the gateway callback only reads query-mode responses"
          }),
          allowed_email_domains: Ke.array(Ke.string()).transform((r, o) => {
            let s = r.map(i => i.trim().replace(/^@/, "").toLowerCase()).filter(Boolean);
            if (r.length > 0 && s.length === 0) {
              o.addIssue({
                code: Ke.ZodIssueCode.custom,
                message: "allowed_email_domains contains only empty entries after normalization"
              });
            }
            return s;
          }).optional(),
          form_action_origins: Ke.array(Ke.string().refine(e7, {
            message: "each form_action_origin must be an http(s) URL and not target a cloud metadata endpoint"
          })).transform(r => r.map(o => new URL(o).origin)).refine(r => r.every(o => !/[;,'"\s]/.test(o)), {
            message: "oidc.form_action_origins entries must not contain CSP delimiters (; , quotes or whitespace)"
          }).default([]),
          allowed_groups: Ke.array(Ke.string()).refine(r => !r.length || r.some(o => o.trim()), {
            message: "oidc.allowed_groups contains only empty entries"
          }).transform(r => r.map(o => o.trim()).filter(Boolean)).optional(),
          google_groups: Ke.strictObject({
            service_account_json_path: Ke.string().min(1),
            admin_email: Ke.string().email()
          }).optional()
        }),
        session: Ke.strictObject({
          jwt_secret: Ke.union([Ke.string().min(32), Ke.array(Ke.string().min(32)).min(1)]).transform(r => Array.isArray(r) ? r : [r]),
          ttl_hours: Ke.coerce.number().default(1)
        }),
        store: Ke.strictObject({
          postgres_url: Ke.string().regex(/^postgres(ql)?:\/\//, "must be postgres:// or postgresql://"),
          username: Ke.string().optional(),
          password: Ke.string().optional(),
          max_connections: Ke.coerce.number().int().positive().default(5)
        }),
        telemetry: Ke.strictObject({
          forward_to: Ke.array(Ke.strictObject({
            url: Ke.string().refine(P5f, {
              message: "forward_to.url must be https:// (http:// allowed for loopback only)"
            }).refine(e7, {
              message: "forward_to.url must not target a cloud metadata endpoint"
            }),
            headers: Ke.record(Ke.string()).default({}),
            metrics: Ke.boolean().default(true),
            logs: Ke.boolean().default(false),
            traces: Ke.boolean().default(false)
          })).default([])
        }).default({
          forward_to: []
        }),
        managed: Ke.strictObject({
          settings: Ke.string().optional(),
          policies: Ke.array(Ke.object({
            match: Ke.strictObject({
              groups: Ke.array(Ke.string()).optional(),
              email_domain: Ke.string().toLowerCase().optional()
            }).default({}),
            cli: Ke.record(Ke.unknown()).optional(),
            settings: Ke.record(Ke.unknown()).optional(),
            desktop: I5f().optional()
          }).strict().transform(({
            match: r,
            cli: o,
            settings: s,
            desktop: i
          }) => ({
            match: r,
            cli: o ?? s ?? {},
            desktop: i
          }))).optional()
        }).optional(),
        admin: Ke.strictObject({
          read_keys: Ke.array(Ke.strictObject({
            id: Ke.string(),
            key: Ke.string().min(32)
          })).default([]),
          write_keys: Ke.array(Ke.strictObject({
            id: Ke.string(),
            key: Ke.string().min(32)
          })).default([]),
          admin_groups: Ke.array(Ke.string()).default([]),
          blocked_message: Ke.string().optional(),
          audit_retention_days: Ke.coerce.number().int().positive().default(365),
          spend_retention_months: Ke.coerce.number().int().positive().default(13),
          identity_retention_days: Ke.coerce.number().int().positive().default(90),
          group_limit_mode: Ke.enum(["min", "max"]).default("min")
        }).superRefine((r, o) => {
          let s = [...r.read_keys, ...r.write_keys].map(a => a.id);
          let i = s.find((a, l) => s.indexOf(a) !== l);
          if (i) {
            o.addIssue({
              code: Ke.ZodIssueCode.custom,
              message: `admin key id '${i}' is repeated; key ids must be unique for audit attribution`
            });
          }
        }).optional(),
        enforcement: Ke.strictObject({
          fail_closed_on_error: Ke.boolean().default(false)
        }).default({
          fail_closed_on_error: false
        })
      }).superRefine((r, o) => {
        if (r.enforcement.fail_closed_on_error && r.admin === undefined) {
          o.addIssue({
            code: Ke.ZodIssueCode.custom,
            path: ["enforcement", "fail_closed_on_error"],
            message: "has no effect without an `admin:` block \u2014 spend enforcement only runs when admin is configured"
          });
        }
        let s = new Set(r.upstreams.map(i => i.name));
        for (let [i, a] of r.models.entries()) {
          for (let l of Object.keys(a.upstream_model)) {
            if (!s.vZc(l)) {
              o.addIssue({
                code: Ke.ZodIssueCode.custom,
                path: ["models", i, "upstream_model", l],
                message: `references unknown upstream '${l}'`
              });
            }
          }
        }
      });
    });
    F5f = ["env", "modelOverrides", "skillOverrides"];
    U5f = ["disabledMcpjsonServers", "deniedMcpServers", "blockedMarketplaces"];
    B5f = ["deny", "ask"];
  });
  function j5f(e, t) {
    for (let n = e.indexOf(t); n !== -1; n = e.indexOf(t, n + 1)) {
      let r = n === 0 || !/[a-z0-9]/i.test(e[n - 1]);
      let o = n + t.length;
      let s = o === e.length || !/[a-z0-9]/i.test(e[o]);
      if (r && s) {
        return true;
      }
    }
    return false;
  }
  function iJc(e, t) {
    if (!e.startsWith(t)) {
      return false;
    }
    return e.length === t.length || e[t.length] === "-";
  }
  function aJc(e, t) {
    for (let n of t) {
      if (s2(n)) {
        continue;
      }
      let r = n.indexOf(e);
      if (r === -1) {
        continue;
      }
      let o = r + e.length;
      if (o === n.length || n[o] === "-") {
        return true;
      }
    }
    return false;
  }
  function Nss(e, t) {
    if (t.length === 0) {
      return false;
    }
    let n = t.map(o => ca(o.trim().toLowerCase()));
    let r = ca(e.trim().toLowerCase());
    if (n.includes(r)) {
      if (!s2(r) || !aJc(r, n)) {
        return true;
      }
    }
    for (let o of n) {
      if (s2(o) && !aJc(o, n) && j5f(r, o)) {
        return true;
      }
    }
    for (let o of n) {
      if (s2(o)) {
        continue;
      }
      if (iJc(r, o)) {
        return true;
      }
      if (!o.startsWith("claude-") && iJc(r, `claude-${o}`)) {
        return true;
      }
    }
    return false;
  }
  var lJc = __lazy(() => {
    Tk();
  });
  function W5f(e) {
    let t = new Headers();
    e.forEach((n, r) => {
      let o = r.toLowerCase();
      if (q5f.vZc(o) || o.startsWith("x-stainless-")) {
        t.set(r, n);
      }
    });
    return t;
  }
  async function uJc(e, t, n, r) {
    let o = typeof e.model === "string" ? e.model : null;
    let s = {
      system: e.system,
      messages: e.messages,
      tools: e.tools
    };
    for (let i of t) {
      if (i.kind === "sdk" && i.provider === "bedrock") {
        continue;
      }
      let a = o ? Lss(o, i, n, r) : null;
      if (!a?.ok) {
        continue;
      }
      let l = {
        ...s,
        model: a.model
      };
      try {
        if (i.kind === "sdk") {
          return (await i.client.messages.countTokens(l)).input_tokens;
        }
        let c = new Headers({
          "content-type": "application/json",
          "anthropic-version": "2023-06-01"
        });
        await i.applyAuth(c);
        let u = `${i.baseUrl.replace(/\/$/, "")}/v1/messages/count_tokens`;
        let d = await Mkt(u, {
          method: "POST",
          headers: c,
          body: De(l),
          ...getProxyFetchOptions({
            url: u
          }),
          timeout: false,
          signal: AbortSignal.timeout(1e4)
        });
        if (!d.ok) {
          continue;
        }
        let p = await d.json();
        if (typeof p.input_tokens === "number") {
          return p.input_tokens;
        }
      } catch {}
    }
    for (let i of t) {
      if (i.kind !== "sdk" || i.provider !== "bedrock") {
        continue;
      }
      let a = o ? Lss(o, i, n, r) : null;
      if (!a?.ok) {
        continue;
      }
      try {
        return (await i.client.messages.create({
          ...s,
          model: a.model,
          max_tokens: 1,
          stream: false
        })).usage.input_tokens;
      } catch {}
    }
    return Math.ceil(De(s).length / 4);
  }
  function dJc(e) {
    return z5f.includes(e);
  }
  function K5f(e, t) {
    let n = t8(e);
    let r = e.toLowerCase();
    return t.find(o => o.id.toLowerCase() === r || n !== null && t8(o.id) === n);
  }
  function Lss(e, t, n, r = true) {
    let o = t8(e);
    let s = K5f(e, n);
    let i = s?.upstream_model[t.name];
    if (i) {
      return {
        ok: true,
        model: i
      };
    }
    if (o && (r || s)) {
      let a = t.provider === "anthropic" ? o.firstParty : o[t.provider];
      if (!a) {
        return {
          ok: false,
          error: `model ${e} is not available on ${t.provider}`
        };
      }
      return {
        ok: true,
        model: a
      };
    }
    if (s) {
      return {
        ok: false,
        error: `model ${e} has no upstream_model.${t.name} configured`
      };
    }
    return {
      ok: false,
      error: `model ${e} is not in the operator's model allowlist`
    };
  }
  function A2e(e, t, n, r) {
    return Response.json({
      type: "error",
      ...(r && {
        request_id: r
      }),
      error: {
        type: t,
        message: n
      }
    }, {
      status: e
    });
  }
  function Y5f(e, t) {
    let n = new Headers();
    e.forEach((r, o) => {
      let s = o.toLowerCase();
      if (!t.includes(s) && !s.startsWith("anthropic-ratelimit-")) {
        n.set(o, r);
      }
    });
    return n;
  }
  async function J5f(e, t, n, r) {
    let o = new AbortController();
    let s = setTimeout(i => i.abort(), r, o);
    try {
      return await Mkt(e, {
        ...t,
        signal: AbortSignal.any([n, o.signal])
      });
    } finally {
      clearTimeout(s);
    }
  }
  async function pJc(e) {
    return Promise.all(e.map(async t => {
      switch (t.provider) {
        case "anthropic":
          {
            if ("api_key" in t.auth) {
              let i = t.auth.api_key;
              return {
                kind: "raw",
                name: t.name,
                provider: "anthropic",
                baseUrl: t.base_url,
                applyAuth: async a => {
                  a.set("x-api-key", i);
                }
              };
            }
            if ("oauth_token" in t.auth) {
              let i = t.auth.oauth_token;
              return {
                kind: "raw",
                name: t.name,
                provider: "anthropic",
                baseUrl: t.base_url,
                applyAuth: async a => {
                  a.set("Authorization", `Bearer ${i}`);
                  a.append("anthropic-beta", "oauth-2025-04-20");
                }
              };
            }
            let {
              resolveCredentialsFromConfig: n,
              TokenCache: r
            } = await Promise.resolve().then(() => (Hqe(), hGr));
            let o = n({
              organization_id: t.auth.organization_id,
              workspace_id: t.auth.workspace_id,
              base_url: t.base_url,
              authentication: {
                type: "oidc_federation",
                federation_rule_id: t.auth.federation_rule_id,
                service_account_id: t.auth.service_account_id,
                identity_token: {
                  source: "file",
                  path: t.auth.identity_token_file
                }
              }
            }, {
              baseURL: t.base_url,
              fetch: (i, a) => Mkt(String(i), {
                ...a,
                ...getProxyFetchOptions({
                  url: String(i)
                }),
                signal: AbortSignal.timeout(1e4)
              })
            });
            let s = new r(o.provider, i => vu("warn", `WIF advisory refresh (${t.name}): ${he(i)}`));
            return {
              kind: "raw",
              name: t.name,
              provider: "anthropic",
              baseUrl: t.base_url,
              applyAuth: async i => {
                i.set("Authorization", `Bearer ${await s.getToken()}`);
                for (let [a, l] of Object.entries(o.extraHeaders)) {
                  i.set(a, l);
                }
                i.append("anthropic-beta", "oauth-2025-04-20");
              },
              invalidateAuth: () => s.invalidate()
            };
          }
        case "bedrock":
          {
            let {
              AnthropicBedrock: n
            } = await Promise.resolve().then(() => (Vqe(), Gqe));
            let r = {
              awsRegion: t.region,
              ...(t.base_url && {
                baseURL: t.base_url
              }),
              timeout: 3600000,
              fetchOptions: {
                ...getProxyFetchOptions({
                  url: undefined
                }),
                timeout: false
              },
              maxRetries: 0
            };
            let o = t.auth.aws_bearer_token ? new n({
              ...r,
              skipAuth: true,
              defaultHeaders: {
                Authorization: `Bearer ${t.auth.aws_bearer_token}`
              }
            }) : t.auth.aws_access_key_id && t.auth.aws_secret_access_key ? new n({
              ...r,
              awsAccessKey: t.auth.aws_access_key_id,
              awsSecretKey: t.auth.aws_secret_access_key,
              awsSessionToken: t.auth.aws_session_token
            }) : new n(r);
            return {
              kind: "sdk",
              name: t.name,
              provider: "bedrock",
              client: o
            };
          }
        case "anthropicAws":
          {
            let {
              AnthropicAws: n
            } = await Promise.resolve().then(() => (Bzr(), Uzr));
            let r = {
              awsRegion: t.region,
              workspaceId: t.workspace_id,
              baseURL: t.base_url ?? `https://aws-external-anthropic.${t.region}.api.aws`,
              authToken: null,
              __auth: {
                provider: null,
                tokenCache: null,
                resolution: null,
                error: null,
                extraHeaders: {}
              },
              timeout: 3600000,
              fetchOptions: {
                ...getProxyFetchOptions({
                  url: undefined
                }),
                timeout: false
              },
              maxRetries: 0
            };
            let o;
            if (t.auth.api_key) {
              o = new n({
                ...r,
                apiKey: t.auth.api_key
              });
            } else if (t.auth.aws_access_key_id || t.auth.aws_secret_access_key) {
              o = new n({
                ...r,
                awsAccessKey: t.auth.aws_access_key_id,
                awsSecretAccessKey: t.auth.aws_secret_access_key,
                awsSessionToken: t.auth.aws_session_token
              });
            } else {
              let s = process.env.ANTHROPIC_AWS_API_KEY;
              delete process.env.ANTHROPIC_AWS_API_KEY;
              try {
                o = new n(r);
              } finally {
                if (s !== undefined) {
                  process.env.ANTHROPIC_AWS_API_KEY = s;
                }
              }
            }
            return {
              kind: "sdk",
              name: t.name,
              provider: "anthropicAws",
              client: o
            };
          }
        case "vertex":
          {
            let {
              AnthropicVertex: n
            } = await Promise.resolve().then(() => (BBt(), UBt));
            let r = {
              region: t.region,
              projectId: t.project_id,
              ...(t.base_url && {
                baseURL: t.base_url
              }),
              timeout: 3600000,
              fetchOptions: {
                ...getProxyFetchOptions({
                  url: undefined
                }),
                timeout: false
              },
              maxRetries: 0
            };
            if (t.auth.access_token) {
              let o = t.auth.access_token;
              r.authClient = {
                projectId: t.project_id,
                getRequestHeaders: async () => ({
                  Authorization: `Bearer ${o}`
                })
              };
            } else {
              let {
                GoogleAuth: o
              } = await Promise.resolve().then(() => __toESM(FBt(), 1));
              r.googleAuth = new o({
                scopes: ["https://www.googleapis.com/auth/cloud-platform"],
                projectId: t.project_id,
                ...(t.auth.service_account_json && {
                  keyFilename: t.auth.service_account_json
                })
              });
            }
            return {
              kind: "sdk",
              name: t.name,
              provider: "vertex",
              client: new n(r)
            };
          }
        case "foundry":
          {
            let {
              AnthropicFoundry: n
            } = await Promise.resolve().then(() => ($9r(), B9r));
            let r = {
              ...(t.base_url ? {
                baseURL: t.base_url
              } : {
                resource: t.resource
              }),
              timeout: 3600000,
              fetchOptions: {
                ...getProxyFetchOptions({
                  url: undefined
                }),
                timeout: false
              },
              maxRetries: 0
            };
            if ("api_key" in t.auth) {
              r.apiKey = t.auth.api_key;
            } else {
              let {
                DefaultAzureCredential: o
              } = await Promise.resolve().then(() => (Ozr(), Pzr));
              let s = new o();
              r.azureADTokenProvider = async () => {
                let i = await s.getToken("https://cognitiveservices.azure.com/.default");
                if (!i) {
                  throw Error("Azure AD token unavailable");
                }
                return i.token;
              };
            }
            return {
              kind: "sdk",
              name: t.name,
              provider: "foundry",
              client: new n(r)
            };
          }
      }
    }));
  }
  async function mJc(e, t, n, r, o = true, s, i = 120000, a, l) {
    let c = await e.arrayBuffer();
    let u;
    try {
      u = qt(Buffer.from(c).toString("utf8"));
    } catch {
      return A2e(400, "invalid_request_error", "invalid JSON", a);
    }
    if (typeof u !== "object" || u === null || Array.isArray(u)) {
      return A2e(400, "invalid_request_error", "request body must be a JSON object", a);
    }
    l?.(u);
    let d = "model" in u && typeof u.model === "string" ? u.model : undefined;
    if (s && d && !Nss(d, s)) {
      return A2e(400, "invalid_request_error", `model ${d} is not in your role's availableModels allowlist`, a);
    }
    let p = [];
    let m = false;
    let f = null;
    let h = null;
    let g = null;
    let y = null;
    let _ = e.headers.get("anthropic-beta") ?? undefined;
    let b = {};
    e.headers.forEach((S, E) => {
      if (E.toLowerCase().startsWith("x-stainless-")) {
        b[E] = S;
      }
    });
    for (let S of n) {
      if (e.signal.aborted) {
        break;
      }
      let E = d;
      if (d) {
        let x = Lss(d, S, r, o);
        if (!x.ok) {
          p.push(x.error);
          continue;
        }
        E = x.model;
      }
      let C = E === d ? u : {
        ...u,
        model: E
      };
      m = true;
      try {
        let x;
        if (S.kind === "raw") {
          let A = C === u ? c : new TextEncoder().HS(De(C));
          if (x = await cJc(e, t, A, S, i), x.status === 401 && S.invalidateAuth) {
            S.invalidateAuth();
            vu("warn", `401 from ${S.name}; invalidated WIF bearer cache, retrying request_id=${a ?? "-"}`);
            x.body?.cancel().catch(() => {});
            x = await cJc(e, t, A, S, i);
          }
        } else {
          x = await Z5f(t, C, S.provider, S.client, _, b, e.signal, a);
        }
        if (x.headers.set("x-gateway-upstream", S.name), d) {
          x.headers.set("x-gateway-model", d);
          x.headers.set("x-gateway-upstream-model", E ?? d);
        }
        if (x.status >= 500 || x.status === 429 || x.status === 401 || x.status === 403 || x.status === 404) {
          if (p.push(`${x.status} ${x.statusText}`), x.status === 501) {
            if (f) {
              f.body?.cancel().catch(() => {});
            }
            f = x;
          } else if (x.status === 429) {
            if (h) {
              h.body?.cancel().catch(() => {});
            }
            h = x;
          } else if (x.status === 401 || x.status === 403) {
            if (g) {
              g.body?.cancel().catch(() => {});
            }
            g = x;
          } else if (x.status === 404) {
            if (y) {
              y.body?.cancel().catch(() => {});
            }
            y = x;
          } else {
            x.body?.cancel().catch(() => {});
          }
          continue;
        }
        for (let A of [f, h, g, y]) {
          A?.body?.cancel().catch(() => {});
        }
        return x;
      } catch (x) {
        let A = he(x);
        p.push(A);
        vu("warn", `upstream failed, trying next request_id=${a ?? "-"}: ${A}`);
      }
    }
    if (e.signal.aborted) {
      for (let S of [f, h, g, y]) {
        S?.body?.cancel().catch(() => {});
      }
      return A2e(499, "api_error", "client closed request", a);
    }
    if (!m) {
      return A2e(400, "invalid_request_error", p.join("; "), a);
    }
    if (h) {
      for (let S of [f, g, y]) {
        S?.body?.cancel().catch(() => {});
      }
      return h;
    }
    if (g) {
      for (let S of [f, y]) {
        S?.body?.cancel().catch(() => {});
      }
      return g;
    }
    if (y) {
      if (f) {
        f.body?.cancel().catch(() => {});
      }
      return y;
    }
    if (f) {
      return f;
    }
    vu("warn", `all upstreams failed request_id=${a ?? "-"}: ${p.join("; ")}`);
    return A2e(502, "api_error", `all upstreams failed (${n.length} attempted)`, a);
  }
  async function cJc(e, t, n, r, o) {
    let s = new URL(e.url);
    let i = `${r.baseUrl.replace(/\/$/, "")}${t}${s.search}`;
    let a = W5f(e.headers);
    let l = {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION;
    let c = a.get("user-agent");
    a.set("user-agent", c ? `${c} cc-gateway/${l}` : `cc-gateway/${l}`);
    await r.applyAuth(a);
    let u = await J5f(i, {
      method: e.method,
      headers: a,
      body: n,
      duplex: "half",
      ...getProxyFetchOptions({
        url: i
      }),
      timeout: false
    }, e.signal, o);
    return new Response(u.body, {
      status: u.status,
      statusText: u.statusText,
      headers: Y5f(u.headers, G5f)
    });
  }
  function X5f(e, t) {
    let n = new TextEncoder();
    let r = e[Symbol.asyncIterator]();
    return new ReadableStream({
      async pull(o) {
        try {
          let {
            value: s,
            done: i
          } = await r.next();
          if (i) {
            o.close();
            return;
          }
          o.enqueue(n.HS(`event: ${s.type}
data: ${De(s)}

`));
        } catch (s) {
          vu("warn", `upstream stream error request_id=${t ?? "-"}: ${he(s)}`);
          let i = s instanceof Ho ? s.status ?? 500 : 500;
          o.enqueue(n.HS(`event: error
data: ${De({
            type: "error",
            ...(t && {
              request_id: t
            }),
            error: {
              type: hJc(i),
              message: fJc[i] ?? "upstream error"
            }
          })}

`));
          o.close();
        }
      },
      async cancel() {
        await r.return?.(undefined).catch(() => {});
      }
    });
  }
  function Q5f(e, t, n) {
    if (n !== "bedrock" || !t) {
      return {
        body: e,
        betaHeader: t || undefined
      };
    }
    let r = [];
    for (let s of t.split(",")) {
      let i = s.trim();
      if (!i) {
        continue;
      }
      let a = DCn(i);
      r.push(a ? a.header : i);
    }
    if (r.length === 0) {
      return {
        body: e,
        betaHeader: undefined
      };
    }
    let o = e.anthropic_beta;
    return {
      body: {
        ...e,
        anthropic_beta: Ro([...(Array.isArray(o) ? o : []), ...r])
      },
      betaHeader: undefined
    };
  }
  async function Z5f(e, t, n, r, o, s, i, a) {
    let l = Q5f(t, o, n);
    let c = l.body;
    let u = {
      ...s,
      ...(l.betaHeader && {
        "anthropic-beta": l.betaHeader
      })
    };
    let d = {
      signal: i,
      ...(Object.keys(u).length > 0 && {
        headers: u
      })
    };
    if (e === "/v1/messages/count_tokens" && n === "bedrock") {
      return A2e(501, "not_supported", "count_tokens is not supported on Bedrock upstreams", a);
    }
    try {
      switch (e) {
        case "/v1/messages":
          {
            if (c.stream) {
              let m = await r.messages.create({
                ...c,
                stream: true
              }, d);
              return new Response(X5f(m, a), {
                headers: V5f
              });
            }
            let p = await r.messages.create(c, d);
            return Response.json(p);
          }
        case "/v1/messages/count_tokens":
          {
            let p = await r.messages.countTokens(c, d);
            return Response.json(p);
          }
      }
    } catch (p) {
      if (p instanceof Ho) {
        let m = p.status ?? 500;
        vu("warn", `${n} upstream ${m} request_id=${a ?? "-"}: ${p.message}`);
        return A2e(m, hJc(m), fJc[m] ?? "upstream error", a);
      }
      throw p;
    }
  }
  function hJc(e) {
    return e !== undefined && e6f[e] || "api_error";
  }
  function Fss(e, t, n, r) {
    let o = new Map();
    for (let s of e) {
      o.set(s.id, {
        type: "model",
        id: s.id,
        display_name: s.label ?? s.id,
        ...(s.description && {
          description: s.description
        })
      });
    }
    if (n) {
      let s = ["opus46", "sonnet45", "haiku45"];
      let i = t6f.filter(a => !s.includes(a)).reverse();
      for (let a of [...s, ...i]) {
        let l = xa[a];
        if (o.vZc(l.firstParty)) {
          continue;
        }
        let c = false;
        for (let u of t) {
          if (u === "anthropic" || l[u] !== null) {
            c = true;
            break;
          }
        }
        if (c) {
          o.set(l.firstParty, {
            type: "model",
            id: l.firstParty,
            display_name: l.firstParty
          });
        }
      }
    }
    return r ? [...o.values()].filter(s => Nss(s.id, r)) : [...o.values()];
  }
  function gJc(e, t, n = true, r) {
    return Response.json({
      data: Fss(e, new Set(t.map(o => o.provider)), n, r),
      has_more: false,
      first_id: null,
      last_id: null
    });
  }
  var q5f;
  var G5f;
  var V5f;
  var z5f;
  var e6f;
  var fJc;
  var t6f;
  var Uss = __lazy(() => {
    CN();
    KN();
    Uc();
    dt();
    zN();
    Eo();
    Fh();
    Fee();
    Nkt();
    lJc();
    q5f = new Set(["content-type", "accept", "accept-encoding", "anthropic-beta", "anthropic-version", "user-agent"]);
    G5f = ["content-encoding", "content-length", "transfer-encoding", "connection", "cf-ray", "via", "request-id"];
    V5f = {
      "Content-Type": "text/event-stream",
      "Cache-Control": "no-cache",
      Connection: "keep-alive"
    };
    z5f = ["/v1/messages", "/v1/messages/count_tokens"];
    e6f = {
      400: "invalid_request_error",
      401: "authentication_error",
      403: "permission_error",
      404: "not_found_error",
      429: "rate_limit_error",
      529: "overloaded_error"
    };
    fJc = {
      400: "upstream rejected the request",
      401: "upstream authentication failed \u2014 check the gateway operator",
      403: "upstream denied the request \u2014 check the gateway operator",
      404: "upstream resource not found",
      429: "upstream rate limit exceeded",
      500: "upstream error",
      529: "upstream overloaded"
    };
    t6f = ["haiku45", "sonnet45", "sonnet46", "sonnet5", "opus41", "opus46", "opus47", "opus48", "fable5"];
  });
  function IR(e, t, n) {
    return Response.json({
      type: "error",
      error: {
        type: n6f[e],
        message: t
      },
      request_id: n
    }, {
      status: e
    });
  }
  function vin(e, t) {
    let n = Number(e.get("limit") ?? t);
    if (!Number.isInteger(n) || n < 1 || n > 1000) {
      return null;
    }
    return n;
  }
  var iQe;
  var n6f;
  var Bss = __lazy(() => {
    iQe = {
      "Cache-Control": "no-store"
    };
    n6f = {
      400: "invalid_request_error",
      401: "authentication_error",
      403: "permission_error",
      404: "not_found_error"
    };
  });
  function Cin(e = "monthly", t = new Date()) {
    if (e === "monthly") {
      return t.toISOString().slice(0, 7);
    }
    if (e === "daily") {
      return t.toISOString().slice(0, 10);
    }
    let n = new Date(Date.UTC(t.getUTCFullYear(), t.getUTCMonth(), t.getUTCDate()));
    let r = n.getUTCDay() || 7;
    n.setUTCDate(n.getUTCDate() + 4 - r);
    let o = n.getUTCFullYear();
    let s = Date.UTC(o, 0, 1);
    let i = Math.ceil(((n.getTime() - s) / 86400000 + 1) / 7);
    return `${o}-W${String(i).padStart(2, "0")}`;
  }
  var win;
  var $ss = __lazy(() => {
    win = ["daily", "weekly", "monthly"];
  });
  function $Sr(e, t) {
    if (e === "user") {
      return {
        type: "user",
        user_id: t ?? ""
      };
    }
    if (e === "rbac_group") {
      return {
        type: "rbac_group",
        rbac_group_id: t ?? ""
      };
    }
    return {
      type: "organization"
    };
  }
  async function yJc(e, t, n, r) {
    return (await e`
    WITH pb AS (${jss(e)})
    SELECT pb.period, c.amount AS cap_cents, c.scope_type
    FROM pb
    JOIN caps_by_period(${t}, ${e.array([...n], "TEXT")}, ${r}) c
      ON c.period = pb.period
    LEFT JOIN spend s ON s.principal = ${t} AND s.period = pb.bucket
    WHERE c.amount IS NOT NULL AND coalesce(s.cents, 0) >= c.amount
    ORDER BY pb.ord LIMIT 1
  `)[0];
  }
  async function _Jc(e, t, n) {
    let r = win.map(s => Cin(s));
    let o = () => e.begin(async s => {
      await s`SET LOCAL statement_timeout = '2s'`;
      await s`
        INSERT INTO spend (principal, period, cents)
        SELECT DISTINCT ${t}, b, ${n}
        FROM unnest(${e.array(r, "TEXT")}) AS t(b)
        ORDER BY 2
        ON CONFLICT (principal, period) DO UPDATE
          SET cents = spend.cents + EXCLUDED.cents, updated_at = now()
      `;
    });
    try {
      await o();
    } catch (s) {
      let i = s ?? {};
      if (i.errno === "57014" || i.code === "57014") {
        await o();
        return;
      }
      throw s;
    }
  }
  async function bJc(e, t) {
    if (!t.email && !t.name && !t.groups) {
      return;
    }
    let n = t.email || null;
    let r = t.name || null;
    let o = t.groups ?? null;
    await e.begin(async s => {
      await s`SET LOCAL statement_timeout = '2s'`;
      await s`
      INSERT INTO principal_emails ${e({
        principal: t.sub,
        email: n,
        name: r,
        groups: o
      })}
      ON CONFLICT (principal) DO UPDATE SET
        email = coalesce(${n}, principal_emails.email),
        name = coalesce(${r}, principal_emails.name),
        groups = coalesce(${o}, principal_emails.groups),
        updated_at = now()
    `;
    });
  }
  async function Hss(e, t) {
    await e`INSERT INTO admin_audit ${e({
      actor: t.actor,
      action: t.action,
      target: t.target,
      before: t.before ?? null,
      after: t.after ?? null,
      reason: t.reason ?? null
    })}`;
  }
  function jss(e, t = win) {
    let n = t.map(r => Cin(r));
    return e`
    SELECT period, bucket, ordinality AS ord
    FROM unnest(${e.array([...t], "TEXT")}, ${e.array(n, "TEXT")})
      WITH ORDINALITY AS t(period, bucket)
  `;
  }
  var HSr = __lazy(() => {
    $ss();
  });
  async function TJc({
    url: e,
    sql: t,
    requestId: n
  }, r) {
    let o = e.searchParams;
    let s = vin(o, 20);
    if (s === null) {
      return IR(400, "limit: must be between 1 and 1000", n);
    }
    let i = r6f(o);
    if (i === null) {
      return IR(400, "period[]: must be one of daily, weekly, monthly", n);
    }
    let a = o.getAll("user_ids[]");
    if (a.length > 100) {
      return IR(400, "user_ids[]: at most 100 entries per request", n);
    }
    let l = o.get("q");
    if (l !== null && l.length > 256) {
      return IR(400, "q: too long", n);
    }
    let c = o.get("sort");
    if (c !== null && c !== "spend_desc") {
      return IR(400, "sort: must be spend_desc", n);
    }
    let u = c === "spend_desc";
    if (u && i.length !== 1) {
      return IR(400, "sort=spend_desc requires exactly one period[]", n);
    }
    if (a.length > 0) {
      let g = await SJc(t, a, i, r);
      return Response.json({
        data: g,
        next_page: null
      }, {
        headers: iQe
      });
    }
    let d = o.get("page");
    let p;
    if (d !== null) {
      if (p = i6f(d, u), p === undefined) {
        return IR(400, "page: invalid page token", n);
      }
    }
    let m = l === null ? null : `%${c6f(l)}%`;
    let f = u ? await a6f(t, Cin(i[0]), p, m, s) : await l6f(t, p, m, s);
    let h = await SJc(t, f.subs, i, r);
    return Response.json({
      data: h,
      next_page: f.nextToken
    }, {
      headers: iQe
    });
  }
  function r6f(e) {
    let t = e.getAll("period[]");
    if (t.length === 0) {
      return win;
    }
    let n = [];
    for (let r of t) {
      if (r !== "daily" && r !== "weekly" && r !== "monthly") {
        return null;
      }
      if (!n.includes(r)) {
        n.push(r);
      }
    }
    return n;
  }
  function EJc(e) {
    return Buffer.from(JSON.stringify(e)).toString("base64url");
  }
  function i6f(e, t) {
    let n = t ? s6f() : o6f();
    try {
      return n.parse(JSON.parse(Buffer.from(e, "base64url").toString()));
    } catch {
      return;
    }
  }
  async function a6f(e, t, n, r, o) {
    let s = n?.p ?? null;
    let i = await e`
    SELECT s.principal, s.cents FROM spend s
    LEFT JOIN principal_emails e ON e.principal = s.principal
    WHERE s.period = ${t}
      AND (${s}::text IS NULL OR s.principal > ${s})
      AND (${r}::text IS NULL OR s.principal ILIKE ${r}
           OR e.email ILIKE ${r} OR e.name ILIKE ${r})
    ORDER BY s.principal LIMIT ${o + 1}
  `;
    let a = i.length > o;
    let l = i.slice(0, o);
    let c = l.at(-1);
    l.sort((u, d) => d.cents - u.cents || (u.principal < d.principal ? -1 : 1));
    return {
      subs: l.map(u => u.principal),
      nextToken: a && c !== undefined ? EJc({
        p: c.principal,
        s: true
      }) : null
    };
  }
  async function l6f(e, t, n, r) {
    let o = t?.p ?? null;
    let s = await e`
    SELECT s.principal FROM spend s
    LEFT JOIN principal_emails e ON e.principal = s.principal
    WHERE (${o}::text IS NULL OR s.principal > ${o})
      AND (${n}::text IS NULL OR s.principal ILIKE ${n}
           OR e.email ILIKE ${n} OR e.name ILIKE ${n})
    GROUP BY s.principal ORDER BY s.principal LIMIT ${r + 1}
  `;
    let i = s.map(c => c.principal).slice(0, r);
    let a = s.length > r;
    let l = i.at(-1);
    return {
      subs: i,
      nextToken: a && l !== undefined ? EJc({
        p: l
      }) : null
    };
  }
  function c6f(e) {
    return e.replace(/[\\%_]/g, t => `\\${t}`);
  }
  async function SJc(e, t, n, r) {
    if (t.length === 0) {
      return [];
    }
    return (await e`
    WITH p AS (
      SELECT principal, ordinality AS ord
      FROM unnest(${e.array(t, "TEXT")}) WITH ORDINALITY AS t(principal)
    ),
    per AS (${jss(e, n)})
    SELECT p.principal, per.period, cap.amount, cap.scope_type,
           cap.scope_id, cap.id AS spend_limit_id,
           coalesce(s.cents, 0) AS cents,
           e.email, e.name, e.groups
    FROM p
    CROSS JOIN per
    LEFT JOIN principal_emails e ON e.principal = p.principal
    LEFT JOIN LATERAL caps_by_period(
      p.principal,
      ARRAY(SELECT jsonb_array_elements_text(coalesce(e.groups, '[]'::jsonb))),
      ${r}
    ) cap ON cap.period = per.period
    LEFT JOIN spend s ON s.principal = p.principal AND s.period = per.bucket
    ORDER BY p.ord, per.ord
  `).map(s => u6f(s));
  }
  function u6f(e) {
    let t = e.scope_type === null ? null : $Sr(e.scope_type, e.scope_id);
    return {
      scope: {
        type: "user",
        user_id: e.principal
      },
      groups: e.groups ?? [],
      actor: {
        type: "user_actor",
        user_id: e.principal,
        name: e.name ?? null,
        email_address: e.email ?? null,
        deleted: false
      },
      amount: e.amount,
      currency: "USD",
      period: e.period,
      source: t,
      spend_limit_id: e.spend_limit_id,
      period_to_date_spend: e.cents.toFixed(3).replace(/\.?0+$/, "")
    };
  }
  var o6f;
  var s6f;
  var vJc = __lazy(() => {
    qg();
    Bss();
    $ss();
    HSr();
    o6f = we(() => Ke.object({
      p: Ke.string(),
      s: Ke.undefined()
    }));
    s6f = we(() => Ke.object({
      p: Ke.string(),
      s: Ke.literal(true)
    }));
  });
  function qss(e) {
    return e === "/v1/organizations/spend_limits" || e.startsWith(`${"/v1/organizations/spend_limits"}/`);
  }
  async function RJc(e, t, n, r, o, s, i = "min") {
    if (!qss(t.pathname)) {
      return null;
    }
    let a = `req_${crypto.randomUUID().replace(/-/g, "")}`;
    let l = await d6f({
      req: e,
      url: t,
      sql: n,
      keys: r,
      requestId: a,
      oidcAdmin: o,
      clientIp: s,
      groupLimitMode: i
    });
    l.headers.set("request-id", a);
    vu("info", `admin ${e.method} ${t.pathname} -> ${l.status} (${a})`);
    return l;
  }
  async function d6f({
    req: e,
    url: t,
    sql: n,
    keys: r,
    requestId: o,
    oidcAdmin: s,
    clientIp: i,
    groupLimitMode: a
  }) {
    let l = t.pathname;
    let c = e.method;
    let u = e.headers.get("x-api-key");
    let d = p6f(u, r, s);
    if (!d) {
      Qhe("admin.denied", {
        reason: u ? "invalid_key" : e.headers.get("authorization") ? "bearer_rejected" : "no_credentials",
        method: c,
        path: l,
        client_ip: i ?? null
      });
      return IR(401, "missing or invalid admin credentials", o);
    }
    let p = {
      req: e,
      url: t,
      sql: n,
      requestId: o,
      auth: d
    };
    if (l === `${"/v1/organizations/spend_limits"}/effective` && c === "GET") {
      return TJc(p, a);
    }
    if (l === `${"/v1/organizations/spend_limits"}/audit` && c === "GET") {
      return m6f(p);
    }
    if (l === "/v1/organizations/spend_limits" && c === "GET") {
      return f6f(p);
    }
    if (l === "/v1/organizations/spend_limits" && c === "POST") {
      return h6f(p);
    }
    if (l.startsWith(`${"/v1/organizations/spend_limits"}/`)) {
      let m;
      try {
        m = decodeURIComponent(l.slice(("/v1/organizations/spend_limits").length + 1));
      } catch {
        return IR(400, "malformed spend limit id", o);
      }
      if (c === "GET") {
        return g6f(p, m);
      }
      if (c === "DELETE") {
        return y6f(p, m);
      }
      return IR(404, "not found", o);
    }
    return IR(404, "not found", o);
  }
  function p6f(e, t, n) {
    if (!e) {
      return n ? {
        canWrite: true,
        actor: `oidc:${n.sub}`
      } : null;
    }
    let r = wJc(e, t.writeKeys);
    let o = wJc(e, t.readKeys);
    if (r !== undefined) {
      return {
        canWrite: true,
        actor: `admin-key:${r}`
      };
    }
    if (o !== undefined) {
      return {
        canWrite: false,
        actor: `admin-key:${o}`
      };
    }
    return null;
  }
  function wJc(e, t) {
    let n = Buffer.from(e);
    let r;
    for (let o of t) {
      let s = Buffer.from(o.key);
      if (s.length === n.length && CJc.timingSafeEqual(n, s)) {
        r = o.id;
      }
    }
    return r;
  }
  async function m6f({
    url: e,
    sql: t,
    requestId: n
  }) {
    let r = vin(e.searchParams, 100);
    if (r === null) {
      return IR(400, "limit: must be between 1 and 1000", n);
    }
    let o = e.searchParams.get("after_id");
    if (o !== null && !/^\d{1,18}$/.test(o)) {
      return IR(400, "after_id: must be an audit event id", n);
    }
    let s = await t`
    SELECT id, at, actor, action, target, before, after, reason
    FROM admin_audit
    WHERE (${o}::bigint IS NULL OR id < ${o}::bigint)
    ORDER BY id DESC LIMIT ${r + 1}
  `;
    let i = s.length > r;
    return Response.json({
      data: s.slice(0, r).map(a => ({
        type: "audit_event",
        id: a.id,
        created_at: a.at.toISOString(),
        actor: a.actor,
        action: a.action,
        target_id: a.target,
        before: a.before ?? null,
        after: a.after ?? null,
        reason: a.reason ?? null
      })),
      has_more: i
    }, {
      headers: iQe
    });
  }
  async function f6f({
    url: e,
    sql: t,
    requestId: n
  }) {
    let r = e.searchParams;
    let o = vin(r, 20);
    if (o === null) {
      return IR(400, "limit: must be between 1 and 1000", n);
    }
    let s = r.get("scope_type");
    if (s !== null && s !== "organization" && s !== "rbac_group" && s !== "user") {
      return IR(400, "scope_type: must be one of organization, rbac_group, user", n);
    }
    let i = r.get("after_id");
    let a = r.get("before_id");
    if (i !== null && a !== null) {
      return IR(400, "after_id and before_id are mutually exclusive", n);
    }
    let l = i ?? a;
    let c;
    if (l !== null) {
      if (c = (await t`SELECT created_at::text AS created_at, id FROM spend_limits WHERE id = ${l}`)[0], !c) {
        return IR(400, `${i !== null ? "after_id" : "before_id"}: no spend limit with this id`, n);
      }
    }
    let u = o + 1;
    let d;
    let p;
    if (a !== null && c) {
      let f = await t`
      SELECT * FROM spend_limits
      WHERE (created_at, id) < (${c.created_at}::timestamptz, ${c.id})
        AND (${s}::text IS NULL OR scope_type = ${s})
      ORDER BY created_at DESC, id DESC LIMIT ${u}
    `;
      d = f.length > o;
      p = f.slice(0, o).reverse().map(Lkt);
    } else {
      let f = c?.created_at ?? null;
      let h = await t`
      SELECT * FROM spend_limits
      WHERE (${f}::timestamptz IS NULL
             OR (created_at, id) > (${f}::timestamptz, ${c?.id ?? null}))
        AND (${s}::text IS NULL OR scope_type = ${s})
      ORDER BY created_at, id LIMIT ${u}
    `;
      d = h.length > o;
      p = h.slice(0, o).map(Lkt);
    }
    let m = p.map(Wss);
    return Response.json({
      data: m,
      has_more: d,
      first_id: m[0]?.id ?? null,
      last_id: m.at(-1)?.id ?? null
    }, {
      headers: iQe
    });
  }
  async function h6f({
    req: e,
    sql: t,
    requestId: n,
    auth: r
  }) {
    if (!r.canWrite) {
      return IR(403, "requires write:spend_limits", n);
    }
    let o = await S6f(e, n);
    if (o instanceof Response) {
      return o;
    }
    let {
      scope: s,
      amount: i,
      period: a
    } = o;
    let l = T6f(s);
    let c = `spend_limits:${s.type}:${l}:${a}`;
    let u = {
      id: `spl_${crypto.randomUUID().replace(/-/g, "")}`,
      scope_type: s.type,
      scope_id: l,
      amount: i,
      period: a,
      created_by: r.actor
    };
    let {
      before: d,
      after: p
    } = await t.begin(async m => {
      await m`SELECT pg_advisory_xact_lock(hashtext(${c}))`;
      let [f] = await m`
      SELECT * FROM spend_limits
      WHERE scope_type = ${s.type} AND scope_id = ${l} AND period = ${a}
    `;
      let [h] = await m`
      INSERT INTO spend_limits ${m(u)}
      ON CONFLICT (scope_type, scope_id, period) DO UPDATE
        SET amount = ${i}, updated_at = now()
      RETURNING *
    `;
      let g = Lkt(h);
      await Hss(m, {
        actor: r.actor,
        action: "spend_limit.upsert",
        target: g.id,
        before: f ? Lkt(f) : null,
        after: g
      });
      return {
        before: f,
        after: g
      };
    });
    Qhe("admin.limit.upsert", {
      actor: r.actor,
      target: p.id,
      scope_type: s.type,
      scope_id: l,
      period: a,
      ...(d !== undefined && {
        before_amount: d.amount
      }),
      amount: i
    });
    return Response.json(Wss(p));
  }
  async function g6f({
    sql: e,
    requestId: t
  }, n) {
    let o = (await e`
    SELECT id, scope_type, scope_id, amount, period, currency, created_at, updated_at FROM spend_limits WHERE id = ${n}
  `)[0];
    return o ? Response.json(Wss(Lkt(o)), {
      headers: iQe
    }) : IR(404, "spend limit not found", t);
  }
  async function y6f({
    sql: e,
    requestId: t,
    auth: n
  }, r) {
    if (!n.canWrite) {
      return IR(403, "requires write:spend_limits", t);
    }
    let o = await e.begin(async s => {
      let a = (await s`
      DELETE FROM spend_limits WHERE id = ${r} RETURNING id, scope_type, scope_id, amount, period, currency, created_at, updated_at
    `)[0];
      if (!a) {
        return false;
      }
      await Hss(s, {
        actor: n.actor,
        action: "spend_limit.delete",
        target: r,
        before: Lkt(a)
      });
      return a;
    });
    if (o) {
      Qhe("admin.limit.delete", {
        actor: n.actor,
        target: r,
        scope_type: o.scope_type,
        scope_id: o.scope_id,
        period: o.period
      });
      return Response.json({
        type: "spend_limit_deleted",
        id: r
      });
    }
    return IR(404, "spend limit not found", t);
  }
  function b6f(e) {
    let t = e.issues[0];
    if (!t) {
      return "invalid request body";
    }
    let n = t.path.join(".");
    return n ? `${n}: ${t.message}` : t.message;
  }
  async function S6f(e, t) {
    let n;
    try {
      n = await e.json();
    } catch {
      return IR(400, "invalid JSON body", t);
    }
    let r = _6f().safeParse(n);
    return r.success ? r.data : IR(400, b6f(r.error), t);
  }
  function T6f(e) {
    switch (e.type) {
      case "user":
        return e.user_id;
      case "rbac_group":
        return e.rbac_group_id;
      case "organization":
        return "";
    }
  }
  function Lkt(e) {
    return {
      id: e.id,
      scope: $Sr(e.scope_type, e.scope_id),
      amount: e.amount,
      period: e.period,
      currency: e.currency,
      created_at: e.created_at.toISOString(),
      updated_at: e.updated_at.toISOString()
    };
  }
  function Wss(e) {
    return {
      type: "spend_limit",
      id: e.id,
      created_at: e.created_at,
      updated_at: e.updated_at,
      scope: e.scope,
      amount: e.amount,
      currency: e.currency,
      period: e.period
    };
  }
  var CJc;
  var _6f;
  var xJc = __lazy(() => {
    qg();
    Fee();
    Bss();
    HSr();
    vJc();
    CJc = require("crypto");
    _6f = we(() => Ke.object({
      scope: Ke.discriminatedUnion("type", [Ke.object({
        type: Ke.literal("user"),
        user_id: Ke.string().min(1)
      }), Ke.object({
        type: Ke.literal("rbac_group"),
        rbac_group_id: Ke.string().min(1)
      }), Ke.object({
        type: Ke.literal("organization")
      })]),
      amount: Ke.string().regex(/^\d{1,18}$/, "must be a whole-number decimal string of cents").nullable(),
      period: Ke.enum(["daily", "weekly", "monthly"]).default("monthly"),
      currency: Ke.literal("USD").optional()
    }));
  });
  function kJc(e, t) {
    let n = E6f(t);
    let r = Rin(e ?? "") ? pWr(e ?? "", n) : Kle;
    return dWr(r, n) * 100;
  }
  function Rin(e) {
    let t = getCanonicalName(e);
    if (vqe[t] !== undefined) {
      return true;
    }
    let n = getGlobalConfig().additionalModelCostsCache;
    return n?.[e] !== undefined || n?.[t] !== undefined;
  }
  function E6f(e) {
    return {
      input_tokens: e.input_tokens,
      output_tokens: e.output_tokens,
      cache_creation_input_tokens: e.cache_creation_input_tokens ?? 0,
      cache_read_input_tokens: e.cache_read_input_tokens ?? 0,
      cache_creation: null,
      server_tool_use: {
        web_search_requests: e.server_tool_use?.web_search_requests ?? 0,
        web_fetch_requests: 0
      },
      service_tier: null,
      inference_geo: null,
      iterations: null,
      speed: e.speed === "fast" ? "fast" : null
    };
  }
  var Gss = __lazy(() => {
    Eo();
  });
  function OJc(e, t, n, r = null, o) {
    if (!e.body || e.status >= 400) {
      return e;
    }
    let s = (e.headers.get("content-type") ?? "").includes("text/event-stream");
    let i = e.body.getReader();
    let a = v6f(s, r, o);
    let l = false;
    async function c() {
      if (l) {
        return;
      }
      l = true;
      try {
        let d = await a.usage();
        if (d) {
          n(t(d));
        }
      } catch (d) {
        vu("warn", `usage metering failed: ${he(d)}`);
      }
    }
    let u = new ReadableStream({
      async pull(d) {
        try {
          let p = await i.read();
          if (p.done) {
            c();
            d.close();
            return;
          }
          a.push(p.value);
          d.enqueue(p.value);
        } catch (p) {
          c();
          d.error(p);
        }
      },
      async cancel(d) {
        c();
        await i.cancel(d);
      }
    });
    return new Response(u, {
      status: e.status,
      statusText: e.statusText,
      headers: e.headers
    });
  }
  function v6f(e, t, n) {
    let r = new TextDecoder();
    if (e) {
      let a = "";
      let l = R6f();
      return {
        push(c) {
          a += r.oC(c, {
            stream: true
          });
          let u = a.split(w6f);
          a = u.pop() ?? "";
          for (let d of u) {
            IJc(l, d);
          }
          if (a.length > 8388608) {
            a = "";
          }
        },
        async usage() {
          if (a !== "") {
            IJc(l, a);
            a = "";
          }
          return x6f(l);
        }
      };
    }
    let o = "";
    let s = 0;
    let i = false;
    return {
      push(a) {
        let l = r.oC(a, {
          stream: true
        });
        if (s += l.length, i) {
          return;
        }
        if (o += l, o.length > 8388608) {
          i = true;
          o = "";
        }
      },
      async usage() {
        let a = i ? null : k6f(o);
        if (a) {
          return a;
        }
        if (s === 0) {
          return null;
        }
        return {
          input_tokens: (await t?.().catch(() => null)) ?? 0,
          output_tokens: Math.ceil(s / 4),
          speed: n
        };
      }
    };
  }
  function R6f() {
    return {
      usage: {
        input_tokens: 0,
        output_tokens: 0
      },
      seen: false,
      estOutputChars: 0,
      sawOutputTokens: false
    };
  }
  function IJc(e, t) {
    let n = Vss(t, "event:");
    let r = n ? t.slice(n[0], n[1]).trim() : null;
    if (r === "content_block_delta") {
      PJc(e, t);
      return;
    }
    if (r !== null && r !== "message_start" && r !== "message_delta") {
      return;
    }
    if (r === null) {
      if (!t.includes('"usage"')) {
        if (t.includes('"content_block_delta"')) {
          PJc(e, t);
        }
        return;
      }
    }
    let o = Vss(t, "data:");
    if (!o) {
      return;
    }
    let s;
    try {
      s = JSON.parse(t.slice(o[0], o[1]).trim());
    } catch {
      return;
    }
    let i = A6f().safeParse(s);
    if (!i.success) {
      return;
    }
    if (i.data.type === "message_start" && i.data.message?.usage) {
      MJc(e.usage, i.data.message.usage);
      e.seen = true;
      return;
    }
    if (i.data.type === "content_block_delta" && i.data.delta) {
      let a = i.data.delta;
      e.estOutputChars += (a.text?.length ?? 0) + (a.partial_json?.length ?? 0) + (a.thinking?.length ?? 0);
      return;
    }
    if (i.data.type === "message_delta" && i.data.usage) {
      if (i.data.usage.output_tokens !== undefined) {
        e.usage.output_tokens = i.data.usage.output_tokens;
        e.sawOutputTokens = true;
      }
      if (i.data.usage.server_tool_use !== undefined) {
        e.usage.server_tool_use = i.data.usage.server_tool_use;
      }
      e.seen = true;
    }
  }
  function PJc(e, t) {
    let n = Vss(t, "data:");
    if (n) {
      e.estOutputChars += Math.max(0, n[1] - n[0] - 80);
    }
  }
  function Vss(e, t) {
    let n = 0;
    while (true) {
      if (e.startsWith(t, n)) {
        let o = n + t.length;
        if (e.charCodeAt(o) === 32) {
          o += 1;
        }
        let s = e.indexOf(`
`, o);
        return [o, s === -1 ? e.length : s];
      }
      let r = e.indexOf(`
`, n);
      if (r === -1) {
        return null;
      }
      n = r + 1;
    }
  }
  function x6f(e) {
    if (!e.sawOutputTokens && e.estOutputChars > 0) {
      e.usage.output_tokens = Math.ceil(e.estOutputChars / 4);
      e.seen = true;
    }
    return e.seen ? e.usage : null;
  }
  function k6f(e) {
    let t;
    try {
      t = JSON.parse(e);
    } catch {
      return null;
    }
    let n = I6f().safeParse(t);
    if (!n.success || !n.data.usage) {
      return null;
    }
    let r = {
      input_tokens: 0,
      output_tokens: 0
    };
    if (MJc(r, n.data.usage), r.output_tokens = n.data.usage.output_tokens ?? 0, n.data.usage.server_tool_use !== undefined) {
      r.server_tool_use = n.data.usage.server_tool_use;
    }
    return r;
  }
  function MJc(e, t) {
    if (e.input_tokens = t.input_tokens ?? e.input_tokens, e.cache_read_input_tokens = t.cache_read_input_tokens, e.cache_creation_input_tokens = t.cache_creation_input_tokens, t.server_tool_use !== undefined) {
      e.server_tool_use = t.server_tool_use;
    }
    if (t.speed !== undefined) {
      e.speed = t.speed;
    }
  }
  var w6f;
  var zss;
  var A6f;
  var I6f;
  var NJc = __lazy(() => {
    qg();
    dt();
    Fee();
    w6f = /\r?\n\r?\n/;
    zss = we(() => Ke.object({
      input_tokens: Ke.number().optional(),
      output_tokens: Ke.number().optional(),
      cache_read_input_tokens: Ke.number().optional(),
      cache_creation_input_tokens: Ke.number().optional(),
      speed: Ke.string().nullable().optional(),
      server_tool_use: Ke.object({
        web_search_requests: Ke.number().optional()
      }).passthrough().optional()
    }).passthrough());
    A6f = we(() => Ke.object({
      type: Ke.string().optional(),
      usage: zss().optional(),
      message: Ke.object({
        usage: zss().optional()
      }).passthrough().optional(),
      delta: Ke.object({
        text: Ke.string().optional(),
        partial_json: Ke.string().optional(),
        thinking: Ke.string().optional()
      }).passthrough().optional()
    }).passthrough());
    I6f = we(() => Ke.object({
      usage: zss().optional()
    }).passthrough());
  });
  function LJc(e, t) {
    if (!t.admin) {
      return null;
    }
    let n = t.admin;
    let r = new Set();
    let o = new Map();
    let s = 900000;
    async function i(d, p) {
      l(d);
      let m;
      try {
        m = await withTimeout(e.begin(async f => (await f`SET LOCAL statement_timeout = '2s'`, yJc(f, d.sub, d.groups ?? [], n.group_limit_mode))), 2000 + 500, "spend precheck timed out");
      } catch (f) {
        vu("warn", `spend check failed: ${he(f)}`);
        return t.enforcement.fail_closed_on_error ? a(d.sub, p, "store_error") : null;
      }
      if (!m) {
        return null;
      }
      return a(d.sub, p, "over_limit", {
        cap_cents: m.cap_cents,
        source: m.scope_type,
        period: m.period
      });
    }
    function a(d, p, m, f) {
      Qhe("spend.blocked", {
        request_id: p,
        sub: d,
        cause: m,
        ...f
      });
      let h = m === "store_error" ? "spend limit unavailable" : "spend limit reached";
      return Response.json({
        type: "error",
        error: {
          type: "billing_error",
          message: n.blocked_message ? `${h} \u2014 ${n.blocked_message}` : h
        }
      }, {
        status: 429,
        headers: {
          "x-should-retry": "false"
        }
      });
    }
    function l(d) {
      let p = `${d.sub}\x00${d.email ?? ""}\x00${d.name ?? ""}\x00${(d.groups ?? []).join(",")}`;
      let m = o.get(p) ?? 0;
      if (Date.now() - m >= s) {
        if (o.size >= 1e4) {
          o.clear();
        }
        o.set(p, Date.now());
        bJc(e, d).catch(f => vu("warn", `identity record failed: ${he(f)}`));
      }
    }
    function c(d, p, m, f, h) {
      if (d.status < 400 && m !== null) {
        u(m);
      }
      return OJc(d, g => kJc(m, g), g => {
        _Jc(e, p.sub, g).catch(y => vu("warn", `spend record failed: ${he(y)}`));
      }, f, h);
    }
    function u(d) {
      if (Rin(d) || r.vZc(d) || r.size >= 1000) {
        return;
      }
      r.add(d);
      vu("warn", `spend meter has no exact rates for model '${d}' \u2014 metering at the unknown-model default tier`);
    }
    return {
      precheck: i,
      meter: c
    };
  }
  function Kss(e, t) {
    return t !== undefined && t.admin_groups.length > 0 && (e ?? []).some(n => t.admin_groups.includes(n));
  }
  var FJc = __lazy(() => {
    dt();
    Fee();
    Gss();
    HSr();
    NJc();
  });
  function UJc(e, t, n, r) {
    let o = t?.payload.settings ?? {};
    let s = e.telemetry.forward_to.length > 0 && e.listen.public_url;
    return {
      inferenceProvider: "gateway",
      inferenceGatewayBaseUrl: r,
      inferenceGatewayAuthScheme: "sso",
      ...(s && {
        otlpEndpoint: r,
        otlpProtocol: "http/json",
        otlpResourceAttributes: {
          "enduser.id": n.email ?? n.sub
        }
      }),
      ...O6f(e, t?.availableModels),
      ...D6f(o),
      ...M6f(o),
      ...t?.desktop,
      expiresAt: Math.floor(Date.now() / 1000) + e.session.ttl_hours * 3600
    };
  }
  function O6f(e, t) {
    let n = Fss(e.models, new Set(e.upstreams.map(r => r.provider)), e.auto_include_builtin_models, t).map(r => ({
      name: r.id,
      ...(r.display_name !== r.id && {
        labelOverride: r.display_name
      })
    }));
    return n.length > 0 ? {
      inferenceModels: n
    } : {};
  }
  function D6f(e) {
    let t = BJc(e, ["permissions", "deny"]);
    if (!t) {
      return {};
    }
    let n = t.filter(r => !r.includes("(") && !r.startsWith("mcp__"));
    return n.length > 0 ? {
      disabledBuiltinTools: n
    } : {};
  }
  function M6f(e) {
    let t = BJc(e, ["sandbox", "network", "allowedDomains"]);
    return t ? {
      coworkEgressAllowedHosts: t
    } : {};
  }
  function BJc(e, t) {
    let n = e;
    for (let r of t) {
      if (n === null || typeof n !== "object") {
        return;
      }
      n = n[r];
    }
    return Array.isArray(n) && n.every(r => typeof r === "string") ? n : undefined;
  }
  var $Jc = __lazy(() => {
    Uss();
  });
  function Yss(e) {
    return String(e).replace(/(\b\w+:\/\/)[^@/]+@/g, "$1");
  }
  async function HJc(e, t, n, r, o) {
    if (o.length === 0) {
      return;
    }
    if (jSr >= 128) {
      if (L6f++ % 100 === 0) {
        vu("warn", `otel fanout saturated (${jSr} in flight); dropping`);
      }
      return;
    }
    jSr++;
    try {
      let s = Date.now();
      let i = o.map(l => (qSr.get(l.url)?.openUntil ?? 0) > s);
      (await Promise.allSettled(o.map((l, c) => {
        if (i[c]) {
          return Promise.reject(Error("circuit open"));
        }
        return Mkt(`${l.url.replace(/\/$/, "")}${e}`, {
          method: "POST",
          body: t,
          headers: {
            "Content-Type": n,
            ...(r && {
              "Content-Encoding": r
            }),
            ...l.headers
          },
          signal: AbortSignal.timeout(1e4)
        }).then(u => {
          if (u.body?.cancel().catch(() => {}), !u.ok) {
            throw Error(`${u.status} ${u.statusText}`);
          }
        });
      }))).forEach((l, c) => {
        if (i[c]) {
          return;
        }
        let u = o[c].url;
        if (l.status === "fulfilled") {
          qSr.delete(u);
        } else {
          let d = qSr.get(u) ?? {
            fails: 0,
            openUntil: 0
          };
          if (++d.fails >= 5) {
            d.openUntil = Date.now() + 30000;
            vu("warn", `otel dest ${Yss(u)} tripped; skipping 30s`);
          } else {
            vu("warn", `otel forward to ${Yss(u)} failed: ${Yss(l.reason)}`);
          }
          qSr.set(u, d);
        }
      });
    } finally {
      jSr--;
    }
  }
  var Jss;
  var jSr = 0;
  var L6f = 0;
  var qSr;
  var jJc = __lazy(() => {
    Fee();
    Nkt();
    Jss = {
      "/v1/metrics": "metrics",
      "/v1/logs": "logs",
      "/v1/traces": "traces"
    };
    qSr = new Map();
  });
  var qJc = `# Claude Code gateway protocol

This is the wire contract the Claude Code CLI uses to talk to this gateway:
sign-in, inference, managed settings, and telemetry. It's served from the
gateway itself so it always matches the version you're running.

> **Stability:** this protocol exists to give you a more stable target than
> proxying raw CLI traffic. Auth is standard OAuth 2.0, inference is the
> Messages API, and headers are the lowest common denominator across
> backends. We keep it backwards compatible within reason to support older
> clients, but not forever \u2014 expect changes, managed settings in particular,
> with notice.

A developer points Claude Code at your gateway's base URL via \`/login\` and
the client does the rest. All paths below are relative to that base URL, and
the client does not follow cross-origin redirects.

## Flow

1. Client fetches \`GET {base}/.well-known/oauth-authorization-server\`.
2. On first contact, client fingerprints your TLS certificate and asks the
   user to trust it.
3. Client runs the RFC 8628 device flow: \`POST device_authorization_endpoint\`
   -> user approves in a browser at \`verification_uri\` -> client polls
   \`token_endpoint\` until it gets a bearer token.
4. Client sends \`Authorization: Bearer <token>\` on every subsequent request.
5. Client uses fixed paths under \`{base}\` for inference (\`/v1/messages\`),
   policy (\`/managed/settings\`), model discovery (\`/v1/models\`), and
   telemetry (\`/v1/{metrics,logs,traces}\`).
6. Before the token expires, client silently calls \`token_endpoint\` with
   \`grant_type=refresh_token\`. If you didn't issue a refresh token, the user
   is sent back through the browser flow instead.

## Discovery \u2014 required

\`GET /.well-known/oauth-authorization-server\` (unauthenticated)

RFC 8414 authorization server metadata. The client reads
\`device_authorization_endpoint\` and \`token_endpoint\` and ignores the rest;
both must be same-origin with \`{base}\`. \`authorization_endpoint\` is
intentionally absent.

    {
      "issuer": "https://gw.corp.example.com",
      "device_authorization_endpoint": "https://gw.corp.example.com/oauth/device_authorization",
      "token_endpoint": "https://gw.corp.example.com/oauth/token",
      "grant_types_supported": ["urn:ietf:params:oauth:grant-type:device_code", "refresh_token"]
    }

## Device authorization \u2014 required

\`POST {device_authorization_endpoint}\` (unauthenticated)

RFC 8628 \xA73.2. The client opens \`verification_uri_complete\` in the user's
browser and polls \`token_endpoint\` every \`interval\` seconds.

    {
      "device_code": "AbK9-s3n4C8H...",
      "user_code": "WDJB-MJHT",
      "verification_uri": "https://gw.corp.example.com/device",
      "verification_uri_complete": "https://gw.corp.example.com/device?user_code=WDJB-MJHT",
      "expires_in": 600,
      "interval": 5
    }

\`device_code\` should be >=256 bits, opaque, single-use. \`user_code\` should
use a base-20 charset (RFC 8628 \xA76.1).

## Verification page \u2014 required

\`GET/POST {verification_uri}\` (browser-facing; the client never calls this)

Accept the user code, authenticate the user against your IdP, and mark the
matching \`device_code\` approved so the next token poll succeeds. Apply a
per-IP rate limit (RFC 8628 \xA75.1) and don't auto-submit a pre-filled code
(\xA75.4).

## Token \u2014 required

\`POST {token_endpoint}\` (unauthenticated,
\`application/x-www-form-urlencoded\`)

**Device grant** (\`grant_type=urn:ietf:params:oauth:grant-type:device_code\`):

| Status | Body | Client reaction |
|---|---|---|
| 200 | \`{"access_token","token_type":"Bearer","expires_in","refresh_token"?}\` | Login complete. \`refresh_token\` is optional; omit it and the client re-runs the device flow on expiry. |
| 400 | \`{"error":"authorization_pending"}\` | Keep polling. |
| 400/429 | \`{"error":"slow_down"}\` | Add 5s to the poll interval. |
| 400 | \`{"error":"access_denied"}\` | Stop. |
| 400 | \`{"error":"expired_token"}\` | Stop. |

**Refresh grant** (\`grant_type=refresh_token\`): return a fresh
\`{"access_token","token_type","expires_in","refresh_token"}\` on 200. Return
\`401 {"error":"invalid_grant"}\` to force re-login \u2014 this is your
deprovisioning hook.

## Messages \u2014 required

\`POST /v1/messages\` and \`POST /v1/messages/count_tokens\` (bearer)

The Anthropic Messages API (https://docs.claude.com/en/api/messages),
unchanged. Proxy to your upstream and stream the response back. Enforce your
model allowlist here, returning \`400 invalid_request_error\` for a denied
model. Don't buffer SSE on the \`stream: true\` path. The client always sets
\`Content-Length\`, so you may reject chunked-without-CL (\`411\`) and cap body
size (\`413\`). The client doesn't assume server-side tools are available. The
client also sends \`x-app\` and \`x-stainless-*\` headers \u2014 pass them through or
drop them, but don't reject the request because of them.

## Managed settings \u2014 optional

\`GET /managed/settings\` (bearer)

The authenticated user's Claude Code \`managed-settings.json\`; see
https://code.claude.com/docs/en/settings for the key reference. The client
polls about once an hour; support \`ETag\`/\`If-None-Match\` -> \`304\` to keep
that cheap. Return \`404\` for "no managed policy"; \`200 {}\` means "this user
has an empty policy" \u2014 they're not the same. **This is the endpoint most
likely to change.**

## Models \u2014 optional

\`GET /v1/models\` (bearer)

Anthropic models-list shape: \`{"data":[{"id","display_name"},...]}\`. Use
Anthropic-style IDs (\`claude-{family}-{major}-{minor}\`) \u2014 the client's
model-family logic keys on that shape. The client only calls this when
\`CLAUDE_CODE_ENABLE_GATEWAY_MODEL_DISCOVERY\` is set on the client, which you
can push via the \`env\` block in \`/managed/settings\`. Return \`404\` to fall
back to the client's built-in list.

## Telemetry \u2014 optional

\`POST /v1/metrics\`, \`/v1/logs\`, \`/v1/traces\` (bearer)

OTLP/HTTP (protobuf or JSON). When connected to a gateway the client sends
telemetry here and ignores \`OTEL_EXPORTER_OTLP_*\` env vars. Return \`200\`
whether you forward or discard \u2014 \`404\` makes the client's exporter log an
error on every flush.

## Errors

OAuth endpoints use \`{"error":"...","error_description":"..."}\`
(RFC 6749/8628). Bearer-authenticated endpoints use the Anthropic envelope so
the SDK surfaces the message to the user:

    {"type":"error","error":{"type":"authentication_error","message":"..."}}

| HTTP | error.type | Use for |
|---|---|---|
| 400 | \`invalid_request_error\` | Denied model, malformed body, policy violation |
| 401 | \`authentication_error\` | Missing/expired/invalid bearer; client prompts re-login |
| 403 | \`permission_error\` | Authenticated but not allowed |
| 413 | \`request_too_large\` | Body over your cap |
| 429 | \`rate_limit_error\` | Throttling; include \`Retry-After\` |
| 501 | \`not_supported\` | Endpoint not available on this backend |
| 529 | \`overloaded_error\` | Upstream at capacity; client backs off and retries |
| 5xx | \`api_error\` | Anything else |

## Bearer token

Your \`access_token\` is opaque to the client \u2014 it stores it, sends it, and
refreshes it before \`expires_in\`, but never inspects the payload. Encode the
user's identity and groups in the token (or in server-side state keyed by it)
so you can apply per-user RBAC at \`/v1/messages\` and per-group policy at
\`/managed/settings\`. The same token must work across every
bearer-authenticated endpoint.

## TLS

\`https://\` is required; \`http://\` is accepted only for loopback during
development. The client pins the SHA-256 fingerprint of your TLS leaf
certificate per-hostname after the user confirms it on first connect, and
re-prompts on mismatch \u2014 rotating your certificate costs every user one
confirmation prompt.

## Client guarantees

- OAuth endpoint paths come from your discovery document; the client never
  hard-codes \`/oauth/token\`.
- Fixed-path endpoints are resolved against \`{base}\`, never a redirect.
- Every request body carries \`Content-Length\`.
- The OTLP exporter is locked to \`{base}/v1/{signal}\` regardless of the
  user's environment.
- \`404\` from \`/v1/models\` or \`/managed/settings\` is a clean "not
  implemented", with no retry storm.

## Proxying to Bedrock, Vertex, or Foundry

Proxying to \`api.anthropic.com\` is pass-through. Proxying to a cloud
provider's Claude endpoint needs translation:

- **Model IDs.** The client sends Anthropic-style IDs like
  \`claude-sonnet-4-5\`; translate to the upstream's form (Bedrock model ID or
  inference-profile ARN; Vertex \`@\`-versioned ID), or advertise
  upstream-native IDs from \`/v1/models\`.
- **\`anthropic-beta\`.** Bedrock rejects some betas in the *header*; move them
  into the request body as \`"anthropic_beta": [...]\`. Vertex and Foundry
  accept the header.
- **Streaming.** Bedrock's native stream is AWS binary event-stream, not SSE;
  decode and re-emit Anthropic-shaped \`text/event-stream\`. The provider SDKs
  handle this.
- **\`count_tokens\`.** Bedrock has no count-tokens API. Return
  \`501 not_supported\`; the client falls back to a Haiku \`max_tokens:1\` probe.
- **Headers.** Forward \`content-type\`, \`accept\`, \`accept-encoding\`,
  \`anthropic-version\`, \`anthropic-beta\`, \`user-agent\`, and \`x-stainless-*\`;
  strip the client's \`Authorization\` and apply the upstream's own
  credentials. On the response, strip hop-by-hop headers
  (\`content-encoding\`, \`content-length\`, \`transfer-encoding\`, \`connection\`).
- **Errors.** Upstream error messages can carry your cloud account
  IDs/ARNs/project IDs \u2014 log them for the operator, return a generic
  message, but keep \`error.type\` so the client's retry logic still works.

## References

RFC 6749 (OAuth 2.0), RFC 8414 (AS metadata), RFC 8628 (device grant),
Anthropic Messages API, Claude Code settings reference, OTLP spec.
`;
  async function WJc(e) {
    let t = await e.reserve();
    try {
      vu("info", "waiting for migration lock (another replica may be migrating; check pg_locks for key 6775156 if this persists)");
      await t`SELECT pg_advisory_lock(6775156)`;
      try {
        await t`CREATE TABLE IF NOT EXISTS _migrations (
        version    INTEGER PRIMARY KEY,
        applied_at TIMESTAMPTZ NOT NULL DEFAULT now()
      )`;
        let n = await t`SELECT coalesce(max(version), 0) AS v FROM _migrations`;
        let r = Number(n[0].v);
        while (true) {
          r += 1;
          let o = false;
          if (await t.begin(async s => {
            switch (r) {
              case 1:
                await s`CREATE TABLE kv (
                key        TEXT PRIMARY KEY,
                value      TEXT NOT NULL,
                expires_at TIMESTAMPTZ
              )`;
                await s`CREATE INDEX kv_expires_at ON kv (expires_at)
                       WHERE expires_at IS NOT NULL`;
                break;
              case 2:
                await s`CREATE TABLE spend_limits (
                id          TEXT PRIMARY KEY,
                scope_type  TEXT NOT NULL
                            CHECK (scope_type IN ('user', 'rbac_group', 'organization')),
                scope_id    TEXT NOT NULL DEFAULT '',
                amount      BIGINT,
                period      TEXT NOT NULL DEFAULT 'monthly'
                            CHECK (period IN ('daily', 'weekly', 'monthly')),
                currency    TEXT NOT NULL DEFAULT 'USD'
                            CHECK (currency = 'USD'),
                created_at  TIMESTAMPTZ NOT NULL DEFAULT now(),
                updated_at  TIMESTAMPTZ NOT NULL DEFAULT now(),
                created_by  TEXT
              )`;
                await s`CREATE UNIQUE INDEX spend_limits_scope
                       ON spend_limits (scope_type, scope_id, period)`;
                await s`
                CREATE OR REPLACE FUNCTION caps_by_period(p_principal text, p_groups text[], p_mode text)
                RETURNS TABLE(period text, amount bigint, scope_type text, scope_id text, id text)
                LANGUAGE sql STABLE AS $$
                  SELECT DISTINCT ON (period) period, amount, scope_type, scope_id, id
                  FROM spend_limits
                  WHERE (scope_type = 'user' AND scope_id = p_principal)
                     OR (scope_type = 'rbac_group' AND scope_id = ANY(p_groups))
                     OR scope_type = 'organization'
                  -- The sort order IS the precedence (DISTINCT ON keeps the
                  -- first row). User beats group beats org. Within that, the
                  -- boolean-equals on the next line isn't a typo: it sorts a
                  -- real cap ahead of "unlimited" when mode is 'min', and the
                  -- other way for 'max' (or anything else). Then the smallest
                  -- or largest group cap wins.
                  ORDER BY period,
                    CASE scope_type WHEN 'user' THEN 0 WHEN 'rbac_group' THEN 1 ELSE 2 END,
                    (amount IS NULL) = (p_mode = 'min'),
                    CASE WHEN scope_type = 'rbac_group'
                         THEN CASE WHEN p_mode = 'min' THEN amount ELSE -amount END END,
                    id
                $$`;
                break;
              case 3:
                await s`CREATE TABLE admin_audit (
                id      BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                at      TIMESTAMPTZ NOT NULL DEFAULT now(),
                actor   TEXT NOT NULL,
                action  TEXT NOT NULL,
                target  TEXT NOT NULL,
                before  JSONB,
                after   JSONB,
                reason  TEXT
              )`;
                await s`CREATE INDEX admin_audit_at ON admin_audit (at)`;
                break;
              case 4:
                await s`CREATE TABLE spend (
                principal  TEXT NOT NULL,
                period     TEXT NOT NULL,  -- bucket key: YYYY-MM | YYYY-MM-DD | YYYY-Www
                cents      DOUBLE PRECISION NOT NULL DEFAULT 0,
                updated_at TIMESTAMPTZ NOT NULL DEFAULT now(),
                PRIMARY KEY (principal, period)
              )`;
                await s`CREATE INDEX spend_updated_at ON spend (updated_at)`;
                break;
              case 5:
                await s`CREATE TABLE principal_emails (
                principal  TEXT PRIMARY KEY,
                email      TEXT,
                name       TEXT,
                groups     JSONB,
                updated_at TIMESTAMPTZ NOT NULL DEFAULT now()
              )`;
                await s`CREATE INDEX principal_emails_updated_at ON principal_emails (updated_at)`;
                break;
              case 6:
                await s`CREATE INDEX spend_period_cents
                       ON spend (period, cents DESC, principal)`;
                break;
              default:
                return;
            }
            await s`INSERT INTO _migrations (version) VALUES (${r})`;
            o = true;
          }), !o) {
            break;
          }
          vu("info", `migration ${r} applied`);
        }
      } finally {
        await t`SELECT pg_advisory_unlock(6775156)`;
      }
    } finally {
      t.release();
    }
  }
  var GJc = __lazy(() => {
    Fee();
  });
  async function KJc(e, t) {
    if (typeof Bun > "u") {
      throw Error("claude gateway requires the native binary");
    }
    let n = new Bun.SQL(e, {
      connectionTimeout: 5,
      max: t?.maxConnections ?? 5,
      ...(t?.username !== undefined && {
        username: t.username
      }),
      ...(t?.password !== undefined && {
        password: t.password
      }),
      onclose: i => {
        if (i) {
          vu("warn", `postgres connection closed: ${i.message}`);
        }
      }
    });
    await WJc(n);
    n`SHOW server_version_num`.then(i => {
      let a = Number(i[0]?.server_version_num);
      if (Number.isFinite(a) && a < 140000) {
        vu("warn", `Postgres ${Math.floor(a / 1e4)} is below the supported floor (14) \u2014 upgrade; PostgreSQL ${Math.floor(a / 1e4)} is past upstream end-of-life`);
      }
    }).catch(() => {});
    let r = setInterval(W6f, 30000, n);
    r.unref?.();
    let o = {
      auditRetentionDays: t?.auditRetentionDays,
      spendRetentionMonths: t?.spendRetentionMonths,
      identityRetentionDays: t?.identityRetentionDays
    };
    VJc(n, o);
    let s = setInterval(VJc, 3600000, n, o);
    s.unref?.();
    return {
      sql: n,
      async set(i, a, l) {
        await n`
        INSERT INTO kv (key, value, expires_at)
        VALUES (${i}, ${a}, now() + make_interval(secs => ${l}))
        ON CONFLICT (key) DO UPDATE
        SET value = ${a}, expires_at = now() + make_interval(secs => ${l})
      `;
      },
      async get(i) {
        let a = await n`
        SELECT value FROM kv
        WHERE key = ${i} AND (expires_at IS NULL OR expires_at > now())
      `;
        return a.length > 0 ? a[0].value : null;
      },
      async del(i) {
        await n`DELETE FROM kv WHERE key = ${i}`;
      },
      async incr(i, a) {
        let l = await n`
        INSERT INTO kv (key, value, expires_at)
        VALUES (${i}, '1', now() + make_interval(secs => ${a}))
        ON CONFLICT (key) DO UPDATE SET
          value = CASE
            WHEN kv.expires_at IS NOT NULL AND kv.expires_at <= now() THEN '1'
            ELSE (kv.value::bigint + 1)::text
          END,
          expires_at = CASE
            WHEN kv.expires_at IS NOT NULL AND kv.expires_at <= now()
              THEN now() + make_interval(secs => ${a})
            ELSE kv.expires_at
          END
        RETURNING value
      `;
        return Number(l[0].value);
      },
      close() {
        clearInterval(r);
        clearInterval(s);
        n.close().catch(() => {});
      }
    };
  }
  function W6f(e) {
    e`DELETE FROM kv WHERE expires_at IS NOT NULL AND expires_at <= now()`.catch(t => vu("warn", `kv cleanup failed: ${he(t)}`));
  }
  function VJc(e, t) {
    let n = t?.auditRetentionDays ?? 365;
    e`DELETE FROM admin_audit WHERE at < now() - make_interval(days => ${n})`.catch(s => Xss("admin_audit", s));
    let r = t?.spendRetentionMonths ?? 13;
    e`DELETE FROM spend WHERE updated_at < now() - make_interval(months => ${r})`.catch(s => Xss("spend", s));
    let o = t?.identityRetentionDays ?? 90;
    e`DELETE FROM principal_emails WHERE updated_at < now() - make_interval(days => ${o})`.catch(s => Xss("principal_emails", s));
  }
  function Xss(e, t) {
    if (G6f(t) === "42501") {
      if (!zJc.vZc(e)) {
        zJc.add(e);
        vu("warn", `${e} retention sweep failed: the database role lacks DELETE on ${e} \u2014 grant it (see the docs' restricted-role grant list) or rows will outlive their retention window. Warning once.`);
      }
      return;
    }
    vu("warn", `${e} cleanup failed: ${he(t)}`);
  }
  function G6f(e) {
    if (typeof e === "object" && e !== null) {
      if ("errno" in e && typeof e.errno === "string") {
        return e.errno;
      }
      if ("code" in e && typeof e.code === "string") {
        return e.code;
      }
    }
    return;
  }
  var zJc;
  var YJc = __lazy(() => {
    dt();
    Fee();
    GJc();
    zJc = new Set();
  });
  var QJc = {};