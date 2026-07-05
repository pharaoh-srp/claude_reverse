  __export(Ukl, {
    loadPluginWorkflows: () => loadPluginWorkflows,
    clearPluginWorkflowCache: () => clearPluginWorkflowCache
  });
  async function Nkl(e, t, n, r, o) {
    let s = zt();
    let i;
    try {
      i = await s.readdir(e);
    } catch {
      return [];
    }
    return (await Promise.all(i.map(async l => {
      if (!(l.isFile() || l.isSymbolicLink())) {
        return null;
      }
      if (!l.name.endsWith(".js")) {
        return null;
      }
      return Fkl(Lkl.join(e, l.name), t, n, r, o);
    }))).filter(l => l !== null);
  }
  async function Fkl(e, t, n, r, o) {
    let s = zt();
    if (dte(s, e, o)) {
      return null;
    }
    try {
      let i = await $F(s, e, 524288);
      if (i === null) {
        logForDebugging(`Plugin workflow ${e}: not a regular file or exceeds ${524288} bytes \u2014 skipping`, {
          level: "warn"
        });
        return null;
      }
      let a = fA(i);
      if ("error" in a) {
        logForDebugging(`Plugin workflow ${e} has invalid meta: ${a.error} \u2014 skipping`, {
          level: "warn"
        });
        return null;
      }
      let l = `${t}:${a.meta.name}`;
      return {
        source: "plugin",
        plugin: n,
        pluginManifest: r,
        name: l,
        description: a.meta.description,
        whenToUse: a.meta.whenToUse,
        phases: a.meta.phases,
        script: i,
        filePath: e
      };
    } catch (i) {
      logForDebugging(`Failed to load workflow from ${e}: ${i}`, {
        level: "error"
      });
      return null;
    }
  }
  function clearPluginWorkflowCache() {
    loadPluginWorkflows.cache?.clear?.();
  }
  var Lkl;
  var loadPluginWorkflows;
  var GLo = __lazy(() => {
    ln();
    Bse();
    DJ();
    cV();
    je();
    n1();
    xg();
    Lkl = require("path");
    loadPluginWorkflows = TEr(async () => {
      let {
        enabled: e,
        errors: t
      } = await loadAllPluginsCacheOnly();
      let n = [];
      if (t.length > 0) {
        logForDebugging(`Plugin loading errors: ${t.map(o => hS(o)).join(", ")}`);
      }
      let r = null;
      for (let o of e) {
        let s = new Set();
        if (o.workflowsPath) {
          try {
            let i = await Nkl(o.workflowsPath, o.name, o.source, o.manifest, s);
            if (n.push(...i), i.length > 0) {
              logForDebugging(`Loaded ${i.length} workflows from plugin ${o.name} default directory`);
            }
          } catch (i) {
            r = "plugin_load_workflows_dir_failed";
            logForDebugging(`Failed to load workflows from plugin ${o.name} default directory: ${i}`, {
              level: "error"
            });
          }
        }
        if (o.workflowsPaths) {
          for (let i of o.workflowsPaths) {
            try {
              let l = await zt().stat(i);
              if (l.isDirectory()) {
                let c = await Nkl(i, o.name, o.source, o.manifest, s);
                if (n.push(...c), c.length > 0) {
                  logForDebugging(`Loaded ${c.length} workflows from plugin ${o.name} custom path: ${i}`);
                }
              } else if (l.isFile() && i.endsWith(".js")) {
                let c = await Fkl(i, o.name, o.source, o.manifest, s);
                if (c) {
                  n.push(c);
                  logForDebugging(`Loaded workflow from plugin ${o.name} custom file: ${i}`);
                }
              }
            } catch (a) {
              r = "plugin_load_workflows_path_failed";
              logForDebugging(`Failed to load workflows from plugin ${o.name} custom path ${i}: ${a}`, {
                level: "error"
              });
            }
          }
        }
      }
      if (logForDebugging(`Total plugin workflows loaded: ${n.length}`), r) {
        Ae("plugin_load_workflows", r);
      } else {
        Pe("plugin_load_workflows");
      }
      return n;
    });
  });
  function itr(e, t, n) {
    Bkl.push({
      source: "built-in",
      ...t,
      script: e,
      hidden: n?.hidden
    });
  }
  function VLo() {
    if (Qz()) {
      return [];
    }
    return Bkl;
  }
  var Bkl;
  var atr = __lazy(() => {
    LLe();
    Bkl = [];
  });
  function D0m(e) {
    try {
      return p8e("workflows", e);
    } catch (t) {
      if (Zd(t)) {
        logForDebugging(`loadWorkflowsDir: project-dir walk failed: ${t.code}`, {
          level: "error"
        });
        return [];
      }
      throw t;
    }
  }
  async function $kl(e, t) {
    let n = zt();
    let r;
    try {
      r = await n.readdir(e);
    } catch {
      return [];
    }
    return (await Promise.all(r.map(async s => {
      if (!(s.isFile() || s.isSymbolicLink())) {
        return null;
      }
      if (!s.name.endsWith(".js")) {
        return null;
      }
      let i = zLo.join(e, s.name);
      let a;
      try {
        a = await n.readFileBytes(i, 524288 + 1);
      } catch {
        return null;
      }
      if (a.byteLength > 524288) {
        logForDebugging(`Workflow ${i} exceeds ${524288} bytes \u2014 skipping`, {
          level: "warn"
        });
        return null;
      }
      let l = a.toString("utf-8");
      let c = fA(l);
      if ("error" in c) {
        logForDebugging(`Workflow ${i} has invalid meta: ${c.error} \u2014 skipping`, {
          level: "warn"
        });
        return null;
      }
      return {
        source: t,
        name: c.meta.name,
        description: c.meta.description,
        whenToUse: c.meta.whenToUse,
        phases: c.meta.phases,
        script: l,
        filePath: i
      };
    }))).filter(s => s !== null);
  }
  async function Hkl(e) {
    let t = zLo.join(er(), "workflows");
    let n = D0m(e);
    let [r, ...o] = await Promise.all([qf("userSettings") ? $kl(t, "userSettings") : Promise.resolve([]), ...(qf("projectSettings") ? n.map(i => $kl(i, "projectSettings")) : [])]);
    let s = new Map();
    for (let i of r) {
      s.set(i.name, i);
    }
    for (let i = o.length - 1; i >= 0; i--) {
      for (let a of o[i]) {
        s.set(a.name, a);
      }
    }
    return [...s.values()].sort((i, a) => i.name.localeCompare(a.name));
  }
  var zLo;
  var jkl = __lazy(() => {
    je();
    gn();
    dt();
    v9();
    nf();
    Bse();
    DJ();
    zLo = require("path");
  });
  async function BYt(e, t) {
    return (await ZLe(t)).find(r => r.name === e);
  }
  function invalidateWorkflowCache() {
    ZLe.cache.clear?.();
    clearPluginWorkflowCache();
  }
  var ZLe;
  var $Yt = __lazy(() => {
    LLe();
    wb();
    GLo();
    atr();
    jkl();
    ZLe = TEr(async e => {
      if (Pc("workflows")) {
        return [...VLo()];
      }
      let [t, n] = await Promise.all([Hkl(e), loadPluginWorkflows()]);
      let r = new Set(t.map(a => a.name));
      let o = n.filter(a => !r.vZc(a.name));
      let s = new Set([...r, ...o.map(a => a.name)]);
      return [...VLo().filter(a => !s.vZc(a.name)), ...o, ...t];
    }, e => `${Qz()}:${e}`);
  });
  function qkl(e, t, n, r, o, s, i, a, l, c) {
    let u = Dkl(e, t, n, r, o, i, a, l, c);
    let d = {
      sanitize: A => A === null || typeof A !== "object" && typeof A !== "function" ? A : {},
      toStr: A => $Tt(A)
    };
    let p = BLo(A => n({
      type: "progress",
      toolUseID: "workflow_log",
      data: {
        type: "workflow_log",
        message: A
      }
    }), d);
    let m = Object.freeze({
      __proto__: null,
      total: a?.total ?? null,
      spent: TZ(() => a?.getTurnSpent() ?? 0),
      remaining: TZ(() => a?.total == null ? 1 / 0 : Math.max(0, a.total - a.getTurnSpent()))
    });
    let f = e.abortController?.signal;
    let h = ykl(f);
    let g = HYt.createContext({
      __proto__: null,
      log: TZ(u.log),
      phase: TZ(u.phase),
      console: p,
      budget: m,
      setTimeout: h.setTimeout,
      clearTimeout: h.clearTimeout
    }, {
      codeGeneration: {
        strings: false,
        wasm: false
      }
    });
    etr(g);
    WKe(g);
    let {
      vmToStr: y,
      vmStringify: _,
      vmOwnString: b
    } = Ker(g);
    h.bindVMInvoke(HYt.runInContext("(fn => { fn() })", g));
    let S = qer(g);
    let E = Tkl({
      hooks: u,
      budget: m,
      abortSignal: f,
      timers: h,
      resolveWorkflow: BYt,
      getAllWorkflows: ZLe,
      intakeClone: S
    });
    let C = Wer(g);
    for (let [A, k] of [["agent", u.agent], ["parallel", u.parallel], ["pipeline", u.pipeline], ["workflow", E]]) {
      Object.defineProperty(g, A, {
        value: C(Ver(k)),
        writable: true,
        enumerable: true,
        configurable: true
      });
    }
    {
      let A = s === undefined ? undefined : JSON.stringify(s);
      Object.defineProperty(g, "args", {
        value: A === undefined ? undefined : HYt.runInContext(`JSON.parse(${JSON.stringify(A)})`, g),
        writable: true,
        enumerable: true,
        configurable: true
      });
    }
    let x = Yer(g);
    d.sanitize = x.sanitize;
    d.toStr = y;
    u.bindVMAwait({
      settle: BTt(g),
      call: pkl(g),
      clone: S,
      sanitize: x.sanitize,
      snapshot: x.snapshot,
      getProp: x.getProp
    });
    return {
      vmContext: g,
      hooks: u,
      vmToStr: y,
      vmOwnString: b,
      vmStringify: _
    };
  }
  var HYt;
  var Wkl = __lazy(() => {
    swe();
    Ekl();
    GKe();
    Mkl();
    $Yt();
    HYt = __toESM(require("vm"));
  });
  async function Gkl(e, t, n, r = {}) {
    let o = Date.now();
    let s = [];
    let i = p => {
      if (p.type === "progress" && p.data.type === "workflow_log" && s.length < 1000) {
        s.push(p.data.message);
      }
      r.onProgress?.(p);
    };
    let a = r.journal ? await r.journal.load() : undefined;
    let l = qkl(t, n, i, r.workflowRunId, r.onAgentController, r.args, r.seedPhaseTitles, r.tokenBudget, r.journal, a);
    let c = jer(l.vmContext);
    let u = t.abortController?.signal;
    let d;
    try {
      let p = e.runInContext(l.vmContext, {
        timeout: r.syncTimeoutMs ?? 30000
      });
      let m = BTt(l.vmContext)(p);
      m.catch(() => {});
      let h = (u ? await Promise.race([m, new Promise((_, b) => {
        let S = () => b(Error("Workflow aborted"));
        if (u.aborted) {
          S();
        } else {
          u.addEventListener("abort", S);
          d = () => u.removeEventListener("abort", S);
        }
      })]) : await m).v;
      if (typeof h === "function") {
        throw Error("workflow result cannot be a function");
      }
      let g = h !== null && typeof h === "object" ? l.hooks.sanitizeVMValue(h) : h;
      let y;
      try {
        y = xN(g);
      } catch (_) {
        if (g === null || typeof g !== "object") {
          throw _;
        }
        y = JSON.parse(De(g, (b, S) => typeof S === "function" ? undefined : S) ?? "null");
      }
      De(y);
      return {
        result: y,
        agentCount: l.hooks.getAgentCount(),
        logs: s,
        failures: l.hooks.getFailures(),
        durationMs: Date.now() - o
      };
    } catch (p) {
      let {
        name: m,
        message: f,
        stack: h
      } = c(p);
      if (h) {
        logForDebugging(`Workflow script error stack trace:
${h}`, {
          level: "error"
        });
      }
      let g;
      if (h) {
        let y = h.split(`
`);
        let _ = y.slice(1).filter(b => b.trim().startsWith("at "));
        g = _.length <= 5 ? h : [y[0] ?? "", ..._.slice(0, 5)].join(`
`);
      } else {
        g = f ? `${m}: ${f}` : m;
      }
      return {
        result: null,
        agentCount: l.hooks.getAgentCount(),
        logs: s,
        failures: l.hooks.getFailures(),
        durationMs: Date.now() - o,
        error: g
      };
    } finally {
      d?.();
    }
  }
  var Vkl = __lazy(() => {
    je();
    swe();
    GKe();
    Wkl();
  });
  function KLo(e) {
    let {
      taskId: t,
      workflowRunId: n,
      script: r,
      scriptPath: o,
      args: s,
      meta: i,
      vmScript: a,
      toolUseContext: l,
      canUseTool: c,
      toolUseId: u,
      transcriptDir: d,
      telemetry: p,
      isResume: m
    } = e;
    let f = i.description;
    let h = i.name;
    if (m) {
      Pe("task_local_workflow_resume");
      for (let [E, C] of Object.entries(l.taskRegistry.all())) {
        if (C.type === "local_workflow" && C.workflowRunId === n && C.status !== "running") {
          l.taskRegistry.remove(E);
        }
      }
    }
    let g = u5n(l.agentId, l.taskRegistry);
    let y = registerWorkflowTask({
      taskId: t,
      script: r,
      scriptPath: o,
      summary: f,
      workflowName: h,
      title: i.title,
      phases: i.phases,
      defaultModel: l.options.mainLoopModel,
      workflowRunId: n,
      args: s,
      ownerAgentId: g,
      taskRegistry: l.taskRegistry,
      toolUseId: u,
      startTime: e.startTime
    });
    if (g && !getIsNonInteractiveSession()) {
      _oe(g, `workflow:${t}`, l.taskRegistry);
    }
    let _ = {
      ...l,
      abortController: y.abortController ?? l.abortController
    };
    let b = getTotalOutputTokens() - getTurnOutputTokens();
    let S = {
      total: getCurrentTurnTokenBudget(),
      getTurnSpent: () => getTotalOutputTokens() - b
    };
    (async () => {
      let E = [];
      let C = 16;
      let x;
      let A = () => {
        if (x = undefined, E.length === 0) {
          return;
        }
        let U = E;
        if (E = [], updateWorkflowProgressBatch(t, U, l.taskRegistry), !getIsNonInteractiveSession()) {
          return;
        }
        let N = U.filter(zkl);
        if (N.length === 0) {
          return;
        }
        let W = _.getAppState()?.tasks?.[t];
        if (W?.type !== "local_workflow" || W.status !== "running") {
          return;
        }
        let j = N.findLast(V => V.type === "workflow_agent");
        let z = N.every(V => V.type === "workflow_agent" && V.state === "progress");
        hgt({
          taskId: t,
          toolUseId: u,
          description: j ? j.phaseTitle ? `${j.phaseTitle}: ${j.label}` : j.label : y.description,
          startTime: y.startTime,
          totalTokens: W.totalTokens,
          toolUses: W.totalToolCalls,
          lastToolName: j?.label,
          summary: f,
          workflowProgress: z ? undefined : W.workflowProgress.filter(zkl)
        });
      };
      let I = await Gkl(a, _, c, {
        workflowRunId: n,
        onProgress: U => {
          if (U.type !== "progress") {
            return;
          }
          if (E.push(U.data), !x) {
            x = setTimeout(A, C);
          }
        },
        onAgentController: (U, N) => {
          if (N) {
            y.agentControllers?.set(U, N);
          } else {
            y.agentControllers?.delete(U);
          }
        },
        args: s,
        seedPhaseTitles: i.phases?.map(U => U.title),
        tokenBudget: S,
        journal: new $Lo(n)
      });
      if (unwrapAbortReason(y.abortController?.signal.reason) === "background") {
        if (x) {
          clearTimeout(x);
        }
        return;
      }
      if (x) {
        clearTimeout(x);
      }
      A();
      let O = _.getAppState()?.tasks?.[t];
      let M = (O?.workflowProgress ?? []).filter(U => U.type !== "workflow_log");
      let L = O?.totalTokens ?? 0;
      let P = O?.totalToolCalls ?? 0;
      let F = y.abortController?.signal.aborted ? "killed" : I.error ? "failed" : "completed";
      if (logEvent("tengu_workflow_completed", {
        workflow_run_id: n,
        workflow_source: p.source,
        workflow_name: p.name,
        workflow_description: p.description,
        status: F,
        agent_count: I.agentCount,
        total_tokens: L,
        total_tool_calls: P,
        duration_ms: I.durationMs
      }), p.source === "built-in") {
        let U = new Map();
        for (let N of O?.workflowProgress ?? []) {
          if (N.type !== "workflow_agent") {
            continue;
          }
          if (N.phaseIndex === undefined || !N.phaseTitle) {
            continue;
          }
          let W = U.get(N.phaseIndex);
          if (!W) {
            W = {
              title: N.phaseTitle,
              tokens: 0,
              toolCalls: 0,
              durationMs: 0,
              agentCount: 0,
              errorCount: 0,
              skipCount: 0
            };
            U.set(N.phaseIndex, W);
          }
          if (W.tokens += N.tokens ?? 0, W.toolCalls += N.toolCalls ?? 0, W.durationMs += N.durationMs ?? 0, W.agentCount += 1, N.state === "error") {
            if (N.error === "skipped by user") {
              W.skipCount += 1;
            } else {
              W.errorCount += 1;
            }
          }
        }
        for (let [N, W] of U) {
          logEvent("tengu_workflow_phase_completed", {
            workflow_run_id: n,
            workflow_source: p.source,
            workflow_name: p.name,
            phase_index: N,
            phase_title: W.title,
            phase_tokens: W.tokens,
            phase_tool_calls: W.toolCalls,
            phase_agent_duration_ms: W.durationMs,
            phase_agent_count: W.agentCount,
            phase_error_count: W.errorCount,
            phase_skip_count: W.skipCount
          });
        }
      }
      if (yVa(n, {
        taskId: t,
        script: r,
        scriptPath: o,
        args: s,
        result: I.result,
        agentCount: I.agentCount,
        logs: I.logs,
        durationMs: I.durationMs,
        error: I.error,
        summary: f,
        workflowName: h,
        title: i.title,
        status: F,
        startTime: y.startTime,
        phases: y.phases,
        defaultModel: y.defaultModel,
        workflowProgress: M,
        totalTokens: L,
        totalToolCalls: P
      }), y.abortController?.signal.aborted) {
        return;
      }
      let H = {
        total_tokens: L,
        tool_uses: P,
        duration_ms: I.durationMs
      };
      if (I.error) {
        failWorkflowTask(t, I.error, I.agentCount, I.logs, l.taskRegistry, {
          summary: `Dynamic workflow "${f}" failed: ${I.error}`,
          output_file: y.outputFile,
          usage: H
        });
      } else {
        completeWorkflowTask(t, I.result, I.agentCount, I.logs, l.taskRegistry, {
          summary: `Dynamic workflow "${f}" completed`,
          output_file: y.outputFile,
          usage: H
        });
      }
      enqueueWorkflowNotification({
        taskId: t,
        summary: f,
        status: I.error ? "failed" : "completed",
        error: I.error,
        result: I.result,
        failures: I.failures,
        agentCount: I.agentCount,
        totalTokens: L,
        totalToolCalls: P,
        durationMs: I.durationMs,
        taskRegistry: l.taskRegistry,
        toolUseId: u,
        transcriptDir: d,
        scriptPath: o,
        workflowRunId: n,
        args: s,
        workflowProgress: M
      });
    })().catch(E => {
      Oe(E);
      let C = E instanceof Error ? E.message : String(E);
      let x = _.getAppState()?.tasks?.[t];
      let A = x?.agentCount ?? 0;
      failWorkflowTask(t, C, A, x?.logs ?? [], l.taskRegistry, {
        summary: `Dynamic workflow "${f}" failed: ${C}`,
        output_file: y.outputFile,
        usage: {
          total_tokens: x?.totalTokens ?? 0,
          tool_uses: x?.totalToolCalls ?? 0,
          duration_ms: Date.now() - y.startTime
        }
      });
      enqueueWorkflowNotification({
        taskId: t,
        summary: f,
        status: "failed",
        error: C,
        agentCount: A,
        totalTokens: x?.totalTokens ?? 0,
        totalToolCalls: x?.totalToolCalls ?? 0,
        durationMs: Date.now() - y.startTime,
        taskRegistry: l.taskRegistry,
        toolUseId: u,
        transcriptDir: d,
        scriptPath: o,
        workflowRunId: n,
        args: s,
        workflowProgress: x?.workflowProgress
      });
    });
    return y;
  }
  async function Ykl(e) {
    let {
      taskId: t,
      workflowRunId: n,
      scriptPath: r,
      argsJson: o,
      startTime: s
    } = e;
    let i = await fWe(r);
    if ("error" in i) {
      throw new Po(i.error, "adopted workflow script read failed");
    }
    let a = i.script;
    if (e.scriptSha256 === undefined) {
      throw new Po("workflow was checkpointed without a content pin; resume via the Workflow tool", "adopted workflow missing scriptSha256");
    }
    if (Kkl.createHash("sha256").update(a).digest("hex") !== e.scriptSha256) {
      throw new Po("script content changed since it was approved; resume via the Workflow tool to re-approve", "adopted workflow scriptSha256 mismatch");
    }
    let l = fA(a);
    if ("error" in l) {
      throw new Po(`Invalid workflow script: ${l.error}`, "adopted workflow script parse failed");
    }
    let c = HTt(l.scriptBody);
    if (!c.ok) {
      throw new Po(`Workflow script compile failed: ${c.error}`, "adopted workflow script compile failed");
    }
    let u = o !== undefined ? qt(o) : undefined;
    for (let d of Object.values(e.toolUseContext.taskRegistry.all())) {
      if (d.type === "local_workflow" && d.workflowRunId === n && d.status === "running") {
        e.toolUseContext.taskRegistry.remove(t);
        return;
      }
    }
    KLo({
      taskId: t,
      workflowRunId: n,
      script: a,
      scriptPath: r,
      args: u,
      meta: l.meta,
      vmScript: c.vmScript,
      toolUseContext: e.toolUseContext,
      canUseTool: e.canUseTool,
      toolUseId: undefined,
      transcriptDir: hz(n),
      telemetry: {
        source: "adopt",
        name: "custom",
        description: ""
      },
      isResume: true,
      startTime: s
    });
  }
  function zkl(e) {
    return e.type !== "workflow_log";
  }
  var Kkl;
  var YLo = __lazy(() => {
    at();
    ln();
    Ot();
    ry();
    Dpe();
    Kp();
    dt();
    Rn();
    o5n();
    GKe();
    Vkl();
    HLo();
    Bse();
    VNe();
    DJ();
    Kkl = require("crypto");
  });
  var JLo;
  var Jkl = __lazy(() => {
    wl();
    JLo = `Execute a workflow script that orchestrates multiple subagents deterministically. Workflows run in the background \u2014 this tool returns immediately with a task ID, and a <task-notification> arrives when the workflow completes. Use /workflows to watch live progress.

A workflow structures work across many agents \u2014 to be comprehensive (decompose and cover in parallel), to be confident (independent perspectives and adversarial checks before committing), or to take on scale one context can't hold (migrations, audits, broad sweeps). The script is where you encode that structure: what fans out, what verifies, what synthesizes.

ONLY call this tool when the user has explicitly opted into multi-agent orchestration. Workflows can spawn dozens of agents and consume a large amount of tokens; the user must request that scale, not have it inferred. Explicit opt-in means one of:
- The user included the keyword "ultracode" in their prompt (you'll see a system-reminder confirming it).
- Ultracode is on for the session (a system-reminder confirms it) \u2014 see **Ultracode** below.
- The user directly asked you to run a workflow or use multi-agent orchestration in their own words ("use a workflow", "run a workflow", "fan out agents", "orchestrate this with subagents"). The ask must be in the user's words \u2014 a task that would merely benefit from a workflow does not count.
- The user invoked a skill or slash command whose instructions tell you to call Workflow.
- The user asked you to run a specific named or saved workflow.

For any other task \u2014 even one that would clearly benefit from parallelism \u2014 do NOT call this tool. Use the Agent tool for individual subagents, or briefly describe what a multi-agent workflow could do and how much it would roughly cost, and ask the user whether to run it. Mention they can ask for one with "use a workflow" in a future message to skip the ask.

When you do call it, the right move is often **hybrid**: scout inline first (list the files, find the channels, scope the diff) to discover the work-list, then call Workflow to pipeline over it. You don't need to know the shape before the *task* \u2014 only before the *orchestration step*.

Common single-phase workflows you can chain across turns:
- **Understand** \u2014 parallel readers over relevant subsystems \u2192 structured map
- **Design** \u2014 judge panel of N independent approaches \u2192 scored synthesis
- **Review** \u2014 dimensions \u2192 find \u2192 adversarially verify (example below)
- **Research** \u2014 multi-modal sweep \u2192 deep-read \u2192 synthesize
- **Migrate** \u2014 discover sites \u2192 transform each (worktree isolation) \u2192 verify

For larger work, run several in sequence \u2014 read each result before deciding the next phase. You stay in the loop; each workflow is one well-scoped fan-out.

**Ultracode.** When a system-reminder confirms ultracode is on, that opt-in is standing: author and run a workflow for every substantive task by default. The goal is the most exhaustive, correct answer you can produce \u2014 token cost is not a constraint. For multi-phase work (understand \u2192 design \u2192 implement \u2192 review), that often means several workflows in sequence \u2014 one per phase \u2014 so you stay in the loop between them. The quality patterns below (adversarial verify, multi-modal sweep, completeness critic, loop-until-dry) are the tools; pick what fits the task. Lean toward orchestrating with workflows and adversarially verifying your findings \u2014 unless the work is trivial or already verified. Solo only on conversational turns or trivial mechanical edits. When a reminder says ultracode is off, revert to the opt-in rule above.

Pass the script inline via \`script\` \u2014 do not Write it to a file first. Every${""} invocation automatically persists its script to a file under the session directory and returns the path in the tool result. To iterate on a workflow, edit that file with Write/Edit and re-invoke Workflow with \`{scriptPath: "<path>"}\` instead of resending the full script.${""}

Every script must begin with \`export const meta = {...}\`:
  export const meta = {
    name: 'find-flaky-tests',
    description: 'Find flaky tests and propose fixes',   // one-line, shown in permission dialog
    phases: [                                            // one entry per phase() call
      { title: 'Scan', detail: 'grep test logs for retries' },
      { title: 'Fix', detail: 'one agent per flaky test' },
    ],
  }
  // script body starts here \u2014 use agent()/parallel()/pipeline()/phase()/log()
  phase('Scan')
  const flaky = await agent('grep CI logs for retry markers', {schema: FLAKY_SCHEMA})
  ...

The \`meta\` object must be a PURE LITERAL \u2014 no variables, function calls, spreads, or template interpolation. Required fields: \`name\`, \`description\`. Optional: \`whenToUse\` (shown in the workflow list), \`phases\`. Use the SAME phase titles in meta.phases as in phase() calls \u2014 titles are matched exactly; a phase() call with no matching meta entry just gets its own progress group. Add \`model\` to a phase entry when that phase uses a specific model override.

Script body hooks:
- agent(prompt: string, opts?: {label?: string, phase?: string, schema?: object, model?: string, effort?: string, isolation?: ${"'worktree'"}, agentType?: string}): Promise<any> \u2014 spawn a subagent. Without schema, returns its final text as a string. With schema (a JSON Schema), the subagent is forced to call a StructuredOutput tool and agent() returns the validated object \u2014 no parsing needed. Returns null if the user skips the agent mid-run or the subagent dies on a terminal API error after retries (filter with .filter(Boolean)). opts.label overrides the display label. opts.phase explicitly assigns this agent to a progress group (use this inside pipeline()/parallel() stages to avoid races on the global phase() state \u2014 same phase string \u2192 same group box). opts.model overrides the model for this agent call. Default to omitting it \u2014 the agent inherits the main-loop model (the resolved session model), which is almost always correct. Only set it when you're highly confident a different tier fits the task; when unsure, omit. opts.effort overrides the reasoning effort for this agent call ('low' | 'medium' | 'high' | 'xhigh' | 'max') \u2014 omit to inherit the session effort; use 'low' for cheap mechanical stages and higher tiers only for the hardest verify/judge stages. opts.isolation: 'worktree' runs the agent in a fresh git worktree \u2014 EXPENSIVE (~200-500ms setup + disk per agent), use ONLY when agents mutate files in parallel and would otherwise conflict; the worktree is auto-removed if unchanged.${""} opts.agentType uses a custom subagent type (e.g. 'general-purpose', 'code-reviewer') instead of the default workflow subagent \u2014 resolved from the same registry as the Agent tool; composes with schema (the custom agent's system prompt gets a StructuredOutput instruction appended).
- pipeline(items, stage1, stage2, ...): Promise<any[]> \u2014 run each item through all stages independently, NO barrier between stages. Item A can be in stage 3 while item B is still in stage 1. This is the DEFAULT for multi-stage work. Wall-clock = slowest single-item chain, not sum-of-slowest-per-stage. Every stage callback receives (prevResult, originalItem, index) \u2014 use originalItem/index in later stages to label work without threading context through stage 1's return value. A stage that throws drops that item to \`null\` and skips its remaining stages.
- parallel(thunks: Array<() => Promise<any>>): Promise<any[]> \u2014 run tasks concurrently. This is a BARRIER: awaits all thunks before returning. A thunk that throws (or whose agent errors) resolves to \`null\` in the result array \u2014 the call itself never rejects, so \`.filter(Boolean)\` before using the results. Use ONLY when you genuinely need all results together.
- log(message: string): void \u2014 emit a progress message to the user (shown as a narrator line above the progress tree)
- phase(title: string): void \u2014 start a new phase; subsequent agent() calls are grouped under this title in the progress display
- args: any \u2014 the value passed as Workflow's \`args\` input, verbatim (undefined if not provided). Pass arrays/objects as actual JSON values in the tool call, NOT as a JSON-encoded string \u2014 \`args: ["a.ts", "b.ts"]\`, not \`args: "[\\"a.ts\\", ...]"\` (a stringified list reaches the script as one string, so \`args.filter\`/\`args.map\` throw). Use this to parameterize named workflows \u2014 e.g. pass a research question, target path, or config object directly instead of via a side-channel file.
- budget: {total: number|null, spent(): number, remaining(): number} \u2014 the turn's token target from the user's "+500k"-style directive. \`budget.total\` is null if no target was set. \`budget.spent()\` returns output tokens spent this turn across the main loop and all workflows \u2014 the pool is shared, not per-workflow. \`budget.remaining()\` returns \`max(0, total - spent())\`, or \`Infinity\` if no target. The target is a HARD ceiling, not advisory: once \`spent()\` reaches \`total\`, further \`agent()\` calls throw. Use for dynamic loops: \`while (budget.total && budget.remaining() > 50_000) { ... }\`, or static scaling: \`const FLEET = budget.total ? Math.floor(budget.total / 100_000) : 5\`.
- workflow(nameOrRef: string | {scriptPath: string}, args?: any): Promise<any> \u2014 run another workflow inline as a sub-step and return whatever it returns. Pass a name to invoke a saved workflow (same registry as {name: "..."}), or {scriptPath} to run a script file you Wrote earlier. The child shares this run's concurrency cap, agent counter, abort signal, and token budget \u2014 its agents appear under a "${"\u25B8"} name" group in /workflows and its tokens count toward budget.spent(). The args param becomes the child's \`args\` global. Nesting is one level only: workflow() inside a child throws. Throws on unknown name / unreadable scriptPath / child syntax error; catch to handle gracefully.

Subagents are told their final text IS the return value (not a human-facing message), so they return raw data. For structured output, use the schema option \u2014 validation happens at the tool-call layer so the model retries on mismatch.

Workflow agents can reach all session-connected MCP tools via ToolSearch \u2014 schemas load on demand per agent. Caveat: interactively-authenticated MCP servers (e.g. claude.ai) may be absent in headless/cron runs.

Scripts are plain JavaScript, NOT TypeScript \u2014 type annotations (\`: string[]\`), interfaces, and generics fail to parse. The script body runs in an async context \u2014 use await directly. Standard JS built-ins (JSON, Math, Array, etc.) are available \u2014 EXCEPT \`Date.now()\`/\`Math.random()\`/argless \`new Date()\`, which throw (they would break resume); pass timestamps in via \`args\`, stamp results after the workflow returns, and for randomness vary the agent prompt/label by index. No filesystem or Node.js API access.

DEFAULT TO pipeline(). Only reach for a barrier (parallel between stages) when you genuinely need ALL prior-stage results together.

A barrier is correct ONLY when stage N needs cross-item context from all of stage N-1:
- Dedup/merge across the full result set before expensive downstream work
- Early-exit if the total count is zero ("0 bugs found \u2192 skip verification entirely")
- Stage N's prompt references "the other findings" for comparison

A barrier is NOT justified by:
- "I need to flatten/map/filter first" \u2014 do it inside a pipeline stage: pipeline(items, stageA, r => transform([r]).flat(), stageB)
- "The stages are conceptually separate" \u2014 that's what pipeline() models. Separate stages \u2260 synchronized stages.
- "It's cleaner code" \u2014 barrier latency is real. If 5 finders run and the slowest takes 3\xD7 the fastest, a barrier wastes 2/3 of the fast finders' idle time.

Smell test: if you wrote
  const a = await parallel(...)
  const b = transform(a)        // flatten, map, filter \u2014 no cross-item dependency
  const c = await parallel(b.map(...))
that middle transform doesn't need the barrier. Rewrite as a pipeline with the transform inside a stage. When in doubt: pipeline.

Concurrent agent() calls are capped at min(16, cpu cores - 2) per workflow \u2014 excess calls queue and run as slots free up. You can still pass 100 items to parallel()/pipeline() and they all complete; only ~10 run at any moment. Total agent count across a workflow's lifetime is capped at 1000 \u2014 a runaway-loop backstop set far above any real workflow. A single parallel()/pipeline() call accepts at most 4096 items; passing more is an explicit error, not a silent truncation.

The canonical multi-stage pattern \u2014 pipeline by default, each dimension verifies as soon as its review completes:
  export const meta = {
    name: 'review-changes',
    description: 'Review changed files across dimensions, verify each finding',
    phases: [{ title: 'Review' }, { title: 'Verify' }],
  }
  const DIMENSIONS = [{key: 'bugs', prompt: '...'}, {key: 'perf', prompt: '...'}]
  const results = await pipeline(
    DIMENSIONS,
    d => agent(d.prompt, {label: \`review:\${d.key}\`, phase: 'Review', schema: FINDINGS_SCHEMA}),
    review => parallel(review.findings.map(f => () =>
      agent(\`Adversarially verify: \${f.title}\`, {label: \`verify:\${f.file}\`, phase: 'Verify', schema: VERDICT_SCHEMA})
        .then(v => ({...f, verdict: v}))
    ))
  )
  const confirmed = results.flat().filter(Boolean).filter(f => f.verdict?.isReal)
  return { confirmed }
  // Dimension 'bugs' findings verify while dimension 'perf' is still reviewing. No wasted wall-clock.

When a barrier IS correct \u2014 dedup across all findings before expensive verification:
  const all = await parallel(DIMENSIONS.map(d => () => agent(d.prompt, {schema: FINDINGS_SCHEMA})))
  const deduped = dedupeByFileAndLine(all.filter(Boolean).flatMap(r => r.findings))  // <-- genuinely needs ALL at once
  const verified = await parallel(deduped.map(f => () => agent(verifyPrompt(f), {schema: VERDICT_SCHEMA})))

Loop-until-count pattern \u2014 accumulate to a target:
  const bugs = []
  while (bugs.length < 10) {
    const result = await agent("Find bugs in this codebase.", {schema: BUGS_SCHEMA})
    bugs.push(...result.bugs)
    log(\`\${bugs.length}/10 found\`)
  }

Loop-until-budget pattern \u2014 scale depth to the user's "+500k" directive. Guard on budget.total: with no target set, remaining() is Infinity and the loop would run straight to the 1000-agent cap.
  const bugs = []
  while (budget.total && budget.remaining() > 50_000) {
    const result = await agent("Find bugs in this codebase.", {schema: BUGS_SCHEMA})
    bugs.push(...result.bugs)
    log(\`\${bugs.length} found, \${Math.round(budget.remaining()/1000)}k remaining\`)
  }

Composing patterns \u2014 exhaustive review (find \u2192 dedup vs seen \u2192 diverse-lens panel \u2192 loop-until-dry):
  const seen = new Set(), confirmed = []
  let dry = 0
  while (dry < 2) {                                              // loop-until-dry
    const found = (await parallel(FINDERS.map(f => () =>          // barrier: collect all finders this round
      agent(f.prompt, {phase: 'Find', schema: BUGS})))).filter(Boolean).flatMap(r => r.bugs)
    const fresh = found.filter(b => !seen.has(key(b)))           // dedup vs ALL seen \u2014 plain code, not an agent
    if (!fresh.length) { dry++; continue }
    dry = 0; fresh.forEach(b => seen.add(key(b)))
    const judged = await parallel(fresh.map(b => () =>           // every fresh bug judged concurrently...
      parallel(['correctness','security','repro'].map(lens => () =>   // ...each by 3 distinct lenses
        agent(\`Judge "\${b.desc}" via the \${lens} lens \u2014 real?\`, {phase: 'Verify', schema: VERDICT})))
        .then(vs => ({ b, real: vs.filter(Boolean).filter(v => v.real).length >= 2 }))))
    confirmed.push(...judged.filter(v => v.real).map(v => v.b))
  }
  return confirmed
  // dedup vs \`seen\`, NOT \`confirmed\` \u2014 else judge-rejected findings reappear every round and it never converges.

Quality patterns \u2014 common shapes; pick by task and compose freely:
- Adversarial verify: spawn N independent skeptics per finding, each prompted to REFUTE. Kill if \u2265majority refute. Prevents plausible-but-wrong findings from surviving.
    const votes = await parallel(Array.from({length: 3}, () => () =>
      agent(\`Try to refute: \${claim}. Default to refuted=true if uncertain.\`, {schema: VERDICT})))
    const survives = votes.filter(Boolean).filter(v => !v.refuted).length >= 2
- Perspective-diverse verify: when a finding can fail in more than one way, give each verifier a distinct lens (correctness, security, perf, does-it-reproduce) instead of N identical refuters \u2014 diversity catches failure modes redundancy can't.
- Judge panel: generate N independent attempts from different angles (e.g. MVP-first, risk-first, user-first), score with parallel judges, synthesize from the winner while grafting the best ideas from runners-up. Beats one-attempt-iterated when the solution space is wide.
- Loop-until-dry: for unknown-size discovery (bugs, issues, edge cases), keep spawning finders until K consecutive rounds return nothing new. Simple counters (while count < N) miss the tail.
- Multi-modal sweep: parallel agents each searching a different way (by-container, by-content, by-entity, by-time). Each is blind to what the others surface; useful when one search angle won't find everything.
- Completeness critic: a final agent that asks "what's missing \u2014 modality not run, claim unverified, source unread?" What it finds becomes the next round of work.
- No silent caps: if a workflow bounds coverage (top-N, no-retry, sampling), \`log()\` what was dropped \u2014 silent truncation reads as "covered everything" when it didn't.

Scale to what the user asked for. "find any bugs" \u2192 a few finders, single-vote verify. "thoroughly audit this" or "be comprehensive" \u2192 larger finder pool, 3\u20135 vote adversarial pass, synthesis stage. When unsure, lean toward thoroughness for research/review/audit requests and toward brevity for quick checks.

These patterns aren't exhaustive \u2014 compose novel harnesses when the task calls for it (tournament brackets, self-repair loops, staged escalation, whatever fits).

Use this tool for multi-step orchestration where control flow should be deterministic (loops, conditionals, fan-out) rather than model-driven.

## Resume

The tool result includes a runId. To resume after a pause, kill, or script edit, relaunch with Workflow({scriptPath, resumeFromRunId}) \u2014 the longest unchanged prefix of agent() calls returns cached results instantly; the first edited/new call and everything after it runs live. Same script + same args \u2192 100% cache hit. Before diagnosing why a completed workflow returned an empty or unexpected result, Read <transcriptDir>/journal.jsonl \u2014 it records each agent's actual return value; do not assume cached results are non-empty. Date.now()/Math.random()/new Date() are unavailable in scripts (they would break this) \u2014 stamp results after the workflow returns, or pass timestamps via args. Fallback when no journal is available: Read agent-<id>.jsonl files in the transcript directory and hand-author a continuation script.`;
  });
  var Xkl = __lazy(() => {
    tZ();
    na();
    FM();
    dI();
  });
  function jYt(e, t, n) {
    let r = o => getMarketingNameForModel(o) ?? o;
    if (t != null) {
      return `${n?.compact || e == null ? "" : `${r(e)} `}${"\u2192"} ${r(t)}`;
    }
    return e != null ? r(e) : "";
  }
  var XLo = __lazy(() => {
    wl();
    Eo();
  });
  function ctr(e) {
    let t = new Map();
    let n = [];
    let r = new Map();
    for (let o of e) {
      if (o.type === "workflow_agent") {
        t.set(o.index, o);
      } else if (o.type === "workflow_log") {
        n.push(o.message);
      } else if (o.type === "workflow_phase") {
        r.set(o.index, {
          title: o.title,
          kind: o.kind
        });
      }
    }
    return {
      agents: [...t.values()].sort((o, s) => o.index - s.index),
      logs: n,
      phaseTitles: r
    };
  }
  function QLo(e, t) {
    if (!e.some(r => r.phaseIndex != null)) {
      return null;
    }
    let n = new Map();
    for (let r of e) {
      let o = r.phaseIndex ?? 0;
      let s = n.get(o);
      if (!s) {
        let i = t.get(o);
        s = {
          phaseIndex: o,
          title: i?.title ?? `Phase ${o}`,
          kind: i?.kind,
          agents: []
        };
        n.set(o, s);
      }
      s.agents.push(r);
    }
    return [...n.values()].sort((r, o) => r.phaseIndex - o.phaseIndex);
  }
  function Zkl(e) {
    let t = qYt.c(32);
    let {
      row: n,
      isLast: r
    } = e;
    let o = r ? "\u2514\u2500" : "\u251C\u2500";
    let s = n.state === "start" || n.state === "progress";
    let i;
    let a;
    e: switch (n.state) {
      case "done":
        {
          i = vGd.tick;
          a = "success";
          break e;
        }
      case "error":
        {
          i = vGd.cross;
          a = "error";
          break e;
        }
      case "start":
      case "progress":
        i = "\u27F3";
        a = undefined;
    }
    let l;
    if (t[0] !== s || t[1] !== n.agentType || t[2] !== n.durationMs || t[3] !== n.fallbackModel || t[4] !== n.model || t[5] !== n.tokens || t[6] !== n.toolCalls) {
      if (l = [], n.agentType != null) {
        l.push(n.agentType);
      }
      if (n.model != null || n.fallbackModel != null) {
        let m;
        if (t[8] !== n.fallbackModel || t[9] !== n.model) {
          m = jYt(n.model, n.fallbackModel);
          t[8] = n.fallbackModel;
          t[9] = n.model;
          t[10] = m;
        } else {
          m = t[10];
        }
        l.push(m);
      }
      if (n.tokens != null) {
        let m;
        if (t[11] !== n.tokens) {
          m = formatTokens(n.tokens);
          t[11] = n.tokens;
          t[12] = m;
        } else {
          m = t[12];
        }
        l.push(`${m} tok`);
      }
      if (n.toolCalls != null && n.toolCalls > 0) {
        let m = n.toolCalls;
        let f;
        if (t[13] !== n.toolCalls) {
          f = un(n.toolCalls, "tool");
          t[13] = n.toolCalls;
          t[14] = f;
        } else {
          f = t[14];
        }
        l.push(`${m} ${f}`);
      }
      if (n.durationMs != null) {
        let m;
        if (t[15] !== n.durationMs) {
          m = formatDuration(n.durationMs);
          t[15] = n.durationMs;
          t[16] = m;
        } else {
          m = t[16];
        }
        l.push(m);
      }
      if (s && l.length === 0) {
        l.push("\u2026running");
      }
      t[0] = s;
      t[1] = n.agentType;
      t[2] = n.durationMs;
      t[3] = n.fallbackModel;
      t[4] = n.model;
      t[5] = n.tokens;
      t[6] = n.toolCalls;
      t[7] = l;
    } else {
      l = t[7];
    }
    let c;
    if (t[17] !== i || t[18] !== a) {
      c = uy.jsx(Text, {
        color: a,
        children: i
      });
      t[17] = i;
      t[18] = a;
      t[19] = c;
    } else {
      c = t[19];
    }
    let u;
    if (t[20] !== l) {
      u = l.length > 0 && uy.jsxs(Text, {
        dimColor: true,
        children: ["  ", l.join(" \xB7 ")]
      });
      t[20] = l;
      t[21] = u;
    } else {
      u = t[21];
    }
    let d;
    if (t[22] !== n.error || t[23] !== n.state) {
      d = n.state === "error" && n.error && uy.jsxs(Text, {
        color: "error",
        children: [" ", "\u2014", " ", n.error]
      });
      t[22] = n.error;
      t[23] = n.state;
      t[24] = d;
    } else {
      d = t[24];
    }
    let p;
    if (t[25] !== s || t[26] !== n.label || t[27] !== c || t[28] !== u || t[29] !== d || t[30] !== o) {
      p = uy.jsx(gXd, {
        paddingLeft: 1,
        children: uy.jsxs(Text, {
          dimColor: s,
          children: [o, " ", c, " ", n.label, u, d]
        })
      });
      t[25] = s;
      t[26] = n.label;
      t[27] = c;
      t[28] = u;
      t[29] = d;
      t[30] = o;
      t[31] = p;
    } else {
      p = t[31];
    }
    return p;
  }
  function B0m(e) {
    let t = qYt.c(42);
    let {
      group: n,
      verbose: r,
      width: o
    } = e;
    let s;
    if (t[0] !== n.agents) {
      s = n.agents.filter(j0m);
      t[0] = n.agents;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i = s;
    let a;
    let l;
    let c;
    let u;
    let d;
    if (t[2] !== i.length || t[3] !== n.agents || t[4] !== r) {
      let M = n.agents.filter(H0m);
      let L = n.agents.filter($0m);
      d = n.agents.length;
      l = i.length;
      c = M.length;
      a = l + c === d && d > 0;
      u = r ? n.agents : [...M, ...L];
      t[2] = i.length;
      t[3] = n.agents;
      t[4] = r;
      t[5] = a;
      t[6] = l;
      t[7] = c;
      t[8] = u;
      t[9] = d;
    } else {
      a = t[5];
      l = t[6];
      c = t[7];
      u = t[8];
      d = t[9];
    }
    let p = u;
    let m = n.agents[0]?.model;
    let f;
    if (t[10] !== m || t[11] !== n.agents) {
      f = m && n.agents.every(M => M.model === m) ? getMarketingNameForModel(m) ?? m : undefined;
      t[10] = m;
      t[11] = n.agents;
      t[12] = f;
    } else {
      f = t[12];
    }
    let h = f;
    let g = a ? c > 0 ? vGd.cross : vGd.tick : "\u27F3";
    let y = a ? c > 0 ? "error" : "success" : undefined;
    let _ = n.kind === "child" ? "permission" : "subtle";
    let b;
    if (t[13] !== n.title) {
      b = uy.jsx(Text, {
        bold: true,
        children: n.title
      });
      t[13] = n.title;
      t[14] = b;
    } else {
      b = t[14];
    }
    let S;
    if (t[15] !== y || t[16] !== g) {
      S = uy.jsx(Text, {
        color: y,
        children: g
      });
      t[15] = y;
      t[16] = g;
      t[17] = S;
    } else {
      S = t[17];
    }
    let E = h && ` \xB7 ${h}`;
    let C;
    if (t[18] !== c) {
      C = c > 0 && uy.jsxs(Text, {
        color: "error",
        children: [" ", "\xB7", " ", c, " failed"]
      });
      t[18] = c;
      t[19] = C;
    } else {
      C = t[19];
    }
    let x;
    if (t[20] !== l || t[21] !== E || t[22] !== C || t[23] !== d) {
      x = uy.jsxs(Text, {
        dimColor: true,
        children: [l, "/", d, E, C]
      });
      t[20] = l;
      t[21] = E;
      t[22] = C;
      t[23] = d;
      t[24] = x;
    } else {
      x = t[24];
    }
    let A;
    if (t[25] !== b || t[26] !== S || t[27] !== x) {
      A = uy.jsx(gXd, {
        paddingX: 1,
        children: uy.jsxs(Text, {
          children: [b, "  ", S, " ", x]
        })
      });
      t[25] = b;
      t[26] = S;
      t[27] = x;
      t[28] = A;
    } else {
      A = t[28];
    }
    let k;
    if (t[29] !== l || t[30] !== r) {
      k = !r && l > 0 && uy.jsx(gXd, {
        paddingLeft: 1,
        children: uy.jsxs(Text, {
          dimColor: true,
          children: [uy.jsx(Ps, {
            status: "success"
          }), " ", l, " done"]
        })
      });
      t[29] = l;
      t[30] = r;
      t[31] = k;
    } else {
      k = t[31];
    }
    let I;
    if (t[32] !== p) {
      let M;
      if (t[34] !== p.length) {
        M = (L, P) => uy.jsx(Zkl, {
          row: L,
          isLast: P === p.length - 1
        }, L.index);
        t[34] = p.length;
        t[35] = M;
      } else {
        M = t[35];
      }
      I = p.map(M);
      t[32] = p;
      t[33] = I;
    } else {
      I = t[33];
    }
    let O;
    if (t[36] !== A || t[37] !== k || t[38] !== I || t[39] !== _ || t[40] !== o) {
      O = uy.jsxs(gXd, {
        flexDirection: "column",
        borderStyle: "single",
        borderColor: _,
        alignSelf: "flex-start",
        width: o,
        children: [A, k, I]
      });
      t[36] = A;
      t[37] = k;
      t[38] = I;
      t[39] = _;
      t[40] = o;
      t[41] = O;
    } else {
      O = t[41];
    }
    return O;
  }
  function $0m(e) {
    return e.state === "start" || e.state === "progress";
  }
  function H0m(e) {
    return e.state === "error";
  }
  function j0m(e) {
    return e.state === "done";
  }
  function W0m(e) {
    let t = qYt.c(26);
    let {
      agents: n,
      verbose: r
    } = e;
    let o;
    if (t[0] !== n || t[1] !== r) {
      o = r ? n : n.slice(-8);
      t[0] = n;
      t[1] = r;
      t[2] = o;
    } else {
      o = t[2];
    }
    let s = o;
    let i = n.length - s.length;
    let a;
    if (t[3] !== n) {
      a = Bn(n, V0m);
      t[3] = n;
      t[4] = a;
    } else {
      a = t[4];
    }
    let l = a;
    let c = Bn(n, G0m);
    let u = n.length;
    let d;
    if (t[5] !== n.length) {
      d = un(n.length, "agent");
      t[5] = n.length;
      t[6] = d;
    } else {
      d = t[6];
    }
    let p;
    if (t[7] !== c) {
      p = c > 0 && uy.jsxs(Text, {
        color: "error",
        children: [" ", "\xB7", " ", c, " failed"]
      });
      t[7] = c;
      t[8] = p;
    } else {
      p = t[8];
    }
    let m;
    if (t[9] !== n.length || t[10] !== l || t[11] !== d || t[12] !== p) {
      m = uy.jsxs(Text, {
        children: [u, " ", d, " ", "\xB7", " ", l, " done", p]
      });
      t[9] = n.length;
      t[10] = l;
      t[11] = d;
      t[12] = p;
      t[13] = m;
    } else {
      m = t[13];
    }
    let f;
    if (t[14] !== i || t[15] !== s) {
      let y;
      if (t[17] !== i || t[18] !== s.length) {
        y = (_, b) => uy.jsx(Zkl, {
          row: _,
          isLast: b === s.length - 1 && i === 0
        }, _.index);
        t[17] = i;
        t[18] = s.length;
        t[19] = y;
      } else {
        y = t[19];
      }
      f = s.map(y);
      t[14] = i;
      t[15] = s;
      t[16] = f;
    } else {
      f = t[16];
    }
    let h;
    if (t[20] !== i) {
      h = i > 0 && uy.jsx(gXd, {
        paddingLeft: 1,
        children: uy.jsxs(Text, {
          dimColor: true,
          children: ["\u2514\u2500 \xB7 \xB7 \xB7 +", i, " more"]
        })
      });
      t[20] = i;
      t[21] = h;
    } else {
      h = t[21];
    }
    let g;
    if (t[22] !== m || t[23] !== f || t[24] !== h) {
      g = uy.jsxs(gXd, {
        flexDirection: "column",
        children: [m, f, h]
      });
      t[22] = m;
      t[23] = f;
      t[24] = h;
      t[25] = g;
    } else {
      g = t[25];
    }
    return g;
  }
  function G0m(e) {
    return e.state === "error";
  }
  function V0m(e) {
    return e.state === "done";
  }
  function eAl(e) {
    let t = qYt.c(18);
    let {
      collected: n,
      verbose: r,
      width: o
    } = e;
    let {
      agents: s,
      logs: i,
      phaseTitles: a
    } = n;
    if (s.length === 0 && i.length === 0) {
      return null;
    }
    let l;
    let c;
    let u;
    let d;
    let p;
    if (t[0] !== s || t[1] !== i || t[2] !== a || t[3] !== r || t[4] !== o) {
      let f = QLo(s, a);
      let h;
      if (t[10] !== i) {
        h = i.at(-1);
        t[10] = i;
        t[11] = h;
      } else {
        h = t[11];
      }
      let g = h;
      let y = i.slice(-3, -1);
      l = gXd;
      c = "column";
      u = g && uy.jsx(gXd, {
        marginBottom: f || s.length > 0 ? 1 : 0,
        children: uy.jsxs(Text, {
          children: [vGd.pointer, " ", g]
        })
      });
      d = f ? uy.jsx(gXd, {
        flexDirection: "column",
        children: f.map((_, b) => uy.jsxs(Qkl.Fragment, {
          children: [uy.jsx(B0m, {
            group: _,
            verbose: r,
            width: o
          }), b < f.length - 1 && uy.jsx(gXd, {
            paddingLeft: 3,
            children: uy.jsx(Text, {
              dimColor: true,
              children: "\u2193"
            })
          })]
        }, _.phaseIndex))
      }) : s.length > 0 ? uy.jsx(W0m, {
        agents: s,
        verbose: r
      }) : null;
      p = y.length > 0 && uy.jsx(gXd, {
        flexDirection: "column",
        paddingLeft: 3,
        marginTop: 1,
        children: y.map(z0m)
      });
      t[0] = s;
      t[1] = i;
      t[2] = a;
      t[3] = r;
      t[4] = o;
      t[5] = l;
      t[6] = c;
      t[7] = u;
      t[8] = d;
      t[9] = p;
    } else {
      l = t[5];
      c = t[6];
      u = t[7];
      d = t[8];
      p = t[9];
    }
    let m;
    if (t[12] !== l || t[13] !== c || t[14] !== u || t[15] !== d || t[16] !== p) {
      m = uy.jsxs(l, {
        flexDirection: c,
        children: [u, d, p]
      });
      t[12] = l;
      t[13] = c;
      t[14] = u;
      t[15] = d;
      t[16] = p;
      t[17] = m;
    } else {
      m = t[17];
    }
    return m;
  }
  function z0m(e, t) {
    return uy.jsx(Text, {
      dimColor: true,
      children: e
    }, t);
  }
  var qYt;
  var Qkl;
  var uy;
  var ZLo = __lazy(() => {
    Vf();
    et();
    cs();
    Eo();
    Zn();
    XLo();
    qYt = __toESM(pt(), 1);
    Qkl = __toESM(ot(), 1);
    uy = __toESM(ie(), 1);
  });
  function Y0m(e) {
    let t = eFe.c(2);
    let n;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      n = GPs();
      t[0] = n;
    } else {
      n = t[0];
    }
    let r = n;
    let [o, s] = eFo.useState(0);
    let i = Due();
    let a;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      a = () => s(l => (l + 1) % r.length);
      t[1] = a;
    } else {
      a = t[1];
    }
    useInterval(a, e && !i ? 80 : null);
    return r[o % r.length];
  }
  function J0m(e) {
    let t = eFe.c(14);
    let {
      done: n,
      total: r,
      running: o
    } = e;
    let s;
    if (t[0] !== n || t[1] !== r) {
      s = r > 0 ? Math.round(n / r * 4) : 0;
      t[0] = n;
      t[1] = r;
      t[2] = s;
    } else {
      s = t[2];
    }
    let i = s;
    let a = Math.min(o ? 4 - 1 : 4, Math.max(0, i));
    let l = o ? Math.min(4 - a, 1) : 0;
    let c = 4 - a - l;
    let u = Y0m(l > 0);
    let d;
    if (t[3] !== a) {
      d = a > 0 && fR.jsx(Text, {
        color: "success",
        children: ("\u283F").repeat(a)
      });
      t[3] = a;
      t[4] = d;
    } else {
      d = t[4];
    }
    let p;
    if (t[5] !== u || t[6] !== l) {
      p = l > 0 && fR.jsx(Text, {
        color: "success",
        children: u
      });
      t[5] = u;
      t[6] = l;
      t[7] = p;
    } else {
      p = t[7];
    }
    let m;
    if (t[8] !== c) {
      m = c > 0 && fR.jsx(Text, {
        color: "subtle",
        dimColor: true,
        children: ("\u283F").repeat(c)
      });
      t[8] = c;
      t[9] = m;
    } else {
      m = t[9];
    }
    let f;
    if (t[10] !== d || t[11] !== p || t[12] !== m) {
      f = fR.jsxs(Text, {
        children: [d, p, m]
      });
      t[10] = d;
      t[11] = p;
      t[12] = m;
      t[13] = f;
    } else {
      f = t[13];
    }
    return f;
  }
  function nAl() {
    let e = eFe.c(8);
    let t = Sr();
    let {
      rows: n
    } = h_(t);
    let r = nE();
    let o;
    if (e[0] !== r || e[1] !== n) {
      o = !r && lre() ? Math.floor(n / 2) : n;
      e[0] = r;
      e[1] = n;
      e[2] = o;
    } else {
      o = e[2];
    }
    let s = o;
    let {
      columns: i
    } = t;
    let a = Math.max(24, i - 6);
    let l;
    if (e[3] !== s || e[4] !== i || e[5] !== n || e[6] !== a) {
      l = {
        availableRows: s,
        width: a,
        rows: n,
        columns: i
      };
      e[3] = s;
      e[4] = i;
      e[5] = n;
      e[6] = a;
      e[7] = l;
    } else {
      l = e[7];
    }
    return l;
  }
  function rAl(e) {
    let t = eFe.c(1);
    let n = e.status === "running";
    let [r, o] = eFo.useState(X0m);
    let s;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      s = () => o(Date.now());
      t[0] = s;
    } else {
      s = t[0];
    }
    useInterval(s, n ? 1000 : null);
    return Math.max(0, (e.endTime ?? r) - e.startTime - (e.totalPausedMs ?? 0));
  }
  function X0m() {
    return Date.now();
  }
  function oAl(e) {
    let t = eFe.c(28);
    let {
      index: n,
      title: r,
      done: o,
      total: s,
      status: i,
      selected: a,
      trailing: l
    } = e;
    let c = a === undefined ? false : a;
    let u = l === undefined ? "" : l;
    let d = i === "done";
    let p = i === "failed";
    let m = d || p;
    let f = c ? "permission" : d ? "success" : p ? "error" : "subtle";
    let h = c ? vGd.pointer : " ";
    let g = d ? vGd.tick : p ? vGd.cross : String(n);
    let y = an(h) + 1 + an(g) + 1;
    let _ = Math.max(1, 17 - y);
    let b;
    if (t[0] !== r || t[1] !== _) {
      b = truncateToWidth(r, _);
      t[0] = r;
      t[1] = _;
      t[2] = b;
    } else {
      b = t[2];
    }
    let S = b;
    let E = `${h} ${g} ${S}`;
    let C = Math.max(0, 17 - an(E));
    let x = s > 0 ? `${o}/${s}` : "";
    let A = c ? "permission" : undefined;
    let k;
    if (t[3] !== h || t[4] !== A) {
      k = fR.jsx(Text, {
        color: A,
        children: h
      });
      t[3] = h;
      t[4] = A;
      t[5] = k;
    } else {
      k = t[5];
    }
    let I;
    if (t[6] !== f || t[7] !== g) {
      I = fR.jsx(Text, {
        color: f,
        children: g
      });
      t[6] = f;
      t[7] = g;
      t[8] = I;
    } else {
      I = t[8];
    }
    let O = c ? "permission" : d ? "success" : p ? "error" : undefined;
    let M = !c && !m;
    let L;
    if (t[9] !== S || t[10] !== O || t[11] !== M) {
      L = fR.jsx(Text, {
        color: O,
        dimColor: M,
        children: S
      });
      t[9] = S;
      t[10] = O;
      t[11] = M;
      t[12] = L;
    } else {
      L = t[12];
    }
    let P;
    if (t[13] !== C) {
      P = " ".repeat(C);
      t[13] = C;
      t[14] = P;
    } else {
      P = t[14];
    }
    let F;
    if (t[15] !== P || t[16] !== k || t[17] !== I || t[18] !== L) {
      F = fR.jsxs(Text, {
        wrap: "truncate-end",
        children: [k, " ", I, " ", L, P]
      });
      t[15] = P;
      t[16] = k;
      t[17] = I;
      t[18] = L;
      t[19] = F;
    } else {
      F = t[19];
    }
    let H = c ? "permission" : d ? "success" : p ? "error" : undefined;
    let U = !c && !m;
    let N = u ? `  ${u}` : "";
    let W;
    if (t[20] !== x || t[21] !== H || t[22] !== U || t[23] !== N) {
      W = fR.jsxs(Text, {
        wrap: "truncate-end",
        color: H,
        dimColor: U,
        children: [x, N]
      });
      t[20] = x;
      t[21] = H;
      t[22] = U;
      t[23] = N;
      t[24] = W;
    } else {
      W = t[24];
    }
    let j;
    if (t[25] !== F || t[26] !== W) {
      j = fR.jsxs(gXd, {
        children: [F, W]
      });
      t[25] = F;
      t[26] = W;
      t[27] = j;
    } else {
      j = t[27];
    }
    return j;
  }
  function sAl(e) {
    let t = eFe.c(22);
    let {
      name: n,
      done: r,
      total: o,
      running: s,
      elapsedMs: i,
      complete: a,
      dotState: l,
      selected: c
    } = e;
    let u = c === undefined ? false : c;
    let d;
    if (t[0] !== i) {
      d = i !== undefined ? formatBarElapsed(i) : undefined;
      t[0] = i;
      t[1] = d;
    } else {
      d = t[1];
    }
    let p = d;
    let m = a ? ` \xB7 ${vGd.ellipsis} to view` : "";
    let f = l === "failed" ? "error" : "success";
    let h;
    if (t[2] !== f) {
      h = fR.jsx(Text, {
        color: f,
        children: Tc
      });
      t[2] = f;
      t[3] = h;
    } else {
      h = t[3];
    }
    let g;
    if (t[4] !== n || t[5] !== u) {
      g = n ? fR.jsxs(Text, {
        color: u ? "claude" : undefined,
        bold: u,
        children: [n, " "]
      }) : null;
      t[4] = n;
      t[5] = u;
      t[6] = g;
    } else {
      g = t[6];
    }
    let y;
    if (t[7] !== r || t[8] !== s || t[9] !== o) {
      y = fR.jsx(J0m, {
        done: r,
        total: o,
        running: s
      });
      t[7] = r;
      t[8] = s;
      t[9] = o;
      t[10] = y;
    } else {
      y = t[10];
    }
    let _ = !u;
    let b = ` \xB7 ${r}/${o} agents`;
    let S = p ? ` \xB7 ${p}` : "";
    let E;
    if (t[11] !== m || t[12] !== u || t[13] !== _ || t[14] !== b || t[15] !== S) {
      E = fR.jsxs(Text, {
        dimColor: _,
        bold: u,
        children: [b, S, m]
      });
      t[11] = m;
      t[12] = u;
      t[13] = _;
      t[14] = b;
      t[15] = S;
      t[16] = E;
    } else {
      E = t[16];
    }
    let C;
    if (t[17] !== h || t[18] !== g || t[19] !== y || t[20] !== E) {
      C = fR.jsxs(Text, {
        wrap: "truncate-end",
        children: [h, " ", g, y, E]
      });
      t[17] = h;
      t[18] = g;
      t[19] = y;
      t[20] = E;
      t[21] = C;
    } else {
      C = t[21];
    }
    return C;
  }
  function utr(e) {
    let t = eFe.c(18);
    let {
      name: n,
      subtext: r,
      stats: o,
      width: s
    } = e;
    let i;
    if (t[0] !== s) {
      i = ("\u2500").repeat(Math.max(1, s));
      t[0] = s;
      t[1] = i;
    } else {
      i = t[1];
    }
    let a;
    if (t[2] !== i) {
      a = fR.jsx(Text, {
        color: "text",
        wrap: "truncate-end",
        children: i
      });
      t[2] = i;
      t[3] = a;
    } else {
      a = t[3];
    }
    let l;
    if (t[4] !== n) {
      l = fR.jsxs(Text, {
        bold: true,
        color: "permission",
        wrap: "truncate-end",
        children: [" ", n]
      });
      t[4] = n;
      t[5] = l;
    } else {
      l = t[5];
    }
    let c;
    if (t[6] !== r) {
      c = fR.jsx(gXd, {
        flexGrow: 1,
        flexShrink: 1,
        overflow: "hidden",
        children: fR.jsxs(Text, {
          dimColor: true,
          wrap: "truncate-end",
          children: [" ", r]
        })
      });
      t[6] = r;
      t[7] = c;
    } else {
      c = t[7];
    }
    let u;
    if (t[8] !== o) {
      u = o ? fR.jsx(gXd, {
        flexShrink: 0,
        children: fR.jsxs(Text, {
          dimColor: true,
          children: [o, " "]
        })
      }) : null;
      t[8] = o;
      t[9] = u;
    } else {
      u = t[9];
    }
    let d;
    if (t[10] !== c || t[11] !== u || t[12] !== s) {
      d = fR.jsxs(gXd, {
        width: s,
        overflow: "hidden",
        children: [c, u]
      });
      t[10] = c;
      t[11] = u;
      t[12] = s;
      t[13] = d;
    } else {
      d = t[13];
    }
    let p;
    if (t[14] !== a || t[15] !== l || t[16] !== d) {
      p = fR.jsxs(gXd, {
        flexDirection: "column",
        children: [a, l, d]
      });
      t[14] = a;
      t[15] = l;
      t[16] = d;
      t[17] = p;
    } else {
      p = t[17];
    }
    return p;
  }
  var eFe;
  var eFo;
  var fR;
  var tFo = __lazy(() => {
    wl();
    rE();
    Ijt();
    ki();
    bc();
    et();
    cs();
    zp();
    dI();
    eFe = __toESM(pt(), 1);
    eFo = __toESM(ot(), 1);
    fR = __toESM(ie(), 1);
  });
  function nFo(e) {
    let t = Bn(e.agents, c => c.state === "done");
    let n = Bn(e.agents, c => c.state === "error");
    let r = e.agents.length;
    let o = t + n === r && r > 0;
    let s = 0;
    let i = 1 / 0;
    let a = 0;
    for (let c of e.agents) {
      if (c.tokens) {
        s += c.tokens;
      }
      if (c.startedAt != null) {
        if (c.startedAt < i) {
          i = c.startedAt;
        }
        let u = c.lastProgressAt ?? c.startedAt;
        if (u > a) {
          a = u;
        }
      }
    }
    let l = i < 1 / 0 ? a - i : 0;
    return {
      title: e.title,
      status: o ? n > 0 ? "failed" : "done" : "running",
      agents: e.agents,
      doneCount: t,
      totalCount: r,
      tokens: s,
      durationMs: l
    };
  }
  function Q0m(e) {
    return {
      title: e,
      status: "not-started",
      agents: [],
      doneCount: 0,
      totalCount: 0,
      tokens: 0,
      durationMs: 0
    };
  }
  function iAl(e) {
    return e.toLowerCase().trim();
  }
  function Z0m(e, t) {
    let n = new Set();
    let r = [];
    function o(s) {
      let i = iAl(s);
      for (let a of t) {
        if (n.vZc(a)) {
          continue;
        }
        let l = iAl(a.title);
        if (i === l || l.startsWith(i) || i.startsWith(l)) {
          n.add(a);
          return a;
        }
      }
      return;
    }
    for (let s of e ?? []) {
      let i = o(s.title);
      r.push(i ? nFo(i) : Q0m(s.title));
    }
    for (let s of t) {
      if (!n.vZc(s)) {
        r.push(nFo(s));
      }
    }
    return r;
  }
  function aAl(e) {
    let t = ctr(e.workflowProgress);
    let n = QLo(t.agents, t.phaseTitles) ?? [];
    let r = Z0m(e.phases, n);
    if (r.length === 0 && t.agents.length > 0) {
      return [nFo({
        phaseIndex: 0,
        title: "Agents",
        agents: t.agents
      })];
    }
    return r;
  }
  function lAl(e, t) {
    let n = 0;
    let r = 0;
    for (let o of e) {
      n += o.doneCount;
      r += o.totalCount;
    }
    return {
      doneAgents: n,
      totalAgents: Math.max(t, r, n)
    };
  }
  function cAl(e) {
    if (e.script.length > 0) {
      let t = fA(e.script);
      if (!("error" in t) && t.meta.description) {
        return t.meta.description;
      }
    }
    return e.description || e.summary || "";
  }
  function uAl(e, t, n, r) {
    let o = e.status === "completed" ? " \xB7 done" : e.status === "killed" ? " \xB7 stopped" : e.status === "paused" ? " \xB7 paused" : Mw(e.status) ? " \xB7 failed" : "";
    let s = t;
    let i = `${n.doneAgents}/${n.totalAgents} ${un(n.totalAgents, "agent")} \xB7 ${formatBarElapsed(r)}${o}`;
    return {
      name: e.workflowName ?? e.summary ?? e.description,
      subtext: s,
      stats: i
    };
  }
  function dtr(e, t = 0) {
    let n = 0;
    let r = 0;
    let o = 0;
    let s = false;
    for (let l of e) {
      if (l.type !== "workflow_agent") {
        continue;
      }
      if (n++, l.state === "done") {
        r++;
      } else if (l.state === "error") {
        o++;
      } else if (l.state === "start" || l.state === "progress") {
        s = true;
      }
    }
    let i = Math.max(t, n);
    let a = !s && n > 0 && r + o >= i;
    return {
      done: r,
      failedCount: o,
      running: s,
      total: i,
      complete: a
    };
  }
  var ptr = __lazy(() => {
    Cx();
    cs();
    Zn();
    ZLo();
    Bse();
  });
  function pAl(e, {
    verbose: t
  }) {
    if (e.name) {
      return `dynamic workflow: ${e.name}`;
    }
    if (!e.script) {
      return null;
    }
    if (t) {
      return e.script;
    }
    let n = fA(e.script);
    if (!("error" in n)) {
      return n.meta.description;
    }
    let r = e.script.split(`
`).find(a => a.trim()) ?? e.script.slice(0, 40);
    let o = r.length > 80 ? r.slice(0, 80 - 1) + "\u2026" : r;
    let s = Ru(e.script, `
`) + 1;
    let i = bGt(s - 1);
    return i ? `${o} ${i}` : o;
  }
  function mAl(e, t) {
    let n = ctr(e.map(o => o.data));
    if (n.agents.length === 0 && n.logs.length === 0) {
      return null;
    }
    let r = Boolean(t?.verbose || t?.isTranscriptMode);
    if (r) {
      let o = t?.terminalSize?.columns ?? 80;
      let s = Math.min(80, Math.max(40, o - 10));
      return w_.jsx(Vn, {
        children: w_.jsx(eAl, {
          collected: n,
          verbose: r,
          width: s
        })
      });
    }
    return w_.jsx(Vn, {
      children: w_.jsx(eIm, {
        agents: n.agents
      })
    });
  }
  function eIm(e) {
    let t = rFo.c(8);
    let {
      agents: n
    } = e;
    let r;
    if (t[0] !== n) {
      r = dtr(n);
      t[0] = n;
      t[1] = r;
    } else {
      r = t[1];
    }
    let {
      done: o,
      failedCount: s,
      running: i,
      total: a,
      complete: l
    } = r;
    let c = s > 0 ? "failed" : l ? "done" : "running";
    let u;
    if (t[2] !== l || t[3] !== o || t[4] !== c || t[5] !== i || t[6] !== a) {
      u = w_.jsx(sAl, {
        done: o,
        total: a,
        running: i,
        complete: l,
        dotState: c
      });
      t[2] = l;
      t[3] = o;
      t[4] = c;
      t[5] = i;
      t[6] = a;
      t[7] = u;
    } else {
      u = t[7];
    }
    return u;
  }
  function fAl(e) {
    if (e.error) {
      return w_.jsx(Vn, {
        children: w_.jsxs(Text, {
          color: "error",
          children: [w_.jsx(Ps, {
            status: "error",
            withSpace: true
          }), Ad(e.error)]
        })
      });
    }
    if (e.status === "remote_launched") {
      return w_.jsx(Vn, {
        children: w_.jsxs(gXd, {
          flexDirection: "column",
          children: [w_.jsxs(Text, {
            children: [w_.jsx(Text, {
              dimColor: true,
              children: "Running in cloud session \xB7 "
            }), w_.jsx(Text, {
              color: "suggestion",
              children: e.sessionUrl
            })]
          }), e.warning ? w_.jsxs(Text, {
            color: "warning",
            children: [w_.jsx(Ps, {
              status: "warning",
              withSpace: true
            }), e.warning]
          }) : null]
        })
      });
    }
    return w_.jsx(tIm, {
      taskId: e.taskId
    });
  }
  function tIm(e) {
    let t = rFo.c(21);
    let {
      taskId: n
    } = e;
    let r;
    if (t[0] !== n) {
      r = i => i.tasks[n];
      t[0] = n;
      t[1] = r;
    } else {
      r = t[1];
    }
    let o = fw(r);
    if (o?.type === "local_workflow" && (o.status === "completed" || o.status === "failed" || o.status === "killed")) {
      let i;
      if (t[2] !== o.endTime || t[3] !== o.startTime) {
        i = o.endTime && o.startTime ? formatDuration(o.endTime - o.startTime) : undefined;
        t[2] = o.endTime;
        t[3] = o.startTime;
        t[4] = i;
      } else {
        i = t[4];
      }
      let a = i;
      let l = o.status === "failed";
      let c = o.status === "killed";
      let u = l || c ? "error" : "success";
      let d;
      if (t[5] !== u) {
        d = w_.jsx(Ps, {
          status: u,
          withSpace: true
        });
        t[5] = u;
        t[6] = d;
      } else {
        d = t[6];
      }
      let p = l ? "Failed" : c ? "Stopped" : "Completed";
      let m = a && ` in ${a}`;
      let f;
      if (t[7] !== o.agentCount) {
        f = o.agentCount > 0 && ` \xB7 ${o.agentCount} ${un(o.agentCount, "agent")}`;
        t[7] = o.agentCount;
        t[8] = f;
      } else {
        f = t[8];
      }
      let h;
      if (t[9] !== o.totalTokens) {
        h = o.totalTokens > 0 && ` \xB7 ${formatTokens(o.totalTokens)} tokens`;
        t[9] = o.totalTokens;
        t[10] = h;
      } else {
        h = t[10];
      }
      let g;
      if (t[11] !== p || t[12] !== m || t[13] !== f || t[14] !== h) {
        g = w_.jsxs(Text, {
          dimColor: true,
          children: [p, m, f, h]
        });
        t[11] = p;
        t[12] = m;
        t[13] = f;
        t[14] = h;
        t[15] = g;
      } else {
        g = t[15];
      }
      let y;
      if (t[16] !== d || t[17] !== g) {
        y = w_.jsx(Vn, {
          children: w_.jsxs(Text, {
            children: [d, g]
          })
        });
        t[16] = d;
        t[17] = g;
        t[18] = y;
      } else {
        y = t[18];
      }
      return y;
    }
    if (o?.type === "local_workflow") {
      let i;
      if (t[19] === Symbol.for("react.memo_cache_sentinel")) {
        i = w_.jsx(Vn, {
          children: w_.jsxs(Text, {
            children: [w_.jsx(Text, {
              dimColor: true,
              children: "Running in background \xB7 "
            }), w_.jsx(Text, {
              color: "suggestion",
              children: "/workflows"
            }), w_.jsx(Text, {
              dimColor: true,
              children: " to monitor and save"
            })]
          })
        });
        t[19] = i;
      } else {
        i = t[19];
      }
      return i;
    }
    let s;
    if (t[20] === Symbol.for("react.memo_cache_sentinel")) {
      s = w_.jsx(Vn, {
        children: w_.jsxs(Text, {
          children: [w_.jsx(Text, {
            color: "suggestion",
            children: "/workflows"
          }), w_.jsx(Text, {
            dimColor: true,
            children: " to view dynamic workflow runs"
          })]
        })
      });
      t[20] = s;
    } else {
      s = t[20];
    }
    return s;
  }
  function hAl() {
    return w_.jsx(Vn, {
      children: w_.jsx(Text, {
        dimColor: true,
        children: "Dynamic workflow cancelled"
      })
    });
  }
  var rFo;
  var w_;
  var gAl = __lazy(() => {
    YX();
    Vf();
    Wl();
    et();
    ho();
    cs();
    Zn();
    ZLo();
    Bse();
    tFo();
    ptr();
    rFo = __toESM(pt(), 1);
    w_ = __toESM(ie(), 1);
  });
  var oFo = {};
  __export(oFo, {
    WorkflowTool: () => WorkflowTool,
    WorkflowInputError: () => WorkflowInputError
  });
  async function yAl(e) {
    if (e.scriptPath) {
      if (e.script) {
        return {
          script: e.script,
          resolvedScriptPath: SAl.resolve(Nt(), e.scriptPath)
        };
      }
      let t = await fWe(e.scriptPath);
      if ("error" in t) {
        return t;
      }
      return {
        script: t.script,
        resolvedScriptPath: t.path
      };
    }
    if (e.name) {
      let t = await BYt(e.name, Nt());
      if (!t) {
        let n = (await ZLe(Nt())).map(r => r.name).join(", ");
        return {
          error: `Workflow "${e.name}" not found. Available: ${n || "(none)"}`
        };
      }
      return {
        script: e.script ?? t.script,
        source: t.source
      };
    }
    if (e.script) {
      return {
        script: e.script
      };
    }
    return {
      error: "Must provide script, name, or scriptPath"
    };
  }
  function sIm(e, t) {
    if (t === "built-in" && e) {
      return e;
    }
    return "custom";
  }
  function aIm(e, t) {
    if (t === "built-in") {
      return (e ?? "").slice(0, 200);
    }
    return "";
  }
  var bAl;
  var SAl;
  var rIm;
  var oIm;
  var WorkflowInputError;
  var _Al;
  var WorkflowTool;
  var sFo = __lazy(() => {
    ln();
    Ot();
    Cx();
    ci();
    Kp();
    Sl();
    vo();
    oy();
    GKe();
    YLo();
    Bse();
    Jkl();
    Xkl();
    $Yt();
    VNe();
    gAl();
    N2();
    DJ();
    cQr();
    bAl = require("crypto");
    SAl = require("path");
    rIm = we(() => v.strictObject({
      script: v.string().max(524288).refine(HTe, "script contains control characters that would be hidden in the approval dialog").optional().describe("Self-contained workflow script. Must begin with `export const meta = { name, description, phases }` (pure literal, no computed values) followed by the script body using agent()/parallel()/pipeline()/phase()."),
      name: v.string().optional().describe("Name of a predefined workflow (built-in or from .claude/workflows/). Resolves to a self-contained script."),
      description: v.string().optional().describe("Ignored \u2014 set the workflow description in the script's `meta` block."),
      title: v.string().optional().describe("Ignored \u2014 set the workflow title in the script's `meta` block."),
      args: v.unknown().optional().describe("Optional input value exposed to the script as the global `args`, verbatim. Pass arrays/objects as actual JSON values, NOT as a " + "JSON-encoded string \u2014 a stringified list breaks `args.filter`/" + "`args.map` in the script. Use for parameterized named workflows (e.g. a research question)."),
      scriptPath: v.string().optional().describe("Path to a workflow script file on disk. Every Workflow invocation persists its script under the session directory and returns the path in the tool result. To iterate, edit that file with Write/Edit and re-invoke Workflow with the same `scriptPath` instead of re-sending the full script. Takes precedence over `script` and `name`."),
      resumeFromRunId: v.string().regex(/^wf_[a-z0-9-]{6,}$/).optional().describe(`Run ID of a prior Workflow invocation to resume from. Completed agent() calls with unchanged (prompt, opts) return their cached results instantly; only edited or new calls re-run. Same-session only. Stop the prior run first (${"TaskStop"}) before resuming.`),
      ...false
    }).refine(e => e.script || e.name || e.scriptPath, {
      message: "Must provide script, name, or scriptPath"
    }));
    oIm = we(() => v.object({
      status: v.enum(["async_launched", "remote_launched"]),
      taskId: v.string(),
      taskType: v.enum(["local_workflow", "remote_agent"]).optional().describe("TaskType of the registered background task \u2014 'local_workflow' for in-process runs, 'remote_agent' when remote:true dispatches to CCR. Set on all new writes; absent only on transcripts written before this field existed."),
      workflowName: v.string().optional().describe("meta.name from the workflow script \u2014 same value as task_started.workflow_name. Set on all new writes; absent only on transcripts written before this field existed."),
      runId: v.string().optional().describe("Local workflow run identifier for resumeFromRunId. Absent for remote_launched (the CCR session URL is the resume handle there) and on transcripts written before this field existed."),
      summary: v.string().optional(),
      transcriptDir: v.string().optional().describe("Directory where subagent transcripts are written during execution"),
      scriptPath: v.string().optional().describe("Path to the persisted workflow script for this invocation. Editable via Write/Edit; pass back as `scriptPath` to re-run without resending the script."),
      sessionUrl: v.string().optional().describe("CCR session URL when status is remote_launched"),
      warning: v.string().optional().describe("Non-blocking heads-up (e.g. local git state diverges from the pushed branch the cloud session will clone)"),
      error: v.string().optional().describe("Set if syntax check failed")
    }));
    WorkflowInputError = class mtr extends Error {
      constructor(e) {
        super(e);
        this.name = "WorkflowInputError";
      }
    };
    _Al = {
      result: false,
      message: "Tool dispatch was retracted by a server fallback; the input may be truncated.",
      errorCode: 7
    };
    WorkflowTool = Xs({
      name: "Workflow",
      aliases: ["RunWorkflow"],
      searchHint: "orchestrate subagents with deterministic JavaScript workflow",
      maxResultSizeChars: 1e5,
      isEnabled: () => dT(),
      async prompt() {
        return JLo;
      },
      async description() {
        return JLo;
      },
      get inputSchema() {
        return rIm();
      },
      get outputSchema() {
        return oIm();
      },
      toAutoClassifierInput(e) {
        return e.script || e.scriptPath || e.name || "";
      },
      async validateInput(e, t) {
        if (isServerFallbackDiscard(t.abortController.signal)) {
          return _Al;
        }
        if (vDn()) {
          return {
            result: false,
            message: "Dynamic workflows are disabled by managed settings (`disableWorkflows`).",
            errorCode: 5
          };
        }
        if (!dT()) {
          return {
            result: false,
            message: 'Dynamic workflows are not enabled for this session (org policy, launch gate, or the "Dynamic workflows" setting in /config).',
            errorCode: 6
          };
        }
        let n = await yAl(e);
        if (isServerFallbackDiscard(t.abortController.signal)) {
          return _Al;
        }
        if ("error" in n) {
          return {
            result: false,
            message: n.error,
            errorCode: 1
          };
        }
        let r = fA(n.script);
        if ("error" in r) {
          return {
            result: false,
            message: `Invalid workflow script: ${r.error}`,
            errorCode: 2
          };
        }
        if (e.script && _kl(r.scriptBody)) {
          return {
            result: false,
            message: "Workflow scripts must be deterministic: Date.now()/Math.random()/new Date() are unavailable (breaks resume). Stamp results after the workflow returns, or pass timestamps via args.",
            errorCode: 4
          };
        }
        if (e.resumeFromRunId) {
          for (let [o, s] of Object.entries(t.taskRegistry.all())) {
            if (s.type === "local_workflow" && s.status === "running" && s.workflowRunId === e.resumeFromRunId) {
              return {
                result: false,
                message: `Workflow ${e.resumeFromRunId} is still running (task ${o}). Stop it first with ${"TaskStop"}({taskId: "${o}"}) before resuming.`,
                errorCode: 3
              };
            }
          }
        }
        return {
          result: true
        };
      },
      async checkPermissions(e, t) {
        let n = getToolPermissionContext(t);
        let r = e.scriptPath ? undefined : e.name;
        let o = c => r ? getRuleByContentsForToolName(n, "Workflow", c).get(r) : undefined;
        let s = o("deny");
        if (s) {
          return {
            behavior: "deny",
            message: `Workflow ${r} blocked by permission rules`,
            decisionReason: {
              type: "rule",
              rule: s
            }
          };
        }
        let i = e;
        if (e.scriptPath) {
          let c = await fWe(e.scriptPath);
          if (!("error" in c)) {
            i = {
              ...e,
              script: c.script
            };
          }
        } else if (e.name) {
          let c = await BYt(e.name, Nt());
          i = {
            ...e,
            script: c?.script
          };
        }
        let a = o("ask");
        if (a) {
          return {
            behavior: "ask",
            message: "Review dynamic workflow before running",
            updatedInput: i,
            decisionReason: {
              type: "rule",
              rule: a
            }
          };
        }
        let l = o("allow");
        if (l) {
          return {
            behavior: "allow",
            updatedInput: i,
            decisionReason: {
              type: "rule",
              rule: l
            }
          };
        }
        return {
          behavior: "ask",
          message: "Review dynamic workflow before running",
          updatedInput: i,
          ...(r && {
            suggestions: [{
              type: "addRules",
              rules: [{
                toolName: "Workflow",
                ruleContent: r
              }],
              behavior: "allow",
              destination: "localSettings"
            }]
          })
        };
      },
      userFacingName() {
        return "Workflow";
      },
      getToolUseSummary(e) {
        if (e?.name) {
          return `dynamic workflow: ${e.name}`;
        }
        if (!e?.script) {
          return null;
        }
        let t = fA(e.script);
        if (!("error" in t)) {
          return t.meta.description;
        }
        let n = e.script.split(`
`).find(r => r.trim()) ?? "";
        return n.length > 50 ? n.slice(0, 49) + "\u2026" : n;
      },
      async call(e, t, n, r, o) {
        let s = await yAl(e);
        if ("error" in s) {
          throw new WorkflowInputError(s.error);
        }
        let {
          script: i,
          source: a,
          resolvedScriptPath: l
        } = s;
        let c = fA(i);
        if ("error" in c) {
          throw new WorkflowInputError(`Invalid workflow script: ${c.error}`);
        }
        let u = e.resumeFromRunId ?? `wf_${bAl.randomUUID().slice(0, 12)}`;
        let d = TU("local_workflow");
        let p = c.meta.description;
        let m = c.meta.name;
        let f = HTt(c.scriptBody);
        if (!f.ok) {
          Ae("task_local_workflow", "compile_failed");
          return {
            data: {
              status: "async_launched",
              taskId: d,
              taskType: "local_workflow",
              workflowName: m,
              runId: u,
              summary: p,
              error: f.error
            }
          };
        }
        let h = hz(u);
        let g = l ?? w4i(m, u, i);
        let y = e.scriptPath ? "scriptPath" : a ?? "inline";
        let _ = sIm(m, a);
        let b = aIm(c.meta.description, a);
        logEvent("tengu_workflow_launched", {
          invocation_mode: e.scriptPath ? "scriptPath" : e.name ? "named" : "inline",
          workflow_source: y,
          workflow_name: _,
          workflow_description: b,
          phase_count: c.meta.phases?.length ?? 0,
          launched_from_subagent: t.agentId != null,
          has_args: e.args != null,
          is_resume: e.resumeFromRunId != null,
          script_size_chars: i.length
        });
        KLo({
          taskId: d,
          workflowRunId: u,
          script: i,
          scriptPath: g,
          args: e.args,
          meta: c.meta,
          vmScript: f.vmScript,
          toolUseContext: t,
          canUseTool: n,
          toolUseId: t.toolUseId,
          transcriptDir: h,
          telemetry: {
            source: y,
            name: _,
            description: b
          },
          isResume: e.resumeFromRunId != null
        });
        return {
          data: {
            status: "async_launched",
            taskId: d,
            taskType: "local_workflow",
            workflowName: m,
            runId: u,
            summary: p,
            transcriptDir: h,
            scriptPath: g
          }
        };
      },
      renderToolUseMessage: pAl,
      renderToolUseProgressMessage: mAl,
      renderToolResultMessage: fAl,
      renderToolUseRejectedMessage: hAl,
      mapToolResultToToolResultBlockParam(e, t) {
        if (e.error) {
          return {
            tool_use_id: t,
            type: "tool_result",
            content: `Workflow script has a syntax error and was not launched:
${e.error}`,
            is_error: true
          };
        }
        if (e.status === "remote_launched") {
          return {
            tool_use_id: t,
            type: "tool_result",
            content: `Workflow launched in a remote CCR session. Task ID: ${e.taskId}
Session: ${e.sessionUrl}
` + (e.summary ? `Summary: ${e.summary}
` : "") + (e.warning ? `Warning: ${e.warning}
` : "") + `
The workflow runs against a fresh clone of the pushed branch; phase progress is visible at the session URL, not in /workflows. You will be notified when it completes.`,
            is_error: false
          };
        }
        let n = e.summary ? `
Summary: ${e.summary}` : "";
        let r = e.transcriptDir ? `
Transcript dir: ${e.transcriptDir}` : "";
        let o = e.scriptPath ? `
Script file: ${e.scriptPath}
(Edit this file with Write/Edit and re-invoke Workflow with {scriptPath: "${e.scriptPath}"} to iterate without resending the script.)` : "";
        let s = e.scriptPath && e.runId ? `
Run ID: ${e.runId}
To resume after editing the script: Workflow({scriptPath: "${e.scriptPath}", resumeFromRunId: "${e.runId}"}) \u2014 completed agents return cached results (cached results may themselves be empty \u2014 inspect journal.jsonl before assuming there is something to recover).` : "";
        let i = `Workflow launched in background. Task ID: ${e.taskId}${n}${r}${o}${s}

You will be notified when it completes. Use /workflows to watch live progress.`;
        return {
          tool_use_id: t,
          type: "tool_result",
          content: i,
          is_error: false
        };
      }
    });
  });
  var iFo = {};
  __export(iFo, {
    workflowPermissionDialog: () => workflowPermissionDialog
  });
  var workflowPermissionDialog;
  var aFo = __lazy(() => {
    workflowPermissionDialog = {
      kind: "permission_workflow",
      payload: we(() => v.custom(e => typeof e === "object" && e !== null && "requestId" in e && "toolName" in e && "permissionResult" in e && "script" in e)),
      result: we(() => v.custom(e => typeof e === "object" && e !== null && "behavior" in e)),
      default: {
        behavior: "cancelled"
      }
    };
  });
  function uIm() {
    return `perm-${Date.now()}-${Math.random().toString(36).substring(2, 9)}`;
  }
  function ftr(e) {
    let t = e.teamName || getTeamName();
    let n = e.workerId || getAgentId();
    let r = e.workerName || getAgentName();
    let o = e.workerColor || getTeammateColor();
    if (!t) {
      throw Error("Team name is required for permission requests");
    }
    if (!n) {
      throw Error("Worker ID is required for permission requests");
    }
    if (!r) {
      throw Error("Worker name is required for permission requests");
    }
    return {
      id: uIm(),
      workerId: n,
      workerName: r,
      workerColor: o,
      teamName: t,
      toolName: e.toolName,
      toolUseId: e.toolUseId,
      description: e.description,
      input: e.input,
      permissionSuggestions: e.permissionSuggestions || [],
      createdAt: Date.now()
    };
  }
  function dIm(e) {
    if (!(e || getTeamName())) {
      return false;
    }
    let n = getAgentId();
    return !n || n === "team-lead";
  }
  function qTt() {
    let e = getTeamName();
    let t = getAgentId();
    return !!e && !!t && !dIm();
  }
  async function TAl(e) {
    let t = e || getTeamName();
    if (!t) {
      return null;
    }
    let n = await readTeamFileAsync(t);
    if (!n) {
      logForDebugging(`[PermissionSync] Team file not found for team: ${t}`);
      return null;
    }
    return n.members.find(o => o.agentId === n.leadAgentId)?.name || "team-lead";
  }
  async function htr(e) {
    let t = await TAl(e.teamName);
    if (!t) {
      logForDebugging("[PermissionSync] Cannot send permission request: leader name not found");
      return false;
    }
    try {
      let n = createPermissionRequestMessage({
        request_id: e.id,
        agent_id: e.workerName,
        tool_name: e.toolName,
        tool_use_id: e.toolUseId,
        description: e.description,
        input: e.input,
        permission_suggestions: e.permissionSuggestions
      });
      await writeToMailbox(t, {
        from: e.workerName,
        text: De(n),
        timestamp: new Date().toISOString(),
        color: e.workerColor
      }, e.teamName);
      logForDebugging(`[PermissionSync] Sent permission request ${e.id} to leader ${t} via mailbox`);
      return true;
    } catch (n) {
      logForDebugging(`[PermissionSync] Failed to send permission request via mailbox: ${n}`);
      Oe(n);
      return false;
    }
  }
  async function gtr(e, t, n, r) {
    let o = r || getTeamName();
    if (!o) {
      logForDebugging("[PermissionSync] Cannot send permission response: team name not found");
      return false;
    }
    try {
      let s = createPermissionResponseMessage({
        request_id: n,
        subtype: t.decision === "approved" ? "success" : "error",
        error: t.feedback,
        updated_input: t.updatedInput,
        permission_updates: t.permissionUpdates
      });
      await writeToMailbox(e, {
        from: "team-lead",
        text: De(s),
        timestamp: new Date().toISOString()
      }, o);
      logForDebugging(`[PermissionSync] Sent permission response for ${n} to worker ${e} via mailbox`);
      return true;
    } catch (s) {
      logForDebugging(`[PermissionSync] Failed to send permission response via mailbox: ${s}`);
      Oe(s);
      return false;
    }
  }
  function EAl() {
    return `sandbox-${Date.now()}-${Math.random().toString(36).substring(2, 9)}`;
  }
  async function vAl(e, t, n) {
    let r = n || getTeamName();
    if (!r) {
      logForDebugging("[PermissionSync] Cannot send sandbox permission request: team name not found");
      Ae("swarm_sandbox_permission_request", "no_team_name");
      return false;
    }
    let o = await TAl(r);
    if (!o) {
      logForDebugging("[PermissionSync] Cannot send sandbox permission request: leader name not found");
      Ae("swarm_sandbox_permission_request", "no_leader");
      return false;
    }
    let s = getAgentId();
    let i = getAgentName();
    let a = getTeammateColor();
    if (!s || !i) {
      logForDebugging("[PermissionSync] Cannot send sandbox permission request: worker ID or name not found");
      Ae("swarm_sandbox_permission_request", "no_worker_identity");
      return false;
    }
    try {
      let l = createSandboxPermissionRequestMessage({
        requestId: t,
        workerId: s,
        workerName: i,
        workerColor: a,
        host: e
      });
      await writeToMailbox(o, {
        from: i,
        text: De(l),
        timestamp: new Date().toISOString(),
        color: a
      }, r);
      logForDebugging(`[PermissionSync] Sent sandbox permission request ${t} for host ${e} to leader ${o} via mailbox`);
      Pe("swarm_sandbox_permission_request");
      return true;
    } catch (l) {
      logForDebugging(`[PermissionSync] Failed to send sandbox permission request via mailbox: ${l}`);
      Oe(l);
      Ae("swarm_sandbox_permission_request", "mailbox_write_failed");
      return false;
    }
  }
  async function ytr(e, t, n, r, o) {
    let s = o || getTeamName();
    if (!s) {
      logForDebugging("[PermissionSync] Cannot send sandbox permission response: team name not found");
      return false;
    }
    try {
      let i = createSandboxPermissionResponseMessage({
        requestId: t,
        host: n,
        allow: r
      });
      await writeToMailbox(e, {
        from: "team-lead",
        text: De(i),
        timestamp: new Date().toISOString()
      }, s);
      logForDebugging(`[PermissionSync] Sent sandbox permission response for ${t} (host: ${n}, allow: ${r}) to worker ${e} via mailbox`);
      return true;
    } catch (i) {
      logForDebugging(`[PermissionSync] Failed to send sandbox permission response via mailbox: ${i}`);
      Oe(i);
      return false;
    }
  }
  var WTt = __lazy(() => {
    ln();
    je();
    Rn();
    qp();
    uA();
    eL();
    UM();
  });
  var lFo = {};
  __export(lFo, {
    workflowNeedsUsageConsentPrompt: () => workflowNeedsUsageConsentPrompt,
    recordWorkflowUsageConsent: () => recordWorkflowUsageConsent
  });
  function workflowNeedsUsageConsentPrompt(e, t) {
    if (e !== "Workflow") {
      return false;
    }
    if (t.options.isNonInteractiveSession) {
      return false;
    }
    if (getToolPermissionContext(t).shouldAvoidPermissionPrompts) {
      return false;
    }
    if (li()) {
      return false;
    }
    if (qTt()) {
      return false;
    }
    if (Jne(t.options.mainLoopModel, getEffortValue(t), getUltracodeRequested(t))) {
      return false;
    }
    return !hasSkipWorkflowUsageWarning();
  }
  function recordWorkflowUsageConsent() {
    if (hasSkipWorkflowUsageWarning()) {
      return;
    }
    let {
      error: e
    } = updateSettingsForSource("userSettings", {
      skipWorkflowUsageWarning: true
    });
    if (e) {
      logForDebugging(`Failed to persist skipWorkflowUsageWarning: ${e.message}`, {
        level: "error"
      });
      return;
    }
    logEvent("tengu_workflow_usage_warning_accepted", {});
  }
  var cFo = __lazy(() => {
    Ot();
    yd();
    Sl();
    je();
    Fp();
    WTt();
  });
  function GTt(e) {
    let t = uFo.isIP(e);
    if (t === 4) {
      return RAl(e);
    }
    if (t === 6) {
      return fIm(e);
    }
    return false;
  }
  function RAl(e) {
    let t = e.split(".").map(Number);
    let [n, r] = t;
    if (t.length !== 4 || n === undefined || r === undefined || t.some(o => Number.isNaN(o))) {
      return false;
    }
    if (n === 127) {
      return false;
    }
    if (n === 0) {
      return true;
    }
    if (n === 10) {
      return true;
    }
    if (n === 169 && r === 254) {
      return true;
    }
    if (n === 172 && r >= 16 && r <= 31) {
      return true;
    }
    if (n === 100 && r >= 64 && r <= 127) {
      return true;
    }
    if (n === 192 && r === 168) {
      return true;
    }
    return false;
  }
  function fIm(e) {
    let t = e.toLowerCase();
    if (t === "::1") {
      return false;
    }
    if (t === "::") {
      return true;
    }
    let n = gIm(t);
    if (n !== null) {
      return RAl(n);
    }
    if (t.startsWith("fc") || t.startsWith("fd")) {
      return true;
    }
    let r = ii(t, ":");
    if (r && r.length === 4 && r >= "fe80" && r <= "febf") {
      return true;
    }
    return false;
  }
  function hIm(e) {
    let t = [];
    if (e.includes(".")) {
      let c = e.lastIndexOf(":");
      let u = e.slice(c + 1);
      e = e.slice(0, c);
      let d = u.split(".").map(Number);
      if (d.length !== 4 || d.some(p => !Number.isInteger(p) || p < 0 || p > 255)) {
        return null;
      }
      t = [d[0] << 8 | d[1], d[2] << 8 | d[3]];
    }
    let n = e.indexOf("::");
    let r;
    let o;
    if (n === -1) {
      r = e.split(":");
      o = [];
    } else {
      let c = e.slice(0, n);
      let u = e.slice(n + 2);
      r = c === "" ? [] : c.split(":");
      o = u === "" ? [] : u.split(":");
    }
    let i = 8 - t.length - r.length - o.length;
    if (i < 0) {
      return null;
    }
    let l = [...r, ...Array(i).fill("0"), ...o].map(c => parseInt(c, 16));
    if (l.some(c => Number.isNaN(c) || c < 0 || c > 65535)) {
      return null;
    }
    l.push(...t);
    return l.length === 8 ? l : null;
  }
  function gIm(e) {
    let t = hIm(e);
    if (!t) {
      return null;
    }
    if (t[0] === 0 && t[1] === 0 && t[2] === 0 && t[3] === 0 && t[4] === 0 && t[5] === 65535) {
      let n = t[6];
      let r = t[7];
      return `${n >> 8}.${n & 255}.${r >> 8}.${r & 255}`;
    }
    return null;
  }
  function xAl(e, t, n) {
    let r = "all" in t && t.all === true;
    let o = uFo.isIP(e);
    if (o !== 0) {
      if (GTt(e)) {
        n(wAl(e, e), "");
        return;
      }
      let s = o === 6 ? 6 : 4;
      if (r) {
        n(null, [{
          address: e,
          family: s
        }]);
      } else {
        n(null, e, s);
      }
      return;
    }
    CAl.lookup(e, {
      all: true
    }, (s, i) => {
      if (s) {
        n(s, "");
        return;
      }
      for (let {
        address: c
      } of i) {
        if (GTt(c)) {
          n(wAl(e, c), "");
          return;
        }
      }
      let a = i[0];
      if (!a) {
        n(Object.assign(Error(`ENOTFOUND ${e}`), {
          code: "ENOTFOUND",
          hostname: e
        }), "");
        return;
      }
      let l = a.family === 6 ? 6 : 4;
      if (r) {
        n(null, i.map(c => ({
          address: c.address,
          family: c.family === 6 ? 6 : 4
        })));
      } else {
        n(null, a.address, l);
      }
    });
  }
  function wAl(e, t) {
    let n = Error(`HTTP hook blocked: ${e} resolves to ${t} (private/link-local address). Loopback (127.0.0.1, ::1) is allowed for local dev.`);
    return Object.assign(n, {
      code: "ERR_HTTP_HOOK_BLOCKED_ADDRESS",
      hostname: e,
      address: t
    });
  }
  var CAl;
  var uFo;
  var _tr = __lazy(() => {
    Zn();
    CAl = require("dns");
    uFo = require("net");
  });
  async function yIm(e, t) {
    let n = new URL(e);
    let r = n.hostname.replace(/^\[|\]$/g, "");
    if (AAl.isIP(r)) {
      return {
        url: e,
        Aeu: t.Aeu
      };
    }
    let o;
    try {
      o = await kAl.lookup(r, {
        all: true
      });
    } catch (a) {
      throw new btr(`could not resolve ${r}: ${sr(a).message}`);
    }
    if (o.length === 0) {
      throw new btr(`could not resolve ${r}`);
    }
    for (let {
      address: a
    } of o) {
      if (GTt(a)) {
        throw new btr(`${r} resolves to ${a}, which is in a private, link-local, or cloud-metadata range`);
      }
    }
    if (t.proxy) {
      return {
        url: e,
        Aeu: t.Aeu
      };
    }
    if (n.protocol === "wss:") {
      return {
        url: e,
        Aeu: t.Aeu
      };
    }
    let s = o.find(a => a.family === 4) ?? o[0];
    let i = n.host;
    n.hostname = s.family === 6 ? `[${s.address}]` : s.address;
    return {
      url: n.toString(),
      headers: {
        Host: i
      },
      Aeu: t.Aeu
    };
  }
  function _Im(e) {
    if (Array.isArray(e)) {
      return e.reduce((t, n) => t + n.length, 0);
    }
    if (e instanceof ArrayBuffer) {
      return e.byteLength;
    }
    return e.length;
  }
  async function PAl(e, t) {
    let {
      description: n,
      timeout_ms: r,
      persistent: o
    } = e;
    let {
      url: s,
      protocols: i
    } = e.ws;
    let {
      toolUseId: a,
      taskRegistry: l
    } = t;
    let c = fSt(t);
    let u = TU("monitor_ws");
    let p = XXn({
      description: n,
      agentId: c,
      taskRef: {
        id: u
      },
      killTask: () => Fve(u, l, {
        quiet: true
      })
    });
    let m = getWebSocketProxyUrl(s);
    let f = await yIm(s, {
      proxy: m,
      Aeu: getWebSocketTLSOptions()
    });
    let h = new IAl.default(f.url, i, {
      proxy: m,
      headers: f.headers,
      Aeu: f.Aeu,
      maxPayload: 1048576
    });
    h.on("message", (_, b) => {
      let S = l.all()[u];
      if (!S || S.status !== "running") {
        return;
      }
      let E = _Im(_);
      if (E > 1048576) {
        X9(n, `[Dropped ${E}-byte frame (exceeds ${1048576}); closing]`, u, {
          isHousekeeping: true,
          agentId: c
        });
        Fve(u, l, {
          quiet: true
        });
        return;
      }
      if (b) {
        p.onData(`[binary frame, ${E} bytes]
`);
        return;
      }
      p.onData(_.toString("utf8") + `
`);
    });
    h.on("error", _ => {
      let b = l.all()[u];
      if (!b || b.status !== "running") {
        return;
      }
      X9(n, `[WebSocket error: ${_.message}]`, u, {
        isHousekeeping: true,
        agentId: c
      });
    });
    h.on("close", (_, b) => {
      p.finish();
      let S = l.all()[u];
      if (!S || S.status !== "running") {
        return;
      }
      let E = b.length ? ` ${b.toString("utf8")}` : "";
      X9(n, `[WebSocket closed: ${_}${E}]`, u, {
        isHousekeeping: true,
        agentId: c
      });
      Fve(u, l, {
        quiet: true
      });
    });
    let g = o ? undefined : setTimeout((_, b, S, E, C) => {
      if (_.isKilled()) {
        return;
      }
      X9(b, "[Monitor timed out \u2014 re-arm if needed.]", S, {
        isHousekeeping: true,
        agentId: E
      });
      Fve(S, C, {
        quiet: true
      });
    }, r, p, n, u, c, l);
    let y = {
      ...ww(u, "monitor_ws", n, a),
      type: "monitor_ws",
      status: "running",
      url: s,
      timeoutId: g,
      agentId: c
    };
    l.register(y);
    jyl(u, h);
    _oe(c, `monitor:${u}`, l);
    return {
      data: {
        taskId: u,
        timeoutMs: o ? 0 : r,
        persistent: o
      }
    };
  }
  var kAl;
  var AAl;
  var IAl;
  var btr;
  var OAl = __lazy(() => {
    Cx();
    ry();
    S7t();
    dt();
    _tr();
    hSt();
    fW();
    Fh();
    gSt();
    kAl = require("dns/promises");
    AAl = require("net");
    IAl = __toESM(require("ws"));
    btr = class btr extends Error {
      constructor(e) {
        super(e);
        this.name = "MonitorWsPreconditionError";
      }
    };
  });
  function DAl() {
    return "Monitor";
  }
  function MAl(e) {
    if (!e.description) {
      return null;
    }
    return e.description;
  }
  function NAl(e) {
    return VYt.jsx(Vn, {
      children: VYt.jsxs(Text, {
        children: ["Monitor started", " ", VYt.jsxs(Text, {
          dimColor: true,
          children: ["\xB7 task ", e.taskId, " \xB7", " ", e.persistent ? "persistent" : `timeout ${e.timeoutMs / 1000}s`]
        })]
      })
    });
  }
  function LAl(e) {
    if (!e?.description) {
      return null;
    }
    return truncate(e.description, 50);
  }
  var VYt;
  var FAl = __lazy(() => {
    Wl();
    et();
    cs();
    VYt = __toESM(ie(), 1);
  });
  var fFo = {};
  __export(fFo, {
    applyCcrTimeoutCap: () => applyCcrTimeoutCap,
    MonitorTool: () => MonitorTool
  });
  function vIm() {
    return {
      description: v.string().describe("Short human-readable description of what you are monitoring (shown in notifications)."),
      timeout_ms: v.number().min(1000).optional().default(300000).describe(`Kill the monitor after this deadline. Default ${300000}ms, max ${3600000}ms. Ignored when persistent is true.`),
      persistent: v.boolean().optional().default(false).describe("Run for the lifetime of the session (no timeout). Use for session-length watches like PR monitoring or log tails. Stop with TaskStop.")
    };
  }
  function CIm(e) {
    return e.persistent || e.timeout_ms <= 3600000;
  }
  function applyCcrTimeoutCap(e) {
    if (!st(process.env.CLAUDE_CODE_REMOTE)) {
      return {
        timeout_ms: e.timeout_ms,
        persistent: e.persistent
      };
    }
    return {
      timeout_ms: e.persistent ? 1800000 : Math.min(e.timeout_ms, 1800000),
      persistent: false
    };
  }
  function RIm(...e) {
    return Bn(e, Boolean) === 1;
  }
  async function AIm(e, t, n) {
    let {
      description: r
    } = t;
    let {
      timeout_ms: o,
      persistent: s
    } = applyCcrTimeoutCap(t);
    let {
      abortController: i,
      toolUseId: a,
      taskRegistry: l
    } = n;
    let c = fSt(n);
    let u = {};
    let d = XXn({
      description: r,
      agentId: c,
      taskRef: u,
      killTask: () => {
        if (u.id) {
          $Te(u.id, l);
        }
      }
    });
    let p = await Kde(e, i.signal, "bash", {
      preventCwdChanges: true,
      shouldUseSandbox: $1({
        command: e,
        dangerouslyDisableSandbox: t.dangerouslyDisableSandbox
      }),
      onStdout: d.onData,
      sessionEnvVars: n.sessionEnvVars
    });
    let m = await XDe({
      command: e,
      description: r,
      shellCommand: p,
      toolUseId: a,
      agentId: c,
      kind: "monitor"
    }, {
      abortController: i,
      taskRegistry: l
    });
    u.id = m.taskId;
    _oe(c, `monitor:${m.taskId}`, l);
    let f = s ? undefined : setTimeout((h, g, y, _, b) => {
      if (h.isKilled()) {
        return;
      }
      X9(g, "[Monitor timed out \u2014 re-arm if needed.]", y, {
        isHousekeeping: true,
        agentId: _
      });
      $Te(y, b);
    }, o, d, r, m.taskId, c, l);
    p.result.then(() => {
      if (f) {
        clearTimeout(f);
      }
      d.finish();
      Yq(c, `monitor:${m.taskId}`, l);
    });
    return {
      data: {
        taskId: m.taskId,
        timeoutMs: s ? 0 : o,
        persistent: s
      }
    };
  }
  function IIm(e) {
    if (!isPolicyAllowed("allow_web_fetch")) {
      return {
        behavior: "deny",
        message: "Monitor cannot open a WebSocket: arbitrary-URL egress is disabled by your organization's compliance policy.",
        decisionReason: {
          type: "other",
          reason: "compliance taint disables model-chosen URL egress"
        }
      };
    }
    let t = new URL(e.url).hostname;
    let n = t.startsWith("[") && t.endsWith("]") ? t.slice(1, -1) : t;
    if ($Al.isIP(n) && GTt(n)) {
      return {
        behavior: "deny",
        message: `Monitor cannot open a WebSocket to ${t}: the address is in a private, link-local, or cloud-metadata range.`,
        decisionReason: {
          type: "other",
          reason: "SSRF-blocked address range"
        }
      };
    }
    let r = isHostAllowedBySandboxNetworkPolicy(n);
    if (!r.allowed) {
      return {
        behavior: "deny",
        message: `Monitor cannot open a WebSocket to ${t}: ${r.reason}.`,
        decisionReason: {
          type: "other",
          reason: r.reason
        }
      };
    }
    return {
      behavior: "ask",
      message: `Monitor will open a WebSocket to ${e.url}`,
      suggestions: []
    };
  }
  var $Al;
  var TIm = () => v.string().refine(HTe, "command contains control characters that would be hidden in the approval dialog");
  var EIm = () => v.object({
    url: v.string().refine(HTe, "url contains control characters that would be hidden in the approval dialog").refine(e => {
      try {
        let t = new URL(e);
        return (t.protocol === "ws:" || t.protocol === "wss:") && !t.username && !t.password && !/[\t\n\r]/.test(e) && /^[\x00-\x7F]*$/.test(e);
      } catch {
        return false;
      }
    }, "url must be a valid ASCII ws:// or wss:// URL with no userinfo or whitespace"),
    protocols: v.array(v.string().regex(/^[!#$%&'*+.^_`|~0-9A-Za-z-]+$/, "protocol must be an RFC 6455 token")).refine(e => new Set(e).size === e.length, "protocols must be unique").optional()
  }).describe("WebSocket to open. Each text frame is an event; binary frames are reported as a placeholder line. Socket close ends the watch. Cannot be combined with command.");
  var wIm;
  var xIm;
  var kIm;
  var PIm;
  var MonitorTool;
  var hFo = __lazy(() => {
    Kc();
    ci();
    ry();
    OWt();
    zX();
    gn();
    _tr();
    hSt();
    U1();
    Th();
    Jf();
    X5e();
    OAl();
    gSt();
    wX();
    FAl();
    $Al = require("net");
    wIm = {
      message: `timeout_ms must be \u2264 ${3600000}`,
      path: ["timeout_ms"]
    };
    xIm = we(() => v.strictObject({
      ...vIm(),
      command: TIm().optional().describe("Shell command or script. Each stdout line is an event; exit ends the watch."),
      ws: EIm().optional()
    }).refine(e => RIm(e.command, e.ws), "exactly one of command or ws").refine(CIm, wIm));
    kIm = we(() => v.object({
      taskId: v.string().describe("ID of the background monitor task."),
      timeoutMs: v.number().describe("Timeout deadline in milliseconds (0 when persistent)."),
      persistent: v.boolean().optional().describe("No timeout \u2014 runs until TaskStop or session end.")
    }));
    PIm = {
      name: "Monitor",
      maxResultSizeChars: 1e4,
      shouldDefer: true,
      userFacingName: DAl,
      getToolUseSummary: LAl,
      getActivityDescription(e) {
        return e?.description ? `Monitoring: ${e.description}` : "Monitoring";
      },
      isEnabled() {
        return IG() && Pu();
      },
      isConcurrencySafe() {
        return true;
      },
      renderToolUseMessage: MAl,
      renderToolResultMessage: NAl,
      get outputSchema() {
        return kIm();
      },
      mapToolResultToToolResultBlockParam(e, t) {
        return {
          tool_use_id: t,
          type: "tool_result",
          content: `Monitor started (task ${e.taskId}, ${e.persistent ? "persistent \u2014 runs until TaskStop or session end" : `timeout ${e.timeoutMs}ms`}). You will be notified on each event. Keep working \u2014 do not poll or sleep. Events may arrive while you are waiting for the user \u2014 an event is not their reply.`
        };
      }
    };
    MonitorTool = Xs({
      ...PIm,
      searchHint: "watch, monitor, or keep an eye on a process/log/command or WebSocket \u2014 stream each stdout line as a live notification",
      async description() {
        return 'Start a background monitor that streams events from a long-running script. Each stdout line is an event \u2014 you keep working and notifications arrive in the chat. Events arrive on their own schedule and are not replies from the user, even if one lands while you\'re waiting for the user to answer a question.\n\nPick by how many notifications you need:\n- **One** ("tell me when the server is ready / the build finishes") \u2192 use **Bash with `run_in_background`** and a command that exits when the condition is true, e.g. `until grep -q "Ready in" dev.log; do sleep 0.5; done`. You get a single completion notification when it exits.\n- **One per occurrence, indefinitely** ("tell me every time an ERROR line appears") \u2192 Monitor with an unbounded command (`tail -f`, `inotifywait -m`, `while true`).\n- **One per occurrence, until a known end** ("emit each CI step result, stop when the run completes") \u2192 Monitor with a command that emits lines and then exits.\n\nYour script\'s stdout is the event stream. Each line becomes a notification. Exit ends the watch.\n\n  # Each matching log line is an event\n  tail -f /var/log/app.log | grep --line-buffered "ERROR"\n\n  # Each file change is an event\n  inotifywait -m --format \'%e %f\' /watched/dir\n\n  # Poll GitHub for new PR comments and emit one line per new comment\n  last=$(date -u +%Y-%m-%dT%H:%M:%SZ)\n  while true; do\n    now=$(date -u +%Y-%m-%dT%H:%M:%SZ)\n    gh api "repos/owner/repo/issues/123/comments?since=$last" --jq \'.[] | "\\(.user.login): \\(.body)"\'\n    last=$now; sleep 30\n  done\n\n  # Node script that emits events as they arrive (e.g. WebSocket listener)\n  node watch-for-events.js\n\n  # Per-occurrence with a natural end: emit each CI check as it lands, exit when the run completes\n  prev=""\n  while true; do\n    s=$(gh pr checks 123 --json name,bucket)\n    cur=$(jq -r \'.[] | select(.bucket!="pending") | "\\(.name): \\(.bucket)"\' <<<"$s" | sort)\n    comm -13 <(echo "$prev") <(echo "$cur")\n    prev=$cur\n    jq -e \'all(.bucket!="pending")\' <<<"$s" >/dev/null && break\n    sleep 30\n  done\n\n**Don\'t use an unbounded command for a single notification.** `tail -f`, `inotifywait -m`, and `while true` never exit on their own, so the monitor stays armed until timeout even after the event has fired. For "tell me when X is ready," use Bash `run_in_background` with an `until` loop instead (one notification, ends in seconds). Note that `tail -f log | grep -m 1 ...` does *not* fix this: if the log goes quiet after the match, `tail` never receives SIGPIPE and the pipeline hangs anyway.\n\n**Script quality:**\n- Every pipe stage must flush per line or matches sit in its buffer unseen: `grep` needs `--line-buffered`, `awk` needs `fflush()`. `head` cannot flush at all \u2014 `| head -N` delivers nothing until N matches accumulate, then ends the stream.\n- In poll loops, handle transient failures (`curl ... || true`) \u2014 one failed request shouldn\'t kill the monitor.\n- Poll intervals: 30s+ for remote APIs (rate limits), 0.5-1s for local checks.\n- Write a specific `description` \u2014 it appears in every notification ("errors in deploy.log" not "watching logs").\n- Only stdout is the event stream. Stderr goes to the output file (readable via Read) but does not trigger notifications \u2014 for a command you run directly (e.g. `python train.py 2>&1 | grep --line-buffered ...`), merge stderr with `2>&1` so its failures reach your filter. (No effect on `tail -f` of an existing log \u2014 that file only contains what its writer redirected.)\n\n**Coverage \u2014 silence is not success.** When watching a job or process for an outcome, your filter must match every terminal state, not just the happy path. A monitor that greps only for the success marker stays silent through a crashloop, a hung process, or an unexpected exit \u2014 and silence looks identical to "still running." Before arming, ask: *if this process crashed right now, would my filter emit anything?* If not, widen it.\n\n  # Wrong \u2014 silent on crash, hang, or any non-success exit\n  tail -f run.log | grep --line-buffered "elapsed_steps="\n\n  # Right \u2014 one alternation covering progress + the failure signatures you\'d act on\n  tail -f run.log | grep -E --line-buffered "elapsed_steps=|Traceback|Error|FAILED|assert|Killed|OOM"\n\nFor poll loops checking job state, emit on every terminal status (`succeeded|failed|cancelled|timeout`), not just success. If you cannot confidently enumerate the failure signatures, broaden the grep alternation rather than narrow it \u2014 some extra noise is better than missing a crashloop.\n\n**Output volume**: Every stdout line is a conversation message, so the filter should be selective \u2014 but selective means "the lines you\'d act on," not "only good news." Never pipe raw logs; filter to exactly the success and failure signals you care about. Monitors that produce too many events are automatically stopped; restart with a tighter filter if this happens.\n\nStdout lines within 200ms are batched into a single notification, so multiline output from a single event groups naturally.\n\nThe script runs in the same shell environment as Bash. Exit ends the watch (exit code is reported). Timeout \u2192 killed. Set `persistent: true` for session-length watches (PR monitoring, log tails) \u2014 the monitor runs until you call TaskStop or the session ends. Use TaskStop to cancel early.' + Wco + jco();
      },
      async prompt() {
        return 'Start a background monitor that streams events from a long-running script. Each stdout line is an event \u2014 you keep working and notifications arrive in the chat. Events arrive on their own schedule and are not replies from the user, even if one lands while you\'re waiting for the user to answer a question.\n\nPick by how many notifications you need:\n- **One** ("tell me when the server is ready / the build finishes") \u2192 use **Bash with `run_in_background`** and a command that exits when the condition is true, e.g. `until grep -q "Ready in" dev.log; do sleep 0.5; done`. You get a single completion notification when it exits.\n- **One per occurrence, indefinitely** ("tell me every time an ERROR line appears") \u2192 Monitor with an unbounded command (`tail -f`, `inotifywait -m`, `while true`).\n- **One per occurrence, until a known end** ("emit each CI step result, stop when the run completes") \u2192 Monitor with a command that emits lines and then exits.\n\nYour script\'s stdout is the event stream. Each line becomes a notification. Exit ends the watch.\n\n  # Each matching log line is an event\n  tail -f /var/log/app.log | grep --line-buffered "ERROR"\n\n  # Each file change is an event\n  inotifywait -m --format \'%e %f\' /watched/dir\n\n  # Poll GitHub for new PR comments and emit one line per new comment\n  last=$(date -u +%Y-%m-%dT%H:%M:%SZ)\n  while true; do\n    now=$(date -u +%Y-%m-%dT%H:%M:%SZ)\n    gh api "repos/owner/repo/issues/123/comments?since=$last" --jq \'.[] | "\\(.user.login): \\(.body)"\'\n    last=$now; sleep 30\n  done\n\n  # Node script that emits events as they arrive (e.g. WebSocket listener)\n  node watch-for-events.js\n\n  # Per-occurrence with a natural end: emit each CI check as it lands, exit when the run completes\n  prev=""\n  while true; do\n    s=$(gh pr checks 123 --json name,bucket)\n    cur=$(jq -r \'.[] | select(.bucket!="pending") | "\\(.name): \\(.bucket)"\' <<<"$s" | sort)\n    comm -13 <(echo "$prev") <(echo "$cur")\n    prev=$cur\n    jq -e \'all(.bucket!="pending")\' <<<"$s" >/dev/null && break\n    sleep 30\n  done\n\n**Don\'t use an unbounded command for a single notification.** `tail -f`, `inotifywait -m`, and `while true` never exit on their own, so the monitor stays armed until timeout even after the event has fired. For "tell me when X is ready," use Bash `run_in_background` with an `until` loop instead (one notification, ends in seconds). Note that `tail -f log | grep -m 1 ...` does *not* fix this: if the log goes quiet after the match, `tail` never receives SIGPIPE and the pipeline hangs anyway.\n\n**Script quality:**\n- Every pipe stage must flush per line or matches sit in its buffer unseen: `grep` needs `--line-buffered`, `awk` needs `fflush()`. `head` cannot flush at all \u2014 `| head -N` delivers nothing until N matches accumulate, then ends the stream.\n- In poll loops, handle transient failures (`curl ... || true`) \u2014 one failed request shouldn\'t kill the monitor.\n- Poll intervals: 30s+ for remote APIs (rate limits), 0.5-1s for local checks.\n- Write a specific `description` \u2014 it appears in every notification ("errors in deploy.log" not "watching logs").\n- Only stdout is the event stream. Stderr goes to the output file (readable via Read) but does not trigger notifications \u2014 for a command you run directly (e.g. `python train.py 2>&1 | grep --line-buffered ...`), merge stderr with `2>&1` so its failures reach your filter. (No effect on `tail -f` of an existing log \u2014 that file only contains what its writer redirected.)\n\n**Coverage \u2014 silence is not success.** When watching a job or process for an outcome, your filter must match every terminal state, not just the happy path. A monitor that greps only for the success marker stays silent through a crashloop, a hung process, or an unexpected exit \u2014 and silence looks identical to "still running." Before arming, ask: *if this process crashed right now, would my filter emit anything?* If not, widen it.\n\n  # Wrong \u2014 silent on crash, hang, or any non-success exit\n  tail -f run.log | grep --line-buffered "elapsed_steps="\n\n  # Right \u2014 one alternation covering progress + the failure signatures you\'d act on\n  tail -f run.log | grep -E --line-buffered "elapsed_steps=|Traceback|Error|FAILED|assert|Killed|OOM"\n\nFor poll loops checking job state, emit on every terminal status (`succeeded|failed|cancelled|timeout`), not just success. If you cannot confidently enumerate the failure signatures, broaden the grep alternation rather than narrow it \u2014 some extra noise is better than missing a crashloop.\n\n**Output volume**: Every stdout line is a conversation message, so the filter should be selective \u2014 but selective means "the lines you\'d act on," not "only good news." Never pipe raw logs; filter to exactly the success and failure signals you care about. Monitors that produce too many events are automatically stopped; restart with a tighter filter if this happens.\n\nStdout lines within 200ms are batched into a single notification, so multiline output from a single event groups naturally.\n\nThe script runs in the same shell environment as Bash. Exit ends the watch (exit code is reported). Timeout \u2192 killed. Set `persistent: true` for session-length watches (PR monitoring, log tails) \u2014 the monitor runs until you call TaskStop or the session ends. Use TaskStop to cancel early.' + Wco + jco();
      },
      get inputSchema() {
        return xIm();
      },
      toAutoClassifierInput(e) {
        return e.ws ? `websocket ${e.ws.url}` : e.command ?? "";
      },
      async checkPermissions(e, t) {
        if (e.ws) {
          return IIm(e.ws);
        }
        return JGt({
          ...e,
          command: e.command
        }, t);
      },
      async call(e, t) {
        if (e.ws) {
          return PAl({
            ...e,
            ...applyCcrTimeoutCap(e),
            ws: e.ws
          }, t);
        }
        return AIm(e.command, e, t);
      }
    });
  });
  function gFo(e) {
    return MIm.find(t => t.matches(e));
  }
  async function Ttr(e, t) {
    let {
      ctx: n,
      description: r,
      result: o
    } = e;
    let s = HOo(n.toolUseContext);
    let i = Str !== null && WAl !== null && n.tool === Str ? p => {
      if (p.behavior === "allow") {
        WAl.recordWorkflowUsageConsent();
      }
      t(p);
    } : t;
    let {
      resolve: a,
      isResolved: l,
      claim: c
    } = Ler(i);
    let u = {
      resolve: a,
      isResolved: l,
      claim: c
    };
    let d = gFo(n.tool);
    if (d !== undefined) {
      let p = !!(e.bridgeCallbacks || e.channelCallbacks && !n.tool.requiresUserInteraction?.());
      VTt(e, u, {
        dialog: d.dialog,
        buildDescriptor: ({
          input: m,
          permissionResult: f
        }) => d.build({
          tool: n.tool,
          input: m,
          description: r,
          toolUseID: n.toolUseID,
          permissionResult: f,
          assistantMessage: n.assistantMessage,
          theme: "dark",
          requestSource: s,
          hasExternalRacer: p
        })
      });
      return;
    }
    if (r7t(n.tool)) {
      let p = o.updatedInput ?? n.input;
      let m = o7t(n.tool, p);
      if (m !== null) {
        let f = Uxl(n.tool, p, n.toolUseContext);
        let h = Date.now();
        let g;
        let y = await s7t({
          tool: n.tool,
          input: p,
          description: r,
          toolUseID: n.toolUseID,
          permissionResult: o,
          assistantMessage: n.assistantMessage,
          theme: "dark",
          requestSource: s,
          filePath: m
        });
        if (n.resolveIfAborted(u.resolve)) {
          return;
        }
        VTt(e, u, {
          dialog: dLe,
          buildDescriptor: ({
            input: _,
            permissionResult: b
          }) => {
            if (g?.isReprompted() !== true) {
              if (f !== null) {
                return {
                  ...y,
                  showingDiffInIDE: true,
                  ideName: f.ideName
                };
              }
              return y;
            }
            return async function* () {
              try {
                let E = o7t(n.tool, _);
                if (E === null) {
                  throw Error("no file path could be derived from the hook-rewritten input");
                }
                yield await s7t({
                  tool: n.tool,
                  input: _,
                  description: r,
                  toolUseID: n.toolUseID,
                  permissionResult: b,
                  assistantMessage: n.assistantMessage,
                  theme: "dark",
                  requestSource: s,
                  filePath: E
                });
              } catch (E) {
                if (logForDebugging(`File permission reprompt: cannot preview the hook-rewritten input of ${n.tool.name} (${he(E)}); denying instead of showing a stale preview`, {
                  level: "error"
                }), c()) {
                  g?.dismissAndTeardown();
                  g?.logRepromptDenyDecision();
                  a(n.cancelAndAbort(`Failed to preview the hook-rewritten file operation: ${he(E)}`));
                }
              }
            }();
          },
          unaryEvent: Bgl(n.tool, p, m),
          onRacersReady: _ => {
            if (g = _, f === null) {
              return;
            }
            let {
              closeTab: b
            } = Bxl({
              ctx: n,
              tool: n.tool,
              input: p,
              permissionResult: o,
              permissionPromptStartTimeMs: h,
              eligibility: f,
              claim: u.claim,
              notifyBridge: _.notifyBridge,
              dismissAndTeardown: _.dismissAndTeardown,
              resolveOnce: u.resolve
            });
            _.addTeardown(b);
          }
        });
        return;
      }
      VTt(e, u, {
        dialog: mLe,
        buildDescriptor: ({
          input: f,
          permissionResult: h
        }) => BM({
          tool: n.tool,
          input: f,
          description: r,
          toolUseID: n.toolUseID,
          permissionResult: h,
          assistantMessage: n.assistantMessage,
          theme: "dark",
          requestSource: s
        })
      });
      return;
    }
    if (n.tool === xl) {
      let p = o.updatedInput ?? n.input;
      let m = typeof p.command === "string" ? p.command : "";
      let f = t8e(m);
      if (f !== null) {
        let g = await qOo({
          tool: n.tool,
          input: p,
          description: r,
          toolUseID: n.toolUseID,
          permissionResult: o,
          assistantMessage: n.assistantMessage,
          theme: "dark",
          requestSource: s,
          sedInfo: f
        });
        if (n.resolveIfAborted(u.resolve)) {
          return;
        }
        let y;
        VTt(e, u, {
          dialog: dLe,
          buildDescriptor: ({
            input: _,
            permissionResult: b
          }) => {
            if (y?.isReprompted() !== true) {
              return g;
            }
            return async function* () {
              let E = typeof _.command === "string" ? _.command : "";
              let C = t8e(E);
              if (C === null) {
                if (logForDebugging("Sed-edit permission reprompt: rewritten command no longer parses as a sed edit; denying instead of showing a stale preview", {
                  level: "error"
                }), c()) {
                  y?.dismissAndTeardown();
                  y?.logRepromptDenyDecision();
                  a(n.cancelAndAbort("The hook rewrote this sed edit into a command that cannot be previewed as a file edit. Re-run the rewritten command directly if intended."));
                }
                return;
              }
              try {
                yield await qOo({
                  tool: n.tool,
                  input: _,
                  description: r,
                  toolUseID: n.toolUseID,
                  permissionResult: b,
                  assistantMessage: n.assistantMessage,
                  theme: "dark",
                  requestSource: s,
                  sedInfo: C
                });
              } catch (x) {
                if (logForDebugging(`Sed-edit permission reprompt: descriptor rebuild failed (${he(x)}); denying instead of executing a stale simulation`, {
                  level: "error"
                }), c()) {
                  y?.dismissAndTeardown();
                  y?.logRepromptDenyDecision();
                  a(n.cancelAndAbort(`Failed to preview the hook-rewritten sed edit: ${he(x)}`));
                }
              }
            }();
          },
          unaryEvent: $gl(f.filePath),
          onRacersReady: _ => {
            y = _;
          }
        });
        return;
      }
      let h = getToolPermissionContext(n.toolUseContext);
      VTt(e, u, {
        dialog: Gze,
        buildDescriptor: ({
          input: g,
          permissionResult: y
        }) => IXn({
          tool: n.tool,
          input: g,
          description: r,
          toolUseID: n.toolUseID,
          permissionResult: y,
          assistantMessage: n.assistantMessage,
          theme: "dark",
          requestSource: s,
          classifierState: "none",
          toolPermissionContext: h
        })
      });
      return;
    }
    VTt(e, u, {
      dialog: mLe,
      buildDescriptor: ({
        input: p,
        permissionResult: m
      }) => BM({
        tool: n.tool,
        input: p,
        description: r,
        toolUseID: n.toolUseID,
        permissionResult: m,
        assistantMessage: n.assistantMessage,
        theme: "dark",
        requestSource: s
      })
    });
  }
  function VTt(e, t, n) {
    let {
      ctx: r,
      description: o,
      result: s,
      awaitAutomatedChecksBeforeDialog: i,
      bridgeCallbacks: a,
      channelCallbacks: l
    } = e;
    let {
      resolve: c,
      isResolved: u,
      claim: d
    } = t;
    let p = r.toolUseContext.requestDialog;
    if (p === undefined) {
      return;
    }
    let m = p;
    let f = r.toolUseContext.agentContext;
    let h = f.agentType === "teammate" || f0e(f) && f.isAsync === true;
    let g = Date.now();
    let y = s.updatedInput ?? r.input;
    let _ = s.decisionReason;
    let b = s;
    let S = 0;
    let E;
    let C = [];
    function x() {
      if (C.length === 0) {
        return;
      }
      let N = C.splice(0, C.length);
      for (let W of N) {
        try {
          W();
        } catch (j) {
          logForDebugging(`Dialog teardown failed: ${he(j)}`, {
            level: "error"
          });
        }
      }
    }
    let A = false;
    let k = n.unaryEvent ?? {
      completion_type: "tool_use_single",
      language_name: "none"
    };
    let I = r.toolUseContext.abortController.signal;
    function O() {
      if (A) {
        return;
      }
      A = true;
      let N = r.permissionMode;
      r.toolUseContext.applyAttributionOp({
        kind: "incrementPermissionPrompt"
      });
      logEvent("tengu_tool_use_show_permission_request", {
        messageID: br(r.messageId),
        toolName: qi(r.tool.name),
        isMcp: r.tool.isMcp ?? false,
        decisionReasonType: b.decisionReason?.type == null ? undefined : b.decisionReason?.type,
        sandboxEnabled: SandboxManager.isSandboxingEnabled(),
        permissionMode: N,
        requestSource: HOo(r.toolUseContext)?.type == null ? undefined : HOo(r.toolUseContext)?.type
      });
      xLo({
        completion_type: k.completion_type,
        event: "response",
        metadata: {
          language_name: k.language_name,
          message_id: r.assistantMessage.message.id,
          platform: Me.platform
        }
      });
    }
    function M(N) {
      xLo({
        completion_type: k.completion_type,
        event: N,
        metadata: {
          language_name: k.language_name,
          message_id: r.assistantMessage.message.id,
          platform: Me.platform
        }
      });
    }
    function L() {
      E?.abort();
      _Z.emit(null);
      F();
      x();
    }
    let {
      notifyBridgeAndTeardown: P
    } = lkl({
      ctx: r,
      description: o,
      result: s,
      displayInput: y,
      permissionPromptStartTimeMs: g,
      awaitAutomatedChecksBeforeDialog: i,
      bridgeCallbacks: a,
      channelCallbacks: l,
      claim: d,
      isResolved: u,
      onWin(N) {
        L();
        c(N);
      },
      onReprompt(N, W, j) {
        y = N;
        _ = W;
        b = j;
        E?.abort();
        x();
        H();
      }
    });
    let F = qIe.subscribe(() => {
      if (u()) {
        return;
      }
      hasPermissionsToUseTool(r.tool, r.input, r.toolUseContext, r.assistantMessage, r.toolUseID).then(N => {
        if (N.behavior !== "allow") {
          return;
        }
        if (!d()) {
          return;
        }
        F();
        P();
        E?.abort();
        _Z.emit(null);
        x();
        r.logDecision({
          decision: "accept",
          source: "config"
        });
        c(r.buildAllow(N.updatedInput ?? r.input, {
          decisionReason: N.decisionReason
        }));
      }).catch(N => {
        if (!mg(N)) {
          Oe($o(sr(N), "permissionRecheckSignal: hasPermissionsToUseTool failed"));
        }
      });
    });
    function H() {
      let N = ++S;
      let W = new AbortController();
      E = W;
      let j = () => W.abort();
      if (I.aborted) {
        W.abort();
      } else {
        I.addEventListener("abort", j, {
          once: true
        });
      }
      let z = n.buildDescriptor({
        input: y,
        permissionResult: b
      });
      O();
      _Z.emit(Xxl({
        tool: r.tool,
        input: y
      }));
      m(n.dialog, z, {
        signal: W.signal,
        queueBehind: h
      }).then(V => {
        if (I.removeEventListener("abort", j), N !== S) {
          return;
        }
        if (!d()) {
          return;
        }
        U(V);
      });
    }
    function U(N) {
      switch (_Z.emit(null), F(), x(), N.behavior) {
        case "allow":
          {
            P({
              behavior: "allow",
              updatedInput: N.updatedInput,
              updatedPermissions: N.permissionUpdates ?? []
            });
            M("accept");
            c(r.handleUserAllow(N.updatedInput, N.permissionUpdates ?? [], N.feedback, g, N.contentBlocks, _));
            return;
          }
        case "deny":
          {
            P({
              behavior: "deny",
              message: N.feedback ?? "User denied permission"
            });
            M("reject");
            r.logDecision({
              decision: "reject",
              source: {
                type: "user_reject",
                hasFeedback: !!N.feedback
              }
            }, {
              permissionPromptStartTimeMs: g,
              input: y
            });
            c(r.cancelAndAbort(N.feedback, undefined, N.contentBlocks));
            return;
          }
        case "cancelled":
          {
            if (P({
              behavior: "deny",
              message: "User aborted"
            }), M("reject"), r.logCancelled(), r.logDecision({
              decision: "reject",
              source: {
                type: "user_abort"
              }
            }, {
              permissionPromptStartTimeMs: g,
              input: y
            }), h) {
              c({
                behavior: "ask",
                message: "Permission for this tool use was denied. The tool use was rejected (eg. if it was a file edit, the new_string was NOT written to the file). Try a different approach or report the limitation to complete your task."
              });
              return;
            }
            c(r.cancelAndAbort(undefined, true));
            return;
          }
      }
    }
    n.onRacersReady?.({
      dismissAndTeardown: L,
      notifyBridge: P,
      isReprompted: () => S > 1,
      addTeardown: N => {
        C.push(N);
      },
      logRepromptDenyDecision: () => {
        M("reject");
        r.logDecision({
          decision: "reject",
          source: {
            type: "hook"
          }
        }, {
          permissionPromptStartTimeMs: g,
          input: y
        });
      }
    });
    H();
  }
  var Str;
  var qAl;
  var WAl;
  var DIm;
  var MIm;
  var Etr = __lazy(() => {
    Ot();
    Gu();
    je();
    dt();
    Rn();
    RXn();
    xXn();
    OOo();
    DOo();
    MOo();
    kXn();
    WOo();
    GOo();
    OXn();
    PXn();
    VOo();
    zOo();
    KOo();
    n7t();
    R$();
    r6t();
    rDo();
    aSt();
    ANo();
    Aer();
    _h();
    b1();
    Sl();
    pr();
    dt();
    ro();
    oy();
    Th();
    Oxl();
    $xl();
    NYt();
    OTt();
    ckl();
    v$t();
    Str = (sFo(), __toCommonJS(oFo)).WorkflowTool;
    qAl = (aFo(), __toCommonJS(iFo)).workflowPermissionDialog;
    WAl = (cFo(), __toCommonJS(lFo));
    DIm = (hFo(), __toCommonJS(fFo)).MonitorTool;
    MIm = [{
      matches: e => e === s5,
      dialog: c7t,
      build: kgl
    }, {
      matches: e => isInProductPermissionsEnabled() && e.name.startsWith(CFC_TOOL_PREFIX),
      dialog: e7t,
      build: xgl
    }, {
      matches: e => e === iSt,
      dialog: Wze,
      build: Agl
    }, {
      matches: e => e === BXn,
      dialog: t7t,
      build: BM
    }, {
      matches: e => e === qU,
      dialog: nSt,
      build: Ngl
    }, {
      matches: e => e === pTt,
      dialog: l7t,
      build: Dgl
    }, ...[], {
      matches: e => e.name === "PowerShell",
      dialog: a7t,
      build: Mgl
    }, {
      matches: e => e === DIm,
      dialog: i7t,
      build: Igl
    }, ...(null !== null && null !== null ? [{
      matches: e => e === null,
      dialog: null,
      build: Ogl
    }] : []), ...(Str !== null && qAl !== null ? [{
      matches: e => e === Str,
      dialog: qAl,
      build: Pgl
    }] : [])];
  });
  var vtr;
  var wtr;
  var GAl = __lazy(() => {
    vtr = we(() => Ghs.enum(["allow", "deny", "ask"]));
    wtr = we(() => Ghs.object({
      toolName: Ghs.string(),
      ruleContent: Ghs.string().optional()
    }));
  });
  var zTt;
  var KTt;
  var Ctr = __lazy(() => {
    HT();
    GAl();
    zTt = we(() => Ghs.enum(["userSettings", "projectSettings", "localSettings", "session", "cliArg"]));
    KTt = we(() => Ghs.discriminatedUnion("type", [Ghs.object({
      type: Ghs.literal("addRules"),
      rules: Ghs.array(wtr()),
      behavior: vtr(),
      destination: zTt()
    }), Ghs.object({
      type: Ghs.literal("replaceRules"),
      rules: Ghs.array(wtr()),
      behavior: vtr(),
      destination: zTt()
    }), Ghs.object({
      type: Ghs.literal("removeRules"),
      rules: Ghs.array(wtr()),
      behavior: vtr(),
      destination: zTt()
    }), Ghs.object({
      type: Ghs.literal("setMode"),
      mode: AMt(),
      destination: zTt()
    }), Ghs.object({
      type: Ghs.literal("addDirectories"),
      directories: Ghs.array(Ghs.string()),
      destination: zTt()
    }), Ghs.object({
      type: Ghs.literal("removeDirectories"),
      directories: Ghs.array(Ghs.string()),
      destination: zTt()
    })]));
  });
  function NIm(e) {
    if (!Array.isArray(e)) {
      return [];
    }
    let t = KTt();
    let n = [];
    for (let r of e) {
      let o = t.safeParse(r);
      if (o.success) {
        n.push(o.data);
      } else {
        logForDebugging(`[SwarmPermissionPoller] Dropping malformed permissionUpdate entry: ${o.error.message}`, {
          level: "warn"
        });
      }
    }
    return n;
  }
  function Rtr(e) {
    YTt.set(e.requestId, e);
    logForDebugging(`[SwarmPermissionPoller] Registered callback for request ${e.requestId}`);
  }
  function VAl(e) {
    YTt.delete(e);
    logForDebugging(`[SwarmPermissionPoller] Unregistered callback for request ${e}`);
  }
  function zAl(e) {
    return YTt.vZc(e);
  }
  function KAl() {
    YTt.clear();
    KYt.clear();
  }
  function JTt(e) {
    let t = YTt.get(e.requestId);
    if (!t) {
      logForDebugging(`[SwarmPermissionPoller] No callback registered for mailbox response ${e.requestId}`);
      return false;
    }
    if (logForDebugging(`[SwarmPermissionPoller] Processing mailbox response for request ${e.requestId}: ${e.decision}`), YTt.delete(e.requestId), e.decision === "approved") {
      let n = NIm(e.permissionUpdates);
      let r = e.updatedInput;
      t.onAllow(r, n);
    } else {
      t.onReject(e.feedback);
    }
    return true;
  }
  function YAl(e) {
    KYt.set(e.requestId, e);
    logForDebugging(`[SwarmPermissionPoller] Registered sandbox callback for request ${e.requestId}`);
  }
  function JAl(e) {
    return KYt.vZc(e);
  }
  function XAl(e) {
    let t = KYt.get(e.requestId);
    if (!t) {
      logForDebugging(`[SwarmPermissionPoller] No sandbox callback registered for request ${e.requestId}`);
      return false;
    }
    logForDebugging(`[SwarmPermissionPoller] Processing sandbox response for request ${e.requestId}: allow=${e.allow}`);
    KYt.delete(e.requestId);
    t.resolve(e.allow);
    return true;
  }
  var YTt;
  var KYt;
  var XTt = __lazy(() => {
    je();
    Ctr();
    YTt = new Map();
    KYt = new Map();
  });
  function QAl(e) {
    yFo = e;
  }
  function ZAl() {
    return yFo;
  }
  function e0l() {
    yFo = null;
  }
  var yFo = null;
  var t0l = {};