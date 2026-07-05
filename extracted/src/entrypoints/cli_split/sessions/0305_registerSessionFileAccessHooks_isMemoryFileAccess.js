  __export(B5a, {
    registerSessionFileAccessHooks: () => registerSessionFileAccessHooks,
    isMemoryFileAccess: () => isMemoryFileAccess
  });
  function U5a(e, t) {
    switch (e) {
      case "Read":
        {
          let n = iy.inputSchema.safeParse(t);
          return n.success ? n.data.file_path : null;
        }
      case "Edit":
        {
          let n = z3n().safeParse(t);
          return n.success ? n.data.file_path : null;
        }
      case "Write":
        {
          let n = Nw.inputSchema.safeParse(t);
          return n.success ? n.data.file_path : null;
        }
      default:
        return null;
    }
  }
  function A5p(e, t) {
    switch (e) {
      case "Read":
        {
          let n = iy.inputSchema.safeParse(t);
          if (!n.success) {
            return null;
          }
          return E6t(n.data.file_path);
        }
      case "Grep":
        {
          let n = $$.inputSchema.safeParse(t);
          if (!n.success) {
            return null;
          }
          if (n.data.path) {
            let r = E6t(n.data.path);
            if (r) {
              return r;
            }
          }
          if (n.data.glob) {
            let r = z9n(n.data.glob);
            if (r) {
              return r;
            }
          }
          return null;
        }
      case "Glob":
        {
          let n = cz.inputSchema.safeParse(t);
          if (!n.success) {
            return null;
          }
          if (n.data.path) {
            let o = E6t(n.data.path);
            if (o) {
              return o;
            }
          }
          let r = z9n(n.data.pattern);
          if (r) {
            return r;
          }
          return null;
        }
      default:
        return null;
    }
  }
  function isMemoryFileAccess(e, t) {
    let n = U5a(e, t);
    if (n && (y8e(n) || OJ(n))) {
      return true;
    }
    return false;
  }
  async function I5p(e, t, n) {
    if (e.hook_event_name !== "PostToolUse") {
      return {};
    }
    let r = A5p(e.tool_name, e.tool_input);
    let o = MLt.getStore();
    let s = o ? RWr(o) : undefined;
    let i = s ? {
      subagent_name: s
    } : {};
    if (r === "session_transcript") {
      logEvent("tengu_transcript_accessed", {
        ...i
      });
    }
    let a = U5a(e.tool_name, e.tool_input);
    if (a && y8e(a)) {
      switch (logEvent("tengu_memdir_accessed", {
        tool: e.tool_name,
        ...i
      }), e.tool_name) {
        case "Read":
          logEvent("tengu_memdir_file_read", {
            ...i
          });
          break;
        case "Edit":
          logEvent("tengu_memdir_file_edit", {
            ...i
          });
          notifyMemoryWrite(a);
          break;
        case "Write":
          logEvent("tengu_memdir_file_write", {
            ...i
          });
          notifyMemoryWrite(a);
          break;
      }
    }
    if (a && OJ(a)) {
      switch (logEvent("tengu_team_mem_accessed", {
        tool: e.tool_name,
        ...i
      }), e.tool_name) {
        case "Read":
          logEvent("tengu_team_mem_file_read", {
            ...i
          });
          break;
        case "Edit":
          logEvent("tengu_team_mem_file_edit", {
            ...i
          });
          break;
        case "Write":
          logEvent("tengu_team_mem_file_write", {
            ...i
          });
          break;
      }
    }
    if (a && (e.tool_name === "Edit" || e.tool_name === "Write") && OJ(a)) {
      let l = await hMa(a, pw());
      if (l !== null) {
        logEvent("tengu_team_mem_prompt_index_near_cap", {
          ...i
        });
        return {
          hookSpecificOutput: {
            hookEventName: "PostToolUse",
            additionalContext: l
          }
        };
      }
    }
    if (a && (e.tool_name === "Edit" || e.tool_name === "Write")) {
      let l = await pMa(a);
      if (l !== null) {
        logEvent("tengu_memdir_entrypoint_near_cap", {
          ...i
        });
        return {
          hookSpecificOutput: {
            hookEventName: "PostToolUse",
            additionalContext: l
          }
        };
      }
    }
    return {};
  }
  function registerSessionFileAccessHooks() {
    let e = {
      type: "callback",
      callback: I5p,
      timeout: 1,
      internal: true
    };
    registerHookCallbacks({
      PostToolUse: [{
        matcher: "Read",
        hooks: [e]
      }, {
        matcher: "Grep",
        hooks: [e]
      }, {
        matcher: "Glob",
        hooks: [e]
      }, {
        matcher: "Edit",
        hooks: [e]
      }, {
        matcher: "Write",
        hooks: [e]
      }]
    });
  }
  var zvo = __lazy(() => {
    at();
    a1();
    Ot();
    mMa();
    gMa();
    V3n();
    Ay();
    i9t();
    LEe();
    Tm();
    DEe();
    mx();
    ogt();
    Fk();
    DNe();
    _x();
    sgt();
    _h();
  });
  var NNe = __lazy(() => {
    HG();
    gn();
  });
  function j5a() {
    if (Me.CLAUDE_CODE_SUPPRESS_SESSION_ATTRIBUTION) {
      return null;
    }
    if (getInitialSettings().attribution?.sessionUrl === false) {
      return null;
    }
    if (getClientType() === "remote") {
      let e = process.env.CLAUDE_CODE_REMOTE_SESSION_ID;
      if (!e) {
        return null;
      }
      let t = process.env.SESSION_INGRESS_URL;
      if (QGt(e, t)) {
        return null;
      }
      return wS(e, t);
    }
    if (isReplBridgeActive()) {
      let e = vS();
      if (!e || e.outboundOnly) {
        return null;
      }
      if (QGt(e.bridgeSessionId, e.sessionIngressUrl)) {
        return null;
      }
      return wS(e.bridgeSessionId, e.sessionIngressUrl);
    }
    return null;
  }
  function O5p(e, t) {
    return {
      commit: e.commit ? `${e.commit}
Claude-Session: ${t}` : `Claude-Session: ${t}`,
      pr: e.pr ? `${e.pr}

${t}` : t
    };
  }
  function b8e() {
    let e = D5p();
    let t = j5a();
    return t ? O5p(e, t) : e;
  }
  function D5p() {
    let e = getMainLoopModel();
    let t = isFableFamilyOrPinnedModel(e) ? getPublicModelName(mqe.firstParty) : q5a(e) ? getPublicModelName(e) : "Claude";
    let n = `\uD83E\uDD16 Generated with [Claude Code](${"https://claude.com/claude-code"})`;
    let r = `Co-Authored-By: ${t} <noreply@anthropic.com>`;
    let o = getInitialSettings();
    let s = o.attribution;
    if (s && (s.commit !== undefined || s.pr !== undefined)) {
      return {
        commit: s.commit ?? r,
        pr: s.pr ?? n
      };
    }
    if (o.includeCoAuthoredBy === false) {
      return {
        commit: "",
        pr: ""
      };
    }
    return {
      commit: r,
      pr: n
    };
  }
  function q5a(e) {
    if (getPublicModelDisplayName(e) === null) {
      return false;
    }
    let t = kot(e);
    if (t !== e && Object.hasOwn(Rot, t)) {
      return true;
    }
    let n = getCanonicalName(e);
    let r = normalizeModelStringForAPI(e).toLowerCase();
    let o = r.indexOf(n);
    let s = n.length;
    if (o === -1 && n.endsWith("-0")) {
      let u = n.slice(0, -2);
      o = r.indexOf(u);
      s = u.length;
    }
    if (o === -1) {
      if (!e.includes("application-inference-profile")) {
        return false;
      }
      let u = getInferenceProfileBackingModelCached(normalizeModelStringForAPI(e));
      return !!u && q5a(u);
    }
    let i = r.slice(0, o);
    let a = r.slice(o + s);
    let l = i === "" || /[./]$/.test(i);
    let c = /^(?:-fast|-latest)?(?:-v\d+@\d{8}|[-@]\d{8})?(?:-v\d+(?::\d+)?)?$/.test(a);
    return l && c;
  }
  function $5a(e) {
    for (let t of bTs) {
      if (e.includes(`<${t}>`)) {
        return true;
      }
    }
    return false;
  }
  function M5p(e) {
    let t = 0;
    for (let n of e) {
      if (n.type !== "user") {
        continue;
      }
      let r = n.message?.content;
      if (!r) {
        continue;
      }
      let o = false;
      if (typeof r === "string") {
        if ($5a(r)) {
          continue;
        }
        o = r.trim().length > 0;
      } else if (Array.isArray(r)) {
        o = r.some(s => {
          if (!s || typeof s !== "object" || !("type" in s)) {
            return false;
          }
          return s.type === "text" && typeof s.text === "string" && !$5a(s.text) || s.type === "image" || s.type === "document";
        });
      }
      if (o) {
        t++;
      }
    }
    return t;
  }
  function N5p(e) {
    let t = e.filter(n => n.type === "user" && !("isSidechain" in n && n.isSidechain) && !("isMeta" in n && n.isMeta) && !("isCompactSummary" in n && n.isCompactSummary));
    return M5p(t);
  }
  async function L5p(e) {
    let t = e.attribution;
    if (!t) {
      return null;
    }
    let n = t.fileStates;
    let o = n instanceof Map ? Array.from(n.keys()) : Object.keys(n);
    if (o.length === 0) {
      return null;
    }
    try {
      return await rho([t], o);
    } catch (s) {
      Oe(s);
      return null;
    }
  }
  function U5p(e) {
    let t = 0;
    for (let n of e) {
      if (n.type !== "assistant") {
        continue;
      }
      let r = n.message?.content;
      if (!Array.isArray(r)) {
        continue;
      }
      for (let o of r) {
        if (o.type !== "tool_use" || !F5p.vZc(o.name)) {
          continue;
        }
        if (isMemoryFileAccess(o.name, o.input)) {
          t++;
        }
      }
    }
    return t;
  }
  async function B5p() {
    try {
      let e = wh();
      let t = (await H5a.stat(e)).size;
      let r = (await ign(e, t)).postBoundaryBuf;
      let o = Ake(r);
      let s = o.findLastIndex(a => a.type === "system" && "subtype" in a && a.subtype === "compact_boundary");
      let i = s >= 0 ? o.slice(s + 1) : o;
      return {
        promptCount: N5p(i),
        memoryAccessCount: U5p(i)
      };
    } catch {
      return {
        promptCount: 0,
        memoryAccessCount: 0
      };
    }
  }
  async function W5a(e) {
    let t = j5a();
    let n = await $5p(e, t);
    if (!t || n.includes(t)) {
      return n;
    }
    return n ? `${n}

${t}` : t;
  }
  async function $5p(e, t) {
    let n = getInitialSettings();
    if (n.attribution?.pr) {
      return n.attribution.pr;
    }
    if (n.includeCoAuthoredBy === false) {
      return "";
    }
    let r = `\uD83E\uDD16 Generated with [Claude Code](${"https://claude.com/claude-code"})`;
    let o = e();
    if (logForDebugging(`PR Attribution: appState.attribution exists: ${!!o.attribution}`), o.attribution) {
      let f = o.attribution.fileStates;
      let g = f instanceof Map ? f.size : Object.keys(f).length;
      logForDebugging(`PR Attribution: fileStates count: ${g}`);
    }
    let [s, {
      promptCount: i,
      memoryAccessCount: a
    }, l] = await Promise.all([L5p(o), B5p(), qjn(eMe())]);
    let c = s?.summary.claudePercent ?? 0;
    logForDebugging(`PR Attribution: claudePercent: ${c}, promptCount: ${i}, memoryAccessCount: ${a}`);
    let u = getCanonicalName(getMainLoopModel());
    let d = l ? u : PAa(u);
    if (c === 0 && i === 0 && a === 0) {
      logForDebugging("PR Attribution: returning default (no data)");
      return r;
    }
    let p = a > 0 ? `, ${a} ${a === 1 ? "memory" : "memories"} recalled` : "";
    let m = `\uD83E\uDD16 Generated with [Claude Code](${"https://claude.com/claude-code"}) (${c}% ${i}-shotted by ${d}${p})`;
    logForDebugging(`PR Attribution: returning summary: ${m}`);
    return m;
  }
  var H5a;
  var F5p;
  var v6t = __lazy(() => {
    at();
    x$();
    np();
    Ay();
    Tm();
    mx();
    HG();
    je();
    d_();
    Gd();
    Rn();
    zN();
    Eo();
    sne();
    zvo();
    Fy();
    ZS();
    NNe();
    H5a = require("fs/promises");
    F5p = new Set(["Read", "Edit", "Write"]);
  });
  function z5a(e) {
    if (Kvo === e) {
      return;
    }
    Kvo = e;
    w6t();
  }
  function w6t() {
    try {
      V5a.emit();
    } catch {}
  }
  function Y5a(e) {
    return igt.join(w9(e), ".highwatermark");
  }
  async function Yvo(e) {
    let t = Y5a(e);
    try {
      let n = (await Ys().read(t)).trim();
      let r = parseInt(n, 10);
      return isNaN(r) ? 0 : r;
    } catch {
      return 0;
    }
  }
  async function J5a(e, t) {
    let n = Y5a(e);
    await Ys().write(n, String(t));
  }
  function sR() {
    if (Pl(process.env.CLAUDE_CODE_ENABLE_TASKS)) {
      return false;
    }
    return true;
  }
  async function X5a(e) {
    let t = w9(e);
    let n = await Qvo(e);
    let r;
    try {
      r = await Ry(n, C6t);
      let o = await Q5a(e);
      if (o > 0) {
        let i = await Yvo(e);
        if (o > i) {
          await J5a(e, o);
        }
      }
      let s;
      try {
        s = await Ys().list(t);
      } catch {
        s = [];
      }
      for (let i of s) {
        if (i.endsWith(".json") && !i.startsWith(".")) {
          let a = igt.join(t, i);
          try {
            await Ys().delete(a);
          } catch {}
        }
      }
      w6t();
    } finally {
      if (r) {
        await r();
      }
    }
  }
  function H$() {
    if (process.env.CLAUDE_CODE_TASK_LIST_ID) {
      return process.env.CLAUDE_CODE_TASK_LIST_ID;
    }
    let e = getTeammateContext();
    if (e) {
      return e.teamName;
    }
    return getTeamName() || Kvo || getSessionId();
  }
  function agt(e) {
    return e.replace(/[^a-zA-Z0-9_-]/g, "-");
  }
  function w9(e) {
    return igt.join(er(), "tasks", agt(e));
  }
  function lgt(e, t) {
    return igt.join(w9(e), `${agt(t)}.json`);
  }
  async function Jvo(e) {
    let t = w9(e);
    try {
      await Ys().mkdir(t);
    } catch {}
  }
  async function Q5a(e) {
    let t = w9(e);
    let n;
    try {
      n = await Ys().list(t);
    } catch {
      return 0;
    }
    let r = 0;
    for (let o of n) {
      if (!o.endsWith(".json")) {
        continue;
      }
      let s = parseInt(o.replace(".json", ""), 10);
      if (!isNaN(s) && s > r) {
        r = s;
      }
    }
    return r;
  }
  async function q5p(e) {
    let [t, n] = await Promise.all([Q5a(e), Yvo(e)]);
    return Math.max(t, n);
  }
  async function Z5a(e, t) {
    let n = await Qvo(e);
    let r;
    try {
      r = await Ry(n, C6t);
      let o = await q5p(e);
      let s = String(o + 1);
      let i = {
        id: s,
        ...t
      };
      let a = lgt(e, s);
      await Ys().write(a, De(i, null, 2));
      w6t();
      return s;
    } finally {
      if (r) {
        await r();
      }
    }
  }
  async function Voe(e, t) {
    let n = lgt(e, t);
    try {
      let r = await Ys().read(n);
      let o = qt(r);
      let s = H5p().safeParse(o);
      if (!s.success) {
        logForDebugging(`[Tasks] Task ${t} failed schema validation: ${s.error.message}`);
        return null;
      }
      return s.data;
    } catch (r) {
      if (en(r) === "ENOENT") {
        return null;
      }
      if (logForDebugging(`[Tasks] Failed to read task ${t}: ${he(r)}`), !(r instanceof SyntaxError)) {
        Oe(r);
      }
      return null;
    }
  }
  async function e6a(e, t, n) {
    let r = await Voe(e, t);
    if (!r) {
      return null;
    }
    let o = {
      ...r,
      ...n,
      id: t
    };
    let s = lgt(e, t);
    await Ys().write(s, De(o, null, 2));
    w6t();
    return o;
  }
  async function FEe(e, t, n) {
    let r = lgt(e, t);
    if (!(await Voe(e, t))) {
      return null;
    }
    let s;
    try {
      s = await Ry(r, C6t);
      return await e6a(e, t, n);
    } finally {
      await s?.();
    }
  }
  async function K9n(e, t) {
    let n = lgt(e, t);
    try {
      let r = parseInt(t, 10);
      if (!isNaN(r)) {
        let s = await Yvo(e);
        if (r > s) {
          await J5a(e, r);
        }
      }
      try {
        await Ys().delete(n);
      } catch (s) {
        if (en(s) === "ENOENT") {
          return false;
        }
        throw s;
      }
      let o = await y3(e);
      for (let s of o) {
        let i = s.blocks.filter(l => l !== t);
        let a = s.blockedBy.filter(l => l !== t);
        if (i.length !== s.blocks.length || a.length !== s.blockedBy.length) {
          await FEe(e, s.id, {
            blocks: i,
            blockedBy: a
          });
        }
      }
      w6t();
      return true;
    } catch {
      return false;
    }
  }
  async function y3(e) {
    let t = w9(e);
    let n;
    try {
      n = await Ys().list(t);
    } catch {
      return [];
    }
    let r = n.filter(s => s.endsWith(".json")).map(s => s.replace(".json", ""));
    return (await Promise.all(r.map(s => Voe(e, s)))).filter(s => s !== null).sort((s, i) => Number(s.id) - Number(i.id));
  }
  async function Xvo(e, t, n) {
    let [r, o] = await Promise.all([Voe(e, t), Voe(e, n)]);
    if (!r || !o) {
      return false;
    }
    if (!r.blocks.includes(n)) {
      await FEe(e, t, {
        blocks: [...r.blocks, n]
      });
    }
    if (!o.blockedBy.includes(t)) {
      await FEe(e, n, {
        blockedBy: [...o.blockedBy, t]
      });
    }
    return true;
  }
  function W5p(e) {
    return igt.join(w9(e), ".lock");
  }
  async function Qvo(e) {
    await Jvo(e);
    let t = W5p(e);
    try {
      await G5a.writeFile(t, "", {
        flag: "wx"
      });
    } catch {}
    return t;
  }
  async function t6a(e, t, n, r = {}) {
    let o = lgt(e, t);
    if (!(await Voe(e, t))) {
      return {
        success: false,
        reason: "task_not_found"
      };
    }
    if (r.checkAgentBusy) {
      return G5p(e, t, n);
    }
    let i;
    try {
      i = await Ry(o, C6t);
      let a = await Voe(e, t);
      if (!a) {
        return {
          success: false,
          reason: "task_not_found"
        };
      }
      if (a.owner && a.owner !== n) {
        return {
          success: false,
          reason: "already_claimed",
          task: a
        };
      }
      if (a.status === "completed") {
        return {
          success: false,
          reason: "already_resolved",
          task: a
        };
      }
      let l = await y3(e);
      let c = new Set(l.filter(p => p.status !== "completed").map(p => p.id));
      let u = a.blockedBy.filter(p => c.vZc(p));
      if (u.length > 0) {
        return {
          success: false,
          reason: "blocked",
          task: a,
          blockedByTasks: u
        };
      }
      return {
        success: true,
        task: await e6a(e, t, {
          owner: n
        })
      };
    } catch (a) {
      logForDebugging(`[Tasks] Failed to claim task ${t}: ${he(a)}`);
      Oe(a);
      return {
        success: false,
        reason: "task_not_found"
      };
    } finally {
      if (i) {
        await i();
      }
    }
  }
  async function G5p(e, t, n) {
    let r = await Qvo(e);
    let o;
    try {
      o = await Ry(r, C6t);
      let s = await y3(e);
      let i = s.find(d => d.id === t);
      if (!i) {
        return {
          success: false,
          reason: "task_not_found"
        };
      }
      if (i.owner && i.owner !== n) {
        return {
          success: false,
          reason: "already_claimed",
          task: i
        };
      }
      if (i.status === "completed") {
        return {
          success: false,
          reason: "already_resolved",
          task: i
        };
      }
      let a = new Set(s.filter(d => d.status !== "completed").map(d => d.id));
      let l = i.blockedBy.filter(d => a.vZc(d));
      if (l.length > 0) {
        return {
          success: false,
          reason: "blocked",
          task: i,
          blockedByTasks: l
        };
      }
      let c = s.filter(d => d.status !== "completed" && d.owner === n && d.id !== t);
      if (c.length > 0) {
        return {
          success: false,
          reason: "agent_busy",
          task: i,
          busyWithTasks: c.map(d => d.id)
        };
      }
      return {
        success: true,
        task: await FEe(e, t, {
          owner: n
        })
      };
    } catch (s) {
      logForDebugging(`[Tasks] Failed to claim task ${t} with busy check: ${he(s)}`);
      Oe(s);
      return {
        success: false,
        reason: "task_not_found"
      };
    } finally {
      if (o) {
        await o();
      }
    }
  }
  async function cgt(e, t, n, r) {
    let s = (await y3(e)).filter(l => l.status !== "completed" && (l.owner === t || l.owner === n));
    for (let l of s) {
      await FEe(e, l.id, {
        owner: undefined,
        status: "pending"
      });
    }
    if (s.length > 0) {
      logForDebugging(`[Tasks] Unassigned ${s.length} task(s) from ${n}`);
    }
    let a = `${n} ${r === "terminated" ? "was terminated" : "has shut down"}.`;
    if (s.length > 0) {
      let l = s.map(c => `#${c.id} "${c.subject}"`).join(", ");
      a += ` ${s.length} task(s) were unassigned: ${l}. Use TaskList to check availability and TaskUpdate with owner to reassign them to idle teammates.`;
    }
    return {
      unassignedTasks: s.map(l => ({
        id: l.id,
        subject: l.subject
      })),
      notificationMessage: a
    };
  }
  var G5a;
  var igt;
  var V5a;
  var Kvo;
  var K5a;
  var S8e;
  var H5p;
  var C6t;
  var YI = __lazy(() => {
    at();
    _b();
    je();
    gn();
    dt();
    Rn();
    ph();
    qp();
    Uj();
    G5a = require("fs/promises");
    igt = require("path");
    V5a = Si();
    K5a = V5a.subscribe;
    S8e = we(() => v.enum(["pending", "in_progress", "completed"]));
    H5p = we(() => v.object({
      id: v.string(),
      subject: v.string(),
      description: v.string(),
      activeForm: v.string().optional(),
      owner: v.string().optional(),
      status: S8e(),
      blocks: v.array(v.string()),
      blockedBy: v.array(v.string()),
      metadata: v.record(v.string(), v.unknown()).optional()
    }));
    C6t = {
      retries: {
        retries: 30,
        minTimeout: 5,
        maxTimeout: 100
      },
      onCompromised: e => Oe(e)
    };
  });
  function R6t() {
    return fMe();
  }
  function dgt() {
    return wqn();
  }
  function n6a() {
    if (Me.platform !== "win32") {
      return null;
    }
    let e = "This tool runs Git Bash (POSIX sh), not cmd.exe or PowerShell. Use Unix shell syntax: `/dev/null` not `NUL`, forward slashes, `$VAR` not `%VAR%` or `$env:VAR`.";
    if (!uU()) {
      return e;
    }
    return `${e} Do not use PowerShell here-strings (\`@'\u2026'@\`) or backtick continuation here \u2014 for multi-line strings use a heredoc.`;
  }
  function r6a() {
    if (Me.CLAUDE_CODE_DISABLE_BACKGROUND_TASKS) {
      return null;
    }
    return "You can use the `run_in_background` parameter to run the command in the background. Only use this if you don't need the result immediately and are OK being notified when the command completes later. You do not need to check the output right away - you'll be notified when it finishes. You do not need to use '&' at the end of the command when using this parameter.";
  }
  function o6a() {
    return "";
  }
  function V5p(e) {
    if (!b4t()) {
      return "";
    }
    let n = sR() ? "TaskCreate" : "TodoWrite";
    let {
      commit: r,
      pr: o
    } = b8e();
    let s = QWt(e, "bash_full");
    let i = s ? `${s}

` : "";
    let a = o6a();
    let l = null;
    return `${e.commit ? `# Git
- Never use git commands with the -i flag (like git rebase -i or git add -i) since they require interactive input which is not supported.
- Only commit when the user explicitly asks. When staging, prefer naming specific files over "git add -A"/"git add ." \u2014 never commit files that likely contain secrets (.env, credentials).${r ? `
- End git commit messages with:
${r}` : ""}

` : `# Committing changes with git

Only create commits when requested by the user. If unclear, ask first. When the user asks you to create a new git commit, follow these steps carefully:

You can call multiple tools in a single response. When multiple independent pieces of information are requested and all commands are likely to succeed, run multiple tool calls in parallel for optimal performance. The numbered steps below indicate which commands should be batched in parallel.

Git Safety Protocol:
- NEVER update the git config
- NEVER run destructive git commands (push --force, reset --hard, checkout ., restore ., clean -f, branch -D) unless the user explicitly requests these actions. Taking unauthorized destructive actions is unhelpful and can result in lost work, so it's best to ONLY run these commands when given direct instructions 
- NEVER skip hooks (--no-verify, --no-gpg-sign, etc) unless the user explicitly requests it
- NEVER run force push to main/master, warn the user if they request it
- CRITICAL: Always create NEW commits rather than amending, unless the user explicitly requests a git amend. When a pre-commit hook fails, the commit did NOT happen \u2014 so --amend would modify the PREVIOUS commit, which may result in destroying work or losing previous changes. Instead, after hook failure, fix the issue, re-stage, and create a NEW commit
- When staging files, prefer adding specific files by name rather than using "git add -A" or "git add .", which can accidentally include sensitive files (.env, credentials) or large binaries
- NEVER commit changes unless the user explicitly asks you to. It is VERY IMPORTANT to only commit when explicitly asked, otherwise the user will feel that you are being too proactive

1. Run the following bash commands in parallel, each using the ${"Bash"} tool:
  - Run a git status command to see all untracked files. IMPORTANT: Never use the -uall flag as it can cause memory issues on large repos.
  - Run a git diff command to see both staged and unstaged changes that will be committed.
  - Run a git log command to see recent commit messages, so that you can follow this repository's commit message style.
2. Analyze all staged changes (both previously staged and newly added) and draft a commit message:
  - Summarize the nature of the changes (eg. new feature, enhancement to an existing feature, bug fix, refactoring, test, docs, etc.). Ensure the message accurately reflects the changes and their purpose (i.e. "add" means a wholly new feature, "update" means an enhancement to an existing feature, "fix" means a bug fix, etc.).
  - Do not commit files that likely contain secrets (.env, credentials.json, etc). Warn the user if they specifically request to commit those files
  - Draft a concise (1-2 sentences) commit message that focuses on the "why" rather than the "what"
  - Ensure it accurately reflects the changes and their purpose
3. Run the following commands in parallel:
   - Add relevant untracked files to the staging area.
   - Create the commit with a message${r ? ` ending with:
   ${r}` : "."}
   - Run git status after the commit completes to verify success.
   Note: git status depends on the commit completing, so run it sequentially after the commit.
4. If the commit fails due to pre-commit hook: fix the issue and create a NEW commit

Important notes:
- NEVER run additional commands to read or explore code, besides git bash commands
- NEVER use the ${n} or ${"Agent"} tools
- DO NOT push to the remote repository unless the user explicitly asks you to do so
- IMPORTANT: Never use git commands with the -i flag (like git rebase -i or git add -i) since they require interactive input which is not supported.
- IMPORTANT: Do not use --no-edit with git rebase commands, as the --no-edit flag is not a valid option for git rebase.
- If there are no changes to commit (i.e., no untracked files and no modifications), do not create an empty commit
- In order to ensure good formatting, ALWAYS pass the commit message via a HEREDOC, a la this example:
<example>
git commit -m "$(cat <<'EOF'
   Commit message here.${r ? `

   ${r}` : ""}
   EOF
   )"
