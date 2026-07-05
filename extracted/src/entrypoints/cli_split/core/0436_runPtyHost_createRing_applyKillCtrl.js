  __export(w_c, {
    runPtyHost: () => runPtyHost,
    createRing: () => createRing,
    applyKillCtrl: () => applyKillCtrl
  });
  async function runPtyHost(e) {
    let t = e.indexOf("--");
    if (!e.includes("--bg-spare", t + 1)) {
      await __c();
    }
    if (t < 3 || t === e.length - 1) {
      return $nn(undefined, "bad argv: --bg-pty-host <sock> <cols> <rows> -- <file> [args...]");
    }
    let n = e[0];
    process.on("uncaughtException", U => $nn(n, `uncaught: ${U?.stack ?? String(U)}`));
    process.on("unhandledRejection", U => $nn(n, `unhandledRejection: ${U?.stack ?? String(U)}`));
    let r = Number(e[1]) || 200;
    let o = Number(e[2]) || 50;
    let s = e[t + 1];
    let i = e.slice(t + 2);
    let a = process.env.CLAUDE_PTY_HOST_EXEC === "1";
    delete process.env.CLAUDE_PTY_HOST_EXEC;
    let l = process.env.CLAUDE_BG_PTY_AUTH;
    delete process.env.CLAUDE_BG_PTY_AUTH;
    let c = process.env.CLAUDE_BG_SOCKET_TOKENS_PATH;
    if (c) {
      let U = await UEt(c);
      if (U?.ptyAuth) {
        l = U.ptyAuth;
      } else if (!l) {
        H7o(n, "tokens-file unreadable; DATA gate fail-open");
      }
      if (a) {
        delete process.env.CLAUDE_BG_SOCKET_TOKENS_PATH;
        await Vmr.unlink(c).catch(() => {});
      }
    }
    if (Wt() !== "windows") {
      try {
        zmr.setPriority(0, Math.min(zmr.getPriority(0) + 5, 19));
      } catch {}
    }
    let u = createRing(262144);
    let d = new Set();
    let p = new WeakMap();
    let m = new WeakSet();
    let f = new WeakSet();
    let h = false;
    let g = false;
    let y = false;
    let _ = process.ppid;
    let b = 0;
    let S = null;
    let E = g_f(process.env.CLAUDE_PTY_RECORD, r, o);
    function C(U) {
      for (let N of d) {
        if (N.destroyed) {
          d.delete(N);
          continue;
        }
        if (N.writableLength > 1048576) {
          N.destroy();
          d.delete(N);
          continue;
        }
        N.write(U);
      }
    }
    let x;
    let A;
    try {
      x = new Bun.Terminal({
        cols: r,
        rows: o,
        data(U, N) {
          y = true;
          let W = Buffer.from(N);
          if (u.push(W), E?.write(W), d.size) {
            C(_Qt(W));
          }
        }
      });
      A = Bun.spawn([s, ...i], {
        cwd: process.cwd(),
        env: {
          ...process.env,
          TERM: "xterm-256color"
        },
        terminal: x,
        windowsHide: true,
        detached: false
      });
    } catch (U) {
      $nn(n, `spawn failed: ${String(U)}`);
    }
    function k(U, N) {
      if (!U.destroyed) {
        U.write(N);
      }
    }
    function I(U) {
      switch (U.t) {
        case "resize":
          {
            let N = Number(U.cols);
            let W = Number(U.rows);
            if (N > 0 && N <= 1e4 && W > 0 && W <= 1e4 && !h && !g) {
              if (x.resize(N, W), Wt() !== "windows") {
                try {
                  process.kill(-process.pid, "SIGWINCH");
                } catch {}
              }
            }
            return;
          }
        case "kill":
          {
            let N = U.sig === "SIGKILL" ? "SIGKILL" : "SIGTERM";
            try {
              g = applyKillCtrl(N, A, x) || g;
            } catch {}
            if (N === "SIGTERM") {
              setTimeout(() => {
                if (!h) {
                  try {
                    A.kill("SIGKILL");
                  } catch {}
                }
              }, 5000).unref();
            }
            return;
          }
        default:
          return;
      }
    }
    await Vmr.unlink(n).catch(() => {});
    let O = S_c.createServer(U => {
      U.on("error", () => U.destroy());
      U.once("close", () => d.delete(U));
      k(U, YO({
        t: "hello",
        replPid: A.pid,
        version: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION
      }));
      for (let W of u.chunks) {
        k(U, _Qt(W));
      }
      if (k(U, YO({
        t: "live"
      })), d.add(U), b = 0, p.set(U, {
        armed: false,
        missed: 0
      }), k(U, YO({
        t: "ping"
      })), h) {
        k(U, YO({
          t: "exit",
          code: P,
          signal: H
        }));
        U.end();
        return;
      }
      let N = _sr(W => {
        if (W.kind === 0) {
          if (l && !m.vZc(U)) {
            if (!f.vZc(U)) {
              f.add(U);
              k(U, YO({
                t: "auth-required"
              }));
            }
            return;
          }
          if (!h && !g) {
            if (x.write(W.payload), a && Wt() !== "windows") {
              let j = W.payload.includes(3) ? "SIGINT" : W.payload.includes(28) ? "SIGQUIT" : null;
              if (j) {
                S = j;
                try {
                  process.kill(-process.pid, j);
                } catch {}
                setImmediate(() => {
                  S = null;
                });
              }
            }
          }
        } else if (W.kind === 1) {
          if (W.ctrl.t === "pong") {
            let j = p.get(U);
            if (j) {
              j.armed = true;
              j.missed = 0;
            }
          } else if (W.ctrl.t === "auth") {
            if (Vse(W.ctrl.token, l)) {
              m.add(U);
            }
          } else {
            I(W.ctrl);
          }
        }
      }, () => U.destroy());
      U.on("data", N);
    });
    O.on("error", U => {
      try {
        A.kill("SIGTERM");
      } catch {}
      $nn(n, `server error: ${String(U)}`);
    });
    O.listen(n);
    O.unref();
    let M;
    let L;
    if (Wt() !== "windows") {
      let U = Number(process.env.CLAUDE_PTY_HEARTBEAT_MS) || 60000;
      let N = 3;
      L = setInterval(() => {
        if (h) {
          return;
        }
        for (let z of d) {
          let V = p.get(z);
          if (!V?.armed) {
            continue;
          }
          if (V.missed++, V.missed >= 3) {
            z.destroy();
            d.delete(z);
          } else {
            k(z, YO({
              t: "ping"
            }));
          }
        }
      }, U);
      L.unref();
      let W = Number(process.env.CLAUDE_PTY_ORPHAN_CHECK_MS) || 2000;
      let j = 30;
      M = setInterval(() => {
        if (h) {
          return;
        }
        if (process.ppid === _ || d.size > 0) {
          b = 0;
          return;
        }
        if (++b < j) {
          return;
        }
        clearInterval(M);
        clearInterval(L);
        H7o(n, `orphan watchdog: ppid ${_}\u2192${process.ppid}, no client for ${j * W}ms`);
        setBgExitCause("ptyhost_orphan_watchdog");
        try {
          A.kill("SIGTERM");
        } catch {}
        setTimeout(() => {
          if (!h) {
            try {
              A.kill("SIGKILL");
            } catch {}
          }
        }, 5000).unref();
      }, W);
      M.unref();
    }
    for (let U of ["SIGTERM", "SIGINT", "SIGHUP"]) {
      process.on(U, () => {
        if (S === U) {
          return;
        }
        try {
          A.kill(U === "SIGHUP" ? "SIGTERM" : U);
        } catch {}
      });
    }
    if (a && Wt() !== "windows") {
      process.on("SIGQUIT", () => {
        if (S === "SIGQUIT") {
          return;
        }
        try {
          A.kill("SIGQUIT");
        } catch {}
      });
    }
    let P = 0;
    P = await A.exited;
    let F = 0;
    for (let U = 0; U < 20; U++) {
      if (y = false, await sleep(5), y) {
        F = 0;
      } else if (++F >= 2) {
        break;
      }
    }
    let H = A.signalCode ?? undefined;
    if (h = true, a) {
      try {
        let U = VZ(n);
        let N = Buffer.concat(u.chunks).subarray(-4096);
        let W = 0;
        while (W < 3 && W < N.length && (N[W] & 192) === 128) {
          W++;
        }
        let j = N.subarray(W).toString("utf8");
        vj(U, JSON.stringify({
          code: P,
          signal: H,
          tail: j
        }), 384);
      } catch {}
    }
    if (M) {
      clearInterval(M);
    }
    if (L) {
      clearInterval(L);
    }
    if (!g) {
      x.close();
    }
    if (E?.close(), a && Wt() !== "windows") {
      S = "SIGHUP";
      try {
        process.kill(-process.pid, "SIGHUP");
      } catch {}
    }
    if (C(YO({
      t: "exit",
      code: P,
      signal: H
    })), d.size === 0) {
      if (a) {
        try {
          RBe.writeFileSync(JM(n), Buffer.concat(u.chunks));
        } catch {}
      }
      await Promise.race([new Promise(U => O.once("connection", () => U())), sleep(5000)]);
    }
    for (let U of d) {
      U.end();
    }
    if (await Promise.race([new Promise(U => O.close(() => U())), sleep(2000, undefined, {
      unref: true
    })]), Wt() !== "windows") {
      await Vmr.unlink(n).catch(() => {});
    }
    process.exit(P);
  }
  function applyKillCtrl(e, t, n) {
    if (e === "SIGTERM" && Wt() === "windows") {
      n.close();
      return true;
    }
    t.kill(e);
    return false;
  }
  function createRing(e) {
    let t = [];
    let n = 0;
    let r = 0;
    function o() {
      if (n > 0) {
        t = t.slice(n);
        n = 0;
      }
    }
    return {
      get chunks() {
        o();
        return t;
      },
      push(s) {
        t.push(s);
        r += s.length;
        while (r > e && t.length - n > 1) {
          r -= t[n++].length;
          for (let i = 0; i < 3;) {
            let a = t[n];
            let l = 0;
            while (i + l < 3 && l < a.length && (a[l] & 192) === 128) {
              l++;
            }
            if (l > 0) {
              t[n] = a.subarray(l);
              r -= l;
              i += l;
            }
            if (t[n].length > 0 || t.length - n === 1) {
              break;
            }
            n++;
          }
        }
        if (n >= t.length - n) {
          o();
        }
      }
    };
  }
  function g_f(e, t, n) {
    if (!e) {
      return;
    }
    let r = process.hrtime.bigint();
    let o;
    try {
      o = RBe.createWriteStream(e, {
        flags: "w"
      });
    } catch {
      return;
    }
    o.on("error", () => {
      o?.destroy();
      o = undefined;
    });
    let s = Buffer.allocUnsafe(8);
    s.writeUInt32BE(t, 0);
    s.writeUInt32BE(n, 4);
    o.write(s);
    return {
      write(i) {
        if (!o) {
          return;
        }
        let a = Buffer.allocUnsafe(8 + i.length);
        let l = Number((process.hrtime.bigint() - r) / 1000n);
        a.writeUInt32BE(l >>> 0, 0);
        a.writeUInt32BE(i.length, 4);
        i.copy(a, 8);
        o.write(a);
      },
      close() {
        o?.end();
      }
    };
  }
  function H7o(e, t) {
    try {
      let n = ZO(e);
      RBe.mkdirSync(T_c.dirname(n), {
        recursive: true
      });
      RBe.appendFileSync(n, `${new Date().toISOString()} ${t}
`);
    } catch {}
  }
  function $nn(e, t) {
    if (e) {
      H7o(e, t);
    }
    process.exit(1);
  }
  var RBe;
  var Vmr;
  var S_c;
  var zmr;
  var T_c;
  var C_c = __lazy(() => {
    BT();
    Cs();
    b_c();
    uP();
    X7e();
    BEt();
    M7();
    RBe = require("fs");
    Vmr = require("fs/promises");
    S_c = require("net");
    zmr = require("os");
    T_c = require("path");
  });
  function Kmr(e, t, n) {
    return new Promise((r, o) => {
      let s = a => {
        i.close();
        o(a);
      };
      let i = R_c.createServer(a => {
        let l = "";
        a.setEncoding("utf8");
        a.on("data", c => {
          if (l += c, n && l.length > 8388608) {
            a.destroy();
            return;
          }
          let u = l.indexOf(`
`);
          if (u < 0) {
            return;
          }
          if (n) {
            let d;
            try {
              d = qt(l.slice(0, u));
            } catch {
              d = undefined;
            }
            if (!d || !Vse(d.auth, n)) {
              a.destroy();
              return;
            }
            i.close();
            r(d);
            return;
          }
          i.close();
          try {
            r(qt(l.slice(0, u)));
          } catch (d) {
            o(d);
          }
        });
        a.on("error", n ? () => a.destroy() : s);
      });
      if (i.on("error", s), t) {
        i.once("listening", () => {
          try {
            t();
          } catch (a) {
            s(a);
          }
        });
      }
      i.listen(e);
    });
  }
  async function Ymr(e, t) {
    let n = await YE(e.cwd);
    if (process.chdir(n), setOriginalCwd(n), setProjectRoot(n), setCwdState(n), o_(), getProjectPathForConfig.cache?.clear?.(), resetTrustDialogAcceptedCache(), e.sessionId) {
      switchSession(e.sessionId, "spare_claim");
    }
    if (resetStartTime(), ahl(), st(e.env.CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST)) {
      for (let o of Object.keys(process.env)) {
        if (Xgn(o) || o === "ANTHROPIC_CUSTOM_HEADERS" || Qgn(o)) {
          delete process.env[o];
        }
      }
    }
    Object.assign(process.env, e.env);
    process.argv = [process.argv[0], process.argv[1], ...e.argv];
    resetDebugCaches();
    resetFdCredentialState();
    resetEnvDerivedAuthCaches();
    mwn();
    q8e();
    clearProxyCache();
    configureGlobalAgents();
    let {
      main: r
    } = await t;
    await r();
  }
  var R_c;
  var j7o = __lazy(() => {
    at();
    BEt();
    m8t();
    Mot();
    D_();
    no();
    je();
    gn();
    lW();
    Fh();
    ZS();
    DA();
    R3();
    R_c = require("net");
  });
  function q7o(e) {
    let t = "";
    let n = "";
    let r = true;
    let o = 0;
    let s = "";
    let i = false;
    function a(c, u) {
      let d = mf(Lc(n), 800);
      let p = `${c}|${u}|${d}`;
      if (p === s) {
        return;
      }
      s = p;
      Zi(e).then(m => m && !i ? ip(e, {
        ...m,
        state: c,
        tempo: u,
        detail: d,
        updatedAt: new Date().toISOString()
      }) : undefined).catch(Oe);
    }
    let l = setInterval(() => {
      if (o > 0 && Date.now() - o < 2000) {
        a("working", "active");
      } else if (!r && n) {
        a("blocked", "blocked");
      } else {
        a("working", "idle");
      }
    }, 2000);
    l.unref();
    return {
      feed(c) {
        let u = Li(c.replace(y_f, "\x00")).replace(/\r\n?/g, `
`).replace(/\0+$/, "").replace(/\0/g, `
`);
        if (!u) {
          return;
        }
        o = Date.now();
        t += u;
        let d = t.split(`
`);
        if (t = d.pop() ?? "", r = t === "", n = t.trim() || d.findLast(m => m.trim())?.trim() || n, t.length > 800 * 2) {
          t = t.slice(-800);
        }
        if (s.startsWith("blocked|")) {
          a("working", "active");
        }
      },
      dispose() {
        i = true;
        clearInterval(l);
      },
      get lastLine() {
        return mf(Lc(n), 800);
      }
    };
  }
  var y_f;
  function Xmr(e, t, n, r, o, s) {
    let i = Si();
    let a = Si();
    let l;
    let c = new D_c.StringDecoder("utf8");
    let u;
    let d = false;
    let p = false;
    let m = 0;
    let f = 0;
    let h;
    let g;
    let y;
    let _;
    let b = 0;
    let S;
    let E = false;
    let C = false;
    let x = false;
    let A = "";
    let k = false;
    let I = n;
    if (I === undefined) {
      getProcessStartTimeAsync(t, {
        skipCache: true
      }).then(j => {
        I = j;
      });
    }
    let O = [];
    let M = 0;
    function L(j) {
      if (u) {
        if (u.destroyed) {
          return false;
        }
        if (!u.write(j)) {
          if (!y) {
            y = setTimeout(() => {
              y = undefined;
              u?.destroy();
            }, 1e4);
            y.unref();
          }
          if (!_ && u.writableLength > P_c) {
            _ = setTimeout(() => {
              if (_ = undefined, u && !u.destroyed && u.writableLength > P_c) {
                P();
                u.destroy();
              }
            }, 50);
            _.unref();
          }
        }
        return true;
      }
      if (M < 2 * 1048576) {
        O.push(j);
        M += j.length;
      }
      return false;
    }
    function P() {
      if (y) {
        clearTimeout(y);
        y = undefined;
      }
      if (_) {
        clearTimeout(_);
        _ = undefined;
      }
    }
    function F(j, z) {
      if (p) {
        return;
      }
      if (p = true, d = true, g) {
        clearTimeout(g);
        g = undefined;
      }
      P();
      u?.destroy();
      u = undefined;
      let V = c.end();
      if (V) {
        i.emit(V);
      }
      a.emit({
        exitCode: j,
        signal: z
      });
    }
    function H(j) {
      if (t0(ZO(e), 1048576).then(z => z ?? "").then(z => {
        let V = z.slice(0, 2000).trim();
        if (V.length > 0) {
          logForDebugging(`[bg-pty] host crash: ${V}`, {
            level: "warn"
          });
        }
        let K = [...V.matchAll(/\bE[A-Z]{2,14}\b/g)].find(J => !"/\\".includes(V[J.index - 1] ?? "."))?.[0];
        logEvent("tengu_bg_ptyhost_crash", {
          hadBreadcrumb: V.length > 0,
          hadHello: E,
          via: j,
          short: r,
          ...(K && {
            stderr_errno: K
          })
        });
      }), sigtermThenKill(b ? [-t, b] : [-t], j !== "hung" ? undefined : I), o) {
        o.exited.then(z => F(z, o.signalCode ?? undefined), () => F(-1));
        setTimeout(F, 1000, -1).unref();
        return;
      }
      F(-1);
    }
    function U(j) {
      if (j.kind === 0) {
        if (!C) {
          let z = c.write(j.payload);
          if (x) {
            i.emit(z);
          } else if (z.length > 0) {
            let V = (A + z).replaceAll("\x1B_cc-daemon-detach\x1B\\", "");
            let K = T_f(V);
            A = K > 0 ? V.slice(V.length - K) : "";
            let J = K > 0 ? V.slice(0, V.length - K) : V;
            if (J.length > 0) {
              i.emit(J);
            }
          }
        }
      } else if (j.ctrl.t === "hello") {
        if (E) {
          C = true;
          c.end();
          A = "";
        } else {
          jJe.unlink(JM(e)).catch(() => {});
        }
        E = true;
        b = j.ctrl.replPid;
        S = j.ctrl.version;
      } else if (j.ctrl.t === "live") {
        if (!x) {
          if (x = true, A.length > 0) {
            i.emit(A);
            A = "";
          }
        }
        if (C) {
          C = false;
          l?.();
        }
      } else if (j.ctrl.t === "exit") {
        F(j.ctrl.code, j.ctrl.signal);
      } else if (j.ctrl.t === "ping") {
        L(YO({
          t: "pong"
        }));
      } else if (j.ctrl.t === "auth-required") {
        logForDebugging(`[bg-pty] ${r ?? e}: host dropped input \u2014 DATA auth token missing or stale (version skew; respawn the worker to re-key)`, {
          level: "warn"
        });
      }
    }
    function N() {
      if (d) {
        return;
      }
      let j = new O_c.Socket();
      let z = false;
      j.on("error", V => {
        k = en(V) === "ENOENT";
        W();
      });
      j.once("close", () => {
        if (u === j) {
          u = undefined;
          P();
        }
        if (d) {
          return;
        }
        if (z && !p) {
          try {
            process.kill(t, 0);
            logForDebugging("[bg-pty] dropped by host; reconnecting", {
              level: "debug"
            });
            f = 4;
            m = 0;
            W();
            return;
          } catch {}
          H("close");
          return;
        }
        W();
      });
      j.once("connect", () => {
        z = true;
        m = 0;
        f = 0;
        u = j;
        j.on("drain", P);
        let V = ZO(e);
        let K = `${V}.read`;
        if (jJe.rename(V, K).then(() => t0(K, 1048576)).then(Q => {
          let Z = (Q ?? "").slice(0, 2000).trim();
          if (Z.length > 0) {
            logForDebugging(`[bg-pty] pre-connect stderr:
${Z}`, {
              level: "warn"
            });
          }
        }).catch(() => {}).finally(() => jJe.unlink(K).catch(() => {})), L(YO({
          t: "pong"
        })), s) {
          L(YO({
            t: "auth",
            token: s
          }));
        }
        for (let Q of O.splice(0)) {
          L(Q);
        }
        M = 0;
        let J = _sr(U, Q => {
          logForDebugging(`[bg-pty] frame error: ${Q}`, {
            level: "warn"
          });
          j.destroy();
        });
        j.on("data", J);
      });
      j.connect(e);
    }
    function W() {
      if (d || h) {
        return;
      }
      try {
        process.kill(t, 0);
      } catch {
        d = true;
        t0(JM(e), 8388608).then(z => z ?? "").then(z => {
          if (!E && z.length > 0) {
            i.emit(z.replaceAll("\x1B_cc-daemon-detach\x1B\\", ""));
          }
          jJe.unlink(JM(e)).catch(() => {});
          H("connect");
        });
        return;
      }
      if (f > 0 && --f === 0) {
        H("hung");
        return;
      }
      if (n !== undefined && k && m >= 3) {
        logForDebugging(`[bg-pty] ${e}: ENOENT on adopt \u2014 sock file externally deleted; respawning`, {
          level: "warn"
        });
        logEvent("tengu_bg_adopt_sock_unlinked", {});
        m = 30;
      }
      if (m >= 30) {
        logForDebugging(`[bg-pty] ${e}: ${m} connect attempts failed; treating host as dead`, {
          level: "warn"
        });
        let z = I && getProcessStartTime(t);
        if (!I || !z || I === z) {
          try {
            process.kill(-t, "SIGKILL");
          } catch {
            try {
              process.kill(t, "SIGKILL");
            } catch {}
          }
        }
        d = true;
        t0(JM(e), 8388608).then(V => V ?? "").then(V => {
          if (!E && V.length > 0) {
            i.emit(V.replaceAll("\x1B_cc-daemon-detach\x1B\\", ""));
          }
          if (jJe.unlink(JM(e)).catch(() => {}), o) {
            o.exited.then(K => F(K, o.signalCode ?? undefined), () => F(-1));
            setTimeout(F, 1000, -1).unref();
          } else {
            F(-1);
          }
        });
        return;
      }
      let j = A_c[Math.min(m, A_c.length - 1)];
      m++;
      h = setTimeout(() => {
        h = undefined;
        N();
      }, j);
      h.unref();
    }
    N();
    return {
      pid: t,
      replPid: () => b,
      replVersion: () => S,
      onResume: j => {
        l = j;
      },
      write: j => {
        if (p) {
          return;
        }
        let z = Buffer.from(j, "utf8");
        let V = 1048576 - 1;
        for (let K = 0; K < z.length; K += V) {
          L(_Qt(z.subarray(K, K + V)));
        }
      },
      resize: (j, z) => L(YO({
        t: "resize",
        cols: j,
        rows: z
      })),
      kill: j => {
        let z = j === "SIGKILL" ? "SIGKILL" : "SIGTERM";
        let V = L(YO({
          t: "kill",
          sig: z
        }));
        if (Wt() === "windows" && z === "SIGTERM" && V) {
          if (g) {
            clearTimeout(g);
          }
          g = setTimeout((K, J) => {
            if (!isSameProcess(K, I)) {
              J(-1);
              return;
            }
            try {
              process.kill(K, "SIGKILL");
            } catch {
              J(-1);
            }
          }, 5000, t, F);
          g.unref();
          return;
        }
        try {
          process.kill(-t, z);
        } catch {
          try {
            process.kill(t, z);
          } catch {
            F(-1);
          }
        }
        if (z === "SIGTERM" && !p) {
          if (g) {
            clearTimeout(g);
          }
          g = setTimeout((K, J) => {
            if (!isSameProcess(K, I)) {
              J(-1);
              return;
            }
            try {
              process.kill(-K, "SIGKILL");
            } catch {
              try {
                process.kill(K, "SIGKILL");
              } catch {
                J(-1);
              }
            }
          }, 5000, t, F);
          g.unref();
        }
      },
      dispose: () => {
        if (d = true, h) {
          clearTimeout(h);
          h = undefined;
        }
        if (g) {
          clearTimeout(g);
          g = undefined;
        }
        P();
        u?.destroy();
        u = undefined;
      },
      onData: j => ({
        dispose: i.subscribe(j)
      }),
      onExit: j => ({
        dispose: a.subscribe(j)
      })
    };
  }
  function T_f(e) {
    let t = Math.min(("\x1B_cc-daemon-detach\x1B\\").length - 1, e.length);
    for (let n = t; n > 0; n--) {
      if (e.endsWith(("\x1B_cc-daemon-detach\x1B\\").slice(0, n))) {
        return n;
      }
    }
    return 0;
  }
  var jJe;
  var O_c;
  var D_c;
  var A_c;
  var P_c;
  var M_c = __lazy(() => {
    Ot();
    je();
    dt();
    n1();
    Tb();
    Cs();
    ph();
    uP();
    pL();
    X7e();
    jJe = require("fs/promises");
    O_c = require("net");
    D_c = require("string_decoder");
    A_c = [50, 100, 250, 500, 1000, 2000];
    P_c = 8 * 1048576;
  });
  function U_c(e, t, n, r, o) {
    let s;
    let i = false;
    let a = 0;
    let l = false;
    let c;
    function u() {
      if (i) {
        return;
      }
      let p = new F_c.Socket();
      let m = false;
      p.on("error", () => d());
      p.once("close", () => {
        if (s === p) {
          s = undefined;
        }
        if (i) {
          return;
        }
        if (m) {
          n();
        }
        d();
      });
      p.once("connect", () => {
        m = true;
        a = 0;
        l = false;
        s = p;
        p.write(De({
          proto: 1,
          role: "supervisor",
          supervisorPid: process.pid,
          auth: o
        }) + `
`);
        r?.();
        Fir(p, f => {
          let h;
          try {
            h = qt(f);
          } catch {
            return;
          }
          if (h && typeof h === "object" && "type" in h) {
            t(h);
          }
        });
      });
      p.connect(e);
    }
    function d() {
      if (i || c || l) {
        return;
      }
      if (a >= 30) {
        l = true;
        logForDebugging(`[bg-rv] ${e}: ${a} connect attempts failed \u2014 giving up (pid-poll is liveness backstop)`, {
          level: "warn"
        });
        logEvent("tengu_bg_rv_connect_exhausted", {
          attempts: a
        });
        return;
      }
      let p = N_c[Math.min(a, N_c.length - 1)];
      a++;
      c = setTimeout(() => {
        c = undefined;
        u();
      }, p);
      c.unref();
    }
    u();
    return {
      send(p) {
        if (!s || s.destroyed) {
          if (a >= 30) {
            a = 0;
            l = false;
            d();
          }
          return false;
        }
        try {
          s.write(De(p) + `
`);
          return true;
        } catch (m) {
          logForDebugging(`[bg-rv] send failed: ${String(m)}`);
          return false;
        }
      },
      close() {
        if (i = true, c) {
          clearTimeout(c);
        }
        s?.destroy();
        s = undefined;
      }
    };
  }
  var F_c;
  var N_c;
  var B_c = __lazy(() => {
    Ot();
    je();
    Uqo();
    pL();
    F_c = require("net");
    N_c = [100, 250, 500, 1000, 2000];
  });
  function V7o() {
    return (e, t, n) => {
      let {
        cmd: r,
        prefixArgs: o
      } = eH({
        pinToCurrentBinary: true
      });
      let s;
      try {
        s = CRt.openSync(ZO(n.ptySock), "w");
      } catch {}
      try {
        let i = Bun.spawn([r, ...o, "--bg-pty-host", n.ptySock, String(n.cols), String(n.rows), "--", e, ...t], {
          cwd: n.cwd,
          env: n.env,
          stdio: ["ignore", "ignore", s ?? "ignore"],
          detached: true,
          windowsHide: true
        });
        i.unref();
        return Xmr(n.ptySock, i.pid, undefined, n.short, i, n.ptyAuth);
      } finally {
        if (s !== undefined) {
          CRt.closeSync(s);
        }
      }
    };
  }
  function z_c(e, t, n, r, o, s) {
    if (e.launch.mode === "exec") {
      return e.launch.args.map(lC);
    }
    if (t > 1 && n) {
      return aV(["--resume", o ?? r, ...cJe(s)]);
    }
    if (t > 1 && r !== e.sessionId) {
      return aV(["--session-id", r, ...cJe(s)]);
    }
    if (e.launch.mode === "resume") {
      return aV([...(e.launch.fork ? ["--session-id", e.sessionId, "--fork-session"] : []), "--resume", e.launch.transcriptPath ?? e.launch.sessionId, ...cJe(e.launch.flagArgs)]);
    }
    return aV(cJe(e.launch.args));
  }
  function K_c(e, t, n, r, o) {
    let s = {
      ...process.env
    };
    let i = {
      ...s,
      ...(n && {
        CLAUDE_BG_AUTH_SNAPSHOT_PATH: n
      }),
      ...(Wt() === "windows" && {
        CLAUDE_CODE_ALT_SCREEN_FULL_REPAINT: "1"
      }),
      ...e.env,
      CLAUDE_CODE_SESSION_KIND: "bg",
      CLAUDE_BG_BACKEND: "daemon",
      CLAUDE_BG_SOURCE: e.source,
      CLAUDE_JOB_DIR: t,
      CLAUDE_CODE_SESSION_NAME: e.seed?.name || e.seed?.intent || e.short,
      CLAUDE_BG_RENDEZVOUS_SOCK: r,
      FORCE_COLOR: "3",
      COLORTERM: "truecolor",
      BROWSER: "true"
    };
    if (process.env.CLAUDE_CONFIG_DIR) {
      i.CLAUDE_CONFIG_DIR = process.env.CLAUDE_CONFIG_DIR;
    }
    if (e.isolation === "worktree") {
      i.CLAUDE_BG_ISOLATION = "worktree";
    }
    for (let a of Hnn) {
      if (!e.env?.[a]) {
        delete i[a];
      }
    }
    for (let a of Y7o) {
      if (!e.env?.[a]) {
        delete i[a];
      }
    }
    for (let a of Object.keys(i)) {
      if (SMt.some(l => a.startsWith(l)) && !e.env?.[a]) {
        delete i[a];
      }
    }
    if (eyn(s) || She(e)) {
      for (let c of uY) {
        delete i[c];
      }
      let a = s.CLAUDE_CODE_HOST_AUTH_ENV_VAR;
      if (a) {
        delete i[a];
      }
      let l = e.env?.CLAUDE_CODE_HOST_CREDS_FILE ?? (She(e) ? s.CLAUDE_CODE_HOST_CREDS_FILE : undefined);
      if (l) {
        i.CLAUDE_CODE_HOST_CREDS_FILE = l;
      }
    } else if (s.ANTHROPIC_BASE_URL) {
      delete i.ANTHROPIC_AUTH_TOKEN;
    }
    if (o) {
      i.CLAUDE_BG_RV_AUTH = o.rvAuth;
      i.CLAUDE_BG_PTY_AUTH = o.ptyAuth;
    }
    if (n) {
      delete i.CLAUDE_CODE_OAUTH_TOKEN;
    }
    if (e.launch.mode === "exec") {
      for (let a of Object.keys(i)) {
        if (a.startsWith("CLAUDE_") && a !== "CLAUDE_JOB_DIR" && a !== "CLAUDE_CONFIG_DIR" && a !== "CLAUDE_BG_PTY_AUTH" || a.startsWith("OTEL_")) {
          delete i[a];
        }
      }
      delete i.BROWSER;
      i.CLAUDE_PTY_HOST_EXEC = "1";
    }
    return i;
  }
  async function z7o(e, t) {
    if (!t || Wt() !== "macos") {
      return;
    }
    let n = eZt(e);
    try {
      await See.mkdir(ZQt(), {
        recursive: true,
        mode: 448
      });
      await See.writeFile(n, JSON.stringify(t), {
        mode: 384
      });
      return n;
    } catch (r) {
      logForDebugging(`writeAuthSnapshot failed: ${he(r)}`, {
        level: "warn"
      });
      return;
    }
  }
  async function K7o(e, t) {
    if (Wt() === "windows") {
      return;
    }
    let n = nZt(e);
    try {
      await See.mkdir(ZQt(), {
        recursive: true,
        mode: 448
      });
      await See.writeFile(n, JSON.stringify(t), {
        mode: 384
      });
      return n;
    } catch (r) {
      logForDebugging(`writeSocketTokensFile failed: ${he(r)}`, {
        level: "warn"
      });
      return;
    }
  }
  function Y_c(e) {
    return e.kind === "retiring" ? `retiring:${e.reason}` : e.kind === "retired" ? `retired:${e.outcome}` : e.kind;
  }
  function A_f(e, t) {
    if (e.kind === "retired") {
      return false;
    }
    switch (t.kind) {
      case "spawning":
        return e.kind === "upgrading" || e.kind === "running";
      case "running":
        return e.kind === "spawning";
      case "upgrading":
        return e.kind === "running";
      case "retiring":
        return true;
      case "retired":
        return true;
    }
  }
  class PK {
    dispatch;
    spawnPty;
    getAuthSnapshot;
    via;
    record;
    onStream = Si();
    onState = Si();
    onSettle = Si();
    onRepaintDone = Si();
    attachers = new Map();
    lastInputAttacher;
    pty;
    procStart;
    ptyCols = 200;
    ptyRows = 50;
    decModes = Men();
    execTracker;
    execLastLine;
    offData;
    offExit;
    ring = [];
    ringBytes = 0;
    ringSpawnMark = 0;
    attempt = 0;
    lastSpawnAt = 0;
    fastCrashStreak = 0;
    lastExitCause;
    hostWokeAt;
    backoffTimer = null;
    pidPoll = null;
    rv;
    rvSockPath;
    ptySockPath;
    rvAuth = W7o.randomBytes(16).toString("hex");
    ptyAuth = W7o.randomBytes(16).toString("hex");
    unverifiedSock;
    phase = {
      kind: "spawning"
    };
    workerReady = false;
    resizeDeferred = false;
    lastInputAt;
    deleteJobDirOnSettle = false;
    get shouldDeleteJobDir() {
      return this.deleteJobDirOnSettle;
    }
    adoptedAt;
    lastRvHeartbeat;
    stalledLogged = false;
    lastCheckPidAt = Date.now();
    replyChain = Promise.resolve();
    killOutcome = "killed";
    handoffKill = false;
    get isKilling() {
      return this.phase.kind === "retiring" && this.phase.reason === "reap";
    }
    get isHandoffKill() {
      return this.handoffKill;
    }
    get isRetiring() {
      return this.phase.kind === "retiring" && this.phase.reason === "grace";
    }
    get isBooting() {
      return !this.record.outcome && (this.phase.kind === "upgrading" || !this.workerReady);
    }
    get isUnverified() {
      return this.unverifiedSock !== undefined;
    }
    getPhase() {
      return this.phase;
    }
    get isTransitioning() {
      return this.phase.kind !== "running" || !this.pty || this.record.pid === 0;
    }
    get isDetached() {
      return this.phase.kind === "retiring" && this.phase.reason === "stop";
    }
    transitionTo(e) {
      if (!A_f(this.phase, e)) {
        logForDebugging(`[bg] illegal worker-phase transition ${Y_c(this.phase)} \u2192 ${Y_c(e)} for ${this.record.short}`, {
          level: "warn"
        });
        logEvent("tengu_bg_phase_illegal", {});
        return false;
      }
      this.phase = e;
      return true;
    }
    shutdownWorker() {
      let e = this.rv?.send({
        type: "shutdown"
      }) ?? false;
      if (!e) {
        this.sigtermWorker();
      } else {
        setTimeout(t => {
          let n = t.phase;
          if ((n.kind === "upgrading" || n.kind === "retiring" && n.reason === "grace") && !t.record.outcome) {
            t.sigtermWorker();
          }
        }, 5000, this).unref();
      }
      return e;
    }
    async respawnIfIdleStale(e, t = "sweep") {
      if (this.dispatch.launch.mode === "exec") {
        return {
          respawned: false,
          reason: "not-stale"
        };
      }
      if (this.isTransitioning) {
        return {
          respawned: false,
          reason: "in-progress"
        };
      }
      if (this.record.outcome) {
        return {
          respawned: false,
          reason: "no-state"
        };
      }
      if (this.attachers.size > 0) {
        return {
          respawned: false,
          reason: "attached"
        };
      }
      if (!this.record.cliVersion || this.record.cliVersion === {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION) {
        return {
          respawned: false,
          reason: "not-stale"
        };
      }
      if (t !== "attach" && this.lastInputAt && Date.now() - this.lastInputAt < 3600000) {
        return {
          respawned: false,
          reason: "busy"
        };
      }
      let n = Date.now();
      let r = await Zi(dc(this.dispatch.short));
      if (this.isTransitioning) {
        return {
          respawned: false,
          reason: "in-progress"
        };
      }
      if (this.record.outcome) {
        return {
          respawned: false,
          reason: "no-state"
        };
      }
      if (this.attachers.size > 0) {
        return {
          respawned: false,
          reason: "attached"
        };
      }
      if (this.lastInputAt && this.lastInputAt >= n) {
        return {
          respawned: false,
          reason: "busy"
        };
      }
      if (!r) {
        return {
          respawned: false,
          reason: "no-state"
        };
      }
      if (Xg(r) && t === "sweep" && !e?.vZc(this.dispatch.short)) {
        return {
          respawned: false,
          reason: "settled"
        };
      }
      if (!Xg(r) && r.tempo !== "idle") {
        return {
          respawned: false,
          reason: "busy"
        };
      }
      let o = r.inFlight?.kinds ?? [];
      let s = Xg(r) && o.length > 0 && o.every(i => G_c.includes(i));
      if ((r.inFlight?.queued ?? 0) > 0 || (r.inFlight?.tasks ?? 0) > 0 && !s || o.includes("session_cron")) {
        return {
          respawned: false,
          reason: "inflight"
        };
      }
      if (!this.transitionTo({
        kind: "upgrading"
      })) {
        return {
          respawned: false,
          reason: "in-progress"
        };
      }
      this.onState.emit({
        pid: this.record.pid
      });
      logEvent("tengu_bg_respawn_stale", {
        short: this.dispatch.short,
        rvSent: this.shutdownWorker(),
        trigger: t
      });
      return {
        respawned: true
      };
    }
    async retireIfSettled(e, t, n = e) {
      if (this.isTransitioning) {
        return {
          retired: false,
          reason: "in-progress"
        };
      }
      if (this.record.outcome) {
        return {
          retired: false,
          reason: "no-state"
        };
      }
      if (this.attachers.size > 0) {
        return {
          retired: false,
          reason: "attached"
        };
      }
      if (She(this.dispatch)) {
        return {
          retired: false,
          reason: "host-managed"
        };
      }
      if (t?.vZc(this.dispatch.short)) {
        return {
          retired: false,
          reason: "pinned"
        };
      }
      if (this.adoptedAt && Date.now() - this.adoptedAt < 120000) {
        return {
          retired: false,
          reason: "recent-adopt"
        };
      }
      if (this.lastInputAt && Date.now() - this.lastInputAt < e) {
        return {
          retired: false,
          reason: "recent-input"
        };
      }
      let r = await Zi(dc(this.dispatch.short));
      if (this.isTransitioning || this.attachers.size > 0) {
        return {
          retired: false,
          reason: "in-progress"
        };
      }
      if (this.lastInputAt && Date.now() - this.lastInputAt < e) {
        return {
          retired: false,
          reason: "recent-input"
        };
      }
      if (!r) {
        if (this.dispatch.source === "spare" && Date.now() - this.dispatch.createdAt > e) {
          if (!this.transitionTo({
            kind: "retiring",
            reason: "grace"
          })) {
            return {
              retired: false,
              reason: "in-progress"
            };
          }
          logEvent("tengu_bg_retired", {
            short: this.dispatch.short,
            rvSent: this.shutdownWorker(),
            settledForMs: Date.now() - this.dispatch.createdAt,
            state: "stale-spare"
          });
          return {
            retired: true
          };
        }
        return {
          retired: false,
          reason: "no-state"
        };
      }
      if (this.dispatch.source !== "shell" && !r.name && !r.intent && !r.worktreePath && r.template === "bg" && r.state === "working" && r.tempo === "blocked") {
        let c = Date.now() - Date.parse(r.createdAt);
        if (c < 300000) {
          return {
            retired: false,
            reason: "empty-idle-grace"
          };
        }
        if (!this.transitionTo({
          kind: "retiring",
          reason: "grace"
        })) {
          return {
            retired: false,
            reason: "in-progress"
          };
        }
        this.deleteJobDirOnSettle = true;
        logEvent("tengu_bg_retired", {
          short: this.dispatch.short,
          rvSent: this.shutdownWorker(),
          settledForMs: c,
          state: "empty-idle"
        });
        return {
          retired: true
        };
      }
      if (!(Xg(r) || this.dispatch.launch.mode !== "exec" && (r.tempo === "idle" || r.state === "blocked" && r.tempo === "blocked"))) {
        return {
          retired: false,
          reason: "not-settled"
        };
      }
      let s = r.inFlight?.kinds ?? [];
      let i = Xg(r) && s.length > 0 && s.every(c => G_c.includes(c));
      if ((r.inFlight?.queued ?? 1) > 0 || (r.inFlight?.tasks ?? 1) > 0 && !i) {
        return {
          retired: false,
          reason: "inflight"
        };
      }
      if (s.includes("session_cron")) {
        return {
          retired: false,
          reason: "session-cron"
        };
      }
      if (r.routine) {
        return {
          retired: false,
          reason: "routine"
        };
      }
      let a = r.bridgeSessionId ? Math.max(e, n) : e;
      let l = r.updatedAt && Date.now() - Date.parse(r.updatedAt);
      if (!l || l < a) {
        return {
          retired: false,
          reason: "grace"
        };
      }
      if (!this.transitionTo({
        kind: "retiring",
        reason: "grace"
      })) {
        return {
          retired: false,
          reason: "in-progress"
        };
      }
      logEvent("tengu_bg_retired", {
        short: this.dispatch.short,
        rvSent: this.shutdownWorker(),
        settledForMs: l,
        bridged: !!r.bridgeSessionId,
        detritusOnly: i,
        state: r.state
      });
      return {
        retired: true
      };
    }
    sigtermWorker() {
      try {
        this.pty?.kill("SIGTERM");
      } catch {}
    }
    constructor(e, t, n, r, o) {
      this.dispatch = e;
      this.spawnPty = t;
      this.getAuthSnapshot = n;
      this.via = r;
      if (this.record = {
        short: e.short,
        nonce: e.nonce,
        sessionId: e.sessionId,
        pid: 0,
        attempt: 0,
        startedAt: Date.now(),
        createdAt: e.createdAt,
        cwd: e.cwd,
        backend: "daemon",
        tempo: "active",
        state: "starting",
        detail: "",
        intent: e.seed?.intent ?? "",
        name: e.seed?.name,
        agent: e.agent,
        routine: e.routine,
        worktreePath: e.worktree?.path,
        cliVersion: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION,
        source: e.source,
        ...o
      }, e.cols) {
        this.ptyCols = e.cols;
      }
      if (e.rows) {
        this.ptyRows = e.rows;
      }
    }
    static spawn(e, t, n, r) {
      let o = new PK(e, t ?? V7o(), n, "cold");
      if (r?.afterUpgrade) {
        o.attempt = 1;
        o.buildBridgeReattachEnvFromState().then(s => o.doSpawn(s, true)).catch(Oe);
        return o;
      }
      o.doSpawn(e.reattachEnv).catch(Oe);
      return o;
    }
    static claim(e, t) {
      let n = new PK(e, t.spawnPty, t.getAuthSnapshot, "spare", {
        pid: t.pid,
        attempt: 1,
        state: "running",
        cliVersion: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION
      });
      if (n.attempt = 1, n.ptySockPath = t.ptySockPath, n.rvSockPath = Vvt(e.short), t.ptyAuth) {
        n.ptyAuth = t.ptyAuth;
      }
      n.wirePty(Xmr(t.ptySockPath, t.pid, undefined, e.short, undefined, n.ptyAuth));
      n.resize(e.cols ?? 200, e.rows ?? 50);
      n.connectRv();
      getProcessStartTimeAsync(t.pid, {
        skipCache: true
      }).then(r => {
        if (n.record.pid !== t.pid || n.isDetached || n.record.outcome) {
          return;
        }
        if (r) {
          n.procStart = r;
        }
        n.patch({
          pid: t.pid
        });
      });
      return n;
    }
    socketAuth() {
      return {
        rvAuth: this.rvAuth,
        ptyAuth: this.ptyAuth
      };
    }
    static buildClaimFrame(e, t, n) {
      let r = dc(e.short);
      let o = K_c(e, r, t, Vvt(e.short), n);
      if (delete o.CLAUDE_BG_PTY_AUTH, e.reattachEnv) {
        Object.assign(o, e.reattachEnv);
      }
      let s = z_c(e, 1, false, e.sessionId, undefined, e.respawnFlags);
      return {
        env: o,
        argv: s
      };
    }
    static async adopt(e, t, n, r) {
      try {
        process.kill(t.pid, 0);
      } catch (i) {
        let a = en(i);
        if (a === "ESRCH" || a === "EPERM") {
          return null;
        }
      }
      let o = await getProcessStartTimeAsync(t.pid);
      if (o && t.procStart !== o) {
        return null;
      }
      let s = new PK(t.dispatch, n, r, "adopted", {
        pid: t.pid,
        attempt: t.attempt,
        startedAt: t.startedAt,
        messagingSock: t.messagingSock,
        state: "adopted",
        detail: "adopted from previous supervisor",
        cliVersion: t.cliVersion,
        ...(t.ptySock ? {} : {
          legacy: true
        })
      });
      if (s.attempt = t.attempt, s.procStart = t.procStart, s.workerReady = true, s.adoptedAt = Date.now(), s.rvSockPath = t.rendezvousSock, s.ptySockPath = t.ptySock, t.rvAuth) {
        s.rvAuth = t.rvAuth;
      }
      if (t.ptyAuth) {
        s.ptyAuth = t.ptyAuth;
      }
      if (s.dispatch.launch.mode === "exec") {
        s.execTracker = q7o(dc(s.dispatch.short));
        s.workerReady = true;
      }
      if (t.ptySock) {
        s.wirePty(Xmr(t.ptySock, t.pid, s.procStart, s.dispatch.short, undefined, s.ptyAuth));
        s.ptyCols = 0;
        s.seedFocus(false);
      }
      if (t.decModes) {
        s.decModes.seed(t.decModes);
      }
      if (s.connectRv(), t.pendingRespawn === "upgrade") {
        s.transitionTo({
          kind: "upgrading"
        });
        setTimeout(i => {
          if (i.phase.kind === "upgrading" && !i.record.outcome) {
            i.sigtermWorker();
          }
        }, 5000, s).unref();
      }
      return s;
    }
    static unverified(e, t) {
      let n = new PK(t.dispatch, undefined, undefined, "adopted", {
        pid: t.pid,
        attempt: t.attempt,
        startedAt: t.startedAt,
        messagingSock: t.messagingSock,
        state: "adopted",
        detail: "adopted (pid unverifiable; tracking via pty.sock)",
        cliVersion: t.cliVersion
      });
      if (n.attempt = t.attempt, n.procStart = t.procStart, n.rvSockPath = t.rendezvousSock, n.ptySockPath = t.ptySock, t.rvAuth) {
        n.rvAuth = t.rvAuth;
      }
      if (t.ptyAuth) {
        n.ptyAuth = t.ptyAuth;
      }
      n.unverifiedSock = t.ptySock;
      n.lastInputAt = Date.now();
      n.pidPoll = setInterval(r => {
        if (r.record.outcome || !r.unverifiedSock) {
          return;
        }
        Pur(r.unverifiedSock).then(o => {
          if (o || r.record.outcome || r.phase.kind !== "spawning") {
            return;
          }
          r.settle("crashed");
        });
      }, 5000, n);
      n.pidPoll.unref();
      logEvent("tengu_bg_adopt_unverified", {
        short: e
      });
      return n;
    }
    tail(e) {
      return e > 0 ? this.ring.slice(-e) : [];
    }
    ringSnapshot() {
      return this.ring;
    }
    preInitErrorTail() {
      let e = Li(this.ring.slice(this.ringSpawnMark).join("")).replace(/\s+/g, " ").trim();
      if (!e) {
        return;
      }
      return e.length > 200 ? `\u2026${e.slice(-200)}` : e;
    }
    decModeSnapshot() {
      return this.decModes.snapshot();
    }
    write(e) {
      this.lastInputAt = Date.now();
      this.pty?.write(e);
    }
    noteActivity() {
      this.lastInputAt = Date.now();
    }
    shiftGraceClocksForward(e) {
      if (e <= 0) {
        return;
      }
      if (this.hostWokeAt = Date.now(), this.adoptedAt !== undefined) {
        this.adoptedAt += e;
      }
      if (this.lastInputAt !== undefined) {
        this.lastInputAt += e;
      }
    }
    seedFocus(e) {
      if (this.dispatch.launch.mode === "exec") {
        return;
      }
      this.pty?.write(e ? wWe : ZIe);
    }
    resize(e, t) {
      if (this.ptyCols = e, this.ptyRows = t, Wt() === "windows" && !this.workerReady) {
        this.resizeDeferred = true;
        return;
      }
      try {
        this.pty?.resize(e, t);
      } catch {}
    }
    signalPtyPgrp() {
      if (Wt() === "windows" || !this.record.pid) {
        return;
      }
      setTimeout(e => {
        try {
          process.kill(-e, "SIGWINCH");
        } catch {}
      }, 15, this.record.pid);
    }
    resizeForRepaint(e, t) {
      if (e !== this.ptyCols || t !== this.ptyRows) {
        this.resize(e, t);
        this.signalPtyPgrp();
        this.rv?.send({
          type: "repaint"
        });
        return () => {};
      }
      let n = this.rv?.send({
        type: "repaint"
      }) === true;
      let r = () => {};
      let o = setTimeout((s, i) => {
        if (r(), this.ptyCols !== s || this.ptyRows !== i) {
          return;
        }
        let a = Math.max(2, s - 1);
        this.resize(a, i);
        this.signalPtyPgrp();
        setTimeout((l, c, u) => {
          if (this.ptyCols === u && this.ptyRows === c) {
            this.resize(l, c);
            this.signalPtyPgrp();
          }
        }, 30, s, i, a);
      }, n ? 50 : 0, e, t);
      if (n) {
        r = this.onRepaintDone.subscribe(() => {
          r();
          clearTimeout(o);
        });
      }
      return () => {
        r();
        clearTimeout(o);
      };
    }
    rosterEntry() {
      return {
        pid: this.record.pid,
        procStart: this.procStart,
        sessionId: this.record.sessionId,
        rendezvousSock: this.rvSockPath ?? Vvt(this.dispatch.short),
        ptySock: this.record.legacy ? undefined : this.ptySockPath ?? cP(this.dispatch.short),
        messagingSock: this.record.messagingSock,
        cliVersion: this.record.cliVersion,
        startedAt: this.record.startedAt,
        attempt: this.attempt,
        cwd: this.dispatch.cwd,
        worktreePath: this.dispatch.worktree?.path,
        dispatch: this.cappedDispatch(),
        pendingRespawn: this.phase.kind === "upgrading" ? "upgrade" : undefined,
        decModes: this.decModes.snapshot(),
        rvAuth: this.rvAuth,
        ptyAuth: this.ptyAuth
      };
    }
    cappedDispatch() {
      return JSON.parse(JSON.stringify(this.dispatch, (e, t) => {
        if (e === "reattachEnv" || e === "attachStallRespawns" || e === "CLAUDE_CODE_HOST_CREDS_FILE") {
          return;
        }
        if (typeof t === "string" && t.length > 4096) {
          return t.slice(0, 4096);
        }
        return t;
      }));
    }
    async reply(e) {
      this.lastInputAt = Date.now();
      this.lastInputAttacher = undefined;
      let t = await Zi(dc(this.dispatch.short));
      if ((!t || (t.tempo ?? this.record.tempo) === "blocked") && this.rv?.send({
        type: "reply",
        text: e
      })) {
        return true;
      }
      if (this.pty) {
        let n = this.dispatch.launch.mode !== "exec";
        this.replyChain = this.replyChain.then(() => new Promise(r => {
          this.pty?.write(n ? `\x1B[200~${e}\x1B[201~` : e);
          setTimeout(o => {
            this.pty?.write("\r");
            o();
          }, 10, r);
        }));
        return true;
      }
      return this.rv?.send({
        type: "reply",
        text: e
      }) ?? false;
    }
    sendAttacherCaps(e) {
      return this.rv?.send({
        type: "attacher-caps",
        caps: e
      }) ?? false;
    }
    kill(e = "SIGTERM", t = "killed", n) {
      if (this.phase.kind === "retired") {
        return;
      }
      if (this.killOutcome = t === "failed" ? "failed" : "killed", this.handoffKill = this.handoffKill || t === "handoff", n) {
        this.patch({
          detail: n
        });
      }
      if (this.transitionTo({
        kind: "retiring",
        reason: "reap"
      }), this.backoffTimer) {
        clearTimeout(this.backoffTimer);
        this.backoffTimer = null;
      }
      if (this.unverifiedSock) {
        uJe(this.unverifiedSock).finally(() => this.settle(this.killOutcome));
        return;
      }
      if (this.pty) {
        try {
          this.pty.kill(e);
        } catch {}
      } else if (this.record.pid && !this.pidRecycled()) {
        try {
          process.kill(-this.record.pid, e);
        } catch {
          try {
            process.kill(this.record.pid, e);
          } catch {}
        }
      }
      if (!this.pty) {
        this.settle(this.killOutcome);
      }
    }
    stop() {
      if (this.phase.kind === "retiring" && this.phase.reason === "reap") {
        this.settle(this.killOutcome);
      } else if (this.phase.kind === "retiring" && this.phase.reason === "grace") {
        this.settle("done");
      } else if (this.phase.kind !== "retired") {
        this.transitionTo({
          kind: "retiring",
          reason: "stop"
        });
      }
      if (this.backoffTimer) {
        clearTimeout(this.backoffTimer);
        this.backoffTimer = null;
      }
      this.clearLiveness();
      this.offData?.dispose();
      this.offExit?.dispose();
      this.execTracker?.dispose();
      this.execTracker = undefined;
      this.pty?.dispose();
      this.pty = undefined;
    }
    async doSpawn(e, t = false) {
      this.attempt++;
      this.workerReady = false;
      this.resizeDeferred = false;
      this.ringSpawnMark = this.ring.length;
      this.lastSpawnAt = Date.now();
      let n = this.dispatch;
      let r = dc(n.short);
      await See.mkdir(J_c.join(r, "tmp"), {
        recursive: true
      }).catch(() => {});
      let o = n.launch.mode === "exec" || She(n) ? undefined : await z7o(n.short, this.getAuthSnapshot?.());
      let s = await K7o(n.short, n.launch.mode === "exec" ? {
        ptyAuth: this.socketAuth().ptyAuth
      } : this.socketAuth());
      let i = n.launch.mode === "resume" ? n.launch.sessionId : undefined;
      let a = false;
      let l = false;
      let c = n.sessionId;
      let u;
      let d = n.respawnFlags;
      let p = n.cwd;
      if (this.attempt > 1) {
        let _ = await Zi(r);
        c = _?.resumeSessionId ?? n.sessionId;
        d = _?.respawnFlags ?? n.respawnFlags;
        p = _?.cwd ?? n.cwd;
        let b = await mle(c, p, _?.linkScanPath);
        if (a = b.hasMessages, a) {
          u = b.path;
        }
        if (l = !a && i !== undefined && !(await mle(i, p, undefined)).hasMessages, !a) {
          await ije(b.path);
        }
      }
      if (this.phase.kind === "retiring" || this.phase.kind === "retired" || this.record.outcome) {
        if (s) {
          See.unlink(s).catch(() => {});
        }
        return;
      }
      if (l) {
        this.patch({
          state: "crashed",
          detail: `source session ${i} not found`
        });
        return this.settle("crashed");
      }
      if (!this.spawnPty) {
        this.patch({
          state: "crashed",
          detail: "Bun.Terminal unavailable (running under Node?)"
        });
        logEvent("tengu_bg_pty_unavailable", {
          short: this.dispatch.short
        });
        return this.settle("crashed");
      }
      let m = z_c(n, this.attempt, a, c, u, d);
      let f = K_c(n, r, o, this.rvSockPath ?? Vvt(n.short), this.socketAuth());
      if (this.attempt > 1 && a && !t) {
        f.CLAUDE_CODE_RESUME_INTERRUPTED_TURN = "1";
      }
      if (this.attempt > 1 && !a && c !== n.sessionId) {
        f.CLAUDE_BG_POST_CLEAR_RESPAWN = "1";
      }
      if (e) {
        Object.assign(f, e);
      }
      if (s) {
        delete f.CLAUDE_BG_RV_AUTH;
        delete f.CLAUDE_BG_PTY_AUTH;
        f.CLAUDE_BG_SOCKET_TOKENS_PATH = s;
      }
      let h = this.ptyCols || (n.cols ?? 200);
      let g = this.ptyRows || (n.rows ?? 50);
      let y;
      try {
        let {
          cmd: _,
          prefixArgs: b
        } = n.launch.mode === "exec" ? {
          cmd: lC(n.launch.cmd),
          prefixArgs: []
        } : eH({
          pinToCurrentBinary: true
        });
        y = this.spawnPty(_, [...b, ...m], {
          cols: h,
          rows: g,
          cwd: p,
          env: f,
          ptySock: this.ptySockPath ?? cP(n.short),
          short: n.short,
          ptyAuth: this.ptyAuth
        });
      } catch (_) {
        if (fn(_)) {
          let b = await See.access(p).then(() => true, () => false);
          if (this.record.outcome) {
            return;
          }
          if (!b) {
            return this.settleCwdGone("cold", p);
          }
          let S = n.launch.mode === "exec" ? `${n.launch.cmd}: command not found` : "daemon binary was deleted (upgrade in progress) \u2014 run your command again to use the new version";
          logEvent("tengu_bg_spawn_binary_gone", {
            short: this.dispatch.short,
            attempt: this.attempt
          });
          this.patch({
            state: "crashed",
            detail: S
          });
          let E = `\r
\x1B[2m[${S}]\x1B[0m\r
`;
          this.pushRing(E);
          this.onStream.emit(E);
          return this.settle("crashed");
        }
        return this.scheduleRespawn(he(_));
      }
      if (n.launch.mode === "exec") {
        this.execTracker?.dispose();
        this.execTracker = q7o(r);
        this.workerReady = true;
      }
      if (Wt() === "windows") {
        See.writeFile(Bwe(n.short), String(y.pid)).catch(() => {});
      }
      this.wirePty(y);
      this.rv?.close();
      this.rv = undefined;
      this.lastRvHeartbeat = undefined;
      this.stalledLogged = false;
      this.connectRv();
      this.patch({
        pid: y.pid,
        attempt: this.attempt,
        state: this.attempt > 1 ? "resuming" : "running",
        detail: "",
        cliVersion: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION
      });
      logEvent("tengu_bg_worker_spawn", {
        short: this.dispatch.short,
        attempt: this.attempt,
        source: this.dispatch.source,
        launch_mode: this.dispatch.launch.mode
      });
      getProcessStartTimeAsync(y.pid, {
        skipCache: true
      }).then(_ => {
        if (!_ || this.record.pid !== y.pid || this.isDetached || this.record.outcome) {
          return;
        }
        this.procStart = _;
        this.patch({
          pid: y.pid
        });
      });
    }
    wirePty(e) {
      this.pty = e;
      this.transitionTo({
        kind: "running"
      });
      this.decModes = Men();
      e.onResume?.(() => {
        this.rv?.send({
          type: "repaint"
        });
      });
      this.offData = e.onData(n => {
        if (this.decModes.feed(n) && this.record.pid) {
          this.onState.emit({
            pid: this.record.pid
          });
        }
        this.execTracker?.feed(n);
        this.pushRing(n.includes("\x1B_cc-daemon-detach\x1B\\") ? n.replaceAll("\x1B_cc-daemon-detach\x1B\\", "") : n);
        this.onStream.emit(n);
      });
      let t = false;
      this.offExit = e.onExit(({
        exitCode: n,
        signal: r
      }) => {
        if (t) {
          return;
        }
        t = true;
        this.offData?.dispose();
        this.execLastLine = this.execTracker?.lastLine;
        this.execTracker?.dispose();
        this.execTracker = undefined;
        this.pty = undefined;
        this.onExit(n, r);
      });
    }
    pushRing(e) {
      if (this.ring.push(e), this.ringBytes += e.length, this.ringBytes > 262144 * 1.25 && this.ring.length > 1) {
        let t = 0;
        let n = 0;
        while (this.ringBytes - n > 262144 && t < this.ring.length - 1) {
          n += this.ring[t].length;
          t++;
        }
        this.ring.splice(0, t);
        this.ringBytes -= n;
        this.ringSpawnMark = Math.max(0, this.ringSpawnMark - t);
      }
    }
    patch(e) {
      Object.assign(this.record, e);
      this.onState.emit(e);
    }
    onExit(e, t) {
      if (this.isDetached) {
        return;
      }
      if (this.phase.kind === "retired") {
        return;
      }
      let n = this.lastSpawnAt ? Date.now() - this.lastSpawnAt : undefined;
      if (Date.now() - this.lastCheckPidAt > W_c) {
        this.hostWokeAt = Date.now();
      }
      let o = !(this.hostWokeAt !== undefined && Date.now() - this.hostWokeAt < 60000) && n !== undefined && n < 5000 && e !== 0;
      if (o) {
        this.fastCrashStreak++;
      } else {
        this.fastCrashStreak = 0;
      }
      let s = this.fastCrashStreak >= 3;
      let i = this.workerReady && n !== undefined && n >= 300000;
      let a = this.workerReady ? undefined : this.preInitErrorTail();
      let l = e !== 0 ? readAndClearBgExitCause(dc(this.dispatch.short)) : undefined;
      let c = o && !!l && l === this.lastExitCause;
      this.lastExitCause = o ? l : undefined;
      let u = a ? ` \u2014 ${a}` : l ? ` \u2014 ${l}` : "";
      let d = this.dispatch.launch.mode === "exec" && (t === "SIGINT" || t === "SIGQUIT");
      let p;
      if (this.phase.kind === "retiring" && this.phase.reason === "reap") {
        p = this.killOutcome;
      } else if (this.phase.kind === "retiring" && this.phase.reason === "grace") {
        p = "done";
      } else if (this.phase.kind === "upgrading") {
        p = undefined;
      } else if (e === 0) {
        p = "done";
      } else if (this.dispatch.launch.mode === "exec") {
        p = d ? "killed" : "crashed";
      } else if (!this.workerReady && (this.attempt >= 2 || a) || s || c || !i && this.attempt >= 20) {
        p = "crashed";
      }
      if (logEvent("tengu_bg_worker_exit", {
        short: this.dispatch.short,
        code: e ?? undefined,
        signal: t,
        attempt: this.attempt,
        procUptimeMs: n,
        source: this.dispatch.source,
        launch_mode: this.dispatch.launch.mode,
        outcome: p == null ? undefined : p,
        exitCause: l
      }), this.phase.kind === "retiring") {
        return this.settle(this.phase.reason === "reap" ? this.killOutcome : "done");
      }
      if (this.phase.kind === "upgrading") {
        this.transitionTo({
          kind: "spawning"
        });
        this.attempt = 1;
        this.fastCrashStreak = 0;
        this.lastExitCause = undefined;
        this.patch({
          pid: 0,
          state: "starting",
          detail: "upgrading"
        });
        this.procStart = undefined;
        this.buildBridgeReattachEnvFromState().then(f => this.doSpawn(f, true)).catch(Oe);
        return;
      }
      if (e === 0) {
        if (this.dispatch.launch.mode === "exec") {
          if (!this.execLastLine && this.ringBytes > 0) {
            logEvent("tengu_bg_exec_no_lastline", {
              ring_bytes: this.ringBytes
            });
          }
          this.patch({
            detail: this.execLastLine || "(no output)"
          });
        }
        return this.settle("done");
      }
      let m = t ? `${t} (${e})` : `exit ${e}`;
      if (this.dispatch.launch.mode === "exec") {
        let f = this.execLastLine;
        this.patch({
          state: d ? "stopped" : "crashed",
          detail: f ? `${m} \u2014 ${f}` : `${m}${u}`
        });
        return this.settle(d ? "killed" : "crashed");
      }
      if (!this.workerReady && l === "spare_postclaim:ENOENT") {
        try {
          CRt.accessSync(this.dispatch.cwd);
        } catch {
          return this.settleCwdGone("spare");
        }
      }
      if (!this.workerReady && (this.attempt >= 2 || a)) {
        this.patch({
          state: "crashed",
          detail: `${m} before init${u}`
        });
        return this.settle("crashed");
      }
      if (s || c) {
        this.patch({
          state: "crashed",
          detail: c ? `${m} \xD7${this.attempt}${u}` : `${m} within ${5000 / 1000}s of spawn \xD7${this.fastCrashStreak}${u}`
        });
        return this.settle("crashed");
      }
      if (i) {
        this.attempt = 1;
      }
      this.scheduleRespawn(`${m}${u}`);
    }
    settleCwdGone(e, t = this.dispatch.cwd) {
      let n = `working directory no longer exists: ${t}`;
      logEvent("tengu_bg_spawn_cwd_gone", {
        short: this.dispatch.short,
        attempt: this.attempt,
        via: e
      });
      this.patch({
        state: "crashed",
        detail: n
      });
      let r = `\r
\x1B[2m[${n} \u2014 this job cannot be respawned]\x1B[0m\r
`;
      this.pushRing(r);
      this.onStream.emit(r);
      this.settle("crashed");
    }
    async buildBridgeReattachEnvFromState() {
      let e = await Zi(dc(this.dispatch.short)).catch(() => null);
      if (!e) {
        return;
      }
      return iOe(e.bridgeSessionId, e.bridgeSessionSeq, e.bridgeOutboundOnly);
    }
    scheduleRespawn(e) {
      if (this.attempt >= 20) {
        logEvent("tengu_bg_respawn_exhausted", {
          short: this.dispatch.short,
          attempts: this.attempt
        });
        this.patch({
          state: "crashed",
          detail: e
        });
        return this.settle("crashed");
      }
      if (this.phase.kind === "running") {
        this.transitionTo({
          kind: "spawning"
        });
      }
      this.patch({
        pid: 0,
        state: "crashed",
        detail: `${e}; respawning`
      });
      this.procStart = undefined;
      let t = `\r
\x1B[2m[worker crashed (${e}) \u2014 respawning\u2026]\x1B[0m\r
`;
      this.pushRing(t);
      this.onStream.emit(t);
      this.backoffTimer = setTimeout(() => {
        if (this.backoffTimer = null, this.phase.kind !== "retiring" && this.phase.kind !== "retired") {
          this.doSpawn().catch(Oe);
        }
      }, 1e4);
      this.backoffTimer.unref();
    }
    settle(e) {
      if (this.record.outcome) {
        return;
      }
      logEvent("tengu_bg_settle", {
        short: this.dispatch.short,
        outcome: e,
        uptimeMs: Date.now() - this.record.startedAt,
        attempt: this.attempt
      });
      this.transitionTo({
        kind: "retired",
        outcome: e
      });
      this.clearLiveness();
      this.patch({
        outcome: e,
        settledAt: Date.now(),
        tempo: "idle"
      });
      this.onSettle.emit(e);
    }
    connectRv() {
      if (this.rv || this.isDetached || this.record.outcome) {
        return;
      }
      if (this.dispatch.launch.mode === "exec") {
        this.startPidPoll();
        return;
      }
      this.rv = U_c(this.rvSockPath ?? Vvt(this.dispatch.short), e => {
        if (e.type === "heartbeat") {
          this.lastRvHeartbeat = Date.now();
        } else if (e.type === "reply-rejected") {
          logForDebugging(`[bg] worker ${this.dispatch.short} rejected reply: rv auth token mismatch \u2014 respawn the worker to re-key`, {
            level: "warn"
          });
          logEvent("tengu_bg_rv_reply_rejected", {});
        } else if (e.type === "done") {
          this.settle(e.outcome);
        } else if (e.type === "state") {
          this.patch(e.patch);
        } else if (e.type === "detach-request") {
          let t = Tfe(e.msg);
          let n = this.attachers.get(this.lastInputAttacher);
          if (!e.broadcast && n) {
            n.deliver(t);
          } else if (this.attachers.size > 0) {
            for (let r of this.attachers.values()) {
              r.deliver(t);
            }
          } else {
            this.onStream.emit(t);
          }
        } else if (e.type === "repaint-done") {
          this.onRepaintDone.emit();
        }
      }, () => void this.checkPid(), () => {
        if (this.workerReady = true, this.resizeDeferred) {
          this.resizeDeferred = false;
          this.resize(this.ptyCols, this.ptyRows);
        }
        if (this.attachers.size > 0) {
          let e = [...this.attachers.values()].at(-1);
          this.sendAttacherCaps(e.caps ?? null);
        } else {
          this.sendAttacherCaps(null);
        }
      }, this.rvAuth);
      this.startPidPoll();
    }
    startPidPoll() {
      if (this.pidPoll) {
        return;
      }
      this.lastCheckPidAt = Date.now();
      this.pidPoll = setInterval(() => void this.checkPid(true), 5000);
      this.pidPoll.unref();
    }
    pidRecycled() {
      if (!this.procStart || !this.record.pid) {
        return false;
      }
      let e = getProcessStartTime(this.record.pid);
      return e !== undefined && e !== this.procStart;
    }
    async pidRecycledAsync() {
      if (!this.procStart || !this.record.pid) {
        return false;
      }
      let e = await getProcessStartTimeAsync(this.record.pid);
      return e !== undefined && e !== this.procStart;
    }
    pidPollTick = 0;
    async checkPid(e = false) {
      let t = Date.now() - this.lastCheckPidAt;
      this.lastCheckPidAt = Date.now();
      let n = t > W_c;
      if (n) {
        this.hostWokeAt = Date.now();
      }
      if (this.record.outcome || !this.record.pid) {
        return;
      }
      if (n && this.lastRvHeartbeat !== undefined) {
        this.lastRvHeartbeat = Date.now();
      }
      if (!this.pty) {
        try {
          process.kill(this.record.pid, 0);
        } catch (o) {
          let s = en(o);
          if (s === "ESRCH" || s === "EPERM") {
            this.logVanished(false, e);
            this.settle(this.isKilling ? "killed" : "crashed");
          }
          return;
        }
      }
      let r = this.lastRvHeartbeat;
      if (!n && !this.stalledLogged && r !== undefined && Date.now() - r > 120000) {
        let o = await Zi(dc(this.dispatch.short));
        if (!this.stalledLogged && (o?.tempo ?? this.record.tempo) === "active") {
          this.stalledLogged = true;
          logEvent("tengu_bg_worker_stalled", {
            short: this.dispatch.short,
            sinceMs: Date.now() - r
          });
        }
      }
      if (this.pty) {
        return;
      }
      if (e && this.pidPollTick++ % 12 !== 0) {
        return;
      }
      if (await this.pidRecycledAsync()) {
        if (this.record.outcome || this.pty) {
          return;
        }
        this.logVanished(true, e);
        this.settle(this.isKilling ? "killed" : "crashed");
      }
    }
    logVanished(e, t) {
      if (this.isKilling) {
        return;
      }
      logEvent("tengu_bg_worker_vanished", {
        short: this.dispatch.short,
        recycled: e,
        fromPoll: t,
        uptimeMs: Date.now() - this.record.startedAt
      });
    }
    clearLiveness() {
      if (this.pidPoll) {
        clearInterval(this.pidPoll);
        this.pidPoll = null;
      }
      this.rv?.close();
      this.rv = undefined;
      this.lastRvHeartbeat = undefined;
      this.stalledLogged = false;
    }
  }
  var W7o;
  var CRt;
  var See;
  var J_c;
  var W_c;
  var G_c;
  var Hnn;
  var Y7o;
  var She = e => st(e.env?.CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST);
  var Qmr = __lazy(() => {
    c1();
    SGe();
    zf();
    Ot();
    mm();
    je();
    gn();
    dt();
    Tb();
    Rn();
    lW();
    Cs();
    Sve();
    ZS();
    ph();
    x5o();
    uP();
    pL();
    M_c();
    X7e();
    bCt();
    B_c();
    M7();
    W7o = require("crypto");
    CRt = require("fs");
    See = require("fs/promises");
    J_c = require("path");
    W_c = 5000 * 3;
    G_c = ["local_bash", "in_process_teammate", "dream"];
    Hnn = ["CLAUDE_BG_POST_CLEAR_RESPAWN", "CLAUDE_CODE_RESUME_INTERRUPTED_TURN", "CLAUDE_CODE_QUESTION_PREVIEW_FORMAT", "GITHUB_ACTIONS", "CLAUDECODE", "CLAUDE_CODE_SESSION_ID", "CLAUDE_CODE_CHILD_SESSION", "CLAUDE_CODE_EXECPATH", "CLAUDE_BG_RV_AUTH", "CLAUDE_BG_PTY_AUTH", "CLAUDE_BG_SOCKET_TOKENS_PATH", "CLAUDE_CODE_COORDINATOR_MODE", "CLAUDE_AX_SCREEN_READER", "CLAUDE_CODE_SKIP_PROMPT_HISTORY", "ANTHROPIC_MODEL", "TERM_PROGRAM", "TERM_PROGRAM_VERSION", "__CFBundleIdentifier", "KITTY_WINDOW_ID", "WT_SESSION", "KONSOLE_VERSION", "VTE_VERSION", "ZED_TERM", "ZELLIJ", "TMUX", "TMUX_PANE", "STY", "LC_TERMINAL", "SSH_CONNECTION", "SSH_CLIENT", "SSH_TTY", "COLORFGBG", "CURSOR_TRACE_ID", "GIT_ASKPASS", "SSH_ASKPASS", "SSH_ASKPASS_REQUIRE", "VSCODE_GIT_ASKPASS_MAIN", "VSCODE_GIT_ASKPASS_NODE", "VSCODE_GIT_ASKPASS_EXTRA_ARGS", "VSCODE_GIT_IPC_HANDLE", "TERMINAL_EMULATOR", "ITERM_SESSION_ID", "GNOME_TERMINAL_SERVICE", "XTERM_VERSION", "ALACRITTY_LOG", "TILIX_ID", "TERMINATOR_UUID", "ConEmuANSI", "ConEmuPID", "ConEmuTask", "MSYSTEM", "CLAUDE_CODE_SSE_PORT", "FORCE_CODE_TERMINAL"];
    Y7o = [...qoo, ...$te, ..._le, ...h1r, "ANTHROPIC_CUSTOM_HEADERS", ...Zgn, "CLAUDE_CODE_HOST_CREDS_FILE"];
  });