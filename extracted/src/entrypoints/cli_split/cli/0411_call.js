  __export(fic, {
    spawnBackgroundFork: () => spawnBackgroundFork,
    deriveBackgroundSeed: () => deriveBackgroundSeed,
    canBackgroundSession: () => canBackgroundSession,
    call: () => call_export76,
    BackgroundAndExit: () => BackgroundAndExit
  });
  async function spawnBackgroundFork(e, t, n, r, o, s, i, a, l, c) {
    let u = getMainLoopModelOverride();
    let d = typeof n === "string" ? n : undefined;
    let p = Array.from(o.values()).filter(x => x.source === "session").map(x => x.path);
    let m = s.session ?? [];
    let f = i.session ?? [];
    let h = m.length > 0 || f.length > 0 ? {
      allow: [...m],
      deny: [...f]
    } : undefined;
    let g = s.cliArg ?? [];
    let y = i.cliArg ?? [];
    let _ = getCurrentWorktreeSession();
    let b = Boolean(_ && !_.enteredExisting);
    let S = getCurrentSessionFile();
    await withTimeout(flushSessionStorage(), 2000, "flush timeout").catch(() => {});
    let E = [...(S !== null ? ["--resume", S, "--fork-session"] : []), ...(c?.replyOnResume ? ["--reply-on-resume"] : []), ...getReplConfigArgv(), ...p.flatMap(x => ["--add-dir", x]), ...g.flatMap(x => ["--allowed-tools", x]), ...y.flatMap(x => ["--disallowed-tools", x]), ...(u ? ["--model", u] : []), ...(d && jIe() ? ["--effort", d] : []), "--permission-mode", r, ...(t ? ["--", t] : [])];
    let C = await spawnBgSession(E, c?.providedSessionId, "repl", _?.worktreePath ?? getOriginalCwd(), {
      ...e,
      worktree: b ? {
        path: _.worktreePath,
        branch: _.worktreeBranch,
        hookBased: _.hookBased ?? false,
        originCwd: _.originalCwd
      } : undefined,
      sessionPermissionRules: h,
      memoryToggledOff: getMemoryToggledOff() || undefined
    }, c?.extraEnv).catch(x => ({
      ok: false,
      error: `Couldn't background \u2014 ${he(x)}`,
      reason: undefined
    }));
    if (!C.ok) {
      logEvent("tengu_background_spawn_failed", {});
      let x = false;
      if (a === "left_arrow" && c?.providedSessionId !== undefined && S !== null && !C.alive) {
        let A = dc(c.providedSessionId.slice(0, 8));
        let k = await Zi(A);
        if (k) {
          let I = qur.join(qur.dirname(S), `${c.providedSessionId}.jsonl`);
          x = await PCt.copyFile(S, I).then(() => ip(A, {
            ...k,
            state: "failed",
            tempo: "idle",
            needs: undefined,
            block: undefined,
            inFlight: undefined,
            detail: "couldn't start in the background \u2014 press Enter to retry",
            linkScanPath: I,
            respawnFlags: oOe(stripResumeFlags(E)),
            updatedAt: new Date().toISOString()
          }).catch(async O => {
            throw await PCt.rm(I, {
              force: true
            }).catch(() => {}), O;
          })).then(() => true, O => (Oe(O), false));
        }
        if (x && _) {
          dst(null);
          R_e();
        }
      }
      if (a === "left_arrow") {
        if (x) {
          Et("repl_background_fork", "queued_for_later");
        } else {
          Ae("repl_background_fork", "spawn_failed");
        }
      }
      return {
        ok: false,
        error: C.error,
        queued: x,
        reason: C.reason
      };
    }
    if (logEvent("tengu_background", {
      via_flag: false,
      via: a
    }), a === "left_arrow") {
      Pe("repl_background_fork");
    }
    if (_) {
      dst(null);
      R_e();
    }
    if (e.name === undefined && C.sessionId) {
      let x = C.short;
      let A = Dwt(kg([...l]), AbortSignal.timeout(3000)).then(k => k ? Fue(x, k, "auto") : undefined).catch(() => {});
      if (a === "command") {
        Ti(() => A);
      }
    }
    return {
      ok: true,
      short: C.short,
      handedOff: b,
      hadWorktree: _ !== null
    };
  }
  async function mic(e) {
    let t = await z5n(e.tasks);
    let n;
    if (t) {
      n = pic.randomUUID();
      try {
        let o = dc(n.slice(0, 8));
        await PCt.mkdir(o, {
          recursive: true,
          mode: 448
        });
        await Ngt(o, t.payload);
        await t.checkpointAgents(e.taskRegistry);
      } catch {
        n = undefined;
      }
    }
    let r = await spawnBackgroundFork(e.seed, e.prompt, e.effortValue, e.permissionMode, e.additionalWorkingDirectories, e.alwaysAllowRules, e.alwaysDenyRules, "command", e.messages, {
      replyOnResume: e.isMidTurn,
      providedSessionId: n
    });
    if (r.ok) {
      if (t && n) {
        t.disown(e.taskRegistry);
      }
      return {
        ...r,
        adopted: Q5n(n ? t?.payload : null)
      };
    }
    if (n) {
      t?.abandon();
    }
    return {
      ok: false,
      error: r.error
    };
  }
  function canBackgroundSession(e) {
    return isAgentsFleetEnabled() && !li() && !isTranscriptPersistenceDisabled() && V5n() && deriveBackgroundSeed(e, "") !== null;
  }
  function BackgroundAndExit(e) {
    let t = f6o.c(7);
    let {
      messages: n,
      isMidTurn: r
    } = e;
    let o = Ec();
    let s = Rv();
    let i = nBe.useRef(false);
    let a;
    let l;
    if (t[0] !== r || t[1] !== n || t[2] !== o || t[3] !== s) {
      a = () => {
        if (i.current) {
          return;
        }
        i.current = true;
        let u = deriveBackgroundSeed(n, "");
        if (u === null) {
          Ae("bg_exit_dialog_background", "no_seed");
          gracefulShutdown(0, "prompt_input_exit", {
            finalMessage: "Nothing to background \u2014 exiting."
          });
          return;
        }
        (async () => {
          let d = o.getState();
          let p = Mpe(d.tasks);
          let m = Ogt(vbu(d.tasks, h => Lgt(h, p)), {
            cronFilter: h => !B8e(h, p)
          });
          let f = await mic({
            seed: u,
            prompt: null,
            messages: n,
            isMidTurn: r,
            effortValue: d.effortValue,
            permissionMode: d.toolPermissionContext.mode,
            additionalWorkingDirectories: d.toolPermissionContext.additionalWorkingDirectories,
            alwaysAllowRules: d.toolPermissionContext.alwaysAllowRules,
            alwaysDenyRules: d.toolPermissionContext.alwaysDenyRules,
            tasks: d.tasks,
            taskRegistry: s
          });
          if (f.ok) {
            Pe("bg_exit_dialog_background");
            let h = m.count > 0 ? `
${m.summary} couldn't be moved and ${m.count === 1 ? "was" : "were"} stopped.` : "";
            await gracefulShutdown(0, "prompt_input_exit", {
              suppressResumeHint: true,
              finalMessage: formatBgHints(f.short, f.handedOff ? "(worktree handed off)" : undefined) + h
            });
          } else {
            Ae("bg_exit_dialog_background", "spawn_failed");
            await gracefulShutdown(0, "prompt_input_exit", {
              finalMessage: f.error
            });
          }
        })();
      };
      l = [n, r, o, s];
      t[0] = r;
      t[1] = n;
      t[2] = o;
      t[3] = s;
      t[4] = a;
      t[5] = l;
    } else {
      a = t[4];
      l = t[5];
    }
    nBe.useEffect(a, l);
    let c;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      c = ICt.jsx(Text, {
        dimColor: true,
        children: "Moving to background\u2026"
      });
      t[6] = c;
    } else {
      c = t[6];
    }
    return c;
  }
  function deriveBackgroundSeed(e, t) {
    let n = t;
    let r = false;
    let o;
    for (let a = e.length - 1; a >= 0; a--) {
      let l = e[a];
      if (l.type === "assistant" && o === undefined) {
        let c = UG(l);
        if (c) {
          o = c.replace(/\s+/g, " ").trim().slice(0, 120);
        }
      }
      if (l.type === "user" && !l.isMeta && !PZ(l)) {
        let c = qO(l)?.trim();
        if (c && IZ(c)) {
          if (c.startsWith(`<${"command-message"}>`)) {
            r = true;
          }
          continue;
        }
        if (r = true, !n && c) {
          n = c;
        }
      }
      if (r && n && o !== undefined) {
        break;
      }
    }
    if (!r && !t) {
      return null;
    }
    let s = getCurrentSessionTitle(getSessionId());
    let i = getCurrentSessionAiTitle(getSessionId());
    return {
      intent: (n || "(backgrounded)").slice(0, 200),
      name: s ?? i,
      nameSource: s ? "user" : i ? "auto" : undefined,
      detail: o
    };
  }
  function cof(e) {
    let t = f6o.c(56);
    let {
      onDone: n,
      prompt: r,
      seed: o,
      messages: s,
      isMidTurn: i
    } = e;
    let a = bt(hof);
    let l = bt(fof);
    let c = bt(mof);
    let u = bt(pof);
    let d = bt(dof);
    let p = bt(uof);
    let m = Rv();
    let f;
    if (t[0] !== p) {
      f = Ogt(p);
      t[0] = p;
      t[1] = f;
    } else {
      f = t[1];
    }
    let h = f;
    let g;
    let y;
    if (t[2] !== p) {
      let z = Mpe(p);
      g = o8t(p, z);
      y = Ogt(vbu(p, V => Lgt(V, z)), {
        cronFilter: V => !B8e(V, z)
      });
      t[2] = p;
      t[3] = g;
      t[4] = y;
    } else {
      g = t[3];
      y = t[4];
    }
    let _;
    if (t[5] !== g || t[6] !== y) {
      _ = {
        carryOverCount: g,
        abandonable: y
      };
      t[5] = g;
      t[6] = y;
      t[7] = _;
    } else {
      _ = t[7];
    }
    let {
      carryOverCount: b,
      abandonable: S
    } = _;
    let [E, C] = nBe.useState(S.count === 0);
    let x = nBe.useRef(false);
    let A;
    if (t[8] !== S.count || t[9] !== c || t[10] !== u || t[11] !== d || t[12] !== b || t[13] !== E || t[14] !== a || t[15] !== h.count || t[16] !== i || t[17] !== s || t[18] !== n || t[19] !== l || t[20] !== r || t[21] !== o || t[22] !== m || t[23] !== p) {
      A = () => {
        if (!E || x.current) {
          return;
        }
        x.current = true;
        (async () => {
          let z = await mic({
            seed: o,
            prompt: r,
            messages: s,
            isMidTurn: i,
            effortValue: a,
            permissionMode: l,
            additionalWorkingDirectories: c,
            alwaysAllowRules: u,
            alwaysDenyRules: d,
            tasks: p,
            taskRegistry: m
          });
          if (z.ok) {
            logEvent("tengu_background_fork", {
              confirmed: S.count > 0,
              inflight_count: h.count,
              carryover_count: b,
              mid_turn: i,
              had_prompt: r.length > 0,
              had_worktree: z.hadWorktree,
              worktree_handed_off: z.handedOff,
              ...z.adopted
            });
            n();
            await gracefulShutdown(0, "prompt_input_exit", {
              suppressResumeHint: true,
              finalMessage: formatBgHints(z.short, z.handedOff ? "(worktree handed off)" : undefined)
            });
          } else {
            n(z.error);
          }
        })();
      };
      t[8] = S.count;
      t[9] = c;
      t[10] = u;
      t[11] = d;
      t[12] = b;
      t[13] = E;
      t[14] = a;
      t[15] = h.count;
      t[16] = i;
      t[17] = s;
      t[18] = n;
      t[19] = l;
      t[20] = r;
      t[21] = o;
      t[22] = m;
      t[23] = p;
      t[24] = A;
    } else {
      A = t[24];
    }
    let k;
    if (t[25] !== c || t[26] !== u || t[27] !== d || t[28] !== E || t[29] !== a || t[30] !== h.count || t[31] !== i || t[32] !== s || t[33] !== n || t[34] !== l || t[35] !== r || t[36] !== o || t[37] !== m || t[38] !== p) {
      k = [E, a, l, c, u, d, h.count, i, o, n, r, s, p, m];
      t[25] = c;
      t[26] = u;
      t[27] = d;
      t[28] = E;
      t[29] = a;
      t[30] = h.count;
      t[31] = i;
      t[32] = s;
      t[33] = n;
      t[34] = l;
      t[35] = r;
      t[36] = o;
      t[37] = m;
      t[38] = p;
      t[39] = k;
    } else {
      k = t[39];
    }
    if (nBe.useEffect(A, k), E) {
      let z;
      if (t[40] === Symbol.for("react.memo_cache_sentinel")) {
        z = ICt.jsx(Text, {
          dimColor: true,
          children: "Backgrounding\u2026"
        });
        t[40] = z;
      } else {
        z = t[40];
      }
      return z;
    }
    let I;
    if (t[41] !== h.count || t[42] !== n) {
      I = () => {
        logEvent("tengu_background_declined", {
          inflight_count: h.count
        });
        n();
      };
      t[41] = h.count;
      t[42] = n;
      t[43] = I;
    } else {
      I = t[43];
    }
    let O = I;
    let M;
    if (t[44] !== b) {
      M = b > 0 ? ` ${b} ${un(b, "task")} will carry over to the background session.` : "";
      t[44] = b;
      t[45] = M;
    } else {
      M = t[45];
    }
    let L = M;
    let P = `${S.summary} will be stopped.${L}`;
    let F = S.count;
    let H;
    if (t[46] !== S.count) {
      H = un(S.count, "task");
      t[46] = S.count;
      t[47] = H;
    } else {
      H = t[47];
    }
    let U = `Background anyway (${F} ${H} will be stopped)`;
    let N;
    if (t[48] === Symbol.for("react.memo_cache_sentinel")) {
      N = () => C(true);
      t[48] = N;
    } else {
      N = t[48];
    }
    let W;
    if (t[49] !== O || t[50] !== U) {
      W = ICt.jsx(mc, {
        confirmLabel: U,
        cancelLabel: "Stay",
        onConfirm: N,
        onCancel: O
      });
      t[49] = O;
      t[50] = U;
      t[51] = W;
    } else {
      W = t[51];
    }
    let j;
    if (t[52] !== O || t[53] !== W || t[54] !== P) {
      j = ICt.jsx(or, {
        title: "Background this session?",
        subtitle: P,
        onCancel: O,
        children: W
      });
      t[52] = O;
      t[53] = W;
      t[54] = P;
      t[55] = j;
    } else {
      j = t[55];
    }
    return j;
  }
  function uof(e) {
    return e.tasks;
  }
  function dof(e) {
    return e.toolPermissionContext.alwaysDenyRules;
  }
  function pof(e) {
    return e.toolPermissionContext.alwaysAllowRules;
  }
  function mof(e) {
    return e.toolPermissionContext.additionalWorkingDirectories;
  }
  function fof(e) {
    return e.toolPermissionContext.mode;
  }
  function hof(e) {
    return e.effortValue;
  }
  var f6o;
  var pic;
  var PCt;
  var qur;
  var nBe;
  var ICt;
  var call_export76 = async (e, t, n) => {
    if (li()) {
      logEvent("tengu_background_already_bg", {});
      e();
      Iwe();
      return null;
    }
    if (isTranscriptPersistenceDisabled()) {
      e("Cannot background \u2014 session persistence is disabled, so the forked job would have nothing to resume.");
      return null;
    }
    let r = (n ?? "").trim();
    let o = deriveBackgroundSeed(t.messages, r);
    if (o === null) {
      e("Nothing to background yet \u2014 send a message first.");
      return null;
    }
    return ICt.jsx(cof, {
      onDone: e,
      prompt: r,
      seed: o,
      messages: t.messages,
      isMidTurn: t.isMidTurn ?? false
    });
  };
  var Gur = __lazy(() => {
    at();
    Qen();
    uT();
    b_();
    Ii();
    np();
    EQt();
    et();
    SGe();
    zf();
    ln();
    Ot();
    ho();
    _9();
    hd();
    yd();
    Fp();
    dt();
    U8e();
    lm();
    Rn();
    ro();
    fa();
    Zn();
    iP();
    klr();
    s8t();
    f6o = __toESM(pt(), 1);
    pic = require("crypto");
    PCt = require("fs/promises");
    qur = require("path");
    nBe = __toESM(ot(), 1);
    ICt = __toESM(ie(), 1);
  });
  function gic(e) {
    let t = hic.c(48);
    let {
      items: n,
      onExit: r,
      onCancel: o,
      onBackground: s
    } = e;
    let i;
    if (t[0] !== n.length) {
      i = function (j) {
        logEvent("tengu_exit_background_work_prompt", {
          item_count: n.length,
          chose_exit: j === "exit",
          chose_background: j === "background"
        });
      };
      t[0] = n.length;
      t[1] = i;
    } else {
      i = t[1];
    }
    let a = i;
    let l;
    if (t[2] !== a || t[3] !== s || t[4] !== o || t[5] !== r) {
      l = function (j) {
        switch (a(j), j) {
          case "exit":
            return r();
          case "background":
            return s?.();
          case "stay":
            return o();
        }
      };
      t[2] = a;
      t[3] = s;
      t[4] = o;
      t[5] = r;
      t[6] = l;
    } else {
      l = t[6];
    }
    let c = l;
    let u;
    if (t[7] !== a || t[8] !== o) {
      u = function () {
        a("stay");
        o();
      };
      t[7] = a;
      t[8] = o;
      t[9] = u;
    } else {
      u = t[9];
    }
    let d = u;
    let p = Sr();
    let {
      rows: m
    } = h_(p);
    let f = nE();
    let h;
    if (t[10] !== f || t[11] !== m) {
      h = !f && lre() ? Math.floor(m / 2) : m;
      t[10] = f;
      t[11] = m;
      t[12] = h;
    } else {
      h = t[12];
    }
    let y = Math.max(1, h - (s ? 13 : 12));
    let _;
    let b;
    let S;
    let E;
    let C;
    let x;
    let A;
    let k;
    if (t[13] !== d || t[14] !== n || t[15] !== y) {
      let W = n.slice(0, y);
      b = or;
      A = "Background work is running";
      k = "The following will stop when you exit:";
      S = d;
      _ = gXd;
      E = "column";
      C = 0;
      x = W.map(gof);
      t[13] = d;
      t[14] = n;
      t[15] = y;
      t[16] = _;
      t[17] = b;
      t[18] = S;
      t[19] = E;
      t[20] = C;
      t[21] = x;
      t[22] = A;
      t[23] = k;
    } else {
      _ = t[16];
      b = t[17];
      S = t[18];
      E = t[19];
      C = t[20];
      x = t[21];
      A = t[22];
      k = t[23];
    }
    let I = n.length - y;
    let O;
    if (t[24] !== I) {
      O = SCe.jsx(B1, {
        count: I,
        unit: "item"
      });
      t[24] = I;
      t[25] = O;
    } else {
      O = t[25];
    }
    let M;
    if (t[26] !== _ || t[27] !== O || t[28] !== E || t[29] !== C || t[30] !== x) {
      M = SCe.jsxs(_, {
        flexDirection: E,
        gap: C,
        children: [x, O]
      });
      t[26] = _;
      t[27] = O;
      t[28] = E;
      t[29] = C;
      t[30] = x;
      t[31] = M;
    } else {
      M = t[31];
    }
    let L;
    if (t[32] === Symbol.for("react.memo_cache_sentinel")) {
      L = {
        label: "Exit anyway",
        value: "exit"
      };
      t[32] = L;
    } else {
      L = t[32];
    }
    let P;
    if (t[33] !== s) {
      P = s ? [{
        label: "Move to background and exit",
        value: "background"
      }] : [];
      t[33] = s;
      t[34] = P;
    } else {
      P = t[34];
    }
    let F;
    if (t[35] === Symbol.for("react.memo_cache_sentinel")) {
      F = {
        label: "Stay",
        value: "stay"
      };
      t[35] = F;
    } else {
      F = t[35];
    }
    let H;
    if (t[36] !== P) {
      H = [L, ...P, F];
      t[36] = P;
      t[37] = H;
    } else {
      H = t[37];
    }
    let U;
    if (t[38] !== c || t[39] !== H) {
      U = SCe.jsx(xr, {
        options: H,
        onChange: c
      });
      t[38] = c;
      t[39] = H;
      t[40] = U;
    } else {
      U = t[40];
    }
    let N;
    if (t[41] !== b || t[42] !== S || t[43] !== M || t[44] !== U || t[45] !== A || t[46] !== k) {
      N = SCe.jsxs(b, {
        title: A,
        subtitle: k,
        onCancel: S,
        children: [M, U]
      });
      t[41] = b;
      t[42] = S;
      t[43] = M;
      t[44] = U;
      t[45] = A;
      t[46] = k;
      t[47] = N;
    } else {
      N = t[47];
    }
    return N;
  }
  function gof(e, t) {
    return SCe.jsxs(gXd, {
      flexDirection: "row",
      children: [SCe.jsx(Text, {
        bold: true,
        children: e.label
      }), e.detail ? SCe.jsxs(Text, {
        dimColor: true,
        children: [" \xB7 ", e.detail]
      }) : null]
    }, t);
  }
  var hic;
  var SCe;
  var yic = __lazy(() => {
    rE();
    ki();
    et();
    Ot();
    zp();
    $c();
    Ii();
    YX();
    hic = __toESM(pt(), 1);
    SCe = __toESM(ie(), 1);
  });
  function _6o() {
    fa();
    return __toCommonJS(y5e);
  }
  function yof() {
    _6o().saveWorktreeState(null);
  }
  async function DCt(e) {
    let {
      originalCwd: t,
      preEnterOriginalCwd: n
    } = e;
    let r = t;
    while (true) {
      try {
        process.chdir(r);
        By(r);
        break;
      } catch {
        let s = bic.dirname(r);
        if (s === r) {
          break;
        }
        r = s;
      }
    }
    let o = r !== t;
    if (o) {
      logForDebugging(`Original directory ${t} no longer exists \u2014 returned to ${r} instead`, {
        level: "warn"
      });
    }
    if (!o) {
      setOriginalCwd(n ?? t);
      try {
        await _6o().relocateSessionTranscript();
      } catch (s) {
        Oe(s);
      }
    }
    yof();
    getPlansDirectory.cache.clear?.();
  }
  function Sic(e) {
    let t = _ic.c(29);
    let {
      onDone: n,
      onCancel: r
    } = e;
    let [o, s] = rBe.useState("loading");
    let i;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      i = [];
      t[0] = i;
    } else {
      i = t[0];
    }
    let [a, l] = rBe.useState(i);
    let [c, u] = rBe.useState(0);
    let [d, p] = rBe.useState();
    let m;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      m = getCurrentWorktreeSession();
      t[1] = m;
    } else {
      m = t[1];
    }
    let f = m;
    let h;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      h = _6o().getCurrentSessionTitle(getSessionId());
      t[2] = h;
    } else {
      h = t[2];
    }
    let g = h;
    let y;
    let _;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      y = () => {
        (async function () {
          if (f?.enteredExisting) {
            await keepWorktree();
            await DCt(f);
            p(`Returned to ${f.originalCwd} (worktree at ${f.worktreePath} left in place)`);
            s("done");
            return;
          }
          let V = [];
          let K = f ? await execFileNoThrowWithCwd("git", ["status", "--porcelain"], {
            cwd: f.worktreePath
          }) : {
            stdout: "",
            stderr: "",
            code: 1,
            error: undefined
          };
          if (f && !f.hookBased && K.code !== 0) {
            persistWorktreeSession(null);
            R_e();
            await DCt(f);
            let J = f.tmuxSessionName ? `. Detached tmux session ${f.tmuxSessionName} may still be running \u2014 end it with: tmux kill-session -t ${f.tmuxSessionName}` : "";
            p(`Worktree at ${f.worktreePath} is no longer accessible \u2014 exiting${J}`);
            s("done");
            return;
          }
          if (K.stdout) {
            V = K.stdout.split(`
`).filter(_of);
            l(V);
          }
          if (f) {
            let {
              stdout: J
            } = await execFileNoThrowWithCwd("git", ["rev-list", "--count", `${f.originalHeadCommit}..HEAD`], {
              cwd: f.worktreePath
            });
            let Q = parseInt(J.trim()) || 0;
            if (u(Q), V.length === 0 && Q === 0 && !g) {
              s("removing-clean");
              cleanupWorktree().then(async Z => {
                if (await DCt(f), Z) {
                  logEvent("tengu_worktree_removed", {
                    source: "exit_dialog",
                    commits: 0,
                    changed_files: 0
                  });
                  p("Worktree removed (no changes)");
                } else {
                  p(`Worktree could not be removed \u2014 kept at ${f.worktreePath}`);
                }
                s("done");
              });
              return;
            } else {
              s("asking");
            }
          }
        })();
      };
      _ = [f, g];
      t[3] = y;
      t[4] = _;
    } else {
      y = t[3];
      _ = t[4];
    }
    rBe.useEffect(y, _);
    let b;
    let S;
    if (t[5] !== n || t[6] !== d || t[7] !== o) {
      b = () => {
        if (o === "done") {
          n(d);
        }
      };
      S = [o, n, d];
      t[5] = n;
      t[6] = d;
      t[7] = o;
      t[8] = b;
      t[9] = S;
    } else {
      b = t[8];
      S = t[9];
    }
    if (rBe.useEffect(b, S), !f) {
      n("No active worktree session found", {
        display: "system"
      });
      return null;
    }
    if (o === "loading" || o === "done") {
      return null;
    }
    let E;
    if (t[10] !== a || t[11] !== c) {
      E = async function (z) {
        if (!f) {
          return;
        }
        let V = Boolean(f.tmuxSessionName);
        if (z === "keep" || z === "keep-with-tmux") {
          if (s("keeping"), logEvent("tengu_worktree_kept", {
            commits: c,
            changed_files: a.length
          }), await keepWorktree(), await DCt(f), V) {
            p(`Worktree kept. Your work is saved at ${f.worktreePath} on branch ${f.worktreeBranch}. Reattach to tmux session with: tmux attach -t ${f.tmuxSessionName}`);
          } else {
            p(`Worktree kept. Your work is saved at ${f.worktreePath} on branch ${f.worktreeBranch}`);
          }
          s("done");
        } else if (z === "keep-kill-tmux") {
          if (s("keeping"), logEvent("tengu_worktree_kept", {
            commits: c,
            changed_files: a.length
          }), f.tmuxSessionName) {
            await killTmuxSession(f.tmuxSessionName);
          }
          await keepWorktree();
          await DCt(f);
          p(`Worktree kept at ${f.worktreePath} on branch ${f.worktreeBranch}. Tmux session terminated.`);
          s("done");
        } else if (z === "remove" || z === "remove-with-tmux") {
          if (s("removing"), f.tmuxSessionName) {
            await killTmuxSession(f.tmuxSessionName);
          }
          let K = await cleanupWorktree();
          if (await DCt(f), !K) {
            p(`Worktree could not be removed \u2014 kept at ${f.worktreePath}`);
            s("done");
            return;
          }
          logEvent("tengu_worktree_removed", {
            source: "exit_dialog",
            commits: c,
            changed_files: a.length
          });
          let J = V ? " Tmux session terminated." : "";
          if (c > 0 && a.length > 0) {
            p(`Worktree removed. ${c} ${c === 1 ? "commit" : "commits"} and uncommitted changes were discarded.${J}`);
          } else if (c > 0) {
            p(`Worktree removed. ${c} ${c === 1 ? "commit" : "commits"} on ${f.worktreeBranch} ${c === 1 ? "was" : "were"} discarded.${J}`);
          } else if (a.length > 0) {
            p(`Worktree removed. Uncommitted changes were discarded.${J}`);
          } else {
            p(`Worktree removed.${J}`);
          }
          s("done");
        }
      };
      t[10] = a;
      t[11] = c;
      t[12] = E;
    } else {
      E = t[12];
    }
    let C = E;
    if (o === "keeping") {
      let j;
      if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
        j = rhe.jsxs(gXd, {
          flexDirection: "row",
          marginY: 1,
          children: [rhe.jsx(Ed, {}), rhe.jsx(Text, {
            children: "Keeping worktree\u2026"
          })]
        });
        t[13] = j;
      } else {
        j = t[13];
      }
      return j;
    }
    if (o === "removing-clean" || o === "removing") {
      let j = o === "removing-clean" ? "Cleaning up worktree (no pending changes)\u2026" : "Removing worktree\u2026";
      let z;
      if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
        z = rhe.jsx(Ed, {});
        t[14] = z;
      } else {
        z = t[14];
      }
      let V;
      if (t[15] !== j) {
        V = rhe.jsxs(gXd, {
          flexDirection: "row",
          marginY: 1,
          children: [z, rhe.jsx(Text, {
            children: j
          })]
        });
        t[15] = j;
        t[16] = V;
      } else {
        V = t[16];
      }
      return V;
    }
    let x = f.worktreeBranch;
    let A = a.length > 0;
    let k = c > 0;
    let I;
    if (A && k) {
      I = `You have ${a.length} uncommitted ${a.length === 1 ? "file" : "files"} and ${c} ${c === 1 ? "commit" : "commits"} on ${x}. All will be lost if you remove.`;
    } else if (A) {
      I = `You have ${a.length} uncommitted ${a.length === 1 ? "file" : "files"}. These will be lost if you remove the worktree.`;
    } else if (k) {
      I = `You have ${c} ${c === 1 ? "commit" : "commits"} on ${x}. The branch will be deleted if you remove the worktree.`;
    } else if (g) {
      I = `This session was named "${g}". Keep the worktree to resume it later, or remove it to clean up.`;
    } else {
      I = "You are working in a worktree. Keep it to continue working there, or remove it to clean up.";
    }
    let O;
    if (t[17] !== C || t[18] !== r) {
      O = function () {
        if (r) {
          r();
          return;
        }
        C("keep");
      };
      t[17] = C;
      t[18] = r;
      t[19] = O;
    } else {
      O = t[19];
    }
    let M = O;
    let L = A || k ? "All changes and commits will be lost." : "Clean up the worktree directory.";
    let P = Boolean(f.tmuxSessionName);
    let F;
    if (t[20] !== L) {
      F = P ? [{
        label: "Keep worktree and tmux session",
        value: "keep-with-tmux",
        description: `Stays at ${f.worktreePath}. Reattach with: tmux attach -t ${f.tmuxSessionName}`
      }, {
        label: "Keep worktree, end tmux session",
        value: "keep-kill-tmux",
        description: `Keeps worktree at ${f.worktreePath}, terminates tmux session.`
      }, {
        label: "Remove worktree and tmux session",
        value: "remove-with-tmux",
        description: L
      }] : [{
        label: "Keep worktree",
        value: "keep",
        description: `Stays at ${f.worktreePath}`
      }, {
        label: "Remove worktree",
        value: "remove",
        description: L
      }];
      t[20] = L;
      t[21] = F;
    } else {
      F = t[21];
    }
    let H = F;
    let U = P ? "keep-with-tmux" : "keep";
    let N;
    if (t[22] !== C || t[23] !== H) {
      N = rhe.jsx(xr, {
        defaultFocusValue: U,
        options: H,
        onChange: C
      });
      t[22] = C;
      t[23] = H;
      t[24] = N;
    } else {
      N = t[24];
    }
    let W;
    if (t[25] !== M || t[26] !== I || t[27] !== N) {
      W = rhe.jsx(or, {
        title: "Exiting worktree session",
        subtitle: I,
        onCancel: M,
        children: N
      });
      t[25] = M;
      t[26] = I;
      t[27] = N;
      t[28] = W;
    } else {
      W = t[28];
    }
    return W;
  }
  function _of(e) {
    return e.trim() !== "";
  }
  var _ic;
  var bic;
  var rBe;
  var rhe;
  var Tic = __lazy(() => {
    Ot();
    at();
    et();
    je();
    ji();
    Rn();
    xx();
    U1();
    iP();
    $c();
    Ii();
    cA();
    _ic = __toESM(pt(), 1);
    bic = require("path");
    rBe = __toESM(ot(), 1);
    rhe = __toESM(ie(), 1);
  });
  function Tof() {
    return yWp(Sof) ?? "Goodbye!";
  }
  function zur(e) {
    let t = Eic.c(16);
    let {
      showWorktree: n,
      backgroundItems: r,
      messages: o,
      isMidTurn: s,
      onDone: i,
      onCancel: a
    } = e;
    let [l, c] = vic.useState(false);
    let u;
    if (t[0] !== i) {
      u = async function (m) {
        i(m ?? Tof());
        await gracefulShutdown(0, "prompt_input_exit");
      };
      t[0] = i;
      t[1] = u;
    } else {
      u = t[1];
    }
    let d = u;
    if (n) {
      let p;
      if (t[2] !== a || t[3] !== d) {
        p = Vur.jsx(Sic, {
          onDone: d,
          onCancel: a
        });
        t[2] = a;
        t[3] = d;
        t[4] = p;
      } else {
        p = t[4];
      }
      return p;
    }
    if (l && o) {
      let p = s ?? false;
      let m;
      if (t[5] !== o || t[6] !== p) {
        m = Vur.jsx(BackgroundAndExit, {
          messages: o,
          isMidTurn: p
        });
        t[5] = o;
        t[6] = p;
        t[7] = m;
      } else {
        m = t[7];
      }
      return m;
    }
    if (r.length > 0) {
      let p;
      if (o !== undefined && canBackgroundSession(o)) {
        let g;
        if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
          g = () => c(true);
          t[8] = g;
        } else {
          g = t[8];
        }
        p = g;
      }
      let m;
      if (t[9] !== d) {
        m = () => void d();
        t[9] = d;
        t[10] = m;
      } else {
        m = t[10];
      }
      let f = a ?? Eof;
      let h;
      if (t[11] !== r || t[12] !== p || t[13] !== m || t[14] !== f) {
        h = Vur.jsx(gic, {
          items: r,
          onExit: m,
          onCancel: f,
          onBackground: p
        });
        t[11] = r;
        t[12] = p;
        t[13] = m;
        t[14] = f;
        t[15] = h;
      } else {
        h = t[15];
      }
      return h;
    }
    return null;
  }
  function Eof() {}
  var Eic;
  var vic;
  var Vur;
  var Sof;
  var b6o = __lazy(() => {
    Gur();
    lm();
    yic();
    Tic();
    Eic = __toESM(pt(), 1);
    vic = __toESM(ot(), 1);
    Vur = __toESM(ie(), 1);
    Sof = ["Goodbye!", "See ya!", "Bye!", "Catch you later!"];
  });
  var wic = {};
  __export(wic, {
    call: () => call_export77
  });
  function wof() {
    return yWp(vof) ?? "Goodbye!";
  }
  async function call_export77(e, t) {
    if (li()) {
      e();
      Iwe();
      return null;
    }
    let n = getCurrentWorktreeSession() !== null;
    let r = CVa();
    if (n || r.length > 0) {
      return Cic.jsx(zur, {
        showWorktree: n,
        backgroundItems: r,
        messages: t.messages,
        isMidTurn: t.isMidTurn,
        onDone: e,
        onCancel: () => e()
      });
    }
    e(wof());
    await gracefulShutdown(0, "prompt_input_exit");
    return null;
  }
  var Cic;
  var vof;
  var Ric = __lazy(() => {
    b6o();
    EQt();
    yd();
    U8e();
    lm();
    iP();
    Cic = __toESM(ie(), 1);
    vof = ["Goodbye!", "See ya!", "Bye!", "Catch you later!"];
  });
  var xic = {};
  __export(xic, {
    call: () => call_export78
  });
  async function call_export78() {
    if (li()) {
      return {
        type: "text",
        value: "Session keeps running. Use /stop to end it."
      };
    }
    await gracefulShutdown(0, "prompt_input_exit");
    return {
      type: "skip"
    };
  }
  var kic = __lazy(() => {
    yd();
    lm();
  });
  function Aic() {
    return li() ? "Detach from this background session (it keeps running)" : "Exit the CLI";
  }
  var Kur;
  var xof;
  var Iic;
  function Jur(e) {
    if (e === null || typeof e !== "object") {
      return e;
    }
    let t = e;
    if ("requestId" in t && !("request_id" in t)) {
      t.request_id = t.requestId;
      delete t.requestId;
    }
    if ("response" in t && t.response !== null && typeof t.response === "object") {
      let n = t.response;
      if ("requestId" in n && !("request_id" in n)) {
        n.request_id = n.requestId;
        delete n.requestId;
      }
    }
    return e;
  }
  function TCe(e) {
    if (!Array.isArray(e)) {
      return [];
    }
    return e.filter(t => typeof t === "string" && t.length > 0 && t.length <= 64).slice(0, 32);
  }
  function T6o(e) {
    return e !== null && typeof e === "object" && "type" in e && typeof e.type === "string";
  }
  function kof(e) {
    return e !== null && typeof e === "object" && "type" in e && e.type === "control_response" && "response" in e;
  }
  function Aof(e) {
    return e !== null && typeof e === "object" && "type" in e && e.type === "control_request" && "request_id" in e && "request" in e;
  }
  function E6o(e) {
    if ((e.type === "user" || e.type === "assistant") && e.isVirtual) {
      return false;
    }
    return e.type === "user" || e.type === "assistant" || e.type === "system" && e.subtype === "local_command";
  }
  function Pic(e) {
    if (!qpt(e)) {
      return;
    }
    let t = e.message.content;
    let n;
    if (typeof t === "string") {
      n = t;
    } else {
      for (let o of t) {
        if (o.type === "text") {
          n = o.text;
          break;
        }
      }
    }
    if (!n) {
      return;
    }
    return wtt(n) || undefined;
  }
  function Oic(e, t, n, r, o, s) {
    try {
      let i = Jur(qt(e));
      if (kof(i)) {
        logForDebugging("[bridge:repl] Ingress message type=control_response");
        o?.(i);
        return;
      }
      if (Aof(i)) {
        logForDebugging(`[bridge:repl] Inbound control_request subtype=${i.request.subtype}`);
        s?.(i);
        return;
      }
      if (!T6o(i)) {
        return;
      }
      let a = "uuid" in i && typeof i.uuid === "string" ? i.uuid : undefined;
      if (a && t.vZc(a)) {
        logForDebugging(`[bridge:repl] Ignoring echo: type=${i.type} uuid=${a}`);
        return;
      }
      if (a && n.vZc(a)) {
        logForDebugging(`[bridge:repl] Ignoring re-delivered inbound: type=${i.type} uuid=${a}`);
        return;
      }
      if (logForDebugging(`[bridge:repl] Ingress message type=${i.type}${a ? ` uuid=${a}` : ""}`), i.type === "user") {
        if (a) {
          n.add(a);
        }
        logEvent("tengu_bridge_message_received", {
          is_repl: true
        });
        Pe("bridge_message_receive");
        r?.(i);
      } else {
        logForDebugging(`[bridge:repl] Ignoring non-user inbound message: type=${i.type}`);
      }
    } catch (i) {
      logForDebugging(`[bridge:repl] Failed to parse ingress message: ${he(i)}`);
      Ae("bridge_message_receive", "bridge_message_receive_parse_failed");
    }
  }
  function Dic(e, t) {
    let {
      transport: n,
      sessionId: r,
      outboundOnly: o,
      getInitializeState: s,
      onInterrupt: i,
      onDialogKindsDeclared: a,
      onSetModel: l,
      onSetMaxThinkingTokens: c,
      onSetPermissionMode: u,
      onRenameSession: d,
      onSetColor: p,
      onFileSuggestions: m,
      onReadFile: f,
      onGetContextUsage: h,
      onGetUsage: g,
      onMcpAuthenticate: y,
      onMcpOauthCallbackUrl: _,
      onMcpReconnect: b,
      onMcpStatus: S
    } = t;
    if (!n) {
      logForDebugging("[bridge:repl] Cannot respond to control_request: transport not configured");
      return;
    }
    let E;
    if (o && e.request.subtype !== "initialize") {
      E = {
        type: "control_response",
        response: {
          subtype: "error",
          request_id: e.request_id,
          error: "This session is outbound-only. Enable Remote Control locally to allow inbound control."
        }
      };
      let x = {
        ...E,
        session_id: r
      };
      n.write(x);
      logForDebugging(`[bridge:repl] Rejected ${e.request.subtype} (outbound-only) request_id=${e.request_id}`);
      return;
    }
    switch (e.request.subtype) {
      case "initialize":
        {
          try {
            let x = TCe(e.request.supportedDialogKinds);
            if (x.length > 0) {
              a?.(x);
            }
          } catch (x) {
            logForDebugging(`[bridge:repl] dialog-kind capture failed; acking initialize anyway: ${he(x)}`);
          }
          E = {
            type: "control_response",
            response: {
              subtype: "success",
              request_id: e.request_id,
              response: {
                commands: [],
                agents: [],
                output_style: "normal",
                available_output_styles: ["normal"],
                models: [],
                account: {},
                pid: process.pid,
                ...s?.()
              }
            }
          };
          break;
        }
      case "set_model":
        {
          let x = l?.(e.request.model);
          if (x && !x.ok) {
            E = {
              type: "control_response",
              response: {
                subtype: "error",
                request_id: e.request_id,
                error: x.error
              }
            };
          } else {
            E = {
              type: "control_response",
              response: {
                subtype: "success",
                request_id: e.request_id
              }
            };
          }
          break;
        }
      case "set_max_thinking_tokens":
        c?.(e.request.max_thinking_tokens, e.request.thinking_display);
        E = {
          type: "control_response",
          response: {
            subtype: "success",
            request_id: e.request_id
          }
        };
        break;
      case "set_permission_mode":
        {
          let x = u?.(e.request.mode) ?? {
            ok: false,
            error: "set_permission_mode is not supported in this context (onSetPermissionMode callback not registered)"
          };
          if (x.ok) {
            E = {
              type: "control_response",
              response: {
                subtype: "success",
                request_id: e.request_id
              }
            };
          } else {
            E = {
              type: "control_response",
              response: {
                subtype: "error",
                request_id: e.request_id,
                error: x.error
              }
            };
          }
          break;
        }
      case "rename_session":
        {
          let x = d?.(e.request.title) ?? {
            ok: false,
            error: "rename_session is not supported in this context (onRenameSession callback not registered)"
          };
          if (x.ok) {
            E = {
              type: "control_response",
              response: {
                subtype: "success",
                request_id: e.request_id
              }
            };
          } else {
            E = {
              type: "control_response",
              response: {
                subtype: "error",
                request_id: e.request_id,
                error: x.error
              }
            };
          }
          break;
        }
      case "set_color":
        {
          let x = p?.(e.request.color) ?? {
            ok: false,
            error: "set_color is not supported in this context (onSetColor callback not registered)"
          };
          if (x.ok) {
            E = {
              type: "control_response",
              response: {
                subtype: "success",
                request_id: e.request_id
              }
            };
          } else {
            E = {
              type: "control_response",
              response: {
                subtype: "error",
                request_id: e.request_id,
                error: x.error
              }
            };
          }
          break;
        }
      case "file_suggestions":
        {
          if (!m) {
            E = {
              type: "control_response",
              response: {
                subtype: "error",
                request_id: e.request_id,
                error: "file_suggestions is not supported in this context (onFileSuggestions callback not registered)"
              }
            };
            break;
          }
          m(e.request.query).then(x => ({
            type: "control_response",
            response: {
              subtype: "success",
              request_id: e.request_id,
              response: {
                suggestions: x
              }
            }
          })).catch(x => ({
            type: "control_response",
            response: {
              subtype: "error",
              request_id: e.request_id,
              error: he(x)
            }
          })).then(x => {
            let A = {
              ...x,
              session_id: r
            };
            n.write(A);
            logForDebugging(`[bridge:repl] Sent control_response for file_suggestions request_id=${e.request_id} result=${x.response.subtype}`);
          });
          return;
        }
      case "read_file":
        {
          if (!f) {
            E = {
              type: "control_response",
              response: {
                subtype: "error",
                request_id: e.request_id,
                error: "read_file is not supported in this context (onReadFile callback not registered)"
              }
            };
            break;
          }
          f(e.request.path, e.request.max_bytes, e.request.encoding).then(x => ({
            type: "control_response",
            response: {
              subtype: "success",
              request_id: e.request_id,
              response: x
            }
          })).catch(x => ({
            type: "control_response",
            response: {
              subtype: "error",
              request_id: e.request_id,
              error: he(x)
            }
          })).then(x => {
            let A = {
              ...x,
              session_id: r
            };
            n.write(A);
            logForDebugging(`[bridge:repl] Sent control_response for read_file request_id=${e.request_id} result=${x.response.subtype}`);
          });
          return;
        }
      case "get_context_usage":
        {
          if (!h) {
            E = {
              type: "control_response",
              response: {
                subtype: "error",
                request_id: e.request_id,
                error: "get_context_usage is not supported in this context (onGetContextUsage callback not registered)"
              }
            };
            break;
          }
          h().then(x => ({
            type: "control_response",
            response: {
              subtype: "success",
              request_id: e.request_id,
              response: {
                ...x
              }
            }
          })).catch(x => ({
            type: "control_response",
            response: {
              subtype: "error",
              request_id: e.request_id,
              error: he(x)
            }
          })).then(x => {
            let A = {
              ...x,
              session_id: r
            };
            n.write(A);
            logForDebugging(`[bridge:repl] Sent control_response for get_context_usage request_id=${e.request_id} result=${x.response.subtype}`);
          });
          return;
        }
      case "get_usage":
        {
          if (!g) {
            E = {
              type: "control_response",
              response: {
                subtype: "error",
                request_id: e.request_id,
                error: "get_usage is not supported in this context (onGetUsage callback not registered)"
              }
            };
            break;
          }
          g().then(x => ({
            type: "control_response",
            response: {
              subtype: "success",
              request_id: e.request_id,
              response: {
                ...x
              }
            }
          })).catch(x => ({
            type: "control_response",
            response: {
              subtype: "error",
              request_id: e.request_id,
              error: he(x)
            }
          })).then(x => {
            let A = {
              ...x,
              session_id: r
            };
            n.write(A);
            logForDebugging(`[bridge:repl] Sent control_response for get_usage request_id=${e.request_id} result=${x.response.subtype}`);
          });
          return;
        }
      case "mcp_status":
        E = {
          type: "control_response",
          response: {
            subtype: "success",
            request_id: e.request_id,
            response: {
              mcpServers: S?.() ?? []
            }
          }
        };
        break;
      case "mcp_authenticate":
      case "mcp_oauth_callback_url":
      case "mcp_reconnect":
        {
          let x = e.request;
          let {
            subtype: A,
            serverName: k
          } = x;
          let I = x.subtype === "mcp_authenticate" ? y && (O => y(O, x.redirectUri)) : x.subtype === "mcp_oauth_callback_url" ? _ && (O => _(O, x.callbackUrl)) : b;
          if (!I) {
            E = {
              type: "control_response",
              response: {
                subtype: "error",
                request_id: e.request_id,
                error: `${A} is not supported in this context (callback not registered)`
              }
            };
            break;
          }
          I(k).then(O => ({
            type: "control_response",
            response: {
              subtype: "success",
              request_id: e.request_id,
              response: O ?? {}
            }
          })).catch(O => ({
            type: "control_response",
            response: {
              subtype: "error",
              request_id: e.request_id,
              error: he(O)
            }
          })).then(O => {
            let M = {
              ...O,
              session_id: r
            };
            n.write(M);
            logForDebugging(`[bridge:repl] Sent control_response for ${A} request_id=${e.request_id} result=${O.response.subtype}`);
          });
          return;
        }
      case "interrupt":
        i?.();
        E = {
          type: "control_response",
          response: {
            subtype: "success",
            request_id: e.request_id
          }
        };
        break;
      default:
        E = {
          type: "control_response",
          response: {
            subtype: "error",
            request_id: e.request_id,
            error: `REPL bridge does not handle control_request subtype: ${e.request.subtype}`
          }
        };
    }
    let C = {
      ...E,
      session_id: r
    };
    n.write(C);
    logForDebugging(`[bridge:repl] Sent control_response for ${e.request.subtype} request_id=${e.request_id} result=${E.response.subtype}`);
  }
  function v6o(e) {
    return {
      type: "result",
      subtype: "success",
      duration_ms: 0,
      duration_api_ms: 0,
      is_error: false,
      num_turns: 0,
      result: "",
      stop_reason: null,
      total_cost_usd: 0,
      usage: {
        ...Hb
      },
      modelUsage: {},
      permission_denials: [],
      session_id: e,
      uuid: rtn.randomUUID()
    };
  }
  function Mic(e, t) {
    return {
      type: "system",
      subtype: "worker_shutting_down",
      reason: t,
      session_id: e,
      uuid: rtn.randomUUID()
    };
  }
  function Nic(e, t) {
    return {
      type: "assistant",
      message: {
        id: rtn.randomUUID(),
        container: null,
        model: "<synthetic>",
        role: "assistant",
        stop_details: null,
        stop_reason: "stop_sequence",
        stop_sequence: "",
        type: "message",
        usage: {
          ...Hb
        },
        content: [{
          type: "text",
          text: e,
          citations: null
        }],
        context_management: null
      },
      parent_tool_use_id: null,
      session_id: t,
      uuid: rtn.randomUUID()
    };
  }
  class MCt {
    capacity;
    ring;
    set = new Set();
    writeIdx = 0;
    constructor(e) {
      this.capacity = e;
      this.ring = Array(e);
    }
    add(e) {
      if (this.set.vZc(e)) {
        return;
      }
      let t = this.ring[this.writeIdx];
      if (t !== undefined) {
        this.set.delete(t);
      }
      this.ring[this.writeIdx] = e;
      this.set.add(e);
      this.writeIdx = (this.writeIdx + 1) % this.capacity;
    }
    vZc(e) {
      return this.set.vZc(e);
    }
    clear() {
      this.set.clear();
      this.ring.fill(undefined);
      this.writeIdx = 0;
    }
  }
  var rtn;
  var otn = __lazy(() => {
    ln();
    Ot();
    JLe();
    je();
    Ctt();
    dt();
    S$();
    rtn = require("crypto");
  });
  var Fic = {};
  __export(Fic, {
    resolveLauncher: () => resolveLauncher,
    call: () => call_export79
  });
  async function resolveLauncher() {
    let e = await Qm("claude");
    if (e) {
      return {
        cmd: e,
        prefixArgs: []
      };
    }
    return eH();
  }
  var Lic;
  var call_export79 = async (e, t) => {
    if (li()) {
      logEvent("tengu_update_refused", {
        bg_session: true
      });
      return {
        type: "text",
        value: `This is a background session \u2014 press \u2190 to detach, then run \`claude respawn ${fT()}\` to restart it on the latest build.`
      };
    }
    let n = t.taskRegistry.all();
    if (Object.values(n).some(m => m.status === "running" || m.status === "pending")) {
      logEvent("tengu_update_refused", {
        active_tasks: true
      });
      return {
        type: "text",
        value: "Cannot /update while work is running in the background \u2014 wait for it to finish, then try again."
      };
    }
    let o = getMaterializedSessionFile();
    let s = Lic.join(ty(F9o()), `${getSessionId()}.jsonl`);
    if (o && o !== s) {
      logEvent("tengu_update_refused", {
        transcript_path_drift: true
      });
      return {
        type: "text",
        value: "Cannot /update \u2014 this session was resumed from a different project directory. Restart manually with --resume to continue on the latest version."
      };
    }
    let i = t.messages.findLast(m => isChainParticipant(m) && isLoggableMessage(m))?.uuid;
    if (i) {
      try {
        await persistLeafCheckpoint(i);
      } catch (m) {
        Oe(m);
      }
    }
    let a = isTeammate() ? undefined : t.getAppState().teamContext?.teamName;
    let l = vS();
    let c = l?.bridgeSessionId;
    let u = l?.getLastSequenceNum();
    let d = l?.outboundOnly;
    if (c) {
      t.setAppState(m => m.replBridgeSkipNextArchive ? m : {
        ...m,
        replBridgeSkipNextArchive: true
      });
      l.writeSdkMessages([Nic("Switching to latest Claude Code\u2026 reconnecting", getSessionId())]);
      await withTimeout(l.flush(), 2000, "bridge flush").catch(() => {});
      await l.teardown({
        skipArchive: true
      });
    }
    let p = {};
    if (a) {
      p.CLAUDE_INTERNAL_ASSISTANT_TEAM_NAME = a;
    }
    Object.assign(p, yIe());
    Object.assign(p, iOe(c, u, d) ?? {});
    return Xfe({
      launcher: await resolveLauncher(),
      freshIfNoTranscript: true,
      extraArgs: Qcr(getToolPermissionContext(t), getEffortValue(t)),
      env: Object.keys(p).length > 0 ? p : undefined,
      preSpawn: () => process.stdout.write(_$u.dim(`
Switching from ${{
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION} to latest\u2026 conversation will continue

`))
    });
  };
  var w6o = __lazy(() => {
    at();
    otn();
    x$();
    zf();
    Ot();
    yd();
    Sl();
    Rn();
    oCt();
    D8();
    Sve();
    U9o();
    Fy();
    fa();
    qp();
    Lic = require("path");
  });
  var Oof;
  function Dof(e) {
    let t = Zur.extname(e) === "" ? `${e}.txt` : e;
    let n = getCaps().workspace === "remote" ? getOriginalCwd() : undefined;
    return us(t, n);
  }
  async function edr(e, t) {
    let n = Dof(e);
    await Qur.mkdir(Zur.dirname(n), {
      recursive: true
    });
    await Qur.writeFile(n, t, {
      encoding: "utf-8",
      flush: true
    });
    return n;
  }
  var Qur;
  var Zur;
  var R6o = __lazy(() => {
    at();
    ku();
    Qur = require("fs/promises");
    Zur = require("path");
  });
  function Bic({
    content: e,
    defaultFilename: t,
    onDone: n
  }) {
    let [, r] = oBe.useState(null);
    let [o, s] = oBe.useState(t);
    let [i, a] = oBe.useState(t.length);
    let [l, c] = oBe.useState(false);
    let {
      columns: u
    } = Sr();
    let d = oBe.useCallback(() => {
      c(false);
      r(null);
    }, []);
    let p = async _ => {
      if (_ === "clipboard") {
        let b = await Uk(e);
        if (b) {
          process.stdout.write(b);
        }
        Pe("export_clipboard");
        n({
          success: true,
          message: "Conversation copied to clipboard"
        });
      } else if (_ === "file") {
        r("file");
        c(true);
      }
    };
    let m = async () => {
      try {
        let _ = await edr(o, e);
        Pe("export_file");
        n({
          success: true,
          message: `Conversation exported to: ${_}`
        });
      } catch (_) {
        Ae("export_file", "write_failed");
        n({
          success: false,
          message: `Failed to export conversation: ${_ instanceof Error ? _.message : "Unknown error"}`
        });
      }
    };
    let f = oBe.useCallback(() => {
      if (l) {
        d();
      } else {
        n({
          success: false,
          message: "Export cancelled"
        });
      }
    }, [l, d, n]);
    let h = getCaps().workspace === "remote" && getOriginalCwd() !== Nt();
    let g = [{
      label: "Copy to clipboard",
      value: "clipboard",
      description: "Copy the conversation to your system clipboard"
    }, {
      label: "Save to file",
      value: "file",
      description: h ? "Save the conversation to a file in the directory claude was launched from" : "Save the conversation to a file in the current directory"
    }];
    let y = l ? wK.jsxs(Hn, {
      children: [wK.jsx(xt, {
        chord: "enter",
        action: "save"
      }), wK.jsx(Wr, {
        action: "confirm:no",
        context: "Confirmation",
        fallback: "Esc",
        description: "go back"
      })]
    }) : wK.jsx(Wr, {
      action: "confirm:no",
      context: "Confirmation",
      fallback: "Esc",
      description: "cancel"
    });
    uo("confirm:no", f, {
      context: "Settings",
      isActive: l
    });
    return wK.jsx(or, {
      title: "Export conversation",
      subtitle: "Select export method",
      color: "permission",
      onCancel: f,
      inputGuide: y,
      isCancelActive: !l,
      children: !l ? wK.jsx(xr, {
        options: g,
        onChange: p,
        onCancel: f
      }) : wK.jsxs(gXd, {
        flexDirection: "column",
        children: [wK.jsx(Text, {
          children: "Enter filename:"
        }), wK.jsxs(gXd, {
          flexDirection: "row",
          gap: 1,
          marginTop: 1,
          children: [wK.jsx(Text, {
            children: ">"
          }), wK.jsx(Dl, {
            value: o,
            onChange: s,
            onSubmit: m,
            focus: true,
            showCursor: true,
            columns: u,
            cursorOffset: i,
            onChangeCursorOffset: a
          })]
        })]
      })
    });
  }
  var oBe;
  var wK;
  var $ic = __lazy(() => {
    at();
    R6o();
    ki();
    Tg();
    et();
    Bs();
    ln();
    vo();
    Sd();
    $c();
    Ai();
    Ii();
    bs();
    q_();
    oBe = __toESM(ot(), 1);
    wK = __toESM(ie(), 1);
  });
  function Mof({
    children: e
  }) {
    let {
      bindings: t
    } = ajt(pq);
    let n = NCt.useRef(null);
    let r = NCt.useRef(new Map());
    let o = NCt.useRef(new Set());
    let s = NCt.useRef(new Set()).current;
    let i = NCt.useRef(VLn());
    return itn.jsx(zLn, {
      bindings: t,
      pendingChordRef: n,
      pendingChord: null,
      setPendingChord: () => {},
      activeContexts: s,
      registerActiveContext: () => {},
      unregisterActiveContext: () => {},
      handlerRegistryRef: r,
      preDispatchRef: o,
      keyHandlerRegistry: i.current,
      children: e
    });
  }
  function Nof(e) {
    for (let t of e) {
      if (t.type === "assistant") {
        let n = t.message.model;
        if (n && n !== "<synthetic>") {
          return n;
        }
      }
    }
    return;
  }
  function Lof(e) {
    if (!("message" in e)) {
      return 1;
    }
    let t = e.message.content;
    return Array.isArray(t) ? t.length : 1;
  }
  async function Fof(e, t, n, {
    columns: r,
    verbose: o = false,
    chunkSize: s = 40,
    onProgress: i
  } = {}) {
    let a = Nof(e);
    let l = a ? {
      ...getDefaultAppState(),
      mainLoopModel: a
    } : undefined;
    let c = d => A_t(itn.jsx(AppStateProvider, {
      initialState: l,
      children: itn.jsx(Mof, {
        children: itn.jsx(GYe, {
          messages: e,
          tools: t,
          commands: [],
          verbose: o,
          toolJSX: null,
          inProgressToolUseIDs: new Set(),
          isMessageSelectorVisible: false,
          conversationId: "export",
          screen: "prompt",
          latchAnnouncementSlot: false,
          streamingToolUses: [],
          showAllInTranscript: true,
          isLoading: false,
          renderRange: d,
          disableRenderCap: true
        })
      })
    }), r);
    let u = s;
    for (let d of e) {
      u += Lof(d);
    }
    for (let d = 0; d < u; d += s) {
      let p = await c([d, d + s]);
      if (Li(p).trim() === "") {
        break;
      }
      await n(p);
      i?.(d + s);
    }
  }
  async function tdr(e, t = [], n) {
    let r = [];
    await Fof(e, t, o => void r.push(Li(o)), {
      columns: n
    });
    return r.join("");
  }
  var NCt;
  var itn;
  var x6o = __lazy(() => {
    een();
    yq();
    xre();
    _3();
    j8e();
    I1e();
    NCt = __toESM(ot(), 1);
    itn = __toESM(ie(), 1);
  });
  var qic = {};
  __export(qic, {
    sanitizeFilename: () => sanitizeFilename,
    extractFirstPrompt: () => extractFirstPrompt,
    call: () => call_export80
  });
  function Uof(e) {
    let t = e.getFullYear();
    let n = String(e.getMonth() + 1).padStart(2, "0");
    let r = String(e.getDate()).padStart(2, "0");
    let o = String(e.getHours()).padStart(2, "0");
    let s = String(e.getMinutes()).padStart(2, "0");
    let i = String(e.getSeconds()).padStart(2, "0");
    return `${t}-${n}-${r}-${o}${s}${i}`;
  }
  function extractFirstPrompt(e) {
    let t = e.find(o => o.type === "user");
    if (!t || t.type !== "user") {
      return "";
    }
    let n = t.message?.content;
    let r = "";
    if (typeof n === "string") {
      r = n.trim();
    } else if (Array.isArray(n)) {
      let o = n.find(s => s.type === "text");
      if (o && "text" in o) {
        r = o.text.trim();
      }
    }
    if (r = Ad(r), r.length > 50) {
      r = r.substring(0, 49) + "\u2026";
    }
    return r;
  }
  function sanitizeFilename(e) {
    return e.toLowerCase().replace(/[^a-z0-9\s-]/g, "").replace(/\s+/g, "-").replace(/-+/g, "-").replace(/^-|-$/g, "");
  }
  async function Bof(e) {
    let t = e.options.tools || [];
    return tdr(e.messages, t);
  }
  async function call_export80(e, t, n) {
    let r = await Bof(t);
    let o = n.trim();
    if (o) {
      try {
        let l = await edr(o, r);
        Pe("export_file");
        e(`Conversation exported to: ${l}`);
      } catch (l) {
        Ae("export_file", "write_failed");
        e(`Failed to export conversation: ${l instanceof Error ? l.message : "Unknown error"}`);
      }
      return null;
    }
    let s = extractFirstPrompt(t.messages);
    let i = Uof(new Date());
    let a;
    if (s) {
      let l = sanitizeFilename(s);
      a = l ? `${i}-${l}.txt` : `conversation-${i}.txt`;
    } else {
      a = `conversation-${i}.txt`;
    }
    return Wic.jsx(Bic, {
      content: r,
      defaultFilename: a,
      onDone: l => {
        e(l.message);
      }
    });
  }
  var Wic;
  var Gic = __lazy(() => {
    $ic();
    ln();
    x6o();
    Zn();
    R6o();
    Wic = __toESM(ie(), 1);
  });
  var Hof;
  var Kic = {};
  __export(Kic, {
    call: () => call_export81
  });
  async function call_export81(e, t) {
    let n = e.trim();
    if (!n || ule.includes(n)) {
      let s = t.getAppState();
      return {
        type: "text",
        value: `${Csr(s)}
${zic}`
      };
    }
    if (Q4.includes(n)) {
      return {
        type: "text",
        value: zic
      };
    }
    logEvent("tengu_model_command_inline", {
      args_hash: i3i.createHash("sha256").update(n).digest("hex").slice(0, 12),
      args_length: n.length
    });
    let r = await CQt(n);
    if (!r.ok) {
      return {
        type: "text",
        value: r.message
      };
    }
    if (FZ(r.model)) {
      Et("model_fable_consent", "noninteractive_set_blocked");
      return {
        type: "text",
        value: "Fable 5 uses usage credits and needs a one-time consent \xB7 pick Fable from /model in an interactive session to set it up"
      };
    }
    return {
      type: "text",
      value: wsr(r.model, t.getAppState, t.setAppState, !t.options.isNonInteractiveSession)
    };
  }
  var zic;
  var Yic = __lazy(() => {
    np();
    ln();
    Ot();
    dw();
    Tk();
    Pwe();
    zic = `Usage: /model <name>. Available: ${u_e.join(", ")}, default, or a full model ID.`;
  });
  function LCt(e) {
    let t = Jic.c(23);
    let {
      kind: n,
      model: r,
      effort: o,
      onConfirm: s,
      onCancel: i
    } = e;
    let a = Lo();
    let l = n === "model";
    let c = l ? "Switch model?" : "Change effort level?";
    let u = l ? "model" : "effort level";
    let d;
    if (t[0] !== o || t[1] !== l || t[2] !== r) {
      d = l ? JO(r) : o !== undefined ? Kce(o) : "auto";
      t[0] = o;
      t[1] = l;
      t[2] = r;
      t[3] = d;
    } else {
      d = t[3];
    }
    let p = d;
    let m;
    if (t[4] !== s || t[5] !== a) {
      m = function () {
        a(qof);
        s();
      };
      t[4] = s;
      t[5] = a;
      t[6] = m;
    } else {
      m = t[6];
    }
    let f = m;
    let h;
    if (t[7] !== p) {
      h = fJe.jsx(Text, {
        bold: true,
        children: p
      });
      t[7] = p;
      t[8] = h;
    } else {
      h = t[8];
    }
    let g;
    if (t[9] !== u || t[10] !== h) {
      g = fJe.jsxs(Text, {
        children: ["This conversation is cached for the current ", u, ". Switching to", " ", h, " means the full history gets re-read on your next message."]
      });
      t[9] = u;
      t[10] = h;
      t[11] = g;
    } else {
      g = t[11];
    }
    let y = `Yes, switch to ${p}`;
    let _;
    if (t[12] !== f || t[13] !== i || t[14] !== y) {
      _ = fJe.jsx(mc, {
        confirmLabel: y,
        cancelLabel: "No, go back",
        onConfirm: f,
        onCancel: i
      });
      t[12] = f;
      t[13] = i;
      t[14] = y;
      t[15] = _;
    } else {
      _ = t[15];
    }
    let b;
    if (t[16] !== g || t[17] !== _) {
      b = fJe.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        marginBottom: 1,
        children: [g, _]
      });
      t[16] = g;
      t[17] = _;
      t[18] = b;
    } else {
      b = t[18];
    }
    let S;
    if (t[19] !== i || t[20] !== b || t[21] !== c) {
      S = fJe.jsx(or, {
        title: c,
        subtitle: "Your next response will be slower and use more tokens",
        color: "warning",
        onCancel: i,
        hideInputGuide: true,
        children: b
      });
      t[19] = i;
      t[20] = b;
      t[21] = c;
      t[22] = S;
    } else {
      S = t[22];
    }
    return S;
  }
  function qof(e) {
    return {
      ...e,
      cacheMissAckedAtOutputTokens: getTotalOutputTokens()
    };
  }
  var Jic;
  var fJe;
  var A6o = __lazy(() => {
    at();
    Pwe();
    et();
    ho();
    Fp();
    b_();
    Ii();
    Jic = __toESM(pt(), 1);
    fJe = __toESM(ie(), 1);
  });
  function atn({
    variant: e,
    onDone: t,
    startAtChooseForTesting: n
  }) {
    let [r, o] = sBe.useState(n ? {
      s: "choose",
      blocked: false,
      liveDefinite: true,
      ...n
    } : {
      s: "loading"
    });
    let s = sBe.useRef(null);
    let i = sBe.useRef(null);
    let a = sBe.useRef(false);
    sBe.useEffect(() => {
      if (r.s === "loading") {
        let y = false;
        s.current ??= Promise.all([fpt().catch(() => null), G$n().catch(() => "unknown")]).then(([_, b]) => ({
          balance: _,
          overagesEnabled: b === "enabled" || b === "blocked" || b === "unknown" && TDe(),
          blocked: b === "blocked",
          liveDefinite: b !== "unknown"
        }));
        s.current.then(_ => {
          if (y) {
            return;
          }
          o({
            s: "choose",
            ..._
          });
        });
        return () => {
          y = true;
        };
      }
      if (r.s === "buy-external") {
        let y = false;
        i.current ??= FSt();
        i.current.then(_ => {
          if (y) {
            return;
          }
          Et("model_fable_consent", "overage_enable_deferred");
          t("dismiss", _.type === "message" ? _.value : _.opened ? `Opened ${_.url} in your browser to ${r.needsSetup ? "turn on" : "manage"} usage credits. Once ${r.needsSetup ? "enabled" : "topped up"}, run /model to switch to Fable 5.` : `Visit ${_.url} to ${r.needsSetup ? "turn on" : "manage"} usage credits. Once ${r.needsSetup ? "enabled" : "topped up"}, run /model to switch to Fable 5.`);
        });
        return () => {
          y = true;
        };
      }
    }, [r.s, t]);
    function l() {
      setFableConsentDialogInteracted();
      SDe();
      Pe("model_fable_consent");
      t("consent");
    }
    function c(y, _) {
      if (setFableConsentDialogInteracted(), D7t()) {
        o({
          s: "buy",
          needsSetup: y,
          skipLiveCheck: y && _
        });
      } else {
        o({
          s: "buy-external",
          needsSetup: y
        });
      }
    }
    function u() {
      setFableConsentDialogInteracted();
      o({
        s: "reenabling",
        work: cpo()
      });
    }
    function d() {
      Ae("model_fable_consent", "declined");
      t("switch");
    }
    function p() {
      Et("model_fable_consent", "dismissed");
      t("dismiss");
    }
    let m = getFableDeclineFallbackModel();
    let f = e === "mid-session" && m !== null ? `Switch to ${renderModelName(m)} and continue` : e === "mid-session" ? "Not now" : "No, keep my current model";
    let h = e === "mid-session" && !xde();
    let g = e === "picker" ? "Switch to Fable 5?" : h ? "You've reached your Fable 5 limit" : "Fable 5 now uses usage credits";
    switch (r.s) {
      case "loading":
        return TA.jsx(or, {
          title: g,
          color: "warning",
          onCancel: p,
          children: TA.jsx(Xc, {
            message: "Checking usage credits\u2026"
          })
        });
      case "choose":
        {
          let {
            balance: y,
            overagesEnabled: _,
            blocked: b,
            liveDefinite: S
          } = r;
          let E = y?.amount ?? 0;
          let C = y?.currency ?? "USD";
          let x = !_;
          let A = x && E > 0;
          let k = _ && y === null;
          let I = _ && E > 0;
          let O = !b && (I || k);
          let M = D7t();
          let L = av() ? x ? "Set up usage credits on claude.ai" : "Manage usage credits on claude.ai" : x ? "Request usage credits from your admin" : "Request more from your admin";
          let P = h ? "You've used your included Fable 5 usage for this week. Continuing on Fable 5 uses usage credits" : "Fable 5 runs on usage credits";
          let F = x && !A || k ? `${P}, purchased separately from your plan.` : `${P} \u2014 you have ${Ky(I || A ? E : 0, C)} in credits.`;
          let H = O ? "Continue with Fable 5" : A && M ? "Yes, re-enable and continue" : M ? x ? "Yes, buy usage credits" : "Buy usage credits" : L;
          return TA.jsx(or, {
            title: g,
            color: "warning",
            onCancel: p,
            children: TA.jsxs(gXd, {
              flexDirection: "column",
              gap: 1,
              marginBottom: 1,
              children: [TA.jsx(Text, {
                children: F
              }), A ? TA.jsx(Text, {
                dimColor: true,
                children: "Usage credits are turned off. Re-enable to use Fable 5."
              }) : x ? TA.jsxs(TA.Fragment, {
                children: [TA.jsx(Text, {
                  dimColor: true,
                  children: "You don't have usage credits yet."
                }), M && TA.jsxs(TA.Fragment, {
                  children: [TA.jsxs(Text, {
                    dimColor: true,
                    children: ["Starts with a", " ", Ky(2000, "USD", "whole"), " ", "monthly limit \xB7 run /usage-credits to adjust"]
                  }), TA.jsxs(Text, {
                    dimColor: true,
                    children: ["By continuing, you agree to turn on usage credits per our Help Center: ", "https://support.claude.com/en/articles/12429409-extra-usage-for-paid-claude-plans"]
                  })]
                })]
              }) : TA.jsx(eD, {
                url: "https://support.claude.com/en/articles/12429409-extra-usage-for-paid-claude-plans"
              }), TA.jsx(xr, {
                options: [{
                  label: H,
                  value: "confirm"
                }, {
                  label: f,
                  value: "switch"
                }],
                onChange: U => {
                  if (U === "switch") {
                    return d();
                  }
                  if (O) {
                    return l();
                  }
                  if (A && M) {
                    return u();
                  }
                  return c(x && !A, S);
                },
                onFocus: () => {
                  if (!a.current) {
                    a.current = true;
                    return;
                  }
                  setFableConsentDialogInteracted();
                },
                onCancel: p
              })]
            })
          });
        }
      case "buy":
        return TA.jsx(ExtraUsageDialog, {
          initialStep: "buy_select",
          entryReason: "fable",
          onBeforePurchase: r.needsSetup ? () => cpo({
            skipLiveCheck: r.skipLiveCheck
          }) : undefined,
          onPurchaseSuccess: y => {
            SDe();
            Pe("model_fable_consent");
            t("consent", y);
          },
          onDone: y => {
            if (typeof y === "string") {
              Et("model_fable_consent", "buy_fallback");
              t("dismiss", y);
              return;
            }
            s.current = null;
            o({
              s: "loading"
            });
          }
        });
      case "reenabling":
        return TA.jsx(or, {
          title: g,
          color: "warning",
          onCancel: p,
          children: TA.jsx(PlainAwait, {
            message: "Turning on usage credits\u2026",
            work: r.work,
            onDone: y => {
              if (y) {
                SDe();
                Pe("model_fable_consent");
                t("consent");
              } else {
                Et("model_fable_consent", "reenable_failed");
                t("dismiss", "Couldn't turn on usage credits. Run /usage-credits to try again.");
              }
            }
          })
        });
      case "buy-external":
        return TA.jsx(or, {
          title: g,
          color: "warning",
          onCancel: p,
          children: TA.jsx(Xc, {
            message: r.needsSetup ? "Setting up usage credits\u2026" : "Opening usage credits\u2026"
          })
        });
    }
  }
  var sBe;
  var TA;
  var I6o = __lazy(() => {
    at();
    dMo();
    CQn();
    ypt();
    et();
    ln();
    hpt();
    vF();
    Wve();
    PV();
    Eo();
    $c();
    Ii();
    die();
    Pv();
    sBe = __toESM(ot(), 1);
    TA = __toESM(ie(), 1);
  });
  var tac = {};
  __export(tac, {
    call: () => call_export82
  });
  function Vof({
    hasConversationMessages: e,
    onDone: t
  }) {
    let n = bt(_ => _.mainLoopModel);
    let r = bt(_ => _.mainLoopModelForSession);
    let o = bt(_ => _.fastMode);
    let s = bt(_ => _.effortValue);
    let i = bt(_ => _.cacheMissAckedAtOutputTokens);
    let a = Lo();
    let {
      addNotification: l
    } = Fi();
    let [c, u] = uee.useState(null);
    let [d, p] = uee.useState(null);
    let m = uee.useRef(false);
    function f() {
      logEvent("tengu_model_command_menu", {
        action: "cancel"
      });
      let _ = JO(n);
      t(`Kept model as ${_$u.bold(_)}`, {
        display: "system"
      });
    }
    function h(_, b, S = false) {
      if (!S && njo(_)) {
        p({
          model: _,
          effort: b
        });
        return;
      }
      if (tjo(_, n, r, i)) {
        u({
          model: _,
          effort: b,
          kind: "model"
        });
        return;
      }
      if (b !== undefined && b$t(b, s, vsr(_), i, e)) {
        u({
          model: _,
          effort: b,
          kind: "effort"
        });
        return;
      }
      g(_, b);
    }
    function g(_, b) {
      if (logEvent("tengu_model_command_menu", {
        action: _,
        from_model: n,
        to_model: _
      }), b !== undefined) {
        S$t(b);
      }
      clearRefusalFallbackModelLatch();
      a(x => ({
        ...x,
        mainLoopModel: _,
        mainLoopModelForSession: null,
        ...(b !== undefined && {
          effortValue: b
        })
      }));
      let S = m.current;
      if (m.current = false, S) {
        RQt(_);
      }
      Pe("model_switch");
      eac(_, l);
      let E = `Set model to ${_$u.bold(JO(_))}${S ? " and saved as your default for new sessions" : " for this session only"}`;
      if (b !== undefined) {
        E += ` with ${_$u.bold(b)} effort`;
      }
      let C = undefined;
      if (lc()) {
        if (u0e(), !yh(_) && o) {
          a(x => ({
            ...x,
            fastMode: false
          }));
          C = false;
        } else if (yh(_) && zA() && o) {
          E += " \xB7 Fast mode ON";
          C = true;
        }
      }
      if (KFe(_, C === true, isOpus1mMergeEnabled())) {
        E += " \xB7 Draws from usage credits";
      }
      if (C === false) {
        E += " \xB7 Fast mode OFF";
      }
      if (S) {
        E += QHo(_);
      }
      t(E);
    }
    if (d) {
      let {
        model: _,
        effort: b
      } = d;
      return B5.jsx(atn, {
        variant: "picker",
        onDone: (S, E) => {
          if (p(null), S === "consent") {
            h(_, b, true);
            return;
          }
          m.current = false;
          t(E ?? `Kept model as ${_$u.bold(JO(n))}`, {
            display: "system"
          });
        }
      });
    }
    if (c) {
      return B5.jsx(LCt, {
        kind: c.kind,
        model: c.model,
        effort: c.effort,
        onConfirm: () => g(c.model, c.effort),
        onCancel: () => {
          u(null);
          m.current = false;
        }
      });
    }
    return B5.jsx(nUe, {
      initial: n,
      sessionModel: r,
      onSelect: h,
      onSetDefault: _ => {
        m.current = true;
      },
      onCancel: f,
      isStandaloneCommand: true,
      skipSettingsWrite: true,
      showFastModeNotice: lc() && o && yh(n) && zA()
    });
  }
  function zof(e) {
    let t = O6o.c(24);
    let {
      onDone: n
    } = e;
    let r = bt(Kof);
    let [o, s] = uee.useState(null);
    let [i, a] = uee.useState(null);
    let l;
    let c;
    if (t[0] !== n) {
      l = () => {
        let y = Ul();
        if (!y) {
          n("Model picker shows local options in cloud sessions \u2014 pass a model name, e.g. /model sonnet", {
            display: "system"
          });
          return;
        }
        let _ = false;
        y.sendControlRequest({
          subtype: "list_models"
        }).then(b => {
          if (_) {
            return;
          }
          let S = b.models.map(nha);
          logEvent("tengu_remote_model_picker", {
            outcome: "opened",
            model_count: S.length
          });
          s(S);
        }).catch(b => {
          if (_) {
            return;
          }
          logEvent("tengu_remote_model_picker", {
            outcome: b instanceof Lwe ? "timeout" : "fallback"
          });
          n("Couldn\u2019t load the model list from the cloud session \u2014 pass a model name, e.g. /model sonnet", {
            display: "system"
          });
        });
        return () => {
          _ = true;
        };
      };
      c = [n];
      t[0] = n;
      t[1] = l;
      t[2] = c;
    } else {
      l = t[1];
      c = t[2];
    }
    if (uee.useEffect(l, c), i !== null) {
      let y;
      if (t[3] !== n || t[4] !== i) {
        y = B5.jsx(Zic, {
          args: i,
          onDone: n
        });
        t[3] = n;
        t[4] = i;
        t[5] = y;
      } else {
        y = t[5];
      }
      return y;
    }
    if (o === null) {
      let y;
      if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
        y = B5.jsx(Text, {
          dimColor: true,
          children: "Loading models from the cloud session\u2026"
        });
        t[6] = y;
      } else {
        y = t[6];
      }
      return y;
    }
    let u;
    if (t[7] !== r || t[8] !== o) {
      let y;
      if (t[10] !== r) {
        y = _ => _.value === r;
        t[10] = r;
        t[11] = y;
      } else {
        y = t[11];
      }
      u = o.find(y);
      t[7] = r;
      t[8] = o;
      t[9] = u;
    } else {
      u = t[9];
    }
    let d = u;
    let p;
    if (t[12] !== d || t[13] !== r || t[14] !== o) {
      p = d ? d.value : Gof(r === null ? [] : o.filter(y => y.value !== null && ca(r).includes(ca(y.value)) && Xic(r) === Xic(y.value)));
      t[12] = d;
      t[13] = r;
      t[14] = o;
      t[15] = p;
    } else {
      p = t[15];
    }
    let m = p;
    let f;
    if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
      f = y => a(y ?? "default");
      t[16] = f;
    } else {
      f = t[16];
    }
    let h;
    if (t[17] !== r || t[18] !== n) {
      h = () => {
        logEvent("tengu_model_command_menu", {
          action: "cancel"
        });
        n(r === null ? "Kept the workspace\u2019s current model" : `Kept model as ${_$u.bold(JO(r))}`, {
          display: "system"
        });
      };
      t[17] = r;
      t[18] = n;
      t[19] = h;
    } else {
      h = t[19];
    }
    let g;
    if (t[20] !== m || t[21] !== o || t[22] !== h) {
      g = B5.jsx(nUe, {
        initial: m,
        options: o,
        headerText: "Models reported by the cloud session. Your pick applies to that session.",
        onSelect: f,
        onCancel: h,
        isStandaloneCommand: true,
        skipSettingsWrite: true
      });
      t[20] = m;
      t[21] = o;
      t[22] = h;
      t[23] = g;
    } else {
      g = t[23];
    }
    return g;
  }
  function Kof(e) {
    return e.mainLoopModel;
  }
  function Zic(e) {
    let t = O6o.c(29);
    let {
      args: n,
      onDone: r
    } = e;
    let o = Ec();
    let s = Lo();
    let {
      addNotification: i
    } = Fi();
    let [a, l] = uee.useState(null);
    let [c, u] = uee.useState(null);
    let d;
    if (t[0] !== i || t[1] !== r || t[2] !== s || t[3] !== o) {
      d = y => {
        let _ = !va();
        let b = wsr(y, () => o.getState(), s, _);
        eac(y, i);
        r(b);
      };
      t[0] = i;
      t[1] = r;
      t[2] = s;
      t[3] = o;
      t[4] = d;
    } else {
      d = t[4];
    }
    let p = d;
    let m;
    if (t[5] !== p || t[6] !== o) {
      m = y => {
        let _ = o.getState();
        if (tjo(y, _.mainLoopModel, _.mainLoopModelForSession, _.cacheMissAckedAtOutputTokens)) {
          l({
            model: y
          });
          return;
        }
        p(y);
      };
      t[5] = p;
      t[6] = o;
      t[7] = m;
    } else {
      m = t[7];
    }
    let f = m;
    let h;
    let g;
    if (t[8] !== n || t[9] !== r || t[10] !== f || t[11] !== s) {
      h = () => {
        let y = Ul();
        if (y && c_()) {
          CQt(n).then(_ => {
            if (!_.ok) {
              r(_.message, {
                display: "system"
              });
              return;
            }
            if (FZ(_.model)) {
              Et("model_fable_consent", "remote_thin_client_blocked");
              r("Fable 5 uses usage credits, and this cloud session can\u2019t show the consent prompt yet \xB7 switch models from the workspace, or consent once in a local session first", {
                display: "system"
              });
              return;
            }
            let b = n === "default" ? null : n;
            return y.sendControlRequest({
              subtype: "set_model",
              model: b ?? undefined
            }).then(() => {
              s(S => ({
                ...S,
                mainLoopModel: b,
                mainLoopModelForSession: null
              }));
              Pe("model_switch");
              r(b === null ? "Reset model to the workspace default" : `Set model to ${_$u.bold(JO(b))}`);
            }).catch(S => {
              logForDebugging(`[remote] set_model rejected: ${he(S)}`);
              let E = S instanceof Lwe;
              Ae("model_switch", E ? "timeout" : "remote_rejected");
              r(E ? `No response from the cloud session \u2014 the switch to ${n} may still have been applied` : `Cloud session couldn't switch to ${n}`, {
                display: "system"
              });
            });
          });
          return;
        }
        CQt(n).then(_ => {
          if (!_.ok) {
            r(_.message, {
              display: "system"
            });
            return;
          }
          if (njo(_.model)) {
            u({
              model: _.model
            });
            return;
          }
          f(_.model);
        });
      };
      g = [n, r, s, f];
      t[8] = n;
      t[9] = r;
      t[10] = f;
      t[11] = s;
      t[12] = h;
      t[13] = g;
    } else {
      h = t[12];
      g = t[13];
    }
    if (uee.useEffect(h, g), c) {
      let {
        model: y
      } = c;
      let _;
      if (t[14] !== y || t[15] !== r || t[16] !== f || t[17] !== o) {
        _ = B5.jsx(atn, {
          variant: "picker",
          onDone: (b, S) => {
            if (u(null), b === "consent") {
              f(y);
              return;
            }
            r(S ?? `Kept model as ${_$u.bold(JO(o.getState().mainLoopModel))}`, {
              display: "system"
            });
          }
        });
        t[14] = y;
        t[15] = r;
        t[16] = f;
        t[17] = o;
        t[18] = _;
      } else {
        _ = t[18];
      }
      return _;
    }
    if (a) {
      let y;
      if (t[19] !== p || t[20] !== a.model) {
        y = () => p(a.model);
        t[19] = p;
        t[20] = a.model;
        t[21] = y;
      } else {
        y = t[21];
      }
      let _;
      if (t[22] !== r || t[23] !== o) {
        _ = () => r(`Kept model as ${_$u.bold(JO(o.getState().mainLoopModel))}`, {
          display: "system"
        });
        t[22] = r;
        t[23] = o;
        t[24] = _;
      } else {
        _ = t[24];
      }
      let b;
      if (t[25] !== a.model || t[26] !== y || t[27] !== _) {
        b = B5.jsx(LCt, {
          kind: "model",
          model: a.model,
          effort: undefined,
          onConfirm: y,
          onCancel: _
        });
        t[25] = a.model;
        t[26] = y;
        t[27] = _;
        t[28] = b;
      } else {
        b = t[28];
      }
      return b;
    }
    return null;
  }
  function eac(e, t) {
    let n = $Cn(e);
    if (!n) {
      return;
    }
    t({
      key: "model-deprecation-warning",
      kind: "warning",
      text: n,
      color: "warning",
      priority: "immediate",
      invalidates: ["model-deprecation-warning"]
    });
  }
  function Yof(e) {
    let {
      onDone: t
    } = e;
    let n = bt(Qof);
    let r = bt(Xof);
    let o = bt(Jof);
    t(Csr({
      mainLoopModel: n,
      mainLoopModelForSession: r,
      effortValue: o
    }, _$u.bold));
    return null;
  }
  function Jof(e) {
    return e.effortValue;
  }
  function Xof(e) {
    return e.mainLoopModelForSession;
  }
  function Qof(e) {
    return e.mainLoopModel;
  }
  var O6o;
  var uee;
  var B5;
  var Xic = e => ca(e) !== e;
  var Gof = e => e.reduce((t, n) => t === null || (n.value?.length ?? 0) > (t.value?.length ?? 0) ? n : t, null)?.value ?? null;
  var call_export82 = async (e, t, n) => {
    if (n = n?.trim() || "", ule.includes(n)) {
      logEvent("tengu_model_command_inline_help", {
        args: n
      });
      return B5.jsx(Yof, {
        onDone: e
      });
    }
    if (Q4.includes(n)) {
      e("Run /model to open the model selection menu, or /model [modelName] to set the model.", {
        display: "system"
      });
      return;
    }
    if (n) {
      logEvent("tengu_model_command_inline", {
        args_hash: i3i.createHash("sha256").update(n).digest("hex").slice(0, 12),
        args_length: n.length
      });
      return B5.jsx(Zic, {
        args: n,
        onDone: e
      });
    }
    if (Ul()) {
      if (LD("modelCatalog") && c_()) {
        return B5.jsx(zof, {
          onDone: e
        });
      }
      e("Model picker shows local options in cloud sessions \u2014 pass a model name, e.g. /model sonnet", {
        display: "system"
      });
      return;
    }
    return B5.jsx(Vof, {
      onDone: e,
      hasConversationMessages: t.messages.length > 0
    });
  };
  var nac = __lazy(() => {
    at();
    A6o();
    I6o();
    Lsr();
    np();
    Nd();
    et();
    KQt();
    ru();
    ln();
    Ot();
    ho();
    je();
    Fp();
    dt();
    dw();
    wQt();
    GT();
    Tk();
    nst();
    Eo();
    STe();
    Pwe();
    O6o = __toESM(pt(), 1);
    uee = __toESM(ot(), 1);
    B5 = __toESM(ie(), 1);
  });
  var rac;
  var D6o;
  var oac = __lazy(() => {
    rur();
    Eo();
    rac = {
      type: "local",
      name: "model",
      supportsNonInteractive: true,
      description: "Set the AI model for Claude Code",
      argumentHint: "<model>",
      load: () => Promise.resolve().then(() => (Yic(), Kic))
    };
    D6o = {
      type: "local-jsx",
      name: "model",
      get description() {
        return `Set the AI model for Claude Code (currently ${renderModelName(getMainLoopModel())})`;
      },
      argumentHint: "[model]",
      get immediate() {
        return uCt();
      },
      requires: {
        ink: true
      },
      thinClientDispatch: "control-request",
      load: () => Promise.resolve().then(() => (nac(), tac))
    };
  });
  async function sac() {
    let [e, t] = await Promise.allSettled([Koe(), v8a()]);
    let n = e.status === "rejected" ? he(e.reason) : null;
    let r = e.status === "fulfilled" ? e.value : [];
    let o = t.status === "fulfilled" ? t.value : [];
    let s = [...r, ...o];
    let a = getInitialSettings()?.remote?.defaultEnvironmentId;
    if (s.length === 0) {
      return {
        availableTargets: [],
        selectedTarget: null,
        selectedTargetSource: null,
        environmentsError: n
      };
    }
    let l = r.find(u => u.kind !== "bridge") ?? o[0] ?? s[0];
    let c = null;
    if (a) {
      let u = s.find(d => $Ee(d) === a);
      if (u) {
        l = u;
        for (let d = bC.length - 1; d >= 0; d--) {
          let p = bC[d];
          if (!p || p === "flagSettings") {
            continue;
          }
          if (getSettingsForSource(p)?.remote?.defaultEnvironmentId === a) {
            c = p;
            break;
          }
        }
      }
    }
    return {
      availableTargets: s,
      selectedTarget: l,
      selectedTargetSource: c,
      environmentsError: n
    };
  }
  var iac = __lazy(() => {
    dt();
    nf();
    Ppe();
    Ppe();
  });
  function uac(e) {
    let t = M6o.c(28);
    let {
      onDone: n
    } = e;
    let [r, o] = ECe.useState("loading");
    let s;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      s = [];
      t[0] = s;
    } else {
      s = t[0];
    }
    let [i, a] = ECe.useState(s);
    let [l, c] = ECe.useState(null);
    let [u, d] = ECe.useState(null);
    let [p, m] = ECe.useState(null);
    let [f, h] = ECe.useState(null);
    let g;
    let y;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      g = () => {
        let E = false;
        (async function () {
          try {
            let A = await sac();
            if (E) {
              return;
            }
            a(A.availableTargets);
            c(A.selectedTarget);
            d(A.selectedTargetSource);
            m(A.environmentsError);
            o(null);
          } catch (A) {
            let k = A;
            if (E) {
              return;
            }
            let I = sr(k);
            logForDebugging(`Failed to fetch remote environments: ${I.message}`, {
              level: "error"
            });
            h(I.message);
            o(null);
          }
        })();
        return () => {
          E = true;
        };
      };
      y = [];
      t[1] = g;
      t[2] = y;
    } else {
      g = t[1];
      y = t[2];
    }
    ECe.useEffect(g, y);
    let _;
    if (t[3] !== n || t[4] !== i) {
      _ = function (C) {
        if (C === "cancel") {
          n();
          return;
        }
        o("updating");
        let x = i.find(k => $Ee(k) === C);
        if (!x) {
          n("Error: Selected environment not found");
          return;
        }
        updateSettingsForSource("localSettings", {
          remote: {
            defaultEnvironmentId: $Ee(x)
          }
        });
        n(`Set default ${"remote environment"} to ${_$u.bold(x.name)} (${$Ee(x)})`);
      };
      t[3] = n;
      t[4] = i;
      t[5] = _;
    } else {
      _ = t[5];
    }
    let b = _;
    if (r === "loading") {
      let E;
      if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
        E = EA.jsx(Xc, {
          message: "Loading environments\u2026"
        });
        t[6] = E;
      } else {
        E = t[6];
      }
      let C;
      if (t[7] !== n) {
        C = EA.jsx(or, {
          title: "Select remote environment",
          onCancel: n,
          hideInputGuide: true,
          children: E
        });
        t[7] = n;
        t[8] = C;
      } else {
        C = t[8];
      }
      return C;
    }
    if (f) {
      let E;
      if (t[9] !== f) {
        E = EA.jsxs(Text, {
          color: "error",
          children: ["Error: ", f]
        });
        t[9] = f;
        t[10] = E;
      } else {
        E = t[10];
      }
      let C;
      if (t[11] !== n || t[12] !== E) {
        C = EA.jsx(or, {
          title: "Select remote environment",
          onCancel: n,
          children: E
        });
        t[11] = n;
        t[12] = E;
        t[13] = C;
      } else {
        C = t[13];
      }
      return C;
    }
    if (!l) {
      let E;
      if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
        E = EA.jsx(Text, {
          children: "No remote environments available."
        });
        t[14] = E;
      } else {
        E = t[14];
      }
      let C;
      if (t[15] !== p) {
        C = p && EA.jsxs(Text, {
          dimColor: true,
          children: ["(couldn't list environments: ", p, ")"]
        });
        t[15] = p;
        t[16] = C;
      } else {
        C = t[16];
      }
      let x;
      if (t[17] !== n || t[18] !== C) {
        x = EA.jsxs(or, {
          title: "Select remote environment",
          subtitle: "Configure environments at: https://claude.ai/code",
          onCancel: n,
          children: [E, C]
        });
        t[17] = n;
        t[18] = C;
        t[19] = x;
      } else {
        x = t[19];
      }
      return x;
    }
    let S;
    if (t[20] !== p || t[21] !== b || t[22] !== r || t[23] !== n || t[24] !== l || t[25] !== u || t[26] !== i) {
      S = EA.jsx(esf, {
        targets: i,
        selectedTarget: l,
        selectedTargetSource: u,
        environmentsError: p,
        loadingState: r,
        onSelect: b,
        onCancel: n
      });
      t[20] = p;
      t[21] = b;
      t[22] = r;
      t[23] = n;
      t[24] = l;
      t[25] = u;
      t[26] = i;
      t[27] = S;
    } else {
      S = t[27];
    }
    return S;
  }
  function aac(e) {
    let t = $Ee(e);
    let n = "";
    return {
      label: EA.jsxs(Text, {
        children: [e.name, " ", EA.jsxs(Text, {
          dimColor: true,
          children: ["(", t, "", ")"]
        })]
      }),
      value: t
    };
  }
  function esf(e) {
    let t = M6o.c(24);
    let {
      targets: n,
      selectedTarget: r,
      selectedTargetSource: o,
      environmentsError: s,
      loadingState: i,
      onSelect: a,
      onCancel: l
    } = e;
    let c;
    if (t[0] !== o) {
      c = o && o !== "localSettings" ? ` (from ${cY(o)} settings)` : "";
      t[0] = o;
      t[1] = c;
    } else {
      c = t[1];
    }
    let u = c;
    let d;
    if (t[2] !== r || t[3] !== o || t[4] !== u) {
      d = o ? EA.jsxs(Text, {
        children: ["Currently using: ", EA.jsx(Text, {
          bold: true,
          children: r.name
        }), u]
      }) : undefined;
      t[2] = r;
      t[3] = o;
      t[4] = u;
      t[5] = d;
    } else {
      d = t[5];
    }
    let p = d;
    let m;
    let f;
    if (t[6] !== n) {
      m = n.filter(tsf);
      let E = n.filter(S5n);
      f = [...m.map(aac), ...[], ...E.map(aac)];
      t[6] = n;
      t[7] = m;
      t[8] = f;
    } else {
      m = t[7];
      f = t[8];
    }
    let h = f;
    let g;
    if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
      g = EA.jsx(Text, {
        dimColor: true,
        children: "Configure environments at: https://claude.ai/code"
      });
      t[9] = g;
    } else {
      g = t[9];
    }
    let y;
    if (t[10] !== s || t[11] !== m) {
      y = s && m.length === 0 && EA.jsxs(Text, {
        dimColor: true,
        children: ["(couldn't list environments: ", s, ")"]
      });
      t[10] = s;
      t[11] = m;
      t[12] = y;
    } else {
      y = t[12];
    }
    let _;
    if (t[13] !== i || t[14] !== a || t[15] !== h || t[16] !== r) {
      _ = i === "updating" ? EA.jsx(Xc, {
        message: "Updating\u2026"
      }) : EA.jsx(xr, {
        options: h,
        defaultValue: $Ee(r),
        onChange: a,
        onCancel: () => a("cancel"),
        layout: "compact-vertical"
      });
      t[13] = i;
      t[14] = a;
      t[15] = h;
      t[16] = r;
      t[17] = _;
    } else {
      _ = t[17];
    }
    let b;
    if (t[18] === Symbol.for("react.memo_cache_sentinel")) {
      b = EA.jsx(Text, {
        dimColor: true,
        children: EA.jsxs(Hn, {
          children: [EA.jsx(xt, {
            chord: "enter",
            action: "select"
          }), EA.jsx(Wr, {
            action: "confirm:no",
            context: "Confirmation",
            fallback: "Esc",
            description: "cancel"
          })]
        })
      });
      t[18] = b;
    } else {
      b = t[18];
    }
    let S;
    if (t[19] !== l || t[20] !== p || t[21] !== y || t[22] !== _) {
      S = EA.jsxs(or, {
        title: "Select remote environment",
        subtitle: p,
        onCancel: l,
        hideInputGuide: true,
        children: [g, y, _, b]
      });
      t[19] = l;
      t[20] = p;
      t[21] = y;
      t[22] = _;
      t[23] = S;
    } else {
      S = t[23];
    }
    return S;
  }
  function tsf(e) {
    return !S5n(e);
  }
  var M6o;
  var ECe;
  var EA;
  var dac = __lazy(() => {
    et();
    je();
    dt();
    nf();
    Zn();
    iac();
    Sd();
    $c();
    Ai();
    Ii();
    bs();
    Pv();
    M6o = __toESM(pt(), 1);
    ECe = __toESM(ot(), 1);
    EA = __toESM(ie(), 1);
  });
  var pac = {};
  __export(pac, {
    call: () => call_export83
  });
  async function call_export83(e) {
    return mac.jsx(uac, {
      onDone: e
    });
  }
  var mac;
  var fac = __lazy(() => {
    dac();
    mac = __toESM(ie(), 1);
  });
  var hac;
  var gac = __lazy(() => {
    Kc();
    no();
    hac = {
      type: "local-jsx",
      name: "remote-env",
      description: "Choose the default environment for cloud agents",
      isEnabled: () => isClaudeAISubscriber() && isPolicyAllowed("allow_remote_sessions"),
      get isHidden() {
        return !isClaudeAISubscriber() || !isPolicyAllowed("allow_remote_sessions");
      },
      load: () => Promise.resolve().then(() => (fac(), pac))
    };
  });
  var N6o = {};