</example>

`}${i}${a ? `${a}

` : ""}# Creating pull requests
Use the gh command via the Bash tool for ALL GitHub-related tasks including working with issues, pull requests, checks, and releases. If given a Github URL use the gh command to get the information needed.

IMPORTANT: When the user asks you to create a pull request, follow these steps carefully:

1. Run the following bash commands in parallel using the ${"Bash"} tool, in order to understand the current state of the branch since it diverged from the main branch:
   - Run a git status command to see all untracked files (never use -uall flag)
   - Run a git diff command to see both staged and unstaged changes that will be committed
   - Check if the current branch tracks a remote branch and is up to date with the remote, so you know if you need to push to the remote
   - Run a git log command and \`git diff [base-branch]...HEAD\` to understand the full commit history for the current branch (from the time it diverged from the base branch)
2. Analyze all changes that will be included in the pull request, making sure to look at all relevant commits (NOT just the latest commit, but ALL commits that will be included in the pull request!!!), and draft a pull request title and summary:
   - Keep the PR title short (under 70 characters)
   - Use the description/body for details, not the title
3. Run the following commands in parallel:
   - Create new branch if needed
   - Push to remote with -u flag if needed
   - Create PR using gh pr create with the format below. Use a HEREDOC to pass the body to ensure correct formatting.
<example>
gh pr create --title "the pr title" --body "$(cat <<'EOF'
## Summary
<1-3 bullet points>

## Test plan
[Bulleted markdown checklist of TODOs for testing the pull request...]${o ? `

${o}` : ""}
EOF
)"
</example>

Important:
- DO NOT use the ${n} or ${"Agent"} tools
- Return the PR URL when you're done, so the user can see it

# Other common operations
- View comments on a Github PR: gh api repos/foo/bar/pulls/123/comments${l ? `

