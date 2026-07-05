  __export(Kwo, {
    updateWorkflowProgressBatch: () => updateWorkflowProgressBatch,
    skipWorkflowAgent: () => skipWorkflowAgent,
    retryWorkflowAgent: () => retryWorkflowAgent,
    registerWorkflowTask: () => registerWorkflowTask,
    registerAdoptedWorkflowTask: () => registerAdoptedWorkflowTask,
    pauseWorkflowTask: () => pauseWorkflowTask,
    killWorkflowTask: () => killWorkflowTask,
    isLocalWorkflowTask: () => isLocalWorkflowTask,
    failWorkflowTask: () => failWorkflowTask,
    enqueueWorkflowNotification: () => enqueueWorkflowNotification,
    completeWorkflowTask: () => completeWorkflowTask,
    buildResumePrompt: () => buildResumePrompt,
    LocalWorkflowTask: () => LocalWorkflowTask
  });
  function registerWorkflowTask({
    taskId: e,
    script: t,
    scriptPath: n,
    args: r,
    summary: o,
    workflowName: s,
    title: i,
    phases: a,
    defaultModel: l,
    workflowRunId: c,
    ownerAgentId: u,
    taskRegistry: d,
    toolUseId: p,
    startTime: m
  }) {
    initTaskOutput(e);
    let f = createAbortController(0);
    let h = {
      ...ww(e, "local_workflow", o ?? "Dynamic workflow", p),
      ...(m !== undefined && {
        startTime: m
      }),
      type: "local_workflow",
      status: "running",
      script: t,
      scriptPath: n,
      args: r,
      prompt: t,
      summary: o,
      workflowName: s,
      title: i,
      phases: a,
      defaultModel: l,
      workflowRunId: c,
      ownerAgentId: u,
      workflowProgress: [],
      progressVersion: 0,
      agentCount: 0,
      totalTokens: 0,
      totalToolCalls: 0,
      logs: [],
      abortController: f,
      agentControllers: new Map()
    };
    d.register(h);
    return h;
  }
  function isLocalWorkflowTask(e) {
    return e?.type === "local_workflow";
  }
  function registerAdoptedWorkflowTask(e, t) {
    let n = ww(e.taskId, "local_workflow", e.description, undefined);
    let r = {
      ...n,
      startTime: e.startTime ?? n.startTime,
      type: "local_workflow",
      status: "paused",
      script: "",
      scriptPath: e.scriptPath,
      prompt: "",
      workflowRunId: e.workflowRunId,
      workflowProgress: [],
      progressVersion: 0,
      agentCount: 0,
      totalTokens: 0,
      totalToolCalls: 0,
      logs: [],
      notified: true
    };
    t.register(r);
  }
  function updateWorkflowProgressBatch(e, t, n) {
    if (t.length === 0) {
      return;
    }
    n.update(e, r => {
      if (r.status !== "running") {
        return r;
      }
      let o = [...r.workflowProgress];
      let s = new Map();
      for (let u = 0; u < o.length; u++) {
        let d = o[u];
        if (d.type === "workflow_agent" || d.type === "workflow_phase") {
          s.set(`${d.type}:${d.index}`, u);
        }
      }
      let i = r.agentCount;
      let a = false;
      for (let u of t) {
        if (u.type === "workflow_agent" || u.type === "workflow_phase") {
          let d = `${u.type}:${u.index}`;
          let p = s.get(d);
          if (p !== undefined) {
            o[p] = u;
          } else {
            s.set(d, o.length);
            o.push(u);
          }
          if (u.type === "workflow_agent" && u.state === "start") {
            i = Math.max(i, u.index);
          }
        } else {
          o.push(u);
          a = true;
        }
      }
      if (a && o.length > 500 * 2) {
        let u = o.length - 500;
        let d = [];
        for (let p = 0; p < o.length; p++) {
          let m = o[p];
          if (u > 0 && m.type === "workflow_log") {
            u--;
            continue;
          }
          d.push(m);
        }
        o = d;
      }
      let l = 0;
      let c = 0;
      for (let u of o) {
        if (u.type === "workflow_agent") {
          if (u.tokens) {
            l += u.tokens;
          }
          if (u.toolCalls) {
            c += u.toolCalls;
          }
        }
      }
      return {
        ...r,
        workflowProgress: o,
        progressVersion: r.progressVersion + t.length,
        agentCount: i,
        totalTokens: l,
        totalToolCalls: c
      };
    });
  }
  function U5n(e, t, n, r) {
    let o = null;
    t.update(e, s => {
      if (s.status !== "running") {
        return s;
      }
      o = s;
      s.abortController?.abort();
      let i = Date.now();
      return {
        ...s,
        ...r,
        status: n,
        endTime: i,
        ...(Mw(n) && {
          evictAfter: i + 30000
        }),
        abortController: undefined,
        agentControllers: undefined
      };
    });
    return o;
  }
  function completeWorkflowTask(e, t, n, r, o, s) {
    let i = U5n(e, o, "completed", {
      result: t,
      agentCount: n,
      logs: r,
      terminal: s
    });
    if (i) {
      SVa.writeFile(i.outputFile, De({
        summary: i.summary,
        agentCount: n,
        logs: r,
        result: t,
        workflowProgress: i.workflowProgress.filter(a => a.type !== "workflow_log"),
        totalTokens: i.totalTokens,
        totalToolCalls: i.totalToolCalls
      }, null, 2)).catch(a => logForDebugging(`Failed to write workflow output for ${e}: ${a instanceof Error ? a.message : a}`));
      Pe("task_local_workflow");
    }
  }
  function failWorkflowTask(e, t, n, r, o, s) {
    let i = U5n(e, o, "failed", {
      error: t,
      agentCount: n,
      logs: r,
      terminal: s
    });
    if (evictTaskOutput(e), i) {
      Ae("task_local_workflow", "task_local_workflow_failed");
    }
  }
  function pauseWorkflowTask(e, t) {
    let n = U5n(e, t, "paused", {
      notified: true
    });
    if (n) {
      Yq(n.ownerAgentId, `workflow:${e}`, t);
    }
    return n !== null;
  }
  function buildResumePrompt(e) {
    let t = e.args !== undefined ? `, args: ${De(e.args)}` : "";
    return `Resume the paused workflow by calling: Workflow({scriptPath: '${e.scriptPath}', resumeFromRunId: '${e.workflowRunId}'${t}}) \u2014 completed agents return cached results.`;
  }
  function killWorkflowTask(e, t) {
    let n = U5n(e, t, "killed", {
      notified: true
    });
    if (n) {
      Yq(n.ownerAgentId, `workflow:${e}`, t);
      evictTaskOutput(e);
      zu(e, "stopped", {
        toolUseId: n.toolUseId,
        summary: n.description
      });
    }
    return n !== null;
  }
  function TVa(e, t, n, r) {
    let o = false;
    if (r.update(e, s => {
      if (s.status !== "running") {
        return s;
      }
      let i = s.agentControllers?.get(t);
      if (i && !i.signal.aborted) {
        i.abort(new DOMException(n, "AbortError"));
        o = true;
      }
      return s;
    }), o) {
      Pe(n === "user-skip" ? "task_local_workflow_skip_agent" : "task_local_workflow_retry_agent");
    }
    return o;
  }
  function skipWorkflowAgent(e, t, n) {
    return TVa(e, t, "user-skip", n);
  }
  function retryWorkflowAgent(e, t, n) {
    return TVa(e, t, "user-retry", n);
  }
  function enqueueWorkflowNotification({
    taskId: e,
    summary: t,
    status: n,
    result: r,
    failures: o,
    error: s,
    agentCount: i,
    totalTokens: a,
    totalToolCalls: l,
    durationMs: c,
    taskRegistry: u,
    toolUseId: d,
    transcriptDir: p,
    scriptPath: m,
    workflowRunId: f,
    args: h,
    workflowProgress: g
  }) {
    let y = false;
    let _;
    u.update(e, U => {
      if (_ = U.ownerAgentId, U.notified) {
        return U;
      }
      y = true;
      return {
        ...U,
        notified: true
      };
    });
    let b = _ ? u.get(_) : undefined;
    let E = za(b) && gT(b) && !getIsNonInteractiveSession() || za(b) && b.status === "running";
    if (!(y && E)) {
      Yq(_, `workflow:${e}`, u);
    }
    if (!y) {
      return;
    }
    let C = t ?? "Dynamic workflow";
    let x = n === "completed" ? `Dynamic workflow "${C}" completed` : n === "failed" ? `Dynamic workflow "${C}" failed: ${s || "Unknown error"}` : `Dynamic workflow "${C}" was stopped`;
    let A = "";
    if (n === "failed" || n === "killed") {
      let U = [];
      if (m && f) {
        let N = h !== undefined ? `, args: ${De(h)}` : "";
        U.push(`To resume after editing the script, call: Workflow({scriptPath: '${m}', resumeFromRunId: '${f}'${N}})`);
      }
      if (p) {
        U.push(`Agent transcripts: ${p}`);
      }
      if (U.length > 0) {
        A = `
<recovery>${$a(U.join(`
`))}</recovery>`;
      }
    }
    let k = "";
    if (n === "completed" && p) {
      let U = [`Per-agent results: ${p}/journal.jsonl \u2014 one {"type":"result",...} line per completed agent with its full return value.`, "If the result above is empty or unexpected, Read this file BEFORE diagnosing \u2014 do not assume agents returned non-empty results."];
      if (m && f) {
        let N = h !== undefined ? `, args: ${De(h)}` : "";
        U.push(`To re-run with edited post-processing: Workflow({scriptPath: '${m}', resumeFromRunId: '${f}'${N}}) \u2014 agents whose (prompt, opts) are unchanged replay from cache.`);
      }
      k = `
<diagnostics>${$a(U.join(`
`))}</diagnostics>`;
    }
    let I = getTaskOutputPath(e);
    let O = d ? `
<${"tool-use-id"}>${d}</${"tool-use-id"}>` : "";
    let M = "";
    if (n === "completed" && r !== undefined) {
      let U = $a(De(r));
      let N = 8000;
      if (U.length > 8000) {
        M = `
<result>${U.slice(0, 8000)}
... (truncated ${U.length - 8000} chars, full result in ${I})</result>`;
      } else {
        M = `
<result>${U}</result>`;
      }
    }
    let L = o?.length ? `
<failures>${$a(o.join(`
`))}</failures>` : "";
    let P = "";
    if (g) {
      let U = 0;
      let N = 0;
      let W = 0;
      let j = 0;
      for (let z of g) {
        if (z.type !== "workflow_agent") {
          continue;
        }
        if (z.state === "done") {
          if (U++, z.resultPreview === undefined || v8p.test(z.resultPreview)) {
            j++;
          }
        } else if (z.state === "error") {
          if (z.skipped) {
            W++;
          } else {
            N++;
          }
        }
      }
      P = `<agents_done>${U}</agents_done><agents_error>${N}</agents_error><agents_skipped>${W}</agents_skipped><agents_empty_result>${j}</agents_empty_result>`;
    }
    let F = `
<usage><agent_count>${i}</agent_count>${P}<subagent_tokens>${a}</subagent_tokens><tool_uses>${l}</tool_uses><duration_ms>${c}</duration_ms></usage>`;
    let H = `<${"task-notification"}>
<${"task-id"}>${e}</${"task-id"}>${O}
<${"output-file"}>${I}</${"output-file"}>
<${"status"}>${n}</${"status"}>
<${"summary"}>${$a(x)}</${"summary"}>${A}${M}${k}${L}${F}
</${"task-notification"}>`;
    ud({
      value: H,
      mode: "task-notification",
      agentId: E && _ ? _ : mainAgentId(),
      priority: "next",
      taskId: e
    });
  }
  var SVa;
  var v8p;
  var LocalWorkflowTask;
  var Dpe = __lazy(() => {
    at();
    np();
    ln();
    Cx();
    D_();
    Kp();
    je();
    Rf();
    cE();
    U$();
    wx();
    ry();
    SVa = require("fs/promises");
    v8p = /^(\[\s*\]|\{\s*\}|\{\s*"[^"]+"\s*:\s*\[\s*\]\s*\})$/;
    LocalWorkflowTask = {
      name: "LocalWorkflowTask",
      type: "local_workflow",
      async kill(e, t) {
        killWorkflowTask(e, t);
      }
    };
  });
  function Z6t(e) {
    if (!e || e.target <= 0) {
      return -1;
    }
    return Math.floor(20 * e.spent / e.target);
  }
  function e8t(e) {
    if (!e || e.length === 0) {
      return "";
    }
    return e.map(t => {
      let n = `${t.id ?? t.label}:${t.doneAt ?? "-"}:${t.failed ? "x" : ""}`;
      return t.kind === "todo" ? `${n}:${t.startedAt ?? "-"}` : n;
    }).join("|");
  }
  function Igt() {
    return {
      tasks: Q6t.tasks,
      queued: Q6t.queued,
      kinds: Q6t.kinds
    };
  }
  function EVa(e) {
    Q6t = e;
  }
  function t8t() {
    return {
      ...Q6t
    };
  }
  var Q6t;
  var H5n = __lazy(() => {
    Q6t = {
      tasks: 0,
      queued: 0,
      kinds: [],
      items: []
    };
  });
  function Pgt(e) {
    let t = e[0];
    if (!t) {
      return null;
    }
    let n = e.length;
    if (e.every(r => r.type === t.type)) {
      switch (t.type) {
        case "local_bash":
          {
            let r = Bn(e, i => i.type === "local_bash" && i.kind === "monitor");
            let o = n - r;
            let s = [];
            if (o > 0) {
              s.push(o === 1 ? "1 shell" : `${o} shells`);
            }
            if (r > 0) {
              s.push(r === 1 ? "1 monitor" : `${r} monitors`);
            }
            return s.join(", ");
          }
        case "in_process_teammate":
          {
            let r = new Set(e.map(o => o.type === "in_process_teammate" ? o.identity.teamName : "")).size;
            return r === 1 ? "1 team" : `${r} teams`;
          }
        case "local_agent":
          return n === 1 ? "1 local agent" : `${n} local agents`;
        case "remote_agent":
          {
            if (n === 1 && t.isUltraplan) {
              switch (t.ultraplanPhase) {
                case "plan_ready":
                  return `${"\u25C6"} ultraplan ready`;
                case "needs_input":
                  return `${"\u25C7"} ultraplan needs your input`;
                default:
                  return `${"\u25C7"} ultraplan`;
              }
            }
            if (e.every(r => r.type === "remote_agent" && r.remoteTaskType === "remote-workflow")) {
              return n === 1 ? `${"\u25C7"} 1 remote dynamic workflow` : `${"\u25C7"} ${n} remote dynamic workflows`;
            }
            return n === 1 ? `${"\u25C7"} 1 cloud session` : `${"\u25C7"} ${n} cloud sessions`;
          }
        case "local_workflow":
          return n === 1 ? "1 background dynamic workflow" : `${n} background dynamic workflows`;
        case "monitor_mcp":
        case "monitor_ws":
          return n === 1 ? "1 monitor" : `${n} monitors`;
        case "mcp_task":
          {
            let o = getFeatureValue_CACHED_MAY_BE_STALE("tengu_copper_thistle", false) ? "job" : "task";
            return n === 1 ? `1 MCP ${o}` : `${n} MCP ${o}s`;
          }
        case "dream":
          return "dreaming";
      }
    }
    return `${n} background ${n === 1 ? "task" : "tasks"}`;
  }
  function vVa(e) {
    if (e.length !== 1) {
      return false;
    }
    let t = e[0];
    return t.type === "remote_agent" && t.isUltraplan === true && t.ultraplanPhase !== undefined;
  }
  var j5n = __lazy(() => {
    wl();
    $n();
  });
  function RQ(e) {
    return e.type === "local_agent" || e.type === "local_workflow";
  }
  function kv(e) {
    if (e.status !== "running" && e.status !== "pending") {
      return false;
    }
    if ("isBackgrounded" in e && e.isBackgrounded === false) {
      return false;
    }
    return true;
  }
  function Jwo(e) {
    let t = [];
    for (let n of getSessionCronTasks()) {
      if (e && !e(n)) {
        continue;
      }
      t.push({
        label: "scheduled task",
        detail: `${C8p(n)} \xB7 ${truncate(n.prompt, 50, true)}`
      });
    }
    return t;
  }
  function C8p(e) {
    if (e.recurring) {
      return A1(e.cron);
    }
    let t = lU(e.cron);
    let n = t && Odt(t, new Date(e.createdAt));
    if (!n) {
      return A1(e.cron);
    }
    let r = Math.max(0, n.getTime() - Date.now());
    return `Runs once in ${formatDuration(r, {
      mostSignificantOnly: true
    })}`;
  }
  function wVa(e, {
    includeDream: t = false
  } = {}) {
    let n = [];
    for (let r of Object.values(e)) {
      if (!kv(r) || r.type === "remote_agent") {
        continue;
      }
      if (!t && r.type === "dream") {
        continue;
      }
      n.push({
        label: Xwo[r.type],
        detail: truncate(r.description, 50, true)
      });
    }
    n.push(...Jwo());
    return n;
  }
  function CVa() {
    let {
      items: e
    } = t8t();
    let t = [];
    for (let n of e) {
      if (n.kind === "todo" || n.doneAt !== undefined) {
        continue;
      }
      t.push({
        label: R8p[n.kind],
        detail: truncate(n.label, 50, true)
      });
    }
    t.push(...Jwo());
    return t;
  }
  function RVa(e) {
    return Object.values(e).filter(kv).filter(t => t.type !== "remote_agent" && t.type !== "dream");
  }
  function F8e(e) {
    let t = RVa(e);
    let n = getSessionCronTasks().length;
    let r = Ro(t.map(xVa));
    if (n > 0) {
      r.push("session_cron");
    }
    let o = Bn(Object.values(e), s => s.type === "local_agent" && s.status === "running" && !s.isBackgrounded);
    return {
      count: t.length + n,
      restartableCount: o,
      kinds: r
    };
  }
  function xVa(e) {
    return Cw(e) && e.kind === "monitor" ? "monitor" : e.type;
  }
  function Ogt(e, t) {
    let n = RVa(e);
    let r = Jwo(t?.cronFilter);
    let o = n.length + r.length;
    let s = Ro(n.map(xVa));
    if (r.length > 0) {
      s.push("session_cron");
    }
    let i = [Pgt(n), r.length ? `${r.length} ${un(r.length, "loop")}` : ""];
    return {
      count: o,
      kinds: s,
      summary: i.filter(Boolean).join(", ")
    };
  }
  function kVa() {
    let {
      tasks: e
    } = t8t();
    if (e === 0) {
      return;
    }
    return `Detached \u2014 ${e} ${un(e, "task")} still running. Run \`claude agents\` to see your background sessions.`;
  }
  var Xwo;
  var R8p;
  var U8e = __lazy(() => {
    at();
    H5n();
    j5n();
    vX();
    cs();
    Zn();
    dI();
    Xwo = {
      local_agent: "subagent",
      local_workflow: "workflow",
      local_bash: "shell",
      monitor_mcp: "monitor",
      monitor_ws: "monitor",
      mcp_task: "MCP task",
      in_process_teammate: "teammate",
      dream: "dream",
      remote_agent: "cloud session"
    };
    R8p = {
      agent: "subagent",
      workflow: "workflow",
      shell: "shell",
      monitor: "monitor",
      mcp: "MCP task"
    };
  });
  async function n8t(e) {
    try {
      let t = await AVa.readFile(`/proc/${e}/stat`, "utf-8");
      let n = t.lastIndexOf(")");
      let r = t.slice(n + 2).split(" ");
      let o = Number(r[19]);
      return Number.isFinite(o) ? o : null;
    } catch {
      return null;
    }
  }
  async function Dgt(e, t, n) {
    if (n !== undefined) {
      if ((await getProcessStartTimeAsync(e, {
        skipCache: true
      })) !== n) {
        return;
      }
    } else if (t !== undefined) {
      if ((await n8t(e)) !== t) {
        return;
      }
    } else {
      return;
    }
    await $6e(e, "SIGTERM").catch(() => {});
  }
  var AVa;
  var q5n = __lazy(() => {
    Tb();
    y5t();
    AVa = require("fs/promises");
  });
  function G5n(e) {
    return Ke.string().transform((t, n) => {
      let r = l => (n.addIssue({
        code: Ke.ZodIssueCode.custom,
        message: l
      }), Ke.INVALID);
      if (ate(t)) {
        return r(`adopt path is remote UNC: ${t}`);
      }
      let o = TIt(CRr, t);
      if (o !== undefined) {
        return r(`adopt path traverses symlink/junction to remote UNC: ${o}`);
      }
      let s = E$e(t);
      if (s === null) {
        return r(`adopt path unresolvable: ${t}`);
      }
      let i = [...e(), ...[]].map(E$e).filter(l => l !== null);
      if (i.length === 0) {
        return r("adopt path roots unresolvable");
      }
      if (!i.some(l => {
        let c = Joe.relative(l, s);
        return c === "" || !c.startsWith("..") && !Joe.isAbsolute(c);
      })) {
        return r(`adopt path outside allowed roots: ${s}`);
      }
      return s;
    });
  }
  function k8p() {
    return [getProjectTempDir()];
  }
  function DVa(e) {
    return Ke.object({
      taskId: Ke.string().regex(r8t),
      pid: Ke.number().int().positive(),
      procStart: Ke.string().optional(),
      startTimeTicks: Ke.number().int().optional(),
      command: Ke.string(),
      description: Ke.string(),
      outputPath: G5n(e),
      lastReportedTotalLines: Ke.number().int(),
      toolUseId: Ke.string().optional(),
      kind: Ke.enum(["bash", "monitor"]).optional(),
      agentId: Ke.string().regex(r8t).optional()
    });
  }
  function MVa(e = A8p()) {
    return Ke.object({
      writtenAtMs: Ke.number(),
      origin: Ke.enum(["background", "exit"]).optional(),
      shells: Ke.array(e),
      cron: Ke.array(I8p()),
      agents: Ke.array(O8p()).optional(),
      workflows: Ke.array(P8p()).optional(),
      prefill: Ke.object({
        text: Ke.string(),
        boundaryUuid: Ke.string().optional()
      }).optional()
    });
  }
  function D8p(e) {
    return MVa(DVa(() => [getProjectTempDir(), e]));
  }
  function V5n() {
    return !Me.CLAUDE_DISABLE_ADOPT;
  }
  async function Qwo(e) {
    let t = e.shellCommand?.detach?.();
    if (t === undefined) {
      return null;
    }
    return {
      taskId: e.id,
      pid: t,
      procStart: await getProcessStartTimeAsync(t, {
        skipCache: true
      }),
      startTimeTicks: (await n8t(t)) ?? undefined,
      command: e.command,
      description: e.description,
      outputPath: e.shellCommand.taskOutput.path,
      lastReportedTotalLines: e.lastReportedTotalLines,
      toolUseId: e.toolUseId,
      kind: e.kind,
      agentId: e.agentId
    };
  }
  async function Zwo(e, t = {}) {
    let n = t.derivedTranscriptPath ?? Ew(e.agentId);
    return {
      agentId: e.agentId,
      agentType: e.agentType,
      description: e.description,
      toolUseId: e.toolUseId,
      spawnDepth: e.spawnDepth,
      startTime: e.startTime,
      transcriptPath: await aR.realpath(n).catch(() => {
        return;
      }),
      parentAgentId: e.parentAgentId
    };
  }
  async function eCo(e, t = {}) {
    let n = t.derivedTranscriptDir ?? hz(e.workflowRunId);
    return {
      taskId: e.id,
      workflowRunId: e.workflowRunId,
      scriptPath: e.scriptPath,
      scriptSha256: e.script ? IVa.createHash("sha256").update(e.script).digest("hex") : undefined,
      argsJson: e.args !== undefined ? De(e.args) : undefined,
      description: e.description,
      startTime: e.startTime,
      transcriptDir: await aR.realpath(n).catch(() => n)
    };
  }
  async function z5n(e) {
    let t = Mpe(e);
    let n = Object.values(e).filter(u => nCo(u, t));
    let r = Object.values(e).filter(u => rCo(u, t));
    let o = Object.values(e).filter(u => oCo(u, t));
    let s = getSessionCronTasks().filter(u => B8e(u, t));
    if (n.length === 0 && r.length === 0 && o.length === 0 && s.length === 0) {
      return null;
    }
    let i = [];
    for (let u of n) {
      let d = await Qwo(u);
      if (d) {
        i.push(d);
      }
    }
    let a = await Promise.all(r.map(u => Zwo(u)));
    let l = await Promise.all(o.map(u => eCo(u)));
    if (i.length === 0 && a.length === 0 && l.length === 0 && s.length === 0) {
      return null;
    }
    let c = false;
    return {
      payload: {
        writtenAtMs: Date.now(),
        shells: i,
        cron: s.map(u => ({
          id: u.id,
          cron: u.cron,
          prompt: u.prompt,
          createdAt: u.createdAt,
          recurring: u.recurring,
          agentId: u.agentId,
          kind: u.kind
        })),
        agents: a,
        workflows: l
      },
      checkpointAgents: async u => {
        for (let d of o) {
          d.abortController?.abort("background");
          pauseWorkflowTask(d.id, u);
        }
        if (a.length === 0) {
          return;
        }
        for (let d of i) {
          if (d.agentId !== undefined) {
            u.remove(d.taskId);
          }
        }
        for (let d of r) {
          d.abortController.abort("background");
        }
        await PVa.setImmediate();
        await flushSessionStorage().catch(d => {
          Et("task_local_agent", "adopt_checkpoint_flush_failed");
          logForDebugging(`[adopt] checkpoint flush: ${d}`, {
            level: "warn"
          });
        });
      },
      disown: u => {
        for (let d of i) {
          u.remove(d.taskId);
        }
        for (let d of a) {
          u.remove(d.agentId);
        }
        for (let d of l) {
          u.remove(d.taskId);
        }
        if (s.length > 0) {
          removeSessionCronTasks(s.map(d => d.id));
        }
      },
      abandon: () => {
        if (c) {
          return;
        }
        c = true;
        for (let u of n) {
          try {
            u.shellCommand?.kill();
          } catch (d) {
            logForDebugging(`[adopt] abandon ${u.id}: ${d}`, {
              level: "warn"
            });
          }
        }
        for (let u of r) {
          let d = `Background agent "${$a(u.description)}" was checkpointed for the background fork but the fork failed to spawn; the agent was not resumed.`;
          ud({
            value: `<${"task-notification"}>
<${"task-id"}>${$a(u.agentId)}</${"task-id"}>
<${"status"}>failed</${"status"}>
<${"summary"}>${d}</${"summary"}>
</${"task-notification"}>`,
            agentId: mainAgentId(),
            mode: "task-notification",
            priority: "next"
          });
          zu(u.agentId, "failed", {
            summary: d
          });
        }
        if (r.length > 0) {
          Et("task_local_agent", "adopt_spawn_failed");
        }
        for (let u of o) {
          let d = `Background workflow "${$a(u.description)}" was checkpointed for the background fork but the fork failed to spawn; it was not resumed. To resume manually: Workflow({scriptPath: '${$a(u.scriptPath ?? "")}', resumeFromRunId: '${$a(u.workflowRunId ?? "")}'}).`;
          ud({
            value: `<${"task-notification"}>
<${"task-id"}>${$a(u.id)}</${"task-id"}>
<${"status"}>failed</${"status"}>
<${"summary"}>${d}</${"summary"}>
</${"task-notification"}>`,
            agentId: mainAgentId(),
            mode: "task-notification",
            priority: "next"
          });
          zu(u.id, "failed", {
            summary: d
          });
        }
        if (o.length > 0) {
          Et("task_local_workflow", "adopt_spawn_failed");
        }
      }
    };
  }
  function M8p(e, t) {
    let n = (r, o, s) => [...r, ...o].filter((i, a, l) => l.findIndex(c => s(c) === s(i)) === a);
    return {
      writtenAtMs: t.writtenAtMs,
      origin: t.origin ?? e.origin,
      shells: n(e.shells, t.shells, r => r.pid),
      cron: n(e.cron, t.cron, r => r.id),
      agents: n(e.agents ?? [], t.agents ?? [], r => r.agentId),
      workflows: n(e.workflows ?? [], t.workflows ?? [], r => r.taskId),
      prefill: t.prefill ?? e.prefill
    };
  }
  async function Ngt(e, t, n = {}) {
    let r = Joe.join(e, "adopt.json");
    let o = t;
    try {
      let s = await aR.readFile(r, "utf-8");
      if (s.length <= 1e6) {
        let a = (n.mergeShellOutputRoot !== undefined ? D8p(n.mergeShellOutputRoot) : NVa()).safeParse(qt(s));
        if (a.success) {
          if (a.data.shells.length + (a.data.cron?.length ?? 0) + (a.data.agents?.length ?? 0) + (a.data.workflows?.length ?? 0) <= 256) {
            o = M8p(a.data, t);
          }
        }
      }
    } catch {}
    await Fm(r, De(o));
  }
  async function LVa(e, t = {}) {
    if (!e) {
      return null;
    }
    let n = Joe.join(e, "adopt.json");
    let r = `${n}.${process.pid}`;
    let o = Date.now() + (t.waitMs ?? 0);
    let s = false;
    for (;;) {
      try {
        s = await QHe(n, r);
        break;
      } catch (l) {
        let c = en(l);
        if (c === "ENOENT") {
          if (Date.now() < o) {
            await sleep(250);
            continue;
          }
          logEvent("tengu_adopt_claim", {
            result: "enoent"
          });
          return null;
        }
        logForDebugging(`[adopt] rename failed: ${l}`, {
          level: "warn"
        });
        logEvent("tengu_adopt_claim", {
          result: c !== undefined && MMr.vZc(c) ? "ebusy_gave_up" : WZe(l)
        });
        return null;
      }
    }
    let i = Date.now();
    let a = s ? "ebusy_retry" : "ok";
    try {
      let l = await aR.readFile(r, "utf-8");
      let c = NVa().safeParse(JSON.parse(l));
      if (!c.success) {
        logForDebugging(`[adopt] schema rejected: ${c.error.message}`, {
          level: "warn"
        });
        logEvent("tengu_adopt_claim", {
          result: "schema_rejected"
        });
        return null;
      }
      let u = i - c.data.writtenAtMs;
      if (c.data.origin !== "exit" && u > 120000) {
        logForDebugging(`[adopt] stale (age ${u}ms)`, {
          level: "warn"
        });
        logEvent("tengu_adopt_claim", {
          result: "stale"
        });
        return null;
      }
      logEvent("tengu_adopt_claim", {
        result: a
      });
      return c.data;
    } catch (l) {
      logForDebugging(`[adopt] read/parse failed: ${l}`, {
        level: "warn"
      });
      logEvent("tengu_adopt_claim", {
        result: "parse_failed"
      });
      return null;
    } finally {
      await aR.unlink(r).catch(() => {});
    }
  }
  function FVa(e, t, n) {
    W5n = t.length > 0 || n.length > 0 ? {
      jobDir: e,
      agents: t,
      workflows: n
    } : null;
  }
  function K5n(e) {
    if (e === undefined || W5n?.jobDir !== e) {
      return {
        agents: [],
        workflows: []
      };
    }
    let {
      agents: t,
      workflows: n
    } = W5n;
    W5n = null;
    return {
      agents: t,
      workflows: n
    };
  }
  async function UVa(e) {
    if (!e.transcriptPath) {
      return;
    }
    let t = Ew(e.agentId);
    let n = r => r.replace(/\.jsonl$/, ".meta.json");
    if (await aR.stat(n(e.transcriptPath)), t === e.transcriptPath) {
      return;
    }
    if ((await aR.realpath(t).catch(() => {
      return;
    })) === e.transcriptPath) {
      return;
    }
    await aR.mkdir(Joe.dirname(t), {
      recursive: true
    });
    for (let [r, o] of [[t, e.transcriptPath], [n(t), n(e.transcriptPath)]]) {
      await aR.unlink(r).catch(() => {});
      await aR.symlink(o, r);
    }
  }
  function BVa(e) {
    return Dgt(e.pid, e.startTimeTicks, e.procStart);
  }
  async function $Va(e) {
    let t = hz(e.workflowRunId);
    if (t === e.transcriptDir) {
      return;
    }
    if ((await aR.realpath(t).catch(() => {
      return;
    })) === e.transcriptDir) {
      return;
    }
    await aR.stat(Joe.join(e.transcriptDir, "journal.jsonl"));
    await aR.mkdir(Joe.dirname(t), {
      recursive: true
    });
    try {
      await aR.unlink(t);
    } catch (n) {
      if (en(n) !== "ENOENT") {
        try {
          await aR.rmdir(t);
        } catch (o) {
          if (en(o) === "ENOTEMPTY") {
            await aR.rm(t, {
              recursive: true,
              force: true
            });
          }
        }
      }
    }
    await aR.symlink(e.transcriptDir, t, undefined);
  }
  function Y5n(e, t) {
    let n = e.scriptPath !== undefined ? ` To resume manually: Workflow({scriptPath: '${$a(e.scriptPath)}', resumeFromRunId: '${$a(e.workflowRunId)}'}).` : "";
    let r = `Background workflow "${$a(e.description)}" was checkpointed for the background fork but could not be resumed (${$a(t)}).${n}`;
    ud({
      value: `<${"task-notification"}>
<${"task-id"}>${$a(e.taskId)}</${"task-id"}>
<${"status"}>failed</${"status"}>
<${"summary"}>${r}</${"summary"}>
</${"task-notification"}>`,
      agentId: mainAgentId(),
      mode: "task-notification",
      priority: "next"
    });
    zu(e.taskId, "failed", {
      summary: r
    });
  }
  function HVa(e) {
    let t = G5n(() => [y$()]).safeParse(e);
    if (!t.success) {
      throw new Po(t.error.issues[0]?.message ?? "scriptPath rejected", "adopt scriptPath rejected");
    }
    return t.data;
  }
  function tCo(e) {
    return e.mcp.clientsInitialized === true && !e.mcp.clients.some(t => t.type === "pending");
  }
  function J5n(e, t, n) {
    let r = e.parentAgentId !== undefined && za(n.get(e.parentAgentId)) ? e.parentAgentId : mainAgentId();
    let o = `Background agent "${$a(e.description ?? e.agentId)}" was checkpointed for the background fork but could not be resumed (${$a(t)}).`;
    ud({
      value: `<${"task-notification"}>
<${"task-id"}>${$a(e.agentId)}</${"task-id"}>
<${"status"}>failed</${"status"}>
<${"summary"}>${o}</${"summary"}>
</${"task-notification"}>`,
      agentId: r,
      mode: "task-notification",
      priority: "next"
    });
    zu(e.agentId, "failed", {
      summary: o
    });
  }
  function jVa(e) {
    let t = new Set(getSessionCronTasks().map(n => n.id));
    for (let n of e) {
      if (!t.vZc(n.id)) {
        addSessionCronTask(n);
        t.add(n.id);
      }
    }
  }
  function Mpe(e) {
    let t = new Map();
    if (!V5n()) {
      return t;
    }
    let n = i => za(i) ? i.parentAgentId : "agentId" in i ? i.agentId : undefined;
    let r = new Map();
    for (let i of Object.values(e)) {
      if (i.status !== "running" && i.status !== "pending") {
        continue;
      }
      let a = n(i);
      if (a !== undefined) {
        let l = r.get(a) ?? [];
        l.push(i);
        r.set(a, l);
      }
    }
    let o = i => {
      if (za(i)) {
        return i.agentType !== "main-session" && i.status === "running" && i.isBackgrounded && i.abortController !== undefined;
      }
      if (Cw(i)) {
        return i.kind !== "monitor" && i.status === "running" && i.isBackgrounded && i.shellCommand !== null && i.shellCommand.detach !== undefined;
      }
      if (isLocalWorkflowTask(i)) {
        return i.status === "running" && i.scriptPath !== undefined && i.workflowRunId !== undefined && i.abortController !== undefined;
      }
      return false;
    };
    let s = (i, a) => {
      a.push(i.id);
      let l = o(i);
      for (let c of r.get(i.id) ?? []) {
        l = s(c, a) && l;
      }
      return l;
    };
    for (let i of Object.values(e)) {
      if (!(za(i) ? i.parentAgentId === undefined : Cw(i) ? i.agentId === undefined : isLocalWorkflowTask(i))) {
        continue;
      }
      let l = [];
      let c = s(i, l);
      for (let u of l) {
        t.set(u, c);
      }
    }
    return t;
  }
  function nCo(e, t) {
    return Cw(e) && (t.get(e.id) ?? false);
  }
  function B8e(e, t) {
    return V5n() && (e.agentId === undefined || (t.get(e.agentId) ?? false));
  }
  function rCo(e, t) {
    return za(e) && (t.get(e.id) ?? false);
  }
  function oCo(e, t) {
    return isLocalWorkflowTask(e) && (t.get(e.id) ?? false);
  }
  function Lgt(e, t) {
    return t.get(e.id) ?? false;
  }
  function o8t(e, t = Mpe(e)) {
    return Bn(Object.values(e), n => Lgt(n, t)) + Bn(getSessionCronTasks(), n => B8e(n, t));
  }
  function X5n(e, t = Mpe(e)) {
    return F8e(e).count - o8t(e, t);
  }
  function Q5n(e) {
    return {
      adopted_shells: e?.shells.length ?? 0,
      adopted_agents: e?.agents?.length ?? 0,
      adopted_workflows: e?.workflows?.length ?? 0,
      adopted_cron: e?.cron.length ?? 0
    };
  }
  var IVa;
  var aR;
  var Joe;
  var PVa;
  var r8t;
  var A8p;
  var I8p;
  var P8p;
  var O8p;
  var NVa;
  var W5n = null;
  var s8t = __lazy(() => {
    qg();
    at();
    np();
    ln();
    Ot();
    ry();
    Dpe();
    VNe();
    D_();
    BT();
    mm();
    je();
    pr();
    dt();
    U8e();
    Tb();
    Rf();
    wm();
    Fy();
    fa();
    q5n();
    wx();
    IVa = require("crypto");
    aR = require("fs/promises");
    Joe = require("path");
    PVa = require("timers/promises");
    r8t = /^[\w-]+$/;
    A8p = we(() => DVa(k8p));
    I8p = we(() => Ke.object({
      id: Ke.string(),
      cron: Ke.string(),
      prompt: Ke.string(),
      createdAt: Ke.number(),
      recurring: Ke.boolean().optional(),
      agentId: Ke.string().optional(),
      kind: Ke.literal("loop").optional()
    }));
    P8p = we(() => Ke.object({
      taskId: Ke.string().regex(r8t),
      workflowRunId: Ke.string().regex(/^wf_[a-z0-9-]{6,}$/),
      scriptPath: Ke.string(),
      scriptSha256: Ke.string().regex(/^[0-9a-f]{64}$/).optional(),
      argsJson: Ke.string().optional(),
      description: Ke.string(),
      startTime: Ke.number().optional(),
      transcriptDir: G5n(() => [y$()])
    }));
    O8p = we(() => Ke.object({
      agentId: Ke.string().regex(r8t),
      agentType: Ke.string().optional(),
      description: Ke.string().optional(),
      toolUseId: Ke.string().optional(),
      spawnDepth: Ke.number().int().optional(),
      startTime: Ke.number().optional(),
      transcriptPath: G5n(() => [y$()]).optional(),
      parentAgentId: Ke.string().regex(r8t).optional()
    }));
    NVa = we(() => MVa());
  });
  function GVa(e) {
    let t = Bj() ? pst() : undefined;
    if (!t || Me.CLAUDE_CODE_DISABLE_BG_EXIT_HANDOFF) {
      return {
        shells: [],
        workflows: [],
        agents: [],
        unresumedAgents: [],
        unresumedWorkflows: [],
        jobDir: undefined,
        agentTranscriptPaths: {},
        workflowTranscriptDirs: {},
        projectTempDir: getProjectTempDir()
      };
    }
    let n = Mpe(e);
    let r = Object.values(e);
    let o = r.filter(a => oCo(a, n));
    let s = r.filter(a => rCo(a, n));
    let i = K5n(t);
    return {
      shells: r.filter(a => nCo(a, n) && a.agentId === undefined),
      workflows: o,
      agents: s,
      unresumedAgents: i.agents,
      unresumedWorkflows: i.workflows,
      jobDir: t,
      agentTranscriptPaths: Object.fromEntries(s.map(a => [a.agentId, Ew(a.agentId)])),
      workflowTranscriptDirs: Object.fromEntries(o.map(a => [a.workflowRunId, hz(a.workflowRunId)])),
      projectTempDir: getProjectTempDir()
    };
  }
  function VVa({
    shells: e,
    workflows: t,
    agents: n,
    unresumedAgents: r,
    unresumedWorkflows: o,
    jobDir: s,
    agentTranscriptPaths: i,
    workflowTranscriptDirs: a,
    projectTempDir: l
  }) {
    for (let u of t) {
      u.abortController?.abort("background");
    }
    for (let u of n) {
      u.abortController?.abort("background");
    }
    let c = (async () => {
      let u = [];
      if (n.length > 0) {
        try {
          await withTimeout((async () => {
            await WVa.setImmediate();
            await flushSessionStorage();
          })(), 2000, "exit-handoff agent flush timeout");
        } catch (m) {
          let f = m instanceof Error && m.message === "exit-handoff agent flush timeout";
          Et("task_local_agent_exit_handoff", f ? "flush_timeout" : "flush_failed");
          logForDebugging(`exit handoff: agent transcript flush failed: ${m}`, {
            level: "warn"
          });
        }
        u = await Promise.all(n.map(m => Zwo(m, {
          derivedTranscriptPath: i[m.agentId]
        })));
      }
      u.push(...r);
      let d = [];
      for (let m of e) {
        let f = await Qwo(m);
        if (f) {
          d.push(f);
        }
      }
      let p = [...(await Promise.all(t.map(m => eCo(m, {
        derivedTranscriptDir: a[m.workflowRunId]
      })))), ...o];
      if (d.length === 0 && p.length === 0 && u.length === 0 || !s) {
        return;
      }
      try {
        if (await Ngt(s, {
          writtenAtMs: Date.now(),
          origin: "exit",
          shells: d,
          cron: [],
          workflows: p,
          agents: u
        }, {
          mergeShellOutputRoot: l
        }), logEvent("tengu_adopt_exit_handoff", {
          adopted_shells: d.length,
          adopted_workflows: p.length,
          adopted_agents: u.length
        }), d.length > 0) {
          Pe("task_local_shell_exit_handoff");
        }
        if (p.length > 0) {
          Pe("task_local_workflow_exit_handoff");
        }
        if (u.length > 0) {
          Pe("task_local_agent_exit_handoff");
        }
        logForDebugging(`exit handoff: ${d.length} background shell(s), ${p.length} workflow(s), and ${u.length} agent(s) handed to the next wake of this session`);
      } catch (m) {
        for (let f of e) {
          try {
            f.shellCommand?.kill();
          } catch {}
        }
        if (e.length > 0) {
          Ae("task_local_shell_exit_handoff", "write_failed");
        }
        if (t.length > 0) {
          Ae("task_local_workflow_exit_handoff", "write_failed");
        }
        if (u.length > 0) {
          Ae("task_local_agent_exit_handoff", "write_failed");
        }
        logForDebugging(`exit handoff: adopt.json write failed: ${m}`, {
          level: "warn"
        });
      }
    })();
    WPa(c);
    return c;
  }
  var WVa;
  var zVa = __lazy(() => {
    ln();
    Ot();
    VNe();
    D_();
    yd();
    je();
    pr();
    wm();
    Fy();
    fa();
    s8t();
    lgo();
    WVa = require("timers/promises");
  });
  function Z5n(e) {
    let t = GVa(e);
    let n = t.shells.length > 0 || t.workflows.length > 0 || t.agents.length > 0 || t.unresumedAgents.length > 0 || t.unresumedWorkflows.length > 0 ? VVa(t) : undefined;
    let r = new Set([...t.shells, ...t.workflows, ...t.agents].map(o => o.id));
    for (let o of Object.values(e)) {
      if (o.status !== "running" || r.vZc(o.id)) {
        continue;
      }
      try {
        if (Cw(o)) {
          o.shellCommand?.kill();
          o.shellCommand?.cleanup();
        } else if ("abortController" in o) {
          o.abortController?.abort();
        }
        zu(o.id, "stopped", {
          toolUseId: o.toolUseId,
          summary: o.description
        });
        evictTaskOutput(o.id);
      } catch (s) {
        Oe(s);
      }
    }
    return n;
  }
  var sCo = __lazy(() => {
    zVa();
    Rn();
    cE();
  });
  function e6n(e) {
    return onSessionSwitch((t, n, r) => {
      if (!r) {
        return;
      }
      L8p(r, e);
      logEvent("tengu_refusal_fallback_latch_reset", {
        source: n,
        restored_to_explicit_override: r.restoredToExplicitOverride,
        model_scope: TTe(r.fallbackModel)
      });
    });
  }
  function KVa(e) {
    return onSessionSwitch((t, n, r) => {
      if (r) {
        e();
      }
    });
  }
  function L8p(e, t) {
    t(n => {
      let r = e.overrideValue ?? e.forSessionValue ?? e.appStateModel;
      let o = lc() && n.fastMode && !yh(r);
      return n.mainLoopModel === e.appStateModel && n.mainLoopModelForSession === e.forSessionValue && !o ? n : {
        ...n,
        mainLoopModel: e.appStateModel,
        mainLoopModelForSession: e.forSessionValue,
        ...(o && {
          fastMode: false
        })
      };
    });
    setMainLoopModelOverride(e.overrideValue);
  }
  var t6n = __lazy(() => {
    at();
    Ot();
    GT();
    LX();
  });
  var iCo = {};
  __export(iCo, {
    sinksFor: () => sinksFor,
    runClassifierSummaryForBlocked: () => runClassifierSummaryForBlocked,
    isPostTurnSummaryVisibleInCli: () => isPostTurnSummaryVisibleInCli,
    engineFor: () => engineFor,
    detectSurfaces: () => detectSurfaces,
    classifiedToPostTurnSummary: () => classifiedToPostTurnSummary
  });
  function detectSurfaces() {
    if (li()) {
      return new Set(["bg"]);
    }
    let e = new Set();
    if (dRn() || WY() !== null) {
      e.add("watched");
    }
    if (LD("fanout")) {
      e.add("ccr");
    } else if (process.env.CLAUDE_CODE_ENVIRONMENT_KIND === "byoc") {
      e.add("ccr");
    } else if (st(process.env.CLAUDE_CODE_REMOTE)) {
      if (F8p.vZc(process.env.CLAUDE_CODE_ENTRYPOINT ?? "") && !process.env.BUGHUNTER_FLEET_SIZE) {
        e.add("ccr");
      }
    }
    if (process.env.CLAUDE_CODE_ENVIRONMENT_KIND === "bridge" || isReplBridgeActive()) {
      e.add("bridge");
    }
    if (process.env.CLAUDE_CODE_ENTRYPOINT === "claude-desktop") {
      e.add("desktop");
    }
    if (isPostTurnSummaryVisibleInCli()) {
      e.add("cli");
    }
    return e;
  }
  function sinksFor(e) {
    let t = new Set();
    let n = U8p(getFeatureValue_CACHED_MAY_BE_STALE("tengu_classifier_disabled_surfaces", ""));
    for (let r of e) {
      if (n.vZc(r)) {
        continue;
      }
      for (let o of JVa[r]) {
        t.add(o);
      }
    }
    if (e.vZc("bg")) {
      t.delete("summary");
    }
    if (getFeatureValue_CACHED_MAY_BE_STALE("tengu_classifier_summary_kill", false)) {
      t.delete("summary");
    }
    return t;
  }
  function U8p(e) {
    let t = new Set();
    for (let n of e.split(",")) {
      let r = n.trim();
      if (!r) {
        continue;
      }
      if (r in JVa) {
        t.add(r);
      } else if (!YVa) {
        YVa = true;
        logForDebugging(`[classifier] tengu_classifier_disabled_surfaces: unknown surface '${r}' ignored`);
      }
    }
    return t;
  }
  function engineFor(e) {
    if (e.size === 0) {
      return null;
    }
    let t = e.vZc("state") ? "llm" : process.env.CLAUDE_CODE_CLASSIFIER_SUMMARY !== undefined ? st(process.env.CLAUDE_CODE_CLASSIFIER_SUMMARY) ? "llm" : "heuristic" : B8p();
    return t === "llm" && getFeatureValue_CACHED_MAY_BE_STALE("tengu_cobalt_wren", false) ? "heuristic" : t;
  }
  function B8p() {
    if (getFeatureValue_CACHED_MAY_BE_STALE("tengu_classifier_summary_llm_emit", false)) {
      return "llm";
    }
    if (getFeatureValue_CACHED_MAY_BE_STALE("tengu_classifier_summary_heuristic_emit", false)) {
      return "heuristic";
    }
    return null;
  }
  function isPostTurnSummaryVisibleInCli() {
    return false;
  }
  function classifiedToPostTurnSummary(e) {
    return {
      status_category: e.state === "blocked" ? "blocked" : "review_ready",
      status_detail: e.detail,
      needs_action: e.state === "blocked" ? e.needs ?? "" : ""
    };
  }
  function runClassifierSummaryForBlocked(e, t) {
    let n = sinksFor(detectSurfaces());
    if (!n.vZc("summary") || engineFor(n) === null) {
      return;
    }
    let r = e.tool_name.startsWith("dialog:") ? {
      status_category: "blocked",
      status_detail: "Waiting on a user dialog",
      needs_action: e.action_description
    } : {
      status_category: "blocked",
      status_detail: `Waiting on permission: ${e.tool_name}`,
      needs_action: `Approve or deny ${e.tool_name}`
    };
    t?.notifyMetadataChanged({
      post_turn_summary: r
    });
  }
  var F8p;
  var JVa;
  var YVa = false;
  var r6n = __lazy(() => {
    at();
    ru();
    $n();
    yd();
    je();
    gn();
    F8p = new Set(["remote", "remote_cowork", "remote_desktop", "remote_mobile"]);
    JVa = {
      bg: ["state"],
      watched: ["state"],
      ccr: ["summary"],
      bridge: ["summary"],
      desktop: ["summary"],
      cli: ["summary"]
    };
  });
  function Fgt() {
    let e = process.env.CLAUDE_CODE_ENABLE_AWAY_SUMMARY;
    if (Pl(e)) {
      return false;
    }
    if (st(e)) {
      return true;
    }
    if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_sedge_lantern", true)) {
      return false;
    }
    if (getIsNonInteractiveSession()) {
      return false;
    }
    if (getInitialSettings()?.awaySummaryEnabled === false) {
      return false;
    }
    return true;
  }
  function j8p() {
    let e = Me.CLAUDE_CODE_ENABLE_REMOTE_RECAP;
    if (e !== undefined) {
      return e;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_harbor_moth", false);
  }
  function tza(e) {
    if (!e.onMetadataChanged) {
      return;
    }
    if (!detectSurfaces().vZc("ccr") || !j8p()) {
      return;
    }
    q8p(e);
  }
  function nza() {
    o6n?.abort();
    o6n = null;
  }
  async function q8p(e) {
    o6n?.abort();
    let t = new AbortController();
    o6n = t;
    let n = await i8t(t.signal);
    if (t.signal.aborted) {
      return;
    }
    if (n.kind !== "ok") {
      if (n.kind !== "no-turn") {
        Ae("ccr_recap_generate", n.kind);
      }
      return;
    }
    if (e.getState() === "running") {
      logForDebugging("[awaySummary] ccr recap dropped: new turn already running");
      return;
    }
    e.notifyMetadataChanged({
      recap: n.text
    });
    Pe("ccr_recap_generate");
  }
  async function i8t(e, t) {
    let n = getLastCacheSafeParams();
    if (!n && t) {
      if (e.aborted) {
        return {
          kind: "aborted"
        };
      }
      try {
        n = await t();
      } catch (o) {
        logForDebugging(`[awaySummary] fallback params rebuild failed: ${o}`);
        return {
          kind: "failed"
        };
      }
      if (e.aborted) {
        return {
          kind: "aborted"
        };
      }
    }
    if (!n) {
      logForDebugging("[awaySummary] no CacheSafeParams saved, skipping");
      return {
        kind: "no-turn"
      };
    }
    let r = new AbortController();
    e.addEventListener("abort", () => r.abort(), {
      once: true
    });
    try {
      let {
        messages: o
      } = await runForkedAgent({
        promptMessages: [In({
          content: "The user stepped away and is coming back. Recap in under 40 words, 1-2 plain sentences, no markdown. Lead with the overall goal and current task, then the one next action. Skip root-cause narrative, fix internals, secondary to-dos, and em-dash tangents."
        })],
        cacheSafeParams: n,
        overrides: {
          abortController: r
        },
        canUseTool: async () => ({
          behavior: "deny",
          message: "Away summary cannot use tools",
          decisionReason: {
            type: "other",
            reason: "away_summary"
          }
        }),
        querySource: "away_summary",
        forkLabel: "away_summary",
        maxTurns: 1,
        skipCacheWrite: true,
        skipTranscript: true
      });
      if (e.aborted) {
        return {
          kind: "aborted"
        };
      }
      let s = o.find(a => a.type === "assistant" && a.isApiErrorMessage);
      if (s) {
        return {
          kind: "api-error",
          text: eza([s], true)
        };
      }
      let i = eza(o, false);
      return i ? {
        kind: "ok",
        text: i
      } : {
        kind: "failed"
      };
    } catch (o) {
      if (e.aborted) {
        return {
          kind: "aborted"
        };
      }
      logForDebugging(`[awaySummary] generation failed: ${o}`);
      return {
        kind: "failed"
      };
    }
  }
  function eza(e, t) {
    return e.flatMap(n => n.type === "assistant" && (t || !n.isApiErrorMessage) ? n.message.content : []).filter(n => n.type === "text").map(n => "text" in n ? n.text : "").join("").trim();
  }
  var o6n = null;
  var $8e = __lazy(() => {
    at();
    r6n();
    je();
    pr();
    gn();
    CO();
    ro();
    ln();
    $n();
  });
  function s6n(e) {
    if (!/^[A-Za-z]:[\\/]/.test(e)) {
      return [];
    }
    let t = E$e(e);
    if (t != null && Rc(t)) {
      return [e, t];
    }
    return [];
  }
  var aCo = __lazy(() => {
    mm();
  });
  function i6n(e, t) {
    let n = getInitialSettings();
    if (logForDebugging(`Settings changed from ${e}, updating app state`), e === "localSettings") {
      resetLocalSettingsGitTrackedCache();
    }
    let r = Bmt();
    zIe();
    clearCommandMemoizationCaches();
    t(o => {
      let s = syncPermissionRulesFromDisk(o.toolPermissionContext, r);
      s = uCo(s, o.settings.permissions?.additionalDirectories, $mt(), e);
      s = cCo(s, r);
      let i = Fgt();
      if (o.settings.effortLevel !== n.effortLevel) {
        eq();
      }
      let l = e === "policySettings" && (De(o.settings.allowedMcpServers) !== De(n.allowedMcpServers) || De(o.settings.deniedMcpServers) !== De(n.deniedMcpServers) || o.settings.disableClaudeAiConnectors !== n.disableClaudeAiConnectors);
      return {
        ...o,
        settings: n,
        toolPermissionContext: s,
        ...(l && {
          policyVersion: o.policyVersion + 1
        }),
        ...(o.awaySummaryEnabled !== i && {
          awaySummaryEnabled: i
        })
      };
    });
  }
  function a6n(e) {
    if (IPs()) {
      e();
    }
  }
  function cCo(e, t) {
    let n = e;
    if (n.isBypassPermissionsModeAvailable && isBypassPermissionsModeDisabled()) {
      n = createDisabledBypassPermissionsContext(n);
    }
    if (n.strippedDangerousRules !== undefined) {
      let r = new Set(bC);
      let o = {};
      for (let [s, i] of Object.entries(n.strippedDangerousRules)) {
        if (i && !r.vZc(s)) {
          o[s] = [...i];
        }
      }
      n = {
        ...n,
        strippedDangerousRules: o
      };
    }
    return transitionPlanAutoMode(n);
  }
  function uCo(e, t, n, r) {
    let o = new Set((t ?? []).map(lCo));
    let s = new Set((n ?? []).map(lCo));
    let i = e.additionalWorkingDirectories;
    let a = [...o].filter(u => !s.vZc(u) && !rza(i.get(u)?.source));
    let l = [...s].filter(u => !o.vZc(u) && !rza(i.get(u)?.source));
    if (a.length === 0 && l.length === 0 && r !== "flagSettings") {
      return e;
    }
    let c = e;
    if (r === "flagSettings") {
      let u = new Set((getSettingsForSource("flagSettings")?.permissions?.additionalDirectories ?? []).map(lCo));
      let d = new Map(c.trustedNetworkDirectories ?? []);
      let p = false;
      for (let m of [...d.keys()]) {
        if (!u.vZc(m) && i.get(m)?.source !== "cliArg") {
          for (let f of d.get(m) ?? []) {
            if (f !== m) {
              a.push(f);
            }
          }
          d.delete(m);
          p = true;
        }
      }
      for (let m of u) {
        if (!d.vZc(m)) {
          let f = s6n(m);
          if (f.length > 0) {
            d.set(m, f);
            for (let h of f) {
              if (h !== m) {
                l.push(h);
              }
            }
            p = true;
          }
        }
      }
      if (p) {
        c = {
          ...c,
          trustedNetworkDirectories: d
        };
      }
    }
    if (a.length > 0) {
      c = $y(c, {
        type: "removeDirectories",
        directories: a,
        destination: "localSettings"
      });
    }
    if (l.length > 0) {
      c = $y(c, {
        type: "addDirectories",
        directories: l,
        destination: "localSettings"
      });
    }
    return c;
  }
  function rza(e) {
    return e === "cliArg" || e === "command" || e === "session";
  }
  function lCo(e) {
    return oza.resolve(us(e));
  }
  var oza;
  var l6n = __lazy(() => {
    Bm();
    $8e();
    TMt();
    je();
    Fp();
    YW();
    gn();
    i1();
    ku();
    Zk();
    S_();
    oy();
    aCo();
    nf();
    oza = require("path");
  });
  var hCo = {};
  __export(hCo, {
    setCliTeammateModeOverride: () => setCliTeammateModeOverride,
    hasTeammateModeSnapshot: () => hasTeammateModeSnapshot,
    getTeammateModeFromSnapshot: () => getTeammateModeFromSnapshot,
    getCliTeammateModeOverride: () => getCliTeammateModeOverride,
    clearCliTeammateModeOverride: () => clearCliTeammateModeOverride,
    captureTeammateModeSnapshot: () => captureTeammateModeSnapshot,
    DEFAULT_TEAMMATE_MODE: () => "in-process"
  });
  function setCliTeammateModeOverride(e) {
    u8t = e;
  }
  function getCliTeammateModeOverride() {
    return u8t;
  }
  function clearCliTeammateModeOverride(e) {
    u8t = null;
    zNe = e;
    logForDebugging(`[TeammateModeSnapshot] CLI override cleared, new mode: ${e}`);
  }
  function hasTeammateModeSnapshot() {
    return zNe !== null;
  }
  function captureTeammateModeSnapshot() {
    if (u8t) {
      zNe = u8t;
      logForDebugging(`[TeammateModeSnapshot] Captured from CLI override: ${zNe}`);
    } else {
      zNe = uc("teammateMode", "in-process").value;
      logForDebugging(`[TeammateModeSnapshot] Captured from config: ${zNe}`);
    }
  }
  function getTeammateModeFromSnapshot() {
    if (zNe === null) {
      Oe(Error("getTeammateModeFromSnapshot called before capture - this indicates an initialization bug"));
      captureTeammateModeSnapshot();
    }
    return zNe ?? "in-process";
  }
  var zNe = null;
  var u8t = null;
  var YNe = __lazy(() => {
    je();
    Rn();
    zg();
  });
  var sza = {};
  __export(sza, {
    isAgentSwarmsEnabled: () => isAgentSwarmsEnabled,
    captureTeammateModeSnapshotIfEnabled: () => captureTeammateModeSnapshotIfEnabled
  });
  function V8p() {
    return process.argv.includes("--agent-teams");
  }
  function isAgentSwarmsEnabled() {
    if (!st(process.env.CLAUDE_CODE_EXPERIMENTAL_AGENT_TEAMS) && !V8p()) {
      return false;
    }
    if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_amber_flint", true)) {
      return false;
    }
    return true;
  }
  async function captureTeammateModeSnapshotIfEnabled() {
    if (!isAgentSwarmsEnabled()) {
      return;
    }
    let {
      captureTeammateModeSnapshot: e
    } = await Promise.resolve().then(() => (YNe(), hCo));
    e();
  }
  var mE = __lazy(() => {
    $n();
    gn();
  });
  function aza() {
    return "user_intent";
  }
  function u6n() {
    let e = process.env.CLAUDE_CODE_ENABLE_PROMPT_SUGGESTION;
    if (Pl(e)) {
      logEvent("tengu_prompt_suggestion_init", {
        enabled: false,
        source: "env"
      });
      return false;
    }
    if (st(e)) {
      logEvent("tengu_prompt_suggestion_init", {
        enabled: true,
        source: "env"
      });
      return true;
    }
    if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_chomp_inflection", false)) {
      logEvent("tengu_prompt_suggestion_init", {
        enabled: false,
        source: "growthbook"
      });
      return false;
    }
    if (getIsNonInteractiveSession()) {
      logEvent("tengu_prompt_suggestion_init", {
        enabled: false,
        source: "non_interactive"
      });
      return false;
    }
    if (isAgentSwarmsEnabled() && isTeammate()) {
      logEvent("tengu_prompt_suggestion_init", {
        enabled: false,
        source: "swarm_teammate"
      });
      return false;
    }
    let t = getInitialSettings()?.promptSuggestionEnabled !== false;
    logEvent("tengu_prompt_suggestion_init", {
      enabled: t,
      source: "setting"
    });
    return t;
  }
  function d6n() {
    let e = Me.CLAUDE_CODE_ENABLE_PROMPT_SUGGESTION;
    if (e !== undefined) {
      return e;
    }
    return getInitialSettings()?.promptSuggestionEnabled !== false;
  }
  function lza() {
    if (H8e) {
      H8e.abort();
      H8e = null;
    }
  }
  function z8p(e) {
    if (!e.promptSuggestionEnabled) {
      return "disabled";
    }
    if (e.pendingWorkerRequest || e.pendingSandboxRequest) {
      return "pending_permission";
    }
    if (e.elicitation.queue.length > 0) {
      return "elicitation_active";
    }
    if (e.toolPermissionContext.mode === "plan") {
      return "plan_mode";
    }
    if (g0.status !== "allowed") {
      return "rate_limit";
    }
    return null;
  }
  async function yCo(e, t, n, r, o) {
    if (e.signal.aborted) {
      W$("aborted", undefined, undefined, o);
      return null;
    }
    if (Bn(t, m => m.type === "assistant") < 2) {
      W$("early_conversation", undefined, undefined, o);
      return null;
    }
    let i = Yk(t);
    if (i?.isApiErrorMessage) {
      W$("last_response_error", undefined, undefined, o);
      return null;
    }
    let a = J8p(i);
    if (a) {
      W$(a, undefined, undefined, o);
      return null;
    }
    let l = n();
    let c = z8p(l);
    if (c) {
      W$(c, undefined, undefined, o);
      return null;
    }
    let u = aza();
    let {
      suggestion: d,
      generationRequestId: p
    } = await Q8p(e, u, r);
    if (e.signal.aborted) {
      W$("aborted", undefined, undefined, o);
      return null;
    }
    if (!d) {
      W$("empty", undefined, u, o);
      return null;
    }
    if (Z8p(d, u, o)) {
      return null;
    }
    return {
      suggestion: d,
      promptId: u,
      generationRequestId: p
    };
  }
  async function cza(e, t) {
    if (!e.querySource?.startsWith("repl_main_thread")) {
      return;
    }
    let n = nre();
    let r = li();
    let o = r && t?.tempo === "blocked" && !t.block;
    if (r ? n !== "focused" && !o : n === "blurred") {
      W$(r ? "bg_unattached" : "unfocused", undefined, undefined, "cli");
      return;
    }
    H8e = new AbortController();
    let s = H8e;
    let i = createCacheSafeParams(e);
    try {
      let a = await yCo(s, e.messages, e.toolUseContext.getAppState, i, "cli");
      if (!a) {
        return;
      }
      if (e.toolUseContext.setAppState(l => ({
        ...l,
        promptSuggestion: {
          text: a.suggestion,
          promptId: a.promptId,
          shownAt: 0,
          acceptedAt: 0,
          generationRequestId: a.generationRequestId
        }
      })), o) {
        K8p(a.suggestion, t?.needs).catch(Oe);
      }
    } catch (a) {
      if (a instanceof Error && (a.name === "AbortError" || a.name === "APIUserAbortError")) {
        W$("aborted", undefined, undefined, "cli");
        return;
      }
      Ae("prompt_suggestion_generate", "api_error");
      Oe(sr(a));
    } finally {
      if (H8e === s) {
        H8e = null;
      }
    }
  }
  async function K8p(e, t) {
    if (Lc(e) !== e) {
      return;
    }
    let n = dc(fT());
    fS(n);
    let r = await Zi(n);
    if (r?.tempo !== "blocked" || r.needs !== t || r.suggestedReply === e) {
      return;
    }
    await ip(n, {
      ...r,
      suggestedReply: e
    });
  }
  function J8p(e) {
    if (!e) {
      return null;
    }
    let t = e.message.usage;
    let n = t.input_tokens ?? 0;
    let r = t.cache_creation_input_tokens ?? 0;
    let o = t.output_tokens ?? 0;
    return n + r + o > 1e4 ? "cache_cold" : null;
  }
  async function Q8p(e, t, n) {
    let r = X8p[t];
    let o = async () => ({
      behavior: "deny",
      message: "No tools needed for suggestion",
      decisionReason: {
        type: "other",
        reason: "suggestion only"
      }
    });
    let s = await runForkedAgent({
      promptMessages: [In({
        content: r
      })],
      cacheSafeParams: n,
      canUseTool: o,
      querySource: "prompt_suggestion",
      forkLabel: "prompt_suggestion",
      overrides: {
        abortController: e
      },
      skipTranscript: true,
      skipCacheWrite: true
    });
    let i = s.messages.find(l => l.type === "assistant");
    let a = i?.type === "assistant" ? i.requestId ?? null : null;
    for (let l of s.messages) {
      if (l.type !== "assistant") {
        continue;
      }
      let c = l.message.content.find(u => u.type === "text");
      if (c?.type === "text") {
        let u = c.text.trim().replace(/^<(suggestion|response|output|answer|result)>([\s\S]*)<\/\1>$/i, (d, p, m) => m.includes(`</${p.toLowerCase()}>`) || m.includes(`</${p.toUpperCase()}>`) ? d : m).replace(/^\s*(suggested\s+(response|reply|input|prompt)|suggestion|response|reply|answer|output|result)\s*:\s*/i, "").trim();
        if (u) {
          Pe("prompt_suggestion_generate");
          return {
            suggestion: u,
            generationRequestId: a
          };
        }
      }
    }
    Pe("prompt_suggestion_generate");
    return {
      suggestion: null,
      generationRequestId: a
    };
  }
  function Z8p(e, t, n) {
    if (!e) {
      W$("empty", undefined, t, n);
      return true;
    }
    let r = e.toLowerCase();
    let o = e.trim().split(/\s+/).length;
    let s = [["done", () => r === "done"], ["meta_text", () => r === "nothing found" || r === "nothing found." || r.startsWith("nothing to suggest") || r.startsWith("no suggestion") || /\bsilence is\b|\bstay(s|ing)? silent\b/.test(r) || /^\W*silence\W*$/.test(r)], ["meta_wrapped", () => /^\(.*\)$|^\[.*\]$/.test(e)], ["error_message", () => r.startsWith("api error:") || r.startsWith("prompt is too long") || r.startsWith("request timed out") || r.startsWith("invalid api key") || r.startsWith("image was too large")], ["prefixed_label", () => /^\w+:\s/.test(e)], ["too_few_words", () => {
      if (o >= 2) {
        return false;
      }
      if (e.startsWith("/")) {
        return false;
      }
      return !new Set(["yes", "yeah", "yep", "yea", "yup", "sure", "ok", "okay", "push", "commit", "deploy", "stop", "continue", "check", "exit", "quit", "no"]).vZc(r);
    }], ["too_many_words", () => o > 12], ["too_long", () => e.length >= 100], ["multiple_sentences", () => /[.!?]\s+[A-Z]/.test(e)], ["has_formatting", () => /[\n*]|\*\*/.test(e)], ["evaluative", () => /thanks|thank you|looks good|sounds good|that works|that worked|that's all|nice|great|perfect|makes sense|awesome|excellent/.test(r)], ["claude_voice", () => /^(let me|i'll|i've|i'm|i can|i would|i think|i notice|here's|here is|here are|that's|this is|this will|you can|you should|you could|sure,|of course|certainly)/i.test(e)]];
    for (let [i, a] of s) {
      if (a()) {
        W$(i, e, t, n);
        return true;
      }
    }
    return false;
  }
  function uza(e, t, n, r, o) {
    let s = Math.round(t.length / (e.length || 1) * 100) / 100;
    let i = t === e;
    let a = Math.max(0, Date.now() - n);
    logEvent("tengu_prompt_suggestion", {
      source: "sdk",
      outcome: i ? "accepted" : "ignored",
      prompt_id: r,
      ...(o && {
        generationRequestId: br(o)
      }),
      ...(i && {
        timeToAcceptMs: a
      }),
      ...(!i && {
        timeToIgnoreMs: a
      }),
      similarity: s,
      ...false
    });
  }
  function W$(e, t, n, r) {
    let o = n ?? aza();
    logEvent("tengu_prompt_suggestion", {
      ...(r && {
        source: r
      }),
      outcome: "suppressed",
      reason: e,
      prompt_id: o,
      ...false
    });
  }
  var H8e = null;
  var iza = `[SUGGESTION MODE: Suggest what the user might naturally type next into Claude Code.]

FIRST: Look at the user's recent messages and original request.

Your job is to predict what THEY would type - not what you think they should do.

THE TEST: Would they think "I was just about to type that"?

EXAMPLES:
User asked "fix the bug and run tests", bug is fixed \u2192 "run the tests"
After code written \u2192 "try it out"
Claude offers options \u2192 suggest the one the user would likely pick, based on conversation
Claude asks to continue \u2192 "yes" or "go ahead"
Task complete, obvious follow-up \u2192 "commit this" or "push it"
After error or misunderstanding \u2192 silence (let them assess/correct)

Be specific: "run the tests" beats "continue".

NEVER SUGGEST:
- Evaluative ("looks good", "thanks")
- Questions ("what about...?")
- Claude-voice ("Let me...", "I'll...", "Here's...")
- New ideas they didn't ask about
- Multiple sentences

Stay silent if the next step isn't obvious from what the user said.

Stay silent if a suggestion could be unsafe or inappropriate \u2014 including any sensitive topic (security incidents, credentials, harm, private data). Even when the user is doing legitimate security or cybersecurity work, do not predict potentially unsafe actions.

Format: 2-12 words, match the user's style. Or nothing.

Reply with ONLY the suggestion, no quotes or explanation.`;
  var X8p;
  var Ugt = __lazy(() => {
    at();
    vWe();
    zf();
    mE();
    yd();
    pr();
    gn();
    dt();
    CO();
    Rn();
    ro();
    Kv();
    qp();
    ln();
    $n();
    Ot();
    B_();
    pU();
    X8p = {
      user_intent: iza,
      stated_intent: iza
    };
  });
  var _Co = {};
  __export(_Co, {
    makeSetWebBrowserSlice: () => makeSetWebBrowserSlice,
    getDefaultWebBrowserState: () => getDefaultWebBrowserState
  });
  function getDefaultWebBrowserState() {
    return {
      view: undefined,
      logs: [],
      unreadErrors: 0,
      unreadWarnings: 0,
      cleanupRegistered: false
    };
  }
  function makeSetWebBrowserSlice(e) {
    return t => e(n => {
      let r = {
        webBrowser: n.webBrowser,
        bagelActive: n.bagelActive,
        bagelUrl: n.bagelUrl,
        bagelPanelVisible: n.bagelPanelVisible
      };
      let o = t(r);
      if (o === r) {
        return n;
      }
      return {
        ...n,
        ...o
      };
    });
  }
  var dza = {};
  __export(dza, {
    getDefaultAppState: () => getDefaultAppState
  });
  function getDefaultAppState() {
    qp();
    let e = __toCommonJS(UWr);
    let t = e.isTeammate() && e.isPlanModeRequired() ? "plan" : "default";
    return {
      settings: getInitialSettings(),
      tasks: {},
      transcripts: {},
      taskDecorations: {},
      agentNameRegistry: new Map(),
      agentTypesInvokedThisSession: new Set(),
      verbose: false,
      showMessageTimestamps: false,
      mainLoopModel: null,
      mainLoopModelForSession: null,
      statusLineText: undefined,
      prStatus: null,
      prNeedsAuth: false,
      expandedView: "none",
      replTab: "convo",
      isBriefOnly: false,
      briefTranscript: false,
      coordinatorTaskIndex: -1,
      workflowFooterIndex: 0,
      viewSelectionMode: "none",
      queueEditIndex: null,
      footerSelection: null,
      footerLinks: [],
      remoteSessionUrl: undefined,
      remoteProject: undefined,
      remoteConnectionStatus: "connecting",
      remoteBootstrap: null,
      remoteBackgroundTaskCount: 0,
      hasRemoteReplyChannel: false,
      replBridgeEnabled: false,
      replBridgeAutoOnByDefault: false,
      replBridgeExplicit: false,
      replBridgeOutboundOnly: false,
      replBridgeConnected: false,
      replBridgeSessionActive: false,
      replBridgeSkipNextArchive: false,
      replBridgeReconnecting: false,
      replBridgeConnectUrl: undefined,
      replBridgeSessionUrl: undefined,
      replBridgeEnvironmentId: undefined,
      replBridgeSessionId: undefined,
      replBridgeError: undefined,
      replBridgeInitialName: undefined,
      showRemoteCallout: false,
      toolPermissionContext: {
        ...tq(),
        mode: t
      },
      agent: undefined,
      agentDefinitions: {
        activeAgents: [],
        allAgents: []
      },
      skillTruncationStats: null,
      skillTools: [],
      fileHistory: {
        snapshots: [],
        trackedFiles: new Set(),
        snapshotSequence: 0
      },
      attribution: fmt(),
      mcp: {
        clientsInitialized: false,
        clients: [],
        tools: [],
        commands: [],
        resources: {},
        resourceTemplates: {},
        suppressedClaudeAiConnectors: [],
        pluginReconnectKey: 0
      },
      plugins: {
        enabled: [],
        disabled: [],
        commands: [],
        errors: [],
        warnings: [],
        installationStatus: {
          marketplaces: [],
          plugins: []
        },
        needsRefresh: false
      },
      setupIssues: {
        settingsErrorCount: 0,
        lspFailedCount: 0,
        installBrokenMessages: [],
        installPathCount: 0,
        marketplaceIssueCount: 0,
        chromeExtensionIssueCount: 0,
        npmInstallDeprecated: false,
        sandboxIssueCount: 0,
        statuslineIssueCount: 0,
        flaggedPluginCount: 0,
        modelDeprecationWarning: null,
        modelRestrictedWarning: null,
        existingClaudeSubscription: null
      },
      todos: {},
      replContexts: {},
      notifications: {
        current: null,
        queue: [],
        pinned: []
      },
      autoUpdaterResult: null,
      frameUrls: {},
      frameNavPath: null,
      frameExpanded: false,
      elicitation: {
        queue: []
      },
      thinkingEnabled: wce(),
      promptSuggestionEnabled: u6n(),
      awaySummaryEnabled: Fgt(),
      displayedMessageContent: {},
      sessionHooks: new Map(),
      inbox: {
        messages: []
      },
      workerSandboxPermissions: {
        queue: [],
        selectedIndex: 0
      },
      pendingMemoryUpdates: [],
      pendingWorkerRequest: null,
      pendingSandboxRequest: null,
      promptSuggestion: {
        text: null,
        promptId: null,
        shownAt: 0,
        acceptedAt: 0,
        generationRequestId: null
      },
      authVersion: 0,
      policyVersion: 0,
      initialMessage: null,
      effortValue: undefined,
      ultracode: undefined,
      cacheMissAckedAtOutputTokens: -1,
      activeOverlays: new Set(),
      fastMode: false,
      storedImagePaths: new Map(),
      imageDescriptions: new Map(),
      classifierApprovals: {
        approvals: new Map(),
        checking: new Set()
      },
      teammateColors: {
        assignments: new Map(),
        index: 0
      },
      webBrowser: __toCommonJS(_Co).getDefaultWebBrowserState()
    };
  }
  var j8e = __lazy(() => {
    $8e();
    Ugt();
    ci();
    HG();
    XN();
  });
  var bCo = {};
  __export(bCo, {
    AppStateProvider: () => AppStateProvider
  });
  function AppStateProvider(e) {
    let t = mza.c(23);
    let {
      children: n,
      initialState: r,
      onChangeAppState: o
    } = e;
    if (Xoe.useContext(pza)) {
      throw Error("AppStateProvider can not be nested within another AppStateProvider");
    }
    let i;
    if (t[0] !== r || t[1] !== o) {
      i = () => dO(r ?? getDefaultAppState(), o);
      t[0] = r;
      t[1] = o;
      t[2] = i;
    } else {
      i = t[2];
    }
    let [a] = Xoe.useState(i);
    let l;
    let c;
    if (t[3] !== a) {
      l = () => {
        let S = () => Z5n(a.getState().tasks);
        let E = Ti(S);
        return () => {
          S();
          E();
        };
      };
      c = [a];
      t[3] = a;
      t[4] = l;
      t[5] = c;
    } else {
      l = t[4];
      c = t[5];
    }
    Xoe.useEffect(l, c);
    let u;
    let d;
    if (t[6] !== a) {
      u = () => (setMcpClientsAccessor(() => a.getState().mcp.clients), nVp);
      d = [a];
      t[6] = a;
      t[7] = u;
      t[8] = d;
    } else {
      u = t[7];
      d = t[8];
    }
    Xoe.useEffect(u, d);
    let p;
    if (t[9] !== a.setState) {
      p = () => e6n(a.setState);
      t[9] = a.setState;
      t[10] = p;
    } else {
      p = t[10];
    }
    let m;
    if (t[11] !== a) {
      m = [a];
      t[11] = a;
      t[12] = m;
    } else {
      m = t[12];
    }
    Xoe.useEffect(p, m);
    let f;
    if (t[13] !== a.setState) {
      f = S => i6n(S, a.setState);
      t[13] = a.setState;
      t[14] = f;
    } else {
      f = t[14];
    }
    let h = Xoe.useEffectEvent(f);
    Agt(h);
    let g;
    if (t[15] !== h) {
      g = () => {
        a6n(() => h("policySettings"));
      };
      t[15] = h;
      t[16] = g;
    } else {
      g = t[16];
    }
    let y;
    if (t[17] === Symbol.for("react.memo_cache_sentinel")) {
      y = [];
      t[17] = y;
    } else {
      y = t[17];
    }
    Xoe.useEffect(g, y);
    let _;
    if (t[18] !== n) {
      _ = p8t.jsx(mVa, {
        children: p8t.jsx(tVp, {
          children: n
        })
      });
      t[18] = n;
      t[19] = _;
    } else {
      _ = t[19];
    }
    let b;
    if (t[20] !== a || t[21] !== _) {
      b = p8t.jsx(pza.Provider, {
        value: true,
        children: p8t.jsx(Dct.Provider, {
          value: a,
          children: _
        })
      });
      t[20] = a;
      t[21] = _;
      t[22] = b;
    } else {
      b = t[22];
    }
    return b;
  }
  function nVp() {
    return setMcpClientsAccessor(undefined);
  }
  var mza;
  var fza;
  var Xoe;
  var p8t;
  var tVp;
  var pza;
  var _3 = __lazy(() => {
    at();
    jwo();
    F5n();
    sCo();
    hd();
    t6n();
    l6n();
    ho();
    tre();
    j8e();
    mza = __toESM(pt(), 1);
    fza = __toESM(ot(), 1);
    Xoe = __toESM(ot(), 1);
    p8t = __toESM(ie(), 1);
    tVp = (dSe(), __toCommonJS(O7i)).VoiceProvider;
    pza = fza.createContext(false);
  });
  var p6n = {};
  __export(p6n, {
    getBaseRenderOptions: () => getBaseRenderOptions
  });
  function rVp() {
    if (XNe !== null) {
      return XNe;
    }
    if (process.stdin.isTTY) {
      XNe = undefined;
      return;
    }
    if (st(false)) {
      XNe = undefined;
      return;
    }
    if (process.argv.includes("mcp")) {
      XNe = undefined;
      return;
    }
    try {
      let e = hza.openSync("/dev/tty", "r");
      let t = new gza.ReadStream(e);
      handleStreamGoneErrors(t);
      t.on("error", n => {
        logEvent("tengu_tty_stream_error", o1(n));
        logForDebugging(`/dev/tty stream error: ${n}`, {
          level: "debug"
        });
      });
      t.isTTY = true;
      XNe = t;
      return XNe;
    } catch (e) {
      logForDebugging(`Could not open /dev/tty for stdin override: ${e}`, {
        level: "error"
      });
      XNe = undefined;
      return;
    }
  }
  function getBaseRenderOptions(e = false) {
    let t = rVp();
    let n = {
      exitOnCtrlC: e
    };
    if (t) {
      n.stdin = t;
    }
    n.isScreenReaderEnabled = tM();
    return n;
  }
  var hza;
  var gza;
  var XNe = null;
  var Qoe = __lazy(() => {
    Ot();
    je();
    gn();
    dw();
    OD();
    D8();
    hza = require("fs");
    gza = require("tty");
  });
  function _za() {
    return m6n;
  }
  function TCo(e) {
    if (SCo = e, e && Bgt.length > 0) {
      let t = Bgt;
      Bgt = [];
      for (let n of t) {
        n(e);
      }
    }
  }
  async function sVp() {
    let e;
    let t = new Promise(r => {
      e = r;
      Bgt.push(r);
    });
    let n = await withTimeout(t, 5000, "managed-settings security dialog requester wait timed out").catch(() => null);
    if (n === null) {
      Bgt = Bgt.filter(r => r !== e);
    }
    return n;
  }
  async function yza(e, t) {
    let n = await e(t);
    if (logEvent(n === "approved" ? "tengu_managed_settings_security_dialog_accepted" : "tengu_managed_settings_security_dialog_rejected", {}), n === "approved") {
      Pe("remote_managed_settings_security_check");
    }
    return n;
  }
  async function bza(e, t) {
    if (!t || !O5n(kgt(t))) {
      return "no_check_needed";
    }
    if (!tVa(e, t)) {
      return "no_check_needed";
    }
    if (!getIsInteractive()) {
      return "no_check_needed";
    }
    if (logEvent("tengu_managed_settings_security_dialog_shown", {}), SCo) {
      return yza(SCo, t);
    }
    if (rVd.vZc(process.stdout)) {
      let r = await sVp();
      if (r) {
        return yza(r, t);
      }
    }
    let n = rVd.vZc(process.stdout);
    if (!n) {
      m6n = true;
    }
    return new Promise(r => {
      (async () => {
        let {
          rerender: o,
          unmount: s
        } = await render(f6n.jsx(AppStateProvider, {
          children: f6n.jsx(KeybindingSetup, {
            children: f6n.jsx(D5n, {
              settings: t,
              onAccept: () => {
                if (logEvent("tengu_managed_settings_security_dialog_accepted", {}), Pe("remote_managed_settings_security_check"), n) {
                  o(null);
                } else {
                  s();
                }
                m6n = false;
                r("approved");
              },
              onReject: () => {
                if (logEvent("tengu_managed_settings_security_dialog_rejected", {}), n) {
                  o(null);
                } else {
                  s();
                }
                m6n = false;
                r("rejected");
              }
            })
          })
        }), getBaseRenderOptions(false));
      })();
    });
  }
  function Sza(e) {
    if (e === "rejected") {
      gracefulShutdownSync(1);
      return false;
    }
    return true;
  }
  var f6n;
  var SCo = null;
  var Bgt;
  var m6n = false;
  var ECo = __lazy(() => {
    at();
    Lwo();
    Nwo();
    et();
    C9();
    _3();
    lm();
    Qoe();
    ln();
    Ot();
    f6n = __toESM(ie(), 1);
    Bgt = [];
  });
  function q8e() {
    xQ = undefined;
    kPs();
  }
  function kQ() {
    if (xQ !== undefined) {
      return xQ;
    }
    if (Sle()) {
      return xQ = ble(true);
    }
    if (getAPIProvider() === "gateway") {
      return xQ = ble(isGatewayAuthPinned(getGatewayAuth()));
    }
    if (getAPIProvider() !== "firstParty") {
      return xQ = ble(false);
    }
    if (!isFirstPartyAnthropicBaseUrl()) {
      return xQ = ble(false);
    }
    if (Me.CLAUDE_CODE_ENTRYPOINT === "local-agent" || Me.CLAUDE_CODE_ENTRYPOINT === "remote_cowork") {
      return xQ = ble(false);
    }
    if (hasStoredOAuthToken() && getStoredOAuthSubscriptionType() === null) {
      return xQ = ble(true);
    }
    if (hasStoredOAuthToken() && (getStoredOAuthSubscriptionType() === "enterprise" || getStoredOAuthSubscriptionType() === "team")) {
      return xQ = ble(true);
    }
    try {
      let {
        key: e
      } = getAnthropicApiKeyWithSource({
        skipRetrievingKeyFromApiKeyHelper: true
      });
      if (e) {
        return xQ = ble(true);
      }
    } catch {}
    return xQ = ble(false);
  }
  var xQ;
  var m8t = __lazy(() => {
    at();
    no();
    pr();
    Ds();
    TMt();
  });
  var Tza;
  var Eza = __lazy(() => {
    Tza = we(() => v.object({
      uuid: v.string(),
      checksum: v.string(),
      settings: v.record(v.string(), v.unknown())
    }));
  });
  var vCo = {};
  __export(vCo, {
    applySafeConfigEnvironmentVariables: () => applySafeConfigEnvironmentVariables,
    applyConfigEnvironmentVariables: () => applyConfigEnvironmentVariables,
    _resetSpawnEnvSnapshotForTesting: () => _resetSpawnEnvSnapshotForTesting
  });
  function iVp(e) {
    if (!e || !process.env.ANTHROPIC_UNIX_SOCKET) {
      return e || {};
    }
    let {
      ANTHROPIC_UNIX_SOCKET: t,
      ANTHROPIC_BASE_URL: n,
      ANTHROPIC_API_KEY: r,
      ANTHROPIC_AUTH_TOKEN: o,
      CLAUDE_CODE_OAUTH_TOKEN: s,
      CLAUDE_CODE_ARTIFACTS_API_BASE_URL: i,
      ...a
    } = e;
    return a;
  }
  function vza() {
    let e = st(process.env.CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST);
    let t = L6();
    let n = process.env.CLAUDE_CODE_ENVIRONMENT_KIND;
    W8e = {
      managedByHost: e || !!process.env.CLAUDE_CODE_HOST_AUTH_ENV_VAR,
      managedByHostFlag: e,
      desktopHost: t,
      hostOrchestrated: t || n === "byoc"
    };
  }
  function cVp(e, t) {
    if (!e) {
      return {};
    }
    let n = W8e.managedByHost || W8e.desktopHost && aVp.vZc(t);
    let r = {};
    for (let [o, s] of Object.entries(e)) {
      if (lVp.vZc(o.toUpperCase())) {
        continue;
      }
      if (!n) {
        r[o] = s;
        continue;
      }
      if (Xgn(o)) {
        continue;
      }
      if (W8e.managedByHost && o.toUpperCase() === "ANTHROPIC_CUSTOM_HEADERS") {
        continue;
      }
      if (W8e.managedByHostFlag && Qgn(o)) {
        continue;
      }
      r[o] = s;
    }
    return r;
  }
  function uVp(e) {
    if (!e || !f8t) {
      return e || {};
    }
    let t = {};
    for (let [n, r] of Object.entries(e)) {
      if (!f8t.vZc(n)) {
        t[n] = r;
      }
    }
    return t;
  }
  function dVp(e) {
    if (!e) {
      return {};
    }
    let {
      NO_COLOR: t,
      FORCE_COLOR: n,
      ...r
    } = e;
    if (t !== undefined) {
      Hgt.NO_COLOR = t;
    }
    if (n !== undefined) {
      Hgt.FORCE_COLOR = n;
    }
    return r;
  }
  function mVp(e) {
    if (!e) {
      return {};
    }
    let t = {};
    for (let [n, r] of Object.entries(e)) {
      if (!pVp.vZc(n.toUpperCase())) {
        t[n] = r;
      }
    }
    return t;
  }
  function $gt(e, t) {
    return dVp(uVp(cVp(mVp(iVp(e)), t)));
  }
  function applySafeConfigEnvironmentVariables() {
    if (vza(), f8t === undefined) {
      f8t = W8e.hostOrchestrated ? new Set(Object.keys(process.env)) : null;
    }
    Hgt = {};
    Object.assign(process.env, $gt(getGlobalConfig().env, "globalConfig"));
    for (let e of fVp) {
      if (e === "policySettings") {
        continue;
      }
      if (!qf(e)) {
        continue;
      }
      Object.assign(process.env, $gt(getSettingsForSource(e)?.env, e));
    }
    kQ();
    Object.assign(process.env, $gt(getSettingsForSource("policySettings")?.env, "policySettings"));
    for (let e of ew()) {
      let t = $gt(getSettingsForSource(e)?.env, e);
      for (let [n, r] of Object.entries(t)) {
        if (Int.vZc(n.toUpperCase())) {
          process.env[n] = r;
        }
      }
    }
    setSettingsColorEnv(Hgt);
  }
  function _resetSpawnEnvSnapshotForTesting() {
    f8t = undefined;
    W8e = {
      managedByHost: false,
      managedByHostFlag: false,
      desktopHost: false,
      hostOrchestrated: false
    };
  }
  function applyConfigEnvironmentVariables() {
    vza();
    Hgt = {};
    Object.assign(process.env, $gt(getGlobalConfig().env, "globalConfig"));
    for (let e of ew()) {
      Object.assign(process.env, $gt(getSettingsForSource(e)?.env, e));
    }
    setSettingsColorEnv(Hgt);
    clearCACertsCache();
    clearMTLSCache();
    clearProxyCache();
    configureGlobalAgents();
  }
  var W8e;
  var aVp;
  var lVp;
  var f8t;
  var Hgt;
  var pVp;
  var fVp;
  var qEe = __lazy(() => {
    m8t();
    Ije();
    $A();
    gn();
    lW();
    fW();
    Fh();
    nf();
    s1();
    W8e = {
      managedByHost: false,
      managedByHostFlag: false,
      desktopHost: false,
      hostOrchestrated: false
    };
    aVp = new Set(["policySettings", "projectSettings", "localSettings"]);
    lVp = new Set([...Zgn, "CLAUDE_CODE_HOST_CREDS_FILE", "CLAUDE_CODE_HOST_AUTH_ENV_VAR"]);
    Hgt = {};
    pVp = new Set(["CLAUDE_CODE_REMOTE", "CLAUDE_CODE_ACCOUNT_UUID", "CLAUDE_CODE_ORGANIZATION_UUID", "CLAUDE_CODE_USER_EMAIL", "CLAUDE_CODE_CONTAINER_ID"]);
    fVp = ["userSettings", "flagSettings", "policySettings"];
  });
  function CCo() {
    if (Rza(), ZNe) {
      return;
    }
    if (kQ()) {
      ZNe = new Promise(e => {
        _z = e;
        setTimeout(t => {
          if (_z === t) {
            if (_za()) {
              logForDebugging("Remote settings: Loading promise timeout deferred \u2014 consent dialog pending");
              return;
            }
            logForDebugging("Remote settings: Loading promise timed out, resolving anyway");
            _z();
            _z = null;
          }
        }, 30000, e);
      });
    }
  }
  function SVp() {
    let e = getGatewayAuth();
    if (e) {
      return `${e.url}/managed/settings`;
    }
    return `${getOauthConfig().BASE_API_URL}/api/claude_code/settings`;
  }
  function wza(e) {
    if (!e) {
      return e;
    }
    return jke(e, "remote managed settings").settings ?? {};
  }
  async function TVp() {
    return null;
  }
  function RCo() {
    return kQ();
  }
  async function G8e() {
    if (ZNe) {
      await ZNe;
    }
  }
  function xCo() {
    return kQ() && !Pke();
  }
  function Rza() {
    Y8a(async () => {
      if (xCo()) {
        await G8e();
      }
    });
  }
  function EVp() {
    let e = getGatewayAuth();
    if (e) {
      return {
        headers: {
          Authorization: `Bearer ${e.jwt}`
        }
      };
    }
    try {
      let {
        key: n
      } = getAnthropicApiKeyWithSource({
        skipRetrievingKeyFromApiKeyHelper: true
      });
      if (n) {
        return {
          headers: {
            "x-api-key": n
          }
        };
      }
    } catch {}
    let t = getClaudeAIOAuthTokens();
    if (t?.accessToken) {
      return {
        headers: {
          Authorization: `Bearer ${t.accessToken}`,
          "anthropic-beta": "oauth-2025-04-20"
        },
        accessToken: t.accessToken
      };
    }
    return {
      headers: {},
      error: "No authentication available"
    };
  }
  async function vVp(e, t = {}) {
    let n = await TVp();
    if (n) {
      return n;
    }
    let r = null;
    let o = getGatewayAuth() && !t.background ? 0 : 5;
    for (let s = 1; s <= o + 1; s++) {
      if (r = await xza(e), r.success) {
        return r;
      }
      if (r.skipRetry) {
        return r;
      }
      if (s > o) {
        return r;
      }
      let i = YV(s);
      logForDebugging(`Remote settings: Retry ${s}/${o} after ${i}ms`);
      await sleep(i);
    }
    return r;
  }
  async function xza(e, t = false) {
    let n;
    try {
      await checkAndRefreshOAuthTokenIfNeeded();
      await b0e();
      let r = EVp();
      if (n = r.accessToken, r.error) {
        return {
          success: false,
          error: "Authentication required for remote settings",
          errorKind: "no_auth_available",
          skipRetry: true
        };
      }
      let o = SVp();
      let s = {
        ...r.headers,
        "User-Agent": dg(),
        "Cache-Control": "no-cache",
        Pragma: "no-cache"
      };
      if (e) {
        s["If-None-Match"] = `"${e}"`;
      }
      let i;
      let a = getGatewayAuth();
      if (a) {
        let d = await zBt(new URL(a.url).hostname.replace(/^\[|\]$/g, ""));
        if (!d) {
          ;
        } else if (getProxyUrl()) {
          logForDebugging("[gateway] HTTPS proxy configured \u2014 per-request cert pin not applied to managed-settings fetch (known gap)", {
            level: "warn"
          });
        } else {
          i = sOi(d);
        }
      }
      let l = await NP.get(o, {
        headers: s,
        timeout: 1e4,
        ...(i && {
          httpsAgent: i
        }),
        validateStatus: d => d === 200 || d === 204 || d === 304 || d === 404
      });
      if (l.status === 304) {
        logForDebugging("Remote settings: Using cached settings (304)");
        return {
          success: true,
          settings: null,
          checksum: e
        };
      }
      if (l.status === 204 || l.status === 404) {
        logForDebugging(`Remote settings: No settings found (${l.status})`);
        return {
          success: true,
          settings: {},
          checksum: undefined
        };
      }
      let c = Tza().safeParse(l.data);
      if (!c.success) {
        logForDebugging(`Remote settings: Invalid response format - ${c.error.message}`);
        return {
          success: false,
          error: "Invalid remote settings format",
          errorKind: "parse_error",
          skipRetry: true
        };
      }
      let u = jke(c.data.settings, "remote managed settings");
      if (!u.settings && Object.keys(c.data.settings).length > 0) {
        logForDebugging("Remote settings: Settings validation failed - no fields could be salvaged");
        return {
          success: false,
          error: "Invalid settings structure",
          errorKind: "invalid_settings",
          skipRetry: true
        };
      }
      if (u.errors.length > 0) {
        logForDebugging(`Remote settings: Payload contains ${u.errors.length} invalid entries; applying the salvaged subset`);
      }
      logForDebugging("Remote settings: Fetched successfully");
      return {
        success: true,
        settings: c.data.settings,
        salvagedSettings: u.errors.length > 0 ? u.settings ?? {} : undefined,
        checksum: c.data.checksum
      };
    } catch (r) {
      let o = he(r?.cause);
      if (he(r).includes("gateway TLS certificate does not match the pinned fingerprint") || o.includes("gateway TLS certificate does not match the pinned fingerprint")) {
        return {
          success: false,
          error: "Cloud gateway TLS certificate does not match stored pin",
          errorKind: "gateway_cert_mismatch",
          skipRetry: true
        };
      }
      let {
        kind: s,
        status: i,
        message: a
      } = YS(r);
      if (i === 404) {
        return {
          success: true,
          settings: {},
          checksum: ""
        };
      }
      switch (s) {
        case "auth":
          if (i === 401 && n && !t) {
            await handleOAuth401Error(n);
            let l = getClaudeAIOAuthTokens()?.accessToken;
            if (l && l !== n) {
              logEvent("tengu_remote_settings_401_force_refresh_retry", {});
              return xza(e, true);
            }
          }
          return {
            success: false,
            error: "Not authorized for remote settings",
            errorKind: i === 401 ? "http_401" : "http_403",
            skipRetry: true
          };
        case "timeout":
          return {
            success: false,
            error: "Remote settings request timeout",
            errorKind: "timeout"
          };
        case "network":
          return {
            success: false,
            error: "Cannot connect to server",
            errorKind: "network_error"
          };
        default:
          return {
            success: false,
            error: a,
            errorKind: i !== undefined && i >= 500 ? "http_5xx" : i !== undefined && i >= 400 ? "http_4xx" : "unknown_error"
          };
      }
    }
  }
  async function Cza(e) {
    try {
      let t = ryn();
      let n = await jgt.open(t, "w", 384);
      try {
        await n.writeFile(De(e, null, 2), {
          encoding: "utf-8"
        });
        await n.datasync();
      } finally {
        await n.close();
      }
      logForDebugging(`Remote settings: Saved to ${t}`);
    } catch (t) {
      logForDebugging(`Remote settings: Failed to save - ${t instanceof Error ? t.message : "unknown error"}`);
    }
  }
  async function kza() {
    if (Pza(), q8e(), ZNe = null, _z = null, Sle()) {
      return;
    }
    try {
      let e = ryn();
      await jgt.unlink(e);
    } catch {}
  }
  async function kCo(e = {}) {
    if (!kQ()) {
      return {
        settings: null,
        fetchSucceeded: true
      };
    }
    let t = Sle();
    if (t) {
      logForDebugging(`Remote settings: Using override file ${t} (CLAUDE_CODE_REMOTE_SETTINGS_PATH), skipping API fetch`);
      return {
        settings: Pke(),
        fetchSucceeded: true
      };
    }
    let n = b1r();
    let r = xPs();
    let o = n ? P5n(n) : undefined;
    try {
      let s = await vVp(o, e);
      if (!s.success) {
        if (Ae("remote_managed_settings_pull", s.errorKind ?? "remote_managed_settings_fetch_failed"), n) {
          logForDebugging("Remote settings: Using stale cache after fetch failure");
          Pnt(n);
          return {
            settings: n,
            fetchSucceeded: false
          };
        }
        return {
          settings: null,
          fetchSucceeded: false
        };
      }
      if (s.settings === null && n) {
        if (logForDebugging("Remote settings: Cache still valid (304 Not Modified)"), Pnt(n, {
          verified: true
        }), !r) {
          await wCo();
        }
        Pe("remote_managed_settings_pull", {
          status: "not_modified"
        });
        return {
          settings: n,
          fetchSucceeded: true
        };
      }
      let i = s.settings || {};
      if (Object.keys(i).length > 0) {
        let l = wza(n);
        let c = wza(i);
        let u = await bza(l, c);
        if (!Sza(u)) {
          logForDebugging("Remote settings: User rejected new settings, using cached settings");
          return {
            settings: n,
            fetchSucceeded: true
          };
        }
        if (Pnt(i, {
          verified: true
        }), !r) {
          await wCo();
        }
        await Cza(s.salvagedSettings ?? i);
        logForDebugging("Remote settings: Applied new settings successfully");
        Pe("remote_managed_settings_pull", {
          status: "updated"
        });
        return {
          settings: i,
          fetchSucceeded: true
        };
      }
      if (Pnt(i, {
        verified: true
      }), !r) {
        await wCo();
      }
      await Cza({});
      logForDebugging("Remote settings: Saved empty sentinel (404 response)");
      Pe("remote_managed_settings_pull", {
        status: "no_content"
      });
      return {
        settings: i,
        fetchSucceeded: true
      };
    } catch {
      if (Ae("remote_managed_settings_pull", "remote_managed_settings_unexpected"), n) {
        logForDebugging("Remote settings: Using stale cache after error");
        Pnt(n);
        return {
          settings: n,
          fetchSucceeded: false
        };
      }
      return {
        settings: null,
        fetchSucceeded: false
      };
    }
  }
  async function g6n() {
    if (Rza(), kQ() && !ZNe) {
      ZNe = new Promise(e => {
        _z = e;
      });
    }
    if (Pke() && _z) {
      _z();
      _z = null;
    }
    try {
      let {
        settings: e,
        fetchSucceeded: t
      } = await kCo();
      if (kQ() && !Sle()) {
        Iza();
      }
      if (e !== null) {
        h6n();
      }
      return t;
    } finally {
      Aza();
    }
  }
  function Aza() {
    if (_z) {
      _z();
      _z = null;
    }
  }
  async function V8e() {
    if (Pza(), q8e(), ZNe = null, _z = null, !kQ()) {
      h6n();
      return true;
    }
    CCo();
    let e;
    try {
      ({
        fetchSucceeded: e
      } = await kCo());
    } finally {
      Aza();
    }
    if (logForDebugging("Remote settings: Refreshed after auth change"), !Sle()) {
      Iza();
    }
    h6n();
    return e;
  }
  function h6n() {
    try {
      APs();
      fM.notifyChange("policySettings");
    } catch (e) {
      Oe(e);
    }
  }
  async function wCo() {
    try {
      let [{
        applyConfigEnvironmentVariables: e,
        applySafeConfigEnvironmentVariables: t
      }, {
        checkHasTrustDialogAccepted: n
      }] = await Promise.all([Promise.resolve().then(() => (qEe(), vCo)), Promise.resolve().then(() => (Jn(), bz))]);
      if (n()) {
        e();
      } else {
        t();
        let [{
          clearProxyCache: r,
          configureGlobalAgents: o
        }, {
          clearCACertsCache: s
        }, {
          clearMTLSCache: i
        }] = await Promise.all([Promise.resolve().then(() => (Fh(), BAe)), Promise.resolve().then(() => (Ije(), CDs)), Promise.resolve().then(() => (fW(), IDs))]);
        r();
        s();
        i();
        o();
      }
    } catch (e) {
      Oe(e);
    }
  }
  async function ACo(e) {
    try {
      if (await e()) {
        return {
          valid: true
        };
      }
    } catch (t) {
      Oe(t);
    }
    return {
      valid: false,
      message: "Your organization requires remote managed settings to load, but they could not be loaded. Run `claude auth login` to re-authenticate, check your network connection, or contact your administrator."
    };
  }
  async function CVp() {
    if (!kQ()) {
      return;
    }
    let e = Pke();
    let t = e ? De(e) : null;
    try {
      await kCo({
        background: true
      });
      let n = Pke();
      if ((n ? De(n) : null) !== t) {
        logForDebugging("Remote settings: Changed during background poll");
        h6n();
      }
    } catch {}
  }
  function Iza() {
    if (h8t !== null) {
      return;
    }
    if (!kQ()) {
      return;
    }
    h8t = _Dn(() => void CVp(), 3600000, {
      unref: true
    });
    Ti(h8t);
  }
  function Pza() {
    h8t?.[Symbol.dispose]();
    h8t = null;
  }
  var jgt;
  var h8t = null;
  var ZNe = null;
  var _z = null;
  var z8e = __lazy(() => {
    Dp();
    at();
    Uc();
    no();
    hd();
    je();
    dt();
    bst();
    uIn();
    Rn();
    Fh();
    ode();
    Gke();
    Owo();
    ln();
    Ot();
    r6e();
    ECo();
    m8t();
    TMt();
    Eza();
    jgt = require("fs/promises");
  });