  function Pio(e, t) {
    let n = e.leafCerts.get(t);
    if (n) {
      return n;
    }
    let r = _Un.rsa.generateKeyPair(2048);
    let o = _Un.createCertificate();
    o.publicKey = r.publicKey;
    o.serialNumber = Ncp();
    let s = Lcp(-1);
    o.validity.notBefore = s;
    o.validity.notAfter = Mcp(e.cert, s);
    o.setSubject([{
      name: "commonName",
      value: t
    }]);
    o.setIssuer(e.cert.subject.attributes);
    o.setExtensions([{
      name: "basicConstraints",
      cA: false,
      critical: true
    }, {
      name: "keyUsage",
      critical: true,
      digitalSignature: true,
      keyEncipherment: true
    }, {
      name: "extKeyUsage",
      serverAuth: true
    }, {
      name: "subjectAltName",
      altNames: [Dcp(t)]
    }, {
      name: "subjectKeyIdentifier"
    }, {
      name: "authorityKeyIdentifier",
      keyIdentifier: Ocp(e.cert)
    }]);
    o.sign(e.key, Icp.sha256.create());
    let i = {
      certPem: _Un.certificateToPem(o) + e.certPem,
      keyPem: _Un.privateKeyToPem(r.privateKey)
    };
    e.leafCerts.set(t, i);
    mo(`[mitm-leaf] minted RSA leaf for ${t}`);
    return i;
  }
  function Gra(e, t) {
    let n = e.secureContexts.get(t);
    if (n) {
      return n;
    }
    let {
      certPem: r,
      keyPem: o
    } = Pio(e, t);
    let s = qra.createSecureContext({
      cert: r,
      key: o
    });
    e.secureContexts.set(t, s);
    return s;
  }
  function Ocp(e) {
    let t = e.getExtension("subjectKeyIdentifier");
    return t?.subjectKeyIdentifier ? Wra.hexToBytes(t.subjectKeyIdentifier) : e.generateSubjectKeyIdentifier().getBytes();
  }
  function Dcp(e) {
    return jra.isIP(e) !== 0 ? {
      type: 7,
      ip: e
    } : {
      type: 2,
      value: e
    };
  }
  function Mcp(e, t) {
    let n = e.validity.notAfter;
    let r = new Date(t);
    r.setDate(r.getDate() + 99);
    return n < r ? new Date(n) : r;
  }
  function Ncp() {
    let e = Pcp.getBytesSync(16);
    let t = Wra.bytesToHex(e);
    return (parseInt(t[0], 16) & 7).toString(16) + t.slice(1);
  }
  function Lcp(e) {
    let t = new Date();
    t.setDate(t.getDate() + e);
    return t;
  }
  var Hra;
  var jra;
  var qra;
  var _Un;
  var Icp;
  var Pcp;
  var Wra;
  var Vra = __lazy(() => {
    Hra = __toESM(yUn(), 1);
    jra = require("net");
    qra = require("tls");
    ({
      pki: _Un,
      md: Icp,
      random: Pcp,
      util: Wra
    } = Hra.default);
  });
  function Oio(e) {
    let t = e?.http ?? process.env.HTTP_PROXY ?? process.env.http_proxy ?? undefined;
    let n = e?.https ?? process.env.HTTPS_PROXY ?? process.env.https_proxy ?? t;
    let r = e?.noProxy ?? process.env.NO_PROXY ?? process.env.no_proxy ?? "";
    if (!t && !n) {
      return;
    }
    let o = a => {
      if (!a) {
        return;
      }
      let c = /^[a-z][a-z0-9+.-]*:\/\//i.test(a) ? a : `http://${a}`;
      try {
        let u = new bUn.URL(c);
        if (u.protocol !== "http:" && u.protocol !== "https:" || !u.hostname) {
          throw Error("unsupported scheme or empty host");
        }
        return u;
      } catch {
        mo(`Invalid parent proxy URL, ignoring: ${$cp(a)}`, {
          level: "error"
        });
        return;
      }
    };
    let s = o(t);
    let i = o(n);
    if (!s && !i) {
      return;
    }
    return {
      httpUrl: s,
      httpsUrl: i,
      noProxy: Ucp(r)
    };
  }
  function Ucp(e) {
    let t = {
      all: false,
      suffixes: [],
      cidr: new wG.BlockList()
    };
    for (let n of e.split(",")) {
      if (n = n.trim(), !n) {
        continue;
      }
      if (n === "*") {
        t.all = true;
        continue;
      }
      let r = n.indexOf("/");
      if (r !== -1) {
        let a = n.slice(0, r);
        let l = n.slice(r + 1);
        let c = wG.isIP(a);
        if (c && l !== "" && /^\d+$/.test(l)) {
          let u = Number(l);
          let d = c === 6 ? 128 : 32;
          if (u >= 0 && u <= d) {
            try {
              t.cidr.addSubnet(a, u, c === 6 ? "ipv6" : "ipv4");
            } catch {}
            continue;
          }
        }
        continue;
      }
      let o = n.toLowerCase();
      let s = /^\[([^\]]+)\](?::\d+)?$/.exec(o);
      if (s) {
        o = s[1];
      }
      if (o.startsWith("*.")) {
        o = o.slice(1);
      }
      let i = wG.isIP(o);
      if (!i) {
        let a = o.lastIndexOf(":");
        if (a !== -1 && /^\d+$/.test(o.slice(a + 1))) {
          o = o.slice(0, a);
        }
      } else {
        try {
          t.cidr.addAddress(o, i === 6 ? "ipv6" : "ipv4");
          continue;
        } catch {}
      }
      t.suffixes.push(o);
    }
    return t;
  }
  function vqt(e, t) {
    let n = Wre(t.toLowerCase().replace(/\.$/, ""));
    if (n === "localhost") {
      return true;
    }
    let r = wG.isIP(n);
    if (r) {
      if (Bcp.check(n, r === 6 ? "ipv6" : "ipv4")) {
        return true;
      }
    }
    if (e.noProxy.all) {
      return true;
    }
    if (r) {
      if (e.noProxy.cidr.check(n, r === 6 ? "ipv6" : "ipv4")) {
        return true;
      }
    }
    for (let o of e.noProxy.suffixes) {
      if (o.startsWith(".")) {
        if (n === o.slice(1) || n.endsWith(o)) {
          return true;
        }
      } else if (n === o || n.endsWith("." + o)) {
        return true;
      }
    }
    return false;
  }
  function wqt(e, t) {
    if (t.isHttps) {
      return e.httpsUrl ?? e.httpUrl;
    }
    return e.httpUrl;
  }
  function Dio(e) {
    let {
      destHost: t,
      destPort: n
    } = e;
    let r = Wre(t);
    if (!Cqt(r)) {
      return Promise.reject(Error(`Invalid destination host for CONNECT: ${JSON.stringify(t)}`));
    }
    if (!Number.isInteger(n) || n < 1 || n > 65535) {
      return Promise.reject(Error(`Invalid destination port: ${n}`));
    }
    let o = wG.isIP(r) === 6 ? `[${r}]:${n}` : `${r}:${n}`;
    return new Promise((s, i) => {
      let a = e.dial();
      let l = false;
      let c = d => {
        if (l) {
          return;
        }
        l = true;
        a.destroy();
        i(d);
      };
      let u = () => c(Error("Proxy closed during CONNECT handshake"));
      a.setTimeout(e.timeoutMs ?? 30000, () => c(Error("CONNECT handshake timed out")));
      a.once("error", c);
      a.once("close", u);
      a.once(e.readyEvent, () => {
        a.write(`CONNECT ${o} HTTP/1.1\r
Host: ${o}\r
` + (e.authHeader ? `Proxy-Authorization: ${e.authHeader}\r
` : "") + `\r
`);
        let d = "";
        let p = m => {
          d += m.toString("latin1");
          let f = d.indexOf(`\r
\r
`);
          if (f === -1) {
            if (d.length > 16384) {
              c(Error("CONNECT response header too large"));
            }
            return;
          }
          a.pause();
          a.removeListener("data", p);
          let h = d.slice(0, d.indexOf(`\r
`));
          if (!/^HTTP\/1\.[01] 2\d\d(?:\s|$)/.test(h)) {
            return c(Error(`Proxy refused CONNECT: ${h.trim()}`));
          }
          let g = d.slice(f + 4);
          if (g.length) {
            a.unshift(Buffer.from(g, "latin1"));
          }
          l = true;
          a.setTimeout(0);
          a.removeListener("error", c);
          a.removeListener("close", u);
          s(a);
        };
        a.on("data", p);
      });
    });
  }
  function SUn(e, t, n) {
    let r = Wre(e.hostname);
    let o = Number(e.port) || (e.protocol === "https:" ? 443 : 80);
    let s = e.protocol === "https:";
    return Dio({
      destHost: t,
      destPort: n,
      authHeader: Mio(e),
      readyEvent: s ? "secureConnect" : "connect",
      dial: () => s ? zra.connect({
        host: r,
        port: o,
        ...(wG.isIP(r) ? {} : {
          servername: r
        })
      }) : wG.connect(o, r)
    });
  }
  function Mio(e) {
    if (!e.username && !e.password) {
      return;
    }
    try {
      let t = `${decodeURIComponent(e.username)}:${decodeURIComponent(e.password)}`;
      return `Basic ${Buffer.from(t).toString("base64")}`;
    } catch {
      let t = `${e.username}:${e.password}`;
      return `Basic ${Buffer.from(t).toString("base64")}`;
    }
  }
  function AOe(e) {
    let t = new Set();
    let n = e.connection;
    if (n) {
      for (let o of String(n).split(",")) {
        t.add(o.trim().toLowerCase());
      }
    }
    let r = {};
    for (let [o, s] of Object.entries(e)) {
      let i = o.toLowerCase();
      if (!Fcp.vZc(i) && !t.vZc(i)) {
        r[o] = s;
      }
    }
    return r;
  }
  function Wre(e) {
    return e.startsWith("[") && e.endsWith("]") ? e.slice(1, -1) : e;
  }
  function Nio(e) {
    if (!e) {
      return "-";
    }
    if (!e.username && !e.password) {
      return e.href;
    }
    let t = new bUn.URL(e.href);
    t.username = "***";
    t.password = "***";
    return t.href;
  }
  function $cp(e) {
    return e.replace(/\/\/[^@/]*@/, "//***:***@");
  }
  function Cqt(e) {
    if (!e || e.length > 255) {
      return false;
    }
    let t = Wre(e);
    if (t.includes("%")) {
      return false;
    }
    if (wG.isIP(t)) {
      return true;
    }
    return /^[A-Za-z0-9._-]+$/.test(t);
  }
  function Lio(e) {
    try {
      let t = Wre(e);
      let n = wG.isIP(t) === 6 ? `[${t}]` : t;
      let r = new bUn.URL(`http://${n}/`).hostname;
      return Wre(r).replace(/\.$/, "");
    } catch {
      return;
    }
  }
  function TUn(e, t, n = 30000) {
    return new Promise((r, o) => {
      let s = wG.connect(t, e);
      let i = false;
      let a = l => {
        if (i) {
          return;
        }
        if (i = true, s.setTimeout(0), l) {
          s.destroy();
          o(l);
        } else {
          r(s);
        }
      };
      s.setTimeout(n, () => a(Error("connect timed out")));
      s.once("connect", () => a());
      s.once("error", a);
      s.once("close", () => a(Error("socket closed before connect")));
    });
  }
  var wG;
  var zra;
  var bUn;
  var Fcp;
  var Bcp;
  var Kut = __lazy(() => {
    wG = require("net");
    zra = require("tls");
    bUn = require("url");
    Fcp = new Set(["connection", "keep-alive", "proxy-authenticate", "proxy-authorization", "proxy-connection", "te", "trailer", "transfer-encoding", "upgrade"]);
    Bcp = (() => {
      let e = new wG.BlockList();
      e.addSubnet("127.0.0.0", 8, "ipv4");
      e.addAddress("::1", "ipv6");
      e.addSubnet("::ffff:127.0.0.0", 104, "ipv6");
      return e;
    })();
  });
  function Yra(e) {
    return e.length >= 3 && e[0] === 22 && e[1] === 3 && e[2] <= 3;
  }
  function Zra(e, t) {
    if (t.length >= 3) {
      return Promise.resolve({
        isTLS: Yra(t),
        head: t
      });
    }
    return new Promise(n => {
      let r = t;
      let o = () => {
        e.removeListener("data", s);
        e.removeListener("close", o);
        n({
          isTLS: Yra(r),
          head: r
        });
      };
      let s = i => {
        if (e.pause(), r = r.length ? Buffer.concat([r, i]) : i, r.length >= 3) {
          return o();
        }
        e.resume();
      };
      e.on("data", s);
      e.once("close", o);
    });
  }
  function eoa(e, t, n, r, o, s) {
    let i = Pio(e, s.hostname);
    let a = EUn.createServer({
      ALPNProtocols: ["http/1.1"],
      cert: i.certPem,
      key: i.keyPem,
      SNICallback: (u, d) => {
        try {
          d(null, Gra(e, u || s.hostname));
        } catch (p) {
          d(p);
        }
      }
    });
    a.on("request", (u, d) => {
      Hcp(t, n, u, d, s);
    });
    a.on("tlsClientError", (u, d) => {
      mo(`[tls-terminate] client TLS error for ${s.hostname}: ${u.message}`, {
        level: "error"
      });
      d.destroy();
    });
    a.on("upgrade", (u, d) => {
      mo("[tls-terminate] upgrade request refused", {
        level: "warn"
      });
      d.destroy();
    });
    let l = Wcp();
    let c = () => {
      a.close();
      Jra.unlink(l, () => {});
    };
    a.on("error", u => {
      mo(`[tls-terminate] inner server listen failed: ${u.message}`, {
        level: "error"
      });
      r.destroy();
      c();
    });
    a.listen(l, () => {
      let u = vUn.connect({
        path: l
      });
      u.on("error", d => {
        mo(`[tls-terminate] inner loopback failed: ${d.message}`, {
          level: "error"
        });
        r.destroy();
        c();
      });
      u.once("connect", () => {
        if (o.length) {
          u.write(o);
        }
        r.pipe(u);
        u.pipe(r);
      });
      r.on("error", () => u.destroy());
      r.once("close", () => {
        u.destroy();
        c();
      });
      u.once("close", () => r.destroy());
    });
    a.unref();
  }
  async function Hcp(e, t, n, r, o) {
    let s = jcp(n.url);
    let i = n;
    if (e) {
      let c = new AbortController();
      r.once("close", () => c.abort());
      let u = o.port === 443 ? o.hostname : `${o.hostname}:${o.port}`;
      let d = await FFn(e, n, r, `https://${u}${s}`, c.signal);
      if (d === null) {
        return;
      }
      i = d;
    }
    let a = AOe(n.headers);
    delete a.host;
    t?.(a, o.hostname);
    let l = EUn.request({
      host: o.hostname,
      port: o.port,
      path: s,
      method: n.method,
      headers: a,
      ...(vUn.isIP(o.hostname) ? {} : {
        servername: o.hostname
      }),
      ...(o.upstreamCA ? {
        ca: o.upstreamCA
      } : {}),
      agent: false
    }, c => {
      r.writeHead(c.statusCode ?? 502, AOe(c.headers));
      c.pipe(r);
    });
    l.on("error", c => {
      if (mo(`[tls-terminate] upstream ${o.hostname}:${o.port} failed: ${c.message}`, {
        level: "error"
      }), !r.headersSent) {
        r.writeHead(502, {
          "Content-Type": "text/plain"
        });
        r.end("Bad Gateway");
      } else {
        r.destroy();
      }
    });
    r.on("close", () => l.destroy());
    i.pipe(l);
  }
  function jcp(e) {
    let t = e ?? "/";
    if (t.startsWith("/")) {
      return t;
    }
    try {
      let n = new URL(t);
      return `${n.pathname}${n.search}` || "/";
    } catch {
      return t;
    }
  }
  function Wcp() {
    return Qra.join(Xra.tmpdir(), `srt-tt-${process.pid}-${(qcp++).toString(36)}.sock`);
  }
  var EUn;
  var vUn;
  var Jra;
  var Xra;
  var Qra;
  var qcp = 0;
  var toa = __lazy(() => {
    Rso();
    Vra();
    Kut();
    EUn = require("https");
    vUn = require("net");
    Jra = require("fs");
    Xra = require("os");
    Qra = require("path");
  });
  function ooa(e) {
    let t = CUn.createServer();
    let n = r => {
      if (!e.proxyAuthToken) {
        return true;
      }
      let o = /^basic\s+([a-z0-9+/=]+)\s*$/i.exec(r ?? "");
      if (!o) {
        return false;
      }
      let s = Buffer.from(o[1], "base64").toString("utf8");
      let i = s.indexOf(":");
      return i > 0 && s.slice(i + 1) === e.proxyAuthToken;
    };
    t.on("connect", async (r, o, s) => {
      o.on("error", a => {
        mo(`Client socket error: ${a.message}`, {
          level: "error"
        });
      });
      let i = false;
      o.once("close", () => {
        i = true;
      });
      try {
        if (!n(r.headers["proxy-authorization"])) {
          o.end(`HTTP/1.1 407 Proxy Authentication Required\r
Proxy-Authenticate: Basic realm="srt"\r
\r
`);
          return;
        }
        let a = Gcp(r.url);
        if (!a) {
          mo(`Invalid CONNECT request: ${r.url}`, {
            level: "error"
          });
          o.end(`HTTP/1.1 400 Bad Request\r
\r
`);
          return;
        }
        let {
          hostname: l,
          port: c
        } = a;
        if (!(await e.filter(c, l, o))) {
          mo(`Connection blocked to ${l}:${c}`, {
            level: "error"
          });
          o.end(`HTTP/1.1 403 Forbidden\r
Content-Type: text/plain\r
X-Proxy-Error: blocked-by-allowlist\r
\r
Connection blocked by network allowlist`);
          return;
        }
        let d = false;
        if (e.mitmCA && (e.shouldTerminateTLS?.(l, c) ?? true)) {
          if (i) {
            return;
          }
          o.write(`HTTP/1.1 200 Connection Established\r
\r
`);
          d = true;
          let h = await Zra(o, s);
          if (i) {
            return;
          }
          if (h.isTLS) {
            eoa(e.mitmCA, e.filterRequest, e.mutateHeaders, o, h.head, {
              hostname: l,
              port: c,
              upstreamCA: e.tlsTerminateUpstreamCA
            });
            return;
          }
          mo(`[tls-terminate] non-TLS bytes on CONNECT ${l}:${c}; opaque-tunnelling`);
          s = h.head;
        } else if (e.mitmCA) {
          mo(`[tls-terminate] policy exempts ${l}:${c}; opaque-tunnelling`);
        }
        let p = e.getMitmSocketPath?.(l);
        let m = !p && e.parentProxy && !vqt(e.parentProxy, l) ? wqt(e.parentProxy, {
          isHttps: true
        }) : undefined;
        let f;
        try {
          if (p) {
            mo(`Routing CONNECT ${l}:${c} through MITM proxy at ${p}`);
            f = await Dio({
              dial: () => noa.connect({
                path: p
              }),
              readyEvent: "connect",
              destHost: l,
              destPort: c
            });
          } else if (m) {
            f = await SUn(m, l, c);
          } else {
            f = await TUn(l, c);
          }
        } catch (h) {
          if (mo(`CONNECT tunnel failed: ${h.message}`, {
            level: "error"
          }), d) {
            o.destroy();
          } else {
            o.end(`HTTP/1.1 502 Bad Gateway\r
\r
`);
          }
          return;
        }
        if (i) {
          f.on("error", () => {});
          f.destroy();
          return;
        }
        if (!d) {
          o.write(`HTTP/1.1 200 Connection Established\r
\r
`);
        }
        if (s.length) {
          f.write(s);
        }
        f.pipe(o);
        o.pipe(f);
        f.on("error", h => {
          mo(`CONNECT tunnel failed: ${h.message}`, {
            level: "error"
          });
          o.destroy();
        });
        o.on("close", () => f.destroy());
        f.on("close", () => o.destroy());
      } catch (a) {
        mo(`Error handling CONNECT: ${a}`, {
          level: "error"
        });
        o.end(`HTTP/1.1 500 Internal Server Error\r
\r
`);
      }
    });
    t.on("request", async (r, o) => {
      try {
        if (!n(r.headers["proxy-authorization"])) {
          o.writeHead(407, {
            "Proxy-Authenticate": 'Basic realm="srt"'
          });
          o.end();
          return;
        }
        let s = new roa.URL(r.url);
        let i = Wre(s.hostname);
        let a = s.port ? parseInt(s.port, 10) : s.protocol === "https:" ? 443 : 80;
        if (!(await e.filter(a, i, r.socket))) {
          mo(`HTTP request blocked to ${i}:${a}`, {
            level: "error"
          });
          o.writeHead(403, {
            "Content-Type": "text/plain",
            "X-Proxy-Error": "blocked-by-allowlist"
          });
          o.end("Connection blocked by network allowlist");
          return;
        }
        if (r.socket.destroyed) {
          return;
        }
        let c = {
          ...AOe(r.headers),
          host: s.host
        };
        e.mutateHeadersPlaintext?.(c, i);
        let u = e.getMitmSocketPath?.(i);
        let d = !u && e.parentProxy && !vqt(e.parentProxy, i) ? wqt(e.parentProxy, {
          isHttps: s.protocol === "https:"
        }) : undefined;
        let p = `${s.protocol}//${s.host}${s.pathname}${s.search}`;
        let m = r;
        if (e.filterRequest) {
          let h = new AbortController();
          o.once("close", () => h.abort());
          let g = await FFn(e.filterRequest, r, o, p, h.signal);
          if (g === null) {
            return;
          }
          m = g;
        }
        let f;
        if (u) {
          mo(`Routing HTTP ${r.method} ${i}:${a} through MITM proxy at ${u}`);
          let h = new CUn.Agent({
            socketPath: u
          });
          f = wUn.request({
            agent: h,
            path: p,
            method: r.method,
            headers: c
          }, g => {
            o.writeHead(g.statusCode, AOe(g.headers));
            g.pipe(o);
          });
        } else if (d) {
          let h = Wre(d.hostname);
          let g = Number(d.port) || (d.protocol === "https:" ? 443 : 80);
          let y = Mio(d);
          f = (d.protocol === "https:" ? Fio.request : wUn.request)({
            hostname: h,
            port: g,
            path: p,
            method: r.method,
            headers: y ? {
              ...c,
              "proxy-authorization": y
            } : c
          }, b => {
            o.writeHead(b.statusCode, AOe(b.headers));
            b.pipe(o);
          });
        } else {
          f = (s.protocol === "https:" ? Fio.request : wUn.request)({
            hostname: i,
            port: a,
            path: s.pathname + s.search,
            method: r.method,
            headers: c
          }, g => {
            o.writeHead(g.statusCode, AOe(g.headers));
            g.pipe(o);
          });
        }
        f.on("error", h => {
          if (mo(`Proxy request failed: ${h.message}`, {
            level: "error"
          }), !o.headersSent) {
            o.writeHead(502, {
              "Content-Type": "text/plain"
            });
            o.end("Bad Gateway");
          } else {
            o.destroy();
          }
        });
        o.on("close", () => f.destroy());
        m.pipe(f);
      } catch (s) {
        if (mo(`Error handling HTTP request: ${s}`, {
          level: "error"
        }), !o.headersSent) {
          o.writeHead(500, {
            "Content-Type": "text/plain"
          });
          o.end("Internal Server Error");
        } else {
          o.destroy();
        }
      }
    });
    return t;
  }
  function Gcp(e) {
    let t = /^\[([^\]]+)\]:(\d+)$/.exec(e) ?? /^([^:]+):(\d+)$/.exec(e);
    if (!t) {
      return;
    }
    let n = Number(t[2]);
    if (!Number.isInteger(n) || n < 1 || n > 65535) {
      return;
    }
    return {
      hostname: t[1],
      port: n
    };
  }
  var CUn;
  var wUn;
  var Fio;
  var noa;
  var roa;
  var soa = __lazy(() => {
    Rso();
    toa();
    Kut();
    CUn = require("http");
    wUn = require("http");
    Fio = require("https");
    noa = require("net");
    roa = require("url");
  });
  function ioa(e, t) {
    if (e.command !== "connect") {
      return t("COMMAND_NOT_SUPPORTED");
    }
    e.socket.on("error", () => {});
    let n = coa.default.createConnection({
      host: e.destAddress,
      port: e.destPort
    });
    n.setNoDelay();
    let r = false;
    n.on("error", o => {
      if (!r) {
        switch (o.code) {
          case "EINVAL":
          case "ENOENT":
          case "ENOTFOUND":
          case "ETIMEDOUT":
          case "EADDRNOTAVAIL":
          case "EHOSTUNREACH":
            t("HOST_UNREACHABLE");
            break;
          case "ENETUNREACH":
            t("NETWORK_UNREACHABLE");
            break;
          case "ECONNREFUSED":
            t("CONNECTION_REFUSED");
            break;
          default:
            t("GENERAL_FAILURE");
        }
      }
    });
    n.on("ready", () => {
      r = true;
      t("REQUEST_GRANTED");
      e.socket.pipe(n).pipe(e.socket);
    });
    e.socket.on("close", () => n.destroy());
    return n;
  }
  function uoa(e) {
    let t = new zcp();
    if (e?.auth) {
      t.setAuthHandler(n => n.username === e.auth.username && n.password === e.auth.password);
    }
    if (e?.port) {
      t.listen(e.port, e.hostname);
    }
    return t;
  }
  var aoa;
  var coa;
  var loa;
  var Uio;
  var Vcp = class {
    constructor(e, t) {
      this.errorHandler = () => {};
      this.metadata = {};
      this.socket = t;
      this.server = e;
      t.on("error", this.errorHandler);
      t.pause();
      this.handleGreeting();
    }
    readBytes(e) {
      return new Promise(t => {
        let n = Buffer.allocUnsafe(e);
        let r = 0;
        let o = s => {
          let i = Math.min(s.length, e - r);
          if (s.copy(n, r, 0, i), r += i, r < e) {
            return;
          }
          this.socket.removeListener("data", o);
          this.socket.push(s.subarray(i));
          t(n);
          this.socket.pause();
        };
        this.socket.on("data", o);
        this.socket.resume();
      });
    }
    async handleGreeting() {
      if ((await this.readBytes(1)).readUInt8() !== 5) {
        return this.socket.destroy();
      }
      let t = (await this.readBytes(1)).readUInt8();
      if (t > 128 || t === 0) {
        return this.socket.destroy();
      }
      let n = await this.readBytes(t);
      let r = this.server.authHandler ? 2 : 0;
      if (!n.includes(r)) {
        this.socket.write(Buffer.from([5, 255]));
        return this.socket.destroy();
      }
      if (this.socket.write(Buffer.from([5, r])), this.server.authHandler) {
        this.handleUserPassword();
      } else {
        this.handleConnectionRequest();
      }
    }
    async handleUserPassword() {
      await this.readBytes(1);
      let e = (await this.readBytes(1)).readUint8();
      let t = (await this.readBytes(e)).toString();
      let n = (await this.readBytes(1)).readUint8();
      let r = (await this.readBytes(n)).toString();
      this.username = t;
      this.password = r;
      let o = false;
      let s = () => {
        if (o) {
          return;
        }
        o = true;
        this.socket.write(Buffer.from([1, 0]));
        this.handleConnectionRequest();
      };
      let i = () => {
        if (o) {
          return;
        }
        o = true;
        this.socket.write(Buffer.from([1, 1]));
        this.socket.destroy();
      };
      let a = await this.server.authHandler(this, s, i);
      if (a === true) {
        s();
      } else if (a === false) {
        i();
      }
    }
    async handleConnectionRequest() {
      await this.readBytes(1);
      let e = (await this.readBytes(1))[0];
      let t = loa[e];
      if (!t) {
        return this.socket.destroy();
      }
      this.command = t;
      await this.readBytes(1);
      let n = (await this.readBytes(1)).readUInt8();
      let r = "";
      switch (n) {
        case 1:
          r = (await this.readBytes(4)).join(".");
          break;
        case 3:
          let c = (await this.readBytes(1)).readUInt8();
          r = (await this.readBytes(c)).toString();
          break;
        case 4:
          let u = await this.readBytes(16);
          for (let d = 0; d < 16; d++) {
            if (d % 2 === 0 && d > 0) {
              r += ":";
            }
            r += `${u[d] < 16 ? "0" : ""}${u[d].toString(16)}`;
          }
          break;
        default:
          this.socket.destroy();
          return;
      }
      let o = (await this.readBytes(2)).readUInt16BE();
      if (!this.server.supportedCommands.vZc(t)) {
        this.socket.write(Buffer.from([5, 7]));
        return this.socket.destroy();
      }
      this.destAddress = r;
      this.destPort = o;
      let s = false;
      let i = () => {
        if (s) {
          return;
        }
        s = true;
        this.connect();
      };
      if (!this.server.rulesetValidator) {
        return i();
      }
      let a = () => {
        if (s) {
          return;
        }
        s = true;
        this.socket.write(Buffer.from([5, 2, 0, 1, 0, 0, 0, 0, 0, 0]));
        this.socket.destroy();
      };
      let l = await this.server.rulesetValidator(this, i, a);
      if (l === true) {
        i();
      } else if (l === false) {
        a();
      }
    }
    connect() {
      this.socket.removeListener("error", this.errorHandler);
      this.server.connectionHandler(this, e => {
        if (Uio[e] === undefined) {
          throw Error(`"${e}" is not a valid status.`);
        }
        if (this.socket.write(Buffer.from([5, Uio[e], 0, 1, 0, 0, 0, 0, 0, 0])), e !== "REQUEST_GRANTED") {
          this.socket.destroy();
        }
      });
      this.socket.resume();
    }
  };
  var zcp = class {
    constructor() {
      this.supportedCommands = new Set(["connect"]);
      this.connectionHandler = ioa;
      this.server = aoa.default.createServer(e => {
        e.setNoDelay();
        this._handleConnection(e);
      });
    }
    listen(...e) {
      this.server.listen(...e);
      return this;
    }
    close(e) {
      this.server.close(e);
      return this;
    }
    setAuthHandler(e) {
      this.authHandler = e;
      return this;
    }
    disableAuthHandler() {
      this.authHandler = undefined;
      return this;
    }
    setRulesetValidator(e) {
      this.rulesetValidator = e;
      return this;
    }
    disableRulesetValidator() {
      this.rulesetValidator = undefined;
      return this;
    }
    setConnectionHandler(e) {
      this.connectionHandler = e;
      return this;
    }
    useDefaultConnectionHandler() {
      this.connectionHandler = ioa;
      return this;
    }
    _handleConnection(e) {
      new Vcp(this, e);
      return this;
    }
  };
  var doa = __lazy(() => {
    aoa = __toESM(require("net"));
    coa = __toESM(require("net"));
    loa = (e => (e[e.connect = 1] = "connect", e[e.bind = 2] = "bind", e[e.udp = 3] = "udp", e))(loa || {});
    Uio = (e => (e[e.REQUEST_GRANTED = 0] = "REQUEST_GRANTED", e[e.GENERAL_FAILURE = 1] = "GENERAL_FAILURE", e[e.CONNECTION_NOT_ALLOWED = 2] = "CONNECTION_NOT_ALLOWED", e[e.NETWORK_UNREACHABLE = 3] = "NETWORK_UNREACHABLE", e[e.HOST_UNREACHABLE = 4] = "HOST_UNREACHABLE", e[e.CONNECTION_REFUSED = 5] = "CONNECTION_REFUSED", e[e.TTL_EXPIRED = 6] = "TTL_EXPIRED", e[e.COMMAND_NOT_SUPPORTED = 7] = "COMMAND_NOT_SUPPORTED", e[e.ADDRESS_TYPE_NOT_SUPPORTED = 8] = "ADDRESS_TYPE_NOT_SUPPORTED", e))(Uio || {});
  });
  function poa(e) {
    let t = uoa();
    if (e.proxyAuthToken) {
      t.setAuthHandler((r, o, s) => {
        if (r.username === "srt" && r.password === e.proxyAuthToken) {
          o();
        } else {
          mo("SOCKS auth rejected", {
            level: "error"
          });
          s();
        }
      });
    }
    t.setRulesetValidator(async r => {
      try {
        let {
          destAddress: o,
          destPort: s
        } = r;
        if (!Cqt(o)) {
          mo(`Rejecting malformed SOCKS host: ${JSON.stringify(o)}`, {
            level: "error"
          });
          return false;
        }
        if (mo(`Connection request to ${o}:${s}`), !(await e.filter(s, o))) {
          mo(`Connection blocked to ${o}:${s}`, {
            level: "error"
          });
          return false;
        }
        mo(`Connection allowed to ${o}:${s}`);
        return true;
      } catch (o) {
        mo(`Error validating connection: ${o}`, {
          level: "error"
        });
        return false;
      }
    });
    t.setConnectionHandler((r, o) => {
      let {
        destAddress: s,
        destPort: i
      } = r;
      let a = false;
      let l;
      r.socket.once("close", () => {
        a = true;
        l?.destroy();
      });
      r.socket.on("error", () => l?.destroy());
      let c = e.parentProxy && !vqt(e.parentProxy, s) ? wqt(e.parentProxy, {
        isHttps: true
      }) : undefined;
      (c ? SUn(c, s, i) : TUn(s, i)).then(d => {
        if (l = d, d.on("error", () => r.socket.destroy()), a) {
          d.destroy();
          return;
        }
        o("REQUEST_GRANTED");
        d.pipe(r.socket);
        r.socket.pipe(d);
        d.on("close", () => r.socket.destroy());
      }).catch(d => {
        if (mo(`SOCKS connect to ${s}:${i} failed: ${d.message}`, {
          level: "error"
        }), !a) {
          try {
            o("HOST_UNREACHABLE");
          } catch {}
        }
      });
    });
    let n = new Set();
    return {
      handleConnection(r) {
        r.setNoDelay();
        n.add(r);
        r.once("close", () => n.delete(r));
        t._handleConnection(r);
      },
      async close() {
        for (let r of n) {
          r.destroy();
        }
        n.clear();
      }
    };
  }
  var moa = __lazy(() => {
    doa();
    Kut();
  });
  function hoa() {
    try {
      let e = foa.readFileSync("/proc/version", {
        encoding: "utf8"
      });
      let t = e.match(/WSL(\d+)/i);
      if (t && t[1]) {
        return t[1];
      }
      if (e.toLowerCase().includes("microsoft")) {
        return "1";
      }
      return;
    } catch {
      return;
    }
  }
  function bw() {
    switch ("linux") {
      case "darwin":
        return "macos";
      case "linux":
        return "linux";
      case "win32":
        return "windows";
      default:
        return "unknown";
    }
  }
  var foa;
  var RUn = __lazy(() => {
    foa = __toESM(require("fs"));
  });
  function xUn(e, t, n, r) {
    return new Promise((o, s) => {
      let [i, a] = n ?? [0, 0];
      let l = i;
      let c = () => {
        while (r.vZc(l) && l <= a) {
          l++;
        }
        if (l > a) {
          s(Error(`No free port in range ${i}-${a} (excluding ${[...r].join(",")})`));
          return;
        }
        let u = () => {
          e.removeListener("error", d);
          o();
        };
        let d = p => {
          if (e.removeListener("listening", u), n && p?.code === "EADDRINUSE" && l < a) {
            l++;
            c();
            return;
          }
          s(p ?? Error("listen error"));
        };
        e.once("error", d);
        e.once("listening", u);
        t(n ? l : 0);
      };
      c();
    });
  }
  function Xcp() {
    return goa.join(yoa.tmpdir(), `srt-mux-${process.pid}-${(Jcp++).toString(36)}.sock`);
  }
  function _oa(e) {
    let t = e.firstByteTimeoutMs ?? 1e4;
    let n = bw() === "windows";
    let r;
    let o;
    let s = new Set();
    function i(l) {
      if (r === undefined && o === undefined) {
        mo("mux: HTTP dispatch before backend bound; dropping", {
          level: "error"
        });
        l.destroy();
        return;
      }
      let c = r ? Rqt.connect(r) : Rqt.connect(o, "127.0.0.1");
      c.on("error", u => {
        let d = u.code ?? "ERR";
        if (mo(`mux: HTTP backend dial failed: ${u.message}`, {
          level: "error"
        }), !l.destroyed) {
          l.end(`HTTP/1.1 502 Bad Gateway\r
Connection: close\r
\r
mux backend dial failed (${d})
`);
        }
      });
      l.on("error", () => c.destroy());
      l.once("close", () => c.destroy());
      c.once("close", () => l.destroy());
      l.pipe(c);
      c.pipe(l);
    }
    let a = Rqt.createServer(l => {
      s.add(l);
      l.once("close", () => s.delete(l));
      l.on("error", u => mo(`mux: client socket error: ${u.message}`));
      let c = setTimeout(() => {
        mo("mux: first-byte timeout; destroying connection");
        l.destroy();
      }, t);
      if (typeof c.unref === "function") {
        c.unref();
      }
      l.once("readable", () => {
        clearTimeout(c);
        let u = l.read(1);
        if (!u || u.length === 0) {
          l.destroy();
          return;
        }
        if (l.unshift(u), Kcp.vZc(u[0])) {
          e.handleSocksConnection(l);
        } else {
          i(l);
        }
      });
    });
    return {
      server: a,
      getPort() {
        let l = a.address();
        return l && typeof l === "object" ? l.port : undefined;
      },
      async listenHttpBackend() {
        if (!n) {
          let c = Xcp();
          await Bio.unlink(c).catch(() => {});
          await new Promise((u, d) => {
            e.httpServer.once("error", d);
            e.httpServer.listen(c, () => {
              e.httpServer.removeListener("error", d);
              u();
            });
          });
          r = c;
          mo(`mux: HTTP backend listening on ${c}`);
          return;
        }
        await xUn(e.httpServer, c => e.httpServer.listen(c, "127.0.0.1"), e.httpBackendPortRange, new Set());
        let l = e.httpServer.address();
        o = l && typeof l === "object" ? l.port : undefined;
        mo(`mux: HTTP backend listening on 127.0.0.1:${o}`);
        return o;
      },
      async close() {
        for (let l of s) {
          l.destroy();
        }
        if (s.clear(), await new Promise(l => a.close(() => l())), await new Promise(l => e.httpServer.close(() => l())), r) {
          await Bio.unlink(r).catch(() => {});
          r = undefined;
        }
        o = undefined;
      },
      unref() {
        a.unref();
        e.httpServer.unref();
      }
    };
  }
  var Rqt;
  var goa;
  var yoa;
  var Bio;
  var Kcp;
  var Jcp = 0;
  var boa = __lazy(() => {
    RUn();
    Rqt = require("net");
    goa = require("path");
    yoa = require("os");
    Bio = require("fs/promises");
    Kcp = new Set([4, 5]);
  });
  class $io {
    constructor() {
      this.byName = new Map();
      this.bySentinel = new Map();
    }
    register(e, t, n) {
      let r = this.byName.get(e);
      if (r !== undefined) {
        r.realValue = t;
        r.injectHosts = n;
        return r.sentinel;
      }
      let o = "fake_value_" + Toa.randomUUID();
      let s = {
        name: e,
        sentinel: o,
        realValue: t,
        injectHosts: n
      };
      this.byName.set(e, s);
      this.bySentinel.set(o, s);
      return o;
    }
    lookupReal(e) {
      return this.bySentinel.get(e)?.realValue;
    }
    namesInjectableAt(e, t) {
      let n = [];
      for (let r of this.byName.values()) {
        if (r.injectHosts.some(o => t(e, o))) {
          n.push(r.name);
        }
      }
      return n;
    }
    *entries() {
      for (let e of this.bySentinel.values()) {
        yield [e.sentinel, e.realValue];
      }
    }
    get size() {
      return this.bySentinel.size;
    }
    clear() {
      this.byName.clear();
      this.bySentinel.clear();
    }
    substituteInHeaders(e, t, n) {
      if (this.bySentinel.size === 0) {
        return;
      }
      for (let [r, o] of Object.entries(e)) {
        if (o === undefined) {
          continue;
        }
        if (Array.isArray(o)) {
          for (let s = 0; s < o.length; s++) {
            o[s] = this.substituteInString(o[s], t, n);
          }
        } else {
          e[r] = this.substituteInString(o, t, n);
        }
      }
    }
    substituteInString(e, t, n) {
      if (!e.includes("fake_value_")) {
        return e;
      }
      let r = e;
      for (let o of this.bySentinel.values()) {
        if (!r.includes(o.sentinel)) {
          continue;
        }
        if (!o.injectHosts.some(s => n(t, s))) {
          continue;
        }
        r = r.split(o.sentinel).join(o.realValue);
      }
      return r;
    }
  }
  var Toa;
  var Eoa = __lazy(() => {
    Toa = require("crypto");
  });
  function IUn() {
    return [...Qcp.filter(e => e !== ".git"), ".claude/commands", ".claude/agents"];
  }
  function Hio(e) {
    return e.toLowerCase();
  }
  function R1(e) {
    return e.includes("*") || e.includes("?") || e.includes("[") || e.includes("]");
  }
  function PUn(e) {
    return e.includes("*") || e.includes("?");
  }
  function Zcp(e) {
    return bw() === "windows" ? PUn(e) : R1(e);
  }
  function voa(e) {
    if (/^\\\\\?\\unc\\/i.test(e)) {
      return "\\\\" + e.slice(8);
    }
    if (e.startsWith("\\\\?\\")) {
      return e.slice(4);
    }
    return e;
  }
  function CG(e) {
    return e.replace(/\/\*\*$/, "") || "/";
  }
  function AUn(e, t) {
    let n = xq.normalize(e);
    let r = xq.normalize(t);
    if (r === n) {
      return false;
    }
    if (n.startsWith("/tmp/") && r === "/private" + n) {
      return false;
    }
    if (n.startsWith("/var/") && r === "/private" + n) {
      return false;
    }
    if (n.startsWith("/private/tmp/") && r === n) {
      return false;
    }
    if (n.startsWith("/private/var/") && r === n) {
      return false;
    }
    if (r === "/") {
      return true;
    }
    if (r.split("/").filter(Boolean).length <= 1) {
      return true;
    }
    if (n.startsWith(r + "/")) {
      return true;
    }
    let s = n;
    if (n.startsWith("/tmp/")) {
      s = "/private" + n;
    } else if (n.startsWith("/var/")) {
      s = "/private" + n;
    }
    if (s !== n && s.startsWith(r + "/")) {
      return true;
    }
    let i = r.startsWith(n + "/");
    let a = s !== n && r.startsWith(s + "/");
    if (r !== n && !(s !== n && r === s) && !i && !a) {
      return true;
    }
    return false;
  }
  function eup(e) {
    if (e === "~") {
      return kUn.homedir();
    }
    if (e.startsWith("~/")) {
      return kUn.homedir() + e.slice(1);
    }
    return e;
  }
  function d0(e) {
    let t = process.cwd();
    if (bw() === "windows") {
      if (e = voa(e), /^[a-z]:/.test(e)) {
        e = e[0].toUpperCase() + e.slice(1);
      }
    }
    let n = eup(e);
    if (n !== e) {
      ;
    } else if (e.startsWith("./") || e.startsWith("../")) {
      n = xq.resolve(t, e);
    } else if (!xq.isAbsolute(e)) {
      n = xq.resolve(t, e);
    }
    if (Zcp(n)) {
      let r = bw() === "windows" ? /[*?]/ : /[*?[\]]/;
      let o = n.split(r)[0];
      if (o && o !== "/") {
        let s = o.endsWith("/") ? o.slice(0, -1) : xq.dirname(o);
        try {
          let i = GGe.realpathSync(s);
          if (!AUn(s, i)) {
            let a = n.slice(s.length);
            return i + a;
          }
        } catch {}
      }
      return n;
    }
    try {
      let r = GGe.realpathSync(n);
      if (AUn(n, r)) {
        ;
      } else {
        n = r;
      }
    } catch {}
    return n;
  }
  function OUn() {
    let e = kUn.homedir();
    return ["/dev/stdout", "/dev/stderr", "/dev/null", "/dev/tty", "/dev/dtracehelper", "/dev/autofs_nowait", "/tmp/claude", "/private/tmp/claude", xq.join(e, ".npm/_logs"), xq.join(e, ".claude/debug")];
  }
  function Yut(e, t, n, r, o) {
    let s = r ? `srt:${r}@` : "";
    let i = ["SANDBOX_RUNTIME=1"];
    if (!o) {
      let c = process.env.CLAUDE_CODE_TMPDIR || process.env.CLAUDE_TMPDIR || "/tmp/claude";
      i.push(`TMPDIR=${c}`);
    }
    if (n) {
      for (let c of tup) {
        i.push(`${c}=${n}`);
      }
    }
    if (!e && !t) {
      return i;
    }
    let a = ["localhost", "127.0.0.1", "::1", "169.254.0.0/16", "10.0.0.0/8", "172.16.0.0/12", "192.168.0.0/16"].join(",");
    if (i.push(`NO_PROXY=${a}`), i.push(`no_proxy=${a}`), e) {
      if (i.push(`HTTP_PROXY=http://${s}localhost:${e}`), i.push(`HTTPS_PROXY=http://${s}localhost:${e}`), i.push(`http_proxy=http://${s}localhost:${e}`), i.push(`https_proxy=http://${s}localhost:${e}`), r) {
        i.push("GIT_CONFIG_PARAMETERS='http.proxyAuthMethod=basic'");
      }
    }
    let l = e ? `http://${s}localhost:${e}` : `socks5h://${s}localhost:${t}`;
    if (i.push(`ALL_PROXY=${l}`), i.push(`all_proxy=${l}`), t) {
      let u = bw();
      if (u === "macos") {
        i.push(`GIT_SSH_COMMAND=ssh -o ControlMaster=no -o ControlPath=none -o ProxyCommand='nc -X 5 -x localhost:${t} %h %p'`);
      } else if (u === "linux" && e) {
        let d = r ? `,proxyauth=srt:${r}` : "";
        i.push(`GIT_SSH_COMMAND=ssh -o ControlMaster=no -o ControlPath=none -o ProxyCommand='socat - PROXY:localhost:%h:%p,proxyport=${e}${d}'`);
      }
      if (i.push(`FTP_PROXY=socks5h://${s}localhost:${t}`), i.push(`ftp_proxy=socks5h://${s}localhost:${t}`), i.push(`RSYNC_PROXY=localhost:${t}`), i.push(`DOCKER_HTTP_PROXY=http://${s}localhost:${e || t}`), i.push(`DOCKER_HTTPS_PROXY=http://${s}localhost:${e || t}`), e) {
        if (i.push("CLOUDSDK_PROXY_TYPE=http"), i.push("CLOUDSDK_PROXY_ADDRESS=localhost"), i.push(`CLOUDSDK_PROXY_PORT=${e}`), r) {
          i.push("CLOUDSDK_PROXY_USERNAME=srt");
          i.push(`CLOUDSDK_PROXY_PASSWORD=${r}`);
        }
      }
      i.push(`GRPC_PROXY=socks5h://${s}localhost:${t}`);
      i.push(`grpc_proxy=socks5h://${s}localhost:${t}`);
    }
    return i;
  }
  function DUn(e) {
    let t = e.slice(0, 100);
    return Buffer.from(t).toString("base64");
  }
  function woa(e) {
    return Buffer.from(e, "base64").toString("utf8");
  }
  function IOe(e) {
    return "^" + e.replace(/[.^$+{}()|\\]/g, "\\$&").replace(/\[([^\]]*?)$/g, "\\[$1").replace(/\*\*\//g, "__GLOBSTAR_SLASH__").replace(/\*\*/g, "__GLOBSTAR__").replace(/\*/g, "[^/]*").replace(/\?/g, "[^/]").replace(/__GLOBSTAR_SLASH__/g, "(.*/)?").replace(/__GLOBSTAR__/g, ".*") + "$";
  }
  function VGe(e, t = {}) {
    let n = l => l;
    let r = n(d0(e));
    let o = r.split(/[*?[\]]/)[0];
    if (!o || o === "/") {
      mo(`[Sandbox] Glob pattern too broad, skipping: ${e}`);
      return [];
    }
    let s = o.endsWith("/") ? o.slice(0, -1) : xq.dirname(o);
    if (!GGe.existsSync(s)) {
      mo(`[Sandbox] Base directory for glob does not exist: ${s}`);
      return [];
    }
    let i = new RegExp(IOe(r), t.caseInsensitive ? "i" : "");
    let a = [];
    try {
      let l = GGe.readdirSync(s, {
        recursive: true,
        withFileTypes: true
      });
      for (let c of l) {
        let u = c.parentPath ?? c.path ?? s;
        let d = xq.join(u, c.name);
        if (i.test(n(d))) {
          a.push(d);
        }
      }
    } catch (l) {
      mo(`[Sandbox] Error expanding glob pattern ${e}: ${l}`);
    }
    return a;
  }
  var kUn;
  var xq;
  var GGe;
  var xqt;
  var Qcp;
  var tup;
  var BSe = __lazy(() => {
    RUn();
    kUn = require("os");
    xq = __toESM(require("path"));
    GGe = __toESM(require("fs"));
    xqt = [".gitconfig", ".gitmodules", ".bashrc", ".bash_profile", ".zshrc", ".zprofile", ".profile", ".ripgreprc", ".mcp.json"];
    Qcp = [".git", ".vscode", ".idea"];
    tup = ["NODE_EXTRA_CA_CERTS", "SSL_CERT_FILE", "CURL_CA_BUNDLE", "REQUESTS_CA_BUNDLE", "PIP_CERT", "GIT_SSL_CAINFO", "AWS_CA_BUNDLE", "CARGO_HTTP_CAINFO", "DENO_CERT", "CLOUDSDK_CORE_CUSTOM_CA_CERTS_FILE", "NIX_SSL_CERT_FILE"];
  });
  class qio {
    constructor() {
      this.byKey = new Map();
    }
    write(e, t) {
      if (this.dir === undefined) {
        this.dir = Gre.mkdtempSync(jio.join(Coa.tmpdir(), "srt-credmask-"));
      }
      let n = this.byKey.get(e);
      if (n === undefined) {
        n = jio.join(this.dir, `${this.byKey.size}.fake`);
        this.byKey.set(e, n);
      }
      Gre.rmSync(n, {
        force: true
      });
      Gre.writeFileSync(n, t, {
        mode: 384
      });
      return n;
    }
    dispose() {
      if (this.dir !== undefined) {
        try {
          Gre.rmSync(this.dir, {
            recursive: true,
            force: true
          });
        } catch (e) {
          mo(`MaskedFileStore cleanup failed: ${e}`, {
            level: "error"
          });
        }
      }
      this.dir = undefined;
      this.byKey.clear();
    }
    get dirPath() {
      return this.dir;
    }
  }
  function Roa(e, t, n, r) {
    let o = [];
    for (let s of e) {
      if (s.mode !== "mask") {
        continue;
      }
      let i = d0(s.path);
      let a;
      try {
        if (Gre.statSync(i).isDirectory()) {
          mo(`[credential-mask] Skipping masked file entry that resolves to a directory: ${s.path} \u2014 use mode "deny" for directories.`, {
            level: "warn"
          });
          continue;
        }
        let m = Gre.readFileSync(i);
        if (a = m.toString("utf8"), Buffer.byteLength(a, "utf8") !== m.length) {
          mo(`[credential-mask] Skipping masked file with non-UTF-8 content (binary credential files are not supported in whole-file mask mode): ${s.path}`, {
            level: "warn"
          });
          continue;
        }
      } catch (p) {
        mo(`[credential-mask] Skipping masked file (unreadable on host): ${s.path} \u2014 ${p.message}`);
        continue;
      }
      let l = s.injectHosts ?? t;
      let c = "file:" + i;
      let u = n.register(c, a, l);
      let d = r.write(c, u);
      o.push({
        realPath: i,
        fakePath: d
      });
    }
    return o;
  }
  var Gre;
  var Coa;
  var jio;
  var xoa = __lazy(() => {
    BSe();
    Gre = __toESM(require("fs"));
    Coa = require("os");
    jio = require("path");
  });
  function Doa(e) {
    if (e.caCertPath && e.caKeyPath) {
      return iup(e.caCertPath, e.caKeyPath);
    }
    if (e.caCertPath || e.caKeyPath) {
      throw Error("tlsTerminate: caCertPath and caKeyPath must be provided together");
    }
    return aup();
  }
  async function Moa(e) {
    let t = new Set([$Se.dirname(e.trustBundlePath)]);
    if (e.ephemeral) {
      t.add($Se.dirname(e.certPath));
    }
    for (let n of t) {
      try {
        await Poa.rm(n, {
          recursive: true,
          force: true
        });
      } catch (r) {
        mo(`[mitm-ca] cleanup failed: ${r.message}`, {
          level: "warn"
        });
      }
    }
  }
  function Noa(e, t) {
    let n = [t.trim(), ...Ooa.rootCertificates];
    let r = process.env.NODE_EXTRA_CA_CERTS;
    if (r) {
      try {
        n.push(Jue.readFileSync(r, "utf8").trim());
      } catch {}
    }
    let o = $Se.join(e, "trust-bundle.crt");
    Jue.writeFileSync(o, n.join(`
`) + `
`, {
      mode: 420
    });
    return o;
  }
  function iup(e, t) {
    let n = koa(e, "CERTIFICATE", "tlsTerminate.caCertPath");
    let r = koa(t, "PRIVATE KEY", "tlsTerminate.caKeyPath");
    let o;
    let s;
    try {
      o = Jut.certificateFromPem(n);
      s = Jut.privateKeyFromPem(r);
    } catch (l) {
      throw Error(`tlsTerminate: failed to parse CA from ${e}: ` + l.message);
    }
    if (!("n" in s) || !("d" in s)) {
      throw Error(`tlsTerminate.caKeyPath: CA key at ${t} must be RSA`);
    }
    let i = Jue.mkdtempSync($Se.join(Wio.tmpdir(), "srt-ca-"));
    let a = Noa(i, n);
    mo(`[mitm-ca] loaded CA from ${e}`);
    return {
      certPath: e,
      keyPath: t,
      trustBundlePath: a,
      certPem: n,
      keyPem: r,
      cert: o,
      key: s,
      leafCerts: new Map(),
      secureContexts: new Map(),
      ephemeral: false
    };
  }
  function aup() {
    let e = Jut.rsa.generateKeyPair(2048);
    let t = Jut.createCertificate();
    t.publicKey = e.publicKey;
    t.serialNumber = lup();
    t.validity.notBefore = Aoa(-1);
    t.validity.notAfter = Aoa(825);
    let n = [{
      name: "commonName",
      value: "sandbox-runtime ephemeral CA"
    }, {
      name: "organizationName",
      value: "sandbox-runtime"
    }];
    t.setSubject(n);
    t.setIssuer(n);
    t.setExtensions([{
      name: "basicConstraints",
      cA: true,
      critical: true
    }, {
      name: "keyUsage",
      critical: true,
      keyCertSign: true,
      cRLSign: true,
      digitalSignature: true
    }, {
      name: "subjectKeyIdentifier"
    }]);
    t.sign(e.privateKey, rup.sha256.create());
    let r = Jut.certificateToPem(t);
    let o = Jut.privateKeyToPem(e.privateKey);
    let s = Jue.mkdtempSync($Se.join(Wio.tmpdir(), "srt-ca-"));
    let i = $Se.join(s, "ca.crt");
    let a = $Se.join(s, "ca.key");
    Jue.writeFileSync(i, r, {
      mode: 420
    });
    Jue.writeFileSync(a, o, {
      mode: 384
    });
    let l = Noa(s, r);
    mo(`[mitm-ca] generated ephemeral CA at ${i}`);
    return {
      certPath: i,
      keyPath: a,
      trustBundlePath: l,
      certPem: r,
      keyPem: o,
      cert: t,
      key: e.privateKey,
      leafCerts: new Map(),
      secureContexts: new Map(),
      ephemeral: true
    };
  }
  function koa(e, t, n) {
    let r;
    try {
      r = Jue.readFileSync(e, "utf8");
    } catch (o) {
      let s = o.code ?? String(o);
      throw Error(`${n}: cannot read ${e} (${s})`);
    }
    if (!new RegExp(`-----BEGIN [A-Z ]*${t}-----`).test(r)) {
      throw Error(`${n}: ${e} is not a PEM ${t}`);
    }
    return r;
  }
  function lup() {
    let e = oup.getBytesSync(16);
    let t = sup.bytesToHex(e);
    return (parseInt(t[0], 16) & 7).toString(16) + t.slice(1);
  }
  function Aoa(e) {
    let t = new Date();
    t.setDate(t.getDate() + e);
    return t;
  }
  var Ioa;
  var Jue;
  var Poa;
  var Wio;
  var $Se;
  var Ooa;
  var Jut;
  var rup;
  var oup;
  var sup;
  var Loa = __lazy(() => {
    Ioa = __toESM(yUn(), 1);
    Jue = require("fs");
    Poa = require("fs/promises");
    Wio = require("os");
    $Se = require("path");
    Ooa = require("tls");
    ({
      pki: Jut,
      md: rup,
      random: oup,
      util: sup
    } = Ioa.default);
  });
  function HSe(e) {
    if (typeof globalThis.Bun < "u") {
      return globalThis.Bun.which(e);
    }
    let t = Foa.spawnSync("which", [e], {
      encoding: "utf8",
      stdio: ["ignore", "pipe", "ignore"],
      timeout: 1000
    });
    if (t.status === 0 && t.stdout) {
      return t.stdout.trim();
    }
    return null;
  }
  var Foa;
  var kqt = __lazy(() => {
    Foa = require("child_process");
  });
  function yV(e) {
    return e.map(t => {
      if (t === "") {
        return "''";
      }
      if (/^[A-Za-z0-9_./:@+,-][A-Za-z0-9_./:=@+,-]*$/.test(t)) {
        return t;
      }
      return "'" + t.replace(/'/g, `'"'"'`) + "'";
    }).join(" ");
  }
  async function Boa(e, t, n, r = {
    command: "rg"
  }) {
    let {
      command: o,
      args: s = [],
      argv0: i
    } = r;
    let a = Uoa.spawn(o, [...s, ...e, t], {
      argv0: i,
      signal: n,
      timeout: 1e4,
      windowsHide: true
    });
    let [l, c, u] = await Promise.all([Gio.text(a.stdout), Gio.text(a.stderr), new Promise((d, p) => {
      a.on("close", d);
      a.on("error", p);
    })]);
    if (u === 0) {
      return l.trim().split(`
`).filter(Boolean);
    }
    if (u === 1) {
      return [];
    }
    throw Error(`ripgrep failed with exit code ${u}: ${c}`);
  }
  var Uoa;
  var Gio;
  var $oa = __lazy(() => {
    kqt();
    Uoa = require("child_process");
    Gio = require("stream/consumers");
  });
  function cup() {
    if (zio) {
      return zio;
    }
    let e = [];
    try {
      let n = joa.execSync("npm root -g", {
        encoding: "utf8",
        timeout: 5000,
        stdio: ["pipe", "pipe", "ignore"]
      }).trim();
      if (n) {
        e.push(RG.join(n, "@anthropic-ai", "sandbox-runtime"));
      }
    } catch {}
    let t = qoa.homedir();
    e.push(RG.join("/usr", "lib", "node_modules", "@anthropic-ai", "sandbox-runtime"), RG.join("/usr", "local", "lib", "node_modules", "@anthropic-ai", "sandbox-runtime"), RG.join("/opt", "homebrew", "lib", "node_modules", "@anthropic-ai", "sandbox-runtime"), RG.join(t, ".npm", "lib", "node_modules", "@anthropic-ai", "sandbox-runtime"), RG.join(t, ".npm-global", "lib", "node_modules", "@anthropic-ai", "sandbox-runtime"));
    zio = e;
    return e;
  }
  function Woa() {
    switch ("arm64") {
      case "x64":
      case "x86_64":
        return "x64";
      case "arm64":
      case "aarch64":
        return "arm64";
      case "ia32":
      case "x86":
        mo("[SeccompFilter] 32-bit x86 (ia32) is not currently supported due to missing socketcall() syscall blocking. The current seccomp filter only blocks socket(AF_UNIX, ...), but on 32-bit x86, socketcall() can be used to bypass this.", {
          level: "error"
        });
        return null;
      default:
        mo("[SeccompFilter] Unsupported architecture: arm64. Only x64 and arm64 are supported.");
        return null;
    }
  }
  function uup(e) {
    let t = Woa();
    if (!t) {
      return [];
    }
    let n = RG.dirname(Hoa.fileURLToPath("file:///home/runner/work/claude-cli-internal/claude-cli-internal/node_modules/@anthropic-ai/sandbox-runtime/dist/sandbox/generate-seccomp-filter.js"));
    let r = RG.join("vendor", "seccomp", t, e);
    return [RG.join(n, r), RG.join(n, "..", "..", r), RG.join(n, "..", r)];
  }
  function Kio(e) {
    let t = e ?? "";
    if (Vio.vZc(t)) {
      return Vio.get(t);
    }
    let n = dup(e);
    Vio.set(t, n);
    return n;
  }
  function dup(e) {
    if (e) {
      if (MUn.existsSync(e)) {
        mo(`[SeccompFilter] Using apply-seccomp binary from explicit path: ${e}`);
        return e;
      }
      mo(`[SeccompFilter] Explicit path provided but file not found: ${e}`);
    }
    let t = Woa();
    if (!t) {
      mo("[SeccompFilter] Cannot find apply-seccomp binary: unsupported architecture arm64");
      return null;
    }
    mo(`[SeccompFilter] Looking for apply-seccomp binary for architecture: ${t}`);
    for (let n of uup("apply-seccomp")) {
      if (MUn.existsSync(n)) {
        mo(`[SeccompFilter] Found apply-seccomp binary: ${n} (${t})`);
        return n;
      }
    }
    for (let n of cup()) {
      let r = RG.join(n, "vendor", "seccomp", t, "apply-seccomp");
      if (MUn.existsSync(r)) {
        mo(`[SeccompFilter] Found apply-seccomp binary in global install: ${r} (${t})`);
        return r;
      }
    }
    mo(`[SeccompFilter] apply-seccomp binary not found in any expected location (${t})`);
    return null;
  }
  var RG;
  var Hoa;
  var MUn;
  var joa;
  var qoa;
  var Vio;
  var zio = null;
  var Goa = __lazy(() => {
    RG = require("path");
    Hoa = require("url");
    MUn = __toESM(require("fs"));
    joa = require("child_process");
    qoa = require("os");
    Vio = new Map();
  });
  function pup(e, t) {
    let n = e.split(hx.default.sep);
    let r = "";
    for (let o of n) {
      if (!o) {
        continue;
      }
      let s = r + hx.default.sep + o;
      try {
        if (wg.lstatSync(s).isSymbolicLink()) {
          if (t.some(l => s.startsWith(l + "/") || s === l)) {
            return s;
          }
        }
      } catch {
        break;
      }
      r = s;
    }
    return null;
  }
  function mup(e) {
    let t = e.split(hx.default.sep);
    let n = "";
    for (let r of t) {
      if (!r) {
        continue;
      }
      let o = n + hx.default.sep + r;
      try {
        let s = wg.statSync(o);
        if (s.isFile() || s.isSymbolicLink()) {
          return true;
        }
      } catch {
        break;
      }
      n = o;
    }
    return false;
  }
  function fup(e) {
    let t = e.split(hx.default.sep);
    let n = "";
    for (let r of t) {
      if (!r) {
        continue;
      }
      let o = n + hx.default.sep + r;
      if (!wg.existsSync(o)) {
        return o;
      }
      n = o;
    }
    return e;
  }
  async function hup(e = {
    command: "rg"
  }, t = 3, n = false, r) {
    let o = process.cwd();
    let s = new AbortController();
    let i = r ?? s.signal;
    let a = IUn();
    let l = [...xqt.map(m => hx.default.resolve(o, m)), ...a.map(m => hx.default.resolve(o, m))];
    let c = hx.default.resolve(o, ".git");
    let u = false;
    try {
      u = wg.statSync(c).isDirectory();
    } catch {}
    if (u) {
      if (l.push(hx.default.resolve(o, ".git/hooks")), !n) {
        l.push(hx.default.resolve(o, ".git/config"));
      }
    }
    let d = [];
    for (let m of xqt) {
      d.push("--iglob", m);
    }
    for (let m of a) {
      d.push("--iglob", `**/${m}/**`);
    }
    if (d.push("--iglob", "**/.git/hooks/**"), !n) {
      d.push("--iglob", "**/.git/config");
    }
    let p = [];
    try {
      p = await Boa(["--files", "--hidden", "--max-depth", String(t), ...d, "-g", "!**/node_modules/**"], o, i, e);
    } catch (m) {
      mo(`[Sandbox] ripgrep scan failed: ${m}`);
    }
    for (let m of p) {
      let f = hx.default.resolve(o, m);
      let h = false;
      for (let g of [...a, ".git"]) {
        let y = Hio(g);
        let _ = f.split(hx.default.sep);
        let b = _.findIndex(S => Hio(S) === y);
        if (b !== -1) {
          if (g === ".git") {
            let S = _.slice(0, b + 1).join(hx.default.sep);
            if (m.includes(".git/hooks")) {
              l.push(hx.default.join(S, "hooks"));
            } else if (m.includes(".git/config")) {
              l.push(hx.default.join(S, "config"));
            }
          } else {
            l.push(_.slice(0, b + 1).join(hx.default.sep));
          }
          h = true;
          break;
        }
      }
      if (!h) {
        l.push(f);
      }
    }
    return [...new Set(l)];
  }
  function zoa() {
    if (Voa) {
      return;
    }
    process.on("exit", () => {
      FUn({
        force: true
      });
    });
    Voa = true;
  }
  function FUn(e) {
    if (!e?.force) {
      if (POe > 0) {
        POe--;
      }
      if (POe > 0) {
        mo(`[Sandbox Linux] Deferring mount point cleanup \u2014 ${POe} sandbox(es) still active`);
        return;
      }
    } else {
      POe = 0;
    }
    for (let t of LUn) {
      try {
        let n = wg.statSync(t);
        if (n.isFile() && n.size === 0) {
          wg.unlinkSync(t);
          mo(`[Sandbox Linux] Cleaned up bwrap mount point (file): ${t}`);
        } else if (n.isDirectory()) {
          if (wg.readdirSync(t).length === 0) {
            wg.rmdirSync(t);
            mo(`[Sandbox Linux] Cleaned up bwrap mount point (dir): ${t}`);
          }
        }
      } catch {}
    }
    LUn.clear();
  }
  function Koa(e) {
    try {
      wg.accessSync(e, wg.constants.X_OK);
      return true;
    } catch {
      return false;
    }
  }
  function Xoa(e) {
    let {
      seccompConfig: t,
      bwrapPath: n,
      socatPath: r
    } = e ?? {};
    let o = [];
    let s = [];
    if (n) {
      if (!Koa(n)) {
        o.push(`bubblewrap (bwrap) not executable at ${n}`);
      }
    } else if (HSe("bwrap") === null) {
      o.push("bubblewrap (bwrap) not installed");
    }
    if (r) {
      if (!Koa(r)) {
        o.push(`socat not executable at ${r}`);
      }
    } else if (HSe("socat") === null) {
      o.push("socat not installed");
    }
    if (!t?.argv0 && Kio(t?.applyPath) === null) {
      s.push("seccomp not available - unix socket access not restricted");
    }
    return {
      warnings: s,
      errors: o
    };
  }
  async function Qoa(e, t, n) {
    let r = n ?? "socat";
    let o = Joa.randomBytes(8).toString("hex");
    let s = hx.join(NUn.tmpdir(), `claude-http-${o}.sock`);
    let i = hx.join(NUn.tmpdir(), `claude-socks-${o}.sock`);
    let a = [`UNIX-LISTEN:${s},fork,reuseaddr`, `TCP:localhost:${e},keepalive,keepidle=10,keepintvl=5,keepcnt=3`];
    mo(`Starting HTTP bridge: ${r} ${a.join(" ")}`);
    let l = Jio.spawn(r, a, {
      stdio: "ignore"
    });
    if (l.on("error", p => {
      mo(`HTTP bridge process error: ${p}`, {
        level: "error"
      });
    }), l.on("exit", (p, m) => {
      mo(`HTTP bridge process exited with code ${p}, signal ${m}`, {
        level: p === 0 ? "info" : "error"
      });
    }), !l.pid) {
      throw Error("Failed to start HTTP bridge process");
    }
    let c;
    let u;
    if (t === e) {
      c = l;
      u = s;
    } else {
      u = i;
      let p = [`UNIX-LISTEN:${i},fork,reuseaddr`, `TCP:localhost:${t},keepalive,keepidle=10,keepintvl=5,keepcnt=3`];
      if (mo(`Starting SOCKS bridge: ${r} ${p.join(" ")}`), c = Jio.spawn(r, p, {
        stdio: "ignore"
      }), c.on("error", m => {
        mo(`SOCKS bridge process error: ${m}`, {
          level: "error"
        });
      }), c.on("exit", (m, f) => {
        mo(`SOCKS bridge process exited with code ${m}, signal ${f}`, {
          level: m === 0 ? "info" : "error"
        });
      }), !c.pid) {
        if (l.pid) {
          try {
            process.kill(l.pid, "SIGTERM");
          } catch {}
        }
        throw Error("Failed to start SOCKS bridge process");
      }
    }
    let d = 5;
    for (let p = 0; p < d; p++) {
      if (!l.pid || l.killed || !c.pid || c.killed) {
        throw Error("Linux bridge process died unexpectedly");
      }
      try {
        if (wg.existsSync(s) && wg.existsSync(u)) {
          mo(`Linux bridges ready after ${p + 1} attempts`);
          break;
        }
      } catch (m) {
        mo(`Error checking sockets (attempt ${p + 1}): ${m}`, {
          level: "error"
        });
      }
      if (p === d - 1) {
        if (l.pid) {
          try {
            process.kill(l.pid, "SIGTERM");
          } catch {}
        }
        if (c.pid) {
          try {
            process.kill(c.pid, "SIGTERM");
          } catch {}
        }
        throw Error(`Failed to create bridge sockets after ${d} attempts`);
      }
      await new Promise(m => setTimeout(m, p * 100));
    }
    return {
      httpSocketPath: s,
      socksSocketPath: u,
      httpBridgeProcess: l,
      socksBridgeProcess: c,
      httpProxyPort: e,
      socksProxyPort: t
    };
  }
  function gup(e, t) {
    if (t) {
      if (!e) {
        throw Error("seccompConfig.argv0 requires seccompConfig.applyPath");
      }
      return `ARGV0=${yV([t])} ${yV([e])} `;
    }
    let n = Kio(e);
    return n ? `${yV([n])} ` : undefined;
  }
  function yup(e, t, n, r, o, s) {
    let i = o || "bash";
    let a = yV([s ?? "socat"]);
    let l = [`${a} TCP-LISTEN:3128,fork,reuseaddr UNIX-CONNECT:${e} >/dev/null 2>&1 &`, `${a} TCP-LISTEN:1080,fork,reuseaddr UNIX-CONNECT:${t} >/dev/null 2>&1 &`, 'trap "kill %1 %2 2>/dev/null; exit" EXIT'];
    if (r) {
      let c = r + yV([i, "-c", n]);
      let u = [...l, c].join(`
`);
      return `${i} -c ${yV([u])}`;
    } else {
      let c = [...l, `eval ${yV([n])}`].join(`
`);
      return `${i} -c ${yV([c])}`;
    }
  }
  function Yio(e) {
    try {
      if (wg.lstatSync(e).isSymbolicLink()) {
        return wg.realpathSync(e);
      }
    } catch {}
    return e;
  }
  function Yoa(e, t, n, r) {
    let o = t === "/" ? "/" : t + "/";
    e.push("--tmpfs", t);
    for (let s of n) {
      if (s.startsWith(o) || s === t) {
        e.push("--bind", s, s);
        mo(`[Sandbox Linux] Re-bound write path wiped by denyRead tmpfs: ${s}`);
      }
    }
    for (let s of r) {
      if (s.startsWith(o) || s === t) {
        if (!wg.existsSync(s)) {
          mo(`[Sandbox Linux] Skipping non-existent read allow path: ${s}`);
          continue;
        }
        if (n.some(i => (i.startsWith(o) || i === t) && (s === i || s.startsWith(i + "/")))) {
          continue;
        }
        e.push("--ro-bind", s, s);
        mo(`[Sandbox Linux] Re-allowed read access within denied region: ${s}`);
      }
    }
  }
  async function _up(e, t, n, r, o = {
    command: "rg"
  }, s = 3, i = false, a) {
    let l = [];
    let c = [];
    let u = [];
    if (t) {
      l.push("--ro-bind", "/", "/");
      for (let S of t.allowOnly || []) {
        let E = d0(S);
        if (mo(`[Sandbox Linux] Processing write path: ${S} -> ${E}`), E.startsWith("/dev/")) {
          mo(`[Sandbox Linux] Skipping /dev path: ${E}`);
          continue;
        }
        if (!wg.existsSync(E)) {
          mo(`[Sandbox Linux] Skipping non-existent write path: ${E}`);
          continue;
        }
        try {
          let C = wg.realpathSync(E);
          let x = E.replace(/\/+$/, "");
          if (C !== x && AUn(E, C)) {
            mo(`[Sandbox Linux] Skipping symlink write path pointing outside expected location: ${S} -> ${C}`);
            continue;
          }
        } catch {
          mo(`[Sandbox Linux] Skipping write path that could not be resolved: ${E}`);
          continue;
        }
        l.push("--bind", E, E);
        c.push(E);
      }
      let _ = [...(t.denyWithinAllow || []), ...(await hup(o, s, i, a))];
      let b = new Set();
      for (let S of _) {
        let E = d0(S);
        if (b.vZc(E)) {
          continue;
        }
        if (b.add(E), E.startsWith("/dev/")) {
          continue;
        }
        let C = pup(E, c);
        if (C) {
          u.push("--ro-bind", "/dev/null", C);
          mo(`[Sandbox Linux] Mounted /dev/null at symlink ${C} to prevent symlink replacement attack`);
          continue;
        }
        if (!wg.existsSync(E)) {
          if (mup(E)) {
            mo(`[Sandbox Linux] Skipping deny path with file ancestor (cannot create paths under a file): ${E}`);
            continue;
          }
          let A = hx.default.dirname(E);
          while (A !== "/" && !wg.existsSync(A)) {
            A = hx.default.dirname(A);
          }
          if (c.some(I => A.startsWith(I + "/") || A === I || E.startsWith(I + "/"))) {
            let I = fup(E);
            if (I !== E) {
              let O = wg.mkdtempSync(hx.default.join(NUn.tmpdir(), "claude-empty-"));
              u.push("--ro-bind", O, I);
              LUn.add(I);
              zoa();
              mo(`[Sandbox Linux] Mounted empty dir at ${I} to block creation of ${E}`);
            } else {
              u.push("--ro-bind", "/dev/null", I);
              LUn.add(I);
              zoa();
              mo(`[Sandbox Linux] Mounted /dev/null at ${I} to block creation of ${E}`);
            }
          } else {
            mo(`[Sandbox Linux] Skipping non-existent deny path not within allowed paths: ${E}`);
          }
          continue;
        }
        if (c.some(A => E.startsWith(A + "/") || E === A)) {
          u.push("--ro-bind", E, E);
        } else {
          mo(`[Sandbox Linux] Skipping deny path not within allowed paths: ${E}`);
        }
      }
    } else {
      l.push("--bind", "/", "/");
    }
    let d = [];
    let p = (e?.allowWithinDeny || []).map(_ => d0(_));
    let m = new Map();
    let f = [];
    let h = new Set(["proc", "dev", "sys"]);
    for (let _ of e?.denyOnly || []) {
      if (d0(_) === "/") {
        for (let b of wg.readdirSync("/")) {
          if (!h.vZc(b)) {
            d.push("/" + b);
          }
        }
      } else {
        d.push(_);
      }
    }
    if (e && wg.existsSync("/etc/ssh/ssh_config.d")) {
      d.push("/etc/ssh/ssh_config.d");
    }
    let g = d.map(_ => d0(_)).sort((_, b) => _.split("/").length - b.split("/").length);
    for (let _ of g) {
      if (!wg.existsSync(_)) {
        mo(`[Sandbox Linux] Skipping non-existent read deny path: ${_}`);
        continue;
      }
      if (wg.statSync(_).isDirectory()) {
        f.push(_);
        Yoa(l, _, c, p);
      } else {
        if (p.includes(_)) {
          mo(`[Sandbox Linux] Skipping read deny for re-allowed path: ${_}`);
          continue;
        }
        let S = Yio(_);
        l.push("--ro-bind", "/dev/null", S);
        m.set(S, "/dev/null");
        m.set(_, "/dev/null");
      }
    }
    for (let {
      realPath: _,
      fakePath: b
    } of n ?? []) {
      let S = Yio(_);
      l.push("--ro-bind", b, S);
      m.set(S, b);
      m.set(_, b);
    }
    let y = [];
    for (let _ = 0; _ < u.length; _ += 3) {
      let b = u[_ + 2];
      if (m.vZc(b)) {
        continue;
      }
      if (f.some(E => {
        if (!(b === E || b.startsWith(E + "/"))) {
          return false;
        }
        return !c.some(A => (A === E || A.startsWith(E + "/")) && (b === A || b.startsWith(A + "/")));
      })) {
        mo(`[Sandbox Linux] Skipping denyWrite bind already hidden by denyRead tmpfs: ${b}`);
        continue;
      }
      l.push(u[_], u[_ + 1], b);
      y.push(b);
    }
    for (let _ of f) {
      if (y.some(b => _.startsWith(b + "/"))) {
        mo(`[Sandbox Linux] Re-applying denyRead tmpfs re-exposed by denyWrite bind: ${_}`);
        Yoa(l, _, c, p);
      }
    }
    for (let [_, b] of m) {
      if (y.some(S => _.startsWith(S + "/"))) {
        if (Yio(_) !== _) {
          continue;
        }
        mo(`[Sandbox Linux] Re-applying file mask re-exposed by denyWrite bind: ${_}`);
        l.push("--ro-bind", b, _);
      }
    }
    if (r !== undefined) {
      l.push("--ro-bind", r, r);
    }
    return l;
  }
  async function Zoa(e) {
    let {
      command: t,
      needsNetworkRestriction: n,
      httpSocketPath: r,
      socksSocketPath: o,
      httpProxyPort: s,
      socksProxyPort: i,
      proxyAuthToken: a,
      caCertPath: l,
      readConfig: c,
      writeConfig: u,
      unsetEnvVars: d,
      setEnvVars: p,
      maskedFileBinds: m,
      maskedFileStoreDir: f,
      enableWeakerNestedSandbox: h,
      allowAllUnixSockets: g,
      binShell: y,
      ripgrepConfig: _ = {
        command: "rg"
      },
      mandatoryDenySearchDepth: b = Xio,
      allowGitConfig: S = false,
      seccompConfig: E,
      bwrapPath: C,
      socatPath: x,
      abortSignal: A
    } = e;
    let k = c && c.denyOnly.length > 0 || m !== undefined && m.length > 0;
    let I = u !== undefined;
    let O = d !== undefined && d.length > 0 || p !== undefined && Object.keys(p).length > 0;
    if (!n && !k && !I && !O) {
      return t;
    }
    POe++;
    let M = ["--new-session", "--die-with-parent"];
    let L;
    try {
      if (!g) {
        if (L = gup(E?.applyPath, E?.argv0), !L) {
          mo("[Sandbox Linux] apply-seccomp binary not available - unix socket blocking disabled. Install @anthropic-ai/sandbox-runtime globally for full protection.", {
            level: "warn"
          });
        } else {
          mo("[Sandbox Linux] Applying seccomp filter for Unix socket blocking");
        }
      } else {
        mo("[Sandbox Linux] Skipping seccomp filter - allowAllUnixSockets is enabled");
      }
      if (O) {
        for (let W of d ?? []) {
          M.push("--unsetenv", W);
        }
        for (let [W, j] of Object.entries(p ?? {})) {
          M.push("--setenv", W, j);
        }
      }
      if (n) {
        if (M.push("--unshare-net"), r && o) {
          if (!wg.existsSync(r)) {
            throw Error(`Linux HTTP bridge socket does not exist: ${r}. The bridge process may have died. Try reinitializing the sandbox.`);
          }
          if (!wg.existsSync(o)) {
            throw Error(`Linux SOCKS bridge socket does not exist: ${o}. The bridge process may have died. Try reinitializing the sandbox.`);
          }
          if (M.push("--bind", r, r), o !== r) {
            M.push("--bind", o, o);
          }
          let W = Yut(3128, 1080, l, a, u === undefined);
          if (M.push(...W.flatMap(j => {
            let z = j.indexOf("=");
            let V = j.slice(0, z);
            let K = j.slice(z + 1);
            return ["--setenv", V, K];
          })), s !== undefined) {
            M.push("--setenv", "CLAUDE_CODE_HOST_HTTP_PROXY_PORT", String(s));
          }
          if (i !== undefined) {
            M.push("--setenv", "CLAUDE_CODE_HOST_SOCKS_PROXY_PORT", String(i));
          }
        }
      }
      let P = await _up(c, u, m, f, _, b, S, A);
      if (M.push(...P), M.push("--dev", "/dev"), M.push("--unshare-pid"), !h) {
        M.push("--proc", "/proc");
      } else {
        M.push("--unshare-user", "--bind", "/proc", "/proc");
      }
      let F = y || "bash";
      let H = HSe(F);
      if (!H) {
        throw Error(`Shell '${F}' not found in PATH`);
      }
      if (M.push("--", H, "-c"), n && r && o) {
        let W = yup(r, o, t, L, H, x);
        M.push(W);
      } else if (L) {
        let W = L + yV([H, "-c", t]);
        M.push(W);
      } else {
        M.push(t);
      }
      let U = yV([C ?? "bwrap", ...M]);
      let N = [];
      if (n) {
        N.push("network");
      }
      if (k || I) {
        N.push("filesystem");
      }
      if (O) {
        N.push("env");
      }
      if (L) {
        N.push("seccomp(unix-block)");
      }
      mo(`[Sandbox Linux] Wrapped command with bwrap (${N.join(", ")} restrictions)`);
      return U;
    } catch (P) {
      if (POe > 0) {
        POe--;
      }
      throw P;
    }
  }
  var Joa;
  var wg;
  var Jio;
  var NUn;
  var hx;
  var LUn;
  var POe = 0;
  var Voa = false;
  var esa = __lazy(() => {
    kqt();
    $oa();
    BSe();
    Goa();
    Joa = require("crypto");
    wg = __toESM(require("fs"));
    Jio = require("child_process");
    NUn = require("os");
    hx = __toESM(require("path"));
    LUn = new Set();
  });
  function bup(e = false) {
    let t = process.cwd();
    let n = [];
    for (let r of xqt) {
      n.push(jSe.resolve(t, r));
      n.push(`**/${r}`);
    }
    for (let r of IUn()) {
      n.push(jSe.resolve(t, r));
      n.push(`**/${r}/**`);
    }
    if (n.push(jSe.resolve(t, ".git/hooks")), n.push("**/.git/hooks/**"), !e) {
      n.push(jSe.resolve(t, ".git/config"));
      n.push("**/.git/config");
    }
    return [...new Set(n)];
  }
  function Sup(e) {
    return `CMD64_${DUn(e)}_END_${rsa}`;
  }
  function tsa(e) {
    let t = [];
    let n = jSe.dirname(e);
    while (n !== "/" && n !== ".") {
      t.push(n);
      let r = jSe.dirname(n);
      if (r === n) {
        break;
      }
      n = r;
    }
    return t;
  }
  function osa(e, t) {
    let n = [];
    let r = ["file-write-unlink", "file-write-create"];
    for (let o of e) {
      let s = d0(o);
      if (R1(s)) {
        let i = IOe(s);
        for (let l of r) {
          n.push(`(deny ${l}`, `  (regex ${gO(i)})`, `  (with message "${t}"))`);
        }
        let a = s.split(/[*?[\]]/)[0];
        if (a && a !== "/") {
          let l = a.endsWith("/") ? a.slice(0, -1) : jSe.dirname(a);
          for (let c of r) {
            n.push(`(deny ${c}`, `  (literal ${gO(l)})`, `  (with message "${t}"))`);
          }
          for (let c of tsa(l)) {
            for (let u of r) {
              n.push(`(deny ${u}`, `  (literal ${gO(c)})`, `  (with message "${t}"))`);
            }
          }
        }
      } else {
        for (let i of r) {
          n.push(`(deny ${i}`, `  (subpath ${gO(s)})`, `  (with message "${t}"))`);
        }
        for (let i of tsa(s)) {
          for (let a of r) {
            n.push(`(deny ${a}`, `  (literal ${gO(i)})`, `  (with message "${t}"))`);
          }
        }
      }
    }
    return n;
  }
  function Tup(e, t, n) {
    if (!e) {
      return ["(allow file-read*)"];
    }
    let r = [];
    let o = false;
    r.push("(allow file-read*)");
    for (let i of e.denyOnly || []) {
      let a = d0(i);
      if (a === "/") {
        o = true;
      }
      if (R1(a)) {
        let l = IOe(a);
        r.push("(deny file-read*", `  (regex ${gO(l)})`, `  (with message "${t}"))`);
      } else {
        r.push("(deny file-read*", `  (subpath ${gO(a)})`, `  (with message "${t}"))`);
      }
    }
    if (o) {
      r.push('(allow file-read* (literal "/"))');
    }
    let s = [];
    for (let i of e.allowWithinDeny || []) {
      let a = d0(i);
      if (R1(a)) {
        let l = IOe(a);
        r.push("(allow file-read*", `  (regex ${gO(l)})`, `  (with message "${t}"))`);
      } else {
        s.push(a);
        r.push("(allow file-read*", `  (subpath ${gO(a)})`, `  (with message "${t}"))`);
      }
    }
    for (let i of e.denyOnly || []) {
      if (R1(i)) {
        continue;
      }
      let a = d0(i);
      if (s.some(l => a.startsWith(l + "/"))) {
        r.push("(deny file-read*", `  (subpath ${gO(a)})`, `  (with message "${t}"))`);
      }
    }
    if (e.denyOnly.length > 0) {
      r.push("(allow file-read-metadata", "  (vnode-type DIRECTORY))");
    }
    if (r.push(...osa(e.denyOnly || [], t)), n && n.length > 0) {
      for (let i of n) {
        let a = d0(i);
        for (let l of ["file-write-unlink", "file-write-create"]) {
          if (R1(a)) {
            let c = IOe(a);
            r.push(`(allow ${l}`, `  (regex ${gO(c)})`, `  (with message "${t}"))`);
          } else {
            r.push(`(allow ${l}`, `  (subpath ${gO(a)})`, `  (with message "${t}"))`);
          }
        }
      }
    }
    return r;
  }
  function Eup(e, t, n = false) {
    if (!e) {
      return ["(allow file-write*)"];
    }
    let r = [];
    for (let s of e.allowOnly || []) {
      let i = d0(s);
      if (R1(i)) {
        let a = IOe(i);
        r.push("(allow file-write*", `  (regex ${gO(a)})`, `  (with message "${t}"))`);
      } else {
        r.push("(allow file-write*", `  (subpath ${gO(i)})`, `  (with message "${t}"))`);
      }
    }
    let o = [...(e.denyWithinAllow || []), ...bup(n)];
    for (let s of o) {
      let i = d0(s);
      if (R1(i)) {
        let a = IOe(i);
        r.push("(deny file-write*", `  (regex ${gO(a)})`, `  (with message "${t}"))`);
      } else {
        r.push("(deny file-write*", `  (subpath ${gO(i)})`, `  (with message "${t}"))`);
      }
    }
    r.push(...osa(o, t));
    return r;
  }
  function vup({
    readConfig: e,
    writeConfig: t,
    httpProxyPort: n,
    socksProxyPort: r,
    needsNetworkRestriction: o,
    allowUnixSockets: s,
    allowAllUnixSockets: i,
    allowLocalBinding: a,
    allowMachLookup: l,
    allowPty: c,
    allowGitConfig: u = false,
    enableWeakerNetworkIsolation: d = false,
    allowAppleEvents: p = false,
    logTag: m
  }) {
    let f = ["(version 1)", `(deny default (with message "${m}"))`, "", `; LogTag: ${m}`, "", "; Essential permissions - based on Chrome sandbox policy", "; Process permissions", "(allow process-exec)", "(allow process-fork)", "(allow process-info* (target same-sandbox))", "(allow signal (target same-sandbox))", "(allow mach-priv-task-port (target same-sandbox))", "", "; User preferences", "(allow user-preference-read)", "", "; Mach IPC - specific services only (no wildcard)", "(allow mach-lookup", '  (global-name "com.apple.audio.systemsoundserver")', '  (global-name "com.apple.distributed_notifications@Uv3")', '  (global-name "com.apple.FontObjectsServer")', '  (global-name "com.apple.fonts")', '  (global-name "com.apple.logd")', '  (global-name "com.apple.lsd.mapdb")', '  (global-name "com.apple.PowerManagement.control")', '  (global-name "com.apple.system.logger")', '  (global-name "com.apple.system.notification_center")', '  (global-name "com.apple.system.opendirectoryd.libinfo")', '  (global-name "com.apple.system.opendirectoryd.membership")', '  (global-name "com.apple.bsd.dirhelper")', '  (global-name "com.apple.securityd.xpc")', '  (global-name "com.apple.coreservices.launchservicesd")', ")", "", ...(d ? ["; trustd.agent - needed for Go TLS certificate verification (weaker network isolation)", '(allow mach-lookup (global-name "com.apple.trustd.agent"))'] : []), ...(p ? ["; Apple Events - opt-in; needed for open/osascript to talk to other apps (appleeventsd)", "(allow appleevent-send)", '(allow mach-lookup (global-name "com.apple.coreservices.appleevents"))', "; Launch Services open requests need the lsopen operation plus, on", "; macOS 14/15, coreservicesd and the quarantine resolver - without", "; these open fails with -10822 kLSServerCommunicationErr or -54", "(allow lsopen)", '(allow mach-lookup (global-name "com.apple.CoreServices.coreservicesd"))', '(allow mach-lookup (global-name "com.apple.coreservices.quarantine-resolver"))'] : []), ...(l && l.length > 0 ? ["; User-specified XPC/Mach services", ...l.map(g => g.endsWith("*") ? `(allow mach-lookup (global-name-prefix ${gO(g.slice(0, -1))}))` : `(allow mach-lookup (global-name ${gO(g)}))`)] : []), "", "; POSIX IPC - shared memory", "(allow ipc-posix-shm)", "", "; POSIX IPC - semaphores for Python multiprocessing", "(allow ipc-posix-sem)", "", "; IOKit - specific operations only", "(allow iokit-open", '  (iokit-registry-entry-class "IOSurfaceRootUserClient")', '  (iokit-registry-entry-class "RootDomainUserClient")', '  (iokit-user-client-class "IOSurfaceSendRight")', ")", "", "; IOKit properties", "(allow iokit-get-properties)", "", "; Specific safe system-sockets, doesn't allow network access", "(allow system-socket (require-all (socket-domain AF_SYSTEM) (socket-protocol 2)))", "", "; sysctl - specific sysctls only", "(allow sysctl-read", '  (sysctl-name "hw.activecpu")', '  (sysctl-name "hw.busfrequency_compat")', '  (sysctl-name "hw.byteorder")', '  (sysctl-name "hw.cacheconfig")', '  (sysctl-name "hw.cachelinesize_compat")', '  (sysctl-name "hw.cpufamily")', '  (sysctl-name "hw.cpufrequency")', '  (sysctl-name "hw.cpufrequency_compat")', '  (sysctl-name "hw.cputype")', '  (sysctl-name "hw.l1dcachesize_compat")', '  (sysctl-name "hw.l1icachesize_compat")', '  (sysctl-name "hw.l2cachesize_compat")', '  (sysctl-name "hw.l3cachesize_compat")', '  (sysctl-name "hw.logicalcpu")', '  (sysctl-name "hw.logicalcpu_max")', '  (sysctl-name "hw.machine")', '  (sysctl-name "hw.memsize")', '  (sysctl-name "hw.ncpu")', '  (sysctl-name "hw.nperflevels")', '  (sysctl-name "hw.packages")', '  (sysctl-name "hw.pagesize_compat")', '  (sysctl-name "hw.pagesize")', '  (sysctl-name "hw.physicalcpu")', '  (sysctl-name "hw.physicalcpu_max")', '  (sysctl-name "hw.tbfrequency_compat")', '  (sysctl-name "hw.vectorunit")', '  (sysctl-name "kern.argmax")', '  (sysctl-name "kern.bootargs")', '  (sysctl-name "kern.hostname")', '  (sysctl-name "kern.maxfiles")', '  (sysctl-name "kern.maxfilesperproc")', '  (sysctl-name "kern.maxproc")', '  (sysctl-name "kern.ngroups")', '  (sysctl-name "kern.osproductversion")', '  (sysctl-name "kern.osrelease")', '  (sysctl-name "kern.ostype")', '  (sysctl-name "kern.osvariant_status")', '  (sysctl-name "kern.osversion")', '  (sysctl-name "kern.secure_kernel")', '  (sysctl-name "kern.tcsm_available")', '  (sysctl-name "kern.tcsm_enable")', '  (sysctl-name "kern.usrstack64")', '  (sysctl-name "kern.version")', '  (sysctl-name "kern.willshutdown")', '  (sysctl-name "machdep.cpu.brand_string")', '  (sysctl-name "machdep.ptrauth_enabled")', '  (sysctl-name "security.mac.lockdown_mode_state")', '  (sysctl-name "sysctl.proc_cputype")', '  (sysctl-name "vm.loadavg")', '  (sysctl-name-prefix "hw.optional.arm")', '  (sysctl-name-prefix "hw.optional.arm.")', '  (sysctl-name-prefix "hw.optional.armv8_")', '  (sysctl-name-prefix "hw.perflevel")', '  (sysctl-name-prefix "kern.proc.all")', '  (sysctl-name-prefix "kern.proc.pgrp.")', '  (sysctl-name-prefix "kern.proc.pid.")', '  (sysctl-name-prefix "machdep.cpu.")', '  (sysctl-name-prefix "net.routetable.")', ")", "", "; V8 thread calculations", "(allow sysctl-write", '  (sysctl-name "kern.tcsm_enable")', ")", "", "; Distributed notifications", "(allow distributed-notification-post)", "", "; Specific mach-lookup permissions for security operations", '(allow mach-lookup (global-name "com.apple.SecurityServer"))', "", "; File I/O on device files", '(allow file-ioctl (literal "/dev/null"))', '(allow file-ioctl (literal "/dev/zero"))', '(allow file-ioctl (literal "/dev/random"))', '(allow file-ioctl (literal "/dev/urandom"))', '(allow file-ioctl (literal "/dev/dtracehelper"))', '(allow file-ioctl (literal "/dev/tty"))', "", "(allow file-ioctl file-read-data file-write-data", "  (require-all", '    (literal "/dev/null")', "    (vnode-type CHARACTER-DEVICE)", "  )", ")", ""];
    if (f.push("; Network"), !o) {
      f.push("(allow network*)");
    } else {
      if (a) {
        f.push('(allow network-bind (local ip "*:*"))');
        f.push('(allow network-inbound (local ip "*:*"))');
        f.push('(allow network-outbound (remote ip "localhost:*"))');
      }
      if (i) {
        f.push("(allow system-socket (socket-domain AF_UNIX))");
        f.push('(allow network-bind (local unix-socket (path-regex #"^/")))');
        f.push('(allow network-outbound (remote unix-socket (path-regex #"^/")))');
      } else if (s && s.length > 0) {
        f.push("(allow system-socket (socket-domain AF_UNIX))");
        for (let g of s) {
          let y = d0(g);
          f.push(`(allow network-bind (local unix-socket (subpath ${gO(y)})))`);
          f.push(`(allow network-outbound (remote unix-socket (subpath ${gO(y)})))`);
        }
      }
      if (n !== undefined) {
        f.push(`(allow network-bind (local ip "localhost:${n}"))`);
        f.push(`(allow network-inbound (local ip "localhost:${n}"))`);
        f.push(`(allow network-outbound (remote ip "localhost:${n}"))`);
      }
      if (r !== undefined && r !== n) {
        f.push(`(allow network-bind (local ip "localhost:${r}"))`);
        f.push(`(allow network-inbound (local ip "localhost:${r}"))`);
        f.push(`(allow network-outbound (remote ip "localhost:${r}"))`);
      }
    }
    f.push("");
    let h = t?.allowOnly;
    if (f.push("; File read"), f.push(...Tup(e, m, h)), f.push(""), f.push("; File write"), f.push(...Eup(t, m, u)), c) {
      f.push("");
      f.push("; Pseudo-terminal (pty) support");
      f.push("(allow pseudo-tty)");
      f.push("(allow file-ioctl");
      f.push('  (literal "/dev/ptmx")');
      f.push('  (regex #"^/dev/ttys")');
      f.push(")");
      f.push("(allow file-read* file-write*");
      f.push('  (literal "/dev/ptmx")');
      f.push('  (regex #"^/dev/ttys")');
      f.push(")");
    }
    return f.join(`
`);
  }
  function gO(e) {
    return JSON.stringify(e);
  }
  function ssa(e) {
    let {
      command: t,
      needsNetworkRestriction: n,
      httpProxyPort: r,
      socksProxyPort: o,
      proxyAuthToken: s,
      caCertPath: i,
      allowUnixSockets: a,
      allowAllUnixSockets: l,
      allowLocalBinding: c,
      allowMachLookup: u,
      readConfig: d,
      writeConfig: p,
      unsetEnvVars: m,
      setEnvVars: f,
      maskedFileBinds: h,
      allowPty: g,
      allowGitConfig: y = false,
      enableWeakerNetworkIsolation: _ = false,
      allowAppleEvents: b = false,
      binShell: S
    } = e;
    let E = d;
    if (h && h.length > 0) {
      mo("[Sandbox macOS] file mask degrades to deny on macOS until the interposer lands");
      E = {
        denyOnly: [...(d?.denyOnly ?? []), ...h.map(U => U.realPath)],
        allowWithinDeny: d?.allowWithinDeny
      };
    }
    let C = E && E.denyOnly.length > 0;
    let x = p !== undefined;
    let A = m !== undefined && m.length > 0 || f !== undefined && Object.keys(f).length > 0;
    if (!n && !C && !x && !A) {
      return t;
    }
    let k = Sup(t);
    let I = vup({
      readConfig: E,
      writeConfig: p,
      httpProxyPort: r,
      socksProxyPort: o,
      needsNetworkRestriction: n,
      allowUnixSockets: a,
      allowAllUnixSockets: l,
      allowLocalBinding: c,
      allowMachLookup: u,
      allowPty: g,
      allowGitConfig: y,
      enableWeakerNetworkIsolation: _,
      allowAppleEvents: b,
      logTag: k
    });
    let O = Yut(r, o, i, s, p === undefined);
    if (c && n) {
      let W = (m ?? []).includes("JAVA_TOOL_OPTIONS") ? "" : process.env.JAVA_TOOL_OPTIONS ?? "";
      let j = W.includes("-Djava.net.preferIPv4Stack=true") ? W : [W, "-Djava.net.preferIPv4Stack=true"].filter(Boolean).join(" ");
      O.push(`JAVA_TOOL_OPTIONS=${j}`);
    }
    let M = S || "bash";
    let L = HSe(M);
    if (!L) {
      throw Error(`Shell '${M}' not found in PATH`);
    }
    let P = (m ?? []).flatMap(U => ["-u", U]);
    let F = Object.entries(f ?? {}).map(([U, N]) => `${U}=${N}`);
    let H = yV(["env", ...P, ...F, ...O, "/usr/bin/sandbox-exec", "-p", I, L, "-c", t]);
    mo(`[Sandbox macOS] Applied restrictions - network: ${!!(r || o)}, read: ${E ? "allowAllExcept" in E ? "allowAllExcept" : "denyAllExcept" : "none"}, write: ${p ? "allowAllExcept" in p ? "allowAllExcept" : "denyAllExcept" : "none"}`);
    return H;
  }
  function isa(e, t) {
    let n = /CMD64_(.+?)_END/;
    let r = /Sandbox:\s+(.+)$/;
    let o = t?.["*"] || [];
    let s = t ? Object.entries(t).filter(([a]) => a !== "*") : [];
    let i = nsa.spawn("log", ["stream", "--predicate", `(eventMessage ENDSWITH "${rsa}")`, "--style", "compact"]);
    i.stdout?.on("data", a => {
      let l = a.toString().split(`
`);
      let c = l.find(h => h.includes("Sandbox:") && h.includes("deny"));
      let u = l.find(h => h.startsWith("CMD64_"));
      if (!c) {
        return;
      }
      let d = c.match(r);
      if (!d?.[1]) {
        return;
      }
      let p = d[1];
      let m;
      let f;
      if (u) {
        if (f = u.match(n)?.[1], f) {
          try {
            m = woa(f);
          } catch {}
        }
      }
      if (p.includes("mDNSResponder") || p.includes("mach-lookup com.apple.diagnosticd") || p.includes("mach-lookup com.apple.analyticsd")) {
        return;
      }
      if (t && m) {
        if (o.length > 0) {
          if (o.some(g => p.includes(g))) {
            return;
          }
        }
        for (let [h, g] of s) {
          if (m.includes(h)) {
            if (g.some(_ => p.includes(_))) {
              return;
            }
          }
        }
      }
      e({
        line: p,
        command: m,
        encodedCommand: f,
        timestamp: new Date()
      });
    });
    i.stderr?.on("data", a => {
      mo(`[Sandbox Monitor] Log stream stderr: ${a.toString()}`);
    });
    i.on("error", a => {
      mo(`[Sandbox Monitor] Failed to start log stream: ${a.message}`);
    });
    i.on("exit", a => {
      mo(`[Sandbox Monitor] Log stream exited with code: ${a}`);
    });
    return () => {
      mo("[Sandbox Monitor] Stopping log monitor");
      i.kill("SIGTERM");
    };
  }
  var nsa;
  var jSe;
  var rsa;
  var asa = __lazy(() => {
    kqt();
    BSe();
    nsa = require("child_process");
    jSe = __toESM(require("path"));
    rsa = `_${Math.random().toString(36).slice(2, 11)}_SBX`;
  });
  function psa(e) {
    if (e === undefined) {
      return {
        kind: "cmd"
      };
    }
    let t = _V.win32.basename(e).toLowerCase();
    if (t === "bash" || t === "bash.exe" || t === "sh" || t === "sh.exe") {
      if (!_V.win32.isAbsolute(e)) {
        throw Error(`binShell bash path must be absolute (got ${JSON.stringify(e)}); pass the resolved Git Bash install path`);
      }
      return {
        kind: "bash",
        path: e
      };
    }
    switch (e.toLowerCase()) {
      case "pwsh":
      case "pwsh.exe":
        return {
          kind: "pwsh"
        };
      case "powershell":
      case "powershell.exe":
        return {
          kind: "powershell"
        };
      case "cmd":
      case "cmd.exe":
        return {
          kind: "cmd"
        };
      default:
        throw Error(`unrecognised binShell ${JSON.stringify(e)}: expected 'cmd' | 'powershell' | 'pwsh' or an absolute path to bash.exe/sh.exe`);
    }
  }
  function wup() {
    let e = _V.dirname(usa.fileURLToPath("file:///home/runner/work/claude-cli-internal/claude-cli-internal/node_modules/@anthropic-ai/sandbox-runtime/dist/sandbox/windows-sandbox-utils.js"));
    return _V.resolve(e, "..", "..");
  }
  function Qio() {
    let e = process.env.SRT_WIN_PATH;
    if (e && Aqt.existsSync(e)) {
      return e;
    }
    let t = wup();
    let n = Cup.arm64;
    let r = [];
    if (n) {
      r.push(_V.join(t, "vendor", "srt-win", n, "srt-win.exe"));
    }
    r.push(_V.join(t, "vendor", "srt-win-src", "target", "release", "srt-win.exe"), _V.join(t, "vendor", "srt-win", "target", "release", "srt-win.exe"));
    for (let o of r) {
      if (Aqt.existsSync(o)) {
        return o;
      }
    }
    throw Error(`srt-win.exe not found. Set SRT_WIN_PATH or build with \`cargo build --release --manifest-path vendor/srt-win-src/Cargo.toml\`. Looked in: ${[e, ...r].filter(Boolean).join(", ")}`);
  }
  function BUn(e) {
    if (e.groupSid) {
      return ["--group-sid", e.groupSid];
    }
    return ["--name", e.groupName ?? "sandbox-runtime-net"];
  }
  function msa(e, t, n = 15000) {
    let r = Qio();
    let o = csa.spawnSync(r, e, {
      encoding: "utf8",
      timeout: n,
      ...(t !== undefined && {
        input: t
      })
    });
    if (o.error) {
      throw Error(`srt-win ${e[0]}: spawn failed: ${o.error.message}`);
    }
    return {
      status: o.status,
      stdout: (o.stdout ?? "").trim(),
      stderr: (o.stderr ?? "").trim()
    };
  }
  function $Un(e, t) {
    let n = msa(e, undefined, t?.timeoutMs);
    let r;
    let o;
    try {
      r = JSON.parse(n.stdout);
    } catch (s) {
      o = s.message;
    }
    if (t?.allowNonZero && r !== undefined) {
      return {
        ok: n.status === 0,
        json: r,
        stderr: n.stderr
      };
    }
    if (n.status !== 0) {
      throw Error(`srt-win ${e.join(" ")} exited ${n.status}: ${n.stderr || n.stdout}`);
    }
    if (r !== undefined) {
      return r;
    }
    throw Error(`srt-win ${e.join(" ")}: unparseable JSON output ${JSON.stringify(n.stdout)}: ${o}`);
  }
  function Rup(e) {
    return $Un(["group", "status", ...BUn(e)]);
  }
  function xup(e = {}) {
    let t = ["wfp", "status"];
    if (e.sublayerGuid) {
      t.push("--sublayer-guid", e.sublayerGuid);
    }
    let n = $Un(t);
    return {
      state: n.state,
      filters: n.filters,
      ...(n.port_range && {
        portRange: n.port_range
      }),
      userFilters: n.user_filters ?? 0,
      ...(n.user_sid && {
        userSid: n.user_sid
      })
    };
  }
  function Zio() {
    let e = $Un(["user", "status"]);
    return {
      provisioned: e.user.exists,
      ...(e.user.sid && {
        sid: e.user.sid
      }),
      groupExists: e.user.group_exists,
      ...(e.user.group_sid && {
        groupSid: e.user.group_sid
      }),
      inBuiltinUsers: e.user.in_builtin_users,
      inSandboxGroup: e.user.in_sandbox_group,
      hiddenFromLogon: e.user.hidden_from_logon,
      credPresent: e.cred_present,
      ...(typeof e.marker_version === "number" && {
        markerVersion: e.marker_version
      }),
      ...(e.ca_cert_thumb && {
        caCertThumb: e.ca_cert_thumb
      }),
      ...(e.ca_cert_pem && {
        caCertPem: e.ca_cert_pem
      })
    };
  }
  function fsa(e) {
    let t = e ?? Zio();
    if (!t.caCertThumb || !t.caCertPem) {
      return null;
    }
    return {
      pem: t.caCertPem,
      thumb: t.caCertThumb
    };
  }
  function eao(e) {
    let t = new Set();
    for (let n of e) {
      let r = d0(n);
      let o = PUn(r) ? VGe(r, {
        caseInsensitive: true
      }) : [r];
      for (let s of o) {
        let i = Aqt.statSync(s, {
          throwIfNoEntry: false
        });
        if (!i) {
          continue;
        }
        if (i.isDirectory()) {
          throw Error(`Windows fs deny requires explicit file paths; ${JSON.stringify(n)} resolved to directory ${JSON.stringify(s)}. Directory targets are not supported.`);
        }
        t.add(s);
      }
    }
    return [...t];
  }
  function hsa(e) {
    let t = e.holderPid ?? process.pid;
    let n = JSON.stringify({
      denyRead: e.denyRead,
      denyWrite: e.denyWrite
    });
    let r = msa(["acl", "stamp", ...BUn(e.group), "--holder-pid", `${t}`], n, 60000);
    if (mo(`[Sandbox Windows] acl stamp exit=${r.status}: ${r.stderr || r.stdout}`), r.status !== 0) {
      throw Error(`srt-win acl stamp exited ${r.status} ` + (r.status === 2 ? "(partial \u2014 some inputs skipped)" : "(failed)") + `: ${r.stderr || r.stdout}`);
    }
  }
  function tao(e) {
    let t = e.holderPid ?? process.pid;
    let n = ["acl", "restore", ...BUn(e.group), "--holder-pid", `${t}`, "--json"];
    try {
      let r = $Un(n, {
        timeoutMs: 60000,
        allowNonZero: true
      });
      if (!r.ok) {
        mo(`[Sandbox Windows] acl restore exited non-zero (per-path outcomes preserved): ${r.stderr}`, {
          level: "error"
        });
      }
      return r.json;
    } catch (r) {
      mo(`[Sandbox Windows] acl restore: ${r.message}`, {
        level: "error"
      });
      return;
    }
  }
  function _sa(e) {
    let t = Qio();
    if (e.asSandboxUser && e.caCertPath !== undefined) {
      mo(`[Sandbox Windows] caCertPath '${e.caCertPath}' not forwarded under asSandboxUser (broker %TEMP% is unreadable by srt-sandbox); schannel trust via 'srt-win user trust-ca' is the only CA-trust path for the two-hop launch`);
    }
    let n = kup(Yut(e.httpProxyPort, e.socksProxyPort, e.asSandboxUser ? undefined : e.caCertPath, e.proxyAuthToken));
    delete n.TMPDIR;
    let r = [t, "exec", ...BUn(e.group)];
    if (e.sublayerGuid) {
      r.push("--sublayer-guid", e.sublayerGuid);
    }
    if (e.holderPid !== undefined) {
      r.push("--holder-pid", `${e.holderPid}`);
    }
    for (let u of e.denyRead ?? []) {
      r.push("--deny-read", u);
    }
    for (let u of e.denyWrite ?? []) {
      r.push("--deny-write", u);
    }
    if (e.asSandboxUser) {
      r.push("--as-sandbox-user");
      let u = {
        PATH: process.env.PATH,
        PATHEXT: process.env.PATHEXT,
        ...n
      };
      for (let [d, p] of Object.entries(u)) {
        if (p !== undefined) {
          r.push("--env", `${d}=${p}`);
        }
      }
    }
    r.push("--");
    let o = process.env.SystemRoot ?? "C:\\Windows";
    let s = e.binShell ?? {
      kind: "cmd"
    };
    switch (s.kind) {
      case "bash":
        r.push(s.path, "-c", e.command);
        break;
      case "pwsh":
        r.push("pwsh.exe", "-NoProfile", "-Command", e.command);
        break;
      case "powershell":
        r.push(_V.join(o, "System32", "WindowsPowerShell", "v1.0", "powershell.exe"), "-NoProfile", "-Command", e.command);
        break;
      case "cmd":
        r.push(_V.join(o, "System32", "cmd.exe"), "/d", "/s", "/c", e.command);
        break;
    }
    let i = r.reduce((u, d) => u + d.length + 3, 0);
    if (i > 30000) {
      let u = (e.denyRead?.length ?? 0) + (e.denyWrite?.length ?? 0);
      throw Error(`Windows sandbox argv is ~${i} chars (CreateProcessW limit is 32 767). ${u} per-exec ` + "file-deny path(s) ride on this argv \u2014 move broad globs to " + "the session-level filesystem.denyRead/denyWrite (passed to SandboxManager.initialize(), stdin-passed to `acl stamp`) instead, or shorten the command.");
    }
    let a = {
      ...process.env
    };
    let l = new Set((e.unsetEnvVars ?? []).map(u => u.toUpperCase()));
    for (let u of Object.keys(a)) {
      if (l.vZc(u.toUpperCase())) {
        delete a[u];
      }
    }
    Object.assign(a, e.setEnvVars ?? {});
    let c = {
      ...a,
      ...n
    };
    return {
      argv: r,
      env: c
    };
  }
  function kup(e) {
    let t = {};
    for (let n of e) {
      let r = n.indexOf("=");
      if (r === -1) {
        continue;
      }
      t[n.slice(0, r)] = n.slice(r + 1);
    }
    return t;
  }
  function lsa(e, t, n) {
    if (n === "created-not-on-token") {
      return "The discriminator group exists but is not yet in this session's token. LOG OUT and back in to pick up the new group membership (it enters TokenGroups at logon). Network is not disrupted " + "meanwhile \u2014 WFP filter-0 PERMITs traffic while the group is absent " + "from your token.";
    }
    let r = e.groupSid ? `--group-sid ${e.groupSid}` : `--name ${e.groupName ?? "sandbox-runtime-net"}`;
    let o = t ? ` --sublayer-guid ${t}` : "";
    return `Windows sandbox needs a one-time install (one UAC prompt):
  npx sandbox-runtime windows-install
` + "  \u2014 or call installWindowsSandbox(), or run " + `\`srt-win.exe install ${r}${o}\` directly \u2014
` + `then LOG OUT and back in (the group SID enters TokenGroups at logon).
Network is not disrupted before the logout: while the group is absent from your token, WFP filter-0 PERMITs all traffic.`;
  }
  function bsa(e, t) {
    let n = [];
    let r = [];
    let o;
    try {
      o = Qio();
    } catch (a) {
      return {
        errors: [a.message],
        warnings: r
      };
    }
    mo(`[Sandbox Windows] using srt-win at ${o}`);
    let s;
    try {
      s = Rup(e);
    } catch (a) {
      n.push(`srt-win group status failed: ${a.message}`);
      return {
        errors: n,
        warnings: r
      };
    }
    if (s.state !== "ready") {
      n.push(`Discriminator group is ${s.state}` + (s.sid ? ` (sid=${s.sid})` : "") + ". " + lsa(e, t, s.state));
    }
    if (s.warning) {
      r.push(s.warning);
    }
    let i;
    try {
      i = xup({
        sublayerGuid: t
      });
    } catch (a) {
      n.push(`srt-win wfp status failed: ${a.message}`);
      return {
        errors: n,
        warnings: r
      };
    }
    if (i.state !== "installed") {
      if (s.state === "ready") {
        n.push(`WFP filters not installed under sublayer ${t ?? "(default)"}. ` + lsa(e, t, "absent"));
      }
    } else if (i.portRange) {
      mo(`[Sandbox Windows] WFP installed: ${i.filters} filters, proxy port range ${i.portRange[0]}-${i.portRange[1]}`);
    }
    return {
      errors: n,
      warnings: r
    };
  }
  var Aqt;
  var _V;
  var csa;
  var usa;
  var dsa;
  var Cup;
  var gsa;
  var ysa;
  var Ssa = __lazy(() => {
    BSe();
    BSe();
    Aqt = __toESM(require("fs"));
    _V = __toESM(require("path"));
    csa = require("child_process");
    usa = require("url");
    dsa = [60080, 60089];
    Cup = {
      x64: "x64",
      arm64: "arm64"
    };
    gsa = new Set(["restored"]);
    ysa = new Set(["restored", "alreadyOriginal", "stillHeld"]);
  });
  class SandboxViolationStore {
    constructor() {
      this.violations = [];
      this.totalCount = 0;
      this.maxSize = 100;
      this.listeners = new Set();
    }
    addViolation(e) {
      if (this.violations.push(e), this.totalCount++, this.violations.length > this.maxSize) {
        this.violations = this.violations.slice(-this.maxSize);
      }
      this.notifyListeners();
    }
    getViolations(e) {
      if (e === undefined) {
        return [...this.violations];
      }
      return this.violations.slice(-e);
    }
    getCount() {
      return this.violations.length;
    }
    getTotalCount() {
      return this.totalCount;
    }
    getViolationsForCommand(e) {
      let t = DUn(e);
      return this.violations.filter(n => n.encodedCommand === t);
    }
    clear() {
      this.violations = [];
      this.notifyListeners();
    }
    subscribe(e) {
      this.listeners.add(e);
      e(this.getViolations());
      return () => {
        this.listeners.delete(e);
      };
    }
    notifyListeners() {
      let e = this.getViolations();
      this.listeners.forEach(t => t(e));
    }
  }
  var nao = __lazy(() => {
    BSe();
  });
  function zGe(e, t) {
    let n = e.toLowerCase();
    if (t === "*") {
      return true;
    }
    if (t.startsWith("*.")) {
      if (Tsa.isIP(Wre(n))) {
        return false;
      }
      let r = t.substring(2).toLowerCase();
      return n.endsWith("." + r);
    }
    return n === t.toLowerCase();
  }
  var Tsa;
  var Esa = __lazy(() => {
    Kut();
    Tsa = require("net");
  });
  function Aup() {
    if (vsa) {
      return;
    }
    let e = () => uao().catch(t => {
      mo(`Cleanup failed in registerCleanup ${t}`, {
        level: "error"
      });
    });
    process.once("exit", e);
    process.once("SIGINT", e);
    process.once("SIGTERM", e);
    vsa = true;
  }
  async function wsa(e, t, n) {
    if (!ea) {
      mo("No config available, denying network request");
      return false;
    }
    if (!Cqt(t)) {
      mo(`Denying malformed host: ${JSON.stringify(t)}:${e}`, {
        level: "error"
      });
      return false;
    }
    let r = Lio(t) ?? t;
    for (let o of ea.network.deniedDomains) {
      if (zGe(r, o)) {
        mo(`Denied by config rule: ${t}:${e}`);
        return false;
      }
    }
    for (let o of ea.network.allowedDomains) {
      if (zGe(r, o)) {
        mo(`Allowed by config rule: ${t}:${e}`);
        return true;
      }
    }
    if (!n || ea.network.strictAllowlist) {
      mo(`No matching config rule, denying: ${t}:${e}`);
      return false;
    }
    mo(`No matching config rule, asking user: ${t}:${e}`);
    try {
      if (await n({
        host: t,
        port: e
      })) {
        mo(`User allowed: ${t}:${e}`);
        return true;
      } else {
        mo(`User denied: ${t}:${e}`);
        return false;
      }
    } catch (o) {
      mo(`Error in permission callback: ${o}`, {
        level: "error"
      });
      return false;
    }
  }
  function Iup() {
    if (!ea?.credentials) {
      return;
    }
    return (e, t) => {
      Qut.substituteInHeaders(e, t, zGe);
    };
  }
  function Pup(e) {
    if (!ea?.network.mitmProxy) {
      return;
    }
    let {
      socketPath: t,
      domains: n
    } = ea.network.mitmProxy;
    for (let r of n) {
      if (zGe(e, r)) {
        mo(`Host ${e} matches MITM pattern ${r}`);
        return t;
      }
    }
    return;
  }
  function Oup(e) {
    let t = ea?.network.tlsTerminate?.excludeDomains;
    if (!t?.length) {
      return true;
    }
    let n = Lio(e) ?? e;
    for (let r of t) {
      if (!zGe(n, r)) {
        continue;
      }
      mo(`Host ${e} matches tlsTerminate.excludeDomains pattern ${r}; skipping TLS termination`);
      let o = Qut.namesInjectableAt(n, zGe);
      if (o.length > 0) {
        mo(`tlsTerminate.excludeDomains: masked credential(s) ${o.join(", ")} are configured for injection at ${e}, but its connections are not terminated, so the upstream will receive the placeholder`, {
          level: "error"
        });
      }
      return false;
    }
    return true;
  }
  async function Dup(e, t) {
    let n = Iup();
    Pqt = ooa({
      filter: (i, a) => wsa(i, a, e),
      getMitmSocketPath: Pup,
      mitmCA: s$,
      shouldTerminateTLS: Oup,
      filterRequest: ea?.network.filterRequest,
      mutateHeaders: n,
      mutateHeadersPlaintext: ea?.credentials?.allowPlaintextInject ? n : undefined,
      parentProxy: DOe,
      proxyAuthToken: MOe
    });
    Oqt = poa({
      filter: (i, a) => wsa(i, a, e),
      parentProxy: DOe,
      proxyAuthToken: MOe
    });
    Dqt = _oa({
      httpServer: Pqt,
      handleSocksConnection: i => Oqt.handleConnection(i),
      httpBackendPortRange: t
    });
    let r = Dqt;
    let o = await r.listenHttpBackend();
    await xUn(r.server, i => r.server.listen(i, "127.0.0.1"), t, o !== undefined ? new Set([o]) : new Set());
    let s = r.getPort();
    if (s === undefined) {
      throw Error("Failed to get mux proxy server port");
    }
    r.unref();
    mo(`Mux proxy (HTTP+SOCKS) listening on localhost:${s}`);
    return s;
  }
  async function Mup(e, t, n = false) {
    if (OOe) {
      await OOe;
      return;
    }
    if (ea = e, DOe = Oio(e.network.parentProxy), DOe) {
      mo(`Parent proxy configured: http=${Nio(DOe.httpUrl)} https=${Nio(DOe.httpsUrl)}`);
    }
    if (e.network.tlsTerminate && e.network.mitmProxy) {
      throw Error("network.tlsTerminate and network.mitmProxy are mutually exclusive");
    }
    s$ = e.network.tlsTerminate ? Doa(e.network.tlsTerminate) : undefined;
    let r = Asa();
    if (r.errors.length > 0) {
      throw Error(`Sandbox dependencies not available: ${r.errors.join(", ")}`);
    }
    if (n && bw() === "macos") {
      jUn = isa(WUn.addViolation.bind(WUn), ea.ignoreViolations);
      mo("Started macOS sandbox log monitor");
    }
    if (Aup(), bw() === "windows") {
      if (e.windows?.asSandboxUser) {
        let o = Zio();
        if (!o.provisioned || !o.credPresent) {
          throw ea = undefined, Error(`windows.asSandboxUser is set but the sandbox user is not provisioned (user=${o.provisioned}, cred=${o.credPresent}). Run \`npx sandbox-runtime windows-install\` (one UAC prompt) to provision it.`);
        }
        if (e.network.tlsTerminate && s$) {
          let s = fsa(o);
          let i = new VUn.X509Certificate(s$.certPem).fingerprint.replace(/:/g, "").toUpperCase();
          if (!s) {
            throw ea = undefined, Error(`tlsTerminate with windows.asSandboxUser requires the sandbox to be installed with this CA (thumb=${i}): run \`srt-win user trust-ca ${s$.certPath}\`. Per-exec installs into the sandbox user's Root store are not supported.`);
          }
          if (s.thumb !== i) {
            throw ea = undefined, Error(`tlsTerminate with windows.asSandboxUser: the sandbox's installed CA (thumb=${s.thumb}) doesn't match this session's CA (thumb=${i}). Run \`srt-win user trust-ca ${s$.certPath}\` to update it.`);
          }
        }
      }
      try {
        let o = Uup(e);
        if (o.denyRead.length > 0 || o.denyWrite.length > 0) {
          let s = Mqt();
          hsa({
            group: s,
            denyRead: o.denyRead,
            denyWrite: o.denyWrite
          });
          Xut = o;
          sao = s;
          mo(`[Sandbox Windows] file deny stamped: ${o.denyRead.length} denyRead, ${o.denyWrite.length} denyWrite`);
        }
        qUn = Psa(e);
      } catch (o) {
        throw tao({
          group: Mqt()
        }), ea = undefined, o;
      }
    }
    OOe = (async () => {
      try {
        let o = bw() === "windows" ? ea.windows?.proxyPortRange ?? dsa : undefined;
        MOe = ea.network.httpProxyPort !== undefined ? undefined : VUn.randomBytes(16).toString("hex");
        let i = ea.network.httpProxyPort === undefined || ea.network.socksProxyPort === undefined ? await Dup(t, o) : undefined;
        let a = ea.network.httpProxyPort ?? i;
        let l = ea.network.socksProxyPort ?? i;
        if (ea.network.httpProxyPort !== undefined) {
          mo(`Using external HTTP proxy on port ${a}`);
        }
        if (ea.network.socksProxyPort !== undefined) {
          mo(`Using external SOCKS proxy on port ${l}`);
        }
        let c;
        if (bw() === "linux") {
          c = await Qoa(a, l, ea.socatPath);
        }
        let u = {
          httpProxyPort: a,
          socksProxyPort: l,
          linuxBridge: c
        };
        hX = u;
        mo("Network infrastructure initialized");
        return u;
      } catch (o) {
        throw OOe = undefined, hX = undefined, uao().catch(s => {
          mo(`Cleanup failed in initializationPromise ${s}`, {
            level: "error"
          });
        }), o;
      }
    })();
    await OOe;
  }
  function ksa() {
    let e = bw();
    if (e === "linux") {
      return hoa() !== "1";
    }
    return e === "macos" || e === "windows";
  }
  function Mqt() {
    return {
      groupName: ea?.windows?.groupName ?? "sandbox-runtime-net",
      groupSid: ea?.windows?.groupSid
    };
  }
  function Nup() {
    return ea !== undefined;
  }
  function Asa(e) {
    if (!ksa()) {
      return {
        errors: ["Unsupported platform"],
        warnings: []
      };
    }
    let t = [];
    let n = [];
    let r = bw();
    if (r === "linux") {
      let o = e ?? ea?.ripgrep ?? {
        command: "rg"
      };
      if (HSe(o.command) === null) {
        t.push(`ripgrep (${o.command}) not found`);
      }
      let s = Xoa({
        seccompConfig: ea?.seccomp,
        bwrapPath: ea?.bwrapPath,
        socatPath: ea?.socatPath
      });
      t.push(...s.errors);
      n.push(...s.warnings);
    } else if (r === "windows") {
      let o = bsa(Mqt(), ea?.windows?.wfpSublayerGuid);
      t.push(...o.errors);
      n.push(...o.warnings);
    }
    return {
      errors: t,
      warnings: n
    };
  }
  function iao(e, t) {
    if (!e) {
      return {
        denyReadPaths: [],
        unsetEnvVars: [],
        setEnvVars: {},
        maskedFileBinds: [],
        maskedFileStoreDir: undefined
      };
    }
    let n = zUn(e);
    let r = [];
    let o = {};
    for (let a of e.envVars ?? []) {
      if (a.mode === "deny") {
        r.push(a.name);
      } else if (a.mode === "mask") {
        let l = process.env[a.name];
        if (l === undefined) {
          continue;
        }
        let c = a.injectHosts ?? t ?? [];
        o[a.name] = Qut.register(a.name, l, c);
      }
    }
    let s = e.files ?? [];
    let i = Roa(s, t ?? [], Qut, GUn);
    return {
      denyReadPaths: n,
      unsetEnvVars: [...new Set(r)],
      setEnvVars: o,
      maskedFileBinds: i,
      maskedFileStoreDir: GUn.dirPath
    };
  }
  function zUn(e) {
    let t = e?.files ?? [];
    return [...new Set(t.filter(n => n.mode === "deny").map(n => n.path))];
  }
  function rao(e, t) {
    if (e.length !== t.length) {
      return false;
    }
    let n = new Set(t);
    return e.every(r => n.vZc(r));
  }
  function Isa(e, t) {
    return [...new Set([...e, ...t.denyReadPaths])];
  }
  function Lup() {
    if (!ea || ea.filesystem.disabled) {
      return {
        denyOnly: [],
        allowWithinDeny: []
      };
    }
    let e = Isa(ea.filesystem.denyRead, iao(ea.credentials, ea.network.allowedDomains));
    let t = [];
    for (let r of e) {
      let o = CG(r);
      if (bw() === "linux" && R1(o)) {
        let s = VGe(r);
        mo(`[Sandbox] Expanded glob pattern "${r}" to ${s.length} paths on Linux`);
        t.push(...s);
      } else {
        t.push(o);
      }
    }
    let n = [];
    for (let r of ea.filesystem.allowRead ?? []) {
      let o = CG(r);
      if (bw() === "linux" && R1(o)) {
        let s = VGe(r);
        mo(`[Sandbox] Expanded allowRead glob pattern "${r}" to ${s.length} paths on Linux`);
        n.push(...s);
      } else {
        n.push(o);
      }
    }
    return {
      denyOnly: t,
      allowWithinDeny: n
    };
  }
  function Fup() {
    if (!ea) {
      return {
        allowOnly: OUn(),
        denyWithinAllow: []
      };
    }
    if (ea.filesystem.disabled) {
      return {
        allowOnly: ["/"],
        denyWithinAllow: []
      };
    }
    let e = ea.filesystem.allowWrite.map(r => CG(r)).filter(r => {
      if (bw() === "linux" && R1(r)) {
        mo(`Skipping glob pattern on Linux/WSL: ${r}`);
        return false;
      }
      return true;
    });
    let t = ea.filesystem.denyWrite.map(r => CG(r)).filter(r => {
      if (bw() === "linux" && R1(r)) {
        mo(`Skipping glob pattern on Linux/WSL: ${r}`);
        return false;
      }
      return true;
    });
    return {
      allowOnly: [...OUn(), ...e],
      denyWithinAllow: t
    };
  }
  function Uup(e) {
    let t = e.filesystem;
    if (t?.disabled) {
      return {
        denyRead: [],
        denyWrite: []
      };
    }
    if (t?.allowRead?.length) {
      throw Error("filesystem.allowRead (re-allow within denyRead) is not supported on Windows. Remove the entries or narrow filesystem.denyRead to exclude them.");
    }
    if (t?.allowWrite?.length) {
      throw Error("filesystem.allowWrite is not supported on Windows \u2014 the Windows " + "sandbox is deny-listed only (the child writes wherever the host user can, minus filesystem.denyWrite). Remove the allowWrite entries.");
    }
    let n = eao([...new Set([...(t?.denyRead ?? []), ...zUn(e.credentials)])]);
    let r = eao(t?.denyWrite ?? []);
    return {
      denyRead: n,
      denyWrite: r
    };
  }
  function Psa(e) {
    return {
      disabled: e.filesystem.disabled ?? false,
      denyRead: [...e.filesystem.denyRead],
      denyWrite: [...e.filesystem.denyWrite],
      credFiles: zUn(e.credentials)
    };
  }
  function Bup(e, t) {
    return e.disabled === t.disabled && rao(e.denyRead, t.denyRead) && rao(e.denyWrite, t.denyWrite) && rao(e.credFiles, t.credFiles);
  }
  function $up(e) {
    return qUn !== undefined && Bup(qUn, Psa(e));
  }
  function Hup() {
    if (!ea) {
      return {};
    }
    let e = ea.network.allowedDomains;
    let t = ea.network.deniedDomains;
    return {
      allowedHosts: e,
      ...(t.length > 0 && {
        deniedHosts: t
      })
    };
  }
  function Osa() {
    return ea?.network?.allowUnixSockets;
  }
  function Csa() {
    return ea?.network?.allowAllUnixSockets;
  }
  function Dsa() {
    return ea?.network?.allowLocalBinding;
  }
  function Msa() {
    return ea?.network?.allowMachLookup;
  }
  function Nsa() {
    return ea?.ignoreViolations;
  }
  function Lsa() {
    return ea?.enableWeakerNestedSandbox;
  }
  function jup() {
    return ea?.enableWeakerNetworkIsolation;
  }
  function qup() {
    return ea?.allowAppleEvents;
  }
  function Wup() {
    return ea?.ripgrep ?? {
      command: "rg"
    };
  }
  function Gup() {
    return ea?.mandatoryDenySearchDepth ?? 3;
  }
  function Rsa() {
    return ea?.filesystem?.allowGitConfig ?? false;
  }
  function Vup() {
    return ea?.seccomp;
  }
  function zup() {
    return MOe;
  }
  function aao() {
    return hX?.httpProxyPort;
  }
  function lao() {
    return hX?.socksProxyPort;
  }
  function Fsa() {
    return hX?.linuxBridge?.httpSocketPath;
  }
  function Usa() {
    return hX?.linuxBridge?.socksSocketPath;
  }
  async function cao() {
    if (!ea) {
      return false;
    }
    if (OOe) {
      try {
        await OOe;
        return true;
      } catch {
        return false;
      }
    }
    return hX !== undefined;
  }
  async function Bsa(e, t, n, r) {
    let o = bw();
    let s = n?.filesystem !== undefined ? n.filesystem.disabled ?? false : ea?.filesystem.disabled ?? false;
    let i = iao(n?.credentials ?? ea?.credentials, n?.network?.allowedDomains ?? ea?.network?.allowedDomains);
    let a;
    let l;
    if (!s) {
      let m = b => b.map(S => CG(S)).filter(S => {
        if (bw() === "linux" && R1(S)) {
          mo(`[Sandbox] Skipping glob write pattern on Linux: ${S}`);
          return false;
        }
        return true;
      });
      let f = m(n?.filesystem?.allowWrite ?? ea?.filesystem.allowWrite ?? []);
      a = {
        allowOnly: [...OUn(), ...f],
        denyWithinAllow: m(n?.filesystem?.denyWrite ?? ea?.filesystem.denyWrite ?? [])
      };
      let h = Isa(n?.filesystem?.denyRead ?? ea?.filesystem.denyRead ?? [], i);
      let g = [];
      for (let b of h) {
        let S = CG(b);
        if (bw() === "linux" && R1(S)) {
          g.push(...VGe(b));
        } else {
          g.push(S);
        }
      }
      let y = n?.filesystem?.allowRead ?? ea?.filesystem.allowRead ?? [];
      let _ = [];
      for (let b of y) {
        let S = CG(b);
        if (bw() === "linux" && R1(S)) {
          _.push(...VGe(b));
        } else {
          _.push(S);
        }
      }
      if (s$) {
        _.push(s$.certPath, s$.trustBundlePath);
      }
      l = {
        denyOnly: g,
        allowWithinDeny: _
      };
    }
    let c = n?.network?.allowedDomains !== undefined || ea?.network?.allowedDomains !== undefined;
    let u = c;
    let d = c;
    if (d) {
      await cao();
    }
    let p = n?.allowPty ?? ea?.allowPty;
    switch (o) {
      case "macos":
        return ssa({
          command: e,
          needsNetworkRestriction: u,
          httpProxyPort: d ? aao() : undefined,
          socksProxyPort: d ? lao() : undefined,
          proxyAuthToken: d ? MOe : undefined,
          caCertPath: s$?.trustBundlePath,
          readConfig: l,
          writeConfig: a,
          unsetEnvVars: i.unsetEnvVars,
          setEnvVars: i.setEnvVars,
          maskedFileBinds: i.maskedFileBinds,
          allowUnixSockets: Osa(),
          allowAllUnixSockets: Csa(),
          allowLocalBinding: Dsa(),
          allowMachLookup: Msa(),
          ignoreViolations: Nsa(),
          allowPty: p,
          allowGitConfig: Rsa(),
          enableWeakerNetworkIsolation: jup(),
          allowAppleEvents: qup(),
          binShell: t
        });
      case "linux":
        return Zoa({
          command: e,
          needsNetworkRestriction: u,
          httpSocketPath: d ? Fsa() : undefined,
          socksSocketPath: d ? Usa() : undefined,
          httpProxyPort: d ? hX?.httpProxyPort : undefined,
          socksProxyPort: d ? hX?.socksProxyPort : undefined,
          proxyAuthToken: d ? MOe : undefined,
          caCertPath: s$?.trustBundlePath,
          readConfig: l,
          writeConfig: a,
          unsetEnvVars: i.unsetEnvVars,
          setEnvVars: i.setEnvVars,
          maskedFileBinds: i.maskedFileBinds,
          maskedFileStoreDir: i.maskedFileStoreDir,
          enableWeakerNestedSandbox: Lsa(),
          allowAllUnixSockets: Csa(),
          binShell: t,
          ripgrepConfig: Wup(),
          mandatoryDenySearchDepth: Gup(),
          allowGitConfig: Rsa(),
          seccompConfig: Vup(),
          bwrapPath: ea?.bwrapPath,
          socatPath: ea?.socatPath,
          abortSignal: r
        });
      case "windows":
        throw Error("wrapWithSandbox() returns a shell string and is not supported on Windows. Use SandboxManager.wrapWithSandboxArgv() and spawn the result with {shell: false}.");
      default:
        throw Error(`Sandbox configuration is not supported on platform: ${o}`);
    }
  }
  async function Kup(e, t, n, r) {
    if (bw() === "windows") {
      let a = n?.network?.allowedDomains !== undefined || ea?.network?.allowedDomains !== undefined;
      if (a) {
        await cao();
      }
      let l = iao(n?.credentials ?? ea?.credentials, n?.network?.allowedDomains ?? ea?.network?.allowedDomains);
      let c = n?.filesystem;
      let u = [];
      let d = [];
      if (!c?.disabled) {
        if (c?.allowRead?.length) {
          throw Error("Per-exec filesystem.allowRead (re-allow within denyRead) is not supported on Windows. Remove the entries or narrow filesystem.denyRead to exclude them.");
        }
        if (c?.allowWrite?.length) {
          throw Error("Per-exec filesystem.allowWrite is not supported on Windows \u2014 " + "the Windows sandbox is deny-listed only (the child writes wherever the host user can, minus filesystem.denyWrite). Remove the allowWrite entries.");
        }
        let p = [...(c?.denyRead ?? []), ...zUn(n?.credentials)];
        let m = c?.denyWrite ?? [];
        if (p.length > 0 || m.length > 0) {
          let f = new Set(Xut?.denyRead ?? []);
          let h = new Set(Xut?.denyWrite ?? []);
          let g = y => [...new Set(y.map(d0))];
          u = g(p).filter(y => !f.vZc(y));
          d = g(m).filter(y => !f.vZc(y) && !h.vZc(y));
        }
      }
      return _sa({
        command: e,
        group: Mqt(),
        sublayerGuid: ea?.windows?.wfpSublayerGuid,
        httpProxyPort: a ? aao() : undefined,
        socksProxyPort: a ? lao() : undefined,
        proxyAuthToken: a ? MOe : undefined,
        unsetEnvVars: l.unsetEnvVars,
        setEnvVars: l.setEnvVars,
        holderPid: Xut ? process.pid : undefined,
        denyRead: u,
        denyWrite: d,
        asSandboxUser: ea?.windows?.asSandboxUser ?? false,
        caCertPath: s$?.trustBundlePath,
        binShell: psa(t)
      });
    }
    let s = await Bsa(e, t, n, r);
    return {
      argv: [t ?? "/bin/bash", "-c", s],
      env: process.env
    };
  }
  function Yup() {
    return ea;
  }
  function Jup(e) {
    if (bw() === "windows" && ea && (e.windows?.groupSid !== ea.windows?.groupSid || e.windows?.groupName !== ea.windows?.groupName)) {
      throw Error("Changing the Windows sandbox group requires reset() and re-initialize().");
    }
    if (bw() === "windows" && ea && !$up(e)) {
      mo("[Sandbox Windows] updateConfig: the resolved file-deny set " + "(filesystem.denyRead/denyWrite \u222A credentials.files) changed but " + "the ACL stamp is session-wide \u2014 call reset() then initialize() " + "to apply. The previously-stamped set stays in effect.", {
        level: "warn"
      });
    }
    let {
      filterRequest: t,
      ...n
    } = e.network;
    ea = structuredClone({
      ...e,
      network: n
    });
    ea.network.filterRequest = t;
    DOe = Oio(e.network.parentProxy);
    mo("Sandbox configuration updated");
  }
  function Xup() {
    FUn();
  }
  function xsa(e, t) {
    if (!e.pid || e.exitCode !== null || e.signalCode !== null) {
      return Promise.resolve();
    }
    try {
      process.kill(e.pid, "SIGTERM");
      mo(`Sent SIGTERM to ${t} bridge process`);
    } catch (n) {
      if (n.code !== "ESRCH") {
        mo(`Error killing ${t} bridge: ${n}`, {
          level: "error"
        });
      }
      return Promise.resolve();
    }
    return new Promise(n => {
      let r = false;
      let o = () => {
        if (r) {
          return;
        }
        r = true;
        clearTimeout(s);
        n();
      };
      e.once("exit", () => {
        mo(`${t} bridge process exited`);
        o();
      });
      let s = setTimeout(() => {
        if (e.exitCode === null && e.signalCode === null) {
          mo(`${t} bridge did not exit, forcing SIGKILL`, {
            level: "warn"
          });
          try {
            if (e.pid) {
              process.kill(e.pid, "SIGKILL");
            }
          } catch {}
        }
        o();
      }, 1500);
      s.unref?.();
    });
  }
  function Zup(e) {
    return new Promise(t => {
      if (typeof e.closeAllConnections === "function") {
        e.closeAllConnections();
      }
      e.close(n => {
        if (n && n.message !== "Server is not running.") {
          mo(`Error closing HTTP proxy server: ${n.message}`, {
            level: "error"
          });
        }
        t();
      });
    });
  }
  async function uao() {
    if (Xut) {
      let t = tao({
        group: sao ?? Mqt()
      });
      if (t) {
        for (let n of t.paths ?? []) {
          if (!gsa.vZc(n.status)) {
            let r = n.status === "missing" ? " \u2014 file no longer exists; snapshot row kept for tracking" : (n.movedTo ? ` (now at '${n.movedTo}')` : "") + " \u2014 stamp left in place; resolve and run " + "`srt-win acl recover` to clear";
            mo(`[Sandbox Windows] file-deny restore: '${n.path}' ${n.status}${r}`, {
              level: "warn"
            });
          }
        }
        for (let n of t.parents ?? []) {
          if (!ysa.vZc(n.status)) {
            mo(`[Sandbox Windows] file-deny restore: parent '${n.path}' ${n.status}` + (n.error ? `: ${n.error}` : ""), {
              level: "warn"
            });
          }
        }
      }
    }
    if (Xut = undefined, sao = undefined, qUn = undefined, FUn({
      force: true
    }), jUn) {
      jUn();
      jUn = undefined;
    }
    if (hX?.linuxBridge) {
      let {
        httpSocketPath: t,
        socksSocketPath: n,
        httpBridgeProcess: r,
        socksBridgeProcess: o
      } = hX.linuxBridge;
      if (await Promise.all([xsa(r, "HTTP"), xsa(o, "SOCKS")]), t) {
        try {
          oao.rmSync(t, {
            force: true
          });
          mo("Cleaned up HTTP socket");
        } catch (s) {
          mo(`HTTP socket cleanup error: ${s}`, {
            level: "error"
          });
        }
      }
      if (n) {
        try {
          oao.rmSync(n, {
            force: true
          });
          mo("Cleaned up SOCKS socket");
        } catch (s) {
          mo(`SOCKS socket cleanup error: ${s}`, {
            level: "error"
          });
        }
      }
    }
    let e = [];
    if (s$) {
      e.push(Moa(s$));
    }
    if (Dqt) {
      e.push(Dqt.close().catch(t => {
        mo(`Error closing mux proxy server: ${t.message}`, {
          level: "error"
        });
      }));
    }
    if (Pqt) {
      e.push(Zup(Pqt));
    }
    if (Oqt) {
      let t = Oqt.close().catch(n => {
        mo(`Error closing SOCKS proxy server: ${n.message}`, {
          level: "error"
        });
      });
      e.push(t);
    }
    await Promise.all(e);
    Dqt = undefined;
    Pqt = undefined;
    MOe = undefined;
    Oqt = undefined;
    hX = undefined;
    OOe = undefined;
    DOe = undefined;
    s$ = undefined;
    Qut.clear();
    GUn.dispose();
  }
  function edp() {
    return WUn;
  }
  function tdp(e, t) {
    if (!ea) {
      return t;
    }
    let n = WUn.getViolationsForCommand(e);
    if (n.length === 0) {
      return t;
    }
    let r = t;
    r += HUn.EOL + "<sandbox_violations>" + HUn.EOL;
    for (let o of n) {
      r += o.line + HUn.EOL;
    }
    r += "</sandbox_violations>";
    return r;
  }
  function ndp() {
    if (bw() !== "linux" || !ea || ea.filesystem.disabled) {
      return [];
    }
    let e = [];
    let t = [...ea.filesystem.allowWrite, ...ea.filesystem.denyWrite];
    for (let n of t) {
      let r = CG(n);
      if (R1(r)) {
        e.push(n);
      }
    }
    return e;
  }
  var oao;
  var VUn;
  var HUn;
  var ea;
  var Pqt;
  var Oqt;
  var Dqt;
  var hX;
  var OOe;
  var vsa = false;
  var jUn;
  var DOe;
  var s$;
  var MOe;
  var Xut;
  var sao;
  var qUn;
  var WUn;
  var Qut;
  var GUn;
  var bS;
  var $sa = __lazy(() => {
    soa();
    moa();
    boa();
    Eoa();
    xoa();
    Loa();
    kqt();
    RUn();
    esa();
    asa();
    Ssa();
    BSe();
    nao();
    Kut();
    Esa();
    oao = __toESM(require("fs"));
    VUn = require("crypto");
    HUn = require("os");
    WUn = new SandboxViolationStore();
    Qut = new $io();
    GUn = new qio();
    bS = {
      initialize: Mup,
      isSupportedPlatform: ksa,
      isSandboxingEnabled: Nup,
      checkDependencies: Asa,
      getFsReadConfig: Lup,
      getFsWriteConfig: Fup,
      getNetworkRestrictionConfig: Hup,
      getAllowUnixSockets: Osa,
      getAllowLocalBinding: Dsa,
      getAllowMachLookup: Msa,
      getIgnoreViolations: Nsa,
      getEnableWeakerNestedSandbox: Lsa,
      getProxyPort: aao,
      getProxyAuthToken: zup,
      getSocksProxyPort: lao,
      getLinuxHttpSocketPath: Fsa,
      getLinuxSocksSocketPath: Usa,
      waitForNetworkInitialization: cao,
      wrapWithSandbox: Bsa,
      wrapWithSandboxArgv: Kup,
      cleanupAfterCommand: Xup,
      reset: uao,
      getMitmCA: () => s$,
      getSentinelRegistry: () => Qut,
      getMaskedFileStore: () => GUn,
      getSandboxViolationStore: edp,
      annotateStderrWithSandboxFailures: tdp,
      getLinuxGlobPatternWarnings: ndp,
      getConfig: Yup,
      updateConfig: Jup
    };
  });
  function KGe(e, t) {
    if (rdp(e)) {
      return e;
    }
    if (typeof t === "number") {
      t = BigInt(t);
    }
    if (e instanceof Error) {
      return new KUn(e.message, e, t);
    }
    if (typeof e === "string") {
      return new KUn(e, undefined, t);
    }
    return new KUn(`${e}`, e, t);
  }
  function rdp(e) {
    return typeof e === "object" && e !== null && Hsa in e;
  }
  var Hsa;
  var KUn;
  var dao = __lazy(() => {
    Hsa = Symbol.for("@bufbuild/cel/error");
    KUn = class KUn extends Error {
      _cause;
      _exprId;
      [Hsa] = {};
      constructor(e, t, n) {
        super(e);
        this._cause = t;
        this._exprId = n;
      }
      get exprId() {
        return this._exprId;
      }
      get cause() {
        return this._cause;
      }
    };
  });
  function jsa(e) {
    return e instanceof Error && odp.includes(e.name) && "field" in e && typeof e.field == "function";
  }
  var odp;
  var tU;
  var Nqt = __lazy(() => {
    odp = ["FieldValueInvalidError", "FieldListRangeError", "ForeignFieldError"];
    tU = class tU extends Error {
      constructor(e, t, n = "FieldValueInvalidError") {
        super(t);
        this.name = n;
        this.field = () => e;
      }
    };
  });
  function qSe(e) {
    let t = false;
    let n = [];
    for (let r = 0; r < e.length; r++) {
      let o = e.charAt(r);
      switch (o) {
        case "_":
          t = true;
          break;
        case "0":
        case "1":
        case "2":
        case "3":
        case "4":
        case "5":
        case "6":
        case "7":
        case "8":
        case "9":
          n.push(o);
          t = false;
          break;
        default:
          if (t) {
            t = false;
            o = o.toUpperCase();
          }
          n.push(o);
          break;
      }
    }
    return n.join("");
  }
  function YUn(e) {
    return e.replace(/[A-Z]/g, t => "_" + t.toLowerCase());
  }
  function Zut(e) {
    return sdp.vZc(e) ? e + "$" : e;
  }
  var sdp;
  var edt = __lazy(() => {
    sdp = new Set(["constructor", "toString", "toJSON", "valueOf"]);
  });
  function* JUn(e) {
    switch (e.kind) {
      case "file":
        for (let t of e.messages) {
          yield t;
          yield* JUn(t);
        }
        yield* e.enums;
        yield* e.services;
        yield* e.extensions;
        break;
      case "message":
        for (let t of e.nestedMessages) {
          yield t;
          yield* JUn(t);
        }
        yield* e.nestedEnums;
        yield* e.nestedExtensions;
        break;
    }
  }
  var gr;
  var bV = __lazy(() => {
    (function (e) {
      e[e.DOUBLE = 1] = "DOUBLE";
      e[e.FLOAT = 2] = "FLOAT";
      e[e.INT64 = 3] = "INT64";
      e[e.UINT64 = 4] = "UINT64";
      e[e.INT32 = 5] = "INT32";
      e[e.FIXED64 = 6] = "FIXED64";
      e[e.FIXED32 = 7] = "FIXED32";
      e[e.BOOL = 8] = "BOOL";
      e[e.STRING = 9] = "STRING";
      e[e.BYTES = 12] = "BYTES";
      e[e.UINT32 = 13] = "UINT32";
      e[e.SFIXED32 = 15] = "SFIXED32";
      e[e.SFIXED64 = 16] = "SFIXED64";
      e[e.SINT32 = 17] = "SINT32";
      e[e.SINT64 = 18] = "SINT64";
    })(gr || (gr = {}));
  });
  function gX(e, t) {
    if (!(e !== null && typeof e == "object" && "$typeName" in e && typeof e.$typeName == "string")) {
      return false;
    }
    if (t === undefined) {
      return true;
    }
    return t.typeName === e.$typeName;
  }
  function Wsa() {
    let e = 0;
    let t = 0;
    for (let r = 0; r < 28; r += 7) {
      let o = this.buf[this.pos++];
      if (e |= (o & 127) << r, (o & 128) == 0) {
        this.assertBounds();
        return [e, t];
      }
    }
    let n = this.buf[this.pos++];
    if (e |= (n & 15) << 28, t = (n & 112) >> 4, (n & 128) == 0) {
      this.assertBounds();
      return [e, t];
    }
    for (let r = 3; r <= 31; r += 7) {
      let o = this.buf[this.pos++];
      if (t |= (o & 127) << r, (o & 128) == 0) {
        this.assertBounds();
        return [e, t];
      }
    }
    throw Error("invalid varint");
  }
  function QUn(e, t, n) {
    for (let s = 0; s < 28; s = s + 7) {
      let i = e >>> s;
      let a = !(i >>> 7 == 0 && t == 0);
      let l = (a ? i | 128 : i) & 255;
      if (n.push(l), !a) {
        return;
      }
    }
    let r = e >>> 28 & 15 | (t & 7) << 4;
    let o = t >> 3 != 0;
    if (n.push((o ? r | 128 : r) & 255), !o) {
      return;
    }
    for (let s = 3; s < 31; s = s + 7) {
      let i = t >>> s;
      let a = i >>> 7 != 0;
      let l = (a ? i | 128 : i) & 255;
      if (n.push(l), !a) {
        return;
      }
    }
    n.push(t >>> 31 & 1);
  }
  function pao(e) {
    let t = e[0] === "-";
    if (t) {
      e = e.slice(1);
    }
    let n = 1e6;
    let r = 0;
    let o = 0;
    function s(i, a) {
      let l = Number(e.slice(i, a));
      if (o *= n, r = r * n + l, r >= 4294967296) {
        o = o + (r / 4294967296 | 0);
        r = r % 4294967296;
      }
    }
    s(-24, -18);
    s(-18, -12);
    s(-12, -6);
    s(-6);
    return t ? Vsa(r, o) : fao(r, o);
  }
  function Gsa(e, t) {
    let n = fao(e, t);
    let r = n.hi & 2147483648;
    if (r) {
      n = Vsa(n.lo, n.hi);
    }
    let o = mao(n.lo, n.hi);
    return r ? "-" + o : o;
  }
  function mao(e, t) {
    if ({
      lo: e,
      hi: t
    } = idp(e, t), t <= 2097151) {
      return String(4294967296 * t + e);
    }
    let n = e & 16777215;
    let r = (e >>> 24 | t << 8) & 16777215;
    let o = t >> 16 & 65535;
    let s = n + r * 6777216 + o * 6710656;
    let i = r + o * 8147497;
    let a = o * 2;
    let l = 1e7;
    if (s >= l) {
      i += Math.floor(s / l);
      s %= l;
    }
    if (i >= l) {
      a += Math.floor(i / l);
      i %= l;
    }
    return a.toString() + qsa(i) + qsa(s);
  }
  function idp(e, t) {
    return {
      lo: e >>> 0,
      hi: t >>> 0
    };
  }
  function fao(e, t) {
    return {
      lo: e | 0,
      hi: t | 0
    };
  }
  function Vsa(e, t) {
    if (t = ~t, e) {
      e = ~e + 1;
    } else {
      t += 1;
    }
    return fao(e, t);
  }
  function Lqt(e, t) {
    if (e >= 0) {
      while (e > 127) {
        t.push(e & 127 | 128);
        e = e >>> 7;
      }
      t.push(e);
    } else {
      for (let n = 0; n < 9; n++) {
        t.push(e & 127 | 128);
        e = e >> 7;
      }
      t.push(1);
    }
  }
  function zsa() {
    let e = this.buf[this.pos++];
    let t = e & 127;
    if ((e & 128) == 0) {
      this.assertBounds();
      return t;
    }
    if (e = this.buf[this.pos++], t |= (e & 127) << 7, (e & 128) == 0) {
      this.assertBounds();
      return t;
    }
    if (e = this.buf[this.pos++], t |= (e & 127) << 14, (e & 128) == 0) {
      this.assertBounds();
      return t;
    }
    if (e = this.buf[this.pos++], t |= (e & 127) << 21, (e & 128) == 0) {
      this.assertBounds();
      return t;
    }
    e = this.buf[this.pos++];
    t |= (e & 15) << 28;
    for (let n = 5; (e & 128) !== 0 && n < 10; n++) {
      e = this.buf[this.pos++];
    }
    if ((e & 128) != 0) {
      throw Error("invalid varint");
    }
    this.assertBounds();
    return t >>> 0;
  }
  var qsa = e => {
    let t = String(e);
    return "0000000".slice(t.length) + t;
  };
  function adp() {
    let e = new DataView(new ArrayBuffer(8));
    if (typeof BigInt === "function" && typeof e.getBigInt64 === "function" && typeof e.getBigUint64 === "function" && typeof e.setBigInt64 === "function" && typeof e.setBigUint64 === "function" && (!!globalThis.Deno || typeof process != "object" || typeof process.env != "object" || process.env.BUF_BIGINT_DISABLE !== "1")) {
      let n = BigInt("-9223372036854775808");
      let r = BigInt("9223372036854775807");
      let o = BigInt("0");
      let s = BigInt("18446744073709551615");
      return {
        zero: BigInt(0),
        supported: true,
        parse(i) {
          let a = typeof i == "bigint" ? i : BigInt(i);
          if (a > r || a < n) {
            throw Error(`invalid int64: ${i}`);
          }
          return a;
        },
        uParse(i) {
          let a = typeof i == "bigint" ? i : BigInt(i);
          if (a > s || a < o) {
            throw Error(`invalid uint64: ${i}`);
          }
          return a;
        },
        $ef(i) {
          e.setBigInt64(0, this.parse(i), true);
          return {
            lo: e.getInt32(0, true),
            hi: e.getInt32(4, true)
          };
        },
        uEnc(i) {
          e.setBigInt64(0, this.uParse(i), true);
          return {
            lo: e.getInt32(0, true),
            hi: e.getInt32(4, true)
          };
        },
        dec(i, a) {
          e.setInt32(0, i, true);
          e.setInt32(4, a, true);
          return e.getBigInt64(0, true);
        },
        uDec(i, a) {
          e.setInt32(0, i, true);
          e.setInt32(4, a, true);
          return e.getBigUint64(0, true);
        }
      };
    }
    return {
      zero: "0",
      supported: false,
      parse(n) {
        if (typeof n != "string") {
          n = n.toString();
        }
        Ksa(n);
        return n;
      },
      uParse(n) {
        if (typeof n != "string") {
          n = n.toString();
        }
        Ysa(n);
        return n;
      },
      $ef(n) {
        if (typeof n != "string") {
          n = n.toString();
        }
        Ksa(n);
        return pao(n);
      },
      uEnc(n) {
        if (typeof n != "string") {
          n = n.toString();
        }
        Ysa(n);
        return pao(n);
      },
      dec(n, r) {
        return Gsa(n, r);
      },
      uDec(n, r) {
        return mao(n, r);
      }
    };
  }
  function Ksa(e) {
    if (!/^-?[0-9]+$/.test(e)) {
      throw Error("invalid int64: " + e);
    }
  }
  function Ysa(e) {
    if (!/^[0-9]+$/.test(e)) {
      throw Error("invalid uint64: " + e);
    }
  }
  var W_;
  var WSe = __lazy(() => {
    W_ = adp();
  });
  function tdt(e, t, n) {
    if (t === n) {
      return true;
    }
    if (e == gr.BYTES) {
      if (!(t instanceof Uint8Array) || !(n instanceof Uint8Array)) {
        return false;
      }
      if (t.length !== n.length) {
        return false;
      }
      for (let r = 0; r < t.length; r++) {
        if (t[r] !== n[r]) {
          return false;
        }
      }
      return true;
    }
    switch (e) {
      case gr.UINT64:
      case gr.FIXED64:
      case gr.INT64:
      case gr.SFIXED64:
      case gr.SINT64:
        return t == n;
    }
    return false;
  }
  function Vre(e, t) {
    switch (e) {
      case gr.STRING:
        return "";
      case gr.BOOL:
        return false;
      case gr.DOUBLE:
      case gr.FLOAT:
        return 0;
      case gr.INT64:
      case gr.UINT64:
      case gr.SFIXED64:
      case gr.FIXED64:
      case gr.SINT64:
        return t ? "0" : W_.zero;
      case gr.BYTES:
        return new Uint8Array(0);
      default:
        return 0;
    }
  }
  function Jsa(e, t) {
    switch (e) {
      case gr.BOOL:
        return t === false;
      case gr.STRING:
        return t === "";
      case gr.BYTES:
        return t instanceof Uint8Array && !t.byteLength;
      default:
        return t == 0;
    }
  }
  var NOe = __lazy(() => {
    WSe();
    bV();
  });
  function ZUn(e, t) {
    let n = e[t.localName].case;
    if (n === undefined) {
      return n;
    }
    return t.fields.find(r => r.localName === n);
  }
  function Qsa(e, t) {
    let n = t.localName;
    if (t.oneof) {
      return e[t.oneof.localName].case === n;
    }
    if (t.presence != 2) {
      return e[n] !== undefined && Object.prototype.hasOwnProperty.call(e, n);
    }
    switch (t.fieldKind) {
      case "list":
        return e[n].length > 0;
      case "map":
        return Object.keys(e[n]).length > 0;
      case "scalar":
        return !Jsa(t.scalar, e[n]);
      case "enum":
        return e[n] !== t.enum.values[0].number;
    }
    throw Error("message field with implicit presence");
  }
  function YGe(e, t) {
    return Object.prototype.hasOwnProperty.call(e, t) && e[t] !== undefined;
  }
  function eBn(e, t) {
    if (t.oneof) {
      let n = e[t.oneof.localName];
      if (n.case === t.localName) {
        return n.value;
      }
      return;
    }
    return e[t.localName];
  }
  function tBn(e, t, n) {
    if (t.oneof) {
      e[t.oneof.localName] = {
        case: t.localName,
        value: n
      };
    } else {
      e[t.localName] = n;
    }
  }
  function Zsa(e, t) {
    let n = t.localName;
    if (t.oneof) {
      let r = t.oneof.localName;
      if (e[r].case === n) {
        e[r] = {
          case: undefined
        };
      }
    } else if (t.presence != 2) {
      delete e[n];
    } else {
      switch (t.fieldKind) {
        case "map":
          e[n] = {};
          break;
        case "list":
          e[n] = [];
          break;
        case "enum":
          e[n] = t.enum.values[0].number;
          break;
        case "scalar":
          e[n] = Vre(t.scalar, t.longAsString);
          break;
      }
    }
  }
  var zre;
  var ndt = __lazy(() => {
    NOe();
    zre = Symbol.for("reflect unsafe local");
  });
  function Xue(e) {
    return e !== null && typeof e == "object" && !Array.isArray(e);
  }
  function Que(e, t) {
    var n;
    var r;
    var o;
    var s;
    if (Xue(e) && zre in e && "add" in e && "field" in e && typeof e.field == "function") {
      if (t !== undefined) {
        let i = t;
        let a = e.field();
        return i.listKind == a.listKind && i.scalar === a.scalar && ((n = i.message) === null || n === undefined ? undefined : n.typeName) === ((r = a.message) === null || r === undefined ? undefined : r.typeName) && ((o = i.enum) === null || o === undefined ? undefined : o.typeName) === ((s = a.enum) === null || s === undefined ? undefined : s.typeName);
      }
      return true;
    }
    return false;
  }
  function Zue(e, t) {
    var n;
    var r;
    var o;
    var s;
    if (Xue(e) && zre in e && "has" in e && "field" in e && typeof e.field == "function") {
      if (t !== undefined) {
        let i = t;
        let a = e.field();
        return i.mapKey === a.mapKey && i.mapKind == a.mapKind && i.scalar === a.scalar && ((n = i.message) === null || n === undefined ? undefined : n.typeName) === ((r = a.message) === null || r === undefined ? undefined : r.typeName) && ((o = i.enum) === null || o === undefined ? undefined : o.typeName) === ((s = a.enum) === null || s === undefined ? undefined : s.typeName);
      }
      return true;
    }
    return false;
  }
  function nU(e, t) {
    return Xue(e) && zre in e && "desc" in e && Xue(e.desc) && e.desc.kind === "message" && (t === undefined || e.desc.typeName == t.typeName);
  }
  var Fqt = __lazy(() => {
    ndt();
  });
  function Uqt() {
    if (globalThis[hao] == null) {
      let e = new globalThis.TextEncoder();
      let t = new globalThis.TextDecoder();
      let n;
      globalThis[hao] = {
        encodeUtf8(r) {
          return e.HS(r);
        },
        decodeUtf8(r, o) {
          if (o) {
            if (n === undefined) {
              n = new globalThis.TextDecoder("utf-8", {
                fatal: true
              });
            }
            return n.oC(r);
          }
          return t.oC(r);
        },
        checkUtf8(r) {
          try {
            encodeURIComponent(r);
            return true;
          } catch (o) {
            return false;
          }
        }
      };
    }
    return globalThis[hao];
  }
  var hao;
  var nBn = __lazy(() => {
    hao = Symbol.for("@bufbuild/protobuf/text-encoding");
  });
  class Bqt {
    constructor(e = Uqt().encodeUtf8) {
      this.encodeUtf8 = e;
      this.stack = [];
      this.chunks = [];
      this.buf = [];
    }
    finish() {
      if (this.buf.length) {
        this.chunks.push(new Uint8Array(this.buf));
        this.buf = [];
      }
      let e = 0;
      for (let r = 0; r < this.chunks.length; r++) {
        e += this.chunks[r].length;
      }
      let t = new Uint8Array(e);
      let n = 0;
      for (let r = 0; r < this.chunks.length; r++) {
        t.set(this.chunks[r], n);
        n += this.chunks[r].length;
      }
      this.chunks = [];
      return t;
    }
    fork() {
      this.stack.push({
        chunks: this.chunks,
        buf: this.buf
      });
      this.chunks = [];
      this.buf = [];
      return this;
    }
    join() {
      let e = this.finish();
      let t = this.stack.pop();
      if (!t) {
        throw Error("invalid state, fork stack empty");
      }
      this.chunks = t.chunks;
      this.buf = t.buf;
      this.uint32(e.byteLength);
      return this.raw(e);
    }
    tag(e, t) {
      return this.uint32((e << 3 | t) >>> 0);
    }
    raw(e) {
      if (this.buf.length) {
        this.chunks.push(new Uint8Array(this.buf));
        this.buf = [];
      }
      this.chunks.push(e);
      return this;
    }
    uint32(e) {
      eia(e);
      while (e > 127) {
        this.buf.push(e & 127 | 128);
        e = e >>> 7;
      }
      this.buf.push(e);
      return this;
    }
    int32(e) {
      gao(e);
      Lqt(e, this.buf);
      return this;
    }
    bool(e) {
      this.buf.push(e ? 1 : 0);
      return this;
    }
    bytes(e) {
      this.uint32(e.byteLength);
      return this.raw(e);
    }
    string(e) {
      let t = this.encodeUtf8(e);
      this.uint32(t.byteLength);
      return this.raw(t);
    }
    float(e) {
      ldp(e);
      let t = new Uint8Array(4);
      new DataView(t.buffer).setFloat32(0, e, true);
      return this.raw(t);
    }
    double(e) {
      let t = new Uint8Array(8);
      new DataView(t.buffer).setFloat64(0, e, true);
      return this.raw(t);
    }
    fixed32(e) {
      eia(e);
      let t = new Uint8Array(4);
      new DataView(t.buffer).setUint32(0, e, true);
      return this.raw(t);
    }
    sfixed32(e) {
      gao(e);
      let t = new Uint8Array(4);
      new DataView(t.buffer).setInt32(0, e, true);
      return this.raw(t);
    }
    sint32(e) {
      gao(e);
      e = (e << 1 ^ e >> 31) >>> 0;
      Lqt(e, this.buf);
      return this;
    }
    sfixed64(e) {
      let t = new Uint8Array(8);
      let n = new DataView(t.buffer);
      let r = W_.$ef(e);
      n.setInt32(0, r.lo, true);
      n.setInt32(4, r.hi, true);
      return this.raw(t);
    }
    fixed64(e) {
      let t = new Uint8Array(8);
      let n = new DataView(t.buffer);
      let r = W_.uEnc(e);
      n.setInt32(0, r.lo, true);
      n.setInt32(4, r.hi, true);
      return this.raw(t);
    }
    int64(e) {
      let t = W_.$ef(e);
      QUn(t.lo, t.hi, this.buf);
      return this;
    }
    sint64(e) {
      let t = W_.$ef(e);
      let n = t.hi >> 31;
      let r = t.lo << 1 ^ n;
      let o = (t.hi << 1 | t.lo >>> 31) ^ n;
      QUn(r, o, this.buf);
      return this;
    }
    uint64(e) {
      let t = W_.uEnc(e);
      QUn(t.lo, t.hi, this.buf);
      return this;
    }
  }
  class rdt {
    constructor(e, t = Uqt().decodeUtf8) {
      this.decodeUtf8 = t;
      this.varint64 = Wsa;
      this.uint32 = zsa;
      this.buf = e;
      this.len = e.length;
      this.pos = 0;
      this.view = new DataView(e.buffer, e.byteOffset, e.byteLength);
    }
    tag() {
      let e = this.pos;
      let t = this.uint32();
      let n = this.pos - e;
      if (n > 5 || n == 5 && this.buf[this.pos - 1] > 15) {
        throw Error("illegal tag: varint overflows uint32");
      }
      let r = t >>> 3;
      let o = t & 7;
      if (r <= 0 || o > 5) {
        throw Error("illegal tag: field no " + r + " wire type " + o);
      }
      return [r, o];
    }
    skip(e, t) {
      let n = this.pos;
      switch (e) {
        case gx.Varint:
          while (this.buf[this.pos++] & 128) {
            ;
          }
          break;
        case gx.Bit64:
          this.pos += 4;
        case gx.Bit32:
          this.pos += 4;
          break;
        case gx.LengthDelimited:
          let r = this.uint32();
          this.pos += r;
          break;
        case gx.StartGroup:
          for (;;) {
            let [o, s] = this.tag();
            if (s === gx.EndGroup) {
              if (t !== undefined && o !== t) {
                throw Error("invalid end group tag");
              }
              break;
            }
            this.skip(s, o);
          }
          break;
        default:
          throw Error("cant skip wire type " + e);
      }
      this.assertBounds();
      return this.buf.subarray(n, this.pos);
    }
    assertBounds() {
      if (this.pos > this.len) {
        throw RangeError("premature EOF");
      }
    }
    int32() {
      return this.uint32() | 0;
    }
    sint32() {
      let e = this.uint32();
      return e >>> 1 ^ -(e & 1);
    }
    int64() {
      return W_.dec(...this.varint64());
    }
    uint64() {
      return W_.uDec(...this.varint64());
    }
    sint64() {
      let [e, t] = this.varint64();
      let n = -(e & 1);
      e = (e >>> 1 | (t & 1) << 31) ^ n;
      t = t >>> 1 ^ n;
      return W_.dec(e, t);
    }
    bool() {
      let [e, t] = this.varint64();
      return e !== 0 || t !== 0;
    }
    fixed32() {
      return this.view.getUint32((this.pos += 4) - 4, true);
    }
    sfixed32() {
      return this.view.getInt32((this.pos += 4) - 4, true);
    }
    fixed64() {
      return W_.uDec(this.sfixed32(), this.sfixed32());
    }
    sfixed64() {
      return W_.dec(this.sfixed32(), this.sfixed32());
    }
    float() {
      return this.view.getFloat32((this.pos += 4) - 4, true);
    }
    double() {
      return this.view.getFloat64((this.pos += 8) - 8, true);
    }
    bytes() {
      let e = this.uint32();
      let t = this.pos;
      this.pos += e;
      this.assertBounds();
      return this.buf.subarray(t, t + e);
    }
    string(e) {
      return this.decodeUtf8(this.bytes(), e);
    }
  }
  function gao(e) {
    if (typeof e == "string") {
      e = Number(e);
    } else if (typeof e != "number") {
      throw Error("invalid int32: " + typeof e);
    }
    if (!Number.isInteger(e) || e > 2147483647 || e < Tao) {
      throw Error("invalid int32: " + e);
    }
  }
  function eia(e) {
    if (typeof e == "string") {
      e = Number(e);
    } else if (typeof e != "number") {
      throw Error("invalid uint32: " + typeof e);
    }
    if (!Number.isInteger(e) || e > 4294967295 || e < 0) {
      throw Error("invalid uint32: " + e);
    }
  }
  function ldp(e) {
    if (typeof e == "string") {
      let t = e;
      if (e = Number(e), Number.isNaN(e) && t !== "NaN") {
        throw Error("invalid float32: " + t);
      }
    } else if (typeof e != "number") {
      throw Error("invalid float32: " + typeof e);
    }
    if (Number.isFinite(e) && (e > 340282346638528860000000000000000000000 || e < _ao)) {
      throw Error("invalid float32: " + e);
    }
  }
  var gx;
  var _ao = -340282346638528860000000000000000000000;
  var Tao = -2147483648;
  var odt = __lazy(() => {
    WSe();
    nBn();
    (function (e) {
      e[e.Varint = 0] = "Varint";
      e[e.Bit64 = 1] = "Bit64";
      e[e.LengthDelimited = 2] = "LengthDelimited";
      e[e.StartGroup = 3] = "StartGroup";
      e[e.EndGroup = 4] = "EndGroup";
      e[e.Bit32 = 5] = "Bit32";
    })(gx || (gx = {}));
  });
  function GSe(e, t) {
    let n = e.fieldKind == "list" ? Que(t, e) : e.fieldKind == "map" ? Zue(t, e) : vao(e, t);
    if (n === true) {
      return;
    }
    let r;
    switch (e.fieldKind) {
      case "list":
        r = `expected ${oia(e)}, got ${yO(t)}`;
        break;
      case "map":
        r = `expected ${sia(e)}, got ${yO(t)}`;
        break;
      default:
        r = rBn(e, t, n);
    }
    return new tU(e, r);
  }
  function Eao(e, t, n) {
    let r = vao(e, n);
    if (r !== true) {
      return new tU(e, `list item #${t + 1}: ${rBn(e, n, r)}`);
    }
    return;
  }
  function tia(e, t, n) {
    let r = nia(t, e.mapKey);
    if (r !== true) {
      return new tU(e, `invalid map key: ${rBn({
        scalar: e.mapKey
      }, t, r)}`);
    }
    let o = vao(e, n);
    if (o !== true) {
      return new tU(e, `map entry ${yO(t)}: ${rBn(e, n, o)}`);
    }
    return;
  }
  function vao(e, t) {
    if (e.scalar !== undefined) {
      return nia(t, e.scalar);
    }
    if (e.enum !== undefined) {
      if (e.enum.open) {
        return Number.isInteger(t);
      }
      return e.enum.values.some(n => n.number === t);
    }
    return nU(t, e.message);
  }
  function nia(e, t) {
    switch (t) {
      case gr.DOUBLE:
        return typeof e == "number";
      case gr.FLOAT:
        if (typeof e != "number") {
          return false;
        }
        if (Number.isNaN(e) || !Number.isFinite(e)) {
          return true;
        }
        if (e > 340282346638528860000000000000000000000 || e < _ao) {
          return `${e.toFixed()} out of range`;
        }
        return true;
      case gr.INT32:
      case gr.SFIXED32:
      case gr.SINT32:
        if (typeof e !== "number" || !Number.isInteger(e)) {
          return false;
        }
        if (e > 2147483647 || e < Tao) {
          return `${e.toFixed()} out of range`;
        }
        return true;
      case gr.FIXED32:
      case gr.UINT32:
        if (typeof e !== "number" || !Number.isInteger(e)) {
          return false;
        }
        if (e > 4294967295 || e < 0) {
          return `${e.toFixed()} out of range`;
        }
        return true;
      case gr.BOOL:
        return typeof e == "boolean";
      case gr.STRING:
        if (typeof e != "string") {
          return false;
        }
        return Uqt().checkUtf8(e) || "invalid UTF8";
      case gr.BYTES:
        return e instanceof Uint8Array;
      case gr.INT64:
      case gr.SFIXED64:
      case gr.SINT64:
        if (typeof e == "bigint" || typeof e == "number" || typeof e == "string" && e.length > 0) {
          try {
            W_.parse(e);
            return true;
          } catch (n) {
            return `${e} out of range`;
          }
        }
        return false;
      case gr.FIXED64:
      case gr.UINT64:
        if (typeof e == "bigint" || typeof e == "number" || typeof e == "string" && e.length > 0) {
          try {
            W_.uParse(e);
            return true;
          } catch (n) {
            return `${e} out of range`;
          }
        }
        return false;
    }
  }
  function rBn(e, t, n) {
    if (n = typeof n == "string" ? `: ${n}` : `, got ${yO(t)}`, e.scalar !== undefined) {
      return `expected ${cdp(e.scalar)}` + n;
    }
    if (e.enum !== undefined) {
      return `expected ${e.enum.toString()}` + n;
    }
    return `expected ${ria(e.message)}` + n;
  }
  function yO(e) {
    switch (typeof e) {
      case "object":
        if (e === null) {
          return "null";
        }
        if (e instanceof Uint8Array) {
          return `Uint8Array(${e.length})`;
        }
        if (Array.isArray(e)) {
          return `Array(${e.length})`;
        }
        if (Que(e)) {
          return oia(e.field());
        }
        if (Zue(e)) {
          return sia(e.field());
        }
        if (nU(e)) {
          return ria(e.desc);
        }
        if (gX(e)) {
          return `message ${e.$typeName}`;
        }
        return "object";
      case "string":
        return e.length > 30 ? "string" : `"${e.split('"').join("\\\"")}"`;
      case "boolean":
        return String(e);
      case "number":
        return String(e);
      case "bigint":
        return String(e) + "n";
      default:
        return typeof e;
    }
  }
  function ria(e) {
    return `ReflectMessage (${e.typeName})`;
  }
  function oia(e) {
    switch (e.listKind) {
      case "message":
        return `ReflectList (${e.message.toString()})`;
      case "enum":
        return `ReflectList (${e.enum.toString()})`;
      case "scalar":
        return `ReflectList (${gr[e.scalar]})`;
    }
  }
  function sia(e) {
    switch (e.mapKind) {
      case "message":
        return `ReflectMap (${gr[e.mapKey]}, ${e.message.toString()})`;
      case "enum":
        return `ReflectMap (${gr[e.mapKey]}, ${e.enum.toString()})`;
      case "scalar":
        return `ReflectMap (${gr[e.mapKey]}, ${gr[e.scalar]})`;
    }
  }
  function cdp(e) {
    switch (e) {
      case gr.STRING:
        return "string";
      case gr.BOOL:
        return "boolean";
      case gr.INT64:
      case gr.SINT64:
      case gr.SFIXED64:
        return "bigint (int64)";
      case gr.UINT64:
      case gr.FIXED64:
        return "bigint (uint64)";
      case gr.BYTES:
        return "Uint8Array";
      case gr.DOUBLE:
        return "number (float64)";
      case gr.FLOAT:
        return "number (float32)";
      case gr.FIXED32:
      case gr.UINT32:
        return "number (uint32)";
      case gr.INT32:
      case gr.SFIXED32:
      case gr.SINT32:
        return "number (int32)";
    }
  }
  var oBn = __lazy(() => {
    bV();
    Nqt();
    Fqt();
    odt();
    nBn();
    WSe();
  });
  function sBn(e) {
    return iia(e.$typeName);
  }
  function Kre(e) {
    let t = e.fields[0];
    return iia(e.typeName) && t !== undefined && t.fieldKind == "scalar" && t.name == "value" && t.number == 1;
  }
  function iBn(e) {
    switch (e.typeName) {
      case "google.protobuf.Any":
      case "google.protobuf.Timestamp":
      case "google.protobuf.Duration":
      case "google.protobuf.FieldMask":
      case "google.protobuf.Struct":
      case "google.protobuf.Value":
      case "google.protobuf.ListValue":
        return true;
      default:
        return Kre(e);
    }
  }
  function iia(e) {
    return e.startsWith("google.protobuf.") && ["DoubleValue", "FloatValue", "Int64Value", "UInt64Value", "Int32Value", "UInt32Value", "BoolValue", "StringValue", "BytesValue"].includes(e.substring(16));
  }
  function $I(e, t) {
    if (gX(t, e)) {
      return t;
    }
    let n = gdp(e);
    if (t !== undefined) {
      pdp(e, n, t);
    }
    return n;
  }
  function pdp(e, t, n) {
    for (let r of e.members) {
      let o = n[r.localName];
      if (o == null) {
        continue;
      }
      let s;
      if (r.kind == "oneof") {
        let i = ZUn(n, r);
        if (!i) {
          continue;
        }
        s = i;
        o = eBn(n, i);
      } else {
        s = r;
      }
      switch (s.fieldKind) {
        case "message":
          o = Cao(s, o);
          break;
        case "scalar":
          o = cia(s, o);
          break;
        case "list":
          o = fdp(s, o);
          break;
        case "map":
          o = mdp(s, o);
          break;
      }
      tBn(t, s, o);
    }
    return t;
  }
  function cia(e, t) {
    if (e.scalar == gr.BYTES) {
      return Rao(t);
    }
    return t;
  }
  function mdp(e, t) {
    if (Xue(t)) {
      if (e.scalar == gr.BYTES) {
        return aia(t, Rao);
      }
      if (e.mapKind == "message") {
        return aia(t, n => Cao(e, n));
      }
    }
    return t;
  }
  function fdp(e, t) {
    if (Array.isArray(t)) {
      if (e.scalar == gr.BYTES) {
        return t.map(Rao);
      }
      if (e.listKind == "message") {
        return t.map(n => Cao(e, n));
      }
    }
    return t;
  }
  function Cao(e, t) {
    if (e.fieldKind == "message" && !e.oneof && Kre(e.message)) {
      return cia(e.message.fields[0], t);
    }
    if (Xue(t)) {
      if (e.message.typeName == "google.protobuf.Struct" && e.parent.typeName !== "google.protobuf.Value") {
        return t;
      }
      if (!gX(t, e.message)) {
        return $I(e.message, t);
      }
    }
    return t;
  }
  function Rao(e) {
    return Array.isArray(e) ? new Uint8Array(e) : e;
  }
  function aia(e, t) {
    let n = {};
    for (let r of Object.entries(e)) {
      n[r[0]] = t(r[1]);
    }
    return n;
  }
  function gdp(e) {
    let t;
    if (!ydp(e)) {
      t = {
        $typeName: e.typeName
      };
      for (let n of e.members) {
        if (n.kind == "oneof" || n.presence == 2) {
          t[n.localName] = wao(n);
        }
      }
    } else {
      let n = lia.get(e);
      let r;
      let o;
      if (n) {
        ({
          prototype: r,
          members: o
        } = n);
      } else {
        r = {};
        o = new Set();
        for (let s of e.members) {
          if (s.kind == "oneof") {
            continue;
          }
          if (s.fieldKind != "scalar" && s.fieldKind != "enum") {
            continue;
          }
          if (s.presence == 2) {
            continue;
          }
          o.add(s);
          r[s.localName] = wao(s);
        }
        lia.set(e, {
          prototype: r,
          members: o
        });
      }
      t = Object.create(r);
      t.$typeName = e.typeName;
      for (let s of e.members) {
        if (o.vZc(s)) {
          continue;
        }
        if (s.kind == "field") {
          if (s.fieldKind == "message") {
            continue;
          }
          if (s.fieldKind == "scalar" || s.fieldKind == "enum") {
            if (s.presence != 2) {
              continue;
            }
          }
        }
        t[s.localName] = wao(s);
      }
    }
    return t;
  }
  function ydp(e) {
    switch (e.file.edition) {
      case 999:
        return false;
      case 998:
        return true;
      default:
        return e.fields.some(t => t.presence != 2 && t.fieldKind != "message" && !t.oneof);
    }
  }
  function wao(e) {
    if (e.kind == "oneof") {
      return {
        case: undefined
      };
    }
    if (e.fieldKind == "list") {
      return [];
    }
    if (e.fieldKind == "map") {
      return {};
    }
    if (e.fieldKind == "message") {
      return hdp;
    }
    let t = e.getDefaultValue();
    if (t !== undefined) {
      return e.fieldKind == "scalar" && e.longAsString ? t.toString() : t;
    }
    return e.fieldKind == "scalar" ? Vre(e.scalar, e.longAsString) : e.enum.values[0].number;
  }
  var hdp;
  var lia;
  var JGe = __lazy(() => {
    bV();
    NOe();
    Fqt();
    ndt();
    hdp = Symbol();
    lia = new WeakMap();
  });
  function p0(e, t, n = true) {
    return new Aao(e, t, n);
  }
  class Aao {
    get sortedFields() {
      let e = uia.get(this.desc);
      if (e) {
        return e;
      }
      let t = this.desc.fields.concat().sort((n, r) => n.number - r.number);
      uia.set(this.desc, t);
      return t;
    }
    constructor(e, t, n = true) {
      this.lists = new Map();
      this.maps = new Map();
      this.check = n;
      this.desc = e;
      this.message = this[zre] = t !== null && t !== undefined ? t : $I(e);
      this.fields = e.fields;
      this.oneofs = e.oneofs;
      this.members = e.members;
    }
    findNumber(e) {
      if (!this._fieldsByNumber) {
        this._fieldsByNumber = new Map(this.desc.fields.map(t => [t.number, t]));
      }
      return this._fieldsByNumber.get(e);
    }
    oneofCase(e) {
      $qt(this.message, e);
      return ZUn(this.message, e);
    }
    isSet(e) {
      $qt(this.message, e);
      return Qsa(this.message, e);
    }
    clear(e) {
      $qt(this.message, e);
      Zsa(this.message, e);
    }
    get(e) {
      $qt(this.message, e);
      let t = eBn(this.message, e);
      switch (e.fieldKind) {
        case "list":
          let n = this.lists.get(e);
          if (!n || n[zre] !== t) {
            this.lists.set(e, n = new mia(e, t, this.check));
          }
          return n;
        case "map":
          let r = this.maps.get(e);
          if (!r || r[zre] !== t) {
            this.maps.set(e, r = new fia(e, t, this.check));
          }
          return r;
        case "message":
          return Pao(e, t, this.check);
        case "scalar":
          return t === undefined ? Vre(e.scalar, false) : Oao(e, t);
        case "enum":
          return t !== null && t !== undefined ? t : e.enum.values[0].number;
      }
    }
    set(e, t) {
      if ($qt(this.message, e), this.check) {
        let r = GSe(e, t);
        if (r) {
          throw r;
        }
      }
      let n;
      if (e.fieldKind == "message") {
        n = Iao(e, t);
      } else if (Zue(t) || Que(t)) {
        n = t[zre];
      } else {
        n = Dao(e, t);
      }
      tBn(this.message, e, n);
    }
    getUnknown() {
      return this.message.$unknown;
    }
    setUnknown(e) {
      this.message.$unknown = e;
    }
  }
  function $qt(e, t) {
    if (t.parent.typeName !== e.$typeName) {
      throw new tU(t, `cannot use ${t.toString()} with message ${e.$typeName}`, "ForeignFieldError");
    }
  }
  function Iao(e, t) {
    if (!nU(t)) {
      return t;
    }
    if (sBn(t.message) && !e.oneof && e.fieldKind == "message") {
      return t.message.value;
    }
    if (t.desc.typeName == "google.protobuf.Struct" && e.parent.typeName != "google.protobuf.Value") {
      return gia(t.message);
    }
    return t.message;
  }
  function Pao(e, t, n) {
    if (t !== undefined) {
      if (Kre(e.message) && !e.oneof && e.fieldKind == "message") {
        t = {
          $typeName: e.message.typeName,
          value: Oao(e.message.fields[0], t)
        };
      } else if (e.message.typeName == "google.protobuf.Struct" && e.parent.typeName != "google.protobuf.Value" && Xue(t)) {
        t = hia(t);
      }
    }
    return new Aao(e.message, t, n);
  }
  function dia(e, t) {
    if (e.listKind == "message") {
      return Iao(e, t);
    }
    return Dao(e, t);
  }
  function xao(e, t, n) {
    if (e.listKind == "message") {
      return Pao(e, t, n);
    }
    return Oao(e, t);
  }
  function _dp(e, t) {
    if (e.mapKind == "message") {
      return Iao(e, t);
    }
    return Dao(e, t);
  }
  function kao(e, t, n) {
    if (e.mapKind == "message") {
      return Pao(e, t, n);
    }
    return t;
  }
  function lBn(e) {
    return typeof e == "string" || typeof e == "number" ? e : String(e);
  }
  function pia(e, t) {
    switch (t) {
      case gr.STRING:
        return e;
      case gr.INT32:
      case gr.FIXED32:
      case gr.UINT32:
      case gr.SFIXED32:
      case gr.SINT32:
        {
          let n = Number.parseInt(e);
          if (Number.isFinite(n)) {
            return n;
          }
          break;
        }
      case gr.BOOL:
        switch (e) {
          case "true":
            return true;
          case "false":
            return false;
        }
        break;
      case gr.UINT64:
      case gr.FIXED64:
        try {
          return W_.uParse(e);
        } catch (n) {}
        break;
      default:
        try {
          return W_.parse(e);
        } catch (n) {}
        break;
    }
    return e;
  }
  function Oao(e, t) {
    switch (e.scalar) {
      case gr.INT64:
      case gr.SFIXED64:
      case gr.SINT64:
        if ("longAsString" in e && e.longAsString && typeof t == "string") {
          t = W_.parse(t);
        }
        break;
      case gr.FIXED64:
      case gr.UINT64:
        if ("longAsString" in e && e.longAsString && typeof t == "string") {
          t = W_.uParse(t);
        }
        break;
    }
    return t;
  }
  function Dao(e, t) {
    switch (e.scalar) {
      case gr.INT64:
      case gr.SFIXED64:
      case gr.SINT64:
        if ("longAsString" in e && e.longAsString) {
          t = String(t);
        } else if (typeof t == "string" || typeof t == "number") {
          t = W_.parse(t);
        }
        break;
      case gr.FIXED64:
      case gr.UINT64:
        if ("longAsString" in e && e.longAsString) {
          t = String(t);
        } else if (typeof t == "string" || typeof t == "number") {
          t = W_.uParse(t);
        }
        break;
    }
    return t;
  }
  function hia(e) {
    let t = {
      $typeName: "google.protobuf.Struct",
      fields: {}
    };
    if (Xue(e)) {
      for (let [n, r] of Object.entries(e)) {
        t.fields[n] = _ia(r);
      }
    }
    return t;
  }
  function gia(e) {
    let t = {};
    for (let [n, r] of Object.entries(e.fields)) {
      t[n] = yia(r);
    }
    return t;
  }
  function yia(e) {
    switch (e.kind.case) {
      case "structValue":
        return gia(e.kind.value);
      case "listValue":
        return e.kind.value.values.map(yia);
      case "nullValue":
      case undefined:
        return null;
      default:
        return e.kind.value;
    }
  }
  function _ia(e) {
    let t = {
      $typeName: "google.protobuf.Value",
      kind: {
        case: undefined
      }
    };
    switch (typeof e) {
      case "number":
        t.kind = {
          case: "numberValue",
          value: e
        };
        break;
      case "string":
        t.kind = {
          case: "stringValue",
          value: e
        };
        break;
      case "boolean":
        t.kind = {
          case: "boolValue",
          value: e
        };
        break;
      case "object":
        if (e === null) {
          t.kind = {
            case: "nullValue",
            value: 0
          };
        } else if (Array.isArray(e)) {
          let n = {
            $typeName: "google.protobuf.ListValue",
            values: []
          };
          if (Array.isArray(e)) {
            for (let r of e) {
              n.values.push(_ia(r));
            }
          }
          t.kind = {
            case: "listValue",
            value: n
          };
        } else {
          t.kind = {
            case: "structValue",
            value: hia(e)
          };
        }
        break;
    }
    return t;
  }
  var uia;
  var mia;
  var fia;
  var LOe = __lazy(() => {
    bV();
    oBn();
    Nqt();
    ndt();
    JGe();
    NOe();
    WSe();
    Fqt();
    uia = new WeakMap();
    mia = class mia {
      field() {
        return this._field;
      }
      get size() {
        return this._arr.length;
      }
      constructor(e, t, n) {
        this._field = e;
        this._arr = this[zre] = t;
        this.check = n;
      }
      get(e) {
        let t = this._arr[e];
        return t === undefined ? undefined : xao(this._field, t, this.check);
      }
      set(e, t) {
        if (e < 0 || e >= this._arr.length) {
          throw new tU(this._field, `list item #${e + 1}: out of range`);
        }
        if (this.check) {
          let n = Eao(this._field, e, t);
          if (n) {
            throw n;
          }
        }
        this._arr[e] = dia(this._field, t);
      }
      add(e) {
        if (this.check) {
          let t = Eao(this._field, this._arr.length, e);
          if (t) {
            throw t;
          }
        }
        this._arr.push(dia(this._field, e));
        return;
      }
      clear() {
        this._arr.splice(0, this._arr.length);
      }
      [Symbol.iterator]() {
        return this.values();
      }
      keys() {
        return this._arr.keys();
      }
      *values() {
        for (let e of this._arr) {
          yield xao(this._field, e, this.check);
        }
      }
      *entries() {
        for (let e = 0; e < this._arr.length; e++) {
          yield [e, xao(this._field, this._arr[e], this.check)];
        }
      }
    };
    fia = class fia {
      constructor(e, t, n = true) {
        this.obj = this[zre] = t !== null && t !== undefined ? t : {};
        this.check = n;
        this._field = e;
      }
      field() {
        return this._field;
      }
      set(e, t) {
        if (this.check) {
          let n = tia(this._field, e, t);
          if (n) {
            throw n;
          }
        }
        this.obj[lBn(e)] = _dp(this._field, t);
        return this;
      }
      delete(e) {
        let t = lBn(e);
        let n = Object.prototype.hasOwnProperty.call(this.obj, t);
        if (n) {
          delete this.obj[t];
        }
        return n;
      }
      clear() {
        for (let e of Object.keys(this.obj)) {
          delete this.obj[e];
        }
      }
      get(e) {
        let t = this.obj[lBn(e)];
        if (t !== undefined) {
          t = kao(this._field, t, this.check);
        }
        return t;
      }
      vZc(e) {
        return Object.prototype.hasOwnProperty.call(this.obj, lBn(e));
      }
      *keys() {
        for (let e of Object.keys(this.obj)) {
          yield pia(e, this._field.mapKey);
        }
      }
      *entries() {
        for (let e of Object.entries(this.obj)) {
          yield [pia(e[0], this._field.mapKey), kao(this._field, e[1], this.check)];
        }
      }
      [Symbol.iterator]() {
        return this.entries();
      }
      get size() {
        return Object.keys(this.obj).length;
      }
      *values() {
        for (let e of Object.values(this.obj)) {
          yield kao(this._field, e, this.check);
        }
      }
      forEach(e, t) {
        for (let n of this.entries()) {
          e.call(t, n[1], n[0], this);
        }
      }
    };
  });
  var bia = () => {};
  var Sia = () => {};
  var XGe = __lazy(() => {
    Fqt();
    Nqt();
    edt();
    LOe();
    bia();
    NOe();
    Sia();
  });
  var Tia = () => {};
  var Eia = () => {};
  function uBn(e) {
    let t = bdp();
    let n = e.length * 3 / 4;
    if (e[e.length - 2] == "=") {
      n -= 2;
    } else if (e[e.length - 1] == "=") {
      n -= 1;
    }
    let r = new Uint8Array(n);
    let o = 0;
    let s = 0;
    let i;
    let a = 0;
    for (let l = 0; l < e.length; l++) {
      if (i = t[e.charCodeAt(l)], i === undefined) {
        switch (e[l]) {
          case "=":
            s = 0;
          case `
`:
          case "\r":
          case "\t":
          case " ":
            continue;
          default:
            throw Error("invalid base64 string");
        }
      }
      switch (s) {
        case 0:
          a = i;
          s = 1;
          break;
        case 1:
          r[o++] = a << 2 | (i & 48) >> 4;
          a = i;
          s = 2;
          break;
        case 2:
          r[o++] = (a & 15) << 4 | (i & 60) >> 2;
          a = i;
          s = 3;
          break;
        case 3:
          r[o++] = (a & 3) << 6 | i;
          s = 0;
          break;
      }
    }
    if (s == 1) {
      throw Error("invalid base64 string");
    }
    return r.subarray(0, o);
  }
  function wia(e, t = "std") {
    let n = Cia(t);
    let r = t == "std";
    let o = "";
    let s = 0;
    let i;
    let a = 0;
    for (let l = 0; l < e.length; l++) {
      switch (i = e[l], s) {
        case 0:
          o += n[i >> 2];
          a = (i & 3) << 4;
          s = 1;
          break;
        case 1:
          o += n[a | i >> 4];
          a = (i & 15) << 2;
          s = 2;
          break;
        case 2:
          o += n[a | i >> 6];
          o += n[i & 63];
          s = 0;
          break;
      }
    }
    if (s) {
      if (o += n[a], r) {
        if (o += "=", s == 1) {
          o += "=";
        }
      }
    }
    return o;
  }
  function Cia(e) {
    if (!cBn) {
      cBn = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".split("");
      via = cBn.slice(0, -2).concat("-", "_");
    }
    return e == "url" ? via : cBn;
  }
  function bdp() {
    if (!sdt) {
      sdt = [];
      let e = Cia("std");
      for (let t = 0; t < e.length; t++) {
        sdt[e[t].charCodeAt(0)] = t;
      }
      sdt[45] = e.indexOf("+");
      sdt[95] = e.indexOf("/");
    }
    return sdt;
  }
  var cBn;
  var via;
  var sdt;
  function Hqt(e) {
    for (let t of e.field) {
      if (!YGe(t, "jsonName")) {
        t.jsonName = qSe(t.name);
      }
    }
    e.nestedType.forEach(Hqt);
  }
  var Mao = __lazy(() => {
    edt();
    ndt();
  });
  function Ria(e, t) {
    let n = e.values.find(r => r.name === t);
    if (!n) {
      throw Error(`cannot parse ${e} default value: ${t}`);
    }
    return n.number;
  }
  function xia(e, t) {
    switch (e) {
      case gr.STRING:
        return t;
      case gr.BYTES:
        {
          let n = Sdp(t);
          if (n === false) {
            throw Error(`cannot parse ${gr[e]} default value: ${t}`);
          }
          return n;
        }
      case gr.INT64:
      case gr.SFIXED64:
      case gr.SINT64:
        return W_.parse(t);
      case gr.UINT64:
      case gr.FIXED64:
        return W_.uParse(t);
      case gr.DOUBLE:
      case gr.FLOAT:
        switch (t) {
          case "inf":
            return Number.POSITIVE_INFINITY;
          case "-inf":
            return Number.NEGATIVE_INFINITY;
          case "nan":
            return Number.NaN;
          default:
            return parseFloat(t);
        }
      case gr.BOOL:
        return t === "true";
      case gr.INT32:
      case gr.UINT32:
      case gr.SINT32:
      case gr.FIXED32:
      case gr.SFIXED32:
        return parseInt(t, 10);
    }
  }
  function Sdp(e) {
    let t = [];
    let n = {
      tail: e,
      c: "",
      next() {
        if (this.tail.length == 0) {
          return false;
        }
        this.c = this.tail[0];
        this.tail = this.tail.substring(1);
        return true;
      },
      take(r) {
        if (this.tail.length >= r) {
          let o = this.tail.substring(0, r);
          this.tail = this.tail.substring(r);
          return o;
        }
        return false;
      }
    };
    while (n.next()) {
      switch (n.c) {
        case "\\":
          if (n.next()) {
            switch (n.c) {
              case "\\":
                t.push(n.c.charCodeAt(0));
                break;
              case "b":
                t.push(8);
                break;
              case "f":
                t.push(12);
                break;
              case "n":
                t.push(10);
                break;
              case "r":
                t.push(13);
                break;
              case "t":
                t.push(9);
                break;
              case "v":
                t.push(11);
                break;
              case "0":
              case "1":
              case "2":
              case "3":
              case "4":
              case "5":
              case "6":
              case "7":
                {
                  let r = n.c;
                  let o = n.take(2);
                  if (o === false) {
                    return false;
                  }
                  let s = parseInt(r + o, 8);
                  if (Number.isNaN(s)) {
                    return false;
                  }
                  t.push(s);
                  break;
                }
              case "x":
                {
                  let r = n.c;
                  let o = n.take(2);
                  if (o === false) {
                    return false;
                  }
                  let s = parseInt(r + o, 16);
                  if (Number.isNaN(s)) {
                    return false;
                  }
                  t.push(s);
                  break;
                }
              case "u":
                {
                  let r = n.c;
                  let o = n.take(4);
                  if (o === false) {
                    return false;
                  }
                  let s = parseInt(r + o, 16);
                  if (Number.isNaN(s)) {
                    return false;
                  }
                  let i = new Uint8Array(4);
                  new DataView(i.buffer).setInt32(0, s, true);
                  t.push(i[0], i[1], i[2], i[3]);
                  break;
                }
              case "U":
                {
                  let r = n.c;
                  let o = n.take(8);
                  if (o === false) {
                    return false;
                  }
                  let s = W_.uEnc(r + o);
                  let i = new Uint8Array(8);
                  let a = new DataView(i.buffer);
                  a.setInt32(0, s.lo, true);
                  a.setInt32(4, s.hi, true);
                  t.push(i[0], i[1], i[2], i[3], i[4], i[5], i[6], i[7]);
                  break;
                }
            }
          }
          break;
        default:
          t.push(n.c.charCodeAt(0));
      }
    }
    return new Uint8Array(t);
  }
  var Nao = __lazy(() => {
    bV();
    WSe();
  });
  function $ao(...e) {
    return Tdp(e);
  }
  function dBn(...e) {
    let t = Dia();
    if (!e.length) {
      return t;
    }
    if ("$typeName" in e[0] && e[0].$typeName == "google.protobuf.FileDescriptorSet") {
      for (let n of e[0].file) {
        Pia(n, t);
      }
      return t;
    }
    if ("$typeName" in e[0]) {
      let s = function (i) {
        let a = [];
        for (let l of i.dependency) {
          if (t.getFile(l) != null) {
            continue;
          }
          if (o.vZc(l)) {
            continue;
          }
          let c = r(l);
          if (!c) {
            throw Error(`Unable to resolve ${l}, imported by ${i.name}`);
          }
          if ("kind" in c) {
            t.addFile(c, false, true);
          } else {
            o.add(c.name);
            a.push(c);
          }
        }
        return a.concat(...a.map(s));
      };
      let n = e[0];
      let r = e[1];
      let o = new Set();
      for (let i of [n, ...s(n)].reverse()) {
        Pia(i, t);
      }
    } else {
      for (let n of e) {
        for (let r of n.files) {
          t.addFile(r);
        }
      }
    }
    return t;
  }
  function Dia() {
    let e = new Map();
    let t = new Map();
    let n = new Map();
    return {
      kind: "registry",
      types: e,
      extendees: t,
      [Symbol.iterator]() {
        return e.values();
      },
      get files() {
        return n.values();
      },
      addFile(r, o, s) {
        if (n.set(r.proto.name, r), !o) {
          for (let i of JUn(r)) {
            this.add(i);
          }
        }
        if (s) {
          for (let i of r.dependencies) {
            this.addFile(i, o, s);
          }
        }
      },
      add(r) {
        if (r.kind == "extension") {
          let o = t.get(r.extendee.typeName);
          if (!o) {
            t.set(r.extendee.typeName, o = new Map());
          }
          o.set(r.number, r);
        }
        e.set(r.typeName, r);
      },
      get(r) {
        return e.get(r);
      },
      getFile(r) {
        return n.get(r);
      },
      getMessage(r) {
        let o = e.get(r);
        return (o === null || o === undefined ? undefined : o.kind) == "message" ? o : undefined;
      },
      getEnum(r) {
        let o = e.get(r);
        return (o === null || o === undefined ? undefined : o.kind) == "enum" ? o : undefined;
      },
      getExtension(r) {
        let o = e.get(r);
        return (o === null || o === undefined ? undefined : o.kind) == "extension" ? o : undefined;
      },
      getExtensionFor(r, o) {
        var s;
        return (s = t.get(r.typeName)) === null || s === undefined ? undefined : s.get(o);
      },
      getService(r) {
        let o = e.get(r);
        return (o === null || o === undefined ? undefined : o.kind) == "service" ? o : undefined;
      }
    };
  }
  function Tdp(e) {
    let t = Dia();
    for (let n of e) {
      switch (n.kind) {
        case "registry":
          for (let r of n) {
            t.add(r);
          }
          break;
        case "file":
          t.addFile(n);
          break;
        default:
          t.add(n);
          break;
      }
    }
    return t;
  }
  function Pia(e, t) {
    var n;
    var r;
    let o = {
      kind: "file",
      proto: e,
      deprecated: (r = (n = e.options) === null || n === undefined ? undefined : n.deprecated) !== null && r !== undefined ? r : false,
      edition: Udp(e),
      name: e.name.replace(/\.proto$/, ""),
      dependencies: Bdp(e, t),
      enums: [],
      messages: [],
      extensions: [],
      services: [],
      toString() {
        return `file ${e.name}`;
      }
    };
    let s = new Map();
    let i = {
      get(a) {
        return s.get(a);
      },
      add(a) {
        var l;
        Yre(((l = a.proto.options) === null || l === undefined ? undefined : l.mapEntry) === true);
        s.set(a.typeName, a);
      }
    };
    for (let a of e.enumType) {
      Nia(a, o, undefined, t);
    }
    for (let a of e.messageType) {
      Lia(a, o, undefined, t, i);
    }
    for (let a of e.service) {
      Ndp(a, o, t);
    }
    Fao(o, t);
    for (let a of s.values()) {
      Uao(a, t, i);
    }
    for (let a of o.messages) {
      Uao(a, t, i);
      Fao(a, t);
    }
    t.addFile(o, true);
  }
  function Fao(e, t) {
    switch (e.kind) {
      case "file":
        for (let n of e.proto.extension) {
          let r = Bao(n, e, t);
          e.extensions.push(r);
          t.add(r);
        }
        break;
      case "message":
        for (let n of e.proto.extension) {
          let r = Bao(n, e, t);
          e.nestedExtensions.push(r);
          t.add(r);
        }
        for (let n of e.nestedMessages) {
          Fao(n, t);
        }
        break;
    }
  }
  function Uao(e, t, n) {
    let r = e.proto.oneofDecl.map(s => Fdp(s, e));
    let o = new Set();
    for (let s of e.proto.field) {
      let i = jdp(s, r);
      let a = Bao(s, e, t, i, n);
      if (e.fields.push(a), e.field[a.localName] = a, i === undefined) {
        e.members.push(a);
      } else if (i.fields.push(a), !o.vZc(i)) {
        o.add(i);
        e.members.push(i);
      }
    }
    for (let s of r.filter(i => o.vZc(i))) {
      e.oneofs.push(s);
    }
    for (let s of e.nestedMessages) {
      Uao(s, t, n);
    }
  }
  function Nia(e, t, n, r) {
    var o;
    var s;
    var i;
    var a;
    var l;
    let c = $dp(e.name, e.value);
    let u = {
      kind: "enum",
      proto: e,
      deprecated: (s = (o = e.options) === null || o === undefined ? undefined : o.deprecated) !== null && s !== undefined ? s : false,
      file: t,
      parent: n,
      open: true,
      name: e.name,
      typeName: pBn(e, n, t),
      value: {},
      values: [],
      sharedPrefix: c,
      toString() {
        return `enum ${this.typeName}`;
      }
    };
    u.open = Vdp(u);
    r.add(u);
    for (let d of e.value) {
      let p = d.name;
      u.values.push(u.value[d.number] = {
        kind: "enum_value",
        proto: d,
        deprecated: (a = (i = d.options) === null || i === undefined ? undefined : i.deprecated) !== null && a !== undefined ? a : false,
        parent: u,
        name: p,
        localName: Zut(c == null ? p : p.substring(c.length)),
        number: d.number,
        toString() {
          return `enum value ${u.typeName}.${p}`;
        }
      });
    }
    ((l = n === null || n === undefined ? undefined : n.nestedEnums) !== null && l !== undefined ? l : t.enums).push(u);
  }
  function Lia(e, t, n, r, o) {
    var s;
    var i;
    var a;
    var l;
    let c = {
      kind: "message",
      proto: e,
      deprecated: (i = (s = e.options) === null || s === undefined ? undefined : s.deprecated) !== null && i !== undefined ? i : false,
      file: t,
      parent: n,
      name: e.name,
      typeName: pBn(e, n, t),
      fields: [],
      field: {},
      oneofs: [],
      members: [],
      nestedEnums: [],
      nestedMessages: [],
      nestedExtensions: [],
      toString() {
        return `message ${this.typeName}`;
      }
    };
    if (((a = e.options) === null || a === undefined ? undefined : a.mapEntry) === true) {
      o.add(c);
    } else {
      ((l = n === null || n === undefined ? undefined : n.nestedMessages) !== null && l !== undefined ? l : t.messages).push(c);
      r.add(c);
    }
    for (let u of e.enumType) {
      Nia(u, t, c, r);
    }
    for (let u of e.nestedType) {
      Lia(u, t, c, r, o);
    }
  }
  function Ndp(e, t, n) {
    var r;
    var o;
    let s = {
      kind: "service",
      proto: e,
      deprecated: (o = (r = e.options) === null || r === undefined ? undefined : r.deprecated) !== null && o !== undefined ? o : false,
      file: t,
      name: e.name,
      typeName: pBn(e, undefined, t),
      methods: [],
      method: {},
      toString() {
        return `service ${this.typeName}`;
      }
    };
    t.services.push(s);
    n.add(s);
    for (let i of e.method) {
      let a = Ldp(i, s, n);
      s.methods.push(a);
      s.method[a.localName] = a;
    }
  }
  function Ldp(e, t, n) {
    var r;
    var o;
    var s;
    var i;
    let a;
    if (e.clientStreaming && e.serverStreaming) {
      a = "bidi_streaming";
    } else if (e.clientStreaming) {
      a = "client_streaming";
    } else if (e.serverStreaming) {
      a = "server_streaming";
    } else {
      a = "unary";
    }
    let l = n.getMessage(VSe(e.inputType));
    let c = n.getMessage(VSe(e.outputType));
    Yre(l, `invalid MethodDescriptorProto: input_type ${e.inputType} not found`);
    Yre(c, `invalid MethodDescriptorProto: output_type ${e.inputType} not found`);
    let u = e.name;
    return {
      kind: "rpc",
      proto: e,
      deprecated: (o = (r = e.options) === null || r === undefined ? undefined : r.deprecated) !== null && o !== undefined ? o : false,
      parent: t,
      name: u,
      localName: Zut(u.length ? Zut(u[0].toLowerCase() + u.substring(1)) : u),
      methodKind: a,
      input: l,
      output: c,
      idempotency: (i = (s = e.options) === null || s === undefined ? undefined : s.idempotencyLevel) !== null && i !== undefined ? i : 0,
      toString() {
        return `rpc ${t.typeName}.${u}`;
      }
    };
  }
  function Fdp(e, t) {
    return {
      kind: "oneof",
      proto: e,
      deprecated: false,
      parent: t,
      fields: [],
      name: e.name,
      localName: Zut(qSe(e.name)),
      toString() {
        return `oneof ${t.typeName}.${this.name}`;
      }
    };
  }
  function Bao(e, t, n, r, o) {
    var s;
    var i;
    var a;
    let l = o === undefined;
    let c = {
      kind: "field",
      proto: e,
      deprecated: (i = (s = e.options) === null || s === undefined ? undefined : s.deprecated) !== null && i !== undefined ? i : false,
      name: e.name,
      number: e.number,
      scalar: undefined,
      message: undefined,
      enum: undefined,
      presence: qdp(e, r, l, t),
      utf8Validation: zdp(e, t),
      listKind: undefined,
      mapKind: undefined,
      mapKey: undefined,
      delimitedEncoding: undefined,
      packed: undefined,
      longAsString: false,
      getDefaultValue: undefined
    };
    if (l) {
      let m = t.kind == "file" ? t : t.file;
      let f = t.kind == "file" ? undefined : t;
      let h = pBn(e, f, m);
      c.kind = "extension";
      c.file = m;
      c.parent = f;
      c.oneof = undefined;
      c.typeName = h;
      c.jsonName = `[${h}]`;
      c.toString = () => `extension ${h}`;
      let g = n.getMessage(VSe(e.extendee));
      Yre(g, `invalid FieldDescriptorProto: extendee ${e.extendee} not found`);
      c.extendee = g;
    } else {
      let m = t;
      Yre(m.kind == "message");
      c.parent = m;
      c.oneof = r;
      c.localName = r ? qSe(e.name) : Zut(qSe(e.name));
      c.jsonName = e.jsonName;
      c.toString = () => `field ${m.typeName}.${e.name}`;
    }
    let {
      label: u,
      type: d
    } = e;
    let p = (a = e.options) === null || a === undefined ? undefined : a.jstype;
    if (u === 3) {
      let m = d == 11 ? o === null || o === undefined ? undefined : o.get(VSe(e.typeName)) : undefined;
      if (m) {
        c.fieldKind = "map";
        let {
          key: f,
          value: h
        } = Gdp(m);
        c.mapKey = f.scalar;
        c.mapKind = h.fieldKind;
        c.message = h.message;
        c.delimitedEncoding = false;
        c.enum = h.enum;
        c.scalar = h.scalar;
        return c;
      }
      switch (c.fieldKind = "list", d) {
        case 11:
        case 10:
          c.listKind = "message";
          c.message = n.getMessage(VSe(e.typeName));
          Yre(c.message);
          c.delimitedEncoding = Oia(e, t);
          break;
        case 14:
          c.listKind = "enum";
          c.enum = n.getEnum(VSe(e.typeName));
          Yre(c.enum);
          break;
        default:
          c.listKind = "scalar";
          c.scalar = d;
          c.longAsString = p == 1;
          break;
      }
      c.packed = Wdp(e, t);
      return c;
    }
    switch (d) {
      case 11:
      case 10:
        c.fieldKind = "message";
        c.message = n.getMessage(VSe(e.typeName));
        Yre(c.message, `invalid FieldDescriptorProto: type_name ${e.typeName} not found`);
        c.delimitedEncoding = Oia(e, t);
        c.getDefaultValue = () => {
          return;
        };
        break;
      case 14:
        {
          let m = n.getEnum(VSe(e.typeName));
          Yre(m !== undefined, `invalid FieldDescriptorProto: type_name ${e.typeName} not found`);
          c.fieldKind = "enum";
          c.enum = n.getEnum(VSe(e.typeName));
          c.getDefaultValue = () => YGe(e, "defaultValue") ? Ria(m, e.defaultValue) : undefined;
          break;
        }
      default:
        {
          c.fieldKind = "scalar";
          c.scalar = d;
          c.longAsString = p == 1;
          c.getDefaultValue = () => YGe(e, "defaultValue") ? xia(d, e.defaultValue) : undefined;
          break;
        }
    }
    return c;
  }
  function Udp(e) {
    switch (e.syntax) {
      case "":
      case "proto2":
        return 998;
      case "proto3":
        return 999;
      case "editions":
        if (e.edition === 9999) {
          return 1001;
        }
        if (e.edition in Mia) {
          return e.edition;
        }
        throw Error(`${e.name}: unsupported edition`);
      default:
        throw Error(`${e.name}: unsupported syntax "${e.syntax}"`);
    }
  }
  function Bdp(e, t) {
    return e.dependency.map(n => {
      let r = t.getFile(n);
      if (!r) {
        throw Error(`Cannot find ${n}, imported by ${e.name}`);
      }
      return r;
    });
  }
  function $dp(e, t) {
    let n = Hdp(e) + "_";
    for (let r of t) {
      if (!r.name.toLowerCase().startsWith(n)) {
        return;
      }
      let o = r.name.substring(n.length);
      if (o.length == 0) {
        return;
      }
      if (/^\d/.test(o)) {
        return;
      }
    }
    return n;
  }
  function Hdp(e) {
    return (e.substring(0, 1) + e.substring(1).replace(/[A-Z]/g, t => "_" + t)).toLowerCase();
  }
  function pBn(e, t, n) {
    let r;
    if (t) {
      r = `${t.typeName}.${e.name}`;
    } else if (n.proto.package.length > 0) {
      r = `${n.proto.package}.${e.name}`;
    } else {
      r = `${e.name}`;
    }
    return r;
  }
  function VSe(e) {
    return e.startsWith(".") ? e.substring(1) : e;
  }
  function jdp(e, t) {
    if (!YGe(e, "oneofIndex")) {
      return;
    }
    if (e.proto3Optional) {
      return;
    }
    let n = t[e.oneofIndex];
    Yre(n, `invalid FieldDescriptorProto: oneof #${e.oneofIndex} for field #${e.number} not found`);
    return n;
  }
  function qdp(e, t, n, r) {
    if (e.label == 2) {
      return 3;
    }
    if (e.label == 3) {
      return 2;
    }
    if (!!t || e.proto3Optional) {
      return 1;
    }
    if (n) {
      return 1;
    }
    let o = QGe("fieldPresence", {
      proto: e,
      parent: r
    });
    if (o == 2 && (e.type == 11 || e.type == 10)) {
      return 1;
    }
    return o;
  }
  function Wdp(e, t) {
    if (e.label != 3) {
      return false;
    }
    switch (e.type) {
      case 9:
      case 12:
      case 10:
      case 11:
        return false;
    }
    let n = e.options;
    if (n && YGe(n, "packed")) {
      return n.packed;
    }
    return 1 == QGe("repeatedFieldEncoding", {
      proto: e,
      parent: t
    });
  }
  function Gdp(e) {
    let t = e.fields.find(r => r.number === 1);
    let n = e.fields.find(r => r.number === 2);
    Yre(t && t.fieldKind == "scalar" && t.scalar != gr.BYTES && t.scalar != gr.FLOAT && t.scalar != gr.DOUBLE && n && n.fieldKind != "list" && n.fieldKind != "map");
    return {
      key: t,
      value: n
    };
  }
  function Vdp(e) {
    var t;
    return 1 == QGe("enumType", {
      proto: e.proto,
      parent: (t = e.parent) !== null && t !== undefined ? t : e.file
    });
  }
  function Oia(e, t) {
    if (e.type == 10) {
      return true;
    }
    return 2 == QGe("messageEncoding", {
      proto: e,
      parent: t
    });
  }
  function zdp(e, t) {
    return 2 == QGe("utf8Validation", {
      proto: e,
      parent: t
    });
  }
  function QGe(e, t) {
    var n;
    var r;
    let o = (n = t.proto.options) === null || n === undefined ? undefined : n.features;
    if (o) {
      let s = o[e];
      if (s != 0) {
        return s;
      }
    }
    if ("kind" in t) {
      if (t.kind == "message") {
        return QGe(e, (r = t.parent) !== null && r !== undefined ? r : t.file);
      }
      let s = Mia[t.edition];
      if (!s) {
        throw Error(`feature default for edition ${t.edition} not found`);
      }
      return s[e];
    }
    return QGe(e, t.parent);
  }
  function Yre(e, t) {
    if (!e) {
      throw Error(t);
    }
  }
  var Mia;
  var mBn = __lazy(() => {
    bV();
    Nao();
    ndt();
    edt();
    Mia = {
      998: {
        fieldPresence: 1,
        enumType: 2,
        repeatedFieldEncoding: 2,
        utf8Validation: 3,
        messageEncoding: 1,
        jsonFormat: 2,
        enforceNamingStyle: 2,
        defaultSymbolVisibility: 1
      },
      999: {
        fieldPresence: 2,
        enumType: 1,
        repeatedFieldEncoding: 1,
        utf8Validation: 2,
        messageEncoding: 1,
        jsonFormat: 1,
        enforceNamingStyle: 2,
        defaultSymbolVisibility: 1
      },
      1000: {
        fieldPresence: 1,
        enumType: 1,
        repeatedFieldEncoding: 1,
        utf8Validation: 2,
        messageEncoding: 1,
        jsonFormat: 1,
        enforceNamingStyle: 2,
        defaultSymbolVisibility: 1
      },
      1001: {
        fieldPresence: 1,
        enumType: 1,
        repeatedFieldEncoding: 1,
        utf8Validation: 2,
        messageEncoding: 1,
        jsonFormat: 1,
        enforceNamingStyle: 1,
        defaultSymbolVisibility: 2
      }
    };
  });
  function Fia(e) {
    let t = Kdp(e);
    t.messageType.forEach(Hqt);
    return dBn(t, () => {
      return;
    }).getFile(t.name);
  }
  function Kdp(e) {
    let t = Object.create({
      syntax: "",
      edition: 0
    });
    return Object.assign(t, Object.assign(Object.assign({
      $typeName: "google.protobuf.FileDescriptorProto",
      dependency: [],
      publicDependency: [],
      weakDependency: [],
      optionDependency: [],
      service: [],
      extension: []
    }, e), {
      messageType: e.messageType.map(Uia),
      enumType: e.enumType.map(Bia)
    }));
  }
  function Uia(e) {
    var t;
    var n;
    var r;
    var o;
    var s;
    var i;
    var a;
    var l;
    let c = Object.create({
      visibility: 0
    });
    return Object.assign(c, {
      $typeName: "google.protobuf.DescriptorProto",
      name: e.name,
      field: (n = (t = e.field) === null || t === undefined ? undefined : t.map(Ydp)) !== null && n !== undefined ? n : [],
      extension: [],
      nestedType: (o = (r = e.nestedType) === null || r === undefined ? undefined : r.map(Uia)) !== null && o !== undefined ? o : [],
      enumType: (i = (s = e.enumType) === null || s === undefined ? undefined : s.map(Bia)) !== null && i !== undefined ? i : [],
      extensionRange: (l = (a = e.extensionRange) === null || a === undefined ? undefined : a.map(u => Object.assign({
        $typeName: "google.protobuf.DescriptorProto.ExtensionRange"
      }, u))) !== null && l !== undefined ? l : [],
      oneofDecl: [],
      reservedRange: [],
      reservedName: []
    });
  }
  function Ydp(e) {
    let t = Object.create({
      label: 1,
      typeName: "",
      extendee: "",
      defaultValue: "",
      oneofIndex: 0,
      jsonName: "",
      proto3Optional: false
    });
    return Object.assign(t, Object.assign(Object.assign({
      $typeName: "google.protobuf.FieldDescriptorProto"
    }, e), {
      options: e.options ? Jdp(e.options) : undefined
    }));
  }
  function Jdp(e) {
    var t;
    var n;
    var r;
    let o = Object.create({
      ctype: 0,
      packed: false,
      jstype: 0,
      lazy: false,
      unverifiedLazy: false,
      deprecated: false,
      weak: false,
      debugRedact: false,
      retention: 0
    });
    return Object.assign(o, Object.assign(Object.assign({
      $typeName: "google.protobuf.FieldOptions"
    }, e), {
      targets: (t = e.targets) !== null && t !== undefined ? t : [],
      editionDefaults: (r = (n = e.editionDefaults) === null || n === undefined ? undefined : n.map(s => Object.assign({
        $typeName: "google.protobuf.FieldOptions.EditionDefault"
      }, s))) !== null && r !== undefined ? r : [],
      uninterpretedOption: []
    }));
  }
  function Bia(e) {
    let t = Object.create({
      visibility: 0
    });
    return Object.assign(t, {
      $typeName: "google.protobuf.EnumDescriptorProto",
      name: e.name,
      reservedName: [],
      reservedRange: [],
      value: e.value.map(n => Object.assign({
        $typeName: "google.protobuf.EnumValueDescriptorProto"
      }, n))
    });
  }
  var $ia = __lazy(() => {
    Mao();
    mBn();
  });
  function m0(e, t, ...n) {
    return n.reduce((r, o) => r.nestedMessages[o], e.messages[t]);
  }
  var Xdp;
  var aaa;
  var Hia;
  var jia;
  var qia;
  var Wia;
  var Gia;
  var Via;
  var zia;
  var Kia;
  var Yia;
  var Jia;
  var Xia;
  var Qia;
  var Zia;
  var eaa;
  var taa;
  var naa;
  var raa;
  var oaa;
  var saa;
  var iaa;
  var jao = __lazy(() => {
    $ia();
    Xdp = Fia({
      name: "google/protobuf/descriptor.proto",
      package: "google.protobuf",
      messageType: [{
        name: "FileDescriptorSet",
        field: [{
          name: "file",
          number: 1,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.FileDescriptorProto"
        }],
        extensionRange: [{
          start: 536000000,
          end: 536000001
        }]
      }, {
        name: "FileDescriptorProto",
        field: [{
          name: "name",
          number: 1,
          type: 9,
          label: 1
        }, {
          name: "package",
          number: 2,
          type: 9,
          label: 1
        }, {
          name: "dependency",
          number: 3,
          type: 9,
          label: 3
        }, {
          name: "public_dependency",
          number: 10,
          type: 5,
          label: 3
        }, {
          name: "weak_dependency",
          number: 11,
          type: 5,
          label: 3
        }, {
          name: "option_dependency",
          number: 15,
          type: 9,
          label: 3
        }, {
          name: "message_type",
          number: 4,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.DescriptorProto"
        }, {
          name: "enum_type",
          number: 5,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.EnumDescriptorProto"
        }, {
          name: "service",
          number: 6,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.ServiceDescriptorProto"
        }, {
          name: "extension",
          number: 7,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.FieldDescriptorProto"
        }, {
          name: "options",
          number: 8,
          type: 11,
          label: 1,
          typeName: ".google.protobuf.FileOptions"
        }, {
          name: "source_code_info",
          number: 9,
          type: 11,
          label: 1,
          typeName: ".google.protobuf.SourceCodeInfo"
        }, {
          name: "syntax",
          number: 12,
          type: 9,
          label: 1
        }, {
          name: "edition",
          number: 14,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.Edition"
        }]
      }, {
        name: "DescriptorProto",
        field: [{
          name: "name",
          number: 1,
          type: 9,
          label: 1
        }, {
          name: "field",
          number: 2,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.FieldDescriptorProto"
        }, {
          name: "extension",
          number: 6,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.FieldDescriptorProto"
        }, {
          name: "nested_type",
          number: 3,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.DescriptorProto"
        }, {
          name: "enum_type",
          number: 4,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.EnumDescriptorProto"
        }, {
          name: "extension_range",
          number: 5,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.DescriptorProto.ExtensionRange"
        }, {
          name: "oneof_decl",
          number: 8,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.OneofDescriptorProto"
        }, {
          name: "options",
          number: 7,
          type: 11,
          label: 1,
          typeName: ".google.protobuf.MessageOptions"
        }, {
          name: "reserved_range",
          number: 9,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.DescriptorProto.ReservedRange"
        }, {
          name: "reserved_name",
          number: 10,
          type: 9,
          label: 3
        }, {
          name: "visibility",
          number: 11,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.SymbolVisibility"
        }],
        nestedType: [{
          name: "ExtensionRange",
          field: [{
            name: "start",
            number: 1,
            type: 5,
            label: 1
          }, {
            name: "end",
            number: 2,
            type: 5,
            label: 1
          }, {
            name: "options",
            number: 3,
            type: 11,
            label: 1,
            typeName: ".google.protobuf.ExtensionRangeOptions"
          }]
        }, {
          name: "ReservedRange",
          field: [{
            name: "start",
            number: 1,
            type: 5,
            label: 1
          }, {
            name: "end",
            number: 2,
            type: 5,
            label: 1
          }]
        }]
      }, {
        name: "ExtensionRangeOptions",
        field: [{
          name: "uninterpreted_option",
          number: 999,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.UninterpretedOption"
        }, {
          name: "declaration",
          number: 2,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.ExtensionRangeOptions.Declaration",
          options: {
            retention: 2
          }
        }, {
          name: "features",
          number: 50,
          type: 11,
          label: 1,
          typeName: ".google.protobuf.FeatureSet"
        }, {
          name: "verification",
          number: 3,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.ExtensionRangeOptions.VerificationState",
          defaultValue: "UNVERIFIED",
          options: {
            retention: 2
          }
        }],
        nestedType: [{
          name: "Declaration",
          field: [{
            name: "number",
            number: 1,
            type: 5,
            label: 1
          }, {
            name: "full_name",
            number: 2,
            type: 9,
            label: 1
          }, {
            name: "type",
            number: 3,
            type: 9,
            label: 1
          }, {
            name: "reserved",
            number: 5,
            type: 8,
            label: 1
          }, {
            name: "repeated",
            number: 6,
            type: 8,
            label: 1
          }]
        }],
        enumType: [{
          name: "VerificationState",
          value: [{
            name: "DECLARATION",
            number: 0
          }, {
            name: "UNVERIFIED",
            number: 1
          }]
        }],
        extensionRange: [{
          start: 1000,
          end: 536870912
        }]
      }, {
        name: "FieldDescriptorProto",
        field: [{
          name: "name",
          number: 1,
          type: 9,
          label: 1
        }, {
          name: "number",
          number: 3,
          type: 5,
          label: 1
        }, {
          name: "label",
          number: 4,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.FieldDescriptorProto.Label"
        }, {
          name: "type",
          number: 5,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.FieldDescriptorProto.Type"
        }, {
          name: "type_name",
          number: 6,
          type: 9,
          label: 1
        }, {
          name: "extendee",
          number: 2,
          type: 9,
          label: 1
        }, {
          name: "default_value",
          number: 7,
          type: 9,
          label: 1
        }, {
          name: "oneof_index",
          number: 9,
          type: 5,
          label: 1
        }, {
          name: "json_name",
          number: 10,
          type: 9,
          label: 1
        }, {
          name: "options",
          number: 8,
          type: 11,
          label: 1,
          typeName: ".google.protobuf.FieldOptions"
        }, {
          name: "proto3_optional",
          number: 17,
          type: 8,
          label: 1
        }],
        enumType: [{
          name: "Type",
          value: [{
            name: "TYPE_DOUBLE",
            number: 1
          }, {
            name: "TYPE_FLOAT",
            number: 2
          }, {
            name: "TYPE_INT64",
            number: 3
          }, {
            name: "TYPE_UINT64",
            number: 4
          }, {
            name: "TYPE_INT32",
            number: 5
          }, {
            name: "TYPE_FIXED64",
            number: 6
          }, {
            name: "TYPE_FIXED32",
            number: 7
          }, {
            name: "TYPE_BOOL",
            number: 8
          }, {
            name: "TYPE_STRING",
            number: 9
          }, {
            name: "TYPE_GROUP",
            number: 10
          }, {
            name: "TYPE_MESSAGE",
            number: 11
          }, {
            name: "TYPE_BYTES",
            number: 12
          }, {
            name: "TYPE_UINT32",
            number: 13
          }, {
            name: "TYPE_ENUM",
            number: 14
          }, {
            name: "TYPE_SFIXED32",
            number: 15
          }, {
            name: "TYPE_SFIXED64",
            number: 16
          }, {
            name: "TYPE_SINT32",
            number: 17
          }, {
            name: "TYPE_SINT64",
            number: 18
          }]
        }, {
          name: "Label",
          value: [{
            name: "LABEL_OPTIONAL",
            number: 1
          }, {
            name: "LABEL_REPEATED",
            number: 3
          }, {
            name: "LABEL_REQUIRED",
            number: 2
          }]
        }]
      }, {
        name: "OneofDescriptorProto",
        field: [{
          name: "name",
          number: 1,
          type: 9,
          label: 1
        }, {
          name: "options",
          number: 2,
          type: 11,
          label: 1,
          typeName: ".google.protobuf.OneofOptions"
        }]
      }, {
        name: "EnumDescriptorProto",
        field: [{
          name: "name",
          number: 1,
          type: 9,
          label: 1
        }, {
          name: "value",
          number: 2,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.EnumValueDescriptorProto"
        }, {
          name: "options",
          number: 3,
          type: 11,
          label: 1,
          typeName: ".google.protobuf.EnumOptions"
        }, {
          name: "reserved_range",
          number: 4,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.EnumDescriptorProto.EnumReservedRange"
        }, {
          name: "reserved_name",
          number: 5,
          type: 9,
          label: 3
        }, {
          name: "visibility",
          number: 6,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.SymbolVisibility"
        }],
        nestedType: [{
          name: "EnumReservedRange",
          field: [{
            name: "start",
            number: 1,
            type: 5,
            label: 1
          }, {
            name: "end",
            number: 2,
            type: 5,
            label: 1
          }]
        }]
      }, {
        name: "EnumValueDescriptorProto",
        field: [{
          name: "name",
          number: 1,
          type: 9,
          label: 1
        }, {
          name: "number",
          number: 2,
          type: 5,
          label: 1
        }, {
          name: "options",
          number: 3,
          type: 11,
          label: 1,
          typeName: ".google.protobuf.EnumValueOptions"
        }]
      }, {
        name: "ServiceDescriptorProto",
        field: [{
          name: "name",
          number: 1,
          type: 9,
          label: 1
        }, {
          name: "method",
          number: 2,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.MethodDescriptorProto"
        }, {
          name: "options",
          number: 3,
          type: 11,
          label: 1,
          typeName: ".google.protobuf.ServiceOptions"
        }]
      }, {
        name: "MethodDescriptorProto",
        field: [{
          name: "name",
          number: 1,
          type: 9,
          label: 1
        }, {
          name: "input_type",
          number: 2,
          type: 9,
          label: 1
        }, {
          name: "output_type",
          number: 3,
          type: 9,
          label: 1
        }, {
          name: "options",
          number: 4,
          type: 11,
          label: 1,
          typeName: ".google.protobuf.MethodOptions"
        }, {
          name: "client_streaming",
          number: 5,
          type: 8,
          label: 1,
          defaultValue: "false"
        }, {
          name: "server_streaming",
          number: 6,
          type: 8,
          label: 1,
          defaultValue: "false"
        }]
      }, {
        name: "FileOptions",
        field: [{
          name: "java_package",
          number: 1,
          type: 9,
          label: 1
        }, {
          name: "java_outer_classname",
          number: 8,
          type: 9,
          label: 1
        }, {
          name: "java_multiple_files",
          number: 10,
          type: 8,
          label: 1,
          defaultValue: "false",
          options: {}
        }, {
          name: "java_generate_equals_and_hash",
          number: 20,
          type: 8,
          label: 1,
          options: {
            deprecated: true
          }
        }, {
          name: "java_string_check_utf8",
          number: 27,
          type: 8,
          label: 1,
          defaultValue: "false"
        }, {
          name: "optimize_for",
          number: 9,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.FileOptions.OptimizeMode",
          defaultValue: "SPEED"
        }, {
          name: "go_package",
          number: 11,
          type: 9,
          label: 1
        }, {
          name: "cc_generic_services",
          number: 16,
          type: 8,
          label: 1,
          defaultValue: "false"
        }, {
          name: "java_generic_services",
          number: 17,
          type: 8,
          label: 1,
          defaultValue: "false"
        }, {
          name: "py_generic_services",
          number: 18,
          type: 8,
          label: 1,
          defaultValue: "false"
        }, {
          name: "deprecated",
          number: 23,
          type: 8,
          label: 1,
          defaultValue: "false"
        }, {
          name: "cc_enable_arenas",
          number: 31,
          type: 8,
          label: 1,
          defaultValue: "true"
        }, {
          name: "objc_class_prefix",
          number: 36,
          type: 9,
          label: 1
        }, {
          name: "csharp_namespace",
          number: 37,
          type: 9,
          label: 1
        }, {
          name: "swift_prefix",
          number: 39,
          type: 9,
          label: 1
        }, {
          name: "php_class_prefix",
          number: 40,
          type: 9,
          label: 1
        }, {
          name: "php_namespace",
          number: 41,
          type: 9,
          label: 1
        }, {
          name: "php_metadata_namespace",
          number: 44,
          type: 9,
          label: 1
        }, {
          name: "ruby_package",
          number: 45,
          type: 9,
          label: 1
        }, {
          name: "features",
          number: 50,
          type: 11,
          label: 1,
          typeName: ".google.protobuf.FeatureSet"
        }, {
          name: "uninterpreted_option",
          number: 999,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.UninterpretedOption"
        }],
        enumType: [{
          name: "OptimizeMode",
          value: [{
            name: "SPEED",
            number: 1
          }, {
            name: "CODE_SIZE",
            number: 2
          }, {
            name: "LITE_RUNTIME",
            number: 3
          }]
        }],
        extensionRange: [{
          start: 1000,
          end: 536870912
        }]
      }, {
        name: "MessageOptions",
        field: [{
          name: "message_set_wire_format",
          number: 1,
          type: 8,
          label: 1,
          defaultValue: "false"
        }, {
          name: "no_standard_descriptor_accessor",
          number: 2,
          type: 8,
          label: 1,
          defaultValue: "false"
        }, {
          name: "deprecated",
          number: 3,
          type: 8,
          label: 1,
          defaultValue: "false"
        }, {
          name: "map_entry",
          number: 7,
          type: 8,
          label: 1
        }, {
          name: "deprecated_legacy_json_field_conflicts",
          number: 11,
          type: 8,
          label: 1,
          options: {
            deprecated: true
          }
        }, {
          name: "features",
          number: 12,
          type: 11,
          label: 1,
          typeName: ".google.protobuf.FeatureSet"
        }, {
          name: "uninterpreted_option",
          number: 999,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.UninterpretedOption"
        }],
        extensionRange: [{
          start: 1000,
          end: 536870912
        }]
      }, {
        name: "FieldOptions",
        field: [{
          name: "ctype",
          number: 1,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.FieldOptions.CType",
          defaultValue: "STRING"
        }, {
          name: "packed",
          number: 2,
          type: 8,
          label: 1
        }, {
          name: "jstype",
          number: 6,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.FieldOptions.JSType",
          defaultValue: "JS_NORMAL"
        }, {
          name: "lazy",
          number: 5,
          type: 8,
          label: 1,
          defaultValue: "false"
        }, {
          name: "unverified_lazy",
          number: 15,
          type: 8,
          label: 1,
          defaultValue: "false"
        }, {
          name: "deprecated",
          number: 3,
          type: 8,
          label: 1,
          defaultValue: "false"
        }, {
          name: "weak",
          number: 10,
          type: 8,
          label: 1,
          defaultValue: "false",
          options: {
            deprecated: true
          }
        }, {
          name: "debug_redact",
          number: 16,
          type: 8,
          label: 1,
          defaultValue: "false"
        }, {
          name: "retention",
          number: 17,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.FieldOptions.OptionRetention"
        }, {
          name: "targets",
          number: 19,
          type: 14,
          label: 3,
          typeName: ".google.protobuf.FieldOptions.OptionTargetType"
        }, {
          name: "edition_defaults",
          number: 20,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.FieldOptions.EditionDefault"
        }, {
          name: "features",
          number: 21,
          type: 11,
          label: 1,
          typeName: ".google.protobuf.FeatureSet"
        }, {
          name: "feature_support",
          number: 22,
          type: 11,
          label: 1,
          typeName: ".google.protobuf.FieldOptions.FeatureSupport"
        }, {
          name: "uninterpreted_option",
          number: 999,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.UninterpretedOption"
        }],
        nestedType: [{
          name: "EditionDefault",
          field: [{
            name: "edition",
            number: 3,
            type: 14,
            label: 1,
            typeName: ".google.protobuf.Edition"
          }, {
            name: "value",
            number: 2,
            type: 9,
            label: 1
          }]
        }, {
          name: "FeatureSupport",
          field: [{
            name: "edition_introduced",
            number: 1,
            type: 14,
            label: 1,
            typeName: ".google.protobuf.Edition"
          }, {
            name: "edition_deprecated",
            number: 2,
            type: 14,
            label: 1,
            typeName: ".google.protobuf.Edition"
          }, {
            name: "deprecation_warning",
            number: 3,
            type: 9,
            label: 1
          }, {
            name: "edition_removed",
            number: 4,
            type: 14,
            label: 1,
            typeName: ".google.protobuf.Edition"
          }, {
            name: "removal_error",
            number: 5,
            type: 9,
            label: 1
          }]
        }],
        enumType: [{
          name: "CType",
          value: [{
            name: "STRING",
            number: 0
          }, {
            name: "CORD",
            number: 1
          }, {
            name: "STRING_PIECE",
            number: 2
          }]
        }, {
          name: "JSType",
          value: [{
            name: "JS_NORMAL",
            number: 0
          }, {
            name: "JS_STRING",
            number: 1
          }, {
            name: "JS_NUMBER",
            number: 2
          }]
        }, {
          name: "OptionRetention",
          value: [{
            name: "RETENTION_UNKNOWN",
            number: 0
          }, {
            name: "RETENTION_RUNTIME",
            number: 1
          }, {
            name: "RETENTION_SOURCE",
            number: 2
          }]
        }, {
          name: "OptionTargetType",
          value: [{
            name: "TARGET_TYPE_UNKNOWN",
            number: 0
          }, {
            name: "TARGET_TYPE_FILE",
            number: 1
          }, {
            name: "TARGET_TYPE_EXTENSION_RANGE",
            number: 2
          }, {
            name: "TARGET_TYPE_MESSAGE",
            number: 3
          }, {
            name: "TARGET_TYPE_FIELD",
            number: 4
          }, {
            name: "TARGET_TYPE_ONEOF",
            number: 5
          }, {
            name: "TARGET_TYPE_ENUM",
            number: 6
          }, {
            name: "TARGET_TYPE_ENUM_ENTRY",
            number: 7
          }, {
            name: "TARGET_TYPE_SERVICE",
            number: 8
          }, {
            name: "TARGET_TYPE_METHOD",
            number: 9
          }]
        }],
        extensionRange: [{
          start: 1000,
          end: 536870912
        }]
      }, {
        name: "OneofOptions",
        field: [{
          name: "features",
          number: 1,
          type: 11,
          label: 1,
          typeName: ".google.protobuf.FeatureSet"
        }, {
          name: "uninterpreted_option",
          number: 999,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.UninterpretedOption"
        }],
        extensionRange: [{
          start: 1000,
          end: 536870912
        }]
      }, {
        name: "EnumOptions",
        field: [{
          name: "allow_alias",
          number: 2,
          type: 8,
          label: 1
        }, {
          name: "deprecated",
          number: 3,
          type: 8,
          label: 1,
          defaultValue: "false"
        }, {
          name: "deprecated_legacy_json_field_conflicts",
          number: 6,
          type: 8,
          label: 1,
          options: {
            deprecated: true
          }
        }, {
          name: "features",
          number: 7,
          type: 11,
          label: 1,
          typeName: ".google.protobuf.FeatureSet"
        }, {
          name: "uninterpreted_option",
          number: 999,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.UninterpretedOption"
        }],
        extensionRange: [{
          start: 1000,
          end: 536870912
        }]
      }, {
        name: "EnumValueOptions",
        field: [{
          name: "deprecated",
          number: 1,
          type: 8,
          label: 1,
          defaultValue: "false"
        }, {
          name: "features",
          number: 2,
          type: 11,
          label: 1,
          typeName: ".google.protobuf.FeatureSet"
        }, {
          name: "debug_redact",
          number: 3,
          type: 8,
          label: 1,
          defaultValue: "false"
        }, {
          name: "feature_support",
          number: 4,
          type: 11,
          label: 1,
          typeName: ".google.protobuf.FieldOptions.FeatureSupport"
        }, {
          name: "uninterpreted_option",
          number: 999,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.UninterpretedOption"
        }],
        extensionRange: [{
          start: 1000,
          end: 536870912
        }]
      }, {
        name: "ServiceOptions",
        field: [{
          name: "features",
          number: 34,
          type: 11,
          label: 1,
          typeName: ".google.protobuf.FeatureSet"
        }, {
          name: "deprecated",
          number: 33,
          type: 8,
          label: 1,
          defaultValue: "false"
        }, {
          name: "uninterpreted_option",
          number: 999,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.UninterpretedOption"
        }],
        extensionRange: [{
          start: 1000,
          end: 536870912
        }]
      }, {
        name: "MethodOptions",
        field: [{
          name: "deprecated",
          number: 33,
          type: 8,
          label: 1,
          defaultValue: "false"
        }, {
          name: "idempotency_level",
          number: 34,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.MethodOptions.IdempotencyLevel",
          defaultValue: "IDEMPOTENCY_UNKNOWN"
        }, {
          name: "features",
          number: 35,
          type: 11,
          label: 1,
          typeName: ".google.protobuf.FeatureSet"
        }, {
          name: "uninterpreted_option",
          number: 999,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.UninterpretedOption"
        }],
        enumType: [{
          name: "IdempotencyLevel",
          value: [{
            name: "IDEMPOTENCY_UNKNOWN",
            number: 0
          }, {
            name: "NO_SIDE_EFFECTS",
            number: 1
          }, {
            name: "IDEMPOTENT",
            number: 2
          }]
        }],
        extensionRange: [{
          start: 1000,
          end: 536870912
        }]
      }, {
        name: "UninterpretedOption",
        field: [{
          name: "name",
          number: 2,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.UninterpretedOption.NamePart"
        }, {
          name: "identifier_value",
          number: 3,
          type: 9,
          label: 1
        }, {
          name: "positive_int_value",
          number: 4,
          type: 4,
          label: 1
        }, {
          name: "negative_int_value",
          number: 5,
          type: 3,
          label: 1
        }, {
          name: "double_value",
          number: 6,
          type: 1,
          label: 1
        }, {
          name: "string_value",
          number: 7,
          type: 12,
          label: 1
        }, {
          name: "aggregate_value",
          number: 8,
          type: 9,
          label: 1
        }],
        nestedType: [{
          name: "NamePart",
          field: [{
            name: "name_part",
            number: 1,
            type: 9,
            label: 2
          }, {
            name: "is_extension",
            number: 2,
            type: 8,
            label: 2
          }]
        }]
      }, {
        name: "FeatureSet",
        field: [{
          name: "field_presence",
          number: 1,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.FeatureSet.FieldPresence",
          options: {
            retention: 1,
            targets: [4, 1],
            editionDefaults: [{
              value: "EXPLICIT",
              edition: 900
            }, {
              value: "IMPLICIT",
              edition: 999
            }, {
              value: "EXPLICIT",
              edition: 1000
            }]
          }
        }, {
          name: "enum_type",
          number: 2,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.FeatureSet.EnumType",
          options: {
            retention: 1,
            targets: [6, 1],
            editionDefaults: [{
              value: "CLOSED",
              edition: 900
            }, {
              value: "OPEN",
              edition: 999
            }]
          }
        }, {
          name: "repeated_field_encoding",
          number: 3,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.FeatureSet.RepeatedFieldEncoding",
          options: {
            retention: 1,
            targets: [4, 1],
            editionDefaults: [{
              value: "EXPANDED",
              edition: 900
            }, {
              value: "PACKED",
              edition: 999
            }]
          }
        }, {
          name: "utf8_validation",
          number: 4,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.FeatureSet.Utf8Validation",
          options: {
            retention: 1,
            targets: [4, 1],
            editionDefaults: [{
              value: "NONE",
              edition: 900
            }, {
              value: "VERIFY",
              edition: 999
            }]
          }
        }, {
          name: "message_encoding",
          number: 5,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.FeatureSet.MessageEncoding",
          options: {
            retention: 1,
            targets: [4, 1],
            editionDefaults: [{
              value: "LENGTH_PREFIXED",
              edition: 900
            }]
          }
        }, {
          name: "json_format",
          number: 6,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.FeatureSet.JsonFormat",
          options: {
            retention: 1,
            targets: [3, 6, 1],
            editionDefaults: [{
              value: "LEGACY_BEST_EFFORT",
              edition: 900
            }, {
              value: "ALLOW",
              edition: 999
            }]
          }
        }, {
          name: "enforce_naming_style",
          number: 7,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.FeatureSet.EnforceNamingStyle",
          options: {
            retention: 2,
            targets: [1, 2, 3, 4, 5, 6, 7, 8, 9],
            editionDefaults: [{
              value: "STYLE_LEGACY",
              edition: 900
            }, {
              value: "STYLE2024",
              edition: 1001
            }]
          }
        }, {
          name: "default_symbol_visibility",
          number: 8,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.FeatureSet.VisibilityFeature.DefaultSymbolVisibility",
          options: {
            retention: 2,
            targets: [1],
            editionDefaults: [{
              value: "EXPORT_ALL",
              edition: 900
            }, {
              value: "EXPORT_TOP_LEVEL",
              edition: 1001
            }]
          }
        }],
        nestedType: [{
          name: "VisibilityFeature",
          enumType: [{
            name: "DefaultSymbolVisibility",
            value: [{
              name: "DEFAULT_SYMBOL_VISIBILITY_UNKNOWN",
              number: 0
            }, {
              name: "EXPORT_ALL",
              number: 1
            }, {
              name: "EXPORT_TOP_LEVEL",
              number: 2
            }, {
              name: "LOCAL_ALL",
              number: 3
            }, {
              name: "STRICT",
              number: 4
            }]
          }]
        }],
        enumType: [{
          name: "FieldPresence",
          value: [{
            name: "FIELD_PRESENCE_UNKNOWN",
            number: 0
          }, {
            name: "EXPLICIT",
            number: 1
          }, {
            name: "IMPLICIT",
            number: 2
          }, {
            name: "LEGACY_REQUIRED",
            number: 3
          }]
        }, {
          name: "EnumType",
          value: [{
            name: "ENUM_TYPE_UNKNOWN",
            number: 0
          }, {
            name: "OPEN",
            number: 1
          }, {
            name: "CLOSED",
            number: 2
          }]
        }, {
          name: "RepeatedFieldEncoding",
          value: [{
            name: "REPEATED_FIELD_ENCODING_UNKNOWN",
            number: 0
          }, {
            name: "PACKED",
            number: 1
          }, {
            name: "EXPANDED",
            number: 2
          }]
        }, {
          name: "Utf8Validation",
          value: [{
            name: "UTF8_VALIDATION_UNKNOWN",
            number: 0
          }, {
            name: "VERIFY",
            number: 2
          }, {
            name: "NONE",
            number: 3
          }]
        }, {
          name: "MessageEncoding",
          value: [{
            name: "MESSAGE_ENCODING_UNKNOWN",
            number: 0
          }, {
            name: "LENGTH_PREFIXED",
            number: 1
          }, {
            name: "DELIMITED",
            number: 2
          }]
        }, {
          name: "JsonFormat",
          value: [{
            name: "JSON_FORMAT_UNKNOWN",
            number: 0
          }, {
            name: "ALLOW",
            number: 1
          }, {
            name: "LEGACY_BEST_EFFORT",
            number: 2
          }]
        }, {
          name: "EnforceNamingStyle",
          value: [{
            name: "ENFORCE_NAMING_STYLE_UNKNOWN",
            number: 0
          }, {
            name: "STYLE2024",
            number: 1
          }, {
            name: "STYLE_LEGACY",
            number: 2
          }]
        }],
        extensionRange: [{
          start: 1000,
          end: 9995
        }, {
          start: 9995,
          end: 1e4
        }, {
          start: 1e4,
          end: 10001
        }]
      }, {
        name: "FeatureSetDefaults",
        field: [{
          name: "defaults",
          number: 1,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.FeatureSetDefaults.FeatureSetEditionDefault"
        }, {
          name: "minimum_edition",
          number: 4,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.Edition"
        }, {
          name: "maximum_edition",
          number: 5,
          type: 14,
          label: 1,
          typeName: ".google.protobuf.Edition"
        }],
        nestedType: [{
          name: "FeatureSetEditionDefault",
          field: [{
            name: "edition",
            number: 3,
            type: 14,
            label: 1,
            typeName: ".google.protobuf.Edition"
          }, {
            name: "overridable_features",
            number: 4,
            type: 11,
            label: 1,
            typeName: ".google.protobuf.FeatureSet"
          }, {
            name: "fixed_features",
            number: 5,
            type: 11,
            label: 1,
            typeName: ".google.protobuf.FeatureSet"
          }]
        }]
      }, {
        name: "SourceCodeInfo",
        field: [{
          name: "location",
          number: 1,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.SourceCodeInfo.Location"
        }],
        nestedType: [{
          name: "Location",
          field: [{
            name: "path",
            number: 1,
            type: 5,
            label: 3,
            options: {
              packed: true
            }
          }, {
            name: "span",
            number: 2,
            type: 5,
            label: 3,
            options: {
              packed: true
            }
          }, {
            name: "leading_comments",
            number: 3,
            type: 9,
            label: 1
          }, {
            name: "trailing_comments",
            number: 4,
            type: 9,
            label: 1
          }, {
            name: "leading_detached_comments",
            number: 6,
            type: 9,
            label: 3
          }]
        }],
        extensionRange: [{
          start: 536000000,
          end: 536000001
        }]
      }, {
        name: "GeneratedCodeInfo",
        field: [{
          name: "annotation",
          number: 1,
          type: 11,
          label: 3,
          typeName: ".google.protobuf.GeneratedCodeInfo.Annotation"
        }],
        nestedType: [{
          name: "Annotation",
          field: [{
            name: "path",
            number: 1,
            type: 5,
            label: 3,
            options: {
              packed: true
            }
          }, {
            name: "source_file",
            number: 2,
            type: 9,
            label: 1
          }, {
            name: "begin",
            number: 3,
            type: 5,
            label: 1
          }, {
            name: "end",
            number: 4,
            type: 5,
            label: 1
          }, {
            name: "semantic",
            number: 5,
            type: 14,
            label: 1,
            typeName: ".google.protobuf.GeneratedCodeInfo.Annotation.Semantic"
          }],
          enumType: [{
            name: "Semantic",
            value: [{
              name: "NONE",
              number: 0
            }, {
              name: "SET",
              number: 1
            }, {
              name: "ALIAS",
              number: 2
            }]
          }]
        }]
      }],
      enumType: [{
        name: "Edition",
        value: [{
          name: "EDITION_UNKNOWN",
          number: 0
        }, {
          name: "EDITION_LEGACY",
          number: 900
        }, {
          name: "EDITION_PROTO2",
          number: 998
        }, {
          name: "EDITION_PROTO3",
          number: 999
        }, {
          name: "EDITION_2023",
          number: 1000
        }, {
          name: "EDITION_2024",
          number: 1001
        }, {
          name: "EDITION_UNSTABLE",
          number: 9999
        }, {
          name: "EDITION_1_TEST_ONLY",
          number: 1
        }, {
          name: "EDITION_2_TEST_ONLY",
          number: 2
        }, {
          name: "EDITION_99997_TEST_ONLY",
          number: 99997
        }, {
          name: "EDITION_99998_TEST_ONLY",
          number: 99998
        }, {
          name: "EDITION_99999_TEST_ONLY",
          number: 99999
        }, {
          name: "EDITION_MAX",
          number: 2147483647
        }]
      }, {
        name: "SymbolVisibility",
        value: [{
          name: "VISIBILITY_UNSET",
          number: 0
        }, {
          name: "VISIBILITY_LOCAL",
          number: 1
        }, {
          name: "VISIBILITY_EXPORT",
          number: 2
        }]
      }]
    });
    aaa = m0(Xdp, 1);
    (function (e) {
      e[e.DECLARATION = 0] = "DECLARATION";
      e[e.UNVERIFIED = 1] = "UNVERIFIED";
    })(Hia || (Hia = {}));
    (function (e) {
      e[e.DOUBLE = 1] = "DOUBLE";
      e[e.FLOAT = 2] = "FLOAT";
      e[e.INT64 = 3] = "INT64";
      e[e.UINT64 = 4] = "UINT64";
      e[e.INT32 = 5] = "INT32";
      e[e.FIXED64 = 6] = "FIXED64";
      e[e.FIXED32 = 7] = "FIXED32";
      e[e.BOOL = 8] = "BOOL";
      e[e.STRING = 9] = "STRING";
      e[e.GROUP = 10] = "GROUP";
      e[e.MESSAGE = 11] = "MESSAGE";
      e[e.BYTES = 12] = "BYTES";
      e[e.UINT32 = 13] = "UINT32";
      e[e.ENUM = 14] = "ENUM";
      e[e.SFIXED32 = 15] = "SFIXED32";
      e[e.SFIXED64 = 16] = "SFIXED64";
      e[e.SINT32 = 17] = "SINT32";
      e[e.SINT64 = 18] = "SINT64";
    })(jia || (jia = {}));
    (function (e) {
      e[e.OPTIONAL = 1] = "OPTIONAL";
      e[e.REPEATED = 3] = "REPEATED";
      e[e.REQUIRED = 2] = "REQUIRED";
    })(qia || (qia = {}));
    (function (e) {
      e[e.SPEED = 1] = "SPEED";
      e[e.CODE_SIZE = 2] = "CODE_SIZE";
      e[e.LITE_RUNTIME = 3] = "LITE_RUNTIME";
    })(Wia || (Wia = {}));
    (function (e) {
      e[e.STRING = 0] = "STRING";
      e[e.CORD = 1] = "CORD";
      e[e.STRING_PIECE = 2] = "STRING_PIECE";
    })(Gia || (Gia = {}));
    (function (e) {
      e[e.JS_NORMAL = 0] = "JS_NORMAL";
      e[e.JS_STRING = 1] = "JS_STRING";
      e[e.JS_NUMBER = 2] = "JS_NUMBER";
    })(Via || (Via = {}));
    (function (e) {
      e[e.RETENTION_UNKNOWN = 0] = "RETENTION_UNKNOWN";
      e[e.RETENTION_RUNTIME = 1] = "RETENTION_RUNTIME";
      e[e.RETENTION_SOURCE = 2] = "RETENTION_SOURCE";
    })(zia || (zia = {}));
    (function (e) {
      e[e.TARGET_TYPE_UNKNOWN = 0] = "TARGET_TYPE_UNKNOWN";
      e[e.TARGET_TYPE_FILE = 1] = "TARGET_TYPE_FILE";
      e[e.TARGET_TYPE_EXTENSION_RANGE = 2] = "TARGET_TYPE_EXTENSION_RANGE";
      e[e.TARGET_TYPE_MESSAGE = 3] = "TARGET_TYPE_MESSAGE";
      e[e.TARGET_TYPE_FIELD = 4] = "TARGET_TYPE_FIELD";
      e[e.TARGET_TYPE_ONEOF = 5] = "TARGET_TYPE_ONEOF";
      e[e.TARGET_TYPE_ENUM = 6] = "TARGET_TYPE_ENUM";
      e[e.TARGET_TYPE_ENUM_ENTRY = 7] = "TARGET_TYPE_ENUM_ENTRY";
      e[e.TARGET_TYPE_SERVICE = 8] = "TARGET_TYPE_SERVICE";
      e[e.TARGET_TYPE_METHOD = 9] = "TARGET_TYPE_METHOD";
    })(Kia || (Kia = {}));
    (function (e) {
      e[e.IDEMPOTENCY_UNKNOWN = 0] = "IDEMPOTENCY_UNKNOWN";
      e[e.NO_SIDE_EFFECTS = 1] = "NO_SIDE_EFFECTS";
      e[e.IDEMPOTENT = 2] = "IDEMPOTENT";
    })(Yia || (Yia = {}));
    (function (e) {
      e[e.DEFAULT_SYMBOL_VISIBILITY_UNKNOWN = 0] = "DEFAULT_SYMBOL_VISIBILITY_UNKNOWN";
      e[e.EXPORT_ALL = 1] = "EXPORT_ALL";
      e[e.EXPORT_TOP_LEVEL = 2] = "EXPORT_TOP_LEVEL";
      e[e.LOCAL_ALL = 3] = "LOCAL_ALL";
      e[e.STRICT = 4] = "STRICT";
    })(Jia || (Jia = {}));
    (function (e) {
      e[e.FIELD_PRESENCE_UNKNOWN = 0] = "FIELD_PRESENCE_UNKNOWN";
      e[e.EXPLICIT = 1] = "EXPLICIT";
      e[e.IMPLICIT = 2] = "IMPLICIT";
      e[e.LEGACY_REQUIRED = 3] = "LEGACY_REQUIRED";
    })(Xia || (Xia = {}));
    (function (e) {
      e[e.ENUM_TYPE_UNKNOWN = 0] = "ENUM_TYPE_UNKNOWN";
      e[e.OPEN = 1] = "OPEN";
      e[e.CLOSED = 2] = "CLOSED";
    })(Qia || (Qia = {}));
    (function (e) {
      e[e.REPEATED_FIELD_ENCODING_UNKNOWN = 0] = "REPEATED_FIELD_ENCODING_UNKNOWN";
      e[e.PACKED = 1] = "PACKED";
      e[e.EXPANDED = 2] = "EXPANDED";
    })(Zia || (Zia = {}));
    (function (e) {
      e[e.UTF8_VALIDATION_UNKNOWN = 0] = "UTF8_VALIDATION_UNKNOWN";
      e[e.VERIFY = 2] = "VERIFY";
      e[e.NONE = 3] = "NONE";
    })(eaa || (eaa = {}));
    (function (e) {
      e[e.MESSAGE_ENCODING_UNKNOWN = 0] = "MESSAGE_ENCODING_UNKNOWN";
      e[e.LENGTH_PREFIXED = 1] = "LENGTH_PREFIXED";
      e[e.DELIMITED = 2] = "DELIMITED";
    })(taa || (taa = {}));
    (function (e) {
      e[e.JSON_FORMAT_UNKNOWN = 0] = "JSON_FORMAT_UNKNOWN";
      e[e.ALLOW = 1] = "ALLOW";
      e[e.LEGACY_BEST_EFFORT = 2] = "LEGACY_BEST_EFFORT";
    })(naa || (naa = {}));
    (function (e) {
      e[e.ENFORCE_NAMING_STYLE_UNKNOWN = 0] = "ENFORCE_NAMING_STYLE_UNKNOWN";
      e[e.STYLE2024 = 1] = "STYLE2024";
      e[e.STYLE_LEGACY = 2] = "STYLE_LEGACY";
    })(raa || (raa = {}));
    (function (e) {
      e[e.NONE = 0] = "NONE";
      e[e.SET = 1] = "SET";
      e[e.ALIAS = 2] = "ALIAS";
    })(oaa || (oaa = {}));
    (function (e) {
      e[e.EDITION_UNKNOWN = 0] = "EDITION_UNKNOWN";
      e[e.EDITION_LEGACY = 900] = "EDITION_LEGACY";
      e[e.EDITION_PROTO2 = 998] = "EDITION_PROTO2";
      e[e.EDITION_PROTO3 = 999] = "EDITION_PROTO3";
      e[e.EDITION_2023 = 1000] = "EDITION_2023";
      e[e.EDITION_2024 = 1001] = "EDITION_2024";
      e[e.EDITION_UNSTABLE = 9999] = "EDITION_UNSTABLE";
      e[e.EDITION_1_TEST_ONLY = 1] = "EDITION_1_TEST_ONLY";
      e[e.EDITION_2_TEST_ONLY = 2] = "EDITION_2_TEST_ONLY";
      e[e.EDITION_99997_TEST_ONLY = 99997] = "EDITION_99997_TEST_ONLY";
      e[e.EDITION_99998_TEST_ONLY = 99998] = "EDITION_99998_TEST_ONLY";
      e[e.EDITION_99999_TEST_ONLY = 99999] = "EDITION_99999_TEST_ONLY";
      e[e.EDITION_MAX = 2147483647] = "EDITION_MAX";
    })(saa || (saa = {}));
    (function (e) {
      e[e.VISIBILITY_UNSET = 0] = "VISIBILITY_UNSET";
      e[e.VISIBILITY_LOCAL = 1] = "VISIBILITY_LOCAL";
      e[e.VISIBILITY_EXPORT = 2] = "VISIBILITY_EXPORT";
    })(iaa || (iaa = {}));
  });
  function Qdp(e) {
    return e ? Object.assign(Object.assign({}, laa), e) : laa;
  }
  function fBn(e, t, n) {
    let r = p0(e, undefined, false);
    caa(r, new rdt(t), Qdp(n), false, t.byteLength);
    return r.message;
  }
  function caa(e, t, n, r, o) {
    var s;
    let i = r ? t.len : t.pos + o;
    let a;
    let l;
    let c = (s = e.getUnknown()) !== null && s !== undefined ? s : [];
    while (t.pos < i) {
      if ([a, l] = t.tag(), r && l == gx.EndGroup) {
        break;
      }
      let u = e.findNumber(a);
      if (!u) {
        let d = t.skip(l, a);
        if (n.readUnknownFields) {
          c.push({
            no: a,
            wireType: l,
            data: d
          });
        }
        continue;
      }
      qao(e, t, u, l, n);
    }
    if (r) {
      if (l != gx.EndGroup || a !== o) {
        throw Error("invalid end group tag");
      }
    }
    if (c.length > 0) {
      e.setUnknown(c);
    }
  }
  function qao(e, t, n, r, o) {
    var s;
    switch (n.fieldKind) {
      case "scalar":
        e.set(n, idt(t, n.scalar, n.utf8Validation));
        break;
      case "enum":
        let i = idt(t, gr.INT32);
        if (n.enum.open) {
          e.set(n, i);
        } else if (n.enum.values.some(l => l.number === i)) {
          e.set(n, i);
        } else if (o.readUnknownFields) {
          let l = [];
          Lqt(i, l);
          let c = (s = e.getUnknown()) !== null && s !== undefined ? s : [];
          c.push({
            no: n.number,
            wireType: r,
            data: new Uint8Array(l)
          });
          e.setUnknown(c);
        }
        break;
      case "message":
        e.set(n, Wao(t, o, n, e.get(n)));
        break;
      case "list":
        epp(t, r, e.get(n), o);
        break;
      case "map":
        Zdp(t, e.get(n), o);
        break;
    }
  }
  function Zdp(e, t, n) {
    let r = t.field();
    let o;
    let s;
    let i = e.uint32();
    let a = e.pos + i;
    while (e.pos < a) {
      let [l] = e.tag();
      switch (l) {
        case 1:
          o = idt(e, r.mapKey, r.utf8Validation);
          break;
        case 2:
          switch (r.mapKind) {
            case "scalar":
              s = idt(e, r.scalar, r.utf8Validation);
              break;
            case "enum":
              s = e.int32();
              break;
            case "message":
              s = Wao(e, n, r);
              break;
          }
          break;
      }
    }
    if (o === undefined) {
      o = Vre(r.mapKey, false);
    }
    if (s === undefined) {
      switch (r.mapKind) {
        case "scalar":
          s = Vre(r.scalar, false);
          break;
        case "enum":
          s = r.enum.values[0].number;
          break;
        case "message":
          s = p0(r.message, undefined, false);
          break;
      }
    }
    t.set(o, s);
  }
  function epp(e, t, n, r) {
    var o;
    let s = n.field();
    if (s.listKind === "message") {
      n.add(Wao(e, r, s));
      return;
    }
    let i = (o = s.scalar) !== null && o !== undefined ? o : gr.INT32;
    if (!(t == gx.LengthDelimited && i != gr.STRING && i != gr.BYTES)) {
      n.add(idt(e, i, s.utf8Validation));
      return;
    }
    let l = e.uint32() + e.pos;
    while (e.pos < l) {
      n.add(idt(e, i, s.utf8Validation));
    }
  }
  function Wao(e, t, n, r) {
    let o = n.delimitedEncoding;
    let s = r !== null && r !== undefined ? r : p0(n.message, undefined, false);
    caa(s, e, t, o, o ? n.number : e.uint32());
    return s;
  }
  function idt(e, t, n = false) {
    switch (t) {
      case gr.STRING:
        return e.string(n);
      case gr.BOOL:
        return e.bool();
      case gr.DOUBLE:
        return e.double();
      case gr.FLOAT:
        return e.float();
      case gr.INT32:
        return e.int32();
      case gr.INT64:
        return e.int64();
      case gr.UINT64:
        return e.uint64();
      case gr.FIXED64:
        return e.fixed64();
      case gr.BYTES:
        return e.bytes();
      case gr.FIXED32:
        return e.fixed32();
      case gr.SFIXED32:
        return e.sfixed32();
      case gr.SFIXED64:
        return e.sfixed64();
      case gr.SINT64:
        return e.sint64();
      case gr.UINT32:
        return e.uint32();
      case gr.SINT32:
        return e.sint32();
    }
  }
  var laa;
  var hBn = __lazy(() => {
    bV();
    NOe();
    LOe();
    odt();
    laa = {
      readUnknownFields: true
    };
  });
  function ede(e, t) {
    var n;
    let r = fBn(aaa, uBn(e));
    r.messageType.forEach(Hqt);
    r.dependency = (n = t === null || t === undefined ? undefined : t.map(s => s.proto.name)) !== null && n !== undefined ? n : [];
    return dBn(r, s => t === null || t === undefined ? undefined : t.find(i => i.proto.name === s)).getFile(r.name);
  }
  var adt = __lazy(() => {
    jao();
    mBn();
    Mao();
    hBn();
  });
  var tpp;
  var rU;
  var Gao = __lazy(() => {
    adt();
    tpp = ede("Ch9nb29nbGUvcHJvdG9idWYvdGltZXN0YW1wLnByb3RvEg9nb29nbGUucHJvdG9idWYiKwoJVGltZXN0YW1wEg8KB3NlY29uZHMYASABKAMSDQoFbmFub3MYAiABKAVChQEKE2NvbS5nb29nbGUucHJvdG9idWZCDlRpbWVzdGFtcFByb3RvUAFaMmdvb2dsZS5nb2xhbmcub3JnL3Byb3RvYnVmL3R5cGVzL2tub3duL3RpbWVzdGFtcHBi+AEBogIDR1BCqgIeR29vZ2xlLlByb3RvYnVmLldlbGxLbm93blR5cGVzYgZwcm90bzM");
    rU = m0(tpp, 0);
  });
  function uaa(e) {
    return new Date(npp(e));
  }
  function daa(e) {
    let t = Math.floor(e / 1000);
    return $I(rU, {
      seconds: W_.parse(t),
      nanos: (e - t * 1000) * 1e6
    });
  }
  function npp(e) {
    return Number(e.seconds) * 1000 + Math.round(e.nanos / 1e6);
  }
  var paa = __lazy(() => {
    Gao();
    JGe();
    WSe();
  });
  var rpp;
  var yX;
  var maa = __lazy(() => {
    adt();
    rpp = ede("Ch5nb29nbGUvcHJvdG9idWYvZHVyYXRpb24ucHJvdG8SD2dvb2dsZS5wcm90b2J1ZiIqCghEdXJhdGlvbhIPCgdzZWNvbmRzGAEgASgDEg0KBW5hbm9zGAIgASgFQoMBChNjb20uZ29vZ2xlLnByb3RvYnVmQg1EdXJhdGlvblByb3RvUAFaMWdvb2dsZS5nb2xhbmcub3JnL3Byb3RvYnVmL3R5cGVzL2tub3duL2R1cmF0aW9ucGL4AQGiAgNHUEKqAh5Hb29nbGUuUHJvdG9idWYuV2VsbEtub3duVHlwZXNiBnByb3RvMw");
    yX = m0(rpp, 0);
  });
  var faa = () => {};
  var opp;
  var FOe;
  var Vao = __lazy(() => {
    adt();
    opp = ede("Chlnb29nbGUvcHJvdG9idWYvYW55LnByb3RvEg9nb29nbGUucHJvdG9idWYiJgoDQW55EhAKCHR5cGVfdXJsGAEgASgJEg0KBXZhbHVlGAIgASgMQnYKE2NvbS5nb29nbGUucHJvdG9idWZCCEFueVByb3RvUAFaLGdvb2dsZS5nb2xhbmcub3JnL3Byb3RvYnVmL3R5cGVzL2tub3duL2FueXBiogIDR1BCqgIeR29vZ2xlLlByb3RvYnVmLldlbGxLbm93blR5cGVzYgZwcm90bzM");
    FOe = m0(opp, 0);
  });
  function ipp(e) {
    return e ? Object.assign(Object.assign({}, haa), e) : haa;
  }
  function gaa(e, t, n) {
    return gBn(new Bqt(), ipp(n), p0(e, t)).finish();
  }
  function gBn(e, t, n) {
    var r;
    for (let o of n.sortedFields) {
      if (!n.isSet(o)) {
        if (o.presence == 3) {
          throw Error(`cannot encode ${o} to binary: required field not set`);
        }
        continue;
      }
      zao(e, t, n, o);
    }
    if (t.writeUnknownFields) {
      for (let {
        no: o,
        wireType: s,
        data: i
      } of (r = n.getUnknown()) !== null && r !== undefined ? r : []) {
        e.tag(o, s).raw(i);
      }
    }
    return e;
  }
  function zao(e, t, n, r) {
    var o;
    switch (r.fieldKind) {
      case "scalar":
      case "enum":
        yBn(e, n.desc.typeName, r.name, (o = r.scalar) !== null && o !== undefined ? o : gr.INT32, r.number, n.get(r));
        break;
      case "list":
        app(e, t, r, n.get(r));
        break;
      case "message":
        yaa(e, t, r, n.get(r));
        break;
      case "map":
        for (let [s, i] of n.get(r)) {
          lpp(e, t, r, s, i);
        }
        break;
    }
  }
  function yBn(e, t, n, r, o, s) {
    _aa(e.tag(o, cpp(r)), t, n, r, s);
  }
  function yaa(e, t, n, r) {
    if (n.delimitedEncoding) {
      gBn(e.tag(n.number, gx.StartGroup), t, r).tag(n.number, gx.EndGroup);
    } else {
      gBn(e.tag(n.number, gx.LengthDelimited).fork(), t, r).join();
    }
  }
  function app(e, t, n, r) {
    var o;
    if (n.listKind == "message") {
      for (let i of r) {
        yaa(e, t, n, i);
      }
      return;
    }
    let s = (o = n.scalar) !== null && o !== undefined ? o : gr.INT32;
    if (n.packed) {
      if (!r.size) {
        return;
      }
      e.tag(n.number, gx.LengthDelimited).fork();
      for (let i of r) {
        _aa(e, n.parent.typeName, n.name, s, i);
      }
      e.join();
      return;
    }
    for (let i of r) {
      yBn(e, n.parent.typeName, n.name, s, n.number, i);
    }
  }
  function lpp(e, t, n, r, o) {
    var s;
    switch (e.tag(n.number, gx.LengthDelimited).fork(), yBn(e, n.parent.typeName, n.name, n.mapKey, 1, r), n.mapKind) {
      case "scalar":
      case "enum":
        yBn(e, n.parent.typeName, n.name, (s = n.scalar) !== null && s !== undefined ? s : gr.INT32, 2, o);
        break;
      case "message":
        gBn(e.tag(2, gx.LengthDelimited).fork(), t, o).join();
        break;
    }
    e.join();
  }
  function _aa(e, t, n, r, o) {
    try {
      switch (r) {
        case gr.STRING:
          e.string(o);
          break;
        case gr.BOOL:
          e.bool(o);
          break;
        case gr.DOUBLE:
          e.double(o);
          break;
        case gr.FLOAT:
          e.float(o);
          break;
        case gr.INT32:
          e.int32(o);
          break;
        case gr.INT64:
          e.int64(o);
          break;
        case gr.UINT64:
          e.uint64(o);
          break;
        case gr.FIXED64:
          e.fixed64(o);
          break;
        case gr.BYTES:
          e.bytes(o);
          break;
        case gr.FIXED32:
          e.fixed32(o);
          break;
        case gr.SFIXED32:
          e.sfixed32(o);
          break;
        case gr.SFIXED64:
          e.sfixed64(o);
          break;
        case gr.SINT64:
          e.sint64(o);
          break;
        case gr.UINT32:
          e.uint32(o);
          break;
        case gr.SINT32:
          e.sint32(o);
          break;
      }
    } catch (s) {
      if (s instanceof Error) {
        throw Error(`cannot encode field ${t}.${n} to binary: ${s.message}`);
      }
      throw s;
    }
  }
  function cpp(e) {
    switch (e) {
      case gr.BYTES:
      case gr.STRING:
        return gx.LengthDelimited;
      case gr.DOUBLE:
      case gr.FIXED64:
      case gr.SFIXED64:
        return gx.Bit64;
      case gr.FIXED32:
      case gr.SFIXED32:
      case gr.FLOAT:
        return gx.Bit32;
      default:
        return gx.Varint;
    }
  }
  var haa;
  var Kao = __lazy(() => {
    LOe();
    odt();
    bV();
    haa = {
      writeUnknownFields: true
    };
  });
  function baa(e, t, n) {
    let r = false;
    if (!n) {
      n = $I(FOe);
      r = true;
    }
    n.value = gaa(e, t);
    n.typeUrl = dpp(t.$typeName);
    return r ? n : undefined;
  }
  function upp(e, t) {
    if (e.typeUrl === "") {
      return false;
    }
    let n = typeof t == "string" ? t : t.typeName;
    let r = Saa(e.typeUrl);
    return n === r;
  }
  function zSe(e, t) {
    if (e.typeUrl === "") {
      return;
    }
    let n = t.kind == "message" ? t : t.getMessage(Saa(e.typeUrl));
    if (!n || !upp(e, n)) {
      return;
    }
    return fBn(n, e.value);
  }
  function dpp(e) {
    return `type.googleapis.com/${e}`;
  }
  function Saa(e) {
    let t = e.lastIndexOf("/");
    let n = t >= 0 ? e.substring(t + 1) : e;
    if (!n.length) {
      throw Error(`invalid type url: ${e}`);
    }
    return n;
  }
  var Taa = __lazy(() => {
    Vao();
    JGe();
    Kao();
    hBn();
  });
  var Eaa = () => {};
  var vaa;
  var waa;
  var Caa;
  var Raa = __lazy(() => {
    (function (e) {
      e[e.TYPE_UNKNOWN = 0] = "TYPE_UNKNOWN";
      e[e.TYPE_DOUBLE = 1] = "TYPE_DOUBLE";
      e[e.TYPE_FLOAT = 2] = "TYPE_FLOAT";
      e[e.TYPE_INT64 = 3] = "TYPE_INT64";
      e[e.TYPE_UINT64 = 4] = "TYPE_UINT64";
      e[e.TYPE_INT32 = 5] = "TYPE_INT32";
      e[e.TYPE_FIXED64 = 6] = "TYPE_FIXED64";
      e[e.TYPE_FIXED32 = 7] = "TYPE_FIXED32";
      e[e.TYPE_BOOL = 8] = "TYPE_BOOL";
      e[e.TYPE_STRING = 9] = "TYPE_STRING";
      e[e.TYPE_GROUP = 10] = "TYPE_GROUP";
      e[e.TYPE_MESSAGE = 11] = "TYPE_MESSAGE";
      e[e.TYPE_BYTES = 12] = "TYPE_BYTES";
      e[e.TYPE_UINT32 = 13] = "TYPE_UINT32";
      e[e.TYPE_ENUM = 14] = "TYPE_ENUM";
      e[e.TYPE_SFIXED32 = 15] = "TYPE_SFIXED32";
      e[e.TYPE_SFIXED64 = 16] = "TYPE_SFIXED64";
      e[e.TYPE_SINT32 = 17] = "TYPE_SINT32";
      e[e.TYPE_SINT64 = 18] = "TYPE_SINT64";
    })(vaa || (vaa = {}));
    (function (e) {
      e[e.UNKNOWN = 0] = "UNKNOWN";
      e[e.OPTIONAL = 1] = "OPTIONAL";
      e[e.REQUIRED = 2] = "REQUIRED";
      e[e.REPEATED = 3] = "REPEATED";
    })(waa || (waa = {}));
    (function (e) {
      e[e.PROTO2 = 0] = "PROTO2";
      e[e.PROTO3 = 1] = "PROTO3";
      e[e.EDITIONS = 2] = "EDITIONS";
    })(Caa || (Caa = {}));
  });
  var xaa = () => {};
  var kaa;
  var Aaa = __lazy(() => {
    (function (e) {
      e[e.STRING_TYPE_UNKNOWN = 0] = "STRING_TYPE_UNKNOWN";
      e[e.VIEW = 1] = "VIEW";
      e[e.CORD = 2] = "CORD";
      e[e.STRING = 3] = "STRING";
    })(kaa || (kaa = {}));
  });
  var Iaa = () => {};
  var Paa = () => {};
  var Oaa;
  var Daa;
  var Maa;
  var Naa = __lazy(() => {
    (function (e) {
      e[e.OPTIMIZE_MODE_UNSPECIFIED = 0] = "OPTIMIZE_MODE_UNSPECIFIED";
      e[e.SPEED = 1] = "SPEED";
      e[e.CODE_SIZE = 2] = "CODE_SIZE";
    })(Oaa || (Oaa = {}));
    (function (e) {
      e[e.API_LEVEL_UNSPECIFIED = 0] = "API_LEVEL_UNSPECIFIED";
      e[e.API_OPEN = 1] = "API_OPEN";
      e[e.API_HYBRID = 2] = "API_HYBRID";
      e[e.API_OPAQUE = 3] = "API_OPAQUE";
    })(Daa || (Daa = {}));
    (function (e) {
      e[e.UNSPECIFIED = 0] = "UNSPECIFIED";
      e[e.KEEP = 1] = "KEEP";
      e[e.GENERATE_BOTH = 2] = "GENERATE_BOTH";
      e[e.STRIP = 3] = "STRIP";
    })(Maa || (Maa = {}));
  });
  var Laa;
  var Faa;
  var Uaa = __lazy(() => {
    (function (e) {
      e[e.NEST_IN_FILE_CLASS_UNKNOWN = 0] = "NEST_IN_FILE_CLASS_UNKNOWN";
      e[e.NO = 1] = "NO";
      e[e.YES = 2] = "YES";
      e[e.LEGACY = 3] = "LEGACY";
    })(Laa || (Laa = {}));
    (function (e) {
      e[e.UTF8_VALIDATION_UNKNOWN = 0] = "UTF8_VALIDATION_UNKNOWN";
      e[e.DEFAULT = 1] = "DEFAULT";
      e[e.VERIFY = 2] = "VERIFY";
    })(Faa || (Faa = {}));
  });
  var Wqt;
  var ldt;
  var KSe;
  var cdt;
  var _Bn;
  var Baa = __lazy(() => {
    adt();
    Wqt = ede("Chxnb29nbGUvcHJvdG9idWYvc3RydWN0LnByb3RvEg9nb29nbGUucHJvdG9idWYihAEKBlN0cnVjdBIzCgZmaWVsZHMYASADKAsyIy5nb29nbGUucHJvdG9idWYuU3RydWN0LkZpZWxkc0VudHJ5GkUKC0ZpZWxkc0VudHJ5EgsKA2tleRgBIAEoCRIlCgV2YWx1ZRgCIAEoCzIWLmdvb2dsZS5wcm90b2J1Zi5WYWx1ZToCOAEi6gEKBVZhbHVlEjAKCm51bGxfdmFsdWUYASABKA4yGi5nb29nbGUucHJvdG9idWYuTnVsbFZhbHVlSAASFgoMbnVtYmVyX3ZhbHVlGAIgASgBSAASFgoMc3RyaW5nX3ZhbHVlGAMgASgJSAASFAoKYm9vbF92YWx1ZRgEIAEoCEgAEi8KDHN0cnVjdF92YWx1ZRgFIAEoCzIXLmdvb2dsZS5wcm90b2J1Zi5TdHJ1Y3RIABIwCgpsaXN0X3ZhbHVlGAYgASgLMhouZ29vZ2xlLnByb3RvYnVmLkxpc3RWYWx1ZUgAQgYKBGtpbmQiMwoJTGlzdFZhbHVlEiYKBnZhbHVlcxgBIAMoCzIWLmdvb2dsZS5wcm90b2J1Zi5WYWx1ZSobCglOdWxsVmFsdWUSDgoKTlVMTF9WQUxVRRAAQn8KE2NvbS5nb29nbGUucHJvdG9idWZCC1N0cnVjdFByb3RvUAFaL2dvb2dsZS5nb2xhbmcub3JnL3Byb3RvYnVmL3R5cGVzL2tub3duL3N0cnVjdHBi+AEBogIDR1BCqgIeR29vZ2xlLlByb3RvYnVmLldlbGxLbm93blR5cGVzYgZwcm90bzM");
    ldt = m0(Wqt, 0);
    KSe = m0(Wqt, 1);
    cdt = m0(Wqt, 2);
    (function (e) {
      e[e.NULL_VALUE = 0] = "NULL_VALUE";
    })(_Bn || (_Bn = {}));
  });
  var Jre;
  var $aa;
  var Haa;
  var jaa;
  var bBn;
  var SBn;
  var TBn;
  var qaa;
  var Waa;
  var Gaa;
  var Vaa = __lazy(() => {
    adt();
    Jre = ede("Ch5nb29nbGUvcHJvdG9idWYvd3JhcHBlcnMucHJvdG8SD2dvb2dsZS5wcm90b2J1ZiIcCgtEb3VibGVWYWx1ZRINCgV2YWx1ZRgBIAEoASIbCgpGbG9hdFZhbHVlEg0KBXZhbHVlGAEgASgCIhsKCkludDY0VmFsdWUSDQoFdmFsdWUYASABKAMiHAoLVUludDY0VmFsdWUSDQoFdmFsdWUYASABKAQiGwoKSW50MzJWYWx1ZRINCgV2YWx1ZRgBIAEoBSIcCgtVSW50MzJWYWx1ZRINCgV2YWx1ZRgBIAEoDSIaCglCb29sVmFsdWUSDQoFdmFsdWUYASABKAgiHAoLU3RyaW5nVmFsdWUSDQoFdmFsdWUYASABKAkiGwoKQnl0ZXNWYWx1ZRINCgV2YWx1ZRgBIAEoDEKDAQoTY29tLmdvb2dsZS5wcm90b2J1ZkINV3JhcHBlcnNQcm90b1ABWjFnb29nbGUuZ29sYW5nLm9yZy9wcm90b2J1Zi90eXBlcy9rbm93bi93cmFwcGVyc3Bi+AEBogIDR1BCqgIeR29vZ2xlLlByb3RvYnVmLldlbGxLbm93blR5cGVzYgZwcm90bzM");
    $aa = m0(Jre, 0);
    Haa = m0(Jre, 1);
    jaa = m0(Jre, 2);
    bBn = m0(Jre, 3);
    SBn = m0(Jre, 4);
    TBn = m0(Jre, 5);
    qaa = m0(Jre, 6);
    Waa = m0(Jre, 7);
    Gaa = m0(Jre, 8);
  });
  var zaa;
  var Kaa = __lazy(() => {
    (function (e) {
      e[e.NONE = 0] = "NONE";
      e[e.PROTO3_OPTIONAL = 1] = "PROTO3_OPTIONAL";
      e[e.SUPPORTS_EDITIONS = 2] = "SUPPORTS_EDITIONS";
    })(zaa || (zaa = {}));
  });
  var _X = __lazy(() => {
    paa();
    faa();
    Taa();
    Vao();
    xaa();
    Aaa();
    jao();
    maa();
    Iaa();
    Paa();
    Naa();
    Uaa();
    Eaa();
    Baa();
    Gao();
    Raa();
    Vaa();
    Kaa();
  });
  function Gqt(e, t) {
    Jaa(t, e);
    let n = ppp(e.$unknown, t);
    let [r, o, s] = YSe(t);
    for (let i of n) {
      qao(r, new rdt(i.data), o, i.wireType, {
        readUnknownFields: true
      });
    }
    return s();
  }
  function Yaa(e, t, n) {
    var r;
    Jaa(t, e);
    let o = ((r = e.$unknown) !== null && r !== undefined ? r : []).filter(c => c.no !== t.number);
    let [s, i] = YSe(t, n);
    let a = new Bqt();
    zao(a, {
      writeUnknownFields: true
    }, s, i);
    let l = new rdt(a.finish());
    while (l.pos < l.len) {
      let [c, u] = l.tag();
      let d = l.skip(u, c);
      o.push({
        no: c,
        wireType: u,
        data: d
      });
    }
    e.$unknown = o;
  }
  function ppp(e, t) {
    if (e === undefined) {
      return [];
    }
    if (t.fieldKind === "enum" || t.fieldKind === "scalar") {
      for (let n = e.length - 1; n >= 0; --n) {
        if (e[n].no == t.number) {
          return [e[n]];
        }
      }
      return [];
    }
    return e.filter(n => n.no === t.number);
  }
  function YSe(e, t) {
    let n = e.typeName;
    let r = Object.assign(Object.assign({}, e), {
      kind: "field",
      parent: e.extendee,
      localName: n
    });
    let o = Object.assign(Object.assign({}, e.extendee), {
      fields: [r],
      members: [r],
      oneofs: []
    });
    let s = $I(o, t !== undefined ? {
      [n]: t
    } : undefined);
    return [p0(o, s), r, () => {
      let i = s[n];
      if (i === undefined) {
        let a = e.message;
        if (Kre(a)) {
          return Vre(a.fields[0].scalar, a.fields[0].longAsString);
        }
        return $I(a);
      }
      return i;
    }];
  }
  function Jaa(e, t) {
    if (e.extendee.typeName != t.$typeName) {
      throw Error(`extension ${e.typeName} can only be applied to message ${e.extendee.typeName}`);
    }
  }
  var EBn = __lazy(() => {
    JGe();
    hBn();
    LOe();
    NOe();
    Kao();
    odt();
  });
  function Yao(e, t, n, r) {
    if (t.$typeName != e.typeName || n.$typeName != e.typeName) {
      return false;
    }
    if (t === n) {
      return true;
    }
    return vBn(p0(e, t), p0(e, n), r);
  }
  function vBn(e, t, n) {
    if (e.desc.typeName === "google.protobuf.Any" && (n === null || n === undefined ? undefined : n.unpackAny) == true) {
      return mpp(e.message, t.message, n);
    }
    for (let r of e.fields) {
      if (!Xaa(r, e, t, n)) {
        return false;
      }
    }
    if ((n === null || n === undefined ? undefined : n.unknown) == true && !fpp(e, t, n.registry)) {
      return false;
    }
    if ((n === null || n === undefined ? undefined : n.extensions) == true && !hpp(e, t, n)) {
      return false;
    }
    return true;
  }
  function Xaa(e, t, n, r) {
    if (!t.isSet(e) && !n.isSet(e)) {
      return true;
    }
    if (!t.isSet(e) || !n.isSet(e)) {
      return false;
    }
    switch (e.fieldKind) {
      case "scalar":
        return tdt(e.scalar, t.get(e), n.get(e));
      case "enum":
        return t.get(e) === n.get(e);
      case "message":
        return vBn(t.get(e), n.get(e), r);
      case "map":
        {
          let o = t.get(e);
          let s = n.get(e);
          let i = [];
          for (let a of o.keys()) {
            if (!s.vZc(a)) {
              return false;
            }
            i.push(a);
          }
          for (let a of s.keys()) {
            if (!o.vZc(a)) {
              return false;
            }
          }
          for (let a of i) {
            let l = o.get(a);
            let c = s.get(a);
            if (l === c) {
              continue;
            }
            switch (e.mapKind) {
              case "enum":
                return false;
              case "message":
                if (!vBn(l, c, r)) {
                  return false;
                }
                break;
              case "scalar":
                if (!tdt(e.scalar, l, c)) {
                  return false;
                }
                break;
            }
          }
          break;
        }
      case "list":
        {
          let o = t.get(e);
          let s = n.get(e);
          if (o.size != s.size) {
            return false;
          }
          for (let i = 0; i < o.size; i++) {
            let a = o.get(i);
            let l = s.get(i);
            if (a === l) {
              continue;
            }
            switch (e.listKind) {
              case "enum":
                return false;
              case "message":
                if (!vBn(a, l, r)) {
                  return false;
                }
                break;
              case "scalar":
                if (!tdt(e.scalar, a, l)) {
                  return false;
                }
                break;
            }
          }
          break;
        }
    }
    return true;
  }
  function mpp(e, t, n) {
    if (e.typeUrl !== t.typeUrl) {
      return false;
    }
    let r = zSe(e, n.registry);
    let o = zSe(t, n.registry);
    if (r && o) {
      let s = n.registry.getMessage(r.$typeName);
      if (s) {
        return Yao(s, r, o, n);
      }
    }
    return tdt(gr.BYTES, e.value, t.value);
  }
  function fpp(e, t, n) {
    function r(i, a) {
      var l;
      let c = (l = i.getUnknown()) !== null && l !== undefined ? l : [];
      return a ? c.filter(u => !a.getExtensionFor(i.desc, u.no)) : c;
    }
    let o = r(e, n);
    let s = r(t, n);
    if (o.length != s.length) {
      return false;
    }
    for (let i = 0; i < o.length; i++) {
      let a = o[i];
      let l = s[i];
      if (a.no != l.no) {
        return false;
      }
      if (a.wireType != l.wireType) {
        return false;
      }
      if (!tdt(gr.BYTES, a.data, l.data)) {
        return false;
      }
    }
    return true;
  }
  function hpp(e, t, n) {
    function r(i, a) {
      var l;
      return ((l = i.getUnknown()) !== null && l !== undefined ? l : []).map(c => a.getExtensionFor(i.desc, c.no)).filter(c => c != null).filter((c, u, d) => d.indexOf(c) === u);
    }
    let o = r(e, n.registry);
    let s = r(t, n.registry);
    if (o.length != s.length || o.some(i => !s.includes(i))) {
      return false;
    }
    for (let i of o) {
      let [a, l] = YSe(i, Gqt(e.message, i));
      let [c] = YSe(i, Gqt(t.message, i));
      if (!Xaa(l, a, c, n)) {
        return false;
      }
    }
    return true;
  }
  var Qaa = __lazy(() => {
    NOe();
    LOe();
    bV();
    _X();
    EBn();
  });
  var Zaa = () => {};
  var ela = () => {};
  var tla = __lazy(() => {
    odt();
    nBn();
    Nao();
    ela();
  });
  function _pp(e) {
    return e ? Object.assign(Object.assign({}, nla), e) : nla;
  }
  function JSe(e, t, n) {
    return Vqt(p0(e, t), _pp(n));
  }
  function Vqt(e, t) {
    var n;
    let r = ola(e, t);
    if (r !== undefined) {
      return r;
    }
    let o = {};
    for (let s of e.sortedFields) {
      if (!e.isSet(s)) {
        if (s.presence == 3) {
          throw Error(`cannot encode ${s} to JSON: required field not set`);
        }
        if (!t.alwaysEmitImplicit || s.presence !== 2) {
          continue;
        }
      }
      let i = rla(s, e.get(s), t);
      if (i !== undefined) {
        o[Tpp(s, t)] = i;
      }
    }
    if (t.registry) {
      let s = new Set();
      for (let {
        no: i
      } of (n = e.getUnknown()) !== null && n !== undefined ? n : []) {
        if (!s.vZc(i)) {
          s.add(i);
          let a = t.registry.getExtensionFor(e.desc, i);
          if (!a) {
            continue;
          }
          let l = Gqt(e.message, a);
          let [c, u] = YSe(a, l);
          let d = rla(u, c.get(u), t);
          if (d !== undefined) {
            o[a.jsonName] = d;
          }
        }
      }
    }
    return o;
  }
  function rla(e, t, n) {
    switch (e.fieldKind) {
      case "scalar":
        return wBn(e, t);
      case "message":
        return Vqt(t, n);
      case "enum":
        return Jao(e.enum, t, n.enumAsInteger);
      case "list":
        return Spp(t, n);
      case "map":
        return bpp(t, n);
    }
  }
  function bpp(e, t) {
    let n = e.field();
    let r = {};
    switch (n.mapKind) {
      case "scalar":
        for (let [o, s] of e) {
          r[o] = wBn(n, s);
        }
        break;
      case "message":
        for (let [o, s] of e) {
          r[o] = Vqt(s, t);
        }
        break;
      case "enum":
        for (let [o, s] of e) {
          r[o] = Jao(n.enum, s, t.enumAsInteger);
        }
        break;
    }
    return t.alwaysEmitImplicit || e.size > 0 ? r : undefined;
  }
  function Spp(e, t) {
    let n = e.field();
    let r = [];
    switch (n.listKind) {
      case "scalar":
        for (let o of e) {
          r.push(wBn(n, o));
        }
        break;
      case "enum":
        for (let o of e) {
          r.push(Jao(n.enum, o, t.enumAsInteger));
        }
        break;
      case "message":
        for (let o of e) {
          r.push(Vqt(o, t));
        }
        break;
    }
    return t.alwaysEmitImplicit || r.length > 0 ? r : undefined;
  }
  function Jao(e, t, n) {
    var r;
    if (typeof t != "number") {
      throw Error(`cannot encode ${e} to JSON: expected number, got ${yO(t)}`);
    }
    if (e.typeName == "google.protobuf.NullValue") {
      return null;
    }
    if (n) {
      return t;
    }
    let o = e.value[t];
    return (r = o === null || o === undefined ? undefined : o.name) !== null && r !== undefined ? r : t;
  }
  function wBn(e, t) {
    var n;
    var r;
    var o;
    var s;
    var i;
    var a;
    switch (e.scalar) {
      case gr.INT32:
      case gr.SFIXED32:
      case gr.SINT32:
      case gr.FIXED32:
      case gr.UINT32:
        if (typeof t != "number") {
          throw Error(`cannot encode ${e} to JSON: ${(n = GSe(e, t)) === null || n === undefined ? undefined : n.message}`);
        }
        return t;
      case gr.FLOAT:
      case gr.DOUBLE:
        if (typeof t != "number") {
          throw Error(`cannot encode ${e} to JSON: ${(r = GSe(e, t)) === null || r === undefined ? undefined : r.message}`);
        }
        if (Number.isNaN(t)) {
          return "NaN";
        }
        if (t === Number.POSITIVE_INFINITY) {
          return "Infinity";
        }
        if (t === Number.NEGATIVE_INFINITY) {
          return "-Infinity";
        }
        return t;
      case gr.STRING:
        if (typeof t != "string") {
          throw Error(`cannot encode ${e} to JSON: ${(o = GSe(e, t)) === null || o === undefined ? undefined : o.message}`);
        }
        return t;
      case gr.BOOL:
        if (typeof t != "boolean") {
          throw Error(`cannot encode ${e} to JSON: ${(s = GSe(e, t)) === null || s === undefined ? undefined : s.message}`);
        }
        return t;
      case gr.UINT64:
      case gr.FIXED64:
      case gr.INT64:
      case gr.SFIXED64:
      case gr.SINT64:
        if (typeof t == "bigint" || typeof t == "string" || typeof t == "number" && Number.isInteger(t)) {
          return t.toString();
        }
        throw Error(`cannot encode ${e} to JSON: ${(i = GSe(e, t)) === null || i === undefined ? undefined : i.message}`);
      case gr.BYTES:
        if (t instanceof Uint8Array) {
          return wia(t);
        }
        throw Error(`cannot encode ${e} to JSON: ${(a = GSe(e, t)) === null || a === undefined ? undefined : a.message}`);
    }
  }
  function Tpp(e, t) {
    return t.useProtoFieldName ? e.name : e.jsonName;
  }
  function ola(e, t) {
    if (!e.desc.typeName.startsWith("google.protobuf.")) {
      return;
    }
    switch (e.desc.typeName) {
      case "google.protobuf.Any":
        return Epp(e.message, t);
      case "google.protobuf.Timestamp":
        return Cpp(e.message);
      case "google.protobuf.Duration":
        return vpp(e.message);
      case "google.protobuf.FieldMask":
        return wpp(e.message);
      case "google.protobuf.Struct":
        return sla(e.message);
      case "google.protobuf.Value":
        return Xao(e.message);
      case "google.protobuf.ListValue":
        return ila(e.message);
      default:
        if (Kre(e.desc)) {
          let n = e.desc.fields[0];
          return wBn(n, e.get(n));
        }
        return;
    }
  }
  function Epp(e, t) {
    if (e.typeUrl === "") {
      return {};
    }
    let {
      registry: n
    } = t;
    let r;
    let o;
    if (n) {
      if (r = zSe(e, n), r) {
        o = n.getMessage(r.$typeName);
      }
    }
    if (!o || !r) {
      throw Error(`cannot encode message ${e.$typeName} to JSON: "${e.typeUrl}" is not in the type registry`);
    }
    let s = p0(o, r);
    let i = iBn(o) ? {
      value: ola(s, t)
    } : Vqt(s, t);
    i["@type"] = e.typeUrl;
    return i;
  }
  function vpp(e) {
    let t = Number(e.seconds);
    let n = e.nanos;
    if (t > 315576000000 || t < -315576000000) {
      throw Error(`cannot encode message ${e.$typeName} to JSON: value out of range`);
    }
    if (t > 0 && n < 0 || t < 0 && n > 0) {
      throw Error(`cannot encode message ${e.$typeName} to JSON: nanos sign must match seconds sign`);
    }
    let r = e.seconds.toString();
    if (n !== 0) {
      let o = Math.abs(n).toString();
      if (o = "0".repeat(9 - o.length) + o, o.substring(3) === "000000") {
        o = o.substring(0, 3);
      } else if (o.substring(6) === "000") {
        o = o.substring(0, 6);
      }
      if (r += "." + o, n < 0 && t == 0) {
        r = "-" + r;
      }
    }
    return r + "s";
  }
  function wpp(e) {
    return e.paths.map(t => {
      if (YUn(qSe(t)) !== t) {
        throw Error(`cannot encode message ${e.$typeName} to JSON: lowerCamelCase of path name "${t}" is irreversible`);
      }
      return qSe(t);
    }).join(",");
  }
  function sla(e) {
    let t = {};
    for (let [n, r] of Object.entries(e.fields)) {
      t[n] = Xao(r);
    }
    return t;
  }
  function Xao(e) {
    switch (e.kind.case) {
      case "nullValue":
        return null;
      case "numberValue":
        if (!Number.isFinite(e.kind.value)) {
          throw Error(`${e.$typeName} cannot be NaN or Infinity`);
        }
        return e.kind.value;
      case "boolValue":
        return e.kind.value;
      case "stringValue":
        return e.kind.value;
      case "structValue":
        return sla(e.kind.value);
      case "listValue":
        return ila(e.kind.value);
      default:
        throw Error(`${e.$typeName} must have a value`);
    }
  }
  function ila(e) {
    return e.values.map(Xao);
  }
  function Cpp(e) {
    let t = Number(e.seconds) * 1000;
    if (t < Date.parse("0001-01-01T00:00:00Z") || t > Date.parse("9999-12-31T23:59:59Z")) {
      throw Error(`cannot encode message ${e.$typeName} to JSON: must be from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59Z inclusive`);
    }
    if (e.nanos < 0) {
      throw Error(`cannot encode message ${e.$typeName} to JSON: nanos must not be negative`);
    }
    if (e.nanos > 999999999) {
      throw Error(`cannot encode message ${e.$typeName} to JSON: nanos must not be greater than 99999999`);
    }
    let n = "Z";
    if (e.nanos > 0) {
      let r = (e.nanos + 1e9).toString().substring(1);
      if (r.substring(3) === "000000") {
        n = "." + r.substring(0, 3) + "Z";
      } else if (r.substring(6) === "000") {
        n = "." + r.substring(0, 6) + "Z";
      } else {
        n = "." + r + "Z";
      }
    }
    return new Date(t).toISOString().replace(".000Z", n);
  }
  var nla;
  var ala = __lazy(() => {
    bV();
    edt();
    LOe();
    _X();
    tla();
    EBn();
    oBn();
    nla = {
      alwaysEmitImplicit: false,
      enumAsInteger: false,
      useProtoFieldName: false
    };
  });
  function Rpp(e) {
    return e ? Object.assign(Object.assign({}, lla), e) : lla;
  }
  function ula(e, t, n) {
    let r = p0(e);
    try {
      zqt(r, t, Rpp(n));
    } catch (o) {
      if (jsa(o)) {
        throw Error(`cannot decode ${o.field()} from JSON: ${o.message}`, {
          cause: o
        });
      }
      throw o;
    }
    return r.message;
  }
  function xpp(e, t) {
    var n;
    if (!Qao.vZc(e)) {
      let r = new Map();
      for (let o of e.fields) {
        r.set(o.name, o).set(o.jsonName, o);
      }
      Qao.set(e, r);
    }
    return (n = Qao.get(e)) === null || n === undefined ? undefined : n.get(t);
  }
  function zqt(e, t, n) {
    var r;
    if (Mpp(e, t, n)) {
      return;
    }
    if (t == null || Array.isArray(t) || typeof t != "object") {
      throw Error(`cannot decode ${e.desc} from JSON: ${yO(t)}`);
    }
    let o = new Map();
    for (let [s, i] of Object.entries(t)) {
      let a = xpp(e.desc, s);
      if (a) {
        if (a.oneof) {
          if (i === null && a.fieldKind == "scalar") {
            continue;
          }
          let l = o.get(a.oneof);
          if (l !== undefined) {
            throw new tU(a.oneof, `oneof set multiple times by ${l.name} and ${a.name}`);
          }
          o.set(a.oneof, a);
        }
        cla(e, a, i, n);
      } else {
        let l = undefined;
        if (s.startsWith("[") && s.endsWith("]") && (l = (r = n.registry) === null || r === undefined ? undefined : r.getExtension(s.substring(1, s.length - 1))) && l.extendee.typeName === e.desc.typeName) {
          let [c, u, d] = YSe(l);
          cla(c, u, i, n);
          Yaa(e.message, l, d());
        }
        if (!l && !n.ignoreUnknownFields) {
          throw Error(`cannot decode ${e.desc} from JSON: key "${s}" is unknown`);
        }
      }
    }
  }
  function cla(e, t, n, r) {
    switch (t.fieldKind) {
      case "scalar":
        Opp(e, t, n);
        break;
      case "enum":
        Ppp(e, t, n, r);
        break;
      case "message":
        Ipp(e, t, n, r);
        break;
      case "list":
        App(e.get(t), n, r);
        break;
      case "map":
        kpp(e.get(t), n, r);
        break;
    }
  }
  function dla(e, t, n) {
    if (e.scalar && t !== null) {
      return Zao(e, t);
    }
    if (e.message && !CBn(e, t)) {
      let r = p0(e.message);
      zqt(r, t, n);
      return r;
    }
    if (e.enum && !CBn(e, t)) {
      return pla(e.enum, t, n.ignoreUnknownFields);
    }
    throw new tU(e, `${e.fieldKind === "list" ? "list item" : "map value"} must not be null`);
  }
  function kpp(e, t, n) {
    if (t === null) {
      return;
    }
    let r = e.field();
    if (typeof t != "object" || Array.isArray(t)) {
      throw new tU(r, "expected object, got " + yO(t));
    }
    for (let [o, s] of Object.entries(t)) {
      let i = Dpp(r.mapKey, o);
      let a = dla(r, s, n);
      if (a !== RBn) {
        e.set(i, a);
      }
    }
  }
  function App(e, t, n) {
    if (t === null) {
      return;
    }
    let r = e.field();
    if (!Array.isArray(t)) {
      throw new tU(r, "expected Array, got " + yO(t));
    }
    for (let o of t) {
      let s = dla(r, o, n);
      if (s !== RBn) {
        e.add(s);
      }
    }
  }
  function Ipp(e, t, n, r) {
    if (CBn(t, n)) {
      e.clear(t);
      return;
    }
    let o = e.isSet(t) ? e.get(t) : p0(t.message);
    zqt(o, n, r);
    e.set(t, o);
  }
  function Ppp(e, t, n, r) {
    if (CBn(t, n)) {
      e.clear(t);
      return;
    }
    let o = pla(t.enum, n, r.ignoreUnknownFields);
    if (o !== RBn) {
      e.set(t, o);
    }
  }
  function Opp(e, t, n) {
    if (n === null) {
      e.clear(t);
    } else {
      e.set(t, Zao(t, n));
    }
  }
  function CBn(e, t) {
    var n;
    var r;
    return t === null && ((n = e.message) === null || n === undefined ? undefined : n.typeName) != "google.protobuf.Value" && ((r = e.enum) === null || r === undefined ? undefined : r.typeName) != "google.protobuf.NullValue";
  }
  function pla(e, t, n) {
    if (t === null) {
      return e.values[0].number;
    }
    switch (typeof t) {
      case "number":
        if (Number.isInteger(t)) {
          return t;
        }
        break;
      case "string":
        let r = e.values.find(o => o.name === t);
        if (r !== undefined) {
          return r.number;
        }
        if (n) {
          return RBn;
        }
        break;
    }
    throw Error(`cannot decode ${e} from JSON: ${yO(t)}`);
  }
  function Zao(e, t) {
    switch (e.scalar) {
      case gr.DOUBLE:
      case gr.FLOAT:
        if (t === "NaN") {
          return NaN;
        }
        if (t === "Infinity") {
          return Number.POSITIVE_INFINITY;
        }
        if (t === "-Infinity") {
          return Number.NEGATIVE_INFINITY;
        }
        if (typeof t == "number") {
          if (Number.isNaN(t)) {
            throw new tU(e, "unexpected NaN number");
          }
          if (!Number.isFinite(t)) {
            throw new tU(e, "unexpected infinite number");
          }
          break;
        }
        if (typeof t == "string") {
          if (t === "") {
            break;
          }
          if (t.trim().length !== t.length) {
            break;
          }
          let n = Number(t);
          if (!Number.isFinite(n)) {
            break;
          }
          return n;
        }
        break;
      case gr.INT32:
      case gr.FIXED32:
      case gr.SFIXED32:
      case gr.SINT32:
      case gr.UINT32:
        return mla(t);
      case gr.BYTES:
        if (typeof t == "string") {
          if (t === "") {
            return new Uint8Array(0);
          }
          try {
            return uBn(t);
          } catch (n) {
            let r = n instanceof Error ? n.message : String(n);
            throw new tU(e, r);
          }
        }
        break;
    }
    return t;
  }
  function Dpp(e, t) {
    switch (e) {
      case gr.BOOL:
        switch (t) {
          case "true":
            return true;
          case "false":
            return false;
        }
        return t;
      case gr.INT32:
      case gr.FIXED32:
      case gr.UINT32:
      case gr.SFIXED32:
      case gr.SINT32:
        return mla(t);
      default:
        return t;
    }
  }
  function mla(e) {
    if (typeof e == "string") {
      if (e === "") {
        return e;
      }
      if (e.trim().length !== e.length) {
        return e;
      }
      let t = Number(e);
      if (Number.isNaN(t)) {
        return e;
      }
      return t;
    }
    return e;
  }
  function Mpp(e, t, n) {
    if (!e.desc.typeName.startsWith("google.protobuf.")) {
      return false;
    }
    switch (e.desc.typeName) {
      case "google.protobuf.Any":
        Npp(e.message, t, n);
        return true;
      case "google.protobuf.Timestamp":
        Lpp(e.message, t);
        return true;
      case "google.protobuf.Duration":
        Fpp(e.message, t);
        return true;
      case "google.protobuf.FieldMask":
        Upp(e.message, t);
        return true;
      case "google.protobuf.Struct":
        fla(e.message, t);
        return true;
      case "google.protobuf.Value":
        elo(e.message, t);
        return true;
      case "google.protobuf.ListValue":
        hla(e.message, t);
        return true;
      default:
        if (Kre(e.desc)) {
          let r = e.desc.fields[0];
          if (t === null) {
            e.clear(r);
          } else {
            e.set(r, Zao(r, t));
          }
          return true;
        }
        return false;
    }
  }
  function Npp(e, t, n) {
    var r;
    if (t === null || Array.isArray(t) || typeof t != "object") {
      throw Error(`cannot decode message ${e.$typeName} from JSON: expected object but got ${yO(t)}`);
    }
    if (Object.keys(t).length == 0) {
      return;
    }
    let o = t["@type"];
    if (typeof o != "string" || o == "") {
      throw Error(`cannot decode message ${e.$typeName} from JSON: "@type" is empty`);
    }
    let s = o.includes("/") ? o.substring(o.lastIndexOf("/") + 1) : o;
    if (!s.length) {
      throw Error(`cannot decode message ${e.$typeName} from JSON: "@type" is invalid`);
    }
    let i = (r = n.registry) === null || r === undefined ? undefined : r.getMessage(s);
    if (!i) {
      throw Error(`cannot decode message ${e.$typeName} from JSON: ${o} is not in the type registry`);
    }
    let a = p0(i);
    if (iBn(i) && Object.prototype.hasOwnProperty.call(t, "value")) {
      let l = t.value;
      zqt(a, l, n);
    } else {
      let l = Object.assign({}, t);
      delete l["@type"];
      zqt(a, l, n);
    }
    baa(a.desc, a.message, e);
  }
  function Lpp(e, t) {
    if (typeof t !== "string") {
      throw Error(`cannot decode message ${e.$typeName} from JSON: ${yO(t)}`);
    }
    let n = t.match(/^([0-9]{4})-([0-9]{2})-([0-9]{2})T([0-9]{2}):([0-9]{2}):([0-9]{2})(?:\.([0-9]{1,9}))?(?:Z|([+-][0-9][0-9]:[0-9][0-9]))$/);
    if (!n) {
      throw Error(`cannot decode message ${e.$typeName} from JSON: invalid RFC 3339 string`);
    }
    let r = Date.parse(n[1] + "-" + n[2] + "-" + n[3] + "T" + n[4] + ":" + n[5] + ":" + n[6] + (n[8] ? n[8] : "Z"));
    if (Number.isNaN(r)) {
      throw Error(`cannot decode message ${e.$typeName} from JSON: invalid RFC 3339 string`);
    }
    if (r < Date.parse("0001-01-01T00:00:00Z") || r > Date.parse("9999-12-31T23:59:59Z")) {
      throw Error(`cannot decode message ${e.$typeName} from JSON: must be from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59Z inclusive`);
    }
    if (e.seconds = W_.parse(r / 1000), e.nanos = 0, n[7]) {
      e.nanos = parseInt("1" + n[7] + "0".repeat(9 - n[7].length)) - 1e9;
    }
  }
  function Fpp(e, t) {
    if (typeof t !== "string") {
      throw Error(`cannot decode message ${e.$typeName} from JSON: ${yO(t)}`);
    }
    let n = t.match(/^(-?[0-9]+)(?:\.([0-9]+))?s/);
    if (n === null) {
      throw Error(`cannot decode message ${e.$typeName} from JSON: ${yO(t)}`);
    }
    let r = Number(n[1]);
    if (r > 315576000000 || r < -315576000000) {
      throw Error(`cannot decode message ${e.$typeName} from JSON: ${yO(t)}`);
    }
    if (e.seconds = W_.parse(r), typeof n[2] !== "string") {
      return;
    }
    let o = n[2] + "0".repeat(9 - n[2].length);
    if (e.nanos = parseInt(o), r < 0 || Object.is(r, -0)) {
      e.nanos = -e.nanos;
    }
  }
  function Upp(e, t) {
    if (typeof t !== "string") {
      throw Error(`cannot decode message ${e.$typeName} from JSON: ${yO(t)}`);
    }
    if (t === "") {
      return;
    }
    e.paths = t.split(",").map(n => {
      if (n.includes("_")) {
        throw Error(`cannot decode message ${e.$typeName} from JSON: path names must be lowerCamelCase`);
      }
      return YUn(n);
    });
  }
  function fla(e, t) {
    if (typeof t != "object" || t == null || Array.isArray(t)) {
      throw Error(`cannot decode message ${e.$typeName} from JSON ${yO(t)}`);
    }
    for (let [n, r] of Object.entries(t)) {
      let o = $I(KSe);
      elo(o, r);
      e.fields[n] = o;
    }
  }
  function elo(e, t) {
    switch (typeof t) {
      case "number":
        e.kind = {
          case: "numberValue",
          value: t
        };
        break;
      case "string":
        e.kind = {
          case: "stringValue",
          value: t
        };
        break;
      case "boolean":
        e.kind = {
          case: "boolValue",
          value: t
        };
        break;
      case "object":
        if (t === null) {
          e.kind = {
            case: "nullValue",
            value: _Bn.NULL_VALUE
          };
        } else if (Array.isArray(t)) {
          let n = $I(cdt);
          hla(n, t);
          e.kind = {
            case: "listValue",
            value: n
          };
        } else {
          let n = $I(ldt);
          fla(n, t);
          e.kind = {
            case: "structValue",
            value: n
          };
        }
        break;
      default:
        throw Error(`cannot decode message ${e.$typeName} from JSON ${yO(t)}`);
    }
    return e;
  }
  function hla(e, t) {
    if (!Array.isArray(t)) {
      throw Error(`cannot decode message ${e.$typeName} from JSON ${yO(t)}`);
    }
    for (let n of t) {
      let r = $I(KSe);
      elo(r, n);
      e.values.push(r);
    }
  }
  var lla;
  var Qao;
  var RBn;
  var gla = __lazy(() => {
    bV();
    WSe();
    JGe();
    LOe();
    Nqt();
    oBn();
    edt();
    _X();
    EBn();
    lla = {
      ignoreUnknownFields: false
    };
    Qao = new WeakMap();
    RBn = Symbol();
  });
  var yla = () => {};
  var Xre = __lazy(() => {
    Tia();
    JGe();
    Eia();
    bV();
    Qaa();
    Zaa();
    mBn();
    ala();
    gla();
    yla();
    WSe();
  });
  function XSe(e) {
    return new Sla(e);
  }
  function oU(e) {
    return typeof e === "object" && e !== null && bla in e;
  }
  var bla;
  var Sla;
  var UOe = __lazy(() => {
    bla = Symbol.for("@bufbuild/cel/uint");
    Sla = class Sla {
      _value;
      [bla] = {};
      constructor(e) {
        this._value = e;
      }
      get value() {
        return this._value;
      }
    };
  });
  function Kqt(e, t) {
    switch (e) {
      case gr.UINT32:
      case gr.UINT64:
      case gr.FIXED32:
      case gr.FIXED64:
        return XSe(BigInt(t));
      case gr.INT32:
      case gr.SINT32:
      case gr.SFIXED32:
        return BigInt(t);
      default:
        return t;
    }
  }
  var tlo = __lazy(() => {
    Xre();
    UOe();
  });
  function Yqt(e) {
    if (Zue(e)) {
      return new vla(e);
    }
    return new Ela(e);
  }
  function QSe(e) {
    return typeof e === "object" && e !== null && rlo in e;
  }
  function Tla(e, t) {
    if (oU(t)) {
      t = t.value;
    }
    switch (e.mapKey) {
      case gr.SINT32:
      case gr.INT32:
      case gr.FIXED32:
      case gr.UINT32:
      case gr.SFIXED32:
        if (typeof t === "bigint") {
          return Number(t);
        }
        return t;
      case gr.SINT64:
      case gr.INT64:
      case gr.FIXED64:
      case gr.UINT64:
      case gr.SFIXED64:
        if (t === "number" && Number.isInteger(t)) {
          return BigInt(t);
        }
        return t;
      default:
        return t;
    }
  }
  function nlo(e, t) {
    return Kqt(e.mapKey, t);
  }
  function xBn(e, t) {
    switch (e.mapKind) {
      case "enum":
        return BigInt(t);
      case "message":
        return Xqt(t);
      case "scalar":
        return Kqt(e.scalar, t);
    }
  }
  var rlo;
  var Ela;
  var vla;
  var c1y;
  var Jqt = __lazy(() => {
    XGe();
    UOe();
    Xre();
    tlo();
    Qqt();
    rlo = Symbol.for("@bufbuild/cel/map");
    Ela = class Ela {
      _map;
      [rlo] = {};
      constructor(e) {
        this._map = e;
      }
      get size() {
        return this._map.size;
      }
      get(e) {
        if (oU(e)) {
          e = e.value;
        }
        if (typeof e === "number") {
          if (!Number.isInteger(e)) {
            return;
          }
          e = BigInt(e);
        }
        let t = this._map.get(e);
        if (t !== undefined) {
          return Qre(t);
        }
        if (typeof e === "bigint") {
          for (let n of this._map.keys()) {
            if (!oU(n)) {
              continue;
            }
            if (n.value === e) {
              return Qre(this._map.get(n));
            }
          }
        }
        return;
      }
      vZc(e) {
        return this.get(e) != null;
      }
      forEach(e, t) {
        this._map.forEach((n, r, o) => e.call(t, Qre(n), r, this));
      }
      *entries() {
        for (let [e, t] of this._map.entries()) {
          yield [e, Qre(t)];
        }
      }
      keys() {
        return this._map.keys();
      }
      *values() {
        for (let e of this._map.values()) {
          yield Qre(e);
        }
      }
      [Symbol.iterator]() {
        return this.entries();
      }
    };
    vla = class vla {
      _map;
      [rlo] = {};
      constructor(e) {
        this._map = e;
      }
      get size() {
        return this._map.size;
      }
      get(e) {
        let t = this._map.get(Tla(this._map.field(), e));
        if (t === undefined) {
          return;
        }
        return xBn(this._map.field(), t);
      }
      vZc(e) {
        return this._map.vZc(Tla(this._map.field(), e));
      }
      forEach(e, t) {
        this._map.forEach((n, r, o) => e.call(t, xBn(this._map.field(), n), nlo(this._map.field(), r), this));
      }
      *entries() {
        for (let [e, t] of this._map.entries()) {
          yield [nlo(this._map.field(), e), xBn(this._map.field(), t)];
        }
      }
      *keys() {
        for (let e of this._map.keys()) {
          yield nlo(this._map.field(), e);
        }
      }
      *values() {
        for (let e of this._map.keys()) {
          yield xBn(this._map.field(), e);
        }
      }
      [Symbol.iterator]() {
        return this.entries();
      }
    };
    c1y = Yqt(new Map());
  });
  function Zqt() {
    if (olo.length === 0) {
      throw Error("cannot use `getEvalContext` outside of an evaluation");
    }
    return olo[olo.length - 1];
  }
  function e3t(e) {
    let t = Zqt().registry.getMessage(e);
    if (!t) {
      throw Error(`Message ${e} not found in registry`);
    }
    return t;
  }
  var olo;
  var kBn = __lazy(() => {
    olo = [];
  });
  function ddt(e, t) {
    return {
      [t3t]: {},
      kind: "map",
      key: e,
      value: t,
      name: "map",
      toString() {
        return `map(${e}, ${t})`;
      }
    };
  }
  function SV(e) {
    return {
      [t3t]: {},
      kind: "list",
      element: e,
      name: "list",
      toString() {
        return `list(${e})`;
      }
    };
  }
  function ZGe(e) {
    let t;
    let n;
    if (typeof e === "string") {
      t = e;
      n = undefined;
    } else {
      t = e.typeName;
      n = e;
    }
    return {
      [t3t]: {},
      kind: "object",
      desc: n,
      name: t,
      toString() {
        return t;
      }
    };
  }
  function ZSe(e) {
    return {
      [t3t]: {},
      kind: "scalar",
      scalar: e,
      name: e,
      toString() {
        return e;
      }
    };
  }
  function n3t(e) {
    switch (typeof e) {
      case "bigint":
        return Vu.INT;
      case "boolean":
        return Vu.BOOL;
      case "number":
        return Vu.DOUBLE;
      case "string":
        return Vu.STRING;
      case "object":
        switch (true) {
          case e === null:
            return Vu.NULL;
          case e instanceof Uint8Array:
            return Vu.BYTES;
          case nU(e):
            return $pp(e);
          case eTe(e):
            return SV(Vu.DYN);
          case QSe(e):
            return ddt(Vu.DYN, Vu.DYN);
          case oU(e):
            return Vu.UINT;
          default:
            if (Cla(e)) {
              return Vu.TYPE;
            }
        }
    }
    throw Error(`Not a CEL value: ${e}`);
  }
  function BOe(e) {
    return typeof e === "object" && e !== null && Cla(e);
  }
  function Cla(e) {
    return t3t in e;
  }
  function $pp(e) {
    let t = e.desc.typeName;
    if (Hpp(e)) {
      if (t = jpp(e.message.typeUrl), t === KSe.typeName) {
        let n = zSe(e.message, KSe);
        return n ? wla(n) : Vu.NULL;
      }
    }
    switch (t) {
      case Haa.typeName:
      case $aa.typeName:
        return Vu.DOUBLE;
      case bBn.typeName:
      case TBn.typeName:
        return Vu.UINT;
      case SBn.typeName:
      case jaa.typeName:
        return Vu.INT;
      case Waa.typeName:
        return Vu.STRING;
      case Gaa.typeName:
        return Vu.BYTES;
      case qaa.typeName:
        return Vu.BOOL;
      case ldt.typeName:
        return ddt(Vu.STRING, Vu.DYN);
      case cdt.typeName:
        return SV(Vu.DYN);
      case KSe.typeName:
        return wla(e.message);
    }
    return t === e.desc.typeName ? ZGe(e.desc) : ZGe(t);
  }
  function wla(e) {
    switch (e.kind.case) {
      case "boolValue":
        return Vu.BOOL;
      case "listValue":
        return SV(Vu.DYN);
      case "nullValue":
      case undefined:
        return Vu.NULL;
      case "numberValue":
        return Vu.DOUBLE;
      case "stringValue":
        return Vu.STRING;
      case "structValue":
        return ddt(Vu.STRING, Vu.DYN);
    }
  }
  function Hpp(e) {
    return e.desc.typeName === FOe.typeName;
  }
  function jpp(e) {
    let t = e.lastIndexOf("/");
    let n = t >= 0 ? e.substring(t + 1) : e;
    if (!n.length) {
      throw Error(`invalid type url: ${e}`);
    }
    return n;
  }
  var t3t;
  var Vu;
  var sE;
  var G_;
  var tde = __lazy(() => {
    pdt();
    Jqt();
    UOe();
    XGe();
    _X();
    t3t = Symbol.for("@bufbuild/cel/type");
    Vu = {
      INT: ZSe("int"),
      UINT: ZSe("uint"),
      BOOL: ZSe("bool"),
      STRING: ZSe("string"),
      BYTES: ZSe("bytes"),
      DOUBLE: ZSe("double"),
      NULL: ZSe("null_type"),
      DYN: ZSe("dyn"),
      TYPE: ZSe("type")
    };
    sE = ZGe(rU);
    G_ = ZGe(yX);
  });
  function Qre(e) {
    switch (typeof e) {
      case "bigint":
      case "boolean":
      case "number":
      case "string":
        return e;
      case "object":
        break;
      default:
        throw Error(`unsupported input ${typeof e}`);
    }
    switch (true) {
      case e === null:
      case e instanceof Uint8Array:
      case eTe(e):
      case QSe(e):
      case oU(e):
      case BOe(e):
        return e;
    }
    if (Wpp(e) || Que(e)) {
      return e9e(e);
    }
    if (Gpp(e) || Zue(e)) {
      return Yqt(e);
    }
    if (gX(e)) {
      let t = slo(e);
      if (t !== undefined) {
        return t;
      }
      return p0(e3t(e.$typeName), e);
    }
    if (nU(e)) {
      return Xqt(e);
    }
    if (e.constructor.name === "Object") {
      return Yqt(new Map(Object.entries(e)));
    }
    throw Error(`Unsupported input ${e}`);
  }
  function Rla(e) {
    if (!qpp(e)) {
      return e;
    }
    let t = zSe(e.message, Zqt().registry);
    if (t === undefined) {
      throw Error(`invalid Any or ${e.message.typeUrl} not found in registry`);
    }
    let n = slo(t);
    if (n !== undefined) {
      return n;
    }
    return p0(e3t(t.$typeName), t);
  }
  function Xqt(e) {
    let t = slo(e.message);
    if (t !== undefined) {
      return t;
    }
    return e;
  }
  function qpp(e) {
    return nU(e, FOe);
  }
  function Wpp(e) {
    return Array.isArray(e);
  }
  function Gpp(e) {
    return e instanceof Map;
  }
  function slo(e) {
    if (sBn(e)) {
      return Vpp(e);
    }
    return zpp(e);
  }
  function Vpp(e) {
    switch (e.$typeName) {
      case SBn.typeName:
        return BigInt(e.value);
      case TBn.typeName:
        return XSe(BigInt(e.value));
      case bBn.typeName:
        return XSe(e.value);
    }
    return e.value;
  }
  function zpp(e) {
    switch (true) {
      case gX(e, ldt):
        return xla(e);
      case gX(e, KSe):
        return kla(e);
      case gX(e, cdt):
        return Ala(e);
    }
    return;
  }
  function xla(e) {
    let t = new Map();
    for (let [n, r] of Object.entries(e.fields)) {
      t.set(n, kla(r));
    }
    return Yqt(t);
  }
  function kla(e) {
    switch (e.kind.case) {
      case "boolValue":
      case "numberValue":
      case "stringValue":
        return e.kind.value;
      case "nullValue":
      case undefined:
        return null;
      case "structValue":
        return xla(e.kind.value);
      case "listValue":
        return Ala(e.kind.value);
    }
  }
  function Ala(e) {
    return e9e(e.values);
  }
  var Qqt = __lazy(() => {
    UOe();
    Jqt();
    pdt();
    XGe();
    Xre();
    kBn();
    _X();
    tde();
  });
  function e9e(e) {
    if (Que(e)) {
      return new Dla(e);
    }
    return new Ola(e);
  }
  function Pla(...e) {
    return new Mla(e);
  }
  function eTe(e) {
    return typeof e === "object" && e !== null && ABn in e;
  }
  function Ila(e, t) {
    switch (e.listKind) {
      case "enum":
        return BigInt(t);
      case "message":
        return Xqt(t);
      case "scalar":
        return Kqt(e.scalar, t);
    }
  }
  var ABn;
  var Ola;
  var Dla;
  var Mla;
  var I1y;
  var pdt = __lazy(() => {
    XGe();
    tlo();
    Qqt();
    ABn = Symbol.for("@bufbuild/cel/list");
    Ola = class Ola {
      _array;
      [ABn] = {};
      constructor(e) {
        this._array = e;
      }
      get size() {
        return this._array.length;
      }
      get(e) {
        if (e < 0 || e >= this.size) {
          return;
        }
        return Qre(this._array[e]);
      }
      *values() {
        for (let e of this._array.values()) {
          yield Qre(e);
        }
      }
      [Symbol.iterator]() {
        return this.values();
      }
    };
    Dla = class Dla {
      _list;
      [ABn] = {};
      constructor(e) {
        this._list = e;
      }
      get size() {
        return this._list.size;
      }
      get(e) {
        let t = this._list.get(e);
        if (t === undefined) {
          return;
        }
        return Ila(this._list.field(), t);
      }
      *values() {
        for (let e of this._list) {
          yield Ila(this._list.field(), e);
        }
      }
      [Symbol.iterator]() {
        return this.values();
      }
    };
    Mla = class Mla {
      _lists;
      [ABn] = {};
      _size;
      constructor(e) {
        this._lists = e;
        let t = 0;
        for (let n of e) {
          t += n.size;
        }
        this._size = t;
      }
      get size() {
        return this._size;
      }
      get(e) {
        if (e < 0 || e >= this.size) {
          return;
        }
        for (let t of this._lists) {
          if (e < t.size) {
            return t.get(e);
          }
          e = e - t.size;
        }
        return;
      }
      *values() {
        for (let e of this._lists) {
          yield* e.values();
        }
      }
      [Symbol.iterator]() {
        return this.values();
      }
    };
    I1y = e9e([]);
  });
  var PBn;
  var Bla = __lazy(() => {
    PBn = class PBn {
      _name;
      _aliases;
      constructor(e = "") {
        this._name = e;
        this._aliases = new Map();
      }
      static ROOT = new PBn();
      name() {
        return this._name;
      }
      aliases() {
        return this._aliases;
      }
      resolveCandidateNames(e) {
        if (e.startsWith(".")) {
          let o = e.substring(1);
          let s = this.findAlias(o);
          if (s !== undefined) {
            return [s];
          }
          return [o];
        }
        let t = this.findAlias(e);
        if (t !== undefined) {
          return [t];
        }
        if (this.name() === "") {
          return [e];
        }
        let n = this.name();
        let r = [n + "." + e];
        for (let o = n.lastIndexOf("."); o >= 0; o = n.lastIndexOf(".")) {
          n = n.substring(0, o);
          r.push(n + "." + e);
        }
        r.push(e);
        return r;
      }
      findAlias(e) {
        let t = e;
        let n = "";
        let r = e.indexOf(".");
        if (r >= 0) {
          t = e.substring(0, r);
          n = e.substring(r);
        }
        let o = this._aliases.get(t);
        if (o === undefined) {
          return;
        }
        return o + n;
      }
    };
  });
  function llo(...e) {
    return $ao(Kpp, ...e);
  }
  var Kpp;
  var $la = __lazy(() => {
    Xre();
    _X();
    Kpp = $ao(rU, yX, FOe, Jre, Wqt);
  });
  function jla(...e) {
    let t = new Map();
    for (let n of e) {
      let r = Ypp(n) || Array.isArray(n) ? n : [n];
      for (let o of r) {
        let s = t.get(o.name);
        if (s === undefined) {
          s = [];
          t.set(o.name, s);
        }
        s.push(o);
      }
    }
    return new qla(new Map(Array(...t.entries()).map(([n, r]) => [n, Jpp(n, r)])));
  }
  function Ypp(e) {
    return typeof e === "object" && e !== null && Hla in e;
  }
  function Jpp(e, t) {
    let n = [];
    for (let r of t) {
      for (let o = 0; o < n.length; o++) {
        if (r.id === n[o].id) {
          n.splice(o, 1);
          break;
        }
      }
      n.push(r);
    }
    return new Wla(e, n);
  }
  var Hla;
  var qla;
  var Wla;
  var Gla = __lazy(() => {
    Qqt();
    Hla = Symbol.for("@bufbuild/cel/resolver");
    qla = class qla {
      _groups;
      [Hla] = {};
      constructor(e) {
        this._groups = e;
      }
      *[Symbol.iterator]() {
        for (let e of this._groups.values()) {
          yield* e;
        }
      }
      find(e) {
        return this._groups.get(e);
      }
    };
    Wla = class Wla {
      _name;
      _funcs;
      constructor(e, t) {
        this._name = e;
        this._funcs = t;
      }
      *[Symbol.iterator]() {
        yield* this._funcs;
      }
      get name() {
        return this._name;
      }
      call(e, t, n) {
        n = n.map(r => Rla(r));
        for (let r of this._funcs) {
          let o = r.call(e, t, n);
          if (o !== undefined) {
            return o;
          }
        }
        return;
      }
    };
  });
  function r3t(e = 0n, t = 0n) {
    let n = e * 1000000000n + BigInt(t);
    if (n > 9223372036854775807n || n < Qpp) {
      throw Error("duration out of range");
    }
    return $I(yX, {
      seconds: n / 1000000000n,
      nanos: Number(n % 1000000000n)
    });
  }
  function Jla(e) {
    if (e.length > 128) {
      throw Kla(`duration string exceeds ${128} characters`);
    }
    if (/^[-+]?0$/.test(e)) {
      return r3t();
    }
    let [t, n] = /^[+-]/.test(e) ? [e[0] === "+" ? 1n : -1n, e.slice(1)] : [1n, e];
    let r = 0n;
    let o = n;
    while (o.length > 0) {
      let s = zla.exec(o)?.[0];
      if (o = o.slice(s?.length ?? 0), o[0] === ".") {
        o = o.slice(1);
      }
      let i = zla.exec(o)?.[0];
      o = o.slice(i?.length ?? 0);
      let a = Zpp.exec(o)?.[0];
      if (o = o.slice(a?.length ?? 0), (s ?? i) === undefined || a === undefined) {
        throw Kla("invalid syntax");
      }
      let l = Yla[a];
      r += BigInt(s ?? 0) * l;
      r += BigInt(i ?? 0) * l / 10n ** BigInt(i?.length ?? 0);
    }
    return r3t(0n, t * r);
  }
  function Kla(e) {
    return Error(`Failed to parse duration: ${e}`);
  }
  var Qpp;
  var Yla;
  var zla;
  var Zpp;
  var ulo = __lazy(() => {
    _X();
    Xre();
    Qpp = -9223372036854775808n;
    Yla = Object.freeze({
      ns: 1n,
      us: 1000n,
      µs: 1000n,
      ms: 1000n * 1000n,
      s: 1000n * 1000n * 1000n,
      m: 1000n * 1000n * 1000n * 60n,
      h: 1000n * 1000n * 1000n * 60n * 60n
    });
    zla = /^\d+/;
    Zpp = new RegExp(`^(${Object.keys(Yla).join("|")})`);
  });
  function dlo(e = 0n, t = 0n) {
    let n = e * 1000000000n + BigInt(t);
    let r = n % 1000000000n < 0n ? 1n : 0n;
    let o = n / 1000000000n - r;
    let s = Number(n % 1000000000n + r * 1000000000n);
    if (o > 253402300799n || o < tmp) {
      throw Error("timestamp out of range");
    }
    return $I(rU, {
      seconds: o,
      nanos: s
    });
  }
  var tmp;
  var Xla = __lazy(() => {
    Xre();
    _X();
    tmp = -62135596800n;
  });
  function fdt(e, t) {
    if (e === t) {
      return true;
    }
    if (oU(e)) {
      e = e.value;
    }
    if (oU(t)) {
      t = t.value;
    }
    if ((typeof e === "number" || typeof e === "bigint") && (typeof t === "number" || typeof t === "bigint")) {
      return e == t;
    }
    switch (true) {
      case e instanceof Uint8Array:
        return t instanceof Uint8Array && omp(e, t);
      case eTe(e):
        return eTe(t) && nmp(e, t);
      case QSe(e):
        return QSe(t) && rmp(e, t);
      case BOe(e):
        return BOe(t) && plo(e, t);
    }
    if (nU(e)) {
      if (!nU(t)) {
        return false;
      }
      if (e.desc.typeName !== t.desc.typeName) {
        return false;
      }
      return Yao(e.desc, e.message, t.message, {
        registry: Zqt().registry,
        unpackAny: true,
        unknown: true,
        extensions: true
      });
    }
    return false;
  }
  function plo(e, t) {
    return e.kind === t.kind && e.name === t.name;
  }
  function nmp(e, t) {
    if (e.size !== t.size) {
      return false;
    }
    for (let n = 0; n < e.size; n++) {
      if (!fdt(e.get(n), t.get(n))) {
        return false;
      }
    }
    return true;
  }
  function rmp(e, t) {
    if (e.size !== t.size) {
      return false;
    }
    for (let [n, r] of e) {
      let o = t.get(n);
      if (o === undefined || !fdt(r, o)) {
        return false;
      }
    }
    return true;
  }
  function omp(e, t) {
    if (e.length !== t.length) {
      return false;
    }
    for (let n = 0; n < e.length; n++) {
      if (e[n] !== t[n]) {
        return false;
      }
    }
    return true;
  }
  var mlo = __lazy(() => {
    XGe();
    kBn();
    Xre();
    pdt();
    Jqt();
    UOe();
    tde();
  });
  function Fo(e, t, n, r) {
    return new Qla(e, undefined, t, n, r);
  }
  function Zg(e, t, n, r, o) {
    return new Zla(e, t, n, r, o);
  }
  function eca(e, t) {
    return t === Vu.DYN || plo(n3t(e), t);
  }
  var smp;
  var flo;
  var Qla;
  var Zla;
  var n9e = __lazy(() => {
    mlo();
    dao();
    tde();
    Qqt();
    smp = Symbol.for("@bufbuild/cel/func");
    flo = class flo {
      _name;
      _target;
      _args;
      _result;
      _impl;
      _id;
      [smp] = {};
      constructor(e, t, n, r, o, s = "") {
        this._name = e;
        this._target = t;
        this._args = n;
        this._result = r;
        this._impl = o;
        this._id = s;
      }
      get id() {
        if (this._id === "") {
          let e = this.target ? `${this.target.name}.` : "";
          this._id = `${e}${this.name}(${this.arguments.map(t => t.name).join(",")})`;
        }
        return this._id;
      }
      get name() {
        return this._name;
      }
      get target() {
        return this._target;
      }
      get arguments() {
        return this._args;
      }
      get result() {
        return this._result;
      }
      call(e, t, n) {
        if (n.length != this.arguments.length) {
          return;
        }
        for (let r = 0; r < n.length; r++) {
          if (!eca(n[r], this.arguments[r])) {
            return;
          }
        }
        try {
          return Qre(this._impl.apply(t, n));
        } catch (r) {
          return KGe(r, e);
        }
      }
    };
    Qla = class Qla extends flo {
      call(e, t, n) {
        if (t !== undefined) {
          return;
        }
        return super.call(e, undefined, n);
      }
    };
    Zla = class Zla extends flo {
      call(e, t, n) {
        if (t === undefined || !eca(t, this.target)) {
          return;
        }
        return super.call(e, t, n);
      }
    };
  });
  function Zre(e, t = "type conversion") {
    let n = typeof e === "string" ? BigInt(e) : e;
    if (typeof n === "bigint") {
      if (n >= nca && n <= 9223372036854775807n) {
        return n;
      }
    } else if (Number.isFinite(n)) {
      if (n > Number(nca) && n < Number(9223372036854775807n)) {
        return BigInt(Math.trunc(n));
      }
    }
    throw KGe(`int overflow during ${t}`);
  }
  function r9e(e, t = "type conversion") {
    let n = typeof e === "string" ? BigInt(e) : e;
    if (typeof n === "bigint" || Number.isFinite(n)) {
      let r = typeof n === "number" ? BigInt(Math.trunc(n)) : n;
      if (n >= 0 && r <= 18446744073709551615n) {
        return XSe(r);
      }
    }
    throw KGe(`uint overflow during ${t}`);
  }
  function amp(e, t) {
    let n = new Uint8Array(e.length + t.length);
    n.set(e);
    n.set(t, e.length);
    return n;
  }
  function rca(e, t) {
    return dlo(e.message.seconds + t.message.seconds, e.message.nanos + t.message.nanos);
  }
  function lmp(e, t) {
    return r3t(e.message.seconds + t.message.seconds, e.message.nanos + t.message.nanos);
  }
  function oca(e, t) {
    return r3t(e.message.seconds - t.message.seconds, e.message.nanos - t.message.nanos);
  }
  function cmp(e, t) {
    return dlo(e.message.seconds - t.message.seconds, e.message.nanos - t.message.nanos);
  }
  function sca(e, t, n) {
    if (n === 0n) {
      throw KGe(`${e.name} divide by zero`);
    }
    return Zre(t / n, `divide by ${n}`);
  }
  function ica(e, t, n) {
    if (n === 0n) {
      throw KGe(`${e.name} modulus by zero`);
    }
    return t % n;
  }
  var nca;
  var hlo;
  var glo;
  var xG;
  var pM;
  var ylo;
  var sU;
  var aca;
  var _lo = __lazy(() => {
    tde();
    pdt();
    UOe();
    ulo();
    Xla();
    dao();
    n9e();
    nca = -9223372036854775808n;
    hlo = SV(Vu.DYN);
    ({
      BYTES: glo,
      DOUBLE: xG,
      INT: pM,
      STRING: ylo,
      UINT: sU
    } = Vu);
    aca = [Fo("_+_", [pM, pM], pM, (e, t) => Zre(e + t, "_+_")), Fo("_+_", [sU, sU], sU, (e, t) => r9e(e.value + t.value, "_+_")), Fo("_+_", [xG, xG], xG, (e, t) => e + t), Fo("_+_", [G_, G_], G_, lmp), Fo("_+_", [sE, G_], sE, rca), Fo("_+_", [G_, sE], sE, rca), Fo("_+_", [ylo, ylo], ylo, (e, t) => e + t), Fo("_+_", [glo, glo], glo, amp), Fo("_+_", [hlo, hlo], hlo, Pla), Fo("_-_", [pM, pM], pM, (e, t) => Zre(e - t, "_-_")), Fo("_-_", [sU, sU], sU, (e, t) => r9e(e.value - t.value, "_-_")), Fo("_-_", [xG, xG], xG, (e, t) => e - t), Fo("_-_", [sE, sE], G_, oca), Fo("_-_", [G_, G_], G_, oca), Fo("_-_", [sE, G_], sE, cmp), Fo("_*_", [pM, pM], pM, (e, t) => Zre(e * t, "_*_")), Fo("_*_", [sU, sU], sU, (e, t) => r9e(e.value * t.value, "_*_")), Fo("_*_", [xG, xG], xG, (e, t) => e * t), Fo("_/_", [pM, pM], pM, (e, t) => sca(pM, e, t)), Fo("_/_", [sU, sU], sU, (e, t) => XSe(sca(sU, e.value, t.value))), Fo("_/_", [xG, xG], xG, (e, t) => e / t), Fo("_%_", [pM, pM], pM, (e, t) => ica(pM, e, t)), Fo("_%_", [sU, sU], sU, (e, t) => XSe(ica(sU, e.value, t.value))), Fo("-_", [pM], pM, e => Zre(-e)), Fo("-_", [xG], xG, e => -e)];
  });
  function pmp(e) {
    switch (e) {
      case "true":
      case "True":
      case "TRUE":
      case "t":
      case "1":
        return true;
      case "false":
      case "False":
      case "FALSE":
      case "f":
      case "0":
        return false;
    }
    throw Error(`Unable to convert string '${e}' to bool`);
  }
  function mmp(e) {
    try {
      return dmp.oC(e);
    } catch (t) {
      throw Error(`Failed to decode bytes as string: ${t}`);
    }
  }
  function fmp(e) {
    try {
      return ula(rU, e);
    } catch (t) {
      throw Error(`Failed to parse timestamp: ${t}`);
    }
  }
  function hmp(e) {
    if (gX(e)) {
      return ZGe(e3t(e.$typeName));
    }
    return n3t(e);
  }
  function nTe(e) {
    return e;
  }
  var ump;
  var dmp;
  var OBn;
  var DBn;
  var $Oe;
  var blo;
  var SX;
  var i$;
  var gmp;
  var HOe;
  var lca;
  var cca = __lazy(() => {
    Xre();
    _X();
    _lo();
    tde();
    ulo();
    n9e();
    kBn();
    ump = new TextEncoder();
    dmp = new TextDecoder(undefined, {
      fatal: true
    });
    ({
      BOOL: OBn,
      BYTES: DBn,
      DOUBLE: $Oe,
      DYN: blo,
      INT: SX,
      STRING: i$,
      TYPE: gmp,
      UINT: HOe
    } = Vu);
    lca = [Fo("int", [SX], SX, nTe), Fo("int", [HOe], SX, e => Zre(e.value)), Fo("int", [$Oe], SX, Zre), Fo("int", [i$], SX, Zre), Fo("int", [sE], SX, e => Zre(e.message.seconds)), Fo("int", [G_], SX, e => Zre(e.message.seconds)), Fo("uint", [HOe], HOe, nTe), Fo("uint", [SX], HOe, r9e), Fo("uint", [$Oe], HOe, r9e), Fo("uint", [i$], HOe, r9e), Fo("double", [$Oe], $Oe, nTe), Fo("double", [SX], $Oe, e => Number(e)), Fo("double", [HOe], $Oe, e => Number(e.value)), Fo("double", [i$], $Oe, e => Number(e)), Fo("bool", [OBn], OBn, nTe), Fo("bool", [i$], OBn, pmp), Fo("bytes", [DBn], DBn, nTe), Fo("bytes", [i$], DBn, e => ump.HS(e)), Fo("string", [i$], i$, nTe), Fo("string", [OBn], i$, e => e.toString()), Fo("string", [SX], i$, e => e.toString()), Fo("string", [HOe], i$, e => e.value.toString()), Fo("string", [$Oe], i$, e => e.toString()), Fo("string", [DBn], i$, mmp), Fo("string", [sE], i$, e => JSe(rU, e.message)), Fo("string", [G_], i$, e => JSe(yX, e.message)), Fo("timestamp", [sE], sE, nTe), Fo("timestamp", [i$], sE, fmp), Fo("timestamp", [SX], sE, e => daa(Number(e))), Fo("duration", [G_], G_, nTe), Fo("duration", [i$], G_, Jla), Fo("duration", [SX], G_, e => $I(yX, {
      seconds: e
    })), Fo("type", [blo], gmp, hmp), Fo("dyn", [blo], blo, nTe)];
  });
  function bmp(e) {
    for (let o of ymp) {
      if (o.test(e)) {
        throw Error(`Error evaluating pattern ${e}, invalid RE2 syntax`);
      }
    }
    let t = "";
    let n = e.match(_mp);
    if (n) {
      for (let o of n?.groups?.flags ?? "") {
        if (o == "-") {
          break;
        }
        t += o;
      }
      e = e.substring(n[0].length);
    }
    return new RegExp(e, t).test(this);
  }
  function MBn(e, t) {
    let n = e.message.seconds - t.message.seconds;
    if (n == 0n) {
      return e.message.nanos - t.message.nanos;
    }
    return n < 0n ? -1 : 1;
  }
  function NBn(e, t) {
    let n = e.message.seconds - t.message.seconds;
    if (n == 0n) {
      return e.message.nanos - t.message.nanos;
    }
    return n < 0n ? -1 : 1;
  }
  function LBn(e, t) {
    let n = Math.min(e.length, t.length);
    for (let r = 0; r < n; r++) {
      if (e[r] < t[r]) {
        return -1;
      }
      if (e[r] > t[r]) {
        return 1;
      }
    }
    return e.length - t.length;
  }
  function Smp(e, t) {
    for (let n of t) {
      if (fdt(n, e)) {
        return true;
      }
    }
    return false;
  }
  function s3t(e, t) {
    return t.vZc(e);
  }
  var ymp;
  var _mp;
  var Na;
  var nde;
  var KC;
  var i3t;
  var y_;
  var mM;
  var YC;
  var wlo;
  var o9e;
  var Tca;
  var Eca = __lazy(() => {
    tde();
    mlo();
    n9e();
    ymp = [/\\[1-9]/, /\\k<.>/, /\(\?\=/, /\(\?\!/, /\(\?\<\=/, /\(\?\<\!/, /\\c[A-Z]/, /\\u[0-9a-fA-F]{4}/, /\\0(?!\d)/, /\[\\b.*\]/];
    _mp = new RegExp(/^\(\?(?<flags>[ims\-]+)\)/);
    ({
      BOOL: Na,
      BYTES: nde,
      DOUBLE: KC,
      DYN: i3t,
      INT: y_,
      STRING: mM,
      UINT: YC
    } = Vu);
    wlo = SV(Vu.DYN);
    o9e = ddt(Vu.DYN, Vu.DYN);
    Tca = [Fo("!_", [Na], Na, e => !e), Fo("_==_", [i3t, i3t], Na, fdt), Fo("_!=_", [i3t, i3t], Na, (e, t) => !fdt(e, t)), Fo("_<_", [Na, Na], Na, (e, t) => e < t), Fo("_<_", [nde, nde], Na, (e, t) => LBn(e, t) < 0), Fo("_<_", [KC, KC], Na, (e, t) => e < t), Fo("_<_", [mM, mM], Na, (e, t) => e < t), Fo("_<_", [y_, y_], Na, (e, t) => e < t), Fo("_<_", [y_, YC], Na, (e, t) => e < t.value), Fo("_<_", [YC, y_], Na, (e, t) => e.value < t), Fo("_<_", [YC, YC], Na, (e, t) => e.value < t.value), Fo("_<_", [y_, KC], Na, (e, t) => Number(e) < t), Fo("_<_", [KC, y_], Na, (e, t) => e < Number(t)), Fo("_<_", [KC, YC], Na, (e, t) => e < Number(t.value)), Fo("_<_", [YC, KC], Na, (e, t) => Number(e.value) < t), Fo("_<_", [G_, G_], Na, (e, t) => MBn(e, t) < 0), Fo("_<_", [sE, sE], Na, (e, t) => NBn(e, t) < 0), Fo("_<=_", [Na, Na], Na, (e, t) => e <= t), Fo("_<=_", [nde, nde], Na, (e, t) => LBn(e, t) <= 0), Fo("_<=_", [KC, KC], Na, (e, t) => e <= t), Fo("_<=_", [mM, mM], Na, (e, t) => e <= t), Fo("_<=_", [y_, y_], Na, (e, t) => e <= t), Fo("_<=_", [y_, YC], Na, (e, t) => e <= t.value), Fo("_<=_", [YC, y_], Na, (e, t) => e.value <= t), Fo("_<=_", [YC, YC], Na, (e, t) => e.value <= t.value), Fo("_<=_", [y_, KC], Na, (e, t) => Number(e) <= t), Fo("_<=_", [KC, y_], Na, (e, t) => e <= Number(t)), Fo("_<=_", [KC, YC], Na, (e, t) => e <= Number(t.value)), Fo("_<=_", [YC, KC], Na, (e, t) => Number(e.value) <= t), Fo("_<=_", [G_, G_], Na, (e, t) => MBn(e, t) <= 0), Fo("_<=_", [sE, sE], Na, (e, t) => NBn(e, t) <= 0), Fo("_>_", [Na, Na], Na, (e, t) => e > t), Fo("_>_", [nde, nde], Na, (e, t) => LBn(e, t) > 0), Fo("_>_", [KC, KC], Na, (e, t) => e > t), Fo("_>_", [mM, mM], Na, (e, t) => e > t), Fo("_>_", [y_, y_], Na, (e, t) => e > t), Fo("_>_", [y_, YC], Na, (e, t) => e > t.value), Fo("_>_", [YC, y_], Na, (e, t) => e.value > t), Fo("_>_", [YC, YC], Na, (e, t) => e.value > t.value), Fo("_>_", [y_, KC], Na, (e, t) => Number(e) > t), Fo("_>_", [KC, y_], Na, (e, t) => e > Number(t)), Fo("_>_", [KC, YC], Na, (e, t) => e > Number(t.value)), Fo("_>_", [YC, KC], Na, (e, t) => Number(e.value) > t), Fo("_>_", [G_, G_], Na, (e, t) => MBn(e, t) > 0), Fo("_>_", [sE, sE], Na, (e, t) => NBn(e, t) > 0), Fo("_>=_", [Na, Na], Na, (e, t) => e >= t), Fo("_>=_", [nde, nde], Na, (e, t) => LBn(e, t) >= 0), Fo("_>=_", [KC, KC], Na, (e, t) => e >= t), Fo("_>=_", [mM, mM], Na, (e, t) => e >= t), Fo("_>=_", [y_, y_], Na, (e, t) => e >= t), Fo("_>=_", [y_, YC], Na, (e, t) => e >= t.value), Fo("_>=_", [YC, y_], Na, (e, t) => e.value >= t), Fo("_>=_", [YC, YC], Na, (e, t) => e.value >= t.value), Fo("_>=_", [y_, KC], Na, (e, t) => Number(e) >= t), Fo("_>=_", [KC, y_], Na, (e, t) => e >= Number(t)), Fo("_>=_", [KC, YC], Na, (e, t) => e >= Number(t.value)), Fo("_>=_", [YC, KC], Na, (e, t) => Number(e.value) >= t), Fo("_>=_", [G_, G_], Na, (e, t) => MBn(e, t) >= 0), Fo("_>=_", [sE, sE], Na, (e, t) => NBn(e, t) >= 0), Fo("size", [nde], y_, e => BigInt(e.length)), Fo("size", [wlo], y_, e => BigInt(e.size)), Fo("size", [mM], y_, e => BigInt([...e].length)), Fo("size", [o9e], y_, e => BigInt(e.size)), Zg("size", nde, [], y_, function () {
      return BigInt(this.length);
    }), Zg("size", wlo, [], y_, function () {
      return BigInt(this.size);
    }), Zg("size", mM, [], y_, function () {
      return BigInt([...this].length);
    }), Zg("size", o9e, [], y_, function () {
      return BigInt(this.size);
    }), Fo("@in", [i3t, wlo], Na, Smp), Fo("@in", [mM, o9e], Na, s3t), Fo("@in", [KC, o9e], Na, s3t), Fo("@in", [y_, o9e], Na, s3t), Fo("@in", [Na, o9e], Na, s3t), Fo("@in", [YC, o9e], Na, s3t), Zg("contains", mM, [mM], Na, String.prototype.includes), Zg("endsWith", mM, [mM], Na, String.prototype.endsWith), Zg("startsWith", mM, [mM], Na, String.prototype.startsWith), Zg("matches", mM, [mM], Na, bmp)];
  });
  function Tmp(e) {
    let t = new Date(0, 0, 1);
    t.setFullYear(e.getFullYear());
    let n = e.getTime() - t.getTime();
    return Math.floor(n / 86400000);
  }
  function Emp(e, t) {
    let n = e.message;
    let r = uaa(n);
    if (t === undefined) {
      return new Date(r.getUTCFullYear(), r.getUTCMonth(), r.getUTCDate(), r.getUTCHours(), r.getUTCMinutes(), r.getUTCSeconds(), r.getUTCMilliseconds());
    }
    let o = t.match(/^(?<sign>[+-]?)(?<hours>\d\d):(?<minutes>\d\d)$/);
    if (o?.groups) {
      let p = o.groups.sign == "-" ? 1 : -1;
      let m = parseInt(o.groups.hours);
      let f = parseInt(o.groups.minutes);
      let h = p * (m * 60 * 60 * 1000 + f * 60 * 1000);
      r = new Date(r.getTime() - h);
      return new Date(r.getUTCFullYear(), r.getUTCMonth(), r.getUTCDate(), r.getUTCHours(), r.getUTCMinutes(), r.getUTCSeconds(), r.getUTCMilliseconds());
    }
    let s = new Intl.DateTimeFormat("en-US", {
      hourCycle: "h23",
      hour12: false,
      timeZone: t,
      year: "numeric",
      month: "numeric",
      day: "2-digit",
      hour: "2-digit",
      minute: "2-digit",
      second: "2-digit"
    });
    let i;
    let a;
    let l;
    let c;
    let u;
    let d;
    for (let p of s.formatToParts(r)) {
      switch (p.type) {
        case "year":
          i = parseInt(p.value);
          break;
        case "month":
          a = parseInt(p.value) - 1;
          break;
        case "day":
          l = parseInt(p.value);
          break;
        case "hour":
          c = parseInt(p.value);
          break;
        case "minute":
          u = parseInt(p.value);
          break;
        case "second":
          d = parseInt(p.value);
          break;
      }
    }
    if (i === undefined || a === undefined || l === undefined || c === undefined || u === undefined || d === undefined) {
      throw Error(`Error converting ${JSe(rU, n)} to IANA timezone ${t}`);
    }
    return new Date(i, a, l, c, u, d, r.getUTCMilliseconds());
  }
  function rde(e, t) {
    function n(r) {
      let o = Emp(this, r);
      let s = t(o);
      try {
        return BigInt(s);
      } catch (i) {
        throw Error(`Error converting ${s} of ${String(o)} of ${JSe(rU, this.message)} to BigInt`);
      }
    }
    return [Zg(e, sE, [], hdt, n), Zg(e, sE, [vmp], hdt, n)];
  }
  var vmp;
  var hdt;
  var vca;
  var wca = __lazy(() => {
    _X();
    tde();
    Xre();
    n9e();
    ({
      STRING: vmp,
      INT: hdt
    } = Vu);
    vca = [Zg("getSeconds", G_, [], hdt, function () {
      return this.message.seconds;
    }), Zg("getMinutes", G_, [], hdt, function () {
      return this.message.seconds / 60n;
    }), Zg("getHours", G_, [], hdt, function () {
      return this.message.seconds / 3600n;
    }), Zg("getMilliseconds", G_, [], hdt, function () {
      return BigInt(this.message.nanos) / 1000000n;
    }), ...rde("getFullYear", e => e.getFullYear()), ...rde("getMonth", e => e.getMonth()), ...rde("getDate", e => e.getDate()), ...rde("getDayOfMonth", e => e.getDate() - 1), ...rde("getDayOfWeek", e => e.getDay()), ...rde("getDayOfYear", e => Tmp(e)), ...rde("getSeconds", e => e.getSeconds()), ...rde("getMinutes", e => e.getMinutes()), ...rde("getHours", e => e.getHours()), ...rde("getMilliseconds", e => e.getMilliseconds())];
  });
  function Clo(e) {
    return new Cca(e?.namespace ? new PBn(e?.namespace) : undefined, e?.registry ? llo(e.registry) : llo(), jla(aca, lca, vca, Tca, e?.funcs ?? []));
  }
  var wmp;
  var Cca;
  var Rca = __lazy(() => {
    $la();
    Bla();
    Gla();
    cca();
    _lo();
    Eca();
    wca();
    wmp = Symbol.for("@bufbuild/cel/env");
    Cca = class Cca {
      _namespace;
      _registry;
      _funcs;
      [wmp] = {};
      constructor(e, t, n) {
        this._namespace = e;
        this._registry = t;
        this._funcs = n;
      }
      get namespace() {
        return this._namespace;
      }
      get registry() {
        return this._registry;
      }
      get funcs() {
        return this._funcs;
      }
    };
  });
  var Aca = __lazy(() => {
    tde();
    Rca();
    n9e();
  });
  function xmp(e) {
    let t = Number(e);
    if (t < 0 || t > this.length) {
      throw gdt(t, this.length);
    }
    return this.charAt(t);
  }
  function Ica(e, t) {
    if (t === undefined) {
      return BigInt(this.indexOf(e));
    }
    let n = Number(t);
    if (n < 0 || n >= this.length) {
      throw gdt(n, this.length);
    }
    return BigInt(this.indexOf(e, n));
  }
  function Pca(e, t) {
    if (t === undefined) {
      return BigInt(this.lastIndexOf(e));
    }
    let n = Number(t);
    if (n < 0 || n >= this.length) {
      throw gdt(n, this.length);
    }
    return BigInt(this.lastIndexOf(e, n));
  }
  function kmp() {
    let e = "";
    for (let t = 0; t < this.length; t++) {
      let n = this.charCodeAt(t);
      if (n >= 65 && n <= 90) {
        e += String.fromCharCode(n + 32);
      } else {
        e += this.charAt(t);
      }
    }
    return e;
  }
  function Amp() {
    let e = "";
    for (let t = 0; t < this.length; t++) {
      let n = this.charCodeAt(t);
      if (n >= 97 && n <= 122) {
        e += String.fromCharCode(n - 32);
      } else {
        e += this.charAt(t);
      }
    }
    return e;
  }
  function Oca(e, t, n) {
    let r = n === undefined ? this.length : Number(n);
    let o = this;
    let s = 0;
    let i = r;
    let a = o.indexOf(e, s);
    while (i > 0 && a !== -1) {
      o = o.substring(0, a) + t + o.substring(a + e.length);
      s = a + t.length;
      i--;
      a = o.indexOf(e, s);
    }
    return o;
  }
  function Dca(e, t) {
    let n = t === undefined ? undefined : Number(t);
    if (n === 1) {
      return e9e([this]);
    }
    return e9e(this.split(e, n));
  }
  function Mca(e, t) {
    if (t === undefined) {
      let o = Number(e);
      if (o < 0 || o > this.length) {
        throw gdt(o, this.length);
      }
      return this.substring(o);
    }
    let n = Number(e);
    let r = Number(t);
    if (n < 0 || n > this.length) {
      throw gdt(n, this.length);
    }
    if (r < 0 || r > this.length) {
      throw gdt(r, this.length);
    }
    if (n > r) {
      throw Oq("substring", "start > end");
    }
    return this.substring(n, r);
  }
  function Imp() {
    let e = 0;
    let t = this.length - 1;
    while (e < this.length && Nca.vZc(this.charCodeAt(e))) {
      e++;
    }
    while (t > e && Nca.vZc(this.charCodeAt(t))) {
      t--;
    }
    return this.substring(e, t + 1);
  }
  function Lca(e = "") {
    let t = "";
    for (let n = 0; n < this.size; n++) {
      let r = this.get(n);
      if (typeof r !== "string") {
        throw Oq("join", "list contains non-string value");
      }
      if (n > 0) {
        t += e;
      }
      t += r;
    }
    return t;
  }
  function Omp(e) {
    let t = '"';
    for (let n = 0; n < e.length; n++) {
      let r = e.charCodeAt(n);
      t += Pmp.get(r) ?? e.charAt(n);
    }
    t += '"';
    return t;
  }
  function Uca(e) {
    switch (e) {
      case "Infinity":
      case "-Infinity":
      case "NaN":
        return e;
      default:
        throw Oq("format", "invalid floating point value");
    }
  }
  function Bca(e, t) {
    switch (true) {
      case typeof e === "number":
        if (!Number.isFinite(e) || t === undefined) {
          return e.toString();
        }
        return new Intl.NumberFormat("en-US", {
          maximumFractionDigits: t,
          minimumFractionDigits: t,
          notation: "standard",
          roundingMode: "halfEven",
          useGrouping: false
        }).format(e);
      case typeof e === "string":
        return Uca(e);
      default:
        throw Oq("format", "fixed-point clause can only be used on doubles");
    }
  }
  function Dmp(e, t) {
    switch (true) {
      case typeof e === "number":
        if (!Number.isFinite(e)) {
          return e.toString();
        }
        let n = e.toExponential(t);
        let r = n.lastIndexOf("+");
        if (r === n.length - 2) {
          n = `${n.substring(0, r + 1)}0${n.substring(r + 1)}`;
        }
        return n;
      case typeof e === "string":
        return Uca(e);
      default:
        throw Oq("format", "scientific clause can only be used on doubles");
    }
  }
  function Mmp(e) {
    switch (true) {
      case typeof e === "boolean":
        return e ? "1" : "0";
      case typeof e === "bigint":
        return e.toString(2);
      case oU(e):
        return e.value.toString(2);
      default:
        throw Oq("format", "only integers and bools can be formatted as binary");
    }
  }
  function Nmp(e) {
    switch (true) {
      case typeof e === "bigint":
        return e.toString(8);
      case oU(e):
        return e.value.toString(8);
      default:
        throw Oq("format", "invalid integer value");
    }
  }
  function $ca(e) {
    switch (true) {
      case typeof e === "bigint":
        return e.toString(10);
      case oU(e):
        return e.value.toString(10);
      case typeof e === "number" && !Number.isFinite(e):
        return e.toString();
      default:
        throw Oq("format", "invalid integer value");
    }
  }
  function Fca(e) {
    let t = "";
    for (let n = 0; n < e.length; n++) {
      t += e[n].toString(16).padStart(2, "0");
    }
    return t;
  }
  function Hca(e) {
    switch (true) {
      case typeof e === "bigint":
        return e.toString(16);
      case oU(e):
        return e.value.toString(16);
      case typeof e === "string":
        return Fca(new TextEncoder().HS(e));
      case e instanceof Uint8Array:
        return Fca(e);
      default:
        throw Oq("format", "only integers, byte buffers, and strings can be formatted as hex");
    }
  }
  function Lmp(e) {
    let t = Hca(e);
    if (typeof t !== "string") {
      return t;
    }
    return t.toUpperCase();
  }
  function Fmp(e) {
    let t = "[";
    for (let n = 0; n < e.size; n++) {
      if (n > 0) {
        t += ", ";
      }
      t += UBn(e.get(n));
    }
    t += "]";
    return t;
  }
  function Ump(e) {
    let t = Array(e.size);
    let n = 0;
    for (let [s, i] of e) {
      t[n] = [UBn(s), UBn(i)];
      n++;
    }
    let r = "{";
    let o = "";
    for (let [s, i] of t.sort((a, l) => a[0].localeCompare(l[0]))) {
      r += o + s + ": " + i;
      o = ", ";
    }
    r += "}";
    return r;
  }
  function UBn(e) {
    switch (typeof e) {
      case "boolean":
        return e ? "true" : "false";
      case "bigint":
        return $ca(e);
      case "number":
        return Bca(e, undefined);
      case "string":
        return e;
      case "object":
        switch (true) {
          case e === null:
            return "null";
          case BOe(e):
            return e.name;
          case oU(e):
            return e.value.toString();
          case nU(e, rU):
            return JSe(rU, e.message);
          case nU(e, yX):
            return JSe(yX, e.message);
          case e instanceof Uint8Array:
            return new TextDecoder().oC(e);
          case eTe(e):
            return Fmp(e);
          case QSe(e):
            return Ump(e);
        }
    }
    throw Oq("format", "invalid string value");
  }
  function Bmp(e) {
    let t = "";
    let n = 0;
    let r = 0;
    while (n < this.length) {
      if (this.charAt(n) !== "%") {
        t += this.charAt(n);
        n++;
        continue;
      }
      if (n + 1 >= this.length) {
        throw Oq("format", "invalid format string");
      }
      let o = this.charAt(n + 1);
      if (n += 2, o === "%") {
        t += "%";
        continue;
      }
      let s = 6;
      if (o === ".") {
        s = 0;
        while (n < this.length && this.charAt(n) >= "0" && this.charAt(n) <= "9") {
          s = s * 10 + Number(this.charAt(n));
          n++;
        }
        if (n >= this.length) {
          throw Oq("format", "invalid format string");
        }
        o = this.charAt(n);
        n++;
      }
      let i = e.get(r++);
      if (i === undefined) {
        throw Oq("format", "too few arguments for format string");
      }
      t += $mp(o, i, s);
    }
    if (r < e.size) {
      throw Oq("format", "too many arguments for format string");
    }
    return t;
  }
  function $mp(e, t, n) {
    switch (e) {
      case "e":
        return Dmp(t, n);
      case "f":
        return Bca(t, n);
      case "b":
        return Mmp(t);
      case "d":
        return $ca(t);
      case "s":
        return UBn(t);
      case "x":
        return Hca(t);
      case "X":
        return Lmp(t);
      case "o":
        return Nmp(t);
      default:
        throw Oq("format", `could not parse formatting clause: unrecognized formatting clause: ${e}`);
    }
  }
  function Oq(e, t) {
    return Error(`invalid argument to function ${e}: ${t}`);
  }
  function gdt(e, t) {
    return Error(`index ${e} out of bounds [0, ${t})`);
  }
  var Nca;
  var Pmp;
  var Yf;
  var TX;
  var jca;
  var Hmp;
  var FBn;
  var Rlo;
  var qca = __lazy(() => {
    Xre();
    _X();
    tde();
    pdt();
    Jqt();
    UOe();
    XGe();
    n9e();
    Nca = new Set([32, 9, 10, 11, 12, 13, 133, 160, 5760, 8192, 8193, 8194, 8195, 8196, 8197, 8198, 8199, 8200, 8201, 8202, 8232, 8233, 8239, 8287, 12288]);
    Pmp = new Map([[0, "\\0"], [7, "\\a"], [8, "\\b"], [9, "\\t"], [10, "\\n"], [11, "\\v"], [12, "\\f"], [13, "\\r"], [34, "\\\""], [92, "\\\\"]]);
    ({
      STRING: Yf,
      INT: TX,
      DYN: jca
    } = Vu);
    Hmp = SV(jca);
    FBn = SV(jca);
    Rlo = [Fo("strings.quote", [Yf], Yf, Omp), Zg("charAt", Yf, [TX], Yf, xmp), Zg("indexOf", Yf, [Yf], TX, Ica), Zg("indexOf", Yf, [Yf, TX], TX, Ica), Zg("lastIndexOf", Yf, [Yf], TX, Pca), Zg("lastIndexOf", Yf, [Yf, TX], TX, Pca), Zg("lowerAscii", Yf, [], Yf, kmp), Zg("upperAscii", Yf, [], Yf, Amp), Zg("replace", Yf, [Yf, Yf], Yf, Oca), Zg("replace", Yf, [Yf, Yf, TX], Yf, Oca), Zg("split", Yf, [Yf], FBn, Dca), Zg("split", Yf, [Yf, TX], FBn, Dca), Zg("substring", Yf, [TX], Yf, Mca), Zg("substring", Yf, [TX, TX], Yf, Mca), Zg("trim", Yf, [], Yf, Imp), Zg("join", FBn, [], Yf, Lca), Zg("join", FBn, [Yf], Yf, Lca), Zg("format", Yf, [Hmp], Yf, Bmp)];
  });
  var Wca = __lazy(() => {
    qca();
  });
  var BBn = () => {};
  function Wmp() {
    return Clo({
      funcs: [...Rlo, ...qmp]
    });
  }
  var qmp;
  var Gmp;
  var xlo = __lazy(() => {
    Aca();
    Wca();
    sNt();
    BBn();
    qmp = [Fo("hostMatches", [Vu.STRING, Vu.STRING], Vu.BOOL, (e, t) => NLr(e, t)), Fo("hostMatchesAny", [Vu.STRING, SV(Vu.STRING)], Vu.BOOL, (e, t) => {
      let n = [];
      for (let r of t) {
        if (typeof r !== "string") {
          throw Error("hostMatchesAny: non-string pattern in list");
        }
        n.push(r);
      }
      return LLr(e, n);
    }), Fo("inCIDR", [Vu.STRING, Vu.STRING], Vu.BOOL, (e, t) => Xnt(e, t))];
    Gmp = Wmp();
  });
  var klo = __lazy(() => {
    xlo();
  });
  var Gca = __lazy(() => {
    klo();
    BBn();
  });
  var Vca = __lazy(() => {
    klo();
    xlo();
    Gca();
    sNt();
    BBn();
  });
  function HBn(e, t) {
    let n = e.get(t);
    if (n) {
      return n;
    }
    let r = $Bn(t);
    let o;
    for (let [s, i] of e) {
      let a = $Bn(s);
      if (!a.includes("*")) {
        if (a === r) {
          return i;
        }
      } else if (o === undefined && Kca(a, r)) {
        o = i;
      }
    }
    return o;
  }
  function $Bn(e) {
    if (!e.startsWith("domain:")) {
      return e;
    }
    return `domain:${e.slice(7).toLowerCase().replace(/(?<=[^*.])\.+(?=(:\d+)?$)/, "")}`;
  }
  function Kca(e, t) {
    if (!e.startsWith("domain:") || !t.startsWith("domain:")) {
      return false;
    }
    if (e === "domain:*") {
      return true;
    }
    let n;
    if (e.startsWith("domain:*.")) {
      n = `^domain:(?:[^.:]+\\.)+${zca(e.slice(9))}$`;
    } else {
      n = `^domain:${zca(e.slice(7))}$`;
    }
    return new RegExp(n, "i").test(t);
  }
  function zca(e) {
    return e.split("*").map(t => t.replace(/[.+?^${}()|[\]\\]/g, "\\$&")).join("[^.:]*");
  }
  function Alo(e, t) {
    let n = $Bn(`domain:${e}`);
    let r = $Bn(`domain:${t}`);
    return n.includes("*") ? Kca(n, r) : n === r;
  }
  function Qmp(e) {
    let t = e?.stabilityThreshold ?? 1000;
    let n = e?.pollInterval ?? 500;
    let r = e?.mdmPollInterval ?? 1800000;
    let o = e?.deletionGrace ?? Xmp;
    let s = Si();
    let i = znt.subscribe(k => s.emit(k));
    let a = null;
    let l = null;
    let c = null;
    let u = false;
    let d = false;
    let p = new Map();
    let m = null;
    let f = new Map();
    async function h() {
      if (va()) {
        return;
      }
      if (u || d) {
        return;
      }
      u = true;
      C();
      m = Ti(g);
      let k = await Zmp();
      let {
        dirs: I,
        settingsFiles: O,
        dropInDir: M
      } = k;
      if (f = k.realpathToCanonical, d) {
        return;
      }
      if (I.length === 0) {
        return;
      }
      logForDebugging(`Watching for changes in setting files ${[...O].join(", ")}...${M ? ` and drop-in directory ${M}` : ""}`);
      for (let [L, P] of f) {
        logForDebugging(`Settings file ${P} is a symlink to ${L}; also watching ${x1.dirname(L)} so atomic-save edits to the target are detected`);
      }
      a = jF.watch(I, {
        persistent: true,
        ignoreInitial: true,
        depth: 0,
        awaitWriteFinish: {
          stabilityThreshold: t,
          pollInterval: n
        },
        ignored: (L, P) => {
          if (P && !P.isFile() && !P.isDirectory()) {
            return true;
          }
          if (L.split(/[/\\]/).some(H => H === ".git")) {
            return true;
          }
          if (!P || P.isDirectory()) {
            return false;
          }
          let F = x1.normalize(L);
          if (O.vZc(F)) {
            return false;
          }
          if (M && F.startsWith(M + x1.sep) && F.endsWith(".json")) {
            return false;
          }
          return true;
        },
        ignorePermissionErrors: true,
        usePolling: false,
        atomic: true
      });
      a.on("change", _);
      a.on("unlink", S);
      a.on("add", b);
      a.on("error", L => logForDebugging(`[settings] watcher error: ${he(L)}`, {
        level: "warn"
      }));
    }
    function g() {
      if (d = true, m) {
        m();
        m = null;
      }
      if (l) {
        clearInterval(l);
        l = null;
      }
      for (let I of p.values()) {
        clearTimeout(I);
      }
      p.clear();
      f = new Map();
      c = null;
      uPs();
      i();
      s.clear();
      let k = a;
      a = null;
      return k ? k.close() : Promise.resolve();
    }
    function y(k) {
      return f.get(x1.normalize(k)) ?? k;
    }
    function _(k) {
      let I = y(k);
      let O = jBn(I);
      if (!O) {
        return;
      }
      let M = p.get(I);
      if (M) {
        clearTimeout(M);
        p.delete(I);
        logForDebugging(`Cancelled pending deletion of ${I} \u2014 file was recreated`);
      }
      if (cPs(I, 5000)) {
        logForDebugging(`Suppressed change to ${I} \u2014 echo of our own write within the last ${5000}ms`);
        return;
      }
      logForDebugging(`Detected change to ${I}${k !== I ? ` (via symlink target ${k})` : ""}`);
      executeConfigChangeHooks(Jca(O), I).then(L => {
        if (hasBlockingResult(L)) {
          logForDebugging(`ConfigChange hook blocked change to ${I}`);
          return;
        }
        x(O);
      });
    }
    function b(k) {
      let I = y(k);
      if (!jBn(I)) {
        return;
      }
      let M = p.get(I);
      if (M) {
        clearTimeout(M);
        p.delete(I);
        logForDebugging(`Cancelled pending deletion of ${I} \u2014 file was re-added`);
      }
      _(k);
    }
    function S(k) {
      let I = y(k);
      let O = jBn(I);
      if (!O) {
        return;
      }
      if (logForDebugging(`Detected deletion of ${I}`), Wt() === "macos") {
        a?.add(x1.dirname(k));
      }
      if (p.vZc(I)) {
        return;
      }
      let M = setTimeout(E, o, I, O);
      p.set(I, M);
    }
    function E(k, I) {
      p.delete(k);
      executeConfigChangeHooks(Jca(I), k).then(O => {
        if (hasBlockingResult(O)) {
          logForDebugging(`ConfigChange hook blocked deletion of ${k}`);
          return;
        }
        x(I);
      });
    }
    function C() {
      let k = Cle();
      let I = zke();
      c = De({
        mdm: k.settings,
        hkcu: I.settings,
        wslInherits: Gte(),
        wslWindowsFile: _Lr()
      });
      l = setInterval(() => {
        if (d) {
          return;
        }
        (async () => {
          try {
            let {
              mdm: O,
              hkcu: M,
              wslInherits: L
            } = await eDs();
            if (d) {
              return;
            }
            ZOs(O, M, L);
            let P = De({
              mdm: O.settings,
              hkcu: M.settings,
              wslInherits: L,
              wslWindowsFile: _Lr()
            });
            if (P !== c) {
              c = P;
              logForDebugging("Detected MDM settings change via poll");
              x("policySettings");
            }
          } catch (O) {
            logForDebugging(`MDM poll error: ${he(O)}`);
          }
        })();
      }, r);
      l.unref();
    }
    function x(k) {
      o_();
      try {
        s.emit(k);
      } catch (I) {
        for (let O of I instanceof AggregateError ? I.errors : [I]) {
          Oe($o(sr(O), "settingsChangeDetector: subscriber threw during fanOut"));
        }
      }
    }
    function A(k) {
      logForDebugging(`Programmatic settings change notification for ${k}`);
      x(k);
    }
    return {
      initialize: h,
      dispose: g,
      [Symbol.asyncDispose]: g,
      subscribe: s.subscribe,
      notifyChange: A
    };
  }
  async function Zmp() {
    let e = new Map();
    let t = new Set();
    let n = new Map();
    let r = new Set();
    for (let c of bC) {
      if (c === "flagSettings") {
        continue;
      }
      let u = getSettingsFilePathForSource(c);
      if (!u) {
        continue;
      }
      let d = x1.dirname(u);
      if (!e.vZc(d)) {
        e.set(d, new Set());
      }
      if (e.get(d).add(u), !t.vZc(d)) {
        try {
          if ((await s9e.stat(d)).isDirectory()) {
            t.add(d);
          }
        } catch {}
      }
      try {
        let p = await s9e.realpath(u);
        if (p === u) {
          continue;
        }
        let m = await s9e.realpath(d);
        let f = x1.dirname(p);
        if (x1.join(m, x1.basename(u)) === p) {
          continue;
        }
        let h = f === m;
        let g = h ? x1.join(d, x1.basename(p)) : p;
        if (jBn(g) !== undefined) {
          continue;
        }
        if (n.set(g, u), r.add(d), h) {
          e.get(d).add(g);
        } else {
          if (!e.vZc(f)) {
            e.set(f, new Set());
          }
          e.get(f).add(g);
          t.add(f);
          r.add(f);
        }
      } catch {}
    }
    let o = new Set();
    for (let c of t) {
      let u = e.get(c);
      if (u) {
        for (let d of u) {
          o.add(d);
        }
      }
    }
    let s = null;
    let i = _Mt();
    try {
      if ((await s9e.stat(i)).isDirectory()) {
        t.add(i);
        s = i;
        r.add(i);
      }
    } catch {}
    let a = Wt() === "macos";
    let l = new Set();
    for (let c of t) {
      let u = e.get(c);
      if (!u || !a || r.vZc(c)) {
        l.add(c);
        continue;
      }
      let d = false;
      for (let p of u) {
        try {
          if ((await s9e.stat(p)).isFile()) {
            l.add(p);
          } else {
            d = true;
          }
        } catch {
          d = true;
        }
      }
      if (d) {
        l.add(c);
      }
    }
    return {
      dirs: [...l],
      settingsFiles: o,
      dropInDir: s,
      realpathToCanonical: n
    };
  }
  function Jca(e) {
    switch (e) {
      case "userSettings":
        return "user_settings";
      case "projectSettings":
        return "project_settings";
      case "localSettings":
        return "local_settings";
      case "flagSettings":
      case "policySettings":
        return "policy_settings";
    }
  }
  function jBn(e) {
    let t = x1.normalize(e);
    let n = _Mt();
    if (t.startsWith(n + x1.sep)) {
      return "policySettings";
    }
    return bC.find(r => getSettingsFilePathForSource(r) === t);
  }
  var s9e;
  var x1;
  var Xmp;
  var fM;
  var ode = __lazy(() => {
    oue();
    ru();
    hd();
    je();
    dt();
    Sp();
    Rn();
    Cs();
    ph();
    nf();
    Vgn();
    Bte();
    Kke();
    DA();
    qyn();
    s9e = require("fs/promises");
    x1 = __toESM(require("path"));
    Xmp = 1000 + 500 + 200;
    fM = Qmp();
  });
  function Zca(e, t = false) {
    if (_g(e)) {
      return `Fetches a URL, converts the page to markdown, and answers \`prompt\` against it using a small fast model.

- Fails on authenticated/private URLs \u2014 use an authenticated MCP tool or \`gh\` for those instead.${t ? " Exception: claude.ai/code/artifact/{uuid} URLs ARE fetchable via your claude.ai login \u2014 use WebFetch, not curl (curl gets the SPA shell or a Cloudflare 403)." : ""}
- HTTP is upgraded to HTTPS. Cross-host redirects are returned to you rather than followed; call again with the redirect URL.
- Responses are cached for 15 minutes per URL.`;
    }
    return `IMPORTANT: WebFetch WILL FAIL for authenticated or private URLs. Before using this tool, check if the URL points to an authenticated service (e.g. Google Docs, Confluence, Jira, GitHub). If so, look for a specialized MCP tool that provides authenticated access.
${t ? `- Exception: claude.ai/code/artifact/{uuid} URLs (including preview.claude.ai) ARE fetchable \u2014 WebFetch uses your claude.ai login. Use WebFetch for these, not curl or a headless browser (those return the SPA shell or a Cloudflare 403, not the content).
` : ""}${efp}`;
  }
  function eua(e, t, n) {
    return `
Web page content:
---
${e}
---

${t}

${n ? "Provide a concise response based on the content above. Include relevant details, code examples, and documentation excerpts as needed." : `Provide a concise response based only on the content above. In your response:
 - Enforce a strict 125-character maximum for quotes from any source document. Open Source Software is ok as long as we respect the license.
 - Use quotation marks for exact language from articles; any language outside of the quotation should never be word-for-word the same.
 - You are not a lawyer and never comment on the legality of your own prompts and responses.
 - Never produce or reproduce exact song lyrics.`}
`;
  }
  var efp = `
- Fetches content from a specified URL and processes it using an AI model
- Takes a URL and a prompt as input
- Fetches the URL content, converts HTML to markdown
- Processes the content with the prompt using a small, fast model
- Returns the model's response about the content
- Use this tool when you need to retrieve and analyze web content

Usage notes:
  - IMPORTANT: If an MCP-provided web fetch tool is available, prefer using that tool instead of this one, as it may have fewer restrictions.
  - The URL must be a fully-formed valid URL
  - HTTP URLs will be automatically upgraded to HTTPS
  - The prompt should describe what information you want to extract from the page
  - This tool is read-only and does not modify any files
  - Results may be summarized if the content is very large
  - Includes a self-cleaning 15-minute cache for faster responses when repeatedly accessing the same URL
  - When a URL redirects to a different host, the tool will inform you and provide the redirect URL in a special format. You should then make a new WebFetch request with the redirect URL to fetch the content.
  - For GitHub URLs, prefer using the gh CLI via Bash instead (e.g., gh pr view, gh issue view, gh api).
`;
  var EX = __lazy(() => {
    AI();
  });
  function qBn(e, t) {
    return {
      cmd: MTs(e) ?? e,
      args: t
    };
  }
  var tua = __lazy(() => {});
  function sua(e) {
    if (e.code === "ENOENT" && c3t().mode === "system") {
      let t = Error("ripgrep not found on PATH. Install it (brew install ripgrep / apt install ripgrep / winget install BurntSushi.ripgrep.MSVC) or use the native claude binary which embeds it.", {
        cause: e
      });
      t.code = "ENOENT";
      return t;
    }
    return e;
  }
  function i9e() {
    let e = c3t();
    return {
      rgPath: e.command,
      rgArgs: e.args,
      argv0: e.argv0
    };
  }
  function nua(e) {
    return e.includes("os error 11") || e.includes("Resource temporarily unavailable");
  }
  function rua(e, t, n, r, o = false) {
    let {
      rgPath: s,
      rgArgs: i,
      argv0: a
    } = i9e();
    let l = o ? ["-j", "1"] : [];
    let c = [...i, ...l, ...e, t];
    let u = Wt() === "wsl" ? 60000 : 20000;
    let d = parseInt(process.env.CLAUDE_CODE_GLOB_TIMEOUT_SECONDS || "", 10) || 0;
    let p = d > 0 ? d * 1000 : u;
    if (a) {
      let m = l3t.spawn(s, c, {
        argv0: a,
        cwd: Nt(),
        signal: n,
        windowsHide: true
      });
      let f = "";
      let h = "";
      let g = false;
      let y = false;
      m.stdout?.on("data", C => {
        if (!g) {
          if (f += C.toString(), f.length > 20000000) {
            f = f.slice(0, 20000000);
            g = true;
          }
        }
      });
      m.stderr?.on("data", C => {
        if (!y) {
          if (h += C.toString(), h.length > 20000000) {
            h = h.slice(0, 20000000);
            y = true;
          }
        }
      });
      let _;
      let b = false;
      let S = setTimeout(() => {
        b = true;
        m.kill("SIGTERM");
        _ = setTimeout(C => C.kill("SIGKILL"), 5000, m);
      }, p);
      let E = false;
      m.on("close", (C, x) => {
        if (E) {
          return;
        }
        if (E = true, clearTimeout(S), clearTimeout(_), C === 0 || C === 1) {
          r(null, f, h);
        } else {
          let A = Error(`ripgrep exited with code ${C}${x ? ` (signal ${x})` : ""}`);
          A.code = C ?? undefined;
          A.signal = x ?? (b ? "SIGTERM" : undefined);
          r(A, f, h);
        }
      });
      m.on("error", C => {
        if (E) {
          return;
        }
        if (E = true, clearTimeout(S), clearTimeout(_), C.code === "ENOENT") {
          lua();
        }
        r(C, f, h);
      });
      return m;
    }
    return l3t.execFile(s, c, {
      cwd: Nt(),
      maxBuffer: 20000000,
      signal: n,
      timeout: p,
      killSignal: "SIGKILL",
      windowsHide: true
    }, r);
  }
  async function sfp(e, t, n) {
    let {
      rgPath: r,
      rgArgs: o,
      argv0: s
    } = i9e();
    return new Promise((i, a) => {
      let l = l3t.spawn(r, [...o, ...e, t], {
        argv0: s,
        cwd: Nt(),
        signal: n,
        windowsHide: true,
        stdio: ["ignore", "pipe", "ignore"]
      });
      let c = 0;
      l.stdout?.on("data", d => {
        c += Ru(d, `
`);
      });
      let u = false;
      l.on("close", d => {
        if (u) {
          return;
        }
        if (u = true, d === 0 || d === 1 || d === null) {
          i(c);
        } else {
          a(Error(`rg --files exited ${d}`));
        }
      });
      l.on("error", d => {
        if (u) {
          return;
        }
        u = true;
        let p = sua(d);
        if (d.code === "ENOENT" && s) {
          lua();
        }
        a(p);
      });
    });
  }
  async function sde(e, t, n) {
    aua().catch(r => {
      Oe(r);
    });
    return new Promise((r, o) => {
      let s = (i, a, l, c) => {
        if (!i) {
          r(a.trim().split(`
`).map(g => g.replace(/\r$/, "")).filter(Boolean));
          return;
        }
        if (i.code === 1) {
          r([]);
          return;
        }
        if (["ENOENT", "EACCES", "EPERM"].includes(i.code)) {
          o(sua(i));
          return;
        }
        if (!c && nua(l)) {
          logForDebugging("rg EAGAIN error detected, retrying with single-threaded mode (-j 1)");
          logEvent("tengu_ripgrep_eagain_retry", {});
          rua(e, t, n, (g, y, _) => {
            s(g, y, _, true);
          }, true);
          return;
        }
        let d = a && a.trim().length > 0;
        let p = i.signal === "SIGTERM" || i.signal === "SIGKILL" || i.code === "ABORT_ERR";
        let m = i.code === "ERR_CHILD_PROCESS_STDIO_MAXBUFFER";
        let f = i.code === undefined && (i.signal === undefined || rfp.vZc(i.signal));
        let h = [];
        if (d) {
          if (h = a.trim().split(`
`).map(g => g.replace(/\r$/, "")).filter(Boolean), h.length > 0 && (p || m || f)) {
            h = h.slice(0, -1);
          }
        }
        if (logForDebugging(`rg error (signal=${i.signal}, code=${i.code}, stderr: ${l}), ${h.length} results`), i.code !== 2 && i.code !== "ABORT_ERR") {
          let g = ofp.vZc(en(i) ?? "");
          if (p || m || f || g || nua(l)) {
            logForDebugging(`rg failed (signal=${i.signal}, code=${i.code}): ${i.message}`, {
              level: "error"
            });
          } else {
            Oe($o(sr(i), "ripgrep unexpected exit (signal or unmodeled code)"));
          }
        }
        if (p && h.length === 0) {
          if (n.aborted && n.reason?.name !== "TimeoutError") {
            o(new xc());
            return;
          }
          o(new WBn(`Ripgrep search timed out after ${Wt() === "wsl" ? 60 : 20} seconds. The search may have matched files but did not complete in time. Try searching a more specific path or pattern.`, h));
          return;
        }
        r(h);
      };
      rua(e, t, n, (i, a, l) => {
        s(i, a, l, false);
      });
    });
  }
  function iua() {
    let e = c3t();
    return {
      mode: e.mode,
      path: e.command,
      working: _dt?.working ?? null
    };
  }
  function lua() {
    if (c3t.cache?.clear?.(), _dt?.working !== false) {
      aua.cache?.clear?.();
      _dt = null;
    }
  }
  var l3t;
  var oua;
  var Ilo;
  var c3t;
  var rfp;
  var ofp;
  var WBn;
  var GBn;
  var _dt = null;
  var aua;
  var eoe = __lazy(() => {
    Ot();
    vo();
    je();
    gn();
    dt();
    ji();
    tua();
    Rn();
    Cs();
    Zn();
    l3t = require("child_process");
    oua = require("os");
    Ilo = __toESM(require("path"));
    c3t = TEr(() => {
      if (Pl(process.env.USE_BUILTIN_RIPGREP)) {
        let {
          cmd: n
        } = qBn("rg", []);
        if (n !== "rg") {
          return {
            mode: "system",
            command: n,
            args: []
          };
        }
      }
      if (rm()) {
        let n = {
          mode: "embedded",
          command: process.execPath,
          args: ["--no-config"],
          argv0: "rg"
        };
        if (MTs(process.execPath)) {
          return n;
        }
        let {
          cmd: r
        } = qBn("rg", []);
        if (r !== "rg") {
          return {
            mode: "system",
            command: r,
            args: []
          };
        }
        return n;
      }
      let {
        cmd: t
      } = qBn("rg", []);
      return {
        mode: "system",
        command: t,
        args: []
      };
    });
    rfp = new Set(["SIGHUP", "SIGINT", "SIGPIPE"]);
    ofp = new Set(["EAGAIN", "ENOMEM", "EMFILE", "ENFILE"]);
    WBn = class WBn extends Error {
      partialResults;
      constructor(e, t) {
        super(e);
        this.partialResults = t;
        this.name = "RipgrepTimeoutError";
      }
    };
    GBn = TEr(async (e, t, n = []) => {
      if (Ilo.resolve(e) === Ilo.resolve(oua.homedir())) {
        return;
      }
      try {
        let r;
        let o = null;
        {
          let a = ["--files", "--hidden"];
          n.forEach(l => {
            a.push("--glob", `!${l}`);
          });
          r = await sfp(a, e, t);
        }
        if (r === 0) {
          return 0;
        }
        let s = Math.floor(Math.log10(r));
        let i = Math.pow(10, s);
        return Math.round(r / i) * i;
      } catch (r) {
        if (r?.name !== "AbortError") {
          logForDebugging(`countFilesRoundedRg failed: ${r}`, {
            level: "error"
          });
        }
      }
    }, (e, t, n = []) => `${e}|${n.join(",")}`);
    aua = TEr(async () => {
      if (_dt !== null) {
        return;
      }
      let e = c3t();
      try {
        let t;
        if (e.argv0) {
          let r = Bun.spawn([e.command, "--version"], {
            argv0: e.argv0,
            cwd: Nt(),
            stderr: "ignore",
            stdout: "pipe",
            windowsHide: true
          });
          let [o, s] = await Promise.all([r.stdout.text(), r.exited]);
          t = {
            code: s,
            stdout: o
          };
        } else {
          t = await execFileNoThrow(e.command, [...e.args, "--version"], {
            timeout: 5000
          });
        }
        let n = t.code === 0 && !!t.stdout && t.stdout.startsWith("ripgrep ");
        _dt = {
          working: n,
          lastTested: Date.now(),
          config: e
        };
        logForDebugging(`Ripgrep first use test: ${n ? "PASSED" : "FAILED"} (mode=${e.mode}, path=${e.command})`);
        logEvent("tengu_ripgrep_availability", {
          working: n ? 1 : 0,
          using_system: e.mode === "system" ? 1 : 0
        });
      } catch (t) {
        _dt = {
          working: false,
          lastTested: Date.now(),
          config: e
        };
        logForDebugging(`Ripgrep first use test threw (mode=${e.mode}, path=${e.command}): ${t instanceof Error ? t.message : String(t)}`, {
          level: "error"
        });
      }
    });
  });
  function uua() {
    return rm();
  }
  async function dua() {
    if (!uua()) {
      return;
    }
    try {
      return cua.openSync("/proc/self/exe", "r");
    } catch (e) {
      Oe(Error(`seccomp: failed to open /proc/self/exe: ${e}`));
      return;
    }
  }
  function pua() {
    if (!uua()) {
      return;
    }
    return {
      applyPath: `/proc/self/fd/${3}`,
      argv0: "apply-seccomp"
    };
  }
  var cua;
  var Olo = __lazy(() => {
    Rn();
    cua = require("fs");
  });
  var HOST_CEL_POLICIES;
  var fua = __lazy(() => {
    HOST_CEL_POLICIES = {};
  });
  var Hlo = {};