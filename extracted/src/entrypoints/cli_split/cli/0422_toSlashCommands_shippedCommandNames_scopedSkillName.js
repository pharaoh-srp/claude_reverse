  __export(xdc, {
    default: () => Rcf
  });
  async function wcf(e) {
    if (!e.messages.some(y => y.type === "assistant" && !y.isApiErrorMessage && !Hse(y) || y.type === "user" && y.isCompactSummary || replayableUserMessagesFilter(y) && !IZ(qO(y) ?? ""))) {
      return null;
    }
    let [{
      fetchSystemPromptParts: n
    }, {
      getToolPermissionContext: r
    }, {
      getMainLoopModel: o,
      getRuntimeMainLoopModel: s
    }, {
      asSystemPrompt: i
    }] = await Promise.all([Promise.resolve().then(() => (Ydr(), Rdc)), Promise.resolve().then(() => (Sl(), IFl)), Promise.resolve().then(() => (Eo(), JCn)), Promise.resolve().then(() => zya)]);
    let a = r(e);
    let l = s({
      permissionMode: a.mode,
      mainLoopModel: o()
    });
    let {
      customSystemPrompt: c,
      appendSystemPrompt: u
    } = e.options;
    let {
      defaultSystemPrompt: d,
      userContext: p,
      systemContext: m
    } = await n({
      tools: e.options.tools,
      mainLoopModel: l,
      additionalWorkingDirectories: Array.from(a.additionalWorkingDirectories.keys()),
      customSystemPrompt: c,
      excludeDynamicSections: e.options.excludeDynamicSections,
      cacheBreakerPhrase: e.options.cacheBreakerPhrase
    });
    let f = i([...(typeof c === "string" ? [c] : Array.isArray(c) ? c : d), ...(u ? [u] : [])]);
    let h = e.messages.at(-1);
    let g = kg(h?.type === "assistant" && h.message.stop_reason === null ? e.messages.slice(0, -1) : e.messages);
    return {
      systemPrompt: f,
      userContext: p,
      systemContext: m,
      toolUseContext: {
        ...e,
        options: {
          ...e.options,
          mainLoopModel: l
        }
      },
      forkContextMessages: g
    };
  }
  var Ccf = async (e, t) => {
    let n = false;
    let r = false;
    let o = await i8t(t.abortController.signal, async () => {
      try {
        let s = await wcf(t);
        n = s !== null;
        return s;
      } catch (s) {
        throw r = true, s;
      }
    });
    switch (o.kind) {
      case "ok":
        Pe("recap_command", {
          fallback_params: n
        });
        return {
          type: "text",
          value: o.text
        };
      case "api-error":
        Ae("recap_command", "api_error", {
          fallback_params: n
        });
        return {
          type: "text",
          value: o.text
        };
      case "no-turn":
        return {
          type: "text",
          value: "Nothing to recap yet \u2014 send a message first."
        };
      case "aborted":
        return {
          type: "text",
          value: "Recap cancelled."
        };
      case "failed":
        Ae("recap_command", r ? "fallback_rebuild_failed" : "failed", {
          fallback_params: n
        });
        return {
          type: "text",
          value: "Couldn't generate a recap. Run with --debug for details."
        };
    }
  };
  var Rcf;
  var Adc = {};
  __export(Adc, {
    default: () => Pcf
  });
  function kcf(e) {
    if (e === null) {
      return _$u.yellow("never");
    }
    if (e === 0) {
      return "today";
    }
    return `${e} ${un(e, "day")}`;
  }
  function Acf(e) {
    if (e.length === 0) {
      return _$u.dim("  (no skills loaded)");
    }
    let t = Math.max(5, ...e.map(r => r.name.length));
    let n = Math.max(6, ...e.map(r => r.source.length));
    return e.map(r => {
      let o = `  ${r.name.padEnd(t)}  ${_$u.dim(r.source.padEnd(n))}  ${String(r.usageCount).padStart(4)}\xD7  ${kcf(r.daysSinceUse)}`;
      return r.usageCount === 0 ? _$u.yellow(o) : o;
    }).join(`
`);
  }
  var Icf = async (e, t) => {
    let n = kYe();
    let r = [];
    for (let a of t.options.commands) {
      if (a.type !== "prompt") {
        continue;
      }
      if (a.source === "bundled" || a.source === "builtin" || a.source === "policySettings" || a.source === "plugin") {
        continue;
      }
      let l = Iyl(a.name, a.unqualifiedName);
      r.push({
        name: a.name,
        source: a.pluginInfo?.pluginManifest.name ?? a.source,
        usageCount: l?.usageCount ?? 0,
        daysSinceUse: l?.daysSinceUse ?? null
      });
    }
    r.sort((a, l) => (l.daysSinceUse ?? 1 / 0) - (a.daysSinceUse ?? 1 / 0));
    let o = r.filter(a => a.usageCount === 0);
    let s = [];
    if (s.push(_$u.bold("Skills loaded this session")), s.push(""), s.push(Acf(r)), s.push(""), o.length > 0) {
      s.push(_$u.yellow(`${o.length} ${un(o.length, "skill")} loaded but never invoked. Each one adds to the system prompt every turn. Disable in /skills, or remove from .claude/skills.`));
    } else {
      s.push(_$u.green("All loaded skills have been used at least once."));
    }
    let i = await n;
    if (i.length > 0) {
      s.push("");
      s.push(_$u.bold("Plugins not used recently"));
      s.push("");
      for (let a of i) {
        s.push(`  ${_$u.yellow(a.name)}  ${_$u.dim(`last used ${a.daysSinceLastUse} days ago`)}`);
      }
      s.push("");
      s.push(_$u.dim("  Manage these in /plugin"));
    }
    if (r.length === 0) {
      Et("cli_skill_doctor", "no_user_skills");
    } else {
      Pe("cli_skill_doctor");
    }
    return {
      type: "text",
      value: s.join(`
`)
    };
  };
  var Pcf;
  function Odc(e) {
    let t = hVo.c(39);
    let {
      messages: n,
      onDone: r
    } = e;
    let o = bt(Mcf);
    let [, s] = Pdc.useState(0);
    let i;
    if (t[0] !== s) {
      i = () => s(Dcf);
      t[0] = s;
      t[1] = i;
    } else {
      i = t[1];
    }
    if (useInterval(i, o ? 1000 : null), o) {
      let d = Date.now() - o.setAt;
      let p;
      if (t[2] !== d) {
        p = formatDuration(d, {
          mostSignificantOnly: true
        });
        t[2] = d;
        t[3] = p;
      } else {
        p = t[3];
      }
      let m = p;
      let f = getTotalOutputTokens() - o.tokensAtStart;
      let h;
      if (t[4] !== f) {
        h = formatTokens(f);
        t[4] = f;
        t[5] = h;
      } else {
        h = t[5];
      }
      let g = h;
      let y = `running ${m}`;
      let _;
      if (t[6] !== o.iterations) {
        _ = o.iterations > 0 && `${o.iterations} ${un(o.iterations, "turn")}`;
        t[6] = o.iterations;
        t[7] = _;
      } else {
        _ = t[7];
      }
      let b = `${g} tokens`;
      let S;
      if (t[8] !== y || t[9] !== _ || t[10] !== b) {
        S = [y, _, b].filter(Boolean);
        t[8] = y;
        t[9] = _;
        t[10] = b;
        t[11] = S;
      } else {
        S = t[11];
      }
      let C = S.join(" \xB7 ");
      let x;
      if (t[12] === Symbol.for("react.memo_cache_sentinel")) {
        x = qx.jsxs(Hn, {
          children: [qx.jsx(Text, {
            children: "/goal clear to stop early"
          }), qx.jsx(xt, {
            chord: "escape",
            action: "dismiss"
          })]
        });
        t[12] = x;
      } else {
        x = t[12];
      }
      let A;
      if (t[13] !== o.condition) {
        A = qx.jsx(fVo, {
          label: "Goal",
          children: o.condition
        });
        t[13] = o.condition;
        t[14] = A;
      } else {
        A = t[14];
      }
      let k;
      if (t[15] !== o.lastReason) {
        k = o.lastReason ? qx.jsx(fVo, {
          label: "Last check",
          children: Ad(o.lastReason.trim())
        }) : null;
        t[15] = o.lastReason;
        t[16] = k;
      } else {
        k = t[16];
      }
      let I;
      if (t[17] !== A || t[18] !== k) {
        I = qx.jsxs(gXd, {
          flexDirection: "column",
          children: [A, k]
        });
        t[17] = A;
        t[18] = k;
        t[19] = I;
      } else {
        I = t[19];
      }
      let O;
      if (t[20] !== r || t[21] !== C || t[22] !== I) {
        O = qx.jsx(or, {
          title: `${"\u25CE"} Goal active`,
          subtitle: C,
          onCancel: r,
          inputGuide: x,
          children: I
        });
        t[20] = r;
        t[21] = C;
        t[22] = I;
        t[23] = O;
      } else {
        O = t[23];
      }
      return O;
    }
    let a;
    if (t[24] !== n || t[25] !== r) {
      a = Symbol.for("react.early_return_sentinel");
      e: {
        let d = M1l(n);
        if (d) {
          let p = [];
          if (d.durationMs !== undefined) {
            p.push(formatDuration(d.durationMs, {
              mostSignificantOnly: true
            }));
          }
          if (d.iterations !== undefined) {
            p.push(`${d.iterations} ${un(d.iterations, "turn")}`);
          }
          if (d.tokens !== undefined) {
            p.push(`${formatTokens(d.tokens)} tokens`);
          }
          let m;
          if (t[27] === Symbol.for("react.memo_cache_sentinel")) {
            m = qx.jsxs(Text, {
              children: [qx.jsx(Ps, {
                status: "success",
                withSpace: true
              }), "Goal achieved"]
            });
            t[27] = m;
          } else {
            m = t[27];
          }
          let f = p.join(" \xB7 ");
          let h;
          if (t[28] === Symbol.for("react.memo_cache_sentinel")) {
            h = qx.jsxs(Hn, {
              children: [qx.jsx(Text, {
                children: "/goal <condition> to set another"
              }), qx.jsx(xt, {
                chord: "escape",
                action: "dismiss"
              })]
            });
            t[28] = h;
          } else {
            h = t[28];
          }
          let g;
          if (t[29] !== d) {
            g = qx.jsx(fVo, {
              label: "Goal",
              children: d.condition
            });
            t[29] = d;
            t[30] = g;
          } else {
            g = t[30];
          }
          let y;
          if (t[31] !== r || t[32] !== f || t[33] !== g) {
            y = qx.jsx(or, {
              title: m,
              subtitle: f,
              color: "success",
              onCancel: r,
              inputGuide: h,
              children: g
            });
            t[31] = r;
            t[32] = f;
            t[33] = g;
            t[34] = y;
          } else {
            y = t[34];
          }
          a = y;
          break e;
        }
      }
      t[24] = n;
      t[25] = r;
      t[26] = a;
    } else {
      a = t[26];
    }
    if (a !== Symbol.for("react.early_return_sentinel")) {
      return a;
    }
    let l;
    let c;
    if (t[35] === Symbol.for("react.memo_cache_sentinel")) {
      l = qx.jsx(xt, {
        chord: "escape",
        action: "dismiss"
      });
      c = qx.jsx(sc, {
        hint: "/goal <condition> to set one",
        children: "No goal set"
      });
      t[35] = l;
      t[36] = c;
    } else {
      l = t[35];
      c = t[36];
    }
    let u;
    if (t[37] !== r) {
      u = qx.jsx(or, {
        title: "Goal",
        onCancel: r,
        inputGuide: l,
        children: c
      });
      t[37] = r;
      t[38] = u;
    } else {
      u = t[38];
    }
    return u;
  }
  function Dcf(e) {
    return e + 1;
  }
  function Mcf(e) {
    return e.activeGoal;
  }
  function fVo(e) {
    let t = hVo.c(7);
    let {
      label: n,
      children: r
    } = e;
    let o;
    if (t[0] !== n) {
      o = qx.jsx(gXd, {
        flexShrink: 0,
        children: qx.jsxs(Text, {
          dimColor: true,
          children: [n, ": "]
        })
      });
      t[0] = n;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] !== r) {
      s = qx.jsx(gXd, {
        flexGrow: 1,
        children: qx.jsx(Text, {
          wrap: "wrap",
          children: r
        })
      });
      t[2] = r;
      t[3] = s;
    } else {
      s = t[3];
    }
    let i;
    if (t[4] !== o || t[5] !== s) {
      i = qx.jsxs(gXd, {
        flexDirection: "row",
        children: [o, s]
      });
      t[4] = o;
      t[5] = s;
      t[6] = i;
    } else {
      i = t[6];
    }
    return i;
  }
  var hVo;
  var Pdc;
  var qx;
  var Ddc = __lazy(() => {
    at();
    Ai();
    Ii();
    xb();
    bs();
    Vf();
    wl();
    et();
    ho();
    cs();
    Zn();
    _7e();
    hVo = __toESM(pt(), 1);
    Pdc = __toESM(ot(), 1);
    qx = __toESM(ie(), 1);
  });
  var Mdc = {};
  __export(Mdc, {
    call: () => call_export93
  });
  var Ndc;
  var call_export93 = async (e, t, n) => {
    let r = n.trim();
    if (r === "") {
      return Ndc.jsx(Odc, {
        messages: t.messages,
        onDone: () => e(undefined, {
          display: "skip"
        })
      });
    }
    if (Qnr(r)) {
      let s = OEt(t);
      e(s === null ? "No goal set" : `Goal cleared: ${s}`, {
        display: "system"
      });
      return null;
    }
    if (r.length > 4000) {
      Et("goal_set", "too_long");
      e(`Goal condition is limited to ${4000} characters (got ${r.length})`, {
        display: "system"
      });
      return null;
    }
    let o = PEt(r, t);
    if (o !== null) {
      e(o, {
        display: "system"
      });
      return null;
    }
    e(`Goal set: ${r}`, {
      shouldQuery: true,
      metaMessages: [Znr(r)]
    });
    return null;
  };
  var Ldc = __lazy(() => {
    ln();
    Ddc();
    _7e();
    Ndc = __toESM(ie(), 1);
  });
  var Fdc = {};
  __export(Fdc, {
    call: () => call_export94
  });
  var call_export94 = async (e, t) => {
    let n = e.trim();
    if (n === "") {
      let o = t.options.activeGoal;
      if (!o) {
        return {
          type: "text",
          value: "No goal set. Usage: `/goal <condition>`"
        };
      }
      let s = o.iterations === 0 ? "not yet evaluated" : `${o.iterations} ${un(o.iterations, "turn")}`;
      let i = o.lastReason ? `
${N1l(o.lastReason)}` : "";
      return {
        type: "text",
        value: `Goal active: ${o.condition} (${s})${i}`
      };
    }
    if (Qnr(n)) {
      let o = OEt(t);
      return {
        type: "text",
        value: o === null ? "No goal set" : `Goal cleared: ${o}`
      };
    }
    if (n.length > 4000) {
      Et("goal_set", "too_long");
      return {
        type: "text",
        value: `Goal condition is limited to ${4000} characters (got ${n.length})`
      };
    }
    let r = PEt(n, t);
    if (r !== null) {
      return {
        type: "text",
        value: r
      };
    }
    return {
      type: "query",
      value: `Goal set: ${n}`,
      prompt: Znr(n)
    };
  };
  var Udc = __lazy(() => {
    ln();
    Zn();
    _7e();
  });
  var Bdc = {};
  __export(Bdc, {
    goalNonInteractive: () => goalNonInteractive,
    default: () => Fcf
  });
  var Fcf;
  var goalNonInteractive;
  function $cf(e) {
    return {
      id: e.taskId,
      type: "local_workflow",
      description: e.summary ?? "Dynamic workflow",
      status: e.status,
      startTime: e.startTime,
      endTime: e.startTime + e.durationMs,
      toolUseId: undefined,
      outputFile: "",
      outputOffset: 0,
      notified: true,
      script: e.script,
      scriptPath: e.scriptPath,
      prompt: e.script,
      summary: e.summary,
      workflowName: e.workflowName,
      phases: e.phases,
      defaultModel: e.defaultModel,
      workflowRunId: e.runId,
      workflowProgress: e.workflowProgress,
      progressVersion: 0,
      agentCount: e.agentCount,
      totalTokens: e.totalTokens ?? 0,
      totalToolCalls: e.totalToolCalls ?? 0,
      logs: e.logs,
      result: e.result,
      error: e.error
    };
  }
  function Hdc(e) {
    let t = gVo.c(139);
    let {
      onDone: n
    } = e;
    Jg("workflow-history-dialog");
    let {
      rows: r
    } = h_(Sr());
    let o = bt(Ycf);
    Lo();
    let s = Rv();
    let i;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      i = [];
      t[0] = i;
    } else {
      i = t[0];
    }
    let [a, l] = che.useState(i);
    let [c, u] = che.useState(true);
    let d;
    let p;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      d = () => {
        let fe = false;
        _Va().then(me => {
          if (!fe) {
            l(me);
            u(false);
          }
        });
        return () => {
          fe = true;
        };
      };
      p = [];
      t[1] = d;
      t[2] = p;
    } else {
      d = t[1];
      p = t[2];
    }
    che.useEffect(d, p);
    let m;
    if (t[3] !== a || t[4] !== o) {
      let me = Object.values(o ?? {}).filter(Kcf);
      let Te = new Set(me.map(zcf).filter(Vcf));
      let ue = a.filter(le => !Te.vZc(le.runId)).map(Gcf);
      m = [...me.map(Wcf), ...ue].sort(qcf);
      t[3] = a;
      t[4] = o;
      t[5] = m;
    } else {
      m = t[5];
    }
    let f = m;
    let h;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      h = {
        mode: "list"
      };
      t[6] = h;
    } else {
      h = t[6];
    }
    let [g, y] = che.useState(h);
    let [_, b] = che.useState(0);
    let S = che.useRef(false);
    let E;
    if (t[7] !== c || t[8] !== f[0] || t[9] !== f.length || t[10] !== g.mode) {
      E = () => {
        if (!c && f.length === 1 && g.mode === "list" && !S.current) {
          S.current = true;
          y({
            mode: "detail",
            itemId: f[0].task.id
          });
        }
      };
      t[7] = c;
      t[8] = f[0];
      t[9] = f.length;
      t[10] = g.mode;
      t[11] = E;
    } else {
      E = t[11];
    }
    let C;
    if (t[12] !== c || t[13] !== f || t[14] !== g.mode) {
      C = [c, f, g.mode];
      t[12] = c;
      t[13] = f;
      t[14] = g.mode;
      t[15] = C;
    } else {
      C = t[15];
    }
    che.useEffect(E, C);
    let x = f[_];
    let A;
    if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
      A = () => b(jcf);
      t[16] = A;
    } else {
      A = t[16];
    }
    let k;
    if (t[17] !== f.length) {
      k = () => b(fe => Math.min(f.length - 1, fe + 1));
      t[17] = f.length;
      t[18] = k;
    } else {
      k = t[18];
    }
    let I;
    if (t[19] !== x) {
      I = () => {
        if (x) {
          y({
            mode: "detail",
            itemId: x.task.id
          });
        }
      };
      t[19] = x;
      t[20] = I;
    } else {
      I = t[20];
    }
    let O;
    if (t[21] !== I || t[22] !== k) {
      O = {
        "confirm:previous": A,
        "confirm:next": k,
        "confirm:yes": I
      };
      t[21] = I;
      t[22] = k;
      t[23] = O;
    } else {
      O = t[23];
    }
    let M = g.mode === "list";
    let L;
    if (t[24] !== M) {
      L = {
        context: "Confirmation",
        isActive: M
      };
      t[24] = M;
      t[25] = L;
    } else {
      L = t[25];
    }
    jo(O, L);
    let P = x !== undefined && x.task.script.length > 0;
    let F;
    if (t[26] !== x || t[27] !== P || t[28] !== s || t[29] !== g.mode) {
      F = fe => {
        if (g.mode !== "list") {
          return;
        }
        if (fe.ctrl || fe.meta) {
          return;
        }
        if (fe.key === "x" && x?.task.status === "running") {
          fe.preventDefault();
          killWorkflowTask(x.task.id, s);
        } else if (fe.key === "s" && P && x) {
          fe.preventDefault();
          y({
            mode: "save",
            itemId: x.task.id
          });
        }
      };
      t[26] = x;
      t[27] = P;
      t[28] = s;
      t[29] = g.mode;
      t[30] = F;
    } else {
      F = t[30];
    }
    let H = F;
    let U;
    if (t[31] !== f.length || t[32] !== n) {
      U = () => {
        if (S.current && f.length <= 1) {
          n("Dynamic workflows dialog dismissed", {
            display: "system"
          });
        } else {
          S.current = false;
          y({
            mode: "list"
          });
        }
      };
      t[31] = f.length;
      t[32] = n;
      t[33] = U;
    } else {
      U = t[33];
    }
    let N = U;
    if (g.mode === "detail") {
      let fe;
      if (t[34] !== f || t[35] !== g.itemId) {
        let Ie;
        if (t[37] !== g.itemId) {
          Ie = Ue => Ue.task.id === g.itemId;
          t[37] = g.itemId;
          t[38] = Ie;
        } else {
          Ie = t[38];
        }
        fe = f.find(Ie);
        t[34] = f;
        t[35] = g.itemId;
        t[36] = fe;
      } else {
        fe = t[36];
      }
      let me = fe;
      if (!me) {
        y({
          mode: "list"
        });
        return null;
      }
      let Te = me.task.status === "running";
      let ue = me.task;
      let ce;
      if (t[39] !== n) {
        ce = Ie => Ie ? n(Ie, {
          display: "system"
        }) : n();
        t[39] = n;
        t[40] = ce;
      } else {
        ce = t[40];
      }
      let le;
      if (t[41] !== Te || t[42] !== me.task.id || t[43] !== s) {
        le = Te ? () => killWorkflowTask(me.task.id, s) : undefined;
        t[41] = Te;
        t[42] = me.task.id;
        t[43] = s;
        t[44] = le;
      } else {
        le = t[44];
      }
      let pe;
      if (t[45] !== Te || t[46] !== me.task.id || t[47] !== s) {
        pe = Te ? () => pauseWorkflowTask(me.task.id, s) : undefined;
        t[45] = Te;
        t[46] = me.task.id;
        t[47] = s;
        t[48] = pe;
      } else {
        pe = t[48];
      }
      let ve;
      if (t[49] !== n) {
        ve = Ie => n(Ie, {
          shouldQuery: true,
          display: "system",
          metaMessages: [Ie]
        });
        t[49] = n;
        t[50] = ve;
      } else {
        ve = t[50];
      }
      let _e;
      if (t[51] !== Te || t[52] !== me.task.id || t[53] !== s) {
        _e = Te ? Ie => skipWorkflowAgent(me.task.id, Ie, s) : undefined;
        t[51] = Te;
        t[52] = me.task.id;
        t[53] = s;
        t[54] = _e;
      } else {
        _e = t[54];
      }
      let xe;
      if (t[55] !== Te || t[56] !== me.task.id || t[57] !== s) {
        xe = Te ? Ie => retryWorkflowAgent(me.task.id, Ie, s) : undefined;
        t[55] = Te;
        t[56] = me.task.id;
        t[57] = s;
        t[58] = xe;
      } else {
        xe = t[58];
      }
      let ke;
      if (t[59] !== N || t[60] !== me.task.id || t[61] !== ue || t[62] !== ce || t[63] !== le || t[64] !== pe || t[65] !== ve || t[66] !== _e || t[67] !== xe) {
        ke = SR.jsx(WorkflowDetailDialog, {
          workflow: ue,
          onDone: ce,
          onBack: N,
          onKill: le,
          onPause: pe,
          onResume: ve,
          onSkipAgent: _e,
          onRetryAgent: xe
        }, me.task.id);
        t[59] = N;
        t[60] = me.task.id;
        t[61] = ue;
        t[62] = ce;
        t[63] = le;
        t[64] = pe;
        t[65] = ve;
        t[66] = _e;
        t[67] = xe;
        t[68] = ke;
      } else {
        ke = t[68];
      }
      return ke;
    }
    if (g.mode === "save") {
      let fe;
      let me;
      let Te;
      if (t[69] !== f || t[70] !== g.itemId) {
        Te = Symbol.for("react.early_return_sentinel");
        e: {
          let pe;
          if (t[74] !== g.itemId) {
            pe = _e => _e.task.id === g.itemId;
            t[74] = g.itemId;
            t[75] = pe;
          } else {
            pe = t[75];
          }
          if (fe = f.find(pe), !fe || fe.task.script.length === 0) {
            y({
              mode: "list"
            });
            Te = null;
            break e;
          }
          let ve = fA(fe.task.script);
          me = !("error" in ve) ? ve.meta.name : zbe(fe.task.summary ?? fe.task.description);
        }
        t[69] = f;
        t[70] = g.itemId;
        t[71] = fe;
        t[72] = me;
        t[73] = Te;
      } else {
        fe = t[71];
        me = t[72];
        Te = t[73];
      }
      if (Te !== Symbol.for("react.early_return_sentinel")) {
        return Te;
      }
      let ue = me;
      let ce;
      if (t[76] !== n) {
        ce = pe => {
          if (pe) {
            n(pe, {
              display: "system"
            });
          } else {
            y({
              mode: "list"
            });
          }
        };
        t[76] = n;
        t[77] = ce;
      } else {
        ce = t[77];
      }
      let le;
      if (t[78] !== ue || t[79] !== fe.task.script || t[80] !== ce) {
        le = SR.jsx($cr, {
          script: fe.task.script,
          defaultName: ue,
          onDone: ce
        });
        t[78] = ue;
        t[79] = fe.task.script;
        t[80] = ce;
        t[81] = le;
      } else {
        le = t[81];
      }
      return le;
    }
    let W = Bn(f, Hcf);
    let j = f.length - W;
    let z;
    let V;
    let K;
    let J;
    let Q;
    let Z;
    let ne;
    let oe;
    let ee;
    let re;
    let se;
    let ae;
    if (t[82] !== j || t[83] !== H || t[84] !== c || t[85] !== f || t[86] !== n || t[87] !== r || t[88] !== W || t[89] !== x?.task.status || t[90] !== P || t[91] !== _) {
      let fe = j_(r - 7, 3, f.length);
      let {
        windowStart: me,
        windowEnd: Te,
        moreAbove: ue,
        moreBelow: ce
      } = xZt(_, f.length, fe);
      let le = f.slice(me, Te);
      let pe;
      if (t[104] !== n) {
        pe = () => n("Dynamic workflows dialog dismissed", {
          display: "system"
        });
        t[104] = n;
        t[105] = pe;
      } else {
        pe = t[105];
      }
      let ve = pe;
      if (V = gXd, ee = "column", re = 0, se = true, ae = H, z = or, K = "Dynamic workflows", t[106] !== j || t[107] !== f.length || t[108] !== W) {
        J = f.length === 0 ? undefined : SR.jsx(Text, {
          dimColor: true,
          children: SR.jsxs(Hn, {
            children: [W > 0 && `${W} running`, j > 0 && `${j} completed`]
          })
        });
        t[106] = j;
        t[107] = f.length;
        t[108] = W;
        t[109] = J;
      } else {
        J = t[109];
      }
      Q = ve;
      Z = "background";
      let _e;
      if (t[110] !== f.length) {
        _e = f.length > 0 && SR.jsx(xt, {
          chord: ["up", "down"],
          action: "select"
        });
        t[110] = f.length;
        t[111] = _e;
      } else {
        _e = t[111];
      }
      let xe;
      if (t[112] !== f.length) {
        xe = f.length > 0 && SR.jsx(xt, {
          chord: "enter",
          action: "view"
        });
        t[112] = f.length;
        t[113] = xe;
      } else {
        xe = t[113];
      }
      let ke;
      if (t[114] !== x?.task.status) {
        ke = x?.task.status === "running" && SR.jsx(xt, {
          chord: "x",
          action: "stop"
        });
        t[114] = x?.task.status;
        t[115] = ke;
      } else {
        ke = t[115];
      }
      let Ie;
      if (t[116] !== P) {
        Ie = P && SR.jsx(xt, {
          chord: "s",
          action: "save"
        });
        t[116] = P;
        t[117] = Ie;
      } else {
        Ie = t[117];
      }
      let Ue;
      if (t[118] === Symbol.for("react.memo_cache_sentinel")) {
        Ue = SR.jsx(xt, {
          chord: "escape",
          action: "close"
        });
        t[118] = Ue;
      } else {
        Ue = t[118];
      }
      if (t[119] !== _e || t[120] !== xe || t[121] !== ke || t[122] !== Ie) {
        ne = SR.jsxs(Hn, {
          children: [_e, xe, ke, Ie, Ue]
        });
        t[119] = _e;
        t[120] = xe;
        t[121] = ke;
        t[122] = Ie;
        t[123] = ne;
      } else {
        ne = t[123];
      }
      oe = c ? SR.jsx(Xc, {
        message: "Loading dynamic workflow history\u2026",
        dimColor: true
      }) : f.length === 0 ? SR.jsx(sc, {
        children: "No dynamic workflows in this session."
      }) : SR.jsxs(gXd, {
        flexDirection: "column",
        children: [ue > 0 && SR.jsxs(Text, {
          dimColor: true,
          children: ["  ", vGd.arrowUp, " ", ue, " more above"]
        }), le.map((Ge, Be) => SR.jsx(Jcf, {
          item: Ge,
          isSelected: me + Be === _
        }, Ge.task.id)), ce > 0 && SR.jsxs(Text, {
          dimColor: true,
          children: ["  ", vGd.arrowDown, " ", ce, " more below"]
        })]
      });
      t[82] = j;
      t[83] = H;
      t[84] = c;
      t[85] = f;
      t[86] = n;
      t[87] = r;
      t[88] = W;
      t[89] = x?.task.status;
      t[90] = P;
      t[91] = _;
      t[92] = z;
      t[93] = V;
      t[94] = K;
      t[95] = J;
      t[96] = Q;
      t[97] = Z;
      t[98] = ne;
      t[99] = oe;
      t[100] = ee;
      t[101] = re;
      t[102] = se;
      t[103] = ae;
    } else {
      z = t[92];
      V = t[93];
      K = t[94];
      J = t[95];
      Q = t[96];
      Z = t[97];
      ne = t[98];
      oe = t[99];
      ee = t[100];
      re = t[101];
      se = t[102];
      ae = t[103];
    }
    let de;
    if (t[124] !== z || t[125] !== K || t[126] !== J || t[127] !== Q || t[128] !== Z || t[129] !== ne || t[130] !== oe) {
      de = SR.jsx(z, {
        title: K,
        subtitle: J,
        onCancel: Q,
        color: Z,
        inputGuide: ne,
        children: oe
      });
      t[124] = z;
      t[125] = K;
      t[126] = J;
      t[127] = Q;
      t[128] = Z;
      t[129] = ne;
      t[130] = oe;
      t[131] = de;
    } else {
      de = t[131];
    }
    let be;
    if (t[132] !== V || t[133] !== ee || t[134] !== re || t[135] !== se || t[136] !== ae || t[137] !== de) {
      be = SR.jsx(V, {
        flexDirection: ee,
        tabIndex: re,
        autoFocus: se,
        onKeyDown: ae,
        children: de
      });
      t[132] = V;
      t[133] = ee;
      t[134] = re;
      t[135] = se;
      t[136] = ae;
      t[137] = de;
      t[138] = be;
    } else {
      be = t[138];
    }
    return be;
  }
  function Hcf(e) {
    return e.task.status === "running";
  }
  function jcf(e) {
    return Math.max(0, e - 1);
  }
  function qcf(e, t) {
    return t.task.startTime - e.task.startTime;
  }
  function Wcf(e) {
    return {
      task: e
    };
  }
  function Gcf(e) {
    return {
      task: $cf(e),
      snapshot: e
    };
  }
  function Vcf(e) {
    return !!e;
  }
  function zcf(e) {
    return e.workflowRunId;
  }
  function Kcf(e) {
    return e.type === "local_workflow";
  }
  function Ycf(e) {
    return e.tasks;
  }
  function Jcf(e) {
    let t = gVo.c(27);
    let {
      item: n,
      isSelected: r
    } = e;
    let o = n.task;
    let s = n.snapshot;
    let i;
    let a;
    e: switch (o.status) {
      case "completed":
        {
          i = vGd.tick;
          a = "success";
          break e;
        }
      case "failed":
      case "killed":
        {
          i = vGd.cross;
          a = "error";
          break e;
        }
      default:
        i = "\u27F3";
        a = undefined;
    }
    let l = s?.totalTokens ?? o.totalTokens ?? 0;
    let c;
    if (t[0] !== o.endTime) {
      c = o.endTime ?? Date.now();
      t[0] = o.endTime;
      t[1] = c;
    } else {
      c = t[1];
    }
    let u = Math.max(0, c - o.startTime - (o.totalPausedMs ?? 0));
    let d;
    if (t[2] !== o.agentCount) {
      d = o.agentCount > 0 ? `${o.agentCount} ${un(o.agentCount, "agent")}` : null;
      t[2] = o.agentCount;
      t[3] = d;
    } else {
      d = t[3];
    }
    let p;
    if (t[4] !== l) {
      p = l > 0 ? `${formatTokens(l)} tok` : null;
      t[4] = l;
      t[5] = p;
    } else {
      p = t[5];
    }
    let m;
    if (t[6] !== u) {
      m = formatDuration(u);
      t[6] = u;
      t[7] = m;
    } else {
      m = t[7];
    }
    let f;
    if (t[8] !== d || t[9] !== p || t[10] !== m) {
      f = [d, p, m].filter(Boolean);
      t[8] = d;
      t[9] = p;
      t[10] = m;
      t[11] = f;
    } else {
      f = t[11];
    }
    let h = f;
    let g = o.workflowName ?? o.summary ?? o.description;
    let y = g.length > 50 ? g.slice(0, 49) + "\u2026" : g;
    let _ = r ? vGd.pointer + " " : "  ";
    let b;
    if (t[12] !== _) {
      b = SR.jsx(Text, {
        children: _
      });
      t[12] = _;
      t[13] = b;
    } else {
      b = t[13];
    }
    let S = r ? "suggestion" : undefined;
    let E;
    if (t[14] !== i || t[15] !== a) {
      E = SR.jsx(Text, {
        color: a,
        children: i
      });
      t[14] = i;
      t[15] = a;
      t[16] = E;
    } else {
      E = t[16];
    }
    let C = h.join(" \xB7 ");
    let x;
    if (t[17] !== C) {
      x = SR.jsxs(Text, {
        dimColor: true,
        children: ["  ", C]
      });
      t[17] = C;
      t[18] = x;
    } else {
      x = t[18];
    }
    let A;
    if (t[19] !== y || t[20] !== x || t[21] !== S || t[22] !== E) {
      A = SR.jsxs(Text, {
        color: S,
        children: [E, " ", y, x]
      });
      t[19] = y;
      t[20] = x;
      t[21] = S;
      t[22] = E;
      t[23] = A;
    } else {
      A = t[23];
    }
    let k;
    if (t[24] !== A || t[25] !== b) {
      k = SR.jsxs(gXd, {
        children: [b, A]
      });
      t[24] = A;
      t[25] = b;
      t[26] = k;
    } else {
      k = t[26];
    }
    return k;
  }
  var gVo;
  var che;
  var SR;
  var jdc = __lazy(() => {
    ho();
    _9();
    rE();
    px();
    ki();
    Q8();
    et();
    Bs();
    Dpe();
    Bse();
    VNe();
    DJ();
    cs();
    Zn();
    Ai();
    Ii();
    xb();
    bs();
    Pv();
    Gar();
    b9o();
    qcr();
    gVo = __toESM(pt(), 1);
    che = __toESM(ot(), 1);
    SR = __toESM(ie(), 1);
  });
  var qdc = {};
  __export(qdc, {
    call: () => call_export95
  });
  async function call_export95(e, t) {
    return Wdc.jsx(Hdc, {
      toolUseContext: t,
      onDone: e
    });
  }
  var Wdc;
  var Gdc = __lazy(() => {
    jdc();
    Wdc = __toESM(ie(), 1);
  });
  var Vdc = {};
  __export(Vdc, {
    default: () => Qcf
  });
  var Qcf;
  async function Jdr() {
    if (!(await Qm("gh"))) {
      return "not_installed";
    }
    try {
      let {
        exitCode: t
      } = await _C("gh", ["auth", "token"], {
        stdout: "ignore",
        stderr: "ignore",
        timeout: 5000,
        reject: false
      });
      return t === 0 ? "authenticated" : "not_authenticated";
    } catch {
      return "not_installed";
    }
  }
  var yVo = __lazy(() => {
    oF();
  });
  async function Kdc(e) {
    let t;
    try {
      t = await _s.post("/v1/code/github/import-token", {
        token: e.reveal()
      }, {
        headers: {
          "anthropic-beta": Q4r.header
        },
        auth: "teleport-org",
        timeout: 15000,
        validateStatus: () => true
      });
    } catch (n) {
      if (isAxiosError(n)) {
        logForDebugging(`import-token network error: ${n.code ?? "unknown"}`, {
          level: "error"
        });
        return {
          ok: false,
          error: {
            kind: "network"
          }
        };
      }
      return {
        ok: false,
        error: {
          kind: "not_signed_in"
        }
      };
    }
    if (!t.ok) {
      return {
        ok: false,
        error: {
          kind: "not_signed_in"
        }
      };
    }
    if (t.status === 200) {
      return {
        ok: true,
        result: t.data
      };
    }
    if (t.status === 400) {
      return {
        ok: false,
        error: {
          kind: "invalid_token"
        }
      };
    }
    if (t.status === 401) {
      return {
        ok: false,
        error: {
          kind: "not_signed_in"
        }
      };
    }
    logForDebugging(`import-token returned ${t.status}`, {
      level: "error"
    });
    return {
      ok: false,
      error: {
        kind: "server",
        status: t.status
      }
    };
  }
  async function Ydc() {
    try {
      await prepareApiRequest();
      return true;
    } catch {
      return false;
    }
  }
  async function Jdc() {
    try {
      let e = await _s.get("/api/oauth/organizations/:orgUUID/sync/github/auth", {
        auth: "teleport-org",
        timeout: 1e4,
        validateStatus: () => true
      });
      if (!e.ok || e.status !== 200 || !e.data?.is_authenticated) {
        return null;
      }
      let t = e.data.auth_source;
      return t === "oauth" || t === "cli_import" ? t : null;
    } catch {
      return null;
    }
  }
  function Xdr() {
    return `${getOauthConfig().CLAUDE_AI_ORIGIN}/code`;
  }
  var _Vo;
  var Xdc = __lazy(() => {
    KN();
    Uc();
    pk();
    bg();
    je();
    NC();
    _Vo = class _Vo {
      #e;
      constructor(e) {
        this.#e = e;
      }
      reveal() {
        return this.#e;
      }
      toString() {
        return "[REDACTED:gh-token]";
      }
      toJSON() {
        return "[REDACTED:gh-token]";
      }
      [Symbol.for("nodejs.util.inspect.custom")]() {
        return "[REDACTED:gh-token]";
      }
    };
  });
  var Qdc = {};
  __export(Qdc, {
    call: () => call_export96
  });
  async function euf() {
    if (!(await Ydc())) {
      return {
        status: "not_signed_in"
      };
    }
    let e = await Jdr();
    if (e === "not_installed") {
      return {
        status: "gh_not_installed"
      };
    }
    if (e === "not_authenticated") {
      return {
        status: "gh_not_authenticated"
      };
    }
    let {
      stdout: t
    } = await _C("gh", ["auth", "token"], {
      stdout: "pipe",
      stderr: "ignore",
      timeout: 5000,
      reject: false
    });
    let n = t.trim();
    if (!n) {
      return {
        status: "gh_not_authenticated"
      };
    }
    return {
      status: "has_gh_token",
      token: new _Vo(n)
    };
  }
  function tuf(e, t) {
    switch (e.kind) {
      case "not_signed_in":
        return `Login failed. Please visit ${t} and login using the GitHub App`;
      case "invalid_token":
        return "GitHub rejected that token. Run `gh auth login` and try again.";
      case "server":
        return `Server error (${e.status}). Try again in a moment.`;
      case "network":
        return "Couldn't reach the server. Check your connection.";
    }
  }
  function nuf({
    onDone: e
  }) {
    let [t, n] = QCt.useState({
      name: "checking"
    });
    let r = QCt.useRef(false);
    QCt.useEffect(() => {
      logEvent("tengu_remote_setup_started", {});
      euf().then(async a => {
        if (r.current) {
          return;
        }
        switch (a.status) {
          case "not_signed_in":
            logEvent("tengu_remote_setup_result", {
              result: "not_signed_in"
            });
            e("Not signed in to Claude. Run /login first.");
            return;
          case "gh_not_installed":
          case "gh_not_authenticated":
            {
              let l = `${Xdr()}/onboarding?step=alt-auth`;
              if (await Ac(l), r.current) {
                return;
              }
              logEvent("tengu_remote_setup_result", {
                result: a.status
              });
              e(a.status === "gh_not_installed" ? `GitHub CLI not found. Install it via https://cli.github.com/, then run \`gh auth login\`, or connect GitHub on the web: ${l}` : `GitHub CLI not authenticated. Run \`gh auth login\` and try again, or connect GitHub on the web: ${l}`);
              return;
            }
          case "has_gh_token":
            {
              let l = await Jdc();
              if (r.current) {
                return;
              }
              n({
                name: "confirm",
                token: a.token,
                existingOAuth: l === "oauth"
              });
            }
        }
      });
    }, []);
    let o = () => {
      r.current = true;
      logEvent("tengu_remote_setup_result", {
        result: "cancelled"
      });
      e();
    };
    let s = async a => {
      n({
        name: "uploading"
      });
      let l = await Kdc(a);
      if (r.current) {
        return;
      }
      if (!l.ok) {
        logEvent("tengu_remote_setup_result", {
          result: "import_failed",
          error_kind: l.error.kind
        });
        e(tuf(l.error, Xdr()));
        return;
      }
      let c = true;
      try {
        c = (await Koe()).length === 0;
      } catch {
        c = true;
      }
      if (r.current) {
        return;
      }
      if (c) {
        try {
          await Tgt();
        } catch (d) {
          logForDebugging(`[web-setup] Failed to create default environment: ${d}`, {
            level: "warn"
          });
        }
        if (r.current) {
          return;
        }
      }
      let u = Xdr();
      if (await Ac(u), r.current) {
        return;
      }
      logEvent("tengu_remote_setup_result", {
        result: "success"
      });
      e(`Connected as ${l.result.github_username}. Opened ${u}`);
    };
    if (t.name === "checking" || t.name === "uploading") {
      return gee.jsx(or, {
        title: "Connect Claude on the web to GitHub?",
        onCancel: o,
        hideInputGuide: true,
        children: gee.jsx(Xc, {
          message: t.name === "uploading" ? "Connecting GitHub to Claude\u2026" : "Checking login status\u2026"
        })
      });
    }
    let i = t.token;
    return gee.jsxs(or, {
      title: "Connect Claude on the web to GitHub?",
      onCancel: o,
      hideInputGuide: true,
      children: [gee.jsxs(gXd, {
        flexDirection: "column",
        children: [gee.jsx(Text, {
          children: "Claude on the web requires connecting to your GitHub account to clone and push code on your behalf."
        }), gee.jsx(Text, {
          dimColor: true,
          children: "Your local credentials are used to authenticate with GitHub"
        }), t.existingOAuth && gee.jsx(gXd, {
          marginTop: 1,
          children: gee.jsxs(Text, {
            color: "warning",
            children: ["You're already connected via the GitHub App. Continuing replaces your authentication credential for Claude Code on the web. Your repository access will change to reflect your local token's scopes. You can reconnect the GitHub App from", " ", fEe(), " later."]
          })
        })]
      }), gee.jsx(mc, {
        confirmLabel: t.existingOAuth ? "Replace connection" : "Continue",
        cancelLabel: "Cancel",
        onConfirm: () => void s(i),
        onCancel: o
      })]
    });
  }
  async function call_export96(e) {
    return gee.jsx(nuf, {
      onDone: e
    });
  }
  var QCt;
  var gee;
  var Zdc = __lazy(() => {
    b_();
    Ii();
    Pv();
    et();
    Ot();
    l9();
    ky();
    je();
    yVo();
    oF();
    Ppe();
    Xdc();
    QCt = __toESM(ot(), 1);
    gee = __toESM(ie(), 1);
  });
  var epc = {};
  __export(epc, {
    default: () => ouf
  });
  var ouf;
  async function opc(e, t) {
    let n = {
      slashCommandCounts: new Map(),
      mcpServerCounts: new Map(),
      sessionDescriptors: [],
      sessionFileCount: 0
    };
    let r = Date.now() - t * 24 * 60 * 60 * 1000;
    let o;
    try {
      o = await ZCt.readdir(e);
    } catch (a) {
      if (Io(a)) {
        return n;
      }
      throw a;
    }
    let s = o.filter(a => Qdr.extname(a) === ".jsonl");
    let i = (await Promise.all(s.map(async a => {
      let l = Qdr.join(e, a);
      try {
        let c = await ZCt.stat(l);
        if (!c.isFile() || c.mtimeMs < r || c.size > 52428800) {
          return null;
        }
        return l;
      } catch (c) {
        if (Io(c)) {
          return null;
        }
        throw c;
      }
    }))).filter(a => a !== null);
    for (let a of i) {
      let l;
      try {
        l = await ZCt.readFile(a, "utf-8");
      } catch (u) {
        if (Io(u)) {
          continue;
        }
        throw u;
      }
      n.sessionFileCount++;
      let c = {
        prNumbers: []
      };
      for (let u of l.split(`
`)) {
        if (u.length < 10) {
          continue;
        }
        if (u.includes('"content":"<command-name>/') || u.includes('"content":"<command-message>')) {
          for (let d of u.matchAll(luf)) {
            let p = d[1];
            n.slashCommandCounts.set(p, (n.slashCommandCounts.get(p) ?? 0) + 1);
          }
        }
        if (u.includes('"type":"tool_use"') && u.includes('"name":"mcp__')) {
          for (let d of u.matchAll(cuf)) {
            let p = d[1];
            n.mcpServerCounts.set(p, (n.mcpServerCounts.get(p) ?? 0) + 1);
          }
        }
        if (u.includes('"type":"custom-title"')) {
          let d = huf.exec(u);
          if (d) {
            c.title = d[1];
          }
        }
        if (u.includes('"type":"pr-link"')) {
          let d = guf.exec(u);
          if (d) {
            let p = Number(d[1]);
            if (!c.prNumbers.includes(p)) {
              c.prNumbers.push(p);
            }
          }
        }
        if (!c.firstMessage && u.includes('"role":"user"') && !u.includes('"content":"<command-name>/') && !u.includes('"content":[')) {
          let d = yuf.exec(u);
          if (d) {
            let p = d[1].replace(/\\n/g, " ").replace(/\\"/g, '"');
            if (p.length > 3 && !p.startsWith("<")) {
              c.firstMessage = p.slice(0, 200);
            }
          }
        }
      }
      if (c.title || c.prNumbers.length > 0 || c.firstMessage) {
        n.sessionDescriptors.push(c);
      }
    }
    if (n.sessionDescriptors.length > 60) {
      n.sessionDescriptors.sort((a, l) => {
        let c = (a.title ? 2 : 0) + (a.prNumbers.length > 0 ? 1 : 0);
        return (l.title ? 2 : 0) + (l.prNumbers.length > 0 ? 1 : 0) - c;
      });
      n.sessionDescriptors = n.sessionDescriptors.slice(0, 60);
    }
    return n;
  }
  var ZCt;
  var Qdr;
  var luf;
  var cuf;
  var huf;
  var guf;
  var yuf;
  var spc = __lazy(() => {
    dt();
    ZCt = require("fs/promises");
    Qdr = require("path");
    luf = /<command-name>\/([\w:-]+)<\/command-name>/g;
    cuf = /"name":"mcp__([^"]+?)__([^"]+)"/g;
    huf = /"customTitle":"([^"]+)"/;
    guf = /"prNumber":(\d+)/;
    yuf = /"role":"user"[^}]*"content":"([^"]+)"/;
  });
  var apc = {};
  __export(apc, {
    default: () => Ruf
  });
  function buf(e) {
    try {
      return new URL(e).origin;
    } catch {
      return;
    }
  }
  async function Suf(e) {
    try {
      let t = await ipc.readFile(Zdr.join(e, ".mcp.json"), "utf8");
      let n = qt(t);
      if (n && typeof n === "object" && "mcpServers" in n && n.mcpServers && typeof n.mcpServers === "object") {
        return n.mcpServers;
      }
    } catch (t) {
      if (!fn(t)) {
        logForDebugging(`team-onboarding: failed to read .mcp.json: ${t instanceof Error ? t.message : String(t)}`, {
          level: "error"
        });
      }
    }
    return {};
  }
  async function Tuf(e) {
    let t = getOriginalCwd();
    let n = Cj(t);
    let r = await opc(n, e);
    let o = [...r.slashCommandCounts.entries()].sort((u, d) => d[1] - u[1]).map(([u, d]) => ({
      name: `/${u}`,
      count: d
    }));
    let s = await Suf(t);
    let i = [...r.mcpServerCounts.entries()].sort((u, d) => d[1] - u[1]).map(([u, d]) => {
      let p = s[u];
      return {
        name: u,
        callCount: d,
        urlOrigin: typeof p?.url === "string" ? buf(p.url) : undefined
      };
    });
    let a = (await execFileNoThrowWithCwd("git", ["config", "user.name"], {
      cwd: t
    })).stdout.trim();
    let l = (await execFileNoThrowWithCwd("git", ["remote", "get-url", "origin"], {
      cwd: t
    })).stdout.trim();
    return {
      usageData: De({
        generatedBy: a || undefined,
        currentRepo: normalizeGitRemoteUrl(l) ?? Zdr.basename(t),
        windowDays: e,
        sessionCount: r.sessionFileCount,
        slashCommands: o,
        mcpServers: i,
        sessionDescriptors: r.sessionDescriptors
      }, null, 2),
      sessionCount: r.sessionFileCount,
      slashCommandCount: r.slashCommandCounts.size,
      mcpServerCount: r.mcpServerCounts.size
    };
  }
  var ipc;
  var Zdr;
  var Euf = `# Welcome to [Team Name]

## How We Use Claude

Based on [name]'s usage over the last [N] days:

Work Type Breakdown:
  [Category 1]  [ascii bar]  [N]%
  [Category 2]  [ascii bar]  [N]%
  [Category 3]  [ascii bar]  [N]%
  ...

Top Skills & Commands:
  [/command]  [ascii bar]  [N]x/month
  ...

Top MCP Servers:
  [Server]  [ascii bar]  [N] calls
  ...

## Your Setup Checklist

### Codebases
- [ ] [repo-name] \u2014 [repo url]
...

### MCP Servers to Activate
- [ ] [Server] \u2014 [what it's for]. [How to get access]
...

### Skills to Know About
- [/command] \u2014 [what it does, when the team uses it]
...

## Team Tips

_TODO_

## Get Started

_TODO_

<!-- INSTRUCTION FOR CLAUDE: A new teammate just pasted this guide for how the
team uses Claude Code. You're their onboarding buddy \u2014 warm, conversational,
not lecture-y.

Open with a warm welcome \u2014 include the team name from the title. Then: "Your
teammate uses Claude Code for [list all the work types]. Let's get you started."

Check what's already in place against everything under Setup Checklist
(including skills), using markdown checkboxes \u2014 [x] done, [ ] not yet. Lead
with what they already have. One sentence per item, all in one message.

Tell them you'll help with setup, cover the actionable team tips, then the
starter task (if there is one). Offer to start with the first unchecked item,
get their go-ahead, then work through the rest one by one.

After setup, walk them through the remaining sections \u2014 offer to help where you
can (e.g. link to channels), and just surface the purely informational bits.

Don't invent sections or summaries that aren't in the guide. The stats are the
guide creator's personal usage data \u2014 don't extrapolate them into a "team
workflow" narrative. -->`;
  var vuf = `You are helping a power user generate an onboarding guide for teammates who are new to Claude Code. The guide will live in the team's onboarding docs and can be pasted into Claude for an interactive walkthrough.

You're co-authoring this with them \u2014 collaborative and helpful, like a teammate who's done this before and is happy to share.

## Usage data (last {{WINDOW_DAYS}} days)

This was scanned from the guide creator's local Claude Code transcripts:

\`\`\`json
{{USAGE_DATA}}
\`\`\`

## Your task

Before anything else \u2014 including before thinking through the classification \u2014 output exactly this line as your first visible text:

> Looking at how you've used Claude over the last {{WINDOW_DAYS}} days to put together an onboarding guide for teammates new to Claude Code.

This must come before any extended thinking about session descriptors. The guide creator is staring at a blank screen until you do. Classification is step 2, not step 1.

Generate the guide immediately, then ask for revisions. Don't wait for answers first \u2014 it's easier for the guide creator to edit a concrete draft than answer abstract questions.

1. **Output the acknowledgment line above.** No thinking, no classification, no tool calls before this. One line, then move on.

2. **Derive the work-type breakdown.** Read the \`sessionDescriptors\` array \u2014 each entry describes one session via its title, any linked code reviews (\`prNumbers\`), and first user message. Classify each session into one of these task types:

   - **build_feature** \u2014 new functionality, scripts, tools, config/CI/env setup
   - **debug_fix** \u2014 investigating and fixing bugs
   - **improve_quality** \u2014 refactoring, tests, cleanup, code review
   - **analyze_data** \u2014 queries, metrics, number crunching
   - **plan_design** \u2014 architecture, approach, strategy, understanding unfamiliar code, design review
   - **prototype** \u2014 spikes, POCs, throwaway exploration
   - **write_docs** \u2014 PRDs, RFCs, READMEs, design docs, copy/doc review

   Categories describe the *type of task*, not the project or domain \u2014 a teammate on any project should recognize them. Review sessions belong with whatever's being reviewed: code review is improve_quality, doc review is write_docs, design review is plan_design. Most sessions fit the list; only invent a new category if it's genuinely a different type of task. Pick the top 3-5 with rough percentages. First messages alone are usually enough; titles and code-review links are enrichment. If first messages are uninformative, use tool and MCP counts as a weak hint. If there are ~0 sessions, leave the breakdown as a TODO.

   In the rendered guide, display categories with spaces and title case (e.g. "Build Feature" not "build_feature").

3. **Gather the remaining pieces.** For repos, start with \`currentRepo\` and check the workspace for sibling repo directories. For MCP server setup, use each entry's \`name\` (and \`urlOrigin\` where present) to infer what the server does and how a teammate would get access. Leave the Team Tips and Get Started sections as TODO placeholders \u2014 you'll ask for these in Review and fill them in after.

4. **Write the guide to \`ONBOARDING.md\`** following this template:

\`\`\`
{{GUIDE_TEMPLATE}}
\`\`\`

   Fill in real numbers from the usage data (not placeholders). Use \`generatedBy\` for the name; if it's missing, omit the name. Ascii bar charts: \`\u2588\` for filled, \`\u2591\` for empty, 20 chars wide. Keep the HTML comment instruction at the bottom exactly as shown.

5. **Render the guide in a code block, then close out the first turn.** You're co-authoring this guide with the guide creator \u2014 frame the follow-up as collaboration, not corrections.

   After the code block, add a \`---\` horizontal rule and a \`**Review**\` heading so the guide is visually separated from your questions. Under the heading, number these three questions:

   1. "I went with '[X]' for the team name \u2014 let me know if that sounds right." (or if you couldn't tell: "What's the team name? I'll add it in.")
   2. Is there a starter task for someone new to Claude Code? (ticket or doc link \u2014 optional)
   3. Any team tips you'd tell a new teammate that aren't already in CLAUDE.md?

   After they answer, update \`ONBOARDING.md\` with their team name, tips, and starter task. Then close with this exact line (not numbered, not paraphrased):

   Saved to \`ONBOARDING.md\`. Drop it in your team docs and channels \u2014 when a new teammate pastes it into Claude Code, they get a guided onboarding tour from there.

   Apply any edits they come back with to the file.`;
  var wuf;
  var Cuf;
  var Ruf;
  var cpc = {};
  __export(cpc, {
    default: () => kuf
  });
  var kuf;
  function Iuf() {
    return process.env.CLAUDE_JOB_DIR;
  }
  async function epr(e) {
    logEvent("tengu_bg_agent_action", {
      action: "stop",
      source: e,
      jobSessionId: br(getSessionId())
    });
    let t = Iuf();
    if (li() && t) {
      let n = new Date().toISOString();
      let r = await Zi(t);
      if (r && !Xg(r)) {
        await ip(t, {
          ...r,
          state: "stopped",
          detail: "stopped from session",
          tempo: "idle",
          needs: undefined,
          block: undefined,
          inFlight: undefined,
          updatedAt: n,
          firstTerminalAt: r.firstTerminalAt ?? n
        }).catch(lf);
      }
      if (uRn()) {
        process.stdout.write(Tfe("Session stopped."));
      }
    }
    Pe("job_stop_self");
    return gracefulShutdown(0, "prompt_input_exit", {
      suppressResumeHint: true
    });
  }
  var bVo = __lazy(() => {
    at();
    pL();
    ln();
    Ot();
    B_();
    yd();
    lm();
    zf();
  });
  var dpc = {};
  __export(dpc, {
    call: () => call_export97
  });
  async function call_export97(e) {
    e();
    await epr("stop_command");
    return null;
  }
  var ppc = __lazy(() => {
    bVo();
  });
  var mpc = {};
  __export(mpc, {
    call: () => call_export98
  });
  async function call_export98() {
    await epr("bridge");
    return {
      type: "skip"
    };
  }
  var fpc = __lazy(() => {
    bVo();
  });
  var hpc = {};
  __export(hpc, {
    stopNonInteractive: () => stopNonInteractive,
    default: () => Duf
  });
  var Duf;
  var stopNonInteractive;
  var Rpc = {};
  __export(Rpc, {
    normalizeSessionMeta: () => normalizeSessionMeta,
    generateUsageReport: () => generateUsageReport,
    extractToolStats: () => extractToolStats,
    detectMultiClauding: () => detectMultiClauding,
    default: () => cdf,
    deduplicateSessionBranches: () => deduplicateSessionBranches,
    buildInsightsResponsePrompt: () => buildInsightsResponsePrompt,
    buildExportData: () => buildExportData,
    aggregateData: () => aggregateData
  });
  function _pc() {
    return getDefaultOpusModel();
  }
  function Luf() {
    return getDefaultOpusModel();
  }
  function Htn() {
    return xK.join(er(), "usage-data");
  }
  function npr() {
    return xK.join(Htn(), "facets");
  }
  function SVo() {
    return xK.join(Htn(), "session-meta");
  }
  function $uf(e) {
    let t = xK.extname(e).toLowerCase();
    return Fuf[t] || null;
  }
  function $tn(e) {
    return typeof e === "string" ? e : "";
  }
  function extractToolStats(e) {
    let t = {};
    let n = {};
    let r = 0;
    let o = 0;
    let s = 0;
    let i = 0;
    let a = 0;
    let l = [];
    let c = 0;
    let u = {};
    let d = false;
    let p = 0;
    let m = 0;
    let f = new Set();
    let h = [];
    let g = [];
    let y = false;
    let _ = false;
    let b = false;
    let S = null;
    for (let E of e.messages) {
      let C = E.timestamp;
      if (E.type === "assistant" && E.message) {
        if (C) {
          S = C;
        }
        let x = E.message.usage;
        if (x) {
          s += x.input_tokens || 0;
          i += x.output_tokens || 0;
        }
        let A = E.message.content;
        if (Array.isArray(A)) {
          for (let k of A) {
            if (k.type === "tool_use" && "name" in k) {
              let I = k.name;
              if (t[I] = (t[I] || 0) + 1, I === "Agent" || I === "Task") {
                d = true;
              }
              if (I.startsWith("mcp__")) {
                y = true;
              }
              if (I === "WebSearch") {
                _ = true;
              }
              if (I === "WebFetch") {
                b = true;
              }
              let O = k.input;
              if (O) {
                let M = $tn(O.file_path);
                if (M) {
                  let P = $uf(M);
                  if (P) {
                    n[P] = (n[P] || 0) + 1;
                  }
                  if (I === "Edit" || I === "Write") {
                    f.add(M);
                  }
                }
                if (I === "Edit") {
                  let P = $tn(O.old_string);
                  let F = $tn(O.new_string);
                  for (let H of kDe(P, F)) {
                    if (H.added) {
                      p += H.count || 0;
                    }
                    if (H.removed) {
                      m += H.count || 0;
                    }
                  }
                }
                if (I === "Write") {
                  let P = $tn(O.content);
                  if (P) {
                    p += Ru(P, `
`) + 1;
                  }
                }
                let L = $tn(O.command);
                if (L.includes("git commit")) {
                  r++;
                }
                if (L.includes("git push")) {
                  o++;
                }
              }
            }
          }
        }
      }
      if (E.type === "user" && E.message) {
        let x = E.message.content;
        let A = false;
        if (typeof x === "string" && x.trim()) {
          A = true;
        } else if (Array.isArray(x)) {
          for (let k of x) {
            if (k.type === "text" && "text" in k) {
              A = true;
              break;
            }
          }
        }
        if (A) {
          if (C) {
            let k = new Date(C);
            if (Number.isFinite(k.getTime())) {
              let I = k.getHours();
              h.push(I);
              g.push(C);
            }
          }
          if (S && C) {
            let k = new Date(S).getTime();
            let O = (new Date(C).getTime() - k) / 1000;
            if (O > 2 && O < 3600) {
              l.push(O);
            }
          }
        }
        if (Array.isArray(x)) {
          for (let k of x) {
            if (k.type === "tool_result" && "content" in k) {
              if (k.is_error) {
                c++;
                let O = k.content;
                let M = "Other";
                if (typeof O === "string") {
                  let L = O.toLowerCase();
                  if (L.includes("exit code")) {
                    M = "Command Failed";
                  } else if (L.includes("rejected") || L.includes("doesn't want")) {
                    M = "User Rejected";
                  } else if (L.includes("string to replace not found") || L.includes("no changes")) {
                    M = "Edit Failed";
                  } else if (L.includes("modified since read")) {
                    M = "File Changed";
                  } else if (L.includes("exceeds maximum") || L.includes("too large")) {
                    M = "File Too Large";
                  } else if (L.includes("file not found") || L.includes("does not exist")) {
                    M = "File Not Found";
                  }
                }
                u[M] = (u[M] || 0) + 1;
              }
            }
          }
        }
        if (typeof x === "string") {
          if (x.includes("[Request interrupted by user")) {
            a++;
          }
        } else if (Array.isArray(x)) {
          for (let k of x) {
            if (k.type === "text" && "text" in k && k.text.includes("[Request interrupted by user")) {
              a++;
              break;
            }
          }
        }
      }
    }
    return {
      toolCounts: t,
      languages: n,
      gitCommits: r,
      gitPushes: o,
      inputTokens: s,
      outputTokens: i,
      userInterruptions: a,
      userResponseTimes: l,
      toolErrors: c,
      toolErrorCategories: u,
      usesTaskAgent: d,
      usesMcp: y,
      usesWebSearch: _,
      usesWebFetch: b,
      linesAdded: p,
      linesRemoved: m,
      filesModified: f,
      messageHours: h,
      userMessageTimestamps: g
    };
  }
  function Huf(e) {
    return !Number.isNaN(e.created.getTime()) && !Number.isNaN(e.modified.getTime());
  }
  function EVo(e) {
    let t = extractToolStats(e);
    let n = getSessionIdFromLog(e) || "unknown";
    let r = e.created.toISOString();
    let o = Math.round((e.modified.getTime() - e.created.getTime()) / 1000 / 60);
    let s = 0;
    let i = 0;
    for (let a of e.messages) {
      if (a.type === "assistant") {
        i++;
      }
      if (a.type === "user" && a.message) {
        let l = a.message.content;
        let c = false;
        if (typeof l === "string" && l.trim()) {
          c = true;
        } else if (Array.isArray(l)) {
          for (let u of l) {
            if (u.type === "text" && "text" in u) {
              c = true;
              break;
            }
          }
        }
        if (c) {
          s++;
        }
      }
    }
    return {
      session_id: n,
      project_path: e.relocatedCwd ?? e.projectPath ?? "",
      start_time: r,
      duration_minutes: o,
      user_message_count: s,
      assistant_message_count: i,
      tool_counts: t.toolCounts,
      languages: t.languages,
      git_commits: t.gitCommits,
      git_pushes: t.gitPushes,
      input_tokens: t.inputTokens,
      output_tokens: t.outputTokens,
      first_prompt: e.firstPrompt || "",
      summary: e.summary,
      user_interruptions: t.userInterruptions,
      user_response_times: t.userResponseTimes,
      tool_errors: t.toolErrors,
      tool_error_categories: t.toolErrorCategories,
      uses_task_agent: t.usesTaskAgent,
      uses_mcp: t.usesMcp,
      uses_web_search: t.usesWebSearch,
      uses_web_fetch: t.usesWebFetch,
      lines_added: t.linesAdded,
      lines_removed: t.linesRemoved,
      files_modified: t.filesModified.size,
      message_hours: t.messageHours,
      user_message_timestamps: t.userMessageTimestamps
    };
  }
  function TVo(e, t) {
    if (!t) {
      return true;
    }
    if (e.user_message_count !== t.user_message_count) {
      return e.user_message_count > t.user_message_count;
    }
    return e.duration_minutes > t.duration_minutes;
  }
  function deduplicateSessionBranches(e) {
    let t = new Map();
    for (let n of e) {
      let r = n.meta.session_id;
      if (TVo(n.meta, t.get(r)?.meta)) {
        t.set(r, n);
      }
    }
    return [...t.values()];
  }
  function quf(e) {
    let t = [];
    let n = EVo(e);
    t.push(`Session: ${n.session_id.slice(0, 8)}`);
    t.push(`Date: ${n.start_time}`);
    t.push(`Project: ${n.project_path}`);
    t.push(`Duration: ${n.duration_minutes} min`);
    t.push("");
    for (let r of e.messages) {
      if (r.type === "user" && r.message) {
        let o = r.message.content;
        if (typeof o === "string") {
          t.push(`[User]: ${o.slice(0, 500)}`);
        } else if (Array.isArray(o)) {
          for (let s of o) {
            if (s.type === "text" && "text" in s) {
              t.push(`[User]: ${s.text.slice(0, 500)}`);
            }
          }
        }
      } else if (r.type === "assistant" && r.message) {
        let o = r.message.content;
        if (Array.isArray(o)) {
          for (let s of o) {
            if (s.type === "text" && "text" in s) {
              t.push(`[Assistant]: ${s.text.slice(0, 300)}`);
            } else if (s.type === "tool_use" && "name" in s) {
              t.push(`[Tool: ${s.name}]`);
            }
          }
        }
      }
    }
    return t.join(`
`);
  }
  async function Guf(e) {
    try {
      let t = await sFe({
        systemPrompt: [],
        userPrompt: Wuf + e,
        signal: new AbortController().signal,
        options: {
          model: _pc(),
          querySource: "insights",
          agents: [],
          isNonInteractiveSession: true,
          hasAppendSystemPrompt: false,
          mcpTools: [],
          maxOutputTokensOverride: 500,
          agentContext: ym()
        }
      });
      return Tl(t.message.content) || e.slice(0, 2000);
    } catch {
      return e.slice(0, 2000);
    }
  }
  async function Vuf(e) {
    let t = quf(e);
    if (t.length <= 30000) {
      return t;
    }
    let n = 25000;
    let r = [];
    for (let a = 0; a < t.length; a += n) {
      r.push(t.slice(a, a + n));
    }
    let o = await Promise.all(r.map(Guf));
    let s = EVo(e);
    return [`Session: ${s.session_id.slice(0, 8)}`, `Date: ${s.start_time}`, `Project: ${s.project_path}`, `Duration: ${s.duration_minutes} min`, `[Long session - ${r.length} parts summarized]`, ""].join(`
`) + o.join(`

---

`);
  }
  async function zuf(e) {
    let t = xK.join(npr(), `${e}.json`);
    try {
      let n = await kH.readFile(t, {
        encoding: "utf-8"
      });
      let r = qt(n);
      if (!Cpc(r)) {
        try {
          await kH.unlink(t);
        } catch {}
        return null;
      }
      return r;
    } catch {
      return null;
    }
  }
  async function Kuf(e) {
    try {
      await kH.mkdir(npr(), {
        recursive: true
      });
    } catch {}
    let t = xK.join(npr(), `${e.session_id}.json`);
    await kH.writeFile(t, De(e, null, 2), {
      encoding: "utf-8",
      mode: 384
    });
  }
  async function Yuf(e) {
    let t = xK.join(SVo(), `${e}.json`);
    try {
      let n = await kH.readFile(t, {
        encoding: "utf-8"
      });
      return normalizeSessionMeta(qt(n));
    } catch {
      return null;
    }
  }
  function normalizeSessionMeta(e) {
    return {
      ...e,
      tool_counts: e.tool_counts ?? {},
      languages: e.languages ?? {},
      tool_error_categories: e.tool_error_categories ?? {},
      user_response_times: e.user_response_times ?? [],
      message_hours: e.message_hours ?? [],
      user_message_timestamps: e.user_message_timestamps ?? [],
      user_interruptions: e.user_interruptions ?? 0,
      tool_errors: e.tool_errors ?? 0,
      lines_added: e.lines_added ?? 0,
      lines_removed: e.lines_removed ?? 0,
      files_modified: e.files_modified ?? 0
    };
  }
  async function Juf(e) {
    try {
      await kH.mkdir(SVo(), {
        recursive: true
      });
      let t = xK.join(SVo(), `${e.session_id}.json`);
      await kH.writeFile(t, De(e, null, 2), {
        encoding: "utf-8",
        mode: 384
      });
    } catch (t) {
      if (Io(t)) {
        logForDebugging(`saveSessionMeta: cache write failed: ${t}`);
        return;
      }
      Oe(t);
    }
  }
  async function Xuf(e, t) {
    try {
      let n = await Vuf(e);
      let r = `${Buf}${n}

RESPOND WITH ONLY A VALID JSON OBJECT matching this schema:
{
  "underlying_goal": "What the user fundamentally wanted to achieve",
  "goal_categories": {"category_name": count, ...},
  "outcome": "fully_achieved|mostly_achieved|partially_achieved|not_achieved|unclear_from_transcript",
  "user_satisfaction_counts": {"level": count, ...},
  "claude_helpfulness": "unhelpful|slightly_helpful|moderately_helpful|very_helpful|essential",
  "session_type": "single_task|multi_task|iterative_refinement|exploration|quick_question",
  "friction_counts": {"friction_type": count, ...},
  "friction_detail": "One sentence describing friction or empty",
  "primary_success": "none|fast_accurate_search|correct_code_edits|good_explanations|proactive_help|multi_file_changes|good_debugging",
  "brief_summary": "One sentence: what user wanted and whether they got it"
}`;
      let o = await sFe({
        systemPrompt: [],
        userPrompt: r,
        signal: new AbortController().signal,
        options: {
          model: _pc(),
          querySource: "insights",
          agents: [],
          isNonInteractiveSession: true,
          hasAppendSystemPrompt: false,
          mcpTools: [],
          maxOutputTokensOverride: 4096,
          agentContext: ym()
        }
      });
      let i = Tl(o.message.content).match(/\{[\s\S]*\}/);
      if (!i) {
        return null;
      }
      let a = qt(i[0]);
      if (!Cpc(a)) {
        return null;
      }
      return {
        ...a,
        session_id: t
      };
    } catch (n) {
      logForDebugging(`Facet extraction failed: ${sr(n).message}`, {
        level: "error"
      });
      return null;
    }
  }
  function detectMultiClauding(e) {
    let n = [];
    for (let l of e) {
      for (let c of l.user_message_timestamps) {
        let u = new Date(c).getTime();
        if (!Number.isFinite(u)) {
          continue;
        }
        n.push({
          ts: u,
          sessionId: l.session_id
        });
      }
    }
    n.sort((l, c) => l.ts - c.ts);
    let r = new Set();
    let o = new Set();
    let s = 0;
    let i = new Map();
    for (let l = 0; l < n.length; l++) {
      let c = n[l];
      while (s < l && c.ts - n[s].ts > 1800000) {
        let d = n[s];
        if (i.get(d.sessionId) === s) {
          i.delete(d.sessionId);
        }
        s++;
      }
      let u = i.get(c.sessionId);
      if (u !== undefined) {
        for (let d = u + 1; d < l; d++) {
          let p = n[d];
          if (p.sessionId !== c.sessionId) {
            let m = [c.sessionId, p.sessionId].sort().join(":");
            r.add(m);
            o.add(`${n[u].ts}:${c.sessionId}`);
            o.add(`${p.ts}:${p.sessionId}`);
            o.add(`${c.ts}:${c.sessionId}`);
            break;
          }
        }
      }
      i.set(c.sessionId, l);
    }
    let a = new Set();
    for (let l of r) {
      let [c, u] = l.split(":");
      if (c) {
        a.add(c);
      }
      if (u) {
        a.add(u);
      }
    }
    return {
      overlap_events: r.size,
      sessions_involved: a.size,
      user_messages_during: o.size
    };
  }
  function aggregateData(e, t) {
    let n = {
      total_sessions: e.length,
      sessions_with_facets: t.size,
      date_range: {
        start: "",
        end: ""
      },
      total_messages: 0,
      total_duration_hours: 0,
      total_input_tokens: 0,
      total_output_tokens: 0,
      tool_counts: {},
      languages: {},
      git_commits: 0,
      git_pushes: 0,
      projects: {},
      goal_categories: {},
      outcomes: {},
      satisfaction: {},
      helpfulness: {},
      session_types: {},
      friction: {},
      success: {},
      session_summaries: [],
      total_interruptions: 0,
      total_tool_errors: 0,
      tool_error_categories: {},
      user_response_times: [],
      median_response_time: 0,
      avg_response_time: 0,
      sessions_using_task_agent: 0,
      sessions_using_mcp: 0,
      sessions_using_web_search: 0,
      sessions_using_web_fetch: 0,
      total_lines_added: 0,
      total_lines_removed: 0,
      total_files_modified: 0,
      days_active: 0,
      messages_per_day: 0,
      message_hours: [],
      multi_clauding: {
        overlap_events: 0,
        sessions_involved: 0,
        user_messages_during: 0
      }
    };
    let r = [];
    let o = [];
    let s = [];
    for (let a of e) {
      r.push(a.start_time);
      n.total_messages += a.user_message_count;
      n.total_duration_hours += a.duration_minutes / 60;
      n.total_input_tokens += a.input_tokens;
      n.total_output_tokens += a.output_tokens;
      n.git_commits += a.git_commits;
      n.git_pushes += a.git_pushes;
      n.total_interruptions += a.user_interruptions;
      n.total_tool_errors += a.tool_errors;
      for (let [c, u] of Object.entries(a.tool_error_categories)) {
        n.tool_error_categories[c] = (n.tool_error_categories[c] || 0) + u;
      }
      if (o.push(...a.user_response_times), a.uses_task_agent) {
        n.sessions_using_task_agent++;
      }
      if (a.uses_mcp) {
        n.sessions_using_mcp++;
      }
      if (a.uses_web_search) {
        n.sessions_using_web_search++;
      }
      if (a.uses_web_fetch) {
        n.sessions_using_web_fetch++;
      }
      n.total_lines_added += a.lines_added;
      n.total_lines_removed += a.lines_removed;
      n.total_files_modified += a.files_modified;
      s.push(...a.message_hours);
      for (let [c, u] of Object.entries(a.tool_counts)) {
        n.tool_counts[c] = (n.tool_counts[c] || 0) + u;
      }
      for (let [c, u] of Object.entries(a.languages)) {
        n.languages[c] = (n.languages[c] || 0) + u;
      }
      if (a.project_path) {
        n.projects[a.project_path] = (n.projects[a.project_path] || 0) + 1;
      }
      let l = t.get(a.session_id);
      if (l) {
        for (let [c, u] of eRt(l.goal_categories)) {
          if (u > 0) {
            n.goal_categories[c] = (n.goal_categories[c] || 0) + u;
          }
        }
        n.outcomes[l.outcome] = (n.outcomes[l.outcome] || 0) + 1;
        for (let [c, u] of eRt(l.user_satisfaction_counts)) {
          if (u > 0) {
            n.satisfaction[c] = (n.satisfaction[c] || 0) + u;
          }
        }
        n.helpfulness[l.claude_helpfulness] = (n.helpfulness[l.claude_helpfulness] || 0) + 1;
        n.session_types[l.session_type] = (n.session_types[l.session_type] || 0) + 1;
        for (let [c, u] of eRt(l.friction_counts)) {
          if (u > 0) {
            n.friction[c] = (n.friction[c] || 0) + u;
          }
        }
        if (l.primary_success !== "none") {
          n.success[l.primary_success] = (n.success[l.primary_success] || 0) + 1;
        }
      }
      if (n.session_summaries.length < 50) {
        n.session_summaries.push({
          id: a.session_id.slice(0, 8),
          date: ii(a.start_time, "T"),
          summary: a.summary || a.first_prompt.slice(0, 100),
          goal: l?.underlying_goal
        });
      }
    }
    if (r.sort(), n.date_range.start = ii(r[0] ?? "", "T"), n.date_range.end = ii(r.at(-1) ?? "", "T"), n.user_response_times = o, o.length > 0) {
      let a = [...o].sort((l, c) => l - c);
      n.median_response_time = a[Math.floor(a.length / 2)] || 0;
      n.avg_response_time = o.reduce((l, c) => l + c, 0) / o.length;
    }
    let i = new Set(r.map(a => ii(a, "T")));
    n.days_active = i.size;
    n.messages_per_day = n.days_active > 0 ? Math.round(n.total_messages / n.days_active * 10) / 10 : 0;
    n.message_hours = s;
    n.multi_clauding = detectMultiClauding(e);
    return n;
  }
  async function ypc(e, t) {
    try {
      let n = await sFe({
        systemPrompt: [],
        userPrompt: e.prompt + `

DATA:
` + t,
        signal: new AbortController().signal,
        options: {
          model: Luf(),
          querySource: "insights",
          agents: [],
          isNonInteractiveSession: true,
          hasAppendSystemPrompt: false,
          mcpTools: [],
          maxOutputTokensOverride: e.maxTokens,
          agentContext: ym()
        }
      });
      let r = Tl(n.message.content);
      if (r) {
        let o = r.match(/\{[\s\S]*\}/);
        if (o) {
          try {
            return {
              name: e.name,
              result: qt(o[0])
            };
          } catch {
            return {
              name: e.name,
              result: null
            };
          }
        }
      }
      return {
        name: e.name,
        result: null
      };
    } catch (n) {
      Oe($o(Error(`${e.name} failed: ${sr(n).message}`), "insight section query failed"));
      return {
        name: e.name,
        result: null
      };
    }
  }
  async function Zuf(e, t) {
    let n = Array.from(t.values()).slice(0, 50).map(_ => `- ${_.brief_summary} (${_.outcome}, ${_.claude_helpfulness})`).join(`
`);
    let r = Array.from(t.values()).filter(_ => _.friction_detail).slice(0, 20).map(_ => `- ${_.friction_detail}`).join(`
`);
    let o = Array.from(t.values()).flatMap(_ => _.user_instructions_to_claude || []).slice(0, 15).map(_ => `- ${_}`).join(`
`);
    let i = De({
      sessions: e.total_sessions,
      analyzed: e.sessions_with_facets,
      date_range: e.date_range,
      messages: e.total_messages,
      hours: Math.round(e.total_duration_hours),
      commits: e.git_commits,
      top_tools: Object.entries(e.tool_counts).sort((_, b) => b[1] - _[1]).slice(0, 8),
      top_goals: Object.entries(e.goal_categories).sort((_, b) => b[1] - _[1]).slice(0, 8),
      outcomes: e.outcomes,
      satisfaction: e.satisfaction,
      friction: e.friction,
      success: e.success,
      languages: e.languages
    }, null, 2) + `

SESSION SUMMARIES:
` + n + `

FRICTION DETAILS:
` + r + `

USER INSTRUCTIONS TO CLAUDE:
` + (o || "None captured");
    let a = await Promise.all(Quf.map(_ => ypc(_, i)));
    let l = {};
    for (let {
      name: _,
      result: b
    } of a) {
      if (b) {
        l[_] = b;
      }
    }
    let c = l.project_areas?.areas?.map(_ => `- ${_.name}: ${_.description}`).join(`
`) || "";
    let u = l.what_works?.impressive_workflows?.map(_ => `- ${_.title}: ${_.description}`).join(`
`) || "";
    let d = l.friction_analysis?.categories?.map(_ => `- ${_.category}: ${_.description}`).join(`
`) || "";
    let p = l.suggestions?.features_to_try?.map(_ => `- ${_.feature}: ${_.one_liner}`).join(`
`) || "";
    let m = l.suggestions?.usage_patterns?.map(_ => `- ${_.title}: ${_.suggestion}`).join(`
`) || "";
    let f = l.on_the_horizon?.opportunities?.map(_ => `- ${_.title}: ${_.whats_possible}`).join(`
`) || "";
    let g = {
      name: "at_a_glance",
      prompt: `You're writing an "At a Glance" summary for a Claude Code usage insights report for Claude Code users. The goal is to help them understand their usage and improve how they can use Claude better, especially as models improve.

Use this 4-part structure:

1. **What's working** - What is the user's unique style of interacting with Claude and what are some impactful things they've done? You can include one or two details, but keep it high level since things might not be fresh in the user's memory. Don't be fluffy or overly complimentary. Also, don't focus on the tool calls they use.

2. **What's hindering you** - Split into (a) Claude's fault (misunderstandings, wrong approaches, bugs) and (b) user-side friction (not providing enough context, environment issues -- ideally more general than just one project). Be honest but constructive.

3. **Quick wins to try** - Specific Claude Code features they could try from the examples below, or a workflow technique if you think it's really compelling. (Avoid stuff like "Ask Claude to confirm before taking actions" or "Type out more context up front" which are less compelling.)

4. **Ambitious workflows for better models** - As we move to much more capable models over the next 3-6 months, what should they prepare for? What workflows that seem impossible now will become possible? Draw from the appropriate section below.

Keep each section to 2-3 not-too-long sentences. Don't overwhelm the user. Don't mention specific numerical stats or underlined_categories from the session data below. Use a coaching tone.

RESPOND WITH ONLY A VALID JSON OBJECT:
{
  "whats_working": "(refer to instructions above)",
  "whats_hindering": "(refer to instructions above)",
  "quick_wins": "(refer to instructions above)",
  "ambitious_workflows": "(refer to instructions above)"
}

SESSION DATA:
${i}

## Project Areas (what user works on)
${c}

## Big Wins (impressive accomplishments)
${u}

## Friction Categories (where things go wrong)
${d}

## Features to Try
${p}

## Usage Patterns to Adopt
${m}

## On the Horizon (ambitious workflows for better models)
${f}`,
      maxTokens: 8192
    };
    let y = await ypc(g, "");
    if (y.result) {
      l.at_a_glance = y.result;
    }
    return l;
  }
  function tpr(e) {
    return Yd(e).replace(/\*\*(.+?)\*\*/g, "<strong>$1</strong>");
  }
  function ACe(e, t, n = 6, r) {
    let o;
    if (r) {
      o = r.filter(i => i in e && (e[i] ?? 0) > 0).map(i => [i, e[i] ?? 0]);
    } else {
      o = Object.entries(e).sort((i, a) => a[1] - i[1]).slice(0, n);
    }
    if (o.length === 0) {
      return '<p class="empty">No data</p>';
    }
    let s = Math.max(...o.map(i => i[1]));
    return o.map(([i, a]) => {
      let l = a / s * 100;
      let c = Uuf[i] || i.replaceAll("_", " ").replace(/\b\w/g, u => u.toUpperCase());
      return `<div class="bar-row">
        <div class="bar-label">${Yd(c)}</div>
        <div class="bar-track"><div class="bar-fill" style="width:${l}%;background:${t}"></div></div>
        <div class="bar-value">${a}</div>
      </div>`;
    }).join(`
`);
  }
  function ndf(e) {
    if (e.length === 0) {
      return '<p class="empty">No response time data</p>';
    }
    let t = {
      "2-10s": 0,
      "10-30s": 0,
      "30s-1m": 0,
      "1-2m": 0,
      "2-5m": 0,
      "5-15m": 0,
      ">15m": 0
    };
    for (let r of e) {
      if (r < 10) {
        t["2-10s"] = (t["2-10s"] ?? 0) + 1;
      } else if (r < 30) {
        t["10-30s"] = (t["10-30s"] ?? 0) + 1;
      } else if (r < 60) {
        t["30s-1m"] = (t["30s-1m"] ?? 0) + 1;
      } else if (r < 120) {
        t["1-2m"] = (t["1-2m"] ?? 0) + 1;
      } else if (r < 300) {
        t["2-5m"] = (t["2-5m"] ?? 0) + 1;
      } else if (r < 900) {
        t["5-15m"] = (t["5-15m"] ?? 0) + 1;
      } else {
        t[">15m"] = (t[">15m"] ?? 0) + 1;
      }
    }
    let n = Math.max(...Object.values(t));
    if (n === 0) {
      return '<p class="empty">No response time data</p>';
    }
    return Object.entries(t).map(([r, o]) => {
      let s = o / n * 100;
      return `<div class="bar-row">
        <div class="bar-label">${r}</div>
        <div class="bar-track"><div class="bar-fill" style="width:${s}%;background:#6366f1"></div></div>
        <div class="bar-value">${o}</div>
      </div>`;
    }).join(`
`);
  }
  function rdf(e) {
    if (e.length === 0) {
      return '<p class="empty">No time data</p>';
    }
    let t = [{
      label: "Morning (6-12)",
      range: [6, 7, 8, 9, 10, 11]
    }, {
      label: "Afternoon (12-18)",
      range: [12, 13, 14, 15, 16, 17]
    }, {
      label: "Evening (18-24)",
      range: [18, 19, 20, 21, 22, 23]
    }, {
      label: "Night (0-6)",
      range: [0, 1, 2, 3, 4, 5]
    }];
    let n = {};
    for (let i of e) {
      n[i] = (n[i] || 0) + 1;
    }
    let r = t.map(i => ({
      label: i.label,
      count: i.range.reduce((a, l) => a + (n[l] || 0), 0)
    }));
    let o = Math.max(...r.map(i => i.count)) || 1;
    return `<div id="hour-histogram">${r.map(i => `
      <div class="bar-row">
        <div class="bar-label">${i.label}</div>
        <div class="bar-track"><div class="bar-fill" style="width:${i.count / o * 100}%;background:#8b5cf6"></div></div>
        <div class="bar-value">${i.count}</div>
      </div>`).join(`
`)}</div>`;
  }
  function odf(e) {
    let t = {};
    for (let n of e) {
      t[n] = (t[n] || 0) + 1;
    }
    return De(t);
  }
  function sdf(e, t) {
    let n = k => {
      if (!k) {
        return "";
      }
      return k.split(`

`).map(I => {
        let O = Yd(I);
        O = O.replace(/\*\*(.+?)\*\*/g, "<strong>$1</strong>");
        O = O.replace(/^- /gm, "\u2022 ");
        O = O.replaceAll(`
`, "<br>");
        return `<p>${O}</p>`;
      }).join(`
`);
    };
    let r = t.at_a_glance;
    let o = r ? `
    <div class="at-a-glance">
      <div class="glance-title">At a Glance</div>
      <div class="glance-sections">
        ${r.whats_working ? `<div class="glance-section"><strong>What's working:</strong> ${tpr(r.whats_working)} <a href="#section-wins" class="see-more">Impressive Things You Did \u2192</a></div>` : ""}
        ${r.whats_hindering ? `<div class="glance-section"><strong>What's hindering you:</strong> ${tpr(r.whats_hindering)} <a href="#section-friction" class="see-more">Where Things Go Wrong \u2192</a></div>` : ""}
        ${r.quick_wins ? `<div class="glance-section"><strong>Quick wins to try:</strong> ${tpr(r.quick_wins)} <a href="#section-features" class="see-more">Features to Try \u2192</a></div>` : ""}
        ${r.ambitious_workflows ? `<div class="glance-section"><strong>Ambitious workflows:</strong> ${tpr(r.ambitious_workflows)} <a href="#section-horizon" class="see-more">On the Horizon \u2192</a></div>` : ""}
      </div>
    </div>
    ` : "";
    let s = t.project_areas?.areas || [];
    let i = s.length > 0 ? `
    <h2 id="section-work">What You Work On</h2>
    <div class="project-areas">
      ${s.map(k => `
        <div class="project-area">
          <div class="area-header">
            <span class="area-name">${Yd(k.name)}</span>
            <span class="area-count">~${k.session_count} sessions</span>
          </div>
          <div class="area-desc">${Yd(k.description)}</div>
        </div>
      `).join("")}
    </div>
    ` : "";
    let a = t.interaction_style;
    let l = a?.narrative ? `
    <h2 id="section-usage">How You Use Claude Code</h2>
    <div class="narrative">
      ${n(a.narrative)}
      ${a.key_pattern ? `<div class="key-insight"><strong>Key pattern:</strong> ${Yd(a.key_pattern)}</div>` : ""}
    </div>
    ` : "";
    let c = t.what_works;
    let u = c?.impressive_workflows && c.impressive_workflows.length > 0 ? `
    <h2 id="section-wins">Impressive Things You Did</h2>
    ${c.intro ? `<p class="section-intro">${Yd(c.intro)}</p>` : ""}
    <div class="big-wins">
      ${c.impressive_workflows.map(k => `
        <div class="big-win">
          <div class="big-win-title">${Yd(k.title || "")}</div>
          <div class="big-win-desc">${Yd(k.description || "")}</div>
        </div>
      `).join("")}
    </div>
    ` : "";
    let d = t.friction_analysis;
    let p = d?.categories && d.categories.length > 0 ? `
    <h2 id="section-friction">Where Things Go Wrong</h2>
    ${d.intro ? `<p class="section-intro">${Yd(d.intro)}</p>` : ""}
    <div class="friction-categories">
      ${d.categories.map(k => `
        <div class="friction-category">
          <div class="friction-title">${Yd(k.category || "")}</div>
          <div class="friction-desc">${Yd(k.description || "")}</div>
          ${k.examples ? `<ul class="friction-examples">${k.examples.map(I => `<li>${Yd(I)}</li>`).join("")}</ul>` : ""}
        </div>
      `).join("")}
    </div>
    ` : "";
    let m = t.suggestions;
    let f = m ? `
    ${m.claude_md_additions && m.claude_md_additions.length > 0 ? `
    <h2 id="section-features">Existing CC Features to Try</h2>
    <div class="claude-md-section">
      <h3>Suggested CLAUDE.md Additions</h3>
      <p style="font-size: 12px; color: #64748b; margin-bottom: 12px;">Just copy this into Claude Code to add it to your CLAUDE.md.</p>
      <div class="claude-md-actions">
        <button class="copy-all-btn" onclick="copyAllCheckedClaudeMd()">Copy All Checked</button>
      </div>
      ${m.claude_md_additions.map((k, I) => `
        <div class="claude-md-item">
          <input type="checkbox" id="cmd-${I}" class="cmd-checkbox" checked data-text="${Yd(k.prompt_scaffold || k.where || "Add to CLAUDE.md")}\\n\\n${Yd(k.addition)}">
          <label for="cmd-${I}">
            <code class="cmd-code">${Yd(k.addition)}</code>
            <button class="copy-btn" onclick="copyCmdItem(${I})">Copy</button>
          </label>
          <div class="cmd-why">${Yd(k.why)}</div>
        </div>
      `).join("")}
    </div>
    ` : ""}
    ${m.features_to_try && m.features_to_try.length > 0 ? `
    <p style="font-size: 13px; color: #64748b; margin-bottom: 12px;">Just copy this into Claude Code and it'll set it up for you.</p>
    <div class="features-section">
      ${m.features_to_try.map(k => `
        <div class="feature-card">
          <div class="feature-title">${Yd(k.feature || "")}</div>
          <div class="feature-oneliner">${Yd(k.one_liner || "")}</div>
          <div class="feature-why"><strong>Why for you:</strong> ${Yd(k.why_for_you || "")}</div>
          ${k.example_code ? `
          <div class="feature-examples">
            <div class="feature-example">
              <div class="example-code-row">
                <code class="example-code">${Yd(k.example_code)}</code>
                <button class="copy-btn" onclick="copyText(this)">Copy</button>
              </div>
            </div>
          </div>
          ` : ""}
        </div>
      `).join("")}
    </div>
    ` : ""}
    ${m.usage_patterns && m.usage_patterns.length > 0 ? `
    <h2 id="section-patterns">New Ways to Use Claude Code</h2>
    <p style="font-size: 13px; color: #64748b; margin-bottom: 12px;">Just copy this into Claude Code and it'll walk you through it.</p>
    <div class="patterns-section">
      ${m.usage_patterns.map(k => `
        <div class="pattern-card">
          <div class="pattern-title">${Yd(k.title || "")}</div>
          <div class="pattern-summary">${Yd(k.suggestion || "")}</div>
          ${k.detail ? `<div class="pattern-detail">${Yd(k.detail)}</div>` : ""}
          ${k.copyable_prompt ? `
          <div class="copyable-prompt-section">
            <div class="prompt-label">Paste into Claude Code:</div>
            <div class="copyable-prompt-row">
              <code class="copyable-prompt">${Yd(k.copyable_prompt)}</code>
              <button class="copy-btn" onclick="copyText(this)">Copy</button>
            </div>
          </div>
          ` : ""}
        </div>
      `).join("")}
    </div>
    ` : ""}
    ` : "";
    let h = t.on_the_horizon;
    let g = h?.opportunities && h.opportunities.length > 0 ? `
    <h2 id="section-horizon">On the Horizon</h2>
    ${h.intro ? `<p class="section-intro">${Yd(h.intro)}</p>` : ""}
    <div class="horizon-section">
      ${h.opportunities.map(k => `
        <div class="horizon-card">
          <div class="horizon-title">${Yd(k.title || "")}</div>
          <div class="horizon-possible">${Yd(k.whats_possible || "")}</div>
          ${k.how_to_try ? `<div class="horizon-tip"><strong>Getting started:</strong> ${Yd(k.how_to_try)}</div>` : ""}
          ${k.copyable_prompt ? `<div class="pattern-prompt"><div class="prompt-label">Paste into Claude Code:</div><code>${Yd(k.copyable_prompt)}</code><button class="copy-btn" onclick="copyText(this)">Copy</button></div>` : ""}
        </div>
      `).join("")}
    </div>
    ` : "";
    let y = [];
    let _ = [];
    let b = y.length > 0 || _.length > 0 ? `
    <h2 id="section-feedback" class="feedback-header">Closing the Loop: Feedback for Other Teams</h2>
    <p class="feedback-intro">Suggestions for the CC product and model teams based on your usage patterns. Click to expand.</p>
    ${y.length > 0 ? `
    <div class="collapsible-section">
      <div class="collapsible-header" onclick="toggleCollapsible(this)">
        <span class="collapsible-arrow">\u25B6</span>
        <h3>Product Improvements for CC Team</h3>
      </div>
      <div class="collapsible-content">
        <div class="suggestions-section">
          ${y.map(k => `
            <div class="feedback-card team-card">
              <div class="feedback-title">${Yd(k.title || "")}</div>
              <div class="feedback-detail">${Yd(k.detail || "")}</div>
              ${k.evidence ? `<div class="feedback-evidence"><em>Evidence:</em> ${Yd(k.evidence)}</div>` : ""}
            </div>
          `).join("")}
        </div>
      </div>
    </div>
    ` : ""}
    ${_.length > 0 ? `
    <div class="collapsible-section">
      <div class="collapsible-header" onclick="toggleCollapsible(this)">
        <span class="collapsible-arrow">\u25B6</span>
        <h3>Model Behavior Improvements</h3>
      </div>
      <div class="collapsible-content">
        <div class="suggestions-section">
          ${_.map(k => `
            <div class="feedback-card model-card">
              <div class="feedback-title">${Yd(k.title || "")}</div>
              <div class="feedback-detail">${Yd(k.detail || "")}</div>
              ${k.evidence ? `<div class="feedback-evidence"><em>Evidence:</em> ${Yd(k.evidence)}</div>` : ""}
            </div>
          `).join("")}
        </div>
      </div>
    </div>
    ` : ""}
    ` : "";
    let S = t.fun_ending;
    let E = S?.headline ? `
    <div class="fun-ending">
      <div class="fun-headline">"${Yd(S.headline)}"</div>
      ${S.detail ? `<div class="fun-detail">${Yd(S.detail)}</div>` : ""}
    </div>
    ` : "";
    let C = `
    * { box-sizing: border-box; margin: 0; padding: 0; }
    body { font-family: 'Inter', -apple-system, BlinkMacSystemFont, sans-serif; background: #f8fafc; color: #334155; line-height: 1.65; padding: 48px 24px; }
    .container { max-width: 800px; margin: 0 auto; }
    h1 { font-size: 32px; font-weight: 700; color: #0f172a; margin-bottom: 8px; }
    h2 { font-size: 20px; font-weight: 600; color: #0f172a; margin-top: 48px; margin-bottom: 16px; }
    .subtitle { color: #64748b; font-size: 15px; margin-bottom: 32px; }
    .nav-toc { display: flex; flex-wrap: wrap; gap: 8px; margin: 24px 0 32px 0; padding: 16px; background: white; border-radius: 8px; border: 1px solid #e2e8f0; }
    .nav-toc a { font-size: 12px; color: #64748b; text-decoration: none; padding: 6px 12px; border-radius: 6px; background: #f1f5f9; transition: all 0.15s; }
    .nav-toc a:hover { background: #e2e8f0; color: #334155; }
    .stats-row { display: flex; gap: 24px; margin-bottom: 40px; padding: 20px 0; border-top: 1px solid #e2e8f0; border-bottom: 1px solid #e2e8f0; flex-wrap: wrap; }
    .stat { text-align: center; }
    .stat-value { font-size: 24px; font-weight: 700; color: #0f172a; }
    .stat-label { font-size: 11px; color: #64748b; text-transform: uppercase; }
    .at-a-glance { background: linear-gradient(135deg, #fef3c7 0%, #fde68a 100%); border: 1px solid #f59e0b; border-radius: 12px; padding: 20px 24px; margin-bottom: 32px; }
    .glance-title { font-size: 16px; font-weight: 700; color: #92400e; margin-bottom: 16px; }
    .glance-sections { display: flex; flex-direction: column; gap: 12px; }
    .glance-section { font-size: 14px; color: #78350f; line-height: 1.6; }
    .glance-section strong { color: #92400e; }
    .see-more { color: #b45309; text-decoration: none; font-size: 13px; white-space: nowrap; }
    .see-more:hover { text-decoration: underline; }
    .project-areas { display: flex; flex-direction: column; gap: 12px; margin-bottom: 32px; }
    .project-area { background: white; border: 1px solid #e2e8f0; border-radius: 8px; padding: 16px; }
    .area-header { display: flex; justify-content: space-between; align-items: center; margin-bottom: 8px; }
    .area-name { font-weight: 600; font-size: 15px; color: #0f172a; }
    .area-count { font-size: 12px; color: #64748b; background: #f1f5f9; padding: 2px 8px; border-radius: 4px; }
    .area-desc { font-size: 14px; color: #475569; line-height: 1.5; }
    .narrative { background: white; border: 1px solid #e2e8f0; border-radius: 8px; padding: 20px; margin-bottom: 24px; }
    .narrative p { margin-bottom: 12px; font-size: 14px; color: #475569; line-height: 1.7; }
    .key-insight { background: #f0fdf4; border: 1px solid #bbf7d0; border-radius: 8px; padding: 12px 16px; margin-top: 12px; font-size: 14px; color: #166534; }
    .section-intro { font-size: 14px; color: #64748b; margin-bottom: 16px; }
    .big-wins { display: flex; flex-direction: column; gap: 12px; margin-bottom: 24px; }
    .big-win { background: #f0fdf4; border: 1px solid #bbf7d0; border-radius: 8px; padding: 16px; }
    .big-win-title { font-weight: 600; font-size: 15px; color: #166534; margin-bottom: 8px; }
    .big-win-desc { font-size: 14px; color: #15803d; line-height: 1.5; }
    .friction-categories { display: flex; flex-direction: column; gap: 16px; margin-bottom: 24px; }
    .friction-category { background: #fef2f2; border: 1px solid #fca5a5; border-radius: 8px; padding: 16px; }
    .friction-title { font-weight: 600; font-size: 15px; color: #991b1b; margin-bottom: 6px; }
    .friction-desc { font-size: 13px; color: #7f1d1d; margin-bottom: 10px; }
    .friction-examples { margin: 0 0 0 20px; font-size: 13px; color: #334155; }
    .friction-examples li { margin-bottom: 4px; }
    .claude-md-section { background: #eff6ff; border: 1px solid #bfdbfe; border-radius: 8px; padding: 16px; margin-bottom: 20px; }
    .claude-md-section h3 { font-size: 14px; font-weight: 600; color: #1e40af; margin: 0 0 12px 0; }
    .claude-md-actions { margin-bottom: 12px; padding-bottom: 12px; border-bottom: 1px solid #dbeafe; }
    .copy-all-btn { background: #2563eb; color: white; border: none; border-radius: 4px; padding: 6px 12px; font-size: 12px; cursor: pointer; font-weight: 500; transition: all 0.2s; }
    .copy-all-btn:hover { background: #1d4ed8; }
    .copy-all-btn.copied { background: #16a34a; }
    .claude-md-item { display: flex; flex-wrap: wrap; align-items: flex-start; gap: 8px; padding: 10px 0; border-bottom: 1px solid #dbeafe; }
    .claude-md-item:last-child { border-bottom: none; }
    .cmd-checkbox { margin-top: 2px; }
    .cmd-code { background: white; padding: 8px 12px; border-radius: 4px; font-size: 12px; color: #1e40af; border: 1px solid #bfdbfe; font-family: monospace; display: block; white-space: pre-wrap; word-break: break-word; flex: 1; }
    .cmd-why { font-size: 12px; color: #64748b; width: 100%; padding-left: 24px; margin-top: 4px; }
    .features-section, .patterns-section { display: flex; flex-direction: column; gap: 12px; margin: 16px 0; }
    .feature-card { background: #f0fdf4; border: 1px solid #86efac; border-radius: 8px; padding: 16px; }
    .pattern-card { background: #f0f9ff; border: 1px solid #7dd3fc; border-radius: 8px; padding: 16px; }
    .feature-title, .pattern-title { font-weight: 600; font-size: 15px; color: #0f172a; margin-bottom: 6px; }
    .feature-oneliner { font-size: 14px; color: #475569; margin-bottom: 8px; }
    .pattern-summary { font-size: 14px; color: #475569; margin-bottom: 8px; }
    .feature-why, .pattern-detail { font-size: 13px; color: #334155; line-height: 1.5; }
    .feature-examples { margin-top: 12px; }
    .feature-example { padding: 8px 0; border-top: 1px solid #d1fae5; }
    .feature-example:first-child { border-top: none; }
    .example-desc { font-size: 13px; color: #334155; margin-bottom: 6px; }
    .example-code-row { display: flex; align-items: flex-start; gap: 8px; }
    .example-code { flex: 1; background: #f1f5f9; padding: 8px 12px; border-radius: 4px; font-family: monospace; font-size: 12px; color: #334155; overflow-x: auto; white-space: pre-wrap; }
    .copyable-prompt-section { margin-top: 12px; padding-top: 12px; border-top: 1px solid #e2e8f0; }
    .copyable-prompt-row { display: flex; align-items: flex-start; gap: 8px; }
    .copyable-prompt { flex: 1; background: #f8fafc; padding: 10px 12px; border-radius: 4px; font-family: monospace; font-size: 12px; color: #334155; border: 1px solid #e2e8f0; white-space: pre-wrap; line-height: 1.5; }
    .feature-code { background: #f8fafc; padding: 12px; border-radius: 6px; margin-top: 12px; border: 1px solid #e2e8f0; display: flex; align-items: flex-start; gap: 8px; }
    .feature-code code { flex: 1; font-family: monospace; font-size: 12px; color: #334155; white-space: pre-wrap; }
    .pattern-prompt { background: #f8fafc; padding: 12px; border-radius: 6px; margin-top: 12px; border: 1px solid #e2e8f0; }
    .pattern-prompt code { font-family: monospace; font-size: 12px; color: #334155; display: block; white-space: pre-wrap; margin-bottom: 8px; }
    .prompt-label { font-size: 11px; font-weight: 600; text-transform: uppercase; color: #64748b; margin-bottom: 6px; }
    .copy-btn { background: #e2e8f0; border: none; border-radius: 4px; padding: 4px 8px; font-size: 11px; cursor: pointer; color: #475569; flex-shrink: 0; }
    .copy-btn:hover { background: #cbd5e1; }
    .charts-row { display: grid; grid-template-columns: 1fr 1fr; gap: 24px; margin: 24px 0; }
    .chart-card { background: white; border: 1px solid #e2e8f0; border-radius: 8px; padding: 16px; }
    .chart-title { font-size: 12px; font-weight: 600; color: #64748b; text-transform: uppercase; margin-bottom: 12px; }
    .bar-row { display: flex; align-items: center; margin-bottom: 6px; }
    .bar-label { width: 100px; font-size: 11px; color: #475569; flex-shrink: 0; overflow: hidden; text-overflow: ellipsis; white-space: nowrap; }
    .bar-track { flex: 1; height: 6px; background: #f1f5f9; border-radius: 3px; margin: 0 8px; }
    .bar-fill { height: 100%; border-radius: 3px; }
    .bar-value { width: 28px; font-size: 11px; font-weight: 500; color: #64748b; text-align: right; }
    .empty { color: #94a3b8; font-size: 13px; }
    .horizon-section { display: flex; flex-direction: column; gap: 16px; }
    .horizon-card { background: linear-gradient(135deg, #faf5ff 0%, #f5f3ff 100%); border: 1px solid #c4b5fd; border-radius: 8px; padding: 16px; }
    .horizon-title { font-weight: 600; font-size: 15px; color: #5b21b6; margin-bottom: 8px; }
    .horizon-possible { font-size: 14px; color: #334155; margin-bottom: 10px; line-height: 1.5; }
    .horizon-tip { font-size: 13px; color: #6b21a8; background: rgba(255,255,255,0.6); padding: 8px 12px; border-radius: 4px; }
    .feedback-header { margin-top: 48px; color: #64748b; font-size: 16px; }
    .feedback-intro { font-size: 13px; color: #94a3b8; margin-bottom: 16px; }
    .feedback-section { margin-top: 16px; }
    .feedback-section h3 { font-size: 14px; font-weight: 600; color: #475569; margin-bottom: 12px; }
    .feedback-card { background: white; border: 1px solid #e2e8f0; border-radius: 8px; padding: 16px; margin-bottom: 12px; }
    .feedback-card.team-card { background: #eff6ff; border-color: #bfdbfe; }
    .feedback-card.model-card { background: #faf5ff; border-color: #e9d5ff; }
    .feedback-title { font-weight: 600; font-size: 14px; color: #0f172a; margin-bottom: 6px; }
    .feedback-detail { font-size: 13px; color: #475569; line-height: 1.5; }
    .feedback-evidence { font-size: 12px; color: #64748b; margin-top: 8px; }
    .fun-ending { background: linear-gradient(135deg, #fef3c7 0%, #fde68a 100%); border: 1px solid #fbbf24; border-radius: 12px; padding: 24px; margin-top: 40px; text-align: center; }
    .fun-headline { font-size: 18px; font-weight: 600; color: #78350f; margin-bottom: 8px; }
    .fun-detail { font-size: 14px; color: #92400e; }
    .collapsible-section { margin-top: 16px; }
    .collapsible-header { display: flex; align-items: center; gap: 8px; cursor: pointer; padding: 12px 0; border-bottom: 1px solid #e2e8f0; }
    .collapsible-header h3 { margin: 0; font-size: 14px; font-weight: 600; color: #475569; }
    .collapsible-arrow { font-size: 12px; color: #94a3b8; transition: transform 0.2s; }
    .collapsible-content { display: none; padding-top: 16px; }
    .collapsible-content.open { display: block; }
    .collapsible-header.open .collapsible-arrow { transform: rotate(90deg); }
    @media (max-width: 640px) { .charts-row { grid-template-columns: 1fr; } .stats-row { justify-content: center; } }
  `;
    let A = `
    function toggleCollapsible(header) {
      header.classList.toggle('open');
      const content = header.nextElementSibling;
      content.classList.toggle('open');
    }
    function copyText(btn) {
      const code = btn.previousElementSibling;
      navigator.clipboard.writeText(code.textContent).then(() => {
        btn.textContent = 'Copied!';
        setTimeout(() => { btn.textContent = 'Copy'; }, 2000);
      });
    }
    function copyCmdItem(idx) {
      const checkbox = document.getElementById('cmd-' + idx);
      if (checkbox) {
        const text = checkbox.dataset.text;
        navigator.clipboard.writeText(text).then(() => {
          const btn = checkbox.nextElementSibling.querySelector('.copy-btn');
          if (btn) { btn.textContent = 'Copied!'; setTimeout(() => { btn.textContent = 'Copy'; }, 2000); }
        });
      }
    }
    function copyAllCheckedClaudeMd() {
      const checkboxes = document.querySelectorAll('.cmd-checkbox:checked');
      const texts = [];
      checkboxes.forEach(cb => {
        if (cb.dataset.text) { texts.push(cb.dataset.text); }
      });
      const combined = texts.join('\\n');
      const btn = document.querySelector('.copy-all-btn');
      if (btn) {
        navigator.clipboard.writeText(combined).then(() => {
          btn.textContent = 'Copied ' + texts.length + ' items!';
          btn.classList.add('copied');
          setTimeout(() => { btn.textContent = 'Copy All Checked'; btn.classList.remove('copied'); }, 2000);
        });
      }
    }
    // Timezone selector for time of day chart (data is from our own analytics, not user input)
    const rawHourCounts = ${odf(e.message_hours)};
    function updateHourHistogram(offsetFromPT) {
      const periods = [
        { label: "Morning (6-12)", range: [6,7,8,9,10,11] },
        { label: "Afternoon (12-18)", range: [12,13,14,15,16,17] },
        { label: "Evening (18-24)", range: [18,19,20,21,22,23] },
        { label: "Night (0-6)", range: [0,1,2,3,4,5] }
      ];
      const adjustedCounts = {};
      for (const [hour, count] of Object.entries(rawHourCounts)) {
        const newHour = (parseInt(hour) + offsetFromPT + 24) % 24;
        adjustedCounts[newHour] = (adjustedCounts[newHour] || 0) + count;
      }
      const periodCounts = periods.map(p => ({
        label: p.label,
        count: p.range.reduce((sum, h) => sum + (adjustedCounts[h] || 0), 0)
      }));
      const maxCount = Math.max(...periodCounts.map(p => p.count)) || 1;
      const container = document.getElementById('hour-histogram');
      container.textContent = '';
      periodCounts.forEach(p => {
        const row = document.createElement('div');
        row.className = 'bar-row';
        const label = document.createElement('div');
        label.className = 'bar-label';
        label.textContent = p.label;
        const track = document.createElement('div');
        track.className = 'bar-track';
        const fill = document.createElement('div');
        fill.className = 'bar-fill';
        fill.style.width = (p.count / maxCount) * 100 + '%';
        fill.style.background = '#8b5cf6';
        track.appendChild(fill);
        const value = document.createElement('div');
        value.className = 'bar-value';
        value.textContent = p.count;
        row.appendChild(label);
        row.appendChild(track);
        row.appendChild(value);
        container.appendChild(row);
      });
    }
    document.getElementById('timezone-select').addEventListener('change', function() {
      const customInput = document.getElementById('custom-offset');
      if (this.value === 'custom') {
        customInput.style.display = 'inline-block';
        customInput.focus();
      } else {
        customInput.style.display = 'none';
        updateHourHistogram(parseInt(this.value));
      }
    });
    document.getElementById('custom-offset').addEventListener('change', function() {
      const parsed = parseInt(this.value, 10);
      if (isNaN(parsed)) return;
      updateHourHistogram(parsed + 8);
    });
  `;
    return `<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Claude Code Insights</title>
  <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap" rel="stylesheet">
  <style>
    * { box-sizing: border-box; margin: 0; padding: 0; }
    body { font-family: 'Inter', -apple-system, BlinkMacSystemFont, sans-serif; background: #f8fafc; color: #334155; line-height: 1.65; padding: 48px 24px; }
    .container { max-width: 800px; margin: 0 auto; }
    h1 { font-size: 32px; font-weight: 700; color: #0f172a; margin-bottom: 8px; }
    h2 { font-size: 20px; font-weight: 600; color: #0f172a; margin-top: 48px; margin-bottom: 16px; }
    .subtitle { color: #64748b; font-size: 15px; margin-bottom: 32px; }
    .nav-toc { display: flex; flex-wrap: wrap; gap: 8px; margin: 24px 0 32px 0; padding: 16px; background: white; border-radius: 8px; border: 1px solid #e2e8f0; }
    .nav-toc a { font-size: 12px; color: #64748b; text-decoration: none; padding: 6px 12px; border-radius: 6px; background: #f1f5f9; transition: all 0.15s; }
    .nav-toc a:hover { background: #e2e8f0; color: #334155; }
    .stats-row { display: flex; gap: 24px; margin-bottom: 40px; padding: 20px 0; border-top: 1px solid #e2e8f0; border-bottom: 1px solid #e2e8f0; flex-wrap: wrap; }
    .stat { text-align: center; }
    .stat-value { font-size: 24px; font-weight: 700; color: #0f172a; }
    .stat-label { font-size: 11px; color: #64748b; text-transform: uppercase; }
    .at-a-glance { background: linear-gradient(135deg, #fef3c7 0%, #fde68a 100%); border: 1px solid #f59e0b; border-radius: 12px; padding: 20px 24px; margin-bottom: 32px; }
    .glance-title { font-size: 16px; font-weight: 700; color: #92400e; margin-bottom: 16px; }
    .glance-sections { display: flex; flex-direction: column; gap: 12px; }
    .glance-section { font-size: 14px; color: #78350f; line-height: 1.6; }
    .glance-section strong { color: #92400e; }
    .see-more { color: #b45309; text-decoration: none; font-size: 13px; white-space: nowrap; }
    .see-more:hover { text-decoration: underline; }
    .project-areas { display: flex; flex-direction: column; gap: 12px; margin-bottom: 32px; }
    .project-area { background: white; border: 1px solid #e2e8f0; border-radius: 8px; padding: 16px; }
    .area-header { display: flex; justify-content: space-between; align-items: center; margin-bottom: 8px; }
    .area-name { font-weight: 600; font-size: 15px; color: #0f172a; }
    .area-count { font-size: 12px; color: #64748b; background: #f1f5f9; padding: 2px 8px; border-radius: 4px; }
    .area-desc { font-size: 14px; color: #475569; line-height: 1.5; }
    .narrative { background: white; border: 1px solid #e2e8f0; border-radius: 8px; padding: 20px; margin-bottom: 24px; }
    .narrative p { margin-bottom: 12px; font-size: 14px; color: #475569; line-height: 1.7; }
    .key-insight { background: #f0fdf4; border: 1px solid #bbf7d0; border-radius: 8px; padding: 12px 16px; margin-top: 12px; font-size: 14px; color: #166534; }
    .section-intro { font-size: 14px; color: #64748b; margin-bottom: 16px; }
    .big-wins { display: flex; flex-direction: column; gap: 12px; margin-bottom: 24px; }
    .big-win { background: #f0fdf4; border: 1px solid #bbf7d0; border-radius: 8px; padding: 16px; }
    .big-win-title { font-weight: 600; font-size: 15px; color: #166534; margin-bottom: 8px; }
    .big-win-desc { font-size: 14px; color: #15803d; line-height: 1.5; }
    .friction-categories { display: flex; flex-direction: column; gap: 16px; margin-bottom: 24px; }
    .friction-category { background: #fef2f2; border: 1px solid #fca5a5; border-radius: 8px; padding: 16px; }
    .friction-title { font-weight: 600; font-size: 15px; color: #991b1b; margin-bottom: 6px; }
    .friction-desc { font-size: 13px; color: #7f1d1d; margin-bottom: 10px; }
    .friction-examples { margin: 0 0 0 20px; font-size: 13px; color: #334155; }
    .friction-examples li { margin-bottom: 4px; }
    .claude-md-section { background: #eff6ff; border: 1px solid #bfdbfe; border-radius: 8px; padding: 16px; margin-bottom: 20px; }
    .claude-md-section h3 { font-size: 14px; font-weight: 600; color: #1e40af; margin: 0 0 12px 0; }
    .claude-md-actions { margin-bottom: 12px; padding-bottom: 12px; border-bottom: 1px solid #dbeafe; }
    .copy-all-btn { background: #2563eb; color: white; border: none; border-radius: 4px; padding: 6px 12px; font-size: 12px; cursor: pointer; font-weight: 500; transition: all 0.2s; }
    .copy-all-btn:hover { background: #1d4ed8; }
    .copy-all-btn.copied { background: #16a34a; }
    .claude-md-item { display: flex; flex-wrap: wrap; align-items: flex-start; gap: 8px; padding: 10px 0; border-bottom: 1px solid #dbeafe; }
    .claude-md-item:last-child { border-bottom: none; }
    .cmd-checkbox { margin-top: 2px; }
    .cmd-code { background: white; padding: 8px 12px; border-radius: 4px; font-size: 12px; color: #1e40af; border: 1px solid #bfdbfe; font-family: monospace; display: block; white-space: pre-wrap; word-break: break-word; flex: 1; }
    .cmd-why { font-size: 12px; color: #64748b; width: 100%; padding-left: 24px; margin-top: 4px; }
    .features-section, .patterns-section { display: flex; flex-direction: column; gap: 12px; margin: 16px 0; }
    .feature-card { background: #f0fdf4; border: 1px solid #86efac; border-radius: 8px; padding: 16px; }
    .pattern-card { background: #f0f9ff; border: 1px solid #7dd3fc; border-radius: 8px; padding: 16px; }
    .feature-title, .pattern-title { font-weight: 600; font-size: 15px; color: #0f172a; margin-bottom: 6px; }
    .feature-oneliner { font-size: 14px; color: #475569; margin-bottom: 8px; }
    .pattern-summary { font-size: 14px; color: #475569; margin-bottom: 8px; }
    .feature-why, .pattern-detail { font-size: 13px; color: #334155; line-height: 1.5; }
    .feature-examples { margin-top: 12px; }
    .feature-example { padding: 8px 0; border-top: 1px solid #d1fae5; }
    .feature-example:first-child { border-top: none; }
    .example-desc { font-size: 13px; color: #334155; margin-bottom: 6px; }
    .example-code-row { display: flex; align-items: flex-start; gap: 8px; }
    .example-code { flex: 1; background: #f1f5f9; padding: 8px 12px; border-radius: 4px; font-family: monospace; font-size: 12px; color: #334155; overflow-x: auto; white-space: pre-wrap; }
    .copyable-prompt-section { margin-top: 12px; padding-top: 12px; border-top: 1px solid #e2e8f0; }
    .copyable-prompt-row { display: flex; align-items: flex-start; gap: 8px; }
    .copyable-prompt { flex: 1; background: #f8fafc; padding: 10px 12px; border-radius: 4px; font-family: monospace; font-size: 12px; color: #334155; border: 1px solid #e2e8f0; white-space: pre-wrap; line-height: 1.5; }
    .feature-code { background: #f8fafc; padding: 12px; border-radius: 6px; margin-top: 12px; border: 1px solid #e2e8f0; display: flex; align-items: flex-start; gap: 8px; }
    .feature-code code { flex: 1; font-family: monospace; font-size: 12px; color: #334155; white-space: pre-wrap; }
    .pattern-prompt { background: #f8fafc; padding: 12px; border-radius: 6px; margin-top: 12px; border: 1px solid #e2e8f0; }
    .pattern-prompt code { font-family: monospace; font-size: 12px; color: #334155; display: block; white-space: pre-wrap; margin-bottom: 8px; }
    .prompt-label { font-size: 11px; font-weight: 600; text-transform: uppercase; color: #64748b; margin-bottom: 6px; }
    .copy-btn { background: #e2e8f0; border: none; border-radius: 4px; padding: 4px 8px; font-size: 11px; cursor: pointer; color: #475569; flex-shrink: 0; }
    .copy-btn:hover { background: #cbd5e1; }
    .charts-row { display: grid; grid-template-columns: 1fr 1fr; gap: 24px; margin: 24px 0; }
    .chart-card { background: white; border: 1px solid #e2e8f0; border-radius: 8px; padding: 16px; }
    .chart-title { font-size: 12px; font-weight: 600; color: #64748b; text-transform: uppercase; margin-bottom: 12px; }
    .bar-row { display: flex; align-items: center; margin-bottom: 6px; }
    .bar-label { width: 100px; font-size: 11px; color: #475569; flex-shrink: 0; overflow: hidden; text-overflow: ellipsis; white-space: nowrap; }
    .bar-track { flex: 1; height: 6px; background: #f1f5f9; border-radius: 3px; margin: 0 8px; }
    .bar-fill { height: 100%; border-radius: 3px; }
    .bar-value { width: 28px; font-size: 11px; font-weight: 500; color: #64748b; text-align: right; }
    .empty { color: #94a3b8; font-size: 13px; }
    .horizon-section { display: flex; flex-direction: column; gap: 16px; }
    .horizon-card { background: linear-gradient(135deg, #faf5ff 0%, #f5f3ff 100%); border: 1px solid #c4b5fd; border-radius: 8px; padding: 16px; }
    .horizon-title { font-weight: 600; font-size: 15px; color: #5b21b6; margin-bottom: 8px; }
    .horizon-possible { font-size: 14px; color: #334155; margin-bottom: 10px; line-height: 1.5; }
    .horizon-tip { font-size: 13px; color: #6b21a8; background: rgba(255,255,255,0.6); padding: 8px 12px; border-radius: 4px; }
    .feedback-header { margin-top: 48px; color: #64748b; font-size: 16px; }
    .feedback-intro { font-size: 13px; color: #94a3b8; margin-bottom: 16px; }
    .feedback-section { margin-top: 16px; }
    .feedback-section h3 { font-size: 14px; font-weight: 600; color: #475569; margin-bottom: 12px; }
    .feedback-card { background: white; border: 1px solid #e2e8f0; border-radius: 8px; padding: 16px; margin-bottom: 12px; }
    .feedback-card.team-card { background: #eff6ff; border-color: #bfdbfe; }
    .feedback-card.model-card { background: #faf5ff; border-color: #e9d5ff; }
    .feedback-title { font-weight: 600; font-size: 14px; color: #0f172a; margin-bottom: 6px; }
    .feedback-detail { font-size: 13px; color: #475569; line-height: 1.5; }
    .feedback-evidence { font-size: 12px; color: #64748b; margin-top: 8px; }
    .fun-ending { background: linear-gradient(135deg, #fef3c7 0%, #fde68a 100%); border: 1px solid #fbbf24; border-radius: 12px; padding: 24px; margin-top: 40px; text-align: center; }
    .fun-headline { font-size: 18px; font-weight: 600; color: #78350f; margin-bottom: 8px; }
    .fun-detail { font-size: 14px; color: #92400e; }
    .collapsible-section { margin-top: 16px; }
    .collapsible-header { display: flex; align-items: center; gap: 8px; cursor: pointer; padding: 12px 0; border-bottom: 1px solid #e2e8f0; }
    .collapsible-header h3 { margin: 0; font-size: 14px; font-weight: 600; color: #475569; }
    .collapsible-arrow { font-size: 12px; color: #94a3b8; transition: transform 0.2s; }
    .collapsible-content { display: none; padding-top: 16px; }
    .collapsible-content.open { display: block; }
    .collapsible-header.open .collapsible-arrow { transform: rotate(90deg); }
    @media (max-width: 640px) { .charts-row { grid-template-columns: 1fr; } .stats-row { justify-content: center; } }
  </style>
</head>
<body>
  <div class="container">
    <h1>Claude Code Insights</h1>
    <p class="subtitle">${e.total_messages.toLocaleString()} messages across ${e.total_sessions} sessions${e.total_sessions_scanned && e.total_sessions_scanned > e.total_sessions ? ` (${e.total_sessions_scanned.toLocaleString()} total)` : ""} | ${e.date_range.start} to ${e.date_range.end}</p>

    ${o}

    <nav class="nav-toc">
      <a href="#section-work">What You Work On</a>
      <a href="#section-usage">How You Use CC</a>
      <a href="#section-wins">Impressive Things</a>
      <a href="#section-friction">Where Things Go Wrong</a>
      <a href="#section-features">Features to Try</a>
      <a href="#section-patterns">New Usage Patterns</a>
      <a href="#section-horizon">On the Horizon</a>
      <a href="#section-feedback">Team Feedback</a>
    </nav>

    <div class="stats-row">
      <div class="stat"><div class="stat-value">${e.total_messages.toLocaleString()}</div><div class="stat-label">Messages</div></div>
      <div class="stat"><div class="stat-value">+${e.total_lines_added.toLocaleString()}/-${e.total_lines_removed.toLocaleString()}</div><div class="stat-label">Lines</div></div>
      <div class="stat"><div class="stat-value">${e.total_files_modified}</div><div class="stat-label">Files</div></div>
      <div class="stat"><div class="stat-value">${e.days_active}</div><div class="stat-label">Days</div></div>
      <div class="stat"><div class="stat-value">${e.messages_per_day}</div><div class="stat-label">Msgs/Day</div></div>
    </div>

    ${i}

    <div class="charts-row">
      <div class="chart-card">
        <div class="chart-title">What You Wanted</div>
        ${ACe(e.goal_categories, "#2563eb")}
      </div>
      <div class="chart-card">
        <div class="chart-title">Top Tools Used</div>
        ${ACe(e.tool_counts, "#0891b2")}
      </div>
    </div>

    <div class="charts-row">
      <div class="chart-card">
        <div class="chart-title">Languages</div>
        ${ACe(e.languages, "#10b981")}
      </div>
      <div class="chart-card">
        <div class="chart-title">Session Types</div>
        ${ACe(e.session_types || {}, "#8b5cf6")}
      </div>
    </div>

    ${l}

    <!-- Response Time Distribution -->
    <div class="chart-card" style="margin: 24px 0;">
      <div class="chart-title">User Response Time Distribution</div>
      ${ndf(e.user_response_times)}
      <div style="font-size: 12px; color: #64748b; margin-top: 8px;">
        Median: ${e.median_response_time.toFixed(1)}s &bull; Average: ${e.avg_response_time.toFixed(1)}s
      </div>
    </div>

    <!-- Multi-clauding Section (matching Python reference) -->
    <div class="chart-card" style="margin: 24px 0;">
      <div class="chart-title">Multi-Clauding (Parallel Sessions)</div>
      ${e.multi_clauding.overlap_events === 0 ? `
        <p style="font-size: 14px; color: #64748b; padding: 8px 0;">
          No parallel session usage detected. You typically work with one Claude Code session at a time.
        </p>
      ` : `
        <div style="display: flex; gap: 24px; margin: 12px 0;">
          <div style="text-align: center;">
            <div style="font-size: 24px; font-weight: 700; color: #7c3aed;">${e.multi_clauding.overlap_events}</div>
            <div style="font-size: 11px; color: #64748b; text-transform: uppercase;">Overlap Events</div>
          </div>
          <div style="text-align: center;">
            <div style="font-size: 24px; font-weight: 700; color: #7c3aed;">${e.multi_clauding.sessions_involved}</div>
            <div style="font-size: 11px; color: #64748b; text-transform: uppercase;">Sessions Involved</div>
          </div>
          <div style="text-align: center;">
            <div style="font-size: 24px; font-weight: 700; color: #7c3aed;">${e.total_messages > 0 ? Math.round(100 * e.multi_clauding.user_messages_during / e.total_messages) : 0}%</div>
            <div style="font-size: 11px; color: #64748b; text-transform: uppercase;">Of Messages</div>
          </div>
        </div>
        <p style="font-size: 13px; color: #475569; margin-top: 12px;">
          You run multiple Claude Code sessions simultaneously. Multi-clauding is detected when sessions
          overlap in time, suggesting parallel workflows.
        </p>
      `}
    </div>

    <!-- Time of Day & Tool Errors -->
    <div class="charts-row">
      <div class="chart-card">
        <div class="chart-title" style="display: flex; align-items: center; gap: 12px;">
          User Messages by Time of Day
          <select id="timezone-select" style="font-size: 12px; padding: 4px 8px; border-radius: 4px; border: 1px solid #e2e8f0;">
            <option value="0">PT (UTC-8)</option>
            <option value="3">ET (UTC-5)</option>
            <option value="8">London (UTC)</option>
            <option value="9">CET (UTC+1)</option>
            <option value="17">Tokyo (UTC+9)</option>
            <option value="custom">Custom offset...</option>
          </select>
          <input type="number" id="custom-offset" placeholder="UTC offset" style="display: none; width: 80px; font-size: 12px; padding: 4px; border-radius: 4px; border: 1px solid #e2e8f0;">
        </div>
        ${rdf(e.message_hours)}
      </div>
      <div class="chart-card">
        <div class="chart-title">Tool Errors Encountered</div>
        ${Object.keys(e.tool_error_categories).length > 0 ? ACe(e.tool_error_categories, "#dc2626") : '<p class="empty">No tool errors</p>'}
      </div>
    </div>

    ${u}

    <div class="charts-row">
      <div class="chart-card">
        <div class="chart-title">What Helped Most (Claude's Capabilities)</div>
        ${ACe(e.success, "#16a34a")}
      </div>
      <div class="chart-card">
        <div class="chart-title">Outcomes</div>
        ${ACe(e.outcomes, "#8b5cf6", 6, tdf)}
      </div>
    </div>

    ${p}

    <div class="charts-row">
      <div class="chart-card">
        <div class="chart-title">Primary Friction Types</div>
        ${ACe(e.friction, "#dc2626")}
      </div>
      <div class="chart-card">
        <div class="chart-title">Inferred Satisfaction (model-estimated)</div>
        ${ACe(e.satisfaction, "#eab308", 6, edf)}
      </div>
    </div>

    ${f}

    ${g}

    ${E}

    ${b}
  </div>
  <script>${A}</script>
</body>
</html>`;
  }
  function buildExportData(e, t, n, r) {
    let o = {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION;
    let s = r?.hosts.filter(a => a.sessionCount > 0).map(a => a.name);
    let i = {
      total: n.size,
      goal_categories: {},
      outcomes: {},
      satisfaction: {},
      friction: {}
    };
    for (let a of n.values()) {
      for (let [l, c] of eRt(a.goal_categories)) {
        if (c > 0) {
          i.goal_categories[l] = (i.goal_categories[l] || 0) + c;
        }
      }
      i.outcomes[a.outcome] = (i.outcomes[a.outcome] || 0) + 1;
      for (let [l, c] of eRt(a.user_satisfaction_counts)) {
        if (c > 0) {
          i.satisfaction[l] = (i.satisfaction[l] || 0) + c;
        }
      }
      for (let [l, c] of eRt(a.friction_counts)) {
        if (c > 0) {
          i.friction[l] = (i.friction[l] || 0) + c;
        }
      }
    }
    return {
      metadata: {
        username: process.env.SAFEUSER || process.env.USER || "unknown",
        generated_at: new Date().toISOString(),
        claude_code_version: o,
        date_range: e.date_range,
        session_count: e.total_sessions,
        ...(s && s.length > 0 && {
          remote_hosts_collected: s
        })
      },
      aggregated_data: e,
      insights: t,
      facets_summary: i
    };
  }
  async function adf() {
    let e = y$();
    let t;
    try {
      t = await kH.readdir(e, {
        withFileTypes: true
      });
    } catch {
      return [];
    }
    let n = t.filter(o => o.isDirectory()).map(o => xK.join(e, o.name));
    let r = [];
    for (let o = 0; o < n.length; o++) {
      let s = await getSessionFilesWithMtime(n[o]);
      for (let [i, a] of s) {
        r.push({
          sessionId: i,
          path: a.path,
          mtime: a.mtime,
          size: a.size
        });
      }
      if (o % 10 === 9) {
        await new Promise(i => setImmediate(i));
      }
    }
    r.sort((o, s) => s.mtime - o.mtime);
    return r;
  }
  async function generateUsageReport(e) {
    let t;
    let n = await adf();
    let r = n.length;
    let o = 50;
    let s = 200;
    let i = [];
    let a = [];
    let l = 0;
    let c = 0;
    for (let U = 0; U < n.length; U += o) {
      let N = n.slice(U, U + o);
      let W = await Promise.all(N.map(async j => ({
        sessionInfo: j,
        cached: await Yuf(j.sessionId)
      })));
      for (let {
        sessionInfo: j,
        cached: z
      } of W) {
        if (z && (z.transcript_mtime === undefined || z.transcript_mtime >= j.mtime)) {
          i.push(z);
        } else if (!z) {
          if (l < s) {
            a.push({
              sessionInfo: j,
              cached: z
            });
            l++;
          }
        } else if (c < s) {
          a.push({
            sessionInfo: j,
            cached: z
          });
          c++;
        } else {
          i.push(z);
        }
      }
    }
    let u = new Map();
    let d = U => {
      for (let N of U.messages.slice(0, 5)) {
        if (N.type === "user" && N.message) {
          let W = N.message.content;
          if (typeof W === "string") {
            if (W.includes("RESPOND WITH ONLY A VALID JSON OBJECT") || W.includes("record_facets")) {
              return true;
            }
          }
        }
      }
      return false;
    };
    let p = 10;
    for (let U = 0; U < a.length; U += p) {
      let N = a.slice(U, U + p);
      let W = await Promise.all(N.map(async ({
        sessionInfo: z,
        cached: V
      }) => {
        try {
          return {
            sessionInfo: z,
            cached: V,
            logs: await loadAllLogsFromSessionFile(z.path)
          };
        } catch {
          return {
            sessionInfo: z,
            cached: V,
            logs: []
          };
        }
      }));
      let j = new Map();
      for (let {
        sessionInfo: z,
        cached: V,
        logs: K
      } of W) {
        let J = false;
        for (let Q of K) {
          if (d(Q) || !Huf(Q)) {
            continue;
          }
          let Z = EVo(Q);
          if (Z.transcript_mtime = z.mtime, i.push(Z), J = true, TVo(Z, j.get(Z.session_id))) {
            j.set(Z.session_id, Z);
          }
          u.set(Z.session_id, Q);
        }
        if (!J && V) {
          i.push(V);
        }
      }
      await Promise.all([...j.values()].map(z => Juf(z)));
    }
    let m = new Map();
    for (let U of i) {
      if (TVo(U, m.get(U.session_id))) {
        m.set(U.session_id, U);
      }
    }
    let f = new Set(m.keys());
    i = [...m.values()];
    for (let U of u.keys()) {
      if (!f.vZc(U)) {
        u.delete(U);
      }
    }
    i.sort((U, N) => N.start_time.localeCompare(U.start_time));
    let h = U => {
      if (U.user_message_count < 2) {
        return false;
      }
      if (U.duration_minutes < 1) {
        return false;
      }
      return true;
    };
    let g = i.filter(h);
    let y = new Map();
    let _ = [];
    let b = 50;
    let S = await Promise.all(g.map(async U => ({
      sessionId: U.session_id,
      cached: await zuf(U.session_id)
    })));
    for (let {
      sessionId: U,
      cached: N
    } of S) {
      if (N) {
        y.set(U, N);
      } else {
        let W = u.get(U);
        if (W && _.length < b) {
          _.push({
            log: W,
            sessionId: U
          });
        }
      }
    }
    let E = 50;
    for (let U = 0; U < _.length; U += E) {
      let N = _.slice(U, U + E);
      let W = await Promise.all(N.map(async ({
        log: z,
        sessionId: V
      }) => {
        let K = await Xuf(z, V);
        return {
          sessionId: V,
          newFacets: K
        };
      }));
      let j = [];
      for (let {
        sessionId: z,
        newFacets: V
      } of W) {
        if (V) {
          y.set(z, V);
          j.push(V);
        }
      }
      await Promise.all(j.map(z => Kuf(z)));
    }
    let C = U => {
      let N = y.get(U);
      if (!N) {
        return false;
      }
      let W = N.goal_categories;
      let j = ldf(W).filter(z => (W[z] ?? 0) > 0);
      return j.length === 1 && j[0] === "warmup_minimal";
    };
    let x = g.filter(U => !C(U.session_id));
    let A = new Map();
    for (let [U, N] of y) {
      if (!C(U)) {
        A.set(U, N);
      }
    }
    let k = aggregateData(x, A);
    k.total_sessions_scanned = r;
    let I = await Zuf(k, y);
    let O = sdf(k, I);
    try {
      await kH.mkdir(Htn(), {
        recursive: true
      });
    } catch {}
    let M = new Date();
    let L = U => String(U).padStart(2, "0");
    let P = `${M.getFullYear()}-${L(M.getMonth() + 1)}-${L(M.getDate())}-${L(M.getHours())}${L(M.getMinutes())}${L(M.getSeconds())}`;
    let F = xK.join(Htn(), `report-${P}.html`);
    let H = xK.join(Htn(), "report.html");
    await kH.writeFile(F, O, {
      encoding: "utf-8",
      mode: 384
    });
    await kH.writeFile(H, O, {
      encoding: "utf-8",
      mode: 384
    });
    return {
      insights: I,
      htmlPath: F,
      data: k,
      remoteStats: t,
      facets: A
    };
  }
  function eRt(e) {
    return e ? Object.entries(e) : [];
  }
  function ldf(e) {
    return e ? Object.keys(e) : [];
  }
  function buildInsightsResponsePrompt({
    insightsJson: e,
    reportUrl: t,
    htmlPath: n,
    facetsDir: r,
    header: o,
    summaryText: s
  }) {
    return `The user just ran /insights to generate a usage report analyzing their Claude Code sessions.

Here is the full insights data:
${e}

Report URL: ${t}
HTML file: ${n}
Facets directory: ${r}

At-a-glance summary (for your context only \u2014 the user has not seen any output yet):
${o}${s}

Output the text between <message> tags verbatim as your entire response. Do not omit any line:

<message>
Your shareable insights report is ready:
${t}

Want to dig into any section or try one of the suggestions?
</message>`;
  }
  function Cpc(e) {
    if (!e || typeof e !== "object") {
      return false;
    }
    let t = e;
    return typeof t.underlying_goal === "string" && typeof t.outcome === "string" && typeof t.brief_summary === "string" && t.goal_categories !== null && typeof t.goal_categories === "object" && t.user_satisfaction_counts !== null && typeof t.user_satisfaction_counts === "object" && t.friction_counts !== null && typeof t.friction_counts === "object";
  }
  var kH;
  var xK;
  var Fuf;
  var Uuf;
  var Buf = `Analyze this Claude Code session and extract structured facets.

CRITICAL GUIDELINES:

1. **goal_categories**: Count ONLY what the USER explicitly asked for.
   - DO NOT count Claude's autonomous codebase exploration
   - DO NOT count work Claude decided to do on its own
   - ONLY count when user says "can you...", "please...", "I need...", "let's..."

2. **user_satisfaction_counts**: Base ONLY on explicit user signals.
   - "Yay!", "great!", "perfect!" \u2192 happy
   - "thanks", "looks good", "that works" \u2192 satisfied
   - "ok, now let's..." (continuing without complaint) \u2192 likely_satisfied
   - "that's not right", "try again" \u2192 dissatisfied
   - "this is broken", "I give up" \u2192 frustrated

3. **friction_counts**: Be specific about what went wrong.
   - misunderstood_request: Claude interpreted incorrectly
   - wrong_approach: Right goal, wrong solution method
   - buggy_code: Code didn't work correctly
   - user_rejected_action: User said no/stop to a tool call
   - excessive_changes: Over-engineered or changed too much

4. If very short or just warmup, use warmup_minimal for goal_category

SESSION:
`;
  var Wuf = `Summarize this portion of a Claude Code session transcript. Focus on:
1. What the user asked for
2. What Claude did (tools used, files modified)
3. Any friction or issues
4. The outcome

Keep it concise - 3-5 sentences. Preserve specific details like file names, error messages, and user feedback.

TRANSCRIPT CHUNK:
`;
  var Quf;
  var edf;
  var tdf;
  var cdf;
  var vVo = {};
  __export(vVo, {
    invalidateWorkflowCache: () => invalidateWorkflowCache,
    getWorkflowCommands: () => getWorkflowCommands,
    createWorkflowCommand: () => createWorkflowCommand
  });
  function createWorkflowCommand(e) {
    return {
      type: "prompt",
      name: e.name,
      description: e.description,
      hasUserSpecifiedDescription: true,
      whenToUse: e.whenToUse,
      progressMessage: "running dynamic workflow",
      contentLength: e.script.length,
      source: e.source === "built-in" ? "bundled" : e.source,
      loadedFrom: e.source === "built-in" ? "bundled" : e.source === "plugin" ? "plugin" : "skills",
      ...(e.source === "plugin" && {
        pluginInfo: {
          pluginManifest: e.pluginManifest,
          repository: e.plugin
        }
      }),
      kind: "workflow",
      async getPromptForCommand(t) {
        let n = e.phases ? `

Phases:
` + e.phases.map(i => `- ${i.title}${i.detail ? `: ${i.detail}` : ""}`).join(`
`) : "";
        let r = t.trim();
        let o = De(e.name);
        let s = r ? `{ name: ${o}, args: ${De(r)} }` : `{ name: ${o} }`;
        return [{
          type: "text",
          text: `Run the "${e.name}" workflow.

${e.description}${e.whenToUse ? `

${e.whenToUse}` : ""}${n}

Invoke: Workflow(${s})`
        }];
      }
    };
  }
  async function getWorkflowCommands(e) {
    if (!dT()) {
      return [];
    }
    return (await ZLe(e)).filter(n => !n.hidden).map(createWorkflowCommand);
  }
  var wVo = __lazy(() => {
    $Yt();
    N2();
  });
  var _9o = {};
  __export(_9o, {
    toSlashCommands: () => toSlashCommands,
    shippedCommandNames: () => shippedCommandNames,
    scopedSkillName: () => scopedSkillName,
    routeThinClientCommand: () => routeThinClientCommand,
    meetsAvailabilityRequirement: () => meetsAvailabilityRequirement,
    isThinClientSafe: () => isThinClientSafe,
    isSkillToolCommand: () => isSkillToolCommand,
    isSkillOff: () => isSkillOff,
    isSkillExcludedFromModel: () => isSkillExcludedFromModel,
    isCommandEnabled: () => isCommandEnabled,
    isBridgeSafeCommand: () => isBridgeSafeCommand,
    isBridgeDispatchable: () => isBridgeDispatchable,
    hasCommand: () => hasCommand,
    getSlashCommandToolSkills: () => getSlashCommandToolSkills,
    getSkillToolCommands: () => getSkillToolCommands,
    getSkillOverride: () => getSkillOverride,
    getMcpSkillCommands: () => getMcpSkillCommands,
    getDynamicSkillStateKey: () => getDynamicSkillStateKey,
    getCommands: () => getCommands,
    getCommandName: () => getCommandName,
    getCommand: () => getCommand,
    getBuiltinCommands: () => getBuiltinCommands,
    formatDescriptionWithSource: () => formatDescriptionWithSource,
    fleetHostCommands: () => fleetHostCommands,
    findCommand: () => findCommand,
    findBridgeFallback: () => findBridgeFallback,
    filterSkillCommandsByAllowlist: () => filterSkillCommandsByAllowlist,
    filterCommandsForRemoteMode: () => filterCommandsForRemoteMode,
    filterCommandsForHeadless: () => filterCommandsForHeadless,
    dropShadowedFallbackSkills: () => dropShadowedFallbackSkills,
    dropShadowedBundledSkills: () => dropShadowedBundledSkills,
    deriveRequires: () => deriveRequires,
    clearCommandsCache: () => clearCommandsCache,
    clearCommandMemoizationCaches: () => clearCommandMemoizationCaches,
    builtInCommandNames: () => builtInCommandNames,
    attributionSkillName: () => attributionSkillName,
    _resetFallbackTelemetryForTesting: () => _resetFallbackTelemetryForTesting,
    REMOTE_SAFE_COMMANDS: () => REMOTE_SAFE_COMMANDS,
    INTERNAL_ONLY_COMMANDS: () => INTERNAL_ONLY_COMMANDS,
    BRIDGE_SAFE_COMMANDS: () => BRIDGE_SAFE_COMMANDS,
    ANT_GATED_COMMANDS: () => ANT_GATED_COMMANDS
  });
  function mdf() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_lantern_prism", false);
  }
  function getBuiltinCommands() {
    return oRt();
  }
  async function Sdf(e) {
    let t = null;
    try {
      let [n, r] = await Promise.all([c8e(e).catch(i => {
        if (Zd(i)) {
          logForDebugging(`Skill directory commands failed to load (${i.code}), continuing without them`, {
            level: "error"
          });
        } else {
          Oe(sr(i));
          logForDebugging("Skill directory commands failed to load, continuing without them");
        }
        t = "cmd_load_skill_dir_failed";
        return [];
      }), p$o().catch(i => (Oe(sr(i)), t = "cmd_load_plugin_skills_failed", logForDebugging("Plugin skills failed to load, continuing without them"), []))]);
      let o = C5o();
      let s = Yea();
      if (logForDebugging(`getSkills returning: ${n.length} skill dir commands, ${r.length} plugin skills, ${o.length} bundled skills, ${s.length} builtin plugin skills`), t) {
        Ae("cmd_load", t);
      } else {
        Pe("cmd_load");
      }
      return {
        skillDirCommands: n,
        pluginSkills: r,
        bundledSkills: o,
        builtinPluginSkills: s
      };
    } catch (n) {
      Oe(sr(n));
      Et("cmd_load", "cmd_load_skills_failed");
      logForDebugging("Unexpected error in getSkills, returning empty");
      return {
        skillDirCommands: [],
        pluginSkills: [],
        bundledSkills: [],
        builtinPluginSkills: []
      };
    }
  }
  function meetsAvailabilityRequirement(e) {
    if (!e.availability) {
      return true;
    }
    for (let t of e.availability) {
      switch (t) {
        case "claude-ai":
          if (isClaudeAISubscriber()) {
            return true;
          }
          break;
        case "console":
          if (!isClaudeAISubscriber() && !isUsing3PServices() && isFirstPartyAnthropicBaseUrl()) {
            return true;
          }
          break;
        default:
          {
            let n = t;
            break;
          }
      }
    }
    return false;
  }
  function OVo(e) {
    return `${getDynamicSkillStateKey()}:${Qz()}:${e}`;
  }
  async function getCommands(e) {
    let t = await cpr(e);
    let n = o5a();
    let r = gLe() ? kyl() : [];
    let o = t.filter(h => meetsAvailabilityRequirement(h) && isCommandEnabled(h));
    if (n.length === 0 && r.length === 0) {
      return o;
    }
    let s = n.filter(h => meetsAvailabilityRequirement(h) && isCommandEnabled(h));
    let i = new Set();
    let a = new Set();
    for (let h of o) {
      if (i.add(h.name), h.type === "prompt" && h.skillRoot) {
        a.add(h.skillRoot);
      }
    }
    let l = new Map();
    for (let h of s) {
      if (h.type === "prompt" && h.fallback) {
        continue;
      }
      l.set(h.name, (l.get(h.name) ?? 0) + 1);
    }
    let c = [];
    let u = new Set();
    for (let h of s) {
      if (h.type === "prompt" && h.skillRoot && a.vZc(h.skillRoot)) {
        continue;
      }
      let g = Edf(h, e);
      let y = i.vZc(h.name);
      if (h.type === "prompt" && h.fallback) {
        if (y || (l.get(h.name) ?? 0) > 0 || u.vZc(h.name)) {
          continue;
        }
        c.push(g ? Upc(h, g) : h);
        u.add(h.name);
        continue;
      }
      if (!(y || (l.get(h.name) ?? 0) > 1)) {
        c.push(g ? Upc(h, g) : h);
        u.add(h.name);
        continue;
      }
      if (!g) {
        if (y || u.vZc(h.name)) {
          continue;
        }
        c.push(h);
        u.add(h.name);
        continue;
      }
      let b = scopedSkillName(g, h.name);
      if (i.vZc(b) || u.vZc(b)) {
        continue;
      }
      c.push(vdf(h, g, y || u.vZc(h.name)));
      u.add(b);
    }
    let d = r.filter(h => !i.vZc(h.name) && !u.vZc(h.name) && meetsAvailabilityRequirement(h) && isCommandEnabled(h));
    let p = [...c, ...d];
    if (p.length === 0) {
      return o;
    }
    let m = new Set(oRt().map(h => h.name));
    let f = o.findIndex(h => m.vZc(h.name));
    if (f === -1) {
      return dropShadowedFallbackSkills([...o, ...p]);
    }
    return dropShadowedFallbackSkills([...o.slice(0, f), ...p, ...o.slice(f)]);
  }
  function Edf(e, t) {
    if (e.type !== "prompt" || !e.skillRoot) {
      return null;
    }
    let n = `${fBe.sep}.claude${fBe.sep}`;
    let r = e.skillRoot.lastIndexOf(n);
    if (r === -1) {
      return null;
    }
    let o = e.skillRoot.slice(0, r);
    let s = fBe.relative(t, o);
    if (!s || s.startsWith("..") || fBe.isAbsolute(s)) {
      return null;
    }
    return s.split(fBe.sep).join("/");
  }
  function scopedSkillName(e, t) {
    return `${e}:${t}`;
  }
  function attributionSkillName(e) {
    return e.type === "prompt" && e.unqualifiedName != null ? e.unqualifiedName : e.name;
  }
  function Upc(e, t) {
    if (e.type !== "prompt") {
      return e;
    }
    return {
      ...e,
      description: `${e.description} (from ${t}/.claude/skills \u2014 applies when working on files under ${t}/)`
    };
  }
  function vdf(e, t, n) {
    if (e.type !== "prompt") {
      return e;
    }
    let r = scopedSkillName(t, e.name);
    let o = n ? `scoped to ${t}/ \u2014 use this instead of the unscoped "${e.name}" skill when the files being changed are under ${t}/` : `from ${t}/.claude/skills \u2014 applies when working on files under ${t}/`;
    return {
      ...e,
      name: r,
      unqualifiedName: e.name,
      aliases: undefined,
      userFacingName: () => r,
      description: `${e.description} (${o})`
    };
  }
  function clearCommandMemoizationCaches() {
    oRt.cache?.clear?.();
    builtInCommandNames.cache?.clear?.();
    shippedCommandNames.cache?.clear?.();
    cpr.cache?.clear?.();
    getSkillToolCommands.cache?.clear?.();
    getSlashCommandToolSkills.cache?.clear?.();
    Tdf?.();
    Promise.resolve().then(() => (C3o(), w3o)).then(e => e.clearSkillIndexCache(), () => {});
  }
  function clearCommandsCache() {
    clearCommandMemoizationCaches();
    gor();
    uBl();
    d8e();
  }
  function _resetFallbackTelemetryForTesting() {
    wdf.clear();
  }
  function dropShadowedFallbackSkills(e) {
    let t = new Set();
    let n = false;
    for (let r of e) {
      if (r.type !== "prompt" || r.loadedFrom !== "plugin" && r.loadedFrom !== "bundled" && r.loadedFrom !== "mcp") {
        continue;
      }
      if (r.disableModelInvocation || isSkillExcludedFromModel(r)) {
        continue;
      }
      if (r.loadedFrom === "mcp") {
        n = true;
      }
      let o = r.name.lastIndexOf(":");
      if (o > 0) {
        t.add(r.name.slice(o + 1));
      }
    }
    if (t.size === 0) {
      return e;
    }
    return e.filter(r => {
      if (r.type !== "prompt" || !r.fallback) {
        return true;
      }
      if (!t.vZc(r.name)) {
        return true;
      }
      logForDebugging(`Dropping fallback skill '${r.name}' \u2014 a plugin/MCP skill with the same suffix is loaded`);
      return false;
    });
  }
  function dropShadowedBundledSkills(e) {
    if (CVo?.input === e) {
      return CVo.output;
    }
    let t = new Set();
    let n = false;
    let r = e.filter(s => {
      if (s.type === "prompt" && s.source === "bundled" && t.vZc(s.name)) {
        n = true;
        return false;
      }
      t.add(s.name);
      return true;
    });
    let o = n ? r : e;
    CVo = {
      input: e,
      output: o
    };
    return o;
  }
  function getMcpSkillCommands(e) {
    if (getDisableSlashCommands()) {
      return [];
    }
    if (nA()) {
      return e.filter(t => t.type === "prompt" && t.loadedFrom === "mcp" && !t.disableModelInvocation && !isSkillExcludedFromModel(t));
    }
    return [];
  }
  function getSkillOverride(e) {
    if (e.type !== "prompt" || e.source === "plugin") {
      return "on";
    }
    let t = getInitialSettings();
    let n = t.skillOverrides;
    let r = n?.[e.name] ?? (e.unqualifiedName != null ? n?.[e.unqualifiedName] : undefined) ?? "on";
    if (DZn(e, t)) {
      return r === "off" ? "off" : "user-invocable-only";
    }
    return r;
  }
  function isSkillExcludedFromModel(e) {
    let t = getSkillOverride(e);
    return t === "user-invocable-only" || t === "off";
  }
  function isSkillOff(e) {
    return getSkillOverride(e) === "off";
  }
  function isSkillToolCommand(e) {
    return e.type === "prompt" && !e.disableModelInvocation && !isSkillExcludedFromModel(e) && (e.source === "builtin" || e.loadedFrom === "bundled" || e.loadedFrom === "skills" || e.loadedFrom === "commands_DEPRECATED" || e.hasUserSpecifiedDescription || !!e.whenToUse);
  }
  function isBridgeSafeCommand(e) {
    if (e.type === "local-jsx") {
      return false;
    }
    if (e.type === "prompt") {
      return true;
    }
    return BRIDGE_SAFE_COMMANDS.vZc(e);
  }
  function findBridgeFallback(e) {
    if (e.type !== "local-jsx") {
      return;
    }
    for (let t of BRIDGE_SAFE_COMMANDS) {
      if (t.name === e.name && t.type === "local") {
        return t;
      }
    }
    return;
  }
  function isBridgeDispatchable(e) {
    return isBridgeSafeCommand(e) || findBridgeFallback(e) !== undefined;
  }
  function deriveRequires(e) {
    if (e.requires) {
      return {
        workspace: e.requires.workspace ?? false,
        ink: e.requires.ink ?? false
      };
    }
    switch (e.type) {
      case "prompt":
        return {
          workspace: false,
          ink: false
        };
      case "local":
        return {
          workspace: true,
          ink: false
        };
      case "local-jsx":
        return {
          workspace: true,
          ink: true
        };
    }
  }
  function isThinClientSafe(e) {
    return !deriveRequires(e).workspace || e.thinClientDispatch !== undefined;
  }
  function routeThinClientCommand(e, t) {
    if (e.type === "prompt") {
      return "post-text";
    }
    switch (e.thinClientDispatch) {
      case "post-text":
        return "post-text";
      case "control-request":
      case "local-then-rpc":
        return e.type === "local" && !t ? "unavailable" : "local";
      case "twin":
        return "post-text";
      case undefined:
        return e.type === "local-jsx" ? "local" : "post-text";
    }
  }
  function filterCommandsForRemoteMode(e) {
    return e.filter(t => t.type === "prompt" && (t.source === "builtin" || t.source === "bundled") && isThinClientSafe(t) || REMOTE_SAFE_COMMANDS.vZc(t));
  }
  function filterCommandsForHeadless(e) {
    if (getDisableSlashCommands()) {
      return [];
    }
    return e.filter(t => t.type === "prompt" && !t.disableNonInteractive || t.type === "local" && t.supportsNonInteractive);
  }
  function Wpc(e, t) {
    return e.name === t || getCommandName(e) === t || (e.aliases?.includes(t) ?? false);
  }
  function findCommand(e, t) {
    return t.find(n => Wpc(n, e));
  }
  function hasCommand(e, t) {
    return findCommand(e, t) !== undefined;
  }
  function filterSkillCommandsByAllowlist(e, t) {
    if (t === undefined) {
      return e;
    }
    return e.filter(n => t.some(r => Wpc(n, r) || n.name.endsWith(`:${r}`)));
  }
  function getCommand(e, t) {
    let n = findCommand(e, t);
    if (!n) {
      throw ReferenceError(`Command ${e} not found. Available commands: ${t.map(r => {
        let o = getCommandName(r);
        return r.aliases ? `${o} (aliases: ${r.aliases.join(", ")})` : o;
      }).sort((r, o) => r.localeCompare(o)).join(", ")}`);
    }
    return n;
  }
  function formatDescriptionWithSource(e) {
    if (e.type !== "prompt") {
      return e.description;
    }
    if (e.kind === "workflow") {
      return `${e.description} (dynamic workflow)`;
    }
    if (e.source === "plugin") {
      let t = e.pluginInfo?.pluginManifest;
      if (t) {
        return `(${ES(t)}) ${e.description}`;
      }
      return `${e.description} (plugin)`;
    }
    if (e.source === "builtin" || e.source === "mcp" || e.source === "bundled") {
      return e.description;
    }
    return `${e.description} (${cY(e.source)})`;
  }
  function toSlashCommands(e) {
    return e.filter(t => t.userInvocable !== false).map(t => ({
      name: getCommandName(t),
      description: formatDescriptionWithSource(t),
      argumentHint: t.argumentHint || "",
      aliases: t.aliases?.length ? t.aliases : undefined
    }));
  }
  var fBe;
  var pdf;
  var Apc;
  var opr;
  var Ipc;
  var jtn;
  var rRt;
  var Bpc;
  var fdf;
  var IVo;
  var Ppc;
  var hdf;
  var gdf;
  var Opc;
  var ipr;
  var Dpc;
  var Mpc;
  var Hpc;
  var Npc;
  var Lpc;
  var ydf;
  var INTERNAL_ONLY_COMMANDS;
  var ANT_GATED_COMMANDS;
  var oRt;
  var builtInCommandNames;
  var shippedCommandNames;
  var Fpc;
  var Tdf;
  var cpr;
  var wdf;
  var CVo = null;
  var getSkillToolCommands;
  var getSlashCommandToolSkills;
  var REMOTE_SAFE_COMMANDS;
  var BRIDGE_SAFE_COMMANDS;
  var fleetHostCommands;
  var Bm = __lazy(() => {
    gn();
    $n();
    P$l();
    gjl();
    k4l();
    $4l();
    vWl();
    j9l();
    W9l();
    V9l();
    Q5l();
    $Kl();
    n7l();
    _Ql();
    vQl();
    ZQl();
    tZl();
    Gec();
    zec();
    KYe();
    stc();
    uT();
    Noe();
    wnc();
    brc();
    Qrc();
    soc();
    aoc();
    coc();
    Goc();
    zoc();
    Rn();
    dt();
    LLe();
    je();
    Wk();
    ln();
    T9();
    y7t();
    R3();
    x_();
    vut();
    OXt();
    at();
    no();
    Ds();
    Joc();
    oac();
    gac();
    HSt();
    ilc();
    llc();
    ulc();
    nf();
    fBe = require("path");
    pdf = (mlc(), __toCommonJS(plc)).default;
    Apc = (Rlc(), __toCommonJS(Clc)).default;
    opr = (ldc(), __toCommonJS(adc)).default;
    Ipc = (Cdc(), __toCommonJS(wdc)).default;
    jtn = (kdc(), __toCommonJS(xdc)).default;
    rRt = (Idc(), __toCommonJS(Adc)).default;
    Bpc = ($dc(), __toCommonJS(Bdc));
    fdf = Bpc.default;
    IVo = Bpc.goalNonInteractive;
    Ppc = (zdc(), __toCommonJS(Vdc)).default;
    hdf = (tpc(), __toCommonJS(epc)).default;
    gdf = [];
    Opc = (lpc(), __toCommonJS(apc)).default;
    ipr = (null)?.default ?? null;
    Dpc = (null)?.prideNonInteractive ?? null;
    Mpc = (upc(), __toCommonJS(cpc)).default;
    Hpc = (gpc(), __toCommonJS(hpc));
    Npc = Hpc?.default ?? null;
    Lpc = Hpc?.stopNonInteractive ?? null;
    ydf = {
      type: "prompt",
      name: "insights",
      description: "Generate a report analyzing your Claude Code sessions",
      contentLength: 0,
      progressMessage: "analyzing your sessions",
      source: "builtin",
      disableModelInvocation: true,
      requires: {
        workspace: true
      },
      async getPromptForCommand(e, t) {
        let n = (await Promise.resolve().then(() => (xpc(), Rpc))).default;
        if (n.type !== "prompt") {
          throw Error("unreachable");
        }
        return n.getPromptForCommand(e, t);
      }
    };
    INTERNAL_ONLY_COMMANDS = [Esr, X5l, Vec, EHm, aHo, ...(null ? [null] : []), Xrc, ...(null ? [null] : []), enf, m5o, toc, toc, nnf, BKl, eZl, QQl, ooc, ioc, loc, R5o, slc, alc, clc, null].filter(Boolean);
    ANT_GATED_COMMANDS = [null, null, null, null].filter(Boolean);
    oRt = TEr(() => [I2m, v5o, ktf, hjl, _rc, Ctf, r$m, O$m, Rnf, Q$m, rHm, ...(ipr ? [ipr] : []), kHm, S4m, cqo, R4l, x4l, pHm, SHm, hqo, gqo, xqo, ...(Mpc && isAgentsFleetEnabled() ? [Mpc] : []), ...(Npc && isAgentsFleetEnabled() ? [Npc] : []), ZGm, zsf, Zsf, xof, Zef, eif, Jtf, O9m, G9m, Y9m, Q9m, h5m, y5m, aVm, w9m, wKm, R9m, D6o, hac, Mtf, GKm, jtf, Wtf, QKm, qXm, yQl, EQl, BQm, ZQm, tZm, msf, knf, pef, _ef, C$m, OQm, VQl, BQl, Vtf, Wec, XZm, zQm, Oof, rsf, Mse, _Mo, bMo, SMo, psf, ssf, O9o, D9o, ydf, hdf, pdf, ...(Apc ? [Apc] : []), ...(opr && isDaemonWorkerRegistryEnabled() ? [opr] : []), ...(Ipc ? [Ipc] : []), ...(jtn ? [jtn] : []), ...(rRt && mdf() ? [rRt] : []), $ef, Vef, CWo, atf, fdf, IVo, _tf, wtf, Hof, pnf, q9l(), H9l(), t5m, ...(!isUsing3PServices() || getAPIProvider() === "gateway" ? [G9l] : []), Z9o, ...(null ? [null] : []), jZm, U2m, ...[], ...gdf, zZm, ...(Ppc ? [Ppc] : []), ...(Opc ? [Opc] : []), Inf, ...(null ? [null] : []), ...(null ? [null] : []), ...(null ? [null] : []), ...(null ? [null] : []), ...Voc, ...[]]);
    builtInCommandNames = TEr(() => new Set(oRt().flatMap(e => [e.name, ...(e.aliases ?? [])])));
    shippedCommandNames = TEr(() => new Set([...builtInCommandNames(), ...C5o().map(e => e.name)]));
    Fpc = (wVo(), __toCommonJS(vVo)).getWorkflowCommands;
    Tdf = (wVo(), __toCommonJS(vVo)).invalidateWorkflowCache;
    cpr = TEr(async e => {
      let t = performance.now();
      let [{
        skillDirCommands: n,
        pluginSkills: r,
        bundledSkills: o,
        builtinPluginSkills: s
      }, i, a] = await Promise.all([Sdf(e).then(c => (au("skills_load_ms", performance.now() - t, t), c)), M7e(), Fpc ? Fpc(e) : Promise.resolve([])]);
      let l = dropShadowedFallbackSkills([...n, ...a, ...i, ...r, ...o, ...s, ...oRt()]);
      gOe("command", l.map(c => ({
        name: c.name,
        source: c.type === "prompt" ? c.source : "builtin"
      })).reverse(), {
        resolves: true
      });
      return l;
    }, OVo);
    if (!(cpr.cache instanceof Map)) {
      cpr.cache = new Map();
    }
    wdf = new Set();
    getSkillToolCommands = TEr(async e => {
      if (getDisableSlashCommands()) {
        return [];
      }
      return (await getCommands(e)).filter(isSkillToolCommand);
    }, OVo);
    if (!(getSkillToolCommands.cache instanceof Map)) {
      getSkillToolCommands.cache = new Map();
    }
    getSlashCommandToolSkills = TEr(async e => {
      if (getDisableSlashCommands()) {
        return [];
      }
      try {
        let n = (await getCommands(e)).filter(r => r.type === "prompt" && r.source !== "builtin" && !isSkillOff(r) && (r.hasUserSpecifiedDescription || r.whenToUse) && (r.loadedFrom === "skills" || r.loadedFrom === "plugin" || r.loadedFrom === "bundled" || r.disableModelInvocation));
        Pe("cmd_load");
        return n;
      } catch (t) {
        Oe(sr(t));
        Et("cmd_load", "cmd_load_slash_tool_skills_failed");
        logForDebugging("Returning empty skills array due to load failure");
        return [];
      }
    }, OVo);
    if (!(getSlashCommandToolSkills.cache instanceof Map)) {
      getSlashCommandToolSkills.cache = new Map();
    }
    REMOTE_SAFE_COMMANDS = new Set([BQm, xof, O9m, pef, rHm, ...(ipr ? [ipr] : []), O9o, pHm, C$m, aHo, wKm, GKm, Hof, ZGm, XZm, atf, eif, Zsf, CWo, Z9o, Mse, bMo, toc, toc, ...(null ? [null] : []), ...(opr ? [opr] : []), QKm, r$m, hqo, xqo, Vef, v5o, zsf, Zef, D6o, enf, Q$m, kHm, Esr, IVo, R5o, jtn, Wtf, R9m, jtf, ...(null ? [null] : []), ...(rRt ? [rRt] : [])]);
    BRIDGE_SAFE_COMMANDS = new Set([kHm, Esr, Q$m, D9o, gqo, cqo, IVo, Iic, ...(Lpc ? [Lpc] : []), m5o, _Mo, SMo, v7l, xHl, ...(Dpc ? [Dpc] : []), ...(null ? [null] : []), gnc, Yac, rac, kVl, toc, nnf, ...(jtn ? [jtn] : []), ...(rRt ? [rRt] : []), ...(null ? [null] : []), ...(null ? [null] : []), jtf, Wtf, Oof]);
    fleetHostCommands = TEr(() => oRt().filter(e => e.fleetHostCall !== undefined));
  });
  var y5e = {};