  __export(CDs, {
    getCACertificates: () => getCACertificates,
    clearCACertsCache: () => clearCACertsCache
  });
  function A9u() {
    let e = process.env.CLAUDE_CODE_CERT_STORE;
    if (e) {
      let t = [];
      for (let n of e.split(",")) {
        let r = n.trim().toLowerCase();
        if (r === "bundled" || r === "system") {
          if (!t.includes(r)) {
            t.push(r);
          }
        } else if (r) {
          logForDebugging(`CA certs: unrecognized CLAUDE_CODE_CERT_STORE source '${r}', ignoring`, {
            level: "warn"
          });
        }
      }
      return t.length > 0 ? t : wDs;
    }
    if (xZe("--use-system-ca") || xZe("--use-openssl-ca")) {
      return ["system"];
    }
    return wDs;
  }
  function I9u(e) {
    let {
      X509Certificate: t
    } = require("crypto");
    let n = Date.now();
    let r = 0;
    let o = e.filter(s => {
      try {
        let i = new t(s);
        let a = new Date(i.validTo).getTime();
        if (Number.isNaN(a) || a > n) {
          return true;
        }
        r++;
        return false;
      } catch {
        return true;
      }
    });
    if (r > 0) {
      logForDebugging(`CA certs: Dropped ${r} expired certificate(s) from system store`);
    }
    return o;
  }
  function clearCACertsCache() {
    getCACertificates.cache?.clear?.();
    logForDebugging("Cleared CA certificates cache");
  }
  var wDs;
  var getCACertificates;
  var Ije = __lazy(() => {
    je();
    gn();
    wDs = ["bundled", "system"];
    getCACertificates = TEr(() => {
      let e = A9u();
      let t = process.env.NODE_EXTRA_CA_CERTS;
      let n = e.includes("bundled");
      let r = e.includes("system");
      logForDebugging(`CA certs: stores=${e.join(",")}, extraCertsPath=${t}`);
      let o = require("tls");
      let s = o.getCACertificates;
      if (!n && r && !s) {
        logForDebugging("CA certs: stores=system but system CA API unavailable, deferring to runtime");
        return;
      }
      let i = [];
      if (n) {
        i.push(...o.rootCertificates);
        logForDebugging(`CA certs: Loaded ${o.rootCertificates.length} bundled root certificates`);
      }
      if (r) {
        try {
          let a = s?.("system");
          if (a && a.length > 0) {
            let l = I9u(a);
            i.push(...l);
            logForDebugging(`CA certs: Loaded ${l.length} system CA certificates`);
          } else if (logForDebugging(`CA certs: system store ${s ? "returned empty" : "unavailable"}`), !n) {
            i.push(...o.rootCertificates);
          }
        } catch (a) {
          if (logForDebugging(`CA certs: Failed to load system CA certificates: ${a}`, {
            level: "error"
          }), !n) {
            i.push(...o.rootCertificates);
          }
        }
      }
      if (t) {
        try {
          let a = zt().readFileSync(t, {
            encoding: "utf8"
          });
          i.push(a);
          logForDebugging(`CA certs: Appended extra certificates from NODE_EXTRA_CA_CERTS (${t})`);
        } catch (a) {
          logForDebugging(`CA certs: Failed to read NODE_EXTRA_CA_CERTS file (${t}): ${a}`, {
            level: "error"
          });
        }
      }
      return i.length > 0 ? Ro(i) : undefined;
    });
  });
  function Yyn(e) {
    let t = e.toLowerCase().replace(/\.+$/, "");
    let n = xDs.domainToASCII(t);
    if (n !== "") {
      return n.replace(/\.+$/, "");
    }
    return t;
  }
  function MLr(e, t) {
    let n;
    if (e.startsWith("*.")) {
      n = `*.${Yyn(e.slice(2))}`;
    } else {
      n = Yyn(e);
    }
    let r = Yyn(t);
    if (n === "*") {
      return true;
    }
    if (n === r) {
      return true;
    }
    if (n.startsWith("*.") && r.endsWith(n.slice(1))) {
      return true;
    }
    return false;
  }
  function NLr(e, t) {
    return MLr(t, e);
  }
  function LLr(e, t) {
    for (let n of t) {
      if (MLr(n, e)) {
        return true;
      }
    }
    return false;
  }
  function Xnt(e, t) {
    let n = t.lastIndexOf("/");
    if (n < 0) {
      return false;
    }
    let r = t.slice(0, n);
    let o = t.slice(n + 1);
    if (!/^\d+$/.test(o)) {
      return false;
    }
    let s = parseInt(o, 10);
    let i = RDs(r);
    if (!i) {
      return false;
    }
    if (i.zone) {
      return false;
    }
    let a = RDs(e);
    if (!a) {
      return false;
    }
    let l = O9u(a.bytes);
    let c = i.bytes;
    if (l.length !== c.length) {
      return false;
    }
    let u = c.length * 8;
    if (s < 0 || s > u) {
      return false;
    }
    return P9u(l, c, s);
  }
  function P9u(e, t, n) {
    let r = n >> 3;
    for (let i = 0; i < r; i++) {
      if (e[i] !== t[i]) {
        return false;
      }
    }
    let o = n & 7;
    if (o === 0) {
      return true;
    }
    let s = 255 << 8 - o & 255;
    return ((e[r] ?? 0) & s) === ((t[r] ?? 0) & s);
  }
  function O9u(e) {
    if (e.length !== 16) {
      return e;
    }
    for (let t = 0; t < 10; t++) {
      if (e[t] !== 0) {
        return e;
      }
    }
    if (e[10] !== 255 || e[11] !== 255) {
      return e;
    }
    return e.slice(12);
  }
  function RDs(e) {
    if (e === "") {
      return null;
    }
    let t = "";
    let n = e;
    let r = e.indexOf("%");
    if (r >= 0) {
      t = e.slice(r + 1);
      n = e.slice(0, r);
    }
    if (n.includes(":")) {
      let s = D9u(n);
      return s ? {
        bytes: s,
        zone: t
      } : null;
    }
    if (t) {
      return null;
    }
    let o = kDs(n);
    return o ? {
      bytes: o,
      zone: ""
    } : null;
  }
  function kDs(e) {
    let t = e.split(".");
    if (t.length !== 4) {
      return null;
    }
    let n = new Uint8Array(4);
    for (let r = 0; r < 4; r++) {
      let o = t[r];
      if (o === undefined || o === "" || !/^\d{1,3}$/.test(o)) {
        return null;
      }
      if (o.length > 1 && o.startsWith("0")) {
        return null;
      }
      let s = parseInt(o, 10);
      if (s > 255) {
        return null;
      }
      n[r] = s;
    }
    return n;
  }
  function D9u(e) {
    let t = null;
    let n = e;
    let r = e.lastIndexOf(":");
    if (r >= 0 && e.slice(r + 1).includes(".")) {
      if (t = kDs(e.slice(r + 1)), !t) {
        return null;
      }
      n = e.slice(0, r + 1);
    }
    let o = n.split("::");
    if (o.length > 2) {
      return null;
    }
    let s = [];
    let i = (l, c) => {
      if (l === "") {
        return [];
      }
      let u = l.split(":");
      let d = [];
      for (let p = 0; p < u.length; p++) {
        let m = u[p];
        if (m === "" && c && p === u.length - 1) {
          continue;
        }
        if (m === undefined || m === "" || !/^[0-9a-fA-F]{1,4}$/.test(m)) {
          return null;
        }
        d.push(parseInt(m, 16));
      }
      return d;
    };
    if (o.length === 1) {
      let l = o[0] ?? "";
      let c = i(l, t !== null);
      if (!c) {
        return null;
      }
      s.push(...c);
      let u = t ? 6 : 8;
      if (s.length !== u) {
        return null;
      }
    } else {
      let l = o[0] ?? "";
      let c = o[1] ?? "";
      let u = i(l, false);
      let d = i(c, t !== null);
      if (!u || !d) {
        return null;
      }
      let p = t ? 2 : 0;
      let m = 8 - u.length - d.length - p;
      if (m < 1) {
        return null;
      }
      s.push(...u);
      for (let f = 0; f < m; f++) {
        s.push(0);
      }
      if (s.push(...d), s.length + p !== 8) {
        return null;
      }
    }
    let a = new Uint8Array(16);
    for (let l = 0; l < s.length; l++) {
      let c = s[l];
      if (c === undefined) {
        return null;
      }
      a[l * 2] = c >> 8 & 255;
      a[l * 2 + 1] = c & 255;
    }
    if (t) {
      a[12] = t[0] ?? 0;
      a[13] = t[1] ?? 0;
      a[14] = t[2] ?? 0;
      a[15] = t[3] ?? 0;
    }
    return a;
  }
  var xDs;
  var sNt = __lazy(() => {
    xDs = require("url");
  });
  var IDs = {};
  __export(IDs, {
    getWebSocketTLSOptions: () => getWebSocketTLSOptions,
    getTLSFetchOptions: () => getTLSFetchOptions,
    getMTLSConfig: () => getMTLSConfig,
    getMTLSAgent: () => getMTLSAgent,
    configureGlobalMTLS: () => configureGlobalMTLS,
    clearMTLSCache: () => clearMTLSCache
  });
  function getWebSocketTLSOptions() {
    let e = getMTLSConfig();
    let t = getCACertificates();
    if (!e && !t) {
      return;
    }
    return {
      ...e,
      ...(t && {
        ca: t
      })
    };
  }
  function getTLSFetchOptions() {
    let e = getMTLSConfig();
    let t = getCACertificates();
    if (!e && !t) {
      return {};
    }
    return {
      Aeu: {
        ...e,
        ...(t && {
          ca: t
        })
      }
    };
  }
  function clearMTLSCache() {
    getMTLSConfig.cache.clear?.();
    getMTLSAgent.cache.clear?.();
    logForDebugging("Cleared mTLS configuration cache");
  }
  function configureGlobalMTLS() {
    if (!getMTLSConfig()) {
      return;
    }
    if (process.env.NODE_EXTRA_CA_CERTS) {
      logForDebugging("NODE_EXTRA_CA_CERTS detected - Node.js will automatically append to built-in CAs");
    }
  }
  var ADs;
  var getMTLSConfig;
  var getMTLSAgent;
  var fW = __lazy(() => {
    Ije();
    je();
    ADs = require("https");
    getMTLSConfig = TEr(() => {
      let e = {};
      if (process.env.CLAUDE_CODE_CLIENT_CERT) {
        try {
          e.cert = zt().readFileSync(process.env.CLAUDE_CODE_CLIENT_CERT, {
            encoding: "utf8"
          });
          logForDebugging("mTLS: Loaded client certificate from CLAUDE_CODE_CLIENT_CERT");
        } catch (t) {
          logForDebugging(`mTLS: Failed to load client certificate: ${t}`, {
            level: "error"
          });
        }
      }
      if (process.env.CLAUDE_CODE_CLIENT_KEY) {
        try {
          e.key = zt().readFileSync(process.env.CLAUDE_CODE_CLIENT_KEY, {
            encoding: "utf8"
          });
          logForDebugging("mTLS: Loaded client key from CLAUDE_CODE_CLIENT_KEY");
        } catch (t) {
          logForDebugging(`mTLS: Failed to load client key: ${t}`, {
            level: "error"
          });
        }
      }
      if (process.env.CLAUDE_CODE_CLIENT_KEY_PASSPHRASE) {
        e.passphrase = process.env.CLAUDE_CODE_CLIENT_KEY_PASSPHRASE;
        logForDebugging("mTLS: Using client key passphrase");
      }
      if (Object.keys(e).length === 0) {
        return;
      }
      return e;
    });
    getMTLSAgent = TEr(() => {
      let e = getMTLSConfig();
      let t = getCACertificates();
      if (!e && !t) {
        return;
      }
      let n = {
        ...e,
        ...(t && {
          ca: t
        }),
        keepAlive: true
      };
      logForDebugging("mTLS: Creating HTTPS agent with custom certificates");
      return new ADs.Agent(n);
    });
  });