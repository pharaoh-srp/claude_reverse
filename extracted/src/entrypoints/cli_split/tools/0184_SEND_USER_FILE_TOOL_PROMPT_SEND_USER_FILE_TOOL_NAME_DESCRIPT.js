  __export(kIe, {
    PEWTER_OWL_TOOL_PROMPT: () => "Send a message the user will read verbatim. Use this for content they need to see exactly as written between tool calls \u2014 a generated code snippet, a specific value, a direct reply to something they asked mid-task. Don't use it for routine narration of what you're about to do, or for your final answer \u2014 normal text reaches them for those.",
    LEGACY_BRIEF_TOOL_NAME: () => "Brief",
    DESCRIPTION: () => "Send a message to the user",
    BRIEF_TOOL_PROMPT: () => "Send a message the user will read. Text outside this tool is visible in the detail view, but most won't open it \u2014 the answer lives here.\n\n`message` supports markdown. `attachments` accepts two forms per entry: a file path string (absolute or cwd-relative) for a file you can read here \u2014 images, diffs, logs \u2014 or the exact {file_uuid, file_name, size, is_image} object a device tool like `attach_file` returned to you. Use the path form when the file is on your working filesystem; use the object form when the user's device already uploaded the file and handed you a reference \u2014 pass that object through verbatim, don't try to path it.\n\n`status` labels intent: 'normal' when replying to what they just asked; 'proactive' when you're initiating \u2014 a scheduled task finished, a blocker surfaced during background work, you need input on something they haven't asked about. Set it honestly; downstream routing uses it.",
    BRIEF_TOOL_NAME: () => "SendUserMessage",
    BRIEF_PROACTIVE_SECTION: () => BRIEF_PROACTIVE_SECTION,
    BRIEF_ENFORCE_SENTINEL: () => "You ended the turn without calling SendUserMessage."
  });
  var BRIEF_PROACTIVE_SECTION;
  var k2 = __lazy(() => {
    BRIEF_PROACTIVE_SECTION = `## Talking to the user

${"SendUserMessage"} is where your replies go. Text outside it is visible if the user expands the detail view, but most won't \u2014 assume unread. Anything you want them to actually see goes through ${"SendUserMessage"}. The failure mode: the real answer lives in plain text while ${"SendUserMessage"} just says "done!" \u2014 they see "done!" and miss everything.

So: every time the user says something, the reply they actually read comes through ${"SendUserMessage"}. Even for "hi". Even for "thanks".

If you can answer right away, send the answer. If you need to go look \u2014 run a command, read files, check something \u2014 ack first in one line ("On it \u2014 checking the test output"), then work, then send the result. Without the ack they're staring at a spinner.

For longer work: ack \u2192 work \u2192 result. Between those, send a checkpoint when something useful happened \u2014 a decision you made, a surprise you hit, a phase boundary. Skip the filler ("running tests...") \u2014 a checkpoint earns its place by carrying information.

Keep messages tight \u2014 the decision, the file:line, the PR number. Second person always ("your config"), never third.`;
  });
  var Rbe;
  var Ay = __lazy(() => {
    Rbe = class Rbe extends Error {
      constructor(e) {
        super(e);
        this.name = "FileStateError";
      }
    };
  });
  var VOn = {};
  __export(VOn, {
    SEND_USER_FILE_TOOL_PROMPT: () => "Send files to the user. Use this when the file *is* the deliverable \u2014 a generated diagram, a report, a screenshot, a built artifact \u2014 and you want it surfaced, not just mentioned. Paths can be absolute or relative to the current working directory.\n\nAdd a `caption` when a one-liner of context helps (\"the failing case is row 42\", \"before vs after\"). Skip it if the file speaks for itself.\n\nSet `status` on every call. Use `proactive` when you're initiating \u2014 the user is away and you want this to reach their phone (build artifact ready, report generated). Use `normal` when replying to something the user just said.\n\nSet `display` to choose how the file is presented. Use `'render'` when the user should see the content inline in the side panel right now \u2014 a chart, a rendered HTML page, a diagram, an image. Use `'attach'` when the file is something they'll save and open elsewhere \u2014 source code, a spreadsheet, a document for another app \u2014 and an inline preview would just be noise. Leave it unset to let the client decide by file type.\n\nFiles must already exist on the local filesystem \u2014 the tool sends files, it doesn't fetch URLs or render content. When unsure of a path, verify with ls first; absolute paths avoid ambiguity about the working directory.\n\nExample: SendUserFile({ files: [\"report.md\"], caption: \"Here's the report.\", status: \"normal\" })",
    SEND_USER_FILE_TOOL_NAME: () => "SendUserFile",
    DESCRIPTION: () => "Send one or more files to the user"
  });
  function qi(e) {
    let t = Object.hasOwn(Wji, e) ? Wji[e] : undefined;
    if (t) {
      return t;
    }
    if (e.startsWith("mcp__")) {
      return "mcp_tool";
    }
    return e;
  }
  function bh() {
    return st(process.env.OTEL_LOG_TOOL_DETAILS);
  }
  function $at() {
    return st(process.env.OTEL_LOG_TOOL_CONTENT);
  }
  function Gji(e, t) {
    if (process.env.CLAUDE_CODE_ENTRYPOINT === "local-agent") {
      return true;
    }
    if (e === "claudeai-proxy") {
      return true;
    }
    if (t && Fji(t)) {
      return true;
    }
    if (t && M8(t)) {
      return true;
    }
    return false;
  }
  function xbe(e, t) {
    if (RXr.vZc(e)) {
      return true;
    }
    if (t === undefined) {
      return Gji(undefined, undefined);
    }
    if ("url" in t && Bji(t.url)) {
      return true;
    }
    return Gji(t.type, RIe(t));
  }
  function JW(e, t) {
    if (!t) {
      return {};
    }
    let n = JOn(e);
    if (!n) {
      return {};
    }
    return {
      mcpServerName: n.serverName,
      mcpToolName: n.mcpToolName
    };
  }
  function JOn(e) {
    if (!e.startsWith("mcp__")) {
      return;
    }
    let t = e.split("__");
    if (t.length < 3) {
      return;
    }
    let n = t[1];
    let r = t.slice(2).join("__");
    if (!n || !r) {
      return;
    }
    return {
      serverName: n,
      mcpToolName: r
    };
  }
  function xXr(e, t, n) {
    if (e !== "Skill") {
      return;
    }
    if (typeof t === "object" && t !== null && "skill" in t && typeof t.skill === "string") {
      return t.skill;
    }
    return;
  }
  function kXr(e, t) {
    if (e !== "Agent" && e !== "Task") {
      return;
    }
    if (typeof t === "object" && t !== null && "subagent_type" in t && typeof t.subagent_type === "string") {
      return t.subagent_type;
    }
    return;
  }
  function J2t(e, t, n) {
    let r = {};
    if (!bh()) {
      return r;
    }
    let o = e === "Bash" && t !== null && typeof t === "object" && "command" in t && typeof t.command === "string";
    let s = e === Hnt && t !== null && typeof t === "object" && "command" in t && typeof t.command === "string";
    if (o) {
      let c = t;
      let u = c.command.trim().split(/\s+/);
      if (r.bash_command = u[0] || "", r.full_command = c.command, c.timeout !== undefined) {
        r.timeout = c.timeout;
      }
      if (c.description !== undefined) {
        r.description = c.description;
      }
      if ("dangerouslyDisableSandbox" in c) {
        r.dangerouslyDisableSandbox = c.dangerouslyDisableSandbox;
      }
    } else if (s) {
      let c = t;
      let u = c.command.trim().split(/\s+/);
      if (r.bash_command = u[0] || "", r.full_command = c.command, c.timeout_ms !== undefined) {
        r.timeout = c.timeout_ms;
      }
    }
    let i = JOn(e);
    if (i) {
      r.mcp_server_name = i.serverName;
      r.mcp_tool_name = i.mcpToolName;
    }
    let a = xXr(e, t, n);
    if (a) {
      r.skill_name = a;
    }
    let l = kXr(e, t);
    if (l) {
      r.subagent_type = l;
    }
    return r;
  }
  function CXr(e, t = 0) {
    if (typeof e === "string") {
      if (e.length > 512) {
        return `${e.slice(0, 128)}\u2026[${e.length} chars]`;
      }
      return e;
    }
    if (typeof e === "number" || typeof e === "boolean" || e === null || e === undefined) {
      return e;
    }
    if (t >= 2) {
      return "<nested>";
    }
    if (Array.isArray(e)) {
      let n = e.slice(0, 20).map(r => CXr(r, t + 1));
      if (e.length > 20) {
        n.push(`\u2026[${e.length} items]`);
      }
      return n;
    }
    if (typeof e === "object") {
      let n = Object.entries(e).filter(([o]) => !o.startsWith("_"));
      let r = n.slice(0, 20).map(([o, s]) => [o, CXr(s, t + 1)]);
      if (n.length > 20) {
        r.push(["\u2026", `${n.length} keys`]);
      }
      return Object.fromEntries(r);
    }
    return String(e);
  }
  function Yji(e) {
    if (!bh()) {
      return;
    }
    let t = CXr(e);
    let n = De(t);
    if (n.length > 4096) {
      n = n.slice(0, 4096) + "\u2026[truncated]";
    }
    return n;
  }
  function Qj(e) {
    let t = zji.extname(e).toLowerCase();
    if (!t || t === ".") {
      return;
    }
    let n = t.slice(1);
    if (n.length > 10) {
      return "other";
    }
    return n;
  }
  function Jji(e, t) {
    if (!e.includes(".") && !t) {
      return;
    }
    let n;
    let r = new Set();
    if (t) {
      let o = Qj(t);
      if (o) {
        r.add(o);
        n = o;
      }
    }
    for (let o of e.split(OWd)) {
      if (!o) {
        continue;
      }
      let s = o.split(DWd);
      if (s.length < 2) {
        continue;
      }
      let i = s[0];
      let a = i.lastIndexOf("/");
      let l = a >= 0 ? i.slice(a + 1) : i;
      if (!PWd.vZc(l)) {
        continue;
      }
      for (let c = 1; c < s.length; c++) {
        let u = s[c];
        if (u.charCodeAt(0) === 45) {
          continue;
        }
        let d = Qj(u);
        if (d && !r.vZc(d)) {
          r.add(d);
          n = n ? n + "," + d : d;
        }
      }
    }
    if (!n) {
      return;
    }
    return n;
  }
  function XOn(e) {
    if (!e.includes(".")) {
      return;
    }
    let t = new Set();
    for (let r of e.toLowerCase().matchAll(MWd)) {
      t.add(r[1]);
    }
    if (t.size === 0) {
      return;
    }
    let n = [...t].sort().join(",");
    return n;
  }
  function Y2t(e) {
    logEvent("tengu_file_activity", {
      messageID: e.messageID,
      activity: e.activity,
      fileExtension: e.fileExtension,
      toolName: qi(e.toolName),
      isNewFile: e.isNewFile,
      deliverChannel: e.deliverChannel == null ? undefined : e.deliverChannel
    });
  }
  function KOn(e, t, n, r) {
    let o = new Set();
    for (let s of e) {
      let i;
      if (typeof s === "string") {
        i = s;
      } else if (s && typeof s === "object" && "file_name" in s && typeof s.file_name === "string") {
        i = s.file_name;
      } else {
        continue;
      }
      let a = Qj(i);
      if (o.vZc(a)) {
        continue;
      }
      o.add(a);
      Y2t({
        activity: "deliver",
        fileExtension: a,
        toolName: t,
        isNewFile: undefined,
        deliverChannel: n,
        messageID: r
      });
    }
  }
  function Xji(e, t, n) {
    if (!t || typeof t !== "object") {
      return;
    }
    let r = t;
    let o = br(n);
    if (e === "Edit" && typeof r.file_path === "string") {
      Y2t({
        activity: "edit",
        fileExtension: Qj(r.file_path),
        toolName: e,
        isNewFile: r.old_string === "",
        deliverChannel: undefined,
        messageID: o
      });
    } else if (e === "Write" && typeof r.file_path === "string") {
      Y2t({
        activity: "write",
        fileExtension: Qj(r.file_path),
        toolName: e,
        isNewFile: undefined,
        deliverChannel: undefined,
        messageID: o
      });
    } else if (e === "NotebookEdit" && typeof r.notebook_path === "string") {
      Y2t({
        activity: "notebook_edit",
        fileExtension: Qj(r.notebook_path),
        toolName: e,
        isNewFile: false,
        deliverChannel: undefined,
        messageID: o
      });
    } else if ((e === "Bash" || e === Hnt || e === "PowerShell") && typeof r.command === "string") {
      let s = XOn(r.command);
      if (s) {
        for (let i of s.split(",")) {
          Y2t({
            activity: "bash_mention",
            fileExtension: i,
            toolName: e,
            isNewFile: undefined,
            deliverChannel: undefined,
            messageID: o
          });
        }
      }
    } else if (e === "Artifact" && typeof r.file_path === "string") {
      KOn([r.file_path], e, "artifact", o);
    } else if (e === "mcp__cowork__present_files" && Array.isArray(r.filepaths)) {
      KOn(r.filepaths, e, "cowork_present_files", o);
    } else if (e === "SendUserFile" && Array.isArray(r.files)) {
      KOn(r.files, e, "send_user_file", o);
    } else if (e === "SendUserMessage" && Array.isArray(r.attachments)) {
      KOn(r.attachments, e, "brief", o);
    }
  }
  function Qji(e) {
    if (!e) {
      return 0;
    }
    let t = 0;
    for (let n of e) {
      if (n.type !== "user" && n.type !== "assistant") {
        continue;
      }
      let r = n.message.content;
      if (!Array.isArray(r)) {
        continue;
      }
      for (let o of r) {
        if (o.type === "document" || o.type === "image") {
          t += De(o).length;
        }
      }
    }
    return t;
  }
  function uS(e) {
    if (e == null) {
      return "none";
    }
    let t = e.match(LWd);
    if (t) {
      return t[0];
    }
    return "other";
  }
  function L8(e) {
    if (e == null) {
      return "none";
    }
    if (FWd.vZc(e)) {
      return e;
    }
    return "other";
  }
  function UWd() {
    let e = MLt.getStore();
    if (e) {
      let a = {
        agentId: e.agentId,
        parentSessionId: e.parentSessionId,
        agentType: e.agentType
      };
      if (e.parentAgentId) {
        a.parentAgentId = e.parentAgentId;
      }
      if (e.agentType === "teammate") {
        a.teamName = e.teamName;
      }
      return a;
    }
    let t = getAgentId();
    let n = getParentSessionId_export();
    let r = getTeamName();
    let s = isTeammate() ? "teammate" : t ? "standalone" : undefined;
    if (t || s || n || r) {
      return {
        ...(t && {
          agentId: t
        }),
        ...(s && {
          agentType: s
        }),
        ...(n && {
          parentSessionId: n
        }),
        ...(r && {
          teamName: r
        })
      };
    }
    let i = getParentSessionId();
    if (i) {
      return {
        parentSessionId: i
      };
    }
    return {};
  }
  function Zji() {
    return {
      ...G4e
    };
  }
  function $Wd() {
    try {
      let e = process.memoryUsage();
      if (e.rss > G4e.rss) {
        G4e.rss = e.rss;
      }
      if (e.heapUsed > G4e.heapUsed) {
        G4e.heapUsed = e.heapUsed;
      }
      if (e.external > G4e.external) {
        G4e.external = e.external;
      }
      sXr();
      let t = process.cpuUsage();
      let n = Date.now();
      let r;
      if (YOn && wXr) {
        let o = n - wXr;
        if (o > 0) {
          let s = t.user - YOn.user;
          let i = t.system - YOn.system;
          r = (s + i) / (o * 1000) * 100;
        }
      }
      YOn = t;
      wXr = n;
      return {
        uptime: process.uptime(),
        rss: e.rss,
        heapTotal: e.heapTotal,
        heapUsed: e.heapUsed,
        external: e.external,
        arrayBuffers: e.arrayBuffers,
        constrainedMemory: process.constrainedMemory(),
        cpuUsage: t,
        cpuPercent: r
      };
    } catch {
      return;
    }
  }
  async function QOn(e = {}) {
    let t = e.model ? String(e.model) : getMainLoopModel();
    let n = typeof e.betas === "string" ? e.betas : kk(A8(t)).join(",");
    let [r, o, s] = await Promise.all([BWd(), getRepoRemoteHash(), getCachedHead()]);
    let i = $Wd();
    let a = h0e();
    let l = a ? getAttacherCaps() !== null ? "1" : "0" : undefined;
    let c = getRendererModeForAnalytics();
    return {
      model: t,
      sessionId: getSessionId(),
      userType: "external",
      ...(n.length > 0 && {
        betas: n
      }),
      envContext: r,
      ...(process.env.CLAUDE_CODE_ENTRYPOINT && {
        entrypoint: process.env.CLAUDE_CODE_ENTRYPOINT
      }),
      ...(a && {
        sessionKind: a
      }),
      ...(l && {
        hasAttacher: l
      }),
      ...(process.env.CLAUDE_AGENT_SDK_VERSION && {
        agentSdkVersion: process.env.CLAUDE_AGENT_SDK_VERSION
      }),
      isInteractive: String(getIsInteractive()),
      clientType: getClientType(),
      ...(i && {
        processMetrics: i
      }),
      sweBenchRunId: process.env.SWE_BENCH_RUN_ID || "",
      sweBenchInstanceId: process.env.SWE_BENCH_INSTANCE_ID || "",
      sweBenchTaskId: process.env.SWE_BENCH_TASK_ID || "",
      ...UWd(),
      ...(getSubscriptionType() && {
        subscriptionType: getSubscriptionType()
      }),
      ...(o && {
        rh: o
      }),
      ...(s && isConsumerSubscriber() && {
        head_sha: s
      }),
      ...(c && {
        rendererMode: c
      })
    };
  }
  function eqi(e, t, n = {}) {
    let {
      envContext: r,
      processMetrics: o,
      rh: s,
      head_sha: i,
      coachMode: a,
      observerMode: l,
      sessionKind: c,
      hasAttacher: u,
      rendererMode: d,
      subscriptionType: p,
      parentAgentId: m,
      ...f
    } = e;
    let h = {
      platform: r.platform,
      platform_raw: r.platformRaw,
      arch: r.arch,
      node_version: r.nodeVersion,
      terminal: r.terminal || "unknown",
      shell: r.shell,
      package_managers: r.packageManagers,
      runtimes: r.runtimes,
      is_running_with_bun: r.isRunningWithBun,
      is_ci: r.isCi,
      is_claubbit: r.isClaubbit,
      is_claude_code_remote: r.isClaudeCodeRemote,
      is_local_agent_mode: r.isLocalAgentMode,
      is_conductor: r.isConductor,
      is_github_action: r.isGithubAction,
      is_claude_code_action: r.isClaudeCodeAction,
      is_claude_ai_auth: r.isClaudeAiAuth,
      version: r.version,
      build_time: r.buildTime,
      deployment_environment: r.deploymentEnvironment
    };
    if (r.remoteEnvironmentType) {
      h.remote_environment_type = r.remoteEnvironmentType;
    }
    if (r.claudeCodeContainerId) {
      h.claude_code_container_id = r.claudeCodeContainerId;
    }
    if (r.claudeCodeRemoteSessionId) {
      h.claude_code_remote_session_id = r.claudeCodeRemoteSessionId;
    }
    if (r.tags) {
      h.tags = r.tags.split(",").map(_ => _.trim()).filter(Boolean);
    }
    if (r.githubEventName) {
      h.github_event_name = r.githubEventName;
    }
    if (r.githubActionsRunnerEnvironment) {
      h.github_actions_runner_environment = r.githubActionsRunnerEnvironment;
    }
    if (r.githubActionsRunnerOs) {
      h.github_actions_runner_os = r.githubActionsRunnerOs;
    }
    if (r.githubActionRef) {
      h.github_action_ref = r.githubActionRef;
    }
    if (r.wslVersion) {
      h.wsl_version = r.wslVersion;
    }
    if (r.linuxDistroId) {
      h.linux_distro_id = r.linuxDistroId;
    }
    if (r.linuxDistroVersion) {
      h.linux_distro_version = r.linuxDistroVersion;
    }
    if (r.linuxKernel) {
      h.linux_kernel = r.linuxKernel;
    }
    if (r.vcs) {
      h.vcs = r.vcs;
    }
    if (r.versionBase) {
      h.version_base = r.versionBase;
    }
    let g = {
      session_id: f.sessionId,
      model: f.model,
      user_type: f.userType,
      is_interactive: f.isInteractive === "true",
      client_type: f.clientType
    };
    if (f.betas) {
      g.betas = f.betas;
    }
    if (f.entrypoint) {
      g.entrypoint = f.entrypoint;
    }
    if (f.agentSdkVersion) {
      g.agent_sdk_version = f.agentSdkVersion;
    }
    if (f.sweBenchRunId) {
      g.swe_bench_run_id = f.sweBenchRunId;
    }
    if (f.sweBenchInstanceId) {
      g.swe_bench_instance_id = f.sweBenchInstanceId;
    }
    if (f.sweBenchTaskId) {
      g.swe_bench_task_id = f.sweBenchTaskId;
    }
    if (f.agentId) {
      g.agent_id = f.agentId;
    }
    if (f.parentSessionId) {
      g.parent_session_id = f.parentSessionId;
    }
    if (f.agentType) {
      g.agent_type = f.agentType;
    }
    if (f.teamName) {
      g.team_name = f.teamName;
    }
    if (t.githubActionsMetadata) {
      let _ = t.githubActionsMetadata;
      h.github_actions_metadata = {
        actor_id: _.actorId,
        repository_id: _.repositoryId,
        repository_owner_id: _.repositoryOwnerId
      };
    }
    let y;
    if (t.accountUuid || t.organizationUuid) {
      y = {
        account_uuid: t.accountUuid,
        organization_uuid: t.organizationUuid
      };
    }
    return {
      env: h,
      ...(o && {
        process: Buffer.from(De(o)).toString("base64")
      }),
      ...(y && {
        auth: y
      }),
      core: g,
      additional: {
        ...(s && {
          rh: s
        }),
        ...(i && {
          _PROTO_head_sha: i
        }),
        ...(a && {
          coach_mode: a
        }),
        ...(l && {
          observer_mode: l
        }),
        ...(c && {
          session_kind: c
        }),
        ...(u && {
          has_attacher: u
        }),
        ...(d && {
          renderer_mode: d
        }),
        ...(p && {
          subscription_type: p
        }),
        ...(m && {
          parent_agent_id: m
        }),
        ...n
      }
    };
  }
  var zji;
  var Wji;
  var RXr;
  var PWd;
  var OWd;
  var DWd;
  var MWd;
  var LWd;
  var FWd;
  var X2t;
  var BWd;
  var YOn = null;
  var wXr = null;
  var G4e;
  var Gu = __lazy(() => {
    pr();
    YW();
    KN();
    DC();
    Eo();
    at();
    gn();
    Fat();
    mXr();
    Cbe();
    Oce();
    Bat();
    t1();
    k2();
    Ay();
    EC();
    Ot();
    no();
    yd();
    na();
    FP();
    Cs();
    _h();
    qp();
    cJ();
    B_();
    zji = require("path");
    Wji = {
      [Hnt]: "Bash",
      [EOs]: "WebFetch"
    };
    RXr = new Set(["computer-use"]);
    PWd = new Set(["rm", "mv", "cp", "touch", "mkdir", "chmod", "chown", "cat", "head", "tail", "sort", "stat", "diff", "wc", "grep", "rg", "sed"]);
    OWd = /\s*(?:&&|\|\||[;|])\s*/;
    DWd = /\s+/;
    MWd = /\.(csv|docx?|html|json|md|od[pst]|pdf|pptx?|rtf|txt|xlsx?)\b/g;
    LWd = /^\d+\.\d+\.\d+(-(?:dev|alpha|beta|rc|test|nightly)(?![a-z_-])\d{0,8}(?:\.[a-z0-9.]{0,40})?)?/;
    FWd = new Set(["darwin", "linux", "win32", "freebsd", "openbsd", "netbsd", "android", "aix", "sunos", "cygwin", "haiku", "macos", "windows", "wsl", "unknown"]);
    X2t = TEr(() => {
      let e = {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION.match(/^\d+\.\d+\.\d+(?:-[a-z]+)?/);
      return e ? e[0] : undefined;
    });
    BWd = TEr(async () => {
      let [e, t, n, r] = await Promise.all([Me.getPackageManagers(), Me.getRuntimes(), ITs(), OTs()]);
      return {
        platform: RDt(),
        platformRaw: process.env.CLAUDE_CODE_HOST_PLATFORM || "linux",
        arch: Me.arch,
        nodeVersion: Me.nodeVersion,
        terminal: nM.terminal,
        shell: tMr(),
        packageManagers: e.join(","),
        runtimes: t.join(","),
        isRunningWithBun: Me.isRunningWithBun(),
        isCi: st(false),
        isClaubbit: Me.CLAUBBIT,
        isClaudeCodeRemote: st(process.env.CLAUDE_CODE_REMOTE),
        isLocalAgentMode: process.env.CLAUDE_CODE_ENTRYPOINT === "local-agent",
        isConductor: Me.isConductor(),
        ...(process.env.CLAUDE_CODE_REMOTE_ENVIRONMENT_TYPE && {
          remoteEnvironmentType: process.env.CLAUDE_CODE_REMOTE_ENVIRONMENT_TYPE
        }),
        ...{},
        ...(process.env.CLAUDE_CODE_CONTAINER_ID && {
          claudeCodeContainerId: process.env.CLAUDE_CODE_CONTAINER_ID
        }),
        ...(process.env.CLAUDE_CODE_REMOTE_SESSION_ID && {
          claudeCodeRemoteSessionId: process.env.CLAUDE_CODE_REMOTE_SESSION_ID
        }),
        ...(process.env.CLAUDE_CODE_TAGS && {
          tags: process.env.CLAUDE_CODE_TAGS
        }),
        isGithubAction: st(process.env.GITHUB_ACTIONS),
        isClaudeCodeAction: st(process.env.CLAUDE_CODE_ACTION),
        isClaudeAiAuth: isClaudeAISubscriber(),
        version: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION,
        versionBase: X2t(),
        buildTime: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.BUILD_TIME,
        deploymentEnvironment: Me.detectDeploymentEnvironment(),
        ...(st(process.env.GITHUB_ACTIONS) && {
          githubEventName: process.env.GITHUB_EVENT_NAME,
          githubActionsRunnerEnvironment: process.env.RUNNER_ENVIRONMENT,
          githubActionsRunnerOs: process.env.RUNNER_OS,
          githubActionRef: process.env.GITHUB_ACTION_PATH?.includes("claude-code-action/") ? process.env.GITHUB_ACTION_PATH.split("claude-code-action/")[1] : undefined
        }),
        ...(DHe() && {
          wslVersion: DHe()
        }),
        ...(n ?? {}),
        ...(r.length > 0 && {
          vcs: r.join(",")
        })
      };
    });
    G4e = {
      rss: 0,
      heapUsed: 0,
      external: 0
    };
  });
  function Q2t() {
    return ZOn.join(er(), "telemetry");
  }
  class AXr {
    endpoint;
    timeout;
    maxBatchSize;
    skipAuth;
    batchDelayMs;
    baseBackoffDelayMs;
    maxBackoffDelayMs;
    maxAttempts;
    isKilled;
    pendingExports = [];
    isShutdown = false;
    schedule;
    cancelBackoff = null;
    attempts = 0;
    isRetrying = false;
    lastExportErrorContext;
    constructor(e = {}) {
      let t = e.baseUrl || (process.env.ANTHROPIC_BASE_URL === "https://api-staging.anthropic.com" ? "https://api-staging.anthropic.com" : "https://api.anthropic.com");
      this.endpoint = `${t}${e.path || "/api/event_logging/v2/batch"}`;
      this.timeout = e.timeout || 1e4;
      this.maxBatchSize = e.maxBatchSize || 200;
      this.skipAuth = e.skipAuth ?? false;
      this.batchDelayMs = e.batchDelayMs || 100;
      this.baseBackoffDelayMs = e.baseBackoffDelayMs || 500;
      this.maxBackoffDelayMs = e.maxBackoffDelayMs || 30000;
      this.maxAttempts = e.maxAttempts ?? 8;
      this.isKilled = e.isKilled ?? (() => false);
      this.schedule = e.schedule ?? ((n, r) => {
        let o = setTimeout(n, r);
        return () => clearTimeout(o);
      });
      this.retryPreviousBatches();
    }
    async getQueuedEventCount() {
      return (await this.loadEventsFromCurrentBatch()).length;
    }
    getCurrentBatchFilePath() {
      return ZOn.join(Q2t(), `${"1p_failed_events."}${getSessionId()}.${tqi}.json`);
    }
    async loadEventsFromFile(e) {
      try {
        return await knt(e);
      } catch {
        return [];
      }
    }
    async loadEventsFromCurrentBatch() {
      return this.loadEventsFromFile(this.getCurrentBatchFilePath());
    }
    async saveEventsToFile(e, t) {
      try {
        if (t.length === 0) {
          try {
            await _J.unlink(e);
          } catch {}
        } else {
          await _J.mkdir(Q2t(), {
            recursive: true
          });
          let n = t.map(r => De(r)).join(`
`) + `
`;
          await _J.writeFile(e, n, "utf8");
        }
      } catch (n) {
        logForDebugging(`1P event logging: failed to persist failed-events batch to ${e}: ${he(n)}`, {
          level: "error"
        });
      }
    }
    async appendEventsToFile(e, t) {
      if (t.length === 0) {
        return;
      }
      try {
        await _J.mkdir(Q2t(), {
          recursive: true
        });
        let n = t.map(r => De(r)).join(`
`) + `
`;
        await _J.appendFile(e, n, "utf8");
      } catch (n) {
        logForDebugging(`1P event logging: failed to persist failed-event queue to ${e}: ${he(n)}`, {
          level: "error"
        });
      }
    }
    async deleteFile(e) {
      try {
        await _J.unlink(e);
      } catch {}
    }
    async retryPreviousBatches() {
      try {
        let e = `${"1p_failed_events."}${getSessionId()}.`;
        let t;
        try {
          t = (await _J.readdir(Q2t())).filter(n => n.startsWith(e) && n.endsWith(".json")).filter(n => !n.includes(tqi));
        } catch (n) {
          if (Io(n)) {
            return;
          }
          throw n;
        }
        for (let n of t) {
          let r = ZOn.join(Q2t(), n);
          this.retryFileInBackground(r);
        }
      } catch (e) {
        Oe(e);
      }
    }
    async retryFileInBackground(e) {
      if (this.attempts >= this.maxAttempts) {
        await this.deleteFile(e);
        return;
      }
      let t = await this.loadEventsFromFile(e);
      if (t.length === 0) {
        await this.deleteFile(e);
        return;
      }
      let n = await this.sendEventsInBatches(t);
      if (n.length === 0) {
        await this.deleteFile(e);
      } else {
        await this.saveEventsToFile(e, n);
      }
    }
    async export(e, t) {
      if (this.isShutdown) {
        t({
          code: AIe.ExportResultCode.FAILED,
          error: Error("Exporter has been shutdown")
        });
        return;
      }
      let n = this.doExport(e, t);
      this.pendingExports.push(n);
      n.finally(() => {
        let r = this.pendingExports.indexOf(n);
        if (r > -1) {
          this.pendingExports.splice(r, 1);
        }
      });
    }
    async doExport(e, t) {
      try {
        let n = e.filter(s => s.instrumentationScope?.name === "com.anthropic.claude_code.events");
        if (n.length === 0) {
          t({
            code: AIe.ExportResultCode.SUCCESS
          });
          return;
        }
        let r = this.transformLogsToEvents(n).events;
        if (r.length === 0) {
          t({
            code: AIe.ExportResultCode.SUCCESS
          });
          return;
        }
        if (this.attempts >= this.maxAttempts) {
          t({
            code: AIe.ExportResultCode.FAILED,
            error: Error(`Dropped ${r.length} events: max attempts (${this.maxAttempts}) reached`)
          });
          return;
        }
        let o = await this.sendEventsInBatches(r);
        if (this.attempts++, o.length > 0) {
          await this.queueFailedEvents(o);
          this.scheduleBackoffRetry();
          let s = this.lastExportErrorContext ? ` (${this.lastExportErrorContext})` : "";
          t({
            code: AIe.ExportResultCode.FAILED,
            error: Error(`Failed to export ${o.length} events${s}`)
          });
          return;
        }
        if (this.resetBackoff(), (await this.getQueuedEventCount()) > 0 && !this.isRetrying) {
          this.retryFailedEvents();
        }
        t({
          code: AIe.ExportResultCode.SUCCESS
        });
      } catch (n) {
        Oe(n);
        t({
          code: AIe.ExportResultCode.FAILED,
          error: sr(n)
        });
      }
    }
    async sendEventsInBatches(e) {
      let t = [];
      for (let o = 0; o < e.length; o += this.maxBatchSize) {
        t.push(e.slice(o, o + this.maxBatchSize));
      }
      let n = [];
      let r;
      for (let o = 0; o < t.length; o++) {
        let s = t[o];
        try {
          await this.sendBatchWithRetry({
            events: s
          });
        } catch (i) {
          r = HWd(i);
          for (let a = o; a < t.length; a++) {
            n.push(...t[a]);
          }
          break;
        }
        if (o < t.length - 1 && this.batchDelayMs > 0) {
          await sleep(this.batchDelayMs);
        }
      }
      if (n.length > 0 && r) {
        this.lastExportErrorContext = r;
      }
      return n;
    }
    async queueFailedEvents(e) {
      let t = this.getCurrentBatchFilePath();
      await this.appendEventsToFile(t, e);
      let n = this.lastExportErrorContext ? ` (${this.lastExportErrorContext})` : "";
      logForDebugging(`1P event logging: ${e.length} events failed to export${n}`, {
        level: "error"
      });
    }
    scheduleBackoffRetry() {
      if (this.cancelBackoff || this.isRetrying || this.isShutdown) {
        return;
      }
      let e = Math.min(this.baseBackoffDelayMs * this.attempts * this.attempts, this.maxBackoffDelayMs);
      this.cancelBackoff = this.schedule(async () => {
        this.cancelBackoff = null;
        await this.retryFailedEvents();
      }, e);
    }
    async retryFailedEvents() {
      let e = this.getCurrentBatchFilePath();
      while (!this.isShutdown) {
        let t = await this.loadEventsFromFile(e);
        if (t.length === 0) {
          break;
        }
        if (this.attempts >= this.maxAttempts) {
          await this.deleteFile(e);
          this.resetBackoff();
          return;
        }
        this.isRetrying = true;
        await this.deleteFile(e);
        let n = await this.sendEventsInBatches(t);
        if (this.attempts++, this.isRetrying = false, n.length > 0) {
          await this.saveEventsToFile(e, n);
          this.scheduleBackoffRetry();
          return;
        }
        this.resetBackoff();
      }
    }
    resetBackoff() {
      if (this.attempts = 0, this.cancelBackoff) {
        this.cancelBackoff();
        this.cancelBackoff = null;
      }
    }
    async sendBatchWithRetry(e) {
      if (this.isKilled()) {
        throw Error("firstParty sink killswitch active");
      }
      let t = {
        "Content-Type": "application/json",
        "User-Agent": dg(),
        "x-service-name": "claude-code"
      };
      let n = checkHasTrustDialogAccepted() || getIsNonInteractiveSession();
      let r = this.skipAuth || !n;
      if (!r && isClaudeAISubscriber()) {
        let a = getClaudeAIOAuthTokens();
        if (!hasProfileScope()) {
          r = true;
        } else if (a && isOAuthTokenExpired(a.expiresAt)) {
          r = true;
        }
      }
      let o = r ? {
        headers: {},
        error: "trust not established or Oauth token expired"
      } : getAuthHeaders();
      let s = !o.error;
      let i = s ? {
        ...t,
        ...o.headers
      } : t;
      try {
        let a = await NP.post(this.endpoint, e, {
          timeout: this.timeout,
          headers: i
        });
        this.logSuccess(e.events.length, s, a.data);
        return;
      } catch (a) {
        if (s && NP.isAxiosError(a) && a.response?.status === 401) {
          let l = await NP.post(this.endpoint, e, {
            timeout: this.timeout,
            headers: t
          });
          this.logSuccess(e.events.length, false, l.data);
          return;
        }
        throw a;
      }
    }
    logSuccess(e, t, n) {}
    hrTimeToDate(e) {
      let [t, n] = e;
      return new Date(t * 1000 + n / 1e6);
    }
    transformLogsToEvents(e) {
      let t = [];
      for (let n of e) {
        let r = n.attributes || {};
        if (r.event_type === "GrowthbookExperimentEvent") {
          let g = this.hrTimeToDate(n.hrTime);
          let y = r.account_uuid;
          let _ = r.organization_uuid;
          t.push({
            event_type: "GrowthbookExperimentEvent",
            event_data: QJr.toJSON({
              event_id: r.event_id,
              timestamp: g,
              experiment_id: r.experiment_id,
              variation_id: r.variation_id,
              environment: r.environment,
              user_attributes: r.user_attributes,
              experiment_metadata: r.experiment_metadata,
              device_id: r.device_id,
              session_id: r.session_id,
              auth: y || _ ? {
                account_uuid: y,
                organization_uuid: _
              } : undefined
            })
          });
          continue;
        }
        let o = r.event_name || n.body || "unknown";
        let s = r.core_metadata;
        let i = r.user_metadata;
        let a = r.event_metadata || {};
        if (!s) {
          t.push({
            event_type: "ClaudeCodeInternalEvent",
            event_data: AOn.toJSON({
              event_id: r.event_id,
              event_name: o,
              client_timestamp: this.hrTimeToDate(n.hrTime),
              session_id: getSessionId(),
              additional_metadata: Buffer.from(De({
                transform_error: "core_metadata attribute is missing"
              })).toString("base64")
            })
          });
          continue;
        }
        let l = eqi(s, i, a);
        let {
          _PROTO_skill_name: c,
          _PROTO_plugin_name: u,
          _PROTO_marketplace_name: d,
          _PROTO_code: p,
          _PROTO_head_sha: m,
          ...f
        } = l.additional;
        let h = stripProtoFields(f);
        t.push({
          event_type: "ClaudeCodeInternalEvent",
          event_data: AOn.toJSON({
            event_id: r.event_id,
            event_name: o,
            client_timestamp: this.hrTimeToDate(n.hrTime),
            device_id: r.user_id,
            email: i?.email,
            auth: l.auth,
            ...l.core,
            env: l.env,
            process: l.process,
            skill_name: typeof c === "string" ? c : undefined,
            plugin_name: typeof u === "string" ? u : undefined,
            marketplace_name: typeof d === "string" ? d : undefined,
            repl_code: typeof p === "string" ? p : undefined,
            head_sha: typeof m === "string" ? m : undefined,
            additional_metadata: Object.keys(h).length > 0 ? Buffer.from(De(h)).toString("base64") : undefined
          })
        });
      }
      return {
        events: t
      };
    }
    async shutdown() {
      this.isShutdown = true;
      this.resetBackoff();
      await this.forceFlush();
    }
    async forceFlush() {
      await Promise.all(this.pendingExports);
    }
  }
  function HWd(e) {
    if (!NP.isAxiosError(e)) {
      return he(e);
    }
    let t = [];
    let n = e.response?.headers?.["request-id"];
    if (n) {
      t.push(`request-id=${n}`);
    }
    if (e.response?.status) {
      t.push(`status=${e.response.status}`);
    }
    if (e.code) {
      t.push(`code=${e.code}`);
    }
    if (e.message) {
      t.push(e.message);
    }
    return t.join(", ");
  }
  var AIe;
  var rqi;
  var _J;
  var ZOn;
  var tqi;
  var oqi = __lazy(() => {
    Dp();
    at();
    dji();
    mji();
    no();
    je();
    gn();
    dt();
    YA();
    Gd();
    Rn();
    qP();
    Ot();
    Gu();
    AIe = __toESM(Gg(), 1);
    rqi = require("crypto");
    _J = require("fs/promises");
    ZOn = __toESM(require("path"));
    tqi = rqi.randomUUID();
  });
  function V4e(e) {
    return getDynamicConfig_CACHED_MAY_BE_STALE("tengu_frond_boric", {})?.[e] === true;
  }
  var IXr = __lazy(() => {
    $n();
  });
  var z4e = {};