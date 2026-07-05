    if (typeof n === "string") {
      await ou("cli_bg_logs", "read_failed");
      process.stderr.write(`Couldn't read logs for ${t} \u2014 ${B0(n)}
`);
      return bR(1);
    }
    await F5(n.join(""));
    await nS("cli_bg_logs");
    return bR(0);
  }
  async function attachHandler(e) {
    let t = await m6o(e, "claude attach <id>", "Open the background session in this terminal. \u2190 returns to agent view, Ctrl+Z drops back to your shell. The session keeps running either way.");
    let n = await Wen();
    if (!n.ok) {
      await ou("cli_bg_attach", "daemon_unavailable");
      process.stderr.write(`Couldn't attach \u2014 ${bgSupervisorNoun()} is unavailable (${n.reason})${daemonHint("status")}
`);
      return bR(1);
    }
    let r = await aee(t);
    for (let o = 0; r.msg && Svt.test(r.msg) && o < 20; o++) {
      if (o === 0 && r.msg.includes("ERESPAWNING")) {
        process.stderr.write(r.outcome === "detached" ? `Session not responding \u2014 restarting it\u2026
` : `Migrating job to attachable PTY\u2026
`);
      }
      await sleep(500);
      r = await aee(t);
    }
    if (r.outcome === "error" && r.msg?.includes("ENOJOB")) {
      let o = await Zi(dc(t)).catch(() => null);
      if (o?.state === "failed") {
        await ou("cli_bg_attach", "wake_failed_state");
        process.stderr.write(`Session ${t} can't start \u2014 ${detailForStderr(o.detail) || "it crashed repeatedly"}
`);
        return bR(1);
      }
      process.stderr.write(`Waking session ${t}\u2026
`);
      let s = await xCt(t).catch(i => ({
        ok: false,
        alive: false,
        short: undefined,
        error: he(i)
      }));
      if (s.ok || s.alive) {
        if (s.short && s.short !== t) {
          process.stderr.write(`Session moved to ${s.short}
`);
          t = s.short;
        }
        r = await aee(t);
      } else {
        await ou("cli_bg_attach", "wake_failed");
        process.stderr.write(`Couldn't wake ${t} \u2014 ${s.error}
`);
        return bR(1);
      }
    }
    while (r.outcome === "disconnected") {
      let o = await M5({
        forceTransient: true
      });
      if (!o.ok) {
        await ou("cli_bg_attach", "daemon_unavailable");
        process.stderr.write(`Couldn't reconnect to ${t} \u2014 ${bgSupervisorNoun()} is unavailable (${o.reason})${daemonHint("status")}
`);
        return bR(1);
      }
      let s = await CT({
        proto: 1,
        op: "list"
      });
      if (s.ok && s.op === "list" && !s.jobs.some(a => a.short === t && !a.outcome)) {
        break;
      }
      if (process.stderr.write(`Reconnecting to ${t}\u2026
`), Wt() === "windows" && process.stdin.isTTY) {
        PI(process.stdin, true);
        process.stdin.ref();
      }
      let i = Sct();
      if (i && Tur(i)) {
        if (Wt() === "windows" && process.stdin.isTTY) {
          PI(process.stdin, false);
        }
        r = {
          outcome: "detached"
        };
        break;
      }
      r = await aee(t);
      for (let a = 0; r.msg && Svt.test(r.msg) && a < 10; a++) {
        await sleep(200);
        r = await aee(t);
      }
    }
    if (r.outcome === "detached" && r.msg && (SQt.test(r.msg) || Svt.test(r.msg))) {
      await ou("cli_bg_attach", SQt.test(r.msg) ? "stalled" : "transient_exhausted");
      process.stderr.write(`${r.msg.replace(/^E(STALLED|RESPAWNING|STARTING):\s*/, "")}
`);
      return bR(1);
    }
    if (shouldOpenAgentsViewOnDetach(r, process.stdout.isTTY, process.stdin.isTTY)) {
      await nS("cli_bg_attach");
      return Xfe({
        args: ["agents"],
        env: {
          CLAUDE_AGENTS_SELECT: t
        }
      });
    }
    if (r.outcome === "detached" && r.msg) {
      process.stderr.write(`${r.msg.replace(TQt, "")}
`);
    }
    if (r.outcome === "disconnected") {
      let o = await Zi(dc(t)).catch(() => null);
      let s = o?.state === "failed" && o.detail ? ` (${detailForStderr(o.detail)})` : "";
      process.stderr.write(`Session ${t} has exited${s}.
`);
    }
    if (r.outcome === "error") {
      let o = r.msg?.includes("ERESPAWNING") ? "Job is respawning after an upgrade \u2014 try attach again in a moment." : r.msg && /ENOENT|ECONNREFUSED|ESTARTING/.test(r.msg) ? `${bgSupervisorNounCap()} is restarting \u2014 try again in a moment.` : r.msg ?? "unknown";
      process.stderr.write(`Couldn't attach to ${t} \u2014 ${o}
`);
      await ou("cli_bg_attach", "transient_exhausted");
    } else {
      await nS("cli_bg_attach");
    }
    return bR(r.outcome === "error" ? 1 : 0);
  }
  function shouldOpenAgentsViewOnDetach(e, t, n) {
    return e.outcome === "detached" && e.viaApc === true && (e.msg === undefined || !tof.test(e.msg)) && t === true && n === true;
  }
  async function respawnHandler(e) {
    if (p6o(), e === "--help" || e === "-h") {
      process.stdout.write(`Usage: claude respawn <id>|--all

  Restart a background session (or all of them) so it picks up the current Claude binary.
`);
      return;
    }
    if (e?.startsWith("-") && e !== "--all") {
      process.stderr.write(`unknown option '${e}'
Usage: claude respawn <id>|--all
`);
      process.exitCode = 1;
      return;
    }
    if (!e) {
      process.stderr.write(`usage: claude respawn <id>|--all
`);
      process.exitCode = 1;
      return;
    }
    let t = await Wen();
    if (!t.ok) {
      process.stderr.write(`Couldn't respawn \u2014 ${bgSupervisorNoun()} is unavailable (${t.reason})${daemonHint("status")}
`);
      await ou("cli_bg_respawn", "daemon_unavailable");
      process.exitCode = 1;
      return;
    }
    if (e === "--all") {
      let a = (await sX()).filter(u => !FI(u.state.state));
      if (a.length === 0) {
        process.stdout.write(`no live jobs to respawn
`);
        return;
      }
      let l = 0;
      let c = 0;
      for (let u of a) {
        let d = await xCt(u.id, {
          force: true,
          knownState: u.state
        });
        if (d.ok) {
          l++;
          process.stdout.write(`respawned ${u.id}${d.short !== u.id ? ` \u2192 ${d.short}` : ""}
`);
        } else if (d.alive) {
          c++;
          process.exitCode = 1;
          process.stderr.write(`${u.id}: still running \u2014 couldn't confirm restart, retry in a moment
`);
        } else {
          process.exitCode = 1;
          process.stderr.write(`${u.id}: ${d.error}
`);
        }
      }
      if (l === a.length) {
        await nS("cli_bg_respawn");
      } else if (l > 0 || c > 0) {
        await GB("cli_bg_respawn", c > 0 ? "still_alive" : "partial");
      } else {
        await ou("cli_bg_respawn", "spawn_failed");
      }
      return;
    }
    let r = (await EK.readdir(fO()).catch(() => [])).filter(i => zFe.test(i)).filter(i => i.startsWith(e));
    if (r.length !== 1) {
      process.stderr.write(r.length === 0 ? `No job matching '${e}'
` : `Ambiguous prefix '${e}', matches: ${r.join(", ")}
`);
      await ou("cli_bg_respawn", r.length === 0 ? "no_match" : "ambiguous");
      process.exitCode = 1;
      return;
    }
    let o = r[0];
    let s = await xCt(o, {
      force: true
    });
    if (!s.ok && s.alive) {
      process.stderr.write(`${o}: still running \u2014 couldn't confirm restart, retry in a moment
`);
      await GB("cli_bg_respawn", "still_alive");
      process.exitCode = 1;
      return;
    }
    if (!s.ok) {
      process.stderr.write(`${s.error}
`);
      await ou("cli_bg_respawn", "spawn_failed");
      process.exitCode = 1;
      return;
    }
    await nS("cli_bg_respawn");
    process.stdout.write(`respawned ${o}${s.short !== o ? ` \u2192 ${s.short}` : ""}
`);
  }
  async function stopHandler(e) {
    let t = await m6o(e, "claude stop <id>", "Stop a background session. Its conversation is kept; resume it later with `claude attach <id>`.");
    let {
      confirmed: n,
      error: r
    } = await yCe(t);
    if (!n) {
      await ou("cli_bg_stop", "kill_unconfirmed");
      process.stderr.write(r ? `couldn't confirm ${t} was stopped \u2014 ${r}
` : `couldn't confirm ${t} was stopped \u2014 the background service may be restarting. Try again in a moment.
`);
      process.exitCode = 1;
      return;
    }
    await nS("cli_bg_stop");
    process.stdout.write(`stopped ${t}
`);
    let o = dc(t);
    let s = await Zi(o);
    if (s && !Xg(s)) {
      let i = new Date().toISOString();
      await ip(o, {
        ...s,
        state: "stopped",
        detail: "stopped",
        tempo: "idle",
        needs: undefined,
        block: undefined,
        inFlight: undefined,
        updatedAt: i,
        firstTerminalAt: s.firstTerminalAt ?? i
      }).catch(a => logForDebugging(`bg stop terminal write failed: ${he(a)}`, {
        level: "warn"
      }));
    }
    if (await logEventAsync("tengu_bg_agent_action", {
      action: "stop",
      source: "cli",
      jobSessionId: s?.sessionId ?? ""
    }), s?.worktreePath) {
      process.stdout.write(_$u.dim(`  worktree retained at ${s.worktreePath}
  run 'claude rm ${t}' to remove worktree and job state
`));
    }
  }
  async function rmHandler(e) {
    if (p6o(), e === "--help" || e === "-h") {
      process.stdout.write(`Usage: claude rm <id>

  Delete a background session and its worktree. Unlike \`stop\`, works on already-exited sessions.
`);
      process.exit(0);
    }
    if (e?.startsWith("-")) {
      process.stderr.write(`unknown option '${e}'
Usage: claude rm <id>
`);
      process.exit(1);
    }
    if (!e) {
      process.stderr.write(`Usage: claude rm <id>
`);
      process.exit(1);
    }
    let n = (await EK.readdir(fO()).catch(() => [])).filter(u => zFe.test(u)).filter(u => u.startsWith(e));
    if (n.length !== 1) {
      process.stderr.write(n.length === 0 ? `No job matching '${e}'
` : `Ambiguous prefix '${e}', matches: ${n.join(", ")}
`);
      process.exit(1);
    }
    let r = n[0];
    let o = await Zi(dc(r));
    let {
      removed: s,
      error: i,
      keptWorktree: a,
      keptReason: l
    } = await nhe(r);
    if (!s) {
      await ou("cli_bg_rm", "kill_unconfirmed");
      process.stderr.write(`couldn't confirm ${r} was stopped \u2014 ${i ?? "the background service may be restarting. Try again in a moment."}
`);
      process.exitCode = 1;
      return;
    }
    if (await logEventAsync("tengu_bg_agent_action", {
      action: "delete",
      source: "cli",
      jobSessionId: o?.sessionId ?? ""
    }), a) {
      await GB("cli_bg_rm", "kept_worktree");
    } else {
      await nS("cli_bg_rm");
    }
    let c = {
      dirty: "has uncommitted changes",
      branch_mismatch: "is on a different branch",
      remove_failed: "could not be removed"
    };
    process.stdout.write(`removed ${r}` + (a ? `
  worktree ${c[l ?? "remove_failed"]} \u2014 kept at ${a}` : o?.worktreePath ? `
  worktree: ${o.worktreePath}` : "") + `
`);
  }
  function bCe(e) {
    let t = [];
    let n = e;
    while (/^-[a-zA-Z]./.test(n) && mFn.vZc(n.slice(0, 2))) {
      t.push(n.slice(0, 2));
      n = `-${n.slice(2)}`;
    }
    return {
      peeled: t,
      rest: n
    };
  }
  function kie(e) {
    return e.length > 1 && e.startsWith("-");
  }
  function ACt(e) {
    let t = vK(e);
    for (let n = 0; n < e.length; n++) {
      if (e[n] === "--" && !t.vZc(n)) {
        return n;
      }
    }
    return -1;
  }
  function stripBgFlags(e) {
    let t = ACt(e);
    let n = t >= 0 ? e.slice(0, t) : e;
    let r = vK(n);
    let o = n.filter((s, i) => r.vZc(i) || !Krf.includes(s));
    return t >= 0 ? [...o, ...e.slice(t)] : o;
  }
  function Hur(e, t, n) {
    let r = vK(e);
    let o;
    for (let s = 0; s < e.length; s++) {
      if (r.vZc(s)) {
        continue;
      }
      let i = e[s];
      if (i === "--") {
        break;
      }
      if (i === t || n !== undefined && i === n) {
        if (e[s + 1] !== undefined) {
          o = e[s + 1];
          s++;
        }
        continue;
      }
      if (i.startsWith(`${t}=`)) {
        o = i.slice(t.length + 1);
        continue;
      }
      if (n !== undefined) {
        let {
          peeled: a,
          rest: l
        } = bCe(i);
        if (l.length > 2 && l.slice(0, 2) === n) {
          o = l.slice(2);
          continue;
        }
        if (a.length > 0 && l === n && e[s + 1] !== undefined) {
          o = e[s + 1];
          s++;
        }
      }
    }
    return o;
  }
  function vK(e) {
    let t = new Set();
    for (let n = 0; n < e.length; n++) {
      if (t.vZc(n)) {
        continue;
      }
      let r = e[n];
      if (r === "--") {
        break;
      }
      let {
        rest: o
      } = bCe(r);
      if (r === "--resume" || o === "-r") {
        continue;
      }
      if ((r === "--remote-control" || r === "--rc") && e[n + 1] !== undefined && !(e[n + 1].length > 1 && e[n + 1].startsWith("-"))) {
        t.add(n + 1);
        continue;
      }
      if (!o.includes("=") && TG.vZc(o) && e[n + 1] !== undefined) {
        if (t.add(n + 1), bGe.vZc(o)) {
          let s = n + 2;
          while (e[s] !== undefined && !(e[s].length > 1 && e[s].startsWith("-"))) {
            t.add(s);
            s++;
          }
        }
      }
    }
    return t;
  }
  function parseResumeTarget(e) {
    let t = vK(e);
    let n;
    for (let r = 0; r < e.length; r++) {
      if (t.vZc(r)) {
        continue;
      }
      let o = e[r];
      if (o === "--") {
        break;
      }
      if (o.startsWith("--resume=")) {
        n = o.slice(9) || undefined;
        continue;
      }
      let {
        rest: s
      } = bCe(o);
      if (/^-r./.test(s)) {
        n = s.slice(2);
        continue;
      }
      if (o === "--resume" || s === "-r") {
        let i = e[r + 1];
        if (i !== undefined && !kie(i)) {
          n = i;
          r++;
        } else {
          n = undefined;
        }
      }
    }
    return n;
  }
  function stripResumeFlags(e) {
    let t = vK(e);
    let n = [];
    for (let r = 0; r < e.length; r++) {
      let o = e[r];
      if (t.vZc(r)) {
        n.push(o);
        continue;
      }
      if (o === "--") {
        for (let a = r; a < e.length; a++) {
          n.push(e[a]);
        }
        break;
      }
      if (o === "--fork-session" || o === "--continue" || o.startsWith("--resume=") || o.startsWith("--session-id=")) {
        continue;
      }
      let {
        peeled: s,
        rest: i
      } = bCe(o);
      if (s.length > 0 || i === "-c" || i.startsWith("-r")) {
        let a = s.filter(d => d !== "-c").map(d => d[1]);
        let l = i === "-c" || /^-r./.test(i);
        let c = i === "-r";
        let u = l || c ? "" : i.slice(1);
        if (a.length > 0 || u) {
          n.push(`-${a.join("")}${u}`);
        }
        if (c && e[r + 1] !== undefined && !kie(e[r + 1])) {
          r++;
        }
        continue;
      }
      if (o === "--session-id") {
        if (e[r + 1] !== undefined) {
          r++;
        }
        continue;
      }
      if (o === "--resume") {
        if (e[r + 1] !== undefined && !kie(e[r + 1])) {
          r++;
        }
        continue;
      }
      n.push(o);
    }
    return n;
  }
  function stripSessionIdFlag(e) {
    let t = vK(e);
    let n = [];
    for (let r = 0; r < e.length; r++) {
      let o = e[r];
      if (t.vZc(r)) {
        n.push(o);
        continue;
      }
      if (o === "--") {
        for (let s = r; s < e.length; s++) {
          n.push(e[s]);
        }
        break;
      }
      if (o.startsWith("--session-id=")) {
        continue;
      }
      if (o === "--session-id") {
        if (e[r + 1] !== undefined) {
          r++;
        }
        continue;
      }
      n.push(o);
    }
    return n;
  }
  function sof(e) {
    let t = ACt(e);
    let n = t >= 0 ? e.slice(0, t) : e;
    let r = vK(n);
    let o = n.filter((i, a) => !r.vZc(a));
    if (j5o(o)) {
      return H5o(n);
    }
    if (o.some(i => {
      let {
        peeled: a,
        rest: l
      } = bCe(i);
      return i === "--print" || i.startsWith("--print=") || a.includes("-p") || l === "-p";
    })) {
      return "--bg and --print conflict: --print never starts the interactive session that `claude agents` attaches to, so the job would be unattachable. The prompt is the positional \u2014 drop --print: `claude --bg '<task>'`.";
    }
    let s = Hur(n, "--permission-mode");
    if ((s === "bypassPermissions" || o.includes("--dangerously-skip-permissions") || o.includes("--allow-dangerously-skip-permissions")) && !hasSkipDangerousModePermissionPrompt() && !getGlobalConfig().bypassPermissionsModeAccepted) {
      return "--bg with bypassPermissions requires accepting the disclaimer first. Run `claude --dangerously-skip-permissions` once interactively.";
    }
    if (s === "auto" && !hasAutoModeOptIn()) {
      return "--bg with auto mode requires opting in first. Run `claude --permission-mode auto` once interactively.";
    }
    return null;
  }
  function iof(e, t) {
    let n = vK(e);
    let r;
    for (let o = 0; o < e.length; o++) {
      if (n.vZc(o)) {
        continue;
      }
      let s = e[o];
      if (kie(s)) {
        let {
          rest: i
        } = bCe(s);
        if ((s === "--resume" || i === "-r") && e[o + 1] !== undefined && !kie(e[o + 1])) {
          o++;
        }
        continue;
      }
      if (s.length > 0 && s !== t) {
        r = s;
      }
    }
    return r;
  }
  function flagsWithoutPositional(e) {
    let t = vK(e);
    let n = [];
    for (let r = 0; r < e.length; r++) {
      let o = e[r];
      if (t.vZc(r)) {
        n.push(o);
        continue;
      }
      if (!kie(o)) {
        continue;
      }
      if (o.includes("=")) {
        n.push(o);
        continue;
      }
      let {
        rest: s
      } = bCe(o);
      if (TG.vZc(s)) {
        n.push(o);
        continue;
      }
      if ($jt.vZc(o)) {
        n.push(o);
        continue;
      }
      let i = e[r + 1];
      if (i !== undefined && !kie(i) && !t.vZc(r + 1)) {
        r++;
        continue;
      }
      n.push(o);
    }
    return n;
  }
  function uic() {
    let e = {};
    for (let t of pFn) {
      let n = process.env[t];
      if (n === undefined) {
        continue;
      }
      if (n === "" && t !== "CLAUDE_SECURESTORAGE_CONFIG_DIR") {
        continue;
      }
      e[t] = n;
    }
    return e;
  }
  function detailForStderr(e) {
    return mf(Li(e).replace(/[\s\x00-\x1f\x7f-\x9f]+/g, " ").trim(), 200);
  }
  var nic;
  var EK;
  var u6o;
  var Krf;
  var tof;
  var Qen = __lazy(() => {
    A5o();
    $5o();
    Mfe();
    aJe();
    uP();
    pL();
    d1n();
    Qme();
    Lur();
    SGe();
    TCt();
    zf();
    t6o();
    Bur();
    ln();
    Ot();
    q$();
    Kc();
    kS();
    mm();
    vo();
    je();
    pr();
    gn();
    dt();
    Cs();
    OD();
    oCt();
    aPe();
    wj();
    tic();
    uT();
    SL();
    nic = require("crypto");
    EK = require("fs/promises");
    u6o = require("path");
    Krf = ["--bg", "--background"];
    tof = /^E[A-Z]+:/;
  });
  var fic = {};