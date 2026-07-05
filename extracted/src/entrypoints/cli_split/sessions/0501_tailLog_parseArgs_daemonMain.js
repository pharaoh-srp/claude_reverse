  __export(_Qc, {
    tailLog: () => tailLog,
    parseArgs: () => parseArgs_export,
    daemonMain: () => daemonMain
  });
  function pQc() {
    return OVf + (isDaemonServiceInstallEnabled() ? DVf : MVf) + "" + LVf;
  }
  function parseArgs_export(e) {
    let t = S5();
    let n = false;
    let r = fUe();
    let o;
    let s;
    let i = new Set();
    for (let f = 0; f < e.length; f++) {
      let h = e[f];
      if (h === "--json-path" && e[f + 1]) {
        i.add(f);
        i.add(++f);
        t = e[f];
        n = true;
      } else if (h.startsWith("--json-path=")) {
        i.add(f);
        t = h.slice(12);
        n = true;
      } else if (h === "--log-file" && e[f + 1]) {
        i.add(f);
        i.add(++f);
        r = e[f];
      } else if (h.startsWith("--log-file=")) {
        i.add(f);
        r = h.slice(11);
      } else if (h === "--origin" && e[f + 1]) {
        i.add(f);
        i.add(++f);
        o = mQc(e[f]);
      } else if (h.startsWith("--origin=")) {
        i.add(f);
        o = mQc(h.slice(9));
      } else if (h === "--spawned-by" && e[f + 1]) {
        i.add(f);
        i.add(++f);
        s = $Vf(e[f]);
      }
    }
    let a = [];
    for (let f = 0; f < e.length; f++) {
      if (!i.vZc(f)) {
        a.push(e[f]);
      }
    }
    let l = new Set(["run", "install", "uninstall", "start", "stop", "restart", "status", "logs", "log", "list", "scheduled", "remote-control", "hub"]);
    let c = process.stdin.isTTY ? "hub" : "run";
    let u = -1;
    for (let f = 0; f < a.length; f++) {
      if (!a[f].startsWith("-")) {
        u = f;
        break;
      }
    }
    if (u === -1) {
      return {
        sub: c,
        jsonPath: t,
        logPath: r,
        origin: o,
        spawnedBy: s,
        rest: a
      };
    }
    let d = a[u];
    if (!l.vZc(d)) {
      if (!/[./\\~]/.test(d)) {
        return {
          sub: d,
          jsonPath: t,
          logPath: r,
          origin: o,
          spawnedBy: s,
          rest: []
        };
      }
      return {
        sub: "run",
        jsonPath: n ? t : d,
        logPath: r,
        origin: o,
        spawnedBy: s,
        rest: []
      };
    }
    let p = [...a.slice(0, u), ...a.slice(u + 1)];
    let m = d;
    if (m === "run" && !n) {
      let f = p.find(h => !h.startsWith("-"));
      if (f) {
        t = f;
      }
    }
    return {
      sub: m,
      jsonPath: t,
      logPath: r,
      origin: o,
      spawnedBy: s,
      rest: p
    };
  }
  function mQc(e) {
    if (e === "service" || e === "transient" || e === "foreground") {
      return e;
    }
    if (e === "auto") {
      return "transient";
    }
    return;
  }
  function BVf(e) {
    let t = e.origin ?? "unknown";
    if (t !== "transient" && t !== "auto") {
      return t;
    }
    let n = e.spawnedBy;
    if (!n) {
      return "transient \u2014 started on-demand by a client";
    }
    return `transient \u2014 started on-demand by \`${n.label}\` (pid ${n.pid}) in ${n.cwd}`;
  }
  function $Vf(e) {
    let t = Ba(e, false);
    if (t === null || typeof t !== "object") {
      return;
    }
    let n = t;
    if (typeof n.label === "string" && typeof n.cwd === "string" && typeof n.pid === "number") {
      return {
        label: n.label,
        cwd: n.cwd,
        pid: n.pid
      };
    }
    return;
  }
  function Xy(e) {
    process.stdout.write(e + `
`);
  }
  function sC(e) {
    process.stderr.write(e + `
`);
  }
  function O2e(e, t) {
    let n = [];
    for (let r = 0; r < e.length; r++) {
      let o = e[r];
      if (t.includes(o)) {
        continue;
      }
      if (o === "--debug" || o === "-d" || o === "--debug-to-stderr" || o === "-d2e" || o.startsWith("--debug=") || o.startsWith("--debug-file=")) {
        continue;
      }
      if (o === "--debug-file" && r + 1 < e.length) {
        r++;
        continue;
      }
      n.push(o);
    }
    if (n.length > 0) {
      sC(`warning: extra arguments ignored: ${n.join(" ")}`);
    }
  }
  async function o6(e) {
    await Promise.race([Promise.all([shutdown1PEventLogging(), shutdownDatadog()]), sleep(500, undefined, {
      unref: true
    })]).catch(() => {});
    process.exit(e);
  }
  async function daemonMain(e) {
    if (await ensureFleetGateHydrated(), e.includes("--help") || e.includes("-h")) {
      if (!isDaemonCliEnabled()) {
        return fleetGateRejected("daemon");
      }
      Xy(pQc());
      return;
    }
    let t = parseArgs_export(e);
    let {
      jsonPath: n,
      logPath: r,
      origin: o,
      spawnedBy: s,
      rest: i
    } = t;
    let a = t.sub === "hub" && !isDaemonWorkerRegistryEnabled() ? "status" : t.sub;
    if (!UVf.vZc(a)) {
      let l = await runFastPathPolicyHelper();
      if (l) {
        process.stderr.write(`${l}
`);
        process.exit(1);
      }
      if (!isDaemonCliEnabled()) {
        return fleetGateRejected("daemon");
      }
    }
    if (FVf.vZc(a) && !isDaemonWorkerRegistryEnabled()) {
      return fleetGateRejected(`daemon ${a}`);
    }
    switch (initialize1PEventLogging(), a) {
      case "list":
        {
          O2e(i, ["--json"]);
          let {
            handleListAllKinds: l
          } = await Promise.resolve().then(() => (kis(), xis));
          await l(i.includes("--json"), n);
          return;
        }
      case "scheduled":
      case "remote-control":
        {
          let {
            handleCliKind: l
          } = await Promise.resolve().then(() => (kis(), xis));
          await l(a, i, n);
          return;
        }
      case "hub":
        {
          if (O2e(i, []), !process.stdin.isTTY || !process.stdout.isTTY) {
            Xy("Interactive hub requires a TTY. See `claude daemon --help`.");
            return;
          }
          let {
            renderDaemonHubStandalone: l
          } = await Promise.resolve().then(() => (nVo(), tVo));
          await l();
          return process.exit(0);
        }
      case "run":
        {
          if (zat()) {
            sC("claude daemon: background agents disabled (3P/opt-out)");
            return process.exit(0);
          }
          process.title = "claude daemon";
          let l = Oin.resolve(n);
          let c = Oin.resolve(r);
          getDebugFilePath();
          try {
            process.chdir(hQc.homedir());
          } catch {}
          oze();
          let u = new AbortController();
          let d = false;
          let p = () => {
            if (d) {
              sC("forced shutdown");
              process.exit(1);
            }
            d = true;
            u.abort();
          };
          process.on("SIGINT", p);
          process.on("SIGTERM", p);
          let m = o ?? "foreground";
          let f;
          let h;
          try {
            ({
              upgradeDetected: f,
              exitCode: h
            } = await cQc({
              jsonPath: l,
              logPath: c,
              origin: m,
              spawnedBy: s,
              signal: u.signal
            }));
          } catch (g) {
            Oe(g);
            Ae("daemon_start", "daemon_start_crash");
            await Promise.all([logEventTo1PAwaitable("tengu_daemon_startup_crash", {}), trackDatadogEvent("tengu_daemon_startup_crash", {})]);
            return o6(1);
          }
          if (f) {
            if (m === "service") {
              return o6(70);
            }
            await jVf(l, c, m, s);
          }
          return o6(h);
        }
      case "install":
        {
          if (O2e(i, []), !isDaemonServiceInstallEnabled()) {
            sC(`\`claude daemon ${a}\` is disabled in this version \u2014 the daemon runs on demand and exits when the last client disconnects.`);
            await logEventTo1PAwaitable("tengu_daemon_install", {
              ok: false,
              disabled: true
            });
            return o6(1);
          }
          if (!gUe()) {
            sC(`Service install isn't available on ${"linux"} \u2014 the daemon still runs on demand when a client connects.`);
            Ae("daemon_service_install", "daemon_service_install_unsupported");
            return o6(1);
          }
          if (process.env.CLAUDE_CONFIG_DIR) {
            sC("service install only supports the default config dir \u2014 the launchd/systemd unit is a per-user singleton");
            Ae("daemon_service_install", "daemon_service_install_config_dir");
            return o6(1);
          }
          let l = await JQt();
          if (l !== null) {
            Xy(`stopped detached daemon (pid ${l})`);
          }
          let c = await XQt({
            jsonPath: n,
            logPath: r
          });
          if (!c.ok) {
            await logEventTo1PAwaitable("tengu_daemon_install", {
              ok: false
            });
            Ae("daemon_service_install", "daemon_service_install_failed");
            sC(`install failed: ${c.error}`);
            sC(`  (service file was written to ${c.servicePath})`);
            return o6(1);
          }
          Pe("daemon_service_install");
          Xy(`installed: ${c.servicePath}`);
          let u = await tBe(45000);
          if (await logEventTo1PAwaitable("tengu_daemon_install", {
            ok: true,
            reachable: u
          }), u) {
            let d = await lP().catch(() => null);
            Xy(`running: pid=${d?.pid ?? "?"} origin=${d?.origin ?? "?"} (managed by ${Wt() === "macos" ? "launchd" : "systemd"})`);
          } else {
            sC(`warning: service installed but daemon not reachable within ${45000 / 1000}s \u2014 check \`claude daemon logs\``);
          }
          return o6(0);
        }
      case "start":
      case "restart":
        {
          if (O2e(i, []), !isDaemonServiceInstallEnabled()) {
            sC(`\`claude daemon ${a}\` is disabled in this version \u2014 the daemon runs on demand and exits when the last client disconnects.`);
            await logEventTo1PAwaitable("tengu_daemon_install", {
              ok: false,
              disabled: true
            });
            return o6(1);
          }
          if (!gUe()) {
            sC(`\`claude daemon ${a}\` isn't available on ${"linux"} (no launchd/systemd) \u2014 the daemon runs on demand instead.`);
            process.exit(1);
          }
          if (process.env.CLAUDE_CONFIG_DIR) {
            sC("the launchd/systemd unit is a per-user singleton for the default config dir");
            process.exit(1);
          }
          if (!(await WZ())) {
            sC("service not installed \u2014 run `claude daemon install` first");
            process.exit(1);
          }
          if (await Lir()) {
            Xy("service binary missing \u2014 regenerating service file");
            let c = await JQt();
            if (c !== null) {
              Xy(`stopped detached daemon (pid ${c})`);
            }
            let u = await XQt({
              jsonPath: n,
              logPath: r
            });
            if (await logEventTo1PAwaitable("tengu_daemon_control", {
              op_start: a === "start",
              op_restart: a === "restart",
              ok: u.ok,
              regenerated: true
            }), u.ok) {
              Xy(a === "start" ? "started" : "restarted");
            } else {
              sC(`regenerate failed: ${u.error}`);
            }
            return o6(u.ok ? 0 : 1);
          }
          let l = await (a === "start" ? Nir() : MWl());
          if (await logEventTo1PAwaitable("tengu_daemon_control", {
            op_start: a === "start",
            op_restart: a === "restart",
            ok: l.ok
          }), l.ok) {
            Xy(a === "start" ? "started" : "restarted");
          } else {
            sC(`${a} failed: ${l.error}`);
          }
          return o6(l.ok ? 0 : 1);
        }
      case "uninstall":
        {
          O2e(i, []);
          let l = await qvt();
          if (await logEventTo1PAwaitable("tengu_daemon_control", {
            op_uninstall: true,
            ok: l.ok
          }), l.ok) {
            Pe("daemon_service_uninstall");
            Xy("uninstalled");
          } else {
            Ae("daemon_service_uninstall", "daemon_service_uninstall_failed");
            sC(`uninstall failed: ${l.error}`);
          }
          return o6(l.ok ? 0 : 1);
        }
      case "stop":
        {
          let l = i.includes("--keep-workers");
          O2e(i, ["--keep-workers", "--any"]);
          let c = g => l || g === 0 ? "stopped" : `stopped (terminated ${g} ${un(g, "background session")})`;
          let u = async (g, y) => {
            if (g) {
              Pe("daemon_stop");
            } else {
              Ae("daemon_stop", "daemon_stop_failed");
            }
            await logEventTo1PAwaitable("tengu_daemon_control", {
              op_stop: true,
              ok: g,
              reaped: y
            });
            return o6(g ? 0 : 1);
          };
          let d = await WZ();
          let p = await lP();
          if (!d && p && !i.includes("--any")) {
            sC(`no background service is installed, but a daemon is running (pid=${p.pid}, origin=${p.origin ?? "unknown"}). Run \`claude daemon stop --any\` to stop it.`);
            return o6(1);
          }
          let m = await CT({
            proto: 1,
            op: "shutdown",
            reapWorkers: !l
          });
          if (m.ok && m.op === "shutdown") {
            let g = l ? 0 : (await V5o({
              supervisorKilledAll: true
            })).reaped;
            let y = Math.max(m.reaped, g);
            if (d) {
              let _ = await QQt();
              if (!_.ok) {
                sC(`stop failed: ${_.error}`);
                return u(false, y);
              }
            }
            if (Xy(c(y)), !d) {
              Xy("note: the next `claude agents` or `claude --bg` will start a new one");
            }
            return u(true, y);
          }
          let f = false;
          if (d) {
            let g = await QQt();
            if (!g.ok) {
              sC(`stop failed: ${g.error}`);
              return u(false, 0);
            }
            f = true;
          } else if (p && Wt() !== "windows") {
            try {
              process.kill(p.pid, "SIGTERM");
              f = true;
            } catch (g) {
              if (en(g) === "ESRCH") {
                f = true;
              } else {
                let y = en(g) === "EPERM" ? " (running as another user \u2014 try with elevated privileges)" : "";
                sC(`could not stop daemon (pid=${p.pid}): ${he(g)}${y}`);
                return u(false, 0);
              }
            }
          }
          let h = l ? 0 : (await V5o()).reaped;
          if (p && !f && Wt() === "windows") {
            sC((h > 0 ? `terminated ${h} background session(s); ` : "") + `supervisor (pid=${p.pid}) is still running \u2014 stop it with ` + `\`taskkill /PID ${p.pid}\` or close the terminal it was started in.`);
            return u(false, h);
          }
          if (!f && !p && h === 0) {
            Xy("no daemon running");
          } else if (Xy(c(h)), !d && p) {
            Xy("note: the next `claude agents` or `claude --bg` will start a new one");
          }
          return u(true, h);
        }
      case "status":
        {
          O2e(i, []);
          let l = await lP();
          if (!l) {
            Xy("not running");
            let {
              getBgDaemonStatus: f,
              formatBgDaemonStatus: h
            } = await Promise.resolve().then(() => (jir(), Wqo));
            Xy(h(await f()));
            process.exit(1);
          }
          let c = Math.floor((Date.now() - l.startedAt) / 1000);
          Xy(`pid:     ${l.pid}`);
          Xy(`version: ${l.version}`);
          Xy(`uptime:  ${c}s`);
          Xy(`origin:  ${BVf(l)}`);
          Xy(`config:  ${l.jsonPath}`);
          Xy(`log:     ${l.logPath}`);
          let {
            getBgDaemonStatus: u,
            formatBgDaemonStatus: d
          } = await Promise.resolve().then(() => (jir(), Wqo));
          let p = await u();
          Xy(d(p));
          let m = l.origin;
          if (m === "transient" || m === "auto") {
            Xy("");
            let f = p.workersLive ?? 0;
            let h = p.leaseClients;
            if (f > 0 || h.length > 0) {
              if (Xy("holding this daemon open:"), f > 0) {
                Xy(`  ${f} ${un(f, "bg worker")} running (daemon waits for them to settle)`);
              }
              for (let g of h) {
                Xy(`  \`${g.label}\` (pid ${g.pid}) in ${g.cwd}`);
              }
              Xy("");
              Xy("to let it idle-exit: wait for (or cancel) bg workers and close any `claude agents`");
            } else if (p.workersLive === 0) {
              Xy("nothing holding this daemon open \u2014 will idle-exit shortly");
            }
          }
          if (l.version !== {
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.VERSION) {
            Xy("");
            Xy(`warning: running daemon is ${l.version}, but this claude is ${{
              ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
              PACKAGE_URL: "@anthropic-ai/claude-code",
              README_URL: "https://code.claude.com/docs/en/overview",
              VERSION: "2.1.198",
              FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
              BUILD_TIME: "2026-07-01T06:09:31Z",
              GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
            }.VERSION}`);
            let f = (await WZ()) ? "claude daemon stop" : "claude daemon stop --any";
            Xy(`  run \`${f}\` to pick up the new version`);
          }
          return process.exit(0);
        }
      case "logs":
      case "log":
        {
          O2e(i, []);
          await tailLog(r);
          return;
        }
      default:
        sC(`unknown subcommand: ${a}`);
        sC("");
        sC(pQc());
        process.exit(1);
    }
  }
  async function jVf(e, t, n, r) {
    let {
      err: o,
      stderrPath: s
    } = await xur(["daemon", "run", "--json-path", e, "--log-file", t, "--origin", n, ...(r ? ["--spawned-by", De(r)] : [])]);
    if (s) {
      oTr.rm(Oin.dirname(s), {
        recursive: true,
        force: true
      }).catch(() => {});
    }
    if (o) {
      Oe(`daemon: upgrade self-respawn failed: ${he(o)}`);
      await logEventTo1PAwaitable("tengu_bg_daemon_spawn_failed", {
        respawn: true,
        errno_enoent: en(o) === "ENOENT",
        errno_eacces: en(o) === "EACCES",
        errno: gd(o) ?? "unknown"
      });
    }
  }
  async function tailLog(e) {
    {
      let s = fQc.spawn("tail", ["-f", e], {
        stdio: "inherit"
      });
      await new Promise(i => {
        s.on("exit", a => {
          if (a) {
            process.exitCode = a;
          }
          i();
        });
        s.on("error", a => {
          sC(`tail failed: ${a.message}`);
          process.exit(1);
        });
      });
      return;
    }
    let t;
    try {
      t = await oTr.open(e, "r");
    } catch (s) {
      sC(`cannot open ${e}: ${he(s)}`);
      process.exit(1);
    }
    let n = (await t.stat()).size;
    let r = Buffer.alloc(65536);
    let o = false;
    process.on("SIGINT", () => {
      o = true;
    });
    while (!o) {
      if ((await t.stat()).size < n) {
        n = 0;
      }
      let {
        bytesRead: i
      } = await t.read(r, 0, r.length, n);
      if (i > 0) {
        process.stdout.write(r.subarray(0, i));
        n += i;
      } else {
        await sleep(500);
      }
    }
    await t.close();
  }
  var fQc;
  var oTr;
  var hQc;
  var Oin;
  var OVf = `Usage: claude daemon [subcommand] [options]

Service lifecycle:
  run [json-path]   Run the supervisor in the foreground (default when piped)
  status            Show daemon pid, version, uptime
  logs              Tail the daemon log (Ctrl-C to stop)
  uninstall         Remove the background service (launchctl/systemd)
  stop              Shut down the supervisor and terminate background sessions
                      --any           also stop a transient (non-service) daemon
                      --keep-workers  leave detached sessions running
`;
  var DVf = `  install           Install as a launchctl/systemd service (persists across reboot)
  start             Start the installed service
  restart           Restart the installed service
`;
  var MVf = `
  Service install is disabled in this version \u2014 the daemon runs on demand
  and exits when the last client disconnects.
`;
  var LVf = `
Options:
  --json-path <p>   Config file (default: ~/.claude/daemon.json)
  --log-file <p>    Log file (default: ~/.claude/daemon.log)
  --help, -h        Show this help
`;
  var FVf;
  var UVf;
  var bQc = __lazy(() => {
    uT();
    fDn();
    xJ();
    ln();
    BF();
    je();
    dt();
    Gd();
    Rn();
    qQ();
    Cs();
    bhe();
    Zn();
    Mfe();
    aJe();
    pL();
    bCt();
    F5o();
    jZ();
    hUe();
    yUe();
    uQc();
    fQc = require("child_process");
    oTr = require("fs/promises");
    hQc = require("os");
    Oin = require("path");
    FVf = new Set(["list", "scheduled", "remote-control", "hub"]);
    UVf = new Set(["run", "status", "stop", "uninstall"]);
  });
  var SQc = {};