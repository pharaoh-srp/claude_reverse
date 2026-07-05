  __export(Z2l, {
    call: () => call_export6
  });
  function k2m(e) {
    let t = Q2l.c(7);
    let {
      message: n,
      args: r,
      onDone: o
    } = e;
    useTimeout(o, 0);
    let s;
    if (t[0] !== r) {
      s = kwe.jsxs(Text, {
        dimColor: true,
        children: [vGd.pointer, " /add-dir ", r]
      });
      t[0] = r;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i;
    if (t[2] !== n) {
      i = kwe.jsx(Vn, {
        children: kwe.jsx(Text, {
          children: n
        })
      });
      t[2] = n;
      t[3] = i;
    } else {
      i = t[3];
    }
    let a;
    if (t[4] !== s || t[5] !== i) {
      a = kwe.jsxs(gXd, {
        flexDirection: "column",
        children: [s, i]
      });
      t[4] = s;
      t[5] = i;
      t[6] = a;
    } else {
      a = t[6];
    }
    return a;
  }
  async function call_export6(e, t, n) {
    let r = (n ?? "").trim();
    let o = getToolPermissionContext(t);
    let s = async (a, l = false) => {
      let u = {
        type: "addDirectories",
        directories: [a],
        destination: l ? "localSettings" : "session"
      };
      t.setToolPermissionContext(f => $y(f, u));
      let d = getAdditionalDirectoriesForClaudeMd();
      if (!d.includes(a)) {
        setAdditionalDirectoriesForClaudeMd([...d, a]);
        clearCommandsCache();
        clearAgentDefinitionsCache();
        resetSentSkillNames();
        g$.emit();
      }
      SandboxManager.refreshConfig();
      recordSessionAlias(a);
      Pea("--add-dir", a);
      let p;
      if (l) {
        try {
          Zde(u);
          p = `Added ${_$u.bold(a)} as a working directory and saved to local settings`;
        } catch (f) {
          p = `Added ${_$u.bold(a)} as a working directory. Failed to save to local settings: ${f instanceof Error ? f.message : "Unknown error"}`;
        }
      } else {
        p = `Added ${_$u.bold(a)} as a working directory for this session`;
      }
      let m = `${p} ${_$u.dim("\xB7 /permissions to manage")}`;
      e(m);
    };
    if (!r) {
      return kwe.jsx(Ujt, {
        permissionContext: o,
        onAddDirectory: s,
        onCancel: () => {
          e("Did not add a working directory.");
        }
      });
    }
    let i = await Ict(r, o);
    if (i.resultType !== "success") {
      let a = Pct(i);
      return kwe.jsx(k2m, {
        message: a,
        args: n ?? "",
        onDone: () => e(a)
      });
    }
    return kwe.jsx(Ujt, {
      directoryPath: i.absolutePath,
      permissionContext: o,
      onAddDirectory: s,
      onCancel: () => {
        e(`Did not add ${_$u.bold(i.absolutePath)} as a working directory.`);
      }
    });
  }
  var Q2l;
  var kwe;
  var e$l = __lazy(() => {
    at();
    Bm();
    Wl();
    joo();
    et();
    zf();
    kS();
    rR();
    Sl();
    Zk();
    Th();
    fa();
    ODe();
    R1n();
    Q2l = __toESM(pt(), 1);
    kwe = __toESM(ie(), 1);
  });
  var I2m;
  async function i$l(e, t, n) {
    let r;
    let o;
    o = e === "stop" || e === "off";
    r = {
      freeformPrompt: e
    };
    return O2m(r, t, n);
  }
  async function O2m(e, t, {
    signal: n,
    onProgress: r
  }) {
    logEvent("tengu_autofix_pr_started", {
      action: "start",
      has_pr_number: String(e.prNumber !== undefined),
      has_repo_path: String(e.repoPath !== undefined),
      has_repo_ref: String(e.repoRef !== undefined)
    });
    let {
      prNumber: o,
      target: s,
      freeformPrompt: i,
      repoPath: a,
      repoRef: l
    } = e;
    let c = e.skills ?? [];
    try {
      let u = a ?? Nt();
      let [d, p, m, f] = l ? [undefined, undefined, await Dme({
        cwd: u
      }), false] : await Promise.all([getBranch(u), getDefaultBranch(u), Dme({
        cwd: u
      }), hasUnpushedCommits(u)]);
      if (o === undefined && !l && d === p) {
        return yfe(`cannot run on the default branch (${p}). This checks the branch of ${u} \u2014 check out a feature branch there first (or run Claude Code from your worktree).`, "on_default_branch");
      }
      if (!m.eligible) {
        let j = m.errors.map(Ese).join(`
`);
        return yfe(`can't start autofix \u2014
${j}`, "not_eligible");
      }
      let h;
      if (l) {
        h = "remote_session";
      } else {
        let j = !a || findGitRoot(a) === findGitRoot(Nt());
        h = "remote_session";
      }
      let g = ["pr", "view"];
      if (o !== undefined) {
        g.push(String(o));
      }
      if (l) {
        g.push("-R", o$l(l));
      }
      g.push("--json", "number,state,url,headRefName");
      let {
        stdout: y,
        code: _,
        error: b
      } = await execFileNoThrowWithCwd("gh", g, {
        timeout: 1e4,
        preserveOutputOnError: true,
        abortSignal: n,
        cwd: u
      });
      if (n.aborted) {
        return Xor();
      }
      if (_ !== 0 || !y.trim()) {
        if (b?.includes("ENOENT")) {
          return yfe("gh CLI is required but not found.", "gh_not_found");
        }
        if (b) {
          return yfe(`gh pr view failed: ${b}`, "gh_failed");
        }
        return yfe(o !== undefined ? `couldn't find PR #${o}${l ? ` in ${o$l(l)}` : " in this repo"}.` : `no open PR found for branch "${d}"${a ? ` in ${a}` : ""}. Create a PR first, then retry.`, "no_open_pr");
      }
      let S;
      let E;
      let C;
      let x;
      let A;
      try {
        let j = qt(y);
        if (j.state === "MERGED" || j.state === "CLOSED") {
          return yfe(`PR #${j.number} is ${j.state.toLowerCase()}. Autofix requires an open PR.`, "pr_not_open");
        }
        let z = j.url.match(/\/([^/]+)\/([^/]+)\/pull\//);
        if (!z || !z[1] || !z[2]) {
          return yfe(`unexpected PR URL format: ${j.url}`, "bad_pr_url");
        }
        S = j.number;
        E = z[1];
        C = z[2];
        x = j.url;
        A = o === undefined && d ? d : j.headRefName;
      } catch {
        return yfe(`no open PR found for branch "${d}"${a ? ` in ${a}` : ""}. Create a PR first, then retry.`, "no_open_pr");
      }
      let k = `${E}/${C}`;
      let I = `${k}#${S}`;
      r?.({
        step: "checking",
        prInfo: {
          ref: I,
          url: x
        }
      });
      let O = c.length > 0 ? ` Run ${c.join(" and ")} for custom instructions on how to autofix.` : "";
      if (h === "current_session") {
        let j = await D2m(I, k, S, O);
        let z = [];
        if (f) {
          z.push("WARNING: You have unpushed local commits, run git push so the PR reflects them");
        }
        if (getIsNonInteractiveSession()) {
          z.push("Note: this is a non-interactive session \u2014 the poll cron only fires while this process stays alive. For one-shot `-p` runs, use `remote` instead.");
        }
        logEvent("tengu_autofix_pr_result", {
          result: "success_current_session"
        });
        return z.length > 0 && j.kind === "ok" ? {
          ...j,
          message: `${j.message}

${z.join(`
`)}`
        } : j;
      }
      let M = i || `You're monitoring PR #${S} in ${k}. When CI failures or review comments arrive as notifications, investigate and push fixes directly to the PR branch.${O} Start by checking the current PR status.`;
      let L = Object.values(t.taskRegistry.all()).find(j => j.type === "remote_agent" && j.remoteTaskType === "autofix-pr" && j.status === "running" && j.remoteTaskMetadata?.owner === E && j.remoteTaskMetadata?.repo === C && j.remoteTaskMetadata?.prNumber === S);
      if (L?.type === "remote_agent") {
        logEvent("tengu_autofix_pr_result", {
          result: "success"
        });
        return {
          kind: "ok",
          message: `Already monitoring ${I} in a cloud session
  ${vGd.arrowRight} ${wS(L.sessionId, undefined, {
            from: "cli"
          })}`
        };
      }
      r?.({
        step: "spawning"
      });
      let P;
      let F = await teleportToRemote({
        initialMessage: M,
        source: "autofix_pr",
        branchName: A,
        reuseOutcomeBranch: A,
        title: `Autofix PR: ${E}/${C}#${S} (${A})`,
        useDefaultEnvironment: true,
        signal: n,
        githubPr: {
          owner: E,
          repo: C,
          number: S
        },
        cwd: u,
        sourceUrl: l ? `https://${l.host}/${l.owner}/${l.repo}` : undefined,
        onBundleFail: j => {
          P = j;
        }
      });
      if (n.aborted) {
        if (F) {
          archiveRemoteSession(F.id);
        }
        return Xor();
      }
      if (!F) {
        return yfe(P ?? "cloud session creation failed.", "session_create_failed");
      }
      r?.({
        step: "subscribing"
      });
      let H = await subscribeRemoteSessionToPR(F.id, `${E}/${C}`, S);
      if (n.aborted) {
        archiveRemoteSession(F.id);
        return Xor();
      }
      Ave({
        remoteTaskType: "autofix-pr",
        session: {
          id: F.id,
          title: F.title
        },
        command: M,
        isLongRunning: true,
        remoteTaskMetadata: {
          owner: E,
          repo: C,
          prNumber: S
        },
        context: {
          abortController: new AbortController(),
          taskRegistry: t.taskRegistry
        }
      });
      let U = wS(F.id, undefined, {
        from: "cli"
      });
      let N = [];
      if (!H.ok) {
        N.push(H.reason === "github_app_not_installed" ? `Autofix is on, but webhook events won't arrive until the Claude GitHub app is installed on ${E}/${C}: ${"https://github.com/apps/claude/installations/new"}` : "WARNING: Failed to turn on autofix for this PR");
      }
      if (!l) {
        if (f) {
          N.push("WARNING: You have unpushed local commits, run git push so the cloud session sees them");
        }
      }
      let W = N.length > 0 ? `

` + N.join(`
`) : "";
      logEvent("tengu_autofix_pr_result", {
        result: "success"
      });
      return {
        kind: "ok",
        message: `Spawned cloud autofix PR session on ${A} (PR #${S})
  ${vGd.arrowRight} ${U}${W}`
      };
    } catch (u) {
      if (n.aborted) {
        return Xor();
      }
      return yfe(he(u), "exception");
    }
  }
  function yfe(e, t) {
    logEvent("tengu_autofix_pr_result", {
      result: "failed",
      error_code: t
    });
    return {
      kind: "error",
      message: `Autofix PR failed: ${e}`,
      code: t
    };
  }
  function Xor() {
    logEvent("tengu_autofix_pr_result", {
      result: "cancelled"
    });
    return {
      kind: "cancelled"
    };
  }
  async function D2m(e, t, n, r) {
    let o = vS();
    let s = isReplBridgeActive() && !!o;
    let i = s && o ? await o.subscribePR(t, n) : {
      ok: false
    };
    let a = `${"Babysit PR "}${e} (created in this session). Check state with \`gh pr view ${n} -R ${t} --json state,mergeable,mergeStateStatus,statusCheckRollup\` and new review comments with \`gh api --paginate repos/${t}/pulls/${n}/comments\`. If MERGED or CLOSED, delete this cron with ${"CronDelete"} and report the outcome. If CI is failing, comments are unaddressed, or there are merge conflicts, fix and push.${r} Otherwise nothing to do \u2014 complete the turn without commentary.`;
    let c = (await yde()).some(d => d.durable === false && d.prompt.startsWith(`${"Babysit PR "}${e} `));
    if (!c) {
      await Ldt("*/30 * * * *", a, true, false);
      setScheduledTasksEnabled(true);
    }
    let u = [`Monitoring ${e} in this session.`];
    if (i.ok) {
      u.push("Webhook events (CI failures, reviews, close/reopen) will arrive as user messages.");
    } else if (s) {
      u.push(i.reason === "github_app_not_installed" ? `Webhook events won't arrive until the Claude GitHub app is installed on this repo. Install it at ${"https://github.com/apps/claude/installations/new"}, then retry \u2014 falling back to a 30-minute poll for now.` : "Couldn't subscribe this session to PR webhooks \u2014 falling back to a 30-minute poll. Check the debug log for [bridge] subscribe-pr.");
    } else {
      u.push("Remote Control isn't connected, so webhooks can't be routed here \u2014 falling back to a 30-minute poll. Connect from the mobile or web app for real-time notifications.");
    }
    u.push(c ? "A poll cron for this PR is already registered." : "Registered a 30-minute poll cron as a backstop for merge conflicts (and CI/reviews when webhooks are unavailable).");
    return {
      kind: "ok",
      display: "system",
      message: u.join(" ")
    };
  }
  function o$l({
    owner: e,
    repo: t,
    host: n
  }) {
    return ef(n) ? `${e}/${t}` : `${n}/${e}/${t}`;
  }
  var s$l;
  var a$l = __lazy(() => {
    at();
    x$();
    U6t();
    Ot();
    tZ();
    OG();
    vV();
    vo();
    dt();
    ji();
    na();
    fk();
    FM();
    s$l = {
      checking: "Detecting open PR for current branch\u2026",
      spawning: "Spawning cloud autofix session\u2026",
      subscribing: "Turning on autofix\u2026"
    };
  });
  var l$l = {};
  __export(l$l, {
    call: () => call_export7
  });
  function N2m(e) {
    let t = Y$o.c(16);
    let {
      onDone: n,
      context: r,
      args: o
    } = e;
    let s = false;
    let i;
    if (t[0] !== false) {
      i = () => !getGlobalConfig().hasSeenAutofixPrChatOpsNotice;
      t[0] = false;
      t[1] = i;
    } else {
      i = t[1];
    }
    let [a, l] = DZ.useState(i);
    if (!a) {
      let h;
      if (t[2] !== o || t[3] !== r || t[4] !== n) {
        h = aP.jsx(F2m, {
          onDone: n,
          context: r,
          args: o
        });
        t[2] = o;
        t[3] = r;
        t[4] = n;
        t[5] = h;
      } else {
        h = t[5];
      }
      return h;
    }
    let c;
    if (t[6] !== n) {
      c = () => n("Autofix PR cancelled", {
        display: "system"
      });
      t[6] = n;
      t[7] = c;
    } else {
      c = t[7];
    }
    let u;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      u = aP.jsx(xt, {
        chord: "escape",
        action: "cancel"
      });
      t[8] = u;
    } else {
      u = t[8];
    }
    let d;
    if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
      d = aP.jsx(Text, {
        children: "Auto-fix monitors the PR and can post comments on your behalf using your GitHub identity."
      });
      t[9] = d;
    } else {
      d = t[9];
    }
    let p;
    if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
      p = [{
        value: "continue",
        label: "Continue",
        description: "start monitoring this PR"
      }, {
        value: "cancel",
        label: "Not now"
      }];
      t[10] = p;
    } else {
      p = t[10];
    }
    let m;
    if (t[11] !== n) {
      m = aP.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [d, aP.jsx(xr, {
          options: p,
          onChange: h => {
            if (h === "continue") {
              saveGlobalConfig(L2m);
              l(false);
            } else {
              n("Autofix PR cancelled", {
                display: "system"
              });
            }
          },
          onCancel: () => n("Autofix PR cancelled", {
            display: "system"
          })
        })]
      });
      t[11] = n;
      t[12] = m;
    } else {
      m = t[12];
    }
    let f;
    if (t[13] !== c || t[14] !== m) {
      f = aP.jsx(or, {
        title: "Autofix PR",
        subtitle: "Before you start",
        onCancel: c,
        inputGuide: u,
        children: m
      });
      t[13] = c;
      t[14] = m;
      t[15] = f;
    } else {
      f = t[15];
    }
    return f;
  }
  function L2m(e) {
    return e.hasSeenAutofixPrChatOpsNotice ? e : {
      ...e,
      hasSeenAutofixPrChatOpsNotice: true
    };
  }
  function F2m(e) {
    let t = Y$o.c(30);
    let {
      onDone: n,
      context: r,
      args: o
    } = e;
    let [s, i] = DZ.useState("checking");
    let [a, l] = DZ.useState(null);
    let [c, u] = DZ.useState(null);
    let [d, p] = DZ.useState(false);
    let m = DZ.useRef(null);
    let f = DZ.useRef(false);
    let h = DZ.useRef(false);
    let g;
    if (t[0] !== n) {
      g = function (...L) {
        let P = L;
        if (h.current) {
          return;
        }
        h.current = true;
        n(...P);
      };
      t[0] = n;
      t[1] = g;
    } else {
      g = t[1];
    }
    let y = g;
    let _;
    if (t[2] !== o || t[3] !== r || t[4] !== y) {
      _ = () => {
        let M = createAbortController();
        m.current = M;
        i$l(o, r, {
          signal: M.signal,
          onProgress: L => {
            if (i(L.step), L.prInfo) {
              l(L.prInfo);
            }
          }
        }).then(L => {
          if (M.signal.aborted && !f.current) {
            return;
          }
          switch (L.kind) {
            case "ok":
              {
                y(L.message, {
                  display: L.display
                });
                return;
              }
            case "error":
              {
                if (f.current) {
                  y("Autofix PR cancelled");
                } else {
                  u(L.message);
                }
                return;
              }
            case "cancelled":
              {
                y("Autofix PR cancelled");
                return;
              }
          }
        }).catch(L => {
          y(`Autofix PR failed: ${L instanceof Error ? L.message : String(L)}`);
        });
        return () => {
          M.abort();
        };
      };
      t[2] = o;
      t[3] = r;
      t[4] = y;
      t[5] = _;
    } else {
      _ = t[5];
    }
    let b;
    if (t[6] !== o || t[7] !== r || t[8] !== n) {
      b = [n, r, o];
      t[6] = o;
      t[7] = r;
      t[8] = n;
      t[9] = b;
    } else {
      b = t[9];
    }
    DZ.useEffect(_, b);
    let S;
    if (t[10] !== y || t[11] !== c) {
      S = function () {
        if (c) {
          y(c);
          return;
        }
        if (f.current) {
          y("Autofix PR cancelled");
          return;
        }
        f.current = true;
        p(true);
        m.current?.abort();
      };
      t[10] = y;
      t[11] = c;
      t[12] = S;
    } else {
      S = t[12];
    }
    let E = S;
    let C;
    if (t[13] !== y || t[14] !== c) {
      C = {
        "confirm:yes": () => {
          if (c) {
            y(c);
          }
        }
      };
      t[13] = y;
      t[14] = c;
      t[15] = C;
    } else {
      C = t[15];
    }
    let x = c !== null;
    let A;
    if (t[16] !== x) {
      A = {
        context: "Confirmation",
        isActive: x
      };
      t[16] = x;
      t[17] = A;
    } else {
      A = t[17];
    }
    jo(C, A);
    let k;
    if (t[18] !== d || t[19] !== c) {
      k = c ? aP.jsx(xt, {
        chord: ["escape", "enter"],
        action: "close"
      }) : d ? aP.jsx(xt, {
        chord: "escape",
        action: "dismiss now"
      }) : aP.jsx(xt, {
        chord: "escape",
        action: "cancel"
      });
      t[18] = d;
      t[19] = c;
      t[20] = k;
    } else {
      k = t[20];
    }
    let I;
    if (t[21] !== d || t[22] !== c || t[23] !== a || t[24] !== s) {
      I = aP.jsx(gXd, {
        flexDirection: "column",
        gap: 1,
        children: c ? aP.jsx(Hc, {
          error: c
        }) : aP.jsxs(aP.Fragment, {
          children: [aP.jsx(Xc, {
            message: d ? "Cancelling\u2026" : s$l[s]
          }), a && aP.jsxs(Text, {
            dimColor: true,
            children: ["PR: ", aP.jsx(Link, {
              url: a.url,
              children: a.ref
            })]
          })]
        })
      });
      t[21] = d;
      t[22] = c;
      t[23] = a;
      t[24] = s;
      t[25] = I;
    } else {
      I = t[25];
    }
    let O;
    if (t[26] !== E || t[27] !== k || t[28] !== I) {
      O = aP.jsx(or, {
        title: "Autofix PR",
        subtitle: "Monitor and autofix any issues with the current PR",
        onCancel: E,
        inputGuide: k,
        children: I
      });
      t[26] = E;
      t[27] = k;
      t[28] = I;
      t[29] = O;
    } else {
      O = t[29];
    }
    return O;
  }
  var Y$o;
  var DZ;
  var aP;
  var call_export7 = async (e, t, n) => aP.jsx(N2m, {
    onDone: e,
    context: t,
    args: n.trim()
  });
  var c$l = __lazy(() => {
    $c();
    Ii();
    bv();
    bs();
    Pv();
    _ue();
    et();
    Bs();
    Kp();
    a$l();
    Y$o = __toESM(pt(), 1);
    DZ = __toESM(ot(), 1);
    aP = __toESM(ie(), 1);
  });
  function u$l() {
    return isClaudeAISubscriber() && isPolicyAllowed("allow_remote_sessions");
  }
  var U2m;
  function B2m({
    children: e,
    ref: t,
    stickyScroll: n,
    followGrowth: r,
    ...o
  }) {
    let s = WFe.useRef(null);
    let [, i] = WFe.useState(0);
    let a = WFe.useRef(new Set());
    let l = WFe.useRef(false);
    let c = () => {
      for (let d of a.current) {
        d();
      }
    };
    function u(d) {
      if (markScrollActivity(), d1(d), bVi(), c(), l.current) {
        return;
      }
      l.current = true;
      queueMicrotask(() => {
        l.current = false;
        K8i(d);
      });
    }
    WFe.useImperativeHandle(t, () => ({
      scrollTo(d, p) {
        let m = s.current;
        if (!m) {
          return;
        }
        if (m.stickyScroll = false, !p?.preserveHwm) {
          m.scrollHeightHwm = undefined;
        }
        m.pendingScrollDelta = undefined;
        m.scrollAnchor = undefined;
        m.scrollTop = Math.max(0, Math.floor(d));
        u(m);
      },
      scrollToElement(d, p = 0) {
        let m = s.current;
        if (!m) {
          return;
        }
        m.stickyScroll = false;
        m.scrollHeightHwm = undefined;
        m.pendingScrollDelta = undefined;
        m.scrollAnchor = {
          el: d,
          offset: p
        };
        u(m);
      },
      scrollBy(d) {
        let p = s.current;
        if (!p) {
          return;
        }
        p.stickyScroll = false;
        p.scrollHeightHwm = undefined;
        p.scrollAnchor = undefined;
        p.pendingScrollDelta = (p.pendingScrollDelta ?? 0) + Math.floor(d);
        u(p);
      },
      scrollToBottom() {
        let d = s.current;
        if (!d) {
          return;
        }
        if (d.pendingScrollDelta = undefined, n === false) {
          d.scrollAnchor = undefined;
          d.scrollTop = Math.max(0, (d.scrollHeight ?? 0) - (d.scrollViewportHeight ?? 0));
          u(d);
          return;
        }
        d.stickyScroll = true;
        d1(d);
        c();
        i(p => p + 1);
      },
      getScrollTop() {
        return s.current?.scrollTop ?? 0;
      },
      getPendingDelta() {
        return s.current?.pendingScrollDelta ?? 0;
      },
      getScrollHeight() {
        return s.current?.scrollHeight ?? 0;
      },
      getFreshScrollHeight() {
        return s.current?.childNodes[0]?.yogaNode?.getComputedHeight() ?? s.current?.scrollHeight ?? 0;
      },
      getViewportHeight() {
        return s.current?.scrollViewportHeight ?? 0;
      },
      getViewportTop() {
        return s.current?.scrollViewportTop ?? 0;
      },
      isSticky() {
        let d = s.current;
        if (!d) {
          return false;
        }
        return d.stickyScroll ?? Boolean(d.attributes.stickyScroll);
      },
      subscribe(d) {
        a.current.add(d);
        return () => a.current.delete(d);
      },
      setClampBounds(d, p) {
        let m = s.current;
        if (!m) {
          return;
        }
        m.scrollClampMin = d;
        m.scrollClampMax = p;
      },
      getDomElement() {
        return s.current;
      }
    }), [n]);
    return J$o.jsx("ink-box", {
      ref: d => {
        if (s.current = d, d) {
          d.scrollTop ??= 0;
        }
      },
      style: {
        flexWrap: "nowrap",
        flexDirection: o.flexDirection ?? "row",
        flexGrow: o.flexGrow ?? 0,
        flexShrink: o.flexShrink ?? 1,
        selectionScope: true,
        ...o,
        overflowX: "scroll",
        overflowY: "scroll"
      },
      ...(n !== undefined && {
        stickyScroll: n
      }),
      ...(r !== undefined && {
        followGrowth: r
      }),
      children: J$o.jsx(oJd, {
        flexDirection: "column",
        flexGrow: 1,
        flexShrink: 0,
        width: "100%",
        children: e
      })
    });
  }
  var WFe;
  var J$o;
  var h$l = {};
  __export(h$l, {
    runSideQuestion: () => runSideQuestion,
    resetBtwHistory: () => resetBtwHistory,
    getBtwHistory: () => getBtwHistory,
    findBtwTriggerPositions: () => findBtwTriggerPositions,
    createBtwHistoryState: () => createBtwHistoryState,
    clearBtwHistory: () => clearBtwHistory,
    appendBtwHistory: () => appendBtwHistory,
    _setGlobalBtwHistoryStateForTesting: () => _setGlobalBtwHistoryStateForTesting
  });
  function findBtwTriggerPositions(e) {
    let t = [];
    let n = e.matchAll($2m);
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
  function createBtwHistoryState() {
    return {
      history: []
    };
  }
  function _setGlobalBtwHistoryStateForTesting(e) {
    j7e = e;
  }
  function getBtwHistory() {
    return j7e.history;
  }
  function clearBtwHistory() {
    j7e.history = [];
  }
  function resetBtwHistory(e) {
    j7e.history = e;
  }
  function appendBtwHistory(e, t) {
    j7e.history = [...j7e.history, {
      question: e,
      response: t
    }].slice(-20);
  }
  async function runSideQuestion({
    question: e,
    cacheSafeParams: t,
    parentController: n,
    onRetry: r,
    threadHistory: o = true
  }) {
    let s = `<system-reminder>This is a side question from the user. You must answer this question directly in a single response.

IMPORTANT CONTEXT:
- You are a separate, lightweight agent spawned to answer this one question
- The main agent is NOT interrupted - it continues working independently in the background
- You share the conversation context but are a completely separate instance
- Do NOT reference being interrupted or what you were "previously doing" - that framing is incorrect

CRITICAL CONSTRAINTS:
- You have NO tools available - you cannot read files, run commands, search, or take any actions
- This is a one-off response - there will be no follow-up turns
- You can ONLY provide information based on what you already know from the conversation context
- NEVER say things like "Let me try...", "I'll now...", "Let me check...", or promise to take any action
- If you don't know the answer, say so - do not offer to look it up or investigate

Simply answer the question with the information you have.</system-reminder>

${e}`;
    let i = n ? createChildAbortController(n) : createAbortController();
    let a = o ? j7e.history.flatMap(l => [In({
      content: l.question
    }), ST({
      content: l.response
    })]) : [];
    try {
      let l = await runForkedAgent({
        promptMessages: [...a, In({
          content: s
        })],
        cacheSafeParams: t,
        canUseTool: async () => ({
          behavior: "deny",
          message: "Side questions cannot use tools",
          decisionReason: {
            type: "other",
            reason: "side_question"
          }
        }),
        querySource: "side_question",
        forkLabel: "side_question",
        maxTurns: 1,
        skipCacheWrite: true,
        skipTranscript: true,
        overrides: {
          abortController: i
        },
        onMessage: r ? d => {
          if (f$l(d)) {
            r({
              retryAttempt: d.retryAttempt,
              maxRetries: d.maxRetries,
              retryInMs: d.retryInMs,
              status: d.error.status
            });
          }
        } : undefined
      });
      let {
        response: c,
        synthetic: u
      } = W2m(l.messages);
      if (o && c && !u) {
        appendBtwHistory(e, c);
      }
      return {
        response: c,
        synthetic: u,
        usage: l.totalUsage
      };
    } catch (l) {
      if (l instanceof _f || i.signal.aborted) {
        return {
          response: null,
          synthetic: false,
          usage: Hb,
          aborted: true
        };
      }
      throw l;
    }
  }
  function W2m(e) {
    let t = e.flatMap(r => r.type === "assistant" ? r.message.content : []);
    if (t.length > 0) {
      let r = Tl(t, `

`).trim();
      if (r) {
        return {
          response: r,
          synthetic: false
        };
      }
      let o = t.find(s => s.type === "tool_use");
      if (o) {
        return {
          response: `(The model tried to call ${"name" in o ? o.name : "a tool"} instead of answering directly. Try rephrasing or ask in the main conversation.)`,
          synthetic: true
        };
      }
    }
    let n = e.find(f$l);
    if (n) {
      return {
        response: `(API error: ${n.error.formatted})`,
        synthetic: true
      };
    }
    return {
      response: null,
      synthetic: false
    };
  }
  function f$l(e) {
    return e.type === "system" && "subtype" in e && e.subtype === "api_error";
  }
  var $2m;
  var j7e;
  var tQt = __lazy(() => {
    CN();
    JLe();
    Kp();
    CO();
    ro();
    $2m = /^\/btw\b/gi;
    j7e = createBtwHistoryState();
  });
  var y$l = {};
  __export(y$l, {
    spawnForkFromDirective: () => spawnForkFromDirective,
    deriveForkName: () => deriveForkName
  });
  async function spawnForkFromDirective(e, t, n, r) {
    if (eR()) {
      Ae("subagent_launch", "subagent_fork_coordinator_mode");
      return null;
    }
    let o = t.renderedSystemPrompt;
    if (!o) {
      if (o = await G2m(t), !o) {
        Ae("subagent_launch", "subagent_fork_prompt_missing");
        return null;
      }
    }
    let s = {
      kind: "fork",
      log: (() => {
        let y = t.agentId ?? "main";
        let _ = t.getReplContexts()[y]?.replayLog;
        if (_) {
          return [..._];
        }
        if (t.replHydration?.kind === "resume") {
          return anr(t.messages);
        }
        return [];
      })()
    };
    let i = deriveForkName(e);
    let a = e.replace(/\s+/g, " ").trim();
    let l = a.length > 50 ? a.slice(0, 49) + "\u2026" : a;
    let c = vN(i);
    let {
      taskRegistry: u
    } = t;
    let d = Date.now();
    let p = PW(t.agentContext) + 1;
    let m = bgt({
      agentId: c,
      ownerAgentId: mainAgentId(),
      spawnDepth: p,
      description: l,
      prompt: e,
      selectedAgent: FORK_AGENT,
      taskRegistry: u,
      toolUseId: t.toolUseId
    });
    let f = m.abortController;
    t.agentLifecycle.registerName(i, c);
    let h = {
      prompt: e,
      resolvedAgentModel: vse(FORK_AGENT.model, t.options.mainLoopModel, undefined, getToolPermissionContext(t).mode),
      isBuiltInAgent: true,
      startTime: d,
      agentType: FORK_AGENT.agentType,
      isAsync: true,
      agentDepth: p,
      source: FORK_AGENT.source
    };
    let g = {
      agentId: c,
      parentAgentId: t.agentId,
      depth: p,
      parentSessionId: getParentSessionId_export(),
      agentType: "subagent",
      subagentName: FORK_AGENT.agentType,
      displayName: i,
      isAsync: true,
      isBuiltIn: true,
      invocationKind: "spawn",
      invocationEmitted: false
    };
    p8(g, () => dKe({
      taskId: m.agentId,
      abortController: f,
      makeStream: (y, _) => I3({
        onQueryProgress: _,
        agentDefinition: FORK_AGENT,
        promptMessages: [...(r ?? []), In({
          content: [{
            type: "text",
            text: buildChildMessage(e)
          }]
        })],
        toolUseContext: t,
        canUseTool: n,
        isAsync: true,
        querySource: zDe(FORK_AGENT.agentType, true),
        spawnedBySkill: t.options.spawnedBySkill ?? t.options.activeSkill,
        model: undefined,
        override: {
          systemPrompt: o,
          agentId: m.agentId,
          agentContext: g,
          abortController: f,
          replHydration: s
        },
        availableTools: t.options.tools,
        forkContextMessages: t.messages,
        useExactTools: true,
        onCacheSafeParams: y,
        description: l,
        name: i
      }),
      metadata: h,
      description: l,
      toolUseContext: t,
      taskRegistry: u,
      agentIdForCleanup: c,
      enableSummarization: true,
      getWorktreeResult: async () => ({})
    }));
    Pe("subagent_launch");
    return {
      agentId: c,
      name: i
    };
  }
  async function G2m(e) {
    let t = e.getAppState();
    let n = t.agent ? t.agentDefinitions.activeAgents.find(s => s.agentType === t.agent) : undefined;
    let r = Array.from(getToolPermissionContext(e).additionalWorkingDirectories.keys());
    let o = await GO(e.options.tools, e.options.mainLoopModel, r);
    return J9({
      mainThreadAgentDefinition: n,
      toolUseContext: e,
      customSystemPrompt: e.options.customSystemPrompt,
      defaultSystemPrompt: o,
      appendSystemPrompt: e.options.appendSystemPrompt
    });
  }
  function deriveForkName(e) {
    return e.trim().split(/\s+/).slice(0, 3).join("-").toLowerCase().replace(/[^a-z0-9-]/g, "").replace(/-+/g, "-").replace(/^-|-$/g, "").slice(0, 24) || "fork";
  }
  var tHo = __lazy(() => {
    at();
    dz();
    RV();
    ln();
    ry();
    D_();
    _h();
    Sl();
    ro();
    Bbt();
    lmt();
    Nze();
    qp();
    GL();
    ZC();
    lUo();
    $ve();
    iDe();
    Uve();
  });
  var rHo = {};
  __export(rHo, {
    deriveFirstPrompt: () => deriveFirstPrompt,
    createFork: () => createFork,
    call: () => call_export8,
    branchAndResume: () => branchAndResume
  });
  function deriveFirstPrompt(e) {
    let t = {
      commandFallback: ""
    };
    let n;
    for (let r of e) {
      if (n = rje(r, t), n !== undefined) {
        break;
      }
    }
    n ??= t.commandFallback;
    return n.replace(/\s+/g, " ").trim().slice(0, 100).trimEnd() || "Branched conversation";
  }
  async function createFork(e, t, n) {
    let r = _$l.randomUUID();
    let o = getSessionId();
    let s = ty(getOriginalCwd());
    let i = getTranscriptPathForSession(r);
    let a = getMaterializedSessionFile() ?? wh();
    await esr.mkdir(s, {
      recursive: true,
      mode: 448
    });
    let l;
    try {
      l = Zor.createReadStream(a, {
        encoding: "utf8"
      });
      await nHo.once(l, "open");
    } catch (E) {
      if (fn(E)) {
        throw Error("No conversation to branch");
      }
      throw Oe(E), E;
    }
    let c = Zor.createWriteStream(i, {
      encoding: "utf8",
      mode: 384
    });
    let u = null;
    c.on("error", E => {
      u = sr(E);
    });
    let d = b$l.createInterface({
      input: l,
      crlfDelay: 1 / 0
    });
    let p = new Set(e.map(E => E.uuid));
    let m = new Map();
    let f = [];
    let h;
    let g = async () => {
      c.destroy();
      await esr.unlink(i).catch(() => {});
    };
    let y = async E => {
      if (u) {
        throw await g(), u;
      }
      if (!c.write(E)) {
        await nHo.once(c, "drain").catch(() => {});
      }
    };
    try {
      for await (let E of d) {
        if (E.length === 0) {
          continue;
        }
        let C;
        try {
          C = qt(E);
        } catch {
          continue;
        }
        if (C.type === "content-replacement" && C.sessionId === o) {
          f.push(...C.replacements);
          continue;
        }
        if (C.type === "relocated" && C.sessionId === o && C.relocatedCwd) {
          h = C.relocatedCwd;
          continue;
        }
        if (!isTranscriptMessage(C) || C.isSidechain || !p.vZc(C.uuid)) {
          continue;
        }
        m.set(C.uuid, C);
      }
    } catch (E) {
      throw await g(), E;
    } finally {
      d.close();
      l.destroy();
    }
    let _ = null;
    let b = null;
    let S = [];
    try {
      for (let E of e) {
        let C = m.get(E.uuid);
        if (!C) {
          continue;
        }
        let x = C.type === "system" && C.subtype === "model_refusal_fallback" ? {
          neutralizedByFork: true
        } : undefined;
        let A = {
          ...C,
          ...x,
          sessionId: r,
          parentUuid: _,
          isSidechain: false,
          sessionKind: undefined,
          forkedFrom: {
            sessionId: o,
            messageUuid: C.uuid
          }
        };
        let k = {
          ...C,
          ...x,
          sessionId: r
        };
        if (S.push(k), b = C, await y(De(A) + `
`), C.type !== "progress") {
          _ = C.uuid;
        }
      }
    } catch (E) {
      throw await g(), E;
    }
    if (b === null) {
      throw await g(), Error("No messages to branch");
    }
    if (n?.length) {
      for (let E of n) {
        let C = {
          ...E,
          cwd: b.cwd,
          userType: b.userType,
          entrypoint: b.entrypoint,
          version: b.version,
          gitBranch: b.gitBranch,
          sessionId: r,
          timestamp: new Date().toISOString()
        };
        let x = {
          ...C,
          parentUuid: _,
          isSidechain: false
        };
        if (S.push(C), await y(De(x) + `
`), E.type !== "progress") {
          _ = E.uuid;
        }
      }
    }
    if (f.length > 0) {
      await y(De({
        type: "content-replacement",
        sessionId: r,
        replacements: f
      }) + `
`);
    }
    if (h) {
      await y(De({
        type: "relocated",
        sessionId: r,
        relocatedCwd: h
      }) + `
`);
    }
    if (c.end(), await S$l.finished(c).catch(() => {}), u) {
      throw await g(), u;
    }
    return {
      sessionId: r,
      title: t,
      forkPath: i,
      serializedMessages: S,
      contentReplacementRecords: f
    };
  }
  async function V2m(e) {
    let t = `${e} (Branch)`;
    if ((await searchSessionsByCustomTitle(t, {
      exact: true
    })).length === 0) {
      return t;
    }
    let r = await searchSessionsByCustomTitle(`${e} (Branch`);
    let o = new Set([1]);
    let s = new RegExp(`^${FA(e)} \\(Branch(?: (\\d+))?\\)$`);
    for (let a of r) {
      let l = a.customTitle?.match(s);
      if (l) {
        if (l[1]) {
          o.add(parseInt(l[1], 10));
        } else {
          o.add(1);
        }
      }
    }
    let i = 2;
    while (o.vZc(i)) {
      i++;
    }
    return `${e} (Branch ${i})`;
  }
  async function branchAndResume(e, t, n = {}) {
    let r = getSessionId();
    let o = getCurrentSessionTitle(r);
    try {
      let {
        sessionId: s,
        title: i,
        forkPath: a,
        serializedMessages: l,
        contentReplacementRecords: c
      } = await createFork(e.messages, n.customTitle, n.extraMessages);
      let u = new Date();
      let d = deriveFirstPrompt(l);
      let p = i?.replace(/\s+/g, " ").trim() ?? (await V2m(d));
      let m = i ? "user" : "auto";
      await saveCustomTitle(s, p, a, m);
      await saveAgentName(s, p, a, m);
      logEvent("tengu_conversation_forked", {
        message_count: l.length,
        has_custom_title: !!i
      });
      let f = {
        date: ii(u.toISOString(), "T"),
        messages: l,
        fullPath: a,
        value: u.getTime(),
        created: u,
        modified: u,
        firstPrompt: d,
        messageCount: l.length,
        isSidechain: false,
        sessionId: s,
        customTitle: p,
        agentName: p,
        contentReplacements: c
      };
      let h = i ? ` "${p}"` : "";
      let g = o ? ` ("${o}")` : "";
      let y = `Branched conversation${h}. You are now in the new branch (session ${s}). Use /resume ${r}${g} to return to the original, or run \`claude -r ${r}\` in a new terminal.`;
      if (e.resume) {
        await e.resume(s, f, "fork");
        Fue(fT(), p, "user");
        t(y, {
          display: "system"
        });
      } else {
        t(`Branched conversation${h}. Resume with: /resume ${s}`);
      }
      return true;
    } catch (s) {
      let i = s instanceof Error ? s.message : "Unknown error occurred";
      t(`Failed to branch conversation: ${i}`);
      return false;
    }
  }
  async function call_export8(e, t, n) {
    await branchAndResume(t, e, {
      customTitle: n?.trim() || undefined
    });
    return null;
  }
  var _$l;
  var nHo;
  var Zor;
  var esr;
  var b$l;
  var S$l;
  var oHo = __lazy(() => {
    at();
    zf();
    Ot();
    dt();
    egn();
    Rn();
    Fy();
    fa();
    Zn();
    _$l = require("crypto");
    nHo = require("events");
    Zor = require("fs");
    esr = require("fs/promises");
    b$l = require("readline");
    S$l = require("stream/promises");
  });
  var x$l = {};
  __export(x$l, {
    call: () => call_export9
  });
  function J2m({
    question: e,
    context: t,
    onDone: n
  }) {
    let [r, o] = ZU.useState(null);
    let [s, i] = ZU.useState(false);
    let [a, l] = ZU.useState(null);
    let [c, u] = ZU.useState(null);
    let [d, p] = ZU.useState(0);
    let [m, f] = ZU.useState(() => getBtwHistory());
    let h = ZU.useRef(m);
    let g = ZU.useRef(false);
    let [y, _] = ZU.useState(false);
    let b = ZU.useRef(null);
    let [S, E] = ZU.useState(null);
    let C = ZU.useRef(null);
    let x = () => {
      b.current = null;
      E(null);
      C.current?.scrollTo(0);
    };
    let [A, k] = ZU.useState(0);
    let {
      rows: I,
      columns: O
    } = h_(Sr());
    let M = Ul();
    useInterval(() => p(j => j + 1), r || a ? null : 80);
    useTimeout(() => k(0), A ? 2000 : null, [A]);
    function L(j) {
      if (g.current) {
        j.preventDefault();
        return;
      }
      let z = b.current !== null ? h.current[b.current]?.response : r;
      if (j.key === "escape" || j.key === "return" || j.key === " " || j.ctrl && (j.key === "c" || j.key === "d")) {
        j.preventDefault();
        n(undefined, {
          display: "skip"
        });
        return;
      }
      if (j.key === "left" || j.key === "right") {
        j.preventDefault();
        let V = h.current.length;
        if (V === 0) {
          return;
        }
        let K = Math.max(0, V - 5);
        let J = b.current ?? V;
        let Q = Math.max(K, Math.min(V, J + (j.key === "left" ? -1 : 1)));
        if (Q === J) {
          return;
        }
        b.current = Q === V ? null : Q;
        E(b.current);
        C.current?.scrollTo(0);
        return;
      }
      if (j.key === "x" && h.current.length > 0) {
        j.preventDefault();
        resetBtwHistory(r && !s ? [{
          question: e,
          response: r
        }] : []);
        h.current = [];
        f([]);
        x();
        return;
      }
      if (j.key === "c" && !j.ctrl && !j.meta && z) {
        j.preventDefault();
        Uk(z).then(V => {
          if (V) {
            process.stdout.write(V);
          }
        });
        k(V => V + 1);
        return;
      }
      if (j.key === "f" && r && !s && !M && b.current === null) {
        j.preventDefault();
        g.current = true;
        _(true);
        let V = [In({
          content: e
        }), ST({
          content: r
        })];
        let K = () => {
          g.current = false;
          _(false);
        };
        if (!eR()) {
          Promise.all([Promise.resolve().then(() => (tHo(), y$l)), Promise.resolve().then(() => (oy(), A$l))]).then(([{
            spawnForkFromDirective: J
          }, {
            hasPermissionsToUseTool: Q
          }]) => J(e, t, t.canUseTool ?? Q, V)).then(J => {
            if (J) {
              n(`${"\u2442"} forked ${J.name} (${J.agentId.slice(-4)})`, {
                display: "system"
              });
            } else {
              K();
              n("Cannot fork before the first conversation turn", {
                display: "system"
              });
            }
          }).catch(J => {
            K();
            n(`Failed to fork: ${he(J)}`);
          });
        } else {
          Promise.resolve().then(() => (oHo(), rHo)).then(({
            branchAndResume: J
          }) => J(t, n, {
            customTitle: sHo(`btw: ${e}`, 80),
            extraMessages: V
          }).then(Q => {
            if (!Q) {
              K();
            }
          })).catch(J => {
            K();
            n(`Failed to branch conversation: ${he(J)}`);
          });
        }
        return;
      }
      if (j.key === "up" || j.ctrl && j.key === "p") {
        j.preventDefault();
        C.current?.scrollBy(-3);
      }
      if (j.key === "down" || j.ctrl && j.key === "n") {
        j.preventDefault();
        C.current?.scrollBy(3);
      }
    }
    ZU.useEffect(() => {
      let j = createAbortController();
      async function z() {
        let V = Ul();
        if (V && !c_()) {
          l(V.viewerOnly ? "Side questions aren't available when viewing a session read-only" : "This remote connection doesn't support side questions");
          return;
        }
        try {
          let K = V ? await V.sendControlRequest({
            subtype: "side_question",
            question: e
          }, {
            signal: j.signal,
            onProgress: J => {
              if (j.signal.aborted) {
                return;
              }
              let Q = X2m(J);
              if (Q) {
                u(Q);
              }
            }
          }) : await runSideQuestion({
            question: e,
            cacheSafeParams: await t$m(t),
            parentController: j,
            onRetry: J => {
              if (j.signal.aborted) {
                return;
              }
              u({
                ...J,
                retryAt: Date.now() + J.retryInMs
              });
            }
          });
          if (!j.signal.aborted) {
            if (K.response) {
              if (b.current = null, E(null), C.current?.scrollTo(0), o(K.response), i(K.synthetic ?? false), V && !K.synthetic) {
                appendBtwHistory(e, K.response);
              }
            } else {
              b.current = null;
              E(null);
              C.current?.scrollTo(0);
              l("No response received");
            }
          }
        } catch (K) {
          if (!j.signal.aborted) {
            b.current = null;
            E(null);
            C.current?.scrollTo(0);
            l(he(K) || "Failed to get response");
          }
        }
      }
      z();
      return () => {
        j.abort();
      };
    }, [e, t]);
    let P = m.slice(-5);
    let F = m.length - P.length;
    let H = S !== null ? m[S] : null;
    let U = P.length + (F > 0 ? 1 : 0);
    let N = Math.max(20, O - 7);
    let W = Math.max(5, I - 5 - 6 - U);
    return C_.jsxs(gXd, {
      flexDirection: "column",
      paddingLeft: 2,
      marginTop: 1,
      tabIndex: 0,
      autoFocus: true,
      onKeyDown: L,
      children: [F > 0 && C_.jsxs(Text, {
        dimColor: true,
        children: ["(+", F, " earlier /btw)"]
      }), P.map((j, z) => {
        let V = F + z;
        return C_.jsxs(Text, {
          dimColor: S !== V,
          bold: S === V,
          children: ["/btw ", sHo(j.question, N)]
        }, V);
      }), C_.jsxs(Text, {
        children: [C_.jsxs(Text, {
          color: H ? undefined : "warning",
          bold: !H,
          dimColor: !!H,
          children: ["/btw", " "]
        }), C_.jsx(Text, {
          dimColor: true,
          children: sHo(e, N)
        })]
      }), C_.jsx(gXd, {
        marginTop: 1,
        marginLeft: 2,
        maxHeight: W,
        children: C_.jsx(B2m, {
          ref: C,
          flexDirection: "column",
          flexGrow: 1,
          stickyScroll: false,
          children: H ? C_.jsx(cy, {
            children: H.response
          }) : a ? C_.jsx(Hc, {
            error: a
          }) : r ? C_.jsx(cy, {
            children: r
          }) : C_.jsx(Q2m, {
            frame: d,
            retry: c
          })
        })
      }), C_.jsx(gXd, {
        marginTop: 1,
        children: y ? C_.jsx(Text, {
          dimColor: true,
          children: "Forking\u2026"
        }) : C_.jsx(Text, {
          dimColor: true,
          children: C_.jsxs(Hn, {
            children: [m.length > 0 ? C_.jsx(xt, {
              chord: ["left", "right"],
              action: "switch"
            }) : (H || r || a) && C_.jsx(xt, {
              chord: ["up", "down"],
              action: "scroll"
            }), (H || r) && (A > 0 ? C_.jsx(Text, {
              color: "success",
              children: "Copied to clipboard"
            }) : C_.jsx(xt, {
              chord: "c",
              action: "copy"
            })), r && !s && !M && S === null && C_.jsx(xt, {
              chord: "f",
              action: "fork"
            }), m.length > 0 && C_.jsx(xt, {
              chord: "x",
              action: "clear history"
            }), C_.jsx(xt, {
              chord: "escape",
              action: "close"
            })]
          })
        })
      })]
    });
  }
  function sHo(e, t) {
    return truncateToWidth(e.replace(/\s+/g, " ").trim(), t);
  }
  function X2m(e) {
    if (e.status !== "api_retry" || typeof e.attempt !== "number" || typeof e.max_retries !== "number" || typeof e.retry_delay_ms !== "number") {
      return null;
    }
    return {
      retryAttempt: e.attempt,
      maxRetries: e.max_retries,
      retryInMs: e.retry_delay_ms,
      status: e.error_status ?? undefined,
      retryAt: Date.now() + e.retry_delay_ms
    };
  }
  function Q2m(e) {
    let t = R$l.c(19);
    let {
      frame: n,
      retry: r
    } = e;
    if (!r) {
      let u;
      if (t[0] !== n) {
        u = C_.jsx(J1e, {
          frame: n,
          messageColor: "warning"
        });
        t[0] = n;
        t[1] = u;
      } else {
        u = t[1];
      }
      let d;
      if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
        d = C_.jsx(Text, {
          color: "warning",
          children: "Answering\u2026"
        });
        t[2] = d;
      } else {
        d = t[2];
      }
      let p;
      if (t[3] !== u) {
        p = C_.jsxs(gXd, {
          children: [u, d]
        });
        t[3] = u;
        t[4] = p;
      } else {
        p = t[4];
      }
      return p;
    }
    let o = Math.max(0, Math.ceil((r.retryAt - Date.now()) / 1000));
    let s;
    if (t[5] !== n) {
      s = C_.jsx(J1e, {
        frame: n,
        messageColor: "warning"
      });
      t[5] = n;
      t[6] = s;
    } else {
      s = t[6];
    }
    let i;
    if (t[7] !== r.status) {
      i = Z2m(r.status);
      t[7] = r.status;
      t[8] = i;
    } else {
      i = t[8];
    }
    let a;
    if (t[9] !== i) {
      a = C_.jsx(Text, {
        color: "warning",
        children: i
      });
      t[9] = i;
      t[10] = a;
    } else {
      a = t[10];
    }
    let l;
    if (t[11] !== o || t[12] !== r.maxRetries || t[13] !== r.retryAttempt) {
      l = C_.jsxs(Text, {
        dimColor: true,
        children: [" \xB7 retrying in ", o, "s \xB7 attempt ", r.retryAttempt, "/", r.maxRetries]
      });
      t[11] = o;
      t[12] = r.maxRetries;
      t[13] = r.retryAttempt;
      t[14] = l;
    } else {
      l = t[14];
    }
    let c;
    if (t[15] !== s || t[16] !== a || t[17] !== l) {
      c = C_.jsxs(gXd, {
        children: [s, a, l]
      });
      t[15] = s;
      t[16] = a;
      t[17] = l;
      t[18] = c;
    } else {
      c = t[18];
    }
    return c;
  }
  function Z2m(e) {
    switch (e) {
      case 429:
        return "Rate limited";
      case 529:
        return "API overloaded";
      case 401:
      case 403:
        return "Authentication failed";
      default:
        return "API error";
    }
  }
  function e$m(e) {
    let t = e.at(-1);
    if (t?.type === "assistant" && t.message.stop_reason === null) {
      return e.slice(0, -1);
    }
    return e;
  }
  async function t$m(e) {
    let t = kg(e$m(e.messages));
    let n = getLastCacheSafeParams();
    if (n) {
      return {
        systemPrompt: n.systemPrompt,
        userContext: n.userContext,
        systemContext: n.systemContext,
        toolUseContext: e,
        forkContextMessages: t
      };
    }
    let [r, o, s] = await Promise.all([GO(e.options.tools, e.options.mainLoopModel, []), iE(), Tv(e.options.cacheBreakerPhrase)]);
    return {
      systemPrompt: r,
      userContext: o,
      systemContext: s,
      toolUseContext: e,
      forkContextMessages: t
    };
  }
  async function call_export9(e, t, n) {
    let r = n?.trim();
    if (!r) {
      e("Usage: /btw <your question>", {
        display: "system"
      });
      return null;
    }
    saveGlobalConfig(o => ({
      ...o,
      btwUseCount: o.btwUseCount + 1
    }));
    return C_.jsx(J2m, {
      question: r,
      context: t,
      onDone: e
    });
  }
  var R$l;
  var ZU;
  var C_;
  var k$l = __lazy(() => {
    Ai();
    bv();
    bs();
    sH();
    mKt();
    wl();
    dz();
    rE();
    LG();
    RV();
    ki();
    Vno();
    Tg();
    et();
    ru();
    Kp();
    dt();
    CO();
    ro();
    tQt();
    dI();
    R$l = __toESM(pt(), 1);
    ZU = __toESM(ot(), 1);
    C_ = __toESM(ie(), 1);
  });
  var r$m;
  var aHo;
  var P$l = __lazy(() => {
    aHo = {
      isEnabled: () => false,
      isHidden: true,
      name: "stub"
    };
  });
  function dvt(e, t, n, r) {
    let o = new lHo();
    let s = c => {
      if (c.length > 0) {
        o.push(De(c).slice(1, -1));
      }
    };
    o.push('{"content":"');
    s("{");
    let i = true;
    let a = c => {
      if (!i) {
        s(",");
      }
      i = false;
      s(De(c) + ":");
    };
    for (let [c, u] of Object.entries(e)) {
      if (u === undefined) {
        continue;
      }
      if (t.vZc(c) && Array.isArray(u)) {
        a(c);
        s("[");
        for (let d = 0; d < u.length; d++) {
          if (d > 0) {
            s(",");
          }
          s(De(u[d]));
        }
        s("]");
      } else if (n.vZc(c) && u !== null && typeof u === "object") {
        a(c);
        s("{");
        let d = Object.entries(u);
        for (let p = 0; p < d.length; p++) {
          let [m, f] = d[p] ?? ["", undefined];
          if (p > 0) {
            s(",");
          }
          if (s(De(m) + ":["), Array.isArray(f)) {
            for (let h = 0; h < f.length; h++) {
              if (h > 0) {
                s(",");
              }
              s(De(f[h]));
            }
          }
          s("]");
        }
        s("}");
      } else {
        a(c);
        s(De(u));
      }
    }
    s("}");
    o.push('"');
    let l = r?.extraOuterFields;
    if (l) {
      for (let [c, u] of Object.entries(l)) {
        o.push(`,${De(c)}:${De(u)}`);
      }
    }
    o.push("}");
    return o.toBuffer();
  }
  var lHo;
  var cHo = __lazy(() => {
    lHo = class lHo {
      chunks = [];
      static encoder = new TextEncoder();
      push(e) {
        if (e.length > 0) {
          this.chunks.push(lHo.encoder.HS(e));
        }
      }
      toBuffer() {
        return Buffer.concat(this.chunks);
      }
    };
  });
  function pvt(e) {
    return o$m.some(t => e.includes(t));
  }
  function tsr(e) {
    return e.some(t => {
      try {
        return pvt(De(t));
      } catch {
        return true;
      }
    });
  }
  var o$m;
  var uHo = __lazy(() => {
    o$m = ["msg_bdrk_", "msg_vrtx_", "bolt-inf-", "toolu_bdrk_", "toolu_vrtx_", "srvtoolu_bdrk_", "srvtoolu_vrtx_", "req_bdrk_", "req_vrtx_"];
  });
  async function i$m({
    transcriptPath: e,
    scope: t = "session",
    maxRawTranscriptBytes: n,
    excludeThirdPartyTranscripts: r = false
  }) {
    let [o, s] = await Promise.all([a$m(e, n), l$m(e, t, r)]);
    let i = o;
    let a = false;
    if (r && i !== null && pvt(i)) {
      i = null;
      a = true;
      logForDebugging("rawTranscriptJsonl withheld from session history: contains_3p_transcript_markers");
    }
    return {
      rawTranscriptJsonl: i,
      recentSessionTranscripts: s.transcripts,
      thirdPartyExclusions: {
        rawTranscript: a,
        recentSessions: s.droppedThirdParty
      }
    };
  }
  async function D$l({
    messages: e,
    backgroundTasks: t = {},
    transcripts: n = {},
    diskSubagentTranscripts: r,
    scope: o = "session",
    maxRawTranscriptBytes: s,
    excludeThirdPartyTranscripts: i = false
  }) {
    let a = wh();
    let [l, c, u, d] = await Promise.all([r, i$m({
      transcriptPath: a,
      scope: o,
      maxRawTranscriptBytes: s,
      excludeThirdPartyTranscripts: i
    }), getIsGit(), getHead()]);
    let p = fya(t, n);
    let m = {
      ...l,
      ...p
    };
    let f = new Set(Object.keys(p));
    let h = 0;
    if (i) {
      for (let [y, _] of Object.entries(m)) {
        if (tsr(_)) {
          delete m[y];
          h++;
          logForDebugging(`subagent transcript ${y} withheld: contains_3p_transcript_markers`);
        }
      }
    }
    let g = e.findLast(y => y.type === "assistant" && y.message.model !== "<synthetic>");
    return {
      transcriptPath: a,
      rawTranscriptJsonl: c.rawTranscriptJsonl,
      recentSessionTranscripts: c.recentSessionTranscripts,
      subagentTranscripts: m,
      teammateIds: f,
      isGit: u,
      commitSha: d || null,
      workingDirectory: getOriginalCwd(),
      platform: Me.platform,
      terminal: Me.terminal,
      version: {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION,
      latestAssistantMessageId: g?.requestId ?? null,
      latestAssistantAPIMessageId: g?.message.id ?? null,
      thirdPartyExclusions: {
        ...c.thirdPartyExclusions,
        subagents: h
      }
    };
  }
  async function a$m(e, t) {
    if (t === undefined) {
      return null;
    }
    try {
      let {
        content: n,
        bytesRead: r,
        bytesTotal: o
      } = await LA(e, t);
      if (r < o) {
        let s = n.indexOf(`
`);
        return s >= 0 ? n.slice(s + 1) : null;
      }
      return n;
    } catch {
      return null;
    }
  }
  async function l$m(e, t, n) {
    if (t === "session") {
      return {
        transcripts: undefined,
        droppedThirdParty: 0
      };
    }
    let r = mvt.dirname(e);
    let o = mvt.basename(e);
    let s = Date.now() - s$m[t];
    let i;
    try {
      i = await nsr.readdir(r);
    } catch {
      return {
        transcripts: undefined,
        droppedThirdParty: 0
      };
    }
    let a = [];
    await Promise.all(i.filter(d => d.endsWith(".jsonl") && d !== o).map(async d => {
      let p = mvt.join(r, d);
      try {
        let m = await nsr.stat(p);
        if (m.isFile() && m.mtimeMs >= s) {
          a.push({
            path: p,
            sessionId: d.slice(0, -6),
            mtimeMs: m.mtimeMs,
            size: m.size
          });
        }
      } catch {}
    }));
    a.sort((d, p) => p.mtimeMs - d.mtimeMs);
    let l = {};
    let c = 0;
    let u = 0;
    for (let d of a) {
      if (d.size === 0 || c + d.size > 1048576) {
        continue;
      }
      try {
        let {
          content: p,
          bytesRead: m,
          bytesTotal: f
        } = await LA(d.path, 1048576);
        if (!p || m < f) {
          continue;
        }
        if (n && pvt(p)) {
          u++;
          logForDebugging(`recent session ${d.sessionId} withheld: contains_3p_transcript_markers`);
          continue;
        }
        l[d.sessionId] = p;
        c += d.size;
      } catch {}
    }
    return {
      transcripts: Object.keys(l).length > 0 ? l : undefined,
      droppedThirdParty: u
    };
  }
  var nsr;
  var mvt;
  var s$m;
  var M$l = __lazy(() => {
    at();
    je();
    pr();
    na();
    Fy();
    uHo();
    nsr = require("fs/promises");
    mvt = require("path");
    s$m = {
      day: 86400000,
      week: 604800000
    };
  });
  function q7e() {
    if (Me.DISABLE_FEEDBACK_COMMAND) {
      return {
        kind: "disabled",
        reason: "/feedback has been disabled via the DISABLE_FEEDBACK_COMMAND environment variable"
      };
    }
    if (Me.DISABLE_BUG_COMMAND) {
      return {
        kind: "disabled",
        reason: "/feedback has been disabled via the DISABLE_BUG_COMMAND environment variable"
      };
    }
    if (Vi()) {
      return {
        kind: "disabled",
        reason: "/feedback has been disabled via the CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC environment variable"
      };
    }
    if (!isPolicyAllowed("allow_product_feedback")) {
      return {
        kind: "disabled",
        reason: "/feedback has been disabled by your organization's policy"
      };
    }
    switch (getAPIProvider()) {
      case "bedrock":
        return {
          kind: "bundle",
          cause: "provider",
          label: "Amazon Bedrock"
        };
      case "vertex":
        return {
          kind: "bundle",
          cause: "provider",
          label: "Vertex AI"
        };
      case "foundry":
        return {
          kind: "bundle",
          cause: "provider",
          label: "Microsoft Foundry"
        };
      case "anthropicAws":
        return {
          kind: "bundle",
          cause: "provider",
          label: "Claude Platform on AWS"
        };
      case "mantle":
        return {
          kind: "bundle",
          cause: "provider",
          label: "Amazon Bedrock (Mantle)"
        };
      case "gateway":
        return {
          kind: "bundle",
          cause: "provider",
          label: "an API gateway"
        };
      case "firstParty":
    }
    if (getAuthHeaders().error) {
      return {
        kind: "bundle",
        cause: "no_creds",
        label: "no Anthropic credentials"
      };
    }
    return {
      kind: "post"
    };
  }
  function ssr() {
    let e = q7e();
    switch (e.kind) {
      case "post":
      case "share":
        return null;
      case "disabled":
        return e.reason;
      case "bundle":
        if (e.cause === "no_creds") {
          return `/feedback requires Anthropic credentials (OAuth or API key). Report issues at ${"https://github.com/anthropics/claude-code/issues"}`;
        }
        return `/feedback is not available when using ${e.label}. Report issues at ${"https://github.com/anthropics/claude-code/issues"}`;
    }
  }
  function yHo() {
    return OHe().map(e => {
      let t = {
        ...e
      };
      if (t && typeof t.error === "string") {
        t.error = Lc(t.error);
      }
      return t;
    });
  }
  function p$m(e, t, n) {
    if (!e) {
      return [];
    }
    let r = e.split(`
`);
    let o = [];
    let s = [];
    let i = new Set();
    let a = -1;
    for (let p of r) {
      if (!p) {
        continue;
      }
      let m;
      try {
        m = qt(p);
      } catch {
        continue;
      }
      if (typeof m !== "object" || m === null) {
        continue;
      }
      if (m.type === "system" && m.subtype === "compact_boundary") {
        a = o.length;
        continue;
      }
      if (m.type !== "user" && m.type !== "assistant") {
        continue;
      }
      if (typeof m.uuid !== "string" || typeof m.timestamp !== "string" || m.isSidechain === true || !m.message) {
        continue;
      }
      if (n.vZc(m.uuid) || i.vZc(m.uuid)) {
        continue;
      }
      i.add(m.uuid);
      o.push(m.type === "user" ? {
        type: "user",
        uuid: m.uuid,
        timestamp: m.timestamp,
        message: m.message,
        ...(m.isMeta === true && {
          isMeta: true
        }),
        ...(m.toolUseResult !== undefined && {
          toolUseResult: m.toolUseResult
        }),
        ...(m.isCompactSummary === true && {
          isCompactSummary: true
        })
      } : {
        type: "assistant",
        uuid: m.uuid,
        timestamp: m.timestamp,
        message: m.message,
        requestId: m.requestId
      });
      s.push(Buffer.byteLength(p));
    }
    if (a <= 0) {
      return [];
    }
    let l = 0;
    let c = a;
    let u = new Set();
    while (c > 0) {
      let p = s[c - 1];
      if (p === undefined) {
        break;
      }
      if (p > t) {
        u.add(c - 1);
        c--;
        continue;
      }
      if (l + p > t) {
        break;
      }
      l += p;
      c--;
    }
    let d = o.slice(c, a);
    return u.size === 0 ? d : d.filter((p, m) => !u.vZc(c + m));
  }
  function m$m(e, t) {
    let n;
    for (let a of e) {
      if (a.type === "user" && a.isCompactSummary === true) {
        continue;
      }
      if (n === undefined || a.timestamp < n) {
        n = a.timestamp;
      }
    }
    let r = [];
    let o = [];
    for (let a of t) {
      if (n === undefined || a.timestamp < n) {
        r.push(a);
      } else {
        o.push(a);
      }
    }
    if (o.length === 0) {
      return [...r, ...e];
    }
    let s = e.findLastIndex(a => a.type === "user" && a.isCompactSummary === true);
    let i = s === -1 ? e.length : s;
    return [...r, ...e.slice(0, i), ...o, ...e.slice(i)];
  }
  async function f$m() {
    let e = getDebugLogPath();
    if (!e) {
      return null;
    }
    try {
      await flushDebugLogs();
      let {
        content: t,
        bytesRead: n,
        bytesTotal: r
      } = await LA(e, 2097152);
      let o = t;
      if (n < r) {
        o = o.slice(o.indexOf(`
`) + 1);
        o = `[debug log truncated to last ${n} of ${r} bytes]
${o}`;
      }
      return Lc(o);
    } catch {
      return null;
    }
  }
  async function U$l({
    messages: e,
    description: t,
    surface: n,
    scope: r = "session",
    backgroundTasks: o = {},
    transcripts: s = {},
    surveyFeedbackSource: i,
    excludeThirdPartyTranscripts: a
  }) {
    let [l, c] = await Promise.all([D$l({
      messages: e,
      backgroundTasks: o,
      transcripts: s,
      diskSubagentTranscripts: loadAllSubagentTranscriptsFromDisk(),
      scope: r,
      maxRawTranscriptBytes: 4194304,
      excludeThirdPartyTranscripts: a
    }), f$m()]);
    let u = rsr(e) === -1 ? [] : p$m(l.rawTranscriptJsonl, 2097152, new Set(e.map(h => h.uuid)));
    let d = EO(e);
    let p = u.length === 0 ? d : m$m(d, u);
    let m = {
      latestAssistantMessageId: l.latestAssistantMessageId,
      latestAssistantAPIMessageId: l.latestAssistantAPIMessageId,
      lastInterruptedAssistantAPIMessageId: getLastCancelledAPIMessageId(),
      message_count: e.length,
      datetime: new Date().toISOString(),
      description: t,
      surface: n,
      scope: r,
      platform: l.platform,
      gitRepo: l.isGit,
      commitSha: l.commitSha,
      terminal: l.terminal,
      version: l.version,
      transcript: p,
      errors: yHo(),
      lastApiRequest: getLastAPIRequest(),
      ...(Object.keys(l.subagentTranscripts).length > 0 && {
        subagentTranscripts: l.subagentTranscripts
      }),
      ...(l.rawTranscriptJsonl && {
        rawTranscriptJsonl: l.rawTranscriptJsonl
      }),
      ...(l.recentSessionTranscripts && {
        recentSessionTranscripts: l.recentSessionTranscripts
      }),
      ...(c && {
        debugLog: c
      }),
      ...(i && {
        survey_appearance_id: i.appearanceId,
        survey_response: i.response,
        survey_type: i.surveyType
      })
    };
    let f = l.thirdPartyExclusions.recentSessions + l.thirdPartyExclusions.subagents + (l.thirdPartyExclusions.rawTranscript ? 1 : 0);
    if (u.length > 0) {
      if (dvt(m, hHo, gHo).length > 8388608) {
        Et("feedback_precompact", "over_payload_cap");
        return {
          payload: {
            ...m,
            transcript: d
          },
          thirdPartyDroppedCount: f
        };
      }
      Pe("feedback_precompact");
    } else if (rsr(e) !== -1 && !l.thirdPartyExclusions.rawTranscript) {
      Et("feedback_precompact", "empty_recovery");
    }
    return {
      payload: m,
      thirdPartyDroppedCount: f
    };
  }
  function dHo(e) {
    if (e instanceof Error) {
      let t = Error(Lc(e.message));
      if (e.stack) {
        t.stack = Lc(e.stack);
      }
      Oe(t);
    } else {
      let t = Lc(String(e));
      Oe(Error(t));
    }
  }
  async function pHo(e, t) {
    if (Vi()) {
      return {
        success: false
      };
    }
    let n = 0;
    try {
      let r = dvt(e, hHo, gHo);
      if (n = r.length, n > 8388608) {
        return {
          success: false,
          payloadTooLarge: true,
          failureReason: "payload_too_large_precheck"
        };
      }
      let o = await withOAuth401Retry(() => _s.post("/api/claude_cli_feedback", r, {
        headers: {
          "Content-Type": "application/json"
        },
        timeout: 30000,
        signal: t
      }));
      if (!o.ok) {
        switch (o.reason) {
          case "essential-traffic-only":
            return {
              success: false
            };
          case "data-residency":
            return {
              success: false,
              failureReason: "data_residency"
            };
          case "no-auth":
            return {
              success: false,
              failureReason: "auth_error"
            };
        }
      }
      if (o.status === 200) {
        if (o.data?.feedback_id) {
          return {
            success: true,
            feedbackId: o.data.feedback_id
          };
        }
        dHo(Error("Failed to submit feedback: request did not return feedback_id"));
        return {
          success: false,
          failureReason: "missing_feedback_id"
        };
      }
      let s = "Failed to submit feedback:" + o.status;
      if (o.status === 401 || o.status === 403 || o.status === 429) {
        logForDebugging(s);
      } else {
        dHo(Error(s));
      }
      return {
        success: false,
        failureReason: "http_error",
        statusCode: o.status
      };
    } catch (r) {
      if (isCancel(r)) {
        return {
          success: false
        };
      }
      if (r instanceof RangeError) {
        return {
          success: false,
          payloadTooLarge: true,
          failureReason: "payload_too_large_range_error"
        };
      }
      if (isAxiosError(r)) {
        if (r.response?.status === 413) {
          return {
            success: false,
            payloadTooLarge: true,
            failureReason: "payload_too_large_413",
            statusCode: 413
          };
        }
        if (r.code === "ECONNABORTED" && n > 8388608 / 8) {
          return {
            success: false,
            payloadTooLarge: true,
            failureReason: "payload_too_large_timeout"
          };
        }
      }
      if (isAxiosError(r) && r.response?.status === 403) {
        let o = r.response.data;
        if (o?.error?.type === "permission_error" && o?.error?.message?.includes("Custom data retention settings")) {
          logForDebugging("Cannot submit feedback because custom data retention settings are enabled");
          return {
            success: false,
            isZdrOrg: true,
            failureReason: "zdr_org",
            statusCode: 403
          };
        }
      }
      if (M_(r)) {
        logForDebugging(Lc(he(r)));
      } else {
        dHo(r);
      }
      if (isAxiosError(r) && r.response) {
        return {
          success: false,
          failureReason: "http_error",
          statusCode: r.response.status
        };
      }
      return {
        success: false,
        failureReason: isAxiosError(r) && r.code === "ECONNABORTED" ? "timeout" : "network_error"
      };
    }
  }
  async function fvt({
    messages: e,
    description: t,
    surface: n,
    scope: r = "session",
    backgroundTasks: o,
    transcripts: s,
    signal: i,
    surveyFeedbackSource: a
  }) {
    let {
      payload: l,
      thirdPartyDroppedCount: c
    } = await U$l({
      messages: e,
      description: t,
      surface: n,
      scope: r,
      backgroundTasks: o,
      transcripts: s,
      surveyFeedbackSource: a,
      excludeThirdPartyTranscripts: true
    });
    let u = l.latestAssistantMessageId;
    let d = await pHo(l, i);
    let p = d;
    let m = 0;
    if (!p.success && p.payloadTooLarge) {
      let {
        transcript: f,
        subagentTranscripts: h,
        lastApiRequest: g,
        recentSessionTranscripts: y,
        rawTranscriptJsonl: _,
        debugLog: b,
        ...S
      } = l;
      if (m = 1, p = await pHo({
        ...S,
        transcript: [],
        ...(_ && {
          rawTranscriptJsonl: _
        }),
        ...(b && {
          debugLog: b
        })
      }, i), !p.success && p.payloadTooLarge) {
        m = 2;
        p = await pHo({
          ...S,
          transcript: []
        }, i);
      }
    }
    if (p.success) {
      logEvent("tengu_bug_report_submitted", {
        surface: n,
        retried_after_too_large: String(!d.success && d.payloadTooLarge === true),
        strip_level: String(m),
        third_party_transcripts_dropped: String(c),
        feedback_id: p.feedbackId,
        last_assistant_message_id: br(u),
        last_assistant_api_message_id: br(l.latestAssistantAPIMessageId),
        last_interrupted_assistant_api_message_id: br(l.lastInterruptedAssistantAPIMessageId),
        ...(a && {
          survey_appearance_id: a.appearanceId,
          survey_response: a.response,
          survey_type: a.surveyType
        })
      });
      logEventTo1P("tengu_bug_report_description", {
        feedback_id: p.feedbackId,
        descriptionLength: t.length
      });
      let f = !d.success && d.payloadTooLarge === true;
      if (f) {
        Et("feedback_submit", "payload_stripped");
      } else {
        Pe("feedback_submit");
      }
      return {
        success: true,
        feedbackId: p.feedbackId,
        retriedAfterTooLarge: f
      };
    }
    if (p.failureReason) {
      Ae("feedback_submit", p.failureReason);
      logEvent("tengu_bug_report_failed", {
        surface: n,
        reason: p.failureReason,
        status_code: String(p.statusCode ?? ""),
        first_attempt_too_large: String(!d.success && d.payloadTooLarge === true)
      });
    }
    return {
      success: false,
      isZdrOrg: p.isZdrOrg,
      failureReason: p.failureReason,
      statusCode: p.statusCode
    };
  }
  function h$m() {
    return fHo.join(er(), "feedback-bundles");
  }
  async function _Ho(e, t = "feedback.json") {
    let o = `cc-${new Date().toISOString().replace(/[-:]/g, "").replace("T", "-").slice(0, 15)}-${L$l.randomBytes(3).toString("hex")}`;
    let s = h$m();
    let i = fHo.join(s, `${o}.zip`);
    try {
      await osr.mkdir(s, {
        recursive: true,
        mode: 448
      });
      let {
        Zip: a,
        ZipDeflate: l
      } = await Promise.resolve().then(() => (b6e(), O9t));
      let c = F$l.createWriteStream(i, {
        mode: 384
      });
      await new Promise((u, d) => {
        c.on("error", d);
        let p = new a((f, h, g) => {
          if (f) {
            c.destroy();
            return d(f);
          }
          if (c.write(h), g) {
            c.end(() => u());
          }
        });
        let m = new l(t);
        p.add(m);
        m.push(e, true);
        p.end();
      });
      Pe("feedback_bundle");
      return {
        success: true,
        bundleId: o,
        zipPath: i
      };
    } catch (a) {
      await osr.rm(i, {
        force: true
      }).catch(() => {});
      Oe(a);
      Ae("feedback_bundle", "write_failed");
      return {
        success: false,
        error: he(a)
      };
    }
  }
  async function B$l({
    messages: e,
    description: t,
    surface: n,
    scope: r = "session",
    backgroundTasks: o,
    transcripts: s,
    surveyFeedbackSource: i
  }) {
    let a;
    try {
      let {
        payload: l
      } = await U$l({
        messages: e,
        description: t,
        surface: n,
        scope: r,
        backgroundTasks: o,
        transcripts: s,
        surveyFeedbackSource: i,
        excludeThirdPartyTranscripts: false
      });
      let c = Gge(l);
      a = dvt(c, hHo, gHo);
    } catch (l) {
      Oe(l);
      Ae("feedback_bundle", "write_failed");
      return {
        success: false,
        error: he(l)
      };
    }
    return _Ho(a);
  }
  var L$l;
  var F$l;
  var osr;
  var fHo;
  var hHo;
  var gHo;
  var W7e = __lazy(() => {
    at();
    cHo();
    je();
    pr();
    gn();
    dt();
    YA();
    Rn();
    ro();
    Ds();
    Wd();
    Kv();
    fa();
    ln();
    BF();
    Ot();
    B_();
    pk();
    bg();
    Kc();
    M$l();
    L$l = require("crypto");
    F$l = require("fs");
    osr = require("fs/promises");
    fHo = require("path");
    hHo = new Set(["transcript"]);
    gHo = new Set(["subagentTranscripts"]);
  });
  var g$m;
  var SHo;
  var y$m;
  var $$l = __lazy(() => {
    zWe();
    Tg();
    ln();
    ho();
    dt();
    qI();
    g$m = __toESM(pt(), 1);
    SHo = __toESM(ot(), 1);
    y$m = __toESM(ie(), 1);
  });
  function W$l({
    abortSignal: e,
    messages: t,
    initialDescription: n,
    onDone: r,
    backgroundTasks: o = {},
    mode: s = "post",
    readFileState: i,
    surveyFeedbackSource: a
  }) {
    let [l, c] = eB.useState("userInput");
    let [u, d] = eB.useState(0);
    let [p, m] = eB.useState(n ?? "");
    let [f, h] = eB.useState(null);
    let [g, y] = eB.useState(null);
    let [_, b] = eB.useState(null);
    let [S, E] = eB.useState({
      isGit: false,
      gitState: null
    });
    let [C, x] = eB.useState(null);
    let [A, k] = eB.useState("session");
    let I = bt(W => W.transcripts);
    let O = Sr().columns - 4;
    let M = getFeatureValue_CACHED_MAY_BE_STALE("tengu_amber_lynx", false);
    eB.useEffect(() => {
      async function W() {
        let j = await getIsGit();
        let z = null;
        if (j) {
          z = await getGitState();
        }
        E({
          isGit: j,
          gitState: z
        });
      }
      W();
    }, []);
    let L = eB.useCallback(async () => {
      if (c("submitting"), b(null), h(null), s === "bundle") {
        let z = await B$l({
          messages: t,
          description: p,
          surface: "cli",
          scope: A,
          backgroundTasks: o,
          transcripts: I,
          surveyFeedbackSource: a
        });
        if (z.success) {
          h(z.bundleId);
          y(z.zipPath);
          c("done");
        } else {
          b(`Couldn't save the feedback bundle to disk: ${z.error}`);
          c("userInput");
        }
        return;
      }
      let [W, j] = await Promise.all([fvt({
        messages: t,
        description: p,
        surface: "cli",
        scope: A,
        backgroundTasks: o,
        transcripts: I,
        signal: e,
        surveyFeedbackSource: a
      }), M ? Promise.resolve(null) : T$m(p, e)]);
      if (x(j), W.success) {
        h(W.feedbackId);
        c("done");
      } else {
        if (W.isZdrOrg) {
          b("Feedback collection is not available for organizations with custom data retention policies.");
        } else if (W.failureReason === "auth_error") {
          b("Couldn't send feedback: not signed in. Run /login, then retry.");
        } else {
          let z = W.statusCode ? ` (server returned ${W.statusCode})` : W.failureReason === "timeout" ? " (request timed out)" : W.failureReason === "network_error" ? " (couldn't reach the service)" : "";
          b(`Couldn't send feedback${z}. If it keeps failing, you can file at ${"https://github.com/anthropics/claude-code/issues"} instead.`);
        }
        c("userInput");
      }
    }, [p, t, M, o, I, e, s, A]);
    let P = eB.useCallback(() => {
      r("Feedback / bug report cancelled", {
        display: "system"
      });
    }, [r]);
    let F = eB.useCallback(() => {
      c("done");
    }, []);
    let H = eB.useCallback(W => {
      b(W);
      c("userInput");
    }, []);
    uo("confirm:no", P, {
      context: "Settings",
      isActive: l === "userInput"
    });
    let U = l === "done" || _ && l !== "userInput";
    function N(W) {
      if (W.ctrl || W.meta) {
        return;
      }
      if (l === "done") {
        if (W.preventDefault(), s === "share") {
          return;
        }
        if (!M && W.key === "return" && C) {
          let j = S$m(f ?? "", C, p, yHo());
          Ac(j);
        }
        if (_) {
          r("Error submitting feedback / bug report", {
            display: "system"
          });
        } else if (s === "bundle" && g) {
          r(`Feedback bundle saved to \`${g}\``, {
            display: "system"
          });
        } else {
          r("Feedback / bug report submitted", {
            display: "system"
          });
        }
        return;
      }
      if (_ && l !== "userInput") {
        W.preventDefault();
        r("Error submitting feedback / bug report", {
          display: "system"
        });
        return;
      }
      if (l === "consent") {
        if (W.key === "left") {
          W.preventDefault();
          c(s === "share" ? "userInput" : "scope");
          return;
        }
        if (W.key === "return" || W.key === " ") {
          W.preventDefault();
          L();
        }
      }
    }
    return ll.jsx(gXd, {
      flexDirection: "column",
      tabIndex: 0,
      autoFocus: true,
      onKeyDown: N,
      children: ll.jsxs(or, {
        title: "Submit feedback / bug report",
        onCancel: P,
        isCancelActive: l !== "userInput" && !U,
        hideInputGuide: l === "done",
        inputGuide: l === "userInput" ? ll.jsxs(Hn, {
          children: [ll.jsx(xt, {
            chord: "enter",
            action: "continue"
          }), ll.jsx(Wr, {
            action: "confirm:no",
            context: "Confirmation",
            fallback: "Esc",
            description: "cancel"
          })]
        }) : l === "scope" ? ll.jsxs(Hn, {
          children: [ll.jsx(xt, {
            chord: "enter",
            action: "choose"
          }), ll.jsx(Wr, {
            action: "confirm:no",
            context: "Confirmation",
            fallback: "Esc",
            description: "cancel"
          })]
        }) : l === "consent" ? ll.jsxs(Hn, {
          children: [ll.jsx(xt, {
            chord: "enter",
            action: isr[s].consentAction
          }), ll.jsx(xt, {
            chord: "left",
            action: "change"
          }), ll.jsx(Wr, {
            action: "confirm:no",
            context: "Confirmation",
            fallback: "Esc",
            description: "cancel"
          })]
        }) : null,
        children: [l === "userInput" && ll.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          children: [ll.jsx(Text, {
            children: "Describe the issue below:"
          }), ll.jsx(Dl, {
            value: p,
            onChange: W => {
              if (m(W), _) {
                b(null);
              }
            },
            columns: O,
            onSubmit: W => {
              if (s !== "share" && W.trim() === "") {
                b("Please describe the issue before submitting.");
                return;
              }
              b(null);
              c(s === "share" ? "consent" : "scope");
            },
            onExitMessage: () => r("Feedback cancelled", {
              display: "system"
            }),
            cursorOffset: u,
            onChangeCursorOffset: d,
            showCursor: true
          }), _ && ll.jsxs(gXd, {
            flexDirection: "column",
            gap: 1,
            children: [ll.jsx(Hc, {
              error: _
            }), ll.jsx(Text, {
              dimColor: true,
              children: "Edit and press Enter to retry, or Esc to cancel"
            })]
          })]
        }), l === "scope" && ll.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          children: [ll.jsx(Text, {
            children: "How much session history should we include?"
          }), ll.jsx(xr, {
            options: b$m,
            defaultFocusValue: A,
            onChange: W => {
              k(W);
              c("consent");
            },
            onCancel: P
          })]
        }), l === "consent" && ll.jsxs(gXd, {
          flexDirection: "column",
          children: [ll.jsx(Text, {
            children: isr[s].consentIntro
          }), ll.jsxs(gXd, {
            marginLeft: 2,
            flexDirection: "column",
            children: [ll.jsxs(Text, {
              children: ["- Your feedback / bug description:", " ", ll.jsx(Text, {
                dimColor: true,
                children: p
              })]
            }), ll.jsxs(Text, {
              children: ["- Environment info:", " ", ll.jsxs(Text, {
                dimColor: true,
                children: [Me.platform, ", ", Me.terminal, ", v", {
                  ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
                  PACKAGE_URL: "@anthropic-ai/claude-code",
                  README_URL: "https://code.claude.com/docs/en/overview",
                  VERSION: "2.1.198",
                  FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
                  BUILD_TIME: "2026-07-01T06:09:31Z",
                  GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
                }.VERSION]
              })]
            }), s !== "share" && S.gitState && ll.jsxs(Text, {
              children: ["- Git repo metadata:", " ", ll.jsxs(Text, {
                dimColor: true,
                children: [S.gitState.branchName, S.gitState.commitHash ? `, ${S.gitState.commitHash.slice(0, 7)}` : "", S.gitState.remoteUrl ? ` @ ${S.gitState.remoteUrl}` : "", !S.gitState.isHeadOnRemote && ", not synced", !S.gitState.isClean && ", has local changes"]
              })]
            }), ll.jsxs(Text, {
              children: ["- Session transcript:", " ", ll.jsx(Text, {
                dimColor: true,
                children: s === "share" ? j$l.session : j$l[A]
              })]
            })]
          }), ll.jsx(gXd, {
            marginTop: 1,
            children: ll.jsx(Text, {
              wrap: "wrap",
              dimColor: true,
              children: isr[s].consentFooter
            })
          })]
        }), l === "submitting" && ll.jsx(gXd, {
          flexDirection: "row",
          gap: 1,
          children: ll.jsx(Text, {
            children: isr[s].submitting
          })
        }), l === "done" && s === "bundle" && ll.jsxs(gXd, {
          flexDirection: "column",
          children: [ll.jsxs(Text, {
            color: "success",
            children: [ll.jsx(Ps, {
              status: "success",
              withSpace: true
            }), "Feedback bundle saved"]
          }), g && ll.jsxs(gXd, {
            marginTop: 1,
            flexDirection: "column",
            children: [ll.jsxs(Text, {
              children: ["Bundle: ", ll.jsx(Text, {
                dimColor: true,
                children: g
              })]
            }), ll.jsxs(Text, {
              children: ["Reference ID: ", ll.jsx(Text, {
                dimColor: true,
                children: f
              })]
            }), ll.jsx(gXd, {
              marginTop: 1,
              children: ll.jsx(Text, {
                wrap: "wrap",
                children: "Send this file to your Anthropic account representative or attach it to your support request."
              })
            })]
          }), ll.jsx(gXd, {
            marginTop: 1,
            children: ll.jsx(Text, {
              dimColor: true,
              children: "Press any key to close"
            })
          })]
        }), l === "done" && s === "post" && (M ? ll.jsxs(gXd, {
          flexDirection: "column",
          children: [_ ? ll.jsx(Hc, {
            error: _
          }) : ll.jsxs(Text, {
            color: "success",
            children: [ll.jsx(Ps, {
              status: "success",
              withSpace: true
            }), "Feedback sent"]
          }), f && ll.jsxs(ll.Fragment, {
            children: [ll.jsx(gXd, {
              marginTop: 1,
              children: ll.jsxs(Text, {
                children: ["Reference ID: ", ll.jsx(Text, {
                  dimColor: true,
                  children: f
                })]
              })
            }), ll.jsx(gXd, {
              marginTop: 1,
              children: ll.jsx(Text, {
                wrap: "wrap",
                children: "If you're working with Anthropic support, please include the ID above."
              })
            })]
          }), ll.jsx(gXd, {
            marginTop: 1,
            children: ll.jsx(Text, {
              dimColor: true,
              italic: true,
              children: "Any key to close"
            })
          })]
        }) : ll.jsxs(gXd, {
          flexDirection: "column",
          children: [_ ? ll.jsx(Hc, {
            error: _
          }) : ll.jsx(Text, {
            color: "success",
            children: "Thank you for your report!"
          }), f && ll.jsxs(Text, {
            dimColor: true,
            children: ["Feedback ID: ", f]
          }), ll.jsx(gXd, {
            marginTop: 1,
            children: ll.jsx(Text, {
              dimColor: true,
              italic: true,
              children: ll.jsxs(Hn, {
                children: [ll.jsx(xt, {
                  chord: "enter",
                  action: "open GitHub issue"
                }), ll.jsx(Text, {
                  children: "any key to close"
                })]
              })
            })
          })]
        })), null]
      })
    });
  }
  function S$m(e, t, n, r) {
    let o = Lc(t);
    let i = `**Bug Description**
${Lc(n)}

**Environment Info**
- Platform: ${Me.platform}
- Terminal: ${Me.terminal}
- Version: ${{
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION || "unknown"}
- Feedback ID: ${e}

**Errors**
\`\`\`json
`;
    let a = "\n```\n";
    let l = De(r);
    let c = `${"https://github.com/anthropics/claude-code/issues"}/new?title=${encodeURIComponent(o)}&labels=user-reported,bug&body=`;
    let u = `
**Note:** Content was truncated.
`;
    let d = encodeURIComponent(i);
    let p = encodeURIComponent("\n```\n");
    let m = encodeURIComponent(`
**Note:** Content was truncated.
`);
    let f = encodeURIComponent(l);
    let h = 7250 - c.length - d.length - p.length - m.length;
    if (h <= 0) {
      let S = encodeURIComponent("\u2026");
      let E = 50;
      let C = 7250 - c.length - S.length - m.length - 50;
      let x = i + l + "\n```\n";
      let A = encodeURIComponent(x);
      if (A.length > C) {
        A = A.slice(0, C);
        let k = A.lastIndexOf("%");
        if (k >= A.length - 2) {
          A = A.slice(0, k);
        }
      }
      return c + A + S + m;
    }
    if (f.length <= h) {
      return c + d + f + p;
    }
    let g = encodeURIComponent("\u2026");
    let y = 50;
    let _ = f.slice(0, h - g.length - y);
    let b = _.lastIndexOf("%");
    if (b >= _.length - 2) {
      _ = _.slice(0, b);
    }
    return c + d + _ + g + p + m;
  }
  async function T$m(e, t) {
    try {
      let n = await RO({
        systemPrompt: ["Generate a concise, technical issue title (max 80 chars) for a public GitHub issue based on this bug report for Claude Code.", "Claude Code is an agentic coding CLI based on the Anthropic API.", "The title should:", "- Include the type of issue [Bug] or [Feature Request] as the first thing in the title", "- Be concise, specific and descriptive of the actual problem", "- Use technical terminology appropriate for a software issue", '- For error messages, extract the key error (e.g., "Missing Tool Result Block" rather than the full message)', "- Be direct and clear for developers to understand the problem", '- If you cannot determine a clear issue, use "Bug Report: [brief description]"', "- Any LLM API errors are from the Anthropic API, not from any other model provider", "Your response will be directly used as the title of the Github issue, and as such should not contain any other commentary or explaination", 'Examples of good titles include: "[Bug] Auto-Compact triggers to soon", "[Bug] Anthropic API Error: Missing Tool Result Block", "[Bug] Error: Invalid Model Name for Opus"'],
        userPrompt: e,
        signal: t,
        options: {
          hasAppendSystemPrompt: false,
          toolChoice: undefined,
          isNonInteractiveSession: false,
          agents: [],
          querySource: "feedback",
          mcpTools: [],
          agentContext: ym()
        }
      });
      let r = n.message.content[0]?.type === "text" ? n.message.content[0].text : "Bug Report";
      if (mU(r)) {
        return THo(e);
      }
      if (v$m(r)) {
        return THo(e);
      }
      return r;
    } catch (n) {
      if (mg(n)) {
        logForDebugging("Feedback title generation via Haiku aborted, using fallback", {
          level: "debug"
        });
      } else {
        Oe(n);
      }
      return THo(e);
    }
  }
  function v$m(e) {
    let t = e.trim();
    return t === "" || E$m.test(t);
  }
  function THo(e) {
    let t = Ad(e);
    if (t.length <= 60 && t.length > 5) {
      return t;
    }
    let n = t.slice(0, 60);
    if (t.length > 60) {
      let r = n.lastIndexOf(" ");
      if (r > 30) {
        n = n.slice(0, r);
      }
      n += "...";
    }
    return n.length < 10 ? "Bug Report" : n;
  }
  var eB;
  var ll;
  var j$l;
  var b$m;
  var isr;
  var E$m;
  var G$l = __lazy(() => {
    ki();
    et();
    Bs();
    $n();
    aE();
    vO();
    W7e();
    ho();
    _h();
    ky();
    je();
    pr();
    dt();
    na();
    Rn();
    Kv();
    Zn();
    Sd();
    $c();
    Ai();
    Ii();
    bv();
    bs();
    Vf();
    $$l();
    q_();
    eB = __toESM(ot(), 1);
    ll = __toESM(ie(), 1);
    j$l = {
      session: "this session only",
      day: "this session + this project\u2019s other sessions from the last 24 hours",
      week: "this session + this project\u2019s other sessions from the last 7 days"
    };
    b$m = [{
      label: "This session only",
      value: "session"
    }, {
      label: "This session + the last 24 hours",
      value: "day"
    }, {
      label: "This session + the last 7 days",
      value: "week"
    }];
    isr = {
      post: {
        consentAction: "submit",
        consentIntro: "This report will include:",
        consentFooter: "We may use these to debug related issues and improve Claude Code.",
        submitting: "Submitting report\u2026"
      },
      bundle: {
        consentAction: "save",
        consentIntro: "An archive will be saved to disk containing:",
        consentFooter: "Nothing leaves this machine until you send the bundle file. Secrets (API keys, tokens, credentials) are redacted before writing.",
        submitting: "Saving bundle\u2026"
      },
      share: {
        consentAction: "share",
        consentIntro: "This shared conversation will include:",
        consentFooter: "A shareable link will be created so you can post the conversation for debugging and support.",
        submitting: "Uploading share\u2026"
      }
    };
    E$m = /^(i can['\u2019]t|i cannot|i['\u2019]m unable|i am unable|i['\u2019]m sorry|i am sorry|i apologize|sorry,)/i;
  });
  function V$l(e) {
    EHo = e;
  }
  function z$l() {
    let e = EHo;
    if (EHo = null, !e || Date.now() - e.setAt > 30000) {
      return null;
    }
    return e;
  }
  var EHo = null;
  var Y$l = {};
  __export(Y$l, {
    renderFeedbackComponent: () => renderFeedbackComponent,
    call: () => call_export10
  });
  function renderFeedbackComponent(e, t, n, r = "", o = {}, s) {
    let i = q7e();
    if (i.kind === "disabled") {
      e(i.reason);
      return null;
    }
    let a = z$l() ?? undefined;
    return J$l.jsx(W$l, {
      abortSignal: t,
      messages: n,
      initialDescription: r,
      onDone: e,
      backgroundTasks: o,
      mode: i.kind,
      readFileState: s,
      surveyFeedbackSource: a
    });
  }
  async function call_export10(e, t, n) {
    let r = n?.trim() === "public" ? "" : n || "";
    return renderFeedbackComponent(e, t.abortController.signal, t.messages, r, {
      ...t.taskRegistry.all()
    }, t.readFileState);
  }
  var J$l;
  var X$l = __lazy(() => {
    G$l();
    W7e();
    J$l = __toESM(ie(), 1);
  });
  var C$m;
  function eHl(e, t) {
    let n = Ro([...fg(e.requestedPath), e.canonicalPath]);
    let r = Ro([e.canonicalPath, normalizeTrustedSymlink(e.canonicalPath)]);
    let o = (i, a, l) => l.some(c => R$m(i, a, c));
    for (let i of getDenyRules(t)) {
      if (i.ruleValue.toolName !== "Cd") {
        continue;
      }
      let a = i.ruleValue.ruleContent;
      if (a === undefined || o(a, i.source, n)) {
        return {
          result: "blockedByRule",
          rule: i
        };
      }
    }
    let s = getAllowRules(t).filter(i => i.ruleValue.toolName === "Cd");
    if (s.length === 0) {
      return {
        result: "allowed"
      };
    }
    for (let i of s) {
      let a = i.ruleValue.ruleContent;
      if (a === undefined || o(a, i.source, r)) {
        return {
          result: "allowed"
        };
      }
    }
    return {
      result: "outsideAllowedPatterns",
      allowedPatterns: s.map(i => i.ruleValue.ruleContent).filter(i => i !== undefined)
    };
  }
  function R$m(e, t, n) {
    let {
      relativePattern: r,
      root: o
    } = patternWithRoot(e, t);
    let s = relativePath(o ?? Nt(), n);
    if (s === ".." || s.startsWith("../")) {
      return false;
    }
    let i = r.replace(/\/{2,}/g, "/").replace(/^\//, "").replace(/\/$/, "");
    return x$m(i).test(s);
  }
  function x$m(e) {
    let t = "^";
    for (let n = 0; n < e.length; n++) {
      let r = e[n];
      if (n === 0 && r === "*" && e[1] === "*" && e[2] === "/") {
        t += "(?:.*/)?";
        n += 2;
      } else if (r === "/" && e[n + 1] === "*" && e[n + 2] === "*") {
        t += "(/.*)?";
        n += 2;
      } else if (r === "*") {
        if (e[n + 1] === "*") {
          t += ".*";
          n++;
        } else {
          t += "[^/]+";
        }
      } else if ("\\^$.|?+()[]{}".includes(r)) {
        t += `\\${r}`;
      } else {
        t += r;
      }
    }
    return new RegExp(`${t}$`, "i");
  }
  var tHl = __lazy(() => {
    vo();
    wm();
    oy();
  });
  var oHl = {};
  __export(oHl, {
    call: () => call_export11,
    CdTrustPrompt: () => CdTrustPrompt
  });
  function oQt(e) {
    let t = wHo.c(7);
    let {
      message: n,
      args: r,
      onDone: o
    } = e;
    useTimeout(o, 0);
    let s;
    if (t[0] !== r) {
      s = Fx.jsxs(Text, {
        dimColor: true,
        children: [vGd.pointer, " /cd ", r]
      });
      t[0] = r;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i;
    if (t[2] !== n) {
      i = Fx.jsx(Vn, {
        children: Fx.jsx(Text, {
          children: n
        })
      });
      t[2] = n;
      t[3] = i;
    } else {
      i = t[3];
    }
    let a;
    if (t[4] !== s || t[5] !== i) {
      a = Fx.jsxs(gXd, {
        flexDirection: "column",
        children: [s, i]
      });
      t[4] = s;
      t[5] = i;
      t[6] = a;
    } else {
      a = t[6];
    }
    return a;
  }
  function CdTrustPrompt(e) {
    let t = wHo.c(17);
    let {
      directory: n,
      onConfirm: r,
      onCancel: o
    } = e;
    let s = nHl.useRef(false);
    let i;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      i = y => {
        if (s.current) {
          return;
        }
        s.current = true;
        y();
      };
      t[0] = i;
    } else {
      i = t[0];
    }
    let a = i;
    let l;
    if (t[1] !== n) {
      l = Fx.jsx(Text, {
        bold: true,
        children: n
      });
      t[1] = n;
      t[2] = l;
    } else {
      l = t[2];
    }
    let c;
    let u;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      c = Fx.jsxs(Text, {
        children: ["This session hasn", "'", "t worked here before. Is this a directory you created or one you trust?"]
      });
      u = Fx.jsxs(Text, {
        children: ["Claude Code", "'", "ll be able to read, edit, and execute files here."]
      });
      t[3] = c;
      t[4] = u;
    } else {
      c = t[3];
      u = t[4];
    }
    let d;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      d = Fx.jsx(Text, {
        dimColor: true,
        children: Fx.jsx(Link, {
          url: "https://code.claude.com/docs/en/security",
          children: "Security guide"
        })
      });
      t[5] = d;
    } else {
      d = t[5];
    }
    let p;
    if (t[6] !== r) {
      p = () => a(r);
      t[6] = r;
      t[7] = p;
    } else {
      p = t[7];
    }
    let m;
    if (t[8] !== o) {
      m = () => a(o);
      t[8] = o;
      t[9] = m;
    } else {
      m = t[9];
    }
    let f;
    if (t[10] !== p || t[11] !== m) {
      f = Fx.jsx(mc, {
        cancelFirst: true,
        focus: "cancel",
        confirmLabel: "Yes, move here",
        cancelLabel: "No, stay put",
        onConfirm: p,
        onCancel: m
      });
      t[10] = p;
      t[11] = m;
      t[12] = f;
    } else {
      f = t[12];
    }
    let h;
    if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
      h = Fx.jsx(Text, {
        dimColor: true,
        children: Fx.jsxs(Hn, {
          children: [Fx.jsx(xt, {
            chord: "enter",
            action: "confirm"
          }), Fx.jsx(xt, {
            chord: "escape",
            action: "cancel"
          })]
        })
      });
      t[13] = h;
    } else {
      h = t[13];
    }
    let g;
    if (t[14] !== l || t[15] !== f) {
      g = Fx.jsx(qm, {
        color: "warning",
        titleColor: "warning",
        title: "Moving to a new directory:",
        children: Fx.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          paddingTop: 1,
          children: [l, c, u, d, f, h]
        })
      });
      t[14] = l;
      t[15] = f;
      t[16] = g;
    } else {
      g = t[16];
    }
    return g;
  }
  async function k$m(e) {
    if (Me.CLAUDE_CODE_DISABLE_CLAUDE_MDS) {
      return "";
    }
    let t = new Set();
    for (let s of await getMemoryFiles()) {
      t.add(yC(s.path));
    }
    let n = [];
    let r = e;
    while (r !== sQt.parse(r).root) {
      n.push(r);
      r = sQt.dirname(r);
    }
    let o = [];
    for (let s of n.reverse()) {
      o.push(...(await getMemoryFilesForNestedDirectory(s, e, t)));
    }
    return getClaudeMds(o);
  }
  async function A$m(e) {
    let t = Nt();
    let n = getOriginalCwd();
    process.chdir(e);
    By(e);
    setOriginalCwd(Nt());
    let r = true;
    try {
      await relocateSessionTranscript();
    } catch (a) {
      r = false;
      let l = false;
      try {
        process.chdir(t);
        l = true;
      } catch {
        logForDebugging(`/cd transcript move failed and rollback chdir failed; completing the move with the transcript left in its previous home: ${a}`, {
          level: "error"
        });
      }
      if (l) {
        throw By(t), setOriginalCwd(n), a;
      }
    }
    if (r) {
      await Aea(Nt());
    }
    reanchorGitFileWatcher();
    getIsGit.cache.clear?.();
    vS()?.refreshGitBranch?.();
    SandboxManager.refreshConfig();
    logEvent("tengu_cd_command", {});
    let o = await k$m(e);
    let s = lsr(e);
    let i = gR(`The session's working directory has changed to ${s} (via /cd). The environment block at the start of this conversation still names the ` + "previous directory \u2014 that information is stale. All tool calls and " + `relative paths now resolve from ${s}.`);
    return o ? `${i}

${o}` : i;
  }
  function I$m(e, t) {
    if (t.result === "blockedByRule") {
      let n = jp(t.rule.ruleValue);
      let r = permissionRuleSourceDisplayString(t.rule.source);
      if (t.rule.ruleValue.ruleContent === undefined) {
        return `Can't move to ${_$u.bold(e)} \u2014 /cd is turned off by the ${_$u.bold(n)} rule in ${r}. Update the rule in /permissions to move between directories again.`;
      }
      return `Can't move to ${_$u.bold(e)} \u2014 it's excluded by the ${_$u.bold(n)} rule in ${r}. Pick a directory outside that rule, or update it in /permissions.`;
    }
    return `Can't move to ${_$u.bold(e)} \u2014 /cd is limited to directories matching ${t.allowedPatterns.map(n => _$u.bold(n)).join(", ")}. Pick a matching directory, or add a Cd rule in /permissions.`;
  }
  async function call_export11(e, t, n) {
    let r = (n ?? "").trim();
    if (!r) {
      return Fx.jsx(oQt, {
        message: "Usage: /cd <path>",
        args: "",
        onDone: () => e("Usage: /cd <path>")
      });
    }
    let o = us(r);
    try {
      if (!(await asr.stat(o)).isDirectory()) {
        let c = `${_$u.bold(o)} is not a directory. Did you mean ${_$u.bold(sQt.dirname(o))}?`;
        return Fx.jsx(oQt, {
          message: c,
          args: r,
          onDone: () => e(c)
        });
      }
    } catch (l) {
      if (!Io(l)) {
        Oe(Object.assign(Error("cd: unexpected stat errno"), {
          code: en(l)
        }));
      }
      let c = `Couldn't find a directory at ${_$u.bold(o)}.`;
      return Fx.jsx(oQt, {
        message: c,
        args: r,
        onDone: () => e(c)
      });
    }
    let s = o;
    try {
      s = await asr.realpath(o);
    } catch {
      s = o;
    }
    if (s === Nt()) {
      let l = `Already in ${_$u.bold(s)}.`;
      return Fx.jsx(oQt, {
        message: l,
        args: r,
        onDone: () => e(l)
      });
    }
    let i = eHl({
      requestedPath: o,
      canonicalPath: s
    }, getToolPermissionContext(t));
    if (i.result !== "allowed") {
      let l = I$m(s, i);
      return Fx.jsx(oQt, {
        message: l,
        args: r,
        onDone: () => e(l)
      });
    }
    let a = async () => {
      try {
        let l = await A$m(s);
        e(`Moved to ${_$u.bold(s)}`, {
          display: "system",
          metaMessages: [l]
        });
      } catch (l) {
        logForDebugging(`/cd relocate failed: ${l}`, {
          level: "error"
        });
        e(`Couldn't move to ${_$u.bold(s)} \u2014 the directory may no longer exist, or the session couldn't be moved. Staying in ${_$u.bold(Nt())}.`);
      }
    };
    if (isPathTrusted(s)) {
      await a();
      return null;
    }
    return Fx.jsx(CdTrustPrompt, {
      directory: s,
      onConfirm: () => {
        setPathTrusted(s);
        a();
      },
      onCancel: () => {
        e(`Staying in ${_$u.bold(Nt())}`);
      }
    });
  }
  var wHo;
  var asr;
  var sQt;
  var nHl;
  var Fx;
  var sHl = __lazy(() => {
    at();
    x$();
    Ai();
    b_();
    bs();
    Wl();
    XI();
    et();
    zf();
    Ot();
    bx();
    Sl();
    vo();
    je();
    pr();
    dt();
    Zl();
    FP();
    na();
    Rn();
    ro();
    ku();
    tHl();
    EC();
    oy();
    U1();
    Th();
    fa();
    wHo = __toESM(pt(), 1);
    asr = require("fs/promises");
    sQt = require("path");
    nHl = __toESM(ot(), 1);
    Fx = __toESM(ie(), 1);
  });
  var O$m;
  class aQt {
    paths = [];
    lowerPaths = [];
    charBits = new Int32Array(0);
    pathLens = new Uint16Array(0);
    topLevelCache = null;
    readyCount = 0;
    buildGen = 0;
    loadFromFileList(e) {
      let t = new Set();
      let n = [];
      for (let r of e) {
        if (r.length > 0 && !t.vZc(r)) {
          t.add(r);
          n.push(r);
        }
      }
      this.buildIndex(n);
    }
    loadFromFileListAsync(e) {
      let t = () => {};
      let n = new Promise(o => {
        t = o;
      });
      let r = this.buildAsync(e, t);
      return {
        queryable: n,
        done: r
      };
    }
    async buildAsync(e, t) {
      let n = ++this.buildGen;
      let r = new Set();
      let o = [];
      let s = performance.now();
      for (let a = 0; a < e.length; a++) {
        let l = e[a];
        if (l.length > 0 && !r.vZc(l)) {
          r.add(l);
          o.push(l);
        }
        if ((a & 255) === 255 && performance.now() - s > 4) {
          if (await gvt(), this.buildGen !== n) {
            t();
            return false;
          }
          s = performance.now();
        }
      }
      this.resetArrays(o);
      s = performance.now();
      let i = true;
      for (let a = 0; a < o.length; a++) {
        if (this.indexPath(a), (a & 255) === 255 && performance.now() - s > 4) {
          if (this.readyCount = a + 1, i) {
            t();
            i = false;
          }
          if (await gvt(), this.buildGen !== n) {
            return false;
          }
          s = performance.now();
        }
      }
      this.readyCount = o.length;
      t();
      return true;
    }
    buildIndex(e) {
      this.buildGen++;
      this.resetArrays(e);
      for (let t = 0; t < e.length; t++) {
        this.indexPath(t);
      }
      this.readyCount = e.length;
    }
    resetArrays(e) {
      let t = e.length;
      this.paths = e;
      this.lowerPaths = Array(t);
      this.charBits = new Int32Array(t);
      this.pathLens = new Uint16Array(t);
      this.readyCount = 0;
      this.topLevelCache = L$m(e, 100);
    }
    indexPath(e) {
      let t = this.paths[e].toLowerCase();
      this.lowerPaths[e] = t;
      let n = t.length;
      this.pathLens[e] = n;
      let r = 0;
      for (let o = 0; o < n; o++) {
        let s = t.charCodeAt(o);
        if (s >= 97 && s <= 122) {
          r |= 1 << s - 97;
        }
      }
      this.charBits[e] = r;
    }
    search(e, t) {
      if (t <= 0) {
        return [];
      }
      if (e.length === 0) {
        if (this.topLevelCache) {
          return this.topLevelCache.slice(0, t);
        }
        return [];
      }
      let n = e !== e.toLowerCase();
      let r = n ? e : e.toLowerCase();
      let o = Math.min(r.length, 64);
      let s = Array(o);
      let i = 0;
      for (let _ = 0; _ < o; _++) {
        let b = r.charAt(_);
        s[_] = b;
        let S = b.charCodeAt(0);
        if (S >= 97 && S <= 122) {
          i |= 1 << S - 97;
        }
      }
      let a = o * 24 + 8 + 32;
      let l = [];
      let c = -1 / 0;
      let {
        paths: u,
        lowerPaths: d,
        charBits: p,
        pathLens: m,
        readyCount: f
      } = this;
      e: for (let _ = 0; _ < f; _++) {
        if ((p[_] & i) !== i) {
          continue;
        }
        let b = n ? u[_] : d[_];
        let S = b.indexOf(s[0]);
        if (S === -1) {
          continue;
        }
        csr[0] = S;
        let E = 0;
        let C = 0;
        let x = S;
        for (let O = 1; O < o; O++) {
          if (S = b.indexOf(s[O], x + 1), S === -1) {
            continue e;
          }
          csr[O] = S;
          let M = S - x - 1;
          if (M === 0) {
            C += 4;
          } else {
            E += 3 + M * 1;
          }
          x = S;
        }
        if (l.length === t && a + C - E <= c) {
          continue;
        }
        let A = u[_];
        let k = m[_];
        let I = o * 16 + C - E;
        I += lHl(A, csr[0], true);
        for (let O = 1; O < o; O++) {
          I += lHl(A, csr[O], false);
        }
        if (I += Math.max(0, 32 - (k >> 2)), l.length < t) {
          if (l.push({
            path: A,
            fuzzScore: I
          }), l.length === t) {
            l.sort((O, M) => O.fuzzScore - M.fuzzScore);
            c = l[0].fuzzScore;
          }
        } else if (I > c) {
          let O = 0;
          let M = l.length;
          while (O < M) {
            let L = O + M >> 1;
            if (l[L].fuzzScore < I) {
              O = L + 1;
            } else {
              M = L;
            }
          }
          l.splice(O, 0, {
            path: A,
            fuzzScore: I
          });
          l.shift();
          c = l[0].fuzzScore;
        }
      }
      l.sort((_, b) => b.fuzzScore - _.fuzzScore);
      let h = l.length;
      let g = Math.max(h, 1);
      let y = Array(h);
      for (let _ = 0; _ < h; _++) {
        let b = l[_].path;
        let S = _ / g;
        let E = b.includes("test") ? Math.min(S * 1.05, 1) : S;
        y[_] = {
          path: b,
          score: E
        };
      }
      return y;
    }
  }
  function lHl(e, t, n) {
    if (t === 0) {
      return n ? 8 : 0;
    }
    let r = e.charCodeAt(t - 1);
    if (D$m(r)) {
      return 8;
    }
    if (M$m(r) && N$m(e.charCodeAt(t))) {
      return 6;
    }
    return 0;
  }
  function D$m(e) {
    return e === 47 || e === 92 || e === 45 || e === 95 || e === 46 || e === 32;
  }
  function M$m(e) {
    return e >= 97 && e <= 122;
  }
  function N$m(e) {
    return e >= 65 && e <= 90;
  }
  function gvt() {
    return new Promise(e => setImmediate(e));
  }
  function L$m(e, t) {
    let n = new Set();
    for (let o of e) {
      let s = o.length;
      for (let a = 0; a < o.length; a++) {
        let l = o.charCodeAt(a);
        if (l === 47 || l === 92) {
          s = a;
          break;
        }
      }
      let i = o.slice(0, s);
      if (i.length > 0) {
        if (n.add(i), n.size >= t) {
          break;
        }
      }
    }
    let r = Array.from(n);
    r.sort((o, s) => {
      let i = o.length - s.length;
      if (i !== 0) {
        return i;
      }
      return o < s ? -1 : o > s ? 1 : 0;
    });
    return r.slice(0, t).map(o => ({
      path: o,
      score: 0
    }));
  }
  var csr;
  var cHl = __lazy(() => {
    csr = new Int32Array(64);
  });
  function V7e(e) {
    return $_() ? getSettingsForSource("policySettings")?.statusLine : e;
  }
  function dsr(e) {
    if (rq()) {
      return;
    }
    if (!isProjectScopeTrustAccepted()) {
      return;
    }
    return $_() ? getSettingsForSource("policySettings")?.fileSuggestion : e;
  }
  var lQt = __lazy(() => {
    i1();
  });
  var hHl = {};