${l}` : ""}`;
  }
  function ugt(e) {
    if (!e || e.length === 0) {
      return e;
    }
    return Ro(e);
  }
  function T8e(e) {
    if (!e || e.length <= 50) {
      return e;
    }
    let t = e.length - 50;
    return [...e.slice(0, 50), `... and ${t} more (truncated for prompt size)`];
  }
  function s6a() {
    if (!SandboxManager.isSandboxingEnabled()) {
      return "";
    }
    let e = SandboxManager.getFsReadConfig();
    let t = SandboxManager.getFsWriteConfig();
    let n = SandboxManager.getNetworkRestrictionConfig();
    let r = SandboxManager.getAllowUnixSockets();
    let o = SandboxManager.getIgnoreViolations();
    let s = SandboxManager.areUnsandboxedCommandsAllowed();
    let i = new Set([getClaudeTempDir(), getChildProcessTmpDir()]);
    let a = m => Ro(m.map(f => i.vZc(f) ? "$TMPDIR" : f));
    let l = {
      read: {
        denyOnly: T8e(ugt(e.denyOnly)),
        ...(e.allowWithinDeny && {
          allowWithinDeny: T8e(ugt(e.allowWithinDeny))
        })
      },
      write: {
        allowOnly: T8e(a(t.allowOnly)),
        denyWithinAllow: T8e(ugt(t.denyWithinAllow))
      }
    };
    let c = {
      ...(n?.allowedHosts && {
        allowedHosts: T8e(ugt(n.allowedHosts))
      }),
      ...(n?.deniedHosts && {
        deniedHosts: T8e(ugt(n.deniedHosts))
      }),
      ...(r && {
        allowUnixSockets: T8e(ugt(r))
      })
    };
    let u = [];
    if (Object.keys(l).length > 0) {
      u.push(`Filesystem: ${De(l)}`);
    }
    if (Object.keys(c).length > 0) {
      u.push(`Network: ${De(c)}`);
    }
    if (o) {
      u.push(`Ignored violations: ${De(o)}`);
    }
    let p = [...(s ? ["You should always default to running commands within the sandbox. Do NOT attempt to set `dangerouslyDisableSandbox: true` unless:", ["The user *explicitly* asks you to bypass sandbox", "A specific command just failed and you see evidence of sandbox restrictions causing the failure. Note that commands can fail for many reasons unrelated to the sandbox (missing files, wrong arguments, network issues, etc.)."], "Evidence of sandbox-caused failures includes:", ['"Operation not permitted" errors for file/network operations', "Access denied to specific paths outside allowed directories", "Network connection failures to non-whitelisted hosts", "Unix socket connection errors"], "When you see evidence of sandbox-caused failure:", ["Immediately retry with `dangerouslyDisableSandbox: true` (don't ask, just do it)", "Briefly explain what sandbox restriction likely caused the failure. Be sure to mention that the user can use the `/sandbox` command to manage restrictions.", "This will prompt the user for permission"], ...[], "Treat each command you execute with `dangerouslyDisableSandbox: true` individually. Even if you have recently run a command with this setting, you should default to running future commands within the sandbox.", "Do not suggest adding sensitive paths like ~/.bashrc, ~/.zshrc, ~/.ssh/*, or credential files to the sandbox allowlist."] : ["All commands MUST run in sandbox mode - the `dangerouslyDisableSandbox` parameter is disabled by policy.", "Commands cannot run outside the sandbox under any circumstances.", "If a command fails due to sandbox restrictions, work with the user to adjust sandbox settings instead."]), "For temporary files, always use the `$TMPDIR` environment variable. TMPDIR is automatically set to the correct sandbox-writable directory in sandbox mode. Do NOT use `/tmp` directly - use `$TMPDIR` instead."];
    return ["", "## Command sandbox", "By default, your command will be run in a sandbox. This sandbox controls which directories and network hosts commands may access or modify without an explicit override.", "", "The sandbox has the following restrictions:", u.join(`
`), "", ...uz(p)].join(`
`);
  }
  function z5p(e) {
    if (!b4t()) {
      return "";
    }
    let n = "";
    let {
      commit: r,
      pr: o
    } = b8e();
    let i = [r ? `- End git commit messages with:
${r}` : null, o ? `- End PR bodies with:
${o}` : null].filter(Boolean).join(`
`);
    let a = o6a();
    let l = null;
    let c = QWt(e, "bash_lean");
    return `${n}# Git
- Interactive flags (\`-i\`, e.g. \`git rebase -i\`, \`git add -i\`) are not supported in this environment.
- Use the \`gh\` CLI for GitHub operations (PRs, issues, API).
- Commit or push only when the user asks${c ? " \u2014 and for a completed change, per the pre-ship gate below" : ""}. If on the default branch, branch first.${i ? `
${i}` : ""}${c ? `
- ${c}` : ""}${a ? `

${a}` : ""}${l ? `

${l}` : ""}`;
  }
  function K5p(e) {
    let t = r6a() !== null;
    let n = z5p(e);
    let r = s6a();
    let o = Rx() ? "`cat`, `head`, `tail`, `sed`, `awk`, or `echo`" : "`find`, `grep`, `cat`, `head`, `tail`, `sed`, `awk`, or `echo`";
    let s = [];
    if (t) {
      let a = "- `run_in_background` runs the command detached: it keeps running across turns and re-invokes you when it exits. No `&` needed.";
      if (IG()) {
        a += " Foreground `sleep` is blocked; use Monitor with an until-loop to wait on a condition.";
      }
      s.push(a);
    }
    let i = n6a();
    return ["Executes a bash command and returns its output.", ...(i ? ["", i] : []), "", "- Working directory persists between calls, but prefer absolute paths \u2014 `cd` in a compound command can trigger a permission prompt. Shell state (env vars, functions) does not persist; the shell is initialized from the user's profile.", `- IMPORTANT: Avoid using this tool to run ${o} commands, unless explicitly instructed or after you have verified that a dedicated tool cannot accomplish your task. Instead, use the appropriate dedicated tool as this will provide a much better experience for the user.`, `- \`timeout\` is in milliseconds: default ${R6t()}, max ${dgt()}.`, ...s, ...(r ? [r] : []), ...(n ? ["", n] : [])].join(`
`);
  }
  function i6a(e, t) {
    if (_g(e)) {
      return K5p(t);
    }
    let n = Rx();
    let r = [...(n ? [] : [`File search: Use ${"Glob"} (NOT find or ls)`, `Content search: Use ${"Grep"} (NOT grep or rg)`]), `Read files: Use ${"Read"} (NOT cat/head/tail)`, `Edit files: Use ${"Edit"} (NOT sed/awk)`, `Write files: Use ${"Write"} (NOT echo >/cat <<EOF)`, "Communication: Output text directly (NOT echo/printf)"];
    let o = n ? "`cat`, `head`, `tail`, `sed`, `awk`, or `echo`" : "`find`, `grep`, `cat`, `head`, `tail`, `sed`, `awk`, or `echo`";
    let s = ["Prefer to create a new commit rather than amending an existing commit.", "Before running destructive operations (e.g., git reset --hard, git push --force, git checkout --), consider whether there is a safer alternative that achieves the same goal. Only use destructive operations when they are truly the best approach.", "Never skip hooks (--no-verify) or bypass signing (--no-gpg-sign, -c commit.gpgsign=false) unless the user has explicitly asked for it. If a hook fails, investigate and fix the underlying issue."];
    let i = ["Do not sleep between commands that can run immediately \u2014 just run them.", ...(IG() ? ['Use the Monitor tool to stream events from a background process (each stdout line is a notification). For one-shot "wait until done," use Bash with run_in_background instead.'] : []), "If your command is long running and you would like to be notified when it finishes \u2014 use `run_in_background`. No sleep needed.", "Do not retry failing commands in a sleep loop \u2014 diagnose the root cause.", "If waiting for a background task you started with `run_in_background`, you will be notified when it completes \u2014 do not poll.", ...(IG() ? ["Long leading `sleep` commands are blocked. To poll until a condition is met, use Monitor with an until-loop (e.g. `until <check>; do sleep 2; done`) \u2014 you get a notification when the loop exits. Do not chain shorter sleeps to work around the block."] : ["If you must poll an external process, use a check command (e.g. `gh run view`) rather than sleeping first.", "If you must sleep, keep the duration short to avoid blocking the user."])];
    let a = r6a();
    let l = V5p(t);
    let c = ["If your command will create new directories or files, first use this tool to run `ls` to verify the parent directory exists and is the correct location.", 'Always quote file paths that contain spaces with double quotes in your command (e.g., cd "path with spaces/file.txt")', "Try to maintain your current working directory throughout the session by using absolute paths and avoiding usage of `cd`. You may use `cd` if the User explicitly requests it. In particular, never prepend `cd <current-directory>` to a `git` command \u2014 `git` already operates on the current working tree, and the compound triggers a permission prompt.", `You may specify an optional timeout in milliseconds (up to ${dgt()}ms / ${dgt() / 60000} minutes). By default, your command will timeout after ${R6t()}ms (${R6t() / 60000} minutes).`, ...(a !== null ? [a] : []), "For git commands:", s, "Avoid unnecessary `sleep` commands:", i, ...(n ? ["When running `find`, search from `.` (or a specific path), not `/` \u2014 scanning the full filesystem can exhaust system resources on large trees.", "When using `find -regex` with alternation, put the longest alternative first. Example: use `'.*\\.\\(tsx\\|ts\\)'` not `'.*\\.\\(ts\\|tsx\\)'` \u2014 the second form silently skips `.tsx` files."] : [])];
    let u = n6a();
    return ["Executes a given bash command and returns its output.", ...(u ? ["", u] : []), "", "The working directory persists between commands, but shell state does not. The shell environment is initialized from the user's profile (bash or zsh).", "", `IMPORTANT: Avoid using this tool to run ${o} commands, unless explicitly instructed or after you have verified that a dedicated tool cannot accomplish your task. Instead, use the appropriate dedicated tool as this will provide a much better experience for the user:`, "", ...uz(r), `While the ${"Bash"} tool can do similar things, it\u2019s better to use the built-in tools as they provide a better user experience and make it easier to review tool calls and give permission.`, "", "# Instructions", ...uz(c), s6a(), ...(l ? ["", l] : [])].join(`
`);
  }
  var a6a = __lazy(() => {
    dz();
    v6t();
    jV();
    pr();
    juo();
    AI();
    wm();
    ZWt();
    Th();
    Jf();
    YI();
    NNe();
    Sh();
    Ay();
    Tm();
    mx();
    Fk();
    _x();
    wX();
  });
  function t6p(e) {
    let t = Uy(e);
    if (t.length === 0) {
      return {
        isSearch: false,
        isRead: false,
        isList: false
      };
    }
    let n = false;
    let r = false;
    let o = false;
    let s = false;
    for (let i of t) {
      let a = i.trim().split(/\s+/)[0];
      if (!a || Z5p.vZc(a)) {
        continue;
      }
      s = true;
      let l = J5p.vZc(a);
      let c = X5p.vZc(a);
      let u = Q5p.vZc(a);
      if (!l && !c && !u) {
        return {
          isSearch: false,
          isRead: false,
          isList: false
        };
      }
      if (l) {
        n = true;
      }
      if (c) {
        r = true;
      }
      if (u) {
        o = true;
      }
    }
    if (!s) {
      return {
        isSearch: false,
        isRead: false,
        isList: false
      };
    }
    return {
      isSearch: n,
      isRead: r,
      isList: o
    };
  }
  function n6p(e) {
    let t = Uy(e);
    if (t.length === 0) {
      return false;
    }
    let n = false;
    for (let r of t) {
      let o = r.trim().split(/\s+/)[0];
      if (!o) {
        continue;
      }
      if (n = true, !e6p.vZc(o)) {
        return false;
      }
    }
    return n;
  }
  function p6a(e) {
    return {};
  }
  function k6t(e) {
    let t = Uy(e);
    if (t.length === 0) {
      return "other";
    }
    for (let n of t) {
      let r = ii(n, " ");
      let o = s6p.find(s => s === r);
      if (o) {
        return o;
      }
    }
    return "other";
  }
  function a6p(e) {
    let t = _O()?.parse(e);
    if (!t) {
      return false;
    }
    {
      let o = f9e(e, t);
      if (o.kind !== "simple") {
        return false;
      }
      if (o.commands.some(s => Y5e(s.text))) {
        return false;
      }
    }
    let n = Uy(e);
    if (n.length === 0) {
      return true;
    }
    let r = n[0]?.trim().split(/\s+/)[0];
    if (!r) {
      return true;
    }
    return !r6p.includes(r);
  }
  function l6p(e) {
    let t = Uy(e);
    if (t.length === 0) {
      return null;
    }
    let n = t[0]?.trim() ?? "";
    let r = /^sleep\s+(\d+(?:\.\d*)?)\s*$/.exec(n);
    if (!r) {
      return null;
    }
    let o = parseFloat(r[1]);
    if (o < 25) {
      return null;
    }
    let s = t.slice(1).join(" ").trim();
    return s ? `sleep ${o} followed by: ${s}` : `standalone sleep ${o}`;
  }
  async function c6p(e, t, n) {
    let {
      filePath: r,
      newContent: o
    } = e;
    let s = us(r);
    let i = fg(s);
    let a = zt();
    let l = cgn(s);
    let c;
    try {
      c = await a.readFile(s, {
        encoding: l
      });
    } catch (d) {
      if (fn(d)) {
        return {
          data: {
            stdout: "",
            stderr: `sed: ${r}: No such file or directory
Exit code 1`,
            interrupted: false
          }
        };
      }
      throw d;
    }
    if (fileHistoryEnabled() && n) {
      await fileHistoryTrackEdit(t.getFileHistoryState, t.applyFileHistoryOp, s, n.uuid);
    }
    let u = Jks(s);
    await Tke(s, async () => {
      Ske(s, i);
      let d = await Eke(s, o, l, u);
      t.readFileState.set(s, {
        content: o,
        timestamp: d,
        offset: undefined,
        limit: undefined
      });
    });
    KDe(s, c, o);
    return {
      data: {
        stdout: "",
        stderr: "",
        interrupted: false
      }
    };
  }
  async function d6p(e, t, n) {
    if (!u6p.test(e)) {
      return [];
    }
    let r = [];
    await Promise.all(Array.from(t.entries(), ([o, s]) => aje(o).then(i => {
      if (i > n && i > s.timestamp) {
        r.push(o);
      }
    }).catch(() => {})));
    return r;
  }
  function f6a(e) {
    if (e?.type === "rule") {
      return true;
    }
    if (e?.type === "subcommandResults") {
      return [...e.reasons.values()].every(t => f6a(t.decisionReason));
    }
    return false;
  }
  async function* p6p({
    input: e,
    abortController: t,
    taskRegistry: n,
    setToolJSX: r,
    emitToolProgress: o,
    preventCwdChanges: s,
    isMainThread: i,
    toolUseId: a,
    agentId: l,
    sessionEnvVars: c,
    effortLevel: u
  }) {
    let {
      command: d,
      description: p,
      timeout: m,
      run_in_background: f
    } = e;
    let h = Math.min(m || R6t(), dgt());
    let g = "";
    let y = "";
    let _ = 0;
    let b = 0;
    let S = undefined;
    let E = null;
    function C() {
      return new Promise(H => {
        E = () => H(null);
      });
    }
    let x = !x6t && a6p(d);
    let A = Cqn({
      requestedTimeoutMs: h,
      isMainAgent: i === true,
      canAutoBackground: x
    });
    let k = await Kde(d, t.signal, "bash", {
      timeout: A,
      onProgress(H, U, N, W, j) {
        y = H;
        g = U;
        _ = N;
        b = j ? W : 0;
        let z = E;
        if (z) {
          E = null;
          z();
        }
      },
      preventCwdChanges: s,
      shouldUseSandbox: $1(e),
      shouldAutoBackground: x,
      sessionEnvVars: c,
      effortLevel: u
    });
    let I = k.result;
    async function O() {
      return (await XDe({
        command: d,
        description: p || d,
        shellCommand: k,
        toolUseId: a,
        agentId: l
      }, {
        abortController: t,
        taskRegistry: n
      })).taskId;
    }
    function M(H, U) {
      if (P) {
        if (!Mjn(P, k, p || d, n, a)) {
          return;
        }
        S = P;
        logEvent(H, {
          command_type: k6t(d)
        });
        U?.(P);
        return;
      }
      O().then(N => {
        S = N;
        let W = E;
        if (W) {
          E = null;
          W();
        }
        if (logEvent(H, {
          command_type: k6t(d)
        }), U) {
          U(N);
        }
      });
    }
    if (k.onTimeout && x) {
      k.onTimeout(H => {
        M("tengu_bash_command_timeout_backgrounded", H);
      });
    }
    if (f === true && !x6t) {
      let H = await O();
      logEvent("tengu_bash_command_explicitly_backgrounded", {
        command_type: k6t(d)
      });
      return {
        stdout: "",
        stderr: "",
        code: 0,
        interrupted: false,
        backgroundTaskId: H
      };
    }
    let L = Date.now();
    let P = undefined;
    {
      let H = await Promise.race([I, new Promise(U => {
        setTimeout(W => W(null), 2000, U).unref();
      })]);
      if (H !== null) {
        k.cleanup();
        return H;
      }
      if (S) {
        return {
          stdout: "",
          stderr: "",
          code: 0,
          interrupted: false,
          backgroundTaskId: S
        };
      }
    }
    Db.startPolling(k.taskOutput.taskId);
    let F = null;
    try {
      while (true) {
        let H = C();
        let U = await Promise.race([I, H]);
        if (U !== null) {
          if (F = U, U.backgroundTaskId !== undefined) {
            if (Njn(U.backgroundTaskId, U, n)) {
              zu(U.backgroundTaskId, dmt(U), {
                toolUseId: a,
                summary: p || d
              });
            }
            let j = {
              ...U,
              backgroundTaskId: undefined
            };
            let {
              taskOutput: z
            } = k;
            if (z.stdoutToFile && !z.outputFileRedundant) {
              j.outputFilePath = z.path;
              j.outputFileSize = z.outputFileSize;
              j.outputTaskId = z.taskId;
            }
            return j;
          }
          return U;
        }
        if (S) {
          return {
            stdout: "",
            stderr: "",
            code: 0,
            interrupted: false,
            backgroundTaskId: S
          };
        }
        if (P) {
          if (k.status === "backgrounded") {
            return {
              stdout: "",
              stderr: "",
              code: 0,
              interrupted: false,
              backgroundTaskId: P,
              backgroundedByUser: true
            };
          }
        }
        let N = Date.now() - L;
        let W = Math.floor(N / 1000);
        if (!x6t && S === undefined && W >= 2000 / 1000) {
          if (!P) {
            P = Ojn({
              command: d,
              description: p || d,
              shellCommand: k,
              agentId: l
            }, n, a);
          }
          if (r?.({
            jsx: h6a.jsx(xNe, {}),
            shouldHidePromptInput: false,
            shouldContinueAnimation: true,
            showSpinner: true
          }), a) {
            o?.({
              kind: "background_hint",
              toolUseId: a
            });
          }
        }
        yield {
          type: "progress",
          fullOutput: g,
          output: y,
          elapsedTimeSeconds: W,
          totalLines: _,
          totalBytes: b,
          taskId: k.taskOutput.taskId,
          ...(m ? {
            timeoutMs: A
          } : undefined)
        };
      }
    } finally {
      if (Db.stopPolling(k.taskOutput.taskId), !S && k.status !== "backgrounded") {
        if (P) {
          Ljn(P, F ? dmt(F) : "stopped", n);
        }
        k.cleanup();
      }
    }
  }
  var LNe;
  var m6a;
  var h6a;
  var l6a = `
`;
  var Y5p;
  var J5p;
  var X5p;
  var Q5p;
  var Z5p;
  var e6p;
  var r6p;
  var x6t;
  var u6a;
  var d6a;
  var s6p;
  var i6p;
  var u6p;
  var xl;
  var R$ = __lazy(() => {
    at();
    Ot();
    _5e();
    ci();
    zX();
    Kp();
    noe();
    iTe();
    bU();
    oAa();
    pmt();
    Qfo();
    vo();
    Fp();
    pr();
    gn();
    dt();
    Zl();
    Jq();
    cs();
    Kjn();
    JF();
    ku();
    Qjn();
    ZWt();
    U1();
    Th();
    uMe();
    Cmt();
    Zn();
    cE();
    w5e();
    mMe();
    zI();
    zgo();
    Tm();
    wX();
    uTe();
    Kgo();
    amt();
    sMa();
    iWe();
    lMa();
    a6a();
    r6t();
    X5e();
    s6t();
    S9n();
    Sl();
    LNe = require("fs/promises");
    m6a = require("path");
    h6a = __toESM(ie(), 1);
    Y5p = new Set(["command_substitution", "simple_expansion", "string"]);
    J5p = new Set(["find", "grep", "rg", "ag", "ack", "locate", "which", "whereis"]);
    X5p = new Set(["cat", "head", "tail", "less", "more", "wc", "stat", "file", "strings", "jq", "awk", "cut", "sort", "uniq", "tr"]);
    Q5p = new Set(["ls", "tree", "du"]);
    Z5p = new Set(["echo", "printf", "true", "false", ":"]);
    e6p = new Set(["mv", "cp", "rm", "mkdir", "rmdir", "chmod", "chown", "chgrp", "touch", "ln", "cd", "export", "unset", "wait"]);
    r6p = ["sleep"];
    x6t = Me.CLAUDE_CODE_DISABLE_BACKGROUND_TASKS;
    u6a = we(() => v.strictObject({
      command: v.string().refine(HTe, "command contains control characters that would be hidden in the approval dialog").describe("The command to execute"),
      timeout: v$(v.number().optional()).describe(`Optional timeout in milliseconds (max ${dgt()})`),
      description: v.string().optional().describe(`Clear, concise description of what this command does in active voice. Never use words like "complex" or "risk" in the description - just describe what it does.

For simple commands (git, npm, standard CLI tools), keep it brief (5-10 words):
- ls \u2192 "List files in current directory"
- git status \u2192 "Show working tree status"
- npm install \u2192 "Install package dependencies"

For commands that are harder to parse at a glance (piped commands, obscure flags, etc.), add enough context to clarify what it does:
- find . -name "*.tmp" -exec rm {} \\; \u2192 "Find and delete all .tmp files recursively"
- git reset --hard origin/main \u2192 "Discard all local changes and match remote main"
- curl -s url | jq '.data[]' \u2192 "Fetch JSON from URL and extract data array elements"`),
      run_in_background: VI(v.boolean().optional()).describe("Set to true to run this command in the background."),
      dangerouslyDisableSandbox: VI(v.boolean().optional()).describe("Set this to true to dangerously override sandbox mode and run commands without sandboxing."),
      ...false,
      _simulatedSedEdit: v.object({
        filePath: v.string(),
        newContent: v.string()
      }).optional().describe("Internal: pre-computed sed edit result from preview")
    }));
    d6a = we(() => (x6t ? u6a().omit({
      run_in_background: true,
      _simulatedSedEdit: true
    }) : u6a().omit({
      _simulatedSedEdit: true
    })).superRefine((e, t) => {}));
    s6p = [...s3n, "wget"];
    i6p = we(() => v.object({
      stdout: v.string().describe("The standard output of the command"),
      stderr: v.string().describe("The standard error output of the command"),
      rawOutputPath: v.string().optional().describe("Path to raw output file for large MCP tool outputs"),
      interrupted: v.boolean().describe("Whether the command was interrupted"),
      isImage: v.boolean().optional().describe("Flag to indicate if stdout contains image data"),
      backgroundTaskId: v.string().optional().describe("ID of the background task if command is running in background"),
      backgroundedByUser: v.boolean().optional().describe("True if the user manually backgrounded the command with Ctrl+B"),
      dangerouslyDisableSandbox: v.boolean().optional().describe("Flag to indicate if sandbox mode was overridden"),
      returnCodeInterpretation: v.string().optional().describe("Semantic interpretation for non-error exit codes with special meaning"),
      noOutputExpected: v.boolean().optional().describe("Whether the command is expected to produce no output on success"),
      structuredContent: v.array(v.any()).optional().describe("Structured content blocks"),
      persistedOutputPath: v.string().optional().describe("Path to the persisted full output in tool-results dir (set when output is too large for inline)"),
      persistedOutputSize: v.number().optional().describe("Total size of the output in bytes (set when output is too large for inline)"),
      staleReadFileStateHint: v.string().optional().describe("Model-facing note listing readFileState entries whose mtime bumped during this command (set when WRITE_COMMAND_MARKERS matches)"),
      ghRateLimitHint: v.string().optional().describe("Model-facing system-reminder appended when a gh command reports a GitHub API rate-limit error"),
      gitOperation: wjn().optional().describe("@internal Structured classification of git/gh operations detected in this command (commit/push/merge/rebase/PR). Client-facing \u2014 lets clients render git activity without re-parsing stdout; not surfaced to the model.")
    }));
    u6p = new RegExp(["--write", "--fix", "--in-place", "--auto-correct", "\\brun\\s+format\\b", "\\brun\\s+fix\\b", "\\b(yarn|pnpm)\\s+format\\b", "\\blint:file\\b", "\\blint:fix\\b", "\\bblack\\b", "\\bisort\\b", "\\bruff\\s+format\\b", "\\bcargo\\s+(fmt|fix)\\b", "\\brustfmt\\b", "\\bgo\\s+fmt\\b", "\\bterraform\\s+fmt\\b", "\\bdprint\\s+fmt\\b", "\\bswiftformat\\b", "\\bphpcbf\\b"].join("|"));
    xl = Xs({
      name: "Bash",
      ruleContentField: "command",
      searchHint: "execute shell commands",
      maxResultSizeChars: 30000,
      strict: true,
      async description({
        description: e
      }) {
        return e || "Run shell command";
      },
      async prompt({
        model: e,
        tools: t
      }) {
        let r = t.some(o => bl(o, "Skill")) ? await getLimitedSkillToolCommands(getProjectRoot()) : [];
        return i6a(e, eqn(r));
      },
      isConcurrencySafe(e) {
        return this.isReadOnly?.(e) ?? false;
      },
      isReadOnly(e) {
        let t = myo(e.command);
        return DDa(e, t).behavior === "allow";
      },
      toAutoClassifierInput(e) {
        let t = e.dangerouslyDisableSandbox;
        return e.command;
      },
      async preparePermissionMatcher({
        command: e
      }) {
        let t = await wdt(e);
        let n;
        let r = false;
        if (t.kind === "simple") {
          n = t.commands.map(o => o.argv.join(" "));
        } else if (t.differential || !Y5p.vZc(t.nodeType ?? "")) {
          return () => true;
        } else {
          let o = rAa(e);
          if (o === null || o.length === 0) {
            return () => true;
          }
          n = o;
          r = true;
        }
        return o => {
          let s = WGt(o);
          if (r && !(s !== null ? !/\s/.test(s) : /^[^\s*?[]+\s?\*$/.test(o))) {
            return true;
          }
          return n.some(i => {
            if (s !== null) {
              return i === s || i.startsWith(`${s} `) || i === `xargs ${s}` || i.startsWith(`xargs ${s} `);
            }
            return J5e(o, i) || J5e(`xargs ${o}`, i);
          });
        };
      },
      isSearchOrReadCommand(e) {
        let t = d6a().safeParse(e);
        if (!t.success) {
          return {
            isSearch: false,
            isRead: false,
            isList: false
          };
        }
        return t6p(t.data.command);
      },
      get inputSchema() {
        return d6a();
      },
      coerceInput: rMa,
      get outputSchema() {
        return i6p();
      },
      userFacingName(e) {
        if (!e) {
          return "Bash";
        }
        if (e.command) {
          let t = t8e(e.command);
          if (t) {
            return o3n({
              file_path: t.filePath,
              old_string: "x"
            });
          }
        }
        return st(process.env.CLAUDE_CODE_BASH_SANDBOX_SHOW_INDICATOR) && $1(e) ? "SandboxedBash" : "Bash";
      },
      getToolUseSummary(e) {
        if (!e?.command) {
          return null;
        }
        let {
          command: t,
          description: n
        } = e;
        if (n) {
          return n;
        }
        return truncate(t, 50);
      },
      getActivityDescription(e) {
        if (!e?.command) {
          return "Running command";
        }
        return `Running ${e.description ?? truncate(e.command, 50)}`;
      },
      async validateInput(e) {
        if (IG() && !x6t && !e.run_in_background) {
          let t = l6p(e.command);
          if (t !== null) {
            return {
              result: false,
              message: `Blocked: ${t}. To wait for a condition, use Monitor with an until-loop (e.g. \`until <check>; do sleep 2; done\`). To wait for a command you started, use run_in_background: true. Do not chain shorter sleeps to work around this block.`,
              errorCode: 10
            };
          }
        }
        return {
          result: true
        };
      },
      async checkPermissions(e, t) {
        let n = await JGt(e, t);
        if (e.dangerouslyDisableSandbox && n.behavior !== "deny" && n.behavior !== "ask" && !f6a(n.decisionReason) && !$1(e) && $1({
          ...e,
          dangerouslyDisableSandbox: false
        })) {
          return {
            behavior: "ask",
            decisionReason: {
              type: "sandboxOverride",
              reason: "dangerouslyDisableSandbox"
            },
            message: "Run outside of the sandbox"
          };
        }
        return n;
      },
      renderToolUseMessage: RGa,
      renderToolUseProgressMessage: xGa,
      renderToolUseQueuedMessage: kGa,
      renderToolResultMessage: AGa,
      extractSearchText({
        stdout: e,
        stderr: t
      }) {
        return t ? `${e}
${t}` : e;
      },
      mapToolResultToToolResultBlockParam({
        interrupted: e,
        stdout: t,
        stderr: n,
        isImage: r,
        backgroundTaskId: o,
        backgroundedByUser: s,
        structuredContent: i,
        persistedOutputPath: a,
        persistedOutputSize: l,
        staleReadFileStateHint: c,
        ghRateLimitHint: u
      }, d) {
        if (i && i.length > 0) {
          return {
            tool_use_id: d,
            type: "tool_result",
            content: i
          };
        }
        if (r) {
          let h = g9n(t, d);
          if (h) {
            return h;
          }
        }
        let p = t;
        if (t) {
          p = t.replace(/^(\s*\n)+/, "");
          p = p.trimEnd();
        }
        if (a) {
          let h = TGt(p, 2000);
          p = yMe({
            filepath: a,
            originalSize: l ?? 0,
            isJson: false,
            preview: h.preview,
            hasMore: h.hasMore
          });
        }
        let m = n.trim();
        if (e) {
          if (n) {
            m += l6a;
          }
          m += "<error>Command was aborted before completion</error>";
        }
        let f = "";
        if (o) {
          let h = getTaskOutputPath(o);
          if (s) {
            f = `Command was manually backgrounded by user with ID: ${o}. Output is being written to: ${h}`;
          } else {
            f = `Command running in background with ID: ${o}. Output is being written to: ${h}. You will be notified when it completes. To check interim output, use ${"Read"} on that file path.`;
          }
        }
        return {
          tool_use_id: d,
          type: "tool_result",
          content: [p, m, f, c, u].filter(Boolean).join(`
`),
          is_error: e
        };
      },
      async call(e, t, n, r, o) {
        if (e._simulatedSedEdit) {
          return c6p(e._simulatedSedEdit, t, r);
        }
        let s = Math.floor(Date.now() / 1000) * 1000;
        let {
          abortController: i,
          getAppState: a,
          setToolJSX: l,
          emitToolProgress: c
        } = t;
        let u = new vIt();
        let d = "";
        let p;
        let m = 0;
        let f = false;
        let h;
        let g = !t.agentId;
        let y = !g;
        let _ = $1(e);
        let b = oWe(e.command);
        try {
          let U = p6p({
            input: e,
            abortController: i,
            taskRegistry: t.taskRegistry,
            setToolJSX: l,
            emitToolProgress: c,
            preventCwdChanges: y,
            isMainThread: g,
            toolUseId: t.toolUseId,
            agentId: t.agentId,
            sessionEnvVars: t.sessionEnvVars,
            effortLevel: sx(t.options.mainLoopModel) ? r1(t.options.mainLoopModel, getEffortValue(t)) : undefined
          });
          let N;
          do {
            if (N = await U.next(), !N.done && o) {
              let J = N.value;
              o({
                type: "progress",
                toolUseID: `bash-progress-${m++}`,
                data: {
                  type: "bash_progress",
                  output: J.output,
                  fullOutput: J.fullOutput,
                  elapsedTimeSeconds: J.elapsedTimeSeconds,
                  totalLines: J.totalLines,
                  totalBytes: J.totalBytes,
                  taskId: J.taskId,
                  timeoutMs: J.timeoutMs
                }
              });
            }
          } while (!N.done);
          if (h = N.value, h.intercepted) {
            _ = false;
          }
          xjn(e.command, h.code, h.stdout);
          let W = unwrapAbortReason(i.signal.reason);
          let j = h.interrupted && W === "interrupt";
          let z = h.interrupted && (W === "interrupt" || W === "user-cancel" || W === "remote-cancel");
          if (h.interrupted && W === "background") {
            throw new xc();
          }
          if (u.append((h.stdout || "").trimEnd() + l6a), p = oMa(e.command, h.code, h.stdout || "", ""), h.stdout && h.stdout.includes(".git/index.lock': File exists")) {
            logEvent("tengu_git_index_lock_error", {});
          }
          if (p.isError && !j) {
            if (h.code !== 0) {
              u.append(`Exit code ${h.code}`);
            }
          }
          if (!y) {
            let J = a();
            if (b9n(J.toolPermissionContext)) {
              d = _9n("");
            }
          }
          zjn(t.toolUseId);
          let V = h.stdout || "";
          let K = SandboxManager.annotateStderrWithSandboxFailures(e.command, V);
          if (h.preSpawnError) {
            if (/null bytes/.test(h.preSpawnError)) {
              throw new Po(h.preSpawnError, "Bash: command contained null bytes (argv echo redacted)");
            }
            throw new Po(h.preSpawnError, "Bash: pre-spawn error (cwd/argv redacted)");
          }
          if (p.isError && !j) {
            throw logEvent("tengu_bash_tool_command_failed", {
              command_type: k6t(e.command),
              stdout_length: V.length,
              stderr_length: 0,
              exit_code: h.code,
              interrupted: h.interrupted,
              executor_shell: await Who(),
              executor_shell_overridden: Boolean(process.env.CLAUDE_CODE_SHELL),
              sandboxed: _,
              sandbox_enabled: SandboxManager.isSandboxingEnabled(),
              dangerously_disable_sandbox: e.dangerouslyDisableSandbox ?? false,
              filesystem_policy: getEffectiveFilesystemPolicy(),
              ...p6a(e),
              destructive_category: b ?? "none",
              destructive_target_scope: Xce(e.command, Nt(), b),
              git_destructive_target: sWe(e.command, b),
              permission_mode: getToolPermissionContext(t).mode
            }), new RN("", K, h.code, z, K !== V);
          }
          f = h.interrupted;
        } finally {
          if (l) {
            l(null);
          }
          if (t.toolUseId) {
            c?.({
              kind: "clear",
              toolUseId: t.toolUseId
            });
          }
        }
        let S = u.toString();
        let E = 67108864;
        let C;
        let x;
        if (h.outputFilePath && h.outputTaskId) {
          try {
            let U = await LNe.stat(h.outputFilePath);
            x = U.size;
            await YTe();
            let N = SGt(h.outputTaskId, false);
            if (U.size > E) {
              await LNe.truncate(h.outputFilePath, E);
            }
            try {
              await LNe.link(h.outputFilePath, N);
            } catch {
              await LNe.copyFile(h.outputFilePath, N);
            }
            C = N;
          } catch {}
        }
        logEvent("tengu_bash_tool_command_executed", {
          command_type: k6t(e.command),
          stdout_length: S.length,
          stderr_length: 0,
          exit_code: h.code,
          interrupted: f,
          executor_shell: await Who(),
          executor_shell_overridden: Boolean(process.env.CLAUDE_CODE_SHELL),
          sandboxed: _,
          sandbox_enabled: SandboxManager.isSandboxingEnabled(),
          dangerously_disable_sandbox: e.dangerouslyDisableSandbox ?? false,
          filesystem_policy: getEffectiveFilesystemPolicy(),
          ...p6a(e),
          destructive_category: b ?? "none",
          destructive_target_scope: Xce(e.command, Nt(), b),
          git_destructive_target: sWe(e.command, b),
          permission_mode: getToolPermissionContext(t).mode
        });
        let A = mAa(e.command);
        if (A) {
          logEvent("tengu_code_indexing_tool_used", {
            tool: A,
            source: "cli",
            success: h.code === 0
          });
        }
        let k = h9n(S);
        let I = FWt(k, e.command);
        if (k = I.stripped, g && I.hints.length > 0) {
          for (let U of I.hints) {
            JWt(U);
          }
        }
        let O = i6t(k);
        let M = k;
        if (O) {
          let U = await y9n(k, h.outputFilePath, x, Yg(t.options.mainLoopModel));
          if (U) {
            M = U;
          } else {
            O = false;
          }
        }
        let L = h.backgroundTaskId ? undefined : Pka(e.command, h.stdout || "");
        let P;
        if (!h.backgroundTaskId) {
          let U = imt(e.command, h.stdout || "");
          if (Object.keys(U).length > 0) {
            P = U;
          }
        }
        let F;
        if (!f && !O && !h.backgroundTaskId) {
          let U = await d6p(e.command, t.readFileState, s);
          if (U.length > 0) {
            let N = Nt();
            let W = 5;
            let j = U.slice(0, 5).map(V => m6a.relative(N, V) || V).join(", ");
            let z = U.length > 5 ? ` and ${U.length - 5} more` : "";
            F = `[This command modified ${U.length} ${un(U.length, "file")} you've previously read: ${j}${z}. Call Read before editing.]`;
          }
        }
        if (!f && !O && !h.backgroundTaskId) {
          await aMa(e.command, t.readFileState, i.signal, h.code);
        }
        return {
          data: {
            stdout: M,
            stderr: d,
            interrupted: f,
            isImage: O,
            returnCodeInterpretation: p?.message,
            noOutputExpected: n6p(e.command),
            backgroundTaskId: h.backgroundTaskId,
            backgroundedByUser: h.backgroundedByUser,
            dangerouslyDisableSandbox: "dangerouslyDisableSandbox" in e ? e.dangerouslyDisableSandbox : undefined,
            persistedOutputPath: C,
            persistedOutputSize: x,
            staleReadFileStateHint: F,
            ghRateLimitHint: L,
            gitOperation: P
          }
        };
      },
      renderToolUseErrorMessage: IGa,
      isResultTruncated(e, {
        columns: t
      }) {
        if (e.isImage) {
          return false;
        }
        return EU(e.stdout, t) || EU(e.stderr, t);
      }
    });
  });
  function E8e() {
    return g6a().value;
  }
  function g6a() {
    let e = gI.CLAUDE_CODE_AUTO_MODE_EDIT_REMOVAL;
    if (e !== undefined) {
      return {
        value: e,
        src: "env"
      };
    }
    let t = getFeatureValue_CACHED_MAY_BE_STALE("tengu_auto_mode_config", {});
    return typeof t?.editRemovalVisibility === "boolean" ? {
      value: t.editRemovalVisibility,
      src: "gb"
    } : {
      value: false,
      src: "default"
    };
  }
  function A6t() {
    return y6a().value;
  }
  function y6a() {
    let e = gI.CLAUDE_CODE_AUTO_MODE_EDIT_REMOVAL_CAP;
    if (e !== undefined) {
      return {
        value: e,
        src: "env"
      };
    }
    let n = getFeatureValue_CACHED_MAY_BE_STALE("tengu_auto_mode_config", {})?.editRemovalCap;
    return typeof n === "number" && Number.isFinite(n) ? {
      value: n,
      src: "gb"
    } : {
      value: 3000,
      src: "default"
    };
  }
  var pgt = __lazy(() => {
    $n();
    d_();
  });
  function _6a(e, t, n) {
    if (!isClaudeSettingsPath(e)) {
      return null;
    }
    if (!oLr(t).isValid) {
      return null;
    }
    let o = n();
    let s = oLr(o);
    if (!s.isValid) {
      return {
        result: false,
        message: `Claude Code settings.json validation failed after edit:
${s.error}

Full schema:
${s.fullSchema}
IMPORTANT: Do not update the env unless explicitly instructed to do so.`,
        errorCode: 10
      };
    }
    return null;
  }
  var b6a = __lazy(() => {
    wm();
    WMt();
  });
  function f6p(e) {
    return typeof e === "object" && e !== null && !Array.isArray(e);
  }
  function S6a(e) {
    if (!f6p(e)) {
      return null;
    }
    let t = {
      ...e
    };
    let n = [];
    if ("replace_name" in t) {
      let r = t.replace_name;
      if (!("replace_all" in t)) {
        t.replace_all = r === true || r === "true";
      }
      delete t.replace_name;
      n.push("alias_replace_name");
    }
    if ("path" in t && !("file_path" in t) && typeof t.path === "string") {
      t.file_path = t.path;
      delete t.path;
      n.push("path");
    }
    if ("old_str" in t && !("old_string" in t) && typeof t.old_str === "string") {
      t.old_string = t.old_str;
      delete t.old_str;
      n.push("old_str");
    }
    if ("new_str" in t && !("new_string" in t) && typeof t.new_str === "string") {
      t.new_string = t.new_str;
      delete t.new_str;
      n.push("new_str");
    }
    return n.length ? {
      input: t,
      shapeClass: n.join(",")
    } : null;
  }
  function h6p() {
    return `
- You must use your \`${"Read"}\` tool at least once in the conversation before editing. This tool will error if you attempt an edit without reading the file.`;
  }
  function T6a(e) {
    return g6p(e);
  }
  function g6p(e) {
    let t = h5e();
    if (_g(e)) {
      return `Performs exact string replacement in a file.

- You must ${"Read"} the file in this conversation before editing, or the call will fail.
- \`old_string\` must match the file exactly, including indentation, and be unique \u2014 the edit fails otherwise. Strip the Read line prefix (${t ? "line number + a single tab or `:`" : "line number + tab"}) before matching.
- \`replace_all: true\` replaces every occurrence instead.`;
    }
    let n = t ? "line number + a single separator character (a tab or `:`)" : "line number + tab";
    let r = getFeatureValue_CACHED_MAY_BE_STALE("tengu_edit_minimalanchor_jrn", false) ? "\n- Keep `old_string` minimal \u2014 usually 1-3 lines, only enough to be unique in the file. Including excess context wastes tokens and is an error.\n- The edit will FAIL if `old_string` is not unique in the file. In that case, add the minimum extra context needed for uniqueness, or use `replace_all` to change every instance." : "\n- The edit will FAIL if `old_string` is not unique in the file. Either provide a larger string with more surrounding context to make it unique or use `replace_all` to change every instance of `old_string`.";
    return `Performs exact string replacements in files.

Usage:${h6p()}
- When editing text from Read tool output, ensure you preserve the exact indentation (tabs/spaces) as it appears AFTER the line number prefix. The line number prefix format is: ${n}. Everything after that is the actual file content to match. Never include any part of the line number prefix in the old_string or new_string.
- ALWAYS prefer editing existing files in the codebase. NEVER write new files unless explicitly required.
- Only use emojis if the user explicitly requests it. Avoid adding emojis to files unless asked.${r}
- Use \`replace_all\` for replacing and renaming strings across the file. This parameter is useful if you want to rename a variable for instance.`;
  }
  var E6a = __lazy(() => {
    $n();
    AI();
    VDe();
    Tm();
  });
  async function y6p(e) {
    try {
      let t = await eje(e);
      return {
        content: t.content,
        fileExists: true,
        encoding: t.encoding,
        lineEndings: t.lineEndings
      };
    } catch (t) {
      if (fn(t)) {
        return {
          content: "",
          fileExists: false,
          encoding: "utf8",
          lineEndings: "LF"
        };
      }
      throw t;
    }
  }
  function two(e, t, n) {
    if (t === "") {
      return "no_match";
    }
    let r = AMe(e, t);
    if (!r) {
      return "no_match";
    }
    if (!n) {
      let o = e.indexOf(r);
      if (e.indexOf(r, o + r.length) !== -1) {
        return "ambiguous";
      }
    }
    return "applies";
  }
  function w6a(e) {
    return e === "applies" && getFeatureValue_CACHED_MAY_BE_STALE("tengu_cedar_sundial", false);
  }
  function _6p({
    absoluteFilePath: e,
    fileContents: t,
    lastRead: n,
    oldString: r,
    replaceAll: o,
    model: s
  }) {
    if (!n) {
      if (getFeatureValue_CACHED_MAY_BE_STALE(Vit("tengu_velvet_hammer", s), false)) {
        return false;
      }
      throw new Rbe("File has not been read yet. Read it first before writing to it.");
    }
    if (Fte(e) <= n.timestamp) {
      return false;
    }
    if ((n.offset ?? 1) <= 1 && n.limit === undefined && vde(n, t)) {
      return false;
    }
    if (w6a(two(t, r, o))) {
      return true;
    }
    throw new Rbe("File content has changed since it was last read. This commonly happens when a linter or formatter run via Bash rewrites the file. Call Read on this file to refresh, then retry the edit.");
  }
  function C6a(e) {
    switch (e) {
      case "no_match":
        return "errorCode8";
      case "ambiguous":
        return "errorCode9";
      case "applies":
        return "success";
    }
  }
  function b6p(e, t, n) {
    return C6a(two(e, t, n));
  }
  var UEe;
  var iR;
  var v8e = __lazy(() => {
    Ot();
    $yo();
    $n();
    cJ();
    K6e();
    _ht();
    Tpe();
    _5e();
    MEo();
    T9();
    ci();
    S6t();
    Sl();
    vo();
    je();
    Qde();
    pr();
    gn();
    dt();
    Zl();
    Jq();
    H9n();
    KB();
    qI();
    cs();
    Qht();
    AI();
    Eo();
    ku();
    pgt();
    wm();
    b6a();
    Tm();
    Ay();
    E6a();
    i9t();
    zgo();
    IMe();
    UEe = require("path");
    iR = Xs({
      name: "Edit",
      ruleContentField: "file_path",
      searchHint: "modify file contents in place",
      maxResultSizeChars: 1e5,
      strict: true,
      async description() {
        return "A tool for editing files";
      },
      async prompt({
        model: e
      }) {
        return T6a(e);
      },
      userFacingName: o3n,
      getToolUseSummary: Vgo,
      getActivityDescription(e) {
        let t = Vgo(e);
        return t ? `Editing ${t}` : "Editing file";
      },
      get inputSchema() {
        return z3n();
      },
      get outputSchema() {
        return Byo();
      },
      coerceInput: S6a,
      stripForStorage(e) {
        if (typeof e !== "object" || e === null) {
          return e;
        }
        if ((e.originalFile ?? "") === "") {
          return e;
        }
        return {
          ...e,
          originalFile: ""
        };
      },
      toAutoClassifierInput(e) {
        if (!E8e()) {
          return `${e.file_path}: ${e.new_string}`;
        }
        let t = A6t();
        let n = e.old_string;
        let r = t > 0 && typeof n === "string" && n.length > t;
        return {
          file_path: e.file_path,
          adds: e.new_string,
          removes: r ? n.slice(0, t) : n,
          ...(t > 0 && {
            removesTruncated: r
          }),
          ...(e.replace_all === true && {
            replaceAll: true
          })
        };
      },
      getPath(e) {
        return e.file_path;
      },
      backfillObservableInput(e) {
        if (typeof e.file_path === "string") {
          e.file_path = us(e.file_path);
        }
      },
      async preparePermissionMatcher({
        file_path: e
      }) {
        return t => matchesPathRule(t, e);
      },
      async checkPermissions(e, t) {
        let n = us(e.file_path);
        unt(t.toolUseId, n, fg(n));
        return checkWritePermissionForTool(iR, e, getToolPermissionContext(t));
      },
      renderToolUseMessage: WOa,
      renderToolResultMessage: GOa,
      renderToolUseRejectedMessage: VOa,
      renderToolUseErrorMessage: zOa,
      async validateInput(e, t) {
        let {
          file_path: n,
          old_string: r,
          new_string: o,
          replace_all: s = false
        } = e;
        let i = us(n);
        let a = Jht(i, t);
        if (a) {
          return {
            result: false,
            message: a,
            errorCode: 12
          };
        }
        let l = ZGn(i, o);
        if (l) {
          return {
            result: false,
            message: l,
            errorCode: 0
          };
        }
        if (r === o) {
          return {
            result: false,
            behavior: "ask",
            message: "No changes to make: old_string and new_string are exactly the same.",
            errorCode: 1
          };
        }
        if (matchingRuleForInput(i, getToolPermissionContext(t), "edit", "deny") !== null) {
          return {
            result: false,
            behavior: "ask",
            message: "File is in a directory that is denied by your permission settings.",
            errorCode: 2
          };
        }
        if (i.startsWith("\\\\") || i.startsWith("//")) {
          return {
            result: true
          };
        }
        let u = zt();
        try {
          let {
            size: y,
            mode: _
          } = await u.stat(i);
          if (y > 1073741824) {
            return {
              result: false,
              behavior: "ask",
              message: `File is too large to edit (${formatFileSize(y)}). Maximum editable file size is ${formatFileSize(1073741824)}.`,
              errorCode: 10
            };
          }
          if (fnt(_)) {
            return {
              result: false,
              behavior: "ask",
              message: "File is read-only \u2014 it has not been opened for edit in Perforce. Run `p4 edit <file>` to check it out, then retry. Do not chmod the file writable; that bypasses Perforce tracking.",
              errorCode: 11
            };
          }
        } catch (y) {
          if (!fn(y)) {
            throw y;
          }
        }
        let d;
        try {
          let y = await u.readFileBytes(i);
          let _ = y.length >= 2 && y[0] === 255 && y[1] === 254 ? "utf16le" : "utf8";
          d = y.toString(_).replaceAll(`\r
`, `
`);
        } catch (y) {
          if (fn(y)) {
            d = null;
          } else {
            throw y;
          }
        }
        if (d === null) {
          if (r === "") {
            return {
              result: true
            };
          }
          let y = vke(i);
          let _ = await oY(i);
          let b = `File does not exist. ${"Note: your current working directory is"} ${Nt()}.`;
          if (_) {
            b += ` Did you mean ${_}?`;
          } else if (y) {
            b += ` Did you mean ${y}?`;
          }
          return {
            result: false,
            behavior: "ask",
            message: b,
            errorCode: 4
          };
        }
        if (r === "") {
          if (d.trim() !== "") {
            return {
              result: false,
              behavior: "ask",
              message: "Cannot create new file - file already exists.",
              errorCode: 3
            };
          }
          return {
            result: true
          };
        }
        if (i.endsWith(".ipynb")) {
          return {
            result: false,
            behavior: "ask",
            message: `File is a Jupyter Notebook. Use the ${"NotebookEdit"} to edit this file.`,
            errorCode: 5
          };
        }
        let p = t.readFileState.get(i);
        if (!p || p.isPartialView) {
          let y = getCanonicalName(getMainLoopModel_export(t));
          let _ = Git(y);
          let b = getFeatureValue_CACHED_MAY_BE_STALE(Vit("tengu_velvet_hammer", y), false);
          if (logEvent("tengu_edit_tool_not_read_hypothetical", {
            wouldHaveResult: b6p(d, r, s),
            isPartialView: p?.isPartialView === true,
            isFilePathAbsolute: UEe.isAbsolute(n),
            guardSkipped: b,
            modelBucket: _
          }), !b) {
            return {
              result: false,
              behavior: "ask",
              message: "File has not been read yet. Read it first before writing to it.",
              meta: {
                isFilePathAbsolute: String(UEe.isAbsolute(n))
              },
              errorCode: 6
            };
          }
        }
        if (p) {
          if (Fte(i) > p.timestamp) {
            if ((p.offset ?? 1) <= 1 && p.limit === undefined && vde(p, d)) {
              ;
            } else {
              let b = two(d, r, s);
              let S = w6a(b);
              if (logEvent("tengu_edit_tool_stale_read", {
                wouldHaveResult: C6a(b),
                recovered: S
              }), !S) {
                return {
                  result: false,
                  behavior: "ask",
                  message: "File has been modified since read, either by the user or by a linter. Read it again before attempting to write it.",
                  errorCode: 7
                };
              }
            }
          }
        }
        let m = d;
        let f = AMe(m, r);
        if (!f) {
          let y = NOa(r) ? `
(note: Edit also tried swapping \\uXXXX escapes and their characters; neither form matched, so the mismatch is likely elsewhere in old_string. Re-read the file and copy the exact surrounding text.)` : "";
          return {
            result: false,
            behavior: "ask",
            message: `String to replace not found in file.
String: ${r}${y}`,
            meta: {
              isFilePathAbsolute: String(UEe.isAbsolute(n))
            },
            errorCode: 8
          };
        }
        let h = m.split(f).length - 1;
        if (h > 1 && !s) {
          return {
            result: false,
            behavior: "ask",
            message: `Found ${h} matches of the string to replace, but replace_all is false. To replace all occurrences, set replace_all to true. To replace only one occurrence, please provide more context to uniquely identify the instance.
String: ${r}`,
            meta: {
              isFilePathAbsolute: String(UEe.isAbsolute(n)),
              actualOldString: f
            },
            errorCode: 9
          };
        }
        let g = _6a(i, m, () => s ? m.replaceAll(f, o) : m.replace(f, o));
        if (g !== null) {
          return g;
        }
        return {
          result: true,
          meta: {
            actualOldString: f
          }
        };
      },
      inputsEquivalent(e, t) {
        return qOa({
          file_path: e.file_path,
          edits: [{
            old_string: e.old_string,
            new_string: e.new_string,
            replace_all: e.replace_all ?? false
          }]
        }, {
          file_path: t.file_path,
          edits: [{
            old_string: t.old_string,
            new_string: t.new_string,
            replace_all: t.replace_all ?? false
          }]
        });
      },
      async call(e, t, n, r) {
        let {
          options: o,
          permissionLayers: s,
          readFileState: i,
          userModified: a,
          getFileHistoryState: l,
          applyFileHistoryOp: c,
          dynamicSkillDirTriggers: u
        } = t;
        let {
          file_path: d,
          old_string: p,
          new_string: m,
          replace_all: f = false
        } = e;
        let h = zt();
        let g = us(d);
        let y = dnt(t, g);
        let _ = Nt();
        if (!Me.CLAUDE_CODE_SIMPLE) {
          let O = await Vht([g], _);
          if (O.length > 0) {
            if (u) {
              for (let M of O) {
                if (!u.includes(M)) {
                  u.push(M);
                }
              }
            }
            INe(O).catch(() => {});
          }
          zht([g], _);
        }
        if (await vEe.beforeFileEdited(g), fileHistoryEnabled()) {
          await fileHistoryTrackEdit(l, c, g, r.uuid);
        }
        let {
          originalFileContents: b,
          actualOldString: S,
          updatedFile: E,
          patch: C,
          staleRecovered: x
        } = await Tke(g, async () => {
          let {
            content: O,
            fileExists: M,
            encoding: L,
            lineEndings: P
          } = await y6p(g);
          let F = M && _6p({
            absoluteFilePath: g,
            fileContents: O,
            lastRead: i.get(g),
            oldString: p,
            replaceAll: f,
            model: getCanonicalName(getMainLoopModel_export({
              options: o,
              permissionLayers: s
            }))
          });
          let H = AMe(O, p) || p;
          let U = LOa(p, H, Mmt(p, H, m));
          let N = HGt({
            filePath: g,
            fileContents: O,
            oldString: H,
            newString: U,
            replaceAll: f
          });
          let W = K3n(g, N.updatedFile);
          let j = W === N.updatedFile ? N.patch : xMe({
            filePath: g,
            oldContent: O,
            newContent: W,
            convertTabs: true
          });
          Ske(g, y);
          await h.mkdir(UEe.dirname(g));
          let z = await Eke(g, W, L, P);
          i.set(g, {
            content: W,
            timestamp: z,
            offset: undefined,
            limit: undefined
          });
          return {
            originalFileContents: O,
            actualOldString: H,
            updatedFile: W,
            patch: j,
            staleRecovered: F
          };
        });
        let A = vNe();
        if (A) {
          MGn(g);
          NGn(g);
          A.changeFile(g, E).catch(O => {
            logForDebugging(`LSP: Failed to notify server of file change for ${g}: ${O.message}`, {
              level: "error"
            });
          });
          A.saveFile(g).catch(O => {
            logForDebugging(`LSP: Failed to notify server of file save for ${g}: ${O.message}`, {
              level: "error"
            });
          });
        }
        if (KDe(g, b, E), g.endsWith(`${UEe.sep}CLAUDE.md`)) {
          logEvent("tengu_write_claudemd", {});
        }
        BGt(C, r.message.model);
        Goe({
          operation: "edit",
          tool: "FileEditTool",
          filePath: g
        });
        logEvent("tengu_edit_string_lengths", {
          oldStringBytes: Buffer.byteLength(p, "utf8"),
          newStringBytes: Buffer.byteLength(m, "utf8"),
          replaceAll: f
        });
        let k;
        if (st(process.env.CLAUDE_CODE_REMOTE)) {
          let O = Date.now();
          let M = await G9n(g);
          if (M) {
            k = M;
          }
          logEvent("tengu_tool_use_diff_computed", {
            isEditTool: true,
            durationMs: Date.now() - O,
            hasDiff: !!M
          });
        }
        return {
          data: {
            filePath: d,
            oldString: S,
            newString: m,
            originalFile: b,
            structuredPatch: C,
            userModified: a ?? false,
            replaceAll: f,
            ...(x && {
              staleRecovered: true
            }),
            ...(k && {
              gitDiff: k
            })
          }
        };
      },
      mapToolResultToToolResultBlockParam(e, t) {
        let {
          filePath: n,
          userModified: r,
          replaceAll: o,
          staleRecovered: s
        } = e;
        let i = r ? ".  The user modified your proposed changes before accepting them. " : "";
        let a = s ? " (note: the file had been modified on disk since you last read it \u2014 the edit applied cleanly, but the file contains other changes not in your context. Read it before edits that depend on surrounding content.)" : r ? "" : " (file state is current in your context \u2014 no need to Read it back)";
        if (o) {
          return {
            tool_use_id: t,
            type: "tool_result",
            content: `The file ${n} has been updated${i}. All occurrences were successfully replaced.${a}`
          };
        }
        return {
          tool_use_id: t,
          type: "tool_result",
          content: `The file ${n} has been updated successfully${i}.${a}`
        };
      }
    });
  });
  function T6p(e) {
    let t = 0;
    for (let n of e) {
      if (!n) {
        continue;
      }
      if (t += (n.text?.length ?? 0) + (n.image?.image_data.length ?? 0), t > 1e4) {
        return true;
      }
    }
    return false;
  }
  function nwo(e) {
    if (!e) {
      return "";
    }
    let t = Array.isArray(e) ? e.join("") : e;
    let {
      truncatedContent: n
    } = OGa(t);
    return n;
  }
  function E6p(e) {
    for (let t of ["image/png", "image/jpeg"]) {
      let n = e[t];
      if (typeof n !== "string") {
        continue;
      }
      let r = n.replace(/\s/g, "");
      if (tX(Buffer.from(r, "base64")) === null) {
        return;
      }
      return {
        image_data: r,
        media_type: t
      };
    }
    return;
  }
  function v6p(e) {
    switch (e.output_type) {
      case "stream":
        return {
          output_type: e.output_type,
          text: nwo(e.text)
        };
      case "execute_result":
      case "display_data":
        return {
          output_type: e.output_type,
          text: nwo(e.data?.["text/plain"]),
          image: e.data && E6p(e.data)
        };
      case "error":
        return {
          output_type: e.output_type,
          text: nwo(`${e.ename}: ${e.evalue}
${e.traceback.join(`
`)}`)
        };
    }
  }
  function R6a(e, t, n, r) {
    let o = e.id ?? `cell-${t}`;
    let s = {
      cellType: e.cell_type,
      source: Array.isArray(e.source) ? e.source.join("") : e.source,
      execution_count: e.cell_type === "code" ? e.execution_count || undefined : undefined,
      cell_id: o
    };
    if (e.cell_type === "code") {
      s.language = n;
    }
    if (e.cell_type === "code" && e.outputs?.length) {
      let i = e.outputs.map(v6p);
      if (!r && T6p(i)) {
        let a = Pu() ? `${"Bash"} with: cat <notebook_path> | jq '.cells[${t}].outputs'` : `${"PowerShell"} with: Get-Content <notebook_path> | ConvertFrom-Json | Select-Object -ExpandProperty cells | Select-Object -Index ${t} | Select-Object -ExpandProperty outputs`;
        s.outputs = [{
          output_type: "stream",
          text: `Outputs are too large to include. Use ${a}`
        }];
      } else {
        s.outputs = i;
      }
    }
    return s;
  }
  function w6p(e) {
    let t = [];
    if (e.cellType !== "code") {
      t.push(`<cell_type>${e.cellType}</cell_type>`);
    }
    if (e.language !== "python" && e.cellType === "code") {
      t.push(`<language>${e.language}</language>`);
    }
    return {
      text: `<cell id="${e.cell_id}">${t.join("")}${e.source}</cell id="${e.cell_id}">`,
      type: "text"
    };
  }
  function C6p(e) {
    let t = [];
    if (e.text) {
      t.push({
        text: `
${e.text}`,
        type: "text"
      });
    }
    if (e.image) {
      t.push({
        type: "image",
        source: {
          data: e.image.image_data,
          media_type: e.image.media_type,
          type: "base64"
        }
      });
    }
    return t;
  }
  function R6p(e) {
    let t = w6p(e);
    let n = e.outputs?.flatMap(C6p);
    return [t, ...(n ?? [])];
  }
  async function x6a(e, t) {
    let n = us(e);
    let o = (await zt().readFileBytes(n)).toString("utf-8");
    let s;
    try {
      s = qt(o);
    } catch (a) {
      throw new Y9n(`Notebook file is not valid JSON (it may be truncated, corrupted, or still being written): ${a instanceof Error ? a.message : String(a)}`);
    }
    if (!Array.isArray(s?.cells) || s.cells.some(a => a === null || typeof a !== "object")) {
      throw new Y9n('Notebook file is not a valid Jupyter notebook (top-level "cells" must be an array of cell objects).');
    }
    let i = s.metadata?.language_info?.name ?? "python";
    if (t) {
      let a = s.cells.find(l => l.id === t);
      if (!a) {
        throw new Y9n(`Cell with ID "${t}" not found in notebook`);
      }
      return [R6a(a, s.cells.indexOf(a), i, true)];
    }
    return s.cells.map((a, l) => R6a(a, l, i, false));
  }
  function k6a(e, t) {
    let n = e.flatMap(R6p);
    return {
      tool_use_id: t,
      type: "tool_result",
      content: n.reduce((r, o) => {
        if (r.length === 0) {
          return [o];
        }
        let s = r.at(-1);
        if (s && s.type === "text" && o.type === "text") {
          s.text += `
` + o.text;
          return r;
        }
        r.push(o);
        return r;
      }, [])
    };
  }
  function P6t(e) {
    let t = e.match(/^cell-(\d+)$/);
    if (t && t[1]) {
      let n = parseInt(t[1], 10);
      return isNaN(n) ? undefined : n;
    }
    return;
  }
  var Y9n;
  var J9n = __lazy(() => {
    S9n();
    ku();
    Jf();
    Y9n = class Y9n extends Error {
      constructor(e) {
        super(e);
        this.name = "NotebookReadError";
      }
    };
  });
  var I6a;
  var P6a = __lazy(() => {
    Tm();
    I6a = `Replaces, inserts, or deletes a single cell in a Jupyter notebook (.ipynb file).

Usage:
- You must use the ${"Read"} tool on the notebook in this conversation before editing \u2014 this tool will fail otherwise.
- \`notebook_path\` must be an absolute path.
- \`cell_id\` is the \`id\` attribute shown in the ${"Read"} tool's \`<cell id="...">\` output. It is required for \`replace\` and \`delete\`.
- \`edit_mode\` defaults to \`replace\`. Use \`insert\` to add a new cell after the cell with the given \`cell_id\` (or at the beginning of the notebook if \`cell_id\` is omitted) \u2014 \`cell_type\` is required when inserting. Use \`delete\` to remove the cell.`;
  });
  function M6a(e) {
    let t = O6a.c(20);
    let {
      notebook_path: n,
      cell_id: r,
      new_source: o,
      cell_type: s,
      edit_mode: i,
      verbose: a
    } = e;
    let l = i === undefined ? "replace" : i;
    let c = l === "delete" ? "delete" : `${l} cell in`;
    let u;
    if (t[0] !== c) {
      u = xpe.jsxs(Text, {
        color: "subtle",
        children: ["User rejected ", c, " "]
      });
      t[0] = c;
      t[1] = u;
    } else {
      u = t[1];
    }
    let d;
    if (t[2] !== n || t[3] !== a) {
      d = a ? n : D6a.relative(Nt(), n);
      t[2] = n;
      t[3] = a;
      t[4] = d;
    } else {
      d = t[4];
    }
    let p;
    if (t[5] !== d) {
      p = xpe.jsx(Text, {
        bold: true,
        color: "subtle",
        children: d
      });
      t[5] = d;
      t[6] = p;
    } else {
      p = t[6];
    }
    let m;
    if (t[7] !== r) {
      m = xpe.jsxs(Text, {
        color: "subtle",
        children: [" at cell ", r]
      });
      t[7] = r;
      t[8] = m;
    } else {
      m = t[8];
    }
    let f;
    if (t[9] !== u || t[10] !== p || t[11] !== m) {
      f = xpe.jsxs(gXd, {
        flexDirection: "row",
        children: [u, p, m]
      });
      t[9] = u;
      t[10] = p;
      t[11] = m;
      t[12] = f;
    } else {
      f = t[12];
    }
    let h;
    if (t[13] !== s || t[14] !== l || t[15] !== o) {
      h = l !== "delete" && xpe.jsx(gXd, {
        marginTop: 1,
        flexDirection: "column",
        children: xpe.jsx(w$, {
          code: o,
          filePath: s === "markdown" ? "file.md" : "file.py",
          dim: true
        })
      });
      t[13] = s;
      t[14] = l;
      t[15] = o;
      t[16] = h;
    } else {
      h = t[16];
    }
    let g;
    if (t[17] !== f || t[18] !== h) {
      g = xpe.jsx(Vn, {
        children: xpe.jsxs(gXd, {
          flexDirection: "column",
          children: [f, h]
        })
      });
      t[17] = f;
      t[18] = h;
      t[19] = g;
    } else {
      g = t[19];
    }
    return g;
  }
  var O6a;
  var D6a;
  var xpe;
  var N6a = __lazy(() => {
    vo();
    et();
    SMe();
    Wl();
    O6a = __toESM(pt(), 1);
    D6a = require("path");
    xpe = __toESM(ie(), 1);
  });
  function rwo(e) {
    if (!e?.notebook_path) {
      return null;
    }
    return Pd(e.notebook_path);
  }
  function L6a({
    notebook_path: e,
    cell_id: t,
    new_source: n,
    cell_type: r,
    edit_mode: o
  }, {
    verbose: s
  }) {
    if (!e || !n || !r) {
      return null;
    }
    let i = s ? e : Pd(e);
    if (s) {
      return JI.jsxs(JI.Fragment, {
        children: [JI.jsx(vM, {
          filePath: e,
          children: i
        }), `@${t}, content: ${n.slice(0, 30)}\u2026, cell_type: ${r}, edit_mode: ${o ?? "replace"}`]
      });
    }
    return JI.jsxs(JI.Fragment, {
      children: [JI.jsx(vM, {
        filePath: e,
        children: i
      }), `@${t}`]
    });
  }
  function F6a(e, {
    verbose: t
  }) {
    return JI.jsx(M6a, {
      notebook_path: e.notebook_path,
      cell_id: e.cell_id,
      new_source: e.new_source,
      cell_type: e.cell_type,
      edit_mode: e.edit_mode,
      verbose: t
    });
  }
  function U6a(e, {
    verbose: t
  }) {
    if (!t && typeof e === "string" && Nl(e, "tool_use_error")) {
      return JI.jsx(Vn, {
        children: JI.jsx(Text, {
          color: "error",
          children: "Error editing notebook"
        })
      });
    }
    return JI.jsx(Rw, {
      result: e,
      verbose: t
    });
  }
  function B6a({
    cell_id: e,
    new_source: t,
    error: n
  }) {
    if (n) {
      return JI.jsx(Vn, {
        children: JI.jsx(Text, {
          color: "error",
          children: n
        })
      });
    }
    return JI.jsx(Vn, {
      children: JI.jsxs(gXd, {
        flexDirection: "column",
        children: [JI.jsxs(Text, {
          children: ["Updated cell ", JI.jsx(Text, {
            bold: true,
            children: e
          }), ":"]
        }), JI.jsx(gXd, {
          marginLeft: 2,
          children: JI.jsx(w$, {
            code: t,
            filePath: "notebook.py"
          })
        })]
      })
    });
  }
  var JI;
  var $6a = __lazy(() => {
    ro();
    KG();
    XTe();
    SMe();
    Wl();
    N6a();
    et();
    Zl();
    JI = __toESM(ie(), 1);
  });
  var H6a;
  var j6a;
  var x6p;
  var k6p;
  var EQ;
  var O6t = __lazy(() => {
    Jq();
    ci();
    S6t();
    Sl();
    dt();
    Zl();
    KB();
    Gd();
    J9n();
    ku();
    pgt();
    wm();
    P6a();
    $6a();
    H6a = require("crypto");
    j6a = require("path");
    x6p = we(() => v.strictObject({
      notebook_path: v.string().describe("The absolute path to the Jupyter notebook file to edit (must be absolute, not relative)"),
      cell_id: v.string().optional().describe("The ID of the cell to edit. When inserting a new cell, the new cell will be inserted after the cell with this ID, or at the beginning if not specified."),
      new_source: v.string().describe("The new source for the cell"),
      cell_type: v.enum(["code", "markdown"]).optional().describe("The type of the cell (code or markdown). If not specified, it defaults to the current cell type. If using edit_mode=insert, this is required."),
      edit_mode: v.enum(["replace", "insert", "delete"]).optional().describe("The type of edit to make (replace, insert, delete). Defaults to replace.")
    }));
    k6p = we(() => v.object({
      new_source: v.string().describe("The new source code that was written to the cell"),
      old_source: v.string().optional().describe("The previous cell source (replace/delete only). Enables cell-relative diff rendering without re-reading the notebook."),
      cell_id: v.string().optional().describe("The ID of the cell that was edited"),
      cell_type: v.enum(["code", "markdown"]).describe("The type of the cell"),
      language: v.string().describe("The programming language of the notebook"),
      edit_mode: v.string().describe("The edit mode that was used"),
      error: v.string().optional().describe("Error message if the operation failed"),
      notebook_path: v.string().describe("The path to the notebook file"),
      original_file: v.string().describe("The original notebook content before modification"),
      updated_file: v.string().describe("The updated notebook content after modification")
    }));
    EQ = Xs({
      name: "NotebookEdit",
      ruleContentField: "notebook_path",
      searchHint: "edit Jupyter notebook cells (.ipynb)",
      maxResultSizeChars: 1e5,
      shouldDefer: true,
      async description() {
        return "Edit a cell in a Jupyter notebook \u2014 replace, insert, or delete.";
      },
      async prompt() {
        return I6a;
      },
      backfillObservableInput(e) {
        if (typeof e.notebook_path === "string") {
          e.notebook_path = us(e.notebook_path);
        }
      },
      userFacingName() {
        return "Edit Notebook";
      },
      getToolUseSummary: rwo,
      getActivityDescription(e) {
        let t = rwo(e);
        return t ? `Editing notebook ${t}` : "Editing notebook";
      },
      get inputSchema() {
        return x6p();
      },
      get outputSchema() {
        return k6p();
      },
      toAutoClassifierInput(e) {
        let t = e.edit_mode ?? "replace";
        if (!E8e()) {
          return `${e.notebook_path} ${t}: ${e.new_source}`;
        }
        return {
          notebook_path: e.notebook_path,
          mode: t,
          ...(e.cell_id !== undefined && {
            cell_id: e.cell_id
          }),
          ...(t !== "delete" && e.cell_type !== undefined && {
            cell_type: e.cell_type
          }),
          ...(t === "delete" ? {
            ignored_source: e.new_source
          } : {
            adds: e.new_source
          })
        };
      },
      getPath(e) {
        return e.notebook_path;
      },
      async preparePermissionMatcher({
        notebook_path: e
      }) {
        return t => matchesPathRule(t, e);
      },
      async checkPermissions(e, t) {
        let n = us(e.notebook_path);
        unt(t.toolUseId, n, fg(n));
        return checkWritePermissionForTool(EQ, e, getToolPermissionContext(t));
      },
      mapToolResultToToolResultBlockParam({
        cell_id: e,
        edit_mode: t,
        new_source: n,
        error: r
      }, o) {
        if (r) {
          return {
            tool_use_id: o,
            type: "tool_result",
            content: r,
            is_error: true
          };
        }
        switch (t) {
          case "replace":
            return {
              tool_use_id: o,
              type: "tool_result",
              content: `Updated cell ${e} with ${n}`
            };
          case "insert":
            return {
              tool_use_id: o,
              type: "tool_result",
              content: `Inserted cell ${e} with ${n}`
            };
          case "delete":
            return {
              tool_use_id: o,
              type: "tool_result",
              content: `Deleted cell ${e}`
            };
          default:
            return {
              tool_use_id: o,
              type: "tool_result",
              content: "Unknown edit mode"
            };
        }
      },
      renderToolUseMessage: L6a,
      renderToolUseRejectedMessage: F6a,
      renderToolUseErrorMessage: U6a,
      renderToolResultMessage: B6a,
      async validateInput({
        notebook_path: e,
        cell_type: t,
        cell_id: n,
        edit_mode: r = "replace"
      }, o) {
        let s = us(e);
        let i = Jht(s, o);
        if (i) {
          return {
            result: false,
            message: i,
            errorCode: 12
          };
        }
        if (s.startsWith("\\\\") || s.startsWith("//")) {
          return {
            result: true
          };
        }
        if (j6a.extname(s) !== ".ipynb") {
          return {
            result: false,
            message: "File must be a Jupyter notebook (.ipynb file). For editing other file types, use the FileEdit tool.",
            errorCode: 2
          };
        }
        if (r !== "replace" && r !== "insert" && r !== "delete") {
          return {
            result: false,
            message: "Edit mode must be replace, insert, or delete.",
            errorCode: 4
          };
        }
        if (r === "insert" && !t) {
          return {
            result: false,
            message: "Cell type is required when using edit_mode=insert.",
            errorCode: 5
          };
        }
        let a = o.readFileState.get(s);
        if (!a) {
          return {
            result: false,
            message: "File has not been read yet. Read it first before writing to it.",
            errorCode: 9
          };
        }
        if (jMr()) {
          try {
            let {
              mode: u
            } = await zt().stat(s);
            if (fnt(u)) {
              return {
                result: false,
                message: "File is read-only \u2014 it has not been opened for edit in Perforce. Run `p4 edit <file>` to check it out, then retry. Do not chmod the file writable; that bypasses Perforce tracking.",
                errorCode: 11
              };
            }
          } catch (u) {
            if (!fn(u)) {
              throw u;
            }
          }
        }
        if (Fte(s) > a.timestamp) {
          return {
            result: false,
            message: "File has been modified since read, either by the user or by a linter. Read it again before attempting to write it.",
            errorCode: 10
          };
        }
        let l;
        try {
          l = Eye(s).content;
        } catch (u) {
          if (fn(u)) {
            return {
              result: false,
              message: "Notebook file does not exist.",
              errorCode: 1
            };
          }
          throw u;
        }
        let c = Ba(l);
        if (!c) {
          return {
            result: false,
            message: "Notebook is not valid JSON.",
            errorCode: 6
          };
        }
        if (!n) {
          if (r !== "insert") {
            return {
              result: false,
              message: "Cell ID must be specified when not inserting a new cell.",
              errorCode: 7
            };
          }
        } else if (c.cells.findIndex(d => d.id === n) === -1) {
          let d = P6t(n);
          if (d !== undefined) {
            if (!c.cells[d]) {
              return {
                result: false,
                message: `Cell with index ${d} does not exist in notebook.`,
                errorCode: 7
              };
            }
          } else {
            return {
              result: false,
              message: `Cell with ID "${n}" not found in notebook.`,
              errorCode: 8
            };
          }
        }
        return {
          result: true
        };
      },
      async call({
        notebook_path: e,
        new_source: t,
        cell_id: n,
        cell_type: r,
        edit_mode: o
      }, s, i, a) {
        let {
          readFileState: l,
          getFileHistoryState: c,
          applyFileHistoryOp: u
        } = s;
        let d = us(e);
        let p = dnt(s, d);
        if (fileHistoryEnabled()) {
          await fileHistoryTrackEdit(c, u, d, a.uuid);
        }
        try {
          return await Tke(d, async () => {
            let {
              content: m,
              encoding: f,
              lineEndings: h
            } = await eje(d);
            let g;
            try {
              g = qt(m);
            } catch {
              return {
                data: {
                  new_source: t,
                  old_source: undefined,
                  cell_type: r ?? "code",
                  language: "python",
                  edit_mode: "replace",
                  error: "Notebook is not valid JSON.",
                  cell_id: n,
                  notebook_path: d,
                  original_file: "",
                  updated_file: ""
                }
              };
            }
            let y;
            if (!n) {
              y = 0;
            } else {
              if (y = g.cells.findIndex(I => I.id === n), y === -1) {
                let I = P6t(n);
                if (I !== undefined) {
                  y = I;
                }
              }
              if (o === "insert") {
                y += 1;
              }
            }
            let _ = o;
            if (_ === "replace" && y === g.cells.length) {
              if (_ = "insert", !r) {
                r = "code";
              }
            }
            let b = g.metadata.language_info?.name ?? "python";
            let S = undefined;
            if (g.nbformat > 4 || g.nbformat === 4 && g.nbformat_minor >= 5) {
              if (_ === "insert") {
                S = H6a.randomUUID().slice(0, 8);
              } else if (n !== null) {
                S = n;
              }
            }
            let E;
            if (_ === "delete") {
              let I = g.cells[y];
              E = Array.isArray(I.source) ? I.source.join("") : I.source;
              g.cells.splice(y, 1);
            } else if (_ === "insert") {
              let I;
              if (r === "markdown") {
                I = {
                  cell_type: "markdown",
                  id: S,
                  source: t,
                  metadata: {}
                };
              } else {
                I = {
                  cell_type: "code",
                  id: S,
                  source: t,
                  metadata: {},
                  execution_count: null,
                  outputs: []
                };
              }
              g.cells.splice(y, 0, I);
            } else {
              let I = g.cells[y];
              if (E = Array.isArray(I.source) ? I.source.join("") : I.source, I.source = t, I.cell_type === "code") {
                I.execution_count = null;
                I.outputs = [];
              }
              if (r && r !== I.cell_type) {
                I.cell_type = r;
              }
            }
            let x = De(g, null, 1);
            Ske(d, p);
            let A = await Eke(d, x, f, h);
            l.set(d, {
              content: x,
              timestamp: A,
              offset: undefined,
              limit: undefined
            });
            return {
              data: {
                new_source: t,
                old_source: E,
                cell_type: r ?? "code",
                language: b,
                edit_mode: _ ?? "replace",
                cell_id: S || undefined,
                error: "",
                notebook_path: d,
                original_file: m,
                updated_file: x
              }
            };
          });
        } catch (m) {
          if (m instanceof nY) {
            throw m;
          }
          if (m instanceof Error) {
            return {
              data: {
                new_source: t,
                old_source: undefined,
                cell_type: r ?? "code",
                language: "python",
                edit_mode: "replace",
                error: m.message,
                cell_id: n,
                notebook_path: d,
                original_file: "",
                updated_file: ""
              }
            };
          }
          return {
            data: {
              new_source: t,
              old_source: undefined,
              cell_type: r ?? "code",
              language: "python",
              edit_mode: "replace",
              error: "Unknown error occurred while editing notebook",
              cell_id: n,
              notebook_path: d,
              original_file: "",
              updated_file: ""
            }
          };
        }
      }
    });
  });
  function BEe() {
    if (owo) {
      return owo;
    }
    h6t();
    let {
      PowerShellTool: e
    } = __toCommonJS(f6t);
    return owo = [iy, Nw, iR, cz, $$, xl, e, EQ];
  }
  var owo;
  var D6t = __lazy(() => {
    R$();
    v8e();
    LEe();
    DEe();
    ogt();
    DNe();
    O6t();
  });
  function kpe() {
    return (gI.CLAUDE_REPL_VERBOSE ?? false) && zk();
  }
  var mgt = __lazy(() => {
    pr();
    ZC();
  });
  function V6a(e) {
    let t = q6a.get(e);
    if (t === undefined) {
      t = A6p(e);
      q6a.set(e, t);
    }
    return t;
  }
  function A6p(e) {
    if (e.type !== "user") {
      return null;
    }
    let t = e.message.content[0];
    if (t?.type !== "text") {
      return null;
    }
    if (e.origin && e.origin.kind !== "task-notification") {
      return null;
    }
    let n = t.text.trimStart();
    if (!n.startsWith(`<${"task-notification"}`)) {
      return null;
    }
    let r = `</${"task-notification"}>`;
    let o = n.indexOf(r);
    if (o === -1) {
      return null;
    }
    let s = n.slice(0, o + r.length);
    if (Nl(s, "status") !== "completed") {
      return null;
    }
    return Nl(s, "summary");
  }
  function W6a(e) {
    return V6a(e)?.startsWith("Background command ") ?? false;
  }
  function z6a(e) {
    let t = G6a.get(e);
    if (t !== undefined) {
      return {
        kind: "bash",
        count: t
      };
    }
    let n = V6a(e);
    if (n === null) {
      return null;
    }
    if (n.startsWith("Background command ")) {
      return {
        kind: "bash",
        count: 1
      };
    }
    if (n.startsWith('Agent "')) {
      return {
        kind: "agent",
        count: 1
      };
    }
    return null;
  }
  function K6a(e, t) {
    if (!qs()) {
      return e;
    }
    if (t) {
      return e;
    }
    let n = [];
    let r = 0;
    while (r < e.length) {
      let o = e[r];
      if (W6a(o)) {
        let s = 0;
        while (r < e.length && W6a(e[r])) {
          s++;
          r++;
        }
        if (s === 1) {
          n.push(o);
        } else {
          let i = {
            ...o,
            message: {
              role: "user",
              content: [{
                type: "text",
                text: `<${"task-notification"}><${"status"}>completed</${"status"}><${"summary"}>${s} background commands completed</${"summary"}></${"task-notification"}>`
              }]
            }
          };
          G6a.set(i, s);
          n.push(i);
        }
      } else {
        n.push(o);
        r++;
      }
    }
    return n;
  }
  var G6a;
  var q6a;
  var swo = __lazy(() => {
    np();
    zp();
    ro();
    G6a = new WeakMap();
    q6a = new WeakMap();
  });
  function X9n(e) {
    return typeof e === "string" && e.length > 0 ? Ru(e, `
`) + 1 : 0;
  }
  function Z9n(e, t) {
    if (typeof t !== "object" || t === null) {
      return {
        added: 0,
        removed: 0
      };
    }
    let n = t;
    if (e === "Edit") {
      return {
        added: X9n(n.new_string),
        removed: X9n(n.old_string)
      };
    }
    if (e === "Write") {
      return {
        added: X9n(n.content),
        removed: 0
      };
    }
    if (e === "NotebookEdit") {
      return {
        added: X9n(n.new_source),
        removed: 0
      };
    }
    return {
      added: 0,
      removed: 0
    };
  }
  var Q9n;
  var iwo = __lazy(() => {
    Ay();
    mx();
    Zn();
    Q9n = new Set(["Edit", "Write", "NotebookEdit"]);
  });
  function Y6a(e) {
    let t = e;
    if (!t) {
      return false;
    }
    if (t.path && OJ(t.path)) {
      return true;
    }
    return false;
  }
  function J6a(e, t) {
    if (e !== "Write" && e !== "Edit") {
      return false;
    }
    let n = t;
    let r = n?.file_path ?? n?.path;
    return r !== undefined && OJ(r);
  }
  function X6a(e, t, n) {
    let r = e.teamMemoryReadCount ?? 0;
    let o = e.teamMemorySearchCount ?? 0;
    let s = e.teamMemoryWriteCount ?? 0;
    if (r > 0) {
      let i = t ? n.length === 0 ? "Recalling" : "recalling" : n.length === 0 ? "Recalled" : "recalled";
      n.push(`${i} ${r} team ${r === 1 ? "memory" : "memories"}`);
    }
    if (o > 0) {
      let i = t ? n.length === 0 ? "Searching" : "searching" : n.length === 0 ? "Searched" : "searched";
      n.push(`${i} team memories`);
    }
    if (s > 0) {
      let i = t ? n.length === 0 ? "Writing" : "writing" : n.length === 0 ? "Wrote" : "wrote";
      n.push(`${i} ${s} team ${s === 1 ? "memory" : "memories"}`);
    }
  }
  var Q6a = __lazy(() => {
    a1();
    Ay();
    mx();
  });
  function O6p(e) {
    let t = e;
    return t?.file_path ?? t?.path;
  }
  function D6p(e) {
    let t = e;
    if (!t) {
      return false;
    }
    if (t.path) {
      if (_8e(t.path) || Gvo(t.path)) {
        return true;
      }
    }
    if (t.glob && F5a(t.glob)) {
      return true;
    }
    if (t.command && L5a(t.command)) {
      return true;
    }
    return false;
  }
  function M6p(e, t) {
    if (e !== "Write" && e !== "Edit") {
      return false;
    }
    let n = O6p(t);
    return n !== undefined && _8e(n);
  }
  function awo(e) {
    let t = "$ " + e.split(`
`).map(n => n.replace(/\s+/g, " ").trim()).filter(n => n !== "").join(`
`);
    return t.length > 300 ? t.slice(0, 300 - 1) + "\u2026" : t;
  }
  function w8e(e, t, n) {
    if (e === "REPL") {
      let l = kpe();
      return {
        isCollapsible: !l,
        isSearch: false,
        isRead: false,
        isList: false,
        isREPL: !l,
        isMemoryWrite: false,
        isAbsorbedSilently: !l
      };
    }
    if (M6p(e, t)) {
      return {
        isCollapsible: true,
        isSearch: false,
        isRead: false,
        isList: false,
        isREPL: false,
        isMemoryWrite: true,
        isAbsorbedSilently: false
      };
    }
    if (qs() && e === "ToolSearch") {
      return {
        isCollapsible: true,
        isSearch: false,
        isRead: false,
        isList: false,
        isREPL: false,
        isMemoryWrite: false,
        isAbsorbedSilently: true
      };
    }
    let r = Cl(n, e) ?? Cl(BEe(), e);
    if (r?.isMcp) {
      return {
        isCollapsible: true,
        isSearch: false,
        isRead: false,
        isList: false,
        isREPL: false,
        isMemoryWrite: false,
        isAbsorbedSilently: false,
        mcpServerName: r.mcpInfo?.serverName
      };
    }
    if (!r?.isSearchOrReadCommand) {
      return {
        isCollapsible: false,
        isSearch: false,
        isRead: false,
        isList: false,
        isREPL: false,
        isMemoryWrite: false,
        isAbsorbedSilently: false
      };
    }
    let o = r.isSearchOrReadCommand(t ?? {});
    let s = o.isList ?? false;
    let i = o.isSearch || o.isRead || s;
    let a = Nq.includes(e);
    return {
      isCollapsible: i || (qs() ? a : false),
      isSearch: o.isSearch,
      isRead: o.isRead,
      isList: s,
      isREPL: false,
      isMemoryWrite: false,
      isAbsorbedSilently: false,
      isBash: qs() ? !i && a : undefined
    };
  }
  function M6t(e, t) {
    if (e?.type === "tool_use" && e.name) {
      let n = w8e(e.name, e.input, t);
      if (n.isCollapsible || n.isREPL) {
        return {
          isSearch: n.isSearch,
          isRead: n.isRead,
          isList: n.isList,
          isREPL: n.isREPL,
          isMemoryWrite: n.isMemoryWrite,
          isAbsorbedSilently: n.isAbsorbedSilently,
          mcpServerName: n.mcpServerName,
          isBash: n.isBash
        };
      }
    }
    return null;
  }
  function N6p(e) {
    if (e.type === "assistant") {
      let t = e.message.content[0];
      return t?.type === "tool_use" ? t.name : null;
    }
    if (e.type === "grouped_tool_use") {
      return e.toolName;
    }
    return null;
  }
  function L6p(e, t) {
    let n = e8a.get(e);
    if (n?.tools === t) {
      return n.info;
    }
    let r = N6p(e);
    let o = r === null ? undefined : Cl(t, r) ?? Cl(BEe(), r);
    if (n && o === n.resolvedTool) {
      n.tools = t;
      return n.info;
    }
    let s = F6p(e, t);
    e8a.set(e, {
      tools: t,
      resolvedTool: o,
      info: s
    });
    return s;
  }
  function F6p(e, t) {
    let n = null;
    if (e.type === "assistant") {
      let s = e.message.content[0];
      let i = M6t(s, t);
      if (i && s?.type === "tool_use") {
        n = {
          name: s.name,
          input: s.input,
          ...i
        };
      }
    } else if (e.type === "grouped_tool_use") {
      let s = e.messages[0]?.message.content[0];
      let i = M6t(s ? {
        type: "tool_use",
        name: e.toolName,
        input: s.input
      } : undefined, t);
      if (i && s?.type === "tool_use") {
        n = {
          name: e.toolName,
          input: s.input,
          ...i
        };
      }
    }
    if (!n) {
      return null;
    }
    let r = !n.isMemoryWrite && !n.isAbsorbedSilently && !n.mcpServerName && !(qs() && n.isBash) && !n.isList && !n.isSearch;
    let o = null;
    if (r) {
      o = q6p(e).map(s => ({
        path: s,
        isTeamMem: OJ(s),
        isAutoManagedMemory: _8e(s)
      }));
    }
    return {
      ...n,
      toolUseIds: i8a(e),
      toolUseCount: j6p(e),
      readPaths: o
    };
  }
  function e5n(e) {
    if (e.type === "assistant") {
      let t = e.message.content[0];
      if (t?.type === "text" && t.text.trim().length > 0 && !o8a(t.text)) {
        return true;
      }
    }
    return false;
  }
  function o8a(e) {
    return e.trim() === "(no content)" || e === "No response requested.";
  }
  function lwo(e) {
    if (e.type !== "assistant") {
      return false;
    }
    let t = e.message.content[0];
    return t?.type === "text" && o8a(t.text);
  }
  function U6p(e) {
    return e.type === "system" && e.subtype === "stop_hook_summary" && e.hookLabel === "PreToolUse";
  }
  function s8a(e) {
    if (e.type === "assistant") {
      let t = e.message.content[0];
      if (t?.type === "thinking" || t?.type === "redacted_thinking") {
        return true;
      }
    }
    if (e.type === "attachment") {
      return true;
    }
    if (e.type === "system") {
      return true;
    }
    return false;
  }
  function B6p(e) {
    if (e.type !== "assistant") {
      return;
    }
    let t = e.message.content[0];
    if (t?.type !== "thinking" || !t.thinking?.trim()) {
      return;
    }
    return {
      message: e,
      text: t.thinking
    };
  }
  function $6p(e) {
    if (e.type === "assistant") {
      return e.message.content[0]?.type === "tool_use";
    }
    if (e.type === "grouped_tool_use") {
      return e.messages[0]?.message.content[0]?.type === "tool_use";
    }
    return false;
  }
  function H6p(e, t) {
    if (e.type === "user") {
      let n = e.message.content.filter(r => r.type === "tool_result");
      return n.length > 0 && n.every(r => t.vZc(r.tool_use_id));
    }
    return false;
  }
  function i8a(e) {
    if (e.type === "assistant") {
      let t = e.message.content[0];
      if (t?.type === "tool_use") {
        return [t.id];
      }
    }
    if (e.type === "grouped_tool_use") {
      return e.messages.map(t => {
        let n = t.message.content[0];
        return n.type === "tool_use" ? n.id : "";
      }).filter(Boolean);
    }
    return [];
  }
  function fgt(e) {
    let t = [];
    for (let n of e.messages) {
      t.push(...i8a(n));
    }
    return t;
  }
  function uwo(e, t) {
    return fgt(e).some(n => t.vZc(n));
  }
  function a8a(e) {
    let t = e.displayMessage;
    if (t.type === "grouped_tool_use") {
      return t.displayMessage;
    }
    return t;
  }
  function j6p(e) {
    if (e.type === "grouped_tool_use") {
      return e.messages.length;
    }
    return 1;
  }
  function q6p(e) {
    let t = [];
    if (e.type === "assistant") {
      let n = e.message.content[0];
      if (n?.type === "tool_use") {
        let r = n.input;
        if (r?.file_path) {
          t.push(r.file_path);
        }
      }
    } else if (e.type === "grouped_tool_use") {
      for (let n of e.messages) {
        let r = n.message.content[0];
        if (r?.type === "tool_use") {
          let o = r.input;
          if (o?.file_path) {
            t.push(o.file_path);
          }
        }
      }
    }
    return t;
  }
  function W6p(e, t) {
    if (e.type !== "user") {
      return;
    }
    let n = e.toolUseResult;
    if (!n?.stdout && !n?.stderr) {
      return;
    }
    let r = (n.stdout ?? "") + `
` + (n.stderr ?? "");
    for (let o of e.message.content) {
      if (o.type !== "tool_result") {
        continue;
      }
      let s = t.bashCommands?.get(o.tool_use_id);
      if (!s) {
        continue;
      }
      let {
        commit: i,
        push: a,
        branch: l,
        pr: c
      } = imt(s, r);
      if (i) {
        t.commits?.push(i);
      }
      if (a) {
        t.pushes?.push(a);
      }
      if (l) {
        t.branches?.push(l);
      }
      if (c) {
        t.prs?.push(c);
      }
      if (i || a || l || c) {
        t.gitOpBashCount = (t.gitOpBashCount ?? 0) + 1;
      }
    }
  }
  function t8a() {
    let e = {
      messages: [],
      searchCount: 0,
      readFilePaths: new Set(),
      readOperationCount: 0,
      listCount: 0,
      toolUseIds: new Set(),
      memorySearchCount: 0,
      memoryReadFilePaths: new Set(),
      memoryWriteCount: 0,
      nonMemSearchArgs: [],
      latestDisplayHint: undefined,
      thoughtForMs: 0,
      latestThinkingSummary: undefined,
      hookTotalMs: 0,
      hookCount: 0,
      hookInfos: []
    };
    if (e.teamMemorySearchCount = 0, e.teamMemoryReadFilePaths = new Set(), e.teamMemoryWriteCount = 0, e.mcpCallCount = 0, e.mcpServerNames = new Set(), qs()) {
      e.bashCount = 0;
      e.bashCommands = new Map();
      e.commits = [];
      e.pushes = [];
      e.branches = [];
      e.prs = [];
      e.gitOpBashCount = 0;
    }
    return e;
  }
  function G6p(e) {
    let t = e.messages[0];
    let n = e.readFilePaths.size > 0 ? e.readFilePaths.size : e.readOperationCount;
    let r = e.memoryReadFilePaths.size;
    let o = r + (e.relevantMemories?.length ?? 0);
    let s = e.teamMemoryReadFilePaths;
    let i = [...e.readFilePaths].filter(d => !e.memoryReadFilePaths.vZc(d) && !(s?.vZc(d) ?? false));
    let a = e.teamMemorySearchCount ?? 0;
    let l = e.teamMemoryReadFilePaths?.size ?? 0;
    let c = e.teamMemoryWriteCount ?? 0;
    let u = {
      type: "collapsed_read_search",
      searchCount: Math.max(0, e.searchCount - e.memorySearchCount - a),
      readCount: Math.max(0, n - r - l),
      listCount: e.listCount,
      replCount: 0,
      memorySearchCount: e.memorySearchCount,
      memoryReadCount: o,
      memoryWriteCount: e.memoryWriteCount,
      readFilePaths: i,
      searchArgs: e.nonMemSearchArgs,
      latestDisplayHint: e.latestDisplayHint,
      messages: e.messages,
      displayMessage: t,
      uuid: `collapsed-${t.uuid}`,
      timestamp: t.timestamp
    };
    if (u.teamMemorySearchCount = a, u.teamMemoryReadCount = l, u.teamMemoryWriteCount = c, (e.mcpCallCount ?? 0) > 0) {
      u.mcpCallCount = e.mcpCallCount;
      u.mcpServerNames = [...(e.mcpServerNames ?? [])];
    }
    if ((e.foldedCount ?? 0) > 0) {
      u.foldedCount = e.foldedCount;
    }
    if (qs()) {
      if ((e.bashCount ?? 0) > 0) {
        u.bashCount = e.bashCount;
        u.gitOpBashCount = e.gitOpBashCount;
      }
      if ((e.commits?.length ?? 0) > 0) {
        u.commits = e.commits;
      }
      if ((e.pushes?.length ?? 0) > 0) {
        u.pushes = e.pushes;
      }
      if ((e.branches?.length ?? 0) > 0) {
        u.branches = e.branches;
      }
      if ((e.prs?.length ?? 0) > 0) {
        u.prs = e.prs;
      }
    }
    if (e.hookCount > 0) {
      u.hookTotalMs = e.hookTotalMs;
      u.hookCount = e.hookCount;
      u.hookInfos = e.hookInfos;
    }
    if (e.relevantMemories && e.relevantMemories.length > 0) {
      u.relevantMemories = e.relevantMemories;
    }
    if (e.thoughtForMs > 0) {
      u.thoughtForMs = e.thoughtForMs;
    }
    if (e.latestThinkingSummary !== undefined) {
      u.latestThinkingSummary = e.latestThinkingSummary;
    }
    return u;
  }
  function l8a(e, t) {
    let n = kpe();
    let r = [];
    let o = t8a();
    let s = [];
    let i;
    function a() {
      if (o.messages.length === 0) {
        return;
      }
      r.push(G6p(o));
      let l = new Set();
      for (let c of s) {
        if (c.type === "attachment" && c.attachment.type === "hook_permission_decision") {
          let u = `${c.attachment.decision}:${c.attachment.hookEvent}`;
          if (l.vZc(u)) {
            continue;
          }
          l.add(u);
        }
        r.push(c);
      }
      s = [];
      o = t8a();
    }
    for (let l of e) {
      if (n && (l.type === "assistant" || l.type === "user") && l.isVirtual === true && l.message.content[0]?.type !== "thinking") {
        continue;
      }
      let c = $6p(l) ? L6p(l, t) : null;
      let u = c === null ? B6p(l) : undefined;
      if (c) {
        o.latestThinkingSummary = undefined;
        let d = c.toolUseCount;
        if (c.isMemoryWrite) {
          if (J6a(c.name, c.input)) {
            o.teamMemoryWriteCount = (o.teamMemoryWriteCount ?? 0) + d;
          } else {
            o.memoryWriteCount += d;
          }
        } else if (c.isAbsorbedSilently) {
          ;
        } else if (c.mcpServerName) {
          o.mcpCallCount = (o.mcpCallCount ?? 0) + d;
          o.mcpServerNames?.add(c.mcpServerName);
          let p = c.input;
          if (p?.query) {
            o.latestDisplayHint = `"${p.query}"`;
          }
        } else if (qs() && c.isBash) {
          o.bashCount = (o.bashCount ?? 0) + d;
          let p = c.input;
          if (p?.command) {
            o.latestDisplayHint = kjn(p.command) ?? awo(p.command);
            for (let m of c.toolUseIds) {
              o.bashCommands?.set(m, p.command);
            }
          }
        } else if (c.isList) {
          o.listCount += d;
          let p = c.input;
          if (p?.command) {
            o.latestDisplayHint = awo(p.command);
          }
        } else if (c.isSearch) {
          if (o.searchCount += d, Y6a(c.input)) {
            o.teamMemorySearchCount = (o.teamMemorySearchCount ?? 0) + d;
          } else if (D6p(c.input)) {
            o.memorySearchCount += d;
          } else {
            let p = c.input;
            if (p?.pattern) {
              o.nonMemSearchArgs.push(p.pattern);
              o.latestDisplayHint = `"${p.pattern}"`;
            }
          }
        } else {
          let p = c.readPaths ?? [];
          for (let m of p) {
            if (o.readFilePaths.add(m.path), m.isTeamMem) {
              o.teamMemoryReadFilePaths?.add(m.path);
            } else if (m.isAutoManagedMemory) {
              o.memoryReadFilePaths.add(m.path);
            } else {
              o.latestDisplayHint = Pd(m.path);
            }
          }
          if (p.length === 0) {
            o.readOperationCount += d;
            let m = c.input;
            if (m?.command) {
              o.latestDisplayHint = awo(m.command);
            }
          }
        }
        for (let p of c.toolUseIds) {
          o.toolUseIds.add(p);
        }
        o.messages.push(l);
      } else if (H6p(l, o.toolUseIds)) {
        if (o.messages.push(l), qs() && o.bashCommands?.size) {
          W6p(l, o);
        }
      } else if (o.messages.length > 0 && U6p(l)) {
        o.hookCount += l.hookCount;
        o.hookTotalMs += l.totalDurationMs ?? l.hookInfos.reduce((d, p) => d + (p.durationMs ?? 0), 0);
        o.hookInfos.push(...l.hookInfos);
      } else if (o.messages.length > 0 && l.type === "attachment" && l.attachment.type === "relevant_memories") {
        o.relevantMemories ??= [];
        o.relevantMemories.push(...l.attachment.memories);
      } else if (o.messages.length > 0 && l.type === "system" && l.subtype === "fold_boundary") {
        o.foldedCount = (o.foldedCount ?? 0) + l.foldedUuids.length;
      } else if (c8a(l)) {
        a();
        r.push(l);
      } else if (u !== undefined) {
        if (o.latestThinkingSummary = u.text.trim().replace(/\s+/g, " "), i !== undefined) {
          let d = Date.parse(l.timestamp) - Date.parse(i);
          if (Number.isFinite(d) && d > 0) {
            o.thoughtForMs += Math.min(d, 600000);
          }
        }
        o.messages.push(u.message);
      } else if (s8a(l) || lwo(l)) {
        if (o.messages.length > 0) {
          s.push(l);
        } else {
          r.push(l);
        }
      } else {
        a();
        r.push(l);
      }
      if ("timestamp" in l && typeof l.timestamp === "string") {
        i = l.timestamp;
      }
    }
    a();
    return r;
  }
  function c8a(e) {
    if (e.type !== "attachment") {
      return false;
    }
    let t = e.attachment;
    if (t.type !== "queued_command" || t.commandMode !== "prompt") {
      return false;
    }
    let n = t.origin;
    if (!t.isMeta && yU(n)) {
      return true;
    }
    if (n?.kind === "channel") {
      return true;
    }
    n?.kind;
    return false;
  }
  function n8a(e) {
    if (e.type === "user") {
      return e.message.content[0]?.type !== "tool_result";
    }
    return c8a(e);
  }
  function V6p(e, t) {
    if (e.searchCount += t.searchCount, e.readCount += t.readCount, e.listCount += t.listCount, e.replCount += t.replCount, e.memorySearchCount += t.memorySearchCount, e.memoryReadCount += t.memoryReadCount, e.memoryWriteCount += t.memoryWriteCount, t.teamMemorySearchCount) {
      e.teamMemorySearchCount = (e.teamMemorySearchCount ?? 0) + t.teamMemorySearchCount;
    }
    if (t.teamMemoryReadCount) {
      e.teamMemoryReadCount = (e.teamMemoryReadCount ?? 0) + t.teamMemoryReadCount;
    }
    if (t.teamMemoryWriteCount) {
      e.teamMemoryWriteCount = (e.teamMemoryWriteCount ?? 0) + t.teamMemoryWriteCount;
    }
    if (t.relevantMemories?.length) {
      e.relevantMemories = [...(e.relevantMemories ?? []), ...t.relevantMemories];
    }
    if (t.foldedCount) {
      e.foldedCount = (e.foldedCount ?? 0) + t.foldedCount;
    }
    if (t.mcpCallCount) {
      e.mcpCallCount = (e.mcpCallCount ?? 0) + t.mcpCallCount;
      e.mcpServerNames = Ro([...(e.mcpServerNames ?? []), ...(t.mcpServerNames ?? [])]);
    }
    if (t.bashCount) {
      e.bashCount = (e.bashCount ?? 0) + t.bashCount;
    }
    if (t.gitOpBashCount) {
      e.gitOpBashCount = (e.gitOpBashCount ?? 0) + t.gitOpBashCount;
    }
    if (t.otherToolCount) {
      e.otherToolCount = (e.otherToolCount ?? 0) + t.otherToolCount;
    }
    if (t.agentCount) {
      if (e.agentCount = (e.agentCount ?? 0) + t.agentCount, t.agentDescriptions) {
        e.agentDescriptions = [...(e.agentDescriptions ?? []), ...t.agentDescriptions];
      }
    }
    if (t.frameCount) {
      e.frameCount = (e.frameCount ?? 0) + t.frameCount;
    }
    if (t.editFileCount) {
      e.editFileCount = (e.editFileCount ?? 0) + t.editFileCount;
    }
    if (t.linesAdded) {
      e.linesAdded = (e.linesAdded ?? 0) + t.linesAdded;
    }
    if (t.linesRemoved) {
      e.linesRemoved = (e.linesRemoved ?? 0) + t.linesRemoved;
    }
    if (t.commits?.length) {
      e.commits = [...(e.commits ?? []), ...t.commits];
    }
    if (t.pushes?.length) {
      e.pushes = [...(e.pushes ?? []), ...t.pushes];
    }
    if (t.branches?.length) {
      e.branches = [...(e.branches ?? []), ...t.branches];
    }
    if (t.prs?.length) {
      e.prs = [...(e.prs ?? []), ...t.prs];
    }
    if (t.readFilePaths?.length) {
      e.readFilePaths = [...(e.readFilePaths ?? []), ...t.readFilePaths];
    }
    if (t.searchArgs?.length) {
      e.searchArgs = [...(e.searchArgs ?? []), ...t.searchArgs];
    }
    if (t.hookCount) {
      e.hookCount = (e.hookCount ?? 0) + t.hookCount;
      e.hookTotalMs = (e.hookTotalMs ?? 0) + (t.hookTotalMs ?? 0);
      e.hookInfos = [...(e.hookInfos ?? []), ...(t.hookInfos ?? [])];
    }
    if (e.latestDisplayHint = t.latestDisplayHint ?? e.latestDisplayHint, t.thoughtForMs) {
      e.thoughtForMs = (e.thoughtForMs ?? 0) + t.thoughtForMs;
    }
    e.latestThinkingSummary = t.latestThinkingSummary ?? e.latestThinkingSummary;
    e.messages.push(...t.messages);
  }
  function u8a(e, t, n, r = false, o = {}) {
    let s = [];
    let i = o.keepAllText !== true;
    let a = 0;
    while (a < e.length) {
      let l = e[a];
      if (!n8a(l)) {
        s.push(l);
        a++;
        continue;
      }
      let c = a;
      let u = 0;
      let d = 0;
      let p = [];
      if (i) {
        while (a < e.length) {
          let O = e[a];
          if (O.type !== "user") {
            break;
          }
          let M = z6a(O);
          if (M === null) {
            break;
          }
          if (M.kind === "agent") {
            u += M.count;
          } else {
            d += M.count;
          }
          p.push(O);
          a++;
        }
      }
      if (p.length === 0) {
        s.push(l);
        a++;
      }
      let m = a;
      while (m < e.length && !n8a(e[m])) {
        m++;
      }
      let f = r && m === e.length;
      if (f) {
        let O = m - 1;
        while (O >= a && s8a(e[O])) {
          O--;
        }
        let M = O >= a ? e[O] : undefined;
        if (M?.type === "assistant" && M.message.stop_reason !== null && (e5n(M) || lwo(M))) {
          f = false;
        }
      }
      let h = -1;
      if (!f) {
        for (let O = m - 1; O >= a; O--) {
          if (e5n(e[O])) {
            h = O;
            break;
          }
        }
      }
      let g = new Set();
      if (o.keepAllText === true) {
        let O = new Set();
        for (let M = a; M < m; M++) {
          let L = e[M];
          if (L.type !== "user") {
            continue;
          }
          for (let P of L.message.content) {
            if (typeof P === "object" && P !== null && P.type === "tool_result" && P.is_error === true) {
              O.add(P.tool_use_id);
            }
          }
        }
        for (let M = a; M < m; M++) {
          let L = e[M];
          if (e5n(L)) {
            g.add(M);
            continue;
          }
          if (L.type === "assistant") {
            let P = L.message.content[0];
            if (P?.type === "tool_use" && O.vZc(P.id)) {
              g.add(M);
            }
            continue;
          }
          if (L.type !== "user") {
            continue;
          }
          for (let P of L.message.content) {
            if (typeof P === "object" && P !== null && P.type === "tool_result" && P.is_error === true && O.vZc(P.tool_use_id)) {
              g.add(M);
              break;
            }
          }
        }
      }
      let y = new Set();
      let _ = new Set();
      for (let O = m - 1; !f && O >= a; O--) {
        let M = e[O];
        if (M.type !== "assistant") {
          continue;
        }
        let L = M.message.content[0];
        if (L?.type !== "tool_use" || _.vZc(L.name)) {
          continue;
        }
        if (_.add(L.name), Cl(t, L.name)?.briefStandalone) {
          y.add(O);
          for (let P = O + 1; P < m; P++) {
            let F = e[P];
            if (F.type === "assistant") {
              break;
            }
            if (F.type !== "user") {
              continue;
            }
            let H = F.message.content[0];
            if (H?.type === "tool_result" && H.tool_use_id === L.id) {
              y.add(P);
              break;
            }
          }
        }
      }
      let b = null;
      let S = m;
      if (p.length > 0) {
        if (b = d8a(p[0]), b.messages = [...p], u > 0) {
          b.agentCount = u;
        }
        if (d > 0) {
          b.bashCount = d;
        }
        S = c;
      }
      let E;
      let C = [];
      let x = () => {
        if (b) {
          C.push([S, b]);
          b = null;
          S = m;
        }
      };
      let A = 0;
      for (let O = a; O < m; O++) {
        if (O === h || g.vZc(O) || y.vZc(O)) {
          if (o.keepAllText === true && (g.vZc(O) || O === h) && e5n(e[O])) {
            x();
          }
          continue;
        }
        let M = e[O];
        if (M.type === "system") {
          if (M.subtype === "informational" && M.level === "info") {
            A++;
          } else if (M.subtype === "stop_hook_summary" && M.hookLabel !== undefined) {
            ;
          } else {
            y.add(O);
          }
          continue;
        }
        let L = null;
        if (M.type === "collapsed_read_search") {
          L = M;
        } else if (M.type === "grouped_tool_use") {
          L = r8a(M, M.toolName, M.messages.map(P => P.message.content[0]?.input), t);
        } else if (M.type === "assistant") {
          let P = M.message.content[0];
          if (P?.type === "tool_use") {
            L = r8a(M, P.name, [P.input], t);
          } else if (lwo(M)) {
            A++;
          } else if (f && P?.type === "text" && P.text.trim().length > 0) {
            E = P.text;
          } else if (P?.type === "thinking" || P?.type === "redacted_thinking") {
            A++;
          }
        } else if (M.type === "user") {
          if (b) {
            b.messages.push(M);
            let P = M.toolUseResult;
            let F = P?.toolStats ?? (P?.status === "async_launched" && P.agentId ? n?.(P.agentId) : undefined);
            if (F) {
              if (b.readCount += F.readCount, b.searchCount += F.searchCount, F.bashCount) {
                b.bashCount = (b.bashCount ?? 0) + F.bashCount;
              }
              if (F.editFileCount) {
                b.editFileCount = (b.editFileCount ?? 0) + F.editFileCount;
              }
              if (F.linesAdded) {
                b.linesAdded = (b.linesAdded ?? 0) + F.linesAdded;
              }
              if (F.linesRemoved) {
                b.linesRemoved = (b.linesRemoved ?? 0) + F.linesRemoved;
              }
              if (F.otherToolCount) {
                b.otherToolCount = (b.otherToolCount ?? 0) + F.otherToolCount;
              }
              if (F.frameCount) {
                b.frameCount = (b.frameCount ?? 0) + F.frameCount;
              }
            }
          }
        }
        if (M.type === "attachment") {
          A++;
        }
        if (L) {
          if (b) {
            V6p(b, L);
          } else {
            b = {
              ...L,
              messages: [...L.messages]
            };
            S = O;
          }
        }
      }
      if (h !== -1) {
        y.add(h);
      }
      for (let O of g) {
        y.add(O);
      }
      let k = [...y].map(O => [O, e[O]]);
      x();
      for (let [O, M] of C) {
        if (M.uuid = `brief-${M.uuid}`, E && M === C.at(-1)?.[1]) {
          M.pendingText = E;
        }
        M.hookCount = undefined;
        M.hookTotalMs = undefined;
        M.hookInfos = undefined;
        k.push([O, M]);
      }
      k.sort((O, M) => O[0] - M[0]);
      let I = f || o.keepAllText === true ? 0 : m - a + p.length - k.length - A;
      for (let [, O] of k) {
        s.push(I > 0 && O.type === "system" && O.subtype === "turn_duration" ? {
          ...O,
          briefHiddenCount: I
        } : O);
      }
      a = m;
    }
    return s;
  }
  function d8a(e) {
    return {
      type: "collapsed_read_search",
      searchCount: 0,
      readCount: 0,
      listCount: 0,
      replCount: 0,
      memorySearchCount: 0,
      memoryReadCount: 0,
      memoryWriteCount: 0,
      messages: [e],
      displayMessage: e,
      uuid: e.uuid,
      timestamp: e.timestamp
    };
  }
  function r8a(e, t, n, r) {
    let o = n.length;
    let s = d8a(e);
    if (t === "Agent" || t === "Task") {
      s.agentCount = o;
      let a = n.flatMap(l => {
        let c = l?.description;
        if (typeof c !== "string") {
          return [];
        }
        let u = Li(c).replace(/\s+/g, " ").trim().slice(0, 300);
        return u !== "" ? [u] : [];
      });
      if (a.length > 0) {
        s.agentDescriptions = a;
      }
      return s;
    }
    let i = Cl(r, t);
    if (i?.isMcp) {
      if (s.mcpCallCount = o, i.mcpInfo?.serverName) {
        s.mcpServerNames = [i.mcpInfo.serverName];
      }
    } else if (Q9n.vZc(t)) {
      s.editFileCount = o;
      let a = 0;
      let l = 0;
      for (let c of n) {
        let u = Z9n(t, c);
        a += u.added;
        l += u.removed;
      }
      if (a > 0) {
        s.linesAdded = a;
      }
      if (l > 0) {
        s.linesRemoved = l;
      }
    } else if (t === P6p) {
      s.frameCount = o;
    } else {
      s.otherToolCount = o;
    }
    return s;
  }
  function n5n(e, t, n, r = 0, o, s = 0) {
    let i = [];
    if (o) {
      let {
        memorySearchCount: l,
        memoryReadCount: c,
        memoryWriteCount: u
      } = o;
      if (c > 0) {
        let d = n ? i.length === 0 ? "Recalling" : "recalling" : i.length === 0 ? "Recalled" : "recalled";
        i.push(`${d} ${c} ${c === 1 ? "memory" : "memories"}`);
      }
      if (l > 0) {
        let d = n ? i.length === 0 ? "Searching" : "searching" : i.length === 0 ? "Searched" : "searched";
        i.push(`${d} memories`);
      }
      if (u > 0) {
        let d = n ? i.length === 0 ? "Writing" : "writing" : i.length === 0 ? "Wrote" : "wrote";
        i.push(`${d} ${u} ${u === 1 ? "memory" : "memories"}`);
      }
      X6a(o, n, i);
    }
    if (e > 0) {
      let l = n ? i.length === 0 ? "Searching for" : "searching for" : i.length === 0 ? "Searched for" : "searched for";
      i.push(`${l} ${e} ${e === 1 ? "pattern" : "patterns"}`);
    }
    if (t > 0) {
      let l = n ? i.length === 0 ? "Reading" : "reading" : i.length === 0 ? "Read" : "read";
      i.push(`${l} ${t} ${t === 1 ? "file" : "files"}`);
    }
    if (s > 0) {
      let l = n ? i.length === 0 ? "Listing" : "listing" : i.length === 0 ? "Listed" : "listed";
      i.push(`${l} ${s} ${s === 1 ? "directory" : "directories"}`);
    }
    if (r > 0) {
      let l = n ? "REPL'ing" : "REPL'd";
      i.push(`${l} ${r} ${r === 1 ? "time" : "times"}`);
    }
    let a = i.join(", ");
    return n ? `${a}\u2026` : a;
  }
  function r5n(e) {
    if (e.length === 0) {
      return;
    }
    let t = 0;
    let n = 0;
    for (let o = e.length - 1; o >= 0; o--) {
      let s = e[o];
      if (s.isSearch) {
        t++;
      } else if (s.isRead) {
        n++;
      } else {
        break;
      }
    }
    if (t + n >= 2) {
      return n5n(t, n, true);
    }
    for (let o = e.length - 1; o >= 0; o--) {
      if (e[o]?.activityDescription) {
        return e[o].activityDescription;
      }
    }
    return;
  }
  var P6p;
  var e8a;
  var FNe = __lazy(() => {
    ci();
    Sh();
    Ay();
    mx();
    ZC();
    D6t();
    mgt();
    amt();
    kX();
    swo();
    iwo();
    Zl();
    zp();
    S$();
    sgt();
    Jf();
    Q6a();
    P6p = (t1(), __toCommonJS(z2t)).ARTIFACT_TOOL_NAME;
    e8a = new WeakMap();
  });
  function hgt(e) {
    vw({
      type: "system",
      subtype: "task_progress",
      task_id: e.taskId,
      tool_use_id: e.toolUseId,
      description: e.description,
      subagent_type: e.subagentType,
      usage: {
        total_tokens: e.totalTokens,
        tool_uses: e.toolUses,
        duration_ms: Date.now() - e.startTime
      },
      last_tool_name: e.lastToolName,
      summary: e.summary,
      workflow_progress: e.workflowProgress
    });
  }
  var o5n = __lazy(() => {});
  var s5n;
  var dwo = __lazy(() => {
    ph();
    s5n = Si();
  });
  function i5n() {
    return {
      toolUseCount: 0,
      latestInputTokens: 0,
      cumulativeOutputTokens: 0,
      recentActivities: []
    };
  }
  function a5n(e) {
    return e.latestInputTokens + e.cumulativeOutputTokens;
  }
  function l5n(e, t, n, r) {
    if (t.type === "progress" && t.data.type === "repl_tool_call" && t.data.phase === "start") {
      let {
        toolName: s,
        toolInput: i
      } = t.data;
      let a = r ? w8e(s, i, r) : undefined;
      if (e.recentActivities.push({
        toolName: s,
        input: i,
        activityDescription: n?.(s, i),
        isSearch: a?.isSearch,
        isRead: a?.isRead
      }), e.recentActivities.length > 5) {
        e.recentActivities.shift();
      }
      return;
    }
    if (t.type !== "assistant") {
      return;
    }
    let o = t.message.usage;
    e.latestInputTokens = o.input_tokens + (o.cache_creation_input_tokens ?? 0) + (o.cache_read_input_tokens ?? 0);
    e.cumulativeOutputTokens += o.output_tokens;
    for (let s of t.message.content) {
      if (s.type !== "tool_use") {
        continue;
      }
      if (e.toolUseCount++, s.name === "StructuredOutput") {
        continue;
      }
      if (s.name === "REPL") {
        continue;
      }
      let i = s.input;
      let a = r ? w8e(s.name, i, r) : undefined;
      e.recentActivities.push({
        toolName: s.name,
        input: i,
        activityDescription: n?.(s.name, i),
        isSearch: a?.isSearch,
        isRead: a?.isRead
      });
    }
    while (e.recentActivities.length > 5) {
      e.recentActivities.shift();
    }
  }
  function N6t(e) {
    return {
      toolUseCount: e.toolUseCount,
      tokenCount: a5n(e),
      lastActivity: e.recentActivities.at(-1),
      recentActivities: [...e.recentActivities]
    };
  }
  function c5n(e) {
    return (t, n) => Cl(e, t)?.getActivityDescription?.(n) ?? undefined;
  }
  function zoe(e) {
    return e.keepaliveReasons ?? new Set();
  }
  function K6p(e, t) {
    mwo.delete(e);
    Yq(e, "flag:idle-window", t);
    let n = t.get(e);
    if (za(n) && n.status === "completed" && zoe(n).size === 0) {
      if (evictTaskOutput(e), f5n(e, t), n.notified) {
        let r = false;
        for (let o of NV()) {
          if (o.mode === "task-notification" && o.agentId === n.ownerAgentId && o.taskId === e) {
            r = true;
            break;
          }
        }
        if (!r) {
          Yq(n.ownerAgentId, `agent:${e}`, t);
        }
      }
    }
  }
  function gT(e) {
    return e.status === "completed" && zoe(e).size > 0;
  }
  function fwo(e, t) {
    if (e.retain) {
      return;
    }
    if (t.park && (e.keepaliveReasons?.size ?? 0) > 0) {
      return;
    }
    return Date.now() + 30000;
  }
  function za(e) {
    return typeof e === "object" && e !== null && "type" in e && e.type === "local_agent";
  }
  function u5n(e, t) {
    if (!e) {
      return;
    }
    let n = t.get(e);
    return za(n) && n.agentType !== "main-session" ? e : undefined;
  }
  function j$(e) {
    return za(e) && e.agentType !== "main-session";
  }
  function _oe(e, t, n) {
    if (!e) {
      return;
    }
    n.update(e, r => {
      if (!za(r) || zoe(r).vZc(t)) {
        return r;
      }
      return {
        ...r,
        keepaliveReasons: new Set(zoe(r)).add(t)
      };
    });
  }
  function Yq(e, t, n) {
    if (!e) {
      return;
    }
    n.update(e, r => {
      if (!za(r) || !zoe(r).vZc(t)) {
        return r;
      }
      let o = new Set(zoe(r));
      o.delete(t);
      let s = o.size === 0 && Mw(r.status) && !r.retain;
      return {
        ...r,
        keepaliveReasons: o,
        ...(s && r.evictAfter === undefined && {
          evictAfter: Date.now() + 30000
        })
      };
    });
  }
  function m8a(e, t) {
    if (!e) {
      return false;
    }
    let n = t.get(e);
    return za(n) && zoe(n).size > 0;
  }
  function ygt(e, t) {
    if (!e) {
      return false;
    }
    let n = t.get(e);
    if (!za(n)) {
      return false;
    }
    for (let r of zoe(n)) {
      if (r.startsWith("agent:")) {
        return true;
      }
    }
    return false;
  }
  function d5n(e, t) {
    let n = t.get(e);
    if (!za(n)) {
      return;
    }
    let r = new Set();
    for (let o of NV()) {
      if (o.mode === "task-notification" && o.agentId === e && o.taskId) {
        r.add(o.taskId);
      }
    }
    for (let o of zoe(n)) {
      let s;
      if (o.startsWith("agent:")) {
        s = o.slice(6);
      } else if (o.startsWith("workflow:")) {
        s = o.slice(9);
      } else {
        continue;
      }
      if (r.vZc(s)) {
        continue;
      }
      let i = t.get(s);
      if (!i || za(i) && i.notified || i.type === "local_workflow" && i.notified) {
        Yq(e, o, t);
      }
    }
  }
  function C8e(e, t, n, r = {}) {
    let o = {
      text: t,
      origin: r.origin,
      isMeta: r.isMeta ?? false
    };
    n.update(e, s => ({
      ...s,
      pendingMessages: [...s.pendingMessages, o]
    }));
  }
  function p5n(e, t, n) {
    n.updateTranscript(e, r => ({
      ...r,
      messages: [...r.messages, t]
    }));
  }
  function m5n(e, t) {
    let n = t.get(e);
    if (!za(n) || n.pendingMessages.length === 0) {
      return [];
    }
    let r = n.pendingMessages;
    t.update(e, o => ({
      ...o,
      pendingMessages: []
    }));
    return r;
  }
  function R8e({
    taskId: e,
    description: t,
    status: n,
    killedBy: r,
    error: o,
    taskRegistry: s,
    finalMessage: i,
    usage: a,
    toolUseId: l,
    worktreePath: c,
    worktreeBranch: u,
    ownerAgentId: d
  }) {
    let p = false;
    let m = false;
    let f;
    s.update(e, I => {
      if (m = true, f = I.ownerAgentId, I.notified) {
        return I;
      }
      p = true;
      return {
        ...I,
        notified: true
      };
    });
    f ??= d;
    let h = f ? s.get(f) : undefined;
    let y = za(h) && gT(h) && !getIsNonInteractiveSession() || za(h) && h.status === "running";
    if (!(p && y)) {
      Yq(f, `agent:${e}`, s);
    }
    if (!p) {
      logForDebugging(`[enqueueAgentNotification] skipped taskId=${e} status=${n} taskPresent=${m} reason=${m ? "already-notified" : "task-not-in-registry"}`, {
        level: m ? "debug" : "warn"
      });
      return;
    }
    let _ = n === "completed" ? "finished" : n === "failed" ? `failed: ${o || "Unknown error"}` : r === "parent" ? "was stopped by Claude" : r === "user" ? "was stopped by user" : "was stopped";
    let b = `${'Agent "'}${t}" ${_}`;
    let S = getTaskOutputPath(e);
    let E = l ? `
<${"tool-use-id"}>${l}</${"tool-use-id"}>` : "";
    let C = i ? `
<result>${$a(i)}</result>` : "";
    let x = a ? `
<usage><subagent_tokens>${a.totalTokens}</subagent_tokens><tool_uses>${a.toolUses}</tool_uses><duration_ms>${a.durationMs}</duration_ms></usage>` : "";
    let A = c ? `
<${"worktree"}><${"worktreePath"}>${c}</${"worktreePath"}>${u ? `<${"worktreeBranch"}>${u}</${"worktreeBranch"}>` : ""}</${"worktree"}>` : "";
    let k = `<${"task-notification"}>
<${"task-id"}>${e}</${"task-id"}>${E}
<${"output-file"}>${S}</${"output-file"}>
<${"status"}>${n}</${"status"}>
<${"summary"}>${$a(b)}</${"summary"}>
<note>A task-notification fires each time this agent stops with no live background children of its own. The user can send it another message and resume it, so the same task-id may notify more than once.</note>${C}${x}${A}
</${"task-notification"}>`;
    ud({
      value: k,
      mode: "task-notification",
      priority: "next",
      agentId: y && f ? f : mainAgentId(),
      taskId: e
    });
  }
  function f5n(e, t) {
    let n = t.get(e);
    if (za(n) && gT(n) && !getIsNonInteractiveSession()) {
      return;
    }
    let r = HDe(o => {
      if (o.mode !== "task-notification" || o.agentId !== e) {
        return false;
      }
      let s = o.taskId ? t.get(o.taskId) : undefined;
      return za(s) && s.ownerAgentId === e;
    });
    for (let o of r) {
      ud({
        ...o,
        agentId: mainAgentId()
      });
    }
  }
  function Ape(e, t, n = "user") {
    let r = t.get(e);
    if (za(r) && gT(r) && r.quietlyParked === true) {
      t.update(e, i => ({
        ...i,
        notified: false,
        quietlyParked: false
      }));
    }
    let o = t.get(e);
    if (za(o) && gT(o) && o.notified) {
      Yq(o.ownerAgentId, `agent:${e}`, t);
    }
    if (za(o) && gT(o) && !o.notified) {
      let i = o.result;
      R8e({
        taskId: e,
        description: o.description,
        status: "killed",
        killedBy: n,
        taskRegistry: t,
        finalMessage: i ? i.content.map(a => a.text).join(`
`) : undefined,
        usage: i ? {
          totalTokens: i.totalTokens,
          toolUses: i.totalToolUseCount,
          durationMs: i.totalDurationMs
        } : undefined,
        toolUseId: o.toolUseId,
        ownerAgentId: o.ownerAgentId
      });
    }
    let s = false;
    if (t.update(e, i => {
      if (i.status !== "running" && !gT(i)) {
        return i;
      }
      s = true;
      i.abortController?.abort();
      return {
        ...i,
        status: "killed",
        killedBy: n,
        notified: i.notified || gT(i),
        endTime: Date.now(),
        keepaliveReasons: new Set(),
        evictAfter: fwo(i, {
          park: false
        }),
        abortController: undefined,
        selectedAgent: undefined
      };
    }), s) {
      f5n(e, t);
      evictTaskOutput(e);
    }
  }
  function f8a(e, t) {
    return false;
  }
  function h8a(e, t, n = "user") {
    for (let [r, o] of Object.entries(e)) {
      if (za(o) && gT(o)) {
        Ape(r, t, n);
      }
    }
    for (let [r, o] of Object.entries(e)) {
      if (o.type === "local_agent" && o.status === "running") {
        Ape(r, t, n);
      }
    }
  }
  function _gt(e, t) {
    t.update(e, n => {
      if (n.notified && n.quietlyParked !== true) {
        return n;
      }
      return {
        ...n,
        notified: true,
        quietlyParked: false
      };
    });
  }
  function g8a(e, t, n) {
    let r = false;
    if (n.update(e, o => {
      if (o.status !== "running") {
        return o;
      }
      let s = o.progress;
      if (s && s.toolUseCount === t.toolUseCount && s.tokenCount === t.tokenCount && s.lastActivity === t.lastActivity && (s.summary ?? t.summary) === s.summary && Y6p(s.recentActivities, t.recentActivities)) {
        return o;
      }
      let i = s?.summary;
      r = true;
      return {
        ...o,
        progress: i ? {
          ...t,
          summary: i
        } : t
      };
    }), !r) {
      return;
    }
    n.updateTranscript(e, o => {
      let s = o.progress;
      if (s?.tokenCount === t.tokenCount && s.toolUseCount === t.toolUseCount) {
        return o;
      }
      return {
        ...o,
        progress: {
          tokenCount: t.tokenCount,
          toolUseCount: t.toolUseCount
        }
      };
    });
  }
  function Y6p(e, t) {
    if (e === t) {
      return true;
    }
    if (!e || !t || e.length !== t.length) {
      return false;
    }
    for (let n = 0; n < e.length; n++) {
      if (e[n] !== t[n]) {
        return false;
      }
    }
    return true;
  }
  function y8a(e, t, n) {
    let r = null;
    if (n.update(e, o => {
      if (o.status !== "running") {
        return o;
      }
      r = {
        tokenCount: o.progress?.tokenCount ?? 0,
        toolUseCount: o.progress?.toolUseCount ?? 0,
        startTime: o.startTime,
        toolUseId: o.toolUseId,
        agentType: o.agentType
      };
      return {
        ...o,
        progress: {
          ...o.progress,
          toolUseCount: o.progress?.toolUseCount ?? 0,
          tokenCount: o.progress?.tokenCount ?? 0,
          summary: t
        }
      };
    }), r && getSdkAgentProgressSummariesEnabled()) {
      let {
        tokenCount: o,
        toolUseCount: s,
        startTime: i,
        toolUseId: a,
        agentType: l
      } = r;
      hgt({
        taskId: e,
        toolUseId: a,
        description: t,
        subagentType: l,
        startTime: i,
        totalTokens: o,
        toolUses: s,
        summary: t
      });
    }
  }
  function _8a(e, t, n) {
    let r = e.agentId;
    let o = false;
    let s = false;
    let i = false;
    let a = false;
    let l = false;
    if (t.update(r, c => {
      if (c.status !== "running") {
        return c;
      }
      o = true;
      for (let p of zoe(c)) {
        if (p !== "flag:idle-window") {
          l = true;
          break;
        }
      }
      let u = a ? new Set(zoe(c)).add("flag:idle-window") : c.keepaliveReasons;
      let d = {
        ...c,
        status: "completed",
        result: e,
        endTime: Date.now(),
        terminal: n,
        keepaliveReasons: u,
        evictAfter: fwo({
          retain: c.retain,
          keepaliveReasons: u
        }, {
          park: true
        }),
        abortController: undefined,
        selectedAgent: undefined
      };
      s = gT(d) && !getIsNonInteractiveSession();
      i = (d.pendingMessages?.length ?? 0) > 0;
      return d;
    }), o && !s) {
      evictTaskOutput(r);
      Pe("task_local_agent");
      f5n(r, t);
    } else if (o && a && !l) {
      Pe("task_local_agent");
    }
    if (o && i) {
      s5n.emit(r);
    }
    if (o && a) {
      let c = mwo.get(r);
      if (c) {
        clearTimeout(c);
      }
      let u = setTimeout(K6p, 30000, r, t);
      u.unref?.();
      mwo.set(r, u);
    }
  }
  function g5n(e, t, n, r) {
    let o = false;
    if (n.update(e, s => {
      if (s.status !== "running") {
        return s;
      }
      o = true;
      return {
        ...s,
        status: "failed",
        error: t,
        endTime: Date.now(),
        terminal: r,
        evictAfter: fwo(s, {
          park: false
        }),
        abortController: undefined,
        selectedAgent: undefined
      };
    }), evictTaskOutput(e), o) {
      Ae("task_local_agent", "task_local_agent_failed");
      f5n(e, n);
    }
  }
  function bgt({
    agentId: e,
    ownerAgentId: t,
    parentAgentId: n,
    spawnDepth: r,
    description: o,
    prompt: s,
    selectedAgent: i,
    taskRegistry: a,
    parentAbortController: l,
    toolUseId: c,
    cwd: u
  }) {
    initTaskOutputAsSymlink(e, Ew(e));
    let d = l ? createChildAbortController(l) : createAbortController();
    let p = {
      ...ww(e, "local_agent", o, c),
      type: "local_agent",
      status: "running",
      agentId: e,
      ownerAgentId: t,
      parentAgentId: n,
      spawnDepth: r,
      prompt: s,
      cwd: u,
      selectedAgent: i,
      agentType: i.agentType ?? "general-purpose",
      abortController: d,
      retrieved: false,
      lastReportedToolCount: 0,
      lastReportedTokenCount: 0,
      isBackgrounded: true,
      isIdle: false,
      pendingMessages: [],
      retain: false,
      diskLoaded: false,
      keepaliveReasons: new Set()
    };
    a.register(p);
    return p;
  }
  function b8a(e, t) {
    let n = ww(e.agentId, "local_agent", e.description ?? "(resumed agent)", e.toolUseId);
    let r = {
      ...n,
      startTime: e.startTime ?? n.startTime,
      type: "local_agent",
      status: "completed",
      agentId: e.agentId,
      ownerAgentId: e.parentAgentId ?? mainAgentId(),
      parentAgentId: e.parentAgentId,
      spawnDepth: e.spawnDepth,
      prompt: "",
      agentType: e.agentType ?? "general-purpose",
      retrieved: false,
      lastReportedToolCount: 0,
      lastReportedTokenCount: 0,
      isBackgrounded: true,
      isIdle: false,
      pendingMessages: [],
      retain: false,
      diskLoaded: false,
      keepaliveReasons: new Set()
    };
    t.register(r);
  }
  function S8a({
    agentId: e,
    ownerAgentId: t,
    parentAgentId: n,
    spawnDepth: r,
    description: o,
    prompt: s,
    selectedAgent: i,
    taskRegistry: a,
    autoBackgroundMs: l,
    toolUseId: c,
    cwd: u
  }) {
    initTaskOutputAsSymlink(e, Ew(e));
    let d = createAbortController();
    let p = {
      ...ww(e, "local_agent", o, c),
      type: "local_agent",
      status: "running",
      agentId: e,
      ownerAgentId: t,
      parentAgentId: n,
      spawnDepth: r,
      prompt: s,
      cwd: u,
      selectedAgent: i,
      agentType: i.agentType ?? "general-purpose",
      abortController: d,
      retrieved: false,
      lastReportedToolCount: 0,
      lastReportedTokenCount: 0,
      isBackgrounded: false,
      isIdle: false,
      pendingMessages: [],
      retain: false,
      diskLoaded: false,
      keepaliveReasons: new Set()
    };
    let m;
    let f = new Promise(g => {
      m = g;
    });
    ggt.set(e, m);
    a.register(p);
    let h;
    if (l !== undefined && l > 0) {
      let g = setTimeout((y, _) => {
        y.update(_, S => {
          if (S.isBackgrounded) {
            return S;
          }
          return {
            ...S,
            isBackgrounded: true
          };
        });
        let b = ggt.get(_);
        if (b) {
          b();
          ggt.delete(_);
        }
      }, l, a, e);
      h = () => clearTimeout(g);
    }
    return {
      taskId: e,
      backgroundSignal: f,
      cancelAutoBackground: h,
      abortController: d
    };
  }
  function LWt(e, t) {
    let n = t.get(e);
    if (!za(n) || n.isBackgrounded || Mw(n.status) && !gT(n)) {
      return false;
    }
    t.update(e, o => ({
      ...o,
      isBackgrounded: true
    }));
    let r = ggt.get(e);
    if (r) {
      r();
      ggt.delete(e);
    }
    return true;
  }
  function T8a(e, t) {
    ggt.delete(e);
    let n = t.get(e);
    if (!za(n) || n.isBackgrounded || ygt(e, t)) {
      return;
    }
    t.remove(e);
  }
  var mwo;
  var h5n;
  var ggt;
  var ry = __lazy(() => {
    at();
    np();
    ln();
    Cx();
    ci();
    ZC();
    O1();
    D_();
    Kp();
    FNe();
    je();
    Rf();
    Fy();
    cE();
    U$();
    o5n();
    wx();
    dwo();
    mwo = new Map();
    h5n = {
      name: "LocalAgentTask",
      type: "local_agent",
      async kill(e, t, n, r) {
        Ape(e, t, r);
      }
    };
    ggt = new Map();
  });
  function Z6p(e) {
    return e.replace(X6p, (t, n, r) => {
      if (r.length < 16) {
        return `"${n}":"[REDACTED]"`;
      }
      let o = `${r.slice(0, 8)}...${r.slice(-4)}`;
      return `"${n}":"${o}"`;
    });
  }
  function hwo(e) {
    let t = e.replaceAll(`
`, "\\n");
    if (t.length <= 2000) {
      return t;
    }
    return t.slice(0, 2000) + `... (${t.length} chars)`;
  }
  function Sgt(e) {
    let t = typeof e === "string" ? e : De(e);
    let n = Z6p(t);
    if (n.length <= 2000) {
      return n;
    }
    return n.slice(0, 2000) + `... (${n.length} chars)`;
  }
  function E8a(e) {
    let t = he(e);
    if (e && typeof e === "object" && "response" in e) {
      let n = e.response;
      if (n?.data && typeof n.data === "object") {
        let r = n.data;
        let o = typeof r.message === "string" ? r.message : typeof r.error === "object" && r.error && "message" in r.error && typeof r.error.message === "string" ? r.error.message : undefined;
        if (o) {
          return `${t}: ${o}`;
        }
      }
    }
    return t;
  }
  function _5n(e, t = Date.now()) {
    if (!e) {
      return;
    }
    let n = Number(e);
    if (Number.isFinite(n) && n >= 0) {
      return n * 1000;
    }
    let r = Date.parse(e);
    if (Number.isFinite(r)) {
      let o = r - t;
      return o > 0 ? o : undefined;
    }
    return;
  }
  function vQ(e) {
    if (!e || typeof e !== "object") {
      return;
    }
    if ("message" in e && typeof e.message === "string") {
      return e.message;
    }
    if ("error" in e && e.error !== null && typeof e.error === "object" && "message" in e.error && typeof e.error.message === "string") {
      return e.error.message;
    }
    return;
  }
  function wQ(e, t, n) {
    if (t) {
      logForDebugging(t);
    }
    logEvent("tengu_bridge_repl_skipped", {
      reason: e,
      ...(n !== undefined && {
        v2: n
      })
    });
  }
  var J6p;
  var X6p;
  var Ipe = __lazy(() => {
    Ot();
    je();
    dt();
    J6p = ["session_ingress_token", "environment_secret", "access_token", "secret", "token"];
    X6p = new RegExp(`"(${J6p.join("|")})"\\s*:\\s*"([^"]*)"`, "g");
  });
  function t8p(e) {
    if (!e || typeof e !== "object") {
      return;
    }
    let t = "error" in e ? e.error : e;
    if (t && typeof t === "object" && "reason" in t && typeof t.reason === "string") {
      return t.reason;
    }
    return;
  }
  async function F6t(e, t, n, r, o, s, i) {
    let a = e === "subscribe" ? "bridge_pr_subscribe" : "bridge_pr_unsubscribe";
    let l = s();
    if (!l) {
      logForDebugging(`[bridge] No access token for ${e}-pr`);
      Ae(a, "no_token");
      return {
        ok: false,
        reason: "no_token"
      };
    }
    let c = `${o}/v1/code/github/${e}-pr`;
    let u = {
      session_id: toCompatSessionId(t),
      repo: n,
      pr_number: r
    };
    let d;
    try {
      d = await NP.post(c, u, {
        headers: r8p(l, {
          trustedDeviceToken: await i?.()
        }),
        timeout: 1e4,
        validateStatus: m => m < 500
      });
    } catch (m) {
      logForDebugging(`[bridge] ${e}-pr request failed: ${he(m)}`);
      Ae(a, "request_failed");
      return {
        ok: false,
        reason: "request_failed"
      };
    }
    if (!(d.status >= 200 && d.status < 300 || d.status === 409)) {
      let m = t8p(d.data);
      let f = vQ(d.data);
      logForDebugging(`[bridge] ${e}-pr failed ${d.status}${m ? ` [${m}]` : ""}${f ? `: ${f}` : ""}`);
      Ae(a, m === "github_app_not_installed" ? m : "http_error");
      return {
        ok: false,
        reason: m,
        detail: f
      };
    }
    logForDebugging(`[bridge] ${e}-pr ${n}#${r} ok`);
    Pe(a);
    return {
      ok: true
    };
  }
  function r8p(e, {
    orgUUID: t,
    trustedDeviceToken: n
  } = {}) {
    let r = {
      Authorization: `Bearer ${e}`,
      "Content-Type": "application/json",
      "anthropic-version": "2023-06-01",
      "anthropic-beta": "ccr-byoc-2025-07-29",
      "anthropic-client-platform": getClientPlatform(),
      "User-Agent": dg()
    };
    if (t !== undefined) {
      r["x-organization-uuid"] = t;
    }
    if (n !== undefined) {
      r["X-Trusted-Device-Token"] = n;
    }
    return r;
  }
  var U6t = __lazy(() => {
    Dp();
    ln();
    je();
    dt();
    Ipe();
  });
  function S5n(e) {
    return false;
  }
  function $Ee(e) {
    return e.environment_id;
  }
  function T5n(e) {
    return false;
  }
  function B6t(e) {
    return {
      environment_id: e
    };
  }
  async function Koe(e) {
    return vl("teleport_environments_list", async () => {
      if (getAPIProvider() !== "firstParty") {
        throw Error("Remote environments are only available on the first-party Anthropic API provider.");
      }
      let t = e ?? getClaudeAIOAuthTokens()?.accessToken;
      if (!t) {
        throw Error("Claude Code web sessions require authentication with a Claude.ai account. API key authentication is not sufficient. Please run /login to authenticate, or check your authentication status with /status.");
      }
      let n = await getOrganizationUUID();
      if (!n) {
        throw Error("Unable to get organization UUID");
      }
      let r = `${getOauthConfig().BASE_API_URL}/v1/environment_providers`;
      try {
        let o = await withOAuth401Retry(() => NP.get(r, {
          headers: {
            ...getOAuthHeaders(getClaudeAIOAuthTokens()?.accessToken ?? t),
            "x-organization-uuid": n
          },
          timeout: 15000
        }));
        if (o.status !== 200) {
          throw Error(`Failed to fetch environments: ${o.status} ${o.statusText}`);
        }
        let s = o.data.environments.length > 0;
        if (getGlobalConfig().hasRemoteEnvironment !== s) {
          saveGlobalConfig(i => i.hasRemoteEnvironment === s ? i : {
            ...i,
            hasRemoteEnvironment: s
          });
        }
        return o.data.environments;
      } catch (o) {
        let s = sr(o);
        if (M_(o)) {
          logForDebugging(`fetchEnvironments failed: ${s.message}`, {
            level: "error"
          });
        } else {
          Oe(s);
        }
        throw s;
      }
    });
  }
  async function Tgt(e = "Default", t, n) {
    return vl("teleport_default_environment_create", async () => {
      if (getAPIProvider() !== "firstParty") {
        throw Error("Remote environments are only available on the first-party Anthropic API provider.");
      }
      let r = n ?? getClaudeAIOAuthTokens()?.accessToken;
      if (!r) {
        throw Error("No access token available");
      }
      let o = await getOrganizationUUID();
      if (!o) {
        throw Error("Unable to get organization UUID");
      }
      let s = `${getOauthConfig().BASE_API_URL}/v1/environment_providers/cloud/create`;
      return (await NP.post(s, {
        name: e,
        kind: "anthropic_cloud",
        description: "Default - trusted network access",
        config: {
          environment_type: "anthropic",
          cwd: "/home/user",
          init_script: null,
          environment: {},
          languages: [{
            name: "python",
            version: "3.11"
          }, {
            name: "node",
            version: "20"
          }],
          network_config: {
            allowed_hosts: [],
            allow_default_hosts: true
          }
        }
      }, {
        headers: {
          ...getOAuthHeaders(r),
          "anthropic-beta": "ccr-byoc-2025-07-29",
          "x-organization-uuid": o
        },
        timeout: 15000,
        signal: t
      })).data;
    });
  }
  async function v8a(e) {
    return [];
  }
  var Ppe = __lazy(() => {
    Dp();
    Uc();
    qP();
    ln();
    no();
    je();
    dt();
    YA();
    Rn();
    Ds();
    NC();
  });
  async function E5n() {
    if (!isClaudeAISubscriber()) {
      return false;
    }
    return checkAndRefreshOAuthTokenIfNeeded();
  }
  async function w8a() {
    return await getIsClean({
      ignoreUntracked: true
    });
  }
  async function C8a() {
    try {
      return await Koe();
    } catch (e) {
      if (NP.isAxiosError(e) && e.response?.status === 401) {
        throw e;
      }
      logForDebugging(`fetchRemoteEnvironmentsForEligibility failed: ${he(e)}`);
      return null;
    }
  }
  async function Egt(e) {
    let t = e ?? Nt();
    if (findGitRoot(t) !== null) {
      return true;
    }
    let {
      stdout: n,
      code: r
    } = await execFileNoThrowWithCwd(gitExe(), ["rev-parse", "--is-inside-work-tree"], {
      cwd: t
    });
    return r === 0 && n.trim() === "true";
  }
  async function x8e(e, t, n) {
    try {
      let r = getClaudeAIOAuthTokens()?.accessToken;
      if (!r) {
        logForDebugging("checkGithubAppInstalled: No access token found, assuming app not installed");
        return false;
      }
      let o = await getOrganizationUUID();
      if (!o) {
        logForDebugging("checkGithubAppInstalled: No org UUID found, assuming app not installed");
        return false;
      }
      let s = `${getOauthConfig().BASE_API_URL}/api/oauth/organizations/${o}/code/repos/${e}/${t}`;
      let i = {
        ...getOAuthHeaders(r),
        "x-organization-uuid": o
      };
      logForDebugging(`Checking GitHub app installation for ${e}/${t}`);
      let a = await NP.get(s, {
        headers: i,
        timeout: 15000,
        signal: n
      });
      if (a.status === 200) {
        if (a.data.status) {
          let l = a.data.status.app_installed;
          logForDebugging(`GitHub app ${l ? "is" : "is not"} installed on ${e}/${t}`);
          return l;
        }
        logForDebugging(`GitHub app is not installed on ${e}/${t} (status is null)`);
        return false;
      }
      logForDebugging(`checkGithubAppInstalled: Unexpected response status ${a.status}`);
      return false;
    } catch (r) {
      if (NP.isAxiosError(r)) {
        let o = r.response?.status;
        if (o && o >= 400 && o < 500) {
          logForDebugging(`checkGithubAppInstalled: Got ${o} error, app likely not installed on ${e}/${t}`);
          return false;
        }
      }
      logForDebugging(`checkGithubAppInstalled error: ${he(r)}`);
      return false;
    }
  }
  async function o8p() {
    try {
      let e = getClaudeAIOAuthTokens()?.accessToken;
      if (!e) {
        logForDebugging("checkGithubTokenSynced: No access token found");
        return false;
      }
      let t = await getOrganizationUUID();
      if (!t) {
        logForDebugging("checkGithubTokenSynced: No org UUID found");
        return false;
      }
      let n = `${getOauthConfig().BASE_API_URL}/api/oauth/organizations/${t}/sync/github/auth`;
      let r = {
        ...getOAuthHeaders(e),
        "x-organization-uuid": t
      };
      logForDebugging("Checking if GitHub token is synced via web-setup");
      let o = await NP.get(n, {
        headers: r,
        timeout: 15000
      });
      let s = o.status === 200 && o.data?.is_authenticated === true;
      logForDebugging(`GitHub token synced: ${s} (status=${o.status}, data=${De(o.data)})`);
      return s;
    } catch (e) {
      if (NP.isAxiosError(e)) {
        let t = e.response?.status;
        if (t && t >= 400 && t < 500) {
          logForDebugging(`checkGithubTokenSynced: Got ${t}, token not synced`);
          return false;
        }
      }
      logForDebugging(`checkGithubTokenSynced error: ${he(e)}`);
      return false;
    }
  }
  async function R8a(e, t) {
    if (await x8e(e, t)) {
      return {
        hasAccess: true,
        method: "github-app"
      };
    }
    if (getFeatureValue_CACHED_MAY_BE_STALE("tengu_cobalt_lantern", false) && (await o8p())) {
      return {
        hasAccess: true,
        method: "token-sync"
      };
    }
    return {
      hasAccess: false,
      method: "none"
    };
  }
  var UNe = __lazy(() => {
    Dp();
    Uc();
    qP();
    $n();
    no();
    vo();
    je();
    bI();
    dt();
    ji();
    na();
    NC();
    Ppe();
  });
  async function x8a({
    allowBundle: e = false,
    cwd: t
  } = {}) {
    let n = [];
    if (!isPolicyAllowed("allow_remote_sessions")) {
      n.push({
        type: "policy_blocked"
      });
      Et("bg_remote_eligibility_check", "policy_blocked");
      return n;
    }
    let [r, o] = await Promise.all([E5n(), detectCurrentRepositoryWithHost(t)]);
    let s = null;
    if (r) {
      n.push({
        type: "not_logged_in"
      });
    } else {
      try {
        s = await C8a();
      } catch {
        n.push({
          type: "not_logged_in"
        });
      }
    }
    let i = getInitialSettings()?.remote?.defaultEnvironmentId;
    let a = T5n(i) || i !== undefined && s !== null && s.some(c => c.environment_id === i && c.kind === "byoc");
    let l = e && (st(process.env.CCR_FORCE_BUNDLE) || st(process.env.CCR_ENABLE_BUNDLE) || (await checkGate_CACHED_OR_BLOCKING("tengu_ccr_bundle_seed_enabled")));
    if (!(await Egt(t))) {
      n.push({
        type: "not_in_git_repo",
        cwd: t ?? Nt()
      });
    } else if (l && findGitRoot(t ?? Nt()) !== null) {
      ;
    } else if (o === null) {
      n.push({
        type: "no_git_remote"
      });
    } else if (!a && ef(o.host)) {
      if (!(await x8e(o.owner, o.name))) {
        n.push({
          type: "github_app_not_installed"
        });
      }
    }
    if (n.length === 0) {
      Pe("bg_remote_eligibility_check");
    } else {
      Ae("bg_remote_eligibility_check", n[0].type);
    }
    return n;
  }
  var k8a = __lazy(() => {
    ln();
    $n();
    Kc();
    vo();
    bI();
    gn();
    na();
    fk();
    Ppe();
    UNe();
  });
  function v5n(e, t, n, r) {
    if (!r) {
      return {
        url: `${e}/v1/sessions/${t}/events`,
        body: {
          events: n
        }
      };
    }
    let o = toInfraSessionId(t);
    return {
      url: `${e}/v1/code/sessions/${encodeURIComponent(o)}/events`,
      body: {
        events: n.map(s => ({
          payload: typeof s.uuid === "string" && s.uuid ? s : {
            ...s,
            uuid: A8a.randomUUID()
          }
        }))
      }
    };
  }
  var A8a;
  var gwo = __lazy(() => {
    A8a = require("crypto");
  });
  function a8p(e) {
    if (e === undefined || e === null) {
      return "UNSPECIFIED";
    }
    if (typeof e === "number") {
      return i8p[e] ?? "UNSPECIFIED";
    }
    if (typeof e !== "string") {
      return "UNSPECIFIED";
    }
    let t = e.startsWith("DEVICE_ATTESTATION_STATUS_") ? e.slice(("DEVICE_ATTESTATION_STATUS_").length) : e;
    return s8p.find(n => n === t) ?? "UNSPECIFIED";
  }
  function l8p(e, t) {
    if (e === "SERVICE_VOUCHED") {
      return true;
    }
    let n = ywo.findIndex(r => r === e);
    return n !== -1 && n <= ywo.indexOf(t);
  }
  function P8a(e) {
    let t = u8p().safeParse(e);
    return {
      enforce: true,
      acceptLevel: t.success ? t.data.accept_level : "VERIFIED",
      acceptStatuses: new Set(t.success ? t.data.accept_statuses : [])
    };
  }
  function vgt(e) {
    O8a = e;
  }
  function _wo(e) {
    D8a = e;
  }
  function C5n(e) {
    let t = typeof e.payload?.type === "string" ? e.payload.type : e.event_type;
    let n = t === "user" || t === "control_response";
    let r = a8p(e.device_attestation_status);
    let o = O8a?.() ?? w5n;
    if (l8p(r, o.acceptLevel)) {
      if (n) {
        Pe("bridge_event_attestation");
      }
      return false;
    }
    if (!o.enforce) {
      if (r === "UNSPECIFIED") {
        return false;
      }
      if (n) {
        logForDebugging(`[bridge:attestation] accepting unverified ${t} event_id=${e.event_id} status=${r}`, {
          level: "info"
        });
        Et("bridge_event_attestation", `${r.toLowerCase()}_${t}`);
      }
      return false;
    }
    let s = o.acceptStatuses.vZc(r);
    if (n) {
      let i = `${r.toLowerCase()}_${t}`;
      if (logForDebugging(`[bridge:attestation] ${s ? "accepting (config exception)" : "DROPPING"} unverified ${t} event_id=${e.event_id} status=${r}`, {
        level: s ? "info" : "warn"
      }), s) {
        Et("bridge_event_attestation", i);
      } else {
        Ae("bridge_event_attestation", i);
        try {
          D8a?.({
            status: r,
            payloadType: t
          });
        } catch (a) {
          logForDebugging(`[bridge:attestation] drop notifier threw: ${he(a)}`, {
            level: "error"
          });
        }
      }
    }
    return !s;
  }
  var s8p;
  var i8p;
  var ywo;
  var w5n;
  var c8p;
  var u8p;
  var O8a;
  var D8a;
  var k8e = __lazy(() => {
    ln();
    je();
    dt();
    s8p = ["UNSPECIFIED", "ABSENT", "VERIFIED", "VERIFIED_BY_GATE", "INVALID", "UNCHECKED", "VERIFIED_KEYLESS_DEVICE", "SERVICE_VOUCHED"];
    i8p = ["UNSPECIFIED", "ABSENT", "VERIFIED", "VERIFIED_BY_GATE", "INVALID", "UNCHECKED"];
    ywo = ["VERIFIED", "VERIFIED_KEYLESS_DEVICE", "VERIFIED_BY_GATE"];
    w5n = {
      enforce: false,
      acceptLevel: "VERIFIED",
      acceptStatuses: new Set()
    };
    c8p = ["UNSPECIFIED", "ABSENT", "INVALID", "UNCHECKED"];
    u8p = we(() => v.object({
      accept_level: v.enum(ywo).default("VERIFIED"),
      accept_statuses: v.array(v.enum(c8p)).default([])
    }));
  });
  var k5n = {};