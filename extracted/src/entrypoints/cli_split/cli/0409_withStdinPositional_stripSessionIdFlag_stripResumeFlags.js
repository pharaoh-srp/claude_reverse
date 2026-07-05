  __export(Doc, {
    call: () => call_export73
  });
  async function call_export73() {
    if (await Ac("https://www.stickermule.com/claudecode")) {
      return {
        type: "text",
        value: "Opening sticker page in browser\u2026"
      };
    } else {
      return {
        type: "text",
        value: "Failed to open browser. Visit: https://www.stickermule.com/claudecode"
      };
    }
  }
  var Moc = __lazy(() => {
    ky();
  });
  var knf;
  var Foc = {};
  __export(Foc, {
    call: () => call_export74
  });
  async function call_export74() {
    if (await Ac("https://clau.de/radio")) {
      return {
        type: "text",
        value: "Opening Claude FM in your browser\u2026"
      };
    }
    return {
      type: "text",
      value: "Couldn't open the browser. Listen at: https://clau.de/radio"
    };
  }
  var Uoc = __lazy(() => {
    ky();
  });
  var Inf;
  var qoc = {};
  __export(qoc, {
    call: () => call_export75,
    applyAdvisor: () => applyAdvisor
  });
  function applyAdvisor(e, t, n) {
    let r = c_();
    if (logEvent("tengu_advisor_command", {
      advisor: e,
      remote: r
    }), !r && Ul()) {
      return "The advisor can't be changed from this client \u2014 this connection is view-only or has no control channel";
    }
    let o = r ? " (this session only)" : "";
    if (e === "off") {
      if (n(c => c.advisorModel === undefined ? c : {
        ...c,
        advisorModel: undefined
      }), r) {
        Ul()?.sendControlRequest({
          subtype: "apply_flag_settings",
          settings: {
            advisorModel: null
          }
        }).catch(Oe);
      } else {
        updateSettingsForSource("userSettings", {
          advisorModel: undefined
        });
      }
      return `Advisor disabled${o}`;
    }
    let s = normalizeModelStringForAPI(e);
    if (!JHn(s)) {
      let c = [...zpt(), "off"].join(", ");
      return `${Li(JO(s))} cannot be used as an advisor. Valid options: ${c}`;
    }
    if (n(c => c.advisorModel === s ? c : {
      ...c,
      advisorModel: s
    }), r) {
      Ul()?.sendControlRequest({
        subtype: "apply_flag_settings",
        settings: {
          advisorModel: s
        }
      }).catch(Oe);
    } else {
      updateSettingsForSource("userSettings", {
        advisorModel: s
      });
    }
    let i = Li(JO(s));
    let a = Li(JO(t));
    let l = `Advisor set to ${i}${o}`;
    if (!jDe(t)) {
      l += `
Note: the current main model (${a}) does not support the advisor. It will activate when you switch to a supported main model.`;
    } else if (!l5e(t, s)) {
      l += `
Note: ${i} is less capable than the current main model (${a}), so the advisor will not activate. Choose a more capable advisor, or switch to a smaller main model.`;
    }
    return l;
  }
  function Onf(e) {
    let t = joc.c(32);
    let {
      onDone: n
    } = e;
    let r = bt(Nnf);
    let o = dR();
    let s = Lo();
    let i;
    let a;
    let l;
    if (t[0] !== r) {
      let C = zpt();
      a = r ? Lnf(r, C) : undefined;
      i = r && !a && JHn(r) ? {
        label: Li(JO(r)),
        value: r
      } : undefined;
      let x;
      if (t[4] !== i) {
        x = i ? [i] : [];
        t[4] = i;
        t[5] = x;
      } else {
        x = t[5];
      }
      let A;
      if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
        A = {
          label: "No advisor",
          value: "off"
        };
        t[6] = A;
      } else {
        A = t[6];
      }
      l = [...C.map(Mnf), ...x, A];
      t[0] = r;
      t[1] = i;
      t[2] = a;
      t[3] = l;
    } else {
      i = t[1];
      a = t[2];
      l = t[3];
    }
    let c = l;
    let u = i ? i.value : a ?? "off";
    let d;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      d = [];
      t[7] = d;
    } else {
      d = t[7];
    }
    gCt.useEffect(Dnf, d);
    let p;
    if (t[8] !== n) {
      p = () => n(undefined, {
        display: "skip"
      });
      t[8] = n;
      t[9] = p;
    } else {
      p = t[9];
    }
    let m;
    if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
      m = D5.jsx(Text, {
        children: "When Claude needs stronger judgment \u2014 a complex decision, an ambiguous failure, a problem it's circling without progress \u2014 it escalates to the advisor model for guidance, then resumes. The advisor runs server-side and uses additional tokens."
      });
      t[10] = m;
    } else {
      m = t[10];
    }
    let f;
    if (t[11] !== o) {
      f = !jDe(o) && D5.jsxs(Text, {
        color: "warning",
        children: ["The current main model (", Li(JO(o)), ") does not support the advisor."]
      });
      t[11] = o;
      t[12] = f;
    } else {
      f = t[12];
    }
    let h;
    if (t[13] !== o || t[14] !== n || t[15] !== s) {
      h = C => n(applyAdvisor(C, o, s));
      t[13] = o;
      t[14] = n;
      t[15] = s;
      t[16] = h;
    } else {
      h = t[16];
    }
    let g;
    if (t[17] !== n) {
      g = () => n(undefined, {
        display: "skip"
      });
      t[17] = n;
      t[18] = g;
    } else {
      g = t[18];
    }
    let y;
    if (t[19] !== u || t[20] !== c || t[21] !== h || t[22] !== g) {
      y = D5.jsx(xr, {
        options: c,
        defaultValue: u,
        defaultFocusValue: u,
        onChange: h,
        onCancel: g
      });
      t[19] = u;
      t[20] = c;
      t[21] = h;
      t[22] = g;
      t[23] = y;
    } else {
      y = t[23];
    }
    let _;
    let b;
    if (t[24] === Symbol.for("react.memo_cache_sentinel")) {
      b = D5.jsxs(Text, {
        children: [D5.jsx(Text, {
          color: "suggestion",
          children: "Recommended setup: "
        }), D5.jsx(Text, {
          children: "Sonnet as the main model with Opus as the advisor. For certain workloads this gives near-Opus performance with reduced token usage."
        })]
      });
      _ = D5.jsx(eD, {
        url: "https://claude.com/blog/the-advisor-strategy"
      });
      t[24] = _;
      t[25] = b;
    } else {
      _ = t[24];
      b = t[25];
    }
    let S;
    if (t[26] !== f || t[27] !== y) {
      S = D5.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [m, f, y, b, _]
      });
      t[26] = f;
      t[27] = y;
      t[28] = S;
    } else {
      S = t[28];
    }
    let E;
    if (t[29] !== S || t[30] !== p) {
      E = D5.jsx(or, {
        title: "Advisor (experimental)",
        onCancel: p,
        children: S
      });
      t[29] = S;
      t[30] = p;
      t[31] = E;
    } else {
      E = t[31];
    }
    return E;
  }
  function Dnf() {
    logEvent("tengu_advisor_dialog_shown", {});
  }
  function Mnf(e) {
    return {
      label: JO(e),
      value: e
    };
  }
  function Nnf(e) {
    return e.advisorModel;
  }
  function Lnf(e, t) {
    let n = e.toLowerCase();
    return t.find(r => n.includes(r));
  }
  function Hoc({
    choice: e,
    onDone: t
  }) {
    let n = Lo();
    let r = dR();
    let o = gCt.useRef(r);
    o.current = r;
    let s = gCt.useRef(false);
    gCt.useEffect(() => {
      if (s.current) {
        return;
      }
      s.current = true;
      let i = setTimeout((a, l, c, u) => {
        a(applyAdvisor(l, c.current, u));
      }, 0, t, e, o, n);
      return () => clearTimeout(i);
    }, [e, n, t]);
    return null;
  }
  var joc;
  var gCt;
  var D5;
  var call_export75 = async (e, t, n) => {
    let r = n.trim().toLowerCase();
    if (!r) {
      return D5.jsx(Onf, {
        onDone: e
      });
    }
    if (r === "off" || r === "unset") {
      return D5.jsx(Hoc, {
        choice: "off",
        onDone: e
      });
    }
    let o = parseUserSpecifiedModel(r);
    let s = await x7t(o);
    if (!s.valid) {
      e(`Invalid advisor model: ${s.error}`);
      return null;
    }
    if (!qDe(o)) {
      e(`${r} cannot be used as an advisor. Valid options: ${[...zpt(), "off"].join(", ")}`);
      return null;
    }
    return D5.jsx(Hoc, {
      choice: r,
      onDone: e
    });
  };
  var Woc = __lazy(() => {
    $c();
    Ii();
    die();
    iH();
    et();
    ru();
    Ot();
    ho();
    UV();
    Rn();
    Eo();
    EQn();
    Pwe();
    joc = __toESM(pt(), 1);
    gCt = __toESM(ot(), 1);
    D5 = __toESM(ie(), 1);
  });
  var v5o;
  var Goc = __lazy(() => {
    UV();
    v5o = {
      type: "local-jsx",
      name: "advisor",
      description: "Let Claude consult a stronger model at key moments",
      requires: {
        ink: true
      },
      thinClientDispatch: "control-request",
      get argumentHint() {
        return `[${[...zpt(), "off"].join("|")}]`;
      },
      isEnabled: () => FV(),
      get isHidden() {
        return !FV();
      },
      load: () => Promise.resolve().then(() => (Woc(), qoc))
    };
  });
  function eBe() {
    if (!isFirstPartyAnthropicBaseUrl()) {
      return false;
    }
    return is1PApiCustomer();
  }
  var w5o = __lazy(() => {
    no();
    Ds();
  });
  function Unf() {
    return eBe() && !getIsNonInteractiveSession() && getFeatureValue_CACHED_MAY_BE_STALE("tengu_c4e_slash_upsell", false);
  }
  function Bnf(e) {
    return `/${e} is available with Claude for Enterprise \u2014 ask your admin about migrating from API-key access.`;
  }
  function yCt(e) {
    return {
      type: "local",
      name: e.name,
      aliases: e.aliases,
      description: `${e.description} \u2014 available with Claude for Enterprise`,
      isEnabled: () => !$nf() && Unf(),
      isHidden: true,
      supportsNonInteractive: false,
      load: () => Promise.resolve({
        call: async () => (logEvent("tengu_c4e_slash_upsell_shown", {
          command: e.name
        }), {
          type: "text",
          value: Bnf(e.name)
        })
      })
    };
  }
  function $nf() {
    return isClaudeAISubscriber();
  }
  var Voc;
  var zoc = __lazy(() => {
    at();
    $n();
    Ot();
    no();
    w5o();
    Voc = [yCt({
      name: "ultraplan",
      description: "Claude Code on the web drafts a plan you can edit and approve"
    }), yCt({
      name: "ultrareview",
      description: "Find and verify bugs in your branch using Claude Code on the web"
    }), yCt({
      name: "teleport",
      aliases: ["tp"],
      description: "Resume a Claude Code session from claude.ai"
    }), yCt({
      name: "remote-control",
      aliases: ["rc"],
      description: "Control this session from your phone or claude.ai/code"
    }), yCt({
      name: "schedule",
      aliases: ["routines"],
      description: "Create and manage scheduled remote Claude Code agents"
    }), yCt({
      name: "autofix-pr",
      description: "Monitor and autofix any issues with the current PR"
    })];
  });
  function Qc(e) {
    let {
      files: t
    } = e;
    let n;
    let r = e.getPromptForCommand;
    let o = typeof t === "function";
    if (t && (o || Object.keys(t).length > 0)) {
      n = Yoc(e.name);
      let i;
      let a = e.getPromptForCommand;
      r = async (l, c) => {
        i ??= (async () => {
          let p = o ? await t() : t;
          return Hnf(e.name, p);
        })();
        let u = await i;
        let d = await a(l, c);
        if (u === null) {
          return d;
        }
        return znf(d, u);
      };
    }
    let s = {
      type: "prompt",
      name: e.name,
      description: typeof e.description === "function" ? "" : e.description,
      menuDescription: e.menuDescription,
      aliases: e.aliases,
      subcommands: e.subcommands,
      hasUserSpecifiedDescription: true,
      allowedTools: e.allowedTools ?? [],
      disallowedTools: e.disallowedTools ?? [],
      argumentHint: typeof e.argumentHint === "function" ? undefined : e.argumentHint,
      whenToUse: typeof e.whenToUse === "function" ? undefined : e.whenToUse,
      model: e.model,
      disableModelInvocation: e.disableModelInvocation ?? false,
      userInvocable: e.userInvocable ?? true,
      contentLength: 0,
      source: "bundled",
      loadedFrom: "bundled",
      hooks: e.hooks,
      skillRoot: n,
      context: e.context,
      agent: e.agent,
      isEnabled: e.isEnabled,
      requires: e.requires,
      isHidden: !(e.userInvocable ?? true),
      progressMessage: e.progressMessage ?? "running",
      getPromptForCommand: r,
      getEffort: e.getEffort,
      getArgumentCompletions: e.getArgumentCompletions
    };
    dOe(s, "description", e.description);
    dOe(s, "argumentHint", e.argumentHint);
    dOe(s, "whenToUse", e.whenToUse);
    Koc.push(s);
  }
  function C5o() {
    if (Qz()) {
      return [];
    }
    return [...Koc];
  }
  function Yoc(e) {
    return Rie.join(getBundledSkillsRoot(), e);
  }
  async function Hnf(e, t) {
    let n = Yoc(e);
    try {
      await jnf(n, t);
      Pe("skill_bundled_extract");
      return n;
    } catch (r) {
      logForDebugging(`Failed to extract bundled skill '${e}' to ${n}: ${r instanceof Error ? r.message : String(r)}`);
      Ae("skill_bundled_extract", "skill_bundled_extract_write_failed");
      return null;
    }
  }
  async function jnf(e, t) {
    let n = new Map();
    for (let [r, o] of Object.entries(t)) {
      let s = Vnf(e, r);
      let i = Rie.dirname(s);
      let a = [s, o];
      let l = n.get(i);
      if (l) {
        l.push(a);
      } else {
        n.set(i, [a]);
      }
    }
    await Promise.all([...n].map(async ([r, o]) => {
      await yur.mkdir(r, {
        recursive: true,
        mode: 448
      });
      await Promise.all(o.map(([s, i]) => Gnf(s, i)));
    }));
  }
  async function Gnf(e, t) {
    let n = await yur.open(e, Wnf, 384);
    try {
      await n.writeFile(t, "utf8");
    } finally {
      await n.close();
    }
  }
  function Vnf(e, t) {
    let n = Rie.normalize(t);
    if (Rie.isAbsolute(n) || n.split(Rie.sep).includes("..") || n.split("/").includes("..")) {
      throw Error(`bundled skill file path escapes skill dir: ${t}`);
    }
    return Rie.join(e, n);
  }
  function znf(e, t) {
    let n = `Base directory for this skill: ${t}

`;
    if (e.length > 0 && e[0].type === "text") {
      return [{
        type: "text",
        text: n + e[0].text
      }, ...e.slice(1)];
    }
    return [{
      type: "text",
      text: n
    }, ...e];
  }
  var Den;
  var yur;
  var Rie;
  var Koc;
  var qnf;
  var Wnf;
  var x_ = __lazy(() => {
    ln();
    je();
    wm();
    LLe();
    Den = require("fs");
    yur = require("fs/promises");
    Rie = require("path");
    Koc = [];
    qnf = Den.constants.O_NOFOLLOW ?? 0;
    Wnf = Den.constants.O_WRONLY | Den.constants.O_CREAT | Den.constants.O_EXCL | qnf;
  });
  var R5o;
  var Joc = __lazy(() => {
    R5o = {
      isEnabled: () => false,
      isHidden: true,
      name: "stub"
    };
  });
  function Men() {
    let e = new Set();
    let t = "";
    return {
      feed(n, r) {
        let o = t ? t + n : n;
        Qoc.lastIndex = 0;
        let s;
        let i = 0;
        let a = false;
        while ((s = Qoc.exec(o)) !== null) {
          let u = s[2] === "h";
          for (let d of s[1].split(";")) {
            let p = Number(d);
            if (Xoc.vZc(p) && e.vZc(p) !== u) {
              if (u) {
                e.add(p);
                r?.(p);
              } else {
                e.delete(p);
              }
              a = true;
            }
          }
          i = s.index + s[0].length;
        }
        let l = o.slice(Math.max(i, o.length - 16));
        let c = l.lastIndexOf("\x1B");
        t = c >= 0 && /^\x1b(\[(\?[\d;]*)?)?$/.test(l.slice(c)) ? l.slice(c) : "";
        return a;
      },
      seed(n) {
        for (let r of n) {
          if (Xoc.vZc(r)) {
            e.add(r);
          }
        }
      },
      snapshot() {
        return [...e];
      }
    };
  }
  var Xoc;
  var Qoc;
  var x5o = __lazy(() => {
    Xoc = new Set([1000, 1002, 1003, 1004, 1006, 2004, 2031]);
    Qoc = /\x1b\[\?([\d;]+)([hl])/g;
  });
  function iee(e, t, n) {
    return e.length - t >= n.length && e.compare(n, 0, n.length, t, t + n.length) === 0;
  }
  function Len(e, t) {
    let n = Math.min(e.length, t.length - 1);
    e: for (let r = n; r > 0; r--) {
      let o = e.length - r;
      for (let s = 0; s < r; s++) {
        if (e[o + s] !== t[s]) {
          continue e;
        }
      }
      return r;
    }
    return 0;
  }
  function asc(e, t) {
    for (let n = 0; n < e.length; n++) {
      let r = e[n];
      if (t) {
        if (t = false, r === 100) {
          return {
            matched: true,
            prefixArmed: false
          };
        }
        continue;
      }
      if (r === 26 || r === 3 || iee(e, n, ssc) || iee(e, n, isc) || iee(e, n, Znf) || iee(e, n, erf)) {
        return {
          matched: true,
          prefixArmed: false
        };
      }
      let o = r === 2 ? 1 : iee(e, n, bur) ? bur.length : iee(e, n, Sur) ? Sur.length : 0;
      if (o) {
        n += o - 1;
        t = true;
      }
    }
    return {
      matched: false,
      prefixArmed: t
    };
  }
  function lsc(e) {
    let t = false;
    let n = false;
    let r;
    let o = new Promise(i => {
      r = i;
    });
    let s = () => {
      if (t) {
        return;
      }
      let i;
      while ((i = e.read()) !== null) {
        let a = typeof i === "string" ? Buffer.from(i, "utf8") : i;
        let l = asc(a, n);
        if (n = l.prefixArmed, l.matched) {
          t = true;
          r();
          return;
        }
      }
    };
    if (e.on("readable", s), "resume" in e && "pause" in e) {
      e.resume();
      e.pause();
    }
    s();
    return {
      promise: o,
      cancel: () => {
        t = true;
        e.removeListener("readable", s);
      }
    };
  }
  function Tur(e) {
    return asc(e, false).matched;
  }
  async function aee(e, t = {}) {
    let n = t.stdin ?? process.stdin;
    let r = t.stdout ?? process.stdout;
    let o = "columns" in r ? r.columns || 120 : 120;
    let s = "rows" in r ? r.rows || 30 : 30;
    let i = o;
    let a = s;
    let l = tsc.randomUUID();
    let c = await Ofe();
    let u = Date.now();
    let d;
    let p;
    let m;
    let f;
    let h = false;
    function g() {
      if (h) {
        return;
      }
      h = true;
      logEvent("tengu_bg_attach_first_frame", {
        ms: Date.now() - u,
        ack_ms: d,
        via: p == null ? undefined : p,
        tempo: m == null ? undefined : m,
        state: f
      });
    }
    let y;
    let _ = new Promise(me => {
      y = me;
    });
    let b = false;
    let S = false;
    let E = false;
    let C;
    let x = o;
    let A = s;
    let k = Men();
    let I = mre();
    let O = Wt() === "windows" && !Keo();
    let M = t.holdScreenOnDisconnect && Wt() === "windows" ? true : "isRaw" in n ? Boolean(n.isRaw) : false;
    let L = Wt() === "windows";
    let P = Buffer.from(WF, "ascii");
    let F = Buffer.from(sG, "ascii");
    let H = L && Lno();
    let U = false;
    let N;
    let W;
    try {
      W = nsc.connect(T5());
    } catch (me) {
      return {
        outcome: "error",
        msg: B0(he(me))
      };
    }
    W.setTimeout(1e4, () => {
      if (!S) {
        j("error", `${bgSupervisorNoun()} did not respond \u2014 it may be stalled${daemonHint("restart")}`);
      }
    });
    function j(me, Te, ue) {
      if (b) {
        return;
      }
      if (b = true, clearTimeout(N), logEvent("tengu_bg_attach_outcome", {
        outcome: me,
        got_ack: S,
        got_first_frame: h,
        ms: Date.now() - u,
        via: p == null ? undefined : p,
        tempo: m == null ? undefined : m,
        apc_detach: ue === true
      }), S) {
        let ce = t.alreadyInAlt || me === "disconnected" && t.holdScreenOnDisconnect;
        r.write(jlt + k.snapshot().map(jJ).reverse().join("") + WF + (Wt() === "windows" ? "\x1B[?9001l" : "") + "\x1B[0m\x1B7" + V8 + "\x1B8" + (MWe() ? AMn : "") + (ce ? "" : GF()));
      }
      if (!M) {
        PI(n, false);
      }
      if (n.removeListener("readable", Q), n.removeListener("end", Z), "removeListener" in r) {
        r.removeListener("resize", z);
      }
      clearTimeout(C);
      W.destroy();
      y({
        outcome: me,
        msg: Te,
        viaApc: ue
      });
    }
    function z() {
      if (b) {
        return;
      }
      if (C === undefined) {
        x = i;
        A = a;
      }
      i = "columns" in r ? r.columns || o : o;
      a = "rows" in r ? r.rows || s : s;
      clearTimeout(C);
      C = setTimeout(() => {
        if (C = undefined, b) {
          return;
        }
        if (i < x || a < A) {
          r.write(o0 + gv);
        }
        CT({
          proto: 1,
          op: "resize",
          short: e,
          cols: i,
          rows: a,
          attachId: l
        });
      }, 50);
    }
    let V = t.gateStdinUntilFirstFrame === true && "isTTY" in n && n.isTTY === true;
    function K(me) {
      if (!V || h) {
        W.write(me);
      }
    }
    function J(me) {
      if (b) {
        return;
      }
      let Te = typeof me === "string" ? Buffer.from(me, "utf8") : me;
      let ue = 0;
      for (let ce = 0; ce < Te.length; ce++) {
        let le = Te[ce];
        if (E) {
          if (E = false, ce > ue) {
            K(Te.subarray(ue, ce));
          }
          if (le === 100) {
            return j("detached");
          }
          K(Buffer.from([2, le]));
          ue = ce + 1;
          continue;
        }
        if (V && !h && (le === 27 && Te.length === 1 || iee(Te, ce, Jnf) || iee(Te, ce, Xnf))) {
          return j("detached");
        }
        if (le === 26 || iee(Te, ce, ssc) || iee(Te, ce, isc)) {
          if (ce > ue) {
            K(Te.subarray(ue, ce));
          }
          return j("detached");
        }
        if (O && le === 8) {
          if (ce > ue) {
            K(Te.subarray(ue, ce));
          }
          K(Ynf);
          ue = ce + 1;
          continue;
        }
        let pe = le === 2 ? 1 : iee(Te, ce, bur) ? bur.length : iee(Te, ce, Sur) ? Sur.length : 0;
        if (pe) {
          if (ce > ue) {
            K(Te.subarray(ue, ce));
          }
          ce += pe - 1;
          ue = ce + 1;
          E = true;
        }
      }
      if (ue < Te.length) {
        K(Te.subarray(ue));
      }
    }
    function Q() {
      let me;
      while ((me = n.read()) !== null) {
        J(me);
      }
    }
    function Z() {
      j("detached");
    }
    let ne = see;
    let oe = see;
    let ee = see;
    let re = see;
    function se(me) {
      if (!L) {
        return me;
      }
      let Te = ee.length > 0;
      let ue = Te ? Buffer.concat([ee, me]) : me;
      if (Te) {
        ee = see;
      }
      if (H) {
        let ke = ue.lastIndexOf(P);
        let Ie = ue.lastIndexOf(F);
        if (ke !== Ie) {
          U = ke > Ie;
        }
      }
      let ce = ue.indexOf(P);
      if (ce < 0) {
        let ke = Len(ue, P);
        if (ke === 0) {
          return ue;
        }
        ee = Buffer.from(ue.subarray(ue.length - ke));
        return ue.subarray(0, ue.length - ke);
      }
      let le = [];
      let pe = 0;
      let ve = ce;
      for (;;) {
        if (ve > pe) {
          le.push(ue.subarray(pe, ve));
        }
        if (pe = ve + P.length, ve = ue.indexOf(P, pe), ve < 0) {
          break;
        }
      }
      let _e = ue.subarray(pe);
      let xe = Len(_e, P);
      if (xe > 0) {
        ee = Buffer.from(_e.subarray(_e.length - xe));
      }
      if (_e.length > xe) {
        le.push(_e.subarray(0, _e.length - xe));
      }
      if (le.length === 0) {
        return see;
      }
      if (le.length === 1) {
        return le[0];
      }
      return Buffer.concat(le);
    }
    function ae(me) {
      let Te = re.length > 0;
      let ue = Te ? Buffer.concat([re, me]) : me;
      if (Te) {
        re = see;
      }
      let ce = ue.indexOf(Nen);
      if (ce < 0) {
        let _e = Len(ue, Nen);
        if (_e === 0) {
          return ue;
        }
        re = Buffer.from(ue.subarray(ue.length - _e));
        return ue.subarray(0, ue.length - _e);
      }
      let le = [];
      let pe = 0;
      let ve = ce;
      while (ve >= 0) {
        let _e = ve + Nen.length;
        if (_e >= ue.length) {
          if (ve > pe) {
            le.push(ue.subarray(pe, ve));
          }
          re = Buffer.from(ue.subarray(ve));
          pe = ue.length;
          break;
        }
        let xe = ue[_e];
        if (xe === 104 || xe === 108) {
          if (ve > pe) {
            le.push(ue.subarray(pe, ve));
          }
          pe = _e + 1;
        }
        ve = ue.indexOf(Nen, Math.max(pe, ve + 1));
      }
      if (pe < ue.length) {
        let _e = ue.subarray(pe);
        let xe = Len(_e, Nen);
        if (xe > 0) {
          re = Buffer.from(_e.subarray(_e.length - xe));
        }
        if (_e.length > xe) {
          le.push(_e.subarray(0, _e.length - xe));
        }
      }
      if (le.length === 0) {
        return see;
      }
      if (le.length === 1) {
        return le[0];
      }
      return Buffer.concat(le);
    }
    let de = t.alreadyInAlt && !t.holdingFrame;
    function be(me) {
      if (de) {
        de = false;
        r.write(o0 + gv);
      }
      r.write(me);
      k.feed(me.toString("latin1"), Te => {
        if (Te === 1004 && I) {
          r.write(I);
        }
      });
      g();
    }
    function fe(me) {
      if (b) {
        return;
      }
      let Te = oe.length > 0 ? Buffer.concat([oe, me]) : me;
      let ue = Te.indexOf(Zoc);
      if (ue >= 0) {
        let le = Te.subarray(0, ue);
        if (ue > 0) {
          let pe = ae(se(le));
          if (pe.length > 0) {
            be(pe);
          }
        }
        oe = see;
        ee = see;
        re = see;
        return j("detached", WHl(le), true);
      }
      let ce = Len(Te, Zoc);
      if (Te.length > ce) {
        let le = Te.subarray(0, Te.length - ce);
        let pe = ae(se(le));
        if (pe.length > 0) {
          be(pe);
        }
      }
      if (oe = ce > 0 ? Buffer.from(Te.subarray(Te.length - ce)) : see, H) {
        clearTimeout(N);
        N = setTimeout(() => {
          if (!b && U) {
            r.write(WF);
          }
        }, 100);
      }
    }
    W.on("data", me => {
      if (b) {
        return;
      }
      if (S) {
        fe(me);
        return;
      }
      ne = Buffer.concat([ne, me]);
      let Te = ne.indexOf(10);
      if (Te < 0) {
        return;
      }
      let ue = ne.subarray(0, Te).toString("utf8");
      let ce = ne.subarray(Te + 1);
      let le;
      try {
        le = qt(ue);
      } catch (_e) {
        return j("error", `bad ack: ${he(_e)}`);
      }
      if (!le.ok) {
        return j("error", `${le.code}: ${le.error}`);
      }
      if (S = true, W.setTimeout(0), d = Date.now() - u, p = le.op === "attach" ? le.via : undefined, m = le.op === "attach" ? le.tempo : undefined, f = le.op === "attach" ? le.state : undefined, process.env.TMUX && !esc) {
        esc = true;
        execFileNoThrow("tmux", ["set", "-as", "terminal-features", ",*:RGB"]);
      }
      let ve = ((le.op === "attach" ? le.decModes : undefined) ?? []).map(j2).join("");
      if (k.feed(ve), r.write(t.alreadyInAlt ? sG + mre() + ve : dPe() + ve + (L ? sG : "") + `
  \x1B[2mAttaching\u2026\x1B[0m
`), "ref" in n) {
        n.ref();
      }
      if (PI(n, true), "on" in r) {
        r.on("resize", z);
      }
      if (n.on("readable", Q), "resume" in n && "pause" in n) {
        n.resume();
        n.pause();
      }
      if (n.once("end", Z), Q(), ce.length) {
        fe(ce);
      }
    });
    W.on("error", me => j("error", B0(he(me))));
    W.once("close", () => {
      if (!b) {
        j(S ? "disconnected" : "error", "control socket closed");
      }
    });
    W.once("connect", () => {
      W.write(De({
        proto: 1,
        op: "attach",
        short: e,
        auth: c,
        cols: o,
        rows: s,
        attachId: l,
        caps: rrf(),
        ...(t.holdingFrame && {
          holdingFrame: true
        })
      }) + `
`);
    });
    return _;
  }
  function rrf() {
    return {
      terminal: Me.terminal,
      mux: process.env.TMUX ? "tmux" : process.env.ZELLIJ != null ? "zellij" : process.env.STY ? "screen" : null,
      ssh: Me.isSSH(),
      wheelFlood: $eo(),
      hyperlinks: Hk(),
      progressReporting: MWe(),
      wtSession: !!process.env.WT_SESSION,
      isVscodeTerm: process.env.TERM_PROGRAM === "vscode",
      browser: process.env.BROWSER ?? null,
      colorLevel: _$u.level,
      syncOutput: q2(),
      editor: process.env.VISUAL?.trim() || process.env.EDITOR?.trim() || null,
      systemTheme: HWi()
    };
  }
  var tsc;
  var nsc;
  var Ynf;
  var bur;
  var Sur;
  var ssc;
  var isc;
  var Jnf;
  var Xnf;
  var Znf;
  var erf;
  var Zoc;
  var Nen;
  var see;
  var esc = false;
  var A5o = __lazy(() => {
    uT();
    Yeo();
    pPe();
    uG();
    mT();
    c1();
    qJ();
    Tg();
    Ot();
    pr();
    dt();
    ji();
    GWe();
    Cs();
    aPe();
    NJ();
    Mfe();
    x5o();
    uP();
    pL();
    tsc = require("crypto");
    nsc = require("net");
    Ynf = Buffer.from([127]);
    bur = Buffer.from("\x1B[98;5u", "latin1");
    Sur = Buffer.from("\x1B[27;5;98~", "latin1");
    ssc = Buffer.from("\x1B[122;5u", "latin1");
    isc = Buffer.from("\x1B[27;5;122~", "latin1");
    Jnf = Buffer.from("\x1B[27u", "latin1");
    Xnf = Buffer.from("\x1B[27;1u", "latin1");
    Znf = Buffer.from("\x1B[99;5u", "latin1");
    erf = Buffer.from("\x1B[27;5;99~", "latin1");
    Zoc = Buffer.from("\x1B_cc-daemon-detach\x1B\\", "ascii");
    Nen = Buffer.from("\x1B[?9001", "ascii");
    see = Buffer.alloc(0);
  });
  function orf() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_bg_low_mem_mb", 1024) * 1024 * 1024;
  }
  function iJe() {
    let e = orf();
    if (e <= 0) {
      return false;
    }
    if (Wt() !== "macos") {
      return csc.freemem() < e;
    }
    let t = arf();
    return t !== undefined && t >= 2;
  }
  function arf() {
    if (Fen === undefined) {
      try {
        Fen = require("bun:ffi").dlopen("/usr/lib/libSystem.B.dylib", {
          sysctlbyname: {
            args: ["ptr", "ptr", "ptr", "ptr", "usize"],
            returns: "i32"
          }
        }).symbols.sysctlbyname;
      } catch (n) {
        logForDebugging(`bg low-mem: dlopen libSystem failed: ${n instanceof Error ? n.message : String(n)}`, {
          level: "warn"
        });
        Fen = null;
      }
    }
    if (Fen == null) {
      return;
    }
    let e = new Int32Array(1);
    let t = new BigUint64Array([4n]);
    return Fen(irf, e, t, null, 0n) === 0 ? e[0] : undefined;
  }
  function usc() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_bg_retire_grace_bridged_min", 480) * 60000;
  }
  function Eur() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_bg_attach_upgrade", true);
  }
  var csc;
  var irf;
  var Fen;
  var vur = __lazy(() => {
    $n();
    je();
    Cs();
    csc = require("os");
    irf = Buffer.from("kern.memorystatus_vm_pressure_level\x00");
  });
  function lrf(e) {
    let t = Wt();
    if (t === "windows") {
      return null;
    }
    let n = e._handle;
    let r = typeof n?.fd === "number" ? n.fd : -1;
    if (r < 0) {
      return null;
    }
    try {
      return t === "macos" ? urf(r) : crf(r);
    } catch (o) {
      logForDebugging(`[daemon] peer uid lookup failed: ${o instanceof Error ? o.message : String(o)}`, {
        level: "warn"
      });
      return null;
    }
  }
  function dsc(e, t = lrf) {
    let n = process.getuid?.();
    if (n == null) {
      return null;
    }
    let r = t(e);
    if (r == null) {
      return null;
    }
    if (r === n) {
      return null;
    }
    let o = `permission denied: connecting uid ${r} != daemon uid ${n} (retry without sudo, or as the daemon owner)`;
    logForDebugging(`[daemon] rejecting control connection: ${o}`, {
      level: "error"
    });
    return o;
  }
  function crf(e) {
    if (wur === undefined) {
      wur = psc("libc.so.6", {
        getsockopt: {
          args: ["int", "int", "int", "ptr", "ptr"],
          returns: "int"
        }
      })?.getsockopt ?? null;
    }
    if (wur == null) {
      return null;
    }
    let t = new Uint8Array(12);
    let n = new Uint32Array([12]);
    if (wur(e, 1, 17, t, n) !== 0) {
      return null;
    }
    return new DataView(t.buffer).getUint32(4, true);
  }
  function urf(e) {
    if (Cur === undefined) {
      Cur = psc("/usr/lib/libSystem.B.dylib", {
        getpeereid: {
          args: ["int", "ptr", "ptr"],
          returns: "int"
        }
      })?.getpeereid ?? null;
    }
    if (Cur == null) {
      return null;
    }
    let t = new Uint32Array(1);
    let n = new Uint32Array(1);
    return Cur(e, t, n) === 0 ? Number(t[0]) : null;
  }
  function psc(e, t) {
    try {
      return require("bun:ffi").dlopen(e, t).symbols;
    } catch (n) {
      logForDebugging(`[daemon] dlopen(${e}) failed: ${n instanceof Error ? n.message : String(n)}`, {
        level: "warn"
      });
      return null;
    }
  }
  var wur;
  var Cur;
  var msc = __lazy(() => {
    je();
    Cs();
  });
  function mrf() {
    let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_bg_attach_stall_ms", 5000);
    return e === 0 ? 0 : Math.max(2000, e);
  }
  function frf(e, t, n, r, o) {
    let s = e.dispatch;
    if (e.getPhase().kind !== "running" || t.destroyed || r()) {
      return;
    }
    o.add(s.short);
    e.kill("SIGTERM");
    (async () => {
      let i = Date.now() + 6000;
      while (Date.now() < i && !e.record.outcome) {
        await sleep(100);
      }
      if (!o.vZc(s.short)) {
        return;
      }
      let a = await Zi(dc(s.short)).catch(() => null);
      let l = a?.resumeSessionId ?? s.sessionId;
      let c = a?.cwd ?? s.cwd;
      let u = await mle(l, c, a?.linkScanPath);
      let d = u.hasMessages;
      if (!d) {
        await ije(u.path);
      }
      if (!o.vZc(s.short)) {
        return;
      }
      await n({
        ...s,
        cwd: c,
        source: "respawn",
        reattachEnv: undefined,
        attachStallRespawns: (s.attachStallRespawns ?? 0) + 1,
        launch: d ? {
          mode: "resume",
          sessionId: l,
          transcriptPath: u.path,
          fork: false,
          flagArgs: a?.respawnFlags ?? s.respawnFlags
        } : l !== s.sessionId ? {
          mode: "prompt",
          args: ["--session-id", l, ...(a?.respawnFlags ?? s.respawnFlags)]
        } : s.launch
      });
    })().catch(i => Oe(i)).finally(() => o.delete(s.short));
  }
  async function ysc(e, t, n, r = () => 0, o = () => true, s = () => false) {
    let i = T5();
    await Uir();
    let a = await FWl();
    await P5o.unlink(i).catch(() => {});
    let l = new Set();
    let c = new Set();
    let u = new Map();
    let d = Si();
    let p = (_, b) => {
      if (u.vZc(_)) {
        return;
      }
      u.set(_, b);
      logEvent("tengu_daemon_lease", {
        op: "open",
        label: b?.label ?? null
      });
      _.once("close", () => {
        u.delete(_);
        logEvent("tengu_daemon_lease", {
          op: "close",
          label: b?.label ?? null
        });
        d.emit();
      });
      d.emit();
    };
    let m = () => {
      let _ = [];
      for (let b of u.values()) {
        if (b) {
          _.push(b);
        }
      }
      return _;
    };
    let f = false;
    let h = hsc.createServer(_ => {
      if (f) {
        _.destroy();
        return;
      }
      _.on("error", () => _.destroy());
      _.setTimeout(30000, () => _.destroy());
      l.add(_);
      _.once("close", () => l.delete(_));
      let b = dsc(_);
      if (b) {
        logEvent("tengu_daemon_peer_uid_reject", {});
        _.once("data", () => vp(_, {
          ok: false,
          code: "EPEERUID",
          error: b
        }));
        return;
      }
      let S = Buffer.alloc(0);
      let E = C => {
        S = Buffer.concat([S, C]);
        let x = S.indexOf(10);
        if (x < 0) {
          if (S.length > 1048576) {
            _.off("data", E);
            vp(_, {
              ok: false,
              code: "ETOOLARGE",
              error: `request exceeds ${1048576 >> 20}MB \u2014 shorten the prompt or send in parts`
            });
          }
          return;
        }
        _.off("data", E);
        _.setTimeout(0);
        let A = S.subarray(0, x).toString("utf8");
        let k = S.subarray(x + 1);
        hrf(e, t, n, r, o, s, p, m, c, a, _, A, k).catch(I => {
          vp(_, {
            ok: false,
            error: he(I),
            code: "EUNKNOWN"
          });
        });
      };
      _.on("data", E);
    });
    let g = false;
    h.on("error", _ => {
      if (g) {
        logForDebugging(`bg control server bind: ${B0(he(_))}`, {
          level: "warn"
        });
        return;
      }
      Oe(_);
    });
    let y = Date.now() + 1e4;
    for (;;) {
      try {
        await new Promise((_, b) => {
          let S = E => {
            g = false;
            b(E);
          };
          g = true;
          h.once("error", S);
          h.listen(i, () => {
            g = false;
            h.removeListener("error", S);
            _();
          });
        });
        break;
      } catch (_) {
        if (en(_) !== "EADDRINUSE" || Date.now() >= y) {
          throw _;
        }
        h.removeAllListeners("listening");
        await sleep(100);
      }
    }
    return {
      close: _ => new Promise(b => {
        for (let S of l) {
          S.destroy();
        }
        if (_?.skipUnlink) {
          f = true;
          h.unref();
          return void b();
        }
        h.close(() => {
          if (!_?.skipUnlink) {
            P5o.unlink(i).catch(() => {});
          }
          b();
        });
      }),
      leaseCount: () => u.size,
      onLeaseChange: d
    };
  }
  function vp(e, t) {
    if (e.destroyed) {
      return;
    }
    e.end(De(t) + `
`);
  }
  function Uen(e, t) {
    if (e.destroyed) {
      return;
    }
    if (e.writableLength > 1048576) {
      e.destroy();
      return;
    }
    e.write(De(t) + `
`);
  }
  function Ben(e) {
    return !e.record.outcome && !e.isRetiring && !e.isKilling;
  }
  async function fsc(e, t, n, r, o, s, i) {
    let a = Date.now() + Math.min(s, 30000);
    let l = false;
    let c = false;
    let u;
    let d;
    i?.then(p => {
      d = p;
    }, p => {
      Oe(p);
      d = "dropped";
    });
    while (Date.now() < a) {
      if (t.destroyed) {
        return;
      }
      let p = d === "dup-live" || d === "dropped" || d === "closed";
      let m = e.get(r);
      if (m) {
        if (o && m.record.nonce !== o) {
          if (c = true, u = Ben(m) ? m : undefined, p) {
            break;
          }
          if (!u && !l) {
            l = true;
            a += Math.min(s, 30000);
          }
          await sleep(25);
          continue;
        }
        return vp(t, {
          ok: true,
          op: n,
          short: r,
          pid: m.record.pid,
          messagingSock: m.record.messagingSock ?? "",
          via: m.via
        });
      }
      if (u = undefined, p) {
        break;
      }
      await sleep(25);
    }
    if (c) {
      if (u && e.get(r) === u && Ben(u)) {
        return vp(t, {
          ok: true,
          op: n,
          short: r,
          pid: u.record.pid,
          messagingSock: u.record.messagingSock ?? "",
          via: u.via
        });
      }
      return vp(t, {
        ok: false,
        error: "a previous dispatch with this id is still being cleaned up \u2014 retry in a moment",
        code: "ESTALE"
      });
    }
    return vp(t, {
      ok: false,
      error: `${bgSupervisorNoun()} didn't acknowledge in time \u2014 retry`,
      code: "ETIMEOUT"
    });
  }
  async function hrf(e, t, n, r, o, s, i, a, l, c, u, d, p) {
    let m;
    try {
      m = qt(d);
    } catch {
      return vp(u, {
        ok: false,
        error: "bad json",
        code: "EUNKNOWN"
      });
    }
    if (m === null || typeof m !== "object") {
      return vp(u, {
        ok: false,
        error: "bad json",
        code: "EUNKNOWN"
      });
    }
    let f = m.op;
    if (f === "ping") {
      return vp(u, {
        ok: true,
        op: "ping",
        version: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION,
        proto: 1
      });
    }
    if (f === "nudge") {
      return vp(u, {
        ok: true,
        op: "nudge",
        restarting: await n(),
        version: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION
      });
    }
    if (f === "yield") {
      return vp(u, {
        ok: true,
        op: "yield",
        yielding: s()
      });
    }
    if (f === "lease") {
      i(u, grf(m.client));
      u.write(De({
        ok: true,
        op: "lease"
      }) + `
`);
      return;
    }
    if (f === "leases") {
      return vp(u, {
        ok: true,
        op: "leases",
        clients: a()
      });
    }
    if (f === "shutdown") {
      let _ = m.reapWorkers !== false;
      let b = r(_);
      return vp(u, {
        ok: true,
        op: "shutdown",
        reaped: b
      });
    }
    if (!o()) {
      return vp(u, {
        ok: false,
        error: `${bgSupervisorNoun()} starting (adoption in progress)`,
        code: "ESTARTING"
      });
    }
    let h = m.proto;
    if (typeof h !== "number" || !Number.isInteger(h) || h < 1 || h > 1) {
      logEvent("tengu_bg_proto_mismatch", {
        client_proto: typeof h === "number" ? h : -1,
        server_proto: 1
      });
      return vp(u, {
        ok: false,
        error: `proto mismatch (server=${1}, client=${h}) \u2014 ${bgSupervisorNoun()} and CLI versions differ; restart claude`,
        code: "EPROTO",
        serverProto: 1,
        serverVersion: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION
      });
    }
    let g = VHl().safeParse(m);
    if (!g.success) {
      return vp(u, {
        ok: false,
        error: `malformed request: ${g.error.issues[0]?.message ?? "invalid"}`,
        code: "EUNKNOWN"
      });
    }
    let y = g.data;
    switch (y.op) {
      case "ping":
      case "nudge":
      case "yield":
      case "lease":
      case "leases":
      case "shutdown":
        return;
      case "list":
        return vp(u, {
          ok: true,
          op: "list",
          jobs: Array.from(e.values()).map(_ => _.isKilling || _.isRetiring ? {
            ..._.record,
            dying: true
          } : _.record)
        });
      case "has":
        {
          let _ = e.get(y.short);
          let b = l.vZc(y.short);
          return vp(u, {
            ok: true,
            op: "has",
            alive: _ !== undefined && Ben(_) || b,
            present: _ !== undefined || b,
            ready: _ !== undefined && !_.isBooting
          });
        }
      case "await-ack":
        return fsc(e, u, "await-ack", y.short, y.nonce, y.timeoutMs);
      case "dispatch":
        if (!Vse(y.auth, c)) {
          return vp(u, {
            ok: false,
            error: "dispatch rejected: this client didn't present the daemon control key",
            code: "EAUTH"
          });
        }
        if (await sleep(0), u.readableEnded || u.destroyed) {
          logEvent("tengu_bg_dispatch_stale_drop", {});
          return;
        }
        return fsc(e, u, "dispatch", y.d.short, y.d.nonce, y.timeoutMs, t(y.d));
      case "reply":
        {
          if (!Vse(y.auth, c)) {
            return vp(u, {
              ok: false,
              error: y.auth === undefined ? "reply rejected: this window didn't present the daemon control key \u2014 it is likely running a Claude Code older than the daemon (left open across an update?); restart this window and retry, or stop driving the control socket directly" : "reply rejected: the presented daemon control key doesn't match \u2014 retry, and restart the Claude Code daemon if this persists",
              code: "EAUTH"
            });
          }
          let _ = e.get(y.short);
          if (l.vZc(y.short) && (!_ || !Ben(_))) {
            return vp(u, {
              ok: false,
              error: "worker stalled \u2014 restarting it; retry reply",
              code: "ERESPAWNING"
            });
          }
          if (!_ || _.isRetiring || _.isKilling || _.record.outcome) {
            return vp(u, {
              ok: false,
              error: "job not found \u2014 it may have already exited",
              code: "ENOJOB"
            });
          }
          if (!(await _.reply(y.text))) {
            return vp(u, {
              ok: false,
              error: "job isn't accepting replies \u2014 it may be in a non-interactive state",
              code: "ENOREPLY"
            });
          }
          return vp(u, {
            ok: true,
            op: "reply"
          });
        }
      case "kill":
        {
          l.delete(y.short);
          let _ = e.get(y.short);
          if (!_) {
            return vp(u, {
              ok: false,
              error: "job not found \u2014 it may have already exited",
              code: "ENOJOB"
            });
          }
          if (_.dispatch.launch.mode === "exec" && _.record.outcome) {
            e.delete(y.short);
            return vp(u, {
              ok: true,
              op: "kill"
            });
          }
          _.kill(y.signal ?? "SIGTERM", y.handoff ? "handoff" : "killed");
          return vp(u, {
            ok: true,
            op: "kill"
          });
        }
      case "respawn-stale":
        {
          let _ = e.get(y.short);
          if (!_) {
            return vp(u, {
              ok: false,
              error: "job not found \u2014 it may have already exited",
              code: "ENOJOB"
            });
          }
          let b = await _.respawnIfIdleStale();
          return vp(u, {
            ok: true,
            op: "respawn-stale",
            ...b
          });
        }
      case "resize":
        {
          let _ = e.get(y.short);
          if (!_) {
            return vp(u, {
              ok: false,
              error: "job not found \u2014 it may have already exited",
              code: "ENOJOB"
            });
          }
          if (y.attachId) {
            let b = _.attachers.get(y.attachId);
            if (!b) {
              return vp(u, {
                ok: true,
                op: "resize"
              });
            }
            if (b.cols = y.cols, b.rows = y.rows, b.repaint) {
              b.repaint();
              return vp(u, {
                ok: true,
                op: "resize"
              });
            }
          }
          _.resize(y.cols, y.rows);
          return vp(u, {
            ok: true,
            op: "resize"
          });
        }
      case "attach":
        {
          if (y.auth === undefined) {
            logForDebugging("[bg-attach] legacy client (no control key) \u2014 allowed via peerUid", {
              level: "warn"
            });
          } else if (!Vse(y.auth, c)) {
            return vp(u, {
              ok: false,
              error: "attach rejected: the presented daemon control key doesn't match \u2014 retry, and restart the Claude Code daemon if this persists",
              code: "EAUTH"
            });
          }
          let _ = e.get(y.short);
          if (l.vZc(y.short) && (!_ || !Ben(_))) {
            return vp(u, {
              ok: false,
              error: "worker stalled \u2014 restarting it; retry attach",
              code: "ERESPAWNING"
            });
          }
          if (!_ || _.isKilling || _.record.outcome && _.dispatch.launch.mode !== "exec") {
            return vp(u, {
              ok: false,
              error: "job not found \u2014 it may have already exited",
              code: "ENOJOB"
            });
          }
          if (_.isUnverified) {
            return vp(u, {
              ok: false,
              error: "worker is live but supervisor could not verify its identity \u2014 try restarting the supervisor to re-adopt",
              code: "EUNVERIFIED"
            });
          }
          if (_.isRetiring) {
            return vp(u, {
              ok: false,
              error: "job is retiring; retry attach",
              code: "ERESPAWNING"
            });
          }
          if (_.record.legacy) {
            let Q = _.dispatch;
            let Z = await Zi(dc(Q.short)).catch(() => null);
            let ne = Z?.resumeSessionId ?? Q.sessionId;
            let oe = Z?.cwd ?? Q.cwd;
            let ee = await mle(ne, oe, Z?.linkScanPath);
            let re = ee.hasMessages;
            if (!re) {
              await ije(ee.path);
            }
            if (e.get(y.short) !== _ || u.destroyed) {
              return vp(u, {
                ok: false,
                error: "supervisor restarting",
                code: "ERESPAWNING"
              });
            }
            if (!_.isKilling) {
              logEvent("tengu_bg_attach_legacy_autorespawn", {});
              _.kill("SIGTERM");
              t({
                ...Q,
                cwd: oe,
                source: "respawn",
                launch: re ? {
                  mode: "resume",
                  sessionId: ne,
                  transcriptPath: ee.path,
                  fork: false,
                  flagArgs: Z?.respawnFlags ?? Q.respawnFlags
                } : ne !== Q.sessionId ? {
                  mode: "prompt",
                  args: ["--session-id", ne, ...(Z?.respawnFlags ?? Q.respawnFlags)]
                } : Q.launch
              }).catch(se => Oe(se));
            }
            return vp(u, {
              ok: false,
              error: "legacy job respawning with worker-owned PTY; retry attach",
              code: "ERESPAWNING"
            });
          }
          if (_.record.cliVersion && _.record.cliVersion !== {
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.VERSION && Eur()) {
            let Q = await _.respawnIfIdleStale(undefined, "attach");
            if (Q.respawned || Q.reason === "in-progress") {
              return vp(u, {
                ok: false,
                error: "job is restarting on the updated Claude Code; retry attach",
                code: "ERESPAWNING"
              });
            }
            if (e.get(y.short) !== _ || u.destroyed) {
              return vp(u, {
                ok: false,
                error: "supervisor restarting",
                code: "ERESPAWNING"
              });
            }
          }
          i(u, null);
          u.write(De({
            ok: true,
            op: "attach",
            decModes: _.decModeSnapshot(),
            via: _.via,
            tempo: _.record.tempo,
            state: _.record.state
          }) + `
`);
          logEvent("tengu_bg_attach", {
            tempo: _.record.tempo,
            state: _.record.state,
            via: _.via,
            attachers: _.attachers.size
          });
          let b = gv + QIe;
          let S = 6;
          let E = [];
          let C = 0;
          let x = "";
          let A = () => {};
          let k;
          let I = 0;
          let O = false;
          let M = mrf();
          let L = M === 0 ? 0 : Math.max(1, Math.ceil((M - 500) / 1000));
          let P = Q => o0 + gv + `
  \x1B[2m${Q}\x1B[0m
`;
          let F = Q => {
            if (E === null) {
              return;
            }
            let Z = E;
            if (E = null, clearTimeout(H), Q && !u.destroyed) {
              for (let ne of Z) {
                u.write(ne);
              }
            }
          };
          let H = setTimeout(() => {
            let Q = E !== null && C === 0;
            let Z = Q && y.holdingFrame === true;
            if (!Z) {
              F(true);
            }
            if (Q && !u.destroyed) {
              if (!Z) {
                let oe = _.record.state;
                let ee = oe === "starting" || oe === "resuming" || oe === "adopted" || oe === "crashed" ? "Session is starting \u2014 it will appear once ready. Ctrl+Z to detach" : "Waiting for session to redraw\u2026 Ctrl+Z to detach";
                u.write(P(ee));
              }
              let ne = Date.now();
              k = setInterval(() => {
                let oe = Date.now();
                let ee = oe - ne;
                if (ne = oe, ee > 1000 * 3) {
                  I = 0;
                }
                if (I++, L > 0 && I >= L && !_.isKilling && !_.isRetiring && _.dispatch.launch.mode !== "exec") {
                  clearInterval(k);
                  k = undefined;
                  A();
                  let se = _.dispatch.attachStallRespawns ?? 0;
                  let ae = {
                    state: _.record.state,
                    via: _.via,
                    attempt: se
                  };
                  if (se >= 2) {
                    if (logEvent("tengu_bg_attach_stall_gave_up", ae), u.write(P("Session keeps stalling at startup.") + Tfe(`ESTALLED: Session ${y.short} keeps stalling at startup \u2014 check ${dc(y.short)} for logs.`)), !_.isKilling) {
                      _.kill("SIGKILL", "failed", "session keeps stalling at startup");
                    }
                    return;
                  }
                  if (logEvent("tengu_bg_attach_stall_respawn", ae), u.write(P("Session not responding \u2014 restarting it\u2026")), frf(_, u, t, () => O, l), !u.destroyed) {
                    u.write(Tfe("ERESPAWNING: worker stalled, restarting"));
                  }
                  return;
                }
                let re = _.attachers.get(j);
                A();
                A = _.resizeForRepaint(re?.cols ?? y.cols, re?.rows ?? y.rows);
              }, 1000);
              k.unref();
            }
          }, 500);
          let U = () => {
            if (k) {
              clearInterval(k);
              k = undefined;
            }
          };
          let N = _.onStream.subscribe(Q => {
            if (u.destroyed) {
              return;
            }
            if (O = true, E !== null) {
              let Z = x + Q;
              if (Z.includes(o0) || Z.includes(b)) {
                U();
                let ne = Q.includes(o0) || Q.includes(b) ? Q : Z;
                if (A(), F(false), u.writableLength <= 1048576) {
                  u.write(_.decModeSnapshot().map(j2).join("") + ne);
                } else {
                  u.destroy();
                }
                return;
              }
              if (E.push(Q), C += Q.length, x = Z.slice(-S), C > 65536) {
                F(true);
              }
              return;
            }
            if (U(), u.writableLength > 1048576) {
              u.destroy();
              return;
            }
            u.write(Q);
          });
          let W = _.onRepaintDone.subscribe(() => {
            A();
            F(true);
          });
          if (Wt() === "windows") {
            for (let Q of _.attachers.values()) {
              Q.kick();
            }
          }
          let j = y.attachId ?? u;
          _.attachers.set(j, {
            cols: y.cols,
            rows: y.rows,
            caps: y.caps,
            deliver: Q => {
              if (!u.destroyed) {
                u.write(Q);
              }
            },
            kick: () => {
              if (logEvent("tengu_bg_attach_kick", {}), k) {
                clearInterval(k);
                k = undefined;
              }
              if (clearTimeout(H), A(), N(), W(), u.removeAllListeners("data"), !u.destroyed) {
                u.write(Tfe("EKICKED: Session opened in another window"));
                u.end();
              }
              _.attachers.delete(j);
            }
          });
          _.noteActivity();
          _.seedFocus(true);
          _.sendAttacherCaps(y.caps ?? null);
          let z;
          if (_.dispatch.launch.mode === "exec") {
            u.write(o0 + gv);
            for (let Q of _.ringSnapshot()) {
              u.write(Q);
            }
            if (F(false), z = () => {
              let Q = _.attachers.get(j);
              if (u.destroyed || !Q) {
                return;
              }
              let ne = `\r
\x1B[2m\u2014 ${_.record.outcome === "done" ? "done" : _.record.outcome === "killed" ? "stopped" : "failed"} \xB7 Ctrl+Z to return \u2014\x1B[0m\r
`;
              u.write(ne);
              Q.repaint = () => {
                if (u.destroyed) {
                  return;
                }
                u.write(o0 + gv);
                for (let oe of _.ringSnapshot()) {
                  u.write(oe);
                }
                u.write(ne);
              };
            }, _.record.outcome) {
              z();
              u.once("close", () => {
                clearTimeout(H);
                N();
                W();
                _.attachers.delete(j);
              });
              return;
            }
          }
          A = _.resizeForRepaint(y.cols, y.rows);
          let V = _.onSettle.subscribe(() => {
            if (z && _.record.outcome !== "killed") {
              return z();
            }
            u.end();
          });
          let K = new gsc.StringDecoder("utf8");
          let J = Q => {
            let Z = K.write(Q);
            if (Z.length > 0 && !_rf(Z)) {
              _.lastInputAttacher = j;
            }
            _.write(Z);
          };
          if (p.length) {
            J(p);
          }
          u.on("data", J);
          u.once("close", () => {
            if (k) {
              clearInterval(k);
            }
            if (A(), F(false), N(), V(), W(), !_.attachers.delete(j)) {
              return;
            }
            let Q = K.end();
            if (Q) {
              _.write(Q);
            }
            if (_.attachers.size > 0) {
              let Z = [..._.attachers.values()].at(-1);
              _.resizeForRepaint(Z.cols, Z.rows);
              _.sendAttacherCaps(Z.caps ? {
                ...Z.caps,
                systemTheme: undefined
              } : null);
            } else {
              _.seedFocus(false);
              _.sendAttacherCaps(null);
            }
          });
          return;
        }
      case "ensure-spare":
        return vp(u, {
          ok: true,
          op: "ensure-spare"
        });
      case "permission-response":
        if (!Vse(y.auth, c)) {
          return vp(u, {
            ok: false,
            error: "permission-response rejected: this client didn't present the daemon control key",
            code: "EAUTH"
          });
        }
        return vp(u, {
          ok: true,
          op: "permission-response"
        });
      case "subscribe":
        {
          let _ = e.get(y.short);
          if (!_) {
            return vp(u, {
              ok: false,
              error: "job not found \u2014 it may have already exited",
              code: "ENOJOB"
            });
          }
          if (i(u, null), Uen(u, {
            type: "snapshot",
            record: _.record,
            streamTail: _.tail(y.tail ?? 200)
          }), _.record.outcome) {
            Uen(u, {
              type: "settled",
              outcome: _.record.outcome
            });
            u.end();
            return;
          }
          let b = [_.onStream.subscribe(S => Uen(u, {
            type: "stream",
            line: S
          })), _.onState.subscribe(S => Uen(u, {
            type: "state",
            patch: S
          })), _.onSettle.subscribe(S => {
            Uen(u, {
              type: "settled",
              outcome: S
            });
            u.end();
          })];
          u.on("close", () => {
            for (let S of b) {
              S();
            }
          });
          return;
        }
      default:
        return vp(u, {
          ok: false,
          error: `unknown op: ${y.op}`,
          code: "EUNKNOWN"
        });
    }
  }
  function grf(e) {
    if (e === null || typeof e !== "object") {
      return null;
    }
    let t = e;
    if (typeof t.label === "string" && typeof t.cwd === "string" && typeof t.pid === "number") {
      return {
        label: t.label,
        cwd: t.cwd,
        pid: t.pid
      };
    }
    return null;
  }
  function _rf(e) {
    if (!e.includes("\x1B")) {
      return false;
    }
    return e.replace(yrf, "").length === 0;
  }
  var P5o;
  var hsc;
  var gsc;
  var yrf;
  var D5o = __lazy(() => {
    uT();
    c1();
    qJ();
    zf();
    $n();
    Ot();
    je();
    dt();
    Rn();
    Cs();
    ZS();
    ph();
    vur();
    uP();
    msc();
    pL();
    BEt();
    P5o = require("fs/promises");
    hsc = require("net");
    gsc = require("string_decoder");
    yrf = /\x1b\[(?:<\d+;\d+;\d+[Mm]|M[\s\S]{3}|I|O|\??\d+;\d+(?:;\d+)*R|[?>]\d+(?:;\d+)*c|\?\d+(?:;\d+)*\$y|\?997;[12]n|\?\d+u)|\x1bP[^\x1b]*\x1b\\|\x1b\][^\x07\x1b]*(?:\x07|\x1b\\)/g;
  });
  async function xur(e) {
    let {
      cmd: t,
      prefixArgs: n
    } = eH();
    let r = [t, ...n, ...e];
    let o = Crf();
    if (Wt() === "windows") {
      let c = await Srf(r, o);
      if (c.ok) {
        return {
          err: null
        };
      }
      logForDebugging(`daemon: WMI spawn failed (${c.reason}); falling back to direct spawn \u2014 daemon will not survive SSH/terminal close`, {
        level: "warn"
      });
      logEvent("tengu_bg_daemon_wmi_fallback", {
        timeout: c.reason === "timeout",
        enoent: c.reason === "enoent",
        rc: c.rc
      });
    }
    let s = Wt() === "macos" ? await brf() : [];
    let i = await _Ct.mkdtemp(L5o.join(bsc.tmpdir(), "cc-daemon-")).catch(() => null);
    let a = i ? L5o.join(i, "stderr.log") : undefined;
    let l = a ? await _Ct.open(a, "w").catch(() => null) : null;
    try {
      let c = await M5o(await N5o(s, r), o, l?.fd);
      let u = en(c);
      if (u === "ENOENT" || u === "EACCES") {
        let d = eH({
          pinToCurrentBinary: true
        });
        if (d.cmd !== t) {
          logEvent("tengu_bg_daemon_spawn_execpath_fallback", {
            errno_enoent: u === "ENOENT",
            errno_eacces: u === "EACCES"
          });
          let p = await M5o(await N5o(s, [d.cmd, ...d.prefixArgs, ...e]), o, l?.fd);
          if (en(p) !== "ENOENT") {
            return {
              err: p,
              stderrPath: a
            };
          }
          let m = await VJn();
          if (logEvent("tengu_bg_daemon_spawn_versions_fallback", {
            found: m !== null
          }), m !== null && m !== d.cmd) {
            return {
              err: await M5o(await N5o(s, [m, ...e]), o, l?.fd),
              stderrPath: a
            };
          }
          return {
            err: p,
            stderrPath: a
          };
        }
      }
      return {
        err: c,
        stderrPath: a
      };
    } finally {
      await l?.close().catch(() => {});
    }
  }
  async function M5o(e, t, n) {
    let r = null;
    try {
      let o = Rur.spawn(e[0], e.slice(1), {
        detached: true,
        stdio: ["ignore", "ignore", n ?? "ignore"],
        windowsHide: true,
        env: t
      });
      o.once("error", s => {
        r = s;
      });
      o.unref();
    } catch (o) {
      r = o;
    }
    await new Promise(o => setImmediate(o));
    return r;
  }
  async function brf() {
    let e = process.getuid?.();
    if (e === undefined) {
      return [];
    }
    let t = await new Promise(n => {
      let r = false;
      let o = a => {
        if (r) {
          return;
        }
        r = true;
        clearTimeout(i);
        n(a);
      };
      let s = Rur.spawn("/bin/launchctl", ["print", `gui/${e}`], {
        stdio: "ignore",
        windowsHide: true
      });
      s.once("error", () => o(false));
      s.once("exit", a => o(a === 0));
      let i = setTimeout((a, l) => {
        l.kill();
        a(false);
      }, 5000, o, s);
      i.unref();
    });
    logEvent("tengu_bg_daemon_macos_aqua_wrap", {
      has_gui: t
    });
    return t ? ["/bin/launchctl", "asuser", String(e)] : [];
  }
  async function N5o(e, t) {
    if (e.length === 0) {
      return t;
    }
    try {
      await _Ct.access(t[0], _sc.constants.X_OK);
    } catch {
      return t;
    }
    return [...e, ...t];
  }
  function Srf(e, t) {
    let n;
    try {
      n = Trf(Erf(e));
    } catch (s) {
      return Promise.resolve({
        ok: false,
        reason: he(s)
      });
    }
    let r = Buffer.from(n, "utf16le").toString("base64");
    let o = process.env.SYSTEMROOT || "C:\\Windows";
    return new Promise(s => {
      let i = false;
      let a = u => {
        if (i) {
          return;
        }
        i = true;
        clearTimeout(c);
        s(u);
      };
      let l = Rur.spawn(`${o}\\System32\\WindowsPowerShell\\v1.0\\powershell.exe`, ["-NoProfile", "-NonInteractive", "-EncodedCommand", r], {
        stdio: "ignore",
        windowsHide: true,
        env: t
      });
      l.once("error", u => a({
        ok: false,
        reason: en(u) === "ENOENT" ? "enoent" : he(u)
      }));
      l.once("exit", u => {
        if (u === 0) {
          a({
            ok: true
          });
        } else {
          a({
            ok: false,
            reason: `Win32_Process.Create rc=${u}`,
            rc: u ?? undefined
          });
        }
      });
      let c = setTimeout((u, d) => {
        d.kill();
        u({
          ok: false,
          reason: "timeout"
        });
      }, 5000, a, l);
      c.unref();
    });
  }
  function Trf(e) {
    return ['$ErrorActionPreference = "Stop"', '$e = [string[]](Get-ChildItem Env: | ForEach-Object { "$($_.Name)=$($_.Value)" })', "$s = New-CimInstance -ClassName Win32_ProcessStartup -ClientOnly -Property @{ EnvironmentVariables = $e; ShowWindow = [uint16]0; CreateFlags = [uint32]8 }", `$r = Invoke-CimMethod -ClassName Win32_Process -MethodName Create -Arguments @{ CommandLine = ${wrf(e)}; CurrentDirectory = $env:USERPROFILE; ProcessStartupInformation = $s }`, "exit $r.ReturnValue"].join(`
`);
  }
  function Erf(e) {
    return e.map(vrf).join(" ");
  }
  function vrf(e) {
    if (e.length > 0 && !/[\s"]/.test(e)) {
      return e;
    }
    let t = '"';
    let n = 0;
    while (n < e.length) {
      let r = 0;
      while (e[n] === "\\") {
        r++;
        n++;
      }
      if (n === e.length) {
        t += "\\".repeat(r * 2);
      } else if (e[n] === '"') {
        t += "\\".repeat(r * 2 + 1) + '"';
        n++;
      } else {
        t += "\\".repeat(r) + e[n];
        n++;
      }
    }
    return t + '"';
  }
  function wrf(e) {
    if (/[\u2018\u2019\u201A\u201B]/.test(e)) {
      throw Error("unsupported Unicode single-quote in command line");
    }
    return `'${e.replaceAll("'", "''")}'`;
  }
  function Crf() {
    let e = {
      ...process.env,
      INVOCATION_ID: ""
    };
    delete e.CLAUDECODE;
    delete e.CLAUDE_CODE_SESSION_ID;
    delete e.CLAUDE_CODE_CHILD_SESSION;
    let t = e.CLAUDE_CODE_HOST_AUTH_ENV_VAR;
    if (st(e.CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST)) {
      for (let n of [...uY, ..._le, ...$te]) {
        delete e[n];
      }
      if (delete e.ANTHROPIC_CUSTOM_HEADERS, t) {
        delete e[t];
      }
      delete e.CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST;
      delete e.CLAUDE_CODE_HOST_AUTH_ENV_VAR;
    }
    if (Wt() !== "macos" && process.env.CLAUDE_CODE_OAUTH_TOKEN) {
      if (!!yl().read()?.claudeAiOauth?.refreshToken) {
        delete e.CLAUDE_CODE_OAUTH_TOKEN;
        delete e.CLAUDE_CODE_OAUTH_TOKEN_FILE_DESCRIPTOR;
      }
    }
    return e;
  }
  var Rur;
  var _sc;
  var _Ct;
  var bsc;
  var L5o;
  var F5o = __lazy(() => {
    Ot();
    je();
    gn();
    dt();
    lW();
    Cs();
    DW();
    Sve();
    Rur = require("child_process");
    _sc = require("fs");
    _Ct = require("fs/promises");
    bsc = require("os");
    L5o = require("path");
  });
  async function tBe(e) {
    let t = Date.now() + e;
    while (Date.now() < t) {
      if ((await CT({
        proto: 1,
        op: "ping"
      })).ok) {
        return true;
      }
      await Hen.setTimeout(100);
    }
    return false;
  }
  async function Rrf(e) {
    let t = Date.now();
    let n = false;
    let r = "restarting";
    while (Date.now() < t + (n ? 30000 : 1e4)) {
      let o = await CT({
        proto: 1,
        op: "nudge"
      });
      if (o.ok && o.op === "nudge") {
        if (n = true, !o.restarting) {
          if (await Arf(o.version, e)) {
            return "down";
          }
          if (Date.now() - t > 200) {
            logEvent("tengu_bg_skew_nudge", {
              converged: true,
              duration_ms: Date.now() - t
            });
          }
          return "up";
        }
        r = "restarting";
        await Hen.setTimeout(100);
        continue;
      }
      if (!o.ok && o.code === "ETIMEOUT") {
        n = true;
        r = "etimeout";
        await Hen.setTimeout(100);
        continue;
      }
      if (!o.ok && o.code === "ENOCONN") {
        if (!n) {
          let s = await lP().catch(() => null);
          if (s?.bgDisabled) {
            return "down";
          }
          if (s) {
            n = true;
          }
        }
        if (!n) {
          return "down";
        }
        r = "enoconn";
        await Hen.setTimeout(100);
        continue;
      }
      return "up";
    }
    logEvent("tengu_bg_skew_nudge", {
      converged: false,
      restarting: r === "restarting",
      etimeout: r === "etimeout",
      enoconn: r === "enoconn"
    });
    return "down";
  }
  async function M5(e = {}) {
    let t = Date.now();
    if ((await Rrf(e.forceTransient ?? false)) === "up") {
      Pe("daemon_ensure_running");
      return {
        ok: true
      };
    }
    let n = Date.now();
    let r = n - t > 40000;
    let o = await Esc();
    let s = o && (await Lir());
    if (s) {
      logEvent("tengu_bg_daemon_service_stale_exec", {});
      logForDebugging("daemon service exec path is stale (binary deleted) \u2014 falling back to transient spawn. Run 'claude daemon install' to repair.", {
        level: "warn"
      });
    }
    let i = false;
    if (o && !s) {
      i = true;
      e.onStarting?.();
      let h = await Tsc();
      if (h) {
        Ae("daemon_ensure_running", h.code);
        return {
          ok: false,
          reason: h.reason
        };
      }
      let g = await Nir();
      let y = await tBe(5000);
      if (logEvent("tengu_bg_daemon_install", {
        outcome_ok: y,
        via_service: true,
        fresh_install: false,
        clock_jump: r,
        duration_ms: Date.now() - t,
        platform_darwin: Wt() === "macos",
        platform_linux: Wt() === "linux",
        platform_windows: Wt() === "windows"
      }), y) {
        Pe("daemon_ensure_running");
        return {
          ok: true
        };
      }
      logEvent("tengu_bg_daemon_service_poll_fallthrough", {
        sr_ok: g.ok
      });
      logForDebugging(`daemon service did not become reachable within 5s${g.ok ? "" : ` (${g.error})`} \u2014 falling back to transient spawn. Run 'claude daemon install' to repair.`, {
        level: "warn"
      });
    }
    if (!o && !e.forceTransient && getDaemonColdStart() === "ask" && vsc() && !getGlobalConfig().daemonInstallPromptDismissed) {
      logEvent("tengu_bg_daemon_cold_start_ask", {});
      return {
        ok: false,
        askInstall: true,
        reason: "No background daemon is running. Run 'claude daemon install' to set it up as a persistent service."
      };
    }
    if (!i) {
      e.onStarting?.();
      let h = await Tsc();
      if (h) {
        Ae("daemon_ensure_running", h.code);
        return {
          ok: false,
          reason: h.reason
        };
      }
    }
    let a = U5o === null ? null : Date.now() - U5o;
    U5o = Date.now();
    let l = De({
      label: Irf(),
      cwd: Nt(),
      pid: process.pid
    });
    let {
      err: c,
      stderrPath: u
    } = await xur(["daemon", "run", "--origin", "transient", "--spawned-by", l]);
    if (c) {
      if (u) {
        lee.rm(B5o.dirname(u), {
          recursive: true,
          force: true
        }).catch(() => {});
      }
      logEvent("tengu_bg_daemon_spawn_failed", {
        errno_enoent: en(c) === "ENOENT",
        errno_eacces: en(c) === "EACCES",
        errno: gd(c) ?? "unknown"
      });
      Ae("daemon_ensure_running", "daemon_ensure_spawn_failed");
      return {
        ok: false,
        reason: `spawn ${bgSupervisorNoun()}: ${he(c)}`
      };
    }
    let d = await tBe(30000);
    let p = Date.now() - n > 60000;
    if (!d && p) {
      d = await tBe(5000);
    }
    if (!d && !p) {
      d = await tBe(45000 - 30000);
    }
    let m = false;
    let f;
    if (!d && u) {
      let h = ((await t0(u, 1048576)) ?? "").slice(0, 2000);
      if (h.length > 0) {
        m = true;
        logForDebugging(`daemon: transient spawn stderr:
${h}`, {
          level: "error"
        });
        f = [...h.matchAll(/\bE[A-Z]{2,14}\b/g)].find(g => !"/\\".includes(h[g.index - 1] ?? "."))?.[0];
      }
    }
    if (u) {
      lee.rm(B5o.dirname(u), {
        recursive: true,
        force: true
      }).catch(() => {});
    }
    if (logEvent("tengu_bg_daemon_install", {
      outcome_ok: d,
      via_service: false,
      fresh_install: false,
      clock_jump: p || r,
      duration_ms: Date.now() - t,
      platform_darwin: Wt() === "macos",
      platform_linux: Wt() === "linux",
      platform_windows: Wt() === "windows",
      had_stderr: m,
      ...(a !== null && {
        spawn_gap_ms: a
      }),
      ...(f && {
        stderr_errno: f
      })
    }), d) {
      Prf();
      Pe("daemon_ensure_running");
      return {
        ok: true
      };
    }
    Ae("daemon_ensure_running", "daemon_ensure_transient_unreachable");
    return {
      ok: false,
      reason: `${bgSupervisorNoun()} did not become reachable within ${45000 / 1000}s`
    };
  }
  async function Ssc(e) {
    try {
      return (await lee.stat(await lee.realpath(e))).mtimeMs;
    } catch {
      return null;
    }
  }
  function xrf() {
    let e = eH();
    return e.prefixArgs[0] ?? e.cmd;
  }
  function krf(e) {
    if (e.daemonOrigin !== "transient") {
      return false;
    }
    if (e.daemonVersion === e.clientVersion) {
      return false;
    }
    if (e.daemonTarget === e.clientTarget) {
      return false;
    }
    if (!e.daemonTarget) {
      return jen.valid(e.clientVersion) !== null && jen.valid(e.daemonVersion) !== null && jen.gt(e.clientVersion, e.daemonVersion);
    }
    if (e.clientMtimeMs === null || e.daemonMtimeMs === null) {
      return false;
    }
    return e.clientMtimeMs > e.daemonMtimeMs;
  }
  async function Arf(e, t) {
    if (e === {
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION) {
      return false;
    }
    if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_bg_binary_takeover", true)) {
      return false;
    }
    if (await Esc()) {
      return false;
    }
    if (!t && getDaemonColdStart() === "ask" && vsc() && !getGlobalConfig().daemonInstallPromptDismissed) {
      return false;
    }
    let n = await lee.realpath(xrf()).catch(() => null);
    if (!n) {
      return false;
    }
    let r = await lP().catch(() => null);
    if (!r) {
      return false;
    }
    let [o, s] = await Promise.all([Ssc(n), r.launchTarget ? Ssc(r.launchTarget) : Promise.resolve(null)]);
    if (!krf({
      daemonVersion: r.version,
      daemonOrigin: r.origin,
      daemonTarget: r.launchTarget,
      clientVersion: {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION,
      clientTarget: n,
      daemonMtimeMs: s,
      clientMtimeMs: o
    })) {
      return false;
    }
    let i = await jvt(r.pid);
    if (i === "timed-out") {
      try {
        process.kill(r.pid, "SIGKILL");
      } catch {}
      i = await jvt(r.pid);
    }
    if (i !== "exited") {
      return false;
    }
    logForDebugging(`bg: ${bgSupervisorNoun()} pid ${r.pid} runs ${r.version}; this binary (${{
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION}) is a newer build \u2014 retired the stale ${bgSupervisorNoun()} so new sessions use the current binary`, {
      level: "warn"
    });
    logEvent("tengu_bg_daemon_binary_takeover", {
      daemon_age_ms: Date.now() - r.startedAt
    });
    return true;
  }
  async function Tsc() {
    let e = await lP().catch(() => null);
    if (!e) {
      return null;
    }
    if (e.bgDisabled) {
      logEvent("tengu_bg_daemon_bg_disabled_skip", {
        origin_service: e.origin === "service"
      });
      return {
        reason: "the background service on this machine is running without background sessions \u2014 its control socket failed to start. " + "Check the cause with 'claude daemon status' (daemon.log), then restart the service (launchctl/systemctl, or reboot).",
        code: "daemon_ensure_bg_disabled"
      };
    }
    if (Date.now() - e.startedAt <= 1e4 + 5000) {
      return null;
    }
    let t = await CT({
      proto: 1,
      op: "ping"
    }, {
      timeoutMs: 1000
    });
    let n = {
      started_ago_ms: Date.now() - e.startedAt,
      origin_transient: e.origin === "transient",
      origin_service: e.origin === "service",
      version_skew: e.version !== {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION
    };
    if (t.ok || t.code === "ETIMEOUT") {
      logEvent("tengu_bg_daemon_zombie_false_positive", {
        ...n,
        recheck_etimeout: !t.ok
      });
      return null;
    }
    let r = false;
    try {
      r = await lee.lstat(T5()).then(() => true, () => false);
    } catch {}
    if (logForDebugging(`bg: supervisor pid ${e.pid} alive but control socket unreachable \u2014 signalling restart`, {
      level: "warn"
    }), (await jvt(e.pid)) === "eperm") {
      return {
        reason: `${bgSupervisorNoun()} socket missing; could not restart supervisor (EPERM)`,
        code: "daemon_ensure_zombie_kill_failed"
      };
    }
    logEvent("tengu_bg_daemon_zombie_restart", {
      pid: e.pid,
      ...n,
      sock_exists: r
    });
    return null;
  }
  async function Esc() {
    if (process.env.CLAUDE_CONFIG_DIR || !gUe()) {
      return false;
    }
    return WZ().catch(() => false);
  }
  function Irf() {
    let e = process.argv.slice(2);
    if (e[0] === "agents") {
      return "claude agents";
    }
    if (e.includes("--bg")) {
      return "claude --bg";
    }
    return "claude";
  }
  async function Prf() {
    let e = Wt();
    if (e !== "linux" && e !== "wsl") {
      return;
    }
    let t = await lee.readFile("/etc/systemd/logind.conf", "utf8").catch(() => "");
    if (!/^\s*KillUserProcesses\s*=\s*yes\b/im.test(t)) {
      return;
    }
    logForDebugging("logind KillUserProcesses=yes \u2014 SSH disconnect will kill the transient daemon and its background jobs. Run `loginctl enable-linger $USER` or `claude daemon install` to keep it alive across logout.", {
      level: "warn"
    });
  }
  function vsc() {
    return isDaemonServiceInstallEnabled() && gUe() && !process.env.CLAUDE_CONFIG_DIR && isDaemonCliEnabled();
  }
  var lee;
  var B5o;
  var jen;
  var Hen;
  var U5o = null;
  var aJe = __lazy(() => {
    uT();
    ln();
    $n();
    Ot();
    vo();
    je();
    dt();
    n1();
    Aqo();
    Cs();
    Sve();
    jZ();
    yUe();
    Mfe();
    D5o();
    uP();
    pL();
    F5o();
    lee = require("fs/promises");
    B5o = require("path");
    jen = __toESM(lq(), 1);
    Hen = require("timers/promises");
  });
  async function Wen() {
    let e = await M5({
      onStarting: qen
    });
    if (e.ok || !e.askInstall) {
      return e;
    }
    if (!process.stdin.isTTY || !process.stderr.isTTY || Me.isCI) {
      return e;
    }
    process.stderr.write(`No background daemon is running.
Installing it as a service keeps the background daemon running across reboot so 'claude agents' stays available.
`);
    let t = await Orf("Install as a service now? [y/N/never, or 'once' just for now] ");
    switch (logEvent("tengu_bg_daemon_cold_start_ask_answer", {
      answer_yes: t === "yes",
      answer_once: t === "once",
      answer_never: t === "never"
    }), t) {
      case "yes":
        {
          await JQt();
          let n = await XQt({
            jsonPath: S5(),
            logPath: fUe()
          });
          if (!n.ok) {
            process.stderr.write(`Service install failed (${n.error}). Falling back to a transient ${bgSupervisorNoun()} for now.
`);
            return M5({
              forceTransient: true,
              onStarting: qen
            });
          }
          process.stderr.write(`Installed: ${n.servicePath}
Run 'claude daemon uninstall' to undo.
`);
          qen();
          return (await tBe(45000)) ? {
            ok: true
          } : {
            ok: false,
            reason: `service installed but the daemon did not become reachable within ${45000 / 1000}s \u2014 check 'claude daemon status'`
          };
        }
      case "once":
        return M5({
          forceTransient: true,
          onStarting: qen
        });
      case "never":
        saveGlobalConfig(n => n.daemonInstallPromptDismissed ? n : {
          ...n,
          daemonInstallPromptDismissed: true
        });
        return M5({
          forceTransient: true,
          onStarting: qen
        });
      case "no":
        return e;
    }
  }
  async function Orf(e) {
    let t = wsc.createInterface({
      input: process.stdin,
      output: process.stderr
    });
    try {
      let r = (await new Promise(o => {
        t.once("close", () => o("n"));
        t.question(e, o);
      })).trim().toLowerCase();
      if (r === "y" || r === "yes") {
        return "yes";
      }
      if (r === "once" || r === "o") {
        return "once";
      }
      if (r === "never") {
        return "never";
      }
      return "no";
    } finally {
      t.close();
    }
  }
  var wsc;
  var qen = () => process.stderr.write(`Starting ${bgSupervisorNoun()}\u2026
`);
  var $5o = __lazy(() => {
    uT();
    Ot();
    pr();
    jZ();
    hUe();
    yUe();
    aJe();
    wsc = require("readline");
  });
  function Csc(e) {
    let t = "--cloud";
    let n = "\nTo reattach to a cloud session, pass its id: `claude --cloud <session-id>` (find IDs at claude.ai/code).";
    if (e.print && !e.hasPool && !e.isCloudAttach) {
      return `Error: ${t} cannot be combined with --print.
Cloud sessions are interactive only. Drop --print, or drop ${t} to run locally.`;
    }
    if (e.nonInteractive && !e.hasPool && !e.isCloudAttach) {
      return `Error: ${t} requires an interactive terminal.
Non-interactive invocations (piped stdout, --init-only, --sdk-url) run locally and would silently ignore ${t}. Drop ${t}, or run from a TTY.`;
    }
    if (e.continue) {
      return `Error: ${t} cannot be combined with --continue.${n}`;
    }
    if (e.hasConnect || e.hasSSH || e.hasAssistant || e.hasTeleport) {
      let r = e.hasConnect ? "a cc:// connect URL" : e.hasSSH ? "`claude ssh`" : e.hasAssistant ? "`claude assistant`" : "--teleport";
      return `Error: ${t} cannot be combined with ${r} \u2014 both select a remote backend; pick one.`;
    }
    if (e.resume || e.fromPr) {
      let r = e.resume ? "--resume" : "--from-pr";
      return `Error: ${t} cannot be combined with ${r}.${n}`;
    }
    return null;
  }
  function H5o(e) {
    return "--bg and --cloud are different backends. Use `claude --cloud '<task>'` directly to start a cloud session.";
  }
  function j5o(e) {
    return e.some(t => t === "--cloud" || t.startsWith("--cloud=") || t === "--remote" || t.startsWith("--remote="));
  }
  function cJe(e) {
    let t = [];
    for (let n = 0; n < e.length; n++) {
      let r = e[n];
      if (r === "--") {
        for (let o = n; o < e.length; o++) {
          t.push(e[o]);
        }
        break;
      }
      if (r.startsWith("--cloud=") || r.startsWith("--remote=")) {
        continue;
      }
      if (r === "--cloud" || r === "--remote") {
        if (e[n + 1] !== undefined && !e[n + 1].startsWith("-")) {
          n++;
        }
        continue;
      }
      t.push(r);
    }
    return t;
  }
  async function Asc(e, t = {}) {
    let n = ksc.join(e, "adopt.json");
    let r = `${n}.reap.${process.pid}`;
    let o = Date.now() + (t.waitMs ?? 0);
    for (;;) {
      try {
        await QHe(n, r);
        break;
      } catch (s) {
        if (Date.now() >= o) {
          if (!fn(s)) {
            logForDebugging(`[adopt] reap claim failed: ${s}`, {
              level: "warn"
            });
          }
          return {
            found: false,
            reaped: 0
          };
        }
        await sleep(250);
      }
    }
    try {
      let s = Lrf().safeParse(qt(await Aur.readFile(r, "utf-8")));
      if (!s.success) {
        return {
          found: true,
          reaped: 0
        };
      }
      let {
        writtenAtMs: i,
        shells: a
      } = s.data;
      let l = i !== undefined ? Date.now() - i : undefined;
      if (l !== undefined && l > 604800000 || a.length > 256) {
        logForDebugging(`[adopt] reap skipped: implausible payload (age ${l ?? "?"}ms, ${a.length} entries)`, {
          level: "warn"
        });
        return {
          found: true,
          reaped: 0
        };
      }
      if (await Promise.all(a.map(c => Dgt(c.pid, c.startTimeTicks, c.procStart))), a.length > 0) {
        logEvent("tengu_adopt_exit_reap", {
          reaped_shells: a.length
        });
      }
      return {
        found: true,
        reaped: a.length
      };
    } catch (s) {
      logForDebugging(`[adopt] reap read/parse failed: ${s}`, {
        level: "warn"
      });
      return {
        found: true,
        reaped: 0
      };
    } finally {
      await Aur.unlink(r).catch(() => {});
    }
  }
  var Aur;
  var ksc;
  var Lrf;
  var Isc = __lazy(() => {
    qg();
    Ot();
    BT();
    je();
    dt();
    q5n();
    Aur = require("fs/promises");
    ksc = require("path");
    Lrf = we(() => Ke.object({
      writtenAtMs: Ke.number().optional(),
      shells: Ke.array(Ke.object({
        pid: Ke.number().int().positive(),
        procStart: Ke.string().optional(),
        startTimeTicks: Ke.number().int().optional()
      })).catch([])
    }));
  });
  async function Iur(e, t) {
    if (t.launch.mode !== "exec" || !e) {
      return null;
    }
    try {
      let n = await t0(VZ(e), 8192);
      if (n == null) {
        return null;
      }
      let r = JSON.parse(n);
      if (typeof r?.code !== "number") {
        return null;
      }
      let o = Li(typeof r.tail === "string" ? r.tail : "").replace(/\r\n?/g, `
`).split(`
`).findLast(l => l.trim())?.trim() ?? "";
      let s = mf(Lc(o), 800);
      if (r.code === 0) {
        return {
          state: "done",
          detail: s || "(no output)",
          code: 0
        };
      }
      let i = typeof r.signal === "string" ? r.signal : undefined;
      if (i === "SIGINT" || i === "SIGQUIT") {
        return {
          state: "stopped",
          detail: "stopped",
          code: r.code
        };
      }
      let a = i ? `${i} (${r.code})` : `exit ${r.code}`;
      return {
        state: "crashed",
        detail: s ? `${a} \u2014 ${s}` : a,
        signal: i,
        code: r.code
      };
    } catch {
      return null;
    }
  }
  var q5o = __lazy(() => {
    Qme();
    n1();
    Kv();
    uP();
  });
  async function V5o(e = {}) {
    return vl("daemon_bg_reap_all", async () => {
      let t = await j3({
        silent: true
      });
      let n = new Map();
      for (let [c, u] of Object.entries(t.workers)) {
        n.set(c, {
          pid: u.pid,
          procStart: u.procStart,
          ptySock: u.ptySock,
          dispatch: u.dispatch
        });
      }
      let r = Wt() === "windows";
      let [o, s] = r ? [_Ue(), ".pid"] : [zvt(), ".sock"];
      let i = await N5.readdir(o).catch(() => []);
      let a = new Set(i.filter(c => c.endsWith(s)));
      for (let c of i) {
        if (!c.endsWith(s)) {
          if (!r) {
            let p = [".err", ".late", ".exec-exit", ".err.read"].find(m => c.endsWith(`.sock${m}`));
            if (p && !a.vZc(c.slice(0, -p.length))) {
              let m = c.slice(0, -`.sock${p}`.length);
              if (!(p === ".exec-exit" && n.vZc(m))) {
                await N5.unlink(W5o.join(o, c)).catch(() => {});
              }
            }
          }
          continue;
        }
        let u = c.slice(0, -s.length);
        if (n.vZc(u)) {
          continue;
        }
        let d = r ? Number((await t0(Bwe(u), 4096)) ?? "0") : 0;
        n.set(u, {
          pid: d,
          ptySock: cP(u)
        });
      }
      if (!r) {
        let c = new Set();
        for (let d of n.values()) {
          if (d.ptySock) {
            c.add(d.ptySock);
          }
        }
        let u = await N5.readdir(GZ()).catch(() => []);
        for (let d of u) {
          if (!d.endsWith(".pty.sock")) {
            continue;
          }
          let p = W5o.join(GZ(), d);
          if (c.vZc(p)) {
            continue;
          }
          n.set(`spare:${d}`, {
            pid: 0,
            ptySock: p
          });
        }
      }
      let l = 0;
      if (await Promise.all(Array.from(n.entries()).map(async ([c, u]) => {
        let d = u.dispatch ? await Iur(u.ptySock, u.dispatch) : null;
        if (u.ptySock && (await uJe(u.ptySock))) {
          l++;
        } else if (u.pid && (await z5o(u.pid, u.procStart))) {
          l++;
        }
        if (!c.startsWith("spare:")) {
          let p = {
            state: "stopped",
            detail: "stopped"
          };
          let m = d?.state === "done" ? d : e.supervisorKilledAll ? p : d ?? p;
          await EGe(c, m.state, m.detail);
          await N5.unlink(VZ(u.ptySock ?? cP(c))).catch(() => {});
        }
        if (r) {
          await N5.unlink(Bwe(c)).catch(() => {});
          let p = ZO(cP(c));
          await N5.unlink(p).catch(() => {});
          await N5.unlink(`${p}.read`).catch(() => {});
          await N5.unlink(JM(cP(c))).catch(() => {});
        }
      })), n.size > 0) {
        await Kvt(c => {
          for (let u of n.keys()) {
            delete c.workers[u];
          }
        }).catch(Oe);
      }
      return {
        reaped: l
      };
    });
  }
  function uJe(e) {
    return new Promise(t => {
      let n = false;
      let r = s => {
        if (n) {
          return;
        }
        n = true;
        t(s);
      };
      let o = G5o.connect(e);
      o.unref();
      o.setTimeout(2000, () => {
        o.destroy();
        r(false);
      });
      o.on("error", () => {
        N5.unlink(e).catch(() => {});
        let s = ZO(e);
        N5.unlink(s).catch(() => {});
        N5.unlink(`${s}.read`).catch(() => {});
        N5.unlink(JM(e)).catch(() => {});
        r(false);
      });
      o.once("connect", () => {
        o.resume();
        o.write(YO({
          t: "kill",
          sig: "SIGTERM"
        }));
      });
      o.once("close", () => r(true));
    });
  }
  function Pur(e) {
    return new Promise(t => {
      let n = false;
      let r = s => {
        if (n) {
          return;
        }
        n = true;
        t(s);
      };
      let o = G5o.connect(e);
      o.unref();
      o.setTimeout(250, () => {
        o.destroy();
        r(false);
      });
      o.on("error", () => r(false));
      o.once("connect", () => {
        o.end(YO({
          t: "pong"
        }));
        r(true);
      });
    });
  }
  async function z5o(e, t) {
    if (t !== undefined) {
      if (!(await isSameProcessAsync(e, t))) {
        return false;
      }
    } else {
      try {
        process.kill(e, 0);
        return false;
      } catch {}
    }
    return sigtermThenKill([-e, e], t);
  }
  var N5;
  var G5o;
  var W5o;
  var bCt = __lazy(() => {
    zf();
    ln();
    n1();
    Tb();
    Rn();
    Cs();
    q5o();
    uP();
    X7e();
    hYe();
    N5 = require("fs/promises");
    G5o = require("net");
    W5o = require("path");
  });
  async function yCe(e, t, n) {
    if (t?.backend === "peer") {
      return {
        confirmed: true
      };
    }
    let r = n?.handoff ? true : undefined;
    let o = n?.knownGone ? {
      ok: false,
      code: "ENOJOB",
      error: "job already gone (caller-verified)"
    } : await CT({
      proto: 1,
      op: "kill",
      short: e,
      handoff: r
    });
    for (let s = 0; !o.ok && o.code === "ESTARTING" && s < 10; s++) {
      await sleep(200);
      o = await CT({
        proto: 1,
        op: "kill",
        short: e,
        handoff: r
      });
    }
    if (o.ok) {
      return {
        confirmed: true
      };
    }
    if (o.code === "ENOJOB" || o.code === "ENOCONN" || o.code === "ETIMEOUT") {
      let s = await Y5o(e);
      if (s.anyMatch) {
        return {
          confirmed: s.confirmed
        };
      }
      if (o.code === "ENOCONN" || o.code === "ETIMEOUT") {
        let i = (await j3({
          silent: true
        })).workers[e];
        return {
          confirmed: i !== undefined && !(await Gen(i.pid, i.procStart))
        };
      }
      return {
        confirmed: true
      };
    }
    return {
      confirmed: false,
      error: o.error
    };
  }
  async function Y5o(e) {
    let t = await uJe(cP(e));
    let n = false;
    let r = true;
    for (let o of await listAllLiveSessions().catch(() => [])) {
      if (o.kind === "bg" && (o.jobId === e || o.sessionId?.startsWith(e))) {
        if (n = true, !t) {
          try {
            process.kill(o.pid, "SIGTERM");
          } catch {}
        }
        let s = Date.now() + 3000;
        let i = true;
        while ((i = await Gen(o.pid, o.procStart)) && Date.now() < s) {
          await sleep(100);
        }
        if (i) {
          logEvent("tengu_bg_killjob_ctrl_fallback", {
            ctrlSent: t
          });
          try {
            process.kill(o.pid, "SIGTERM");
          } catch {}
          let a = Date.now() + 500;
          while ((i = await Gen(o.pid, o.procStart)) && Date.now() < a) {
            await sleep(100);
          }
        }
        if (i) {
          r = false;
        }
      }
    }
    return {
      confirmed: r,
      anyMatch: n
    };
  }
  async function Our() {
    let e = await CT({
      proto: 1,
      op: "list"
    });
    if (e.ok && e.op === "list") {
      return {
        shorts: new Set(e.jobs.map(o => o.short)),
        records: e.jobs.filter(o => !o.outcome)
      };
    }
    let t = await j3({
      silent: true
    });
    let n = Object.entries(t.workers);
    let r = await Promise.all(n.map(([, o]) => Gen(o.pid, o.procStart)));
    return {
      shorts: new Set(n.filter((o, s) => r[s]).map(([o]) => o)),
      records: []
    };
  }
  async function Dsc(e) {
    let t = await CT({
      proto: 1,
      op: "has",
      short: e
    });
    if (t.ok && t.op === "has") {
      return {
        alive: t.alive,
        present: t.present ?? t.alive,
        daemonUp: true
      };
    }
    let n = (await j3({
      silent: true
    })).workers[e];
    let r = n !== undefined && (await Gen(n.pid, n.procStart));
    return {
      alive: r,
      present: r,
      daemonUp: false
    };
  }
  async function Msc(e) {
    let t = await CT({
      proto: 1,
      op: "has",
      short: e
    });
    return t.ok && t.op === "has" ? t.present ?? t.alive : false;
  }
  async function Gen(e, t) {
    try {
      process.kill(e, 0);
    } catch (n) {
      let r = en(n);
      return r !== "ESRCH" && r !== "EPERM";
    }
    return isSameProcessAsync(e, t);
  }
  function SCt(e, t) {
    return {
      ...e,
      detail: mf(Lc(t).replace(/\s+/g, " ").trim(), 800),
      tempo: "active",
      needs: undefined,
      block: undefined,
      suggestedReply: undefined,
      output: null,
      updatedAt: new Date().toISOString()
    };
  }
  function Nsc() {
    return `Couldn't reach the ${bgSupervisorNoun()} \u2014 it may be restarting. Press Enter to retry`;
  }
  function Lsc(e) {
    return e === Nsc();
  }
  async function Ven(e, t, n, r) {
    if (n?.backend === "peer") {
      if (!n.sock) {
        Pe("job_reply");
        return {
          err: "Can't send \u2014 that session is running in another terminal"
        };
      }
      try {
        await sendToUdsSocket(n.sock, t);
        Pe("job_reply");
        return null;
      } catch (u) {
        Ae("job_reply", "job_reply_peer_send_failed");
        return {
          err: `Couldn't send to that session \u2014 ${he(u)}`
        };
      }
    }
    let o = dc(e);
    let s = r ?? (await Zi(o));
    let i = await Ofe();
    let a = () => CT({
      proto: 1,
      op: "reply",
      short: e,
      text: t,
      auth: i
    });
    let l = await a();
    let c = 10;
    for (let u = 0; !l.ok && (l.code === "ESTARTING" || l.code === "ENOREPLY" || l.code === "ERESPAWNING") && u < c; u++) {
      if (l.code === "ERESPAWNING") {
        c = 60;
      }
      await sleep(200);
      l = await a();
    }
    if (!l.ok && l.code === "EAUTH") {
      let u = await Ofe();
      if (u && u !== i) {
        i = u;
        l = await a();
      }
    }
    if (!l.ok && (l.code === "ENOCONN" || l.code === "ETIMEOUT")) {
      if ((await M5({
        forceTransient: true
      })).ok) {
        i = (await Ofe()) ?? i;
        l = await a();
        for (let d = 0; !l.ok && (l.code === "ESTARTING" || l.code === "ENOREPLY") && d < 10; d++) {
          await sleep(200);
          l = await a();
        }
      }
    }
    if (l.ok) {
      if (s && !r) {
        fS(o);
        let u = (await Zi(o)) ?? s;
        ip(o, SCt(u, t)).catch(lf);
      }
      if (!r) {
        logEvent("tengu_bg_agent_action", {
          action: "reply",
          agent: s?.template ?? "unknown",
          wasTerminal: s ? FI(s.state) : false,
          daemon: true
        });
        Pe("job_reply");
      }
      return null;
    }
    if (l.code === "ENOJOB") {
      if (!r) {
        Et("job_reply", "job_reply_not_running");
      }
      return {
        err: "That session isn't running \u2014 respawn it first",
        code: l.code
      };
    }
    if (l.code === "ENOCONN" || l.code === "ETIMEOUT") {
      if (!r) {
        Ae("job_reply", "job_reply_daemon_unreachable");
      }
      return {
        err: Nsc(),
        code: l.code
      };
    }
    if (!r) {
      Ae("job_reply", "job_reply_send_failed");
    }
    return {
      err: `Couldn't send your message \u2014 ${l.error}`,
      code: l.code
    };
  }
  async function Psc(e) {
    let t = dc(e);
    fS(t);
    let n = await Zi(t).catch(() => null);
    if (n === null) {
      Pe("job_attach");
      return {
        kind: "error",
        ended: true,
        msg: "That session was removed \u2014 back to the list"
      };
    }
    if (n.state !== "done" && n.state !== "stopped" && n.state !== "blocked" && n.state !== "failed") {
      await sleep(50);
      fS(t);
      n = (await Zi(t).catch(() => null)) ?? n;
    }
    if (n.state === "done" || n.state === "stopped" || n.state === "blocked") {
      Pe("job_attach");
      return {
        kind: "error",
        ended: true,
        msg: n.state === "stopped" ? "That session was stopped \u2014 back to the list" : n.state === "blocked" ? "That session is blocked \u2014 back to the list" : "That session ended \u2014 back to the list"
      };
    }
    if (n.state === "failed") {
      let r = n.detail.includes("before init");
      Et("job_attach", r ? "job_attach_pre_init_crash" : "job_attach_crash_loop");
      return {
        kind: "error",
        ended: true,
        msg: `Session can't start \u2014 ${n.detail.replace(/^.*?before init(?: \u2014 )?/, "").replace(/^Error:\s*/, "") || n.detail || "it crashed repeatedly"}`
      };
    }
    return;
  }
  async function Fsc(e, t = {}) {
    gCe.writeFile(Osc.join(dc(e), "recap.trigger"), "").catch(() => {});
    logForDebugging("[PERF:bg-attach-start]");
    Sct();
    let n = /ENOENT|ECONNREFUSED|control socket closed/;
    let r = Svt;
    let o = {
      holdScreenOnDisconnect: true,
      alreadyInAlt: t.alreadyInAlt,
      gateStdinUntilFirstFrame: t.gateStdinUntilFirstFrame
    };
    let s = {
      ...o,
      holdingFrame: true,
      gateStdinUntilFirstFrame: false
    };
    let i = !t.alreadyInAlt;
    let a = await aee(e, o);
    let l;
    if (a.outcome === "error" && a.msg && n.test(a.msg)) {
      if (l = await M5({
        forceTransient: true
      }), l.ok) {
        a = await aee(e, o);
      }
    }
    for (let c = 0; a.msg && r.test(a.msg) && c < 20; c++) {
      await sleep(500);
      a = await aee(e, o);
    }
    while (a.outcome === "disconnected") {
      let u = Math.max(1, (process.stdout.columns ?? 80) - 15);
      process.stdout.write(`\x1B7${rG(1, u)}\x1B[2;7m${" Reconnecting\u2026 "}\x1B[0m\x1B8`);
      let d;
      if (process.stdin.isTTY) {
        let f = "isRaw" in process.stdin ? Boolean(process.stdin.isRaw) : false;
        if (!f) {
          PI(process.stdin, true);
        }
        let h = lsc(process.stdin);
        try {
          d = await Promise.race([M5({
            forceTransient: true
          }), h.promise.then(() => "detach")]);
        } finally {
          if (h.cancel(), !f) {
            PI(process.stdin, false);
          }
        }
      } else {
        d = await M5({
          forceTransient: true
        });
      }
      if (d === "detach") {
        if (i) {
          process.stdout.write(GF());
        }
        logForDebugging("[PERF:bg-attach-end]");
        Pe("job_attach");
        return {
          kind: "detached"
        };
      }
      let p = d;
      if (!p.ok) {
        if (i) {
          process.stdout.write(GF());
        }
        Ae("job_attach", "job_attach_daemon_start_failed");
        return {
          kind: "error",
          msg: `Couldn't restart the ${bgSupervisorNoun()} \u2014 ${p.reason}`
        };
      }
      let m = Sct();
      if (m && Tur(m)) {
        if (i) {
          process.stdout.write(GF());
        }
        logForDebugging("[PERF:bg-attach-end]");
        Pe("job_attach");
        return {
          kind: "detached"
        };
      }
      a = await aee(e, s);
      for (let f = 0; a.msg && r.test(a.msg) && f < 10; f++) {
        await sleep(200);
        a = await aee(e, s);
      }
      if (a.msg?.includes("ENOJOB")) {
        if (i) {
          process.stdout.write(GF());
        }
        logForDebugging(`[bg-attach] ENOJOB on reconnect short=${e} \u2014 daemon has no handle (or it's killing/settled)`);
        let f = await Psc(e);
        if (f) {
          return f;
        }
        Et("job_attach", "job_attach_crashed");
        return {
          kind: "error",
          orphaned: true,
          msg: "Session crashed \u2014 press Enter to respawn"
        };
      }
      if (a.outcome === "error" && i) {
        process.stdout.write(GF());
      }
    }
    if (a.outcome === "detached" && a.msg && (SQt.test(a.msg) || r.test(a.msg))) {
      if (i) {
        process.stdout.write(GF());
      }
      Ae("job_attach", "job_attach_stalled");
      return {
        kind: "error",
        msg: a.msg.replace(/^E(STALLED|RESPAWNING|STARTING):\s*/, "")
      };
    }
    if (a.outcome === "error") {
      if (a.msg?.includes("ENOJOB")) {
        logForDebugging(`[bg-attach] ENOJOB on first attach short=${e} \u2014 daemon has no handle (or it's killing/settled)`);
        let u = await Psc(e);
        if (u) {
          return u;
        }
        Et("job_attach", "job_attach_orphaned");
        return {
          kind: "error",
          orphaned: true,
          msg: `${bgSupervisorNounCap()} lost track of this job \u2014 press Enter to respawn it`
        };
      }
      if (l && !l.ok) {
        Ae("job_attach", "job_attach_daemon_start_failed");
        return {
          kind: "error",
          msg: `Couldn't start the ${bgSupervisorNoun()} \u2014 ${l.reason}`
        };
      }
      let c = a.msg && r.test(a.msg) ? `${bgSupervisorNounCap()} is still starting \u2014 try again in a moment` : a.msg && n.test(a.msg) ? `${bgSupervisorNounCap()} didn't respond after starting \u2014 try again in a moment` : a.msg ? `Couldn't attach \u2014 ${a.msg}` : "Couldn't attach to that session";
      Ae("job_attach", "job_attach_failed");
      return {
        kind: "error",
        msg: c
      };
    }
    if (logForDebugging("[PERF:bg-attach-end]"), Pe("job_attach"), a.msg && TQt.test(a.msg)) {
      return {
        kind: "detached",
        msg: a.msg.replace(TQt, "")
      };
    }
    return {
      kind: "detached"
    };
  }
  async function nhe(e, t = {}) {
    let n = await Zi(dc(e));
    let r = await yCe(e, n ?? undefined, {
      knownGone: t.knownGone
    }).catch(l => ({
      confirmed: false,
      error: he(l)
    }));
    if (!r.confirmed) {
      if (logForDebugging(`deleteJob: kill unconfirmed for ${e} \u2014 skipping jobdir/worktree removal to avoid stranding a live worker`, {
        level: "warn"
      }), !t.internal) {
        Ae("job_delete", "kill_unconfirmed");
      }
      return {
        removed: false,
        error: r.error
      };
    }
    let o;
    let s;
    let i;
    if (n?.worktreePath) {
      let {
        dirty: l,
        gitError: c
      } = t.force ? {
        dirty: false,
        gitError: false
      } : await getAgentWorktreeChanges(n.worktreePath);
      if (l && !c) {
        o = n.worktreePath;
        s = "dirty";
        i = "worktree_kept_dirty";
        logForDebugging(`deleteJob: worktree has uncommitted changes, kept ${n.worktreePath}`, {
          level: "warn"
        });
      } else {
        let u = findCanonicalGitRoot(n.originCwd ?? n.worktreePath) ?? undefined;
        let d = !c && u && n.worktreeBranch ? await listRegisteredWorktrees(u).catch(() => null) : null;
        let p = await gCe.realpath(n.worktreePath).catch(() => n.worktreePath);
        let m;
        for (let f of d ?? []) {
          if ((await gCe.realpath(f.worktreePath).catch(() => f.worktreePath)) === p) {
            m = f;
            break;
          }
        }
        if (m && m.worktreeBranch !== n.worktreeBranch) {
          o = n.worktreePath;
          s = "branch_mismatch";
          i = "worktree_kept_branch_mismatch";
          logForDebugging(`deleteJob: ${n.worktreePath} is on branch ${m.worktreeBranch ?? "(detached)"}, expected ${n.worktreeBranch} \u2014 not ours to remove`, {
            level: "warn"
          });
        } else if (!(await removeAgentWorktree(n.worktreePath, n.worktreeBranch, u, n.worktreeHookBased, t.force ? "job_delete_force" : "job_delete").catch(() => false))) {
          o = n.worktreePath;
          s = "remove_failed";
          i = "worktree_kept_remove_failed";
        }
      }
    }
    let a = n?.fan?.some(l => l.kind === "shell" && l.doneAt === undefined) ?? false;
    if (await Asc(dc(e), {
      waitMs: a ? 4000 : 0
    }), await gCe.rm(dc(e), {
      recursive: true,
      force: true
    }).catch(() => {}), await gCe.unlink(Dfe(e)).catch(() => {}), fS(dc(e)), !t.internal) {
      if (i) {
        Et("job_delete", i);
      } else {
        Pe("job_delete");
      }
    }
    return {
      removed: true,
      keptWorktree: o,
      keptReason: s
    };
  }
  var gCe;
  var Osc;
  var TCt = __lazy(() => {
    uT();
    Isc();
    A5o();
    Mfe();
    aJe();
    uP();
    pL();
    bCt();
    hYe();
    d1n();
    mT();
    c1();
    ln();
    Ot();
    je();
    dt();
    Tb();
    na();
    Kv();
    aPe();
    wze();
    iP();
    Qme();
    zf();
    gCe = require("fs/promises");
    Osc = require("path");
  });
  function Usc(e) {
    return {
      name: e.agentType,
      description: e.whenToUse,
      initialPrompt: e.initialPrompt,
      color: e.color
    };
  }
  function RCt(e, t) {
    if (!e?.agent) {
      return xie;
    }
    let n = e.agent;
    let r = n.toLowerCase();
    let o = t?.find(i => i.name.toLowerCase() === r) ?? t?.find(i => i.name.toLowerCase().endsWith(`:${r}`));
    if (o) {
      return o;
    }
    let s = getBuiltInAgents().find(i => i.agentType.toLowerCase() === r);
    if (s) {
      return {
        ...xie,
        name: s.agentType
      };
    }
    if (n.includes(":")) {
      return {
        ...xie,
        name: n
      };
    }
    return t ? xie : {
      ...xie,
      name: n
    };
  }
  async function Ken(e) {
    let {
      activeAgents: t
    } = await getAgentDefinitionsWithOverrides(e);
    return t.filter(n => !isBuiltInAgent(n)).map(Usc);
  }
  async function Bsc(e) {
    let t;
    try {
      t = await lB.readdir(e, {
        withFileTypes: true
      });
    } catch {
      return {};
    }
    let n = t.filter(o => (o.isDirectory() || o.isSymbolicLink()) && !o.name.startsWith(".") && !/\s/.test(o.name)).map(async o => {
      let s = CCt.join(e, o.name);
      try {
        await lB.stat(CCt.join(s, ".git"));
        return [o.name, s];
      } catch {
        return null;
      }
    });
    let r = (await Promise.all(n)).filter(o => o !== null);
    return Object.fromEntries(r);
  }
  async function X5o(e, t, n) {
    let r = h1(e).filter(i => t[i.id]?.type === "image");
    if (r.length === 0) {
      return e;
    }
    let o = dc(n);
    await lB.mkdir(o, {
      recursive: true
    });
    let s = e;
    for (let i = r.length - 1; i >= 0; i--) {
      let a = r[i];
      let l = t[a.id];
      let c = (l.mediaType ?? "image/png").split("/")[1] || "png";
      let u = CCt.join(o, `pasted-${a.id}.${c}`);
      await lB.writeFile(u, l.content, {
        encoding: "base64"
      });
      s = s.slice(0, a.index) + u + s.slice(a.index + a.match.length);
    }
    return s;
  }
  function $sc(e) {
    Yen = e;
  }
  function Hsc() {
    return Yen;
  }
  function Jen(e) {
    if (!e) {
      return [];
    }
    return [...(e.model ? ["--model", e.model] : []), ...(e.effort ? ["--effort", e.effort] : []), ...(e.permissionMode ? ["--permission-mode", e.permissionMode] : []), ...(e.allowBypass ? ["--allow-dangerously-skip-permissions"] : []), ...(e.jsonSchema ? ["--json-schema", e.jsonSchema] : []), ...(e.appendSystemPrompt ? ["--append-system-prompt", e.appendSystemPrompt] : [])];
  }
  async function Mur(e, t, n, r, o, s, i) {
    if (o) {
      if (await waitForPolicyLimitsToLoad(), !isPolicyAllowed("allow_routines")) {
        return {
          ok: false,
          error: "Routines are disabled by your organization's policy."
        };
      }
    }
    logForDebugging("[PERF:bg-dispatch-start]");
    let a = n ?? zen.randomUUID();
    let l = a.slice(0, 8);
    let c = r ?? Nt();
    let u = o ? ["--routine", o] : ["--agent", e.name];
    let d = [...Yen, ...u, ...Jen(s)];
    let p = dc(l);
    try {
      await lB.mkdir(CCt.join(p, "tmp"), {
        recursive: true
      });
      await ip(p, Uue({
        template: o ? {
          name: o,
          description: ""
        } : e,
        routine: o,
        respawnFlags: d,
        intent: t,
        displayIntent: i,
        ...(o && !t && {
          tempo: "idle",
          detail: "(idle \u2014 waiting for trigger)"
        }),
        sessionId: a,
        cwd: c,
        originCwd: c
      }));
    } catch (y) {
      await lB.rm(p, {
        recursive: true,
        force: true
      }).catch(() => {});
      fS(p);
      Ae("fleet_view_dispatch", "state_write_failed", {
        errno: gd(y) ?? "unknown"
      });
      return {
        ok: false,
        error: `Couldn't create the job \u2014 ${he(y)}`
      };
    }
    let m = [...d, ...(t ? ["--", t] : [])];
    let f = Date.now();
    let h = await spawnBgSession(m, a, "fleet", c);
    let g = !h.ok && h.reason === "gate_blocked";
    if (!h.ok && !h.alive && h.reason === "ack_timeout" && Date.now() - f < 2000) {
      logForDebugging(`bg: dispatch fast-failed (${Date.now() - f}ms) \u2014 retrying once`, {
        level: "warn"
      });
      await sleep(500);
      h = await spawnBgSession(m, a, "fleet", c);
    }
    if (!h.ok) {
      if (h.alive) {
        Et("fleet_view_dispatch", "alive_collision");
        return {
          ok: false,
          error: h.error
        };
      }
      if (!g) {
        await yCe(l).catch(() => {});
      }
      await lB.rm(p, {
        recursive: true,
        force: true
      }).catch(() => {});
      fS(p);
      (h.reason === "gate_blocked" ? Et : Ae)("fleet_view_dispatch", h.reason ?? "spawn_failed");
      return {
        ok: false,
        error: h.error,
        reason: h.reason
      };
    }
    if (logForDebugging("[PERF:bg-dispatch-end]"), h.rescued) {
      Et("fleet_view_dispatch", "rescued");
    } else {
      Pe("fleet_view_dispatch");
    }
    return {
      ok: true,
      jobId: h.short,
      sessionId: a
    };
  }
  function Xen() {
    return true;
  }
  async function jsc(e, t, n) {
    let r = t ?? zen.randomUUID();
    let o = r.slice(0, 8);
    let s = n ?? Nt();
    let i = dc(o);
    try {
      await lB.mkdir(CCt.join(i, "tmp"), {
        recursive: true
      });
      await ip(i, Uue({
        template: Urf,
        intent: e,
        sessionId: r,
        cwd: s,
        originCwd: s
      }));
    } catch (l) {
      await lB.rm(i, {
        recursive: true,
        force: true
      }).catch(() => {});
      fS(i);
      Ae("fleet_view_dispatch_exec", "state_write_failed", {
        errno: gd(l) ?? "unknown"
      });
      return {
        ok: false,
        error: `Couldn't create the job \u2014 ${he(l)}`
      };
    }
    let a = await spawnBgSession([], r, "fleet", s, {
      intent: e,
      exec: e
    });
    if (!a.ok) {
      if (a.alive) {
        Et("fleet_view_dispatch_exec", "alive_collision");
        return {
          ok: false,
          error: a.error
        };
      }
      await yCe(o).catch(() => {});
      await lB.rm(i, {
        recursive: true,
        force: true
      }).catch(() => {});
      fS(i);
      Ae("fleet_view_dispatch_exec", a.reason ?? "spawn_failed");
      return {
        ok: false,
        error: a.error,
        reason: a.reason
      };
    }
    Pe("fleet_view_dispatch_exec");
    return {
      ok: true,
      jobId: a.short,
      sessionId: r
    };
  }
  function Q5o() {
    return _Ce;
  }
  function qsc(e) {
    if (_Ce?.sessionId === e) {
      _Ce.ready = true;
    }
  }
  async function Nur(e, t = false, n, r) {
    if (t) {
      Dur = false;
    }
    if (_Ce || wCt || Dur) {
      return;
    }
    if (iJe()) {
      Et("job_spare_ensure", "low_mem");
      return;
    }
    let o = zen.randomUUID();
    let s = o.slice(0, 8);
    logForDebugging(`[PERF:bg-spare-start] ${s}`);
    wCt = (async () => {
      try {
        let i = await YE(e);
        let a = r;
        if (a === undefined && n?.agent) {
          clearAgentDefinitionsCache();
          a = await Ken(i).catch(() => []);
        }
        let l = RCt(n, a).name;
        let c = await spawnBgSession([...Yen, "--agent", l, ...Jen(n)], o, "spare", i);
        if (!c.ok) {
          await nhe(s, {
            internal: true
          }).catch(() => {});
          (c.reason === "gate_blocked" ? Et : Ae)("job_spare_ensure", c.reason ?? "spawn_failed");
          return;
        }
        if (Dur) {
          await nhe(s, {
            internal: true
          });
          Et("job_spare_ensure", "discarded_after_spawn");
          return;
        }
        _Ce = {
          jobId: s,
          sessionId: o,
          cwd: i,
          ready: false,
          defaults: n
        };
        logForDebugging(`[PERF:bg-spare-spawned] ${s}`);
        Pe("job_spare_ensure");
      } catch {
        await nhe(s, {
          internal: true
        }).catch(() => {});
        Ae("job_spare_ensure", "threw");
      }
    })();
    try {
      await wCt;
    } finally {
      wCt = null;
    }
  }
  async function Wsc(e, t) {
    logForDebugging("[PERF:bg-claim-start]");
    let n = _Ce;
    _Ce = null;
    let r = t ?? RCt(n?.defaults);
    let o = async (i, a) => {
      if (logForDebugging(`[bg-spare] claim miss (${i})${a ? `: ${a}` : ""}`), logEvent("tengu_bg_spare_claim_fail", {
        reason: i
      }), n) {
        let {
          removed: l,
          error: c
        } = await nhe(n.jobId, {
          internal: true,
          knownGone: i === "enojob"
        });
        if (!l) {
          Ae("job_claim_spare", "job_claim_spare_delete_failed");
          logForDebugging(`[bg-spare] deleteJob unconfirmed (${c ?? "unknown"}) \u2014 cold-dispatching with fresh sessionId; spare ${n.jobId} dir preserved`, {
            level: "warn"
          });
          return Mur(r, e, undefined, n.cwd, undefined, n.defaults);
        }
      }
      Et("job_claim_spare", i);
      return Mur(r, e, n?.sessionId, n?.cwd, undefined, n?.defaults);
    };
    if (!n) {
      return o("no-spare");
    }
    let s = SCt(Uue({
      template: r,
      respawnFlags: [...Yen, "--agent", r.name, ...Jen(n.defaults)],
      intent: e,
      sessionId: n.sessionId,
      cwd: n.cwd,
      originCwd: n.cwd
    }), e);
    try {
      let i = await Ven(n.jobId, e, undefined, s);
      if (i) {
        return o(i.err === "That session isn't running \u2014 respawn it first" ? "enojob" : "reply", i.err);
      }
    } catch (i) {
      return o("reply-throw", he(i));
    }
    await ip(dc(n.jobId), s).catch(lf);
    logForDebugging("[PERF:bg-claim-end]");
    Pe("job_claim_spare");
    Pe("fleet_view_dispatch");
    return {
      ok: true,
      jobId: n.jobId,
      sessionId: n.sessionId
    };
  }
  async function Z5o() {
    if (Dur = true, wCt) {
      await wCt.catch(() => {});
    }
    let e = _Ce;
    if (_Ce = null, e) {
      await nhe(e.jobId, {
        internal: true
      });
    }
  }
  async function xCt(e, t) {
    if (t?.knownAlive && t.knownState && !t.force) {
      return {
        ok: false,
        alive: true,
        short: t.knownState.daemonShort ?? e,
        state: t.knownState,
        error: `Session ${e} is already running`
      };
    }
    let n = dc(e);
    let r = t?.knownState ?? (await Zi(n));
    if (!r) {
      Ae("job_respawn", "job_respawn_state_missing");
      return {
        ok: false,
        error: "Can't respawn \u2014 that job's saved state is missing",
        alive: false
      };
    }
    let o = r.daemonShort ?? e;
    let s = Date.now();
    let i = await Dsc(o);
    let a = Date.now() - s;
    let l = i.alive;
    if (!t?.force && l) {
      return {
        ok: false,
        alive: true,
        short: o,
        state: r,
        error: `Session ${e} is already running`
      };
    }
    if (!t?.force && RSe(r)) {
      if (i.daemonUp && i.present) {
        return {
          ok: false,
          alive: true,
          short: o,
          state: r,
          error: `Session ${e} has exited; attach shows the captured output`
        };
      }
      Et("job_respawn", "exec_output_expired");
      return {
        ok: false,
        alive: false,
        state: r,
        error: "Output no longer available \u2014 this shell command has exited"
      };
    }
    if (t?.knownState) {
      fS(n);
    }
    let c = t?.knownState ? (await Zi(n)) ?? r : r;
    let u = c.daemonShort ?? e;
    let d = c.resumeSessionId ?? (kD(r.sessionId) !== null ? r.sessionId : zen.randomUUID());
    let p = Date.now();
    let m = 0;
    let f = 0;
    let h = null;
    let g = null;
    let y = i.daemonUp && !i.alive && !i.present && u === o;
    if (y) {
      h = Y5o(u);
      g = mle(d, c.cwd, c.linkScanPath);
    } else {
      let ne = await yCe(u, r);
      if (m = Date.now() - p, l && !ne.confirmed) {
        logEvent("tengu_bg_respawn_unconfirmed_bail", {});
        Et("job_respawn", "job_respawn_kill_unconfirmed");
        return {
          ok: false,
          alive: l,
          short: u,
          state: r,
          error: ne.error ?? "Couldn't stop the previous worker \u2014 supervisor may be starting, retry in a moment"
        };
      }
      let oe = Date.now();
      let ee = oe + 3000;
      while (Date.now() < ee) {
        if (!(await Msc(u))) {
          break;
        }
        await sleep(100);
      }
      f = Date.now() - oe;
    }
    let _ = Date.now();
    let b = await (g ?? mle(d, c.cwd, c.linkScanPath));
    let S = Date.now() - _;
    if (h) {
      let ne = Date.now();
      let oe = await h;
      if (m = Date.now() - ne, oe.anyMatch) {
        b = await mle(d, c.cwd, c.linkScanPath);
      }
    }
    let E = b.hasMessages;
    if (!E) {
      let ne = await ije(b.path);
      logEvent("tengu_bg_respawn_no_transcript", {
        via: b.via,
        had_link_scan_path: c.linkScanPath !== undefined,
        quarantined: ne
      });
    }
    let C = r.template === "exec" && r.respawnFlags.length === 0 ? r.intent : undefined;
    let x = cJe(c.respawnFlags);
    let A = C ? [] : x.length > 0 ? x : r.routine ? ["--routine", r.routine] : r.template !== "bg" ? ["--agent", r.template] : [];
    let k = A.indexOf("--agent");
    if (!E && k !== -1 && A[k + 1]) {
      let ne = A[k + 1];
      clearAgentDefinitionsCache();
      let oe = await Ken(c.cwd).catch(() => {
        return;
      });
      let ee = RCt({
        agent: ne
      }, oe).name;
      if (ee !== ne) {
        A = A.with(k + 1, ee);
      }
    }
    let I = c.resumeSessionId !== undefined && d !== r.sessionId;
    let O = C ? undefined : t?.initialPrompt ?? c.queuedPrompt ?? (E || I ? undefined : r.intent);
    let M = [...(E && !C ? ["--resume", d] : []), ...(t?.replyOnResume && E && !C && !O && !A.includes("--reply-on-resume") ? ["--reply-on-resume"] : []), ...A, ...(O ? ["--", O] : [])];
    let L = iOe(c.bridgeSessionId, c.bridgeSessionSeq, c.bridgeOutboundOnly);
    let P = Date.now();
    let F;
    try {
      await lB.access(Dfe(e));
      F = true;
    } catch (ne) {
      if (!fn(ne)) {
        return {
          ok: false,
          alive: false,
          state: r,
          error: `host-managed tombstone unreadable: ${he(ne)}`
        };
      }
      F = false;
    }
    let {
      CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST: H,
      ...U
    } = r.providerEnv ?? {};
    if (F) {
      for (let ne of Frf) {
        delete U[ne];
      }
    }
    let N = F ? {
      ...U,
      CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST: "1"
    } : U;
    let W = {
      ...(C && {
        intent: C,
        exec: C
      }),
      ...(E && !C && {
        resumeTranscriptPath: b.path
      }),
      ...(r.bgIsolation === "none" && {
        bgIsolation: "none"
      }),
      providerEnv: N,
      ...(r.sessionPermissionRules && {
        sessionPermissionRules: r.sessionPermissionRules
      }),
      ...(r.memoryToggledOff && {
        memoryToggledOff: true
      })
    };
    let j = await spawnBgSession(M, d, "fleet", c.cwd, W, L, e);
    if (!j.ok && !j.alive && j.reason === "ack_timeout" && Date.now() - P < 2000) {
      logForDebugging(`bg: respawn dispatch fast-failed (${Date.now() - P}ms) \u2014 retrying once`, {
        level: "warn"
      });
      await sleep(500);
      j = await spawnBgSession(M, d, "fleet", c.cwd, W, L, e);
    }
    let z = Date.now() - P;
    let V = Date.now() - s;
    if (logForDebugging(`[PERF:respawn] ${e}: total=${V}ms probe=${a}ms kill=${m}ms${y ? " (ceremony skipped)" : ""} wait=${f}ms transcript=${S}ms dispatch=${z}ms ok=${j.ok}`), logEvent("tengu_bg_respawn", {
      total_ms: V,
      probe_ms: a,
      kill_ms: m,
      wait_ms: f,
      transcript_ms: S,
      dispatch_ms: z,
      skipped_kill: y,
      daemon_up: i.daemonUp,
      was_present: i.present,
      forced: t?.force === true,
      ok: j.ok
    }), !j.ok) {
      if (j.alive) {
        Et("job_respawn", "already_alive");
      } else {
        Ae("job_respawn", "job_respawn_spawn_failed");
      }
      let ne = false;
      if (!j.alive && t?.initialPrompt) {
        let oe = {
          ...c,
          queuedPrompt: t.initialPrompt,
          updatedAt: new Date().toISOString()
        };
        ne = await ip(n, oe).then(() => true, ee => (lf(ee), false));
      }
      return {
        ok: false,
        error: j.error,
        alive: j.alive ?? false,
        short: j.short,
        state: r,
        queued: ne
      };
    }
    logEvent("tengu_bg_agent_action", {
      action: "respawn",
      agent: r.template,
      wasSettled: Xg(r)
    });
    fS(n);
    let K = (await Zi(n)) ?? c;
    if (K.state === "failed" && K.updatedAt > c.updatedAt) {
      Et("job_respawn", "crashed_during_spawn");
      return {
        ok: true,
        short: j.short,
        state: K
      };
    }
    let J = O ? SCt(K, O) : K;
    let Q = c.state === "failed" || c.state === "stopped" || !!C;
    let Z = {
      ...J,
      state: Q ? "starting" : c.state,
      reapedMidWorkAt: undefined,
      ...(O ? {
        inFlight: undefined
      } : {
        ...(!Q && c.tempo === "active" ? FI(c.state) || c.routine ? {
          tempo: "idle"
        } : {
          tempo: "blocked",
          needs: "send a prompt to start",
          ...(yut.includes(c.state) && {
            state: "working"
          })
        } : {
          tempo: Q ? "idle" : c.tempo
        }),
        detail: Q ? "" : c.detail,
        inFlight: {
          tasks: 0,
          queued: 0,
          kinds: []
        }
      }),
      ...(E ? {} : {
        firstTerminalAt: null
      }),
      daemonShort: j.short,
      queuedPrompt: undefined,
      updatedAt: new Date().toISOString(),
      backend: "daemon"
    };
    await ip(n, Z).catch(lf);
    Pe("job_respawn");
    return {
      ok: true,
      short: j.short,
      state: Z
    };
  }
  var zen;
  var lB;
  var CCt;
  var Frf;
  var xie;
  var Yen;
  var Urf;
  var _Ce = null;
  var wCt = null;
  var Dur = false;
  var Lur = __lazy(() => {
    Qen();
    vur();
    uP();
    gq();
    ln();
    Ot();
    q$();
    Kc();
    Jor();
    kS();
    vo();
    je();
    dt();
    lW();
    ZS();
    GL();
    TCt();
    zf();
    zen = require("crypto");
    lB = require("fs/promises");
    CCt = require("path");
    Frf = new Set([...$te, "AWS_CONFIG_FILE", "AWS_SHARED_CREDENTIALS_FILE", "AWS_PROFILE", "AWS_REGION", "AWS_DEFAULT_REGION", "GOOGLE_APPLICATION_CREDENTIALS", "GOOGLE_CLOUD_PROJECT", "GCLOUD_PROJECT", "CLAUDE_CONFIG_DIR"]);
    xie = Usc(CLAUDE_AGENT);
    Yen = [];
    Urf = {
      name: "exec",
      description: ""
    };
  });
  function zsc(e) {
    let t = [];
    let n = [];
    for (let r of etn(e.schedule)) {
      if (lU(r)) {
        n.push({
          type: "cron",
          expression: r
        });
      } else {
        t.push(`invalid cron expression "${r}" in schedule`);
      }
    }
    for (let r of e6o(e.on)) {
      let {
        trigger: o,
        warnings: s
      } = Brf(r);
      if (t.push(...s), o) {
        n.push(o);
      }
    }
    return {
      triggers: n,
      warnings: t
    };
  }
  function Brf(e) {
    if (typeof e === "string") {
      let t = e.trim();
      if (Gsc.test(t)) {
        return {
          trigger: Zen(t, []),
          warnings: []
        };
      }
      return Wrf(t);
    }
    if (ttn(e)) {
      let t = [];
      let n = typeof e.event === "string" ? e.event.trim() : "";
      if (!Gsc.test(n)) {
        return {
          trigger: null,
          warnings: [`invalid event "${n || "<missing>"}" in on: entry`]
        };
      }
      let r = [];
      let o = etn(e.branches);
      if (o.length > 0) {
        r.push({
          field: "ref",
          op: "in",
          values: o
        });
      }
      let s = etn(e.paths);
      if (s.length > 0) {
        r.push({
          field: "paths",
          op: "glob_any",
          values: s
        });
      }
      let i = etn(e.labels);
      if (i.length > 0) {
        r.push({
          field: "labels",
          op: "in",
          values: i
        });
      }
      if (typeof e.channel === "string" && e.channel.trim() !== "") {
        r.push({
          field: "channel",
          op: "eq",
          values: [Vrf(e.channel)]
        });
      }
      r.push(...$rf(e.where, t));
      for (let a of e6o(e.filter)) {
        let l = Grf(a);
        if (l) {
          r.push(l);
        }
      }
      return {
        trigger: Zen(n, r),
        warnings: t
      };
    }
    return {
      trigger: null,
      warnings: ["on: entry must be a string or {event: ...} mapping"]
    };
  }
  function $rf(e, t) {
    if (e === undefined) {
      return [];
    }
    if (Array.isArray(e)) {
      let n = [];
      for (let r of e) {
        if (!ttn(r) || Object.keys(r).length !== 1) {
          t.push("where: list element must be a single-field map {field: predicate}");
          continue;
        }
        n.push(...Vsc(r, t));
      }
      return n;
    }
    if (ttn(e)) {
      return Vsc(e, t);
    }
    t.push("where: must be a map of field\u2192predicate, or a list of single-field maps");
    return [];
  }
  function Vsc(e, t) {
    let n = [];
    for (let [r, o] of Object.entries(e)) {
      if (o === null || o === undefined) {
        t.push(`where: missing predicate for "${r}"`);
      } else if (Fur(o)) {
        n.push({
          field: r,
          op: "eq",
          values: [Uur(o)]
        });
      } else if (Array.isArray(o)) {
        if (o.length === 0) {
          t.push(`where: empty list for "${r}"`);
        } else if (o.every(Fur)) {
          n.push({
            field: r,
            op: "in",
            values: o.map(Uur)
          });
        } else {
          t.push(`where: list for "${r}" mixes scalars and objects; use {one_of: [...]} or an op object`);
        }
      } else if (ttn(o)) {
        let s = Object.keys(o);
        if (s.length === 0) {
          t.push(`where: empty predicate for "${r}"`);
        }
        for (let i of s) {
          let a = Hrf(r, i, o[i], t);
          if (a) {
            n.push(a);
          }
        }
      } else {
        t.push(`where: unsupported predicate for "${r}"`);
      }
    }
    return n;
  }
  function Hrf(e, t, n, r) {
    let o = t.toLowerCase();
    let s = Ksc[o];
    if (!s) {
      let i = jrf(o);
      r.push(`where: unknown op "${t}" on "${e}"${i ? ` (did you mean "${i}"?)` : ""}; valid ops: ${Ysc.join(", ")}`);
      return null;
    }
    if (s.list) {
      if (!Array.isArray(n)) {
        r.push(`where: "${t}" on "${e}" takes a list; use is/is_not for a single value`);
        return null;
      }
      if (n.length === 0) {
        r.push(`where: "${t}" on "${e}" needs at least one value`);
        return null;
      }
      if (!n.every(Fur)) {
        r.push(`where: "${t}" on "${e}" list must contain scalars`);
        return null;
      }
      return {
        field: e,
        op: s.op,
        values: n.map(Uur)
      };
    }
    if (Array.isArray(n)) {
      r.push(`where: "${t}" on "${e}" takes a single value; use one_of/none_of for a list`);
      return null;
    }
    if (!Fur(n)) {
      r.push(`where: "${t}" on "${e}" needs a scalar value`);
      return null;
    }
    return {
      field: e,
      op: s.op,
      values: [Uur(n)]
    };
  }
  function Fur(e) {
    return typeof e === "string" || typeof e === "number" || typeof e === "boolean";
  }
  function Uur(e) {
    return typeof e === "string" ? e : String(e);
  }
  function jrf(e) {
    let t;
    let n = 3;
    for (let r of Ysc) {
      let o = qrf(e, r);
      if (o < n) {
        n = o;
        t = r;
      }
    }
    return t;
  }
  function qrf(e, t) {
    let n = Array.from({
      length: t.length + 1
    }, (r, o) => o);
    for (let r = 1; r <= e.length; r++) {
      let o = n[0];
      n[0] = r;
      for (let s = 1; s <= t.length; s++) {
        let i = n[s];
        n[s] = Math.min(n[s] + 1, n[s - 1] + 1, o + (e[r - 1] === t[s - 1] ? 0 : 1));
        o = i;
      }
    }
    return n[t.length];
  }
  function Wrf(e) {
    let t = e.match(/^cron\(\s*(.+?)\s*\)$/);
    if (t) {
      let r = t[1];
      if (!lU(r)) {
        return {
          trigger: null,
          warnings: [`invalid cron expression in "${e}"`]
        };
      }
      return {
        trigger: {
          type: "cron",
          expression: r
        },
        warnings: [`deprecated 'on: ${e}'; use top-level 'schedule: "${r}"'`]
      };
    }
    if (e === "github:pull-request-opened") {
      return {
        trigger: Zen("github.pull_request.opened", []),
        warnings: [`deprecated 'on: ${e}'; use 'on: github.pull_request.opened'`]
      };
    }
    if (e === "github:pull-request-merged") {
      return {
        trigger: Zen("github.pull_request.merged", []),
        warnings: [`deprecated 'on: ${e}'; use 'on: github.pull_request.merged'`]
      };
    }
    let n = e.match(/^slack:new-message\(\s*channel\s*:\s*#?([^\s)]+)\s*\)$/);
    if (n) {
      let r = n[1];
      return {
        trigger: Zen("slack.message", [{
          field: "channel",
          op: "eq",
          values: [r]
        }]),
        warnings: [`deprecated 'on: ${e}'; use 'on: {event: slack.message, channel: ${r}}'`]
      };
    }
    return {
      trigger: null,
      warnings: [`invalid trigger "${e}"`]
    };
  }
  function Zen(e, t) {
    let n = e.indexOf(".");
    return {
      type: "event",
      provider: e.slice(0, n),
      event: e,
      filter: t
    };
  }
  function Grf(e) {
    if (!ttn(e)) {
      return null;
    }
    let t = typeof e.field === "string" ? e.field : "";
    let n = typeof e.op === "string" ? e.op : "";
    if (!t || !n) {
      return null;
    }
    return {
      field: t,
      op: n,
      values: etn(e.values)
    };
  }
  function Vrf(e) {
    let t = e.trim();
    return t.startsWith("#") ? t.slice(1) : t;
  }
  function ttn(e) {
    return typeof e === "object" && e !== null && !Array.isArray(e);
  }
  function e6o(e) {
    if (e === undefined || e === null) {
      return [];
    }
    return Array.isArray(e) ? e : [e];
  }
  function etn(e) {
    return e6o(e).map(t => typeof t === "string" ? t.trim() : "").filter(t => t !== "");
  }
  function zrf(e) {
    switch (e.type) {
      case "cron":
        return `cron(${e.expression})`;
      case "event":
        {
          let t = e.filter.find(n => n.field === "channel")?.values[0];
          return t ? `${e.event}#${t}` : e.event;
        }
    }
  }
  function Jsc(e) {
    return e.map(zrf).join(", ");
  }
  var Gsc;
  var Ksc;
  var Ysc;
  var Bur = __lazy(() => {
    vX();
    Gsc = /^[a-z][a-z0-9_]*(\.[a-z0-9_]+)+$/;
    Ksc = {
      is: {
        op: "eq",
        list: false
      },
      is_not: {
        op: "not_in",
        list: false
      },
      one_of: {
        op: "in",
        list: true
      },
      none_of: {
        op: "not_in",
        list: true
      },
      starts_with: {
        op: "starts_with",
        list: false
      },
      contains: {
        op: "contains",
        list: false
      },
      matches: {
        op: "matches",
        list: false
      },
      glob: {
        op: "glob",
        list: false
      },
      eq: {
        op: "eq",
        list: false
      },
      in: {
        op: "in",
        list: true
      },
      not_in: {
        op: "not_in",
        list: true
      }
    };
    Ysc = Object.keys(Ksc);
  });
  var Xsc;
  var a3T;
  var t6o = __lazy(() => {
    ln();
    je();
    fv();
    v9();
    Bur();
    Xsc = require("path");
    a3T = TEr(async function (e) {
      let t = await E9("routines", e);
      let n = [...t.filter(s => s.source !== "projectSettings" && s.source !== "policySettings"), ...t.filter(s => s.source === "projectSettings").sort(uvt), ...t.filter(s => s.source === "policySettings")];
      let r = new Map();
      let o = null;
      for (let s of n) {
        let i = zsc(s.frontmatter);
        for (let u of i.warnings) {
          logForDebugging(`[Routines] ${s.filePath}: ${u}`, {
            level: "warn"
          });
        }
        if (i.triggers.length === 0) {
          logForDebugging(`[Routines] skipping ${s.filePath}: no usable trigger (need at least one of: schedule, on)`, {
            level: "warn"
          });
          o ??= "routine_load_no_trigger";
          continue;
        }
        let a = Xsc.basename(s.filePath, ".md");
        let l = s.frontmatter.name;
        let c = typeof l === "string" && l.trim() !== "" ? l.trim() : a;
        if (c.startsWith("-")) {
          logForDebugging(`[Routines] skipping ${s.filePath}: name '${c}' must not start with '-'`, {
            level: "error"
          });
          o = "routine_load_invalid_name";
          continue;
        }
        r.set(c, {
          name: c,
          description: M2(s.frontmatter.description, c) ?? undefined,
          triggers: i.triggers,
          body: s.content.trim(),
          source: s.source,
          filePath: s.filePath
        });
      }
      if (o !== null) {
        Et("routine_load", o);
      } else {
        Pe("routine_load");
      }
      return Array.from(r.values());
    });
  });
  async function s6o(e, t = false, n = Date.now()) {
    let r = o6o;
    if (!r) {
      n6o ??= (e.source === "shell" ? Wen() : M5({
        forceTransient: true
      })).finally(() => {
        n6o = null;
      });
      let s = await n6o;
      if (!s.ok) {
        r6o("daemon-unreachable", s.reason, e.source, n);
        return {
          ok: false,
          reason: "daemon-unreachable",
          detail: s.reason
        };
      }
    }
    let o = $ir("cli-bg-dispatch");
    try {
      let s = fYe();
      let i = eic.join(s, `${e.short}.json`);
      let a = "ack-timeout";
      let l = "no ack";
      let c = Zsc.randomBytes(4).toString("hex");
      for (let u = 0; u < 3; u++) {
        if (r) {
          let m = await CT({
            proto: 1,
            op: "dispatch",
            d: {
              ...e,
              nonce: c
            },
            timeoutMs: 5000,
            auth: await Ofe()
          }, {
            timeoutMs: 6000
          });
          if (m.ok && m.op === "dispatch") {
            return Qsc(e, m.pid, m.messagingSock, n, m.via);
          }
          if ("code" in m && m.code === "EALIVE") {
            r6o("short-alive", m.error, e.source, n);
            return {
              ok: false,
              reason: "short-alive",
              detail: m.error,
              nonce: c
            };
          }
          if ("code" in m && m.code === "ESTALE") {
            if (a = "stale-short", l = m.error, u < 2) {
              logForDebugging(`bg: stale handle for ${e.short}, retrying dispatch (${u + 1}/2)`);
              continue;
            }
            break;
          }
          logForDebugging(`bg: socket dispatch fell through (${"code" in m ? m.code : "?"}), using file path`);
        }
        try {
          let m = De({
            ...e,
            nonce: c
          });
          await Fm(i, m, 384).catch(async f => {
            if (!fn(f)) {
              throw f;
            }
            await $ur.mkdir(s, {
              recursive: true,
              mode: 448
            });
            await Fm(i, m, 384);
          });
        } catch (m) {
          a = "dispatch-write";
          l = he(m);
          break;
        }
        let d = await CT({
          proto: 1,
          op: "await-ack",
          short: e.short,
          nonce: c,
          timeoutMs: 5000
        }, {
          timeoutMs: 6000
        });
        for (let m = 0; !d.ok && d.code === "ESTARTING" && m < 40; m++) {
          await sleep(200);
          d = await CT({
            proto: 1,
            op: "await-ack",
            short: e.short,
            nonce: c,
            timeoutMs: 5000
          }, {
            timeoutMs: 6000
          });
        }
        if (d.ok && d.op === "await-ack") {
          return Qsc(e, d.pid, d.messagingSock, n, d.via);
        }
        await $ur.unlink(i).catch(() => {});
        let p = "code" in d ? d.code : undefined;
        if (p === "EALIVE") {
          a = "short-alive";
        } else if (p === "ESTALE") {
          a = "stale-short";
        } else if (p === "ENOCONN") {
          a = "enoconn";
        } else if (p === "ESTARTING") {
          a = "estarting";
        } else {
          a = "ack-timeout";
        }
        if (l = p ? `${p}: ${"error" in d ? d.error : "no ack"}` : "error" in d ? d.error : "no ack", u === 2 || a !== "stale-short" && a !== "ack-timeout") {
          break;
        }
        logForDebugging(`bg: ${a} for ${e.short}, retrying dispatch (${u + 1}/2)`);
      }
      if (!t && (a === "enoconn" || a === "estarting")) {
        o6o = false;
        return await s6o(e, true, n);
      }
      r6o(a, l, e.source, n);
      logForDebugging(`bg: daemon dispatch fallback (${a}): ${l}`, {
        level: "warn"
      });
      return {
        ok: false,
        reason: a,
        detail: l,
        nonce: c
      };
    } finally {
      o();
    }
  }
  function Qsc(e, t, n, r, o) {
    o6o = true;
    logEvent("tengu_bg_dispatch", {
      backend_daemon: true,
      source_shell: e.source === "shell",
      source_slash: e.source === "slash",
      source_fleet: e.source === "fleet",
      source_spare: e.source === "spare",
      source_respawn: e.source === "respawn",
      has_worktree: e.worktree !== undefined,
      has_agent: e.agent !== undefined,
      ms: Date.now() - r,
      via: o == null ? undefined : o
    });
    return {
      ok: true,
      pid: t,
      messagingSock: n
    };
  }
  function r6o(e, t, n, r) {
    let o = Wt();
    let s = [...t.matchAll(/\bE[A-Z]{2,14}\b/g)].filter(a => !"/\\".includes(t[a.index - 1] ?? ".")).map(a => a[0]);
    let i = s.length > 0 ? s.join(",") : /[\\/]/.test(t) ? "<path-bearing>" : t.slice(0, 80);
    logEvent("tengu_bg_dispatch_fallback", {
      ms: Date.now() - r,
      reason_unreachable: e === "daemon-unreachable",
      reason_ack_timeout: e === "ack-timeout",
      reason_write: e === "dispatch-write",
      reason_enoconn: e === "enoconn",
      reason_estarting: e === "estarting",
      reason_stale_short: e === "stale-short",
      reason_short_alive: e === "short-alive",
      platform_darwin: o === "macos",
      platform_linux: o === "linux",
      platform_windows: o === "windows",
      source_spare: n === "spare",
      source_respawn: n === "respawn",
      detail: i
    });
  }
  var Zsc;
  var $ur;
  var eic;
  var o6o = false;
  var n6o = null;
  var tic = __lazy(() => {
    $5o();
    Mfe();
    aJe();
    uP();
    pL();
    Ot();
    BT();
    je();
    dt();
    Cs();
    Zsc = require("crypto");
    $ur = require("fs/promises");
    eic = require("path");
  });
  function pJe(e) {
    console.error(_$u.red(e));
  }
  function Es(e) {
    if (e) {
      pJe(e);
    }
    setBgExitCause("cli_error");
    process.exit(1);
    return;
  }
  function W0(e) {
    if (e) {
      process.stdout.write(e + `
`);
    }
    process.exit(0);
    return;
  }
  async function F5(e) {
    await new Promise(t => {
      process.stdout.write(e, () => t());
    });
  }
  function Y3(e) {
    process.stderr.write(_$u.yellow(e) + `
`);
  }
  async function i6o() {
    let {
      flushAnalyticsSinks: e
    } = await Promise.resolve().then(() => (lm(), NGt));
    await e();
  }
  async function bR(e) {
    await i6o();
    process.exit(e);
    return;
  }
  async function Ih(e) {
    await i6o();
    return Es(e);
  }
  async function U5(e) {
    if (e) {
      process.stdout.write(e + `
`);
    }
    await i6o();
    return W0();
  }
  var SL = __lazy(() => {
    M7();
  });
  var dic = {};
  __export(dic, {
    withStdinPositional: () => withStdinPositional,
    stripSessionIdFlag: () => stripSessionIdFlag,
    stripResumeFlags: () => stripResumeFlags,
    stripBgFlags: () => stripBgFlags,
    stopHandler: () => stopHandler,
    spawnBgSession: () => spawnBgSession,
    shouldOpenAgentsViewOnDetach: () => shouldOpenAgentsViewOnDetach,
    rmHandler: () => rmHandler,
    respawnHandler: () => respawnHandler,
    readBgStdin: () => readBgStdin,
    preSeedReplBgJob: () => preSeedReplBgJob,
    parseResumeTarget: () => parseResumeTarget,
    logsHandler: () => logsHandler,
    handleBgFlag: () => handleBgFlag,
    formatBgHints: () => formatBgHints,
    flagsWithoutPositional: () => flagsWithoutPositional,
    detailForStderr: () => detailForStderr,
    bgVerbExtraArgsNote: () => bgVerbExtraArgsNote,
    attachHandler: () => attachHandler
  });
  function Yrf(e) {
    Xhn();
    return Me.SHELL ? {
      cmd: Me.SHELL,
      args: ["-c", e]
    } : Wt() === "windows" ? {
      cmd: Me.COMSPEC || "cmd.exe",
      args: ["/d", "/s", "/c", e]
    } : {
      cmd: "/bin/sh",
      args: ["-c", e]
    };
  }
  async function preSeedReplBgJob(e, t) {
    let n = e.slice(0, 8);
    let r = dc(n);
    await EK.mkdir(u6o.join(r, "tmp"), {
      recursive: true
    });
    let o = t.intent ?? "";
    if (await ip(r, Uue({
      template: {
        name: "bg",
        description: ""
      },
      intent: o,
      name: t.name,
      nameSource: t.nameSource,
      detail: t.detail ?? but,
      tempo: "blocked",
      needs: "send a prompt to start",
      sessionId: e,
      cwd: t.cwd,
      worktreePath: t.worktree?.path,
      worktreeBranch: t.worktree?.branch,
      worktreeHookBased: t.worktree?.hookBased,
      originCwd: t.worktree?.originCwd,
      bgIsolation: "none",
      providerEnv: uic(),
      sessionPermissionRules: t.sessionPermissionRules,
      memoryToggledOff: t.memoryToggledOff
    })), Me.CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST) {
      await EK.mkdir(tZt(), {
        recursive: true,
        mode: 448
      });
      await EK.writeFile(Dfe(n), "");
    }
    return {
      short: n,
      jobDir: r
    };
  }
  async function spawnBgSession(e, t, n = "shell", r, o, s, i) {
    let a = sof(e);
    if (a) {
      return {
        ok: false,
        error: a,
        reason: "gate_blocked"
      };
    }
    let l = t ?? nic.randomUUID();
    let c = i ?? l.slice(0, 8);
    let u = dc(c);
    try {
      await EK.mkdir(u6o.join(u, "tmp"), {
        recursive: true
      });
      return await Jrf(e, n, r, o, s, {
        sessionId: l,
        short: c,
        jobDir: u,
        freshDir: t === undefined
      });
    } catch (d) {
      if (n !== "fleet" && n !== "spare") {
        await EK.rm(u, {
          recursive: true,
          force: true
        }).catch(() => {});
      }
      return {
        ok: false,
        error: `Couldn't start the session \u2014 ${he(d)}`,
        reason: `spawn_failed_${gd(d) ?? U4(d) ?? "unknown"}`
      };
    }
  }
  async function Jrf(e, t, n, r, o, s) {
    let {
      sessionId: i,
      short: a,
      jobDir: l,
      freshDir: c
    } = s;
    let u = ACt(e);
    let d = u >= 0 ? e.slice(0, u) : e;
    let p = Hur(d, "--agent");
    let m = undefined;
    let f = Hur(d, "--name", "-n");
    let h = f ?? r?.name;
    let g = parseResumeTarget(d);
    let y = u >= 0 ? e.slice(u + 1).join(" ") : iof(e, g);
    let _ = vK(d);
    let b = d.some((V, K) => {
      if (_.vZc(K)) {
        return false;
      }
      if (V === "--continue" || V === "--resume" || V.startsWith("--resume=")) {
        return true;
      }
      let {
        peeled: J,
        rest: Q
      } = bCe(V);
      return J.includes("-c") || Q === "-c" || Q === "-r" || /^-r./.test(Q);
    });
    let S = d.some((V, K) => !_.vZc(K) && V === "--fork-session");
    let E = stripResumeFlags(d);
    let C = t === "repl" ? "none" : r?.bgIsolation;
    let x = r?.providerEnv ?? uic();
    let A = r?.sessionPermissionRules;
    let k = r?.memoryToggledOff;
    let I = oOe(u >= 0 ? E : flagsWithoutPositional(E));
    if (t === "shell") {
      let V = n ?? Nt();
      let K = aV(E);
      let J = [...E.filter((Q, Z) => K[Z] !== Q), ...(ate(V) ? [V] : []), ...(r?.exec && ate(r.exec) ? [r.exec] : []), ...(g !== undefined && ate(g) ? [g] : [])];
      if (J.length > 0) {
        process.stderr.write(`warning: background sessions do not support Windows network (UNC) paths; the following will be neutralized: ${J.join(", ")}
`);
      }
    }
    let O = g !== undefined && g === i;
    let M = b && !S ? ["--fork-session"] : [];
    let L = O ? [] : ["--session-id", i, ...M];
    if (t === "shell" && d.some((V, K) => !_.vZc(K) && (V === "--session-id" || V.startsWith("--session-id=")))) {
      process.stderr.write(`warning: --bg manages the session id; ignoring --session-id (use --resume <id> to continue an existing session)
`);
    }
    let P = p ? (await getAgentDefinitionsWithOverrides(n ?? Nt())).activeAgents.find(V => V.agentType === p) : undefined;
    if (p && !P && t === "shell") {
      process.stderr.write(`warning: no agent named '${p}' \u2014 spawning with default template
`);
    }
    let F = undefined;
    let H = r?.intent ?? y ?? "";
    let U = !P?.initialPrompt && !r?.exec && !y && !d.some((V, K) => !_.vZc(K) && V === "--reply-on-resume");
    let N = false;
    let W;
    if (t !== "fleet" && t !== "spare") {
      let V = c ? null : await Zi(l);
      if (V === null) {
        W = ip(l, Uue({
          template: {
            name: r?.exec ? "exec" : p ?? undefined ?? "bg",
            description: P?.whenToUse ?? F?.description ?? "",
            initialPrompt: P?.initialPrompt,
            color: P?.color
          },
          routine: undefined,
          respawnFlags: I,
          intent: H,
          name: h,
          nameSource: f ? "user" : r?.nameSource,
          detail: r?.detail ?? (U ? F ? `(idle \u2014 waiting for ${Jsc(F.triggers)})` : but : undefined),
          tempo: U ? F ? "idle" : "blocked" : undefined,
          needs: U && !F ? "send a prompt to start" : undefined,
          sessionId: i,
          cwd: n ?? Nt(),
          worktreePath: r?.worktree?.path,
          worktreeBranch: r?.worktree?.branch,
          worktreeHookBased: r?.worktree?.hookBased,
          originCwd: r?.worktree?.originCwd,
          bgIsolation: C,
          providerEnv: x,
          sessionPermissionRules: A,
          memoryToggledOff: k
        })).then(() => {
          N = true;
        }).catch(K => logForDebugging(`bg seed state write failed: ${he(K)}`, {
          level: "warn"
        }));
      } else if (I.length > 0 && V.respawnFlags.length === 0) {
        W = ip(l, {
          ...V,
          respawnFlags: I
        }).catch(K => logForDebugging(`bg respawnFlags patch failed: ${he(K)}`, {
          level: "warn"
        }));
      }
    }
    let j = {
      proto: 1,
      short: a,
      sessionId: i,
      createdAt: Date.now(),
      source: t === "repl" ? "slash" : t,
      cwd: n ?? Nt(),
      launch: r?.exec ? {
        mode: "exec",
        ...Yrf(r.exec)
      } : b && g !== undefined ? {
        mode: "resume",
        sessionId: g,
        transcriptPath: r?.resumeTranscriptPath,
        fork: !O && (S || M.length > 0),
        flagArgs: [...E, ...(u >= 0 ? e.slice(u) : [])]
      } : {
        mode: "prompt",
        args: [...L, ...stripSessionIdFlag(e)]
      },
      respawnFlags: E,
      env: {
        ...x,
        ...(st(x.CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST) && Me.CLAUDE_CODE_HOST_CREDS_FILE && {
          CLAUDE_CODE_HOST_CREDS_FILE: Me.CLAUDE_CODE_HOST_CREDS_FILE
        }),
        ...(C && {
          CLAUDE_BG_ISOLATION: C
        }),
        ...(A && {
          CLAUDE_BG_SESSION_PERMISSION_RULES: JSON.stringify(A)
        }),
        ...(k && {
          CLAUDE_BG_MEMORY_TOGGLED_OFF: "1"
        })
      },
      reattachEnv: o,
      worktree: r?.worktree ? {
        path: r.worktree.path,
        ownershipToken: i
      } : undefined,
      isolation: P?.isolation === "worktree" && P.source !== "built-in" ? "worktree" : "none",
      agent: p,
      routine: undefined,
      seed: {
        intent: H,
        name: h
      },
      cols: process.stdout.columns || undefined,
      rows: process.stdout.rows || undefined
    };
    let [, z] = await Promise.all([W ?? Promise.resolve(), s6o(j)]);
    if (z.ok) {
      return {
        ok: true,
        short: a,
        sessionId: i,
        idle: U,
        name: h
      };
    }
    if (z.reason === "ack-timeout" || z.reason === "enoconn" || z.reason === "estarting") {
      let V = await CT({
        proto: 1,
        op: "list"
      });
      if (V.ok && V.op === "list" && V.jobs.some(K => K.short === a && K.nonce === z.nonce && !K.outcome)) {
        logForDebugging(`bg: daemon dispatch ${z.reason} but worker is live`, {
          level: "warn"
        });
        await logEventAsync("tengu_bg_dispatch_rescued", {
          reason_ack_timeout: z.reason === "ack-timeout",
          reason_enoconn: z.reason === "enoconn",
          reason_estarting: z.reason === "estarting"
        });
        return {
          ok: true,
          short: a,
          sessionId: i,
          idle: U,
          name: h,
          rescued: true
        };
      }
      if (z.reason === "ack-timeout" && V.ok && V.op === "list" && !V.jobs.some(K => K.short === a)) {
        let K = await CT({
          proto: 1,
          op: "dispatch",
          d: {
            ...j,
            nonce: z.nonce
          },
          timeoutMs: 5000,
          auth: await Ofe()
        }, {
          timeoutMs: 6000
        });
        if (K.ok && K.op === "dispatch") {
          logForDebugging(`bg: ack-timeout recovered via redispatch (${a})`, {
            level: "warn"
          });
          await logEventAsync("tengu_bg_dispatch_rescued", {
            reason_ack_timeout: true,
            reason_enoconn: false,
            reason_estarting: false,
            via_redispatch: true
          });
          return {
            ok: true,
            short: a,
            sessionId: i,
            idle: U,
            name: h,
            rescued: true
          };
        }
      }
    }
    if (N) {
      await EK.rm(l, {
        recursive: true,
        force: true
      }).catch(() => {});
    }
    if (z.reason === "short-alive") {
      return {
        ok: false,
        alive: true,
        short: a,
        error: `Session ${a} is already running \u2014 \`claude attach ${a}\` to join it`,
        reason: "short_alive"
      };
    }
    if (z.reason === "stale-short") {
      return {
        ok: false,
        error: "Previous session is still shutting down \u2014 try again in a moment",
        reason: "stale_short"
      };
    }
    return {
      ok: false,
      error: `Couldn't reach the ${bgSupervisorNoun()} (${Qrf(z.reason)})${daemonHint("status")}`,
      reason: z.reason === "daemon-unreachable" ? "daemon_unavailable" : z.reason.replace(/-/g, "_")
    };
  }
  async function handleBgFlag(e) {
    let t = ACt(e);
    let n = t >= 0 ? e.slice(0, t) : e;
    let r = vK(n);
    let o = n.findIndex((l, c) => !r.vZc(c) && (l === "--exec" || l.startsWith("--exec=")));
    if (o !== -1) {
      let l = e[o].includes("=") ? e[o].slice(e[o].indexOf("=") + 1) : undefined;
      let c = l ?? e.slice(o + 1).join(" ");
      if (!c.trim()) {
        process.stderr.write(`--exec requires a command.
`);
        process.exitCode = 1;
        return;
      }
      let u = stripBgFlags([...e.slice(0, o), ...(l !== undefined ? e.slice(o + 1) : [])]);
      let d = Hur(u, "--name", "-n");
      let p = vK(u);
      let m = ACt(u);
      let f = m >= 0 ? u.slice(0, m) : u;
      let h = f.filter((_, b) => !p.vZc(b));
      if (j5o(h)) {
        process.stderr.write(`${H5o(u)}
`);
        process.exitCode = 1;
        return;
      }
      let g = f.filter((_, b) => !p.vZc(b) && kie(_) && !/^(-n|--name)(=|$)/.test(_) && !/^-n./.test(_));
      if (g.length > 0) {
        process.stderr.write(`warning: --exec ignores ${g.join(" ")} (only --name composes)
`);
      }
      let y = await spawnBgSession([], undefined, "shell", undefined, {
        intent: c,
        exec: c,
        ...(d && {
          name: d,
          nameSource: "user"
        })
      });
      if (!y.ok) {
        await ou("cli_bg_dispatch_exec", y.reason ?? "spawn_failed");
        process.stderr.write(`${y.error}
`);
        process.exitCode = 1;
        return;
      }
      await nS("cli_bg_dispatch_exec");
      process.stdout.write(formatBgHints(y.short, undefined, d || c) + `
`);
      return;
    }
    let s = stripBgFlags(e);
    let i = await readBgStdin();
    let a = await spawnBgSession(i ? withStdinPositional(s, i) : s);
    if (!a.ok) {
      await (a.reason === "gate_blocked" ? GB : ou)("cli_bg_dispatch", a.reason ?? "spawn_failed");
      process.stderr.write(`${a.error}
`);
      process.exitCode = 1;
      return;
    }
    if (a.rescued) {
      await GB("cli_bg_dispatch", "rescued");
    } else {
      await nS("cli_bg_dispatch");
    }
    process.stdout.write(formatBgHints(a.short, a.idle ? but : undefined, a.name) + `
`);
  }
  async function readBgStdin(e = process.stdin) {
    if (e.isTTY) {
      return "";
    }
    e.setEncoding("utf8");
    let t = "";
    let n = false;
    let r = s => {
      if (n) {
        return;
      }
      if (t.length + s.length > 1048576) {
        t += s.slice(0, 1048576 - t.length);
        n = true;
        return;
      }
      t += s;
    };
    e.on("data", r);
    let o = await peekForStdinData(e, 3000);
    if (e.off("data", r), o) {
      return "";
    }
    if (n) {
      process.stderr.write(`warning: piped stdin exceeds ${1048576} bytes, truncated
`);
    }
    return t.replace(/\r?\n$/, "");
  }
  function withStdinPositional(e, t) {
    let n = ACt(e);
    if (n >= 0) {
      let s = e.slice(n + 1).join(" ");
      return [...e.slice(0, n), "--", s ? `${s}
${t}` : t];
    }
    let r = vK(e);
    let o = -1;
    for (let s = 0; s < e.length; s++) {
      if (r.vZc(s)) {
        continue;
      }
      let i = e[s];
      if (kie(i)) {
        if (i.includes("=")) {
          continue;
        }
        let a = e[s + 1];
        if (a === undefined) {
          continue;
        }
        let {
          rest: l
        } = bCe(i);
        if (i === "--resume" || l === "-r") {
          if (!kie(a)) {
            s++;
          }
          continue;
        }
        if (l.length > 2 && (/^-r./.test(l) || TG.vZc(l.slice(0, 2)))) {
          continue;
        }
        if ($jt.vZc(i) && i !== "--remote-control" && i !== "--rc" || mFn.vZc(l)) {
          continue;
        }
        if (!r.vZc(s + 1) && !kie(a)) {
          s++;
        }
        continue;
      }
      o = s;
    }
    if (o >= 0) {
      let s = [...e];
      s[o] = `${e[o]}
${t}`;
      return s;
    }
    return [...e, "--", t];
  }
  function Qrf(e) {
    switch (e) {
      case "daemon-unreachable":
        return "not running";
      case "ack-timeout":
        return "timed out";
      case "dispatch-write":
        return "couldn't write dispatch file";
      case "enoconn":
        return "socket missing";
      case "estarting":
        return "service still starting";
      case "stale-short":
        return "id collision with a prior job";
    }
  }
  function formatBgHints(e, t, n) {
    let r = (o, s) => _$u.dim("  " + o.padEnd(26) + s);
    return [`backgrounded \xB7 ${_$u.cyan(e)}${n ? ` \xB7 ${n}` : ""}${t ? _$u.dim(` ${t}`) : ""}`, r("claude agents", "list sessions"), r(`claude attach ${e}`, "open in this terminal"), r(`claude logs ${e}`, "show recent output"), r(`claude stop ${e}`, "stop this session")].join(`
`);
  }
  function bgVerbExtraArgsNote(e) {
    let t = new Set(["logs", "attach", "stop", "kill", "respawn", "rm"]);
    if (e.length <= 2 || !e[0] || !t.vZc(e[0])) {
      return null;
    }
    let n = [];
    for (let r = 2; r < e.length; r++) {
      let o = e[r];
      if (o === "--debug" || o === "-d" || o === "--debug-to-stderr" || o === "-d2e" || o.startsWith("--debug=") || o.startsWith("--debug-file=")) {
        continue;
      }
      if (o === "--debug-file" && r + 1 < e.length) {
        r++;
        continue;
      }
      n.push(o);
    }
    if (n.length === 0) {
      return null;
    }
    return `warning: extra arguments ignored: ${n.join(" ")}
`;
  }
  function p6o() {
    let e = bgVerbExtraArgsNote(process.argv.slice(2));
    if (e) {
      process.stderr.write(e);
    }
  }
  async function m6o(e, t, n) {
    if (p6o(), e === "--help" || e === "-h") {
      process.stdout.write(`Usage: ${t}

  ${n}
`);
      process.exit(0);
    }
    if (e?.startsWith("-")) {
      process.stderr.write(`unknown option '${e}'
Usage: ${t}
`);
      process.exit(1);
    }
    if (!e) {
      process.stderr.write(`Usage: ${t}
`);
      process.exit(1);
    }
    let o = (await EK.readdir(fO()).catch(() => [])).filter(s => zFe.test(s)).filter(s => s.startsWith(e));
    if (o.length === 1) {
      return o[0];
    }
    process.stderr.write(o.length === 0 ? `No job matching '${e}'. Run 'claude agents' to list running sessions.
` : `Ambiguous prefix '${e}', matches: ${o.join(", ")}
`);
    process.exit(1);
  }
  async function logsHandler(e) {
    let t = await m6o(e, "claude logs <id>", "Print the background session's recent terminal output.");
    let n = await new Promise(r => {
      let o = WWl(t, 500, s => {
        if (s.type === "snapshot") {
          o();
          r(s.streamTail);
        }
      }, s => {
        o();
        r(s);
      });
    });