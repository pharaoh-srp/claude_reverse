  __export(P1r, {
    isPreAskDeny: () => isPreAskDeny,
    SANDBOX_AUTO_ALLOW_REASON: () => "Auto-allowed with sandbox (autoAllowBashIfSandboxed enabled)",
    READ_ONLY_AUTO_ALLOW_REASON: () => "Read-only command is allowed",
    INTERNAL_PERMISSION_MODES: () => INTERNAL_PERMISSION_MODES,
    PERMISSION_DECISION_REASON_TYPES: () => PERMISSION_DECISION_REASON_TYPES,
    INTERNAL_PERMISSION_MODES: () => INTERNAL_PERMISSION_MODES,
    HOOK_REWRITTEN_INPUT_ASK_REASON: () => "ask rule on hook-rewritten input",
    HOOK_REWRITE_HEADLESS_DENY_REASON: () => HOOK_REWRITE_HEADLESS_DENY_REASON,
    EXTERNAL_PERMISSION_MODES: () => EXTERNAL_PERMISSION_MODES,
    CLASSIFIER_UNAVAILABLE_REASON: () => "Classifier unavailable",
    CLASSIFIER_TRANSCRIPT_TOO_LONG_REASON: () => "Auto mode classifier transcript exceeded context window \u2014 falling back to manual approval (try /compact to reduce conversation size)",
    BASH_PROMPT_RULE_DENY_PREFIX: () => "Denied by Bash prompt rule"
  });
  function isPreAskDeny(e) {
    return e.decideLocation === "pre-ask";
  }
  var EXTERNAL_PERMISSION_MODES;
  var INTERNAL_PERMISSION_MODES;
  var PERMISSION_DECISION_REASON_TYPES;
  var HOOK_REWRITE_HEADLESS_DENY_REASON;
  function myn(e, t) {
    if (!e) {
      return;
    }
    if (t === "auto" && e === "acceptEdits") {
      return;
    }
    return KPs[e] <= KPs[t] ? e : undefined;
  }
  function Mnt(e) {
    return e !== "bubble";
  }
  function fyn(e) {
    return YPs[e] ?? YPs.default;
  }
  function qA(e) {
    return fyn(e).external;
  }
  function uF(e) {
    return INTERNAL_PERMISSION_MODES.includes(e) ? e : "default";
  }
  function mY(e) {
    return fyn(e).title;
  }
  function XPs(e) {
    return e === "default" || e === undefined;
  }
  function Nnt(e, t) {
    if (e === "auto") {
      return "classify";
    }
    if (e === "bypassPermissions" || e === "plan" && t) {
      return "allow";
    }
    if (e === "dontAsk") {
      return "deny";
    }
    return "ask";
  }
  function Lnt(e) {
    return fyn(e).symbol;
  }
  function dF(e) {
    return fyn(e).color;
  }
  var JPs;
  var AMt;
  var KPs;
  var YPs;
  var HT = __lazy(() => {
    wl();
    JPs = we(() => Ghs.enum(INTERNAL_PERMISSION_MODES));
    AMt = we(() => Ghs.enum(EXTERNAL_PERMISSION_MODES));
    KPs = {
      plan: 0,
      bubble: 1,
      default: 1,
      dontAsk: 1,
      acceptEdits: 2,
      auto: 3,
      bypassPermissions: 4
    };
    YPs = {
      default: {
        title: "Default",
        shortTitle: "Default",
        symbol: "",
        color: "text",
        external: "default"
      },
      plan: {
        title: "Plan Mode",
        shortTitle: "Plan",
        symbol: "\u23F8",
        color: "planMode",
        external: "plan"
      },
      acceptEdits: {
        title: "Accept edits",
        shortTitle: "Accept",
        symbol: "\u23F5\u23F5",
        color: "autoAccept",
        external: "acceptEdits"
      },
      bypassPermissions: {
        title: "Bypass Permissions",
        shortTitle: "Bypass",
        symbol: "\u23F5\u23F5",
        color: "error",
        external: "bypassPermissions"
      },
      dontAsk: {
        title: "Don't Ask",
        shortTitle: "DontAsk",
        symbol: "\u23F5\u23F5",
        color: "error",
        external: "dontAsk"
      },
      auto: {
        title: "Auto mode",
        shortTitle: "Auto",
        symbol: "\u23F5\u23F5",
        color: "warning",
        external: "auto"
      }
    };
  });
  var HOOK_EVENTS;
  var EXIT_REASONS;
  var hyn = __lazy(() => {
    HOOK_EVENTS = ["PreToolUse", "PostToolUse", "PostToolUseFailure", "PostToolBatch", "Notification", "UserPromptSubmit", "UserPromptExpansion", "SessionStart", "SessionEnd", "Stop", "StopFailure", "SubagentStart", "SubagentStop", "PreCompact", "PostCompact", "PermissionRequest", "PermissionDenied", "Setup", "TeammateIdle", "TaskCreated", "TaskCompleted", "Elicitation", "ElicitationResult", "ConfigChange", "WorktreeCreate", "WorktreeRemove", "InstructionsLoaded", "CwdChanged", "FileChanged", "MessageDisplay"];
    EXIT_REASONS = ["clear", "resume", "logout", "prompt_input_exit", "other", "bypass_permissions_disabled"];
  });
  function foldSessionSummary(e, t, n, r) {
    let o = r?.mtime ?? e?.mtime ?? 0;
    let s = e !== undefined ? {
      sessionId: e.sessionId,
      mtime: o,
      data: {
        ...e.data
      }
    } : {
      sessionId: t.sessionId,
      mtime: o,
      data: {}
    };
    let i = s.data;
    for (let a of n) {
      let l = NWu(a.timestamp);
      if (i.isSidechain === undefined) {
        i.isSidechain = a.isSidechain === true;
      }
      if (i.createdAt === undefined && l !== undefined) {
        i.createdAt = l;
      }
      if (i.cwd === undefined) {
        let c = a.cwd;
        if (typeof c === "string" && c) {
          i.cwd = c;
        }
      }
      LWu(i, a);
      for (let [c, u] of Object.entries(DWu)) {
        let d = a[c];
        if (typeof d === "string") {
          i[u] = d;
        }
      }
      if (a.type === "tag") {
        let c = a.tag;
        if (typeof c === "string" && c) {
          i.tag = c;
        } else {
          delete i.tag;
        }
      }
      if (a.type === "relocated") {
        let c = a.relocatedCwd;
        if (typeof c === "string" && c) {
          i.cwd = c;
        }
      }
    }
    return s;
  }
  function ZPs(e, t) {
    let n = e.data;
    if (n.isSidechain === true) {
      return null;
    }
    let r = Mke(n.firstPromptLocked === true ? n.firstPrompt : n.commandFallback) || undefined;
    let o = Mke(n.customTitle) || Mke(n.aiTitle) || undefined;
    let s = o || Mke(n.lastPrompt) || Mke(n.summaryHint) || r;
    if (!s) {
      return null;
    }
    return {
      sessionId: e.sessionId,
      summary: s,
      lastModified: e.mtime,
      fileSize: undefined,
      customTitle: o,
      firstPrompt: r,
      gitBranch: Mke(n.gitBranch) || undefined,
      cwd: Mke(n.cwd) || t || undefined,
      tag: Mke(n.tag) || undefined,
      createdAt: MWu(n.createdAt)
    };
  }
  function Mke(e) {
    return typeof e === "string" ? e : undefined;
  }
  function MWu(e) {
    return typeof e === "number" ? e : undefined;
  }
  function NWu(e) {
    if (typeof e !== "string") {
      return;
    }
    let t = Date.parse(e);
    return Number.isNaN(t) ? undefined : t;
  }
  function LWu(e, t) {
    if (e.firstPromptLocked) {
      return;
    }
    let n = {
      commandFallback: e.commandFallback ?? ""
    };
    let r = rje(t, n);
    if (n.commandFallback && !e.commandFallback) {
      e.commandFallback = n.commandFallback;
    }
    if (r !== undefined) {
      e.firstPrompt = r;
      e.firstPromptLocked = true;
    }
  }
  var DWu;
  var PMt = __lazy(() => {
    egn();
    DWu = {
      customTitle: "customTitle",
      aiTitle: "aiTitle",
      lastPrompt: "lastPrompt",
      summary: "summaryHint",
      gitBranch: "gitBranch"
    };
  });
  class InMemorySessionStore {
    store = new Map();
    mtimes = new Map();
    summaries = new Map();
    lastMtime = 0;
    keyToString(e) {
      let t = [e.projectKey, e.sessionId];
      if (e.subpath) {
        t.push(e.subpath);
      }
      return t.join("/");
    }
    async append(e, t) {
      let n = this.keyToString(e);
      let r = this.store.get(n) ?? [];
      r.push(...t);
      this.store.set(n, r);
      let o = Math.max(Date.now(), this.lastMtime + 1);
      if (this.lastMtime = o, this.mtimes.set(n, o), e.subpath === undefined) {
        let s = `${e.projectKey}/${e.sessionId}`;
        let i = foldSessionSummary(this.summaries.get(s), e, t, {
          mtime: o
        });
        this.summaries.set(s, i);
      }
    }
    async load(e) {
      let t = this.keyToString(e);
      return this.store.get(t) ?? null;
    }
    async listSessions(e) {
      let t = [];
      let n = e + "/";
      for (let [r] of this.store) {
        if (r.startsWith(n)) {
          let o = r.slice(n.length);
          if (!o.includes("/")) {
            t.push({
              sessionId: o,
              mtime: this.mtimes.get(r) ?? 0
            });
          }
        }
      }
      return t;
    }
    async listSessionSummaries(e) {
      let t = [];
      let n = e + "/";
      for (let [r, o] of this.summaries) {
        if (r.startsWith(n)) {
          t.push(o);
        }
      }
      return t;
    }
    async delete(e) {
      let t = this.keyToString(e);
      if (this.store.delete(t), this.mtimes.delete(t), e.subpath === undefined) {
        this.summaries.delete(`${e.projectKey}/${e.sessionId}`);
        let n = `${e.projectKey}/${e.sessionId}/`;
        for (let r of this.store.keys()) {
          if (r.startsWith(n)) {
            this.store.delete(r);
            this.mtimes.delete(r);
          }
        }
      }
    }
    async listSubkeys(e) {
      let t = `${e.projectKey}/${e.sessionId}/`;
      let n = [];
      for (let r of this.store.keys()) {
        if (r.startsWith(t)) {
          n.push(r.slice(t.length));
        }
      }
      return n;
    }
    getEntries(e) {
      return this.store.get(this.keyToString(e)) ?? [];
    }
    get size() {
      let e = 0;
      for (let t of this.store.keys()) {
        let n = t.indexOf("/");
        if (n !== -1 && !t.slice(n + 1).includes("/")) {
          e++;
        }
      }
      return e;
    }
    clear() {
      this.store.clear();
      this.mtimes.clear();
      this.summaries.clear();
    }
  }
  var O1r = __lazy(() => {
    PMt();
  });
  var eOs = () => {};
  var AbortError;
  var qte = __lazy(() => {
    O1r();
    PMt();
    hyn();
    eOs();
    AbortError = class pF extends Error {};
  });
  var tOs;
  var nOs = __lazy(() => {
    tOs = ["bash", "powershell"];
  });
  function FWu() {
    let e = v.object({
      type: v.literal("command").describe("Shell command hook type"),
      command: v.string().describe("Shell command to execute"),
      args: v.array(v.string()).optional().describe("Argument list for exec form. When present, `command` is resolved as " + "an executable and spawned directly with these arguments \u2014 no shell. " + "Path placeholders like ${CLAUDE_PLUGIN_ROOT} are substituted per-element as plain strings, so paths with quotes, $, or backticks never reach a shell parser. When absent, `command` runs through a shell (bash on POSIX, PowerShell on Windows without Git Bash)."),
      if: OMt(),
      shell: v.enum(tOs).optional().describe("Shell interpreter. 'bash' uses your $SHELL (bash/zsh/sh); 'powershell' uses pwsh. Defaults to bash (powershell on Windows without Git Bash)."),
      timeout: v.number().positive().optional().describe("Timeout in seconds for this specific command"),
      statusMessage: v.string().optional().describe("Custom status message to display in spinner while hook runs"),
      once: v.boolean().optional().describe("If true, hook runs once and is removed after execution"),
      async: v.boolean().optional().describe("If true, hook runs in background without blocking"),
      asyncRewake: v.boolean().optional().describe("If true, hook runs in background and wakes the model on exit code 2 (blocking error). Implies async."),
      rewakeMessage: v.string().min(1).optional().describe("@internal Custom prefix for the system-reminder shown to the model when an asyncRewake hook exits with code 2. The hook output is appended after this prefix."),
      rewakeSummary: v.string().min(1).optional().describe('@internal One-line summary shown to the user in the terminal when an asyncRewake hook exits with code 2. Defaults to "Stop hook feedback".')
    });
    let t = v.object({
      type: v.literal("prompt").describe("LLM prompt hook type"),
      prompt: v.string().describe("Prompt to evaluate with LLM. Use $ARGUMENTS placeholder for hook input JSON."),
      if: OMt(),
      timeout: v.number().positive().optional().describe("Timeout in seconds for this specific prompt evaluation"),
      model: v.string().optional().describe('Model to use for this prompt hook (e.g., "claude-sonnet-5"). If not specified, uses the default small fast model.'),
      continueOnBlock: v.boolean().optional().describe(`Sets the continue value for the decision:"block" produced when ok is false. Default false (turn ends). Whether continue:true lets the turn proceed depends on the event's decision:"block" semantics. On PostToolUse, the reason is fed back to Claude and the turn continues.`),
      statusMessage: v.string().optional().describe("Custom status message to display in spinner while hook runs"),
      once: v.boolean().optional().describe("If true, hook runs once and is removed after execution")
    });
    let n = v.object({
      type: v.literal("mcp_tool").describe("MCP tool hook type"),
      server: v.string().describe("Name of an already-configured MCP server to invoke"),
      tool: v.string().describe("Name of the tool on that server to call"),
      input: v.record(v.string(), v.unknown()).optional().describe('Arguments passed to the MCP tool. String values support ${path} interpolation from the hook input JSON (e.g. "${tool_input.file_path}").'),
      if: OMt(),
      timeout: v.number().positive().optional().describe("Timeout in seconds for this specific tool call"),
      statusMessage: v.string().optional().describe("Custom status message to display in spinner while hook runs"),
      once: v.boolean().optional().describe("If true, hook runs once and is removed after execution")
    });
    let r = v.object({
      type: v.literal("http").describe("HTTP hook type"),
      url: v.string().url().describe("URL to POST the hook input JSON to"),
      if: OMt(),
      timeout: v.number().positive().optional().describe("Timeout in seconds for this specific request"),
      headers: v.record(v.string(), v.string()).optional().describe('Additional headers to include in the request. Values may reference environment variables using $VAR_NAME or ${VAR_NAME} syntax (e.g., "Authorization": "Bearer $MY_TOKEN"). Only variables listed in allowedEnvVars will be interpolated.'),
      allowedEnvVars: v.array(v.string()).optional().describe("Explicit list of environment variable names that may be interpolated in header values. Only variables listed here will be resolved; all other $VAR references are left as empty strings. Required for env var interpolation to work."),
      statusMessage: v.string().optional().describe("Custom status message to display in spinner while hook runs"),
      once: v.boolean().optional().describe("If true, hook runs once and is removed after execution")
    });
    let o = v.object({
      type: v.literal("agent").describe("Agentic verifier hook type"),
      prompt: v.string().describe('Prompt describing what to verify (e.g. "Verify that unit tests ran and passed."). Use $ARGUMENTS placeholder for hook input JSON.'),
      if: OMt(),
      timeout: v.number().positive().optional().describe("Timeout in seconds for agent execution (default 60)"),
      model: v.string().optional().describe('Model to use for this agent hook (e.g., "claude-sonnet-5"). If not specified, uses Haiku.'),
      statusMessage: v.string().optional().describe("Custom status message to display in spinner while hook runs"),
      once: v.boolean().optional().describe("If true, hook runs once and is removed after execution")
    });
    return {
      BashCommandHookSchema: e,
      PromptHookSchema: t,
      HttpHookSchema: r,
      AgentHookSchema: o,
      McpToolHookSchema: n
    };
  }
  function M1r(e) {
    if (typeof e !== "object" || e === null || Array.isArray(e)) {
      return {
        hooks: undefined,
        invalid: [{
          path: "hooks",
          reason: `must be an object mapping hook event names to matcher arrays; received ${rOs(e)}`
        }]
      };
    }
    let t = new Set(HOOK_EVENTS);
    let n = v.array(D1r());
    let r = Object.entries(e).map(([s, i]) => {
      if (!t.vZc(s)) {
        return {
          invalid: {
            path: `hooks.${s}`,
            reason: `unknown hook event. Valid events: ${HOOK_EVENTS.join(", ")}`
          }
        };
      }
      let a = n.safeParse(i);
      if (a.success) {
        return {
          entry: [s, a.data]
        };
      }
      let l = Array.isArray(i) ? a.error.issues.map(c => c.path.length > 0 ? `${c.path.join(".")}: ${c.message}` : c.message).join("; ") : `must be an array of matchers; received ${rOs(i)}`;
      return {
        invalid: {
          path: `hooks.${s}`,
          reason: l
        }
      };
    });
    let o = r.flatMap(s => s.entry ? [s.entry] : []);
    return {
      hooks: o.length > 0 ? Object.fromEntries(o) : undefined,
      invalid: r.flatMap(s => s.invalid ? [s.invalid] : [])
    };
  }
  function rOs(e) {
    if (e === null) {
      return "null";
    }
    if (Array.isArray(e)) {
      return "an array";
    }
    return `a ${typeof e}`;
  }
  var OMt;
  var oOs;
  var D1r;
  var cW;
  var DMt = __lazy(() => {
    qte();
    nOs();
    OMt = we(() => v.string().optional().describe('Permission rule syntax to filter when this hook runs (e.g., "Bash(git *)"). Only runs if the tool call matches the pattern. Avoids spawning hooks for non-matching commands.'));
    oOs = we(() => {
      let {
        BashCommandHookSchema: e,
        PromptHookSchema: t,
        AgentHookSchema: n,
        HttpHookSchema: r,
        McpToolHookSchema: o
      } = FWu();
      return v.discriminatedUnion("type", [e, t, n, r, o]);
    });
    D1r = we(() => v.object({
      matcher: v.string().optional().describe('String pattern to match (e.g. tool names like "Write")'),
      hooks: v.array(oOs()).describe("List of hooks to execute when the matcher matches")
    }));
    cW = we(() => v.partialRecord(v.enum(HOOK_EVENTS), v.array(D1r())));
  });
  var N1r;
  var zAh;
  var Fnt;
  var Nke;
  var MMt;
  var UWu;
  var sOs;
  var iOs;
  var L1r;
  var BWu;
  var $Wu;
  var yyn;
  var F1r;
  var U1r;
  var NMt;
  var B1r;
  var vle;
  var KAh;
  var Lke = __lazy(() => {
    N1r = we(() => v.enum(["local", "user", "project", "dynamic", "enterprise", "claudeai", "managed", "agent"]));
    zAh = we(() => v.enum(["stdio", "sse", "sse-ide", "http", "ws", "sdk"]));
    Fnt = we(() => v.literal("comms").optional().catch(undefined));
    Nke = we(() => v.number().int().positive());
    MMt = we(() => v.object({
      type: v.literal("stdio").optional(),
      command: v.string().min(1, "Command cannot be empty"),
      args: v.array(v.string()).default([]),
      env: v.record(v.string(), v.string()).optional(),
      timeout: Nke().optional(),
      alwaysLoad: v.boolean().optional(),
      role: Fnt()
    }));
    UWu = we(() => v.boolean());
    sOs = we(() => v.object({
      clientId: v.string().optional(),
      callbackPort: v.number().int().positive().optional(),
      authServerMetadataUrl: v.string().url().startsWith("https://", {
        message: "authServerMetadataUrl must use https://"
      }).optional(),
      scopes: v.string().min(1).optional(),
      xaa: UWu().optional()
    }));
    iOs = we(() => v.object({
      name: v.string(),
      permission_policy: v.enum(["always_allow", "always_ask", "always_deny"]).optional()
    }));
    L1r = we(() => v.object({
      type: v.literal("sse"),
      url: v.string(),
      headers: v.record(v.string(), v.string()).optional(),
      headersHelper: v.string().optional(),
      oauth: sOs().optional(),
      timeout: Nke().optional(),
      tools: v.array(iOs()).optional(),
      alwaysLoad: v.boolean().optional(),
      role: Fnt(),
      toolPermissions: v.record(v.string(), NMt()).optional()
    }));
    BWu = we(() => v.object({
      type: v.literal("sse-ide"),
      url: v.string(),
      ideName: v.string(),
      ideRunningInWindows: v.boolean().optional(),
      timeout: Nke().optional(),
      alwaysLoad: v.boolean().optional(),
      role: Fnt()
    }));
    $Wu = we(() => v.object({
      type: v.literal("ws-ide"),
      url: v.string(),
      ideName: v.string(),
      authToken: v.string().optional(),
      ideRunningInWindows: v.boolean().optional(),
      timeout: Nke().optional(),
      alwaysLoad: v.boolean().optional(),
      role: Fnt()
    }));
    yyn = we(() => v.object({
      type: v.enum(["http", "streamable-http"]).transform(() => "http"),
      url: v.string(),
      headers: v.record(v.string(), v.string()).optional(),
      headersHelper: v.string().optional(),
      oauth: sOs().optional(),
      timeout: Nke().optional(),
      tools: v.array(iOs()).optional(),
      alwaysLoad: v.boolean().optional(),
      role: Fnt(),
      toolPermissions: v.record(v.string(), NMt()).optional()
    }));
    F1r = we(() => v.object({
      type: v.literal("ws"),
      url: v.string(),
      headers: v.record(v.string(), v.string()).optional(),
      headersHelper: v.string().optional(),
      timeout: Nke().optional(),
      alwaysLoad: v.boolean().optional(),
      role: Fnt()
    }));
    U1r = we(() => v.object({
      type: v.literal("sdk"),
      name: v.string(),
      timeout: Nke().optional(),
      alwaysLoad: v.boolean().optional()
    }));
    NMt = we(() => v.enum(["allow", "ask", "blocked"]));
    B1r = we(() => v.object({
      type: v.literal("claudeai-proxy"),
      url: v.string(),
      id: v.string(),
      displayName: v.string().optional(),
      iconUrl: v.string().optional(),
      timeout: Nke().optional(),
      alwaysLoad: v.boolean().optional(),
      toolPermissions: v.record(v.string(), NMt()).optional(),
      stateless: v.boolean().optional(),
      cachedInitResponse: v.record(v.string(), v.unknown()).nullish()
    }));
    vle = we(() => v.union([MMt(), L1r(), BWu(), $Wu(), yyn(), F1r(), U1r(), B1r()]));
    KAh = we(() => v.object({
      mcpServers: v.record(v.string(), vle())
    }));
  });
  function Oye(e, t, n) {
    if (n !== undefined) {
      return n;
    }
    let r = e.toLowerCase();
    return t.autoUpdate ?? (Fke.vZc(r) && !HWu.vZc(r));
  }
  function WWu(e) {
    if (q1r.vZc(e.toLowerCase())) {
      return false;
    }
    if (qWu.test(e)) {
      return true;
    }
    return jWu.test(e);
  }
  function VWu(e) {
    let t = e.trim();
    if (sMt(t)) {
      return false;
    }
    let n = /^git@([^:]+):anthropics\/(.+)$/i.exec(t);
    if (n) {
      if (!ef(n[1] ?? "")) {
        return false;
      }
      return !(n[2] ?? "").split("/").includes("..");
    }
    try {
      let r = new URL(t);
      if (!GWu.vZc(r.protocol.toLowerCase())) {
        return false;
      }
      if (r.pathname.split("/").includes("..")) {
        return false;
      }
      return ef(r.hostname) && r.pathname.toLowerCase().startsWith("/anthropics/");
    } catch {
      return false;
    }
  }
  function W1r(e, t) {
    let n = e.toLowerCase();
    if (!q1r.vZc(n)) {
      return null;
    }
    if (t.source === "github") {
      let r = t.repo || "";
      if (!r.toLowerCase().startsWith(`${"anthropics"}/`) || r.split("/").includes("..")) {
        return `The name '${e}' is reserved for official Anthropic marketplaces. Only repositories from 'github.com/${"anthropics"}/' can use this name.`;
      }
      return null;
    }
    if (t.source === "git" && t.url) {
      if (VWu(t.url)) {
        return null;
      }
      return `The name '${e}' is reserved for official Anthropic marketplaces. Only repositories from 'github.com/${"anthropics"}/' can use this name.`;
    }
    return `The name '${e}' is reserved for official Anthropic marketplaces and can only be used with GitHub sources from the '${"anthropics"}' organization.`;
  }
  function UMt(e) {
    let t = v.record(v.string(), v.unknown()).safeParse(e);
    if (!t.success) {
      return;
    }
    let n = Object.create(null);
    for (let [r, o] of Object.entries(t.data)) {
      let s = uGu().safeParse(o);
      if (V1r.test(r) && s.success) {
        n[r] = s.data;
      }
    }
    return Object.keys(n).length > 0 ? n : undefined;
  }
  function Rje(e) {
    return typeof e === "string" && e.startsWith("./");
  }
  function q6(e) {
    return e.source === "file" || e.source === "directory";
  }
  function gGu(e) {
    let t = $Mt();
    return e.flatMap((n, r) => {
      let o = t.safeParse(n);
      if (o.success) {
        return [o.data];
      }
      let s = hGu().safeParse(n).data?.name;
      let i = o.error.issues.map(a => `${a.path.join(".")}: ${a.message}`).join(", ");
      if (s) {
        logForDebugging(`Stubbing unparseable marketplace plugin entry (${s}): ${i}`, {
          level: "warn"
        });
        return [{
          name: s,
          source: {
            source: "unsupported"
          },
          strict: true
        }];
      }
      logForDebugging(`Dropping unparseable marketplace plugin entry (index ${r}): ${i}`, {
        level: "warn"
      });
      return [];
    });
  }
  var LMt;
  var Fke;
  var q1r;
  var HWu;
  var jWu;
  var qWu;
  var GWu;
  var j6;
  var wje;
  var aOs;
  var H1r;
  var j1r;
  var cOs;
  var FMt;
  var zWu;
  var byn;
  var KWu;
  var YWu;
  var JWu;
  var XWu;
  var QWu;
  var uOs;
  var ZWu;
  var eGu;
  var tGu;
  var pOs;
  var nGu;
  var lOs;
  var rGu;
  var oGu;
  var mOs;
  var sGu;
  var iGu;
  var Unt;
  var aGu;
  var G1r;
  var fOs;
  var lGu;
  var hOs;
  var V1r;
  var cGu;
  var uGu;
  var dGu;
  var pGu;
  var mGu;
  var Cje;
  var BMt;
  var $1r;
  var gOs;
  var fGu;
  var Syn;
  var Tyn;
  var $Mt;
  var hGu;
  var fY;
  var Dye;
  var yGu;
  var _Gu;
  var bGu;
  var HMt;
  var SGu;
  var TGu;
  var jMt;
  var r0h;
  var EGu;
  var $nt;
  var TC = __lazy(() => {
    DMt();
    Lke();
    je();
    fk();
    LMt = new Set(["claude-community", "claude-plugins-community"]);
    Fke = new Set(["claude-code-marketplace", "claude-code-plugins", "claude-plugins-official", "anthropic-marketplace", "anthropic-plugins", "agent-skills", "anthropic-agent-skills", "life-sciences", "knowledge-work-plugins", "claude-for-legal", "claude-for-financial-services", "financial-services-plugins"]);
    q1r = new Set([...Fke, ...LMt]);
    HWu = new Set(["knowledge-work-plugins"]);
    jWu = /(?:official[^a-z0-9]*(anthropic|claude)|(?:anthropic|claude)[^a-z0-9]*official|^(?:anthropic|claude)[^a-z0-9]*(marketplace|plugins|official))/i;
    qWu = /[^\u0020-\u007E]/;
    GWu = new Set(["https:", "http:", "git:", "git+https:", "git+http:", "git+ssh:", "ssh:"]);
    j6 = we(() => v.string().startsWith("./"));
    wje = we(() => j6().endsWith(".json"));
    aOs = we(() => v.union([j6().refine(e => e.endsWith(".mcpb") || e.endsWith(".dxt"), {
      message: "MCPB file path must end with .mcpb or .dxt"
    }).describe("Path to MCPB file relative to plugin root"), v.string().url().refine(e => e.endsWith(".mcpb") || e.endsWith(".dxt"), {
      message: "MCPB URL must end with .mcpb or .dxt"
    }).describe("URL to MCPB file")]));
    H1r = we(() => j6().endsWith(".md"));
    j1r = we(() => v.union([H1r(), j6()]));
    cOs = we(() => v.string().min(1, "Marketplace must have a name").refine(e => !e.includes(" "), {
      message: 'Marketplace name cannot contain spaces. Use kebab-case (e.g., "my-marketplace")'
    }).refine(e => !e.includes("/") && !e.includes("\\") && !e.includes("..") && e !== ".", {
      message: 'Marketplace name cannot contain path separators (/ or \\), ".." sequences, or be "."'
    }).refine(e => !WWu(e), {
      message: "Marketplace name impersonates an official Anthropic/Claude marketplace"
    }).refine(e => e.toLowerCase() !== "inline", {
      message: 'Marketplace name "inline" is reserved for --plugin-dir session plugins'
    }).refine(e => e.toLowerCase() !== "builtin", {
      message: 'Marketplace name "builtin" is reserved for built-in plugins'
    }).refine(e => e.toLowerCase() !== "skills-dir", {
      message: 'Marketplace name "skills-dir" is reserved for plugins auto-loaded from .claude/skills/'
    }));
    FMt = we(() => v.object({
      name: v.string().min(1, "Author name cannot be empty").describe("Display name of the plugin author or organization"),
      email: v.string().optional().describe("Contact email for support or feedback"),
      url: v.string().optional().describe("Website, GitHub profile, or organization URL")
    }));
    zWu = we(() => v.object({
      $schema: v.string().optional().describe("JSON Schema reference for editor autocomplete/validation; ignored at load time"),
      name: v.string().min(1, "Plugin name cannot be empty").refine(e => !e.includes(" "), {
        message: 'Plugin name cannot contain spaces. Use kebab-case (e.g., "my-plugin")'
      }).describe("Unique identifier for the plugin, used for namespacing (prefer kebab-case)"),
      displayName: v.string().optional().describe('Human-readable name shown in UI (e.g., "GitHub Utils"). Falls back to `name` when omitted. Unlike `name`, may contain spaces and any casing; not used for namespacing or lookup.'),
      version: v.string().optional().describe("Semantic version (e.g., 1.2.3) following semver.org specification"),
      description: v.string().optional().describe("Brief, user-facing explanation of what the plugin provides"),
      author: FMt().optional().describe("Information about the plugin creator or maintainer"),
      homepage: v.string().url().optional().describe("Plugin homepage or documentation URL"),
      repository: v.string().optional().describe("Source code repository URL"),
      license: v.string().optional().describe("SPDX license identifier (e.g., MIT, Apache-2.0)"),
      keywords: v.array(v.string()).optional().describe("Tags for plugin discovery and categorization"),
      defaultEnabled: v.boolean().optional().describe("Whether the plugin starts enabled when the user has no explicit enabled/disabled setting for it (default: true). Explicit enabledPlugins values always win, and a plugin required by an enabled dependent is enabled regardless of this value."),
      dependencies: v.array(_Gu()).optional().describe(`Plugins that must be enabled for this plugin to function. Bare names (no "@marketplace") are resolved against the declaring plugin's own marketplace.`)
    }));
    byn = we(() => v.object({
      description: v.string().optional().describe("Brief, user-facing explanation of what these hooks provide"),
      hooks: v.lazy(() => cW()).describe("The hooks provided by the plugin, in the same format as the one used for settings")
    }));
    KWu = we(() => v.object({
      hooks: v.union([wje().describe("Path to file with additional hooks (in addition to those in hooks/hooks.json, if it exists), relative to the plugin root"), v.lazy(() => cW()).describe("Additional hooks (in addition to those in hooks/hooks.json, if it exists)"), v.array(v.union([wje().describe("Path to file with additional hooks (in addition to those in hooks/hooks.json, if it exists), relative to the plugin root"), v.lazy(() => cW()).describe("Additional hooks (in addition to those in hooks/hooks.json, if it exists)")]))])
    }));
    YWu = we(() => v.object({
      source: j1r().optional().describe("Path to command markdown file, relative to plugin root"),
      content: v.string().optional().describe("Inline markdown content for the command"),
      description: v.string().optional().describe("Command description override"),
      argumentHint: v.string().optional().describe('Hint for command arguments (e.g., "[file]")'),
      model: v.string().optional().describe("Default model for this command"),
      allowedTools: v.array(v.string()).optional().describe("Tools allowed when command runs")
    }).refine(e => e.source && !e.content || !e.source && e.content, {
      message: 'Command must have either "source" (file path) or "content" (inline markdown), but not both'
    }));
    JWu = we(() => v.object({
      commands: v.union([j1r().describe("Path to a command file or skill directory, relative to the plugin root. When set, the commands/ directory is not auto-loaded \u2014 list its files here if you want both."), v.array(j1r().describe("Path to a command file or skill directory, relative to the plugin root. When set, the commands/ directory is not auto-loaded \u2014 list its files here if you want both.")).describe("List of command file or skill directory paths. When set, the commands/ directory is not auto-loaded."), v.record(v.string(), YWu()).describe('Object mapping of command names to their metadata and source files. Command name becomes the slash command name (e.g., "about" \u2192 "/plugin:about")')])
    }));
    XWu = we(() => v.object({
      agents: v.union([H1r().describe("Path to an agent file, relative to the plugin root. When set, the agents/ directory is not auto-loaded \u2014 list its files here if you want both."), v.array(H1r().describe("Path to an agent file, relative to the plugin root. When set, the agents/ directory is not auto-loaded \u2014 list its files here if you want both.")).describe("List of agent file paths. When set, the agents/ directory is not auto-loaded.")])
    }));
    QWu = we(() => v.object({
      skills: v.union([j6().describe("Path to a skill directory, relative to the plugin root. Loaded in addition to the skills/ directory (except: for a marketplace entry whose source resolves to the marketplace root, declaring a specific subdirectory replaces the skills/ scan)."), v.array(j6().describe("Path to a skill directory, relative to the plugin root.")).describe("List of skill directory paths, loaded in addition to the skills/ directory (except: for a marketplace entry whose source resolves to the marketplace root, declaring specific subdirectories replaces the skills/ scan).")])
    }));
    uOs = we(() => v.object({
      outputStyles: v.union([j6().describe("Path to an output-styles directory or file, relative to the plugin root. When set, the output-styles/ directory is not auto-loaded \u2014 list its files here if you want both."), v.array(j6().describe("Path to an output-styles directory or file, relative to the plugin root. When set, the output-styles/ directory is not auto-loaded \u2014 list its files here if you want both.")).describe("List of output-style directory or file paths. When set, the output-styles/ directory is not auto-loaded.")])
    }));
    ZWu = we(() => v.string().max(64).regex(/^[a-z][a-z0-9_-]*$/, "must match ^[a-z][a-z0-9_-]*$"));
    eGu = we(() => v.object({
      id: ZWu(),
      remote: v.string().max(256).regex(/^(npm:[@a-z0-9/._-]+(@[a-z0-9._+-]+)?|github:[\w.-]+\/[\w.-]+@[\w./-]+#.+\.js)$/, "must be npm:<pkg>[@ver] or github:<owner>/<repo>@<ref>#<path>.js").optional(),
      integrity: v.string().max(512).regex(/^sha(256|384|512)-[A-Za-z0-9+/=]+$/, "must be SRI form: sha256-, sha384-, or sha512-<base64>").optional()
    }).strict());
    tGu = we(() => v.object({
      syntaxHighlighting: v.object({
        hljsLanguages: v.array(eGu()).max(16)
      }).strict()
    }));
    pOs = we(() => v.object({
      themes: v.union([j6().describe("Path to a themes directory or file, relative to the plugin root. When set, the themes/ directory is not auto-loaded \u2014 list its files here if you want both."), v.array(j6().describe("Path to a themes directory or file, relative to the plugin root. When set, the themes/ directory is not auto-loaded \u2014 list its files here if you want both.")).describe("List of theme directory or file paths. When set, the themes/ directory is not auto-loaded.")])
    }));
    nGu = we(() => v.object({
      workflows: v.union([j6().describe("Path to a workflows directory or .js file, relative to the plugin root. When set, the workflows/ directory is not auto-loaded \u2014 list its files here if you want both."), v.array(j6().describe("Path to a workflows directory or .js file, relative to the plugin root. When set, the workflows/ directory is not auto-loaded \u2014 list its files here if you want both.")).describe("List of workflow directory or .js file paths. When set, the workflows/ directory is not auto-loaded.")]).optional()
    }));
    lOs = we(() => v.string().min(1));
    rGu = we(() => v.string().min(2).refine(e => e.startsWith("."), {
      message: 'File extensions must start with dot (e.g., ".ts", not "ts")'
    }));
    oGu = we(() => v.object({
      mcpServers: v.union([wje().describe("MCP servers to include in the plugin (in addition to those in the .mcp.json file, if it exists)"), aOs().describe("Path or URL to MCPB file containing MCP server configuration"), v.record(v.string(), vle()).describe("MCP server configurations keyed by server name"), v.array(v.union([wje().describe("Path to MCP servers configuration file"), aOs().describe("Path or URL to MCPB file"), v.record(v.string(), vle()).describe("Inline MCP server configurations")])).describe("Array of MCP server configurations (paths, MCPB files, or inline definitions)")])
    }));
    mOs = we(() => v.object({
      type: v.enum(["string", "number", "boolean", "directory", "file"]).describe("Type of the configuration value"),
      title: v.string().describe("Human-readable label shown in the config dialog"),
      description: v.string().describe("Help text shown beneath the field in the config dialog"),
      required: v.boolean().optional().describe("If true, validation fails when this field is empty"),
      default: v.union([v.string(), v.number(), v.boolean(), v.array(v.string())]).optional().describe("Default value used when the user provides nothing"),
      multiple: v.boolean().optional().describe("For string type: allow an array of strings"),
      sensitive: v.boolean().optional().describe("If true, masks dialog input and stores value in secure storage (keychain/credentials file) instead of settings.json"),
      min: v.number().optional().describe("Minimum value (number type only)"),
      max: v.number().optional().describe("Maximum value (number type only)")
    }).strict());
    sGu = we(() => v.object({
      userConfig: v.record(v.string().regex(/^[A-Za-z_]\w*$/, "Option keys must be valid identifiers (letters, digits, underscore; no leading digit) \u2014 they become CLAUDE_PLUGIN_OPTION_<KEY> env vars in hooks"), mOs()).optional().describe("User-configurable values this plugin needs. Prompted at enable time. Non-sensitive values saved to settings.json; sensitive values to secure storage. Available as ${user_config.KEY} in MCP/LSP server config, hook commands, and (non-sensitive only) skill/agent content. Keep sensitive value counts small.")
    }));
    iGu = we(() => v.object({
      channels: v.array(v.object({
        server: v.string().min(1).describe("Name of the MCP server this channel binds to. Must match a key in this plugin's mcpServers."),
        displayName: v.string().optional().describe('Human-readable name shown in the config dialog title (e.g., "Telegram"). Defaults to the server name.'),
        userConfig: v.record(v.string(), mOs()).optional().describe("Fields to prompt the user for when enabling this plugin in assistant mode. Saved values are substituted into ${user_config.KEY} references in the mcpServers env.")
      }).strict()).describe("Channels this plugin provides. Each entry declares an MCP server as a message channel and optionally specifies user configuration to prompt for at enable time.")
    }));
    Unt = we(() => v.strictObject({
      command: v.string().min(1).refine(e => {
        if (e.includes(" ") && !e.startsWith("/")) {
          return false;
        }
        return true;
      }, {
        message: "Command should not contain spaces. Use args array for arguments."
      }).describe('Command to execute the LSP server (e.g., "typescript-language-server")'),
      args: v.array(lOs()).optional().describe("Command-line arguments to pass to the server"),
      extensionToLanguage: v.record(rGu(), lOs()).refine(e => Object.keys(e).length > 0, {
        message: "extensionToLanguage must have at least one mapping"
      }).describe("Mapping from file extension to LSP language ID. File extensions and languages are derived from this mapping."),
      transport: v.enum(["stdio", "socket"]).default("stdio").describe("Communication transport mechanism"),
      env: v.record(v.string(), v.string()).optional().describe("Environment variables to set when starting the server"),
      initializationOptions: v.unknown().optional().describe("Initialization options passed to the server during initialization"),
      settings: v.unknown().optional().describe("Settings passed to the server via workspace/didChangeConfiguration"),
      workspaceFolder: v.string().optional().describe("Workspace folder path to use for the server"),
      startupTimeout: v.number().int().positive().optional().describe("Maximum time to wait for server startup (milliseconds)"),
      shutdownTimeout: v.number().int().positive().optional().describe("Maximum time to wait for graceful shutdown (milliseconds)"),
      restartOnCrash: v.boolean().optional().describe("Whether to restart the server if it crashes"),
      maxRestarts: v.number().int().nonnegative().optional().describe("Maximum number of restart attempts before giving up"),
      diagnostics: v.boolean().optional().describe("Whether to push publishDiagnostics into the agent context after edits. Set to false to keep LSP navigation (goToDefinition, hover, etc.) but suppress automatic diagnostic injection. Defaults to true.")
    }));
    aGu = we(() => v.strictObject({
      name: v.string().min(1).describe("Identifier for this monitor, unique within the plugin. Used to dedupe so re-arming (plugin reload, repeat skill invoke) does not spawn duplicates."),
      command: v.string().min(1).describe('Shell command to run as a persistent background monitor. Each stdout line is delivered to the model as a <task_notification> event; the process runs for the session lifetime. ${CLAUDE_PLUGIN_ROOT}, ${CLAUDE_PLUGIN_DATA}, ${CLAUDE_PROJECT_DIR}, ${user_config.*}, and ${ENV_VAR} are substituted. Runs in the session cwd \u2014 prefix with `cd "${CLAUDE_PLUGIN_ROOT}" && ` if the script needs its own directory.'),
      description: v.string().min(1).describe("Short human-readable description of what is being monitored (shown in task panel and notification summary)."),
      when: v.union([v.literal("always"), v.string().startsWith("on-skill-invoke:").refine(e => e.length > 16, {
        message: "on-skill-invoke: must specify a skill name"
      })]).default("always").describe('Arm trigger. "always" arms at session start and on plugin reload. "on-skill-invoke:<skill>" arms the first time that skill is dispatched (via Skill tool or slash command).')
    }));
    G1r = we(() => v.array(aGu()).refine(e => new Set(e.map(t => t.name)).size === e.length, {
      message: "Monitor names must be unique within a plugin"
    }));
    fOs = we(() => v.object({
      monitors: v.union([wje().describe("Path to a JSON file containing the monitors array, relative to the plugin root"), G1r()]).describe("Background watch scripts the host arms as persistent Monitor tasks (unsandboxed, same trust tier as hooks) so plugins need not instruct the model to arm them. When omitted, monitors/monitors.json at the plugin root is loaded if present.")
    }));
    lGu = we(() => v.object({
      lspServers: v.union([wje().describe("Path to .lsp.json configuration file relative to plugin root"), v.record(v.string(), Unt()).describe("LSP server configurations keyed by server name"), v.array(v.union([wje().describe("Path to LSP configuration file"), v.record(v.string(), Unt()).describe("Inline LSP server configurations")])).describe("Array of LSP server configurations (paths or inline definitions)")])
    }));
    hOs = we(() => v.string().refine(e => !e.includes("..") && !e.includes("//"), "Package name cannot contain path traversal patterns").refine(e => {
      let t = /^@[a-z0-9][a-z0-9-._]*\/[a-z0-9][a-z0-9-._]*$/;
      let n = /^[a-z0-9][a-z0-9-._]*$/;
      return t.test(e) || n.test(e);
    }, "Invalid npm package name format"));
    V1r = /^[a-z0-9](?:[a-z0-9._-]*[a-z0-9_-])?$/;
    cGu = /^[0-9a-f]{64}$/;
    uGu = we(() => v.object({
      sha256: v.string().regex(cGu)
    }));
    dGu = we(() => v.object({
      binaries: v.unknown().transform(UMt).describe("sha256-pinned files to fetch into bin/ at install time, keyed by basename (target triple encoded in the name)")
    }));
    pGu = we(() => v.object({
      settings: v.record(v.string(), v.unknown()).optional().describe("Settings to merge into the user settings while this plugin is enabled. Only the documented allowlisted keys are applied.")
    }));
    mGu = we(() => v.object({
      experimental: v.preprocess(e => typeof e === "object" && e !== null && !Array.isArray(e) ? e : undefined, v.object({
        ...pOs().partial().shape,
        ...tGu().partial().shape,
        ...fOs().partial().shape,
        ...uOs().partial().shape,
        evals: v.union([v.string(), v.array(v.string())]).optional().describe("Path(s) to evaluation query files for `claude plugin eval`. Defaults to `evals/`.")
      }).passthrough().optional().describe("Components whose manifest shape may change without a deprecation cycle. Move a key out of here once it is promoted to stable."))
    }));
    Cje = we(() => v.object({
      ...zWu().shape,
      ...KWu().partial().shape,
      ...JWu().partial().shape,
      ...XWu().partial().shape,
      ...QWu().partial().shape,
      ...uOs().partial().shape,
      ...pOs().partial().shape,
      ...nGu().shape,
      ...iGu().partial().shape,
      ...oGu().partial().shape,
      ...lGu().partial().shape,
      ...fOs().partial().shape,
      ...pGu().partial().shape,
      ...sGu().partial().shape,
      ...dGu().partial().shape,
      ...mGu().partial().shape
    }));
    BMt = we(() => v.discriminatedUnion("source", [v.object({
      source: v.literal("url"),
      url: v.string().url().describe("Direct URL to marketplace.json file"),
      headers: v.record(v.string(), v.string()).optional().describe("Custom HTTP headers (e.g., for authentication)")
    }), v.object({
      source: v.literal("github"),
      repo: v.string().describe("GitHub repository in owner/repo format"),
      ref: v.string().optional().describe('Git branch or tag to use (e.g., "main", "v1.0.0"). Defaults to repository default branch.'),
      path: v.string().optional().describe("Path to marketplace.json within repo (defaults to .claude-plugin/marketplace.json)"),
      sparsePaths: v.array(v.string()).optional().describe('Directories to include via git sparse-checkout (cone mode). Use for monorepos where the marketplace lives in a subdirectory. Example: [".claude-plugin", "plugins"]. If omitted, the full repository is cloned.'),
      skipLfs: v.boolean().optional().describe("Skip Git LFS smudge during clone and update (sets GIT_LFS_SKIP_SMUDGE=1) so LFS pointer files stay as pointers instead of downloading their content. Use for marketplaces hosted in repos with large LFS objects.")
    }), v.object({
      source: v.literal("git"),
      url: v.string().describe("Full git repository URL"),
      ref: v.string().optional().describe('Git branch or tag to use (e.g., "main", "v1.0.0"). Defaults to repository default branch.'),
      path: v.string().optional().describe("Path to marketplace.json within repo (defaults to .claude-plugin/marketplace.json)"),
      sparsePaths: v.array(v.string()).optional().describe('Directories to include via git sparse-checkout (cone mode). Use for monorepos where the marketplace lives in a subdirectory. Example: [".claude-plugin", "plugins"]. If omitted, the full repository is cloned.'),
      skipLfs: v.boolean().optional().describe("Skip Git LFS smudge during clone and update (sets GIT_LFS_SKIP_SMUDGE=1) so LFS pointer files stay as pointers instead of downloading their content. Use for marketplaces hosted in repos with large LFS objects.")
    }), v.object({
      source: v.literal("npm"),
      package: hOs().describe("NPM package containing marketplace.json")
    }), v.object({
      source: v.literal("file"),
      path: v.string().describe("Local file path to marketplace.json")
    }), v.object({
      source: v.literal("directory"),
      path: v.string().describe("Local directory containing .claude-plugin/marketplace.json")
    }), v.object({
      source: v.literal("skills-dir")
    }).describe("Policy-list sentinel for the ~/.claude/skills/ auto-load (@skills-dir plugins). In strictKnownMarketplaces: opt the scan back IN (by default any allowlist blocks it). In blockedMarketplaces: turn the scan OFF without otherwise restricting marketplaces. Only meaningful in those two managed-settings lists (areLocalPluginDirsAllowedByPolicy); known_marketplaces.json / marketplace add etc. ignore it."), v.object({
      source: v.literal("hostPattern"),
      hostPattern: v.string().describe('Regex pattern to match the host/domain extracted from any marketplace source type. For github sources, matches against github.com. For git sources (SSH or HTTPS), extracts the hostname from the URL. Use in strictKnownMarketplaces to allow all marketplaces from a specific host (e.g., "^github\\.mycompany\\.com$").')
    }), v.object({
      source: v.literal("pathPattern"),
      pathPattern: v.string().describe('Regex pattern matched against the .path field of file and directory sources. Use in strictKnownMarketplaces to allow filesystem-based marketplaces alongside hostPattern restrictions for network sources. Use ".*" to allow all filesystem paths, or a narrower pattern (e.g., "^/opt/approved/") to restrict to specific directories.')
    }), v.object({
      source: v.literal("settings"),
      name: cOs().refine(e => !q1r.vZc(e.toLowerCase()), {
        message: "Reserved marketplace names cannot be used with settings sources. validateOfficialNameSource only accepts github/git sources from anthropics/* for these names; a settings source would be rejected after loadAndCacheMarketplace has already written to disk with cleanupNeeded=false."
      }).describe("Marketplace name. Must match the extraKnownMarketplaces key (enforced); the synthetic manifest is written under this name. Same validation " + "as PluginMarketplaceSchema plus reserved-name rejection \u2014 " + "validateOfficialNameSource runs after the disk write, too late to clean up."),
      plugins: v.array(fGu()).describe("Plugin entries declared inline in settings.json"),
      owner: FMt().optional()
    }).describe("Inline marketplace manifest defined directly in settings.json. The reconciler writes a synthetic marketplace.json to the cache; diffMarketplaces detects edits via isEqual on the stored source (the plugins array is inside this object, so edits surface as sourceChanged).")]));
    $1r = we(() => v.string().length(40).regex(/^[a-f0-9]{40}$/, "Must be a full 40-character lowercase git commit SHA"));
    gOs = we(() => v.union([v.preprocess(e => e === "." ? "./" : e, j6()).describe("Path to the plugin root, relative to the marketplace root (the directory containing .claude-plugin/, not .claude-plugin/ itself)"), v.object({
      source: v.literal("npm"),
      package: hOs().or(v.string().refine(e => /^(?:file|https?|git(?:\+https?|\+ssh)?|ssh|github|gitlab|bitbucket):/i.test(e) || !e.includes(".."), 'Package reference cannot contain ".." path segments')).describe("Package name (or url, or local path, or anything else that can be passed to `npm` as a package)"),
      version: v.string().optional().describe("Specific version or version range (e.g., ^1.0.0, ~2.1.0)"),
      registry: v.string().url().optional().describe("Custom NPM registry URL (defaults to using system default, likely npmjs.org)")
    }).describe("NPM package as plugin source"), v.object({
      source: v.literal("url"),
      url: v.string().describe("Full git repository URL (https:// or git@)"),
      ref: v.string().optional().describe('Git branch or tag to use (e.g., "main", "v1.0.0"). Defaults to repository default branch.'),
      sha: $1r().optional().describe("Specific commit SHA to use")
    }), v.object({
      source: v.literal("github"),
      repo: v.string().describe("GitHub repository in owner/repo format"),
      ref: v.string().optional().describe('Git branch or tag to use (e.g., "main", "v1.0.0"). Defaults to repository default branch.'),
      sha: $1r().optional().describe("Specific commit SHA to use")
    }), v.object({
      source: v.literal("git-subdir"),
      url: v.string().describe("Git repository: GitHub owner/repo shorthand, https://, or git@ URL"),
      path: v.string().min(1).describe('Subdirectory within the repo containing the plugin (e.g., "tools/claude-plugin"). Cloned sparsely using partial clone (--filter=tree:0) to minimize bandwidth for monorepos.'),
      ref: v.string().optional().describe('Git branch or tag to use (e.g., "main", "v1.0.0"). Defaults to repository default branch.'),
      sha: $1r().optional().describe("Specific commit SHA to use")
    }).describe("Plugin located in a subdirectory of a larger repository (monorepo). Only the specified subdirectory is materialized; the rest of the repo is not downloaded."), v.object({
      source: v.literal("unsupported")
    }).describe("Placeholder for source types this Claude Code version does not " + "recognize. Never authored by hand \u2014 PluginMarketplaceSchema rewrites " + 'unparseable sources to this so the entry remains in marketplace.plugins (detectDelistedPlugins must not see it as removed). Install attempts fail at cachePlugin with a clear "update Claude Code" message.')]));
    fGu = we(() => v.object({
      name: v.string().min(1, "Plugin name cannot be empty").refine(e => !e.includes(" "), {
        message: 'Plugin name cannot contain spaces. Use kebab-case (e.g., "my-plugin")'
      }).describe("Plugin name as it appears in the target repository"),
      source: gOs().describe("Where to fetch the plugin from. Must be a remote source \u2014 relative " + "paths have no marketplace repository to resolve against."),
      description: v.string().optional(),
      version: v.string().optional(),
      strict: v.boolean().optional()
    }).refine(e => typeof e.source !== "string", {
      message: 'Plugins in a settings-sourced marketplace must use remote sources (github, git-subdir, npm, url). Relative-path sources like "./foo" have no marketplace repository to resolve against.'
    }).refine(e => typeof e.source === "string" || e.source.source !== "unsupported", {
      message: "source.source: 'unsupported' is a parse-time placeholder and cannot be authored. Use a remote source (github, git-subdir, npm, url)."
    }));
    Syn = we(() => v.object({
      cli: v.array(v.string().max(64)).max(10).optional().describe('First command tokens (e.g. ["stripe"]) \u2014 exact match against commands run this session.'),
      hosts: v.array(v.string().max(128)).max(20).optional().describe('Hostnames (e.g. ["api.stripe.com"]) \u2014 exact, case-insensitive match against ' + "hostnames seen in https?:// URLs in bash commands run this session. Bare hostname only: lowercase, no scheme, no port, no path."),
      filesRead: v.array(v.string().max(256)).max(10).optional().describe('Glob patterns (e.g. ["**/*.tf"]) \u2014 the plugin is relevant when a file Claude has read ' + "this session matches any pattern. Matched against read-file paths, forward-slash normalized, case-insensitive."),
      manifestDeps: v.array(v.object({
        file: v.string().max(256),
        pattern: v.string().max(256)
      })).max(10).optional().describe("Dependency declared in a package manifest. Each {file, pattern} is a pair of RegExp sources: " + "`file` matches the manifest filename (package.json, go.mod, requirements.txt, \u2026); " + "`pattern` matches the dependency declaration inside that file. Evaluated against files read this session."),
      cwd: v.array(v.string().max(256)).max(10).optional().describe('Glob patterns (e.g. ["Engine/Source/Runtime/Renderer/**"]) \u2014 the plugin is relevant when the ' + `session's working directory is at or under a directory matching the pattern. Matched against the cwd both relative to the enclosing git repo root and as an absolute path, forward-slash normalized, case-insensitive. A bare directory (no glob characters) means "cwd is at or under this directory". Known at session start, so this signal can surface a suggestion before the first turn.`)
    }));
    Tyn = we(() => v.object({
      topic: v.string().max(64).optional().describe('What the user is working with when this plugin is relevant \u2014 fills "Working with {topic}?". ' + 'Often the product name (e.g. "Stripe"); use a domain (e.g. "design") when the plugin name does not read naturally as a topic. Defaults to the plugin name with each hyphen-segment capitalized.'),
      signals: Syn().optional().describe("Matchers that determine when the plugin is relevant.")
    }));
    $Mt = we(() => Cje().partial().extend({
      name: v.string().min(1, "Plugin name cannot be empty").refine(e => !e.includes(" "), {
        message: 'Plugin name cannot contain spaces. Use kebab-case (e.g., "my-plugin")'
      }).describe("Unique identifier matching the plugin name"),
      source: gOs().describe("Where to fetch the plugin from"),
      category: v.string().optional().describe('Category for organizing plugins (e.g., "productivity", "development")'),
      tags: v.array(v.string()).optional().describe("Tags for searchability and discovery"),
      strict: v.boolean().optional().default(true).describe("Require the plugin manifest to be present in the plugin folder. If false, the marketplace entry provides the manifest."),
      relevance: v.preprocess(e => typeof e === "object" && e !== null && !Array.isArray(e) ? e : undefined, Tyn().optional()).describe(`Declares when this plugin is relevant to the user's work. Consumed by the spinner tip ("Working with {topic}?"), session-start auto-suggest, and marketplace browse ranking.`)
    }));
    hGu = we(() => v.object({
      name: v.string().min(1).refine(e => !e.includes(" "))
    }));
    fY = we(() => v.object({
      $schema: v.string().optional().describe("JSON Schema reference for editor autocomplete/validation; ignored at load time"),
      name: cOs(),
      version: v.string().optional().describe("Marketplace manifest version"),
      description: v.string().optional().describe("Human-readable description of this marketplace"),
      owner: FMt().describe("Marketplace maintainer or curator information"),
      plugins: v.array(v.unknown()).transform(gGu).describe("Collection of available plugins in this marketplace"),
      forceRemoveDeletedPlugins: v.boolean().optional().describe("When true, plugins removed from this marketplace will be automatically uninstalled and flagged for users"),
      metadata: v.object({
        pluginRoot: v.string().optional().describe("Base path for relative plugin sources"),
        version: v.string().optional().describe("Marketplace version"),
        description: v.string().optional().describe("Marketplace description")
      }).optional().describe("Optional marketplace metadata"),
      allowCrossMarketplaceDependenciesOn: v.array(v.string()).optional().describe("Marketplace names whose plugins may be auto-installed as dependencies. Only the root marketplace's allowlist applies \u2014 no transitive trust."),
      renames: v.record(v.string(), v.string().nullable()).optional().catch(undefined).describe("Append-only map of old plugin name \u2192 current name (or null when removed). The loader follows this on plugin-not-found and migrates user settings to the new name.")
    }));
    Dye = we(() => v.string().regex(/^[A-Za-z0-9][-A-Za-z0-9._]*@[A-Za-z0-9][-A-Za-z0-9._]*$/, "Plugin ID must be in format: plugin@marketplace"));
    yGu = /^[A-Za-z0-9][-A-Za-z0-9._]*(@[A-Za-z0-9][-A-Za-z0-9._]*)?(@\^[^@]*)?$/;
    _Gu = we(() => v.union([v.string().regex(yGu, "Dependency must be a plugin name, optionally qualified with @marketplace").transform(e => e.replace(/@\^[^@]*$/, "")), v.object({
      name: v.string().min(1).regex(/^[A-Za-z0-9][-A-Za-z0-9._]*$/),
      marketplace: v.string().min(1).regex(/^[A-Za-z0-9][-A-Za-z0-9._]*$/).optional()
    }).loose().transform(e => e.marketplace ? `${e.name}@${e.marketplace}` : e.name)]));
    bGu = we(() => v.object({
      version: v.string().describe("Currently installed version"),
      installedAt: v.string().describe("ISO 8601 timestamp of installation"),
      lastUpdated: v.string().optional().describe("ISO 8601 timestamp of last update"),
      installPath: v.string().describe("Absolute path to the installed plugin directory"),
      gitCommitSha: v.string().optional().describe("Git commit SHA for git-based plugins (for version tracking)"),
      resolvedVersion: v.string().optional().describe("Tag-derived semver this install resolved to (when fetched via a version constraint). Used by verifyAndDemote in preference to manifest.version, since the upstream may have forgotten to bump plugin.json."),
      auto: v.boolean().optional().describe("True when this plugin was pulled in as a dependency rather than installed explicitly. Auto-installed plugins are eligible for removal by the orphan sweep when nothing depends on them. Absent = manual (preserves pre-flag installs).")
    }));
    HMt = we(() => v.object({
      version: v.literal(1).describe("Schema version 1"),
      plugins: v.record(Dye(), bGu()).describe("Map of plugin IDs to their installation metadata")
    }));
    SGu = we(() => v.enum(["managed", "user", "project", "local"]));
    TGu = we(() => v.object({
      scope: SGu().describe("Installation scope"),
      projectPath: v.string().optional().describe("Project path (required for project/local scopes)"),
      installPath: v.string().describe("Absolute path to the versioned plugin directory"),
      version: v.string().optional().describe("Currently installed version"),
      installedAt: v.string().optional().describe("ISO 8601 timestamp of installation"),
      lastUpdated: v.string().optional().describe("ISO 8601 timestamp of last update"),
      gitCommitSha: v.string().optional().describe("Git commit SHA for git-based plugins"),
      resolvedVersion: v.string().optional().describe("Tag-derived semver this install resolved to"),
      auto: v.boolean().optional().describe("True when pulled in as a dependency. Eligible for orphan sweep.")
    }));
    jMt = we(() => v.object({
      version: v.literal(2).describe("Schema version 2"),
      plugins: v.record(Dye(), v.array(TGu())).describe("Map of plugin IDs to arrays of installation entries")
    }));
    r0h = we(() => v.union([HMt(), jMt()]));
    EGu = we(() => v.object({
      source: BMt().describe("Where to fetch the marketplace from"),
      installLocation: v.string().describe("Local cache path where marketplace manifest is stored"),
      lastUpdated: v.string().describe("ISO 8601 timestamp of last marketplace refresh"),
      autoUpdate: v.boolean().optional().describe("Whether to automatically update this marketplace and its installed plugins on startup")
    }));
    $nt = we(() => v.record(v.string(), EGu()));
  });
  function z1r() {
    return vGu.filter(e => Eyn[e].buildGate());
  }
  function yOs(e) {
    let t = {};
    for (let n of e) {
      t = {
        ...t,
        ...Eyn[n].shape()
      };
    }
    return t;
  }
  function _Os(e) {
    let t = {};
    for (let n of e) {
      t = {
        ...t,
        ...Eyn[n].permissionsShape?.()
      };
    }
    return t;
  }
  function bOs(e) {
    let t = [];
    for (let n of e) {
      t.push(...(Eyn[n].permissionModes?.() ?? []));
    }
    return t;
  }
  var vGu;
  var Eyn;
  var SOs = __lazy(() => {
    vGu = ["autoMode", "deepLink", "voice", "briefView", "screenReader"];
    Eyn = {
      autoMode: {
        buildGate: () => true,
        shape: () => ({
          skipAutoPermissionPrompt: v.boolean().optional().describe("Whether the user has accepted the auto mode opt-in dialog"),
          useAutoModeDuringPlan: v.boolean().optional().describe("Whether plan mode uses auto mode semantics when auto mode is available (default: true)"),
          autoMode: v.object({
            allow: v.array(v.string()).optional().describe('Rules for the auto mode classifier allow section. Include the literal string "$defaults" to inherit the built-in rules at that position.'),
            soft_deny: v.array(v.string()).optional().describe('Rules for the auto mode classifier SOFT BLOCK section \u2014 destructive/irreversible actions that user intent can clear. Include the literal string "$defaults" to inherit the built-in rules at that position.'),
            hard_deny: v.array(v.string()).optional().describe('Rules for the auto mode classifier HARD BLOCK section \u2014 security boundaries that user intent does NOT clear. Include the literal string "$defaults" to inherit the built-in rules at that position.'),
            ...false,
            ...{},
            environment: v.array(v.string()).optional().describe('Entries for the auto mode classifier environment section. Include the literal string "$defaults" to inherit the built-in entries at that position.'),
            classifyAllShell: v.boolean().optional().describe("When true, every Bash/PowerShell allow rule is suspended while auto mode is active so all shell commands are routed through the classifier (higher safety, more classifier calls). Default: false.")
          }).optional().describe("Auto mode classifier prompt customization")
        }),
        permissionsShape: () => ({
          disableAutoMode: v.enum(["disable"]).optional().describe("Disable auto mode")
        }),
        permissionModes: () => INTERNAL_PERMISSION_MODES.filter(e => !EXTERNAL_PERMISSION_MODES.includes(e))
      },
      deepLink: {
        buildGate: () => true,
        shape: () => ({
          disableDeepLinkRegistration: v.enum(["disable"]).optional().describe("Prevent claude-cli:// protocol handler registration with the OS")
        })
      },
      voice: {
        buildGate: () => true,
        shape: () => ({
          voiceEnabled: v.boolean().optional().describe("Enable voice mode (hold-to-talk dictation)")
        })
      },
      briefView: {
        buildGate: () => true,
        shape: () => ({
          defaultView: v.enum(["chat", "transcript"]).optional().describe("Default transcript view: chat (SendUserMessage checkpoints only) or transcript (full)")
        })
      },
      screenReader: {
        buildGate: () => true,
        shape: () => ({
          axScreenReader: v.boolean().optional().describe("Render screen-reader friendly output (flat text, no decorative borders or animations). Overridden by the CLAUDE_AX_SCREEN_READER env var and the --ax-screen-reader CLI flag.")
        })
      }
    };
  });
  function Bl(e) {
    let t = e.replace(/[^a-zA-Z0-9_-]/g, "_");
    if (e.startsWith("claude.ai ")) {
      t = t.replace(/_+/g, "_").replace(/^_|_$/g, "");
    }
    return t;
  }
  function TI(e) {
    let t = e.split("__");
    let [n, r, ...o] = t;
    if (n !== "mcp" || !r) {
      return null;
    }
    let s = o.length > 0 ? o.join("__") : undefined;
    return {
      serverName: r,
      toolName: s
    };
  }
  function uW(e) {
    return `mcp__${Bl(e)}__`;
  }
  function W6(e, t) {
    return `${uW(e)}${Bl(t)}`;
  }
  function K1r(e) {
    let t = {
      always_allow: 0,
      always_ask: 1,
      always_deny: 2
    };
    let n = new Map();
    for (let [i, a] of Object.entries(e)) {
      if (a.type !== "http" && a.type !== "sse") {
        continue;
      }
      for (let l of a.tools ?? []) {
        let c = l.permission_policy;
        if (c === undefined) {
          continue;
        }
        let u = t[c];
        if (u === undefined) {
          continue;
        }
        let d = W6(i, l.name);
        let p = n.get(d);
        if (p === undefined || u > (t[p] ?? -1)) {
          n.set(d, c);
        }
      }
    }
    let r = [];
    let o = [];
    let s = [];
    for (let [i, a] of n) {
      if (a === "always_allow") {
        r.push(i);
      } else if (a === "always_deny") {
        o.push(i);
      } else {
        s.push(i);
      }
    }
    return {
      allow: r,
      deny: o,
      ask: s
    };
  }
  function TOs(e, t) {
    let n = Object.fromEntries(Object.entries(t).filter(([, i]) => i.scope === "dynamic"));
    let {
      allow: r,
      deny: o,
      ask: s
    } = K1r(n);
    if (r.length === 0 && o.length === 0 && s.length === 0) {
      return e;
    }
    return {
      ...e,
      alwaysAllowRules: {
        ...e.alwaysAllowRules,
        ...(r.length > 0 && {
          mcpServerPolicy: r
        })
      },
      alwaysDenyRules: {
        ...e.alwaysDenyRules,
        ...(o.length > 0 && {
          mcpServerPolicy: o
        })
      },
      alwaysAskRules: {
        ...e.alwaysAskRules,
        ...(s.length > 0 && {
          mcpServerPolicy: s
        })
      }
    };
  }
  function Wte(e) {
    return e.mcpInfo ? W6(e.mcpInfo.serverName, e.mcpInfo.toolName) : e.name;
  }
  function vyn(e, t) {
    let n = `mcp__${Bl(t)}__`;
    return e.replace(n, "");
  }
  function wyn(e) {
    let t = e.replace(/\s*\(MCP\)\s*$/, "");
    t = t.trim();
    let n = t.indexOf(" - ");
    if (n !== -1) {
      return t.substring(n + 3).trim();
    }
    return t;
  }
  function Bke(e, t) {
    if (!t || !e.startsWith("plugin:")) {
      return e;
    }
    let n = e.split(":");
    if (n.length < 3) {
      return e;
    }
    let r = n[1];
    return `${n.slice(2).join(":")} (from plugin ${r})`;
  }
  function qMt(e, t) {
    if (e.startsWith("plugin:") || t.startsWith("plugin:")) {
      return e === t;
    }
    return Bl(e) === Bl(t);
  }
  var EI = () => {};
  function jD(e) {
    return Object.hasOwn(Y1r, e) ? Y1r[e] : e;
  }
  function Cyn(e) {
    let t = [];
    for (let [n, r] of Object.entries(Y1r)) {
      if (r === e) {
        t.push(n);
      }
    }
    return t;
  }
  function xyn(e, t) {
    let n = t && Object.hasOwn(t, e) ? t[e] : undefined;
    return n !== undefined && n !== e ? [e, n] : [e];
  }
  function kyn(e, t) {
    if (!t) {
      return [];
    }
    let n = [];
    for (let [r, o] of Object.entries(t)) {
      if (o === e) {
        n.push(r);
      }
    }
    return n;
  }
  function $ke(e) {
    return e.includes("*");
  }
  function J1r(e, t) {
    return new RegExp(`^${e.split("*").map(r => r.replace(/[.*+?^${}()|[\]\\]/g, "\\$&")).join(".*")}$`, "s").test(t);
  }
  function X1r(e, t) {
    return J1r(e, t);
  }
  function wGu(e) {
    return e.replaceAll("\\", "\\\\").replaceAll("(", "\\(").replaceAll(")", "\\)");
  }
  function CGu(e) {
    return e.replaceAll("\\(", "(").replaceAll("\\)", ")").replaceAll("\\\\", "\\");
  }
  function Nh(e) {
    let t = RGu(e, "(");
    if (t === -1) {
      return {
        toolName: jD(e)
      };
    }
    let n = xGu(e, ")");
    if (n === -1 || n <= t) {
      return {
        toolName: jD(e)
      };
    }
    if (n !== e.length - 1) {
      return {
        toolName: jD(e)
      };
    }
    let r = e.substring(0, t);
    let o = e.substring(t + 1, n);
    if (!r) {
      return {
        toolName: jD(e)
      };
    }
    if (o === "" || o === "*") {
      return {
        toolName: jD(r)
      };
    }
    let s = CGu(o);
    return {
      toolName: jD(r),
      ruleContent: s
    };
  }
  function jp(e) {
    if (!e.ruleContent) {
      return e.toolName;
    }
    let t = wGu(e.ruleContent);
    return `${e.toolName}(${t})`;
  }
  function RGu(e, t) {
    for (let n = 0; n < e.length; n++) {
      if (e[n] === t) {
        let r = 0;
        let o = n - 1;
        while (o >= 0 && e[o] === "\\") {
          r++;
          o--;
        }
        if (r % 2 === 0) {
          return n;
        }
      }
    }
    return -1;
  }
  function xGu(e, t) {
    for (let n = e.length - 1; n >= 0; n--) {
      if (e[n] === t) {
        let r = 0;
        let o = n - 1;
        while (o >= 0 && e[o] === "\\") {
          r++;
          o--;
        }
        if (r % 2 === 0) {
          return n;
        }
      }
    }
    return -1;
  }
  var Y1r;
  var Hnt;
  var EOs;
  var EC = __lazy(() => {
    Y1r = {
      Task: "Agent",
      KillShell: "TaskStop",
      KillBash: "TaskStop",
      AgentOutputTool: "TaskOutput",
      BashOutputTool: "TaskOutput",
      AgentOutput: "TaskOutput",
      BashOutput: "TaskOutput",
      ListPeers: "ListAgents",
      Brief: "SendUserMessage",
      ListMcpResources: "ListMcpResourcesTool",
      ReadMcpResource: "ReadMcpResourceTool",
      ReadMcpResourceDir: "ReadMcpResourceDirTool"
    };
    Hnt = `mcp__${"workspace"}__bash`;
    EOs = `mcp__${"workspace"}__web_fetch`;
  });
  function vOs(e) {
    return Ayn.filePatternTools.includes(e);
  }
  function wOs(e) {
    return Ayn.bashPrefixTools.includes(e);
  }
  function COs(e) {
    return Object.hasOwn(Ayn.customValidation, e) ? Ayn.customValidation[e] : undefined;
  }
  var Ayn;
  var ROs = __lazy(() => {
    Ayn = {
      filePatternTools: ["Read", "Write", "Edit", "Glob", "NotebookRead", "NotebookEdit", "Cd"],
      bashPrefixTools: ["Bash"],
      customValidation: {
        WebSearch: e => {
          if (e.includes("*") || e.includes("?")) {
            return {
              valid: false,
              error: "WebSearch does not support wildcards",
              suggestion: "Use exact search terms without * or ?",
              examples: ["WebSearch(claude ai)", "WebSearch(typescript tutorial)"]
            };
          }
          return {
            valid: true
          };
        },
        WebFetch: e => {
          if (e.includes("://") || e.startsWith("http")) {
            return {
              valid: false,
              error: "WebFetch permissions use domain format, not URLs",
              suggestion: 'Use "domain:hostname" format',
              examples: ["WebFetch(domain:example.com)", "WebFetch(domain:github.com)"]
            };
          }
          if (!e.startsWith("domain:")) {
            return {
              valid: false,
              error: 'WebFetch permissions must use "domain:" prefix',
              suggestion: 'Use "domain:hostname" format',
              examples: ["WebFetch(domain:example.com)", "WebFetch(domain:*.google.com)"]
            };
          }
          return {
            valid: true
          };
        }
      }
    };
  });
  function xOs(e, t) {
    let n = 0;
    let r = t - 1;
    while (r >= 0 && e[r] === "\\") {
      n++;
      r--;
    }
    return n % 2 !== 0;
  }
  function Q1r(e, t) {
    let n = 0;
    for (let r = 0; r < e.length; r++) {
      if (e[r] === t && !xOs(e, r)) {
        n++;
      }
    }
    return n;
  }
  function kGu(e) {
    for (let t = 0; t < e.length - 1; t++) {
      if (e[t] === "(" && e[t + 1] === ")") {
        if (!xOs(e, t)) {
          return true;
        }
      }
    }
    return false;
  }
  function Iyn(e) {
    if (!$ke(e)) {
      return null;
    }
    let t = TI(e);
    if (t && !$ke(t.serverName)) {
      return null;
    }
    return {
      valid: false,
      error: `Wildcard tool name "${e}" is not supported in allow rules`,
      suggestion: "An allow pattern must name the scope it widens \u2014 globs are permitted only in the tool position after a literal mcp__<server>__ prefix. Deny and ask rules accept wildcards anywhere",
      examples: ["mcp__puppeteer__*", "mcp__github__get_*"]
    };
  }
  function Z1r(e, t) {
    if (!e || e.trim() === "") {
      return {
        valid: false,
        error: "Permission rule cannot be empty"
      };
    }
    let n = Q1r(e, "(");
    let r = Q1r(e, ")");
    if (n !== r) {
      return {
        valid: false,
        error: "Mismatched parentheses",
        suggestion: "Ensure all opening parentheses have matching closing parentheses"
      };
    }
    if (kGu(e)) {
      let a = e.substring(0, e.indexOf("("));
      if (!a) {
        return {
          valid: false,
          error: "Empty parentheses with no tool name",
          suggestion: "Specify a tool name before the parentheses"
        };
      }
      return {
        valid: false,
        error: "Empty parentheses",
        suggestion: `Either specify a pattern or use just "${a}" without parentheses`,
        examples: [`${a}`, `${a}(some-pattern)`]
      };
    }
    let o = Nh(e);
    let s = TI(o.toolName);
    if (s) {
      if (o.ruleContent !== undefined || Q1r(e, "(") > 0) {
        return {
          valid: false,
          error: "MCP rules do not support patterns in parentheses",
          suggestion: `Use "${o.toolName}" without parentheses, or use "mcp__${s.serverName}__*" for all tools`,
          examples: [`mcp__${s.serverName}`, `mcp__${s.serverName}__*`, s.toolName && s.toolName !== "*" ? `mcp__${s.serverName}__${s.toolName}` : undefined].filter(Boolean)
        };
      }
      if (t === "allow") {
        let a = Iyn(o.toolName);
        if (a) {
          return a;
        }
      }
      return {
        valid: true
      };
    }
    if (!o.toolName || o.toolName.length === 0) {
      return {
        valid: false,
        error: "Tool name cannot be empty"
      };
    }
    if (t === "allow") {
      let a = Iyn(o.toolName);
      if (a) {
        return a;
      }
    }
    if (!o.toolName.includes("_") && o.toolName[0] !== o.toolName[0]?.toUpperCase()) {
      return {
        valid: false,
        error: "Tool names must start with uppercase",
        suggestion: `Use "${DD(String(o.toolName))}"`
      };
    }
    let i = COs(o.toolName);
    if (i && o.ruleContent !== undefined) {
      let a = i(o.ruleContent);
      if (!a.valid) {
        return a;
      }
    }
    if (wOs(o.toolName) && o.ruleContent !== undefined) {
      let a = o.ruleContent;
      if (a.includes(":*") && !a.endsWith(":*")) {
        return {
          valid: false,
          error: "The :* pattern must be at the end",
          suggestion: "Move :* to the end for prefix matching, or use * for wildcard matching",
          examples: ["Bash(npm run:*) - prefix matching (legacy)", "Bash(npm run *) - wildcard matching"]
        };
      }
      if (a === ":*") {
        return {
          valid: false,
          error: "Prefix cannot be empty before :*",
          suggestion: "Specify a command prefix before :*",
          examples: ["Bash(npm *)", "Bash(git *)"]
        };
      }
    }
    if (vOs(o.toolName) && o.ruleContent !== undefined) {
      if (o.ruleContent.includes(":*")) {
        return {
          valid: false,
          error: 'The ":*" syntax is only for Bash prefix rules',
          suggestion: 'Use glob patterns like "*" or "**" for file matching',
          examples: [`${o.toolName}(*.ts) - matches .ts files`, `${o.toolName}(src/**) - matches all files in src`, `${o.toolName}(**/*.test.ts) - matches test files`]
        };
      }
    }
    return {
      valid: true
    };
  }
  function AOs(e) {
    return v.string().superRefine((t, n) => {
      let r = Z1r(t, e);
      if (!r.valid) {
        let o = r.error;
        if (r.suggestion) {
          o += `. ${r.suggestion}`;
        }
        if (r.examples && r.examples.length > 0) {
          o += `. Examples: ${r.examples.join(", ")}`;
        }
        n.addIssue({
          code: v.ZodIssueCode.custom,
          message: o,
          params: {
            received: t
          }
        });
      }
    });
  }
  var eLr;
  var kOs;
  var Pyn = __lazy(() => {
    EI();
    EC();
    Zn();
    ROs();
    eLr = we(() => AOs());
    kOs = we(() => AOs("allow"));
  });
  function DOs(e) {
    return v.object({
      allow: v.array(kOs()).optional().describe("List of permission rules for allowed operations"),
      deny: v.array(eLr()).optional().describe("List of permission rules for denied operations"),
      ask: v.array(eLr()).optional().describe("List of permission rules that should always prompt for confirmation"),
      defaultMode: v.enum([...EXTERNAL_PERMISSION_MODES, ...bOs(e)]).optional().describe("Default permission mode when Claude Code needs access"),
      disableBypassPermissionsMode: v.enum(["disable"]).optional().describe("Disable the ability to bypass permission prompts"),
      ..._Os(e),
      additionalDirectories: v.array(v.string()).optional().describe("Additional directories to include in the permission scope")
    }).passthrough();
  }
  function tLr(e) {
    return v.object({
      $schema: v.string().optional().describe("JSON Schema reference for Claude Code settings"),
      apiKeyHelper: v.string().optional().describe("Path to a script that outputs authentication values"),
      proxyAuthHelper: v.string().optional().describe("Shell command that outputs a Proxy-Authorization header value (EAP)"),
      awsCredentialExport: v.string().optional().describe("Path to a script that exports AWS credentials"),
      awsAuthRefresh: v.string().optional().describe("Path to a script that refreshes AWS authentication"),
      gcpAuthRefresh: v.string().optional().describe("Command to refresh GCP authentication (e.g., gcloud auth application-default login)"),
      policyHelper: PGu().optional().describe("Executable that computes managed settings at startup. Honored only from admin-controlled policy sources."),
      ...(st(process.env.CLAUDE_CODE_ENABLE_XAA) && {
        xaaIdp: v.object({
          issuer: v.string().url().describe("IdP issuer URL for OIDC discovery"),
          clientId: v.string().describe("Claude Code's client_id registered at the IdP"),
          callbackPort: v.number().int().positive().optional().describe("Fixed loopback callback port for the IdP OIDC login. Only needed if the IdP does not honor RFC 8252 port-any matching.")
        }).optional().describe("XAA (SEP-990) IdP connection. Configure once; all XAA-enabled MCP servers reuse this.")
      }),
      fileSuggestion: v.object({
        type: v.literal("command"),
        command: v.string()
      }).optional().describe("Custom file suggestion configuration for @ mentions"),
      respectGitignore: v.boolean().optional().describe("Whether file picker should respect .gitignore files (default: true). Note: .ignore files are always respected."),
      breakReminder: v.object({
        enabled: v.boolean().optional().describe("Show a friendly nudge after sustained continuous use (default false). Must be true for the reminder to fire."),
        intervalMinutes: v.number().int().positive().optional().describe("Minutes of continuous use before the reminder fires (default 120). Re-fires every interval until you take a break."),
        breakThresholdMinutes: v.number().int().positive().optional().describe("Minutes of inactivity that count as a break and reset the timer (default 15)"),
        message: v.string().optional().describe("Custom reminder text. Leave unset for a rotating set of friendly nudges.")
      }).optional().describe("@internal Opt-in break reminder. When enabled, shows a dismissible nudge after sustained continuous use. Never blocks \u2014 just a friendly heads-up."),
      quietHours: v.object({
        enabled: v.boolean().optional().describe("Show a one-time nudge when you start or keep using the CLI inside your quiet-hours window (default false)."),
        start: v.string().regex(/^([01]?\d|2[0-3]):[0-5]\d$/, 'Expected 24-hour local time "HH:MM" (e.g. "22:00")').optional().describe('Start of the quiet-hours window, 24-hour local time "HH:MM".'),
        end: v.string().regex(/^([01]?\d|2[0-3]):[0-5]\d$/, 'Expected 24-hour local time "HH:MM" (e.g. "07:00")').optional().describe('End of the quiet-hours window, 24-hour local time "HH:MM". May be earlier than start for an overnight range.')
      }).optional().describe("@internal Opt-in quiet hours. When enabled, shows a single soft nudge per session while inside the configured local-time window. Never blocks."),
      cleanupPeriodDays: v.number().int().positive().optional().describe("Number of days to retain chat transcripts before automatic cleanup (default: 30). Minimum 1. Use a large value for long retention; use --no-session-persistence to disable transcript writes entirely."),
      skillListingMaxDescChars: v.number().int().positive().optional().describe("Per-skill description character cap in the skill listing sent to Claude (default: 1536). Descriptions longer than this are truncated. Raise to opt in to higher per-turn context cost."),
      skillListingBudgetFraction: v.number().gt(0).lte(1).optional().describe("Fraction of the context window (in characters) reserved for the skill listing sent to Claude (default: 0.01 = 1%). When the listing exceeds this, descriptions are shortened to fit. Raise to opt in to higher per-turn context cost."),
      wslInheritsWindowsSettings: v.boolean().optional().describe("When set to true in either admin-only Windows source \u2014 the HKLM SOFTWARE/Policies/ClaudeCode registry key or C:/Program Files/ClaudeCode/managed-settings.json \u2014 WSL reads managed settings from the full Windows policy chain (HKLM, C:/Program Files/ClaudeCode via DrvFs, HKCU) in addition to /etc/claude-code. Windows sources take priority. The flag is also required in HKCU itself for HKCU policy to apply on WSL (double opt-in: admin enables the chain, user confirms HKCU). On native Windows the flag has no effect."),
      env: AGu().optional().describe("Environment variables to set for Claude Code sessions"),
      attribution: v.object({
        commit: v.string().optional().describe("Attribution text for git commits, including any trailers. Empty string hides attribution."),
        pr: v.string().optional().describe("Attribution text for pull request descriptions. Empty string hides attribution."),
        sessionUrl: v.boolean().optional().describe("Whether to append the claude.ai session link to commits and PRs created from web or Remote Control sessions (default: true). Set to false to omit the Claude-Session trailer and PR-body link.")
      }).optional().describe("Customize attribution text for commits and PRs. Each field defaults to the standard Claude Code attribution if not set."),
      includeCoAuthoredBy: v.boolean().optional().describe("Deprecated: Use attribution instead. Whether to include Claude's co-authored by attribution in commits and PRs (defaults to true)"),
      ...false,
      includeGitInstructions: v.boolean().optional().describe("Include built-in commit and PR workflow instructions in Claude's system prompt (default: true)"),
      permissions: DOs(e).optional().describe("Tool usage permissions configuration"),
      model: v.string().optional().describe("Override the default model used by Claude Code"),
      fallbackModel: v.array(v.string()).optional().describe('Fallback model(s) tried in order when the primary model is overloaded or unavailable. Each element accepts a model name or alias; "default" expands to the default model. CLI --fallback-model takes precedence.'),
      availableModels: v.array(v.string()).optional().describe('Allowlist of models that users can select. Accepts family aliases ("opus" allows any opus version), version prefixes ("opus-4-5" allows only that version), and full model IDs. If undefined, all models are available. If empty array, only the default model is available. Typically set in managed settings by enterprise administrators.'),
      enforceAvailableModels: v.boolean().optional().describe("When true and availableModels is a non-empty array, the Default model selection is also constrained: if the default model for the user tier is not in availableModels, Default resolves to the first allowed availableModels entry instead. Has no effect when availableModels is unset or an empty array. Typically set in managed settings by enterprise administrators."),
      modelOverrides: v.record(v.string(), v.string()).optional().describe('Override mapping from Anthropic model ID (e.g. "claude-opus-4-6") to provider-specific model ID (e.g. a Bedrock inference profile ARN). Typically set in managed settings by enterprise administrators.'),
      enableAllProjectMcpServers: v.boolean().optional().describe("Whether to automatically approve all MCP servers in the project"),
      enabledMcpjsonServers: v.array(v.string()).optional().describe("List of approved MCP servers from .mcp.json"),
      disabledMcpjsonServers: v.array(v.string()).optional().describe("List of rejected MCP servers from .mcp.json"),
      disableClaudeAiConnectors: v.boolean().optional().describe("When true in any settings source, claude.ai MCP cloud connectors are not auto-fetched or connected. " + "Only gates auto-fetched connectors \u2014 a claudeai-proxy server passed explicitly " + "(e.g. via --mcp-config or the SDK mcpServers option) still follows the normal MCP config trust flow. Any-source-true wins: a project can opt out, but a project-level false cannot override a user-level true."),
      skillOverrides: v.record(v.string(), v.enum(["on", "name-only", "user-invocable-only", "off"])).optional().describe('Per-skill listing overrides keyed by skill name. "name-only" lists the skill without its description; "user-invocable-only" hides it from the model but keeps /name; "off" hides it from both. Absent = on.'),
      disableBundledSkills: v.boolean().optional().describe("Disable the skills and workflows that ship with Claude Code: bundled skills and workflows are removed entirely; built-in slash commands stay typable but are hidden from the model. Plugins, .claude/skills/, and .claude/commands/ are unaffected. Equivalent to CLAUDE_CODE_DISABLE_BUNDLED_SKILLS=1."),
      allowedMcpServers: v.array(Oyn()).optional().describe("Enterprise allowlist of MCP servers that can be used. Applies to all scopes including enterprise servers from managed-mcp.json. If undefined, all servers are allowed. If empty array, no servers are allowed. Denylist takes precedence - if a server is on both lists, it is denied."),
      deniedMcpServers: v.array(Dyn()).optional().describe("Enterprise denylist of MCP servers that are explicitly blocked. If a server is on the denylist, it will be blocked across all scopes including enterprise. Denylist takes precedence over allowlist - if a server is on both lists, it is denied."),
      hooks: cW().optional().describe("Custom commands to run before/after tool executions"),
      worktree: v.object({
        symlinkDirectories: v.array(v.string()).optional().describe('Directories to symlink from main repository to worktrees to avoid disk bloat. Must be explicitly configured - no directories are symlinked by default. Common examples: "node_modules", ".cache", ".bin"'),
        sparsePaths: v.array(v.string()).optional().describe("Directories to include when creating worktrees, via git sparse-checkout (cone mode). " + "Dramatically faster in large monorepos \u2014 only the listed paths are written to disk."),
        baseRef: v.enum(["fresh", "head"]).optional().describe("Which ref new worktrees branch from. 'fresh' (default) branches from origin/<default-branch> for a clean tree. 'head' branches from your current local HEAD so unpushed commits and feature-branch state are present. Applies to --worktree, EnterWorktree, and agent isolation."),
        bgIsolation: v.enum(["worktree", "none"]).optional().catch(undefined).describe("Isolation mode for background sessions in this repo. 'worktree' (default) blocks Edit/Write in the main checkout until EnterWorktree is called. 'none' lets background jobs edit the working copy directly.")
      }).optional().describe("Git worktree configuration for --worktree flag."),
      disableAllHooks: v.boolean().optional().describe("Disable all hooks and statusLine execution"),
      disableAgentView: v.boolean().optional().describe("Disable agent view (`claude agents`, `--bg`, /background, the on-demand daemon). Typically set in managed settings. Equivalent to CLAUDE_CODE_DISABLE_AGENT_VIEW=1."),
      disableRemoteControl: v.boolean().optional().describe("Disable Remote Control (claude.ai/code, `claude remote-control`, `--remote-control`/`--rc`, auto-start, and the in-session toggle). Typically set in managed settings."),
      disableWorkflows: v.boolean().optional().describe("Disable the Workflows feature (also via CLAUDE_CODE_DISABLE_WORKFLOWS)."),
      disableArtifact: v.boolean().optional().describe("Disable the Artifact tool (also via CLAUDE_CODE_DISABLE_ARTIFACT)."),
      enableArtifact: v.boolean().optional().describe("Enable or disable the Artifact tool for this user. Unset defaults to enabled once the feature is available."),
      enableWorkflows: v.boolean().optional().describe("Enable or disable the Workflows feature for this user. Unset = default by plan once the feature is available."),
      workflowKeywordTriggerEnabled: v.boolean().optional().describe('Enable the "ultracode" keyword trigger: including the keyword in a prompt opts that turn into the Workflow tool. Set to false to disable the trigger. Default: true.'),
      disableSkillShellExecution: v.boolean().optional().describe("Disable inline shell execution in skills and custom slash commands from user, project, or plugin sources. Commands are replaced with a placeholder instead of being run."),
      defaultShell: v.enum(["bash", "powershell"]).optional().describe("Default shell for input-box ! commands. Defaults to 'bash' on all platforms (no Windows auto-flip)."),
      respondToBashCommands: v.boolean().optional().describe("Whether Claude responds after an input-box ! bash command runs. Set to false to add the command output to context without a response. Default: true."),
      allowManagedHooksOnly: v.boolean().optional().describe("When true (and set in managed settings), only hooks from managed settings run. User, project, and local hooks are ignored."),
      allowedHttpHookUrls: v.array(v.string()).optional().describe('Allowlist of URL patterns that HTTP hooks may target. Supports * as a wildcard (e.g. "https://hooks.example.com/*"). When set, HTTP hooks with non-matching URLs are blocked. If undefined, all URLs are allowed. If empty array, no HTTP hooks are allowed. Arrays merge across settings sources (same semantics as allowedMcpServers).'),
      httpHookAllowedEnvVars: v.array(v.string()).optional().describe("Allowlist of environment variable names HTTP hooks may interpolate into headers. When set, each hook's effective allowedEnvVars is the intersection with this list. If undefined, no restriction is applied. Arrays merge across settings sources (same semantics as allowedMcpServers)."),
      allowManagedPermissionRulesOnly: v.boolean().optional().describe("When true (and set in managed settings), only permission rules (allow/deny/ask) from managed settings are respected. User, project, local, and CLI argument permission rules are ignored."),
      allowManagedMcpServersOnly: v.boolean().optional().describe("When true (and set in managed settings), allowedMcpServers is only read from managed settings. deniedMcpServers still merges from all sources, so users can deny servers for themselves. Users can still add their own MCP servers, but only the admin-defined allowlist applies."),
      allowAllClaudeAiMcps: v.boolean().optional().describe("When true (and set in managed settings), claude.ai cloud MCP connectors load alongside managed-mcp.json instead of being suppressed by its exclusive-control lockdown. Default off preserves the lockdown. Read from managed settings only."),
      strictPluginOnlyCustomization: v.preprocess(t => Array.isArray(t) ? t.filter(n => Hke.includes(n)) : t, v.union([v.boolean(), v.array(v.enum(Hke))])).optional().catch(undefined).describe('When set in managed settings, blocks non-plugin customization sources for the listed surfaces. Array form locks specific surfaces (e.g. ["skills", "hooks"]); `true` locks all four; `false` is an explicit no-op. Blocked: ~/.claude/{surface}/, .claude/{surface}/ (project), settings.json hooks, .mcp.json. NOT blocked: managed (policySettings) sources, plugin-provided customizations. ' + "Composes with strictKnownMarketplaces for end-to-end admin control \u2014 plugins gated by " + "marketplace allowlist, everything else blocked here."),
      statusLine: v.object({
        type: v.literal("command"),
        command: v.string(),
        padding: v.number().optional(),
        refreshInterval: v.number().min(1).optional().catch(undefined).describe("Re-run the status line command every N seconds in addition to event-driven updates"),
        hideVimModeIndicator: v.boolean().optional().describe("Hide the built-in `-- INSERT --` / `-- VISUAL --` indicator below the prompt. Use this when your status line script renders `vim.mode` itself.")
      }).optional().describe("Custom status line display configuration"),
      prUrlTemplate: v.string().optional().describe('URL template for PR links in the footer link badges and inline messages. The detected git PR is rendered as the first footer-link badge. Placeholders: {host} {owner} {repo} {number} {url}. Example: "https://reviews.example.com/{owner}/{repo}/pull/{number}"'),
      footerLinksRegexes: v.array(OGu().catch(IOs)).transform(t => t.filter(n => n !== IOs)).optional().catch(undefined).describe("Extra clickable footer badges that appear when a regex matches turn output (tool results and assistant responses). Read from user, flag, and managed settings only; ignored in project .claude/settings.json and local .claude/settings.local.json. At most 5 badges render; the oldest is displaced by newer matches and /clear removes them. Use to surface IDs printed by project CLIs as session links."),
      subagentStatusLine: v.object({
        type: v.literal("command"),
        command: v.string()
      }).optional().describe("Custom per-subagent status line shown in the agent panel; receives row context as JSON on stdin"),
      enabledPlugins: v.record(v.string(), v.union([v.array(v.string()), v.boolean(), v.undefined()])).optional().describe('Enabled plugins using plugin-id@marketplace-id format. Example: { "formatter@anthropic-tools": true }. Also supports extended format with version constraints. Settings precedence is user < project < local < flag < policy, so to disable a plugin that project settings enable, set it to false in .claude/settings.local.json \u2014 setting false in ~/.claude/settings.json is overridden by the project.'),
      extraKnownMarketplaces: v.record(v.string(), IGu()).check(t => {
        for (let [n, r] of Object.entries(t.value)) {
          if (r.source.source === "settings" && r.source.name !== n) {
            t.issues.push({
              code: "custom",
              input: r.source.name,
              path: [n, "source", "name"],
              message: `Settings-sourced marketplace name must match its extraKnownMarketplaces key (got key "${n}" but source.name "${r.source.name}")`
            });
          }
        }
      }).optional().describe("Additional marketplaces to make available for this repository. Typically used in repository .claude/settings.json to ensure team members have required plugin sources."),
      strictKnownMarketplaces: v.array(BMt()).optional().describe("Enterprise strict list of allowed marketplace sources. When set in managed settings, ONLY these exact sources can be added as marketplaces. The check happens BEFORE downloading, so blocked sources never touch the filesystem. " + "Note: this is a policy gate only \u2014 it does NOT register marketplaces. " + "To pre-register allowed marketplaces for users, also set extraKnownMarketplaces."),
      blockedMarketplaces: v.array(BMt()).optional().describe("Enterprise blocklist of marketplace sources. When set in managed settings, these exact sources are blocked from being added as marketplaces. The check happens BEFORE downloading, so blocked sources never touch the filesystem."),
      disableSideloadFlags: v.boolean().optional().describe("When true (and set in managed settings), rejects the --plugin-dir, --plugin-url, --agents, and non-sdk --mcp-config CLI flags at startup. Closes the CLI-flag bypass of strictKnownMarketplaces. Pair with allowedMcpServers for per-server MCP control; this setting does not gate other MCP entry points (SDK setMcpServers, claude mcp add, .mcp.json). Also blocks surfaces that spawn the CLI with these flags internally (see settings documentation). Only honored from managed settings; ignored in user/project/local settings."),
      pluginSuggestionMarketplaces: v.array(v.string()).optional().describe("Marketplace names whose plugins may surface as contextual install suggestions (relevance-based tips). No marketplace-declared suggestions surface without this allowlist; the built-in first-party frontend-design tip is unaffected. Only honored when set in managed settings (policy scope); the key is ignored in user, project, and local settings. A name only takes effect when the marketplace is registered on the machine AND its registered source is also declared in managed settings, either as the extraKnownMarketplaces entry for that name or as an entry of strictKnownMarketplaces. A marketplace registered from a different source under an allowlisted name is ignored. The official marketplace is exempt from the source requirement: allowlisting its name alone suffices, since that name can only register from the official Anthropic source."),
      forceLoginMethod: v.enum(["claudeai", "console", "gateway"]).optional().catch(undefined).describe('Force a specific login method: "claudeai" for Claude Pro/Max, "console" for Console billing, "gateway" for the Cloud gateway OIDC device flow'),
      forceLoginGatewayUrl: v.string().url().optional().catch(undefined).describe('@internal Cloud gateway URL to pre-fill and auto-connect to during login. Typically set in local managed settings alongside forceLoginMethod: "gateway" so users never type the URL. Hidden from public SDK types until Cloud gateway is documented.'),
      parentSettingsBehavior: v.enum(["first-wins", "merge"]).optional().describe('Controls whether the SDK parent tier (Options.managedSettings / --managed-settings) layers under this admin tier. "first-wins" ' + "(default): parent is dropped \u2014 admin tiers are the only policy " + `source. "merge": parent's restrictive-only-filtered settings union under the admin winner. Has no effect when no admin tier exists (parent applies as the sole policy tier, still filtered restrictive-only).`),
      forceLoginOrgUUID: v.union([v.string(), v.array(v.string())]).optional().describe("Organization UUID to require for OAuth login. Accepts a single UUID string or an array of UUIDs (any one is permitted). When set in managed settings, login fails if the authenticated account does not belong to a listed organization."),
      forceRemoteSettingsRefresh: v.boolean().optional().describe("When set in managed settings, the CLI blocks startup until remote managed settings are freshly fetched, and exits if the fetch fails"),
      otelHeadersHelper: v.string().optional().describe("Path to a script that outputs OpenTelemetry headers"),
      outputStyle: v.string().optional().describe("Controls the output style for assistant responses"),
      viewMode: v.enum(["default", "verbose", "focus"]).optional().catch(undefined).describe("Default transcript view mode on startup"),
      language: v.string().optional().describe('Preferred language for Claude responses and voice dictation (e.g., "japanese", "spanish")'),
      skipWebFetchPreflight: v.boolean().optional().describe("Skip the WebFetch blocklist check for enterprise environments with restrictive security policies"),
      sandbox: v1r().optional(),
      feedbackSurveyRate: v.number().min(0).max(1).optional().describe("Probability (0\u20131) that the session quality survey appears when eligible. 0.05 is a reasonable starting point."),
      spinnerTipsEnabled: v.boolean().optional().describe("Whether to show tips in the spinner"),
      spinnerVerbs: v.object({
        mode: v.enum(["append", "replace"]),
        verbs: v.array(v.string())
      }).optional().describe('Customize spinner verbs. mode: "append" adds verbs to defaults, "replace" uses only your verbs.'),
      spinnerTipsOverride: v.object({
        excludeDefault: v.boolean().optional(),
        tips: v.array(v.string())
      }).optional().describe("Override spinner tips. tips: array of tip strings. excludeDefault: if true, only show custom tips (default: false)."),
      syntaxHighlightingDisabled: v.boolean().optional().describe("Whether to disable syntax highlighting in diffs"),
      terminalTitleFromRename: v.boolean().optional().describe("Whether /rename updates the terminal tab title (defaults to true). Set to false to keep auto-generated topic titles."),
      alwaysThinkingEnabled: v.boolean().optional().describe("When false, thinking is disabled. When absent or true, thinking is enabled automatically for supported models."),
      effortLevel: v.enum(["low", "medium", "high", "xhigh"]).optional().catch(undefined).describe("Persisted effort level for supported models."),
      ultracode: v.boolean().optional().catch(undefined).describe("Enable ultracode for the session: xhigh effort plus standing dynamic-workflow orchestration. " + "Session-scoped \u2014 typically provided via --settings or the apply_flag_settings control request; " + "interactive toggles never persist it. Requires workflows to be enabled and an xhigh-capable model."),
      autoCompactWindow: v.number().int().min(1e5).max(1e6).optional().catch(undefined).describe("Auto-compact window size"),
      advisorModel: v.string().optional().describe("Advisor model for the server-side advisor tool."),
      fastMode: v.boolean().optional().describe("When true, fast mode is enabled. When absent or false, fast mode is off."),
      fastModePerSessionOptIn: v.boolean().optional().describe("When true, fast mode does not persist across sessions. Each session starts with fast mode off."),
      promptSuggestionEnabled: v.boolean().optional().describe("When false, prompt suggestions are disabled. When absent or true, prompt suggestions are enabled."),
      awaySummaryEnabled: v.boolean().optional().describe("@internal When false, the session recap (shown when you return after being away for 5+ minutes) is disabled. When absent or true, recap is enabled. Hidden from public SDK types until external launch."),
      showClearContextOnPlanAccept: v.boolean().optional().describe('When true, the plan-approval dialog offers a "clear context" option. Defaults to false.'),
      agent: v.string().optional().describe("Name of an agent (built-in or custom) to use for the main thread. Applies the agent's system prompt, tool restrictions, and model."),
      companyAnnouncements: v.array(v.string()).optional().describe("Company announcements to display at startup (one will be randomly selected if multiple are provided)"),
      pluginConfigs: v.record(v.string(), v.object({
        mcpServers: v.record(v.string(), v.record(v.string(), v.union([v.string(), v.number(), v.boolean(), v.array(v.string())]))).optional().describe("User configuration values for MCP servers keyed by server name"),
        options: v.record(v.string(), v.union([v.string(), v.number(), v.boolean(), v.array(v.string())])).optional().describe("Non-sensitive option values from plugin manifest userConfig, keyed by option name. Sensitive values go to secure storage instead.")
      }).or(v.undefined())).optional().describe("Per-plugin configuration including MCP server user configs, keyed by plugin ID (plugin@marketplace format)"),
      remote: v.object({
        defaultEnvironmentId: v.string().optional().describe("Default environment ID to use for cloud sessions")
      }).optional().describe("Cloud session configuration"),
      autoUpdatesChannel: v.enum(["latest", "stable", "rc"]).optional().describe("Release channel for auto-updates (latest or stable)"),
      minimumVersion: v.string().optional().describe("Minimum version to stay on - prevents downgrades when switching to stable channel"),
      requiredMinimumVersion: v.string().optional().describe("Minimum Claude Code version required to start. If the running version is older, Claude Code exits at startup with instructions to update. Only enforced from managed (policy) settings."),
      requiredMaximumVersion: v.string().optional().describe("Maximum Claude Code version allowed to start. If the running version is newer, Claude Code exits at startup with instructions to install an approved version. Only enforced from managed (policy) settings."),
      plansDirectory: v.string().optional().describe("Custom directory for plan files, relative to project root. If not set, defaults to ~/.claude/plans/"),
      tui: v.enum(["default", "fullscreen"]).optional().describe('Terminal UI renderer. "fullscreen" uses the flicker-free alt-screen renderer with virtualized scrollback (equivalent to CLAUDE_CODE_NO_FLICKER=1). "default" uses the classic main-screen renderer.'),
      ...false,
      voice: v.object({
        enabled: v.boolean().optional(),
        mode: v.enum(["hold", "tap"]).optional().describe("'hold' (default): hold to talk. 'tap': tap to start, tap to stop+submit."),
        autoSubmit: v.boolean().optional().describe("Submit the prompt when hold-to-talk is released (hold mode only)")
      }).optional().describe("Voice mode settings (hold-to-talk / tap-to-toggle dictation)"),
      channelsEnabled: v.boolean().optional().describe("Managed-org opt-in for channel notifications (MCP servers with the claude/channel capability pushing inbound messages). claude.ai Teams/Enterprise: default off. Console: default on unless managed settings exist. Set true to allow; users then select servers via --channels."),
      allowedChannelPlugins: v.array(v.object({
        marketplace: v.string(),
        plugin: v.string()
      })).optional().describe("Managed-org allowlist of channel plugins. When set, " + "replaces the default Anthropic allowlist \u2014 admins decide which " + "plugins may push inbound messages. Undefined falls back to the default. Requires channelsEnabled: true."),
      prefersReducedMotion: v.boolean().optional().describe("Reduce or disable animations for accessibility (spinner shimmer, flash effects, etc.)"),
      doneMeansMerged: v.boolean().optional().describe("@internal When true, Claude keeps working until the PR is ready for you to merge, a cron/Monitor is armed to resume later, or it hands you a self-contained next step."),
      totalTokensReminder: v.enum(["off", "infinite", "fixed", "countdown", "padded-countdown"]).optional().describe("@internal Emit a <total_tokens>N tokens left</total_tokens> block in the system prompt and after each tool result. 'infinite' uses the literal value Infinite, 'fixed' uses 5000000, 'countdown' uses the live remaining context-window tokens, 'padded-countdown' counts down from totalTokensReminderBudget by per-agent cumulative context spend (monotonic across compaction and /clear). Defaults to off. Env var CLAUDE_CODE_TOTAL_TOKENS_REMINDER overrides."),
      totalTokensReminderBudget: v.number().int().positive().optional().describe("@internal Starting budget (tokens) for totalTokensReminder 'padded-countdown' mode. Defaults to 15000000. Server-controlled via GrowthBook; env var CLAUDE_CODE_TOTAL_TOKENS_REMINDER_BUDGET overrides."),
      autoMemoryEnabled: v.boolean().optional().describe("Enable auto-memory for this project. When false, Claude will not read from or write to the auto-memory directory."),
      autoMemoryDirectory: v.string().optional().describe("Custom directory path for auto-memory storage. Supports ~/ prefix for home directory expansion. Ignored if set in projectSettings (checked-in .claude/settings.json) for security. When unset, defaults to ~/.claude/projects/<sanitized-cwd>/memory/."),
      autoDreamEnabled: v.boolean().optional().describe("Enable background memory consolidation (auto-dream). When set, overrides the server-side default."),
      showThinkingSummaries: v.boolean().optional().describe("Request API-side thinking summaries and show them in the conversation and in the transcript view (ctrl+o). Set explicitly to override the default for your install."),
      skipDangerousModePermissionPrompt: v.boolean().optional().describe("Whether the user has accepted the bypass permissions mode dialog"),
      skipWorkflowUsageWarning: v.boolean().optional().describe("@internal Whether the user has accepted the multi-agent workflow usage warning. Until set, auto permission mode prompts before running a workflow."),
      disableAutoMode: v.enum(["disable"]).optional().describe("Disable auto mode"),
      sshConfigs: v.array(v.object({
        id: v.string().describe("Unique identifier for this SSH config. Used to match configs across settings sources."),
        name: v.string().describe("Display name for the SSH connection"),
        sshHost: v.string().describe('SSH host in format "user@hostname" or "hostname", or a host alias from ~/.ssh/config'),
        sshPort: v.number().int().optional().describe("SSH port (default: 22)"),
        sshIdentityFile: v.string().optional().describe("Path to SSH identity file (private key)"),
        startDirectory: v.string().optional().describe("Default working directory on the remote host. Supports tilde expansion (e.g. ~/projects). If not specified, defaults to the remote user home directory. Can be overridden by the [dir] positional argument in `claude ssh <config> [dir]`.")
      })).optional().describe("SSH connection configurations for remote environments. Typically set in managed settings by enterprise administrators to pre-configure SSH connections for team members."),
      claudeMd: v.string().optional().describe("CLAUDE.md-style instructions injected as organization-managed memory. Only honored from managed/policy settings."),
      claudeMdExcludes: v.array(v.string()).optional().describe('Glob patterns or absolute paths of CLAUDE.md files to exclude from loading. Patterns are matched against absolute file paths using picomatch. Only applies to User, Project, and Local memory types (Managed/policy files cannot be excluded). Examples: "/home/user/monorepo/CLAUDE.md", "**/code/CLAUDE.md", "**/some-dir/.claude/rules/**"'),
      pluginTrustMessage: v.string().optional().describe('Custom message to append to the plugin trust warning shown before installation. Only read from policy settings (managed-settings.json / MDM). Useful for enterprise administrators to add organization-specific context (e.g., "All plugins from our internal marketplace are vetted and approved.").'),
      theme: v.union([v.enum(EMt), v.string().startsWith("custom:").transform(t => t)]).optional().catch(undefined).describe("Color theme for the UI"),
      editorMode: v.enum(EDITOR_MODES).optional().catch(undefined).describe("Key binding mode for the prompt input"),
      verbose: v.boolean().optional().describe("Show full tool output instead of truncated summaries"),
      preferredNotifChannel: v.enum(NOTIFICATION_CHANNELS).optional().catch(undefined).describe("Preferred OS notification channel"),
      autoCompactEnabled: v.boolean().optional().describe("Automatically compact conversation when context fills"),
      precomputeCompactionEnabled: v.boolean().optional().describe("@internal Precompute the compaction summary in the background before it is needed. Only applies when auto-compact is on."),
      switchModelsOnFlag: v.boolean().optional().describe("When safety measures flag a message, automatically switch to a different model to keep chatting. When off, your session will pause instead."),
      autoScrollEnabled: v.boolean().optional().describe("Auto-scroll the conversation view to bottom (fullscreen mode only)"),
      wheelScrollAccelerationEnabled: v.boolean().optional().describe("Ramp mouse-wheel scroll speed during fast scrolls (fullscreen mode only)"),
      fileCheckpointingEnabled: v.boolean().optional().describe("Snapshot files before edits so /rewind can restore them"),
      showTurnDuration: v.boolean().optional().describe('Show "Cooked for Nm Ns" after each assistant turn'),
      showMessageTimestamps: v.boolean().optional().describe("Stamp each assistant message with its arrival time"),
      terminalProgressBarEnabled: v.boolean().optional().describe("Emit OSC 9;4 progress sequences during long operations"),
      todoFeatureEnabled: v.boolean().optional().describe("Enable the todo / task tracking panel"),
      teammateMode: v.enum(OPs).optional().catch(undefined).describe("How spawned teammates execute (tmux, iterm2, in-process, auto)"),
      remoteControlAtStartup: v.boolean().optional().describe("Start Remote Control bridge automatically each session"),
      isolatePeerMachines: v.boolean().optional().describe("Require explicit approval before SendMessage can reach a peer session on another machine via Remote Control"),
      daemonColdStart: v.enum(["transient", "ask"]).optional().describe("When no background service is running: 'transient' spawns one for this login session; 'ask' offers to install it persistently"),
      autoUploadSessions: v.boolean().optional().describe("Mirror local sessions to claude.ai as view-only (no remote control)"),
      inputNeededNotifEnabled: v.boolean().optional().describe("Push to mobile when a permission prompt or question is waiting"),
      agentPushNotifEnabled: v.boolean().optional().describe("Allow Claude to push proactive mobile notifications"),
      ...yOs(e)
    }).passthrough();
  }
  function OOs(e, t, n) {
    return v.array(t.catch(r => (n({
      path: `${e}[]`,
      message: `Invalid entry was ignored: ${r.issues[0]?.message ?? "failed validation"}`
    }), POs))).transform(r => r.filter(o => o !== POs)).optional();
  }
  function nLr(e) {
    let t = $N();
    let n = {};
    for (let [i, a] of Object.entries(t.shape)) {
      n[i] = a.catch(l => {
        e({
          path: i,
          message: `${l.issues[0]?.message ?? "Failed schema validation"}. This field was ignored.`
        });
        return;
      });
    }
    n.allowedMcpServers = OOs("allowedMcpServers", Oyn(), e).catch(() => (e({
      path: "allowedMcpServers",
      message: '"allowedMcpServers" was present but invalid; enforcing an empty allowlist (no MCP servers admitted) until it is fixed.'
    }), []));
    n.deniedMcpServers = OOs("deniedMcpServers", Dyn(), e).catch(() => {
      e({
        path: "deniedMcpServers",
        message: '"deniedMcpServers" was present but invalid and was dropped; its entries cannot be enforced until it is fixed.'
      });
      return;
    });
    n.allowManagedMcpServersOnly = t.shape.allowManagedMcpServersOnly.catch(() => (e({
      path: "allowManagedMcpServersOnly",
      message: '"allowManagedMcpServersOnly" was present but invalid; treating it as true until it is fixed.'
    }), true));
    n.enforceAvailableModels = t.shape.enforceAvailableModels.catch(() => (e({
      path: "enforceAvailableModels",
      message: '"enforceAvailableModels" was present but invalid; treating it as true until it is fixed.'
    }), true));
    n.availableModels = v.array(v.unknown()).transform((i, a) => {
      let l = [];
      for (let c of i) {
        if (typeof c === "string") {
          l.push(c);
        } else {
          e({
            path: "availableModels",
            message: `"availableModels" contained a non-string entry (${JSON.stringify(c)}); the entry was ignored.`
          });
        }
      }
      return l;
    }).optional().catch(() => (e({
      path: "availableModels",
      message: '"availableModels" was present but invalid; enforcing an empty allowlist (only the default model is available) until it is fixed.'
    }), []));
    n.forceLoginOrgUUID = t.shape.forceLoginOrgUUID.catch(() => (e({
      path: "forceLoginOrgUUID",
      message: '"forceLoginOrgUUID" was present but invalid; no organization is permitted to log in until it is fixed.'
    }), []));
    let r = Object.freeze({
      mode: "deny"
    });
    let o = (i, a) => v.array(a.catch(l => (e({
      path: `sandbox.credentials.${i}[]`,
      message: `Invalid entry was ignored: ${l.issues[0]?.message ?? "failed validation"}. This credential is NOT protected until the entry is fixed.`
    }), r))).transform(l => l.filter(c => c !== r)).optional();
    n.sandbox = v1r().extend({
      credentials: v.object({
        files: o("files", T1r()),
        envVars: o("envVars", E1r())
      }).optional().catch(i => {
        e({
          path: "sandbox.credentials",
          message: `${i.issues[0]?.message ?? "Failed schema validation"}. The credentials block was dropped; no credential protection is applied until it is fixed.`
        });
        return;
      })
    }).optional().catch(i => {
      e({
        path: "sandbox",
        message: `${i.issues[0]?.message ?? "Failed schema validation"}. This field was ignored.`
      });
      return;
    });
    return v.object(n).passthrough().transform(i => {
      for (let a of Object.keys(i)) {
        if (i[a] === undefined) {
          delete i[a];
        }
      }
      return i;
    });
  }
  function jnt(e) {
    return "serverName" in e && e.serverName !== undefined;
  }
  function Myn(e) {
    return "serverCommand" in e && e.serverCommand !== undefined;
  }
  function Nyn(e) {
    return "serverUrl" in e && e.serverUrl !== undefined;
  }
  var AGu;
  var P0h;
  var IGu;
  var Oyn;
  var Dyn;
  var PGu;
  var Hke;
  var IOs;
  var OGu;
  var $N;
  var POs;
  var Rj = __lazy(() => {
    PPs();
    vMt();
    gn();
    HT();
    TC();
    SOs();
    Pyn();
    DMt();
    DMt();
    AGu = we(() => v.record(v.string(), v.coerce.string()));
    P0h = we(() => DOs(z1r()));
    IGu = we(() => v.object({
      source: BMt().describe("Where to fetch the marketplace from"),
      installLocation: v.string().optional().describe("Local cache path where marketplace manifest is stored (auto-generated if not provided)"),
      autoUpdate: v.boolean().optional().describe("Whether to automatically update this marketplace and its installed plugins on startup")
    }));
    Oyn = we(() => v.object({
      serverName: v.string().regex(/^[a-zA-Z0-9_-]+$/, "Server name can only contain letters, numbers, hyphens, and underscores").optional().describe("Name of the MCP server that users are allowed to configure"),
      serverCommand: v.array(v.string()).min(1, "Server command must have at least one element (the command)").optional().describe("Command array [command, ...args] to match exactly for allowed stdio servers"),
      serverUrl: v.string().optional().describe('URL pattern with wildcard support (e.g., "https://*.example.com/*") for allowed remote MCP servers')
    }).refine(e => Bn([e.serverName !== undefined, e.serverCommand !== undefined, e.serverUrl !== undefined], Boolean) === 1, {
      message: 'Entry must have exactly one of "serverName", "serverCommand", or "serverUrl"'
    }));
    Dyn = we(() => v.object({
      serverName: v.string().min(1, "Server name must be non-empty").refine(e => e.trim().length > 0, {
        message: "Server name must not be whitespace-only"
      }).refine(e => e === e.trim(), {
        message: "Server name has leading or trailing whitespace and will never match (names are compared verbatim)"
      }).optional().describe("Name of the MCP server that is explicitly blocked"),
      serverCommand: v.array(v.string()).min(1, "Server command must have at least one element (the command)").optional().describe("Command array [command, ...args] to match exactly for blocked stdio servers"),
      serverUrl: v.string().optional().describe('URL pattern with wildcard support (e.g., "https://*.example.com/*") for blocked remote MCP servers')
    }).refine(e => Bn([e.serverName !== undefined, e.serverCommand !== undefined, e.serverUrl !== undefined], Boolean) === 1, {
      message: 'Entry must have exactly one of "serverName", "serverCommand", or "serverUrl"'
    }));
    PGu = we(() => v.object({
      path: v.string().describe("Absolute path to the helper executable"),
      timeoutMs: v.number().int().min(1000).optional(),
      refreshIntervalMs: v.union([v.literal(0), v.number().int().min(60000)]).optional()
    }));
    Hke = ["skills", "agents", "hooks", "mcp"];
    IOs = Object.freeze({
      type: "invalid-entry-stripped"
    });
    OGu = we(() => v.union([v.object({
      type: v.literal("regex").describe('Config variant. This client understands "regex": matches turn output and builds a URL from named capture groups. Entries with other variants are preserved but skipped at runtime.'),
      pattern: v.string().describe("Regex matched against turn output (tool results and assistant text)"),
      url: v.string().describe("Link target. {name} placeholders are filled from named regex capture groups, e.g. (?<id>...) -> {id}. Values are URL-encoded; the origin must be literal in the template. The scheme must be https, http, or a recognized editor or workspace deep-link scheme: vscode, vscode-insiders, cursor, windsurf, zed, jetbrains, idea, slack, linear, notion, figma."),
      label: v.string().optional().describe("Badge text. {name} placeholders filled from named capture groups; defaults to the full match.")
    }).passthrough(), v.object({
      type: v.string().describe("Config variant discriminator for entries this client does not understand; the entry is preserved as-is and skipped at runtime.")
    }).passthrough()]));
    $N = we(() => tLr(z1r()));
    POs = Object.freeze({
      serverName: "invalid-entry-stripped"
    });
  });
  function rLr(e) {
    let t = e ? tLr(e) : $N();
    let n = toJSONSchema(t, {
      unrepresentable: "any"
    });
    return De(n, null, 2);
  }
  var MOs = __lazy(() => {
    Rj();
  });
  function NOs(e) {
    let t = DGu.find(r => r.matches(e));
    if (!t) {
      return null;
    }
    let n = {
      ...t.tip
    };
    if (e.code === "invalid_value" && e.enumValues && !n.suggestion) {
      n.suggestion = `Valid values: ${e.enumValues.map(r => `"${r}"`).join(", ")}`;
    }
    if (!n.docLink && e.path) {
      n.docLink = MGu[ii(e.path, ".")];
    }
    return n;
  }
  var DGu;
  var MGu;
  var LOs = __lazy(() => {
    Zn();
    DGu = [{
      matches: e => e.path === "permissions.defaultMode" && e.code === "invalid_value",
      tip: {
        suggestion: 'Valid modes: "acceptEdits" (ask before file changes), "plan" (analysis only), "bypassPermissions" (auto-accept all), or "default" (standard behavior)',
        docLink: `${"https://code.claude.com/docs/en"}/iam#permission-modes`
      }
    }, {
      matches: e => e.path === "apiKeyHelper" && e.code === "invalid_type",
      tip: {
        suggestion: 'Provide a shell command that outputs your API key to stdout. The script should output only the API key. Example: "/bin/generate_temp_api_key.sh"'
      }
    }, {
      matches: e => e.path === "cleanupPeriodDays" && e.code === "too_small",
      tip: {
        suggestion: 'cleanupPeriodDays must be at least 1. To keep transcripts for a long time, set a large number (e.g. 3650 for ~10 years). To disable transcript writes entirely, remove this setting and use the --no-session-persistence CLI flag or the SDK persistSession:false option instead. (0 is rejected because it previously silently disabled all transcript writes, which users setting it to mean "never clean up" did not expect.)'
      }
    }, {
      matches: e => e.path.startsWith("env.") && e.code === "invalid_type",
      tip: {
        suggestion: 'Environment variables must be strings. Wrap numbers and booleans in quotes. Example: "DEBUG": "true", "PORT": "3000"',
        docLink: `${"https://code.claude.com/docs/en"}/settings#environment-variables`
      }
    }, {
      matches: e => (e.path === "permissions.allow" || e.path === "permissions.deny") && e.code === "invalid_type" && e.expected === "array",
      tip: {
        suggestion: 'Permission rules must be in an array. Format: ["Tool(specifier)"]. Examples: ["Bash(npm run build)", "Edit(docs/**)", "Read(~/.zshrc)"]. Use * for wildcards.'
      }
    }, {
      matches: e => e.path.startsWith("hooks.") && e.code === "invalid_key",
      tip: {
        suggestion: "Not a recognized hook event. Common events: PreToolUse, PostToolUse, UserPromptSubmit, SessionStart, SessionEnd, Stop. Check spelling and capitalization.",
        docLink: `${"https://code.claude.com/docs/en"}/hooks`
      }
    }, {
      matches: e => /\.hooks\.\d+\.command$/.test(e.path) && e.code === "invalid_type" && e.received === "undefined",
      tip: {
        suggestion: 'Command hooks require `command`. For exec form (no shell), set `command` to the executable and `args` to its arguments: {"type": "command", "command": "echo", "args": ["hi"]}. For shell form, set `command` to the full shell string: {"type": "command", "command": "echo hi"}.',
        docLink: `${"https://code.claude.com/docs/en"}/hooks#exec-form-and-shell-form`
      }
    }, {
      matches: e => e.path.includes("hooks") && e.code === "invalid_type",
      tip: {
        suggestion: 'Hooks use a matcher + hooks array. The matcher is a string: a tool name ("Bash"), pipe-separated list ("Edit|Write"), or empty to match all. Example: {"PostToolUse": [{"matcher": "Edit|Write", "hooks": [{"type": "command", "command": "echo Done"}]}]}'
      }
    }, {
      matches: e => e.code === "invalid_type" && e.expected === "boolean",
      tip: {
        suggestion: 'Use true or false without quotes. Example: "includeCoAuthoredBy": true'
      }
    }, {
      matches: e => e.code === "unrecognized_keys",
      tip: {
        suggestion: "Check for typos or refer to the documentation for valid fields",
        docLink: `${"https://code.claude.com/docs/en"}/settings`
      }
    }, {
      matches: e => e.code === "invalid_value" && e.enumValues !== undefined,
      tip: {
        suggestion: undefined
      }
    }, {
      matches: e => e.code === "invalid_type" && e.expected === "object" && e.received === null && e.path === "",
      tip: {
        suggestion: "Check for missing commas, unmatched brackets, or trailing commas. Use a JSON validator to identify the exact syntax error."
      }
    }, {
      matches: e => e.path === "permissions.additionalDirectories" && e.code === "invalid_type",
      tip: {
        suggestion: 'Must be an array of directory paths. Example: ["~/projects", "/tmp/workspace"]. You can also use --add-dir flag or /add-dir command',
        docLink: `${"https://code.claude.com/docs/en"}/iam#working-directories`
      }
    }];
    MGu = {
      permissions: `${"https://code.claude.com/docs/en"}/iam#configuring-permissions`,
      env: `${"https://code.claude.com/docs/en"}/settings#environment-variables`,
      hooks: `${"https://code.claude.com/docs/en"}/hooks`
    };
  });
  function FOs(e) {
    return e.code === "invalid_type";
  }
  function UOs(e) {
    return e.code === "invalid_value";
  }
  function LGu(e) {
    return e.code === "unrecognized_keys";
  }
  function BOs(e) {
    return e.code === "too_small";
  }
  function qnt(e) {
    if (e === null) {
      return "null";
    }
    if (e === undefined) {
      return "undefined";
    }
    if (Array.isArray(e)) {
      return "array";
    }
    return typeof e;
  }
  function $Os(e) {
    let t = e.match(/received (\w+)/);
    return t ? t[1] : undefined;
  }
  function Wnt(e, t) {
    return e.issues.map(n => {
      let r = n.path.map(String).join(".");
      let o = n.message;
      let s;
      let i;
      let a;
      let l;
      let c;
      if (UOs(n)) {
        i = n.values.map(d => String(d));
        a = i.join(" | ");
        l = undefined;
        c = undefined;
      } else if (FOs(n)) {
        a = n.expected;
        let d = $Os(n.message);
        l = d ?? qnt(n.input);
        c = d ?? qnt(n.input);
      } else if (BOs(n)) {
        a = String(n.minimum);
      } else if (n.code === "custom" && "params" in n) {
        l = n.params.received;
        c = l;
      }
      let u = NOs({
        path: r,
        code: n.code,
        expected: a,
        received: l,
        enumValues: i,
        message: n.message,
        value: l
      });
      if (UOs(n)) {
        s = i?.map(d => `"${d}"`).join(", ");
        o = `Invalid value. Expected one of: ${s}`;
      } else if (FOs(n)) {
        let d = $Os(n.message) ?? qnt(n.input);
        if (n.expected === "object" && d === "null" && r === "") {
          o = "Invalid or malformed JSON";
        } else {
          o = `Expected ${n.expected}, but received ${d}`;
        }
      } else if (LGu(n)) {
        let d = n.keys.join(", ");
        o = `Unrecognized ${un(n.keys.length, "field")}: ${d}`;
      } else if (BOs(n)) {
        o = `Number must be greater than or equal to ${n.minimum}`;
        s = String(n.minimum);
      }
      return {
        file: t,
        path: r,
        message: o,
        expected: s,
        invalidValue: c,
        suggestion: u?.suggestion,
        docLink: u?.docLink
      };
    });
  }
  function oLr(e) {
    try {
      let t = qt(e);
      let n = NGu().safeParse(t);
      if (n.success) {
        return {
          isValid: true
        };
      }
      return {
        isValid: false,
        error: `Settings validation failed:
` + Wnt(n.error, "settings").map(s => {
          let i = `- ${s.path}: ${s.message}`;
          if (s.suggestion) {
            i += `. ${s.suggestion}`;
          }
          return i;
        }).join(`
`),
        fullSchema: rLr()
      };
    } catch (t) {
      return {
        isValid: false,
        error: `Invalid JSON: ${t instanceof Error ? t.message : "Unknown parsing error"}`,
        fullSchema: rLr()
      };
    }
  }
  function FGu(e, t) {
    if (!e || typeof e !== "object") {
      return [];
    }
    let n = e;
    if (!n.permissions || typeof n.permissions !== "object") {
      return [];
    }
    let r = n.permissions;
    let o = [];
    for (let s of ["allow", "deny", "ask"]) {
      let i = r[s];
      if (!Array.isArray(i)) {
        continue;
      }
      r[s] = i.filter(a => {
        if (typeof a !== "string") {
          o.push({
            file: t,
            path: `permissions.${s}`,
            message: `Non-string value in ${s} array was removed`,
            severity: "warning",
            invalidValue: a
          });
          return false;
        }
        let l = Z1r(a, s);
        if (!l.valid) {
          let c = `Invalid permission rule "${a}" was skipped: ${l.error}`;
          if (l.suggestion) {
            c += `. ${l.suggestion}`;
          }
          o.push({
            file: t,
            path: `permissions.${s}`,
            message: c,
            severity: "warning",
            invalidValue: a
          });
          return false;
        }
        return true;
      });
    }
    return o;
  }
  function BGu(e, t) {
    if (!e || typeof e !== "object") {
      return [];
    }
    let n = e;
    if (!("hooks" in n)) {
      return [];
    }
    if (n.hooks === null || typeof n.hooks !== "object" || Array.isArray(n.hooks)) {
      let s = qnt(n.hooks);
      delete n.hooks;
      return [{
        file: t,
        path: "hooks",
        message: `"hooks" must be an object mapping event names to matcher arrays; received ${s}. This field was ignored.`,
        severity: "warning",
        invalidValue: s,
        docLink: "https://code.claude.com/docs/en/hooks"
      }];
    }
    let r = n.hooks;
    let o = [];
    for (let s of Object.keys(r)) {
      if (!UGu.vZc(s)) {
        delete r[s];
        o.push({
          file: t,
          path: `hooks.${s}`,
          message: `Unknown hook event "${s}" was ignored. Valid events: ${HOOK_EVENTS.join(", ")}`,
          severity: "warning",
          invalidValue: s,
          docLink: "https://code.claude.com/docs/en/hooks"
        });
        continue;
      }
      if (!Array.isArray(r[s])) {
        let i = qnt(r[s]);
        delete r[s];
        o.push({
          file: t,
          path: `hooks.${s}`,
          message: `Hook event "${s}" must be an array of matchers; received ${i}. This entry was ignored.`,
          severity: "warning",
          invalidValue: i,
          docLink: "https://code.claude.com/docs/en/hooks"
        });
      }
    }
    if (o.length > 0 && Object.keys(r).length === 0) {
      delete n.hooks;
    }
    return o;
  }
  function HGu(e, t) {
    if (!e || typeof e !== "object") {
      return [];
    }
    let n = e;
    let r = [];
    for (let {
      key: o,
      schema: s
    } of $Gu) {
      if (!(o in n)) {
        continue;
      }
      if (!Array.isArray(n[o])) {
        let l = n[o];
        delete n[o];
        r.push({
          file: t,
          path: o,
          message: `"${o}" must be an array; received ${qnt(l)}. This field was ignored.`,
          severity: "warning",
          invalidValue: l
        });
        continue;
      }
      let i = n[o];
      let a = [];
      for (let l = 0; l < i.length; l++) {
        let c = s().safeParse(i[l]);
        if (c.success) {
          a.push(i[l]);
        } else {
          r.push({
            file: t,
            path: `${o}[${l}]`,
            message: `Invalid entry was ignored: ${c.error.issues[0]?.message ?? "failed validation"}`,
            severity: "warning",
            invalidValue: i[l]
          });
        }
      }
      if (a.length < i.length) {
        n[o] = a;
      }
    }
    return r;
  }
  function Nye(e, t, n) {
    return [...FGu(e, t), ...BGu(e, t), ...(n?.skipMcpServerEntryFilter ? [] : HGu(e, t))];
  }
  var NGu;
  var UGu;
  var $Gu;
  var WMt = __lazy(() => {
    qte();
    Zn();
    Pyn();
    MOs();
    Rj();
    LOs();
    NGu = we(() => $N().strict());
    UGu = new Set(HOOK_EVENTS);
    $Gu = [{
      key: "allowedMcpServers",
      schema: Oyn
    }, {
      key: "deniedMcpServers",
      schema: Dyn
    }];
  });
  function VMt(e) {
    let t = new Set(e.allowedSources);
    t.add("flagSettings");
    t.add("policySettings");
    return bC.filter(n => t.vZc(n));
  }
  function jGu() {
    return mF.join(SI(), "managed-settings.json");
  }
  function zMt(e) {
    if (Wt() === "wsl" && e.wslInherits?.()) {
      let t = loadManagedFileSettingsFromDir("/mnt/c/Program Files/ClaudeCode");
      if (t.settings) {
        return t;
      }
      let n = loadManagedFileSettingsFromDir(SI());
      return {
        settings: n.settings,
        errors: [...t.errors, ...n.errors]
      };
    }
    return loadManagedFileSettingsFromDir(SI());
  }
  function loadManagedFileSettingsFromDir(e) {
    let t = [];
    let n = {};
    let r = false;
    let {
      settings: o,
      errors: s
    } = parseSettingsFile(mF.join(e, "managed-settings.json"), undefined, true);
    if (t.push(...s), o && Object.keys(o).length > 0) {
      n = fqu(n, o, settingsMergeCustomizer);
      r = true;
    }
    let i = mF.join(e, "managed-settings.d");
    try {
      let c = zt().readdirSync(i).filter(u => (u.isFile() || u.isSymbolicLink()) && u.name.endsWith(".json") && !u.name.startsWith(".")).map(u => u.name).sort();
      for (let u of c) {
        let {
          settings: d,
          errors: p
        } = parseSettingsFile(mF.join(i, u), undefined, true);
        if (t.push(...p), d && Object.keys(d).length > 0) {
          n = fqu(n, d, settingsMergeCustomizer);
          r = true;
        }
      }
    } catch (c) {
      let u = en(c);
      if (u !== "ENOENT" && u !== "ENOTDIR") {
        logForDebugging(`managed-settings.d read failed: ${c}`, {
          level: "error"
        });
      }
    }
    let {
      wslInheritsWindowsSettings: a,
      ...l
    } = n;
    return {
      settings: r && Object.keys(l).length > 0 ? n : null,
      errors: t
    };
  }
  function handleFileSystemError(e, t) {
    if (fn(e)) {
      logForDebugging(`Broken symlink or missing file encountered for settings.json at path: ${t}`);
    } else {
      logForDebugging(`settings file read failed at ${t}: ${e}`, {
        level: "error"
      });
    }
  }
  function parseSettingsFile(e, t, n) {
    let r = Pcs(e);
    if (r) {
      return {
        settings: r.settings ? xN(r.settings) : null,
        errors: r.errors
      };
    }
    let o = parseSettingsFileUncached(e, t, n);
    Ocs(e, o);
    return {
      settings: o.settings ? xN(o.settings) : null,
      errors: o.errors
    };
  }
  function HOs(e) {
    if (!e.mdm) {
      return {
        settings: null,
        errors: []
      };
    }
    let t = e.mdm();
    return {
      settings: Object.keys(t.settings).length > 0 ? t.settings : null,
      errors: t.errors
    };
  }
  function jke(e, t) {
    let n = xN(e);
    let r = Nye(n, t, {
      skipMcpServerEntryFilter: true
    });
    let o = [];
    let s = nLr(i => o.push({
      file: t,
      path: i.path,
      message: i.message,
      severity: "warning"
    })).safeParse(n);
    if (!s.success) {
      return {
        settings: null,
        errors: [...r, ...Wnt(s.error, t)]
      };
    }
    return {
      settings: Object.keys(s.data).length > 0 ? s.data : null,
      errors: [...r, ...o]
    };
  }
  function qke(e) {
    let t = e?.remote ? e.remote() : Pke();
    if (!t || Object.keys(t).length === 0) {
      return {
        settings: null,
        errors: []
      };
    }
    return jke(t, "remote managed settings");
  }
  function Fyn(e) {
    let t = e.parentManaged;
    if (!t || Object.keys(t).length === 0) {
      return {
        settings: null,
        errors: []
      };
    }
    return jke(t, "parent managed settings");
  }
  function jOs(e) {
    let t = e.flagInline;
    if (!t) {
      return {
        settings: null,
        errors: []
      };
    }
    let n = xN(t);
    let r = Nye(n, "SDK inline settings");
    let o = $N().safeParse(n);
    if (!o.success) {
      return {
        settings: null,
        errors: [...r, ...Wnt(o.error, "SDK inline settings")]
      };
    }
    return {
      settings: o.data,
      errors: r
    };
  }
  function parseSettingsFileUncached(e, t, n) {
    try {
      let r;
      if (t !== undefined) {
        r = t;
      } else {
        let {
          resolvedPath: a
        } = qd(zt(), e);
        r = LP(a, 2097152);
      }
      if (r.trim() === "") {
        return {
          settings: {},
          errors: []
        };
      }
      let o = xN(Ba(r, false));
      if (n) {
        let a = Nye(o, e, {
          skipMcpServerEntryFilter: true
        });
        let l = [];
        let c = nLr(u => l.push({
          file: e,
          path: u.path,
          message: u.message,
          severity: "warning"
        })).safeParse(o);
        if (!c.success) {
          return {
            settings: null,
            errors: [...a, ...Wnt(c.error, e)]
          };
        }
        return {
          settings: c.data,
          errors: [...a, ...l]
        };
      }
      let s = Nye(o, e);
      let i = $N().safeParse(o);
      if (!i.success) {
        let a = Wnt(i.error, e);
        return {
          settings: null,
          errors: [...s, ...a]
        };
      }
      return {
        settings: i.data,
        errors: s
      };
    } catch (r) {
      if (handleFileSystemError(r, e), fn(r)) {
        return {
          settings: null,
          errors: []
        };
      }
      return {
        settings: null,
        errors: [{
          file: e,
          path: "",
          message: `Settings file could not be read: ${r instanceof Error ? r.message : String(r)}`,
          severity: "fatal"
        }]
      };
    }
  }
  function Lyn(e, t) {
    switch (e) {
      case "userSettings":
        return mF.resolve(er());
      case "policySettings":
      case "projectSettings":
      case "localSettings":
        return mF.resolve(t.cwd);
      case "flagSettings":
        return t.flagPath ? mF.dirname(mF.resolve(t.flagPath)) : mF.resolve(t.cwd);
    }
  }
  function WGu(e) {
    if (e.coworkPlugins || st(process.env.CLAUDE_CODE_USE_COWORK_PLUGINS)) {
      return "cowork_settings.json";
    }
    return "settings.json";
  }
  function Wke(e, t) {
    switch (e) {
      case "userSettings":
        return mF.join(Lyn(e, t), WGu(t));
      case "projectSettings":
      case "localSettings":
        return mF.join(Lyn(e, t), getRelativeSettingsFilePathForSource(e));
      case "policySettings":
        return jGu();
      case "flagSettings":
        return t.flagPath;
    }
  }
  function getRelativeSettingsFilePathForSource(e) {
    switch (e) {
      case "projectSettings":
        return mF.join(".claude", "settings.json");
      case "localSettings":
        return mF.join(".claude", "settings.local.json");
    }
  }
  function Uyn(e, t) {
    let n = bcs(e);
    if (n !== undefined) {
      return n;
    }
    let r = uLr(e, t);
    Scs(e, r);
    return r;
  }
  function shouldIncludeParentTier(e) {
    return !e || e.parentSettingsBehavior === "merge";
  }
  function keepRestrictiveFromParent(e, t) {
    let n = {};
    if (e.allowManagedHooksOnly === true) {
      n.allowManagedHooksOnly = true;
    }
    if (e.allowManagedMcpServersOnly === true) {
      n.allowManagedMcpServersOnly = true;
    }
    if (e.disableClaudeAiConnectors === true) {
      n.disableClaudeAiConnectors = true;
    }
    if (e.allowManagedPermissionRulesOnly === true) {
      n.allowManagedPermissionRulesOnly = true;
    }
    let r = e.strictPluginOnlyCustomization;
    if (r === true || Array.isArray(r) && r.length > 0) {
      n.strictPluginOnlyCustomization = r;
    }
    if (e.deniedMcpServers) {
      n.deniedMcpServers = e.deniedMcpServers;
    }
    if (t.forceLoginOrgUUID === undefined && e.forceLoginOrgUUID) {
      n.forceLoginOrgUUID = e.forceLoginOrgUUID;
    }
    if (t.allowedMcpServers === undefined && e.allowedMcpServers) {
      n.allowedMcpServers = e.allowedMcpServers;
    }
    if (t.availableModels === undefined && e.availableModels) {
      n.availableModels = e.availableModels;
    }
    if (e.enforceAvailableModels === true) {
      n.enforceAvailableModels = true;
    }
    if (e.permissions) {
      let o = EWu(e.permissions, ["deny", "ask"]);
      if (e.permissions.disableBypassPermissionsMode === "disable") {
        o.disableBypassPermissionsMode = "disable";
      }
      if (t.allowManagedPermissionRulesOnly !== true) {
        let {
          allow: s,
          additionalDirectories: i
        } = e.permissions;
        if (s && t.sandbox?.network?.allowManagedDomainsOnly !== true) {
          o.allow = s;
        }
        if (i) {
          o.additionalDirectories = i;
        }
      }
      if (Object.keys(o).length > 0) {
        n.permissions = o;
      }
    }
    if (e.sandbox) {
      let {
        network: o,
        filesystem: s,
        credentials: i
      } = e.sandbox;
      let a = {};
      if (e.sandbox.enabled === true) {
        a.enabled = true;
      }
      if (e.sandbox.failIfUnavailable === true) {
        a.failIfUnavailable = true;
      }
      if (e.sandbox.allowUnsandboxedCommands === false) {
        a.allowUnsandboxedCommands = false;
      }
      if (e.sandbox.autoAllowBashIfSandboxed === false) {
        a.autoAllowBashIfSandboxed = false;
      }
      if (o) {
        let l = EWu(o, ["deniedDomains"]);
        if (o.allowManagedDomainsOnly === true) {
          l.allowManagedDomainsOnly = true;
        }
        if (t.sandbox?.network?.allowManagedDomainsOnly !== true && o.allowedDomains) {
          l.allowedDomains = o.allowedDomains;
        }
        if (Object.keys(l).length > 0) {
          a.network = l;
        }
      }
      if (s) {
        let l = EWu(s, ["denyRead", "denyWrite"]);
        if (s.allowManagedReadPathsOnly === true) {
          l.allowManagedReadPathsOnly = true;
        }
        if (t.sandbox?.filesystem?.allowManagedReadPathsOnly !== true && s.allowRead) {
          l.allowRead = s.allowRead;
        }
        if (Object.keys(l).length > 0) {
          a.filesystem = l;
        }
      }
      if (i) {
        let l = (i.files ?? []).filter(u => u.mode === "deny");
        let c = (i.envVars ?? []).filter(u => u.mode === "deny");
        if (l.length > 0 || c.length > 0) {
          a.credentials = {
            ...(l.length > 0 && {
              files: l
            }),
            ...(c.length > 0 && {
              envVars: c
            })
          };
        }
      }
      if (Object.keys(a).length > 0) {
        n.sandbox = a;
      }
    }
    return n;
  }
  function qOs(e) {
    let t = Acs();
    if (t !== undefined) {
      return t;
    }
    let n = GGu(e);
    Ics(n);
    return n;
  }
  function isAdminPolicyOrigin(e) {
    return e === "helper" || e === "plist" || e === "hklm" || e === "file";
  }
  function Byn(e) {
    if (e.helper?.()) {
      return "helper";
    }
    if (qke(e).settings) {
      return "remote";
    }
    if (HOs(e).settings) {
      return Wt() === "macos" ? "plist" : "hklm";
    }
    if ((e.file?.() ?? zMt(e)).settings) {
      return "file";
    }
    if (cLr(e).parentSlice) {
      return "parent";
    }
    let t = e.hkcu?.();
    return t && Object.keys(t.settings).length > 0 ? "hkcu" : null;
  }
  function cLr(e) {
    let t = [];
    let {
      settings: n,
      errors: r
    } = qke(e);
    t.push(...r);
    let {
      settings: o,
      errors: s
    } = HOs(e);
    t.push(...s);
    let {
      settings: i,
      errors: a
    } = e.file?.() ?? zMt(e);
    t.push(...a);
    let {
      settings: l,
      errors: c
    } = Fyn(e);
    t.push(...c);
    let u = [n, o, i].filter(h => h !== null);
    let d = u[0] ?? null;
    let p = {
      allowManagedPermissionRulesOnly: u.some(h => h.allowManagedPermissionRulesOnly === true) || undefined,
      forceLoginOrgUUID: u.find(h => h.forceLoginOrgUUID !== undefined)?.forceLoginOrgUUID,
      allowedMcpServers: u.find(h => h.allowedMcpServers !== undefined)?.allowedMcpServers,
      availableModels: u[0]?.availableModels,
      sandbox: {
        network: {
          allowManagedDomainsOnly: u.some(h => h.sandbox?.network?.allowManagedDomainsOnly === true) || undefined
        },
        filesystem: {
          allowManagedReadPathsOnly: u.some(h => h.sandbox?.filesystem?.allowManagedReadPathsOnly === true) || undefined
        }
      }
    };
    let m = l && shouldIncludeParentTier(d) ? keepRestrictiveFromParent(l, p) : null;
    let f = m && Object.keys(m).length > 0 ? m : null;
    return {
      tiers: u,
      admin: d,
      parentSlice: f,
      errors: t
    };
  }
  function GGu(e) {
    let t = e.helper?.();
    if (t) {
      return [t];
    }
    let {
      tiers: n,
      parentSlice: r
    } = cLr(e);
    return r ? [...n, r] : n;
  }
  function WOs(e) {
    let t = e.helper?.();
    if (t) {
      return {
        settings: t,
        errors: e.helperWarnings?.() ?? []
      };
    }
    let {
      tiers: n,
      admin: r,
      parentSlice: o,
      errors: s
    } = cLr(e);
    if (!r && !o) {
      let a = e.hkcu?.();
      if (a && Object.keys(a.settings).length > 0) {
        return {
          settings: a.settings,
          errors: [...s, ...a.errors]
        };
      }
      return {
        settings: null,
        errors: [...s, ...(a?.errors ?? [])]
      };
    }
    let i = fqu({}, o ?? {}, r ?? {}, settingsMergeCustomizer);
    if (n.some(a => a.forceRemoteSettingsRefresh === true)) {
      i.forceRemoteSettingsRefresh = true;
    }
    return {
      settings: i,
      errors: s
    };
  }
  function uLr(e, t) {
    if (e === "policySettings") {
      return WOs(t).settings;
    }
    let n = Wke(e, t);
    let {
      settings: r
    } = n ? parseSettingsFile(n, e === "flagSettings" ? t.flagExpectedContent : undefined) : {
      settings: null
    };
    if (e === "flagSettings") {
      let {
        settings: o
      } = jOs(t);
      if (o) {
        return fqu(r || {}, o, settingsMergeCustomizer);
      }
    }
    return r;
  }
  function VGu(e, t) {
    return Ro([...e, ...t]);
  }
  function settingsMergeCustomizer(e, t, n) {
    if (Array.isArray(e) && Array.isArray(t)) {
      if (n === "fallbackModel") {
        return t;
      }
      return VGu(e, t);
    }
    return;
  }
  function dLr(e) {
    if (sLr) {
      return {
        settings: {},
        errors: []
      };
    }
    let t = Date.now();
    wn("info", "settings_load_started");
    sLr = true;
    try {
      let n = lln();
      let r = {};
      if (n) {
        r = fqu(r, n, settingsMergeCustomizer);
      }
      let o = [];
      let s = new Set();
      let i = new Set();
      let a = null;
      for (let l of VMt(e)) {
        if (l === "policySettings") {
          let {
            settings: u,
            errors: d
          } = WOs(e);
          if (a = u, u) {
            r = fqu(r, u, settingsMergeCustomizer);
          }
          for (let p of d) {
            let m = `${p.file}:${p.path}:${p.message}`;
            if (!s.vZc(m)) {
              s.add(m);
              o.push(p);
            }
          }
          continue;
        }
        let c = Wke(l, e);
        if (c) {
          let u = mF.resolve(c);
          if (!i.vZc(u)) {
            i.add(u);
            let {
              settings: d,
              errors: p
            } = parseSettingsFile(c, l === "flagSettings" ? e.flagExpectedContent : undefined);
            for (let m of p) {
              let f = `${m.file}:${m.path}:${m.message}`;
              if (!s.vZc(f)) {
                s.add(f);
                o.push(m);
              }
            }
            if (d) {
              r = fqu(r, d, settingsMergeCustomizer);
            }
          }
        }
        if (l === "flagSettings") {
          let {
            settings: u,
            errors: d
          } = jOs(e);
          for (let p of d) {
            let m = `${p.file}:${p.path}:${p.message}`;
            if (!s.vZc(m)) {
              s.add(m);
              o.push(p);
            }
          }
          if (u) {
            r = fqu(r, u, settingsMergeCustomizer);
          }
        }
      }
      if (a) {
        if (a.availableModels !== undefined) {
          r.availableModels = [...a.availableModels];
        }
        if (a.enforceAvailableModels !== undefined) {
          r.enforceAvailableModels = a.enforceAvailableModels;
        }
      }
      wn("info", "settings_load_completed", {
        duration_ms: Date.now() - t,
        source_count: i.size,
        error_count: o.length
      });
      return {
        settings: r,
        errors: o
      };
    } finally {
      sLr = false;
    }
  }
  function zGu(e) {
    let t = sI();
    if (t !== null) {
      return t;
    }
    let n = dLr(e);
    aln(n);
    return n;
  }
  function KGu(e) {
    let {
      settings: t
    } = zGu(e);
    return t || {};
  }
  function GOs(e) {
    o_();
    let t = [];
    for (let n of VMt(e)) {
      let r = Uyn(n, e);
      if (r && Object.keys(r).length > 0) {
        t.push({
          source: n,
          settings: r
        });
      }
    }
    return {
      effective: KGu(e),
      sources: t
    };
  }
  function VOs(e, t) {
    let n = VMt(t);
    for (let r = n.length - 1; r >= 0; r--) {
      let o = n[r];
      if (Uyn(o, t)?.[e] !== undefined) {
        return o;
      }
    }
    return null;
  }
  var mF;
  var sLr = false;
  var Gke = __lazy(() => {
    TMt();
    je();
    Zm();
    gn();
    dt();
    KB();
    Gd();
    Cs();
    nf();
    Bte();
    Ike();
    DA();
    Rj();
    WMt();
    mF = require("path");
  });
  var YOs = {};