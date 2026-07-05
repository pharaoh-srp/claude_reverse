  __export(oUc, {
    registerRunSkillGeneratorSkill: () => registerRunSkillGeneratorSkill
  });
  function registerRunSkillGeneratorSkill() {
    Qc({
      name: "run-skill-generator",
      menuDescription: "Create a skill that knows how to run this project\u2019s app",
      description: "Author or improve the run-<unit> skill \u2014 a per-project skill that tells agents how to build, launch, and drive this project's app. Use when the user asks to set up the project, get it running, write run instructions, or verify build/run steps work from a clean environment.",
      userInvocable: true,
      disableModelInvocation: true,
      files: async () => {
        let [{
          rUc: e
        }, {
          RUN_EXAMPLE_FILES: t
        }] = await Promise.all([Promise.resolve().then(() => (PZo(), IZo)), Promise.resolve().then(() => (AZo(), kZo))]);
        return {
          "template.md": e,
          ...t
        };
      },
      async getPromptForCommand(e) {
        let {
          lxl: t
        } = await Promise.resolve().then(() => (PZo(), IZo));
        let n = [sf(t).content.trimStart()];
        if (e) {
          n.push(`## User Request

${e}`);
        }
        return [{
          type: "text",
          text: n.join(`

`)
        }];
      }
    });
  }
  var sUc = __lazy(() => {
    fv();
    x_();
  });
  function pyr() {
    if (iUc) {
      return;
    }
    iUc = true;
    GDc();
    CMc();
    {
      NNc();
      let {
        registerDatavizSkill: o
      } = __toCommonJS(MNc);
      o();
    }
    aDc();
    UMc();
    EDc();
    HMc();
    ZMc();
    AMc();
    uNc();
    HDc();
    DMc();
    zMc();
    qMc();
    NMc();
    SDc();
    GMc();
    mDc();
    YMc();
    xMc();
    cDc();
    UDc();
    HNc();
    let {
      registerLoopSkill: e
    } = __toCommonJS($Nc);
    e();
    GNc();
    let {
      registerScheduleRemoteAgentsSkill: t
    } = __toCommonJS(WNc);
    if (t(), !st(process.env.CLAUDE_CODE_DISABLE_CLAUDE_API_SKILL)) {
      vFc();
      let {
        registerClaudeApiSkill: o
      } = __toCommonJS(EFc);
      o();
    }
    if (!st(process.env.CLAUDE_CODE_DISABLE_CLAUDE_CODE_SKILL)) {
      LFc();
      let {
        registerClaudeCodeSkill: o
      } = __toCommonJS(NFc);
      o();
    }
    if (!doesEnterpriseMcpConfigExist()) {
      hDc();
    }
    ZFc();
    let {
      registerRunSkill: n
    } = __toCommonJS(QFc);
    sUc();
    let {
      registerRunSkillGeneratorSkill: r
    } = __toCommonJS(oUc);
    n();
    r();
  }
  var iUc = false;
  var OZo = __lazy(() => {
    Iw();
    gn();
    lDc();
    uDc();
    fDc();
    gDc();
    vDc();
    wDc();
    BDc();
    qDc();
    VDc();
    RMc();
    kMc();
    IMc();
    MMc();
    LMc();
    BMc();
    $Mc();
    jMc();
    WMc();
    VMc();
    KMc();
    JMc();
    eNc();
    dNc();
  });
  function aUc(e, t) {
    if (e) {
      if (t < 30000) {
        return 15000;
      }
      if (t < 300000) {
        return 60000;
      }
      return 180000;
    }
    if (t < 30000) {
      return 60000;
    }
    if (t < 600000) {
      return 300000;
    }
    if (t < 3600000) {
      return 900000;
    }
    return 1800000;
  }
  async function lUc(e, t) {
    let n = DZo.get(e);
    if (n && Date.now() - n.at < 600000) {
      return n.suggestions;
    }
    let r = () => (DZo.set(e, {
      suggestions: t2e,
      at: Date.now()
    }), t2e);
    if (getAPIProvider() !== "firstParty" || Vi()) {
      return r();
    }
    let o = await MLf(e, t);
    if (t.aborted) {
      return t2e;
    }
    if (o === null) {
      return t2e;
    }
    if (o.length === 0) {
      return r();
    }
    let s = o.map(i => `Title: ${i.title}
Files: ${(i.files ?? []).slice(0, 12).map(a => a.path).join(", ")}
Body: ${(i.body ?? "").slice(0, 200)}`).join(`
---
`);
    try {
      let i = await RO({
        systemPrompt: [OLf],
        userPrompt: s,
        signal: t,
        options: {
          querySource: "fleet_agent_suggestions",
          agents: [],
          isNonInteractiveSession: getIsNonInteractiveSession(),
          hasAppendSystemPrompt: false,
          mcpTools: [],
          agentContext: ym(),
          promptTooLongIsHandled: true
        }
      });
      let a = Tl(i.message.content);
      let l = NLf(a);
      let c = myr.map((u, d) => u.template.replace("{scope}", l[d]?.trim() || u.genericScope));
      DZo.set(e, {
        suggestions: c,
        at: Date.now()
      });
      logForDebugging(`agentSuggestions: personalized ${Bn(l, Boolean)}/${myr.length} scopes`, {
        level: "debug"
      });
      return c;
    } catch (i) {
      if (t.aborted) {
        throw i;
      }
      Oe(i);
      return t2e;
    }
  }
  async function MLf(e, t) {
    for (let n of [["--author", "@me"], []]) {
      let r = await execFileNoThrowWithCwd("gh", ["pr", "list", "--state", "merged", ...n, "--limit", "5", "--json", "title,files,body"], {
        cwd: e,
        abortSignal: t,
        timeout: 8000
      });
      if (r.code !== 0) {
        logForDebugging("agentSuggestions: gh pr list failed", {
          level: "debug"
        });
        return null;
      }
      try {
        let o = qt(r.stdout);
        if (Array.isArray(o) && o.length > 0) {
          return o;
        }
      } catch {
        return null;
      }
    }
    return [];
  }
  function NLf(e) {
    let t = e.replace(/^```(?:json)?\s*/i, "").replace(/\s*```$/, "").trim();
    try {
      let n = qt(t);
      if (Array.isArray(n) && n.every(r => typeof r === "string")) {
        return n.slice(0, 3).map(r => String(r).slice(0, 120));
      }
    } catch {}
    return [];
  }
  var myr;
  var t2e;
  var OLf;
  var DZo;
  var cUc = __lazy(() => {
    at();
    aE();
    _h();
    je();
    ji();
    Rn();
    ro();
    Ds();
    Wd();
    myr = [{
      template: "find the performance bottlenecks in {scope} and rank them by impact",
      genericScope: "this codebase"
    }, {
      template: "write tests for {scope} where coverage looks thin",
      genericScope: "the recent changes"
    }, {
      template: "map out how {scope} works and write an architecture guide for it",
      genericScope: "this repo"
    }];
    t2e = myr.map(e => e.template.replace("{scope}", e.genericScope));
    OLf = `You narrow the scope of three generic coding tasks using a repo's recently merged PRs.

The three tasks (do NOT change their wording \u2014 you only fill in {scope}):
${myr.map((e, t) => `${t + 1}. ${e.template}`).join(`
`)}

Output: a JSON array of exactly 3 strings \u2014 one {scope} phrase per task, in order.

Each {scope} phrase must:
- Name a feature or area the PR author would RECOGNIZE from their own PR titles (e.g. "the OAuth refresh flow", "the sandbox network proxy", "the FleetView dispatch path")
- Be 2-6 words. No file paths, no function names, no lists.
- Be a singular noun phrase ("the billing flow", never "the recent billing changes") \u2014 task 3 conjugates it as a subject ("how {scope} works").
- Read naturally when dropped into the sentence above.

If no PR gives a recognizable anchor for a task, return "" for that slot and the generic will be used.

Output JSON only \u2014 no prose, no code fence.`;
    DZo = new Map();
  });
  function FLf(e, t) {
    let n = new Map();
    let r = [];
    for (let o of t) {
      let s = e.get(o.id);
      let i = o.band === "blocked" && o.needs === "send a prompt to start";
      if (n.set(o.id, i && s !== undefined ? s : o.band), s === undefined || s === o.band || i) {
        continue;
      }
      switch (o.band) {
        case "blocked":
          r.push({
            message: o.needs ? `${o.label} needs your input: ${mf(o.needs, 120)}` : `${o.label} needs your input`,
            notificationType: "agent_needs_input"
          });
          break;
        case "completed":
          if (o.outcome !== "stopped" && !o.selfDriving) {
            r.push({
              message: `${o.label} ${o.outcome === "failure" ? "failed" : "finished"}`,
              notificationType: "agent_completed"
            });
          }
          break;
        case "active":
          break;
      }
    }
    return {
      next: n,
      notifications: r
    };
  }
  function uUc(e) {
    let t = lG();
    let n = fyr.useRef(new Map());
    fyr.useEffect(() => {
      let {
        next: r,
        notifications: o
      } = FLf(n.current, e);
      n.current = r;
      for (let s of o) {
        KQ(s, t);
      }
    });
  }
  var fyr;
  var dUc = __lazy(() => {
    uq();
    Qme();
    zf();
    mbt();
    fyr = __toESM(ot(), 1);
  });
  function mUc(e) {
    let t = e?.agent ?? getInitialSettings().agent;
    if (!e && !t) {
      return;
    }
    let n = e?.permissionMode ? uF(e.permissionMode) : undefined;
    let r = !isBypassPermissionsModeDisabled() && (hasSkipDangerousModePermissionPrompt() || Boolean(getGlobalConfig().bypassPermissionsModeAccepted));
    let o = n === "bypassPermissions" && !r || n === "auto" && !hasAutoModeOptIn() ? undefined : n;
    let s = e?.allowBypass && r ? true : undefined;
    let i = e?.effort?.toLowerCase();
    let a = i && zce(i) ? i : undefined;
    if (!o && !e?.model && !a && !t && !s) {
      return;
    }
    return {
      permissionMode: o,
      model: e?.model,
      effort: a,
      agent: t,
      allowBypass: s
    };
  }
  function fUc(e) {
    return !!e.permissionMode && e.permissionMode !== "default" || !!e.model || !!e.effort || !!e.agent || !!e.allowBypass;
  }
  function hUc(e) {
    let t = pUc.c(17);
    let {
      defaults: n
    } = e;
    let {
      permissionMode: r,
      model: o,
      effort: s,
      agent: i,
      allowBypass: a
    } = n;
    let l = !!r && r !== "default";
    let c = a && !l;
    if (!l && !o && !s && !i && !c) {
      return null;
    }
    let u;
    if (t[0] !== r || t[1] !== l) {
      u = l && n2e.jsxs(Text, {
        color: dF(r),
        children: [Lnt(r), " ", mY(r).toLowerCase()]
      });
      t[0] = r;
      t[1] = l;
      t[2] = u;
    } else {
      u = t[2];
    }
    let d;
    if (t[3] !== c) {
      d = c && n2e.jsxs(Text, {
        color: dF("bypassPermissions"),
        children: [Lnt("bypassPermissions"), " bypass available"]
      });
      t[3] = c;
      t[4] = d;
    } else {
      d = t[4];
    }
    let p;
    if (t[5] !== i) {
      p = i && n2e.jsxs(Text, {
        dimColor: true,
        children: ["@", i]
      });
      t[5] = i;
      t[6] = p;
    } else {
      p = t[6];
    }
    let m;
    if (t[7] !== o) {
      m = o && n2e.jsx(Text, {
        dimColor: true,
        children: o
      });
      t[7] = o;
      t[8] = m;
    } else {
      m = t[8];
    }
    let f;
    if (t[9] !== s) {
      f = s && n2e.jsx(Text, {
        dimColor: true,
        children: s
      });
      t[9] = s;
      t[10] = f;
    } else {
      f = t[10];
    }
    let h;
    if (t[11] !== u || t[12] !== d || t[13] !== p || t[14] !== m || t[15] !== f) {
      h = n2e.jsxs(Hn, {
        children: [u, d, p, m, f]
      });
      t[11] = u;
      t[12] = d;
      t[13] = p;
      t[14] = m;
      t[15] = f;
      t[16] = h;
    } else {
      h = t[16];
    }
    return h;
  }
  var pUc;
  var n2e;
  var gUc = __lazy(() => {
    Ai();
    et();
    Fp();
    Bbe();
    HT();
    pUc = __toESM(pt(), 1);
    n2e = __toESM(ie(), 1);
  });
  function _Uc(e) {
    let t = yUc.c(18);
    let {
      questions: n,
      ageLabel: r,
      ageColor: o
    } = e;
    let s = n[0];
    if (!s) {
      return null;
    }
    let i;
    if (t[0] !== o || t[1] !== r) {
      i = xL.jsx(Text, {
        color: o,
        children: r
      });
      t[0] = o;
      t[1] = r;
      t[2] = i;
    } else {
      i = t[2];
    }
    let a;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      a = xL.jsx(Text, {
        children: " "
      });
      t[3] = a;
    } else {
      a = t[3];
    }
    let l;
    if (t[4] !== s.question) {
      l = xL.jsx(gXd, {
        flexGrow: 1,
        width: 0,
        children: xL.jsx(Text, {
          bold: true,
          wrap: "truncate",
          children: s.question
        })
      });
      t[4] = s.question;
      t[5] = l;
    } else {
      l = t[5];
    }
    let c;
    if (t[6] !== n.length) {
      c = n.length > 1 && xL.jsx(gXd, {
        flexShrink: 0,
        paddingLeft: 1,
        children: xL.jsxs(Text, {
          dimColor: true,
          children: ["+", n.length - 1, " more \xB7 enter to open"]
        })
      });
      t[6] = n.length;
      t[7] = c;
    } else {
      c = t[7];
    }
    let u;
    if (t[8] !== i || t[9] !== l || t[10] !== c) {
      u = xL.jsxs(gXd, {
        children: [i, a, l, c]
      });
      t[8] = i;
      t[9] = l;
      t[10] = c;
      t[11] = u;
    } else {
      u = t[11];
    }
    let d;
    if (t[12] !== s.options) {
      d = s.options.map(ULf);
      t[12] = s.options;
      t[13] = d;
    } else {
      d = t[13];
    }
    let p;
    if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
      p = xL.jsx(gXd, {
        paddingLeft: 5,
        children: xL.jsx(Text, {
          dimColor: true,
          children: "or type your own answer below"
        })
      });
      t[14] = p;
    } else {
      p = t[14];
    }
    let m;
    if (t[15] !== u || t[16] !== d) {
      m = xL.jsxs(gXd, {
        flexDirection: "column",
        children: [u, d, p]
      });
      t[15] = u;
      t[16] = d;
      t[17] = m;
    } else {
      m = t[17];
    }
    return m;
  }
  function ULf(e, t) {
    return xL.jsxs(gXd, {
      paddingLeft: 2,
      children: [xL.jsx(gXd, {
        width: 3,
        flexShrink: 0,
        children: xL.jsxs(Text, {
          dimColor: true,
          children: [t + 1, "."]
        })
      }), xL.jsx(gXd, {
        flexGrow: 1,
        width: 0,
        children: xL.jsxs(Text, {
          wrap: "truncate",
          children: [e.label, e.description && xL.jsxs(Text, {
            dimColor: true,
            children: [" \xB7 ", e.description]
          })]
        })
      })]
    }, e.label);
  }
  function bUc(e, t) {
    let n = t?.[0];
    if (!n || e < "1" || e > "9") {
      return null;
    }
    let r = Number(e) - 1;
    return n.options[r]?.label ?? null;
  }
  var yUc;
  var xL;
  var SUc = __lazy(() => {
    et();
    yUc = __toESM(pt(), 1);
    xL = __toESM(ie(), 1);
  });
  function vxt(e) {
    let t = TUc.c(11);
    let {
      children: n,
      mouseTracking: r,
      background: o
    } = e;
    let s = r === undefined ? "full" : r;
    let i = Ext.useContext(gue);
    let a = Ext.useContext(Z8);
    let l;
    let c;
    if (t[0] !== o || t[1] !== a) {
      l = () => {
        let f = rVd.get(process.stdout);
        if (!a || !o) {
          return;
        }
        a(VNn(o));
        f?.setAltScreenBackground(o);
        return () => {
          if (f ? !f.isAltScreenActive : false) {
            return;
          }
          f?.setAltScreenBackground(undefined);
          a(lct());
        };
      };
      c = [a, o];
      t[0] = o;
      t[1] = a;
      t[2] = l;
      t[3] = c;
    } else {
      l = t[2];
      c = t[3];
    }
    Ext.useInsertionEffect(l, c);
    let u;
    let d;
    if (t[4] !== s || t[5] !== a) {
      u = () => {
        let f = rVd.get(process.stdout);
        if (!a) {
          return;
        }
        a(dPe() + uPe(s));
        f?.setAltScreenActive(true, s);
        return () => {
          let h = f ? !f.isAltScreenActive : false;
          if (f?.setAltScreenActive(false), f?.clearTextSelection(), h) {
            a(s !== "off" ? mue : "");
            return;
          }
          a((s !== "off" ? mue : "") + GF() + (f?.hasUnmounted ? "" : mre()));
        };
      };
      d = [a, s];
      t[4] = s;
      t[5] = a;
      t[6] = u;
      t[7] = d;
    } else {
      u = t[6];
      d = t[7];
    }
    Ext.useInsertionEffect(u, d);
    let p = i?.rows ?? 24;
    let m;
    if (t[8] !== n || t[9] !== p) {
      m = EUc.jsx(oJd, {
        flexDirection: "column",
        height: p,
        width: "100%",
        flexShrink: 0,
        children: n
      });
      t[8] = n;
      t[9] = p;
      t[10] = m;
    } else {
      m = t[10];
    }
    return m;
  }
  var TUc;
  var Ext;
  var EUc;
  var hyr = __lazy(() => {
    mT();
    zNn();
    qJ();
    uq();
    pct();
    TUc = __toESM(pt(), 1);
    Ext = __toESM(ot(), 1);
    EUc = __toESM(ie(), 1);
  });
  var xon = {};