  function nQm() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_ultraplan_timeout_seconds", 5400) * 1000;
  }
  function rQm(e) {
    return (typeof e === "string" ? e : e.default).trimEnd();
  }
  function oQm(e) {
    return e in YGo;
  }
  function kcr() {
    let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_ultraplan_prompt_identifier", "simple_plan");
    return oQm(e) ? e : "simple_plan";
  }
  function Acr(e) {
    return sQm[e ?? kcr()];
  }
  function iQm(e) {
    return rQm(YGo[e]);
  }
  function aQm(e, t, n) {
    let r = [];
    if (t) {
      r.push("Here is a draft plan to refine:", "", t, "");
    }
    if (r.push(iQm(n)), e) {
      r.push("", e);
    }
    return r.join(`
`);
  }
  function lQm(e, t, n, r, o, s) {
    let i = DO(r, o);
    let a = Date.now();
    let l = false;
    let c = false;
    (async () => {
      try {
        let {
          plan: u,
          rejectCount: d,
          executionTarget: p
        } = await IQl(t, nQm(), m => {
          if (i.get(e)?.status !== "running") {
            return;
          }
          if (m === "needs_input") {
            logEvent("tengu_ultraplan_awaiting_input", {});
          }
          if (m === "plan_ready" && !c) {
            c = true;
            logEvent("tengu_ultraplan_plan_ready", {
              duration_ms: Date.now() - a
            });
            s?.(dQm(n));
            ud({
              value: `The cloud ultraplan session produced a plan and is waiting for approval. Tell the user to open ${n} to review it.`,
              mode: "task-notification",
              agentId: mainAgentId(),
              isMeta: true
            });
          }
          i.update(e, f => {
            if (f.status !== "running") {
              return f;
            }
            let h = m === "running" ? undefined : m;
            return f.ultraplanPhase === h ? f : {
              ...f,
              ultraplanPhase: h
            };
          });
        }, () => i.get(e)?.status !== "running");
        if (logEvent("tengu_ultraplan_approved", {
          duration_ms: Date.now() - a,
          plan_length: u.length,
          reject_count: d,
          execution_target: p
        }), p === "remote") {
          if (i.get(e)?.status !== "running") {
            return;
          }
          deleteRemoteAgentMetadata(e).catch(f => logForDebugging(`ultraplan meta delete failed: ${String(f)}`));
          i.update(e, f => f.status !== "running" ? f : {
            ...f,
            status: "completed",
            endTime: Date.now()
          });
          o(f => f.ultraplanSessionUrl === n ? {
            ...f,
            ultraplanSessionUrl: undefined
          } : f);
          ud({
            value: [`Ultraplan approved \u2014 executing in Claude Code on the web. Follow along at: ${n}`, "", "Results will land as a pull request when the cloud session finishes. There is nothing to do here."].join(`
`),
            mode: "task-notification",
            agentId: mainAgentId()
          });
        } else {
          o(m => {
            let f = m.tasks?.[e];
            if (!f || f.status !== "running") {
              return m;
            }
            return {
              ...m,
              ultraplanPendingChoice: {
                plan: u,
                sessionId: t,
                taskId: e
              }
            };
          });
        }
      } catch (u) {
        if (i.get(e)?.status !== "running") {
          return;
        }
        l = true;
        let p = Date.now();
        let m = u instanceof Vfe ? u.eventStats : undefined;
        logEvent("tengu_ultraplan_failed", {
          duration_ms: p - a,
          reason: u instanceof Vfe ? u.reason : "network_or_unknown",
          reject_count: u instanceof Vfe ? u.rejectCount : undefined,
          events_received: m?.eventsReceived,
          first_event_ms: m?.firstEventAt !== undefined ? m.firstEventAt - a : undefined,
          last_event_age_ms: m?.lastEventAt !== undefined ? p - m.lastEventAt : undefined
        });
        ud({
          value: `Ultraplan terminated: ${he(u)}

Session: ${n}`,
          mode: "task-notification",
          agentId: mainAgentId()
        });
        ud({
          value: "Cloud ultraplan session failed. Wait for the user's next instructions.",
          mode: "task-notification",
          agentId: mainAgentId(),
          isMeta: true
        });
        archiveRemoteSession(t).catch(f => logForDebugging(`ultraplan archive failed: ${String(f)}`));
        o(f => f.ultraplanSessionUrl === n ? {
          ...f,
          ultraplanSessionUrl: undefined
        } : f);
      } finally {
        if (l) {
          i.update(e, u => u.status !== "running" ? u : {
            ...u,
            status: "failed",
            endTime: Date.now()
          });
        }
      }
    })();
  }
  function cQm(e) {
    let t = e ? `${"Remote Control disconnected."} ` : "";
    return `${"\u25C7"} ultraplan
${t}Starting Claude Code on the web\u2026`;
  }
  function uQm(e) {
    return `${"\u25C7"} ultraplan \xB7 Monitor progress in Claude Code on the web ${e}
You can continue working \u2014 when the ${"\u25C7"} fills, press \u2193 to view results`;
  }
  function dQm(e) {
    return `${"\u25C6"} ultraplan ready \xB7 ${e}
Press ${"\u2193"} to view results`;
  }
  function UQl(e) {
    return e ? `ultraplan: already polling. Open ${e} to check status, or wait for the plan to land here.` : "ultraplan: already launching. Please wait for the session to start.";
  }
  async function JGo(e, t, n, r) {
    await Oze.kill(e, n, r);
    r(s => s.ultraplanSessionUrl || s.ultraplanPendingChoice || s.ultraplanLaunching ? {
      ...s,
      ultraplanSessionUrl: undefined,
      ultraplanPendingChoice: undefined,
      ultraplanLaunching: undefined
    } : s);
    let o = wS(t, process.env.SESSION_INGRESS_URL, {
      from: "cli"
    });
    ud({
      value: `Ultraplan stopped.

Session: ${o}`,
      mode: "task-notification",
      agentId: mainAgentId()
    });
    ud({
      value: "The user stopped the ultraplan session above. Do not respond to the stop notification \u2014 wait for their next message.",
      mode: "task-notification",
      agentId: mainAgentId(),
      isMeta: true
    });
  }
  async function XGo(e, t, n, r) {
    await Oze.kill(e, n, r);
    logEvent("tengu_review_remote_stopped", {});
    let o = wS(t, process.env.SESSION_INGRESS_URL, {
      from: "cli"
    });
    ud({
      value: `Ultrareview stopped.

Session: ${o}`,
      mode: "task-notification",
      agentId: mainAgentId()
    });
    ud({
      value: "The user stopped the ultrareview session above. Do not respond to the stop notification \u2014 wait for their next message.",
      mode: "task-notification",
      agentId: mainAgentId(),
      isMeta: true
    });
  }
  async function ben(e) {
    let {
      arg: t,
      source: n,
      seedPlan: r,
      promptIdentifier: o,
      getAppState: s,
      setAppState: i,
      signal: a,
      disconnectedBridge: l,
      onStatusMessage: c
    } = e;
    if (!isPolicyAllowed("allow_remote_sessions")) {
      logEvent("tengu_ultraplan_create_failed", {
        reason: "policy_blocked"
      });
      return `ultraplan: ${Ese({
        type: "policy_blocked"
      })}`;
    }
    let {
      ultraplanSessionUrl: u,
      ultraplanLaunching: d
    } = s();
    if (u || d) {
      logEvent("tengu_ultraplan_create_failed", {
        reason: u ? "already_polling" : "already_launching"
      });
      return UQl(u);
    }
    if (!t && !r) {
      return ['Usage: /ultraplan \\<prompt\\>, or include "ultraplan" anywhere', "in your prompt", "", ...Acr().usageBlurb, "", `Terms: ${"https://code.claude.com/docs/en/claude-code-on-the-web"}`].join(`
`);
    }
    i(p => p.ultraplanLaunching ? p : {
      ...p,
      ultraplanLaunching: true
    });
    pQm({
      arg: t,
      source: n,
      seedPlan: r,
      promptIdentifier: o,
      getAppState: s,
      setAppState: i,
      signal: a,
      onStatusMessage: c
    });
    return cQm(l);
  }
  async function pQm(e) {
    let {
      arg: t,
      source: n,
      seedPlan: r,
      getAppState: o,
      setAppState: s,
      signal: i,
      onStatusMessage: a
    } = e;
    let l;
    try {
      let c = await Dme({
        allowBundle: true
      });
      if (!c.eligible) {
        logEvent("tengu_ultraplan_create_failed", {
          reason: "precondition",
          precondition_errors: c.errors.map(b => b.type).join(",")
        });
        let _ = c.errors.map(Ese).join(`
`);
        ud({
          value: `ultraplan: cannot launch cloud session \u2014
${_}`,
          mode: "task-notification",
          agentId: mainAgentId()
        });
        return;
      }
      let u = e.promptIdentifier ?? kcr();
      let d = aQm(t, r, u);
      let p;
      let m;
      let f;
      let h = await teleportToRemote({
        initialMessage: d,
        source: "ultraplan",
        description: t || "Refine local plan",
        permissionMode: "plan",
        ultraplan: true,
        signal: i,
        useDefaultEnvironment: true,
        allowBundle: true,
        onBundleFail: (_, b) => {
          p = _;
          m = b;
        },
        onCreateFail: _ => {
          f = _;
        }
      });
      if (!h) {
        let _ = p ?? f;
        logEvent("tengu_ultraplan_create_failed", {
          reason: m ? `${m}_fail` : f ? "create_api_fail" : "teleport_null"
        });
        ud({
          value: `ultraplan: session creation failed${_ ? ` \u2014 ${_}` : ". See --debug for details."}`,
          mode: "task-notification",
          agentId: mainAgentId()
        });
        return;
      }
      l = h.id;
      let g = wS(h.id, process.env.SESSION_INGRESS_URL, {
        from: "cli"
      });
      s(_ => ({
        ..._,
        ultraplanSessionUrl: g,
        ultraplanLaunching: undefined
      }));
      a?.(uQm(g));
      logEvent("tengu_ultraplan_launched", {
        has_seed_plan: Boolean(r),
        prompt_identifier: u,
        source: n
      });
      let {
        taskId: y
      } = Ave({
        remoteTaskType: "ultraplan",
        session: {
          id: h.id,
          title: t || "Ultraplan"
        },
        command: t,
        context: {
          abortController: new AbortController(),
          taskRegistry: DO(o, s)
        },
        isUltraplan: true
      });
      lQm(y, h.id, g, o, s, a);
      Ti(async () => {
        if (o().ultraplanSessionUrl === g) {
          await archiveRemoteSession(h.id, 1500);
        }
      });
    } catch (c) {
      if (Oe(c), logEvent("tengu_ultraplan_create_failed", {
        reason: "unexpected_error",
        error_name: c instanceof Error ? c.name : undefined
      }), ud({
        value: `ultraplan: unexpected error \u2014 ${he(c)}`,
        mode: "task-notification",
        agentId: mainAgentId()
      }), ud({
        value: "Ultraplan hit an unexpected error during launch. Wait for the user's next instructions.",
        mode: "task-notification",
        agentId: mainAgentId(),
        isMeta: true
      }), l) {
        archiveRemoteSession(l).catch(u => logForDebugging("ultraplan: failed to archive orphaned session", u));
        s(u => u.ultraplanSessionUrl ? {
          ...u,
          ultraplanSessionUrl: undefined
        } : u);
      }
    } finally {
      s(c => c.ultraplanLaunching ? {
        ...c,
        ultraplanLaunching: undefined
      } : c);
    }
  }
  var YGo;
  var sRT;
  var FQl;
  var sQm;
  var mQm = async (e, t, n) => {
    let r = sor(n).trim();
    if (!isPolicyAllowed("allow_remote_sessions")) {
      e(Ese({
        type: "policy_blocked"
      }), {
        display: "system"
      });
      return null;
    }
    if (!r) {
      let a = await ben({
        arg: r,
        source: "slash",
        getAppState: t.getAppState,
        setAppState: t.setAppState,
        signal: t.abortController.signal
      });
      e(a, {
        display: "system"
      });
      return null;
    }
    let o = t.options.ultraplanSessionUrl;
    let {
      ultraplanLaunching: s
    } = t.getAppState();
    if (o || s) {
      logEvent("tengu_ultraplan_create_failed", {
        reason: o ? "already_polling" : "already_launching"
      });
      e(UQl(o), {
        display: "system"
      });
      return null;
    }
    let i = getGlobalConfig().hasSeenUltraplanTerms ? undefined : Xwt().catch(() => null);
    t.setAppState(a => ({
      ...a,
      ultraplanLaunchPending: {
        ultraplanArg: r,
        source: "slash",
        sourcePromise: i
      }
    }));
    e(undefined, {
      display: "skip"
    });
    return null;
  };
  var BQl;
  var KYe = __lazy(() => {
    at();
    wl();
    $n();
    Ot();
    Kc();
    tZ();
    xcr();
    hd();
    je();
    dt();
    Rn();
    Rf();
    fa();
    U$();
    FM();
    OQl();
    _en();
    CXt();
    YGo = {
      simple_plan: DQl(),
      visual_plan: MQl(),
      three_subagents_with_critique: NQl()
    };
    sRT = Object.keys(YGo);
    FQl = {
      timeEstimate: "a few minutes",
      dialogBody: "Interactive planning on the web where you can edit and leave targeted comments on Claude's plan.",
      dialogPipeline: "Plan \u2192 Edit \u2192 Execute",
      usageBlurb: ["Remote plan mode with rich web editing experience.", "Runs in Claude Code on the web. When the plan is ready,", "you can execute it in the web session or send it back here.", "You can continue to work while the plan is generated remotely."]
    };
    sQm = {
      simple_plan: FQl,
      visual_plan: FQl,
      three_subagents_with_critique: {
        timeEstimate: "~10\u201330 min",
        dialogBody: "Interactive planning on the web where you can edit and leave targeted comments on Claude's plan.",
        dialogPipeline: "Scope \u2192 Critique \u2192 Edit \u2192 Execute",
        usageBlurb: ["Advanced multi-agent plan mode.", "Runs in Claude Code on the web. When the plan is ready,", "you can execute it in the web session or send it back here.", "You can continue to work while the plan is generated remotely."]
      }
    };
    BQl = {
      type: "local-jsx",
      name: "ultraplan",
      get description() {
        return `Draft an editable plan in Claude Code on the web (${Acr().timeEstimate}) \xB7 See ${"https://code.claude.com/docs/en/claude-code-on-the-web"}`;
      },
      argumentHint: "<prompt>",
      isEnabled: () => zfe(),
      load: () => Promise.resolve({
        call: mQm
      })
    };
  });
  function ZGo(e) {
    if (!e.bundleSeedEnabled) {
      return null;
    }
    return e.cloneViable ? "This will try to clone your git remote and fall back to uploading this repository." : "This will upload your repository to Claude Code on the web.";
  }
  function $Ql(e) {
    let t = QGo.c(24);
    let {
      sourcePromise: n,
      onChoice: r
    } = e;
    Jg("ultraplan-launch");
    let [o] = WUe.useState(bQm);
    let [s] = WUe.useState(_Qm);
    let i;
    if (t[0] !== s) {
      i = Acr(s);
      t[0] = s;
      t[1] = i;
    } else {
      i = t[1];
    }
    let a = i;
    let l = bt(yQm);
    let c = Lo();
    let u;
    if (t[2] !== n || t[3] !== o) {
      u = () => o ? n ?? Xwt().catch(gQm) : null;
      t[2] = n;
      t[3] = o;
      t[4] = u;
    } else {
      u = t[4];
    }
    let [d] = WUe.useState(u);
    let p;
    if (t[5] !== r || t[6] !== s || t[7] !== l || t[8] !== c || t[9] !== o) {
      p = function (b) {
        let S = b === "run" && l;
        if (logEvent("tengu_ultraplan_dialog_choice", {
          choice: b,
          first_run: o,
          bridge_disconnected: S,
          prompt_identifier: s
        }), S) {
          c(hQm);
        }
        if (b !== "cancel" && o) {
          logEvent("tengu_ultraplan_first_launch", {
            prompt_identifier: s
          });
          saveGlobalConfig(fQm);
        }
        r(b, {
          disconnectedBridge: S,
          promptIdentifier: s
        });
      };
      t[5] = r;
      t[6] = s;
      t[7] = l;
      t[8] = c;
      t[9] = o;
      t[10] = p;
    } else {
      p = t[10];
    }
    let m = p;
    let f;
    if (t[11] !== m) {
      f = () => m("cancel");
      t[11] = m;
      t[12] = f;
    } else {
      f = t[12];
    }
    let h;
    if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
      h = bA.jsx(Text, {
        dimColor: true,
        children: "Loading\u2026"
      });
      t[13] = h;
    } else {
      h = t[13];
    }
    let g;
    if (t[14] !== a || t[15] !== m || t[16] !== l || t[17] !== o || t[18] !== d) {
      g = bA.jsx(WUe.Suspense, {
        fallback: h,
        children: bA.jsx(SQm, {
          showTerms: o,
          sourcePromise: d,
          copy: a,
          replBridgeEnabled: l,
          onChoice: m
        })
      });
      t[14] = a;
      t[15] = m;
      t[16] = l;
      t[17] = o;
      t[18] = d;
      t[19] = g;
    } else {
      g = t[19];
    }
    let y;
    if (t[20] !== a.timeEstimate || t[21] !== f || t[22] !== g) {
      y = bA.jsx(or, {
        title: "Run ultraplan in the cloud?",
        subtitle: a.timeEstimate,
        onCancel: f,
        children: g
      });
      t[20] = a.timeEstimate;
      t[21] = f;
      t[22] = g;
      t[23] = y;
    } else {
      y = t[23];
    }
    return y;
  }
  function fQm(e) {
    return e.hasSeenUltraplanTerms ? e : {
      ...e,
      hasSeenUltraplanTerms: true
    };
  }
  function hQm(e) {
    if (!e.replBridgeEnabled) {
      return e;
    }
    return {
      ...e,
      replBridgeEnabled: false,
      replBridgeExplicit: false,
      replBridgeOutboundOnly: false
    };
  }
  function gQm() {
    return null;
  }
  function yQm(e) {
    return e.replBridgeEnabled;
  }
  function _Qm() {
    return kcr();
  }
  function bQm() {
    return !getGlobalConfig().hasSeenUltraplanTerms;
  }
  function SQm(e) {
    let t = QGo.c(22);
    let {
      showTerms: n,
      sourcePromise: r,
      copy: o,
      replBridgeEnabled: s,
      onChoice: i
    } = e;
    let a = r ? WUe.use(r) : null;
    let l;
    if (t[0] !== a) {
      l = a && ZGo(a);
      t[0] = a;
      t[1] = l;
    } else {
      l = t[1];
    }
    let c = l;
    let u;
    if (t[2] !== o.dialogBody || t[3] !== o.dialogPipeline || t[4] !== s || t[5] !== n || t[6] !== c) {
      u = n ? bA.jsxs(bA.Fragment, {
        children: [bA.jsx(Text, {
          dimColor: true,
          children: o.dialogBody
        }), bA.jsxs(gXd, {
          flexDirection: "column",
          children: [c && bA.jsx(Text, {
            dimColor: true,
            children: c
          }), bA.jsxs(Text, {
            dimColor: true,
            children: ["More information: ", bA.jsx(Link, {
              url: "https://code.claude.com/docs/en/claude-code-on-the-web",
              children: "https://code.claude.com/docs/en/claude-code-on-the-web"
            })]
          })]
        }), bA.jsx(Text, {
          children: "Proceed?"
        })]
      }) : bA.jsxs(bA.Fragment, {
        children: [bA.jsxs(gXd, {
          flexDirection: "column",
          children: [bA.jsx(Text, {
            dimColor: true,
            children: o.dialogBody
          }), s && bA.jsx(Text, {
            dimColor: true,
            children: "This will disable Remote Control for this session."
          })]
        }), !s && bA.jsx(Text, {
          dimColor: true,
          children: o.dialogPipeline
        })]
      });
      t[2] = o.dialogBody;
      t[3] = o.dialogPipeline;
      t[4] = s;
      t[5] = n;
      t[6] = c;
      t[7] = u;
    } else {
      u = t[7];
    }
    let d = n ? "Yes" : "Run ultraplan";
    let p = s ? "Disable remote control and launch in Claude Code on the web" : "launch in Claude Code on the web";
    let m;
    if (t[8] !== d || t[9] !== p) {
      m = {
        label: d,
        value: "run",
        description: p
      };
      t[8] = d;
      t[9] = p;
      t[10] = m;
    } else {
      m = t[10];
    }
    let f = n ? "No" : "Not now";
    let h;
    if (t[11] !== f) {
      h = {
        label: f,
        value: "cancel"
      };
      t[11] = f;
      t[12] = h;
    } else {
      h = t[12];
    }
    let g;
    if (t[13] !== m || t[14] !== h) {
      g = [m, h];
      t[13] = m;
      t[14] = h;
      t[15] = g;
    } else {
      g = t[15];
    }
    let y;
    if (t[16] !== i || t[17] !== g) {
      y = bA.jsx(xr, {
        options: g,
        onChange: i
      });
      t[16] = i;
      t[17] = g;
      t[18] = y;
    } else {
      y = t[18];
    }
    let _;
    if (t[19] !== u || t[20] !== y) {
      _ = bA.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [u, y]
      });
      t[19] = u;
      t[20] = y;
      t[21] = _;
    } else {
      _ = t[21];
    }
    return _;
  }
  var QGo;
  var WUe;
  var bA;
  var e9o = __lazy(() => {
    KYe();
    px();
    et();
    Ot();
    ho();
    xcr();
    $c();
    Ii();
    QGo = __toESM(pt(), 1);
    WUe = __toESM(ot(), 1);
    bA = __toESM(ie(), 1);
  });
  function HQl(e) {
    let t = Icr.c(24);
    let {
      subtitle: n,
      body: r,
      scope: o,
      onProceed: s,
      onCancel: i
    } = e;
    Jg("ultrareview-launch");
    let [a] = Kfe.useState(vQm);
    let [l, c] = Kfe.useState(false);
    let u;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      u = new AbortController();
      t[0] = u;
    } else {
      u = t[0];
    }
    let d = Kfe.useRef(u);
    let p;
    if (t[1] !== a) {
      p = () => a ? Xwt().catch(EQm) : null;
      t[1] = a;
      t[2] = p;
    } else {
      p = t[2];
    }
    let [m] = Kfe.useState(p);
    let f;
    if (t[3] !== i || t[4] !== s || t[5] !== a) {
      f = C => {
        if (C === "proceed") {
          if (a) {
            saveGlobalConfig(TQm);
          }
          c(true);
          s(d.current.signal).catch(() => c(false));
        } else {
          i();
        }
      };
      t[3] = i;
      t[4] = s;
      t[5] = a;
      t[6] = f;
    } else {
      f = t[6];
    }
    let h = f;
    let g;
    if (t[7] !== i) {
      g = () => {
        d.current.abort();
        i();
      };
      t[7] = i;
      t[8] = g;
    } else {
      g = t[8];
    }
    let y = g;
    let _;
    if (t[9] !== n) {
      _ = n ?? `${getReviewDurationNote()} \xB7 Est. cost ${getReviewCostNote()} USD`;
      t[9] = n;
      t[10] = _;
    } else {
      _ = t[10];
    }
    let b;
    if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
      b = Wb.jsx(Text, {
        dimColor: true,
        children: "Loading\u2026"
      });
      t[11] = b;
    } else {
      b = t[11];
    }
    let S;
    if (t[12] !== r || t[13] !== y || t[14] !== h || t[15] !== l || t[16] !== o || t[17] !== a || t[18] !== m) {
      S = Wb.jsx(Kfe.Suspense, {
        fallback: b,
        children: Wb.jsx(wQm, {
          showTerms: a,
          sourcePromise: m,
          body: r,
          scope: o,
          isLaunching: l,
          onSelect: h,
          onCancel: y
        })
      });
      t[12] = r;
      t[13] = y;
      t[14] = h;
      t[15] = l;
      t[16] = o;
      t[17] = a;
      t[18] = m;
      t[19] = S;
    } else {
      S = t[19];
    }
    let E;
    if (t[20] !== y || t[21] !== _ || t[22] !== S) {
      E = Wb.jsx(or, {
        title: "Run ultrareview in the cloud?",
        subtitle: _,
        onCancel: y,
        children: S
      });
      t[20] = y;
      t[21] = _;
      t[22] = S;
      t[23] = E;
    } else {
      E = t[23];
    }
    return E;
  }
  function TQm(e) {
    return e.hasSeenUltrareviewTerms ? e : {
      ...e,
      hasSeenUltrareviewTerms: true
    };
  }
  function EQm() {
    return null;
  }
  function vQm() {
    return !getGlobalConfig().hasSeenUltrareviewTerms;
  }
  function wQm(e) {
    let t = Icr.c(17);
    let {
      showTerms: n,
      sourcePromise: r,
      body: o,
      scope: s,
      isLaunching: i,
      onSelect: a,
      onCancel: l
    } = e;
    let c = r ? Kfe.use(r) : null;
    let u;
    if (t[0] !== c) {
      u = c && ZGo(c);
      t[0] = c;
      t[1] = u;
    } else {
      u = t[1];
    }
    let d = u;
    let p = s.mode === "pr" ? `Reviewing ${s.repo}#${s.prNumber} fetched from GitHub.` : s.headBranch === s.baseBranch ? `Reviewing local changes on ${s.baseBranch}.` : `Reviewing ${s.headBranch} against ${s.baseBranch}.`;
    let m = s.mode === "branch" && s.diffStat ? s.diffStat : null;
    let f = s.mode === "pr" ? "Tip: run /code-review ultra (no number) to review your current branch instead." : "Tip: run /code-review ultra <PR number> to fetch and review a specific GitHub PR instead.";
    let h;
    if (t[2] !== o || t[3] !== m || t[4] !== p || t[5] !== n || t[6] !== d || t[7] !== f) {
      h = n ? Wb.jsxs(Wb.Fragment, {
        children: [Wb.jsxs(gXd, {
          flexDirection: "column",
          children: [Wb.jsx(Text, {
            dimColor: true,
            children: p
          }), m && Wb.jsxs(Text, {
            dimColor: true,
            children: ["Scope: ", m]
          }), Wb.jsx(Text, {
            dimColor: true,
            children: "Finds and verifies bugs using a multi-agent review fleet."
          }), Wb.jsx(Text, {
            dimColor: true,
            children: f
          }), d && Wb.jsx(Text, {
            dimColor: true,
            children: d
          }), o && Wb.jsx(Text, {
            dimColor: true,
            children: o
          }), Wb.jsxs(Text, {
            dimColor: true,
            children: ["More information: ", Wb.jsx(Link, {
              url: "https://code.claude.com/docs/en/claude-code-on-the-web",
              children: "https://code.claude.com/docs/en/claude-code-on-the-web"
            })]
          })]
        }), Wb.jsx(Text, {
          children: "Proceed?"
        })]
      }) : Wb.jsxs(gXd, {
        flexDirection: "column",
        children: [Wb.jsx(Text, {
          dimColor: true,
          children: p
        }), m && Wb.jsxs(Text, {
          dimColor: true,
          children: ["Scope: ", m]
        }), Wb.jsx(Text, {
          dimColor: true,
          children: "Finds and verifies bugs using a multi-agent review fleet."
        }), Wb.jsx(Text, {
          dimColor: true,
          children: f
        }), o && Wb.jsx(Text, {
          dimColor: true,
          children: o
        })]
      });
      t[2] = o;
      t[3] = m;
      t[4] = p;
      t[5] = n;
      t[6] = d;
      t[7] = f;
      t[8] = h;
    } else {
      h = t[8];
    }
    let g;
    if (t[9] !== i || t[10] !== l || t[11] !== a || t[12] !== n) {
      g = i ? Wb.jsx(CQm, {}) : Wb.jsx(xr, {
        options: [{
          label: n ? "Yes" : "Run ultrareview",
          value: "proceed",
          description: "launch in Claude Code on the web"
        }, {
          label: n ? "No" : "Not now",
          value: "cancel"
        }],
        onChange: a,
        onCancel: l
      });
      t[9] = i;
      t[10] = l;
      t[11] = a;
      t[12] = n;
      t[13] = g;
    } else {
      g = t[13];
    }
    let y;
    if (t[14] !== h || t[15] !== g) {
      y = Wb.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [h, g]
      });
      t[14] = h;
      t[15] = g;
      t[16] = y;
    } else {
      y = t[16];
    }
    return y;
  }
  function CQm() {
    let e = Icr.c(12);
    let t = K_();
    let n;
    if (e[0] !== t.prefersReducedMotion) {
      n = WC(t.prefersReducedMotion);
      e[0] = t.prefersReducedMotion;
      e[1] = n;
    } else {
      n = e[1];
    }
    let r = n;
    let [o, s] = useAnimationFrame(r ? null : 50);
    let i = r ? -100 : 19 - Math.floor(s / 200) % 29;
    let a = Math.floor(s / 120);
    let l;
    if (e[2] !== a || e[3] !== r || e[4] !== s) {
      l = Wb.jsx(J1e, {
        frame: a,
        messageColor: "inactive",
        reducedMotion: r,
        time: s
      });
      e[2] = a;
      e[3] = r;
      e[4] = s;
      e[5] = l;
    } else {
      l = e[5];
    }
    let c;
    if (e[6] !== i) {
      c = Wb.jsx(pKt, {
        message: "Launching",
        mode: "responding",
        messageColor: "inactive",
        glimmerIndex: i,
        flashOpacity: 0,
        shimmerColor: "subtle"
      });
      e[6] = i;
      e[7] = c;
    } else {
      c = e[7];
    }
    let u;
    if (e[8] !== o || e[9] !== l || e[10] !== c) {
      u = Wb.jsxs(gXd, {
        ref: o,
        flexDirection: "row",
        columnGap: 1,
        children: [l, c]
      });
      e[8] = o;
      e[9] = l;
      e[10] = c;
      e[11] = u;
    } else {
      u = e[11];
    }
    return u;
  }
  var Icr;
  var Kfe;
  var Wb;
  var jQl = __lazy(() => {
    $c();
    Ii();
    AJn();
    mKt();
    e9o();
    px();
    Qq();
    et();
    xcr();
    Dre();
    KYe();
    Jwt();
    Icr = __toESM(pt(), 1);
    Kfe = __toESM(ot(), 1);
    Wb = __toESM(ie(), 1);
  });
  var qQl = {};